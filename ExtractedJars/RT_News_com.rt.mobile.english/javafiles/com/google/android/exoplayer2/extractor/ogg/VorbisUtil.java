// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
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
			if(bitrateNominal == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field int bitrateNominal>
		//*   2    4:ifne            19
				return (bitrateMin + bitrateMax) / 2;
		//    3    7:aload_0         
		//    4    8:getfield        #38  <Field int bitrateMin>
		//    5   11:aload_0         
		//    6   12:getfield        #34  <Field int bitrateMax>
		//    7   15:iadd            
		//    8   16:iconst_2        
		//    9   17:idiv            
		//   10   18:ireturn         
			else
				return bitrateNominal;
		//   11   19:aload_0         
		//   12   20:getfield        #36  <Field int bitrateNominal>
		//   13   23:ireturn         
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


	private VorbisUtil()
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
		if(vorbisbitarray.readBits(24) != 0x564342)
	//*   0    0:aload_0         
	//*   1    1:bipush          24
	//*   2    3:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//*   3    6:ldc1            #49  <Int 0x564342>
	//*   4    8:icmpeq          51
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #51  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #52  <Method void StringBuilder()>
	//    8   18:astore          11
			stringbuilder.append("expected code book to start with [0x56, 0x43, 0x42] at ");
	//    9   20:aload           11
	//   10   22:ldc1            #54  <String "expected code book to start with [0x56, 0x43, 0x42] at ">
	//   11   24:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
			stringbuilder.append(vorbisbitarray.getPosition());
	//   13   28:aload           11
	//   14   30:aload_0         
	//   15   31:invokevirtual   #62  <Method int VorbisBitArray.getPosition()>
	//   16   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   17   37:pop             
			throw new ParserException(stringbuilder.toString());
	//   18   38:new             #43  <Class ParserException>
	//   19   41:dup             
	//   20   42:aload           11
	//   21   44:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   22   47:invokespecial   #72  <Method void ParserException(String)>
	//   23   50:athrow          
		}
		int i1 = vorbisbitarray.readBits(16);
	//   24   51:aload_0         
	//   25   52:bipush          16
	//   26   54:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   27   57:istore          4
		int j1 = vorbisbitarray.readBits(24);
	//   28   59:aload_0         
	//   29   60:bipush          24
	//   30   62:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   31   65:istore          5
		long al[] = new long[j1];
	//   32   67:iload           5
	//   33   69:newarray        long[]
	//   34   71:astore          11
		boolean flag = vorbisbitarray.readBit();
	//   35   73:aload_0         
	//   36   74:invokevirtual   #76  <Method boolean VorbisBitArray.readBit()>
	//   37   77:istore          7
		long l1 = 0L;
	//   38   79:lconst_0        
	//   39   80:lstore          9
		int i = 0;
	//   40   82:iconst_0        
	//   41   83:istore_1        
		if(!flag)
	//*  42   84:iload           7
	//*  43   86:ifne            156
		{
			boolean flag1 = vorbisbitarray.readBit();
	//   44   89:aload_0         
	//   45   90:invokevirtual   #76  <Method boolean VorbisBitArray.readBit()>
	//   46   93:istore          8
			for(; i < al.length; i++)
	//*  47   95:iload_1         
	//*  48   96:aload           11
	//*  49   98:arraylength     
	//*  50   99:icmpge          225
				if(flag1)
	//*  51  102:iload           8
	//*  52  104:ifeq            137
				{
					if(vorbisbitarray.readBit())
	//*  53  107:aload_0         
	//*  54  108:invokevirtual   #76  <Method boolean VorbisBitArray.readBit()>
	//*  55  111:ifeq            129
						al[i] = vorbisbitarray.readBits(5) + 1;
	//   56  114:aload           11
	//   57  116:iload_1         
	//   58  117:aload_0         
	//   59  118:iconst_5        
	//   60  119:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   61  122:iconst_1        
	//   62  123:iadd            
	//   63  124:i2l             
	//   64  125:lastore         
					else
	//*  65  126:goto            149
						al[i] = 0L;
	//   66  129:aload           11
	//   67  131:iload_1         
	//   68  132:lconst_0        
	//   69  133:lastore         
				} else
	//*  70  134:goto            149
				{
					al[i] = vorbisbitarray.readBits(5) + 1;
	//   71  137:aload           11
	//   72  139:iload_1         
	//   73  140:aload_0         
	//   74  141:iconst_5        
	//   75  142:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   76  145:iconst_1        
	//   77  146:iadd            
	//   78  147:i2l             
	//   79  148:lastore         
				}

	//   80  149:iload_1         
	//   81  150:iconst_1        
	//   82  151:iadd            
	//   83  152:istore_1        
		} else
	//*  84  153:goto            95
		{
			int j = vorbisbitarray.readBits(5) + 1;
	//   85  156:aload_0         
	//   86  157:iconst_5        
	//   87  158:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   88  161:iconst_1        
	//   89  162:iadd            
	//   90  163:istore_2        
			for(i = 0; i < al.length;)
	//*  91  164:iconst_0        
	//*  92  165:istore_1        
	//*  93  166:iload_1         
	//*  94  167:aload           11
	//*  95  169:arraylength     
	//*  96  170:icmpge          225
			{
				int k1 = vorbisbitarray.readBits(iLog(j1 - i));
	//   97  173:aload_0         
	//   98  174:iload           5
	//   99  176:iload_1         
	//  100  177:isub            
	//  101  178:invokestatic    #78  <Method int iLog(int)>
	//  102  181:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//  103  184:istore          6
				for(int l = 0; l < k1 && i < al.length; l++)
	//* 104  186:iconst_0        
	//* 105  187:istore_3        
	//* 106  188:iload_3         
	//* 107  189:iload           6
	//* 108  191:icmpge          218
	//* 109  194:iload_1         
	//* 110  195:aload           11
	//* 111  197:arraylength     
	//* 112  198:icmpge          218
				{
					al[i] = j;
	//  113  201:aload           11
	//  114  203:iload_1         
	//  115  204:iload_2         
	//  116  205:i2l             
	//  117  206:lastore         
					i++;
	//  118  207:iload_1         
	//  119  208:iconst_1        
	//  120  209:iadd            
	//  121  210:istore_1        
				}

	//  122  211:iload_3         
	//  123  212:iconst_1        
	//  124  213:iadd            
	//  125  214:istore_3        
	//* 126  215:goto            188
				j++;
	//  127  218:iload_2         
	//  128  219:iconst_1        
	//  129  220:iadd            
	//  130  221:istore_2        
			}

		}
	//* 131  222:goto            166
		i = vorbisbitarray.readBits(4);
	//  132  225:aload_0         
	//  133  226:iconst_4        
	//  134  227:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//  135  230:istore_1        
		if(i > 2)
	//* 136  231:iload_1         
	//* 137  232:iconst_2        
	//* 138  233:icmple          269
		{
			vorbisbitarray = ((VorbisBitArray) (new StringBuilder()));
	//  139  236:new             #51  <Class StringBuilder>
	//  140  239:dup             
	//  141  240:invokespecial   #52  <Method void StringBuilder()>
	//  142  243:astore_0        
			((StringBuilder) (vorbisbitarray)).append("lookup type greater than 2 not decodable: ");
	//  143  244:aload_0         
	//  144  245:ldc1            #80  <String "lookup type greater than 2 not decodable: ">
	//  145  247:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//  146  250:pop             
			((StringBuilder) (vorbisbitarray)).append(i);
	//  147  251:aload_0         
	//  148  252:iload_1         
	//  149  253:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//  150  256:pop             
			throw new ParserException(((StringBuilder) (vorbisbitarray)).toString());
	//  151  257:new             #43  <Class ParserException>
	//  152  260:dup             
	//  153  261:aload_0         
	//  154  262:invokevirtual   #69  <Method String StringBuilder.toString()>
	//  155  265:invokespecial   #72  <Method void ParserException(String)>
	//  156  268:athrow          
		}
		if(i == 1 || i == 2)
	//* 157  269:iload_1         
	//* 158  270:iconst_1        
	//* 159  271:icmpeq          279
	//* 160  274:iload_1         
	//* 161  275:iconst_2        
	//* 162  276:icmpne          347
		{
			vorbisbitarray.skipBits(32);
	//  163  279:aload_0         
	//  164  280:bipush          32
	//  165  282:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
			vorbisbitarray.skipBits(32);
	//  166  285:aload_0         
	//  167  286:bipush          32
	//  168  288:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
			int k = vorbisbitarray.readBits(4);
	//  169  291:aload_0         
	//  170  292:iconst_4        
	//  171  293:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//  172  296:istore_2        
			vorbisbitarray.skipBits(1);
	//  173  297:aload_0         
	//  174  298:iconst_1        
	//  175  299:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
			if(i == 1)
	//* 176  302:iload_1         
	//* 177  303:iconst_1        
	//* 178  304:icmpne          326
			{
				if(i1 != 0)
	//* 179  307:iload           4
	//* 180  309:ifeq            335
					l1 = mapType1QuantValues(j1, i1);
	//  181  312:iload           5
	//  182  314:i2l             
	//  183  315:iload           4
	//  184  317:i2l             
	//  185  318:invokestatic    #86  <Method long mapType1QuantValues(long, long)>
	//  186  321:lstore          9
			} else
	//* 187  323:goto            335
			{
				l1 = (long)j1 * (long)i1;
	//  188  326:iload           5
	//  189  328:i2l             
	//  190  329:iload           4
	//  191  331:i2l             
	//  192  332:lmul            
	//  193  333:lstore          9
			}
			vorbisbitarray.skipBits((int)(l1 * (long)(k + 1)));
	//  194  335:aload_0         
	//  195  336:lload           9
	//  196  338:iload_2         
	//  197  339:iconst_1        
	//  198  340:iadd            
	//  199  341:i2l             
	//  200  342:lmul            
	//  201  343:l2i             
	//  202  344:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
		}
		return new CodeBook(i1, j1, al, i, flag);
	//  203  347:new             #6   <Class VorbisUtil$CodeBook>
	//  204  350:dup             
	//  205  351:iload           4
	//  206  353:iload           5
	//  207  355:aload           11
	//  208  357:iload_1         
	//  209  358:iload           7
	//  210  360:invokespecial   #89  <Method void VorbisUtil$CodeBook(int, int, long[], int, boolean)>
	//  211  363:areturn         
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
	//   17   48:new             #51  <Class StringBuilder>
	//   18   51:dup             
	//   19   52:invokespecial   #52  <Method void StringBuilder()>
	//   20   55:astore_0        
				((StringBuilder) (vorbisbitarray)).append("floor type greater than 1 not decodable: ");
	//   21   56:aload_0         
	//   22   57:ldc1            #94  <String "floor type greater than 1 not decodable: ">
	//   23   59:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   24   62:pop             
				((StringBuilder) (vorbisbitarray)).append(i);
	//   25   63:aload_0         
	//   26   64:iload_1         
	//   27   65:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   28   68:pop             
				throw new ParserException(((StringBuilder) (vorbisbitarray)).toString());
	//   29   69:new             #43  <Class ParserException>
	//   30   72:dup             
	//   31   73:aload_0         
	//   32   74:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   33   77:invokespecial   #72  <Method void ParserException(String)>
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
	//  100  182:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
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
	//  110  198:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>

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
	//  123  217:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
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
	//  154  268:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>

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
	//  167  288:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(16);
	//  168  291:aload_0         
	//  169  292:bipush          16
	//  170  294:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(16);
	//  171  297:aload_0         
	//  172  298:bipush          16
	//  173  300:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(6);
	//  174  303:aload_0         
	//  175  304:bipush          6
	//  176  306:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(8);
	//  177  309:aload_0         
	//  178  310:bipush          8
	//  179  312:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
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
	//  193  333:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>

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
		int k1 = vorbisbitarray.readBits(6);
	//    0    0:aload_1         
	//    1    1:bipush          6
	//    2    3:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//    3    6:istore          5
		for(int j = 0; j < k1 + 1; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload           5
	//*   8   13:iconst_1        
	//*   9   14:iadd            
	//*  10   15:icmpge          235
		{
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
	//   17   29:new             #51  <Class StringBuilder>
	//   18   32:dup             
	//   19   33:invokespecial   #52  <Method void StringBuilder()>
	//   20   36:astore          8
				stringbuilder.append("mapping type other than 0 not supported: ");
	//   21   38:aload           8
	//   22   40:ldc1            #98  <String "mapping type other than 0 not supported: ">
	//   23   42:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
				stringbuilder.append(k);
	//   25   46:aload           8
	//   26   48:iload_3         
	//   27   49:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   28   52:pop             
				Log.e("VorbisUtil", stringbuilder.toString());
	//   29   53:ldc1            #20  <String "VorbisUtil">
	//   30   55:aload           8
	//   31   57:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   32   60:invokestatic    #104 <Method int Log.e(String, String)>
	//   33   63:pop             
				continue;
	//   34   64:goto            228
			}
			if(vorbisbitarray.readBit())
	//*  35   67:aload_1         
	//*  36   68:invokevirtual   #76  <Method boolean VorbisBitArray.readBit()>
	//*  37   71:ifeq            85
				k = vorbisbitarray.readBits(4) + 1;
	//   38   74:aload_1         
	//   39   75:iconst_4        
	//   40   76:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   41   79:iconst_1        
	//   42   80:iadd            
	//   43   81:istore_3        
			else
	//*  44   82:goto            87
				k = 1;
	//   45   85:iconst_1        
	//   46   86:istore_3        
			if(vorbisbitarray.readBit())
	//*  47   87:aload_1         
	//*  48   88:invokevirtual   #76  <Method boolean VorbisBitArray.readBit()>
	//*  49   91:ifeq            146
			{
				int l1 = vorbisbitarray.readBits(8);
	//   50   94:aload_1         
	//   51   95:bipush          8
	//   52   97:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   53  100:istore          6
				for(int l = 0; l < l1 + 1; l++)
	//*  54  102:iconst_0        
	//*  55  103:istore          4
	//*  56  105:iload           4
	//*  57  107:iload           6
	//*  58  109:iconst_1        
	//*  59  110:iadd            
	//*  60  111:icmpge          146
				{
					int i2 = i - 1;
	//   61  114:iload_0         
	//   62  115:iconst_1        
	//   63  116:isub            
	//   64  117:istore          7
					vorbisbitarray.skipBits(iLog(i2));
	//   65  119:aload_1         
	//   66  120:iload           7
	//   67  122:invokestatic    #78  <Method int iLog(int)>
	//   68  125:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
					vorbisbitarray.skipBits(iLog(i2));
	//   69  128:aload_1         
	//   70  129:iload           7
	//   71  131:invokestatic    #78  <Method int iLog(int)>
	//   72  134:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
				}

	//   73  137:iload           4
	//   74  139:iconst_1        
	//   75  140:iadd            
	//   76  141:istore          4
			}
	//*  77  143:goto            105
			if(vorbisbitarray.readBits(2) != 0)
	//*  78  146:aload_1         
	//*  79  147:iconst_2        
	//*  80  148:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//*  81  151:ifeq            164
				throw new ParserException("to reserved bits must be zero after mapping coupling steps");
	//   82  154:new             #43  <Class ParserException>
	//   83  157:dup             
	//   84  158:ldc1            #106 <String "to reserved bits must be zero after mapping coupling steps">
	//   85  160:invokespecial   #72  <Method void ParserException(String)>
	//   86  163:athrow          
			if(k > 1)
	//*  87  164:iload_3         
	//*  88  165:iconst_1        
	//*  89  166:icmple          192
			{
				for(int i1 = 0; i1 < i; i1++)
	//*  90  169:iconst_0        
	//*  91  170:istore          4
	//*  92  172:iload           4
	//*  93  174:iload_0         
	//*  94  175:icmpge          192
					vorbisbitarray.skipBits(4);
	//   95  178:aload_1         
	//   96  179:iconst_4        
	//   97  180:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>

	//   98  183:iload           4
	//   99  185:iconst_1        
	//  100  186:iadd            
	//  101  187:istore          4
			}
	//* 102  189:goto            172
			for(int j1 = 0; j1 < k; j1++)
	//* 103  192:iconst_0        
	//* 104  193:istore          4
	//* 105  195:iload           4
	//* 106  197:iload_3         
	//* 107  198:icmpge          228
			{
				vorbisbitarray.skipBits(8);
	//  108  201:aload_1         
	//  109  202:bipush          8
	//  110  204:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(8);
	//  111  207:aload_1         
	//  112  208:bipush          8
	//  113  210:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
				vorbisbitarray.skipBits(8);
	//  114  213:aload_1         
	//  115  214:bipush          8
	//  116  216:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
			}

	//  117  219:iload           4
	//  118  221:iconst_1        
	//  119  222:iadd            
	//  120  223:istore          4
		}

	//  121  225:goto            195
	//  122  228:iload_2         
	//  123  229:iconst_1        
	//  124  230:iadd            
	//  125  231:istore_2        
	//* 126  232:goto            10
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
	//   19   28:invokevirtual   #76  <Method boolean VorbisBitArray.readBit()>
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
		for(int i = 0; i < j1 + 1; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload           4
	//*   8   13:iconst_1        
	//*   9   14:iadd            
	//*  10   15:icmpge          183
		{
			if(vorbisbitarray.readBits(16) > 2)
	//*  11   18:aload_0         
	//*  12   19:bipush          16
	//*  13   21:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//*  14   24:iconst_2        
	//*  15   25:icmple          38
				throw new ParserException("residueType greater than 2 is not decodable");
	//   16   28:new             #43  <Class ParserException>
	//   17   31:dup             
	//   18   32:ldc1            #114 <String "residueType greater than 2 is not decodable">
	//   19   34:invokespecial   #72  <Method void ParserException(String)>
	//   20   37:athrow          
			vorbisbitarray.skipBits(24);
	//   21   38:aload_0         
	//   22   39:bipush          24
	//   23   41:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
			vorbisbitarray.skipBits(24);
	//   24   44:aload_0         
	//   25   45:bipush          24
	//   26   47:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
			vorbisbitarray.skipBits(24);
	//   27   50:aload_0         
	//   28   51:bipush          24
	//   29   53:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
			int k1 = vorbisbitarray.readBits(6) + 1;
	//   30   56:aload_0         
	//   31   57:bipush          6
	//   32   59:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:istore          5
			vorbisbitarray.skipBits(8);
	//   36   66:aload_0         
	//   37   67:bipush          8
	//   38   69:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
			int ai[] = new int[k1];
	//   39   72:iload           5
	//   40   74:newarray        int[]
	//   41   76:astore          7
			for(int j = 0; j < k1; j++)
	//*  42   78:iconst_0        
	//*  43   79:istore_2        
	//*  44   80:iload_2         
	//*  45   81:iload           5
	//*  46   83:icmpge          129
			{
				int l1 = vorbisbitarray.readBits(3);
	//   47   86:aload_0         
	//   48   87:iconst_3        
	//   49   88:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   50   91:istore          6
				int l;
				if(vorbisbitarray.readBit())
	//*  51   93:aload_0         
	//*  52   94:invokevirtual   #76  <Method boolean VorbisBitArray.readBit()>
	//*  53   97:ifeq            109
					l = vorbisbitarray.readBits(5);
	//   54  100:aload_0         
	//   55  101:iconst_5        
	//   56  102:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//   57  105:istore_3        
				else
	//*  58  106:goto            111
					l = 0;
	//   59  109:iconst_0        
	//   60  110:istore_3        
				ai[j] = l * 8 + l1;
	//   61  111:aload           7
	//   62  113:iload_2         
	//   63  114:iload_3         
	//   64  115:bipush          8
	//   65  117:imul            
	//   66  118:iload           6
	//   67  120:iadd            
	//   68  121:iastore         
			}

	//   69  122:iload_2         
	//   70  123:iconst_1        
	//   71  124:iadd            
	//   72  125:istore_2        
	//*  73  126:goto            80
			for(int k = 0; k < k1; k++)
	//*  74  129:iconst_0        
	//*  75  130:istore_2        
	//*  76  131:iload_2         
	//*  77  132:iload           5
	//*  78  134:icmpge          176
			{
				for(int i1 = 0; i1 < 8; i1++)
	//*  79  137:iconst_0        
	//*  80  138:istore_3        
	//*  81  139:iload_3         
	//*  82  140:bipush          8
	//*  83  142:icmpge          169
					if((ai[k] & 1 << i1) != 0)
	//*  84  145:aload           7
	//*  85  147:iload_2         
	//*  86  148:iaload          
	//*  87  149:iconst_1        
	//*  88  150:iload_3         
	//*  89  151:ishl            
	//*  90  152:iand            
	//*  91  153:ifeq            162
						vorbisbitarray.skipBits(8);
	//   92  156:aload_0         
	//   93  157:bipush          8
	//   94  159:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>

	//   95  162:iload_3         
	//   96  163:iconst_1        
	//   97  164:iadd            
	//   98  165:istore_3        
			}

	//   99  166:goto            139
	//  100  169:iload_2         
	//  101  170:iconst_1        
	//  102  171:iadd            
	//  103  172:istore_2        
		}

	//  104  173:goto            131
	//  105  176:iload_1         
	//  106  177:iconst_1        
	//  107  178:iadd            
	//  108  179:istore_1        
	//* 109  180:goto            10
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
		if((parsablebytearray.readUnsignedByte() & 1) == 0)
	//*  56   84:aload_0         
	//*  57   85:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  58   88:iconst_1        
	//*  59   89:iand            
	//*  60   90:ifne            103
			throw new ParserException("framing bit expected to be set");
	//   61   93:new             #43  <Class ParserException>
	//   62   96:dup             
	//   63   97:ldc1            #140 <String "framing bit expected to be set">
	//   64   99:invokespecial   #72  <Method void ParserException(String)>
	//   65  102:athrow          
		else
			return new CommentHeader(s, as, j + 1);
	//   66  103:new             #9   <Class VorbisUtil$CommentHeader>
	//   67  106:dup             
	//   68  107:aload           5
	//   69  109:aload           6
	//   70  111:iload_2         
	//   71  112:iconst_1        
	//   72  113:iadd            
	//   73  114:invokespecial   #143 <Method void VorbisUtil$CommentHeader(String, String[], int)>
	//   74  117:areturn         
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
	//   21   37:invokevirtual   #84  <Method void VorbisBitArray.skipBits(int)>
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
		for(int k = ((int) (flag)); k < l + 1; k++)
	//*  41   72:iload_3         
	//*  42   73:istore_2        
	//*  43   74:iload_2         
	//*  44   75:iload           4
	//*  45   77:iconst_1        
	//*  46   78:iadd            
	//*  47   79:icmpge          109
			if(vorbisbitarray.readBits(16) != 0)
	//*  48   82:aload           5
	//*  49   84:bipush          16
	//*  50   86:invokevirtual   #48  <Method int VorbisBitArray.readBits(int)>
	//*  51   89:ifeq            102
				throw new ParserException("placeholder of time domain transforms not zeroed out");
	//   52   92:new             #43  <Class ParserException>
	//   53   95:dup             
	//   54   96:ldc1            #176 <String "placeholder of time domain transforms not zeroed out">
	//   55   98:invokespecial   #72  <Method void ParserException(String)>
	//   56  101:athrow          

	//   57  102:iload_2         
	//   58  103:iconst_1        
	//   59  104:iadd            
	//   60  105:istore_2        
	//*  61  106:goto            74
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
		if(!vorbisbitarray.readBit())
	//*  72  131:aload           5
	//*  73  133:invokevirtual   #76  <Method boolean VorbisBitArray.readBit()>
	//*  74  136:ifne            149
			throw new ParserException("framing bit after modes not set as expected");
	//   75  139:new             #43  <Class ParserException>
	//   76  142:dup             
	//   77  143:ldc1            #186 <String "framing bit after modes not set as expected">
	//   78  145:invokespecial   #72  <Method void ParserException(String)>
	//   79  148:athrow          
		else
			return ((Mode []) (parsablebytearray));
	//   80  149:aload_0         
	//   81  150:areturn         
	}

	public static boolean verifyVorbisHeaderCapturePattern(int i, ParsableByteArray parsablebytearray, boolean flag)
		throws ParserException
	{
		if(parsablebytearray.bytesLeft() < 7)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #189 <Method int ParsableByteArray.bytesLeft()>
	//*   2    4:bipush          7
	//*   3    6:icmpge          51
			if(flag)
	//*   4    9:iload_2         
	//*   5   10:ifeq            15
			{
				return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    8   15:new             #51  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #52  <Method void StringBuilder()>
	//   11   22:astore_3        
				stringbuilder.append("too short header: ");
	//   12   23:aload_3         
	//   13   24:ldc1            #191 <String "too short header: ">
	//   14   26:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
				stringbuilder.append(parsablebytearray.bytesLeft());
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #189 <Method int ParsableByteArray.bytesLeft()>
	//   19   35:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   20   38:pop             
				throw new ParserException(stringbuilder.toString());
	//   21   39:new             #43  <Class ParserException>
	//   22   42:dup             
	//   23   43:aload_3         
	//   24   44:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   25   47:invokespecial   #72  <Method void ParserException(String)>
	//   26   50:athrow          
			}
		if(parsablebytearray.readUnsignedByte() != i)
	//*  27   51:aload_1         
	//*  28   52:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  29   55:iload_0         
	//*  30   56:icmpeq          101
			if(flag)
	//*  31   59:iload_2         
	//*  32   60:ifeq            65
			{
				return false;
	//   33   63:iconst_0        
	//   34   64:ireturn         
			} else
			{
				parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   35   65:new             #51  <Class StringBuilder>
	//   36   68:dup             
	//   37   69:invokespecial   #52  <Method void StringBuilder()>
	//   38   72:astore_1        
				((StringBuilder) (parsablebytearray)).append("expected header type ");
	//   39   73:aload_1         
	//   40   74:ldc1            #193 <String "expected header type ">
	//   41   76:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   42   79:pop             
				((StringBuilder) (parsablebytearray)).append(Integer.toHexString(i));
	//   43   80:aload_1         
	//   44   81:iload_0         
	//   45   82:invokestatic    #198 <Method String Integer.toHexString(int)>
	//   46   85:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   47   88:pop             
				throw new ParserException(((StringBuilder) (parsablebytearray)).toString());
	//   48   89:new             #43  <Class ParserException>
	//   49   92:dup             
	//   50   93:aload_1         
	//   51   94:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   52   97:invokespecial   #72  <Method void ParserException(String)>
	//   53  100:athrow          
			}
		if(parsablebytearray.readUnsignedByte() == 118 && parsablebytearray.readUnsignedByte() == 111 && parsablebytearray.readUnsignedByte() == 114 && parsablebytearray.readUnsignedByte() == 98 && parsablebytearray.readUnsignedByte() == 105 && parsablebytearray.readUnsignedByte() == 115)
	//*  54  101:aload_1         
	//*  55  102:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  56  105:bipush          118
	//*  57  107:icmpne          160
	//*  58  110:aload_1         
	//*  59  111:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  60  114:bipush          111
	//*  61  116:icmpne          160
	//*  62  119:aload_1         
	//*  63  120:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  64  123:bipush          114
	//*  65  125:icmpne          160
	//*  66  128:aload_1         
	//*  67  129:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  68  132:bipush          98
	//*  69  134:icmpne          160
	//*  70  137:aload_1         
	//*  71  138:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  72  141:bipush          105
	//*  73  143:icmpne          160
	//*  74  146:aload_1         
	//*  75  147:invokevirtual   #138 <Method int ParsableByteArray.readUnsignedByte()>
	//*  76  150:bipush          115
	//*  77  152:icmpeq          158
	//*  78  155:goto            160
			return true;
	//   79  158:iconst_1        
	//   80  159:ireturn         
		if(flag)
	//*  81  160:iload_2         
	//*  82  161:ifeq            166
			return false;
	//   83  164:iconst_0        
	//   84  165:ireturn         
		else
			throw new ParserException("expected characters 'vorbis'");
	//   85  166:new             #43  <Class ParserException>
	//   86  169:dup             
	//   87  170:ldc1            #200 <String "expected characters 'vorbis'">
	//   88  172:invokespecial   #72  <Method void ParserException(String)>
	//   89  175:athrow          
	}

	private static final String TAG = "VorbisUtil";
}
