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
		android.widget.DatePicker.OnDateChangedListener ondatechangedlistener = mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field android.widget.DatePicker$OnDateChangedListener mListener>
	//    2    4:astore          5
		if(ondatechangedlistener != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          23
			ondatechangedlistener.onDateChanged(datepicker, i, j, k);
	//    5   11:aload           5
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:invokeinterface #28  <Method void android.widget.DatePicker$OnDateChangedListener.onDateChanged(DatePicker, int, int, int)>
		datepicker = ((DatePicker) (mYearChanged));
	//   11   23:aload_0         
	//   12   24:getfield        #30  <Field InverseBindingListener mYearChanged>
	//   13   27:astore_1        
		if(datepicker != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          38
			((InverseBindingListener) (datepicker)).onChange();
	//   16   32:aload_1         
	//   17   33:invokeinterface #35  <Method void InverseBindingListener.onChange()>
		datepicker = ((DatePicker) (mMonthChanged));
	//   18   38:aload_0         
	//   19   39:getfield        #37  <Field InverseBindingListener mMonthChanged>
	//   20   42:astore_1        
		if(datepicker != null)
	//*  21   43:aload_1         
	//*  22   44:ifnull          53
			((InverseBindingListener) (datepicker)).onChange();
	//   23   47:aload_1         
	//   24   48:invokeinterface #35  <Method void InverseBindingListener.onChange()>
		datepicker = ((DatePicker) (mDayChanged));
	//   25   53:aload_0         
	//   26   54:getfield        #39  <Field InverseBindingListener mDayChanged>
	//   27   57:astore_1        
		if(datepicker != null)
	//*  28   58:aload_1         
	//*  29   59:ifnull          68
			((InverseBindingListener) (datepicker)).onChange();
	//   30   62:aload_1         
	//   31   63:invokeinterface #35  <Method void InverseBindingListener.onChange()>
	//   32   68:return          
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
