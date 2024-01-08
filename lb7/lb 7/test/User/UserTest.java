@Test
void testId() {
    User user = new User(1, "John Doe");
    assertEquals(1, user.getId());
}

@Test
void testUsername() {
    User user = new User(1, "John Doe");
    assertEquals("John Doe", user.getUsername());
}

@Test
void testCart() {
    User user = new User(1, "John Doe");
    assertEquals(new HashMap<>(), user.getCart());
}

@Test
void testNegativeId() {
    assertThrows(IllegalArgumentException.class, () -> new User(-1, "John Doe"));
}

@Test
void testEmptyUsername() {
    assertThrows(IllegalArgumentException.class, () -> new User(1, ""));
}