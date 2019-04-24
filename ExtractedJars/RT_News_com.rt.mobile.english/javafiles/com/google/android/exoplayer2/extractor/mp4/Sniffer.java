// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			Atom

final class Sniffer
{

	private Sniffer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Object()>
	//    2    4:return          
	}

	private static boolean isCompatibleBrand(int i)
	{
		if(i >>> 8 == Util.getIntegerCodeForString("3gp"))
	//*   0    0:iload_0         
	//*   1    1:bipush          8
	//*   2    3:iushr           
	//*   3    4:ldc1            #75  <String "3gp">
	//*   4    6:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//*   5    9:icmpne          14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		int ai[] = COMPATIBLE_BRANDS;
	//    8   14:getstatic       #67  <Field int[] COMPATIBLE_BRANDS>
	//    9   17:astore_3        
		int k = ai.length;
	//   10   18:aload_3         
	//   11   19:arraylength     
	//   12   20:istore_2        
		for(int j = 0; j < k; j++)
	//*  13   21:iconst_0        
	//*  14   22:istore_1        
	//*  15   23:iload_1         
	//*  16   24:iload_2         
	//*  17   25:icmpge          44
			if(ai[j] == i)
	//*  18   28:aload_3         
	//*  19   29:iload_1         
	//*  20   30:iaload          
	//*  21   31:iload_0         
	//*  22   32:icmpne          37
				return true;
	//   23   35:iconst_1        
	//   24   36:ireturn         

	//   25   37:iload_1         
	//   26   38:iconst_1        
	//   27   39:iadd            
	//   28   40:istore_1        
	//*  29   41:goto            23
		return false;
	//   30   44:iconst_0        
	//   31   45:ireturn         
	}

	public static boolean sniffFragmented(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return sniffInternal(extractorinput, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #85  <Method boolean sniffInternal(ExtractorInput, boolean)>
	//    3    5:ireturn         
	}

	private static boolean sniffInternal(ExtractorInput extractorinput, boolean flag)
		throws IOException, InterruptedException
	{
		long l2;
label0:
		{
			long l4 = extractorinput.getLength();
	//    0    0:aload_0         
	//    1    1:invokeinterface #92  <Method long ExtractorInput.getLength()>
	//    2    6:lstore          14
			if(l4 != -1L)
	//*   3    8:lload           14
	//*   4   10:ldc2w           #93  <Long -1L>
	//*   5   13:lcmp            
	//*   6   14:ifeq            30
			{
				l2 = l4;
	//    7   17:lload           14
	//    8   19:lstore          12
				if(l4 <= 4096L)
					break label0;
	//    9   21:lload           14
	//   10   23:ldc2w           #95  <Long 4096L>
	//   11   26:lcmp            
	//   12   27:ifle            35
			}
			l2 = 4096L;
	//   13   30:ldc2w           #95  <Long 4096L>
	//   14   33:lstore          12
		}
		int i;
		boolean flag1;
		boolean flag3;
label1:
		{
			int j1 = (int)l2;
	//   15   35:lload           12
	//   16   37:l2i             
	//   17   38:istore          6
			ParsableByteArray parsablebytearray = new ParsableByteArray(64);
	//   18   40:new             #98  <Class ParsableByteArray>
	//   19   43:dup             
	//   20   44:bipush          64
	//   21   46:invokespecial   #101 <Method void ParsableByteArray(int)>
	//   22   49:astore          18
			flag3 = false;
	//   23   51:iconst_0        
	//   24   52:istore          11
			int j = 0;
	//   25   54:iconst_0        
	//   26   55:istore_3        
			i = j;
	//   27   56:iload_3         
	//   28   57:istore_2        
label2:
			do
			{
label3:
				{
					int k1;
					long l3;
					long l5;
					do
					{
						if(j >= j1)
							break label3;
	//   29   58:iload_3         
	//   30   59:iload           6
	//   31   61:icmpge          414
						parsablebytearray.reset(8);
	//   32   64:aload           18
	//   33   66:bipush          8
	//   34   68:invokevirtual   #104 <Method void ParsableByteArray.reset(int)>
						extractorinput.peekFully(parsablebytearray.data, 0, 8);
	//   35   71:aload_0         
	//   36   72:aload           18
	//   37   74:getfield        #108 <Field byte[] ParsableByteArray.data>
	//   38   77:iconst_0        
	//   39   78:bipush          8
	//   40   80:invokeinterface #112 <Method void ExtractorInput.peekFully(byte[], int, int)>
						l5 = parsablebytearray.readUnsignedInt();
	//   41   85:aload           18
	//   42   87:invokevirtual   #115 <Method long ParsableByteArray.readUnsignedInt()>
	//   43   90:lstore          14
						k1 = parsablebytearray.readInt();
	//   44   92:aload           18
	//   45   94:invokevirtual   #119 <Method int ParsableByteArray.readInt()>
	//   46   97:istore          7
						int k = 16;
	//   47   99:bipush          16
	//   48  101:istore          4
						if(l5 == 1L)
	//*  49  103:lload           14
	//*  50  105:lconst_1        
	//*  51  106:lcmp            
	//*  52  107:ifne            142
						{
							extractorinput.peekFully(parsablebytearray.data, 8, 8);
	//   53  110:aload_0         
	//   54  111:aload           18
	//   55  113:getfield        #108 <Field byte[] ParsableByteArray.data>
	//   56  116:bipush          8
	//   57  118:bipush          8
	//   58  120:invokeinterface #112 <Method void ExtractorInput.peekFully(byte[], int, int)>
							parsablebytearray.setLimit(16);
	//   59  125:aload           18
	//   60  127:bipush          16
	//   61  129:invokevirtual   #122 <Method void ParsableByteArray.setLimit(int)>
							l3 = parsablebytearray.readUnsignedLongToLong();
	//   62  132:aload           18
	//   63  134:invokevirtual   #125 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   64  137:lstore          12
						} else
	//*  65  139:goto            193
						{
							l3 = l5;
	//   66  142:lload           14
	//   67  144:lstore          12
							if(l5 == 0L)
	//*  68  146:lload           14
	//*  69  148:lconst_0        
	//*  70  149:lcmp            
	//*  71  150:ifne            189
							{
								long l6 = extractorinput.getLength();
	//   72  153:aload_0         
	//   73  154:invokeinterface #92  <Method long ExtractorInput.getLength()>
	//   74  159:lstore          16
								l3 = l5;
	//   75  161:lload           14
	//   76  163:lstore          12
								if(l6 != -1L)
	//*  77  165:lload           16
	//*  78  167:ldc2w           #93  <Long -1L>
	//*  79  170:lcmp            
	//*  80  171:ifeq            189
									l3 = (l6 - extractorinput.getPosition()) + (long)8;
	//   81  174:lload           16
	//   82  176:aload_0         
	//   83  177:invokeinterface #128 <Method long ExtractorInput.getPosition()>
	//   84  182:lsub            
	//   85  183:bipush          8
	//   86  185:i2l             
	//   87  186:ladd            
	//   88  187:lstore          12
							}
							k = 8;
	//   89  189:bipush          8
	//   90  191:istore          4
						}
						l5 = k;
	//   91  193:iload           4
	//   92  195:i2l             
	//   93  196:lstore          14
						if(l3 < l5)
	//*  94  198:lload           12
	//*  95  200:lload           14
	//*  96  202:lcmp            
	//*  97  203:ifge            208
							return false;
	//   98  206:iconst_0        
	//   99  207:ireturn         
						j += k;
	//  100  208:iload_3         
	//  101  209:iload           4
	//  102  211:iadd            
	//  103  212:istore_3        
					} while(k1 == Atom.TYPE_moov);
	//  104  213:iload           7
	//  105  215:getstatic       #133 <Field int Atom.TYPE_moov>
	//  106  218:icmpne          224
	//* 107  221:goto            58
					if(k1 != Atom.TYPE_moof && k1 != Atom.TYPE_mvex)
	//* 108  224:iload           7
	//* 109  226:getstatic       #136 <Field int Atom.TYPE_moof>
	//* 110  229:icmpeq          408
	//* 111  232:iload           7
	//* 112  234:getstatic       #139 <Field int Atom.TYPE_mvex>
	//* 113  237:icmpne          243
	//* 114  240:goto            408
					{
						if(((long)j + l3) - l5 >= (long)j1)
	//* 115  243:iload_3         
	//* 116  244:i2l             
	//* 117  245:lload           12
	//* 118  247:ladd            
	//* 119  248:lload           14
	//* 120  250:lsub            
	//* 121  251:iload           6
	//* 122  253:i2l             
	//* 123  254:lcmp            
	//* 124  255:iflt            261
							break label3;
	//  125  258:goto            414
						int i2 = (int)(l3 - l5);
	//  126  261:lload           12
	//  127  263:lload           14
	//  128  265:lsub            
	//  129  266:l2i             
	//  130  267:istore          8
						int i1 = j + i2;
	//  131  269:iload_3         
	//  132  270:iload           8
	//  133  272:iadd            
	//  134  273:istore          5
						int l;
						if(k1 == Atom.TYPE_ftyp)
	//* 135  275:iload           7
	//* 136  277:getstatic       #142 <Field int Atom.TYPE_ftyp>
	//* 137  280:icmpne          380
						{
							if(i2 < 8)
	//* 138  283:iload           8
	//* 139  285:bipush          8
	//* 140  287:icmpge          292
								return false;
	//  141  290:iconst_0        
	//  142  291:ireturn         
							parsablebytearray.reset(i2);
	//  143  292:aload           18
	//  144  294:iload           8
	//  145  296:invokevirtual   #104 <Method void ParsableByteArray.reset(int)>
							extractorinput.peekFully(parsablebytearray.data, 0, i2);
	//  146  299:aload_0         
	//  147  300:aload           18
	//  148  302:getfield        #108 <Field byte[] ParsableByteArray.data>
	//  149  305:iconst_0        
	//  150  306:iload           8
	//  151  308:invokeinterface #112 <Method void ExtractorInput.peekFully(byte[], int, int)>
							int l1 = i2 / 4;
	//  152  313:iload           8
	//  153  315:iconst_4        
	//  154  316:idiv            
	//  155  317:istore          7
							l = 0;
	//  156  319:iconst_0        
	//  157  320:istore          4
							do
							{
								j = i;
	//  158  322:iload_2         
	//  159  323:istore_3        
								if(l >= l1)
									break;
	//  160  324:iload           4
	//  161  326:iload           7
	//  162  328:icmpge          371
								if(l == 1)
	//* 163  331:iload           4
	//* 164  333:iconst_1        
	//* 165  334:icmpne          346
									parsablebytearray.skipBytes(4);
	//  166  337:aload           18
	//  167  339:iconst_4        
	//  168  340:invokevirtual   #145 <Method void ParsableByteArray.skipBytes(int)>
								else
	//* 169  343:goto            362
								if(isCompatibleBrand(parsablebytearray.readInt()))
	//* 170  346:aload           18
	//* 171  348:invokevirtual   #119 <Method int ParsableByteArray.readInt()>
	//* 172  351:invokestatic    #147 <Method boolean isCompatibleBrand(int)>
	//* 173  354:ifeq            362
								{
									j = 1;
	//  174  357:iconst_1        
	//  175  358:istore_3        
									break;
	//  176  359:goto            371
								}
								l++;
	//  177  362:iload           4
	//  178  364:iconst_1        
	//  179  365:iadd            
	//  180  366:istore          4
							} while(true);
	//  181  368:goto            322
							l = j;
	//  182  371:iload_3         
	//  183  372:istore          4
							if(j == 0)
	//* 184  374:iload_3         
	//* 185  375:ifne            399
								return false;
	//  186  378:iconst_0        
	//  187  379:ireturn         
						} else
						{
							l = i;
	//  188  380:iload_2         
	//  189  381:istore          4
							if(i2 != 0)
	//* 190  383:iload           8
	//* 191  385:ifeq            399
							{
								extractorinput.advancePeekPosition(i2);
	//  192  388:aload_0         
	//  193  389:iload           8
	//  194  391:invokeinterface #150 <Method void ExtractorInput.advancePeekPosition(int)>
								l = i;
	//  195  396:iload_2         
	//  196  397:istore          4
							}
						}
						j = i1;
	//  197  399:iload           5
	//  198  401:istore_3        
						i = l;
	//  199  402:iload           4
	//  200  404:istore_2        
					} else
	//* 201  405:goto            58
					{
						flag1 = true;
	//  202  408:iconst_1        
	//  203  409:istore          9
						break label1;
	//  204  411:goto            417
					}
				}
			} while(true);
			flag1 = false;
	//  205  414:iconst_0        
	//  206  415:istore          9
		}
		boolean flag2 = flag3;
	//  207  417:iload           11
	//  208  419:istore          10
		if(i != 0)
	//* 209  421:iload_2         
	//* 210  422:ifeq            438
		{
			flag2 = flag3;
	//  211  425:iload           11
	//  212  427:istore          10
			if(flag == flag1)
	//* 213  429:iload_1         
	//* 214  430:iload           9
	//* 215  432:icmpne          438
				flag2 = true;
	//  216  435:iconst_1        
	//  217  436:istore          10
		}
		return flag2;
	//  218  438:iload           10
	//  219  440:ireturn         
	}

	public static boolean sniffUnfragmented(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return sniffInternal(extractorinput, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #85  <Method boolean sniffInternal(ExtractorInput, boolean)>
	//    3    5:ireturn         
	}

	private static final int COMPATIBLE_BRANDS[] = {
		Util.getIntegerCodeForString("isom"), Util.getIntegerCodeForString("iso2"), Util.getIntegerCodeForString("iso3"), Util.getIntegerCodeForString("iso4"), Util.getIntegerCodeForString("iso5"), Util.getIntegerCodeForString("iso6"), Util.getIntegerCodeForString("avc1"), Util.getIntegerCodeForString("hvc1"), Util.getIntegerCodeForString("hev1"), Util.getIntegerCodeForString("mp41"), 
		Util.getIntegerCodeForString("mp42"), Util.getIntegerCodeForString("3g2a"), Util.getIntegerCodeForString("3g2b"), Util.getIntegerCodeForString("3gr6"), Util.getIntegerCodeForString("3gs6"), Util.getIntegerCodeForString("3ge6"), Util.getIntegerCodeForString("3gg6"), Util.getIntegerCodeForString("M4V "), Util.getIntegerCodeForString("M4A "), Util.getIntegerCodeForString("f4v "), 
		Util.getIntegerCodeForString("kddi"), Util.getIntegerCodeForString("M4VP"), Util.getIntegerCodeForString("qt  "), Util.getIntegerCodeForString("MSNV")
	};
	private static final int SEARCH_LENGTH = 4096;

	static 
	{
	//    0    0:bipush          24
	//    1    2:newarray        int[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #13  <String "isom">
	//    5    8:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//    6   11:iastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:ldc1            #21  <String "iso2">
	//   10   16:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   11   19:iastore         
	//   12   20:dup             
	//   13   21:iconst_2        
	//   14   22:ldc1            #23  <String "iso3">
	//   15   24:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   16   27:iastore         
	//   17   28:dup             
	//   18   29:iconst_3        
	//   19   30:ldc1            #25  <String "iso4">
	//   20   32:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   21   35:iastore         
	//   22   36:dup             
	//   23   37:iconst_4        
	//   24   38:ldc1            #27  <String "iso5">
	//   25   40:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   26   43:iastore         
	//   27   44:dup             
	//   28   45:iconst_5        
	//   29   46:ldc1            #29  <String "iso6">
	//   30   48:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   31   51:iastore         
	//   32   52:dup             
	//   33   53:bipush          6
	//   34   55:ldc1            #31  <String "avc1">
	//   35   57:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   36   60:iastore         
	//   37   61:dup             
	//   38   62:bipush          7
	//   39   64:ldc1            #33  <String "hvc1">
	//   40   66:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   41   69:iastore         
	//   42   70:dup             
	//   43   71:bipush          8
	//   44   73:ldc1            #35  <String "hev1">
	//   45   75:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   46   78:iastore         
	//   47   79:dup             
	//   48   80:bipush          9
	//   49   82:ldc1            #37  <String "mp41">
	//   50   84:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   51   87:iastore         
	//   52   88:dup             
	//   53   89:bipush          10
	//   54   91:ldc1            #39  <String "mp42">
	//   55   93:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   56   96:iastore         
	//   57   97:dup             
	//   58   98:bipush          11
	//   59  100:ldc1            #41  <String "3g2a">
	//   60  102:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   61  105:iastore         
	//   62  106:dup             
	//   63  107:bipush          12
	//   64  109:ldc1            #43  <String "3g2b">
	//   65  111:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   66  114:iastore         
	//   67  115:dup             
	//   68  116:bipush          13
	//   69  118:ldc1            #45  <String "3gr6">
	//   70  120:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   71  123:iastore         
	//   72  124:dup             
	//   73  125:bipush          14
	//   74  127:ldc1            #47  <String "3gs6">
	//   75  129:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   76  132:iastore         
	//   77  133:dup             
	//   78  134:bipush          15
	//   79  136:ldc1            #49  <String "3ge6">
	//   80  138:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   81  141:iastore         
	//   82  142:dup             
	//   83  143:bipush          16
	//   84  145:ldc1            #51  <String "3gg6">
	//   85  147:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   86  150:iastore         
	//   87  151:dup             
	//   88  152:bipush          17
	//   89  154:ldc1            #53  <String "M4V ">
	//   90  156:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   91  159:iastore         
	//   92  160:dup             
	//   93  161:bipush          18
	//   94  163:ldc1            #55  <String "M4A ">
	//   95  165:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//   96  168:iastore         
	//   97  169:dup             
	//   98  170:bipush          19
	//   99  172:ldc1            #57  <String "f4v ">
	//  100  174:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//  101  177:iastore         
	//  102  178:dup             
	//  103  179:bipush          20
	//  104  181:ldc1            #59  <String "kddi">
	//  105  183:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//  106  186:iastore         
	//  107  187:dup             
	//  108  188:bipush          21
	//  109  190:ldc1            #61  <String "M4VP">
	//  110  192:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//  111  195:iastore         
	//  112  196:dup             
	//  113  197:bipush          22
	//  114  199:ldc1            #63  <String "qt  ">
	//  115  201:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//  116  204:iastore         
	//  117  205:dup             
	//  118  206:bipush          23
	//  119  208:ldc1            #65  <String "MSNV">
	//  120  210:invokestatic    #19  <Method int Util.getIntegerCodeForString(String)>
	//  121  213:iastore         
	//  122  214:putstatic       #67  <Field int[] COMPATIBLE_BRANDS>
	//* 123  217:return          
	}
}
