// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.TimePicker;

// Referenced classes of package android.databinding.adapters:
//			TimePickerBindingAdapter

static final class TimePickerBindingAdapter$1
	implements android.widget.tener
{

	public void onTimeChanged(TimePicker timepicker, int i, int j)
	{
		if(val$listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field android.widget.TimePicker$OnTimeChangedListener val$listener>
	//*   2    4:ifnull          19
			val$listener.onTimeChanged(timepicker, i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field android.widget.TimePicker$OnTimeChangedListener val$listener>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #32  <Method void android.widget.TimePicker$OnTimeChangedListener.onTimeChanged(TimePicker, int, int)>
		if(val$hourChange != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #22  <Field InverseBindingListener val$hourChange>
	//*  11   23:ifnull          35
			val$hourChange.onChange();
	//   12   26:aload_0         
	//   13   27:getfield        #22  <Field InverseBindingListener val$hourChange>
	//   14   30:invokeinterface #37  <Method void InverseBindingListener.onChange()>
		if(val$minuteChange != null)
	//*  15   35:aload_0         
	//*  16   36:getfield        #24  <Field InverseBindingListener val$minuteChange>
	//*  17   39:ifnull          51
			val$minuteChange.onChange();
	//   18   42:aload_0         
	//   19   43:getfield        #24  <Field InverseBindingListener val$minuteChange>
	//   20   46:invokeinterface #37  <Method void InverseBindingListener.onChange()>
	//   21   51:return          
	}

	final InverseBindingListener val$hourChange;
	final android.widget.tener val$listener;
	final InverseBindingListener val$minuteChange;

	TimePickerBindingAdapter$1(android.widget.tener tener, InverseBindingListener inversebindinglistener, InverseBindingListener inversebindinglistener1)
	{
		val$listener = tener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field android.widget.TimePicker$OnTimeChangedListener val$listener>
		val$hourChange = inversebindinglistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field InverseBindingListener val$hourChange>
		val$minuteChange = inversebindinglistener1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field InverseBindingListener val$minuteChange>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
