// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.NumberPicker;

public class NumberPickerBindingAdapter
{

	public NumberPickerBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static void setListeners(NumberPicker numberpicker, android.widget.NumberPicker.OnValueChangeListener onvaluechangelistener, InverseBindingListener inversebindinglistener)
	{
		if(inversebindinglistener == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			numberpicker.setOnValueChangedListener(onvaluechangelistener);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #41  <Method void NumberPicker.setOnValueChangedListener(android.widget.NumberPicker$OnValueChangeListener)>
			return;
	//    5    9:return          
		} else
		{
			numberpicker.setOnValueChangedListener(new android.widget.NumberPicker.OnValueChangeListener(onvaluechangelistener, inversebindinglistener) {

				public void onValueChange(NumberPicker numberpicker1, int i, int j)
				{
					android.widget.NumberPicker.OnValueChangeListener onvaluechangelistener1 = listener;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field android.widget.NumberPicker$OnValueChangeListener val$listener>
				//    2    4:astore          4
					if(onvaluechangelistener1 != null)
				//*   3    6:aload           4
				//*   4    8:ifnull          21
						onvaluechangelistener1.onValueChange(numberpicker1, i, j);
				//    5   11:aload           4
				//    6   13:aload_1         
				//    7   14:iload_2         
				//    8   15:iload_3         
				//    9   16:invokeinterface #29  <Method void android.widget.NumberPicker$OnValueChangeListener.onValueChange(NumberPicker, int, int)>
					attrChange.onChange();
				//   10   21:aload_0         
				//   11   22:getfield        #21  <Field InverseBindingListener val$attrChange>
				//   12   25:invokeinterface #34  <Method void InverseBindingListener.onChange()>
				//   13   30:return          
				}

				final InverseBindingListener val$attrChange;
				final android.widget.NumberPicker.OnValueChangeListener val$listener;

			
			{
				listener = onvaluechangelistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field android.widget.NumberPicker$OnValueChangeListener val$listener>
				attrChange = inversebindinglistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field InverseBindingListener val$attrChange>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   10:aload_0         
	//    7   11:new             #6   <Class NumberPickerBindingAdapter$1>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #44  <Method void NumberPickerBindingAdapter$1(android.widget.NumberPicker$OnValueChangeListener, InverseBindingListener)>
	//   12   20:invokevirtual   #41  <Method void NumberPicker.setOnValueChangedListener(android.widget.NumberPicker$OnValueChangeListener)>
			return;
	//   13   23:return          
		}
	}

	public static void setValue(NumberPicker numberpicker, int i)
	{
		if(numberpicker.getValue() != i)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #51  <Method int NumberPicker.getValue()>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			numberpicker.setValue(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #54  <Method void NumberPicker.setValue(int)>
	//    7   13:return          
	}
}
