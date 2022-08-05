

## About The Project
This project was written to test www.kitapyurdu.com. The project is written in Java programming language and is a Maven project. OOP principles are adopted. 

## Test Steps
- www.kitapyurt.com opens.
- Check that the home page is opened.
- Type 'novel' in the search box and press Enter.
- A random book is chosen from among the listed books.
- Click the Add to Cart button.
- Check that the product has been added to the cart.
- Click the cart button.
- Click the go to cart button.
- The quantity of product is increased by '1'.
- It is checked that the message "Updating your cart" is displayed.
- Cross button is pressed.
- Check that the cart is empty.

## Dependencies
- Selenium Java
- JUnit Jupiter Engine
- Apache Log4j
- WebDriverManager

## Browser
The project can be run in chrome, firefox, edge and safari browsers. To select a browser, you must write FIREFOX, EDGE, SAFARI or CHROME to the browser variable in the BaseTest class.

```

DriverTypes browser = CHROME;
```
