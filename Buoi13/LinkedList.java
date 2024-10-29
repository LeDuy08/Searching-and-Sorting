public class LinkedList<T> {
    
    private Node<T> head;

    
    public LinkedList() {
        this.head = null;
    }
    // Duyet tung phan tu
    public void traverse() {
        Node<T> tmp = head;
        while (tmp!=null) {
            // IN phan tu
            System.out.println(tmp.getData());
            // Chuyen den phan tu tiep thep
            tmp = tmp.getNext();
        }
    }
    // Them phan tu vao dau danh sach
    public void addFirst(T item) {
        // Buoc 1
        // Node<T> newNode = new Node<>(item, this.heal);
        Node<T> newNode = new Node<>();
        newNode.setData(item);
        newNode.setNext(this.head);

        // Buoc 2
        this.head = newNode;
    }
    // Them node vao cuoi danh sach lien ket

    public void addLast(T item) {
        if(head==null) {
            addFirst(item);
        }else {
            // Buoc 1
            Node<T> newNode = new Node<>(item, null);
            // Buoc 2
            Node<T> tmp = head;
            while (tmp.getNext()!=null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }
    // Them vao phia sau 1 node
    public void insertAfter(T key, T toInsert) {
        // Buoc 1
        Node<T> newNode = new Node<>();
        newNode.setData(toInsert);

        // Buoc 2: di tim vi tri cua key
        Node<T> tmp = head;
        // Tim node chua key
        while (tmp!=null&& !tmp.getData().equals(key)) {
            tmp = tmp.getNext();
            
        }
        // Timra duoc node chua key, haoc la di den cuoi ll
        
        // Them vao khi tmp <> null
        if(tmp!=null) {
            // 2
            newNode.setNext(tmp.getNext());
            // 1+2
            // Node<T> newNode = new Node<>(toInsert, tmp.getNext());
            // 3
            tmp.setNext(newNode);
        } 
    }
    // xoa mot node
    // public boolean remove(T key) 
    // public void remove(T key) {
        if(head == null)
            throw new RuntimeException("Can not delete");
            // return false;
            
        // xoa neu key o vi tri dau tien
        if(head.getData().equals(key)){
            this.head = head.getNext();
            return;
            // return true;
        }

        // tao bien tao
        Node<T> prev = null;
        Node<T> cur = head;

        while (cur!=null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.getNext();
        }

        if(cur==null)
            throw new RuntimeException("Can not delete");
            // return false;
        // xoa node
        prev.setNext(cur.getNext());
        // return true;
    }

    // public boolean isEmpty() {
    //         // if(head==null)
    //         //     return true;
    //         // else
    //         //     return false;

    //     return head=null;
        
    // }
    public int zize() {
        int count = 0;

        Node<T> tmp = head;
        while (tmp!=null) {
            // IN phan tu
            // tang gia tri
            count++;
            // Chuyen den phan tu tiep thep
            tmp = tmp.getNext();
        }
        return count;
    }
    public boolean findItem(T item) {  
        Node<T> tmp = head; // Khởi tạo biến tạm tmp với giá trị là head  
        while (tmp != null) { // Vòng lặp kiểm tra tmp khác null  
            if (tmp.getData().equals(item)) { // Kiểm tra dữ liệu của tmp có bằng item không  
                return true; // Nếu có, trả về true  
            }  
            // Chuyển đến phần tử tiếp theo  
            tmp = tmp.getNext(); // Cập nhật tmp để trỏ đến phần tử tiếp theo  
        }  
        return false; // Nếu không tìm thấy, trả về false  
    }
}
