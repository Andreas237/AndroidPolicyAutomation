// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.utils;

import android.content.res.Resources;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

public class ColorTemplate
{

	public ColorTemplate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:return          
	}

	public static List createColors(Resources resources, int ai[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #41  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void ArrayList()>
	//    3    7:astore          4
		int j = ai.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_2        
	//*   9   14:iload_2         
	//*  10   15:iload_3         
	//*  11   16:icmpge          44
			((List) (arraylist)).add(((Object) (Integer.valueOf(resources.getColor(ai[i])))));
	//   12   19:aload           4
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:iload_2         
	//   16   24:iaload          
	//   17   25:invokevirtual   #48  <Method int Resources.getColor(int)>
	//   18   28:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   19   31:invokeinterface #60  <Method boolean List.add(Object)>
	//   20   36:pop             

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            14
		return ((List) (arraylist));
	//   26   44:aload           4
	//   27   46:areturn         
	}

	public static List createColors(int ai[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #41  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void ArrayList()>
	//    3    7:astore_3        
		int j = ai.length;
	//    4    8:aload_0         
	//    5    9:arraylength     
	//    6   10:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_1        
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          38
			((List) (arraylist)).add(((Object) (Integer.valueOf(ai[i]))));
	//   12   18:aload_3         
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:iaload          
	//   16   22:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   17   25:invokeinterface #60  <Method boolean List.add(Object)>
	//   18   30:pop             

	//   19   31:iload_1         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_1        
	//*  23   35:goto            13
		return ((List) (arraylist));
	//   24   38:aload_3         
	//   25   39:areturn         
	}

	public static int getHoloBlue()
	{
		return Color.rgb(51, 181, 229);
	//    0    0:bipush          51
	//    1    2:sipush          181
	//    2    5:sipush          229
	//    3    8:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//    4   11:ireturn         
	}

	public static int rgb(String s)
	{
		int i = (int)Long.parseLong(s.replace("#", ""), 16);
	//    0    0:aload_0         
	//    1    1:ldc1            #69  <String "#">
	//    2    3:ldc1            #71  <String "">
	//    3    5:invokevirtual   #77  <Method String String.replace(CharSequence, CharSequence)>
	//    4    8:bipush          16
	//    5   10:invokestatic    #83  <Method long Long.parseLong(String, int)>
	//    6   13:l2i             
	//    7   14:istore_1        
		return Color.rgb(i >> 16 & 0xff, i >> 8 & 0xff, i >> 0 & 0xff);
	//    8   15:iload_1         
	//    9   16:bipush          16
	//   10   18:ishr            
	//   11   19:sipush          255
	//   12   22:iand            
	//   13   23:iload_1         
	//   14   24:bipush          8
	//   15   26:ishr            
	//   16   27:sipush          255
	//   17   30:iand            
	//   18   31:iload_1         
	//   19   32:iconst_0        
	//   20   33:ishr            
	//   21   34:sipush          255
	//   22   37:iand            
	//   23   38:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   24   41:ireturn         
	}

	public static final int COLORFUL_COLORS[] = {
		Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)
	};
	public static final int COLOR_NONE = -1;
	public static final int COLOR_SKIP = -2;
	public static final int JOYFUL_COLORS[] = {
		Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, 134), Color.rgb(53, 194, 209)
	};
	public static final int LIBERTY_COLORS[] = {
		Color.rgb(207, 248, 246), Color.rgb(148, 212, 212), Color.rgb(136, 180, 187), Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)
	};
	public static final int PASTEL_COLORS[] = {
		Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, 184, 162), Color.rgb(191, 134, 134), Color.rgb(179, 48, 80)
	};
	public static final int VORDIPLOM_COLORS[] = {
		Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140), Color.rgb(140, 234, 255), Color.rgb(255, 140, 157)
	};

	static 
	{
	//    0    0:iconst_5        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:sipush          207
	//    5    8:sipush          248
	//    6   11:sipush          246
	//    7   14:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//    8   17:iastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:sipush          148
	//   12   23:sipush          212
	//   13   26:sipush          212
	//   14   29:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   15   32:iastore         
	//   16   33:dup             
	//   17   34:iconst_2        
	//   18   35:sipush          136
	//   19   38:sipush          180
	//   20   41:sipush          187
	//   21   44:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   22   47:iastore         
	//   23   48:dup             
	//   24   49:iconst_3        
	//   25   50:bipush          118
	//   26   52:sipush          174
	//   27   55:sipush          175
	//   28   58:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   29   61:iastore         
	//   30   62:dup             
	//   31   63:iconst_4        
	//   32   64:bipush          42
	//   33   66:bipush          109
	//   34   68:sipush          130
	//   35   71:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   36   74:iastore         
	//   37   75:putstatic       #25  <Field int[] LIBERTY_COLORS>
	//   38   78:iconst_5        
	//   39   79:newarray        int[]
	//   40   81:dup             
	//   41   82:iconst_0        
	//   42   83:sipush          217
	//   43   86:bipush          80
	//   44   88:sipush          138
	//   45   91:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   46   94:iastore         
	//   47   95:dup             
	//   48   96:iconst_1        
	//   49   97:sipush          254
	//   50  100:sipush          149
	//   51  103:bipush          7
	//   52  105:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   53  108:iastore         
	//   54  109:dup             
	//   55  110:iconst_2        
	//   56  111:sipush          254
	//   57  114:sipush          247
	//   58  117:bipush          120
	//   59  119:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   60  122:iastore         
	//   61  123:dup             
	//   62  124:iconst_3        
	//   63  125:bipush          106
	//   64  127:sipush          167
	//   65  130:sipush          134
	//   66  133:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   67  136:iastore         
	//   68  137:dup             
	//   69  138:iconst_4        
	//   70  139:bipush          53
	//   71  141:sipush          194
	//   72  144:sipush          209
	//   73  147:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   74  150:iastore         
	//   75  151:putstatic       #27  <Field int[] JOYFUL_COLORS>
	//   76  154:iconst_5        
	//   77  155:newarray        int[]
	//   78  157:dup             
	//   79  158:iconst_0        
	//   80  159:bipush          64
	//   81  161:bipush          89
	//   82  163:sipush          128
	//   83  166:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   84  169:iastore         
	//   85  170:dup             
	//   86  171:iconst_1        
	//   87  172:sipush          149
	//   88  175:sipush          165
	//   89  178:bipush          124
	//   90  180:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   91  183:iastore         
	//   92  184:dup             
	//   93  185:iconst_2        
	//   94  186:sipush          217
	//   95  189:sipush          184
	//   96  192:sipush          162
	//   97  195:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//   98  198:iastore         
	//   99  199:dup             
	//  100  200:iconst_3        
	//  101  201:sipush          191
	//  102  204:sipush          134
	//  103  207:sipush          134
	//  104  210:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  105  213:iastore         
	//  106  214:dup             
	//  107  215:iconst_4        
	//  108  216:sipush          179
	//  109  219:bipush          48
	//  110  221:bipush          80
	//  111  223:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  112  226:iastore         
	//  113  227:putstatic       #29  <Field int[] PASTEL_COLORS>
	//  114  230:iconst_5        
	//  115  231:newarray        int[]
	//  116  233:dup             
	//  117  234:iconst_0        
	//  118  235:sipush          193
	//  119  238:bipush          37
	//  120  240:bipush          82
	//  121  242:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  122  245:iastore         
	//  123  246:dup             
	//  124  247:iconst_1        
	//  125  248:sipush          255
	//  126  251:bipush          102
	//  127  253:iconst_0        
	//  128  254:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  129  257:iastore         
	//  130  258:dup             
	//  131  259:iconst_2        
	//  132  260:sipush          245
	//  133  263:sipush          199
	//  134  266:iconst_0        
	//  135  267:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  136  270:iastore         
	//  137  271:dup             
	//  138  272:iconst_3        
	//  139  273:bipush          106
	//  140  275:sipush          150
	//  141  278:bipush          31
	//  142  280:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  143  283:iastore         
	//  144  284:dup             
	//  145  285:iconst_4        
	//  146  286:sipush          179
	//  147  289:bipush          100
	//  148  291:bipush          53
	//  149  293:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  150  296:iastore         
	//  151  297:putstatic       #31  <Field int[] COLORFUL_COLORS>
	//  152  300:iconst_5        
	//  153  301:newarray        int[]
	//  154  303:dup             
	//  155  304:iconst_0        
	//  156  305:sipush          192
	//  157  308:sipush          255
	//  158  311:sipush          140
	//  159  314:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  160  317:iastore         
	//  161  318:dup             
	//  162  319:iconst_1        
	//  163  320:sipush          255
	//  164  323:sipush          247
	//  165  326:sipush          140
	//  166  329:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  167  332:iastore         
	//  168  333:dup             
	//  169  334:iconst_2        
	//  170  335:sipush          255
	//  171  338:sipush          208
	//  172  341:sipush          140
	//  173  344:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  174  347:iastore         
	//  175  348:dup             
	//  176  349:iconst_3        
	//  177  350:sipush          140
	//  178  353:sipush          234
	//  179  356:sipush          255
	//  180  359:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  181  362:iastore         
	//  182  363:dup             
	//  183  364:iconst_4        
	//  184  365:sipush          255
	//  185  368:sipush          140
	//  186  371:sipush          157
	//  187  374:invokestatic    #23  <Method int Color.rgb(int, int, int)>
	//  188  377:iastore         
	//  189  378:putstatic       #33  <Field int[] VORDIPLOM_COLORS>
	//* 190  381:return          
	}
}
