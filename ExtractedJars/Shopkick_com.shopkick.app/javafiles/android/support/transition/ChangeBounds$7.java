// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.transition:
//			ChangeBounds

class ChangeBounds$7 extends AnimatorListenerAdapter
{

	private ewBounds mViewBounds;
	final ChangeBounds this$0;
	final ewBounds val$viewBounds;

	ChangeBounds$7()
	{
		this$0 = final_changebounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ChangeBounds this$0>
		val$viewBounds = ewBounds.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field ChangeBounds$ViewBounds val$viewBounds>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void AnimatorListenerAdapter()>
		mViewBounds = val$viewBounds;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #20  <Field ChangeBounds$ViewBounds val$viewBounds>
	//   11   19:putfield        #25  <Field ChangeBounds$ViewBounds mViewBounds>
	//   12   22:return          
	}
}
