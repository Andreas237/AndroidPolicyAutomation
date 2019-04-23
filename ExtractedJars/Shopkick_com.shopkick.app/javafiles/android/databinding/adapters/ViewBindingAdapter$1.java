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
		ViewAttachedToWindow viewattachedtowindow = val$attach;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ViewBindingAdapter$OnViewAttachedToWindow val$attach>
	//    2    4:astore_2        
		if(viewattachedtowindow != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			viewattachedtowindow.onViewAttachedToWindow(view);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method void ViewBindingAdapter$OnViewAttachedToWindow.onViewAttachedToWindow(View)>
	//    8   16:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		ViewDetachedFromWindow viewdetachedfromwindow = val$detach;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewBindingAdapter$OnViewDetachedFromWindow val$detach>
	//    2    4:astore_2        
		if(viewdetachedfromwindow != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			viewdetachedfromwindow.onViewDetachedFromWindow(view);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #36  <Method void ViewBindingAdapter$OnViewDetachedFromWindow.onViewDetachedFromWindow(View)>
	//    8   16:return          
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
