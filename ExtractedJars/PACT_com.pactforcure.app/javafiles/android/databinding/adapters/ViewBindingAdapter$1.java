// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.view.View;

// Referenced classes of package android.databinding.adapters:
//			ViewBindingAdapter

static final class ViewBindingAdapter$1
	implements android.view.ngeListener
{

	public void onViewAttachedToWindow(View view)
	{
		if(val$attach != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ViewBindingAdapter$OnViewAttachedToWindow val$attach>
	//*   2    4:ifnull          17
			val$attach.onViewAttachedToWindow(view);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field ViewBindingAdapter$OnViewAttachedToWindow val$attach>
	//    5   11:aload_1         
	//    6   12:invokeinterface #31  <Method void ViewBindingAdapter$OnViewAttachedToWindow.onViewAttachedToWindow(View)>
	//    7   17:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		if(val$detach != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ViewBindingAdapter$OnViewDetachedFromWindow val$detach>
	//*   2    4:ifnull          17
			val$detach.onViewDetachedFromWindow(view);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field ViewBindingAdapter$OnViewDetachedFromWindow val$detach>
	//    5   11:aload_1         
	//    6   12:invokeinterface #36  <Method void ViewBindingAdapter$OnViewDetachedFromWindow.onViewDetachedFromWindow(View)>
	//    7   17:return          
	}

	final ViewAttachedToWindow val$attach;
	final ViewDetachedFromWindow val$detach;

	ViewBindingAdapter$1(ViewAttachedToWindow viewattachedtowindow, ViewDetachedFromWindow viewdetachedfromwindow)
	{
		val$attach = viewattachedtowindow;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewBindingAdapter$OnViewAttachedToWindow val$attach>
		val$detach = viewdetachedfromwindow;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ViewBindingAdapter$OnViewDetachedFromWindow val$detach>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
