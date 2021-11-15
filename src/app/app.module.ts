import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HttpClientModule } from  '@angular/common/http';
import { QuizesComponent } from './quizes/quizes.component';
import {MatCardModule} from '@angular/material/card';
import {MatListModule} from '@angular/material/list';
import {MatIconModule} from '@angular/material/icon';
import { AddQuestionComponent } from './add-question/add-question.component';
import { DeleteQuestionComponent } from './delete-question/delete-question.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { QuestionsComponent } from './questions/questions.component';
import { FormsModule } from '@angular/forms';
import { ClickColorDirective } from './questions/click-color.directive';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    QuizesComponent,
    AddQuestionComponent,
    DeleteQuestionComponent,
    SidebarComponent,
    QuestionsComponent,
    ClickColorDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    MatCardModule,
    MatListModule,
    MatIconModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
