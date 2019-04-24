// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.view.View;
import android.widget.AdapterView;

public class AdapterViewBindingAdapter
{
	public static interface OnItemSelected
	{

		public abstract void onItemSelected(AdapterView adapterview, View view, int i, long l);
	}

	public static class OnItemSelectedComponentListener
		implements android.widget.AdapterView.OnItemSelectedListener
	{

		public void onItemSelected(AdapterView adapterview, View view, int i, long l)
		{
			if(mSelected != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field AdapterViewBindingAdapter$OnItemSelected mSelected>
		//*   2    4:ifnull          21
				mSelected.onItemSelected(adapterview, view, i, l);
		//    3    7:aload_0         
		//    4    8:getfield        #22  <Field AdapterViewBindingAdapter$OnItemSelected mSelected>
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:iload_3         
		//    8   14:lload           4
		//    9   16:invokeinterface #33  <Method void AdapterViewBindingAdapter$OnItemSelected.onItemSelected(AdapterView, View, int, long)>
			if(mAttrChanged != null)
		//*  10   21:aload_0         
		//*  11   22:getfield        #26  <Field InverseBindingListener mAttrChanged>
		//*  12   25:ifnull          37
				mAttrChanged.onChange();
		//   13   28:aload_0         
		//   14   29:getfield        #26  <Field InverseBindingListener mAttrChanged>
		//   15   32:invokeinterface #38  <Method void InverseBindingListener.onChange()>
		//   16   37:return          
		}

		public void onNothingSelected(AdapterView adapterview)
		{
			if(mNothingSelected != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field AdapterViewBindingAdapter$OnNothingSelected mNothingSelected>
		//*   2    4:ifnull          17
				mNothingSelected.onNothingSelected(adapterview);
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field AdapterViewBindingAdapter$OnNothingSelected mNothingSelected>
		//    5   11:aload_1         
		//    6   12:invokeinterface #46  <Method void AdapterViewBindingAdapter$OnNothingSelected.onNothingSelected(AdapterView)>
			if(mAttrChanged != null)
		//*   7   17:aload_0         
		//*   8   18:getfield        #26  <Field InverseBindingListener mAttrChanged>
		//*   9   21:ifnull          33
				mAttrChanged.onChange();
		//   10   24:aload_0         
		//   11   25:getfield        #26  <Field InverseBindingListener mAttrChanged>
		//   12   28:invokeinterface #38  <Method void InverseBindingListener.onChange()>
		//   13   33:return          
		}

		private final InverseBindingListener mAttrChanged;
		private final OnNothingSelected mNothingSelected;
		private final OnItemSelected mSelected;

		public OnItemSelectedComponentListener(OnItemSelected onitemselected, OnNothingSelected onnothingselected, InverseBindingListener inversebindinglistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mSelected = onitemselected;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field AdapterViewBindingAdapter$OnItemSelected mSelected>
			mNothingSelected = onnothingselected;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field AdapterViewBindingAdapter$OnNothingSelected mNothingSelected>
			mAttrChanged = inversebindinglistener;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field InverseBindingListener mAttrChanged>
		//   11   19:return          
		}
	}

	public static interface OnNothingSelected
	{

		public abstract void onNothingSelected(AdapterView adapterview);
	}


	public AdapterViewBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static void setOnItemSelectedListener(AdapterView adapterview, OnItemSelected onitemselected, OnNothingSelected onnothingselected, InverseBindingListener inversebindinglistener)
	{
		if(onitemselected == null && onnothingselected == null && inversebindinglistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       18
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       18
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       18
		{
			adapterview.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (null)));
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #45  <Method void AdapterView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			return;
	//    9   17:return          
		} else
		{
			adapterview.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (new OnItemSelectedComponentListener(onitemselected, onnothingselected, inversebindinglistener))));
	//   10   18:aload_0         
	//   11   19:new             #9   <Class AdapterViewBindingAdapter$OnItemSelectedComponentListener>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:aload_3         
	//   16   26:invokespecial   #48  <Method void AdapterViewBindingAdapter$OnItemSelectedComponentListener(AdapterViewBindingAdapter$OnItemSelected, AdapterViewBindingAdapter$OnNothingSelected, InverseBindingListener)>
	//   17   29:invokevirtual   #45  <Method void AdapterView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			return;
	//   18   32:return          
		}
	}

	public static void setSelectedItemPosition(AdapterView adapterview, int i)
	{
		if(adapterview.getSelectedItemPosition() != i)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #55  <Method int AdapterView.getSelectedItemPosition()>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			adapterview.setSelection(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #59  <Method void AdapterView.setSelection(int)>
	//    7   13:return          
	}
}
