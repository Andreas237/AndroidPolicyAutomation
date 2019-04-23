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
	//    2    4:astore_2        
		textinputlayout.updateLabelState(TextInputLayout.access$000(textinputlayout) ^ true);
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:invokestatic    #27  <Method boolean TextInputLayout.access$000(TextInputLayout)>
	//    6   10:iconst_1        
	//    7   11:ixor            
	//    8   12:invokevirtual   #31  <Method void TextInputLayout.updateLabelState(boolean)>
		if(counterEnabled)
	//*   9   15:aload_0         
	//*  10   16:getfield        #17  <Field TextInputLayout this$0>
	//*  11   19:getfield        #35  <Field boolean TextInputLayout.counterEnabled>
	//*  12   22:ifeq            38
			updateCounter(editable.length());
	//   13   25:aload_0         
	//   14   26:getfield        #17  <Field TextInputLayout this$0>
	//   15   29:aload_1         
	//   16   30:invokeinterface #41  <Method int Editable.length()>
	//   17   35:invokevirtual   #45  <Method void TextInputLayout.updateCounter(int)>
	//   18   38:return          
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
