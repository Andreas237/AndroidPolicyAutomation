// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.github.mikephil.charting.data:
//			Entry

public class CandleEntry extends Entry
{

	public CandleEntry(float f, float f1, float f2, float f3, float f4)
	{
		super(f, (f1 + f2) / 2.0F);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fadd            
	//    5    5:fconst_2        
	//    6    6:fdiv            
	//    7    7:invokespecial   #17  <Method void Entry(float, float)>
		mShadowHigh = 0.0F;
	//    8   10:aload_0         
	//    9   11:fconst_0        
	//   10   12:putfield        #19  <Field float mShadowHigh>
		mShadowLow = 0.0F;
	//   11   15:aload_0         
	//   12   16:fconst_0        
	//   13   17:putfield        #21  <Field float mShadowLow>
		mClose = 0.0F;
	//   14   20:aload_0         
	//   15   21:fconst_0        
	//   16   22:putfield        #23  <Field float mClose>
		mOpen = 0.0F;
	//   17   25:aload_0         
	//   18   26:fconst_0        
	//   19   27:putfield        #25  <Field float mOpen>
		mShadowHigh = f1;
	//   20   30:aload_0         
	//   21   31:fload_2         
	//   22   32:putfield        #19  <Field float mShadowHigh>
		mShadowLow = f2;
	//   23   35:aload_0         
	//   24   36:fload_3         
	//   25   37:putfield        #21  <Field float mShadowLow>
		mOpen = f3;
	//   26   40:aload_0         
	//   27   41:fload           4
	//   28   43:putfield        #25  <Field float mOpen>
		mClose = f4;
	//   29   46:aload_0         
	//   30   47:fload           5
	//   31   49:putfield        #23  <Field float mClose>
	//   32   52:return          
	}

	public CandleEntry(float f, float f1, float f2, float f3, float f4, Drawable drawable)
	{
		super(f, (f1 + f2) / 2.0F, drawable);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fadd            
	//    5    5:fconst_2        
	//    6    6:fdiv            
	//    7    7:aload           6
	//    8    9:invokespecial   #30  <Method void Entry(float, float, Drawable)>
		mShadowHigh = 0.0F;
	//    9   12:aload_0         
	//   10   13:fconst_0        
	//   11   14:putfield        #19  <Field float mShadowHigh>
		mShadowLow = 0.0F;
	//   12   17:aload_0         
	//   13   18:fconst_0        
	//   14   19:putfield        #21  <Field float mShadowLow>
		mClose = 0.0F;
	//   15   22:aload_0         
	//   16   23:fconst_0        
	//   17   24:putfield        #23  <Field float mClose>
		mOpen = 0.0F;
	//   18   27:aload_0         
	//   19   28:fconst_0        
	//   20   29:putfield        #25  <Field float mOpen>
		mShadowHigh = f1;
	//   21   32:aload_0         
	//   22   33:fload_2         
	//   23   34:putfield        #19  <Field float mShadowHigh>
		mShadowLow = f2;
	//   24   37:aload_0         
	//   25   38:fload_3         
	//   26   39:putfield        #21  <Field float mShadowLow>
		mOpen = f3;
	//   27   42:aload_0         
	//   28   43:fload           4
	//   29   45:putfield        #25  <Field float mOpen>
		mClose = f4;
	//   30   48:aload_0         
	//   31   49:fload           5
	//   32   51:putfield        #23  <Field float mClose>
	//   33   54:return          
	}

	public CandleEntry(float f, float f1, float f2, float f3, float f4, Drawable drawable, Object obj)
	{
		super(f, (f1 + f2) / 2.0F, drawable, obj);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fadd            
	//    5    5:fconst_2        
	//    6    6:fdiv            
	//    7    7:aload           6
	//    8    9:aload           7
	//    9   11:invokespecial   #34  <Method void Entry(float, float, Drawable, Object)>
		mShadowHigh = 0.0F;
	//   10   14:aload_0         
	//   11   15:fconst_0        
	//   12   16:putfield        #19  <Field float mShadowHigh>
		mShadowLow = 0.0F;
	//   13   19:aload_0         
	//   14   20:fconst_0        
	//   15   21:putfield        #21  <Field float mShadowLow>
		mClose = 0.0F;
	//   16   24:aload_0         
	//   17   25:fconst_0        
	//   18   26:putfield        #23  <Field float mClose>
		mOpen = 0.0F;
	//   19   29:aload_0         
	//   20   30:fconst_0        
	//   21   31:putfield        #25  <Field float mOpen>
		mShadowHigh = f1;
	//   22   34:aload_0         
	//   23   35:fload_2         
	//   24   36:putfield        #19  <Field float mShadowHigh>
		mShadowLow = f2;
	//   25   39:aload_0         
	//   26   40:fload_3         
	//   27   41:putfield        #21  <Field float mShadowLow>
		mOpen = f3;
	//   28   44:aload_0         
	//   29   45:fload           4
	//   30   47:putfield        #25  <Field float mOpen>
		mClose = f4;
	//   31   50:aload_0         
	//   32   51:fload           5
	//   33   53:putfield        #23  <Field float mClose>
	//   34   56:return          
	}

	public CandleEntry(float f, float f1, float f2, float f3, float f4, Object obj)
	{
		super(f, (f1 + f2) / 2.0F, obj);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fadd            
	//    5    5:fconst_2        
	//    6    6:fdiv            
	//    7    7:aload           6
	//    8    9:invokespecial   #38  <Method void Entry(float, float, Object)>
		mShadowHigh = 0.0F;
	//    9   12:aload_0         
	//   10   13:fconst_0        
	//   11   14:putfield        #19  <Field float mShadowHigh>
		mShadowLow = 0.0F;
	//   12   17:aload_0         
	//   13   18:fconst_0        
	//   14   19:putfield        #21  <Field float mShadowLow>
		mClose = 0.0F;
	//   15   22:aload_0         
	//   16   23:fconst_0        
	//   17   24:putfield        #23  <Field float mClose>
		mOpen = 0.0F;
	//   18   27:aload_0         
	//   19   28:fconst_0        
	//   20   29:putfield        #25  <Field float mOpen>
		mShadowHigh = f1;
	//   21   32:aload_0         
	//   22   33:fload_2         
	//   23   34:putfield        #19  <Field float mShadowHigh>
		mShadowLow = f2;
	//   24   37:aload_0         
	//   25   38:fload_3         
	//   26   39:putfield        #21  <Field float mShadowLow>
		mOpen = f3;
	//   27   42:aload_0         
	//   28   43:fload           4
	//   29   45:putfield        #25  <Field float mOpen>
		mClose = f4;
	//   30   48:aload_0         
	//   31   49:fload           5
	//   32   51:putfield        #23  <Field float mClose>
	//   33   54:return          
	}

	public CandleEntry copy()
	{
		return new CandleEntry(getX(), mShadowHigh, mShadowLow, mOpen, mClose, getData());
	//    0    0:new             #2   <Class CandleEntry>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #44  <Method float getX()>
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field float mShadowHigh>
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field float mShadowLow>
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field float mOpen>
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field float mClose>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #48  <Method Object getData()>
	//   14   28:invokespecial   #50  <Method void CandleEntry(float, float, float, float, float, Object)>
	//   15   31:areturn         
	}

	public volatile Entry copy()
	{
		return ((Entry) (copy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method CandleEntry copy()>
	//    2    4:areturn         
	}

	public float getBodyRange()
	{
		return Math.abs(mOpen - mClose);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float mOpen>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field float mClose>
	//    4    8:fsub            
	//    5    9:invokestatic    #60  <Method float Math.abs(float)>
	//    6   12:freturn         
	}

	public float getClose()
	{
		return mClose;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field float mClose>
	//    2    4:freturn         
	}

	public float getHigh()
	{
		return mShadowHigh;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field float mShadowHigh>
	//    2    4:freturn         
	}

	public float getLow()
	{
		return mShadowLow;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field float mShadowLow>
	//    2    4:freturn         
	}

	public float getOpen()
	{
		return mOpen;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float mOpen>
	//    2    4:freturn         
	}

	public float getShadowRange()
	{
		return Math.abs(mShadowHigh - mShadowLow);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field float mShadowHigh>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field float mShadowLow>
	//    4    8:fsub            
	//    5    9:invokestatic    #60  <Method float Math.abs(float)>
	//    6   12:freturn         
	}

	public float getY()
	{
		return super.getY();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method float Entry.getY()>
	//    2    4:freturn         
	}

	public void setClose(float f)
	{
		mClose = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #23  <Field float mClose>
	//    3    5:return          
	}

	public void setHigh(float f)
	{
		mShadowHigh = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #19  <Field float mShadowHigh>
	//    3    5:return          
	}

	public void setLow(float f)
	{
		mShadowLow = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #21  <Field float mShadowLow>
	//    3    5:return          
	}

	public void setOpen(float f)
	{
		mOpen = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #25  <Field float mOpen>
	//    3    5:return          
	}

	private float mClose;
	private float mOpen;
	private float mShadowHigh;
	private float mShadowLow;
}
