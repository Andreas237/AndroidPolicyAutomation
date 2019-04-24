// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.webvtt;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.*;
import android.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.text.webvtt:
//			WebvttCssStyle, WebvttParserUtil

public final class WebvttCueParser
{
	private static final class StartTag
	{

		public static StartTag buildStartTag(String s, int i)
		{
			String s1 = s.trim();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method String String.trim()>
		//    2    4:astore_3        
			if(s1.isEmpty())
		//*   3    5:aload_3         
		//*   4    6:invokevirtual   #44  <Method boolean String.isEmpty()>
		//*   5    9:ifeq            14
				return null;
		//    6   12:aconst_null     
		//    7   13:areturn         
			int j = s1.indexOf(" ");
		//    8   14:aload_3         
		//    9   15:ldc1            #46  <String " ">
		//   10   17:invokevirtual   #50  <Method int String.indexOf(String)>
		//   11   20:istore_2        
			if(j == -1)
		//*  12   21:iload_2         
		//*  13   22:iconst_m1       
		//*  14   23:icmpne          32
			{
				s = "";
		//   15   26:ldc1            #52  <String "">
		//   16   28:astore_0        
			} else
		//*  17   29:goto            48
			{
				s = s1.substring(j).trim();
		//   18   32:aload_3         
		//   19   33:iload_2         
		//   20   34:invokevirtual   #56  <Method String String.substring(int)>
		//   21   37:invokevirtual   #40  <Method String String.trim()>
		//   22   40:astore_0        
				s1 = s1.substring(0, j);
		//   23   41:aload_3         
		//   24   42:iconst_0        
		//   25   43:iload_2         
		//   26   44:invokevirtual   #59  <Method String String.substring(int, int)>
		//   27   47:astore_3        
			}
			String as[] = Util.split(s1, "\\.");
		//   28   48:aload_3         
		//   29   49:ldc1            #61  <String "\\.">
		//   30   51:invokestatic    #67  <Method String[] Util.split(String, String)>
		//   31   54:astore_3        
			String s2 = as[0];
		//   32   55:aload_3         
		//   33   56:iconst_0        
		//   34   57:aaload          
		//   35   58:astore          4
			if(as.length > 1)
		//*  36   60:aload_3         
		//*  37   61:arraylength     
		//*  38   62:iconst_1        
		//*  39   63:icmple          80
				as = (String[])Arrays.copyOfRange(((Object []) (as)), 1, as.length);
		//   40   66:aload_3         
		//   41   67:iconst_1        
		//   42   68:aload_3         
		//   43   69:arraylength     
		//   44   70:invokestatic    #73  <Method Object[] Arrays.copyOfRange(Object[], int, int)>
		//   45   73:checkcast       #74  <Class String[]>
		//   46   76:astore_3        
			else
		//*  47   77:goto            84
				as = NO_CLASSES;
		//   48   80:getstatic       #21  <Field String[] NO_CLASSES>
		//   49   83:astore_3        
			return new StartTag(s2, i, s, as);
		//   50   84:new             #2   <Class WebvttCueParser$StartTag>
		//   51   87:dup             
		//   52   88:aload           4
		//   53   90:iload_1         
		//   54   91:aload_0         
		//   55   92:aload_3         
		//   56   93:invokespecial   #76  <Method void WebvttCueParser$StartTag(String, int, String, String[])>
		//   57   96:areturn         
		}

		public static StartTag buildWholeCueVirtualTag()
		{
			return new StartTag("", 0, "", new String[0]);
		//    0    0:new             #2   <Class WebvttCueParser$StartTag>
		//    1    3:dup             
		//    2    4:ldc1            #52  <String "">
		//    3    6:iconst_0        
		//    4    7:ldc1            #52  <String "">
		//    5    9:iconst_0        
		//    6   10:anewarray       String[]
		//    7   13:invokespecial   #76  <Method void WebvttCueParser$StartTag(String, int, String, String[])>
		//    8   16:areturn         
		}

		private static final String NO_CLASSES[] = new String[0];
		public final String classes[];
		public final String name;
		public final int position;
		public final String voice;

		static 
		{
		//    0    0:iconst_0        
		//    1    1:anewarray       String[]
		//    2    4:putstatic       #21  <Field String[] NO_CLASSES>
		//*   3    7:return          
		}

		private StartTag(String s, int i, String s1, String as[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			position = i;
		//    2    4:aload_0         
		//    3    5:iload_2         
		//    4    6:putfield        #28  <Field int position>
			name = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #30  <Field String name>
			voice = s1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #32  <Field String voice>
			classes = as;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #34  <Field String[] classes>
		//   14   25:return          
		}
	}

	private static final class StyleMatch
		implements Comparable
	{

		public int compareTo(StyleMatch stylematch)
		{
			return score - stylematch.score;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int score>
		//    2    4:aload_1         
		//    3    5:getfield        #21  <Field int score>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((StyleMatch)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class WebvttCueParser$StyleMatch>
		//    3    5:invokevirtual   #31  <Method int compareTo(WebvttCueParser$StyleMatch)>
		//    4    8:ireturn         
		}

		public final int score;
		public final WebvttCssStyle style;

		public StyleMatch(int i, WebvttCssStyle webvttcssstyle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			score = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int score>
			style = webvttcssstyle;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field WebvttCssStyle style>
		//    8   14:return          
		}
	}


	public WebvttCueParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #89  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #90  <Method void StringBuilder()>
	//    6   12:putfield        #92  <Field StringBuilder textBuilder>
	//    7   15:return          
	}

	private static void applyEntity(String s, SpannableStringBuilder spannablestringbuilder)
	{
		int i;
label0:
		{
			i = s.hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method int String.hashCode()>
	//    2    4:istore_2        
			if(i != 3309)
	//*   3    5:iload_2         
	//*   4    6:sipush          3309
	//*   5    9:icmpeq          76
			{
				if(i != 3464)
	//*   6   12:iload_2         
	//*   7   13:sipush          3464
	//*   8   16:icmpeq          62
				{
					if(i != 0x179c4)
	//*   9   19:iload_2         
	//*  10   20:ldc1            #101 <Int 0x179c4>
	//*  11   22:icmpeq          48
					{
						if(i == 0x337f11 && s.equals("nbsp"))
	//*  12   25:iload_2         
	//*  13   26:ldc1            #102 <Int 0x337f11>
	//*  14   28:icmpeq          34
	//*  15   31:goto            90
	//*  16   34:aload_0         
	//*  17   35:ldc1            #39  <String "nbsp">
	//*  18   37:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  19   40:ifeq            90
						{
							i = 2;
	//   20   43:iconst_2        
	//   21   44:istore_2        
							break label0;
	//   22   45:goto            92
						}
					} else
					if(s.equals("amp"))
	//*  23   48:aload_0         
	//*  24   49:ldc1            #30  <String "amp">
	//*  25   51:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  26   54:ifeq            90
					{
						i = 3;
	//   27   57:iconst_3        
	//   28   58:istore_2        
						break label0;
	//   29   59:goto            92
					}
				} else
				if(s.equals("lt"))
	//*  30   62:aload_0         
	//*  31   63:ldc1            #36  <String "lt">
	//*  32   65:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  33   68:ifeq            90
				{
					i = 0;
	//   34   71:iconst_0        
	//   35   72:istore_2        
					break label0;
	//   36   73:goto            92
				}
			} else
			if(s.equals("gt"))
	//*  37   76:aload_0         
	//*  38   77:ldc1            #33  <String "gt">
	//*  39   79:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  40   82:ifeq            90
			{
				i = 1;
	//   41   85:iconst_1        
	//   42   86:istore_2        
				break label0;
	//   43   87:goto            92
			}
			i = -1;
	//   44   90:iconst_m1       
	//   45   91:istore_2        
		}
		switch(i)
	//*  46   92:iload_2         
		{
	//*  47   93:tableswitch     0 3: default 124
	//	               0 187
	//	               1 179
	//	               2 171
	//	               3 163
		default:
			spannablestringbuilder = ((SpannableStringBuilder) (new StringBuilder()));
	//   48  124:new             #89  <Class StringBuilder>
	//   49  127:dup             
	//   50  128:invokespecial   #90  <Method void StringBuilder()>
	//   51  131:astore_1        
			((StringBuilder) (spannablestringbuilder)).append("ignoring unsupported entity: '&");
	//   52  132:aload_1         
	//   53  133:ldc1            #108 <String "ignoring unsupported entity: '&">
	//   54  135:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   55  138:pop             
			((StringBuilder) (spannablestringbuilder)).append(s);
	//   56  139:aload_1         
	//   57  140:aload_0         
	//   58  141:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   59  144:pop             
			((StringBuilder) (spannablestringbuilder)).append(";'");
	//   60  145:aload_1         
	//   61  146:ldc1            #114 <String ";'">
	//   62  148:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   63  151:pop             
			Log.w("WebvttCueParser", ((StringBuilder) (spannablestringbuilder)).toString());
	//   64  152:ldc1            #47  <String "WebvttCueParser">
	//   65  154:aload_1         
	//   66  155:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   67  158:invokestatic    #124 <Method int Log.w(String, String)>
	//   68  161:pop             
			return;
	//   69  162:return          

		case 3: // '\003'
			spannablestringbuilder.append('&');
	//   70  163:aload_1         
	//   71  164:bipush          38
	//   72  166:invokevirtual   #129 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   73  169:pop             
			return;
	//   74  170:return          

		case 2: // '\002'
			spannablestringbuilder.append(' ');
	//   75  171:aload_1         
	//   76  172:bipush          32
	//   77  174:invokevirtual   #129 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   78  177:pop             
			return;
	//   79  178:return          

		case 1: // '\001'
			spannablestringbuilder.append('>');
	//   80  179:aload_1         
	//   81  180:bipush          62
	//   82  182:invokevirtual   #129 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   83  185:pop             
			return;
	//   84  186:return          

		case 0: // '\0'
			spannablestringbuilder.append('<');
	//   85  187:aload_1         
	//   86  188:bipush          60
	//   87  190:invokevirtual   #129 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   88  193:pop             
			return;
	//   89  194:return          
		}
	}

	private static void applySpansForTag(String s, StartTag starttag, SpannableStringBuilder spannablestringbuilder, List list, List list1)
	{
		int i;
		boolean flag;
		int k;
		int l;
label0:
		{
			k = starttag.position;
	//    0    0:aload_1         
	//    1    1:getfield        #134 <Field int WebvttCueParser$StartTag.position>
	//    2    4:istore          7
			l = spannablestringbuilder.length();
	//    3    6:aload_2         
	//    4    7:invokevirtual   #137 <Method int SpannableStringBuilder.length()>
	//    5   10:istore          8
			String s1 = starttag.name;
	//    6   12:aload_1         
	//    7   13:getfield        #140 <Field String WebvttCueParser$StartTag.name>
	//    8   16:astore          10
			i = s1.hashCode();
	//    9   18:aload           10
	//   10   20:invokevirtual   #100 <Method int String.hashCode()>
	//   11   23:istore          5
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore          6
			switch(i)
	//*  14   28:iload           5
			{
			default:
				break;

	//*  15   30:lookupswitch    7: default 96
	//	               0: 195
	//	               98: 179
	//	               99: 163
	//	               105: 147
	//	               117: 131
	//	               118: 115
	//	               3314158: 99
	//*  16   96:goto            212
			case 3314158: 
				if(s1.equals("lang"))
	//*  17   99:aload           10
	//*  18  101:ldc1            #59  <String "lang">
	//*  19  103:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  20  106:ifeq            212
				{
					i = 4;
	//   21  109:iconst_4        
	//   22  110:istore          5
					break label0;
	//   23  112:goto            215
				}
				break;

			case 118: // 'v'
				if(!s1.equals("v"))
					break;
	//   24  115:aload           10
	//   25  117:ldc1            #65  <String "v">
	//   26  119:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   27  122:ifeq            212
				i = 5;
	//   28  125:iconst_5        
	//   29  126:istore          5
				break label0;
	//   30  128:goto            215

			case 117: // 'u'
				if(!s1.equals("u"))
					break;
	//   31  131:aload           10
	//   32  133:ldc1            #62  <String "u">
	//   33  135:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   34  138:ifeq            212
				i = 2;
	//   35  141:iconst_2        
	//   36  142:istore          5
				break label0;
	//   37  144:goto            215

			case 105: // 'i'
				if(!s1.equals("i"))
					break;
	//   38  147:aload           10
	//   39  149:ldc1            #56  <String "i">
	//   40  151:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   41  154:ifeq            212
				i = 1;
	//   42  157:iconst_1        
	//   43  158:istore          5
				break label0;
	//   44  160:goto            215

			case 99: // 'c'
				if(!s1.equals("c"))
					break;
	//   45  163:aload           10
	//   46  165:ldc1            #53  <String "c">
	//   47  167:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   48  170:ifeq            212
				i = 3;
	//   49  173:iconst_3        
	//   50  174:istore          5
				break label0;
	//   51  176:goto            215

			case 98: // 'b'
				if(!s1.equals("b"))
					break;
	//   52  179:aload           10
	//   53  181:ldc1            #50  <String "b">
	//   54  183:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   55  186:ifeq            212
				i = 0;
	//   56  189:iconst_0        
	//   57  190:istore          5
				break label0;
	//   58  192:goto            215

			case 0: // '\0'
				if(!s1.equals(""))
					break;
	//   59  195:aload           10
	//   60  197:ldc1            #142 <String "">
	//   61  199:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   62  202:ifeq            212
				i = 6;
	//   63  205:bipush          6
	//   64  207:istore          5
				break label0;
	//   65  209:goto            215
			}
			i = -1;
	//   66  212:iconst_m1       
	//   67  213:istore          5
		}
		switch(i)
	//*  68  215:iload           5
		{
	//*  69  217:tableswitch     0 6: default 260
	//	               0 302
	//	               1 281
	//	               2 261
	//	               3 320
	//	               4 320
	//	               5 320
	//	               6 320
		default:
			return;
	//   70  260:return          

		case 2: // '\002'
			spannablestringbuilder.setSpan(((Object) (new UnderlineSpan())), k, l, 33);
	//   71  261:aload_2         
	//   72  262:new             #144 <Class UnderlineSpan>
	//   73  265:dup             
	//   74  266:invokespecial   #145 <Method void UnderlineSpan()>
	//   75  269:iload           7
	//   76  271:iload           8
	//   77  273:bipush          33
	//   78  275:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			break;

	//*  79  278:goto            320
		case 1: // '\001'
			spannablestringbuilder.setSpan(((Object) (new StyleSpan(2))), k, l, 33);
	//   80  281:aload_2         
	//   81  282:new             #151 <Class StyleSpan>
	//   82  285:dup             
	//   83  286:iconst_2        
	//   84  287:invokespecial   #154 <Method void StyleSpan(int)>
	//   85  290:iload           7
	//   86  292:iload           8
	//   87  294:bipush          33
	//   88  296:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			break;

	//*  89  299:goto            320
		case 0: // '\0'
			spannablestringbuilder.setSpan(((Object) (new StyleSpan(1))), k, l, 33);
	//   90  302:aload_2         
	//   91  303:new             #151 <Class StyleSpan>
	//   92  306:dup             
	//   93  307:iconst_1        
	//   94  308:invokespecial   #154 <Method void StyleSpan(int)>
	//   95  311:iload           7
	//   96  313:iload           8
	//   97  315:bipush          33
	//   98  317:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			break;

		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			break;
		}
		list1.clear();
	//   99  320:aload           4
	//  100  322:invokeinterface #159 <Method void List.clear()>
		getApplicableStyles(list, s, starttag, list1);
	//  101  327:aload_3         
	//  102  328:aload_0         
	//  103  329:aload_1         
	//  104  330:aload           4
	//  105  332:invokestatic    #163 <Method void getApplicableStyles(List, String, WebvttCueParser$StartTag, List)>
		int i1 = list1.size();
	//  106  335:aload           4
	//  107  337:invokeinterface #166 <Method int List.size()>
	//  108  342:istore          9
		for(int j = ((int) (flag)); j < i1; j++)
	//* 109  344:iload           6
	//* 110  346:istore          5
	//* 111  348:iload           5
	//* 112  350:iload           9
	//* 113  352:icmpge          387
			applyStyleToText(spannablestringbuilder, ((StyleMatch)list1.get(j)).style, k, l);
	//  114  355:aload_2         
	//  115  356:aload           4
	//  116  358:iload           5
	//  117  360:invokeinterface #170 <Method Object List.get(int)>
	//  118  365:checkcast       #9   <Class WebvttCueParser$StyleMatch>
	//  119  368:getfield        #174 <Field WebvttCssStyle WebvttCueParser$StyleMatch.style>
	//  120  371:iload           7
	//  121  373:iload           8
	//  122  375:invokestatic    #178 <Method void applyStyleToText(SpannableStringBuilder, WebvttCssStyle, int, int)>

	//  123  378:iload           5
	//  124  380:iconst_1        
	//  125  381:iadd            
	//  126  382:istore          5
	//* 127  384:goto            348
	//  128  387:return          
	}

	private static void applyStyleToText(SpannableStringBuilder spannablestringbuilder, WebvttCssStyle webvttcssstyle, int i, int j)
	{
		if(webvttcssstyle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(webvttcssstyle.getStyle() != -1)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #185 <Method int WebvttCssStyle.getStyle()>
	//*   5    9:iconst_m1       
	//*   6   10:icmpeq          32
			spannablestringbuilder.setSpan(((Object) (new StyleSpan(webvttcssstyle.getStyle()))), i, j, 33);
	//    7   13:aload_0         
	//    8   14:new             #151 <Class StyleSpan>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokevirtual   #185 <Method int WebvttCssStyle.getStyle()>
	//   12   22:invokespecial   #154 <Method void StyleSpan(int)>
	//   13   25:iload_2         
	//   14   26:iload_3         
	//   15   27:bipush          33
	//   16   29:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(webvttcssstyle.isLinethrough())
	//*  17   32:aload_1         
	//*  18   33:invokevirtual   #189 <Method boolean WebvttCssStyle.isLinethrough()>
	//*  19   36:ifeq            54
			spannablestringbuilder.setSpan(((Object) (new StrikethroughSpan())), i, j, 33);
	//   20   39:aload_0         
	//   21   40:new             #191 <Class StrikethroughSpan>
	//   22   43:dup             
	//   23   44:invokespecial   #192 <Method void StrikethroughSpan()>
	//   24   47:iload_2         
	//   25   48:iload_3         
	//   26   49:bipush          33
	//   27   51:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(webvttcssstyle.isUnderline())
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #195 <Method boolean WebvttCssStyle.isUnderline()>
	//*  30   58:ifeq            76
			spannablestringbuilder.setSpan(((Object) (new UnderlineSpan())), i, j, 33);
	//   31   61:aload_0         
	//   32   62:new             #144 <Class UnderlineSpan>
	//   33   65:dup             
	//   34   66:invokespecial   #145 <Method void UnderlineSpan()>
	//   35   69:iload_2         
	//   36   70:iload_3         
	//   37   71:bipush          33
	//   38   73:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(webvttcssstyle.hasFontColor())
	//*  39   76:aload_1         
	//*  40   77:invokevirtual   #198 <Method boolean WebvttCssStyle.hasFontColor()>
	//*  41   80:ifeq            102
			spannablestringbuilder.setSpan(((Object) (new ForegroundColorSpan(webvttcssstyle.getFontColor()))), i, j, 33);
	//   42   83:aload_0         
	//   43   84:new             #200 <Class ForegroundColorSpan>
	//   44   87:dup             
	//   45   88:aload_1         
	//   46   89:invokevirtual   #203 <Method int WebvttCssStyle.getFontColor()>
	//   47   92:invokespecial   #204 <Method void ForegroundColorSpan(int)>
	//   48   95:iload_2         
	//   49   96:iload_3         
	//   50   97:bipush          33
	//   51   99:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(webvttcssstyle.hasBackgroundColor())
	//*  52  102:aload_1         
	//*  53  103:invokevirtual   #207 <Method boolean WebvttCssStyle.hasBackgroundColor()>
	//*  54  106:ifeq            128
			spannablestringbuilder.setSpan(((Object) (new BackgroundColorSpan(webvttcssstyle.getBackgroundColor()))), i, j, 33);
	//   55  109:aload_0         
	//   56  110:new             #209 <Class BackgroundColorSpan>
	//   57  113:dup             
	//   58  114:aload_1         
	//   59  115:invokevirtual   #212 <Method int WebvttCssStyle.getBackgroundColor()>
	//   60  118:invokespecial   #213 <Method void BackgroundColorSpan(int)>
	//   61  121:iload_2         
	//   62  122:iload_3         
	//   63  123:bipush          33
	//   64  125:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(webvttcssstyle.getFontFamily() != null)
	//*  65  128:aload_1         
	//*  66  129:invokevirtual   #216 <Method String WebvttCssStyle.getFontFamily()>
	//*  67  132:ifnull          154
			spannablestringbuilder.setSpan(((Object) (new TypefaceSpan(webvttcssstyle.getFontFamily()))), i, j, 33);
	//   68  135:aload_0         
	//   69  136:new             #218 <Class TypefaceSpan>
	//   70  139:dup             
	//   71  140:aload_1         
	//   72  141:invokevirtual   #216 <Method String WebvttCssStyle.getFontFamily()>
	//   73  144:invokespecial   #221 <Method void TypefaceSpan(String)>
	//   74  147:iload_2         
	//   75  148:iload_3         
	//   76  149:bipush          33
	//   77  151:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(webvttcssstyle.getTextAlign() != null)
	//*  78  154:aload_1         
	//*  79  155:invokevirtual   #225 <Method android.text.Layout$Alignment WebvttCssStyle.getTextAlign()>
	//*  80  158:ifnull          180
			spannablestringbuilder.setSpan(((Object) (new android.text.style.AlignmentSpan.Standard(webvttcssstyle.getTextAlign()))), i, j, 33);
	//   81  161:aload_0         
	//   82  162:new             #227 <Class android.text.style.AlignmentSpan$Standard>
	//   83  165:dup             
	//   84  166:aload_1         
	//   85  167:invokevirtual   #225 <Method android.text.Layout$Alignment WebvttCssStyle.getTextAlign()>
	//   86  170:invokespecial   #230 <Method void android.text.style.AlignmentSpan$Standard(android.text.Layout$Alignment)>
	//   87  173:iload_2         
	//   88  174:iload_3         
	//   89  175:bipush          33
	//   90  177:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		switch(webvttcssstyle.getFontSizeUnit())
	//*  91  180:aload_1         
	//*  92  181:invokevirtual   #233 <Method int WebvttCssStyle.getFontSizeUnit()>
		{
	//*  93  184:tableswitch     1 3: default 212
	//	               1 256
	//	               2 236
	//	               3 213
		default:
			return;
	//   94  212:return          

		case 3: // '\003'
			spannablestringbuilder.setSpan(((Object) (new RelativeSizeSpan(webvttcssstyle.getFontSize() / 100F))), i, j, 33);
	//   95  213:aload_0         
	//   96  214:new             #235 <Class RelativeSizeSpan>
	//   97  217:dup             
	//   98  218:aload_1         
	//   99  219:invokevirtual   #239 <Method float WebvttCssStyle.getFontSize()>
	//  100  222:ldc1            #240 <Float 100F>
	//  101  224:fdiv            
	//  102  225:invokespecial   #243 <Method void RelativeSizeSpan(float)>
	//  103  228:iload_2         
	//  104  229:iload_3         
	//  105  230:bipush          33
	//  106  232:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			return;
	//  107  235:return          

		case 2: // '\002'
			spannablestringbuilder.setSpan(((Object) (new RelativeSizeSpan(webvttcssstyle.getFontSize()))), i, j, 33);
	//  108  236:aload_0         
	//  109  237:new             #235 <Class RelativeSizeSpan>
	//  110  240:dup             
	//  111  241:aload_1         
	//  112  242:invokevirtual   #239 <Method float WebvttCssStyle.getFontSize()>
	//  113  245:invokespecial   #243 <Method void RelativeSizeSpan(float)>
	//  114  248:iload_2         
	//  115  249:iload_3         
	//  116  250:bipush          33
	//  117  252:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			return;
	//  118  255:return          

		case 1: // '\001'
			spannablestringbuilder.setSpan(((Object) (new AbsoluteSizeSpan((int)webvttcssstyle.getFontSize(), true))), i, j, 33);
	//  119  256:aload_0         
	//  120  257:new             #245 <Class AbsoluteSizeSpan>
	//  121  260:dup             
	//  122  261:aload_1         
	//  123  262:invokevirtual   #239 <Method float WebvttCssStyle.getFontSize()>
	//  124  265:f2i             
	//  125  266:iconst_1        
	//  126  267:invokespecial   #248 <Method void AbsoluteSizeSpan(int, boolean)>
	//  127  270:iload_2         
	//  128  271:iload_3         
	//  129  272:bipush          33
	//  130  274:invokevirtual   #149 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			return;
	//  131  277:return          
		}
	}

	private static int findEndOfTag(String s, int i)
	{
		i = s.indexOf('>', i);
	//    0    0:aload_0         
	//    1    1:bipush          62
	//    2    3:iload_1         
	//    3    4:invokevirtual   #254 <Method int String.indexOf(int, int)>
	//    4    7:istore_1        
		if(i == -1)
	//*   5    8:iload_1         
	//*   6    9:iconst_m1       
	//*   7   10:icmpne          18
			return s.length();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #255 <Method int String.length()>
	//   10   17:ireturn         
		else
			return i + 1;
	//   11   18:iload_1         
	//   12   19:iconst_1        
	//   13   20:iadd            
	//   14   21:ireturn         
	}

	private static void getApplicableStyles(List list, String s, StartTag starttag, List list1)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #166 <Method int List.size()>
	//    2    6:istore          5
		for(int i = 0; i < j; i++)
	//*   3    8:iconst_0        
	//*   4    9:istore          4
	//*   5   11:iload           4
	//*   6   13:iload           5
	//*   7   15:icmpge          83
		{
			WebvttCssStyle webvttcssstyle = (WebvttCssStyle)list.get(i);
	//    8   18:aload_0         
	//    9   19:iload           4
	//   10   21:invokeinterface #170 <Method Object List.get(int)>
	//   11   26:checkcast       #182 <Class WebvttCssStyle>
	//   12   29:astore          7
			int k = webvttcssstyle.getSpecificityScore(s, starttag.name, starttag.classes, starttag.voice);
	//   13   31:aload           7
	//   14   33:aload_1         
	//   15   34:aload_2         
	//   16   35:getfield        #140 <Field String WebvttCueParser$StartTag.name>
	//   17   38:aload_2         
	//   18   39:getfield        #259 <Field String[] WebvttCueParser$StartTag.classes>
	//   19   42:aload_2         
	//   20   43:getfield        #262 <Field String WebvttCueParser$StartTag.voice>
	//   21   46:invokevirtual   #266 <Method int WebvttCssStyle.getSpecificityScore(String, String, String[], String)>
	//   22   49:istore          6
			if(k > 0)
	//*  23   51:iload           6
	//*  24   53:ifle            74
				list1.add(((Object) (new StyleMatch(k, webvttcssstyle))));
	//   25   56:aload_3         
	//   26   57:new             #9   <Class WebvttCueParser$StyleMatch>
	//   27   60:dup             
	//   28   61:iload           6
	//   29   63:aload           7
	//   30   65:invokespecial   #269 <Method void WebvttCueParser$StyleMatch(int, WebvttCssStyle)>
	//   31   68:invokeinterface #272 <Method boolean List.add(Object)>
	//   32   73:pop             
		}

	//   33   74:iload           4
	//   34   76:iconst_1        
	//   35   77:iadd            
	//   36   78:istore          4
	//*  37   80:goto            11
		Collections.sort(list1);
	//   38   83:aload_3         
	//   39   84:invokestatic    #278 <Method void Collections.sort(List)>
	//   40   87:return          
	}

	private static String getTagName(String s)
	{
		s = s.trim();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #284 <Method String String.trim()>
	//    2    4:astore_0        
		if(s.isEmpty())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #287 <Method boolean String.isEmpty()>
	//*   5    9:ifeq            14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return Util.splitAtFirst(s, "[ \\.]")[0];
	//    8   14:aload_0         
	//    9   15:ldc2            #289 <String "[ \\.]">
	//   10   18:invokestatic    #295 <Method String[] Util.splitAtFirst(String, String)>
	//   11   21:iconst_0        
	//   12   22:aaload          
	//   13   23:areturn         
	}

	private static boolean isSupportedTag(String s)
	{
		byte byte0;
label0:
		{
			switch(s.hashCode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #100 <Method int String.hashCode()>
			{
			default:
				break;

	//*   2    4:lookupswitch    6: default 64
	//	               98: 137
	//	               99: 123
	//	               105: 109
	//	               117: 95
	//	               118: 81
	//	               3314158: 67
	//*   3   64:goto            151
			case 3314158: 
				if(s.equals("lang"))
	//*   4   67:aload_0         
	//*   5   68:ldc1            #59  <String "lang">
	//*   6   70:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*   7   73:ifeq            151
				{
					byte0 = 3;
	//    8   76:iconst_3        
	//    9   77:istore_1        
					break label0;
	//   10   78:goto            153
				}
				break;

			case 118: // 'v'
				if(!s.equals("v"))
					break;
	//   11   81:aload_0         
	//   12   82:ldc1            #65  <String "v">
	//   13   84:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   14   87:ifeq            151
				byte0 = 5;
	//   15   90:iconst_5        
	//   16   91:istore_1        
				break label0;
	//   17   92:goto            153

			case 117: // 'u'
				if(!s.equals("u"))
					break;
	//   18   95:aload_0         
	//   19   96:ldc1            #62  <String "u">
	//   20   98:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   21  101:ifeq            151
				byte0 = 4;
	//   22  104:iconst_4        
	//   23  105:istore_1        
				break label0;
	//   24  106:goto            153

			case 105: // 'i'
				if(!s.equals("i"))
					break;
	//   25  109:aload_0         
	//   26  110:ldc1            #56  <String "i">
	//   27  112:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   28  115:ifeq            151
				byte0 = 2;
	//   29  118:iconst_2        
	//   30  119:istore_1        
				break label0;
	//   31  120:goto            153

			case 99: // 'c'
				if(!s.equals("c"))
					break;
	//   32  123:aload_0         
	//   33  124:ldc1            #53  <String "c">
	//   34  126:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   35  129:ifeq            151
				byte0 = 1;
	//   36  132:iconst_1        
	//   37  133:istore_1        
				break label0;
	//   38  134:goto            153

			case 98: // 'b'
				if(!s.equals("b"))
					break;
	//   39  137:aload_0         
	//   40  138:ldc1            #50  <String "b">
	//   41  140:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   42  143:ifeq            151
				byte0 = 0;
	//   43  146:iconst_0        
	//   44  147:istore_1        
				break label0;
	//   45  148:goto            153
			}
			byte0 = -1;
	//   46  151:iconst_m1       
	//   47  152:istore_1        
		}
		switch(byte0)
	//*  48  153:iload_1         
		{
	//*  49  154:tableswitch     0 5: default 192
	//	               0 194
	//	               1 194
	//	               2 194
	//	               3 194
	//	               4 194
	//	               5 194
		default:
			return false;
	//   50  192:iconst_0        
	//   51  193:ireturn         

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			return true;
	//   52  194:iconst_1        
	//   53  195:ireturn         
		}
	}

	private static boolean parseCue(String s, Matcher matcher, ParsableByteArray parsablebytearray, WebvttCue.Builder builder, StringBuilder stringbuilder, List list)
	{
		try
		{
			builder.setStartTime(WebvttParserUtil.parseTimestampUs(matcher.group(1))).setEndTime(WebvttParserUtil.parseTimestampUs(matcher.group(2)));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #307 <Method String Matcher.group(int)>
	//    4    6:invokestatic    #313 <Method long WebvttParserUtil.parseTimestampUs(String)>
	//    5    9:invokevirtual   #319 <Method WebvttCue$Builder WebvttCue$Builder.setStartTime(long)>
	//    6   12:aload_1         
	//    7   13:iconst_2        
	//    8   14:invokevirtual   #307 <Method String Matcher.group(int)>
	//    9   17:invokestatic    #313 <Method long WebvttParserUtil.parseTimestampUs(String)>
	//   10   20:invokevirtual   #322 <Method WebvttCue$Builder WebvttCue$Builder.setEndTime(long)>
	//   11   23:pop             
		}
	//*  12   24:aload_1         
	//*  13   25:iconst_3        
	//*  14   26:invokevirtual   #307 <Method String Matcher.group(int)>
	//*  15   29:aload_3         
	//*  16   30:invokestatic    #326 <Method void parseCueSettingsList(String, WebvttCue$Builder)>
	//*  17   33:aload           4
	//*  18   35:iconst_0        
	//*  19   36:invokevirtual   #329 <Method void StringBuilder.setLength(int)>
	//*  20   39:aload_2         
	//*  21   40:invokevirtual   #334 <Method String ParsableByteArray.readLine()>
	//*  22   43:astore_1        
	//*  23   44:aload_1         
	//*  24   45:invokestatic    #339 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  25   48:ifne            81
	//*  26   51:aload           4
	//*  27   53:invokevirtual   #340 <Method int StringBuilder.length()>
	//*  28   56:ifle            68
	//*  29   59:aload           4
	//*  30   61:ldc2            #342 <String "\n">
	//*  31   64:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//*  32   67:pop             
	//*  33   68:aload           4
	//*  34   70:aload_1         
	//*  35   71:invokevirtual   #284 <Method String String.trim()>
	//*  36   74:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//*  37   77:pop             
	//*  38   78:goto            39
	//*  39   81:aload_0         
	//*  40   82:aload           4
	//*  41   84:invokevirtual   #118 <Method String StringBuilder.toString()>
	//*  42   87:aload_3         
	//*  43   88:aload           5
	//*  44   90:invokestatic    #346 <Method void parseCueText(String, String, WebvttCue$Builder, List)>
	//*  45   93:iconst_1        
	//*  46   94:ireturn         
	//*  47   95:new             #89  <Class StringBuilder>
	//*  48   98:dup             
	//*  49   99:invokespecial   #90  <Method void StringBuilder()>
	//*  50  102:astore_0        
	//*  51  103:aload_0         
	//*  52  104:ldc2            #348 <String "Skipping cue with bad header: ">
	//*  53  107:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//*  54  110:pop             
	//*  55  111:aload_0         
	//*  56  112:aload_1         
	//*  57  113:invokevirtual   #350 <Method String Matcher.group()>
	//*  58  116:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//*  59  119:pop             
	//*  60  120:ldc1            #47  <String "WebvttCueParser">
	//*  61  122:aload_0         
	//*  62  123:invokevirtual   #118 <Method String StringBuilder.toString()>
	//*  63  126:invokestatic    #124 <Method int Log.w(String, String)>
	//*  64  129:pop             
	//*  65  130:iconst_0        
	//*  66  131:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			s = ((String) (new StringBuilder()));
			((StringBuilder) (s)).append("Skipping cue with bad header: ");
			((StringBuilder) (s)).append(matcher.group());
			Log.w("WebvttCueParser", ((StringBuilder) (s)).toString());
			return false;
		}
		parseCueSettingsList(matcher.group(3), builder);
		stringbuilder.setLength(0);
		do
		{
			matcher = ((Matcher) (parsablebytearray.readLine()));
			if(!TextUtils.isEmpty(((CharSequence) (matcher))))
			{
				if(stringbuilder.length() > 0)
					stringbuilder.append("\n");
				stringbuilder.append(((String) (matcher)).trim());
			} else
			{
				parseCueText(s, stringbuilder.toString(), builder, list);
				return true;
			}
		} while(true);
	//*  67  132:astore_0        
	//*  68  133:goto            95
	}

	static void parseCueSettingsList(String s, WebvttCue.Builder builder)
	{
		s = ((String) (CUE_SETTING_PATTERN.matcher(((CharSequence) (s)))));
	//    0    0:getstatic       #83  <Field Pattern CUE_SETTING_PATTERN>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #355 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_0        
_L2:
		Object obj;
		String s1;
		if(!((Matcher) (s)).find())
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:invokevirtual   #358 <Method boolean Matcher.find()>
	//    6   12:ifeq            200
		obj = ((Object) (((Matcher) (s)).group(1)));
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #307 <Method String Matcher.group(int)>
	//   10   20:astore_2        
		s1 = ((Matcher) (s)).group(2);
	//   11   21:aload_0         
	//   12   22:iconst_2        
	//   13   23:invokevirtual   #307 <Method String Matcher.group(int)>
	//   14   26:astore_3        
		if("line".equals(obj))
	//*  15   27:ldc2            #360 <String "line">
	//*  16   30:aload_2         
	//*  17   31:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  18   34:ifeq            45
		{
			parseLineAttribute(s1, builder);
	//   19   37:aload_3         
	//   20   38:aload_1         
	//   21   39:invokestatic    #363 <Method void parseLineAttribute(String, WebvttCue$Builder)>
			continue; /* Loop/switch isn't completed */
	//   22   42:goto            8
		}
		if("align".equals(obj))
	//*  23   45:ldc2            #365 <String "align">
	//*  24   48:aload_2         
	//*  25   49:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  26   52:ifeq            67
		{
			builder.setTextAlignment(parseTextAlignment(s1));
	//   27   55:aload_1         
	//   28   56:aload_3         
	//   29   57:invokestatic    #369 <Method android.text.Layout$Alignment parseTextAlignment(String)>
	//   30   60:invokevirtual   #373 <Method WebvttCue$Builder WebvttCue$Builder.setTextAlignment(android.text.Layout$Alignment)>
	//   31   63:pop             
			continue; /* Loop/switch isn't completed */
	//   32   64:goto            8
		}
		if("position".equals(obj))
	//*  33   67:ldc2            #374 <String "position">
	//*  34   70:aload_2         
	//*  35   71:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  36   74:ifeq            85
		{
			parsePositionAttribute(s1, builder);
	//   37   77:aload_3         
	//   38   78:aload_1         
	//   39   79:invokestatic    #377 <Method void parsePositionAttribute(String, WebvttCue$Builder)>
			continue; /* Loop/switch isn't completed */
	//   40   82:goto            8
		}
		if("size".equals(obj))
	//*  41   85:ldc2            #378 <String "size">
	//*  42   88:aload_2         
	//*  43   89:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  44   92:ifeq            107
		{
			builder.setWidth(WebvttParserUtil.parsePercentage(s1));
	//   45   95:aload_1         
	//   46   96:aload_3         
	//   47   97:invokestatic    #382 <Method float WebvttParserUtil.parsePercentage(String)>
	//   48  100:invokevirtual   #386 <Method WebvttCue$Builder WebvttCue$Builder.setWidth(float)>
	//   49  103:pop             
			continue; /* Loop/switch isn't completed */
	//   50  104:goto            8
		}
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   51  107:new             #89  <Class StringBuilder>
	//   52  110:dup             
	//   53  111:invokespecial   #90  <Method void StringBuilder()>
	//   54  114:astore          4
			stringbuilder.append("Unknown cue setting ");
	//   55  116:aload           4
	//   56  118:ldc2            #388 <String "Unknown cue setting ">
	//   57  121:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   58  124:pop             
			stringbuilder.append(((String) (obj)));
	//   59  125:aload           4
	//   60  127:aload_2         
	//   61  128:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   62  131:pop             
			stringbuilder.append(":");
	//   63  132:aload           4
	//   64  134:ldc2            #390 <String ":">
	//   65  137:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   66  140:pop             
			stringbuilder.append(s1);
	//   67  141:aload           4
	//   68  143:aload_3         
	//   69  144:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   70  147:pop             
			Log.w("WebvttCueParser", stringbuilder.toString());
	//   71  148:ldc1            #47  <String "WebvttCueParser">
	//   72  150:aload           4
	//   73  152:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   74  155:invokestatic    #124 <Method int Log.w(String, String)>
	//   75  158:pop             
		}
	//*  76  159:goto            8
	//*  77  162:new             #89  <Class StringBuilder>
	//*  78  165:dup             
	//*  79  166:invokespecial   #90  <Method void StringBuilder()>
	//*  80  169:astore_2        
	//*  81  170:aload_2         
	//*  82  171:ldc2            #392 <String "Skipping bad cue setting: ">
	//*  83  174:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//*  84  177:pop             
	//*  85  178:aload_2         
	//*  86  179:aload_0         
	//*  87  180:invokevirtual   #350 <Method String Matcher.group()>
	//*  88  183:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//*  89  186:pop             
	//*  90  187:ldc1            #47  <String "WebvttCueParser">
	//*  91  189:aload_2         
	//*  92  190:invokevirtual   #118 <Method String StringBuilder.toString()>
	//*  93  193:invokestatic    #124 <Method int Log.w(String, String)>
	//*  94  196:pop             
	//*  95  197:goto            8
	//*  96  200:return          
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Skipping bad cue setting: ");
			((StringBuilder) (obj)).append(((Matcher) (s)).group());
			Log.w("WebvttCueParser", ((StringBuilder) (obj)).toString());
		}
		if(true) goto _L2; else goto _L1
_L1:
		NumberFormatException numberformatexception;
	//*  97  201:astore_2        
	//*  98  202:goto            162
	}

	static void parseCueText(String s, String s1, WebvttCue.Builder builder, List list)
	{
		SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//    0    0:new             #126 <Class SpannableStringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #393 <Method void SpannableStringBuilder()>
	//    3    7:astore          11
		ArrayDeque arraydeque = new ArrayDeque();
	//    4    9:new             #395 <Class ArrayDeque>
	//    5   12:dup             
	//    6   13:invokespecial   #396 <Method void ArrayDeque()>
	//    7   16:astore          12
		ArrayList arraylist = new ArrayList();
	//    8   18:new             #398 <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #399 <Method void ArrayList()>
	//   11   25:astore          13
		int i = 0;
	//   12   27:iconst_0        
	//   13   28:istore          5
label0:
		do
		{
			if(i >= s1.length())
				break;
	//   14   30:iload           5
	//   15   32:aload_1         
	//   16   33:invokevirtual   #255 <Method int String.length()>
	//   17   36:icmpge          435
			char c = s1.charAt(i);
	//   18   39:aload_1         
	//   19   40:iload           5
	//   20   42:invokevirtual   #403 <Method char String.charAt(int)>
	//   21   45:istore          4
			if(c != '&')
	//*  22   47:iload           4
	//*  23   49:bipush          38
	//*  24   51:icmpeq          319
			{
				if(c != '<')
	//*  25   54:iload           4
	//*  26   56:bipush          60
	//*  27   58:icmpeq          78
				{
					spannablestringbuilder.append(c);
	//   28   61:aload           11
	//   29   63:iload           4
	//   30   65:invokevirtual   #129 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   31   68:pop             
					i++;
	//   32   69:iload           5
	//   33   71:iconst_1        
	//   34   72:iadd            
	//   35   73:istore          5
					continue;
	//   36   75:goto            30
				}
				int k = i + 1;
	//   37   78:iload           5
	//   38   80:iconst_1        
	//   39   81:iadd            
	//   40   82:istore          7
				if(k >= s1.length())
	//*  41   84:iload           7
	//*  42   86:aload_1         
	//*  43   87:invokevirtual   #255 <Method int String.length()>
	//*  44   90:icmplt          100
				{
					i = k;
	//   45   93:iload           7
	//   46   95:istore          5
					continue;
	//   47   97:goto            316
				}
				char c1 = s1.charAt(k);
	//   48  100:aload_1         
	//   49  101:iload           7
	//   50  103:invokevirtual   #403 <Method char String.charAt(int)>
	//   51  106:istore          6
				byte byte0 = 1;
	//   52  108:iconst_1        
	//   53  109:istore          8
				boolean flag;
				if(c1 == '/')
	//*  54  111:iload           6
	//*  55  113:bipush          47
	//*  56  115:icmpne          124
					flag = true;
	//   57  118:iconst_1        
	//   58  119:istore          6
				else
	//*  59  121:goto            127
					flag = false;
	//   60  124:iconst_0        
	//   61  125:istore          6
				int j1 = findEndOfTag(s1, k);
	//   62  127:aload_1         
	//   63  128:iload           7
	//   64  130:invokestatic    #405 <Method int findEndOfTag(String, int)>
	//   65  133:istore          10
				int i1 = j1 - 2;
	//   66  135:iload           10
	//   67  137:iconst_2        
	//   68  138:isub            
	//   69  139:istore          9
				boolean flag1;
				if(s1.charAt(i1) == '/')
	//*  70  141:aload_1         
	//*  71  142:iload           9
	//*  72  144:invokevirtual   #403 <Method char String.charAt(int)>
	//*  73  147:bipush          47
	//*  74  149:icmpne          158
					flag1 = true;
	//   75  152:iconst_1        
	//   76  153:istore          7
				else
	//*  77  155:goto            161
					flag1 = false;
	//   78  158:iconst_0        
	//   79  159:istore          7
				if(flag)
	//*  80  161:iload           6
	//*  81  163:ifeq            169
					byte0 = 2;
	//   82  166:iconst_2        
	//   83  167:istore          8
				if(!flag1)
	//*  84  169:iload           7
	//*  85  171:ifeq            177
	//*  86  174:goto            183
					i1 = j1 - 1;
	//   87  177:iload           10
	//   88  179:iconst_1        
	//   89  180:isub            
	//   90  181:istore          9
				Object obj = ((Object) (s1.substring(i + byte0, i1)));
	//   91  183:aload_1         
	//   92  184:iload           5
	//   93  186:iload           8
	//   94  188:iadd            
	//   95  189:iload           9
	//   96  191:invokevirtual   #409 <Method String String.substring(int, int)>
	//   97  194:astore          15
				String s2 = getTagName(((String) (obj)));
	//   98  196:aload           15
	//   99  198:invokestatic    #411 <Method String getTagName(String)>
	//  100  201:astore          14
				i = j1;
	//  101  203:iload           10
	//  102  205:istore          5
				if(s2 == null)
					continue;
	//  103  207:aload           14
	//  104  209:ifnull          316
				if(!isSupportedTag(s2))
	//* 105  212:aload           14
	//* 106  214:invokestatic    #413 <Method boolean isSupportedTag(String)>
	//* 107  217:ifne            227
				{
					i = j1;
	//  108  220:iload           10
	//  109  222:istore          5
					continue;
	//  110  224:goto            316
				}
				if(flag)
	//* 111  227:iload           6
	//* 112  229:ifeq            288
				{
					do
					{
						if(arraydeque.isEmpty())
	//* 113  232:aload           12
	//* 114  234:invokevirtual   #414 <Method boolean ArrayDeque.isEmpty()>
	//* 115  237:ifeq            247
						{
							i = j1;
	//  116  240:iload           10
	//  117  242:istore          5
							continue label0;
	//  118  244:goto            316
						}
						obj = ((Object) ((StartTag)arraydeque.pop()));
	//  119  247:aload           12
	//  120  249:invokevirtual   #418 <Method Object ArrayDeque.pop()>
	//  121  252:checkcast       #6   <Class WebvttCueParser$StartTag>
	//  122  255:astore          15
						applySpansForTag(s, ((StartTag) (obj)), spannablestringbuilder, list, ((List) (arraylist)));
	//  123  257:aload_0         
	//  124  258:aload           15
	//  125  260:aload           11
	//  126  262:aload_3         
	//  127  263:aload           13
	//  128  265:invokestatic    #420 <Method void applySpansForTag(String, WebvttCueParser$StartTag, SpannableStringBuilder, List, List)>
					} while(!((StartTag) (obj)).name.equals(((Object) (s2))));
	//  129  268:aload           15
	//  130  270:getfield        #140 <Field String WebvttCueParser$StartTag.name>
	//  131  273:aload           14
	//  132  275:invokevirtual   #106 <Method boolean String.equals(Object)>
	//  133  278:ifeq            232
					i = j1;
	//  134  281:iload           10
	//  135  283:istore          5
				} else
	//* 136  285:goto            316
				{
					i = j1;
	//  137  288:iload           10
	//  138  290:istore          5
					if(!flag1)
	//* 139  292:iload           7
	//* 140  294:ifne            316
					{
						arraydeque.push(((Object) (StartTag.buildStartTag(((String) (obj)), spannablestringbuilder.length()))));
	//  141  297:aload           12
	//  142  299:aload           15
	//  143  301:aload           11
	//  144  303:invokevirtual   #137 <Method int SpannableStringBuilder.length()>
	//  145  306:invokestatic    #424 <Method WebvttCueParser$StartTag WebvttCueParser$StartTag.buildStartTag(String, int)>
	//  146  309:invokevirtual   #428 <Method void ArrayDeque.push(Object)>
						i = j1;
	//  147  312:iload           10
	//  148  314:istore          5
					}
				}
			} else
	//* 149  316:goto            30
			{
				int j = i + 1;
	//  150  319:iload           5
	//  151  321:iconst_1        
	//  152  322:iadd            
	//  153  323:istore          6
				i = s1.indexOf(';', j);
	//  154  325:aload_1         
	//  155  326:bipush          59
	//  156  328:iload           6
	//  157  330:invokevirtual   #254 <Method int String.indexOf(int, int)>
	//  158  333:istore          5
				int l = s1.indexOf(' ', j);
	//  159  335:aload_1         
	//  160  336:bipush          32
	//  161  338:iload           6
	//  162  340:invokevirtual   #254 <Method int String.indexOf(int, int)>
	//  163  343:istore          7
				if(i == -1)
	//* 164  345:iload           5
	//* 165  347:iconst_m1       
	//* 166  348:icmpne          358
					i = l;
	//  167  351:iload           7
	//  168  353:istore          5
				else
	//* 169  355:goto            376
				if(l != -1)
	//* 170  358:iload           7
	//* 171  360:iconst_m1       
	//* 172  361:icmpne          367
	//* 173  364:goto            376
					i = Math.min(i, l);
	//  174  367:iload           5
	//  175  369:iload           7
	//  176  371:invokestatic    #433 <Method int Math.min(int, int)>
	//  177  374:istore          5
				if(i != -1)
	//* 178  376:iload           5
	//* 179  378:iconst_m1       
	//* 180  379:icmpeq          420
				{
					applyEntity(s1.substring(j, i), spannablestringbuilder);
	//  181  382:aload_1         
	//  182  383:iload           6
	//  183  385:iload           5
	//  184  387:invokevirtual   #409 <Method String String.substring(int, int)>
	//  185  390:aload           11
	//  186  392:invokestatic    #435 <Method void applyEntity(String, SpannableStringBuilder)>
					if(i == l)
	//* 187  395:iload           5
	//* 188  397:iload           7
	//* 189  399:icmpne          411
						spannablestringbuilder.append(" ");
	//  190  402:aload           11
	//  191  404:ldc2            #437 <String " ">
	//  192  407:invokevirtual   #440 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//  193  410:pop             
					i++;
	//  194  411:iload           5
	//  195  413:iconst_1        
	//  196  414:iadd            
	//  197  415:istore          5
				} else
	//* 198  417:goto            30
				{
					spannablestringbuilder.append(c);
	//  199  420:aload           11
	//  200  422:iload           4
	//  201  424:invokevirtual   #129 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//  202  427:pop             
					i = j;
	//  203  428:iload           6
	//  204  430:istore          5
				}
			}
		} while(true);
	//  205  432:goto            30
		for(; !arraydeque.isEmpty(); applySpansForTag(s, (StartTag)arraydeque.pop(), spannablestringbuilder, list, ((List) (arraylist))));
	//  206  435:aload           12
	//  207  437:invokevirtual   #414 <Method boolean ArrayDeque.isEmpty()>
	//  208  440:ifne            463
	//  209  443:aload_0         
	//  210  444:aload           12
	//  211  446:invokevirtual   #418 <Method Object ArrayDeque.pop()>
	//  212  449:checkcast       #6   <Class WebvttCueParser$StartTag>
	//  213  452:aload           11
	//  214  454:aload_3         
	//  215  455:aload           13
	//  216  457:invokestatic    #420 <Method void applySpansForTag(String, WebvttCueParser$StartTag, SpannableStringBuilder, List, List)>
	//* 217  460:goto            435
		applySpansForTag(s, StartTag.buildWholeCueVirtualTag(), spannablestringbuilder, list, ((List) (arraylist)));
	//  218  463:aload_0         
	//  219  464:invokestatic    #444 <Method WebvttCueParser$StartTag WebvttCueParser$StartTag.buildWholeCueVirtualTag()>
	//  220  467:aload           11
	//  221  469:aload_3         
	//  222  470:aload           13
	//  223  472:invokestatic    #420 <Method void applySpansForTag(String, WebvttCueParser$StartTag, SpannableStringBuilder, List, List)>
		builder.setText(spannablestringbuilder);
	//  224  475:aload_2         
	//  225  476:aload           11
	//  226  478:invokevirtual   #448 <Method WebvttCue$Builder WebvttCue$Builder.setText(SpannableStringBuilder)>
	//  227  481:pop             
	//  228  482:return          
	}

	private static void parseLineAttribute(String s, WebvttCue.Builder builder)
		throws NumberFormatException
	{
		int i = s.indexOf(',');
	//    0    0:aload_0         
	//    1    1:bipush          44
	//    2    3:invokevirtual   #452 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		if(i != -1)
	//*   4    7:iload_2         
	//*   5    8:iconst_m1       
	//*   6    9:icmpeq          37
		{
			builder.setLineAnchor(parsePositionAnchor(s.substring(i + 1)));
	//    7   12:aload_1         
	//    8   13:aload_0         
	//    9   14:iload_2         
	//   10   15:iconst_1        
	//   11   16:iadd            
	//   12   17:invokevirtual   #454 <Method String String.substring(int)>
	//   13   20:invokestatic    #458 <Method int parsePositionAnchor(String)>
	//   14   23:invokevirtual   #462 <Method WebvttCue$Builder WebvttCue$Builder.setLineAnchor(int)>
	//   15   26:pop             
			s = s.substring(0, i);
	//   16   27:aload_0         
	//   17   28:iconst_0        
	//   18   29:iload_2         
	//   19   30:invokevirtual   #409 <Method String String.substring(int, int)>
	//   20   33:astore_0        
		} else
	//*  21   34:goto            45
		{
			builder.setLineAnchor(0x80000000);
	//   22   37:aload_1         
	//   23   38:ldc2            #463 <Int 0x80000000>
	//   24   41:invokevirtual   #462 <Method WebvttCue$Builder WebvttCue$Builder.setLineAnchor(int)>
	//   25   44:pop             
		}
		if(s.endsWith("%"))
	//*  26   45:aload_0         
	//*  27   46:ldc2            #465 <String "%">
	//*  28   49:invokevirtual   #468 <Method boolean String.endsWith(String)>
	//*  29   52:ifeq            69
		{
			builder.setLine(WebvttParserUtil.parsePercentage(s)).setLineType(0);
	//   30   55:aload_1         
	//   31   56:aload_0         
	//   32   57:invokestatic    #382 <Method float WebvttParserUtil.parsePercentage(String)>
	//   33   60:invokevirtual   #471 <Method WebvttCue$Builder WebvttCue$Builder.setLine(float)>
	//   34   63:iconst_0        
	//   35   64:invokevirtual   #474 <Method WebvttCue$Builder WebvttCue$Builder.setLineType(int)>
	//   36   67:pop             
			return;
	//   37   68:return          
		}
		int j = Integer.parseInt(s);
	//   38   69:aload_0         
	//   39   70:invokestatic    #479 <Method int Integer.parseInt(String)>
	//   40   73:istore_3        
		i = j;
	//   41   74:iload_3         
	//   42   75:istore_2        
		if(j < 0)
	//*  43   76:iload_3         
	//*  44   77:ifge            84
			i = j - 1;
	//   45   80:iload_3         
	//   46   81:iconst_1        
	//   47   82:isub            
	//   48   83:istore_2        
		builder.setLine(i).setLineType(1);
	//   49   84:aload_1         
	//   50   85:iload_2         
	//   51   86:i2f             
	//   52   87:invokevirtual   #471 <Method WebvttCue$Builder WebvttCue$Builder.setLine(float)>
	//   53   90:iconst_1        
	//   54   91:invokevirtual   #474 <Method WebvttCue$Builder WebvttCue$Builder.setLineType(int)>
	//   55   94:pop             
	//   56   95:return          
	}

	private static int parsePositionAnchor(String s)
	{
		int i;
label0:
		{
			i = s.hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method int String.hashCode()>
	//    2    4:istore_1        
			if(i != 0xaeb2cc55)
	//*   3    5:iload_1         
	//*   4    6:ldc2            #481 <Int 0xaeb2cc55>
	//*   5    9:icmpeq          81
			{
				if(i != 0xbff6d995)
	//*   6   12:iload_1         
	//*   7   13:ldc2            #482 <Int 0xbff6d995>
	//*   8   16:icmpeq          66
				{
					if(i != 0x188db)
	//*   9   19:iload_1         
	//*  10   20:ldc2            #483 <Int 0x188db>
	//*  11   23:icmpeq          51
					{
						if(i == 0x68ac462 && s.equals("start"))
	//*  12   26:iload_1         
	//*  13   27:ldc2            #484 <Int 0x68ac462>
	//*  14   30:icmpeq          36
	//*  15   33:goto            96
	//*  16   36:aload_0         
	//*  17   37:ldc2            #486 <String "start">
	//*  18   40:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  19   43:ifeq            96
						{
							i = 0;
	//   20   46:iconst_0        
	//   21   47:istore_1        
							break label0;
	//   22   48:goto            98
						}
					} else
					if(s.equals("end"))
	//*  23   51:aload_0         
	//*  24   52:ldc2            #488 <String "end">
	//*  25   55:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  26   58:ifeq            96
					{
						i = 3;
	//   27   61:iconst_3        
	//   28   62:istore_1        
						break label0;
	//   29   63:goto            98
					}
				} else
				if(s.equals("middle"))
	//*  30   66:aload_0         
	//*  31   67:ldc2            #490 <String "middle">
	//*  32   70:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  33   73:ifeq            96
				{
					i = 2;
	//   34   76:iconst_2        
	//   35   77:istore_1        
					break label0;
	//   36   78:goto            98
				}
			} else
			if(s.equals("center"))
	//*  37   81:aload_0         
	//*  38   82:ldc2            #492 <String "center">
	//*  39   85:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*  40   88:ifeq            96
			{
				i = 1;
	//   41   91:iconst_1        
	//   42   92:istore_1        
				break label0;
	//   43   93:goto            98
			}
			i = -1;
	//   44   96:iconst_m1       
	//   45   97:istore_1        
		}
		switch(i)
	//*  46   98:iload_1         
		{
	//*  47   99:tableswitch     0 3: default 128
	//	               0 168
	//	               1 166
	//	               2 166
	//	               3 164
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//   48  128:new             #89  <Class StringBuilder>
	//   49  131:dup             
	//   50  132:invokespecial   #90  <Method void StringBuilder()>
	//   51  135:astore_2        
			stringbuilder.append("Invalid anchor value: ");
	//   52  136:aload_2         
	//   53  137:ldc2            #494 <String "Invalid anchor value: ">
	//   54  140:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   55  143:pop             
			stringbuilder.append(s);
	//   56  144:aload_2         
	//   57  145:aload_0         
	//   58  146:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   59  149:pop             
			Log.w("WebvttCueParser", stringbuilder.toString());
	//   60  150:ldc1            #47  <String "WebvttCueParser">
	//   61  152:aload_2         
	//   62  153:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   63  156:invokestatic    #124 <Method int Log.w(String, String)>
	//   64  159:pop             
			return 0x80000000;
	//   65  160:ldc2            #463 <Int 0x80000000>
	//   66  163:ireturn         

		case 3: // '\003'
			return 2;
	//   67  164:iconst_2        
	//   68  165:ireturn         

		case 1: // '\001'
		case 2: // '\002'
			return 1;
	//   69  166:iconst_1        
	//   70  167:ireturn         

		case 0: // '\0'
			return 0;
	//   71  168:iconst_0        
	//   72  169:ireturn         
		}
	}

	private static void parsePositionAttribute(String s, WebvttCue.Builder builder)
		throws NumberFormatException
	{
		int i = s.indexOf(',');
	//    0    0:aload_0         
	//    1    1:bipush          44
	//    2    3:invokevirtual   #452 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		if(i != -1)
	//*   4    7:iload_2         
	//*   5    8:iconst_m1       
	//*   6    9:icmpeq          37
		{
			builder.setPositionAnchor(parsePositionAnchor(s.substring(i + 1)));
	//    7   12:aload_1         
	//    8   13:aload_0         
	//    9   14:iload_2         
	//   10   15:iconst_1        
	//   11   16:iadd            
	//   12   17:invokevirtual   #454 <Method String String.substring(int)>
	//   13   20:invokestatic    #458 <Method int parsePositionAnchor(String)>
	//   14   23:invokevirtual   #497 <Method WebvttCue$Builder WebvttCue$Builder.setPositionAnchor(int)>
	//   15   26:pop             
			s = s.substring(0, i);
	//   16   27:aload_0         
	//   17   28:iconst_0        
	//   18   29:iload_2         
	//   19   30:invokevirtual   #409 <Method String String.substring(int, int)>
	//   20   33:astore_0        
		} else
	//*  21   34:goto            45
		{
			builder.setPositionAnchor(0x80000000);
	//   22   37:aload_1         
	//   23   38:ldc2            #463 <Int 0x80000000>
	//   24   41:invokevirtual   #497 <Method WebvttCue$Builder WebvttCue$Builder.setPositionAnchor(int)>
	//   25   44:pop             
		}
		builder.setPosition(WebvttParserUtil.parsePercentage(s));
	//   26   45:aload_1         
	//   27   46:aload_0         
	//   28   47:invokestatic    #382 <Method float WebvttParserUtil.parsePercentage(String)>
	//   29   50:invokevirtual   #500 <Method WebvttCue$Builder WebvttCue$Builder.setPosition(float)>
	//   30   53:pop             
	//   31   54:return          
	}

	private static android.text.Layout.Alignment parseTextAlignment(String s)
	{
		byte byte0;
label0:
		{
			switch(s.hashCode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #100 <Method int String.hashCode()>
			{
			default:
				break;

	//*   2    4:lookupswitch    6: default 64
	//	               -1364013995: 142
	//	               -1074341483: 127
	//	               100571: 112
	//	               3317767: 97
	//	               108511772: 82
	//	               109757538: 67
	//*   3   64:goto            157
			case 109757538: 
				if(s.equals("start"))
	//*   4   67:aload_0         
	//*   5   68:ldc2            #486 <String "start">
	//*   6   71:invokevirtual   #106 <Method boolean String.equals(Object)>
	//*   7   74:ifeq            157
				{
					byte0 = 0;
	//    8   77:iconst_0        
	//    9   78:istore_1        
					break label0;
	//   10   79:goto            159
				}
				break;

			case 108511772: 
				if(!s.equals("right"))
					break;
	//   11   82:aload_0         
	//   12   83:ldc2            #502 <String "right">
	//   13   86:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   14   89:ifeq            157
				byte0 = 5;
	//   15   92:iconst_5        
	//   16   93:istore_1        
				break label0;
	//   17   94:goto            159

			case 3317767: 
				if(!s.equals("left"))
					break;
	//   18   97:aload_0         
	//   19   98:ldc2            #504 <String "left">
	//   20  101:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   21  104:ifeq            157
				byte0 = 1;
	//   22  107:iconst_1        
	//   23  108:istore_1        
				break label0;
	//   24  109:goto            159

			case 100571: 
				if(!s.equals("end"))
					break;
	//   25  112:aload_0         
	//   26  113:ldc2            #488 <String "end">
	//   27  116:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   28  119:ifeq            157
				byte0 = 4;
	//   29  122:iconst_4        
	//   30  123:istore_1        
				break label0;
	//   31  124:goto            159

			case -1074341483: 
				if(!s.equals("middle"))
					break;
	//   32  127:aload_0         
	//   33  128:ldc2            #490 <String "middle">
	//   34  131:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   35  134:ifeq            157
				byte0 = 3;
	//   36  137:iconst_3        
	//   37  138:istore_1        
				break label0;
	//   38  139:goto            159

			case -1364013995: 
				if(!s.equals("center"))
					break;
	//   39  142:aload_0         
	//   40  143:ldc2            #492 <String "center">
	//   41  146:invokevirtual   #106 <Method boolean String.equals(Object)>
	//   42  149:ifeq            157
				byte0 = 2;
	//   43  152:iconst_2        
	//   44  153:istore_1        
				break label0;
	//   45  154:goto            159
			}
			byte0 = -1;
	//   46  157:iconst_m1       
	//   47  158:istore_1        
		}
		switch(byte0)
	//*  48  159:iload_1         
		{
	//*  49  160:tableswitch     0 5: default 200
	//	               0 242
	//	               1 242
	//	               2 238
	//	               3 238
	//	               4 234
	//	               5 234
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//   50  200:new             #89  <Class StringBuilder>
	//   51  203:dup             
	//   52  204:invokespecial   #90  <Method void StringBuilder()>
	//   53  207:astore_2        
			stringbuilder.append("Invalid alignment value: ");
	//   54  208:aload_2         
	//   55  209:ldc2            #506 <String "Invalid alignment value: ">
	//   56  212:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   57  215:pop             
			stringbuilder.append(s);
	//   58  216:aload_2         
	//   59  217:aload_0         
	//   60  218:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   61  221:pop             
			Log.w("WebvttCueParser", stringbuilder.toString());
	//   62  222:ldc1            #47  <String "WebvttCueParser">
	//   63  224:aload_2         
	//   64  225:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   65  228:invokestatic    #124 <Method int Log.w(String, String)>
	//   66  231:pop             
			return null;
	//   67  232:aconst_null     
	//   68  233:areturn         

		case 4: // '\004'
		case 5: // '\005'
			return android.text.Layout.Alignment.ALIGN_OPPOSITE;
	//   69  234:getstatic       #512 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_OPPOSITE>
	//   70  237:areturn         

		case 2: // '\002'
		case 3: // '\003'
			return android.text.Layout.Alignment.ALIGN_CENTER;
	//   71  238:getstatic       #515 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_CENTER>
	//   72  241:areturn         

		case 0: // '\0'
		case 1: // '\001'
			return android.text.Layout.Alignment.ALIGN_NORMAL;
	//   73  242:getstatic       #518 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//   74  245:areturn         
		}
	}

	public boolean parseCue(ParsableByteArray parsablebytearray, WebvttCue.Builder builder, List list)
	{
		String s = parsablebytearray.readLine();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method String ParsableByteArray.readLine()>
	//    2    4:astore          4
		if(s == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		Object obj = ((Object) (CUE_HEADER_PATTERN.matcher(((CharSequence) (s)))));
	//    7   13:getstatic       #79  <Field Pattern CUE_HEADER_PATTERN>
	//    8   16:aload           4
	//    9   18:invokevirtual   #355 <Method Matcher Pattern.matcher(CharSequence)>
	//   10   21:astore          5
		if(((Matcher) (obj)).matches())
	//*  11   23:aload           5
	//*  12   25:invokevirtual   #522 <Method boolean Matcher.matches()>
	//*  13   28:ifeq            45
			return parseCue(((String) (null)), ((Matcher) (obj)), parsablebytearray, builder, textBuilder, list);
	//   14   31:aconst_null     
	//   15   32:aload           5
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:aload_0         
	//   19   37:getfield        #92  <Field StringBuilder textBuilder>
	//   20   40:aload_3         
	//   21   41:invokestatic    #524 <Method boolean parseCue(String, Matcher, ParsableByteArray, WebvttCue$Builder, StringBuilder, List)>
	//   22   44:ireturn         
		obj = ((Object) (parsablebytearray.readLine()));
	//   23   45:aload_1         
	//   24   46:invokevirtual   #334 <Method String ParsableByteArray.readLine()>
	//   25   49:astore          5
		if(obj == null)
	//*  26   51:aload           5
	//*  27   53:ifnonnull       58
			return false;
	//   28   56:iconst_0        
	//   29   57:ireturn         
		obj = ((Object) (CUE_HEADER_PATTERN.matcher(((CharSequence) (obj)))));
	//   30   58:getstatic       #79  <Field Pattern CUE_HEADER_PATTERN>
	//   31   61:aload           5
	//   32   63:invokevirtual   #355 <Method Matcher Pattern.matcher(CharSequence)>
	//   33   66:astore          5
		if(((Matcher) (obj)).matches())
	//*  34   68:aload           5
	//*  35   70:invokevirtual   #522 <Method boolean Matcher.matches()>
	//*  36   73:ifeq            94
			return parseCue(s.trim(), ((Matcher) (obj)), parsablebytearray, builder, textBuilder, list);
	//   37   76:aload           4
	//   38   78:invokevirtual   #284 <Method String String.trim()>
	//   39   81:aload           5
	//   40   83:aload_1         
	//   41   84:aload_2         
	//   42   85:aload_0         
	//   43   86:getfield        #92  <Field StringBuilder textBuilder>
	//   44   89:aload_3         
	//   45   90:invokestatic    #524 <Method boolean parseCue(String, Matcher, ParsableByteArray, WebvttCue$Builder, StringBuilder, List)>
	//   46   93:ireturn         
		else
			return false;
	//   47   94:iconst_0        
	//   48   95:ireturn         
	}

	private static final char CHAR_AMPERSAND = 38;
	private static final char CHAR_GREATER_THAN = 62;
	private static final char CHAR_LESS_THAN = 60;
	private static final char CHAR_SEMI_COLON = 59;
	private static final char CHAR_SLASH = 47;
	private static final char CHAR_SPACE = 32;
	public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
	private static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
	private static final String ENTITY_AMPERSAND = "amp";
	private static final String ENTITY_GREATER_THAN = "gt";
	private static final String ENTITY_LESS_THAN = "lt";
	private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
	private static final int STYLE_BOLD = 1;
	private static final int STYLE_ITALIC = 2;
	private static final String TAG = "WebvttCueParser";
	private static final String TAG_BOLD = "b";
	private static final String TAG_CLASS = "c";
	private static final String TAG_ITALIC = "i";
	private static final String TAG_LANG = "lang";
	private static final String TAG_UNDERLINE = "u";
	private static final String TAG_VOICE = "v";
	private final StringBuilder textBuilder = new StringBuilder();

	static 
	{
	//    0    0:ldc1            #71  <String "^(\\S+)\\s+-->\\s+(\\S+)(.*)?$">
	//    1    2:invokestatic    #77  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #79  <Field Pattern CUE_HEADER_PATTERN>
	//    3    8:ldc1            #81  <String "(\\S+?):(\\S+)">
	//    4   10:invokestatic    #77  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #83  <Field Pattern CUE_SETTING_PATTERN>
	//*   6   16:return          
	}
}
