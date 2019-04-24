// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

class TextInputLayout$4
	implements android.view.er
{

	public void onClick(View view)
	{
		TextInputLayout.a(a, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextInputLayout a>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #25  <Method void TextInputLayout.a(TextInputLayout, boolean)>
	//    4    8:return          
	}

	final TextInputLayout a;

	TextInputLayout$4(TextInputLayout textinputlayout)
	{
		a = textinputlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TextInputLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
