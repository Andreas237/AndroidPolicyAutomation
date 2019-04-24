// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.v4.widget;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class DrawerLayoutDrawerOpenedOnSubscribe
	implements rx.Observable.OnSubscribe
{

	DrawerLayoutDrawerOpenedOnSubscribe(DrawerLayout drawerlayout, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		view = drawerlayout;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field DrawerLayout view>
		gravity = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field int gravity>
	//    8   14:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class Subscriber>
	//    3    5:invokevirtual   #36  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #41  <Method void Preconditions.checkUiThread()>
		android.support.v4.widget.DrawerLayout.SimpleDrawerListener simpledrawerlistener = new android.support.v4.widget.DrawerLayout.SimpleDrawerListener() {

			public void onDrawerClosed(View view1)
			{
				if(!subscriber.isUnsubscribed() && ((android.support.v4.widget.DrawerLayout.LayoutParams)view1.getLayoutParams()).gravity == gravity)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #31  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            41
			//*   4   10:aload_1         
			//*   5   11:invokevirtual   #37  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
			//*   6   14:checkcast       #39  <Class android.support.v4.widget.DrawerLayout$LayoutParams>
			//*   7   17:getfield        #43  <Field int android.support.v4.widget.DrawerLayout$LayoutParams.gravity>
			//*   8   20:aload_0         
			//*   9   21:getfield        #17  <Field DrawerLayoutDrawerOpenedOnSubscribe this$0>
			//*  10   24:invokestatic    #47  <Method int DrawerLayoutDrawerOpenedOnSubscribe.access$000(DrawerLayoutDrawerOpenedOnSubscribe)>
			//*  11   27:icmpne          41
					subscriber.onNext(((Object) (Boolean.valueOf(false))));
			//   12   30:aload_0         
			//   13   31:getfield        #19  <Field Subscriber val$subscriber>
			//   14   34:iconst_0        
			//   15   35:invokestatic    #53  <Method Boolean Boolean.valueOf(boolean)>
			//   16   38:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
			//   17   41:return          
			}

			public void onDrawerOpened(View view1)
			{
				if(!subscriber.isUnsubscribed() && ((android.support.v4.widget.DrawerLayout.LayoutParams)view1.getLayoutParams()).gravity == gravity)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #31  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            41
			//*   4   10:aload_1         
			//*   5   11:invokevirtual   #37  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
			//*   6   14:checkcast       #39  <Class android.support.v4.widget.DrawerLayout$LayoutParams>
			//*   7   17:getfield        #43  <Field int android.support.v4.widget.DrawerLayout$LayoutParams.gravity>
			//*   8   20:aload_0         
			//*   9   21:getfield        #17  <Field DrawerLayoutDrawerOpenedOnSubscribe this$0>
			//*  10   24:invokestatic    #47  <Method int DrawerLayoutDrawerOpenedOnSubscribe.access$000(DrawerLayoutDrawerOpenedOnSubscribe)>
			//*  11   27:icmpne          41
					subscriber.onNext(((Object) (Boolean.valueOf(true))));
			//   12   30:aload_0         
			//   13   31:getfield        #19  <Field Subscriber val$subscriber>
			//   14   34:iconst_1        
			//   15   35:invokestatic    #53  <Method Boolean Boolean.valueOf(boolean)>
			//   16   38:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
			//   17   41:return          
			}

			public void onDrawerSlide(View view1, float f)
			{
			//    0    0:return          
			}

			public void onDrawerStateChanged(int i)
			{
			//    0    0:return          
			}

			final DrawerLayoutDrawerOpenedOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = DrawerLayoutDrawerOpenedOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DrawerLayoutDrawerOpenedOnSubscribe this$0>
				subscriber = subscriber1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Subscriber val$subscriber>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void android.support.v4.widget.DrawerLayout$SimpleDrawerListener()>
			//    8   14:return          
			}
		}
;
	//    1    3:new             #9   <Class DrawerLayoutDrawerOpenedOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #44  <Method void DrawerLayoutDrawerOpenedOnSubscribe$1(DrawerLayoutDrawerOpenedOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setDrawerListener(((android.support.v4.widget.DrawerLayout.DrawerListener) (simpledrawerlistener)));
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field DrawerLayout view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #50  <Method void DrawerLayout.setDrawerListener(android.support.v4.widget.DrawerLayout$DrawerListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setDrawerListener(((android.support.v4.widget.DrawerLayout.DrawerListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field DrawerLayoutDrawerOpenedOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method DrawerLayout DrawerLayoutDrawerOpenedOnSubscribe.access$100(DrawerLayoutDrawerOpenedOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void DrawerLayout.setDrawerListener(android.support.v4.widget.DrawerLayout$DrawerListener)>
			//    5   11:return          
			}

			final DrawerLayoutDrawerOpenedOnSubscribe this$0;

			
			{
				this$0 = DrawerLayoutDrawerOpenedOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field DrawerLayoutDrawerOpenedOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class DrawerLayoutDrawerOpenedOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #53  <Method void DrawerLayoutDrawerOpenedOnSubscribe$2(DrawerLayoutDrawerOpenedOnSubscribe)>
	//   16   30:invokevirtual   #57  <Method void Subscriber.add(rx.Subscription)>
		subscriber.onNext(((Object) (Boolean.valueOf(view.isDrawerOpen(gravity)))));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #22  <Field DrawerLayout view>
	//   20   38:aload_0         
	//   21   39:getfield        #24  <Field int gravity>
	//   22   42:invokevirtual   #61  <Method boolean DrawerLayout.isDrawerOpen(int)>
	//   23   45:invokestatic    #67  <Method Boolean Boolean.valueOf(boolean)>
	//   24   48:invokevirtual   #70  <Method void Subscriber.onNext(Object)>
	//   25   51:return          
	}

	private final int gravity;
	private final DrawerLayout view;


/*
	static int access$000(DrawerLayoutDrawerOpenedOnSubscribe drawerlayoutdraweropenedonsubscribe)
	{
		return drawerlayoutdraweropenedonsubscribe.gravity;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int gravity>
	//    2    4:ireturn         
	}

*/


/*
	static DrawerLayout access$100(DrawerLayoutDrawerOpenedOnSubscribe drawerlayoutdraweropenedonsubscribe)
	{
		return drawerlayoutdraweropenedonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DrawerLayout view>
	//    2    4:areturn         
	}

*/
}
