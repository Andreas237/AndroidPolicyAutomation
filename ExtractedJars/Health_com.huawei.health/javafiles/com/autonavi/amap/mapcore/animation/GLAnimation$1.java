// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.animation;


// Referenced classes of package com.autonavi.amap.mapcore.animation:
//			GLAnimation

class GLAnimation$1
	implements Runnable
{

	public void run()
	{
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field GLAnimation this$0>
	//*   2    4:getfield        #28  <Field com.amap.api.maps.model.animation.Animation$AnimationListener GLAnimation.mListener>
	//*   3    7:ifnull          28
			try
			{
				mListener.onAnimationStart();
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field GLAnimation this$0>
	//    6   14:getfield        #28  <Field com.amap.api.maps.model.animation.Animation$AnimationListener GLAnimation.mListener>
	//    7   17:invokeinterface #33  <Method void com.amap.api.maps.model.animation.Animation$AnimationListener.onAnimationStart()>
				return;
	//    8   22:return          
			}
			catch(Throwable throwable)
	//*   9   23:astore_1        
			{
				throwable.printStackTrace();
	//   10   24:aload_1         
	//   11   25:invokevirtual   #36  <Method void Throwable.printStackTrace()>
			}
	//   12   28:return          
	}

	final GLAnimation this$0;

	GLAnimation$1()
	{
		this$0 = GLAnimation.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GLAnimation this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
