// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.daasuu.ei;


public final class Ease extends Enum
{

	private Ease(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #130 <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static Ease valueOf(String s)
	{
		return (Ease)Enum.valueOf(com/daasuu/ei/Ease, s);
	//    0    0:ldc1            #2   <Class Ease>
	//    1    2:aload_0         
	//    2    3:invokestatic    #136 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Ease>
	//    4    9:areturn         
	}

	public static Ease[] values()
	{
		return (Ease[])((Ease []) ($VALUES)).clone();
	//    0    0:getstatic       #128 <Field Ease[] $VALUES>
	//    1    3:invokevirtual   #143 <Method Object _5B_Lcom.daasuu.ei.Ease_3B_.clone()>
	//    2    6:checkcast       #139 <Class Ease[]>
	//    3    9:areturn         
	}

	private static final Ease $VALUES[];
	public static final Ease BACK_IN;
	public static final Ease BACK_IN_OUT;
	public static final Ease BACK_OUT;
	public static final Ease BOUNCE_IN;
	public static final Ease BOUNCE_IN_OUT;
	public static final Ease BOUNCE_OUT;
	public static final Ease CIRC_IN;
	public static final Ease CIRC_IN_OUT;
	public static final Ease CIRC_OUT;
	public static final Ease CUBIC_IN;
	public static final Ease CUBIC_IN_OUT;
	public static final Ease CUBIC_OUT;
	public static final Ease ELASTIC_IN;
	public static final Ease ELASTIC_IN_OUT;
	public static final Ease ELASTIC_OUT;
	public static final Ease LINEAR;
	public static final Ease QUAD_IN;
	public static final Ease QUAD_IN_OUT;
	public static final Ease QUAD_OUT;
	public static final Ease QUART_IN;
	public static final Ease QUART_IN_OUT;
	public static final Ease QUART_OUT;
	public static final Ease QUINT_IN;
	public static final Ease QUINT_IN_OUT;
	public static final Ease QUINT_OUT;
	public static final Ease SINE_IN;
	public static final Ease SINE_IN_OUT;
	public static final Ease SINE_OUT;

	static 
	{
		LINEAR = new Ease("LINEAR", 0);
	//    0    0:new             #2   <Class Ease>
	//    1    3:dup             
	//    2    4:ldc1            #39  <String "LINEAR">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #43  <Method void Ease(String, int)>
	//    5   10:putstatic       #45  <Field Ease LINEAR>
		QUAD_IN = new Ease("QUAD_IN", 1);
	//    6   13:new             #2   <Class Ease>
	//    7   16:dup             
	//    8   17:ldc1            #46  <String "QUAD_IN">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #43  <Method void Ease(String, int)>
	//   11   23:putstatic       #48  <Field Ease QUAD_IN>
		QUAD_OUT = new Ease("QUAD_OUT", 2);
	//   12   26:new             #2   <Class Ease>
	//   13   29:dup             
	//   14   30:ldc1            #49  <String "QUAD_OUT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #43  <Method void Ease(String, int)>
	//   17   36:putstatic       #51  <Field Ease QUAD_OUT>
		QUAD_IN_OUT = new Ease("QUAD_IN_OUT", 3);
	//   18   39:new             #2   <Class Ease>
	//   19   42:dup             
	//   20   43:ldc1            #52  <String "QUAD_IN_OUT">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #43  <Method void Ease(String, int)>
	//   23   49:putstatic       #54  <Field Ease QUAD_IN_OUT>
		CUBIC_IN = new Ease("CUBIC_IN", 4);
	//   24   52:new             #2   <Class Ease>
	//   25   55:dup             
	//   26   56:ldc1            #55  <String "CUBIC_IN">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #43  <Method void Ease(String, int)>
	//   29   62:putstatic       #57  <Field Ease CUBIC_IN>
		CUBIC_OUT = new Ease("CUBIC_OUT", 5);
	//   30   65:new             #2   <Class Ease>
	//   31   68:dup             
	//   32   69:ldc1            #58  <String "CUBIC_OUT">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #43  <Method void Ease(String, int)>
	//   35   75:putstatic       #60  <Field Ease CUBIC_OUT>
		CUBIC_IN_OUT = new Ease("CUBIC_IN_OUT", 6);
	//   36   78:new             #2   <Class Ease>
	//   37   81:dup             
	//   38   82:ldc1            #61  <String "CUBIC_IN_OUT">
	//   39   84:bipush          6
	//   40   86:invokespecial   #43  <Method void Ease(String, int)>
	//   41   89:putstatic       #63  <Field Ease CUBIC_IN_OUT>
		QUART_IN = new Ease("QUART_IN", 7);
	//   42   92:new             #2   <Class Ease>
	//   43   95:dup             
	//   44   96:ldc1            #64  <String "QUART_IN">
	//   45   98:bipush          7
	//   46  100:invokespecial   #43  <Method void Ease(String, int)>
	//   47  103:putstatic       #66  <Field Ease QUART_IN>
		QUART_OUT = new Ease("QUART_OUT", 8);
	//   48  106:new             #2   <Class Ease>
	//   49  109:dup             
	//   50  110:ldc1            #67  <String "QUART_OUT">
	//   51  112:bipush          8
	//   52  114:invokespecial   #43  <Method void Ease(String, int)>
	//   53  117:putstatic       #69  <Field Ease QUART_OUT>
		QUART_IN_OUT = new Ease("QUART_IN_OUT", 9);
	//   54  120:new             #2   <Class Ease>
	//   55  123:dup             
	//   56  124:ldc1            #70  <String "QUART_IN_OUT">
	//   57  126:bipush          9
	//   58  128:invokespecial   #43  <Method void Ease(String, int)>
	//   59  131:putstatic       #72  <Field Ease QUART_IN_OUT>
		QUINT_IN = new Ease("QUINT_IN", 10);
	//   60  134:new             #2   <Class Ease>
	//   61  137:dup             
	//   62  138:ldc1            #73  <String "QUINT_IN">
	//   63  140:bipush          10
	//   64  142:invokespecial   #43  <Method void Ease(String, int)>
	//   65  145:putstatic       #75  <Field Ease QUINT_IN>
		QUINT_OUT = new Ease("QUINT_OUT", 11);
	//   66  148:new             #2   <Class Ease>
	//   67  151:dup             
	//   68  152:ldc1            #76  <String "QUINT_OUT">
	//   69  154:bipush          11
	//   70  156:invokespecial   #43  <Method void Ease(String, int)>
	//   71  159:putstatic       #78  <Field Ease QUINT_OUT>
		QUINT_IN_OUT = new Ease("QUINT_IN_OUT", 12);
	//   72  162:new             #2   <Class Ease>
	//   73  165:dup             
	//   74  166:ldc1            #79  <String "QUINT_IN_OUT">
	//   75  168:bipush          12
	//   76  170:invokespecial   #43  <Method void Ease(String, int)>
	//   77  173:putstatic       #81  <Field Ease QUINT_IN_OUT>
		SINE_IN = new Ease("SINE_IN", 13);
	//   78  176:new             #2   <Class Ease>
	//   79  179:dup             
	//   80  180:ldc1            #82  <String "SINE_IN">
	//   81  182:bipush          13
	//   82  184:invokespecial   #43  <Method void Ease(String, int)>
	//   83  187:putstatic       #84  <Field Ease SINE_IN>
		SINE_OUT = new Ease("SINE_OUT", 14);
	//   84  190:new             #2   <Class Ease>
	//   85  193:dup             
	//   86  194:ldc1            #85  <String "SINE_OUT">
	//   87  196:bipush          14
	//   88  198:invokespecial   #43  <Method void Ease(String, int)>
	//   89  201:putstatic       #87  <Field Ease SINE_OUT>
		SINE_IN_OUT = new Ease("SINE_IN_OUT", 15);
	//   90  204:new             #2   <Class Ease>
	//   91  207:dup             
	//   92  208:ldc1            #88  <String "SINE_IN_OUT">
	//   93  210:bipush          15
	//   94  212:invokespecial   #43  <Method void Ease(String, int)>
	//   95  215:putstatic       #90  <Field Ease SINE_IN_OUT>
		BACK_IN = new Ease("BACK_IN", 16);
	//   96  218:new             #2   <Class Ease>
	//   97  221:dup             
	//   98  222:ldc1            #91  <String "BACK_IN">
	//   99  224:bipush          16
	//  100  226:invokespecial   #43  <Method void Ease(String, int)>
	//  101  229:putstatic       #93  <Field Ease BACK_IN>
		BACK_OUT = new Ease("BACK_OUT", 17);
	//  102  232:new             #2   <Class Ease>
	//  103  235:dup             
	//  104  236:ldc1            #94  <String "BACK_OUT">
	//  105  238:bipush          17
	//  106  240:invokespecial   #43  <Method void Ease(String, int)>
	//  107  243:putstatic       #96  <Field Ease BACK_OUT>
		BACK_IN_OUT = new Ease("BACK_IN_OUT", 18);
	//  108  246:new             #2   <Class Ease>
	//  109  249:dup             
	//  110  250:ldc1            #97  <String "BACK_IN_OUT">
	//  111  252:bipush          18
	//  112  254:invokespecial   #43  <Method void Ease(String, int)>
	//  113  257:putstatic       #99  <Field Ease BACK_IN_OUT>
		CIRC_IN = new Ease("CIRC_IN", 19);
	//  114  260:new             #2   <Class Ease>
	//  115  263:dup             
	//  116  264:ldc1            #100 <String "CIRC_IN">
	//  117  266:bipush          19
	//  118  268:invokespecial   #43  <Method void Ease(String, int)>
	//  119  271:putstatic       #102 <Field Ease CIRC_IN>
		CIRC_OUT = new Ease("CIRC_OUT", 20);
	//  120  274:new             #2   <Class Ease>
	//  121  277:dup             
	//  122  278:ldc1            #103 <String "CIRC_OUT">
	//  123  280:bipush          20
	//  124  282:invokespecial   #43  <Method void Ease(String, int)>
	//  125  285:putstatic       #105 <Field Ease CIRC_OUT>
		CIRC_IN_OUT = new Ease("CIRC_IN_OUT", 21);
	//  126  288:new             #2   <Class Ease>
	//  127  291:dup             
	//  128  292:ldc1            #106 <String "CIRC_IN_OUT">
	//  129  294:bipush          21
	//  130  296:invokespecial   #43  <Method void Ease(String, int)>
	//  131  299:putstatic       #108 <Field Ease CIRC_IN_OUT>
		BOUNCE_IN = new Ease("BOUNCE_IN", 22);
	//  132  302:new             #2   <Class Ease>
	//  133  305:dup             
	//  134  306:ldc1            #109 <String "BOUNCE_IN">
	//  135  308:bipush          22
	//  136  310:invokespecial   #43  <Method void Ease(String, int)>
	//  137  313:putstatic       #111 <Field Ease BOUNCE_IN>
		BOUNCE_OUT = new Ease("BOUNCE_OUT", 23);
	//  138  316:new             #2   <Class Ease>
	//  139  319:dup             
	//  140  320:ldc1            #112 <String "BOUNCE_OUT">
	//  141  322:bipush          23
	//  142  324:invokespecial   #43  <Method void Ease(String, int)>
	//  143  327:putstatic       #114 <Field Ease BOUNCE_OUT>
		BOUNCE_IN_OUT = new Ease("BOUNCE_IN_OUT", 24);
	//  144  330:new             #2   <Class Ease>
	//  145  333:dup             
	//  146  334:ldc1            #115 <String "BOUNCE_IN_OUT">
	//  147  336:bipush          24
	//  148  338:invokespecial   #43  <Method void Ease(String, int)>
	//  149  341:putstatic       #117 <Field Ease BOUNCE_IN_OUT>
		ELASTIC_IN = new Ease("ELASTIC_IN", 25);
	//  150  344:new             #2   <Class Ease>
	//  151  347:dup             
	//  152  348:ldc1            #118 <String "ELASTIC_IN">
	//  153  350:bipush          25
	//  154  352:invokespecial   #43  <Method void Ease(String, int)>
	//  155  355:putstatic       #120 <Field Ease ELASTIC_IN>
		ELASTIC_OUT = new Ease("ELASTIC_OUT", 26);
	//  156  358:new             #2   <Class Ease>
	//  157  361:dup             
	//  158  362:ldc1            #121 <String "ELASTIC_OUT">
	//  159  364:bipush          26
	//  160  366:invokespecial   #43  <Method void Ease(String, int)>
	//  161  369:putstatic       #123 <Field Ease ELASTIC_OUT>
		ELASTIC_IN_OUT = new Ease("ELASTIC_IN_OUT", 27);
	//  162  372:new             #2   <Class Ease>
	//  163  375:dup             
	//  164  376:ldc1            #124 <String "ELASTIC_IN_OUT">
	//  165  378:bipush          27
	//  166  380:invokespecial   #43  <Method void Ease(String, int)>
	//  167  383:putstatic       #126 <Field Ease ELASTIC_IN_OUT>
		$VALUES = (new Ease[] {
			LINEAR, QUAD_IN, QUAD_OUT, QUAD_IN_OUT, CUBIC_IN, CUBIC_OUT, CUBIC_IN_OUT, QUART_IN, QUART_OUT, QUART_IN_OUT, 
			QUINT_IN, QUINT_OUT, QUINT_IN_OUT, SINE_IN, SINE_OUT, SINE_IN_OUT, BACK_IN, BACK_OUT, BACK_IN_OUT, CIRC_IN, 
			CIRC_OUT, CIRC_IN_OUT, BOUNCE_IN, BOUNCE_OUT, BOUNCE_IN_OUT, ELASTIC_IN, ELASTIC_OUT, ELASTIC_IN_OUT
		});
	//  168  386:bipush          28
	//  169  388:anewarray       Ease[]
	//  170  391:dup             
	//  171  392:iconst_0        
	//  172  393:getstatic       #45  <Field Ease LINEAR>
	//  173  396:aastore         
	//  174  397:dup             
	//  175  398:iconst_1        
	//  176  399:getstatic       #48  <Field Ease QUAD_IN>
	//  177  402:aastore         
	//  178  403:dup             
	//  179  404:iconst_2        
	//  180  405:getstatic       #51  <Field Ease QUAD_OUT>
	//  181  408:aastore         
	//  182  409:dup             
	//  183  410:iconst_3        
	//  184  411:getstatic       #54  <Field Ease QUAD_IN_OUT>
	//  185  414:aastore         
	//  186  415:dup             
	//  187  416:iconst_4        
	//  188  417:getstatic       #57  <Field Ease CUBIC_IN>
	//  189  420:aastore         
	//  190  421:dup             
	//  191  422:iconst_5        
	//  192  423:getstatic       #60  <Field Ease CUBIC_OUT>
	//  193  426:aastore         
	//  194  427:dup             
	//  195  428:bipush          6
	//  196  430:getstatic       #63  <Field Ease CUBIC_IN_OUT>
	//  197  433:aastore         
	//  198  434:dup             
	//  199  435:bipush          7
	//  200  437:getstatic       #66  <Field Ease QUART_IN>
	//  201  440:aastore         
	//  202  441:dup             
	//  203  442:bipush          8
	//  204  444:getstatic       #69  <Field Ease QUART_OUT>
	//  205  447:aastore         
	//  206  448:dup             
	//  207  449:bipush          9
	//  208  451:getstatic       #72  <Field Ease QUART_IN_OUT>
	//  209  454:aastore         
	//  210  455:dup             
	//  211  456:bipush          10
	//  212  458:getstatic       #75  <Field Ease QUINT_IN>
	//  213  461:aastore         
	//  214  462:dup             
	//  215  463:bipush          11
	//  216  465:getstatic       #78  <Field Ease QUINT_OUT>
	//  217  468:aastore         
	//  218  469:dup             
	//  219  470:bipush          12
	//  220  472:getstatic       #81  <Field Ease QUINT_IN_OUT>
	//  221  475:aastore         
	//  222  476:dup             
	//  223  477:bipush          13
	//  224  479:getstatic       #84  <Field Ease SINE_IN>
	//  225  482:aastore         
	//  226  483:dup             
	//  227  484:bipush          14
	//  228  486:getstatic       #87  <Field Ease SINE_OUT>
	//  229  489:aastore         
	//  230  490:dup             
	//  231  491:bipush          15
	//  232  493:getstatic       #90  <Field Ease SINE_IN_OUT>
	//  233  496:aastore         
	//  234  497:dup             
	//  235  498:bipush          16
	//  236  500:getstatic       #93  <Field Ease BACK_IN>
	//  237  503:aastore         
	//  238  504:dup             
	//  239  505:bipush          17
	//  240  507:getstatic       #96  <Field Ease BACK_OUT>
	//  241  510:aastore         
	//  242  511:dup             
	//  243  512:bipush          18
	//  244  514:getstatic       #99  <Field Ease BACK_IN_OUT>
	//  245  517:aastore         
	//  246  518:dup             
	//  247  519:bipush          19
	//  248  521:getstatic       #102 <Field Ease CIRC_IN>
	//  249  524:aastore         
	//  250  525:dup             
	//  251  526:bipush          20
	//  252  528:getstatic       #105 <Field Ease CIRC_OUT>
	//  253  531:aastore         
	//  254  532:dup             
	//  255  533:bipush          21
	//  256  535:getstatic       #108 <Field Ease CIRC_IN_OUT>
	//  257  538:aastore         
	//  258  539:dup             
	//  259  540:bipush          22
	//  260  542:getstatic       #111 <Field Ease BOUNCE_IN>
	//  261  545:aastore         
	//  262  546:dup             
	//  263  547:bipush          23
	//  264  549:getstatic       #114 <Field Ease BOUNCE_OUT>
	//  265  552:aastore         
	//  266  553:dup             
	//  267  554:bipush          24
	//  268  556:getstatic       #117 <Field Ease BOUNCE_IN_OUT>
	//  269  559:aastore         
	//  270  560:dup             
	//  271  561:bipush          25
	//  272  563:getstatic       #120 <Field Ease ELASTIC_IN>
	//  273  566:aastore         
	//  274  567:dup             
	//  275  568:bipush          26
	//  276  570:getstatic       #123 <Field Ease ELASTIC_OUT>
	//  277  573:aastore         
	//  278  574:dup             
	//  279  575:bipush          27
	//  280  577:getstatic       #126 <Field Ease ELASTIC_IN_OUT>
	//  281  580:aastore         
	//  282  581:putstatic       #128 <Field Ease[] $VALUES>
	//* 283  584:return          
	}
}
