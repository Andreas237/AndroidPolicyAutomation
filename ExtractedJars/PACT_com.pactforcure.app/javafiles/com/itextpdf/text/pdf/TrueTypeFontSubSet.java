// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			RandomAccessFileOrArray, PdfEncodings

class TrueTypeFontSubSet
{

	TrueTypeFontSubSet(String s, RandomAccessFileOrArray randomaccessfileorarray, HashSet hashset, int i, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		fileName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #99  <Field String fileName>
		rf = randomaccessfileorarray;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #101 <Field RandomAccessFileOrArray rf>
		glyphsUsed = hashset;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #103 <Field HashSet glyphsUsed>
		includeCmap = flag;
	//   11   19:aload_0         
	//   12   20:iload           5
	//   13   22:putfield        #105 <Field boolean includeCmap>
		includeExtras = flag1;
	//   14   25:aload_0         
	//   15   26:iload           6
	//   16   28:putfield        #107 <Field boolean includeExtras>
		directoryOffset = i;
	//   17   31:aload_0         
	//   18   32:iload           4
	//   19   34:putfield        #109 <Field int directoryOffset>
		glyphsInList = new ArrayList(((java.util.Collection) (hashset)));
	//   20   37:aload_0         
	//   21   38:new             #111 <Class ArrayList>
	//   22   41:dup             
	//   23   42:aload_3         
	//   24   43:invokespecial   #114 <Method void ArrayList(java.util.Collection)>
	//   25   46:putfield        #116 <Field ArrayList glyphsInList>
	//   26   49:return          
	}

	protected void assembleFont()
		throws IOException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		int k;
		String as[];
		if(includeExtras)
	//*   2    2:aload_0         
	//*   3    3:getfield        #107 <Field boolean includeExtras>
	//*   4    6:ifeq            76
			as = tableNamesExtra;
	//    5    9:getstatic       #90  <Field String[] tableNamesExtra>
	//    6   12:astore          6
		else
	//*   7   14:iconst_2        
	//*   8   15:istore_1        
	//*   9   16:iconst_0        
	//*  10   17:istore_3        
	//*  11   18:iload_3         
	//*  12   19:aload           6
	//*  13   21:arraylength     
	//*  14   22:icmpge          145
	//*  15   25:aload           6
	//*  16   27:iload_3         
	//*  17   28:aaload          
	//*  18   29:astore          7
	//*  19   31:iload_2         
	//*  20   32:istore          4
	//*  21   34:iload_1         
	//*  22   35:istore          5
	//*  23   37:aload           7
	//*  24   39:ldc1            #66  <String "glyf">
	//*  25   41:invokevirtual   #125 <Method boolean String.equals(Object)>
	//*  26   44:ifne            63
	//*  27   47:aload           7
	//*  28   49:ldc1            #74  <String "loca">
	//*  29   51:invokevirtual   #125 <Method boolean String.equals(Object)>
	//*  30   54:ifeq            99
	//*  31   57:iload_1         
	//*  32   58:istore          5
	//*  33   60:iload_2         
	//*  34   61:istore          4
	//*  35   63:iload_3         
	//*  36   64:iconst_1        
	//*  37   65:iadd            
	//*  38   66:istore_3        
	//*  39   67:iload           4
	//*  40   69:istore_2        
	//*  41   70:iload           5
	//*  42   72:istore_1        
	//*  43   73:goto            18
		if(includeCmap)
	//*  44   76:aload_0         
	//*  45   77:getfield        #105 <Field boolean includeCmap>
	//*  46   80:ifeq            91
			as = tableNamesCmap;
	//   47   83:getstatic       #84  <Field String[] tableNamesCmap>
	//   48   86:astore          6
		else
	//*  49   88:goto            14
			as = tableNamesSimple;
	//   50   91:getstatic       #80  <Field String[] tableNamesSimple>
	//   51   94:astore          6
		i = 2;
		k = 0;
		while(k < as.length) 
		{
			String s = as[k];
			int l = j;
			int j1 = i;
			if(!s.equals("glyf"))
				if(s.equals("loca"))
				{
					j1 = i;
					l = j;
				} else
	//*  52   96:goto            14
				{
					int ai[] = (int[])tableDirectory.get(((Object) (s)));
	//   53   99:aload_0         
	//   54  100:getfield        #127 <Field HashMap tableDirectory>
	//   55  103:aload           7
	//   56  105:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//   57  108:checkcast       #134 <Class int[]>
	//   58  111:astore          7
					l = j;
	//   59  113:iload_2         
	//   60  114:istore          4
					j1 = i;
	//   61  116:iload_1         
	//   62  117:istore          5
					if(ai != null)
	//*  63  119:aload           7
	//*  64  121:ifnull          63
					{
						j1 = i + 1;
	//   65  124:iload_1         
	//   66  125:iconst_1        
	//   67  126:iadd            
	//   68  127:istore          5
						l = j + (ai[2] + 3 & -4);
	//   69  129:iload_2         
	//   70  130:aload           7
	//   71  132:iconst_2        
	//   72  133:iaload          
	//   73  134:iconst_3        
	//   74  135:iadd            
	//   75  136:bipush          -4
	//   76  138:iand            
	//   77  139:iadd            
	//   78  140:istore          4
					}
				}
			k++;
			j = l;
			i = j1;
		}
	//*  79  142:goto            63
		int i1 = newLocaTableOut.length;
	//   80  145:aload_0         
	//   81  146:getfield        #136 <Field byte[] newLocaTableOut>
	//   82  149:arraylength     
	//   83  150:istore          4
		int k1 = newGlyfTable.length;
	//   84  152:aload_0         
	//   85  153:getfield        #138 <Field byte[] newGlyfTable>
	//   86  156:arraylength     
	//   87  157:istore          5
		k = i * 16 + 12;
	//   88  159:iload_1         
	//   89  160:bipush          16
	//   90  162:imul            
	//   91  163:bipush          12
	//   92  165:iadd            
	//   93  166:istore_3        
		outFont = new byte[j + i1 + k1 + k];
	//   94  167:aload_0         
	//   95  168:iload_2         
	//   96  169:iload           4
	//   97  171:iadd            
	//   98  172:iload           5
	//   99  174:iadd            
	//  100  175:iload_3         
	//  101  176:iadd            
	//  102  177:newarray        byte[]
	//  103  179:putfield        #140 <Field byte[] outFont>
		fontPtr = 0;
	//  104  182:aload_0         
	//  105  183:iconst_0        
	//  106  184:putfield        #142 <Field int fontPtr>
		writeFontInt(0x10000);
	//  107  187:aload_0         
	//  108  188:ldc1            #143 <Int 0x10000>
	//  109  190:invokevirtual   #147 <Method void writeFontInt(int)>
		writeFontShort(i);
	//  110  193:aload_0         
	//  111  194:iload_1         
	//  112  195:invokevirtual   #150 <Method void writeFontShort(int)>
		j = entrySelectors[i];
	//  113  198:getstatic       #92  <Field int[] entrySelectors>
	//  114  201:iload_1         
	//  115  202:iaload          
	//  116  203:istore_2        
		writeFontShort((1 << j) * 16);
	//  117  204:aload_0         
	//  118  205:iconst_1        
	//  119  206:iload_2         
	//  120  207:ishl            
	//  121  208:bipush          16
	//  122  210:imul            
	//  123  211:invokevirtual   #150 <Method void writeFontShort(int)>
		writeFontShort(j);
	//  124  214:aload_0         
	//  125  215:iload_2         
	//  126  216:invokevirtual   #150 <Method void writeFontShort(int)>
		writeFontShort((i - (1 << j)) * 16);
	//  127  219:aload_0         
	//  128  220:iload_1         
	//  129  221:iconst_1        
	//  130  222:iload_2         
	//  131  223:ishl            
	//  132  224:isub            
	//  133  225:bipush          16
	//  134  227:imul            
	//  135  228:invokevirtual   #150 <Method void writeFontShort(int)>
		j = 0;
	//  136  231:iconst_0        
	//  137  232:istore_2        
		while(j < as.length) 
	//* 138  233:iload_2         
	//* 139  234:aload           6
	//* 140  236:arraylength     
	//* 141  237:icmpge          373
		{
			String s1 = as[j];
	//  142  240:aload           6
	//  143  242:iload_2         
	//  144  243:aaload          
	//  145  244:astore          7
			int ai1[] = (int[])tableDirectory.get(((Object) (s1)));
	//  146  246:aload_0         
	//  147  247:getfield        #127 <Field HashMap tableDirectory>
	//  148  250:aload           7
	//  149  252:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//  150  255:checkcast       #134 <Class int[]>
	//  151  258:astore          8
			if(ai1 != null)
	//* 152  260:aload           8
	//* 153  262:ifnonnull       272
	//* 154  265:iload_2         
	//* 155  266:iconst_1        
	//* 156  267:iadd            
	//* 157  268:istore_2        
	//* 158  269:goto            233
			{
				writeFontString(s1);
	//  159  272:aload_0         
	//  160  273:aload           7
	//  161  275:invokevirtual   #154 <Method void writeFontString(String)>
				if(s1.equals("glyf"))
	//* 162  278:aload           7
	//* 163  280:ldc1            #66  <String "glyf">
	//* 164  282:invokevirtual   #125 <Method boolean String.equals(Object)>
	//* 165  285:ifeq            327
				{
					writeFontInt(calculateChecksum(newGlyfTable));
	//  166  288:aload_0         
	//  167  289:aload_0         
	//  168  290:aload_0         
	//  169  291:getfield        #138 <Field byte[] newGlyfTable>
	//  170  294:invokevirtual   #158 <Method int calculateChecksum(byte[])>
	//  171  297:invokevirtual   #147 <Method void writeFontInt(int)>
					i = glyfTableRealSize;
	//  172  300:aload_0         
	//  173  301:getfield        #160 <Field int glyfTableRealSize>
	//  174  304:istore_1        
				} else
	//* 175  305:aload_0         
	//* 176  306:iload_3         
	//* 177  307:invokevirtual   #147 <Method void writeFontInt(int)>
	//* 178  310:aload_0         
	//* 179  311:iload_1         
	//* 180  312:invokevirtual   #147 <Method void writeFontInt(int)>
	//* 181  315:iload_3         
	//* 182  316:iload_1         
	//* 183  317:iconst_3        
	//* 184  318:iadd            
	//* 185  319:bipush          -4
	//* 186  321:iand            
	//* 187  322:iadd            
	//* 188  323:istore_3        
	//* 189  324:goto            265
				if(s1.equals("loca"))
	//* 190  327:aload           7
	//* 191  329:ldc1            #74  <String "loca">
	//* 192  331:invokevirtual   #125 <Method boolean String.equals(Object)>
	//* 193  334:ifeq            357
				{
					writeFontInt(calculateChecksum(newLocaTableOut));
	//  194  337:aload_0         
	//  195  338:aload_0         
	//  196  339:aload_0         
	//  197  340:getfield        #136 <Field byte[] newLocaTableOut>
	//  198  343:invokevirtual   #158 <Method int calculateChecksum(byte[])>
	//  199  346:invokevirtual   #147 <Method void writeFontInt(int)>
					i = locaTableRealSize;
	//  200  349:aload_0         
	//  201  350:getfield        #162 <Field int locaTableRealSize>
	//  202  353:istore_1        
				} else
	//* 203  354:goto            305
				{
					writeFontInt(ai1[0]);
	//  204  357:aload_0         
	//  205  358:aload           8
	//  206  360:iconst_0        
	//  207  361:iaload          
	//  208  362:invokevirtual   #147 <Method void writeFontInt(int)>
					i = ai1[2];
	//  209  365:aload           8
	//  210  367:iconst_2        
	//  211  368:iaload          
	//  212  369:istore_1        
				}
				writeFontInt(k);
				writeFontInt(i);
				k += i + 3 & -4;
			}
			j++;
		}
	//* 213  370:goto            305
		i = 0;
	//  214  373:iconst_0        
	//  215  374:istore_1        
		while(i < as.length) 
	//* 216  375:iload_1         
	//* 217  376:aload           6
	//* 218  378:arraylength     
	//* 219  379:icmpge          572
		{
			String s2 = as[i];
	//  220  382:aload           6
	//  221  384:iload_1         
	//  222  385:aaload          
	//  223  386:astore          7
			int ai2[] = (int[])tableDirectory.get(((Object) (s2)));
	//  224  388:aload_0         
	//  225  389:getfield        #127 <Field HashMap tableDirectory>
	//  226  392:aload           7
	//  227  394:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//  228  397:checkcast       #134 <Class int[]>
	//  229  400:astore          8
			if(ai2 != null)
	//* 230  402:aload           8
	//* 231  404:ifnonnull       414
	//* 232  407:iload_1         
	//* 233  408:iconst_1        
	//* 234  409:iadd            
	//* 235  410:istore_1        
	//* 236  411:goto            375
				if(s2.equals("glyf"))
	//* 237  414:aload           7
	//* 238  416:ldc1            #66  <String "glyf">
	//* 239  418:invokevirtual   #125 <Method boolean String.equals(Object)>
	//* 240  421:ifeq            467
				{
					System.arraycopy(((Object) (newGlyfTable)), 0, ((Object) (outFont)), fontPtr, newGlyfTable.length);
	//  241  424:aload_0         
	//  242  425:getfield        #138 <Field byte[] newGlyfTable>
	//  243  428:iconst_0        
	//  244  429:aload_0         
	//  245  430:getfield        #140 <Field byte[] outFont>
	//  246  433:aload_0         
	//  247  434:getfield        #142 <Field int fontPtr>
	//  248  437:aload_0         
	//  249  438:getfield        #138 <Field byte[] newGlyfTable>
	//  250  441:arraylength     
	//  251  442:invokestatic    #168 <Method void System.arraycopy(Object, int, Object, int, int)>
					fontPtr = fontPtr + newGlyfTable.length;
	//  252  445:aload_0         
	//  253  446:aload_0         
	//  254  447:getfield        #142 <Field int fontPtr>
	//  255  450:aload_0         
	//  256  451:getfield        #138 <Field byte[] newGlyfTable>
	//  257  454:arraylength     
	//  258  455:iadd            
	//  259  456:putfield        #142 <Field int fontPtr>
					newGlyfTable = null;
	//  260  459:aload_0         
	//  261  460:aconst_null     
	//  262  461:putfield        #138 <Field byte[] newGlyfTable>
				} else
	//* 263  464:goto            407
				if(s2.equals("loca"))
	//* 264  467:aload           7
	//* 265  469:ldc1            #74  <String "loca">
	//* 266  471:invokevirtual   #125 <Method boolean String.equals(Object)>
	//* 267  474:ifeq            520
				{
					System.arraycopy(((Object) (newLocaTableOut)), 0, ((Object) (outFont)), fontPtr, newLocaTableOut.length);
	//  268  477:aload_0         
	//  269  478:getfield        #136 <Field byte[] newLocaTableOut>
	//  270  481:iconst_0        
	//  271  482:aload_0         
	//  272  483:getfield        #140 <Field byte[] outFont>
	//  273  486:aload_0         
	//  274  487:getfield        #142 <Field int fontPtr>
	//  275  490:aload_0         
	//  276  491:getfield        #136 <Field byte[] newLocaTableOut>
	//  277  494:arraylength     
	//  278  495:invokestatic    #168 <Method void System.arraycopy(Object, int, Object, int, int)>
					fontPtr = fontPtr + newLocaTableOut.length;
	//  279  498:aload_0         
	//  280  499:aload_0         
	//  281  500:getfield        #142 <Field int fontPtr>
	//  282  503:aload_0         
	//  283  504:getfield        #136 <Field byte[] newLocaTableOut>
	//  284  507:arraylength     
	//  285  508:iadd            
	//  286  509:putfield        #142 <Field int fontPtr>
					newLocaTableOut = null;
	//  287  512:aload_0         
	//  288  513:aconst_null     
	//  289  514:putfield        #136 <Field byte[] newLocaTableOut>
				} else
	//* 290  517:goto            407
				{
					rf.seek(ai2[1]);
	//  291  520:aload_0         
	//  292  521:getfield        #101 <Field RandomAccessFileOrArray rf>
	//  293  524:aload           8
	//  294  526:iconst_1        
	//  295  527:iaload          
	//  296  528:i2l             
	//  297  529:invokevirtual   #174 <Method void RandomAccessFileOrArray.seek(long)>
					rf.readFully(outFont, fontPtr, ai2[2]);
	//  298  532:aload_0         
	//  299  533:getfield        #101 <Field RandomAccessFileOrArray rf>
	//  300  536:aload_0         
	//  301  537:getfield        #140 <Field byte[] outFont>
	//  302  540:aload_0         
	//  303  541:getfield        #142 <Field int fontPtr>
	//  304  544:aload           8
	//  305  546:iconst_2        
	//  306  547:iaload          
	//  307  548:invokevirtual   #178 <Method void RandomAccessFileOrArray.readFully(byte[], int, int)>
					fontPtr = fontPtr + (ai2[2] + 3 & -4);
	//  308  551:aload_0         
	//  309  552:aload_0         
	//  310  553:getfield        #142 <Field int fontPtr>
	//  311  556:aload           8
	//  312  558:iconst_2        
	//  313  559:iaload          
	//  314  560:iconst_3        
	//  315  561:iadd            
	//  316  562:bipush          -4
	//  317  564:iand            
	//  318  565:iadd            
	//  319  566:putfield        #142 <Field int fontPtr>
				}
			i++;
		}
	//* 320  569:goto            407
	//  321  572:return          
	}

	protected int calculateChecksum(byte abyte0[])
	{
		int k1 = abyte0.length / 4;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:iconst_4        
	//    3    3:idiv            
	//    4    4:istore          8
		int i = 0;
	//    5    6:iconst_0        
	//    6    7:istore_2        
		int k = 0;
	//    7    8:iconst_0        
	//    8    9:istore          4
		int l = 0;
	//    9   11:iconst_0        
	//   10   12:istore          5
		int j1 = 0;
	//   11   14:iconst_0        
	//   12   15:istore          7
		int j = 0;
	//   13   17:iconst_0        
	//   14   18:istore_3        
		int i1 = 0;
	//   15   19:iconst_0        
	//   16   20:istore          6
		for(; j < k1; j++)
	//*  17   22:iload_3         
	//*  18   23:iload           8
	//*  19   25:icmpge          109
		{
			int l1 = i1 + 1;
	//   20   28:iload           6
	//   21   30:iconst_1        
	//   22   31:iadd            
	//   23   32:istore          9
			j1 += abyte0[i1] & 0xff;
	//   24   34:iload           7
	//   25   36:aload_1         
	//   26   37:iload           6
	//   27   39:baload          
	//   28   40:sipush          255
	//   29   43:iand            
	//   30   44:iadd            
	//   31   45:istore          7
			i1 = l1 + 1;
	//   32   47:iload           9
	//   33   49:iconst_1        
	//   34   50:iadd            
	//   35   51:istore          6
			l += abyte0[l1] & 0xff;
	//   36   53:iload           5
	//   37   55:aload_1         
	//   38   56:iload           9
	//   39   58:baload          
	//   40   59:sipush          255
	//   41   62:iand            
	//   42   63:iadd            
	//   43   64:istore          5
			l1 = i1 + 1;
	//   44   66:iload           6
	//   45   68:iconst_1        
	//   46   69:iadd            
	//   47   70:istore          9
			k += abyte0[i1] & 0xff;
	//   48   72:iload           4
	//   49   74:aload_1         
	//   50   75:iload           6
	//   51   77:baload          
	//   52   78:sipush          255
	//   53   81:iand            
	//   54   82:iadd            
	//   55   83:istore          4
			i1 = l1 + 1;
	//   56   85:iload           9
	//   57   87:iconst_1        
	//   58   88:iadd            
	//   59   89:istore          6
			i += abyte0[l1] & 0xff;
	//   60   91:iload_2         
	//   61   92:aload_1         
	//   62   93:iload           9
	//   63   95:baload          
	//   64   96:sipush          255
	//   65   99:iand            
	//   66  100:iadd            
	//   67  101:istore_2        
		}

	//   68  102:iload_3         
	//   69  103:iconst_1        
	//   70  104:iadd            
	//   71  105:istore_3        
	//*  72  106:goto            22
		return (k << 8) + i + (l << 16) + (j1 << 24);
	//   73  109:iload           4
	//   74  111:bipush          8
	//   75  113:ishl            
	//   76  114:iload_2         
	//   77  115:iadd            
	//   78  116:iload           5
	//   79  118:bipush          16
	//   80  120:ishl            
	//   81  121:iadd            
	//   82  122:iload           7
	//   83  124:bipush          24
	//   84  126:ishl            
	//   85  127:iadd            
	//   86  128:ireturn         
	}

	protected void checkGlyphComposite(int i)
		throws IOException
	{
		int j = locaTable[i];
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field int[] locaTable>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:istore_2        
		if(j != locaTable[i + 1]) goto _L2; else goto _L1
	//    5    7:iload_2         
	//    6    8:aload_0         
	//    7    9:getfield        #182 <Field int[] locaTable>
	//    8   12:iload_1         
	//    9   13:iconst_1        
	//   10   14:iadd            
	//   11   15:iaload          
	//   12   16:icmpne          20
_L1:
		return;
	//   13   19:return          
_L2:
		rf.seek(tableGlyphOffset + j);
	//   14   20:aload_0         
	//   15   21:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   16   24:aload_0         
	//   17   25:getfield        #184 <Field int tableGlyphOffset>
	//   18   28:iload_2         
	//   19   29:iadd            
	//   20   30:i2l             
	//   21   31:invokevirtual   #174 <Method void RandomAccessFileOrArray.seek(long)>
		if(rf.readShort() >= 0)
			continue;
	//   22   34:aload_0         
	//   23   35:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   24   38:invokevirtual   #188 <Method short RandomAccessFileOrArray.readShort()>
	//   25   41:ifge            19
		rf.skipBytes(8);
	//   26   44:aload_0         
	//   27   45:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   28   48:bipush          8
	//   29   50:invokevirtual   #192 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   30   53:pop             
		do
		{
			int l = rf.readUnsignedShort();
	//   31   54:aload_0         
	//   32   55:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   33   58:invokevirtual   #196 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   34   61:istore_3        
			Integer integer = Integer.valueOf(rf.readUnsignedShort());
	//   35   62:aload_0         
	//   36   63:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   37   66:invokevirtual   #196 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   38   69:invokestatic    #202 <Method Integer Integer.valueOf(int)>
	//   39   72:astore          4
			if(!glyphsUsed.contains(((Object) (integer))))
	//*  40   74:aload_0         
	//*  41   75:getfield        #103 <Field HashSet glyphsUsed>
	//*  42   78:aload           4
	//*  43   80:invokevirtual   #207 <Method boolean HashSet.contains(Object)>
	//*  44   83:ifne            106
			{
				glyphsUsed.add(((Object) (integer)));
	//   45   86:aload_0         
	//   46   87:getfield        #103 <Field HashSet glyphsUsed>
	//   47   90:aload           4
	//   48   92:invokevirtual   #210 <Method boolean HashSet.add(Object)>
	//   49   95:pop             
				glyphsInList.add(((Object) (integer)));
	//   50   96:aload_0         
	//   51   97:getfield        #116 <Field ArrayList glyphsInList>
	//   52  100:aload           4
	//   53  102:invokevirtual   #211 <Method boolean ArrayList.add(Object)>
	//   54  105:pop             
			}
			if((l & 0x20) == 0)
				continue;
	//   55  106:iload_3         
	//   56  107:bipush          32
	//   57  109:iand            
	//   58  110:ifeq            19
			int k;
			if((l & 1) != 0)
	//*  59  113:iload_3         
	//*  60  114:iconst_1        
	//*  61  115:iand            
	//*  62  116:ifeq            159
				k = 4;
	//   63  119:iconst_4        
	//   64  120:istore_2        
			else
	//*  65  121:iload_3         
	//*  66  122:bipush          8
	//*  67  124:iand            
	//*  68  125:ifeq            164
	//*  69  128:iload_2         
	//*  70  129:iconst_2        
	//*  71  130:iadd            
	//*  72  131:istore_1        
	//*  73  132:iload_1         
	//*  74  133:istore_2        
	//*  75  134:iload_3         
	//*  76  135:sipush          128
	//*  77  138:iand            
	//*  78  139:ifeq            147
	//*  79  142:iload_1         
	//*  80  143:bipush          8
	//*  81  145:iadd            
	//*  82  146:istore_2        
	//*  83  147:aload_0         
	//*  84  148:getfield        #101 <Field RandomAccessFileOrArray rf>
	//*  85  151:iload_2         
	//*  86  152:invokevirtual   #192 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//*  87  155:pop             
	//*  88  156:goto            54
				k = 2;
	//   89  159:iconst_2        
	//   90  160:istore_2        
			if((l & 8) != 0)
			{
				i = k + 2;
			} else
	//*  91  161:goto            121
			{
				i = k;
	//   92  164:iload_2         
	//   93  165:istore_1        
				if((l & 0x40) != 0)
	//*  94  166:iload_3         
	//*  95  167:bipush          64
	//*  96  169:iand            
	//*  97  170:ifeq            132
					i = k + 4;
	//   98  173:iload_2         
	//   99  174:iconst_4        
	//  100  175:iadd            
	//  101  176:istore_1        
			}
			k = i;
			if((l & 0x80) != 0)
				k = i + 8;
			rf.skipBytes(k);
		} while(true);
	//  102  177:goto            132
		if(true) goto _L1; else goto _L3
_L3:
	}

	protected void createNewGlyphTables()
		throws IOException
	{
		newLocaTable = new int[locaTable.length];
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #182 <Field int[] locaTable>
	//    3    5:arraylength     
	//    4    6:newarray        int[]
	//    5    8:putfield        #214 <Field int[] newLocaTable>
		int ai[] = new int[glyphsInList.size()];
	//    6   11:aload_0         
	//    7   12:getfield        #116 <Field ArrayList glyphsInList>
	//    8   15:invokevirtual   #217 <Method int ArrayList.size()>
	//    9   18:newarray        int[]
	//   10   20:astore          8
		for(int i = 0; i < ai.length; i++)
	//*  11   22:iconst_0        
	//*  12   23:istore_1        
	//*  13   24:iload_1         
	//*  14   25:aload           8
	//*  15   27:arraylength     
	//*  16   28:icmpge          56
			ai[i] = ((Integer)glyphsInList.get(i)).intValue();
	//   17   31:aload           8
	//   18   33:iload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #116 <Field ArrayList glyphsInList>
	//   21   38:iload_1         
	//   22   39:invokevirtual   #220 <Method Object ArrayList.get(int)>
	//   23   42:checkcast       #198 <Class Integer>
	//   24   45:invokevirtual   #223 <Method int Integer.intValue()>
	//   25   48:iastore         

	//   26   49:iload_1         
	//   27   50:iconst_1        
	//   28   51:iadd            
	//   29   52:istore_1        
	//*  30   53:goto            24
		Arrays.sort(ai);
	//   31   56:aload           8
	//   32   58:invokestatic    #229 <Method void Arrays.sort(int[])>
		int l = 0;
	//   33   61:iconst_0        
	//   34   62:istore_2        
		for(int j = 0; j < ai.length; j++)
	//*  35   63:iconst_0        
	//*  36   64:istore_1        
	//*  37   65:iload_1         
	//*  38   66:aload           8
	//*  39   68:arraylength     
	//*  40   69:icmpge          102
		{
			int j1 = ai[j];
	//   41   72:aload           8
	//   42   74:iload_1         
	//   43   75:iaload          
	//   44   76:istore_3        
			l += locaTable[j1 + 1] - locaTable[j1];
	//   45   77:iload_2         
	//   46   78:aload_0         
	//   47   79:getfield        #182 <Field int[] locaTable>
	//   48   82:iload_3         
	//   49   83:iconst_1        
	//   50   84:iadd            
	//   51   85:iaload          
	//   52   86:aload_0         
	//   53   87:getfield        #182 <Field int[] locaTable>
	//   54   90:iload_3         
	//   55   91:iaload          
	//   56   92:isub            
	//   57   93:iadd            
	//   58   94:istore_2        
		}

	//   59   95:iload_1         
	//   60   96:iconst_1        
	//   61   97:iadd            
	//   62   98:istore_1        
	//*  63   99:goto            65
		glyfTableRealSize = l;
	//   64  102:aload_0         
	//   65  103:iload_2         
	//   66  104:putfield        #160 <Field int glyfTableRealSize>
		newGlyfTable = new byte[l + 3 & -4];
	//   67  107:aload_0         
	//   68  108:iload_2         
	//   69  109:iconst_3        
	//   70  110:iadd            
	//   71  111:bipush          -4
	//   72  113:iand            
	//   73  114:newarray        byte[]
	//   74  116:putfield        #138 <Field byte[] newGlyfTable>
		int k1 = 0;
	//   75  119:iconst_0        
	//   76  120:istore_3        
		int i2 = 0;
	//   77  121:iconst_0        
	//   78  122:istore          5
		for(int k = 0; k < newLocaTable.length;)
	//*  79  124:iconst_0        
	//*  80  125:istore_1        
	//*  81  126:iload_1         
	//*  82  127:aload_0         
	//*  83  128:getfield        #214 <Field int[] newLocaTable>
	//*  84  131:arraylength     
	//*  85  132:icmpge          267
		{
			newLocaTable[k] = k1;
	//   86  135:aload_0         
	//   87  136:getfield        #214 <Field int[] newLocaTable>
	//   88  139:iload_1         
	//   89  140:iload_3         
	//   90  141:iastore         
			int l1 = k1;
	//   91  142:iload_3         
	//   92  143:istore          4
			int i1 = i2;
	//   93  145:iload           5
	//   94  147:istore_2        
			if(i2 < ai.length)
	//*  95  148:iload           5
	//*  96  150:aload           8
	//*  97  152:arraylength     
	//*  98  153:icmpge          254
			{
				l1 = k1;
	//   99  156:iload_3         
	//  100  157:istore          4
				i1 = i2;
	//  101  159:iload           5
	//  102  161:istore_2        
				if(ai[i2] == k)
	//* 103  162:aload           8
	//* 104  164:iload           5
	//* 105  166:iaload          
	//* 106  167:iload_1         
	//* 107  168:icmpne          254
				{
					i2++;
	//  108  171:iload           5
	//  109  173:iconst_1        
	//  110  174:iadd            
	//  111  175:istore          5
					newLocaTable[k] = k1;
	//  112  177:aload_0         
	//  113  178:getfield        #214 <Field int[] newLocaTable>
	//  114  181:iload_1         
	//  115  182:iload_3         
	//  116  183:iastore         
					int j2 = locaTable[k];
	//  117  184:aload_0         
	//  118  185:getfield        #182 <Field int[] locaTable>
	//  119  188:iload_1         
	//  120  189:iaload          
	//  121  190:istore          6
					int k2 = locaTable[k + 1] - j2;
	//  122  192:aload_0         
	//  123  193:getfield        #182 <Field int[] locaTable>
	//  124  196:iload_1         
	//  125  197:iconst_1        
	//  126  198:iadd            
	//  127  199:iaload          
	//  128  200:iload           6
	//  129  202:isub            
	//  130  203:istore          7
					l1 = k1;
	//  131  205:iload_3         
	//  132  206:istore          4
					i1 = i2;
	//  133  208:iload           5
	//  134  210:istore_2        
					if(k2 > 0)
	//* 135  211:iload           7
	//* 136  213:ifle            254
					{
						rf.seek(tableGlyphOffset + j2);
	//  137  216:aload_0         
	//  138  217:getfield        #101 <Field RandomAccessFileOrArray rf>
	//  139  220:aload_0         
	//  140  221:getfield        #184 <Field int tableGlyphOffset>
	//  141  224:iload           6
	//  142  226:iadd            
	//  143  227:i2l             
	//  144  228:invokevirtual   #174 <Method void RandomAccessFileOrArray.seek(long)>
						rf.readFully(newGlyfTable, k1, k2);
	//  145  231:aload_0         
	//  146  232:getfield        #101 <Field RandomAccessFileOrArray rf>
	//  147  235:aload_0         
	//  148  236:getfield        #138 <Field byte[] newGlyfTable>
	//  149  239:iload_3         
	//  150  240:iload           7
	//  151  242:invokevirtual   #178 <Method void RandomAccessFileOrArray.readFully(byte[], int, int)>
						l1 = k1 + k2;
	//  152  245:iload_3         
	//  153  246:iload           7
	//  154  248:iadd            
	//  155  249:istore          4
						i1 = i2;
	//  156  251:iload           5
	//  157  253:istore_2        
					}
				}
			}
			k++;
	//  158  254:iload_1         
	//  159  255:iconst_1        
	//  160  256:iadd            
	//  161  257:istore_1        
			k1 = l1;
	//  162  258:iload           4
	//  163  260:istore_3        
			i2 = i1;
	//  164  261:iload_2         
	//  165  262:istore          5
		}

	//* 166  264:goto            126
	//  167  267:return          
	}

	protected void createTableDirectory()
		throws IOException, DocumentException
	{
		tableDirectory = new HashMap();
	//    0    0:aload_0         
	//    1    1:new             #129 <Class HashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #233 <Method void HashMap()>
	//    4    8:putfield        #127 <Field HashMap tableDirectory>
		rf.seek(directoryOffset);
	//    5   11:aload_0         
	//    6   12:getfield        #101 <Field RandomAccessFileOrArray rf>
	//    7   15:aload_0         
	//    8   16:getfield        #109 <Field int directoryOffset>
	//    9   19:i2l             
	//   10   20:invokevirtual   #174 <Method void RandomAccessFileOrArray.seek(long)>
		if(rf.readInt() != 0x10000)
	//*  11   23:aload_0         
	//*  12   24:getfield        #101 <Field RandomAccessFileOrArray rf>
	//*  13   27:invokevirtual   #236 <Method int RandomAccessFileOrArray.readInt()>
	//*  14   30:ldc1            #143 <Int 0x10000>
	//*  15   32:icmpeq          59
			throw new DocumentException(MessageLocalization.getComposedMessage("1.is.not.a.true.type.file", new Object[] {
				fileName
			}));
	//   16   35:new             #232 <Class DocumentException>
	//   17   38:dup             
	//   18   39:ldc1            #238 <String "1.is.not.a.true.type.file">
	//   19   41:iconst_1        
	//   20   42:anewarray       Object[]
	//   21   45:dup             
	//   22   46:iconst_0        
	//   23   47:aload_0         
	//   24   48:getfield        #99  <Field String fileName>
	//   25   51:aastore         
	//   26   52:invokestatic    #244 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   27   55:invokespecial   #246 <Method void DocumentException(String)>
	//   28   58:athrow          
		int j = rf.readUnsignedShort();
	//   29   59:aload_0         
	//   30   60:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   31   63:invokevirtual   #196 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//   32   66:istore_2        
		rf.skipBytes(6);
	//   33   67:aload_0         
	//   34   68:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   35   71:bipush          6
	//   36   73:invokevirtual   #192 <Method int RandomAccessFileOrArray.skipBytes(int)>
	//   37   76:pop             
		for(int i = 0; i < j; i++)
	//*  38   77:iconst_0        
	//*  39   78:istore_1        
	//*  40   79:iload_1         
	//*  41   80:iload_2         
	//*  42   81:icmpge          151
		{
			String s = readStandardString(4);
	//   43   84:aload_0         
	//   44   85:iconst_4        
	//   45   86:invokevirtual   #250 <Method String readStandardString(int)>
	//   46   89:astore          6
			int k = rf.readInt();
	//   47   91:aload_0         
	//   48   92:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   49   95:invokevirtual   #236 <Method int RandomAccessFileOrArray.readInt()>
	//   50   98:istore_3        
			int l = rf.readInt();
	//   51   99:aload_0         
	//   52  100:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   53  103:invokevirtual   #236 <Method int RandomAccessFileOrArray.readInt()>
	//   54  106:istore          4
			int i1 = rf.readInt();
	//   55  108:aload_0         
	//   56  109:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   57  112:invokevirtual   #236 <Method int RandomAccessFileOrArray.readInt()>
	//   58  115:istore          5
			tableDirectory.put(((Object) (s)), ((Object) (new int[] {
				k, l, i1
			})));
	//   59  117:aload_0         
	//   60  118:getfield        #127 <Field HashMap tableDirectory>
	//   61  121:aload           6
	//   62  123:iconst_3        
	//   63  124:newarray        int[]
	//   64  126:dup             
	//   65  127:iconst_0        
	//   66  128:iload_3         
	//   67  129:iastore         
	//   68  130:dup             
	//   69  131:iconst_1        
	//   70  132:iload           4
	//   71  134:iastore         
	//   72  135:dup             
	//   73  136:iconst_2        
	//   74  137:iload           5
	//   75  139:iastore         
	//   76  140:invokevirtual   #254 <Method Object HashMap.put(Object, Object)>
	//   77  143:pop             
		}

	//   78  144:iload_1         
	//   79  145:iconst_1        
	//   80  146:iadd            
	//   81  147:istore_1        
	//*  82  148:goto            79
	//   83  151:return          
	}

	protected void flatGlyphs()
		throws IOException, DocumentException
	{
		int ai[] = (int[])tableDirectory.get("glyf");
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field HashMap tableDirectory>
	//    2    4:ldc1            #66  <String "glyf">
	//    3    6:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #134 <Class int[]>
	//    5   12:astore_2        
		if(ai == null)
	//*   6   13:aload_2         
	//*   7   14:ifnonnull       47
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"glyf", fileName
			}));
	//    8   17:new             #232 <Class DocumentException>
	//    9   20:dup             
	//   10   21:ldc2            #257 <String "table.1.does.not.exist.in.2">
	//   11   24:iconst_2        
	//   12   25:anewarray       Object[]
	//   13   28:dup             
	//   14   29:iconst_0        
	//   15   30:ldc1            #66  <String "glyf">
	//   16   32:aastore         
	//   17   33:dup             
	//   18   34:iconst_1        
	//   19   35:aload_0         
	//   20   36:getfield        #99  <Field String fileName>
	//   21   39:aastore         
	//   22   40:invokestatic    #244 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   23   43:invokespecial   #246 <Method void DocumentException(String)>
	//   24   46:athrow          
		Integer integer = Integer.valueOf(0);
	//   25   47:iconst_0        
	//   26   48:invokestatic    #202 <Method Integer Integer.valueOf(int)>
	//   27   51:astore_3        
		if(!glyphsUsed.contains(((Object) (integer))))
	//*  28   52:aload_0         
	//*  29   53:getfield        #103 <Field HashSet glyphsUsed>
	//*  30   56:aload_3         
	//*  31   57:invokevirtual   #207 <Method boolean HashSet.contains(Object)>
	//*  32   60:ifne            81
		{
			glyphsUsed.add(((Object) (integer)));
	//   33   63:aload_0         
	//   34   64:getfield        #103 <Field HashSet glyphsUsed>
	//   35   67:aload_3         
	//   36   68:invokevirtual   #210 <Method boolean HashSet.add(Object)>
	//   37   71:pop             
			glyphsInList.add(((Object) (integer)));
	//   38   72:aload_0         
	//   39   73:getfield        #116 <Field ArrayList glyphsInList>
	//   40   76:aload_3         
	//   41   77:invokevirtual   #211 <Method boolean ArrayList.add(Object)>
	//   42   80:pop             
		}
		tableGlyphOffset = ai[1];
	//   43   81:aload_0         
	//   44   82:aload_2         
	//   45   83:iconst_1        
	//   46   84:iaload          
	//   47   85:putfield        #184 <Field int tableGlyphOffset>
		for(int i = 0; i < glyphsInList.size(); i++)
	//*  48   88:iconst_0        
	//*  49   89:istore_1        
	//*  50   90:iload_1         
	//*  51   91:aload_0         
	//*  52   92:getfield        #116 <Field ArrayList glyphsInList>
	//*  53   95:invokevirtual   #217 <Method int ArrayList.size()>
	//*  54   98:icmpge          126
			checkGlyphComposite(((Integer)glyphsInList.get(i)).intValue());
	//   55  101:aload_0         
	//   56  102:aload_0         
	//   57  103:getfield        #116 <Field ArrayList glyphsInList>
	//   58  106:iload_1         
	//   59  107:invokevirtual   #220 <Method Object ArrayList.get(int)>
	//   60  110:checkcast       #198 <Class Integer>
	//   61  113:invokevirtual   #223 <Method int Integer.intValue()>
	//   62  116:invokevirtual   #259 <Method void checkGlyphComposite(int)>

	//   63  119:iload_1         
	//   64  120:iconst_1        
	//   65  121:iadd            
	//   66  122:istore_1        
	//*  67  123:goto            90
	//   68  126:return          
	}

	protected void locaTobytes()
	{
		int i;
		if(locaShortTable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #262 <Field boolean locaShortTable>
	//*   2    4:ifeq            83
			locaTableRealSize = newLocaTable.length * 2;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #214 <Field int[] newLocaTable>
	//    6   12:arraylength     
	//    7   13:iconst_2        
	//    8   14:imul            
	//    9   15:putfield        #162 <Field int locaTableRealSize>
		else
	//*  10   18:aload_0         
	//*  11   19:aload_0         
	//*  12   20:getfield        #162 <Field int locaTableRealSize>
	//*  13   23:iconst_3        
	//*  14   24:iadd            
	//*  15   25:bipush          -4
	//*  16   27:iand            
	//*  17   28:newarray        byte[]
	//*  18   30:putfield        #136 <Field byte[] newLocaTableOut>
	//*  19   33:aload_0         
	//*  20   34:aload_0         
	//*  21   35:getfield        #136 <Field byte[] newLocaTableOut>
	//*  22   38:putfield        #140 <Field byte[] outFont>
	//*  23   41:aload_0         
	//*  24   42:iconst_0        
	//*  25   43:putfield        #142 <Field int fontPtr>
	//*  26   46:iconst_0        
	//*  27   47:istore_1        
	//*  28   48:iload_1         
	//*  29   49:aload_0         
	//*  30   50:getfield        #214 <Field int[] newLocaTable>
	//*  31   53:arraylength     
	//*  32   54:icmpge          110
	//*  33   57:aload_0         
	//*  34   58:getfield        #262 <Field boolean locaShortTable>
	//*  35   61:ifeq            97
	//*  36   64:aload_0         
	//*  37   65:aload_0         
	//*  38   66:getfield        #214 <Field int[] newLocaTable>
	//*  39   69:iload_1         
	//*  40   70:iaload          
	//*  41   71:iconst_2        
	//*  42   72:idiv            
	//*  43   73:invokevirtual   #150 <Method void writeFontShort(int)>
	//*  44   76:iload_1         
	//*  45   77:iconst_1        
	//*  46   78:iadd            
	//*  47   79:istore_1        
	//*  48   80:goto            48
			locaTableRealSize = newLocaTable.length * 4;
	//   49   83:aload_0         
	//   50   84:aload_0         
	//   51   85:getfield        #214 <Field int[] newLocaTable>
	//   52   88:arraylength     
	//   53   89:iconst_4        
	//   54   90:imul            
	//   55   91:putfield        #162 <Field int locaTableRealSize>
		newLocaTableOut = new byte[locaTableRealSize + 3 & -4];
		outFont = newLocaTableOut;
		fontPtr = 0;
		i = 0;
		while(i < newLocaTable.length) 
		{
			if(locaShortTable)
				writeFontShort(newLocaTable[i] / 2);
			else
	//*  56   94:goto            18
				writeFontInt(newLocaTable[i]);
	//   57   97:aload_0         
	//   58   98:aload_0         
	//   59   99:getfield        #214 <Field int[] newLocaTable>
	//   60  102:iload_1         
	//   61  103:iaload          
	//   62  104:invokevirtual   #147 <Method void writeFontInt(int)>
			i++;
		}
	//*  63  107:goto            76
	//   64  110:return          
	}

	byte[] process()
		throws IOException, DocumentException
	{
		byte abyte0[];
		rf.reOpen();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field RandomAccessFileOrArray rf>
	//    2    4:invokevirtual   #269 <Method void RandomAccessFileOrArray.reOpen()>
		createTableDirectory();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #271 <Method void createTableDirectory()>
		readLoca();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #274 <Method void readLoca()>
		flatGlyphs();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #276 <Method void flatGlyphs()>
		createNewGlyphTables();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #278 <Method void createNewGlyphTables()>
		locaTobytes();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #280 <Method void locaTobytes()>
		assembleFont();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #282 <Method void assembleFont()>
		abyte0 = outFont;
	//   15   31:aload_0         
	//   16   32:getfield        #140 <Field byte[] outFont>
	//   17   35:astore_1        
		Exception exception;
		try
		{
			rf.close();
	//   18   36:aload_0         
	//   19   37:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   20   40:invokevirtual   #285 <Method void RandomAccessFileOrArray.close()>
		}
	//*  21   43:aload_1         
	//*  22   44:areturn         
	//*  23   45:astore_1        
	//*  24   46:aload_0         
	//*  25   47:getfield        #101 <Field RandomAccessFileOrArray rf>
	//*  26   50:invokevirtual   #285 <Method void RandomAccessFileOrArray.close()>
	//*  27   53:aload_1         
	//*  28   54:athrow          
	//*  29   55:astore_2        
	//*  30   56:goto            53
		catch(Exception exception1)
	//*  31   59:astore_2        
		{
			return abyte0;
	//   32   60:aload_1         
	//   33   61:areturn         
		}
		return abyte0;
		abyte0;
		try
		{
			rf.close();
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception) { }
		throw abyte0;
	}

	protected void readLoca()
		throws IOException, DocumentException
	{
		int ai[] = (int[])tableDirectory.get("head");
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field HashMap tableDirectory>
	//    2    4:ldc1            #68  <String "head">
	//    3    6:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//    4    9:checkcast       #134 <Class int[]>
	//    5   12:astore          4
		if(ai == null)
	//*   6   14:aload           4
	//*   7   16:ifnonnull       49
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"head", fileName
			}));
	//    8   19:new             #232 <Class DocumentException>
	//    9   22:dup             
	//   10   23:ldc2            #257 <String "table.1.does.not.exist.in.2">
	//   11   26:iconst_2        
	//   12   27:anewarray       Object[]
	//   13   30:dup             
	//   14   31:iconst_0        
	//   15   32:ldc1            #68  <String "head">
	//   16   34:aastore         
	//   17   35:dup             
	//   18   36:iconst_1        
	//   19   37:aload_0         
	//   20   38:getfield        #99  <Field String fileName>
	//   21   41:aastore         
	//   22   42:invokestatic    #244 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   23   45:invokespecial   #246 <Method void DocumentException(String)>
	//   24   48:athrow          
		rf.seek(ai[1] + 51);
	//   25   49:aload_0         
	//   26   50:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   27   53:aload           4
	//   28   55:iconst_1        
	//   29   56:iaload          
	//   30   57:bipush          51
	//   31   59:iadd            
	//   32   60:i2l             
	//   33   61:invokevirtual   #174 <Method void RandomAccessFileOrArray.seek(long)>
		boolean flag;
		if(rf.readUnsignedShort() == 0)
	//*  34   64:aload_0         
	//*  35   65:getfield        #101 <Field RandomAccessFileOrArray rf>
	//*  36   68:invokevirtual   #196 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//*  37   71:ifne            130
			flag = true;
	//   38   74:iconst_1        
	//   39   75:istore_3        
		else
	//*  40   76:aload_0         
	//*  41   77:iload_3         
	//*  42   78:putfield        #262 <Field boolean locaShortTable>
	//*  43   81:aload_0         
	//*  44   82:getfield        #127 <Field HashMap tableDirectory>
	//*  45   85:ldc1            #74  <String "loca">
	//*  46   87:invokevirtual   #133 <Method Object HashMap.get(Object)>
	//*  47   90:checkcast       #134 <Class int[]>
	//*  48   93:astore          4
	//*  49   95:aload           4
	//*  50   97:ifnonnull       135
	//*  51  100:new             #232 <Class DocumentException>
	//*  52  103:dup             
	//*  53  104:ldc2            #257 <String "table.1.does.not.exist.in.2">
	//*  54  107:iconst_2        
	//*  55  108:anewarray       Object[]
	//*  56  111:dup             
	//*  57  112:iconst_0        
	//*  58  113:ldc1            #74  <String "loca">
	//*  59  115:aastore         
	//*  60  116:dup             
	//*  61  117:iconst_1        
	//*  62  118:aload_0         
	//*  63  119:getfield        #99  <Field String fileName>
	//*  64  122:aastore         
	//*  65  123:invokestatic    #244 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  66  126:invokespecial   #246 <Method void DocumentException(String)>
	//*  67  129:athrow          
			flag = false;
	//   68  130:iconst_0        
	//   69  131:istore_3        
		locaShortTable = flag;
		ai = (int[])tableDirectory.get("loca");
		if(ai == null)
			throw new DocumentException(MessageLocalization.getComposedMessage("table.1.does.not.exist.in.2", new Object[] {
				"loca", fileName
			}));
	//*  70  132:goto            76
		rf.seek(ai[1]);
	//   71  135:aload_0         
	//   72  136:getfield        #101 <Field RandomAccessFileOrArray rf>
	//   73  139:aload           4
	//   74  141:iconst_1        
	//   75  142:iaload          
	//   76  143:i2l             
	//   77  144:invokevirtual   #174 <Method void RandomAccessFileOrArray.seek(long)>
		if(locaShortTable)
	//*  78  147:aload_0         
	//*  79  148:getfield        #262 <Field boolean locaShortTable>
	//*  80  151:ifeq            197
		{
			int k = ai[2] / 2;
	//   81  154:aload           4
	//   82  156:iconst_2        
	//   83  157:iaload          
	//   84  158:iconst_2        
	//   85  159:idiv            
	//   86  160:istore_2        
			locaTable = new int[k];
	//   87  161:aload_0         
	//   88  162:iload_2         
	//   89  163:newarray        int[]
	//   90  165:putfield        #182 <Field int[] locaTable>
			for(int i = 0; i < k; i++)
	//*  91  168:iconst_0        
	//*  92  169:istore_1        
	//*  93  170:iload_1         
	//*  94  171:iload_2         
	//*  95  172:icmpge          238
				locaTable[i] = rf.readUnsignedShort() * 2;
	//   96  175:aload_0         
	//   97  176:getfield        #182 <Field int[] locaTable>
	//   98  179:iload_1         
	//   99  180:aload_0         
	//  100  181:getfield        #101 <Field RandomAccessFileOrArray rf>
	//  101  184:invokevirtual   #196 <Method int RandomAccessFileOrArray.readUnsignedShort()>
	//  102  187:iconst_2        
	//  103  188:imul            
	//  104  189:iastore         

	//  105  190:iload_1         
	//  106  191:iconst_1        
	//  107  192:iadd            
	//  108  193:istore_1        
		} else
	//* 109  194:goto            170
		{
			int l = ai[2] / 4;
	//  110  197:aload           4
	//  111  199:iconst_2        
	//  112  200:iaload          
	//  113  201:iconst_4        
	//  114  202:idiv            
	//  115  203:istore_2        
			locaTable = new int[l];
	//  116  204:aload_0         
	//  117  205:iload_2         
	//  118  206:newarray        int[]
	//  119  208:putfield        #182 <Field int[] locaTable>
			for(int j = 0; j < l; j++)
	//* 120  211:iconst_0        
	//* 121  212:istore_1        
	//* 122  213:iload_1         
	//* 123  214:iload_2         
	//* 124  215:icmpge          238
				locaTable[j] = rf.readInt();
	//  125  218:aload_0         
	//  126  219:getfield        #182 <Field int[] locaTable>
	//  127  222:iload_1         
	//  128  223:aload_0         
	//  129  224:getfield        #101 <Field RandomAccessFileOrArray rf>
	//  130  227:invokevirtual   #236 <Method int RandomAccessFileOrArray.readInt()>
	//  131  230:iastore         

	//  132  231:iload_1         
	//  133  232:iconst_1        
	//  134  233:iadd            
	//  135  234:istore_1        
		}
	//* 136  235:goto            213
	//  137  238:return          
	}

	protected String readStandardString(int i)
		throws IOException
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		rf.readFully(abyte0);
	//    3    4:aload_0         
	//    4    5:getfield        #101 <Field RandomAccessFileOrArray rf>
	//    5    8:aload_2         
	//    6    9:invokevirtual   #288 <Method void RandomAccessFileOrArray.readFully(byte[])>
		String s;
		try
		{
			s = new String(abyte0, "Cp1252");
	//    7   12:new             #60  <Class String>
	//    8   15:dup             
	//    9   16:aload_2         
	//   10   17:ldc2            #290 <String "Cp1252">
	//   11   20:invokespecial   #293 <Method void String(byte[], String)>
	//   12   23:astore_2        
		}
	//*  13   24:aload_2         
	//*  14   25:areturn         
		catch(Exception exception)
	//*  15   26:astore_2        
		{
			throw new ExceptionConverter(exception);
	//   16   27:new             #295 <Class ExceptionConverter>
	//   17   30:dup             
	//   18   31:aload_2         
	//   19   32:invokespecial   #298 <Method void ExceptionConverter(Exception)>
	//   20   35:athrow          
		}
		return s;
	}

	protected void writeFontInt(int i)
	{
		byte abyte0[] = outFont;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field byte[] outFont>
	//    2    4:astore_3        
		int j = fontPtr;
	//    3    5:aload_0         
	//    4    6:getfield        #142 <Field int fontPtr>
	//    5    9:istore_2        
		fontPtr = j + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #142 <Field int fontPtr>
		abyte0[j] = (byte)(i >> 24);
	//   11   17:aload_3         
	//   12   18:iload_2         
	//   13   19:iload_1         
	//   14   20:bipush          24
	//   15   22:ishr            
	//   16   23:int2byte        
	//   17   24:bastore         
		abyte0 = outFont;
	//   18   25:aload_0         
	//   19   26:getfield        #140 <Field byte[] outFont>
	//   20   29:astore_3        
		j = fontPtr;
	//   21   30:aload_0         
	//   22   31:getfield        #142 <Field int fontPtr>
	//   23   34:istore_2        
		fontPtr = j + 1;
	//   24   35:aload_0         
	//   25   36:iload_2         
	//   26   37:iconst_1        
	//   27   38:iadd            
	//   28   39:putfield        #142 <Field int fontPtr>
		abyte0[j] = (byte)(i >> 16);
	//   29   42:aload_3         
	//   30   43:iload_2         
	//   31   44:iload_1         
	//   32   45:bipush          16
	//   33   47:ishr            
	//   34   48:int2byte        
	//   35   49:bastore         
		abyte0 = outFont;
	//   36   50:aload_0         
	//   37   51:getfield        #140 <Field byte[] outFont>
	//   38   54:astore_3        
		j = fontPtr;
	//   39   55:aload_0         
	//   40   56:getfield        #142 <Field int fontPtr>
	//   41   59:istore_2        
		fontPtr = j + 1;
	//   42   60:aload_0         
	//   43   61:iload_2         
	//   44   62:iconst_1        
	//   45   63:iadd            
	//   46   64:putfield        #142 <Field int fontPtr>
		abyte0[j] = (byte)(i >> 8);
	//   47   67:aload_3         
	//   48   68:iload_2         
	//   49   69:iload_1         
	//   50   70:bipush          8
	//   51   72:ishr            
	//   52   73:int2byte        
	//   53   74:bastore         
		abyte0 = outFont;
	//   54   75:aload_0         
	//   55   76:getfield        #140 <Field byte[] outFont>
	//   56   79:astore_3        
		j = fontPtr;
	//   57   80:aload_0         
	//   58   81:getfield        #142 <Field int fontPtr>
	//   59   84:istore_2        
		fontPtr = j + 1;
	//   60   85:aload_0         
	//   61   86:iload_2         
	//   62   87:iconst_1        
	//   63   88:iadd            
	//   64   89:putfield        #142 <Field int fontPtr>
		abyte0[j] = (byte)i;
	//   65   92:aload_3         
	//   66   93:iload_2         
	//   67   94:iload_1         
	//   68   95:int2byte        
	//   69   96:bastore         
	//   70   97:return          
	}

	protected void writeFontShort(int i)
	{
		byte abyte0[] = outFont;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field byte[] outFont>
	//    2    4:astore_3        
		int j = fontPtr;
	//    3    5:aload_0         
	//    4    6:getfield        #142 <Field int fontPtr>
	//    5    9:istore_2        
		fontPtr = j + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #142 <Field int fontPtr>
		abyte0[j] = (byte)(i >> 8);
	//   11   17:aload_3         
	//   12   18:iload_2         
	//   13   19:iload_1         
	//   14   20:bipush          8
	//   15   22:ishr            
	//   16   23:int2byte        
	//   17   24:bastore         
		abyte0 = outFont;
	//   18   25:aload_0         
	//   19   26:getfield        #140 <Field byte[] outFont>
	//   20   29:astore_3        
		j = fontPtr;
	//   21   30:aload_0         
	//   22   31:getfield        #142 <Field int fontPtr>
	//   23   34:istore_2        
		fontPtr = j + 1;
	//   24   35:aload_0         
	//   25   36:iload_2         
	//   26   37:iconst_1        
	//   27   38:iadd            
	//   28   39:putfield        #142 <Field int fontPtr>
		abyte0[j] = (byte)i;
	//   29   42:aload_3         
	//   30   43:iload_2         
	//   31   44:iload_1         
	//   32   45:int2byte        
	//   33   46:bastore         
	//   34   47:return          
	}

	protected void writeFontString(String s)
	{
		s = ((String) (PdfEncodings.convertToBytes(s, "Cp1252")));
	//    0    0:aload_1         
	//    1    1:ldc2            #290 <String "Cp1252">
	//    2    4:invokestatic    #304 <Method byte[] PdfEncodings.convertToBytes(String, String)>
	//    3    7:astore_1        
		System.arraycopy(((Object) (s)), 0, ((Object) (outFont)), fontPtr, s.length);
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:getfield        #140 <Field byte[] outFont>
	//    8   14:aload_0         
	//    9   15:getfield        #142 <Field int fontPtr>
	//   10   18:aload_1         
	//   11   19:arraylength     
	//   12   20:invokestatic    #168 <Method void System.arraycopy(Object, int, Object, int, int)>
		fontPtr = fontPtr + s.length;
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #142 <Field int fontPtr>
	//   16   28:aload_1         
	//   17   29:arraylength     
	//   18   30:iadd            
	//   19   31:putfield        #142 <Field int fontPtr>
	//   20   34:return          
	}

	static final int ARG_1_AND_2_ARE_WORDS = 1;
	static final int HEAD_LOCA_FORMAT_OFFSET = 51;
	static final int MORE_COMPONENTS = 32;
	static final int TABLE_CHECKSUM = 0;
	static final int TABLE_LENGTH = 2;
	static final int TABLE_OFFSET = 1;
	static final int WE_HAVE_AN_X_AND_Y_SCALE = 64;
	static final int WE_HAVE_A_SCALE = 8;
	static final int WE_HAVE_A_TWO_BY_TWO = 128;
	static final int entrySelectors[] = {
		0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 
		3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 
		4
	};
	static final String tableNamesCmap[] = {
		"cmap", "cvt ", "fpgm", "glyf", "head", "hhea", "hmtx", "loca", "maxp", "prep"
	};
	static final String tableNamesExtra[] = {
		"OS/2", "cmap", "cvt ", "fpgm", "glyf", "head", "hhea", "hmtx", "loca", "maxp", 
		"name, prep"
	};
	static final String tableNamesSimple[] = {
		"cvt ", "fpgm", "glyf", "head", "hhea", "hmtx", "loca", "maxp", "prep"
	};
	protected int directoryOffset;
	protected String fileName;
	protected int fontPtr;
	protected int glyfTableRealSize;
	protected ArrayList glyphsInList;
	protected HashSet glyphsUsed;
	protected boolean includeCmap;
	protected boolean includeExtras;
	protected boolean locaShortTable;
	protected int locaTable[];
	protected int locaTableRealSize;
	protected byte newGlyfTable[];
	protected int newLocaTable[];
	protected byte newLocaTableOut[];
	protected byte outFont[];
	protected RandomAccessFileOrArray rf;
	protected HashMap tableDirectory;
	protected int tableGlyphOffset;

	static 
	{
	//    0    0:bipush          9
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #62  <String "cvt ">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #64  <String "fpgm">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #66  <String "glyf">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #68  <String "head">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #70  <String "hhea">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #72  <String "hmtx">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #74  <String "loca">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #76  <String "maxp">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #78  <String "prep">
	//   37   52:aastore         
	//   38   53:putstatic       #80  <Field String[] tableNamesSimple>
	//   39   56:bipush          10
	//   40   58:anewarray       String[]
	//   41   61:dup             
	//   42   62:iconst_0        
	//   43   63:ldc1            #82  <String "cmap">
	//   44   65:aastore         
	//   45   66:dup             
	//   46   67:iconst_1        
	//   47   68:ldc1            #62  <String "cvt ">
	//   48   70:aastore         
	//   49   71:dup             
	//   50   72:iconst_2        
	//   51   73:ldc1            #64  <String "fpgm">
	//   52   75:aastore         
	//   53   76:dup             
	//   54   77:iconst_3        
	//   55   78:ldc1            #66  <String "glyf">
	//   56   80:aastore         
	//   57   81:dup             
	//   58   82:iconst_4        
	//   59   83:ldc1            #68  <String "head">
	//   60   85:aastore         
	//   61   86:dup             
	//   62   87:iconst_5        
	//   63   88:ldc1            #70  <String "hhea">
	//   64   90:aastore         
	//   65   91:dup             
	//   66   92:bipush          6
	//   67   94:ldc1            #72  <String "hmtx">
	//   68   96:aastore         
	//   69   97:dup             
	//   70   98:bipush          7
	//   71  100:ldc1            #74  <String "loca">
	//   72  102:aastore         
	//   73  103:dup             
	//   74  104:bipush          8
	//   75  106:ldc1            #76  <String "maxp">
	//   76  108:aastore         
	//   77  109:dup             
	//   78  110:bipush          9
	//   79  112:ldc1            #78  <String "prep">
	//   80  114:aastore         
	//   81  115:putstatic       #84  <Field String[] tableNamesCmap>
	//   82  118:bipush          11
	//   83  120:anewarray       String[]
	//   84  123:dup             
	//   85  124:iconst_0        
	//   86  125:ldc1            #86  <String "OS/2">
	//   87  127:aastore         
	//   88  128:dup             
	//   89  129:iconst_1        
	//   90  130:ldc1            #82  <String "cmap">
	//   91  132:aastore         
	//   92  133:dup             
	//   93  134:iconst_2        
	//   94  135:ldc1            #62  <String "cvt ">
	//   95  137:aastore         
	//   96  138:dup             
	//   97  139:iconst_3        
	//   98  140:ldc1            #64  <String "fpgm">
	//   99  142:aastore         
	//  100  143:dup             
	//  101  144:iconst_4        
	//  102  145:ldc1            #66  <String "glyf">
	//  103  147:aastore         
	//  104  148:dup             
	//  105  149:iconst_5        
	//  106  150:ldc1            #68  <String "head">
	//  107  152:aastore         
	//  108  153:dup             
	//  109  154:bipush          6
	//  110  156:ldc1            #70  <String "hhea">
	//  111  158:aastore         
	//  112  159:dup             
	//  113  160:bipush          7
	//  114  162:ldc1            #72  <String "hmtx">
	//  115  164:aastore         
	//  116  165:dup             
	//  117  166:bipush          8
	//  118  168:ldc1            #74  <String "loca">
	//  119  170:aastore         
	//  120  171:dup             
	//  121  172:bipush          9
	//  122  174:ldc1            #76  <String "maxp">
	//  123  176:aastore         
	//  124  177:dup             
	//  125  178:bipush          10
	//  126  180:ldc1            #88  <String "name, prep">
	//  127  182:aastore         
	//  128  183:putstatic       #90  <Field String[] tableNamesExtra>
	//  129  186:bipush          21
	//  130  188:newarray        int[]
	//  131  190:dup             
	//  132  191:iconst_0        
	//  133  192:iconst_0        
	//  134  193:iastore         
	//  135  194:dup             
	//  136  195:iconst_1        
	//  137  196:iconst_0        
	//  138  197:iastore         
	//  139  198:dup             
	//  140  199:iconst_2        
	//  141  200:iconst_1        
	//  142  201:iastore         
	//  143  202:dup             
	//  144  203:iconst_3        
	//  145  204:iconst_1        
	//  146  205:iastore         
	//  147  206:dup             
	//  148  207:iconst_4        
	//  149  208:iconst_2        
	//  150  209:iastore         
	//  151  210:dup             
	//  152  211:iconst_5        
	//  153  212:iconst_2        
	//  154  213:iastore         
	//  155  214:dup             
	//  156  215:bipush          6
	//  157  217:iconst_2        
	//  158  218:iastore         
	//  159  219:dup             
	//  160  220:bipush          7
	//  161  222:iconst_2        
	//  162  223:iastore         
	//  163  224:dup             
	//  164  225:bipush          8
	//  165  227:iconst_3        
	//  166  228:iastore         
	//  167  229:dup             
	//  168  230:bipush          9
	//  169  232:iconst_3        
	//  170  233:iastore         
	//  171  234:dup             
	//  172  235:bipush          10
	//  173  237:iconst_3        
	//  174  238:iastore         
	//  175  239:dup             
	//  176  240:bipush          11
	//  177  242:iconst_3        
	//  178  243:iastore         
	//  179  244:dup             
	//  180  245:bipush          12
	//  181  247:iconst_3        
	//  182  248:iastore         
	//  183  249:dup             
	//  184  250:bipush          13
	//  185  252:iconst_3        
	//  186  253:iastore         
	//  187  254:dup             
	//  188  255:bipush          14
	//  189  257:iconst_3        
	//  190  258:iastore         
	//  191  259:dup             
	//  192  260:bipush          15
	//  193  262:iconst_3        
	//  194  263:iastore         
	//  195  264:dup             
	//  196  265:bipush          16
	//  197  267:iconst_4        
	//  198  268:iastore         
	//  199  269:dup             
	//  200  270:bipush          17
	//  201  272:iconst_4        
	//  202  273:iastore         
	//  203  274:dup             
	//  204  275:bipush          18
	//  205  277:iconst_4        
	//  206  278:iastore         
	//  207  279:dup             
	//  208  280:bipush          19
	//  209  282:iconst_4        
	//  210  283:iastore         
	//  211  284:dup             
	//  212  285:bipush          20
	//  213  287:iconst_4        
	//  214  288:iastore         
	//  215  289:putstatic       #92  <Field int[] entrySelectors>
	//* 216  292:return          
	}
}
