// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.*;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.renderer.*;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.charts:
//			PieRadarChartBase

public class PieChart extends PieRadarChartBase
{

	public PieChart(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void PieRadarChartBase(Context)>
		mCircleBox = new RectF();
	//    3    5:aload_0         
	//    4    6:new             #30  <Class RectF>
	//    5    9:dup             
	//    6   10:invokespecial   #33  <Method void RectF()>
	//    7   13:putfield        #35  <Field RectF mCircleBox>
		mDrawXLabels = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #37  <Field boolean mDrawXLabels>
		mDrawHole = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #39  <Field boolean mDrawHole>
		mDrawSlicesUnderHole = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #41  <Field boolean mDrawSlicesUnderHole>
		mUsePercentValues = false;
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:putfield        #43  <Field boolean mUsePercentValues>
		mDrawRoundedSlices = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #45  <Field boolean mDrawRoundedSlices>
		mCenterText = "";
	//   23   41:aload_0         
	//   24   42:ldc1            #47  <String "">
	//   25   44:putfield        #49  <Field CharSequence mCenterText>
		mHoleRadiusPercent = 50F;
	//   26   47:aload_0         
	//   27   48:ldc1            #50  <Float 50F>
	//   28   50:putfield        #52  <Field float mHoleRadiusPercent>
		mTransparentCircleRadiusPercent = 55F;
	//   29   53:aload_0         
	//   30   54:ldc1            #53  <Float 55F>
	//   31   56:putfield        #55  <Field float mTransparentCircleRadiusPercent>
		mDrawCenterText = true;
	//   32   59:aload_0         
	//   33   60:iconst_1        
	//   34   61:putfield        #57  <Field boolean mDrawCenterText>
		mCenterTextRadiusPercent = 100F;
	//   35   64:aload_0         
	//   36   65:ldc1            #58  <Float 100F>
	//   37   67:putfield        #60  <Field float mCenterTextRadiusPercent>
		mMaxAngle = 360F;
	//   38   70:aload_0         
	//   39   71:ldc1            #61  <Float 360F>
	//   40   73:putfield        #63  <Field float mMaxAngle>
	//   41   76:return          
	}

	public PieChart(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #67  <Method void PieRadarChartBase(Context, AttributeSet)>
		mCircleBox = new RectF();
	//    4    6:aload_0         
	//    5    7:new             #30  <Class RectF>
	//    6   10:dup             
	//    7   11:invokespecial   #33  <Method void RectF()>
	//    8   14:putfield        #35  <Field RectF mCircleBox>
		mDrawXLabels = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #37  <Field boolean mDrawXLabels>
		mDrawHole = true;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #39  <Field boolean mDrawHole>
		mDrawSlicesUnderHole = false;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #41  <Field boolean mDrawSlicesUnderHole>
		mUsePercentValues = false;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #43  <Field boolean mUsePercentValues>
		mDrawRoundedSlices = false;
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:putfield        #45  <Field boolean mDrawRoundedSlices>
		mCenterText = "";
	//   24   42:aload_0         
	//   25   43:ldc1            #47  <String "">
	//   26   45:putfield        #49  <Field CharSequence mCenterText>
		mHoleRadiusPercent = 50F;
	//   27   48:aload_0         
	//   28   49:ldc1            #50  <Float 50F>
	//   29   51:putfield        #52  <Field float mHoleRadiusPercent>
		mTransparentCircleRadiusPercent = 55F;
	//   30   54:aload_0         
	//   31   55:ldc1            #53  <Float 55F>
	//   32   57:putfield        #55  <Field float mTransparentCircleRadiusPercent>
		mDrawCenterText = true;
	//   33   60:aload_0         
	//   34   61:iconst_1        
	//   35   62:putfield        #57  <Field boolean mDrawCenterText>
		mCenterTextRadiusPercent = 100F;
	//   36   65:aload_0         
	//   37   66:ldc1            #58  <Float 100F>
	//   38   68:putfield        #60  <Field float mCenterTextRadiusPercent>
		mMaxAngle = 360F;
	//   39   71:aload_0         
	//   40   72:ldc1            #61  <Float 360F>
	//   41   74:putfield        #63  <Field float mMaxAngle>
	//   42   77:return          
	}

	public PieChart(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #70  <Method void PieRadarChartBase(Context, AttributeSet, int)>
		mCircleBox = new RectF();
	//    5    7:aload_0         
	//    6    8:new             #30  <Class RectF>
	//    7   11:dup             
	//    8   12:invokespecial   #33  <Method void RectF()>
	//    9   15:putfield        #35  <Field RectF mCircleBox>
		mDrawXLabels = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #37  <Field boolean mDrawXLabels>
		mDrawHole = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #39  <Field boolean mDrawHole>
		mDrawSlicesUnderHole = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #41  <Field boolean mDrawSlicesUnderHole>
		mUsePercentValues = false;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #43  <Field boolean mUsePercentValues>
		mDrawRoundedSlices = false;
	//   22   38:aload_0         
	//   23   39:iconst_0        
	//   24   40:putfield        #45  <Field boolean mDrawRoundedSlices>
		mCenterText = "";
	//   25   43:aload_0         
	//   26   44:ldc1            #47  <String "">
	//   27   46:putfield        #49  <Field CharSequence mCenterText>
		mHoleRadiusPercent = 50F;
	//   28   49:aload_0         
	//   29   50:ldc1            #50  <Float 50F>
	//   30   52:putfield        #52  <Field float mHoleRadiusPercent>
		mTransparentCircleRadiusPercent = 55F;
	//   31   55:aload_0         
	//   32   56:ldc1            #53  <Float 55F>
	//   33   58:putfield        #55  <Field float mTransparentCircleRadiusPercent>
		mDrawCenterText = true;
	//   34   61:aload_0         
	//   35   62:iconst_1        
	//   36   63:putfield        #57  <Field boolean mDrawCenterText>
		mCenterTextRadiusPercent = 100F;
	//   37   66:aload_0         
	//   38   67:ldc1            #58  <Float 100F>
	//   39   69:putfield        #60  <Field float mCenterTextRadiusPercent>
		mMaxAngle = 360F;
	//   40   72:aload_0         
	//   41   73:ldc1            #61  <Float 360F>
	//   42   75:putfield        #63  <Field float mMaxAngle>
	//   43   78:return          
	}

	private float calcAngle(float f)
	{
		return calcAngle(f, ((PieData)mData).getYValueSum());
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #76  <Field com.github.mikephil.charting.data.ChartData mData>
	//    4    6:checkcast       #78  <Class PieData>
	//    5    9:invokevirtual   #82  <Method float PieData.getYValueSum()>
	//    6   12:invokespecial   #85  <Method float calcAngle(float, float)>
	//    7   15:freturn         
	}

	private float calcAngle(float f, float f1)
	{
		return (f / f1) * mMaxAngle;
	//    0    0:fload_1         
	//    1    1:fload_2         
	//    2    2:fdiv            
	//    3    3:aload_0         
	//    4    4:getfield        #63  <Field float mMaxAngle>
	//    5    7:fmul            
	//    6    8:freturn         
	}

	private void calcAngles()
	{
		mDrawAngles = new float[((PieData)mData).getYValCount()];
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #76  <Field com.github.mikephil.charting.data.ChartData mData>
	//    3    5:checkcast       #78  <Class PieData>
	//    4    8:invokevirtual   #90  <Method int PieData.getYValCount()>
	//    5   11:newarray        float[]
	//    6   13:putfield        #92  <Field float[] mDrawAngles>
		mAbsoluteAngles = new float[((PieData)mData).getYValCount()];
	//    7   16:aload_0         
	//    8   17:aload_0         
	//    9   18:getfield        #76  <Field com.github.mikephil.charting.data.ChartData mData>
	//   10   21:checkcast       #78  <Class PieData>
	//   11   24:invokevirtual   #90  <Method int PieData.getYValCount()>
	//   12   27:newarray        float[]
	//   13   29:putfield        #94  <Field float[] mAbsoluteAngles>
		float f = ((PieData)mData).getYValueSum();
	//   14   32:aload_0         
	//   15   33:getfield        #76  <Field com.github.mikephil.charting.data.ChartData mData>
	//   16   36:checkcast       #78  <Class PieData>
	//   17   39:invokevirtual   #82  <Method float PieData.getYValueSum()>
	//   18   42:fstore_1        
		List list = ((PieData)mData).getDataSets();
	//   19   43:aload_0         
	//   20   44:getfield        #76  <Field com.github.mikephil.charting.data.ChartData mData>
	//   21   47:checkcast       #78  <Class PieData>
	//   22   50:invokevirtual   #98  <Method List PieData.getDataSets()>
	//   23   53:astore          5
		int j = 0;
	//   24   55:iconst_0        
	//   25   56:istore_3        
		for(int i = 0; i < ((PieData)mData).getDataSetCount(); i++)
	//*  26   57:iconst_0        
	//*  27   58:istore_2        
	//*  28   59:iload_2         
	//*  29   60:aload_0         
	//*  30   61:getfield        #76  <Field com.github.mikephil.charting.data.ChartData mData>
	//*  31   64:checkcast       #78  <Class PieData>
	//*  32   67:invokevirtual   #101 <Method int PieData.getDataSetCount()>
	//*  33   70:icmpge          187
		{
			IPieDataSet ipiedataset = (IPieDataSet)list.get(i);
	//   34   73:aload           5
	//   35   75:iload_2         
	//   36   76:invokeinterface #107 <Method Object List.get(int)>
	//   37   81:checkcast       #109 <Class IPieDataSet>
	//   38   84:astore          6
			int k = 0;
	//   39   86:iconst_0        
	//   40   87:istore          4
			while(k < ipiedataset.getEntryCount()) 
	//*  41   89:iload           4
	//*  42   91:aload           6
	//*  43   93:invokeinterface #112 <Method int IPieDataSet.getEntryCount()>
	//*  44   98:icmpge          180
			{
				mDrawAngles[j] = calcAngle(Math.abs(ipiedataset.getEntryForIndex(k).getVal()), f);
	//   45  101:aload_0         
	//   46  102:getfield        #92  <Field float[] mDrawAngles>
	//   47  105:iload_3         
	//   48  106:aload_0         
	//   49  107:aload           6
	//   50  109:iload           4
	//   51  111:invokeinterface #116 <Method Entry IPieDataSet.getEntryForIndex(int)>
	//   52  116:invokevirtual   #121 <Method float Entry.getVal()>
	//   53  119:invokestatic    #126 <Method float Math.abs(float)>
	//   54  122:fload_1         
	//   55  123:invokespecial   #85  <Method float calcAngle(float, float)>
	//   56  126:fastore         
				if(j == 0)
	//*  57  127:iload_3         
	//*  58  128:ifne            156
					mAbsoluteAngles[j] = mDrawAngles[j];
	//   59  131:aload_0         
	//   60  132:getfield        #94  <Field float[] mAbsoluteAngles>
	//   61  135:iload_3         
	//   62  136:aload_0         
	//   63  137:getfield        #92  <Field float[] mDrawAngles>
	//   64  140:iload_3         
	//   65  141:faload          
	//   66  142:fastore         
				else
	//*  67  143:iload_3         
	//*  68  144:iconst_1        
	//*  69  145:iadd            
	//*  70  146:istore_3        
	//*  71  147:iload           4
	//*  72  149:iconst_1        
	//*  73  150:iadd            
	//*  74  151:istore          4
	//*  75  153:goto            89
					mAbsoluteAngles[j] = mAbsoluteAngles[j - 1] + mDrawAngles[j];
	//   76  156:aload_0         
	//   77  157:getfield        #94  <Field float[] mAbsoluteAngles>
	//   78  160:iload_3         
	//   79  161:aload_0         
	//   80  162:getfield        #94  <Field float[] mAbsoluteAngles>
	//   81  165:iload_3         
	//   82  166:iconst_1        
	//   83  167:isub            
	//   84  168:faload          
	//   85  169:aload_0         
	//   86  170:getfield        #92  <Field float[] mDrawAngles>
	//   87  173:iload_3         
	//   88  174:faload          
	//   89  175:fadd            
	//   90  176:fastore         
				j++;
				k++;
			}
		}

	//   91  177:goto            143
	//   92  180:iload_2         
	//   93  181:iconst_1        
	//   94  182:iadd            
	//   95  183:istore_2        
	//*  96  184:goto            59
	//   97  187:return          
	}

	protected void calcMinMax()
	{
		super.calcMinMax();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void PieRadarChartBase.calcMinMax()>
		calcAngles();
	//    2    4:aload_0         
	//    3    5:invokespecial   #131 <Method void calcAngles()>
	//    4    8:return          
	}

	public void calculateOffsets()
	{
		super.calculateOffsets();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void PieRadarChartBase.calculateOffsets()>
		if(mData == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #76  <Field com.github.mikephil.charting.data.ChartData mData>
	//*   4    8:ifnonnull       12
		{
			return;
	//    5   11:return          
		} else
		{
			float f = getDiameter() / 2.0F;
	//    6   12:aload_0         
	//    7   13:invokevirtual   #137 <Method float getDiameter()>
	//    8   16:fconst_2        
	//    9   17:fdiv            
	//   10   18:fstore_1        
			PointF pointf = getCenterOffsets();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #141 <Method PointF getCenterOffsets()>
	//   13   23:astore_3        
			float f1 = ((PieData)mData).getDataSet().getSelectionShift();
	//   14   24:aload_0         
	//   15   25:getfield        #76  <Field com.github.mikephil.charting.data.ChartData mData>
	//   16   28:checkcast       #78  <Class PieData>
	//   17   31:invokevirtual   #145 <Method IPieDataSet PieData.getDataSet()>
	//   18   34:invokeinterface #148 <Method float IPieDataSet.getSelectionShift()>
	//   19   39:fstore_2        
			mCircleBox.set((pointf.x - f) + f1, (pointf.y - f) + f1, (pointf.x + f) - f1, (pointf.y + f) - f1);
	//   20   40:aload_0         
	//   21   41:getfield        #35  <Field RectF mCircleBox>
	//   22   44:aload_3         
	//   23   45:getfield        #153 <Field float PointF.x>
	//   24   48:fload_1         
	//   25   49:fsub            
	//   26   50:fload_2         
	//   27   51:fadd            
	//   28   52:aload_3         
	//   29   53:getfield        #156 <Field float PointF.y>
	//   30   56:fload_1         
	//   31   57:fsub            
	//   32   58:fload_2         
	//   33   59:fadd            
	//   34   60:aload_3         
	//   35   61:getfield        #153 <Field float PointF.x>
	//   36   64:fload_1         
	//   37   65:fadd            
	//   38   66:fload_2         
	//   39   67:fsub            
	//   40   68:aload_3         
	//   41   69:getfield        #156 <Field float PointF.y>
	//   42   72:fload_1         
	//   43   73:fadd            
	//   44   74:fload_2         
	//   45   75:fsub            
	//   46   76:invokevirtual   #160 <Method void RectF.set(float, float, float, float)>
			return;
	//   47   79:return          
		}
	}

	public float[] getAbsoluteAngles()
	{
		return mAbsoluteAngles;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field float[] mAbsoluteAngles>
	//    2    4:areturn         
	}

	public PointF getCenterCircleBox()
	{
		return new PointF(mCircleBox.centerX(), mCircleBox.centerY());
	//    0    0:new             #150 <Class PointF>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field RectF mCircleBox>
	//    4    8:invokevirtual   #166 <Method float RectF.centerX()>
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field RectF mCircleBox>
	//    7   15:invokevirtual   #169 <Method float RectF.centerY()>
	//    8   18:invokespecial   #172 <Method void PointF(float, float)>
	//    9   21:areturn         
	}

	public CharSequence getCenterText()
	{
		return mCenterText;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field CharSequence mCenterText>
	//    2    4:areturn         
	}

	public float getCenterTextRadiusPercent()
	{
		return mCenterTextRadiusPercent;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field float mCenterTextRadiusPercent>
	//    2    4:freturn         
	}

	public RectF getCircleBox()
	{
		return mCircleBox;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field RectF mCircleBox>
	//    2    4:areturn         
	}

	public int getDataSetIndexForIndex(int i)
	{
		List list = ((PieData)mData).getDataSets();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field com.github.mikephil.charting.data.ChartData mData>
	//    2    4:checkcast       #78  <Class PieData>
	//    3    7:invokevirtual   #98  <Method List PieData.getDataSets()>
	//    4   10:astore_3        
		for(int j = 0; j < list.size(); j++)
	//*   5   11:iconst_0        
	//*   6   12:istore_2        
	//*   7   13:iload_2         
	//*   8   14:aload_3         
	//*   9   15:invokeinterface #182 <Method int List.size()>
	//*  10   20:icmpge          51
			if(((IPieDataSet)list.get(j)).getEntryForXIndex(i) != null)
	//*  11   23:aload_3         
	//*  12   24:iload_2         
	//*  13   25:invokeinterface #107 <Method Object List.get(int)>
	//*  14   30:checkcast       #109 <Class IPieDataSet>
	//*  15   33:iload_1         
	//*  16   34:invokeinterface #185 <Method Entry IPieDataSet.getEntryForXIndex(int)>
	//*  17   39:ifnull          44
				return j;
	//   18   42:iload_2         
	//   19   43:ireturn         

	//   20   44:iload_2         
	//   21   45:iconst_1        
	//   22   46:iadd            
	//   23   47:istore_2        
	//*  24   48:goto            13
		return -1;
	//   25   51:iconst_m1       
	//   26   52:ireturn         
	}

	public float[] getDrawAngles()
	{
		return mDrawAngles;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field float[] mDrawAngles>
	//    2    4:areturn         
	}

	public float getHoleRadius()
	{
		return mHoleRadiusPercent;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field float mHoleRadiusPercent>
	//    2    4:freturn         
	}

	public int getIndexForAngle(float f)
	{
		f = Utils.getNormalizedAngle(f - getRotationAngle());
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #192 <Method float getRotationAngle()>
	//    3    5:fsub            
	//    4    6:invokestatic    #197 <Method float Utils.getNormalizedAngle(float)>
	//    5    9:fstore_1        
		for(int i = 0; i < mAbsoluteAngles.length; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #94  <Field float[] mAbsoluteAngles>
	//*  11   17:arraylength     
	//*  12   18:icmpge          41
			if(mAbsoluteAngles[i] > f)
	//*  13   21:aload_0         
	//*  14   22:getfield        #94  <Field float[] mAbsoluteAngles>
	//*  15   25:iload_2         
	//*  16   26:faload          
	//*  17   27:fload_1         
	//*  18   28:fcmpl           
	//*  19   29:ifle            34
				return i;
	//   20   32:iload_2         
	//   21   33:ireturn         

	//   22   34:iload_2         
	//   23   35:iconst_1        
	//   24   36:iadd            
	//   25   37:istore_2        
	//*  26   38:goto            12
		return -1;
	//   27   41:iconst_m1       
	//   28   42:ireturn         
	}

	protected float[] getMarkerPosition(Entry entry, Highlight highlight)
	{
		highlight = ((Highlight) (getCenterCircleBox()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #201 <Method PointF getCenterCircleBox()>
	//    2    4:astore_2        
		float f1 = getRadius();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #204 <Method float getRadius()>
	//    5    9:fstore          4
		float f = (f1 / 10F) * 3.6F;
	//    6   11:fload           4
	//    7   13:ldc1            #205 <Float 10F>
	//    8   15:fdiv            
	//    9   16:ldc1            #206 <Float 3.6F>
	//   10   18:fmul            
	//   11   19:fstore_3        
		if(isDrawHoleEnabled())
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #210 <Method boolean isDrawHoleEnabled()>
	//*  14   24:ifeq            43
			f = (f1 - (f1 / 100F) * getHoleRadius()) / 2.0F;
	//   15   27:fload           4
	//   16   29:fload           4
	//   17   31:ldc1            #58  <Float 100F>
	//   18   33:fdiv            
	//   19   34:aload_0         
	//   20   35:invokevirtual   #212 <Method float getHoleRadius()>
	//   21   38:fmul            
	//   22   39:fsub            
	//   23   40:fconst_2        
	//   24   41:fdiv            
	//   25   42:fstore_3        
		f = f1 - f;
	//   26   43:fload           4
	//   27   45:fload_3         
	//   28   46:fsub            
	//   29   47:fstore_3        
		f1 = getRotationAngle();
	//   30   48:aload_0         
	//   31   49:invokevirtual   #192 <Method float getRotationAngle()>
	//   32   52:fstore          4
		int i = entry.getXIndex();
	//   33   54:aload_1         
	//   34   55:invokevirtual   #215 <Method int Entry.getXIndex()>
	//   35   58:istore          6
		float f2 = mDrawAngles[i] / 2.0F;
	//   36   60:aload_0         
	//   37   61:getfield        #92  <Field float[] mDrawAngles>
	//   38   64:iload           6
	//   39   66:faload          
	//   40   67:fconst_2        
	//   41   68:fdiv            
	//   42   69:fstore          5
		return (new float[] {
			(float)((double)f * Math.cos(Math.toRadians(((mAbsoluteAngles[i] + f1) - f2) * mAnimator.getPhaseY())) + (double)((PointF) (highlight)).x), (float)((double)f * Math.sin(Math.toRadians(((mAbsoluteAngles[i] + f1) - f2) * mAnimator.getPhaseY())) + (double)((PointF) (highlight)).y)
		});
	//   43   71:iconst_2        
	//   44   72:newarray        float[]
	//   45   74:dup             
	//   46   75:iconst_0        
	//   47   76:fload_3         
	//   48   77:f2d             
	//   49   78:aload_0         
	//   50   79:getfield        #94  <Field float[] mAbsoluteAngles>
	//   51   82:iload           6
	//   52   84:faload          
	//   53   85:fload           4
	//   54   87:fadd            
	//   55   88:fload           5
	//   56   90:fsub            
	//   57   91:aload_0         
	//   58   92:getfield        #219 <Field ChartAnimator mAnimator>
	//   59   95:invokevirtual   #224 <Method float ChartAnimator.getPhaseY()>
	//   60   98:fmul            
	//   61   99:f2d             
	//   62  100:invokestatic    #228 <Method double Math.toRadians(double)>
	//   63  103:invokestatic    #231 <Method double Math.cos(double)>
	//   64  106:dmul            
	//   65  107:aload_2         
	//   66  108:getfield        #153 <Field float PointF.x>
	//   67  111:f2d             
	//   68  112:dadd            
	//   69  113:d2f             
	//   70  114:fastore         
	//   71  115:dup             
	//   72  116:iconst_1        
	//   73  117:fload_3         
	//   74  118:f2d             
	//   75  119:aload_0         
	//   76  120:getfield        #94  <Field float[] mAbsoluteAngles>
	//   77  123:iload           6
	//   78  125:faload          
	//   79  126:fload           4
	//   80  128:fadd            
	//   81  129:fload           5
	//   82  131:fsub            
	//   83  132:aload_0         
	//   84  133:getfield        #219 <Field ChartAnimator mAnimator>
	//   85  136:invokevirtual   #224 <Method float ChartAnimator.getPhaseY()>
	//   86  139:fmul            
	//   87  140:f2d             
	//   88  141:invokestatic    #228 <Method double Math.toRadians(double)>
	//   89  144:invokestatic    #234 <Method double Math.sin(double)>
	//   90  147:dmul            
	//   91  148:aload_2         
	//   92  149:getfield        #156 <Field float PointF.y>
	//   93  152:f2d             
	//   94  153:dadd            
	//   95  154:d2f             
	//   96  155:fastore         
	//   97  156:areturn         
	}

	public float getMaxAngle()
	{
		return mMaxAngle;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field float mMaxAngle>
	//    2    4:freturn         
	}

	public float getRadius()
	{
		if(mCircleBox == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field RectF mCircleBox>
	//*   2    4:ifnonnull       9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		else
			return Math.min(mCircleBox.width() / 2.0F, mCircleBox.height() / 2.0F);
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field RectF mCircleBox>
	//    7   13:invokevirtual   #238 <Method float RectF.width()>
	//    8   16:fconst_2        
	//    9   17:fdiv            
	//   10   18:aload_0         
	//   11   19:getfield        #35  <Field RectF mCircleBox>
	//   12   22:invokevirtual   #241 <Method float RectF.height()>
	//   13   25:fconst_2        
	//   14   26:fdiv            
	//   15   27:invokestatic    #244 <Method float Math.min(float, float)>
	//   16   30:freturn         
	}

	protected float getRequiredBaseOffset()
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	protected float getRequiredLegendOffset()
	{
		return mLegendRenderer.getLabelPaint().getTextSize() * 2.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field LegendRenderer mLegendRenderer>
	//    2    4:invokevirtual   #256 <Method Paint LegendRenderer.getLabelPaint()>
	//    3    7:invokevirtual   #261 <Method float Paint.getTextSize()>
	//    4   10:fconst_2        
	//    5   11:fmul            
	//    6   12:freturn         
	}

	public float getTransparentCircleRadius()
	{
		return mTransparentCircleRadiusPercent;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field float mTransparentCircleRadiusPercent>
	//    2    4:freturn         
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #265 <Method void PieRadarChartBase.init()>
		mRenderer = ((DataRenderer) (new PieChartRenderer(this, mAnimator, mViewPortHandler)));
	//    2    4:aload_0         
	//    3    5:new             #267 <Class PieChartRenderer>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #219 <Field ChartAnimator mAnimator>
	//    8   14:aload_0         
	//    9   15:getfield        #271 <Field com.github.mikephil.charting.utils.ViewPortHandler mViewPortHandler>
	//   10   18:invokespecial   #274 <Method void PieChartRenderer(PieChart, ChartAnimator, com.github.mikephil.charting.utils.ViewPortHandler)>
	//   11   21:putfield        #278 <Field DataRenderer mRenderer>
	//   12   24:return          
	}

	public boolean isDrawCenterTextEnabled()
	{
		return mDrawCenterText;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean mDrawCenterText>
	//    2    4:ireturn         
	}

	public boolean isDrawHoleEnabled()
	{
		return mDrawHole;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean mDrawHole>
	//    2    4:ireturn         
	}

	public boolean isDrawRoundedSlicesEnabled()
	{
		return mDrawRoundedSlices;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean mDrawRoundedSlices>
	//    2    4:ireturn         
	}

	public boolean isDrawSliceTextEnabled()
	{
		return mDrawXLabels;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean mDrawXLabels>
	//    2    4:ireturn         
	}

	public boolean isDrawSlicesUnderHoleEnabled()
	{
		return mDrawSlicesUnderHole;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean mDrawSlicesUnderHole>
	//    2    4:ireturn         
	}

	public boolean isUsePercentValuesEnabled()
	{
		return mUsePercentValues;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean mUsePercentValues>
	//    2    4:ireturn         
	}

	public boolean needsHighlight(int i, int j)
	{
		if(valuesToHighlight() && j >= 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #288 <Method boolean valuesToHighlight()>
	//*   2    4:ifeq            11
	//*   3    7:iload_2         
	//*   4    8:ifge            13
	//*   5   11:iconst_0        
	//*   6   12:ireturn         
		{
			int k = 0;
	//    7   13:iconst_0        
	//    8   14:istore_3        
			while(k < mIndicesToHighlight.length) 
	//*   9   15:iload_3         
	//*  10   16:aload_0         
	//*  11   17:getfield        #292 <Field Highlight[] mIndicesToHighlight>
	//*  12   20:arraylength     
	//*  13   21:icmpge          11
			{
				if(mIndicesToHighlight[k].getXIndex() == i && mIndicesToHighlight[k].getDataSetIndex() == j)
	//*  14   24:aload_0         
	//*  15   25:getfield        #292 <Field Highlight[] mIndicesToHighlight>
	//*  16   28:iload_3         
	//*  17   29:aaload          
	//*  18   30:invokevirtual   #295 <Method int Highlight.getXIndex()>
	//*  19   33:iload_1         
	//*  20   34:icmpne          52
	//*  21   37:aload_0         
	//*  22   38:getfield        #292 <Field Highlight[] mIndicesToHighlight>
	//*  23   41:iload_3         
	//*  24   42:aaload          
	//*  25   43:invokevirtual   #298 <Method int Highlight.getDataSetIndex()>
	//*  26   46:iload_2         
	//*  27   47:icmpne          52
					return true;
	//   28   50:iconst_1        
	//   29   51:ireturn         
				k++;
	//   30   52:iload_3         
	//   31   53:iconst_1        
	//   32   54:iadd            
	//   33   55:istore_3        
			}
		}
		return false;
	//*  34   56:goto            15
	}

	protected void onDetachedFromWindow()
	{
		if(mRenderer != null && (mRenderer instanceof PieChartRenderer))
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field DataRenderer mRenderer>
	//*   2    4:ifnull          27
	//*   3    7:aload_0         
	//*   4    8:getfield        #278 <Field DataRenderer mRenderer>
	//*   5   11:instanceof      #267 <Class PieChartRenderer>
	//*   6   14:ifeq            27
			((PieChartRenderer)mRenderer).releaseBitmap();
	//    7   17:aload_0         
	//    8   18:getfield        #278 <Field DataRenderer mRenderer>
	//    9   21:checkcast       #267 <Class PieChartRenderer>
	//   10   24:invokevirtual   #302 <Method void PieChartRenderer.releaseBitmap()>
		super.onDetachedFromWindow();
	//   11   27:aload_0         
	//   12   28:invokespecial   #304 <Method void PieRadarChartBase.onDetachedFromWindow()>
	//   13   31:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #308 <Method void PieRadarChartBase.onDraw(Canvas)>
		if(mData == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #76  <Field com.github.mikephil.charting.data.ChartData mData>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		mRenderer.drawData(canvas);
	//    7   13:aload_0         
	//    8   14:getfield        #278 <Field DataRenderer mRenderer>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #313 <Method void DataRenderer.drawData(Canvas)>
		if(valuesToHighlight())
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #288 <Method boolean valuesToHighlight()>
	//*  13   25:ifeq            40
			mRenderer.drawHighlighted(canvas, mIndicesToHighlight);
	//   14   28:aload_0         
	//   15   29:getfield        #278 <Field DataRenderer mRenderer>
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #292 <Field Highlight[] mIndicesToHighlight>
	//   19   37:invokevirtual   #317 <Method void DataRenderer.drawHighlighted(Canvas, Highlight[])>
		mRenderer.drawExtras(canvas);
	//   20   40:aload_0         
	//   21   41:getfield        #278 <Field DataRenderer mRenderer>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #320 <Method void DataRenderer.drawExtras(Canvas)>
		mRenderer.drawValues(canvas);
	//   24   48:aload_0         
	//   25   49:getfield        #278 <Field DataRenderer mRenderer>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #323 <Method void DataRenderer.drawValues(Canvas)>
		mLegendRenderer.renderLegend(canvas);
	//   28   56:aload_0         
	//   29   57:getfield        #250 <Field LegendRenderer mLegendRenderer>
	//   30   60:aload_1         
	//   31   61:invokevirtual   #326 <Method void LegendRenderer.renderLegend(Canvas)>
		drawDescription(canvas);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokevirtual   #329 <Method void drawDescription(Canvas)>
		drawMarkers(canvas);
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:invokevirtual   #332 <Method void drawMarkers(Canvas)>
	//   38   74:return          
	}

	public void setCenterText(CharSequence charsequence)
	{
		if(charsequence == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			mCenterText = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #47  <String "">
	//    4    7:putfield        #49  <Field CharSequence mCenterText>
			return;
	//    5   10:return          
		} else
		{
			mCenterText = charsequence;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #49  <Field CharSequence mCenterText>
			return;
	//    9   16:return          
		}
	}

	public void setCenterTextColor(int i)
	{
		((PieChartRenderer)mRenderer).getPaintCenterText().setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field DataRenderer mRenderer>
	//    2    4:checkcast       #267 <Class PieChartRenderer>
	//    3    7:invokevirtual   #340 <Method TextPaint PieChartRenderer.getPaintCenterText()>
	//    4   10:iload_1         
	//    5   11:invokevirtual   #345 <Method void TextPaint.setColor(int)>
	//    6   14:return          
	}

	public void setCenterTextRadiusPercent(float f)
	{
		mCenterTextRadiusPercent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #60  <Field float mCenterTextRadiusPercent>
	//    3    5:return          
	}

	public void setCenterTextSize(float f)
	{
		((PieChartRenderer)mRenderer).getPaintCenterText().setTextSize(Utils.convertDpToPixel(f));
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field DataRenderer mRenderer>
	//    2    4:checkcast       #267 <Class PieChartRenderer>
	//    3    7:invokevirtual   #340 <Method TextPaint PieChartRenderer.getPaintCenterText()>
	//    4   10:fload_1         
	//    5   11:invokestatic    #351 <Method float Utils.convertDpToPixel(float)>
	//    6   14:invokevirtual   #354 <Method void TextPaint.setTextSize(float)>
	//    7   17:return          
	}

	public void setCenterTextSizePixels(float f)
	{
		((PieChartRenderer)mRenderer).getPaintCenterText().setTextSize(f);
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field DataRenderer mRenderer>
	//    2    4:checkcast       #267 <Class PieChartRenderer>
	//    3    7:invokevirtual   #340 <Method TextPaint PieChartRenderer.getPaintCenterText()>
	//    4   10:fload_1         
	//    5   11:invokevirtual   #354 <Method void TextPaint.setTextSize(float)>
	//    6   14:return          
	}

	public void setCenterTextTypeface(Typeface typeface)
	{
		((PieChartRenderer)mRenderer).getPaintCenterText().setTypeface(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field DataRenderer mRenderer>
	//    2    4:checkcast       #267 <Class PieChartRenderer>
	//    3    7:invokevirtual   #340 <Method TextPaint PieChartRenderer.getPaintCenterText()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #361 <Method Typeface TextPaint.setTypeface(Typeface)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void setDrawCenterText(boolean flag)
	{
		mDrawCenterText = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean mDrawCenterText>
	//    3    5:return          
	}

	public void setDrawHoleEnabled(boolean flag)
	{
		mDrawHole = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean mDrawHole>
	//    3    5:return          
	}

	public void setDrawSliceText(boolean flag)
	{
		mDrawXLabels = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field boolean mDrawXLabels>
	//    3    5:return          
	}

	public void setDrawSlicesUnderHole(boolean flag)
	{
		mDrawSlicesUnderHole = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field boolean mDrawSlicesUnderHole>
	//    3    5:return          
	}

	public void setHoleColor(int i)
	{
		((PieChartRenderer)mRenderer).getPaintHole().setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field DataRenderer mRenderer>
	//    2    4:checkcast       #267 <Class PieChartRenderer>
	//    3    7:invokevirtual   #370 <Method Paint PieChartRenderer.getPaintHole()>
	//    4   10:iload_1         
	//    5   11:invokevirtual   #371 <Method void Paint.setColor(int)>
	//    6   14:return          
	}

	public void setHoleRadius(float f)
	{
		mHoleRadiusPercent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #52  <Field float mHoleRadiusPercent>
	//    3    5:return          
	}

	public void setMaxAngle(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f > 360F)
	//*   2    2:fload_1         
	//*   3    3:ldc1            #61  <Float 360F>
	//*   4    5:fcmpl           
	//*   5    6:ifle            12
			f1 = 360F;
	//    6    9:ldc1            #61  <Float 360F>
	//    7   11:fstore_2        
		f = f1;
	//    8   12:fload_2         
	//    9   13:fstore_1        
		if(f1 < 90F)
	//*  10   14:fload_2         
	//*  11   15:ldc2            #374 <Float 90F>
	//*  12   18:fcmpg           
	//*  13   19:ifge            26
			f = 90F;
	//   14   22:ldc2            #374 <Float 90F>
	//   15   25:fstore_1        
		mMaxAngle = f;
	//   16   26:aload_0         
	//   17   27:fload_1         
	//   18   28:putfield        #63  <Field float mMaxAngle>
	//   19   31:return          
	}

	public void setTransparentCircleAlpha(int i)
	{
		((PieChartRenderer)mRenderer).getPaintTransparentCircle().setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field DataRenderer mRenderer>
	//    2    4:checkcast       #267 <Class PieChartRenderer>
	//    3    7:invokevirtual   #378 <Method Paint PieChartRenderer.getPaintTransparentCircle()>
	//    4   10:iload_1         
	//    5   11:invokevirtual   #381 <Method void Paint.setAlpha(int)>
	//    6   14:return          
	}

	public void setTransparentCircleColor(int i)
	{
		Paint paint = ((PieChartRenderer)mRenderer).getPaintTransparentCircle();
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field DataRenderer mRenderer>
	//    2    4:checkcast       #267 <Class PieChartRenderer>
	//    3    7:invokevirtual   #378 <Method Paint PieChartRenderer.getPaintTransparentCircle()>
	//    4   10:astore_3        
		int j = paint.getAlpha();
	//    5   11:aload_3         
	//    6   12:invokevirtual   #385 <Method int Paint.getAlpha()>
	//    7   15:istore_2        
		paint.setColor(i);
	//    8   16:aload_3         
	//    9   17:iload_1         
	//   10   18:invokevirtual   #371 <Method void Paint.setColor(int)>
		paint.setAlpha(j);
	//   11   21:aload_3         
	//   12   22:iload_2         
	//   13   23:invokevirtual   #381 <Method void Paint.setAlpha(int)>
	//   14   26:return          
	}

	public void setTransparentCircleRadius(float f)
	{
		mTransparentCircleRadiusPercent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #55  <Field float mTransparentCircleRadiusPercent>
	//    3    5:return          
	}

	public void setUsePercentValues(boolean flag)
	{
		mUsePercentValues = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean mUsePercentValues>
	//    3    5:return          
	}

	private float mAbsoluteAngles[];
	private CharSequence mCenterText;
	private float mCenterTextRadiusPercent;
	private RectF mCircleBox;
	private float mDrawAngles[];
	private boolean mDrawCenterText;
	private boolean mDrawHole;
	private boolean mDrawRoundedSlices;
	private boolean mDrawSlicesUnderHole;
	private boolean mDrawXLabels;
	private float mHoleRadiusPercent;
	protected float mMaxAngle;
	protected float mTransparentCircleRadiusPercent;
	private boolean mUsePercentValues;
}
