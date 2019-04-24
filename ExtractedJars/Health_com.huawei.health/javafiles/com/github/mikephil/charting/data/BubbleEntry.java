// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.github.mikephil.charting.data:
//			Entry

public class BubbleEntry extends Entry
{

	public BubbleEntry(float f, float f1, float f2)
	{
		super(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #14  <Method void Entry(float, float)>
		mSize = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #16  <Field float mSize>
		mSize = f2;
	//    7   11:aload_0         
	//    8   12:fload_3         
	//    9   13:putfield        #16  <Field float mSize>
	//   10   16:return          
	}

	public BubbleEntry(float f, float f1, float f2, Drawable drawable)
	{
		super(f, f1, drawable);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aload           4
	//    4    5:invokespecial   #21  <Method void Entry(float, float, Drawable)>
		mSize = 0.0F;
	//    5    8:aload_0         
	//    6    9:fconst_0        
	//    7   10:putfield        #16  <Field float mSize>
		mSize = f2;
	//    8   13:aload_0         
	//    9   14:fload_3         
	//   10   15:putfield        #16  <Field float mSize>
	//   11   18:return          
	}

	public BubbleEntry(float f, float f1, float f2, Drawable drawable, Object obj)
	{
		super(f, f1, drawable, obj);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokespecial   #25  <Method void Entry(float, float, Drawable, Object)>
		mSize = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #16  <Field float mSize>
		mSize = f2;
	//    9   15:aload_0         
	//   10   16:fload_3         
	//   11   17:putfield        #16  <Field float mSize>
	//   12   20:return          
	}

	public BubbleEntry(float f, float f1, float f2, Object obj)
	{
		super(f, f1, obj);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:aload           4
	//    4    5:invokespecial   #29  <Method void Entry(float, float, Object)>
		mSize = 0.0F;
	//    5    8:aload_0         
	//    6    9:fconst_0        
	//    7   10:putfield        #16  <Field float mSize>
		mSize = f2;
	//    8   13:aload_0         
	//    9   14:fload_3         
	//   10   15:putfield        #16  <Field float mSize>
	//   11   18:return          
	}

	public BubbleEntry copy()
	{
		return new BubbleEntry(getX(), getY(), mSize, getData());
	//    0    0:new             #2   <Class BubbleEntry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #35  <Method float getX()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #38  <Method float getY()>
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field float mSize>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #42  <Method Object getData()>
	//   10   20:invokespecial   #44  <Method void BubbleEntry(float, float, float, Object)>
	//   11   23:areturn         
	}

	public volatile Entry copy()
	{
		return ((Entry) (copy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method BubbleEntry copy()>
	//    2    4:areturn         
	}

	public float getSize()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field float mSize>
	//    2    4:freturn         
	}

	public void setSize(float f)
	{
		mSize = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #16  <Field float mSize>
	//    3    5:return          
	}

	private float mSize;
}
