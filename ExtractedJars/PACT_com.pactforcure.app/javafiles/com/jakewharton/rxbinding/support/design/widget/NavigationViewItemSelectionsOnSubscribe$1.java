// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.view.MenuItem;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.support.design.widget:
//			NavigationViewItemSelectionsOnSubscribe

class NavigationViewItemSelectionsOnSubscribe$1
	implements android.support.design.widget.tener
{

	public boolean onNavigationItemSelected(MenuItem menuitem)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            18
			val$subscriber.onNext(((Object) (menuitem)));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #37  <Method void Subscriber.onNext(Object)>
		return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	final NavigationViewItemSelectionsOnSubscribe this$0;
	final Subscriber val$subscriber;

	NavigationViewItemSelectionsOnSubscribe$1()
	{
		this$0 = final_navigationviewitemselectionsonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field NavigationViewItemSelectionsOnSubscribe this$0>
		val$subscriber = Subscriber.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Subscriber val$subscriber>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
