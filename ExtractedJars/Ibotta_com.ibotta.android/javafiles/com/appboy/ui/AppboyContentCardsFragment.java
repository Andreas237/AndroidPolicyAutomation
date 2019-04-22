// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.content.Context;
import android.os.*;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.*;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.*;
import android.widget.Toast;
import com.appboy.Appboy;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.contentcards.AppboyCardAdapter;
import com.appboy.ui.contentcards.AppboyEmptyContentCardsAdapter;
import com.appboy.ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.appboy.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.appboy.ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.appboy.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.appboy.ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.appboy.ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.gestures.GestureObserver;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.util.ArrayList;

public class AppboyContentCardsFragment extends Fragment
	implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, TraceFieldInterface
{
	private class ContentCardsUpdateRunnable
		implements Runnable
	{

		public void run()
		{
			Object obj = ((Object) (AppboyContentCardsFragment.TAG));
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
			mCardAdapter.replaceCards(((java.util.List) (obj)));
		//   27   54:aload_0         
		//   28   55:getfield        #17  <Field AppboyContentCardsFragment this$0>
		//   29   58:invokestatic    #63  <Method AppboyCardAdapter AppboyContentCardsFragment.access$400(AppboyContentCardsFragment)>
		//   30   61:aload_1         
		//   31   62:invokevirtual   #69  <Method void AppboyCardAdapter.replaceCards(java.util.List)>
			mMainThreadLooper.removeCallbacks(mShowNetworkUnavailableRunnable);
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
				AppboyLogger.i(AppboyContentCardsFragment.TAG, "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
		//   53  114:invokestatic    #28  <Method String AppboyContentCardsFragment.access$300()>
		//   54  117:ldc1            #104 <String "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.">
		//   55  119:invokestatic    #107 <Method int AppboyLogger.i(String, String)>
		//   56  122:pop             
				Appboy.getInstance(getContext()).requestContentCardsRefresh(false);
		//   57  123:aload_0         
		//   58  124:getfield        #17  <Field AppboyContentCardsFragment this$0>
		//   59  127:invokevirtual   #111 <Method Context AppboyContentCardsFragment.getContext()>
		//   60  130:invokestatic    #117 <Method Appboy Appboy.getInstance(Context)>
		//   61  133:iconst_0        
		//   62  134:invokevirtual   #121 <Method void Appboy.requestContentCardsRefresh(boolean)>
				if(mEvent.isEmpty())
		//*  63  137:aload_0         
		//*  64  138:getfield        #22  <Field ContentCardsUpdatedEvent mEvent>
		//*  65  141:invokevirtual   #124 <Method boolean ContentCardsUpdatedEvent.isEmpty()>
		//*  66  144:ifeq            189
				{
					mContentCardsSwipeLayout.setRefreshing(true);
		//   67  147:aload_0         
		//   68  148:getfield        #17  <Field AppboyContentCardsFragment this$0>
		//   69  151:invokestatic    #128 <Method SwipeRefreshLayout AppboyContentCardsFragment.access$100(AppboyContentCardsFragment)>
		//   70  154:iconst_1        
		//   71  155:invokevirtual   #133 <Method void SwipeRefreshLayout.setRefreshing(boolean)>
					AppboyLogger.d(AppboyContentCardsFragment.TAG, "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.");
		//   72  158:invokestatic    #28  <Method String AppboyContentCardsFragment.access$300()>
		//   73  161:ldc1            #135 <String "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.">
		//   74  163:invokestatic    #138 <Method int AppboyLogger.d(String, String)>
		//   75  166:pop             
					mMainThreadLooper.postDelayed(mShowNetworkUnavailableRunnable, 5000L);
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
				appboycontentcardsfragment.swapRecyclerViewAdapter(((android.support.v7.widget.RecyclerView.Adapter) (appboycontentcardsfragment.mCardAdapter)));
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
				appboycontentcardsfragment1.swapRecyclerViewAdapter(((android.support.v7.widget.RecyclerView.Adapter) (appboycontentcardsfragment1.mEmptyContentCardsAdapter)));
		//  101  220:aload_1         
		//  102  221:aload_1         
		//  103  222:invokestatic    #152 <Method AppboyEmptyContentCardsAdapter AppboyContentCardsFragment.access$700(AppboyContentCardsFragment)>
		//  104  225:invokestatic    #148 <Method void AppboyContentCardsFragment.access$600(AppboyContentCardsFragment, android.support.v7.widget.RecyclerView$Adapter)>
			}
			mContentCardsSwipeLayout.setRefreshing(false);
		//  105  228:aload_0         
		//  106  229:getfield        #17  <Field AppboyContentCardsFragment this$0>
		//  107  232:invokestatic    #128 <Method SwipeRefreshLayout AppboyContentCardsFragment.access$100(AppboyContentCardsFragment)>
		//  108  235:iconst_0        
		//  109  236:invokevirtual   #133 <Method void SwipeRefreshLayout.setRefreshing(boolean)>
		//  110  239:return          
		}

		private final ContentCardsUpdatedEvent mEvent;
		final AppboyContentCardsFragment this$0;

		ContentCardsUpdateRunnable(ContentCardsUpdatedEvent contentcardsupdatedevent)
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

	private class NetworkUnavailableRunnable
		implements Runnable
	{

		public void run()
		{
			AppboyLogger.v(AppboyContentCardsFragment.TAG, "Displaying network unavailable toast.");
		//    0    0:invokestatic    #31  <Method String AppboyContentCardsFragment.access$300()>
		//    1    3:ldc1            #33  <String "Displaying network unavailable toast.">
		//    2    5:invokestatic    #39  <Method int AppboyLogger.v(String, String)>
		//    3    8:pop             
			Object obj = ((Object) (mApplicationContext));
		//    4    9:aload_0         
		//    5   10:getfield        #22  <Field Context mApplicationContext>
		//    6   13:astore_1        
			Toast.makeText(((Context) (obj)), ((CharSequence) (((Context) (obj)).getString(R.string.com_appboy_feed_connection_error_title))), 1).show();
		//    7   14:aload_1         
		//    8   15:aload_1         
		//    9   16:getstatic       #45  <Field int R$string.com_appboy_feed_connection_error_title>
		//   10   19:invokevirtual   #51  <Method String Context.getString(int)>
		//   11   22:iconst_1        
		//   12   23:invokestatic    #57  <Method Toast Toast.makeText(Context, CharSequence, int)>
		//   13   26:invokevirtual   #60  <Method void Toast.show()>
			obj = ((Object) (AppboyContentCardsFragment.this));
		//   14   29:aload_0         
		//   15   30:getfield        #17  <Field AppboyContentCardsFragment this$0>
		//   16   33:astore_1        
			((AppboyContentCardsFragment) (obj)).swapRecyclerViewAdapter(((android.support.v7.widget.RecyclerView.Adapter) (((AppboyContentCardsFragment) (obj)).mEmptyContentCardsAdapter)));
		//   17   34:aload_1         
		//   18   35:aload_1         
		//   19   36:invokestatic    #64  <Method AppboyEmptyContentCardsAdapter AppboyContentCardsFragment.access$700(AppboyContentCardsFragment)>
		//   20   39:invokestatic    #68  <Method void AppboyContentCardsFragment.access$600(AppboyContentCardsFragment, android.support.v7.widget.RecyclerView$Adapter)>
			mContentCardsSwipeLayout.setRefreshing(false);
		//   21   42:aload_0         
		//   22   43:getfield        #17  <Field AppboyContentCardsFragment this$0>
		//   23   46:invokestatic    #72  <Method SwipeRefreshLayout AppboyContentCardsFragment.access$100(AppboyContentCardsFragment)>
		//   24   49:iconst_0        
		//   25   50:invokevirtual   #78  <Method void SwipeRefreshLayout.setRefreshing(boolean)>
		//   26   53:return          
		}

		private final Context mApplicationContext;
		final AppboyContentCardsFragment this$0;

		private NetworkUnavailableRunnable(Context context)
		{
			this$0 = AppboyContentCardsFragment.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field AppboyContentCardsFragment this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			mApplicationContext = context;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Context mApplicationContext>
		//    8   14:return          
		}

	}


	public AppboyContentCardsFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void Fragment()>
	//    2    4:aload_0         
	//    3    5:new             #76  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #82  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #85  <Method void Handler(Looper)>
	//    7   15:putfield        #87  <Field Handler mMainThreadLooper>
		mDefaultContentCardUpdateHandler = ((IContentCardsUpdateHandler) (new DefaultContentCardsUpdateHandler()));
	//    8   18:aload_0         
	//    9   19:new             #89  <Class DefaultContentCardsUpdateHandler>
	//   10   22:dup             
	//   11   23:invokespecial   #90  <Method void DefaultContentCardsUpdateHandler()>
	//   12   26:putfield        #92  <Field IContentCardsUpdateHandler mDefaultContentCardUpdateHandler>
		mDefaultContentCardsViewBindingHandler = ((IContentCardsViewBindingHandler) (new DefaultContentCardsViewBindingHandler()));
	//   13   29:aload_0         
	//   14   30:new             #94  <Class DefaultContentCardsViewBindingHandler>
	//   15   33:dup             
	//   16   34:invokespecial   #95  <Method void DefaultContentCardsViewBindingHandler()>
	//   17   37:putfield        #97  <Field IContentCardsViewBindingHandler mDefaultContentCardsViewBindingHandler>
	//   18   40:return          
	}

	private void swapRecyclerViewAdapter(android.support.v7.widget.RecyclerView.Adapter adapter)
	{
		RecyclerView recyclerview = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field RecyclerView mRecyclerView>
	//    2    4:astore_2        
		if(recyclerview != null && recyclerview.getAdapter() != adapter)
	//*   3    5:aload_2         
	//*   4    6:ifnull          25
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #133 <Method android.support.v7.widget.RecyclerView$Adapter RecyclerView.getAdapter()>
	//*   7   13:aload_1         
	//*   8   14:if_acmpeq       25
			mRecyclerView.setAdapter(adapter);
	//    9   17:aload_0         
	//   10   18:getfield        #127 <Field RecyclerView mRecyclerView>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #136 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
	//   13   25:return          
	}

	public IContentCardsUpdateHandler getContentCardUpdateHandler()
	{
		IContentCardsUpdateHandler icontentcardsupdatehandler = mCustomContentCardUpdateHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field IContentCardsUpdateHandler mCustomContentCardUpdateHandler>
	//    2    4:astore_1        
		if(icontentcardsupdatehandler != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return icontentcardsupdatehandler;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return mDefaultContentCardUpdateHandler;
	//    7   11:aload_0         
	//    8   12:getfield        #92  <Field IContentCardsUpdateHandler mDefaultContentCardUpdateHandler>
	//    9   15:areturn         
	}

	public IContentCardsViewBindingHandler getContentCardsViewBindingHandler()
	{
		IContentCardsViewBindingHandler icontentcardsviewbindinghandler = mCustomContentCardsViewBindingHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field IContentCardsViewBindingHandler mCustomContentCardsViewBindingHandler>
	//    2    4:astore_1        
		if(icontentcardsviewbindinghandler != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return icontentcardsviewbindinghandler;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return mDefaultContentCardsViewBindingHandler;
	//    7   11:aload_0         
	//    8   12:getfield        #97  <Field IContentCardsViewBindingHandler mDefaultContentCardsViewBindingHandler>
	//    9   15:areturn         
	}

	public void initializeRecyclerView()
	{
		Object obj = ((Object) (new LinearLayoutManager(((Context) (getActivity())))));
	//    0    0:new             #147 <Class LinearLayoutManager>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #151 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    4    8:invokespecial   #154 <Method void LinearLayoutManager(Context)>
	//    5   11:astore_1        
		mCardAdapter = new AppboyCardAdapter(getContext(), ((LinearLayoutManager) (obj)), ((java.util.List) (new ArrayList())), getContentCardsViewBindingHandler());
	//    6   12:aload_0         
	//    7   13:new             #156 <Class AppboyCardAdapter>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #160 <Method Context getContext()>
	//   11   21:aload_1         
	//   12   22:new             #162 <Class ArrayList>
	//   13   25:dup             
	//   14   26:invokespecial   #163 <Method void ArrayList()>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #165 <Method IContentCardsViewBindingHandler getContentCardsViewBindingHandler()>
	//   17   33:invokespecial   #168 <Method void AppboyCardAdapter(Context, LinearLayoutManager, java.util.List, IContentCardsViewBindingHandler)>
	//   18   36:putfield        #109 <Field AppboyCardAdapter mCardAdapter>
		mRecyclerView.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (mCardAdapter)));
	//   19   39:aload_0         
	//   20   40:getfield        #127 <Field RecyclerView mRecyclerView>
	//   21   43:aload_0         
	//   22   44:getfield        #109 <Field AppboyCardAdapter mCardAdapter>
	//   23   47:invokevirtual   #136 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
		mRecyclerView.setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (obj)));
	//   24   50:aload_0         
	//   25   51:getfield        #127 <Field RecyclerView mRecyclerView>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #172 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
		(new ItemTouchHelper(((android.support.v7.widget.helper.ItemTouchHelper.Callback) (new SimpleItemTouchHelperCallback(((com.appboy.ui.contentcards.recycler.ItemTouchHelperAdapter) (mCardAdapter))))))).attachToRecyclerView(mRecyclerView);
	//   28   58:new             #174 <Class ItemTouchHelper>
	//   29   61:dup             
	//   30   62:new             #176 <Class SimpleItemTouchHelperCallback>
	//   31   65:dup             
	//   32   66:aload_0         
	//   33   67:getfield        #109 <Field AppboyCardAdapter mCardAdapter>
	//   34   70:invokespecial   #179 <Method void SimpleItemTouchHelperCallback(com.appboy.ui.contentcards.recycler.ItemTouchHelperAdapter)>
	//   35   73:invokespecial   #182 <Method void ItemTouchHelper(android.support.v7.widget.helper.ItemTouchHelper$Callback)>
	//   36   76:aload_0         
	//   37   77:getfield        #127 <Field RecyclerView mRecyclerView>
	//   38   80:invokevirtual   #186 <Method void ItemTouchHelper.attachToRecyclerView(RecyclerView)>
		obj = ((Object) (mRecyclerView.getItemAnimator()));
	//   39   83:aload_0         
	//   40   84:getfield        #127 <Field RecyclerView mRecyclerView>
	//   41   87:invokevirtual   #190 <Method android.support.v7.widget.RecyclerView$ItemAnimator RecyclerView.getItemAnimator()>
	//   42   90:astore_1        
		if(obj instanceof SimpleItemAnimator)
	//*  43   91:aload_1         
	//*  44   92:instanceof      #192 <Class SimpleItemAnimator>
	//*  45   95:ifeq            106
			((SimpleItemAnimator)obj).setSupportsChangeAnimations(false);
	//   46   98:aload_1         
	//   47   99:checkcast       #192 <Class SimpleItemAnimator>
	//   48  102:iconst_0        
	//   49  103:invokevirtual   #196 <Method void SimpleItemAnimator.setSupportsChangeAnimations(boolean)>
		mRecyclerView.addItemDecoration(((android.support.v7.widget.RecyclerView.ItemDecoration) (new ContentCardsDividerItemDecoration(getContext()))));
	//   50  106:aload_0         
	//   51  107:getfield        #127 <Field RecyclerView mRecyclerView>
	//   52  110:new             #198 <Class ContentCardsDividerItemDecoration>
	//   53  113:dup             
	//   54  114:aload_0         
	//   55  115:invokevirtual   #160 <Method Context getContext()>
	//   56  118:invokespecial   #199 <Method void ContentCardsDividerItemDecoration(Context)>
	//   57  121:invokevirtual   #203 <Method void RecyclerView.addItemDecoration(android.support.v7.widget.RecyclerView$ItemDecoration)>
		mEmptyContentCardsAdapter = new AppboyEmptyContentCardsAdapter();
	//   58  124:aload_0         
	//   59  125:new             #205 <Class AppboyEmptyContentCardsAdapter>
	//   60  128:dup             
	//   61  129:invokespecial   #206 <Method void AppboyEmptyContentCardsAdapter()>
	//   62  132:putfield        #123 <Field AppboyEmptyContentCardsAdapter mEmptyContentCardsAdapter>
	//   63  135:return          
	}

	public void onCreate(Bundle bundle)
	{
		TraceMachine.startTracing("AppboyContentCardsFragment");
	//    0    0:ldc1            #212 <String "AppboyContentCardsFragment">
	//    1    2:invokestatic    #218 <Method void TraceMachine.startTracing(String)>
		TraceMachine.enterMethod(_nr_trace, "AppboyContentCardsFragment#onCreate", ((ArrayList) (null)));
	//    2    5:aload_0         
	//    3    6:getfield        #220 <Field Trace _nr_trace>
	//    4    9:ldc1            #222 <String "AppboyContentCardsFragment#onCreate">
	//    5   11:aconst_null     
	//    6   12:invokestatic    #226 <Method void TraceMachine.enterMethod(Trace, String, ArrayList)>
		  goto _L1
	//*   7   15:goto            25
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "AppboyContentCardsFragment#onCreate", ((ArrayList) (null)));
	//    8   18:aconst_null     
	//    9   19:ldc1            #222 <String "AppboyContentCardsFragment#onCreate">
	//   10   21:aconst_null     
	//   11   22:invokestatic    #226 <Method void TraceMachine.enterMethod(Trace, String, ArrayList)>
_L1:
		super.onCreate(bundle);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #228 <Method void Fragment.onCreate(Bundle)>
		mShowNetworkUnavailableRunnable = ((Runnable) (new NetworkUnavailableRunnable(getContext())));
	//   15   30:aload_0         
	//   16   31:new             #19  <Class AppboyContentCardsFragment$NetworkUnavailableRunnable>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:aload_0         
	//   20   37:invokevirtual   #160 <Method Context getContext()>
	//   21   40:aconst_null     
	//   22   41:invokespecial   #231 <Method void AppboyContentCardsFragment$NetworkUnavailableRunnable(AppboyContentCardsFragment, Context, AppboyContentCardsFragment$1)>
	//   23   44:putfield        #113 <Field Runnable mShowNetworkUnavailableRunnable>
		TraceMachine.exitMethod();
	//   24   47:invokestatic    #234 <Method void TraceMachine.exitMethod()>
		return;
	//   25   50:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   26   51:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  27   52:goto            18
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		TraceMachine.enterMethod(_nr_trace, "AppboyContentCardsFragment#onCreateView", ((ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #220 <Field Trace _nr_trace>
	//    2    4:ldc1            #238 <String "AppboyContentCardsFragment#onCreateView">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #226 <Method void TraceMachine.enterMethod(Trace, String, ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "AppboyContentCardsFragment#onCreateView", ((ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #238 <String "AppboyContentCardsFragment#onCreateView">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #226 <Method void TraceMachine.enterMethod(Trace, String, ArrayList)>
_L1:
		layoutinflater = ((LayoutInflater) (layoutinflater.inflate(R.layout.com_appboy_content_cards, viewgroup, false)));
	//   10   20:aload_1         
	//   11   21:getstatic       #243 <Field int R$layout.com_appboy_content_cards>
	//   12   24:aload_2         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #249 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   15   29:astore_1        
		mRecyclerView = (RecyclerView)((View) (layoutinflater)).findViewById(R.id.com_appboy_content_cards_recycler);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getstatic       #254 <Field int R$id.com_appboy_content_cards_recycler>
	//   19   35:invokevirtual   #260 <Method View View.findViewById(int)>
	//   20   38:checkcast       #129 <Class RecyclerView>
	//   21   41:putfield        #127 <Field RecyclerView mRecyclerView>
		initializeRecyclerView();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #262 <Method void initializeRecyclerView()>
		mContentCardsSwipeLayout = (SwipeRefreshLayout)((View) (layoutinflater)).findViewById(R.id.appboy_content_cards_swipe_container);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getstatic       #265 <Field int R$id.appboy_content_cards_swipe_container>
	//   27   53:invokevirtual   #260 <Method View View.findViewById(int)>
	//   28   56:checkcast       #267 <Class SwipeRefreshLayout>
	//   29   59:putfield        #101 <Field SwipeRefreshLayout mContentCardsSwipeLayout>
		mContentCardsSwipeLayout.setOnRefreshListener(((android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener) (this)));
	//   30   62:aload_0         
	//   31   63:getfield        #101 <Field SwipeRefreshLayout mContentCardsSwipeLayout>
	//   32   66:aload_0         
	//   33   67:invokevirtual   #271 <Method void SwipeRefreshLayout.setOnRefreshListener(android.support.v4.widget.SwipeRefreshLayout$OnRefreshListener)>
		mContentCardsSwipeLayout.setColorSchemeResources(new int[] {
			R.color.com_appboy_content_cards_swipe_refresh_color_1, R.color.com_appboy_content_cards_swipe_refresh_color_2, R.color.com_appboy_content_cards_swipe_refresh_color_3, R.color.com_appboy_content_cards_swipe_refresh_color_4
		});
	//   34   70:aload_0         
	//   35   71:getfield        #101 <Field SwipeRefreshLayout mContentCardsSwipeLayout>
	//   36   74:iconst_4        
	//   37   75:newarray        int[]
	//   38   77:dup             
	//   39   78:iconst_0        
	//   40   79:getstatic       #276 <Field int R$color.com_appboy_content_cards_swipe_refresh_color_1>
	//   41   82:iastore         
	//   42   83:dup             
	//   43   84:iconst_1        
	//   44   85:getstatic       #279 <Field int R$color.com_appboy_content_cards_swipe_refresh_color_2>
	//   45   88:iastore         
	//   46   89:dup             
	//   47   90:iconst_2        
	//   48   91:getstatic       #282 <Field int R$color.com_appboy_content_cards_swipe_refresh_color_3>
	//   49   94:iastore         
	//   50   95:dup             
	//   51   96:iconst_3        
	//   52   97:getstatic       #285 <Field int R$color.com_appboy_content_cards_swipe_refresh_color_4>
	//   53  100:iastore         
	//   54  101:invokevirtual   #289 <Method void SwipeRefreshLayout.setColorSchemeResources(int[])>
		TraceMachine.exitMethod();
	//   55  104:invokestatic    #234 <Method void TraceMachine.exitMethod()>
		return ((View) (layoutinflater));
	//   56  107:aload_1         
	//   57  108:areturn         
		bundle;
	//   58  109:astore_3        
		if(true) goto _L3; else goto _L2
_L2:
	//*  59  110:goto            13
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #292 <Method void Fragment.onPause()>
		Appboy.getInstance(getContext()).removeSingleSubscription(mContentCardsUpdatedSubscriber, com/appboy/events/ContentCardsUpdatedEvent);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #160 <Method Context getContext()>
	//    4    8:invokestatic    #298 <Method Appboy Appboy.getInstance(Context)>
	//    5   11:aload_0         
	//    6   12:getfield        #300 <Field IEventSubscriber mContentCardsUpdatedSubscriber>
	//    7   15:ldc2            #302 <Class ContentCardsUpdatedEvent>
	//    8   18:invokevirtual   #306 <Method void Appboy.removeSingleSubscription(IEventSubscriber, Class)>
		mMainThreadLooper.removeCallbacks(mShowNetworkUnavailableRunnable);
	//    9   21:aload_0         
	//   10   22:getfield        #87  <Field Handler mMainThreadLooper>
	//   11   25:aload_0         
	//   12   26:getfield        #113 <Field Runnable mShowNetworkUnavailableRunnable>
	//   13   29:invokevirtual   #310 <Method void Handler.removeCallbacks(Runnable)>
		mCardAdapter.markOnScreenCardsAsRead();
	//   14   32:aload_0         
	//   15   33:getfield        #109 <Field AppboyCardAdapter mCardAdapter>
	//   16   36:invokevirtual   #313 <Method void AppboyCardAdapter.markOnScreenCardsAsRead()>
	//   17   39:return          
	}

	public void onRefresh()
	{
		Appboy.getInstance(getContext()).requestContentCardsRefresh(false);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method Context getContext()>
	//    2    4:invokestatic    #298 <Method Appboy Appboy.getInstance(Context)>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #317 <Method void Appboy.requestContentCardsRefresh(boolean)>
		mMainThreadLooper.postDelayed(new Runnable() {

			public void run()
			{
				mContentCardsSwipeLayout.setRefreshing(false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AppboyContentCardsFragment this$0>
			//    2    4:invokestatic    #25  <Method SwipeRefreshLayout AppboyContentCardsFragment.access$100(AppboyContentCardsFragment)>
			//    3    7:iconst_0        
			//    4    8:invokevirtual   #31  <Method void SwipeRefreshLayout.setRefreshing(boolean)>
			//    5   11:return          
			}

			final AppboyContentCardsFragment this$0;

			
			{
				this$0 = AppboyContentCardsFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyContentCardsFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 2500L);
	//    5   11:aload_0         
	//    6   12:getfield        #87  <Field Handler mMainThreadLooper>
	//    7   15:new             #10  <Class AppboyContentCardsFragment$1>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #320 <Method void AppboyContentCardsFragment$1(AppboyContentCardsFragment)>
	//   11   23:ldc2w           #24  <Long 2500L>
	//   12   26:invokevirtual   #324 <Method boolean Handler.postDelayed(Runnable, long)>
	//   13   29:pop             
	//   14   30:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #327 <Method void Fragment.onResume()>
		Appboy.getInstance(getContext()).removeSingleSubscription(mContentCardsUpdatedSubscriber, com/appboy/events/ContentCardsUpdatedEvent);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #160 <Method Context getContext()>
	//    4    8:invokestatic    #298 <Method Appboy Appboy.getInstance(Context)>
	//    5   11:aload_0         
	//    6   12:getfield        #300 <Field IEventSubscriber mContentCardsUpdatedSubscriber>
	//    7   15:ldc2            #302 <Class ContentCardsUpdatedEvent>
	//    8   18:invokevirtual   #306 <Method void Appboy.removeSingleSubscription(IEventSubscriber, Class)>
		if(mContentCardsUpdatedSubscriber == null)
	//*   9   21:aload_0         
	//*  10   22:getfield        #300 <Field IEventSubscriber mContentCardsUpdatedSubscriber>
	//*  11   25:ifnonnull       40
			mContentCardsUpdatedSubscriber = new IEventSubscriber() {

				public void trigger(ContentCardsUpdatedEvent contentcardsupdatedevent)
				{
					contentcardsupdatedevent = ((ContentCardsUpdatedEvent) (new ContentCardsUpdateRunnable(contentcardsupdatedevent)));
				//    0    0:new             #25  <Class AppboyContentCardsFragment$ContentCardsUpdateRunnable>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:getfield        #18  <Field AppboyContentCardsFragment this$0>
				//    4    8:aload_1         
				//    5    9:invokespecial   #28  <Method void AppboyContentCardsFragment$ContentCardsUpdateRunnable(AppboyContentCardsFragment, ContentCardsUpdatedEvent)>
				//    6   12:astore_1        
					mMainThreadLooper.post(((Runnable) (contentcardsupdatedevent)));
				//    7   13:aload_0         
				//    8   14:getfield        #18  <Field AppboyContentCardsFragment this$0>
				//    9   17:invokestatic    #32  <Method Handler AppboyContentCardsFragment.access$200(AppboyContentCardsFragment)>
				//   10   20:aload_1         
				//   11   21:invokevirtual   #38  <Method boolean Handler.post(Runnable)>
				//   12   24:pop             
				//   13   25:return          
				}

				public volatile void trigger(Object obj)
				{
					trigger((ContentCardsUpdatedEvent)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #41  <Class ContentCardsUpdatedEvent>
				//    3    5:invokevirtual   #43  <Method void trigger(ContentCardsUpdatedEvent)>
				//    4    8:return          
				}

				final AppboyContentCardsFragment this$0;

			
			{
				this$0 = AppboyContentCardsFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AppboyContentCardsFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   12   28:aload_0         
	//   13   29:new             #12  <Class AppboyContentCardsFragment$2>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #328 <Method void AppboyContentCardsFragment$2(AppboyContentCardsFragment)>
	//   17   37:putfield        #300 <Field IEventSubscriber mContentCardsUpdatedSubscriber>
		Appboy.getInstance(getContext()).subscribeToContentCardsUpdates(mContentCardsUpdatedSubscriber);
	//   18   40:aload_0         
	//   19   41:invokevirtual   #160 <Method Context getContext()>
	//   20   44:invokestatic    #298 <Method Appboy Appboy.getInstance(Context)>
	//   21   47:aload_0         
	//   22   48:getfield        #300 <Field IEventSubscriber mContentCardsUpdatedSubscriber>
	//   23   51:invokevirtual   #332 <Method void Appboy.subscribeToContentCardsUpdates(IEventSubscriber)>
		Appboy.getInstance(getContext()).requestContentCardsRefresh(true);
	//   24   54:aload_0         
	//   25   55:invokevirtual   #160 <Method Context getContext()>
	//   26   58:invokestatic    #298 <Method Appboy Appboy.getInstance(Context)>
	//   27   61:iconst_1        
	//   28   62:invokevirtual   #317 <Method void Appboy.requestContentCardsRefresh(boolean)>
		Appboy.getInstance(getContext()).logContentCardsDisplayed();
	//   29   65:aload_0         
	//   30   66:invokevirtual   #160 <Method Context getContext()>
	//   31   69:invokestatic    #298 <Method Appboy Appboy.getInstance(Context)>
	//   32   72:invokevirtual   #335 <Method void Appboy.logContentCardsDisplayed()>
	//   33   75:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #338 <Method void Fragment.onSaveInstanceState(Bundle)>
		Object obj = ((Object) (mRecyclerView));
	//    3    5:aload_0         
	//    4    6:getfield        #127 <Field RecyclerView mRecyclerView>
	//    5    9:astore_2        
		if(obj != null && ((RecyclerView) (obj)).getLayoutManager() != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          37
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #342 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//*  10   18:ifnull          37
			bundle.putParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", mRecyclerView.getLayoutManager().onSaveInstanceState());
	//   11   21:aload_1         
	//   12   22:ldc1            #30  <String "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY">
	//   13   24:aload_0         
	//   14   25:getfield        #127 <Field RecyclerView mRecyclerView>
	//   15   28:invokevirtual   #342 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   16   31:invokevirtual   #347 <Method android.os.Parcelable android.support.v7.widget.RecyclerView$LayoutManager.onSaveInstanceState()>
	//   17   34:invokevirtual   #353 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		obj = ((Object) (mCardAdapter));
	//   18   37:aload_0         
	//   19   38:getfield        #109 <Field AppboyCardAdapter mCardAdapter>
	//   20   41:astore_2        
		if(obj != null)
	//*  21   42:aload_2         
	//*  22   43:ifnull          59
			bundle.putStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY", (ArrayList)((AppboyCardAdapter) (obj)).getImpressedCardIds());
	//   23   46:aload_1         
	//   24   47:ldc1            #28  <String "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY">
	//   25   49:aload_2         
	//   26   50:invokevirtual   #357 <Method java.util.List AppboyCardAdapter.getImpressedCardIds()>
	//   27   53:checkcast       #162 <Class ArrayList>
	//   28   56:invokevirtual   #361 <Method void Bundle.putStringArrayList(String, ArrayList)>
	//   29   59:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #364 <Method void Fragment.onStart()>
		GestureObserver.getInstance().onActivityOrFragmentStarted(((Object) (this)));
	//    2    4:invokestatic    #369 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #373 <Method void GestureObserver.onActivityOrFragmentStarted(Object)>
	//    5   11:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #376 <Method void Fragment.onStop()>
		GestureObserver.getInstance().onActivityOrFragmentStopped(((Object) (this)));
	//    2    4:invokestatic    #369 <Method GestureObserver GestureObserver.getInstance()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #379 <Method void GestureObserver.onActivityOrFragmentStopped(Object)>
	//    5   11:return          
	}

	public void onViewStateRestored(final Bundle savedInstanceState)
	{
		super.onViewStateRestored(savedInstanceState);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #383 <Method void Fragment.onViewStateRestored(Bundle)>
		if(savedInstanceState == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			mMainThreadLooper.post(new Runnable() {

				public void run()
				{
					Object obj = ((Object) (savedInstanceState.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY")));
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field Bundle val$savedInstanceState>
				//    2    4:ldc1            #28  <String "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY">
				//    3    6:invokevirtual   #34  <Method android.os.Parcelable Bundle.getParcelable(String)>
				//    4    9:astore_1        
					android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = mRecyclerView.getLayoutManager();
				//    5   10:aload_0         
				//    6   11:getfield        #19  <Field AppboyContentCardsFragment this$0>
				//    7   14:invokestatic    #38  <Method RecyclerView AppboyContentCardsFragment.access$800(AppboyContentCardsFragment)>
				//    8   17:invokevirtual   #44  <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
				//    9   20:astore_2        
					if(obj != null && layoutmanager != null)
				//*  10   21:aload_1         
				//*  11   22:ifnull          34
				//*  12   25:aload_2         
				//*  13   26:ifnull          34
						layoutmanager.onRestoreInstanceState(((android.os.Parcelable) (obj)));
				//   14   29:aload_2         
				//   15   30:aload_1         
				//   16   31:invokevirtual   #50  <Method void android.support.v7.widget.RecyclerView$LayoutManager.onRestoreInstanceState(android.os.Parcelable)>
					obj = ((Object) (savedInstanceState.getStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY")));
				//   17   34:aload_0         
				//   18   35:getfield        #21  <Field Bundle val$savedInstanceState>
				//   19   38:ldc1            #52  <String "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY">
				//   20   40:invokevirtual   #56  <Method ArrayList Bundle.getStringArrayList(String)>
				//   21   43:astore_1        
					if(obj != null)
				//*  22   44:aload_1         
				//*  23   45:ifnull          59
						mCardAdapter.setImpressedCardIds(((java.util.List) (obj)));
				//   24   48:aload_0         
				//   25   49:getfield        #19  <Field AppboyContentCardsFragment this$0>
				//   26   52:invokestatic    #60  <Method AppboyCardAdapter AppboyContentCardsFragment.access$400(AppboyContentCardsFragment)>
				//   27   55:aload_1         
				//   28   56:invokevirtual   #66  <Method void AppboyCardAdapter.setImpressedCardIds(java.util.List)>
				//   29   59:return          
				}

				final AppboyContentCardsFragment this$0;
				final Bundle val$savedInstanceState;

			
			{
				this$0 = AppboyContentCardsFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppboyContentCardsFragment this$0>
				savedInstanceState = bundle;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Bundle val$savedInstanceState>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   10:aload_0         
	//    7   11:getfield        #87  <Field Handler mMainThreadLooper>
	//    8   14:new             #14  <Class AppboyContentCardsFragment$3>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #386 <Method void AppboyContentCardsFragment$3(AppboyContentCardsFragment, Bundle)>
	//   13   23:invokevirtual   #390 <Method boolean Handler.post(Runnable)>
	//   14   26:pop             
			return;
	//   15   27:return          
		}
	}

	public void setContentCardUpdateHandler(IContentCardsUpdateHandler icontentcardsupdatehandler)
	{
		mCustomContentCardUpdateHandler = icontentcardsupdatehandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #140 <Field IContentCardsUpdateHandler mCustomContentCardUpdateHandler>
	//    3    5:return          
	}

	public void setContentCardsViewBindingHandler(IContentCardsViewBindingHandler icontentcardsviewbindinghandler)
	{
		mCustomContentCardsViewBindingHandler = icontentcardsviewbindinghandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #144 <Field IContentCardsViewBindingHandler mCustomContentCardsViewBindingHandler>
	//    3    5:return          
	}

	private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500L;
	private static final String KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY = "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY";
	private static final String LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY = "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY";
	private static final int MAX_CONTENT_CARDS_TTL_SECONDS = 60;
	private static final long NETWORK_PROBLEM_WARNING_MS = 5000L;
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/AppboyContentCardsFragment);
	public Trace _nr_trace;
	private AppboyCardAdapter mCardAdapter;
	private SwipeRefreshLayout mContentCardsSwipeLayout;
	private IEventSubscriber mContentCardsUpdatedSubscriber;
	private IContentCardsUpdateHandler mCustomContentCardUpdateHandler;
	private IContentCardsViewBindingHandler mCustomContentCardsViewBindingHandler;
	private IContentCardsUpdateHandler mDefaultContentCardUpdateHandler;
	private IContentCardsViewBindingHandler mDefaultContentCardsViewBindingHandler;
	private AppboyEmptyContentCardsAdapter mEmptyContentCardsAdapter;
	private final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
	private RecyclerView mRecyclerView;
	private Runnable mShowNetworkUnavailableRunnable;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyContentCardsFragment>
	//    1    2:invokestatic    #68  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #70  <Field String TAG>
	//*   3    8:return          
	}


/*
	static SwipeRefreshLayout access$100(AppboyContentCardsFragment appboycontentcardsfragment)
	{
		return appboycontentcardsfragment.mContentCardsSwipeLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field SwipeRefreshLayout mContentCardsSwipeLayout>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$200(AppboyContentCardsFragment appboycontentcardsfragment)
	{
		return appboycontentcardsfragment.mMainThreadLooper;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Handler mMainThreadLooper>
	//    2    4:areturn         
	}

*/


/*
	static String access$300()
	{
		return TAG;
	//    0    0:getstatic       #70  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static AppboyCardAdapter access$400(AppboyContentCardsFragment appboycontentcardsfragment)
	{
		return appboycontentcardsfragment.mCardAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AppboyCardAdapter mCardAdapter>
	//    2    4:areturn         
	}

*/


/*
	static Runnable access$500(AppboyContentCardsFragment appboycontentcardsfragment)
	{
		return appboycontentcardsfragment.mShowNetworkUnavailableRunnable;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Runnable mShowNetworkUnavailableRunnable>
	//    2    4:areturn         
	}

*/


/*
	static void access$600(AppboyContentCardsFragment appboycontentcardsfragment, android.support.v7.widget.RecyclerView.Adapter adapter)
	{
		appboycontentcardsfragment.swapRecyclerViewAdapter(adapter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #119 <Method void swapRecyclerViewAdapter(android.support.v7.widget.RecyclerView$Adapter)>
		return;
	//    3    5:return          
	}

*/


/*
	static AppboyEmptyContentCardsAdapter access$700(AppboyContentCardsFragment appboycontentcardsfragment)
	{
		return appboycontentcardsfragment.mEmptyContentCardsAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field AppboyEmptyContentCardsAdapter mEmptyContentCardsAdapter>
	//    2    4:areturn         
	}

*/


/*
	static RecyclerView access$800(AppboyContentCardsFragment appboycontentcardsfragment)
	{
		return appboycontentcardsfragment.mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field RecyclerView mRecyclerView>
	//    2    4:areturn         
	}

*/
}
