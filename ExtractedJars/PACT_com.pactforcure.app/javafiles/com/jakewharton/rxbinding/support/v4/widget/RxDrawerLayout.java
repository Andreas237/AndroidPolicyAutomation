// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.v4.widget;

import android.support.v4.widget.DrawerLayout;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.support.v4.widget:
//			DrawerLayoutDrawerOpenedOnSubscribe

public final class RxDrawerLayout
{

	private RxDrawerLayout()
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

	public static Observable drawerOpen(DrawerLayout drawerlayout, int i)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new DrawerLayoutDrawerOpenedOnSubscribe(drawerlayout, i))));
	//    0    0:new             #24  <Class DrawerLayoutDrawerOpenedOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #27  <Method void DrawerLayoutDrawerOpenedOnSubscribe(DrawerLayout, int)>
	//    5    9:invokestatic    #33  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    6   12:areturn         
	}

	public static Action1 open(DrawerLayout drawerlayout, int i)
	{
		return new Action1(drawerlayout, i) {

			public void call(Boolean boolean1)
			{
				if(boolean1.booleanValue())
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #34  <Method boolean Boolean.booleanValue()>
			//*   2    4:ifeq            19
				{
					view.openDrawer(gravity);
			//    3    7:aload_0         
			//    4    8:getfield        #20  <Field DrawerLayout val$view>
			//    5   11:aload_0         
			//    6   12:getfield        #22  <Field int val$gravity>
			//    7   15:invokevirtual   #40  <Method void DrawerLayout.openDrawer(int)>
					return;
			//    8   18:return          
				} else
				{
					view.closeDrawer(gravity);
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

			
			{
				view = drawerlayout;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field DrawerLayout val$view>
				gravity = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$gravity>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #6   <Class RxDrawerLayout$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #40  <Method void RxDrawerLayout$1(DrawerLayout, int)>
	//    5    9:areturn         
	}
}
