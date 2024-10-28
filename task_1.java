 @Test
 public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
   
    assertEquals("При парамтре 19 лет ожидаемый результат true", expected, isAdult);
}