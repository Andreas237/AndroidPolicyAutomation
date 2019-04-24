// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;

import android.graphics.Typeface;
import com.github.mikephil.charting.utils.Utils;

public abstract class ComponentBase
{

	public ComponentBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mEnabled = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #20  <Field boolean mEnabled>
		mXOffset = 5F;
	//    5    9:aload_0         
	//    6   10:ldc1            #21  <Float 5F>
	//    7   12:putfield        #23  <Field float mXOffset>
		mYOffset = 5F;
	//    8   15:aload_0         
	//    9   16:ldc1            #21  <Float 5F>
	//   10   18:putfield        #25  <Field float mYOffset>
		mTypeface = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #27  <Field Typeface mTypeface>
		mTextSize = 10F;
	//   14   26:aload_0         
	//   15   27:ldc1            #28  <Float 10F>
	//   16   29:putfield        #30  <Field float mTextSize>
		mTextColor = 0xff000000;
	//   17   32:aload_0         
	//   18   33:ldc1            #31  <Int 0xff000000>
	//   19   35:putfield        #33  <Field int mTextColor>
	//   20   38:return          
	}

	public int getTextColor()
	{
		return mTextColor;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mTextColor>
	//    2    4:ireturn         
	}

	public float getTextSize()
	{
		return mTextSize;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float mTextSize>
	//    2    4:freturn         
	}

	public Typeface getTypeface()
	{
		return mTypeface;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Typeface mTypeface>
	//    2    4:areturn         
	}

	public float getXOffset()
	{
		return mXOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field float mXOffset>
	//    2    4:freturn         
	}

	public float getYOffset()
	{
		return mYOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float mYOffset>
	//    2    4:freturn         
	}

	public boolean isEnabled()
	{
		return mEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean mEnabled>
	//    2    4:ireturn         
	}

	public void setEnabled(boolean flag)
	{
		mEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field boolean mEnabled>
	//    3    5:return          
	}

	public void setTextColor(int i)
	{
		mTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int mTextColor>
	//    3    5:return          
	}

	public void setTextSize(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f > 24F)
	//*   2    2:fload_1         
	//*   3    3:ldc1            #51  <Float 24F>
	//*   4    5:fcmpl           
	//*   5    6:ifle            12
			f1 = 24F;
	//    6    9:ldc1            #51  <Float 24F>
	//    7   11:fstore_2        
		f = f1;
	//    8   12:fload_2         
	//    9   13:fstore_1        
		if(f1 < 6F)
	//*  10   14:fload_2         
	//*  11   15:ldc1            #52  <Float 6F>
	//*  12   17:fcmpg           
	//*  13   18:ifge            24
			f = 6F;
	//   14   21:ldc1            #52  <Float 6F>
	//   15   23:fstore_1        
		mTextSize = Utils.convertDpToPixel(f);
	//   16   24:aload_0         
	//   17   25:fload_1         
	//   18   26:invokestatic    #58  <Method float Utils.convertDpToPixel(float)>
	//   19   29:putfield        #30  <Field float mTextSize>
	//   20   32:return          
	}

	public void setTypeface(Typeface typeface)
	{
		mTypeface = typeface;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field Typeface mTypeface>
	//    3    5:return          
	}

	public void setXOffset(float f)
	{
		mXOffset = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #58  <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #23  <Field float mXOffset>
	//    4    8:return          
	}

	public void setYOffset(float f)
	{
		mYOffset = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #58  <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #25  <Field float mYOffset>
	//    4    8:return          
	}

	protected boolean mEnabled;
	protected int mTextColor;
	protected float mTextSize;
	protected Typeface mTypeface;
	protected float mXOffset;
	protected float mYOffset;
}
