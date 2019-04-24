// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.DatePicker;

// Referenced classes of package android.databinding.adapters:
//			DatePickerBindingAdapter

private static class DatePickerBindingAdapter$DateChangedListener
	implements android.widget.DatePicker.OnDateChangedListener
{

	public void onDateChanged(DatePicker datepicker, int i, int j, int k)
	{
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field android.widget.DatePicker$OnDateChangedListener mListener>
	//*   2    4:ifnull          21
			mListener.onDateChanged(datepicker, i, j, k);
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field android.widget.DatePicker$OnDateChangedListener mListener>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokeinterface #28  <Method void android.widget.DatePicker$OnDateChangedListener.onDateChanged(DatePicker, int, int, int)>
		if(mYearChanged != null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #30  <Field InverseBindingListener mYearChanged>
	//*  12   25:ifnull          37
			mYearChanged.onChange();
	//   13   28:aload_0         
	//   14   29:getfield        #30  <Field InverseBindingListener mYearChanged>
	//   15   32:invokeinterface #35  <Method void InverseBindingListener.onChange()>
		if(mMonthChanged != null)
	//*  16   37:aload_0         
	//*  17   38:getfield        #37  <Field InverseBindingListener mMonthChanged>
	//*  18   41:ifnull          53
			mMonthChanged.onChange();
	//   19   44:aload_0         
	//   20   45:getfield        #37  <Field InverseBindingListener mMonthChanged>
	//   21   48:invokeinterface #35  <Method void InverseBindingListener.onChange()>
		if(mDayChanged != null)
	//*  22   53:aload_0         
	//*  23   54:getfield        #39  <Field InverseBindingListener mDayChanged>
	//*  24   57:ifnull          69
			mDayChanged.onChange();
	//   25   60:aload_0         
	//   26   61:getfield        #39  <Field InverseBindingListener mDayChanged>
	//   27   64:invokeinterface #35  <Method void InverseBindingListener.onChange()>
	//   28   69:return          
	}

	public void setListeners(android.widget.DatePicker.OnDateChangedListener ondatechangedlistener, InverseBindingListener inversebindinglistener, InverseBindingListener inversebindinglistener1, InverseBindingListener inversebindinglistener2)
	{
		mListener = ondatechangedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field android.widget.DatePicker$OnDateChangedListener mListener>
		mYearChanged = inversebindinglistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field InverseBindingListener mYearChanged>
		mMonthChanged = inversebindinglistener1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #37  <Field InverseBindingListener mMonthChanged>
		mDayChanged = inversebindinglistener2;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #39  <Field InverseBindingListener mDayChanged>
	//   12   21:return          
	}

	InverseBindingListener mDayChanged;
	android.widget.DatePicker.OnDateChangedListener mListener;
	InverseBindingListener mMonthChanged;
	InverseBindingListener mYearChanged;

	private DatePickerBindingAdapter$DateChangedListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	DatePickerBindingAdapter$DateChangedListener(DatePickerBindingAdapter._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void DatePickerBindingAdapter$DateChangedListener()>
	//    2    4:return          
	}
}
