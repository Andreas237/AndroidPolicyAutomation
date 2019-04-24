// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.languages;

import com.itextpdf.text.pdf.BidiLine;
import com.itextpdf.text.pdf.BidiOrder;
import java.util.HashMap;

// Referenced classes of package com.itextpdf.text.pdf.languages:
//			LanguageProcessor

public class ArabicLigaturizer
	implements LanguageProcessor
{
	static class charstruct
	{

		char basechar;
		int lignum;
		char mark1;
		int numshapes;
		char vowel;

		charstruct()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			numshapes = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #20  <Field int numshapes>
		//    5    9:return          
		}
	}


	public ArabicLigaturizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #425 <Method void Object()>
		options = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #427 <Field int options>
		runDirection = 3;
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:putfield        #429 <Field int runDirection>
	//    8   14:return          
	}

	public ArabicLigaturizer(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #425 <Method void Object()>
		options = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #427 <Field int options>
		runDirection = 3;
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:putfield        #429 <Field int runDirection>
		runDirection = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #429 <Field int runDirection>
		options = j;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #427 <Field int options>
	//   14   24:return          
	}

	public static int arabic_shape(char ac[], int i, int j, char ac1[], int k, int l, int i1)
	{
		char ac2[] = new char[j];
	//    0    0:iload_2         
	//    1    1:newarray        char[]
	//    2    3:astore          7
		for(l = (j + i) - 1; l >= i; l--)
	//*   3    5:iload_2         
	//*   4    6:iload_1         
	//*   5    7:iadd            
	//*   6    8:iconst_1        
	//*   7    9:isub            
	//*   8   10:istore          5
	//*   9   12:iload           5
	//*  10   14:iload_1         
	//*  11   15:icmplt          38
			ac2[l - i] = ac[l];
	//   12   18:aload           7
	//   13   20:iload           5
	//   14   22:iload_1         
	//   15   23:isub            
	//   16   24:aload_0         
	//   17   25:iload           5
	//   18   27:caload          
	//   19   28:castore         

	//   20   29:iload           5
	//   21   31:iconst_1        
	//   22   32:isub            
	//   23   33:istore          5
	//*  24   35:goto            12
		ac = ((char []) (new StringBuffer(j)));
	//   25   38:new             #434 <Class StringBuffer>
	//   26   41:dup             
	//   27   42:iload_2         
	//   28   43:invokespecial   #437 <Method void StringBuffer(int)>
	//   29   46:astore_0        
		shape(ac2, ((StringBuffer) (ac)), i1);
	//   30   47:aload           7
	//   31   49:aload_0         
	//   32   50:iload           6
	//   33   52:invokestatic    #441 <Method void shape(char[], StringBuffer, int)>
		if((i1 & 0xc) != 0)
	//*  34   55:iload           6
	//*  35   57:bipush          12
	//*  36   59:iand            
	//*  37   60:ifeq            69
			doublelig(((StringBuffer) (ac)), i1);
	//   38   63:aload_0         
	//   39   64:iload           6
	//   40   66:invokestatic    #445 <Method void doublelig(StringBuffer, int)>
		System.arraycopy(((Object) (((StringBuffer) (ac)).toString().toCharArray())), 0, ((Object) (ac1)), k, ((StringBuffer) (ac)).length());
	//   41   69:aload_0         
	//   42   70:invokevirtual   #449 <Method String StringBuffer.toString()>
	//   43   73:invokevirtual   #455 <Method char[] String.toCharArray()>
	//   44   76:iconst_0        
	//   45   77:aload_3         
	//   46   78:iload           4
	//   47   80:aload_0         
	//   48   81:invokevirtual   #459 <Method int StringBuffer.length()>
	//   49   84:invokestatic    #465 <Method void System.arraycopy(Object, int, Object, int, int)>
		return ((StringBuffer) (ac)).length();
	//   50   87:aload_0         
	//   51   88:invokevirtual   #459 <Method int StringBuffer.length()>
	//   52   91:ireturn         
	}

	static char charshape(char c, int i)
	{
		char c1;
		if(c >= '\u0621' && c <= '\u06D3')
	//*   0    0:iload_0         
	//*   1    1:sipush          1569
	//*   2    4:icmplt          42
	//*   3    7:iload_0         
	//*   4    8:sipush          1747
	//*   5   11:icmpgt          42
		{
			char ac[] = (char[])maptable.get(((Object) (Character.valueOf(c))));
	//    6   14:getstatic       #103 <Field HashMap maptable>
	//    7   17:iload_0         
	//    8   18:invokestatic    #419 <Method Character Character.valueOf(char)>
	//    9   21:invokevirtual   #471 <Method Object HashMap.get(Object)>
	//   10   24:checkcast       #312 <Class char[]>
	//   11   27:astore_3        
			c1 = c;
	//   12   28:iload_0         
	//   13   29:istore_2        
			if(ac != null)
	//*  14   30:aload_3         
	//*  15   31:ifnull          40
				c1 = ac[i + 1];
	//   16   34:aload_3         
	//   17   35:iload_1         
	//   18   36:iconst_1        
	//   19   37:iadd            
	//   20   38:caload          
	//   21   39:istore_2        
		} else
	//*  22   40:iload_2         
	//*  23   41:ireturn         
		{
			c1 = c;
	//   24   42:iload_0         
	//   25   43:istore_2        
			if(c >= '\uFEF5')
	//*  26   44:iload_0         
	//*  27   45:ldc1            #62  <Int 65269>
	//*  28   47:icmplt          40
			{
				c1 = c;
	//   29   50:iload_0         
	//   30   51:istore_2        
				if(c <= '\uFEFB')
	//*  31   52:iload_0         
	//*  32   53:ldc1            #56  <Int 65275>
	//*  33   55:icmpgt          40
					return (char)(c + i);
	//   34   58:iload_0         
	//   35   59:iload_1         
	//   36   60:iadd            
	//   37   61:int2char        
	//   38   62:ireturn         
			}
		}
		return c1;
	}

	static boolean connects_to_left(charstruct charstruct1)
	{
		return charstruct1.numshapes > 2;
	//    0    0:aload_0         
	//    1    1:getfield        #476 <Field int ArabicLigaturizer$charstruct.numshapes>
	//    2    4:iconst_2        
	//    3    5:icmple          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	static void copycstostring(StringBuffer stringbuffer, charstruct charstruct1, int i)
	{
		if(charstruct1.basechar != 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
	//*   2    4:ifne            8
	//*   3    7:return          
		{
			stringbuffer.append(charstruct1.basechar);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
	//    7   13:invokevirtual   #485 <Method StringBuffer StringBuffer.append(char)>
	//    8   16:pop             
			charstruct1.lignum = charstruct1.lignum - 1;
	//    9   17:aload_1         
	//   10   18:aload_1         
	//   11   19:getfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
	//   12   22:iconst_1        
	//   13   23:isub            
	//   14   24:putfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
			if(charstruct1.mark1 != 0)
	//*  15   27:aload_1         
	//*  16   28:getfield        #491 <Field char ArabicLigaturizer$charstruct.mark1>
	//*  17   31:ifeq            59
				if((i & 1) == 0)
	//*  18   34:iload_2         
	//*  19   35:iconst_1        
	//*  20   36:iand            
	//*  21   37:ifne            92
				{
					stringbuffer.append(charstruct1.mark1);
	//   22   40:aload_0         
	//   23   41:aload_1         
	//   24   42:getfield        #491 <Field char ArabicLigaturizer$charstruct.mark1>
	//   25   45:invokevirtual   #485 <Method StringBuffer StringBuffer.append(char)>
	//   26   48:pop             
					charstruct1.lignum = charstruct1.lignum - 1;
	//   27   49:aload_1         
	//   28   50:aload_1         
	//   29   51:getfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
	//   30   54:iconst_1        
	//   31   55:isub            
	//   32   56:putfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
				} else
	//*  33   59:aload_1         
	//*  34   60:getfield        #494 <Field char ArabicLigaturizer$charstruct.vowel>
	//*  35   63:ifeq            7
	//*  36   66:iload_2         
	//*  37   67:iconst_1        
	//*  38   68:iand            
	//*  39   69:ifne            105
	//*  40   72:aload_0         
	//*  41   73:aload_1         
	//*  42   74:getfield        #494 <Field char ArabicLigaturizer$charstruct.vowel>
	//*  43   77:invokevirtual   #485 <Method StringBuffer StringBuffer.append(char)>
	//*  44   80:pop             
	//*  45   81:aload_1         
	//*  46   82:aload_1         
	//*  47   83:getfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
	//*  48   86:iconst_1        
	//*  49   87:isub            
	//*  50   88:putfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
	//*  51   91:return          
				{
					charstruct1.lignum = charstruct1.lignum - 1;
	//   52   92:aload_1         
	//   53   93:aload_1         
	//   54   94:getfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
	//   55   97:iconst_1        
	//   56   98:isub            
	//   57   99:putfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
				}
			if(charstruct1.vowel != 0)
				if((i & 1) == 0)
				{
					stringbuffer.append(charstruct1.vowel);
					charstruct1.lignum = charstruct1.lignum - 1;
					return;
				} else
	//*  58  102:goto            59
				{
					charstruct1.lignum = charstruct1.lignum - 1;
	//   59  105:aload_1         
	//   60  106:aload_1         
	//   61  107:getfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
	//   62  110:iconst_1        
	//   63  111:isub            
	//   64  112:putfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
					return;
	//   65  115:return          
				}
		}
	}

	static void doublelig(StringBuffer stringbuffer, int i)
	{
		int l;
		int i1;
		int j1;
		int k1;
		k1 = stringbuffer.length();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #459 <Method int StringBuffer.length()>
	//    2    4:istore          7
		j1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          6
		l = 1;
	//    5    9:iconst_1        
	//    6   10:istore          4
		i1 = k1;
	//    7   12:iload           7
	//    8   14:istore          5
_L27:
		int j;
		int k;
		if(l >= k1)
			break MISSING_BLOCK_LABEL_863;
	//    9   16:iload           4
	//   10   18:iload           7
	//   11   20:icmpge          863
		j = 0;
	//   12   23:iconst_0        
	//   13   24:istore_2        
		k = j;
	//   14   25:iload_2         
	//   15   26:istore_3        
		if((i & 4) == 0) goto _L2; else goto _L1
	//   16   27:iload_1         
	//   17   28:iconst_4        
	//   18   29:iand            
	//   19   30:ifeq            70
_L1:
		stringbuffer.charAt(j1);
	//   20   33:aload_0         
	//   21   34:iload           6
	//   22   36:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
		JVM INSTR tableswitch 1614 1617: default 68
	//	               1614 281
	//	               1615 302
	//	               1616 260
	//	               1617 180;
	//   23   39:tableswitch     1614 1617: default 68
	//	               1614 281
	//	               1615 302
	//	               1616 260
	//	               1617 180
		   goto _L3 _L4 _L5 _L6 _L7
_L3:
		k = j;
	//   24   68:iload_2         
	//   25   69:istore_3        
_L2:
		j = k;
	//   26   70:iload_3         
	//   27   71:istore_2        
		if((i & 8) == 0) goto _L9; else goto _L8
	//   28   72:iload_1         
	//   29   73:bipush          8
	//   30   75:iand            
	//   31   76:ifeq            154
_L8:
		stringbuffer.charAt(j1);
	//   32   79:aload_0         
	//   33   80:iload           6
	//   34   82:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
		JVM INSTR lookupswitch 7: default 152
	//	               65169: 530
	//	               65175: 465
	//	               65235: 801
	//	               65247: 323
	//	               65251: 719
	//	               65255: 598
	//	               65256: 666;
	//   35   85:lookupswitch    7: default 152
	//	               65169: 530
	//	               65175: 465
	//	               65235: 801
	//	               65247: 323
	//	               65251: 719
	//	               65255: 598
	//	               65256: 666
		   goto _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L10:
		j = k;
	//   36  152:iload_3         
	//   37  153:istore_2        
_L9:
		if(j != 0)
	//*  38  154:iload_2         
	//*  39  155:ifeq            836
		{
			stringbuffer.setCharAt(j1, ((char) (j)));
	//   40  158:aload_0         
	//   41  159:iload           6
	//   42  161:iload_2         
	//   43  162:invokevirtual   #502 <Method void StringBuffer.setCharAt(int, char)>
			i1--;
	//   44  165:iload           5
	//   45  167:iconst_1        
	//   46  168:isub            
	//   47  169:istore          5
			l++;
	//   48  171:iload           4
	//   49  173:iconst_1        
	//   50  174:iadd            
	//   51  175:istore          4
		} else
	//*  52  177:goto            16
	//*  53  180:aload_0         
	//*  54  181:iload           4
	//*  55  183:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//*  56  186:tableswitch     1612 1616: default 220
	//	               1612 225
	//	               1613 253
	//	               1614 239
	//	               1615 246
	//	               1616 232
	//*  57  220:iload_2         
	//*  58  221:istore_3        
	//*  59  222:goto            70
	//*  60  225:ldc2            #503 <Int 64606>
	//*  61  228:istore_3        
	//*  62  229:goto            70
	//*  63  232:ldc2            #504 <Int 64610>
	//*  64  235:istore_3        
	//*  65  236:goto            70
	//*  66  239:ldc2            #505 <Int 64608>
	//*  67  242:istore_3        
	//*  68  243:goto            70
	//*  69  246:ldc2            #506 <Int 64609>
	//*  70  249:istore_3        
	//*  71  250:goto            70
	//*  72  253:ldc2            #507 <Int 64607>
	//*  73  256:istore_3        
	//*  74  257:goto            70
	//*  75  260:iload_2         
	//*  76  261:istore_3        
	//*  77  262:aload_0         
	//*  78  263:iload           4
	//*  79  265:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//*  80  268:sipush          1617
	//*  81  271:icmpne          70
	//*  82  274:ldc2            #504 <Int 64610>
	//*  83  277:istore_3        
	//*  84  278:goto            70
	//*  85  281:iload_2         
	//*  86  282:istore_3        
	//*  87  283:aload_0         
	//*  88  284:iload           4
	//*  89  286:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//*  90  289:sipush          1617
	//*  91  292:icmpne          70
	//*  92  295:ldc2            #505 <Int 64608>
	//*  93  298:istore_3        
	//*  94  299:goto            70
	//*  95  302:iload_2         
	//*  96  303:istore_3        
	//*  97  304:aload_0         
	//*  98  305:iload           4
	//*  99  307:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//* 100  310:sipush          1617
	//* 101  313:icmpne          70
	//* 102  316:ldc2            #506 <Int 64609>
	//* 103  319:istore_3        
	//* 104  320:goto            70
	//* 105  323:aload_0         
	//* 106  324:iload           4
	//* 107  326:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//* 108  329:lookupswitch    8: default 404
	//	               65182: 409
	//	               65184: 416
	//	               65186: 423
	//	               65188: 430
	//	               65190: 437
	//	               65192: 444
	//	               65250: 451
	//	               65252: 458
	//* 109  404:iload_3         
	//* 110  405:istore_2        
	//* 111  406:goto            154
	//* 112  409:ldc2            #508 <Int 64575>
	//* 113  412:istore_2        
	//* 114  413:goto            154
	//* 115  416:ldc2            #509 <Int 64713>
	//* 116  419:istore_2        
	//* 117  420:goto            154
	//* 118  423:ldc2            #510 <Int 64576>
	//* 119  426:istore_2        
	//* 120  427:goto            154
	//* 121  430:ldc2            #511 <Int 64714>
	//* 122  433:istore_2        
	//* 123  434:goto            154
	//* 124  437:ldc2            #512 <Int 64577>
	//* 125  440:istore_2        
	//* 126  441:goto            154
	//* 127  444:ldc2            #513 <Int 64715>
	//* 128  447:istore_2        
	//* 129  448:goto            154
	//* 130  451:ldc2            #514 <Int 64578>
	//* 131  454:istore_2        
	//* 132  455:goto            154
	//* 133  458:ldc2            #515 <Int 64716>
	//* 134  461:istore_2        
	//* 135  462:goto            154
	//* 136  465:aload_0         
	//* 137  466:iload           4
	//* 138  468:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//* 139  471:lookupswitch    3: default 504
	//	               65184: 509
	//	               65188: 516
	//	               65192: 523
	//* 140  504:iload_3         
	//* 141  505:istore_2        
	//* 142  506:goto            154
	//* 143  509:ldc2            #516 <Int 64673>
	//* 144  512:istore_2        
	//* 145  513:goto            154
	//* 146  516:ldc2            #517 <Int 64674>
	//* 147  519:istore_2        
	//* 148  520:goto            154
	//* 149  523:ldc2            #518 <Int 64675>
	//* 150  526:istore_2        
	//* 151  527:goto            154
	//* 152  530:aload_0         
	//* 153  531:iload           4
	//* 154  533:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//* 155  536:lookupswitch    3: default 572
	//	               65184: 577
	//	               65188: 584
	//	               65192: 591
	//* 156  572:iload_3         
	//* 157  573:istore_2        
	//* 158  574:goto            154
	//* 159  577:ldc2            #519 <Int 64668>
	//* 160  580:istore_2        
	//* 161  581:goto            154
	//* 162  584:ldc2            #520 <Int 64669>
	//* 163  587:istore_2        
	//* 164  588:goto            154
	//* 165  591:ldc2            #521 <Int 64670>
	//* 166  594:istore_2        
	//* 167  595:goto            154
	//* 168  598:aload_0         
	//* 169  599:iload           4
	//* 170  601:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//* 171  604:lookupswitch    3: default 640
	//	               65184: 645
	//	               65188: 652
	//	               65192: 659
	//* 172  640:iload_3         
	//* 173  641:istore_2        
	//* 174  642:goto            154
	//* 175  645:ldc2            #522 <Int 64722>
	//* 176  648:istore_2        
	//* 177  649:goto            154
	//* 178  652:ldc2            #523 <Int 64723>
	//* 179  655:istore_2        
	//* 180  656:goto            154
	//* 181  659:ldc2            #524 <Int 64724>
	//* 182  662:istore_2        
	//* 183  663:goto            154
	//* 184  666:aload_0         
	//* 185  667:iload           4
	//* 186  669:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//* 187  672:tableswitch     65198 65200: default 700
	//	               65198 705
	//	               65199 700
	//	               65200 712
	//* 188  700:iload_3         
	//* 189  701:istore_2        
	//* 190  702:goto            154
	//* 191  705:ldc2            #525 <Int 64650>
	//* 192  708:istore_2        
	//* 193  709:goto            154
	//* 194  712:ldc2            #526 <Int 64651>
	//* 195  715:istore_2        
	//* 196  716:goto            154
	//* 197  719:aload_0         
	//* 198  720:iload           4
	//* 199  722:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//* 200  725:lookupswitch    4: default 768
	//	               65184: 773
	//	               65188: 780
	//	               65192: 787
	//	               65252: 794
	//* 201  768:iload_3         
	//* 202  769:istore_2        
	//* 203  770:goto            154
	//* 204  773:ldc2            #527 <Int 64718>
	//* 205  776:istore_2        
	//* 206  777:goto            154
	//* 207  780:ldc2            #528 <Int 64719>
	//* 208  783:istore_2        
	//* 209  784:goto            154
	//* 210  787:ldc2            #529 <Int 64720>
	//* 211  790:istore_2        
	//* 212  791:goto            154
	//* 213  794:ldc2            #530 <Int 64721>
	//* 214  797:istore_2        
	//* 215  798:goto            154
	//* 216  801:aload_0         
	//* 217  802:iload           4
	//* 218  804:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//* 219  807:tableswitch     65266 65266: default 824
	//	               65266 829
	//* 220  824:iload_3         
	//* 221  825:istore_2        
	//* 222  826:goto            154
	//* 223  829:ldc2            #531 <Int 64562>
	//* 224  832:istore_2        
	//* 225  833:goto            154
		{
			j1++;
	//  226  836:iload           6
	//  227  838:iconst_1        
	//  228  839:iadd            
	//  229  840:istore          6
			stringbuffer.setCharAt(j1, stringbuffer.charAt(l));
	//  230  842:aload_0         
	//  231  843:iload           6
	//  232  845:aload_0         
	//  233  846:iload           4
	//  234  848:invokevirtual   #498 <Method char StringBuffer.charAt(int)>
	//  235  851:invokevirtual   #502 <Method void StringBuffer.setCharAt(int, char)>
			l++;
	//  236  854:iload           4
	//  237  856:iconst_1        
	//  238  857:iadd            
	//  239  858:istore          4
		}
		continue; /* Loop/switch isn't completed */
	//  240  860:goto            16
_L7:
		switch(stringbuffer.charAt(l))
		{
		default:
			k = j;
			break;

		case 1612: 
			k = 64606;
			break;

		case 1616: 
			k = 64610;
			break;

		case 1614: 
			k = 64608;
			break;

		case 1615: 
			k = 64609;
			break;

		case 1613: 
			k = 64607;
			break;
		}
		if(true) goto _L2; else goto _L18
_L18:
_L6:
		k = j;
		if(stringbuffer.charAt(l) == '\u0651')
			k = 64610;
		  goto _L2
_L4:
		k = j;
		if(stringbuffer.charAt(l) == '\u0651')
			k = 64608;
		  goto _L2
_L5:
		k = j;
		if(stringbuffer.charAt(l) == '\u0651')
			k = 64609;
		  goto _L2
_L14:
		switch(stringbuffer.charAt(l))
		{
		default:
			j = k;
			break;

		case 65182: 
			j = 64575;
			break;

		case 65184: 
			j = 64713;
			break;

		case 65186: 
			j = 64576;
			break;

		case 65188: 
			j = 64714;
			break;

		case 65190: 
			j = 64577;
			break;

		case 65192: 
			j = 64715;
			break;

		case 65250: 
			j = 64578;
			break;

		case 65252: 
			j = 64716;
			break;
		}
		if(true) goto _L9; else goto _L19
_L19:
_L12:
		switch(stringbuffer.charAt(l))
		{
		default:
			j = k;
			break;

		case 65184: 
			j = 64673;
			break;

		case 65188: 
			j = 64674;
			break;

		case 65192: 
			j = 64675;
			break;
		}
		if(true) goto _L9; else goto _L20
_L20:
_L11:
		switch(stringbuffer.charAt(l))
		{
		default:
			j = k;
			break;

		case 65184: 
			j = 64668;
			break;

		case 65188: 
			j = 64669;
			break;

		case 65192: 
			j = 64670;
			break;
		}
		if(true) goto _L9; else goto _L21
_L21:
_L16:
		switch(stringbuffer.charAt(l))
		{
		default:
			j = k;
			break;

		case 65184: 
			j = 64722;
			break;

		case 65188: 
			j = 64723;
			break;

		case 65192: 
			j = 64724;
			break;
		}
		if(true) goto _L9; else goto _L22
_L22:
_L17:
		switch(stringbuffer.charAt(l))
		{
		case 65199: 
		default:
			j = k;
			break;

		case 65198: 
			j = 64650;
			break;

		case 65200: 
			j = 64651;
			break;
		}
		if(true) goto _L9; else goto _L23
_L23:
_L15:
		switch(stringbuffer.charAt(l))
		{
		default:
			j = k;
			break;

		case 65184: 
			j = 64718;
			break;

		case 65188: 
			j = 64719;
			break;

		case 65192: 
			j = 64720;
			break;

		case 65252: 
			j = 64721;
			break;
		}
		if(true) goto _L9; else goto _L24
_L24:
_L13:
		switch(stringbuffer.charAt(l))
		{
		default:
			j = k;
			break;

		case 65266: 
			j = 64562;
			break;
		}
		if(true) goto _L9; else goto _L25
_L25:
		stringbuffer.setLength(i1);
	//  241  863:aload_0         
	//  242  864:iload           5
	//  243  866:invokevirtual   #534 <Method void StringBuffer.setLength(int)>
		return;
	//  244  869:return          
		if(true) goto _L27; else goto _L26
_L26:
	}

	public static Character getReverseMapping(char c)
	{
		return (Character)reverseLigatureMapTable.get(((Object) (Character.valueOf(c))));
	//    0    0:getstatic       #105 <Field HashMap reverseLigatureMapTable>
	//    1    3:iload_0         
	//    2    4:invokestatic    #419 <Method Character Character.valueOf(char)>
	//    3    7:invokevirtual   #471 <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #415 <Class Character>
	//    5   13:areturn         
	}

	static boolean isVowel(char c)
	{
		return c >= '\u064B' && c <= '\u0655' || c == '\u0670';
	//    0    0:iload_0         
	//    1    1:sipush          1611
	//    2    4:icmplt          14
	//    3    7:iload_0         
	//    4    8:sipush          1621
	//    5   11:icmple          21
	//    6   14:iload_0         
	//    7   15:sipush          1648
	//    8   18:icmpne          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	static int ligature(char c, charstruct charstruct1)
	{
		byte byte0 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(charstruct1.basechar != 0) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:getfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
	//    4    6:ifne            11
_L1:
		return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
_L2:
		if(!isVowel(c))
			continue; /* Loop/switch isn't completed */
	//    7   11:iload_0         
	//    8   12:invokestatic    #541 <Method boolean isVowel(char)>
	//    9   15:ifeq            335
		boolean flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_3        
		byte0 = ((byte) (flag));
	//   12   20:iload_3         
	//   13   21:istore_2        
		if(charstruct1.vowel != 0)
	//*  14   22:aload_1         
	//*  15   23:getfield        #494 <Field char ArabicLigaturizer$charstruct.vowel>
	//*  16   26:ifeq            40
		{
			byte0 = ((byte) (flag));
	//   17   29:iload_3         
	//   18   30:istore_2        
			if(c != '\u0651')
	//*  19   31:iload_0         
	//*  20   32:sipush          1617
	//*  21   35:icmpeq          40
				byte0 = 2;
	//   22   38:iconst_2        
	//   23   39:istore_2        
		}
		c;
	//   24   40:iload_0         
		JVM INSTR tableswitch 1617 1621: default 76
	//	               1617 98
	//	               1618 76
	//	               1619 297
	//	               1620 177
	//	               1621 115;
	//   25   41:tableswitch     1617 1621: default 76
	//	               1617 98
	//	               1618 76
	//	               1619 297
	//	               1620 177
	//	               1621 115
		   goto _L3 _L4 _L3 _L5 _L6 _L7
_L3:
		charstruct1.vowel = c;
	//   26   76:aload_1         
	//   27   77:iload_0         
	//   28   78:putfield        #494 <Field char ArabicLigaturizer$charstruct.vowel>
_L9:
		if(byte0 == 1)
	//*  29   81:iload_2         
	//*  30   82:iconst_1        
	//*  31   83:icmpne          96
			charstruct1.lignum = charstruct1.lignum + 1;
	//   32   86:aload_1         
	//   33   87:aload_1         
	//   34   88:getfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
	//   35   91:iconst_1        
	//   36   92:iadd            
	//   37   93:putfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
		return ((int) (byte0));
	//   38   96:iload_2         
	//   39   97:ireturn         
_L4:
		if(charstruct1.mark1 != 0) goto _L1; else goto _L8
	//   40   98:aload_1         
	//   41   99:getfield        #491 <Field char ArabicLigaturizer$charstruct.mark1>
	//   42  102:ifne            9
_L8:
		charstruct1.mark1 = '\u0651';
	//   43  105:aload_1         
	//   44  106:sipush          1617
	//   45  109:putfield        #491 <Field char ArabicLigaturizer$charstruct.mark1>
		  goto _L9
	//*  46  112:goto            81
_L7:
		switch(charstruct1.basechar)
	//*  47  115:aload_1         
	//*  48  116:getfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
		{
	//*  49  119:lookupswitch    2: default 144
	//	               1575: 154
	//	               65275: 166
		default:
			charstruct1.mark1 = '\u0655';
	//   50  144:aload_1         
	//   51  145:sipush          1621
	//   52  148:putfield        #491 <Field char ArabicLigaturizer$charstruct.mark1>
			break;

	//*  53  151:goto            81
		case 1575: 
			charstruct1.basechar = '\u0625';
	//   54  154:aload_1         
	//   55  155:sipush          1573
	//   56  158:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
			byte0 = 2;
	//   57  161:iconst_2        
	//   58  162:istore_2        
			break;

	//*  59  163:goto            81
		case 65275: 
			charstruct1.basechar = '\uFEF9';
	//   60  166:aload_1         
	//   61  167:ldc1            #60  <Int 65273>
	//   62  169:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
			byte0 = 2;
	//   63  172:iconst_2        
	//   64  173:istore_2        
			break;
		}
		if(true) goto _L9; else goto _L10
_L10:
	//*  65  174:goto            81
_L6:
		switch(charstruct1.basechar)
	//*  66  177:aload_1         
	//*  67  178:getfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
		{
	//*  68  181:lookupswitch    6: default 240
	//	               1575: 250
	//	               1608: 273
	//	               1609: 285
	//	               1610: 285
	//	               1740: 285
	//	               65275: 262
		default:
			charstruct1.mark1 = '\u0654';
	//   69  240:aload_1         
	//   70  241:sipush          1620
	//   71  244:putfield        #491 <Field char ArabicLigaturizer$charstruct.mark1>
			break;

	//*  72  247:goto            81
		case 1575: 
			charstruct1.basechar = '\u0623';
	//   73  250:aload_1         
	//   74  251:sipush          1571
	//   75  254:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
			byte0 = 2;
	//   76  257:iconst_2        
	//   77  258:istore_2        
			break;

	//*  78  259:goto            81
		case 65275: 
			charstruct1.basechar = '\uFEF7';
	//   79  262:aload_1         
	//   80  263:ldc1            #58  <Int 65271>
	//   81  265:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
			byte0 = 2;
	//   82  268:iconst_2        
	//   83  269:istore_2        
			break;

	//*  84  270:goto            81
		case 1608: 
			charstruct1.basechar = '\u0624';
	//   85  273:aload_1         
	//   86  274:sipush          1572
	//   87  277:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
			byte0 = 2;
	//   88  280:iconst_2        
	//   89  281:istore_2        
			break;

	//*  90  282:goto            81
		case 1609: 
		case 1610: 
		case 1740: 
			charstruct1.basechar = '\u0626';
	//   91  285:aload_1         
	//   92  286:sipush          1574
	//   93  289:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
			byte0 = 2;
	//   94  292:iconst_2        
	//   95  293:istore_2        
			break;
		}
		if(true) goto _L9; else goto _L11
_L11:
	//*  96  294:goto            81
_L5:
		switch(charstruct1.basechar)
	//*  97  297:aload_1         
	//*  98  298:getfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
		{
	//*  99  301:tableswitch     1575 1575: default 320
	//	               1575 323
	//* 100  320:goto            81
		case 1575: 
			charstruct1.basechar = '\u0622';
	//  101  323:aload_1         
	//  102  324:sipush          1570
	//  103  327:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
			byte0 = 2;
	//  104  330:iconst_2        
	//  105  331:istore_2        
			break;
		}
		if(true) goto _L9; else goto _L12
_L12:
	//* 106  332:goto            81
		if(charstruct1.vowel != 0) goto _L1; else goto _L13
	//  107  335:aload_1         
	//  108  336:getfield        #494 <Field char ArabicLigaturizer$charstruct.vowel>
	//  109  339:ifne            9
_L13:
		switch(charstruct1.basechar)
	//* 110  342:aload_1         
	//* 111  343:getfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
		{
	//* 112  346:lookupswitch    2: default 372
	//	               0: 479
	//	               1604: 374
	//* 113  372:iload_2         
	//* 114  373:ireturn         
		case 1604: 
			switch(c)
	//* 115  374:iload_0         
			{
	//* 116  375:tableswitch     1570 1575: default 412
	//	               1570 415
	//	               1571 447
	//	               1572 412
	//	               1573 463
	//	               1574 412
	//	               1575 431
	//* 117  412:goto            372
			case 1570: 
				charstruct1.basechar = '\uFEF5';
	//  118  415:aload_1         
	//  119  416:ldc1            #62  <Int 65269>
	//  120  418:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
				charstruct1.numshapes = 2;
	//  121  421:aload_1         
	//  122  422:iconst_2        
	//  123  423:putfield        #476 <Field int ArabicLigaturizer$charstruct.numshapes>
				byte0 = 3;
	//  124  426:iconst_3        
	//  125  427:istore_2        
				break;

	//* 126  428:goto            372
			case 1575: 
				charstruct1.basechar = '\uFEFB';
	//  127  431:aload_1         
	//  128  432:ldc1            #56  <Int 65275>
	//  129  434:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
				charstruct1.numshapes = 2;
	//  130  437:aload_1         
	//  131  438:iconst_2        
	//  132  439:putfield        #476 <Field int ArabicLigaturizer$charstruct.numshapes>
				byte0 = 3;
	//  133  442:iconst_3        
	//  134  443:istore_2        
				break;

	//* 135  444:goto            372
			case 1571: 
				charstruct1.basechar = '\uFEF7';
	//  136  447:aload_1         
	//  137  448:ldc1            #58  <Int 65271>
	//  138  450:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
				charstruct1.numshapes = 2;
	//  139  453:aload_1         
	//  140  454:iconst_2        
	//  141  455:putfield        #476 <Field int ArabicLigaturizer$charstruct.numshapes>
				byte0 = 3;
	//  142  458:iconst_3        
	//  143  459:istore_2        
				break;

	//* 144  460:goto            372
			case 1573: 
				charstruct1.basechar = '\uFEF9';
	//  145  463:aload_1         
	//  146  464:ldc1            #60  <Int 65273>
	//  147  466:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
				charstruct1.numshapes = 2;
	//  148  469:aload_1         
	//  149  470:iconst_2        
	//  150  471:putfield        #476 <Field int ArabicLigaturizer$charstruct.numshapes>
				byte0 = 3;
	//  151  474:iconst_3        
	//  152  475:istore_2        
				break;
			}
			// fall through

		default:
			if(false)
				;
			break;

	//* 153  476:goto            372
		case 0: // '\0'
			charstruct1.basechar = c;
	//  154  479:aload_1         
	//  155  480:iload_0         
	//  156  481:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
			charstruct1.numshapes = shapecount(c);
	//  157  484:aload_1         
	//  158  485:iload_0         
	//  159  486:invokestatic    #545 <Method int shapecount(char)>
	//  160  489:putfield        #476 <Field int ArabicLigaturizer$charstruct.numshapes>
			byte0 = 1;
	//  161  492:iconst_1        
	//  162  493:istore_2        
			break;
		}
		while(true) 
			return ((int) (byte0));
	//  163  494:goto            372
	}

	public static void processNumbers(char ac[], int i, int j, int k)
	{
		int l = i + j;
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iadd            
	//    3    3:istore          5
		if((k & 0xe0) == 0) goto _L2; else goto _L1
	//    4    5:iload_3         
	//    5    6:sipush          224
	//    6    9:iand            
	//    7   10:ifeq            96
_L1:
		char c = '0';
	//    8   13:bipush          48
	//    9   15:istore          4
		k & 0x100;
	//   10   17:iload_3         
	//   11   18:sipush          256
	//   12   21:iand            
		JVM INSTR lookupswitch 2: default 48
	//	               0: 97
	//	               256: 105;
	//   13   22:lookupswitch    2: default 48
	//	               0: 97
	//	               256: 105
		   goto _L3 _L4 _L5
_L3:
		k & 0xe0;
	//   14   48:iload_3         
	//   15   49:sipush          224
	//   16   52:iand            
		JVM INSTR lookupswitch 4: default 96
	//	               32: 113
	//	               64: 155
	//	               96: 203
	//	               128: 213;
	//   17   53:lookupswitch    4: default 96
	//	               32: 113
	//	               64: 155
	//	               96: 203
	//	               128: 213
		   goto _L2 _L6 _L7 _L8 _L9
_L2:
		return;
	//   18   96:return          
_L4:
		c = '\u0660';
	//   19   97:sipush          1632
	//   20  100:istore          4
		continue; /* Loop/switch isn't completed */
	//   21  102:goto            48
_L5:
		c = '\u06F0';
	//   22  105:sipush          1776
	//   23  108:istore          4
		continue; /* Loop/switch isn't completed */
	//   24  110:goto            48
_L6:
		while(i < l) 
	//*  25  113:iload_1         
	//*  26  114:iload           5
	//*  27  116:icmpge          96
		{
			j = ((int) (ac[i]));
	//   28  119:aload_0         
	//   29  120:iload_1         
	//   30  121:caload          
	//   31  122:istore_2        
			if(j <= 57 && j >= 48)
	//*  32  123:iload_2         
	//*  33  124:bipush          57
	//*  34  126:icmpgt          148
	//*  35  129:iload_2         
	//*  36  130:bipush          48
	//*  37  132:icmplt          148
				ac[i] = (char)(ac[i] + (c - 48));
	//   38  135:aload_0         
	//   39  136:iload_1         
	//   40  137:aload_0         
	//   41  138:iload_1         
	//   42  139:caload          
	//   43  140:iload           4
	//   44  142:bipush          48
	//   45  144:isub            
	//   46  145:iadd            
	//   47  146:int2char        
	//   48  147:castore         
			i++;
	//   49  148:iload_1         
	//   50  149:iconst_1        
	//   51  150:iadd            
	//   52  151:istore_1        
		}
		continue; /* Loop/switch isn't completed */
	//   53  152:goto            113
_L7:
		j = ((int) ((char)(c + 9)));
	//   54  155:iload           4
	//   55  157:bipush          9
	//   56  159:iadd            
	//   57  160:int2char        
	//   58  161:istore_2        
		while(i < l) 
	//*  59  162:iload_1         
	//*  60  163:iload           5
	//*  61  165:icmpge          96
		{
			k = ((int) (ac[i]));
	//   62  168:aload_0         
	//   63  169:iload_1         
	//   64  170:caload          
	//   65  171:istore_3        
			if(k <= j && k >= c)
	//*  66  172:iload_3         
	//*  67  173:iload_2         
	//*  68  174:icmpgt          196
	//*  69  177:iload_3         
	//*  70  178:iload           4
	//*  71  180:icmplt          196
				ac[i] = (char)(ac[i] + (48 - c));
	//   72  183:aload_0         
	//   73  184:iload_1         
	//   74  185:aload_0         
	//   75  186:iload_1         
	//   76  187:caload          
	//   77  188:bipush          48
	//   78  190:iload           4
	//   79  192:isub            
	//   80  193:iadd            
	//   81  194:int2char        
	//   82  195:castore         
			i++;
	//   83  196:iload_1         
	//   84  197:iconst_1        
	//   85  198:iadd            
	//   86  199:istore_1        
		}
		if(true) goto _L2; else goto _L8
	//   87  200:goto            162
_L8:
		shapeToArabicDigitsWithContext(ac, 0, j, c, false);
	//   88  203:aload_0         
	//   89  204:iconst_0        
	//   90  205:iload_2         
	//   91  206:iload           4
	//   92  208:iconst_0        
	//   93  209:invokestatic    #551 <Method void shapeToArabicDigitsWithContext(char[], int, int, char, boolean)>
		return;
	//   94  212:return          
_L9:
		shapeToArabicDigitsWithContext(ac, 0, j, c, true);
	//   95  213:aload_0         
	//   96  214:iconst_0        
	//   97  215:iload_2         
	//   98  216:iload           4
	//   99  218:iconst_1        
	//  100  219:invokestatic    #551 <Method void shapeToArabicDigitsWithContext(char[], int, int, char, boolean)>
		return;
	//  101  222:return          
		if(true) goto _L3; else goto _L10
_L10:
	}

	static void shape(char ac[], StringBuffer stringbuffer, int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		charstruct charstruct2 = new charstruct();
	//    2    3:new             #8   <Class ArabicLigaturizer$charstruct>
	//    3    6:dup             
	//    4    7:invokespecial   #552 <Method void ArabicLigaturizer$charstruct()>
	//    5   10:astore          9
		charstruct charstruct1 = new charstruct();
	//    6   12:new             #8   <Class ArabicLigaturizer$charstruct>
	//    7   15:dup             
	//    8   16:invokespecial   #552 <Method void ArabicLigaturizer$charstruct()>
	//    9   19:astore          8
		while(j < ac.length) 
	//*  10   21:iload           4
	//*  11   23:aload_0         
	//*  12   24:arraylength     
	//*  13   25:icmpge          181
		{
			int k = j + 1;
	//   14   28:iload           4
	//   15   30:iconst_1        
	//   16   31:iadd            
	//   17   32:istore          5
			char c = ac[j];
	//   18   34:aload_0         
	//   19   35:iload           4
	//   20   37:caload          
	//   21   38:istore_3        
			j = ligature(c, charstruct1);
	//   22   39:iload_3         
	//   23   40:aload           8
	//   24   42:invokestatic    #554 <Method int ligature(char, ArabicLigaturizer$charstruct)>
	//   25   45:istore          4
			if(j == 0)
	//*  26   47:iload           4
	//*  27   49:ifne            168
			{
				int i1 = shapecount(c);
	//   28   52:iload_3         
	//   29   53:invokestatic    #545 <Method int shapecount(char)>
	//   30   56:istore          7
				int l;
				if(i1 == 1)
	//*  31   58:iload           7
	//*  32   60:iconst_1        
	//*  33   61:icmpne          162
					j = 0;
	//   34   64:iconst_0        
	//   35   65:istore          4
				else
	//*  36   67:iload           4
	//*  37   69:istore          6
	//*  38   71:aload           9
	//*  39   73:invokestatic    #556 <Method boolean connects_to_left(ArabicLigaturizer$charstruct)>
	//*  40   76:ifeq            85
	//*  41   79:iload           4
	//*  42   81:iconst_1        
	//*  43   82:iadd            
	//*  44   83:istore          6
	//*  45   85:aload           8
	//*  46   87:getfield        #476 <Field int ArabicLigaturizer$charstruct.numshapes>
	//*  47   90:istore          4
	//*  48   92:aload           8
	//*  49   94:aload           8
	//*  50   96:getfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
	//*  51   99:iload           6
	//*  52  101:iload           4
	//*  53  103:irem            
	//*  54  104:invokestatic    #558 <Method char charshape(char, int)>
	//*  55  107:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
	//*  56  110:aload_1         
	//*  57  111:aload           9
	//*  58  113:iload_2         
	//*  59  114:invokestatic    #560 <Method void copycstostring(StringBuffer, ArabicLigaturizer$charstruct, int)>
	//*  60  117:aload           8
	//*  61  119:astore          9
	//*  62  121:new             #8   <Class ArabicLigaturizer$charstruct>
	//*  63  124:dup             
	//*  64  125:invokespecial   #552 <Method void ArabicLigaturizer$charstruct()>
	//*  65  128:astore          8
	//*  66  130:aload           8
	//*  67  132:iload_3         
	//*  68  133:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
	//*  69  136:aload           8
	//*  70  138:iload           7
	//*  71  140:putfield        #476 <Field int ArabicLigaturizer$charstruct.numshapes>
	//*  72  143:aload           8
	//*  73  145:aload           8
	//*  74  147:getfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
	//*  75  150:iconst_1        
	//*  76  151:iadd            
	//*  77  152:putfield        #488 <Field int ArabicLigaturizer$charstruct.lignum>
	//*  78  155:iload           5
	//*  79  157:istore          4
	//*  80  159:goto            21
					j = 2;
	//   81  162:iconst_2        
	//   82  163:istore          4
				l = j;
				if(connects_to_left(charstruct2))
					l = j + 1;
				j = charstruct1.numshapes;
				charstruct1.basechar = charshape(charstruct1.basechar, l % j);
				copycstostring(stringbuffer, charstruct2, i);
				charstruct2 = charstruct1;
				charstruct1 = new charstruct();
				charstruct1.basechar = c;
				charstruct1.numshapes = i1;
				charstruct1.lignum = charstruct1.lignum + 1;
				j = k;
			} else
	//*  83  165:goto            67
			if(j == 1)
	//*  84  168:iload           4
	//*  85  170:iconst_1        
	//*  86  171:icmpne          238
				j = k;
	//   87  174:iload           5
	//   88  176:istore          4
			else
	//*  89  178:goto            21
	//*  90  181:aload           9
	//*  91  183:invokestatic    #556 <Method boolean connects_to_left(ArabicLigaturizer$charstruct)>
	//*  92  186:ifeq            232
	//*  93  189:iconst_1        
	//*  94  190:istore          4
	//*  95  192:aload           8
	//*  96  194:getfield        #476 <Field int ArabicLigaturizer$charstruct.numshapes>
	//*  97  197:istore          5
	//*  98  199:aload           8
	//*  99  201:aload           8
	//* 100  203:getfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
	//* 101  206:iload           4
	//* 102  208:iload           5
	//* 103  210:irem            
	//* 104  211:invokestatic    #558 <Method char charshape(char, int)>
	//* 105  214:putfield        #481 <Field char ArabicLigaturizer$charstruct.basechar>
	//* 106  217:aload_1         
	//* 107  218:aload           9
	//* 108  220:iload_2         
	//* 109  221:invokestatic    #560 <Method void copycstostring(StringBuffer, ArabicLigaturizer$charstruct, int)>
	//* 110  224:aload_1         
	//* 111  225:aload           8
	//* 112  227:iload_2         
	//* 113  228:invokestatic    #560 <Method void copycstostring(StringBuffer, ArabicLigaturizer$charstruct, int)>
	//* 114  231:return          
	//* 115  232:iconst_0        
	//* 116  233:istore          4
	//* 117  235:goto            192
				j = k;
	//  118  238:iload           5
	//  119  240:istore          4
		}
		if(connects_to_left(charstruct2))
			j = 1;
		else
			j = 0;
		k = charstruct1.numshapes;
		charstruct1.basechar = charshape(charstruct1.basechar, j % k);
		copycstostring(stringbuffer, charstruct2, i);
		copycstostring(stringbuffer, charstruct1, i);
	//* 120  242:goto            21
	}

	static void shapeToArabicDigitsWithContext(char ac[], int i, int j, char c, boolean flag)
	{
		char c2;
		boolean flag1;
		c2 = (char)(c - 48);
	//    0    0:iload_3         
	//    1    1:bipush          48
	//    2    3:isub            
	//    3    4:int2char        
	//    4    5:istore          6
		c = ((char) (i));
	//    5    7:iload_1         
	//    6    8:istore_3        
		flag1 = flag;
	//    7    9:iload           4
	//    8   11:istore          7
_L7:
		char c1;
		if(c >= i + j)
			break MISSING_BLOCK_LABEL_147;
	//    9   13:iload_3         
	//   10   14:iload_1         
	//   11   15:iload_2         
	//   12   16:iadd            
	//   13   17:icmpge          147
		c1 = ac[c];
	//   14   20:aload_0         
	//   15   21:iload_3         
	//   16   22:caload          
	//   17   23:istore          5
		flag = flag1;
	//   18   25:iload           7
	//   19   27:istore          4
		BidiOrder.getDirection(c1);
	//   20   29:iload           5
	//   21   31:invokestatic    #566 <Method byte BidiOrder.getDirection(char)>
		JVM INSTR tableswitch 0 8: default 84
	//	               0 99
	//	               1 88
	//	               2 88
	//	               3 99
	//	               4 105
	//	               5 88
	//	               6 88
	//	               7 88
	//	               8 111;
	//   22   34:tableswitch     0 8: default 84
	//	               0 99
	//	               1 88
	//	               2 88
	//	               3 99
	//	               4 105
	//	               5 88
	//	               6 88
	//	               7 88
	//	               8 111
		   goto _L1 _L2 _L3 _L3 _L2 _L4 _L3 _L3 _L3 _L5
_L5:
		break MISSING_BLOCK_LABEL_111;
_L2:
		break; /* Loop/switch isn't completed */
_L3:
		break; /* Loop/switch isn't completed */
_L1:
		flag = flag1;
	//   23   84:iload           7
	//   24   86:istore          4
_L8:
		c++;
	//   25   88:iload_3         
	//   26   89:iconst_1        
	//   27   90:iadd            
	//   28   91:istore_3        
		flag1 = flag;
	//   29   92:iload           4
	//   30   94:istore          7
		if(true) goto _L7; else goto _L6
	//   31   96:goto            13
_L6:
		flag = false;
	//   32   99:iconst_0        
	//   33  100:istore          4
		  goto _L8
	//*  34  102:goto            88
_L4:
		flag = true;
	//   35  105:iconst_1        
	//   36  106:istore          4
		  goto _L8
	//*  37  108:goto            88
		flag = flag1;
	//   38  111:iload           7
	//   39  113:istore          4
		if(flag1)
	//*  40  115:iload           7
	//*  41  117:ifeq            88
		{
			flag = flag1;
	//   42  120:iload           7
	//   43  122:istore          4
			if(c1 <= '9')
	//*  44  124:iload           5
	//*  45  126:bipush          57
	//*  46  128:icmpgt          88
			{
				ac[c] = (char)(c1 + c2);
	//   47  131:aload_0         
	//   48  132:iload_3         
	//   49  133:iload           5
	//   50  135:iload           6
	//   51  137:iadd            
	//   52  138:int2char        
	//   53  139:castore         
				flag = flag1;
	//   54  140:iload           7
	//   55  142:istore          4
			}
		}
		  goto _L8
	//*  56  144:goto            88
	//   57  147:return          
	}

	static int shapecount(char c)
	{
		if(c >= '\u0621' && c <= '\u06D3' && !isVowel(c))
	//*   0    0:iload_0         
	//*   1    1:sipush          1569
	//*   2    4:icmplt          44
	//*   3    7:iload_0         
	//*   4    8:sipush          1747
	//*   5   11:icmpgt          44
	//*   6   14:iload_0         
	//*   7   15:invokestatic    #541 <Method boolean isVowel(char)>
	//*   8   18:ifne            44
		{
			char ac[] = (char[])maptable.get(((Object) (Character.valueOf(c))));
	//    9   21:getstatic       #103 <Field HashMap maptable>
	//   10   24:iload_0         
	//   11   25:invokestatic    #419 <Method Character Character.valueOf(char)>
	//   12   28:invokevirtual   #471 <Method Object HashMap.get(Object)>
	//   13   31:checkcast       #312 <Class char[]>
	//   14   34:astore_1        
			if(ac != null)
	//*  15   35:aload_1         
	//*  16   36:ifnull          53
				return ac.length - 1;
	//   17   39:aload_1         
	//   18   40:arraylength     
	//   19   41:iconst_1        
	//   20   42:isub            
	//   21   43:ireturn         
		} else
		if(c == '\u200D')
	//*  22   44:iload_0         
	//*  23   45:sipush          8205
	//*  24   48:icmpne          53
			return 4;
	//   25   51:iconst_4        
	//   26   52:ireturn         
		return 1;
	//   27   53:iconst_1        
	//   28   54:ireturn         
	}

	public boolean isRTL()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String process(String s)
	{
		return BidiLine.processLTR(s, runDirection, options);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #429 <Field int runDirection>
	//    3    5:aload_0         
	//    4    6:getfield        #427 <Field int options>
	//    5    9:invokestatic    #576 <Method String BidiLine.processLTR(String, int, int)>
	//    6   12:areturn         
	}

	private static final char ALEF = 1575;
	private static final char ALEFHAMZA = 1571;
	private static final char ALEFHAMZABELOW = 1573;
	private static final char ALEFMADDA = 1570;
	private static final char ALEFMAKSURA = 1609;
	private static final char DAMMA = 1615;
	public static final int DIGITS_AN2EN = 64;
	public static final int DIGITS_EN2AN = 32;
	public static final int DIGITS_EN2AN_INIT_AL = 128;
	public static final int DIGITS_EN2AN_INIT_LR = 96;
	public static final int DIGITS_MASK = 224;
	private static final int DIGITS_RESERVED = 160;
	public static final int DIGIT_TYPE_AN = 0;
	public static final int DIGIT_TYPE_AN_EXTENDED = 256;
	public static final int DIGIT_TYPE_MASK = 256;
	private static final char FARSIYEH = 1740;
	private static final char FATHA = 1614;
	private static final char HAMZA = 1569;
	private static final char HAMZAABOVE = 1620;
	private static final char HAMZABELOW = 1621;
	private static final char KASRA = 1616;
	private static final char LAM = 1604;
	private static final char LAM_ALEF = 65275;
	private static final char LAM_ALEFHAMZA = 65271;
	private static final char LAM_ALEFHAMZABELOW = 65273;
	private static final char LAM_ALEFMADDA = 65269;
	private static final char MADDA = 1619;
	private static final char SHADDA = 1617;
	private static final char TATWEEL = 1600;
	private static final char WAW = 1608;
	private static final char WAWHAMZA = 1572;
	private static final char YEH = 1610;
	private static final char YEHHAMZA = 1574;
	private static final char ZWJ = 8205;
	public static final int ar_composedtashkeel = 4;
	public static final int ar_lig = 8;
	public static final int ar_nothing = 0;
	public static final int ar_novowel = 1;
	private static final char chartable[][];
	private static final HashMap maptable;
	private static final HashMap reverseLigatureMapTable;
	protected int options;
	protected int runDirection;

	static 
	{
		int i;
		int j;
		Object obj;
		maptable = new HashMap();
	//    0    0:new             #98  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #101 <Method void HashMap()>
	//    3    7:putstatic       #103 <Field HashMap maptable>
		reverseLigatureMapTable = new HashMap();
	//    4   10:new             #98  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #101 <Method void HashMap()>
	//    7   17:putstatic       #105 <Field HashMap reverseLigatureMapTable>
		obj = ((Object) (new char[] {
			'\u0621', '\uFE80'
		}));
	//    8   20:iconst_2        
	//    9   21:newarray        char[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:ldc1            #46  <Int 1569>
	//   13   27:castore         
	//   14   28:dup             
	//   15   29:iconst_1        
	//   16   30:ldc1            #106 <Int -384>
	//   17   32:castore         
	//   18   33:astore_2        
		char ac[] = {
			'\u0622', '\uFE81', '\uFE82'
		};
	//   19   34:iconst_3        
	//   20   35:newarray        char[]
	//   21   37:dup             
	//   22   38:iconst_0        
	//   23   39:ldc1            #18  <Int 1570>
	//   24   41:castore         
	//   25   42:dup             
	//   26   43:iconst_1        
	//   27   44:ldc1            #107 <Int -383>
	//   28   46:castore         
	//   29   47:dup             
	//   30   48:iconst_2        
	//   31   49:ldc1            #108 <Int -382>
	//   32   51:castore         
	//   33   52:astore_3        
		char ac2[] = {
			'\u0623', '\uFE83', '\uFE84'
		};
	//   34   53:iconst_3        
	//   35   54:newarray        char[]
	//   36   56:dup             
	//   37   57:iconst_0        
	//   38   58:ldc1            #14  <Int 1571>
	//   39   60:castore         
	//   40   61:dup             
	//   41   62:iconst_1        
	//   42   63:ldc1            #109 <Int -381>
	//   43   65:castore         
	//   44   66:dup             
	//   45   67:iconst_2        
	//   46   68:ldc1            #110 <Int -380>
	//   47   70:castore         
	//   48   71:astore          4
		char ac3[] = {
			'\u0624', '\uFE85', '\uFE86'
		};
	//   49   73:iconst_3        
	//   50   74:newarray        char[]
	//   51   76:dup             
	//   52   77:iconst_0        
	//   53   78:ldc1            #72  <Int 1572>
	//   54   80:castore         
	//   55   81:dup             
	//   56   82:iconst_1        
	//   57   83:ldc1            #111 <Int -379>
	//   58   85:castore         
	//   59   86:dup             
	//   60   87:iconst_2        
	//   61   88:ldc1            #112 <Int -378>
	//   62   90:castore         
	//   63   91:astore          5
		char ac4[] = {
			'\u0627', '\uFE8D', '\uFE8E'
		};
	//   64   93:iconst_3        
	//   65   94:newarray        char[]
	//   66   96:dup             
	//   67   97:iconst_0        
	//   68   98:ldc1            #12  <Int 1575>
	//   69  100:castore         
	//   70  101:dup             
	//   71  102:iconst_1        
	//   72  103:ldc1            #113 <Int -371>
	//   73  105:castore         
	//   74  106:dup             
	//   75  107:iconst_2        
	//   76  108:ldc1            #114 <Int -370>
	//   77  110:castore         
	//   78  111:astore          6
		char ac5[] = {
			'\u0628', '\uFE8F', '\uFE90', '\uFE91', '\uFE92'
		};
	//   79  113:iconst_5        
	//   80  114:newarray        char[]
	//   81  116:dup             
	//   82  117:iconst_0        
	//   83  118:ldc1            #115 <Int 1576>
	//   84  120:castore         
	//   85  121:dup             
	//   86  122:iconst_1        
	//   87  123:ldc1            #116 <Int -369>
	//   88  125:castore         
	//   89  126:dup             
	//   90  127:iconst_2        
	//   91  128:ldc1            #117 <Int -368>
	//   92  130:castore         
	//   93  131:dup             
	//   94  132:iconst_3        
	//   95  133:ldc1            #118 <Int -367>
	//   96  135:castore         
	//   97  136:dup             
	//   98  137:iconst_4        
	//   99  138:ldc1            #119 <Int -366>
	//  100  140:castore         
	//  101  141:astore          7
		char ac6[] = {
			'\u0629', '\uFE93', '\uFE94'
		};
	//  102  143:iconst_3        
	//  103  144:newarray        char[]
	//  104  146:dup             
	//  105  147:iconst_0        
	//  106  148:ldc1            #120 <Int 1577>
	//  107  150:castore         
	//  108  151:dup             
	//  109  152:iconst_1        
	//  110  153:ldc1            #121 <Int -365>
	//  111  155:castore         
	//  112  156:dup             
	//  113  157:iconst_2        
	//  114  158:ldc1            #122 <Int -364>
	//  115  160:castore         
	//  116  161:astore          8
		char ac7[] = {
			'\u062A', '\uFE95', '\uFE96', '\uFE97', '\uFE98'
		};
	//  117  163:iconst_5        
	//  118  164:newarray        char[]
	//  119  166:dup             
	//  120  167:iconst_0        
	//  121  168:ldc1            #123 <Int 1578>
	//  122  170:castore         
	//  123  171:dup             
	//  124  172:iconst_1        
	//  125  173:ldc1            #124 <Int -363>
	//  126  175:castore         
	//  127  176:dup             
	//  128  177:iconst_2        
	//  129  178:ldc1            #125 <Int -362>
	//  130  180:castore         
	//  131  181:dup             
	//  132  182:iconst_3        
	//  133  183:ldc1            #126 <Int -361>
	//  134  185:castore         
	//  135  186:dup             
	//  136  187:iconst_4        
	//  137  188:ldc1            #127 <Int -360>
	//  138  190:castore         
	//  139  191:astore          9
		char ac8[] = {
			'\u062C', '\uFE9D', '\uFE9E', '\uFE9F', '\uFEA0'
		};
	//  140  193:iconst_5        
	//  141  194:newarray        char[]
	//  142  196:dup             
	//  143  197:iconst_0        
	//  144  198:ldc1            #128 <Int 1580>
	//  145  200:castore         
	//  146  201:dup             
	//  147  202:iconst_1        
	//  148  203:ldc1            #129 <Int -355>
	//  149  205:castore         
	//  150  206:dup             
	//  151  207:iconst_2        
	//  152  208:ldc1            #130 <Int -354>
	//  153  210:castore         
	//  154  211:dup             
	//  155  212:iconst_3        
	//  156  213:ldc1            #131 <Int -353>
	//  157  215:castore         
	//  158  216:dup             
	//  159  217:iconst_4        
	//  160  218:ldc1            #132 <Int -352>
	//  161  220:castore         
	//  162  221:astore          10
		char ac9[] = {
			'\u062E', '\uFEA5', '\uFEA6', '\uFEA7', '\uFEA8'
		};
	//  163  223:iconst_5        
	//  164  224:newarray        char[]
	//  165  226:dup             
	//  166  227:iconst_0        
	//  167  228:ldc1            #133 <Int 1582>
	//  168  230:castore         
	//  169  231:dup             
	//  170  232:iconst_1        
	//  171  233:ldc1            #134 <Int -347>
	//  172  235:castore         
	//  173  236:dup             
	//  174  237:iconst_2        
	//  175  238:ldc1            #135 <Int -346>
	//  176  240:castore         
	//  177  241:dup             
	//  178  242:iconst_3        
	//  179  243:ldc1            #136 <Int -345>
	//  180  245:castore         
	//  181  246:dup             
	//  182  247:iconst_4        
	//  183  248:ldc1            #137 <Int -344>
	//  184  250:castore         
	//  185  251:astore          11
		char ac10[] = {
			'\u0630', '\uFEAB', '\uFEAC'
		};
	//  186  253:iconst_3        
	//  187  254:newarray        char[]
	//  188  256:dup             
	//  189  257:iconst_0        
	//  190  258:ldc1            #138 <Int 1584>
	//  191  260:castore         
	//  192  261:dup             
	//  193  262:iconst_1        
	//  194  263:ldc1            #139 <Int -341>
	//  195  265:castore         
	//  196  266:dup             
	//  197  267:iconst_2        
	//  198  268:ldc1            #140 <Int -340>
	//  199  270:castore         
	//  200  271:astore          12
		char ac11[] = {
			'\u0631', '\uFEAD', '\uFEAE'
		};
	//  201  273:iconst_3        
	//  202  274:newarray        char[]
	//  203  276:dup             
	//  204  277:iconst_0        
	//  205  278:ldc1            #141 <Int 1585>
	//  206  280:castore         
	//  207  281:dup             
	//  208  282:iconst_1        
	//  209  283:ldc1            #142 <Int -339>
	//  210  285:castore         
	//  211  286:dup             
	//  212  287:iconst_2        
	//  213  288:ldc1            #143 <Int -338>
	//  214  290:castore         
	//  215  291:astore          13
		char ac12[] = {
			'\u0632', '\uFEAF', '\uFEB0'
		};
	//  216  293:iconst_3        
	//  217  294:newarray        char[]
	//  218  296:dup             
	//  219  297:iconst_0        
	//  220  298:ldc1            #144 <Int 1586>
	//  221  300:castore         
	//  222  301:dup             
	//  223  302:iconst_1        
	//  224  303:ldc1            #145 <Int -337>
	//  225  305:castore         
	//  226  306:dup             
	//  227  307:iconst_2        
	//  228  308:ldc1            #146 <Int -336>
	//  229  310:castore         
	//  230  311:astore          14
		char ac13[] = {
			'\u0634', '\uFEB5', '\uFEB6', '\uFEB7', '\uFEB8'
		};
	//  231  313:iconst_5        
	//  232  314:newarray        char[]
	//  233  316:dup             
	//  234  317:iconst_0        
	//  235  318:ldc1            #147 <Int 1588>
	//  236  320:castore         
	//  237  321:dup             
	//  238  322:iconst_1        
	//  239  323:ldc1            #148 <Int -331>
	//  240  325:castore         
	//  241  326:dup             
	//  242  327:iconst_2        
	//  243  328:ldc1            #149 <Int -330>
	//  244  330:castore         
	//  245  331:dup             
	//  246  332:iconst_3        
	//  247  333:ldc1            #150 <Int -329>
	//  248  335:castore         
	//  249  336:dup             
	//  250  337:iconst_4        
	//  251  338:ldc1            #151 <Int -328>
	//  252  340:castore         
	//  253  341:astore          15
		char ac14[] = {
			'\u0636', '\uFEBD', '\uFEBE', '\uFEBF', '\uFEC0'
		};
	//  254  343:iconst_5        
	//  255  344:newarray        char[]
	//  256  346:dup             
	//  257  347:iconst_0        
	//  258  348:ldc1            #152 <Int 1590>
	//  259  350:castore         
	//  260  351:dup             
	//  261  352:iconst_1        
	//  262  353:ldc1            #153 <Int -323>
	//  263  355:castore         
	//  264  356:dup             
	//  265  357:iconst_2        
	//  266  358:ldc1            #154 <Int -322>
	//  267  360:castore         
	//  268  361:dup             
	//  269  362:iconst_3        
	//  270  363:ldc1            #155 <Int -321>
	//  271  365:castore         
	//  272  366:dup             
	//  273  367:iconst_4        
	//  274  368:ldc1            #156 <Int -320>
	//  275  370:castore         
	//  276  371:astore          16
		char ac15[] = {
			'\u0637', '\uFEC1', '\uFEC2', '\uFEC3', '\uFEC4'
		};
	//  277  373:iconst_5        
	//  278  374:newarray        char[]
	//  279  376:dup             
	//  280  377:iconst_0        
	//  281  378:ldc1            #157 <Int 1591>
	//  282  380:castore         
	//  283  381:dup             
	//  284  382:iconst_1        
	//  285  383:ldc1            #158 <Int -319>
	//  286  385:castore         
	//  287  386:dup             
	//  288  387:iconst_2        
	//  289  388:ldc1            #159 <Int -318>
	//  290  390:castore         
	//  291  391:dup             
	//  292  392:iconst_3        
	//  293  393:ldc1            #160 <Int -317>
	//  294  395:castore         
	//  295  396:dup             
	//  296  397:iconst_4        
	//  297  398:ldc1            #161 <Int -316>
	//  298  400:castore         
	//  299  401:astore          17
		char ac16[] = {
			'\u0639', '\uFEC9', '\uFECA', '\uFECB', '\uFECC'
		};
	//  300  403:iconst_5        
	//  301  404:newarray        char[]
	//  302  406:dup             
	//  303  407:iconst_0        
	//  304  408:ldc1            #162 <Int 1593>
	//  305  410:castore         
	//  306  411:dup             
	//  307  412:iconst_1        
	//  308  413:ldc1            #163 <Int -311>
	//  309  415:castore         
	//  310  416:dup             
	//  311  417:iconst_2        
	//  312  418:ldc1            #164 <Int -310>
	//  313  420:castore         
	//  314  421:dup             
	//  315  422:iconst_3        
	//  316  423:ldc1            #165 <Int -309>
	//  317  425:castore         
	//  318  426:dup             
	//  319  427:iconst_4        
	//  320  428:ldc1            #166 <Int -308>
	//  321  430:castore         
	//  322  431:astore          18
		char ac17[] = {
			'\u063A', '\uFECD', '\uFECE', '\uFECF', '\uFED0'
		};
	//  323  433:iconst_5        
	//  324  434:newarray        char[]
	//  325  436:dup             
	//  326  437:iconst_0        
	//  327  438:ldc1            #167 <Int 1594>
	//  328  440:castore         
	//  329  441:dup             
	//  330  442:iconst_1        
	//  331  443:ldc1            #168 <Int -307>
	//  332  445:castore         
	//  333  446:dup             
	//  334  447:iconst_2        
	//  335  448:ldc1            #169 <Int -306>
	//  336  450:castore         
	//  337  451:dup             
	//  338  452:iconst_3        
	//  339  453:ldc1            #170 <Int -305>
	//  340  455:castore         
	//  341  456:dup             
	//  342  457:iconst_4        
	//  343  458:ldc1            #171 <Int -304>
	//  344  460:castore         
	//  345  461:astore          19
		char ac18[] = {
			'\u0640', '\u0640', '\u0640', '\u0640', '\u0640'
		};
	//  346  463:iconst_5        
	//  347  464:newarray        char[]
	//  348  466:dup             
	//  349  467:iconst_0        
	//  350  468:ldc1            #68  <Int 1600>
	//  351  470:castore         
	//  352  471:dup             
	//  353  472:iconst_1        
	//  354  473:ldc1            #68  <Int 1600>
	//  355  475:castore         
	//  356  476:dup             
	//  357  477:iconst_2        
	//  358  478:ldc1            #68  <Int 1600>
	//  359  480:castore         
	//  360  481:dup             
	//  361  482:iconst_3        
	//  362  483:ldc1            #68  <Int 1600>
	//  363  485:castore         
	//  364  486:dup             
	//  365  487:iconst_4        
	//  366  488:ldc1            #68  <Int 1600>
	//  367  490:castore         
	//  368  491:astore          20
		char ac19[] = {
			'\u0642', '\uFED5', '\uFED6', '\uFED7', '\uFED8'
		};
	//  369  493:iconst_5        
	//  370  494:newarray        char[]
	//  371  496:dup             
	//  372  497:iconst_0        
	//  373  498:ldc1            #172 <Int 1602>
	//  374  500:castore         
	//  375  501:dup             
	//  376  502:iconst_1        
	//  377  503:ldc1            #173 <Int -299>
	//  378  505:castore         
	//  379  506:dup             
	//  380  507:iconst_2        
	//  381  508:ldc1            #174 <Int -298>
	//  382  510:castore         
	//  383  511:dup             
	//  384  512:iconst_3        
	//  385  513:ldc1            #175 <Int -297>
	//  386  515:castore         
	//  387  516:dup             
	//  388  517:iconst_4        
	//  389  518:ldc1            #176 <Int -296>
	//  390  520:castore         
	//  391  521:astore          21
		char ac20[] = {
			'\u0643', '\uFED9', '\uFEDA', '\uFEDB', '\uFEDC'
		};
	//  392  523:iconst_5        
	//  393  524:newarray        char[]
	//  394  526:dup             
	//  395  527:iconst_0        
	//  396  528:ldc1            #177 <Int 1603>
	//  397  530:castore         
	//  398  531:dup             
	//  399  532:iconst_1        
	//  400  533:ldc1            #178 <Int -295>
	//  401  535:castore         
	//  402  536:dup             
	//  403  537:iconst_2        
	//  404  538:ldc1            #179 <Int -294>
	//  405  540:castore         
	//  406  541:dup             
	//  407  542:iconst_3        
	//  408  543:ldc1            #180 <Int -293>
	//  409  545:castore         
	//  410  546:dup             
	//  411  547:iconst_4        
	//  412  548:ldc1            #181 <Int -292>
	//  413  550:castore         
	//  414  551:astore          22
		char ac21[] = {
			'\u0644', '\uFEDD', '\uFEDE', '\uFEDF', '\uFEE0'
		};
	//  415  553:iconst_5        
	//  416  554:newarray        char[]
	//  417  556:dup             
	//  418  557:iconst_0        
	//  419  558:ldc1            #54  <Int 1604>
	//  420  560:castore         
	//  421  561:dup             
	//  422  562:iconst_1        
	//  423  563:ldc1            #182 <Int -291>
	//  424  565:castore         
	//  425  566:dup             
	//  426  567:iconst_2        
	//  427  568:ldc1            #183 <Int -290>
	//  428  570:castore         
	//  429  571:dup             
	//  430  572:iconst_3        
	//  431  573:ldc1            #184 <Int -289>
	//  432  575:castore         
	//  433  576:dup             
	//  434  577:iconst_4        
	//  435  578:ldc1            #185 <Int -288>
	//  436  580:castore         
	//  437  581:astore          23
		char ac22[] = {
			'\u0645', '\uFEE1', '\uFEE2', '\uFEE3', '\uFEE4'
		};
	//  438  583:iconst_5        
	//  439  584:newarray        char[]
	//  440  586:dup             
	//  441  587:iconst_0        
	//  442  588:ldc1            #186 <Int 1605>
	//  443  590:castore         
	//  444  591:dup             
	//  445  592:iconst_1        
	//  446  593:ldc1            #187 <Int -287>
	//  447  595:castore         
	//  448  596:dup             
	//  449  597:iconst_2        
	//  450  598:ldc1            #188 <Int -286>
	//  451  600:castore         
	//  452  601:dup             
	//  453  602:iconst_3        
	//  454  603:ldc1            #189 <Int -285>
	//  455  605:castore         
	//  456  606:dup             
	//  457  607:iconst_4        
	//  458  608:ldc1            #190 <Int -284>
	//  459  610:castore         
	//  460  611:astore          24
		char ac23[] = {
			'\u0647', '\uFEE9', '\uFEEA', '\uFEEB', '\uFEEC'
		};
	//  461  613:iconst_5        
	//  462  614:newarray        char[]
	//  463  616:dup             
	//  464  617:iconst_0        
	//  465  618:ldc1            #191 <Int 1607>
	//  466  620:castore         
	//  467  621:dup             
	//  468  622:iconst_1        
	//  469  623:ldc1            #192 <Int -279>
	//  470  625:castore         
	//  471  626:dup             
	//  472  627:iconst_2        
	//  473  628:ldc1            #193 <Int -278>
	//  474  630:castore         
	//  475  631:dup             
	//  476  632:iconst_3        
	//  477  633:ldc1            #194 <Int -277>
	//  478  635:castore         
	//  479  636:dup             
	//  480  637:iconst_4        
	//  481  638:ldc1            #195 <Int -276>
	//  482  640:castore         
	//  483  641:astore          25
		char ac24[] = {
			'\u0649', '\uFEEF', '\uFEF0', '\uFBE8', '\uFBE9'
		};
	//  484  643:iconst_5        
	//  485  644:newarray        char[]
	//  486  646:dup             
	//  487  647:iconst_0        
	//  488  648:ldc1            #20  <Int 1609>
	//  489  650:castore         
	//  490  651:dup             
	//  491  652:iconst_1        
	//  492  653:ldc1            #196 <Int -273>
	//  493  655:castore         
	//  494  656:dup             
	//  495  657:iconst_2        
	//  496  658:ldc1            #197 <Int -272>
	//  497  660:castore         
	//  498  661:dup             
	//  499  662:iconst_3        
	//  500  663:ldc1            #198 <Int -1048>
	//  501  665:castore         
	//  502  666:dup             
	//  503  667:iconst_4        
	//  504  668:ldc1            #199 <Int -1047>
	//  505  670:castore         
	//  506  671:astore          26
		char ac25[] = {
			'\u064A', '\uFEF1', '\uFEF2', '\uFEF3', '\uFEF4'
		};
	//  507  673:iconst_5        
	//  508  674:newarray        char[]
	//  509  676:dup             
	//  510  677:iconst_0        
	//  511  678:ldc1            #74  <Int 1610>
	//  512  680:castore         
	//  513  681:dup             
	//  514  682:iconst_1        
	//  515  683:ldc1            #200 <Int -271>
	//  516  685:castore         
	//  517  686:dup             
	//  518  687:iconst_2        
	//  519  688:ldc1            #201 <Int -270>
	//  520  690:castore         
	//  521  691:dup             
	//  522  692:iconst_3        
	//  523  693:ldc1            #202 <Int -269>
	//  524  695:castore         
	//  525  696:dup             
	//  526  697:iconst_4        
	//  527  698:ldc1            #203 <Int -268>
	//  528  700:castore         
	//  529  701:astore          27
		char ac26[] = {
			'\u0671', '\uFB50', '\uFB51'
		};
	//  530  703:iconst_3        
	//  531  704:newarray        char[]
	//  532  706:dup             
	//  533  707:iconst_0        
	//  534  708:ldc1            #204 <Int 1649>
	//  535  710:castore         
	//  536  711:dup             
	//  537  712:iconst_1        
	//  538  713:ldc1            #205 <Int -1200>
	//  539  715:castore         
	//  540  716:dup             
	//  541  717:iconst_2        
	//  542  718:ldc1            #206 <Int -1199>
	//  543  720:castore         
	//  544  721:astore          28
		char ac27[] = {
			'\u067A', '\uFB5E', '\uFB5F', '\uFB60', '\uFB61'
		};
	//  545  723:iconst_5        
	//  546  724:newarray        char[]
	//  547  726:dup             
	//  548  727:iconst_0        
	//  549  728:ldc1            #207 <Int 1658>
	//  550  730:castore         
	//  551  731:dup             
	//  552  732:iconst_1        
	//  553  733:ldc1            #208 <Int -1186>
	//  554  735:castore         
	//  555  736:dup             
	//  556  737:iconst_2        
	//  557  738:ldc1            #209 <Int -1185>
	//  558  740:castore         
	//  559  741:dup             
	//  560  742:iconst_3        
	//  561  743:ldc1            #210 <Int -1184>
	//  562  745:castore         
	//  563  746:dup             
	//  564  747:iconst_4        
	//  565  748:ldc1            #211 <Int -1183>
	//  566  750:castore         
	//  567  751:astore          29
		char ac28[] = {
			'\u067B', '\uFB52', '\uFB53', '\uFB54', '\uFB55'
		};
	//  568  753:iconst_5        
	//  569  754:newarray        char[]
	//  570  756:dup             
	//  571  757:iconst_0        
	//  572  758:ldc1            #212 <Int 1659>
	//  573  760:castore         
	//  574  761:dup             
	//  575  762:iconst_1        
	//  576  763:ldc1            #213 <Int -1198>
	//  577  765:castore         
	//  578  766:dup             
	//  579  767:iconst_2        
	//  580  768:ldc1            #214 <Int -1197>
	//  581  770:castore         
	//  582  771:dup             
	//  583  772:iconst_3        
	//  584  773:ldc1            #215 <Int -1196>
	//  585  775:castore         
	//  586  776:dup             
	//  587  777:iconst_4        
	//  588  778:ldc1            #216 <Int -1195>
	//  589  780:castore         
	//  590  781:astore          30
		char ac29[] = {
			'\u067E', '\uFB56', '\uFB57', '\uFB58', '\uFB59'
		};
	//  591  783:iconst_5        
	//  592  784:newarray        char[]
	//  593  786:dup             
	//  594  787:iconst_0        
	//  595  788:ldc1            #217 <Int 1662>
	//  596  790:castore         
	//  597  791:dup             
	//  598  792:iconst_1        
	//  599  793:ldc1            #218 <Int -1194>
	//  600  795:castore         
	//  601  796:dup             
	//  602  797:iconst_2        
	//  603  798:ldc1            #219 <Int -1193>
	//  604  800:castore         
	//  605  801:dup             
	//  606  802:iconst_3        
	//  607  803:ldc1            #220 <Int -1192>
	//  608  805:castore         
	//  609  806:dup             
	//  610  807:iconst_4        
	//  611  808:ldc1            #221 <Int -1191>
	//  612  810:castore         
	//  613  811:astore          31
		char ac30[] = {
			'\u067F', '\uFB62', '\uFB63', '\uFB64', '\uFB65'
		};
	//  614  813:iconst_5        
	//  615  814:newarray        char[]
	//  616  816:dup             
	//  617  817:iconst_0        
	//  618  818:ldc1            #222 <Int 1663>
	//  619  820:castore         
	//  620  821:dup             
	//  621  822:iconst_1        
	//  622  823:ldc1            #223 <Int -1182>
	//  623  825:castore         
	//  624  826:dup             
	//  625  827:iconst_2        
	//  626  828:ldc1            #224 <Int -1181>
	//  627  830:castore         
	//  628  831:dup             
	//  629  832:iconst_3        
	//  630  833:ldc1            #225 <Int -1180>
	//  631  835:castore         
	//  632  836:dup             
	//  633  837:iconst_4        
	//  634  838:ldc1            #226 <Int -1179>
	//  635  840:castore         
	//  636  841:astore          32
		char ac31[] = {
			'\u0680', '\uFB5A', '\uFB5B', '\uFB5C', '\uFB5D'
		};
	//  637  843:iconst_5        
	//  638  844:newarray        char[]
	//  639  846:dup             
	//  640  847:iconst_0        
	//  641  848:ldc1            #227 <Int 1664>
	//  642  850:castore         
	//  643  851:dup             
	//  644  852:iconst_1        
	//  645  853:ldc1            #228 <Int -1190>
	//  646  855:castore         
	//  647  856:dup             
	//  648  857:iconst_2        
	//  649  858:ldc1            #229 <Int -1189>
	//  650  860:castore         
	//  651  861:dup             
	//  652  862:iconst_3        
	//  653  863:ldc1            #230 <Int -1188>
	//  654  865:castore         
	//  655  866:dup             
	//  656  867:iconst_4        
	//  657  868:ldc1            #231 <Int -1187>
	//  658  870:castore         
	//  659  871:astore          33
		char ac32[] = {
			'\u0684', '\uFB72', '\uFB73', '\uFB74', '\uFB75'
		};
	//  660  873:iconst_5        
	//  661  874:newarray        char[]
	//  662  876:dup             
	//  663  877:iconst_0        
	//  664  878:ldc1            #232 <Int 1668>
	//  665  880:castore         
	//  666  881:dup             
	//  667  882:iconst_1        
	//  668  883:ldc1            #233 <Int -1166>
	//  669  885:castore         
	//  670  886:dup             
	//  671  887:iconst_2        
	//  672  888:ldc1            #234 <Int -1165>
	//  673  890:castore         
	//  674  891:dup             
	//  675  892:iconst_3        
	//  676  893:ldc1            #235 <Int -1164>
	//  677  895:castore         
	//  678  896:dup             
	//  679  897:iconst_4        
	//  680  898:ldc1            #236 <Int -1163>
	//  681  900:castore         
	//  682  901:astore          34
		char ac33[] = {
			'\u0686', '\uFB7A', '\uFB7B', '\uFB7C', '\uFB7D'
		};
	//  683  903:iconst_5        
	//  684  904:newarray        char[]
	//  685  906:dup             
	//  686  907:iconst_0        
	//  687  908:ldc1            #237 <Int 1670>
	//  688  910:castore         
	//  689  911:dup             
	//  690  912:iconst_1        
	//  691  913:ldc1            #238 <Int -1158>
	//  692  915:castore         
	//  693  916:dup             
	//  694  917:iconst_2        
	//  695  918:ldc1            #239 <Int -1157>
	//  696  920:castore         
	//  697  921:dup             
	//  698  922:iconst_3        
	//  699  923:ldc1            #240 <Int -1156>
	//  700  925:castore         
	//  701  926:dup             
	//  702  927:iconst_4        
	//  703  928:ldc1            #241 <Int -1155>
	//  704  930:castore         
	//  705  931:astore          35
		char ac34[] = {
			'\u0688', '\uFB88', '\uFB89'
		};
	//  706  933:iconst_3        
	//  707  934:newarray        char[]
	//  708  936:dup             
	//  709  937:iconst_0        
	//  710  938:ldc1            #242 <Int 1672>
	//  711  940:castore         
	//  712  941:dup             
	//  713  942:iconst_1        
	//  714  943:ldc1            #243 <Int -1144>
	//  715  945:castore         
	//  716  946:dup             
	//  717  947:iconst_2        
	//  718  948:ldc1            #244 <Int -1143>
	//  719  950:castore         
	//  720  951:astore          36
		char ac35[] = {
			'\u068C', '\uFB84', '\uFB85'
		};
	//  721  953:iconst_3        
	//  722  954:newarray        char[]
	//  723  956:dup             
	//  724  957:iconst_0        
	//  725  958:ldc1            #245 <Int 1676>
	//  726  960:castore         
	//  727  961:dup             
	//  728  962:iconst_1        
	//  729  963:ldc1            #246 <Int -1148>
	//  730  965:castore         
	//  731  966:dup             
	//  732  967:iconst_2        
	//  733  968:ldc1            #247 <Int -1147>
	//  734  970:castore         
	//  735  971:astore          37
		char ac36[] = {
			'\u068D', '\uFB82', '\uFB83'
		};
	//  736  973:iconst_3        
	//  737  974:newarray        char[]
	//  738  976:dup             
	//  739  977:iconst_0        
	//  740  978:ldc1            #248 <Int 1677>
	//  741  980:castore         
	//  742  981:dup             
	//  743  982:iconst_1        
	//  744  983:ldc1            #249 <Int -1150>
	//  745  985:castore         
	//  746  986:dup             
	//  747  987:iconst_2        
	//  748  988:ldc1            #250 <Int -1149>
	//  749  990:castore         
	//  750  991:astore          38
		char ac37[] = {
			'\u068E', '\uFB86', '\uFB87'
		};
	//  751  993:iconst_3        
	//  752  994:newarray        char[]
	//  753  996:dup             
	//  754  997:iconst_0        
	//  755  998:ldc1            #251 <Int 1678>
	//  756 1000:castore         
	//  757 1001:dup             
	//  758 1002:iconst_1        
	//  759 1003:ldc1            #252 <Int -1146>
	//  760 1005:castore         
	//  761 1006:dup             
	//  762 1007:iconst_2        
	//  763 1008:ldc1            #253 <Int -1145>
	//  764 1010:castore         
	//  765 1011:astore          39
		char ac38[] = {
			'\u0691', '\uFB8C', '\uFB8D'
		};
	//  766 1013:iconst_3        
	//  767 1014:newarray        char[]
	//  768 1016:dup             
	//  769 1017:iconst_0        
	//  770 1018:ldc1            #254 <Int 1681>
	//  771 1020:castore         
	//  772 1021:dup             
	//  773 1022:iconst_1        
	//  774 1023:ldc1            #255 <Int -1140>
	//  775 1025:castore         
	//  776 1026:dup             
	//  777 1027:iconst_2        
	//  778 1028:ldc2            #256 <Int -1139>
	//  779 1031:castore         
	//  780 1032:astore          40
		char ac39[] = {
			'\u0698', '\uFB8A', '\uFB8B'
		};
	//  781 1034:iconst_3        
	//  782 1035:newarray        char[]
	//  783 1037:dup             
	//  784 1038:iconst_0        
	//  785 1039:ldc2            #257 <Int 1688>
	//  786 1042:castore         
	//  787 1043:dup             
	//  788 1044:iconst_1        
	//  789 1045:ldc2            #258 <Int -1142>
	//  790 1048:castore         
	//  791 1049:dup             
	//  792 1050:iconst_2        
	//  793 1051:ldc2            #259 <Int -1141>
	//  794 1054:castore         
	//  795 1055:astore          41
		char ac40[] = {
			'\u06A9', '\uFB8E', '\uFB8F', '\uFB90', '\uFB91'
		};
	//  796 1057:iconst_5        
	//  797 1058:newarray        char[]
	//  798 1060:dup             
	//  799 1061:iconst_0        
	//  800 1062:ldc2            #260 <Int 1705>
	//  801 1065:castore         
	//  802 1066:dup             
	//  803 1067:iconst_1        
	//  804 1068:ldc2            #261 <Int -1138>
	//  805 1071:castore         
	//  806 1072:dup             
	//  807 1073:iconst_2        
	//  808 1074:ldc2            #262 <Int -1137>
	//  809 1077:castore         
	//  810 1078:dup             
	//  811 1079:iconst_3        
	//  812 1080:ldc2            #263 <Int -1136>
	//  813 1083:castore         
	//  814 1084:dup             
	//  815 1085:iconst_4        
	//  816 1086:ldc2            #264 <Int -1135>
	//  817 1089:castore         
	//  818 1090:astore          42
		char ac41[] = {
			'\u06AD', '\uFBD3', '\uFBD4', '\uFBD5', '\uFBD6'
		};
	//  819 1092:iconst_5        
	//  820 1093:newarray        char[]
	//  821 1095:dup             
	//  822 1096:iconst_0        
	//  823 1097:ldc2            #265 <Int 1709>
	//  824 1100:castore         
	//  825 1101:dup             
	//  826 1102:iconst_1        
	//  827 1103:ldc2            #266 <Int -1069>
	//  828 1106:castore         
	//  829 1107:dup             
	//  830 1108:iconst_2        
	//  831 1109:ldc2            #267 <Int -1068>
	//  832 1112:castore         
	//  833 1113:dup             
	//  834 1114:iconst_3        
	//  835 1115:ldc2            #268 <Int -1067>
	//  836 1118:castore         
	//  837 1119:dup             
	//  838 1120:iconst_4        
	//  839 1121:ldc2            #269 <Int -1066>
	//  840 1124:castore         
	//  841 1125:astore          43
		char ac42[] = {
			'\u06BA', '\uFB9E', '\uFB9F'
		};
	//  842 1127:iconst_3        
	//  843 1128:newarray        char[]
	//  844 1130:dup             
	//  845 1131:iconst_0        
	//  846 1132:ldc2            #270 <Int 1722>
	//  847 1135:castore         
	//  848 1136:dup             
	//  849 1137:iconst_1        
	//  850 1138:ldc2            #271 <Int -1122>
	//  851 1141:castore         
	//  852 1142:dup             
	//  853 1143:iconst_2        
	//  854 1144:ldc2            #272 <Int -1121>
	//  855 1147:castore         
	//  856 1148:astore          44
		char ac43[] = {
			'\u06BB', '\uFBA0', '\uFBA1', '\uFBA2', '\uFBA3'
		};
	//  857 1150:iconst_5        
	//  858 1151:newarray        char[]
	//  859 1153:dup             
	//  860 1154:iconst_0        
	//  861 1155:ldc2            #273 <Int 1723>
	//  862 1158:castore         
	//  863 1159:dup             
	//  864 1160:iconst_1        
	//  865 1161:ldc2            #274 <Int -1120>
	//  866 1164:castore         
	//  867 1165:dup             
	//  868 1166:iconst_2        
	//  869 1167:ldc2            #275 <Int -1119>
	//  870 1170:castore         
	//  871 1171:dup             
	//  872 1172:iconst_3        
	//  873 1173:ldc2            #276 <Int -1118>
	//  874 1176:castore         
	//  875 1177:dup             
	//  876 1178:iconst_4        
	//  877 1179:ldc2            #277 <Int -1117>
	//  878 1182:castore         
	//  879 1183:astore          45
		char ac44[] = {
			'\u06BE', '\uFBAA', '\uFBAB', '\uFBAC', '\uFBAD'
		};
	//  880 1185:iconst_5        
	//  881 1186:newarray        char[]
	//  882 1188:dup             
	//  883 1189:iconst_0        
	//  884 1190:ldc2            #278 <Int 1726>
	//  885 1193:castore         
	//  886 1194:dup             
	//  887 1195:iconst_1        
	//  888 1196:ldc2            #279 <Int -1110>
	//  889 1199:castore         
	//  890 1200:dup             
	//  891 1201:iconst_2        
	//  892 1202:ldc2            #280 <Int -1109>
	//  893 1205:castore         
	//  894 1206:dup             
	//  895 1207:iconst_3        
	//  896 1208:ldc2            #281 <Int -1108>
	//  897 1211:castore         
	//  898 1212:dup             
	//  899 1213:iconst_4        
	//  900 1214:ldc2            #282 <Int -1107>
	//  901 1217:castore         
	//  902 1218:astore          46
		char ac45[] = {
			'\u06C0', '\uFBA4', '\uFBA5'
		};
	//  903 1220:iconst_3        
	//  904 1221:newarray        char[]
	//  905 1223:dup             
	//  906 1224:iconst_0        
	//  907 1225:ldc2            #283 <Int 1728>
	//  908 1228:castore         
	//  909 1229:dup             
	//  910 1230:iconst_1        
	//  911 1231:ldc2            #284 <Int -1116>
	//  912 1234:castore         
	//  913 1235:dup             
	//  914 1236:iconst_2        
	//  915 1237:ldc2            #285 <Int -1115>
	//  916 1240:castore         
	//  917 1241:astore          47
		char ac46[] = {
			'\u06C1', '\uFBA6', '\uFBA7', '\uFBA8', '\uFBA9'
		};
	//  918 1243:iconst_5        
	//  919 1244:newarray        char[]
	//  920 1246:dup             
	//  921 1247:iconst_0        
	//  922 1248:ldc2            #286 <Int 1729>
	//  923 1251:castore         
	//  924 1252:dup             
	//  925 1253:iconst_1        
	//  926 1254:ldc2            #287 <Int -1114>
	//  927 1257:castore         
	//  928 1258:dup             
	//  929 1259:iconst_2        
	//  930 1260:ldc2            #288 <Int -1113>
	//  931 1263:castore         
	//  932 1264:dup             
	//  933 1265:iconst_3        
	//  934 1266:ldc2            #289 <Int -1112>
	//  935 1269:castore         
	//  936 1270:dup             
	//  937 1271:iconst_4        
	//  938 1272:ldc2            #290 <Int -1111>
	//  939 1275:castore         
	//  940 1276:astore          48
		char ac47[] = {
			'\u06C5', '\uFBE0', '\uFBE1'
		};
	//  941 1278:iconst_3        
	//  942 1279:newarray        char[]
	//  943 1281:dup             
	//  944 1282:iconst_0        
	//  945 1283:ldc2            #291 <Int 1733>
	//  946 1286:castore         
	//  947 1287:dup             
	//  948 1288:iconst_1        
	//  949 1289:ldc2            #292 <Int -1056>
	//  950 1292:castore         
	//  951 1293:dup             
	//  952 1294:iconst_2        
	//  953 1295:ldc2            #293 <Int -1055>
	//  954 1298:castore         
	//  955 1299:astore          49
		char ac48[] = {
			'\u06C8', '\uFBDB', '\uFBDC'
		};
	//  956 1301:iconst_3        
	//  957 1302:newarray        char[]
	//  958 1304:dup             
	//  959 1305:iconst_0        
	//  960 1306:ldc2            #294 <Int 1736>
	//  961 1309:castore         
	//  962 1310:dup             
	//  963 1311:iconst_1        
	//  964 1312:ldc2            #295 <Int -1061>
	//  965 1315:castore         
	//  966 1316:dup             
	//  967 1317:iconst_2        
	//  968 1318:ldc2            #296 <Int -1060>
	//  969 1321:castore         
	//  970 1322:astore          50
		char ac49[] = {
			'\u06C9', '\uFBE2', '\uFBE3'
		};
	//  971 1324:iconst_3        
	//  972 1325:newarray        char[]
	//  973 1327:dup             
	//  974 1328:iconst_0        
	//  975 1329:ldc2            #297 <Int 1737>
	//  976 1332:castore         
	//  977 1333:dup             
	//  978 1334:iconst_1        
	//  979 1335:ldc2            #298 <Int -1054>
	//  980 1338:castore         
	//  981 1339:dup             
	//  982 1340:iconst_2        
	//  983 1341:ldc2            #299 <Int -1053>
	//  984 1344:castore         
	//  985 1345:astore          51
		char ac50[] = {
			'\u06CB', '\uFBDE', '\uFBDF'
		};
	//  986 1347:iconst_3        
	//  987 1348:newarray        char[]
	//  988 1350:dup             
	//  989 1351:iconst_0        
	//  990 1352:ldc2            #300 <Int 1739>
	//  991 1355:castore         
	//  992 1356:dup             
	//  993 1357:iconst_1        
	//  994 1358:ldc2            #301 <Int -1058>
	//  995 1361:castore         
	//  996 1362:dup             
	//  997 1363:iconst_2        
	//  998 1364:ldc2            #302 <Int -1057>
	//  999 1367:castore         
	// 1000 1368:astore          52
		char ac51[] = {
			'\u06D0', '\uFBE4', '\uFBE5', '\uFBE6', '\uFBE7'
		};
	// 1001 1370:iconst_5        
	// 1002 1371:newarray        char[]
	// 1003 1373:dup             
	// 1004 1374:iconst_0        
	// 1005 1375:ldc2            #303 <Int 1744>
	// 1006 1378:castore         
	// 1007 1379:dup             
	// 1008 1380:iconst_1        
	// 1009 1381:ldc2            #304 <Int -1052>
	// 1010 1384:castore         
	// 1011 1385:dup             
	// 1012 1386:iconst_2        
	// 1013 1387:ldc2            #305 <Int -1051>
	// 1014 1390:castore         
	// 1015 1391:dup             
	// 1016 1392:iconst_3        
	// 1017 1393:ldc2            #306 <Int -1050>
	// 1018 1396:castore         
	// 1019 1397:dup             
	// 1020 1398:iconst_4        
	// 1021 1399:ldc2            #307 <Int -1049>
	// 1022 1402:castore         
	// 1023 1403:astore          53
		char ac52[] = {
			'\u06D2', '\uFBAE', '\uFBAF'
		};
	// 1024 1405:iconst_3        
	// 1025 1406:newarray        char[]
	// 1026 1408:dup             
	// 1027 1409:iconst_0        
	// 1028 1410:ldc2            #308 <Int 1746>
	// 1029 1413:castore         
	// 1030 1414:dup             
	// 1031 1415:iconst_1        
	// 1032 1416:ldc2            #309 <Int -1106>
	// 1033 1419:castore         
	// 1034 1420:dup             
	// 1035 1421:iconst_2        
	// 1036 1422:ldc2            #310 <Int -1105>
	// 1037 1425:castore         
	// 1038 1426:astore          54
		chartable = (new char[][] {
			obj, ac, ac2, ac3, new char[] {
				'\u0625', '\uFE87', '\uFE88'
			}, new char[] {
				'\u0626', '\uFE89', '\uFE8A', '\uFE8B', '\uFE8C'
			}, ac4, ac5, ac6, ac7, 
			new char[] {
				'\u062B', '\uFE99', '\uFE9A', '\uFE9B', '\uFE9C'
			}, ac8, new char[] {
				'\u062D', '\uFEA1', '\uFEA2', '\uFEA3', '\uFEA4'
			}, ac9, new char[] {
				'\u062F', '\uFEA9', '\uFEAA'
			}, ac10, ac11, ac12, new char[] {
				'\u0633', '\uFEB1', '\uFEB2', '\uFEB3', '\uFEB4'
			}, ac13, 
			new char[] {
				'\u0635', '\uFEB9', '\uFEBA', '\uFEBB', '\uFEBC'
			}, ac14, ac15, new char[] {
				'\u0638', '\uFEC5', '\uFEC6', '\uFEC7', '\uFEC8'
			}, ac16, ac17, ac18, new char[] {
				'\u0641', '\uFED1', '\uFED2', '\uFED3', '\uFED4'
			}, ac19, ac20, 
			ac21, ac22, new char[] {
				'\u0646', '\uFEE5', '\uFEE6', '\uFEE7', '\uFEE8'
			}, ac23, new char[] {
				'\u0648', '\uFEED', '\uFEEE'
			}, ac24, ac25, ac26, new char[] {
				'\u0679', '\uFB66', '\uFB67', '\uFB68', '\uFB69'
			}, ac27, 
			ac28, ac29, ac30, ac31, new char[] {
				'\u0683', '\uFB76', '\uFB77', '\uFB78', '\uFB79'
			}, ac32, ac33, new char[] {
				'\u0687', '\uFB7E', '\uFB7F', '\uFB80', '\uFB81'
			}, ac34, ac35, 
			ac36, ac37, ac38, ac39, new char[] {
				'\u06A4', '\uFB6A', '\uFB6B', '\uFB6C', '\uFB6D'
			}, new char[] {
				'\u06A6', '\uFB6E', '\uFB6F', '\uFB70', '\uFB71'
			}, ac40, ac41, new char[] {
				'\u06AF', '\uFB92', '\uFB93', '\uFB94', '\uFB95'
			}, new char[] {
				'\u06B1', '\uFB9A', '\uFB9B', '\uFB9C', '\uFB9D'
			}, 
			new char[] {
				'\u06B3', '\uFB96', '\uFB97', '\uFB98', '\uFB99'
			}, ac42, ac43, ac44, ac45, ac46, ac47, new char[] {
				'\u06C6', '\uFBD9', '\uFBDA'
			}, new char[] {
				'\u06C7', '\uFBD7', '\uFBD8'
			}, ac48, 
			ac49, ac50, new char[] {
				'\u06CC', '\uFBFC', '\uFBFD', '\uFBFE', '\uFBFF'
			}, ac51, ac52, new char[] {
				'\u06D3', '\uFBB0', '\uFBB1'
			}
		});
	// 1039 1428:bipush          76
	// 1040 1430:anewarray       char[][]
	// 1041 1433:dup             
	// 1042 1434:iconst_0        
	// 1043 1435:aload_2         
	// 1044 1436:aastore         
	// 1045 1437:dup             
	// 1046 1438:iconst_1        
	// 1047 1439:aload_3         
	// 1048 1440:aastore         
	// 1049 1441:dup             
	// 1050 1442:iconst_2        
	// 1051 1443:aload           4
	// 1052 1445:aastore         
	// 1053 1446:dup             
	// 1054 1447:iconst_3        
	// 1055 1448:aload           5
	// 1056 1450:aastore         
	// 1057 1451:dup             
	// 1058 1452:iconst_4        
	// 1059 1453:iconst_3        
	// 1060 1454:newarray        char[]
	// 1061 1456:dup             
	// 1062 1457:iconst_0        
	// 1063 1458:ldc1            #16  <Int 1573>
	// 1064 1460:castore         
	// 1065 1461:dup             
	// 1066 1462:iconst_1        
	// 1067 1463:ldc2            #313 <Int -377>
	// 1068 1466:castore         
	// 1069 1467:dup             
	// 1070 1468:iconst_2        
	// 1071 1469:ldc2            #314 <Int -376>
	// 1072 1472:castore         
	// 1073 1473:aastore         
	// 1074 1474:dup             
	// 1075 1475:iconst_5        
	// 1076 1476:iconst_5        
	// 1077 1477:newarray        char[]
	// 1078 1479:dup             
	// 1079 1480:iconst_0        
	// 1080 1481:ldc1            #76  <Int 1574>
	// 1081 1483:castore         
	// 1082 1484:dup             
	// 1083 1485:iconst_1        
	// 1084 1486:ldc2            #315 <Int -375>
	// 1085 1489:castore         
	// 1086 1490:dup             
	// 1087 1491:iconst_2        
	// 1088 1492:ldc2            #316 <Int -374>
	// 1089 1495:castore         
	// 1090 1496:dup             
	// 1091 1497:iconst_3        
	// 1092 1498:ldc2            #317 <Int -373>
	// 1093 1501:castore         
	// 1094 1502:dup             
	// 1095 1503:iconst_4        
	// 1096 1504:ldc2            #318 <Int -372>
	// 1097 1507:castore         
	// 1098 1508:aastore         
	// 1099 1509:dup             
	// 1100 1510:bipush          6
	// 1101 1512:aload           6
	// 1102 1514:aastore         
	// 1103 1515:dup             
	// 1104 1516:bipush          7
	// 1105 1518:aload           7
	// 1106 1520:aastore         
	// 1107 1521:dup             
	// 1108 1522:bipush          8
	// 1109 1524:aload           8
	// 1110 1526:aastore         
	// 1111 1527:dup             
	// 1112 1528:bipush          9
	// 1113 1530:aload           9
	// 1114 1532:aastore         
	// 1115 1533:dup             
	// 1116 1534:bipush          10
	// 1117 1536:iconst_5        
	// 1118 1537:newarray        char[]
	// 1119 1539:dup             
	// 1120 1540:iconst_0        
	// 1121 1541:ldc2            #319 <Int 1579>
	// 1122 1544:castore         
	// 1123 1545:dup             
	// 1124 1546:iconst_1        
	// 1125 1547:ldc2            #320 <Int -359>
	// 1126 1550:castore         
	// 1127 1551:dup             
	// 1128 1552:iconst_2        
	// 1129 1553:ldc2            #321 <Int -358>
	// 1130 1556:castore         
	// 1131 1557:dup             
	// 1132 1558:iconst_3        
	// 1133 1559:ldc2            #322 <Int -357>
	// 1134 1562:castore         
	// 1135 1563:dup             
	// 1136 1564:iconst_4        
	// 1137 1565:ldc2            #323 <Int -356>
	// 1138 1568:castore         
	// 1139 1569:aastore         
	// 1140 1570:dup             
	// 1141 1571:bipush          11
	// 1142 1573:aload           10
	// 1143 1575:aastore         
	// 1144 1576:dup             
	// 1145 1577:bipush          12
	// 1146 1579:iconst_5        
	// 1147 1580:newarray        char[]
	// 1148 1582:dup             
	// 1149 1583:iconst_0        
	// 1150 1584:ldc2            #324 <Int 1581>
	// 1151 1587:castore         
	// 1152 1588:dup             
	// 1153 1589:iconst_1        
	// 1154 1590:ldc2            #325 <Int -351>
	// 1155 1593:castore         
	// 1156 1594:dup             
	// 1157 1595:iconst_2        
	// 1158 1596:ldc2            #326 <Int -350>
	// 1159 1599:castore         
	// 1160 1600:dup             
	// 1161 1601:iconst_3        
	// 1162 1602:ldc2            #327 <Int -349>
	// 1163 1605:castore         
	// 1164 1606:dup             
	// 1165 1607:iconst_4        
	// 1166 1608:ldc2            #328 <Int -348>
	// 1167 1611:castore         
	// 1168 1612:aastore         
	// 1169 1613:dup             
	// 1170 1614:bipush          13
	// 1171 1616:aload           11
	// 1172 1618:aastore         
	// 1173 1619:dup             
	// 1174 1620:bipush          14
	// 1175 1622:iconst_3        
	// 1176 1623:newarray        char[]
	// 1177 1625:dup             
	// 1178 1626:iconst_0        
	// 1179 1627:ldc2            #329 <Int 1583>
	// 1180 1630:castore         
	// 1181 1631:dup             
	// 1182 1632:iconst_1        
	// 1183 1633:ldc2            #330 <Int -343>
	// 1184 1636:castore         
	// 1185 1637:dup             
	// 1186 1638:iconst_2        
	// 1187 1639:ldc2            #331 <Int -342>
	// 1188 1642:castore         
	// 1189 1643:aastore         
	// 1190 1644:dup             
	// 1191 1645:bipush          15
	// 1192 1647:aload           12
	// 1193 1649:aastore         
	// 1194 1650:dup             
	// 1195 1651:bipush          16
	// 1196 1653:aload           13
	// 1197 1655:aastore         
	// 1198 1656:dup             
	// 1199 1657:bipush          17
	// 1200 1659:aload           14
	// 1201 1661:aastore         
	// 1202 1662:dup             
	// 1203 1663:bipush          18
	// 1204 1665:iconst_5        
	// 1205 1666:newarray        char[]
	// 1206 1668:dup             
	// 1207 1669:iconst_0        
	// 1208 1670:ldc2            #332 <Int 1587>
	// 1209 1673:castore         
	// 1210 1674:dup             
	// 1211 1675:iconst_1        
	// 1212 1676:ldc2            #333 <Int -335>
	// 1213 1679:castore         
	// 1214 1680:dup             
	// 1215 1681:iconst_2        
	// 1216 1682:ldc2            #334 <Int -334>
	// 1217 1685:castore         
	// 1218 1686:dup             
	// 1219 1687:iconst_3        
	// 1220 1688:ldc2            #335 <Int -333>
	// 1221 1691:castore         
	// 1222 1692:dup             
	// 1223 1693:iconst_4        
	// 1224 1694:ldc2            #336 <Int -332>
	// 1225 1697:castore         
	// 1226 1698:aastore         
	// 1227 1699:dup             
	// 1228 1700:bipush          19
	// 1229 1702:aload           15
	// 1230 1704:aastore         
	// 1231 1705:dup             
	// 1232 1706:bipush          20
	// 1233 1708:iconst_5        
	// 1234 1709:newarray        char[]
	// 1235 1711:dup             
	// 1236 1712:iconst_0        
	// 1237 1713:ldc2            #337 <Int 1589>
	// 1238 1716:castore         
	// 1239 1717:dup             
	// 1240 1718:iconst_1        
	// 1241 1719:ldc2            #338 <Int -327>
	// 1242 1722:castore         
	// 1243 1723:dup             
	// 1244 1724:iconst_2        
	// 1245 1725:ldc2            #339 <Int -326>
	// 1246 1728:castore         
	// 1247 1729:dup             
	// 1248 1730:iconst_3        
	// 1249 1731:ldc2            #340 <Int -325>
	// 1250 1734:castore         
	// 1251 1735:dup             
	// 1252 1736:iconst_4        
	// 1253 1737:ldc2            #341 <Int -324>
	// 1254 1740:castore         
	// 1255 1741:aastore         
	// 1256 1742:dup             
	// 1257 1743:bipush          21
	// 1258 1745:aload           16
	// 1259 1747:aastore         
	// 1260 1748:dup             
	// 1261 1749:bipush          22
	// 1262 1751:aload           17
	// 1263 1753:aastore         
	// 1264 1754:dup             
	// 1265 1755:bipush          23
	// 1266 1757:iconst_5        
	// 1267 1758:newarray        char[]
	// 1268 1760:dup             
	// 1269 1761:iconst_0        
	// 1270 1762:ldc2            #342 <Int 1592>
	// 1271 1765:castore         
	// 1272 1766:dup             
	// 1273 1767:iconst_1        
	// 1274 1768:ldc2            #343 <Int -315>
	// 1275 1771:castore         
	// 1276 1772:dup             
	// 1277 1773:iconst_2        
	// 1278 1774:ldc2            #344 <Int -314>
	// 1279 1777:castore         
	// 1280 1778:dup             
	// 1281 1779:iconst_3        
	// 1282 1780:ldc2            #345 <Int -313>
	// 1283 1783:castore         
	// 1284 1784:dup             
	// 1285 1785:iconst_4        
	// 1286 1786:ldc2            #346 <Int -312>
	// 1287 1789:castore         
	// 1288 1790:aastore         
	// 1289 1791:dup             
	// 1290 1792:bipush          24
	// 1291 1794:aload           18
	// 1292 1796:aastore         
	// 1293 1797:dup             
	// 1294 1798:bipush          25
	// 1295 1800:aload           19
	// 1296 1802:aastore         
	// 1297 1803:dup             
	// 1298 1804:bipush          26
	// 1299 1806:aload           20
	// 1300 1808:aastore         
	// 1301 1809:dup             
	// 1302 1810:bipush          27
	// 1303 1812:iconst_5        
	// 1304 1813:newarray        char[]
	// 1305 1815:dup             
	// 1306 1816:iconst_0        
	// 1307 1817:ldc2            #347 <Int 1601>
	// 1308 1820:castore         
	// 1309 1821:dup             
	// 1310 1822:iconst_1        
	// 1311 1823:ldc2            #348 <Int -303>
	// 1312 1826:castore         
	// 1313 1827:dup             
	// 1314 1828:iconst_2        
	// 1315 1829:ldc2            #349 <Int -302>
	// 1316 1832:castore         
	// 1317 1833:dup             
	// 1318 1834:iconst_3        
	// 1319 1835:ldc2            #350 <Int -301>
	// 1320 1838:castore         
	// 1321 1839:dup             
	// 1322 1840:iconst_4        
	// 1323 1841:ldc2            #351 <Int -300>
	// 1324 1844:castore         
	// 1325 1845:aastore         
	// 1326 1846:dup             
	// 1327 1847:bipush          28
	// 1328 1849:aload           21
	// 1329 1851:aastore         
	// 1330 1852:dup             
	// 1331 1853:bipush          29
	// 1332 1855:aload           22
	// 1333 1857:aastore         
	// 1334 1858:dup             
	// 1335 1859:bipush          30
	// 1336 1861:aload           23
	// 1337 1863:aastore         
	// 1338 1864:dup             
	// 1339 1865:bipush          31
	// 1340 1867:aload           24
	// 1341 1869:aastore         
	// 1342 1870:dup             
	// 1343 1871:bipush          32
	// 1344 1873:iconst_5        
	// 1345 1874:newarray        char[]
	// 1346 1876:dup             
	// 1347 1877:iconst_0        
	// 1348 1878:ldc2            #352 <Int 1606>
	// 1349 1881:castore         
	// 1350 1882:dup             
	// 1351 1883:iconst_1        
	// 1352 1884:ldc2            #353 <Int -283>
	// 1353 1887:castore         
	// 1354 1888:dup             
	// 1355 1889:iconst_2        
	// 1356 1890:ldc2            #354 <Int -282>
	// 1357 1893:castore         
	// 1358 1894:dup             
	// 1359 1895:iconst_3        
	// 1360 1896:ldc2            #355 <Int -281>
	// 1361 1899:castore         
	// 1362 1900:dup             
	// 1363 1901:iconst_4        
	// 1364 1902:ldc2            #356 <Int -280>
	// 1365 1905:castore         
	// 1366 1906:aastore         
	// 1367 1907:dup             
	// 1368 1908:bipush          33
	// 1369 1910:aload           25
	// 1370 1912:aastore         
	// 1371 1913:dup             
	// 1372 1914:bipush          34
	// 1373 1916:iconst_3        
	// 1374 1917:newarray        char[]
	// 1375 1919:dup             
	// 1376 1920:iconst_0        
	// 1377 1921:ldc1            #70  <Int 1608>
	// 1378 1923:castore         
	// 1379 1924:dup             
	// 1380 1925:iconst_1        
	// 1381 1926:ldc2            #357 <Int -275>
	// 1382 1929:castore         
	// 1383 1930:dup             
	// 1384 1931:iconst_2        
	// 1385 1932:ldc2            #358 <Int -274>
	// 1386 1935:castore         
	// 1387 1936:aastore         
	// 1388 1937:dup             
	// 1389 1938:bipush          35
	// 1390 1940:aload           26
	// 1391 1942:aastore         
	// 1392 1943:dup             
	// 1393 1944:bipush          36
	// 1394 1946:aload           27
	// 1395 1948:aastore         
	// 1396 1949:dup             
	// 1397 1950:bipush          37
	// 1398 1952:aload           28
	// 1399 1954:aastore         
	// 1400 1955:dup             
	// 1401 1956:bipush          38
	// 1402 1958:iconst_5        
	// 1403 1959:newarray        char[]
	// 1404 1961:dup             
	// 1405 1962:iconst_0        
	// 1406 1963:ldc2            #359 <Int 1657>
	// 1407 1966:castore         
	// 1408 1967:dup             
	// 1409 1968:iconst_1        
	// 1410 1969:ldc2            #360 <Int -1178>
	// 1411 1972:castore         
	// 1412 1973:dup             
	// 1413 1974:iconst_2        
	// 1414 1975:ldc2            #361 <Int -1177>
	// 1415 1978:castore         
	// 1416 1979:dup             
	// 1417 1980:iconst_3        
	// 1418 1981:ldc2            #362 <Int -1176>
	// 1419 1984:castore         
	// 1420 1985:dup             
	// 1421 1986:iconst_4        
	// 1422 1987:ldc2            #363 <Int -1175>
	// 1423 1990:castore         
	// 1424 1991:aastore         
	// 1425 1992:dup             
	// 1426 1993:bipush          39
	// 1427 1995:aload           29
	// 1428 1997:aastore         
	// 1429 1998:dup             
	// 1430 1999:bipush          40
	// 1431 2001:aload           30
	// 1432 2003:aastore         
	// 1433 2004:dup             
	// 1434 2005:bipush          41
	// 1435 2007:aload           31
	// 1436 2009:aastore         
	// 1437 2010:dup             
	// 1438 2011:bipush          42
	// 1439 2013:aload           32
	// 1440 2015:aastore         
	// 1441 2016:dup             
	// 1442 2017:bipush          43
	// 1443 2019:aload           33
	// 1444 2021:aastore         
	// 1445 2022:dup             
	// 1446 2023:bipush          44
	// 1447 2025:iconst_5        
	// 1448 2026:newarray        char[]
	// 1449 2028:dup             
	// 1450 2029:iconst_0        
	// 1451 2030:ldc2            #364 <Int 1667>
	// 1452 2033:castore         
	// 1453 2034:dup             
	// 1454 2035:iconst_1        
	// 1455 2036:ldc2            #365 <Int -1162>
	// 1456 2039:castore         
	// 1457 2040:dup             
	// 1458 2041:iconst_2        
	// 1459 2042:ldc2            #366 <Int -1161>
	// 1460 2045:castore         
	// 1461 2046:dup             
	// 1462 2047:iconst_3        
	// 1463 2048:ldc2            #367 <Int -1160>
	// 1464 2051:castore         
	// 1465 2052:dup             
	// 1466 2053:iconst_4        
	// 1467 2054:ldc2            #368 <Int -1159>
	// 1468 2057:castore         
	// 1469 2058:aastore         
	// 1470 2059:dup             
	// 1471 2060:bipush          45
	// 1472 2062:aload           34
	// 1473 2064:aastore         
	// 1474 2065:dup             
	// 1475 2066:bipush          46
	// 1476 2068:aload           35
	// 1477 2070:aastore         
	// 1478 2071:dup             
	// 1479 2072:bipush          47
	// 1480 2074:iconst_5        
	// 1481 2075:newarray        char[]
	// 1482 2077:dup             
	// 1483 2078:iconst_0        
	// 1484 2079:ldc2            #369 <Int 1671>
	// 1485 2082:castore         
	// 1486 2083:dup             
	// 1487 2084:iconst_1        
	// 1488 2085:ldc2            #370 <Int -1154>
	// 1489 2088:castore         
	// 1490 2089:dup             
	// 1491 2090:iconst_2        
	// 1492 2091:ldc2            #371 <Int -1153>
	// 1493 2094:castore         
	// 1494 2095:dup             
	// 1495 2096:iconst_3        
	// 1496 2097:ldc2            #372 <Int -1152>
	// 1497 2100:castore         
	// 1498 2101:dup             
	// 1499 2102:iconst_4        
	// 1500 2103:ldc2            #373 <Int -1151>
	// 1501 2106:castore         
	// 1502 2107:aastore         
	// 1503 2108:dup             
	// 1504 2109:bipush          48
	// 1505 2111:aload           36
	// 1506 2113:aastore         
	// 1507 2114:dup             
	// 1508 2115:bipush          49
	// 1509 2117:aload           37
	// 1510 2119:aastore         
	// 1511 2120:dup             
	// 1512 2121:bipush          50
	// 1513 2123:aload           38
	// 1514 2125:aastore         
	// 1515 2126:dup             
	// 1516 2127:bipush          51
	// 1517 2129:aload           39
	// 1518 2131:aastore         
	// 1519 2132:dup             
	// 1520 2133:bipush          52
	// 1521 2135:aload           40
	// 1522 2137:aastore         
	// 1523 2138:dup             
	// 1524 2139:bipush          53
	// 1525 2141:aload           41
	// 1526 2143:aastore         
	// 1527 2144:dup             
	// 1528 2145:bipush          54
	// 1529 2147:iconst_5        
	// 1530 2148:newarray        char[]
	// 1531 2150:dup             
	// 1532 2151:iconst_0        
	// 1533 2152:ldc2            #374 <Int 1700>
	// 1534 2155:castore         
	// 1535 2156:dup             
	// 1536 2157:iconst_1        
	// 1537 2158:ldc2            #375 <Int -1174>
	// 1538 2161:castore         
	// 1539 2162:dup             
	// 1540 2163:iconst_2        
	// 1541 2164:ldc2            #376 <Int -1173>
	// 1542 2167:castore         
	// 1543 2168:dup             
	// 1544 2169:iconst_3        
	// 1545 2170:ldc2            #377 <Int -1172>
	// 1546 2173:castore         
	// 1547 2174:dup             
	// 1548 2175:iconst_4        
	// 1549 2176:ldc2            #378 <Int -1171>
	// 1550 2179:castore         
	// 1551 2180:aastore         
	// 1552 2181:dup             
	// 1553 2182:bipush          55
	// 1554 2184:iconst_5        
	// 1555 2185:newarray        char[]
	// 1556 2187:dup             
	// 1557 2188:iconst_0        
	// 1558 2189:ldc2            #379 <Int 1702>
	// 1559 2192:castore         
	// 1560 2193:dup             
	// 1561 2194:iconst_1        
	// 1562 2195:ldc2            #380 <Int -1170>
	// 1563 2198:castore         
	// 1564 2199:dup             
	// 1565 2200:iconst_2        
	// 1566 2201:ldc2            #381 <Int -1169>
	// 1567 2204:castore         
	// 1568 2205:dup             
	// 1569 2206:iconst_3        
	// 1570 2207:ldc2            #382 <Int -1168>
	// 1571 2210:castore         
	// 1572 2211:dup             
	// 1573 2212:iconst_4        
	// 1574 2213:ldc2            #383 <Int -1167>
	// 1575 2216:castore         
	// 1576 2217:aastore         
	// 1577 2218:dup             
	// 1578 2219:bipush          56
	// 1579 2221:aload           42
	// 1580 2223:aastore         
	// 1581 2224:dup             
	// 1582 2225:bipush          57
	// 1583 2227:aload           43
	// 1584 2229:aastore         
	// 1585 2230:dup             
	// 1586 2231:bipush          58
	// 1587 2233:iconst_5        
	// 1588 2234:newarray        char[]
	// 1589 2236:dup             
	// 1590 2237:iconst_0        
	// 1591 2238:ldc2            #384 <Int 1711>
	// 1592 2241:castore         
	// 1593 2242:dup             
	// 1594 2243:iconst_1        
	// 1595 2244:ldc2            #385 <Int -1134>
	// 1596 2247:castore         
	// 1597 2248:dup             
	// 1598 2249:iconst_2        
	// 1599 2250:ldc2            #386 <Int -1133>
	// 1600 2253:castore         
	// 1601 2254:dup             
	// 1602 2255:iconst_3        
	// 1603 2256:ldc2            #387 <Int -1132>
	// 1604 2259:castore         
	// 1605 2260:dup             
	// 1606 2261:iconst_4        
	// 1607 2262:ldc2            #388 <Int -1131>
	// 1608 2265:castore         
	// 1609 2266:aastore         
	// 1610 2267:dup             
	// 1611 2268:bipush          59
	// 1612 2270:iconst_5        
	// 1613 2271:newarray        char[]
	// 1614 2273:dup             
	// 1615 2274:iconst_0        
	// 1616 2275:ldc2            #389 <Int 1713>
	// 1617 2278:castore         
	// 1618 2279:dup             
	// 1619 2280:iconst_1        
	// 1620 2281:ldc2            #390 <Int -1126>
	// 1621 2284:castore         
	// 1622 2285:dup             
	// 1623 2286:iconst_2        
	// 1624 2287:ldc2            #391 <Int -1125>
	// 1625 2290:castore         
	// 1626 2291:dup             
	// 1627 2292:iconst_3        
	// 1628 2293:ldc2            #392 <Int -1124>
	// 1629 2296:castore         
	// 1630 2297:dup             
	// 1631 2298:iconst_4        
	// 1632 2299:ldc2            #393 <Int -1123>
	// 1633 2302:castore         
	// 1634 2303:aastore         
	// 1635 2304:dup             
	// 1636 2305:bipush          60
	// 1637 2307:iconst_5        
	// 1638 2308:newarray        char[]
	// 1639 2310:dup             
	// 1640 2311:iconst_0        
	// 1641 2312:ldc2            #394 <Int 1715>
	// 1642 2315:castore         
	// 1643 2316:dup             
	// 1644 2317:iconst_1        
	// 1645 2318:ldc2            #395 <Int -1130>
	// 1646 2321:castore         
	// 1647 2322:dup             
	// 1648 2323:iconst_2        
	// 1649 2324:ldc2            #396 <Int -1129>
	// 1650 2327:castore         
	// 1651 2328:dup             
	// 1652 2329:iconst_3        
	// 1653 2330:ldc2            #397 <Int -1128>
	// 1654 2333:castore         
	// 1655 2334:dup             
	// 1656 2335:iconst_4        
	// 1657 2336:ldc2            #398 <Int -1127>
	// 1658 2339:castore         
	// 1659 2340:aastore         
	// 1660 2341:dup             
	// 1661 2342:bipush          61
	// 1662 2344:aload           44
	// 1663 2346:aastore         
	// 1664 2347:dup             
	// 1665 2348:bipush          62
	// 1666 2350:aload           45
	// 1667 2352:aastore         
	// 1668 2353:dup             
	// 1669 2354:bipush          63
	// 1670 2356:aload           46
	// 1671 2358:aastore         
	// 1672 2359:dup             
	// 1673 2360:bipush          64
	// 1674 2362:aload           47
	// 1675 2364:aastore         
	// 1676 2365:dup             
	// 1677 2366:bipush          65
	// 1678 2368:aload           48
	// 1679 2370:aastore         
	// 1680 2371:dup             
	// 1681 2372:bipush          66
	// 1682 2374:aload           49
	// 1683 2376:aastore         
	// 1684 2377:dup             
	// 1685 2378:bipush          67
	// 1686 2380:iconst_3        
	// 1687 2381:newarray        char[]
	// 1688 2383:dup             
	// 1689 2384:iconst_0        
	// 1690 2385:ldc2            #399 <Int 1734>
	// 1691 2388:castore         
	// 1692 2389:dup             
	// 1693 2390:iconst_1        
	// 1694 2391:ldc2            #400 <Int -1063>
	// 1695 2394:castore         
	// 1696 2395:dup             
	// 1697 2396:iconst_2        
	// 1698 2397:ldc2            #401 <Int -1062>
	// 1699 2400:castore         
	// 1700 2401:aastore         
	// 1701 2402:dup             
	// 1702 2403:bipush          68
	// 1703 2405:iconst_3        
	// 1704 2406:newarray        char[]
	// 1705 2408:dup             
	// 1706 2409:iconst_0        
	// 1707 2410:ldc2            #402 <Int 1735>
	// 1708 2413:castore         
	// 1709 2414:dup             
	// 1710 2415:iconst_1        
	// 1711 2416:ldc2            #403 <Int -1065>
	// 1712 2419:castore         
	// 1713 2420:dup             
	// 1714 2421:iconst_2        
	// 1715 2422:ldc2            #404 <Int -1064>
	// 1716 2425:castore         
	// 1717 2426:aastore         
	// 1718 2427:dup             
	// 1719 2428:bipush          69
	// 1720 2430:aload           50
	// 1721 2432:aastore         
	// 1722 2433:dup             
	// 1723 2434:bipush          70
	// 1724 2436:aload           51
	// 1725 2438:aastore         
	// 1726 2439:dup             
	// 1727 2440:bipush          71
	// 1728 2442:aload           52
	// 1729 2444:aastore         
	// 1730 2445:dup             
	// 1731 2446:bipush          72
	// 1732 2448:iconst_5        
	// 1733 2449:newarray        char[]
	// 1734 2451:dup             
	// 1735 2452:iconst_0        
	// 1736 2453:ldc1            #42  <Int 1740>
	// 1737 2455:castore         
	// 1738 2456:dup             
	// 1739 2457:iconst_1        
	// 1740 2458:ldc2            #405 <Int -1028>
	// 1741 2461:castore         
	// 1742 2462:dup             
	// 1743 2463:iconst_2        
	// 1744 2464:ldc2            #406 <Int -1027>
	// 1745 2467:castore         
	// 1746 2468:dup             
	// 1747 2469:iconst_3        
	// 1748 2470:ldc2            #407 <Int -1026>
	// 1749 2473:castore         
	// 1750 2474:dup             
	// 1751 2475:iconst_4        
	// 1752 2476:ldc2            #408 <Int -1025>
	// 1753 2479:castore         
	// 1754 2480:aastore         
	// 1755 2481:dup             
	// 1756 2482:bipush          73
	// 1757 2484:aload           53
	// 1758 2486:aastore         
	// 1759 2487:dup             
	// 1760 2488:bipush          74
	// 1761 2490:aload           54
	// 1762 2492:aastore         
	// 1763 2493:dup             
	// 1764 2494:bipush          75
	// 1765 2496:iconst_3        
	// 1766 2497:newarray        char[]
	// 1767 2499:dup             
	// 1768 2500:iconst_0        
	// 1769 2501:ldc2            #409 <Int 1747>
	// 1770 2504:castore         
	// 1771 2505:dup             
	// 1772 2506:iconst_1        
	// 1773 2507:ldc2            #410 <Int -1104>
	// 1774 2510:castore         
	// 1775 2511:dup             
	// 1776 2512:iconst_2        
	// 1777 2513:ldc2            #411 <Int -1103>
	// 1778 2516:castore         
	// 1779 2517:aastore         
	// 1780 2518:putstatic       #413 <Field char[][] chartable>
		obj = ((Object) (chartable));
	// 1781 2521:getstatic       #413 <Field char[][] chartable>
	// 1782 2524:astore_2        
		j = obj.length;
	// 1783 2525:aload_2         
	// 1784 2526:arraylength     
	// 1785 2527:istore_1        
		i = 0;
	// 1786 2528:iconst_0        
	// 1787 2529:istore_0        
_L6:
		char ac1[];
		if(i >= j)
			break; /* Loop/switch isn't completed */
	// 1788 2530:iload_0         
	// 1789 2531:iload_1         
	// 1790 2532:icmpge          2703
		ac1 = obj[i];
	// 1791 2535:aload_2         
	// 1792 2536:iload_0         
	// 1793 2537:aaload          
	// 1794 2538:astore_3        
		maptable.put(((Object) (Character.valueOf(ac1[0]))), ((Object) (ac1)));
	// 1795 2539:getstatic       #103 <Field HashMap maptable>
	// 1796 2542:aload_3         
	// 1797 2543:iconst_0        
	// 1798 2544:caload          
	// 1799 2545:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1800 2548:aload_3         
	// 1801 2549:invokevirtual   #423 <Method Object HashMap.put(Object, Object)>
	// 1802 2552:pop             
		ac1.length;
	// 1803 2553:aload_3         
	// 1804 2554:arraylength     
		JVM INSTR tableswitch 3 5: default 2580
	//	               3 2662
	//	               4 2580
	//	               5 2643;
	// 1805 2555:tableswitch     3 5: default 2580
	//	               3 2662
	//	               4 2580
	//	               5 2643
		   goto _L1 _L2 _L1 _L3
_L1:
		if(ac1[0] == '\u0637' || ac1[0] == '\u0638')
	//*1806 2580:aload_3         
	//*1807 2581:iconst_0        
	//*1808 2582:iaload          
	//*1809 2583:sipush          1591
	//*1810 2586:icmpeq          2598
	//*1811 2589:aload_3         
	//*1812 2590:iconst_0        
	//*1813 2591:iaload          
	//*1814 2592:sipush          1592
	//*1815 2595:icmpne          2636
		{
			reverseLigatureMapTable.put(((Object) (Character.valueOf(ac1[4]))), ((Object) (Character.valueOf(ac1[1]))));
	// 1816 2598:getstatic       #105 <Field HashMap reverseLigatureMapTable>
	// 1817 2601:aload_3         
	// 1818 2602:iconst_4        
	// 1819 2603:caload          
	// 1820 2604:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1821 2607:aload_3         
	// 1822 2608:iconst_1        
	// 1823 2609:caload          
	// 1824 2610:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1825 2613:invokevirtual   #423 <Method Object HashMap.put(Object, Object)>
	// 1826 2616:pop             
			reverseLigatureMapTable.put(((Object) (Character.valueOf(ac1[3]))), ((Object) (Character.valueOf(ac1[1]))));
	// 1827 2617:getstatic       #105 <Field HashMap reverseLigatureMapTable>
	// 1828 2620:aload_3         
	// 1829 2621:iconst_3        
	// 1830 2622:caload          
	// 1831 2623:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1832 2626:aload_3         
	// 1833 2627:iconst_1        
	// 1834 2628:caload          
	// 1835 2629:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1836 2632:invokevirtual   #423 <Method Object HashMap.put(Object, Object)>
	// 1837 2635:pop             
		}
		i++;
	// 1838 2636:iload_0         
	// 1839 2637:iconst_1        
	// 1840 2638:iadd            
	// 1841 2639:istore_0        
		break; /* Loop/switch isn't completed */
	// 1842 2640:goto            2530
_L3:
		reverseLigatureMapTable.put(((Object) (Character.valueOf(ac1[4]))), ((Object) (Character.valueOf(ac1[3]))));
	// 1843 2643:getstatic       #105 <Field HashMap reverseLigatureMapTable>
	// 1844 2646:aload_3         
	// 1845 2647:iconst_4        
	// 1846 2648:caload          
	// 1847 2649:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1848 2652:aload_3         
	// 1849 2653:iconst_3        
	// 1850 2654:caload          
	// 1851 2655:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1852 2658:invokevirtual   #423 <Method Object HashMap.put(Object, Object)>
	// 1853 2661:pop             
_L2:
		reverseLigatureMapTable.put(((Object) (Character.valueOf(ac1[2]))), ((Object) (Character.valueOf(ac1[1]))));
	// 1854 2662:getstatic       #105 <Field HashMap reverseLigatureMapTable>
	// 1855 2665:aload_3         
	// 1856 2666:iconst_2        
	// 1857 2667:caload          
	// 1858 2668:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1859 2671:aload_3         
	// 1860 2672:iconst_1        
	// 1861 2673:caload          
	// 1862 2674:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1863 2677:invokevirtual   #423 <Method Object HashMap.put(Object, Object)>
	// 1864 2680:pop             
		reverseLigatureMapTable.put(((Object) (Character.valueOf(ac1[1]))), ((Object) (Character.valueOf(ac1[0]))));
	// 1865 2681:getstatic       #105 <Field HashMap reverseLigatureMapTable>
	// 1866 2684:aload_3         
	// 1867 2685:iconst_1        
	// 1868 2686:caload          
	// 1869 2687:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1870 2690:aload_3         
	// 1871 2691:iconst_0        
	// 1872 2692:caload          
	// 1873 2693:invokestatic    #419 <Method Character Character.valueOf(char)>
	// 1874 2696:invokevirtual   #423 <Method Object HashMap.put(Object, Object)>
	// 1875 2699:pop             
		if(true) goto _L1; else goto _L4
	// 1876 2700:goto            2580
_L4:
		if(true) goto _L6; else goto _L5
_L5:
	// 1877 2703:return          
	}
}
