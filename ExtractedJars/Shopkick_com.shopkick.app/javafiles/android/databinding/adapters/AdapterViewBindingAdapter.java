// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.view.View;
import android.widget.Adapter;
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
			OnItemSelected onitemselected = mSelected;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field AdapterViewBindingAdapter$OnItemSelected mSelected>
		//    2    4:astore          6
			if(onitemselected != null)
		//*   3    6:aload           6
		//*   4    8:ifnull          23
				onitemselected.onItemSelected(adapterview, view, i, l);
		//    5   11:aload           6
		//    6   13:aload_1         
		//    7   14:aload_2         
		//    8   15:iload_3         
		//    9   16:lload           4
		//   10   18:invokeinterface #33  <Method void AdapterViewBindingAdapter$OnItemSelected.onItemSelected(AdapterView, View, int, long)>
			adapterview = ((AdapterView) (mAttrChanged));
		//   11   23:aload_0         
		//   12   24:getfield        #26  <Field InverseBindingListener mAttrChanged>
		//   13   27:astore_1        
			if(adapterview != null)
		//*  14   28:aload_1         
		//*  15   29:ifnull          38
				((InverseBindingListener) (adapterview)).onChange();
		//   16   32:aload_1         
		//   17   33:invokeinterface #38  <Method void InverseBindingListener.onChange()>
		//   18   38:return          
		}

		public void onNothingSelected(AdapterView adapterview)
		{
			OnNothingSelected onnothingselected = mNothingSelected;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field AdapterViewBindingAdapter$OnNothingSelected mNothingSelected>
		//    2    4:astore_2        
			if(onnothingselected != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          16
				onnothingselected.onNothingSelected(adapterview);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:invokeinterface #46  <Method void AdapterViewBindingAdapter$OnNothingSelected.onNothingSelected(AdapterView)>
			adapterview = ((AdapterView) (mAttrChanged));
		//    8   16:aload_0         
		//    9   17:getfield        #26  <Field InverseBindingListener mAttrChanged>
		//   10   20:astore_1        
			if(adapterview != null)
		//*  11   21:aload_1         
		//*  12   22:ifnull          31
				((InverseBindingListener) (adapterview)).onChange();
		//   13   25:aload_1         
		//   14   26:invokeinterface #38  <Method void InverseBindingListener.onChange()>
		//   15   31:return          
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
	//    1    1:invokespecial   #38  <Method void Object()>
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
	//    8   14:invokevirtual   #51  <Method void AdapterView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
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
	//   16   26:invokespecial   #54  <Method void AdapterViewBindingAdapter$OnItemSelectedComponentListener(AdapterViewBindingAdapter$OnItemSelected, AdapterViewBindingAdapter$OnNothingSelected, InverseBindingListener)>
	//   17   29:invokevirtual   #51  <Method void AdapterView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			return;
	//   18   32:return          
		}
	}

	public static void setSelectedItemPosition(AdapterView adapterview, int i)
	{
		if(adapterview.getSelectedItemPosition() != i)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #60  <Method int AdapterView.getSelectedItemPosition()>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			adapterview.setSelection(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #64  <Method void AdapterView.setSelection(int)>
	//    7   13:return          
	}

	public static void setSelectedItemPosition(AdapterView adapterview, int i, Adapter adapter)
	{
		if(adapter != adapterview.getAdapter())
	//*   0    0:aload_2         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #70  <Method Adapter AdapterView.getAdapter()>
	//*   3    5:if_acmpeq       19
		{
			adapterview.setAdapter(adapter);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #74  <Method void AdapterView.setAdapter(Adapter)>
			adapterview.setSelection(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #64  <Method void AdapterView.setSelection(int)>
			return;
	//   10   18:return          
		}
		if(adapterview.getSelectedItemPosition() != i)
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #60  <Method int AdapterView.getSelectedItemPosition()>
	//*  13   23:iload_1         
	//*  14   24:icmpeq          32
			adapterview.setSelection(i);
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:invokevirtual   #64  <Method void AdapterView.setSelection(int)>
	//   18   32:return          
	}

	public static void setSelection(AdapterView adapterview, int i)
	{
		setSelectedItemPosition(adapterview, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #76  <Method void setSelectedItemPosition(AdapterView, int)>
	//    3    5:return          
	}

	public static void setSelection(AdapterView adapterview, int i, Adapter adapter)
	{
		setSelectedItemPosition(adapterview, i, adapter);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #78  <Method void setSelectedItemPosition(AdapterView, int, Adapter)>
	//    4    6:return          
	}
}
