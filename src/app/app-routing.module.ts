import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddQuestionComponent } from './add-question/add-question.component';
import { DeleteQuestionComponent } from './delete-question/delete-question.component';
import { LoginComponent } from './login/login.component';
import { QuestionsComponent } from './questions/questions.component';
import { QuizesComponent } from './quizes/quizes.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
  {path:'',redirectTo:'login',pathMatch:'full'},
  {path:'login',component:LoginComponent},
  {path:'signup',component:SignupComponent},
  {path:'quiz',component:QuizesComponent,
children:[
  {path:'questions',component:QuestionsComponent},
  {path:'add-question', component:AddQuestionComponent},
  {path:'delete-question',component:DeleteQuestionComponent}
]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
