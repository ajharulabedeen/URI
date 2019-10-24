import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';


@Component({
  selector: 'app-file-uploader-test',
  templateUrl: './file-uploader-test.component.html',
  styleUrls: ['./file-uploader-test.component.scss']
})
export class FileUploaderTestComponent implements OnInit {


  constructor(private http : HttpClient) { }

  ngOnInit() {
  }


  selectedFile: File;

  onFileChanged(event) {
    console.log(event);
    this.selectedFile = event.target.files[0];
  }

  onUpload() {
    // upload code goes here
    // this.http is the injected HttpClient
  const uploadData = new FormData();
  uploadData.append('photo', this.selectedFile, this.selectedFile.name);
  this.http.post('http://127.0.0.1:8000/api/t', uploadData)
    .subscribe(event => {
      console.log(event); // handle event here
    });
  }



}//class
