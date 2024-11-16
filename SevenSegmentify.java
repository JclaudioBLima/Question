package javateste;

public class SevenSegmentify {
  public static void main(String[] args) throws Exception {
    NumberSegmentify numberSegmentify = new NumberSegmentify();

    System.out.println(numberSegmentify.stringfyHour("11:32"));
  }
}

class NumberSegmentify {
  private String[] one = { "  ", " |", " |" };
  private String[] two = { "_ ", "_|", "|_" };
  private String[] three = { "_ ", "_|", "_|" };

  public String getLine(int number, int line) throws Exception {
    String lineStr;
    line = line - 1;
    switch (number) {
      case 1:
        lineStr = one[line];
        break;
      case 2:
        lineStr = two[line];
        break;
      case 3:
        lineStr = three[line];
        break;
      default:
        throw new Exception("Unexpected number");
    }

    return lineStr;
  }

  public String getLine(String number, int line) throws Exception {
    var numberInt = Integer.parseInt(number);
    return getLine(numberInt, line);
  }

  public String stringfyHour(String time) throws Exception {
    var numbers = time.split("");
    String[] hours = { numbers[0], numbers[1] };
    String[] minutes = { numbers[3], numbers[4] };

    StringBuilder line1 = new StringBuilder();
    StringBuilder line2 = new StringBuilder();
    StringBuilder line3 = new StringBuilder();

    line1.append(this.getLine(hours[0], 1));
    line1.append(this.getLine(hours[1], 1));
    line1.append(" ");
    line1.append(this.getLine(minutes[0], 1));
    line1.append(this.getLine(minutes[1], 1));

    line2.append(this.getLine(hours[0], 2));
    line2.append(this.getLine(hours[1], 2));
    line2.append(".");
    line2.append(this.getLine(minutes[0], 2));
    line2.append(this.getLine(minutes[1], 2));

    line3.append(this.getLine(hours[0], 3));
    line3.append(this.getLine(hours[1], 3));
    line3.append(".");
    line3.append(this.getLine(minutes[0], 3));
    line3.append(this.getLine(minutes[1], 3));

    return line1.toString() + "\n"
        + line2.toString() + "\n"
        + line3.toString() + "\n";

  }
}