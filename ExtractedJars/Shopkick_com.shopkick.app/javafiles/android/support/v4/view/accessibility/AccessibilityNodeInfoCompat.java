// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.*;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityWindowInfoCompat

public class AccessibilityNodeInfoCompat
{
	public static class AccessibilityActionCompat
	{

		public int getId()
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)mAction).getId();
		//    3    8:aload_0         
		//    4    9:getfield        #162 <Field Object mAction>
		//    5   12:checkcast       #108 <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
		//    6   15:invokevirtual   #166 <Method int android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.getId()>
		//    7   18:ireturn         
			else
				return 0;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public CharSequence getLabel()
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #106 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)mAction).getLabel();
		//    3    8:aload_0         
		//    4    9:getfield        #162 <Field Object mAction>
		//    5   12:checkcast       #108 <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
		//    6   15:invokevirtual   #170 <Method CharSequence android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.getLabel()>
		//    7   18:areturn         
			else
				return null;
		//    8   19:aconst_null     
		//    9   20:areturn         
		}

		public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(64, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(128, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_CLICK = new AccessibilityActionCompat(16, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_COLLAPSE = new AccessibilityActionCompat(0x80000, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_CONTEXT_CLICK;
		public static final AccessibilityActionCompat ACTION_COPY = new AccessibilityActionCompat(16384, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_CUT = new AccessibilityActionCompat(0x10000, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_DISMISS = new AccessibilityActionCompat(0x100000, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_EXPAND = new AccessibilityActionCompat(0x40000, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_FOCUS = new AccessibilityActionCompat(1, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_HIDE_TOOLTIP;
		public static final AccessibilityActionCompat ACTION_LONG_CLICK = new AccessibilityActionCompat(32, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_MOVE_WINDOW;
		public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(256, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(1024, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_PASTE = new AccessibilityActionCompat(32768, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(512, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(2048, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(8192, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_SCROLL_DOWN;
		public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(4096, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_SCROLL_LEFT;
		public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT;
		public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION;
		public static final AccessibilityActionCompat ACTION_SCROLL_UP;
		public static final AccessibilityActionCompat ACTION_SELECT = new AccessibilityActionCompat(4, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_SET_PROGRESS;
		public static final AccessibilityActionCompat ACTION_SET_SELECTION = new AccessibilityActionCompat(0x20000, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_SET_TEXT = new AccessibilityActionCompat(0x200000, ((CharSequence) (null)));
		public static final AccessibilityActionCompat ACTION_SHOW_ON_SCREEN;
		public static final AccessibilityActionCompat ACTION_SHOW_TOOLTIP;
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
			ACTION_SHOW_ON_SCREEN = new AccessibilityActionCompat(((Object) (accessibilityaction)));
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
			ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(((Object) (accessibilityaction)));
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
			ACTION_SCROLL_UP = new AccessibilityActionCompat(((Object) (accessibilityaction)));
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
			ACTION_SCROLL_LEFT = new AccessibilityActionCompat(((Object) (accessibilityaction)));
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
			ACTION_SCROLL_DOWN = new AccessibilityActionCompat(((Object) (accessibilityaction)));
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
			ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(((Object) (accessibilityaction)));
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
			ACTION_CONTEXT_CLICK = new AccessibilityActionCompat(((Object) (accessibilityaction)));
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
			ACTION_SET_PROGRESS = new AccessibilityActionCompat(((Object) (accessibilityaction)));
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
			ACTION_MOVE_WINDOW = new AccessibilityActionCompat(((Object) (accessibilityaction)));
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
			ACTION_SHOW_TOOLTIP = new AccessibilityActionCompat(((Object) (accessibilityaction)));
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
			ACTION_HIDE_TOOLTIP = new AccessibilityActionCompat(((Object) (accessibilityaction)));
		//  271  587:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//  272  590:dup             
		//  273  591:aload_0         
		//  274  592:invokespecial   #114 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
		//  275  595:putstatic       #156 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_HIDE_TOOLTIP>
		//* 276  598:return          
		}

		public AccessibilityActionCompat(int i, CharSequence charsequence)
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

		AccessibilityActionCompat(Object obj)
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

	public static class CollectionInfoCompat
	{

		public static CollectionInfoCompat obtain(int i, int j, boolean flag)
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          22
				return new CollectionInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag))));
		//    3    8:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
		//    4   11:dup             
		//    5   12:iload_0         
		//    6   13:iload_1         
		//    7   14:iload_2         
		//    8   15:invokestatic    #36  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean)>
		//    9   18:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
		//   10   21:areturn         
			else
				return new CollectionInfoCompat(((Object) (null)));
		//   11   22:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
		//   12   25:dup             
		//   13   26:aconst_null     
		//   14   27:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
		//   15   30:areturn         
		}

		public static CollectionInfoCompat obtain(int i, int j, boolean flag, int k)
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          23
				return new CollectionInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag, k))));
		//    3    8:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
		//    4   11:dup             
		//    5   12:iload_0         
		//    6   13:iload_1         
		//    7   14:iload_2         
		//    8   15:iload_3         
		//    9   16:invokestatic    #42  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean, int)>
		//   10   19:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
		//   11   22:areturn         
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*  12   23:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*  13   26:bipush          19
		//*  14   28:icmplt          45
				return new CollectionInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag))));
		//   15   31:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
		//   16   34:dup             
		//   17   35:iload_0         
		//   18   36:iload_1         
		//   19   37:iload_2         
		//   20   38:invokestatic    #36  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean)>
		//   21   41:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
		//   22   44:areturn         
			else
				return new CollectionInfoCompat(((Object) (null)));
		//   23   45:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
		//   24   48:dup             
		//   25   49:aconst_null     
		//   26   50:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
		//   27   53:areturn         
		}

		public int getColumnCount()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)mInfo).getColumnCount();
		//    3    8:aload_0         
		//    4    9:getfield        #23  <Field Object mInfo>
		//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
		//    6   15:invokevirtual   #46  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getColumnCount()>
		//    7   18:ireturn         
			else
				return 0;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public int getRowCount()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)mInfo).getRowCount();
		//    3    8:aload_0         
		//    4    9:getfield        #23  <Field Object mInfo>
		//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
		//    6   15:invokevirtual   #49  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getRowCount()>
		//    7   18:ireturn         
			else
				return 0;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public int getSelectionMode()
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)mInfo).getSelectionMode();
		//    3    8:aload_0         
		//    4    9:getfield        #23  <Field Object mInfo>
		//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
		//    6   15:invokevirtual   #52  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getSelectionMode()>
		//    7   18:ireturn         
			else
				return 0;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public boolean isHierarchical()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)mInfo).isHierarchical();
		//    3    8:aload_0         
		//    4    9:getfield        #23  <Field Object mInfo>
		//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
		//    6   15:invokevirtual   #56  <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.isHierarchical()>
		//    7   18:ireturn         
			else
				return false;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public static final int SELECTION_MODE_MULTIPLE = 2;
		public static final int SELECTION_MODE_NONE = 0;
		public static final int SELECTION_MODE_SINGLE = 1;
		final Object mInfo;

		CollectionInfoCompat(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mInfo = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Object mInfo>
		//    5    9:return          
		}
	}

	public static class CollectionItemInfoCompat
	{

		public static CollectionItemInfoCompat obtain(int i, int j, int k, int l, boolean flag)
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          25
				return new CollectionItemInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag))));
		//    3    8:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
		//    4   11:dup             
		//    5   12:iload_0         
		//    6   13:iload_1         
		//    7   14:iload_2         
		//    8   15:iload_3         
		//    9   16:iload           4
		//   10   18:invokestatic    #30  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean)>
		//   11   21:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
		//   12   24:areturn         
			else
				return new CollectionItemInfoCompat(((Object) (null)));
		//   13   25:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
		//   14   28:dup             
		//   15   29:aconst_null     
		//   16   30:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
		//   17   33:areturn         
		}

		public static CollectionItemInfoCompat obtain(int i, int j, int k, int l, boolean flag, boolean flag1)
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          27
				return new CollectionItemInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, flag1))));
		//    3    8:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
		//    4   11:dup             
		//    5   12:iload_0         
		//    6   13:iload_1         
		//    7   14:iload_2         
		//    8   15:iload_3         
		//    9   16:iload           4
		//   10   18:iload           5
		//   11   20:invokestatic    #36  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean, boolean)>
		//   12   23:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
		//   13   26:areturn         
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*  14   27:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*  15   30:bipush          19
		//*  16   32:icmplt          52
				return new CollectionItemInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag))));
		//   17   35:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
		//   18   38:dup             
		//   19   39:iload_0         
		//   20   40:iload_1         
		//   21   41:iload_2         
		//   22   42:iload_3         
		//   23   43:iload           4
		//   24   45:invokestatic    #30  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean)>
		//   25   48:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
		//   26   51:areturn         
			else
				return new CollectionItemInfoCompat(((Object) (null)));
		//   27   52:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
		//   28   55:dup             
		//   29   56:aconst_null     
		//   30   57:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
		//   31   60:areturn         
		}

		public int getColumnIndex()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)mInfo).getColumnIndex();
		//    3    8:aload_0         
		//    4    9:getfield        #16  <Field Object mInfo>
		//    5   12:checkcast       #27  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    6   15:invokevirtual   #40  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getColumnIndex()>
		//    7   18:ireturn         
			else
				return 0;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public int getColumnSpan()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)mInfo).getColumnSpan();
		//    3    8:aload_0         
		//    4    9:getfield        #16  <Field Object mInfo>
		//    5   12:checkcast       #27  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    6   15:invokevirtual   #43  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getColumnSpan()>
		//    7   18:ireturn         
			else
				return 0;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public int getRowIndex()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)mInfo).getRowIndex();
		//    3    8:aload_0         
		//    4    9:getfield        #16  <Field Object mInfo>
		//    5   12:checkcast       #27  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    6   15:invokevirtual   #46  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getRowIndex()>
		//    7   18:ireturn         
			else
				return 0;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public int getRowSpan()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)mInfo).getRowSpan();
		//    3    8:aload_0         
		//    4    9:getfield        #16  <Field Object mInfo>
		//    5   12:checkcast       #27  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    6   15:invokevirtual   #49  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getRowSpan()>
		//    7   18:ireturn         
			else
				return 0;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public boolean isHeading()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)mInfo).isHeading();
		//    3    8:aload_0         
		//    4    9:getfield        #16  <Field Object mInfo>
		//    5   12:checkcast       #27  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    6   15:invokevirtual   #53  <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.isHeading()>
		//    7   18:ireturn         
			else
				return false;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public boolean isSelected()
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)mInfo).isSelected();
		//    3    8:aload_0         
		//    4    9:getfield        #16  <Field Object mInfo>
		//    5   12:checkcast       #27  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    6   15:invokevirtual   #56  <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.isSelected()>
		//    7   18:ireturn         
			else
				return false;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		final Object mInfo;

		CollectionItemInfoCompat(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			mInfo = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field Object mInfo>
		//    5    9:return          
		}
	}

	public static class RangeInfoCompat
	{

		public static RangeInfoCompat obtain(int i, float f, float f1, float f2)
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          23
				return new RangeInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(i, f, f1, f2))));
		//    3    8:new             #2   <Class AccessibilityNodeInfoCompat$RangeInfoCompat>
		//    4   11:dup             
		//    5   12:iload_0         
		//    6   13:fload_1         
		//    7   14:fload_2         
		//    8   15:fload_3         
		//    9   16:invokestatic    #36  <Method android.view.accessibility.AccessibilityNodeInfo$RangeInfo android.view.accessibility.AccessibilityNodeInfo$RangeInfo.obtain(int, float, float, float)>
		//   10   19:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$RangeInfoCompat(Object)>
		//   11   22:areturn         
			else
				return new RangeInfoCompat(((Object) (null)));
		//   12   23:new             #2   <Class AccessibilityNodeInfoCompat$RangeInfoCompat>
		//   13   26:dup             
		//   14   27:aconst_null     
		//   15   28:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$RangeInfoCompat(Object)>
		//   16   31:areturn         
		}

		public float getCurrent()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)mInfo).getCurrent();
		//    3    8:aload_0         
		//    4    9:getfield        #23  <Field Object mInfo>
		//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    6   15:invokevirtual   #42  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getCurrent()>
		//    7   18:freturn         
			else
				return 0.0F;
		//    8   19:fconst_0        
		//    9   20:freturn         
		}

		public float getMax()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)mInfo).getMax();
		//    3    8:aload_0         
		//    4    9:getfield        #23  <Field Object mInfo>
		//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    6   15:invokevirtual   #45  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getMax()>
		//    7   18:freturn         
			else
				return 0.0F;
		//    8   19:fconst_0        
		//    9   20:freturn         
		}

		public float getMin()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)mInfo).getMin();
		//    3    8:aload_0         
		//    4    9:getfield        #23  <Field Object mInfo>
		//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    6   15:invokevirtual   #48  <Method float android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getMin()>
		//    7   18:freturn         
			else
				return 0.0F;
		//    8   19:fconst_0        
		//    9   20:freturn         
		}

		public int getType()
		{
			if(android.os.Build.VERSION.SDK_INT >= 19)
		//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          19
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)mInfo).getType();
		//    3    8:aload_0         
		//    4    9:getfield        #23  <Field Object mInfo>
		//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
		//    6   15:invokevirtual   #52  <Method int android.view.accessibility.AccessibilityNodeInfo$RangeInfo.getType()>
		//    7   18:ireturn         
			else
				return 0;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public static final int RANGE_TYPE_FLOAT = 1;
		public static final int RANGE_TYPE_INT = 0;
		public static final int RANGE_TYPE_PERCENT = 2;
		final Object mInfo;

		RangeInfoCompat(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mInfo = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Object mInfo>
		//    5    9:return          
		}
	}


	private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilitynodeinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void Object()>
		mParentVirtualDescendantId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #126 <Field int mParentVirtualDescendantId>
		mInfo = accessibilitynodeinfo;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    8   14:return          
	}

	public AccessibilityNodeInfoCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void Object()>
		mParentVirtualDescendantId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #126 <Field int mParentVirtualDescendantId>
		mInfo = (AccessibilityNodeInfo)obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:checkcast       #133 <Class AccessibilityNodeInfo>
	//    8   14:putfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    9   17:return          
	}

	private static String getActionSymbolicName(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:lookupswitch    18: default 156
	//	               1: 210
	//	               2: 207
	//	               4: 204
	//	               8: 201
	//	               16: 198
	//	               32: 195
	//	               64: 192
	//	               128: 189
	//	               256: 186
	//	               512: 183
	//	               1024: 180
	//	               2048: 177
	//	               4096: 174
	//	               8192: 171
	//	               16384: 168
	//	               32768: 165
	//	               65536: 162
	//	               131072: 159
		default:
			return "ACTION_UNKNOWN";
	//    2  156:ldc1            #138 <String "ACTION_UNKNOWN">
	//    3  158:areturn         

		case 131072: 
			return "ACTION_SET_SELECTION";
	//    4  159:ldc1            #139 <String "ACTION_SET_SELECTION">
	//    5  161:areturn         

		case 65536: 
			return "ACTION_CUT";
	//    6  162:ldc1            #140 <String "ACTION_CUT">
	//    7  164:areturn         

		case 32768: 
			return "ACTION_PASTE";
	//    8  165:ldc1            #141 <String "ACTION_PASTE">
	//    9  167:areturn         

		case 16384: 
			return "ACTION_COPY";
	//   10  168:ldc1            #142 <String "ACTION_COPY">
	//   11  170:areturn         

		case 8192: 
			return "ACTION_SCROLL_BACKWARD";
	//   12  171:ldc1            #143 <String "ACTION_SCROLL_BACKWARD">
	//   13  173:areturn         

		case 4096: 
			return "ACTION_SCROLL_FORWARD";
	//   14  174:ldc1            #144 <String "ACTION_SCROLL_FORWARD">
	//   15  176:areturn         

		case 2048: 
			return "ACTION_PREVIOUS_HTML_ELEMENT";
	//   16  177:ldc1            #145 <String "ACTION_PREVIOUS_HTML_ELEMENT">
	//   17  179:areturn         

		case 1024: 
			return "ACTION_NEXT_HTML_ELEMENT";
	//   18  180:ldc1            #146 <String "ACTION_NEXT_HTML_ELEMENT">
	//   19  182:areturn         

		case 512: 
			return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
	//   20  183:ldc1            #147 <String "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY">
	//   21  185:areturn         

		case 256: 
			return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
	//   22  186:ldc1            #148 <String "ACTION_NEXT_AT_MOVEMENT_GRANULARITY">
	//   23  188:areturn         

		case 128: 
			return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
	//   24  189:ldc1            #149 <String "ACTION_CLEAR_ACCESSIBILITY_FOCUS">
	//   25  191:areturn         

		case 64: // '@'
			return "ACTION_ACCESSIBILITY_FOCUS";
	//   26  192:ldc1            #150 <String "ACTION_ACCESSIBILITY_FOCUS">
	//   27  194:areturn         

		case 32: // ' '
			return "ACTION_LONG_CLICK";
	//   28  195:ldc1            #151 <String "ACTION_LONG_CLICK">
	//   29  197:areturn         

		case 16: // '\020'
			return "ACTION_CLICK";
	//   30  198:ldc1            #152 <String "ACTION_CLICK">
	//   31  200:areturn         

		case 8: // '\b'
			return "ACTION_CLEAR_SELECTION";
	//   32  201:ldc1            #153 <String "ACTION_CLEAR_SELECTION">
	//   33  203:areturn         

		case 4: // '\004'
			return "ACTION_SELECT";
	//   34  204:ldc1            #154 <String "ACTION_SELECT">
	//   35  206:areturn         

		case 2: // '\002'
			return "ACTION_CLEAR_FOCUS";
	//   36  207:ldc1            #155 <String "ACTION_CLEAR_FOCUS">
	//   37  209:areturn         

		case 1: // '\001'
			return "ACTION_FOCUS";
	//   38  210:ldc1            #156 <String "ACTION_FOCUS">
	//   39  212:areturn         
		}
	}

	private boolean getBooleanProperty(int i)
	{
		Bundle bundle = getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method Bundle getExtras()>
	//    2    4:astore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(bundle == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if((bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i)
	//*   9   13:aload_3         
	//*  10   14:ldc1            #92  <String "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY">
	//*  11   16:iconst_0        
	//*  12   17:invokevirtual   #168 <Method int Bundle.getInt(String, int)>
	//*  13   20:iload_1         
	//*  14   21:iand            
	//*  15   22:iload_1         
	//*  16   23:icmpne          28
			flag = true;
	//   17   26:iconst_1        
	//   18   27:istore_2        
		return flag;
	//   19   28:iload_2         
	//   20   29:ireturn         
	}

	public static AccessibilityNodeInfoCompat obtain()
	{
		return wrap(AccessibilityNodeInfo.obtain());
	//    0    0:invokestatic    #173 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain()>
	//    1    3:invokestatic    #177 <Method AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo)>
	//    2    6:areturn         
	}

	public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		return wrap(AccessibilityNodeInfo.obtain(accessibilitynodeinfocompat.mInfo));
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokestatic    #181 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(AccessibilityNodeInfo)>
	//    3    7:invokestatic    #177 <Method AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo)>
	//    4   10:areturn         
	}

	public static AccessibilityNodeInfoCompat obtain(View view)
	{
		return wrap(AccessibilityNodeInfo.obtain(view));
	//    0    0:aload_0         
	//    1    1:invokestatic    #185 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(View)>
	//    2    4:invokestatic    #177 <Method AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo)>
	//    3    7:areturn         
	}

	public static AccessibilityNodeInfoCompat obtain(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          17
			return wrapNonNullInstance(((Object) (AccessibilityNodeInfo.obtain(view, i))));
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #194 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(View, int)>
	//    6   13:invokestatic    #198 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    7   16:areturn         
		else
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
	}

	private void setBooleanProperty(int i, boolean flag)
	{
		Bundle bundle = getExtras();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method Bundle getExtras()>
	//    2    4:astore          5
		if(bundle != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          45
		{
			int k = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
	//    5   11:aload           5
	//    6   13:ldc1            #92  <String "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY">
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #168 <Method int Bundle.getInt(String, int)>
	//    9   19:istore          4
			int j;
			if(flag)
	//*  10   21:iload_2         
	//*  11   22:ifeq            30
				j = i;
	//   12   25:iload_1         
	//   13   26:istore_3        
			else
	//*  14   27:goto            32
				j = 0;
	//   15   30:iconst_0        
	//   16   31:istore_3        
			bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", j | k & i);
	//   17   32:aload           5
	//   18   34:ldc1            #92  <String "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY">
	//   19   36:iload_3         
	//   20   37:iload           4
	//   21   39:iload_1         
	//   22   40:iand            
	//   23   41:ior             
	//   24   42:invokevirtual   #204 <Method void Bundle.putInt(String, int)>
		}
	//   25   45:return          
	}

	public static AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return new AccessibilityNodeInfoCompat(accessibilitynodeinfo);
	//    0    0:new             #2   <Class AccessibilityNodeInfoCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #207 <Method void AccessibilityNodeInfoCompat(AccessibilityNodeInfo)>
	//    4    8:areturn         
	}

	static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			return new AccessibilityNodeInfoCompat(obj);
	//    2    4:new             #2   <Class AccessibilityNodeInfoCompat>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #210 <Method void AccessibilityNodeInfoCompat(Object)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public void addAction(int i)
	{
		mInfo.addAction(i);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #214 <Method void AccessibilityNodeInfo.addAction(int)>
	//    4    8:return          
	}

	public void addAction(AccessibilityActionCompat accessibilityactioncompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          22
			mInfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)accessibilityactioncompat.mAction);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:getfield        #219 <Field Object AccessibilityNodeInfoCompat$AccessibilityActionCompat.mAction>
	//    7   16:checkcast       #221 <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    8   19:invokevirtual   #224 <Method void AccessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
	//    9   22:return          
	}

	public void addChild(View view)
	{
		mInfo.addChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #228 <Method void AccessibilityNodeInfo.addChild(View)>
	//    4    8:return          
	}

	public void addChild(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          17
			mInfo.addChild(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #231 <Method void AccessibilityNodeInfo.addChild(View, int)>
	//    8   17:return          
	}

	public boolean canOpenPopup()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.canOpenPopup();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #235 <Method boolean AccessibilityNodeInfo.canOpenPopup()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #241 <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #241 <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((AccessibilityNodeInfoCompat)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AccessibilityNodeInfoCompat>
	//   18   30:astore_1        
		AccessibilityNodeInfo accessibilitynodeinfo = mInfo;
	//   19   31:aload_0         
	//   20   32:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//   21   35:astore_2        
		if(accessibilitynodeinfo == null)
	//*  22   36:aload_2         
	//*  23   37:ifnonnull       49
		{
			if(((AccessibilityNodeInfoCompat) (obj)).mInfo != null)
	//*  24   40:aload_1         
	//*  25   41:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//*  26   44:ifnull          62
				return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
		} else
		if(!accessibilitynodeinfo.equals(((Object) (((AccessibilityNodeInfoCompat) (obj)).mInfo))))
	//*  29   49:aload_2         
	//*  30   50:aload_1         
	//*  31   51:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//*  32   54:invokevirtual   #243 <Method boolean AccessibilityNodeInfo.equals(Object)>
	//*  33   57:ifne            62
			return false;
	//   34   60:iconst_0        
	//   35   61:ireturn         
		return true;
	//   36   62:iconst_1        
	//   37   63:ireturn         
	}

	public List findAccessibilityNodeInfosByText(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #247 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #248 <Method void ArrayList()>
	//    3    7:astore          4
		s = ((String) (mInfo.findAccessibilityNodeInfosByText(s)));
	//    4    9:aload_0         
	//    5   10:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #250 <Method List AccessibilityNodeInfo.findAccessibilityNodeInfosByText(String)>
	//    8   17:astore_1        
		int j = ((List) (s)).size();
	//    9   18:aload_1         
	//   10   19:invokeinterface #256 <Method int List.size()>
	//   11   24:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   25:iconst_0        
	//*  13   26:istore_2        
	//*  14   27:iload_2         
	//*  15   28:iload_3         
	//*  16   29:icmpge          60
			((List) (arraylist)).add(((Object) (wrap((AccessibilityNodeInfo)((List) (s)).get(i)))));
	//   17   32:aload           4
	//   18   34:aload_1         
	//   19   35:iload_2         
	//   20   36:invokeinterface #260 <Method Object List.get(int)>
	//   21   41:checkcast       #133 <Class AccessibilityNodeInfo>
	//   22   44:invokestatic    #177 <Method AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo)>
	//   23   47:invokeinterface #263 <Method boolean List.add(Object)>
	//   24   52:pop             

	//   25   53:iload_2         
	//   26   54:iconst_1        
	//   27   55:iadd            
	//   28   56:istore_2        
	//*  29   57:goto            27
		return ((List) (arraylist));
	//   30   60:aload           4
	//   31   62:areturn         
	}

	public List findAccessibilityNodeInfosByViewId(String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          65
		{
			Object obj = ((Object) (mInfo.findAccessibilityNodeInfosByViewId(s)));
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #268 <Method List AccessibilityNodeInfo.findAccessibilityNodeInfosByViewId(String)>
	//    7   16:astore_2        
			s = ((String) (new ArrayList()));
	//    8   17:new             #247 <Class ArrayList>
	//    9   20:dup             
	//   10   21:invokespecial   #248 <Method void ArrayList()>
	//   11   24:astore_1        
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (s)).add(((Object) (wrap((AccessibilityNodeInfo)((Iterator) (obj)).next())))));
	//   12   25:aload_2         
	//   13   26:invokeinterface #272 <Method Iterator List.iterator()>
	//   14   31:astore_2        
	//   15   32:aload_2         
	//   16   33:invokeinterface #277 <Method boolean Iterator.hasNext()>
	//   17   38:ifeq            63
	//   18   41:aload_1         
	//   19   42:aload_2         
	//   20   43:invokeinterface #281 <Method Object Iterator.next()>
	//   21   48:checkcast       #133 <Class AccessibilityNodeInfo>
	//   22   51:invokestatic    #177 <Method AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo)>
	//   23   54:invokeinterface #263 <Method boolean List.add(Object)>
	//   24   59:pop             
	//*  25   60:goto            32
			return ((List) (s));
	//   26   63:aload_1         
	//   27   64:areturn         
		} else
		{
			return Collections.emptyList();
	//   28   65:invokestatic    #287 <Method List Collections.emptyList()>
	//   29   68:areturn         
		}
	}

	public AccessibilityNodeInfoCompat findFocus(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          20
			return wrapNonNullInstance(((Object) (mInfo.findFocus(i))));
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #292 <Method AccessibilityNodeInfo AccessibilityNodeInfo.findFocus(int)>
	//    7   16:invokestatic    #198 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    8   19:areturn         
		else
			return null;
	//    9   20:aconst_null     
	//   10   21:areturn         
	}

	public AccessibilityNodeInfoCompat focusSearch(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          20
			return wrapNonNullInstance(((Object) (mInfo.focusSearch(i))));
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #295 <Method AccessibilityNodeInfo AccessibilityNodeInfo.focusSearch(int)>
	//    7   16:invokestatic    #198 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    8   19:areturn         
		else
			return null;
	//    9   20:aconst_null     
	//   10   21:areturn         
	}

	public List getActionList()
	{
		List list;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			list = mInfo.getActionList();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #298 <Method List AccessibilityNodeInfo.getActionList()>
	//    6   15:astore_3        
		else
	//*   7   16:goto            21
			list = null;
	//    8   19:aconst_null     
	//    9   20:astore_3        
		if(list != null)
	//*  10   21:aload_3         
	//*  11   22:ifnull          80
		{
			ArrayList arraylist = new ArrayList();
	//   12   25:new             #247 <Class ArrayList>
	//   13   28:dup             
	//   14   29:invokespecial   #248 <Method void ArrayList()>
	//   15   32:astore          4
			int j = list.size();
	//   16   34:aload_3         
	//   17   35:invokeinterface #256 <Method int List.size()>
	//   18   40:istore_2        
			for(int i = 0; i < j; i++)
	//*  19   41:iconst_0        
	//*  20   42:istore_1        
	//*  21   43:iload_1         
	//*  22   44:iload_2         
	//*  23   45:icmpge          77
				((List) (arraylist)).add(((Object) (new AccessibilityActionCompat(list.get(i)))));
	//   24   48:aload           4
	//   25   50:new             #6   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   26   53:dup             
	//   27   54:aload_3         
	//   28   55:iload_1         
	//   29   56:invokeinterface #260 <Method Object List.get(int)>
	//   30   61:invokespecial   #299 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//   31   64:invokeinterface #263 <Method boolean List.add(Object)>
	//   32   69:pop             

	//   33   70:iload_1         
	//   34   71:iconst_1        
	//   35   72:iadd            
	//   36   73:istore_1        
	//*  37   74:goto            43
			return ((List) (arraylist));
	//   38   77:aload           4
	//   39   79:areturn         
		} else
		{
			return Collections.emptyList();
	//   40   80:invokestatic    #287 <Method List Collections.emptyList()>
	//   41   83:areturn         
		}
	}

	public int getActions()
	{
		return mInfo.getActions();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #303 <Method int AccessibilityNodeInfo.getActions()>
	//    3    7:ireturn         
	}

	public void getBoundsInParent(Rect rect)
	{
		mInfo.getBoundsInParent(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #307 <Method void AccessibilityNodeInfo.getBoundsInParent(Rect)>
	//    4    8:return          
	}

	public void getBoundsInScreen(Rect rect)
	{
		mInfo.getBoundsInScreen(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #310 <Method void AccessibilityNodeInfo.getBoundsInScreen(Rect)>
	//    4    8:return          
	}

	public AccessibilityNodeInfoCompat getChild(int i)
	{
		return wrapNonNullInstance(((Object) (mInfo.getChild(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #313 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getChild(int)>
	//    4    8:invokestatic    #198 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    5   11:areturn         
	}

	public int getChildCount()
	{
		return mInfo.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #316 <Method int AccessibilityNodeInfo.getChildCount()>
	//    3    7:ireturn         
	}

	public CharSequence getClassName()
	{
		return mInfo.getClassName();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #320 <Method CharSequence AccessibilityNodeInfo.getClassName()>
	//    3    7:areturn         
	}

	public CollectionInfoCompat getCollectionInfo()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          29
		{
			android.view.accessibility.AccessibilityNodeInfo.CollectionInfo collectioninfo = mInfo.getCollectionInfo();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #325 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo AccessibilityNodeInfo.getCollectionInfo()>
	//    6   15:astore_1        
			if(collectioninfo != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          29
				return new CollectionInfoCompat(((Object) (collectioninfo)));
	//    9   20:new             #9   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//   10   23:dup             
	//   11   24:aload_1         
	//   12   25:invokespecial   #326 <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//   13   28:areturn         
		}
		return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
	}

	public CollectionItemInfoCompat getCollectionItemInfo()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          29
		{
			android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo collectioniteminfo = mInfo.getCollectionItemInfo();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #331 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo AccessibilityNodeInfo.getCollectionItemInfo()>
	//    6   15:astore_1        
			if(collectioniteminfo != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          29
				return new CollectionItemInfoCompat(((Object) (collectioniteminfo)));
	//    9   20:new             #12  <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
	//   10   23:dup             
	//   11   24:aload_1         
	//   12   25:invokespecial   #332 <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
	//   13   28:areturn         
		}
		return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
	}

	public CharSequence getContentDescription()
	{
		return mInfo.getContentDescription();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #335 <Method CharSequence AccessibilityNodeInfo.getContentDescription()>
	//    3    7:areturn         
	}

	public int getDrawingOrder()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			return mInfo.getDrawingOrder();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #338 <Method int AccessibilityNodeInfo.getDrawingOrder()>
	//    6   15:ireturn         
		else
			return 0;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public CharSequence getError()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			return mInfo.getError();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #341 <Method CharSequence AccessibilityNodeInfo.getError()>
	//    6   15:areturn         
		else
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
	}

	public Bundle getExtras()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.getExtras();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #342 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//    6   15:areturn         
		else
			return new Bundle();
	//    7   16:new             #164 <Class Bundle>
	//    8   19:dup             
	//    9   20:invokespecial   #343 <Method void Bundle()>
	//   10   23:areturn         
	}

	public CharSequence getHintText()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          16
			return mInfo.getHintText();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #347 <Method CharSequence AccessibilityNodeInfo.getHintText()>
	//    6   15:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   7   16:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   19:bipush          19
	//*   9   21:icmplt          37
			return mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
	//   10   24:aload_0         
	//   11   25:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//   12   28:invokevirtual   #342 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//   13   31:ldc1            #98  <String "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY">
	//   14   33:invokevirtual   #351 <Method CharSequence Bundle.getCharSequence(String)>
	//   15   36:areturn         
		else
			return null;
	//   16   37:aconst_null     
	//   17   38:areturn         
	}

	public Object getInfo()
	{
		return ((Object) (mInfo));
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:areturn         
	}

	public int getInputType()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.getInputType();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #356 <Method int AccessibilityNodeInfo.getInputType()>
	//    6   15:ireturn         
		else
			return 0;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public AccessibilityNodeInfoCompat getLabelFor()
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          19
			return wrapNonNullInstance(((Object) (mInfo.getLabelFor())));
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #359 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getLabelFor()>
	//    6   15:invokestatic    #198 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public AccessibilityNodeInfoCompat getLabeledBy()
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          19
			return wrapNonNullInstance(((Object) (mInfo.getLabeledBy())));
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #362 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getLabeledBy()>
	//    6   15:invokestatic    #198 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public int getLiveRegion()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.getLiveRegion();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #365 <Method int AccessibilityNodeInfo.getLiveRegion()>
	//    6   15:ireturn         
		else
			return 0;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public int getMaxTextLength()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			return mInfo.getMaxTextLength();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #368 <Method int AccessibilityNodeInfo.getMaxTextLength()>
	//    6   15:ireturn         
		else
			return -1;
	//    7   16:iconst_m1       
	//    8   17:ireturn         
	}

	public int getMovementGranularities()
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			return mInfo.getMovementGranularities();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #371 <Method int AccessibilityNodeInfo.getMovementGranularities()>
	//    6   15:ireturn         
		else
			return 0;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public CharSequence getPackageName()
	{
		return mInfo.getPackageName();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #374 <Method CharSequence AccessibilityNodeInfo.getPackageName()>
	//    3    7:areturn         
	}

	public CharSequence getPaneTitle()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          16
			return mInfo.getPaneTitle();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #377 <Method CharSequence AccessibilityNodeInfo.getPaneTitle()>
	//    6   15:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   7   16:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   19:bipush          19
	//*   9   21:icmplt          37
			return mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
	//   10   24:aload_0         
	//   11   25:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//   12   28:invokevirtual   #342 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//   13   31:ldc1            #106 <String "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY">
	//   14   33:invokevirtual   #351 <Method CharSequence Bundle.getCharSequence(String)>
	//   15   36:areturn         
		else
			return null;
	//   16   37:aconst_null     
	//   17   38:areturn         
	}

	public AccessibilityNodeInfoCompat getParent()
	{
		return wrapNonNullInstance(((Object) (mInfo.getParent())));
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #380 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getParent()>
	//    3    7:invokestatic    #198 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    4   10:areturn         
	}

	public RangeInfoCompat getRangeInfo()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          29
		{
			android.view.accessibility.AccessibilityNodeInfo.RangeInfo rangeinfo = mInfo.getRangeInfo();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #385 <Method android.view.accessibility.AccessibilityNodeInfo$RangeInfo AccessibilityNodeInfo.getRangeInfo()>
	//    6   15:astore_1        
			if(rangeinfo != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          29
				return new RangeInfoCompat(((Object) (rangeinfo)));
	//    9   20:new             #15  <Class AccessibilityNodeInfoCompat$RangeInfoCompat>
	//   10   23:dup             
	//   11   24:aload_1         
	//   12   25:invokespecial   #386 <Method void AccessibilityNodeInfoCompat$RangeInfoCompat(Object)>
	//   13   28:areturn         
		}
		return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
	}

	public CharSequence getRoleDescription()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          21
			return mInfo.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #342 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//    6   15:ldc1            #109 <String "AccessibilityNodeInfo.roleDescription">
	//    7   17:invokevirtual   #351 <Method CharSequence Bundle.getCharSequence(String)>
	//    8   20:areturn         
		else
			return null;
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	public CharSequence getText()
	{
		return mInfo.getText();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #390 <Method CharSequence AccessibilityNodeInfo.getText()>
	//    3    7:areturn         
	}

	public int getTextSelectionEnd()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return mInfo.getTextSelectionEnd();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #393 <Method int AccessibilityNodeInfo.getTextSelectionEnd()>
	//    6   15:ireturn         
		else
			return -1;
	//    7   16:iconst_m1       
	//    8   17:ireturn         
	}

	public int getTextSelectionStart()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return mInfo.getTextSelectionStart();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #396 <Method int AccessibilityNodeInfo.getTextSelectionStart()>
	//    6   15:ireturn         
		else
			return -1;
	//    7   16:iconst_m1       
	//    8   17:ireturn         
	}

	public CharSequence getTooltipText()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          16
			return mInfo.getTooltipText();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #399 <Method CharSequence AccessibilityNodeInfo.getTooltipText()>
	//    6   15:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   7   16:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   19:bipush          19
	//*   9   21:icmplt          37
			return mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
	//   10   24:aload_0         
	//   11   25:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//   12   28:invokevirtual   #342 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//   13   31:ldc1            #112 <String "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY">
	//   14   33:invokevirtual   #351 <Method CharSequence Bundle.getCharSequence(String)>
	//   15   36:areturn         
		else
			return null;
	//   16   37:aconst_null     
	//   17   38:areturn         
	}

	public AccessibilityNodeInfoCompat getTraversalAfter()
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          19
			return wrapNonNullInstance(((Object) (mInfo.getTraversalAfter())));
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #402 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getTraversalAfter()>
	//    6   15:invokestatic    #198 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public AccessibilityNodeInfoCompat getTraversalBefore()
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          19
			return wrapNonNullInstance(((Object) (mInfo.getTraversalBefore())));
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #405 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getTraversalBefore()>
	//    6   15:invokestatic    #198 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public String getViewIdResourceName()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return mInfo.getViewIdResourceName();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #409 <Method String AccessibilityNodeInfo.getViewIdResourceName()>
	//    6   15:areturn         
		else
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
	}

	public AccessibilityWindowInfoCompat getWindow()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return AccessibilityWindowInfoCompat.wrapNonNullInstance(((Object) (mInfo.getWindow())));
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #414 <Method android.view.accessibility.AccessibilityWindowInfo AccessibilityNodeInfo.getWindow()>
	//    6   15:invokestatic    #419 <Method AccessibilityWindowInfoCompat AccessibilityWindowInfoCompat.wrapNonNullInstance(Object)>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public int getWindowId()
	{
		return mInfo.getWindowId();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #422 <Method int AccessibilityNodeInfo.getWindowId()>
	//    3    7:ireturn         
	}

	public int hashCode()
	{
		AccessibilityNodeInfo accessibilitynodeinfo = mInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:astore_1        
		if(accessibilitynodeinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return accessibilitynodeinfo.hashCode();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #425 <Method int AccessibilityNodeInfo.hashCode()>
	//    9   15:ireturn         
	}

	public boolean isAccessibilityFocused()
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			return mInfo.isAccessibilityFocused();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #428 <Method boolean AccessibilityNodeInfo.isAccessibilityFocused()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean isCheckable()
	{
		return mInfo.isCheckable();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #431 <Method boolean AccessibilityNodeInfo.isCheckable()>
	//    3    7:ireturn         
	}

	public boolean isChecked()
	{
		return mInfo.isChecked();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #434 <Method boolean AccessibilityNodeInfo.isChecked()>
	//    3    7:ireturn         
	}

	public boolean isClickable()
	{
		return mInfo.isClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #437 <Method boolean AccessibilityNodeInfo.isClickable()>
	//    3    7:ireturn         
	}

	public boolean isContentInvalid()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.isContentInvalid();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #440 <Method boolean AccessibilityNodeInfo.isContentInvalid()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean isContextClickable()
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          16
			return mInfo.isContextClickable();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #443 <Method boolean AccessibilityNodeInfo.isContextClickable()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean isDismissable()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.isDismissable();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #446 <Method boolean AccessibilityNodeInfo.isDismissable()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean isEditable()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return mInfo.isEditable();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #449 <Method boolean AccessibilityNodeInfo.isEditable()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean isEnabled()
	{
		return mInfo.isEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #452 <Method boolean AccessibilityNodeInfo.isEnabled()>
	//    3    7:ireturn         
	}

	public boolean isFocusable()
	{
		return mInfo.isFocusable();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #455 <Method boolean AccessibilityNodeInfo.isFocusable()>
	//    3    7:ireturn         
	}

	public boolean isFocused()
	{
		return mInfo.isFocused();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #458 <Method boolean AccessibilityNodeInfo.isFocused()>
	//    3    7:ireturn         
	}

	public boolean isHeading()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          16
			return mInfo.isHeading();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #461 <Method boolean AccessibilityNodeInfo.isHeading()>
	//    6   15:ireturn         
		if(getBooleanProperty(2))
	//*   7   16:aload_0         
	//*   8   17:iconst_2        
	//*   9   18:invokespecial   #463 <Method boolean getBooleanProperty(int)>
	//*  10   21:ifeq            26
			return true;
	//   11   24:iconst_1        
	//   12   25:ireturn         
		CollectionItemInfoCompat collectioniteminfocompat = getCollectionItemInfo();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #465 <Method AccessibilityNodeInfoCompat$CollectionItemInfoCompat getCollectionItemInfo()>
	//   15   30:astore_1        
		return collectioniteminfocompat != null && collectioniteminfocompat.isHeading();
	//   16   31:aload_1         
	//   17   32:ifnull          44
	//   18   35:aload_1         
	//   19   36:invokevirtual   #466 <Method boolean AccessibilityNodeInfoCompat$CollectionItemInfoCompat.isHeading()>
	//   20   39:ifeq            44
	//   21   42:iconst_1        
	//   22   43:ireturn         
	//   23   44:iconst_0        
	//   24   45:ireturn         
	}

	public boolean isImportantForAccessibility()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			return mInfo.isImportantForAccessibility();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #469 <Method boolean AccessibilityNodeInfo.isImportantForAccessibility()>
	//    6   15:ireturn         
		else
			return true;
	//    7   16:iconst_1        
	//    8   17:ireturn         
	}

	public boolean isLongClickable()
	{
		return mInfo.isLongClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #472 <Method boolean AccessibilityNodeInfo.isLongClickable()>
	//    3    7:ireturn         
	}

	public boolean isMultiLine()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.isMultiLine();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #475 <Method boolean AccessibilityNodeInfo.isMultiLine()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean isPassword()
	{
		return mInfo.isPassword();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #478 <Method boolean AccessibilityNodeInfo.isPassword()>
	//    3    7:ireturn         
	}

	public boolean isScreenReaderFocusable()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          16
			return mInfo.isScreenReaderFocusable();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #481 <Method boolean AccessibilityNodeInfo.isScreenReaderFocusable()>
	//    6   15:ireturn         
		else
			return getBooleanProperty(1);
	//    7   16:aload_0         
	//    8   17:iconst_1        
	//    9   18:invokespecial   #463 <Method boolean getBooleanProperty(int)>
	//   10   21:ireturn         
	}

	public boolean isScrollable()
	{
		return mInfo.isScrollable();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #484 <Method boolean AccessibilityNodeInfo.isScrollable()>
	//    3    7:ireturn         
	}

	public boolean isSelected()
	{
		return mInfo.isSelected();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #487 <Method boolean AccessibilityNodeInfo.isSelected()>
	//    3    7:ireturn         
	}

	public boolean isShowingHintText()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          16
			return mInfo.isShowingHintText();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #490 <Method boolean AccessibilityNodeInfo.isShowingHintText()>
	//    6   15:ireturn         
		else
			return getBooleanProperty(4);
	//    7   16:aload_0         
	//    8   17:iconst_4        
	//    9   18:invokespecial   #463 <Method boolean getBooleanProperty(int)>
	//   10   21:ireturn         
	}

	public boolean isVisibleToUser()
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			return mInfo.isVisibleToUser();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #493 <Method boolean AccessibilityNodeInfo.isVisibleToUser()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean performAction(int i)
	{
		return mInfo.performAction(i);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #496 <Method boolean AccessibilityNodeInfo.performAction(int)>
	//    4    8:ireturn         
	}

	public boolean performAction(int i, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
			return mInfo.performAction(i, bundle);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:aload_2         
	//    7   14:invokevirtual   #499 <Method boolean AccessibilityNodeInfo.performAction(int, Bundle)>
	//    8   17:ireturn         
		else
			return false;
	//    9   18:iconst_0        
	//   10   19:ireturn         
	}

	public void recycle()
	{
		mInfo.recycle();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #502 <Method void AccessibilityNodeInfo.recycle()>
	//    3    7:return          
	}

	public boolean refresh()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return mInfo.refresh();
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #505 <Method boolean AccessibilityNodeInfo.refresh()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean removeAction(AccessibilityActionCompat accessibilityactioncompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          23
			return mInfo.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)accessibilityactioncompat.mAction);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:getfield        #219 <Field Object AccessibilityNodeInfoCompat$AccessibilityActionCompat.mAction>
	//    7   16:checkcast       #221 <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    8   19:invokevirtual   #510 <Method boolean AccessibilityNodeInfo.removeAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
	//    9   22:ireturn         
		else
			return false;
	//   10   23:iconst_0        
	//   11   24:ireturn         
	}

	public boolean removeChild(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
			return mInfo.removeChild(view);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #514 <Method boolean AccessibilityNodeInfo.removeChild(View)>
	//    7   16:ireturn         
		else
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
	}

	public boolean removeChild(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
			return mInfo.removeChild(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #517 <Method boolean AccessibilityNodeInfo.removeChild(View, int)>
	//    8   17:ireturn         
		else
			return false;
	//    9   18:iconst_0        
	//   10   19:ireturn         
	}

	public void setAccessibilityFocused(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			mInfo.setAccessibilityFocused(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #521 <Method void AccessibilityNodeInfo.setAccessibilityFocused(boolean)>
	//    7   16:return          
	}

	public void setBoundsInParent(Rect rect)
	{
		mInfo.setBoundsInParent(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #524 <Method void AccessibilityNodeInfo.setBoundsInParent(Rect)>
	//    4    8:return          
	}

	public void setBoundsInScreen(Rect rect)
	{
		mInfo.setBoundsInScreen(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #527 <Method void AccessibilityNodeInfo.setBoundsInScreen(Rect)>
	//    4    8:return          
	}

	public void setCanOpenPopup(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setCanOpenPopup(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #530 <Method void AccessibilityNodeInfo.setCanOpenPopup(boolean)>
	//    7   16:return          
	}

	public void setCheckable(boolean flag)
	{
		mInfo.setCheckable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #533 <Method void AccessibilityNodeInfo.setCheckable(boolean)>
	//    4    8:return          
	}

	public void setChecked(boolean flag)
	{
		mInfo.setChecked(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #536 <Method void AccessibilityNodeInfo.setChecked(boolean)>
	//    4    8:return          
	}

	public void setClassName(CharSequence charsequence)
	{
		mInfo.setClassName(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #540 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    4    8:return          
	}

	public void setClickable(boolean flag)
	{
		mInfo.setClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #543 <Method void AccessibilityNodeInfo.setClickable(boolean)>
	//    4    8:return          
	}

	public void setCollectionInfo(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          38
		{
			AccessibilityNodeInfo accessibilitynodeinfo = mInfo;
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:astore_2        
			if(obj == null)
	//*   6   13:aload_1         
	//*   7   14:ifnonnull       22
				obj = null;
	//    8   17:aconst_null     
	//    9   18:astore_1        
			else
	//*  10   19:goto            33
				obj = ((Object) ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)((CollectionInfoCompat)obj).mInfo));
	//   11   22:aload_1         
	//   12   23:checkcast       #9   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//   13   26:getfield        #546 <Field Object AccessibilityNodeInfoCompat$CollectionInfoCompat.mInfo>
	//   14   29:checkcast       #548 <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//   15   32:astore_1        
			accessibilitynodeinfo.setCollectionInfo(((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) (obj)));
	//   16   33:aload_2         
	//   17   34:aload_1         
	//   18   35:invokevirtual   #551 <Method void AccessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionInfo)>
		}
	//   19   38:return          
	}

	public void setCollectionItemInfo(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          38
		{
			AccessibilityNodeInfo accessibilitynodeinfo = mInfo;
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:astore_2        
			if(obj == null)
	//*   6   13:aload_1         
	//*   7   14:ifnonnull       22
				obj = null;
	//    8   17:aconst_null     
	//    9   18:astore_1        
			else
	//*  10   19:goto            33
				obj = ((Object) ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)((CollectionItemInfoCompat)obj).mInfo));
	//   11   22:aload_1         
	//   12   23:checkcast       #12  <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
	//   13   26:getfield        #553 <Field Object AccessibilityNodeInfoCompat$CollectionItemInfoCompat.mInfo>
	//   14   29:checkcast       #555 <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//   15   32:astore_1        
			accessibilitynodeinfo.setCollectionItemInfo(((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) (obj)));
	//   16   33:aload_2         
	//   17   34:aload_1         
	//   18   35:invokevirtual   #558 <Method void AccessibilityNodeInfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo)>
		}
	//   19   38:return          
	}

	public void setContentDescription(CharSequence charsequence)
	{
		mInfo.setContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #561 <Method void AccessibilityNodeInfo.setContentDescription(CharSequence)>
	//    4    8:return          
	}

	public void setContentInvalid(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setContentInvalid(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #564 <Method void AccessibilityNodeInfo.setContentInvalid(boolean)>
	//    7   16:return          
	}

	public void setContextClickable(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          16
			mInfo.setContextClickable(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #567 <Method void AccessibilityNodeInfo.setContextClickable(boolean)>
	//    7   16:return          
	}

	public void setDismissable(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setDismissable(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #570 <Method void AccessibilityNodeInfo.setDismissable(boolean)>
	//    7   16:return          
	}

	public void setDrawingOrder(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			mInfo.setDrawingOrder(i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #573 <Method void AccessibilityNodeInfo.setDrawingOrder(int)>
	//    7   16:return          
	}

	public void setEditable(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			mInfo.setEditable(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #576 <Method void AccessibilityNodeInfo.setEditable(boolean)>
	//    7   16:return          
	}

	public void setEnabled(boolean flag)
	{
		mInfo.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #579 <Method void AccessibilityNodeInfo.setEnabled(boolean)>
	//    4    8:return          
	}

	public void setError(CharSequence charsequence)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			mInfo.setError(charsequence);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #582 <Method void AccessibilityNodeInfo.setError(CharSequence)>
	//    7   16:return          
	}

	public void setFocusable(boolean flag)
	{
		mInfo.setFocusable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #585 <Method void AccessibilityNodeInfo.setFocusable(boolean)>
	//    4    8:return          
	}

	public void setFocused(boolean flag)
	{
		mInfo.setFocused(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #588 <Method void AccessibilityNodeInfo.setFocused(boolean)>
	//    4    8:return          
	}

	public void setHeading(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          17
		{
			mInfo.setHeading(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #591 <Method void AccessibilityNodeInfo.setHeading(boolean)>
			return;
	//    7   16:return          
		} else
		{
			setBooleanProperty(2, flag);
	//    8   17:aload_0         
	//    9   18:iconst_2        
	//   10   19:iload_1         
	//   11   20:invokespecial   #593 <Method void setBooleanProperty(int, boolean)>
			return;
	//   12   23:return          
		}
	}

	public void setHintText(CharSequence charsequence)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          17
		{
			mInfo.setHintText(charsequence);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #596 <Method void AccessibilityNodeInfo.setHintText(CharSequence)>
			return;
	//    7   16:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   8   17:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          19
	//*  10   22:icmplt          38
			mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charsequence);
	//   11   25:aload_0         
	//   12   26:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//   13   29:invokevirtual   #342 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//   14   32:ldc1            #98  <String "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY">
	//   15   34:aload_1         
	//   16   35:invokevirtual   #600 <Method void Bundle.putCharSequence(String, CharSequence)>
	//   17   38:return          
	}

	public void setImportantForAccessibility(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			mInfo.setImportantForAccessibility(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #603 <Method void AccessibilityNodeInfo.setImportantForAccessibility(boolean)>
	//    7   16:return          
	}

	public void setInputType(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setInputType(i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #606 <Method void AccessibilityNodeInfo.setInputType(int)>
	//    7   16:return          
	}

	public void setLabelFor(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          16
			mInfo.setLabelFor(view);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #609 <Method void AccessibilityNodeInfo.setLabelFor(View)>
	//    7   16:return          
	}

	public void setLabelFor(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          17
			mInfo.setLabelFor(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #611 <Method void AccessibilityNodeInfo.setLabelFor(View, int)>
	//    8   17:return          
	}

	public void setLabeledBy(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          16
			mInfo.setLabeledBy(view);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #614 <Method void AccessibilityNodeInfo.setLabeledBy(View)>
	//    7   16:return          
	}

	public void setLabeledBy(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          17
			mInfo.setLabeledBy(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #616 <Method void AccessibilityNodeInfo.setLabeledBy(View, int)>
	//    8   17:return          
	}

	public void setLiveRegion(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setLiveRegion(i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #619 <Method void AccessibilityNodeInfo.setLiveRegion(int)>
	//    7   16:return          
	}

	public void setLongClickable(boolean flag)
	{
		mInfo.setLongClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #622 <Method void AccessibilityNodeInfo.setLongClickable(boolean)>
	//    4    8:return          
	}

	public void setMaxTextLength(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			mInfo.setMaxTextLength(i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #625 <Method void AccessibilityNodeInfo.setMaxTextLength(int)>
	//    7   16:return          
	}

	public void setMovementGranularities(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			mInfo.setMovementGranularities(i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #628 <Method void AccessibilityNodeInfo.setMovementGranularities(int)>
	//    7   16:return          
	}

	public void setMultiLine(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setMultiLine(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #631 <Method void AccessibilityNodeInfo.setMultiLine(boolean)>
	//    7   16:return          
	}

	public void setPackageName(CharSequence charsequence)
	{
		mInfo.setPackageName(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #634 <Method void AccessibilityNodeInfo.setPackageName(CharSequence)>
	//    4    8:return          
	}

	public void setPaneTitle(CharSequence charsequence)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          17
		{
			mInfo.setPaneTitle(charsequence);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #637 <Method void AccessibilityNodeInfo.setPaneTitle(CharSequence)>
			return;
	//    7   16:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   8   17:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          19
	//*  10   22:icmplt          38
			mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charsequence);
	//   11   25:aload_0         
	//   12   26:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//   13   29:invokevirtual   #342 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//   14   32:ldc1            #106 <String "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY">
	//   15   34:aload_1         
	//   16   35:invokevirtual   #600 <Method void Bundle.putCharSequence(String, CharSequence)>
	//   17   38:return          
	}

	public void setParent(View view)
	{
		mInfo.setParent(view);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #640 <Method void AccessibilityNodeInfo.setParent(View)>
	//    4    8:return          
	}

	public void setParent(View view, int i)
	{
		mParentVirtualDescendantId = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #126 <Field int mParentVirtualDescendantId>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   3    5:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          16
	//*   5   10:icmplt          22
			mInfo.setParent(view, i);
	//    6   13:aload_0         
	//    7   14:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    8   17:aload_1         
	//    9   18:iload_2         
	//   10   19:invokevirtual   #642 <Method void AccessibilityNodeInfo.setParent(View, int)>
	//   11   22:return          
	}

	public void setPassword(boolean flag)
	{
		mInfo.setPassword(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #645 <Method void AccessibilityNodeInfo.setPassword(boolean)>
	//    4    8:return          
	}

	public void setRangeInfo(RangeInfoCompat rangeinfocompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          22
			mInfo.setRangeInfo((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)rangeinfocompat.mInfo);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:getfield        #648 <Field Object AccessibilityNodeInfoCompat$RangeInfoCompat.mInfo>
	//    7   16:checkcast       #650 <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
	//    8   19:invokevirtual   #653 <Method void AccessibilityNodeInfo.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo$RangeInfo)>
	//    9   22:return          
	}

	public void setRoleDescription(CharSequence charsequence)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          21
			mInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charsequence);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #342 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//    6   15:ldc1            #109 <String "AccessibilityNodeInfo.roleDescription">
	//    7   17:aload_1         
	//    8   18:invokevirtual   #600 <Method void Bundle.putCharSequence(String, CharSequence)>
	//    9   21:return          
	}

	public void setScreenReaderFocusable(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          17
		{
			mInfo.setScreenReaderFocusable(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #657 <Method void AccessibilityNodeInfo.setScreenReaderFocusable(boolean)>
			return;
	//    7   16:return          
		} else
		{
			setBooleanProperty(1, flag);
	//    8   17:aload_0         
	//    9   18:iconst_1        
	//   10   19:iload_1         
	//   11   20:invokespecial   #593 <Method void setBooleanProperty(int, boolean)>
			return;
	//   12   23:return          
		}
	}

	public void setScrollable(boolean flag)
	{
		mInfo.setScrollable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #660 <Method void AccessibilityNodeInfo.setScrollable(boolean)>
	//    4    8:return          
	}

	public void setSelected(boolean flag)
	{
		mInfo.setSelected(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #663 <Method void AccessibilityNodeInfo.setSelected(boolean)>
	//    4    8:return          
	}

	public void setShowingHintText(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          17
		{
			mInfo.setShowingHintText(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #666 <Method void AccessibilityNodeInfo.setShowingHintText(boolean)>
			return;
	//    7   16:return          
		} else
		{
			setBooleanProperty(4, flag);
	//    8   17:aload_0         
	//    9   18:iconst_4        
	//   10   19:iload_1         
	//   11   20:invokespecial   #593 <Method void setBooleanProperty(int, boolean)>
			return;
	//   12   23:return          
		}
	}

	public void setSource(View view)
	{
		mInfo.setSource(view);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #669 <Method void AccessibilityNodeInfo.setSource(View)>
	//    4    8:return          
	}

	public void setSource(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          17
			mInfo.setSource(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #671 <Method void AccessibilityNodeInfo.setSource(View, int)>
	//    8   17:return          
	}

	public void setText(CharSequence charsequence)
	{
		mInfo.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #674 <Method void AccessibilityNodeInfo.setText(CharSequence)>
	//    4    8:return          
	}

	public void setTextSelection(int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          17
			mInfo.setTextSelection(i, j);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #678 <Method void AccessibilityNodeInfo.setTextSelection(int, int)>
	//    8   17:return          
	}

	public void setTooltipText(CharSequence charsequence)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          17
		{
			mInfo.setTooltipText(charsequence);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #681 <Method void AccessibilityNodeInfo.setTooltipText(CharSequence)>
			return;
	//    7   16:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   8   17:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          19
	//*  10   22:icmplt          38
			mInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charsequence);
	//   11   25:aload_0         
	//   12   26:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//   13   29:invokevirtual   #342 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//   14   32:ldc1            #112 <String "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY">
	//   15   34:aload_1         
	//   16   35:invokevirtual   #600 <Method void Bundle.putCharSequence(String, CharSequence)>
	//   17   38:return          
	}

	public void setTraversalAfter(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          16
			mInfo.setTraversalAfter(view);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #684 <Method void AccessibilityNodeInfo.setTraversalAfter(View)>
	//    7   16:return          
	}

	public void setTraversalAfter(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          17
			mInfo.setTraversalAfter(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #686 <Method void AccessibilityNodeInfo.setTraversalAfter(View, int)>
	//    8   17:return          
	}

	public void setTraversalBefore(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          16
			mInfo.setTraversalBefore(view);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #689 <Method void AccessibilityNodeInfo.setTraversalBefore(View)>
	//    7   16:return          
	}

	public void setTraversalBefore(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          17
			mInfo.setTraversalBefore(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #691 <Method void AccessibilityNodeInfo.setTraversalBefore(View, int)>
	//    8   17:return          
	}

	public void setViewIdResourceName(String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			mInfo.setViewIdResourceName(s);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #695 <Method void AccessibilityNodeInfo.setViewIdResourceName(String)>
	//    7   16:return          
	}

	public void setVisibleToUser(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #191 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			mInfo.setVisibleToUser(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #698 <Method void AccessibilityNodeInfo.setVisibleToUser(boolean)>
	//    7   16:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #701 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #702 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(super.toString());
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokespecial   #704 <Method String Object.toString()>
	//    7   15:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		Object obj = ((Object) (new Rect()));
	//    9   19:new             #710 <Class Rect>
	//   10   22:dup             
	//   11   23:invokespecial   #711 <Method void Rect()>
	//   12   26:astore          5
		getBoundsInParent(((Rect) (obj)));
	//   13   28:aload_0         
	//   14   29:aload           5
	//   15   31:invokevirtual   #712 <Method void getBoundsInParent(Rect)>
		StringBuilder stringbuilder1 = new StringBuilder();
	//   16   34:new             #701 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #702 <Method void StringBuilder()>
	//   19   41:astore          6
		stringbuilder1.append("; boundsInParent: ");
	//   20   43:aload           6
	//   21   45:ldc2            #714 <String "; boundsInParent: ">
	//   22   48:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
		stringbuilder1.append(obj);
	//   24   52:aload           6
	//   25   54:aload           5
	//   26   56:invokevirtual   #717 <Method StringBuilder StringBuilder.append(Object)>
	//   27   59:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   28   60:aload           4
	//   29   62:aload           6
	//   30   64:invokevirtual   #718 <Method String StringBuilder.toString()>
	//   31   67:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:pop             
		getBoundsInScreen(((Rect) (obj)));
	//   33   71:aload_0         
	//   34   72:aload           5
	//   35   74:invokevirtual   #719 <Method void getBoundsInScreen(Rect)>
		stringbuilder1 = new StringBuilder();
	//   36   77:new             #701 <Class StringBuilder>
	//   37   80:dup             
	//   38   81:invokespecial   #702 <Method void StringBuilder()>
	//   39   84:astore          6
		stringbuilder1.append("; boundsInScreen: ");
	//   40   86:aload           6
	//   41   88:ldc2            #721 <String "; boundsInScreen: ">
	//   42   91:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//   43   94:pop             
		stringbuilder1.append(obj);
	//   44   95:aload           6
	//   45   97:aload           5
	//   46   99:invokevirtual   #717 <Method StringBuilder StringBuilder.append(Object)>
	//   47  102:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   48  103:aload           4
	//   49  105:aload           6
	//   50  107:invokevirtual   #718 <Method String StringBuilder.toString()>
	//   51  110:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//   52  113:pop             
		stringbuilder.append("; packageName: ");
	//   53  114:aload           4
	//   54  116:ldc2            #723 <String "; packageName: ">
	//   55  119:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//   56  122:pop             
		stringbuilder.append(getPackageName());
	//   57  123:aload           4
	//   58  125:aload_0         
	//   59  126:invokevirtual   #724 <Method CharSequence getPackageName()>
	//   60  129:invokevirtual   #727 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   61  132:pop             
		stringbuilder.append("; className: ");
	//   62  133:aload           4
	//   63  135:ldc2            #729 <String "; className: ">
	//   64  138:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//   65  141:pop             
		stringbuilder.append(getClassName());
	//   66  142:aload           4
	//   67  144:aload_0         
	//   68  145:invokevirtual   #730 <Method CharSequence getClassName()>
	//   69  148:invokevirtual   #727 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   70  151:pop             
		stringbuilder.append("; text: ");
	//   71  152:aload           4
	//   72  154:ldc2            #732 <String "; text: ">
	//   73  157:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//   74  160:pop             
		stringbuilder.append(getText());
	//   75  161:aload           4
	//   76  163:aload_0         
	//   77  164:invokevirtual   #733 <Method CharSequence getText()>
	//   78  167:invokevirtual   #727 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   79  170:pop             
		stringbuilder.append("; contentDescription: ");
	//   80  171:aload           4
	//   81  173:ldc2            #735 <String "; contentDescription: ">
	//   82  176:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//   83  179:pop             
		stringbuilder.append(getContentDescription());
	//   84  180:aload           4
	//   85  182:aload_0         
	//   86  183:invokevirtual   #736 <Method CharSequence getContentDescription()>
	//   87  186:invokevirtual   #727 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   88  189:pop             
		stringbuilder.append("; viewId: ");
	//   89  190:aload           4
	//   90  192:ldc2            #738 <String "; viewId: ">
	//   91  195:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//   92  198:pop             
		stringbuilder.append(getViewIdResourceName());
	//   93  199:aload           4
	//   94  201:aload_0         
	//   95  202:invokevirtual   #739 <Method String getViewIdResourceName()>
	//   96  205:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//   97  208:pop             
		stringbuilder.append("; checkable: ");
	//   98  209:aload           4
	//   99  211:ldc2            #741 <String "; checkable: ">
	//  100  214:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  101  217:pop             
		stringbuilder.append(isCheckable());
	//  102  218:aload           4
	//  103  220:aload_0         
	//  104  221:invokevirtual   #742 <Method boolean isCheckable()>
	//  105  224:invokevirtual   #745 <Method StringBuilder StringBuilder.append(boolean)>
	//  106  227:pop             
		stringbuilder.append("; checked: ");
	//  107  228:aload           4
	//  108  230:ldc2            #747 <String "; checked: ">
	//  109  233:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  110  236:pop             
		stringbuilder.append(isChecked());
	//  111  237:aload           4
	//  112  239:aload_0         
	//  113  240:invokevirtual   #748 <Method boolean isChecked()>
	//  114  243:invokevirtual   #745 <Method StringBuilder StringBuilder.append(boolean)>
	//  115  246:pop             
		stringbuilder.append("; focusable: ");
	//  116  247:aload           4
	//  117  249:ldc2            #750 <String "; focusable: ">
	//  118  252:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  119  255:pop             
		stringbuilder.append(isFocusable());
	//  120  256:aload           4
	//  121  258:aload_0         
	//  122  259:invokevirtual   #751 <Method boolean isFocusable()>
	//  123  262:invokevirtual   #745 <Method StringBuilder StringBuilder.append(boolean)>
	//  124  265:pop             
		stringbuilder.append("; focused: ");
	//  125  266:aload           4
	//  126  268:ldc2            #753 <String "; focused: ">
	//  127  271:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  128  274:pop             
		stringbuilder.append(isFocused());
	//  129  275:aload           4
	//  130  277:aload_0         
	//  131  278:invokevirtual   #754 <Method boolean isFocused()>
	//  132  281:invokevirtual   #745 <Method StringBuilder StringBuilder.append(boolean)>
	//  133  284:pop             
		stringbuilder.append("; selected: ");
	//  134  285:aload           4
	//  135  287:ldc2            #756 <String "; selected: ">
	//  136  290:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  137  293:pop             
		stringbuilder.append(isSelected());
	//  138  294:aload           4
	//  139  296:aload_0         
	//  140  297:invokevirtual   #757 <Method boolean isSelected()>
	//  141  300:invokevirtual   #745 <Method StringBuilder StringBuilder.append(boolean)>
	//  142  303:pop             
		stringbuilder.append("; clickable: ");
	//  143  304:aload           4
	//  144  306:ldc2            #759 <String "; clickable: ">
	//  145  309:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  146  312:pop             
		stringbuilder.append(isClickable());
	//  147  313:aload           4
	//  148  315:aload_0         
	//  149  316:invokevirtual   #760 <Method boolean isClickable()>
	//  150  319:invokevirtual   #745 <Method StringBuilder StringBuilder.append(boolean)>
	//  151  322:pop             
		stringbuilder.append("; longClickable: ");
	//  152  323:aload           4
	//  153  325:ldc2            #762 <String "; longClickable: ">
	//  154  328:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  155  331:pop             
		stringbuilder.append(isLongClickable());
	//  156  332:aload           4
	//  157  334:aload_0         
	//  158  335:invokevirtual   #763 <Method boolean isLongClickable()>
	//  159  338:invokevirtual   #745 <Method StringBuilder StringBuilder.append(boolean)>
	//  160  341:pop             
		stringbuilder.append("; enabled: ");
	//  161  342:aload           4
	//  162  344:ldc2            #765 <String "; enabled: ">
	//  163  347:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  164  350:pop             
		stringbuilder.append(isEnabled());
	//  165  351:aload           4
	//  166  353:aload_0         
	//  167  354:invokevirtual   #766 <Method boolean isEnabled()>
	//  168  357:invokevirtual   #745 <Method StringBuilder StringBuilder.append(boolean)>
	//  169  360:pop             
		stringbuilder.append("; password: ");
	//  170  361:aload           4
	//  171  363:ldc2            #768 <String "; password: ">
	//  172  366:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  173  369:pop             
		stringbuilder.append(isPassword());
	//  174  370:aload           4
	//  175  372:aload_0         
	//  176  373:invokevirtual   #769 <Method boolean isPassword()>
	//  177  376:invokevirtual   #745 <Method StringBuilder StringBuilder.append(boolean)>
	//  178  379:pop             
		obj = ((Object) (new StringBuilder()));
	//  179  380:new             #701 <Class StringBuilder>
	//  180  383:dup             
	//  181  384:invokespecial   #702 <Method void StringBuilder()>
	//  182  387:astore          5
		((StringBuilder) (obj)).append("; scrollable: ");
	//  183  389:aload           5
	//  184  391:ldc2            #771 <String "; scrollable: ">
	//  185  394:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  186  397:pop             
		((StringBuilder) (obj)).append(isScrollable());
	//  187  398:aload           5
	//  188  400:aload_0         
	//  189  401:invokevirtual   #772 <Method boolean isScrollable()>
	//  190  404:invokevirtual   #745 <Method StringBuilder StringBuilder.append(boolean)>
	//  191  407:pop             
		stringbuilder.append(((StringBuilder) (obj)).toString());
	//  192  408:aload           4
	//  193  410:aload           5
	//  194  412:invokevirtual   #718 <Method String StringBuilder.toString()>
	//  195  415:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  196  418:pop             
		stringbuilder.append("; [");
	//  197  419:aload           4
	//  198  421:ldc2            #774 <String "; [">
	//  199  424:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  200  427:pop             
		int i = getActions();
	//  201  428:aload_0         
	//  202  429:invokevirtual   #775 <Method int getActions()>
	//  203  432:istore_1        
		do
		{
			if(i == 0)
				break;
	//  204  433:iload_1         
	//  205  434:ifeq            478
			int k = 1 << Integer.numberOfTrailingZeros(i);
	//  206  437:iconst_1        
	//  207  438:iload_1         
	//  208  439:invokestatic    #781 <Method int Integer.numberOfTrailingZeros(int)>
	//  209  442:ishl            
	//  210  443:istore_3        
			int j = i & k;
	//  211  444:iload_1         
	//  212  445:iload_3         
	//  213  446:iand            
	//  214  447:istore_2        
			stringbuilder.append(getActionSymbolicName(k));
	//  215  448:aload           4
	//  216  450:iload_3         
	//  217  451:invokestatic    #783 <Method String getActionSymbolicName(int)>
	//  218  454:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  219  457:pop             
			i = j;
	//  220  458:iload_2         
	//  221  459:istore_1        
			if(j != 0)
	//* 222  460:iload_2         
	//* 223  461:ifeq            433
			{
				stringbuilder.append(", ");
	//  224  464:aload           4
	//  225  466:ldc2            #785 <String ", ">
	//  226  469:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  227  472:pop             
				i = j;
	//  228  473:iload_2         
	//  229  474:istore_1        
			}
		} while(true);
	//  230  475:goto            433
		stringbuilder.append("]");
	//  231  478:aload           4
	//  232  480:ldc2            #787 <String "]">
	//  233  483:invokevirtual   #708 <Method StringBuilder StringBuilder.append(String)>
	//  234  486:pop             
		return stringbuilder.toString();
	//  235  487:aload           4
	//  236  489:invokevirtual   #718 <Method String StringBuilder.toString()>
	//  237  492:areturn         
	}

	public AccessibilityNodeInfo unwrap()
	{
		return mInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AccessibilityNodeInfo mInfo>
	//    2    4:areturn         
	}

	public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
	public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
	public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
	public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
	public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
	public static final String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
	public static final String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
	public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
	public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
	public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
	public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
	public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
	public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
	public static final int ACTION_CLEAR_FOCUS = 2;
	public static final int ACTION_CLEAR_SELECTION = 8;
	public static final int ACTION_CLICK = 16;
	public static final int ACTION_COLLAPSE = 0x80000;
	public static final int ACTION_COPY = 16384;
	public static final int ACTION_CUT = 0x10000;
	public static final int ACTION_DISMISS = 0x100000;
	public static final int ACTION_EXPAND = 0x40000;
	public static final int ACTION_FOCUS = 1;
	public static final int ACTION_LONG_CLICK = 32;
	public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
	public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
	public static final int ACTION_PASTE = 32768;
	public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
	public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
	public static final int ACTION_SCROLL_BACKWARD = 8192;
	public static final int ACTION_SCROLL_FORWARD = 4096;
	public static final int ACTION_SELECT = 4;
	public static final int ACTION_SET_SELECTION = 0x20000;
	public static final int ACTION_SET_TEXT = 0x200000;
	private static final int BOOLEAN_PROPERTY_IS_HEADING = 2;
	private static final int BOOLEAN_PROPERTY_IS_SHOWING_HINT = 4;
	private static final String BOOLEAN_PROPERTY_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
	private static final int BOOLEAN_PROPERTY_SCREEN_READER_FOCUSABLE = 1;
	public static final int FOCUS_ACCESSIBILITY = 2;
	public static final int FOCUS_INPUT = 1;
	private static final String HINT_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
	public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
	public static final int MOVEMENT_GRANULARITY_LINE = 4;
	public static final int MOVEMENT_GRANULARITY_PAGE = 16;
	public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
	public static final int MOVEMENT_GRANULARITY_WORD = 2;
	private static final String PANE_TITLE_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
	private static final String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
	private static final String TOOLTIP_TEXT_KEY = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
	private final AccessibilityNodeInfo mInfo;
	public int mParentVirtualDescendantId;
}
