// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec;

import com.itextpdf.text.*;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;
import java.io.*;
import java.net.URL;
import java.util.HashMap;

public class BmpImage
{

	BmpImage(InputStream inputstream, boolean flag, int i)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void Object()>
		properties = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #78  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #79  <Method void HashMap()>
	//    6   12:putfield        #81  <Field HashMap properties>
		bitmapFileSize = i;
	//    7   15:aload_0         
	//    8   16:iload_3         
	//    9   17:i2l             
	//   10   18:putfield        #83  <Field long bitmapFileSize>
		bitmapOffset = 0L;
	//   11   21:aload_0         
	//   12   22:lconst_0        
	//   13   23:putfield        #85  <Field long bitmapOffset>
		process(inputstream, flag);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:iload_2         
	//   17   29:invokevirtual   #89  <Method void process(InputStream, boolean)>
	//   18   32:return          
	}

	private byte[] decodeRLE(boolean flag, byte abyte0[])
	{
		int i;
		int j1;
		int l1;
		int i2;
		byte abyte1[];
		abyte1 = new byte[width * height];
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int width>
	//    2    4:aload_0         
	//    3    5:getfield        #99  <Field int height>
	//    4    8:imul            
	//    5    9:newarray        byte[]
	//    6   11:astore          12
		i2 = 0;
	//    7   13:iconst_0        
	//    8   14:istore          10
		i = 0;
	//    9   16:iconst_0        
	//   10   17:istore_3        
		l1 = 0;
	//   11   18:iconst_0        
	//   12   19:istore          9
		j1 = 0;
	//   13   21:iconst_0        
	//   14   22:istore          7
_L12:
		int k = j1;
	//   15   24:iload           7
	//   16   26:istore          5
		if(l1 >= height) goto _L2; else goto _L1
	//   17   28:iload           9
	//   18   30:aload_0         
	//   19   31:getfield        #99  <Field int height>
	//   20   34:icmpge          528
_L1:
		int j;
		int i1;
		int k1;
		k = j1;
	//   21   37:iload           7
	//   22   39:istore          5
		int j2;
		try
		{
			j = abyte0.length;
	//   23   41:aload_2         
	//   24   42:arraylength     
	//   25   43:istore          4
		}
	//*  26   45:iload           7
	//*  27   47:iload           4
	//*  28   49:icmpge          528
	//*  29   52:iload           7
	//*  30   54:iconst_1        
	//*  31   55:iadd            
	//*  32   56:istore          8
	//*  33   58:aload_2         
	//*  34   59:iload           7
	//*  35   61:baload          
	//*  36   62:sipush          255
	//*  37   65:iand            
	//*  38   66:istore          6
	//*  39   68:iload           6
	//*  40   70:ifeq            94
	//*  41   73:aload_2         
	//*  42   74:iload           8
	//*  43   76:baload          
	//*  44   77:sipush          255
	//*  45   80:iand            
	//*  46   81:istore          7
	//*  47   83:iload_1         
	//*  48   84:ifeq            592
	//*  49   87:iload           6
	//*  50   89:istore          4
	//*  51   91:goto            531
	//*  52   94:iload           8
	//*  53   96:iconst_1        
	//*  54   97:iadd            
	//*  55   98:istore          4
	//*  56  100:aload_2         
	//*  57  101:iload           8
	//*  58  103:baload          
	//*  59  104:sipush          255
	//*  60  107:iand            
	//*  61  108:istore          11
	//*  62  110:iload           11
	//*  63  112:iconst_1        
	//*  64  113:icmpne          119
	//*  65  116:aload           12
	//*  66  118:areturn         
	//*  67  119:iload           11
	//*  68  121:tableswitch     0 2: default 148
	//	               0 193
	//	               1 148
	//	               2 235
	//*  69  148:iload_1         
	//*  70  149:ifeq            363
	//*  71  152:iload           11
	//*  72  154:istore          5
	//*  73  156:iload           5
	//*  74  158:ifeq            302
	//*  75  161:aload           12
	//*  76  163:iload_3         
	//*  77  164:aload_2         
	//*  78  165:iload           4
	//*  79  167:baload          
	//*  80  168:sipush          255
	//*  81  171:iand            
	//*  82  172:int2byte        
	//*  83  173:bastore         
	//*  84  174:iload           5
	//*  85  176:iconst_1        
	//*  86  177:isub            
	//*  87  178:istore          5
	//*  88  180:iload_3         
	//*  89  181:iconst_1        
	//*  90  182:iadd            
	//*  91  183:istore_3        
	//*  92  184:iload           4
	//*  93  186:iconst_1        
	//*  94  187:iadd            
	//*  95  188:istore          4
	//*  96  190:goto            156
	//*  97  193:iconst_0        
	//*  98  194:istore          6
	//*  99  196:iload           9
	//* 100  198:iconst_1        
	//* 101  199:iadd            
	//* 102  200:istore          7
	//* 103  202:iload           4
	//* 104  204:istore          5
	//* 105  206:aload_0         
	//* 106  207:getfield        #97  <Field int width>
	//* 107  210:istore_3        
	//* 108  211:iload           7
	//* 109  213:iload_3         
	//* 110  214:imul            
	//* 111  215:istore          5
	//* 112  217:iload           4
	//* 113  219:istore_3        
	//* 114  220:iload           5
	//* 115  222:istore          4
	//* 116  224:iload           6
	//* 117  226:istore          5
	//* 118  228:iload           7
	//* 119  230:istore          6
	//* 120  232:goto            575
	//* 121  235:iload           4
	//* 122  237:iconst_1        
	//* 123  238:iadd            
	//* 124  239:istore          5
	//* 125  241:iload           10
	//* 126  243:aload_2         
	//* 127  244:iload           4
	//* 128  246:baload          
	//* 129  247:sipush          255
	//* 130  250:iand            
	//* 131  251:iadd            
	//* 132  252:istore          6
	//* 133  254:iload           5
	//* 134  256:iconst_1        
	//* 135  257:iadd            
	//* 136  258:istore_3        
	//* 137  259:iload           9
	//* 138  261:aload_2         
	//* 139  262:iload           5
	//* 140  264:baload          
	//* 141  265:sipush          255
	//* 142  268:iand            
	//* 143  269:iadd            
	//* 144  270:istore          7
	//* 145  272:iload_3         
	//* 146  273:istore          5
	//* 147  275:aload_0         
	//* 148  276:getfield        #97  <Field int width>
	//* 149  279:istore          4
	//* 150  281:iload           4
	//* 151  283:iload           7
	//* 152  285:imul            
	//* 153  286:iload           6
	//* 154  288:iadd            
	//* 155  289:istore          4
	//* 156  291:iload           6
	//* 157  293:istore          5
	//* 158  295:iload           7
	//* 159  297:istore          6
	//* 160  299:goto            575
	//* 161  302:iload_3         
	//* 162  303:istore          7
	//* 163  305:iload           4
	//* 164  307:istore          8
	//* 165  309:iload           10
	//* 166  311:iload           11
	//* 167  313:iadd            
	//* 168  314:istore          10
	//* 169  316:iload_1         
	//* 170  317:ifeq            454
	//* 171  320:iload           8
	//* 172  322:istore_3        
	//* 173  323:iload           7
	//* 174  325:istore          4
	//* 175  327:iload           10
	//* 176  329:istore          5
	//* 177  331:iload           9
	//* 178  333:istore          6
	//* 179  335:iload           11
	//* 180  337:iconst_1        
	//* 181  338:iand            
	//* 182  339:iconst_1        
	//* 183  340:icmpne          575
	//* 184  343:iload           8
	//* 185  345:iconst_1        
	//* 186  346:iadd            
	//* 187  347:istore_3        
	//* 188  348:iload           7
	//* 189  350:istore          4
	//* 190  352:iload           10
	//* 191  354:istore          5
	//* 192  356:iload           9
	//* 193  358:istore          6
	//* 194  360:goto            575
	//* 195  363:iconst_0        
	//* 196  364:istore          6
	//* 197  366:iconst_0        
	//* 198  367:istore          5
	//* 199  369:iload           5
	//* 200  371:iload           11
	//* 201  373:icmpge          512
	//* 202  376:iload           5
	//* 203  378:iconst_1        
	//* 204  379:iand            
	//* 205  380:ifne            509
	//* 206  383:iload           4
	//* 207  385:iconst_1        
	//* 208  386:iadd            
	//* 209  387:istore          6
	//* 210  389:aload_2         
	//* 211  390:iload           4
	//* 212  392:baload          
	//* 213  393:sipush          255
	//* 214  396:iand            
	//* 215  397:istore          7
	//* 216  399:iload           6
	//* 217  401:istore          4
	//* 218  403:iload           7
	//* 219  405:istore          6
	//* 220  407:iload           5
	//* 221  409:iconst_1        
	//* 222  410:iand            
	//* 223  411:iconst_1        
	//* 224  412:icmpne          442
	//* 225  415:iload           6
	//* 226  417:bipush          15
	//* 227  419:iand            
	//* 228  420:istore          7
	//* 229  422:aload           12
	//* 230  424:iload_3         
	//* 231  425:iload           7
	//* 232  427:int2byte        
	//* 233  428:bastore         
	//* 234  429:iload           5
	//* 235  431:iconst_1        
	//* 236  432:iadd            
	//* 237  433:istore          5
	//* 238  435:iload_3         
	//* 239  436:iconst_1        
	//* 240  437:iadd            
	//* 241  438:istore_3        
	//* 242  439:goto            369
	//* 243  442:iload           6
	//* 244  444:iconst_4        
	//* 245  445:iushr           
	//* 246  446:bipush          15
	//* 247  448:iand            
	//* 248  449:istore          7
	//* 249  451:goto            422
	//* 250  454:iload           11
	//* 251  456:iconst_3        
	//* 252  457:iand            
	//* 253  458:iconst_1        
	//* 254  459:icmpeq          485
	//* 255  462:iload           8
	//* 256  464:istore_3        
	//* 257  465:iload           7
	//* 258  467:istore          4
	//* 259  469:iload           10
	//* 260  471:istore          5
	//* 261  473:iload           9
	//* 262  475:istore          6
	//* 263  477:iload           11
	//* 264  479:iconst_3        
	//* 265  480:iand            
	//* 266  481:iconst_2        
	//* 267  482:icmpne          575
	//* 268  485:iload           8
	//* 269  487:iconst_1        
	//* 270  488:iadd            
	//* 271  489:istore_3        
	//* 272  490:iload           7
	//* 273  492:istore          4
	//* 274  494:iload           10
	//* 275  496:istore          5
	//* 276  498:iload           9
	//* 277  500:istore          6
	//* 278  502:goto            575
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 279  505:astore_2        
		{
			return abyte1;
	//  280  506:aload           12
	//  281  508:areturn         
		}
		if(j1 >= j) goto _L2; else goto _L3
		j = k1 + 1;
		j2 = abyte0[k1] & 0xff;
		if(j2 == 1)
			return abyte1;
		j2;
		JVM INSTR tableswitch 0 2: default 148
	//	               0 193
	//	               1 148
	//	               2 235;
		   goto _L4 _L5 _L4 _L6
_L4:
		if(flag)
		{
			for(k = j2; k != 0;)
			{
				abyte1[i] = (byte)(abyte0[j] & 0xff);
				k--;
				i++;
				j++;
			}

			break; /* Loop/switch isn't completed */
		}
		i1 = 0;
		k = 0;
		while(k < j2) 
		{
			if((k & 1) == 0)
			{
				i1 = j + 1;
				j1 = abyte0[j] & 0xff;
				j = i1;
				i1 = j1;
			}
			if((k & 1) == 1)
				j1 = i1 & 0xf;
			else
				j1 = i1 >>> 4 & 0xf;
			abyte1[i] = (byte)j1;
			k++;
			i++;
		}
	//* 282  509:goto            407
		k1 = j;
	//  283  512:iload           4
	//  284  514:istore          8
		j1 = i;
	//  285  516:iload_3         
	//  286  517:istore          7
		  goto _L7
_L5:
		i1 = 0;
		j1 = l1 + 1;
		k = j;
		i = width;
		k = j1 * i;
		i = j;
		j = k;
		k = i1;
		i1 = j1;
		  goto _L8
_L6:
		k = j + 1;
		i1 = i2 + (abyte0[j] & 0xff);
		i = k + 1;
		j1 = l1 + (abyte0[k] & 0xff);
		k = i;
		j = width;
		j = j * j1 + i1;
		k = i1;
		i1 = j1;
		  goto _L8
		j1 = i;
		k1 = j;
_L9:
		i2 += j2;
		if(flag)
		{
			i = k1;
			j = j1;
			k = i2;
			i1 = l1;
			if((j2 & 1) == 1)
			{
				i = k1 + 1;
				j = j1;
				k = i2;
				i1 = l1;
			}
			break; /* Loop/switch isn't completed */
		}
		if((j2 & 3) != 1)
		{
			i = k1;
			j = j1;
			k = i2;
			i1 = l1;
			if((j2 & 3) != 2)
				break; /* Loop/switch isn't completed */
		}
		i = k1 + 1;
		j = j1;
		k = i2;
		i1 = l1;
		break; /* Loop/switch isn't completed */
_L7:
		if(true) goto _L9; else goto _L8
	//  287  519:goto            309
	//* 288  522:iload_3         
	//* 289  523:istore          4
	//* 290  525:goto            559
	//* 291  528:aload           12
	//* 292  530:areturn         
	//* 293  531:iload           4
	//* 294  533:ifeq            556
	//* 295  536:aload           12
	//* 296  538:iload_3         
	//* 297  539:iload           7
	//* 298  541:int2byte        
	//* 299  542:bastore         
	//* 300  543:iload           4
	//* 301  545:iconst_1        
	//* 302  546:isub            
	//* 303  547:istore          4
	//* 304  549:iload_3         
	//* 305  550:iconst_1        
	//* 306  551:iadd            
	//* 307  552:istore_3        
	//* 308  553:goto            531
	//* 309  556:iload_3         
	//* 310  557:istore          4
	//* 311  559:iload           10
	//* 312  561:iload           6
	//* 313  563:iadd            
	//* 314  564:istore          5
	//* 315  566:iload           8
	//* 316  568:iconst_1        
	//* 317  569:iadd            
	//* 318  570:istore_3        
	//* 319  571:iload           9
	//* 320  573:istore          6
	//* 321  575:iload_3         
	//* 322  576:istore          7
	//* 323  578:iload           4
	//* 324  580:istore_3        
	//* 325  581:iload           5
	//* 326  583:istore          10
	//* 327  585:iload           6
	//* 328  587:istore          9
	//* 329  589:goto            24
		j = 0;
	//  330  592:iconst_0        
	//  331  593:istore          4
		while(j < i1) 
	//* 332  595:iload           4
	//* 333  597:iload           6
	//* 334  599:icmpge          522
		{
			int l;
			if((j & 1) == 1)
	//* 335  602:iload           4
	//* 336  604:iconst_1        
	//* 337  605:iand            
	//* 338  606:iconst_1        
	//* 339  607:icmpne          637
				l = j1 & 0xf;
	//  340  610:iload           7
	//  341  612:bipush          15
	//  342  614:iand            
	//  343  615:istore          5
			else
	//* 344  617:aload           12
	//* 345  619:iload_3         
	//* 346  620:iload           5
	//* 347  622:int2byte        
	//* 348  623:bastore         
	//* 349  624:iload           4
	//* 350  626:iconst_1        
	//* 351  627:iadd            
	//* 352  628:istore          4
	//* 353  630:iload_3         
	//* 354  631:iconst_1        
	//* 355  632:iadd            
	//* 356  633:istore_3        
	//* 357  634:goto            595
				l = j1 >>> 4 & 0xf;
	//  358  637:iload           7
	//  359  639:iconst_4        
	//  360  640:iushr           
	//  361  641:bipush          15
	//  362  643:iand            
	//  363  644:istore          5
			abyte1[i] = (byte)l;
			j++;
			i++;
		}
		j = i;
		  goto _L10
_L2:
		return abyte1;
_L3:
label0:
		{
			k1 = j1 + 1;
			i1 = abyte0[j1] & 0xff;
			if(i1 == 0)
				break label0;
			j1 = abyte0[k1] & 0xff;
			if(!flag)
				break MISSING_BLOCK_LABEL_592;
		}
		for(j = i1; j != 0;)
		{
			abyte1[i] = (byte)j1;
			j--;
			i++;
		}

		j = i;
_L10:
		k = i2 + i1;
		i = k1 + 1;
		i1 = l1;
_L8:
		j1 = i;
		i = j;
		i2 = k;
		l1 = i1;
		if(true) goto _L12; else goto _L11
_L11:
	//* 364  646:goto            617
	}

	private int findMask(int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j = i;
	//    2    2:iload_1         
	//    3    3:istore_2        
		i = ((int) (flag));
	//    4    4:iload_3         
	//    5    5:istore_1        
		do
		{
			if(i >= 32 || (j & 1) == 1)
	//*   6    6:iload_1         
	//*   7    7:bipush          32
	//*   8    9:icmpge          19
	//*   9   12:iload_2         
	//*  10   13:iconst_1        
	//*  11   14:iand            
	//*  12   15:iconst_1        
	//*  13   16:icmpne          21
				return j;
	//   14   19:iload_2         
	//   15   20:ireturn         
			j >>>= 1;
	//   16   21:iload_2         
	//   17   22:iconst_1        
	//   18   23:iushr           
	//   19   24:istore_2        
			i++;
	//   20   25:iload_1         
	//   21   26:iconst_1        
	//   22   27:iadd            
	//   23   28:istore_1        
		} while(true);
	//   24   29:goto            6
	}

	private int findShift(int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j = i;
	//    2    2:iload_1         
	//    3    3:istore_2        
		i = ((int) (flag));
	//    4    4:iload_3         
	//    5    5:istore_1        
		do
		{
			if(i >= 32 || (j & 1) == 1)
	//*   6    6:iload_1         
	//*   7    7:bipush          32
	//*   8    9:icmpge          19
	//*   9   12:iload_2         
	//*  10   13:iconst_1        
	//*  11   14:iand            
	//*  12   15:iconst_1        
	//*  13   16:icmpne          21
				return i;
	//   14   19:iload_1         
	//   15   20:ireturn         
			j >>>= 1;
	//   16   21:iload_2         
	//   17   22:iconst_1        
	//   18   23:iushr           
	//   19   24:istore_2        
			i++;
	//   20   25:iload_1         
	//   21   26:iconst_1        
	//   22   27:iadd            
	//   23   28:istore_1        
		} while(true);
	//   24   29:goto            6
	}

	private Image getImage()
		throws IOException, BadElementException
	{
		switch(imageType)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field int imageType>
		{
	//*   2    4:tableswitch     0 15: default 84
	//	               0 86
	//	               1 92
	//	               2 98
	//	               3 104
	//	               4 143
	//	               5 149
	//	               6 201
	//	               7 249
	//	               8 288
	//	               9 294
	//	               10 300
	//	               11 306
	//	               12 357
	//	               13 405
	//	               14 411
	//	               15 450
		default:
			return null;
	//    3   84:aconst_null     
	//    4   85:areturn         

		case 0: // '\0'
			return read1Bit(3);
	//    5   86:aload_0         
	//    6   87:iconst_3        
	//    7   88:invokespecial   #112 <Method Image read1Bit(int)>
	//    8   91:areturn         

		case 1: // '\001'
			return read4Bit(3);
	//    9   92:aload_0         
	//   10   93:iconst_3        
	//   11   94:invokespecial   #115 <Method Image read4Bit(int)>
	//   12   97:areturn         

		case 2: // '\002'
			return read8Bit(3);
	//   13   98:aload_0         
	//   14   99:iconst_3        
	//   15  100:invokespecial   #118 <Method Image read8Bit(int)>
	//   16  103:areturn         

		case 3: // '\003'
			byte abyte0[] = new byte[width * height * 3];
	//   17  104:aload_0         
	//   18  105:getfield        #97  <Field int width>
	//   19  108:aload_0         
	//   20  109:getfield        #99  <Field int height>
	//   21  112:imul            
	//   22  113:iconst_3        
	//   23  114:imul            
	//   24  115:newarray        byte[]
	//   25  117:astore_1        
			read24Bit(abyte0);
	//   26  118:aload_0         
	//   27  119:aload_1         
	//   28  120:invokespecial   #122 <Method void read24Bit(byte[])>
			return ((Image) (new ImgRaw(width, height, 3, 8, abyte0)));
	//   29  123:new             #124 <Class ImgRaw>
	//   30  126:dup             
	//   31  127:aload_0         
	//   32  128:getfield        #97  <Field int width>
	//   33  131:aload_0         
	//   34  132:getfield        #99  <Field int height>
	//   35  135:iconst_3        
	//   36  136:bipush          8
	//   37  138:aload_1         
	//   38  139:invokespecial   #127 <Method void ImgRaw(int, int, int, int, byte[])>
	//   39  142:areturn         

		case 4: // '\004'
			return read1Bit(4);
	//   40  143:aload_0         
	//   41  144:iconst_4        
	//   42  145:invokespecial   #112 <Method Image read1Bit(int)>
	//   43  148:areturn         

		case 5: // '\005'
			switch((int)compression)
	//*  44  149:aload_0         
	//*  45  150:getfield        #129 <Field long compression>
	//*  46  153:l2i             
			{
	//*  47  154:tableswitch     0 2: default 180
	//	               0 190
	//	               1 180
	//	               2 196
			case 1: // '\001'
			default:
				throw new RuntimeException("Invalid compression specified for BMP file.");
	//   48  180:new             #95  <Class RuntimeException>
	//   49  183:dup             
	//   50  184:ldc1            #131 <String "Invalid compression specified for BMP file.">
	//   51  186:invokespecial   #134 <Method void RuntimeException(String)>
	//   52  189:athrow          

			case 0: // '\0'
				return read4Bit(4);
	//   53  190:aload_0         
	//   54  191:iconst_4        
	//   55  192:invokespecial   #115 <Method Image read4Bit(int)>
	//   56  195:areturn         

			case 2: // '\002'
				return readRLE4();
	//   57  196:aload_0         
	//   58  197:invokespecial   #137 <Method Image readRLE4()>
	//   59  200:areturn         
			}

		case 6: // '\006'
			switch((int)compression)
	//*  60  201:aload_0         
	//*  61  202:getfield        #129 <Field long compression>
	//*  62  205:l2i             
			{
	//*  63  206:tableswitch     0 1: default 228
	//	               0 238
	//	               1 244
			default:
				throw new RuntimeException("Invalid compression specified for BMP file.");
	//   64  228:new             #95  <Class RuntimeException>
	//   65  231:dup             
	//   66  232:ldc1            #131 <String "Invalid compression specified for BMP file.">
	//   67  234:invokespecial   #134 <Method void RuntimeException(String)>
	//   68  237:athrow          

			case 0: // '\0'
				return read8Bit(4);
	//   69  238:aload_0         
	//   70  239:iconst_4        
	//   71  240:invokespecial   #118 <Method Image read8Bit(int)>
	//   72  243:areturn         

			case 1: // '\001'
				return readRLE8();
	//   73  244:aload_0         
	//   74  245:invokespecial   #140 <Method Image readRLE8()>
	//   75  248:areturn         
			}

		case 7: // '\007'
			byte abyte1[] = new byte[width * height * 3];
	//   76  249:aload_0         
	//   77  250:getfield        #97  <Field int width>
	//   78  253:aload_0         
	//   79  254:getfield        #99  <Field int height>
	//   80  257:imul            
	//   81  258:iconst_3        
	//   82  259:imul            
	//   83  260:newarray        byte[]
	//   84  262:astore_1        
			read24Bit(abyte1);
	//   85  263:aload_0         
	//   86  264:aload_1         
	//   87  265:invokespecial   #122 <Method void read24Bit(byte[])>
			return ((Image) (new ImgRaw(width, height, 3, 8, abyte1)));
	//   88  268:new             #124 <Class ImgRaw>
	//   89  271:dup             
	//   90  272:aload_0         
	//   91  273:getfield        #97  <Field int width>
	//   92  276:aload_0         
	//   93  277:getfield        #99  <Field int height>
	//   94  280:iconst_3        
	//   95  281:bipush          8
	//   96  283:aload_1         
	//   97  284:invokespecial   #127 <Method void ImgRaw(int, int, int, int, byte[])>
	//   98  287:areturn         

		case 8: // '\b'
			return read1632Bit(false);
	//   99  288:aload_0         
	//  100  289:iconst_0        
	//  101  290:invokespecial   #144 <Method Image read1632Bit(boolean)>
	//  102  293:areturn         

		case 9: // '\t'
			return read1632Bit(true);
	//  103  294:aload_0         
	//  104  295:iconst_1        
	//  105  296:invokespecial   #144 <Method Image read1632Bit(boolean)>
	//  106  299:areturn         

		case 10: // '\n'
			return read1Bit(4);
	//  107  300:aload_0         
	//  108  301:iconst_4        
	//  109  302:invokespecial   #112 <Method Image read1Bit(int)>
	//  110  305:areturn         

		case 11: // '\013'
			switch((int)compression)
	//* 111  306:aload_0         
	//* 112  307:getfield        #129 <Field long compression>
	//* 113  310:l2i             
			{
	//* 114  311:tableswitch     0 2: default 336
	//	               0 346
	//	               1 336
	//	               2 352
			case 1: // '\001'
			default:
				throw new RuntimeException("Invalid compression specified for BMP file.");
	//  115  336:new             #95  <Class RuntimeException>
	//  116  339:dup             
	//  117  340:ldc1            #131 <String "Invalid compression specified for BMP file.">
	//  118  342:invokespecial   #134 <Method void RuntimeException(String)>
	//  119  345:athrow          

			case 0: // '\0'
				return read4Bit(4);
	//  120  346:aload_0         
	//  121  347:iconst_4        
	//  122  348:invokespecial   #115 <Method Image read4Bit(int)>
	//  123  351:areturn         

			case 2: // '\002'
				return readRLE4();
	//  124  352:aload_0         
	//  125  353:invokespecial   #137 <Method Image readRLE4()>
	//  126  356:areturn         
			}

		case 12: // '\f'
			switch((int)compression)
	//* 127  357:aload_0         
	//* 128  358:getfield        #129 <Field long compression>
	//* 129  361:l2i             
			{
	//* 130  362:tableswitch     0 1: default 384
	//	               0 394
	//	               1 400
			default:
				throw new RuntimeException("Invalid compression specified for BMP file.");
	//  131  384:new             #95  <Class RuntimeException>
	//  132  387:dup             
	//  133  388:ldc1            #131 <String "Invalid compression specified for BMP file.">
	//  134  390:invokespecial   #134 <Method void RuntimeException(String)>
	//  135  393:athrow          

			case 0: // '\0'
				return read8Bit(4);
	//  136  394:aload_0         
	//  137  395:iconst_4        
	//  138  396:invokespecial   #118 <Method Image read8Bit(int)>
	//  139  399:areturn         

			case 1: // '\001'
				return readRLE8();
	//  140  400:aload_0         
	//  141  401:invokespecial   #140 <Method Image readRLE8()>
	//  142  404:areturn         
			}

		case 13: // '\r'
			return read1632Bit(false);
	//  143  405:aload_0         
	//  144  406:iconst_0        
	//  145  407:invokespecial   #144 <Method Image read1632Bit(boolean)>
	//  146  410:areturn         

		case 14: // '\016'
			byte abyte2[] = new byte[width * height * 3];
	//  147  411:aload_0         
	//  148  412:getfield        #97  <Field int width>
	//  149  415:aload_0         
	//  150  416:getfield        #99  <Field int height>
	//  151  419:imul            
	//  152  420:iconst_3        
	//  153  421:imul            
	//  154  422:newarray        byte[]
	//  155  424:astore_1        
			read24Bit(abyte2);
	//  156  425:aload_0         
	//  157  426:aload_1         
	//  158  427:invokespecial   #122 <Method void read24Bit(byte[])>
			return ((Image) (new ImgRaw(width, height, 3, 8, abyte2)));
	//  159  430:new             #124 <Class ImgRaw>
	//  160  433:dup             
	//  161  434:aload_0         
	//  162  435:getfield        #97  <Field int width>
	//  163  438:aload_0         
	//  164  439:getfield        #99  <Field int height>
	//  165  442:iconst_3        
	//  166  443:bipush          8
	//  167  445:aload_1         
	//  168  446:invokespecial   #127 <Method void ImgRaw(int, int, int, int, byte[])>
	//  169  449:areturn         

		case 15: // '\017'
			return read1632Bit(true);
	//  170  450:aload_0         
	//  171  451:iconst_1        
	//  172  452:invokespecial   #144 <Method Image read1632Bit(boolean)>
	//  173  455:areturn         
		}
	}

	public static Image getImage(InputStream inputstream)
		throws IOException
	{
		return getImage(inputstream, false, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:invokestatic    #148 <Method Image getImage(InputStream, boolean, int)>
	//    4    6:areturn         
	}

	public static Image getImage(InputStream inputstream, boolean flag, int i)
		throws IOException
	{
		inputstream = ((InputStream) (new BmpImage(inputstream, flag, i)));
	//    0    0:new             #2   <Class BmpImage>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #150 <Method void BmpImage(InputStream, boolean, int)>
	//    6   10:astore_0        
		Image image;
		try
		{
			image = ((BmpImage) (inputstream)).getImage();
	//    7   11:aload_0         
	//    8   12:invokespecial   #152 <Method Image getImage()>
	//    9   15:astore_3        
			image.setDpi((int)((double)((BmpImage) (inputstream)).xPelsPerMeter * 0.025399999999999999D + 0.5D), (int)((double)((BmpImage) (inputstream)).yPelsPerMeter * 0.025399999999999999D + 0.5D));
	//   10   16:aload_3         
	//   11   17:aload_0         
	//   12   18:getfield        #154 <Field long xPelsPerMeter>
	//   13   21:l2d             
	//   14   22:ldc2w           #155 <Double 0.025399999999999999D>
	//   15   25:dmul            
	//   16   26:ldc2w           #157 <Double 0.5D>
	//   17   29:dadd            
	//   18   30:d2i             
	//   19   31:aload_0         
	//   20   32:getfield        #160 <Field long yPelsPerMeter>
	//   21   35:l2d             
	//   22   36:ldc2w           #155 <Double 0.025399999999999999D>
	//   23   39:dmul            
	//   24   40:ldc2w           #157 <Double 0.5D>
	//   25   43:dadd            
	//   26   44:d2i             
	//   27   45:invokevirtual   #166 <Method void Image.setDpi(int, int)>
			image.setOriginalType(4);
	//   28   48:aload_3         
	//   29   49:iconst_4        
	//   30   50:invokevirtual   #170 <Method void Image.setOriginalType(int)>
		}
	//*  31   53:aload_3         
	//*  32   54:areturn         
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  33   55:astore_0        
		{
			throw new ExceptionConverter(((Exception) (inputstream)));
	//   34   56:new             #172 <Class ExceptionConverter>
	//   35   59:dup             
	//   36   60:aload_0         
	//   37   61:invokespecial   #175 <Method void ExceptionConverter(Exception)>
	//   38   64:athrow          
		}
		return image;
	}

	public static Image getImage(String s)
		throws IOException
	{
		return getImage(Utilities.toURL(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #182 <Method URL Utilities.toURL(String)>
	//    2    4:invokestatic    #185 <Method Image getImage(URL)>
	//    3    7:areturn         
	}

	public static Image getImage(URL url)
		throws IOException
	{
		InputStream inputstream = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		InputStream inputstream1 = url.openStream();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #191 <Method InputStream URL.openStream()>
	//    4    6:astore_2        
		inputstream = inputstream1;
	//    5    7:aload_2         
	//    6    8:astore_1        
		Image image = getImage(inputstream1);
	//    7    9:aload_2         
	//    8   10:invokestatic    #193 <Method Image getImage(InputStream)>
	//    9   13:astore_3        
		inputstream = inputstream1;
	//   10   14:aload_2         
	//   11   15:astore_1        
		image.setUrl(url);
	//   12   16:aload_3         
	//   13   17:aload_0         
	//   14   18:invokevirtual   #197 <Method void Image.setUrl(URL)>
		if(inputstream1 != null)
	//*  15   21:aload_2         
	//*  16   22:ifnull          29
			inputstream1.close();
	//   17   25:aload_2         
	//   18   26:invokevirtual   #202 <Method void InputStream.close()>
		return image;
	//   19   29:aload_3         
	//   20   30:areturn         
		url;
	//   21   31:astore_0        
		if(inputstream != null)
	//*  22   32:aload_1         
	//*  23   33:ifnull          40
			inputstream.close();
	//   24   36:aload_1         
	//   25   37:invokevirtual   #202 <Method void InputStream.close()>
		throw url;
	//   26   40:aload_0         
	//   27   41:athrow          
	}

	public static Image getImage(byte abyte0[])
		throws IOException
	{
		Image image = getImage(((InputStream) (new ByteArrayInputStream(abyte0))));
	//    0    0:new             #205 <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #207 <Method void ByteArrayInputStream(byte[])>
	//    4    8:invokestatic    #193 <Method Image getImage(InputStream)>
	//    5   11:astore_1        
		image.setOriginalData(abyte0);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #210 <Method void Image.setOriginalData(byte[])>
		return image;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	private byte[] getPalette(int i)
	{
		if(palette != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field byte[] palette>
	//    2    4:ifnonnull       13
_L1:
		byte abyte0[] = null;
	//    3    7:aconst_null     
	//    4    8:astore          7
_L4:
		return abyte0;
	//    5   10:aload           7
	//    6   12:areturn         
_L2:
		byte abyte1[] = new byte[(palette.length / i) * 3];
	//    7   13:aload_0         
	//    8   14:getfield        #214 <Field byte[] palette>
	//    9   17:arraylength     
	//   10   18:iload_1         
	//   11   19:idiv            
	//   12   20:iconst_3        
	//   13   21:imul            
	//   14   22:newarray        byte[]
	//   15   24:astore          8
		int k = palette.length / i;
	//   16   26:aload_0         
	//   17   27:getfield        #214 <Field byte[] palette>
	//   18   30:arraylength     
	//   19   31:iload_1         
	//   20   32:idiv            
	//   21   33:istore_3        
		int j = 0;
	//   22   34:iconst_0        
	//   23   35:istore_2        
		do
		{
			abyte0 = abyte1;
	//   24   36:aload           8
	//   25   38:astore          7
			if(j >= k)
				continue;
	//   26   40:iload_2         
	//   27   41:iload_3         
	//   28   42:icmpge          10
			int l = j * i;
	//   29   45:iload_2         
	//   30   46:iload_1         
	//   31   47:imul            
	//   32   48:istore          4
			int i1 = j * 3;
	//   33   50:iload_2         
	//   34   51:iconst_3        
	//   35   52:imul            
	//   36   53:istore          5
			abyte0 = palette;
	//   37   55:aload_0         
	//   38   56:getfield        #214 <Field byte[] palette>
	//   39   59:astore          7
			int j1 = l + 1;
	//   40   61:iload           4
	//   41   63:iconst_1        
	//   42   64:iadd            
	//   43   65:istore          6
			abyte1[i1 + 2] = abyte0[l];
	//   44   67:aload           8
	//   45   69:iload           5
	//   46   71:iconst_2        
	//   47   72:iadd            
	//   48   73:aload           7
	//   49   75:iload           4
	//   50   77:baload          
	//   51   78:bastore         
			abyte1[i1 + 1] = palette[j1];
	//   52   79:aload           8
	//   53   81:iload           5
	//   54   83:iconst_1        
	//   55   84:iadd            
	//   56   85:aload_0         
	//   57   86:getfield        #214 <Field byte[] palette>
	//   58   89:iload           6
	//   59   91:baload          
	//   60   92:bastore         
			abyte1[i1] = palette[j1 + 1];
	//   61   93:aload           8
	//   62   95:iload           5
	//   63   97:aload_0         
	//   64   98:getfield        #214 <Field byte[] palette>
	//   65  101:iload           6
	//   66  103:iconst_1        
	//   67  104:iadd            
	//   68  105:baload          
	//   69  106:bastore         
			j++;
	//   70  107:iload_2         
	//   71  108:iconst_1        
	//   72  109:iadd            
	//   73  110:istore_2        
		} while(true);
	//   74  111:goto            36
		if(true) goto _L4; else goto _L3
_L3:
	}

	private Image indexedModel(byte abyte0[], int i, int j)
		throws BadElementException
	{
		abyte0 = ((byte []) (new ImgRaw(width, height, 1, i, abyte0)));
	//    0    0:new             #124 <Class ImgRaw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field int width>
	//    4    8:aload_0         
	//    5    9:getfield        #99  <Field int height>
	//    6   12:iconst_1        
	//    7   13:iload_2         
	//    8   14:aload_1         
	//    9   15:invokespecial   #127 <Method void ImgRaw(int, int, int, int, byte[])>
	//   10   18:astore_1        
		PdfArray pdfarray = new PdfArray();
	//   11   19:new             #218 <Class PdfArray>
	//   12   22:dup             
	//   13   23:invokespecial   #219 <Method void PdfArray()>
	//   14   26:astore          4
		pdfarray.add(((com.itextpdf.text.pdf.PdfObject) (PdfName.INDEXED)));
	//   15   28:aload           4
	//   16   30:getstatic       #225 <Field PdfName PdfName.INDEXED>
	//   17   33:invokevirtual   #229 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//   18   36:pop             
		pdfarray.add(((com.itextpdf.text.pdf.PdfObject) (PdfName.DEVICERGB)));
	//   19   37:aload           4
	//   20   39:getstatic       #232 <Field PdfName PdfName.DEVICERGB>
	//   21   42:invokevirtual   #229 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//   22   45:pop             
		byte abyte1[] = getPalette(j);
	//   23   46:aload_0         
	//   24   47:iload_3         
	//   25   48:invokespecial   #234 <Method byte[] getPalette(int)>
	//   26   51:astore          5
		pdfarray.add(((com.itextpdf.text.pdf.PdfObject) (new PdfNumber(abyte1.length / 3 - 1))));
	//   27   53:aload           4
	//   28   55:new             #236 <Class PdfNumber>
	//   29   58:dup             
	//   30   59:aload           5
	//   31   61:arraylength     
	//   32   62:iconst_3        
	//   33   63:idiv            
	//   34   64:iconst_1        
	//   35   65:isub            
	//   36   66:invokespecial   #238 <Method void PdfNumber(int)>
	//   37   69:invokevirtual   #229 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//   38   72:pop             
		pdfarray.add(((com.itextpdf.text.pdf.PdfObject) (new PdfString(abyte1))));
	//   39   73:aload           4
	//   40   75:new             #240 <Class PdfString>
	//   41   78:dup             
	//   42   79:aload           5
	//   43   81:invokespecial   #241 <Method void PdfString(byte[])>
	//   44   84:invokevirtual   #229 <Method boolean PdfArray.add(com.itextpdf.text.pdf.PdfObject)>
	//   45   87:pop             
		PdfDictionary pdfdictionary = new PdfDictionary();
	//   46   88:new             #243 <Class PdfDictionary>
	//   47   91:dup             
	//   48   92:invokespecial   #244 <Method void PdfDictionary()>
	//   49   95:astore          5
		pdfdictionary.put(PdfName.COLORSPACE, ((com.itextpdf.text.pdf.PdfObject) (pdfarray)));
	//   50   97:aload           5
	//   51   99:getstatic       #247 <Field PdfName PdfName.COLORSPACE>
	//   52  102:aload           4
	//   53  104:invokevirtual   #251 <Method void PdfDictionary.put(PdfName, com.itextpdf.text.pdf.PdfObject)>
		((Image) (abyte0)).setAdditional(pdfdictionary);
	//   54  107:aload_1         
	//   55  108:aload           5
	//   56  110:invokevirtual   #255 <Method void Image.setAdditional(PdfDictionary)>
		return ((Image) (abyte0));
	//   57  113:aload_1         
	//   58  114:areturn         
	}

	private Image read1632Bit(boolean flag)
		throws IOException, BadElementException
	{
		int l2 = findMask(redMask);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #257 <Field int redMask>
	//    3    5:invokespecial   #259 <Method int findMask(int)>
	//    4    8:istore          7
		int i3 = findShift(redMask);
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:getfield        #257 <Field int redMask>
	//    8   15:invokespecial   #261 <Method int findShift(int)>
	//    9   18:istore          8
		int j3 = l2 + 1;
	//   10   20:iload           7
	//   11   22:iconst_1        
	//   12   23:iadd            
	//   13   24:istore          9
		int k3 = findMask(greenMask);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #263 <Field int greenMask>
	//   17   31:invokespecial   #259 <Method int findMask(int)>
	//   18   34:istore          10
		int l3 = findShift(greenMask);
	//   19   36:aload_0         
	//   20   37:aload_0         
	//   21   38:getfield        #263 <Field int greenMask>
	//   22   41:invokespecial   #261 <Method int findShift(int)>
	//   23   44:istore          11
		int i4 = k3 + 1;
	//   24   46:iload           10
	//   25   48:iconst_1        
	//   26   49:iadd            
	//   27   50:istore          12
		int j4 = findMask(blueMask);
	//   28   52:aload_0         
	//   29   53:aload_0         
	//   30   54:getfield        #265 <Field int blueMask>
	//   31   57:invokespecial   #259 <Method int findMask(int)>
	//   32   60:istore          13
		int k4 = findShift(blueMask);
	//   33   62:aload_0         
	//   34   63:aload_0         
	//   35   64:getfield        #265 <Field int blueMask>
	//   36   67:invokespecial   #261 <Method int findShift(int)>
	//   37   70:istore          14
		int l4 = j4 + 1;
	//   38   72:iload           13
	//   39   74:iconst_1        
	//   40   75:iadd            
	//   41   76:istore          15
		byte abyte0[] = new byte[width * height * 3];
	//   42   78:aload_0         
	//   43   79:getfield        #97  <Field int width>
	//   44   82:aload_0         
	//   45   83:getfield        #99  <Field int height>
	//   46   86:imul            
	//   47   87:iconst_3        
	//   48   88:imul            
	//   49   89:newarray        byte[]
	//   50   91:astore          17
		int j = 0;
	//   51   93:iconst_0        
	//   52   94:istore_3        
		int i = j;
	//   53   95:iload_3         
	//   54   96:istore_2        
		if(!flag)
	//*  55   97:iload_1         
	//*  56   98:ifne            143
		{
			int i1 = width * 16;
	//   57  101:aload_0         
	//   58  102:getfield        #97  <Field int width>
	//   59  105:bipush          16
	//   60  107:imul            
	//   61  108:istore          4
			i = j;
	//   62  110:iload_3         
	//   63  111:istore_2        
			if(i1 % 32 != 0)
	//*  64  112:iload           4
	//*  65  114:bipush          32
	//*  66  116:irem            
	//*  67  117:ifeq            143
				i = (int)Math.ceil((double)((i1 / 32 + 1) * 32 - i1) / 8D);
	//   68  120:iload           4
	//   69  122:bipush          32
	//   70  124:idiv            
	//   71  125:iconst_1        
	//   72  126:iadd            
	//   73  127:bipush          32
	//   74  129:imul            
	//   75  130:iload           4
	//   76  132:isub            
	//   77  133:i2d             
	//   78  134:ldc2w           #266 <Double 8D>
	//   79  137:ddiv            
	//   80  138:invokestatic    #273 <Method double Math.ceil(double)>
	//   81  141:d2i             
	//   82  142:istore_2        
		}
		if((int)imageSize == 0)
	//*  83  143:aload_0         
	//*  84  144:getfield        #275 <Field long imageSize>
	//*  85  147:l2i             
	//*  86  148:ifne            162
			j = (int)(bitmapFileSize - bitmapOffset);
	//   87  151:aload_0         
	//   88  152:getfield        #83  <Field long bitmapFileSize>
	//   89  155:aload_0         
	//   90  156:getfield        #85  <Field long bitmapOffset>
	//   91  159:lsub            
	//   92  160:l2i             
	//   93  161:istore_3        
		int j1 = 0;
	//   94  162:iconst_0        
	//   95  163:istore          4
		if(isBottomUp)
	//*  96  165:aload_0         
	//*  97  166:getfield        #277 <Field boolean isBottomUp>
	//*  98  169:ifeq            356
		{
			for(int k = height - 1; k >= 0; k--)
	//*  99  172:aload_0         
	//* 100  173:getfield        #99  <Field int height>
	//* 101  176:iconst_1        
	//* 102  177:isub            
	//* 103  178:istore_3        
	//* 104  179:iload_3         
	//* 105  180:iflt            529
			{
				int k1 = width * 3 * k;
	//  106  183:aload_0         
	//  107  184:getfield        #97  <Field int width>
	//  108  187:iconst_3        
	//  109  188:imul            
	//  110  189:iload_3         
	//  111  190:imul            
	//  112  191:istore          5
				j1 = 0;
	//  113  193:iconst_0        
	//  114  194:istore          4
				while(j1 < width) 
	//* 115  196:iload           4
	//* 116  198:aload_0         
	//* 117  199:getfield        #97  <Field int width>
	//* 118  202:icmpge          323
				{
					int j2;
					int i5;
					if(flag)
	//* 119  205:iload_1         
	//* 120  206:ifeq            310
						j2 = (int)readDWord(inputStream);
	//  121  209:aload_0         
	//  122  210:aload_0         
	//  123  211:getfield        #279 <Field InputStream inputStream>
	//  124  214:invokespecial   #283 <Method long readDWord(InputStream)>
	//  125  217:l2i             
	//  126  218:istore          6
					else
	//* 127  220:iload           5
	//* 128  222:iconst_1        
	//* 129  223:iadd            
	//* 130  224:istore          16
	//* 131  226:aload           17
	//* 132  228:iload           5
	//* 133  230:iload           6
	//* 134  232:iload           8
	//* 135  234:iushr           
	//* 136  235:iload           7
	//* 137  237:iand            
	//* 138  238:sipush          256
	//* 139  241:imul            
	//* 140  242:iload           9
	//* 141  244:idiv            
	//* 142  245:int2byte        
	//* 143  246:bastore         
	//* 144  247:iload           16
	//* 145  249:iconst_1        
	//* 146  250:iadd            
	//* 147  251:istore          5
	//* 148  253:aload           17
	//* 149  255:iload           16
	//* 150  257:iload           6
	//* 151  259:iload           11
	//* 152  261:iushr           
	//* 153  262:iload           10
	//* 154  264:iand            
	//* 155  265:sipush          256
	//* 156  268:imul            
	//* 157  269:iload           12
	//* 158  271:idiv            
	//* 159  272:int2byte        
	//* 160  273:bastore         
	//* 161  274:aload           17
	//* 162  276:iload           5
	//* 163  278:iload           6
	//* 164  280:iload           14
	//* 165  282:iushr           
	//* 166  283:iload           13
	//* 167  285:iand            
	//* 168  286:sipush          256
	//* 169  289:imul            
	//* 170  290:iload           15
	//* 171  292:idiv            
	//* 172  293:int2byte        
	//* 173  294:bastore         
	//* 174  295:iload           4
	//* 175  297:iconst_1        
	//* 176  298:iadd            
	//* 177  299:istore          4
	//* 178  301:iload           5
	//* 179  303:iconst_1        
	//* 180  304:iadd            
	//* 181  305:istore          5
	//* 182  307:goto            196
						j2 = readWord(inputStream);
	//  183  310:aload_0         
	//  184  311:aload_0         
	//  185  312:getfield        #279 <Field InputStream inputStream>
	//  186  315:invokespecial   #287 <Method int readWord(InputStream)>
	//  187  318:istore          6
					i5 = k1 + 1;
					abyte0[k1] = (byte)(((j2 >>> i3 & l2) * 256) / j3);
					k1 = i5 + 1;
					abyte0[i5] = (byte)(((j2 >>> l3 & k3) * 256) / i4);
					abyte0[k1] = (byte)(((j2 >>> k4 & j4) * 256) / l4);
					j1++;
					k1++;
				}
	//* 188  320:goto            220
				for(j1 = 0; j1 < i; j1++)
	//* 189  323:iconst_0        
	//* 190  324:istore          4
	//* 191  326:iload           4
	//* 192  328:iload_2         
	//* 193  329:icmpge          349
					inputStream.read();
	//  194  332:aload_0         
	//  195  333:getfield        #279 <Field InputStream inputStream>
	//  196  336:invokevirtual   #291 <Method int InputStream.read()>
	//  197  339:pop             

	//  198  340:iload           4
	//  199  342:iconst_1        
	//  200  343:iadd            
	//  201  344:istore          4
			}

	//  202  346:goto            326
	//  203  349:iload_3         
	//  204  350:iconst_1        
	//  205  351:isub            
	//  206  352:istore_3        
		} else
	//* 207  353:goto            179
		{
			for(int l = 0; l < height; l++)
	//* 208  356:iconst_0        
	//* 209  357:istore_3        
	//* 210  358:iload_3         
	//* 211  359:aload_0         
	//* 212  360:getfield        #99  <Field int height>
	//* 213  363:icmpge          529
			{
				int l1 = 0;
	//  214  366:iconst_0        
	//  215  367:istore          5
				while(l1 < width) 
	//* 216  369:iload           5
	//* 217  371:aload_0         
	//* 218  372:getfield        #97  <Field int width>
	//* 219  375:icmpge          496
				{
					int k2;
					int j5;
					if(flag)
	//* 220  378:iload_1         
	//* 221  379:ifeq            483
						k2 = (int)readDWord(inputStream);
	//  222  382:aload_0         
	//  223  383:aload_0         
	//  224  384:getfield        #279 <Field InputStream inputStream>
	//  225  387:invokespecial   #283 <Method long readDWord(InputStream)>
	//  226  390:l2i             
	//  227  391:istore          6
					else
	//* 228  393:iload           4
	//* 229  395:iconst_1        
	//* 230  396:iadd            
	//* 231  397:istore          16
	//* 232  399:aload           17
	//* 233  401:iload           4
	//* 234  403:iload           6
	//* 235  405:iload           8
	//* 236  407:iushr           
	//* 237  408:iload           7
	//* 238  410:iand            
	//* 239  411:sipush          256
	//* 240  414:imul            
	//* 241  415:iload           9
	//* 242  417:idiv            
	//* 243  418:int2byte        
	//* 244  419:bastore         
	//* 245  420:iload           16
	//* 246  422:iconst_1        
	//* 247  423:iadd            
	//* 248  424:istore          4
	//* 249  426:aload           17
	//* 250  428:iload           16
	//* 251  430:iload           6
	//* 252  432:iload           11
	//* 253  434:iushr           
	//* 254  435:iload           10
	//* 255  437:iand            
	//* 256  438:sipush          256
	//* 257  441:imul            
	//* 258  442:iload           12
	//* 259  444:idiv            
	//* 260  445:int2byte        
	//* 261  446:bastore         
	//* 262  447:aload           17
	//* 263  449:iload           4
	//* 264  451:iload           6
	//* 265  453:iload           14
	//* 266  455:iushr           
	//* 267  456:iload           13
	//* 268  458:iand            
	//* 269  459:sipush          256
	//* 270  462:imul            
	//* 271  463:iload           15
	//* 272  465:idiv            
	//* 273  466:int2byte        
	//* 274  467:bastore         
	//* 275  468:iload           5
	//* 276  470:iconst_1        
	//* 277  471:iadd            
	//* 278  472:istore          5
	//* 279  474:iload           4
	//* 280  476:iconst_1        
	//* 281  477:iadd            
	//* 282  478:istore          4
	//* 283  480:goto            369
						k2 = readWord(inputStream);
	//  284  483:aload_0         
	//  285  484:aload_0         
	//  286  485:getfield        #279 <Field InputStream inputStream>
	//  287  488:invokespecial   #287 <Method int readWord(InputStream)>
	//  288  491:istore          6
					j5 = j1 + 1;
					abyte0[j1] = (byte)(((k2 >>> i3 & l2) * 256) / j3);
					j1 = j5 + 1;
					abyte0[j5] = (byte)(((k2 >>> l3 & k3) * 256) / i4);
					abyte0[j1] = (byte)(((k2 >>> k4 & j4) * 256) / l4);
					l1++;
					j1++;
				}
	//* 289  493:goto            393
				for(int i2 = 0; i2 < i; i2++)
	//* 290  496:iconst_0        
	//* 291  497:istore          5
	//* 292  499:iload           5
	//* 293  501:iload_2         
	//* 294  502:icmpge          522
					inputStream.read();
	//  295  505:aload_0         
	//  296  506:getfield        #279 <Field InputStream inputStream>
	//  297  509:invokevirtual   #291 <Method int InputStream.read()>
	//  298  512:pop             

	//  299  513:iload           5
	//  300  515:iconst_1        
	//  301  516:iadd            
	//  302  517:istore          5
			}

	//  303  519:goto            499
	//  304  522:iload_3         
	//  305  523:iconst_1        
	//  306  524:iadd            
	//  307  525:istore_3        
		}
	//* 308  526:goto            358
		return ((Image) (new ImgRaw(width, height, 3, 8, abyte0)));
	//  309  529:new             #124 <Class ImgRaw>
	//  310  532:dup             
	//  311  533:aload_0         
	//  312  534:getfield        #97  <Field int width>
	//  313  537:aload_0         
	//  314  538:getfield        #99  <Field int height>
	//  315  541:iconst_3        
	//  316  542:bipush          8
	//  317  544:aload           17
	//  318  546:invokespecial   #127 <Method void ImgRaw(int, int, int, int, byte[])>
	//  319  549:areturn         
	}

	private Image read1Bit(int i)
		throws IOException, BadElementException
	{
		byte abyte0[] = new byte[((width + 7) / 8) * height];
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int width>
	//    2    4:bipush          7
	//    3    6:iadd            
	//    4    7:bipush          8
	//    5    9:idiv            
	//    6   10:aload_0         
	//    7   11:getfield        #99  <Field int height>
	//    8   14:imul            
	//    9   15:newarray        byte[]
	//   10   17:astore          6
		int j = 0;
	//   11   19:iconst_0        
	//   12   20:istore_2        
		int k1 = (int)Math.ceil((double)width / 8D);
	//   13   21:aload_0         
	//   14   22:getfield        #97  <Field int width>
	//   15   25:i2d             
	//   16   26:ldc2w           #266 <Double 8D>
	//   17   29:ddiv            
	//   18   30:invokestatic    #273 <Method double Math.ceil(double)>
	//   19   33:d2i             
	//   20   34:istore          4
		int k = k1 % 4;
	//   21   36:iload           4
	//   22   38:iconst_4        
	//   23   39:irem            
	//   24   40:istore_3        
		if(k != 0)
	//*  25   41:iload_3         
	//*  26   42:ifeq            49
			j = 4 - k;
	//   27   45:iconst_4        
	//   28   46:iload_3         
	//   29   47:isub            
	//   30   48:istore_2        
		int l1 = (k1 + j) * height;
	//   31   49:iload           4
	//   32   51:iload_2         
	//   33   52:iadd            
	//   34   53:aload_0         
	//   35   54:getfield        #99  <Field int height>
	//   36   57:imul            
	//   37   58:istore          5
		byte abyte1[] = new byte[l1];
	//   38   60:iload           5
	//   39   62:newarray        byte[]
	//   40   64:astore          7
		for(int l = 0; l < l1; l += inputStream.read(abyte1, l, l1 - l));
	//   41   66:iconst_0        
	//   42   67:istore_3        
	//   43   68:iload_3         
	//   44   69:iload           5
	//   45   71:icmpge          94
	//   46   74:iload_3         
	//   47   75:aload_0         
	//   48   76:getfield        #279 <Field InputStream inputStream>
	//   49   79:aload           7
	//   50   81:iload_3         
	//   51   82:iload           5
	//   52   84:iload_3         
	//   53   85:isub            
	//   54   86:invokevirtual   #294 <Method int InputStream.read(byte[], int, int)>
	//   55   89:iadd            
	//   56   90:istore_3        
	//*  57   91:goto            68
		if(isBottomUp)
	//*  58   94:aload_0         
	//*  59   95:getfield        #277 <Field boolean isBottomUp>
	//*  60   98:ifeq            142
		{
			for(int i1 = 0; i1 < height; i1++)
	//*  61  101:iconst_0        
	//*  62  102:istore_3        
	//*  63  103:iload_3         
	//*  64  104:aload_0         
	//*  65  105:getfield        #99  <Field int height>
	//*  66  108:icmpge          178
				System.arraycopy(((Object) (abyte1)), l1 - (i1 + 1) * (k1 + j), ((Object) (abyte0)), i1 * k1, k1);
	//   67  111:aload           7
	//   68  113:iload           5
	//   69  115:iload_3         
	//   70  116:iconst_1        
	//   71  117:iadd            
	//   72  118:iload           4
	//   73  120:iload_2         
	//   74  121:iadd            
	//   75  122:imul            
	//   76  123:isub            
	//   77  124:aload           6
	//   78  126:iload_3         
	//   79  127:iload           4
	//   80  129:imul            
	//   81  130:iload           4
	//   82  132:invokestatic    #300 <Method void System.arraycopy(Object, int, Object, int, int)>

	//   83  135:iload_3         
	//   84  136:iconst_1        
	//   85  137:iadd            
	//   86  138:istore_3        
		} else
	//*  87  139:goto            103
		{
			for(int j1 = 0; j1 < height; j1++)
	//*  88  142:iconst_0        
	//*  89  143:istore_3        
	//*  90  144:iload_3         
	//*  91  145:aload_0         
	//*  92  146:getfield        #99  <Field int height>
	//*  93  149:icmpge          178
				System.arraycopy(((Object) (abyte1)), (k1 + j) * j1, ((Object) (abyte0)), j1 * k1, k1);
	//   94  152:aload           7
	//   95  154:iload           4
	//   96  156:iload_2         
	//   97  157:iadd            
	//   98  158:iload_3         
	//   99  159:imul            
	//  100  160:aload           6
	//  101  162:iload_3         
	//  102  163:iload           4
	//  103  165:imul            
	//  104  166:iload           4
	//  105  168:invokestatic    #300 <Method void System.arraycopy(Object, int, Object, int, int)>

	//  106  171:iload_3         
	//  107  172:iconst_1        
	//  108  173:iadd            
	//  109  174:istore_3        
		}
	//* 110  175:goto            144
		return indexedModel(abyte0, 1, i);
	//  111  178:aload_0         
	//  112  179:aload           6
	//  113  181:iconst_1        
	//  114  182:iload_1         
	//  115  183:invokespecial   #302 <Method Image indexedModel(byte[], int, int)>
	//  116  186:areturn         
	}

	private void read24Bit(byte abyte0[])
	{
		int i;
		int k;
		int l;
		byte abyte1[];
		k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		i = width * 24;
	//    2    2:aload_0         
	//    3    3:getfield        #97  <Field int width>
	//    4    6:bipush          24
	//    5    8:imul            
	//    6    9:istore_2        
		if(i % 32 != 0)
	//*   7   10:iload_2         
	//*   8   11:bipush          32
	//*   9   13:irem            
	//*  10   14:ifeq            38
			k = (int)Math.ceil((double)((i / 32 + 1) * 32 - i) / 8D);
	//   11   17:iload_2         
	//   12   18:bipush          32
	//   13   20:idiv            
	//   14   21:iconst_1        
	//   15   22:iadd            
	//   16   23:bipush          32
	//   17   25:imul            
	//   18   26:iload_2         
	//   19   27:isub            
	//   20   28:i2d             
	//   21   29:ldc2w           #266 <Double 8D>
	//   22   32:ddiv            
	//   23   33:invokestatic    #273 <Method double Math.ceil(double)>
	//   24   36:d2i             
	//   25   37:istore_3        
		l = ((width * 3 + 3) / 4) * 4 * height;
	//   26   38:aload_0         
	//   27   39:getfield        #97  <Field int width>
	//   28   42:iconst_3        
	//   29   43:imul            
	//   30   44:iconst_3        
	//   31   45:iadd            
	//   32   46:iconst_4        
	//   33   47:idiv            
	//   34   48:iconst_4        
	//   35   49:imul            
	//   36   50:aload_0         
	//   37   51:getfield        #99  <Field int height>
	//   38   54:imul            
	//   39   55:istore          4
		abyte1 = new byte[l];
	//   40   57:iload           4
	//   41   59:newarray        byte[]
	//   42   61:astore          10
		i = 0;
	//   43   63:iconst_0        
	//   44   64:istore_2        
_L9:
		if(i >= l) goto _L2; else goto _L1
	//   45   65:iload_2         
	//   46   66:iload           4
	//   47   68:icmpge          92
_L1:
		int j1;
		int i2;
		int k2;
		try
		{
			j1 = inputStream.read(abyte1, i, l - i);
	//   48   71:aload_0         
	//   49   72:getfield        #279 <Field InputStream inputStream>
	//   50   75:aload           10
	//   51   77:iload_2         
	//   52   78:iload           4
	//   53   80:iload_2         
	//   54   81:isub            
	//   55   82:invokevirtual   #294 <Method int InputStream.read(byte[], int, int)>
	//   56   85:istore          5
		}
	//*  57   87:iload           5
	//*  58   89:ifge            228
	//*  59   92:iconst_0        
	//*  60   93:istore          5
	//*  61   95:aload_0         
	//*  62   96:getfield        #277 <Field boolean isBottomUp>
	//*  63   99:ifeq            255
	//*  64  102:aload_0         
	//*  65  103:getfield        #97  <Field int width>
	//*  66  106:istore          7
	//*  67  108:aload_0         
	//*  68  109:getfield        #99  <Field int height>
	//*  69  112:istore          8
	//*  70  114:iload_3         
	//*  71  115:ineg            
	//*  72  116:istore_2        
	//*  73  117:iconst_0        
	//*  74  118:istore          4
	//*  75  120:iload           4
	//*  76  122:aload_0         
	//*  77  123:getfield        #99  <Field int height>
	//*  78  126:icmpge          353
	//*  79  129:iload           7
	//*  80  131:iload           8
	//*  81  133:imul            
	//*  82  134:iconst_3        
	//*  83  135:imul            
	//*  84  136:iconst_1        
	//*  85  137:isub            
	//*  86  138:iload           4
	//*  87  140:iconst_1        
	//*  88  141:iadd            
	//*  89  142:aload_0         
	//*  90  143:getfield        #97  <Field int width>
	//*  91  146:imul            
	//*  92  147:iconst_3        
	//*  93  148:imul            
	//*  94  149:isub            
	//*  95  150:iconst_1        
	//*  96  151:iadd            
	//*  97  152:istore          6
	//*  98  154:iload_2         
	//*  99  155:iload_3         
	//* 100  156:iadd            
	//* 101  157:istore_2        
	//* 102  158:iconst_0        
	//* 103  159:istore          5
	//* 104  161:iload           5
	//* 105  163:aload_0         
	//* 106  164:getfield        #97  <Field int width>
	//* 107  167:icmpge          246
	//* 108  170:iload_2         
	//* 109  171:iconst_1        
	//* 110  172:iadd            
	//* 111  173:istore          9
	//* 112  175:aload_1         
	//* 113  176:iload           6
	//* 114  178:iconst_2        
	//* 115  179:iadd            
	//* 116  180:aload           10
	//* 117  182:iload_2         
	//* 118  183:baload          
	//* 119  184:bastore         
	//* 120  185:iload           9
	//* 121  187:iconst_1        
	//* 122  188:iadd            
	//* 123  189:istore_2        
	//* 124  190:aload_1         
	//* 125  191:iload           6
	//* 126  193:iconst_1        
	//* 127  194:iadd            
	//* 128  195:aload           10
	//* 129  197:iload           9
	//* 130  199:baload          
	//* 131  200:bastore         
	//* 132  201:aload_1         
	//* 133  202:iload           6
	//* 134  204:aload           10
	//* 135  206:iload_2         
	//* 136  207:baload          
	//* 137  208:bastore         
	//* 138  209:iload           6
	//* 139  211:iconst_3        
	//* 140  212:iadd            
	//* 141  213:istore          6
	//* 142  215:iload           5
	//* 143  217:iconst_1        
	//* 144  218:iadd            
	//* 145  219:istore          5
	//* 146  221:iload_2         
	//* 147  222:iconst_1        
	//* 148  223:iadd            
	//* 149  224:istore_2        
	//* 150  225:goto            161
	//* 151  228:iload_2         
	//* 152  229:iload           5
	//* 153  231:iadd            
	//* 154  232:istore_2        
	//* 155  233:goto            65
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 156  236:astore_1        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//  157  237:new             #172 <Class ExceptionConverter>
	//  158  240:dup             
	//  159  241:aload_1         
	//  160  242:invokespecial   #175 <Method void ExceptionConverter(Exception)>
	//  161  245:athrow          
		}
		if(j1 >= 0) goto _L3; else goto _L2
_L2:
		j1 = 0;
		if(!isBottomUp) goto _L5; else goto _L4
_L4:
		i2 = width;
		k2 = height;
		i = -k;
		l = 0;
_L7:
		if(l >= height)
			break; /* Loop/switch isn't completed */
		int k1 = (i2 * k2 * 3 - 1 - (l + 1) * width * 3) + 1;
		i += k;
		for(j1 = 0; j1 < width;)
		{
			int l2 = i + 1;
			abyte0[k1 + 2] = abyte1[i];
			i = l2 + 1;
			abyte0[k1 + 1] = abyte1[l2];
			abyte0[k1] = abyte1[i];
			k1 += 3;
			j1++;
			i++;
		}

		l++;
	//  162  246:iload           4
	//  163  248:iconst_1        
	//  164  249:iadd            
	//  165  250:istore          4
		continue; /* Loop/switch isn't completed */
	//  166  252:goto            120
_L3:
		i += j1;
		continue; /* Loop/switch isn't completed */
		if(true) goto _L7; else goto _L6
_L5:
		int j = -k;
	//  167  255:iload_3         
	//  168  256:ineg            
	//  169  257:istore_2        
		for(int i1 = 0; i1 < height; i1++)
	//* 170  258:iconst_0        
	//* 171  259:istore          4
	//* 172  261:iload           4
	//* 173  263:aload_0         
	//* 174  264:getfield        #99  <Field int height>
	//* 175  267:icmpge          353
		{
			j += k;
	//  176  270:iload_2         
	//  177  271:iload_3         
	//  178  272:iadd            
	//  179  273:istore_2        
			for(int l1 = 0; l1 < width;)
	//* 180  274:iconst_0        
	//* 181  275:istore          6
	//* 182  277:iload           6
	//* 183  279:aload_0         
	//* 184  280:getfield        #97  <Field int width>
	//* 185  283:icmpge          344
			{
				int j2 = j + 1;
	//  186  286:iload_2         
	//  187  287:iconst_1        
	//  188  288:iadd            
	//  189  289:istore          7
				abyte0[j1 + 2] = abyte1[j];
	//  190  291:aload_1         
	//  191  292:iload           5
	//  192  294:iconst_2        
	//  193  295:iadd            
	//  194  296:aload           10
	//  195  298:iload_2         
	//  196  299:baload          
	//  197  300:bastore         
				j = j2 + 1;
	//  198  301:iload           7
	//  199  303:iconst_1        
	//  200  304:iadd            
	//  201  305:istore_2        
				abyte0[j1 + 1] = abyte1[j2];
	//  202  306:aload_1         
	//  203  307:iload           5
	//  204  309:iconst_1        
	//  205  310:iadd            
	//  206  311:aload           10
	//  207  313:iload           7
	//  208  315:baload          
	//  209  316:bastore         
				abyte0[j1] = abyte1[j];
	//  210  317:aload_1         
	//  211  318:iload           5
	//  212  320:aload           10
	//  213  322:iload_2         
	//  214  323:baload          
	//  215  324:bastore         
				j1 += 3;
	//  216  325:iload           5
	//  217  327:iconst_3        
	//  218  328:iadd            
	//  219  329:istore          5
				l1++;
	//  220  331:iload           6
	//  221  333:iconst_1        
	//  222  334:iadd            
	//  223  335:istore          6
				j++;
	//  224  337:iload_2         
	//  225  338:iconst_1        
	//  226  339:iadd            
	//  227  340:istore_2        
			}

		}

	//  228  341:goto            277
	//  229  344:iload           4
	//  230  346:iconst_1        
	//  231  347:iadd            
	//  232  348:istore          4
	//* 233  350:goto            261
_L6:
		return;
	//  234  353:return          
		if(true) goto _L9; else goto _L8
_L8:
	}

	private Image read4Bit(int i)
		throws IOException, BadElementException
	{
		byte abyte0[] = new byte[((width + 1) / 2) * height];
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int width>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:iconst_2        
	//    5    7:idiv            
	//    6    8:aload_0         
	//    7    9:getfield        #99  <Field int height>
	//    8   12:imul            
	//    9   13:newarray        byte[]
	//   10   15:astore          6
		int j = 0;
	//   11   17:iconst_0        
	//   12   18:istore_2        
		int k1 = (int)Math.ceil((double)width / 2D);
	//   13   19:aload_0         
	//   14   20:getfield        #97  <Field int width>
	//   15   23:i2d             
	//   16   24:ldc2w           #303 <Double 2D>
	//   17   27:ddiv            
	//   18   28:invokestatic    #273 <Method double Math.ceil(double)>
	//   19   31:d2i             
	//   20   32:istore          4
		int k = k1 % 4;
	//   21   34:iload           4
	//   22   36:iconst_4        
	//   23   37:irem            
	//   24   38:istore_3        
		if(k != 0)
	//*  25   39:iload_3         
	//*  26   40:ifeq            47
			j = 4 - k;
	//   27   43:iconst_4        
	//   28   44:iload_3         
	//   29   45:isub            
	//   30   46:istore_2        
		int l1 = (k1 + j) * height;
	//   31   47:iload           4
	//   32   49:iload_2         
	//   33   50:iadd            
	//   34   51:aload_0         
	//   35   52:getfield        #99  <Field int height>
	//   36   55:imul            
	//   37   56:istore          5
		byte abyte1[] = new byte[l1];
	//   38   58:iload           5
	//   39   60:newarray        byte[]
	//   40   62:astore          7
		for(int l = 0; l < l1; l += inputStream.read(abyte1, l, l1 - l));
	//   41   64:iconst_0        
	//   42   65:istore_3        
	//   43   66:iload_3         
	//   44   67:iload           5
	//   45   69:icmpge          92
	//   46   72:iload_3         
	//   47   73:aload_0         
	//   48   74:getfield        #279 <Field InputStream inputStream>
	//   49   77:aload           7
	//   50   79:iload_3         
	//   51   80:iload           5
	//   52   82:iload_3         
	//   53   83:isub            
	//   54   84:invokevirtual   #294 <Method int InputStream.read(byte[], int, int)>
	//   55   87:iadd            
	//   56   88:istore_3        
	//*  57   89:goto            66
		if(isBottomUp)
	//*  58   92:aload_0         
	//*  59   93:getfield        #277 <Field boolean isBottomUp>
	//*  60   96:ifeq            140
		{
			for(int i1 = 0; i1 < height; i1++)
	//*  61   99:iconst_0        
	//*  62  100:istore_3        
	//*  63  101:iload_3         
	//*  64  102:aload_0         
	//*  65  103:getfield        #99  <Field int height>
	//*  66  106:icmpge          176
				System.arraycopy(((Object) (abyte1)), l1 - (i1 + 1) * (k1 + j), ((Object) (abyte0)), i1 * k1, k1);
	//   67  109:aload           7
	//   68  111:iload           5
	//   69  113:iload_3         
	//   70  114:iconst_1        
	//   71  115:iadd            
	//   72  116:iload           4
	//   73  118:iload_2         
	//   74  119:iadd            
	//   75  120:imul            
	//   76  121:isub            
	//   77  122:aload           6
	//   78  124:iload_3         
	//   79  125:iload           4
	//   80  127:imul            
	//   81  128:iload           4
	//   82  130:invokestatic    #300 <Method void System.arraycopy(Object, int, Object, int, int)>

	//   83  133:iload_3         
	//   84  134:iconst_1        
	//   85  135:iadd            
	//   86  136:istore_3        
		} else
	//*  87  137:goto            101
		{
			for(int j1 = 0; j1 < height; j1++)
	//*  88  140:iconst_0        
	//*  89  141:istore_3        
	//*  90  142:iload_3         
	//*  91  143:aload_0         
	//*  92  144:getfield        #99  <Field int height>
	//*  93  147:icmpge          176
				System.arraycopy(((Object) (abyte1)), (k1 + j) * j1, ((Object) (abyte0)), j1 * k1, k1);
	//   94  150:aload           7
	//   95  152:iload           4
	//   96  154:iload_2         
	//   97  155:iadd            
	//   98  156:iload_3         
	//   99  157:imul            
	//  100  158:aload           6
	//  101  160:iload_3         
	//  102  161:iload           4
	//  103  163:imul            
	//  104  164:iload           4
	//  105  166:invokestatic    #300 <Method void System.arraycopy(Object, int, Object, int, int)>

	//  106  169:iload_3         
	//  107  170:iconst_1        
	//  108  171:iadd            
	//  109  172:istore_3        
		}
	//* 110  173:goto            142
		return indexedModel(abyte0, 4, i);
	//  111  176:aload_0         
	//  112  177:aload           6
	//  113  179:iconst_4        
	//  114  180:iload_1         
	//  115  181:invokespecial   #302 <Method Image indexedModel(byte[], int, int)>
	//  116  184:areturn         
	}

	private Image read8Bit(int i)
		throws IOException, BadElementException
	{
		byte abyte0[] = new byte[width * height];
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int width>
	//    2    4:aload_0         
	//    3    5:getfield        #99  <Field int height>
	//    4    8:imul            
	//    5    9:newarray        byte[]
	//    6   11:astore          5
		int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		int k = width * 8;
	//    9   15:aload_0         
	//   10   16:getfield        #97  <Field int width>
	//   11   19:bipush          8
	//   12   21:imul            
	//   13   22:istore_3        
		if(k % 32 != 0)
	//*  14   23:iload_3         
	//*  15   24:bipush          32
	//*  16   26:irem            
	//*  17   27:ifeq            51
			j = (int)Math.ceil((double)((k / 32 + 1) * 32 - k) / 8D);
	//   18   30:iload_3         
	//   19   31:bipush          32
	//   20   33:idiv            
	//   21   34:iconst_1        
	//   22   35:iadd            
	//   23   36:bipush          32
	//   24   38:imul            
	//   25   39:iload_3         
	//   26   40:isub            
	//   27   41:i2d             
	//   28   42:ldc2w           #266 <Double 8D>
	//   29   45:ddiv            
	//   30   46:invokestatic    #273 <Method double Math.ceil(double)>
	//   31   49:d2i             
	//   32   50:istore_2        
		int k1 = (width + j) * height;
	//   33   51:aload_0         
	//   34   52:getfield        #97  <Field int width>
	//   35   55:iload_2         
	//   36   56:iadd            
	//   37   57:aload_0         
	//   38   58:getfield        #99  <Field int height>
	//   39   61:imul            
	//   40   62:istore          4
		byte abyte1[] = new byte[k1];
	//   41   64:iload           4
	//   42   66:newarray        byte[]
	//   43   68:astore          6
		for(int l = 0; l < k1; l += inputStream.read(abyte1, l, k1 - l));
	//   44   70:iconst_0        
	//   45   71:istore_3        
	//   46   72:iload_3         
	//   47   73:iload           4
	//   48   75:icmpge          98
	//   49   78:iload_3         
	//   50   79:aload_0         
	//   51   80:getfield        #279 <Field InputStream inputStream>
	//   52   83:aload           6
	//   53   85:iload_3         
	//   54   86:iload           4
	//   55   88:iload_3         
	//   56   89:isub            
	//   57   90:invokevirtual   #294 <Method int InputStream.read(byte[], int, int)>
	//   58   93:iadd            
	//   59   94:istore_3        
	//*  60   95:goto            72
		if(isBottomUp)
	//*  61   98:aload_0         
	//*  62   99:getfield        #277 <Field boolean isBottomUp>
	//*  63  102:ifeq            152
		{
			for(int i1 = 0; i1 < height; i1++)
	//*  64  105:iconst_0        
	//*  65  106:istore_3        
	//*  66  107:iload_3         
	//*  67  108:aload_0         
	//*  68  109:getfield        #99  <Field int height>
	//*  69  112:icmpge          194
				System.arraycopy(((Object) (abyte1)), k1 - (i1 + 1) * (width + j), ((Object) (abyte0)), width * i1, width);
	//   70  115:aload           6
	//   71  117:iload           4
	//   72  119:iload_3         
	//   73  120:iconst_1        
	//   74  121:iadd            
	//   75  122:aload_0         
	//   76  123:getfield        #97  <Field int width>
	//   77  126:iload_2         
	//   78  127:iadd            
	//   79  128:imul            
	//   80  129:isub            
	//   81  130:aload           5
	//   82  132:aload_0         
	//   83  133:getfield        #97  <Field int width>
	//   84  136:iload_3         
	//   85  137:imul            
	//   86  138:aload_0         
	//   87  139:getfield        #97  <Field int width>
	//   88  142:invokestatic    #300 <Method void System.arraycopy(Object, int, Object, int, int)>

	//   89  145:iload_3         
	//   90  146:iconst_1        
	//   91  147:iadd            
	//   92  148:istore_3        
		} else
	//*  93  149:goto            107
		{
			for(int j1 = 0; j1 < height; j1++)
	//*  94  152:iconst_0        
	//*  95  153:istore_3        
	//*  96  154:iload_3         
	//*  97  155:aload_0         
	//*  98  156:getfield        #99  <Field int height>
	//*  99  159:icmpge          194
				System.arraycopy(((Object) (abyte1)), (width + j) * j1, ((Object) (abyte0)), width * j1, width);
	//  100  162:aload           6
	//  101  164:aload_0         
	//  102  165:getfield        #97  <Field int width>
	//  103  168:iload_2         
	//  104  169:iadd            
	//  105  170:iload_3         
	//  106  171:imul            
	//  107  172:aload           5
	//  108  174:aload_0         
	//  109  175:getfield        #97  <Field int width>
	//  110  178:iload_3         
	//  111  179:imul            
	//  112  180:aload_0         
	//  113  181:getfield        #97  <Field int width>
	//  114  184:invokestatic    #300 <Method void System.arraycopy(Object, int, Object, int, int)>

	//  115  187:iload_3         
	//  116  188:iconst_1        
	//  117  189:iadd            
	//  118  190:istore_3        
		}
	//* 119  191:goto            154
		return indexedModel(abyte0, 8, i);
	//  120  194:aload_0         
	//  121  195:aload           5
	//  122  197:bipush          8
	//  123  199:iload_1         
	//  124  200:invokespecial   #302 <Method Image indexedModel(byte[], int, int)>
	//  125  203:areturn         
	}

	private long readDWord(InputStream inputstream)
		throws IOException
	{
		return readUnsignedInt(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #307 <Method long readUnsignedInt(InputStream)>
	//    3    5:lreturn         
	}

	private int readInt(InputStream inputstream)
		throws IOException
	{
		int i = readUnsignedByte(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//    3    5:istore_2        
		int j = readUnsignedByte(inputstream);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//    7   11:istore_3        
		int k = readUnsignedByte(inputstream);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//   11   17:istore          4
		return readUnsignedByte(inputstream) << 24 | k << 16 | j << 8 | i;
	//   12   19:aload_0         
	//   13   20:aload_1         
	//   14   21:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//   15   24:bipush          24
	//   16   26:ishl            
	//   17   27:iload           4
	//   18   29:bipush          16
	//   19   31:ishl            
	//   20   32:ior             
	//   21   33:iload_3         
	//   22   34:bipush          8
	//   23   36:ishl            
	//   24   37:ior             
	//   25   38:iload_2         
	//   26   39:ior             
	//   27   40:ireturn         
	}

	private int readLong(InputStream inputstream)
		throws IOException
	{
		return readInt(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #314 <Method int readInt(InputStream)>
	//    3    5:ireturn         
	}

	private void readPalette(int i)
		throws IOException
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            5
			return;
	//    2    4:return          
		palette = new byte[i];
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:newarray        byte[]
	//    6    9:putfield        #214 <Field byte[] palette>
		int k;
		for(int j = 0; j < i; j += k)
	//*   7   12:iconst_0        
	//*   8   13:istore_2        
	//*   9   14:iload_2         
	//*  10   15:iload_1         
	//*  11   16:icmpge          64
		{
			k = inputStream.read(palette, j, i - j);
	//   12   19:aload_0         
	//   13   20:getfield        #279 <Field InputStream inputStream>
	//   14   23:aload_0         
	//   15   24:getfield        #214 <Field byte[] palette>
	//   16   27:iload_2         
	//   17   28:iload_1         
	//   18   29:iload_2         
	//   19   30:isub            
	//   20   31:invokevirtual   #294 <Method int InputStream.read(byte[], int, int)>
	//   21   34:istore_3        
			if(k < 0)
	//*  22   35:iload_3         
	//*  23   36:ifge            57
				throw new RuntimeException(MessageLocalization.getComposedMessage("incomplete.palette", new Object[0]));
	//   24   39:new             #95  <Class RuntimeException>
	//   25   42:dup             
	//   26   43:ldc2            #317 <String "incomplete.palette">
	//   27   46:iconst_0        
	//   28   47:anewarray       Object[]
	//   29   50:invokestatic    #323 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   30   53:invokespecial   #134 <Method void RuntimeException(String)>
	//   31   56:athrow          
		}

	//   32   57:iload_2         
	//   33   58:iload_3         
	//   34   59:iadd            
	//   35   60:istore_2        
	//*  36   61:goto            14
		properties.put("palette", ((Object) (palette)));
	//   37   64:aload_0         
	//   38   65:getfield        #81  <Field HashMap properties>
	//   39   68:ldc2            #324 <String "palette">
	//   40   71:aload_0         
	//   41   72:getfield        #214 <Field byte[] palette>
	//   42   75:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//   43   78:pop             
	//   44   79:return          
	}

	private Image readRLE4()
		throws IOException, BadElementException
	{
		int j = (int)imageSize;
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field long imageSize>
	//    2    4:l2i             
	//    3    5:istore_2        
		int i = j;
	//    4    6:iload_2         
	//    5    7:istore_1        
		if(j == 0)
	//*   6    8:iload_2         
	//*   7    9:ifne            23
			i = (int)(bitmapFileSize - bitmapOffset);
	//    8   12:aload_0         
	//    9   13:getfield        #83  <Field long bitmapFileSize>
	//   10   16:aload_0         
	//   11   17:getfield        #85  <Field long bitmapOffset>
	//   12   20:lsub            
	//   13   21:l2i             
	//   14   22:istore_1        
		byte abyte0[] = new byte[i];
	//   15   23:iload_1         
	//   16   24:newarray        byte[]
	//   17   26:astore          7
		for(j = 0; j < i; j += inputStream.read(abyte0, j, i - j));
	//   18   28:iconst_0        
	//   19   29:istore_2        
	//   20   30:iload_2         
	//   21   31:iload_1         
	//   22   32:icmpge          54
	//   23   35:iload_2         
	//   24   36:aload_0         
	//   25   37:getfield        #279 <Field InputStream inputStream>
	//   26   40:aload           7
	//   27   42:iload_2         
	//   28   43:iload_1         
	//   29   44:iload_2         
	//   30   45:isub            
	//   31   46:invokevirtual   #294 <Method int InputStream.read(byte[], int, int)>
	//   32   49:iadd            
	//   33   50:istore_2        
	//*  34   51:goto            30
		byte abyte1[] = decodeRLE(false, abyte0);
	//   35   54:aload_0         
	//   36   55:iconst_0        
	//   37   56:aload           7
	//   38   58:invokespecial   #329 <Method byte[] decodeRLE(boolean, byte[])>
	//   39   61:astore          8
		abyte0 = abyte1;
	//   40   63:aload           8
	//   41   65:astore          7
		if(isBottomUp)
	//*  42   67:aload_0         
	//*  43   68:getfield        #277 <Field boolean isBottomUp>
	//*  44   71:ifeq            161
		{
			byte abyte2[] = new byte[width * height];
	//   45   74:aload_0         
	//   46   75:getfield        #97  <Field int width>
	//   47   78:aload_0         
	//   48   79:getfield        #99  <Field int height>
	//   49   82:imul            
	//   50   83:newarray        byte[]
	//   51   85:astore          9
			i = 0;
	//   52   87:iconst_0        
	//   53   88:istore_1        
			int k = height - 1;
	//   54   89:aload_0         
	//   55   90:getfield        #99  <Field int height>
	//   56   93:iconst_1        
	//   57   94:isub            
	//   58   95:istore_3        
			do
			{
				abyte0 = abyte2;
	//   59   96:aload           9
	//   60   98:astore          7
				if(k < 0)
					break;
	//   61  100:iload_3         
	//   62  101:iflt            161
				j = width;
	//   63  104:aload_0         
	//   64  105:getfield        #97  <Field int width>
	//   65  108:istore_2        
				int k1 = width;
	//   66  109:aload_0         
	//   67  110:getfield        #97  <Field int width>
	//   68  113:istore          5
				int i1 = k * j;
	//   69  115:iload_3         
	//   70  116:iload_2         
	//   71  117:imul            
	//   72  118:istore          4
				for(j = i; j != i + k1; j++)
	//*  73  120:iload_1         
	//*  74  121:istore_2        
	//*  75  122:iload_2         
	//*  76  123:iload_1         
	//*  77  124:iload           5
	//*  78  126:iadd            
	//*  79  127:icmpeq          152
				{
					abyte2[j] = abyte1[i1];
	//   80  130:aload           9
	//   81  132:iload_2         
	//   82  133:aload           8
	//   83  135:iload           4
	//   84  137:baload          
	//   85  138:bastore         
					i1++;
	//   86  139:iload           4
	//   87  141:iconst_1        
	//   88  142:iadd            
	//   89  143:istore          4
				}

	//   90  145:iload_2         
	//   91  146:iconst_1        
	//   92  147:iadd            
	//   93  148:istore_2        
	//*  94  149:goto            122
				k--;
	//   95  152:iload_3         
	//   96  153:iconst_1        
	//   97  154:isub            
	//   98  155:istore_3        
				i = j;
	//   99  156:iload_2         
	//  100  157:istore_1        
			} while(true);
	//  101  158:goto            96
		}
		int l1 = (width + 1) / 2;
	//  102  161:aload_0         
	//  103  162:getfield        #97  <Field int width>
	//  104  165:iconst_1        
	//  105  166:iadd            
	//  106  167:iconst_2        
	//  107  168:idiv            
	//  108  169:istore          5
		abyte1 = new byte[height * l1];
	//  109  171:aload_0         
	//  110  172:getfield        #99  <Field int height>
	//  111  175:iload           5
	//  112  177:imul            
	//  113  178:newarray        byte[]
	//  114  180:astore          8
		i = 0;
	//  115  182:iconst_0        
	//  116  183:istore_1        
		j = 0;
	//  117  184:iconst_0        
	//  118  185:istore_2        
		for(int l = 0; l < height; l++)
	//* 119  186:iconst_0        
	//* 120  187:istore_3        
	//* 121  188:iload_3         
	//* 122  189:aload_0         
	//* 123  190:getfield        #99  <Field int height>
	//* 124  193:icmpge          291
		{
			int j1 = 0;
	//  125  196:iconst_0        
	//  126  197:istore          4
			while(j1 < width) 
	//* 127  199:iload           4
	//* 128  201:aload_0         
	//* 129  202:getfield        #97  <Field int width>
	//* 130  205:icmpge          279
			{
				if((j1 & 1) == 0)
	//* 131  208:iload           4
	//* 132  210:iconst_1        
	//* 133  211:iand            
	//* 134  212:ifne            244
				{
					abyte1[j1 / 2 + j] = (byte)(abyte0[i] << 4);
	//  135  215:aload           8
	//  136  217:iload           4
	//  137  219:iconst_2        
	//  138  220:idiv            
	//  139  221:iload_2         
	//  140  222:iadd            
	//  141  223:aload           7
	//  142  225:iload_1         
	//  143  226:baload          
	//  144  227:iconst_4        
	//  145  228:ishl            
	//  146  229:int2byte        
	//  147  230:bastore         
					i++;
	//  148  231:iload_1         
	//  149  232:iconst_1        
	//  150  233:iadd            
	//  151  234:istore_1        
				} else
	//* 152  235:iload           4
	//* 153  237:iconst_1        
	//* 154  238:iadd            
	//* 155  239:istore          4
	//* 156  241:goto            199
				{
					int i2 = j1 / 2 + j;
	//  157  244:iload           4
	//  158  246:iconst_2        
	//  159  247:idiv            
	//  160  248:iload_2         
	//  161  249:iadd            
	//  162  250:istore          6
					abyte1[i2] = (byte)(abyte1[i2] | (byte)(abyte0[i] & 0xf));
	//  163  252:aload           8
	//  164  254:iload           6
	//  165  256:aload           8
	//  166  258:iload           6
	//  167  260:baload          
	//  168  261:aload           7
	//  169  263:iload_1         
	//  170  264:baload          
	//  171  265:bipush          15
	//  172  267:iand            
	//  173  268:int2byte        
	//  174  269:ior             
	//  175  270:int2byte        
	//  176  271:bastore         
					i++;
	//  177  272:iload_1         
	//  178  273:iconst_1        
	//  179  274:iadd            
	//  180  275:istore_1        
				}
				j1++;
			}
	//* 181  276:goto            235
			j += l1;
	//  182  279:iload_2         
	//  183  280:iload           5
	//  184  282:iadd            
	//  185  283:istore_2        
		}

	//  186  284:iload_3         
	//  187  285:iconst_1        
	//  188  286:iadd            
	//  189  287:istore_3        
	//* 190  288:goto            188
		return indexedModel(abyte1, 4, 4);
	//  191  291:aload_0         
	//  192  292:aload           8
	//  193  294:iconst_4        
	//  194  295:iconst_4        
	//  195  296:invokespecial   #302 <Method Image indexedModel(byte[], int, int)>
	//  196  299:areturn         
	}

	private Image readRLE8()
		throws IOException, BadElementException
	{
		int k = (int)imageSize;
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field long imageSize>
	//    2    4:l2i             
	//    3    5:istore_2        
		int i = k;
	//    4    6:iload_2         
	//    5    7:istore_1        
		if(k == 0)
	//*   6    8:iload_2         
	//*   7    9:ifne            23
			i = (int)(bitmapFileSize - bitmapOffset);
	//    8   12:aload_0         
	//    9   13:getfield        #83  <Field long bitmapFileSize>
	//   10   16:aload_0         
	//   11   17:getfield        #85  <Field long bitmapOffset>
	//   12   20:lsub            
	//   13   21:l2i             
	//   14   22:istore_1        
		byte abyte0[] = new byte[i];
	//   15   23:iload_1         
	//   16   24:newarray        byte[]
	//   17   26:astore          5
		for(k = 0; k < i; k += inputStream.read(abyte0, k, i - k));
	//   18   28:iconst_0        
	//   19   29:istore_2        
	//   20   30:iload_2         
	//   21   31:iload_1         
	//   22   32:icmpge          54
	//   23   35:iload_2         
	//   24   36:aload_0         
	//   25   37:getfield        #279 <Field InputStream inputStream>
	//   26   40:aload           5
	//   27   42:iload_2         
	//   28   43:iload_1         
	//   29   44:iload_2         
	//   30   45:isub            
	//   31   46:invokevirtual   #294 <Method int InputStream.read(byte[], int, int)>
	//   32   49:iadd            
	//   33   50:istore_2        
	//*  34   51:goto            30
		byte abyte1[] = decodeRLE(true, abyte0);
	//   35   54:aload_0         
	//   36   55:iconst_1        
	//   37   56:aload           5
	//   38   58:invokespecial   #329 <Method byte[] decodeRLE(boolean, byte[])>
	//   39   61:astore          6
		k = width;
	//   40   63:aload_0         
	//   41   64:getfield        #97  <Field int width>
	//   42   67:istore_2        
		int l = height;
	//   43   68:aload_0         
	//   44   69:getfield        #99  <Field int height>
	//   45   72:istore_3        
		abyte0 = abyte1;
	//   46   73:aload           6
	//   47   75:astore          5
		if(isBottomUp)
	//*  48   77:aload_0         
	//*  49   78:getfield        #277 <Field boolean isBottomUp>
	//*  50   81:ifeq            137
		{
			abyte0 = new byte[abyte1.length];
	//   51   84:aload           6
	//   52   86:arraylength     
	//   53   87:newarray        byte[]
	//   54   89:astore          5
			int i1 = width;
	//   55   91:aload_0         
	//   56   92:getfield        #97  <Field int width>
	//   57   95:istore          4
			for(int j = 0; j < height; j++)
	//*  58   97:iconst_0        
	//*  59   98:istore_1        
	//*  60   99:iload_1         
	//*  61  100:aload_0         
	//*  62  101:getfield        #99  <Field int height>
	//*  63  104:icmpge          137
				System.arraycopy(((Object) (abyte1)), k * l - (j + 1) * i1, ((Object) (abyte0)), j * i1, i1);
	//   64  107:aload           6
	//   65  109:iload_2         
	//   66  110:iload_3         
	//   67  111:imul            
	//   68  112:iload_1         
	//   69  113:iconst_1        
	//   70  114:iadd            
	//   71  115:iload           4
	//   72  117:imul            
	//   73  118:isub            
	//   74  119:aload           5
	//   75  121:iload_1         
	//   76  122:iload           4
	//   77  124:imul            
	//   78  125:iload           4
	//   79  127:invokestatic    #300 <Method void System.arraycopy(Object, int, Object, int, int)>

	//   80  130:iload_1         
	//   81  131:iconst_1        
	//   82  132:iadd            
	//   83  133:istore_1        
		}
	//*  84  134:goto            99
		return indexedModel(abyte0, 8, 4);
	//   85  137:aload_0         
	//   86  138:aload           5
	//   87  140:bipush          8
	//   88  142:iconst_4        
	//   89  143:invokespecial   #302 <Method Image indexedModel(byte[], int, int)>
	//   90  146:areturn         
	}

	private int readShort(InputStream inputstream)
		throws IOException
	{
		int i = readUnsignedByte(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//    3    5:istore_2        
		return readUnsignedByte(inputstream) << 8 | i;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//    7   11:bipush          8
	//    8   13:ishl            
	//    9   14:iload_2         
	//   10   15:ior             
	//   11   16:ireturn         
	}

	private int readUnsignedByte(InputStream inputstream)
		throws IOException
	{
		return inputstream.read() & 0xff;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #291 <Method int InputStream.read()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:ireturn         
	}

	private long readUnsignedInt(InputStream inputstream)
		throws IOException
	{
		int i = readUnsignedByte(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//    3    5:istore_2        
		int j = readUnsignedByte(inputstream);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//    7   11:istore_3        
		int k = readUnsignedByte(inputstream);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//   11   17:istore          4
		return -1L & (long)(readUnsignedByte(inputstream) << 24 | k << 16 | j << 8 | i);
	//   12   19:ldc2w           #331 <Long -1L>
	//   13   22:aload_0         
	//   14   23:aload_1         
	//   15   24:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//   16   27:bipush          24
	//   17   29:ishl            
	//   18   30:iload           4
	//   19   32:bipush          16
	//   20   34:ishl            
	//   21   35:ior             
	//   22   36:iload_3         
	//   23   37:bipush          8
	//   24   39:ishl            
	//   25   40:ior             
	//   26   41:iload_2         
	//   27   42:ior             
	//   28   43:i2l             
	//   29   44:land            
	//   30   45:lreturn         
	}

	private int readUnsignedShort(InputStream inputstream)
		throws IOException
	{
		int i = readUnsignedByte(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//    3    5:istore_2        
		return (readUnsignedByte(inputstream) << 8 | i) & 0xffff;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//    7   11:bipush          8
	//    8   13:ishl            
	//    9   14:iload_2         
	//   10   15:ior             
	//   11   16:ldc2            #334 <Int 65535>
	//   12   19:iand            
	//   13   20:ireturn         
	}

	private int readWord(InputStream inputstream)
		throws IOException
	{
		return readUnsignedShort(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #336 <Method int readUnsignedShort(InputStream)>
	//    3    5:ireturn         
	}

	protected void process(InputStream inputstream, boolean flag)
		throws IOException
	{
		int i;
		long l6;
		if(flag || (inputstream instanceof BufferedInputStream))
	//*   0    0:iload_2         
	//*   1    1:ifne            11
	//*   2    4:aload_1         
	//*   3    5:instanceof      #338 <Class BufferedInputStream>
	//*   4    8:ifeq            64
			inputStream = inputstream;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #279 <Field InputStream inputStream>
		else
	//*   8   16:iload_2         
	//*   9   17:ifne            121
	//*  10   20:aload_0         
	//*  11   21:aload_0         
	//*  12   22:getfield        #279 <Field InputStream inputStream>
	//*  13   25:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//*  14   28:bipush          66
	//*  15   30:icmpne          46
	//*  16   33:aload_0         
	//*  17   34:aload_0         
	//*  18   35:getfield        #279 <Field InputStream inputStream>
	//*  19   38:invokespecial   #311 <Method int readUnsignedByte(InputStream)>
	//*  20   41:bipush          77
	//*  21   43:icmpeq          79
	//*  22   46:new             #95  <Class RuntimeException>
	//*  23   49:dup             
	//*  24   50:ldc2            #340 <String "invalid.magic.value.for.bmp.file">
	//*  25   53:iconst_0        
	//*  26   54:anewarray       Object[]
	//*  27   57:invokestatic    #323 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//*  28   60:invokespecial   #134 <Method void RuntimeException(String)>
	//*  29   63:athrow          
			inputStream = ((InputStream) (new BufferedInputStream(inputstream)));
	//   30   64:aload_0         
	//   31   65:new             #338 <Class BufferedInputStream>
	//   32   68:dup             
	//   33   69:aload_1         
	//   34   70:invokespecial   #343 <Method void BufferedInputStream(InputStream)>
	//   35   73:putfield        #279 <Field InputStream inputStream>
		if(!flag)
		{
			if(readUnsignedByte(inputStream) != 66 || readUnsignedByte(inputStream) != 77)
				throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.magic.value.for.bmp.file", new Object[0]));
	//*  36   76:goto            16
			bitmapFileSize = readDWord(inputStream);
	//   37   79:aload_0         
	//   38   80:aload_0         
	//   39   81:aload_0         
	//   40   82:getfield        #279 <Field InputStream inputStream>
	//   41   85:invokespecial   #283 <Method long readDWord(InputStream)>
	//   42   88:putfield        #83  <Field long bitmapFileSize>
			readWord(inputStream);
	//   43   91:aload_0         
	//   44   92:aload_0         
	//   45   93:getfield        #279 <Field InputStream inputStream>
	//   46   96:invokespecial   #287 <Method int readWord(InputStream)>
	//   47   99:pop             
			readWord(inputStream);
	//   48  100:aload_0         
	//   49  101:aload_0         
	//   50  102:getfield        #279 <Field InputStream inputStream>
	//   51  105:invokespecial   #287 <Method int readWord(InputStream)>
	//   52  108:pop             
			bitmapOffset = readDWord(inputStream);
	//   53  109:aload_0         
	//   54  110:aload_0         
	//   55  111:aload_0         
	//   56  112:getfield        #279 <Field InputStream inputStream>
	//   57  115:invokespecial   #283 <Method long readDWord(InputStream)>
	//   58  118:putfield        #85  <Field long bitmapOffset>
		}
		l6 = readDWord(inputStream);
	//   59  121:aload_0         
	//   60  122:aload_0         
	//   61  123:getfield        #279 <Field InputStream inputStream>
	//   62  126:invokespecial   #283 <Method long readDWord(InputStream)>
	//   63  129:lstore          17
		int l;
		int l1;
		byte abyte0[];
		byte abyte2[];
		if(l6 == 12L)
	//*  64  131:lload           17
	//*  65  133:ldc2w           #344 <Long 12L>
	//*  66  136:lcmp            
	//*  67  137:ifne            524
		{
			width = readWord(inputStream);
	//   68  140:aload_0         
	//   69  141:aload_0         
	//   70  142:aload_0         
	//   71  143:getfield        #279 <Field InputStream inputStream>
	//   72  146:invokespecial   #287 <Method int readWord(InputStream)>
	//   73  149:putfield        #97  <Field int width>
			height = readWord(inputStream);
	//   74  152:aload_0         
	//   75  153:aload_0         
	//   76  154:aload_0         
	//   77  155:getfield        #279 <Field InputStream inputStream>
	//   78  158:invokespecial   #287 <Method int readWord(InputStream)>
	//   79  161:putfield        #99  <Field int height>
		} else
	//*  80  164:aload_0         
	//*  81  165:aload_0         
	//*  82  166:getfield        #279 <Field InputStream inputStream>
	//*  83  169:invokespecial   #287 <Method int readWord(InputStream)>
	//*  84  172:istore_3        
	//*  85  173:aload_0         
	//*  86  174:aload_0         
	//*  87  175:aload_0         
	//*  88  176:getfield        #279 <Field InputStream inputStream>
	//*  89  179:invokespecial   #287 <Method int readWord(InputStream)>
	//*  90  182:putfield        #347 <Field int bitsPerPixel>
	//*  91  185:aload_0         
	//*  92  186:getfield        #81  <Field HashMap properties>
	//*  93  189:ldc2            #349 <String "color_planes">
	//*  94  192:iload_3         
	//*  95  193:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//*  96  196:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*  97  199:pop             
	//*  98  200:aload_0         
	//*  99  201:getfield        #81  <Field HashMap properties>
	//* 100  204:ldc2            #357 <String "bits_per_pixel">
	//* 101  207:aload_0         
	//* 102  208:getfield        #347 <Field int bitsPerPixel>
	//* 103  211:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 104  214:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 105  217:pop             
	//* 106  218:aload_0         
	//* 107  219:iconst_3        
	//* 108  220:putfield        #359 <Field int numBands>
	//* 109  223:aload_0         
	//* 110  224:getfield        #85  <Field long bitmapOffset>
	//* 111  227:lconst_0        
	//* 112  228:lcmp            
	//* 113  229:ifne            238
	//* 114  232:aload_0         
	//* 115  233:lload           17
	//* 116  235:putfield        #85  <Field long bitmapOffset>
	//* 117  238:lload           17
	//* 118  240:ldc2w           #344 <Long 12L>
	//* 119  243:lcmp            
	//* 120  244:ifne            625
	//* 121  247:aload_0         
	//* 122  248:getfield        #81  <Field HashMap properties>
	//* 123  251:ldc2            #361 <String "bmp_version">
	//* 124  254:ldc2            #363 <String "BMP v. 2.x">
	//* 125  257:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 126  260:pop             
	//* 127  261:aload_0         
	//* 128  262:getfield        #347 <Field int bitsPerPixel>
	//* 129  265:iconst_1        
	//* 130  266:icmpne          551
	//* 131  269:aload_0         
	//* 132  270:iconst_0        
	//* 133  271:putfield        #108 <Field int imageType>
	//* 134  274:aload_0         
	//* 135  275:getfield        #85  <Field long bitmapOffset>
	//* 136  278:ldc2w           #364 <Long 14L>
	//* 137  281:lsub            
	//* 138  282:lload           17
	//* 139  284:lsub            
	//* 140  285:ldc2w           #366 <Long 3L>
	//* 141  288:ldiv            
	//* 142  289:l2i             
	//* 143  290:iconst_3        
	//* 144  291:imul            
	//* 145  292:istore_3        
	//* 146  293:iload_3         
	//* 147  294:istore          4
	//* 148  296:aload_0         
	//* 149  297:getfield        #85  <Field long bitmapOffset>
	//* 150  300:lload           17
	//* 151  302:lcmp            
	//* 152  303:ifne            352
	//* 153  306:aload_0         
	//* 154  307:getfield        #108 <Field int imageType>
	//* 155  310:tableswitch     0 3: default 340
	//	               0 601
	//	               1 607
	//	               2 613
	//	               3 620
	//* 156  340:aload_0         
	//* 157  341:iload_3         
	//* 158  342:i2l             
	//* 159  343:lload           17
	//* 160  345:ladd            
	//* 161  346:putfield        #85  <Field long bitmapOffset>
	//* 162  349:iload_3         
	//* 163  350:istore          4
	//* 164  352:aload_0         
	//* 165  353:iload           4
	//* 166  355:invokespecial   #369 <Method void readPalette(int)>
	//* 167  358:aload_0         
	//* 168  359:getfield        #99  <Field int height>
	//* 169  362:ifle            2604
	//* 170  365:aload_0         
	//* 171  366:iconst_1        
	//* 172  367:putfield        #277 <Field boolean isBottomUp>
	//* 173  370:aload_0         
	//* 174  371:getfield        #347 <Field int bitsPerPixel>
	//* 175  374:iconst_1        
	//* 176  375:icmpeq          395
	//* 177  378:aload_0         
	//* 178  379:getfield        #347 <Field int bitsPerPixel>
	//* 179  382:iconst_4        
	//* 180  383:icmpeq          395
	//* 181  386:aload_0         
	//* 182  387:getfield        #347 <Field int bitsPerPixel>
	//* 183  390:bipush          8
	//* 184  392:icmpne          2724
	//* 185  395:aload_0         
	//* 186  396:iconst_1        
	//* 187  397:putfield        #359 <Field int numBands>
	//* 188  400:aload_0         
	//* 189  401:getfield        #108 <Field int imageType>
	//* 190  404:ifeq            423
	//* 191  407:aload_0         
	//* 192  408:getfield        #108 <Field int imageType>
	//* 193  411:iconst_1        
	//* 194  412:icmpeq          423
	//* 195  415:aload_0         
	//* 196  416:getfield        #108 <Field int imageType>
	//* 197  419:iconst_2        
	//* 198  420:icmpne          2623
	//* 199  423:aload_0         
	//* 200  424:getfield        #214 <Field byte[] palette>
	//* 201  427:arraylength     
	//* 202  428:iconst_3        
	//* 203  429:idiv            
	//* 204  430:istore          4
	//* 205  432:iload           4
	//* 206  434:istore_3        
	//* 207  435:iload           4
	//* 208  437:sipush          256
	//* 209  440:icmple          447
	//* 210  443:sipush          256
	//* 211  446:istore_3        
	//* 212  447:iload_3         
	//* 213  448:newarray        byte[]
	//* 214  450:astore_1        
	//* 215  451:iload_3         
	//* 216  452:newarray        byte[]
	//* 217  454:astore          27
	//* 218  456:iload_3         
	//* 219  457:newarray        byte[]
	//* 220  459:astore          28
	//* 221  461:iconst_0        
	//* 222  462:istore          4
	//* 223  464:iload           4
	//* 224  466:iload_3         
	//* 225  467:icmpge          2738
	//* 226  470:iload           4
	//* 227  472:iconst_3        
	//* 228  473:imul            
	//* 229  474:istore          5
	//* 230  476:aload           28
	//* 231  478:iload           4
	//* 232  480:aload_0         
	//* 233  481:getfield        #214 <Field byte[] palette>
	//* 234  484:iload           5
	//* 235  486:baload          
	//* 236  487:bastore         
	//* 237  488:aload           27
	//* 238  490:iload           4
	//* 239  492:aload_0         
	//* 240  493:getfield        #214 <Field byte[] palette>
	//* 241  496:iload           5
	//* 242  498:iconst_1        
	//* 243  499:iadd            
	//* 244  500:baload          
	//* 245  501:bastore         
	//* 246  502:aload_1         
	//* 247  503:iload           4
	//* 248  505:aload_0         
	//* 249  506:getfield        #214 <Field byte[] palette>
	//* 250  509:iload           5
	//* 251  511:iconst_2        
	//* 252  512:iadd            
	//* 253  513:baload          
	//* 254  514:bastore         
	//* 255  515:iload           4
	//* 256  517:iconst_1        
	//* 257  518:iadd            
	//* 258  519:istore          4
	//* 259  521:goto            464
		{
			width = readLong(inputStream);
	//  260  524:aload_0         
	//  261  525:aload_0         
	//  262  526:aload_0         
	//  263  527:getfield        #279 <Field InputStream inputStream>
	//  264  530:invokespecial   #371 <Method int readLong(InputStream)>
	//  265  533:putfield        #97  <Field int width>
			height = readLong(inputStream);
	//  266  536:aload_0         
	//  267  537:aload_0         
	//  268  538:aload_0         
	//  269  539:getfield        #279 <Field InputStream inputStream>
	//  270  542:invokespecial   #371 <Method int readLong(InputStream)>
	//  271  545:putfield        #99  <Field int height>
		}
		i = readWord(inputStream);
		bitsPerPixel = readWord(inputStream);
		properties.put("color_planes", ((Object) (Integer.valueOf(i))));
		properties.put("bits_per_pixel", ((Object) (Integer.valueOf(bitsPerPixel))));
		numBands = 3;
		if(bitmapOffset == 0L)
			bitmapOffset = l6;
		if(l6 != 12L) goto _L2; else goto _L1
_L1:
		properties.put("bmp_version", "BMP v. 2.x");
		if(bitsPerPixel != 1) goto _L4; else goto _L3
_L3:
		imageType = 0;
_L45:
		i = (int)((bitmapOffset - 14L - l6) / 3L) * 3;
		l = i;
		if(bitmapOffset != l6) goto _L6; else goto _L5
_L5:
		imageType;
		JVM INSTR tableswitch 0 3: default 340
	//	               0 601
	//	               1 607
	//	               2 613
	//	               3 620;
		   goto _L7 _L8 _L9 _L10 _L11
_L7:
		bitmapOffset = (long)i + l6;
		l = i;
_L6:
		readPalette(l);
_L31:
		if(height > 0)
		{
			isBottomUp = true;
		} else
	//* 272  548:goto            164
	//* 273  551:aload_0         
	//* 274  552:getfield        #347 <Field int bitsPerPixel>
	//* 275  555:iconst_4        
	//* 276  556:icmpne          567
	//* 277  559:aload_0         
	//* 278  560:iconst_1        
	//* 279  561:putfield        #108 <Field int imageType>
	//* 280  564:goto            274
	//* 281  567:aload_0         
	//* 282  568:getfield        #347 <Field int bitsPerPixel>
	//* 283  571:bipush          8
	//* 284  573:icmpne          584
	//* 285  576:aload_0         
	//* 286  577:iconst_2        
	//* 287  578:putfield        #108 <Field int imageType>
	//* 288  581:goto            274
	//* 289  584:aload_0         
	//* 290  585:getfield        #347 <Field int bitsPerPixel>
	//* 291  588:bipush          24
	//* 292  590:icmpne          274
	//* 293  593:aload_0         
	//* 294  594:iconst_3        
	//* 295  595:putfield        #108 <Field int imageType>
	//* 296  598:goto            274
	//* 297  601:bipush          6
	//* 298  603:istore_3        
	//* 299  604:goto            340
	//* 300  607:bipush          48
	//* 301  609:istore_3        
	//* 302  610:goto            340
	//* 303  613:sipush          768
	//* 304  616:istore_3        
	//* 305  617:goto            340
	//* 306  620:iconst_0        
	//* 307  621:istore_3        
	//* 308  622:goto            340
	//* 309  625:aload_0         
	//* 310  626:aload_0         
	//* 311  627:aload_0         
	//* 312  628:getfield        #279 <Field InputStream inputStream>
	//* 313  631:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 314  634:putfield        #129 <Field long compression>
	//* 315  637:aload_0         
	//* 316  638:aload_0         
	//* 317  639:aload_0         
	//* 318  640:getfield        #279 <Field InputStream inputStream>
	//* 319  643:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 320  646:putfield        #275 <Field long imageSize>
	//* 321  649:aload_0         
	//* 322  650:aload_0         
	//* 323  651:aload_0         
	//* 324  652:getfield        #279 <Field InputStream inputStream>
	//* 325  655:invokespecial   #371 <Method int readLong(InputStream)>
	//* 326  658:i2l             
	//* 327  659:putfield        #154 <Field long xPelsPerMeter>
	//* 328  662:aload_0         
	//* 329  663:aload_0         
	//* 330  664:aload_0         
	//* 331  665:getfield        #279 <Field InputStream inputStream>
	//* 332  668:invokespecial   #371 <Method int readLong(InputStream)>
	//* 333  671:i2l             
	//* 334  672:putfield        #160 <Field long yPelsPerMeter>
	//* 335  675:aload_0         
	//* 336  676:aload_0         
	//* 337  677:getfield        #279 <Field InputStream inputStream>
	//* 338  680:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 339  683:lstore          13
	//* 340  685:aload_0         
	//* 341  686:aload_0         
	//* 342  687:getfield        #279 <Field InputStream inputStream>
	//* 343  690:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 344  693:lstore          15
	//* 345  695:aload_0         
	//* 346  696:getfield        #129 <Field long compression>
	//* 347  699:l2i             
	//* 348  700:tableswitch     0 3: default 732
	//	               0 875
	//	               1 892
	//	               2 909
	//	               3 926
	//* 349  732:aload_0         
	//* 350  733:getfield        #81  <Field HashMap properties>
	//* 351  736:ldc2            #373 <String "x_pixels_per_meter">
	//* 352  739:aload_0         
	//* 353  740:getfield        #154 <Field long xPelsPerMeter>
	//* 354  743:invokestatic    #378 <Method Long Long.valueOf(long)>
	//* 355  746:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 356  749:pop             
	//* 357  750:aload_0         
	//* 358  751:getfield        #81  <Field HashMap properties>
	//* 359  754:ldc2            #380 <String "y_pixels_per_meter">
	//* 360  757:aload_0         
	//* 361  758:getfield        #160 <Field long yPelsPerMeter>
	//* 362  761:invokestatic    #378 <Method Long Long.valueOf(long)>
	//* 363  764:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 364  767:pop             
	//* 365  768:aload_0         
	//* 366  769:getfield        #81  <Field HashMap properties>
	//* 367  772:ldc2            #382 <String "colors_used">
	//* 368  775:lload           13
	//* 369  777:invokestatic    #378 <Method Long Long.valueOf(long)>
	//* 370  780:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 371  783:pop             
	//* 372  784:aload_0         
	//* 373  785:getfield        #81  <Field HashMap properties>
	//* 374  788:ldc2            #384 <String "colors_important">
	//* 375  791:lload           15
	//* 376  793:invokestatic    #378 <Method Long Long.valueOf(long)>
	//* 377  796:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 378  799:pop             
	//* 379  800:lload           17
	//* 380  802:ldc2w           #385 <Long 40L>
	//* 381  805:lcmp            
	//* 382  806:ifeq            827
	//* 383  809:lload           17
	//* 384  811:ldc2w           #387 <Long 52L>
	//* 385  814:lcmp            
	//* 386  815:ifeq            827
	//* 387  818:lload           17
	//* 388  820:ldc2w           #389 <Long 56L>
	//* 389  823:lcmp            
	//* 390  824:ifne            1700
	//* 391  827:aload_0         
	//* 392  828:getfield        #129 <Field long compression>
	//* 393  831:l2i             
	//* 394  832:tableswitch     0 3: default 864
	//	               0 943
	//	               1 943
	//	               2 943
	//	               3 1501
	//* 395  864:new             #95  <Class RuntimeException>
	//* 396  867:dup             
	//* 397  868:ldc2            #392 <String "Invalid compression specified in BMP file.">
	//* 398  871:invokespecial   #134 <Method void RuntimeException(String)>
	//* 399  874:athrow          
	//* 400  875:aload_0         
	//* 401  876:getfield        #81  <Field HashMap properties>
	//* 402  879:ldc2            #393 <String "compression">
	//* 403  882:ldc2            #394 <String "BI_RGB">
	//* 404  885:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 405  888:pop             
	//* 406  889:goto            732
	//* 407  892:aload_0         
	//* 408  893:getfield        #81  <Field HashMap properties>
	//* 409  896:ldc2            #393 <String "compression">
	//* 410  899:ldc2            #395 <String "BI_RLE8">
	//* 411  902:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 412  905:pop             
	//* 413  906:goto            732
	//* 414  909:aload_0         
	//* 415  910:getfield        #81  <Field HashMap properties>
	//* 416  913:ldc2            #393 <String "compression">
	//* 417  916:ldc2            #396 <String "BI_RLE4">
	//* 418  919:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 419  922:pop             
	//* 420  923:goto            732
	//* 421  926:aload_0         
	//* 422  927:getfield        #81  <Field HashMap properties>
	//* 423  930:ldc2            #393 <String "compression">
	//* 424  933:ldc2            #397 <String "BI_BITFIELDS">
	//* 425  936:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 426  939:pop             
	//* 427  940:goto            732
	//* 428  943:aload_0         
	//* 429  944:getfield        #347 <Field int bitsPerPixel>
	//* 430  947:iconst_1        
	//* 431  948:icmpne          1189
	//* 432  951:aload_0         
	//* 433  952:iconst_4        
	//* 434  953:putfield        #108 <Field int imageType>
	//* 435  956:lload           17
	//* 436  958:ldc2w           #387 <Long 52L>
	//* 437  961:lcmp            
	//* 438  962:iflt            1058
	//* 439  965:aload_0         
	//* 440  966:aload_0         
	//* 441  967:aload_0         
	//* 442  968:getfield        #279 <Field InputStream inputStream>
	//* 443  971:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 444  974:l2i             
	//* 445  975:putfield        #257 <Field int redMask>
	//* 446  978:aload_0         
	//* 447  979:aload_0         
	//* 448  980:aload_0         
	//* 449  981:getfield        #279 <Field InputStream inputStream>
	//* 450  984:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 451  987:l2i             
	//* 452  988:putfield        #263 <Field int greenMask>
	//* 453  991:aload_0         
	//* 454  992:aload_0         
	//* 455  993:aload_0         
	//* 456  994:getfield        #279 <Field InputStream inputStream>
	//* 457  997:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 458 1000:l2i             
	//* 459 1001:putfield        #265 <Field int blueMask>
	//* 460 1004:aload_0         
	//* 461 1005:getfield        #81  <Field HashMap properties>
	//* 462 1008:ldc2            #399 <String "red_mask">
	//* 463 1011:aload_0         
	//* 464 1012:getfield        #257 <Field int redMask>
	//* 465 1015:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 466 1018:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 467 1021:pop             
	//* 468 1022:aload_0         
	//* 469 1023:getfield        #81  <Field HashMap properties>
	//* 470 1026:ldc2            #401 <String "green_mask">
	//* 471 1029:aload_0         
	//* 472 1030:getfield        #263 <Field int greenMask>
	//* 473 1033:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 474 1036:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 475 1039:pop             
	//* 476 1040:aload_0         
	//* 477 1041:getfield        #81  <Field HashMap properties>
	//* 478 1044:ldc2            #403 <String "blue_mask">
	//* 479 1047:aload_0         
	//* 480 1048:getfield        #265 <Field int blueMask>
	//* 481 1051:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 482 1054:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 483 1057:pop             
	//* 484 1058:lload           17
	//* 485 1060:ldc2w           #389 <Long 56L>
	//* 486 1063:lcmp            
	//* 487 1064:ifne            1098
	//* 488 1067:aload_0         
	//* 489 1068:aload_0         
	//* 490 1069:aload_0         
	//* 491 1070:getfield        #279 <Field InputStream inputStream>
	//* 492 1073:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 493 1076:l2i             
	//* 494 1077:putfield        #405 <Field int alphaMask>
	//* 495 1080:aload_0         
	//* 496 1081:getfield        #81  <Field HashMap properties>
	//* 497 1084:ldc2            #407 <String "alpha_mask">
	//* 498 1087:aload_0         
	//* 499 1088:getfield        #405 <Field int alphaMask>
	//* 500 1091:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 501 1094:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 502 1097:pop             
	//* 503 1098:aload_0         
	//* 504 1099:getfield        #85  <Field long bitmapOffset>
	//* 505 1102:ldc2w           #364 <Long 14L>
	//* 506 1105:lsub            
	//* 507 1106:lload           17
	//* 508 1108:lsub            
	//* 509 1109:ldc2w           #408 <Long 4L>
	//* 510 1112:ldiv            
	//* 511 1113:l2i             
	//* 512 1114:iconst_4        
	//* 513 1115:imul            
	//* 514 1116:istore_3        
	//* 515 1117:aload_0         
	//* 516 1118:getfield        #85  <Field long bitmapOffset>
	//* 517 1121:lload           17
	//* 518 1123:lcmp            
	//* 519 1124:ifne            1167
	//* 520 1127:aload_0         
	//* 521 1128:getfield        #108 <Field int imageType>
	//* 522 1131:tableswitch     4 6: default 1156
	//	               4 1426
	//	               5 1451
	//	               6 1476
	//* 523 1156:iconst_0        
	//* 524 1157:istore_3        
	//* 525 1158:aload_0         
	//* 526 1159:iload_3         
	//* 527 1160:i2l             
	//* 528 1161:lload           17
	//* 529 1163:ladd            
	//* 530 1164:putfield        #85  <Field long bitmapOffset>
	//* 531 1167:aload_0         
	//* 532 1168:iload_3         
	//* 533 1169:invokespecial   #369 <Method void readPalette(int)>
	//* 534 1172:aload_0         
	//* 535 1173:getfield        #81  <Field HashMap properties>
	//* 536 1176:ldc2            #361 <String "bmp_version">
	//* 537 1179:ldc2            #411 <String "BMP v. 3.x">
	//* 538 1182:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 539 1185:pop             
	//* 540 1186:goto            358
	//* 541 1189:aload_0         
	//* 542 1190:getfield        #347 <Field int bitsPerPixel>
	//* 543 1193:iconst_4        
	//* 544 1194:icmpne          1205
	//* 545 1197:aload_0         
	//* 546 1198:iconst_5        
	//* 547 1199:putfield        #108 <Field int imageType>
	//* 548 1202:goto            956
	//* 549 1205:aload_0         
	//* 550 1206:getfield        #347 <Field int bitsPerPixel>
	//* 551 1209:bipush          8
	//* 552 1211:icmpne          1223
	//* 553 1214:aload_0         
	//* 554 1215:bipush          6
	//* 555 1217:putfield        #108 <Field int imageType>
	//* 556 1220:goto            956
	//* 557 1223:aload_0         
	//* 558 1224:getfield        #347 <Field int bitsPerPixel>
	//* 559 1227:bipush          24
	//* 560 1229:icmpne          1241
	//* 561 1232:aload_0         
	//* 562 1233:bipush          7
	//* 563 1235:putfield        #108 <Field int imageType>
	//* 564 1238:goto            956
	//* 565 1241:aload_0         
	//* 566 1242:getfield        #347 <Field int bitsPerPixel>
	//* 567 1245:bipush          16
	//* 568 1247:icmpne          1333
	//* 569 1250:aload_0         
	//* 570 1251:bipush          8
	//* 571 1253:putfield        #108 <Field int imageType>
	//* 572 1256:aload_0         
	//* 573 1257:sipush          31744
	//* 574 1260:putfield        #257 <Field int redMask>
	//* 575 1263:aload_0         
	//* 576 1264:sipush          992
	//* 577 1267:putfield        #263 <Field int greenMask>
	//* 578 1270:aload_0         
	//* 579 1271:bipush          31
	//* 580 1273:putfield        #265 <Field int blueMask>
	//* 581 1276:aload_0         
	//* 582 1277:getfield        #81  <Field HashMap properties>
	//* 583 1280:ldc2            #399 <String "red_mask">
	//* 584 1283:aload_0         
	//* 585 1284:getfield        #257 <Field int redMask>
	//* 586 1287:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 587 1290:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 588 1293:pop             
	//* 589 1294:aload_0         
	//* 590 1295:getfield        #81  <Field HashMap properties>
	//* 591 1298:ldc2            #401 <String "green_mask">
	//* 592 1301:aload_0         
	//* 593 1302:getfield        #263 <Field int greenMask>
	//* 594 1305:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 595 1308:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 596 1311:pop             
	//* 597 1312:aload_0         
	//* 598 1313:getfield        #81  <Field HashMap properties>
	//* 599 1316:ldc2            #403 <String "blue_mask">
	//* 600 1319:aload_0         
	//* 601 1320:getfield        #265 <Field int blueMask>
	//* 602 1323:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 603 1326:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 604 1329:pop             
	//* 605 1330:goto            956
	//* 606 1333:aload_0         
	//* 607 1334:getfield        #347 <Field int bitsPerPixel>
	//* 608 1337:bipush          32
	//* 609 1339:icmpne          956
	//* 610 1342:aload_0         
	//* 611 1343:bipush          9
	//* 612 1345:putfield        #108 <Field int imageType>
	//* 613 1348:aload_0         
	//* 614 1349:ldc2            #412 <Int 0xff0000>
	//* 615 1352:putfield        #257 <Field int redMask>
	//* 616 1355:aload_0         
	//* 617 1356:ldc2            #413 <Int 65280>
	//* 618 1359:putfield        #263 <Field int greenMask>
	//* 619 1362:aload_0         
	//* 620 1363:sipush          255
	//* 621 1366:putfield        #265 <Field int blueMask>
	//* 622 1369:aload_0         
	//* 623 1370:getfield        #81  <Field HashMap properties>
	//* 624 1373:ldc2            #399 <String "red_mask">
	//* 625 1376:aload_0         
	//* 626 1377:getfield        #257 <Field int redMask>
	//* 627 1380:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 628 1383:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 629 1386:pop             
	//* 630 1387:aload_0         
	//* 631 1388:getfield        #81  <Field HashMap properties>
	//* 632 1391:ldc2            #401 <String "green_mask">
	//* 633 1394:aload_0         
	//* 634 1395:getfield        #263 <Field int greenMask>
	//* 635 1398:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 636 1401:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 637 1404:pop             
	//* 638 1405:aload_0         
	//* 639 1406:getfield        #81  <Field HashMap properties>
	//* 640 1409:ldc2            #403 <String "blue_mask">
	//* 641 1412:aload_0         
	//* 642 1413:getfield        #265 <Field int blueMask>
	//* 643 1416:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 644 1419:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 645 1422:pop             
	//* 646 1423:goto            956
	//* 647 1426:lload           13
	//* 648 1428:lstore          15
	//* 649 1430:lload           13
	//* 650 1432:lconst_0        
	//* 651 1433:lcmp            
	//* 652 1434:ifne            1442
	//* 653 1437:ldc2w           #414 <Long 2L>
	//* 654 1440:lstore          15
	//* 655 1442:lload           15
	//* 656 1444:l2i             
	//* 657 1445:iconst_4        
	//* 658 1446:imul            
	//* 659 1447:istore_3        
	//* 660 1448:goto            1158
	//* 661 1451:lload           13
	//* 662 1453:lstore          15
	//* 663 1455:lload           13
	//* 664 1457:lconst_0        
	//* 665 1458:lcmp            
	//* 666 1459:ifne            1467
	//* 667 1462:ldc2w           #416 <Long 16L>
	//* 668 1465:lstore          15
	//* 669 1467:lload           15
	//* 670 1469:l2i             
	//* 671 1470:iconst_4        
	//* 672 1471:imul            
	//* 673 1472:istore_3        
	//* 674 1473:goto            1158
	//* 675 1476:lload           13
	//* 676 1478:lstore          15
	//* 677 1480:lload           13
	//* 678 1482:lconst_0        
	//* 679 1483:lcmp            
	//* 680 1484:ifne            1492
	//* 681 1487:ldc2w           #418 <Long 256L>
	//* 682 1490:lstore          15
	//* 683 1492:lload           15
	//* 684 1494:l2i             
	//* 685 1495:iconst_4        
	//* 686 1496:imul            
	//* 687 1497:istore_3        
	//* 688 1498:goto            1158
	//* 689 1501:aload_0         
	//* 690 1502:getfield        #347 <Field int bitsPerPixel>
	//* 691 1505:bipush          16
	//* 692 1507:icmpne          1682
	//* 693 1510:aload_0         
	//* 694 1511:bipush          8
	//* 695 1513:putfield        #108 <Field int imageType>
	//* 696 1516:aload_0         
	//* 697 1517:aload_0         
	//* 698 1518:aload_0         
	//* 699 1519:getfield        #279 <Field InputStream inputStream>
	//* 700 1522:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 701 1525:l2i             
	//* 702 1526:putfield        #257 <Field int redMask>
	//* 703 1529:aload_0         
	//* 704 1530:aload_0         
	//* 705 1531:aload_0         
	//* 706 1532:getfield        #279 <Field InputStream inputStream>
	//* 707 1535:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 708 1538:l2i             
	//* 709 1539:putfield        #263 <Field int greenMask>
	//* 710 1542:aload_0         
	//* 711 1543:aload_0         
	//* 712 1544:aload_0         
	//* 713 1545:getfield        #279 <Field InputStream inputStream>
	//* 714 1548:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 715 1551:l2i             
	//* 716 1552:putfield        #265 <Field int blueMask>
	//* 717 1555:lload           17
	//* 718 1557:ldc2w           #389 <Long 56L>
	//* 719 1560:lcmp            
	//* 720 1561:ifne            1595
	//* 721 1564:aload_0         
	//* 722 1565:aload_0         
	//* 723 1566:aload_0         
	//* 724 1567:getfield        #279 <Field InputStream inputStream>
	//* 725 1570:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 726 1573:l2i             
	//* 727 1574:putfield        #405 <Field int alphaMask>
	//* 728 1577:aload_0         
	//* 729 1578:getfield        #81  <Field HashMap properties>
	//* 730 1581:ldc2            #407 <String "alpha_mask">
	//* 731 1584:aload_0         
	//* 732 1585:getfield        #405 <Field int alphaMask>
	//* 733 1588:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 734 1591:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 735 1594:pop             
	//* 736 1595:aload_0         
	//* 737 1596:getfield        #81  <Field HashMap properties>
	//* 738 1599:ldc2            #399 <String "red_mask">
	//* 739 1602:aload_0         
	//* 740 1603:getfield        #257 <Field int redMask>
	//* 741 1606:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 742 1609:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 743 1612:pop             
	//* 744 1613:aload_0         
	//* 745 1614:getfield        #81  <Field HashMap properties>
	//* 746 1617:ldc2            #401 <String "green_mask">
	//* 747 1620:aload_0         
	//* 748 1621:getfield        #263 <Field int greenMask>
	//* 749 1624:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 750 1627:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 751 1630:pop             
	//* 752 1631:aload_0         
	//* 753 1632:getfield        #81  <Field HashMap properties>
	//* 754 1635:ldc2            #403 <String "blue_mask">
	//* 755 1638:aload_0         
	//* 756 1639:getfield        #265 <Field int blueMask>
	//* 757 1642:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 758 1645:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 759 1648:pop             
	//* 760 1649:lload           13
	//* 761 1651:lconst_0        
	//* 762 1652:lcmp            
	//* 763 1653:ifeq            1665
	//* 764 1656:aload_0         
	//* 765 1657:lload           13
	//* 766 1659:l2i             
	//* 767 1660:iconst_4        
	//* 768 1661:imul            
	//* 769 1662:invokespecial   #369 <Method void readPalette(int)>
	//* 770 1665:aload_0         
	//* 771 1666:getfield        #81  <Field HashMap properties>
	//* 772 1669:ldc2            #361 <String "bmp_version">
	//* 773 1672:ldc2            #421 <String "BMP v. 3.x NT">
	//* 774 1675:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 775 1678:pop             
	//* 776 1679:goto            358
	//* 777 1682:aload_0         
	//* 778 1683:getfield        #347 <Field int bitsPerPixel>
	//* 779 1686:bipush          32
	//* 780 1688:icmpne          1516
	//* 781 1691:aload_0         
	//* 782 1692:bipush          9
	//* 783 1694:putfield        #108 <Field int imageType>
	//* 784 1697:goto            1516
	//* 785 1700:lload           17
	//* 786 1702:ldc2w           #422 <Long 108L>
	//* 787 1705:lcmp            
	//* 788 1706:ifne            2579
	//* 789 1709:aload_0         
	//* 790 1710:getfield        #81  <Field HashMap properties>
	//* 791 1713:ldc2            #361 <String "bmp_version">
	//* 792 1716:ldc2            #425 <String "BMP v. 4.x">
	//* 793 1719:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 794 1722:pop             
	//* 795 1723:aload_0         
	//* 796 1724:aload_0         
	//* 797 1725:aload_0         
	//* 798 1726:getfield        #279 <Field InputStream inputStream>
	//* 799 1729:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 800 1732:l2i             
	//* 801 1733:putfield        #257 <Field int redMask>
	//* 802 1736:aload_0         
	//* 803 1737:aload_0         
	//* 804 1738:aload_0         
	//* 805 1739:getfield        #279 <Field InputStream inputStream>
	//* 806 1742:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 807 1745:l2i             
	//* 808 1746:putfield        #263 <Field int greenMask>
	//* 809 1749:aload_0         
	//* 810 1750:aload_0         
	//* 811 1751:aload_0         
	//* 812 1752:getfield        #279 <Field InputStream inputStream>
	//* 813 1755:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 814 1758:l2i             
	//* 815 1759:putfield        #265 <Field int blueMask>
	//* 816 1762:aload_0         
	//* 817 1763:aload_0         
	//* 818 1764:aload_0         
	//* 819 1765:getfield        #279 <Field InputStream inputStream>
	//* 820 1768:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 821 1771:l2i             
	//* 822 1772:putfield        #405 <Field int alphaMask>
	//* 823 1775:aload_0         
	//* 824 1776:aload_0         
	//* 825 1777:getfield        #279 <Field InputStream inputStream>
	//* 826 1780:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 827 1783:lstore          19
	//* 828 1785:aload_0         
	//* 829 1786:aload_0         
	//* 830 1787:getfield        #279 <Field InputStream inputStream>
	//* 831 1790:invokespecial   #371 <Method int readLong(InputStream)>
	//* 832 1793:istore          4
	//* 833 1795:aload_0         
	//* 834 1796:aload_0         
	//* 835 1797:getfield        #279 <Field InputStream inputStream>
	//* 836 1800:invokespecial   #371 <Method int readLong(InputStream)>
	//* 837 1803:istore          5
	//* 838 1805:aload_0         
	//* 839 1806:aload_0         
	//* 840 1807:getfield        #279 <Field InputStream inputStream>
	//* 841 1810:invokespecial   #371 <Method int readLong(InputStream)>
	//* 842 1813:istore          6
	//* 843 1815:aload_0         
	//* 844 1816:aload_0         
	//* 845 1817:getfield        #279 <Field InputStream inputStream>
	//* 846 1820:invokespecial   #371 <Method int readLong(InputStream)>
	//* 847 1823:istore          7
	//* 848 1825:aload_0         
	//* 849 1826:aload_0         
	//* 850 1827:getfield        #279 <Field InputStream inputStream>
	//* 851 1830:invokespecial   #371 <Method int readLong(InputStream)>
	//* 852 1833:istore          8
	//* 853 1835:aload_0         
	//* 854 1836:aload_0         
	//* 855 1837:getfield        #279 <Field InputStream inputStream>
	//* 856 1840:invokespecial   #371 <Method int readLong(InputStream)>
	//* 857 1843:istore          9
	//* 858 1845:aload_0         
	//* 859 1846:aload_0         
	//* 860 1847:getfield        #279 <Field InputStream inputStream>
	//* 861 1850:invokespecial   #371 <Method int readLong(InputStream)>
	//* 862 1853:istore          10
	//* 863 1855:aload_0         
	//* 864 1856:aload_0         
	//* 865 1857:getfield        #279 <Field InputStream inputStream>
	//* 866 1860:invokespecial   #371 <Method int readLong(InputStream)>
	//* 867 1863:istore          11
	//* 868 1865:aload_0         
	//* 869 1866:aload_0         
	//* 870 1867:getfield        #279 <Field InputStream inputStream>
	//* 871 1870:invokespecial   #371 <Method int readLong(InputStream)>
	//* 872 1873:istore          12
	//* 873 1875:aload_0         
	//* 874 1876:aload_0         
	//* 875 1877:getfield        #279 <Field InputStream inputStream>
	//* 876 1880:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 877 1883:lstore          21
	//* 878 1885:aload_0         
	//* 879 1886:aload_0         
	//* 880 1887:getfield        #279 <Field InputStream inputStream>
	//* 881 1890:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 882 1893:lstore          23
	//* 883 1895:aload_0         
	//* 884 1896:aload_0         
	//* 885 1897:getfield        #279 <Field InputStream inputStream>
	//* 886 1900:invokespecial   #283 <Method long readDWord(InputStream)>
	//* 887 1903:lstore          25
	//* 888 1905:aload_0         
	//* 889 1906:getfield        #347 <Field int bitsPerPixel>
	//* 890 1909:iconst_1        
	//* 891 1910:icmpne          2316
	//* 892 1913:aload_0         
	//* 893 1914:bipush          10
	//* 894 1916:putfield        #108 <Field int imageType>
	//* 895 1919:aload_0         
	//* 896 1920:getfield        #81  <Field HashMap properties>
	//* 897 1923:ldc2            #399 <String "red_mask">
	//* 898 1926:aload_0         
	//* 899 1927:getfield        #257 <Field int redMask>
	//* 900 1930:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 901 1933:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 902 1936:pop             
	//* 903 1937:aload_0         
	//* 904 1938:getfield        #81  <Field HashMap properties>
	//* 905 1941:ldc2            #401 <String "green_mask">
	//* 906 1944:aload_0         
	//* 907 1945:getfield        #263 <Field int greenMask>
	//* 908 1948:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 909 1951:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 910 1954:pop             
	//* 911 1955:aload_0         
	//* 912 1956:getfield        #81  <Field HashMap properties>
	//* 913 1959:ldc2            #403 <String "blue_mask">
	//* 914 1962:aload_0         
	//* 915 1963:getfield        #265 <Field int blueMask>
	//* 916 1966:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 917 1969:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 918 1972:pop             
	//* 919 1973:aload_0         
	//* 920 1974:getfield        #81  <Field HashMap properties>
	//* 921 1977:ldc2            #407 <String "alpha_mask">
	//* 922 1980:aload_0         
	//* 923 1981:getfield        #405 <Field int alphaMask>
	//* 924 1984:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 925 1987:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 926 1990:pop             
	//* 927 1991:aload_0         
	//* 928 1992:getfield        #85  <Field long bitmapOffset>
	//* 929 1995:ldc2w           #364 <Long 14L>
	//* 930 1998:lsub            
	//* 931 1999:lload           17
	//* 932 2001:lsub            
	//* 933 2002:ldc2w           #408 <Long 4L>
	//* 934 2005:ldiv            
	//* 935 2006:l2i             
	//* 936 2007:iconst_4        
	//* 937 2008:imul            
	//* 938 2009:istore_3        
	//* 939 2010:aload_0         
	//* 940 2011:getfield        #85  <Field long bitmapOffset>
	//* 941 2014:lload           17
	//* 942 2016:lcmp            
	//* 943 2017:ifne            2063
	//* 944 2020:aload_0         
	//* 945 2021:getfield        #108 <Field int imageType>
	//* 946 2024:tableswitch     10 12: default 2052
	//	               10 2462
	//	               11 2487
	//	               12 2512
	//* 947 2052:iconst_0        
	//* 948 2053:istore_3        
	//* 949 2054:aload_0         
	//* 950 2055:iload_3         
	//* 951 2056:i2l             
	//* 952 2057:lload           17
	//* 953 2059:ladd            
	//* 954 2060:putfield        #85  <Field long bitmapOffset>
	//* 955 2063:aload_0         
	//* 956 2064:iload_3         
	//* 957 2065:invokespecial   #369 <Method void readPalette(int)>
	//* 958 2068:lload           19
	//* 959 2070:l2i             
	//* 960 2071:tableswitch     0 2: default 2096
	//	               0 2099
	//	               1 2537
	//	               2 2554
	//* 961 2096:goto            358
	//* 962 2099:aload_0         
	//* 963 2100:getfield        #81  <Field HashMap properties>
	//* 964 2103:ldc2            #427 <String "color_space">
	//* 965 2106:ldc2            #428 <String "LCS_CALIBRATED_RGB">
	//* 966 2109:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 967 2112:pop             
	//* 968 2113:aload_0         
	//* 969 2114:getfield        #81  <Field HashMap properties>
	//* 970 2117:ldc2            #430 <String "redX">
	//* 971 2120:iload           4
	//* 972 2122:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 973 2125:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 974 2128:pop             
	//* 975 2129:aload_0         
	//* 976 2130:getfield        #81  <Field HashMap properties>
	//* 977 2133:ldc2            #432 <String "redY">
	//* 978 2136:iload           5
	//* 979 2138:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 980 2141:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 981 2144:pop             
	//* 982 2145:aload_0         
	//* 983 2146:getfield        #81  <Field HashMap properties>
	//* 984 2149:ldc2            #434 <String "redZ">
	//* 985 2152:iload           6
	//* 986 2154:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 987 2157:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 988 2160:pop             
	//* 989 2161:aload_0         
	//* 990 2162:getfield        #81  <Field HashMap properties>
	//* 991 2165:ldc2            #436 <String "greenX">
	//* 992 2168:iload           7
	//* 993 2170:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//* 994 2173:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//* 995 2176:pop             
	//* 996 2177:aload_0         
	//* 997 2178:getfield        #81  <Field HashMap properties>
	//* 998 2181:ldc2            #438 <String "greenY">
	//* 999 2184:iload           8
	//*1000 2186:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//*1001 2189:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1002 2192:pop             
	//*1003 2193:aload_0         
	//*1004 2194:getfield        #81  <Field HashMap properties>
	//*1005 2197:ldc2            #440 <String "greenZ">
	//*1006 2200:iload           9
	//*1007 2202:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//*1008 2205:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1009 2208:pop             
	//*1010 2209:aload_0         
	//*1011 2210:getfield        #81  <Field HashMap properties>
	//*1012 2213:ldc2            #442 <String "blueX">
	//*1013 2216:iload           10
	//*1014 2218:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//*1015 2221:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1016 2224:pop             
	//*1017 2225:aload_0         
	//*1018 2226:getfield        #81  <Field HashMap properties>
	//*1019 2229:ldc2            #444 <String "blueY">
	//*1020 2232:iload           11
	//*1021 2234:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//*1022 2237:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1023 2240:pop             
	//*1024 2241:aload_0         
	//*1025 2242:getfield        #81  <Field HashMap properties>
	//*1026 2245:ldc2            #446 <String "blueZ">
	//*1027 2248:iload           12
	//*1028 2250:invokestatic    #355 <Method Integer Integer.valueOf(int)>
	//*1029 2253:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1030 2256:pop             
	//*1031 2257:aload_0         
	//*1032 2258:getfield        #81  <Field HashMap properties>
	//*1033 2261:ldc2            #448 <String "gamma_red">
	//*1034 2264:lload           21
	//*1035 2266:invokestatic    #378 <Method Long Long.valueOf(long)>
	//*1036 2269:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1037 2272:pop             
	//*1038 2273:aload_0         
	//*1039 2274:getfield        #81  <Field HashMap properties>
	//*1040 2277:ldc2            #450 <String "gamma_green">
	//*1041 2280:lload           23
	//*1042 2282:invokestatic    #378 <Method Long Long.valueOf(long)>
	//*1043 2285:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1044 2288:pop             
	//*1045 2289:aload_0         
	//*1046 2290:getfield        #81  <Field HashMap properties>
	//*1047 2293:ldc2            #452 <String "gamma_blue">
	//*1048 2296:lload           25
	//*1049 2298:invokestatic    #378 <Method Long Long.valueOf(long)>
	//*1050 2301:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1051 2304:pop             
	//*1052 2305:new             #95  <Class RuntimeException>
	//*1053 2308:dup             
	//*1054 2309:ldc2            #454 <String "Not implemented yet.">
	//*1055 2312:invokespecial   #134 <Method void RuntimeException(String)>
	//*1056 2315:athrow          
	//*1057 2316:aload_0         
	//*1058 2317:getfield        #347 <Field int bitsPerPixel>
	//*1059 2320:iconst_4        
	//*1060 2321:icmpne          2333
	//*1061 2324:aload_0         
	//*1062 2325:bipush          11
	//*1063 2327:putfield        #108 <Field int imageType>
	//*1064 2330:goto            1919
	//*1065 2333:aload_0         
	//*1066 2334:getfield        #347 <Field int bitsPerPixel>
	//*1067 2337:bipush          8
	//*1068 2339:icmpne          2351
	//*1069 2342:aload_0         
	//*1070 2343:bipush          12
	//*1071 2345:putfield        #108 <Field int imageType>
	//*1072 2348:goto            1919
	//*1073 2351:aload_0         
	//*1074 2352:getfield        #347 <Field int bitsPerPixel>
	//*1075 2355:bipush          16
	//*1076 2357:icmpne          2397
	//*1077 2360:aload_0         
	//*1078 2361:bipush          13
	//*1079 2363:putfield        #108 <Field int imageType>
	//*1080 2366:aload_0         
	//*1081 2367:getfield        #129 <Field long compression>
	//*1082 2370:l2i             
	//*1083 2371:ifne            1919
	//*1084 2374:aload_0         
	//*1085 2375:sipush          31744
	//*1086 2378:putfield        #257 <Field int redMask>
	//*1087 2381:aload_0         
	//*1088 2382:sipush          992
	//*1089 2385:putfield        #263 <Field int greenMask>
	//*1090 2388:aload_0         
	//*1091 2389:bipush          31
	//*1092 2391:putfield        #265 <Field int blueMask>
	//*1093 2394:goto            1919
	//*1094 2397:aload_0         
	//*1095 2398:getfield        #347 <Field int bitsPerPixel>
	//*1096 2401:bipush          24
	//*1097 2403:icmpne          2415
	//*1098 2406:aload_0         
	//*1099 2407:bipush          14
	//*1100 2409:putfield        #108 <Field int imageType>
	//*1101 2412:goto            1919
	//*1102 2415:aload_0         
	//*1103 2416:getfield        #347 <Field int bitsPerPixel>
	//*1104 2419:bipush          32
	//*1105 2421:icmpne          1919
	//*1106 2424:aload_0         
	//*1107 2425:bipush          15
	//*1108 2427:putfield        #108 <Field int imageType>
	//*1109 2430:aload_0         
	//*1110 2431:getfield        #129 <Field long compression>
	//*1111 2434:l2i             
	//*1112 2435:ifne            1919
	//*1113 2438:aload_0         
	//*1114 2439:ldc2            #412 <Int 0xff0000>
	//*1115 2442:putfield        #257 <Field int redMask>
	//*1116 2445:aload_0         
	//*1117 2446:ldc2            #413 <Int 65280>
	//*1118 2449:putfield        #263 <Field int greenMask>
	//*1119 2452:aload_0         
	//*1120 2453:sipush          255
	//*1121 2456:putfield        #265 <Field int blueMask>
	//*1122 2459:goto            1919
	//*1123 2462:lload           13
	//*1124 2464:lstore          15
	//*1125 2466:lload           13
	//*1126 2468:lconst_0        
	//*1127 2469:lcmp            
	//*1128 2470:ifne            2478
	//*1129 2473:ldc2w           #414 <Long 2L>
	//*1130 2476:lstore          15
	//*1131 2478:lload           15
	//*1132 2480:l2i             
	//*1133 2481:iconst_4        
	//*1134 2482:imul            
	//*1135 2483:istore_3        
	//*1136 2484:goto            2054
	//*1137 2487:lload           13
	//*1138 2489:lstore          15
	//*1139 2491:lload           13
	//*1140 2493:lconst_0        
	//*1141 2494:lcmp            
	//*1142 2495:ifne            2503
	//*1143 2498:ldc2w           #416 <Long 16L>
	//*1144 2501:lstore          15
	//*1145 2503:lload           15
	//*1146 2505:l2i             
	//*1147 2506:iconst_4        
	//*1148 2507:imul            
	//*1149 2508:istore_3        
	//*1150 2509:goto            2054
	//*1151 2512:lload           13
	//*1152 2514:lstore          15
	//*1153 2516:lload           13
	//*1154 2518:lconst_0        
	//*1155 2519:lcmp            
	//*1156 2520:ifne            2528
	//*1157 2523:ldc2w           #418 <Long 256L>
	//*1158 2526:lstore          15
	//*1159 2528:lload           15
	//*1160 2530:l2i             
	//*1161 2531:iconst_4        
	//*1162 2532:imul            
	//*1163 2533:istore_3        
	//*1164 2534:goto            2054
	//*1165 2537:aload_0         
	//*1166 2538:getfield        #81  <Field HashMap properties>
	//*1167 2541:ldc2            #427 <String "color_space">
	//*1168 2544:ldc2            #455 <String "LCS_sRGB">
	//*1169 2547:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1170 2550:pop             
	//*1171 2551:goto            358
	//*1172 2554:aload_0         
	//*1173 2555:getfield        #81  <Field HashMap properties>
	//*1174 2558:ldc2            #427 <String "color_space">
	//*1175 2561:ldc2            #456 <String "LCS_CMYK">
	//*1176 2564:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1177 2567:pop             
	//*1178 2568:new             #95  <Class RuntimeException>
	//*1179 2571:dup             
	//*1180 2572:ldc2            #454 <String "Not implemented yet.">
	//*1181 2575:invokespecial   #134 <Method void RuntimeException(String)>
	//*1182 2578:athrow          
	//*1183 2579:aload_0         
	//*1184 2580:getfield        #81  <Field HashMap properties>
	//*1185 2583:ldc2            #361 <String "bmp_version">
	//*1186 2586:ldc2            #458 <String "BMP v. 5.x">
	//*1187 2589:invokevirtual   #327 <Method Object HashMap.put(Object, Object)>
	//*1188 2592:pop             
	//*1189 2593:new             #95  <Class RuntimeException>
	//*1190 2596:dup             
	//*1191 2597:ldc2            #460 <String "BMP version 5 not implemented yet.">
	//*1192 2600:invokespecial   #134 <Method void RuntimeException(String)>
	//*1193 2603:athrow          
		{
			isBottomUp = false;
	// 1194 2604:aload_0         
	// 1195 2605:iconst_0        
	// 1196 2606:putfield        #277 <Field boolean isBottomUp>
			height = Math.abs(height);
	// 1197 2609:aload_0         
	// 1198 2610:aload_0         
	// 1199 2611:getfield        #99  <Field int height>
	// 1200 2614:invokestatic    #463 <Method int Math.abs(int)>
	// 1201 2617:putfield        #99  <Field int height>
		}
		if(bitsPerPixel != 1 && bitsPerPixel != 4 && bitsPerPixel != 8) goto _L13; else goto _L12
_L12:
		numBands = 1;
		int i1;
		int i2;
		int k2;
		int l2;
		int i3;
		int j3;
		int k3;
		int l3;
		int i4;
		long l4;
		long l5;
		long l7;
		long l8;
		long l9;
		long l10;
		if(imageType == 0 || imageType == 1 || imageType == 2)
		{
			l = palette.length / 3;
			i = l;
			if(l > 256)
				i = 256;
			inputstream = ((InputStream) (new byte[i]));
			abyte0 = new byte[i];
			abyte2 = new byte[i];
			for(l = 0; l < i; l++)
			{
				l1 = l * 3;
				abyte2[l] = palette[l1];
				abyte0[l] = palette[l1 + 1];
				inputstream[l] = palette[l1 + 2];
			}

		} else
	//*1202 2620:goto            370
		{
			int j1 = palette.length / 4;
	// 1203 2623:aload_0         
	// 1204 2624:getfield        #214 <Field byte[] palette>
	// 1205 2627:arraylength     
	// 1206 2628:iconst_4        
	// 1207 2629:idiv            
	// 1208 2630:istore          4
			int j = j1;
	// 1209 2632:iload           4
	// 1210 2634:istore_3        
			if(j1 > 256)
	//*1211 2635:iload           4
	//*1212 2637:sipush          256
	//*1213 2640:icmple          2647
				j = 256;
	// 1214 2643:sipush          256
	// 1215 2646:istore_3        
			inputstream = ((InputStream) (new byte[j]));
	// 1216 2647:iload_3         
	// 1217 2648:newarray        byte[]
	// 1218 2650:astore_1        
			byte abyte1[] = new byte[j];
	// 1219 2651:iload_3         
	// 1220 2652:newarray        byte[]
	// 1221 2654:astore          27
			byte abyte3[] = new byte[j];
	// 1222 2656:iload_3         
	// 1223 2657:newarray        byte[]
	// 1224 2659:astore          28
			for(int k1 = 0; k1 < j; k1++)
	//*1225 2661:iconst_0        
	//*1226 2662:istore          4
	//*1227 2664:iload           4
	//*1228 2666:iload_3         
	//*1229 2667:icmpge          2738
			{
				int j2 = k1 * 4;
	// 1230 2670:iload           4
	// 1231 2672:iconst_4        
	// 1232 2673:imul            
	// 1233 2674:istore          5
				abyte3[k1] = palette[j2];
	// 1234 2676:aload           28
	// 1235 2678:iload           4
	// 1236 2680:aload_0         
	// 1237 2681:getfield        #214 <Field byte[] palette>
	// 1238 2684:iload           5
	// 1239 2686:baload          
	// 1240 2687:bastore         
				abyte1[k1] = palette[j2 + 1];
	// 1241 2688:aload           27
	// 1242 2690:iload           4
	// 1243 2692:aload_0         
	// 1244 2693:getfield        #214 <Field byte[] palette>
	// 1245 2696:iload           5
	// 1246 2698:iconst_1        
	// 1247 2699:iadd            
	// 1248 2700:baload          
	// 1249 2701:bastore         
				inputstream[k1] = palette[j2 + 2];
	// 1250 2702:aload_1         
	// 1251 2703:iload           4
	// 1252 2705:aload_0         
	// 1253 2706:getfield        #214 <Field byte[] palette>
	// 1254 2709:iload           5
	// 1255 2711:iconst_2        
	// 1256 2712:iadd            
	// 1257 2713:baload          
	// 1258 2714:bastore         
			}

	// 1259 2715:iload           4
	// 1260 2717:iconst_1        
	// 1261 2718:iadd            
	// 1262 2719:istore          4
		}
		  goto _L14
_L4:
		if(bitsPerPixel == 4)
			imageType = 1;
		else
		if(bitsPerPixel == 8)
			imageType = 2;
		else
		if(bitsPerPixel == 24)
			imageType = 3;
		continue; /* Loop/switch isn't completed */
_L8:
		i = 6;
		  goto _L7
_L9:
		i = 48;
		  goto _L7
_L10:
		i = 768;
		  goto _L7
_L11:
		i = 0;
		  goto _L7
_L2:
		compression = readDWord(inputStream);
		imageSize = readDWord(inputStream);
		xPelsPerMeter = readLong(inputStream);
		yPelsPerMeter = readLong(inputStream);
		l4 = readDWord(inputStream);
		l5 = readDWord(inputStream);
		(int)compression;
		JVM INSTR tableswitch 0 3: default 732
	//	               0 875
	//	               1 892
	//	               2 909
	//	               3 926;
		   goto _L15 _L16 _L17 _L18 _L19
_L15:
		properties.put("x_pixels_per_meter", ((Object) (Long.valueOf(xPelsPerMeter))));
		properties.put("y_pixels_per_meter", ((Object) (Long.valueOf(yPelsPerMeter))));
		properties.put("colors_used", ((Object) (Long.valueOf(l4))));
		properties.put("colors_important", ((Object) (Long.valueOf(l5))));
		if(l6 != 40L && l6 != 52L && l6 != 56L) goto _L21; else goto _L20
_L20:
		(int)compression;
		JVM INSTR tableswitch 0 3: default 864
	//	               0 943
	//	               1 943
	//	               2 943
	//	               3 1501;
		   goto _L22 _L23 _L23 _L23 _L24
_L22:
		throw new RuntimeException("Invalid compression specified in BMP file.");
_L16:
		properties.put("compression", "BI_RGB");
		  goto _L15
_L17:
		properties.put("compression", "BI_RLE8");
		  goto _L15
_L18:
		properties.put("compression", "BI_RLE4");
		  goto _L15
_L19:
		properties.put("compression", "BI_BITFIELDS");
		  goto _L15
_L23:
		if(bitsPerPixel == 1)
			imageType = 4;
		else
		if(bitsPerPixel == 4)
			imageType = 5;
		else
		if(bitsPerPixel == 8)
			imageType = 6;
		else
		if(bitsPerPixel == 24)
			imageType = 7;
		else
		if(bitsPerPixel == 16)
		{
			imageType = 8;
			redMask = 31744;
			greenMask = 992;
			blueMask = 31;
			properties.put("red_mask", ((Object) (Integer.valueOf(redMask))));
			properties.put("green_mask", ((Object) (Integer.valueOf(greenMask))));
			properties.put("blue_mask", ((Object) (Integer.valueOf(blueMask))));
		} else
		if(bitsPerPixel == 32)
		{
			imageType = 9;
			redMask = 0xff0000;
			greenMask = 65280;
			blueMask = 255;
			properties.put("red_mask", ((Object) (Integer.valueOf(redMask))));
			properties.put("green_mask", ((Object) (Integer.valueOf(greenMask))));
			properties.put("blue_mask", ((Object) (Integer.valueOf(blueMask))));
		}
		if(l6 >= 52L)
		{
			redMask = (int)readDWord(inputStream);
			greenMask = (int)readDWord(inputStream);
			blueMask = (int)readDWord(inputStream);
			properties.put("red_mask", ((Object) (Integer.valueOf(redMask))));
			properties.put("green_mask", ((Object) (Integer.valueOf(greenMask))));
			properties.put("blue_mask", ((Object) (Integer.valueOf(blueMask))));
		}
		if(l6 == 56L)
		{
			alphaMask = (int)readDWord(inputStream);
			properties.put("alpha_mask", ((Object) (Integer.valueOf(alphaMask))));
		}
		i = (int)((bitmapOffset - 14L - l6) / 4L) * 4;
		if(bitmapOffset != l6) goto _L26; else goto _L25
_L25:
		imageType;
		JVM INSTR tableswitch 4 6: default 1156
	//	               4 1426
	//	               5 1451
	//	               6 1476;
		   goto _L27 _L28 _L29 _L30
_L27:
		i = 0;
_L32:
		bitmapOffset = (long)i + l6;
_L26:
		readPalette(i);
		properties.put("bmp_version", "BMP v. 3.x");
		  goto _L31
_L28:
		l5 = l4;
		if(l4 == 0L)
			l5 = 2L;
		i = (int)l5 * 4;
		  goto _L32
_L29:
		l5 = l4;
		if(l4 == 0L)
			l5 = 16L;
		i = (int)l5 * 4;
		  goto _L32
_L30:
		l5 = l4;
		if(l4 == 0L)
			l5 = 256L;
		i = (int)l5 * 4;
		  goto _L32
_L24:
		if(bitsPerPixel == 16)
			imageType = 8;
		else
		if(bitsPerPixel == 32)
			imageType = 9;
		redMask = (int)readDWord(inputStream);
		greenMask = (int)readDWord(inputStream);
		blueMask = (int)readDWord(inputStream);
		if(l6 == 56L)
		{
			alphaMask = (int)readDWord(inputStream);
			properties.put("alpha_mask", ((Object) (Integer.valueOf(alphaMask))));
		}
		properties.put("red_mask", ((Object) (Integer.valueOf(redMask))));
		properties.put("green_mask", ((Object) (Integer.valueOf(greenMask))));
		properties.put("blue_mask", ((Object) (Integer.valueOf(blueMask))));
		if(l4 != 0L)
			readPalette((int)l4 * 4);
		properties.put("bmp_version", "BMP v. 3.x NT");
		  goto _L31
_L21:
		if(l6 != 108L) goto _L34; else goto _L33
_L33:
		properties.put("bmp_version", "BMP v. 4.x");
		redMask = (int)readDWord(inputStream);
		greenMask = (int)readDWord(inputStream);
		blueMask = (int)readDWord(inputStream);
		alphaMask = (int)readDWord(inputStream);
		l7 = readDWord(inputStream);
		i1 = readLong(inputStream);
		i2 = readLong(inputStream);
		k2 = readLong(inputStream);
		l2 = readLong(inputStream);
		i3 = readLong(inputStream);
		j3 = readLong(inputStream);
		k3 = readLong(inputStream);
		l3 = readLong(inputStream);
		i4 = readLong(inputStream);
		l8 = readDWord(inputStream);
		l9 = readDWord(inputStream);
		l10 = readDWord(inputStream);
		if(bitsPerPixel == 1)
			imageType = 10;
		else
		if(bitsPerPixel == 4)
			imageType = 11;
		else
		if(bitsPerPixel == 8)
			imageType = 12;
		else
		if(bitsPerPixel == 16)
		{
			imageType = 13;
			if((int)compression == 0)
			{
				redMask = 31744;
				greenMask = 992;
				blueMask = 31;
			}
		} else
		if(bitsPerPixel == 24)
			imageType = 14;
		else
		if(bitsPerPixel == 32)
		{
			imageType = 15;
			if((int)compression == 0)
			{
				redMask = 0xff0000;
				greenMask = 65280;
				blueMask = 255;
			}
		}
		properties.put("red_mask", ((Object) (Integer.valueOf(redMask))));
		properties.put("green_mask", ((Object) (Integer.valueOf(greenMask))));
		properties.put("blue_mask", ((Object) (Integer.valueOf(blueMask))));
		properties.put("alpha_mask", ((Object) (Integer.valueOf(alphaMask))));
		i = (int)((bitmapOffset - 14L - l6) / 4L) * 4;
		if(bitmapOffset != l6) goto _L36; else goto _L35
_L35:
		imageType;
		JVM INSTR tableswitch 10 12: default 2052
	//	               10 2462
	//	               11 2487
	//	               12 2512;
		   goto _L37 _L38 _L39 _L40
_L37:
		i = 0;
_L41:
		bitmapOffset = (long)i + l6;
_L36:
		readPalette(i);
		switch((int)l7)
		{
		case 0: // '\0'
			properties.put("color_space", "LCS_CALIBRATED_RGB");
			properties.put("redX", ((Object) (Integer.valueOf(i1))));
			properties.put("redY", ((Object) (Integer.valueOf(i2))));
			properties.put("redZ", ((Object) (Integer.valueOf(k2))));
			properties.put("greenX", ((Object) (Integer.valueOf(l2))));
			properties.put("greenY", ((Object) (Integer.valueOf(i3))));
			properties.put("greenZ", ((Object) (Integer.valueOf(j3))));
			properties.put("blueX", ((Object) (Integer.valueOf(k3))));
			properties.put("blueY", ((Object) (Integer.valueOf(l3))));
			properties.put("blueZ", ((Object) (Integer.valueOf(i4))));
			properties.put("gamma_red", ((Object) (Long.valueOf(l8))));
			properties.put("gamma_green", ((Object) (Long.valueOf(l9))));
			properties.put("gamma_blue", ((Object) (Long.valueOf(l10))));
			throw new RuntimeException("Not implemented yet.");

		case 1: // '\001'
			properties.put("color_space", "LCS_sRGB");
			break;

		case 2: // '\002'
			properties.put("color_space", "LCS_CMYK");
			throw new RuntimeException("Not implemented yet.");
		}
		  goto _L31
_L38:
		l5 = l4;
		if(l4 == 0L)
			l5 = 2L;
		i = (int)l5 * 4;
		  goto _L41
_L39:
		l5 = l4;
		if(l4 == 0L)
			l5 = 16L;
		i = (int)l5 * 4;
		  goto _L41
_L40:
		l5 = l4;
		if(l4 == 0L)
			l5 = 256L;
		i = (int)l5 * 4;
		  goto _L41
_L34:
		properties.put("bmp_version", "BMP v. 5.x");
		throw new RuntimeException("BMP version 5 not implemented yet.");
	//*1263 2721:goto            2664
_L13:
		if(bitsPerPixel != 16) goto _L43; else goto _L42
	// 1264 2724:aload_0         
	// 1265 2725:getfield        #347 <Field int bitsPerPixel>
	// 1266 2728:bipush          16
	// 1267 2730:icmpne          2739
_L42:
		numBands = 3;
	// 1268 2733:aload_0         
	// 1269 2734:iconst_3        
	// 1270 2735:putfield        #359 <Field int numBands>
_L14:
		return;
	// 1271 2738:return          
_L43:
		if(bitsPerPixel == 32)
	//*1272 2739:aload_0         
	//*1273 2740:getfield        #347 <Field int bitsPerPixel>
	//*1274 2743:bipush          32
	//*1275 2745:icmpne          2768
		{
			int k;
			if(alphaMask == 0)
	//*1276 2748:aload_0         
	//*1277 2749:getfield        #405 <Field int alphaMask>
	//*1278 2752:ifne            2763
				k = 3;
	// 1279 2755:iconst_3        
	// 1280 2756:istore_3        
			else
	//*1281 2757:aload_0         
	//*1282 2758:iload_3         
	//*1283 2759:putfield        #359 <Field int numBands>
	//*1284 2762:return          
				k = 4;
	// 1285 2763:iconst_4        
	// 1286 2764:istore_3        
			numBands = k;
			return;
		}
	//*1287 2765:goto            2757
		numBands = 3;
	// 1288 2768:aload_0         
	// 1289 2769:iconst_3        
	// 1290 2770:putfield        #359 <Field int numBands>
		return;
	// 1291 2773:return          
		if(true) goto _L45; else goto _L44
_L44:
	}

	private static final int BI_BITFIELDS = 3;
	private static final int BI_RGB = 0;
	private static final int BI_RLE4 = 2;
	private static final int BI_RLE8 = 1;
	private static final int LCS_CALIBRATED_RGB = 0;
	private static final int LCS_CMYK = 2;
	private static final int LCS_sRGB = 1;
	private static final int VERSION_2_1_BIT = 0;
	private static final int VERSION_2_24_BIT = 3;
	private static final int VERSION_2_4_BIT = 1;
	private static final int VERSION_2_8_BIT = 2;
	private static final int VERSION_3_1_BIT = 4;
	private static final int VERSION_3_24_BIT = 7;
	private static final int VERSION_3_4_BIT = 5;
	private static final int VERSION_3_8_BIT = 6;
	private static final int VERSION_3_NT_16_BIT = 8;
	private static final int VERSION_3_NT_32_BIT = 9;
	private static final int VERSION_4_16_BIT = 13;
	private static final int VERSION_4_1_BIT = 10;
	private static final int VERSION_4_24_BIT = 14;
	private static final int VERSION_4_32_BIT = 15;
	private static final int VERSION_4_4_BIT = 11;
	private static final int VERSION_4_8_BIT = 12;
	private int alphaMask;
	private long bitmapFileSize;
	private long bitmapOffset;
	private int bitsPerPixel;
	private int blueMask;
	private long compression;
	private int greenMask;
	int height;
	private long imageSize;
	private int imageType;
	private InputStream inputStream;
	private boolean isBottomUp;
	private int numBands;
	private byte palette[];
	public HashMap properties;
	private int redMask;
	int width;
	private long xPelsPerMeter;
	private long yPelsPerMeter;
}
