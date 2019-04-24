// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.base;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.Utils;
import io.realm.RealmResults;

// Referenced classes of package com.github.mikephil.charting.data.realm.base:
//			RealmBarLineScatterCandleBubbleDataSet

public abstract class RealmLineScatterCandleRadarDataSet extends RealmBarLineScatterCandleBubbleDataSet
	implements ILineScatterCandleRadarDataSet
{

	public RealmLineScatterCandleRadarDataSet(RealmResults realmresults, String s)
	{
		super(realmresults, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void RealmBarLineScatterCandleBubbleDataSet(RealmResults, String)>
		mDrawVerticalHighlightIndicator = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #20  <Field boolean mDrawVerticalHighlightIndicator>
		mDrawHorizontalHighlightIndicator = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #22  <Field boolean mDrawHorizontalHighlightIndicator>
		mHighlightLineWidth = 0.5F;
	//   10   16:aload_0         
	//   11   17:ldc1            #23  <Float 0.5F>
	//   12   19:putfield        #25  <Field float mHighlightLineWidth>
		mHighlightDashPathEffect = null;
	//   13   22:aload_0         
	//   14   23:aconst_null     
	//   15   24:putfield        #27  <Field DashPathEffect mHighlightDashPathEffect>
	//   16   27:return          
	}

	public RealmLineScatterCandleRadarDataSet(RealmResults realmresults, String s, String s1)
	{
		super(realmresults, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #33  <Method void RealmBarLineScatterCandleBubbleDataSet(RealmResults, String, String)>
		mDrawVerticalHighlightIndicator = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #20  <Field boolean mDrawVerticalHighlightIndicator>
		mDrawHorizontalHighlightIndicator = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #22  <Field boolean mDrawHorizontalHighlightIndicator>
		mHighlightLineWidth = 0.5F;
	//   11   17:aload_0         
	//   12   18:ldc1            #23  <Float 0.5F>
	//   13   20:putfield        #25  <Field float mHighlightLineWidth>
		mHighlightDashPathEffect = null;
	//   14   23:aload_0         
	//   15   24:aconst_null     
	//   16   25:putfield        #27  <Field DashPathEffect mHighlightDashPathEffect>
	//   17   28:return          
	}

	public void disableDashedHighlightLine()
	{
		mHighlightDashPathEffect = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #27  <Field DashPathEffect mHighlightDashPathEffect>
	//    3    5:return          
	}

	public void enableDashedHighlightLine(float f, float f1, float f2)
	{
		mHighlightDashPathEffect = new DashPathEffect(new float[] {
			f, f1
		}, f2);
	//    0    0:aload_0         
	//    1    1:new             #40  <Class DashPathEffect>
	//    2    4:dup             
	//    3    5:iconst_2        
	//    4    6:newarray        float[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:fload_1         
	//    8   11:fastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:fload_2         
	//   12   15:fastore         
	//   13   16:fload_3         
	//   14   17:invokespecial   #43  <Method void DashPathEffect(float[], float)>
	//   15   20:putfield        #27  <Field DashPathEffect mHighlightDashPathEffect>
	//   16   23:return          
	}

	public DashPathEffect getDashPathEffectHighlight()
	{
		return mHighlightDashPathEffect;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DashPathEffect mHighlightDashPathEffect>
	//    2    4:areturn         
	}

	public float getHighlightLineWidth()
	{
		return mHighlightLineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float mHighlightLineWidth>
	//    2    4:freturn         
	}

	public boolean isDashedHighlightLineEnabled()
	{
		return mHighlightDashPathEffect != null;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DashPathEffect mHighlightDashPathEffect>
	//    2    4:ifnonnull       9
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public boolean isHorizontalHighlightIndicatorEnabled()
	{
		return mDrawHorizontalHighlightIndicator;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean mDrawHorizontalHighlightIndicator>
	//    2    4:ireturn         
	}

	public boolean isVerticalHighlightIndicatorEnabled()
	{
		return mDrawVerticalHighlightIndicator;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean mDrawVerticalHighlightIndicator>
	//    2    4:ireturn         
	}

	public void setDrawHighlightIndicators(boolean flag)
	{
		setDrawVerticalHighlightIndicator(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #56  <Method void setDrawVerticalHighlightIndicator(boolean)>
		setDrawHorizontalHighlightIndicator(flag);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #59  <Method void setDrawHorizontalHighlightIndicator(boolean)>
	//    6   10:return          
	}

	public void setDrawHorizontalHighlightIndicator(boolean flag)
	{
		mDrawHorizontalHighlightIndicator = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field boolean mDrawHorizontalHighlightIndicator>
	//    3    5:return          
	}

	public void setDrawVerticalHighlightIndicator(boolean flag)
	{
		mDrawVerticalHighlightIndicator = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field boolean mDrawVerticalHighlightIndicator>
	//    3    5:return          
	}

	public void setHighlightLineWidth(float f)
	{
		mHighlightLineWidth = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #67  <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #25  <Field float mHighlightLineWidth>
	//    4    8:return          
	}

	protected boolean mDrawHorizontalHighlightIndicator;
	protected boolean mDrawVerticalHighlightIndicator;
	protected DashPathEffect mHighlightDashPathEffect;
	protected float mHighlightLineWidth;
}
