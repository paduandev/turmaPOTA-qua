public class App {
    public static void main(String[] args) {
        final int TAM_HEAP = 20;
        Heap heap = new Heap(TAM_HEAP);

        for (int i = 0; i < TAM_HEAP; i++) {
            int n = (int) (Math.random() * TAM_HEAP + 1);
            heap.insert(new Node(n));
        }

        System.out.println(heap.showHeap());

        heap.heapSort();

        System.out.println(heap.showHeap());
    }
}
