// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.airbnb.lottie:
//			OnCompositionLoadedListener, LottieAnimationView, LottieComposition

class LottieAnimationView$2
	implements OnCompositionLoadedListener
{

	public void onCompositionLoaded(LottieComposition lottiecomposition)
	{
		if(val$cacheStrategy == cheStrategy.Strong)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field LottieAnimationView$CacheStrategy val$cacheStrategy>
	//*   2    4:getstatic       #36  <Field LottieAnimationView$CacheStrategy LottieAnimationView$CacheStrategy.Strong>
	//*   3    7:if_acmpne       27
			LottieAnimationView.access$100().put(((Object) (val$animationName)), ((Object) (lottiecomposition)));
	//    4   10:invokestatic    #40  <Method Map LottieAnimationView.access$100()>
	//    5   13:aload_0         
	//    6   14:getfield        #25  <Field String val$animationName>
	//    7   17:aload_1         
	//    8   18:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//    9   23:pop             
		else
	//*  10   24:goto            58
		if(val$cacheStrategy == cheStrategy.Weak)
	//*  11   27:aload_0         
	//*  12   28:getfield        #23  <Field LottieAnimationView$CacheStrategy val$cacheStrategy>
	//*  13   31:getstatic       #49  <Field LottieAnimationView$CacheStrategy LottieAnimationView$CacheStrategy.Weak>
	//*  14   34:if_acmpne       58
			LottieAnimationView.access$200().put(((Object) (val$animationName)), ((Object) (new WeakReference(((Object) (lottiecomposition))))));
	//   15   37:invokestatic    #52  <Method Map LottieAnimationView.access$200()>
	//   16   40:aload_0         
	//   17   41:getfield        #25  <Field String val$animationName>
	//   18   44:new             #54  <Class WeakReference>
	//   19   47:dup             
	//   20   48:aload_1         
	//   21   49:invokespecial   #57  <Method void WeakReference(Object)>
	//   22   52:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   23   57:pop             
		setComposition(lottiecomposition);
	//   24   58:aload_0         
	//   25   59:getfield        #21  <Field LottieAnimationView this$0>
	//   26   62:aload_1         
	//   27   63:invokevirtual   #60  <Method void LottieAnimationView.setComposition(LottieComposition)>
	//   28   66:return          
	}

	final LottieAnimationView this$0;
	final String val$animationName;
	final cheStrategy val$cacheStrategy;

	LottieAnimationView$2()
	{
		this$0 = final_lottieanimationview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field LottieAnimationView this$0>
		val$cacheStrategy = chestrategy;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field LottieAnimationView$CacheStrategy val$cacheStrategy>
		val$animationName = String.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String val$animationName>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
