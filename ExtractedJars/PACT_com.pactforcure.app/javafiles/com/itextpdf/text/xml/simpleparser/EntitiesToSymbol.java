// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.simpleparser;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import java.util.HashMap;
import java.util.Map;

public class EntitiesToSymbol
{

	public EntitiesToSymbol()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #578 <Method void Object()>
	//    2    4:return          
	}

	public static Chunk get(String s, Font font)
	{
		char c = getCorrespondingSymbol(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #586 <Method char getCorrespondingSymbol(String)>
	//    2    4:istore_2        
		if(c == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            39
		{
			Chunk chunk;
			try
			{
				chunk = new Chunk(String.valueOf((char)Integer.parseInt(s)), font);
	//    5    9:new             #588 <Class Chunk>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokestatic    #594 <Method int Integer.parseInt(String)>
	//    9   17:int2char        
	//   10   18:invokestatic    #599 <Method String String.valueOf(char)>
	//   11   21:aload_1         
	//   12   22:invokespecial   #602 <Method void Chunk(String, Font)>
	//   13   25:astore_3        
			}
	//*  14   26:aload_3         
	//*  15   27:areturn         
			catch(Exception exception)
	//*  16   28:astore_3        
			{
				return new Chunk(s, font);
	//   17   29:new             #588 <Class Chunk>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokespecial   #602 <Method void Chunk(String, Font)>
	//   22   38:areturn         
			}
			return chunk;
		} else
		{
			return new Chunk(String.valueOf(c), new Font(com.itextpdf.text.Font.FontFamily.SYMBOL, font.getSize(), font.getStyle(), font.getColor()));
	//   23   39:new             #588 <Class Chunk>
	//   24   42:dup             
	//   25   43:iload_2         
	//   26   44:invokestatic    #599 <Method String String.valueOf(char)>
	//   27   47:new             #604 <Class Font>
	//   28   50:dup             
	//   29   51:getstatic       #610 <Field com.itextpdf.text.Font$FontFamily com.itextpdf.text.Font$FontFamily.SYMBOL>
	//   30   54:aload_1         
	//   31   55:invokevirtual   #614 <Method float Font.getSize()>
	//   32   58:aload_1         
	//   33   59:invokevirtual   #618 <Method int Font.getStyle()>
	//   34   62:aload_1         
	//   35   63:invokevirtual   #622 <Method com.itextpdf.text.BaseColor Font.getColor()>
	//   36   66:invokespecial   #625 <Method void Font(com.itextpdf.text.Font$FontFamily, float, int, com.itextpdf.text.BaseColor)>
	//   37   69:invokespecial   #602 <Method void Chunk(String, Font)>
	//   38   72:areturn         
		}
	}

	public static char getCorrespondingSymbol(String s)
	{
		s = ((String) ((Character)MAP.get(((Object) (s)))));
	//    0    0:getstatic       #16  <Field Map MAP>
	//    1    3:aload_0         
	//    2    4:invokeinterface #628 <Method Object Map.get(Object)>
	//    3    9:checkcast       #20  <Class Character>
	//    4   12:astore_0        
		if(s == null)
	//*   5   13:aload_0         
	//*   6   14:ifnonnull       19
			return '\0';
	//    7   17:iconst_0        
	//    8   18:ireturn         
		else
			return ((Character) (s)).charValue();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #632 <Method char Character.charValue()>
	//   11   23:ireturn         
	}

	private static final Map MAP;

	static 
	{
		MAP = ((Map) (new HashMap()));
	//    0    0:new             #11  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void HashMap()>
	//    3    7:putstatic       #16  <Field Map MAP>
		MAP.put("169", ((Object) (Character.valueOf('\343'))));
	//    4   10:getstatic       #16  <Field Map MAP>
	//    5   13:ldc1            #18  <String "169">
	//    6   15:sipush          227
	//    7   18:invokestatic    #24  <Method Character Character.valueOf(char)>
	//    8   21:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//    9   26:pop             
		MAP.put("172", ((Object) (Character.valueOf('\330'))));
	//   10   27:getstatic       #16  <Field Map MAP>
	//   11   30:ldc1            #32  <String "172">
	//   12   32:sipush          216
	//   13   35:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   14   38:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   15   43:pop             
		MAP.put("174", ((Object) (Character.valueOf('\322'))));
	//   16   44:getstatic       #16  <Field Map MAP>
	//   17   47:ldc1            #34  <String "174">
	//   18   49:sipush          210
	//   19   52:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   20   55:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   21   60:pop             
		MAP.put("177", ((Object) (Character.valueOf('\261'))));
	//   22   61:getstatic       #16  <Field Map MAP>
	//   23   64:ldc1            #36  <String "177">
	//   24   66:sipush          177
	//   25   69:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   26   72:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   27   77:pop             
		MAP.put("215", ((Object) (Character.valueOf('\264'))));
	//   28   78:getstatic       #16  <Field Map MAP>
	//   29   81:ldc1            #38  <String "215">
	//   30   83:sipush          180
	//   31   86:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   32   89:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   33   94:pop             
		MAP.put("247", ((Object) (Character.valueOf('\270'))));
	//   34   95:getstatic       #16  <Field Map MAP>
	//   35   98:ldc1            #40  <String "247">
	//   36  100:sipush          184
	//   37  103:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   38  106:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   39  111:pop             
		MAP.put("8230", ((Object) (Character.valueOf('\274'))));
	//   40  112:getstatic       #16  <Field Map MAP>
	//   41  115:ldc1            #42  <String "8230">
	//   42  117:sipush          188
	//   43  120:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   44  123:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   45  128:pop             
		MAP.put("8242", ((Object) (Character.valueOf('\242'))));
	//   46  129:getstatic       #16  <Field Map MAP>
	//   47  132:ldc1            #44  <String "8242">
	//   48  134:sipush          162
	//   49  137:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   50  140:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   51  145:pop             
		MAP.put("8243", ((Object) (Character.valueOf('\262'))));
	//   52  146:getstatic       #16  <Field Map MAP>
	//   53  149:ldc1            #46  <String "8243">
	//   54  151:sipush          178
	//   55  154:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   56  157:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   57  162:pop             
		MAP.put("8260", ((Object) (Character.valueOf('\244'))));
	//   58  163:getstatic       #16  <Field Map MAP>
	//   59  166:ldc1            #48  <String "8260">
	//   60  168:sipush          164
	//   61  171:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   62  174:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   63  179:pop             
		MAP.put("8364", ((Object) (Character.valueOf('\360'))));
	//   64  180:getstatic       #16  <Field Map MAP>
	//   65  183:ldc1            #50  <String "8364">
	//   66  185:sipush          240
	//   67  188:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   68  191:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   69  196:pop             
		MAP.put("8465", ((Object) (Character.valueOf('\301'))));
	//   70  197:getstatic       #16  <Field Map MAP>
	//   71  200:ldc1            #52  <String "8465">
	//   72  202:sipush          193
	//   73  205:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   74  208:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   75  213:pop             
		MAP.put("8472", ((Object) (Character.valueOf('\303'))));
	//   76  214:getstatic       #16  <Field Map MAP>
	//   77  217:ldc1            #54  <String "8472">
	//   78  219:sipush          195
	//   79  222:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   80  225:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   81  230:pop             
		MAP.put("8476", ((Object) (Character.valueOf('\302'))));
	//   82  231:getstatic       #16  <Field Map MAP>
	//   83  234:ldc1            #56  <String "8476">
	//   84  236:sipush          194
	//   85  239:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   86  242:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   87  247:pop             
		MAP.put("8482", ((Object) (Character.valueOf('\324'))));
	//   88  248:getstatic       #16  <Field Map MAP>
	//   89  251:ldc1            #58  <String "8482">
	//   90  253:sipush          212
	//   91  256:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   92  259:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   93  264:pop             
		MAP.put("8501", ((Object) (Character.valueOf('\300'))));
	//   94  265:getstatic       #16  <Field Map MAP>
	//   95  268:ldc1            #60  <String "8501">
	//   96  270:sipush          192
	//   97  273:invokestatic    #24  <Method Character Character.valueOf(char)>
	//   98  276:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   99  281:pop             
		MAP.put("8592", ((Object) (Character.valueOf('\254'))));
	//  100  282:getstatic       #16  <Field Map MAP>
	//  101  285:ldc1            #62  <String "8592">
	//  102  287:sipush          172
	//  103  290:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  104  293:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  105  298:pop             
		MAP.put("8593", ((Object) (Character.valueOf('\255'))));
	//  106  299:getstatic       #16  <Field Map MAP>
	//  107  302:ldc1            #64  <String "8593">
	//  108  304:sipush          173
	//  109  307:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  110  310:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  111  315:pop             
		MAP.put("8594", ((Object) (Character.valueOf('\256'))));
	//  112  316:getstatic       #16  <Field Map MAP>
	//  113  319:ldc1            #66  <String "8594">
	//  114  321:sipush          174
	//  115  324:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  116  327:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  117  332:pop             
		MAP.put("8595", ((Object) (Character.valueOf('\257'))));
	//  118  333:getstatic       #16  <Field Map MAP>
	//  119  336:ldc1            #68  <String "8595">
	//  120  338:sipush          175
	//  121  341:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  122  344:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  123  349:pop             
		MAP.put("8596", ((Object) (Character.valueOf('\253'))));
	//  124  350:getstatic       #16  <Field Map MAP>
	//  125  353:ldc1            #70  <String "8596">
	//  126  355:sipush          171
	//  127  358:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  128  361:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  129  366:pop             
		MAP.put("8629", ((Object) (Character.valueOf('\277'))));
	//  130  367:getstatic       #16  <Field Map MAP>
	//  131  370:ldc1            #72  <String "8629">
	//  132  372:sipush          191
	//  133  375:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  134  378:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  135  383:pop             
		MAP.put("8656", ((Object) (Character.valueOf('\334'))));
	//  136  384:getstatic       #16  <Field Map MAP>
	//  137  387:ldc1            #74  <String "8656">
	//  138  389:sipush          220
	//  139  392:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  140  395:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  141  400:pop             
		MAP.put("8657", ((Object) (Character.valueOf('\335'))));
	//  142  401:getstatic       #16  <Field Map MAP>
	//  143  404:ldc1            #76  <String "8657">
	//  144  406:sipush          221
	//  145  409:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  146  412:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  147  417:pop             
		MAP.put("8658", ((Object) (Character.valueOf('\336'))));
	//  148  418:getstatic       #16  <Field Map MAP>
	//  149  421:ldc1            #78  <String "8658">
	//  150  423:sipush          222
	//  151  426:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  152  429:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  153  434:pop             
		MAP.put("8659", ((Object) (Character.valueOf('\337'))));
	//  154  435:getstatic       #16  <Field Map MAP>
	//  155  438:ldc1            #80  <String "8659">
	//  156  440:sipush          223
	//  157  443:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  158  446:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  159  451:pop             
		MAP.put("8660", ((Object) (Character.valueOf('\333'))));
	//  160  452:getstatic       #16  <Field Map MAP>
	//  161  455:ldc1            #82  <String "8660">
	//  162  457:sipush          219
	//  163  460:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  164  463:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  165  468:pop             
		MAP.put("8704", ((Object) (Character.valueOf('"'))));
	//  166  469:getstatic       #16  <Field Map MAP>
	//  167  472:ldc1            #84  <String "8704">
	//  168  474:bipush          34
	//  169  476:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  170  479:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  171  484:pop             
		MAP.put("8706", ((Object) (Character.valueOf('\266'))));
	//  172  485:getstatic       #16  <Field Map MAP>
	//  173  488:ldc1            #86  <String "8706">
	//  174  490:sipush          182
	//  175  493:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  176  496:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  177  501:pop             
		MAP.put("8707", ((Object) (Character.valueOf('$'))));
	//  178  502:getstatic       #16  <Field Map MAP>
	//  179  505:ldc1            #88  <String "8707">
	//  180  507:bipush          36
	//  181  509:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  182  512:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  183  517:pop             
		MAP.put("8709", ((Object) (Character.valueOf('\306'))));
	//  184  518:getstatic       #16  <Field Map MAP>
	//  185  521:ldc1            #90  <String "8709">
	//  186  523:sipush          198
	//  187  526:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  188  529:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  189  534:pop             
		MAP.put("8711", ((Object) (Character.valueOf('\321'))));
	//  190  535:getstatic       #16  <Field Map MAP>
	//  191  538:ldc1            #92  <String "8711">
	//  192  540:sipush          209
	//  193  543:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  194  546:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  195  551:pop             
		MAP.put("8712", ((Object) (Character.valueOf('\316'))));
	//  196  552:getstatic       #16  <Field Map MAP>
	//  197  555:ldc1            #94  <String "8712">
	//  198  557:sipush          206
	//  199  560:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  200  563:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  201  568:pop             
		MAP.put("8713", ((Object) (Character.valueOf('\317'))));
	//  202  569:getstatic       #16  <Field Map MAP>
	//  203  572:ldc1            #96  <String "8713">
	//  204  574:sipush          207
	//  205  577:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  206  580:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  207  585:pop             
		MAP.put("8717", ((Object) (Character.valueOf('\''))));
	//  208  586:getstatic       #16  <Field Map MAP>
	//  209  589:ldc1            #98  <String "8717">
	//  210  591:bipush          39
	//  211  593:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  212  596:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  213  601:pop             
		MAP.put("8719", ((Object) (Character.valueOf('\325'))));
	//  214  602:getstatic       #16  <Field Map MAP>
	//  215  605:ldc1            #100 <String "8719">
	//  216  607:sipush          213
	//  217  610:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  218  613:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  219  618:pop             
		MAP.put("8721", ((Object) (Character.valueOf('\345'))));
	//  220  619:getstatic       #16  <Field Map MAP>
	//  221  622:ldc1            #102 <String "8721">
	//  222  624:sipush          229
	//  223  627:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  224  630:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  225  635:pop             
		MAP.put("8722", ((Object) (Character.valueOf('-'))));
	//  226  636:getstatic       #16  <Field Map MAP>
	//  227  639:ldc1            #104 <String "8722">
	//  228  641:bipush          45
	//  229  643:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  230  646:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  231  651:pop             
		MAP.put("8727", ((Object) (Character.valueOf('*'))));
	//  232  652:getstatic       #16  <Field Map MAP>
	//  233  655:ldc1            #106 <String "8727">
	//  234  657:bipush          42
	//  235  659:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  236  662:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  237  667:pop             
		MAP.put("8729", ((Object) (Character.valueOf('\267'))));
	//  238  668:getstatic       #16  <Field Map MAP>
	//  239  671:ldc1            #108 <String "8729">
	//  240  673:sipush          183
	//  241  676:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  242  679:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  243  684:pop             
		MAP.put("8730", ((Object) (Character.valueOf('\326'))));
	//  244  685:getstatic       #16  <Field Map MAP>
	//  245  688:ldc1            #110 <String "8730">
	//  246  690:sipush          214
	//  247  693:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  248  696:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  249  701:pop             
		MAP.put("8733", ((Object) (Character.valueOf('\265'))));
	//  250  702:getstatic       #16  <Field Map MAP>
	//  251  705:ldc1            #112 <String "8733">
	//  252  707:sipush          181
	//  253  710:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  254  713:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  255  718:pop             
		MAP.put("8734", ((Object) (Character.valueOf('\245'))));
	//  256  719:getstatic       #16  <Field Map MAP>
	//  257  722:ldc1            #114 <String "8734">
	//  258  724:sipush          165
	//  259  727:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  260  730:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  261  735:pop             
		MAP.put("8736", ((Object) (Character.valueOf('\320'))));
	//  262  736:getstatic       #16  <Field Map MAP>
	//  263  739:ldc1            #116 <String "8736">
	//  264  741:sipush          208
	//  265  744:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  266  747:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  267  752:pop             
		MAP.put("8743", ((Object) (Character.valueOf('\331'))));
	//  268  753:getstatic       #16  <Field Map MAP>
	//  269  756:ldc1            #118 <String "8743">
	//  270  758:sipush          217
	//  271  761:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  272  764:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  273  769:pop             
		MAP.put("8744", ((Object) (Character.valueOf('\332'))));
	//  274  770:getstatic       #16  <Field Map MAP>
	//  275  773:ldc1            #120 <String "8744">
	//  276  775:sipush          218
	//  277  778:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  278  781:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  279  786:pop             
		MAP.put("8745", ((Object) (Character.valueOf('\307'))));
	//  280  787:getstatic       #16  <Field Map MAP>
	//  281  790:ldc1            #122 <String "8745">
	//  282  792:sipush          199
	//  283  795:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  284  798:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  285  803:pop             
		MAP.put("8746", ((Object) (Character.valueOf('\310'))));
	//  286  804:getstatic       #16  <Field Map MAP>
	//  287  807:ldc1            #124 <String "8746">
	//  288  809:sipush          200
	//  289  812:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  290  815:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  291  820:pop             
		MAP.put("8747", ((Object) (Character.valueOf('\362'))));
	//  292  821:getstatic       #16  <Field Map MAP>
	//  293  824:ldc1            #126 <String "8747">
	//  294  826:sipush          242
	//  295  829:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  296  832:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  297  837:pop             
		MAP.put("8756", ((Object) (Character.valueOf('\\'))));
	//  298  838:getstatic       #16  <Field Map MAP>
	//  299  841:ldc1            #128 <String "8756">
	//  300  843:bipush          92
	//  301  845:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  302  848:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  303  853:pop             
		MAP.put("8764", ((Object) (Character.valueOf('~'))));
	//  304  854:getstatic       #16  <Field Map MAP>
	//  305  857:ldc1            #130 <String "8764">
	//  306  859:bipush          126
	//  307  861:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  308  864:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  309  869:pop             
		MAP.put("8773", ((Object) (Character.valueOf('@'))));
	//  310  870:getstatic       #16  <Field Map MAP>
	//  311  873:ldc1            #132 <String "8773">
	//  312  875:bipush          64
	//  313  877:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  314  880:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  315  885:pop             
		MAP.put("8776", ((Object) (Character.valueOf('\273'))));
	//  316  886:getstatic       #16  <Field Map MAP>
	//  317  889:ldc1            #134 <String "8776">
	//  318  891:sipush          187
	//  319  894:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  320  897:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  321  902:pop             
		MAP.put("8800", ((Object) (Character.valueOf('\271'))));
	//  322  903:getstatic       #16  <Field Map MAP>
	//  323  906:ldc1            #136 <String "8800">
	//  324  908:sipush          185
	//  325  911:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  326  914:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  327  919:pop             
		MAP.put("8801", ((Object) (Character.valueOf('\272'))));
	//  328  920:getstatic       #16  <Field Map MAP>
	//  329  923:ldc1            #138 <String "8801">
	//  330  925:sipush          186
	//  331  928:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  332  931:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  333  936:pop             
		MAP.put("8804", ((Object) (Character.valueOf('\243'))));
	//  334  937:getstatic       #16  <Field Map MAP>
	//  335  940:ldc1            #140 <String "8804">
	//  336  942:sipush          163
	//  337  945:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  338  948:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  339  953:pop             
		MAP.put("8805", ((Object) (Character.valueOf('\263'))));
	//  340  954:getstatic       #16  <Field Map MAP>
	//  341  957:ldc1            #142 <String "8805">
	//  342  959:sipush          179
	//  343  962:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  344  965:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  345  970:pop             
		MAP.put("8834", ((Object) (Character.valueOf('\314'))));
	//  346  971:getstatic       #16  <Field Map MAP>
	//  347  974:ldc1            #144 <String "8834">
	//  348  976:sipush          204
	//  349  979:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  350  982:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  351  987:pop             
		MAP.put("8835", ((Object) (Character.valueOf('\311'))));
	//  352  988:getstatic       #16  <Field Map MAP>
	//  353  991:ldc1            #146 <String "8835">
	//  354  993:sipush          201
	//  355  996:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  356  999:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  357 1004:pop             
		MAP.put("8836", ((Object) (Character.valueOf('\313'))));
	//  358 1005:getstatic       #16  <Field Map MAP>
	//  359 1008:ldc1            #148 <String "8836">
	//  360 1010:sipush          203
	//  361 1013:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  362 1016:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  363 1021:pop             
		MAP.put("8838", ((Object) (Character.valueOf('\315'))));
	//  364 1022:getstatic       #16  <Field Map MAP>
	//  365 1025:ldc1            #150 <String "8838">
	//  366 1027:sipush          205
	//  367 1030:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  368 1033:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  369 1038:pop             
		MAP.put("8839", ((Object) (Character.valueOf('\312'))));
	//  370 1039:getstatic       #16  <Field Map MAP>
	//  371 1042:ldc1            #152 <String "8839">
	//  372 1044:sipush          202
	//  373 1047:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  374 1050:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  375 1055:pop             
		MAP.put("8853", ((Object) (Character.valueOf('\305'))));
	//  376 1056:getstatic       #16  <Field Map MAP>
	//  377 1059:ldc1            #154 <String "8853">
	//  378 1061:sipush          197
	//  379 1064:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  380 1067:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  381 1072:pop             
		MAP.put("8855", ((Object) (Character.valueOf('\304'))));
	//  382 1073:getstatic       #16  <Field Map MAP>
	//  383 1076:ldc1            #156 <String "8855">
	//  384 1078:sipush          196
	//  385 1081:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  386 1084:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  387 1089:pop             
		MAP.put("8869", ((Object) (Character.valueOf('^'))));
	//  388 1090:getstatic       #16  <Field Map MAP>
	//  389 1093:ldc1            #158 <String "8869">
	//  390 1095:bipush          94
	//  391 1097:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  392 1100:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  393 1105:pop             
		MAP.put("8901", ((Object) (Character.valueOf('\327'))));
	//  394 1106:getstatic       #16  <Field Map MAP>
	//  395 1109:ldc1            #160 <String "8901">
	//  396 1111:sipush          215
	//  397 1114:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  398 1117:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  399 1122:pop             
		MAP.put("8992", ((Object) (Character.valueOf('\363'))));
	//  400 1123:getstatic       #16  <Field Map MAP>
	//  401 1126:ldc1            #162 <String "8992">
	//  402 1128:sipush          243
	//  403 1131:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  404 1134:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  405 1139:pop             
		MAP.put("8993", ((Object) (Character.valueOf('\365'))));
	//  406 1140:getstatic       #16  <Field Map MAP>
	//  407 1143:ldc1            #164 <String "8993">
	//  408 1145:sipush          245
	//  409 1148:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  410 1151:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  411 1156:pop             
		MAP.put("9001", ((Object) (Character.valueOf('\341'))));
	//  412 1157:getstatic       #16  <Field Map MAP>
	//  413 1160:ldc1            #166 <String "9001">
	//  414 1162:sipush          225
	//  415 1165:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  416 1168:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  417 1173:pop             
		MAP.put("9002", ((Object) (Character.valueOf('\361'))));
	//  418 1174:getstatic       #16  <Field Map MAP>
	//  419 1177:ldc1            #168 <String "9002">
	//  420 1179:sipush          241
	//  421 1182:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  422 1185:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  423 1190:pop             
		MAP.put("913", ((Object) (Character.valueOf('A'))));
	//  424 1191:getstatic       #16  <Field Map MAP>
	//  425 1194:ldc1            #170 <String "913">
	//  426 1196:bipush          65
	//  427 1198:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  428 1201:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  429 1206:pop             
		MAP.put("914", ((Object) (Character.valueOf('B'))));
	//  430 1207:getstatic       #16  <Field Map MAP>
	//  431 1210:ldc1            #172 <String "914">
	//  432 1212:bipush          66
	//  433 1214:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  434 1217:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  435 1222:pop             
		MAP.put("915", ((Object) (Character.valueOf('G'))));
	//  436 1223:getstatic       #16  <Field Map MAP>
	//  437 1226:ldc1            #174 <String "915">
	//  438 1228:bipush          71
	//  439 1230:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  440 1233:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  441 1238:pop             
		MAP.put("916", ((Object) (Character.valueOf('D'))));
	//  442 1239:getstatic       #16  <Field Map MAP>
	//  443 1242:ldc1            #176 <String "916">
	//  444 1244:bipush          68
	//  445 1246:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  446 1249:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  447 1254:pop             
		MAP.put("917", ((Object) (Character.valueOf('E'))));
	//  448 1255:getstatic       #16  <Field Map MAP>
	//  449 1258:ldc1            #178 <String "917">
	//  450 1260:bipush          69
	//  451 1262:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  452 1265:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  453 1270:pop             
		MAP.put("918", ((Object) (Character.valueOf('Z'))));
	//  454 1271:getstatic       #16  <Field Map MAP>
	//  455 1274:ldc1            #180 <String "918">
	//  456 1276:bipush          90
	//  457 1278:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  458 1281:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  459 1286:pop             
		MAP.put("919", ((Object) (Character.valueOf('H'))));
	//  460 1287:getstatic       #16  <Field Map MAP>
	//  461 1290:ldc1            #182 <String "919">
	//  462 1292:bipush          72
	//  463 1294:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  464 1297:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  465 1302:pop             
		MAP.put("920", ((Object) (Character.valueOf('Q'))));
	//  466 1303:getstatic       #16  <Field Map MAP>
	//  467 1306:ldc1            #184 <String "920">
	//  468 1308:bipush          81
	//  469 1310:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  470 1313:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  471 1318:pop             
		MAP.put("921", ((Object) (Character.valueOf('I'))));
	//  472 1319:getstatic       #16  <Field Map MAP>
	//  473 1322:ldc1            #186 <String "921">
	//  474 1324:bipush          73
	//  475 1326:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  476 1329:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  477 1334:pop             
		MAP.put("922", ((Object) (Character.valueOf('K'))));
	//  478 1335:getstatic       #16  <Field Map MAP>
	//  479 1338:ldc1            #188 <String "922">
	//  480 1340:bipush          75
	//  481 1342:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  482 1345:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  483 1350:pop             
		MAP.put("923", ((Object) (Character.valueOf('L'))));
	//  484 1351:getstatic       #16  <Field Map MAP>
	//  485 1354:ldc1            #190 <String "923">
	//  486 1356:bipush          76
	//  487 1358:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  488 1361:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  489 1366:pop             
		MAP.put("924", ((Object) (Character.valueOf('M'))));
	//  490 1367:getstatic       #16  <Field Map MAP>
	//  491 1370:ldc1            #192 <String "924">
	//  492 1372:bipush          77
	//  493 1374:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  494 1377:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  495 1382:pop             
		MAP.put("925", ((Object) (Character.valueOf('N'))));
	//  496 1383:getstatic       #16  <Field Map MAP>
	//  497 1386:ldc1            #194 <String "925">
	//  498 1388:bipush          78
	//  499 1390:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  500 1393:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  501 1398:pop             
		MAP.put("926", ((Object) (Character.valueOf('X'))));
	//  502 1399:getstatic       #16  <Field Map MAP>
	//  503 1402:ldc1            #196 <String "926">
	//  504 1404:bipush          88
	//  505 1406:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  506 1409:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  507 1414:pop             
		MAP.put("927", ((Object) (Character.valueOf('O'))));
	//  508 1415:getstatic       #16  <Field Map MAP>
	//  509 1418:ldc1            #198 <String "927">
	//  510 1420:bipush          79
	//  511 1422:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  512 1425:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  513 1430:pop             
		MAP.put("928", ((Object) (Character.valueOf('P'))));
	//  514 1431:getstatic       #16  <Field Map MAP>
	//  515 1434:ldc1            #200 <String "928">
	//  516 1436:bipush          80
	//  517 1438:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  518 1441:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  519 1446:pop             
		MAP.put("929", ((Object) (Character.valueOf('R'))));
	//  520 1447:getstatic       #16  <Field Map MAP>
	//  521 1450:ldc1            #202 <String "929">
	//  522 1452:bipush          82
	//  523 1454:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  524 1457:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  525 1462:pop             
		MAP.put("931", ((Object) (Character.valueOf('S'))));
	//  526 1463:getstatic       #16  <Field Map MAP>
	//  527 1466:ldc1            #204 <String "931">
	//  528 1468:bipush          83
	//  529 1470:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  530 1473:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  531 1478:pop             
		MAP.put("932", ((Object) (Character.valueOf('T'))));
	//  532 1479:getstatic       #16  <Field Map MAP>
	//  533 1482:ldc1            #206 <String "932">
	//  534 1484:bipush          84
	//  535 1486:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  536 1489:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  537 1494:pop             
		MAP.put("933", ((Object) (Character.valueOf('U'))));
	//  538 1495:getstatic       #16  <Field Map MAP>
	//  539 1498:ldc1            #208 <String "933">
	//  540 1500:bipush          85
	//  541 1502:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  542 1505:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  543 1510:pop             
		MAP.put("934", ((Object) (Character.valueOf('F'))));
	//  544 1511:getstatic       #16  <Field Map MAP>
	//  545 1514:ldc1            #210 <String "934">
	//  546 1516:bipush          70
	//  547 1518:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  548 1521:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  549 1526:pop             
		MAP.put("935", ((Object) (Character.valueOf('C'))));
	//  550 1527:getstatic       #16  <Field Map MAP>
	//  551 1530:ldc1            #212 <String "935">
	//  552 1532:bipush          67
	//  553 1534:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  554 1537:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  555 1542:pop             
		MAP.put("936", ((Object) (Character.valueOf('Y'))));
	//  556 1543:getstatic       #16  <Field Map MAP>
	//  557 1546:ldc1            #214 <String "936">
	//  558 1548:bipush          89
	//  559 1550:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  560 1553:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  561 1558:pop             
		MAP.put("937", ((Object) (Character.valueOf('W'))));
	//  562 1559:getstatic       #16  <Field Map MAP>
	//  563 1562:ldc1            #216 <String "937">
	//  564 1564:bipush          87
	//  565 1566:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  566 1569:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  567 1574:pop             
		MAP.put("945", ((Object) (Character.valueOf('a'))));
	//  568 1575:getstatic       #16  <Field Map MAP>
	//  569 1578:ldc1            #218 <String "945">
	//  570 1580:bipush          97
	//  571 1582:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  572 1585:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  573 1590:pop             
		MAP.put("946", ((Object) (Character.valueOf('b'))));
	//  574 1591:getstatic       #16  <Field Map MAP>
	//  575 1594:ldc1            #220 <String "946">
	//  576 1596:bipush          98
	//  577 1598:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  578 1601:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  579 1606:pop             
		MAP.put("947", ((Object) (Character.valueOf('g'))));
	//  580 1607:getstatic       #16  <Field Map MAP>
	//  581 1610:ldc1            #222 <String "947">
	//  582 1612:bipush          103
	//  583 1614:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  584 1617:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  585 1622:pop             
		MAP.put("948", ((Object) (Character.valueOf('d'))));
	//  586 1623:getstatic       #16  <Field Map MAP>
	//  587 1626:ldc1            #224 <String "948">
	//  588 1628:bipush          100
	//  589 1630:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  590 1633:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  591 1638:pop             
		MAP.put("949", ((Object) (Character.valueOf('e'))));
	//  592 1639:getstatic       #16  <Field Map MAP>
	//  593 1642:ldc1            #226 <String "949">
	//  594 1644:bipush          101
	//  595 1646:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  596 1649:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  597 1654:pop             
		MAP.put("950", ((Object) (Character.valueOf('z'))));
	//  598 1655:getstatic       #16  <Field Map MAP>
	//  599 1658:ldc1            #228 <String "950">
	//  600 1660:bipush          122
	//  601 1662:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  602 1665:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  603 1670:pop             
		MAP.put("951", ((Object) (Character.valueOf('h'))));
	//  604 1671:getstatic       #16  <Field Map MAP>
	//  605 1674:ldc1            #230 <String "951">
	//  606 1676:bipush          104
	//  607 1678:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  608 1681:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  609 1686:pop             
		MAP.put("952", ((Object) (Character.valueOf('q'))));
	//  610 1687:getstatic       #16  <Field Map MAP>
	//  611 1690:ldc1            #232 <String "952">
	//  612 1692:bipush          113
	//  613 1694:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  614 1697:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  615 1702:pop             
		MAP.put("953", ((Object) (Character.valueOf('i'))));
	//  616 1703:getstatic       #16  <Field Map MAP>
	//  617 1706:ldc1            #234 <String "953">
	//  618 1708:bipush          105
	//  619 1710:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  620 1713:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  621 1718:pop             
		MAP.put("954", ((Object) (Character.valueOf('k'))));
	//  622 1719:getstatic       #16  <Field Map MAP>
	//  623 1722:ldc1            #236 <String "954">
	//  624 1724:bipush          107
	//  625 1726:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  626 1729:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  627 1734:pop             
		MAP.put("955", ((Object) (Character.valueOf('l'))));
	//  628 1735:getstatic       #16  <Field Map MAP>
	//  629 1738:ldc1            #238 <String "955">
	//  630 1740:bipush          108
	//  631 1742:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  632 1745:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  633 1750:pop             
		MAP.put("956", ((Object) (Character.valueOf('m'))));
	//  634 1751:getstatic       #16  <Field Map MAP>
	//  635 1754:ldc1            #240 <String "956">
	//  636 1756:bipush          109
	//  637 1758:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  638 1761:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  639 1766:pop             
		MAP.put("957", ((Object) (Character.valueOf('n'))));
	//  640 1767:getstatic       #16  <Field Map MAP>
	//  641 1770:ldc1            #242 <String "957">
	//  642 1772:bipush          110
	//  643 1774:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  644 1777:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  645 1782:pop             
		MAP.put("958", ((Object) (Character.valueOf('x'))));
	//  646 1783:getstatic       #16  <Field Map MAP>
	//  647 1786:ldc1            #244 <String "958">
	//  648 1788:bipush          120
	//  649 1790:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  650 1793:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  651 1798:pop             
		MAP.put("959", ((Object) (Character.valueOf('o'))));
	//  652 1799:getstatic       #16  <Field Map MAP>
	//  653 1802:ldc1            #246 <String "959">
	//  654 1804:bipush          111
	//  655 1806:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  656 1809:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  657 1814:pop             
		MAP.put("960", ((Object) (Character.valueOf('p'))));
	//  658 1815:getstatic       #16  <Field Map MAP>
	//  659 1818:ldc1            #248 <String "960">
	//  660 1820:bipush          112
	//  661 1822:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  662 1825:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  663 1830:pop             
		MAP.put("961", ((Object) (Character.valueOf('r'))));
	//  664 1831:getstatic       #16  <Field Map MAP>
	//  665 1834:ldc1            #250 <String "961">
	//  666 1836:bipush          114
	//  667 1838:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  668 1841:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  669 1846:pop             
		MAP.put("962", ((Object) (Character.valueOf('V'))));
	//  670 1847:getstatic       #16  <Field Map MAP>
	//  671 1850:ldc1            #252 <String "962">
	//  672 1852:bipush          86
	//  673 1854:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  674 1857:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  675 1862:pop             
		MAP.put("963", ((Object) (Character.valueOf('s'))));
	//  676 1863:getstatic       #16  <Field Map MAP>
	//  677 1866:ldc1            #254 <String "963">
	//  678 1868:bipush          115
	//  679 1870:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  680 1873:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  681 1878:pop             
		MAP.put("964", ((Object) (Character.valueOf('t'))));
	//  682 1879:getstatic       #16  <Field Map MAP>
	//  683 1882:ldc2            #256 <String "964">
	//  684 1885:bipush          116
	//  685 1887:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  686 1890:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  687 1895:pop             
		MAP.put("965", ((Object) (Character.valueOf('u'))));
	//  688 1896:getstatic       #16  <Field Map MAP>
	//  689 1899:ldc2            #258 <String "965">
	//  690 1902:bipush          117
	//  691 1904:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  692 1907:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  693 1912:pop             
		MAP.put("966", ((Object) (Character.valueOf('f'))));
	//  694 1913:getstatic       #16  <Field Map MAP>
	//  695 1916:ldc2            #260 <String "966">
	//  696 1919:bipush          102
	//  697 1921:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  698 1924:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  699 1929:pop             
		MAP.put("967", ((Object) (Character.valueOf('c'))));
	//  700 1930:getstatic       #16  <Field Map MAP>
	//  701 1933:ldc2            #262 <String "967">
	//  702 1936:bipush          99
	//  703 1938:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  704 1941:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  705 1946:pop             
		MAP.put("9674", ((Object) (Character.valueOf('\340'))));
	//  706 1947:getstatic       #16  <Field Map MAP>
	//  707 1950:ldc2            #264 <String "9674">
	//  708 1953:sipush          224
	//  709 1956:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  710 1959:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  711 1964:pop             
		MAP.put("968", ((Object) (Character.valueOf('y'))));
	//  712 1965:getstatic       #16  <Field Map MAP>
	//  713 1968:ldc2            #266 <String "968">
	//  714 1971:bipush          121
	//  715 1973:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  716 1976:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  717 1981:pop             
		MAP.put("969", ((Object) (Character.valueOf('w'))));
	//  718 1982:getstatic       #16  <Field Map MAP>
	//  719 1985:ldc2            #268 <String "969">
	//  720 1988:bipush          119
	//  721 1990:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  722 1993:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  723 1998:pop             
		MAP.put("977", ((Object) (Character.valueOf('J'))));
	//  724 1999:getstatic       #16  <Field Map MAP>
	//  725 2002:ldc2            #270 <String "977">
	//  726 2005:bipush          74
	//  727 2007:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  728 2010:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  729 2015:pop             
		MAP.put("978", ((Object) (Character.valueOf('\241'))));
	//  730 2016:getstatic       #16  <Field Map MAP>
	//  731 2019:ldc2            #272 <String "978">
	//  732 2022:sipush          161
	//  733 2025:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  734 2028:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  735 2033:pop             
		MAP.put("981", ((Object) (Character.valueOf('j'))));
	//  736 2034:getstatic       #16  <Field Map MAP>
	//  737 2037:ldc2            #274 <String "981">
	//  738 2040:bipush          106
	//  739 2042:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  740 2045:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  741 2050:pop             
		MAP.put("982", ((Object) (Character.valueOf('v'))));
	//  742 2051:getstatic       #16  <Field Map MAP>
	//  743 2054:ldc2            #276 <String "982">
	//  744 2057:bipush          118
	//  745 2059:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  746 2062:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  747 2067:pop             
		MAP.put("9824", ((Object) (Character.valueOf('\252'))));
	//  748 2068:getstatic       #16  <Field Map MAP>
	//  749 2071:ldc2            #278 <String "9824">
	//  750 2074:sipush          170
	//  751 2077:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  752 2080:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  753 2085:pop             
		MAP.put("9827", ((Object) (Character.valueOf('\247'))));
	//  754 2086:getstatic       #16  <Field Map MAP>
	//  755 2089:ldc2            #280 <String "9827">
	//  756 2092:sipush          167
	//  757 2095:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  758 2098:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  759 2103:pop             
		MAP.put("9829", ((Object) (Character.valueOf('\251'))));
	//  760 2104:getstatic       #16  <Field Map MAP>
	//  761 2107:ldc2            #282 <String "9829">
	//  762 2110:sipush          169
	//  763 2113:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  764 2116:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  765 2121:pop             
		MAP.put("9830", ((Object) (Character.valueOf('\250'))));
	//  766 2122:getstatic       #16  <Field Map MAP>
	//  767 2125:ldc2            #284 <String "9830">
	//  768 2128:sipush          168
	//  769 2131:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  770 2134:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  771 2139:pop             
		MAP.put("Alpha", ((Object) (Character.valueOf('A'))));
	//  772 2140:getstatic       #16  <Field Map MAP>
	//  773 2143:ldc2            #286 <String "Alpha">
	//  774 2146:bipush          65
	//  775 2148:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  776 2151:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  777 2156:pop             
		MAP.put("Beta", ((Object) (Character.valueOf('B'))));
	//  778 2157:getstatic       #16  <Field Map MAP>
	//  779 2160:ldc2            #288 <String "Beta">
	//  780 2163:bipush          66
	//  781 2165:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  782 2168:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  783 2173:pop             
		MAP.put("Chi", ((Object) (Character.valueOf('C'))));
	//  784 2174:getstatic       #16  <Field Map MAP>
	//  785 2177:ldc2            #290 <String "Chi">
	//  786 2180:bipush          67
	//  787 2182:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  788 2185:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  789 2190:pop             
		MAP.put("Delta", ((Object) (Character.valueOf('D'))));
	//  790 2191:getstatic       #16  <Field Map MAP>
	//  791 2194:ldc2            #292 <String "Delta">
	//  792 2197:bipush          68
	//  793 2199:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  794 2202:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  795 2207:pop             
		MAP.put("Epsilon", ((Object) (Character.valueOf('E'))));
	//  796 2208:getstatic       #16  <Field Map MAP>
	//  797 2211:ldc2            #294 <String "Epsilon">
	//  798 2214:bipush          69
	//  799 2216:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  800 2219:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  801 2224:pop             
		MAP.put("Eta", ((Object) (Character.valueOf('H'))));
	//  802 2225:getstatic       #16  <Field Map MAP>
	//  803 2228:ldc2            #296 <String "Eta">
	//  804 2231:bipush          72
	//  805 2233:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  806 2236:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  807 2241:pop             
		MAP.put("Gamma", ((Object) (Character.valueOf('G'))));
	//  808 2242:getstatic       #16  <Field Map MAP>
	//  809 2245:ldc2            #298 <String "Gamma">
	//  810 2248:bipush          71
	//  811 2250:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  812 2253:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  813 2258:pop             
		MAP.put("Iota", ((Object) (Character.valueOf('I'))));
	//  814 2259:getstatic       #16  <Field Map MAP>
	//  815 2262:ldc2            #300 <String "Iota">
	//  816 2265:bipush          73
	//  817 2267:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  818 2270:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  819 2275:pop             
		MAP.put("Kappa", ((Object) (Character.valueOf('K'))));
	//  820 2276:getstatic       #16  <Field Map MAP>
	//  821 2279:ldc2            #302 <String "Kappa">
	//  822 2282:bipush          75
	//  823 2284:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  824 2287:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  825 2292:pop             
		MAP.put("Lambda", ((Object) (Character.valueOf('L'))));
	//  826 2293:getstatic       #16  <Field Map MAP>
	//  827 2296:ldc2            #304 <String "Lambda">
	//  828 2299:bipush          76
	//  829 2301:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  830 2304:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  831 2309:pop             
		MAP.put("Mu", ((Object) (Character.valueOf('M'))));
	//  832 2310:getstatic       #16  <Field Map MAP>
	//  833 2313:ldc2            #306 <String "Mu">
	//  834 2316:bipush          77
	//  835 2318:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  836 2321:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  837 2326:pop             
		MAP.put("Nu", ((Object) (Character.valueOf('N'))));
	//  838 2327:getstatic       #16  <Field Map MAP>
	//  839 2330:ldc2            #308 <String "Nu">
	//  840 2333:bipush          78
	//  841 2335:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  842 2338:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  843 2343:pop             
		MAP.put("Omega", ((Object) (Character.valueOf('W'))));
	//  844 2344:getstatic       #16  <Field Map MAP>
	//  845 2347:ldc2            #310 <String "Omega">
	//  846 2350:bipush          87
	//  847 2352:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  848 2355:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  849 2360:pop             
		MAP.put("Omicron", ((Object) (Character.valueOf('O'))));
	//  850 2361:getstatic       #16  <Field Map MAP>
	//  851 2364:ldc2            #312 <String "Omicron">
	//  852 2367:bipush          79
	//  853 2369:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  854 2372:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  855 2377:pop             
		MAP.put("Phi", ((Object) (Character.valueOf('F'))));
	//  856 2378:getstatic       #16  <Field Map MAP>
	//  857 2381:ldc2            #314 <String "Phi">
	//  858 2384:bipush          70
	//  859 2386:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  860 2389:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  861 2394:pop             
		MAP.put("Pi", ((Object) (Character.valueOf('P'))));
	//  862 2395:getstatic       #16  <Field Map MAP>
	//  863 2398:ldc2            #316 <String "Pi">
	//  864 2401:bipush          80
	//  865 2403:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  866 2406:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  867 2411:pop             
		MAP.put("Prime", ((Object) (Character.valueOf('\262'))));
	//  868 2412:getstatic       #16  <Field Map MAP>
	//  869 2415:ldc2            #318 <String "Prime">
	//  870 2418:sipush          178
	//  871 2421:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  872 2424:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  873 2429:pop             
		MAP.put("Psi", ((Object) (Character.valueOf('Y'))));
	//  874 2430:getstatic       #16  <Field Map MAP>
	//  875 2433:ldc2            #320 <String "Psi">
	//  876 2436:bipush          89
	//  877 2438:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  878 2441:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  879 2446:pop             
		MAP.put("Rho", ((Object) (Character.valueOf('R'))));
	//  880 2447:getstatic       #16  <Field Map MAP>
	//  881 2450:ldc2            #322 <String "Rho">
	//  882 2453:bipush          82
	//  883 2455:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  884 2458:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  885 2463:pop             
		MAP.put("Sigma", ((Object) (Character.valueOf('S'))));
	//  886 2464:getstatic       #16  <Field Map MAP>
	//  887 2467:ldc2            #324 <String "Sigma">
	//  888 2470:bipush          83
	//  889 2472:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  890 2475:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  891 2480:pop             
		MAP.put("Tau", ((Object) (Character.valueOf('T'))));
	//  892 2481:getstatic       #16  <Field Map MAP>
	//  893 2484:ldc2            #326 <String "Tau">
	//  894 2487:bipush          84
	//  895 2489:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  896 2492:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  897 2497:pop             
		MAP.put("Theta", ((Object) (Character.valueOf('Q'))));
	//  898 2498:getstatic       #16  <Field Map MAP>
	//  899 2501:ldc2            #328 <String "Theta">
	//  900 2504:bipush          81
	//  901 2506:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  902 2509:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  903 2514:pop             
		MAP.put("Upsilon", ((Object) (Character.valueOf('U'))));
	//  904 2515:getstatic       #16  <Field Map MAP>
	//  905 2518:ldc2            #330 <String "Upsilon">
	//  906 2521:bipush          85
	//  907 2523:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  908 2526:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  909 2531:pop             
		MAP.put("Xi", ((Object) (Character.valueOf('X'))));
	//  910 2532:getstatic       #16  <Field Map MAP>
	//  911 2535:ldc2            #332 <String "Xi">
	//  912 2538:bipush          88
	//  913 2540:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  914 2543:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  915 2548:pop             
		MAP.put("Zeta", ((Object) (Character.valueOf('Z'))));
	//  916 2549:getstatic       #16  <Field Map MAP>
	//  917 2552:ldc2            #334 <String "Zeta">
	//  918 2555:bipush          90
	//  919 2557:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  920 2560:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  921 2565:pop             
		MAP.put("alefsym", ((Object) (Character.valueOf('\300'))));
	//  922 2566:getstatic       #16  <Field Map MAP>
	//  923 2569:ldc2            #336 <String "alefsym">
	//  924 2572:sipush          192
	//  925 2575:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  926 2578:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  927 2583:pop             
		MAP.put("alpha", ((Object) (Character.valueOf('a'))));
	//  928 2584:getstatic       #16  <Field Map MAP>
	//  929 2587:ldc2            #338 <String "alpha">
	//  930 2590:bipush          97
	//  931 2592:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  932 2595:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  933 2600:pop             
		MAP.put("and", ((Object) (Character.valueOf('\331'))));
	//  934 2601:getstatic       #16  <Field Map MAP>
	//  935 2604:ldc2            #340 <String "and">
	//  936 2607:sipush          217
	//  937 2610:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  938 2613:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  939 2618:pop             
		MAP.put("ang", ((Object) (Character.valueOf('\320'))));
	//  940 2619:getstatic       #16  <Field Map MAP>
	//  941 2622:ldc2            #342 <String "ang">
	//  942 2625:sipush          208
	//  943 2628:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  944 2631:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  945 2636:pop             
		MAP.put("asymp", ((Object) (Character.valueOf('\273'))));
	//  946 2637:getstatic       #16  <Field Map MAP>
	//  947 2640:ldc2            #344 <String "asymp">
	//  948 2643:sipush          187
	//  949 2646:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  950 2649:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  951 2654:pop             
		MAP.put("beta", ((Object) (Character.valueOf('b'))));
	//  952 2655:getstatic       #16  <Field Map MAP>
	//  953 2658:ldc2            #346 <String "beta">
	//  954 2661:bipush          98
	//  955 2663:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  956 2666:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  957 2671:pop             
		MAP.put("cap", ((Object) (Character.valueOf('\307'))));
	//  958 2672:getstatic       #16  <Field Map MAP>
	//  959 2675:ldc2            #348 <String "cap">
	//  960 2678:sipush          199
	//  961 2681:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  962 2684:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  963 2689:pop             
		MAP.put("chi", ((Object) (Character.valueOf('c'))));
	//  964 2690:getstatic       #16  <Field Map MAP>
	//  965 2693:ldc2            #350 <String "chi">
	//  966 2696:bipush          99
	//  967 2698:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  968 2701:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  969 2706:pop             
		MAP.put("clubs", ((Object) (Character.valueOf('\247'))));
	//  970 2707:getstatic       #16  <Field Map MAP>
	//  971 2710:ldc2            #352 <String "clubs">
	//  972 2713:sipush          167
	//  973 2716:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  974 2719:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  975 2724:pop             
		MAP.put("cong", ((Object) (Character.valueOf('@'))));
	//  976 2725:getstatic       #16  <Field Map MAP>
	//  977 2728:ldc2            #354 <String "cong">
	//  978 2731:bipush          64
	//  979 2733:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  980 2736:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  981 2741:pop             
		MAP.put("copy", ((Object) (Character.valueOf('\323'))));
	//  982 2742:getstatic       #16  <Field Map MAP>
	//  983 2745:ldc2            #356 <String "copy">
	//  984 2748:sipush          211
	//  985 2751:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  986 2754:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  987 2759:pop             
		MAP.put("crarr", ((Object) (Character.valueOf('\277'))));
	//  988 2760:getstatic       #16  <Field Map MAP>
	//  989 2763:ldc2            #358 <String "crarr">
	//  990 2766:sipush          191
	//  991 2769:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  992 2772:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  993 2777:pop             
		MAP.put("cup", ((Object) (Character.valueOf('\310'))));
	//  994 2778:getstatic       #16  <Field Map MAP>
	//  995 2781:ldc2            #360 <String "cup">
	//  996 2784:sipush          200
	//  997 2787:invokestatic    #24  <Method Character Character.valueOf(char)>
	//  998 2790:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  999 2795:pop             
		MAP.put("dArr", ((Object) (Character.valueOf('\337'))));
	// 1000 2796:getstatic       #16  <Field Map MAP>
	// 1001 2799:ldc2            #362 <String "dArr">
	// 1002 2802:sipush          223
	// 1003 2805:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1004 2808:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1005 2813:pop             
		MAP.put("darr", ((Object) (Character.valueOf('\257'))));
	// 1006 2814:getstatic       #16  <Field Map MAP>
	// 1007 2817:ldc2            #364 <String "darr">
	// 1008 2820:sipush          175
	// 1009 2823:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1010 2826:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1011 2831:pop             
		MAP.put("delta", ((Object) (Character.valueOf('d'))));
	// 1012 2832:getstatic       #16  <Field Map MAP>
	// 1013 2835:ldc2            #366 <String "delta">
	// 1014 2838:bipush          100
	// 1015 2840:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1016 2843:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1017 2848:pop             
		MAP.put("diams", ((Object) (Character.valueOf('\250'))));
	// 1018 2849:getstatic       #16  <Field Map MAP>
	// 1019 2852:ldc2            #368 <String "diams">
	// 1020 2855:sipush          168
	// 1021 2858:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1022 2861:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1023 2866:pop             
		MAP.put("divide", ((Object) (Character.valueOf('\270'))));
	// 1024 2867:getstatic       #16  <Field Map MAP>
	// 1025 2870:ldc2            #370 <String "divide">
	// 1026 2873:sipush          184
	// 1027 2876:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1028 2879:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1029 2884:pop             
		MAP.put("empty", ((Object) (Character.valueOf('\306'))));
	// 1030 2885:getstatic       #16  <Field Map MAP>
	// 1031 2888:ldc2            #372 <String "empty">
	// 1032 2891:sipush          198
	// 1033 2894:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1034 2897:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1035 2902:pop             
		MAP.put("epsilon", ((Object) (Character.valueOf('e'))));
	// 1036 2903:getstatic       #16  <Field Map MAP>
	// 1037 2906:ldc2            #374 <String "epsilon">
	// 1038 2909:bipush          101
	// 1039 2911:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1040 2914:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1041 2919:pop             
		MAP.put("equiv", ((Object) (Character.valueOf('\272'))));
	// 1042 2920:getstatic       #16  <Field Map MAP>
	// 1043 2923:ldc2            #376 <String "equiv">
	// 1044 2926:sipush          186
	// 1045 2929:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1046 2932:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1047 2937:pop             
		MAP.put("eta", ((Object) (Character.valueOf('h'))));
	// 1048 2938:getstatic       #16  <Field Map MAP>
	// 1049 2941:ldc2            #378 <String "eta">
	// 1050 2944:bipush          104
	// 1051 2946:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1052 2949:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1053 2954:pop             
		MAP.put("euro", ((Object) (Character.valueOf('\360'))));
	// 1054 2955:getstatic       #16  <Field Map MAP>
	// 1055 2958:ldc2            #380 <String "euro">
	// 1056 2961:sipush          240
	// 1057 2964:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1058 2967:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1059 2972:pop             
		MAP.put("exist", ((Object) (Character.valueOf('$'))));
	// 1060 2973:getstatic       #16  <Field Map MAP>
	// 1061 2976:ldc2            #382 <String "exist">
	// 1062 2979:bipush          36
	// 1063 2981:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1064 2984:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1065 2989:pop             
		MAP.put("forall", ((Object) (Character.valueOf('"'))));
	// 1066 2990:getstatic       #16  <Field Map MAP>
	// 1067 2993:ldc2            #384 <String "forall">
	// 1068 2996:bipush          34
	// 1069 2998:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1070 3001:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1071 3006:pop             
		MAP.put("frasl", ((Object) (Character.valueOf('\244'))));
	// 1072 3007:getstatic       #16  <Field Map MAP>
	// 1073 3010:ldc2            #386 <String "frasl">
	// 1074 3013:sipush          164
	// 1075 3016:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1076 3019:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1077 3024:pop             
		MAP.put("gamma", ((Object) (Character.valueOf('g'))));
	// 1078 3025:getstatic       #16  <Field Map MAP>
	// 1079 3028:ldc2            #388 <String "gamma">
	// 1080 3031:bipush          103
	// 1081 3033:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1082 3036:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1083 3041:pop             
		MAP.put("ge", ((Object) (Character.valueOf('\263'))));
	// 1084 3042:getstatic       #16  <Field Map MAP>
	// 1085 3045:ldc2            #390 <String "ge">
	// 1086 3048:sipush          179
	// 1087 3051:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1088 3054:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1089 3059:pop             
		MAP.put("hArr", ((Object) (Character.valueOf('\333'))));
	// 1090 3060:getstatic       #16  <Field Map MAP>
	// 1091 3063:ldc2            #392 <String "hArr">
	// 1092 3066:sipush          219
	// 1093 3069:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1094 3072:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1095 3077:pop             
		MAP.put("harr", ((Object) (Character.valueOf('\253'))));
	// 1096 3078:getstatic       #16  <Field Map MAP>
	// 1097 3081:ldc2            #394 <String "harr">
	// 1098 3084:sipush          171
	// 1099 3087:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1100 3090:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1101 3095:pop             
		MAP.put("hearts", ((Object) (Character.valueOf('\251'))));
	// 1102 3096:getstatic       #16  <Field Map MAP>
	// 1103 3099:ldc2            #396 <String "hearts">
	// 1104 3102:sipush          169
	// 1105 3105:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1106 3108:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1107 3113:pop             
		MAP.put("hellip", ((Object) (Character.valueOf('\274'))));
	// 1108 3114:getstatic       #16  <Field Map MAP>
	// 1109 3117:ldc2            #398 <String "hellip">
	// 1110 3120:sipush          188
	// 1111 3123:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1112 3126:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1113 3131:pop             
		MAP.put("horizontal arrow extender", ((Object) (Character.valueOf('\276'))));
	// 1114 3132:getstatic       #16  <Field Map MAP>
	// 1115 3135:ldc2            #400 <String "horizontal arrow extender">
	// 1116 3138:sipush          190
	// 1117 3141:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1118 3144:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1119 3149:pop             
		MAP.put("image", ((Object) (Character.valueOf('\301'))));
	// 1120 3150:getstatic       #16  <Field Map MAP>
	// 1121 3153:ldc2            #402 <String "image">
	// 1122 3156:sipush          193
	// 1123 3159:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1124 3162:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1125 3167:pop             
		MAP.put("infin", ((Object) (Character.valueOf('\245'))));
	// 1126 3168:getstatic       #16  <Field Map MAP>
	// 1127 3171:ldc2            #404 <String "infin">
	// 1128 3174:sipush          165
	// 1129 3177:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1130 3180:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1131 3185:pop             
		MAP.put("int", ((Object) (Character.valueOf('\362'))));
	// 1132 3186:getstatic       #16  <Field Map MAP>
	// 1133 3189:ldc2            #406 <String "int">
	// 1134 3192:sipush          242
	// 1135 3195:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1136 3198:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1137 3203:pop             
		MAP.put("iota", ((Object) (Character.valueOf('i'))));
	// 1138 3204:getstatic       #16  <Field Map MAP>
	// 1139 3207:ldc2            #408 <String "iota">
	// 1140 3210:bipush          105
	// 1141 3212:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1142 3215:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1143 3220:pop             
		MAP.put("isin", ((Object) (Character.valueOf('\316'))));
	// 1144 3221:getstatic       #16  <Field Map MAP>
	// 1145 3224:ldc2            #410 <String "isin">
	// 1146 3227:sipush          206
	// 1147 3230:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1148 3233:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1149 3238:pop             
		MAP.put("kappa", ((Object) (Character.valueOf('k'))));
	// 1150 3239:getstatic       #16  <Field Map MAP>
	// 1151 3242:ldc2            #412 <String "kappa">
	// 1152 3245:bipush          107
	// 1153 3247:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1154 3250:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1155 3255:pop             
		MAP.put("lArr", ((Object) (Character.valueOf('\334'))));
	// 1156 3256:getstatic       #16  <Field Map MAP>
	// 1157 3259:ldc2            #414 <String "lArr">
	// 1158 3262:sipush          220
	// 1159 3265:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1160 3268:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1161 3273:pop             
		MAP.put("lambda", ((Object) (Character.valueOf('l'))));
	// 1162 3274:getstatic       #16  <Field Map MAP>
	// 1163 3277:ldc2            #416 <String "lambda">
	// 1164 3280:bipush          108
	// 1165 3282:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1166 3285:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1167 3290:pop             
		MAP.put("lang", ((Object) (Character.valueOf('\341'))));
	// 1168 3291:getstatic       #16  <Field Map MAP>
	// 1169 3294:ldc2            #418 <String "lang">
	// 1170 3297:sipush          225
	// 1171 3300:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1172 3303:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1173 3308:pop             
		MAP.put("large brace extender", ((Object) (Character.valueOf('\357'))));
	// 1174 3309:getstatic       #16  <Field Map MAP>
	// 1175 3312:ldc2            #420 <String "large brace extender">
	// 1176 3315:sipush          239
	// 1177 3318:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1178 3321:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1179 3326:pop             
		MAP.put("large integral extender", ((Object) (Character.valueOf('\364'))));
	// 1180 3327:getstatic       #16  <Field Map MAP>
	// 1181 3330:ldc2            #422 <String "large integral extender">
	// 1182 3333:sipush          244
	// 1183 3336:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1184 3339:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1185 3344:pop             
		MAP.put("large left brace (bottom)", ((Object) (Character.valueOf('\356'))));
	// 1186 3345:getstatic       #16  <Field Map MAP>
	// 1187 3348:ldc2            #424 <String "large left brace (bottom)">
	// 1188 3351:sipush          238
	// 1189 3354:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1190 3357:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1191 3362:pop             
		MAP.put("large left brace (middle)", ((Object) (Character.valueOf('\355'))));
	// 1192 3363:getstatic       #16  <Field Map MAP>
	// 1193 3366:ldc2            #426 <String "large left brace (middle)">
	// 1194 3369:sipush          237
	// 1195 3372:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1196 3375:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1197 3380:pop             
		MAP.put("large left brace (top)", ((Object) (Character.valueOf('\354'))));
	// 1198 3381:getstatic       #16  <Field Map MAP>
	// 1199 3384:ldc2            #428 <String "large left brace (top)">
	// 1200 3387:sipush          236
	// 1201 3390:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1202 3393:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1203 3398:pop             
		MAP.put("large left bracket (bottom)", ((Object) (Character.valueOf('\353'))));
	// 1204 3399:getstatic       #16  <Field Map MAP>
	// 1205 3402:ldc2            #430 <String "large left bracket (bottom)">
	// 1206 3405:sipush          235
	// 1207 3408:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1208 3411:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1209 3416:pop             
		MAP.put("large left bracket (extender)", ((Object) (Character.valueOf('\352'))));
	// 1210 3417:getstatic       #16  <Field Map MAP>
	// 1211 3420:ldc2            #432 <String "large left bracket (extender)">
	// 1212 3423:sipush          234
	// 1213 3426:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1214 3429:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1215 3434:pop             
		MAP.put("large left bracket (top)", ((Object) (Character.valueOf('\351'))));
	// 1216 3435:getstatic       #16  <Field Map MAP>
	// 1217 3438:ldc2            #434 <String "large left bracket (top)">
	// 1218 3441:sipush          233
	// 1219 3444:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1220 3447:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1221 3452:pop             
		MAP.put("large left parenthesis (bottom)", ((Object) (Character.valueOf('\350'))));
	// 1222 3453:getstatic       #16  <Field Map MAP>
	// 1223 3456:ldc2            #436 <String "large left parenthesis (bottom)">
	// 1224 3459:sipush          232
	// 1225 3462:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1226 3465:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1227 3470:pop             
		MAP.put("large left parenthesis (extender)", ((Object) (Character.valueOf('\347'))));
	// 1228 3471:getstatic       #16  <Field Map MAP>
	// 1229 3474:ldc2            #438 <String "large left parenthesis (extender)">
	// 1230 3477:sipush          231
	// 1231 3480:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1232 3483:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1233 3488:pop             
		MAP.put("large left parenthesis (top)", ((Object) (Character.valueOf('\346'))));
	// 1234 3489:getstatic       #16  <Field Map MAP>
	// 1235 3492:ldc2            #440 <String "large left parenthesis (top)">
	// 1236 3495:sipush          230
	// 1237 3498:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1238 3501:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1239 3506:pop             
		MAP.put("large right brace (bottom)", ((Object) (Character.valueOf('\376'))));
	// 1240 3507:getstatic       #16  <Field Map MAP>
	// 1241 3510:ldc2            #442 <String "large right brace (bottom)">
	// 1242 3513:sipush          254
	// 1243 3516:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1244 3519:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1245 3524:pop             
		MAP.put("large right brace (middle)", ((Object) (Character.valueOf('\375'))));
	// 1246 3525:getstatic       #16  <Field Map MAP>
	// 1247 3528:ldc2            #444 <String "large right brace (middle)">
	// 1248 3531:sipush          253
	// 1249 3534:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1250 3537:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1251 3542:pop             
		MAP.put("large right brace (top)", ((Object) (Character.valueOf('\374'))));
	// 1252 3543:getstatic       #16  <Field Map MAP>
	// 1253 3546:ldc2            #446 <String "large right brace (top)">
	// 1254 3549:sipush          252
	// 1255 3552:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1256 3555:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1257 3560:pop             
		MAP.put("large right bracket (bottom)", ((Object) (Character.valueOf('\373'))));
	// 1258 3561:getstatic       #16  <Field Map MAP>
	// 1259 3564:ldc2            #448 <String "large right bracket (bottom)">
	// 1260 3567:sipush          251
	// 1261 3570:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1262 3573:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1263 3578:pop             
		MAP.put("large right bracket (extender)", ((Object) (Character.valueOf('\372'))));
	// 1264 3579:getstatic       #16  <Field Map MAP>
	// 1265 3582:ldc2            #450 <String "large right bracket (extender)">
	// 1266 3585:sipush          250
	// 1267 3588:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1268 3591:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1269 3596:pop             
		MAP.put("large right bracket (top)", ((Object) (Character.valueOf('\371'))));
	// 1270 3597:getstatic       #16  <Field Map MAP>
	// 1271 3600:ldc2            #452 <String "large right bracket (top)">
	// 1272 3603:sipush          249
	// 1273 3606:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1274 3609:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1275 3614:pop             
		MAP.put("large right parenthesis (bottom)", ((Object) (Character.valueOf('\370'))));
	// 1276 3615:getstatic       #16  <Field Map MAP>
	// 1277 3618:ldc2            #454 <String "large right parenthesis (bottom)">
	// 1278 3621:sipush          248
	// 1279 3624:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1280 3627:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1281 3632:pop             
		MAP.put("large right parenthesis (extender)", ((Object) (Character.valueOf('\367'))));
	// 1282 3633:getstatic       #16  <Field Map MAP>
	// 1283 3636:ldc2            #456 <String "large right parenthesis (extender)">
	// 1284 3639:sipush          247
	// 1285 3642:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1286 3645:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1287 3650:pop             
		MAP.put("large right parenthesis (top)", ((Object) (Character.valueOf('\366'))));
	// 1288 3651:getstatic       #16  <Field Map MAP>
	// 1289 3654:ldc2            #458 <String "large right parenthesis (top)">
	// 1290 3657:sipush          246
	// 1291 3660:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1292 3663:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1293 3668:pop             
		MAP.put("larr", ((Object) (Character.valueOf('\254'))));
	// 1294 3669:getstatic       #16  <Field Map MAP>
	// 1295 3672:ldc2            #460 <String "larr">
	// 1296 3675:sipush          172
	// 1297 3678:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1298 3681:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1299 3686:pop             
		MAP.put("le", ((Object) (Character.valueOf('\243'))));
	// 1300 3687:getstatic       #16  <Field Map MAP>
	// 1301 3690:ldc2            #462 <String "le">
	// 1302 3693:sipush          163
	// 1303 3696:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1304 3699:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1305 3704:pop             
		MAP.put("lowast", ((Object) (Character.valueOf('*'))));
	// 1306 3705:getstatic       #16  <Field Map MAP>
	// 1307 3708:ldc2            #464 <String "lowast">
	// 1308 3711:bipush          42
	// 1309 3713:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1310 3716:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1311 3721:pop             
		MAP.put("loz", ((Object) (Character.valueOf('\340'))));
	// 1312 3722:getstatic       #16  <Field Map MAP>
	// 1313 3725:ldc2            #466 <String "loz">
	// 1314 3728:sipush          224
	// 1315 3731:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1316 3734:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1317 3739:pop             
		MAP.put("minus", ((Object) (Character.valueOf('-'))));
	// 1318 3740:getstatic       #16  <Field Map MAP>
	// 1319 3743:ldc2            #468 <String "minus">
	// 1320 3746:bipush          45
	// 1321 3748:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1322 3751:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1323 3756:pop             
		MAP.put("mu", ((Object) (Character.valueOf('m'))));
	// 1324 3757:getstatic       #16  <Field Map MAP>
	// 1325 3760:ldc2            #470 <String "mu">
	// 1326 3763:bipush          109
	// 1327 3765:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1328 3768:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1329 3773:pop             
		MAP.put("nabla", ((Object) (Character.valueOf('\321'))));
	// 1330 3774:getstatic       #16  <Field Map MAP>
	// 1331 3777:ldc2            #472 <String "nabla">
	// 1332 3780:sipush          209
	// 1333 3783:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1334 3786:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1335 3791:pop             
		MAP.put("ne", ((Object) (Character.valueOf('\271'))));
	// 1336 3792:getstatic       #16  <Field Map MAP>
	// 1337 3795:ldc2            #474 <String "ne">
	// 1338 3798:sipush          185
	// 1339 3801:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1340 3804:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1341 3809:pop             
		MAP.put("not", ((Object) (Character.valueOf('\330'))));
	// 1342 3810:getstatic       #16  <Field Map MAP>
	// 1343 3813:ldc2            #476 <String "not">
	// 1344 3816:sipush          216
	// 1345 3819:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1346 3822:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1347 3827:pop             
		MAP.put("notin", ((Object) (Character.valueOf('\317'))));
	// 1348 3828:getstatic       #16  <Field Map MAP>
	// 1349 3831:ldc2            #478 <String "notin">
	// 1350 3834:sipush          207
	// 1351 3837:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1352 3840:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1353 3845:pop             
		MAP.put("nsub", ((Object) (Character.valueOf('\313'))));
	// 1354 3846:getstatic       #16  <Field Map MAP>
	// 1355 3849:ldc2            #480 <String "nsub">
	// 1356 3852:sipush          203
	// 1357 3855:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1358 3858:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1359 3863:pop             
		MAP.put("nu", ((Object) (Character.valueOf('n'))));
	// 1360 3864:getstatic       #16  <Field Map MAP>
	// 1361 3867:ldc2            #482 <String "nu">
	// 1362 3870:bipush          110
	// 1363 3872:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1364 3875:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1365 3880:pop             
		MAP.put("omega", ((Object) (Character.valueOf('w'))));
	// 1366 3881:getstatic       #16  <Field Map MAP>
	// 1367 3884:ldc2            #484 <String "omega">
	// 1368 3887:bipush          119
	// 1369 3889:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1370 3892:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1371 3897:pop             
		MAP.put("omicron", ((Object) (Character.valueOf('o'))));
	// 1372 3898:getstatic       #16  <Field Map MAP>
	// 1373 3901:ldc2            #486 <String "omicron">
	// 1374 3904:bipush          111
	// 1375 3906:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1376 3909:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1377 3914:pop             
		MAP.put("oplus", ((Object) (Character.valueOf('\305'))));
	// 1378 3915:getstatic       #16  <Field Map MAP>
	// 1379 3918:ldc2            #488 <String "oplus">
	// 1380 3921:sipush          197
	// 1381 3924:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1382 3927:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1383 3932:pop             
		MAP.put("or", ((Object) (Character.valueOf('\332'))));
	// 1384 3933:getstatic       #16  <Field Map MAP>
	// 1385 3936:ldc2            #490 <String "or">
	// 1386 3939:sipush          218
	// 1387 3942:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1388 3945:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1389 3950:pop             
		MAP.put("otimes", ((Object) (Character.valueOf('\304'))));
	// 1390 3951:getstatic       #16  <Field Map MAP>
	// 1391 3954:ldc2            #492 <String "otimes">
	// 1392 3957:sipush          196
	// 1393 3960:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1394 3963:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1395 3968:pop             
		MAP.put("part", ((Object) (Character.valueOf('\266'))));
	// 1396 3969:getstatic       #16  <Field Map MAP>
	// 1397 3972:ldc2            #494 <String "part">
	// 1398 3975:sipush          182
	// 1399 3978:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1400 3981:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1401 3986:pop             
		MAP.put("perp", ((Object) (Character.valueOf('^'))));
	// 1402 3987:getstatic       #16  <Field Map MAP>
	// 1403 3990:ldc2            #496 <String "perp">
	// 1404 3993:bipush          94
	// 1405 3995:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1406 3998:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1407 4003:pop             
		MAP.put("phi", ((Object) (Character.valueOf('f'))));
	// 1408 4004:getstatic       #16  <Field Map MAP>
	// 1409 4007:ldc2            #498 <String "phi">
	// 1410 4010:bipush          102
	// 1411 4012:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1412 4015:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1413 4020:pop             
		MAP.put("pi", ((Object) (Character.valueOf('p'))));
	// 1414 4021:getstatic       #16  <Field Map MAP>
	// 1415 4024:ldc2            #500 <String "pi">
	// 1416 4027:bipush          112
	// 1417 4029:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1418 4032:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1419 4037:pop             
		MAP.put("piv", ((Object) (Character.valueOf('v'))));
	// 1420 4038:getstatic       #16  <Field Map MAP>
	// 1421 4041:ldc2            #502 <String "piv">
	// 1422 4044:bipush          118
	// 1423 4046:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1424 4049:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1425 4054:pop             
		MAP.put("plusmn", ((Object) (Character.valueOf('\261'))));
	// 1426 4055:getstatic       #16  <Field Map MAP>
	// 1427 4058:ldc2            #504 <String "plusmn">
	// 1428 4061:sipush          177
	// 1429 4064:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1430 4067:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1431 4072:pop             
		MAP.put("prime", ((Object) (Character.valueOf('\242'))));
	// 1432 4073:getstatic       #16  <Field Map MAP>
	// 1433 4076:ldc2            #506 <String "prime">
	// 1434 4079:sipush          162
	// 1435 4082:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1436 4085:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1437 4090:pop             
		MAP.put("prod", ((Object) (Character.valueOf('\325'))));
	// 1438 4091:getstatic       #16  <Field Map MAP>
	// 1439 4094:ldc2            #508 <String "prod">
	// 1440 4097:sipush          213
	// 1441 4100:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1442 4103:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1443 4108:pop             
		MAP.put("prop", ((Object) (Character.valueOf('\265'))));
	// 1444 4109:getstatic       #16  <Field Map MAP>
	// 1445 4112:ldc2            #510 <String "prop">
	// 1446 4115:sipush          181
	// 1447 4118:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1448 4121:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1449 4126:pop             
		MAP.put("psi", ((Object) (Character.valueOf('y'))));
	// 1450 4127:getstatic       #16  <Field Map MAP>
	// 1451 4130:ldc2            #512 <String "psi">
	// 1452 4133:bipush          121
	// 1453 4135:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1454 4138:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1455 4143:pop             
		MAP.put("rArr", ((Object) (Character.valueOf('\336'))));
	// 1456 4144:getstatic       #16  <Field Map MAP>
	// 1457 4147:ldc2            #514 <String "rArr">
	// 1458 4150:sipush          222
	// 1459 4153:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1460 4156:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1461 4161:pop             
		MAP.put("radic", ((Object) (Character.valueOf('\326'))));
	// 1462 4162:getstatic       #16  <Field Map MAP>
	// 1463 4165:ldc2            #516 <String "radic">
	// 1464 4168:sipush          214
	// 1465 4171:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1466 4174:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1467 4179:pop             
		MAP.put("radical extender", ((Object) (Character.valueOf('`'))));
	// 1468 4180:getstatic       #16  <Field Map MAP>
	// 1469 4183:ldc2            #518 <String "radical extender">
	// 1470 4186:bipush          96
	// 1471 4188:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1472 4191:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1473 4196:pop             
		MAP.put("rang", ((Object) (Character.valueOf('\361'))));
	// 1474 4197:getstatic       #16  <Field Map MAP>
	// 1475 4200:ldc2            #520 <String "rang">
	// 1476 4203:sipush          241
	// 1477 4206:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1478 4209:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1479 4214:pop             
		MAP.put("rarr", ((Object) (Character.valueOf('\256'))));
	// 1480 4215:getstatic       #16  <Field Map MAP>
	// 1481 4218:ldc2            #522 <String "rarr">
	// 1482 4221:sipush          174
	// 1483 4224:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1484 4227:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1485 4232:pop             
		MAP.put("real", ((Object) (Character.valueOf('\302'))));
	// 1486 4233:getstatic       #16  <Field Map MAP>
	// 1487 4236:ldc2            #524 <String "real">
	// 1488 4239:sipush          194
	// 1489 4242:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1490 4245:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1491 4250:pop             
		MAP.put("reg", ((Object) (Character.valueOf('\322'))));
	// 1492 4251:getstatic       #16  <Field Map MAP>
	// 1493 4254:ldc2            #526 <String "reg">
	// 1494 4257:sipush          210
	// 1495 4260:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1496 4263:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1497 4268:pop             
		MAP.put("rho", ((Object) (Character.valueOf('r'))));
	// 1498 4269:getstatic       #16  <Field Map MAP>
	// 1499 4272:ldc2            #528 <String "rho">
	// 1500 4275:bipush          114
	// 1501 4277:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1502 4280:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1503 4285:pop             
		MAP.put("sdot", ((Object) (Character.valueOf('\327'))));
	// 1504 4286:getstatic       #16  <Field Map MAP>
	// 1505 4289:ldc2            #530 <String "sdot">
	// 1506 4292:sipush          215
	// 1507 4295:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1508 4298:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1509 4303:pop             
		MAP.put("sigma", ((Object) (Character.valueOf('s'))));
	// 1510 4304:getstatic       #16  <Field Map MAP>
	// 1511 4307:ldc2            #532 <String "sigma">
	// 1512 4310:bipush          115
	// 1513 4312:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1514 4315:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1515 4320:pop             
		MAP.put("sigmaf", ((Object) (Character.valueOf('V'))));
	// 1516 4321:getstatic       #16  <Field Map MAP>
	// 1517 4324:ldc2            #534 <String "sigmaf">
	// 1518 4327:bipush          86
	// 1519 4329:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1520 4332:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1521 4337:pop             
		MAP.put("sim", ((Object) (Character.valueOf('~'))));
	// 1522 4338:getstatic       #16  <Field Map MAP>
	// 1523 4341:ldc2            #536 <String "sim">
	// 1524 4344:bipush          126
	// 1525 4346:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1526 4349:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1527 4354:pop             
		MAP.put("spades", ((Object) (Character.valueOf('\252'))));
	// 1528 4355:getstatic       #16  <Field Map MAP>
	// 1529 4358:ldc2            #538 <String "spades">
	// 1530 4361:sipush          170
	// 1531 4364:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1532 4367:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1533 4372:pop             
		MAP.put("sub", ((Object) (Character.valueOf('\314'))));
	// 1534 4373:getstatic       #16  <Field Map MAP>
	// 1535 4376:ldc2            #540 <String "sub">
	// 1536 4379:sipush          204
	// 1537 4382:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1538 4385:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1539 4390:pop             
		MAP.put("sube", ((Object) (Character.valueOf('\315'))));
	// 1540 4391:getstatic       #16  <Field Map MAP>
	// 1541 4394:ldc2            #542 <String "sube">
	// 1542 4397:sipush          205
	// 1543 4400:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1544 4403:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1545 4408:pop             
		MAP.put("sum", ((Object) (Character.valueOf('\345'))));
	// 1546 4409:getstatic       #16  <Field Map MAP>
	// 1547 4412:ldc2            #544 <String "sum">
	// 1548 4415:sipush          229
	// 1549 4418:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1550 4421:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1551 4426:pop             
		MAP.put("sup", ((Object) (Character.valueOf('\311'))));
	// 1552 4427:getstatic       #16  <Field Map MAP>
	// 1553 4430:ldc2            #546 <String "sup">
	// 1554 4433:sipush          201
	// 1555 4436:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1556 4439:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1557 4444:pop             
		MAP.put("supe", ((Object) (Character.valueOf('\312'))));
	// 1558 4445:getstatic       #16  <Field Map MAP>
	// 1559 4448:ldc2            #548 <String "supe">
	// 1560 4451:sipush          202
	// 1561 4454:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1562 4457:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1563 4462:pop             
		MAP.put("tau", ((Object) (Character.valueOf('t'))));
	// 1564 4463:getstatic       #16  <Field Map MAP>
	// 1565 4466:ldc2            #550 <String "tau">
	// 1566 4469:bipush          116
	// 1567 4471:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1568 4474:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1569 4479:pop             
		MAP.put("there4", ((Object) (Character.valueOf('\\'))));
	// 1570 4480:getstatic       #16  <Field Map MAP>
	// 1571 4483:ldc2            #552 <String "there4">
	// 1572 4486:bipush          92
	// 1573 4488:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1574 4491:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1575 4496:pop             
		MAP.put("theta", ((Object) (Character.valueOf('q'))));
	// 1576 4497:getstatic       #16  <Field Map MAP>
	// 1577 4500:ldc2            #554 <String "theta">
	// 1578 4503:bipush          113
	// 1579 4505:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1580 4508:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1581 4513:pop             
		MAP.put("thetasym", ((Object) (Character.valueOf('J'))));
	// 1582 4514:getstatic       #16  <Field Map MAP>
	// 1583 4517:ldc2            #556 <String "thetasym">
	// 1584 4520:bipush          74
	// 1585 4522:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1586 4525:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1587 4530:pop             
		MAP.put("times", ((Object) (Character.valueOf('\264'))));
	// 1588 4531:getstatic       #16  <Field Map MAP>
	// 1589 4534:ldc2            #558 <String "times">
	// 1590 4537:sipush          180
	// 1591 4540:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1592 4543:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1593 4548:pop             
		MAP.put("trade", ((Object) (Character.valueOf('\324'))));
	// 1594 4549:getstatic       #16  <Field Map MAP>
	// 1595 4552:ldc2            #560 <String "trade">
	// 1596 4555:sipush          212
	// 1597 4558:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1598 4561:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1599 4566:pop             
		MAP.put("uArr", ((Object) (Character.valueOf('\335'))));
	// 1600 4567:getstatic       #16  <Field Map MAP>
	// 1601 4570:ldc2            #562 <String "uArr">
	// 1602 4573:sipush          221
	// 1603 4576:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1604 4579:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1605 4584:pop             
		MAP.put("uarr", ((Object) (Character.valueOf('\255'))));
	// 1606 4585:getstatic       #16  <Field Map MAP>
	// 1607 4588:ldc2            #564 <String "uarr">
	// 1608 4591:sipush          173
	// 1609 4594:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1610 4597:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1611 4602:pop             
		MAP.put("upsih", ((Object) (Character.valueOf('\241'))));
	// 1612 4603:getstatic       #16  <Field Map MAP>
	// 1613 4606:ldc2            #566 <String "upsih">
	// 1614 4609:sipush          161
	// 1615 4612:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1616 4615:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1617 4620:pop             
		MAP.put("upsilon", ((Object) (Character.valueOf('u'))));
	// 1618 4621:getstatic       #16  <Field Map MAP>
	// 1619 4624:ldc2            #568 <String "upsilon">
	// 1620 4627:bipush          117
	// 1621 4629:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1622 4632:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1623 4637:pop             
		MAP.put("vertical arrow extender", ((Object) (Character.valueOf('\275'))));
	// 1624 4638:getstatic       #16  <Field Map MAP>
	// 1625 4641:ldc2            #570 <String "vertical arrow extender">
	// 1626 4644:sipush          189
	// 1627 4647:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1628 4650:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1629 4655:pop             
		MAP.put("weierp", ((Object) (Character.valueOf('\303'))));
	// 1630 4656:getstatic       #16  <Field Map MAP>
	// 1631 4659:ldc2            #572 <String "weierp">
	// 1632 4662:sipush          195
	// 1633 4665:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1634 4668:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1635 4673:pop             
		MAP.put("xi", ((Object) (Character.valueOf('x'))));
	// 1636 4674:getstatic       #16  <Field Map MAP>
	// 1637 4677:ldc2            #574 <String "xi">
	// 1638 4680:bipush          120
	// 1639 4682:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1640 4685:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1641 4690:pop             
		MAP.put("zeta", ((Object) (Character.valueOf('z'))));
	// 1642 4691:getstatic       #16  <Field Map MAP>
	// 1643 4694:ldc2            #576 <String "zeta">
	// 1644 4697:bipush          122
	// 1645 4699:invokestatic    #24  <Method Character Character.valueOf(char)>
	// 1646 4702:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1647 4707:pop             
	//*1648 4708:return          
	}
}
