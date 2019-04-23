// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.CompoundButton;

// Referenced classes of package android.databinding.adapters:
//			CompoundButtonBindingAdapter

static final class CompoundButtonBindingAdapter$1
	implements android.widget.istener
{

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		android.widget.istener istener = val$listener;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.widget.CompoundButton$OnCheckedChangeListener val$listener>
	//    2    4:astore_3        
		if(istener != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			istener.onCheckedChanged(compoundbutton, flag);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokeinterface #29  <Method void android.widget.CompoundButton$OnCheckedChangeListener.onCheckedChanged(CompoundButton, boolean)>
		val$attrChange.onChange();
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field InverseBindingListener val$attrChange>
	//   11   21:invokeinterface #34  <Method void InverseBindingListener.onChange()>
	//   12   26:return          
	}

	final InverseBindingListener val$attrChange;
	final android.widget.istener val$listener;

	CompoundButtonBindingAdapter$1(android.widget.istener istener, InverseBindingListener inversebindinglistener)
	{
		val$listener = istener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field android.widget.CompoundButton$OnCheckedChangeListener val$listener>
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
