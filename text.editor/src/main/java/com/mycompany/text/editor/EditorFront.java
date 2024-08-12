package com.mycompany.text.editor;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author brend
 */
public class EditorFront {

    public void editor(String path, String edition) throws FileNotFoundException {
        try {
            OutputStream os = new FileOutputStream(path);
            Writer wr = new OutputStreamWriter(os);
            BufferedWriter br = new BufferedWriter(wr);

            br.write(edition);
            br.close();
        } catch (Exception e) {
        }
    }
}
