// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.AdapterView;
import com.jakewharton.rxbinding.internal.Functions;
import rx.Observable;
import rx.functions.*;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterViewItemClickEventOnSubscribe, AdapterViewItemClickOnSubscribe, AdapterViewItemLongClickEventOnSubscribe, AdapterViewItemLongClickOnSubscribe, 
//			AdapterViewItemSelectionOnSubscribe, AdapterViewSelectionOnSubscribe

public final class RxAdapterView
{

	private RxAdapterView()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		throw new AssertionError("No instances.");
	//    2    4:new             #12  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #14  <String "No instances.">
	//    5   10:invokespecial   #17  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static Observable itemClickEvents(AdapterView adapterview)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new AdapterViewItemClickEventOnSubscribe(adapterview))));
	//    0    0:new             #24  <Class AdapterViewItemClickEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void AdapterViewItemClickEventOnSubscribe(AdapterView)>
	//    4    8:invokestatic    #33  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable itemClicks(AdapterView adapterview)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new AdapterViewItemClickOnSubscribe(adapterview))));
	//    0    0:new             #40  <Class AdapterViewItemClickOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #41  <Method void AdapterViewItemClickOnSubscribe(AdapterView)>
	//    4    8:invokestatic    #33  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable itemLongClickEvents(AdapterView adapterview)
	{
		return itemLongClickEvents(adapterview, Functions.FUNC1_ALWAYS_TRUE);
	//    0    0:aload_0         
	//    1    1:getstatic       #49  <Field Func1 Functions.FUNC1_ALWAYS_TRUE>
	//    2    4:invokestatic    #52  <Method Observable itemLongClickEvents(AdapterView, Func1)>
	//    3    7:areturn         
	}

	public static Observable itemLongClickEvents(AdapterView adapterview, Func1 func1)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new AdapterViewItemLongClickEventOnSubscribe(adapterview, func1))));
	//    0    0:new             #55  <Class AdapterViewItemLongClickEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #58  <Method void AdapterViewItemLongClickEventOnSubscribe(AdapterView, Func1)>
	//    5    9:invokestatic    #33  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Observable itemLongClicks(AdapterView adapterview)
	{
		return itemLongClicks(adapterview, Functions.FUNC0_ALWAYS_TRUE);
	//    0    0:aload_0         
	//    1    1:getstatic       #64  <Field Func0 Functions.FUNC0_ALWAYS_TRUE>
	//    2    4:invokestatic    #67  <Method Observable itemLongClicks(AdapterView, Func0)>
	//    3    7:areturn         
	}

	public static Observable itemLongClicks(AdapterView adapterview, Func0 func0)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new AdapterViewItemLongClickOnSubscribe(adapterview, func0))));
	//    0    0:new             #69  <Class AdapterViewItemLongClickOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #72  <Method void AdapterViewItemLongClickOnSubscribe(AdapterView, Func0)>
	//    5    9:invokestatic    #33  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Observable itemSelections(AdapterView adapterview)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new AdapterViewItemSelectionOnSubscribe(adapterview))));
	//    0    0:new             #76  <Class AdapterViewItemSelectionOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #77  <Method void AdapterViewItemSelectionOnSubscribe(AdapterView)>
	//    4    8:invokestatic    #33  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Action1 selection(AdapterView adapterview)
	{
		return new Action1(adapterview) {

			public void call(Integer integer)
			{
				view.setSelection(integer.intValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AdapterView val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method int Integer.intValue()>
			//    4    8:invokevirtual   #36  <Method void AdapterView.setSelection(int)>
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

			final AdapterView val$view;

			
			{
				view = adapterview;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AdapterView val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class RxAdapterView$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #80  <Method void RxAdapterView$1(AdapterView)>
	//    4    8:areturn         
	}

	public static Observable selectionEvents(AdapterView adapterview)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new AdapterViewSelectionOnSubscribe(adapterview))));
	//    0    0:new             #84  <Class AdapterViewSelectionOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #85  <Method void AdapterViewSelectionOnSubscribe(AdapterView)>
	//    4    8:invokestatic    #33  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}
}
