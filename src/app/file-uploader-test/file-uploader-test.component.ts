import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-file-uploader-test',
  templateUrl: './file-uploader-test.component.html',
  styleUrls: ['./file-uploader-test.component.scss']
})
export class FileUploaderTestComponent implements OnInit {


  constructor() { }

  ngOnInit() {
  }


  selectedFile: File;

  onFileChanged(event) {
    this.selectedFile = event.target.files[0];
  }

  onUpload() {
    // upload code goes here
  }



}//class
