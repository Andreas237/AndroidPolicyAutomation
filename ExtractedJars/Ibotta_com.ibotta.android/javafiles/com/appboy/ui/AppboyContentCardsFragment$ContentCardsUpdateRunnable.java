// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import com.appboy.Appboy;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.contentcards.AppboyCardAdapter;
import com.appboy.ui.contentcards.handlers.IContentCardsUpdateHandler;

// Referenced classes of package com.appboy.ui:
//			AppboyContentCardsFragment

private class AppboyContentCardsFragment$ContentCardsUpdateRunnable
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (AppboyContentCardsFragment.access$300()));
	//    0    0:invokestatic    #28  <Method String AppboyContentCardsFragment.access$300()>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #30  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #31  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("Updating Content Cards views in response to ContentCardsUpdatedEvent: ");
	//    6   12:aload_2         
	//    7   13:ldc1            #33  <String "Updating Content Cards views in response to ContentCardsUpdatedEvent: ">
	//    8   15:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (mEvent)));
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:getfield        #22  <Field ContentCardsUpdatedEvent mEvent>
	//   13   24:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
	//   14   27:pop             
		AppboyLogger.v(((String) (obj)), stringbuilder.toString());
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #49  <Method int AppboyLogger.v(String, String)>
	//   19   36:pop             
		obj = ((Object) (getContentCardUpdateHandler().handleCardUpdate(mEvent)));
	//   20   37:aload_0         
	//   21   38:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//   22   41:invokevirtual   #53  <Method IContentCardsUpdateHandler AppboyContentCardsFragment.getContentCardUpdateHandler()>
	//   23   44:aload_0         
	//   24   45:getfield        #22  <Field ContentCardsUpdatedEvent mEvent>
	//   25   48:invokeinterface #59  <Method java.util.List IContentCardsUpdateHandler.handleCardUpdate(ContentCardsUpdatedEvent)>
	//   26   53:astore_1        
		AppboyContentCardsFragment.access$400(AppboyContentCardsFragment.this).replaceCards(((java.util.List) (obj)));
	//   27   54:aload_0         
	//   28   55:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//   29   58:invokestatic    #63  <Method AppboyCardAdapter AppboyContentCardsFragment.access$400(AppboyContentCardsFragment)>
	//   30   61:aload_1         
	//   31   62:invokevirtual   #69  <Method void AppboyCardAdapter.replaceCards(java.util.List)>
		AppboyContentCardsFragment.access$200(AppboyContentCardsFragment.this).removeCallbacks(AppboyContentCardsFragment.access$500(AppboyContentCardsFragment.this));
	//   32   65:aload_0         
	//   33   66:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//   34   69:invokestatic    #73  <Method Handler AppboyContentCardsFragment.access$200(AppboyContentCardsFragment)>
	//   35   72:aload_0         
	//   36   73:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//   37   76:invokestatic    #77  <Method Runnable AppboyContentCardsFragment.access$500(AppboyContentCardsFragment)>
	//   38   79:invokevirtual   #83  <Method void Handler.removeCallbacks(Runnable)>
		if(mEvent.isFromOfflineStorage() && (mEvent.getLastUpdatedInSecondsFromEpoch() + 60L) * 1000L < System.currentTimeMillis())
	//*  39   82:aload_0         
	//*  40   83:getfield        #22  <Field ContentCardsUpdatedEvent mEvent>
	//*  41   86:invokevirtual   #89  <Method boolean ContentCardsUpdatedEvent.isFromOfflineStorage()>
	//*  42   89:ifeq            189
	//*  43   92:aload_0         
	//*  44   93:getfield        #22  <Field ContentCardsUpdatedEvent mEvent>
	//*  45   96:invokevirtual   #93  <Method long ContentCardsUpdatedEvent.getLastUpdatedInSecondsFromEpoch()>
	//*  46   99:ldc2w           #94  <Long 60L>
	//*  47  102:ladd            
	//*  48  103:ldc2w           #96  <Long 1000L>
	//*  49  106:lmul            
	//*  50  107:invokestatic    #102 <Method long System.currentTimeMillis()>
	//*  51  110:lcmp            
	//*  52  111:ifge            189
		{
			AppboyLogger.i(AppboyContentCardsFragment.access$300(), "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
	//   53  114:invokestatic    #28  <Method String AppboyContentCardsFragment.access$300()>
	//   54  117:ldc1            #104 <String "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.">
	//   55  119:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
	//   56  122:pop             
			Appboy.getInstance(getContext()).requestContentCardsRefresh(false);
	//   57  123:aload_0         
	//   58  124:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//   59  127:invokevirtual   #111 <Method android.content.Context AppboyContentCardsFragment.getContext()>
	//   60  130:invokestatic    #117 <Method Appboy Appboy.getInstance(android.content.Context)>
	//   61  133:iconst_0        
	//   62  134:invokevirtual   #121 <Method void Appboy.requestContentCardsRefresh(boolean)>
			if(mEvent.isEmpty())
	//*  63  137:aload_0         
	//*  64  138:getfield        #22  <Field ContentCardsUpdatedEvent mEvent>
	//*  65  141:invokevirtual   #124 <Method boolean ContentCardsUpdatedEvent.isEmpty()>
	//*  66  144:ifeq            189
			{
				AppboyContentCardsFragment.access$100(AppboyContentCardsFragment.this).setRefreshing(true);
	//   67  147:aload_0         
	//   68  148:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//   69  151:invokestatic    #128 <Method SwipeRefreshLayout AppboyContentCardsFragment.access$100(AppboyContentCardsFragment)>
	//   70  154:iconst_1        
	//   71  155:invokevirtual   #133 <Method void SwipeRefreshLayout.setRefreshing(boolean)>
				AppboyLogger.d(AppboyContentCardsFragment.access$300(), "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.");
	//   72  158:invokestatic    #28  <Method String AppboyContentCardsFragment.access$300()>
	//   73  161:ldc1            #135 <String "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.">
	//   74  163:invokestatic    #138 <Method int AppboyLogger.d(String, String)>
	//   75  166:pop             
				AppboyContentCardsFragment.access$200(AppboyContentCardsFragment.this).postDelayed(AppboyContentCardsFragment.access$500(AppboyContentCardsFragment.this), 5000L);
	//   76  167:aload_0         
	//   77  168:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//   78  171:invokestatic    #73  <Method Handler AppboyContentCardsFragment.access$200(AppboyContentCardsFragment)>
	//   79  174:aload_0         
	//   80  175:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//   81  178:invokestatic    #77  <Method Runnable AppboyContentCardsFragment.access$500(AppboyContentCardsFragment)>
	//   82  181:ldc2w           #139 <Long 5000L>
	//   83  184:invokevirtual   #144 <Method boolean Handler.postDelayed(Runnable, long)>
	//   84  187:pop             
				return;
	//   85  188:return          
			}
		}
		if(!mEvent.isEmpty())
	//*  86  189:aload_0         
	//*  87  190:getfield        #22  <Field ContentCardsUpdatedEvent mEvent>
	//*  88  193:invokevirtual   #124 <Method boolean ContentCardsUpdatedEvent.isEmpty()>
	//*  89  196:ifne            215
		{
			AppboyContentCardsFragment appboycontentcardsfragment = AppboyContentCardsFragment.this;
	//   90  199:aload_0         
	//   91  200:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//   92  203:astore_1        
			AppboyContentCardsFragment.access$600(appboycontentcardsfragment, ((android.support.v7.widget.RecyclerView.Adapter) (AppboyContentCardsFragment.access$400(appboycontentcardsfragment))));
	//   93  204:aload_1         
	//   94  205:aload_1         
	//   95  206:invokestatic    #63  <Method AppboyCardAdapter AppboyContentCardsFragment.access$400(AppboyContentCardsFragment)>
	//   96  209:invokestatic    #148 <Method void AppboyContentCardsFragment.access$600(AppboyContentCardsFragment, android.support.v7.widget.RecyclerView$Adapter)>
		} else
	//*  97  212:goto            228
		{
			AppboyContentCardsFragment appboycontentcardsfragment1 = AppboyContentCardsFragment.this;
	//   98  215:aload_0         
	//   99  216:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//  100  219:astore_1        
			AppboyContentCardsFragment.access$600(appboycontentcardsfragment1, ((android.support.v7.widget.RecyclerView.Adapter) (AppboyContentCardsFragment.access$700(appboycontentcardsfragment1))));
	//  101  220:aload_1         
	//  102  221:aload_1         
	//  103  222:invokestatic    #152 <Method com.appboy.ui.contentcards.AppboyEmptyContentCardsAdapter AppboyContentCardsFragment.access$700(AppboyContentCardsFragment)>
	//  104  225:invokestatic    #148 <Method void AppboyContentCardsFragment.access$600(AppboyContentCardsFragment, android.support.v7.widget.RecyclerView$Adapter)>
		}
		AppboyContentCardsFragment.access$100(AppboyContentCardsFragment.this).setRefreshing(false);
	//  105  228:aload_0         
	//  106  229:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//  107  232:invokestatic    #128 <Method SwipeRefreshLayout AppboyContentCardsFragment.access$100(AppboyContentCardsFragment)>
	//  108  235:iconst_0        
	//  109  236:invokevirtual   #133 <Method void SwipeRefreshLayout.setRefreshing(boolean)>
	//  110  239:return          
	}

	private final ContentCardsUpdatedEvent mEvent;
	final AppboyContentCardsFragment this$0;

	AppboyContentCardsFragment$ContentCardsUpdateRunnable(ContentCardsUpdatedEvent contentcardsupdatedevent)
	{
		this$0 = AppboyContentCardsFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AppboyContentCardsFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		mEvent = contentcardsupdatedevent;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ContentCardsUpdatedEvent mEvent>
	//    8   14:return          
	}
}
