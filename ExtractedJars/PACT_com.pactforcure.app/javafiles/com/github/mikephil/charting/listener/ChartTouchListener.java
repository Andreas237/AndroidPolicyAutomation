// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.listener;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.highlight.Highlight;

// Referenced classes of package com.github.mikephil.charting.listener:
//			OnChartGestureListener

public abstract class ChartTouchListener extends android.view.GestureDetector.SimpleOnGestureListener
	implements android.view.View.OnTouchListener
{
	public static final class ChartGesture extends Enum
	{

		public static ChartGesture valueOf(String s)
		{
			return (ChartGesture)Enum.valueOf(com/github/mikephil/charting/listener/ChartTouchListener$ChartGesture, s);
		//    0    0:ldc1            #2   <Class ChartTouchListener$ChartGesture>
		//    1    2:aload_0         
		//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ChartTouchListener$ChartGesture>
		//    4    9:areturn         
		}

		public static ChartGesture[] values()
		{
			return (ChartGesture[])((ChartGesture []) ($VALUES)).clone();
		//    0    0:getstatic       #59  <Field ChartTouchListener$ChartGesture[] $VALUES>
		//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.github.mikephil.charting.listener.ChartTouchListener$ChartGesture_3B_.clone()>
		//    2    6:checkcast       #70  <Class ChartTouchListener$ChartGesture[]>
		//    3    9:areturn         
		}

		private static final ChartGesture $VALUES[];
		public static final ChartGesture DOUBLE_TAP;
		public static final ChartGesture DRAG;
		public static final ChartGesture FLING;
		public static final ChartGesture LONG_PRESS;
		public static final ChartGesture NONE;
		public static final ChartGesture PINCH_ZOOM;
		public static final ChartGesture ROTATE;
		public static final ChartGesture SINGLE_TAP;
		public static final ChartGesture X_ZOOM;
		public static final ChartGesture Y_ZOOM;

		static 
		{
			NONE = new ChartGesture("NONE", 0);
		//    0    0:new             #2   <Class ChartTouchListener$ChartGesture>
		//    1    3:dup             
		//    2    4:ldc1            #24  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
		//    5   10:putstatic       #30  <Field ChartTouchListener$ChartGesture NONE>
			DRAG = new ChartGesture("DRAG", 1);
		//    6   13:new             #2   <Class ChartTouchListener$ChartGesture>
		//    7   16:dup             
		//    8   17:ldc1            #31  <String "DRAG">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
		//   11   23:putstatic       #33  <Field ChartTouchListener$ChartGesture DRAG>
			X_ZOOM = new ChartGesture("X_ZOOM", 2);
		//   12   26:new             #2   <Class ChartTouchListener$ChartGesture>
		//   13   29:dup             
		//   14   30:ldc1            #34  <String "X_ZOOM">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
		//   17   36:putstatic       #36  <Field ChartTouchListener$ChartGesture X_ZOOM>
			Y_ZOOM = new ChartGesture("Y_ZOOM", 3);
		//   18   39:new             #2   <Class ChartTouchListener$ChartGesture>
		//   19   42:dup             
		//   20   43:ldc1            #37  <String "Y_ZOOM">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
		//   23   49:putstatic       #39  <Field ChartTouchListener$ChartGesture Y_ZOOM>
			PINCH_ZOOM = new ChartGesture("PINCH_ZOOM", 4);
		//   24   52:new             #2   <Class ChartTouchListener$ChartGesture>
		//   25   55:dup             
		//   26   56:ldc1            #40  <String "PINCH_ZOOM">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
		//   29   62:putstatic       #42  <Field ChartTouchListener$ChartGesture PINCH_ZOOM>
			ROTATE = new ChartGesture("ROTATE", 5);
		//   30   65:new             #2   <Class ChartTouchListener$ChartGesture>
		//   31   68:dup             
		//   32   69:ldc1            #43  <String "ROTATE">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
		//   35   75:putstatic       #45  <Field ChartTouchListener$ChartGesture ROTATE>
			SINGLE_TAP = new ChartGesture("SINGLE_TAP", 6);
		//   36   78:new             #2   <Class ChartTouchListener$ChartGesture>
		//   37   81:dup             
		//   38   82:ldc1            #46  <String "SINGLE_TAP">
		//   39   84:bipush          6
		//   40   86:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
		//   41   89:putstatic       #48  <Field ChartTouchListener$ChartGesture SINGLE_TAP>
			DOUBLE_TAP = new ChartGesture("DOUBLE_TAP", 7);
		//   42   92:new             #2   <Class ChartTouchListener$ChartGesture>
		//   43   95:dup             
		//   44   96:ldc1            #49  <String "DOUBLE_TAP">
		//   45   98:bipush          7
		//   46  100:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
		//   47  103:putstatic       #51  <Field ChartTouchListener$ChartGesture DOUBLE_TAP>
			LONG_PRESS = new ChartGesture("LONG_PRESS", 8);
		//   48  106:new             #2   <Class ChartTouchListener$ChartGesture>
		//   49  109:dup             
		//   50  110:ldc1            #52  <String "LONG_PRESS">
		//   51  112:bipush          8
		//   52  114:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
		//   53  117:putstatic       #54  <Field ChartTouchListener$ChartGesture LONG_PRESS>
			FLING = new ChartGesture("FLING", 9);
		//   54  120:new             #2   <Class ChartTouchListener$ChartGesture>
		//   55  123:dup             
		//   56  124:ldc1            #55  <String "FLING">
		//   57  126:bipush          9
		//   58  128:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
		//   59  131:putstatic       #57  <Field ChartTouchListener$ChartGesture FLING>
			$VALUES = (new ChartGesture[] {
				NONE, DRAG, X_ZOOM, Y_ZOOM, PINCH_ZOOM, ROTATE, SINGLE_TAP, DOUBLE_TAP, LONG_PRESS, FLING
			});
		//   60  134:bipush          10
		//   61  136:anewarray       ChartGesture[]
		//   62  139:dup             
		//   63  140:iconst_0        
		//   64  141:getstatic       #30  <Field ChartTouchListener$ChartGesture NONE>
		//   65  144:aastore         
		//   66  145:dup             
		//   67  146:iconst_1        
		//   68  147:getstatic       #33  <Field ChartTouchListener$ChartGesture DRAG>
		//   69  150:aastore         
		//   70  151:dup             
		//   71  152:iconst_2        
		//   72  153:getstatic       #36  <Field ChartTouchListener$ChartGesture X_ZOOM>
		//   73  156:aastore         
		//   74  157:dup             
		//   75  158:iconst_3        
		//   76  159:getstatic       #39  <Field ChartTouchListener$ChartGesture Y_ZOOM>
		//   77  162:aastore         
		//   78  163:dup             
		//   79  164:iconst_4        
		//   80  165:getstatic       #42  <Field ChartTouchListener$ChartGesture PINCH_ZOOM>
		//   81  168:aastore         
		//   82  169:dup             
		//   83  170:iconst_5        
		//   84  171:getstatic       #45  <Field ChartTouchListener$ChartGesture ROTATE>
		//   85  174:aastore         
		//   86  175:dup             
		//   87  176:bipush          6
		//   88  178:getstatic       #48  <Field ChartTouchListener$ChartGesture SINGLE_TAP>
		//   89  181:aastore         
		//   90  182:dup             
		//   91  183:bipush          7
		//   92  185:getstatic       #51  <Field ChartTouchListener$ChartGesture DOUBLE_TAP>
		//   93  188:aastore         
		//   94  189:dup             
		//   95  190:bipush          8
		//   96  192:getstatic       #54  <Field ChartTouchListener$ChartGesture LONG_PRESS>
		//   97  195:aastore         
		//   98  196:dup             
		//   99  197:bipush          9
		//  100  199:getstatic       #57  <Field ChartTouchListener$ChartGesture FLING>
		//  101  202:aastore         
		//  102  203:putstatic       #59  <Field ChartTouchListener$ChartGesture[] $VALUES>
		//* 103  206:return          
		}

		private ChartGesture(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ChartTouchListener(Chart chart)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
		mLastGesture = ChartGesture.NONE;
	//    2    4:aload_0         
	//    3    5:getstatic       #42  <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.NONE>
	//    4    8:putfield        #44  <Field ChartTouchListener$ChartGesture mLastGesture>
		mTouchMode = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #46  <Field int mTouchMode>
		mChart = chart;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #48  <Field Chart mChart>
		mGestureDetector = new GestureDetector(chart.getContext(), ((android.view.GestureDetector.OnGestureListener) (this)));
	//   11   21:aload_0         
	//   12   22:new             #50  <Class GestureDetector>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokevirtual   #56  <Method android.content.Context Chart.getContext()>
	//   16   30:aload_0         
	//   17   31:invokespecial   #59  <Method void GestureDetector(android.content.Context, android.view.GestureDetector$OnGestureListener)>
	//   18   34:putfield        #61  <Field GestureDetector mGestureDetector>
	//   19   37:return          
	}

	protected static float distance(float f, float f1, float f2, float f3)
	{
		f -= f1;
	//    0    0:fload_0         
	//    1    1:fload_1         
	//    2    2:fsub            
	//    3    3:fstore_0        
		f1 = f2 - f3;
	//    4    4:fload_2         
	//    5    5:fload_3         
	//    6    6:fsub            
	//    7    7:fstore_1        
		return (float)Math.sqrt(f * f + f1 * f1);
	//    8    8:fload_0         
	//    9    9:fload_0         
	//   10   10:fmul            
	//   11   11:fload_1         
	//   12   12:fload_1         
	//   13   13:fmul            
	//   14   14:fadd            
	//   15   15:f2d             
	//   16   16:invokestatic    #72  <Method double Math.sqrt(double)>
	//   17   19:d2f             
	//   18   20:freturn         
	}

	public void endAction(MotionEvent motionevent)
	{
		OnChartGestureListener onchartgesturelistener = mChart.getOnChartGestureListener();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Chart mChart>
	//    2    4:invokevirtual   #78  <Method OnChartGestureListener Chart.getOnChartGestureListener()>
	//    3    7:astore_2        
		if(onchartgesturelistener != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          23
			onchartgesturelistener.onChartGestureEnd(motionevent, mLastGesture);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #44  <Field ChartTouchListener$ChartGesture mLastGesture>
	//   10   18:invokeinterface #84  <Method void OnChartGestureListener.onChartGestureEnd(MotionEvent, ChartTouchListener$ChartGesture)>
	//   11   23:return          
	}

	public ChartGesture getLastGesture()
	{
		return mLastGesture;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ChartTouchListener$ChartGesture mLastGesture>
	//    2    4:areturn         
	}

	public int getTouchMode()
	{
		return mTouchMode;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mTouchMode>
	//    2    4:ireturn         
	}

	protected void performHighlight(Highlight highlight, MotionEvent motionevent)
	{
		if(highlight == null || highlight.equalTo(mLastHighlighted))
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #92  <Field Highlight mLastHighlighted>
	//*   5    9:invokevirtual   #98  <Method boolean Highlight.equalTo(Highlight)>
	//*   6   12:ifeq            29
		{
			mChart.highlightTouch(((Highlight) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field Chart mChart>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #102 <Method void Chart.highlightTouch(Highlight)>
			mLastHighlighted = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #92  <Field Highlight mLastHighlighted>
			return;
	//   14   28:return          
		} else
		{
			mLastHighlighted = highlight;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:putfield        #92  <Field Highlight mLastHighlighted>
			mChart.highlightTouch(highlight);
	//   18   34:aload_0         
	//   19   35:getfield        #48  <Field Chart mChart>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #102 <Method void Chart.highlightTouch(Highlight)>
			return;
	//   22   42:return          
		}
	}

	public void setLastHighlighted(Highlight highlight)
	{
		mLastHighlighted = highlight;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field Highlight mLastHighlighted>
	//    3    5:return          
	}

	public void startAction(MotionEvent motionevent)
	{
		OnChartGestureListener onchartgesturelistener = mChart.getOnChartGestureListener();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Chart mChart>
	//    2    4:invokevirtual   #78  <Method OnChartGestureListener Chart.getOnChartGestureListener()>
	//    3    7:astore_2        
		if(onchartgesturelistener != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          23
			onchartgesturelistener.onChartGestureStart(motionevent, mLastGesture);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #44  <Field ChartTouchListener$ChartGesture mLastGesture>
	//   10   18:invokeinterface #107 <Method void OnChartGestureListener.onChartGestureStart(MotionEvent, ChartTouchListener$ChartGesture)>
	//   11   23:return          
	}

	protected static final int DRAG = 1;
	protected static final int NONE = 0;
	protected static final int PINCH_ZOOM = 4;
	protected static final int POST_ZOOM = 5;
	protected static final int ROTATE = 6;
	protected static final int X_ZOOM = 2;
	protected static final int Y_ZOOM = 3;
	protected Chart mChart;
	protected GestureDetector mGestureDetector;
	protected ChartGesture mLastGesture;
	protected Highlight mLastHighlighted;
	protected int mTouchMode;
}
