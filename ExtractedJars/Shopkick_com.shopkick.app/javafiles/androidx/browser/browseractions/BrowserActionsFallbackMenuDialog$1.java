// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package androidx.browser.browseractions:
//			BrowserActionsFallbackMenuDialog

class BrowserActionsFallbackMenuDialog$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		if(!val$isEnterAnimation)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field boolean val$isEnterAnimation>
	//*   2    4:ifne            14
			BrowserActionsFallbackMenuDialog.access$001(BrowserActionsFallbackMenuDialog.this);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field BrowserActionsFallbackMenuDialog this$0>
	//    5   11:invokestatic    #29  <Method void BrowserActionsFallbackMenuDialog.access$001(BrowserActionsFallbackMenuDialog)>
	//    6   14:return          
	}

	final BrowserActionsFallbackMenuDialog this$0;
	final boolean val$isEnterAnimation;

	BrowserActionsFallbackMenuDialog$1()
	{
		this$0 = final_browseractionsfallbackmenudialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BrowserActionsFallbackMenuDialog this$0>
		val$isEnterAnimation = Z.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #19  <Field boolean val$isEnterAnimation>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
