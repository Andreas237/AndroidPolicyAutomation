// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.vcard;

import java.util.HashMap;
import java.util.Map;

class JapaneseUtils
{

	public static String tryGetHalfWidthText(char c)
	{
		if(sHalfWidthMap.containsKey(((Object) (Character.valueOf(c)))))
	//*   0    0:getstatic       #16  <Field Map sHalfWidthMap>
	//*   1    3:iload_0         
	//*   2    4:invokestatic    #22  <Method Character Character.valueOf(char)>
	//*   3    7:invokeinterface #556 <Method boolean Map.containsKey(Object)>
	//*   4   12:ifeq            31
			return (String)sHalfWidthMap.get(((Object) (Character.valueOf(c))));
	//    5   15:getstatic       #16  <Field Map sHalfWidthMap>
	//    6   18:iload_0         
	//    7   19:invokestatic    #22  <Method Character Character.valueOf(char)>
	//    8   22:invokeinterface #560 <Method Object Map.get(Object)>
	//    9   27:checkcast       #562 <Class String>
	//   10   30:areturn         
		else
			return null;
	//   11   31:aconst_null     
	//   12   32:areturn         
	}

	private static final Map sHalfWidthMap;

	static 
	{
		sHalfWidthMap = ((Map) (new HashMap()));
	//    0    0:new             #11  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void HashMap()>
	//    3    7:putstatic       #16  <Field Map sHalfWidthMap>
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3001'))), "\uFF64");
	//    4   10:getstatic       #16  <Field Map sHalfWidthMap>
	//    5   13:sipush          12289
	//    6   16:invokestatic    #22  <Method Character Character.valueOf(char)>
	//    7   19:ldc1            #24  <String "\uFF64">
	//    8   21:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//    9   26:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3002'))), "\uFF61");
	//   10   27:getstatic       #16  <Field Map sHalfWidthMap>
	//   11   30:sipush          12290
	//   12   33:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   13   36:ldc1            #32  <String "\uFF61">
	//   14   38:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   15   43:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u300C'))), "\uFF62");
	//   16   44:getstatic       #16  <Field Map sHalfWidthMap>
	//   17   47:sipush          12300
	//   18   50:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   19   53:ldc1            #34  <String "\uFF62">
	//   20   55:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   21   60:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u300D'))), "\uFF63");
	//   22   61:getstatic       #16  <Field Map sHalfWidthMap>
	//   23   64:sipush          12301
	//   24   67:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   25   70:ldc1            #36  <String "\uFF63">
	//   26   72:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   27   77:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u301C'))), "~");
	//   28   78:getstatic       #16  <Field Map sHalfWidthMap>
	//   29   81:sipush          12316
	//   30   84:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   31   87:ldc1            #38  <String "~">
	//   32   89:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   33   94:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3041'))), "\uFF67");
	//   34   95:getstatic       #16  <Field Map sHalfWidthMap>
	//   35   98:sipush          12353
	//   36  101:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   37  104:ldc1            #40  <String "\uFF67">
	//   38  106:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   39  111:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3042'))), "\uFF71");
	//   40  112:getstatic       #16  <Field Map sHalfWidthMap>
	//   41  115:sipush          12354
	//   42  118:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   43  121:ldc1            #42  <String "\uFF71">
	//   44  123:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   45  128:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3043'))), "\uFF68");
	//   46  129:getstatic       #16  <Field Map sHalfWidthMap>
	//   47  132:sipush          12355
	//   48  135:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   49  138:ldc1            #44  <String "\uFF68">
	//   50  140:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   51  145:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3044'))), "\uFF72");
	//   52  146:getstatic       #16  <Field Map sHalfWidthMap>
	//   53  149:sipush          12356
	//   54  152:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   55  155:ldc1            #46  <String "\uFF72">
	//   56  157:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   57  162:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3045'))), "\uFF69");
	//   58  163:getstatic       #16  <Field Map sHalfWidthMap>
	//   59  166:sipush          12357
	//   60  169:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   61  172:ldc1            #48  <String "\uFF69">
	//   62  174:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   63  179:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3046'))), "\uFF73");
	//   64  180:getstatic       #16  <Field Map sHalfWidthMap>
	//   65  183:sipush          12358
	//   66  186:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   67  189:ldc1            #50  <String "\uFF73">
	//   68  191:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   69  196:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3047'))), "\uFF6A");
	//   70  197:getstatic       #16  <Field Map sHalfWidthMap>
	//   71  200:sipush          12359
	//   72  203:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   73  206:ldc1            #52  <String "\uFF6A">
	//   74  208:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   75  213:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3048'))), "\uFF74");
	//   76  214:getstatic       #16  <Field Map sHalfWidthMap>
	//   77  217:sipush          12360
	//   78  220:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   79  223:ldc1            #54  <String "\uFF74">
	//   80  225:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   81  230:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3049'))), "\uFF6B");
	//   82  231:getstatic       #16  <Field Map sHalfWidthMap>
	//   83  234:sipush          12361
	//   84  237:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   85  240:ldc1            #56  <String "\uFF6B">
	//   86  242:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   87  247:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u304A'))), "\uFF75");
	//   88  248:getstatic       #16  <Field Map sHalfWidthMap>
	//   89  251:sipush          12362
	//   90  254:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   91  257:ldc1            #58  <String "\uFF75">
	//   92  259:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   93  264:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u304B'))), "\uFF76");
	//   94  265:getstatic       #16  <Field Map sHalfWidthMap>
	//   95  268:sipush          12363
	//   96  271:invokestatic    #22  <Method Character Character.valueOf(char)>
	//   97  274:ldc1            #60  <String "\uFF76">
	//   98  276:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   99  281:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u304C'))), "\uFF76\uFF9E");
	//  100  282:getstatic       #16  <Field Map sHalfWidthMap>
	//  101  285:sipush          12364
	//  102  288:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  103  291:ldc1            #62  <String "\uFF76\uFF9E">
	//  104  293:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  105  298:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u304D'))), "\uFF77");
	//  106  299:getstatic       #16  <Field Map sHalfWidthMap>
	//  107  302:sipush          12365
	//  108  305:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  109  308:ldc1            #64  <String "\uFF77">
	//  110  310:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  111  315:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u304E'))), "\uFF77\uFF9E");
	//  112  316:getstatic       #16  <Field Map sHalfWidthMap>
	//  113  319:sipush          12366
	//  114  322:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  115  325:ldc1            #66  <String "\uFF77\uFF9E">
	//  116  327:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  117  332:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u304F'))), "\uFF78");
	//  118  333:getstatic       #16  <Field Map sHalfWidthMap>
	//  119  336:sipush          12367
	//  120  339:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  121  342:ldc1            #68  <String "\uFF78">
	//  122  344:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  123  349:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3050'))), "\uFF78\uFF9E");
	//  124  350:getstatic       #16  <Field Map sHalfWidthMap>
	//  125  353:sipush          12368
	//  126  356:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  127  359:ldc1            #70  <String "\uFF78\uFF9E">
	//  128  361:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  129  366:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3051'))), "\uFF79");
	//  130  367:getstatic       #16  <Field Map sHalfWidthMap>
	//  131  370:sipush          12369
	//  132  373:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  133  376:ldc1            #72  <String "\uFF79">
	//  134  378:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  135  383:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3052'))), "\uFF79\uFF9E");
	//  136  384:getstatic       #16  <Field Map sHalfWidthMap>
	//  137  387:sipush          12370
	//  138  390:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  139  393:ldc1            #74  <String "\uFF79\uFF9E">
	//  140  395:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  141  400:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3053'))), "\uFF7A");
	//  142  401:getstatic       #16  <Field Map sHalfWidthMap>
	//  143  404:sipush          12371
	//  144  407:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  145  410:ldc1            #76  <String "\uFF7A">
	//  146  412:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  147  417:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3054'))), "\uFF7A\uFF9E");
	//  148  418:getstatic       #16  <Field Map sHalfWidthMap>
	//  149  421:sipush          12372
	//  150  424:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  151  427:ldc1            #78  <String "\uFF7A\uFF9E">
	//  152  429:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  153  434:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3055'))), "\uFF7B");
	//  154  435:getstatic       #16  <Field Map sHalfWidthMap>
	//  155  438:sipush          12373
	//  156  441:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  157  444:ldc1            #80  <String "\uFF7B">
	//  158  446:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  159  451:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3056'))), "\uFF7B\uFF9E");
	//  160  452:getstatic       #16  <Field Map sHalfWidthMap>
	//  161  455:sipush          12374
	//  162  458:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  163  461:ldc1            #82  <String "\uFF7B\uFF9E">
	//  164  463:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  165  468:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3057'))), "\uFF7C");
	//  166  469:getstatic       #16  <Field Map sHalfWidthMap>
	//  167  472:sipush          12375
	//  168  475:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  169  478:ldc1            #84  <String "\uFF7C">
	//  170  480:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  171  485:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3058'))), "\uFF7C\uFF9E");
	//  172  486:getstatic       #16  <Field Map sHalfWidthMap>
	//  173  489:sipush          12376
	//  174  492:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  175  495:ldc1            #86  <String "\uFF7C\uFF9E">
	//  176  497:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  177  502:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3059'))), "\uFF7D");
	//  178  503:getstatic       #16  <Field Map sHalfWidthMap>
	//  179  506:sipush          12377
	//  180  509:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  181  512:ldc1            #88  <String "\uFF7D">
	//  182  514:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  183  519:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u305A'))), "\uFF7D\uFF9E");
	//  184  520:getstatic       #16  <Field Map sHalfWidthMap>
	//  185  523:sipush          12378
	//  186  526:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  187  529:ldc1            #90  <String "\uFF7D\uFF9E">
	//  188  531:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  189  536:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u305B'))), "\uFF7E");
	//  190  537:getstatic       #16  <Field Map sHalfWidthMap>
	//  191  540:sipush          12379
	//  192  543:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  193  546:ldc1            #92  <String "\uFF7E">
	//  194  548:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  195  553:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u305C'))), "\uFF7E\uFF9E");
	//  196  554:getstatic       #16  <Field Map sHalfWidthMap>
	//  197  557:sipush          12380
	//  198  560:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  199  563:ldc1            #94  <String "\uFF7E\uFF9E">
	//  200  565:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  201  570:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u305D'))), "\uFF7F");
	//  202  571:getstatic       #16  <Field Map sHalfWidthMap>
	//  203  574:sipush          12381
	//  204  577:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  205  580:ldc1            #96  <String "\uFF7F">
	//  206  582:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  207  587:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u305E'))), "\uFF7F\uFF9E");
	//  208  588:getstatic       #16  <Field Map sHalfWidthMap>
	//  209  591:sipush          12382
	//  210  594:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  211  597:ldc1            #98  <String "\uFF7F\uFF9E">
	//  212  599:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  213  604:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u305F'))), "\uFF80");
	//  214  605:getstatic       #16  <Field Map sHalfWidthMap>
	//  215  608:sipush          12383
	//  216  611:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  217  614:ldc1            #100 <String "\uFF80">
	//  218  616:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  219  621:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3060'))), "\uFF80\uFF9E");
	//  220  622:getstatic       #16  <Field Map sHalfWidthMap>
	//  221  625:sipush          12384
	//  222  628:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  223  631:ldc1            #102 <String "\uFF80\uFF9E">
	//  224  633:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  225  638:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3061'))), "\uFF81");
	//  226  639:getstatic       #16  <Field Map sHalfWidthMap>
	//  227  642:sipush          12385
	//  228  645:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  229  648:ldc1            #104 <String "\uFF81">
	//  230  650:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  231  655:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3062'))), "\uFF81\uFF9E");
	//  232  656:getstatic       #16  <Field Map sHalfWidthMap>
	//  233  659:sipush          12386
	//  234  662:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  235  665:ldc1            #106 <String "\uFF81\uFF9E">
	//  236  667:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  237  672:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3063'))), "\uFF6F");
	//  238  673:getstatic       #16  <Field Map sHalfWidthMap>
	//  239  676:sipush          12387
	//  240  679:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  241  682:ldc1            #108 <String "\uFF6F">
	//  242  684:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  243  689:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3064'))), "\uFF82");
	//  244  690:getstatic       #16  <Field Map sHalfWidthMap>
	//  245  693:sipush          12388
	//  246  696:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  247  699:ldc1            #110 <String "\uFF82">
	//  248  701:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  249  706:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3065'))), "\uFF82\uFF9E");
	//  250  707:getstatic       #16  <Field Map sHalfWidthMap>
	//  251  710:sipush          12389
	//  252  713:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  253  716:ldc1            #112 <String "\uFF82\uFF9E">
	//  254  718:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  255  723:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3066'))), "\uFF83");
	//  256  724:getstatic       #16  <Field Map sHalfWidthMap>
	//  257  727:sipush          12390
	//  258  730:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  259  733:ldc1            #114 <String "\uFF83">
	//  260  735:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  261  740:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3067'))), "\uFF83\uFF9E");
	//  262  741:getstatic       #16  <Field Map sHalfWidthMap>
	//  263  744:sipush          12391
	//  264  747:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  265  750:ldc1            #116 <String "\uFF83\uFF9E">
	//  266  752:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  267  757:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3068'))), "\uFF84");
	//  268  758:getstatic       #16  <Field Map sHalfWidthMap>
	//  269  761:sipush          12392
	//  270  764:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  271  767:ldc1            #118 <String "\uFF84">
	//  272  769:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  273  774:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3069'))), "\uFF84\uFF9E");
	//  274  775:getstatic       #16  <Field Map sHalfWidthMap>
	//  275  778:sipush          12393
	//  276  781:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  277  784:ldc1            #120 <String "\uFF84\uFF9E">
	//  278  786:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  279  791:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u306A'))), "\uFF85");
	//  280  792:getstatic       #16  <Field Map sHalfWidthMap>
	//  281  795:sipush          12394
	//  282  798:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  283  801:ldc1            #122 <String "\uFF85">
	//  284  803:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  285  808:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u306B'))), "\uFF86");
	//  286  809:getstatic       #16  <Field Map sHalfWidthMap>
	//  287  812:sipush          12395
	//  288  815:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  289  818:ldc1            #124 <String "\uFF86">
	//  290  820:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  291  825:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u306C'))), "\uFF87");
	//  292  826:getstatic       #16  <Field Map sHalfWidthMap>
	//  293  829:sipush          12396
	//  294  832:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  295  835:ldc1            #126 <String "\uFF87">
	//  296  837:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  297  842:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u306D'))), "\uFF88");
	//  298  843:getstatic       #16  <Field Map sHalfWidthMap>
	//  299  846:sipush          12397
	//  300  849:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  301  852:ldc1            #128 <String "\uFF88">
	//  302  854:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  303  859:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u306E'))), "\uFF89");
	//  304  860:getstatic       #16  <Field Map sHalfWidthMap>
	//  305  863:sipush          12398
	//  306  866:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  307  869:ldc1            #130 <String "\uFF89">
	//  308  871:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  309  876:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u306F'))), "\uFF8A");
	//  310  877:getstatic       #16  <Field Map sHalfWidthMap>
	//  311  880:sipush          12399
	//  312  883:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  313  886:ldc1            #132 <String "\uFF8A">
	//  314  888:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  315  893:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3070'))), "\uFF8A\uFF9E");
	//  316  894:getstatic       #16  <Field Map sHalfWidthMap>
	//  317  897:sipush          12400
	//  318  900:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  319  903:ldc1            #134 <String "\uFF8A\uFF9E">
	//  320  905:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  321  910:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3071'))), "\uFF8A\uFF9F");
	//  322  911:getstatic       #16  <Field Map sHalfWidthMap>
	//  323  914:sipush          12401
	//  324  917:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  325  920:ldc1            #136 <String "\uFF8A\uFF9F">
	//  326  922:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  327  927:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3072'))), "\uFF8B");
	//  328  928:getstatic       #16  <Field Map sHalfWidthMap>
	//  329  931:sipush          12402
	//  330  934:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  331  937:ldc1            #138 <String "\uFF8B">
	//  332  939:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  333  944:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3073'))), "\uFF8B\uFF9E");
	//  334  945:getstatic       #16  <Field Map sHalfWidthMap>
	//  335  948:sipush          12403
	//  336  951:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  337  954:ldc1            #140 <String "\uFF8B\uFF9E">
	//  338  956:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  339  961:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3074'))), "\uFF8B\uFF9F");
	//  340  962:getstatic       #16  <Field Map sHalfWidthMap>
	//  341  965:sipush          12404
	//  342  968:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  343  971:ldc1            #142 <String "\uFF8B\uFF9F">
	//  344  973:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  345  978:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3075'))), "\uFF8C");
	//  346  979:getstatic       #16  <Field Map sHalfWidthMap>
	//  347  982:sipush          12405
	//  348  985:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  349  988:ldc1            #144 <String "\uFF8C">
	//  350  990:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  351  995:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3076'))), "\uFF8C\uFF9E");
	//  352  996:getstatic       #16  <Field Map sHalfWidthMap>
	//  353  999:sipush          12406
	//  354 1002:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  355 1005:ldc1            #146 <String "\uFF8C\uFF9E">
	//  356 1007:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  357 1012:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3077'))), "\uFF8C\uFF9F");
	//  358 1013:getstatic       #16  <Field Map sHalfWidthMap>
	//  359 1016:sipush          12407
	//  360 1019:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  361 1022:ldc1            #148 <String "\uFF8C\uFF9F">
	//  362 1024:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  363 1029:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3078'))), "\uFF8D");
	//  364 1030:getstatic       #16  <Field Map sHalfWidthMap>
	//  365 1033:sipush          12408
	//  366 1036:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  367 1039:ldc1            #150 <String "\uFF8D">
	//  368 1041:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  369 1046:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3079'))), "\uFF8D\uFF9E");
	//  370 1047:getstatic       #16  <Field Map sHalfWidthMap>
	//  371 1050:sipush          12409
	//  372 1053:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  373 1056:ldc1            #152 <String "\uFF8D\uFF9E">
	//  374 1058:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  375 1063:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u307A'))), "\uFF8D\uFF9F");
	//  376 1064:getstatic       #16  <Field Map sHalfWidthMap>
	//  377 1067:sipush          12410
	//  378 1070:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  379 1073:ldc1            #154 <String "\uFF8D\uFF9F">
	//  380 1075:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  381 1080:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u307B'))), "\uFF8E");
	//  382 1081:getstatic       #16  <Field Map sHalfWidthMap>
	//  383 1084:sipush          12411
	//  384 1087:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  385 1090:ldc1            #156 <String "\uFF8E">
	//  386 1092:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  387 1097:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u307C'))), "\uFF8E\uFF9E");
	//  388 1098:getstatic       #16  <Field Map sHalfWidthMap>
	//  389 1101:sipush          12412
	//  390 1104:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  391 1107:ldc1            #158 <String "\uFF8E\uFF9E">
	//  392 1109:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  393 1114:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u307D'))), "\uFF8E\uFF9F");
	//  394 1115:getstatic       #16  <Field Map sHalfWidthMap>
	//  395 1118:sipush          12413
	//  396 1121:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  397 1124:ldc1            #160 <String "\uFF8E\uFF9F">
	//  398 1126:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  399 1131:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u307E'))), "\uFF8F");
	//  400 1132:getstatic       #16  <Field Map sHalfWidthMap>
	//  401 1135:sipush          12414
	//  402 1138:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  403 1141:ldc1            #162 <String "\uFF8F">
	//  404 1143:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  405 1148:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u307F'))), "\uFF90");
	//  406 1149:getstatic       #16  <Field Map sHalfWidthMap>
	//  407 1152:sipush          12415
	//  408 1155:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  409 1158:ldc1            #164 <String "\uFF90">
	//  410 1160:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  411 1165:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3080'))), "\uFF91");
	//  412 1166:getstatic       #16  <Field Map sHalfWidthMap>
	//  413 1169:sipush          12416
	//  414 1172:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  415 1175:ldc1            #166 <String "\uFF91">
	//  416 1177:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  417 1182:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3081'))), "\uFF92");
	//  418 1183:getstatic       #16  <Field Map sHalfWidthMap>
	//  419 1186:sipush          12417
	//  420 1189:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  421 1192:ldc1            #168 <String "\uFF92">
	//  422 1194:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  423 1199:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3082'))), "\uFF93");
	//  424 1200:getstatic       #16  <Field Map sHalfWidthMap>
	//  425 1203:sipush          12418
	//  426 1206:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  427 1209:ldc1            #170 <String "\uFF93">
	//  428 1211:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  429 1216:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3083'))), "\uFF6C");
	//  430 1217:getstatic       #16  <Field Map sHalfWidthMap>
	//  431 1220:sipush          12419
	//  432 1223:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  433 1226:ldc1            #172 <String "\uFF6C">
	//  434 1228:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  435 1233:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3084'))), "\uFF94");
	//  436 1234:getstatic       #16  <Field Map sHalfWidthMap>
	//  437 1237:sipush          12420
	//  438 1240:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  439 1243:ldc1            #174 <String "\uFF94">
	//  440 1245:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  441 1250:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3085'))), "\uFF6D");
	//  442 1251:getstatic       #16  <Field Map sHalfWidthMap>
	//  443 1254:sipush          12421
	//  444 1257:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  445 1260:ldc1            #176 <String "\uFF6D">
	//  446 1262:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  447 1267:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3086'))), "\uFF95");
	//  448 1268:getstatic       #16  <Field Map sHalfWidthMap>
	//  449 1271:sipush          12422
	//  450 1274:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  451 1277:ldc1            #178 <String "\uFF95">
	//  452 1279:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  453 1284:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3087'))), "\uFF6E");
	//  454 1285:getstatic       #16  <Field Map sHalfWidthMap>
	//  455 1288:sipush          12423
	//  456 1291:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  457 1294:ldc1            #180 <String "\uFF6E">
	//  458 1296:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  459 1301:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3088'))), "\uFF96");
	//  460 1302:getstatic       #16  <Field Map sHalfWidthMap>
	//  461 1305:sipush          12424
	//  462 1308:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  463 1311:ldc1            #182 <String "\uFF96">
	//  464 1313:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  465 1318:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3089'))), "\uFF97");
	//  466 1319:getstatic       #16  <Field Map sHalfWidthMap>
	//  467 1322:sipush          12425
	//  468 1325:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  469 1328:ldc1            #184 <String "\uFF97">
	//  470 1330:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  471 1335:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u308A'))), "\uFF98");
	//  472 1336:getstatic       #16  <Field Map sHalfWidthMap>
	//  473 1339:sipush          12426
	//  474 1342:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  475 1345:ldc1            #186 <String "\uFF98">
	//  476 1347:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  477 1352:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u308B'))), "\uFF99");
	//  478 1353:getstatic       #16  <Field Map sHalfWidthMap>
	//  479 1356:sipush          12427
	//  480 1359:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  481 1362:ldc1            #188 <String "\uFF99">
	//  482 1364:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  483 1369:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u308C'))), "\uFF9A");
	//  484 1370:getstatic       #16  <Field Map sHalfWidthMap>
	//  485 1373:sipush          12428
	//  486 1376:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  487 1379:ldc1            #190 <String "\uFF9A">
	//  488 1381:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  489 1386:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u308D'))), "\uFF9B");
	//  490 1387:getstatic       #16  <Field Map sHalfWidthMap>
	//  491 1390:sipush          12429
	//  492 1393:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  493 1396:ldc1            #192 <String "\uFF9B">
	//  494 1398:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  495 1403:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u308E'))), "\uFF9C");
	//  496 1404:getstatic       #16  <Field Map sHalfWidthMap>
	//  497 1407:sipush          12430
	//  498 1410:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  499 1413:ldc1            #194 <String "\uFF9C">
	//  500 1415:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  501 1420:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u308F'))), "\uFF9C");
	//  502 1421:getstatic       #16  <Field Map sHalfWidthMap>
	//  503 1424:sipush          12431
	//  504 1427:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  505 1430:ldc1            #194 <String "\uFF9C">
	//  506 1432:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  507 1437:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3090'))), "\uFF72");
	//  508 1438:getstatic       #16  <Field Map sHalfWidthMap>
	//  509 1441:sipush          12432
	//  510 1444:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  511 1447:ldc1            #46  <String "\uFF72">
	//  512 1449:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  513 1454:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3091'))), "\uFF74");
	//  514 1455:getstatic       #16  <Field Map sHalfWidthMap>
	//  515 1458:sipush          12433
	//  516 1461:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  517 1464:ldc1            #54  <String "\uFF74">
	//  518 1466:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  519 1471:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3092'))), "\uFF66");
	//  520 1472:getstatic       #16  <Field Map sHalfWidthMap>
	//  521 1475:sipush          12434
	//  522 1478:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  523 1481:ldc1            #196 <String "\uFF66">
	//  524 1483:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  525 1488:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u3093'))), "\uFF9D");
	//  526 1489:getstatic       #16  <Field Map sHalfWidthMap>
	//  527 1492:sipush          12435
	//  528 1495:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  529 1498:ldc1            #198 <String "\uFF9D">
	//  530 1500:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  531 1505:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u309B'))), "\uFF9E");
	//  532 1506:getstatic       #16  <Field Map sHalfWidthMap>
	//  533 1509:sipush          12443
	//  534 1512:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  535 1515:ldc1            #200 <String "\uFF9E">
	//  536 1517:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  537 1522:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u309C'))), "\uFF9F");
	//  538 1523:getstatic       #16  <Field Map sHalfWidthMap>
	//  539 1526:sipush          12444
	//  540 1529:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  541 1532:ldc1            #202 <String "\uFF9F">
	//  542 1534:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  543 1539:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30A1'))), "\uFF67");
	//  544 1540:getstatic       #16  <Field Map sHalfWidthMap>
	//  545 1543:sipush          12449
	//  546 1546:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  547 1549:ldc1            #40  <String "\uFF67">
	//  548 1551:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  549 1556:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30A2'))), "\uFF71");
	//  550 1557:getstatic       #16  <Field Map sHalfWidthMap>
	//  551 1560:sipush          12450
	//  552 1563:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  553 1566:ldc1            #42  <String "\uFF71">
	//  554 1568:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  555 1573:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30A3'))), "\uFF68");
	//  556 1574:getstatic       #16  <Field Map sHalfWidthMap>
	//  557 1577:sipush          12451
	//  558 1580:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  559 1583:ldc1            #44  <String "\uFF68">
	//  560 1585:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  561 1590:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30A4'))), "\uFF72");
	//  562 1591:getstatic       #16  <Field Map sHalfWidthMap>
	//  563 1594:sipush          12452
	//  564 1597:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  565 1600:ldc1            #46  <String "\uFF72">
	//  566 1602:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  567 1607:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30A5'))), "\uFF69");
	//  568 1608:getstatic       #16  <Field Map sHalfWidthMap>
	//  569 1611:sipush          12453
	//  570 1614:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  571 1617:ldc1            #48  <String "\uFF69">
	//  572 1619:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  573 1624:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30A6'))), "\uFF73");
	//  574 1625:getstatic       #16  <Field Map sHalfWidthMap>
	//  575 1628:sipush          12454
	//  576 1631:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  577 1634:ldc1            #50  <String "\uFF73">
	//  578 1636:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  579 1641:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30A7'))), "\uFF6A");
	//  580 1642:getstatic       #16  <Field Map sHalfWidthMap>
	//  581 1645:sipush          12455
	//  582 1648:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  583 1651:ldc1            #52  <String "\uFF6A">
	//  584 1653:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  585 1658:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30A8'))), "\uFF74");
	//  586 1659:getstatic       #16  <Field Map sHalfWidthMap>
	//  587 1662:sipush          12456
	//  588 1665:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  589 1668:ldc1            #54  <String "\uFF74">
	//  590 1670:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  591 1675:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30A9'))), "\uFF6B");
	//  592 1676:getstatic       #16  <Field Map sHalfWidthMap>
	//  593 1679:sipush          12457
	//  594 1682:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  595 1685:ldc1            #56  <String "\uFF6B">
	//  596 1687:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  597 1692:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30AA'))), "\uFF75");
	//  598 1693:getstatic       #16  <Field Map sHalfWidthMap>
	//  599 1696:sipush          12458
	//  600 1699:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  601 1702:ldc1            #58  <String "\uFF75">
	//  602 1704:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  603 1709:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30AB'))), "\uFF76");
	//  604 1710:getstatic       #16  <Field Map sHalfWidthMap>
	//  605 1713:sipush          12459
	//  606 1716:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  607 1719:ldc1            #60  <String "\uFF76">
	//  608 1721:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  609 1726:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30AC'))), "\uFF76\uFF9E");
	//  610 1727:getstatic       #16  <Field Map sHalfWidthMap>
	//  611 1730:sipush          12460
	//  612 1733:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  613 1736:ldc1            #62  <String "\uFF76\uFF9E">
	//  614 1738:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  615 1743:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30AD'))), "\uFF77");
	//  616 1744:getstatic       #16  <Field Map sHalfWidthMap>
	//  617 1747:sipush          12461
	//  618 1750:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  619 1753:ldc1            #64  <String "\uFF77">
	//  620 1755:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  621 1760:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30AE'))), "\uFF77\uFF9E");
	//  622 1761:getstatic       #16  <Field Map sHalfWidthMap>
	//  623 1764:sipush          12462
	//  624 1767:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  625 1770:ldc1            #66  <String "\uFF77\uFF9E">
	//  626 1772:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  627 1777:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30AF'))), "\uFF78");
	//  628 1778:getstatic       #16  <Field Map sHalfWidthMap>
	//  629 1781:sipush          12463
	//  630 1784:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  631 1787:ldc1            #68  <String "\uFF78">
	//  632 1789:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  633 1794:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30B0'))), "\uFF78\uFF9E");
	//  634 1795:getstatic       #16  <Field Map sHalfWidthMap>
	//  635 1798:sipush          12464
	//  636 1801:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  637 1804:ldc1            #70  <String "\uFF78\uFF9E">
	//  638 1806:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  639 1811:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30B1'))), "\uFF79");
	//  640 1812:getstatic       #16  <Field Map sHalfWidthMap>
	//  641 1815:sipush          12465
	//  642 1818:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  643 1821:ldc1            #72  <String "\uFF79">
	//  644 1823:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  645 1828:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30B2'))), "\uFF79\uFF9E");
	//  646 1829:getstatic       #16  <Field Map sHalfWidthMap>
	//  647 1832:sipush          12466
	//  648 1835:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  649 1838:ldc1            #74  <String "\uFF79\uFF9E">
	//  650 1840:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  651 1845:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30B3'))), "\uFF7A");
	//  652 1846:getstatic       #16  <Field Map sHalfWidthMap>
	//  653 1849:sipush          12467
	//  654 1852:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  655 1855:ldc1            #76  <String "\uFF7A">
	//  656 1857:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  657 1862:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30B4'))), "\uFF7A\uFF9E");
	//  658 1863:getstatic       #16  <Field Map sHalfWidthMap>
	//  659 1866:sipush          12468
	//  660 1869:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  661 1872:ldc1            #78  <String "\uFF7A\uFF9E">
	//  662 1874:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  663 1879:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30B5'))), "\uFF7B");
	//  664 1880:getstatic       #16  <Field Map sHalfWidthMap>
	//  665 1883:sipush          12469
	//  666 1886:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  667 1889:ldc1            #80  <String "\uFF7B">
	//  668 1891:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  669 1896:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30B6'))), "\uFF7B\uFF9E");
	//  670 1897:getstatic       #16  <Field Map sHalfWidthMap>
	//  671 1900:sipush          12470
	//  672 1903:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  673 1906:ldc1            #82  <String "\uFF7B\uFF9E">
	//  674 1908:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  675 1913:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30B7'))), "\uFF7C");
	//  676 1914:getstatic       #16  <Field Map sHalfWidthMap>
	//  677 1917:sipush          12471
	//  678 1920:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  679 1923:ldc1            #84  <String "\uFF7C">
	//  680 1925:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  681 1930:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30B8'))), "\uFF7C\uFF9E");
	//  682 1931:getstatic       #16  <Field Map sHalfWidthMap>
	//  683 1934:sipush          12472
	//  684 1937:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  685 1940:ldc1            #86  <String "\uFF7C\uFF9E">
	//  686 1942:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  687 1947:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30B9'))), "\uFF7D");
	//  688 1948:getstatic       #16  <Field Map sHalfWidthMap>
	//  689 1951:sipush          12473
	//  690 1954:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  691 1957:ldc1            #88  <String "\uFF7D">
	//  692 1959:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  693 1964:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30BA'))), "\uFF7D\uFF9E");
	//  694 1965:getstatic       #16  <Field Map sHalfWidthMap>
	//  695 1968:sipush          12474
	//  696 1971:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  697 1974:ldc1            #90  <String "\uFF7D\uFF9E">
	//  698 1976:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  699 1981:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30BB'))), "\uFF7E");
	//  700 1982:getstatic       #16  <Field Map sHalfWidthMap>
	//  701 1985:sipush          12475
	//  702 1988:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  703 1991:ldc1            #92  <String "\uFF7E">
	//  704 1993:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  705 1998:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30BC'))), "\uFF7E\uFF9E");
	//  706 1999:getstatic       #16  <Field Map sHalfWidthMap>
	//  707 2002:sipush          12476
	//  708 2005:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  709 2008:ldc1            #94  <String "\uFF7E\uFF9E">
	//  710 2010:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  711 2015:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30BD'))), "\uFF7F");
	//  712 2016:getstatic       #16  <Field Map sHalfWidthMap>
	//  713 2019:sipush          12477
	//  714 2022:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  715 2025:ldc1            #96  <String "\uFF7F">
	//  716 2027:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  717 2032:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30BE'))), "\uFF7F\uFF9E");
	//  718 2033:getstatic       #16  <Field Map sHalfWidthMap>
	//  719 2036:sipush          12478
	//  720 2039:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  721 2042:ldc1            #98  <String "\uFF7F\uFF9E">
	//  722 2044:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  723 2049:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30BF'))), "\uFF80");
	//  724 2050:getstatic       #16  <Field Map sHalfWidthMap>
	//  725 2053:sipush          12479
	//  726 2056:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  727 2059:ldc1            #100 <String "\uFF80">
	//  728 2061:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  729 2066:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30C0'))), "\uFF80\uFF9E");
	//  730 2067:getstatic       #16  <Field Map sHalfWidthMap>
	//  731 2070:sipush          12480
	//  732 2073:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  733 2076:ldc1            #102 <String "\uFF80\uFF9E">
	//  734 2078:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  735 2083:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30C1'))), "\uFF81");
	//  736 2084:getstatic       #16  <Field Map sHalfWidthMap>
	//  737 2087:sipush          12481
	//  738 2090:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  739 2093:ldc1            #104 <String "\uFF81">
	//  740 2095:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  741 2100:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30C2'))), "\uFF81\uFF9E");
	//  742 2101:getstatic       #16  <Field Map sHalfWidthMap>
	//  743 2104:sipush          12482
	//  744 2107:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  745 2110:ldc1            #106 <String "\uFF81\uFF9E">
	//  746 2112:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  747 2117:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30C3'))), "\uFF6F");
	//  748 2118:getstatic       #16  <Field Map sHalfWidthMap>
	//  749 2121:sipush          12483
	//  750 2124:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  751 2127:ldc1            #108 <String "\uFF6F">
	//  752 2129:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  753 2134:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30C4'))), "\uFF82");
	//  754 2135:getstatic       #16  <Field Map sHalfWidthMap>
	//  755 2138:sipush          12484
	//  756 2141:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  757 2144:ldc1            #110 <String "\uFF82">
	//  758 2146:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  759 2151:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30C5'))), "\uFF82\uFF9E");
	//  760 2152:getstatic       #16  <Field Map sHalfWidthMap>
	//  761 2155:sipush          12485
	//  762 2158:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  763 2161:ldc1            #112 <String "\uFF82\uFF9E">
	//  764 2163:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  765 2168:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30C6'))), "\uFF83");
	//  766 2169:getstatic       #16  <Field Map sHalfWidthMap>
	//  767 2172:sipush          12486
	//  768 2175:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  769 2178:ldc1            #114 <String "\uFF83">
	//  770 2180:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  771 2185:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30C7'))), "\uFF83\uFF9E");
	//  772 2186:getstatic       #16  <Field Map sHalfWidthMap>
	//  773 2189:sipush          12487
	//  774 2192:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  775 2195:ldc1            #116 <String "\uFF83\uFF9E">
	//  776 2197:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  777 2202:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30C8'))), "\uFF84");
	//  778 2203:getstatic       #16  <Field Map sHalfWidthMap>
	//  779 2206:sipush          12488
	//  780 2209:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  781 2212:ldc1            #118 <String "\uFF84">
	//  782 2214:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  783 2219:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30C9'))), "\uFF84\uFF9E");
	//  784 2220:getstatic       #16  <Field Map sHalfWidthMap>
	//  785 2223:sipush          12489
	//  786 2226:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  787 2229:ldc1            #120 <String "\uFF84\uFF9E">
	//  788 2231:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  789 2236:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30CA'))), "\uFF85");
	//  790 2237:getstatic       #16  <Field Map sHalfWidthMap>
	//  791 2240:sipush          12490
	//  792 2243:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  793 2246:ldc1            #122 <String "\uFF85">
	//  794 2248:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  795 2253:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30CB'))), "\uFF86");
	//  796 2254:getstatic       #16  <Field Map sHalfWidthMap>
	//  797 2257:sipush          12491
	//  798 2260:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  799 2263:ldc1            #124 <String "\uFF86">
	//  800 2265:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  801 2270:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30CC'))), "\uFF87");
	//  802 2271:getstatic       #16  <Field Map sHalfWidthMap>
	//  803 2274:sipush          12492
	//  804 2277:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  805 2280:ldc1            #126 <String "\uFF87">
	//  806 2282:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  807 2287:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30CD'))), "\uFF88");
	//  808 2288:getstatic       #16  <Field Map sHalfWidthMap>
	//  809 2291:sipush          12493
	//  810 2294:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  811 2297:ldc1            #128 <String "\uFF88">
	//  812 2299:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  813 2304:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30CE'))), "\uFF89");
	//  814 2305:getstatic       #16  <Field Map sHalfWidthMap>
	//  815 2308:sipush          12494
	//  816 2311:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  817 2314:ldc1            #130 <String "\uFF89">
	//  818 2316:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  819 2321:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30CF'))), "\uFF8A");
	//  820 2322:getstatic       #16  <Field Map sHalfWidthMap>
	//  821 2325:sipush          12495
	//  822 2328:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  823 2331:ldc1            #132 <String "\uFF8A">
	//  824 2333:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  825 2338:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30D0'))), "\uFF8A\uFF9E");
	//  826 2339:getstatic       #16  <Field Map sHalfWidthMap>
	//  827 2342:sipush          12496
	//  828 2345:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  829 2348:ldc1            #134 <String "\uFF8A\uFF9E">
	//  830 2350:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  831 2355:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30D1'))), "\uFF8A\uFF9F");
	//  832 2356:getstatic       #16  <Field Map sHalfWidthMap>
	//  833 2359:sipush          12497
	//  834 2362:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  835 2365:ldc1            #136 <String "\uFF8A\uFF9F">
	//  836 2367:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  837 2372:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30D2'))), "\uFF8B");
	//  838 2373:getstatic       #16  <Field Map sHalfWidthMap>
	//  839 2376:sipush          12498
	//  840 2379:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  841 2382:ldc1            #138 <String "\uFF8B">
	//  842 2384:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  843 2389:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30D3'))), "\uFF8B\uFF9E");
	//  844 2390:getstatic       #16  <Field Map sHalfWidthMap>
	//  845 2393:sipush          12499
	//  846 2396:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  847 2399:ldc1            #140 <String "\uFF8B\uFF9E">
	//  848 2401:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  849 2406:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30D4'))), "\uFF8B\uFF9F");
	//  850 2407:getstatic       #16  <Field Map sHalfWidthMap>
	//  851 2410:sipush          12500
	//  852 2413:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  853 2416:ldc1            #142 <String "\uFF8B\uFF9F">
	//  854 2418:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  855 2423:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30D5'))), "\uFF8C");
	//  856 2424:getstatic       #16  <Field Map sHalfWidthMap>
	//  857 2427:sipush          12501
	//  858 2430:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  859 2433:ldc1            #144 <String "\uFF8C">
	//  860 2435:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  861 2440:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30D6'))), "\uFF8C\uFF9E");
	//  862 2441:getstatic       #16  <Field Map sHalfWidthMap>
	//  863 2444:sipush          12502
	//  864 2447:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  865 2450:ldc1            #146 <String "\uFF8C\uFF9E">
	//  866 2452:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  867 2457:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30D7'))), "\uFF8C\uFF9F");
	//  868 2458:getstatic       #16  <Field Map sHalfWidthMap>
	//  869 2461:sipush          12503
	//  870 2464:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  871 2467:ldc1            #148 <String "\uFF8C\uFF9F">
	//  872 2469:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  873 2474:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30D8'))), "\uFF8D");
	//  874 2475:getstatic       #16  <Field Map sHalfWidthMap>
	//  875 2478:sipush          12504
	//  876 2481:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  877 2484:ldc1            #150 <String "\uFF8D">
	//  878 2486:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  879 2491:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30D9'))), "\uFF8D\uFF9E");
	//  880 2492:getstatic       #16  <Field Map sHalfWidthMap>
	//  881 2495:sipush          12505
	//  882 2498:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  883 2501:ldc1            #152 <String "\uFF8D\uFF9E">
	//  884 2503:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  885 2508:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30DA'))), "\uFF8D\uFF9F");
	//  886 2509:getstatic       #16  <Field Map sHalfWidthMap>
	//  887 2512:sipush          12506
	//  888 2515:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  889 2518:ldc1            #154 <String "\uFF8D\uFF9F">
	//  890 2520:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  891 2525:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30DB'))), "\uFF8E");
	//  892 2526:getstatic       #16  <Field Map sHalfWidthMap>
	//  893 2529:sipush          12507
	//  894 2532:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  895 2535:ldc1            #156 <String "\uFF8E">
	//  896 2537:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  897 2542:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30DC'))), "\uFF8E\uFF9E");
	//  898 2543:getstatic       #16  <Field Map sHalfWidthMap>
	//  899 2546:sipush          12508
	//  900 2549:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  901 2552:ldc1            #158 <String "\uFF8E\uFF9E">
	//  902 2554:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  903 2559:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30DD'))), "\uFF8E\uFF9F");
	//  904 2560:getstatic       #16  <Field Map sHalfWidthMap>
	//  905 2563:sipush          12509
	//  906 2566:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  907 2569:ldc1            #160 <String "\uFF8E\uFF9F">
	//  908 2571:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  909 2576:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30DE'))), "\uFF8F");
	//  910 2577:getstatic       #16  <Field Map sHalfWidthMap>
	//  911 2580:sipush          12510
	//  912 2583:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  913 2586:ldc1            #162 <String "\uFF8F">
	//  914 2588:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  915 2593:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30DF'))), "\uFF90");
	//  916 2594:getstatic       #16  <Field Map sHalfWidthMap>
	//  917 2597:sipush          12511
	//  918 2600:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  919 2603:ldc1            #164 <String "\uFF90">
	//  920 2605:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  921 2610:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30E0'))), "\uFF91");
	//  922 2611:getstatic       #16  <Field Map sHalfWidthMap>
	//  923 2614:sipush          12512
	//  924 2617:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  925 2620:ldc1            #166 <String "\uFF91">
	//  926 2622:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  927 2627:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30E1'))), "\uFF92");
	//  928 2628:getstatic       #16  <Field Map sHalfWidthMap>
	//  929 2631:sipush          12513
	//  930 2634:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  931 2637:ldc1            #168 <String "\uFF92">
	//  932 2639:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  933 2644:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30E2'))), "\uFF93");
	//  934 2645:getstatic       #16  <Field Map sHalfWidthMap>
	//  935 2648:sipush          12514
	//  936 2651:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  937 2654:ldc1            #170 <String "\uFF93">
	//  938 2656:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  939 2661:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30E3'))), "\uFF6C");
	//  940 2662:getstatic       #16  <Field Map sHalfWidthMap>
	//  941 2665:sipush          12515
	//  942 2668:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  943 2671:ldc1            #172 <String "\uFF6C">
	//  944 2673:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  945 2678:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30E4'))), "\uFF94");
	//  946 2679:getstatic       #16  <Field Map sHalfWidthMap>
	//  947 2682:sipush          12516
	//  948 2685:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  949 2688:ldc1            #174 <String "\uFF94">
	//  950 2690:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  951 2695:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30E5'))), "\uFF6D");
	//  952 2696:getstatic       #16  <Field Map sHalfWidthMap>
	//  953 2699:sipush          12517
	//  954 2702:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  955 2705:ldc1            #176 <String "\uFF6D">
	//  956 2707:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  957 2712:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30E6'))), "\uFF95");
	//  958 2713:getstatic       #16  <Field Map sHalfWidthMap>
	//  959 2716:sipush          12518
	//  960 2719:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  961 2722:ldc1            #178 <String "\uFF95">
	//  962 2724:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  963 2729:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30E7'))), "\uFF6E");
	//  964 2730:getstatic       #16  <Field Map sHalfWidthMap>
	//  965 2733:sipush          12519
	//  966 2736:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  967 2739:ldc1            #180 <String "\uFF6E">
	//  968 2741:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  969 2746:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30E8'))), "\uFF96");
	//  970 2747:getstatic       #16  <Field Map sHalfWidthMap>
	//  971 2750:sipush          12520
	//  972 2753:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  973 2756:ldc1            #182 <String "\uFF96">
	//  974 2758:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  975 2763:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30E9'))), "\uFF97");
	//  976 2764:getstatic       #16  <Field Map sHalfWidthMap>
	//  977 2767:sipush          12521
	//  978 2770:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  979 2773:ldc1            #184 <String "\uFF97">
	//  980 2775:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  981 2780:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30EA'))), "\uFF98");
	//  982 2781:getstatic       #16  <Field Map sHalfWidthMap>
	//  983 2784:sipush          12522
	//  984 2787:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  985 2790:ldc1            #186 <String "\uFF98">
	//  986 2792:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  987 2797:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30EB'))), "\uFF99");
	//  988 2798:getstatic       #16  <Field Map sHalfWidthMap>
	//  989 2801:sipush          12523
	//  990 2804:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  991 2807:ldc1            #188 <String "\uFF99">
	//  992 2809:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  993 2814:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30EC'))), "\uFF9A");
	//  994 2815:getstatic       #16  <Field Map sHalfWidthMap>
	//  995 2818:sipush          12524
	//  996 2821:invokestatic    #22  <Method Character Character.valueOf(char)>
	//  997 2824:ldc1            #190 <String "\uFF9A">
	//  998 2826:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//  999 2831:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30ED'))), "\uFF9B");
	// 1000 2832:getstatic       #16  <Field Map sHalfWidthMap>
	// 1001 2835:sipush          12525
	// 1002 2838:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1003 2841:ldc1            #192 <String "\uFF9B">
	// 1004 2843:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1005 2848:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30EE'))), "\uFF9C");
	// 1006 2849:getstatic       #16  <Field Map sHalfWidthMap>
	// 1007 2852:sipush          12526
	// 1008 2855:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1009 2858:ldc1            #194 <String "\uFF9C">
	// 1010 2860:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1011 2865:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30EF'))), "\uFF9C");
	// 1012 2866:getstatic       #16  <Field Map sHalfWidthMap>
	// 1013 2869:sipush          12527
	// 1014 2872:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1015 2875:ldc1            #194 <String "\uFF9C">
	// 1016 2877:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1017 2882:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30F0'))), "\uFF72");
	// 1018 2883:getstatic       #16  <Field Map sHalfWidthMap>
	// 1019 2886:sipush          12528
	// 1020 2889:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1021 2892:ldc1            #46  <String "\uFF72">
	// 1022 2894:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1023 2899:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30F1'))), "\uFF74");
	// 1024 2900:getstatic       #16  <Field Map sHalfWidthMap>
	// 1025 2903:sipush          12529
	// 1026 2906:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1027 2909:ldc1            #54  <String "\uFF74">
	// 1028 2911:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1029 2916:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30F2'))), "\uFF66");
	// 1030 2917:getstatic       #16  <Field Map sHalfWidthMap>
	// 1031 2920:sipush          12530
	// 1032 2923:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1033 2926:ldc1            #196 <String "\uFF66">
	// 1034 2928:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1035 2933:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30F3'))), "\uFF9D");
	// 1036 2934:getstatic       #16  <Field Map sHalfWidthMap>
	// 1037 2937:sipush          12531
	// 1038 2940:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1039 2943:ldc1            #198 <String "\uFF9D">
	// 1040 2945:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1041 2950:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30F4'))), "\uFF73\uFF9E");
	// 1042 2951:getstatic       #16  <Field Map sHalfWidthMap>
	// 1043 2954:sipush          12532
	// 1044 2957:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1045 2960:ldc1            #204 <String "\uFF73\uFF9E">
	// 1046 2962:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1047 2967:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30F5'))), "\uFF76");
	// 1048 2968:getstatic       #16  <Field Map sHalfWidthMap>
	// 1049 2971:sipush          12533
	// 1050 2974:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1051 2977:ldc1            #60  <String "\uFF76">
	// 1052 2979:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1053 2984:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30F6'))), "\uFF79");
	// 1054 2985:getstatic       #16  <Field Map sHalfWidthMap>
	// 1055 2988:sipush          12534
	// 1056 2991:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1057 2994:ldc1            #72  <String "\uFF79">
	// 1058 2996:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1059 3001:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30FB'))), "\uFF65");
	// 1060 3002:getstatic       #16  <Field Map sHalfWidthMap>
	// 1061 3005:sipush          12539
	// 1062 3008:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1063 3011:ldc1            #206 <String "\uFF65">
	// 1064 3013:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1065 3018:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\u30FC'))), "\uFF70");
	// 1066 3019:getstatic       #16  <Field Map sHalfWidthMap>
	// 1067 3022:sipush          12540
	// 1068 3025:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1069 3028:ldc1            #208 <String "\uFF70">
	// 1070 3030:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1071 3035:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF01'))), "!");
	// 1072 3036:getstatic       #16  <Field Map sHalfWidthMap>
	// 1073 3039:ldc1            #209 <Int 65281>
	// 1074 3041:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1075 3044:ldc1            #211 <String "!">
	// 1076 3046:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1077 3051:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF02'))), "\"");
	// 1078 3052:getstatic       #16  <Field Map sHalfWidthMap>
	// 1079 3055:ldc1            #212 <Int 65282>
	// 1080 3057:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1081 3060:ldc1            #214 <String "\"">
	// 1082 3062:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1083 3067:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF03'))), "#");
	// 1084 3068:getstatic       #16  <Field Map sHalfWidthMap>
	// 1085 3071:ldc1            #215 <Int 65283>
	// 1086 3073:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1087 3076:ldc1            #217 <String "#">
	// 1088 3078:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1089 3083:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF04'))), "$");
	// 1090 3084:getstatic       #16  <Field Map sHalfWidthMap>
	// 1091 3087:ldc1            #218 <Int 65284>
	// 1092 3089:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1093 3092:ldc1            #220 <String "$">
	// 1094 3094:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1095 3099:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF05'))), "%");
	// 1096 3100:getstatic       #16  <Field Map sHalfWidthMap>
	// 1097 3103:ldc1            #221 <Int 65285>
	// 1098 3105:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1099 3108:ldc1            #223 <String "%">
	// 1100 3110:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1101 3115:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF06'))), "&");
	// 1102 3116:getstatic       #16  <Field Map sHalfWidthMap>
	// 1103 3119:ldc1            #224 <Int 65286>
	// 1104 3121:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1105 3124:ldc1            #226 <String "&">
	// 1106 3126:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1107 3131:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF07'))), "'");
	// 1108 3132:getstatic       #16  <Field Map sHalfWidthMap>
	// 1109 3135:ldc1            #227 <Int 65287>
	// 1110 3137:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1111 3140:ldc1            #229 <String "'">
	// 1112 3142:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1113 3147:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF08'))), "(");
	// 1114 3148:getstatic       #16  <Field Map sHalfWidthMap>
	// 1115 3151:ldc1            #230 <Int 65288>
	// 1116 3153:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1117 3156:ldc1            #232 <String "(">
	// 1118 3158:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1119 3163:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF09'))), ")");
	// 1120 3164:getstatic       #16  <Field Map sHalfWidthMap>
	// 1121 3167:ldc1            #233 <Int 65289>
	// 1122 3169:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1123 3172:ldc1            #235 <String ")">
	// 1124 3174:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1125 3179:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF0A'))), "*");
	// 1126 3180:getstatic       #16  <Field Map sHalfWidthMap>
	// 1127 3183:ldc1            #236 <Int 65290>
	// 1128 3185:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1129 3188:ldc1            #238 <String "*">
	// 1130 3190:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1131 3195:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF0B'))), "+");
	// 1132 3196:getstatic       #16  <Field Map sHalfWidthMap>
	// 1133 3199:ldc1            #239 <Int 65291>
	// 1134 3201:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1135 3204:ldc1            #241 <String "+">
	// 1136 3206:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1137 3211:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF0C'))), ",");
	// 1138 3212:getstatic       #16  <Field Map sHalfWidthMap>
	// 1139 3215:ldc1            #242 <Int 65292>
	// 1140 3217:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1141 3220:ldc1            #244 <String ",">
	// 1142 3222:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1143 3227:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF0D'))), "-");
	// 1144 3228:getstatic       #16  <Field Map sHalfWidthMap>
	// 1145 3231:ldc1            #245 <Int 65293>
	// 1146 3233:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1147 3236:ldc1            #247 <String "-">
	// 1148 3238:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1149 3243:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF0E'))), ".");
	// 1150 3244:getstatic       #16  <Field Map sHalfWidthMap>
	// 1151 3247:ldc1            #248 <Int 65294>
	// 1152 3249:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1153 3252:ldc1            #250 <String ".">
	// 1154 3254:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1155 3259:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF0F'))), "/");
	// 1156 3260:getstatic       #16  <Field Map sHalfWidthMap>
	// 1157 3263:ldc1            #251 <Int 65295>
	// 1158 3265:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1159 3268:ldc1            #253 <String "/">
	// 1160 3270:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1161 3275:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF10'))), "0");
	// 1162 3276:getstatic       #16  <Field Map sHalfWidthMap>
	// 1163 3279:ldc1            #254 <Int 65296>
	// 1164 3281:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1165 3284:ldc2            #256 <String "0">
	// 1166 3287:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1167 3292:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF11'))), "1");
	// 1168 3293:getstatic       #16  <Field Map sHalfWidthMap>
	// 1169 3296:ldc2            #257 <Int 65297>
	// 1170 3299:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1171 3302:ldc2            #259 <String "1">
	// 1172 3305:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1173 3310:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF12'))), "2");
	// 1174 3311:getstatic       #16  <Field Map sHalfWidthMap>
	// 1175 3314:ldc2            #260 <Int 65298>
	// 1176 3317:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1177 3320:ldc2            #262 <String "2">
	// 1178 3323:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1179 3328:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF13'))), "3");
	// 1180 3329:getstatic       #16  <Field Map sHalfWidthMap>
	// 1181 3332:ldc2            #263 <Int 65299>
	// 1182 3335:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1183 3338:ldc2            #265 <String "3">
	// 1184 3341:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1185 3346:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF14'))), "4");
	// 1186 3347:getstatic       #16  <Field Map sHalfWidthMap>
	// 1187 3350:ldc2            #266 <Int 65300>
	// 1188 3353:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1189 3356:ldc2            #268 <String "4">
	// 1190 3359:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1191 3364:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF15'))), "5");
	// 1192 3365:getstatic       #16  <Field Map sHalfWidthMap>
	// 1193 3368:ldc2            #269 <Int 65301>
	// 1194 3371:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1195 3374:ldc2            #271 <String "5">
	// 1196 3377:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1197 3382:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF16'))), "6");
	// 1198 3383:getstatic       #16  <Field Map sHalfWidthMap>
	// 1199 3386:ldc2            #272 <Int 65302>
	// 1200 3389:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1201 3392:ldc2            #274 <String "6">
	// 1202 3395:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1203 3400:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF17'))), "7");
	// 1204 3401:getstatic       #16  <Field Map sHalfWidthMap>
	// 1205 3404:ldc2            #275 <Int 65303>
	// 1206 3407:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1207 3410:ldc2            #277 <String "7">
	// 1208 3413:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1209 3418:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF18'))), "8");
	// 1210 3419:getstatic       #16  <Field Map sHalfWidthMap>
	// 1211 3422:ldc2            #278 <Int 65304>
	// 1212 3425:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1213 3428:ldc2            #280 <String "8">
	// 1214 3431:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1215 3436:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF19'))), "9");
	// 1216 3437:getstatic       #16  <Field Map sHalfWidthMap>
	// 1217 3440:ldc2            #281 <Int 65305>
	// 1218 3443:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1219 3446:ldc2            #283 <String "9">
	// 1220 3449:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1221 3454:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF1A'))), ":");
	// 1222 3455:getstatic       #16  <Field Map sHalfWidthMap>
	// 1223 3458:ldc2            #284 <Int 65306>
	// 1224 3461:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1225 3464:ldc2            #286 <String ":">
	// 1226 3467:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1227 3472:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF1B'))), ";");
	// 1228 3473:getstatic       #16  <Field Map sHalfWidthMap>
	// 1229 3476:ldc2            #287 <Int 65307>
	// 1230 3479:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1231 3482:ldc2            #289 <String ";">
	// 1232 3485:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1233 3490:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF1C'))), "<");
	// 1234 3491:getstatic       #16  <Field Map sHalfWidthMap>
	// 1235 3494:ldc2            #290 <Int 65308>
	// 1236 3497:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1237 3500:ldc2            #292 <String "<">
	// 1238 3503:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1239 3508:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF1D'))), "=");
	// 1240 3509:getstatic       #16  <Field Map sHalfWidthMap>
	// 1241 3512:ldc2            #293 <Int 65309>
	// 1242 3515:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1243 3518:ldc2            #295 <String "=">
	// 1244 3521:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1245 3526:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF1E'))), ">");
	// 1246 3527:getstatic       #16  <Field Map sHalfWidthMap>
	// 1247 3530:ldc2            #296 <Int 65310>
	// 1248 3533:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1249 3536:ldc2            #298 <String ">">
	// 1250 3539:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1251 3544:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF1F'))), "?");
	// 1252 3545:getstatic       #16  <Field Map sHalfWidthMap>
	// 1253 3548:ldc2            #299 <Int 65311>
	// 1254 3551:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1255 3554:ldc2            #301 <String "?">
	// 1256 3557:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1257 3562:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF20'))), "@");
	// 1258 3563:getstatic       #16  <Field Map sHalfWidthMap>
	// 1259 3566:ldc2            #302 <Int 65312>
	// 1260 3569:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1261 3572:ldc2            #304 <String "@">
	// 1262 3575:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1263 3580:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF21'))), "A");
	// 1264 3581:getstatic       #16  <Field Map sHalfWidthMap>
	// 1265 3584:ldc2            #305 <Int 65313>
	// 1266 3587:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1267 3590:ldc2            #307 <String "A">
	// 1268 3593:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1269 3598:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF22'))), "B");
	// 1270 3599:getstatic       #16  <Field Map sHalfWidthMap>
	// 1271 3602:ldc2            #308 <Int 65314>
	// 1272 3605:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1273 3608:ldc2            #310 <String "B">
	// 1274 3611:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1275 3616:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF23'))), "C");
	// 1276 3617:getstatic       #16  <Field Map sHalfWidthMap>
	// 1277 3620:ldc2            #311 <Int 65315>
	// 1278 3623:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1279 3626:ldc2            #313 <String "C">
	// 1280 3629:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1281 3634:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF24'))), "D");
	// 1282 3635:getstatic       #16  <Field Map sHalfWidthMap>
	// 1283 3638:ldc2            #314 <Int 65316>
	// 1284 3641:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1285 3644:ldc2            #316 <String "D">
	// 1286 3647:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1287 3652:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF25'))), "E");
	// 1288 3653:getstatic       #16  <Field Map sHalfWidthMap>
	// 1289 3656:ldc2            #317 <Int 65317>
	// 1290 3659:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1291 3662:ldc2            #319 <String "E">
	// 1292 3665:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1293 3670:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF26'))), "F");
	// 1294 3671:getstatic       #16  <Field Map sHalfWidthMap>
	// 1295 3674:ldc2            #320 <Int 65318>
	// 1296 3677:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1297 3680:ldc2            #322 <String "F">
	// 1298 3683:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1299 3688:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF27'))), "G");
	// 1300 3689:getstatic       #16  <Field Map sHalfWidthMap>
	// 1301 3692:ldc2            #323 <Int 65319>
	// 1302 3695:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1303 3698:ldc2            #325 <String "G">
	// 1304 3701:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1305 3706:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF28'))), "H");
	// 1306 3707:getstatic       #16  <Field Map sHalfWidthMap>
	// 1307 3710:ldc2            #326 <Int 65320>
	// 1308 3713:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1309 3716:ldc2            #328 <String "H">
	// 1310 3719:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1311 3724:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF29'))), "I");
	// 1312 3725:getstatic       #16  <Field Map sHalfWidthMap>
	// 1313 3728:ldc2            #329 <Int 65321>
	// 1314 3731:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1315 3734:ldc2            #331 <String "I">
	// 1316 3737:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1317 3742:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF2A'))), "J");
	// 1318 3743:getstatic       #16  <Field Map sHalfWidthMap>
	// 1319 3746:ldc2            #332 <Int 65322>
	// 1320 3749:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1321 3752:ldc2            #334 <String "J">
	// 1322 3755:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1323 3760:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF2B'))), "K");
	// 1324 3761:getstatic       #16  <Field Map sHalfWidthMap>
	// 1325 3764:ldc2            #335 <Int 65323>
	// 1326 3767:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1327 3770:ldc2            #337 <String "K">
	// 1328 3773:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1329 3778:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF2C'))), "L");
	// 1330 3779:getstatic       #16  <Field Map sHalfWidthMap>
	// 1331 3782:ldc2            #338 <Int 65324>
	// 1332 3785:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1333 3788:ldc2            #340 <String "L">
	// 1334 3791:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1335 3796:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF2D'))), "M");
	// 1336 3797:getstatic       #16  <Field Map sHalfWidthMap>
	// 1337 3800:ldc2            #341 <Int 65325>
	// 1338 3803:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1339 3806:ldc2            #343 <String "M">
	// 1340 3809:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1341 3814:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF2E'))), "N");
	// 1342 3815:getstatic       #16  <Field Map sHalfWidthMap>
	// 1343 3818:ldc2            #344 <Int 65326>
	// 1344 3821:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1345 3824:ldc2            #346 <String "N">
	// 1346 3827:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1347 3832:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF2F'))), "O");
	// 1348 3833:getstatic       #16  <Field Map sHalfWidthMap>
	// 1349 3836:ldc2            #347 <Int 65327>
	// 1350 3839:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1351 3842:ldc2            #349 <String "O">
	// 1352 3845:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1353 3850:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF30'))), "P");
	// 1354 3851:getstatic       #16  <Field Map sHalfWidthMap>
	// 1355 3854:ldc2            #350 <Int 65328>
	// 1356 3857:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1357 3860:ldc2            #352 <String "P">
	// 1358 3863:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1359 3868:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF31'))), "Q");
	// 1360 3869:getstatic       #16  <Field Map sHalfWidthMap>
	// 1361 3872:ldc2            #353 <Int 65329>
	// 1362 3875:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1363 3878:ldc2            #355 <String "Q">
	// 1364 3881:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1365 3886:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF32'))), "R");
	// 1366 3887:getstatic       #16  <Field Map sHalfWidthMap>
	// 1367 3890:ldc2            #356 <Int 65330>
	// 1368 3893:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1369 3896:ldc2            #358 <String "R">
	// 1370 3899:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1371 3904:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF33'))), "S");
	// 1372 3905:getstatic       #16  <Field Map sHalfWidthMap>
	// 1373 3908:ldc2            #359 <Int 65331>
	// 1374 3911:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1375 3914:ldc2            #361 <String "S">
	// 1376 3917:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1377 3922:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF34'))), "T");
	// 1378 3923:getstatic       #16  <Field Map sHalfWidthMap>
	// 1379 3926:ldc2            #362 <Int 65332>
	// 1380 3929:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1381 3932:ldc2            #364 <String "T">
	// 1382 3935:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1383 3940:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF35'))), "U");
	// 1384 3941:getstatic       #16  <Field Map sHalfWidthMap>
	// 1385 3944:ldc2            #365 <Int 65333>
	// 1386 3947:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1387 3950:ldc2            #367 <String "U">
	// 1388 3953:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1389 3958:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF36'))), "V");
	// 1390 3959:getstatic       #16  <Field Map sHalfWidthMap>
	// 1391 3962:ldc2            #368 <Int 65334>
	// 1392 3965:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1393 3968:ldc2            #370 <String "V">
	// 1394 3971:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1395 3976:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF37'))), "W");
	// 1396 3977:getstatic       #16  <Field Map sHalfWidthMap>
	// 1397 3980:ldc2            #371 <Int 65335>
	// 1398 3983:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1399 3986:ldc2            #373 <String "W">
	// 1400 3989:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1401 3994:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF38'))), "X");
	// 1402 3995:getstatic       #16  <Field Map sHalfWidthMap>
	// 1403 3998:ldc2            #374 <Int 65336>
	// 1404 4001:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1405 4004:ldc2            #376 <String "X">
	// 1406 4007:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1407 4012:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF39'))), "Y");
	// 1408 4013:getstatic       #16  <Field Map sHalfWidthMap>
	// 1409 4016:ldc2            #377 <Int 65337>
	// 1410 4019:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1411 4022:ldc2            #379 <String "Y">
	// 1412 4025:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1413 4030:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF3A'))), "Z");
	// 1414 4031:getstatic       #16  <Field Map sHalfWidthMap>
	// 1415 4034:ldc2            #380 <Int 65338>
	// 1416 4037:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1417 4040:ldc2            #382 <String "Z">
	// 1418 4043:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1419 4048:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF3B'))), "[");
	// 1420 4049:getstatic       #16  <Field Map sHalfWidthMap>
	// 1421 4052:ldc2            #383 <Int 65339>
	// 1422 4055:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1423 4058:ldc2            #385 <String "[">
	// 1424 4061:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1425 4066:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF3C'))), "\\");
	// 1426 4067:getstatic       #16  <Field Map sHalfWidthMap>
	// 1427 4070:ldc2            #386 <Int 65340>
	// 1428 4073:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1429 4076:ldc2            #388 <String "\\">
	// 1430 4079:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1431 4084:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF3D'))), "]");
	// 1432 4085:getstatic       #16  <Field Map sHalfWidthMap>
	// 1433 4088:ldc2            #389 <Int 65341>
	// 1434 4091:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1435 4094:ldc2            #391 <String "]">
	// 1436 4097:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1437 4102:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF3E'))), "^");
	// 1438 4103:getstatic       #16  <Field Map sHalfWidthMap>
	// 1439 4106:ldc2            #392 <Int 65342>
	// 1440 4109:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1441 4112:ldc2            #394 <String "^">
	// 1442 4115:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1443 4120:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF3F'))), "_");
	// 1444 4121:getstatic       #16  <Field Map sHalfWidthMap>
	// 1445 4124:ldc2            #395 <Int 65343>
	// 1446 4127:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1447 4130:ldc2            #397 <String "_">
	// 1448 4133:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1449 4138:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF41'))), "a");
	// 1450 4139:getstatic       #16  <Field Map sHalfWidthMap>
	// 1451 4142:ldc2            #398 <Int 65345>
	// 1452 4145:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1453 4148:ldc2            #400 <String "a">
	// 1454 4151:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1455 4156:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF42'))), "b");
	// 1456 4157:getstatic       #16  <Field Map sHalfWidthMap>
	// 1457 4160:ldc2            #401 <Int 65346>
	// 1458 4163:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1459 4166:ldc2            #403 <String "b">
	// 1460 4169:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1461 4174:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF43'))), "c");
	// 1462 4175:getstatic       #16  <Field Map sHalfWidthMap>
	// 1463 4178:ldc2            #404 <Int 65347>
	// 1464 4181:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1465 4184:ldc2            #406 <String "c">
	// 1466 4187:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1467 4192:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF44'))), "d");
	// 1468 4193:getstatic       #16  <Field Map sHalfWidthMap>
	// 1469 4196:ldc2            #407 <Int 65348>
	// 1470 4199:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1471 4202:ldc2            #409 <String "d">
	// 1472 4205:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1473 4210:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF45'))), "e");
	// 1474 4211:getstatic       #16  <Field Map sHalfWidthMap>
	// 1475 4214:ldc2            #410 <Int 65349>
	// 1476 4217:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1477 4220:ldc2            #412 <String "e">
	// 1478 4223:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1479 4228:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF46'))), "f");
	// 1480 4229:getstatic       #16  <Field Map sHalfWidthMap>
	// 1481 4232:ldc2            #413 <Int 65350>
	// 1482 4235:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1483 4238:ldc2            #415 <String "f">
	// 1484 4241:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1485 4246:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF47'))), "g");
	// 1486 4247:getstatic       #16  <Field Map sHalfWidthMap>
	// 1487 4250:ldc2            #416 <Int 65351>
	// 1488 4253:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1489 4256:ldc2            #418 <String "g">
	// 1490 4259:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1491 4264:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF48'))), "h");
	// 1492 4265:getstatic       #16  <Field Map sHalfWidthMap>
	// 1493 4268:ldc2            #419 <Int 65352>
	// 1494 4271:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1495 4274:ldc2            #421 <String "h">
	// 1496 4277:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1497 4282:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF49'))), "i");
	// 1498 4283:getstatic       #16  <Field Map sHalfWidthMap>
	// 1499 4286:ldc2            #422 <Int 65353>
	// 1500 4289:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1501 4292:ldc2            #424 <String "i">
	// 1502 4295:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1503 4300:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF4A'))), "j");
	// 1504 4301:getstatic       #16  <Field Map sHalfWidthMap>
	// 1505 4304:ldc2            #425 <Int 65354>
	// 1506 4307:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1507 4310:ldc2            #427 <String "j">
	// 1508 4313:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1509 4318:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF4B'))), "k");
	// 1510 4319:getstatic       #16  <Field Map sHalfWidthMap>
	// 1511 4322:ldc2            #428 <Int 65355>
	// 1512 4325:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1513 4328:ldc2            #430 <String "k">
	// 1514 4331:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1515 4336:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF4C'))), "l");
	// 1516 4337:getstatic       #16  <Field Map sHalfWidthMap>
	// 1517 4340:ldc2            #431 <Int 65356>
	// 1518 4343:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1519 4346:ldc2            #433 <String "l">
	// 1520 4349:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1521 4354:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF4D'))), "m");
	// 1522 4355:getstatic       #16  <Field Map sHalfWidthMap>
	// 1523 4358:ldc2            #434 <Int 65357>
	// 1524 4361:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1525 4364:ldc2            #436 <String "m">
	// 1526 4367:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1527 4372:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF4E'))), "n");
	// 1528 4373:getstatic       #16  <Field Map sHalfWidthMap>
	// 1529 4376:ldc2            #437 <Int 65358>
	// 1530 4379:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1531 4382:ldc2            #439 <String "n">
	// 1532 4385:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1533 4390:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF4F'))), "o");
	// 1534 4391:getstatic       #16  <Field Map sHalfWidthMap>
	// 1535 4394:ldc2            #440 <Int 65359>
	// 1536 4397:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1537 4400:ldc2            #442 <String "o">
	// 1538 4403:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1539 4408:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF50'))), "p");
	// 1540 4409:getstatic       #16  <Field Map sHalfWidthMap>
	// 1541 4412:ldc2            #443 <Int 65360>
	// 1542 4415:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1543 4418:ldc2            #445 <String "p">
	// 1544 4421:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1545 4426:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF51'))), "q");
	// 1546 4427:getstatic       #16  <Field Map sHalfWidthMap>
	// 1547 4430:ldc2            #446 <Int 65361>
	// 1548 4433:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1549 4436:ldc2            #448 <String "q">
	// 1550 4439:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1551 4444:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF52'))), "r");
	// 1552 4445:getstatic       #16  <Field Map sHalfWidthMap>
	// 1553 4448:ldc2            #449 <Int 65362>
	// 1554 4451:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1555 4454:ldc2            #451 <String "r">
	// 1556 4457:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1557 4462:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF53'))), "s");
	// 1558 4463:getstatic       #16  <Field Map sHalfWidthMap>
	// 1559 4466:ldc2            #452 <Int 65363>
	// 1560 4469:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1561 4472:ldc2            #454 <String "s">
	// 1562 4475:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1563 4480:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF54'))), "t");
	// 1564 4481:getstatic       #16  <Field Map sHalfWidthMap>
	// 1565 4484:ldc2            #455 <Int 65364>
	// 1566 4487:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1567 4490:ldc2            #457 <String "t">
	// 1568 4493:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1569 4498:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF55'))), "u");
	// 1570 4499:getstatic       #16  <Field Map sHalfWidthMap>
	// 1571 4502:ldc2            #458 <Int 65365>
	// 1572 4505:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1573 4508:ldc2            #460 <String "u">
	// 1574 4511:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1575 4516:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF56'))), "v");
	// 1576 4517:getstatic       #16  <Field Map sHalfWidthMap>
	// 1577 4520:ldc2            #461 <Int 65366>
	// 1578 4523:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1579 4526:ldc2            #463 <String "v">
	// 1580 4529:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1581 4534:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF57'))), "w");
	// 1582 4535:getstatic       #16  <Field Map sHalfWidthMap>
	// 1583 4538:ldc2            #464 <Int 65367>
	// 1584 4541:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1585 4544:ldc2            #466 <String "w">
	// 1586 4547:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1587 4552:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF58'))), "x");
	// 1588 4553:getstatic       #16  <Field Map sHalfWidthMap>
	// 1589 4556:ldc2            #467 <Int 65368>
	// 1590 4559:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1591 4562:ldc2            #469 <String "x">
	// 1592 4565:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1593 4570:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF59'))), "y");
	// 1594 4571:getstatic       #16  <Field Map sHalfWidthMap>
	// 1595 4574:ldc2            #470 <Int 65369>
	// 1596 4577:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1597 4580:ldc2            #472 <String "y">
	// 1598 4583:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1599 4588:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF5A'))), "z");
	// 1600 4589:getstatic       #16  <Field Map sHalfWidthMap>
	// 1601 4592:ldc2            #473 <Int 65370>
	// 1602 4595:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1603 4598:ldc2            #475 <String "z">
	// 1604 4601:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1605 4606:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF5B'))), "{");
	// 1606 4607:getstatic       #16  <Field Map sHalfWidthMap>
	// 1607 4610:ldc2            #476 <Int 65371>
	// 1608 4613:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1609 4616:ldc2            #478 <String "{">
	// 1610 4619:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1611 4624:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF5C'))), "|");
	// 1612 4625:getstatic       #16  <Field Map sHalfWidthMap>
	// 1613 4628:ldc2            #479 <Int 65372>
	// 1614 4631:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1615 4634:ldc2            #481 <String "|">
	// 1616 4637:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1617 4642:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF5D'))), "}");
	// 1618 4643:getstatic       #16  <Field Map sHalfWidthMap>
	// 1619 4646:ldc2            #482 <Int 65373>
	// 1620 4649:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1621 4652:ldc2            #484 <String "}">
	// 1622 4655:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1623 4660:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF5E'))), "~");
	// 1624 4661:getstatic       #16  <Field Map sHalfWidthMap>
	// 1625 4664:ldc2            #485 <Int 65374>
	// 1626 4667:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1627 4670:ldc1            #38  <String "~">
	// 1628 4672:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1629 4677:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF61'))), "\uFF61");
	// 1630 4678:getstatic       #16  <Field Map sHalfWidthMap>
	// 1631 4681:ldc2            #486 <Int 65377>
	// 1632 4684:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1633 4687:ldc1            #32  <String "\uFF61">
	// 1634 4689:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1635 4694:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF62'))), "\uFF62");
	// 1636 4695:getstatic       #16  <Field Map sHalfWidthMap>
	// 1637 4698:ldc2            #487 <Int 65378>
	// 1638 4701:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1639 4704:ldc1            #34  <String "\uFF62">
	// 1640 4706:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1641 4711:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF63'))), "\uFF63");
	// 1642 4712:getstatic       #16  <Field Map sHalfWidthMap>
	// 1643 4715:ldc2            #488 <Int 65379>
	// 1644 4718:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1645 4721:ldc1            #36  <String "\uFF63">
	// 1646 4723:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1647 4728:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF64'))), "\uFF64");
	// 1648 4729:getstatic       #16  <Field Map sHalfWidthMap>
	// 1649 4732:ldc2            #489 <Int 65380>
	// 1650 4735:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1651 4738:ldc1            #24  <String "\uFF64">
	// 1652 4740:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1653 4745:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF65'))), "\uFF65");
	// 1654 4746:getstatic       #16  <Field Map sHalfWidthMap>
	// 1655 4749:ldc2            #490 <Int 65381>
	// 1656 4752:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1657 4755:ldc1            #206 <String "\uFF65">
	// 1658 4757:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1659 4762:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF66'))), "\uFF66");
	// 1660 4763:getstatic       #16  <Field Map sHalfWidthMap>
	// 1661 4766:ldc2            #491 <Int 65382>
	// 1662 4769:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1663 4772:ldc1            #196 <String "\uFF66">
	// 1664 4774:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1665 4779:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF67'))), "\uFF67");
	// 1666 4780:getstatic       #16  <Field Map sHalfWidthMap>
	// 1667 4783:ldc2            #492 <Int 65383>
	// 1668 4786:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1669 4789:ldc1            #40  <String "\uFF67">
	// 1670 4791:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1671 4796:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF68'))), "\uFF68");
	// 1672 4797:getstatic       #16  <Field Map sHalfWidthMap>
	// 1673 4800:ldc2            #493 <Int 65384>
	// 1674 4803:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1675 4806:ldc1            #44  <String "\uFF68">
	// 1676 4808:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1677 4813:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF69'))), "\uFF69");
	// 1678 4814:getstatic       #16  <Field Map sHalfWidthMap>
	// 1679 4817:ldc2            #494 <Int 65385>
	// 1680 4820:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1681 4823:ldc1            #48  <String "\uFF69">
	// 1682 4825:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1683 4830:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF6A'))), "\uFF6A");
	// 1684 4831:getstatic       #16  <Field Map sHalfWidthMap>
	// 1685 4834:ldc2            #495 <Int 65386>
	// 1686 4837:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1687 4840:ldc1            #52  <String "\uFF6A">
	// 1688 4842:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1689 4847:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF6B'))), "\uFF6B");
	// 1690 4848:getstatic       #16  <Field Map sHalfWidthMap>
	// 1691 4851:ldc2            #496 <Int 65387>
	// 1692 4854:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1693 4857:ldc1            #56  <String "\uFF6B">
	// 1694 4859:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1695 4864:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF6C'))), "\uFF6C");
	// 1696 4865:getstatic       #16  <Field Map sHalfWidthMap>
	// 1697 4868:ldc2            #497 <Int 65388>
	// 1698 4871:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1699 4874:ldc1            #172 <String "\uFF6C">
	// 1700 4876:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1701 4881:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF6D'))), "\uFF6D");
	// 1702 4882:getstatic       #16  <Field Map sHalfWidthMap>
	// 1703 4885:ldc2            #498 <Int 65389>
	// 1704 4888:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1705 4891:ldc1            #176 <String "\uFF6D">
	// 1706 4893:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1707 4898:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF6E'))), "\uFF6E");
	// 1708 4899:getstatic       #16  <Field Map sHalfWidthMap>
	// 1709 4902:ldc2            #499 <Int 65390>
	// 1710 4905:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1711 4908:ldc1            #180 <String "\uFF6E">
	// 1712 4910:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1713 4915:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF6F'))), "\uFF6F");
	// 1714 4916:getstatic       #16  <Field Map sHalfWidthMap>
	// 1715 4919:ldc2            #500 <Int 65391>
	// 1716 4922:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1717 4925:ldc1            #108 <String "\uFF6F">
	// 1718 4927:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1719 4932:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF70'))), "\uFF70");
	// 1720 4933:getstatic       #16  <Field Map sHalfWidthMap>
	// 1721 4936:ldc2            #501 <Int 65392>
	// 1722 4939:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1723 4942:ldc1            #208 <String "\uFF70">
	// 1724 4944:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1725 4949:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF71'))), "\uFF71");
	// 1726 4950:getstatic       #16  <Field Map sHalfWidthMap>
	// 1727 4953:ldc2            #502 <Int 65393>
	// 1728 4956:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1729 4959:ldc1            #42  <String "\uFF71">
	// 1730 4961:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1731 4966:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF72'))), "\uFF72");
	// 1732 4967:getstatic       #16  <Field Map sHalfWidthMap>
	// 1733 4970:ldc2            #503 <Int 65394>
	// 1734 4973:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1735 4976:ldc1            #46  <String "\uFF72">
	// 1736 4978:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1737 4983:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF73'))), "\uFF73");
	// 1738 4984:getstatic       #16  <Field Map sHalfWidthMap>
	// 1739 4987:ldc2            #504 <Int 65395>
	// 1740 4990:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1741 4993:ldc1            #50  <String "\uFF73">
	// 1742 4995:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1743 5000:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF74'))), "\uFF74");
	// 1744 5001:getstatic       #16  <Field Map sHalfWidthMap>
	// 1745 5004:ldc2            #505 <Int 65396>
	// 1746 5007:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1747 5010:ldc1            #54  <String "\uFF74">
	// 1748 5012:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1749 5017:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF75'))), "\uFF75");
	// 1750 5018:getstatic       #16  <Field Map sHalfWidthMap>
	// 1751 5021:ldc2            #506 <Int 65397>
	// 1752 5024:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1753 5027:ldc1            #58  <String "\uFF75">
	// 1754 5029:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1755 5034:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF76'))), "\uFF76");
	// 1756 5035:getstatic       #16  <Field Map sHalfWidthMap>
	// 1757 5038:ldc2            #507 <Int 65398>
	// 1758 5041:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1759 5044:ldc1            #60  <String "\uFF76">
	// 1760 5046:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1761 5051:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF77'))), "\uFF77");
	// 1762 5052:getstatic       #16  <Field Map sHalfWidthMap>
	// 1763 5055:ldc2            #508 <Int 65399>
	// 1764 5058:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1765 5061:ldc1            #64  <String "\uFF77">
	// 1766 5063:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1767 5068:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF78'))), "\uFF78");
	// 1768 5069:getstatic       #16  <Field Map sHalfWidthMap>
	// 1769 5072:ldc2            #509 <Int 65400>
	// 1770 5075:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1771 5078:ldc1            #68  <String "\uFF78">
	// 1772 5080:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1773 5085:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF79'))), "\uFF79");
	// 1774 5086:getstatic       #16  <Field Map sHalfWidthMap>
	// 1775 5089:ldc2            #510 <Int 65401>
	// 1776 5092:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1777 5095:ldc1            #72  <String "\uFF79">
	// 1778 5097:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1779 5102:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF7A'))), "\uFF7A");
	// 1780 5103:getstatic       #16  <Field Map sHalfWidthMap>
	// 1781 5106:ldc2            #511 <Int 65402>
	// 1782 5109:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1783 5112:ldc1            #76  <String "\uFF7A">
	// 1784 5114:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1785 5119:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF7B'))), "\uFF7B");
	// 1786 5120:getstatic       #16  <Field Map sHalfWidthMap>
	// 1787 5123:ldc2            #512 <Int 65403>
	// 1788 5126:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1789 5129:ldc1            #80  <String "\uFF7B">
	// 1790 5131:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1791 5136:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF7C'))), "\uFF7C");
	// 1792 5137:getstatic       #16  <Field Map sHalfWidthMap>
	// 1793 5140:ldc2            #513 <Int 65404>
	// 1794 5143:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1795 5146:ldc1            #84  <String "\uFF7C">
	// 1796 5148:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1797 5153:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF7D'))), "\uFF7D");
	// 1798 5154:getstatic       #16  <Field Map sHalfWidthMap>
	// 1799 5157:ldc2            #514 <Int 65405>
	// 1800 5160:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1801 5163:ldc1            #88  <String "\uFF7D">
	// 1802 5165:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1803 5170:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF7E'))), "\uFF7E");
	// 1804 5171:getstatic       #16  <Field Map sHalfWidthMap>
	// 1805 5174:ldc2            #515 <Int 65406>
	// 1806 5177:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1807 5180:ldc1            #92  <String "\uFF7E">
	// 1808 5182:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1809 5187:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF7F'))), "\uFF7F");
	// 1810 5188:getstatic       #16  <Field Map sHalfWidthMap>
	// 1811 5191:ldc2            #516 <Int 65407>
	// 1812 5194:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1813 5197:ldc1            #96  <String "\uFF7F">
	// 1814 5199:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1815 5204:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF80'))), "\uFF80");
	// 1816 5205:getstatic       #16  <Field Map sHalfWidthMap>
	// 1817 5208:ldc2            #517 <Int 65408>
	// 1818 5211:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1819 5214:ldc1            #100 <String "\uFF80">
	// 1820 5216:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1821 5221:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF81'))), "\uFF81");
	// 1822 5222:getstatic       #16  <Field Map sHalfWidthMap>
	// 1823 5225:ldc2            #518 <Int 65409>
	// 1824 5228:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1825 5231:ldc1            #104 <String "\uFF81">
	// 1826 5233:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1827 5238:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF82'))), "\uFF82");
	// 1828 5239:getstatic       #16  <Field Map sHalfWidthMap>
	// 1829 5242:ldc2            #519 <Int 65410>
	// 1830 5245:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1831 5248:ldc1            #110 <String "\uFF82">
	// 1832 5250:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1833 5255:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF83'))), "\uFF83");
	// 1834 5256:getstatic       #16  <Field Map sHalfWidthMap>
	// 1835 5259:ldc2            #520 <Int 65411>
	// 1836 5262:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1837 5265:ldc1            #114 <String "\uFF83">
	// 1838 5267:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1839 5272:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF84'))), "\uFF84");
	// 1840 5273:getstatic       #16  <Field Map sHalfWidthMap>
	// 1841 5276:ldc2            #521 <Int 65412>
	// 1842 5279:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1843 5282:ldc1            #118 <String "\uFF84">
	// 1844 5284:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1845 5289:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF85'))), "\uFF85");
	// 1846 5290:getstatic       #16  <Field Map sHalfWidthMap>
	// 1847 5293:ldc2            #522 <Int 65413>
	// 1848 5296:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1849 5299:ldc1            #122 <String "\uFF85">
	// 1850 5301:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1851 5306:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF86'))), "\uFF86");
	// 1852 5307:getstatic       #16  <Field Map sHalfWidthMap>
	// 1853 5310:ldc2            #523 <Int 65414>
	// 1854 5313:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1855 5316:ldc1            #124 <String "\uFF86">
	// 1856 5318:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1857 5323:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF87'))), "\uFF87");
	// 1858 5324:getstatic       #16  <Field Map sHalfWidthMap>
	// 1859 5327:ldc2            #524 <Int 65415>
	// 1860 5330:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1861 5333:ldc1            #126 <String "\uFF87">
	// 1862 5335:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1863 5340:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF88'))), "\uFF88");
	// 1864 5341:getstatic       #16  <Field Map sHalfWidthMap>
	// 1865 5344:ldc2            #525 <Int 65416>
	// 1866 5347:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1867 5350:ldc1            #128 <String "\uFF88">
	// 1868 5352:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1869 5357:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF89'))), "\uFF89");
	// 1870 5358:getstatic       #16  <Field Map sHalfWidthMap>
	// 1871 5361:ldc2            #526 <Int 65417>
	// 1872 5364:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1873 5367:ldc1            #130 <String "\uFF89">
	// 1874 5369:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1875 5374:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF8A'))), "\uFF8A");
	// 1876 5375:getstatic       #16  <Field Map sHalfWidthMap>
	// 1877 5378:ldc2            #527 <Int 65418>
	// 1878 5381:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1879 5384:ldc1            #132 <String "\uFF8A">
	// 1880 5386:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1881 5391:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF8B'))), "\uFF8B");
	// 1882 5392:getstatic       #16  <Field Map sHalfWidthMap>
	// 1883 5395:ldc2            #528 <Int 65419>
	// 1884 5398:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1885 5401:ldc1            #138 <String "\uFF8B">
	// 1886 5403:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1887 5408:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF8C'))), "\uFF8C");
	// 1888 5409:getstatic       #16  <Field Map sHalfWidthMap>
	// 1889 5412:ldc2            #529 <Int 65420>
	// 1890 5415:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1891 5418:ldc1            #144 <String "\uFF8C">
	// 1892 5420:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1893 5425:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF8D'))), "\uFF8D");
	// 1894 5426:getstatic       #16  <Field Map sHalfWidthMap>
	// 1895 5429:ldc2            #530 <Int 65421>
	// 1896 5432:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1897 5435:ldc1            #150 <String "\uFF8D">
	// 1898 5437:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1899 5442:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF8E'))), "\uFF8E");
	// 1900 5443:getstatic       #16  <Field Map sHalfWidthMap>
	// 1901 5446:ldc2            #531 <Int 65422>
	// 1902 5449:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1903 5452:ldc1            #156 <String "\uFF8E">
	// 1904 5454:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1905 5459:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF8F'))), "\uFF8F");
	// 1906 5460:getstatic       #16  <Field Map sHalfWidthMap>
	// 1907 5463:ldc2            #532 <Int 65423>
	// 1908 5466:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1909 5469:ldc1            #162 <String "\uFF8F">
	// 1910 5471:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1911 5476:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF90'))), "\uFF90");
	// 1912 5477:getstatic       #16  <Field Map sHalfWidthMap>
	// 1913 5480:ldc2            #533 <Int 65424>
	// 1914 5483:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1915 5486:ldc1            #164 <String "\uFF90">
	// 1916 5488:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1917 5493:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF91'))), "\uFF91");
	// 1918 5494:getstatic       #16  <Field Map sHalfWidthMap>
	// 1919 5497:ldc2            #534 <Int 65425>
	// 1920 5500:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1921 5503:ldc1            #166 <String "\uFF91">
	// 1922 5505:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1923 5510:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF92'))), "\uFF92");
	// 1924 5511:getstatic       #16  <Field Map sHalfWidthMap>
	// 1925 5514:ldc2            #535 <Int 65426>
	// 1926 5517:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1927 5520:ldc1            #168 <String "\uFF92">
	// 1928 5522:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1929 5527:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF93'))), "\uFF93");
	// 1930 5528:getstatic       #16  <Field Map sHalfWidthMap>
	// 1931 5531:ldc2            #536 <Int 65427>
	// 1932 5534:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1933 5537:ldc1            #170 <String "\uFF93">
	// 1934 5539:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1935 5544:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF94'))), "\uFF94");
	// 1936 5545:getstatic       #16  <Field Map sHalfWidthMap>
	// 1937 5548:ldc2            #537 <Int 65428>
	// 1938 5551:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1939 5554:ldc1            #174 <String "\uFF94">
	// 1940 5556:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1941 5561:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF95'))), "\uFF95");
	// 1942 5562:getstatic       #16  <Field Map sHalfWidthMap>
	// 1943 5565:ldc2            #538 <Int 65429>
	// 1944 5568:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1945 5571:ldc1            #178 <String "\uFF95">
	// 1946 5573:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1947 5578:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF96'))), "\uFF96");
	// 1948 5579:getstatic       #16  <Field Map sHalfWidthMap>
	// 1949 5582:ldc2            #539 <Int 65430>
	// 1950 5585:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1951 5588:ldc1            #182 <String "\uFF96">
	// 1952 5590:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1953 5595:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF97'))), "\uFF97");
	// 1954 5596:getstatic       #16  <Field Map sHalfWidthMap>
	// 1955 5599:ldc2            #540 <Int 65431>
	// 1956 5602:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1957 5605:ldc1            #184 <String "\uFF97">
	// 1958 5607:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1959 5612:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF98'))), "\uFF98");
	// 1960 5613:getstatic       #16  <Field Map sHalfWidthMap>
	// 1961 5616:ldc2            #541 <Int 65432>
	// 1962 5619:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1963 5622:ldc1            #186 <String "\uFF98">
	// 1964 5624:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1965 5629:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF99'))), "\uFF99");
	// 1966 5630:getstatic       #16  <Field Map sHalfWidthMap>
	// 1967 5633:ldc2            #542 <Int 65433>
	// 1968 5636:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1969 5639:ldc1            #188 <String "\uFF99">
	// 1970 5641:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1971 5646:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF9A'))), "\uFF9A");
	// 1972 5647:getstatic       #16  <Field Map sHalfWidthMap>
	// 1973 5650:ldc2            #543 <Int 65434>
	// 1974 5653:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1975 5656:ldc1            #190 <String "\uFF9A">
	// 1976 5658:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1977 5663:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF9B'))), "\uFF9B");
	// 1978 5664:getstatic       #16  <Field Map sHalfWidthMap>
	// 1979 5667:ldc2            #544 <Int 65435>
	// 1980 5670:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1981 5673:ldc1            #192 <String "\uFF9B">
	// 1982 5675:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1983 5680:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF9C'))), "\uFF9C");
	// 1984 5681:getstatic       #16  <Field Map sHalfWidthMap>
	// 1985 5684:ldc2            #545 <Int 65436>
	// 1986 5687:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1987 5690:ldc1            #194 <String "\uFF9C">
	// 1988 5692:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1989 5697:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF9D'))), "\uFF9D");
	// 1990 5698:getstatic       #16  <Field Map sHalfWidthMap>
	// 1991 5701:ldc2            #546 <Int 65437>
	// 1992 5704:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1993 5707:ldc1            #198 <String "\uFF9D">
	// 1994 5709:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 1995 5714:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF9E'))), "\uFF9E");
	// 1996 5715:getstatic       #16  <Field Map sHalfWidthMap>
	// 1997 5718:ldc2            #547 <Int 65438>
	// 1998 5721:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 1999 5724:ldc1            #200 <String "\uFF9E">
	// 2000 5726:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 2001 5731:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFF9F'))), "\uFF9F");
	// 2002 5732:getstatic       #16  <Field Map sHalfWidthMap>
	// 2003 5735:ldc2            #548 <Int 65439>
	// 2004 5738:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 2005 5741:ldc1            #202 <String "\uFF9F">
	// 2006 5743:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 2007 5748:pop             
		sHalfWidthMap.put(((Object) (Character.valueOf('\uFFE5'))), "\\");
	// 2008 5749:getstatic       #16  <Field Map sHalfWidthMap>
	// 2009 5752:ldc2            #549 <Int 65509>
	// 2010 5755:invokestatic    #22  <Method Character Character.valueOf(char)>
	// 2011 5758:ldc2            #388 <String "\\">
	// 2012 5761:invokeinterface #30  <Method Object Map.put(Object, Object)>
	// 2013 5766:pop             
	//*2014 5767:return          
	}
}
