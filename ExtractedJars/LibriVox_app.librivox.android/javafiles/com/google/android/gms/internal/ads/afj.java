// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class afj
	implements android.content.DialogInterface.OnCancelListener
{

	afj(JsPromptResult jspromptresult)
	{
		a = jspromptresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field JsPromptResult a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onCancel(DialogInterface dialoginterface)
	{
		a.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field JsPromptResult a>
	//    2    4:invokevirtual   #23  <Method void JsPromptResult.cancel()>
	//    3    7:return          
	}

	private final JsPromptResult a;
}
