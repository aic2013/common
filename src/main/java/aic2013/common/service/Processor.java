/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aic2013.common.service;

/**
 *
 * @author Christian
 */
public interface Processor<T> {
    
    public void process(T object);
}
