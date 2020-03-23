import { Component, OnInit } from '@angular/core';
import { WeatherService } from '../services/weather.service';

@Component({
  selector: 'app-weather',
  templateUrl: './weather.component.html',
  styleUrls: ['./weather.component.css']
})
export class WeatherComponent implements OnInit {

  weather: String;

  constructor(private service: WeatherService) { }

  ngOnInit() {
  }

  displayWeather(city: string) {
    this.service.getWeather(city).subscribe(value =>this.weather = value['weather_state_name']);
  }

}
