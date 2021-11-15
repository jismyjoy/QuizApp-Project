import { Component, OnInit } from '@angular/core';
import { DomSanitizer, SafeStyle } from "@angular/platform-browser";
import { Question } from '../Question';
import { QuestionService } from '../question.service';

@Component({
  selector: 'app-questions',
  templateUrl: './questions.component.html',
  styleUrls: ['./questions.component.css']
})

export class QuestionsComponent implements OnInit {

  correctAnswer:number=0;
  size:number=0;
  btnDisabled: boolean=false;
  show:boolean=true;
  see:boolean=false;
  questions !: any[];
  
  constructor(private questionService: QuestionService,private doms: DomSanitizer) { }

  ngOnInit(): void {

    this.questionService.fetchAllQuestions()
    .subscribe((res:any)=>{
      console.log(res);
      this.questions = res;
    });
  }

  toggleClass(choiceIndex ? :any,item ? :any){

    this.size=this.questions.length;
    if(choiceIndex===this.questions[item].correctChoice){
      this.correctAnswer=this.correctAnswer+1;
      let options = document.querySelectorAll("div.option")
      options[choiceIndex].classList.add("correct");
    }
    else{
      let options = document.querySelectorAll("div.option")
      options[choiceIndex].classList.add("wrong");
    }
  }

  Show(){
    this.see=true;
  }
}
