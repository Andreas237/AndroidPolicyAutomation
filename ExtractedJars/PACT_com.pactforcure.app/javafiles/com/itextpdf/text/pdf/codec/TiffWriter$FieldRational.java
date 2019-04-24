// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;


// Referenced classes of package com.itextpdf.text.pdf.codec:
//			TiffWriter

public static class TiffWriter$FieldRational extends TiffWriter.FieldBase
{

	public TiffWriter$FieldRational(int i, int ai[])
	{
		this(i, new int[][] {
			ai
		});
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:anewarray       int[][]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_2         
	//    7    9:aastore         
	//    8   10:invokespecial   #14  <Method void TiffWriter$FieldRational(int, int[][])>
	//    9   13:return          
	}

	public TiffWriter$FieldRational(int i, int ai[][])
	{
		super(i, 5, ai.length);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:aload_2         
	//    4    4:arraylength     
	//    5    5:invokespecial   #18  <Method void TiffWriter$FieldBase(int, int, int)>
		data = new byte[ai.length * 8];
	//    6    8:aload_0         
	//    7    9:aload_2         
	//    8   10:arraylength     
	//    9   11:bipush          8
	//   10   13:imul            
	//   11   14:newarray        byte[]
	//   12   16:putfield        #22  <Field byte[] data>
		int k = ai.length;
	//   13   19:aload_2         
	//   14   20:arraylength     
	//   15   21:istore          4
		i = 0;
	//   16   23:iconst_0        
	//   17   24:istore_1        
		int j = 0;
	//   18   25:iconst_0        
	//   19   26:istore_3        
		for(; i < k; i++)
	//*  20   27:iload_1         
	//*  21   28:iload           4
	//*  22   30:icmpge          227
		{
			int ai1[] = ai[i];
	//   23   33:aload_2         
	//   24   34:iload_1         
	//   25   35:aaload          
	//   26   36:astore          6
			byte abyte0[] = data;
	//   27   38:aload_0         
	//   28   39:getfield        #22  <Field byte[] data>
	//   29   42:astore          7
			int l = j + 1;
	//   30   44:iload_3         
	//   31   45:iconst_1        
	//   32   46:iadd            
	//   33   47:istore          5
			abyte0[j] = (byte)(ai1[0] >> 24);
	//   34   49:aload           7
	//   35   51:iload_3         
	//   36   52:aload           6
	//   37   54:iconst_0        
	//   38   55:iaload          
	//   39   56:bipush          24
	//   40   58:ishr            
	//   41   59:int2byte        
	//   42   60:bastore         
			abyte0 = data;
	//   43   61:aload_0         
	//   44   62:getfield        #22  <Field byte[] data>
	//   45   65:astore          7
			j = l + 1;
	//   46   67:iload           5
	//   47   69:iconst_1        
	//   48   70:iadd            
	//   49   71:istore_3        
			abyte0[l] = (byte)(ai1[0] >> 16);
	//   50   72:aload           7
	//   51   74:iload           5
	//   52   76:aload           6
	//   53   78:iconst_0        
	//   54   79:iaload          
	//   55   80:bipush          16
	//   56   82:ishr            
	//   57   83:int2byte        
	//   58   84:bastore         
			abyte0 = data;
	//   59   85:aload_0         
	//   60   86:getfield        #22  <Field byte[] data>
	//   61   89:astore          7
			l = j + 1;
	//   62   91:iload_3         
	//   63   92:iconst_1        
	//   64   93:iadd            
	//   65   94:istore          5
			abyte0[j] = (byte)(ai1[0] >> 8);
	//   66   96:aload           7
	//   67   98:iload_3         
	//   68   99:aload           6
	//   69  101:iconst_0        
	//   70  102:iaload          
	//   71  103:bipush          8
	//   72  105:ishr            
	//   73  106:int2byte        
	//   74  107:bastore         
			abyte0 = data;
	//   75  108:aload_0         
	//   76  109:getfield        #22  <Field byte[] data>
	//   77  112:astore          7
			j = l + 1;
	//   78  114:iload           5
	//   79  116:iconst_1        
	//   80  117:iadd            
	//   81  118:istore_3        
			abyte0[l] = (byte)ai1[0];
	//   82  119:aload           7
	//   83  121:iload           5
	//   84  123:aload           6
	//   85  125:iconst_0        
	//   86  126:iaload          
	//   87  127:int2byte        
	//   88  128:bastore         
			abyte0 = data;
	//   89  129:aload_0         
	//   90  130:getfield        #22  <Field byte[] data>
	//   91  133:astore          7
			l = j + 1;
	//   92  135:iload_3         
	//   93  136:iconst_1        
	//   94  137:iadd            
	//   95  138:istore          5
			abyte0[j] = (byte)(ai1[1] >> 24);
	//   96  140:aload           7
	//   97  142:iload_3         
	//   98  143:aload           6
	//   99  145:iconst_1        
	//  100  146:iaload          
	//  101  147:bipush          24
	//  102  149:ishr            
	//  103  150:int2byte        
	//  104  151:bastore         
			abyte0 = data;
	//  105  152:aload_0         
	//  106  153:getfield        #22  <Field byte[] data>
	//  107  156:astore          7
			j = l + 1;
	//  108  158:iload           5
	//  109  160:iconst_1        
	//  110  161:iadd            
	//  111  162:istore_3        
			abyte0[l] = (byte)(ai1[1] >> 16);
	//  112  163:aload           7
	//  113  165:iload           5
	//  114  167:aload           6
	//  115  169:iconst_1        
	//  116  170:iaload          
	//  117  171:bipush          16
	//  118  173:ishr            
	//  119  174:int2byte        
	//  120  175:bastore         
			abyte0 = data;
	//  121  176:aload_0         
	//  122  177:getfield        #22  <Field byte[] data>
	//  123  180:astore          7
			l = j + 1;
	//  124  182:iload_3         
	//  125  183:iconst_1        
	//  126  184:iadd            
	//  127  185:istore          5
			abyte0[j] = (byte)(ai1[1] >> 8);
	//  128  187:aload           7
	//  129  189:iload_3         
	//  130  190:aload           6
	//  131  192:iconst_1        
	//  132  193:iaload          
	//  133  194:bipush          8
	//  134  196:ishr            
	//  135  197:int2byte        
	//  136  198:bastore         
			abyte0 = data;
	//  137  199:aload_0         
	//  138  200:getfield        #22  <Field byte[] data>
	//  139  203:astore          7
			j = l + 1;
	//  140  205:iload           5
	//  141  207:iconst_1        
	//  142  208:iadd            
	//  143  209:istore_3        
			abyte0[l] = (byte)ai1[1];
	//  144  210:aload           7
	//  145  212:iload           5
	//  146  214:aload           6
	//  147  216:iconst_1        
	//  148  217:iaload          
	//  149  218:int2byte        
	//  150  219:bastore         
		}

	//  151  220:iload_1         
	//  152  221:iconst_1        
	//  153  222:iadd            
	//  154  223:istore_1        
	//* 155  224:goto            27
	//  156  227:return          
	}
}
