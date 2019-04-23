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
		ChildViewAdded childviewadded = val$added;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ViewGroupBindingAdapter$OnChildViewAdded val$added>
	//    2    4:astore_3        
		if(childviewadded != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			childviewadded.onChildViewAdded(view, view1);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #31  <Method void ViewGroupBindingAdapter$OnChildViewAdded.onChildViewAdded(View, View)>
	//    9   17:return          
	}

	public void onChildViewRemoved(View view, View view1)
	{
		ChildViewRemoved childviewremoved = val$removed;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewGroupBindingAdapter$OnChildViewRemoved val$removed>
	//    2    4:astore_3        
		if(childviewremoved != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			childviewremoved.onChildViewRemoved(view, view1);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #36  <Method void ViewGroupBindingAdapter$OnChildViewRemoved.onChildViewRemoved(View, View)>
	//    9   17:return          
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
