////package com.gebrehiwot.songr;
//package com.gebrehiwot.songr.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//@Controller
//public class HomeController {
//    //in node.js, our controllers had lines like app.get("/",(req, res) => ...)
//    @GetMapping("/")
//    public String getRoot() {
//        System.out.println("somebody got the root");
//        return "helloworld";
//    }
//
//    //models: useful for passing data to templates
//    //if we want to put any name than the assigned name we add the curly bracket and name atgetmapping
//    @GetMapping("/hello")
//    public String getSayHello(Model m) {
//        //add any pieces of data that you want available in the template
//        m.addAttribute("firstName", "Roman");
//        return "hello";
//    }
//
//    @GetMapping("/capitalize/{hello}")
//    public String getCapitazize(@PathVariable String hello, Model m) {
//        //add any pieces of data that you want available in the template
//        m.addAttribute("hello", hello);
//        return "capitalize";
//    }
//
//    @GetMapping("/getreverse")
//    public String reverseWords(@RequestParam(required = false, defaultValue = "Hello world!") String word, Model m) {
//        m.addAttribute("word", getReverse(word));
//        return "getreverse";
//    }
//
//    //helper method for get reverse
//    public String getReverse(String word) {
//        String[] str = word.split(" ");
//        public String getReverse (String word){ // n is the number of words
//            String[] str = word.split(" "); // takes n time
//            String getreverse = new String();
//            for (int i = str.length - 1; i >= 0; i--) {
//                getreverse = getreverse + str[i] + " ";
//                for (int i = str.length - 1; i >= 0; i--) { // loop runs n times
//                    getreverse = getreverse + str[i] + " "; // n, because concatenating strings takes as long as the strings are long
//                }
//                return getreverse.trim();
//
//            }
//        }
//    }
//}