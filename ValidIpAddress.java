class validIpAddress {
    public boolean isValid(String s) {
        String[] parts = s.split("\\.");
        if (parts.length != 4) return false;

        for (String part : parts) {
            if (part.isEmpty() || part.length() > 3) return false;

            if (part.length() > 1 && part.charAt(0) == '0') return false;

            for (char ch : part.toCharArray()) {
                if (!Character.isDigit(ch)) return false;
            }

            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) return false;
        }

        return true;
    }
}
