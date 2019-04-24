// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.animation;


// Referenced classes of package com.github.mikephil.charting.animation:
//			Easing

public static final class Easing$EasingOption extends Enum
{

	public static Easing$EasingOption valueOf(String s)
	{
		return (Easing$EasingOption)Enum.valueOf(com/github/mikephil/charting/animation/Easing$EasingOption, s);
	//    0    0:ldc1            #2   <Class Easing$EasingOption>
	//    1    2:aload_0         
	//    2    3:invokestatic    #139 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Easing$EasingOption>
	//    4    9:areturn         
	}

	public static Easing$EasingOption[] values()
	{
		return (Easing$EasingOption[])((Easing$EasingOption []) ($VALUES)).clone();
	//    0    0:getstatic       #131 <Field Easing$EasingOption[] $VALUES>
	//    1    3:invokevirtual   #146 <Method Object _5B_Lcom.github.mikephil.charting.animation.Easing$EasingOption_3B_.clone()>
	//    2    6:checkcast       #142 <Class Easing$EasingOption[]>
	//    3    9:areturn         
	}

	private static final Easing$EasingOption $VALUES[];
	public static final Easing$EasingOption EaseInBack;
	public static final Easing$EasingOption EaseInBounce;
	public static final Easing$EasingOption EaseInCirc;
	public static final Easing$EasingOption EaseInCubic;
	public static final Easing$EasingOption EaseInElastic;
	public static final Easing$EasingOption EaseInExpo;
	public static final Easing$EasingOption EaseInOutBack;
	public static final Easing$EasingOption EaseInOutBounce;
	public static final Easing$EasingOption EaseInOutCirc;
	public static final Easing$EasingOption EaseInOutCubic;
	public static final Easing$EasingOption EaseInOutElastic;
	public static final Easing$EasingOption EaseInOutExpo;
	public static final Easing$EasingOption EaseInOutQuad;
	public static final Easing$EasingOption EaseInOutQuart;
	public static final Easing$EasingOption EaseInOutSine;
	public static final Easing$EasingOption EaseInQuad;
	public static final Easing$EasingOption EaseInQuart;
	public static final Easing$EasingOption EaseInSine;
	public static final Easing$EasingOption EaseOutBack;
	public static final Easing$EasingOption EaseOutBounce;
	public static final Easing$EasingOption EaseOutCirc;
	public static final Easing$EasingOption EaseOutCubic;
	public static final Easing$EasingOption EaseOutElastic;
	public static final Easing$EasingOption EaseOutExpo;
	public static final Easing$EasingOption EaseOutQuad;
	public static final Easing$EasingOption EaseOutQuart;
	public static final Easing$EasingOption EaseOutSine;
	public static final Easing$EasingOption Linear;

	static 
	{
		Linear = new Easing$EasingOption("Linear", 0);
	//    0    0:new             #2   <Class Easing$EasingOption>
	//    1    3:dup             
	//    2    4:ldc1            #42  <String "Linear">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//    5   10:putstatic       #48  <Field Easing$EasingOption Linear>
		EaseInQuad = new Easing$EasingOption("EaseInQuad", 1);
	//    6   13:new             #2   <Class Easing$EasingOption>
	//    7   16:dup             
	//    8   17:ldc1            #49  <String "EaseInQuad">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   11   23:putstatic       #51  <Field Easing$EasingOption EaseInQuad>
		EaseOutQuad = new Easing$EasingOption("EaseOutQuad", 2);
	//   12   26:new             #2   <Class Easing$EasingOption>
	//   13   29:dup             
	//   14   30:ldc1            #52  <String "EaseOutQuad">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   17   36:putstatic       #54  <Field Easing$EasingOption EaseOutQuad>
		EaseInOutQuad = new Easing$EasingOption("EaseInOutQuad", 3);
	//   18   39:new             #2   <Class Easing$EasingOption>
	//   19   42:dup             
	//   20   43:ldc1            #55  <String "EaseInOutQuad">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   23   49:putstatic       #57  <Field Easing$EasingOption EaseInOutQuad>
		EaseInCubic = new Easing$EasingOption("EaseInCubic", 4);
	//   24   52:new             #2   <Class Easing$EasingOption>
	//   25   55:dup             
	//   26   56:ldc1            #58  <String "EaseInCubic">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   29   62:putstatic       #60  <Field Easing$EasingOption EaseInCubic>
		EaseOutCubic = new Easing$EasingOption("EaseOutCubic", 5);
	//   30   65:new             #2   <Class Easing$EasingOption>
	//   31   68:dup             
	//   32   69:ldc1            #61  <String "EaseOutCubic">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   35   75:putstatic       #63  <Field Easing$EasingOption EaseOutCubic>
		EaseInOutCubic = new Easing$EasingOption("EaseInOutCubic", 6);
	//   36   78:new             #2   <Class Easing$EasingOption>
	//   37   81:dup             
	//   38   82:ldc1            #64  <String "EaseInOutCubic">
	//   39   84:bipush          6
	//   40   86:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   41   89:putstatic       #66  <Field Easing$EasingOption EaseInOutCubic>
		EaseInQuart = new Easing$EasingOption("EaseInQuart", 7);
	//   42   92:new             #2   <Class Easing$EasingOption>
	//   43   95:dup             
	//   44   96:ldc1            #67  <String "EaseInQuart">
	//   45   98:bipush          7
	//   46  100:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   47  103:putstatic       #69  <Field Easing$EasingOption EaseInQuart>
		EaseOutQuart = new Easing$EasingOption("EaseOutQuart", 8);
	//   48  106:new             #2   <Class Easing$EasingOption>
	//   49  109:dup             
	//   50  110:ldc1            #70  <String "EaseOutQuart">
	//   51  112:bipush          8
	//   52  114:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   53  117:putstatic       #72  <Field Easing$EasingOption EaseOutQuart>
		EaseInOutQuart = new Easing$EasingOption("EaseInOutQuart", 9);
	//   54  120:new             #2   <Class Easing$EasingOption>
	//   55  123:dup             
	//   56  124:ldc1            #73  <String "EaseInOutQuart">
	//   57  126:bipush          9
	//   58  128:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   59  131:putstatic       #75  <Field Easing$EasingOption EaseInOutQuart>
		EaseInSine = new Easing$EasingOption("EaseInSine", 10);
	//   60  134:new             #2   <Class Easing$EasingOption>
	//   61  137:dup             
	//   62  138:ldc1            #76  <String "EaseInSine">
	//   63  140:bipush          10
	//   64  142:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   65  145:putstatic       #78  <Field Easing$EasingOption EaseInSine>
		EaseOutSine = new Easing$EasingOption("EaseOutSine", 11);
	//   66  148:new             #2   <Class Easing$EasingOption>
	//   67  151:dup             
	//   68  152:ldc1            #79  <String "EaseOutSine">
	//   69  154:bipush          11
	//   70  156:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   71  159:putstatic       #81  <Field Easing$EasingOption EaseOutSine>
		EaseInOutSine = new Easing$EasingOption("EaseInOutSine", 12);
	//   72  162:new             #2   <Class Easing$EasingOption>
	//   73  165:dup             
	//   74  166:ldc1            #82  <String "EaseInOutSine">
	//   75  168:bipush          12
	//   76  170:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   77  173:putstatic       #84  <Field Easing$EasingOption EaseInOutSine>
		EaseInExpo = new Easing$EasingOption("EaseInExpo", 13);
	//   78  176:new             #2   <Class Easing$EasingOption>
	//   79  179:dup             
	//   80  180:ldc1            #85  <String "EaseInExpo">
	//   81  182:bipush          13
	//   82  184:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   83  187:putstatic       #87  <Field Easing$EasingOption EaseInExpo>
		EaseOutExpo = new Easing$EasingOption("EaseOutExpo", 14);
	//   84  190:new             #2   <Class Easing$EasingOption>
	//   85  193:dup             
	//   86  194:ldc1            #88  <String "EaseOutExpo">
	//   87  196:bipush          14
	//   88  198:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   89  201:putstatic       #90  <Field Easing$EasingOption EaseOutExpo>
		EaseInOutExpo = new Easing$EasingOption("EaseInOutExpo", 15);
	//   90  204:new             #2   <Class Easing$EasingOption>
	//   91  207:dup             
	//   92  208:ldc1            #91  <String "EaseInOutExpo">
	//   93  210:bipush          15
	//   94  212:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//   95  215:putstatic       #93  <Field Easing$EasingOption EaseInOutExpo>
		EaseInCirc = new Easing$EasingOption("EaseInCirc", 16);
	//   96  218:new             #2   <Class Easing$EasingOption>
	//   97  221:dup             
	//   98  222:ldc1            #94  <String "EaseInCirc">
	//   99  224:bipush          16
	//  100  226:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  101  229:putstatic       #96  <Field Easing$EasingOption EaseInCirc>
		EaseOutCirc = new Easing$EasingOption("EaseOutCirc", 17);
	//  102  232:new             #2   <Class Easing$EasingOption>
	//  103  235:dup             
	//  104  236:ldc1            #97  <String "EaseOutCirc">
	//  105  238:bipush          17
	//  106  240:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  107  243:putstatic       #99  <Field Easing$EasingOption EaseOutCirc>
		EaseInOutCirc = new Easing$EasingOption("EaseInOutCirc", 18);
	//  108  246:new             #2   <Class Easing$EasingOption>
	//  109  249:dup             
	//  110  250:ldc1            #100 <String "EaseInOutCirc">
	//  111  252:bipush          18
	//  112  254:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  113  257:putstatic       #102 <Field Easing$EasingOption EaseInOutCirc>
		EaseInElastic = new Easing$EasingOption("EaseInElastic", 19);
	//  114  260:new             #2   <Class Easing$EasingOption>
	//  115  263:dup             
	//  116  264:ldc1            #103 <String "EaseInElastic">
	//  117  266:bipush          19
	//  118  268:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  119  271:putstatic       #105 <Field Easing$EasingOption EaseInElastic>
		EaseOutElastic = new Easing$EasingOption("EaseOutElastic", 20);
	//  120  274:new             #2   <Class Easing$EasingOption>
	//  121  277:dup             
	//  122  278:ldc1            #106 <String "EaseOutElastic">
	//  123  280:bipush          20
	//  124  282:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  125  285:putstatic       #108 <Field Easing$EasingOption EaseOutElastic>
		EaseInOutElastic = new Easing$EasingOption("EaseInOutElastic", 21);
	//  126  288:new             #2   <Class Easing$EasingOption>
	//  127  291:dup             
	//  128  292:ldc1            #109 <String "EaseInOutElastic">
	//  129  294:bipush          21
	//  130  296:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  131  299:putstatic       #111 <Field Easing$EasingOption EaseInOutElastic>
		EaseInBack = new Easing$EasingOption("EaseInBack", 22);
	//  132  302:new             #2   <Class Easing$EasingOption>
	//  133  305:dup             
	//  134  306:ldc1            #112 <String "EaseInBack">
	//  135  308:bipush          22
	//  136  310:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  137  313:putstatic       #114 <Field Easing$EasingOption EaseInBack>
		EaseOutBack = new Easing$EasingOption("EaseOutBack", 23);
	//  138  316:new             #2   <Class Easing$EasingOption>
	//  139  319:dup             
	//  140  320:ldc1            #115 <String "EaseOutBack">
	//  141  322:bipush          23
	//  142  324:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  143  327:putstatic       #117 <Field Easing$EasingOption EaseOutBack>
		EaseInOutBack = new Easing$EasingOption("EaseInOutBack", 24);
	//  144  330:new             #2   <Class Easing$EasingOption>
	//  145  333:dup             
	//  146  334:ldc1            #118 <String "EaseInOutBack">
	//  147  336:bipush          24
	//  148  338:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  149  341:putstatic       #120 <Field Easing$EasingOption EaseInOutBack>
		EaseInBounce = new Easing$EasingOption("EaseInBounce", 25);
	//  150  344:new             #2   <Class Easing$EasingOption>
	//  151  347:dup             
	//  152  348:ldc1            #121 <String "EaseInBounce">
	//  153  350:bipush          25
	//  154  352:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  155  355:putstatic       #123 <Field Easing$EasingOption EaseInBounce>
		EaseOutBounce = new Easing$EasingOption("EaseOutBounce", 26);
	//  156  358:new             #2   <Class Easing$EasingOption>
	//  157  361:dup             
	//  158  362:ldc1            #124 <String "EaseOutBounce">
	//  159  364:bipush          26
	//  160  366:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  161  369:putstatic       #126 <Field Easing$EasingOption EaseOutBounce>
		EaseInOutBounce = new Easing$EasingOption("EaseInOutBounce", 27);
	//  162  372:new             #2   <Class Easing$EasingOption>
	//  163  375:dup             
	//  164  376:ldc1            #127 <String "EaseInOutBounce">
	//  165  378:bipush          27
	//  166  380:invokespecial   #46  <Method void Easing$EasingOption(String, int)>
	//  167  383:putstatic       #129 <Field Easing$EasingOption EaseInOutBounce>
		$VALUES = (new Easing$EasingOption[] {
			Linear, EaseInQuad, EaseOutQuad, EaseInOutQuad, EaseInCubic, EaseOutCubic, EaseInOutCubic, EaseInQuart, EaseOutQuart, EaseInOutQuart, 
			EaseInSine, EaseOutSine, EaseInOutSine, EaseInExpo, EaseOutExpo, EaseInOutExpo, EaseInCirc, EaseOutCirc, EaseInOutCirc, EaseInElastic, 
			EaseOutElastic, EaseInOutElastic, EaseInBack, EaseOutBack, EaseInOutBack, EaseInBounce, EaseOutBounce, EaseInOutBounce
		});
	//  168  386:bipush          28
	//  169  388:anewarray       Easing$EasingOption[]
	//  170  391:dup             
	//  171  392:iconst_0        
	//  172  393:getstatic       #48  <Field Easing$EasingOption Linear>
	//  173  396:aastore         
	//  174  397:dup             
	//  175  398:iconst_1        
	//  176  399:getstatic       #51  <Field Easing$EasingOption EaseInQuad>
	//  177  402:aastore         
	//  178  403:dup             
	//  179  404:iconst_2        
	//  180  405:getstatic       #54  <Field Easing$EasingOption EaseOutQuad>
	//  181  408:aastore         
	//  182  409:dup             
	//  183  410:iconst_3        
	//  184  411:getstatic       #57  <Field Easing$EasingOption EaseInOutQuad>
	//  185  414:aastore         
	//  186  415:dup             
	//  187  416:iconst_4        
	//  188  417:getstatic       #60  <Field Easing$EasingOption EaseInCubic>
	//  189  420:aastore         
	//  190  421:dup             
	//  191  422:iconst_5        
	//  192  423:getstatic       #63  <Field Easing$EasingOption EaseOutCubic>
	//  193  426:aastore         
	//  194  427:dup             
	//  195  428:bipush          6
	//  196  430:getstatic       #66  <Field Easing$EasingOption EaseInOutCubic>
	//  197  433:aastore         
	//  198  434:dup             
	//  199  435:bipush          7
	//  200  437:getstatic       #69  <Field Easing$EasingOption EaseInQuart>
	//  201  440:aastore         
	//  202  441:dup             
	//  203  442:bipush          8
	//  204  444:getstatic       #72  <Field Easing$EasingOption EaseOutQuart>
	//  205  447:aastore         
	//  206  448:dup             
	//  207  449:bipush          9
	//  208  451:getstatic       #75  <Field Easing$EasingOption EaseInOutQuart>
	//  209  454:aastore         
	//  210  455:dup             
	//  211  456:bipush          10
	//  212  458:getstatic       #78  <Field Easing$EasingOption EaseInSine>
	//  213  461:aastore         
	//  214  462:dup             
	//  215  463:bipush          11
	//  216  465:getstatic       #81  <Field Easing$EasingOption EaseOutSine>
	//  217  468:aastore         
	//  218  469:dup             
	//  219  470:bipush          12
	//  220  472:getstatic       #84  <Field Easing$EasingOption EaseInOutSine>
	//  221  475:aastore         
	//  222  476:dup             
	//  223  477:bipush          13
	//  224  479:getstatic       #87  <Field Easing$EasingOption EaseInExpo>
	//  225  482:aastore         
	//  226  483:dup             
	//  227  484:bipush          14
	//  228  486:getstatic       #90  <Field Easing$EasingOption EaseOutExpo>
	//  229  489:aastore         
	//  230  490:dup             
	//  231  491:bipush          15
	//  232  493:getstatic       #93  <Field Easing$EasingOption EaseInOutExpo>
	//  233  496:aastore         
	//  234  497:dup             
	//  235  498:bipush          16
	//  236  500:getstatic       #96  <Field Easing$EasingOption EaseInCirc>
	//  237  503:aastore         
	//  238  504:dup             
	//  239  505:bipush          17
	//  240  507:getstatic       #99  <Field Easing$EasingOption EaseOutCirc>
	//  241  510:aastore         
	//  242  511:dup             
	//  243  512:bipush          18
	//  244  514:getstatic       #102 <Field Easing$EasingOption EaseInOutCirc>
	//  245  517:aastore         
	//  246  518:dup             
	//  247  519:bipush          19
	//  248  521:getstatic       #105 <Field Easing$EasingOption EaseInElastic>
	//  249  524:aastore         
	//  250  525:dup             
	//  251  526:bipush          20
	//  252  528:getstatic       #108 <Field Easing$EasingOption EaseOutElastic>
	//  253  531:aastore         
	//  254  532:dup             
	//  255  533:bipush          21
	//  256  535:getstatic       #111 <Field Easing$EasingOption EaseInOutElastic>
	//  257  538:aastore         
	//  258  539:dup             
	//  259  540:bipush          22
	//  260  542:getstatic       #114 <Field Easing$EasingOption EaseInBack>
	//  261  545:aastore         
	//  262  546:dup             
	//  263  547:bipush          23
	//  264  549:getstatic       #117 <Field Easing$EasingOption EaseOutBack>
	//  265  552:aastore         
	//  266  553:dup             
	//  267  554:bipush          24
	//  268  556:getstatic       #120 <Field Easing$EasingOption EaseInOutBack>
	//  269  559:aastore         
	//  270  560:dup             
	//  271  561:bipush          25
	//  272  563:getstatic       #123 <Field Easing$EasingOption EaseInBounce>
	//  273  566:aastore         
	//  274  567:dup             
	//  275  568:bipush          26
	//  276  570:getstatic       #126 <Field Easing$EasingOption EaseOutBounce>
	//  277  573:aastore         
	//  278  574:dup             
	//  279  575:bipush          27
	//  280  577:getstatic       #129 <Field Easing$EasingOption EaseInOutBounce>
	//  281  580:aastore         
	//  282  581:putstatic       #131 <Field Easing$EasingOption[] $VALUES>
	//* 283  584:return          
	}

	private Easing$EasingOption(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #133 <Method void Enum(String, int)>
	//    4    6:return          
	}
}
