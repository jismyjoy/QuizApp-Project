import { ComponentFixture, TestBed } from '@angular/core/testing';
import { QuestionService } from '../question.service';
import { RouterTestingModule } from '@angular/router/testing';
import { DeleteQuestionComponent } from './delete-question.component';

describe('DeleteQuestionComponent', () => {
  let component: DeleteQuestionComponent;
  let fixture: ComponentFixture<DeleteQuestionComponent>;
  let service: QuestionService;
  let httpClientSpy:{get: jasmine.Spy, delete:jasmine.Spy};

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RouterTestingModule],
      declarations: [ DeleteQuestionComponent ],
      providers:[QuestionService,
      {provide: QuestionService, useValue: service}]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteQuestionComponent);
    component = fixture.componentInstance;
    //fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  // it('delete a question',()=> {
  //   let id:number = 1;
  //   component.deleteQuiz(id);
  //   expect(httpClientSpy.delete.calls.count()).toBe(1);
  //   expect(component.deleteQuiz.length).toBe(0);
  // })

});
