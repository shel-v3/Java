@Test
void testId() {
    Order order = new Order(1, 1, new HashMap<>());
    assertEquals(1, order.getId());
}

@Test
void testUserId() {
    Order order = new Order(1, 1, new HashMap<>());
    assertEquals(1, order.getUserId());
}

@Test
void testOrderDetails() {
    Order order = new Order(1, 1, new HashMap