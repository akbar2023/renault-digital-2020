import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class WeatherService {

  private url = "http://localhost:8080/weater/";

  constructor(private http: HttpClient) { }

  public getWeather(city: string): Observable<any> {
    return this.http.get(this.url + city + "/");
  }

}
