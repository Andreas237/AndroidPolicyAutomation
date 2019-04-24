// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package android.databinding.adapters:
//			TextViewBindingAdapter

static final class TextViewBindingAdapter$1
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		if(val$after != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field TextViewBindingAdapter$AfterTextChanged val$after>
	//*   2    4:ifnull          17
			val$after.afterTextChanged(editable);
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field TextViewBindingAdapter$AfterTextChanged val$after>
	//    5   11:aload_1         
	//    6   12:invokeinterface #39  <Method void TextViewBindingAdapter$AfterTextChanged.afterTextChanged(Editable)>
	//    7   17:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		if(val$before != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field TextViewBindingAdapter$BeforeTextChanged val$before>
	//*   2    4:ifnull          21
			val$before.beforeTextChanged(charsequence, i, j, k);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field TextViewBindingAdapter$BeforeTextChanged val$before>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokeinterface #45  <Method void TextViewBindingAdapter$BeforeTextChanged.beforeTextChanged(CharSequence, int, int, int)>
	//   10   21:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		if(val$on != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field TextViewBindingAdapter$OnTextChanged val$on>
	//*   2    4:ifnull          21
			val$on.onTextChanged(charsequence, i, j, k);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field TextViewBindingAdapter$OnTextChanged val$on>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokeinterface #50  <Method void TextViewBindingAdapter$OnTextChanged.onTextChanged(CharSequence, int, int, int)>
		if(val$textAttrChanged != null)
	//*  10   21:aload_0         
	//*  11   22:getfield        #27  <Field InverseBindingListener val$textAttrChanged>
	//*  12   25:ifnull          37
			val$textAttrChanged.onChange();
	//   13   28:aload_0         
	//   14   29:getfield        #27  <Field InverseBindingListener val$textAttrChanged>
	//   15   32:invokeinterface #55  <Method void InverseBindingListener.onChange()>
	//   16   37:return          
	}

	final terTextChanged val$after;
	final foreTextChanged val$before;
	final TextChanged val$on;
	final InverseBindingListener val$textAttrChanged;

	TextViewBindingAdapter$1(foreTextChanged foretextchanged, TextChanged textchanged, InverseBindingListener inversebindinglistener, terTextChanged tertextchanged)
	{
		val$before = foretextchanged;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field TextViewBindingAdapter$BeforeTextChanged val$before>
		val$on = textchanged;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field TextViewBindingAdapter$OnTextChanged val$on>
		val$textAttrChanged = inversebindinglistener;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field InverseBindingListener val$textAttrChanged>
		val$after = tertextchanged;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field TextViewBindingAdapter$AfterTextChanged val$after>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
