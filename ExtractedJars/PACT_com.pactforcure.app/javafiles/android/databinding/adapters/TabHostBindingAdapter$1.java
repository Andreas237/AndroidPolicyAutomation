// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;

// Referenced classes of package android.databinding.adapters:
//			TabHostBindingAdapter

static final class TabHostBindingAdapter$1
	implements android.widget.ner
{

	public void onTabChanged(String s)
	{
		if(val$listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field android.widget.TabHost$OnTabChangeListener val$listener>
	//*   2    4:ifnull          17
			val$listener.onTabChanged(s);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field android.widget.TabHost$OnTabChangeListener val$listener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #29  <Method void android.widget.TabHost$OnTabChangeListener.onTabChanged(String)>
		val$attrChange.onChange();
	//    7   17:aload_0         
	//    8   18:getfield        #21  <Field InverseBindingListener val$attrChange>
	//    9   21:invokeinterface #34  <Method void InverseBindingListener.onChange()>
	//   10   26:return          
	}

	final InverseBindingListener val$attrChange;
	final android.widget.ner val$listener;

	TabHostBindingAdapter$1(android.widget.ner ner, InverseBindingListener inversebindinglistener)
	{
		val$listener = ner;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field android.widget.TabHost$OnTabChangeListener val$listener>
		val$attrChange = inversebindinglistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field InverseBindingListener val$attrChange>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
