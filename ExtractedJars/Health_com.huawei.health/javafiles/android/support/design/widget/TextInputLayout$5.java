// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

class TextInputLayout$5
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		TextInputLayout textinputlayout = b;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextInputLayout b>
	//    2    4:astore_3        
		boolean flag;
		if(!TextInputLayout.access$000(b))
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field TextInputLayout b>
	//*   5    9:invokestatic    #27  <Method boolean TextInputLayout.access$000(TextInputLayout)>
	//*   6   12:ifne            20
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore_2        
		else
	//*   9   17:goto            22
			flag = false;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		textinputlayout.updateLabelState(flag);
	//   12   22:aload_3         
	//   13   23:iload_2         
	//   14   24:invokevirtual   #31  <Method void TextInputLayout.updateLabelState(boolean)>
		if(b.mCounterEnabled)
	//*  15   27:aload_0         
	//*  16   28:getfield        #17  <Field TextInputLayout b>
	//*  17   31:getfield        #35  <Field boolean TextInputLayout.mCounterEnabled>
	//*  18   34:ifeq            50
			b.updateCounter(editable.length());
	//   19   37:aload_0         
	//   20   38:getfield        #17  <Field TextInputLayout b>
	//   21   41:aload_1         
	//   22   42:invokeinterface #41  <Method int Editable.length()>
	//   23   47:invokevirtual   #45  <Method void TextInputLayout.updateCounter(int)>
	//   24   50:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	final TextInputLayout b;

	TextInputLayout$5(TextInputLayout textinputlayout)
	{
		b = textinputlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TextInputLayout b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
