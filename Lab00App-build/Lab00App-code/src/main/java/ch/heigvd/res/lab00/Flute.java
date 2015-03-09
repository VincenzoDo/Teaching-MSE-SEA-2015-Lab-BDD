/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author vince
 */
public class Flute implements IInstrument{

    @Override
    public String play() {
        return "LOL2";
    }

    @Override
    public int getSoundVolume() {
        return 2;
    }
    @Override
    public String getColor(){
        return "bho";
    }
    
}
