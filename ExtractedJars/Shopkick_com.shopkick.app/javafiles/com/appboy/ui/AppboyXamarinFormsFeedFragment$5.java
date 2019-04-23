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
//			AppboyXamarinFormsFeedFragment

class AppboyXamarinFormsFeedFragment$5
	implements IEventSubscriber
{

	public void trigger(final FeedUpdatedEvent event)
	{
		Activity activity = getActivity();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AppboyXamarinFormsFeedFragment this$0>
	//    2    4:invokevirtual   #34  <Method Activity AppboyXamarinFormsFeedFragment.getActivity()>
	//    3    7:astore_2        
		if(activity == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       13
		{
			return;
	//    6   12:return          
		} else
		{
			activity.runOnUiThread(new Runnable() {

				public void run()
				{
					String s = AppboyXamarinFormsFeedFragment.access$700();
				//    0    0:invokestatic    #32  <Method String AppboyXamarinFormsFeedFragment.access$700()>
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
					stringbuilder.append(((Object) (event)));
				//   10   19:aload_2         
				//   11   20:aload_0         
				//   12   21:getfield        #21  <Field FeedUpdatedEvent val$event>
				//   13   24:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
				//   14   27:pop             
					AppboyLogger.d(s, stringbuilder.toString());
				//   15   28:aload_1         
				//   16   29:aload_2         
				//   17   30:invokevirtual   #47  <Method String StringBuilder.toString()>
				//   18   33:invokestatic    #53  <Method int AppboyLogger.d(String, String)>
				//   19   36:pop             
					AppboyXamarinFormsFeedFragment.access$900(this$0).removeCallbacks(AppboyXamarinFormsFeedFragment.access$800(this$0));
				//   20   37:aload_0         
				//   21   38:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//   22   41:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//   23   44:invokestatic    #61  <Method Handler AppboyXamarinFormsFeedFragment.access$900(AppboyXamarinFormsFeedFragment)>
				//   24   47:aload_0         
				//   25   48:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//   26   51:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//   27   54:invokestatic    #65  <Method Runnable AppboyXamarinFormsFeedFragment.access$800(AppboyXamarinFormsFeedFragment)>
				//   28   57:invokevirtual   #71  <Method void Handler.removeCallbacks(Runnable)>
					AppboyXamarinFormsFeedFragment.access$100(this$0).setVisibility(8);
				//   29   60:aload_0         
				//   30   61:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//   31   64:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//   32   67:invokestatic    #75  <Method LinearLayout AppboyXamarinFormsFeedFragment.access$100(AppboyXamarinFormsFeedFragment)>
				//   33   70:bipush          8
				//   34   72:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
					if(event.getCardCount(AppboyXamarinFormsFeedFragment.access$1000(this$0)) == 0)
				//*  35   75:aload_0         
				//*  36   76:getfield        #21  <Field FeedUpdatedEvent val$event>
				//*  37   79:aload_0         
				//*  38   80:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//*  39   83:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//*  40   86:invokestatic    #85  <Method java.util.EnumSet AppboyXamarinFormsFeedFragment.access$1000(AppboyXamarinFormsFeedFragment)>
				//*  41   89:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(java.util.EnumSet)>
				//*  42   92:ifne            123
					{
						listView.setVisibility(8);
				//   43   95:aload_0         
				//   44   96:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//   45   99:getfield        #95  <Field ListView AppboyXamarinFormsFeedFragment$5.val$listView>
				//   46  102:bipush          8
				//   47  104:invokevirtual   #98  <Method void ListView.setVisibility(int)>
						AppboyXamarinFormsFeedFragment.access$500(this$0).clear();
				//   48  107:aload_0         
				//   49  108:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//   50  111:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//   51  114:invokestatic    #102 <Method AppboyListAdapter AppboyXamarinFormsFeedFragment.access$500(AppboyXamarinFormsFeedFragment)>
				//   52  117:invokevirtual   #107 <Method void AppboyListAdapter.clear()>
					} else
				//*  53  120:goto            168
					{
						AppboyXamarinFormsFeedFragment.access$1100(this$0).setVisibility(8);
				//   54  123:aload_0         
				//   55  124:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//   56  127:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//   57  130:invokestatic    #110 <Method LinearLayout AppboyXamarinFormsFeedFragment.access$1100(AppboyXamarinFormsFeedFragment)>
				//   58  133:bipush          8
				//   59  135:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
						AppboyXamarinFormsFeedFragment.access$000(this$0).setVisibility(8);
				//   60  138:aload_0         
				//   61  139:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//   62  142:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//   63  145:invokestatic    #114 <Method ProgressBar AppboyXamarinFormsFeedFragment.access$000(AppboyXamarinFormsFeedFragment)>
				//   64  148:bipush          8
				//   65  150:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
						AppboyXamarinFormsFeedFragment.access$1200(this$0).setVisibility(8);
				//   66  153:aload_0         
				//   67  154:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//   68  157:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//   69  160:invokestatic    #121 <Method View AppboyXamarinFormsFeedFragment.access$1200(AppboyXamarinFormsFeedFragment)>
				//   70  163:bipush          8
				//   71  165:invokevirtual   #124 <Method void View.setVisibility(int)>
					}
					if(event.isFromOfflineStorage() && (event.lastUpdatedInSecondsFromEpoch() + 60L) * 1000L < System.currentTimeMillis())
				//*  72  168:aload_0         
				//*  73  169:getfield        #21  <Field FeedUpdatedEvent val$event>
				//*  74  172:invokevirtual   #128 <Method boolean FeedUpdatedEvent.isFromOfflineStorage()>
				//*  75  175:ifeq            322
				//*  76  178:aload_0         
				//*  77  179:getfield        #21  <Field FeedUpdatedEvent val$event>
				//*  78  182:invokevirtual   #132 <Method long FeedUpdatedEvent.lastUpdatedInSecondsFromEpoch()>
				//*  79  185:ldc2w           #133 <Long 60L>
				//*  80  188:ladd            
				//*  81  189:ldc2w           #135 <Long 1000L>
				//*  82  192:lmul            
				//*  83  193:invokestatic    #141 <Method long System.currentTimeMillis()>
				//*  84  196:lcmp            
				//*  85  197:ifge            322
					{
						AppboyLogger.i(AppboyXamarinFormsFeedFragment.access$700(), "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
				//   86  200:invokestatic    #32  <Method String AppboyXamarinFormsFeedFragment.access$700()>
				//   87  203:ldc1            #143 <String "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.">
				//   88  205:invokestatic    #146 <Method int AppboyLogger.i(String, String)>
				//   89  208:pop             
						AppboyXamarinFormsFeedFragment.access$1300(this$0).requestFeedRefresh();
				//   90  209:aload_0         
				//   91  210:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//   92  213:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//   93  216:invokestatic    #150 <Method Appboy AppboyXamarinFormsFeedFragment.access$1300(AppboyXamarinFormsFeedFragment)>
				//   94  219:invokevirtual   #155 <Method void Appboy.requestFeedRefresh()>
						if(event.getCardCount(AppboyXamarinFormsFeedFragment.access$1000(this$0)) == 0)
				//*  95  222:aload_0         
				//*  96  223:getfield        #21  <Field FeedUpdatedEvent val$event>
				//*  97  226:aload_0         
				//*  98  227:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//*  99  230:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//* 100  233:invokestatic    #85  <Method java.util.EnumSet AppboyXamarinFormsFeedFragment.access$1000(AppboyXamarinFormsFeedFragment)>
				//* 101  236:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(java.util.EnumSet)>
				//* 102  239:ifne            322
						{
							AppboyLogger.d(AppboyXamarinFormsFeedFragment.access$700(), "Old feed was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.");
				//  103  242:invokestatic    #32  <Method String AppboyXamarinFormsFeedFragment.access$700()>
				//  104  245:ldc1            #157 <String "Old feed was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.">
				//  105  247:invokestatic    #53  <Method int AppboyLogger.d(String, String)>
				//  106  250:pop             
							AppboyXamarinFormsFeedFragment.access$1100(this$0).setVisibility(8);
				//  107  251:aload_0         
				//  108  252:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  109  255:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  110  258:invokestatic    #110 <Method LinearLayout AppboyXamarinFormsFeedFragment.access$1100(AppboyXamarinFormsFeedFragment)>
				//  111  261:bipush          8
				//  112  263:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
							AppboyXamarinFormsFeedFragment.access$000(this$0).setVisibility(0);
				//  113  266:aload_0         
				//  114  267:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  115  270:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  116  273:invokestatic    #114 <Method ProgressBar AppboyXamarinFormsFeedFragment.access$000(AppboyXamarinFormsFeedFragment)>
				//  117  276:iconst_0        
				//  118  277:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
							AppboyXamarinFormsFeedFragment.access$1200(this$0).setVisibility(0);
				//  119  280:aload_0         
				//  120  281:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  121  284:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  122  287:invokestatic    #121 <Method View AppboyXamarinFormsFeedFragment.access$1200(AppboyXamarinFormsFeedFragment)>
				//  123  290:iconst_0        
				//  124  291:invokevirtual   #124 <Method void View.setVisibility(int)>
							AppboyXamarinFormsFeedFragment.access$900(this$0).postDelayed(AppboyXamarinFormsFeedFragment.access$800(this$0), 5000L);
				//  125  294:aload_0         
				//  126  295:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  127  298:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  128  301:invokestatic    #61  <Method Handler AppboyXamarinFormsFeedFragment.access$900(AppboyXamarinFormsFeedFragment)>
				//  129  304:aload_0         
				//  130  305:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  131  308:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  132  311:invokestatic    #65  <Method Runnable AppboyXamarinFormsFeedFragment.access$800(AppboyXamarinFormsFeedFragment)>
				//  133  314:ldc2w           #158 <Long 5000L>
				//  134  317:invokevirtual   #163 <Method boolean Handler.postDelayed(Runnable, long)>
				//  135  320:pop             
							return;
				//  136  321:return          
						}
					}
					if(event.getCardCount(AppboyXamarinFormsFeedFragment.access$1000(this$0)) == 0)
				//* 137  322:aload_0         
				//* 138  323:getfield        #21  <Field FeedUpdatedEvent val$event>
				//* 139  326:aload_0         
				//* 140  327:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//* 141  330:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//* 142  333:invokestatic    #85  <Method java.util.EnumSet AppboyXamarinFormsFeedFragment.access$1000(AppboyXamarinFormsFeedFragment)>
				//* 143  336:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(java.util.EnumSet)>
				//* 144  339:ifne            388
					{
						AppboyXamarinFormsFeedFragment.access$000(this$0).setVisibility(8);
				//  145  342:aload_0         
				//  146  343:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  147  346:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  148  349:invokestatic    #114 <Method ProgressBar AppboyXamarinFormsFeedFragment.access$000(AppboyXamarinFormsFeedFragment)>
				//  149  352:bipush          8
				//  150  354:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
						AppboyXamarinFormsFeedFragment.access$1100(this$0).setVisibility(0);
				//  151  357:aload_0         
				//  152  358:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  153  361:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  154  364:invokestatic    #110 <Method LinearLayout AppboyXamarinFormsFeedFragment.access$1100(AppboyXamarinFormsFeedFragment)>
				//  155  367:iconst_0        
				//  156  368:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
						AppboyXamarinFormsFeedFragment.access$1200(this$0).setVisibility(0);
				//  157  371:aload_0         
				//  158  372:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  159  375:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  160  378:invokestatic    #121 <Method View AppboyXamarinFormsFeedFragment.access$1200(AppboyXamarinFormsFeedFragment)>
				//  161  381:iconst_0        
				//  162  382:invokevirtual   #124 <Method void View.setVisibility(int)>
					} else
				//* 163  385:goto            429
					{
						AppboyXamarinFormsFeedFragment.access$500(this$0).replaceFeed(event.getFeedCards(AppboyXamarinFormsFeedFragment.access$1000(this$0)));
				//  164  388:aload_0         
				//  165  389:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  166  392:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  167  395:invokestatic    #102 <Method AppboyListAdapter AppboyXamarinFormsFeedFragment.access$500(AppboyXamarinFormsFeedFragment)>
				//  168  398:aload_0         
				//  169  399:getfield        #21  <Field FeedUpdatedEvent val$event>
				//  170  402:aload_0         
				//  171  403:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  172  406:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  173  409:invokestatic    #85  <Method java.util.EnumSet AppboyXamarinFormsFeedFragment.access$1000(AppboyXamarinFormsFeedFragment)>
				//  174  412:invokevirtual   #167 <Method java.util.List FeedUpdatedEvent.getFeedCards(java.util.EnumSet)>
				//  175  415:invokevirtual   #171 <Method void AppboyListAdapter.replaceFeed(java.util.List)>
						listView.setVisibility(0);
				//  176  418:aload_0         
				//  177  419:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  178  422:getfield        #95  <Field ListView AppboyXamarinFormsFeedFragment$5.val$listView>
				//  179  425:iconst_0        
				//  180  426:invokevirtual   #98  <Method void ListView.setVisibility(int)>
					}
					AppboyXamarinFormsFeedFragment.access$300(this$0).setRefreshing(false);
				//  181  429:aload_0         
				//  182  430:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				//  183  433:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
				//  184  436:invokestatic    #175 <Method SwipeRefreshLayout AppboyXamarinFormsFeedFragment.access$300(AppboyXamarinFormsFeedFragment)>
				//  185  439:iconst_0        
				//  186  440:invokevirtual   #181 <Method void SwipeRefreshLayout.setRefreshing(boolean)>
				//  187  443:return          
				}

				final AppboyXamarinFormsFeedFragment._cls5 this$1;
				final FeedUpdatedEvent val$event;

			
			{
				this$1 = AppboyXamarinFormsFeedFragment._cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				event = feedupdatedevent;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FeedUpdatedEvent val$event>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    7   13:aload_2         
	//    8   14:new             #14  <Class AppboyXamarinFormsFeedFragment$5$1>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #37  <Method void AppboyXamarinFormsFeedFragment$5$1(AppboyXamarinFormsFeedFragment$5, FeedUpdatedEvent)>
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

	final AppboyXamarinFormsFeedFragment this$0;
	final ListView val$listView;

	AppboyXamarinFormsFeedFragment$5()
	{
		this$0 = final_appboyxamarinformsfeedfragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AppboyXamarinFormsFeedFragment this$0>
		val$listView = ListView.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ListView val$listView>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
