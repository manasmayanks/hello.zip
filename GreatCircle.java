public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double radians1 = Math.toRadians(x1);
        double radians2 = Math.toRadians(x2);
        double deltaY = Math.toRadians(y2 - y1);

        double distance = 6371.0 * Math.acos(
            Math.sin(radians1) * Math.sin(radians2) +
            Math.cos(radians1) * Math.cos(radians2) * Math.cos(deltaY)
        );

        System.out.println(distance + " kilometers");
    }
}
