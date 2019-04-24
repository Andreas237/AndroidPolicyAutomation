// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.Toolbar;
import rx.Observable;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			ToolbarItemClickOnSubscribe

public final class RxToolbar
{

	private RxToolbar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		throw new AssertionError("No instances.");
	//    2    4:new             #13  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #15  <String "No instances.">
	//    5   10:invokespecial   #18  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static Observable itemClicks(Toolbar toolbar)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new ToolbarItemClickOnSubscribe(toolbar))));
	//    0    0:new             #25  <Class ToolbarItemClickOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #28  <Method void ToolbarItemClickOnSubscribe(Toolbar)>
	//    4    8:invokestatic    #34  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}
}
