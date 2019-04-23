// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.chrisbanes.photoview;

import android.view.animation.Interpolator;

// Referenced classes of package com.github.chrisbanes.photoview:
//			PhotoViewAttacher, Compat

private class PhotoViewAttacher$AnimatedZoomRunnable
	implements Runnable
{

	private float interpolate()
	{
		float f = Math.min(1.0F, ((float)(System.currentTimeMillis() - mStartTime) * 1.0F) / (float)PhotoViewAttacher.access$800(PhotoViewAttacher.this));
	//    0    0:fconst_1        
	//    1    1:invokestatic    #35  <Method long System.currentTimeMillis()>
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field long mStartTime>
	//    4    8:lsub            
	//    5    9:l2f             
	//    6   10:fconst_1        
	//    7   11:fmul            
	//    8   12:aload_0         
	//    9   13:getfield        #22  <Field PhotoViewAttacher this$0>
	//   10   16:invokestatic    #48  <Method int PhotoViewAttacher.access$800(PhotoViewAttacher)>
	//   11   19:i2f             
	//   12   20:fdiv            
	//   13   21:invokestatic    #54  <Method float Math.min(float, float)>
	//   14   24:fstore_1        
		return PhotoViewAttacher.access$900(PhotoViewAttacher.this).getInterpolation(f);
	//   15   25:aload_0         
	//   16   26:getfield        #22  <Field PhotoViewAttacher this$0>
	//   17   29:invokestatic    #58  <Method Interpolator PhotoViewAttacher.access$900(PhotoViewAttacher)>
	//   18   32:fload_1         
	//   19   33:invokeinterface #64  <Method float Interpolator.getInterpolation(float)>
	//   20   38:freturn         
	}

	public void run()
	{
		float f = interpolate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method float interpolate()>
	//    2    4:fstore_1        
		float f1 = mZoomStart;
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field float mZoomStart>
	//    5    9:fstore_2        
		f1 = (f1 + (mZoomEnd - f1) * f) / getScale();
	//    6   10:fload_2         
	//    7   11:aload_0         
	//    8   12:getfield        #41  <Field float mZoomEnd>
	//    9   15:fload_2         
	//   10   16:fsub            
	//   11   17:fload_1         
	//   12   18:fmul            
	//   13   19:fadd            
	//   14   20:aload_0         
	//   15   21:getfield        #22  <Field PhotoViewAttacher this$0>
	//   16   24:invokevirtual   #70  <Method float PhotoViewAttacher.getScale()>
	//   17   27:fdiv            
	//   18   28:fstore_2        
		onScale(f1, mFocalX, mFocalY);
	//   19   29:aload_0         
	//   20   30:getfield        #22  <Field PhotoViewAttacher this$0>
	//   21   33:fload_2         
	//   22   34:aload_0         
	//   23   35:getfield        #27  <Field float mFocalX>
	//   24   38:aload_0         
	//   25   39:getfield        #29  <Field float mFocalY>
	//   26   42:invokevirtual   #74  <Method void PhotoViewAttacher.onScale(float, float, float)>
		if(f < 1.0F)
	//*  27   45:fload_1         
	//*  28   46:fconst_1        
	//*  29   47:fcmpg           
	//*  30   48:ifge            62
			Compat.postOnAnimation(((android.view.View) (PhotoViewAttacher.access$100(PhotoViewAttacher.this))), ((Runnable) (this)));
	//   31   51:aload_0         
	//   32   52:getfield        #22  <Field PhotoViewAttacher this$0>
	//   33   55:invokestatic    #78  <Method android.widget.ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
	//   34   58:aload_0         
	//   35   59:invokestatic    #84  <Method void Compat.postOnAnimation(android.view.View, Runnable)>
	//   36   62:return          
	}

	private final float mFocalX;
	private final float mFocalY;
	private final long mStartTime = System.currentTimeMillis();
	private final float mZoomEnd;
	private final float mZoomStart;
	final PhotoViewAttacher this$0;

	public PhotoViewAttacher$AnimatedZoomRunnable(float f, float f1, float f2, float f3)
	{
		this$0 = PhotoViewAttacher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field PhotoViewAttacher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		mFocalX = f2;
	//    5    9:aload_0         
	//    6   10:fload           4
	//    7   12:putfield        #27  <Field float mFocalX>
		mFocalY = f3;
	//    8   15:aload_0         
	//    9   16:fload           5
	//   10   18:putfield        #29  <Field float mFocalY>
	//   11   21:aload_0         
	//   12   22:invokestatic    #35  <Method long System.currentTimeMillis()>
	//   13   25:putfield        #37  <Field long mStartTime>
		mZoomStart = f;
	//   14   28:aload_0         
	//   15   29:fload_2         
	//   16   30:putfield        #39  <Field float mZoomStart>
		mZoomEnd = f1;
	//   17   33:aload_0         
	//   18   34:fload_3         
	//   19   35:putfield        #41  <Field float mZoomEnd>
	//   20   38:return          
	}
}
