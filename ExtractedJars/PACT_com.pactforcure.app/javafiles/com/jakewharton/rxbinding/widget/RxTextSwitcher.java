// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.TextSwitcher;
import rx.functions.Action1;

public final class RxTextSwitcher
{

	private RxTextSwitcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		throw new AssertionError("No instances.");
	//    2    4:new             #14  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #16  <String "No instances.">
	//    5   10:invokespecial   #19  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static Action1 currentText(TextSwitcher textswitcher)
	{
		return new Action1(textswitcher) {

			public void call(CharSequence charsequence)
			{
				view.setCurrentText(charsequence);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field TextSwitcher val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #29  <Method void TextSwitcher.setCurrentText(CharSequence)>
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

			
			{
				view = textswitcher;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TextSwitcher val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class RxTextSwitcher$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void RxTextSwitcher$2(TextSwitcher)>
	//    4    8:areturn         
	}

	public static Action1 text(TextSwitcher textswitcher)
	{
		return new Action1(textswitcher) {

			public void call(CharSequence charsequence)
			{
				view.setText(charsequence);
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

			
			{
				view = textswitcher;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TextSwitcher val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class RxTextSwitcher$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void RxTextSwitcher$1(TextSwitcher)>
	//    4    8:areturn         
	}
}
