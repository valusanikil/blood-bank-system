import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatebloodComponent } from './updateblood.component';

describe('UpdatebloodComponent', () => {
  let component: UpdatebloodComponent;
  let fixture: ComponentFixture<UpdatebloodComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdatebloodComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatebloodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
