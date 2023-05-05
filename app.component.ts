
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
// import { FormsModule, ReactiveFormsModule  } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  userForm: FormGroup;
  listData: any;
  constructor(private fb: FormBuilder) {
    this.listData = [];
    this.userForm = this.fb.group({
      name: [''],
      address: [''],
      contactNo: [''],
      gender: [''],
    });
  }
  public additem(): void {
    this.listData.push(this.userForm.value);
    console.log(this.userForm.value);
    this.userForm.reset();
    console.log('Item inserted');
    console.log(this.listData);
  }
  reset() {
    this.userForm.reset();
  }
  removeItem(element: any) {
    this.listData.forEach((value: any, index: any) => {
      if (value == element) {
        console.log('Remove Clicked');
        this.listData.splice(index, 1);
      }
    });
  }
  ngOnInit() {}
}
