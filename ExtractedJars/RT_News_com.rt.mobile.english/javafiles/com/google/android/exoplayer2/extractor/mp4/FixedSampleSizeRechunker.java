// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Util;

final class FixedSampleSizeRechunker
{
	public static final class Results
	{

		public final long duration;
		public final int flags[];
		public final int maximumSize;
		public final long offsets[];
		public final int sizes[];
		public final long timestamps[];

		private Results(long al[], int ai[], int i, long al1[], int ai1[], long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			offsets = al;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field long[] offsets>
			sizes = ai;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field int[] sizes>
			maximumSize = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #28  <Field int maximumSize>
			timestamps = al1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #30  <Field long[] timestamps>
			flags = ai1;
		//   14   25:aload_0         
		//   15   26:aload           5
		//   16   28:putfield        #32  <Field int[] flags>
			duration = l;
		//   17   31:aload_0         
		//   18   32:lload           6
		//   19   34:putfield        #34  <Field long duration>
		//   20   37:return          
		}

		Results(long al[], int ai[], int i, long al1[], int ai1[], long l, 
				_cls1 _pcls1)
		{
			this(al, ai, i, al1, ai1, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:aload           4
		//    5    6:aload           5
		//    6    8:lload           6
		//    7   10:invokespecial   #38  <Method void FixedSampleSizeRechunker$Results(long[], int[], int, long[], int[], long)>
		//    8   13:return          
		}
	}


	private FixedSampleSizeRechunker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static Results rechunk(int i, long al[], int ai[], long l)
	{
		int ai1[] = ai;
	//    0    0:aload_2         
	//    1    1:astore          16
		int l1 = 8192 / i;
	//    2    3:sipush          8192
	//    3    6:iload_0         
	//    4    7:idiv            
	//    5    8:istore          10
		boolean flag = false;
	//    6   10:iconst_0        
	//    7   11:istore          8
		int i1 = ai1.length;
	//    8   13:aload           16
	//    9   15:arraylength     
	//   10   16:istore          7
		int j = 0;
	//   11   18:iconst_0        
	//   12   19:istore          5
		int k = j;
	//   13   21:iload           5
	//   14   23:istore          6
		for(; j < i1; j++)
	//*  15   25:iload           5
	//*  16   27:iload           7
	//*  17   29:icmpge          56
			k += Util.ceilDivide(ai1[j], l1);
	//   18   32:iload           6
	//   19   34:aload           16
	//   20   36:iload           5
	//   21   38:iaload          
	//   22   39:iload           10
	//   23   41:invokestatic    #25  <Method int Util.ceilDivide(int, int)>
	//   24   44:iadd            
	//   25   45:istore          6

	//   26   47:iload           5
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore          5
	//*  30   53:goto            25
		long al1[] = new long[k];
	//   31   56:iload           6
	//   32   58:newarray        long[]
	//   33   60:astore          17
		int ai3[] = new int[k];
	//   34   62:iload           6
	//   35   64:newarray        int[]
	//   36   66:astore          18
		long al2[] = new long[k];
	//   37   68:iload           6
	//   38   70:newarray        long[]
	//   39   72:astore          19
		int ai4[] = new int[k];
	//   40   74:iload           6
	//   41   76:newarray        int[]
	//   42   78:astore          20
		i1 = 0;
	//   43   80:iconst_0        
	//   44   81:istore          7
		j = i1;
	//   45   83:iload           7
	//   46   85:istore          5
		int k1 = j;
	//   47   87:iload           5
	//   48   89:istore          9
		k = j;
	//   49   91:iload           5
	//   50   93:istore          6
		j = ((int) (flag));
	//   51   95:iload           8
	//   52   97:istore          5
		do
		{
			int ai2[] = ai;
	//   53   99:aload_2         
	//   54  100:astore          16
			if(j < ai2.length)
	//*  55  102:iload           5
	//*  56  104:aload           16
	//*  57  106:arraylength     
	//*  58  107:icmpge          228
			{
				int j1 = ai2[j];
	//   59  110:aload           16
	//   60  112:iload           5
	//   61  114:iaload          
	//   62  115:istore          8
				long l3;
				for(long l2 = al[j]; j1 > 0; l2 += l3)
	//*  63  117:aload_1         
	//*  64  118:iload           5
	//*  65  120:laload          
	//*  66  121:lstore          12
	//*  67  123:iload           8
	//*  68  125:ifle            219
				{
					int i2 = Math.min(l1, j1);
	//   69  128:iload           10
	//   70  130:iload           8
	//   71  132:invokestatic    #30  <Method int Math.min(int, int)>
	//   72  135:istore          11
					al1[k] = l2;
	//   73  137:aload           17
	//   74  139:iload           6
	//   75  141:lload           12
	//   76  143:lastore         
					ai3[k] = i * i2;
	//   77  144:aload           18
	//   78  146:iload           6
	//   79  148:iload_0         
	//   80  149:iload           11
	//   81  151:imul            
	//   82  152:iastore         
					k1 = Math.max(k1, ai3[k]);
	//   83  153:iload           9
	//   84  155:aload           18
	//   85  157:iload           6
	//   86  159:iaload          
	//   87  160:invokestatic    #33  <Method int Math.max(int, int)>
	//   88  163:istore          9
					al2[k] = (long)i1 * l;
	//   89  165:aload           19
	//   90  167:iload           6
	//   91  169:iload           7
	//   92  171:i2l             
	//   93  172:lload_3         
	//   94  173:lmul            
	//   95  174:lastore         
					ai4[k] = 1;
	//   96  175:aload           20
	//   97  177:iload           6
	//   98  179:iconst_1        
	//   99  180:iastore         
					l3 = ai3[k];
	//  100  181:aload           18
	//  101  183:iload           6
	//  102  185:iaload          
	//  103  186:i2l             
	//  104  187:lstore          14
					i1 += i2;
	//  105  189:iload           7
	//  106  191:iload           11
	//  107  193:iadd            
	//  108  194:istore          7
					j1 -= i2;
	//  109  196:iload           8
	//  110  198:iload           11
	//  111  200:isub            
	//  112  201:istore          8
					k++;
	//  113  203:iload           6
	//  114  205:iconst_1        
	//  115  206:iadd            
	//  116  207:istore          6
				}

	//  117  209:lload           12
	//  118  211:lload           14
	//  119  213:ladd            
	//  120  214:lstore          12
	//* 121  216:goto            123
				j++;
	//  122  219:iload           5
	//  123  221:iconst_1        
	//  124  222:iadd            
	//  125  223:istore          5
			} else
	//* 126  225:goto            99
			{
				return new Results(al1, ai3, k1, al2, ai4, l * (long)i1);
	//  127  228:new             #8   <Class FixedSampleSizeRechunker$Results>
	//  128  231:dup             
	//  129  232:aload           17
	//  130  234:aload           18
	//  131  236:iload           9
	//  132  238:aload           19
	//  133  240:aload           20
	//  134  242:lload_3         
	//  135  243:iload           7
	//  136  245:i2l             
	//  137  246:lmul            
	//  138  247:aconst_null     
	//  139  248:invokespecial   #36  <Method void FixedSampleSizeRechunker$Results(long[], int[], int, long[], int[], long, FixedSampleSizeRechunker$1)>
	//  140  251:areturn         
			}
		} while(true);
	}

	private static final int MAX_SAMPLE_SIZE = 8192;
}
