// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;

import android.util.Log;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			VorbisBitArray

final class VorbisUtil
{
	public static final class CodeBook
	{

		public final int dimensions;
		public final int entries;
		public final boolean isOrdered;
		public final long lengthMap[];
		public final int lookupType;

		public CodeBook(int i, int j, long al[], int k, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			dimensions = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #22  <Field int dimensions>
			entries = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #24  <Field int entries>
			lengthMap = al;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field long[] lengthMap>
			lookupType = k;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #28  <Field int lookupType>
			isOrdered = flag;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #30  <Field boolean isOrdered>
		//   17   31:return          
		}
	}

	public static final class CommentHeader
	{

		public final String comments[];
		public final int length;
		public final String vendor;

		public CommentHeader(String s, String as[], int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			vendor = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field String vendor>
			comments = as;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field String[] comments>
			length = i;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int length>
		//   11   19:return          
		}
	}

	public static final class Mode
	{

		public final boolean blockFlag;
		public final int mapping;
		public final int transformType;
		public final int windowType;

		public Mode(boolean flag, int i, int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			blockFlag = flag;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field boolean blockFlag>
			windowType = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int windowType>
			transformType = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int transformType>
			mapping = k;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #26  <Field int mapping>
		//   14   25:return          
		}
	}

	public static final class VorbisIdHeader
	{

		public int getApproximateBitrate()
		{
			int j = bitrateNominal;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int bitrateNominal>
		//    2    4:istore_2        
			int i = j;
		//    3    5:iload_2         
		//    4    6:istore_1        
			if(j == 0)
		//*   5    7:iload_2         
		//*   6    8:ifne            23
				i = (bitrateMin + bitrateMax) / 2;
		//    7   11:aload_0         
		//    8   12:getfield        #38  <Field int bitrateMin>
		//    9   15:aload_0         
		//   10   16:getfield        #34  <Field int bitrateMax>
		//   11   19:iadd            
		//   12   20:iconst_2        
		//   13   21:idiv            
		//   14   22:istore_1        
			return i;
		//   15   23:iload_1         
		//   16   24:ireturn         
		}

		public final int bitrateMax;
		public final int bitrateMin;
		public final int bitrateNominal;
		public final int blockSize0;
		public final int blockSize1;
		public final int channels;
		public final byte data[];
		public final boolean framingFlag;
		public final long sampleRate;
		public final long version;

		public VorbisIdHeader(long l, int i, long l1, int j, int k, 
				int i1, int j1, int k1, boolean flag, byte abyte0[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			version = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #28  <Field long version>
			channels = i;
		//    5    9:aload_0         
		//    6   10:iload_3         
		//    7   11:putfield        #30  <Field int channels>
			sampleRate = l1;
		//    8   14:aload_0         
		//    9   15:lload           4
		//   10   17:putfield        #32  <Field long sampleRate>
			bitrateMax = j;
		//   11   20:aload_0         
		//   12   21:iload           6
		//   13   23:putfield        #34  <Field int bitrateMax>
			bitrateNominal = k;
		//   14   26:aload_0         
		//   15   27:iload           7
		//   16   29:putfield        #36  <Field int bitrateNominal>
			bitrateMin = i1;
		//   17   32:aload_0         
		//   18   33:iload           8
		//   19   35:putfield        #38  <Field int bitrateMin>
			blockSize0 = j1;
		//   20   38:aload_0         
		//   21   39:iload           9
		//   22   41:putfield        #40  <Field int blockSize0>
			blockSize1 = k1;
		//   23   44:aload_0         
		//   24   45:iload           10
		//   25   47:putfield        #42  <Field int blockSize1>
			framingFlag = flag;
		//   26   50:aload_0         
		//   27   51:iload           11
		//   28   53:putfield        #44  <Field boolean framingFlag>
			data = abyte0;
		//   29   56:aload_0         
		//   30   57:aload           12
		//   31   59:putfield        #46  <Field byte[] data>
		//   32   62:return          
		}
	}


	VorbisUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static int iLog(int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(; i > 0; i >>>= 1)
	//*   2    2:iload_0         
	//*   3    3:ifle            17
			j++;
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:istore_1        

	//    8   10:iload_0         
	//    9   11:iconst_1        
	//   10   12:iushr           
	//   11   13:istore_0        
	//*  12   14:goto            2
		return j;
	//   13   17:iload_1         
	//   14   18:ireturn         
	}

	private static long mapType1QuantValues(long l, long l1)
	{
		return (long)Math.floor(Math.pow(l, 1.0D / (double)l1));
	//    0    0:lload_0         
	//    1    1:l2d             
	//    2    2:dconst_1        
	//    3    3:lload_2         
	//    4    4:l2d             
	//    5    5:ddiv            
	//    6    6:invokestatic    #35  <Method double Math.pow(double, double)>
	//    7    9:invokestatic    #39  <Method double Math.floor(double)>
	//    8   12:d2l             
	//    9   13:lreturn         
	}

	private static CodeBook readBook(VorbisBitArray vorbisbitarray)
		throws ParserException
	{
		if(vorbisbitarray.readBits(24) == 0x564342)
	//*   0    0:aload_0         
	//*   1    1:bipush          24
	//*   2    3:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//*   3    6:ldc1            #49  <Int 0x564342>
	//*   4    8:icmpne          323
		{
			int i1 = vorbisbitarray.readBits(16);
	//    5   11:aload_0         
	//    6   12:bipush          16
	//    7   14:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//    8   17:istore          4
			int j1 = vorbisbitarray.readBits(24);
	//    9   19:aload_0         
	//   10   20:bipush          24
	//   11   22:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   12   25:istore          5
			long al[] = new long[j1];
	//   13   27:iload           5
	//   14   29:newarray        long[]
	//   15   31:astore          11
			boolean flag = vorbisbitarray.readBit();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #53  <Method boolean VorbisBitArray.readBit()>
	//   18   37:istore          7
			long l1 = 0L;
	//   19   39:lconst_0        
	//   20   40:lstore          9
			int i = 0;
	//   21   42:iconst_0        
	//   22   43:istore_1        
			if(!flag)
	//*  23   44:iload           7
	//*  24   46:ifne            116
			{
				boolean flag1 = vorbisbitarray.readBit();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #53  <Method boolean VorbisBitArray.readBit()>
	//   27   53:istore          8
				for(; i < al.length; i++)
	//*  28   55:iload_1         
	//*  29   56:aload           11
	//*  30   58:arraylength     
	//*  31   59:icmpge          185
					if(flag1)
	//*  32   62:iload           8
	//*  33   64:ifeq            97
					{
						if(vorbisbitarray.readBit())
	//*  34   67:aload_0         
	//*  35   68:invokevirtual   #53  <Method boolean VorbisBitArray.readBit()>
	//*  36   71:ifeq            89
							al[i] = vorbisbitarray.readBits(5) + 1;
	//   37   74:aload           11
	//   38   76:iload_1         
	//   39   77:aload_0         
	//   40   78:iconst_5        
	//   41   79:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   42   82:iconst_1        
	//   43   83:iadd            
	//   44   84:i2l             
	//   45   85:lastore         
						else
	//*  46   86:goto            109
							al[i] = 0L;
	//   47   89:aload           11
	//   48   91:iload_1         
	//   49   92:lconst_0        
	//   50   93:lastore         
					} else
	//*  51   94:goto            109
					{
						al[i] = vorbisbitarray.readBits(5) + 1;
	//   52   97:aload           11
	//   53   99:iload_1         
	//   54  100:aload_0         
	//   55  101:iconst_5        
	//   56  102:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   57  105:iconst_1        
	//   58  106:iadd            
	//   59  107:i2l             
	//   60  108:lastore         
					}

	//   61  109:iload_1         
	//   62  110:iconst_1        
	//   63  111:iadd            
	//   64  112:istore_1        
			} else
	//*  65  113:goto            55
			{
				int j = vorbisbitarray.readBits(5) + 1;
	//   66  116:aload_0         
	//   67  117:iconst_5        
	//   68  118:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   69  121:iconst_1        
	//   70  122:iadd            
	//   71  123:istore_2        
				for(i = 0; i < al.length;)
	//*  72  124:iconst_0        
	//*  73  125:istore_1        
	//*  74  126:iload_1         
	//*  75  127:aload           11
	//*  76  129:arraylength     
	//*  77  130:icmpge          185
				{
					int k1 = vorbisbitarray.readBits(iLog(j1 - i));
	//   78  133:aload_0         
	//   79  134:iload           5
	//   80  136:iload_1         
	//   81  137:isub            
	//   82  138:invokestatic    #55  <Method int iLog(int)>
	//   83  141:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   84  144:istore          6
					for(int l = 0; l < k1 && i < al.length; l++)
	//*  85  146:iconst_0        
	//*  86  147:istore_3        
	//*  87  148:iload_3         
	//*  88  149:iload           6
	//*  89  151:icmpge          178
	//*  90  154:iload_1         
	//*  91  155:aload           11
	//*  92  157:arraylength     
	//*  93  158:icmpge          178
					{
						al[i] = j;
	//   94  161:aload           11
	//   95  163:iload_1         
	//   96  164:iload_2         
	//   97  165:i2l             
	//   98  166:lastore         
						i++;
	//   99  167:iload_1         
	//  100  168:iconst_1        
	//  101  169:iadd            
	//  102  170:istore_1        
					}

	//  103  171:iload_3         
	//  104  172:iconst_1        
	//  105  173:iadd            
	//  106  174:istore_3        
	//* 107  175:goto            148
					j++;
	//  108  178:iload_2         
	//  109  179:iconst_1        
	//  110  180:iadd            
	//  111  181:istore_2        
				}

			}
	//* 112  182:goto            126
			i = vorbisbitarray.readBits(4);
	//  113  185:aload_0         
	//  114  186:iconst_4        
	//  115  187:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//  116  190:istore_1        
			if(i <= 2)
	//* 117  191:iload_1         
	//* 118  192:iconst_2        
	//* 119  193:icmpgt          290
			{
				if(i == 1 || i == 2)
	//* 120  196:iload_1         
	//* 121  197:iconst_1        
	//* 122  198:icmpeq          206
	//* 123  201:iload_1         
	//* 124  202:iconst_2        
	//* 125  203:icmpne          273
				{
					vorbisbitarray.skipBits(32);
	//  126  206:aload_0         
	//  127  207:bipush          32
	//  128  209:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
					vorbisbitarray.skipBits(32);
	//  129  212:aload_0         
	//  130  213:bipush          32
	//  131  215:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
					int k = vorbisbitarray.readBits(4);
	//  132  218:aload_0         
	//  133  219:iconst_4        
	//  134  220:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//  135  223:istore_2        
					vorbisbitarray.skipBits(1);
	//  136  224:aload_0         
	//  137  225:iconst_1        
	//  138  226:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
					if(i == 1)
	//* 139  229:iload_1         
	//* 140  230:iconst_1        
	//* 141  231:icmpne          253
					{
						if(i1 != 0)
	//* 142  234:iload           4
	//* 143  236:ifeq            261
							l1 = mapType1QuantValues(j1, i1);
	//  144  239:iload           5
	//  145  241:i2l             
	//  146  242:iload           4
	//  147  244:i2l             
	//  148  245:invokestatic    #61  <Method long mapType1QuantValues(long, long)>
	//  149  248:lstore          9
					} else
	//* 150  250:goto            261
					{
						l1 = j1 * i1;
	//  151  253:iload           5
	//  152  255:iload           4
	//  153  257:imul            
	//  154  258:i2l             
	//  155  259:lstore          9
					}
					vorbisbitarray.skipBits((int)(l1 * (long)(k + 1)));
	//  156  261:aload_0         
	//  157  262:lload           9
	//  158  264:iload_2         
	//  159  265:iconst_1        
	//  160  266:iadd            
	//  161  267:i2l             
	//  162  268:lmul            
	//  163  269:l2i             
	//  164  270:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				}
				return new CodeBook(i1, j1, al, i, flag);
	//  165  273:new             #6   <Class VorbisUtil$CodeBook>
	//  166  276:dup             
	//  167  277:iload           4
	//  168  279:iload           5
	//  169  281:aload           11
	//  170  283:iload_1         
	//  171  284:iload           7
	//  172  286:invokespecial   #64  <Method void VorbisUtil$CodeBook(int, int, long[], int, boolean)>
	//  173  289:areturn         
			} else
			{
				vorbisbitarray = ((VorbisBitArray) (new StringBuilder()));
	//  174  290:new             #66  <Class StringBuilder>
	//  175  293:dup             
	//  176  294:invokespecial   #67  <Method void StringBuilder()>
	//  177  297:astore_0        
				((StringBuilder) (vorbisbitarray)).append("lookup type greater than 2 not decodable: ");
	//  178  298:aload_0         
	//  179  299:ldc1            #69  <String "lookup type greater than 2 not decodable: ">
	//  180  301:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  181  304:pop             
				((StringBuilder) (vorbisbitarray)).append(i);
	//  182  305:aload_0         
	//  183  306:iload_1         
	//  184  307:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//  185  310:pop             
				throw new ParserException(((StringBuilder) (vorbisbitarray)).toString());
	//  186  311:new             #43  <Class ParserException>
	//  187  314:dup             
	//  188  315:aload_0         
	//  189  316:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  190  319:invokespecial   #83  <Method void ParserException(String)>
	//  191  322:athrow          
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  192  323:new             #66  <Class StringBuilder>
	//  193  326:dup             
	//  194  327:invokespecial   #67  <Method void StringBuilder()>
	//  195  330:astore          11
			stringbuilder.append("expected code book to start with [0x56, 0x43, 0x42] at ");
	//  196  332:aload           11
	//  197  334:ldc1            #85  <String "expected code book to start with [0x56, 0x43, 0x42] at ">
	//  198  336:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  199  339:pop             
			stringbuilder.append(vorbisbitarray.getPosition());
	//  200  340:aload           11
	//  201  342:aload_0         
	//  202  343:invokevirtual   #89  <Method int VorbisBitArray.getPosition()>
	//  203  346:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//  204  349:pop             
			throw new ParserException(stringbuilder.toString());
	//  205  350:new             #43  <Class ParserException>
	//  206  353:dup             
	//  207  354:aload           11
	//  208  356:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  209  359:invokespecial   #83  <Method void ParserException(String)>
	//  210  362:athrow          
		}
	}

	private static void readFloors(VorbisBitArray vorbisbitarray)
		throws ParserException
	{
		int l1 = vorbisbitarray.readBits(6);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//    3    6:istore          6
label0:
		for(int j = 0; j < l1 + 1; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload           6
	//*   8   13:iconst_1        
	//*   9   14:iadd            
	//*  10   15:icmpge          350
		{
			int i = vorbisbitarray.readBits(16);
	//   11   18:aload_0         
	//   12   19:bipush          16
	//   13   21:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   14   24:istore_1        
			int l;
			switch(i)
	//*  15   25:iload_1         
			{
	//*  16   26:tableswitch     0 1: default 48
	//	               0 285
	//	               1 81
			default:
				vorbisbitarray = ((VorbisBitArray) (new StringBuilder()));
	//   17   48:new             #66  <Class StringBuilder>
	//   18   51:dup             
	//   19   52:invokespecial   #67  <Method void StringBuilder()>
	//   20   55:astore_0        
				((StringBuilder) (vorbisbitarray)).append("floor type greater than 1 not decodable: ");
	//   21   56:aload_0         
	//   22   57:ldc1            #94  <String "floor type greater than 1 not decodable: ">
	//   23   59:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   24   62:pop             
				((StringBuilder) (vorbisbitarray)).append(i);
	//   25   63:aload_0         
	//   26   64:iload_1         
	//   27   65:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//   28   68:pop             
				throw new ParserException(((StringBuilder) (vorbisbitarray)).toString());
	//   29   69:new             #43  <Class ParserException>
	//   30   72:dup             
	//   31   73:aload_0         
	//   32   74:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   33   77:invokespecial   #83  <Method void ParserException(String)>
	//   34   80:athrow          

			case 1: // '\001'
				int i2 = vorbisbitarray.readBits(5);
	//   35   81:aload_0         
	//   36   82:iconst_5        
	//   37   83:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   38   86:istore          7
				int ai[] = new int[i2];
	//   39   88:iload           7
	//   40   90:newarray        int[]
	//   41   92:astore          9
				int k = -1;
	//   42   94:iconst_m1       
	//   43   95:istore_3        
				for(i = 0; i < i2;)
	//*  44   96:iconst_0        
	//*  45   97:istore_1        
	//*  46   98:iload_1         
	//*  47   99:iload           7
	//*  48  101:icmpge          140
				{
					ai[i] = vorbisbitarray.readBits(4);
	//   49  104:aload           9
	//   50  106:iload_1         
	//   51  107:aload_0         
	//   52  108:iconst_4        
	//   53  109:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   54  112:iastore         
					int i1 = k;
	//   55  113:iload_3         
	//   56  114:istore          4
					if(ai[i] > k)
	//*  57  116:aload           9
	//*  58  118:iload_1         
	//*  59  119:iaload          
	//*  60  120:iload_3         
	//*  61  121:icmple          130
						i1 = ai[i];
	//   62  124:aload           9
	//   63  126:iload_1         
	//   64  127:iaload          
	//   65  128:istore          4
					i++;
	//   66  130:iload_1         
	//   67  131:iconst_1        
	//   68  132:iadd            
	//   69  133:istore_1        
					k = i1;
	//   70  134:iload           4
	//   71  136:istore_3        
				}

	//*  72  137:goto            98
				int ai1[] = new int[k + 1];
	//   73  140:iload_3         
	//   74  141:iconst_1        
	//   75  142:iadd            
	//   76  143:newarray        int[]
	//   77  145:astore          10
				for(i = 0; i < ai1.length; i++)
	//*  78  147:iconst_0        
	//*  79  148:istore_1        
	//*  80  149:iload_1         
	//*  81  150:aload           10
	//*  82  152:arraylength     
	//*  83  153:icmpge          215
				{
					ai1[i] = vorbisbitarray.readBits(3) + 1;
	//   84  156:aload           10
	//   85  158:iload_1         
	//   86  159:aload_0         
	//   87  160:iconst_3        
	//   88  161:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   89  164:iconst_1        
	//   90  165:iadd            
	//   91  166:iastore         
					int j1 = vorbisbitarray.readBits(2);
	//   92  167:aload_0         
	//   93  168:iconst_2        
	//   94  169:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   95  172:istore          4
					if(j1 > 0)
	//*  96  174:iload           4
	//*  97  176:ifle            185
						vorbisbitarray.skipBits(8);
	//   98  179:aload_0         
	//   99  180:bipush          8
	//  100  182:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
					for(k = 0; k < 1 << j1; k++)
	//* 101  185:iconst_0        
	//* 102  186:istore_3        
	//* 103  187:iload_3         
	//* 104  188:iconst_1        
	//* 105  189:iload           4
	//* 106  191:ishl            
	//* 107  192:icmpge          208
						vorbisbitarray.skipBits(8);
	//  108  195:aload_0         
	//  109  196:bipush          8
	//  110  198:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>

	//  111  201:iload_3         
	//  112  202:iconst_1        
	//  113  203:iadd            
	//  114  204:istore_3        
				}

	//  115  205:goto            187
	//  116  208:iload_1         
	//  117  209:iconst_1        
	//  118  210:iadd            
	//  119  211:istore_1        
	//* 120  212:goto            149
				vorbisbitarray.skipBits(2);
	//  121  215:aload_0         
	//  122  216:iconst_2        
	//  123  217:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				int j2 = vorbisbitarray.readBits(4);
	//  124  220:aload_0         
	//  125  221:iconst_4        
	//  126  222:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//  127  225:istore          8
				boolean flag = false;
	//  128  227:iconst_0        
	//  129  228:istore          4
				i = ((int) (flag));
	//  130  230:iload           4
	//  131  232:istore_1        
				k = i;
	//  132  233:iload_1         
	//  133  234:istore_3        
				int k1 = i;
	//  134  235:iload_1         
	//  135  236:istore          5
				i = ((int) (flag));
	//  136  238:iload           4
	//  137  240:istore_1        
				do
				{
					if(i >= i2)
						continue label0;
	//  138  241:iload_1         
	//  139  242:iload           7
	//  140  244:icmpge          343
					for(k1 += ai1[ai[i]]; k < k1; k++)
	//* 141  247:iload           5
	//* 142  249:aload           10
	//* 143  251:aload           9
	//* 144  253:iload_1         
	//* 145  254:iaload          
	//* 146  255:iaload          
	//* 147  256:iadd            
	//* 148  257:istore          5
	//* 149  259:iload_3         
	//* 150  260:iload           5
	//* 151  262:icmpge          278
						vorbisbitarray.skipBits(j2);
	//  152  265:aload_0         
	//  153  266:iload           8
	//  154  268:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>

	//  155  271:iload_3         
	//  156  272:iconst_1        
	//  157  273:iadd            
	//  158  274:istore_3        
	//* 159  275:goto            259
					i++;
	//  160  278:iload_1         
	//  161  279:iconst_1        
	//  162  280:iadd            
	//  163  281:istore_1        
				} while(true);
	//  164  282:goto            241

			case 0: // '\0'
				vorbisbitarray.skipBits(8);
	//  165  285:aload_0         
	//  166  286:bipush          8
	//  167  288:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(16);
	//  168  291:aload_0         
	//  169  292:bipush          16
	//  170  294:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(16);
	//  171  297:aload_0         
	//  172  298:bipush          16
	//  173  300:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(6);
	//  174  303:aload_0         
	//  175  304:bipush          6
	//  176  306:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(8);
	//  177  309:aload_0         
	//  178  310:bipush          8
	//  179  312:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				l = vorbisbitarray.readBits(4);
	//  180  315:aload_0         
	//  181  316:iconst_4        
	//  182  317:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//  183  320:istore_3        
				i = 0;
	//  184  321:iconst_0        
	//  185  322:istore_1        
				break;
			}
			for(; i < l + 1; i++)
	//* 186  323:iload_1         
	//* 187  324:iload_3         
	//* 188  325:iconst_1        
	//* 189  326:iadd            
	//* 190  327:icmpge          343
				vorbisbitarray.skipBits(8);
	//  191  330:aload_0         
	//  192  331:bipush          8
	//  193  333:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>

	//  194  336:iload_1         
	//  195  337:iconst_1        
	//  196  338:iadd            
	//  197  339:istore_1        
		}

	//  198  340:goto            323
	//  199  343:iload_2         
	//  200  344:iconst_1        
	//  201  345:iadd            
	//  202  346:istore_2        
	//* 203  347:goto            10
	//  204  350:return          
	}

	private static void readMappings(int i, VorbisBitArray vorbisbitarray)
		throws ParserException
	{
label0:
		{
			int l1 = vorbisbitarray.readBits(6);
	//    0    0:aload_1         
	//    1    1:bipush          6
	//    2    3:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//    3    6:istore          5
			int j = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
			do
			{
				if(j >= l1 + 1)
					break label0;
	//    6   10:iload_2         
	//    7   11:iload           5
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:icmpge          235
				int k = vorbisbitarray.readBits(16);
	//   11   18:aload_1         
	//   12   19:bipush          16
	//   13   21:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   14   24:istore_3        
				if(k != 0)
	//*  15   25:iload_3         
	//*  16   26:ifeq            67
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   17   29:new             #66  <Class StringBuilder>
	//   18   32:dup             
	//   19   33:invokespecial   #67  <Method void StringBuilder()>
	//   20   36:astore          8
					stringbuilder.append("mapping type other than 0 not supported: ");
	//   21   38:aload           8
	//   22   40:ldc1            #98  <String "mapping type other than 0 not supported: ">
	//   23   42:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
					stringbuilder.append(k);
	//   25   46:aload           8
	//   26   48:iload_3         
	//   27   49:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//   28   52:pop             
					Log.e("VorbisUtil", stringbuilder.toString());
	//   29   53:ldc1            #20  <String "VorbisUtil">
	//   30   55:aload           8
	//   31   57:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   32   60:invokestatic    #104 <Method int Log.e(String, String)>
	//   33   63:pop             
				} else
	//*  34   64:goto            218
				{
					int l;
					if(vorbisbitarray.readBit())
	//*  35   67:aload_1         
	//*  36   68:invokevirtual   #53  <Method boolean VorbisBitArray.readBit()>
	//*  37   71:ifeq            85
						l = vorbisbitarray.readBits(4) + 1;
	//   38   74:aload_1         
	//   39   75:iconst_4        
	//   40   76:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   41   79:iconst_1        
	//   42   80:iadd            
	//   43   81:istore_3        
					else
	//*  44   82:goto            87
						l = 1;
	//   45   85:iconst_1        
	//   46   86:istore_3        
					if(vorbisbitarray.readBit())
	//*  47   87:aload_1         
	//*  48   88:invokevirtual   #53  <Method boolean VorbisBitArray.readBit()>
	//*  49   91:ifeq            146
					{
						int i2 = vorbisbitarray.readBits(8);
	//   50   94:aload_1         
	//   51   95:bipush          8
	//   52   97:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   53  100:istore          6
						for(int i1 = 0; i1 < i2 + 1; i1++)
	//*  54  102:iconst_0        
	//*  55  103:istore          4
	//*  56  105:iload           4
	//*  57  107:iload           6
	//*  58  109:iconst_1        
	//*  59  110:iadd            
	//*  60  111:icmpge          146
						{
							int j2 = i - 1;
	//   61  114:iload_0         
	//   62  115:iconst_1        
	//   63  116:isub            
	//   64  117:istore          7
							vorbisbitarray.skipBits(iLog(j2));
	//   65  119:aload_1         
	//   66  120:iload           7
	//   67  122:invokestatic    #55  <Method int iLog(int)>
	//   68  125:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
							vorbisbitarray.skipBits(iLog(j2));
	//   69  128:aload_1         
	//   70  129:iload           7
	//   71  131:invokestatic    #55  <Method int iLog(int)>
	//   72  134:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
						}

	//   73  137:iload           4
	//   74  139:iconst_1        
	//   75  140:iadd            
	//   76  141:istore          4
					}
	//*  77  143:goto            105
					if(vorbisbitarray.readBits(2) != 0)
						break;
	//   78  146:aload_1         
	//   79  147:iconst_2        
	//   80  148:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   81  151:ifne            225
					if(l > 1)
	//*  82  154:iload_3         
	//*  83  155:iconst_1        
	//*  84  156:icmple          182
					{
						for(int j1 = 0; j1 < i; j1++)
	//*  85  159:iconst_0        
	//*  86  160:istore          4
	//*  87  162:iload           4
	//*  88  164:iload_0         
	//*  89  165:icmpge          182
							vorbisbitarray.skipBits(4);
	//   90  168:aload_1         
	//   91  169:iconst_4        
	//   92  170:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>

	//   93  173:iload           4
	//   94  175:iconst_1        
	//   95  176:iadd            
	//   96  177:istore          4
					}
	//*  97  179:goto            162
					for(int k1 = 0; k1 < l; k1++)
	//*  98  182:iconst_0        
	//*  99  183:istore          4
	//* 100  185:iload           4
	//* 101  187:iload_3         
	//* 102  188:icmpge          218
					{
						vorbisbitarray.skipBits(8);
	//  103  191:aload_1         
	//  104  192:bipush          8
	//  105  194:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
						vorbisbitarray.skipBits(8);
	//  106  197:aload_1         
	//  107  198:bipush          8
	//  108  200:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
						vorbisbitarray.skipBits(8);
	//  109  203:aload_1         
	//  110  204:bipush          8
	//  111  206:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
					}

	//  112  209:iload           4
	//  113  211:iconst_1        
	//  114  212:iadd            
	//  115  213:istore          4
				}
	//* 116  215:goto            185
				j++;
	//  117  218:iload_2         
	//  118  219:iconst_1        
	//  119  220:iadd            
	//  120  221:istore_2        
			} while(true);
	//  121  222:goto            10
			throw new ParserException("to reserved bits must be zero after mapping coupling steps");
	//  122  225:new             #43  <Class ParserException>
	//  123  228:dup             
	//  124  229:ldc1            #106 <String "to reserved bits must be zero after mapping coupling steps">
	//  125  231:invokespecial   #83  <Method void ParserException(String)>
	//  126  234:athrow          
		}
	//  127  235:return          
	}

	private static Mode[] readModes(VorbisBitArray vorbisbitarray)
	{
		int j = vorbisbitarray.readBits(6) + 1;
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//    3    6:iconst_1        
	//    4    7:iadd            
	//    5    8:istore_2        
		Mode amode[] = new Mode[j];
	//    6    9:iload_2         
	//    7   10:anewarray       Mode[]
	//    8   13:astore_3        
		for(int i = 0; i < j; i++)
	//*   9   14:iconst_0        
	//*  10   15:istore_1        
	//*  11   16:iload_1         
	//*  12   17:iload_2         
	//*  13   18:icmpge          60
			amode[i] = new Mode(vorbisbitarray.readBit(), vorbisbitarray.readBits(16), vorbisbitarray.readBits(16), vorbisbitarray.readBits(8));
	//   14   21:aload_3         
	//   15   22:iload_1         
	//   16   23:new             #12  <Class VorbisUtil$Mode>
	//   17   26:dup             
	//   18   27:aload_0         
	//   19   28:invokevirtual   #53  <Method boolean VorbisBitArray.readBit()>
	//   20   31:aload_0         
	//   21   32:bipush          16
	//   22   34:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   23   37:aload_0         
	//   24   38:bipush          16
	//   25   40:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   26   43:aload_0         
	//   27   44:bipush          8
	//   28   46:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   29   49:invokespecial   #111 <Method void VorbisUtil$Mode(boolean, int, int, int)>
	//   30   52:aastore         

	//   31   53:iload_1         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:istore_1        
	//*  35   57:goto            16
		return amode;
	//   36   60:aload_3         
	//   37   61:areturn         
	}

	private static void readResidues(VorbisBitArray vorbisbitarray)
		throws ParserException
	{
		int j1 = vorbisbitarray.readBits(6);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//    3    6:istore          4
		for(int i = 0; i < j1 + 1;)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload           4
	//*   8   13:iconst_1        
	//*   9   14:iadd            
	//*  10   15:icmpge          183
			if(vorbisbitarray.readBits(16) <= 2)
	//*  11   18:aload_0         
	//*  12   19:bipush          16
	//*  13   21:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//*  14   24:iconst_2        
	//*  15   25:icmpgt          173
			{
				vorbisbitarray.skipBits(24);
	//   16   28:aload_0         
	//   17   29:bipush          24
	//   18   31:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(24);
	//   19   34:aload_0         
	//   20   35:bipush          24
	//   21   37:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(24);
	//   22   40:aload_0         
	//   23   41:bipush          24
	//   24   43:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				int k1 = vorbisbitarray.readBits(6) + 1;
	//   25   46:aload_0         
	//   26   47:bipush          6
	//   27   49:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:istore          5
				vorbisbitarray.skipBits(8);
	//   31   56:aload_0         
	//   32   57:bipush          8
	//   33   59:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
				int ai[] = new int[k1];
	//   34   62:iload           5
	//   35   64:newarray        int[]
	//   36   66:astore          7
				for(int j = 0; j < k1; j++)
	//*  37   68:iconst_0        
	//*  38   69:istore_2        
	//*  39   70:iload_2         
	//*  40   71:iload           5
	//*  41   73:icmpge          119
				{
					int l1 = vorbisbitarray.readBits(3);
	//   42   76:aload_0         
	//   43   77:iconst_3        
	//   44   78:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   45   81:istore          6
					int l;
					if(vorbisbitarray.readBit())
	//*  46   83:aload_0         
	//*  47   84:invokevirtual   #53  <Method boolean VorbisBitArray.readBit()>
	//*  48   87:ifeq            99
						l = vorbisbitarray.readBits(5);
	//   49   90:aload_0         
	//   50   91:iconst_5        
	//   51   92:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   52   95:istore_3        
					else
	//*  53   96:goto            101
						l = 0;
	//   54   99:iconst_0        
	//   55  100:istore_3        
					ai[j] = l * 8 + l1;
	//   56  101:aload           7
	//   57  103:iload_2         
	//   58  104:iload_3         
	//   59  105:bipush          8
	//   60  107:imul            
	//   61  108:iload           6
	//   62  110:iadd            
	//   63  111:iastore         
				}

	//   64  112:iload_2         
	//   65  113:iconst_1        
	//   66  114:iadd            
	//   67  115:istore_2        
	//*  68  116:goto            70
				for(int k = 0; k < k1; k++)
	//*  69  119:iconst_0        
	//*  70  120:istore_2        
	//*  71  121:iload_2         
	//*  72  122:iload           5
	//*  73  124:icmpge          166
				{
					for(int i1 = 0; i1 < 8; i1++)
	//*  74  127:iconst_0        
	//*  75  128:istore_3        
	//*  76  129:iload_3         
	//*  77  130:bipush          8
	//*  78  132:icmpge          159
						if((ai[k] & 1 << i1) != 0)
	//*  79  135:aload           7
	//*  80  137:iload_2         
	//*  81  138:iaload          
	//*  82  139:iconst_1        
	//*  83  140:iload_3         
	//*  84  141:ishl            
	//*  85  142:iand            
	//*  86  143:ifeq            152
							vorbisbitarray.skipBits(8);
	//   87  146:aload_0         
	//   88  147:bipush          8
	//   89  149:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>

	//   90  152:iload_3         
	//   91  153:iconst_1        
	//   92  154:iadd            
	//   93  155:istore_3        
				}

	//   94  156:goto            129
	//   95  159:iload_2         
	//   96  160:iconst_1        
	//   97  161:iadd            
	//   98  162:istore_2        
	//*  99  163:goto            121
				i++;
	//  100  166:iload_1         
	//  101  167:iconst_1        
	//  102  168:iadd            
	//  103  169:istore_1        
			} else
	//* 104  170:goto            10
			{
				throw new ParserException("residueType greater than 2 is not decodable");
	//  105  173:new             #43  <Class ParserException>
	//  106  176:dup             
	//  107  177:ldc1            #114 <String "residueType greater than 2 is not decodable">
	//  108  179:invokespecial   #83  <Method void ParserException(String)>
	//  109  182:athrow          
			}

	//  110  183:return          
	}

	public static CommentHeader readVorbisCommentHeader(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		verifyVorbisHeaderCapturePattern(3, parsablebytearray, false);
	//    2    2:iconst_3        
	//    3    3:aload_0         
	//    4    4:iconst_0        
	//    5    5:invokestatic    #120 <Method boolean verifyVorbisHeaderCapturePattern(int, ParsableByteArray, boolean)>
	//    6    8:pop             
		String s = parsablebytearray.readString((int)parsablebytearray.readLittleEndianUnsignedInt());
	//    7    9:aload_0         
	//    8   10:aload_0         
	//    9   11:invokevirtual   #126 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   10   14:l2i             
	//   11   15:invokevirtual   #130 <Method String ParsableByteArray.readString(int)>
	//   12   18:astore          5
		int j = s.length();
	//   13   20:aload           5
	//   14   22:invokevirtual   #135 <Method int String.length()>
	//   15   25:istore_2        
		long l = parsablebytearray.readLittleEndianUnsignedInt();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #126 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   18   30:lstore_3        
		String as[] = new String[(int)l];
	//   19   31:lload_3         
	//   20   32:l2i             
	//   21   33:anewarray       String[]
	//   22   36:astore          6
		j = 11 + j + 4;
	//   23   38:bipush          11
	//   24   40:iload_2         
	//   25   41:iadd            
	//   26   42:iconst_4        
	//   27   43:iadd            
	//   28   44:istore_2        
		for(; (long)i < l; i++)
	//*  29   45:iload_1         
	//*  30   46:i2l             
	//*  31   47:lload_3         
	//*  32   48:lcmp            
	//*  33   49:ifge            84
		{
			as[i] = parsablebytearray.readString((int)parsablebytearray.readLittleEndianUnsignedInt());
	//   34   52:aload           6
	//   35   54:iload_1         
	//   36   55:aload_0         
	//   37   56:aload_0         
	//   38   57:invokevirtual   #126 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   39   60:l2i             
	//   40   61:invokevirtual   #130 <Method String ParsableByteArray.readString(int)>
	//   41   64:aastore         
			j = j + 4 + as[i].length();
	//   42   65:iload_2         
	//   43   66:iconst_4        
	//   44   67:iadd            
	//   45   68:aload           6
	//   46   70:iload_1         
	//   47   71:aaload          
	//   48   72:invokevirtual   #135 <Method int String.length()>
	//   49   75:iadd            
	//   50   76:istore_2        
		}

	//   51   77:iload_1         
	//   52   78:iconst_1        
	//   53   79:iadd            
	//   54   80:istore_1        
	//*  55   81:goto            45
		if((parsablebytearray.readUnsignedByte() & 1) != 0)
	//*  56   84:aload_0         
	//*  57   85:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  58   88:iconst_1        
	//*  59   89:iand            
	//*  60   90:ifeq            108
			return new CommentHeader(s, as, j + 1);
	//   61   93:new             #9   <Class VorbisUtil$CommentHeader>
	//   62   96:dup             
	//   63   97:aload           5
	//   64   99:aload           6
	//   65  101:iload_2         
	//   66  102:iconst_1        
	//   67  103:iadd            
	//   68  104:invokespecial   #141 <Method void VorbisUtil$CommentHeader(String, String[], int)>
	//   69  107:areturn         
		else
			throw new ParserException("framing bit expected to be set");
	//   70  108:new             #43  <Class ParserException>
	//   71  111:dup             
	//   72  112:ldc1            #143 <String "framing bit expected to be set">
	//   73  114:invokespecial   #83  <Method void ParserException(String)>
	//   74  117:athrow          
	}

	public static VorbisIdHeader readVorbisIdentificationHeader(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		verifyVorbisHeaderCapturePattern(1, parsablebytearray, false);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #120 <Method boolean verifyVorbisHeaderCapturePattern(int, ParsableByteArray, boolean)>
	//    4    6:pop             
		long l1 = parsablebytearray.readLittleEndianUnsignedInt();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #126 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//    7   11:lstore          7
		int i = parsablebytearray.readUnsignedByte();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//   10   17:istore_1        
		long l2 = parsablebytearray.readLittleEndianUnsignedInt();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #126 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
	//   13   22:lstore          9
		int j = parsablebytearray.readLittleEndianInt();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #148 <Method int ParsableByteArray.readLittleEndianInt()>
	//   16   28:istore_2        
		int k = parsablebytearray.readLittleEndianInt();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #148 <Method int ParsableByteArray.readLittleEndianInt()>
	//   19   33:istore_3        
		int l = parsablebytearray.readLittleEndianInt();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #148 <Method int ParsableByteArray.readLittleEndianInt()>
	//   22   38:istore          4
		int j1 = parsablebytearray.readUnsignedByte();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//   25   44:istore          6
		int i1 = (int)Math.pow(2D, j1 & 0xf);
	//   26   46:ldc2w           #149 <Double 2D>
	//   27   49:iload           6
	//   28   51:bipush          15
	//   29   53:iand            
	//   30   54:i2d             
	//   31   55:invokestatic    #35  <Method double Math.pow(double, double)>
	//   32   58:d2i             
	//   33   59:istore          5
		j1 = (int)Math.pow(2D, (j1 & 0xf0) >> 4);
	//   34   61:ldc2w           #149 <Double 2D>
	//   35   64:iload           6
	//   36   66:sipush          240
	//   37   69:iand            
	//   38   70:iconst_4        
	//   39   71:ishr            
	//   40   72:i2d             
	//   41   73:invokestatic    #35  <Method double Math.pow(double, double)>
	//   42   76:d2i             
	//   43   77:istore          6
		boolean flag;
		if((parsablebytearray.readUnsignedByte() & 1) > 0)
	//*  44   79:aload_0         
	//*  45   80:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  46   83:iconst_1        
	//*  47   84:iand            
	//*  48   85:ifle            94
			flag = true;
	//   49   88:iconst_1        
	//   50   89:istore          11
		else
	//*  51   91:goto            97
			flag = false;
	//   52   94:iconst_0        
	//   53   95:istore          11
		return new VorbisIdHeader(l1, i, l2, j, k, l, i1, j1, flag, Arrays.copyOf(parsablebytearray.data, parsablebytearray.limit()));
	//   54   97:new             #15  <Class VorbisUtil$VorbisIdHeader>
	//   55  100:dup             
	//   56  101:lload           7
	//   57  103:iload_1         
	//   58  104:lload           9
	//   59  106:iload_2         
	//   60  107:iload_3         
	//   61  108:iload           4
	//   62  110:iload           5
	//   63  112:iload           6
	//   64  114:iload           11
	//   65  116:aload_0         
	//   66  117:getfield        #154 <Field byte[] ParsableByteArray.data>
	//   67  120:aload_0         
	//   68  121:invokevirtual   #157 <Method int ParsableByteArray.limit()>
	//   69  124:invokestatic    #163 <Method byte[] Arrays.copyOf(byte[], int)>
	//   70  127:invokespecial   #166 <Method void VorbisUtil$VorbisIdHeader(long, int, long, int, int, int, int, int, boolean, byte[])>
	//   71  130:areturn         
	}

	public static Mode[] readVorbisModes(ParsableByteArray parsablebytearray, int i)
		throws ParserException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		verifyVorbisHeaderCapturePattern(5, parsablebytearray, false);
	//    2    2:iconst_5        
	//    3    3:aload_0         
	//    4    4:iconst_0        
	//    5    5:invokestatic    #120 <Method boolean verifyVorbisHeaderCapturePattern(int, ParsableByteArray, boolean)>
	//    6    8:pop             
		int l = parsablebytearray.readUnsignedByte();
	//    7    9:aload_0         
	//    8   10:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//    9   13:istore          4
		VorbisBitArray vorbisbitarray = new VorbisBitArray(parsablebytearray.data);
	//   10   15:new             #45  <Class VorbisBitArray>
	//   11   18:dup             
	//   12   19:aload_0         
	//   13   20:getfield        #154 <Field byte[] ParsableByteArray.data>
	//   14   23:invokespecial   #171 <Method void VorbisBitArray(byte[])>
	//   15   26:astore          5
		vorbisbitarray.skipBits(parsablebytearray.getPosition() * 8);
	//   16   28:aload           5
	//   17   30:aload_0         
	//   18   31:invokevirtual   #172 <Method int ParsableByteArray.getPosition()>
	//   19   34:bipush          8
	//   20   36:imul            
	//   21   37:invokevirtual   #59  <Method void VorbisBitArray.skipBits(int)>
		for(int j = 0; j < l + 1; j++)
	//*  22   40:iconst_0        
	//*  23   41:istore_2        
	//*  24   42:iload_2         
	//*  25   43:iload           4
	//*  26   45:iconst_1        
	//*  27   46:iadd            
	//*  28   47:icmpge          63
			readBook(vorbisbitarray);
	//   29   50:aload           5
	//   30   52:invokestatic    #174 <Method VorbisUtil$CodeBook readBook(VorbisBitArray)>
	//   31   55:pop             

	//   32   56:iload_2         
	//   33   57:iconst_1        
	//   34   58:iadd            
	//   35   59:istore_2        
	//*  36   60:goto            42
		l = vorbisbitarray.readBits(6);
	//   37   63:aload           5
	//   38   65:bipush          6
	//   39   67:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   40   70:istore          4
		for(int k = ((int) (flag)); k < l + 1;)
	//*  41   72:iload_3         
	//*  42   73:istore_2        
	//*  43   74:iload_2         
	//*  44   75:iload           4
	//*  45   77:iconst_1        
	//*  46   78:iadd            
	//*  47   79:icmpge          109
			if(vorbisbitarray.readBits(16) == 0)
	//*  48   82:aload           5
	//*  49   84:bipush          16
	//*  50   86:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//*  51   89:ifne            99
				k++;
	//   52   92:iload_2         
	//   53   93:iconst_1        
	//   54   94:iadd            
	//   55   95:istore_2        
			else
	//*  56   96:goto            74
				throw new ParserException("placeholder of time domain transforms not zeroed out");
	//   57   99:new             #43  <Class ParserException>
	//   58  102:dup             
	//   59  103:ldc1            #176 <String "placeholder of time domain transforms not zeroed out">
	//   60  105:invokespecial   #83  <Method void ParserException(String)>
	//   61  108:athrow          

		readFloors(vorbisbitarray);
	//   62  109:aload           5
	//   63  111:invokestatic    #178 <Method void readFloors(VorbisBitArray)>
		readResidues(vorbisbitarray);
	//   64  114:aload           5
	//   65  116:invokestatic    #180 <Method void readResidues(VorbisBitArray)>
		readMappings(i, vorbisbitarray);
	//   66  119:iload_1         
	//   67  120:aload           5
	//   68  122:invokestatic    #182 <Method void readMappings(int, VorbisBitArray)>
		parsablebytearray = ((ParsableByteArray) (readModes(vorbisbitarray)));
	//   69  125:aload           5
	//   70  127:invokestatic    #184 <Method VorbisUtil$Mode[] readModes(VorbisBitArray)>
	//   71  130:astore_0        
		if(vorbisbitarray.readBit())
	//*  72  131:aload           5
	//*  73  133:invokevirtual   #53  <Method boolean VorbisBitArray.readBit()>
	//*  74  136:ifeq            141
			return ((Mode []) (parsablebytearray));
	//   75  139:aload_0         
	//   76  140:areturn         
		else
			throw new ParserException("framing bit after modes not set as expected");
	//   77  141:new             #43  <Class ParserException>
	//   78  144:dup             
	//   79  145:ldc1            #186 <String "framing bit after modes not set as expected">
	//   80  147:invokespecial   #83  <Method void ParserException(String)>
	//   81  150:athrow          
	}

	public static boolean verifyVorbisHeaderCapturePattern(int i, ParsableByteArray parsablebytearray, boolean flag)
		throws ParserException
	{
		if(parsablebytearray.readUnsignedByte() != i)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*   2    4:iload_0         
	//*   3    5:icmpeq          50
			if(flag)
	//*   4    8:iload_2         
	//*   5    9:ifeq            14
			{
				return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
			} else
			{
				parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//    8   14:new             #66  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #67  <Method void StringBuilder()>
	//   11   21:astore_1        
				((StringBuilder) (parsablebytearray)).append("expected header type ");
	//   12   22:aload_1         
	//   13   23:ldc1            #188 <String "expected header type ">
	//   14   25:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
				((StringBuilder) (parsablebytearray)).append(Integer.toHexString(i));
	//   16   29:aload_1         
	//   17   30:iload_0         
	//   18   31:invokestatic    #193 <Method String Integer.toHexString(int)>
	//   19   34:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
				throw new ParserException(((StringBuilder) (parsablebytearray)).toString());
	//   21   38:new             #43  <Class ParserException>
	//   22   41:dup             
	//   23   42:aload_1         
	//   24   43:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   25   46:invokespecial   #83  <Method void ParserException(String)>
	//   26   49:athrow          
			}
		if(parsablebytearray.readUnsignedByte() == 118 && parsablebytearray.readUnsignedByte() == 111 && parsablebytearray.readUnsignedByte() == 114 && parsablebytearray.readUnsignedByte() == 98 && parsablebytearray.readUnsignedByte() == 105 && parsablebytearray.readUnsignedByte() == 115)
	//*  27   50:aload_1         
	//*  28   51:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  29   54:bipush          118
	//*  30   56:icmpne          109
	//*  31   59:aload_1         
	//*  32   60:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  33   63:bipush          111
	//*  34   65:icmpne          109
	//*  35   68:aload_1         
	//*  36   69:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  37   72:bipush          114
	//*  38   74:icmpne          109
	//*  39   77:aload_1         
	//*  40   78:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  41   81:bipush          98
	//*  42   83:icmpne          109
	//*  43   86:aload_1         
	//*  44   87:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  45   90:bipush          105
	//*  46   92:icmpne          109
	//*  47   95:aload_1         
	//*  48   96:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  49   99:bipush          115
	//*  50  101:icmpeq          107
	//*  51  104:goto            109
			return true;
	//   52  107:iconst_1        
	//   53  108:ireturn         
		if(flag)
	//*  54  109:iload_2         
	//*  55  110:ifeq            115
			return false;
	//   56  113:iconst_0        
	//   57  114:ireturn         
		else
			throw new ParserException("expected characters 'vorbis'");
	//   58  115:new             #43  <Class ParserException>
	//   59  118:dup             
	//   60  119:ldc1            #195 <String "expected characters 'vorbis'">
	//   61  121:invokespecial   #83  <Method void ParserException(String)>
	//   62  124:athrow          
	}

	private static final String TAG = "VorbisUtil";
}
