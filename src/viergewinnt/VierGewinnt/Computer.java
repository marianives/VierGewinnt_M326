/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viergewinnt.VierGewinnt;

import java.util.Random;

/**
 *
 * @author M-N Kanti
 */
public class Computer implements SpielerInterface {

    private String zeichen;

    Random rnd = new Random();

    public Computer(String zeichen) {
        this.zeichen = zeichen;
    }

    @Override
    public String getZeichen() {
        return this.zeichen;
    }

    @Override
    public int legeChip() {
        return rnd.nextInt(6);
    }

}
