// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.util.Util;

final class FixedSampleSizeRechunker
{
	public static final class Results
	{

		public final int flags[];
		public final int maximumSize;
		public final long offsets[];
		public final int sizes[];
		public final long timestamps[];

		public Results(long al[], int ai[], int i, long al1[], int ai1[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			offsets = al;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field long[] offsets>
			sizes = ai;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field int[] sizes>
			maximumSize = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #26  <Field int maximumSize>
			timestamps = al1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #28  <Field long[] timestamps>
			flags = ai1;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #30  <Field int[] flags>
		//   17   31:return          
		}
	}


	FixedSampleSizeRechunker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static Results rechunk(int i, long al[], int ai[], long l)
	{
		int i2 = 8192 / i;
	//    0    0:sipush          8192
	//    1    3:iload_0         
	//    2    4:idiv            
	//    3    5:istore          10
		int j1 = ai.length;
	//    4    7:aload_2         
	//    5    8:arraylength     
	//    6    9:istore          7
		boolean flag = false;
	//    7   11:iconst_0        
	//    8   12:istore          8
		int j = 0;
	//    9   14:iconst_0        
	//   10   15:istore          5
		int i1 = j;
	//   11   17:iload           5
	//   12   19:istore          6
		for(; j < j1; j++)
	//*  13   21:iload           5
	//*  14   23:iload           7
	//*  15   25:icmpge          51
			i1 += Util.ceilDivide(ai[j], i2);
	//   16   28:iload           6
	//   17   30:aload_2         
	//   18   31:iload           5
	//   19   33:iaload          
	//   20   34:iload           10
	//   21   36:invokestatic    #23  <Method int Util.ceilDivide(int, int)>
	//   22   39:iadd            
	//   23   40:istore          6

	//   24   42:iload           5
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore          5
	//*  28   48:goto            21
		long al1[] = new long[i1];
	//   29   51:iload           6
	//   30   53:newarray        long[]
	//   31   55:astore          14
		int ai1[] = new int[i1];
	//   32   57:iload           6
	//   33   59:newarray        int[]
	//   34   61:astore          15
		long al2[] = new long[i1];
	//   35   63:iload           6
	//   36   65:newarray        long[]
	//   37   67:astore          16
		int ai2[] = new int[i1];
	//   38   69:iload           6
	//   39   71:newarray        int[]
	//   40   73:astore          17
		i1 = 0;
	//   41   75:iconst_0        
	//   42   76:istore          6
		j = i1;
	//   43   78:iload           6
	//   44   80:istore          5
		int l1 = j;
	//   45   82:iload           5
	//   46   84:istore          9
		j1 = j;
	//   47   86:iload           5
	//   48   88:istore          7
		for(int k = ((int) (flag)); k < ai.length; k++)
	//*  49   90:iload           8
	//*  50   92:istore          5
	//*  51   94:iload           5
	//*  52   96:aload_2         
	//*  53   97:arraylength     
	//*  54   98:icmpge          214
		{
			int k1 = ai[k];
	//   55  101:aload_2         
	//   56  102:iload           5
	//   57  104:iaload          
	//   58  105:istore          8
			long l2 = al[k];
	//   59  107:aload_1         
	//   60  108:iload           5
	//   61  110:laload          
	//   62  111:lstore          12
			while(k1 > 0) 
	//*  63  113:iload           8
	//*  64  115:ifle            205
			{
				int j2 = Math.min(i2, k1);
	//   65  118:iload           10
	//   66  120:iload           8
	//   67  122:invokestatic    #28  <Method int Math.min(int, int)>
	//   68  125:istore          11
				al1[i1] = l2;
	//   69  127:aload           14
	//   70  129:iload           6
	//   71  131:lload           12
	//   72  133:lastore         
				ai1[i1] = i * j2;
	//   73  134:aload           15
	//   74  136:iload           6
	//   75  138:iload_0         
	//   76  139:iload           11
	//   77  141:imul            
	//   78  142:iastore         
				l1 = Math.max(l1, ai1[i1]);
	//   79  143:iload           9
	//   80  145:aload           15
	//   81  147:iload           6
	//   82  149:iaload          
	//   83  150:invokestatic    #31  <Method int Math.max(int, int)>
	//   84  153:istore          9
				al2[i1] = (long)j1 * l;
	//   85  155:aload           16
	//   86  157:iload           6
	//   87  159:iload           7
	//   88  161:i2l             
	//   89  162:lload_3         
	//   90  163:lmul            
	//   91  164:lastore         
				ai2[i1] = 1;
	//   92  165:aload           17
	//   93  167:iload           6
	//   94  169:iconst_1        
	//   95  170:iastore         
				l2 += ai1[i1];
	//   96  171:lload           12
	//   97  173:aload           15
	//   98  175:iload           6
	//   99  177:iaload          
	//  100  178:i2l             
	//  101  179:ladd            
	//  102  180:lstore          12
				j1 += j2;
	//  103  182:iload           7
	//  104  184:iload           11
	//  105  186:iadd            
	//  106  187:istore          7
				k1 -= j2;
	//  107  189:iload           8
	//  108  191:iload           11
	//  109  193:isub            
	//  110  194:istore          8
				i1++;
	//  111  196:iload           6
	//  112  198:iconst_1        
	//  113  199:iadd            
	//  114  200:istore          6
			}
		}

	//  115  202:goto            113
	//  116  205:iload           5
	//  117  207:iconst_1        
	//  118  208:iadd            
	//  119  209:istore          5
	//* 120  211:goto            94
		return new Results(al1, ai1, l1, al2, ai2);
	//  121  214:new             #6   <Class FixedSampleSizeRechunker$Results>
	//  122  217:dup             
	//  123  218:aload           14
	//  124  220:aload           15
	//  125  222:iload           9
	//  126  224:aload           16
	//  127  226:aload           17
	//  128  228:invokespecial   #34  <Method void FixedSampleSizeRechunker$Results(long[], int[], int, long[], int[])>
	//  129  231:areturn         
	}

	private static final int MAX_SAMPLE_SIZE = 8192;
}
