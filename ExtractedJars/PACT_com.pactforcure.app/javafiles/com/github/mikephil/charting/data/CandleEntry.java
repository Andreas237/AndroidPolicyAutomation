// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;


// Referenced classes of package com.github.mikephil.charting.data:
//			Entry

public class CandleEntry extends Entry
{

	public CandleEntry(int i, float f, float f1, float f2, float f3)
	{
		super((f + f1) / 2.0F, i);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:fadd            
	//    4    4:fconst_2        
	//    5    5:fdiv            
	//    6    6:iload_1         
	//    7    7:invokespecial   #14  <Method void Entry(float, int)>
		mShadowHigh = 0.0F;
	//    8   10:aload_0         
	//    9   11:fconst_0        
	//   10   12:putfield        #16  <Field float mShadowHigh>
		mShadowLow = 0.0F;
	//   11   15:aload_0         
	//   12   16:fconst_0        
	//   13   17:putfield        #18  <Field float mShadowLow>
		mClose = 0.0F;
	//   14   20:aload_0         
	//   15   21:fconst_0        
	//   16   22:putfield        #20  <Field float mClose>
		mOpen = 0.0F;
	//   17   25:aload_0         
	//   18   26:fconst_0        
	//   19   27:putfield        #22  <Field float mOpen>
		mShadowHigh = f;
	//   20   30:aload_0         
	//   21   31:fload_2         
	//   22   32:putfield        #16  <Field float mShadowHigh>
		mShadowLow = f1;
	//   23   35:aload_0         
	//   24   36:fload_3         
	//   25   37:putfield        #18  <Field float mShadowLow>
		mOpen = f2;
	//   26   40:aload_0         
	//   27   41:fload           4
	//   28   43:putfield        #22  <Field float mOpen>
		mClose = f3;
	//   29   46:aload_0         
	//   30   47:fload           5
	//   31   49:putfield        #20  <Field float mClose>
	//   32   52:return          
	}

	public CandleEntry(int i, float f, float f1, float f2, float f3, Object obj)
	{
		super((f + f1) / 2.0F, i, obj);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:fadd            
	//    4    4:fconst_2        
	//    5    5:fdiv            
	//    6    6:iload_1         
	//    7    7:aload           6
	//    8    9:invokespecial   #27  <Method void Entry(float, int, Object)>
		mShadowHigh = 0.0F;
	//    9   12:aload_0         
	//   10   13:fconst_0        
	//   11   14:putfield        #16  <Field float mShadowHigh>
		mShadowLow = 0.0F;
	//   12   17:aload_0         
	//   13   18:fconst_0        
	//   14   19:putfield        #18  <Field float mShadowLow>
		mClose = 0.0F;
	//   15   22:aload_0         
	//   16   23:fconst_0        
	//   17   24:putfield        #20  <Field float mClose>
		mOpen = 0.0F;
	//   18   27:aload_0         
	//   19   28:fconst_0        
	//   20   29:putfield        #22  <Field float mOpen>
		mShadowHigh = f;
	//   21   32:aload_0         
	//   22   33:fload_2         
	//   23   34:putfield        #16  <Field float mShadowHigh>
		mShadowLow = f1;
	//   24   37:aload_0         
	//   25   38:fload_3         
	//   26   39:putfield        #18  <Field float mShadowLow>
		mOpen = f2;
	//   27   42:aload_0         
	//   28   43:fload           4
	//   29   45:putfield        #22  <Field float mOpen>
		mClose = f3;
	//   30   48:aload_0         
	//   31   49:fload           5
	//   32   51:putfield        #20  <Field float mClose>
	//   33   54:return          
	}

	public CandleEntry copy()
	{
		return new CandleEntry(getXIndex(), mShadowHigh, mShadowLow, mOpen, mClose, getData());
	//    0    0:new             #2   <Class CandleEntry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #33  <Method int getXIndex()>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field float mShadowHigh>
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field float mShadowLow>
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field float mOpen>
	//   10   20:aload_0         
	//   11   21:getfield        #20  <Field float mClose>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #37  <Method Object getData()>
	//   14   28:invokespecial   #39  <Method void CandleEntry(int, float, float, float, float, Object)>
	//   15   31:areturn         
	}

	public volatile Entry copy()
	{
		return ((Entry) (copy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method CandleEntry copy()>
	//    2    4:areturn         
	}

	public float getBodyRange()
	{
		return Math.abs(mOpen - mClose);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float mOpen>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field float mClose>
	//    4    8:fsub            
	//    5    9:invokestatic    #50  <Method float Math.abs(float)>
	//    6   12:freturn         
	}

	public float getClose()
	{
		return mClose;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float mClose>
	//    2    4:freturn         
	}

	public float getHigh()
	{
		return mShadowHigh;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field float mShadowHigh>
	//    2    4:freturn         
	}

	public float getLow()
	{
		return mShadowLow;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field float mShadowLow>
	//    2    4:freturn         
	}

	public float getOpen()
	{
		return mOpen;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float mOpen>
	//    2    4:freturn         
	}

	public float getShadowRange()
	{
		return Math.abs(mShadowHigh - mShadowLow);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field float mShadowHigh>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field float mShadowLow>
	//    4    8:fsub            
	//    5    9:invokestatic    #50  <Method float Math.abs(float)>
	//    6   12:freturn         
	}

	public float getVal()
	{
		return super.getVal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method float Entry.getVal()>
	//    2    4:freturn         
	}

	public void setClose(float f)
	{
		mClose = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #20  <Field float mClose>
	//    3    5:return          
	}

	public void setHigh(float f)
	{
		mShadowHigh = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #16  <Field float mShadowHigh>
	//    3    5:return          
	}

	public void setLow(float f)
	{
		mShadowLow = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #18  <Field float mShadowLow>
	//    3    5:return          
	}

	public void setOpen(float f)
	{
		mOpen = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #22  <Field float mOpen>
	//    3    5:return          
	}

	private float mClose;
	private float mOpen;
	private float mShadowHigh;
	private float mShadowLow;
}
