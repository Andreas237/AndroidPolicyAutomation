// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.v4.widget;

import android.view.View;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.support.v4.widget:
//			DrawerLayoutDrawerOpenedOnSubscribe

class DrawerLayoutDrawerOpenedOnSubscribe$1 extends android.support.v4.widget.DrawerLayout.SimpleDrawerListener
{

	public void onDrawerClosed(View view)
	{
		if(!val$subscriber.isUnsubscribed() && ((android.support.v4.widget.DrawerLayout.LayoutParams)view.getLayoutParams()).gravity == DrawerLayoutDrawerOpenedOnSubscribe.access$000(DrawerLayoutDrawerOpenedOnSubscribe.this))
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
			val$subscriber.onNext(((Object) (Boolean.valueOf(false))));
	//   12   30:aload_0         
	//   13   31:getfield        #19  <Field Subscriber val$subscriber>
	//   14   34:iconst_0        
	//   15   35:invokestatic    #53  <Method Boolean Boolean.valueOf(boolean)>
	//   16   38:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
	//   17   41:return          
	}

	public void onDrawerOpened(View view)
	{
		if(!val$subscriber.isUnsubscribed() && ((android.support.v4.widget.DrawerLayout.LayoutParams)view.getLayoutParams()).gravity == DrawerLayoutDrawerOpenedOnSubscribe.access$000(DrawerLayoutDrawerOpenedOnSubscribe.this))
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
			val$subscriber.onNext(((Object) (Boolean.valueOf(true))));
	//   12   30:aload_0         
	//   13   31:getfield        #19  <Field Subscriber val$subscriber>
	//   14   34:iconst_1        
	//   15   35:invokestatic    #53  <Method Boolean Boolean.valueOf(boolean)>
	//   16   38:invokevirtual   #57  <Method void Subscriber.onNext(Object)>
	//   17   41:return          
	}

	public void onDrawerSlide(View view, float f)
	{
	//    0    0:return          
	}

	public void onDrawerStateChanged(int i)
	{
	//    0    0:return          
	}

	final DrawerLayoutDrawerOpenedOnSubscribe this$0;
	final Subscriber val$subscriber;

	DrawerLayoutDrawerOpenedOnSubscribe$1()
	{
		this$0 = final_drawerlayoutdraweropenedonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DrawerLayoutDrawerOpenedOnSubscribe this$0>
		val$subscriber = Subscriber.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Subscriber val$subscriber>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void android.support.v4.widget.DrawerLayout$SimpleDrawerListener()>
	//    8   14:return          
	}
}
