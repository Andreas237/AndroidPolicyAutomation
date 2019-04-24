// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;


// Referenced classes of package com.github.amlcurran.showcaseview:
//			ShowcaseView, OnShowcaseEventListener

class ShowcaseView$2
	implements y.AnimationEndListener
{

	public void onAnimationEnd()
	{
		setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ShowcaseView this$0>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #25  <Method void ShowcaseView.setVisibility(int)>
		ShowcaseView.access$400(ShowcaseView.this).onShowcaseViewDidHide(ShowcaseView.this);
	//    4    9:aload_0         
	//    5   10:getfield        #17  <Field ShowcaseView this$0>
	//    6   13:invokestatic    #29  <Method OnShowcaseEventListener ShowcaseView.access$400(ShowcaseView)>
	//    7   16:aload_0         
	//    8   17:getfield        #17  <Field ShowcaseView this$0>
	//    9   20:invokeinterface #34  <Method void OnShowcaseEventListener.onShowcaseViewDidHide(ShowcaseView)>
	//   10   25:return          
	}

	final ShowcaseView this$0;

	ShowcaseView$2()
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
