package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


    public class LoginPage extends BasePage {
        @FindBy(xpath = "//input[@name='_username']")
        public WebElement usernameBox;

        @FindBy(xpath = "//input[@name='_password']")
        public WebElement passwordBox;


        @FindBy(xpath = "//button[@id='_submit']")
        public WebElement loginBtn;


        public void login(String username, String password){

        }
    }
