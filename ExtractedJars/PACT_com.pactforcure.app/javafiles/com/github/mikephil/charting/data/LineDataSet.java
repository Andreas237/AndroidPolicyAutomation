// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import com.github.mikephil.charting.formatter.DefaultFillFormatter;
import com.github.mikephil.charting.formatter.FillFormatter;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			LineRadarDataSet, Entry, DataSet

public class LineDataSet extends LineRadarDataSet
	implements ILineDataSet
{

	public LineDataSet(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void LineRadarDataSet(List, String)>
		mCircleColors = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #29  <Field List mCircleColors>
		mCircleColorHole = -1;
	//    7   11:aload_0         
	//    8   12:iconst_m1       
	//    9   13:putfield        #31  <Field int mCircleColorHole>
		mCircleRadius = 8F;
	//   10   16:aload_0         
	//   11   17:ldc1            #32  <Float 8F>
	//   12   19:putfield        #34  <Field float mCircleRadius>
		mCubicIntensity = 0.2F;
	//   13   22:aload_0         
	//   14   23:ldc1            #35  <Float 0.2F>
	//   15   25:putfield        #37  <Field float mCubicIntensity>
		mDashPathEffect = null;
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #39  <Field DashPathEffect mDashPathEffect>
		mFillFormatter = ((FillFormatter) (new DefaultFillFormatter()));
	//   19   33:aload_0         
	//   20   34:new             #41  <Class DefaultFillFormatter>
	//   21   37:dup             
	//   22   38:invokespecial   #44  <Method void DefaultFillFormatter()>
	//   23   41:putfield        #46  <Field FillFormatter mFillFormatter>
		mDrawCircles = true;
	//   24   44:aload_0         
	//   25   45:iconst_1        
	//   26   46:putfield        #48  <Field boolean mDrawCircles>
		mDrawCubic = false;
	//   27   49:aload_0         
	//   28   50:iconst_0        
	//   29   51:putfield        #50  <Field boolean mDrawCubic>
		mDrawCircleHole = true;
	//   30   54:aload_0         
	//   31   55:iconst_1        
	//   32   56:putfield        #52  <Field boolean mDrawCircleHole>
		mCircleColors = ((List) (new ArrayList()));
	//   33   59:aload_0         
	//   34   60:new             #54  <Class ArrayList>
	//   35   63:dup             
	//   36   64:invokespecial   #55  <Method void ArrayList()>
	//   37   67:putfield        #29  <Field List mCircleColors>
		mCircleColors.add(((Object) (Integer.valueOf(Color.rgb(140, 234, 255)))));
	//   38   70:aload_0         
	//   39   71:getfield        #29  <Field List mCircleColors>
	//   40   74:sipush          140
	//   41   77:sipush          234
	//   42   80:sipush          255
	//   43   83:invokestatic    #61  <Method int Color.rgb(int, int, int)>
	//   44   86:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   45   89:invokeinterface #73  <Method boolean List.add(Object)>
	//   46   94:pop             
	//   47   95:return          
	}

	public DataSet copy()
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #54  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < mYVals.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #81  <Field List mYVals>
	//*   9   15:invokeinterface #85  <Method int List.size()>
	//*  10   20:icmpge          53
			((List) (obj)).add(((Object) (((Entry)mYVals.get(i)).copy())));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #81  <Field List mYVals>
	//   14   28:iload_1         
	//   15   29:invokeinterface #89  <Method Object List.get(int)>
	//   16   34:checkcast       #91  <Class Entry>
	//   17   37:invokevirtual   #94  <Method Entry Entry.copy()>
	//   18   40:invokeinterface #73  <Method boolean List.add(Object)>
	//   19   45:pop             

	//   20   46:iload_1         
	//   21   47:iconst_1        
	//   22   48:iadd            
	//   23   49:istore_1        
	//*  24   50:goto            10
		obj = ((Object) (new LineDataSet(((List) (obj)), getLabel())));
	//   25   53:new             #2   <Class LineDataSet>
	//   26   56:dup             
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:invokevirtual   #98  <Method String getLabel()>
	//   30   62:invokespecial   #99  <Method void LineDataSet(List, String)>
	//   31   65:astore_2        
		obj.mColors = mColors;
	//   32   66:aload_2         
	//   33   67:aload_0         
	//   34   68:getfield        #102 <Field List mColors>
	//   35   71:putfield        #102 <Field List mColors>
		obj.mCircleRadius = mCircleRadius;
	//   36   74:aload_2         
	//   37   75:aload_0         
	//   38   76:getfield        #34  <Field float mCircleRadius>
	//   39   79:putfield        #34  <Field float mCircleRadius>
		obj.mCircleColors = mCircleColors;
	//   40   82:aload_2         
	//   41   83:aload_0         
	//   42   84:getfield        #29  <Field List mCircleColors>
	//   43   87:putfield        #29  <Field List mCircleColors>
		obj.mDashPathEffect = mDashPathEffect;
	//   44   90:aload_2         
	//   45   91:aload_0         
	//   46   92:getfield        #39  <Field DashPathEffect mDashPathEffect>
	//   47   95:putfield        #39  <Field DashPathEffect mDashPathEffect>
		obj.mDrawCircles = mDrawCircles;
	//   48   98:aload_2         
	//   49   99:aload_0         
	//   50  100:getfield        #48  <Field boolean mDrawCircles>
	//   51  103:putfield        #48  <Field boolean mDrawCircles>
		obj.mDrawCubic = mDrawCubic;
	//   52  106:aload_2         
	//   53  107:aload_0         
	//   54  108:getfield        #50  <Field boolean mDrawCubic>
	//   55  111:putfield        #50  <Field boolean mDrawCubic>
		obj.mHighLightColor = mHighLightColor;
	//   56  114:aload_2         
	//   57  115:aload_0         
	//   58  116:getfield        #105 <Field int mHighLightColor>
	//   59  119:putfield        #105 <Field int mHighLightColor>
		return ((DataSet) (obj));
	//   60  122:aload_2         
	//   61  123:areturn         
	}

	public void disableDashedLine()
	{
		mDashPathEffect = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #39  <Field DashPathEffect mDashPathEffect>
	//    3    5:return          
	}

	public void enableDashedLine(float f, float f1, float f2)
	{
		mDashPathEffect = new DashPathEffect(new float[] {
			f, f1
		}, f2);
	//    0    0:aload_0         
	//    1    1:new             #111 <Class DashPathEffect>
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
	//   14   17:invokespecial   #114 <Method void DashPathEffect(float[], float)>
	//   15   20:putfield        #39  <Field DashPathEffect mDashPathEffect>
	//   16   23:return          
	}

	public int getCircleColor(int i)
	{
		return ((Integer)mCircleColors.get(i % mCircleColors.size())).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List mCircleColors>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field List mCircleColors>
	//    5    9:invokeinterface #85  <Method int List.size()>
	//    6   14:irem            
	//    7   15:invokeinterface #89  <Method Object List.get(int)>
	//    8   20:checkcast       #63  <Class Integer>
	//    9   23:invokevirtual   #119 <Method int Integer.intValue()>
	//   10   26:ireturn         
	}

	public List getCircleColors()
	{
		return mCircleColors;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List mCircleColors>
	//    2    4:areturn         
	}

	public int getCircleHoleColor()
	{
		return mCircleColorHole;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int mCircleColorHole>
	//    2    4:ireturn         
	}

	public float getCircleRadius()
	{
		return mCircleRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field float mCircleRadius>
	//    2    4:freturn         
	}

	public float getCircleSize()
	{
		return getCircleRadius();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method float getCircleRadius()>
	//    2    4:freturn         
	}

	public float getCubicIntensity()
	{
		return mCubicIntensity;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field float mCubicIntensity>
	//    2    4:freturn         
	}

	public DashPathEffect getDashPathEffect()
	{
		return mDashPathEffect;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DashPathEffect mDashPathEffect>
	//    2    4:areturn         
	}

	public FillFormatter getFillFormatter()
	{
		return mFillFormatter;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field FillFormatter mFillFormatter>
	//    2    4:areturn         
	}

	public boolean isDashedLineEnabled()
	{
		return mDashPathEffect != null;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DashPathEffect mDashPathEffect>
	//    2    4:ifnonnull       9
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public boolean isDrawCircleHoleEnabled()
	{
		return mDrawCircleHole;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean mDrawCircleHole>
	//    2    4:ireturn         
	}

	public boolean isDrawCirclesEnabled()
	{
		return mDrawCircles;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean mDrawCircles>
	//    2    4:ireturn         
	}

	public boolean isDrawCubicEnabled()
	{
		return mDrawCubic;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean mDrawCubic>
	//    2    4:ireturn         
	}

	public void resetCircleColors()
	{
		mCircleColors = ((List) (new ArrayList()));
	//    0    0:aload_0         
	//    1    1:new             #54  <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #55  <Method void ArrayList()>
	//    4    8:putfield        #29  <Field List mCircleColors>
	//    5   11:return          
	}

	public void setCircleColor(int i)
	{
		resetCircleColors();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #145 <Method void resetCircleColors()>
		mCircleColors.add(((Object) (Integer.valueOf(i))));
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field List mCircleColors>
	//    4    8:iload_1         
	//    5    9:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//    6   12:invokeinterface #73  <Method boolean List.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void setCircleColorHole(int i)
	{
		mCircleColorHole = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int mCircleColorHole>
	//    3    5:return          
	}

	public void setCircleColors(List list)
	{
		mCircleColors = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field List mCircleColors>
	//    3    5:return          
	}

	public void setCircleColors(int ai[])
	{
		mCircleColors = ColorTemplate.createColors(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #156 <Method List ColorTemplate.createColors(int[])>
	//    3    5:putfield        #29  <Field List mCircleColors>
	//    4    8:return          
	}

	public void setCircleColors(int ai[], Context context)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #54  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void ArrayList()>
	//    3    7:astore          6
		int j = ai.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore          4
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_3        
	//*   9   15:iload_3         
	//*  10   16:iload           4
	//*  11   18:icmpge          53
		{
			int k = ai[i];
	//   12   21:aload_1         
	//   13   22:iload_3         
	//   14   23:iaload          
	//   15   24:istore          5
			((List) (arraylist)).add(((Object) (Integer.valueOf(context.getResources().getColor(k)))));
	//   16   26:aload           6
	//   17   28:aload_2         
	//   18   29:invokevirtual   #163 <Method Resources Context.getResources()>
	//   19   32:iload           5
	//   20   34:invokevirtual   #168 <Method int Resources.getColor(int)>
	//   21   37:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   22   40:invokeinterface #73  <Method boolean List.add(Object)>
	//   23   45:pop             
		}

	//   24   46:iload_3         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_3        
	//*  28   50:goto            15
		mCircleColors = ((List) (arraylist));
	//   29   53:aload_0         
	//   30   54:aload           6
	//   31   56:putfield        #29  <Field List mCircleColors>
	//   32   59:return          
	}

	public void setCircleRadius(float f)
	{
		mCircleRadius = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #176 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #34  <Field float mCircleRadius>
	//    4    8:return          
	}

	public void setCircleSize(float f)
	{
		setCircleRadius(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #179 <Method void setCircleRadius(float)>
	//    3    5:return          
	}

	public void setCubicIntensity(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f > 1.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_1        
	//*   4    4:fcmpl           
	//*   5    5:ifle            10
			f1 = 1.0F;
	//    6    8:fconst_1        
	//    7    9:fstore_2        
		f = f1;
	//    8   10:fload_2         
	//    9   11:fstore_1        
		if(f1 < 0.05F)
	//*  10   12:fload_2         
	//*  11   13:ldc1            #181 <Float 0.05F>
	//*  12   15:fcmpg           
	//*  13   16:ifge            22
			f = 0.05F;
	//   14   19:ldc1            #181 <Float 0.05F>
	//   15   21:fstore_1        
		mCubicIntensity = f;
	//   16   22:aload_0         
	//   17   23:fload_1         
	//   18   24:putfield        #37  <Field float mCubicIntensity>
	//   19   27:return          
	}

	public void setDrawCircleHole(boolean flag)
	{
		mDrawCircleHole = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean mDrawCircleHole>
	//    3    5:return          
	}

	public void setDrawCircles(boolean flag)
	{
		mDrawCircles = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field boolean mDrawCircles>
	//    3    5:return          
	}

	public void setDrawCubic(boolean flag)
	{
		mDrawCubic = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean mDrawCubic>
	//    3    5:return          
	}

	public void setFillFormatter(FillFormatter fillformatter)
	{
		if(fillformatter == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       16
		{
			mFillFormatter = ((FillFormatter) (new DefaultFillFormatter()));
	//    2    4:aload_0         
	//    3    5:new             #41  <Class DefaultFillFormatter>
	//    4    8:dup             
	//    5    9:invokespecial   #44  <Method void DefaultFillFormatter()>
	//    6   12:putfield        #46  <Field FillFormatter mFillFormatter>
			return;
	//    7   15:return          
		} else
		{
			mFillFormatter = fillformatter;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #46  <Field FillFormatter mFillFormatter>
			return;
	//   11   21:return          
		}
	}

	private int mCircleColorHole;
	private List mCircleColors;
	private float mCircleRadius;
	private float mCubicIntensity;
	private DashPathEffect mDashPathEffect;
	private boolean mDrawCircleHole;
	private boolean mDrawCircles;
	private boolean mDrawCubic;
	private FillFormatter mFillFormatter;
}
