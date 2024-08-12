/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.text.editor;

/**
 *
 * @author brend
 */
public class TextEditor {

    public static void main(String[] args) {
        String pathHTML = "./../files/html-TextEditor.html";
        String pathCSS = "./../files/css-TextEditor.css";
        String MyText;
        try {
            EditorFront editor = new EditorFront();
            MyText = ("""
                    <!DOCTYPE html>
                    <html lang="pt-BR">
                    <head>
                        <meta charset="UTF-8">
                        <title>Curr\u00edculo de Assistant AI</title>
                        <link rel ="stylesheet" href="css-TextEditor.css">
                    </head>
                    <body>
                        <h1>Assistant AI</h1>
                        <h2>Assistente de Intelig\u00eancia Artificial</h2>
                        <p><strong>Resumo:</strong> IA vers\u00e1til capaz de auxiliar em diversas tarefas.</p>
                        <p><strong>Habilidades:</strong> Processamento de linguagem natural, an\u00e1lise de dados, reda\u00e7\u00e3o, programa\u00e7\u00e3o, resolu\u00e7\u00e3o de problemas, tradu\u00e7\u00e3o.</p>
                        <p><strong>Experi\u00eancia:</strong> Assistente Virtual na Anthropic (2022 - Presente)</p>
                        <p><strong>Educa\u00e7\u00e3o:</strong> Treinada com vasto conjunto de dados em diversas \u00e1reas.</p>
                    </body>
                    </html>""");

            editor.editor(pathHTML, MyText);
            MyText = ("""
                    body {
                        font-family: Arial, sans-serif;
                        max-width: 600px;
                        margin: 20px auto;
                        line-height: 1.6;
                        color: #333;
                    }
                    h1, h2 {
                        color: #2c3e50;
                    }
                    h1 {
                        border-bottom: 2px solid #3498db;
                        padding-bottom: 10px;
                    }
                    p {
                        margin-bottom: 15px;
                    }
                    strong {
                        color: #e74c3c;
                    }""");
            editor.editor(pathCSS, MyText);

        } catch (Exception e) {
        }
    }
}
