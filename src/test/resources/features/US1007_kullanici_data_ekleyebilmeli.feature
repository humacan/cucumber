Feature: US1007a Kullanici DataBase sayfasina girer ve kayitlari yapar
  @wip
  Scenario: TC11 Kullanici kayit islemlerini yapar

    When kullanici  "DataBase" adresine gider
    Then new butonuna basar
    And tum bilgileri girer
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrula