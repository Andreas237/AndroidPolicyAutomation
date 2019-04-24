// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.TextView;
import com.jakewharton.rxbinding.internal.Functions;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			TextViewEditorActionEventOnSubscribe, TextViewEditorActionOnSubscribe, TextViewTextEventOnSubscribe, TextViewTextOnSubscribe

public final class RxTextView
{

	private RxTextView()
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

	public static Observable editorActionEvents(TextView textview)
	{
		return editorActionEvents(textview, Functions.FUNC1_ALWAYS_TRUE);
	//    0    0:aload_0         
	//    1    1:getstatic       #30  <Field Func1 Functions.FUNC1_ALWAYS_TRUE>
	//    2    4:invokestatic    #33  <Method Observable editorActionEvents(TextView, Func1)>
	//    3    7:areturn         
	}

	public static Observable editorActionEvents(TextView textview, Func1 func1)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new TextViewEditorActionEventOnSubscribe(textview, func1))));
	//    0    0:new             #39  <Class TextViewEditorActionEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #42  <Method void TextViewEditorActionEventOnSubscribe(TextView, Func1)>
	//    5    9:invokestatic    #48  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Observable editorActions(TextView textview)
	{
		return editorActions(textview, Functions.FUNC1_ALWAYS_TRUE);
	//    0    0:aload_0         
	//    1    1:getstatic       #30  <Field Func1 Functions.FUNC1_ALWAYS_TRUE>
	//    2    4:invokestatic    #52  <Method Observable editorActions(TextView, Func1)>
	//    3    7:areturn         
	}

	public static Observable editorActions(TextView textview, Func1 func1)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new TextViewEditorActionOnSubscribe(textview, func1))));
	//    0    0:new             #55  <Class TextViewEditorActionOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #56  <Method void TextViewEditorActionOnSubscribe(TextView, Func1)>
	//    5    9:invokestatic    #48  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Action1 text(TextView textview)
	{
		return new Action1(textview) {

			public void call(CharSequence charsequence)
			{
				view.setText(charsequence);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field TextView val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #29  <Method void TextView.setText(CharSequence)>
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

			final TextView val$view;

			
			{
				view = textview;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TextView val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class RxTextView$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #62  <Method void RxTextView$1(TextView)>
	//    4    8:areturn         
	}

	public static Observable textChangeEvents(TextView textview)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new TextViewTextEventOnSubscribe(textview))));
	//    0    0:new             #66  <Class TextViewTextEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #67  <Method void TextViewTextEventOnSubscribe(TextView)>
	//    4    8:invokestatic    #48  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable textChanges(TextView textview)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new TextViewTextOnSubscribe(textview))));
	//    0    0:new             #71  <Class TextViewTextOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #72  <Method void TextViewTextOnSubscribe(TextView)>
	//    4    8:invokestatic    #48  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Action1 textRes(TextView textview)
	{
		return new Action1(textview) {

			public void call(Integer integer)
			{
				view.setText(integer.intValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field TextView val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method int Integer.intValue()>
			//    4    8:invokevirtual   #36  <Method void TextView.setText(int)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Integer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Integer>
			//    3    5:invokevirtual   #39  <Method void call(Integer)>
			//    4    8:return          
			}

			final TextView val$view;

			
			{
				view = textview;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TextView val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class RxTextView$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #75  <Method void RxTextView$2(TextView)>
	//    4    8:areturn         
	}
}
