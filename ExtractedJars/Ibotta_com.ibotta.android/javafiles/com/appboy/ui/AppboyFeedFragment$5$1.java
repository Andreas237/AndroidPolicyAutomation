// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.app.Activity;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.*;
import com.appboy.Appboy;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.adapters.AppboyListAdapter;

// Referenced classes of package com.appboy.ui:
//			AppboyFeedFragment

class AppboyFeedFragment$5$1
	implements Runnable
{

	public void run()
	{
		String s = AppboyFeedFragment.access$500();
	//    0    0:invokestatic    #32  <Method String AppboyFeedFragment.access$500()>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #34  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #35  <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("Updating feed views in response to FeedUpdatedEvent: ");
	//    6   12:aload_2         
	//    7   13:ldc1            #37  <String "Updating feed views in response to FeedUpdatedEvent: ">
	//    8   15:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(((Object) (val$event)));
	//   10   19:aload_2         
	//   11   20:aload_0         
	//   12   21:getfield        #21  <Field FeedUpdatedEvent val$event>
	//   13   24:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
	//   14   27:pop             
		AppboyLogger.v(s, stringbuilder.toString());
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #53  <Method int AppboyLogger.v(String, String)>
	//   19   36:pop             
		AppboyFeedFragment.access$700(this$0).removeCallbacks(AppboyFeedFragment.access$600(this$0));
	//   20   37:aload_0         
	//   21   38:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//   22   41:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//   23   44:invokestatic    #61  <Method Handler AppboyFeedFragment.access$700(AppboyFeedFragment)>
	//   24   47:aload_0         
	//   25   48:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//   26   51:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//   27   54:invokestatic    #65  <Method Runnable AppboyFeedFragment.access$600(AppboyFeedFragment)>
	//   28   57:invokevirtual   #71  <Method void Handler.removeCallbacks(Runnable)>
		AppboyFeedFragment.access$100(this$0).setVisibility(8);
	//   29   60:aload_0         
	//   30   61:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//   31   64:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//   32   67:invokestatic    #75  <Method LinearLayout AppboyFeedFragment.access$100(AppboyFeedFragment)>
	//   33   70:bipush          8
	//   34   72:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
		if(val$event.getCardCount(AppboyFeedFragment.access$800(this$0)) == 0)
	//*  35   75:aload_0         
	//*  36   76:getfield        #21  <Field FeedUpdatedEvent val$event>
	//*  37   79:aload_0         
	//*  38   80:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//*  39   83:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//*  40   86:invokestatic    #85  <Method java.util.EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
	//*  41   89:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(java.util.EnumSet)>
	//*  42   92:ifne            123
		{
			val$listView.setVisibility(8);
	//   43   95:aload_0         
	//   44   96:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//   45   99:getfield        #95  <Field ListView AppboyFeedFragment$5.val$listView>
	//   46  102:bipush          8
	//   47  104:invokevirtual   #98  <Method void ListView.setVisibility(int)>
			AppboyFeedFragment.access$400(this$0).clear();
	//   48  107:aload_0         
	//   49  108:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//   50  111:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//   51  114:invokestatic    #102 <Method AppboyListAdapter AppboyFeedFragment.access$400(AppboyFeedFragment)>
	//   52  117:invokevirtual   #107 <Method void AppboyListAdapter.clear()>
		} else
	//*  53  120:goto            168
		{
			AppboyFeedFragment.access$900(this$0).setVisibility(8);
	//   54  123:aload_0         
	//   55  124:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//   56  127:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//   57  130:invokestatic    #110 <Method LinearLayout AppboyFeedFragment.access$900(AppboyFeedFragment)>
	//   58  133:bipush          8
	//   59  135:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
			AppboyFeedFragment.access$000(this$0).setVisibility(8);
	//   60  138:aload_0         
	//   61  139:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//   62  142:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//   63  145:invokestatic    #114 <Method ProgressBar AppboyFeedFragment.access$000(AppboyFeedFragment)>
	//   64  148:bipush          8
	//   65  150:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
			AppboyFeedFragment.access$1000(this$0).setVisibility(8);
	//   66  153:aload_0         
	//   67  154:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//   68  157:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//   69  160:invokestatic    #121 <Method View AppboyFeedFragment.access$1000(AppboyFeedFragment)>
	//   70  163:bipush          8
	//   71  165:invokevirtual   #124 <Method void View.setVisibility(int)>
		}
		if(val$event.isFromOfflineStorage() && (val$event.lastUpdatedInSecondsFromEpoch() + 60L) * 1000L < System.currentTimeMillis())
	//*  72  168:aload_0         
	//*  73  169:getfield        #21  <Field FeedUpdatedEvent val$event>
	//*  74  172:invokevirtual   #128 <Method boolean FeedUpdatedEvent.isFromOfflineStorage()>
	//*  75  175:ifeq            325
	//*  76  178:aload_0         
	//*  77  179:getfield        #21  <Field FeedUpdatedEvent val$event>
	//*  78  182:invokevirtual   #132 <Method long FeedUpdatedEvent.lastUpdatedInSecondsFromEpoch()>
	//*  79  185:ldc2w           #133 <Long 60L>
	//*  80  188:ladd            
	//*  81  189:ldc2w           #135 <Long 1000L>
	//*  82  192:lmul            
	//*  83  193:invokestatic    #141 <Method long System.currentTimeMillis()>
	//*  84  196:lcmp            
	//*  85  197:ifge            325
		{
			AppboyLogger.i(AppboyFeedFragment.access$500(), "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
	//   86  200:invokestatic    #32  <Method String AppboyFeedFragment.access$500()>
	//   87  203:ldc1            #143 <String "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.">
	//   88  205:invokestatic    #146 <Method int AppboyLogger.i(String, String)>
	//   89  208:pop             
			Appboy.getInstance(getContext()).requestFeedRefresh();
	//   90  209:aload_0         
	//   91  210:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//   92  213:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//   93  216:invokevirtual   #150 <Method android.content.Context AppboyFeedFragment.getContext()>
	//   94  219:invokestatic    #156 <Method Appboy Appboy.getInstance(android.content.Context)>
	//   95  222:invokevirtual   #159 <Method void Appboy.requestFeedRefresh()>
			if(val$event.getCardCount(AppboyFeedFragment.access$800(this$0)) == 0)
	//*  96  225:aload_0         
	//*  97  226:getfield        #21  <Field FeedUpdatedEvent val$event>
	//*  98  229:aload_0         
	//*  99  230:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//* 100  233:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//* 101  236:invokestatic    #85  <Method java.util.EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
	//* 102  239:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(java.util.EnumSet)>
	//* 103  242:ifne            325
			{
				AppboyLogger.d(AppboyFeedFragment.access$500(), "Old feed was empty, putting up a network spinner and registering the network error message with a delay of 5000ms.");
	//  104  245:invokestatic    #32  <Method String AppboyFeedFragment.access$500()>
	//  105  248:ldc1            #161 <String "Old feed was empty, putting up a network spinner and registering the network error message with a delay of 5000ms.">
	//  106  250:invokestatic    #164 <Method int AppboyLogger.d(String, String)>
	//  107  253:pop             
				AppboyFeedFragment.access$900(this$0).setVisibility(8);
	//  108  254:aload_0         
	//  109  255:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  110  258:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  111  261:invokestatic    #110 <Method LinearLayout AppboyFeedFragment.access$900(AppboyFeedFragment)>
	//  112  264:bipush          8
	//  113  266:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
				AppboyFeedFragment.access$000(this$0).setVisibility(0);
	//  114  269:aload_0         
	//  115  270:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  116  273:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  117  276:invokestatic    #114 <Method ProgressBar AppboyFeedFragment.access$000(AppboyFeedFragment)>
	//  118  279:iconst_0        
	//  119  280:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
				AppboyFeedFragment.access$1000(this$0).setVisibility(0);
	//  120  283:aload_0         
	//  121  284:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  122  287:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  123  290:invokestatic    #121 <Method View AppboyFeedFragment.access$1000(AppboyFeedFragment)>
	//  124  293:iconst_0        
	//  125  294:invokevirtual   #124 <Method void View.setVisibility(int)>
				AppboyFeedFragment.access$700(this$0).postDelayed(AppboyFeedFragment.access$600(this$0), 5000L);
	//  126  297:aload_0         
	//  127  298:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  128  301:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  129  304:invokestatic    #61  <Method Handler AppboyFeedFragment.access$700(AppboyFeedFragment)>
	//  130  307:aload_0         
	//  131  308:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  132  311:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  133  314:invokestatic    #65  <Method Runnable AppboyFeedFragment.access$600(AppboyFeedFragment)>
	//  134  317:ldc2w           #165 <Long 5000L>
	//  135  320:invokevirtual   #170 <Method boolean Handler.postDelayed(Runnable, long)>
	//  136  323:pop             
				return;
	//  137  324:return          
			}
		}
		if(val$event.getCardCount(AppboyFeedFragment.access$800(this$0)) == 0)
	//* 138  325:aload_0         
	//* 139  326:getfield        #21  <Field FeedUpdatedEvent val$event>
	//* 140  329:aload_0         
	//* 141  330:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//* 142  333:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//* 143  336:invokestatic    #85  <Method java.util.EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
	//* 144  339:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(java.util.EnumSet)>
	//* 145  342:ifne            391
		{
			AppboyFeedFragment.access$000(this$0).setVisibility(8);
	//  146  345:aload_0         
	//  147  346:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  148  349:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  149  352:invokestatic    #114 <Method ProgressBar AppboyFeedFragment.access$000(AppboyFeedFragment)>
	//  150  355:bipush          8
	//  151  357:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
			AppboyFeedFragment.access$900(this$0).setVisibility(0);
	//  152  360:aload_0         
	//  153  361:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  154  364:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  155  367:invokestatic    #110 <Method LinearLayout AppboyFeedFragment.access$900(AppboyFeedFragment)>
	//  156  370:iconst_0        
	//  157  371:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
			AppboyFeedFragment.access$1000(this$0).setVisibility(0);
	//  158  374:aload_0         
	//  159  375:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  160  378:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  161  381:invokestatic    #121 <Method View AppboyFeedFragment.access$1000(AppboyFeedFragment)>
	//  162  384:iconst_0        
	//  163  385:invokevirtual   #124 <Method void View.setVisibility(int)>
		} else
	//* 164  388:goto            525
		{
			if(AppboyFeedFragment.access$1100(this$0) && val$event.getCardCount(AppboyFeedFragment.access$800(this$0)) != val$event.getUnreadCardCount(AppboyFeedFragment.access$800(this$0)))
	//* 165  391:aload_0         
	//* 166  392:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//* 167  395:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//* 168  398:invokestatic    #174 <Method boolean AppboyFeedFragment.access$1100(AppboyFeedFragment)>
	//* 169  401:ifeq            484
	//* 170  404:aload_0         
	//* 171  405:getfield        #21  <Field FeedUpdatedEvent val$event>
	//* 172  408:aload_0         
	//* 173  409:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//* 174  412:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//* 175  415:invokestatic    #85  <Method java.util.EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
	//* 176  418:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(java.util.EnumSet)>
	//* 177  421:aload_0         
	//* 178  422:getfield        #21  <Field FeedUpdatedEvent val$event>
	//* 179  425:aload_0         
	//* 180  426:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//* 181  429:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//* 182  432:invokestatic    #85  <Method java.util.EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
	//* 183  435:invokevirtual   #177 <Method int FeedUpdatedEvent.getUnreadCardCount(java.util.EnumSet)>
	//* 184  438:icmpeq          484
				AppboyFeedFragment.access$400(this$0).replaceFeed(sortFeedCards(val$event.getFeedCards(AppboyFeedFragment.access$800(this$0))));
	//  185  441:aload_0         
	//  186  442:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  187  445:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  188  448:invokestatic    #102 <Method AppboyListAdapter AppboyFeedFragment.access$400(AppboyFeedFragment)>
	//  189  451:aload_0         
	//  190  452:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  191  455:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  192  458:aload_0         
	//  193  459:getfield        #21  <Field FeedUpdatedEvent val$event>
	//  194  462:aload_0         
	//  195  463:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  196  466:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  197  469:invokestatic    #85  <Method java.util.EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
	//  198  472:invokevirtual   #181 <Method java.util.List FeedUpdatedEvent.getFeedCards(java.util.EnumSet)>
	//  199  475:invokevirtual   #185 <Method java.util.List AppboyFeedFragment.sortFeedCards(java.util.List)>
	//  200  478:invokevirtual   #189 <Method void AppboyListAdapter.replaceFeed(java.util.List)>
			else
	//* 201  481:goto            514
				AppboyFeedFragment.access$400(this$0).replaceFeed(val$event.getFeedCards(AppboyFeedFragment.access$800(this$0)));
	//  202  484:aload_0         
	//  203  485:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  204  488:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  205  491:invokestatic    #102 <Method AppboyListAdapter AppboyFeedFragment.access$400(AppboyFeedFragment)>
	//  206  494:aload_0         
	//  207  495:getfield        #21  <Field FeedUpdatedEvent val$event>
	//  208  498:aload_0         
	//  209  499:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  210  502:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  211  505:invokestatic    #85  <Method java.util.EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
	//  212  508:invokevirtual   #181 <Method java.util.List FeedUpdatedEvent.getFeedCards(java.util.EnumSet)>
	//  213  511:invokevirtual   #189 <Method void AppboyListAdapter.replaceFeed(java.util.List)>
			val$listView.setVisibility(0);
	//  214  514:aload_0         
	//  215  515:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  216  518:getfield        #95  <Field ListView AppboyFeedFragment$5.val$listView>
	//  217  521:iconst_0        
	//  218  522:invokevirtual   #98  <Method void ListView.setVisibility(int)>
		}
		AppboyFeedFragment.access$300(this$0).setRefreshing(false);
	//  219  525:aload_0         
	//  220  526:getfield        #19  <Field AppboyFeedFragment$5 this$1>
	//  221  529:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
	//  222  532:invokestatic    #193 <Method SwipeRefreshLayout AppboyFeedFragment.access$300(AppboyFeedFragment)>
	//  223  535:iconst_0        
	//  224  536:invokevirtual   #199 <Method void SwipeRefreshLayout.setRefreshing(boolean)>
	//  225  539:return          
	}

	final AppboyFeedFragment._cls5 this$1;
	final FeedUpdatedEvent val$event;

	AppboyFeedFragment$5$1()
	{
		this$1 = final__pcls5;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AppboyFeedFragment$5 this$1>
		val$event = FeedUpdatedEvent.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field FeedUpdatedEvent val$event>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/appboy/ui/AppboyFeedFragment$5

/* anonymous class */
	class AppboyFeedFragment._cls5
		implements IEventSubscriber
	{

		public void trigger(FeedUpdatedEvent feedupdatedevent)
		{
			android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field AppboyFeedFragment this$0>
		//    2    4:invokevirtual   #34  <Method android.support.v4.app.FragmentActivity AppboyFeedFragment.getActivity()>
		//    3    7:astore_2        
			if(fragmentactivity == null)
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       13
			{
				return;
		//    6   12:return          
			} else
			{
				((Activity) (fragmentactivity)).runOnUiThread(((Runnable) (((AppboyFeedFragment._cls5._cls1) (feedupdatedevent)). new AppboyFeedFragment._cls5._cls1())));
		//    7   13:aload_2         
		//    8   14:new             #14  <Class AppboyFeedFragment$5$1>
		//    9   17:dup             
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:invokespecial   #37  <Method void AppboyFeedFragment$5$1(AppboyFeedFragment$5, FeedUpdatedEvent)>
		//   13   23:invokevirtual   #43  <Method void Activity.runOnUiThread(Runnable)>
				return;
		//   14   26:return          
			}
		}

		public volatile void trigger(Object obj)
		{
			trigger((FeedUpdatedEvent)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #46  <Class FeedUpdatedEvent>
		//    3    5:invokevirtual   #48  <Method void trigger(FeedUpdatedEvent)>
		//    4    8:return          
		}

		final AppboyFeedFragment this$0;
		final ListView val$listView;

			
			{
				this$0 = final_appboyfeedfragment;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AppboyFeedFragment this$0>
				listView = ListView.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ListView val$listView>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
	}

}
