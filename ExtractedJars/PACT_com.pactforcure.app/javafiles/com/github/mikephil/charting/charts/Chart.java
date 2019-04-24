// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;
import android.content.*;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.animation.EasingFunction;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.DefaultValueFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.ChartHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.*;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.LegendRenderer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.io.*;
import java.util.*;

public abstract class Chart extends ViewGroup
	implements ChartInterface
{

	public Chart(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #91  <Method void ViewGroup(Context)>
		mLogEnabled = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #93  <Field boolean mLogEnabled>
		mData = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #95  <Field ChartData mData>
		mHighLightPerTapEnabled = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #97  <Field boolean mHighLightPerTapEnabled>
		mDragDecelerationEnabled = true;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #99  <Field boolean mDragDecelerationEnabled>
		mDragDecelerationFrictionCoef = 0.9F;
	//   15   25:aload_0         
	//   16   26:ldc1            #100 <Float 0.9F>
	//   17   28:putfield        #102 <Field float mDragDecelerationFrictionCoef>
		mDescription = "Description";
	//   18   31:aload_0         
	//   19   32:ldc1            #104 <String "Description">
	//   20   34:putfield        #106 <Field String mDescription>
		mDeltaX = 1.0F;
	//   21   37:aload_0         
	//   22   38:fconst_1        
	//   23   39:putfield        #108 <Field float mDeltaX>
		mXChartMin = 0.0F;
	//   24   42:aload_0         
	//   25   43:fconst_0        
	//   26   44:putfield        #110 <Field float mXChartMin>
		mXChartMax = 0.0F;
	//   27   47:aload_0         
	//   28   48:fconst_0        
	//   29   49:putfield        #112 <Field float mXChartMax>
		mTouchEnabled = true;
	//   30   52:aload_0         
	//   31   53:iconst_1        
	//   32   54:putfield        #114 <Field boolean mTouchEnabled>
		mNoDataText = "No chart data available.";
	//   33   57:aload_0         
	//   34   58:ldc1            #116 <String "No chart data available.">
	//   35   60:putfield        #118 <Field String mNoDataText>
		mExtraTopOffset = 0.0F;
	//   36   63:aload_0         
	//   37   64:fconst_0        
	//   38   65:putfield        #120 <Field float mExtraTopOffset>
		mExtraRightOffset = 0.0F;
	//   39   68:aload_0         
	//   40   69:fconst_0        
	//   41   70:putfield        #122 <Field float mExtraRightOffset>
		mExtraBottomOffset = 0.0F;
	//   42   73:aload_0         
	//   43   74:fconst_0        
	//   44   75:putfield        #124 <Field float mExtraBottomOffset>
		mExtraLeftOffset = 0.0F;
	//   45   78:aload_0         
	//   46   79:fconst_0        
	//   47   80:putfield        #126 <Field float mExtraLeftOffset>
		mOffsetsCalculated = false;
	//   48   83:aload_0         
	//   49   84:iconst_0        
	//   50   85:putfield        #128 <Field boolean mOffsetsCalculated>
		mDrawMarkerViews = true;
	//   51   88:aload_0         
	//   52   89:iconst_1        
	//   53   90:putfield        #130 <Field boolean mDrawMarkerViews>
		mJobs = new ArrayList();
	//   54   93:aload_0         
	//   55   94:new             #132 <Class ArrayList>
	//   56   97:dup             
	//   57   98:invokespecial   #135 <Method void ArrayList()>
	//   58  101:putfield        #137 <Field ArrayList mJobs>
		mUnbind = false;
	//   59  104:aload_0         
	//   60  105:iconst_0        
	//   61  106:putfield        #139 <Field boolean mUnbind>
		init();
	//   62  109:aload_0         
	//   63  110:invokevirtual   #142 <Method void init()>
	//   64  113:return          
	}

	public Chart(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #146 <Method void ViewGroup(Context, AttributeSet)>
		mLogEnabled = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #93  <Field boolean mLogEnabled>
		mData = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #95  <Field ChartData mData>
		mHighLightPerTapEnabled = true;
	//   10   16:aload_0         
	//   11   17:iconst_1        
	//   12   18:putfield        #97  <Field boolean mHighLightPerTapEnabled>
		mDragDecelerationEnabled = true;
	//   13   21:aload_0         
	//   14   22:iconst_1        
	//   15   23:putfield        #99  <Field boolean mDragDecelerationEnabled>
		mDragDecelerationFrictionCoef = 0.9F;
	//   16   26:aload_0         
	//   17   27:ldc1            #100 <Float 0.9F>
	//   18   29:putfield        #102 <Field float mDragDecelerationFrictionCoef>
		mDescription = "Description";
	//   19   32:aload_0         
	//   20   33:ldc1            #104 <String "Description">
	//   21   35:putfield        #106 <Field String mDescription>
		mDeltaX = 1.0F;
	//   22   38:aload_0         
	//   23   39:fconst_1        
	//   24   40:putfield        #108 <Field float mDeltaX>
		mXChartMin = 0.0F;
	//   25   43:aload_0         
	//   26   44:fconst_0        
	//   27   45:putfield        #110 <Field float mXChartMin>
		mXChartMax = 0.0F;
	//   28   48:aload_0         
	//   29   49:fconst_0        
	//   30   50:putfield        #112 <Field float mXChartMax>
		mTouchEnabled = true;
	//   31   53:aload_0         
	//   32   54:iconst_1        
	//   33   55:putfield        #114 <Field boolean mTouchEnabled>
		mNoDataText = "No chart data available.";
	//   34   58:aload_0         
	//   35   59:ldc1            #116 <String "No chart data available.">
	//   36   61:putfield        #118 <Field String mNoDataText>
		mExtraTopOffset = 0.0F;
	//   37   64:aload_0         
	//   38   65:fconst_0        
	//   39   66:putfield        #120 <Field float mExtraTopOffset>
		mExtraRightOffset = 0.0F;
	//   40   69:aload_0         
	//   41   70:fconst_0        
	//   42   71:putfield        #122 <Field float mExtraRightOffset>
		mExtraBottomOffset = 0.0F;
	//   43   74:aload_0         
	//   44   75:fconst_0        
	//   45   76:putfield        #124 <Field float mExtraBottomOffset>
		mExtraLeftOffset = 0.0F;
	//   46   79:aload_0         
	//   47   80:fconst_0        
	//   48   81:putfield        #126 <Field float mExtraLeftOffset>
		mOffsetsCalculated = false;
	//   49   84:aload_0         
	//   50   85:iconst_0        
	//   51   86:putfield        #128 <Field boolean mOffsetsCalculated>
		mDrawMarkerViews = true;
	//   52   89:aload_0         
	//   53   90:iconst_1        
	//   54   91:putfield        #130 <Field boolean mDrawMarkerViews>
		mJobs = new ArrayList();
	//   55   94:aload_0         
	//   56   95:new             #132 <Class ArrayList>
	//   57   98:dup             
	//   58   99:invokespecial   #135 <Method void ArrayList()>
	//   59  102:putfield        #137 <Field ArrayList mJobs>
		mUnbind = false;
	//   60  105:aload_0         
	//   61  106:iconst_0        
	//   62  107:putfield        #139 <Field boolean mUnbind>
		init();
	//   63  110:aload_0         
	//   64  111:invokevirtual   #142 <Method void init()>
	//   65  114:return          
	}

	public Chart(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #149 <Method void ViewGroup(Context, AttributeSet, int)>
		mLogEnabled = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #93  <Field boolean mLogEnabled>
		mData = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #95  <Field ChartData mData>
		mHighLightPerTapEnabled = true;
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:putfield        #97  <Field boolean mHighLightPerTapEnabled>
		mDragDecelerationEnabled = true;
	//   14   22:aload_0         
	//   15   23:iconst_1        
	//   16   24:putfield        #99  <Field boolean mDragDecelerationEnabled>
		mDragDecelerationFrictionCoef = 0.9F;
	//   17   27:aload_0         
	//   18   28:ldc1            #100 <Float 0.9F>
	//   19   30:putfield        #102 <Field float mDragDecelerationFrictionCoef>
		mDescription = "Description";
	//   20   33:aload_0         
	//   21   34:ldc1            #104 <String "Description">
	//   22   36:putfield        #106 <Field String mDescription>
		mDeltaX = 1.0F;
	//   23   39:aload_0         
	//   24   40:fconst_1        
	//   25   41:putfield        #108 <Field float mDeltaX>
		mXChartMin = 0.0F;
	//   26   44:aload_0         
	//   27   45:fconst_0        
	//   28   46:putfield        #110 <Field float mXChartMin>
		mXChartMax = 0.0F;
	//   29   49:aload_0         
	//   30   50:fconst_0        
	//   31   51:putfield        #112 <Field float mXChartMax>
		mTouchEnabled = true;
	//   32   54:aload_0         
	//   33   55:iconst_1        
	//   34   56:putfield        #114 <Field boolean mTouchEnabled>
		mNoDataText = "No chart data available.";
	//   35   59:aload_0         
	//   36   60:ldc1            #116 <String "No chart data available.">
	//   37   62:putfield        #118 <Field String mNoDataText>
		mExtraTopOffset = 0.0F;
	//   38   65:aload_0         
	//   39   66:fconst_0        
	//   40   67:putfield        #120 <Field float mExtraTopOffset>
		mExtraRightOffset = 0.0F;
	//   41   70:aload_0         
	//   42   71:fconst_0        
	//   43   72:putfield        #122 <Field float mExtraRightOffset>
		mExtraBottomOffset = 0.0F;
	//   44   75:aload_0         
	//   45   76:fconst_0        
	//   46   77:putfield        #124 <Field float mExtraBottomOffset>
		mExtraLeftOffset = 0.0F;
	//   47   80:aload_0         
	//   48   81:fconst_0        
	//   49   82:putfield        #126 <Field float mExtraLeftOffset>
		mOffsetsCalculated = false;
	//   50   85:aload_0         
	//   51   86:iconst_0        
	//   52   87:putfield        #128 <Field boolean mOffsetsCalculated>
		mDrawMarkerViews = true;
	//   53   90:aload_0         
	//   54   91:iconst_1        
	//   55   92:putfield        #130 <Field boolean mDrawMarkerViews>
		mJobs = new ArrayList();
	//   56   95:aload_0         
	//   57   96:new             #132 <Class ArrayList>
	//   58   99:dup             
	//   59  100:invokespecial   #135 <Method void ArrayList()>
	//   60  103:putfield        #137 <Field ArrayList mJobs>
		mUnbind = false;
	//   61  106:aload_0         
	//   62  107:iconst_0        
	//   63  108:putfield        #139 <Field boolean mUnbind>
		init();
	//   64  111:aload_0         
	//   65  112:invokevirtual   #142 <Method void init()>
	//   66  115:return          
	}

	private void unbindDrawables(View view)
	{
		if(view.getBackground() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #157 <Method Drawable View.getBackground()>
	//*   2    4:ifnull          15
			view.getBackground().setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #157 <Method Drawable View.getBackground()>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #163 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		if(view instanceof ViewGroup)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #5   <Class ViewGroup>
	//*   9   19:ifeq            61
		{
			for(int i = 0; i < ((ViewGroup)view).getChildCount(); i++)
	//*  10   22:iconst_0        
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:aload_1         
	//*  14   26:checkcast       #5   <Class ViewGroup>
	//*  15   29:invokevirtual   #167 <Method int ViewGroup.getChildCount()>
	//*  16   32:icmpge          54
				unbindDrawables(((ViewGroup)view).getChildAt(i));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:checkcast       #5   <Class ViewGroup>
	//   20   40:iload_2         
	//   21   41:invokevirtual   #171 <Method View ViewGroup.getChildAt(int)>
	//   22   44:invokespecial   #173 <Method void unbindDrawables(View)>

	//   23   47:iload_2         
	//   24   48:iconst_1        
	//   25   49:iadd            
	//   26   50:istore_2        
	//*  27   51:goto            24
			((ViewGroup)view).removeAllViews();
	//   28   54:aload_1         
	//   29   55:checkcast       #5   <Class ViewGroup>
	//   30   58:invokevirtual   #176 <Method void ViewGroup.removeAllViews()>
		}
	//   31   61:return          
	}

	public void addViewportJob(Runnable runnable)
	{
		if(mViewPortHandler.hasChartDimens())
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field ViewPortHandler mViewPortHandler>
	//*   2    4:invokevirtual   #186 <Method boolean ViewPortHandler.hasChartDimens()>
	//*   3    7:ifeq            17
		{
			post(runnable);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #190 <Method boolean post(Runnable)>
	//    7   15:pop             
			return;
	//    8   16:return          
		} else
		{
			mJobs.add(((Object) (runnable)));
	//    9   17:aload_0         
	//   10   18:getfield        #137 <Field ArrayList mJobs>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #194 <Method boolean ArrayList.add(Object)>
	//   13   25:pop             
			return;
	//   14   26:return          
		}
	}

	public void animateX(int i)
	{
		mAnimator.animateX(i);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ChartAnimator mAnimator>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #202 <Method void ChartAnimator.animateX(int)>
	//    4    8:return          
	}

	public void animateX(int i, com.github.mikephil.charting.animation.Easing.EasingOption easingoption)
	{
		mAnimator.animateX(i, easingoption);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ChartAnimator mAnimator>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #205 <Method void ChartAnimator.animateX(int, com.github.mikephil.charting.animation.Easing$EasingOption)>
	//    5    9:return          
	}

	public void animateX(int i, EasingFunction easingfunction)
	{
		mAnimator.animateX(i, easingfunction);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ChartAnimator mAnimator>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #208 <Method void ChartAnimator.animateX(int, EasingFunction)>
	//    5    9:return          
	}

	public void animateXY(int i, int j)
	{
		mAnimator.animateXY(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ChartAnimator mAnimator>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #212 <Method void ChartAnimator.animateXY(int, int)>
	//    5    9:return          
	}

	public void animateXY(int i, int j, com.github.mikephil.charting.animation.Easing.EasingOption easingoption, com.github.mikephil.charting.animation.Easing.EasingOption easingoption1)
	{
		mAnimator.animateXY(i, j, easingoption, easingoption1);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ChartAnimator mAnimator>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #215 <Method void ChartAnimator.animateXY(int, int, com.github.mikephil.charting.animation.Easing$EasingOption, com.github.mikephil.charting.animation.Easing$EasingOption)>
	//    7   12:return          
	}

	public void animateXY(int i, int j, EasingFunction easingfunction, EasingFunction easingfunction1)
	{
		mAnimator.animateXY(i, j, easingfunction, easingfunction1);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ChartAnimator mAnimator>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #218 <Method void ChartAnimator.animateXY(int, int, EasingFunction, EasingFunction)>
	//    7   12:return          
	}

	public void animateY(int i)
	{
		mAnimator.animateY(i);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ChartAnimator mAnimator>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #221 <Method void ChartAnimator.animateY(int)>
	//    4    8:return          
	}

	public void animateY(int i, com.github.mikephil.charting.animation.Easing.EasingOption easingoption)
	{
		mAnimator.animateY(i, easingoption);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ChartAnimator mAnimator>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #223 <Method void ChartAnimator.animateY(int, com.github.mikephil.charting.animation.Easing$EasingOption)>
	//    5    9:return          
	}

	public void animateY(int i, EasingFunction easingfunction)
	{
		mAnimator.animateY(i, easingfunction);
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ChartAnimator mAnimator>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #225 <Method void ChartAnimator.animateY(int, EasingFunction)>
	//    5    9:return          
	}

	protected abstract void calcMinMax();

	protected void calculateFormatter(float f, float f1)
	{
		if(mData == null || mData.getXValCount() < 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field ChartData mData>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field ChartData mData>
	//*   5   11:invokevirtual   #233 <Method int ChartData.getXValCount()>
	//*   6   14:iconst_2        
	//*   7   15:icmpge          46
			f = Math.max(Math.abs(f), Math.abs(f1));
	//    8   18:fload_1         
	//    9   19:invokestatic    #239 <Method float Math.abs(float)>
	//   10   22:fload_2         
	//   11   23:invokestatic    #239 <Method float Math.abs(float)>
	//   12   26:invokestatic    #243 <Method float Math.max(float, float)>
	//   13   29:fstore_1        
		else
	//*  14   30:aload_0         
	//*  15   31:new             #245 <Class DefaultValueFormatter>
	//*  16   34:dup             
	//*  17   35:fload_1         
	//*  18   36:invokestatic    #251 <Method int Utils.getDecimals(float)>
	//*  19   39:invokespecial   #253 <Method void DefaultValueFormatter(int)>
	//*  20   42:putfield        #255 <Field ValueFormatter mDefaultFormatter>
	//*  21   45:return          
			f = Math.abs(f1 - f);
	//   22   46:fload_2         
	//   23   47:fload_1         
	//   24   48:fsub            
	//   25   49:invokestatic    #239 <Method float Math.abs(float)>
	//   26   52:fstore_1        
		mDefaultFormatter = ((ValueFormatter) (new DefaultValueFormatter(Utils.getDecimals(f))));
	//*  27   53:goto            30
	}

	protected abstract void calculateOffsets();

	public void clear()
	{
		mData = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #95  <Field ChartData mData>
		mIndicesToHighlight = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #259 <Field Highlight[] mIndicesToHighlight>
		invalidate();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #262 <Method void invalidate()>
	//    8   14:return          
	}

	public void clearAllViewportJobs()
	{
		mJobs.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field ArrayList mJobs>
	//    2    4:invokevirtual   #265 <Method void ArrayList.clear()>
	//    3    7:return          
	}

	public void clearValues()
	{
		mData.clearValues();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ChartData mData>
	//    2    4:invokevirtual   #268 <Method void ChartData.clearValues()>
		invalidate();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #262 <Method void invalidate()>
	//    5   11:return          
	}

	public void disableScroll()
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #273 <Method ViewParent getParent()>
	//    2    4:astore_1        
		if(viewparent != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			viewparent.requestDisallowInterceptTouchEvent(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokeinterface #279 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//    8   16:return          
	}

	protected void drawDescription(Canvas canvas)
	{
label0:
		{
			if(!mDescription.equals(""))
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field String mDescription>
	//*   2    4:ldc2            #283 <String "">
	//*   3    7:invokevirtual   #288 <Method boolean String.equals(Object)>
	//*   4   10:ifne            66
			{
				if(mDescriptionPosition != null)
					break label0;
	//    5   13:aload_0         
	//    6   14:getfield        #290 <Field PointF mDescriptionPosition>
	//    7   17:ifnonnull       67
				canvas.drawText(mDescription, (float)getWidth() - mViewPortHandler.offsetRight() - 10F, (float)getHeight() - mViewPortHandler.offsetBottom() - 10F, mDescPaint);
	//    8   20:aload_1         
	//    9   21:aload_0         
	//   10   22:getfield        #106 <Field String mDescription>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #293 <Method int getWidth()>
	//   13   29:i2f             
	//   14   30:aload_0         
	//   15   31:getfield        #180 <Field ViewPortHandler mViewPortHandler>
	//   16   34:invokevirtual   #297 <Method float ViewPortHandler.offsetRight()>
	//   17   37:fsub            
	//   18   38:ldc2            #298 <Float 10F>
	//   19   41:fsub            
	//   20   42:aload_0         
	//   21   43:invokevirtual   #301 <Method int getHeight()>
	//   22   46:i2f             
	//   23   47:aload_0         
	//   24   48:getfield        #180 <Field ViewPortHandler mViewPortHandler>
	//   25   51:invokevirtual   #304 <Method float ViewPortHandler.offsetBottom()>
	//   26   54:fsub            
	//   27   55:ldc2            #298 <Float 10F>
	//   28   58:fsub            
	//   29   59:aload_0         
	//   30   60:getfield        #306 <Field Paint mDescPaint>
	//   31   63:invokevirtual   #312 <Method void Canvas.drawText(String, float, float, Paint)>
			}
			return;
	//   32   66:return          
		}
		canvas.drawText(mDescription, mDescriptionPosition.x, mDescriptionPosition.y, mDescPaint);
	//   33   67:aload_1         
	//   34   68:aload_0         
	//   35   69:getfield        #106 <Field String mDescription>
	//   36   72:aload_0         
	//   37   73:getfield        #290 <Field PointF mDescriptionPosition>
	//   38   76:getfield        #317 <Field float PointF.x>
	//   39   79:aload_0         
	//   40   80:getfield        #290 <Field PointF mDescriptionPosition>
	//   41   83:getfield        #320 <Field float PointF.y>
	//   42   86:aload_0         
	//   43   87:getfield        #306 <Field Paint mDescPaint>
	//   44   90:invokevirtual   #312 <Method void Canvas.drawText(String, float, float, Paint)>
	//   45   93:return          
	}

	protected void drawMarkers(Canvas canvas)
	{
		if(mMarkerView != null && mDrawMarkerViews && valuesToHighlight())
	//*   0    0:aload_0         
	//*   1    1:getfield        #323 <Field MarkerView mMarkerView>
	//*   2    4:ifnull          21
	//*   3    7:aload_0         
	//*   4    8:getfield        #130 <Field boolean mDrawMarkerViews>
	//*   5   11:ifeq            21
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #326 <Method boolean valuesToHighlight()>
	//*   8   18:ifne            22
	//*   9   21:return          
		{
			int i = 0;
	//   10   22:iconst_0        
	//   11   23:istore          4
			while(i < mIndicesToHighlight.length) 
	//*  12   25:iload           4
	//*  13   27:aload_0         
	//*  14   28:getfield        #259 <Field Highlight[] mIndicesToHighlight>
	//*  15   31:arraylength     
	//*  16   32:icmpge          21
			{
				Highlight highlight = mIndicesToHighlight[i];
	//   17   35:aload_0         
	//   18   36:getfield        #259 <Field Highlight[] mIndicesToHighlight>
	//   19   39:iload           4
	//   20   41:aaload          
	//   21   42:astore          6
				int j = highlight.getXIndex();
	//   22   44:aload           6
	//   23   46:invokevirtual   #331 <Method int Highlight.getXIndex()>
	//   24   49:istore          5
				highlight.getDataSetIndex();
	//   25   51:aload           6
	//   26   53:invokevirtual   #334 <Method int Highlight.getDataSetIndex()>
	//   27   56:pop             
				if((float)j <= mDeltaX && (float)j <= mDeltaX * mAnimator.getPhaseX())
	//*  28   57:iload           5
	//*  29   59:i2f             
	//*  30   60:aload_0         
	//*  31   61:getfield        #108 <Field float mDeltaX>
	//*  32   64:fcmpg           
	//*  33   65:ifgt            126
	//*  34   68:iload           5
	//*  35   70:i2f             
	//*  36   71:aload_0         
	//*  37   72:getfield        #108 <Field float mDeltaX>
	//*  38   75:aload_0         
	//*  39   76:getfield        #198 <Field ChartAnimator mAnimator>
	//*  40   79:invokevirtual   #337 <Method float ChartAnimator.getPhaseX()>
	//*  41   82:fmul            
	//*  42   83:fcmpg           
	//*  43   84:ifgt            126
				{
					Entry entry = mData.getEntryForHighlight(mIndicesToHighlight[i]);
	//   44   87:aload_0         
	//   45   88:getfield        #95  <Field ChartData mData>
	//   46   91:aload_0         
	//   47   92:getfield        #259 <Field Highlight[] mIndicesToHighlight>
	//   48   95:iload           4
	//   49   97:aaload          
	//   50   98:invokevirtual   #341 <Method Entry ChartData.getEntryForHighlight(Highlight)>
	//   51  101:astore          7
					if(entry != null && entry.getXIndex() == mIndicesToHighlight[i].getXIndex())
	//*  52  103:aload           7
	//*  53  105:ifnull          126
	//*  54  108:aload           7
	//*  55  110:invokevirtual   #344 <Method int Entry.getXIndex()>
	//*  56  113:aload_0         
	//*  57  114:getfield        #259 <Field Highlight[] mIndicesToHighlight>
	//*  58  117:iload           4
	//*  59  119:aaload          
	//*  60  120:invokevirtual   #331 <Method int Highlight.getXIndex()>
	//*  61  123:icmpeq          135
	//*  62  126:iload           4
	//*  63  128:iconst_1        
	//*  64  129:iadd            
	//*  65  130:istore          4
	//*  66  132:goto            25
					{
						float af[] = getMarkerPosition(entry, highlight);
	//   67  135:aload_0         
	//   68  136:aload           7
	//   69  138:aload           6
	//   70  140:invokevirtual   #348 <Method float[] getMarkerPosition(Entry, Highlight)>
	//   71  143:astore          8
						if(mViewPortHandler.isInBounds(af[0], af[1]))
	//*  72  145:aload_0         
	//*  73  146:getfield        #180 <Field ViewPortHandler mViewPortHandler>
	//*  74  149:aload           8
	//*  75  151:iconst_0        
	//*  76  152:faload          
	//*  77  153:aload           8
	//*  78  155:iconst_1        
	//*  79  156:faload          
	//*  80  157:invokevirtual   #352 <Method boolean ViewPortHandler.isInBounds(float, float)>
	//*  81  160:ifeq            126
						{
							mMarkerView.refreshContent(entry, highlight);
	//   82  163:aload_0         
	//   83  164:getfield        #323 <Field MarkerView mMarkerView>
	//   84  167:aload           7
	//   85  169:aload           6
	//   86  171:invokevirtual   #358 <Method void MarkerView.refreshContent(Entry, Highlight)>
							mMarkerView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
	//   87  174:aload_0         
	//   88  175:getfield        #323 <Field MarkerView mMarkerView>
	//   89  178:iconst_0        
	//   90  179:iconst_0        
	//   91  180:invokestatic    #364 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   92  183:iconst_0        
	//   93  184:iconst_0        
	//   94  185:invokestatic    #364 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   95  188:invokevirtual   #367 <Method void MarkerView.measure(int, int)>
							mMarkerView.layout(0, 0, mMarkerView.getMeasuredWidth(), mMarkerView.getMeasuredHeight());
	//   96  191:aload_0         
	//   97  192:getfield        #323 <Field MarkerView mMarkerView>
	//   98  195:iconst_0        
	//   99  196:iconst_0        
	//  100  197:aload_0         
	//  101  198:getfield        #323 <Field MarkerView mMarkerView>
	//  102  201:invokevirtual   #370 <Method int MarkerView.getMeasuredWidth()>
	//  103  204:aload_0         
	//  104  205:getfield        #323 <Field MarkerView mMarkerView>
	//  105  208:invokevirtual   #373 <Method int MarkerView.getMeasuredHeight()>
	//  106  211:invokevirtual   #377 <Method void MarkerView.layout(int, int, int, int)>
							if(af[1] - (float)mMarkerView.getHeight() <= 0.0F)
	//* 107  214:aload           8
	//* 108  216:iconst_1        
	//* 109  217:faload          
	//* 110  218:aload_0         
	//* 111  219:getfield        #323 <Field MarkerView mMarkerView>
	//* 112  222:invokevirtual   #378 <Method int MarkerView.getHeight()>
	//* 113  225:i2f             
	//* 114  226:fsub            
	//* 115  227:fconst_0        
	//* 116  228:fcmpg           
	//* 117  229:ifgt            269
							{
								float f = mMarkerView.getHeight();
	//  118  232:aload_0         
	//  119  233:getfield        #323 <Field MarkerView mMarkerView>
	//  120  236:invokevirtual   #378 <Method int MarkerView.getHeight()>
	//  121  239:i2f             
	//  122  240:fstore_2        
								float f1 = af[1];
	//  123  241:aload           8
	//  124  243:iconst_1        
	//  125  244:faload          
	//  126  245:fstore_3        
								mMarkerView.draw(canvas, af[0], af[1] + (f - f1));
	//  127  246:aload_0         
	//  128  247:getfield        #323 <Field MarkerView mMarkerView>
	//  129  250:aload_1         
	//  130  251:aload           8
	//  131  253:iconst_0        
	//  132  254:faload          
	//  133  255:aload           8
	//  134  257:iconst_1        
	//  135  258:faload          
	//  136  259:fload_2         
	//  137  260:fload_3         
	//  138  261:fsub            
	//  139  262:fadd            
	//  140  263:invokevirtual   #382 <Method void MarkerView.draw(Canvas, float, float)>
							} else
	//* 141  266:goto            126
							{
								mMarkerView.draw(canvas, af[0], af[1]);
	//  142  269:aload_0         
	//  143  270:getfield        #323 <Field MarkerView mMarkerView>
	//  144  273:aload_1         
	//  145  274:aload           8
	//  146  276:iconst_0        
	//  147  277:faload          
	//  148  278:aload           8
	//  149  280:iconst_1        
	//  150  281:faload          
	//  151  282:invokevirtual   #382 <Method void MarkerView.draw(Canvas, float, float)>
							}
						}
					}
				}
				i++;
			}
		}
	//* 152  285:goto            126
	}

	public void enableScroll()
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #273 <Method ViewParent getParent()>
	//    2    4:astore_1        
		if(viewparent != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			viewparent.requestDisallowInterceptTouchEvent(false);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokeinterface #279 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//    8   16:return          
	}

	public ChartAnimator getAnimator()
	{
		return mAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field ChartAnimator mAnimator>
	//    2    4:areturn         
	}

	public PointF getCenter()
	{
		return new PointF((float)getWidth() / 2.0F, (float)getHeight() / 2.0F);
	//    0    0:new             #314 <Class PointF>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #293 <Method int getWidth()>
	//    4    8:i2f             
	//    5    9:fconst_2        
	//    6   10:fdiv            
	//    7   11:aload_0         
	//    8   12:invokevirtual   #301 <Method int getHeight()>
	//    9   15:i2f             
	//   10   16:fconst_2        
	//   11   17:fdiv            
	//   12   18:invokespecial   #389 <Method void PointF(float, float)>
	//   13   21:areturn         
	}

	public PointF getCenterOfView()
	{
		return getCenter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #392 <Method PointF getCenter()>
	//    2    4:areturn         
	}

	public PointF getCenterOffsets()
	{
		return mViewPortHandler.getContentCenter();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #396 <Method PointF ViewPortHandler.getContentCenter()>
	//    3    7:areturn         
	}

	public Bitmap getChartBitmap()
	{
		Bitmap bitmap = Bitmap.createBitmap(getWidth(), getHeight(), android.graphics.Bitmap.Config.RGB_565);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #293 <Method int getWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #301 <Method int getHeight()>
	//    4    8:getstatic       #404 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//    5   11:invokestatic    #410 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//    6   14:astore_1        
		Canvas canvas = new Canvas(bitmap);
	//    7   15:new             #308 <Class Canvas>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #413 <Method void Canvas(Bitmap)>
	//   11   23:astore_2        
		Drawable drawable = getBackground();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #414 <Method Drawable getBackground()>
	//   14   28:astore_3        
		if(drawable != null)
	//*  15   29:aload_3         
	//*  16   30:ifnull          45
			drawable.draw(canvas);
	//   17   33:aload_3         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #416 <Method void Drawable.draw(Canvas)>
		else
	//*  20   38:aload_0         
	//*  21   39:aload_2         
	//*  22   40:invokevirtual   #417 <Method void draw(Canvas)>
	//*  23   43:aload_1         
	//*  24   44:areturn         
			canvas.drawColor(-1);
	//   25   45:aload_2         
	//   26   46:iconst_m1       
	//   27   47:invokevirtual   #420 <Method void Canvas.drawColor(int)>
		draw(canvas);
		return bitmap;
	//*  28   50:goto            38
	}

	public RectF getContentRect()
	{
		return mViewPortHandler.getContentRect();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #424 <Method RectF ViewPortHandler.getContentRect()>
	//    3    7:areturn         
	}

	public ChartData getData()
	{
		return mData;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ChartData mData>
	//    2    4:areturn         
	}

	public ValueFormatter getDefaultValueFormatter()
	{
		return mDefaultFormatter;
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field ValueFormatter mDefaultFormatter>
	//    2    4:areturn         
	}

	public float getDragDecelerationFrictionCoef()
	{
		return mDragDecelerationFrictionCoef;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field float mDragDecelerationFrictionCoef>
	//    2    4:freturn         
	}

	public List getEntriesAtIndex(int i)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #132 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #135 <Method void ArrayList()>
	//    3    7:astore_3        
		for(int j = 0; j < mData.getDataSetCount(); j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #95  <Field ChartData mData>
	//*   9   15:invokevirtual   #436 <Method int ChartData.getDataSetCount()>
	//*  10   18:icmpge          58
		{
			Entry entry = mData.getDataSetByIndex(j).getEntryForXIndex(i);
	//   11   21:aload_0         
	//   12   22:getfield        #95  <Field ChartData mData>
	//   13   25:iload_2         
	//   14   26:invokevirtual   #440 <Method IDataSet ChartData.getDataSetByIndex(int)>
	//   15   29:iload_1         
	//   16   30:invokeinterface #446 <Method Entry IDataSet.getEntryForXIndex(int)>
	//   17   35:astore          4
			if(entry != null)
	//*  18   37:aload           4
	//*  19   39:ifnull          51
				((List) (arraylist)).add(((Object) (entry)));
	//   20   42:aload_3         
	//   21   43:aload           4
	//   22   45:invokeinterface #449 <Method boolean List.add(Object)>
	//   23   50:pop             
		}

	//   24   51:iload_2         
	//   25   52:iconst_1        
	//   26   53:iadd            
	//   27   54:istore_2        
	//*  28   55:goto            10
		return ((List) (arraylist));
	//   29   58:aload_3         
	//   30   59:areturn         
	}

	public float getExtraBottomOffset()
	{
		return mExtraBottomOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field float mExtraBottomOffset>
	//    2    4:freturn         
	}

	public float getExtraLeftOffset()
	{
		return mExtraLeftOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field float mExtraLeftOffset>
	//    2    4:freturn         
	}

	public float getExtraRightOffset()
	{
		return mExtraRightOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field float mExtraRightOffset>
	//    2    4:freturn         
	}

	public float getExtraTopOffset()
	{
		return mExtraTopOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field float mExtraTopOffset>
	//    2    4:freturn         
	}

	public Highlight[] getHighlighted()
	{
		return mIndicesToHighlight;
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field Highlight[] mIndicesToHighlight>
	//    2    4:areturn         
	}

	public ChartHighlighter getHighlighter()
	{
		return mHighlighter;
	//    0    0:aload_0         
	//    1    1:getfield        #460 <Field ChartHighlighter mHighlighter>
	//    2    4:areturn         
	}

	public ArrayList getJobs()
	{
		return mJobs;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field ArrayList mJobs>
	//    2    4:areturn         
	}

	public Legend getLegend()
	{
		return mLegend;
	//    0    0:aload_0         
	//    1    1:getfield        #467 <Field Legend mLegend>
	//    2    4:areturn         
	}

	public LegendRenderer getLegendRenderer()
	{
		return mLegendRenderer;
	//    0    0:aload_0         
	//    1    1:getfield        #471 <Field LegendRenderer mLegendRenderer>
	//    2    4:areturn         
	}

	protected abstract float[] getMarkerPosition(Entry entry, Highlight highlight);

	public MarkerView getMarkerView()
	{
		return mMarkerView;
	//    0    0:aload_0         
	//    1    1:getfield        #323 <Field MarkerView mMarkerView>
	//    2    4:areturn         
	}

	public OnChartGestureListener getOnChartGestureListener()
	{
		return mGestureListener;
	//    0    0:aload_0         
	//    1    1:getfield        #477 <Field OnChartGestureListener mGestureListener>
	//    2    4:areturn         
	}

	public Paint getPaint(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               7: 30
	//	               11: 35
		default:
			return null;
	//    2   28:aconst_null     
	//    3   29:areturn         

		case 7: // '\007'
			return mInfoPaint;
	//    4   30:aload_0         
	//    5   31:getfield        #481 <Field Paint mInfoPaint>
	//    6   34:areturn         

		case 11: // '\013'
			return mDescPaint;
	//    7   35:aload_0         
	//    8   36:getfield        #306 <Field Paint mDescPaint>
	//    9   39:areturn         
		}
	}

	public DataRenderer getRenderer()
	{
		return mRenderer;
	//    0    0:aload_0         
	//    1    1:getfield        #485 <Field DataRenderer mRenderer>
	//    2    4:areturn         
	}

	public int getValueCount()
	{
		return mData.getYValCount();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ChartData mData>
	//    2    4:invokevirtual   #489 <Method int ChartData.getYValCount()>
	//    3    7:ireturn         
	}

	public ViewPortHandler getViewPortHandler()
	{
		return mViewPortHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field ViewPortHandler mViewPortHandler>
	//    2    4:areturn         
	}

	public float getXChartMax()
	{
		return mXChartMax;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field float mXChartMax>
	//    2    4:freturn         
	}

	public float getXChartMin()
	{
		return mXChartMin;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field float mXChartMin>
	//    2    4:freturn         
	}

	public int getXValCount()
	{
		return mData.getXValCount();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ChartData mData>
	//    2    4:invokevirtual   #233 <Method int ChartData.getXValCount()>
	//    3    7:ireturn         
	}

	public String getXValue(int i)
	{
		if(mData == null || mData.getXValCount() <= i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field ChartData mData>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field ChartData mData>
	//*   5   11:invokevirtual   #233 <Method int ChartData.getXValCount()>
	//*   6   14:iload_1         
	//*   7   15:icmpgt          20
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
		else
			return (String)mData.getXVals().get(i);
	//   10   20:aload_0         
	//   11   21:getfield        #95  <Field ChartData mData>
	//   12   24:invokevirtual   #499 <Method List ChartData.getXVals()>
	//   13   27:iload_1         
	//   14   28:invokeinterface #503 <Method Object List.get(int)>
	//   15   33:checkcast       #285 <Class String>
	//   16   36:areturn         
	}

	public float getYMax()
	{
		return mData.getYMax();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ChartData mData>
	//    2    4:invokevirtual   #506 <Method float ChartData.getYMax()>
	//    3    7:freturn         
	}

	public float getYMin()
	{
		return mData.getYMin();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ChartData mData>
	//    2    4:invokevirtual   #509 <Method float ChartData.getYMin()>
	//    3    7:freturn         
	}

	public void highlightTouch(Highlight highlight)
	{
		highlightValue(highlight, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #516 <Method void highlightValue(Highlight, boolean)>
	//    4    6:return          
	}

	public void highlightValue(int i, int j)
	{
		if(i < 0 || j < 0 || i >= mData.getXValCount() || j >= mData.getDataSetCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            30
	//*   2    4:iload_2         
	//*   3    5:iflt            30
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #95  <Field ChartData mData>
	//*   7   13:invokevirtual   #233 <Method int ChartData.getXValCount()>
	//*   8   16:icmpge          30
	//*   9   19:iload_2         
	//*  10   20:aload_0         
	//*  11   21:getfield        #95  <Field ChartData mData>
	//*  12   24:invokevirtual   #436 <Method int ChartData.getDataSetCount()>
	//*  13   27:icmplt          36
		{
			highlightValues(((Highlight []) (null)));
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:invokevirtual   #521 <Method void highlightValues(Highlight[])>
			return;
	//   17   35:return          
		} else
		{
			highlightValues(new Highlight[] {
				new Highlight(i, j)
			});
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:anewarray       Highlight[]
	//   21   41:dup             
	//   22   42:iconst_0        
	//   23   43:new             #328 <Class Highlight>
	//   24   46:dup             
	//   25   47:iload_1         
	//   26   48:iload_2         
	//   27   49:invokespecial   #523 <Method void Highlight(int, int)>
	//   28   52:aastore         
	//   29   53:invokevirtual   #521 <Method void highlightValues(Highlight[])>
			return;
	//   30   56:return          
		}
	}

	public void highlightValue(Highlight highlight)
	{
		highlightValue(highlight, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #516 <Method void highlightValue(Highlight, boolean)>
	//    4    6:return          
	}

	public void highlightValue(Highlight highlight, boolean flag)
	{
		Entry entry = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(highlight == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       43
		{
			mIndicesToHighlight = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #259 <Field Highlight[] mIndicesToHighlight>
		} else
	//*   7   11:iload_2         
	//*   8   12:ifeq            38
	//*   9   15:aload_0         
	//*  10   16:getfield        #525 <Field OnChartValueSelectedListener mSelectionListener>
	//*  11   19:ifnull          38
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #326 <Method boolean valuesToHighlight()>
	//*  14   26:ifne            128
	//*  15   29:aload_0         
	//*  16   30:getfield        #525 <Field OnChartValueSelectedListener mSelectionListener>
	//*  17   33:invokeinterface #530 <Method void OnChartValueSelectedListener.onNothingSelected()>
	//*  18   38:aload_0         
	//*  19   39:invokevirtual   #262 <Method void invalidate()>
	//*  20   42:return          
		{
			if(mLogEnabled)
	//*  21   43:aload_0         
	//*  22   44:getfield        #93  <Field boolean mLogEnabled>
	//*  23   47:ifeq            79
				Log.i("MPAndroidChart", (new StringBuilder()).append("Highlighted: ").append(highlight.toString()).toString());
	//   24   50:ldc1            #18  <String "MPAndroidChart">
	//   25   52:new             #532 <Class StringBuilder>
	//   26   55:dup             
	//   27   56:invokespecial   #533 <Method void StringBuilder()>
	//   28   59:ldc2            #535 <String "Highlighted: ">
	//   29   62:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   30   65:aload_1         
	//   31   66:invokevirtual   #543 <Method String Highlight.toString()>
	//   32   69:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   33   72:invokevirtual   #544 <Method String StringBuilder.toString()>
	//   34   75:invokestatic    #550 <Method int Log.i(String, String)>
	//   35   78:pop             
			entry = mData.getEntryForHighlight(highlight);
	//   36   79:aload_0         
	//   37   80:getfield        #95  <Field ChartData mData>
	//   38   83:aload_1         
	//   39   84:invokevirtual   #341 <Method Entry ChartData.getEntryForHighlight(Highlight)>
	//   40   87:astore_3        
			if(entry == null || entry.getXIndex() != highlight.getXIndex())
	//*  41   88:aload_3         
	//*  42   89:ifnull          103
	//*  43   92:aload_3         
	//*  44   93:invokevirtual   #344 <Method int Entry.getXIndex()>
	//*  45   96:aload_1         
	//*  46   97:invokevirtual   #331 <Method int Highlight.getXIndex()>
	//*  47  100:icmpeq          113
			{
				mIndicesToHighlight = null;
	//   48  103:aload_0         
	//   49  104:aconst_null     
	//   50  105:putfield        #259 <Field Highlight[] mIndicesToHighlight>
				highlight = null;
	//   51  108:aconst_null     
	//   52  109:astore_1        
			} else
	//*  53  110:goto            11
			{
				mIndicesToHighlight = (new Highlight[] {
					highlight
				});
	//   54  113:aload_0         
	//   55  114:iconst_1        
	//   56  115:anewarray       Highlight[]
	//   57  118:dup             
	//   58  119:iconst_0        
	//   59  120:aload_1         
	//   60  121:aastore         
	//   61  122:putfield        #259 <Field Highlight[] mIndicesToHighlight>
			}
		}
		if(flag && mSelectionListener != null)
			if(!valuesToHighlight())
				mSelectionListener.onNothingSelected();
			else
	//*  62  125:goto            11
				mSelectionListener.onValueSelected(entry, highlight.getDataSetIndex(), highlight);
	//   63  128:aload_0         
	//   64  129:getfield        #525 <Field OnChartValueSelectedListener mSelectionListener>
	//   65  132:aload_3         
	//   66  133:aload_1         
	//   67  134:invokevirtual   #334 <Method int Highlight.getDataSetIndex()>
	//   68  137:aload_1         
	//   69  138:invokeinterface #554 <Method void OnChartValueSelectedListener.onValueSelected(Entry, int, Highlight)>
		invalidate();
	//*  70  143:goto            38
	}

	public void highlightValues(Highlight ahighlight[])
	{
		mIndicesToHighlight = ahighlight;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #259 <Field Highlight[] mIndicesToHighlight>
		if(ahighlight == null || ahighlight.length <= 0 || ahighlight[0] == null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:ifle            20
	//*   8   14:aload_1         
	//*   9   15:iconst_0        
	//*  10   16:aaload          
	//*  11   17:ifnonnull       33
			mChartTouchListener.setLastHighlighted(((Highlight) (null)));
	//   12   20:aload_0         
	//   13   21:getfield        #556 <Field ChartTouchListener mChartTouchListener>
	//   14   24:aconst_null     
	//   15   25:invokevirtual   #561 <Method void ChartTouchListener.setLastHighlighted(Highlight)>
		else
	//*  16   28:aload_0         
	//*  17   29:invokevirtual   #262 <Method void invalidate()>
	//*  18   32:return          
			mChartTouchListener.setLastHighlighted(ahighlight[0]);
	//   19   33:aload_0         
	//   20   34:getfield        #556 <Field ChartTouchListener mChartTouchListener>
	//   21   37:aload_1         
	//   22   38:iconst_0        
	//   23   39:aaload          
	//   24   40:invokevirtual   #561 <Method void ChartTouchListener.setLastHighlighted(Highlight)>
		invalidate();
	//*  25   43:goto            28
	}

	protected void init()
	{
		setWillNotDraw(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #564 <Method void setWillNotDraw(boolean)>
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   3    5:getstatic       #569 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          11
	//*   5   10:icmpge          212
			mAnimator = new ChartAnimator();
	//    6   13:aload_0         
	//    7   14:new             #200 <Class ChartAnimator>
	//    8   17:dup             
	//    9   18:invokespecial   #570 <Method void ChartAnimator()>
	//   10   21:putfield        #198 <Field ChartAnimator mAnimator>
		else
	//*  11   24:aload_0         
	//*  12   25:invokevirtual   #574 <Method Context getContext()>
	//*  13   28:invokestatic    #576 <Method void Utils.init(Context)>
	//*  14   31:aload_0         
	//*  15   32:new             #245 <Class DefaultValueFormatter>
	//*  16   35:dup             
	//*  17   36:iconst_1        
	//*  18   37:invokespecial   #253 <Method void DefaultValueFormatter(int)>
	//*  19   40:putfield        #255 <Field ValueFormatter mDefaultFormatter>
	//*  20   43:aload_0         
	//*  21   44:new             #182 <Class ViewPortHandler>
	//*  22   47:dup             
	//*  23   48:invokespecial   #577 <Method void ViewPortHandler()>
	//*  24   51:putfield        #180 <Field ViewPortHandler mViewPortHandler>
	//*  25   54:aload_0         
	//*  26   55:new             #579 <Class Legend>
	//*  27   58:dup             
	//*  28   59:invokespecial   #580 <Method void Legend()>
	//*  29   62:putfield        #467 <Field Legend mLegend>
	//*  30   65:aload_0         
	//*  31   66:new             #582 <Class LegendRenderer>
	//*  32   69:dup             
	//*  33   70:aload_0         
	//*  34   71:getfield        #180 <Field ViewPortHandler mViewPortHandler>
	//*  35   74:aload_0         
	//*  36   75:getfield        #467 <Field Legend mLegend>
	//*  37   78:invokespecial   #585 <Method void LegendRenderer(ViewPortHandler, Legend)>
	//*  38   81:putfield        #471 <Field LegendRenderer mLegendRenderer>
	//*  39   84:aload_0         
	//*  40   85:new             #587 <Class Paint>
	//*  41   88:dup             
	//*  42   89:iconst_1        
	//*  43   90:invokespecial   #588 <Method void Paint(int)>
	//*  44   93:putfield        #306 <Field Paint mDescPaint>
	//*  45   96:aload_0         
	//*  46   97:getfield        #306 <Field Paint mDescPaint>
	//*  47  100:ldc2            #589 <Int 0xff000000>
	//*  48  103:invokevirtual   #592 <Method void Paint.setColor(int)>
	//*  49  106:aload_0         
	//*  50  107:getfield        #306 <Field Paint mDescPaint>
	//*  51  110:getstatic       #598 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//*  52  113:invokevirtual   #602 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
	//*  53  116:aload_0         
	//*  54  117:getfield        #306 <Field Paint mDescPaint>
	//*  55  120:ldc2            #603 <Float 9F>
	//*  56  123:invokestatic    #606 <Method float Utils.convertDpToPixel(float)>
	//*  57  126:invokevirtual   #610 <Method void Paint.setTextSize(float)>
	//*  58  129:aload_0         
	//*  59  130:new             #587 <Class Paint>
	//*  60  133:dup             
	//*  61  134:iconst_1        
	//*  62  135:invokespecial   #588 <Method void Paint(int)>
	//*  63  138:putfield        #481 <Field Paint mInfoPaint>
	//*  64  141:aload_0         
	//*  65  142:getfield        #481 <Field Paint mInfoPaint>
	//*  66  145:sipush          247
	//*  67  148:sipush          189
	//*  68  151:bipush          51
	//*  69  153:invokestatic    #616 <Method int Color.rgb(int, int, int)>
	//*  70  156:invokevirtual   #592 <Method void Paint.setColor(int)>
	//*  71  159:aload_0         
	//*  72  160:getfield        #481 <Field Paint mInfoPaint>
	//*  73  163:getstatic       #619 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//*  74  166:invokevirtual   #602 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
	//*  75  169:aload_0         
	//*  76  170:getfield        #481 <Field Paint mInfoPaint>
	//*  77  173:ldc2            #620 <Float 12F>
	//*  78  176:invokestatic    #606 <Method float Utils.convertDpToPixel(float)>
	//*  79  179:invokevirtual   #610 <Method void Paint.setTextSize(float)>
	//*  80  182:aload_0         
	//*  81  183:new             #587 <Class Paint>
	//*  82  186:dup             
	//*  83  187:iconst_4        
	//*  84  188:invokespecial   #588 <Method void Paint(int)>
	//*  85  191:putfield        #622 <Field Paint mDrawPaint>
	//*  86  194:aload_0         
	//*  87  195:getfield        #93  <Field boolean mLogEnabled>
	//*  88  198:ifeq            211
	//*  89  201:ldc2            #283 <String "">
	//*  90  204:ldc2            #624 <String "Chart.init()">
	//*  91  207:invokestatic    #550 <Method int Log.i(String, String)>
	//*  92  210:pop             
	//*  93  211:return          
			mAnimator = new ChartAnimator(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					postInvalidate();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Chart this$0>
				//    2    4:invokevirtual   #25  <Method void Chart.postInvalidate()>
				//    3    7:return          
				}

				final Chart this$0;

			
			{
				this$0 = Chart.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Chart this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   94  212:aload_0         
	//   95  213:new             #200 <Class ChartAnimator>
	//   96  216:dup             
	//   97  217:new             #9   <Class Chart$1>
	//   98  220:dup             
	//   99  221:aload_0         
	//  100  222:invokespecial   #627 <Method void Chart$1(Chart)>
	//  101  225:invokespecial   #630 <Method void ChartAnimator(android.animation.ValueAnimator$AnimatorUpdateListener)>
	//  102  228:putfield        #198 <Field ChartAnimator mAnimator>
		Utils.init(getContext());
		mDefaultFormatter = ((ValueFormatter) (new DefaultValueFormatter(1)));
		mViewPortHandler = new ViewPortHandler();
		mLegend = new Legend();
		mLegendRenderer = new LegendRenderer(mViewPortHandler, mLegend);
		mDescPaint = new Paint(1);
		mDescPaint.setColor(0xff000000);
		mDescPaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
		mDescPaint.setTextSize(Utils.convertDpToPixel(9F));
		mInfoPaint = new Paint(1);
		mInfoPaint.setColor(Color.rgb(247, 189, 51));
		mInfoPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
		mInfoPaint.setTextSize(Utils.convertDpToPixel(12F));
		mDrawPaint = new Paint(4);
		if(mLogEnabled)
			Log.i("", "Chart.init()");
	//* 103  231:goto            24
	}

	public boolean isDragDecelerationEnabled()
	{
		return mDragDecelerationEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean mDragDecelerationEnabled>
	//    2    4:ireturn         
	}

	public boolean isDrawMarkerViewEnabled()
	{
		return mDrawMarkerViews;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field boolean mDrawMarkerViews>
	//    2    4:ireturn         
	}

	public boolean isEmpty()
	{
		while(mData == null || mData.getYValCount() <= 0) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field ChartData mData>
	//*   2    4:ifnonnull       9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:aload_0         
	//    6   10:getfield        #95  <Field ChartData mData>
	//    7   13:invokevirtual   #489 <Method int ChartData.getYValCount()>
	//    8   16:ifle            7
		return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean isHighlightPerTapEnabled()
	{
		return mHighLightPerTapEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean mHighLightPerTapEnabled>
	//    2    4:ireturn         
	}

	public boolean isLogEnabled()
	{
		return mLogEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field boolean mLogEnabled>
	//    2    4:ireturn         
	}

	public abstract void notifyDataSetChanged();

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #639 <Method void ViewGroup.onDetachedFromWindow()>
		if(mUnbind)
	//*   2    4:aload_0         
	//*   3    5:getfield        #139 <Field boolean mUnbind>
	//*   4    8:ifeq            16
			unbindDrawables(((View) (this)));
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokespecial   #173 <Method void unbindDrawables(View)>
	//    8   16:return          
	}

	protected void onDraw(Canvas canvas)
	{
		float f3 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          5
		if(mData == null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #95  <Field ChartData mData>
	//*   4    7:ifnonnull       214
		{
			float f;
			float f1;
			float f2;
			boolean flag;
			boolean flag1;
			if(!TextUtils.isEmpty(((CharSequence) (mNoDataText))))
	//*   5   10:aload_0         
	//*   6   11:getfield        #118 <Field String mNoDataText>
	//*   7   14:invokestatic    #645 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   17:ifne            191
				flag = true;
	//    9   20:iconst_1        
	//   10   21:istore          6
			else
	//*  11   23:aload_0         
	//*  12   24:getfield        #647 <Field String mNoDataTextDescription>
	//*  13   27:invokestatic    #645 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   30:ifne            197
	//*  15   33:iconst_1        
	//*  16   34:istore          7
	//*  17   36:iload           6
	//*  18   38:ifeq            203
	//*  19   41:aload_0         
	//*  20   42:getfield        #481 <Field Paint mInfoPaint>
	//*  21   45:aload_0         
	//*  22   46:getfield        #118 <Field String mNoDataText>
	//*  23   49:invokestatic    #651 <Method int Utils.calcTextHeight(Paint, String)>
	//*  24   52:i2f             
	//*  25   53:fstore_2        
	//*  26   54:iload           7
	//*  27   56:ifeq            208
	//*  28   59:aload_0         
	//*  29   60:getfield        #481 <Field Paint mInfoPaint>
	//*  30   63:aload_0         
	//*  31   64:getfield        #647 <Field String mNoDataTextDescription>
	//*  32   67:invokestatic    #651 <Method int Utils.calcTextHeight(Paint, String)>
	//*  33   70:i2f             
	//*  34   71:fstore          4
	//*  35   73:fload           5
	//*  36   75:fstore_3        
	//*  37   76:iload           6
	//*  38   78:ifeq            99
	//*  39   81:fload           5
	//*  40   83:fstore_3        
	//*  41   84:iload           7
	//*  42   86:ifeq            99
	//*  43   89:aload_0         
	//*  44   90:getfield        #481 <Field Paint mInfoPaint>
	//*  45   93:invokevirtual   #654 <Method float Paint.getFontSpacing()>
	//*  46   96:fload_2         
	//*  47   97:fsub            
	//*  48   98:fstore_3        
	//*  49   99:aload_0         
	//*  50  100:invokevirtual   #301 <Method int getHeight()>
	//*  51  103:i2f             
	//*  52  104:fload_2         
	//*  53  105:fload_3         
	//*  54  106:fadd            
	//*  55  107:fload           4
	//*  56  109:fadd            
	//*  57  110:fsub            
	//*  58  111:fconst_2        
	//*  59  112:fdiv            
	//*  60  113:fload_2         
	//*  61  114:fadd            
	//*  62  115:fstore          5
	//*  63  117:fload           5
	//*  64  119:fstore          4
	//*  65  121:iload           6
	//*  66  123:ifeq            164
	//*  67  126:aload_1         
	//*  68  127:aload_0         
	//*  69  128:getfield        #118 <Field String mNoDataText>
	//*  70  131:aload_0         
	//*  71  132:invokevirtual   #293 <Method int getWidth()>
	//*  72  135:iconst_2        
	//*  73  136:idiv            
	//*  74  137:i2f             
	//*  75  138:fload           5
	//*  76  140:aload_0         
	//*  77  141:getfield        #481 <Field Paint mInfoPaint>
	//*  78  144:invokevirtual   #312 <Method void Canvas.drawText(String, float, float, Paint)>
	//*  79  147:fload           5
	//*  80  149:fstore          4
	//*  81  151:iload           7
	//*  82  153:ifeq            164
	//*  83  156:fload           5
	//*  84  158:fload_2         
	//*  85  159:fadd            
	//*  86  160:fload_3         
	//*  87  161:fadd            
	//*  88  162:fstore          4
	//*  89  164:iload           7
	//*  90  166:ifeq            190
	//*  91  169:aload_1         
	//*  92  170:aload_0         
	//*  93  171:getfield        #647 <Field String mNoDataTextDescription>
	//*  94  174:aload_0         
	//*  95  175:invokevirtual   #293 <Method int getWidth()>
	//*  96  178:iconst_2        
	//*  97  179:idiv            
	//*  98  180:i2f             
	//*  99  181:fload           4
	//* 100  183:aload_0         
	//* 101  184:getfield        #481 <Field Paint mInfoPaint>
	//* 102  187:invokevirtual   #312 <Method void Canvas.drawText(String, float, float, Paint)>
	//* 103  190:return          
				flag = false;
	//  104  191:iconst_0        
	//  105  192:istore          6
			if(!TextUtils.isEmpty(((CharSequence) (mNoDataTextDescription))))
				flag1 = true;
			else
	//* 106  194:goto            23
				flag1 = false;
	//  107  197:iconst_0        
	//  108  198:istore          7
			if(flag)
				f = Utils.calcTextHeight(mInfoPaint, mNoDataText);
			else
	//* 109  200:goto            36
				f = 0.0F;
	//  110  203:fconst_0        
	//  111  204:fstore_2        
			if(flag1)
				f2 = Utils.calcTextHeight(mInfoPaint, mNoDataTextDescription);
			else
	//* 112  205:goto            54
				f2 = 0.0F;
	//  113  208:fconst_0        
	//  114  209:fstore          4
			f1 = f3;
			if(flag)
			{
				f1 = f3;
				if(flag1)
					f1 = mInfoPaint.getFontSpacing() - f;
			}
			f3 = ((float)getHeight() - (f + f1 + f2)) / 2.0F + f;
			f2 = f3;
			if(flag)
			{
				canvas.drawText(mNoDataText, getWidth() / 2, f3, mInfoPaint);
				f2 = f3;
				if(flag1)
					f2 = f3 + f + f1;
			}
			if(flag1)
				canvas.drawText(mNoDataTextDescription, getWidth() / 2, f2, mInfoPaint);
		} else
	//* 115  211:goto            73
		if(!mOffsetsCalculated)
	//* 116  214:aload_0         
	//* 117  215:getfield        #128 <Field boolean mOffsetsCalculated>
	//* 118  218:ifne            190
		{
			calculateOffsets();
	//  119  221:aload_0         
	//  120  222:invokevirtual   #656 <Method void calculateOffsets()>
			mOffsetsCalculated = true;
	//  121  225:aload_0         
	//  122  226:iconst_1        
	//  123  227:putfield        #128 <Field boolean mOffsetsCalculated>
			return;
	//  124  230:return          
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		for(int i1 = 0; i1 < getChildCount(); i1++)
	//*   0    0:iconst_0        
	//*   1    1:istore          6
	//*   2    3:iload           6
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #659 <Method int getChildCount()>
	//*   5    9:icmpge          36
			getChildAt(i1).layout(i, j, k, l);
	//    6   12:aload_0         
	//    7   13:iload           6
	//    8   15:invokevirtual   #660 <Method View getChildAt(int)>
	//    9   18:iload_2         
	//   10   19:iload_3         
	//   11   20:iload           4
	//   12   22:iload           5
	//   13   24:invokevirtual   #661 <Method void View.layout(int, int, int, int)>

	//   14   27:iload           6
	//   15   29:iconst_1        
	//   16   30:iadd            
	//   17   31:istore          6
	//*  18   33:goto            3
	//   19   36:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #664 <Method void ViewGroup.onMeasure(int, int)>
		int k = (int)Utils.convertDpToPixel(50F);
	//    4    6:ldc2            #665 <Float 50F>
	//    5    9:invokestatic    #606 <Method float Utils.convertDpToPixel(float)>
	//    6   12:f2i             
	//    7   13:istore_3        
		setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), resolveSize(k, i)), Math.max(getSuggestedMinimumHeight(), resolveSize(k, j)));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #668 <Method int getSuggestedMinimumWidth()>
	//   11   19:iload_3         
	//   12   20:iload_1         
	//   13   21:invokestatic    #671 <Method int resolveSize(int, int)>
	//   14   24:invokestatic    #673 <Method int Math.max(int, int)>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #676 <Method int getSuggestedMinimumHeight()>
	//   17   31:iload_3         
	//   18   32:iload_2         
	//   19   33:invokestatic    #671 <Method int resolveSize(int, int)>
	//   20   36:invokestatic    #673 <Method int Math.max(int, int)>
	//   21   39:invokevirtual   #679 <Method void setMeasuredDimension(int, int)>
	//   22   42:return          
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		if(mLogEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field boolean mLogEnabled>
	//*   2    4:ifeq            16
			Log.i("MPAndroidChart", "OnSizeChanged()");
	//    3    7:ldc1            #18  <String "MPAndroidChart">
	//    4    9:ldc2            #682 <String "OnSizeChanged()">
	//    5   12:invokestatic    #550 <Method int Log.i(String, String)>
	//    6   15:pop             
		if(i > 0 && j > 0 && i < 10000 && j < 10000)
	//*   7   16:iload_1         
	//*   8   17:ifle            136
	//*   9   20:iload_2         
	//*  10   21:ifle            136
	//*  11   24:iload_1         
	//*  12   25:sipush          10000
	//*  13   28:icmpge          136
	//*  14   31:iload_2         
	//*  15   32:sipush          10000
	//*  16   35:icmpge          136
		{
			mViewPortHandler.setChartDimens(i, j);
	//   17   38:aload_0         
	//   18   39:getfield        #180 <Field ViewPortHandler mViewPortHandler>
	//   19   42:iload_1         
	//   20   43:i2f             
	//   21   44:iload_2         
	//   22   45:i2f             
	//   23   46:invokevirtual   #685 <Method void ViewPortHandler.setChartDimens(float, float)>
			if(mLogEnabled)
	//*  24   49:aload_0         
	//*  25   50:getfield        #93  <Field boolean mLogEnabled>
	//*  26   53:ifeq            92
				Log.i("MPAndroidChart", (new StringBuilder()).append("Setting chart dimens, width: ").append(i).append(", height: ").append(j).toString());
	//   27   56:ldc1            #18  <String "MPAndroidChart">
	//   28   58:new             #532 <Class StringBuilder>
	//   29   61:dup             
	//   30   62:invokespecial   #533 <Method void StringBuilder()>
	//   31   65:ldc2            #687 <String "Setting chart dimens, width: ">
	//   32   68:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:iload_1         
	//   34   72:invokevirtual   #690 <Method StringBuilder StringBuilder.append(int)>
	//   35   75:ldc2            #692 <String ", height: ">
	//   36   78:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   37   81:iload_2         
	//   38   82:invokevirtual   #690 <Method StringBuilder StringBuilder.append(int)>
	//   39   85:invokevirtual   #544 <Method String StringBuilder.toString()>
	//   40   88:invokestatic    #550 <Method int Log.i(String, String)>
	//   41   91:pop             
			for(Iterator iterator = mJobs.iterator(); iterator.hasNext(); post((Runnable)iterator.next()));
	//   42   92:aload_0         
	//   43   93:getfield        #137 <Field ArrayList mJobs>
	//   44   96:invokevirtual   #696 <Method Iterator ArrayList.iterator()>
	//   45   99:astore          5
	//   46  101:aload           5
	//   47  103:invokeinterface #701 <Method boolean Iterator.hasNext()>
	//   48  108:ifeq            129
	//   49  111:aload_0         
	//   50  112:aload           5
	//   51  114:invokeinterface #705 <Method Object Iterator.next()>
	//   52  119:checkcast       #707 <Class Runnable>
	//   53  122:invokevirtual   #190 <Method boolean post(Runnable)>
	//   54  125:pop             
	//*  55  126:goto            101
			mJobs.clear();
	//   56  129:aload_0         
	//   57  130:getfield        #137 <Field ArrayList mJobs>
	//   58  133:invokevirtual   #265 <Method void ArrayList.clear()>
		}
		notifyDataSetChanged();
	//   59  136:aload_0         
	//   60  137:invokevirtual   #709 <Method void notifyDataSetChanged()>
		super.onSizeChanged(i, j, k, l);
	//   61  140:aload_0         
	//   62  141:iload_1         
	//   63  142:iload_2         
	//   64  143:iload_3         
	//   65  144:iload           4
	//   66  146:invokespecial   #711 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
	//   67  149:return          
	}

	public void removeViewportJob(Runnable runnable)
	{
		mJobs.remove(((Object) (runnable)));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field ArrayList mJobs>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #715 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public boolean saveToGallery(String s, int i)
	{
		return saveToGallery(s, "", "MPAndroidChart-Library Save", android.graphics.Bitmap.CompressFormat.JPEG, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #283 <String "">
	//    3    5:ldc2            #719 <String "MPAndroidChart-Library Save">
	//    4    8:getstatic       #725 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
	//    5   11:iload_2         
	//    6   12:invokevirtual   #728 <Method boolean saveToGallery(String, String, String, android.graphics.Bitmap$CompressFormat, int)>
	//    7   15:ireturn         
	}

	public boolean saveToGallery(String s, String s1, String s2, android.graphics.Bitmap.CompressFormat compressformat, int i)
	{
		int j;
		long l;
		File file1;
label0:
		{
			if(i >= 0)
	//*   0    0:iload           5
	//*   1    2:iflt            16
			{
				j = i;
	//    2    5:iload           5
	//    3    7:istore          6
				if(i <= 100)
					break label0;
	//    4    9:iload           5
	//    5   11:bipush          100
	//    6   13:icmple          20
			}
			j = 50;
	//    7   16:bipush          50
	//    8   18:istore          6
		}
		l = System.currentTimeMillis();
	//    9   20:invokestatic    #736 <Method long System.currentTimeMillis()>
	//   10   23:lstore          7
		File file = Environment.getExternalStorageDirectory();
	//   11   25:invokestatic    #742 <Method File Environment.getExternalStorageDirectory()>
	//   12   28:astore          11
		file1 = new File((new StringBuilder()).append(file.getAbsolutePath()).append("/DCIM/").append(s1).toString());
	//   13   30:new             #744 <Class File>
	//   14   33:dup             
	//   15   34:new             #532 <Class StringBuilder>
	//   16   37:dup             
	//   17   38:invokespecial   #533 <Method void StringBuilder()>
	//   18   41:aload           11
	//   19   43:invokevirtual   #747 <Method String File.getAbsolutePath()>
	//   20   46:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   21   49:ldc2            #749 <String "/DCIM/">
	//   22   52:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   23   55:aload_2         
	//   24   56:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   25   59:invokevirtual   #544 <Method String StringBuilder.toString()>
	//   26   62:invokespecial   #752 <Method void File(String)>
	//   27   65:astore          13
		if(!file1.exists() && !file1.mkdirs())
	//*  28   67:aload           13
	//*  29   69:invokevirtual   #755 <Method boolean File.exists()>
	//*  30   72:ifne            85
	//*  31   75:aload           13
	//*  32   77:invokevirtual   #758 <Method boolean File.mkdirs()>
	//*  33   80:ifne            85
			return false;
	//   34   83:iconst_0        
	//   35   84:ireturn         
		static class _cls2
		{

			static final int $SwitchMap$android$graphics$Bitmap$CompressFormat[];

			static 
			{
				$SwitchMap$android$graphics$Bitmap$CompressFormat = new int[android.graphics.Bitmap.CompressFormat.values().length];
			//    0    0:invokestatic    #18  <Method android.graphics.Bitmap$CompressFormat[] android.graphics.Bitmap$CompressFormat.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$CompressFormat>
				try
				{
					$SwitchMap$android$graphics$Bitmap$CompressFormat[android.graphics.Bitmap.CompressFormat.PNG.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$CompressFormat>
			//    5   12:getstatic       #24  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
			//    6   15:invokevirtual   #28  <Method int android.graphics.Bitmap$CompressFormat.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$CompressFormat>
			//*  10   23:getstatic       #31  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.WEBP>
			//*  11   26:invokevirtual   #28  <Method int android.graphics.Bitmap$CompressFormat.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$CompressFormat>
			//*  15   34:getstatic       #34  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
			//*  16   37:invokevirtual   #28  <Method int android.graphics.Bitmap$CompressFormat.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
			//*  20   43:astore_0        
			//*  21   44:return          
			//*  22   45:astore_0        
			//*  23   46:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   49:astore_0        
				try
				{
					$SwitchMap$android$graphics$Bitmap$CompressFormat[android.graphics.Bitmap.CompressFormat.WEBP.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$android$graphics$Bitmap$CompressFormat[android.graphics.Bitmap.CompressFormat.JPEG.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  25   50:goto            20
			}
		}

		_cls2..SwitchMap.android.graphics.Bitmap.CompressFormat[compressformat.ordinal()];
	//   36   85:getstatic       #762 <Field int[] Chart$2.$SwitchMap$android$graphics$Bitmap$CompressFormat>
	//   37   88:aload           4
	//   38   90:invokevirtual   #765 <Method int android.graphics.Bitmap$CompressFormat.ordinal()>
	//   39   93:iaload          
		JVM INSTR tableswitch 1 2: default 116
	//	               1 369
	//	               2 418;
	//   40   94:tableswitch     1 2: default 116
	//	               1 369
	//	               2 418
		   goto _L1 _L2 _L3
_L1:
		String s3;
		String s4 = "image/jpeg";
	//   41  116:ldc2            #767 <String "image/jpeg">
	//   42  119:astore          12
		s3 = s4;
	//   43  121:aload           12
	//   44  123:astore          11
		s1 = s;
	//   45  125:aload_1         
	//   46  126:astore_2        
		if(!s.endsWith(".jpg"))
	//*  47  127:aload_1         
	//*  48  128:ldc2            #769 <String ".jpg">
	//*  49  131:invokevirtual   #773 <Method boolean String.endsWith(String)>
	//*  50  134:ifne            178
		{
			s3 = s4;
	//   51  137:aload           12
	//   52  139:astore          11
			s1 = s;
	//   53  141:aload_1         
	//   54  142:astore_2        
			if(!s.endsWith(".jpeg"))
	//*  55  143:aload_1         
	//*  56  144:ldc2            #775 <String ".jpeg">
	//*  57  147:invokevirtual   #773 <Method boolean String.endsWith(String)>
	//*  58  150:ifne            178
			{
				s1 = (new StringBuilder()).append(s).append(".jpg").toString();
	//   59  153:new             #532 <Class StringBuilder>
	//   60  156:dup             
	//   61  157:invokespecial   #533 <Method void StringBuilder()>
	//   62  160:aload_1         
	//   63  161:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   64  164:ldc2            #769 <String ".jpg">
	//   65  167:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   66  170:invokevirtual   #544 <Method String StringBuilder.toString()>
	//   67  173:astore_2        
				s3 = s4;
	//   68  174:aload           12
	//   69  176:astore          11
			}
		}
_L5:
		s = (new StringBuilder()).append(file1.getAbsolutePath()).append("/").append(s1).toString();
	//   70  178:new             #532 <Class StringBuilder>
	//   71  181:dup             
	//   72  182:invokespecial   #533 <Method void StringBuilder()>
	//   73  185:aload           13
	//   74  187:invokevirtual   #747 <Method String File.getAbsolutePath()>
	//   75  190:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   76  193:ldc2            #777 <String "/">
	//   77  196:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   78  199:aload_2         
	//   79  200:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   80  203:invokevirtual   #544 <Method String StringBuilder.toString()>
	//   81  206:astore_1        
		FileOutputStream fileoutputstream = new FileOutputStream(s);
	//   82  207:new             #779 <Class FileOutputStream>
	//   83  210:dup             
	//   84  211:aload_1         
	//   85  212:invokespecial   #780 <Method void FileOutputStream(String)>
	//   86  215:astore          12
		getChartBitmap().compress(compressformat, j, ((OutputStream) (fileoutputstream)));
	//   87  217:aload_0         
	//   88  218:invokevirtual   #782 <Method Bitmap getChartBitmap()>
	//   89  221:aload           4
	//   90  223:iload           6
	//   91  225:aload           12
	//   92  227:invokevirtual   #786 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, OutputStream)>
	//   93  230:pop             
		fileoutputstream.flush();
	//   94  231:aload           12
	//   95  233:invokevirtual   #789 <Method void FileOutputStream.flush()>
		fileoutputstream.close();
	//   96  236:aload           12
	//   97  238:invokevirtual   #792 <Method void FileOutputStream.close()>
		long l1 = (new File(s)).length();
	//   98  241:new             #744 <Class File>
	//   99  244:dup             
	//  100  245:aload_1         
	//  101  246:invokespecial   #752 <Method void File(String)>
	//  102  249:invokevirtual   #795 <Method long File.length()>
	//  103  252:lstore          9
		compressformat = ((android.graphics.Bitmap.CompressFormat) (new ContentValues(8)));
	//  104  254:new             #797 <Class ContentValues>
	//  105  257:dup             
	//  106  258:bipush          8
	//  107  260:invokespecial   #798 <Method void ContentValues(int)>
	//  108  263:astore          4
		((ContentValues) (compressformat)).put("title", s1);
	//  109  265:aload           4
	//  110  267:ldc2            #800 <String "title">
	//  111  270:aload_2         
	//  112  271:invokevirtual   #804 <Method void ContentValues.put(String, String)>
		((ContentValues) (compressformat)).put("_display_name", s1);
	//  113  274:aload           4
	//  114  276:ldc2            #806 <String "_display_name">
	//  115  279:aload_2         
	//  116  280:invokevirtual   #804 <Method void ContentValues.put(String, String)>
		((ContentValues) (compressformat)).put("date_added", Long.valueOf(l));
	//  117  283:aload           4
	//  118  285:ldc2            #808 <String "date_added">
	//  119  288:lload           7
	//  120  290:invokestatic    #814 <Method Long Long.valueOf(long)>
	//  121  293:invokevirtual   #817 <Method void ContentValues.put(String, Long)>
		((ContentValues) (compressformat)).put("mime_type", s3);
	//  122  296:aload           4
	//  123  298:ldc2            #819 <String "mime_type">
	//  124  301:aload           11
	//  125  303:invokevirtual   #804 <Method void ContentValues.put(String, String)>
		((ContentValues) (compressformat)).put("description", s2);
	//  126  306:aload           4
	//  127  308:ldc2            #821 <String "description">
	//  128  311:aload_3         
	//  129  312:invokevirtual   #804 <Method void ContentValues.put(String, String)>
		((ContentValues) (compressformat)).put("orientation", Integer.valueOf(0));
	//  130  315:aload           4
	//  131  317:ldc2            #823 <String "orientation">
	//  132  320:iconst_0        
	//  133  321:invokestatic    #828 <Method Integer Integer.valueOf(int)>
	//  134  324:invokevirtual   #831 <Method void ContentValues.put(String, Integer)>
		((ContentValues) (compressformat)).put("_data", s);
	//  135  327:aload           4
	//  136  329:ldc2            #833 <String "_data">
	//  137  332:aload_1         
	//  138  333:invokevirtual   #804 <Method void ContentValues.put(String, String)>
		((ContentValues) (compressformat)).put("_size", Long.valueOf(l1));
	//  139  336:aload           4
	//  140  338:ldc2            #835 <String "_size">
	//  141  341:lload           9
	//  142  343:invokestatic    #814 <Method Long Long.valueOf(long)>
	//  143  346:invokevirtual   #817 <Method void ContentValues.put(String, Long)>
		String s5;
		return getContext().getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, ((ContentValues) (compressformat))) != null;
	//  144  349:aload_0         
	//  145  350:invokevirtual   #574 <Method Context getContext()>
	//  146  353:invokevirtual   #841 <Method ContentResolver Context.getContentResolver()>
	//  147  356:getstatic       #847 <Field android.net.Uri android.provider.MediaStore$Images$Media.EXTERNAL_CONTENT_URI>
	//  148  359:aload           4
	//  149  361:invokevirtual   #853 <Method android.net.Uri ContentResolver.insert(android.net.Uri, ContentValues)>
	//  150  364:ifnull          474
	//  151  367:iconst_1        
	//  152  368:ireturn         
	//  153  369:ldc2            #855 <String "image/png">
	//  154  372:astore          12
	//  155  374:aload           12
	//  156  376:astore          11
	//  157  378:aload_1         
	//  158  379:astore_2        
	//  159  380:aload_1         
	//  160  381:ldc2            #857 <String ".png">
	//  161  384:invokevirtual   #773 <Method boolean String.endsWith(String)>
	//  162  387:ifne            178
	//  163  390:new             #532 <Class StringBuilder>
	//  164  393:dup             
	//  165  394:invokespecial   #533 <Method void StringBuilder()>
	//  166  397:aload_1         
	//  167  398:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//  168  401:ldc2            #857 <String ".png">
	//  169  404:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//  170  407:invokevirtual   #544 <Method String StringBuilder.toString()>
	//  171  410:astore_2        
	//  172  411:aload           12
	//  173  413:astore          11
	//  174  415:goto            178
	//  175  418:ldc2            #859 <String "image/webp">
	//  176  421:astore          12
	//  177  423:aload           12
	//  178  425:astore          11
	//  179  427:aload_1         
	//  180  428:astore_2        
	//  181  429:aload_1         
	//  182  430:ldc2            #861 <String ".webp">
	//  183  433:invokevirtual   #773 <Method boolean String.endsWith(String)>
	//  184  436:ifne            178
	//  185  439:new             #532 <Class StringBuilder>
	//  186  442:dup             
	//  187  443:invokespecial   #533 <Method void StringBuilder()>
	//  188  446:aload_1         
	//  189  447:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//  190  450:ldc2            #861 <String ".webp">
	//  191  453:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//  192  456:invokevirtual   #544 <Method String StringBuilder.toString()>
	//  193  459:astore_2        
	//  194  460:aload           12
	//  195  462:astore          11
	//  196  464:goto            178
	//  197  467:astore_1        
	//  198  468:aload_1         
	//  199  469:invokevirtual   #864 <Method void IOException.printStackTrace()>
	//  200  472:iconst_0        
	//  201  473:ireturn         
	//  202  474:iconst_0        
	//  203  475:ireturn         
_L2:
		s5 = "image/png";
		s3 = s5;
		s1 = s;
		if(!s.endsWith(".png"))
		{
			s1 = (new StringBuilder()).append(s).append(".png").toString();
			s3 = s5;
		}
		continue; /* Loop/switch isn't completed */
_L3:
		s5 = "image/webp";
		s3 = s5;
		s1 = s;
		if(!s.endsWith(".webp"))
		{
			s1 = (new StringBuilder()).append(s).append(".webp").toString();
			s3 = s5;
		}
		if(true) goto _L5; else goto _L4
_L4:
		s;
_L7:
		((IOException) (s)).printStackTrace();
		return false;
		s;
	//  204  476:astore_1        
		if(true) goto _L7; else goto _L6
_L6:
	//* 205  477:goto            468
	}

	public boolean saveToPath(String s, String s1)
	{
		Bitmap bitmap = getChartBitmap();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #782 <Method Bitmap getChartBitmap()>
	//    2    4:astore_3        
		s = ((String) (new FileOutputStream((new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append(s1).append("/").append(s).append(".png").toString())));
	//    3    5:new             #779 <Class FileOutputStream>
	//    4    8:dup             
	//    5    9:new             #532 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #533 <Method void StringBuilder()>
	//    8   16:invokestatic    #742 <Method File Environment.getExternalStorageDirectory()>
	//    9   19:invokevirtual   #871 <Method String File.getPath()>
	//   10   22:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:ldc2            #777 <String "/">
	//   14   32:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:ldc2            #857 <String ".png">
	//   18   42:invokevirtual   #539 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:invokevirtual   #544 <Method String StringBuilder.toString()>
	//   20   48:invokespecial   #780 <Method void FileOutputStream(String)>
	//   21   51:astore_1        
		bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 40, ((OutputStream) (s)));
	//   22   52:aload_3         
	//   23   53:getstatic       #874 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   24   56:bipush          40
	//   25   58:aload_1         
	//   26   59:invokevirtual   #786 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, OutputStream)>
	//   27   62:pop             
		((OutputStream) (s)).close();
	//   28   63:aload_1         
	//   29   64:invokevirtual   #877 <Method void OutputStream.close()>
		return true;
	//   30   67:iconst_1        
	//   31   68:ireturn         
		s;
	//   32   69:astore_1        
_L2:
		((Exception) (s)).printStackTrace();
	//   33   70:aload_1         
	//   34   71:invokevirtual   #878 <Method void Exception.printStackTrace()>
		return false;
	//   35   74:iconst_0        
	//   36   75:ireturn         
		s;
	//   37   76:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  38   77:goto            70
	}

	public void setData(ChartData chartdata)
	{
		if(chartdata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			Log.e("MPAndroidChart", "Cannot set data for chart. Provided data object is null.");
	//    2    4:ldc1            #18  <String "MPAndroidChart">
	//    3    6:ldc2            #882 <String "Cannot set data for chart. Provided data object is null.">
	//    4    9:invokestatic    #885 <Method int Log.e(String, String)>
	//    5   12:pop             
		} else
	//*   6   13:return          
		{
			mOffsetsCalculated = false;
	//    7   14:aload_0         
	//    8   15:iconst_0        
	//    9   16:putfield        #128 <Field boolean mOffsetsCalculated>
			mData = chartdata;
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:putfield        #95  <Field ChartData mData>
			calculateFormatter(chartdata.getYMin(), chartdata.getYMax());
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #509 <Method float ChartData.getYMin()>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #506 <Method float ChartData.getYMax()>
	//   18   33:invokevirtual   #887 <Method void calculateFormatter(float, float)>
			chartdata = ((ChartData) (mData.getDataSets().iterator()));
	//   19   36:aload_0         
	//   20   37:getfield        #95  <Field ChartData mData>
	//   21   40:invokevirtual   #890 <Method List ChartData.getDataSets()>
	//   22   43:invokeinterface #891 <Method Iterator List.iterator()>
	//   23   48:astore_1        
			do
			{
				if(!((Iterator) (chartdata)).hasNext())
					break;
	//   24   49:aload_1         
	//   25   50:invokeinterface #701 <Method boolean Iterator.hasNext()>
	//   26   55:ifeq            93
				IDataSet idataset = (IDataSet)((Iterator) (chartdata)).next();
	//   27   58:aload_1         
	//   28   59:invokeinterface #705 <Method Object Iterator.next()>
	//   29   64:checkcast       #442 <Class IDataSet>
	//   30   67:astore_2        
				if(Utils.needsDefaultFormatter(idataset.getValueFormatter()))
	//*  31   68:aload_2         
	//*  32   69:invokeinterface #894 <Method ValueFormatter IDataSet.getValueFormatter()>
	//*  33   74:invokestatic    #898 <Method boolean Utils.needsDefaultFormatter(ValueFormatter)>
	//*  34   77:ifeq            49
					idataset.setValueFormatter(mDefaultFormatter);
	//   35   80:aload_2         
	//   36   81:aload_0         
	//   37   82:getfield        #255 <Field ValueFormatter mDefaultFormatter>
	//   38   85:invokeinterface #902 <Method void IDataSet.setValueFormatter(ValueFormatter)>
			} while(true);
	//   39   90:goto            49
			notifyDataSetChanged();
	//   40   93:aload_0         
	//   41   94:invokevirtual   #709 <Method void notifyDataSetChanged()>
			if(mLogEnabled)
	//*  42   97:aload_0         
	//*  43   98:getfield        #93  <Field boolean mLogEnabled>
	//*  44  101:ifeq            13
			{
				Log.i("MPAndroidChart", "Data is set.");
	//   45  104:ldc1            #18  <String "MPAndroidChart">
	//   46  106:ldc2            #904 <String "Data is set.">
	//   47  109:invokestatic    #550 <Method int Log.i(String, String)>
	//   48  112:pop             
				return;
	//   49  113:return          
			}
		}
	}

	public void setDescription(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			s1 = "";
	//    4    6:ldc2            #283 <String "">
	//    5    9:astore_2        
		mDescription = s1;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #106 <Field String mDescription>
	//    9   15:return          
	}

	public void setDescriptionColor(int i)
	{
		mDescPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #306 <Field Paint mDescPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #592 <Method void Paint.setColor(int)>
	//    4    8:return          
	}

	public void setDescriptionPosition(float f, float f1)
	{
		mDescriptionPosition = new PointF(f, f1);
	//    0    0:aload_0         
	//    1    1:new             #314 <Class PointF>
	//    2    4:dup             
	//    3    5:fload_1         
	//    4    6:fload_2         
	//    5    7:invokespecial   #389 <Method void PointF(float, float)>
	//    6   10:putfield        #290 <Field PointF mDescriptionPosition>
	//    7   13:return          
	}

	public void setDescriptionTextSize(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f > 16F)
	//*   2    2:fload_1         
	//*   3    3:ldc2            #910 <Float 16F>
	//*   4    6:fcmpl           
	//*   5    7:ifle            14
			f1 = 16F;
	//    6   10:ldc2            #910 <Float 16F>
	//    7   13:fstore_2        
		f = f1;
	//    8   14:fload_2         
	//    9   15:fstore_1        
		if(f1 < 6F)
	//*  10   16:fload_2         
	//*  11   17:ldc2            #911 <Float 6F>
	//*  12   20:fcmpg           
	//*  13   21:ifge            28
			f = 6F;
	//   14   24:ldc2            #911 <Float 6F>
	//   15   27:fstore_1        
		mDescPaint.setTextSize(Utils.convertDpToPixel(f));
	//   16   28:aload_0         
	//   17   29:getfield        #306 <Field Paint mDescPaint>
	//   18   32:fload_1         
	//   19   33:invokestatic    #606 <Method float Utils.convertDpToPixel(float)>
	//   20   36:invokevirtual   #610 <Method void Paint.setTextSize(float)>
	//   21   39:return          
	}

	public void setDescriptionTypeface(Typeface typeface)
	{
		mDescPaint.setTypeface(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #306 <Field Paint mDescPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #917 <Method Typeface Paint.setTypeface(Typeface)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setDragDecelerationEnabled(boolean flag)
	{
		mDragDecelerationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #99  <Field boolean mDragDecelerationEnabled>
	//    3    5:return          
	}

	public void setDragDecelerationFrictionCoef(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f < 0.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_0        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f1 = 0.0F;
	//    6    8:fconst_0        
	//    7    9:fstore_2        
		f = f1;
	//    8   10:fload_2         
	//    9   11:fstore_1        
		if(f1 >= 1.0F)
	//*  10   12:fload_2         
	//*  11   13:fconst_1        
	//*  12   14:fcmpl           
	//*  13   15:iflt            22
			f = 0.999F;
	//   14   18:ldc2            #920 <Float 0.999F>
	//   15   21:fstore_1        
		mDragDecelerationFrictionCoef = f;
	//   16   22:aload_0         
	//   17   23:fload_1         
	//   18   24:putfield        #102 <Field float mDragDecelerationFrictionCoef>
	//   19   27:return          
	}

	public void setDrawMarkerViews(boolean flag)
	{
		mDrawMarkerViews = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field boolean mDrawMarkerViews>
	//    3    5:return          
	}

	public void setExtraBottomOffset(float f)
	{
		mExtraBottomOffset = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #606 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #124 <Field float mExtraBottomOffset>
	//    4    8:return          
	}

	public void setExtraLeftOffset(float f)
	{
		mExtraLeftOffset = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #606 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #126 <Field float mExtraLeftOffset>
	//    4    8:return          
	}

	public void setExtraOffsets(float f, float f1, float f2, float f3)
	{
		setExtraLeftOffset(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #927 <Method void setExtraLeftOffset(float)>
		setExtraTopOffset(f1);
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:invokevirtual   #930 <Method void setExtraTopOffset(float)>
		setExtraRightOffset(f2);
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:invokevirtual   #933 <Method void setExtraRightOffset(float)>
		setExtraBottomOffset(f3);
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:invokevirtual   #935 <Method void setExtraBottomOffset(float)>
	//   12   21:return          
	}

	public void setExtraRightOffset(float f)
	{
		mExtraRightOffset = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #606 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #122 <Field float mExtraRightOffset>
	//    4    8:return          
	}

	public void setExtraTopOffset(float f)
	{
		mExtraTopOffset = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #606 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #120 <Field float mExtraTopOffset>
	//    4    8:return          
	}

	public void setHardwareAccelerationEnabled(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #569 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          26
		{
			if(flag)
	//*   3    8:iload_1         
	//*   4    9:ifeq            19
			{
				setLayerType(2, ((Paint) (null)));
	//    5   12:aload_0         
	//    6   13:iconst_2        
	//    7   14:aconst_null     
	//    8   15:invokevirtual   #940 <Method void setLayerType(int, Paint)>
				return;
	//    9   18:return          
			} else
			{
				setLayerType(1, ((Paint) (null)));
	//   10   19:aload_0         
	//   11   20:iconst_1        
	//   12   21:aconst_null     
	//   13   22:invokevirtual   #940 <Method void setLayerType(int, Paint)>
				return;
	//   14   25:return          
			}
		} else
		{
			Log.e("MPAndroidChart", "Cannot enable/disable hardware acceleration for devices below API level 11.");
	//   15   26:ldc1            #18  <String "MPAndroidChart">
	//   16   28:ldc2            #942 <String "Cannot enable/disable hardware acceleration for devices below API level 11.">
	//   17   31:invokestatic    #885 <Method int Log.e(String, String)>
	//   18   34:pop             
			return;
	//   19   35:return          
		}
	}

	public void setHighlightPerTapEnabled(boolean flag)
	{
		mHighLightPerTapEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #97  <Field boolean mHighLightPerTapEnabled>
	//    3    5:return          
	}

	public void setHighlighter(ChartHighlighter charthighlighter)
	{
		mHighlighter = charthighlighter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #460 <Field ChartHighlighter mHighlighter>
	//    3    5:return          
	}

	public void setLogEnabled(boolean flag)
	{
		mLogEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #93  <Field boolean mLogEnabled>
	//    3    5:return          
	}

	public void setMarkerView(MarkerView markerview)
	{
		mMarkerView = markerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #323 <Field MarkerView mMarkerView>
	//    3    5:return          
	}

	public void setNoDataText(String s)
	{
		mNoDataText = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field String mNoDataText>
	//    3    5:return          
	}

	public void setNoDataTextDescription(String s)
	{
		mNoDataTextDescription = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #647 <Field String mNoDataTextDescription>
	//    3    5:return          
	}

	public void setOnChartGestureListener(OnChartGestureListener onchartgesturelistener)
	{
		mGestureListener = onchartgesturelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #477 <Field OnChartGestureListener mGestureListener>
	//    3    5:return          
	}

	public void setOnChartValueSelectedListener(OnChartValueSelectedListener onchartvalueselectedlistener)
	{
		mSelectionListener = onchartvalueselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #525 <Field OnChartValueSelectedListener mSelectionListener>
	//    3    5:return          
	}

	public void setOnTouchListener(ChartTouchListener charttouchlistener)
	{
		mChartTouchListener = charttouchlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #556 <Field ChartTouchListener mChartTouchListener>
	//    3    5:return          
	}

	public void setPaint(Paint paint, int i)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               7: 29
	//	               11: 35
		default:
			return;
	//    2   28:return          

		case 7: // '\007'
			mInfoPaint = paint;
	//    3   29:aload_0         
	//    4   30:aload_1         
	//    5   31:putfield        #481 <Field Paint mInfoPaint>
			return;
	//    6   34:return          

		case 11: // '\013'
			mDescPaint = paint;
	//    7   35:aload_0         
	//    8   36:aload_1         
	//    9   37:putfield        #306 <Field Paint mDescPaint>
			break;
		}
	//   10   40:return          
	}

	public void setRenderer(DataRenderer datarenderer)
	{
		if(datarenderer != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			mRenderer = datarenderer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #485 <Field DataRenderer mRenderer>
	//    5    9:return          
	}

	public void setTouchEnabled(boolean flag)
	{
		mTouchEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #114 <Field boolean mTouchEnabled>
	//    3    5:return          
	}

	public void setUnbindEnabled(boolean flag)
	{
		mUnbind = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #139 <Field boolean mUnbind>
	//    3    5:return          
	}

	public boolean valuesToHighlight()
	{
		return mIndicesToHighlight != null && mIndicesToHighlight.length > 0 && mIndicesToHighlight[0] != null;
	//    0    0:aload_0         
	//    1    1:getfield        #259 <Field Highlight[] mIndicesToHighlight>
	//    2    4:ifnull          24
	//    3    7:aload_0         
	//    4    8:getfield        #259 <Field Highlight[] mIndicesToHighlight>
	//    5   11:arraylength     
	//    6   12:ifle            24
	//    7   15:aload_0         
	//    8   16:getfield        #259 <Field Highlight[] mIndicesToHighlight>
	//    9   19:iconst_0        
	//   10   20:aaload          
	//   11   21:ifnonnull       26
	//   12   24:iconst_0        
	//   13   25:ireturn         
	//   14   26:iconst_1        
	//   15   27:ireturn         
	}

	public static final String LOG_TAG = "MPAndroidChart";
	public static final int PAINT_CENTER_TEXT = 14;
	public static final int PAINT_DESCRIPTION = 11;
	public static final int PAINT_GRID_BACKGROUND = 4;
	public static final int PAINT_HOLE = 13;
	public static final int PAINT_INFO = 7;
	public static final int PAINT_LEGEND_LABEL = 18;
	protected ChartAnimator mAnimator;
	protected ChartTouchListener mChartTouchListener;
	protected ChartData mData;
	protected ValueFormatter mDefaultFormatter;
	protected float mDeltaX;
	protected Paint mDescPaint;
	protected String mDescription;
	private PointF mDescriptionPosition;
	private boolean mDragDecelerationEnabled;
	private float mDragDecelerationFrictionCoef;
	protected boolean mDrawMarkerViews;
	protected Paint mDrawPaint;
	private float mExtraBottomOffset;
	private float mExtraLeftOffset;
	private float mExtraRightOffset;
	private float mExtraTopOffset;
	private OnChartGestureListener mGestureListener;
	protected boolean mHighLightPerTapEnabled;
	protected ChartHighlighter mHighlighter;
	protected Highlight mIndicesToHighlight[];
	protected Paint mInfoPaint;
	protected ArrayList mJobs;
	protected Legend mLegend;
	protected LegendRenderer mLegendRenderer;
	protected boolean mLogEnabled;
	protected MarkerView mMarkerView;
	private String mNoDataText;
	private String mNoDataTextDescription;
	private boolean mOffsetsCalculated;
	protected DataRenderer mRenderer;
	protected OnChartValueSelectedListener mSelectionListener;
	protected boolean mTouchEnabled;
	private boolean mUnbind;
	protected ViewPortHandler mViewPortHandler;
	protected float mXChartMax;
	protected float mXChartMin;
}
