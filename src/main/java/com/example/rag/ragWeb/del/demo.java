/*
 * package com.example.rag.ragWeb.del;
 * 
 * import static org.junit.Assert.assertNotNull; import static
 * org.junit.Assert.assertTrue;
 * 
 * import java.util.ArrayList; import java.util.Arrays; import
 * java.util.Collection; import java.util.List; import
 * java.util.stream.Collectors;
 * 
 * import org.junit.jupiter.api.Test;
 * 
 * public class demo {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * List<List<String>> nestedList = Arrays.asList( Arrays.asList("one:one"),
 * Arrays.asList("two:one", "two:two", "two:three"), Arrays.asList("three:one",
 * "three:two", "three:three", "three:four"));
 * 
 * }
 * 
 * public <T> List<T> flattenListOfListsStream(List<List<T>> nestedList) {
 * return nestedList.stream() .flatMap(Collection::stream)
 * .collect(Collectors.toList()); }
 * 
 * public <T> List<T> flattenListOfListsStreamNew(List<List<T>> nestedList) {
 * return nestedList.stream() .flatMap(list -> list.stream())
 * .collect(Collectors.toList()); }
 * 
 * public <T> List<T> flattenListOfListsImperatively( List<List<T>> nestedList)
 * { List<T> ls = new ArrayList<>(); nestedList.forEach(ls::addAll); return ls;
 * }
 * 
 * @Test public void givenNestedList_thenFlattenFunctionally() {
 * 
 * List<List<String>> nestedList = Arrays.asList( Arrays.asList("one:one"),
 * Arrays.asList("two:one", "two:two", "two:three"), Arrays.asList("three:one",
 * "three:two", "three:three", "three:four"));
 * 
 * List<String> ls = flattenListOfListsStreamNew(nestedList);
 * 
 * assertNotNull(ls); assertTrue(ls.size() == 8); }
 * 
 * }
 */