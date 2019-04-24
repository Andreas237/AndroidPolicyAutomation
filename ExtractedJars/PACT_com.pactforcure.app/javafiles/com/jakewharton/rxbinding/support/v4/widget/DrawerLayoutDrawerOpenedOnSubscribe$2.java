// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.v4.widget;

import android.support.v4.widget.DrawerLayout;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.support.v4.widget:
//			DrawerLayoutDrawerOpenedOnSubscribe

class DrawerLayoutDrawerOpenedOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		DrawerLayoutDrawerOpenedOnSubscribe.access$100(DrawerLayoutDrawerOpenedOnSubscribe.this).setDrawerListener(((android.support.v4.widget.DrawerLayout.DrawerListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DrawerLayoutDrawerOpenedOnSubscribe this$0>
	//    2    4:invokestatic    #24  <Method DrawerLayout DrawerLayoutDrawerOpenedOnSubscribe.access$100(DrawerLayoutDrawerOpenedOnSubscribe)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #30  <Method void DrawerLayout.setDrawerListener(android.support.v4.widget.DrawerLayout$DrawerListener)>
	//    5   11:return          
	}

	final DrawerLayoutDrawerOpenedOnSubscribe this$0;

	DrawerLayoutDrawerOpenedOnSubscribe$2()
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
