// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.NavigationView;
import rx.Observable;

// Referenced classes of package com.jakewharton.rxbinding.support.design.widget:
//			NavigationViewItemSelectionsOnSubscribe

public final class RxNavigationView
{

	private RxNavigationView()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
		throw new AssertionError("No instances.");
	//    2    4:new             #10  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #12  <String "No instances.">
	//    5   10:invokespecial   #15  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static Observable itemSelections(NavigationView navigationview)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new NavigationViewItemSelectionsOnSubscribe(navigationview))));
	//    0    0:new             #22  <Class NavigationViewItemSelectionsOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #25  <Method void NavigationViewItemSelectionsOnSubscribe(NavigationView)>
	//    4    8:invokestatic    #31  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}
}
