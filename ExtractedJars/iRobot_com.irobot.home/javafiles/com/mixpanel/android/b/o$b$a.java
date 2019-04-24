// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

// Referenced classes of package com.mixpanel.android.b:
//			o

private class o$b$a
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		a.c(b);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field o$b a>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field View b>
	//    4    8:invokevirtual   #30  <Method void o$b.c(View)>
	//    5   11:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	final o.b a;
	private final View b;

	public o$b$a(o.b b1, View view)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field o$b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		b = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field View b>
	//    8   14:return          
	}
}
