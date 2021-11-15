import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  constructor(private http: HttpClient) { }

  fetchAllQuestions():Observable<any>{
    return this.http.get( 'http://localhost:8080/questions/');
  }
  
  addQuestion(quiz: any){
    return this.http.post('http://localhost:8080/questions/',quiz)
  }

  deleteQuiz(id: number){
    return this.http.delete('http://localhost:8080/questions/' + id)
  }
}
