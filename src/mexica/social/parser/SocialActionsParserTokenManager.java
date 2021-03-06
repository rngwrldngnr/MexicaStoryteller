/* Generated By:JavaCC: Do not edit this line. SocialActionsParserTokenManager.java */
package mexica.social.parser;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import mexica.MexicaParameters;
import mexica.core.*;
import mexica.social.*;
import slant.MexicaFileConfiguration;

/** Token Manager. */
public class SocialActionsParserTokenManager implements SocialActionsParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x20L) != 0L)
         {
            jjmatchedKind = 18;
            return 34;
         }
         if ((active0 & 0x810L) != 0L)
         {
            jjmatchedKind = 18;
            return 49;
         }
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 18;
            return 98;
         }
         if ((active0 & 0x44c0L) != 0L)
            return 49;
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 18;
            return 18;
         }
         return -1;
      case 1:
         if ((active0 & 0x4e30L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 1;
            return 49;
         }
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 1;
            return 17;
         }
         return -1;
      case 2:
         if ((active0 & 0x1e10L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
            return 49;
         }
         if ((active0 & 0x4020L) != 0L)
            return 49;
         return -1;
      case 3:
         if ((active0 & 0x1a00L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 3;
            return 49;
         }
         if ((active0 & 0x10L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 18;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0x400L) != 0L)
            return 49;
         return -1;
      case 4:
         if ((active0 & 0x10L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 18;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0x1a00L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 4;
            return 49;
         }
         return -1;
      case 5:
         if ((active0 & 0x10L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 18;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0x200L) != 0L)
            return 49;
         if ((active0 & 0x1800L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 5;
            return 49;
         }
         return -1;
      case 6:
         if ((active0 & 0x1800L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 6;
            return 49;
         }
         if ((active0 & 0x10L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 18;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x10L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 18;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0x800L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 7;
            return 49;
         }
         if ((active0 & 0x1000L) != 0L)
            return 49;
         return -1;
      case 8:
         if ((active0 & 0x10L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 18;
               jjmatchedPos = 2;
            }
            return -1;
         }
         if ((active0 & 0x800L) != 0L)
            return 49;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 42:
         return jjStopAtPos(0, 17);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 69:
         jjmatchedKind = 6;
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 84:
         jjmatchedKind = 7;
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa2_0(active0, 0x10L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 79:
         return jjMoveStringLiteralDfa2_0(active0, 0x220L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 68:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 49);
         break;
      case 83:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(2, 5, 49);
         break;
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x10L);
      case 88:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa4_0(active0, 0x10L);
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 84:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 49);
         break;
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 83:
         return jjMoveStringLiteralDfa5_0(active0, 0x10L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 76:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 49);
         break;
      case 79:
         return jjMoveStringLiteralDfa6_0(active0, 0x10L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa7_0(active0, 0x10L);
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa8_0(active0, 0x10L);
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x800L);
      case 110:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(7, 12, 49);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa9_0(active0, 0x10L);
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(8, 11, 49);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 76:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(9, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 112;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 34:
               case 49:
                  if ((0xa0005b8200000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(49);
                  break;
               case 98:
                  if ((0xa0005b8200000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(49);
                  break;
               case 18:
                  if ((0xa0005b8200000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(49);
                  break;
               case 17:
                  if ((0xa0005b8200000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(49);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  else if ((0xa0005b8200000000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAdd(49);
                  }
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 3)
                        kind = 3;
                  }
                  else if ((0x100000200L & l) != 0L)
                  {
                     if (kind > 2)
                        kind = 2;
                  }
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 51;
                  else if (curChar == 59)
                  {
                     if (kind > 1)
                        kind = 1;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 1:
                  if ((0xa0005b8200000000L & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if ((0x100000200L & l) != 0L)
                     jjCheckNAdd(3);
                  break;
               case 3:
                  if ((0xa0005b8200000000L & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAddTwoStates(2, 3);
                  break;
               case 4:
                  if ((0x100000200L & l) != 0L && kind > 2)
                     kind = 2;
                  break;
               case 5:
                  if ((0x2400L & l) != 0L && kind > 3)
                     kind = 3;
                  break;
               case 6:
                  if (curChar == 10 && kind > 3)
                     kind = 3;
                  break;
               case 7:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 50:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 51:
                  if ((0x3ff000000000000L & l) != 0L)
                     kind = 19;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 34:
                  if ((0x7fffffe87ffffffL & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAdd(49);
                  }
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 98:
                  if ((0x7fffffe87ffffffL & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAdd(49);
                  }
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 110;
                  else if (curChar == 116)
                     jjCheckNAdd(103);
                  else if (curChar == 98)
                     jjCheckNAdd(103);
                  else if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 101;
                  else if (curChar == 100)
                  {
                     if (kind > 8)
                        kind = 8;
                  }
                  if (curChar == 111)
                     jjCheckNAdd(103);
                  else if (curChar == 116)
                  {
                     if (kind > 8)
                        kind = 8;
                  }
                  else if (curChar == 98)
                  {
                     if (kind > 8)
                        kind = 8;
                  }
                  break;
               case 18:
                  if ((0x7fffffe87ffffffL & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAdd(49);
                  }
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0x7fffffe87ffffffL & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAdd(49);
                  }
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 0:
                  if ((0x7fffffe87ffffffL & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAdd(49);
                  }
                  if (curChar == 83)
                     jjAddStates(0, 7);
                  else if (curChar == 66)
                     jjAddStates(8, 9);
                  else if (curChar == 78)
                     jjAddStates(10, 11);
                  else if (curChar == 71)
                     jjstateSet[jjnewStateCnt++] = 47;
                  else if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 41;
                  else if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 34;
                  else if (curChar == 106)
                     jjstateSet[jjnewStateCnt++] = 25;
                  else if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 18;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 1:
                  if ((0x7fffffe87ffffffL & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
                  if ((0x7fffffe87ffffffL & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAddTwoStates(2, 3);
                  break;
               case 8:
                  if (curChar == 116 && kind > 13)
                     kind = 13;
                  break;
               case 9:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 101 && kind > 13)
                     kind = 13;
                  break;
               case 15:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 19:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 121 && kind > 13)
                     kind = 13;
                  break;
               case 21:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 106)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 114 && kind > 15)
                     kind = 15;
                  break;
               case 28:
               case 36:
               case 53:
                  if (curChar == 101)
                     jjCheckNAdd(27);
                  break;
               case 29:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 35:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 37:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if (curChar == 114 && kind > 16)
                     kind = 16;
                  break;
               case 44:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               case 45:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 71)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 49:
                  if ((0x7fffffe87ffffffL & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(49);
                  break;
               case 52:
                  if (curChar == 78)
                     jjAddStates(10, 11);
                  break;
               case 54:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 55:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 54;
                  break;
               case 56:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 56;
                  break;
               case 58:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 57;
                  break;
               case 59:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 58;
                  break;
               case 60:
                  if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 61:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if (curChar == 110 && kind > 16)
                     kind = 16;
                  break;
               case 63:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 62;
                  break;
               case 64:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 63;
                  break;
               case 65:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 66:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 65;
                  break;
               case 67:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 68:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 69:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 68;
                  break;
               case 70:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 69;
                  break;
               case 71:
                  if (curChar == 66)
                     jjAddStates(8, 9);
                  break;
               case 72:
                  if (curChar == 115 && kind > 15)
                     kind = 15;
                  break;
               case 73:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 72;
                  break;
               case 74:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 73;
                  break;
               case 75:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 74;
                  break;
               case 76:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 75;
                  break;
               case 77:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 76;
                  break;
               case 78:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 77;
                  break;
               case 79:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 78;
                  break;
               case 80:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 79;
                  break;
               case 81:
                  if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 80;
                  break;
               case 82:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 81;
                  break;
               case 83:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 82;
                  break;
               case 84:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 83;
                  break;
               case 85:
                  if (curChar == 115 && kind > 16)
                     kind = 16;
                  break;
               case 86:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 85;
                  break;
               case 87:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 86;
                  break;
               case 88:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 87;
                  break;
               case 89:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 88;
                  break;
               case 90:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 91:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 90;
                  break;
               case 92:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 91;
                  break;
               case 93:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 92;
                  break;
               case 94:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 93;
                  break;
               case 95:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 94;
                  break;
               case 96:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 95;
                  break;
               case 97:
                  if (curChar == 83)
                     jjAddStates(0, 7);
                  break;
               case 99:
                  if (curChar == 98 && kind > 8)
                     kind = 8;
                  break;
               case 100:
                  if (curChar == 116 && kind > 8)
                     kind = 8;
                  break;
               case 101:
                  if (curChar == 99 && kind > 8)
                     kind = 8;
                  break;
               case 102:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 101;
                  break;
               case 103:
                  if (curChar == 114 && kind > 8)
                     kind = 8;
                  break;
               case 104:
                  if (curChar == 111)
                     jjCheckNAdd(103);
                  break;
               case 105:
                  if (curChar == 98)
                     jjCheckNAdd(103);
                  break;
               case 106:
                  if (curChar == 116)
                     jjCheckNAdd(103);
                  break;
               case 107:
                  if (curChar == 108 && kind > 16)
                     kind = 16;
                  break;
               case 108:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 107;
                  break;
               case 109:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 108;
                  break;
               case 110:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 109;
                  break;
               case 111:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 110;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 112 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   98, 99, 100, 102, 104, 105, 106, 111, 84, 96, 61, 70, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, "\101\103\124\40\123\117\103\111\101\114", 
"\120\117\123", "\105", "\124", null, "\123\117\103\111\101\114", "\124\105\130\124", 
"\143\150\141\162\141\143\164\145\162", "\162\145\154\141\164\151\157\156", null, "\105\116\104", null, null, "\52", 
null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffdL, 
};
static final long[] jjtoSkip = {
   0x2L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[112];
private final int[] jjstateSet = new int[224];
protected char curChar;
/** Constructor. */
public SocialActionsParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public SocialActionsParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 112; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
