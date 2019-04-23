// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.databinding.adapters:
//			AdapterViewBindingAdapter

public static class AdapterViewBindingAdapter$OnItemSelectedComponentListener
	implements android.widget.AdapterView.OnItemSelectedListener
{

	public void onItemSelected(AdapterView adapterview, View view, int i, long l)
	{
		AdapterViewBindingAdapter.OnItemSelected onitemselected = mSelected;
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
		AdapterViewBindingAdapter.OnNothingSelected onnothingselected = mNothingSelected;
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
	private final AdapterViewBindingAdapter.OnNothingSelected mNothingSelected;
	private final AdapterViewBindingAdapter.OnItemSelected mSelected;

	public AdapterViewBindingAdapter$OnItemSelectedComponentListener(AdapterViewBindingAdapter.OnItemSelected onitemselected, AdapterViewBindingAdapter.OnNothingSelected onnothingselected, InverseBindingListener inversebindinglistener)
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
