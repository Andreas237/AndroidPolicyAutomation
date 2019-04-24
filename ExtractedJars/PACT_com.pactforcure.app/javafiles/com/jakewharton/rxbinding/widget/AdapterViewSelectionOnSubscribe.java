// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.view.View;
import android.widget.AdapterView;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			AdapterViewNothingSelectionEvent, AdapterViewItemSelectionEvent

final class AdapterViewSelectionOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public AdapterViewSelectionOnSubscribe(AdapterView adapterview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		view = adapterview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field AdapterView view>
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
		android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener = new android.widget.AdapterView.OnItemSelectedListener() {

			public void onItemSelected(AdapterView adapterview, View view2, int j, long l1)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            25
					subscriber.onNext(((Object) (AdapterViewItemSelectionEvent.create(adapterview, view2, j, l1))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_1         
			//    7   15:aload_2         
			//    8   16:iload_3         
			//    9   17:lload           4
			//   10   19:invokestatic    #39  <Method AdapterViewSelectionEvent AdapterViewItemSelectionEvent.create(AdapterView, View, int, long)>
			//   11   22:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
			//   12   25:return          
			}

			public void onNothingSelected(AdapterView adapterview)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            21
					subscriber.onNext(((Object) (AdapterViewNothingSelectionEvent.create(adapterview))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:aload_1         
			//    7   15:invokestatic    #52  <Method AdapterViewSelectionEvent AdapterViewNothingSelectionEvent.create(AdapterView)>
			//    8   18:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
			//    9   21:return          
			}

			final AdapterViewSelectionOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = AdapterViewSelectionOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AdapterViewSelectionOnSubscribe this$0>
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
	//    1    3:new             #9   <Class AdapterViewSelectionOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #41  <Method void AdapterViewSelectionOnSubscribe$1(AdapterViewSelectionOnSubscribe, Subscriber)>
	//    6   12:astore          5
		view.setOnItemSelectedListener(onitemselectedlistener);
	//    7   14:aload_0         
	//    8   15:getfield        #21  <Field AdapterView view>
	//    9   18:aload           5
	//   10   20:invokevirtual   #47  <Method void AdapterView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnItemSelectedListener(((android.widget.AdapterView.OnItemSelectedListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AdapterViewSelectionOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method AdapterView AdapterViewSelectionOnSubscribe.access$000(AdapterViewSelectionOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void AdapterView.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
			//    5   11:return          
			}

			final AdapterViewSelectionOnSubscribe this$0;

			
			{
				this$0 = AdapterViewSelectionOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AdapterViewSelectionOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   23:aload_1         
	//   12   24:new             #11  <Class AdapterViewSelectionOnSubscribe$2>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #50  <Method void AdapterViewSelectionOnSubscribe$2(AdapterViewSelectionOnSubscribe)>
	//   16   32:invokevirtual   #54  <Method void Subscriber.add(rx.Subscription)>
		int i = view.getSelectedItemPosition();
	//   17   35:aload_0         
	//   18   36:getfield        #21  <Field AdapterView view>
	//   19   39:invokevirtual   #58  <Method int AdapterView.getSelectedItemPosition()>
	//   20   42:istore_2        
		if(i == -1)
	//*  21   43:iload_2         
	//*  22   44:iconst_m1       
	//*  23   45:icmpne          60
		{
			subscriber.onNext(((Object) (AdapterViewNothingSelectionEvent.create(view))));
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #21  <Field AdapterView view>
	//   27   53:invokestatic    #64  <Method AdapterViewSelectionEvent AdapterViewNothingSelectionEvent.create(AdapterView)>
	//   28   56:invokevirtual   #67  <Method void Subscriber.onNext(Object)>
			return;
	//   29   59:return          
		} else
		{
			View view1 = view.getSelectedView();
	//   30   60:aload_0         
	//   31   61:getfield        #21  <Field AdapterView view>
	//   32   64:invokevirtual   #71  <Method View AdapterView.getSelectedView()>
	//   33   67:astore          5
			long l = view.getSelectedItemId();
	//   34   69:aload_0         
	//   35   70:getfield        #21  <Field AdapterView view>
	//   36   73:invokevirtual   #75  <Method long AdapterView.getSelectedItemId()>
	//   37   76:lstore_3        
			subscriber.onNext(((Object) (AdapterViewItemSelectionEvent.create(view, view1, i, l))));
	//   38   77:aload_1         
	//   39   78:aload_0         
	//   40   79:getfield        #21  <Field AdapterView view>
	//   41   82:aload           5
	//   42   84:iload_2         
	//   43   85:lload_3         
	//   44   86:invokestatic    #80  <Method AdapterViewSelectionEvent AdapterViewItemSelectionEvent.create(AdapterView, View, int, long)>
	//   45   89:invokevirtual   #67  <Method void Subscriber.onNext(Object)>
			return;
	//   46   92:return          
		}
	}

	private final AdapterView view;


/*
	static AdapterView access$000(AdapterViewSelectionOnSubscribe adapterviewselectiononsubscribe)
	{
		return adapterviewselectiononsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AdapterView view>
	//    2    4:areturn         
	}

*/
}
