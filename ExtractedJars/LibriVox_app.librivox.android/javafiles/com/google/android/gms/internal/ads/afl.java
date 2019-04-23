// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class afl
	implements android.content.DialogInterface.OnClickListener
{

	afl(JsPromptResult jspromptresult, EditText edittext)
	{
		a = jspromptresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field JsPromptResult a>
		b = edittext;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field EditText b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		a.confirm(((Object) (b.getText())).toString());
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field JsPromptResult a>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field EditText b>
	//    4    8:invokevirtual   #28  <Method android.text.Editable EditText.getText()>
	//    5   11:invokevirtual   #32  <Method String Object.toString()>
	//    6   14:invokevirtual   #38  <Method void JsPromptResult.confirm(String)>
	//    7   17:return          
	}

	private final JsPromptResult a;
	private final EditText b;
}
