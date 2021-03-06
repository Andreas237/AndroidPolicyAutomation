// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.DatePicker;

// Referenced classes of package android.databinding.adapters:
//			ListenerUtil

public class DatePickerBindingAdapter
{
	private static class DateChangedListener
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

		private DateChangedListener()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}


	public DatePickerBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static void setListeners(DatePicker datepicker, int i, int j, int k, android.widget.DatePicker.OnDateChangedListener ondatechangedlistener, InverseBindingListener inversebindinglistener, InverseBindingListener inversebindinglistener1, InverseBindingListener inversebindinglistener2)
	{
		int l = i;
	//    0    0:iload_1         
	//    1    1:istore          8
		if(i == 0)
	//*   2    3:iload_1         
	//*   3    4:ifne            13
			l = datepicker.getYear();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #40  <Method int DatePicker.getYear()>
	//    6   11:istore          8
		i = k;
	//    7   13:iload_3         
	//    8   14:istore_1        
		if(k == 0)
	//*   9   15:iload_3         
	//*  10   16:ifne            24
			i = datepicker.getDayOfMonth();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #42  <Method int DatePicker.getDayOfMonth()>
	//   13   23:istore_1        
		if(inversebindinglistener == null && inversebindinglistener1 == null && inversebindinglistener2 == null)
	//*  14   24:aload           5
	//*  15   26:ifnonnull       50
	//*  16   29:aload           6
	//*  17   31:ifnonnull       50
	//*  18   34:aload           7
	//*  19   36:ifnonnull       50
		{
			datepicker.init(l, j, i, ondatechangedlistener);
	//   20   39:aload_0         
	//   21   40:iload           8
	//   22   42:iload_2         
	//   23   43:iload_1         
	//   24   44:aload           4
	//   25   46:invokevirtual   #46  <Method void DatePicker.init(int, int, int, android.widget.DatePicker$OnDateChangedListener)>
			return;
	//   26   49:return          
		}
		DateChangedListener datechangedlistener1 = (DateChangedListener)ListenerUtil.getListener(((android.view.View) (datepicker)), com.android.databinding.library.baseAdapters.R.id.onDateChanged);
	//   27   50:aload_0         
	//   28   51:getstatic       #52  <Field int com.android.databinding.library.baseAdapters.R$id.onDateChanged>
	//   29   54:invokestatic    #58  <Method Object ListenerUtil.getListener(android.view.View, int)>
	//   30   57:checkcast       #8   <Class DatePickerBindingAdapter$DateChangedListener>
	//   31   60:astore          10
		DateChangedListener datechangedlistener = datechangedlistener1;
	//   32   62:aload           10
	//   33   64:astore          9
		if(datechangedlistener1 == null)
	//*  34   66:aload           10
	//*  35   68:ifnonnull       91
		{
			datechangedlistener = new DateChangedListener();
	//   36   71:new             #8   <Class DatePickerBindingAdapter$DateChangedListener>
	//   37   74:dup             
	//   38   75:aconst_null     
	//   39   76:invokespecial   #61  <Method void DatePickerBindingAdapter$DateChangedListener(DatePickerBindingAdapter$1)>
	//   40   79:astore          9
			ListenerUtil.trackListener(((android.view.View) (datepicker)), ((Object) (datechangedlistener)), com.android.databinding.library.baseAdapters.R.id.onDateChanged);
	//   41   81:aload_0         
	//   42   82:aload           9
	//   43   84:getstatic       #52  <Field int com.android.databinding.library.baseAdapters.R$id.onDateChanged>
	//   44   87:invokestatic    #65  <Method Object ListenerUtil.trackListener(android.view.View, Object, int)>
	//   45   90:pop             
		}
		datechangedlistener.setListeners(ondatechangedlistener, inversebindinglistener, inversebindinglistener1, inversebindinglistener2);
	//   46   91:aload           9
	//   47   93:aload           4
	//   48   95:aload           5
	//   49   97:aload           6
	//   50   99:aload           7
	//   51  101:invokevirtual   #68  <Method void DatePickerBindingAdapter$DateChangedListener.setListeners(android.widget.DatePicker$OnDateChangedListener, InverseBindingListener, InverseBindingListener, InverseBindingListener)>
		datepicker.init(l, j, i, ((android.widget.DatePicker.OnDateChangedListener) (datechangedlistener)));
	//   52  104:aload_0         
	//   53  105:iload           8
	//   54  107:iload_2         
	//   55  108:iload_1         
	//   56  109:aload           9
	//   57  111:invokevirtual   #46  <Method void DatePicker.init(int, int, int, android.widget.DatePicker$OnDateChangedListener)>
	//   58  114:return          
	}
}
