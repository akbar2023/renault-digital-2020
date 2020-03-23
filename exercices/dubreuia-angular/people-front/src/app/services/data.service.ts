import { Injectable } from '@angular/core';
import { WeatherService } from './weather.service';
import { PersonService } from './person-service.service';

@Injectable()
export class DataService {

  constructor(private weatherService: WeatherService, private personService: PersonService) { }

}
