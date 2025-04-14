class PascalTraingle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                // First and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Sum of the two elements above
                    int val = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j);
                    row.add(val);
                }
            }

            arr.add(row);
        }

        return arr;
    }
}
