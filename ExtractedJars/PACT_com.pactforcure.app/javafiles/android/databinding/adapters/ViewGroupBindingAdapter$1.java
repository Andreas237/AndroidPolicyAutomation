// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.view.View;

// Referenced classes of package android.databinding.adapters:
//			ViewGroupBindingAdapter

static final class ViewGroupBindingAdapter$1
	implements android.view.eListener
{

	public void onChildViewAdded(View view, View view1)
	{
		if(val$added != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ViewGroupBindingAdapter$OnChildViewAdded val$added>
	//*   2    4:ifnull          18
			val$added.onChildViewAdded(view, view1);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field ViewGroupBindingAdapter$OnChildViewAdded val$added>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #31  <Method void ViewGroupBindingAdapter$OnChildViewAdded.onChildViewAdded(View, View)>
	//    8   18:return          
	}

	public void onChildViewRemoved(View view, View view1)
	{
		if(val$removed != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ViewGroupBindingAdapter$OnChildViewRemoved val$removed>
	//*   2    4:ifnull          18
			val$removed.onChildViewRemoved(view, view1);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field ViewGroupBindingAdapter$OnChildViewRemoved val$removed>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokeinterface #36  <Method void ViewGroupBindingAdapter$OnChildViewRemoved.onChildViewRemoved(View, View)>
	//    8   18:return          
	}

	final ChildViewAdded val$added;
	final ChildViewRemoved val$removed;

	ViewGroupBindingAdapter$1(ChildViewAdded childviewadded, ChildViewRemoved childviewremoved)
	{
		val$added = childviewadded;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewGroupBindingAdapter$OnChildViewAdded val$added>
		val$removed = childviewremoved;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ViewGroupBindingAdapter$OnChildViewRemoved val$removed>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
