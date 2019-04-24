// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.github.mikephil.charting.formatter.*;
import com.github.mikephil.charting.utils.Utils;

// Referenced classes of package com.github.mikephil.charting.components:
//			AxisBase

public class YAxis extends AxisBase
{
	public static final class AxisDependency extends Enum
	{

		public static AxisDependency valueOf(String s)
		{
			return (AxisDependency)Enum.valueOf(com/github/mikephil/charting/components/YAxis$AxisDependency, s);
		//    0    0:ldc1            #2   <Class YAxis$AxisDependency>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class YAxis$AxisDependency>
		//    4    9:areturn         
		}

		public static AxisDependency[] values()
		{
			return (AxisDependency[])((AxisDependency []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field YAxis$AxisDependency[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.github.mikephil.charting.components.YAxis$AxisDependency_3B_.clone()>
		//    2    6:checkcast       #38  <Class YAxis$AxisDependency[]>
		//    3    9:areturn         
		}

		private static final AxisDependency $VALUES[];
		public static final AxisDependency LEFT;
		public static final AxisDependency RIGHT;

		static 
		{
			LEFT = new AxisDependency("LEFT", 0);
		//    0    0:new             #2   <Class YAxis$AxisDependency>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "LEFT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void YAxis$AxisDependency(String, int)>
		//    5   10:putstatic       #22  <Field YAxis$AxisDependency LEFT>
			RIGHT = new AxisDependency("RIGHT", 1);
		//    6   13:new             #2   <Class YAxis$AxisDependency>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "RIGHT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void YAxis$AxisDependency(String, int)>
		//   11   23:putstatic       #25  <Field YAxis$AxisDependency RIGHT>
			$VALUES = (new AxisDependency[] {
				LEFT, RIGHT
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       AxisDependency[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field YAxis$AxisDependency LEFT>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field YAxis$AxisDependency RIGHT>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field YAxis$AxisDependency[] $VALUES>
		//*  23   45:return          
		}

		private AxisDependency(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class YAxisLabelPosition extends Enum
	{

		public static YAxisLabelPosition valueOf(String s)
		{
			return (YAxisLabelPosition)Enum.valueOf(com/github/mikephil/charting/components/YAxis$YAxisLabelPosition, s);
		//    0    0:ldc1            #2   <Class YAxis$YAxisLabelPosition>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class YAxis$YAxisLabelPosition>
		//    4    9:areturn         
		}

		public static YAxisLabelPosition[] values()
		{
			return (YAxisLabelPosition[])((YAxisLabelPosition []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field YAxis$YAxisLabelPosition[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.github.mikephil.charting.components.YAxis$YAxisLabelPosition_3B_.clone()>
		//    2    6:checkcast       #38  <Class YAxis$YAxisLabelPosition[]>
		//    3    9:areturn         
		}

		private static final YAxisLabelPosition $VALUES[];
		public static final YAxisLabelPosition INSIDE_CHART;
		public static final YAxisLabelPosition OUTSIDE_CHART;

		static 
		{
			OUTSIDE_CHART = new YAxisLabelPosition("OUTSIDE_CHART", 0);
		//    0    0:new             #2   <Class YAxis$YAxisLabelPosition>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "OUTSIDE_CHART">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void YAxis$YAxisLabelPosition(String, int)>
		//    5   10:putstatic       #22  <Field YAxis$YAxisLabelPosition OUTSIDE_CHART>
			INSIDE_CHART = new YAxisLabelPosition("INSIDE_CHART", 1);
		//    6   13:new             #2   <Class YAxis$YAxisLabelPosition>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "INSIDE_CHART">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void YAxis$YAxisLabelPosition(String, int)>
		//   11   23:putstatic       #25  <Field YAxis$YAxisLabelPosition INSIDE_CHART>
			$VALUES = (new YAxisLabelPosition[] {
				OUTSIDE_CHART, INSIDE_CHART
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       YAxisLabelPosition[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field YAxis$YAxisLabelPosition OUTSIDE_CHART>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field YAxis$YAxisLabelPosition INSIDE_CHART>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field YAxis$YAxisLabelPosition[] $VALUES>
		//*  23   45:return          
		}

		private YAxisLabelPosition(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public YAxis()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AxisBase()>
		mEntries = new float[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:newarray        float[]
	//    5    8:putfield        #44  <Field float[] mEntries>
		mLabelCount = 6;
	//    6   11:aload_0         
	//    7   12:bipush          6
	//    8   14:putfield        #46  <Field int mLabelCount>
		mDrawTopYLabelEntry = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #48  <Field boolean mDrawTopYLabelEntry>
		mShowOnlyMinMax = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #50  <Field boolean mShowOnlyMinMax>
		mInverted = false;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #52  <Field boolean mInverted>
		mForceLabels = false;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #54  <Field boolean mForceLabels>
		mDrawZeroLine = true;
	//   21   37:aload_0         
	//   22   38:iconst_1        
	//   23   39:putfield        #56  <Field boolean mDrawZeroLine>
		mZeroLineColor = 0xff888888;
	//   24   42:aload_0         
	//   25   43:ldc1            #57  <Int 0xff888888>
	//   26   45:putfield        #59  <Field int mZeroLineColor>
		mZeroLineWidth = 1.0F;
	//   27   48:aload_0         
	//   28   49:fconst_1        
	//   29   50:putfield        #61  <Field float mZeroLineWidth>
		mCustomAxisMin = (0.0F / 0.0F);
	//   30   53:aload_0         
	//   31   54:ldc1            #62  <Float (0.0F / 0.0F)>
	//   32   56:putfield        #64  <Field float mCustomAxisMin>
		mCustomAxisMax = (0.0F / 0.0F);
	//   33   59:aload_0         
	//   34   60:ldc1            #62  <Float (0.0F / 0.0F)>
	//   35   62:putfield        #66  <Field float mCustomAxisMax>
		mSpacePercentTop = 10F;
	//   36   65:aload_0         
	//   37   66:ldc1            #67  <Float 10F>
	//   38   68:putfield        #69  <Field float mSpacePercentTop>
		mSpacePercentBottom = 10F;
	//   39   71:aload_0         
	//   40   72:ldc1            #67  <Float 10F>
	//   41   74:putfield        #71  <Field float mSpacePercentBottom>
		mAxisMaximum = 0.0F;
	//   42   77:aload_0         
	//   43   78:fconst_0        
	//   44   79:putfield        #73  <Field float mAxisMaximum>
		mAxisMinimum = 0.0F;
	//   45   82:aload_0         
	//   46   83:fconst_0        
	//   47   84:putfield        #75  <Field float mAxisMinimum>
		mAxisRange = 0.0F;
	//   48   87:aload_0         
	//   49   88:fconst_0        
	//   50   89:putfield        #77  <Field float mAxisRange>
		mPosition = YAxisLabelPosition.OUTSIDE_CHART;
	//   51   92:aload_0         
	//   52   93:getstatic       #80  <Field YAxis$YAxisLabelPosition YAxis$YAxisLabelPosition.OUTSIDE_CHART>
	//   53   96:putfield        #82  <Field YAxis$YAxisLabelPosition mPosition>
		mAxisDependency = AxisDependency.LEFT;
	//   54   99:aload_0         
	//   55  100:getstatic       #85  <Field YAxis$AxisDependency YAxis$AxisDependency.LEFT>
	//   56  103:putfield        #87  <Field YAxis$AxisDependency mAxisDependency>
		mYOffset = 0.0F;
	//   57  106:aload_0         
	//   58  107:fconst_0        
	//   59  108:putfield        #90  <Field float mYOffset>
	//   60  111:return          
	}

	public YAxis(AxisDependency axisdependency)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void AxisBase()>
		mEntries = new float[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:newarray        float[]
	//    5    8:putfield        #44  <Field float[] mEntries>
		mLabelCount = 6;
	//    6   11:aload_0         
	//    7   12:bipush          6
	//    8   14:putfield        #46  <Field int mLabelCount>
		mDrawTopYLabelEntry = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #48  <Field boolean mDrawTopYLabelEntry>
		mShowOnlyMinMax = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #50  <Field boolean mShowOnlyMinMax>
		mInverted = false;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #52  <Field boolean mInverted>
		mForceLabels = false;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #54  <Field boolean mForceLabels>
		mDrawZeroLine = true;
	//   21   37:aload_0         
	//   22   38:iconst_1        
	//   23   39:putfield        #56  <Field boolean mDrawZeroLine>
		mZeroLineColor = 0xff888888;
	//   24   42:aload_0         
	//   25   43:ldc1            #57  <Int 0xff888888>
	//   26   45:putfield        #59  <Field int mZeroLineColor>
		mZeroLineWidth = 1.0F;
	//   27   48:aload_0         
	//   28   49:fconst_1        
	//   29   50:putfield        #61  <Field float mZeroLineWidth>
		mCustomAxisMin = (0.0F / 0.0F);
	//   30   53:aload_0         
	//   31   54:ldc1            #62  <Float (0.0F / 0.0F)>
	//   32   56:putfield        #64  <Field float mCustomAxisMin>
		mCustomAxisMax = (0.0F / 0.0F);
	//   33   59:aload_0         
	//   34   60:ldc1            #62  <Float (0.0F / 0.0F)>
	//   35   62:putfield        #66  <Field float mCustomAxisMax>
		mSpacePercentTop = 10F;
	//   36   65:aload_0         
	//   37   66:ldc1            #67  <Float 10F>
	//   38   68:putfield        #69  <Field float mSpacePercentTop>
		mSpacePercentBottom = 10F;
	//   39   71:aload_0         
	//   40   72:ldc1            #67  <Float 10F>
	//   41   74:putfield        #71  <Field float mSpacePercentBottom>
		mAxisMaximum = 0.0F;
	//   42   77:aload_0         
	//   43   78:fconst_0        
	//   44   79:putfield        #73  <Field float mAxisMaximum>
		mAxisMinimum = 0.0F;
	//   45   82:aload_0         
	//   46   83:fconst_0        
	//   47   84:putfield        #75  <Field float mAxisMinimum>
		mAxisRange = 0.0F;
	//   48   87:aload_0         
	//   49   88:fconst_0        
	//   50   89:putfield        #77  <Field float mAxisRange>
		mPosition = YAxisLabelPosition.OUTSIDE_CHART;
	//   51   92:aload_0         
	//   52   93:getstatic       #80  <Field YAxis$YAxisLabelPosition YAxis$YAxisLabelPosition.OUTSIDE_CHART>
	//   53   96:putfield        #82  <Field YAxis$YAxisLabelPosition mPosition>
		mAxisDependency = axisdependency;
	//   54   99:aload_0         
	//   55  100:aload_1         
	//   56  101:putfield        #87  <Field YAxis$AxisDependency mAxisDependency>
		mYOffset = 0.0F;
	//   57  104:aload_0         
	//   58  105:fconst_0        
	//   59  106:putfield        #90  <Field float mYOffset>
	//   60  109:return          
	}

	public AxisDependency getAxisDependency()
	{
		return mAxisDependency;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field YAxis$AxisDependency mAxisDependency>
	//    2    4:areturn         
	}

	public float getAxisMaxValue()
	{
		return mCustomAxisMax;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field float mCustomAxisMax>
	//    2    4:freturn         
	}

	public float getAxisMinValue()
	{
		return mCustomAxisMin;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field float mCustomAxisMin>
	//    2    4:freturn         
	}

	public String getFormattedLabel(int i)
	{
		if(i < 0 || i >= mEntries.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            13
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field float[] mEntries>
	//*   5    9:arraylength     
	//*   6   10:icmplt          16
			return "";
	//    7   13:ldc1            #101 <String "">
	//    8   15:areturn         
		else
			return getValueFormatter().getFormattedValue(mEntries[i], this);
	//    9   16:aload_0         
	//   10   17:invokevirtual   #105 <Method YAxisValueFormatter getValueFormatter()>
	//   11   20:aload_0         
	//   12   21:getfield        #44  <Field float[] mEntries>
	//   13   24:iload_1         
	//   14   25:faload          
	//   15   26:aload_0         
	//   16   27:invokeinterface #111 <Method String YAxisValueFormatter.getFormattedValue(float, YAxis)>
	//   17   32:areturn         
	}

	public int getLabelCount()
	{
		return mLabelCount;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mLabelCount>
	//    2    4:ireturn         
	}

	public YAxisLabelPosition getLabelPosition()
	{
		return mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field YAxis$YAxisLabelPosition mPosition>
	//    2    4:areturn         
	}

	public String getLongestLabel()
	{
		String s = "";
	//    0    0:ldc1            #101 <String "">
	//    1    2:astore_2        
		for(int i = 0; i < mEntries.length;)
	//*   2    3:iconst_0        
	//*   3    4:istore_1        
	//*   4    5:iload_1         
	//*   5    6:aload_0         
	//*   6    7:getfield        #44  <Field float[] mEntries>
	//*   7   10:arraylength     
	//*   8   11:icmpge          47
		{
			String s2 = getFormattedLabel(i);
	//    9   14:aload_0         
	//   10   15:iload_1         
	//   11   16:invokevirtual   #119 <Method String getFormattedLabel(int)>
	//   12   19:astore          4
			String s1 = s;
	//   13   21:aload_2         
	//   14   22:astore_3        
			if(s.length() < s2.length())
	//*  15   23:aload_2         
	//*  16   24:invokevirtual   #124 <Method int String.length()>
	//*  17   27:aload           4
	//*  18   29:invokevirtual   #124 <Method int String.length()>
	//*  19   32:icmpge          38
				s1 = s2;
	//   20   35:aload           4
	//   21   37:astore_3        
			i++;
	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
			s = s1;
	//   26   42:aload_3         
	//   27   43:astore_2        
		}

	//*  28   44:goto            5
		return s;
	//   29   47:aload_2         
	//   30   48:areturn         
	}

	public float getRequiredHeightSpace(Paint paint)
	{
		paint.setTextSize(mTextSize);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #129 <Field float mTextSize>
	//    3    5:invokevirtual   #135 <Method void Paint.setTextSize(float)>
		return (float)Utils.calcTextHeight(paint, getLongestLabel()) + getYOffset() * 2.0F;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #137 <Method String getLongestLabel()>
	//    7   13:invokestatic    #143 <Method int Utils.calcTextHeight(Paint, String)>
	//    8   16:i2f             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #146 <Method float getYOffset()>
	//   11   21:fconst_2        
	//   12   22:fmul            
	//   13   23:fadd            
	//   14   24:freturn         
	}

	public float getRequiredWidthSpace(Paint paint)
	{
		paint.setTextSize(mTextSize);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #129 <Field float mTextSize>
	//    3    5:invokevirtual   #135 <Method void Paint.setTextSize(float)>
		return (float)Utils.calcTextWidth(paint, getLongestLabel()) + getXOffset() * 2.0F;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #137 <Method String getLongestLabel()>
	//    7   13:invokestatic    #150 <Method int Utils.calcTextWidth(Paint, String)>
	//    8   16:i2f             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #153 <Method float getXOffset()>
	//   11   21:fconst_2        
	//   12   22:fmul            
	//   13   23:fadd            
	//   14   24:freturn         
	}

	public float getSpaceBottom()
	{
		return mSpacePercentBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field float mSpacePercentBottom>
	//    2    4:freturn         
	}

	public float getSpaceTop()
	{
		return mSpacePercentTop;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field float mSpacePercentTop>
	//    2    4:freturn         
	}

	public YAxisValueFormatter getValueFormatter()
	{
		if(mYAxisValueFormatter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field YAxisValueFormatter mYAxisValueFormatter>
	//*   2    4:ifnonnull       22
			mYAxisValueFormatter = ((YAxisValueFormatter) (new DefaultYAxisValueFormatter(mDecimals)));
	//    3    7:aload_0         
	//    4    8:new             #159 <Class DefaultYAxisValueFormatter>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #161 <Field int mDecimals>
	//    8   16:invokespecial   #164 <Method void DefaultYAxisValueFormatter(int)>
	//    9   19:putfield        #157 <Field YAxisValueFormatter mYAxisValueFormatter>
		return mYAxisValueFormatter;
	//   10   22:aload_0         
	//   11   23:getfield        #157 <Field YAxisValueFormatter mYAxisValueFormatter>
	//   12   26:areturn         
	}

	public int getZeroLineColor()
	{
		return mZeroLineColor;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int mZeroLineColor>
	//    2    4:ireturn         
	}

	public float getZeroLineWidth()
	{
		return mZeroLineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field float mZeroLineWidth>
	//    2    4:freturn         
	}

	public boolean isDrawTopYLabelEntryEnabled()
	{
		return mDrawTopYLabelEntry;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean mDrawTopYLabelEntry>
	//    2    4:ireturn         
	}

	public boolean isDrawZeroLineEnabled()
	{
		return mDrawZeroLine;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field boolean mDrawZeroLine>
	//    2    4:ireturn         
	}

	public boolean isForceLabelsEnabled()
	{
		return mForceLabels;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field boolean mForceLabels>
	//    2    4:ireturn         
	}

	public boolean isInverted()
	{
		return mInverted;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean mInverted>
	//    2    4:ireturn         
	}

	public boolean isShowOnlyMinMaxEnabled()
	{
		return mShowOnlyMinMax;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean mShowOnlyMinMax>
	//    2    4:ireturn         
	}

	public boolean needsDefaultFormatter()
	{
		while(mYAxisValueFormatter == null || (mYAxisValueFormatter instanceof DefaultValueFormatter)) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field YAxisValueFormatter mYAxisValueFormatter>
	//*   2    4:ifnonnull       9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:aload_0         
	//    6   10:getfield        #157 <Field YAxisValueFormatter mYAxisValueFormatter>
	//    7   13:instanceof      #175 <Class DefaultValueFormatter>
	//    8   16:ifne            7
		return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean needsOffset()
	{
		return isEnabled() && isDrawLabelsEnabled() && getLabelPosition() == YAxisLabelPosition.OUTSIDE_CHART;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #179 <Method boolean isEnabled()>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:invokevirtual   #182 <Method boolean isDrawLabelsEnabled()>
	//    5   11:ifeq            26
	//    6   14:aload_0         
	//    7   15:invokevirtual   #184 <Method YAxis$YAxisLabelPosition getLabelPosition()>
	//    8   18:getstatic       #80  <Field YAxis$YAxisLabelPosition YAxis$YAxisLabelPosition.OUTSIDE_CHART>
	//    9   21:if_acmpne       26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public void resetAxisMaxValue()
	{
		mCustomAxisMax = (0.0F / 0.0F);
	//    0    0:aload_0         
	//    1    1:ldc1            #62  <Float (0.0F / 0.0F)>
	//    2    3:putfield        #66  <Field float mCustomAxisMax>
	//    3    6:return          
	}

	public void resetAxisMinValue()
	{
		mCustomAxisMin = (0.0F / 0.0F);
	//    0    0:aload_0         
	//    1    1:ldc1            #62  <Float (0.0F / 0.0F)>
	//    2    3:putfield        #64  <Field float mCustomAxisMin>
	//    3    6:return          
	}

	public void setAxisMaxValue(float f)
	{
		mCustomAxisMax = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #66  <Field float mCustomAxisMax>
	//    3    5:return          
	}

	public void setAxisMinValue(float f)
	{
		mCustomAxisMin = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #64  <Field float mCustomAxisMin>
	//    3    5:return          
	}

	public void setDrawTopYLabelEntry(boolean flag)
	{
		mDrawTopYLabelEntry = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field boolean mDrawTopYLabelEntry>
	//    3    5:return          
	}

	public void setDrawZeroLine(boolean flag)
	{
		mDrawZeroLine = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field boolean mDrawZeroLine>
	//    3    5:return          
	}

	public void setInverted(boolean flag)
	{
		mInverted = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean mInverted>
	//    3    5:return          
	}

	public void setLabelCount(int i, boolean flag)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_3        
		if(i > 25)
	//*   2    2:iload_1         
	//*   3    3:bipush          25
	//*   4    5:icmple          11
			j = 25;
	//    5    8:bipush          25
	//    6   10:istore_3        
		i = j;
	//    7   11:iload_3         
	//    8   12:istore_1        
		if(j < 2)
	//*   9   13:iload_3         
	//*  10   14:iconst_2        
	//*  11   15:icmpge          20
			i = 2;
	//   12   18:iconst_2        
	//   13   19:istore_1        
		mLabelCount = i;
	//   14   20:aload_0         
	//   15   21:iload_1         
	//   16   22:putfield        #46  <Field int mLabelCount>
		mForceLabels = flag;
	//   17   25:aload_0         
	//   18   26:iload_2         
	//   19   27:putfield        #54  <Field boolean mForceLabels>
	//   20   30:return          
	}

	public void setPosition(YAxisLabelPosition yaxislabelposition)
	{
		mPosition = yaxislabelposition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field YAxis$YAxisLabelPosition mPosition>
	//    3    5:return          
	}

	public void setShowOnlyMinMax(boolean flag)
	{
		mShowOnlyMinMax = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean mShowOnlyMinMax>
	//    3    5:return          
	}

	public void setSpaceBottom(float f)
	{
		mSpacePercentBottom = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #71  <Field float mSpacePercentBottom>
	//    3    5:return          
	}

	public void setSpaceTop(float f)
	{
		mSpacePercentTop = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #69  <Field float mSpacePercentTop>
	//    3    5:return          
	}

	public void setStartAtZero(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
		{
			setAxisMinValue(0.0F);
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:invokevirtual   #203 <Method void setAxisMinValue(float)>
			return;
	//    5    9:return          
		} else
		{
			resetAxisMinValue();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #205 <Method void resetAxisMinValue()>
			return;
	//    8   14:return          
		}
	}

	public void setValueFormatter(YAxisValueFormatter yaxisvalueformatter)
	{
		if(yaxisvalueformatter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       20
		{
			mYAxisValueFormatter = ((YAxisValueFormatter) (new DefaultYAxisValueFormatter(mDecimals)));
	//    2    4:aload_0         
	//    3    5:new             #159 <Class DefaultYAxisValueFormatter>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #161 <Field int mDecimals>
	//    7   13:invokespecial   #164 <Method void DefaultYAxisValueFormatter(int)>
	//    8   16:putfield        #157 <Field YAxisValueFormatter mYAxisValueFormatter>
			return;
	//    9   19:return          
		} else
		{
			mYAxisValueFormatter = yaxisvalueformatter;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #157 <Field YAxisValueFormatter mYAxisValueFormatter>
			return;
	//   13   25:return          
		}
	}

	public void setZeroLineColor(int i)
	{
		mZeroLineColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field int mZeroLineColor>
	//    3    5:return          
	}

	public void setZeroLineWidth(float f)
	{
		mZeroLineWidth = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #214 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #61  <Field float mZeroLineWidth>
	//    4    8:return          
	}

	private AxisDependency mAxisDependency;
	public float mAxisMaximum;
	public float mAxisMinimum;
	public float mAxisRange;
	protected float mCustomAxisMax;
	protected float mCustomAxisMin;
	public int mDecimals;
	private boolean mDrawTopYLabelEntry;
	protected boolean mDrawZeroLine;
	public float mEntries[];
	public int mEntryCount;
	protected boolean mForceLabels;
	protected boolean mInverted;
	private int mLabelCount;
	private YAxisLabelPosition mPosition;
	protected boolean mShowOnlyMinMax;
	protected float mSpacePercentBottom;
	protected float mSpacePercentTop;
	protected YAxisValueFormatter mYAxisValueFormatter;
	protected int mZeroLineColor;
	protected float mZeroLineWidth;
}
