package main;

public class romanCalculator {public String[] romeTranslat (String[] value){
    String oneFigure;
    String twoFigure;
    String oneRomeFigure = value[0];
    String twoRomeFigure = value[1];
    String[] romeValue = new String[2];
    if (oneRomeFigure.equals("I")){
        oneFigure = "1";
        romeValue[0] = oneFigure;
    }
    if (twoRomeFigure.equals("I")){
        twoFigure = "1";
        romeValue[1] = twoFigure;
    }
    if (oneRomeFigure.equals("II")){
        oneFigure = "2";
        romeValue[0] = oneFigure;
    }
    if (twoRomeFigure.equals("II")){
        twoFigure = "2";
        romeValue[1] = twoFigure;
    }
    if (oneRomeFigure.equals("III")){
        oneFigure = "3";
        romeValue[0] = oneFigure;
    }
    if (twoRomeFigure.equals("III")){
        twoFigure = "3";
        romeValue[1] = twoFigure;
    }
    if (oneRomeFigure.equals("IV")){
        oneFigure = "4";
        romeValue[0] = oneFigure;
    }
    if (twoRomeFigure.equals("IV")){
        twoFigure = "4";
        romeValue[1] = twoFigure;
    }
    if (oneRomeFigure.equals("V")){
        oneFigure = "5";
        romeValue[0] = oneFigure;
    }
    if (twoRomeFigure.equals("V")){
        twoFigure = "5";
        romeValue[1] = twoFigure;
    }
    if (oneRomeFigure.equals("VI")){
        oneFigure = "6";
        romeValue[0] = oneFigure;
    }
    if (twoRomeFigure.equals("VI")){
        twoFigure = "6";
        romeValue[1] = twoFigure;
    }
    if (oneRomeFigure.equals("VII")){
        oneFigure = "7";
        romeValue[0] = oneFigure;
    }
    if (twoRomeFigure.equals("VII")){
        twoFigure = "7";
        romeValue[1] = twoFigure;
    }
    if (oneRomeFigure.equals("VIII")){
        oneFigure = "8";
        romeValue[0] = oneFigure;
    }
    if (twoRomeFigure.equals("VIII")){
        twoFigure = "8";
        romeValue[1] = twoFigure;
    }
    if (oneRomeFigure.equals("IX")){
        oneFigure = "9";
        romeValue[0] = oneFigure;
    }
    if (twoRomeFigure.equals("IX")){
        twoFigure = "9";
        romeValue[1] = twoFigure;
    }
    if (oneRomeFigure.equals("X")){
        oneFigure = "10";
        romeValue[0] = oneFigure;
    }
    if (twoRomeFigure.equals("X")){
        twoFigure = "10";
        romeValue[1] = twoFigure;
    }
    return romeValue;
}
}
