// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import java.io.PrintStream;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			Abbreviator

public class TargetLengthBasedClassNameAbbreviator
	implements Abbreviator
{

	public TargetLengthBasedClassNameAbbreviator(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		targetLength = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int targetLength>
	//    5    9:return          
	}

	static int computeDotIndexes(String s, int ai[])
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		do
		{
			j = s.indexOf('.', j);
	//    4    4:aload_0         
	//    5    5:bipush          46
	//    6    7:iload_3         
	//    7    8:invokevirtual   #24  <Method int String.indexOf(int, int)>
	//    8   11:istore_3        
			if(j != -1 && i < 16)
	//*   9   12:iload_3         
	//*  10   13:iconst_m1       
	//*  11   14:icmpeq          38
	//*  12   17:iload_2         
	//*  13   18:bipush          16
	//*  14   20:icmpge          38
			{
				ai[i] = j;
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:iload_3         
	//   18   26:iastore         
				i++;
	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:istore_2        
				j++;
	//   23   31:iload_3         
	//   24   32:iconst_1        
	//   25   33:iadd            
	//   26   34:istore_3        
			} else
	//*  27   35:goto            4
			{
				return i;
	//   28   38:iload_2         
	//   29   39:ireturn         
			}
		} while(true);
	}

	static void printArray(String s, int ai[])
	{
		System.out.print(s);
	//    0    0:getstatic       #32  <Field PrintStream System.out>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #38  <Method void PrintStream.print(String)>
		for(int i = 0; i < ai.length; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:aload_1         
	//*   7   11:arraylength     
	//*   8   12:icmpge          73
			if(i == 0)
	//*   9   15:iload_2         
	//*  10   16:ifne            31
			{
				System.out.print(ai[i]);
	//   11   19:getstatic       #32  <Field PrintStream System.out>
	//   12   22:aload_1         
	//   13   23:iload_2         
	//   14   24:iaload          
	//   15   25:invokevirtual   #40  <Method void PrintStream.print(int)>
			} else
	//*  16   28:goto            66
			{
				s = ((String) (System.out));
	//   17   31:getstatic       #32  <Field PrintStream System.out>
	//   18   34:astore_0        
				StringBuilder stringbuilder = new StringBuilder();
	//   19   35:new             #42  <Class StringBuilder>
	//   20   38:dup             
	//   21   39:invokespecial   #43  <Method void StringBuilder()>
	//   22   42:astore_3        
				stringbuilder.append(", ");
	//   23   43:aload_3         
	//   24   44:ldc1            #45  <String ", ">
	//   25   46:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
				stringbuilder.append(ai[i]);
	//   27   50:aload_3         
	//   28   51:aload_1         
	//   29   52:iload_2         
	//   30   53:iaload          
	//   31   54:invokevirtual   #52  <Method StringBuilder StringBuilder.append(int)>
	//   32   57:pop             
				((PrintStream) (s)).print(stringbuilder.toString());
	//   33   58:aload_0         
	//   34   59:aload_3         
	//   35   60:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   36   63:invokevirtual   #38  <Method void PrintStream.print(String)>
			}

	//   37   66:iload_2         
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore_2        
	//*  41   70:goto            9
		System.out.println();
	//   42   73:getstatic       #32  <Field PrintStream System.out>
	//   43   76:invokevirtual   #59  <Method void PrintStream.println()>
	//   44   79:return          
	}

	public String abbreviate(String s)
	{
		StringBuilder stringbuilder = new StringBuilder(targetLength);
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field int targetLength>
	//    4    8:invokespecial   #63  <Method void StringBuilder(int)>
	//    5   11:astore          6
		if(s == null)
	//*   6   13:aload_1         
	//*   7   14:ifnonnull       27
			throw new IllegalArgumentException("Class name may not be null");
	//    8   17:new             #65  <Class IllegalArgumentException>
	//    9   20:dup             
	//   10   21:ldc1            #67  <String "Class name may not be null">
	//   11   23:invokespecial   #69  <Method void IllegalArgumentException(String)>
	//   12   26:athrow          
		if(s.length() < targetLength)
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #73  <Method int String.length()>
	//*  15   31:aload_0         
	//*  16   32:getfield        #15  <Field int targetLength>
	//*  17   35:icmpge          40
			return s;
	//   18   38:aload_1         
	//   19   39:areturn         
		int ai[] = new int[16];
	//   20   40:bipush          16
	//   21   42:newarray        int[]
	//   22   44:astore          7
		int ai1[] = new int[17];
	//   23   46:bipush          17
	//   24   48:newarray        int[]
	//   25   50:astore          8
		int j = computeDotIndexes(s, ai);
	//   26   52:aload_1         
	//   27   53:aload           7
	//   28   55:invokestatic    #75  <Method int computeDotIndexes(String, int[])>
	//   29   58:istore_3        
		if(j == 0)
	//*  30   59:iload_3         
	//*  31   60:ifne            65
			return s;
	//   32   63:aload_1         
	//   33   64:areturn         
		computeLengthArray(s, ai, ai1, j);
	//   34   65:aload_0         
	//   35   66:aload_1         
	//   36   67:aload           7
	//   37   69:aload           8
	//   38   71:iload_3         
	//   39   72:invokevirtual   #79  <Method void computeLengthArray(String, int[], int[], int)>
		int k;
		String s1;
		for(int i = 0; i <= j; i++)
	//*  40   75:iconst_0        
	//*  41   76:istore_2        
	//*  42   77:iload_2         
	//*  43   78:iload_3         
	//*  44   79:icmpgt          146
		{
			if(i == 0)
	//*  45   82:iload_2         
	//*  46   83:ifne            110
			{
				s1 = s.substring(0, ai1[i] - 1);
	//   47   86:aload_1         
	//   48   87:iconst_0        
	//   49   88:aload           8
	//   50   90:iload_2         
	//   51   91:iaload          
	//   52   92:iconst_1        
	//   53   93:isub            
	//   54   94:invokevirtual   #83  <Method String String.substring(int, int)>
	//   55   97:astore          5
			} else
	//*  56   99:aload           6
	//*  57  101:aload           5
	//*  58  103:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//*  59  106:pop             
	//*  60  107:goto            139
			{
				k = i - 1;
	//   61  110:iload_2         
	//   62  111:iconst_1        
	//   63  112:isub            
	//   64  113:istore          4
				s1 = s.substring(ai[k], ai[k] + ai1[i]);
	//   65  115:aload_1         
	//   66  116:aload           7
	//   67  118:iload           4
	//   68  120:iaload          
	//   69  121:aload           7
	//   70  123:iload           4
	//   71  125:iaload          
	//   72  126:aload           8
	//   73  128:iload_2         
	//   74  129:iaload          
	//   75  130:iadd            
	//   76  131:invokevirtual   #83  <Method String String.substring(int, int)>
	//   77  134:astore          5
			}
			stringbuilder.append(s1);
		}

	//   78  136:goto            99
	//   79  139:iload_2         
	//   80  140:iconst_1        
	//   81  141:iadd            
	//   82  142:istore_2        
	//*  83  143:goto            77
		return stringbuilder.toString();
	//   84  146:aload           6
	//   85  148:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   86  151:areturn         
	}

	void computeLengthArray(String s, int ai[], int ai1[], int i)
	{
		int k = s.length() - targetLength;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #73  <Method int String.length()>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field int targetLength>
	//    4    8:isub            
	//    5    9:istore          6
		for(int j = 0; j < i; j++)
	//*   6   11:iconst_0        
	//*   7   12:istore          5
	//*   8   14:iload           5
	//*   9   16:iload           4
	//*  10   18:icmpge          99
		{
			int l = -1;
	//   11   21:iconst_m1       
	//   12   22:istore          7
			if(j > 0)
	//*  13   24:iload           5
	//*  14   26:ifle            37
				l = ai[j - 1];
	//   15   29:aload_2         
	//   16   30:iload           5
	//   17   32:iconst_1        
	//   18   33:isub            
	//   19   34:iaload          
	//   20   35:istore          7
			int i1 = ai[j] - l - 1;
	//   21   37:aload_2         
	//   22   38:iload           5
	//   23   40:iaload          
	//   24   41:iload           7
	//   25   43:isub            
	//   26   44:iconst_1        
	//   27   45:isub            
	//   28   46:istore          8
			if(k > 0 && i1 >= 1)
	//*  29   48:iload           6
	//*  30   50:ifle            68
	//*  31   53:iload           8
	//*  32   55:iconst_1        
	//*  33   56:icmpge          62
	//*  34   59:goto            68
				l = 1;
	//   35   62:iconst_1        
	//   36   63:istore          7
			else
	//*  37   65:goto            72
				l = i1;
	//   38   68:iload           8
	//   39   70:istore          7
			k -= i1 - l;
	//   40   72:iload           6
	//   41   74:iload           8
	//   42   76:iload           7
	//   43   78:isub            
	//   44   79:isub            
	//   45   80:istore          6
			ai1[j] = l + 1;
	//   46   82:aload_3         
	//   47   83:iload           5
	//   48   85:iload           7
	//   49   87:iconst_1        
	//   50   88:iadd            
	//   51   89:iastore         
		}

	//   52   90:iload           5
	//   53   92:iconst_1        
	//   54   93:iadd            
	//   55   94:istore          5
	//*  56   96:goto            14
		ai1[i] = s.length() - ai[i - 1];
	//   57   99:aload_3         
	//   58  100:iload           4
	//   59  102:aload_1         
	//   60  103:invokevirtual   #73  <Method int String.length()>
	//   61  106:aload_2         
	//   62  107:iload           4
	//   63  109:iconst_1        
	//   64  110:isub            
	//   65  111:iaload          
	//   66  112:isub            
	//   67  113:iastore         
	//   68  114:return          
	}

	final int targetLength;
}
