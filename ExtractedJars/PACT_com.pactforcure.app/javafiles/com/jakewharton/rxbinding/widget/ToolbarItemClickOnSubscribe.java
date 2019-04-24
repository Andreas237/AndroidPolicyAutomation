// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.MenuItem;
import android.widget.Toolbar;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class ToolbarItemClickOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public ToolbarItemClickOnSubscribe(Toolbar toolbar)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		view = toolbar;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Toolbar view>
	//    5    9:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class Subscriber>
	//    3    5:invokevirtual   #33  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #38  <Method void Preconditions.checkUiThread()>
		android.widget.Toolbar.OnMenuItemClickListener onmenuitemclicklistener = new android.widget.Toolbar.OnMenuItemClickListener() {

			public boolean onMenuItemClick(MenuItem menuitem)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            18
					subscriber.onNext(((Object) (menuitem)));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_1         
			//    7   15:invokevirtual   #37  <Method void Subscriber.onNext(Object)>
				return true;
			//    8   18:iconst_1        
			//    9   19:ireturn         
			}

			final ToolbarItemClickOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = ToolbarItemClickOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ToolbarItemClickOnSubscribe this$0>
				subscriber = subscriber1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Subscriber val$subscriber>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    1    3:new             #9   <Class ToolbarItemClickOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #41  <Method void ToolbarItemClickOnSubscribe$1(ToolbarItemClickOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnMenuItemClickListener(onmenuitemclicklistener);
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field Toolbar view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #47  <Method void Toolbar.setOnMenuItemClickListener(android.widget.Toolbar$OnMenuItemClickListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnMenuItemClickListener(((android.widget.Toolbar.OnMenuItemClickListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field ToolbarItemClickOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method Toolbar ToolbarItemClickOnSubscribe.access$000(ToolbarItemClickOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void Toolbar.setOnMenuItemClickListener(android.widget.Toolbar$OnMenuItemClickListener)>
			//    5   11:return          
			}

			final ToolbarItemClickOnSubscribe this$0;

			
			{
				this$0 = ToolbarItemClickOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ToolbarItemClickOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class ToolbarItemClickOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #50  <Method void ToolbarItemClickOnSubscribe$2(ToolbarItemClickOnSubscribe)>
	//   16   30:invokevirtual   #54  <Method void Subscriber.add(rx.Subscription)>
	//   17   33:return          
	}

	private final Toolbar view;


/*
	static Toolbar access$000(ToolbarItemClickOnSubscribe toolbaritemclickonsubscribe)
	{
		return toolbaritemclickonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Toolbar view>
	//    2    4:areturn         
	}

*/
}
