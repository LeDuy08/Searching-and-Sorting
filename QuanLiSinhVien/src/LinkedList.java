public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    // Duyet tung phan tu
    public void traverse() {
        Node<T> tmp = head;
        while (tmp != null) {
            // In phan tu
            System.out.print(tmp.getData());
            // Chuyen den phan tu tiep theo
            tmp = tmp.getNext();
            if (tmp != null) {
                System.out.println();
            } else {
                System.out.println();
            }
        }
    }

    // Them node vao dau danh sach
    public void addFirst(T item) {
        // Buoc 1
        // Node<T> newNode = new Node<>(item, this.head);
        Node<T> newNode = new Node<>(item, this.head);

        // Buoc 2
        this.head = newNode;
    }

    // Them node vao cuoi danh sach
    public void addLast(T item) {
        if (head == null) {
            addFirst(item);
        } else {
            // Buoc 1:Tao Node Moi
            Node<T> newNode = new Node<>(item, null);
            Node<T> tmp = head;
            // Duyet Danh sach
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }

    // Them vao phia sau 1 node bat ky
    public void insertAfter(T key, T toInsert) {
        // Buoc 1:Tao mot node moi
        Node<T> newNode = new Node<>();
        newNode.setData(toInsert);
        // B2 di tim vi tri cua key
        Node<T> tmp = head;
        // Tim node chua key
        while (tmp != null && !tmp.getData().equals(key)) {
            tmp.getNext();
        }
        // Tim ra vi tri cua key hioac la di het danh sach
        // Them vao khi tmp <>null
        if (tmp != null) {
            newNode = new Node<>(toInsert, tmp.getNext());
            tmp.setNext(newNode);
            // newNode.setNext(tmp.getNext());
            // tmp.setNext(newNode);
        }
    }

    // Xoa mot node
    public boolean remove(T key) {
        if (head == null) {
            return false;
        }
        // Xoa neu key o vi tri dau tien
        if (head.getData().equals(key)) {
            this.head = head.getNext();
            return true;
        }
        // Tao bien tam
        Node<T> prev = null;
        Node<T> cur = head;
        while (cur != null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.getNext();
        }
        if (cur == null)
            return false;

        // Xoa node
        prev.setNext(cur.getNext());
        return true;

    }

    // Kiem tra danh sach rong hay khong
    public boolean isEmpty() {
        // if(head==null){
        // return true;
        // }else{
        // return false;
        // }
        return head == null;
    }

    public int size() {
        int count = 0;
        Node<T> tmp = head;
        while (tmp != null) {
            count++;
            tmp.getNext();
        }
        return count;
    }

    public boolean findItem(T item) {

        Node<T> tmp = head;
        while (tmp != null) {
            if (tmp.getData().equals(item)) {
                return true;
            }
            tmp = tmp.getNext();
        }
        return false;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
}