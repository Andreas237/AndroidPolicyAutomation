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
		android.widget.tener tener = val$listener;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field android.widget.TimePicker$OnTimeChangedListener val$listener>
	//    2    4:astore          4
		if(tener != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
			tener.onTimeChanged(timepicker, i, j);
	//    5   11:aload           4
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokeinterface #32  <Method void android.widget.TimePicker$OnTimeChangedListener.onTimeChanged(TimePicker, int, int)>
		timepicker = ((TimePicker) (val$hourChange));
	//   10   21:aload_0         
	//   11   22:getfield        #22  <Field InverseBindingListener val$hourChange>
	//   12   25:astore_1        
		if(timepicker != null)
	//*  13   26:aload_1         
	//*  14   27:ifnull          36
			((InverseBindingListener) (timepicker)).onChange();
	//   15   30:aload_1         
	//   16   31:invokeinterface #37  <Method void InverseBindingListener.onChange()>
		timepicker = ((TimePicker) (val$minuteChange));
	//   17   36:aload_0         
	//   18   37:getfield        #24  <Field InverseBindingListener val$minuteChange>
	//   19   40:astore_1        
		if(timepicker != null)
	//*  20   41:aload_1         
	//*  21   42:ifnull          51
			((InverseBindingListener) (timepicker)).onChange();
	//   22   45:aload_1         
	//   23   46:invokeinterface #37  <Method void InverseBindingListener.onChange()>
	//   24   51:return          
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
