// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.github.mikephil.charting.utils.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.components:
//			ComponentBase

public class Legend extends ComponentBase
{
	public static final class LegendDirection extends Enum
	{

		public static LegendDirection valueOf(String s)
		{
			return (LegendDirection)Enum.valueOf(com/github/mikephil/charting/components/Legend$LegendDirection, s);
		//    0    0:ldc1            #2   <Class Legend$LegendDirection>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Legend$LegendDirection>
		//    4    9:areturn         
		}

		public static LegendDirection[] values()
		{
			return (LegendDirection[])((LegendDirection []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field Legend$LegendDirection[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.github.mikephil.charting.components.Legend$LegendDirection_3B_.clone()>
		//    2    6:checkcast       #38  <Class Legend$LegendDirection[]>
		//    3    9:areturn         
		}

		private static final LegendDirection $VALUES[];
		public static final LegendDirection LEFT_TO_RIGHT;
		public static final LegendDirection RIGHT_TO_LEFT;

		static 
		{
			LEFT_TO_RIGHT = new LegendDirection("LEFT_TO_RIGHT", 0);
		//    0    0:new             #2   <Class Legend$LegendDirection>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "LEFT_TO_RIGHT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void Legend$LegendDirection(String, int)>
		//    5   10:putstatic       #22  <Field Legend$LegendDirection LEFT_TO_RIGHT>
			RIGHT_TO_LEFT = new LegendDirection("RIGHT_TO_LEFT", 1);
		//    6   13:new             #2   <Class Legend$LegendDirection>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "RIGHT_TO_LEFT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void Legend$LegendDirection(String, int)>
		//   11   23:putstatic       #25  <Field Legend$LegendDirection RIGHT_TO_LEFT>
			$VALUES = (new LegendDirection[] {
				LEFT_TO_RIGHT, RIGHT_TO_LEFT
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       LegendDirection[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field Legend$LegendDirection LEFT_TO_RIGHT>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field Legend$LegendDirection RIGHT_TO_LEFT>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field Legend$LegendDirection[] $VALUES>
		//*  23   45:return          
		}

		private LegendDirection(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class LegendForm extends Enum
	{

		public static LegendForm valueOf(String s)
		{
			return (LegendForm)Enum.valueOf(com/github/mikephil/charting/components/Legend$LegendForm, s);
		//    0    0:ldc1            #2   <Class Legend$LegendForm>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Legend$LegendForm>
		//    4    9:areturn         
		}

		public static LegendForm[] values()
		{
			return (LegendForm[])((LegendForm []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field Legend$LegendForm[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.github.mikephil.charting.components.Legend$LegendForm_3B_.clone()>
		//    2    6:checkcast       #42  <Class Legend$LegendForm[]>
		//    3    9:areturn         
		}

		private static final LegendForm $VALUES[];
		public static final LegendForm CIRCLE;
		public static final LegendForm LINE;
		public static final LegendForm SQUARE;

		static 
		{
			SQUARE = new LegendForm("SQUARE", 0);
		//    0    0:new             #2   <Class Legend$LegendForm>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "SQUARE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void Legend$LegendForm(String, int)>
		//    5   10:putstatic       #23  <Field Legend$LegendForm SQUARE>
			CIRCLE = new LegendForm("CIRCLE", 1);
		//    6   13:new             #2   <Class Legend$LegendForm>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "CIRCLE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void Legend$LegendForm(String, int)>
		//   11   23:putstatic       #26  <Field Legend$LegendForm CIRCLE>
			LINE = new LegendForm("LINE", 2);
		//   12   26:new             #2   <Class Legend$LegendForm>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "LINE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void Legend$LegendForm(String, int)>
		//   17   36:putstatic       #29  <Field Legend$LegendForm LINE>
			$VALUES = (new LegendForm[] {
				SQUARE, CIRCLE, LINE
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       LegendForm[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field Legend$LegendForm SQUARE>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field Legend$LegendForm CIRCLE>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field Legend$LegendForm LINE>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field Legend$LegendForm[] $VALUES>
		//*  33   64:return          
		}

		private LegendForm(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class LegendPosition extends Enum
	{

		public static LegendPosition valueOf(String s)
		{
			return (LegendPosition)Enum.valueOf(com/github/mikephil/charting/components/Legend$LegendPosition, s);
		//    0    0:ldc1            #2   <Class Legend$LegendPosition>
		//    1    2:aload_0         
		//    2    3:invokestatic    #79  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Legend$LegendPosition>
		//    4    9:areturn         
		}

		public static LegendPosition[] values()
		{
			return (LegendPosition[])((LegendPosition []) ($VALUES)).clone();
		//    0    0:getstatic       #71  <Field Legend$LegendPosition[] $VALUES>
		//    1    3:invokevirtual   #86  <Method Object _5B_Lcom.github.mikephil.charting.components.Legend$LegendPosition_3B_.clone()>
		//    2    6:checkcast       #82  <Class Legend$LegendPosition[]>
		//    3    9:areturn         
		}

		private static final LegendPosition $VALUES[];
		public static final LegendPosition ABOVE_CHART_CENTER;
		public static final LegendPosition ABOVE_CHART_LEFT;
		public static final LegendPosition ABOVE_CHART_RIGHT;
		public static final LegendPosition BELOW_CHART_CENTER;
		public static final LegendPosition BELOW_CHART_LEFT;
		public static final LegendPosition BELOW_CHART_RIGHT;
		public static final LegendPosition LEFT_OF_CHART;
		public static final LegendPosition LEFT_OF_CHART_CENTER;
		public static final LegendPosition LEFT_OF_CHART_INSIDE;
		public static final LegendPosition PIECHART_CENTER;
		public static final LegendPosition RIGHT_OF_CHART;
		public static final LegendPosition RIGHT_OF_CHART_CENTER;
		public static final LegendPosition RIGHT_OF_CHART_INSIDE;

		static 
		{
			RIGHT_OF_CHART = new LegendPosition("RIGHT_OF_CHART", 0);
		//    0    0:new             #2   <Class Legend$LegendPosition>
		//    1    3:dup             
		//    2    4:ldc1            #27  <String "RIGHT_OF_CHART">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//    5   10:putstatic       #33  <Field Legend$LegendPosition RIGHT_OF_CHART>
			RIGHT_OF_CHART_CENTER = new LegendPosition("RIGHT_OF_CHART_CENTER", 1);
		//    6   13:new             #2   <Class Legend$LegendPosition>
		//    7   16:dup             
		//    8   17:ldc1            #34  <String "RIGHT_OF_CHART_CENTER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   11   23:putstatic       #36  <Field Legend$LegendPosition RIGHT_OF_CHART_CENTER>
			RIGHT_OF_CHART_INSIDE = new LegendPosition("RIGHT_OF_CHART_INSIDE", 2);
		//   12   26:new             #2   <Class Legend$LegendPosition>
		//   13   29:dup             
		//   14   30:ldc1            #37  <String "RIGHT_OF_CHART_INSIDE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   17   36:putstatic       #39  <Field Legend$LegendPosition RIGHT_OF_CHART_INSIDE>
			LEFT_OF_CHART = new LegendPosition("LEFT_OF_CHART", 3);
		//   18   39:new             #2   <Class Legend$LegendPosition>
		//   19   42:dup             
		//   20   43:ldc1            #40  <String "LEFT_OF_CHART">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   23   49:putstatic       #42  <Field Legend$LegendPosition LEFT_OF_CHART>
			LEFT_OF_CHART_CENTER = new LegendPosition("LEFT_OF_CHART_CENTER", 4);
		//   24   52:new             #2   <Class Legend$LegendPosition>
		//   25   55:dup             
		//   26   56:ldc1            #43  <String "LEFT_OF_CHART_CENTER">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   29   62:putstatic       #45  <Field Legend$LegendPosition LEFT_OF_CHART_CENTER>
			LEFT_OF_CHART_INSIDE = new LegendPosition("LEFT_OF_CHART_INSIDE", 5);
		//   30   65:new             #2   <Class Legend$LegendPosition>
		//   31   68:dup             
		//   32   69:ldc1            #46  <String "LEFT_OF_CHART_INSIDE">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   35   75:putstatic       #48  <Field Legend$LegendPosition LEFT_OF_CHART_INSIDE>
			BELOW_CHART_LEFT = new LegendPosition("BELOW_CHART_LEFT", 6);
		//   36   78:new             #2   <Class Legend$LegendPosition>
		//   37   81:dup             
		//   38   82:ldc1            #49  <String "BELOW_CHART_LEFT">
		//   39   84:bipush          6
		//   40   86:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   41   89:putstatic       #51  <Field Legend$LegendPosition BELOW_CHART_LEFT>
			BELOW_CHART_RIGHT = new LegendPosition("BELOW_CHART_RIGHT", 7);
		//   42   92:new             #2   <Class Legend$LegendPosition>
		//   43   95:dup             
		//   44   96:ldc1            #52  <String "BELOW_CHART_RIGHT">
		//   45   98:bipush          7
		//   46  100:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   47  103:putstatic       #54  <Field Legend$LegendPosition BELOW_CHART_RIGHT>
			BELOW_CHART_CENTER = new LegendPosition("BELOW_CHART_CENTER", 8);
		//   48  106:new             #2   <Class Legend$LegendPosition>
		//   49  109:dup             
		//   50  110:ldc1            #55  <String "BELOW_CHART_CENTER">
		//   51  112:bipush          8
		//   52  114:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   53  117:putstatic       #57  <Field Legend$LegendPosition BELOW_CHART_CENTER>
			ABOVE_CHART_LEFT = new LegendPosition("ABOVE_CHART_LEFT", 9);
		//   54  120:new             #2   <Class Legend$LegendPosition>
		//   55  123:dup             
		//   56  124:ldc1            #58  <String "ABOVE_CHART_LEFT">
		//   57  126:bipush          9
		//   58  128:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   59  131:putstatic       #60  <Field Legend$LegendPosition ABOVE_CHART_LEFT>
			ABOVE_CHART_RIGHT = new LegendPosition("ABOVE_CHART_RIGHT", 10);
		//   60  134:new             #2   <Class Legend$LegendPosition>
		//   61  137:dup             
		//   62  138:ldc1            #61  <String "ABOVE_CHART_RIGHT">
		//   63  140:bipush          10
		//   64  142:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   65  145:putstatic       #63  <Field Legend$LegendPosition ABOVE_CHART_RIGHT>
			ABOVE_CHART_CENTER = new LegendPosition("ABOVE_CHART_CENTER", 11);
		//   66  148:new             #2   <Class Legend$LegendPosition>
		//   67  151:dup             
		//   68  152:ldc1            #64  <String "ABOVE_CHART_CENTER">
		//   69  154:bipush          11
		//   70  156:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   71  159:putstatic       #66  <Field Legend$LegendPosition ABOVE_CHART_CENTER>
			PIECHART_CENTER = new LegendPosition("PIECHART_CENTER", 12);
		//   72  162:new             #2   <Class Legend$LegendPosition>
		//   73  165:dup             
		//   74  166:ldc1            #67  <String "PIECHART_CENTER">
		//   75  168:bipush          12
		//   76  170:invokespecial   #31  <Method void Legend$LegendPosition(String, int)>
		//   77  173:putstatic       #69  <Field Legend$LegendPosition PIECHART_CENTER>
			$VALUES = (new LegendPosition[] {
				RIGHT_OF_CHART, RIGHT_OF_CHART_CENTER, RIGHT_OF_CHART_INSIDE, LEFT_OF_CHART, LEFT_OF_CHART_CENTER, LEFT_OF_CHART_INSIDE, BELOW_CHART_LEFT, BELOW_CHART_RIGHT, BELOW_CHART_CENTER, ABOVE_CHART_LEFT, 
				ABOVE_CHART_RIGHT, ABOVE_CHART_CENTER, PIECHART_CENTER
			});
		//   78  176:bipush          13
		//   79  178:anewarray       LegendPosition[]
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

		private LegendPosition(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #73  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Legend()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void ComponentBase()>
		mIsLegendCustom = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #50  <Field boolean mIsLegendCustom>
		mPosition = LegendPosition.BELOW_CHART_LEFT;
	//    5    9:aload_0         
	//    6   10:getstatic       #53  <Field Legend$LegendPosition Legend$LegendPosition.BELOW_CHART_LEFT>
	//    7   13:putfield        #55  <Field Legend$LegendPosition mPosition>
		mDirection = LegendDirection.LEFT_TO_RIGHT;
	//    8   16:aload_0         
	//    9   17:getstatic       #58  <Field Legend$LegendDirection Legend$LegendDirection.LEFT_TO_RIGHT>
	//   10   20:putfield        #60  <Field Legend$LegendDirection mDirection>
		mShape = LegendForm.SQUARE;
	//   11   23:aload_0         
	//   12   24:getstatic       #63  <Field Legend$LegendForm Legend$LegendForm.SQUARE>
	//   13   27:putfield        #65  <Field Legend$LegendForm mShape>
		mFormSize = 8F;
	//   14   30:aload_0         
	//   15   31:ldc1            #66  <Float 8F>
	//   16   33:putfield        #68  <Field float mFormSize>
		mXEntrySpace = 6F;
	//   17   36:aload_0         
	//   18   37:ldc1            #69  <Float 6F>
	//   19   39:putfield        #71  <Field float mXEntrySpace>
		mYEntrySpace = 0.0F;
	//   20   42:aload_0         
	//   21   43:fconst_0        
	//   22   44:putfield        #73  <Field float mYEntrySpace>
		mFormToTextSpace = 5F;
	//   23   47:aload_0         
	//   24   48:ldc1            #74  <Float 5F>
	//   25   50:putfield        #76  <Field float mFormToTextSpace>
		mStackSpace = 3F;
	//   26   53:aload_0         
	//   27   54:ldc1            #77  <Float 3F>
	//   28   56:putfield        #79  <Field float mStackSpace>
		mMaxSizePercent = 0.95F;
	//   29   59:aload_0         
	//   30   60:ldc1            #80  <Float 0.95F>
	//   31   62:putfield        #82  <Field float mMaxSizePercent>
		mNeededWidth = 0.0F;
	//   32   65:aload_0         
	//   33   66:fconst_0        
	//   34   67:putfield        #84  <Field float mNeededWidth>
		mNeededHeight = 0.0F;
	//   35   70:aload_0         
	//   36   71:fconst_0        
	//   37   72:putfield        #86  <Field float mNeededHeight>
		mTextHeightMax = 0.0F;
	//   38   75:aload_0         
	//   39   76:fconst_0        
	//   40   77:putfield        #88  <Field float mTextHeightMax>
		mTextWidthMax = 0.0F;
	//   41   80:aload_0         
	//   42   81:fconst_0        
	//   43   82:putfield        #90  <Field float mTextWidthMax>
		mWordWrapEnabled = false;
	//   44   85:aload_0         
	//   45   86:iconst_0        
	//   46   87:putfield        #92  <Field boolean mWordWrapEnabled>
		mCalculatedLabelSizes = new FSize[0];
	//   47   90:aload_0         
	//   48   91:iconst_0        
	//   49   92:anewarray       FSize[]
	//   50   95:putfield        #96  <Field FSize[] mCalculatedLabelSizes>
		mCalculatedLabelBreakPoints = new Boolean[0];
	//   51   98:aload_0         
	//   52   99:iconst_0        
	//   53  100:anewarray       Boolean[]
	//   54  103:putfield        #100 <Field Boolean[] mCalculatedLabelBreakPoints>
		mCalculatedLineSizes = new FSize[0];
	//   55  106:aload_0         
	//   56  107:iconst_0        
	//   57  108:anewarray       FSize[]
	//   58  111:putfield        #102 <Field FSize[] mCalculatedLineSizes>
		mFormSize = Utils.convertDpToPixel(8F);
	//   59  114:aload_0         
	//   60  115:ldc1            #66  <Float 8F>
	//   61  117:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//   62  120:putfield        #68  <Field float mFormSize>
		mXEntrySpace = Utils.convertDpToPixel(6F);
	//   63  123:aload_0         
	//   64  124:ldc1            #69  <Float 6F>
	//   65  126:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//   66  129:putfield        #71  <Field float mXEntrySpace>
		mYEntrySpace = Utils.convertDpToPixel(0.0F);
	//   67  132:aload_0         
	//   68  133:fconst_0        
	//   69  134:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//   70  137:putfield        #73  <Field float mYEntrySpace>
		mFormToTextSpace = Utils.convertDpToPixel(5F);
	//   71  140:aload_0         
	//   72  141:ldc1            #74  <Float 5F>
	//   73  143:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//   74  146:putfield        #76  <Field float mFormToTextSpace>
		mTextSize = Utils.convertDpToPixel(10F);
	//   75  149:aload_0         
	//   76  150:ldc1            #109 <Float 10F>
	//   77  152:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//   78  155:putfield        #112 <Field float mTextSize>
		mStackSpace = Utils.convertDpToPixel(3F);
	//   79  158:aload_0         
	//   80  159:ldc1            #77  <Float 3F>
	//   81  161:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//   82  164:putfield        #79  <Field float mStackSpace>
		mXOffset = Utils.convertDpToPixel(5F);
	//   83  167:aload_0         
	//   84  168:ldc1            #74  <Float 5F>
	//   85  170:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//   86  173:putfield        #115 <Field float mXOffset>
		mYOffset = Utils.convertDpToPixel(4F);
	//   87  176:aload_0         
	//   88  177:ldc1            #116 <Float 4F>
	//   89  179:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//   90  182:putfield        #119 <Field float mYOffset>
	//   91  185:return          
	}

	public Legend(List list, List list1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method void Legend()>
		if(list == null || list1 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          12
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       22
			throw new IllegalArgumentException("colors array or labels array is NULL");
	//    6   12:new             #124 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc1            #126 <String "colors array or labels array is NULL">
	//    9   18:invokespecial   #129 <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
		if(list.size() != list1.size())
	//*  11   22:aload_1         
	//*  12   23:invokeinterface #135 <Method int List.size()>
	//*  13   28:aload_2         
	//*  14   29:invokeinterface #135 <Method int List.size()>
	//*  15   34:icmpeq          47
		{
			throw new IllegalArgumentException("colors array and labels array need to be of same size");
	//   16   37:new             #124 <Class IllegalArgumentException>
	//   17   40:dup             
	//   18   41:ldc1            #137 <String "colors array and labels array need to be of same size">
	//   19   43:invokespecial   #129 <Method void IllegalArgumentException(String)>
	//   20   46:athrow          
		} else
		{
			mColors = Utils.convertIntegers(list);
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:invokestatic    #141 <Method int[] Utils.convertIntegers(List)>
	//   24   52:putfield        #143 <Field int[] mColors>
			mLabels = Utils.convertStrings(list1);
	//   25   55:aload_0         
	//   26   56:aload_2         
	//   27   57:invokestatic    #147 <Method String[] Utils.convertStrings(List)>
	//   28   60:putfield        #149 <Field String[] mLabels>
			return;
	//   29   63:return          
		}
	}

	public Legend(int ai[], String as[])
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method void Legend()>
		if(ai == null || as == null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          12
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       22
			throw new IllegalArgumentException("colors array or labels array is NULL");
	//    6   12:new             #124 <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:ldc1            #126 <String "colors array or labels array is NULL">
	//    9   18:invokespecial   #129 <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
		if(ai.length != as.length)
	//*  11   22:aload_1         
	//*  12   23:arraylength     
	//*  13   24:aload_2         
	//*  14   25:arraylength     
	//*  15   26:icmpeq          39
		{
			throw new IllegalArgumentException("colors array and labels array need to be of same size");
	//   16   29:new             #124 <Class IllegalArgumentException>
	//   17   32:dup             
	//   18   33:ldc1            #137 <String "colors array and labels array need to be of same size">
	//   19   35:invokespecial   #129 <Method void IllegalArgumentException(String)>
	//   20   38:athrow          
		} else
		{
			mColors = ai;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:putfield        #143 <Field int[] mColors>
			mLabels = as;
	//   24   44:aload_0         
	//   25   45:aload_2         
	//   26   46:putfield        #149 <Field String[] mLabels>
			return;
	//   27   49:return          
		}
	}

	public void calculateDimensions(Paint paint, ViewPortHandler viewporthandler)
	{
		if(mPosition == LegendPosition.RIGHT_OF_CHART || mPosition == LegendPosition.RIGHT_OF_CHART_CENTER || mPosition == LegendPosition.LEFT_OF_CHART || mPosition == LegendPosition.LEFT_OF_CHART_CENTER || mPosition == LegendPosition.PIECHART_CENTER)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*   2    4:getstatic       #157 <Field Legend$LegendPosition Legend$LegendPosition.RIGHT_OF_CHART>
	//*   3    7:if_acmpeq       50
	//*   4   10:aload_0         
	//*   5   11:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*   6   14:getstatic       #160 <Field Legend$LegendPosition Legend$LegendPosition.RIGHT_OF_CHART_CENTER>
	//*   7   17:if_acmpeq       50
	//*   8   20:aload_0         
	//*   9   21:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*  10   24:getstatic       #163 <Field Legend$LegendPosition Legend$LegendPosition.LEFT_OF_CHART>
	//*  11   27:if_acmpeq       50
	//*  12   30:aload_0         
	//*  13   31:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*  14   34:getstatic       #166 <Field Legend$LegendPosition Legend$LegendPosition.LEFT_OF_CHART_CENTER>
	//*  15   37:if_acmpeq       50
	//*  16   40:aload_0         
	//*  17   41:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*  18   44:getstatic       #169 <Field Legend$LegendPosition Legend$LegendPosition.PIECHART_CENTER>
	//*  19   47:if_acmpne       86
		{
			mNeededWidth = getMaximumEntryWidth(paint);
	//   20   50:aload_0         
	//   21   51:aload_0         
	//   22   52:aload_1         
	//   23   53:invokevirtual   #173 <Method float getMaximumEntryWidth(Paint)>
	//   24   56:putfield        #84  <Field float mNeededWidth>
			mNeededHeight = getFullHeight(paint);
	//   25   59:aload_0         
	//   26   60:aload_0         
	//   27   61:aload_1         
	//   28   62:invokevirtual   #176 <Method float getFullHeight(Paint)>
	//   29   65:putfield        #86  <Field float mNeededHeight>
			mTextWidthMax = mNeededWidth;
	//   30   68:aload_0         
	//   31   69:aload_0         
	//   32   70:getfield        #84  <Field float mNeededWidth>
	//   33   73:putfield        #90  <Field float mTextWidthMax>
			mTextHeightMax = getMaximumEntryHeight(paint);
	//   34   76:aload_0         
	//   35   77:aload_0         
	//   36   78:aload_1         
	//   37   79:invokevirtual   #179 <Method float getMaximumEntryHeight(Paint)>
	//   38   82:putfield        #88  <Field float mTextHeightMax>
			return;
	//   39   85:return          
		}
		float f;
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		float f6;
		float f7;
		float f8;
		int i;
		int j;
		int k;
		int l;
		ArrayList arraylist;
		ArrayList arraylist1;
		if(mPosition == LegendPosition.BELOW_CHART_LEFT || mPosition == LegendPosition.BELOW_CHART_RIGHT || mPosition == LegendPosition.BELOW_CHART_CENTER || mPosition == LegendPosition.ABOVE_CHART_LEFT || mPosition == LegendPosition.ABOVE_CHART_RIGHT || mPosition == LegendPosition.ABOVE_CHART_CENTER)
	//*  40   86:aload_0         
	//*  41   87:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*  42   90:getstatic       #53  <Field Legend$LegendPosition Legend$LegendPosition.BELOW_CHART_LEFT>
	//*  43   93:if_acmpeq       146
	//*  44   96:aload_0         
	//*  45   97:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*  46  100:getstatic       #182 <Field Legend$LegendPosition Legend$LegendPosition.BELOW_CHART_RIGHT>
	//*  47  103:if_acmpeq       146
	//*  48  106:aload_0         
	//*  49  107:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*  50  110:getstatic       #185 <Field Legend$LegendPosition Legend$LegendPosition.BELOW_CHART_CENTER>
	//*  51  113:if_acmpeq       146
	//*  52  116:aload_0         
	//*  53  117:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*  54  120:getstatic       #188 <Field Legend$LegendPosition Legend$LegendPosition.ABOVE_CHART_LEFT>
	//*  55  123:if_acmpeq       146
	//*  56  126:aload_0         
	//*  57  127:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*  58  130:getstatic       #191 <Field Legend$LegendPosition Legend$LegendPosition.ABOVE_CHART_RIGHT>
	//*  59  133:if_acmpeq       146
	//*  60  136:aload_0         
	//*  61  137:getfield        #55  <Field Legend$LegendPosition mPosition>
	//*  62  140:getstatic       #194 <Field Legend$LegendPosition Legend$LegendPosition.ABOVE_CHART_CENTER>
	//*  63  143:if_acmpne       770
		{
			l = mLabels.length;
	//   64  146:aload_0         
	//   65  147:getfield        #149 <Field String[] mLabels>
	//   66  150:arraylength     
	//   67  151:istore          15
			f5 = Utils.getLineHeight(paint);
	//   68  153:aload_1         
	//   69  154:invokestatic    #197 <Method float Utils.getLineHeight(Paint)>
	//   70  157:fstore          8
			f6 = Utils.getLineSpacing(paint);
	//   71  159:aload_1         
	//   72  160:invokestatic    #200 <Method float Utils.getLineSpacing(Paint)>
	//   73  163:fstore          9
			f7 = mYEntrySpace;
	//   74  165:aload_0         
	//   75  166:getfield        #73  <Field float mYEntrySpace>
	//   76  169:fstore          10
			f8 = viewporthandler.contentWidth();
	//   77  171:aload_2         
	//   78  172:invokevirtual   #206 <Method float ViewPortHandler.contentWidth()>
	//   79  175:fstore          11
			viewporthandler = ((ViewPortHandler) (new ArrayList(l)));
	//   80  177:new             #208 <Class ArrayList>
	//   81  180:dup             
	//   82  181:iload           15
	//   83  183:invokespecial   #211 <Method void ArrayList(int)>
	//   84  186:astore_2        
			arraylist = new ArrayList(l);
	//   85  187:new             #208 <Class ArrayList>
	//   86  190:dup             
	//   87  191:iload           15
	//   88  193:invokespecial   #211 <Method void ArrayList(int)>
	//   89  196:astore          16
			arraylist1 = new ArrayList();
	//   90  198:new             #208 <Class ArrayList>
	//   91  201:dup             
	//   92  202:invokespecial   #212 <Method void ArrayList()>
	//   93  205:astore          17
			f1 = 0.0F;
	//   94  207:fconst_0        
	//   95  208:fstore          4
			f3 = 0.0F;
	//   96  210:fconst_0        
	//   97  211:fstore          6
			f = 0.0F;
	//   98  213:fconst_0        
	//   99  214:fstore_3        
			k = -1;
	//  100  215:iconst_m1       
	//  101  216:istore          14
			i = 0;
	//  102  218:iconst_0        
	//  103  219:istore          12
		} else
	//* 104  221:iload           12
	//* 105  223:iload           15
	//* 106  225:icmpge          639
	//* 107  228:aload_0         
	//* 108  229:getfield        #143 <Field int[] mColors>
	//* 109  232:iload           12
	//* 110  234:iaload          
	//* 111  235:bipush          -2
	//* 112  237:icmpeq          487
	//* 113  240:iconst_1        
	//* 114  241:istore          13
	//* 115  243:aload           16
	//* 116  245:iconst_0        
	//* 117  246:invokestatic    #216 <Method Boolean Boolean.valueOf(boolean)>
	//* 118  249:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//* 119  252:pop             
	//* 120  253:iload           14
	//* 121  255:iconst_m1       
	//* 122  256:icmpne          493
	//* 123  259:fconst_0        
	//* 124  260:fstore_3        
	//* 125  261:aload_0         
	//* 126  262:getfield        #149 <Field String[] mLabels>
	//* 127  265:iload           12
	//* 128  267:aaload          
	//* 129  268:ifnull          509
	//* 130  271:aload_2         
	//* 131  272:aload_1         
	//* 132  273:aload_0         
	//* 133  274:getfield        #149 <Field String[] mLabels>
	//* 134  277:iload           12
	//* 135  279:aaload          
	//* 136  280:invokestatic    #224 <Method FSize Utils.calcTextSize(Paint, String)>
	//* 137  283:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//* 138  286:pop             
	//* 139  287:iload           13
	//* 140  289:ifeq            503
	//* 141  292:aload_0         
	//* 142  293:getfield        #76  <Field float mFormToTextSpace>
	//* 143  296:aload_0         
	//* 144  297:getfield        #68  <Field float mFormSize>
	//* 145  300:fadd            
	//* 146  301:fstore          5
	//* 147  303:fload_3         
	//* 148  304:fload           5
	//* 149  306:fadd            
	//* 150  307:aload_2         
	//* 151  308:iload           12
	//* 152  310:invokevirtual   #228 <Method Object ArrayList.get(int)>
	//* 153  313:checkcast       #94  <Class FSize>
	//* 154  316:getfield        #231 <Field float FSize.width>
	//* 155  319:fadd            
	//* 156  320:fstore_3        
	//* 157  321:iload           14
	//* 158  323:istore          13
	//* 159  325:aload_0         
	//* 160  326:getfield        #149 <Field String[] mLabels>
	//* 161  329:iload           12
	//* 162  331:aaload          
	//* 163  332:ifnonnull       352
	//* 164  335:fload           6
	//* 165  337:fstore          7
	//* 166  339:fload           4
	//* 167  341:fstore          5
	//* 168  343:iload           12
	//* 169  345:iload           15
	//* 170  347:iconst_1        
	//* 171  348:isub            
	//* 172  349:icmpne          453
	//* 173  352:fload           6
	//* 174  354:fconst_0        
	//* 175  355:fcmpl           
	//* 176  356:ifne            569
	//* 177  359:fconst_0        
	//* 178  360:fstore          5
	//* 179  362:aload_0         
	//* 180  363:getfield        #92  <Field boolean mWordWrapEnabled>
	//* 181  366:ifeq            389
	//* 182  369:fload           6
	//* 183  371:fconst_0        
	//* 184  372:fcmpl           
	//* 185  373:ifeq            389
	//* 186  376:fload           11
	//* 187  378:fload           6
	//* 188  380:fsub            
	//* 189  381:fload           5
	//* 190  383:fload_3         
	//* 191  384:fadd            
	//* 192  385:fcmpl           
	//* 193  386:iflt            578
	//* 194  389:fload           6
	//* 195  391:fload           5
	//* 196  393:fload_3         
	//* 197  394:fadd            
	//* 198  395:fadd            
	//* 199  396:fstore          5
	//* 200  398:fload           4
	//* 201  400:fstore          6
	//* 202  402:fload           5
	//* 203  404:fstore          4
	//* 204  406:fload           4
	//* 205  408:fstore          7
	//* 206  410:fload           6
	//* 207  412:fstore          5
	//* 208  414:iload           12
	//* 209  416:iload           15
	//* 210  418:iconst_1        
	//* 211  419:isub            
	//* 212  420:icmpne          453
	//* 213  423:aload           17
	//* 214  425:new             #94  <Class FSize>
	//* 215  428:dup             
	//* 216  429:fload           4
	//* 217  431:fload           8
	//* 218  433:invokespecial   #234 <Method void FSize(float, float)>
	//* 219  436:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//* 220  439:pop             
	//* 221  440:fload           6
	//* 222  442:fload           4
	//* 223  444:invokestatic    #240 <Method float Math.max(float, float)>
	//* 224  447:fstore          5
	//* 225  449:fload           4
	//* 226  451:fstore          7
	//* 227  453:aload_0         
	//* 228  454:getfield        #149 <Field String[] mLabels>
	//* 229  457:iload           12
	//* 230  459:aaload          
	//* 231  460:ifnull          466
	//* 232  463:iconst_m1       
	//* 233  464:istore          13
	//* 234  466:iload           12
	//* 235  468:iconst_1        
	//* 236  469:iadd            
	//* 237  470:istore          12
	//* 238  472:fload           7
	//* 239  474:fstore          6
	//* 240  476:fload           5
	//* 241  478:fstore          4
	//* 242  480:iload           13
	//* 243  482:istore          14
	//* 244  484:goto            221
	//* 245  487:iconst_0        
	//* 246  488:istore          13
	//* 247  490:goto            243
	//* 248  493:fload_3         
	//* 249  494:aload_0         
	//* 250  495:getfield        #79  <Field float mStackSpace>
	//* 251  498:fadd            
	//* 252  499:fstore_3        
	//* 253  500:goto            261
	//* 254  503:fconst_0        
	//* 255  504:fstore          5
	//* 256  506:goto            303
	//* 257  509:aload_2         
	//* 258  510:new             #94  <Class FSize>
	//* 259  513:dup             
	//* 260  514:fconst_0        
	//* 261  515:fconst_0        
	//* 262  516:invokespecial   #234 <Method void FSize(float, float)>
	//* 263  519:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//* 264  522:pop             
	//* 265  523:iload           13
	//* 266  525:ifeq            563
	//* 267  528:aload_0         
	//* 268  529:getfield        #68  <Field float mFormSize>
	//* 269  532:fstore          5
	//* 270  534:fload_3         
	//* 271  535:fload           5
	//* 272  537:fadd            
	//* 273  538:fstore          5
	//* 274  540:fload           5
	//* 275  542:fstore_3        
	//* 276  543:iload           14
	//* 277  545:istore          13
	//* 278  547:iload           14
	//* 279  549:iconst_m1       
	//* 280  550:icmpne          325
	//* 281  553:iload           12
	//* 282  555:istore          13
	//* 283  557:fload           5
	//* 284  559:fstore_3        
	//* 285  560:goto            325
	//* 286  563:fconst_0        
	//* 287  564:fstore          5
	//* 288  566:goto            534
	//* 289  569:aload_0         
	//* 290  570:getfield        #71  <Field float mXEntrySpace>
	//* 291  573:fstore          5
	//* 292  575:goto            362
	//* 293  578:aload           17
	//* 294  580:new             #94  <Class FSize>
	//* 295  583:dup             
	//* 296  584:fload           6
	//* 297  586:fload           8
	//* 298  588:invokespecial   #234 <Method void FSize(float, float)>
	//* 299  591:invokevirtual   #220 <Method boolean ArrayList.add(Object)>
	//* 300  594:pop             
	//* 301  595:fload           4
	//* 302  597:fload           6
	//* 303  599:invokestatic    #240 <Method float Math.max(float, float)>
	//* 304  602:fstore          6
	//* 305  604:iload           13
	//* 306  606:iconst_m1       
	//* 307  607:icmple          632
	//* 308  610:iload           13
	//* 309  612:istore          14
	//* 310  614:aload           16
	//* 311  616:iload           14
	//* 312  618:iconst_1        
	//* 313  619:invokestatic    #216 <Method Boolean Boolean.valueOf(boolean)>
	//* 314  622:invokevirtual   #244 <Method Object ArrayList.set(int, Object)>
	//* 315  625:pop             
	//* 316  626:fload_3         
	//* 317  627:fstore          4
	//* 318  629:goto            406
	//* 319  632:iload           12
	//* 320  634:istore          14
	//* 321  636:goto            614
	//* 322  639:aload_0         
	//* 323  640:aload_2         
	//* 324  641:aload_2         
	//* 325  642:invokevirtual   #245 <Method int ArrayList.size()>
	//* 326  645:anewarray       FSize[]
	//* 327  648:invokevirtual   #249 <Method Object[] ArrayList.toArray(Object[])>
	//* 328  651:checkcast       #250 <Class FSize[]>
	//* 329  654:putfield        #96  <Field FSize[] mCalculatedLabelSizes>
	//* 330  657:aload_0         
	//* 331  658:aload           16
	//* 332  660:aload           16
	//* 333  662:invokevirtual   #245 <Method int ArrayList.size()>
	//* 334  665:anewarray       Boolean[]
	//* 335  668:invokevirtual   #249 <Method Object[] ArrayList.toArray(Object[])>
	//* 336  671:checkcast       #251 <Class Boolean[]>
	//* 337  674:putfield        #100 <Field Boolean[] mCalculatedLabelBreakPoints>
	//* 338  677:aload_0         
	//* 339  678:aload           17
	//* 340  680:aload           17
	//* 341  682:invokevirtual   #245 <Method int ArrayList.size()>
	//* 342  685:anewarray       FSize[]
	//* 343  688:invokevirtual   #249 <Method Object[] ArrayList.toArray(Object[])>
	//* 344  691:checkcast       #250 <Class FSize[]>
	//* 345  694:putfield        #102 <Field FSize[] mCalculatedLineSizes>
	//* 346  697:aload_0         
	//* 347  698:aload_0         
	//* 348  699:aload_1         
	//* 349  700:invokevirtual   #173 <Method float getMaximumEntryWidth(Paint)>
	//* 350  703:putfield        #90  <Field float mTextWidthMax>
	//* 351  706:aload_0         
	//* 352  707:aload_0         
	//* 353  708:aload_1         
	//* 354  709:invokevirtual   #179 <Method float getMaximumEntryHeight(Paint)>
	//* 355  712:putfield        #88  <Field float mTextHeightMax>
	//* 356  715:aload_0         
	//* 357  716:fload           4
	//* 358  718:putfield        #84  <Field float mNeededWidth>
	//* 359  721:aload_0         
	//* 360  722:getfield        #102 <Field FSize[] mCalculatedLineSizes>
	//* 361  725:arraylength     
	//* 362  726:i2f             
	//* 363  727:fstore_3        
	//* 364  728:aload_0         
	//* 365  729:getfield        #102 <Field FSize[] mCalculatedLineSizes>
	//* 366  732:arraylength     
	//* 367  733:ifne            758
	//* 368  736:iconst_0        
	//* 369  737:istore          12
	//* 370  739:aload_0         
	//* 371  740:iload           12
	//* 372  742:i2f             
	//* 373  743:fload           9
	//* 374  745:fload           10
	//* 375  747:fadd            
	//* 376  748:fmul            
	//* 377  749:fload           8
	//* 378  751:fload_3         
	//* 379  752:fmul            
	//* 380  753:fadd            
	//* 381  754:putfield        #86  <Field float mNeededHeight>
	//* 382  757:return          
	//* 383  758:aload_0         
	//* 384  759:getfield        #102 <Field FSize[] mCalculatedLineSizes>
	//* 385  762:arraylength     
	//* 386  763:iconst_1        
	//* 387  764:isub            
	//* 388  765:istore          12
	//* 389  767:goto            739
		{
			mNeededWidth = getFullWidth(paint);
	//  390  770:aload_0         
	//  391  771:aload_0         
	//  392  772:aload_1         
	//  393  773:invokevirtual   #254 <Method float getFullWidth(Paint)>
	//  394  776:putfield        #84  <Field float mNeededWidth>
			mNeededHeight = getMaximumEntryHeight(paint);
	//  395  779:aload_0         
	//  396  780:aload_0         
	//  397  781:aload_1         
	//  398  782:invokevirtual   #179 <Method float getMaximumEntryHeight(Paint)>
	//  399  785:putfield        #86  <Field float mNeededHeight>
			mTextWidthMax = getMaximumEntryWidth(paint);
	//  400  788:aload_0         
	//  401  789:aload_0         
	//  402  790:aload_1         
	//  403  791:invokevirtual   #173 <Method float getMaximumEntryWidth(Paint)>
	//  404  794:putfield        #90  <Field float mTextWidthMax>
			mTextHeightMax = mNeededHeight;
	//  405  797:aload_0         
	//  406  798:aload_0         
	//  407  799:getfield        #86  <Field float mNeededHeight>
	//  408  802:putfield        #88  <Field float mTextHeightMax>
			return;
	//  409  805:return          
		}
		if(i >= l) goto _L2; else goto _L1
_L1:
		if(mColors[i] != -2)
			j = 1;
		else
			j = 0;
		arraylist.add(((Object) (Boolean.valueOf(false))));
		if(k == -1)
			f = 0.0F;
		else
			f += mStackSpace;
		if(mLabels[i] == null) goto _L4; else goto _L3
_L3:
		((ArrayList) (viewporthandler)).add(((Object) (Utils.calcTextSize(paint, mLabels[i]))));
		if(j != 0)
			f2 = mFormToTextSpace + mFormSize;
		else
			f2 = 0.0F;
		f = f + f2 + ((FSize)((ArrayList) (viewporthandler)).get(i)).width;
		j = k;
_L5:
label0:
		{
			if(mLabels[i] == null)
			{
				f4 = f3;
				f2 = f1;
				if(i != l - 1)
					break label0;
			}
			if(f3 == 0.0F)
				f2 = 0.0F;
			else
				f2 = mXEntrySpace;
			if(!mWordWrapEnabled || f3 == 0.0F || f8 - f3 >= f2 + f)
			{
				f2 = f3 + (f2 + f);
				f3 = f1;
				f1 = f2;
			} else
			{
				arraylist1.add(((Object) (new FSize(f3, f5))));
				f3 = Math.max(f1, f3);
				if(j > -1)
					k = j;
				else
					k = i;
				arraylist.set(k, ((Object) (Boolean.valueOf(true))));
				f1 = f;
			}
			f4 = f1;
			f2 = f3;
			if(i == l - 1)
			{
				arraylist1.add(((Object) (new FSize(f1, f5))));
				f2 = Math.max(f3, f1);
				f4 = f1;
			}
		}
		if(mLabels[i] != null)
			j = -1;
		i++;
		f3 = f4;
		f1 = f2;
		k = j;
		continue; /* Loop/switch isn't completed */
_L4:
		((ArrayList) (viewporthandler)).add(((Object) (new FSize(0.0F, 0.0F))));
		if(j != 0)
			f2 = mFormSize;
		else
			f2 = 0.0F;
		f2 = f + f2;
		f = f2;
		j = k;
		if(k == -1)
		{
			j = i;
			f = f2;
		}
		if(true) goto _L5; else goto _L2
_L2:
		mCalculatedLabelSizes = (FSize[])((ArrayList) (viewporthandler)).toArray(((Object []) (new FSize[((ArrayList) (viewporthandler)).size()])));
		mCalculatedLabelBreakPoints = (Boolean[])arraylist.toArray(((Object []) (new Boolean[arraylist.size()])));
		mCalculatedLineSizes = (FSize[])arraylist1.toArray(((Object []) (new FSize[arraylist1.size()])));
		mTextWidthMax = getMaximumEntryWidth(paint);
		mTextHeightMax = getMaximumEntryHeight(paint);
		mNeededWidth = f1;
		f = mCalculatedLineSizes.length;
		if(mCalculatedLineSizes.length == 0)
			i = 0;
		else
			i = mCalculatedLineSizes.length - 1;
		mNeededHeight = (float)i * (f6 + f7) + f5 * f;
		return;
		if(true) goto _L7; else goto _L6
_L6:
		break MISSING_BLOCK_LABEL_769;
_L7:
		break MISSING_BLOCK_LABEL_221;
	}

	public Boolean[] getCalculatedLabelBreakPoints()
	{
		return mCalculatedLabelBreakPoints;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Boolean[] mCalculatedLabelBreakPoints>
	//    2    4:areturn         
	}

	public FSize[] getCalculatedLabelSizes()
	{
		return mCalculatedLabelSizes;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field FSize[] mCalculatedLabelSizes>
	//    2    4:areturn         
	}

	public FSize[] getCalculatedLineSizes()
	{
		return mCalculatedLineSizes;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field FSize[] mCalculatedLineSizes>
	//    2    4:areturn         
	}

	public int[] getColors()
	{
		return mColors;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field int[] mColors>
	//    2    4:areturn         
	}

	public LegendDirection getDirection()
	{
		return mDirection;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Legend$LegendDirection mDirection>
	//    2    4:areturn         
	}

	public int[] getExtraColors()
	{
		return mExtraColors;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field int[] mExtraColors>
	//    2    4:areturn         
	}

	public String[] getExtraLabels()
	{
		return mExtraLabels;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field String[] mExtraLabels>
	//    2    4:areturn         
	}

	public LegendForm getForm()
	{
		return mShape;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Legend$LegendForm mShape>
	//    2    4:areturn         
	}

	public float getFormSize()
	{
		return mFormSize;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field float mFormSize>
	//    2    4:freturn         
	}

	public float getFormToTextSpace()
	{
		return mFormToTextSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field float mFormToTextSpace>
	//    2    4:freturn         
	}

	public float getFullHeight(Paint paint)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_3        
		for(int i = 0; i < mLabels.length;)
	//*   2    2:iconst_0        
	//*   3    3:istore          4
	//*   4    5:iload           4
	//*   5    7:aload_0         
	//*   6    8:getfield        #149 <Field String[] mLabels>
	//*   7   11:arraylength     
	//*   8   12:icmpge          74
		{
			float f = f1;
	//    9   15:fload_3         
	//   10   16:fstore_2        
			if(mLabels[i] != null)
	//*  11   17:aload_0         
	//*  12   18:getfield        #149 <Field String[] mLabels>
	//*  13   21:iload           4
	//*  14   23:aaload          
	//*  15   24:ifnull          63
			{
				f1 += Utils.calcTextHeight(paint, mLabels[i]);
	//   16   27:fload_3         
	//   17   28:aload_1         
	//   18   29:aload_0         
	//   19   30:getfield        #149 <Field String[] mLabels>
	//   20   33:iload           4
	//   21   35:aaload          
	//   22   36:invokestatic    #278 <Method int Utils.calcTextHeight(Paint, String)>
	//   23   39:i2f             
	//   24   40:fadd            
	//   25   41:fstore_3        
				f = f1;
	//   26   42:fload_3         
	//   27   43:fstore_2        
				if(i < mLabels.length - 1)
	//*  28   44:iload           4
	//*  29   46:aload_0         
	//*  30   47:getfield        #149 <Field String[] mLabels>
	//*  31   50:arraylength     
	//*  32   51:iconst_1        
	//*  33   52:isub            
	//*  34   53:icmpge          63
					f = f1 + mYEntrySpace;
	//   35   56:fload_3         
	//   36   57:aload_0         
	//   37   58:getfield        #73  <Field float mYEntrySpace>
	//   38   61:fadd            
	//   39   62:fstore_2        
			}
			i++;
	//   40   63:iload           4
	//   41   65:iconst_1        
	//   42   66:iadd            
	//   43   67:istore          4
			f1 = f;
	//   44   69:fload_2         
	//   45   70:fstore_3        
		}

	//*  46   71:goto            5
		return f1;
	//   47   74:fload_3         
	//   48   75:freturn         
	}

	public float getFullWidth(Paint paint)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore          4
		while(i < mLabels.length) 
	//*   4    5:iload           4
	//*   5    7:aload_0         
	//*   6    8:getfield        #149 <Field String[] mLabels>
	//*   7   11:arraylength     
	//*   8   12:icmpge          127
		{
			if(mLabels[i] != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #149 <Field String[] mLabels>
	//*  11   19:iload           4
	//*  12   21:aaload          
	//*  13   22:ifnull          96
			{
				float f1 = f;
	//   14   25:fload_2         
	//   15   26:fstore_3        
				if(mColors[i] != -2)
	//*  16   27:aload_0         
	//*  17   28:getfield        #143 <Field int[] mColors>
	//*  18   31:iload           4
	//*  19   33:iaload          
	//*  20   34:bipush          -2
	//*  21   36:icmpeq          51
					f1 = f + (mFormSize + mFormToTextSpace);
	//   22   39:fload_2         
	//   23   40:aload_0         
	//   24   41:getfield        #68  <Field float mFormSize>
	//   25   44:aload_0         
	//   26   45:getfield        #76  <Field float mFormToTextSpace>
	//   27   48:fadd            
	//   28   49:fadd            
	//   29   50:fstore_3        
				f1 += Utils.calcTextWidth(paint, mLabels[i]);
	//   30   51:fload_3         
	//   31   52:aload_1         
	//   32   53:aload_0         
	//   33   54:getfield        #149 <Field String[] mLabels>
	//   34   57:iload           4
	//   35   59:aaload          
	//   36   60:invokestatic    #281 <Method int Utils.calcTextWidth(Paint, String)>
	//   37   63:i2f             
	//   38   64:fadd            
	//   39   65:fstore_3        
				f = f1;
	//   40   66:fload_3         
	//   41   67:fstore_2        
				if(i < mLabels.length - 1)
	//*  42   68:iload           4
	//*  43   70:aload_0         
	//*  44   71:getfield        #149 <Field String[] mLabels>
	//*  45   74:arraylength     
	//*  46   75:iconst_1        
	//*  47   76:isub            
	//*  48   77:icmpge          87
					f = f1 + mXEntrySpace;
	//   49   80:fload_3         
	//   50   81:aload_0         
	//   51   82:getfield        #71  <Field float mXEntrySpace>
	//   52   85:fadd            
	//   53   86:fstore_2        
			} else
	//*  54   87:iload           4
	//*  55   89:iconst_1        
	//*  56   90:iadd            
	//*  57   91:istore          4
	//*  58   93:goto            5
			{
				float f2 = f + mFormSize;
	//   59   96:fload_2         
	//   60   97:aload_0         
	//   61   98:getfield        #68  <Field float mFormSize>
	//   62  101:fadd            
	//   63  102:fstore_3        
				f = f2;
	//   64  103:fload_3         
	//   65  104:fstore_2        
				if(i < mLabels.length - 1)
	//*  66  105:iload           4
	//*  67  107:aload_0         
	//*  68  108:getfield        #149 <Field String[] mLabels>
	//*  69  111:arraylength     
	//*  70  112:iconst_1        
	//*  71  113:isub            
	//*  72  114:icmpge          87
					f = f2 + mStackSpace;
	//   73  117:fload_3         
	//   74  118:aload_0         
	//   75  119:getfield        #79  <Field float mStackSpace>
	//   76  122:fadd            
	//   77  123:fstore_2        
			}
			i++;
		}
	//*  78  124:goto            87
		return f;
	//   79  127:fload_2         
	//   80  128:freturn         
	}

	public String getLabel(int i)
	{
		return mLabels[i];
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field String[] mLabels>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public String[] getLabels()
	{
		return mLabels;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field String[] mLabels>
	//    2    4:areturn         
	}

	public float getMaxSizePercent()
	{
		return mMaxSizePercent;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field float mMaxSizePercent>
	//    2    4:freturn         
	}

	public float getMaximumEntryHeight(Paint paint)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		for(int i = 0; i < mLabels.length;)
	//*   2    2:iconst_0        
	//*   3    3:istore          5
	//*   4    5:iload           5
	//*   5    7:aload_0         
	//*   6    8:getfield        #149 <Field String[] mLabels>
	//*   7   11:arraylength     
	//*   8   12:icmpge          64
		{
			float f1 = f;
	//    9   15:fload_2         
	//   10   16:fstore_3        
			if(mLabels[i] != null)
	//*  11   17:aload_0         
	//*  12   18:getfield        #149 <Field String[] mLabels>
	//*  13   21:iload           5
	//*  14   23:aaload          
	//*  15   24:ifnull          53
			{
				float f2 = Utils.calcTextHeight(paint, mLabels[i]);
	//   16   27:aload_1         
	//   17   28:aload_0         
	//   18   29:getfield        #149 <Field String[] mLabels>
	//   19   32:iload           5
	//   20   34:aaload          
	//   21   35:invokestatic    #278 <Method int Utils.calcTextHeight(Paint, String)>
	//   22   38:i2f             
	//   23   39:fstore          4
				f1 = f;
	//   24   41:fload_2         
	//   25   42:fstore_3        
				if(f2 > f)
	//*  26   43:fload           4
	//*  27   45:fload_2         
	//*  28   46:fcmpl           
	//*  29   47:ifle            53
					f1 = f2;
	//   30   50:fload           4
	//   31   52:fstore_3        
			}
			i++;
	//   32   53:iload           5
	//   33   55:iconst_1        
	//   34   56:iadd            
	//   35   57:istore          5
			f = f1;
	//   36   59:fload_3         
	//   37   60:fstore_2        
		}

	//*  38   61:goto            5
		return f;
	//   39   64:fload_2         
	//   40   65:freturn         
	}

	public float getMaximumEntryWidth(Paint paint)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		for(int i = 0; i < mLabels.length;)
	//*   2    2:iconst_0        
	//*   3    3:istore          5
	//*   4    5:iload           5
	//*   5    7:aload_0         
	//*   6    8:getfield        #149 <Field String[] mLabels>
	//*   7   11:arraylength     
	//*   8   12:icmpge          64
		{
			float f1 = f;
	//    9   15:fload_2         
	//   10   16:fstore_3        
			if(mLabels[i] != null)
	//*  11   17:aload_0         
	//*  12   18:getfield        #149 <Field String[] mLabels>
	//*  13   21:iload           5
	//*  14   23:aaload          
	//*  15   24:ifnull          53
			{
				float f2 = Utils.calcTextWidth(paint, mLabels[i]);
	//   16   27:aload_1         
	//   17   28:aload_0         
	//   18   29:getfield        #149 <Field String[] mLabels>
	//   19   32:iload           5
	//   20   34:aaload          
	//   21   35:invokestatic    #281 <Method int Utils.calcTextWidth(Paint, String)>
	//   22   38:i2f             
	//   23   39:fstore          4
				f1 = f;
	//   24   41:fload_2         
	//   25   42:fstore_3        
				if(f2 > f)
	//*  26   43:fload           4
	//*  27   45:fload_2         
	//*  28   46:fcmpl           
	//*  29   47:ifle            53
					f1 = f2;
	//   30   50:fload           4
	//   31   52:fstore_3        
			}
			i++;
	//   32   53:iload           5
	//   33   55:iconst_1        
	//   34   56:iadd            
	//   35   57:istore          5
			f = f1;
	//   36   59:fload_3         
	//   37   60:fstore_2        
		}

	//*  38   61:goto            5
		return mFormSize + f + mFormToTextSpace;
	//   39   64:aload_0         
	//   40   65:getfield        #68  <Field float mFormSize>
	//   41   68:fload_2         
	//   42   69:fadd            
	//   43   70:aload_0         
	//   44   71:getfield        #76  <Field float mFormToTextSpace>
	//   45   74:fadd            
	//   46   75:freturn         
	}

	public LegendPosition getPosition()
	{
		return mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Legend$LegendPosition mPosition>
	//    2    4:areturn         
	}

	public float getStackSpace()
	{
		return mStackSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field float mStackSpace>
	//    2    4:freturn         
	}

	public float getXEntrySpace()
	{
		return mXEntrySpace;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field float mXEntrySpace>
	//    2    4:freturn         
	}

	public float getYEntrySpace()
	{
		return mYEntrySpace;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field float mYEntrySpace>
	//    2    4:freturn         
	}

	public boolean isLegendCustom()
	{
		return mIsLegendCustom;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean mIsLegendCustom>
	//    2    4:ireturn         
	}

	public boolean isWordWrapEnabled()
	{
		return mWordWrapEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field boolean mWordWrapEnabled>
	//    2    4:ireturn         
	}

	public void resetCustom()
	{
		mIsLegendCustom = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #50  <Field boolean mIsLegendCustom>
	//    3    5:return          
	}

	public void setComputedColors(List list)
	{
		mColors = Utils.convertIntegers(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #141 <Method int[] Utils.convertIntegers(List)>
	//    3    5:putfield        #143 <Field int[] mColors>
	//    4    8:return          
	}

	public void setComputedLabels(List list)
	{
		mLabels = Utils.convertStrings(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #147 <Method String[] Utils.convertStrings(List)>
	//    3    5:putfield        #149 <Field String[] mLabels>
	//    4    8:return          
	}

	public void setCustom(List list, List list1)
	{
		if(list.size() != list1.size())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #135 <Method int List.size()>
	//*   2    6:aload_2         
	//*   3    7:invokeinterface #135 <Method int List.size()>
	//*   4   12:icmpeq          25
		{
			throw new IllegalArgumentException("colors array and labels array need to be of same size");
	//    5   15:new             #124 <Class IllegalArgumentException>
	//    6   18:dup             
	//    7   19:ldc1            #137 <String "colors array and labels array need to be of same size">
	//    8   21:invokespecial   #129 <Method void IllegalArgumentException(String)>
	//    9   24:athrow          
		} else
		{
			mColors = Utils.convertIntegers(list);
	//   10   25:aload_0         
	//   11   26:aload_1         
	//   12   27:invokestatic    #141 <Method int[] Utils.convertIntegers(List)>
	//   13   30:putfield        #143 <Field int[] mColors>
			mLabels = Utils.convertStrings(list1);
	//   14   33:aload_0         
	//   15   34:aload_2         
	//   16   35:invokestatic    #147 <Method String[] Utils.convertStrings(List)>
	//   17   38:putfield        #149 <Field String[] mLabels>
			mIsLegendCustom = true;
	//   18   41:aload_0         
	//   19   42:iconst_1        
	//   20   43:putfield        #50  <Field boolean mIsLegendCustom>
			return;
	//   21   46:return          
		}
	}

	public void setCustom(int ai[], String as[])
	{
		if(ai.length != as.length)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:aload_2         
	//*   3    3:arraylength     
	//*   4    4:icmpeq          17
		{
			throw new IllegalArgumentException("colors array and labels array need to be of same size");
	//    5    7:new             #124 <Class IllegalArgumentException>
	//    6   10:dup             
	//    7   11:ldc1            #137 <String "colors array and labels array need to be of same size">
	//    8   13:invokespecial   #129 <Method void IllegalArgumentException(String)>
	//    9   16:athrow          
		} else
		{
			mLabels = as;
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:putfield        #149 <Field String[] mLabels>
			mColors = ai;
	//   13   22:aload_0         
	//   14   23:aload_1         
	//   15   24:putfield        #143 <Field int[] mColors>
			mIsLegendCustom = true;
	//   16   27:aload_0         
	//   17   28:iconst_1        
	//   18   29:putfield        #50  <Field boolean mIsLegendCustom>
			return;
	//   19   32:return          
		}
	}

	public void setDirection(LegendDirection legenddirection)
	{
		mDirection = legenddirection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field Legend$LegendDirection mDirection>
	//    3    5:return          
	}

	public void setExtra(List list, List list1)
	{
		mExtraColors = Utils.convertIntegers(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #141 <Method int[] Utils.convertIntegers(List)>
	//    3    5:putfield        #266 <Field int[] mExtraColors>
		mExtraLabels = Utils.convertStrings(list1);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokestatic    #147 <Method String[] Utils.convertStrings(List)>
	//    7   13:putfield        #270 <Field String[] mExtraLabels>
	//    8   16:return          
	}

	public void setExtra(int ai[], String as[])
	{
		mExtraColors = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #266 <Field int[] mExtraColors>
		mExtraLabels = as;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #270 <Field String[] mExtraLabels>
	//    6   10:return          
	}

	public void setForm(LegendForm legendform)
	{
		mShape = legendform;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field Legend$LegendForm mShape>
	//    3    5:return          
	}

	public void setFormSize(float f)
	{
		mFormSize = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #68  <Field float mFormSize>
	//    4    8:return          
	}

	public void setFormToTextSpace(float f)
	{
		mFormToTextSpace = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #76  <Field float mFormToTextSpace>
	//    4    8:return          
	}

	public void setMaxSizePercent(float f)
	{
		mMaxSizePercent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #82  <Field float mMaxSizePercent>
	//    3    5:return          
	}

	public void setPosition(LegendPosition legendposition)
	{
		mPosition = legendposition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field Legend$LegendPosition mPosition>
	//    3    5:return          
	}

	public void setStackSpace(float f)
	{
		mStackSpace = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #79  <Field float mStackSpace>
	//    3    5:return          
	}

	public void setWordWrapEnabled(boolean flag)
	{
		mWordWrapEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #92  <Field boolean mWordWrapEnabled>
	//    3    5:return          
	}

	public void setXEntrySpace(float f)
	{
		mXEntrySpace = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #71  <Field float mXEntrySpace>
	//    4    8:return          
	}

	public void setYEntrySpace(float f)
	{
		mYEntrySpace = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #108 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #73  <Field float mYEntrySpace>
	//    4    8:return          
	}

	private Boolean mCalculatedLabelBreakPoints[];
	private FSize mCalculatedLabelSizes[];
	private FSize mCalculatedLineSizes[];
	private int mColors[];
	private LegendDirection mDirection;
	private int mExtraColors[];
	private String mExtraLabels[];
	private float mFormSize;
	private float mFormToTextSpace;
	private boolean mIsLegendCustom;
	private String mLabels[];
	private float mMaxSizePercent;
	public float mNeededHeight;
	public float mNeededWidth;
	private LegendPosition mPosition;
	private LegendForm mShape;
	private float mStackSpace;
	public float mTextHeightMax;
	public float mTextWidthMax;
	private boolean mWordWrapEnabled;
	private float mXEntrySpace;
	private float mYEntrySpace;
}
