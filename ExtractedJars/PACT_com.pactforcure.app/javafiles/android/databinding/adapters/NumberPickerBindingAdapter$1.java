// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.NumberPicker;

// Referenced classes of package android.databinding.adapters:
//			NumberPickerBindingAdapter

static final class NumberPickerBindingAdapter$1
	implements android.widget.tener
{

	public void onValueChange(NumberPicker numberpicker, int i, int j)
	{
		if(val$listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field android.widget.NumberPicker$OnValueChangeListener val$listener>
	//*   2    4:ifnull          19
			val$listener.onValueChange(numberpicker, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field android.widget.NumberPicker$OnValueChangeListener val$listener>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #29  <Method void android.widget.NumberPicker$OnValueChangeListener.onValueChange(NumberPicker, int, int)>
		val$attrChange.onChange();
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field InverseBindingListener val$attrChange>
	//   11   23:invokeinterface #34  <Method void InverseBindingListener.onChange()>
	//   12   28:return          
	}

	final InverseBindingListener val$attrChange;
	final android.widget.tener val$listener;

	NumberPickerBindingAdapter$1(android.widget.tener tener, InverseBindingListener inversebindinglistener)
	{
		val$listener = tener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field android.widget.NumberPicker$OnValueChangeListener val$listener>
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
