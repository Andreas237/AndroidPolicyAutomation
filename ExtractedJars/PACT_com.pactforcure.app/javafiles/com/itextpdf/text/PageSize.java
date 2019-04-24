// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.lang.reflect.Field;

// Referenced classes of package com.itextpdf.text:
//			RectangleReadOnly, Rectangle

public class PageSize
{

	public PageSize()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #246 <Method void Object()>
	//    2    4:return          
	}

	public static Rectangle getRectangle(String s)
	{
		s = s.trim().toUpperCase();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #256 <Method String String.trim()>
	//    2    4:invokevirtual   #259 <Method String String.toUpperCase()>
	//    3    7:astore_0        
		int i = s.indexOf(' ');
	//    4    8:aload_0         
	//    5    9:bipush          32
	//    6   11:invokevirtual   #263 <Method int String.indexOf(int)>
	//    7   14:istore_1        
		if(i == -1)
	//*   8   15:iload_1         
	//*   9   16:iconst_m1       
	//*  10   17:icmpne          62
		{
			Rectangle rectangle;
			try
			{
				rectangle = (Rectangle)((Class) (com/itextpdf/text/PageSize)).getDeclaredField(s.toUpperCase()).get(((Object) (null)));
	//   11   20:ldc1            #2   <Class PageSize>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #259 <Method String String.toUpperCase()>
	//   14   26:invokevirtual   #269 <Method Field Class.getDeclaredField(String)>
	//   15   29:aconst_null     
	//   16   30:invokevirtual   #275 <Method Object Field.get(Object)>
	//   17   33:checkcast       #277 <Class Rectangle>
	//   18   36:astore_2        
			}
	//*  19   37:aload_2         
	//*  20   38:areturn         
			catch(Exception exception)
	//*  21   39:astore_2        
			{
				throw new RuntimeException(MessageLocalization.getComposedMessage("can.t.find.page.size.1", new Object[] {
					s
				}));
	//   22   40:new             #279 <Class RuntimeException>
	//   23   43:dup             
	//   24   44:ldc2            #281 <String "can.t.find.page.size.1">
	//   25   47:iconst_1        
	//   26   48:anewarray       Object[]
	//   27   51:dup             
	//   28   52:iconst_0        
	//   29   53:aload_0         
	//   30   54:aastore         
	//   31   55:invokestatic    #287 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   32   58:invokespecial   #290 <Method void RuntimeException(String)>
	//   33   61:athrow          
			}
			return rectangle;
		}
		Object obj;
		try
		{
			obj = ((Object) (s.substring(0, i)));
	//   34   62:aload_0         
	//   35   63:iconst_0        
	//   36   64:iload_1         
	//   37   65:invokevirtual   #294 <Method String String.substring(int, int)>
	//   38   68:astore_2        
			String s1 = s.substring(i + 1);
	//   39   69:aload_0         
	//   40   70:iload_1         
	//   41   71:iconst_1        
	//   42   72:iadd            
	//   43   73:invokevirtual   #297 <Method String String.substring(int)>
	//   44   76:astore_3        
			obj = ((Object) (new Rectangle(Float.parseFloat(((String) (obj))), Float.parseFloat(s1))));
	//   45   77:new             #277 <Class Rectangle>
	//   46   80:dup             
	//   47   81:aload_2         
	//   48   82:invokestatic    #303 <Method float Float.parseFloat(String)>
	//   49   85:aload_3         
	//   50   86:invokestatic    #303 <Method float Float.parseFloat(String)>
	//   51   89:invokespecial   #304 <Method void Rectangle(float, float)>
	//   52   92:astore_2        
		}
	//*  53   93:aload_2         
	//*  54   94:areturn         
		catch(Exception exception1)
	//*  55   95:astore_2        
		{
			throw new RuntimeException(MessageLocalization.getComposedMessage("1.is.not.a.valid.page.size.format.2", new Object[] {
				s, exception1.getMessage()
			}));
	//   56   96:new             #279 <Class RuntimeException>
	//   57   99:dup             
	//   58  100:ldc2            #306 <String "1.is.not.a.valid.page.size.format.2">
	//   59  103:iconst_2        
	//   60  104:anewarray       Object[]
	//   61  107:dup             
	//   62  108:iconst_0        
	//   63  109:aload_0         
	//   64  110:aastore         
	//   65  111:dup             
	//   66  112:iconst_1        
	//   67  113:aload_2         
	//   68  114:invokevirtual   #309 <Method String Exception.getMessage()>
	//   69  117:aastore         
	//   70  118:invokestatic    #287 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   71  121:invokespecial   #290 <Method void RuntimeException(String)>
	//   72  124:athrow          
		}
		return ((Rectangle) (obj));
	}

	public static final Rectangle A0 = new RectangleReadOnly(2384F, 3370F);
	public static final Rectangle A1 = new RectangleReadOnly(1684F, 2384F);
	public static final Rectangle A10 = new RectangleReadOnly(73F, 105F);
	public static final Rectangle A2 = new RectangleReadOnly(1191F, 1684F);
	public static final Rectangle A3 = new RectangleReadOnly(842F, 1191F);
	public static final Rectangle A4 = new RectangleReadOnly(595F, 842F);
	public static final Rectangle A4_LANDSCAPE = new RectangleReadOnly(595F, 842F, 90);
	public static final Rectangle A5 = new RectangleReadOnly(420F, 595F);
	public static final Rectangle A6 = new RectangleReadOnly(297F, 420F);
	public static final Rectangle A7 = new RectangleReadOnly(210F, 297F);
	public static final Rectangle A8 = new RectangleReadOnly(148F, 210F);
	public static final Rectangle A9 = new RectangleReadOnly(105F, 148F);
	public static final Rectangle ARCH_A = new RectangleReadOnly(648F, 864F);
	public static final Rectangle ARCH_B = new RectangleReadOnly(864F, 1296F);
	public static final Rectangle ARCH_C = new RectangleReadOnly(1296F, 1728F);
	public static final Rectangle ARCH_D = new RectangleReadOnly(1728F, 2592F);
	public static final Rectangle ARCH_E = new RectangleReadOnly(2592F, 3456F);
	public static final Rectangle B0 = new RectangleReadOnly(2834F, 4008F);
	public static final Rectangle B1 = new RectangleReadOnly(2004F, 2834F);
	public static final Rectangle B10 = new RectangleReadOnly(87F, 124F);
	public static final Rectangle B2 = new RectangleReadOnly(1417F, 2004F);
	public static final Rectangle B3 = new RectangleReadOnly(1000F, 1417F);
	public static final Rectangle B4 = new RectangleReadOnly(708F, 1000F);
	public static final Rectangle B5 = new RectangleReadOnly(498F, 708F);
	public static final Rectangle B6 = new RectangleReadOnly(354F, 498F);
	public static final Rectangle B7 = new RectangleReadOnly(249F, 354F);
	public static final Rectangle B8 = new RectangleReadOnly(175F, 249F);
	public static final Rectangle B9 = new RectangleReadOnly(124F, 175F);
	public static final Rectangle CROWN_OCTAVO = new RectangleReadOnly(348F, 527F);
	public static final Rectangle CROWN_QUARTO = new RectangleReadOnly(535F, 697F);
	public static final Rectangle DEMY_OCTAVO = new RectangleReadOnly(391F, 612F);
	public static final Rectangle DEMY_QUARTO = new RectangleReadOnly(620F, 782F);
	public static final Rectangle EXECUTIVE = new RectangleReadOnly(522F, 756F);
	public static final Rectangle FLSA = new RectangleReadOnly(612F, 936F);
	public static final Rectangle FLSE = new RectangleReadOnly(648F, 936F);
	public static final Rectangle HALFLETTER = new RectangleReadOnly(396F, 612F);
	public static final Rectangle ID_1 = new RectangleReadOnly(242.65F, 153F);
	public static final Rectangle ID_2 = new RectangleReadOnly(297F, 210F);
	public static final Rectangle ID_3 = new RectangleReadOnly(354F, 249F);
	public static final Rectangle LARGE_CROWN_OCTAVO = new RectangleReadOnly(365F, 561F);
	public static final Rectangle LARGE_CROWN_QUARTO = new RectangleReadOnly(569F, 731F);
	public static final Rectangle LEDGER = new RectangleReadOnly(1224F, 792F);
	public static final Rectangle LEGAL = new RectangleReadOnly(612F, 1008F);
	public static final Rectangle LEGAL_LANDSCAPE = new RectangleReadOnly(612F, 1008F, 90);
	public static final Rectangle LETTER = new RectangleReadOnly(612F, 792F);
	public static final Rectangle LETTER_LANDSCAPE = new RectangleReadOnly(612F, 792F, 90);
	public static final Rectangle NOTE = new RectangleReadOnly(540F, 720F);
	public static final Rectangle PENGUIN_LARGE_PAPERBACK = new RectangleReadOnly(365F, 561F);
	public static final Rectangle PENGUIN_SMALL_PAPERBACK = new RectangleReadOnly(314F, 513F);
	public static final Rectangle POSTCARD = new RectangleReadOnly(283F, 416F);
	public static final Rectangle ROYAL_OCTAVO = new RectangleReadOnly(442F, 663F);
	public static final Rectangle ROYAL_QUARTO = new RectangleReadOnly(671F, 884F);
	public static final Rectangle SMALL_PAPERBACK = new RectangleReadOnly(314F, 504F);
	public static final Rectangle TABLOID = new RectangleReadOnly(792F, 1224F);
	public static final Rectangle _11X17 = new RectangleReadOnly(792F, 1224F);

	static 
	{
	//    0    0:new             #64  <Class RectangleReadOnly>
	//    1    3:dup             
	//    2    4:ldc1            #65  <Float 612F>
	//    3    6:ldc1            #66  <Float 792F>
	//    4    8:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//    5   11:putstatic       #72  <Field Rectangle LETTER>
	//    6   14:new             #64  <Class RectangleReadOnly>
	//    7   17:dup             
	//    8   18:ldc1            #73  <Float 540F>
	//    9   20:ldc1            #74  <Float 720F>
	//   10   22:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   11   25:putstatic       #76  <Field Rectangle NOTE>
	//   12   28:new             #64  <Class RectangleReadOnly>
	//   13   31:dup             
	//   14   32:ldc1            #65  <Float 612F>
	//   15   34:ldc1            #77  <Float 1008F>
	//   16   36:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   17   39:putstatic       #79  <Field Rectangle LEGAL>
	//   18   42:new             #64  <Class RectangleReadOnly>
	//   19   45:dup             
	//   20   46:ldc1            #66  <Float 792F>
	//   21   48:ldc1            #80  <Float 1224F>
	//   22   50:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   23   53:putstatic       #82  <Field Rectangle TABLOID>
	//   24   56:new             #64  <Class RectangleReadOnly>
	//   25   59:dup             
	//   26   60:ldc1            #83  <Float 522F>
	//   27   62:ldc1            #84  <Float 756F>
	//   28   64:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   29   67:putstatic       #86  <Field Rectangle EXECUTIVE>
	//   30   70:new             #64  <Class RectangleReadOnly>
	//   31   73:dup             
	//   32   74:ldc1            #87  <Float 283F>
	//   33   76:ldc1            #88  <Float 416F>
	//   34   78:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   35   81:putstatic       #90  <Field Rectangle POSTCARD>
	//   36   84:new             #64  <Class RectangleReadOnly>
	//   37   87:dup             
	//   38   88:ldc1            #91  <Float 2384F>
	//   39   90:ldc1            #92  <Float 3370F>
	//   40   92:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   41   95:putstatic       #94  <Field Rectangle A0>
	//   42   98:new             #64  <Class RectangleReadOnly>
	//   43  101:dup             
	//   44  102:ldc1            #95  <Float 1684F>
	//   45  104:ldc1            #91  <Float 2384F>
	//   46  106:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   47  109:putstatic       #97  <Field Rectangle A1>
	//   48  112:new             #64  <Class RectangleReadOnly>
	//   49  115:dup             
	//   50  116:ldc1            #98  <Float 1191F>
	//   51  118:ldc1            #95  <Float 1684F>
	//   52  120:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   53  123:putstatic       #100 <Field Rectangle A2>
	//   54  126:new             #64  <Class RectangleReadOnly>
	//   55  129:dup             
	//   56  130:ldc1            #101 <Float 842F>
	//   57  132:ldc1            #98  <Float 1191F>
	//   58  134:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   59  137:putstatic       #103 <Field Rectangle A3>
	//   60  140:new             #64  <Class RectangleReadOnly>
	//   61  143:dup             
	//   62  144:ldc1            #104 <Float 595F>
	//   63  146:ldc1            #101 <Float 842F>
	//   64  148:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   65  151:putstatic       #106 <Field Rectangle A4>
	//   66  154:new             #64  <Class RectangleReadOnly>
	//   67  157:dup             
	//   68  158:ldc1            #107 <Float 420F>
	//   69  160:ldc1            #104 <Float 595F>
	//   70  162:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   71  165:putstatic       #109 <Field Rectangle A5>
	//   72  168:new             #64  <Class RectangleReadOnly>
	//   73  171:dup             
	//   74  172:ldc1            #110 <Float 297F>
	//   75  174:ldc1            #107 <Float 420F>
	//   76  176:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   77  179:putstatic       #112 <Field Rectangle A6>
	//   78  182:new             #64  <Class RectangleReadOnly>
	//   79  185:dup             
	//   80  186:ldc1            #113 <Float 210F>
	//   81  188:ldc1            #110 <Float 297F>
	//   82  190:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   83  193:putstatic       #115 <Field Rectangle A7>
	//   84  196:new             #64  <Class RectangleReadOnly>
	//   85  199:dup             
	//   86  200:ldc1            #116 <Float 148F>
	//   87  202:ldc1            #113 <Float 210F>
	//   88  204:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   89  207:putstatic       #118 <Field Rectangle A8>
	//   90  210:new             #64  <Class RectangleReadOnly>
	//   91  213:dup             
	//   92  214:ldc1            #119 <Float 105F>
	//   93  216:ldc1            #116 <Float 148F>
	//   94  218:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//   95  221:putstatic       #121 <Field Rectangle A9>
	//   96  224:new             #64  <Class RectangleReadOnly>
	//   97  227:dup             
	//   98  228:ldc1            #122 <Float 73F>
	//   99  230:ldc1            #119 <Float 105F>
	//  100  232:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  101  235:putstatic       #124 <Field Rectangle A10>
	//  102  238:new             #64  <Class RectangleReadOnly>
	//  103  241:dup             
	//  104  242:ldc1            #125 <Float 2834F>
	//  105  244:ldc1            #126 <Float 4008F>
	//  106  246:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  107  249:putstatic       #128 <Field Rectangle B0>
	//  108  252:new             #64  <Class RectangleReadOnly>
	//  109  255:dup             
	//  110  256:ldc1            #129 <Float 2004F>
	//  111  258:ldc1            #125 <Float 2834F>
	//  112  260:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  113  263:putstatic       #131 <Field Rectangle B1>
	//  114  266:new             #64  <Class RectangleReadOnly>
	//  115  269:dup             
	//  116  270:ldc1            #132 <Float 1417F>
	//  117  272:ldc1            #129 <Float 2004F>
	//  118  274:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  119  277:putstatic       #134 <Field Rectangle B2>
	//  120  280:new             #64  <Class RectangleReadOnly>
	//  121  283:dup             
	//  122  284:ldc1            #135 <Float 1000F>
	//  123  286:ldc1            #132 <Float 1417F>
	//  124  288:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  125  291:putstatic       #137 <Field Rectangle B3>
	//  126  294:new             #64  <Class RectangleReadOnly>
	//  127  297:dup             
	//  128  298:ldc1            #138 <Float 708F>
	//  129  300:ldc1            #135 <Float 1000F>
	//  130  302:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  131  305:putstatic       #140 <Field Rectangle B4>
	//  132  308:new             #64  <Class RectangleReadOnly>
	//  133  311:dup             
	//  134  312:ldc1            #141 <Float 498F>
	//  135  314:ldc1            #138 <Float 708F>
	//  136  316:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  137  319:putstatic       #143 <Field Rectangle B5>
	//  138  322:new             #64  <Class RectangleReadOnly>
	//  139  325:dup             
	//  140  326:ldc1            #144 <Float 354F>
	//  141  328:ldc1            #141 <Float 498F>
	//  142  330:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  143  333:putstatic       #146 <Field Rectangle B6>
	//  144  336:new             #64  <Class RectangleReadOnly>
	//  145  339:dup             
	//  146  340:ldc1            #147 <Float 249F>
	//  147  342:ldc1            #144 <Float 354F>
	//  148  344:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  149  347:putstatic       #149 <Field Rectangle B7>
	//  150  350:new             #64  <Class RectangleReadOnly>
	//  151  353:dup             
	//  152  354:ldc1            #150 <Float 175F>
	//  153  356:ldc1            #147 <Float 249F>
	//  154  358:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  155  361:putstatic       #152 <Field Rectangle B8>
	//  156  364:new             #64  <Class RectangleReadOnly>
	//  157  367:dup             
	//  158  368:ldc1            #153 <Float 124F>
	//  159  370:ldc1            #150 <Float 175F>
	//  160  372:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  161  375:putstatic       #155 <Field Rectangle B9>
	//  162  378:new             #64  <Class RectangleReadOnly>
	//  163  381:dup             
	//  164  382:ldc1            #156 <Float 87F>
	//  165  384:ldc1            #153 <Float 124F>
	//  166  386:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  167  389:putstatic       #158 <Field Rectangle B10>
	//  168  392:new             #64  <Class RectangleReadOnly>
	//  169  395:dup             
	//  170  396:ldc1            #159 <Float 2592F>
	//  171  398:ldc1            #160 <Float 3456F>
	//  172  400:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  173  403:putstatic       #162 <Field Rectangle ARCH_E>
	//  174  406:new             #64  <Class RectangleReadOnly>
	//  175  409:dup             
	//  176  410:ldc1            #163 <Float 1728F>
	//  177  412:ldc1            #159 <Float 2592F>
	//  178  414:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  179  417:putstatic       #165 <Field Rectangle ARCH_D>
	//  180  420:new             #64  <Class RectangleReadOnly>
	//  181  423:dup             
	//  182  424:ldc1            #166 <Float 1296F>
	//  183  426:ldc1            #163 <Float 1728F>
	//  184  428:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  185  431:putstatic       #168 <Field Rectangle ARCH_C>
	//  186  434:new             #64  <Class RectangleReadOnly>
	//  187  437:dup             
	//  188  438:ldc1            #169 <Float 864F>
	//  189  440:ldc1            #166 <Float 1296F>
	//  190  442:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  191  445:putstatic       #171 <Field Rectangle ARCH_B>
	//  192  448:new             #64  <Class RectangleReadOnly>
	//  193  451:dup             
	//  194  452:ldc1            #172 <Float 648F>
	//  195  454:ldc1            #169 <Float 864F>
	//  196  456:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  197  459:putstatic       #174 <Field Rectangle ARCH_A>
	//  198  462:new             #64  <Class RectangleReadOnly>
	//  199  465:dup             
	//  200  466:ldc1            #65  <Float 612F>
	//  201  468:ldc1            #175 <Float 936F>
	//  202  470:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  203  473:putstatic       #177 <Field Rectangle FLSA>
	//  204  476:new             #64  <Class RectangleReadOnly>
	//  205  479:dup             
	//  206  480:ldc1            #172 <Float 648F>
	//  207  482:ldc1            #175 <Float 936F>
	//  208  484:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  209  487:putstatic       #179 <Field Rectangle FLSE>
	//  210  490:new             #64  <Class RectangleReadOnly>
	//  211  493:dup             
	//  212  494:ldc1            #180 <Float 396F>
	//  213  496:ldc1            #65  <Float 612F>
	//  214  498:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  215  501:putstatic       #182 <Field Rectangle HALFLETTER>
	//  216  504:new             #64  <Class RectangleReadOnly>
	//  217  507:dup             
	//  218  508:ldc1            #66  <Float 792F>
	//  219  510:ldc1            #80  <Float 1224F>
	//  220  512:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  221  515:putstatic       #184 <Field Rectangle _11X17>
	//  222  518:new             #64  <Class RectangleReadOnly>
	//  223  521:dup             
	//  224  522:ldc1            #185 <Float 242.65F>
	//  225  524:ldc1            #186 <Float 153F>
	//  226  526:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  227  529:putstatic       #188 <Field Rectangle ID_1>
	//  228  532:new             #64  <Class RectangleReadOnly>
	//  229  535:dup             
	//  230  536:ldc1            #110 <Float 297F>
	//  231  538:ldc1            #113 <Float 210F>
	//  232  540:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  233  543:putstatic       #190 <Field Rectangle ID_2>
	//  234  546:new             #64  <Class RectangleReadOnly>
	//  235  549:dup             
	//  236  550:ldc1            #144 <Float 354F>
	//  237  552:ldc1            #147 <Float 249F>
	//  238  554:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  239  557:putstatic       #192 <Field Rectangle ID_3>
	//  240  560:new             #64  <Class RectangleReadOnly>
	//  241  563:dup             
	//  242  564:ldc1            #80  <Float 1224F>
	//  243  566:ldc1            #66  <Float 792F>
	//  244  568:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  245  571:putstatic       #194 <Field Rectangle LEDGER>
	//  246  574:new             #64  <Class RectangleReadOnly>
	//  247  577:dup             
	//  248  578:ldc1            #195 <Float 535F>
	//  249  580:ldc1            #196 <Float 697F>
	//  250  582:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  251  585:putstatic       #198 <Field Rectangle CROWN_QUARTO>
	//  252  588:new             #64  <Class RectangleReadOnly>
	//  253  591:dup             
	//  254  592:ldc1            #199 <Float 569F>
	//  255  594:ldc1            #200 <Float 731F>
	//  256  596:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  257  599:putstatic       #202 <Field Rectangle LARGE_CROWN_QUARTO>
	//  258  602:new             #64  <Class RectangleReadOnly>
	//  259  605:dup             
	//  260  606:ldc1            #203 <Float 620F>
	//  261  608:ldc1            #204 <Float 782F>
	//  262  610:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  263  613:putstatic       #206 <Field Rectangle DEMY_QUARTO>
	//  264  616:new             #64  <Class RectangleReadOnly>
	//  265  619:dup             
	//  266  620:ldc1            #207 <Float 671F>
	//  267  622:ldc1            #208 <Float 884F>
	//  268  624:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  269  627:putstatic       #210 <Field Rectangle ROYAL_QUARTO>
	//  270  630:new             #64  <Class RectangleReadOnly>
	//  271  633:dup             
	//  272  634:ldc1            #211 <Float 348F>
	//  273  636:ldc1            #212 <Float 527F>
	//  274  638:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  275  641:putstatic       #214 <Field Rectangle CROWN_OCTAVO>
	//  276  644:new             #64  <Class RectangleReadOnly>
	//  277  647:dup             
	//  278  648:ldc1            #215 <Float 365F>
	//  279  650:ldc1            #216 <Float 561F>
	//  280  652:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  281  655:putstatic       #218 <Field Rectangle LARGE_CROWN_OCTAVO>
	//  282  658:new             #64  <Class RectangleReadOnly>
	//  283  661:dup             
	//  284  662:ldc1            #219 <Float 391F>
	//  285  664:ldc1            #65  <Float 612F>
	//  286  666:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  287  669:putstatic       #221 <Field Rectangle DEMY_OCTAVO>
	//  288  672:new             #64  <Class RectangleReadOnly>
	//  289  675:dup             
	//  290  676:ldc1            #222 <Float 442F>
	//  291  678:ldc1            #223 <Float 663F>
	//  292  680:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  293  683:putstatic       #225 <Field Rectangle ROYAL_OCTAVO>
	//  294  686:new             #64  <Class RectangleReadOnly>
	//  295  689:dup             
	//  296  690:ldc1            #226 <Float 314F>
	//  297  692:ldc1            #227 <Float 504F>
	//  298  694:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  299  697:putstatic       #229 <Field Rectangle SMALL_PAPERBACK>
	//  300  700:new             #64  <Class RectangleReadOnly>
	//  301  703:dup             
	//  302  704:ldc1            #226 <Float 314F>
	//  303  706:ldc1            #230 <Float 513F>
	//  304  708:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  305  711:putstatic       #232 <Field Rectangle PENGUIN_SMALL_PAPERBACK>
	//  306  714:new             #64  <Class RectangleReadOnly>
	//  307  717:dup             
	//  308  718:ldc1            #215 <Float 365F>
	//  309  720:ldc1            #216 <Float 561F>
	//  310  722:invokespecial   #70  <Method void RectangleReadOnly(float, float)>
	//  311  725:putstatic       #234 <Field Rectangle PENGUIN_LARGE_PAPERBACK>
	//  312  728:new             #64  <Class RectangleReadOnly>
	//  313  731:dup             
	//  314  732:ldc1            #65  <Float 612F>
	//  315  734:ldc1            #66  <Float 792F>
	//  316  736:bipush          90
	//  317  738:invokespecial   #237 <Method void RectangleReadOnly(float, float, int)>
	//  318  741:putstatic       #239 <Field Rectangle LETTER_LANDSCAPE>
	//  319  744:new             #64  <Class RectangleReadOnly>
	//  320  747:dup             
	//  321  748:ldc1            #65  <Float 612F>
	//  322  750:ldc1            #77  <Float 1008F>
	//  323  752:bipush          90
	//  324  754:invokespecial   #237 <Method void RectangleReadOnly(float, float, int)>
	//  325  757:putstatic       #241 <Field Rectangle LEGAL_LANDSCAPE>
	//  326  760:new             #64  <Class RectangleReadOnly>
	//  327  763:dup             
	//  328  764:ldc1            #104 <Float 595F>
	//  329  766:ldc1            #101 <Float 842F>
	//  330  768:bipush          90
	//  331  770:invokespecial   #237 <Method void RectangleReadOnly(float, float, int)>
	//  332  773:putstatic       #243 <Field Rectangle A4_LANDSCAPE>
	//* 333  776:return          
	}
}
