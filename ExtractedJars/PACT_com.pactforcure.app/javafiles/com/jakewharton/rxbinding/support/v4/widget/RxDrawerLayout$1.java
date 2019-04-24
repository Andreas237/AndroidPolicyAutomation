// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.v4.widget;

import android.support.v4.widget.DrawerLayout;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.support.v4.widget:
//			RxDrawerLayout

static final class RxDrawerLayout$1
	implements Action1
{

	public void call(Boolean boolean1)
	{
		if(boolean1.booleanValue())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #34  <Method boolean Boolean.booleanValue()>
	//*   2    4:ifeq            19
		{
			val$view.openDrawer(val$gravity);
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field DrawerLayout val$view>
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field int val$gravity>
	//    7   15:invokevirtual   #40  <Method void DrawerLayout.openDrawer(int)>
			return;
	//    8   18:return          
		} else
		{
			val$view.closeDrawer(val$gravity);
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field DrawerLayout val$view>
	//   11   23:aload_0         
	//   12   24:getfield        #22  <Field int val$gravity>
	//   13   27:invokevirtual   #43  <Method void DrawerLayout.closeDrawer(int)>
			return;
	//   14   30:return          
		}
	}

	public volatile void call(Object obj)
	{
		call((Boolean)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class Boolean>
	//    3    5:invokevirtual   #46  <Method void call(Boolean)>
	//    4    8:return          
	}

	final int val$gravity;
	final DrawerLayout val$view;

	RxDrawerLayout$1(DrawerLayout drawerlayout, int i)
	{
		val$view = drawerlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field DrawerLayout val$view>
		val$gravity = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int val$gravity>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
