// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.interfaces.dataprovider.ScatterDataProvider;
import com.github.mikephil.charting.renderer.ScatterChartRenderer;

// Referenced classes of package com.github.mikephil.charting.charts:
//			BarLineChartBase

public class ScatterChart extends BarLineChartBase
	implements ScatterDataProvider
{
	public static final class ScatterShape extends Enum
	{

		public static ScatterShape valueOf(String s)
		{
			return (ScatterShape)Enum.valueOf(com/github/mikephil/charting/charts/ScatterChart$ScatterShape, s);
		//    0    0:ldc1            #2   <Class ScatterChart$ScatterShape>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ScatterChart$ScatterShape>
		//    4    9:areturn         
		}

		public static ScatterShape[] values()
		{
			return (ScatterShape[])((ScatterShape []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field ScatterChart$ScatterShape[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.github.mikephil.charting.charts.ScatterChart$ScatterShape_3B_.clone()>
		//    2    6:checkcast       #50  <Class ScatterChart$ScatterShape[]>
		//    3    9:areturn         
		}

		private static final ScatterShape $VALUES[];
		public static final ScatterShape CIRCLE;
		public static final ScatterShape CROSS;
		public static final ScatterShape SQUARE;
		public static final ScatterShape TRIANGLE;
		public static final ScatterShape X;

		static 
		{
			SQUARE = new ScatterShape("SQUARE", 0);
		//    0    0:new             #2   <Class ScatterChart$ScatterShape>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "SQUARE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void ScatterChart$ScatterShape(String, int)>
		//    5   10:putstatic       #25  <Field ScatterChart$ScatterShape SQUARE>
			CIRCLE = new ScatterShape("CIRCLE", 1);
		//    6   13:new             #2   <Class ScatterChart$ScatterShape>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "CIRCLE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void ScatterChart$ScatterShape(String, int)>
		//   11   23:putstatic       #28  <Field ScatterChart$ScatterShape CIRCLE>
			TRIANGLE = new ScatterShape("TRIANGLE", 2);
		//   12   26:new             #2   <Class ScatterChart$ScatterShape>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "TRIANGLE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void ScatterChart$ScatterShape(String, int)>
		//   17   36:putstatic       #31  <Field ScatterChart$ScatterShape TRIANGLE>
			CROSS = new ScatterShape("CROSS", 3);
		//   18   39:new             #2   <Class ScatterChart$ScatterShape>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "CROSS">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void ScatterChart$ScatterShape(String, int)>
		//   23   49:putstatic       #34  <Field ScatterChart$ScatterShape CROSS>
			X = new ScatterShape("X", 4);
		//   24   52:new             #2   <Class ScatterChart$ScatterShape>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "X">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void ScatterChart$ScatterShape(String, int)>
		//   29   62:putstatic       #37  <Field ScatterChart$ScatterShape X>
			$VALUES = (new ScatterShape[] {
				SQUARE, CIRCLE, TRIANGLE, CROSS, X
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       ScatterShape[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field ScatterChart$ScatterShape SQUARE>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field ScatterChart$ScatterShape CIRCLE>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field ScatterChart$ScatterShape TRIANGLE>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field ScatterChart$ScatterShape CROSS>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field ScatterChart$ScatterShape X>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field ScatterChart$ScatterShape[] $VALUES>
		//*  53  102:return          
		}

		private ScatterShape(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ScatterChart(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void BarLineChartBase(Context)>
	//    3    5:return          
	}

	public ScatterChart(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void BarLineChartBase(Context, AttributeSet)>
	//    4    6:return          
	}

	public ScatterChart(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #21  <Method void BarLineChartBase(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public static ScatterShape[] getAllPossibleShapes()
	{
		return (new ScatterShape[] {
			ScatterShape.SQUARE, ScatterShape.CIRCLE, ScatterShape.TRIANGLE, ScatterShape.CROSS
		});
	//    0    0:iconst_4        
	//    1    1:anewarray       ScatterShape[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:getstatic       #27  <Field ScatterChart$ScatterShape ScatterChart$ScatterShape.SQUARE>
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:getstatic       #30  <Field ScatterChart$ScatterShape ScatterChart$ScatterShape.CIRCLE>
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:getstatic       #33  <Field ScatterChart$ScatterShape ScatterChart$ScatterShape.TRIANGLE>
	//   13   21:aastore         
	//   14   22:dup             
	//   15   23:iconst_3        
	//   16   24:getstatic       #36  <Field ScatterChart$ScatterShape ScatterChart$ScatterShape.CROSS>
	//   17   27:aastore         
	//   18   28:areturn         
	}

	protected void calcMinMax()
	{
		super.calcMinMax();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void BarLineChartBase.calcMinMax()>
		if(mDeltaX == 0.0F && ((ScatterData)mData).getYValCount() > 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #44  <Field float mDeltaX>
	//*   4    8:fconst_0        
	//*   5    9:fcmpl           
	//*   6   10:ifne            31
	//*   7   13:aload_0         
	//*   8   14:getfield        #48  <Field com.github.mikephil.charting.data.ChartData mData>
	//*   9   17:checkcast       #50  <Class ScatterData>
	//*  10   20:invokevirtual   #54  <Method int ScatterData.getYValCount()>
	//*  11   23:ifle            31
			mDeltaX = 1.0F;
	//   12   26:aload_0         
	//   13   27:fconst_1        
	//   14   28:putfield        #44  <Field float mDeltaX>
		mXChartMax = mXChartMax + 0.5F;
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #57  <Field float mXChartMax>
	//   18   36:ldc1            #58  <Float 0.5F>
	//   19   38:fadd            
	//   20   39:putfield        #57  <Field float mXChartMax>
		mDeltaX = Math.abs(mXChartMax - mXChartMin);
	//   21   42:aload_0         
	//   22   43:aload_0         
	//   23   44:getfield        #57  <Field float mXChartMax>
	//   24   47:aload_0         
	//   25   48:getfield        #61  <Field float mXChartMin>
	//   26   51:fsub            
	//   27   52:invokestatic    #67  <Method float Math.abs(float)>
	//   28   55:putfield        #44  <Field float mDeltaX>
	//   29   58:return          
	}

	public ScatterData getScatterData()
	{
		return (ScatterData)mData;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field com.github.mikephil.charting.data.ChartData mData>
	//    2    4:checkcast       #50  <Class ScatterData>
	//    3    7:areturn         
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void BarLineChartBase.init()>
		mRenderer = ((com.github.mikephil.charting.renderer.DataRenderer) (new ScatterChartRenderer(((ScatterDataProvider) (this)), mAnimator, mViewPortHandler)));
	//    2    4:aload_0         
	//    3    5:new             #74  <Class ScatterChartRenderer>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #78  <Field com.github.mikephil.charting.animation.ChartAnimator mAnimator>
	//    8   14:aload_0         
	//    9   15:getfield        #82  <Field com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler>
	//   10   18:invokespecial   #85  <Method void ScatterChartRenderer(ScatterDataProvider, com.github.mikephil.charting.animation.ChartAnimator, com.github.mikephil.charting.utils.ViewPortHandler)>
	//   11   21:putfield        #89  <Field com.github.mikephil.charting.renderer.DataRenderer mRenderer>
		mXChartMin = -0.5F;
	//   12   24:aload_0         
	//   13   25:ldc1            #90  <Float -0.5F>
	//   14   27:putfield        #61  <Field float mXChartMin>
	//   15   30:return          
	}
}
