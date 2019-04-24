// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.CompoundButton;

public class CompoundButtonBindingAdapter
{

	public CompoundButtonBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static void setChecked(CompoundButton compoundbutton, boolean flag)
	{
		if(compoundbutton.isChecked() != flag)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #34  <Method boolean CompoundButton.isChecked()>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			compoundbutton.setChecked(flag);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #37  <Method void CompoundButton.setChecked(boolean)>
	//    7   13:return          
	}

	public static void setListeners(CompoundButton compoundbutton, android.widget.CompoundButton.OnCheckedChangeListener oncheckedchangelistener, InverseBindingListener inversebindinglistener)
	{
		if(inversebindinglistener == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			compoundbutton.setOnCheckedChangeListener(oncheckedchangelistener);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #46  <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
			return;
	//    5    9:return          
		} else
		{
			compoundbutton.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(oncheckedchangelistener, inversebindinglistener) {

				public void onCheckedChanged(CompoundButton compoundbutton1, boolean flag)
				{
					if(listener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field android.widget.CompoundButton$OnCheckedChangeListener val$listener>
				//*   2    4:ifnull          18
						listener.onCheckedChanged(compoundbutton1, flag);
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field android.widget.CompoundButton$OnCheckedChangeListener val$listener>
				//    5   11:aload_1         
				//    6   12:iload_2         
				//    7   13:invokeinterface #29  <Method void android.widget.CompoundButton$OnCheckedChangeListener.onCheckedChanged(CompoundButton, boolean)>
					attrChange.onChange();
				//    8   18:aload_0         
				//    9   19:getfield        #21  <Field InverseBindingListener val$attrChange>
				//   10   22:invokeinterface #34  <Method void InverseBindingListener.onChange()>
				//   11   27:return          
				}

				final InverseBindingListener val$attrChange;
				final android.widget.CompoundButton.OnCheckedChangeListener val$listener;

			
			{
				listener = oncheckedchangelistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field android.widget.CompoundButton$OnCheckedChangeListener val$listener>
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
	//    7   11:new             #6   <Class CompoundButtonBindingAdapter$1>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #49  <Method void CompoundButtonBindingAdapter$1(android.widget.CompoundButton$OnCheckedChangeListener, InverseBindingListener)>
	//   12   20:invokevirtual   #46  <Method void CompoundButton.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
			return;
	//   13   23:return          
		}
	}
}
