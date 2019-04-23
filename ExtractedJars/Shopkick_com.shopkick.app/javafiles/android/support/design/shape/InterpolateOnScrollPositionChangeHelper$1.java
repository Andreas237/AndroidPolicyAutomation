// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;


// Referenced classes of package android.support.design.shape:
//			InterpolateOnScrollPositionChangeHelper

class InterpolateOnScrollPositionChangeHelper$1
	implements android.view.ViewTreeObserver.OnScrollChangedListener
{

	public void onScrollChanged()
	{
		updateInterpolationForScreenPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field InterpolateOnScrollPositionChangeHelper this$0>
	//    2    4:invokevirtual   #22  <Method void InterpolateOnScrollPositionChangeHelper.updateInterpolationForScreenPosition()>
	//    3    7:return          
	}

	final InterpolateOnScrollPositionChangeHelper this$0;

	InterpolateOnScrollPositionChangeHelper$1()
	{
		this$0 = InterpolateOnScrollPositionChangeHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field InterpolateOnScrollPositionChangeHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
