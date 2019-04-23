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
		terTextChanged tertextchanged = val$after;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field TextViewBindingAdapter$AfterTextChanged val$after>
	//    2    4:astore_2        
		if(tertextchanged != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			tertextchanged.afterTextChanged(editable);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #39  <Method void TextViewBindingAdapter$AfterTextChanged.afterTextChanged(Editable)>
	//    8   16:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		foreTextChanged foretextchanged = val$before;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TextViewBindingAdapter$BeforeTextChanged val$before>
	//    2    4:astore          5
		if(foretextchanged != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          23
			foretextchanged.beforeTextChanged(charsequence, i, j, k);
	//    5   11:aload           5
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:invokeinterface #45  <Method void TextViewBindingAdapter$BeforeTextChanged.beforeTextChanged(CharSequence, int, int, int)>
	//   11   23:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		TextChanged textchanged = val$on;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TextViewBindingAdapter$OnTextChanged val$on>
	//    2    4:astore          5
		if(textchanged != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          23
			textchanged.onTextChanged(charsequence, i, j, k);
	//    5   11:aload           5
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:invokeinterface #50  <Method void TextViewBindingAdapter$OnTextChanged.onTextChanged(CharSequence, int, int, int)>
		charsequence = ((CharSequence) (val$textAttrChanged));
	//   11   23:aload_0         
	//   12   24:getfield        #27  <Field InverseBindingListener val$textAttrChanged>
	//   13   27:astore_1        
		if(charsequence != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          38
			((InverseBindingListener) (charsequence)).onChange();
	//   16   32:aload_1         
	//   17   33:invokeinterface #55  <Method void InverseBindingListener.onChange()>
	//   18   38:return          
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
