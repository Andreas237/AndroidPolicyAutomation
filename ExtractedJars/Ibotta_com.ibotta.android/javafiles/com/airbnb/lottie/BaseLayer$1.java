// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			BaseLayer, FloatKeyframeAnimation

class BaseLayer$1
	implements Animation.AnimationListener
{

	public void onValueChanged()
	{
		BaseLayer baselayer = BaseLayer.this;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BaseLayer this$0>
	//    2    4:astore_2        
		boolean flag;
		if(((Float)val$inOutAnimation.getValue()).floatValue() == 1.0F)
	//*   3    5:aload_0         
	//*   4    6:getfield        #21  <Field FloatKeyframeAnimation val$inOutAnimation>
	//*   5    9:invokevirtual   #31  <Method Object FloatKeyframeAnimation.getValue()>
	//*   6   12:checkcast       #33  <Class Float>
	//*   7   15:invokevirtual   #37  <Method float Float.floatValue()>
	//*   8   18:fconst_1        
	//*   9   19:fcmpl           
	//*  10   20:ifne            28
			flag = true;
	//   11   23:iconst_1        
	//   12   24:istore_1        
		else
	//*  13   25:goto            30
			flag = false;
	//   14   28:iconst_0        
	//   15   29:istore_1        
		BaseLayer.access$000(baselayer, flag);
	//   16   30:aload_2         
	//   17   31:iload_1         
	//   18   32:invokestatic    #41  <Method void BaseLayer.access$000(BaseLayer, boolean)>
	//   19   35:return          
	}

	final BaseLayer this$0;
	final FloatKeyframeAnimation val$inOutAnimation;

	BaseLayer$1()
	{
		this$0 = final_baselayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BaseLayer this$0>
		val$inOutAnimation = FloatKeyframeAnimation.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FloatKeyframeAnimation val$inOutAnimation>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
