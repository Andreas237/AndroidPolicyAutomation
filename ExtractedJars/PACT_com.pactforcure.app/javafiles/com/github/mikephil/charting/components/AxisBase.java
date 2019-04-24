// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.components:
//			ComponentBase, LimitLine

public abstract class AxisBase extends ComponentBase
{

	public AxisBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void ComponentBase()>
		mGridColor = 0xff888888;
	//    2    4:aload_0         
	//    3    5:ldc1            #25  <Int 0xff888888>
	//    4    7:putfield        #27  <Field int mGridColor>
		mGridLineWidth = 1.0F;
	//    5   10:aload_0         
	//    6   11:fconst_1        
	//    7   12:putfield        #29  <Field float mGridLineWidth>
		mAxisLineColor = 0xff888888;
	//    8   15:aload_0         
	//    9   16:ldc1            #25  <Int 0xff888888>
	//   10   18:putfield        #31  <Field int mAxisLineColor>
		mAxisLineWidth = 1.0F;
	//   11   21:aload_0         
	//   12   22:fconst_1        
	//   13   23:putfield        #33  <Field float mAxisLineWidth>
		mDrawGridLines = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #35  <Field boolean mDrawGridLines>
		mDrawAxisLine = true;
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:putfield        #37  <Field boolean mDrawAxisLine>
		mDrawLabels = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #39  <Field boolean mDrawLabels>
		mGridDashPathEffect = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #41  <Field DashPathEffect mGridDashPathEffect>
		mDrawLimitLineBehindData = false;
	//   26   46:aload_0         
	//   27   47:iconst_0        
	//   28   48:putfield        #43  <Field boolean mDrawLimitLineBehindData>
		mTextSize = Utils.convertDpToPixel(10F);
	//   29   51:aload_0         
	//   30   52:ldc1            #44  <Float 10F>
	//   31   54:invokestatic    #50  <Method float Utils.convertDpToPixel(float)>
	//   32   57:putfield        #53  <Field float mTextSize>
		mXOffset = Utils.convertDpToPixel(5F);
	//   33   60:aload_0         
	//   34   61:ldc1            #54  <Float 5F>
	//   35   63:invokestatic    #50  <Method float Utils.convertDpToPixel(float)>
	//   36   66:putfield        #57  <Field float mXOffset>
		mYOffset = Utils.convertDpToPixel(5F);
	//   37   69:aload_0         
	//   38   70:ldc1            #54  <Float 5F>
	//   39   72:invokestatic    #50  <Method float Utils.convertDpToPixel(float)>
	//   40   75:putfield        #60  <Field float mYOffset>
		mLimitLines = ((List) (new ArrayList()));
	//   41   78:aload_0         
	//   42   79:new             #62  <Class ArrayList>
	//   43   82:dup             
	//   44   83:invokespecial   #63  <Method void ArrayList()>
	//   45   86:putfield        #65  <Field List mLimitLines>
	//   46   89:return          
	}

	public void addLimitLine(LimitLine limitline)
	{
		mLimitLines.add(((Object) (limitline)));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field List mLimitLines>
	//    2    4:aload_1         
	//    3    5:invokeinterface #74  <Method boolean List.add(Object)>
	//    4   10:pop             
		if(mLimitLines.size() > 6)
	//*   5   11:aload_0         
	//*   6   12:getfield        #65  <Field List mLimitLines>
	//*   7   15:invokeinterface #78  <Method int List.size()>
	//*   8   20:bipush          6
	//*   9   22:icmple          33
			Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
	//   10   25:ldc1            #80  <String "MPAndroiChart">
	//   11   27:ldc1            #82  <String "Warning! You have more than 6 LimitLines on your axis, do you really want that?">
	//   12   29:invokestatic    #88  <Method int Log.e(String, String)>
	//   13   32:pop             
	//   14   33:return          
	}

	public void disableGridDashedLine()
	{
		mGridDashPathEffect = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #41  <Field DashPathEffect mGridDashPathEffect>
	//    3    5:return          
	}

	public void enableGridDashedLine(float f, float f1, float f2)
	{
		mGridDashPathEffect = new DashPathEffect(new float[] {
			f, f1
		}, f2);
	//    0    0:aload_0         
	//    1    1:new             #93  <Class DashPathEffect>
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
	//   14   17:invokespecial   #96  <Method void DashPathEffect(float[], float)>
	//   15   20:putfield        #41  <Field DashPathEffect mGridDashPathEffect>
	//   16   23:return          
	}

	public int getAxisLineColor()
	{
		return mAxisLineColor;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mAxisLineColor>
	//    2    4:ireturn         
	}

	public float getAxisLineWidth()
	{
		return mAxisLineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float mAxisLineWidth>
	//    2    4:freturn         
	}

	public int getGridColor()
	{
		return mGridColor;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int mGridColor>
	//    2    4:ireturn         
	}

	public DashPathEffect getGridDashPathEffect()
	{
		return mGridDashPathEffect;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DashPathEffect mGridDashPathEffect>
	//    2    4:areturn         
	}

	public float getGridLineWidth()
	{
		return mGridLineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float mGridLineWidth>
	//    2    4:freturn         
	}

	public List getLimitLines()
	{
		return mLimitLines;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field List mLimitLines>
	//    2    4:areturn         
	}

	public abstract String getLongestLabel();

	public boolean isDrawAxisLineEnabled()
	{
		return mDrawAxisLine;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean mDrawAxisLine>
	//    2    4:ireturn         
	}

	public boolean isDrawGridLinesEnabled()
	{
		return mDrawGridLines;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean mDrawGridLines>
	//    2    4:ireturn         
	}

	public boolean isDrawLabelsEnabled()
	{
		return mDrawLabels;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean mDrawLabels>
	//    2    4:ireturn         
	}

	public boolean isDrawLimitLinesBehindDataEnabled()
	{
		return mDrawLimitLineBehindData;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean mDrawLimitLineBehindData>
	//    2    4:ireturn         
	}

	public boolean isGridDashedLineEnabled()
	{
		return mGridDashPathEffect != null;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DashPathEffect mGridDashPathEffect>
	//    2    4:ifnonnull       9
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public void removeAllLimitLines()
	{
		mLimitLines.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field List mLimitLines>
	//    2    4:invokeinterface #119 <Method void List.clear()>
	//    3    9:return          
	}

	public void removeLimitLine(LimitLine limitline)
	{
		mLimitLines.remove(((Object) (limitline)));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field List mLimitLines>
	//    2    4:aload_1         
	//    3    5:invokeinterface #123 <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void setAxisLineColor(int i)
	{
		mAxisLineColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int mAxisLineColor>
	//    3    5:return          
	}

	public void setAxisLineWidth(float f)
	{
		mAxisLineWidth = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #50  <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #33  <Field float mAxisLineWidth>
	//    4    8:return          
	}

	public void setDrawAxisLine(boolean flag)
	{
		mDrawAxisLine = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #37  <Field boolean mDrawAxisLine>
	//    3    5:return          
	}

	public void setDrawGridLines(boolean flag)
	{
		mDrawGridLines = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean mDrawGridLines>
	//    3    5:return          
	}

	public void setDrawLabels(boolean flag)
	{
		mDrawLabels = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean mDrawLabels>
	//    3    5:return          
	}

	public void setDrawLimitLinesBehindData(boolean flag)
	{
		mDrawLimitLineBehindData = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean mDrawLimitLineBehindData>
	//    3    5:return          
	}

	public void setGridColor(int i)
	{
		mGridColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int mGridColor>
	//    3    5:return          
	}

	public void setGridLineWidth(float f)
	{
		mGridLineWidth = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #50  <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #29  <Field float mGridLineWidth>
	//    4    8:return          
	}

	private int mAxisLineColor;
	private float mAxisLineWidth;
	protected boolean mDrawAxisLine;
	protected boolean mDrawGridLines;
	protected boolean mDrawLabels;
	protected boolean mDrawLimitLineBehindData;
	private int mGridColor;
	private DashPathEffect mGridDashPathEffect;
	private float mGridLineWidth;
	protected List mLimitLines;
}
