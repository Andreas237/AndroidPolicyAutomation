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
		a.a(TextInputLayout.a(a) ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextInputLayout a>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field TextInputLayout a>
	//    4    8:invokestatic    #26  <Method boolean TextInputLayout.a(TextInputLayout)>
	//    5   11:iconst_1        
	//    6   12:ixor            
	//    7   13:invokevirtual   #29  <Method void TextInputLayout.a(boolean)>
		if(a.c)
	//*   8   16:aload_0         
	//*   9   17:getfield        #17  <Field TextInputLayout a>
	//*  10   20:getfield        #33  <Field boolean TextInputLayout.c>
	//*  11   23:ifeq            39
			a.a(editable.length());
	//   12   26:aload_0         
	//   13   27:getfield        #17  <Field TextInputLayout a>
	//   14   30:aload_1         
	//   15   31:invokeinterface #39  <Method int Editable.length()>
	//   16   36:invokevirtual   #42  <Method void TextInputLayout.a(int)>
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

	final TextInputLayout a;

	TextInputLayout$1(TextInputLayout textinputlayout)
	{
		a = textinputlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TextInputLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
