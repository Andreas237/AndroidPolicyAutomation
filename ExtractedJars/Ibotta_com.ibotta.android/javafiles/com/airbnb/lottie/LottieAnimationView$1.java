// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			OnCompositionLoadedListener, LottieAnimationView, LottieComposition

class LottieAnimationView$1
	implements OnCompositionLoadedListener
{

	public void onCompositionLoaded(LottieComposition lottiecomposition)
	{
		setComposition(lottiecomposition);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field LottieAnimationView this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #23  <Method void LottieAnimationView.setComposition(LottieComposition)>
		LottieAnimationView.access$002(LottieAnimationView.this, ((Cancellable) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field LottieAnimationView this$0>
	//    6   12:aconst_null     
	//    7   13:invokestatic    #27  <Method Cancellable LottieAnimationView.access$002(LottieAnimationView, Cancellable)>
	//    8   16:pop             
	//    9   17:return          
	}

	final LottieAnimationView this$0;

	LottieAnimationView$1()
	{
		this$0 = LottieAnimationView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field LottieAnimationView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
