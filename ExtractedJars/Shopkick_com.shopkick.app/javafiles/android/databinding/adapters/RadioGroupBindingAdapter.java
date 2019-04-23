// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.RadioGroup;

public class RadioGroupBindingAdapter
{

	public RadioGroupBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static void setCheckedButton(RadioGroup radiogroup, int i)
	{
		if(i != radiogroup.getCheckedRadioButtonId())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #31  <Method int RadioGroup.getCheckedRadioButtonId()>
	//*   3    5:icmpeq          13
			radiogroup.check(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #35  <Method void RadioGroup.check(int)>
	//    7   13:return          
	}

	public static void setListeners(RadioGroup radiogroup, android.widget.RadioGroup.OnCheckedChangeListener oncheckedchangelistener, InverseBindingListener inversebindinglistener)
	{
		if(inversebindinglistener == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			radiogroup.setOnCheckedChangeListener(oncheckedchangelistener);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #46  <Method void RadioGroup.setOnCheckedChangeListener(android.widget.RadioGroup$OnCheckedChangeListener)>
			return;
	//    5    9:return          
		} else
		{
			radiogroup.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener(oncheckedchangelistener, inversebindinglistener) {

				public void onCheckedChanged(RadioGroup radiogroup1, int i)
				{
					android.widget.RadioGroup.OnCheckedChangeListener oncheckedchangelistener1 = listener;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field android.widget.RadioGroup$OnCheckedChangeListener val$listener>
				//    2    4:astore_3        
					if(oncheckedchangelistener1 != null)
				//*   3    5:aload_3         
				//*   4    6:ifnull          17
						oncheckedchangelistener1.onCheckedChanged(radiogroup1, i);
				//    5    9:aload_3         
				//    6   10:aload_1         
				//    7   11:iload_2         
				//    8   12:invokeinterface #29  <Method void android.widget.RadioGroup$OnCheckedChangeListener.onCheckedChanged(RadioGroup, int)>
					attrChange.onChange();
				//    9   17:aload_0         
				//   10   18:getfield        #21  <Field InverseBindingListener val$attrChange>
				//   11   21:invokeinterface #34  <Method void InverseBindingListener.onChange()>
				//   12   26:return          
				}

				final InverseBindingListener val$attrChange;
				final android.widget.RadioGroup.OnCheckedChangeListener val$listener;

			
			{
				listener = oncheckedchangelistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field android.widget.RadioGroup$OnCheckedChangeListener val$listener>
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
	//    7   11:new             #6   <Class RadioGroupBindingAdapter$1>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #49  <Method void RadioGroupBindingAdapter$1(android.widget.RadioGroup$OnCheckedChangeListener, InverseBindingListener)>
	//   12   20:invokevirtual   #46  <Method void RadioGroup.setOnCheckedChangeListener(android.widget.RadioGroup$OnCheckedChangeListener)>
			return;
	//   13   23:return          
		}
	}
}
