package com.company;

import Entities.Cartela;

public class Main {

    public static void main(String[] args) {
        try{
            Cartela cartela = new Cartela();
            cartela.PreencherCartela();

            System.out.println(cartela.toString());
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
