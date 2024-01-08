@Test
void testId() {
    Product product = new Product(1, "iPhone 13 Pro Max", 1000, 100);
    assertEquals(1, product.getId());
}

@Test
void testName() {
    Product product = new Product(1, "iPhone 13 Pro Max", 1000, 100);
    assertEquals("iPhone 13 Pro Max", product.getName());
}

@Test
void testPrice() {
    Product product = new Product(1, "iPhone 13 Pro Max", 1000, 100);
    assertEquals(1000, product.getPrice());
}

@Test
void testStock() {
    Product product = new Product(1, "iPhone 13 Pro Max", 1000, 100);
    assertEquals(100, product.getStock());
}

@Test
void testNegativeId() {
    assertThrows(IllegalArgumentException.class, () -> new Product(-1, "iPhone 13 Pro Max", 1000, 100));
}

@Test
void testEmptyName() {
    assertThrows(IllegalArgumentException.class, () -> new Product(1, "", 1000, 100));
}

@Test
void testNegativePrice() {
    assertThrows(IllegalArgumentException.class, () -> new Product(1, "iPhone 13 Pro Max", -1000, 100));
}

@Test
void testZeroStock() {
    assertThrows(IllegalArgumentException.class, () -> new Product(1, "iPhone 13 Pro Max", 1000, 0));
}