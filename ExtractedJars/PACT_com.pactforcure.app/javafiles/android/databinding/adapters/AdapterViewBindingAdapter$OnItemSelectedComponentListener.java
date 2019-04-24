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
