// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.cmaps;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.*;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.text.pdf.fonts.cmaps:
//			CidLocation, AbstractCMap

public class CMapParserEx
{

	public CMapParserEx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	private static void encodeSequence(int i, byte abyte0[], char c, ArrayList arraylist)
	{
		int l = i - 1;
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:isub            
	//    3    3:istore          7
		int j = 0;
	//    4    5:iconst_0        
	//    5    6:istore          5
		for(i = 0; i < l; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_0        
	//*   8   10:iload_0         
	//*   9   11:iload           7
	//*  10   13:icmpge          130
		{
			char ac[] = (char[])arraylist.get(j);
	//   11   16:aload_3         
	//   12   17:iload           5
	//   13   19:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//   14   22:checkcast       #53  <Class char[]>
	//   15   25:astore          9
			int i1 = abyte0[i] & 0xff;
	//   16   27:aload_1         
	//   17   28:iload_0         
	//   18   29:baload          
	//   19   30:sipush          255
	//   20   33:iand            
	//   21   34:istore          8
			j = ((int) (ac[i1]));
	//   22   36:aload           9
	//   23   38:iload           8
	//   24   40:caload          
	//   25   41:istore          5
			if(j != 0 && (j & 0x8000) == 0)
	//*  26   43:iload           5
	//*  27   45:ifeq            73
	//*  28   48:iload           5
	//*  29   50:ldc1            #54  <Int 32768>
	//*  30   52:iand            
	//*  31   53:ifne            73
				throw new RuntimeException(MessageLocalization.getComposedMessage("inconsistent.mapping", new Object[0]));
	//   32   56:new             #56  <Class RuntimeException>
	//   33   59:dup             
	//   34   60:ldc1            #58  <String "inconsistent.mapping">
	//   35   62:iconst_0        
	//   36   63:anewarray       Object[]
	//   37   66:invokestatic    #64  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   38   69:invokespecial   #65  <Method void RuntimeException(String)>
	//   39   72:athrow          
			int k = j;
	//   40   73:iload           5
	//   41   75:istore          6
			if(j == 0)
	//*  42   77:iload           5
	//*  43   79:ifne            115
			{
				arraylist.add(((Object) (new char[256])));
	//   44   82:aload_3         
	//   45   83:sipush          256
	//   46   86:newarray        char[]
	//   47   88:invokevirtual   #69  <Method boolean ArrayList.add(Object)>
	//   48   91:pop             
				char c1 = (char)(arraylist.size() - 1 | 0x8000);
	//   49   92:aload_3         
	//   50   93:invokevirtual   #73  <Method int ArrayList.size()>
	//   51   96:iconst_1        
	//   52   97:isub            
	//   53   98:ldc1            #54  <Int 32768>
	//   54  100:ior             
	//   55  101:int2char        
	//   56  102:istore          4
				ac[i1] = c1;
	//   57  104:aload           9
	//   58  106:iload           8
	//   59  108:iload           4
	//   60  110:castore         
				k = ((int) (c1));
	//   61  111:iload           4
	//   62  113:istore          6
			}
			j = k & 0x7fff;
	//   63  115:iload           6
	//   64  117:sipush          32767
	//   65  120:iand            
	//   66  121:istore          5
		}

	//   67  123:iload_0         
	//   68  124:iconst_1        
	//   69  125:iadd            
	//   70  126:istore_0        
	//*  71  127:goto            10
		arraylist = ((ArrayList) ((char[])arraylist.get(j)));
	//   72  130:aload_3         
	//   73  131:iload           5
	//   74  133:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//   75  136:checkcast       #53  <Class char[]>
	//   76  139:astore_3        
		i = abyte0[l] & 0xff;
	//   77  140:aload_1         
	//   78  141:iload           7
	//   79  143:baload          
	//   80  144:sipush          255
	//   81  147:iand            
	//   82  148:istore_0        
		if((arraylist[i] & 0x8000) != 0)
	//*  83  149:aload_3         
	//*  84  150:iload_0         
	//*  85  151:caload          
	//*  86  152:ldc1            #54  <Int 32768>
	//*  87  154:iand            
	//*  88  155:ifeq            175
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("inconsistent.mapping", new Object[0]));
	//   89  158:new             #56  <Class RuntimeException>
	//   90  161:dup             
	//   91  162:ldc1            #58  <String "inconsistent.mapping">
	//   92  164:iconst_0        
	//   93  165:anewarray       Object[]
	//   94  168:invokestatic    #64  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   95  171:invokespecial   #65  <Method void RuntimeException(String)>
	//   96  174:athrow          
		} else
		{
			arraylist[i] = c;
	//   97  175:aload_3         
	//   98  176:iload_0         
	//   99  177:iload_2         
	//  100  178:castore         
			return;
	//  101  179:return          
		}
	}

	public static void parseCid(String s, AbstractCMap abstractcmap, CidLocation cidlocation)
		throws IOException
	{
		parseCid(s, abstractcmap, cidlocation, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #82  <Method void parseCid(String, AbstractCMap, CidLocation, int)>
	//    5    7:return          
	}

	private static void parseCid(String s, AbstractCMap abstractcmap, CidLocation cidlocation, int i)
		throws IOException
	{
		if(i >= 10)
	//*   0    0:iload_3         
	//*   1    1:bipush          10
	//*   2    3:icmplt          7
			return;
	//    3    6:return          
		s = ((String) (cidlocation.getLocation(s)));
	//    4    7:aload_2         
	//    5    8:aload_0         
	//    6    9:invokeinterface #91  <Method PRTokeniser CidLocation.getLocation(String)>
	//    7   14:astore_0        
		ArrayList arraylist;
		PdfContentParser pdfcontentparser;
		arraylist = new ArrayList();
	//    8   15:new             #47  <Class ArrayList>
	//    9   18:dup             
	//   10   19:invokespecial   #92  <Method void ArrayList()>
	//   11   22:astore          8
		pdfcontentparser = new PdfContentParser(((PRTokeniser) (s)));
	//   12   24:new             #94  <Class PdfContentParser>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #97  <Method void PdfContentParser(PRTokeniser)>
	//   16   32:astore          9
		int j = 50;
	//   17   34:bipush          50
	//   18   36:istore          4
_L3:
		pdfcontentparser.parse(arraylist);
	//   19   38:aload           9
	//   20   40:aload           8
	//   21   42:invokevirtual   #101 <Method ArrayList PdfContentParser.parse(ArrayList)>
	//   22   45:pop             
		boolean flag = arraylist.isEmpty();
	//   23   46:aload           8
	//   24   48:invokevirtual   #105 <Method boolean ArrayList.isEmpty()>
	//   25   51:istore          7
		if(!flag) goto _L2; else goto _L1
	//   26   53:iload           7
	//   27   55:ifeq            83
_L1:
		((PRTokeniser) (s)).close();
	//   28   58:aload_0         
	//   29   59:invokevirtual   #110 <Method void PRTokeniser.close()>
		return;
	//   30   62:return          
		Exception exception;
		exception;
	//   31   63:astore          10
		int k;
		k = j - 1;
	//   32   65:iload           4
	//   33   67:iconst_1        
	//   34   68:isub            
	//   35   69:istore          5
		j = k;
	//   36   71:iload           5
	//   37   73:istore          4
		if(k >= 0) goto _L3; else goto _L1
	//   38   75:iload           5
	//   39   77:ifge            38
	//*  40   80:goto            58
_L2:
		Object obj = ((Object) (((PdfObject)arraylist.get(arraylist.size() - 1)).toString()));
	//   41   83:aload           8
	//   42   85:aload           8
	//   43   87:invokevirtual   #73  <Method int ArrayList.size()>
	//   44   90:iconst_1        
	//   45   91:isub            
	//   46   92:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//   47   95:checkcast       #112 <Class PdfObject>
	//   48   98:invokevirtual   #116 <Method String PdfObject.toString()>
	//   49  101:astore          10
		if(i != 0)
			break MISSING_BLOCK_LABEL_273;
	//   50  103:iload_3         
	//   51  104:ifne            273
		if(arraylist.size() != 3 || !((String) (obj)).equals("def"))
			break MISSING_BLOCK_LABEL_273;
	//   52  107:aload           8
	//   53  109:invokevirtual   #73  <Method int ArrayList.size()>
	//   54  112:iconst_3        
	//   55  113:icmpne          273
	//   56  116:aload           10
	//   57  118:ldc1            #10  <String "def">
	//   58  120:invokevirtual   #121 <Method boolean String.equals(Object)>
	//   59  123:ifeq            273
		obj = ((Object) ((PdfObject)arraylist.get(0)));
	//   60  126:aload           8
	//   61  128:iconst_0        
	//   62  129:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//   63  132:checkcast       #112 <Class PdfObject>
	//   64  135:astore          10
		if(!PdfName.REGISTRY.equals(obj))
			break MISSING_BLOCK_LABEL_174;
	//   65  137:getstatic       #124 <Field PdfName PdfName.REGISTRY>
	//   66  140:aload           10
	//   67  142:invokevirtual   #125 <Method boolean PdfName.equals(Object)>
	//   68  145:ifeq            174
		abstractcmap.setRegistry(((PdfObject)arraylist.get(1)).toString());
	//   69  148:aload_1         
	//   70  149:aload           8
	//   71  151:iconst_1        
	//   72  152:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//   73  155:checkcast       #112 <Class PdfObject>
	//   74  158:invokevirtual   #116 <Method String PdfObject.toString()>
	//   75  161:invokevirtual   #130 <Method void AbstractCMap.setRegistry(String)>
		  goto _L3
	//*  76  164:goto            38
		abstractcmap;
	//   77  167:astore_1        
		((PRTokeniser) (s)).close();
	//   78  168:aload_0         
	//   79  169:invokevirtual   #110 <Method void PRTokeniser.close()>
		throw abstractcmap;
	//   80  172:aload_1         
	//   81  173:athrow          
label0:
		{
			if(!PdfName.ORDERING.equals(obj))
				break label0;
	//   82  174:getstatic       #133 <Field PdfName PdfName.ORDERING>
	//   83  177:aload           10
	//   84  179:invokevirtual   #125 <Method boolean PdfName.equals(Object)>
	//   85  182:ifeq            204
			abstractcmap.setOrdering(((PdfObject)arraylist.get(1)).toString());
	//   86  185:aload_1         
	//   87  186:aload           8
	//   88  188:iconst_1        
	//   89  189:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//   90  192:checkcast       #112 <Class PdfObject>
	//   91  195:invokevirtual   #116 <Method String PdfObject.toString()>
	//   92  198:invokevirtual   #136 <Method void AbstractCMap.setOrdering(String)>
		}
		  goto _L3
	//*  93  201:goto            38
label1:
		{
			if(!CMAPNAME.equals(obj))
				break label1;
	//   94  204:getstatic       #40  <Field PdfName CMAPNAME>
	//   95  207:aload           10
	//   96  209:invokevirtual   #125 <Method boolean PdfName.equals(Object)>
	//   97  212:ifeq            234
			abstractcmap.setName(((PdfObject)arraylist.get(1)).toString());
	//   98  215:aload_1         
	//   99  216:aload           8
	//  100  218:iconst_1        
	//  101  219:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//  102  222:checkcast       #112 <Class PdfObject>
	//  103  225:invokevirtual   #116 <Method String PdfObject.toString()>
	//  104  228:invokevirtual   #139 <Method void AbstractCMap.setName(String)>
		}
		  goto _L3
	//* 105  231:goto            38
		flag = PdfName.SUPPLEMENT.equals(obj);
	//  106  234:getstatic       #142 <Field PdfName PdfName.SUPPLEMENT>
	//  107  237:aload           10
	//  108  239:invokevirtual   #125 <Method boolean PdfName.equals(Object)>
	//  109  242:istore          7
		if(!flag) goto _L3; else goto _L4
	//  110  244:iload           7
	//  111  246:ifeq            38
_L4:
		try
		{
			abstractcmap.setSupplement(((PdfNumber)arraylist.get(1)).intValue());
	//  112  249:aload_1         
	//  113  250:aload           8
	//  114  252:iconst_1        
	//  115  253:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//  116  256:checkcast       #144 <Class PdfNumber>
	//  117  259:invokevirtual   #147 <Method int PdfNumber.intValue()>
	//  118  262:invokevirtual   #151 <Method void AbstractCMap.setSupplement(int)>
		}
	//* 119  265:goto            38
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//  120  268:astore          10
		  goto _L3
	//* 121  270:goto            38
		if(!((String) (obj)).equals("endcidchar") && !((String) (obj)).equals("endbfchar") || arraylist.size() < 3) goto _L6; else goto _L5
	//  122  273:aload           10
	//  123  275:ldc1            #19  <String "endcidchar">
	//  124  277:invokevirtual   #121 <Method boolean String.equals(Object)>
	//  125  280:ifne            293
	//  126  283:aload           10
	//  127  285:ldc1            #13  <String "endbfchar">
	//  128  287:invokevirtual   #121 <Method boolean String.equals(Object)>
	//  129  290:ifeq            363
	//  130  293:aload           8
	//  131  295:invokevirtual   #73  <Method int ArrayList.size()>
	//  132  298:iconst_3        
	//  133  299:icmplt          363
_L5:
		int l = arraylist.size();
	//  134  302:aload           8
	//  135  304:invokevirtual   #73  <Method int ArrayList.size()>
	//  136  307:istore          6
		k = 0;
	//  137  309:iconst_0        
	//  138  310:istore          5
_L13:
		if(k >= l - 2) goto _L3; else goto _L7
	//  139  312:iload           5
	//  140  314:iload           6
	//  141  316:iconst_2        
	//  142  317:isub            
	//  143  318:icmpge          38
_L7:
		if(arraylist.get(k) instanceof PdfString)
	//* 144  321:aload           8
	//* 145  323:iload           5
	//* 146  325:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//* 147  328:instanceof      #153 <Class PdfString>
	//* 148  331:ifeq            537
			abstractcmap.addChar((PdfString)arraylist.get(k), (PdfObject)arraylist.get(k + 1));
	//  149  334:aload_1         
	//  150  335:aload           8
	//  151  337:iload           5
	//  152  339:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//  153  342:checkcast       #153 <Class PdfString>
	//  154  345:aload           8
	//  155  347:iload           5
	//  156  349:iconst_1        
	//  157  350:iadd            
	//  158  351:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//  159  354:checkcast       #112 <Class PdfObject>
	//  160  357:invokevirtual   #157 <Method void AbstractCMap.addChar(PdfString, PdfObject)>
		  goto _L8
	//* 161  360:goto            537
_L6:
		if(!((String) (obj)).equals("endcidrange") && !((String) (obj)).equals("endbfrange") || arraylist.size() < 4) goto _L10; else goto _L9
	//  162  363:aload           10
	//  163  365:ldc1            #22  <String "endcidrange">
	//  164  367:invokevirtual   #121 <Method boolean String.equals(Object)>
	//  165  370:ifne            383
	//  166  373:aload           10
	//  167  375:ldc1            #16  <String "endbfrange">
	//  168  377:invokevirtual   #121 <Method boolean String.equals(Object)>
	//  169  380:ifeq            480
	//  170  383:aload           8
	//  171  385:invokevirtual   #73  <Method int ArrayList.size()>
	//  172  388:iconst_4        
	//  173  389:icmplt          480
_L9:
		l = arraylist.size();
	//  174  392:aload           8
	//  175  394:invokevirtual   #73  <Method int ArrayList.size()>
	//  176  397:istore          6
		k = 0;
	//  177  399:iconst_0        
	//  178  400:istore          5
_L14:
		if(k >= l - 3) goto _L3; else goto _L11
	//  179  402:iload           5
	//  180  404:iload           6
	//  181  406:iconst_3        
	//  182  407:isub            
	//  183  408:icmpge          38
_L11:
		if((arraylist.get(k) instanceof PdfString) && (arraylist.get(k + 1) instanceof PdfString))
	//* 184  411:aload           8
	//* 185  413:iload           5
	//* 186  415:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//* 187  418:instanceof      #153 <Class PdfString>
	//* 188  421:ifeq            546
	//* 189  424:aload           8
	//* 190  426:iload           5
	//* 191  428:iconst_1        
	//* 192  429:iadd            
	//* 193  430:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//* 194  433:instanceof      #153 <Class PdfString>
	//* 195  436:ifeq            546
			abstractcmap.addRange((PdfString)arraylist.get(k), (PdfString)arraylist.get(k + 1), (PdfObject)arraylist.get(k + 2));
	//  196  439:aload_1         
	//  197  440:aload           8
	//  198  442:iload           5
	//  199  444:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//  200  447:checkcast       #153 <Class PdfString>
	//  201  450:aload           8
	//  202  452:iload           5
	//  203  454:iconst_1        
	//  204  455:iadd            
	//  205  456:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//  206  459:checkcast       #153 <Class PdfString>
	//  207  462:aload           8
	//  208  464:iload           5
	//  209  466:iconst_2        
	//  210  467:iadd            
	//  211  468:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//  212  471:checkcast       #112 <Class PdfObject>
	//  213  474:invokevirtual   #161 <Method void AbstractCMap.addRange(PdfString, PdfString, PdfObject)>
		break MISSING_BLOCK_LABEL_546;
	//  214  477:goto            546
_L10:
		if(!((String) (obj)).equals("usecmap") || arraylist.size() != 2 || !(arraylist.get(0) instanceof PdfName)) goto _L3; else goto _L12
	//  215  480:aload           10
	//  216  482:ldc1            #28  <String "usecmap">
	//  217  484:invokevirtual   #121 <Method boolean String.equals(Object)>
	//  218  487:ifeq            38
	//  219  490:aload           8
	//  220  492:invokevirtual   #73  <Method int ArrayList.size()>
	//  221  495:iconst_2        
	//  222  496:icmpne          38
	//  223  499:aload           8
	//  224  501:iconst_0        
	//  225  502:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//  226  505:instanceof      #32  <Class PdfName>
	//  227  508:ifeq            38
_L12:
		parseCid(PdfName.decodeName(((PdfObject)arraylist.get(0)).toString()), abstractcmap, cidlocation, i + 1);
	//  228  511:aload           8
	//  229  513:iconst_0        
	//  230  514:invokevirtual   #51  <Method Object ArrayList.get(int)>
	//  231  517:checkcast       #112 <Class PdfObject>
	//  232  520:invokevirtual   #116 <Method String PdfObject.toString()>
	//  233  523:invokestatic    #165 <Method String PdfName.decodeName(String)>
	//  234  526:aload_1         
	//  235  527:aload_2         
	//  236  528:iload_3         
	//  237  529:iconst_1        
	//  238  530:iadd            
	//  239  531:invokestatic    #82  <Method void parseCid(String, AbstractCMap, CidLocation, int)>
		  goto _L3
	//* 240  534:goto            38
_L8:
		k += 2;
	//  241  537:iload           5
	//  242  539:iconst_2        
	//  243  540:iadd            
	//  244  541:istore          5
		  goto _L13
	//* 245  543:goto            312
		k += 3;
	//  246  546:iload           5
	//  247  548:iconst_3        
	//  248  549:iadd            
	//  249  550:istore          5
		  goto _L14
	//* 250  552:goto            402
	}

	private static final PdfName CMAPNAME = new PdfName("CMapName");
	private static final String DEF = "def";
	private static final String ENDBFCHAR = "endbfchar";
	private static final String ENDBFRANGE = "endbfrange";
	private static final String ENDCIDCHAR = "endcidchar";
	private static final String ENDCIDRANGE = "endcidrange";
	private static final int MAXLEVEL = 10;
	private static final String USECMAP = "usecmap";

	static 
	{
	//    0    0:new             #32  <Class PdfName>
	//    1    3:dup             
	//    2    4:ldc1            #34  <String "CMapName">
	//    3    6:invokespecial   #38  <Method void PdfName(String)>
	//    4    9:putstatic       #40  <Field PdfName CMAPNAME>
	//*   5   12:return          
	}
}
