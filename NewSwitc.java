public class NewSwitc {
    public static void main(String[] args) {
        String day = "friday";
        String result = "";

        result=switch(day)
        {
            case "Satursday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            case "wednesday" -> "8am";
            case "Thursday" -> "8am";
            case "friday" -> "8am";
            default -> "5am";

        };
        System.out.println(result);

    }
}
