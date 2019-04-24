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
		TextInputLayout textinputlayout = TextInputLayout.this;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextInputLayout this$0>
	//    2    4:astore_3        
		boolean flag;
		if(!TextInputLayout.access$000(TextInputLayout.this))
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field TextInputLayout this$0>
	//*   5    9:invokestatic    #27  <Method boolean TextInputLayout.access$000(TextInputLayout)>
	//*   6   12:ifne            46
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore_2        
		else
	//*   9   17:aload_3         
	//*  10   18:iload_2         
	//*  11   19:invokevirtual   #31  <Method void TextInputLayout.updateLabelState(boolean)>
	//*  12   22:aload_0         
	//*  13   23:getfield        #17  <Field TextInputLayout this$0>
	//*  14   26:getfield        #35  <Field boolean TextInputLayout.mCounterEnabled>
	//*  15   29:ifeq            45
	//*  16   32:aload_0         
	//*  17   33:getfield        #17  <Field TextInputLayout this$0>
	//*  18   36:aload_1         
	//*  19   37:invokeinterface #41  <Method int Editable.length()>
	//*  20   42:invokevirtual   #45  <Method void TextInputLayout.updateCounter(int)>
	//*  21   45:return          
			flag = false;
	//   22   46:iconst_0        
	//   23   47:istore_2        
		textinputlayout.updateLabelState(flag);
		if(mCounterEnabled)
			updateCounter(editable.length());
	//*  24   48:goto            17
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
