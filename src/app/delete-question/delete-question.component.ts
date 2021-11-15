import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Question } from '../Question';
import { QuestionService } from '../question.service';

@Component({
  selector: 'app-delete-question',
  templateUrl: './delete-question.component.html',
  styleUrls: ['./delete-question.component.css']
})
export class DeleteQuestionComponent implements OnInit {

  question:any=[];
  questionCount=0;
  quizzes !: any[];
  questions: Array<Question>=[]

  deleteQuiz(id: number){
    this.questionService.deleteQuiz(id)
      .subscribe((res: any) => {
        console.log(res);
      });
    this.reloadWindow()
  }
  
  reloadWindow() {
    let currentUrl = this.router.url;
    this.router.navigateByUrl('/', {skipLocationChange: true}).then(() => {
        this.router.navigate([currentUrl]);
    });
   }

  constructor(private questionService: QuestionService,private router: Router) { }

  ngOnInit(): void {
    this.questionService.fetchAllQuestions()
    .subscribe((res: any) => {
        console.log(res);
        this.quizzes = res;
      })
  }

}
