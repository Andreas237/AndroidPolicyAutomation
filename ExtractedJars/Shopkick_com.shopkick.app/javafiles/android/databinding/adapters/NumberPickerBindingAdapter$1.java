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
		android.widget.tener tener = val$listener;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.widget.NumberPicker$OnValueChangeListener val$listener>
	//    2    4:astore          4
		if(tener != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
			tener.onValueChange(numberpicker, i, j);
	//    5   11:aload           4
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokeinterface #29  <Method void android.widget.NumberPicker$OnValueChangeListener.onValueChange(NumberPicker, int, int)>
		val$attrChange.onChange();
	//   10   21:aload_0         
	//   11   22:getfield        #21  <Field InverseBindingListener val$attrChange>
	//   12   25:invokeinterface #34  <Method void InverseBindingListener.onChange()>
	//   13   30:return          
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
