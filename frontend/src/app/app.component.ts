import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'first-app';
  cities = [
    {
      'id': 1,
      'name': 'Bugojno'
    },
    {
      'id': 2,
      'name': 'Mostar'
    },
    {
      'id': 3,
      'name': 'Sarajevo'
    },
    {
      'id': 4,
      'name': 'Gornji Vakuf'
    }
  ]

  weatherData = {
    'currentTemp': 20,
    'maxTemp': 15,
    'minTemp': 5,
    'currentWind': 4,
    'currentHumidity': 22,
    'currentType': 'sunny',
    'weatherByHour': [
      {
        'hour': 0,
        'temp': 15,
        'wind': 2,
        'humidity': 33,
        'type': 'sunny'
      },
      {
        'hour': 1,
        'temp': 13,
        'wind': 1,
        'humidity': 23,
        'type': 'raining'
      },
      {
        'hour': 2,
        'temp': 23,
        'wind': 4,
        'humidity': 57,
        'type': 'cloudy'
      },
      {
        'hour': 3,
        'temp': 24,
        'wind': 1,
        'humidity': 15,
        'type': 'clouds'
      },
      
    ]
  }
}
