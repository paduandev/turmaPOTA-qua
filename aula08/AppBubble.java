public class AppBubble {
    public static void main(String[] args) {
        Bubble bubble = new Bubble(10);

        System.out.println(bubble.show());
        bubble.bubbleSort();
        System.out.println(bubble.show());
    }
}
