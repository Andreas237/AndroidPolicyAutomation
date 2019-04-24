// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			LineScatterCandleRadarDataSet

public abstract class LineRadarDataSet extends LineScatterCandleRadarDataSet
	implements ILineRadarDataSet
{

	public LineRadarDataSet(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void LineScatterCandleRadarDataSet(List, String)>
		mFillColor = Color.rgb(140, 234, 255);
	//    4    6:aload_0         
	//    5    7:sipush          140
	//    6   10:sipush          234
	//    7   13:sipush          255
	//    8   16:invokestatic    #26  <Method int Color.rgb(int, int, int)>
	//    9   19:putfield        #28  <Field int mFillColor>
		mFillAlpha = 85;
	//   10   22:aload_0         
	//   11   23:bipush          85
	//   12   25:putfield        #30  <Field int mFillAlpha>
		mLineWidth = 2.5F;
	//   13   28:aload_0         
	//   14   29:ldc1            #31  <Float 2.5F>
	//   15   31:putfield        #33  <Field float mLineWidth>
		mDrawFilled = false;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #35  <Field boolean mDrawFilled>
	//   19   39:return          
	}

	public int getFillAlpha()
	{
		return mFillAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int mFillAlpha>
	//    2    4:ireturn         
	}

	public int getFillColor()
	{
		return mFillColor;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int mFillColor>
	//    2    4:ireturn         
	}

	public Drawable getFillDrawable()
	{
		return mFillDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Drawable mFillDrawable>
	//    2    4:areturn         
	}

	public float getLineWidth()
	{
		return mLineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float mLineWidth>
	//    2    4:freturn         
	}

	public boolean isDrawFilledEnabled()
	{
		return mDrawFilled;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean mDrawFilled>
	//    2    4:ireturn         
	}

	public void setDrawFilled(boolean flag)
	{
		mDrawFilled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean mDrawFilled>
	//    3    5:return          
	}

	public void setFillAlpha(int i)
	{
		mFillAlpha = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int mFillAlpha>
	//    3    5:return          
	}

	public void setFillColor(int i)
	{
		mFillColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int mFillColor>
		mFillDrawable = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #45  <Field Drawable mFillDrawable>
	//    6   10:return          
	}

	public void setFillDrawable(Drawable drawable)
	{
		mFillDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field Drawable mFillDrawable>
	//    3    5:return          
	}

	public void setLineWidth(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f < 0.2F)
	//*   2    2:fload_1         
	//*   3    3:ldc1            #59  <Float 0.2F>
	//*   4    5:fcmpg           
	//*   5    6:ifge            12
			f1 = 0.2F;
	//    6    9:ldc1            #59  <Float 0.2F>
	//    7   11:fstore_2        
		f = f1;
	//    8   12:fload_2         
	//    9   13:fstore_1        
		if(f1 > 10F)
	//*  10   14:fload_2         
	//*  11   15:ldc1            #60  <Float 10F>
	//*  12   17:fcmpl           
	//*  13   18:ifle            24
			f = 10F;
	//   14   21:ldc1            #60  <Float 10F>
	//   15   23:fstore_1        
		mLineWidth = Utils.convertDpToPixel(f);
	//   16   24:aload_0         
	//   17   25:fload_1         
	//   18   26:invokestatic    #66  <Method float Utils.convertDpToPixel(float)>
	//   19   29:putfield        #33  <Field float mLineWidth>
	//   20   32:return          
	}

	private boolean mDrawFilled;
	private int mFillAlpha;
	private int mFillColor;
	protected Drawable mFillDrawable;
	private float mLineWidth;
}
