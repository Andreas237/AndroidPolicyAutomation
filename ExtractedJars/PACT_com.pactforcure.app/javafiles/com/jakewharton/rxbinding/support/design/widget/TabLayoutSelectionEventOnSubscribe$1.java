// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.support.design.widget:
//			TabLayoutSelectionEventOnSubscribe, TabLayoutSelectionEvent

class TabLayoutSelectionEventOnSubscribe$1
	implements android.support.design.widget.TabLayout.OnTabSelectedListener
{

	public void onTabReselected(android.support.design.widget.TabLayout.Tab tab)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            31
			val$subscriber.onNext(((Object) (TabLayoutSelectionEvent.create(TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe.this), TabLayoutSelectionEvent.Kind.RESELECTED, tab))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field TabLayoutSelectionEventOnSubscribe this$0>
	//    8   18:invokestatic    #37  <Method android.support.design.widget.TabLayout TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe)>
	//    9   21:getstatic       #43  <Field TabLayoutSelectionEvent$Kind TabLayoutSelectionEvent$Kind.RESELECTED>
	//   10   24:aload_1         
	//   11   25:invokestatic    #49  <Method TabLayoutSelectionEvent TabLayoutSelectionEvent.create(android.support.design.widget.TabLayout, TabLayoutSelectionEvent$Kind, android.support.design.widget.TabLayout$Tab)>
	//   12   28:invokevirtual   #53  <Method void Subscriber.onNext(Object)>
	//   13   31:return          
	}

	public void onTabSelected(android.support.design.widget.TabLayout.Tab tab)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            31
			val$subscriber.onNext(((Object) (TabLayoutSelectionEvent.create(TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe.this), TabLayoutSelectionEvent.Kind.SELECTED, tab))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field TabLayoutSelectionEventOnSubscribe this$0>
	//    8   18:invokestatic    #37  <Method android.support.design.widget.TabLayout TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe)>
	//    9   21:getstatic       #57  <Field TabLayoutSelectionEvent$Kind TabLayoutSelectionEvent$Kind.SELECTED>
	//   10   24:aload_1         
	//   11   25:invokestatic    #49  <Method TabLayoutSelectionEvent TabLayoutSelectionEvent.create(android.support.design.widget.TabLayout, TabLayoutSelectionEvent$Kind, android.support.design.widget.TabLayout$Tab)>
	//   12   28:invokevirtual   #53  <Method void Subscriber.onNext(Object)>
	//   13   31:return          
	}

	public void onTabUnselected(android.support.design.widget.TabLayout.Tab tab)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            31
			val$subscriber.onNext(((Object) (TabLayoutSelectionEvent.create(TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe.this), TabLayoutSelectionEvent.Kind.UNSELECTED, tab))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field TabLayoutSelectionEventOnSubscribe this$0>
	//    8   18:invokestatic    #37  <Method android.support.design.widget.TabLayout TabLayoutSelectionEventOnSubscribe.access$000(TabLayoutSelectionEventOnSubscribe)>
	//    9   21:getstatic       #61  <Field TabLayoutSelectionEvent$Kind TabLayoutSelectionEvent$Kind.UNSELECTED>
	//   10   24:aload_1         
	//   11   25:invokestatic    #49  <Method TabLayoutSelectionEvent TabLayoutSelectionEvent.create(android.support.design.widget.TabLayout, TabLayoutSelectionEvent$Kind, android.support.design.widget.TabLayout$Tab)>
	//   12   28:invokevirtual   #53  <Method void Subscriber.onNext(Object)>
	//   13   31:return          
	}

	final TabLayoutSelectionEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	TabLayoutSelectionEventOnSubscribe$1()
	{
		this$0 = final_tablayoutselectioneventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TabLayoutSelectionEventOnSubscribe this$0>
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
