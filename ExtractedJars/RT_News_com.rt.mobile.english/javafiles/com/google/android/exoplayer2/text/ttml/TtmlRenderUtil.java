// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import android.text.style.*;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer2.text.ttml:
//			TtmlStyle

final class TtmlRenderUtil
{

	private TtmlRenderUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void applyStylesToSpan(SpannableStringBuilder spannablestringbuilder, int i, int j, TtmlStyle ttmlstyle)
	{
		if(ttmlstyle.getStyle() != -1)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #17  <Method int TtmlStyle.getStyle()>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          27
			spannablestringbuilder.setSpan(((Object) (new StyleSpan(ttmlstyle.getStyle()))), i, j, 33);
	//    4    8:aload_0         
	//    5    9:new             #19  <Class StyleSpan>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:invokevirtual   #17  <Method int TtmlStyle.getStyle()>
	//    9   17:invokespecial   #22  <Method void StyleSpan(int)>
	//   10   20:iload_1         
	//   11   21:iload_2         
	//   12   22:bipush          33
	//   13   24:invokevirtual   #28  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(ttmlstyle.isLinethrough())
	//*  14   27:aload_3         
	//*  15   28:invokevirtual   #32  <Method boolean TtmlStyle.isLinethrough()>
	//*  16   31:ifeq            49
			spannablestringbuilder.setSpan(((Object) (new StrikethroughSpan())), i, j, 33);
	//   17   34:aload_0         
	//   18   35:new             #34  <Class StrikethroughSpan>
	//   19   38:dup             
	//   20   39:invokespecial   #35  <Method void StrikethroughSpan()>
	//   21   42:iload_1         
	//   22   43:iload_2         
	//   23   44:bipush          33
	//   24   46:invokevirtual   #28  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(ttmlstyle.isUnderline())
	//*  25   49:aload_3         
	//*  26   50:invokevirtual   #38  <Method boolean TtmlStyle.isUnderline()>
	//*  27   53:ifeq            71
			spannablestringbuilder.setSpan(((Object) (new UnderlineSpan())), i, j, 33);
	//   28   56:aload_0         
	//   29   57:new             #40  <Class UnderlineSpan>
	//   30   60:dup             
	//   31   61:invokespecial   #41  <Method void UnderlineSpan()>
	//   32   64:iload_1         
	//   33   65:iload_2         
	//   34   66:bipush          33
	//   35   68:invokevirtual   #28  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(ttmlstyle.hasFontColor())
	//*  36   71:aload_3         
	//*  37   72:invokevirtual   #44  <Method boolean TtmlStyle.hasFontColor()>
	//*  38   75:ifeq            97
			spannablestringbuilder.setSpan(((Object) (new ForegroundColorSpan(ttmlstyle.getFontColor()))), i, j, 33);
	//   39   78:aload_0         
	//   40   79:new             #46  <Class ForegroundColorSpan>
	//   41   82:dup             
	//   42   83:aload_3         
	//   43   84:invokevirtual   #49  <Method int TtmlStyle.getFontColor()>
	//   44   87:invokespecial   #50  <Method void ForegroundColorSpan(int)>
	//   45   90:iload_1         
	//   46   91:iload_2         
	//   47   92:bipush          33
	//   48   94:invokevirtual   #28  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(ttmlstyle.hasBackgroundColor())
	//*  49   97:aload_3         
	//*  50   98:invokevirtual   #53  <Method boolean TtmlStyle.hasBackgroundColor()>
	//*  51  101:ifeq            123
			spannablestringbuilder.setSpan(((Object) (new BackgroundColorSpan(ttmlstyle.getBackgroundColor()))), i, j, 33);
	//   52  104:aload_0         
	//   53  105:new             #55  <Class BackgroundColorSpan>
	//   54  108:dup             
	//   55  109:aload_3         
	//   56  110:invokevirtual   #58  <Method int TtmlStyle.getBackgroundColor()>
	//   57  113:invokespecial   #59  <Method void BackgroundColorSpan(int)>
	//   58  116:iload_1         
	//   59  117:iload_2         
	//   60  118:bipush          33
	//   61  120:invokevirtual   #28  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(ttmlstyle.getFontFamily() != null)
	//*  62  123:aload_3         
	//*  63  124:invokevirtual   #63  <Method String TtmlStyle.getFontFamily()>
	//*  64  127:ifnull          149
			spannablestringbuilder.setSpan(((Object) (new TypefaceSpan(ttmlstyle.getFontFamily()))), i, j, 33);
	//   65  130:aload_0         
	//   66  131:new             #65  <Class TypefaceSpan>
	//   67  134:dup             
	//   68  135:aload_3         
	//   69  136:invokevirtual   #63  <Method String TtmlStyle.getFontFamily()>
	//   70  139:invokespecial   #68  <Method void TypefaceSpan(String)>
	//   71  142:iload_1         
	//   72  143:iload_2         
	//   73  144:bipush          33
	//   74  146:invokevirtual   #28  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(ttmlstyle.getTextAlign() != null)
	//*  75  149:aload_3         
	//*  76  150:invokevirtual   #72  <Method android.text.Layout$Alignment TtmlStyle.getTextAlign()>
	//*  77  153:ifnull          175
			spannablestringbuilder.setSpan(((Object) (new android.text.style.AlignmentSpan.Standard(ttmlstyle.getTextAlign()))), i, j, 33);
	//   78  156:aload_0         
	//   79  157:new             #74  <Class android.text.style.AlignmentSpan$Standard>
	//   80  160:dup             
	//   81  161:aload_3         
	//   82  162:invokevirtual   #72  <Method android.text.Layout$Alignment TtmlStyle.getTextAlign()>
	//   83  165:invokespecial   #77  <Method void android.text.style.AlignmentSpan$Standard(android.text.Layout$Alignment)>
	//   84  168:iload_1         
	//   85  169:iload_2         
	//   86  170:bipush          33
	//   87  172:invokevirtual   #28  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		switch(ttmlstyle.getFontSizeUnit())
	//*  88  175:aload_3         
	//*  89  176:invokevirtual   #80  <Method int TtmlStyle.getFontSizeUnit()>
		{
	//*  90  179:tableswitch     1 3: default 204
	//	               1 248
	//	               2 228
	//	               3 205
		default:
			return;
	//   91  204:return          

		case 3: // '\003'
			spannablestringbuilder.setSpan(((Object) (new RelativeSizeSpan(ttmlstyle.getFontSize() / 100F))), i, j, 33);
	//   92  205:aload_0         
	//   93  206:new             #82  <Class RelativeSizeSpan>
	//   94  209:dup             
	//   95  210:aload_3         
	//   96  211:invokevirtual   #86  <Method float TtmlStyle.getFontSize()>
	//   97  214:ldc1            #87  <Float 100F>
	//   98  216:fdiv            
	//   99  217:invokespecial   #90  <Method void RelativeSizeSpan(float)>
	//  100  220:iload_1         
	//  101  221:iload_2         
	//  102  222:bipush          33
	//  103  224:invokevirtual   #28  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			return;
	//  104  227:return          

		case 2: // '\002'
			spannablestringbuilder.setSpan(((Object) (new RelativeSizeSpan(ttmlstyle.getFontSize()))), i, j, 33);
	//  105  228:aload_0         
	//  106  229:new             #82  <Class RelativeSizeSpan>
	//  107  232:dup             
	//  108  233:aload_3         
	//  109  234:invokevirtual   #86  <Method float TtmlStyle.getFontSize()>
	//  110  237:invokespecial   #90  <Method void RelativeSizeSpan(float)>
	//  111  240:iload_1         
	//  112  241:iload_2         
	//  113  242:bipush          33
	//  114  244:invokevirtual   #28  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			return;
	//  115  247:return          

		case 1: // '\001'
			spannablestringbuilder.setSpan(((Object) (new AbsoluteSizeSpan((int)ttmlstyle.getFontSize(), true))), i, j, 33);
	//  116  248:aload_0         
	//  117  249:new             #92  <Class AbsoluteSizeSpan>
	//  118  252:dup             
	//  119  253:aload_3         
	//  120  254:invokevirtual   #86  <Method float TtmlStyle.getFontSize()>
	//  121  257:f2i             
	//  122  258:iconst_1        
	//  123  259:invokespecial   #95  <Method void AbsoluteSizeSpan(int, boolean)>
	//  124  262:iload_1         
	//  125  263:iload_2         
	//  126  264:bipush          33
	//  127  266:invokevirtual   #28  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			return;
	//  128  269:return          
		}
	}

	static String applyTextElementSpacePolicy(String s)
	{
		return s.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
	//    0    0:aload_0         
	//    1    1:ldc1            #99  <String "\r\n">
	//    2    3:ldc1            #101 <String "\n">
	//    3    5:invokevirtual   #107 <Method String String.replaceAll(String, String)>
	//    4    8:ldc1            #109 <String " *\n *">
	//    5   10:ldc1            #101 <String "\n">
	//    6   12:invokevirtual   #107 <Method String String.replaceAll(String, String)>
	//    7   15:ldc1            #101 <String "\n">
	//    8   17:ldc1            #111 <String " ">
	//    9   19:invokevirtual   #107 <Method String String.replaceAll(String, String)>
	//   10   22:ldc1            #113 <String "[ \t\\x0B\f\r]+">
	//   11   24:ldc1            #111 <String " ">
	//   12   26:invokevirtual   #107 <Method String String.replaceAll(String, String)>
	//   13   29:areturn         
	}

	static void endParagraph(SpannableStringBuilder spannablestringbuilder)
	{
		int i;
		for(i = spannablestringbuilder.length() - 1; i >= 0 && spannablestringbuilder.charAt(i) == ' '; i--);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method int SpannableStringBuilder.length()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
	//    5    7:iload_1         
	//    6    8:iflt            28
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:invokevirtual   #122 <Method char SpannableStringBuilder.charAt(int)>
	//   10   16:bipush          32
	//   11   18:icmpne          28
	//   12   21:iload_1         
	//   13   22:iconst_1        
	//   14   23:isub            
	//   15   24:istore_1        
	//*  16   25:goto            7
		if(i >= 0 && spannablestringbuilder.charAt(i) != '\n')
	//*  17   28:iload_1         
	//*  18   29:iflt            49
	//*  19   32:aload_0         
	//*  20   33:iload_1         
	//*  21   34:invokevirtual   #122 <Method char SpannableStringBuilder.charAt(int)>
	//*  22   37:bipush          10
	//*  23   39:icmpeq          49
			spannablestringbuilder.append('\n');
	//   24   42:aload_0         
	//   25   43:bipush          10
	//   26   45:invokevirtual   #126 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   27   48:pop             
	//   28   49:return          
	}

	public static TtmlStyle resolveStyle(TtmlStyle ttmlstyle, String as[], Map map)
	{
		if(ttmlstyle == null && as == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       10
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		int k = 0;
	//    6   10:iconst_0        
	//    7   11:istore          4
		int i = 0;
	//    8   13:iconst_0        
	//    9   14:istore_3        
		if(ttmlstyle == null && as.length == 1)
	//*  10   15:aload_0         
	//*  11   16:ifnonnull       38
	//*  12   19:aload_1         
	//*  13   20:arraylength     
	//*  14   21:iconst_1        
	//*  15   22:icmpne          38
			return (TtmlStyle)map.get(((Object) (as[0])));
	//   16   25:aload_2         
	//   17   26:aload_1         
	//   18   27:iconst_0        
	//   19   28:aaload          
	//   20   29:invokeinterface #134 <Method Object Map.get(Object)>
	//   21   34:checkcast       #13  <Class TtmlStyle>
	//   22   37:areturn         
		if(ttmlstyle == null && as.length > 1)
	//*  23   38:aload_0         
	//*  24   39:ifnonnull       92
	//*  25   42:aload_1         
	//*  26   43:arraylength     
	//*  27   44:iconst_1        
	//*  28   45:icmple          92
		{
			ttmlstyle = new TtmlStyle();
	//   29   48:new             #13  <Class TtmlStyle>
	//   30   51:dup             
	//   31   52:invokespecial   #135 <Method void TtmlStyle()>
	//   32   55:astore_0        
			for(k = as.length; i < k; i++)
	//*  33   56:aload_1         
	//*  34   57:arraylength     
	//*  35   58:istore          4
	//*  36   60:iload_3         
	//*  37   61:iload           4
	//*  38   63:icmpge          90
				ttmlstyle.chain((TtmlStyle)map.get(((Object) (as[i]))));
	//   39   66:aload_0         
	//   40   67:aload_2         
	//   41   68:aload_1         
	//   42   69:iload_3         
	//   43   70:aaload          
	//   44   71:invokeinterface #134 <Method Object Map.get(Object)>
	//   45   76:checkcast       #13  <Class TtmlStyle>
	//   46   79:invokevirtual   #139 <Method TtmlStyle TtmlStyle.chain(TtmlStyle)>
	//   47   82:pop             

	//   48   83:iload_3         
	//   49   84:iconst_1        
	//   50   85:iadd            
	//   51   86:istore_3        
	//*  52   87:goto            60
			return ttmlstyle;
	//   53   90:aload_0         
	//   54   91:areturn         
		}
		if(ttmlstyle != null && as != null && as.length == 1)
	//*  55   92:aload_0         
	//*  56   93:ifnull          123
	//*  57   96:aload_1         
	//*  58   97:ifnull          123
	//*  59  100:aload_1         
	//*  60  101:arraylength     
	//*  61  102:iconst_1        
	//*  62  103:icmpne          123
			return ttmlstyle.chain((TtmlStyle)map.get(((Object) (as[0]))));
	//   63  106:aload_0         
	//   64  107:aload_2         
	//   65  108:aload_1         
	//   66  109:iconst_0        
	//   67  110:aaload          
	//   68  111:invokeinterface #134 <Method Object Map.get(Object)>
	//   69  116:checkcast       #13  <Class TtmlStyle>
	//   70  119:invokevirtual   #139 <Method TtmlStyle TtmlStyle.chain(TtmlStyle)>
	//   71  122:areturn         
		if(ttmlstyle != null && as != null && as.length > 1)
	//*  72  123:aload_0         
	//*  73  124:ifnull          176
	//*  74  127:aload_1         
	//*  75  128:ifnull          176
	//*  76  131:aload_1         
	//*  77  132:arraylength     
	//*  78  133:iconst_1        
	//*  79  134:icmple          176
		{
			int l = as.length;
	//   80  137:aload_1         
	//   81  138:arraylength     
	//   82  139:istore          5
			for(int j = k; j < l; j++)
	//*  83  141:iload           4
	//*  84  143:istore_3        
	//*  85  144:iload_3         
	//*  86  145:iload           5
	//*  87  147:icmpge          174
				ttmlstyle.chain((TtmlStyle)map.get(((Object) (as[j]))));
	//   88  150:aload_0         
	//   89  151:aload_2         
	//   90  152:aload_1         
	//   91  153:iload_3         
	//   92  154:aaload          
	//   93  155:invokeinterface #134 <Method Object Map.get(Object)>
	//   94  160:checkcast       #13  <Class TtmlStyle>
	//   95  163:invokevirtual   #139 <Method TtmlStyle TtmlStyle.chain(TtmlStyle)>
	//   96  166:pop             

	//   97  167:iload_3         
	//   98  168:iconst_1        
	//   99  169:iadd            
	//  100  170:istore_3        
	//* 101  171:goto            144
			return ttmlstyle;
	//  102  174:aload_0         
	//  103  175:areturn         
		} else
		{
			return ttmlstyle;
	//  104  176:aload_0         
	//  105  177:areturn         
		}
	}
}
