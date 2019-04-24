// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.xml.XMLUtil;
import com.itextpdf.text.xml.simpleparser.*;
import java.io.*;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf:
//			PdfName, PdfDictionary, PdfReader, PdfString, 
//			PdfArray, ByteBuffer, PdfNumber, PdfEncodings, 
//			PdfObject, PdfWriter, PdfNull, PdfBoolean, 
//			PdfAction, SimpleNamedDestination, IntHashtable, PRIndirectReference, 
//			PdfIndirectReference

public final class SimpleBookmark
	implements SimpleXMLDocHandler
{

	private SimpleBookmark()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Stack>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Stack()>
	//    6   12:putfield        #21  <Field Stack attr>
	//    7   15:return          
	}

	private static List bookmarkDepth(PdfReader pdfreader, PdfDictionary pdfdictionary, IntHashtable inthashtable, boolean flag)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #28  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void ArrayList()>
	//    3    7:astore          7
_L3:
		HashMap hashmap;
		if(pdfdictionary == null)
			break MISSING_BLOCK_LABEL_1078;
	//    4    9:aload_1         
	//    5   10:ifnull          1078
		hashmap = new HashMap();
	//    6   13:new             #31  <Class HashMap>
	//    7   16:dup             
	//    8   17:invokespecial   #32  <Method void HashMap()>
	//    9   20:astore          8
		hashmap.put("Title", ((Object) (((PdfString)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.TITLE))).toUnicodeString())));
	//   10   22:aload           8
	//   11   24:ldc1            #34  <String "Title">
	//   12   26:aload_1         
	//   13   27:getstatic       #40  <Field PdfName PdfName.TITLE>
	//   14   30:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//   15   33:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   16   36:checkcast       #54  <Class PdfString>
	//   17   39:invokevirtual   #58  <Method String PdfString.toUnicodeString()>
	//   18   42:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   19   45:pop             
		Object obj = ((Object) ((PdfArray)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.C))));
	//   20   46:aload_1         
	//   21   47:getstatic       #65  <Field PdfName PdfName.C>
	//   22   50:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//   23   53:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   24   56:checkcast       #67  <Class PdfArray>
	//   25   59:astore          5
		if(obj != null && ((PdfArray) (obj)).size() == 3)
	//*  26   61:aload           5
	//*  27   63:ifnull          156
	//*  28   66:aload           5
	//*  29   68:invokevirtual   #71  <Method int PdfArray.size()>
	//*  30   71:iconst_3        
	//*  31   72:icmpne          156
		{
			ByteBuffer bytebuffer = new ByteBuffer();
	//   32   75:new             #73  <Class ByteBuffer>
	//   33   78:dup             
	//   34   79:invokespecial   #74  <Method void ByteBuffer()>
	//   35   82:astore          6
			bytebuffer.append(((PdfArray) (obj)).getAsNumber(0).floatValue()).append(' ');
	//   36   84:aload           6
	//   37   86:aload           5
	//   38   88:iconst_0        
	//   39   89:invokevirtual   #78  <Method PdfNumber PdfArray.getAsNumber(int)>
	//   40   92:invokevirtual   #84  <Method float PdfNumber.floatValue()>
	//   41   95:invokevirtual   #88  <Method ByteBuffer ByteBuffer.append(float)>
	//   42   98:bipush          32
	//   43  100:invokevirtual   #91  <Method ByteBuffer ByteBuffer.append(char)>
	//   44  103:pop             
			bytebuffer.append(((PdfArray) (obj)).getAsNumber(1).floatValue()).append(' ');
	//   45  104:aload           6
	//   46  106:aload           5
	//   47  108:iconst_1        
	//   48  109:invokevirtual   #78  <Method PdfNumber PdfArray.getAsNumber(int)>
	//   49  112:invokevirtual   #84  <Method float PdfNumber.floatValue()>
	//   50  115:invokevirtual   #88  <Method ByteBuffer ByteBuffer.append(float)>
	//   51  118:bipush          32
	//   52  120:invokevirtual   #91  <Method ByteBuffer ByteBuffer.append(char)>
	//   53  123:pop             
			bytebuffer.append(((PdfArray) (obj)).getAsNumber(2).floatValue());
	//   54  124:aload           6
	//   55  126:aload           5
	//   56  128:iconst_2        
	//   57  129:invokevirtual   #78  <Method PdfNumber PdfArray.getAsNumber(int)>
	//   58  132:invokevirtual   #84  <Method float PdfNumber.floatValue()>
	//   59  135:invokevirtual   #88  <Method ByteBuffer ByteBuffer.append(float)>
	//   60  138:pop             
			hashmap.put("Color", ((Object) (PdfEncodings.convertToString(bytebuffer.toByteArray(), ((String) (null))))));
	//   61  139:aload           8
	//   62  141:ldc1            #93  <String "Color">
	//   63  143:aload           6
	//   64  145:invokevirtual   #97  <Method byte[] ByteBuffer.toByteArray()>
	//   65  148:aconst_null     
	//   66  149:invokestatic    #103 <Method String PdfEncodings.convertToString(byte[], String)>
	//   67  152:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   68  155:pop             
		}
		obj = ((Object) ((PdfNumber)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.F))));
	//   69  156:aload_1         
	//   70  157:getstatic       #106 <Field PdfName PdfName.F>
	//   71  160:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//   72  163:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   73  166:checkcast       #80  <Class PdfNumber>
	//   74  169:astore          5
		if(obj != null)
	//*  75  171:aload           5
	//*  76  173:ifnull          274
		{
			int i = ((PdfNumber) (obj)).intValue();
	//   77  176:aload           5
	//   78  178:invokevirtual   #109 <Method int PdfNumber.intValue()>
	//   79  181:istore          4
			obj = "";
	//   80  183:ldc1            #111 <String "">
	//   81  185:astore          5
			if((i & 1) != 0)
	//*  82  187:iload           4
	//*  83  189:iconst_1        
	//*  84  190:iand            
	//*  85  191:ifeq            216
				obj = ((Object) ((new StringBuilder()).append("").append("italic ").toString()));
	//   86  194:new             #113 <Class StringBuilder>
	//   87  197:dup             
	//   88  198:invokespecial   #114 <Method void StringBuilder()>
	//   89  201:ldc1            #111 <String "">
	//   90  203:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   91  206:ldc1            #119 <String "italic ">
	//   92  208:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   93  211:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   94  214:astore          5
			String s = ((String) (obj));
	//   95  216:aload           5
	//   96  218:astore          6
			if((i & 2) != 0)
	//*  97  220:iload           4
	//*  98  222:iconst_2        
	//*  99  223:iand            
	//* 100  224:ifeq            249
				s = (new StringBuilder()).append(((String) (obj))).append("bold ").toString();
	//  101  227:new             #113 <Class StringBuilder>
	//  102  230:dup             
	//  103  231:invokespecial   #114 <Method void StringBuilder()>
	//  104  234:aload           5
	//  105  236:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//  106  239:ldc1            #124 <String "bold ">
	//  107  241:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//  108  244:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  109  247:astore          6
			obj = ((Object) (s.trim()));
	//  110  249:aload           6
	//  111  251:invokevirtual   #129 <Method String String.trim()>
	//  112  254:astore          5
			if(((String) (obj)).length() != 0)
	//* 113  256:aload           5
	//* 114  258:invokevirtual   #132 <Method int String.length()>
	//* 115  261:ifeq            274
				hashmap.put("Style", obj);
	//  116  264:aload           8
	//  117  266:ldc1            #134 <String "Style">
	//  118  268:aload           5
	//  119  270:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//  120  273:pop             
		}
		obj = ((Object) ((PdfNumber)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.COUNT))));
	//  121  274:aload_1         
	//  122  275:getstatic       #137 <Field PdfName PdfName.COUNT>
	//  123  278:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//  124  281:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//  125  284:checkcast       #80  <Class PdfNumber>
	//  126  287:astore          5
		if(obj != null && ((PdfNumber) (obj)).intValue() < 0)
	//* 127  289:aload           5
	//* 128  291:ifnull          312
	//* 129  294:aload           5
	//* 130  296:invokevirtual   #109 <Method int PdfNumber.intValue()>
	//* 131  299:ifge            312
			hashmap.put("Open", "false");
	//  132  302:aload           8
	//  133  304:ldc1            #139 <String "Open">
	//  134  306:ldc1            #141 <String "false">
	//  135  308:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//  136  311:pop             
		Object obj1 = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.DEST))));
	//  137  312:aload_1         
	//  138  313:getstatic       #144 <Field PdfName PdfName.DEST>
	//  139  316:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//  140  319:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//  141  322:astore          5
		if(obj1 == null) goto _L2; else goto _L1
	//  142  324:aload           5
	//  143  326:ifnull          402
_L1:
		int j;
		Object obj2;
		PdfDictionary pdfdictionary1;
		try
		{
			mapGotoBookmark(hashmap, ((PdfObject) (obj1)), inthashtable);
	//  144  329:aload           8
	//  145  331:aload           5
	//  146  333:aload_2         
	//  147  334:invokestatic    #148 <Method void mapGotoBookmark(HashMap, PdfObject, IntHashtable)>
		}
	//* 148  337:aload_1         
	//* 149  338:getstatic       #151 <Field PdfName PdfName.FIRST>
	//* 150  341:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 151  344:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 152  347:checkcast       #42  <Class PdfDictionary>
	//* 153  350:astore          5
	//* 154  352:aload           5
	//* 155  354:ifnull          373
	//* 156  357:aload           8
	//* 157  359:ldc1            #153 <String "Kids">
	//* 158  361:aload_0         
	//* 159  362:aload           5
	//* 160  364:aload_2         
	//* 161  365:iconst_0        
	//* 162  366:invokestatic    #155 <Method List bookmarkDepth(PdfReader, PdfDictionary, IntHashtable, boolean)>
	//* 163  369:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 164  372:pop             
	//* 165  373:aload           7
	//* 166  375:aload           8
	//* 167  377:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//* 168  380:pop             
	//* 169  381:iload_3         
	//* 170  382:ifne            1073
	//* 171  385:aload_1         
	//* 172  386:getstatic       #162 <Field PdfName PdfName.NEXT>
	//* 173  389:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 174  392:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 175  395:checkcast       #42  <Class PdfDictionary>
	//* 176  398:astore_1        
	//* 177  399:goto            9
	//* 178  402:aload_1         
	//* 179  403:getstatic       #165 <Field PdfName PdfName.A>
	//* 180  406:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 181  409:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 182  412:checkcast       #42  <Class PdfDictionary>
	//* 183  415:astore          9
	//* 184  417:aload           9
	//* 185  419:ifnull          337
	//* 186  422:getstatic       #168 <Field PdfName PdfName.GOTO>
	//* 187  425:aload           9
	//* 188  427:getstatic       #171 <Field PdfName PdfName.S>
	//* 189  430:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 190  433:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 191  436:invokevirtual   #174 <Method boolean PdfName.equals(Object)>
	//* 192  439:ifeq            471
	//* 193  442:aload           9
	//* 194  444:getstatic       #177 <Field PdfName PdfName.D>
	//* 195  447:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 196  450:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 197  453:astore          5
	//* 198  455:aload           5
	//* 199  457:ifnull          337
	//* 200  460:aload           8
	//* 201  462:aload           5
	//* 202  464:aload_2         
	//* 203  465:invokestatic    #148 <Method void mapGotoBookmark(HashMap, PdfObject, IntHashtable)>
	//* 204  468:goto            337
	//* 205  471:getstatic       #180 <Field PdfName PdfName.URI>
	//* 206  474:aload           9
	//* 207  476:getstatic       #171 <Field PdfName PdfName.S>
	//* 208  479:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 209  482:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 210  485:invokevirtual   #174 <Method boolean PdfName.equals(Object)>
	//* 211  488:ifeq            529
	//* 212  491:aload           8
	//* 213  493:ldc1            #182 <String "Action">
	//* 214  495:ldc1            #183 <String "URI">
	//* 215  497:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 216  500:pop             
	//* 217  501:aload           8
	//* 218  503:ldc1            #183 <String "URI">
	//* 219  505:aload           9
	//* 220  507:getstatic       #180 <Field PdfName PdfName.URI>
	//* 221  510:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 222  513:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 223  516:checkcast       #54  <Class PdfString>
	//* 224  519:invokevirtual   #58  <Method String PdfString.toUnicodeString()>
	//* 225  522:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 226  525:pop             
	//* 227  526:goto            337
	//* 228  529:getstatic       #186 <Field PdfName PdfName.JAVASCRIPT>
	//* 229  532:aload           9
	//* 230  534:getstatic       #171 <Field PdfName PdfName.S>
	//* 231  537:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 232  540:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 233  543:invokevirtual   #174 <Method boolean PdfName.equals(Object)>
	//* 234  546:ifeq            584
	//* 235  549:aload           8
	//* 236  551:ldc1            #182 <String "Action">
	//* 237  553:ldc1            #188 <String "JS">
	//* 238  555:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 239  558:pop             
	//* 240  559:aload           8
	//* 241  561:ldc1            #189 <String "Code">
	//* 242  563:aload           9
	//* 243  565:getstatic       #191 <Field PdfName PdfName.JS>
	//* 244  568:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 245  571:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 246  574:invokevirtual   #194 <Method String PdfObject.toString()>
	//* 247  577:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 248  580:pop             
	//* 249  581:goto            337
	//* 250  584:getstatic       #197 <Field PdfName PdfName.GOTOR>
	//* 251  587:aload           9
	//* 252  589:getstatic       #171 <Field PdfName PdfName.S>
	//* 253  592:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 254  595:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 255  598:invokevirtual   #174 <Method boolean PdfName.equals(Object)>
	//* 256  601:ifeq            925
	//* 257  604:aload           9
	//* 258  606:getstatic       #177 <Field PdfName PdfName.D>
	//* 259  609:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 260  612:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 261  615:astore          5
	//* 262  617:aload           5
	//* 263  619:ifnull          643
	//* 264  622:aload           5
	//* 265  624:invokevirtual   #201 <Method boolean PdfObject.isString()>
	//* 266  627:ifeq            729
	//* 267  630:aload           8
	//* 268  632:ldc1            #203 <String "Named">
	//* 269  634:aload           5
	//* 270  636:invokevirtual   #194 <Method String PdfObject.toString()>
	//* 271  639:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 272  642:pop             
	//* 273  643:aload           8
	//* 274  645:ldc1            #182 <String "Action">
	//* 275  647:ldc1            #205 <String "GoToR">
	//* 276  649:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 277  652:pop             
	//* 278  653:aload           9
	//* 279  655:getstatic       #106 <Field PdfName PdfName.F>
	//* 280  658:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 281  661:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 282  664:astore          5
	//* 283  666:aload           5
	//* 284  668:ifnull          695
	//* 285  671:aload           5
	//* 286  673:invokevirtual   #201 <Method boolean PdfObject.isString()>
	//* 287  676:ifeq            874
	//* 288  679:aload           8
	//* 289  681:ldc1            #207 <String "File">
	//* 290  683:aload           5
	//* 291  685:checkcast       #54  <Class PdfString>
	//* 292  688:invokevirtual   #58  <Method String PdfString.toUnicodeString()>
	//* 293  691:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 294  694:pop             
	//* 295  695:aload           9
	//* 296  697:getstatic       #210 <Field PdfName PdfName.NEWWINDOW>
	//* 297  700:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 298  703:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 299  706:astore          5
	//* 300  708:aload           5
	//* 301  710:ifnull          337
	//* 302  713:aload           8
	//* 303  715:ldc1            #212 <String "NewWindow">
	//* 304  717:aload           5
	//* 305  719:invokevirtual   #194 <Method String PdfObject.toString()>
	//* 306  722:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 307  725:pop             
	//* 308  726:goto            337
	//* 309  729:aload           5
	//* 310  731:invokevirtual   #215 <Method boolean PdfObject.isName()>
	//* 311  734:ifeq            756
	//* 312  737:aload           8
	//* 313  739:ldc1            #217 <String "NamedN">
	//* 314  741:aload           5
	//* 315  743:invokevirtual   #194 <Method String PdfObject.toString()>
	//* 316  746:invokestatic    #221 <Method String PdfName.decodeName(String)>
	//* 317  749:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 318  752:pop             
	//* 319  753:goto            643
	//* 320  756:aload           5
	//* 321  758:invokevirtual   #224 <Method boolean PdfObject.isArray()>
	//* 322  761:ifeq            643
	//* 323  764:aload           5
	//* 324  766:checkcast       #67  <Class PdfArray>
	//* 325  769:astore          5
	//* 326  771:new             #226 <Class StringBuffer>
	//* 327  774:dup             
	//* 328  775:invokespecial   #227 <Method void StringBuffer()>
	//* 329  778:astore          6
	//* 330  780:aload           6
	//* 331  782:aload           5
	//* 332  784:iconst_0        
	//* 333  785:invokevirtual   #231 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 334  788:invokevirtual   #194 <Method String PdfObject.toString()>
	//* 335  791:invokevirtual   #234 <Method StringBuffer StringBuffer.append(String)>
	//* 336  794:pop             
	//* 337  795:aload           6
	//* 338  797:bipush          32
	//* 339  799:invokevirtual   #237 <Method StringBuffer StringBuffer.append(char)>
	//* 340  802:aload           5
	//* 341  804:iconst_1        
	//* 342  805:invokevirtual   #231 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 343  808:invokevirtual   #194 <Method String PdfObject.toString()>
	//* 344  811:invokevirtual   #234 <Method StringBuffer StringBuffer.append(String)>
	//* 345  814:pop             
	//* 346  815:iconst_2        
	//* 347  816:istore          4
	//* 348  818:iload           4
	//* 349  820:aload           5
	//* 350  822:invokevirtual   #71  <Method int PdfArray.size()>
	//* 351  825:icmpge          858
	//* 352  828:aload           6
	//* 353  830:bipush          32
	//* 354  832:invokevirtual   #237 <Method StringBuffer StringBuffer.append(char)>
	//* 355  835:aload           5
	//* 356  837:iload           4
	//* 357  839:invokevirtual   #231 <Method PdfObject PdfArray.getPdfObject(int)>
	//* 358  842:invokevirtual   #194 <Method String PdfObject.toString()>
	//* 359  845:invokevirtual   #234 <Method StringBuffer StringBuffer.append(String)>
	//* 360  848:pop             
	//* 361  849:iload           4
	//* 362  851:iconst_1        
	//* 363  852:iadd            
	//* 364  853:istore          4
	//* 365  855:goto            818
	//* 366  858:aload           8
	//* 367  860:ldc1            #239 <String "Page">
	//* 368  862:aload           6
	//* 369  864:invokevirtual   #240 <Method String StringBuffer.toString()>
	//* 370  867:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 371  870:pop             
	//* 372  871:goto            643
	//* 373  874:aload           5
	//* 374  876:invokevirtual   #243 <Method boolean PdfObject.isDictionary()>
	//* 375  879:ifeq            695
	//* 376  882:aload           5
	//* 377  884:checkcast       #42  <Class PdfDictionary>
	//* 378  887:getstatic       #106 <Field PdfName PdfName.F>
	//* 379  890:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 380  893:invokestatic    #245 <Method PdfObject PdfReader.getPdfObject(PdfObject)>
	//* 381  896:astore          5
	//* 382  898:aload           5
	//* 383  900:invokevirtual   #201 <Method boolean PdfObject.isString()>
	//* 384  903:ifeq            695
	//* 385  906:aload           8
	//* 386  908:ldc1            #207 <String "File">
	//* 387  910:aload           5
	//* 388  912:checkcast       #54  <Class PdfString>
	//* 389  915:invokevirtual   #58  <Method String PdfString.toUnicodeString()>
	//* 390  918:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 391  921:pop             
	//* 392  922:goto            695
	//* 393  925:getstatic       #248 <Field PdfName PdfName.LAUNCH>
	//* 394  928:aload           9
	//* 395  930:getstatic       #171 <Field PdfName PdfName.S>
	//* 396  933:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 397  936:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 398  939:invokevirtual   #174 <Method boolean PdfName.equals(Object)>
	//* 399  942:ifeq            337
	//* 400  945:aload           8
	//* 401  947:ldc1            #182 <String "Action">
	//* 402  949:ldc1            #250 <String "Launch">
	//* 403  951:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 404  954:pop             
	//* 405  955:aload           9
	//* 406  957:getstatic       #106 <Field PdfName PdfName.F>
	//* 407  960:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 408  963:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 409  966:astore          6
	//* 410  968:aload           6
	//* 411  970:astore          5
	//* 412  972:aload           6
	//* 413  974:ifnonnull       990
	//* 414  977:aload           9
	//* 415  979:getstatic       #253 <Field PdfName PdfName.WIN>
	//* 416  982:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 417  985:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 418  988:astore          5
	//* 419  990:aload           5
	//* 420  992:ifnull          337
	//* 421  995:aload           5
	//* 422  997:invokevirtual   #201 <Method boolean PdfObject.isString()>
	//* 423 1000:ifeq            1022
	//* 424 1003:aload           8
	//* 425 1005:ldc1            #207 <String "File">
	//* 426 1007:aload           5
	//* 427 1009:checkcast       #54  <Class PdfString>
	//* 428 1012:invokevirtual   #58  <Method String PdfString.toUnicodeString()>
	//* 429 1015:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 430 1018:pop             
	//* 431 1019:goto            337
	//* 432 1022:aload           5
	//* 433 1024:invokevirtual   #243 <Method boolean PdfObject.isDictionary()>
	//* 434 1027:ifeq            337
	//* 435 1030:aload           5
	//* 436 1032:checkcast       #42  <Class PdfDictionary>
	//* 437 1035:getstatic       #106 <Field PdfName PdfName.F>
	//* 438 1038:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//* 439 1041:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//* 440 1044:astore          5
	//* 441 1046:aload           5
	//* 442 1048:invokevirtual   #201 <Method boolean PdfObject.isString()>
	//* 443 1051:ifeq            337
	//* 444 1054:aload           8
	//* 445 1056:ldc1            #207 <String "File">
	//* 446 1058:aload           5
	//* 447 1060:checkcast       #54  <Class PdfString>
	//* 448 1063:invokevirtual   #58  <Method String PdfString.toUnicodeString()>
	//* 449 1066:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//* 450 1069:pop             
	//* 451 1070:goto            337
	//* 452 1073:aconst_null     
	//* 453 1074:astore_1        
	//* 454 1075:goto            9
	//* 455 1078:aload           7
	//* 456 1080:areturn         
		catch(Exception exception) { }
	//  457 1081:astore          5
		obj1 = ((Object) ((PdfDictionary)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.FIRST))));
		if(obj1 != null)
			hashmap.put("Kids", ((Object) (bookmarkDepth(pdfreader, ((PdfDictionary) (obj1)), inthashtable, false))));
		arraylist.add(((Object) (hashmap)));
		if(!flag)
			pdfdictionary = (PdfDictionary)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.NEXT));
		else
			pdfdictionary = null;
		if(true) goto _L3; else goto _L2
_L2:
		pdfdictionary1 = (PdfDictionary)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.A));
		if(pdfdictionary1 == null)
			break MISSING_BLOCK_LABEL_337;
		if(!PdfName.GOTO.equals(((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.S))))))
			break MISSING_BLOCK_LABEL_471;
		obj1 = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.D))));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_337;
		mapGotoBookmark(hashmap, ((PdfObject) (obj1)), inthashtable);
		break MISSING_BLOCK_LABEL_337;
label0:
		{
			if(!PdfName.URI.equals(((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.S))))))
				break label0;
			hashmap.put("Action", "URI");
			hashmap.put("URI", ((Object) (((PdfString)PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.URI))).toUnicodeString())));
		}
		break MISSING_BLOCK_LABEL_337;
label1:
		{
			if(!PdfName.JAVASCRIPT.equals(((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.S))))))
				break label1;
			hashmap.put("Action", "JS");
			hashmap.put("Code", ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.JS)).toString())));
		}
		break MISSING_BLOCK_LABEL_337;
		if(!PdfName.GOTOR.equals(((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.S)))))) goto _L5; else goto _L4
_L4:
		obj1 = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.D))));
		if(obj1 == null) goto _L7; else goto _L6
_L6:
		if(!((PdfObject) (obj1)).isString()) goto _L9; else goto _L8
_L8:
		hashmap.put("Named", ((Object) (((PdfObject) (obj1)).toString())));
_L7:
		hashmap.put("Action", "GoToR");
		obj1 = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.F))));
		if(obj1 == null) goto _L11; else goto _L10
_L10:
		if(!((PdfObject) (obj1)).isString()) goto _L13; else goto _L12
_L12:
		hashmap.put("File", ((Object) (((PdfString)obj1).toUnicodeString())));
_L11:
		obj1 = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.NEWWINDOW))));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_337;
		hashmap.put("NewWindow", ((Object) (((PdfObject) (obj1)).toString())));
		break MISSING_BLOCK_LABEL_337;
_L9:
		if(((PdfObject) (obj1)).isName())
		{
			hashmap.put("NamedN", ((Object) (PdfName.decodeName(((PdfObject) (obj1)).toString()))));
			continue; /* Loop/switch isn't completed */
		}
		if(!((PdfObject) (obj1)).isArray())
			continue; /* Loop/switch isn't completed */
		obj1 = ((Object) ((PdfArray)obj1));
		obj2 = ((Object) (new StringBuffer()));
		((StringBuffer) (obj2)).append(((PdfArray) (obj1)).getPdfObject(0).toString());
		((StringBuffer) (obj2)).append(' ').append(((PdfArray) (obj1)).getPdfObject(1).toString());
		j = 2;
_L15:
		if(j >= ((PdfArray) (obj1)).size())
			break; /* Loop/switch isn't completed */
		((StringBuffer) (obj2)).append(' ').append(((PdfArray) (obj1)).getPdfObject(j).toString());
		j++;
		if(true) goto _L15; else goto _L14
_L14:
		hashmap.put("Page", ((Object) (((StringBuffer) (obj2)).toString())));
		continue; /* Loop/switch isn't completed */
_L13:
		if(!((PdfObject) (obj1)).isDictionary()) goto _L11; else goto _L16
_L16:
		obj1 = ((Object) (PdfReader.getPdfObject(((PdfDictionary)obj1).get(PdfName.F))));
		if(((PdfObject) (obj1)).isString())
			hashmap.put("File", ((Object) (((PdfString)obj1).toUnicodeString())));
		  goto _L11
_L5:
		if(!PdfName.LAUNCH.equals(((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.S))))))
			break MISSING_BLOCK_LABEL_337;
		hashmap.put("Action", "Launch");
		obj2 = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.F))));
		obj1 = obj2;
		if(obj2 != null)
			break MISSING_BLOCK_LABEL_990;
		obj1 = ((Object) (PdfReader.getPdfObjectRelease(pdfdictionary1.get(PdfName.WIN))));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_337;
		if(((PdfObject) (obj1)).isString())
		{
			hashmap.put("File", ((Object) (((PdfString)obj1).toUnicodeString())));
			break MISSING_BLOCK_LABEL_337;
		}
		if(!((PdfObject) (obj1)).isDictionary())
			break MISSING_BLOCK_LABEL_337;
		obj1 = ((Object) (PdfReader.getPdfObjectRelease(((PdfDictionary)obj1).get(PdfName.F))));
		if(((PdfObject) (obj1)).isString())
			hashmap.put("File", ((Object) (((PdfString)obj1).toUnicodeString())));
		break MISSING_BLOCK_LABEL_337;
		return ((List) (arraylist));
		if(true) goto _L7; else goto _L17
_L17:
	//* 458 1083:goto            337
	}

	static void createOutlineAction(PdfDictionary pdfdictionary, HashMap hashmap, PdfWriter pdfwriter, boolean flag)
	{
		Object obj = ((Object) ((String)hashmap.get("Action")));
	//    0    0:aload_1         
	//    1    1:ldc1            #182 <String "Action">
	//    2    3:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//    3    6:checkcast       #126 <Class String>
	//    4    9:astore          5
		if(!"GoTo".equals(obj)) goto _L2; else goto _L1
	//    5   11:ldc2            #262 <String "GoTo">
	//    6   14:aload           5
	//    7   16:invokevirtual   #263 <Method boolean String.equals(Object)>
	//    8   19:ifeq            278
_L1:
		obj = ((Object) ((String)hashmap.get("Named")));
	//    9   22:aload_1         
	//   10   23:ldc1            #203 <String "Named">
	//   11   25:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   12   28:checkcast       #126 <Class String>
	//   13   31:astore          5
		int i;
		if(obj == null)
			break MISSING_BLOCK_LABEL_77;
	//   14   33:aload           5
	//   15   35:ifnull          77
		Object obj1;
		PdfArray pdfarray;
		StringTokenizer stringtokenizer;
		if(flag)
	//*  16   38:iload_3         
	//*  17   39:ifeq            59
			try
			{
				pdfdictionary.put(PdfName.DEST, ((PdfObject) (new PdfName(((String) (obj))))));
	//   18   42:aload_0         
	//   19   43:getstatic       #144 <Field PdfName PdfName.DEST>
	//   20   46:new             #36  <Class PdfName>
	//   21   49:dup             
	//   22   50:aload           5
	//   23   52:invokespecial   #266 <Method void PdfName(String)>
	//   24   55:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
				return;
	//   25   58:return          
			}
	//*  26   59:aload_0         
	//*  27   60:getstatic       #144 <Field PdfName PdfName.DEST>
	//*  28   63:new             #54  <Class PdfString>
	//*  29   66:dup             
	//*  30   67:aload           5
	//*  31   69:aconst_null     
	//*  32   70:invokespecial   #272 <Method void PdfString(String, String)>
	//*  33   73:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  34   76:return          
	//*  35   77:aload_1         
	//*  36   78:ldc1            #239 <String "Page">
	//*  37   80:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//*  38   83:checkcast       #126 <Class String>
	//*  39   86:astore_1        
	//*  40   87:aload_1         
	//*  41   88:ifnull          854
	//*  42   91:new             #67  <Class PdfArray>
	//*  43   94:dup             
	//*  44   95:invokespecial   #273 <Method void PdfArray()>
	//*  45   98:astore          5
	//*  46  100:new             #275 <Class StringTokenizer>
	//*  47  103:dup             
	//*  48  104:aload_1         
	//*  49  105:invokespecial   #276 <Method void StringTokenizer(String)>
	//*  50  108:astore          6
	//*  51  110:aload           5
	//*  52  112:aload_2         
	//*  53  113:aload           6
	//*  54  115:invokevirtual   #279 <Method String StringTokenizer.nextToken()>
	//*  55  118:invokestatic    #285 <Method int Integer.parseInt(String)>
	//*  56  121:invokevirtual   #291 <Method PdfIndirectReference PdfWriter.getPageReference(int)>
	//*  57  124:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//*  58  127:pop             
	//*  59  128:aload           6
	//*  60  130:invokevirtual   #297 <Method boolean StringTokenizer.hasMoreTokens()>
	//*  61  133:ifne            178
	//*  62  136:aload           5
	//*  63  138:getstatic       #300 <Field PdfName PdfName.XYZ>
	//*  64  141:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//*  65  144:pop             
	//*  66  145:aload           5
	//*  67  147:iconst_3        
	//*  68  148:newarray        float[]
	//*  69  150:dup             
	//*  70  151:iconst_0        
	//*  71  152:fconst_0        
	//*  72  153:fastore         
	//*  73  154:dup             
	//*  74  155:iconst_1        
	//*  75  156:ldc2            #301 <Float 10000F>
	//*  76  159:fastore         
	//*  77  160:dup             
	//*  78  161:iconst_2        
	//*  79  162:fconst_0        
	//*  80  163:fastore         
	//*  81  164:invokevirtual   #304 <Method boolean PdfArray.add(float[])>
	//*  82  167:pop             
	//*  83  168:aload_0         
	//*  84  169:getstatic       #144 <Field PdfName PdfName.DEST>
	//*  85  172:aload           5
	//*  86  174:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//*  87  177:return          
	//*  88  178:aload           6
	//*  89  180:invokevirtual   #279 <Method String StringTokenizer.nextToken()>
	//*  90  183:astore_2        
	//*  91  184:aload_2         
	//*  92  185:astore_1        
	//*  93  186:aload_2         
	//*  94  187:ldc2            #306 <String "/">
	//*  95  190:invokevirtual   #310 <Method boolean String.startsWith(String)>
	//*  96  193:ifeq            202
	//*  97  196:aload_2         
	//*  98  197:iconst_1        
	//*  99  198:invokevirtual   #314 <Method String String.substring(int)>
	//* 100  201:astore_1        
	//* 101  202:aload           5
	//* 102  204:new             #36  <Class PdfName>
	//* 103  207:dup             
	//* 104  208:aload_1         
	//* 105  209:invokespecial   #266 <Method void PdfName(String)>
	//* 106  212:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//* 107  215:pop             
	//* 108  216:iconst_0        
	//* 109  217:istore          4
	//* 110  219:iload           4
	//* 111  221:iconst_4        
	//* 112  222:icmpge          168
	//* 113  225:aload           6
	//* 114  227:invokevirtual   #297 <Method boolean StringTokenizer.hasMoreTokens()>
	//* 115  230:ifeq            168
	//* 116  233:aload           6
	//* 117  235:invokevirtual   #279 <Method String StringTokenizer.nextToken()>
	//* 118  238:astore_1        
	//* 119  239:aload_1         
	//* 120  240:ldc2            #316 <String "null">
	//* 121  243:invokevirtual   #263 <Method boolean String.equals(Object)>
	//* 122  246:ifeq            261
	//* 123  249:aload           5
	//* 124  251:getstatic       #322 <Field PdfNull PdfNull.PDFNULL>
	//* 125  254:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//* 126  257:pop             
	//* 127  258:goto            857
	//* 128  261:aload           5
	//* 129  263:new             #80  <Class PdfNumber>
	//* 130  266:dup             
	//* 131  267:aload_1         
	//* 132  268:invokespecial   #323 <Method void PdfNumber(String)>
	//* 133  271:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//* 134  274:pop             
	//* 135  275:goto            857
	//* 136  278:ldc1            #205 <String "GoToR">
	//* 137  280:aload           5
	//* 138  282:invokevirtual   #263 <Method boolean String.equals(Object)>
	//* 139  285:ifeq            686
	//* 140  288:new             #42  <Class PdfDictionary>
	//* 141  291:dup             
	//* 142  292:invokespecial   #324 <Method void PdfDictionary()>
	//* 143  295:astore          6
	//* 144  297:aload_1         
	//* 145  298:ldc1            #203 <String "Named">
	//* 146  300:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 147  303:checkcast       #126 <Class String>
	//* 148  306:astore_2        
	//* 149  307:aload_2         
	//* 150  308:ifnull          422
	//* 151  311:aload           6
	//* 152  313:getstatic       #177 <Field PdfName PdfName.D>
	//* 153  316:new             #54  <Class PdfString>
	//* 154  319:dup             
	//* 155  320:aload_2         
	//* 156  321:aconst_null     
	//* 157  322:invokespecial   #272 <Method void PdfString(String, String)>
	//* 158  325:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 159  328:aload_1         
	//* 160  329:ldc1            #207 <String "File">
	//* 161  331:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 162  334:checkcast       #126 <Class String>
	//* 163  337:astore_2        
	//* 164  338:aload           6
	//* 165  340:invokevirtual   #325 <Method int PdfDictionary.size()>
	//* 166  343:ifle            854
	//* 167  346:aload_2         
	//* 168  347:ifnull          854
	//* 169  350:aload           6
	//* 170  352:getstatic       #171 <Field PdfName PdfName.S>
	//* 171  355:getstatic       #197 <Field PdfName PdfName.GOTOR>
	//* 172  358:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 173  361:aload           6
	//* 174  363:getstatic       #106 <Field PdfName PdfName.F>
	//* 175  366:new             #54  <Class PdfString>
	//* 176  369:dup             
	//* 177  370:aload_2         
	//* 178  371:invokespecial   #326 <Method void PdfString(String)>
	//* 179  374:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 180  377:aload_1         
	//* 181  378:ldc1            #212 <String "NewWindow">
	//* 182  380:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 183  383:checkcast       #126 <Class String>
	//* 184  386:astore_1        
	//* 185  387:aload_1         
	//* 186  388:ifnull          412
	//* 187  391:aload_1         
	//* 188  392:ldc2            #328 <String "true">
	//* 189  395:invokevirtual   #263 <Method boolean String.equals(Object)>
	//* 190  398:ifeq            663
	//* 191  401:aload           6
	//* 192  403:getstatic       #210 <Field PdfName PdfName.NEWWINDOW>
	//* 193  406:getstatic       #334 <Field PdfBoolean PdfBoolean.PDFTRUE>
	//* 194  409:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 195  412:aload_0         
	//* 196  413:getstatic       #165 <Field PdfName PdfName.A>
	//* 197  416:aload           6
	//* 198  418:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 199  421:return          
	//* 200  422:aload_1         
	//* 201  423:ldc1            #217 <String "NamedN">
	//* 202  425:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 203  428:checkcast       #126 <Class String>
	//* 204  431:astore_2        
	//* 205  432:aload_2         
	//* 206  433:ifnull          455
	//* 207  436:aload           6
	//* 208  438:getstatic       #177 <Field PdfName PdfName.D>
	//* 209  441:new             #36  <Class PdfName>
	//* 210  444:dup             
	//* 211  445:aload_2         
	//* 212  446:invokespecial   #266 <Method void PdfName(String)>
	//* 213  449:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 214  452:goto            328
	//* 215  455:aload_1         
	//* 216  456:ldc1            #239 <String "Page">
	//* 217  458:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 218  461:checkcast       #126 <Class String>
	//* 219  464:astore_2        
	//* 220  465:aload_2         
	//* 221  466:ifnull          328
	//* 222  469:new             #67  <Class PdfArray>
	//* 223  472:dup             
	//* 224  473:invokespecial   #273 <Method void PdfArray()>
	//* 225  476:astore          7
	//* 226  478:new             #275 <Class StringTokenizer>
	//* 227  481:dup             
	//* 228  482:aload_2         
	//* 229  483:invokespecial   #276 <Method void StringTokenizer(String)>
	//* 230  486:astore          8
	//* 231  488:aload           7
	//* 232  490:new             #80  <Class PdfNumber>
	//* 233  493:dup             
	//* 234  494:aload           8
	//* 235  496:invokevirtual   #279 <Method String StringTokenizer.nextToken()>
	//* 236  499:invokespecial   #323 <Method void PdfNumber(String)>
	//* 237  502:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//* 238  505:pop             
	//* 239  506:aload           8
	//* 240  508:invokevirtual   #297 <Method boolean StringTokenizer.hasMoreTokens()>
	//* 241  511:ifne            559
	//* 242  514:aload           7
	//* 243  516:getstatic       #300 <Field PdfName PdfName.XYZ>
	//* 244  519:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//* 245  522:pop             
	//* 246  523:aload           7
	//* 247  525:iconst_3        
	//* 248  526:newarray        float[]
	//* 249  528:dup             
	//* 250  529:iconst_0        
	//* 251  530:fconst_0        
	//* 252  531:fastore         
	//* 253  532:dup             
	//* 254  533:iconst_1        
	//* 255  534:ldc2            #301 <Float 10000F>
	//* 256  537:fastore         
	//* 257  538:dup             
	//* 258  539:iconst_2        
	//* 259  540:fconst_0        
	//* 260  541:fastore         
	//* 261  542:invokevirtual   #304 <Method boolean PdfArray.add(float[])>
	//* 262  545:pop             
	//* 263  546:aload           6
	//* 264  548:getstatic       #177 <Field PdfName PdfName.D>
	//* 265  551:aload           7
	//* 266  553:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 267  556:goto            328
	//* 268  559:aload           8
	//* 269  561:invokevirtual   #279 <Method String StringTokenizer.nextToken()>
	//* 270  564:astore          5
	//* 271  566:aload           5
	//* 272  568:astore_2        
	//* 273  569:aload           5
	//* 274  571:ldc2            #306 <String "/">
	//* 275  574:invokevirtual   #310 <Method boolean String.startsWith(String)>
	//* 276  577:ifeq            587
	//* 277  580:aload           5
	//* 278  582:iconst_1        
	//* 279  583:invokevirtual   #314 <Method String String.substring(int)>
	//* 280  586:astore_2        
	//* 281  587:aload           7
	//* 282  589:new             #36  <Class PdfName>
	//* 283  592:dup             
	//* 284  593:aload_2         
	//* 285  594:invokespecial   #266 <Method void PdfName(String)>
	//* 286  597:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//* 287  600:pop             
	//* 288  601:iconst_0        
	//* 289  602:istore          4
	//* 290  604:iload           4
	//* 291  606:iconst_4        
	//* 292  607:icmpge          546
	//* 293  610:aload           8
	//* 294  612:invokevirtual   #297 <Method boolean StringTokenizer.hasMoreTokens()>
	//* 295  615:ifeq            546
	//* 296  618:aload           8
	//* 297  620:invokevirtual   #279 <Method String StringTokenizer.nextToken()>
	//* 298  623:astore_2        
	//* 299  624:aload_2         
	//* 300  625:ldc2            #316 <String "null">
	//* 301  628:invokevirtual   #263 <Method boolean String.equals(Object)>
	//* 302  631:ifeq            646
	//* 303  634:aload           7
	//* 304  636:getstatic       #322 <Field PdfNull PdfNull.PDFNULL>
	//* 305  639:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//* 306  642:pop             
	//* 307  643:goto            866
	//* 308  646:aload           7
	//* 309  648:new             #80  <Class PdfNumber>
	//* 310  651:dup             
	//* 311  652:aload_2         
	//* 312  653:invokespecial   #323 <Method void PdfNumber(String)>
	//* 313  656:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//* 314  659:pop             
	//* 315  660:goto            866
	//* 316  663:aload_1         
	//* 317  664:ldc1            #141 <String "false">
	//* 318  666:invokevirtual   #263 <Method boolean String.equals(Object)>
	//* 319  669:ifeq            412
	//* 320  672:aload           6
	//* 321  674:getstatic       #210 <Field PdfName PdfName.NEWWINDOW>
	//* 322  677:getstatic       #337 <Field PdfBoolean PdfBoolean.PDFFALSE>
	//* 323  680:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 324  683:goto            412
	//* 325  686:ldc1            #183 <String "URI">
	//* 326  688:aload           5
	//* 327  690:invokevirtual   #263 <Method boolean String.equals(Object)>
	//* 328  693:ifeq            752
	//* 329  696:aload_1         
	//* 330  697:ldc1            #183 <String "URI">
	//* 331  699:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 332  702:checkcast       #126 <Class String>
	//* 333  705:astore_1        
	//* 334  706:aload_1         
	//* 335  707:ifnull          854
	//* 336  710:new             #42  <Class PdfDictionary>
	//* 337  713:dup             
	//* 338  714:invokespecial   #324 <Method void PdfDictionary()>
	//* 339  717:astore_2        
	//* 340  718:aload_2         
	//* 341  719:getstatic       #171 <Field PdfName PdfName.S>
	//* 342  722:getstatic       #180 <Field PdfName PdfName.URI>
	//* 343  725:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 344  728:aload_2         
	//* 345  729:getstatic       #180 <Field PdfName PdfName.URI>
	//* 346  732:new             #54  <Class PdfString>
	//* 347  735:dup             
	//* 348  736:aload_1         
	//* 349  737:invokespecial   #326 <Method void PdfString(String)>
	//* 350  740:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 351  743:aload_0         
	//* 352  744:getstatic       #165 <Field PdfName PdfName.A>
	//* 353  747:aload_2         
	//* 354  748:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 355  751:return          
	//* 356  752:ldc1            #188 <String "JS">
	//* 357  754:aload           5
	//* 358  756:invokevirtual   #263 <Method boolean String.equals(Object)>
	//* 359  759:ifeq            789
	//* 360  762:aload_1         
	//* 361  763:ldc1            #189 <String "Code">
	//* 362  765:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 363  768:checkcast       #126 <Class String>
	//* 364  771:astore_1        
	//* 365  772:aload_1         
	//* 366  773:ifnull          854
	//* 367  776:aload_0         
	//* 368  777:getstatic       #165 <Field PdfName PdfName.A>
	//* 369  780:aload_1         
	//* 370  781:aload_2         
	//* 371  782:invokestatic    #343 <Method PdfAction PdfAction.javaScript(String, PdfWriter)>
	//* 372  785:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 373  788:return          
	//* 374  789:ldc1            #250 <String "Launch">
	//* 375  791:aload           5
	//* 376  793:invokevirtual   #263 <Method boolean String.equals(Object)>
	//* 377  796:ifeq            854
	//* 378  799:aload_1         
	//* 379  800:ldc1            #207 <String "File">
	//* 380  802:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 381  805:checkcast       #126 <Class String>
	//* 382  808:astore_1        
	//* 383  809:aload_1         
	//* 384  810:ifnull          854
	//* 385  813:new             #42  <Class PdfDictionary>
	//* 386  816:dup             
	//* 387  817:invokespecial   #324 <Method void PdfDictionary()>
	//* 388  820:astore_2        
	//* 389  821:aload_2         
	//* 390  822:getstatic       #171 <Field PdfName PdfName.S>
	//* 391  825:getstatic       #248 <Field PdfName PdfName.LAUNCH>
	//* 392  828:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 393  831:aload_2         
	//* 394  832:getstatic       #106 <Field PdfName PdfName.F>
	//* 395  835:new             #54  <Class PdfString>
	//* 396  838:dup             
	//* 397  839:aload_1         
	//* 398  840:invokespecial   #326 <Method void PdfString(String)>
	//* 399  843:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 400  846:aload_0         
	//* 401  847:getstatic       #165 <Field PdfName PdfName.A>
	//* 402  850:aload_2         
	//* 403  851:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 404  854:return          
			// Misplaced declaration of an exception variable
			catch(PdfDictionary pdfdictionary)
	//* 405  855:astore_0        
			{
				return;
	//  406  856:return          
			}
		pdfdictionary.put(PdfName.DEST, ((PdfObject) (new PdfString(((String) (obj)), ((String) (null))))));
		return;
		hashmap = ((HashMap) ((String)hashmap.get("Page")));
		if(hashmap == null) goto _L4; else goto _L3
_L3:
		obj = ((Object) (new PdfArray()));
		obj1 = ((Object) (new StringTokenizer(((String) (hashmap)))));
		((PdfArray) (obj)).add(((PdfObject) (pdfwriter.getPageReference(Integer.parseInt(((StringTokenizer) (obj1)).nextToken())))));
		if(((StringTokenizer) (obj1)).hasMoreTokens()) goto _L6; else goto _L5
_L5:
		((PdfArray) (obj)).add(((PdfObject) (PdfName.XYZ)));
		((PdfArray) (obj)).add(new float[] {
			0.0F, 10000F, 0.0F
		});
_L8:
		pdfdictionary.put(PdfName.DEST, ((PdfObject) (obj)));
		return;
_L6:
		pdfwriter = ((PdfWriter) (((StringTokenizer) (obj1)).nextToken()));
		hashmap = ((HashMap) (pdfwriter));
		if(((String) (pdfwriter)).startsWith("/"))
			hashmap = ((HashMap) (((String) (pdfwriter)).substring(1)));
		((PdfArray) (obj)).add(((PdfObject) (new PdfName(((String) (hashmap))))));
		i = 0;
_L38:
		if(i >= 4) goto _L8; else goto _L7
_L7:
		if(!((StringTokenizer) (obj1)).hasMoreTokens()) goto _L8; else goto _L9
_L9:
		hashmap = ((HashMap) (((StringTokenizer) (obj1)).nextToken()));
		if(!((String) (hashmap)).equals("null")) goto _L11; else goto _L10
_L10:
		((PdfArray) (obj)).add(((PdfObject) (PdfNull.PDFNULL)));
		  goto _L12
_L11:
		((PdfArray) (obj)).add(((PdfObject) (new PdfNumber(((String) (hashmap))))));
		  goto _L12
_L2:
		if(!"GoToR".equals(obj)) goto _L14; else goto _L13
_L13:
		obj1 = ((Object) (new PdfDictionary()));
		pdfwriter = ((PdfWriter) ((String)hashmap.get("Named")));
		if(pdfwriter == null) goto _L16; else goto _L15
_L15:
		((PdfDictionary) (obj1)).put(PdfName.D, ((PdfObject) (new PdfString(((String) (pdfwriter)), ((String) (null))))));
_L22:
		pdfwriter = ((PdfWriter) ((String)hashmap.get("File")));
		if(((PdfDictionary) (obj1)).size() <= 0 || pdfwriter == null) goto _L4; else goto _L17
_L17:
		((PdfDictionary) (obj1)).put(PdfName.S, ((PdfObject) (PdfName.GOTOR)));
		((PdfDictionary) (obj1)).put(PdfName.F, ((PdfObject) (new PdfString(((String) (pdfwriter))))));
		hashmap = ((HashMap) ((String)hashmap.get("NewWindow")));
		if(hashmap == null) goto _L19; else goto _L18
_L18:
		if(!((String) (hashmap)).equals("true")) goto _L21; else goto _L20
_L20:
		((PdfDictionary) (obj1)).put(PdfName.NEWWINDOW, ((PdfObject) (PdfBoolean.PDFTRUE)));
_L19:
		pdfdictionary.put(PdfName.A, ((PdfObject) (obj1)));
		return;
_L16:
		pdfwriter = ((PdfWriter) ((String)hashmap.get("NamedN")));
		if(pdfwriter == null)
			break MISSING_BLOCK_LABEL_455;
		((PdfDictionary) (obj1)).put(PdfName.D, ((PdfObject) (new PdfName(((String) (pdfwriter))))));
		  goto _L22
		pdfwriter = ((PdfWriter) ((String)hashmap.get("Page")));
		if(pdfwriter == null) goto _L22; else goto _L23
_L23:
		pdfarray = new PdfArray();
		stringtokenizer = new StringTokenizer(((String) (pdfwriter)));
		pdfarray.add(((PdfObject) (new PdfNumber(stringtokenizer.nextToken()))));
		if(stringtokenizer.hasMoreTokens()) goto _L25; else goto _L24
_L24:
		pdfarray.add(((PdfObject) (PdfName.XYZ)));
		pdfarray.add(new float[] {
			0.0F, 10000F, 0.0F
		});
_L27:
		((PdfDictionary) (obj1)).put(PdfName.D, ((PdfObject) (pdfarray)));
		  goto _L22
_L25:
		obj = ((Object) (stringtokenizer.nextToken()));
		pdfwriter = ((PdfWriter) (obj));
		if(((String) (obj)).startsWith("/"))
			pdfwriter = ((PdfWriter) (((String) (obj)).substring(1)));
		pdfarray.add(((PdfObject) (new PdfName(((String) (pdfwriter))))));
		i = 0;
_L39:
		if(i >= 4) goto _L27; else goto _L26
_L26:
		if(!stringtokenizer.hasMoreTokens()) goto _L27; else goto _L28
_L28:
		pdfwriter = ((PdfWriter) (stringtokenizer.nextToken()));
		if(((String) (pdfwriter)).equals("null"))
		{
			pdfarray.add(((PdfObject) (PdfNull.PDFNULL)));
			break MISSING_BLOCK_LABEL_866;
		}
		pdfarray.add(((PdfObject) (new PdfNumber(((String) (pdfwriter))))));
		break MISSING_BLOCK_LABEL_866;
_L21:
		if(!((String) (hashmap)).equals("false")) goto _L19; else goto _L29
_L29:
		((PdfDictionary) (obj1)).put(PdfName.NEWWINDOW, ((PdfObject) (PdfBoolean.PDFFALSE)));
		  goto _L19
_L14:
		if(!"URI".equals(obj)) goto _L31; else goto _L30
_L30:
		hashmap = ((HashMap) ((String)hashmap.get("URI")));
		if(hashmap == null) goto _L4; else goto _L32
_L32:
		pdfwriter = ((PdfWriter) (new PdfDictionary()));
		((PdfDictionary) (pdfwriter)).put(PdfName.S, ((PdfObject) (PdfName.URI)));
		((PdfDictionary) (pdfwriter)).put(PdfName.URI, ((PdfObject) (new PdfString(((String) (hashmap))))));
		pdfdictionary.put(PdfName.A, ((PdfObject) (pdfwriter)));
		return;
_L31:
		if(!"JS".equals(obj)) goto _L34; else goto _L33
_L33:
		hashmap = ((HashMap) ((String)hashmap.get("Code")));
		if(hashmap == null) goto _L4; else goto _L35
_L35:
		pdfdictionary.put(PdfName.A, ((PdfObject) (PdfAction.javaScript(((String) (hashmap)), pdfwriter))));
		return;
_L34:
		if(!"Launch".equals(obj)) goto _L4; else goto _L36
_L36:
		hashmap = ((HashMap) ((String)hashmap.get("File")));
		if(hashmap == null) goto _L4; else goto _L37
_L37:
		pdfwriter = ((PdfWriter) (new PdfDictionary()));
		((PdfDictionary) (pdfwriter)).put(PdfName.S, ((PdfObject) (PdfName.LAUNCH)));
		((PdfDictionary) (pdfwriter)).put(PdfName.F, ((PdfObject) (new PdfString(((String) (hashmap))))));
		pdfdictionary.put(PdfName.A, ((PdfObject) (pdfwriter)));
_L4:
		return;
_L12:
		i++;
	//  407  857:iload           4
	//  408  859:iconst_1        
	//  409  860:iadd            
	//  410  861:istore          4
		  goto _L38
	//* 411  863:goto            219
		i++;
	//  412  866:iload           4
	//  413  868:iconst_1        
	//  414  869:iadd            
	//  415  870:istore          4
		  goto _L39
	//* 416  872:goto            604
	}

	public static void eliminatePages(List list, int ai[])
	{
		if(list != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       5
_L1:
		return;
	//    2    4:return          
_L2:
		java.util.ListIterator listiterator = list.listIterator();
	//    3    5:aload_0         
	//    4    6:invokeinterface #352 <Method java.util.ListIterator List.listIterator()>
	//    5   11:astore          8
_L7:
		if(!((Iterator) (listiterator)).hasNext()) goto _L1; else goto _L3
	//    6   13:aload           8
	//    7   15:invokeinterface #357 <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            4
_L3:
		boolean flag;
		boolean flag1;
		HashMap hashmap;
		hashmap = (HashMap)((Iterator) (listiterator)).next();
	//    9   23:aload           8
	//   10   25:invokeinterface #361 <Method Object Iterator.next()>
	//   11   30:checkcast       #31  <Class HashMap>
	//   12   33:astore          9
		flag1 = false;
	//   13   35:iconst_0        
	//   14   36:istore          5
		flag = flag1;
	//   15   38:iload           5
	//   16   40:istore          4
		if(!"GoTo".equals(hashmap.get("Action"))) goto _L5; else goto _L4
	//   17   42:ldc2            #262 <String "GoTo">
	//   18   45:aload           9
	//   19   47:ldc1            #182 <String "Action">
	//   20   49:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   21   52:invokevirtual   #263 <Method boolean String.equals(Object)>
	//   22   55:ifeq            136
_L4:
		list = ((List) ((String)hashmap.get("Page")));
	//   23   58:aload           9
	//   24   60:ldc1            #239 <String "Page">
	//   25   62:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   26   65:checkcast       #126 <Class String>
	//   27   68:astore_0        
		flag = flag1;
	//   28   69:iload           5
	//   29   71:istore          4
		if(list == null) goto _L5; else goto _L6
	//   30   73:aload_0         
	//   31   74:ifnull          136
_L6:
		int j;
		list = ((List) (((String) (list)).trim()));
	//   32   77:aload_0         
	//   33   78:invokevirtual   #129 <Method String String.trim()>
	//   34   81:astore_0        
		int i = ((String) (list)).indexOf(' ');
	//   35   82:aload_0         
	//   36   83:bipush          32
	//   37   85:invokevirtual   #365 <Method int String.indexOf(int)>
	//   38   88:istore_2        
		int k;
		List list1;
		if(i < 0)
	//*  39   89:iload_2         
	//*  40   90:ifge            204
			i = Integer.parseInt(((String) (list)));
	//   41   93:aload_0         
	//   42   94:invokestatic    #285 <Method int Integer.parseInt(String)>
	//   43   97:istore_2        
		else
	//*  44   98:aload_1         
	//*  45   99:arraylength     
	//*  46  100:istore          6
	//*  47  102:iconst_0        
	//*  48  103:istore_3        
	//*  49  104:iload           5
	//*  50  106:istore          4
	//*  51  108:iload_3         
	//*  52  109:iload           6
	//*  53  111:bipush          -2
	//*  54  113:iand            
	//*  55  114:icmpge          136
	//*  56  117:iload_2         
	//*  57  118:aload_1         
	//*  58  119:iload_3         
	//*  59  120:iaload          
	//*  60  121:icmplt          217
	//*  61  124:iload_2         
	//*  62  125:aload_1         
	//*  63  126:iload_3         
	//*  64  127:iconst_1        
	//*  65  128:iadd            
	//*  66  129:iaload          
	//*  67  130:icmpgt          217
	//*  68  133:iconst_1        
	//*  69  134:istore          4
	//*  70  136:aload           9
	//*  71  138:ldc1            #153 <String "Kids">
	//*  72  140:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//*  73  143:checkcast       #348 <Class List>
	//*  74  146:astore          7
	//*  75  148:aload           7
	//*  76  150:astore_0        
	//*  77  151:aload           7
	//*  78  153:ifnull          185
	//*  79  156:aload           7
	//*  80  158:aload_1         
	//*  81  159:invokestatic    #367 <Method void eliminatePages(List, int[])>
	//*  82  162:aload           7
	//*  83  164:astore_0        
	//*  84  165:aload           7
	//*  85  167:invokeinterface #370 <Method boolean List.isEmpty()>
	//*  86  172:ifeq            185
	//*  87  175:aload           9
	//*  88  177:ldc1            #153 <String "Kids">
	//*  89  179:invokevirtual   #373 <Method Object HashMap.remove(Object)>
	//*  90  182:pop             
	//*  91  183:aconst_null     
	//*  92  184:astore_0        
	//*  93  185:iload           4
	//*  94  187:ifeq            13
	//*  95  190:aload_0         
	//*  96  191:ifnonnull       224
	//*  97  194:aload           8
	//*  98  196:invokeinterface #375 <Method void Iterator.remove()>
	//*  99  201:goto            13
			i = Integer.parseInt(((String) (list)).substring(0, i));
	//  100  204:aload_0         
	//  101  205:iconst_0        
	//  102  206:iload_2         
	//  103  207:invokevirtual   #378 <Method String String.substring(int, int)>
	//  104  210:invokestatic    #285 <Method int Integer.parseInt(String)>
	//  105  213:istore_2        
		k = ai.length;
		j = 0;
_L8:
		flag = flag1;
		if(j < (k & -2))
		{
			if(i < ai[j] || i > ai[j + 1])
				break MISSING_BLOCK_LABEL_217;
			flag = true;
		}
_L5:
		list1 = (List)hashmap.get("Kids");
		list = list1;
		if(list1 != null)
		{
			eliminatePages(list1, ai);
			list = list1;
			if(list1.isEmpty())
			{
				hashmap.remove("Kids");
				list = null;
			}
		}
		if(flag)
			if(list == null)
			{
				((Iterator) (listiterator)).remove();
			} else
	//* 106  214:goto            98
	//* 107  217:iload_3         
	//* 108  218:iconst_2        
	//* 109  219:iadd            
	//* 110  220:istore_3        
	//* 111  221:goto            104
			{
				hashmap.remove("Action");
	//  112  224:aload           9
	//  113  226:ldc1            #182 <String "Action">
	//  114  228:invokevirtual   #373 <Method Object HashMap.remove(Object)>
	//  115  231:pop             
				hashmap.remove("Page");
	//  116  232:aload           9
	//  117  234:ldc1            #239 <String "Page">
	//  118  236:invokevirtual   #373 <Method Object HashMap.remove(Object)>
	//  119  239:pop             
				hashmap.remove("Named");
	//  120  240:aload           9
	//  121  242:ldc1            #203 <String "Named">
	//  122  244:invokevirtual   #373 <Method Object HashMap.remove(Object)>
	//  123  247:pop             
			}
		  goto _L7
		j += 2;
		  goto _L8
	//* 124  248:goto            13
	}

	public static void exportToXML(List list, OutputStream outputstream, String s, boolean flag)
		throws IOException
	{
		exportToXML(list, ((Writer) (new BufferedWriter(((Writer) (new OutputStreamWriter(outputstream, IanaEncodings.getJavaEncoding(s))))))), s, flag);
	//    0    0:aload_0         
	//    1    1:new             #385 <Class BufferedWriter>
	//    2    4:dup             
	//    3    5:new             #387 <Class OutputStreamWriter>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokestatic    #392 <Method String IanaEncodings.getJavaEncoding(String)>
	//    8   14:invokespecial   #395 <Method void OutputStreamWriter(OutputStream, String)>
	//    9   17:invokespecial   #398 <Method void BufferedWriter(Writer)>
	//   10   20:aload_2         
	//   11   21:iload_3         
	//   12   22:invokestatic    #401 <Method void exportToXML(List, Writer, String, boolean)>
	//   13   25:return          
	}

	public static void exportToXML(List list, Writer writer, String s, boolean flag)
		throws IOException
	{
		writer.write("<?xml version=\"1.0\" encoding=\"");
	//    0    0:aload_1         
	//    1    1:ldc2            #405 <String "<?xml version=\"1.0\" encoding=\"">
	//    2    4:invokevirtual   #410 <Method void Writer.write(String)>
		writer.write(XMLUtil.escapeXML(s, flag));
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:invokestatic    #416 <Method String XMLUtil.escapeXML(String, boolean)>
	//    7   13:invokevirtual   #410 <Method void Writer.write(String)>
		writer.write("\"?>\n<Bookmark>\n");
	//    8   16:aload_1         
	//    9   17:ldc2            #418 <String "\"?>\n<Bookmark>\n">
	//   10   20:invokevirtual   #410 <Method void Writer.write(String)>
		exportToXMLNode(list, writer, 1, flag);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:iconst_1        
	//   14   26:iload_3         
	//   15   27:invokestatic    #422 <Method void exportToXMLNode(List, Writer, int, boolean)>
		writer.write("</Bookmark>\n");
	//   16   30:aload_1         
	//   17   31:ldc2            #424 <String "</Bookmark>\n">
	//   18   34:invokevirtual   #410 <Method void Writer.write(String)>
		writer.flush();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #427 <Method void Writer.flush()>
	//   21   41:return          
	}

	public static void exportToXMLNode(List list, Writer writer, int i, boolean flag)
		throws IOException
	{
		String s = "";
	//    0    0:ldc1            #111 <String "">
	//    1    2:astore          5
		String s1 = s;
	//    2    4:aload           5
	//    3    6:astore          6
		if(i != -1)
	//*   4    8:iload_2         
	//*   5    9:iconst_m1       
	//*   6   10:icmpeq          58
		{
			int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore          4
			do
			{
				s1 = s;
	//    9   16:aload           5
	//   10   18:astore          6
				if(j >= i)
					break;
	//   11   20:iload           4
	//   12   22:iload_2         
	//   13   23:icmpge          58
				s = (new StringBuilder()).append(s).append("  ").toString();
	//   14   26:new             #113 <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #114 <Method void StringBuilder()>
	//   17   33:aload           5
	//   18   35:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:ldc2            #430 <String "  ">
	//   20   41:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   22   47:astore          5
				j++;
	//   23   49:iload           4
	//   24   51:iconst_1        
	//   25   52:iadd            
	//   26   53:istore          4
			} while(true);
	//   27   55:goto            16
		}
		Iterator iterator = list.iterator();
	//   28   58:aload_0         
	//   29   59:invokeinterface #434 <Method Iterator List.iterator()>
	//   30   64:astore          9
		while(iterator.hasNext()) 
	//*  31   66:aload           9
	//*  32   68:invokeinterface #357 <Method boolean Iterator.hasNext()>
	//*  33   73:ifeq            358
		{
			Object obj = ((Object) ((HashMap)iterator.next()));
	//   34   76:aload           9
	//   35   78:invokeinterface #361 <Method Object Iterator.next()>
	//   36   83:checkcast       #31  <Class HashMap>
	//   37   86:astore          7
			list = null;
	//   38   88:aconst_null     
	//   39   89:astore_0        
			writer.write(s1);
	//   40   90:aload_1         
	//   41   91:aload           6
	//   42   93:invokevirtual   #410 <Method void Writer.write(String)>
			writer.write("<Title ");
	//   43   96:aload_1         
	//   44   97:ldc2            #436 <String "<Title ">
	//   45  100:invokevirtual   #410 <Method void Writer.write(String)>
			List list1 = null;
	//   46  103:aconst_null     
	//   47  104:astore          5
			Iterator iterator1 = ((HashMap) (obj)).entrySet().iterator();
	//   48  106:aload           7
	//   49  108:invokevirtual   #440 <Method Set HashMap.entrySet()>
	//   50  111:invokeinterface #443 <Method Iterator Set.iterator()>
	//   51  116:astore          10
label0:
			do
			{
label1:
				{
					if(!iterator1.hasNext())
						break label0;
	//   52  118:aload           10
	//   53  120:invokeinterface #357 <Method boolean Iterator.hasNext()>
	//   54  125:ifeq            277
					obj = ((Object) ((java.util.Map.Entry)iterator1.next()));
	//   55  128:aload           10
	//   56  130:invokeinterface #361 <Method Object Iterator.next()>
	//   57  135:checkcast       #445 <Class java.util.Map$Entry>
	//   58  138:astore          7
					String s3 = (String)((java.util.Map.Entry) (obj)).getKey();
	//   59  140:aload           7
	//   60  142:invokeinterface #448 <Method Object java.util.Map$Entry.getKey()>
	//   61  147:checkcast       #126 <Class String>
	//   62  150:astore          11
					if(s3.equals("Title"))
	//*  63  152:aload           11
	//*  64  154:ldc1            #34  <String "Title">
	//*  65  156:invokevirtual   #263 <Method boolean String.equals(Object)>
	//*  66  159:ifeq            176
					{
						list = ((List) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   67  162:aload           7
	//   68  164:invokeinterface #451 <Method Object java.util.Map$Entry.getValue()>
	//   69  169:checkcast       #126 <Class String>
	//   70  172:astore_0        
						continue;
	//   71  173:goto            118
					}
					if(s3.equals("Kids"))
	//*  72  176:aload           11
	//*  73  178:ldc1            #153 <String "Kids">
	//*  74  180:invokevirtual   #263 <Method boolean String.equals(Object)>
	//*  75  183:ifeq            201
					{
						list1 = (List)((java.util.Map.Entry) (obj)).getValue();
	//   76  186:aload           7
	//   77  188:invokeinterface #451 <Method Object java.util.Map$Entry.getValue()>
	//   78  193:checkcast       #348 <Class List>
	//   79  196:astore          5
						continue;
	//   80  198:goto            118
					}
					writer.write(s3);
	//   81  201:aload_1         
	//   82  202:aload           11
	//   83  204:invokevirtual   #410 <Method void Writer.write(String)>
					writer.write("=\"");
	//   84  207:aload_1         
	//   85  208:ldc2            #453 <String "=\"">
	//   86  211:invokevirtual   #410 <Method void Writer.write(String)>
					String s2 = (String)((java.util.Map.Entry) (obj)).getValue();
	//   87  214:aload           7
	//   88  216:invokeinterface #451 <Method Object java.util.Map$Entry.getValue()>
	//   89  221:checkcast       #126 <Class String>
	//   90  224:astore          8
					if(!s3.equals("Named"))
	//*  91  226:aload           11
	//*  92  228:ldc1            #203 <String "Named">
	//*  93  230:invokevirtual   #263 <Method boolean String.equals(Object)>
	//*  94  233:ifne            250
					{
						obj = ((Object) (s2));
	//   95  236:aload           8
	//   96  238:astore          7
						if(!s3.equals("NamedN"))
							break label1;
	//   97  240:aload           11
	//   98  242:ldc1            #217 <String "NamedN">
	//   99  244:invokevirtual   #263 <Method boolean String.equals(Object)>
	//  100  247:ifeq            257
					}
					obj = ((Object) (SimpleNamedDestination.escapeBinaryString(s2)));
	//  101  250:aload           8
	//  102  252:invokestatic    #458 <Method String SimpleNamedDestination.escapeBinaryString(String)>
	//  103  255:astore          7
				}
				writer.write(XMLUtil.escapeXML(((String) (obj)), flag));
	//  104  257:aload_1         
	//  105  258:aload           7
	//  106  260:iload_3         
	//  107  261:invokestatic    #416 <Method String XMLUtil.escapeXML(String, boolean)>
	//  108  264:invokevirtual   #410 <Method void Writer.write(String)>
				writer.write("\" ");
	//  109  267:aload_1         
	//  110  268:ldc2            #460 <String "\" ">
	//  111  271:invokevirtual   #410 <Method void Writer.write(String)>
			} while(true);
	//  112  274:goto            118
			writer.write(">");
	//  113  277:aload_1         
	//  114  278:ldc2            #462 <String ">">
	//  115  281:invokevirtual   #410 <Method void Writer.write(String)>
			obj = ((Object) (list));
	//  116  284:aload_0         
	//  117  285:astore          7
			if(list == null)
	//* 118  287:aload_0         
	//* 119  288:ifnonnull       295
				obj = "";
	//  120  291:ldc1            #111 <String "">
	//  121  293:astore          7
			writer.write(XMLUtil.escapeXML(((String) (obj)), flag));
	//  122  295:aload_1         
	//  123  296:aload           7
	//  124  298:iload_3         
	//  125  299:invokestatic    #416 <Method String XMLUtil.escapeXML(String, boolean)>
	//  126  302:invokevirtual   #410 <Method void Writer.write(String)>
			if(list1 != null)
	//* 127  305:aload           5
	//* 128  307:ifnull          340
			{
				writer.write("\n");
	//  129  310:aload_1         
	//  130  311:ldc2            #464 <String "\n">
	//  131  314:invokevirtual   #410 <Method void Writer.write(String)>
				int k;
				if(i == -1)
	//* 132  317:iload_2         
	//* 133  318:iconst_m1       
	//* 134  319:icmpne          350
					k = i;
	//  135  322:iload_2         
	//  136  323:istore          4
				else
	//* 137  325:aload           5
	//* 138  327:aload_1         
	//* 139  328:iload           4
	//* 140  330:iload_3         
	//* 141  331:invokestatic    #422 <Method void exportToXMLNode(List, Writer, int, boolean)>
	//* 142  334:aload_1         
	//* 143  335:aload           6
	//* 144  337:invokevirtual   #410 <Method void Writer.write(String)>
	//* 145  340:aload_1         
	//* 146  341:ldc2            #466 <String "</Title>\n">
	//* 147  344:invokevirtual   #410 <Method void Writer.write(String)>
	//* 148  347:goto            66
					k = i + 1;
	//  149  350:iload_2         
	//  150  351:iconst_1        
	//  151  352:iadd            
	//  152  353:istore          4
				exportToXMLNode(list1, writer, k, flag);
				writer.write(s1);
			}
			writer.write("</Title>\n");
		}
	//* 153  355:goto            325
	//  154  358:return          
	}

	public static List getBookmark(PdfReader pdfreader)
	{
		PdfObject pdfobject = PdfReader.getPdfObjectRelease(pdfreader.getCatalog().get(PdfName.OUTLINES));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #473 <Method PdfDictionary PdfReader.getCatalog()>
	//    2    4:getstatic       #476 <Field PdfName PdfName.OUTLINES>
	//    3    7:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//    4   10:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    5   13:astore_1        
		if(pdfobject == null || !pdfobject.isDictionary())
	//*   6   14:aload_1         
	//*   7   15:ifnull          25
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #243 <Method boolean PdfObject.isDictionary()>
	//*  10   22:ifne            27
			return null;
	//   11   25:aconst_null     
	//   12   26:areturn         
		else
			return getBookmark(pdfreader, (PdfDictionary)pdfobject, false);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:checkcast       #42  <Class PdfDictionary>
	//   16   32:iconst_0        
	//   17   33:invokestatic    #479 <Method List getBookmark(PdfReader, PdfDictionary, boolean)>
	//   18   36:areturn         
	}

	public static List getBookmark(PdfReader pdfreader, PdfDictionary pdfdictionary, boolean flag)
	{
		pdfreader.getCatalog();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #473 <Method PdfDictionary PdfReader.getCatalog()>
	//    2    4:pop             
		if(pdfdictionary == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		IntHashtable inthashtable = new IntHashtable();
	//    7   11:new             #482 <Class IntHashtable>
	//    8   14:dup             
	//    9   15:invokespecial   #483 <Method void IntHashtable()>
	//   10   18:astore          5
		int j = pdfreader.getNumberOfPages();
	//   11   20:aload_0         
	//   12   21:invokevirtual   #486 <Method int PdfReader.getNumberOfPages()>
	//   13   24:istore          4
		for(int i = 1; i <= j; i++)
	//*  14   26:iconst_1        
	//*  15   27:istore_3        
	//*  16   28:iload_3         
	//*  17   29:iload           4
	//*  18   31:icmpgt          61
		{
			inthashtable.put(pdfreader.getPageOrigRef(i).getNumber(), i);
	//   19   34:aload           5
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:invokevirtual   #490 <Method PRIndirectReference PdfReader.getPageOrigRef(int)>
	//   23   41:invokevirtual   #495 <Method int PRIndirectReference.getNumber()>
	//   24   44:iload_3         
	//   25   45:invokevirtual   #498 <Method int IntHashtable.put(int, int)>
	//   26   48:pop             
			pdfreader.releasePage(i);
	//   27   49:aload_0         
	//   28   50:iload_3         
	//   29   51:invokevirtual   #502 <Method void PdfReader.releasePage(int)>
		}

	//   30   54:iload_3         
	//   31   55:iconst_1        
	//   32   56:iadd            
	//   33   57:istore_3        
	//*  34   58:goto            28
		if(flag)
	//*  35   61:iload_2         
	//*  36   62:ifeq            74
			return bookmarkDepth(pdfreader, pdfdictionary, inthashtable, true);
	//   37   65:aload_0         
	//   38   66:aload_1         
	//   39   67:aload           5
	//   40   69:iconst_1        
	//   41   70:invokestatic    #155 <Method List bookmarkDepth(PdfReader, PdfDictionary, IntHashtable, boolean)>
	//   42   73:areturn         
		else
			return bookmarkDepth(pdfreader, (PdfDictionary)PdfReader.getPdfObjectRelease(pdfdictionary.get(PdfName.FIRST)), inthashtable, false);
	//   43   74:aload_0         
	//   44   75:aload_1         
	//   45   76:getstatic       #151 <Field PdfName PdfName.FIRST>
	//   46   79:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//   47   82:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//   48   85:checkcast       #42  <Class PdfDictionary>
	//   49   88:aload           5
	//   50   90:iconst_0        
	//   51   91:invokestatic    #155 <Method List bookmarkDepth(PdfReader, PdfDictionary, IntHashtable, boolean)>
	//   52   94:areturn         
	}

	private static int getNumber(PdfIndirectReference pdfindirectreference)
	{
		PdfDictionary pdfdictionary = (PdfDictionary)PdfReader.getPdfObjectRelease(((PdfObject) (pdfindirectreference)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #52  <Method PdfObject PdfReader.getPdfObjectRelease(PdfObject)>
	//    2    4:checkcast       #42  <Class PdfDictionary>
	//    3    7:astore_2        
		PdfIndirectReference pdfindirectreference1 = pdfindirectreference;
	//    4    8:aload_0         
	//    5    9:astore_1        
		if(pdfdictionary.contains(PdfName.TYPE))
	//*   6   10:aload_2         
	//*   7   11:getstatic       #507 <Field PdfName PdfName.TYPE>
	//*   8   14:invokevirtual   #511 <Method boolean PdfDictionary.contains(PdfName)>
	//*   9   17:ifeq            68
		{
			pdfindirectreference1 = pdfindirectreference;
	//   10   20:aload_0         
	//   11   21:astore_1        
			if(((Object) (pdfdictionary.get(PdfName.TYPE))).equals(((Object) (PdfName.PAGES))))
	//*  12   22:aload_2         
	//*  13   23:getstatic       #507 <Field PdfName PdfName.TYPE>
	//*  14   26:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//*  15   29:getstatic       #514 <Field PdfName PdfName.PAGES>
	//*  16   32:invokevirtual   #515 <Method boolean Object.equals(Object)>
	//*  17   35:ifeq            68
			{
				pdfindirectreference1 = pdfindirectreference;
	//   18   38:aload_0         
	//   19   39:astore_1        
				if(pdfdictionary.contains(PdfName.KIDS))
	//*  20   40:aload_2         
	//*  21   41:getstatic       #518 <Field PdfName PdfName.KIDS>
	//*  22   44:invokevirtual   #511 <Method boolean PdfDictionary.contains(PdfName)>
	//*  23   47:ifeq            68
					pdfindirectreference1 = (PdfIndirectReference)((PdfArray)pdfdictionary.get(PdfName.KIDS)).getPdfObject(0);
	//   24   50:aload_2         
	//   25   51:getstatic       #518 <Field PdfName PdfName.KIDS>
	//   26   54:invokevirtual   #46  <Method PdfObject PdfDictionary.get(PdfName)>
	//   27   57:checkcast       #67  <Class PdfArray>
	//   28   60:iconst_0        
	//   29   61:invokevirtual   #231 <Method PdfObject PdfArray.getPdfObject(int)>
	//   30   64:checkcast       #520 <Class PdfIndirectReference>
	//   31   67:astore_1        
			}
		}
		return pdfindirectreference1.getNumber();
	//   32   68:aload_1         
	//   33   69:invokevirtual   #521 <Method int PdfIndirectReference.getNumber()>
	//   34   72:ireturn         
	}

	public static List importFromXML(InputStream inputstream)
		throws IOException
	{
		SimpleBookmark simplebookmark = new SimpleBookmark();
	//    0    0:new             #2   <Class SimpleBookmark>
	//    1    3:dup             
	//    2    4:invokespecial   #524 <Method void SimpleBookmark()>
	//    3    7:astore_1        
		SimpleXMLParser.parse(((SimpleXMLDocHandler) (simplebookmark)), inputstream);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokestatic    #530 <Method void SimpleXMLParser.parse(SimpleXMLDocHandler, InputStream)>
		return ((List) (simplebookmark.topList));
	//    7   13:aload_1         
	//    8   14:getfield        #532 <Field ArrayList topList>
	//    9   17:areturn         
	}

	public static List importFromXML(Reader reader)
		throws IOException
	{
		SimpleBookmark simplebookmark = new SimpleBookmark();
	//    0    0:new             #2   <Class SimpleBookmark>
	//    1    3:dup             
	//    2    4:invokespecial   #524 <Method void SimpleBookmark()>
	//    3    7:astore_1        
		SimpleXMLParser.parse(((SimpleXMLDocHandler) (simplebookmark)), reader);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokestatic    #537 <Method void SimpleXMLParser.parse(SimpleXMLDocHandler, Reader)>
		return ((List) (simplebookmark.topList));
	//    7   13:aload_1         
	//    8   14:getfield        #532 <Field ArrayList topList>
	//    9   17:areturn         
	}

	public static Object[] iterateOutlines(PdfWriter pdfwriter, PdfIndirectReference pdfindirectreference, List list, boolean flag)
		throws IOException
	{
		int j;
		int i1;
		PdfIndirectReference apdfindirectreference[];
		java.util.ListIterator listiterator;
		apdfindirectreference = new PdfIndirectReference[list.size()];
	//    0    0:aload_2         
	//    1    1:invokeinterface #541 <Method int List.size()>
	//    2    6:anewarray       PdfIndirectReference[]
	//    3    9:astore          11
		for(int i = 0; i < apdfindirectreference.length; i++)
	//*   4   11:iconst_0        
	//*   5   12:istore          6
	//*   6   14:iload           6
	//*   7   16:aload           11
	//*   8   18:arraylength     
	//*   9   19:icmpge          40
			apdfindirectreference[i] = pdfwriter.getPdfIndirectReference();
	//   10   22:aload           11
	//   11   24:iload           6
	//   12   26:aload_0         
	//   13   27:invokevirtual   #545 <Method PdfIndirectReference PdfWriter.getPdfIndirectReference()>
	//   14   30:aastore         

	//   15   31:iload           6
	//   16   33:iconst_1        
	//   17   34:iadd            
	//   18   35:istore          6
	//*  19   37:goto            14
		i1 = 0;
	//   20   40:iconst_0        
	//   21   41:istore          8
		j = 0;
	//   22   43:iconst_0        
	//   23   44:istore          6
		listiterator = list.listIterator();
	//   24   46:aload_2         
	//   25   47:invokeinterface #352 <Method java.util.ListIterator List.listIterator()>
	//   26   52:astore          12
_L8:
		if(!((Iterator) (listiterator)).hasNext()) goto _L2; else goto _L1
	//   27   54:aload           12
	//   28   56:invokeinterface #357 <Method boolean Iterator.hasNext()>
	//   29   61:ifeq            547
_L1:
		float f;
		float f1;
		PdfDictionary pdfdictionary;
		HashMap hashmap;
		hashmap = (HashMap)((Iterator) (listiterator)).next();
	//   30   64:aload           12
	//   31   66:invokeinterface #361 <Method Object Iterator.next()>
	//   32   71:checkcast       #31  <Class HashMap>
	//   33   74:astore          13
		pdfdictionary = null;
	//   34   76:aconst_null     
	//   35   77:astore          10
		List list1 = (List)hashmap.get("Kids");
	//   36   79:aload           13
	//   37   81:ldc1            #153 <String "Kids">
	//   38   83:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   39   86:checkcast       #348 <Class List>
	//   40   89:astore          14
		list = ((List) (pdfdictionary));
	//   41   91:aload           10
	//   42   93:astore_2        
		if(list1 != null)
	//*  43   94:aload           14
	//*  44   96:ifnull          125
		{
			list = ((List) (pdfdictionary));
	//   45   99:aload           10
	//   46  101:astore_2        
			if(!list1.isEmpty())
	//*  47  102:aload           14
	//*  48  104:invokeinterface #370 <Method boolean List.isEmpty()>
	//*  49  109:ifne            125
				list = ((List) (iterateOutlines(pdfwriter, apdfindirectreference[i1], list1, flag)));
	//   50  112:aload_0         
	//   51  113:aload           11
	//   52  115:iload           8
	//   53  117:aaload          
	//   54  118:aload           14
	//   55  120:iload_3         
	//   56  121:invokestatic    #547 <Method Object[] iterateOutlines(PdfWriter, PdfIndirectReference, List, boolean)>
	//   57  124:astore_2        
		}
		pdfdictionary = new PdfDictionary();
	//   58  125:new             #42  <Class PdfDictionary>
	//   59  128:dup             
	//   60  129:invokespecial   #324 <Method void PdfDictionary()>
	//   61  132:astore          10
		int k = j + 1;
	//   62  134:iload           6
	//   63  136:iconst_1        
	//   64  137:iadd            
	//   65  138:istore          7
		j = k;
	//   66  140:iload           7
	//   67  142:istore          6
		if(list != null)
	//*  68  144:aload_2         
	//*  69  145:ifnull          224
		{
			pdfdictionary.put(PdfName.FIRST, ((PdfObject) ((PdfIndirectReference)list[0])));
	//   70  148:aload           10
	//   71  150:getstatic       #151 <Field PdfName PdfName.FIRST>
	//   72  153:aload_2         
	//   73  154:iconst_0        
	//   74  155:aaload          
	//   75  156:checkcast       #520 <Class PdfIndirectReference>
	//   76  159:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
			pdfdictionary.put(PdfName.LAST, ((PdfObject) ((PdfIndirectReference)list[1])));
	//   77  162:aload           10
	//   78  164:getstatic       #550 <Field PdfName PdfName.LAST>
	//   79  167:aload_2         
	//   80  168:iconst_1        
	//   81  169:aaload          
	//   82  170:checkcast       #520 <Class PdfIndirectReference>
	//   83  173:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
			j = ((Integer)list[2]).intValue();
	//   84  176:aload_2         
	//   85  177:iconst_2        
	//   86  178:aaload          
	//   87  179:checkcast       #281 <Class Integer>
	//   88  182:invokevirtual   #551 <Method int Integer.intValue()>
	//   89  185:istore          6
			Object obj;
			if("false".equals(hashmap.get("Open")))
	//*  90  187:ldc1            #141 <String "false">
	//*  91  189:aload           13
	//*  92  191:ldc1            #139 <String "Open">
	//*  93  193:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//*  94  196:invokevirtual   #263 <Method boolean String.equals(Object)>
	//*  95  199:ifeq            401
			{
				pdfdictionary.put(PdfName.COUNT, ((PdfObject) (new PdfNumber(-j))));
	//   96  202:aload           10
	//   97  204:getstatic       #137 <Field PdfName PdfName.COUNT>
	//   98  207:new             #80  <Class PdfNumber>
	//   99  210:dup             
	//  100  211:iload           6
	//  101  213:ineg            
	//  102  214:invokespecial   #553 <Method void PdfNumber(int)>
	//  103  217:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
				j = k;
	//  104  220:iload           7
	//  105  222:istore          6
			} else
	//* 106  224:aload           10
	//* 107  226:getstatic       #556 <Field PdfName PdfName.PARENT>
	//* 108  229:aload_1         
	//* 109  230:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 110  233:iload           8
	//* 111  235:ifle            253
	//* 112  238:aload           10
	//* 113  240:getstatic       #559 <Field PdfName PdfName.PREV>
	//* 114  243:aload           11
	//* 115  245:iload           8
	//* 116  247:iconst_1        
	//* 117  248:isub            
	//* 118  249:aaload          
	//* 119  250:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 120  253:iload           8
	//* 121  255:aload           11
	//* 122  257:arraylength     
	//* 123  258:iconst_1        
	//* 124  259:isub            
	//* 125  260:icmpge          278
	//* 126  263:aload           10
	//* 127  265:getstatic       #162 <Field PdfName PdfName.NEXT>
	//* 128  268:aload           11
	//* 129  270:iload           8
	//* 130  272:iconst_1        
	//* 131  273:iadd            
	//* 132  274:aaload          
	//* 133  275:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 134  278:aload           10
	//* 135  280:getstatic       #40  <Field PdfName PdfName.TITLE>
	//* 136  283:new             #54  <Class PdfString>
	//* 137  286:dup             
	//* 138  287:aload           13
	//* 139  289:ldc1            #34  <String "Title">
	//* 140  291:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 141  294:checkcast       #126 <Class String>
	//* 142  297:ldc2            #561 <String "UnicodeBig">
	//* 143  300:invokespecial   #272 <Method void PdfString(String, String)>
	//* 144  303:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 145  306:aload           13
	//* 146  308:ldc1            #93  <String "Color">
	//* 147  310:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 148  313:checkcast       #126 <Class String>
	//* 149  316:astore          14
	//* 150  318:aload           14
	//* 151  320:ifnull          437
	//* 152  323:new             #67  <Class PdfArray>
	//* 153  326:dup             
	//* 154  327:invokespecial   #273 <Method void PdfArray()>
	//* 155  330:astore_2        
	//* 156  331:new             #275 <Class StringTokenizer>
	//* 157  334:dup             
	//* 158  335:aload           14
	//* 159  337:invokespecial   #276 <Method void StringTokenizer(String)>
	//* 160  340:astore          14
	//* 161  342:iconst_0        
	//* 162  343:istore          7
	//* 163  345:iload           7
	//* 164  347:iconst_3        
	//* 165  348:icmpge          428
	//* 166  351:aload           14
	//* 167  353:invokevirtual   #279 <Method String StringTokenizer.nextToken()>
	//* 168  356:invokestatic    #567 <Method float Float.parseFloat(String)>
	//* 169  359:fstore          5
	//* 170  361:fload           5
	//* 171  363:fstore          4
	//* 172  365:fload           5
	//* 173  367:fconst_0        
	//* 174  368:fcmpg           
	//* 175  369:ifge            582
	//* 176  372:fconst_0        
	//* 177  373:fstore          4
	//* 178  375:goto            582
	//* 179  378:aload_2         
	//* 180  379:new             #80  <Class PdfNumber>
	//* 181  382:dup             
	//* 182  383:fload           5
	//* 183  385:invokespecial   #570 <Method void PdfNumber(float)>
	//* 184  388:invokevirtual   #294 <Method boolean PdfArray.add(PdfObject)>
	//* 185  391:pop             
	//* 186  392:iload           7
	//* 187  394:iconst_1        
	//* 188  395:iadd            
	//* 189  396:istore          7
	//* 190  398:goto            345
			{
				pdfdictionary.put(PdfName.COUNT, ((PdfObject) (new PdfNumber(j))));
	//  191  401:aload           10
	//  192  403:getstatic       #137 <Field PdfName PdfName.COUNT>
	//  193  406:new             #80  <Class PdfNumber>
	//  194  409:dup             
	//  195  410:iload           6
	//  196  412:invokespecial   #553 <Method void PdfNumber(int)>
	//  197  415:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
				j = k + j;
	//  198  418:iload           7
	//  199  420:iload           6
	//  200  422:iadd            
	//  201  423:istore          6
			}
		}
		pdfdictionary.put(PdfName.PARENT, ((PdfObject) (pdfindirectreference)));
		if(i1 > 0)
			pdfdictionary.put(PdfName.PREV, ((PdfObject) (apdfindirectreference[i1 - 1])));
		if(i1 < apdfindirectreference.length - 1)
			pdfdictionary.put(PdfName.NEXT, ((PdfObject) (apdfindirectreference[i1 + 1])));
		pdfdictionary.put(PdfName.TITLE, ((PdfObject) (new PdfString((String)hashmap.get("Title"), "UnicodeBig"))));
		obj = ((Object) ((String)hashmap.get("Color")));
		if(obj == null) goto _L4; else goto _L3
_L3:
		list = ((List) (new PdfArray()));
		obj = ((Object) (new StringTokenizer(((String) (obj)))));
		k = 0;
_L7:
		if(k >= 3) goto _L6; else goto _L5
_L5:
		f1 = Float.parseFloat(((StringTokenizer) (obj)).nextToken());
		f = f1;
		if(f1 < 0.0F)
			f = 0.0F;
		break MISSING_BLOCK_LABEL_582;
_L9:
		((PdfArray) (list)).add(((PdfObject) (new PdfNumber(f1))));
		k++;
		  goto _L7
	//* 202  425:goto            224
_L6:
		try
		{
			pdfdictionary.put(PdfName.C, ((PdfObject) (list)));
	//  203  428:aload           10
	//  204  430:getstatic       #65  <Field PdfName PdfName.C>
	//  205  433:aload_2         
	//  206  434:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
		}
	//* 207  437:aload           13
	//* 208  439:ldc1            #134 <String "Style">
	//* 209  441:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//* 210  444:checkcast       #126 <Class String>
	//* 211  447:astore_2        
	//* 212  448:aload_2         
	//* 213  449:ifnull          517
	//* 214  452:aload_2         
	//* 215  453:invokevirtual   #573 <Method String String.toLowerCase()>
	//* 216  456:astore_2        
	//* 217  457:iconst_0        
	//* 218  458:istore          7
	//* 219  460:aload_2         
	//* 220  461:ldc2            #575 <String "italic">
	//* 221  464:invokevirtual   #577 <Method int String.indexOf(String)>
	//* 222  467:iflt            475
	//* 223  470:iconst_0        
	//* 224  471:iconst_1        
	//* 225  472:ior             
	//* 226  473:istore          7
	//* 227  475:iload           7
	//* 228  477:istore          9
	//* 229  479:aload_2         
	//* 230  480:ldc2            #579 <String "bold">
	//* 231  483:invokevirtual   #577 <Method int String.indexOf(String)>
	//* 232  486:iflt            495
	//* 233  489:iload           7
	//* 234  491:iconst_2        
	//* 235  492:ior             
	//* 236  493:istore          9
	//* 237  495:iload           9
	//* 238  497:ifeq            517
	//* 239  500:aload           10
	//* 240  502:getstatic       #106 <Field PdfName PdfName.F>
	//* 241  505:new             #80  <Class PdfNumber>
	//* 242  508:dup             
	//* 243  509:iload           9
	//* 244  511:invokespecial   #553 <Method void PdfNumber(int)>
	//* 245  514:invokevirtual   #269 <Method void PdfDictionary.put(PdfName, PdfObject)>
	//* 246  517:aload           10
	//* 247  519:aload           13
	//* 248  521:aload_0         
	//* 249  522:iload_3         
	//* 250  523:invokestatic    #581 <Method void createOutlineAction(PdfDictionary, HashMap, PdfWriter, boolean)>
	//* 251  526:aload_0         
	//* 252  527:aload           10
	//* 253  529:aload           11
	//* 254  531:iload           8
	//* 255  533:aaload          
	//* 256  534:invokevirtual   #585 <Method PdfIndirectObject PdfWriter.addToBody(PdfObject, PdfIndirectReference)>
	//* 257  537:pop             
	//* 258  538:iload           8
	//* 259  540:iconst_1        
	//* 260  541:iadd            
	//* 261  542:istore          8
	//* 262  544:goto            54
	//* 263  547:iconst_3        
	//* 264  548:anewarray       Object[]
	//* 265  551:dup             
	//* 266  552:iconst_0        
	//* 267  553:aload           11
	//* 268  555:iconst_0        
	//* 269  556:aaload          
	//* 270  557:aastore         
	//* 271  558:dup             
	//* 272  559:iconst_1        
	//* 273  560:aload           11
	//* 274  562:aload           11
	//* 275  564:arraylength     
	//* 276  565:iconst_1        
	//* 277  566:isub            
	//* 278  567:aaload          
	//* 279  568:aastore         
	//* 280  569:dup             
	//* 281  570:iconst_2        
	//* 282  571:iload           6
	//* 283  573:invokestatic    #589 <Method Integer Integer.valueOf(int)>
	//* 284  576:aastore         
	//* 285  577:areturn         
		// Misplaced declaration of an exception variable
		catch(List list) { }
	//  286  578:astore_2        
_L4:
		list = ((List) ((String)hashmap.get("Style")));
		if(list != null)
		{
			list = ((List) (((String) (list)).toLowerCase()));
			int l = 0;
			if(((String) (list)).indexOf("italic") >= 0)
				l = ((int) (false | true));
			int j1 = l;
			if(((String) (list)).indexOf("bold") >= 0)
				j1 = l | 2;
			if(j1 != 0)
				pdfdictionary.put(PdfName.F, ((PdfObject) (new PdfNumber(j1))));
		}
		createOutlineAction(pdfdictionary, hashmap, pdfwriter, flag);
		pdfwriter.addToBody(((PdfObject) (pdfdictionary)), apdfindirectreference[i1]);
		i1++;
		  goto _L8
_L2:
		return (new Object[] {
			apdfindirectreference[0], apdfindirectreference[apdfindirectreference.length - 1], Integer.valueOf(j)
		});
	//* 287  579:goto            437
		f1 = f;
	//  288  582:fload           4
	//  289  584:fstore          5
		if(f > 1.0F)
	//* 290  586:fload           4
	//* 291  588:fconst_1        
	//* 292  589:fcmpl           
	//* 293  590:ifle            378
			f1 = 1.0F;
	//  294  593:fconst_1        
	//  295  594:fstore          5
		  goto _L9
	//* 296  596:goto            378
	}

	private static String makeBookmarkParam(PdfArray pdfarray, IntHashtable inthashtable)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #226 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #227 <Method void StringBuffer()>
	//    3    7:astore_3        
		PdfObject pdfobject = pdfarray.getPdfObject(0);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #231 <Method PdfObject PdfArray.getPdfObject(int)>
	//    7   13:astore          4
		if(pdfobject.isNumber())
	//*   8   15:aload           4
	//*   9   17:invokevirtual   #595 <Method boolean PdfObject.isNumber()>
	//*  10   20:ifeq            95
			stringbuffer.append(((PdfNumber)pdfobject).intValue() + 1);
	//   11   23:aload_3         
	//   12   24:aload           4
	//   13   26:checkcast       #80  <Class PdfNumber>
	//   14   29:invokevirtual   #109 <Method int PdfNumber.intValue()>
	//   15   32:iconst_1        
	//   16   33:iadd            
	//   17   34:invokevirtual   #598 <Method StringBuffer StringBuffer.append(int)>
	//   18   37:pop             
		else
	//*  19   38:aload_3         
	//*  20   39:bipush          32
	//*  21   41:invokevirtual   #237 <Method StringBuffer StringBuffer.append(char)>
	//*  22   44:aload_0         
	//*  23   45:iconst_1        
	//*  24   46:invokevirtual   #231 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  25   49:invokevirtual   #194 <Method String PdfObject.toString()>
	//*  26   52:iconst_1        
	//*  27   53:invokevirtual   #314 <Method String String.substring(int)>
	//*  28   56:invokevirtual   #234 <Method StringBuffer StringBuffer.append(String)>
	//*  29   59:pop             
	//*  30   60:iconst_2        
	//*  31   61:istore_2        
	//*  32   62:iload_2         
	//*  33   63:aload_0         
	//*  34   64:invokevirtual   #71  <Method int PdfArray.size()>
	//*  35   67:icmpge          115
	//*  36   70:aload_3         
	//*  37   71:bipush          32
	//*  38   73:invokevirtual   #237 <Method StringBuffer StringBuffer.append(char)>
	//*  39   76:aload_0         
	//*  40   77:iload_2         
	//*  41   78:invokevirtual   #231 <Method PdfObject PdfArray.getPdfObject(int)>
	//*  42   81:invokevirtual   #194 <Method String PdfObject.toString()>
	//*  43   84:invokevirtual   #234 <Method StringBuffer StringBuffer.append(String)>
	//*  44   87:pop             
	//*  45   88:iload_2         
	//*  46   89:iconst_1        
	//*  47   90:iadd            
	//*  48   91:istore_2        
	//*  49   92:goto            62
			stringbuffer.append(inthashtable.get(getNumber((PdfIndirectReference)pdfobject)));
	//   50   95:aload_3         
	//   51   96:aload_1         
	//   52   97:aload           4
	//   53   99:checkcast       #520 <Class PdfIndirectReference>
	//   54  102:invokestatic    #600 <Method int getNumber(PdfIndirectReference)>
	//   55  105:invokevirtual   #602 <Method int IntHashtable.get(int)>
	//   56  108:invokevirtual   #598 <Method StringBuffer StringBuffer.append(int)>
	//   57  111:pop             
		stringbuffer.append(' ').append(pdfarray.getPdfObject(1).toString().substring(1));
		for(int i = 2; i < pdfarray.size(); i++)
			stringbuffer.append(' ').append(pdfarray.getPdfObject(i).toString());

	//*  58  112:goto            38
		return stringbuffer.toString();
	//   59  115:aload_3         
	//   60  116:invokevirtual   #240 <Method String StringBuffer.toString()>
	//   61  119:areturn         
	}

	private static void mapGotoBookmark(HashMap hashmap, PdfObject pdfobject, IntHashtable inthashtable)
	{
		if(!pdfobject.isString()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #201 <Method boolean PdfObject.isString()>
	//    2    4:ifeq            29
_L1:
		hashmap.put("Named", ((Object) (pdfobject.toString())));
	//    3    7:aload_0         
	//    4    8:ldc1            #203 <String "Named">
	//    5   10:aload_1         
	//    6   11:invokevirtual   #194 <Method String PdfObject.toString()>
	//    7   14:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//    8   17:pop             
_L4:
		hashmap.put("Action", "GoTo");
	//    9   18:aload_0         
	//   10   19:ldc1            #182 <String "Action">
	//   11   21:ldc2            #262 <String "GoTo">
	//   12   24:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
		return;
	//   14   28:return          
_L2:
		if(pdfobject.isName())
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #215 <Method boolean PdfObject.isName()>
	//*  17   33:ifeq            53
			hashmap.put("Named", ((Object) (PdfName.decodeName(pdfobject.toString()))));
	//   18   36:aload_0         
	//   19   37:ldc1            #203 <String "Named">
	//   20   39:aload_1         
	//   21   40:invokevirtual   #194 <Method String PdfObject.toString()>
	//   22   43:invokestatic    #221 <Method String PdfName.decodeName(String)>
	//   23   46:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   24   49:pop             
		else
	//*  25   50:goto            18
		if(pdfobject.isArray())
	//*  26   53:aload_1         
	//*  27   54:invokevirtual   #224 <Method boolean PdfObject.isArray()>
	//*  28   57:ifeq            18
			hashmap.put("Page", ((Object) (makeBookmarkParam((PdfArray)pdfobject, inthashtable))));
	//   29   60:aload_0         
	//   30   61:ldc1            #239 <String "Page">
	//   31   63:aload_1         
	//   32   64:checkcast       #67  <Class PdfArray>
	//   33   67:aload_2         
	//   34   68:invokestatic    #604 <Method String makeBookmarkParam(PdfArray, IntHashtable)>
	//   35   71:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   36   74:pop             
		if(true) goto _L4; else goto _L3
	//   37   75:goto            18
_L3:
	}

	public static void shiftPageNumbers(List list, int i, int ai[])
	{
		if(list != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       5
_L1:
		return;
	//    2    4:return          
_L2:
		java.util.ListIterator listiterator = list.listIterator();
	//    3    5:aload_0         
	//    4    6:invokeinterface #352 <Method java.util.ListIterator List.listIterator()>
	//    5   11:astore          10
_L9:
		if(!((Iterator) (listiterator)).hasNext()) goto _L1; else goto _L3
	//    6   13:aload           10
	//    7   15:invokeinterface #357 <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            4
_L3:
		HashMap hashmap = (HashMap)((Iterator) (listiterator)).next();
	//    9   23:aload           10
	//   10   25:invokeinterface #361 <Method Object Iterator.next()>
	//   11   30:checkcast       #31  <Class HashMap>
	//   12   33:astore          11
		if(!"GoTo".equals(hashmap.get("Action"))) goto _L5; else goto _L4
	//   13   35:ldc2            #262 <String "GoTo">
	//   14   38:aload           11
	//   15   40:ldc1            #182 <String "Action">
	//   16   42:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   17   45:invokevirtual   #263 <Method boolean String.equals(Object)>
	//   18   48:ifeq            131
_L4:
		list = ((List) ((String)hashmap.get("Page")));
	//   19   51:aload           11
	//   20   53:ldc1            #239 <String "Page">
	//   21   55:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   22   58:checkcast       #126 <Class String>
	//   23   61:astore_0        
		if(list == null) goto _L5; else goto _L6
	//   24   62:aload_0         
	//   25   63:ifnull          131
_L6:
		boolean flag;
		int j;
		boolean flag1;
		int l;
		String s;
		s = ((String) (list)).trim();
	//   26   66:aload_0         
	//   27   67:invokevirtual   #129 <Method String String.trim()>
	//   28   70:astore          9
		l = s.indexOf(' ');
	//   29   72:aload           9
	//   30   74:bipush          32
	//   31   76:invokevirtual   #365 <Method int String.indexOf(int)>
	//   32   79:istore          7
		if(l < 0)
	//*  33   81:iload           7
	//*  34   83:ifge            155
			j = Integer.parseInt(s);
	//   35   86:aload           9
	//   36   88:invokestatic    #285 <Method int Integer.parseInt(String)>
	//   37   91:istore          4
		else
	//*  38   93:iconst_0        
	//*  39   94:istore          6
	//*  40   96:aload_2         
	//*  41   97:ifnonnull       171
	//*  42  100:iconst_1        
	//*  43  101:istore_3        
	//*  44  102:aload           9
	//*  45  104:astore_0        
	//*  46  105:iload_3         
	//*  47  106:ifeq            122
	//*  48  109:iload           7
	//*  49  111:ifge            225
	//*  50  114:iload           4
	//*  51  116:iload_1         
	//*  52  117:iadd            
	//*  53  118:invokestatic    #609 <Method String Integer.toString(int)>
	//*  54  121:astore_0        
	//*  55  122:aload           11
	//*  56  124:ldc1            #239 <String "Page">
	//*  57  126:aload_0         
	//*  58  127:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//*  59  130:pop             
	//*  60  131:aload           11
	//*  61  133:ldc1            #153 <String "Kids">
	//*  62  135:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//*  63  138:checkcast       #348 <Class List>
	//*  64  141:astore_0        
	//*  65  142:aload_0         
	//*  66  143:ifnull          13
	//*  67  146:aload_0         
	//*  68  147:iload_1         
	//*  69  148:aload_2         
	//*  70  149:invokestatic    #611 <Method void shiftPageNumbers(List, int, int[])>
	//*  71  152:goto            13
			j = Integer.parseInt(s.substring(0, l));
	//   72  155:aload           9
	//   73  157:iconst_0        
	//   74  158:iload           7
	//   75  160:invokevirtual   #378 <Method String String.substring(int, int)>
	//   76  163:invokestatic    #285 <Method int Integer.parseInt(String)>
	//   77  166:istore          4
		flag1 = false;
		if(ai != null) goto _L8; else goto _L7
_L7:
		flag = true;
_L10:
		list = ((List) (s));
		int k;
		int i1;
		if(flag)
			if(l < 0)
				list = ((List) (Integer.toString(j + i)));
			else
	//*  78  168:goto            93
	//*  79  171:aload_2         
	//*  80  172:arraylength     
	//*  81  173:istore          8
	//*  82  175:iconst_0        
	//*  83  176:istore          5
	//*  84  178:iload           6
	//*  85  180:istore_3        
	//*  86  181:iload           5
	//*  87  183:iload           8
	//*  88  185:bipush          -2
	//*  89  187:iand            
	//*  90  188:icmpge          102
	//*  91  191:iload           4
	//*  92  193:aload_2         
	//*  93  194:iload           5
	//*  94  196:iaload          
	//*  95  197:icmplt          216
	//*  96  200:iload           4
	//*  97  202:aload_2         
	//*  98  203:iload           5
	//*  99  205:iconst_1        
	//* 100  206:iadd            
	//* 101  207:iaload          
	//* 102  208:icmpgt          216
	//* 103  211:iconst_1        
	//* 104  212:istore_3        
	//* 105  213:goto            102
	//* 106  216:iload           5
	//* 107  218:iconst_2        
	//* 108  219:iadd            
	//* 109  220:istore          5
	//* 110  222:goto            178
				list = ((List) ((new StringBuilder()).append(j + i).append(s.substring(l)).toString()));
	//  111  225:new             #113 <Class StringBuilder>
	//  112  228:dup             
	//  113  229:invokespecial   #114 <Method void StringBuilder()>
	//  114  232:iload           4
	//  115  234:iload_1         
	//  116  235:iadd            
	//  117  236:invokevirtual   #614 <Method StringBuilder StringBuilder.append(int)>
	//  118  239:aload           9
	//  119  241:iload           7
	//  120  243:invokevirtual   #314 <Method String String.substring(int)>
	//  121  246:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//  122  249:invokevirtual   #122 <Method String StringBuilder.toString()>
	//  123  252:astore_0        
		hashmap.put("Page", ((Object) (list)));
_L5:
		list = (List)hashmap.get("Kids");
		if(list != null)
			shiftPageNumbers(list, i, ai);
		  goto _L9
_L8:
		i1 = ai.length;
		k = 0;
_L11:
		flag = flag1;
		if(k < (i1 & -2))
		{
label0:
			{
				if(j < ai[k] || j > ai[k + 1])
					break label0;
				flag = true;
			}
		}
		  goto _L10
		k += 2;
		  goto _L11
	//* 124  253:goto            122
	}

	public void endDocument()
	{
	//    0    0:return          
	}

	public void endElement(String s)
	{
		if(s.equals("Bookmark"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #619 <String "Bookmark">
	//*   2    4:invokevirtual   #263 <Method boolean String.equals(Object)>
	//*   3    7:ifeq            39
			if(attr.isEmpty())
	//*   4   10:aload_0         
	//*   5   11:getfield        #21  <Field Stack attr>
	//*   6   14:invokevirtual   #620 <Method boolean Stack.isEmpty()>
	//*   7   17:ifeq            21
				return;
	//    8   20:return          
			else
				throw new RuntimeException(MessageLocalization.getComposedMessage("bookmark.end.tag.out.of.place", new Object[0]));
	//    9   21:new             #622 <Class RuntimeException>
	//   10   24:dup             
	//   11   25:ldc2            #624 <String "bookmark.end.tag.out.of.place">
	//   12   28:iconst_0        
	//   13   29:anewarray       Object[]
	//   14   32:invokestatic    #630 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   35:invokespecial   #631 <Method void RuntimeException(String)>
	//   16   38:athrow          
		if(!s.equals("Title"))
	//*  17   39:aload_1         
	//*  18   40:ldc1            #34  <String "Title">
	//*  19   42:invokevirtual   #263 <Method boolean String.equals(Object)>
	//*  20   45:ifne            70
			throw new RuntimeException(MessageLocalization.getComposedMessage("invalid.end.tag.1", new Object[] {
				s
			}));
	//   21   48:new             #622 <Class RuntimeException>
	//   22   51:dup             
	//   23   52:ldc2            #633 <String "invalid.end.tag.1">
	//   24   55:iconst_1        
	//   25   56:anewarray       Object[]
	//   26   59:dup             
	//   27   60:iconst_0        
	//   28   61:aload_1         
	//   29   62:aastore         
	//   30   63:invokestatic    #630 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   31   66:invokespecial   #631 <Method void RuntimeException(String)>
	//   32   69:athrow          
		HashMap hashmap = (HashMap)attr.pop();
	//   33   70:aload_0         
	//   34   71:getfield        #21  <Field Stack attr>
	//   35   74:invokevirtual   #636 <Method Object Stack.pop()>
	//   36   77:checkcast       #31  <Class HashMap>
	//   37   80:astore_3        
		hashmap.put("Title", ((Object) (((String)hashmap.get("Title")).trim())));
	//   38   81:aload_3         
	//   39   82:ldc1            #34  <String "Title">
	//   40   84:aload_3         
	//   41   85:ldc1            #34  <String "Title">
	//   42   87:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   43   90:checkcast       #126 <Class String>
	//   44   93:invokevirtual   #129 <Method String String.trim()>
	//   45   96:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   46   99:pop             
		s = (String)hashmap.get("Named");
	//   47  100:aload_3         
	//   48  101:ldc1            #203 <String "Named">
	//   49  103:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   50  106:checkcast       #126 <Class String>
	//   51  109:astore_1        
		if(s != null)
	//*  52  110:aload_1         
	//*  53  111:ifnull          125
			hashmap.put("Named", ((Object) (SimpleNamedDestination.unEscapeBinaryString(s))));
	//   54  114:aload_3         
	//   55  115:ldc1            #203 <String "Named">
	//   56  117:aload_1         
	//   57  118:invokestatic    #639 <Method String SimpleNamedDestination.unEscapeBinaryString(String)>
	//   58  121:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   59  124:pop             
		s = (String)hashmap.get("NamedN");
	//   60  125:aload_3         
	//   61  126:ldc1            #217 <String "NamedN">
	//   62  128:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   63  131:checkcast       #126 <Class String>
	//   64  134:astore_1        
		if(s != null)
	//*  65  135:aload_1         
	//*  66  136:ifnull          150
			hashmap.put("NamedN", ((Object) (SimpleNamedDestination.unEscapeBinaryString(s))));
	//   67  139:aload_3         
	//   68  140:ldc1            #217 <String "NamedN">
	//   69  142:aload_1         
	//   70  143:invokestatic    #639 <Method String SimpleNamedDestination.unEscapeBinaryString(String)>
	//   71  146:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   72  149:pop             
		if(attr.isEmpty())
	//*  73  150:aload_0         
	//*  74  151:getfield        #21  <Field Stack attr>
	//*  75  154:invokevirtual   #620 <Method boolean Stack.isEmpty()>
	//*  76  157:ifeq            170
		{
			topList.add(((Object) (hashmap)));
	//   77  160:aload_0         
	//   78  161:getfield        #532 <Field ArrayList topList>
	//   79  164:aload_3         
	//   80  165:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//   81  168:pop             
			return;
	//   82  169:return          
		}
		HashMap hashmap1 = (HashMap)attr.peek();
	//   83  170:aload_0         
	//   84  171:getfield        #21  <Field Stack attr>
	//   85  174:invokevirtual   #642 <Method Object Stack.peek()>
	//   86  177:checkcast       #31  <Class HashMap>
	//   87  180:astore          4
		List list = (List)hashmap1.get("Kids");
	//   88  182:aload           4
	//   89  184:ldc1            #153 <String "Kids">
	//   90  186:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   91  189:checkcast       #348 <Class List>
	//   92  192:astore_2        
		s = ((String) (list));
	//   93  193:aload_2         
	//   94  194:astore_1        
		if(list == null)
	//*  95  195:aload_2         
	//*  96  196:ifnonnull       216
		{
			s = ((String) (new ArrayList()));
	//   97  199:new             #28  <Class ArrayList>
	//   98  202:dup             
	//   99  203:invokespecial   #29  <Method void ArrayList()>
	//  100  206:astore_1        
			hashmap1.put("Kids", ((Object) (s)));
	//  101  207:aload           4
	//  102  209:ldc1            #153 <String "Kids">
	//  103  211:aload_1         
	//  104  212:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//  105  215:pop             
		}
		((List) (s)).add(((Object) (hashmap)));
	//  106  216:aload_1         
	//  107  217:aload_3         
	//  108  218:invokeinterface #643 <Method boolean List.add(Object)>
	//  109  223:pop             
	//  110  224:return          
	}

	public void startDocument()
	{
	//    0    0:return          
	}

	public void startElement(String s, Map map)
	{
		if(topList == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #532 <Field ArrayList topList>
	//*   2    4:ifnonnull       51
			if(s.equals("Bookmark"))
	//*   3    7:aload_1         
	//*   4    8:ldc2            #619 <String "Bookmark">
	//*   5   11:invokevirtual   #263 <Method boolean String.equals(Object)>
	//*   6   14:ifeq            29
			{
				topList = new ArrayList();
	//    7   17:aload_0         
	//    8   18:new             #28  <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #29  <Method void ArrayList()>
	//   11   25:putfield        #532 <Field ArrayList topList>
				return;
	//   12   28:return          
			} else
			{
				throw new RuntimeException(MessageLocalization.getComposedMessage("root.element.is.not.bookmark.1", new Object[] {
					s
				}));
	//   13   29:new             #622 <Class RuntimeException>
	//   14   32:dup             
	//   15   33:ldc2            #648 <String "root.element.is.not.bookmark.1">
	//   16   36:iconst_1        
	//   17   37:anewarray       Object[]
	//   18   40:dup             
	//   19   41:iconst_0        
	//   20   42:aload_1         
	//   21   43:aastore         
	//   22   44:invokestatic    #630 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   23   47:invokespecial   #631 <Method void RuntimeException(String)>
	//   24   50:athrow          
			}
		if(!s.equals("Title"))
	//*  25   51:aload_1         
	//*  26   52:ldc1            #34  <String "Title">
	//*  27   54:invokevirtual   #263 <Method boolean String.equals(Object)>
	//*  28   57:ifne            82
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("tag.1.not.allowed", new Object[] {
				s
			}));
	//   29   60:new             #622 <Class RuntimeException>
	//   30   63:dup             
	//   31   64:ldc2            #650 <String "tag.1.not.allowed">
	//   32   67:iconst_1        
	//   33   68:anewarray       Object[]
	//   34   71:dup             
	//   35   72:iconst_0        
	//   36   73:aload_1         
	//   37   74:aastore         
	//   38   75:invokestatic    #630 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   39   78:invokespecial   #631 <Method void RuntimeException(String)>
	//   40   81:athrow          
		} else
		{
			s = ((String) (new HashMap(map)));
	//   41   82:new             #31  <Class HashMap>
	//   42   85:dup             
	//   43   86:aload_2         
	//   44   87:invokespecial   #653 <Method void HashMap(Map)>
	//   45   90:astore_1        
			((HashMap) (s)).put("Title", "");
	//   46   91:aload_1         
	//   47   92:ldc1            #34  <String "Title">
	//   48   94:ldc1            #111 <String "">
	//   49   96:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   50   99:pop             
			((HashMap) (s)).remove("Kids");
	//   51  100:aload_1         
	//   52  101:ldc1            #153 <String "Kids">
	//   53  103:invokevirtual   #373 <Method Object HashMap.remove(Object)>
	//   54  106:pop             
			attr.push(((Object) (s)));
	//   55  107:aload_0         
	//   56  108:getfield        #21  <Field Stack attr>
	//   57  111:aload_1         
	//   58  112:invokevirtual   #656 <Method Object Stack.push(Object)>
	//   59  115:pop             
			return;
	//   60  116:return          
		}
	}

	public void text(String s)
	{
		if(attr.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Stack attr>
	//*   2    4:invokevirtual   #620 <Method boolean Stack.isEmpty()>
	//*   3    7:ifeq            11
		{
			return;
	//    4   10:return          
		} else
		{
			HashMap hashmap = (HashMap)attr.peek();
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field Stack attr>
	//    7   15:invokevirtual   #642 <Method Object Stack.peek()>
	//    8   18:checkcast       #31  <Class HashMap>
	//    9   21:astore_2        
			String s1 = (String)hashmap.get("Title");
	//   10   22:aload_2         
	//   11   23:ldc1            #34  <String "Title">
	//   12   25:invokevirtual   #260 <Method Object HashMap.get(Object)>
	//   13   28:checkcast       #126 <Class String>
	//   14   31:astore_3        
			hashmap.put("Title", ((Object) ((new StringBuilder()).append(s1).append(s).toString())));
	//   15   32:aload_2         
	//   16   33:ldc1            #34  <String "Title">
	//   17   35:new             #113 <Class StringBuilder>
	//   18   38:dup             
	//   19   39:invokespecial   #114 <Method void StringBuilder()>
	//   20   42:aload_3         
	//   21   43:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:invokevirtual   #122 <Method String StringBuilder.toString()>
	//   25   53:invokevirtual   #62  <Method Object HashMap.put(Object, Object)>
	//   26   56:pop             
			return;
	//   27   57:return          
		}
	}

	private final Stack attr = new Stack();
	private ArrayList topList;
}
