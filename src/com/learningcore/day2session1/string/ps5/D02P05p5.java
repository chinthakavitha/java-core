package com.learningcore.day2session1.string.ps5;
import java.util.*;
public class D02P05p5 {
	    public static void main(String[] args) {
	        String[] words = {"abc", "efg", "cde", "ghi", "ija"};
	        if (canFormCircle(words)) {
	            System.out.println("Yes");
	            printCircle(words);
	        } else {
	            System.out.println("No");
	        }
	    }
	    public static boolean canFormCircle(String[] words) {
	        if (words == null || words.length == 0) {
	            return false;
	        }
	        // Build graph where each character represents a vertex
	        Map<Character, List<Character>> graph = new HashMap<>();
	        Map<Character, Integer> indegree = new HashMap<>();
	        for (String word : words) {
	            char start = word.charAt(0);
	            char end = word.charAt(word.length() - 1);
	            graph.putIfAbsent(start, new ArrayList<>());
	            graph.putIfAbsent(end, new ArrayList<>());
	            graph.get(start).add(end);
	            indegree.put(start, indegree.getOrDefault(start, 0) + 1);
	            indegree.put(end, indegree.getOrDefault(end, 0));
	        }

	        // DFS to check if a cycle exists
	        boolean[] visited = new boolean[26]; // assuming only lowercase alphabets
	        for (char c : graph.keySet()) {
	            if (!visited[c - 'a'] && dfs(graph, visited, indegree, c)) {
	                return true;
	            }
	        }
	        return false;
	    }
	    private static boolean dfs(Map<Character, List<Character>> graph, boolean[] visited, Map<Character, Integer> indegree, char node) {
	        visited[node - 'a'] = true;
	        for (char neighbor : graph.getOrDefault(node, new ArrayList<>())) {
	            if (visited[neighbor - 'a'] && indegree.get(neighbor) > 0) {
	                return true;
	            }
	            if (!visited[neighbor - 'a'] && dfs(graph, visited, indegree, neighbor)) {
	                return true;
	            }
	        }
	        visited[node - 'a'] = false; // backtracking
	        return false;
	    }

	    private static void printCircle(String[] words) {
	        StringBuilder sb = new StringBuilder();
	        Set<String> visited = new HashSet<>();
	        sb.append(words[0]);
	        visited.add(words[0]);
	        char lastChar = words[0].charAt(words[0].length() - 1);
	        while (true) {
	            boolean found = false;
	            for (String word : words) {
	                if (!visited.contains(word) && word.charAt(0) == lastChar) {
	                    sb.append(" ").append(word);
	                    lastChar = word.charAt(word.length() - 1);
	                    visited.add(word);
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) break;
	        }
	        System.out.println(sb);
	    }
	}


