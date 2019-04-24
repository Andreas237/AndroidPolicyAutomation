// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;


// Referenced classes of package com.github.amlcurran.showcaseview:
//			ShowcaseView

class ShowcaseView$3
	implements y.AnimationStartListener
{

	public void onAnimationStart()
	{
		setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ShowcaseView this$0>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #25  <Method void ShowcaseView.setVisibility(int)>
	//    4    8:return          
	}

	final ShowcaseView this$0;

	ShowcaseView$3()
	{
		this$0 = ShowcaseView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ShowcaseView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
