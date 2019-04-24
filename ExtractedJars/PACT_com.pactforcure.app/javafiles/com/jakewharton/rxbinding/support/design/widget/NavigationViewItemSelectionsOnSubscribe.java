// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.NavigationView;
import android.view.Menu;
import android.view.MenuItem;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class NavigationViewItemSelectionsOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public NavigationViewItemSelectionsOnSubscribe(NavigationView navigationview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		view = navigationview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field NavigationView view>
	//    5    9:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class Subscriber>
	//    3    5:invokevirtual   #30  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #35  <Method void Preconditions.checkUiThread()>
		Object obj = ((Object) (new android.support.design.widget.NavigationView.OnNavigationItemSelectedListener() {

			public boolean onNavigationItemSelected(MenuItem menuitem1)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            18
					subscriber.onNext(((Object) (menuitem1)));
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

			
			{
				this$0 = NavigationViewItemSelectionsOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field NavigationViewItemSelectionsOnSubscribe this$0>
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
));
	//    1    3:new             #9   <Class NavigationViewItemSelectionsOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void NavigationViewItemSelectionsOnSubscribe$1(NavigationViewItemSelectionsOnSubscribe, Subscriber)>
	//    6   12:astore          4
		view.setNavigationItemSelectedListener(((android.support.design.widget.NavigationView.OnNavigationItemSelectedListener) (obj)));
	//    7   14:aload_0         
	//    8   15:getfield        #20  <Field NavigationView view>
	//    9   18:aload           4
	//   10   20:invokevirtual   #44  <Method void NavigationView.setNavigationItemSelectedListener(android.support.design.widget.NavigationView$OnNavigationItemSelectedListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setNavigationItemSelectedListener(((android.support.design.widget.NavigationView.OnNavigationItemSelectedListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field NavigationViewItemSelectionsOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method NavigationView NavigationViewItemSelectionsOnSubscribe.access$000(NavigationViewItemSelectionsOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void NavigationView.setNavigationItemSelectedListener(android.support.design.widget.NavigationView$OnNavigationItemSelectedListener)>
			//    5   11:return          
			}

			final NavigationViewItemSelectionsOnSubscribe this$0;

			
			{
				this$0 = NavigationViewItemSelectionsOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field NavigationViewItemSelectionsOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   23:aload_1         
	//   12   24:new             #11  <Class NavigationViewItemSelectionsOnSubscribe$2>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #47  <Method void NavigationViewItemSelectionsOnSubscribe$2(NavigationViewItemSelectionsOnSubscribe)>
	//   16   32:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
		obj = ((Object) (view.getMenu()));
	//   17   35:aload_0         
	//   18   36:getfield        #20  <Field NavigationView view>
	//   19   39:invokevirtual   #55  <Method Menu NavigationView.getMenu()>
	//   20   42:astore          4
		int i = 0;
	//   21   44:iconst_0        
	//   22   45:istore_2        
		int j = ((Menu) (obj)).size();
	//   23   46:aload           4
	//   24   48:invokeinterface #61  <Method int Menu.size()>
	//   25   53:istore_3        
		do
		{
label0:
			{
				if(i < j)
	//*  26   54:iload_2         
	//*  27   55:iload_3         
	//*  28   56:icmpge          85
				{
					MenuItem menuitem = ((Menu) (obj)).getItem(i);
	//   29   59:aload           4
	//   30   61:iload_2         
	//   31   62:invokeinterface #65  <Method MenuItem Menu.getItem(int)>
	//   32   67:astore          5
					if(!menuitem.isChecked())
						break label0;
	//   33   69:aload           5
	//   34   71:invokeinterface #71  <Method boolean MenuItem.isChecked()>
	//   35   76:ifeq            86
					subscriber.onNext(((Object) (menuitem)));
	//   36   79:aload_1         
	//   37   80:aload           5
	//   38   82:invokevirtual   #74  <Method void Subscriber.onNext(Object)>
				}
				return;
	//   39   85:return          
			}
			i++;
	//   40   86:iload_2         
	//   41   87:iconst_1        
	//   42   88:iadd            
	//   43   89:istore_2        
		} while(true);
	//   44   90:goto            54
	}

	private final NavigationView view;


/*
	static NavigationView access$000(NavigationViewItemSelectionsOnSubscribe navigationviewitemselectionsonsubscribe)
	{
		return navigationviewitemselectionsonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field NavigationView view>
	//    2    4:areturn         
	}

*/
}
