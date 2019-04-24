// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;


// Referenced classes of package com.github.mikephil.charting.components:
//			Legend

public static final class Legend$LegendPosition extends Enum
{

	public static Legend$LegendPosition valueOf(String s)
	{
		return (Legend$LegendPosition)Enum.valueOf(com/github/mikephil/charting/components/Legend$LegendPosition, s);
	//    0    0:ldc1            #2   <Class Legend$LegendPosition>
	//    1    2:aload_0         
	//    2    3:invokestatic    #79  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Legend$LegendPosition>
	//    4    9:areturn         
	}

	public static Legend$LegendPosition[] values()
	{
		return (Legend$LegendPosition[])((Legend$LegendPosition []) ($VALUES)).clone();
	//    0    0:getstatic       #71  <Field Legend$LegendPosition[] $VALUES>
	//    1    3:invokevirtual   #86  <Method Object _5B_Lcom.github.mikephil.charting.components.Legend$LegendPosition_3B_.clone()>
	//    2    6:checkcast       #82  <Class Legend$LegendPosition[]>
	//    3    9:areturn         
	}

	private static final Legend$LegendPosition $VALUES[];
	public static final Legend$LegendPosition ABOVE_CHART_CENTER;
	public static final Legend$LegendPosition ABOVE_CHART_LEFT;
	public static final Legend$LegendPosition ABOVE_CHART_RIGHT;
	public static final Legend$LegendPosition BELOW_CHART_CENTER;
	public static final Legend$LegendPosition BELOW_CHART_LEFT;
	public static final Legend$LegendPosition BELOW_CHART_RIGHT;
	public static final Legend$LegendPosition LEFT_OF_CHART;
	public static final Legend$LegendPosition LEFT_OF_CHART_CENTER;
	public static final Legend$LegendPosition LEFT_OF_CHART_INSIDE;
	public static final Legend$LegendPosition PIECHART_CENTER;
	public static final Legend$LegendPosition RIGHT_OF_CHART;
	public static final Legend$LegendPosition RIGHT_OF_CHART_CENTER;
	public static final Legend$LegendPosition RIGHT_OF_CHART_INSIDE;

	static 
	{
		RIGHT_OF_CHART = new Legend$LegendPosition("RIGHT_OF_CHART", 0);
	//    0    0:new             #2   <Class Legend$LegendPosition>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "RIGHT_OF_CHART">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//    5   10:putstatic       #33  <Field Legend$LegendPosition RIGHT_OF_CHART>
		RIGHT_OF_CHART_CENTER = new Legend$LegendPosition("RIGHT_OF_CHART_CENTER", 1);
	//    6   13:new             #2   <Class Legend$LegendPosition>
	//    7   16:dup             
	//    8   17:ldc1            #34  <String "RIGHT_OF_CHART_CENTER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   11   23:putstatic       #36  <Field Legend$LegendPosition RIGHT_OF_CHART_CENTER>
		RIGHT_OF_CHART_INSIDE = new Legend$LegendPosition("RIGHT_OF_CHART_INSIDE", 2);
	//   12   26:new             #2   <Class Legend$LegendPosition>
	//   13   29:dup             
	//   14   30:ldc1            #37  <String "RIGHT_OF_CHART_INSIDE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   17   36:putstatic       #39  <Field Legend$LegendPosition RIGHT_OF_CHART_INSIDE>
		LEFT_OF_CHART = new Legend$LegendPosition("LEFT_OF_CHART", 3);
	//   18   39:new             #2   <Class Legend$LegendPosition>
	//   19   42:dup             
	//   20   43:ldc1            #40  <String "LEFT_OF_CHART">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   23   49:putstatic       #42  <Field Legend$LegendPosition LEFT_OF_CHART>
		LEFT_OF_CHART_CENTER = new Legend$LegendPosition("LEFT_OF_CHART_CENTER", 4);
	//   24   52:new             #2   <Class Legend$LegendPosition>
	//   25   55:dup             
	//   26   56:ldc1            #43  <String "LEFT_OF_CHART_CENTER">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   29   62:putstatic       #45  <Field Legend$LegendPosition LEFT_OF_CHART_CENTER>
		LEFT_OF_CHART_INSIDE = new Legend$LegendPosition("LEFT_OF_CHART_INSIDE", 5);
	//   30   65:new             #2   <Class Legend$LegendPosition>
	//   31   68:dup             
	//   32   69:ldc1            #46  <String "LEFT_OF_CHART_INSIDE">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   35   75:putstatic       #48  <Field Legend$LegendPosition LEFT_OF_CHART_INSIDE>
		BELOW_CHART_LEFT = new Legend$LegendPosition("BELOW_CHART_LEFT", 6);
	//   36   78:new             #2   <Class Legend$LegendPosition>
	//   37   81:dup             
	//   38   82:ldc1            #49  <String "BELOW_CHART_LEFT">
	//   39   84:bipush          6
	//   40   86:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   41   89:putstatic       #51  <Field Legend$LegendPosition BELOW_CHART_LEFT>
		BELOW_CHART_RIGHT = new Legend$LegendPosition("BELOW_CHART_RIGHT", 7);
	//   42   92:new             #2   <Class Legend$LegendPosition>
	//   43   95:dup             
	//   44   96:ldc1            #52  <String "BELOW_CHART_RIGHT">
	//   45   98:bipush          7
	//   46  100:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   47  103:putstatic       #54  <Field Legend$LegendPosition BELOW_CHART_RIGHT>
		BELOW_CHART_CENTER = new Legend$LegendPosition("BELOW_CHART_CENTER", 8);
	//   48  106:new             #2   <Class Legend$LegendPosition>
	//   49  109:dup             
	//   50  110:ldc1            #55  <String "BELOW_CHART_CENTER">
	//   51  112:bipush          8
	//   52  114:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   53  117:putstatic       #57  <Field Legend$LegendPosition BELOW_CHART_CENTER>
		ABOVE_CHART_LEFT = new Legend$LegendPosition("ABOVE_CHART_LEFT", 9);
	//   54  120:new             #2   <Class Legend$LegendPosition>
	//   55  123:dup             
	//   56  124:ldc1            #58  <String "ABOVE_CHART_LEFT">
	//   57  126:bipush          9
	//   58  128:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   59  131:putstatic       #60  <Field Legend$LegendPosition ABOVE_CHART_LEFT>
		ABOVE_CHART_RIGHT = new Legend$LegendPosition("ABOVE_CHART_RIGHT", 10);
	//   60  134:new             #2   <Class Legend$LegendPosition>
	//   61  137:dup             
	//   62  138:ldc1            #61  <String "ABOVE_CHART_RIGHT">
	//   63  140:bipush          10
	//   64  142:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   65  145:putstatic       #63  <Field Legend$LegendPosition ABOVE_CHART_RIGHT>
		ABOVE_CHART_CENTER = new Legend$LegendPosition("ABOVE_CHART_CENTER", 11);
	//   66  148:new             #2   <Class Legend$LegendPosition>
	//   67  151:dup             
	//   68  152:ldc1            #64  <String "ABOVE_CHART_CENTER">
	//   69  154:bipush          11
	//   70  156:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   71  159:putstatic       #66  <Field Legend$LegendPosition ABOVE_CHART_CENTER>
		PIECHART_CENTER = new Legend$LegendPosition("PIECHART_CENTER", 12);
	//   72  162:new             #2   <Class Legend$LegendPosition>
	//   73  165:dup             
	//   74  166:ldc1            #67  <String "PIECHART_CENTER">
	//   75  168:bipush          12
	//   76  170:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
	//   77  173:putstatic       #69  <Field Legend$LegendPosition PIECHART_CENTER>
		$VALUES = (new Legend$LegendPosition[] {
			RIGHT_OF_CHART, RIGHT_OF_CHART_CENTER, RIGHT_OF_CHART_INSIDE, LEFT_OF_CHART, LEFT_OF_CHART_CENTER, LEFT_OF_CHART_INSIDE, BELOW_CHART_LEFT, BELOW_CHART_RIGHT, BELOW_CHART_CENTER, ABOVE_CHART_LEFT, 
			ABOVE_CHART_RIGHT, ABOVE_CHART_CENTER, PIECHART_CENTER
		});
	//   78  176:bipush          13
	//   79  178:anewarray       Legend$LegendPosition[]
	//   80  181:dup             
	//   81  182:iconst_0        
	//   82  183:getstatic       #33  <Field Legend$LegendPosition RIGHT_OF_CHART>
	//   83  186:aastore         
	//   84  187:dup             
	//   85  188:iconst_1        
	//   86  189:getstatic       #36  <Field Legend$LegendPosition RIGHT_OF_CHART_CENTER>
	//   87  192:aastore         
	//   88  193:dup             
	//   89  194:iconst_2        
	//   90  195:getstatic       #39  <Field Legend$LegendPosition RIGHT_OF_CHART_INSIDE>
	//   91  198:aastore         
	//   92  199:dup             
	//   93  200:iconst_3        
	//   94  201:getstatic       #42  <Field Legend$LegendPosition LEFT_OF_CHART>
	//   95  204:aastore         
	//   96  205:dup             
	//   97  206:iconst_4        
	//   98  207:getstatic       #45  <Field Legend$LegendPosition LEFT_OF_CHART_CENTER>
	//   99  210:aastore         
	//  100  211:dup             
	//  101  212:iconst_5        
	//  102  213:getstatic       #48  <Field Legend$LegendPosition LEFT_OF_CHART_INSIDE>
	//  103  216:aastore         
	//  104  217:dup             
	//  105  218:bipush          6
	//  106  220:getstatic       #51  <Field Legend$LegendPosition BELOW_CHART_LEFT>
	//  107  223:aastore         
	//  108  224:dup             
	//  109  225:bipush          7
	//  110  227:getstatic       #54  <Field Legend$LegendPosition BELOW_CHART_RIGHT>
	//  111  230:aastore         
	//  112  231:dup             
	//  113  232:bipush          8
	//  114  234:getstatic       #57  <Field Legend$LegendPosition BELOW_CHART_CENTER>
	//  115  237:aastore         
	//  116  238:dup             
	//  117  239:bipush          9
	//  118  241:getstatic       #60  <Field Legend$LegendPosition ABOVE_CHART_LEFT>
	//  119  244:aastore         
	//  120  245:dup             
	//  121  246:bipush          10
	//  122  248:getstatic       #63  <Field Legend$LegendPosition ABOVE_CHART_RIGHT>
	//  123  251:aastore         
	//  124  252:dup             
	//  125  253:bipush          11
	//  126  255:getstatic       #66  <Field Legend$LegendPosition ABOVE_CHART_CENTER>
	//  127  258:aastore         
	//  128  259:dup             
	//  129  260:bipush          12
	//  130  262:getstatic       #69  <Field Legend$LegendPosition PIECHART_CENTER>
	//  131  265:aastore         
	//  132  266:putstatic       #71  <Field Legend$LegendPosition[] $VALUES>
	//* 133  269:return          
	}

	private Legend$LegendPosition(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #73  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
