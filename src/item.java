// Constructor, Getter, Setter
    public class Item {
        private int id;
        private String name;
        private double value;

        public Item(int id, String name, double value) {
            this.id = id;
            this.name = name;
            this.value = value;
        }

        // Getter để lấy giá trị (Cần cho Chức năng 2, 3, 4)
        public double getValue() { return value; }
        public String getName() { return name; }
        public int getId() { return id; }

        @Override
        public String toString() {
            return "ID: " + id + " | Tên: " + name + " | Giá trị: " + value;
        }
    }
}