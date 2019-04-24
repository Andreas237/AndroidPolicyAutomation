// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;


// Referenced classes of package com.github.mikephil.charting.data:
//			Entry

public class BubbleEntry extends Entry
{

	public BubbleEntry(int i, float f, float f1)
	{
		super(f, i);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:iload_1         
	//    3    3:invokespecial   #11  <Method void Entry(float, int)>
		mSize = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #13  <Field float mSize>
		mSize = f1;
	//    7   11:aload_0         
	//    8   12:fload_3         
	//    9   13:putfield        #13  <Field float mSize>
	//   10   16:return          
	}

	public BubbleEntry(int i, float f, float f1, Object obj)
	{
		super(f, i, obj);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:iload_1         
	//    3    3:aload           4
	//    4    5:invokespecial   #18  <Method void Entry(float, int, Object)>
		mSize = 0.0F;
	//    5    8:aload_0         
	//    6    9:fconst_0        
	//    7   10:putfield        #13  <Field float mSize>
		mSize = f1;
	//    8   13:aload_0         
	//    9   14:fload_3         
	//   10   15:putfield        #13  <Field float mSize>
	//   11   18:return          
	}

	public BubbleEntry copy()
	{
		return new BubbleEntry(getXIndex(), getVal(), mSize, getData());
	//    0    0:new             #2   <Class BubbleEntry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #24  <Method int getXIndex()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #28  <Method float getVal()>
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field float mSize>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #32  <Method Object getData()>
	//   10   20:invokespecial   #34  <Method void BubbleEntry(int, float, float, Object)>
	//   11   23:areturn         
	}

	public volatile Entry copy()
	{
		return ((Entry) (copy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method BubbleEntry copy()>
	//    2    4:areturn         
	}

	public float getSize()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float mSize>
	//    2    4:freturn         
	}

	public void setSize(float f)
	{
		mSize = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #13  <Field float mSize>
	//    3    5:return          
	}

	private float mSize;
}
