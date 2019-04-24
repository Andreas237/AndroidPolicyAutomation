// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;

public abstract class ViewEvent
{

	protected ViewEvent(View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		view = view1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field View view>
	//    5    9:return          
	}

	public View view()
	{
		return view;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field View view>
	//    2    4:areturn         
	}

	private final View view;
}
