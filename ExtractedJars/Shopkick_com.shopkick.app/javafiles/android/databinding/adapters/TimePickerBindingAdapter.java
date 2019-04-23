// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.TimePicker;

public class TimePickerBindingAdapter
{

	public TimePickerBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static int getHour(TimePicker timepicker)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
			return timepicker.getHour();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #31  <Method int TimePicker.getHour()>
	//    5   12:ireturn         
		timepicker = ((TimePicker) (timepicker.getCurrentHour()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #35  <Method Integer TimePicker.getCurrentHour()>
	//    8   17:astore_0        
		if(timepicker == null)
	//*   9   18:aload_0         
	//*  10   19:ifnonnull       24
			return 0;
	//   11   22:iconst_0        
	//   12   23:ireturn         
		else
			return ((Integer) (timepicker)).intValue();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #40  <Method int Integer.intValue()>
	//   15   28:ireturn         
	}

	public static int getMinute(TimePicker timepicker)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
			return timepicker.getMinute();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #45  <Method int TimePicker.getMinute()>
	//    5   12:ireturn         
		timepicker = ((TimePicker) (timepicker.getCurrentMinute()));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #48  <Method Integer TimePicker.getCurrentMinute()>
	//    8   17:astore_0        
		if(timepicker == null)
	//*   9   18:aload_0         
	//*  10   19:ifnonnull       24
			return 0;
	//   11   22:iconst_0        
	//   12   23:ireturn         
		else
			return ((Integer) (timepicker)).intValue();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #40  <Method int Integer.intValue()>
	//   15   28:ireturn         
	}

	public static void setHour(TimePicker timepicker, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          22
		{
			if(timepicker.getHour() != i)
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #31  <Method int TimePicker.getHour()>
	//*   5   12:iload_1         
	//*   6   13:icmpeq          41
			{
				timepicker.setHour(i);
	//    7   16:aload_0         
	//    8   17:iload_1         
	//    9   18:invokevirtual   #54  <Method void TimePicker.setHour(int)>
				return;
	//   10   21:return          
			}
		} else
		if(timepicker.getCurrentHour().intValue() != i)
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #35  <Method Integer TimePicker.getCurrentHour()>
	//*  13   26:invokevirtual   #40  <Method int Integer.intValue()>
	//*  14   29:iload_1         
	//*  15   30:icmpeq          41
			timepicker.setCurrentHour(Integer.valueOf(i));
	//   16   33:aload_0         
	//   17   34:iload_1         
	//   18   35:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//   19   38:invokevirtual   #62  <Method void TimePicker.setCurrentHour(Integer)>
	//   20   41:return          
	}

	public static void setListeners(TimePicker timepicker, android.widget.TimePicker.OnTimeChangedListener ontimechangedlistener, InverseBindingListener inversebindinglistener, InverseBindingListener inversebindinglistener1)
	{
		if(inversebindinglistener == null && inversebindinglistener1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       14
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       14
		{
			timepicker.setOnTimeChangedListener(ontimechangedlistener);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #73  <Method void TimePicker.setOnTimeChangedListener(android.widget.TimePicker$OnTimeChangedListener)>
			return;
	//    7   13:return          
		} else
		{
			timepicker.setOnTimeChangedListener(new android.widget.TimePicker.OnTimeChangedListener(ontimechangedlistener, inversebindinglistener, inversebindinglistener1) {

				public void onTimeChanged(TimePicker timepicker1, int i, int j)
				{
					android.widget.TimePicker.OnTimeChangedListener ontimechangedlistener1 = listener;
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field android.widget.TimePicker$OnTimeChangedListener val$listener>
				//    2    4:astore          4
					if(ontimechangedlistener1 != null)
				//*   3    6:aload           4
				//*   4    8:ifnull          21
						ontimechangedlistener1.onTimeChanged(timepicker1, i, j);
				//    5   11:aload           4
				//    6   13:aload_1         
				//    7   14:iload_2         
				//    8   15:iload_3         
				//    9   16:invokeinterface #32  <Method void android.widget.TimePicker$OnTimeChangedListener.onTimeChanged(TimePicker, int, int)>
					timepicker1 = ((TimePicker) (hourChange));
				//   10   21:aload_0         
				//   11   22:getfield        #22  <Field InverseBindingListener val$hourChange>
				//   12   25:astore_1        
					if(timepicker1 != null)
				//*  13   26:aload_1         
				//*  14   27:ifnull          36
						((InverseBindingListener) (timepicker1)).onChange();
				//   15   30:aload_1         
				//   16   31:invokeinterface #37  <Method void InverseBindingListener.onChange()>
					timepicker1 = ((TimePicker) (minuteChange));
				//   17   36:aload_0         
				//   18   37:getfield        #24  <Field InverseBindingListener val$minuteChange>
				//   19   40:astore_1        
					if(timepicker1 != null)
				//*  20   41:aload_1         
				//*  21   42:ifnull          51
						((InverseBindingListener) (timepicker1)).onChange();
				//   22   45:aload_1         
				//   23   46:invokeinterface #37  <Method void InverseBindingListener.onChange()>
				//   24   51:return          
				}

				final InverseBindingListener val$hourChange;
				final android.widget.TimePicker.OnTimeChangedListener val$listener;
				final InverseBindingListener val$minuteChange;

			
			{
				listener = ontimechangedlistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field android.widget.TimePicker$OnTimeChangedListener val$listener>
				hourChange = inversebindinglistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field InverseBindingListener val$hourChange>
				minuteChange = inversebindinglistener1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field InverseBindingListener val$minuteChange>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    8   14:aload_0         
	//    9   15:new             #6   <Class TimePickerBindingAdapter$1>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:invokespecial   #76  <Method void TimePickerBindingAdapter$1(android.widget.TimePicker$OnTimeChangedListener, InverseBindingListener, InverseBindingListener)>
	//   15   25:invokevirtual   #73  <Method void TimePicker.setOnTimeChangedListener(android.widget.TimePicker$OnTimeChangedListener)>
			return;
	//   16   28:return          
		}
	}

	public static void setMinute(TimePicker timepicker, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          22
		{
			if(timepicker.getMinute() != i)
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #45  <Method int TimePicker.getMinute()>
	//*   5   12:iload_1         
	//*   6   13:icmpeq          41
			{
				timepicker.setMinute(i);
	//    7   16:aload_0         
	//    8   17:iload_1         
	//    9   18:invokevirtual   #79  <Method void TimePicker.setMinute(int)>
				return;
	//   10   21:return          
			}
		} else
		if(timepicker.getCurrentMinute().intValue() != i)
	//*  11   22:aload_0         
	//*  12   23:invokevirtual   #48  <Method Integer TimePicker.getCurrentMinute()>
	//*  13   26:invokevirtual   #40  <Method int Integer.intValue()>
	//*  14   29:iload_1         
	//*  15   30:icmpeq          41
			timepicker.setCurrentHour(Integer.valueOf(i));
	//   16   33:aload_0         
	//   17   34:iload_1         
	//   18   35:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//   19   38:invokevirtual   #62  <Method void TimePicker.setCurrentHour(Integer)>
	//   20   41:return          
	}
}
