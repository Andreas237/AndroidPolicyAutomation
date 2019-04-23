// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.*;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.*;
import android.widget.*;
import com.appboy.Appboy;
import com.appboy.enums.CardCategory;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.adapters.AppboyListAdapter;
import java.util.ArrayList;
import java.util.EnumSet;

public class AppboyXamarinFormsFeedFragment extends ListFragment
	implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
	public class FeedGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
	{

		public boolean onDown(MotionEvent motionevent)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
		{
			long l = (motionevent1.getEventTime() - motionevent.getEventTime()) * 2L;
		//    0    0:aload_2         
		//    1    1:invokevirtual   #27  <Method long MotionEvent.getEventTime()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #27  <Method long MotionEvent.getEventTime()>
		//    4    8:lsub            
		//    5    9:ldc2w           #28  <Long 2L>
		//    6   12:lmul            
		//    7   13:lstore          6
			int i = (int)((f1 * (float)l) / 1000F);
		//    8   15:fload           4
		//    9   17:lload           6
		//   10   19:l2f             
		//   11   20:fmul            
		//   12   21:ldc1            #30  <Float 1000F>
		//   13   23:fdiv            
		//   14   24:f2i             
		//   15   25:istore          5
			getListView().smoothScrollBy(-i, (int)(l * 2L));
		//   16   27:aload_0         
		//   17   28:getfield        #13  <Field AppboyXamarinFormsFeedFragment this$0>
		//   18   31:invokevirtual   #34  <Method ListView AppboyXamarinFormsFeedFragment.getListView()>
		//   19   34:iload           5
		//   20   36:ineg            
		//   21   37:lload           6
		//   22   39:ldc2w           #28  <Long 2L>
		//   23   42:lmul            
		//   24   43:l2i             
		//   25   44:invokevirtual   #40  <Method void ListView.smoothScrollBy(int, int)>
			return true;
		//   26   47:iconst_1        
		//   27   48:ireturn         
		}

		public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
		{
			getListView().smoothScrollBy((int)f1, 0);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field AppboyXamarinFormsFeedFragment this$0>
		//    2    4:invokevirtual   #34  <Method ListView AppboyXamarinFormsFeedFragment.getListView()>
		//    3    7:fload           4
		//    4    9:f2i             
		//    5   10:iconst_0        
		//    6   11:invokevirtual   #40  <Method void ListView.smoothScrollBy(int, int)>
			return true;
		//    7   14:iconst_1        
		//    8   15:ireturn         
		}

		final AppboyXamarinFormsFeedFragment this$0;

		public FeedGestureListener()
		{
			this$0 = AppboyXamarinFormsFeedFragment.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AppboyXamarinFormsFeedFragment this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
		//    5    9:return          
		}
	}


	public AppboyXamarinFormsFeedFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void ListFragment()>
	//    2    4:aload_0         
	//    3    5:new             #81  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #87  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #90  <Method void Handler(Looper)>
	//    7   15:putfield        #92  <Field Handler mMainThreadLooper>
	//    8   18:aload_0         
	//    9   19:new             #8   <Class AppboyXamarinFormsFeedFragment$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #95  <Method void AppboyXamarinFormsFeedFragment$1(AppboyXamarinFormsFeedFragment)>
	//   13   27:putfield        #97  <Field Runnable mShowNetworkError>
	//   14   30:return          
	}

	private void setOnScreenCardsToRead()
	{
		mAdapter.batchSetCardsToRead(previousVisibleHeadCardIndex, currentCardIndexAtBottomOfScreen);
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field AppboyListAdapter mAdapter>
	//    2    4:aload_0         
	//    3    5:getfield        #132 <Field int previousVisibleHeadCardIndex>
	//    4    8:aload_0         
	//    5    9:getfield        #141 <Field int currentCardIndexAtBottomOfScreen>
	//    6   12:invokevirtual   #154 <Method void AppboyListAdapter.batchSetCardsToRead(int, int)>
	//    7   15:return          
	}

	public EnumSet getCategories()
	{
		return mCategories;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field EnumSet mCategories>
	//    2    4:areturn         
	}

	public void onActivityCreated(Bundle bundle)
	{
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #165 <Method void ListFragment.onActivityCreated(Bundle)>
		if(mSkipCardImpressionsReset)
	//*   3    5:aload_0         
	//*   4    6:getfield        #167 <Field boolean mSkipCardImpressionsReset>
	//*   5    9:ifeq            20
		{
			mSkipCardImpressionsReset = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #167 <Field boolean mSkipCardImpressionsReset>
		} else
	//*   9   17:goto            36
		{
			mAdapter.resetCardImpressionTracker();
	//   10   20:aload_0         
	//   11   21:getfield        #138 <Field AppboyListAdapter mAdapter>
	//   12   24:invokevirtual   #170 <Method void AppboyListAdapter.resetCardImpressionTracker()>
			AppboyLogger.d(TAG, "Resetting card impressions.");
	//   13   27:getstatic       #75  <Field String TAG>
	//   14   30:ldc1            #172 <String "Resetting card impressions.">
	//   15   32:invokestatic    #176 <Method int AppboyLogger.d(String, String)>
	//   16   35:pop             
		}
		bundle = ((Bundle) (LayoutInflater.from(((Context) (getActivity())))));
	//   17   36:aload_0         
	//   18   37:invokevirtual   #180 <Method Activity getActivity()>
	//   19   40:invokestatic    #186 <Method LayoutInflater LayoutInflater.from(Context)>
	//   20   43:astore_1        
		final ListView listView = getListView();
	//   21   44:aload_0         
	//   22   45:invokevirtual   #190 <Method ListView getListView()>
	//   23   48:astore_2        
		listView.addHeaderView(((LayoutInflater) (bundle)).inflate(R.layout.com_appboy_feed_header, ((ViewGroup) (null))));
	//   24   49:aload_2         
	//   25   50:aload_1         
	//   26   51:getstatic       #195 <Field int R$layout.com_appboy_feed_header>
	//   27   54:aconst_null     
	//   28   55:invokevirtual   #199 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   29   58:invokevirtual   #205 <Method void ListView.addHeaderView(View)>
		listView.addFooterView(((LayoutInflater) (bundle)).inflate(R.layout.com_appboy_feed_footer, ((ViewGroup) (null))));
	//   30   61:aload_2         
	//   31   62:aload_1         
	//   32   63:getstatic       #208 <Field int R$layout.com_appboy_feed_footer>
	//   33   66:aconst_null     
	//   34   67:invokevirtual   #199 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   35   70:invokevirtual   #211 <Method void ListView.addFooterView(View)>
		mFeedRootLayout.setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view, MotionEvent motionevent)
			{
				return mGestureDetector.onTouchEvent(motionevent);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
			//    2    4:invokestatic    #27  <Method GestureDetectorCompat AppboyXamarinFormsFeedFragment.access$200(AppboyXamarinFormsFeedFragment)>
			//    3    7:aload_2         
			//    4    8:invokevirtual   #33  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
			//    5   11:ireturn         
			}

			final AppboyXamarinFormsFeedFragment this$0;

			
			{
				this$0 = AppboyXamarinFormsFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   36   73:aload_0         
	//   37   74:getfield        #213 <Field RelativeLayout mFeedRootLayout>
	//   38   77:new             #10  <Class AppboyXamarinFormsFeedFragment$2>
	//   39   80:dup             
	//   40   81:aload_0         
	//   41   82:invokespecial   #214 <Method void AppboyXamarinFormsFeedFragment$2(AppboyXamarinFormsFeedFragment)>
	//   42   85:invokevirtual   #220 <Method void RelativeLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

			public void onScroll(AbsListView abslistview, int i, int j, int k)
			{
				abslistview = ((AbsListView) (mFeedSwipeLayout));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
			//    2    4:invokestatic    #27  <Method SwipeRefreshLayout AppboyXamarinFormsFeedFragment.access$300(AppboyXamarinFormsFeedFragment)>
			//    3    7:astore_1        
				boolean flag;
				if(i == 0)
			//*   4    8:iload_2         
			//*   5    9:ifne            18
					flag = true;
			//    6   12:iconst_1        
			//    7   13:istore          5
				else
			//*   8   15:goto            21
					flag = false;
			//    9   18:iconst_0        
			//   10   19:istore          5
				((SwipeRefreshLayout) (abslistview)).setEnabled(flag);
			//   11   21:aload_1         
			//   12   22:iload           5
			//   13   24:invokevirtual   #33  <Method void SwipeRefreshLayout.setEnabled(boolean)>
				if(j == 0)
			//*  14   27:iload_3         
			//*  15   28:ifne            32
					return;
			//   16   31:return          
				k = i - 1;
			//   17   32:iload_2         
			//   18   33:iconst_1        
			//   19   34:isub            
			//   20   35:istore          4
				if(k > previousVisibleHeadCardIndex)
			//*  21   37:iload           4
			//*  22   39:aload_0         
			//*  23   40:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
			//*  24   43:invokestatic    #37  <Method int AppboyXamarinFormsFeedFragment.access$400(AppboyXamarinFormsFeedFragment)>
			//*  25   46:icmple          68
					mAdapter.batchSetCardsToRead(previousVisibleHeadCardIndex, k);
			//   26   49:aload_0         
			//   27   50:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
			//   28   53:invokestatic    #41  <Method AppboyListAdapter AppboyXamarinFormsFeedFragment.access$500(AppboyXamarinFormsFeedFragment)>
			//   29   56:aload_0         
			//   30   57:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
			//   31   60:invokestatic    #37  <Method int AppboyXamarinFormsFeedFragment.access$400(AppboyXamarinFormsFeedFragment)>
			//   32   63:iload           4
			//   33   65:invokevirtual   #47  <Method void AppboyListAdapter.batchSetCardsToRead(int, int)>
				previousVisibleHeadCardIndex = k;
			//   34   68:aload_0         
			//   35   69:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
			//   36   72:iload           4
			//   37   74:invokestatic    #51  <Method int AppboyXamarinFormsFeedFragment.access$402(AppboyXamarinFormsFeedFragment, int)>
			//   38   77:pop             
				currentCardIndexAtBottomOfScreen = i + j;
			//   39   78:aload_0         
			//   40   79:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
			//   41   82:iload_2         
			//   42   83:iload_3         
			//   43   84:iadd            
			//   44   85:invokestatic    #54  <Method int AppboyXamarinFormsFeedFragment.access$602(AppboyXamarinFormsFeedFragment, int)>
			//   45   88:pop             
			//   46   89:return          
			}

			public void onScrollStateChanged(AbsListView abslistview, int i)
			{
			//    0    0:return          
			}

			final AppboyXamarinFormsFeedFragment this$0;

			
			{
				this$0 = AppboyXamarinFormsFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   43   88:aload_2         
	//   44   89:new             #12  <Class AppboyXamarinFormsFeedFragment$3>
	//   45   92:dup             
	//   46   93:aload_0         
	//   47   94:invokespecial   #221 <Method void AppboyXamarinFormsFeedFragment$3(AppboyXamarinFormsFeedFragment)>
	//   48   97:invokevirtual   #225 <Method void ListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
		mTransparentFullBoundsContainerView.setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view, MotionEvent motionevent)
			{
				return view.getVisibility() == 0;
			//    0    0:aload_1         
			//    1    1:invokevirtual   #29  <Method int View.getVisibility()>
			//    2    4:ifne            9
			//    3    7:iconst_1        
			//    4    8:ireturn         
			//    5    9:iconst_0        
			//    6   10:ireturn         
			}

			final AppboyXamarinFormsFeedFragment this$0;

			
			{
				this$0 = AppboyXamarinFormsFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   49  100:aload_0         
	//   50  101:getfield        #116 <Field View mTransparentFullBoundsContainerView>
	//   51  104:new             #14  <Class AppboyXamarinFormsFeedFragment$4>
	//   52  107:dup             
	//   53  108:aload_0         
	//   54  109:invokespecial   #226 <Method void AppboyXamarinFormsFeedFragment$4(AppboyXamarinFormsFeedFragment)>
	//   55  112:invokevirtual   #229 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		mAppboy.removeSingleSubscription(mFeedUpdatedSubscriber, com/appboy/events/FeedUpdatedEvent);
	//   56  115:aload_0         
	//   57  116:getfield        #120 <Field Appboy mAppboy>
	//   58  119:aload_0         
	//   59  120:getfield        #231 <Field IEventSubscriber mFeedUpdatedSubscriber>
	//   60  123:ldc1            #233 <Class FeedUpdatedEvent>
	//   61  125:invokevirtual   #239 <Method void Appboy.removeSingleSubscription(IEventSubscriber, Class)>
		mFeedUpdatedSubscriber = new IEventSubscriber() {

			public void trigger(FeedUpdatedEvent feedupdatedevent)
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
					activity.runOnUiThread(((_cls1) (feedupdatedevent)). new Runnable() {

						public void run()
						{
							String s = AppboyXamarinFormsFeedFragment.TAG;
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
							mMainThreadLooper.removeCallbacks(mShowNetworkError);
						//   20   37:aload_0         
						//   21   38:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//   22   41:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//   23   44:invokestatic    #61  <Method Handler AppboyXamarinFormsFeedFragment.access$900(AppboyXamarinFormsFeedFragment)>
						//   24   47:aload_0         
						//   25   48:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//   26   51:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//   27   54:invokestatic    #65  <Method Runnable AppboyXamarinFormsFeedFragment.access$800(AppboyXamarinFormsFeedFragment)>
						//   28   57:invokevirtual   #71  <Method void Handler.removeCallbacks(Runnable)>
							mNetworkErrorLayout.setVisibility(8);
						//   29   60:aload_0         
						//   30   61:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//   31   64:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//   32   67:invokestatic    #75  <Method LinearLayout AppboyXamarinFormsFeedFragment.access$100(AppboyXamarinFormsFeedFragment)>
						//   33   70:bipush          8
						//   34   72:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
							if(event.getCardCount(mCategories) == 0)
						//*  35   75:aload_0         
						//*  36   76:getfield        #21  <Field FeedUpdatedEvent val$event>
						//*  37   79:aload_0         
						//*  38   80:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//*  39   83:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//*  40   86:invokestatic    #85  <Method EnumSet AppboyXamarinFormsFeedFragment.access$1000(AppboyXamarinFormsFeedFragment)>
						//*  41   89:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(EnumSet)>
						//*  42   92:ifne            123
							{
								listView.setVisibility(8);
						//   43   95:aload_0         
						//   44   96:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//   45   99:getfield        #95  <Field ListView AppboyXamarinFormsFeedFragment$5.val$listView>
						//   46  102:bipush          8
						//   47  104:invokevirtual   #98  <Method void ListView.setVisibility(int)>
								mAdapter.clear();
						//   48  107:aload_0         
						//   49  108:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//   50  111:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//   51  114:invokestatic    #102 <Method AppboyListAdapter AppboyXamarinFormsFeedFragment.access$500(AppboyXamarinFormsFeedFragment)>
						//   52  117:invokevirtual   #107 <Method void AppboyListAdapter.clear()>
							} else
						//*  53  120:goto            168
							{
								mEmptyFeedLayout.setVisibility(8);
						//   54  123:aload_0         
						//   55  124:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//   56  127:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//   57  130:invokestatic    #110 <Method LinearLayout AppboyXamarinFormsFeedFragment.access$1100(AppboyXamarinFormsFeedFragment)>
						//   58  133:bipush          8
						//   59  135:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
								mLoadingSpinner.setVisibility(8);
						//   60  138:aload_0         
						//   61  139:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//   62  142:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//   63  145:invokestatic    #114 <Method ProgressBar AppboyXamarinFormsFeedFragment.access$000(AppboyXamarinFormsFeedFragment)>
						//   64  148:bipush          8
						//   65  150:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
								mTransparentFullBoundsContainerView.setVisibility(8);
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
								AppboyLogger.i(AppboyXamarinFormsFeedFragment.TAG, "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
						//   86  200:invokestatic    #32  <Method String AppboyXamarinFormsFeedFragment.access$700()>
						//   87  203:ldc1            #143 <String "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.">
						//   88  205:invokestatic    #146 <Method int AppboyLogger.i(String, String)>
						//   89  208:pop             
								mAppboy.requestFeedRefresh();
						//   90  209:aload_0         
						//   91  210:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//   92  213:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//   93  216:invokestatic    #150 <Method Appboy AppboyXamarinFormsFeedFragment.access$1300(AppboyXamarinFormsFeedFragment)>
						//   94  219:invokevirtual   #155 <Method void Appboy.requestFeedRefresh()>
								if(event.getCardCount(mCategories) == 0)
						//*  95  222:aload_0         
						//*  96  223:getfield        #21  <Field FeedUpdatedEvent val$event>
						//*  97  226:aload_0         
						//*  98  227:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//*  99  230:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//* 100  233:invokestatic    #85  <Method EnumSet AppboyXamarinFormsFeedFragment.access$1000(AppboyXamarinFormsFeedFragment)>
						//* 101  236:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(EnumSet)>
						//* 102  239:ifne            322
								{
									AppboyLogger.d(AppboyXamarinFormsFeedFragment.TAG, "Old feed was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.");
						//  103  242:invokestatic    #32  <Method String AppboyXamarinFormsFeedFragment.access$700()>
						//  104  245:ldc1            #157 <String "Old feed was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.">
						//  105  247:invokestatic    #53  <Method int AppboyLogger.d(String, String)>
						//  106  250:pop             
									mEmptyFeedLayout.setVisibility(8);
						//  107  251:aload_0         
						//  108  252:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//  109  255:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//  110  258:invokestatic    #110 <Method LinearLayout AppboyXamarinFormsFeedFragment.access$1100(AppboyXamarinFormsFeedFragment)>
						//  111  261:bipush          8
						//  112  263:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
									mLoadingSpinner.setVisibility(0);
						//  113  266:aload_0         
						//  114  267:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//  115  270:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//  116  273:invokestatic    #114 <Method ProgressBar AppboyXamarinFormsFeedFragment.access$000(AppboyXamarinFormsFeedFragment)>
						//  117  276:iconst_0        
						//  118  277:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
									mTransparentFullBoundsContainerView.setVisibility(0);
						//  119  280:aload_0         
						//  120  281:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//  121  284:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//  122  287:invokestatic    #121 <Method View AppboyXamarinFormsFeedFragment.access$1200(AppboyXamarinFormsFeedFragment)>
						//  123  290:iconst_0        
						//  124  291:invokevirtual   #124 <Method void View.setVisibility(int)>
									mMainThreadLooper.postDelayed(mShowNetworkError, 5000L);
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
							if(event.getCardCount(mCategories) == 0)
						//* 137  322:aload_0         
						//* 138  323:getfield        #21  <Field FeedUpdatedEvent val$event>
						//* 139  326:aload_0         
						//* 140  327:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//* 141  330:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//* 142  333:invokestatic    #85  <Method EnumSet AppboyXamarinFormsFeedFragment.access$1000(AppboyXamarinFormsFeedFragment)>
						//* 143  336:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(EnumSet)>
						//* 144  339:ifne            388
							{
								mLoadingSpinner.setVisibility(8);
						//  145  342:aload_0         
						//  146  343:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//  147  346:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//  148  349:invokestatic    #114 <Method ProgressBar AppboyXamarinFormsFeedFragment.access$000(AppboyXamarinFormsFeedFragment)>
						//  149  352:bipush          8
						//  150  354:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
								mEmptyFeedLayout.setVisibility(0);
						//  151  357:aload_0         
						//  152  358:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//  153  361:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//  154  364:invokestatic    #110 <Method LinearLayout AppboyXamarinFormsFeedFragment.access$1100(AppboyXamarinFormsFeedFragment)>
						//  155  367:iconst_0        
						//  156  368:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
								mTransparentFullBoundsContainerView.setVisibility(0);
						//  157  371:aload_0         
						//  158  372:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//  159  375:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//  160  378:invokestatic    #121 <Method View AppboyXamarinFormsFeedFragment.access$1200(AppboyXamarinFormsFeedFragment)>
						//  161  381:iconst_0        
						//  162  382:invokevirtual   #124 <Method void View.setVisibility(int)>
							} else
						//* 163  385:goto            429
							{
								mAdapter.replaceFeed(event.getFeedCards(mCategories));
						//  164  388:aload_0         
						//  165  389:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//  166  392:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//  167  395:invokestatic    #102 <Method AppboyListAdapter AppboyXamarinFormsFeedFragment.access$500(AppboyXamarinFormsFeedFragment)>
						//  168  398:aload_0         
						//  169  399:getfield        #21  <Field FeedUpdatedEvent val$event>
						//  170  402:aload_0         
						//  171  403:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//  172  406:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//  173  409:invokestatic    #85  <Method EnumSet AppboyXamarinFormsFeedFragment.access$1000(AppboyXamarinFormsFeedFragment)>
						//  174  412:invokevirtual   #167 <Method java.util.List FeedUpdatedEvent.getFeedCards(EnumSet)>
						//  175  415:invokevirtual   #171 <Method void AppboyListAdapter.replaceFeed(java.util.List)>
								listView.setVisibility(0);
						//  176  418:aload_0         
						//  177  419:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//  178  422:getfield        #95  <Field ListView AppboyXamarinFormsFeedFragment$5.val$listView>
						//  179  425:iconst_0        
						//  180  426:invokevirtual   #98  <Method void ListView.setVisibility(int)>
							}
							mFeedSwipeLayout.setRefreshing(false);
						//  181  429:aload_0         
						//  182  430:getfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
						//  183  433:getfield        #57  <Field AppboyXamarinFormsFeedFragment AppboyXamarinFormsFeedFragment$5.this$0>
						//  184  436:invokestatic    #175 <Method SwipeRefreshLayout AppboyXamarinFormsFeedFragment.access$300(AppboyXamarinFormsFeedFragment)>
						//  185  439:iconst_0        
						//  186  440:invokevirtual   #181 <Method void SwipeRefreshLayout.setRefreshing(boolean)>
						//  187  443:return          
						}

						final _cls5 this$1;
						final FeedUpdatedEvent val$event;

			
			{
				this$1 = final__pcls5;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppboyXamarinFormsFeedFragment$5 this$1>
				event = FeedUpdatedEvent.this;
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

			
			{
				this$0 = AppboyXamarinFormsFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AppboyXamarinFormsFeedFragment this$0>
				listView = listview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ListView val$listView>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//   62  128:aload_0         
	//   63  129:new             #16  <Class AppboyXamarinFormsFeedFragment$5>
	//   64  132:dup             
	//   65  133:aload_0         
	//   66  134:aload_2         
	//   67  135:invokespecial   #242 <Method void AppboyXamarinFormsFeedFragment$5(AppboyXamarinFormsFeedFragment, ListView)>
	//   68  138:putfield        #231 <Field IEventSubscriber mFeedUpdatedSubscriber>
		mAppboy.subscribeToFeedUpdates(mFeedUpdatedSubscriber);
	//   69  141:aload_0         
	//   70  142:getfield        #120 <Field Appboy mAppboy>
	//   71  145:aload_0         
	//   72  146:getfield        #231 <Field IEventSubscriber mFeedUpdatedSubscriber>
	//   73  149:invokevirtual   #246 <Method void Appboy.subscribeToFeedUpdates(IEventSubscriber)>
		listView.setAdapter(((android.widget.ListAdapter) (mAdapter)));
	//   74  152:aload_2         
	//   75  153:aload_0         
	//   76  154:getfield        #138 <Field AppboyListAdapter mAdapter>
	//   77  157:invokevirtual   #250 <Method void ListView.setAdapter(android.widget.ListAdapter)>
		mAppboy.requestFeedRefreshFromCache();
	//   78  160:aload_0         
	//   79  161:getfield        #120 <Field Appboy mAppboy>
	//   80  164:invokevirtual   #253 <Method void Appboy.requestFeedRefreshFromCache()>
	//   81  167:return          
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #258 <Method void ListFragment.onAttach(Context)>
		mAppboy = Appboy.getInstance(context);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #262 <Method Appboy Appboy.getInstance(Context)>
	//    6   10:putfield        #120 <Field Appboy mAppboy>
		if(mAdapter == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #138 <Field AppboyListAdapter mAdapter>
	//*   9   17:ifnonnull       49
		{
			mAdapter = new AppboyListAdapter(context, R.id.tag, ((java.util.List) (new ArrayList())));
	//   10   20:aload_0         
	//   11   21:new             #150 <Class AppboyListAdapter>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:getstatic       #267 <Field int R$id.tag>
	//   15   29:new             #269 <Class ArrayList>
	//   16   32:dup             
	//   17   33:invokespecial   #270 <Method void ArrayList()>
	//   18   36:invokespecial   #273 <Method void AppboyListAdapter(Context, int, java.util.List)>
	//   19   39:putfield        #138 <Field AppboyListAdapter mAdapter>
			mCategories = CardCategory.getAllCategories();
	//   20   42:aload_0         
	//   21   43:invokestatic    #278 <Method EnumSet CardCategory.getAllCategories()>
	//   22   46:putfield        #109 <Field EnumSet mCategories>
		}
		setRetainInstance(true);
	//   23   49:aload_0         
	//   24   50:iconst_1        
	//   25   51:invokevirtual   #282 <Method void setRetainInstance(boolean)>
		mGestureDetector = new GestureDetectorCompat(context, ((android.view.GestureDetector.OnGestureListener) (new FeedGestureListener())));
	//   26   54:aload_0         
	//   27   55:new             #284 <Class GestureDetectorCompat>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:new             #22  <Class AppboyXamarinFormsFeedFragment$FeedGestureListener>
	//   31   63:dup             
	//   32   64:aload_0         
	//   33   65:invokespecial   #285 <Method void AppboyXamarinFormsFeedFragment$FeedGestureListener(AppboyXamarinFormsFeedFragment)>
	//   34   68:invokespecial   #288 <Method void GestureDetectorCompat(Context, android.view.GestureDetector$OnGestureListener)>
	//   35   71:putfield        #124 <Field GestureDetectorCompat mGestureDetector>
	//   36   74:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		layoutinflater = ((LayoutInflater) (layoutinflater.inflate(R.layout.com_appboy_feed, viewgroup, false)));
	//    0    0:aload_1         
	//    1    1:getstatic       #293 <Field int R$layout.com_appboy_feed>
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #296 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    5    9:astore_1        
		mNetworkErrorLayout = (LinearLayout)((View) (layoutinflater)).findViewById(R.id.com_appboy_feed_network_error);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getstatic       #299 <Field int R$id.com_appboy_feed_network_error>
	//    9   15:invokevirtual   #303 <Method View View.findViewById(int)>
	//   10   18:checkcast       #305 <Class LinearLayout>
	//   11   21:putfield        #105 <Field LinearLayout mNetworkErrorLayout>
		mLoadingSpinner = (ProgressBar)((View) (layoutinflater)).findViewById(R.id.com_appboy_feed_loading_spinner);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getstatic       #308 <Field int R$id.com_appboy_feed_loading_spinner>
	//   15   29:invokevirtual   #303 <Method View View.findViewById(int)>
	//   16   32:checkcast       #310 <Class ProgressBar>
	//   17   35:putfield        #101 <Field ProgressBar mLoadingSpinner>
		mEmptyFeedLayout = (LinearLayout)((View) (layoutinflater)).findViewById(R.id.com_appboy_feed_empty_feed);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:getstatic       #313 <Field int R$id.com_appboy_feed_empty_feed>
	//   21   43:invokevirtual   #303 <Method View View.findViewById(int)>
	//   22   46:checkcast       #305 <Class LinearLayout>
	//   23   49:putfield        #112 <Field LinearLayout mEmptyFeedLayout>
		mFeedRootLayout = (RelativeLayout)((View) (layoutinflater)).findViewById(R.id.com_appboy_feed_root);
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:getstatic       #316 <Field int R$id.com_appboy_feed_root>
	//   27   57:invokevirtual   #303 <Method View View.findViewById(int)>
	//   28   60:checkcast       #216 <Class RelativeLayout>
	//   29   63:putfield        #213 <Field RelativeLayout mFeedRootLayout>
		mFeedSwipeLayout = (SwipeRefreshLayout)((View) (layoutinflater)).findViewById(R.id.appboy_feed_swipe_container);
	//   30   66:aload_0         
	//   31   67:aload_1         
	//   32   68:getstatic       #319 <Field int R$id.appboy_feed_swipe_container>
	//   33   71:invokevirtual   #303 <Method View View.findViewById(int)>
	//   34   74:checkcast       #321 <Class SwipeRefreshLayout>
	//   35   77:putfield        #128 <Field SwipeRefreshLayout mFeedSwipeLayout>
		mFeedSwipeLayout.setOnRefreshListener(((android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener) (this)));
	//   36   80:aload_0         
	//   37   81:getfield        #128 <Field SwipeRefreshLayout mFeedSwipeLayout>
	//   38   84:aload_0         
	//   39   85:invokevirtual   #325 <Method void SwipeRefreshLayout.setOnRefreshListener(android.support.v4.widget.SwipeRefreshLayout$OnRefreshListener)>
		mFeedSwipeLayout.setEnabled(false);
	//   40   88:aload_0         
	//   41   89:getfield        #128 <Field SwipeRefreshLayout mFeedSwipeLayout>
	//   42   92:iconst_0        
	//   43   93:invokevirtual   #328 <Method void SwipeRefreshLayout.setEnabled(boolean)>
		mFeedSwipeLayout.setColorSchemeResources(new int[] {
			R.color.com_appboy_newsfeed_swipe_refresh_color_1, R.color.com_appboy_newsfeed_swipe_refresh_color_2, R.color.com_appboy_newsfeed_swipe_refresh_color_3, R.color.com_appboy_newsfeed_swipe_refresh_color_4
		});
	//   44   96:aload_0         
	//   45   97:getfield        #128 <Field SwipeRefreshLayout mFeedSwipeLayout>
	//   46  100:iconst_4        
	//   47  101:newarray        int[]
	//   48  103:dup             
	//   49  104:iconst_0        
	//   50  105:getstatic       #333 <Field int R$color.com_appboy_newsfeed_swipe_refresh_color_1>
	//   51  108:iastore         
	//   52  109:dup             
	//   53  110:iconst_1        
	//   54  111:getstatic       #336 <Field int R$color.com_appboy_newsfeed_swipe_refresh_color_2>
	//   55  114:iastore         
	//   56  115:dup             
	//   57  116:iconst_2        
	//   58  117:getstatic       #339 <Field int R$color.com_appboy_newsfeed_swipe_refresh_color_3>
	//   59  120:iastore         
	//   60  121:dup             
	//   61  122:iconst_3        
	//   62  123:getstatic       #342 <Field int R$color.com_appboy_newsfeed_swipe_refresh_color_4>
	//   63  126:iastore         
	//   64  127:invokevirtual   #346 <Method void SwipeRefreshLayout.setColorSchemeResources(int[])>
		mTransparentFullBoundsContainerView = ((View) (layoutinflater)).findViewById(R.id.com_appboy_feed_transparent_full_bounds_container_view);
	//   65  130:aload_0         
	//   66  131:aload_1         
	//   67  132:getstatic       #349 <Field int R$id.com_appboy_feed_transparent_full_bounds_container_view>
	//   68  135:invokevirtual   #303 <Method View View.findViewById(int)>
	//   69  138:putfield        #116 <Field View mTransparentFullBoundsContainerView>
		return ((View) (layoutinflater));
	//   70  141:aload_1         
	//   71  142:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #352 <Method void ListFragment.onDestroyView()>
		mAppboy.removeSingleSubscription(mFeedUpdatedSubscriber, com/appboy/events/FeedUpdatedEvent);
	//    2    4:aload_0         
	//    3    5:getfield        #120 <Field Appboy mAppboy>
	//    4    8:aload_0         
	//    5    9:getfield        #231 <Field IEventSubscriber mFeedUpdatedSubscriber>
	//    6   12:ldc1            #233 <Class FeedUpdatedEvent>
	//    7   14:invokevirtual   #239 <Method void Appboy.removeSingleSubscription(IEventSubscriber, Class)>
		setOnScreenCardsToRead();
	//    8   17:aload_0         
	//    9   18:invokespecial   #354 <Method void setOnScreenCardsToRead()>
	//   10   21:return          
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #357 <Method void ListFragment.onDetach()>
		setListAdapter(((android.widget.ListAdapter) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #360 <Method void setListAdapter(android.widget.ListAdapter)>
	//    5    9:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #363 <Method void ListFragment.onPause()>
		setOnScreenCardsToRead();
	//    2    4:aload_0         
	//    3    5:invokespecial   #354 <Method void setOnScreenCardsToRead()>
	//    4    8:return          
	}

	public void onRefresh()
	{
		mAppboy.requestFeedRefresh();
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field Appboy mAppboy>
	//    2    4:invokevirtual   #367 <Method void Appboy.requestFeedRefresh()>
		mMainThreadLooper.postDelayed(new Runnable() {

			public void run()
			{
				mFeedSwipeLayout.setRefreshing(false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
			//    2    4:invokestatic    #25  <Method SwipeRefreshLayout AppboyXamarinFormsFeedFragment.access$300(AppboyXamarinFormsFeedFragment)>
			//    3    7:iconst_0        
			//    4    8:invokevirtual   #31  <Method void SwipeRefreshLayout.setRefreshing(boolean)>
			//    5   11:return          
			}

			final AppboyXamarinFormsFeedFragment this$0;

			
			{
				this$0 = AppboyXamarinFormsFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyXamarinFormsFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 2500L);
	//    3    7:aload_0         
	//    4    8:getfield        #92  <Field Handler mMainThreadLooper>
	//    5   11:new             #20  <Class AppboyXamarinFormsFeedFragment$6>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #368 <Method void AppboyXamarinFormsFeedFragment$6(AppboyXamarinFormsFeedFragment)>
	//    9   19:ldc2w           #26  <Long 2500L>
	//   10   22:invokevirtual   #372 <Method boolean Handler.postDelayed(Runnable, long)>
	//   11   25:pop             
	//   12   26:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #375 <Method void ListFragment.onResume()>
		Appboy.getInstance(((Context) (getActivity()))).logFeedDisplayed();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #180 <Method Activity getActivity()>
	//    4    8:invokestatic    #262 <Method Appboy Appboy.getInstance(Context)>
	//    5   11:invokevirtual   #378 <Method void Appboy.logFeedDisplayed()>
	//    6   14:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #381 <Method void ListFragment.onSaveInstanceState(Bundle)>
		if(isVisible())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #385 <Method boolean isVisible()>
	//*   5    9:ifeq            17
			mSkipCardImpressionsReset = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #167 <Field boolean mSkipCardImpressionsReset>
	//    9   17:return          
	}

	public void setCategories(EnumSet enumset)
	{
		if(enumset == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       24
		{
			AppboyLogger.i(TAG, "The categories passed into setCategories are null, AppboyFeedFragment is going to display all the cards in cache.");
	//    2    4:getstatic       #75  <Field String TAG>
	//    3    7:ldc2            #389 <String "The categories passed into setCategories are null, AppboyFeedFragment is going to display all the cards in cache.">
	//    4   10:invokestatic    #392 <Method int AppboyLogger.i(String, String)>
	//    5   13:pop             
			mCategories = CardCategory.getAllCategories();
	//    6   14:aload_0         
	//    7   15:invokestatic    #278 <Method EnumSet CardCategory.getAllCategories()>
	//    8   18:putfield        #109 <Field EnumSet mCategories>
		} else
	//*   9   21:goto            59
		{
			if(enumset.isEmpty())
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #397 <Method boolean EnumSet.isEmpty()>
	//*  12   28:ifeq            42
			{
				AppboyLogger.w(TAG, "The categories set had no elements and have been ignored. Please pass a valid EnumSet of CardCategory.");
	//   13   31:getstatic       #75  <Field String TAG>
	//   14   34:ldc2            #399 <String "The categories set had no elements and have been ignored. Please pass a valid EnumSet of CardCategory.">
	//   15   37:invokestatic    #402 <Method int AppboyLogger.w(String, String)>
	//   16   40:pop             
				return;
	//   17   41:return          
			}
			if(enumset.equals(((Object) (mCategories))))
	//*  18   42:aload_1         
	//*  19   43:aload_0         
	//*  20   44:getfield        #109 <Field EnumSet mCategories>
	//*  21   47:invokevirtual   #406 <Method boolean EnumSet.equals(Object)>
	//*  22   50:ifeq            54
				return;
	//   23   53:return          
			mCategories = enumset;
	//   24   54:aload_0         
	//   25   55:aload_1         
	//   26   56:putfield        #109 <Field EnumSet mCategories>
		}
		enumset = ((EnumSet) (mAppboy));
	//   27   59:aload_0         
	//   28   60:getfield        #120 <Field Appboy mAppboy>
	//   29   63:astore_1        
		if(enumset != null)
	//*  30   64:aload_1         
	//*  31   65:ifnull          72
			((Appboy) (enumset)).requestFeedRefreshFromCache();
	//   32   68:aload_1         
	//   33   69:invokevirtual   #253 <Method void Appboy.requestFeedRefreshFromCache()>
	//   34   72:return          
	}

	public void setCategory(CardCategory cardcategory)
	{
		setCategories(EnumSet.of(((Enum) (cardcategory))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #413 <Method EnumSet EnumSet.of(Enum)>
	//    3    5:invokevirtual   #415 <Method void setCategories(EnumSet)>
	//    4    8:return          
	}

	private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500L;
	private static final int MAX_FEED_TTL_SECONDS = 60;
	private static final int NETWORK_PROBLEM_WARNING_MS = 5000;
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/AppboyXamarinFormsFeedFragment);
	private int currentCardIndexAtBottomOfScreen;
	private AppboyListAdapter mAdapter;
	private Appboy mAppboy;
	private EnumSet mCategories;
	private LinearLayout mEmptyFeedLayout;
	private RelativeLayout mFeedRootLayout;
	private SwipeRefreshLayout mFeedSwipeLayout;
	private IEventSubscriber mFeedUpdatedSubscriber;
	private GestureDetectorCompat mGestureDetector;
	private ProgressBar mLoadingSpinner;
	private final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
	private LinearLayout mNetworkErrorLayout;
	private final Runnable mShowNetworkError = new Runnable() {

		public void run()
		{
			if(mLoadingSpinner != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field AppboyXamarinFormsFeedFragment this$0>
		//*   2    4:invokestatic    #23  <Method ProgressBar AppboyXamarinFormsFeedFragment.access$000(AppboyXamarinFormsFeedFragment)>
		//*   3    7:ifnull          22
				mLoadingSpinner.setVisibility(8);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field AppboyXamarinFormsFeedFragment this$0>
		//    6   14:invokestatic    #23  <Method ProgressBar AppboyXamarinFormsFeedFragment.access$000(AppboyXamarinFormsFeedFragment)>
		//    7   17:bipush          8
		//    8   19:invokevirtual   #29  <Method void ProgressBar.setVisibility(int)>
			if(mNetworkErrorLayout != null)
		//*   9   22:aload_0         
		//*  10   23:getfield        #14  <Field AppboyXamarinFormsFeedFragment this$0>
		//*  11   26:invokestatic    #33  <Method LinearLayout AppboyXamarinFormsFeedFragment.access$100(AppboyXamarinFormsFeedFragment)>
		//*  12   29:ifnull          43
				mNetworkErrorLayout.setVisibility(0);
		//   13   32:aload_0         
		//   14   33:getfield        #14  <Field AppboyXamarinFormsFeedFragment this$0>
		//   15   36:invokestatic    #33  <Method LinearLayout AppboyXamarinFormsFeedFragment.access$100(AppboyXamarinFormsFeedFragment)>
		//   16   39:iconst_0        
		//   17   40:invokevirtual   #36  <Method void LinearLayout.setVisibility(int)>
		//   18   43:return          
		}

		final AppboyXamarinFormsFeedFragment this$0;

			
			{
				this$0 = AppboyXamarinFormsFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AppboyXamarinFormsFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private boolean mSkipCardImpressionsReset;
	private View mTransparentFullBoundsContainerView;
	private int previousVisibleHeadCardIndex;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyXamarinFormsFeedFragment>
	//    1    2:invokestatic    #73  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #75  <Field String TAG>
	//*   3    8:return          
	}


/*
	static ProgressBar access$000(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mLoadingSpinner;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field ProgressBar mLoadingSpinner>
	//    2    4:areturn         
	}

*/


/*
	static LinearLayout access$100(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mNetworkErrorLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field LinearLayout mNetworkErrorLayout>
	//    2    4:areturn         
	}

*/


/*
	static EnumSet access$1000(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mCategories;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field EnumSet mCategories>
	//    2    4:areturn         
	}

*/


/*
	static LinearLayout access$1100(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mEmptyFeedLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field LinearLayout mEmptyFeedLayout>
	//    2    4:areturn         
	}

*/


/*
	static View access$1200(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mTransparentFullBoundsContainerView;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field View mTransparentFullBoundsContainerView>
	//    2    4:areturn         
	}

*/


/*
	static Appboy access$1300(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mAppboy;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field Appboy mAppboy>
	//    2    4:areturn         
	}

*/


/*
	static GestureDetectorCompat access$200(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mGestureDetector;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field GestureDetectorCompat mGestureDetector>
	//    2    4:areturn         
	}

*/


/*
	static SwipeRefreshLayout access$300(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mFeedSwipeLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field SwipeRefreshLayout mFeedSwipeLayout>
	//    2    4:areturn         
	}

*/


/*
	static int access$400(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.previousVisibleHeadCardIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int previousVisibleHeadCardIndex>
	//    2    4:ireturn         
	}

*/


/*
	static int access$402(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment, int i)
	{
		appboyxamarinformsfeedfragment.previousVisibleHeadCardIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #132 <Field int previousVisibleHeadCardIndex>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static AppboyListAdapter access$500(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field AppboyListAdapter mAdapter>
	//    2    4:areturn         
	}

*/


/*
	static int access$602(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment, int i)
	{
		appboyxamarinformsfeedfragment.currentCardIndexAtBottomOfScreen = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #141 <Field int currentCardIndexAtBottomOfScreen>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static String access$700()
	{
		return TAG;
	//    0    0:getstatic       #75  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static Runnable access$800(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mShowNetworkError;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Runnable mShowNetworkError>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$900(AppboyXamarinFormsFeedFragment appboyxamarinformsfeedfragment)
	{
		return appboyxamarinformsfeedfragment.mMainThreadLooper;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Handler mMainThreadLooper>
	//    2    4:areturn         
	}

*/
}
