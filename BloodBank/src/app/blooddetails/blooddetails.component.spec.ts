import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BlooddetailsComponent } from './blooddetails.component';

describe('BlooddetailsComponent', () => {
  let component: BlooddetailsComponent;
  let fixture: ComponentFixture<BlooddetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BlooddetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BlooddetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
