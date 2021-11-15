import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';
import { Question } from '../Question';
import { QuestionService } from '../question.service';

import { QuestionsComponent } from './questions.component';

describe('QuestionsComponent', () => {
  let component: QuestionsComponent;
  let fixture: ComponentFixture<QuestionsComponent>;
  let service:QuestionService;
  let httpClientSpy: {get: jasmine.Spy, patch: jasmine.Spy, delete:jasmine.Spy};

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ QuestionsComponent ],
      providers:[
        QuestionsComponent,
        {provide: QuestionService, useValue: service}
      ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(QuestionsComponent);
    component = fixture.componentInstance;
    //fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('fetch all questions',()=>{
    const question: Question[]=[{
      "id":1,
      "text":"Who is known as Father of Indian Constitution",
      "choice1":"Dr. B. R. Ambedkar",
      "choice2":"Narendra Modi",
      "choice3":"Dr. Rajendra Prasad",
      "choice4":"Rajagopalachari",
      "correctChoice":0
    }]
    httpClientSpy.get.and.returnValue(of(question));
    component.ngOnInit();
    expect(httpClientSpy.get.calls.count()).toBe(1);
  })


});
