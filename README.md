Задача 1
Есть список поездов, представленный с виде XML. Вывести на экран информацию о тех поездах, которые отправляются сегодня с 15:00 до 19:00.
<?xml version="1.0" encoding="UTF-8"?> 
  <trains>
    <train id=“1”>
      <from>Kyiv</from> 
      <to>Donetsk</to>
      <date>19.12.2013</date>
      <departure>15:05</departure>
    </train>
    <train id=“2”>
      <from>Lviv</from> 
      <to>Donetsk</to>
      <date>19.12.2013</date>
      <departure>19:05</departure>
    </train>
  </trains>
Написать код для добавления новых поездов в существующий XML.

Задача 2
Распарсить следующую структуру данных:
{
“name”: “…”,
“surname”: “…”,
“phones”: [“044-256-78-90”, “066-123-45-67”, …],
“sites”: [“http://site1.com”, “http://site2.com”, …],
“address”: {
“country”: “…”,
“city”: “…”,
“street”: “…”
}
}

Задача 3
Написать парсер для Yahoo Finance в 
режиме XML (format=xml).
