// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.TextSwitcher;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			RxTextSwitcher

static final class RxTextSwitcher$1
	implements Action1
{

	public void call(CharSequence charsequence)
	{
		val$view.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field TextSwitcher val$view>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method void TextSwitcher.setText(CharSequence)>
	//    4    8:return          
	}

	public volatile void call(Object obj)
	{
		call((CharSequence)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class CharSequence>
	//    3    5:invokevirtual   #34  <Method void call(CharSequence)>
	//    4    8:return          
	}

	final TextSwitcher val$view;

	RxTextSwitcher$1(TextSwitcher textswitcher)
	{
		val$view = textswitcher;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field TextSwitcher val$view>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
