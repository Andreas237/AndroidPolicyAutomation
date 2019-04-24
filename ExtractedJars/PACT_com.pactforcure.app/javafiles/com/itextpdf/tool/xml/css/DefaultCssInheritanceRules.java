// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssInheritanceRules

public class DefaultCssInheritanceRules
	implements CssInheritanceRules
{

	public DefaultCssInheritanceRules()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method void Object()>
	//    2    4:return          
	}

	public boolean inheritCssSelector(Tag tag, String s)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		if(!GLOBAL.contains(((Object) (s)))) goto _L2; else goto _L1
	//    2    3:getstatic       #95  <Field List GLOBAL>
	//    3    6:aload_2         
	//    4    7:invokeinterface #145 <Method boolean List.contains(Object)>
	//    5   12:ifeq            19
_L1:
		boolean flag = false;
	//    6   15:iconst_0        
	//    7   16:istore_3        
_L4:
		return flag;
	//    8   17:iload_3         
	//    9   18:ireturn         
_L2:
		if(!"table".equals(((Object) (tag.getName()))))
			break; /* Loop/switch isn't completed */
	//   10   19:ldc1            #147 <String "table">
	//   11   21:aload_1         
	//   12   22:invokevirtual   #153 <Method String Tag.getName()>
	//   13   25:invokevirtual   #156 <Method boolean String.equals(Object)>
	//   14   28:ifeq            48
		flag = flag1;
	//   15   31:iload           4
	//   16   33:istore_3        
		if(PARENT_TO_TABLE.contains(((Object) (s))))
	//*  17   34:getstatic       #119 <Field List PARENT_TO_TABLE>
	//*  18   37:aload_2         
	//*  19   38:invokeinterface #145 <Method boolean List.contains(Object)>
	//*  20   43:ifeq            17
			return false;
	//   21   46:iconst_0        
	//   22   47:ireturn         
		if(true) goto _L4; else goto _L3
_L3:
		if(!"table".equals(((Object) (tag.getParent().getName()))))
			break; /* Loop/switch isn't completed */
	//   23   48:ldc1            #147 <String "table">
	//   24   50:aload_1         
	//   25   51:invokevirtual   #160 <Method Tag Tag.getParent()>
	//   26   54:invokevirtual   #153 <Method String Tag.getName()>
	//   27   57:invokevirtual   #156 <Method boolean String.equals(Object)>
	//   28   60:ifeq            80
		flag = flag1;
	//   29   63:iload           4
	//   30   65:istore_3        
		if(TABLE_IN_ROW.contains(((Object) (s))))
	//*  31   66:getstatic       #123 <Field List TABLE_IN_ROW>
	//*  32   69:aload_2         
	//*  33   70:invokeinterface #145 <Method boolean List.contains(Object)>
	//*  34   75:ifeq            17
			return false;
	//   35   78:iconst_0        
	//   36   79:ireturn         
		if(true) goto _L4; else goto _L5
_L5:
		if(!"td".equalsIgnoreCase(tag.getParent().getName()))
			break; /* Loop/switch isn't completed */
	//   37   80:ldc1            #162 <String "td">
	//   38   82:aload_1         
	//   39   83:invokevirtual   #160 <Method Tag Tag.getParent()>
	//   40   86:invokevirtual   #153 <Method String Tag.getName()>
	//   41   89:invokevirtual   #166 <Method boolean String.equalsIgnoreCase(String)>
	//   42   92:ifeq            112
		flag = flag1;
	//   43   95:iload           4
	//   44   97:istore_3        
		if(TD_TO_CONTENT.contains(((Object) (s))))
	//*  45   98:getstatic       #133 <Field List TD_TO_CONTENT>
	//*  46  101:aload_2         
	//*  47  102:invokeinterface #145 <Method boolean List.contains(Object)>
	//*  48  107:ifeq            17
			return false;
	//   49  110:iconst_0        
	//   50  111:ireturn         
		if(true) goto _L4; else goto _L6
_L6:
		flag = flag1;
	//   51  112:iload           4
	//   52  114:istore_3        
		if("div".equalsIgnoreCase(tag.getParent().getName()))
	//*  53  115:ldc1            #168 <String "div">
	//*  54  117:aload_1         
	//*  55  118:invokevirtual   #160 <Method Tag Tag.getParent()>
	//*  56  121:invokevirtual   #153 <Method String Tag.getName()>
	//*  57  124:invokevirtual   #166 <Method boolean String.equalsIgnoreCase(String)>
	//*  58  127:ifeq            17
		{
			flag = flag1;
	//   59  130:iload           4
	//   60  132:istore_3        
			if(DIV_TO_CONTENT.contains(((Object) (s))))
	//*  61  133:getstatic       #129 <Field List DIV_TO_CONTENT>
	//*  62  136:aload_2         
	//*  63  137:invokeinterface #145 <Method boolean List.contains(Object)>
	//*  64  142:ifeq            17
				return false;
	//   65  145:iconst_0        
	//   66  146:ireturn         
		}
		if(true) goto _L4; else goto _L7
_L7:
	}

	public boolean inheritCssTag(String s)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final List DIV_TO_CONTENT = Arrays.asList(((Object []) (new String[] {
		"background", "background-color", "float"
	})));
	private static final List GLOBAL = Arrays.asList(((Object []) (new String[] {
		"width", "height", "min-width", "max-width", "min-height", "max-height", "margin", "margin-left", "margin-right", "margin-top", 
		"margin-bottom", "padding", "padding-left", "padding-right", "padding-top", "padding-bottom", "border-top-width", "border-top-style", "border-top-color", "border-bottom-width", 
		"border-bottom-style", "border-bottom-color", "border-left-width", "border-left-style", "border-left-color", "border-right-width", "border-right-style", "border-right-color", "page-break-before", "page-break-after", 
		"left", "top", "right", "bottom", "position"
	})));
	private static final List PARENT_TO_TABLE = Arrays.asList(((Object []) (new String[] {
		"line-height", "font-size", "font-style", "font-weight", "text-indent", "cellpadding", "cellpadding-left", "cellpadding-top", "cellpadding-right", "cellpadding-bottom", 
		"direction"
	})));
	private static final List TABLE_IN_ROW = Arrays.asList(((Object []) (new String[] {
		"background-color", "direction"
	})));
	private static final List TD_TO_CONTENT = Arrays.asList(((Object []) (new String[] {
		"vertical-align"
	})));

	static 
	{
	//    0    0:bipush          35
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #19  <String "width">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #21  <String "height">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #23  <String "min-width">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #25  <String "max-width">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #27  <String "min-height">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #29  <String "max-height">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #31  <String "margin">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #33  <String "margin-left">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #35  <String "margin-right">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #37  <String "margin-top">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #39  <String "margin-bottom">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #41  <String "padding">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #43  <String "padding-left">
	//   53   76:aastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #45  <String "padding-right">
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #47  <String "padding-top">
	//   61   88:aastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #49  <String "padding-bottom">
	//   65   94:aastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #51  <String "border-top-width">
	//   69  100:aastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #53  <String "border-top-style">
	//   73  106:aastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #55  <String "border-top-color">
	//   77  112:aastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #57  <String "border-bottom-width">
	//   81  118:aastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #59  <String "border-bottom-style">
	//   85  124:aastore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:ldc1            #61  <String "border-bottom-color">
	//   89  130:aastore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:ldc1            #63  <String "border-left-width">
	//   93  136:aastore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:ldc1            #65  <String "border-left-style">
	//   97  142:aastore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:ldc1            #67  <String "border-left-color">
	//  101  148:aastore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:ldc1            #69  <String "border-right-width">
	//  105  154:aastore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:ldc1            #71  <String "border-right-style">
	//  109  160:aastore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:ldc1            #73  <String "border-right-color">
	//  113  166:aastore         
	//  114  167:dup             
	//  115  168:bipush          28
	//  116  170:ldc1            #75  <String "page-break-before">
	//  117  172:aastore         
	//  118  173:dup             
	//  119  174:bipush          29
	//  120  176:ldc1            #77  <String "page-break-after">
	//  121  178:aastore         
	//  122  179:dup             
	//  123  180:bipush          30
	//  124  182:ldc1            #79  <String "left">
	//  125  184:aastore         
	//  126  185:dup             
	//  127  186:bipush          31
	//  128  188:ldc1            #81  <String "top">
	//  129  190:aastore         
	//  130  191:dup             
	//  131  192:bipush          32
	//  132  194:ldc1            #83  <String "right">
	//  133  196:aastore         
	//  134  197:dup             
	//  135  198:bipush          33
	//  136  200:ldc1            #85  <String "bottom">
	//  137  202:aastore         
	//  138  203:dup             
	//  139  204:bipush          34
	//  140  206:ldc1            #87  <String "position">
	//  141  208:aastore         
	//  142  209:invokestatic    #93  <Method List Arrays.asList(Object[])>
	//  143  212:putstatic       #95  <Field List GLOBAL>
	//  144  215:bipush          11
	//  145  217:anewarray       String[]
	//  146  220:dup             
	//  147  221:iconst_0        
	//  148  222:ldc1            #97  <String "line-height">
	//  149  224:aastore         
	//  150  225:dup             
	//  151  226:iconst_1        
	//  152  227:ldc1            #99  <String "font-size">
	//  153  229:aastore         
	//  154  230:dup             
	//  155  231:iconst_2        
	//  156  232:ldc1            #101 <String "font-style">
	//  157  234:aastore         
	//  158  235:dup             
	//  159  236:iconst_3        
	//  160  237:ldc1            #103 <String "font-weight">
	//  161  239:aastore         
	//  162  240:dup             
	//  163  241:iconst_4        
	//  164  242:ldc1            #105 <String "text-indent">
	//  165  244:aastore         
	//  166  245:dup             
	//  167  246:iconst_5        
	//  168  247:ldc1            #107 <String "cellpadding">
	//  169  249:aastore         
	//  170  250:dup             
	//  171  251:bipush          6
	//  172  253:ldc1            #109 <String "cellpadding-left">
	//  173  255:aastore         
	//  174  256:dup             
	//  175  257:bipush          7
	//  176  259:ldc1            #111 <String "cellpadding-top">
	//  177  261:aastore         
	//  178  262:dup             
	//  179  263:bipush          8
	//  180  265:ldc1            #113 <String "cellpadding-right">
	//  181  267:aastore         
	//  182  268:dup             
	//  183  269:bipush          9
	//  184  271:ldc1            #115 <String "cellpadding-bottom">
	//  185  273:aastore         
	//  186  274:dup             
	//  187  275:bipush          10
	//  188  277:ldc1            #117 <String "direction">
	//  189  279:aastore         
	//  190  280:invokestatic    #93  <Method List Arrays.asList(Object[])>
	//  191  283:putstatic       #119 <Field List PARENT_TO_TABLE>
	//  192  286:iconst_2        
	//  193  287:anewarray       String[]
	//  194  290:dup             
	//  195  291:iconst_0        
	//  196  292:ldc1            #121 <String "background-color">
	//  197  294:aastore         
	//  198  295:dup             
	//  199  296:iconst_1        
	//  200  297:ldc1            #117 <String "direction">
	//  201  299:aastore         
	//  202  300:invokestatic    #93  <Method List Arrays.asList(Object[])>
	//  203  303:putstatic       #123 <Field List TABLE_IN_ROW>
	//  204  306:iconst_3        
	//  205  307:anewarray       String[]
	//  206  310:dup             
	//  207  311:iconst_0        
	//  208  312:ldc1            #125 <String "background">
	//  209  314:aastore         
	//  210  315:dup             
	//  211  316:iconst_1        
	//  212  317:ldc1            #121 <String "background-color">
	//  213  319:aastore         
	//  214  320:dup             
	//  215  321:iconst_2        
	//  216  322:ldc1            #127 <String "float">
	//  217  324:aastore         
	//  218  325:invokestatic    #93  <Method List Arrays.asList(Object[])>
	//  219  328:putstatic       #129 <Field List DIV_TO_CONTENT>
	//  220  331:iconst_1        
	//  221  332:anewarray       String[]
	//  222  335:dup             
	//  223  336:iconst_0        
	//  224  337:ldc1            #131 <String "vertical-align">
	//  225  339:aastore         
	//  226  340:invokestatic    #93  <Method List Arrays.asList(Object[])>
	//  227  343:putstatic       #133 <Field List TD_TO_CONTENT>
	//* 228  346:return          
	}
}
