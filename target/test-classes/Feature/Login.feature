Feature: Verifying Adactin Login Hotel details

  Scenario Outline: Verifying Adactin login with valid credentials
    Given User is on the Adactin page
    When User should perform login "<Username>" and "<password>"
    When User should verify after  login "Hello SuganyaAbhijith!"
    When User is on the search hotel pageand search using these fields "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>"and "<Children per Room>"
    And User should select hotel
    And user book hotel with these fields"<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Expiry month>" ,"<Expiry year>" and "<CVV Number>"
    Then User should to get the order no

    Examples: 
      | Username        | password | Location |Hotels         |Room Type |Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |<First Name | Last Name | Billing Address | Credit Card No  | Credit Card Type | Expiry month | Expiry year | CVV Number |
      | SuganyaAbhijith | 12345678 | Melbourne|Hotel SunShine | Double   | 2 - Two        |   03/07/2022  |  04/07/2022    |  1 - One        |   1- One          | Suganya    |  Bala     | London          |1321243253465475 |  VISA            | December     |2024         | 357        |          
      | SuganyaAbhijith | 12345678 | Melbourne|Hotel SunShine | Double   | 1 - Two        |   03/07/2022  |  04/07/2022    |  1 - One        |   3- One          | Suganya    |  Bala     | London          |1321243253465475 |  VISA            | December     |2024         | 357        |
      | SuganyaAbhijith | 12345678 | Melbourne|Hotel SunShine | Double   | 2 - Two        |   03/07/2022  |  04/07/2022    |  1 - One        |   1- One          | Suganya    |  Bala     | London          |1321243253465475 |  VISA            | December     |2024         | 357        |
      | SuganyaAbhijith | 12345678 | Melbourne|Hotel SunShine | Double   | 2 - Two        |   03/07/2022  |  05/07/2022    |  2 - One        |   1- One          | Suganya    |  Bala     | London          |1321243253465475 |  VISA            | December     |2024         | 357        |
      | SuganyaAbhijith | 12345678 | Melbourne|Hotel SunShine | Double   | 2 - Two        |   03/07/2022  |  04/07/2022    |  1 - One        |   1- One          | Suganya    |  Bala     | London          |1321243253465475 |  VISA            | December     |2024         | 357        |
      | SuganyaAbhijith | 12345678 | Melbourne|Hotel SunShine | Double   | 1 - Two        |   03/07/2022  |  04/07/2022    |  1 - One        |   1- One          | Suganya    |  Bala     | London          |1321243253465475 |  VISA            | December     |2024         | 357        |
      | SuganyaAbhijith | 12345678 | Melbourne|Hotel SunShine | Double   | 2 - Two        |   03/07/2022  |  04/07/2022    |  2 - One        |   1- One          | Suganya    |  Bala     | London          |1321243253465475 |  VISA            | December     |2024         | 357        |
      | SuganyaAbhijith | 12345678 | Melbourne|Hotel SunShine | Double   | 2 - Two        |   03/07/2022  |  04/07/2022    |  1 - One        |   3- One          | Suganya    |  Bala     | London          |1321243253465475 |  VISA            | December     |2024         | 357        |
      | SuganyaAbhijith | 12345678 | Melbourne|Hotel SunShine | Double   | 3 - Two        |   03/07/2022  |  07/07/2022    |  1 - One        |   1- One          | Suganya    |  Bala     | London          |1321243253465475 |  VISA            | December     |2024         | 357        |
      | SuganyaAbhijith | 12345678 | Melbourne|Hotel SunShine | Double   | 2 - Two        |   03/07/2022  |  04/07/2022    |  1 - One        |   1- One          | Suganya    |  Bala     | London          |1321243253465475 |  VISA            | December     |2024         | 357        |
      
