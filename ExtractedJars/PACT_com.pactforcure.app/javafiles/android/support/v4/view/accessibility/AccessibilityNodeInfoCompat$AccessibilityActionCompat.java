// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

public static class AccessibilityNodeInfoCompat$AccessibilityActionCompat
{

	public int getId()
	{
		return AccessibilityNodeInfoCompat.IMPL.getAccessibilityActionId(mAction);
	//    0    0:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #156 <Field Object mAction>
	//    3    7:invokevirtual   #162 <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getAccessibilityActionId(Object)>
	//    4   10:ireturn         
	}

	public CharSequence getLabel()
	{
		return AccessibilityNodeInfoCompat.IMPL.getAccessibilityActionLabel(mAction);
	//    0    0:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #156 <Field Object mAction>
	//    3    7:invokevirtual   #168 <Method CharSequence AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getAccessibilityActionLabel(Object)>
	//    4   10:areturn         
	}

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
	public static final AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_LONG_CLICK = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(32, ((CharSequence) (null)));
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
	final Object mAction;

	static 
	{
	//    0    0:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:aconst_null     
	//    4    6:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//    5    9:putstatic       #48  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_FOCUS>
	//    6   12:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//    7   15:dup             
	//    8   16:iconst_2        
	//    9   17:aconst_null     
	//   10   18:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   11   21:putstatic       #50  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_FOCUS>
	//   12   24:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   13   27:dup             
	//   14   28:iconst_4        
	//   15   29:aconst_null     
	//   16   30:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   17   33:putstatic       #52  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SELECT>
	//   18   36:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   19   39:dup             
	//   20   40:bipush          8
	//   21   42:aconst_null     
	//   22   43:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   23   46:putstatic       #54  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_SELECTION>
	//   24   49:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   25   52:dup             
	//   26   53:bipush          16
	//   27   55:aconst_null     
	//   28   56:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   29   59:putstatic       #56  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLICK>
	//   30   62:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   31   65:dup             
	//   32   66:bipush          32
	//   33   68:aconst_null     
	//   34   69:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   35   72:putstatic       #58  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_LONG_CLICK>
	//   36   75:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   37   78:dup             
	//   38   79:bipush          64
	//   39   81:aconst_null     
	//   40   82:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   41   85:putstatic       #60  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS>
	//   42   88:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   43   91:dup             
	//   44   92:sipush          128
	//   45   95:aconst_null     
	//   46   96:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   47   99:putstatic       #62  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS>
	//   48  102:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   49  105:dup             
	//   50  106:sipush          256
	//   51  109:aconst_null     
	//   52  110:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   53  113:putstatic       #64  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY>
	//   54  116:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   55  119:dup             
	//   56  120:sipush          512
	//   57  123:aconst_null     
	//   58  124:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   59  127:putstatic       #66  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY>
	//   60  130:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   61  133:dup             
	//   62  134:sipush          1024
	//   63  137:aconst_null     
	//   64  138:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   65  141:putstatic       #68  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT>
	//   66  144:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   67  147:dup             
	//   68  148:sipush          2048
	//   69  151:aconst_null     
	//   70  152:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   71  155:putstatic       #70  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT>
	//   72  158:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   73  161:dup             
	//   74  162:sipush          4096
	//   75  165:aconst_null     
	//   76  166:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   77  169:putstatic       #72  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_FORWARD>
	//   78  172:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   79  175:dup             
	//   80  176:sipush          8192
	//   81  179:aconst_null     
	//   82  180:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   83  183:putstatic       #74  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_BACKWARD>
	//   84  186:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   85  189:dup             
	//   86  190:sipush          16384
	//   87  193:aconst_null     
	//   88  194:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   89  197:putstatic       #76  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_COPY>
	//   90  200:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   91  203:dup             
	//   92  204:ldc1            #77  <Int 32768>
	//   93  206:aconst_null     
	//   94  207:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//   95  210:putstatic       #79  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_PASTE>
	//   96  213:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//   97  216:dup             
	//   98  217:ldc1            #80  <Int 0x10000>
	//   99  219:aconst_null     
	//  100  220:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  101  223:putstatic       #82  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CUT>
	//  102  226:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  103  229:dup             
	//  104  230:ldc1            #83  <Int 0x20000>
	//  105  232:aconst_null     
	//  106  233:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  107  236:putstatic       #85  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_SELECTION>
	//  108  239:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  109  242:dup             
	//  110  243:ldc1            #86  <Int 0x40000>
	//  111  245:aconst_null     
	//  112  246:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  113  249:putstatic       #88  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_EXPAND>
	//  114  252:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  115  255:dup             
	//  116  256:ldc1            #89  <Int 0x80000>
	//  117  258:aconst_null     
	//  118  259:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  119  262:putstatic       #91  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_COLLAPSE>
	//  120  265:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  121  268:dup             
	//  122  269:ldc1            #92  <Int 0x100000>
	//  123  271:aconst_null     
	//  124  272:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  125  275:putstatic       #94  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_DISMISS>
	//  126  278:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  127  281:dup             
	//  128  282:ldc1            #95  <Int 0x200000>
	//  129  284:aconst_null     
	//  130  285:invokespecial   #46  <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(int, CharSequence)>
	//  131  288:putstatic       #97  <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_TEXT>
		ACTION_SHOW_ON_SCREEN = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionShowOnScreen());
	//  132  291:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  133  294:dup             
	//  134  295:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//  135  298:invokevirtual   #107 <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getActionShowOnScreen()>
	//  136  301:invokespecial   #110 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  137  304:putstatic       #112 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SHOW_ON_SCREEN>
		ACTION_SCROLL_TO_POSITION = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionScrollToPosition());
	//  138  307:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  139  310:dup             
	//  140  311:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//  141  314:invokevirtual   #115 <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getActionScrollToPosition()>
	//  142  317:invokespecial   #110 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  143  320:putstatic       #117 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_TO_POSITION>
		ACTION_SCROLL_UP = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionScrollUp());
	//  144  323:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  145  326:dup             
	//  146  327:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//  147  330:invokevirtual   #120 <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getActionScrollUp()>
	//  148  333:invokespecial   #110 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  149  336:putstatic       #122 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_UP>
		ACTION_SCROLL_LEFT = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionScrollLeft());
	//  150  339:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  151  342:dup             
	//  152  343:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//  153  346:invokevirtual   #125 <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getActionScrollLeft()>
	//  154  349:invokespecial   #110 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  155  352:putstatic       #127 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_LEFT>
		ACTION_SCROLL_DOWN = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionScrollDown());
	//  156  355:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  157  358:dup             
	//  158  359:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//  159  362:invokevirtual   #130 <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getActionScrollDown()>
	//  160  365:invokespecial   #110 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  161  368:putstatic       #132 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_DOWN>
		ACTION_SCROLL_RIGHT = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionScrollRight());
	//  162  371:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  163  374:dup             
	//  164  375:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//  165  378:invokevirtual   #135 <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getActionScrollRight()>
	//  166  381:invokespecial   #110 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  167  384:putstatic       #137 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SCROLL_RIGHT>
		ACTION_CONTEXT_CLICK = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionContextClick());
	//  168  387:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  169  390:dup             
	//  170  391:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//  171  394:invokevirtual   #140 <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getActionContextClick()>
	//  172  397:invokespecial   #110 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  173  400:putstatic       #142 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_CONTEXT_CLICK>
		ACTION_SET_PROGRESS = new AccessibilityNodeInfoCompat$AccessibilityActionCompat(AccessibilityNodeInfoCompat.IMPL.getActionSetProgress());
	//  174  403:new             #2   <Class AccessibilityNodeInfoCompat$AccessibilityActionCompat>
	//  175  406:dup             
	//  176  407:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//  177  410:invokevirtual   #145 <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getActionSetProgress()>
	//  178  413:invokespecial   #110 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//  179  416:putstatic       #147 <Field AccessibilityNodeInfoCompat$AccessibilityActionCompat ACTION_SET_PROGRESS>
	//* 180  419:return          
	}

	public AccessibilityNodeInfoCompat$AccessibilityActionCompat(int i, CharSequence charsequence)
	{
		this(AccessibilityNodeInfoCompat.IMPL.newAccessibilityAction(i, charsequence));
	//    0    0:aload_0         
	//    1    1:getstatic       #101 <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #152 <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.newAccessibilityAction(int, CharSequence)>
	//    5    9:invokespecial   #110 <Method void AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object)>
	//    6   12:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityActionCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void Object()>
		mAction = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #156 <Field Object mAction>
	//    5    9:return          
	}
}
