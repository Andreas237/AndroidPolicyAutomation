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
		//*   0    0:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)mAction).getId();
		//    3    8:aload_0         
		//    4    9:getfield        #147 <Field Object mAction>
		//    5   12:checkcast       #105 <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
		//    6   15:invokevirtual   #151 <Method int android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.getId()>
		//    7   18:ireturn         
			else
				return 0;
		//    8   19:iconst_0        
		//    9   20:ireturn         
		}

		public CharSequence getLabel()
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          19
				return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)mAction).getLabel();
		//    3    8:aload_0         
		//    4    9:getfield        #147 <Field Object mAction>
		//    5   12:checkcast       #105 <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
		//    6   15:invokevirtual   #155 <Method CharSequence android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.getLabel()>
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
		public static final AccessibilityActionCompat ACTION_LONG_CLICK = new AccessibilityActionCompat(32, ((CharSequence) (null)));
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
		//    6    8:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//    7   11:putstatic       #48  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_FOCUS>
		//    8   14:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//    9   17:dup             
		//   10   18:iconst_2        
		//   11   19:aconst_null     
		//   12   20:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   13   23:putstatic       #50  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_FOCUS>
		//   14   26:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   15   29:dup             
		//   16   30:iconst_4        
		//   17   31:aconst_null     
		//   18   32:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   19   35:putstatic       #52  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SELECT>
		//   20   38:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   21   41:dup             
		//   22   42:bipush          8
		//   23   44:aconst_null     
		//   24   45:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   25   48:putstatic       #54  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_SELECTION>
		//   26   51:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   27   54:dup             
		//   28   55:bipush          16
		//   29   57:aconst_null     
		//   30   58:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   31   61:putstatic       #56  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLICK>
		//   32   64:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   33   67:dup             
		//   34   68:bipush          32
		//   35   70:aconst_null     
		//   36   71:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   37   74:putstatic       #58  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_LONG_CLICK>
		//   38   77:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   39   80:dup             
		//   40   81:bipush          64
		//   41   83:aconst_null     
		//   42   84:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   43   87:putstatic       #60  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS>
		//   44   90:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   45   93:dup             
		//   46   94:sipush          128
		//   47   97:aconst_null     
		//   48   98:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   49  101:putstatic       #62  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS>
		//   50  104:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   51  107:dup             
		//   52  108:sipush          256
		//   53  111:aconst_null     
		//   54  112:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   55  115:putstatic       #64  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY>
		//   56  118:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   57  121:dup             
		//   58  122:sipush          512
		//   59  125:aconst_null     
		//   60  126:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   61  129:putstatic       #66  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY>
		//   62  132:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   63  135:dup             
		//   64  136:sipush          1024
		//   65  139:aconst_null     
		//   66  140:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   67  143:putstatic       #68  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT>
		//   68  146:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   69  149:dup             
		//   70  150:sipush          2048
		//   71  153:aconst_null     
		//   72  154:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   73  157:putstatic       #70  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT>
		//   74  160:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   75  163:dup             
		//   76  164:sipush          4096
		//   77  167:aconst_null     
		//   78  168:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   79  171:putstatic       #72  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_FORWARD>
		//   80  174:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   81  177:dup             
		//   82  178:sipush          8192
		//   83  181:aconst_null     
		//   84  182:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   85  185:putstatic       #74  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_BACKWARD>
		//   86  188:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   87  191:dup             
		//   88  192:sipush          16384
		//   89  195:aconst_null     
		//   90  196:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   91  199:putstatic       #76  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_COPY>
		//   92  202:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   93  205:dup             
		//   94  206:ldc1            #77  <Int 32768>
		//   95  208:aconst_null     
		//   96  209:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//   97  212:putstatic       #79  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PASTE>
		//   98  215:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//   99  218:dup             
		//  100  219:ldc1            #80  <Int 0x10000>
		//  101  221:aconst_null     
		//  102  222:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//  103  225:putstatic       #82  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CUT>
		//  104  228:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//  105  231:dup             
		//  106  232:ldc1            #83  <Int 0x20000>
		//  107  234:aconst_null     
		//  108  235:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//  109  238:putstatic       #85  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_SELECTION>
		//  110  241:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//  111  244:dup             
		//  112  245:ldc1            #86  <Int 0x40000>
		//  113  247:aconst_null     
		//  114  248:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//  115  251:putstatic       #88  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_EXPAND>
		//  116  254:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//  117  257:dup             
		//  118  258:ldc1            #89  <Int 0x80000>
		//  119  260:aconst_null     
		//  120  261:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//  121  264:putstatic       #91  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_COLLAPSE>
		//  122  267:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//  123  270:dup             
		//  124  271:ldc1            #92  <Int 0x100000>
		//  125  273:aconst_null     
		//  126  274:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//  127  277:putstatic       #94  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_DISMISS>
		//  128  280:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//  129  283:dup             
		//  130  284:ldc1            #95  <Int 0x200000>
		//  131  286:aconst_null     
		//  132  287:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
		//  133  290:putstatic       #97  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_TEXT>
			android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction accessibilityaction;
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//* 134  293:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//* 135  296:bipush          23
		//* 136  298:icmplt          308
				accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
		//  137  301:getstatic       #108 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN>
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
		//  145  315:invokespecial   #111 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
		//  146  318:putstatic       #113 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SHOW_ON_SCREEN>
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//* 147  321:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//* 148  324:bipush          23
		//* 149  326:icmplt          336
				accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
		//  150  329:getstatic       #115 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION>
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
		//  158  343:invokespecial   #111 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
		//  159  346:putstatic       #117 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_TO_POSITION>
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//* 160  349:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//* 161  352:bipush          23
		//* 162  354:icmplt          364
				accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
		//  163  357:getstatic       #119 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP>
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
		//  171  371:invokespecial   #111 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
		//  172  374:putstatic       #121 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_UP>
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//* 173  377:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//* 174  380:bipush          23
		//* 175  382:icmplt          392
				accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
		//  176  385:getstatic       #123 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT>
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
		//  184  399:invokespecial   #111 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
		//  185  402:putstatic       #125 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_LEFT>
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//* 186  405:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//* 187  408:bipush          23
		//* 188  410:icmplt          420
				accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
		//  189  413:getstatic       #127 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN>
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
		//  197  427:invokespecial   #111 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
		//  198  430:putstatic       #129 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_DOWN>
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//* 199  433:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//* 200  436:bipush          23
		//* 201  438:icmplt          448
				accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
		//  202  441:getstatic       #131 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT>
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
		//  210  455:invokespecial   #111 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
		//  211  458:putstatic       #133 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_RIGHT>
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//* 212  461:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//* 213  464:bipush          23
		//* 214  466:icmplt          476
				accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
		//  215  469:getstatic       #135 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK>
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
		//  223  483:invokespecial   #111 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
		//  224  486:putstatic       #137 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CONTEXT_CLICK>
			accessibilityaction = ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) (obj));
		//  225  489:aload_1         
		//  226  490:astore_0        
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//* 227  491:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//* 228  494:bipush          24
		//* 229  496:icmplt          503
				accessibilityaction = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
		//  230  499:getstatic       #139 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS>
		//  231  502:astore_0        
			ACTION_SET_PROGRESS = new AccessibilityActionCompat(((Object) (accessibilityaction)));
		//  232  503:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
		//  233  506:dup             
		//  234  507:aload_0         
		//  235  508:invokespecial   #111 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
		//  236  511:putstatic       #141 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_PROGRESS>
		//* 237  514:return          
		}

		public AccessibilityActionCompat(int i, CharSequence charsequence)
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          21
				charsequence = ((CharSequence) (new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i, charsequence)));
		//    3    8:new             #105 <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
		//    4   11:dup             
		//    5   12:iload_1         
		//    6   13:aload_2         
		//    7   14:invokespecial   #143 <Method void android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction(int, CharSequence)>
		//    8   17:astore_2        
			else
		//*   9   18:goto            23
				charsequence = null;
		//   10   21:aconst_null     
		//   11   22:astore_2        
			this(((Object) (charsequence)));
		//   12   23:aload_0         
		//   13   24:aload_2         
		//   14   25:invokespecial   #111 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
		//   15   28:return          
		}

		AccessibilityActionCompat(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #145 <Method void Object()>
			mAction = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #147 <Field Object mAction>
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
	//    1    1:invokespecial   #105 <Method void Object()>
		mParentVirtualDescendantId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #107 <Field int mParentVirtualDescendantId>
		mInfo = accessibilitynodeinfo;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    8   14:return          
	}

	public AccessibilityNodeInfoCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method void Object()>
		mParentVirtualDescendantId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #107 <Field int mParentVirtualDescendantId>
		mInfo = (AccessibilityNodeInfo)obj;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:checkcast       #114 <Class AccessibilityNodeInfo>
	//    8   14:putfield        #109 <Field AccessibilityNodeInfo mInfo>
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
	//    2  156:ldc1            #119 <String "ACTION_UNKNOWN">
	//    3  158:areturn         

		case 131072: 
			return "ACTION_SET_SELECTION";
	//    4  159:ldc1            #120 <String "ACTION_SET_SELECTION">
	//    5  161:areturn         

		case 65536: 
			return "ACTION_CUT";
	//    6  162:ldc1            #121 <String "ACTION_CUT">
	//    7  164:areturn         

		case 32768: 
			return "ACTION_PASTE";
	//    8  165:ldc1            #122 <String "ACTION_PASTE">
	//    9  167:areturn         

		case 16384: 
			return "ACTION_COPY";
	//   10  168:ldc1            #123 <String "ACTION_COPY">
	//   11  170:areturn         

		case 8192: 
			return "ACTION_SCROLL_BACKWARD";
	//   12  171:ldc1            #124 <String "ACTION_SCROLL_BACKWARD">
	//   13  173:areturn         

		case 4096: 
			return "ACTION_SCROLL_FORWARD";
	//   14  174:ldc1            #125 <String "ACTION_SCROLL_FORWARD">
	//   15  176:areturn         

		case 2048: 
			return "ACTION_PREVIOUS_HTML_ELEMENT";
	//   16  177:ldc1            #126 <String "ACTION_PREVIOUS_HTML_ELEMENT">
	//   17  179:areturn         

		case 1024: 
			return "ACTION_NEXT_HTML_ELEMENT";
	//   18  180:ldc1            #127 <String "ACTION_NEXT_HTML_ELEMENT">
	//   19  182:areturn         

		case 512: 
			return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
	//   20  183:ldc1            #128 <String "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY">
	//   21  185:areturn         

		case 256: 
			return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
	//   22  186:ldc1            #129 <String "ACTION_NEXT_AT_MOVEMENT_GRANULARITY">
	//   23  188:areturn         

		case 128: 
			return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
	//   24  189:ldc1            #130 <String "ACTION_CLEAR_ACCESSIBILITY_FOCUS">
	//   25  191:areturn         

		case 64: // '@'
			return "ACTION_ACCESSIBILITY_FOCUS";
	//   26  192:ldc1            #131 <String "ACTION_ACCESSIBILITY_FOCUS">
	//   27  194:areturn         

		case 32: // ' '
			return "ACTION_LONG_CLICK";
	//   28  195:ldc1            #132 <String "ACTION_LONG_CLICK">
	//   29  197:areturn         

		case 16: // '\020'
			return "ACTION_CLICK";
	//   30  198:ldc1            #133 <String "ACTION_CLICK">
	//   31  200:areturn         

		case 8: // '\b'
			return "ACTION_CLEAR_SELECTION";
	//   32  201:ldc1            #134 <String "ACTION_CLEAR_SELECTION">
	//   33  203:areturn         

		case 4: // '\004'
			return "ACTION_SELECT";
	//   34  204:ldc1            #135 <String "ACTION_SELECT">
	//   35  206:areturn         

		case 2: // '\002'
			return "ACTION_CLEAR_FOCUS";
	//   36  207:ldc1            #136 <String "ACTION_CLEAR_FOCUS">
	//   37  209:areturn         

		case 1: // '\001'
			return "ACTION_FOCUS";
	//   38  210:ldc1            #137 <String "ACTION_FOCUS">
	//   39  212:areturn         
		}
	}

	public static AccessibilityNodeInfoCompat obtain()
	{
		return wrap(AccessibilityNodeInfo.obtain());
	//    0    0:invokestatic    #142 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain()>
	//    1    3:invokestatic    #146 <Method AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo)>
	//    2    6:areturn         
	}

	public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		return wrap(AccessibilityNodeInfo.obtain(accessibilitynodeinfocompat.mInfo));
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokestatic    #150 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(AccessibilityNodeInfo)>
	//    3    7:invokestatic    #146 <Method AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo)>
	//    4   10:areturn         
	}

	public static AccessibilityNodeInfoCompat obtain(View view)
	{
		return wrap(AccessibilityNodeInfo.obtain(view));
	//    0    0:aload_0         
	//    1    1:invokestatic    #154 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(View)>
	//    2    4:invokestatic    #146 <Method AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo)>
	//    3    7:areturn         
	}

	public static AccessibilityNodeInfoCompat obtain(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          17
			return wrapNonNullInstance(((Object) (AccessibilityNodeInfo.obtain(view, i))));
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokestatic    #163 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(View, int)>
	//    6   13:invokestatic    #167 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    7   16:areturn         
		else
			return null;
	//    8   17:aconst_null     
	//    9   18:areturn         
	}

	public static AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return new AccessibilityNodeInfoCompat(accessibilitynodeinfo);
	//    0    0:new             #2   <Class AccessibilityNodeInfoCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #170 <Method void AccessibilityNodeInfoCompat(AccessibilityNodeInfo)>
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
	//    5    9:invokespecial   #173 <Method void AccessibilityNodeInfoCompat(Object)>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #177 <Method void AccessibilityNodeInfo.addAction(int)>
	//    4    8:return          
	}

	public void addAction(AccessibilityActionCompat accessibilityactioncompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          22
			mInfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)accessibilityactioncompat.mAction);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:getfield        #182 <Field Object AccessibilityNodeInfoCompat$AccessibilityActionCompat.mAction>
	//    7   16:checkcast       #184 <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    8   19:invokevirtual   #187 <Method void AccessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
	//    9   22:return          
	}

	public void addChild(View view)
	{
		mInfo.addChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #191 <Method void AccessibilityNodeInfo.addChild(View)>
	//    4    8:return          
	}

	public void addChild(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          17
			mInfo.addChild(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #194 <Method void AccessibilityNodeInfo.addChild(View, int)>
	//    8   17:return          
	}

	public boolean canOpenPopup()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.canOpenPopup();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #198 <Method boolean AccessibilityNodeInfo.canOpenPopup()>
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
	//*  10   14:invokevirtual   #204 <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #204 <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((AccessibilityNodeInfoCompat)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AccessibilityNodeInfoCompat>
	//   18   30:astore_1        
		if(mInfo == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//*  21   35:ifnonnull       47
		{
			if(((AccessibilityNodeInfoCompat) (obj)).mInfo != null)
	//*  22   38:aload_1         
	//*  23   39:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//*  24   42:ifnull          63
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		} else
		if(!mInfo.equals(((Object) (((AccessibilityNodeInfoCompat) (obj)).mInfo))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//*  29   51:aload_1         
	//*  30   52:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//*  31   55:invokevirtual   #206 <Method boolean AccessibilityNodeInfo.equals(Object)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		return true;
	//   35   63:iconst_1        
	//   36   64:ireturn         
	}

	public List findAccessibilityNodeInfosByText(String s)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #210 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #211 <Method void ArrayList()>
	//    3    7:astore          4
		s = ((String) (mInfo.findAccessibilityNodeInfosByText(s)));
	//    4    9:aload_0         
	//    5   10:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #213 <Method List AccessibilityNodeInfo.findAccessibilityNodeInfosByText(String)>
	//    8   17:astore_1        
		int j = ((List) (s)).size();
	//    9   18:aload_1         
	//   10   19:invokeinterface #219 <Method int List.size()>
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
	//   20   36:invokeinterface #223 <Method Object List.get(int)>
	//   21   41:checkcast       #114 <Class AccessibilityNodeInfo>
	//   22   44:invokestatic    #146 <Method AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo)>
	//   23   47:invokeinterface #226 <Method boolean List.add(Object)>
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
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          65
		{
			Object obj = ((Object) (mInfo.findAccessibilityNodeInfosByViewId(s)));
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #231 <Method List AccessibilityNodeInfo.findAccessibilityNodeInfosByViewId(String)>
	//    7   16:astore_2        
			s = ((String) (new ArrayList()));
	//    8   17:new             #210 <Class ArrayList>
	//    9   20:dup             
	//   10   21:invokespecial   #211 <Method void ArrayList()>
	//   11   24:astore_1        
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (s)).add(((Object) (wrap((AccessibilityNodeInfo)((Iterator) (obj)).next())))));
	//   12   25:aload_2         
	//   13   26:invokeinterface #235 <Method Iterator List.iterator()>
	//   14   31:astore_2        
	//   15   32:aload_2         
	//   16   33:invokeinterface #240 <Method boolean Iterator.hasNext()>
	//   17   38:ifeq            63
	//   18   41:aload_1         
	//   19   42:aload_2         
	//   20   43:invokeinterface #244 <Method Object Iterator.next()>
	//   21   48:checkcast       #114 <Class AccessibilityNodeInfo>
	//   22   51:invokestatic    #146 <Method AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo)>
	//   23   54:invokeinterface #226 <Method boolean List.add(Object)>
	//   24   59:pop             
	//*  25   60:goto            32
			return ((List) (s));
	//   26   63:aload_1         
	//   27   64:areturn         
		} else
		{
			return Collections.emptyList();
	//   28   65:invokestatic    #250 <Method List Collections.emptyList()>
	//   29   68:areturn         
		}
	}

	public AccessibilityNodeInfoCompat findFocus(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          20
			return wrapNonNullInstance(((Object) (mInfo.findFocus(i))));
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #255 <Method AccessibilityNodeInfo AccessibilityNodeInfo.findFocus(int)>
	//    7   16:invokestatic    #167 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    8   19:areturn         
		else
			return null;
	//    9   20:aconst_null     
	//   10   21:areturn         
	}

	public AccessibilityNodeInfoCompat focusSearch(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          20
			return wrapNonNullInstance(((Object) (mInfo.focusSearch(i))));
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #258 <Method AccessibilityNodeInfo AccessibilityNodeInfo.focusSearch(int)>
	//    7   16:invokestatic    #167 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
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
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			list = mInfo.getActionList();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #261 <Method List AccessibilityNodeInfo.getActionList()>
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
	//   12   25:new             #210 <Class ArrayList>
	//   13   28:dup             
	//   14   29:invokespecial   #211 <Method void ArrayList()>
	//   15   32:astore          4
			int j = list.size();
	//   16   34:aload_3         
	//   17   35:invokeinterface #219 <Method int List.size()>
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
	//   29   56:invokeinterface #223 <Method Object List.get(int)>
	//   30   61:invokespecial   #262 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//   31   64:invokeinterface #226 <Method boolean List.add(Object)>
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
	//   40   80:invokestatic    #250 <Method List Collections.emptyList()>
	//   41   83:areturn         
		}
	}

	public int getActions()
	{
		return mInfo.getActions();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #266 <Method int AccessibilityNodeInfo.getActions()>
	//    3    7:ireturn         
	}

	public void getBoundsInParent(Rect rect)
	{
		mInfo.getBoundsInParent(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #270 <Method void AccessibilityNodeInfo.getBoundsInParent(Rect)>
	//    4    8:return          
	}

	public void getBoundsInScreen(Rect rect)
	{
		mInfo.getBoundsInScreen(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #273 <Method void AccessibilityNodeInfo.getBoundsInScreen(Rect)>
	//    4    8:return          
	}

	public AccessibilityNodeInfoCompat getChild(int i)
	{
		return wrapNonNullInstance(((Object) (mInfo.getChild(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #276 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getChild(int)>
	//    4    8:invokestatic    #167 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    5   11:areturn         
	}

	public int getChildCount()
	{
		return mInfo.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #279 <Method int AccessibilityNodeInfo.getChildCount()>
	//    3    7:ireturn         
	}

	public CharSequence getClassName()
	{
		return mInfo.getClassName();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #283 <Method CharSequence AccessibilityNodeInfo.getClassName()>
	//    3    7:areturn         
	}

	public CollectionInfoCompat getCollectionInfo()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          29
		{
			android.view.accessibility.AccessibilityNodeInfo.CollectionInfo collectioninfo = mInfo.getCollectionInfo();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #288 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo AccessibilityNodeInfo.getCollectionInfo()>
	//    6   15:astore_1        
			if(collectioninfo != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          29
				return new CollectionInfoCompat(((Object) (collectioninfo)));
	//    9   20:new             #9   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//   10   23:dup             
	//   11   24:aload_1         
	//   12   25:invokespecial   #289 <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//   13   28:areturn         
		}
		return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
	}

	public CollectionItemInfoCompat getCollectionItemInfo()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          29
		{
			android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo collectioniteminfo = mInfo.getCollectionItemInfo();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #294 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo AccessibilityNodeInfo.getCollectionItemInfo()>
	//    6   15:astore_1        
			if(collectioniteminfo != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          29
				return new CollectionItemInfoCompat(((Object) (collectioniteminfo)));
	//    9   20:new             #12  <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
	//   10   23:dup             
	//   11   24:aload_1         
	//   12   25:invokespecial   #295 <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #298 <Method CharSequence AccessibilityNodeInfo.getContentDescription()>
	//    3    7:areturn         
	}

	public int getDrawingOrder()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			return mInfo.getDrawingOrder();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #301 <Method int AccessibilityNodeInfo.getDrawingOrder()>
	//    6   15:ireturn         
		else
			return 0;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public CharSequence getError()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			return mInfo.getError();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #304 <Method CharSequence AccessibilityNodeInfo.getError()>
	//    6   15:areturn         
		else
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
	}

	public Bundle getExtras()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.getExtras();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #308 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//    6   15:areturn         
		else
			return new Bundle();
	//    7   16:new             #310 <Class Bundle>
	//    8   19:dup             
	//    9   20:invokespecial   #311 <Method void Bundle()>
	//   10   23:areturn         
	}

	public Object getInfo()
	{
		return ((Object) (mInfo));
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:areturn         
	}

	public int getInputType()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.getInputType();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #315 <Method int AccessibilityNodeInfo.getInputType()>
	//    6   15:ireturn         
		else
			return 0;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public AccessibilityNodeInfoCompat getLabelFor()
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          19
			return wrapNonNullInstance(((Object) (mInfo.getLabelFor())));
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #318 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getLabelFor()>
	//    6   15:invokestatic    #167 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public AccessibilityNodeInfoCompat getLabeledBy()
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          19
			return wrapNonNullInstance(((Object) (mInfo.getLabeledBy())));
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #321 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getLabeledBy()>
	//    6   15:invokestatic    #167 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public int getLiveRegion()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.getLiveRegion();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #324 <Method int AccessibilityNodeInfo.getLiveRegion()>
	//    6   15:ireturn         
		else
			return 0;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public int getMaxTextLength()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			return mInfo.getMaxTextLength();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #327 <Method int AccessibilityNodeInfo.getMaxTextLength()>
	//    6   15:ireturn         
		else
			return -1;
	//    7   16:iconst_m1       
	//    8   17:ireturn         
	}

	public int getMovementGranularities()
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			return mInfo.getMovementGranularities();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #330 <Method int AccessibilityNodeInfo.getMovementGranularities()>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #333 <Method CharSequence AccessibilityNodeInfo.getPackageName()>
	//    3    7:areturn         
	}

	public AccessibilityNodeInfoCompat getParent()
	{
		return wrapNonNullInstance(((Object) (mInfo.getParent())));
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #336 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getParent()>
	//    3    7:invokestatic    #167 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    4   10:areturn         
	}

	public RangeInfoCompat getRangeInfo()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          29
		{
			android.view.accessibility.AccessibilityNodeInfo.RangeInfo rangeinfo = mInfo.getRangeInfo();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #341 <Method android.view.accessibility.AccessibilityNodeInfo$RangeInfo AccessibilityNodeInfo.getRangeInfo()>
	//    6   15:astore_1        
			if(rangeinfo != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          29
				return new RangeInfoCompat(((Object) (rangeinfo)));
	//    9   20:new             #15  <Class AccessibilityNodeInfoCompat$RangeInfoCompat>
	//   10   23:dup             
	//   11   24:aload_1         
	//   12   25:invokespecial   #342 <Method void AccessibilityNodeInfoCompat$RangeInfoCompat(Object)>
	//   13   28:areturn         
		}
		return null;
	//   14   29:aconst_null     
	//   15   30:areturn         
	}

	public CharSequence getRoleDescription()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          21
			return mInfo.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #308 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//    6   15:ldc1            #93  <String "AccessibilityNodeInfo.roleDescription">
	//    7   17:invokevirtual   #348 <Method CharSequence Bundle.getCharSequence(String)>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #352 <Method CharSequence AccessibilityNodeInfo.getText()>
	//    3    7:areturn         
	}

	public int getTextSelectionEnd()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return mInfo.getTextSelectionEnd();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #355 <Method int AccessibilityNodeInfo.getTextSelectionEnd()>
	//    6   15:ireturn         
		else
			return -1;
	//    7   16:iconst_m1       
	//    8   17:ireturn         
	}

	public int getTextSelectionStart()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return mInfo.getTextSelectionStart();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #358 <Method int AccessibilityNodeInfo.getTextSelectionStart()>
	//    6   15:ireturn         
		else
			return -1;
	//    7   16:iconst_m1       
	//    8   17:ireturn         
	}

	public AccessibilityNodeInfoCompat getTraversalAfter()
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          19
			return wrapNonNullInstance(((Object) (mInfo.getTraversalAfter())));
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #361 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getTraversalAfter()>
	//    6   15:invokestatic    #167 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public AccessibilityNodeInfoCompat getTraversalBefore()
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          19
			return wrapNonNullInstance(((Object) (mInfo.getTraversalBefore())));
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #364 <Method AccessibilityNodeInfo AccessibilityNodeInfo.getTraversalBefore()>
	//    6   15:invokestatic    #167 <Method AccessibilityNodeInfoCompat wrapNonNullInstance(Object)>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public String getViewIdResourceName()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return mInfo.getViewIdResourceName();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #368 <Method String AccessibilityNodeInfo.getViewIdResourceName()>
	//    6   15:areturn         
		else
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
	}

	public AccessibilityWindowInfoCompat getWindow()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return AccessibilityWindowInfoCompat.wrapNonNullInstance(((Object) (mInfo.getWindow())));
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #373 <Method android.view.accessibility.AccessibilityWindowInfo AccessibilityNodeInfo.getWindow()>
	//    6   15:invokestatic    #378 <Method AccessibilityWindowInfoCompat AccessibilityWindowInfoCompat.wrapNonNullInstance(Object)>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #381 <Method int AccessibilityNodeInfo.getWindowId()>
	//    3    7:ireturn         
	}

	public int hashCode()
	{
		if(mInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mInfo.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    7   13:invokevirtual   #384 <Method int AccessibilityNodeInfo.hashCode()>
	//    8   16:ireturn         
	}

	public boolean isAccessibilityFocused()
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			return mInfo.isAccessibilityFocused();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #387 <Method boolean AccessibilityNodeInfo.isAccessibilityFocused()>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #390 <Method boolean AccessibilityNodeInfo.isCheckable()>
	//    3    7:ireturn         
	}

	public boolean isChecked()
	{
		return mInfo.isChecked();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #393 <Method boolean AccessibilityNodeInfo.isChecked()>
	//    3    7:ireturn         
	}

	public boolean isClickable()
	{
		return mInfo.isClickable();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #396 <Method boolean AccessibilityNodeInfo.isClickable()>
	//    3    7:ireturn         
	}

	public boolean isContentInvalid()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.isContentInvalid();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #399 <Method boolean AccessibilityNodeInfo.isContentInvalid()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean isContextClickable()
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          16
			return mInfo.isContextClickable();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #402 <Method boolean AccessibilityNodeInfo.isContextClickable()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean isDismissable()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.isDismissable();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #405 <Method boolean AccessibilityNodeInfo.isDismissable()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean isEditable()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return mInfo.isEditable();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #408 <Method boolean AccessibilityNodeInfo.isEditable()>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #411 <Method boolean AccessibilityNodeInfo.isEnabled()>
	//    3    7:ireturn         
	}

	public boolean isFocusable()
	{
		return mInfo.isFocusable();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #414 <Method boolean AccessibilityNodeInfo.isFocusable()>
	//    3    7:ireturn         
	}

	public boolean isFocused()
	{
		return mInfo.isFocused();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #417 <Method boolean AccessibilityNodeInfo.isFocused()>
	//    3    7:ireturn         
	}

	public boolean isImportantForAccessibility()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			return mInfo.isImportantForAccessibility();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #420 <Method boolean AccessibilityNodeInfo.isImportantForAccessibility()>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #423 <Method boolean AccessibilityNodeInfo.isLongClickable()>
	//    3    7:ireturn         
	}

	public boolean isMultiLine()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			return mInfo.isMultiLine();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #426 <Method boolean AccessibilityNodeInfo.isMultiLine()>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #429 <Method boolean AccessibilityNodeInfo.isPassword()>
	//    3    7:ireturn         
	}

	public boolean isScrollable()
	{
		return mInfo.isScrollable();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #432 <Method boolean AccessibilityNodeInfo.isScrollable()>
	//    3    7:ireturn         
	}

	public boolean isSelected()
	{
		return mInfo.isSelected();
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #435 <Method boolean AccessibilityNodeInfo.isSelected()>
	//    3    7:ireturn         
	}

	public boolean isVisibleToUser()
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			return mInfo.isVisibleToUser();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #438 <Method boolean AccessibilityNodeInfo.isVisibleToUser()>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #442 <Method boolean AccessibilityNodeInfo.performAction(int)>
	//    4    8:ireturn         
	}

	public boolean performAction(int i, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
			return mInfo.performAction(i, bundle);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:aload_2         
	//    7   14:invokevirtual   #445 <Method boolean AccessibilityNodeInfo.performAction(int, Bundle)>
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
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:invokevirtual   #448 <Method void AccessibilityNodeInfo.recycle()>
	//    3    7:return          
	}

	public boolean refresh()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			return mInfo.refresh();
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #451 <Method boolean AccessibilityNodeInfo.refresh()>
	//    6   15:ireturn         
		else
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
	}

	public boolean removeAction(AccessibilityActionCompat accessibilityactioncompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          23
			return mInfo.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)accessibilityactioncompat.mAction);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:getfield        #182 <Field Object AccessibilityNodeInfoCompat$AccessibilityActionCompat.mAction>
	//    7   16:checkcast       #184 <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    8   19:invokevirtual   #456 <Method boolean AccessibilityNodeInfo.removeAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
	//    9   22:ireturn         
		else
			return false;
	//   10   23:iconst_0        
	//   11   24:ireturn         
	}

	public boolean removeChild(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
			return mInfo.removeChild(view);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #460 <Method boolean AccessibilityNodeInfo.removeChild(View)>
	//    7   16:ireturn         
		else
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
	}

	public boolean removeChild(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
			return mInfo.removeChild(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #463 <Method boolean AccessibilityNodeInfo.removeChild(View, int)>
	//    8   17:ireturn         
		else
			return false;
	//    9   18:iconst_0        
	//   10   19:ireturn         
	}

	public void setAccessibilityFocused(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			mInfo.setAccessibilityFocused(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #467 <Method void AccessibilityNodeInfo.setAccessibilityFocused(boolean)>
	//    7   16:return          
	}

	public void setBoundsInParent(Rect rect)
	{
		mInfo.setBoundsInParent(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #470 <Method void AccessibilityNodeInfo.setBoundsInParent(Rect)>
	//    4    8:return          
	}

	public void setBoundsInScreen(Rect rect)
	{
		mInfo.setBoundsInScreen(rect);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #473 <Method void AccessibilityNodeInfo.setBoundsInScreen(Rect)>
	//    4    8:return          
	}

	public void setCanOpenPopup(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setCanOpenPopup(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #476 <Method void AccessibilityNodeInfo.setCanOpenPopup(boolean)>
	//    7   16:return          
	}

	public void setCheckable(boolean flag)
	{
		mInfo.setCheckable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #479 <Method void AccessibilityNodeInfo.setCheckable(boolean)>
	//    4    8:return          
	}

	public void setChecked(boolean flag)
	{
		mInfo.setChecked(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #482 <Method void AccessibilityNodeInfo.setChecked(boolean)>
	//    4    8:return          
	}

	public void setClassName(CharSequence charsequence)
	{
		mInfo.setClassName(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #486 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    4    8:return          
	}

	public void setClickable(boolean flag)
	{
		mInfo.setClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #489 <Method void AccessibilityNodeInfo.setClickable(boolean)>
	//    4    8:return          
	}

	public void setCollectionInfo(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          25
			mInfo.setCollectionInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)((CollectionInfoCompat)obj).mInfo);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:checkcast       #9   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//    7   16:getfield        #492 <Field Object AccessibilityNodeInfoCompat$CollectionInfoCompat.mInfo>
	//    8   19:checkcast       #494 <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    9   22:invokevirtual   #497 <Method void AccessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionInfo)>
	//   10   25:return          
	}

	public void setCollectionItemInfo(Object obj)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          25
			mInfo.setCollectionItemInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)((CollectionItemInfoCompat)obj).mInfo);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:checkcast       #12  <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
	//    7   16:getfield        #499 <Field Object AccessibilityNodeInfoCompat$CollectionItemInfoCompat.mInfo>
	//    8   19:checkcast       #501 <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//    9   22:invokevirtual   #504 <Method void AccessibilityNodeInfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo)>
	//   10   25:return          
	}

	public void setContentDescription(CharSequence charsequence)
	{
		mInfo.setContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #507 <Method void AccessibilityNodeInfo.setContentDescription(CharSequence)>
	//    4    8:return          
	}

	public void setContentInvalid(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setContentInvalid(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #510 <Method void AccessibilityNodeInfo.setContentInvalid(boolean)>
	//    7   16:return          
	}

	public void setContextClickable(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          16
			mInfo.setContextClickable(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #513 <Method void AccessibilityNodeInfo.setContextClickable(boolean)>
	//    7   16:return          
	}

	public void setDismissable(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setDismissable(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #516 <Method void AccessibilityNodeInfo.setDismissable(boolean)>
	//    7   16:return          
	}

	public void setDrawingOrder(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			mInfo.setDrawingOrder(i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #519 <Method void AccessibilityNodeInfo.setDrawingOrder(int)>
	//    7   16:return          
	}

	public void setEditable(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			mInfo.setEditable(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #522 <Method void AccessibilityNodeInfo.setEditable(boolean)>
	//    7   16:return          
	}

	public void setEnabled(boolean flag)
	{
		mInfo.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #525 <Method void AccessibilityNodeInfo.setEnabled(boolean)>
	//    4    8:return          
	}

	public void setError(CharSequence charsequence)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			mInfo.setError(charsequence);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #528 <Method void AccessibilityNodeInfo.setError(CharSequence)>
	//    7   16:return          
	}

	public void setFocusable(boolean flag)
	{
		mInfo.setFocusable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #531 <Method void AccessibilityNodeInfo.setFocusable(boolean)>
	//    4    8:return          
	}

	public void setFocused(boolean flag)
	{
		mInfo.setFocused(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #534 <Method void AccessibilityNodeInfo.setFocused(boolean)>
	//    4    8:return          
	}

	public void setImportantForAccessibility(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          16
			mInfo.setImportantForAccessibility(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #537 <Method void AccessibilityNodeInfo.setImportantForAccessibility(boolean)>
	//    7   16:return          
	}

	public void setInputType(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setInputType(i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #540 <Method void AccessibilityNodeInfo.setInputType(int)>
	//    7   16:return          
	}

	public void setLabelFor(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          16
			mInfo.setLabelFor(view);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #543 <Method void AccessibilityNodeInfo.setLabelFor(View)>
	//    7   16:return          
	}

	public void setLabelFor(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          17
			mInfo.setLabelFor(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #545 <Method void AccessibilityNodeInfo.setLabelFor(View, int)>
	//    8   17:return          
	}

	public void setLabeledBy(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          16
			mInfo.setLabeledBy(view);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #548 <Method void AccessibilityNodeInfo.setLabeledBy(View)>
	//    7   16:return          
	}

	public void setLabeledBy(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          17
			mInfo.setLabeledBy(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #550 <Method void AccessibilityNodeInfo.setLabeledBy(View, int)>
	//    8   17:return          
	}

	public void setLiveRegion(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setLiveRegion(i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #553 <Method void AccessibilityNodeInfo.setLiveRegion(int)>
	//    7   16:return          
	}

	public void setLongClickable(boolean flag)
	{
		mInfo.setLongClickable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #556 <Method void AccessibilityNodeInfo.setLongClickable(boolean)>
	//    4    8:return          
	}

	public void setMaxTextLength(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			mInfo.setMaxTextLength(i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #559 <Method void AccessibilityNodeInfo.setMaxTextLength(int)>
	//    7   16:return          
	}

	public void setMovementGranularities(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			mInfo.setMovementGranularities(i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #562 <Method void AccessibilityNodeInfo.setMovementGranularities(int)>
	//    7   16:return          
	}

	public void setMultiLine(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          16
			mInfo.setMultiLine(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #565 <Method void AccessibilityNodeInfo.setMultiLine(boolean)>
	//    7   16:return          
	}

	public void setPackageName(CharSequence charsequence)
	{
		mInfo.setPackageName(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #568 <Method void AccessibilityNodeInfo.setPackageName(CharSequence)>
	//    4    8:return          
	}

	public void setParent(View view)
	{
		mInfo.setParent(view);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #571 <Method void AccessibilityNodeInfo.setParent(View)>
	//    4    8:return          
	}

	public void setParent(View view, int i)
	{
		mParentVirtualDescendantId = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #107 <Field int mParentVirtualDescendantId>
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   3    5:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          16
	//*   5   10:icmplt          22
			mInfo.setParent(view, i);
	//    6   13:aload_0         
	//    7   14:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    8   17:aload_1         
	//    9   18:iload_2         
	//   10   19:invokevirtual   #573 <Method void AccessibilityNodeInfo.setParent(View, int)>
	//   11   22:return          
	}

	public void setPassword(boolean flag)
	{
		mInfo.setPassword(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #576 <Method void AccessibilityNodeInfo.setPassword(boolean)>
	//    4    8:return          
	}

	public void setRangeInfo(RangeInfoCompat rangeinfocompat)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          22
			mInfo.setRangeInfo((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)rangeinfocompat.mInfo);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:getfield        #579 <Field Object AccessibilityNodeInfoCompat$RangeInfoCompat.mInfo>
	//    7   16:checkcast       #581 <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
	//    8   19:invokevirtual   #584 <Method void AccessibilityNodeInfo.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo$RangeInfo)>
	//    9   22:return          
	}

	public void setRoleDescription(CharSequence charsequence)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          21
			mInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charsequence);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:invokevirtual   #308 <Method Bundle AccessibilityNodeInfo.getExtras()>
	//    6   15:ldc1            #93  <String "AccessibilityNodeInfo.roleDescription">
	//    7   17:aload_1         
	//    8   18:invokevirtual   #589 <Method void Bundle.putCharSequence(String, CharSequence)>
	//    9   21:return          
	}

	public void setScrollable(boolean flag)
	{
		mInfo.setScrollable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #592 <Method void AccessibilityNodeInfo.setScrollable(boolean)>
	//    4    8:return          
	}

	public void setSelected(boolean flag)
	{
		mInfo.setSelected(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #595 <Method void AccessibilityNodeInfo.setSelected(boolean)>
	//    4    8:return          
	}

	public void setSource(View view)
	{
		mInfo.setSource(view);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #598 <Method void AccessibilityNodeInfo.setSource(View)>
	//    4    8:return          
	}

	public void setSource(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          17
			mInfo.setSource(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #600 <Method void AccessibilityNodeInfo.setSource(View, int)>
	//    8   17:return          
	}

	public void setText(CharSequence charsequence)
	{
		mInfo.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #603 <Method void AccessibilityNodeInfo.setText(CharSequence)>
	//    4    8:return          
	}

	public void setTextSelection(int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          17
			mInfo.setTextSelection(i, j);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #607 <Method void AccessibilityNodeInfo.setTextSelection(int, int)>
	//    8   17:return          
	}

	public void setTraversalAfter(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          16
			mInfo.setTraversalAfter(view);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #610 <Method void AccessibilityNodeInfo.setTraversalAfter(View)>
	//    7   16:return          
	}

	public void setTraversalAfter(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          17
			mInfo.setTraversalAfter(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #612 <Method void AccessibilityNodeInfo.setTraversalAfter(View, int)>
	//    8   17:return          
	}

	public void setTraversalBefore(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          16
			mInfo.setTraversalBefore(view);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #615 <Method void AccessibilityNodeInfo.setTraversalBefore(View)>
	//    7   16:return          
	}

	public void setTraversalBefore(View view, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 22)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          22
	//*   2    5:icmplt          17
			mInfo.setTraversalBefore(view, i);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:iload_2         
	//    7   14:invokevirtual   #617 <Method void AccessibilityNodeInfo.setTraversalBefore(View, int)>
	//    8   17:return          
	}

	public void setViewIdResourceName(String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          16
			mInfo.setViewIdResourceName(s);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #621 <Method void AccessibilityNodeInfo.setViewIdResourceName(String)>
	//    7   16:return          
	}

	public void setVisibleToUser(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #160 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			mInfo.setVisibleToUser(flag);
	//    3    8:aload_0         
	//    4    9:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    5   12:iload_1         
	//    6   13:invokevirtual   #624 <Method void AccessibilityNodeInfo.setVisibleToUser(boolean)>
	//    7   16:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #627 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #628 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append(super.toString());
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokespecial   #630 <Method String Object.toString()>
	//    7   15:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		Object obj = ((Object) (new Rect()));
	//    9   19:new             #636 <Class Rect>
	//   10   22:dup             
	//   11   23:invokespecial   #637 <Method void Rect()>
	//   12   26:astore          5
		getBoundsInParent(((Rect) (obj)));
	//   13   28:aload_0         
	//   14   29:aload           5
	//   15   31:invokevirtual   #638 <Method void getBoundsInParent(Rect)>
		StringBuilder stringbuilder1 = new StringBuilder();
	//   16   34:new             #627 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #628 <Method void StringBuilder()>
	//   19   41:astore          6
		stringbuilder1.append("; boundsInParent: ");
	//   20   43:aload           6
	//   21   45:ldc2            #640 <String "; boundsInParent: ">
	//   22   48:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
		stringbuilder1.append(obj);
	//   24   52:aload           6
	//   25   54:aload           5
	//   26   56:invokevirtual   #643 <Method StringBuilder StringBuilder.append(Object)>
	//   27   59:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   28   60:aload           4
	//   29   62:aload           6
	//   30   64:invokevirtual   #644 <Method String StringBuilder.toString()>
	//   31   67:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:pop             
		getBoundsInScreen(((Rect) (obj)));
	//   33   71:aload_0         
	//   34   72:aload           5
	//   35   74:invokevirtual   #645 <Method void getBoundsInScreen(Rect)>
		stringbuilder1 = new StringBuilder();
	//   36   77:new             #627 <Class StringBuilder>
	//   37   80:dup             
	//   38   81:invokespecial   #628 <Method void StringBuilder()>
	//   39   84:astore          6
		stringbuilder1.append("; boundsInScreen: ");
	//   40   86:aload           6
	//   41   88:ldc2            #647 <String "; boundsInScreen: ">
	//   42   91:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//   43   94:pop             
		stringbuilder1.append(obj);
	//   44   95:aload           6
	//   45   97:aload           5
	//   46   99:invokevirtual   #643 <Method StringBuilder StringBuilder.append(Object)>
	//   47  102:pop             
		stringbuilder.append(stringbuilder1.toString());
	//   48  103:aload           4
	//   49  105:aload           6
	//   50  107:invokevirtual   #644 <Method String StringBuilder.toString()>
	//   51  110:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//   52  113:pop             
		stringbuilder.append("; packageName: ");
	//   53  114:aload           4
	//   54  116:ldc2            #649 <String "; packageName: ">
	//   55  119:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//   56  122:pop             
		stringbuilder.append(getPackageName());
	//   57  123:aload           4
	//   58  125:aload_0         
	//   59  126:invokevirtual   #650 <Method CharSequence getPackageName()>
	//   60  129:invokevirtual   #653 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   61  132:pop             
		stringbuilder.append("; className: ");
	//   62  133:aload           4
	//   63  135:ldc2            #655 <String "; className: ">
	//   64  138:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//   65  141:pop             
		stringbuilder.append(getClassName());
	//   66  142:aload           4
	//   67  144:aload_0         
	//   68  145:invokevirtual   #656 <Method CharSequence getClassName()>
	//   69  148:invokevirtual   #653 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   70  151:pop             
		stringbuilder.append("; text: ");
	//   71  152:aload           4
	//   72  154:ldc2            #658 <String "; text: ">
	//   73  157:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//   74  160:pop             
		stringbuilder.append(getText());
	//   75  161:aload           4
	//   76  163:aload_0         
	//   77  164:invokevirtual   #659 <Method CharSequence getText()>
	//   78  167:invokevirtual   #653 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   79  170:pop             
		stringbuilder.append("; contentDescription: ");
	//   80  171:aload           4
	//   81  173:ldc2            #661 <String "; contentDescription: ">
	//   82  176:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//   83  179:pop             
		stringbuilder.append(getContentDescription());
	//   84  180:aload           4
	//   85  182:aload_0         
	//   86  183:invokevirtual   #662 <Method CharSequence getContentDescription()>
	//   87  186:invokevirtual   #653 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   88  189:pop             
		stringbuilder.append("; viewId: ");
	//   89  190:aload           4
	//   90  192:ldc2            #664 <String "; viewId: ">
	//   91  195:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//   92  198:pop             
		stringbuilder.append(getViewIdResourceName());
	//   93  199:aload           4
	//   94  201:aload_0         
	//   95  202:invokevirtual   #665 <Method String getViewIdResourceName()>
	//   96  205:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//   97  208:pop             
		stringbuilder.append("; checkable: ");
	//   98  209:aload           4
	//   99  211:ldc2            #667 <String "; checkable: ">
	//  100  214:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  101  217:pop             
		stringbuilder.append(isCheckable());
	//  102  218:aload           4
	//  103  220:aload_0         
	//  104  221:invokevirtual   #668 <Method boolean isCheckable()>
	//  105  224:invokevirtual   #671 <Method StringBuilder StringBuilder.append(boolean)>
	//  106  227:pop             
		stringbuilder.append("; checked: ");
	//  107  228:aload           4
	//  108  230:ldc2            #673 <String "; checked: ">
	//  109  233:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  110  236:pop             
		stringbuilder.append(isChecked());
	//  111  237:aload           4
	//  112  239:aload_0         
	//  113  240:invokevirtual   #674 <Method boolean isChecked()>
	//  114  243:invokevirtual   #671 <Method StringBuilder StringBuilder.append(boolean)>
	//  115  246:pop             
		stringbuilder.append("; focusable: ");
	//  116  247:aload           4
	//  117  249:ldc2            #676 <String "; focusable: ">
	//  118  252:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  119  255:pop             
		stringbuilder.append(isFocusable());
	//  120  256:aload           4
	//  121  258:aload_0         
	//  122  259:invokevirtual   #677 <Method boolean isFocusable()>
	//  123  262:invokevirtual   #671 <Method StringBuilder StringBuilder.append(boolean)>
	//  124  265:pop             
		stringbuilder.append("; focused: ");
	//  125  266:aload           4
	//  126  268:ldc2            #679 <String "; focused: ">
	//  127  271:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  128  274:pop             
		stringbuilder.append(isFocused());
	//  129  275:aload           4
	//  130  277:aload_0         
	//  131  278:invokevirtual   #680 <Method boolean isFocused()>
	//  132  281:invokevirtual   #671 <Method StringBuilder StringBuilder.append(boolean)>
	//  133  284:pop             
		stringbuilder.append("; selected: ");
	//  134  285:aload           4
	//  135  287:ldc2            #682 <String "; selected: ">
	//  136  290:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  137  293:pop             
		stringbuilder.append(isSelected());
	//  138  294:aload           4
	//  139  296:aload_0         
	//  140  297:invokevirtual   #683 <Method boolean isSelected()>
	//  141  300:invokevirtual   #671 <Method StringBuilder StringBuilder.append(boolean)>
	//  142  303:pop             
		stringbuilder.append("; clickable: ");
	//  143  304:aload           4
	//  144  306:ldc2            #685 <String "; clickable: ">
	//  145  309:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  146  312:pop             
		stringbuilder.append(isClickable());
	//  147  313:aload           4
	//  148  315:aload_0         
	//  149  316:invokevirtual   #686 <Method boolean isClickable()>
	//  150  319:invokevirtual   #671 <Method StringBuilder StringBuilder.append(boolean)>
	//  151  322:pop             
		stringbuilder.append("; longClickable: ");
	//  152  323:aload           4
	//  153  325:ldc2            #688 <String "; longClickable: ">
	//  154  328:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  155  331:pop             
		stringbuilder.append(isLongClickable());
	//  156  332:aload           4
	//  157  334:aload_0         
	//  158  335:invokevirtual   #689 <Method boolean isLongClickable()>
	//  159  338:invokevirtual   #671 <Method StringBuilder StringBuilder.append(boolean)>
	//  160  341:pop             
		stringbuilder.append("; enabled: ");
	//  161  342:aload           4
	//  162  344:ldc2            #691 <String "; enabled: ">
	//  163  347:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  164  350:pop             
		stringbuilder.append(isEnabled());
	//  165  351:aload           4
	//  166  353:aload_0         
	//  167  354:invokevirtual   #692 <Method boolean isEnabled()>
	//  168  357:invokevirtual   #671 <Method StringBuilder StringBuilder.append(boolean)>
	//  169  360:pop             
		stringbuilder.append("; password: ");
	//  170  361:aload           4
	//  171  363:ldc2            #694 <String "; password: ">
	//  172  366:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  173  369:pop             
		stringbuilder.append(isPassword());
	//  174  370:aload           4
	//  175  372:aload_0         
	//  176  373:invokevirtual   #695 <Method boolean isPassword()>
	//  177  376:invokevirtual   #671 <Method StringBuilder StringBuilder.append(boolean)>
	//  178  379:pop             
		obj = ((Object) (new StringBuilder()));
	//  179  380:new             #627 <Class StringBuilder>
	//  180  383:dup             
	//  181  384:invokespecial   #628 <Method void StringBuilder()>
	//  182  387:astore          5
		((StringBuilder) (obj)).append("; scrollable: ");
	//  183  389:aload           5
	//  184  391:ldc2            #697 <String "; scrollable: ">
	//  185  394:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  186  397:pop             
		((StringBuilder) (obj)).append(isScrollable());
	//  187  398:aload           5
	//  188  400:aload_0         
	//  189  401:invokevirtual   #698 <Method boolean isScrollable()>
	//  190  404:invokevirtual   #671 <Method StringBuilder StringBuilder.append(boolean)>
	//  191  407:pop             
		stringbuilder.append(((StringBuilder) (obj)).toString());
	//  192  408:aload           4
	//  193  410:aload           5
	//  194  412:invokevirtual   #644 <Method String StringBuilder.toString()>
	//  195  415:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  196  418:pop             
		stringbuilder.append("; [");
	//  197  419:aload           4
	//  198  421:ldc2            #700 <String "; [">
	//  199  424:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  200  427:pop             
		int i = getActions();
	//  201  428:aload_0         
	//  202  429:invokevirtual   #701 <Method int getActions()>
	//  203  432:istore_1        
		do
		{
			if(i == 0)
				break;
	//  204  433:iload_1         
	//  205  434:ifeq            480
			int k = 1 << Integer.numberOfTrailingZeros(i);
	//  206  437:iconst_1        
	//  207  438:iload_1         
	//  208  439:invokestatic    #707 <Method int Integer.numberOfTrailingZeros(int)>
	//  209  442:ishl            
	//  210  443:istore_3        
			int j = i & ~k;
	//  211  444:iload_1         
	//  212  445:iload_3         
	//  213  446:iconst_m1       
	//  214  447:ixor            
	//  215  448:iand            
	//  216  449:istore_2        
			stringbuilder.append(getActionSymbolicName(k));
	//  217  450:aload           4
	//  218  452:iload_3         
	//  219  453:invokestatic    #709 <Method String getActionSymbolicName(int)>
	//  220  456:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  221  459:pop             
			i = j;
	//  222  460:iload_2         
	//  223  461:istore_1        
			if(j != 0)
	//* 224  462:iload_2         
	//* 225  463:ifeq            433
			{
				stringbuilder.append(", ");
	//  226  466:aload           4
	//  227  468:ldc2            #711 <String ", ">
	//  228  471:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  229  474:pop             
				i = j;
	//  230  475:iload_2         
	//  231  476:istore_1        
			}
		} while(true);
	//  232  477:goto            433
		stringbuilder.append("]");
	//  233  480:aload           4
	//  234  482:ldc2            #713 <String "]">
	//  235  485:invokevirtual   #634 <Method StringBuilder StringBuilder.append(String)>
	//  236  488:pop             
		return stringbuilder.toString();
	//  237  489:aload           4
	//  238  491:invokevirtual   #644 <Method String StringBuilder.toString()>
	//  239  494:areturn         
	}

	public AccessibilityNodeInfo unwrap()
	{
		return mInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AccessibilityNodeInfo mInfo>
	//    2    4:areturn         
	}

	public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
	public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
	public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
	public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
	public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
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
	public static final int FOCUS_ACCESSIBILITY = 2;
	public static final int FOCUS_INPUT = 1;
	public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
	public static final int MOVEMENT_GRANULARITY_LINE = 4;
	public static final int MOVEMENT_GRANULARITY_PAGE = 16;
	public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
	public static final int MOVEMENT_GRANULARITY_WORD = 2;
	private static final String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";
	private final AccessibilityNodeInfo mInfo;
	public int mParentVirtualDescendantId;
}
