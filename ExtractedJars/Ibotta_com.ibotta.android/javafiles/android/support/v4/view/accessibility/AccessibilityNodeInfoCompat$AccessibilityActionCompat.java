// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

public static class AccessibilityNodeInfoCompat$AccessibilityActionCompat
{

	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(64, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(128, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_FOCUS = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(2, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_SELECTION = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(8, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLICK = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(16, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_COLLAPSE = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(0x80000, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CONTEXT_CLICK;
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_COPY = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(16384, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CUT = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(0x10000, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_DISMISS = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(0x100000, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_EXPAND = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(0x40000, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_FOCUS = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(1, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_HIDE_TOOLTIP;
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_LONG_CLICK = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(32, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_MOVE_WINDOW;
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(256, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(1024, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PASTE = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(32768, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(512, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(2048, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_BACKWARD = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(8192, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_DOWN;
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_FORWARD = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(4096, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_LEFT;
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_RIGHT;
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_TO_POSITION;
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_UP;
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SELECT = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(4, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_PROGRESS;
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_SELECTION = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(0x20000, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_TEXT = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(0x200000, ((CharSequence) (null)));
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SHOW_ON_SCREEN;
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SHOW_TOOLTIP;
	final Object mAction;

	static 
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
	//    2    2:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//    3    5:dup             
	//    4    6:iconst_1        
	//    5    7:aconst_null     
	//    6    8:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//    7   11:putstatic       #51  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_FOCUS>
	//    8   14:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//    9   17:dup             
	//   10   18:iconst_2        
	//   11   19:aconst_null     
	//   12   20:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   13   23:putstatic       #53  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_FOCUS>
	//   14   26:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   15   29:dup             
	//   16   30:iconst_4        
	//   17   31:aconst_null     
	//   18   32:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   19   35:putstatic       #55  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SELECT>
	//   20   38:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   21   41:dup             
	//   22   42:bipush          8
	//   23   44:aconst_null     
	//   24   45:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   25   48:putstatic       #57  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_SELECTION>
	//   26   51:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   27   54:dup             
	//   28   55:bipush          16
	//   29   57:aconst_null     
	//   30   58:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   31   61:putstatic       #59  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLICK>
	//   32   64:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   33   67:dup             
	//   34   68:bipush          32
	//   35   70:aconst_null     
	//   36   71:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   37   74:putstatic       #61  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_LONG_CLICK>
	//   38   77:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   39   80:dup             
	//   40   81:bipush          64
	//   41   83:aconst_null     
	//   42   84:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   43   87:putstatic       #63  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS>
	//   44   90:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   45   93:dup             
	//   46   94:sipush          128
	//   47   97:aconst_null     
	//   48   98:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   49  101:putstatic       #65  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS>
	//   50  104:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   51  107:dup             
	//   52  108:sipush          256
	//   53  111:aconst_null     
	//   54  112:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   55  115:putstatic       #67  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY>
	//   56  118:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   57  121:dup             
	//   58  122:sipush          512
	//   59  125:aconst_null     
	//   60  126:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   61  129:putstatic       #69  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY>
	//   62  132:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   63  135:dup             
	//   64  136:sipush          1024
	//   65  139:aconst_null     
	//   66  140:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   67  143:putstatic       #71  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT>
	//   68  146:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   69  149:dup             
	//   70  150:sipush          2048
	//   71  153:aconst_null     
	//   72  154:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   73  157:putstatic       #73  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT>
	//   74  160:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   75  163:dup             
	//   76  164:sipush          4096
	//   77  167:aconst_null     
	//   78  168:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   79  171:putstatic       #75  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_FORWARD>
	//   80  174:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   81  177:dup             
	//   82  178:sipush          8192
	//   83  181:aconst_null     
	//   84  182:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   85  185:putstatic       #77  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_BACKWARD>
	//   86  188:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   87  191:dup             
	//   88  192:sipush          16384
	//   89  195:aconst_null     
	//   90  196:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   91  199:putstatic       #79  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_COPY>
	//   92  202:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   93  205:dup             
	//   94  206:ldc1            #80  <Int 32768>
	//   95  208:aconst_null     
	//   96  209:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   97  212:putstatic       #82  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PASTE>
	//   98  215:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   99  218:dup             
	//  100  219:ldc1            #83  <Int 0x10000>
	//  101  221:aconst_null     
	//  102  222:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  103  225:putstatic       #85  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CUT>
	//  104  228:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  105  231:dup             
	//  106  232:ldc1            #86  <Int 0x20000>
	//  107  234:aconst_null     
	//  108  235:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  109  238:putstatic       #88  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_SELECTION>
	//  110  241:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  111  244:dup             
	//  112  245:ldc1            #89  <Int 0x40000>
	//  113  247:aconst_null     
	//  114  248:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  115  251:putstatic       #91  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_EXPAND>
	//  116  254:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  117  257:dup             
	//  118  258:ldc1            #92  <Int 0x80000>
	//  119  260:aconst_null     
	//  120  261:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  121  264:putstatic       #94  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_COLLAPSE>
	//  122  267:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  123  270:dup             
	//  124  271:ldc1            #95  <Int 0x100000>
	//  125  273:aconst_null     
	//  126  274:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  127  277:putstatic       #97  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_DISMISS>
	//  128  280:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  129  283:dup             
	//  130  284:ldc1            #98  <Int 0x200000>
	//  131  286:aconst_null     
	//  132  287:invokespecial   #49  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  133  290:putstatic       #100 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_TEXT>
		android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityaction;
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//* 134  293:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 135  296:bipush          23
	//* 136  298:icmplt          308
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
	//  137  301:getstatic       #111 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN>
	//  138  304:astore_0        
		else
	//* 139  305:goto            310
			accessibilityaction = null;
	//  140  308:aconst_null     
	//  141  309:astore_0        
		ACTION_SHOW_ON_SCREEN = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  142  310:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  143  313:dup             
	//  144  314:aload_0         
	//  145  315:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  146  318:putstatic       #116 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SHOW_ON_SCREEN>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//* 147  321:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 148  324:bipush          23
	//* 149  326:icmplt          336
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
	//  150  329:getstatic       #118 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION>
	//  151  332:astore_0        
		else
	//* 152  333:goto            338
			accessibilityaction = null;
	//  153  336:aconst_null     
	//  154  337:astore_0        
		ACTION_SCROLL_TO_POSITION = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  155  338:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  156  341:dup             
	//  157  342:aload_0         
	//  158  343:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  159  346:putstatic       #120 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_TO_POSITION>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//* 160  349:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 161  352:bipush          23
	//* 162  354:icmplt          364
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
	//  163  357:getstatic       #122 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP>
	//  164  360:astore_0        
		else
	//* 165  361:goto            366
			accessibilityaction = null;
	//  166  364:aconst_null     
	//  167  365:astore_0        
		ACTION_SCROLL_UP = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  168  366:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  169  369:dup             
	//  170  370:aload_0         
	//  171  371:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  172  374:putstatic       #124 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_UP>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//* 173  377:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 174  380:bipush          23
	//* 175  382:icmplt          392
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
	//  176  385:getstatic       #126 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT>
	//  177  388:astore_0        
		else
	//* 178  389:goto            394
			accessibilityaction = null;
	//  179  392:aconst_null     
	//  180  393:astore_0        
		ACTION_SCROLL_LEFT = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  181  394:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  182  397:dup             
	//  183  398:aload_0         
	//  184  399:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  185  402:putstatic       #128 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_LEFT>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//* 186  405:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 187  408:bipush          23
	//* 188  410:icmplt          420
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
	//  189  413:getstatic       #130 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN>
	//  190  416:astore_0        
		else
	//* 191  417:goto            422
			accessibilityaction = null;
	//  192  420:aconst_null     
	//  193  421:astore_0        
		ACTION_SCROLL_DOWN = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  194  422:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  195  425:dup             
	//  196  426:aload_0         
	//  197  427:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  198  430:putstatic       #132 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_DOWN>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//* 199  433:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 200  436:bipush          23
	//* 201  438:icmplt          448
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
	//  202  441:getstatic       #134 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT>
	//  203  444:astore_0        
		else
	//* 204  445:goto            450
			accessibilityaction = null;
	//  205  448:aconst_null     
	//  206  449:astore_0        
		ACTION_SCROLL_RIGHT = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  207  450:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  208  453:dup             
	//  209  454:aload_0         
	//  210  455:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  211  458:putstatic       #136 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_RIGHT>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//* 212  461:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 213  464:bipush          23
	//* 214  466:icmplt          476
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
	//  215  469:getstatic       #138 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK>
	//  216  472:astore_0        
		else
	//* 217  473:goto            478
			accessibilityaction = null;
	//  218  476:aconst_null     
	//  219  477:astore_0        
		ACTION_CONTEXT_CLICK = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  220  478:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  221  481:dup             
	//  222  482:aload_0         
	//  223  483:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  224  486:putstatic       #140 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CONTEXT_CLICK>
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//* 225  489:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 226  492:bipush          24
	//* 227  494:icmplt          504
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
	//  228  497:getstatic       #142 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS>
	//  229  500:astore_0        
		else
	//* 230  501:goto            506
			accessibilityaction = null;
	//  231  504:aconst_null     
	//  232  505:astore_0        
		ACTION_SET_PROGRESS = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  233  506:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  234  509:dup             
	//  235  510:aload_0         
	//  236  511:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  237  514:putstatic       #144 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_PROGRESS>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//* 238  517:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 239  520:bipush          26
	//* 240  522:icmplt          532
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
	//  241  525:getstatic       #146 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_MOVE_WINDOW>
	//  242  528:astore_0        
		else
	//* 243  529:goto            534
			accessibilityaction = null;
	//  244  532:aconst_null     
	//  245  533:astore_0        
		ACTION_MOVE_WINDOW = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  246  534:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  247  537:dup             
	//  248  538:aload_0         
	//  249  539:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  250  542:putstatic       #148 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_MOVE_WINDOW>
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//* 251  545:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 252  548:bipush          28
	//* 253  550:icmplt          560
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
	//  254  553:getstatic       #150 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TOOLTIP>
	//  255  556:astore_0        
		else
	//* 256  557:goto            562
			accessibilityaction = null;
	//  257  560:aconst_null     
	//  258  561:astore_0        
		ACTION_SHOW_TOOLTIP = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  259  562:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  260  565:dup             
	//  261  566:aload_0         
	//  262  567:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  263  570:putstatic       #152 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SHOW_TOOLTIP>
		accessibilityaction = ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) (obj));
	//  264  573:aload_1         
	//  265  574:astore_0        
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//* 266  575:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//* 267  578:bipush          28
	//* 268  580:icmplt          587
			accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
	//  269  583:getstatic       #154 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_HIDE_TOOLTIP>
	//  270  586:astore_0        
		ACTION_HIDE_TOOLTIP = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(((Object) (accessibilityaction)));
	//  271  587:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  272  590:dup             
	//  273  591:aload_0         
	//  274  592:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  275  595:putstatic       #156 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_HIDE_TOOLTIP>
	//* 276  598:return          
	}

	public AccessibilityNodeInfoCompat$AccessibilityActionCompat(int i, CharSequence charsequence)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          21
			charsequence = ((CharSequence) (new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i, charsequence)));
	//    3    8:new             #108 <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    4   11:dup             
	//    5   12:iload_1         
	//    6   13:aload_2         
	//    7   14:invokespecial   #158 <Method void android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction(int, CharSequence)>
	//    8   17:astore_2        
		else
	//*   9   18:goto            23
			charsequence = null;
	//   10   21:aconst_null     
	//   11   22:astore_2        
		this(((Object) (charsequence)));
	//   12   23:aload_0         
	//   13   24:aload_2         
	//   14   25:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//   15   28:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method void Object()>
		mAction = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #162 <Field Object mAction>
	//    5    9:return          
	}
}
