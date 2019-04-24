// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

class TextInputLayout$1
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		updateLabelState(TextInputLayout.access$000(TextInputLayout.this) ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextInputLayout this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field TextInputLayout this$0>
	//    4    8:invokestatic    #27  <Method boolean TextInputLayout.access$000(TextInputLayout)>
	//    5   11:iconst_1        
	//    6   12:ixor            
	//    7   13:invokevirtual   #31  <Method void TextInputLayout.updateLabelState(boolean)>
		if(mCounterEnabled)
	//*   8   16:aload_0         
	//*   9   17:getfield        #17  <Field TextInputLayout this$0>
	//*  10   20:getfield        #35  <Field boolean TextInputLayout.mCounterEnabled>
	//*  11   23:ifeq            39
			updateCounter(editable.length());
	//   12   26:aload_0         
	//   13   27:getfield        #17  <Field TextInputLayout this$0>
	//   14   30:aload_1         
	//   15   31:invokeinterface #41  <Method int Editable.length()>
	//   16   36:invokevirtual   #45  <Method void TextInputLayout.updateCounter(int)>
	//   17   39:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	final TextInputLayout this$0;

	TextInputLayout$1()
	{
		this$0 = TextInputLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TextInputLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
