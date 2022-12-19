package project.shapes;

import java.util.*;

class ShapeOutlines {
    public String square(int n){
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < n; i++){
            if (i == 0 || i == n - 1){
                output.append("*".repeat(n));
            }else{
                output.append("*" + " ".repeat(n - 2) + "*");
            }
            output.append("\n");
        }
        return String.valueOf(output).trim();
    }


    public String pyramid(int n){
        StringBuilder output = new StringBuilder();
        int y = 0;

        for (int i = n; i >= 1; i--){
            for (int x = 1; x < i; x++){
                output.append(" ");
            }

            y++;
            if (y == 1 || y == n){
                output.append("*".repeat(2*y - 1));
            }else{
                output.append("*" + " ".repeat(2*y - 3) + "*");
            }
            output.append("\n");
        }
        return String.valueOf(output).stripTrailing();

    }


    public String triangle(int n){
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= n; i++){
            if (i == 1 || i == n){
                output.append("*".repeat(i));
            }else{
                output.append("*" + " ".repeat(i - 2) + "*");
            }
            output.append("\n");
        }

        return String.valueOf(output).stripTrailing();
    }
}


public class Shapes {
    public String square(int n){
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                output.append("*");
            }
            
            output.append("\n");
        }
        return String.valueOf(output).trim();
    }


    public String pyramid(int n){
        StringBuilder output = new StringBuilder();
        int y = 0;

        for (int i = n; i >= 1; i--){
            for (int x = 1; x < i; x++){
                output.append(" ");
            }

            y++;
            for (int j = 0; j < 2*y - 1; j++){
                output.append("*");
            }
            output.append("\n");
        }
        return String.valueOf(output).stripTrailing();

    }


    public String triangle(int n){
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                output.append("*");
            }
            output.append("\n");
        }

        return String.valueOf(output).stripTrailing();
    }


    public static void shapeHandler(String shape, int height, String outline){
        Shapes shapes = new Shapes();
        ShapeOutlines shapeOutline = new ShapeOutlines();

        if (shape.equals("square")){
            if (outline.equals("y")){
                System.out.println(shapeOutline.square(height));
            }else{
                System.out.println(shapes.square(height));
            }
            return;
        }

        if (shape.equals("pyramid")){
            if (outline.equals("y")){
                System.out.println(shapeOutline.pyramid(height));
            }else{
                System.out.println(shapes.pyramid(height));
            }
            return;
        }

        if (shape.equals("triangle")){
            if (outline.equals("y")){
                System.out.println(shapeOutline.triangle(height));
            }else{
                System.out.println(shapes.triangle(height));
            }
            return;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height; String shape, outline;
        String[] validShapes = {"square", "triangle", "pyramid"};



        while (true){
            System.out.print("Shape: ");
            shape = scan.nextLine().toLowerCase();

            System.out.print("Height: ");
            height = Integer.parseInt(scan.nextLine());

            if (Arrays.binarySearch(validShapes, shape) < 0 || (height > 80 || height < 0)){
                System.out.println("Please enter the correct inputs!!!");
                System.out.println("valid shapes: ['square', 'pyramid', 'triangle']");
                System.out.println("valid height: 0 <= height <= 80");
            }else{
                break;
            }
        }

        System.out.print("Outline only? (y/N): ");
        outline = scan.nextLine().toLowerCase();

        shapeHandler(shape.toLowerCase(), height, outline.toLowerCase());
        scan.close();
    }
}
