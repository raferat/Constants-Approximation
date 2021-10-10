/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.martin.constantsapproximation;


import cz.martin.constantsapproximation.pi.*;

import cz.martin.constantsapproximation.pi.montecarlo.*;

import cz.martin.constantsapproximation.e.*;

import cz.martin.constantsapproximation.goldenratio.*;

public class Main
{

  public static void main(String[] args)
  {
    System.out.println ( "PI: " );
    new GregoryLeibniz().print();
    new JohnWallis().print();
    new Viete().print();
    new Archimedes().print();
    new Darts().print();
    new BuffonNeadle().print();
    
    ConstantApproximation.E.print();
    
    System.out.printf ( "\nE:\n");
    
    new Limit().print();
    new cz.martin.constantsapproximation.e.InfiniteLine().print();
    
    ConstantApproximation.E.print();
    
    System.out.println ( "\nE:\n");
    
    new Sqrts().print();
    new InfiniteFraction().print();
    new cz.martin.constantsapproximation.goldenratio.InfiniteLine().print();
    
    ConstantApproximation.GOLDEN_RATIO.print();
  }
  
}
