package org.blah.codility.leader;

import java.util.*;

class Solution {
    
  public int solution(int[] A) {
      if (A.length == 0) throw null;

      Integer globalLeader = findLeader(A);
      if (globalLeader == null) return 0;

      int leaderCount = count(A, globalLeader);
      int count = 0;
      int result = 0;
      for (int i = 0; i < A.length; i++) {
          int curr = A[i];
          if (curr == globalLeader) {
              count++;
          }

          if (count > (i + 1)/2. 
          && leaderCount - count > (A.length - i - 1) / 2.) result++;

      }

      return result;
  }
    
  private Integer findLeader(int[] A) {
      int count = 0;
      int last = -1;

      for (int i = 1; i < A.length; i++) {
          int curr = A[i];
          if (count > 0) {
              if (last == curr) {
                  count++;
              } else {
                  count--;
              }
          } else {
              last = curr;
              count = 1;
          }
      }

      int leaderCount = 0;
      for (int e: A) {
          if (e == last) {
              leaderCount += 1;
          }
          if (leaderCount > A.length / 2) {
              return last;
          }
      }

      return null;
  }

  private int count(int[] A, int v) {
      int count = 0;
      for (int e: A) {
          if (e == v) {
              count += 1;
          }
      }
      return count;
  }
  
}
