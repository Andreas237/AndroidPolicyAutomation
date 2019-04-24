// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


// Referenced classes of package com.autonavi.amap.mapcore:
//			FPointBounds, FPoint

public static final class FPointBounds$Builder
{

	private boolean containsx(double d)
	{
		if(mWest <= mEast)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field float mWest>
	//*   2    4:aload_0         
	//*   3    5:getfield        #26  <Field float mEast>
	//*   4    8:fcmpg           
	//*   5    9:ifgt            36
			return (double)mWest <= d && d <= (double)mEast;
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field float mWest>
	//    8   16:f2d             
	//    9   17:dload_1         
	//   10   18:dcmpg           
	//   11   19:ifgt            34
	//   12   22:dload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #26  <Field float mEast>
	//   15   27:f2d             
	//   16   28:dcmpg           
	//   17   29:ifgt            34
	//   18   32:iconst_1        
	//   19   33:ireturn         
	//   20   34:iconst_0        
	//   21   35:ireturn         
		return (double)mWest <= d || d <= (double)mEast;
	//   22   36:aload_0         
	//   23   37:getfield        #24  <Field float mWest>
	//   24   40:f2d             
	//   25   41:dload_1         
	//   26   42:dcmpg           
	//   27   43:ifle            56
	//   28   46:dload_1         
	//   29   47:aload_0         
	//   30   48:getfield        #26  <Field float mEast>
	//   31   51:f2d             
	//   32   52:dcmpg           
	//   33   53:ifgt            58
	//   34   56:iconst_1        
	//   35   57:ireturn         
	//   36   58:iconst_0        
	//   37   59:ireturn         
	}

	public FPointBounds build()
	{
		return new FPointBounds(FPoint.obtain(mWest, mSouth), FPoint.obtain(mEast, mNorth));
	//    0    0:new             #6   <Class FPointBounds>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field float mWest>
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field float mSouth>
	//    6   12:invokestatic    #37  <Method FPoint FPoint.obtain(float, float)>
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field float mEast>
	//    9   19:aload_0         
	//   10   20:getfield        #22  <Field float mNorth>
	//   11   23:invokestatic    #37  <Method FPoint FPoint.obtain(float, float)>
	//   12   26:invokespecial   #40  <Method void FPointBounds(FPoint, FPoint)>
	//   13   29:areturn         
	}

	public FPointBounds$Builder include(FPoint fpoint)
	{
		mSouth = Math.min(mSouth, fpoint.y);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field float mSouth>
	//    3    5:aload_1         
	//    4    6:getfield        #45  <Field float FPoint.y>
	//    5    9:invokestatic    #51  <Method float Math.min(float, float)>
	//    6   12:putfield        #19  <Field float mSouth>
		mNorth = Math.max(mNorth, fpoint.y);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field float mNorth>
	//   10   20:aload_1         
	//   11   21:getfield        #45  <Field float FPoint.y>
	//   12   24:invokestatic    #54  <Method float Math.max(float, float)>
	//   13   27:putfield        #22  <Field float mNorth>
		mWest = Math.min(mWest, fpoint.x);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #24  <Field float mWest>
	//   17   35:aload_1         
	//   18   36:getfield        #57  <Field float FPoint.x>
	//   19   39:invokestatic    #51  <Method float Math.min(float, float)>
	//   20   42:putfield        #24  <Field float mWest>
		mEast = Math.max(mEast, fpoint.x);
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #26  <Field float mEast>
	//   24   50:aload_1         
	//   25   51:getfield        #57  <Field float FPoint.x>
	//   26   54:invokestatic    #54  <Method float Math.max(float, float)>
	//   27   57:putfield        #26  <Field float mEast>
		return this;
	//   28   60:aload_0         
	//   29   61:areturn         
	}

	private float mEast;
	private float mNorth;
	private float mSouth;
	private float mWest;

	public FPointBounds$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mSouth = (1.0F / 0.0F);
	//    2    4:aload_0         
	//    3    5:ldc1            #17  <Float (1.0F / 0.0F)>
	//    4    7:putfield        #19  <Field float mSouth>
		mNorth = (-1.0F / 0.0F);
	//    5   10:aload_0         
	//    6   11:ldc1            #20  <Float (-1.0F / 0.0F)>
	//    7   13:putfield        #22  <Field float mNorth>
		mWest = (1.0F / 0.0F);
	//    8   16:aload_0         
	//    9   17:ldc1            #17  <Float (1.0F / 0.0F)>
	//   10   19:putfield        #24  <Field float mWest>
		mEast = (-1.0F / 0.0F);
	//   11   22:aload_0         
	//   12   23:ldc1            #20  <Float (-1.0F / 0.0F)>
	//   13   25:putfield        #26  <Field float mEast>
	//   14   28:return          
	}
}
