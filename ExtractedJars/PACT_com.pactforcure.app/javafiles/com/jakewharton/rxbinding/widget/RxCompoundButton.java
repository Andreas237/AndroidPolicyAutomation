// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.CompoundButton;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			CompoundButtonCheckedChangeEventOnSubscribe, CompoundButtonCheckedChangeOnSubscribe

public final class RxCompoundButton
{

	private RxCompoundButton()
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

	public static Action1 checked(CompoundButton compoundbutton)
	{
		return new Action1(compoundbutton) {

			public void call(Boolean boolean1)
			{
				view.setChecked(boolean1.booleanValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field CompoundButton val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
			//    4    8:invokevirtual   #36  <Method void CompoundButton.setChecked(boolean)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Boolean>
			//    3    5:invokevirtual   #39  <Method void call(Boolean)>
			//    4    8:return          
			}

			final CompoundButton val$view;

			
			{
				view = compoundbutton;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CompoundButton val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class RxCompoundButton$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void RxCompoundButton$1(CompoundButton)>
	//    4    8:areturn         
	}

	public static Observable checkedChangeEvents(CompoundButton compoundbutton)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new CompoundButtonCheckedChangeEventOnSubscribe(compoundbutton))));
	//    0    0:new             #35  <Class CompoundButtonCheckedChangeEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void CompoundButtonCheckedChangeEventOnSubscribe(CompoundButton)>
	//    4    8:invokestatic    #42  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable checkedChanges(CompoundButton compoundbutton)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new CompoundButtonCheckedChangeOnSubscribe(compoundbutton))));
	//    0    0:new             #46  <Class CompoundButtonCheckedChangeOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #47  <Method void CompoundButtonCheckedChangeOnSubscribe(CompoundButton)>
	//    4    8:invokestatic    #42  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Action1 toggle(CompoundButton compoundbutton)
	{
		return new Action1(compoundbutton) {

			public void call(Object obj)
			{
				view.toggle();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field CompoundButton val$view>
			//    2    4:invokevirtual   #28  <Method void CompoundButton.toggle()>
			//    3    7:return          
			}

			final CompoundButton val$view;

			
			{
				view = compoundbutton;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CompoundButton val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class RxCompoundButton$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #50  <Method void RxCompoundButton$2(CompoundButton)>
	//    4    8:areturn         
	}
}
