public class Heap {
    private Node[] heapVector;
    private int tamHeap;

    public Heap(int tamMax) {
        heapVector = new Node[tamMax];
        tamHeap = 0;
    }

    // insere um novo Nó dentro do vetor (heap)
    public void insert(Node newNode) {
        if(tamHeap >= heapVector.length) 
            return;

        heapVector[tamHeap] = newNode;
        tamHeap++;
    }

    // verifica se o índice está dentro do limite do vetor
    private boolean exists(int index) {
        return index < tamHeap;
    }

    // verifica se o indice (Node) é uma folha da árvore
    private boolean isLeaf(int index) {
        return index >= tamHeap / 2;
    }

    // substitui um Nó em uma posição do vetor
    private void replaceIn(int index, Node node) {
        heapVector[index] = node;
    }

    // retorna o índice do maior filho, dado o índice do pai
    // considera que o index não é folha
    private int getMaxChild(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if(exists(rightChild) && (heapVector[rightChild].getDado() > heapVector[leftChild].getDado())) {
            return rightChild;
        }
        return leftChild;
    }

    public String showHeap() {
        String out = "";

        for (Node node : heapVector) {
            out += node.getDado() + ", ";
        }

        return out;
    }

    private void makeHeapMax() {
        for (int i = (tamHeap-1) / 2; i  >= 0 ; i--) {
            adjustHeap(i);
        }
    }

    private void adjustHeap(int index) {
        int maxChildIndex;
        Node root = heapVector[index];

        while(!isLeaf(index)) {
            maxChildIndex = getMaxChild(index);

            // o valor do pai é >= valor filho ?
            if(root.getDado() >= heapVector[maxChildIndex].getDado())
                break;

            // "sobe" o filho
            heapVector[index] = heapVector[maxChildIndex];
            index = maxChildIndex;
        }

        heapVector[index] = root;
    }

    public void heapSort() {
        makeHeapMax();

        for(int i = tamHeap -1; i >= 0; i--) {
            Node biggestNode = removeMaxNode();
            replaceIn(i, biggestNode);
        }
    }

    private Node removeMaxNode() {
        if(tamHeap <= 0)
            return null;
        
        Node root = heapVector[0];
        heapVector[0] = heapVector[tamHeap -1];
        tamHeap--;
        adjustHeap(0);

        return root;
    }

}
