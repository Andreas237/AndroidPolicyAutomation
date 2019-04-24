// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.TabLayout;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.support.design.widget:
//			TabLayoutSelectionEventOnSubscribe, TabLayoutSelectionsOnSubscribe

public final class RxTabLayout
{

	private RxTabLayout()
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

	public static Action1 select(TabLayout tablayout)
	{
		return new Action1(tablayout) {

			public void call(Integer integer)
			{
				if(integer.intValue() < 0 || integer.intValue() >= view.getTabCount())
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #30  <Method int Integer.intValue()>
			//*   2    4:iflt            21
			//*   3    7:aload_1         
			//*   4    8:invokevirtual   #30  <Method int Integer.intValue()>
			//*   5   11:aload_0         
			//*   6   12:getfield        #18  <Field TabLayout val$view>
			//*   7   15:invokevirtual   #35  <Method int TabLayout.getTabCount()>
			//*   8   18:icmplt          48
				{
					throw new IllegalArgumentException((new StringBuilder()).append("No tab for index ").append(((Object) (integer))).toString());
			//    9   21:new             #37  <Class IllegalArgumentException>
			//   10   24:dup             
			//   11   25:new             #39  <Class StringBuilder>
			//   12   28:dup             
			//   13   29:invokespecial   #40  <Method void StringBuilder()>
			//   14   32:ldc1            #42  <String "No tab for index ">
			//   15   34:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
			//   16   37:aload_1         
			//   17   38:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
			//   18   41:invokevirtual   #53  <Method String StringBuilder.toString()>
			//   19   44:invokespecial   #56  <Method void IllegalArgumentException(String)>
			//   20   47:athrow          
				} else
				{
					view.getTabAt(integer.intValue()).select();
			//   21   48:aload_0         
			//   22   49:getfield        #18  <Field TabLayout val$view>
			//   23   52:aload_1         
			//   24   53:invokevirtual   #30  <Method int Integer.intValue()>
			//   25   56:invokevirtual   #60  <Method android.support.design.widget.TabLayout$Tab TabLayout.getTabAt(int)>
			//   26   59:invokevirtual   #64  <Method void android.support.design.widget.TabLayout$Tab.select()>
					return;
			//   27   62:return          
				}
			}

			public volatile void call(Object obj)
			{
				call((Integer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Integer>
			//    3    5:invokevirtual   #67  <Method void call(Integer)>
			//    4    8:return          
			}

			final TabLayout val$view;

			
			{
				view = tablayout;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TabLayout val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class RxTabLayout$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #25  <Method void RxTabLayout$1(TabLayout)>
	//    4    8:areturn         
	}

	public static Observable selectionEvents(TabLayout tablayout)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new TabLayoutSelectionEventOnSubscribe(tablayout))));
	//    0    0:new             #33  <Class TabLayoutSelectionEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void TabLayoutSelectionEventOnSubscribe(TabLayout)>
	//    4    8:invokestatic    #40  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable selections(TabLayout tablayout)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new TabLayoutSelectionsOnSubscribe(tablayout))));
	//    0    0:new             #44  <Class TabLayoutSelectionsOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #45  <Method void TabLayoutSelectionsOnSubscribe(TabLayout)>
	//    4    8:invokestatic    #40  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}
}
