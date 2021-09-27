package main;

public class arabToRome {public String toRomeNumberTen(int number){
    String romeNumber = Integer.toString(number);
    int des = number / 10;
    String romeDes = new String();
    if (number >= 10) {
        romeDes = switch (des) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XM";
            case 10 -> "C";
            default -> "Нет данных";
        };
    }
    String romeOne = switch (number % 10){
        case 0 -> "";
        case 1 -> "I";
        case 2 -> "II";
        case 3 -> "III";
        case 4 -> "IV";
        case 5 -> "V";
        case 6 -> "VI";
        case 7 -> "VII";
        case 8 -> "VIII";
        case 9 -> "IX";
        default -> "Нет данных";
    };
    romeNumber = romeDes + romeOne;
    if (number == 0){
        romeNumber = "0";
    }
    return romeNumber;
}
}
