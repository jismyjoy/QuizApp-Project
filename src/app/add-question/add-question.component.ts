import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { QuestionService } from '../question.service';

@Component({
  selector: 'app-add-question',
  templateUrl: './add-question.component.html',
  styleUrls: ['./add-question.component.css']
})
export class AddQuestionComponent implements OnInit {

  constructor(private questionService: QuestionService,private router: Router) { }

  addQuestion(text: string,choice1:string,choice2: string,choice3:string,choice4: string, correctChoice: string){
    this.questionService.addQuestion({text,choice1,choice2,choice3,choice4,correctChoice})
    .subscribe((res: any) => {
     });
     this.reloadWindow()
  }
  reloadWindow() {
    let currentUrl = this.router.url;
    this.router.navigateByUrl('/', {skipLocationChange: true}).then(() => {
        this.router.navigate([currentUrl]);
    });
   }
  ngOnInit(): void {
  }

}
