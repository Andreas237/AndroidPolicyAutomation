// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.app.Activity;
import android.content.Context;
import android.os.*;
import android.support.v4.app.ListFragment;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.*;
import android.widget.*;
import com.appboy.Appboy;
import com.appboy.enums.CardCategory;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.adapters.AppboyListAdapter;
import java.util.*;

public class AppboyFeedFragment extends ListFragment
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
		//   17   28:getfield        #13  <Field AppboyFeedFragment this$0>
		//   18   31:invokevirtual   #34  <Method ListView AppboyFeedFragment.getListView()>
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
		//    1    1:getfield        #13  <Field AppboyFeedFragment this$0>
		//    2    4:invokevirtual   #34  <Method ListView AppboyFeedFragment.getListView()>
		//    3    7:fload           4
		//    4    9:f2i             
		//    5   10:iconst_0        
		//    6   11:invokevirtual   #40  <Method void ListView.smoothScrollBy(int, int)>
			return true;
		//    7   14:iconst_1        
		//    8   15:ireturn         
		}

		final AppboyFeedFragment this$0;

		public FeedGestureListener()
		{
			this$0 = AppboyFeedFragment.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AppboyFeedFragment this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
		//    5    9:return          
		}
	}


	public AppboyFeedFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void ListFragment()>
	//    2    4:aload_0         
	//    3    5:new             #95  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #101 <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #104 <Method void Handler(Looper)>
	//    7   15:putfield        #106 <Field Handler mMainThreadLooper>
	//    8   18:aload_0         
	//    9   19:new             #8   <Class AppboyFeedFragment$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #109 <Method void AppboyFeedFragment$1(AppboyFeedFragment)>
	//   13   27:putfield        #111 <Field Runnable mShowNetworkError>
		mSortEnabled = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #113 <Field boolean mSortEnabled>
		mSkipCardImpressionsReset = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #115 <Field boolean mSkipCardImpressionsReset>
		mPreviousVisibleHeadCardIndex = 0;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #117 <Field int mPreviousVisibleHeadCardIndex>
		mCurrentCardIndexAtBottomOfScreen = 0;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #119 <Field int mCurrentCardIndexAtBottomOfScreen>
	//   26   50:return          
	}

	private void setOnScreenCardsToRead()
	{
		mAdapter.batchSetCardsToRead(mPreviousVisibleHeadCardIndex, mCurrentCardIndexAtBottomOfScreen);
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field AppboyListAdapter mAdapter>
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field int mPreviousVisibleHeadCardIndex>
	//    4    8:aload_0         
	//    5    9:getfield        #119 <Field int mCurrentCardIndexAtBottomOfScreen>
	//    6   12:invokevirtual   #165 <Method void AppboyListAdapter.batchSetCardsToRead(int, int)>
	//    7   15:return          
	}

	public EnumSet getCategories()
	{
		return mCategories;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field EnumSet mCategories>
	//    2    4:areturn         
	}

	public boolean getSortEnabled()
	{
		return mSortEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field boolean mSortEnabled>
	//    2    4:ireturn         
	}

	void loadFragmentStateFromSavedInstanceState(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(mCategories == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #155 <Field EnumSet mCategories>
	//*   5    9:ifnonnull       19
			mCategories = CardCategory.getAllCategories();
	//    6   12:aload_0         
	//    7   13:invokestatic    #178 <Method EnumSet CardCategory.getAllCategories()>
	//    8   16:putfield        #155 <Field EnumSet mCategories>
		mPreviousVisibleHeadCardIndex = bundle.getInt("PREVIOUS_VISIBLE_HEAD_CARD_INDEX", 0);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:ldc1            #45  <String "PREVIOUS_VISIBLE_HEAD_CARD_INDEX">
	//   12   23:iconst_0        
	//   13   24:invokevirtual   #184 <Method int Bundle.getInt(String, int)>
	//   14   27:putfield        #117 <Field int mPreviousVisibleHeadCardIndex>
		mCurrentCardIndexAtBottomOfScreen = bundle.getInt("CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN", 0);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:ldc1            #42  <String "CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN">
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #184 <Method int Bundle.getInt(String, int)>
	//   20   38:putfield        #119 <Field int mCurrentCardIndexAtBottomOfScreen>
		mSkipCardImpressionsReset = bundle.getBoolean("SKIP_CARD_IMPRESSIONS_RESET", false);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:ldc1            #48  <String "SKIP_CARD_IMPRESSIONS_RESET">
	//   24   45:iconst_0        
	//   25   46:invokevirtual   #188 <Method boolean Bundle.getBoolean(String, boolean)>
	//   26   49:putfield        #115 <Field boolean mSkipCardImpressionsReset>
		bundle = ((Bundle) (bundle.getStringArrayList("CARD_CATEGORY")));
	//   27   52:aload_1         
	//   28   53:ldc1            #38  <String "CARD_CATEGORY">
	//   29   55:invokevirtual   #192 <Method ArrayList Bundle.getStringArrayList(String)>
	//   30   58:astore_1        
		if(bundle != null)
	//*  31   59:aload_1         
	//*  32   60:ifnull          109
		{
			mCategories.clear();
	//   33   63:aload_0         
	//   34   64:getfield        #155 <Field EnumSet mCategories>
	//   35   67:invokevirtual   #197 <Method void EnumSet.clear()>
			String s;
			for(bundle = ((Bundle) (((ArrayList) (bundle)).iterator())); ((Iterator) (bundle)).hasNext(); mCategories.add(((Object) (CardCategory.valueOf(s)))))
	//*  36   70:aload_1         
	//*  37   71:invokevirtual   #203 <Method Iterator ArrayList.iterator()>
	//*  38   74:astore_1        
	//*  39   75:aload_1         
	//*  40   76:invokeinterface #208 <Method boolean Iterator.hasNext()>
	//*  41   81:ifeq            109
				s = (String)((Iterator) (bundle)).next();
	//   42   84:aload_1         
	//   43   85:invokeinterface #212 <Method Object Iterator.next()>
	//   44   90:checkcast       #214 <Class String>
	//   45   93:astore_2        

	//   46   94:aload_0         
	//   47   95:getfield        #155 <Field EnumSet mCategories>
	//   48   98:aload_2         
	//   49   99:invokestatic    #218 <Method CardCategory CardCategory.valueOf(String)>
	//   50  102:invokevirtual   #222 <Method boolean EnumSet.add(Object)>
	//   51  105:pop             
		}
	//*  52  106:goto            75
	//   53  109:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #229 <Method void ListFragment.onActivityCreated(Bundle)>
		loadFragmentStateFromSavedInstanceState(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #231 <Method void loadFragmentStateFromSavedInstanceState(Bundle)>
		if(mSkipCardImpressionsReset)
	//*   6   10:aload_0         
	//*   7   11:getfield        #115 <Field boolean mSkipCardImpressionsReset>
	//*   8   14:ifeq            25
		{
			mSkipCardImpressionsReset = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #115 <Field boolean mSkipCardImpressionsReset>
		} else
	//*  12   22:goto            41
		{
			mAdapter.resetCardImpressionTracker();
	//   13   25:aload_0         
	//   14   26:getfield        #145 <Field AppboyListAdapter mAdapter>
	//   15   29:invokevirtual   #234 <Method void AppboyListAdapter.resetCardImpressionTracker()>
			AppboyLogger.d(TAG, "Resetting card impressions.");
	//   16   32:getstatic       #89  <Field String TAG>
	//   17   35:ldc1            #236 <String "Resetting card impressions.">
	//   18   37:invokestatic    #240 <Method int AppboyLogger.d(String, String)>
	//   19   40:pop             
		}
		bundle = ((Bundle) (LayoutInflater.from(((Context) (getActivity())))));
	//   20   41:aload_0         
	//   21   42:invokevirtual   #244 <Method android.support.v4.app.FragmentActivity getActivity()>
	//   22   45:invokestatic    #250 <Method LayoutInflater LayoutInflater.from(Context)>
	//   23   48:astore_1        
		final ListView listView = getListView();
	//   24   49:aload_0         
	//   25   50:invokevirtual   #254 <Method ListView getListView()>
	//   26   53:astore_2        
		listView.addHeaderView(((LayoutInflater) (bundle)).inflate(R.layout.com_appboy_feed_header, ((ViewGroup) (null))));
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:getstatic       #259 <Field int R$layout.com_appboy_feed_header>
	//   30   59:aconst_null     
	//   31   60:invokevirtual   #263 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   32   63:invokevirtual   #269 <Method void ListView.addHeaderView(View)>
		listView.addFooterView(((LayoutInflater) (bundle)).inflate(R.layout.com_appboy_feed_footer, ((ViewGroup) (null))));
	//   33   66:aload_2         
	//   34   67:aload_1         
	//   35   68:getstatic       #272 <Field int R$layout.com_appboy_feed_footer>
	//   36   71:aconst_null     
	//   37   72:invokevirtual   #263 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   38   75:invokevirtual   #275 <Method void ListView.addFooterView(View)>
		mFeedRootLayout.setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view, MotionEvent motionevent)
			{
				return mGestureDetector.onTouchEvent(motionevent);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AppboyFeedFragment this$0>
			//    2    4:invokestatic    #27  <Method GestureDetectorCompat AppboyFeedFragment.access$200(AppboyFeedFragment)>
			//    3    7:aload_2         
			//    4    8:invokevirtual   #33  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
			//    5   11:ireturn         
			}

			final AppboyFeedFragment this$0;

			
			{
				this$0 = AppboyFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   39   78:aload_0         
	//   40   79:getfield        #277 <Field RelativeLayout mFeedRootLayout>
	//   41   82:new             #10  <Class AppboyFeedFragment$2>
	//   42   85:dup             
	//   43   86:aload_0         
	//   44   87:invokespecial   #278 <Method void AppboyFeedFragment$2(AppboyFeedFragment)>
	//   45   90:invokevirtual   #284 <Method void RelativeLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

			public void onScroll(AbsListView abslistview, int i, int j, int k)
			{
				abslistview = ((AbsListView) (mFeedSwipeLayout));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AppboyFeedFragment this$0>
			//    2    4:invokestatic    #27  <Method SwipeRefreshLayout AppboyFeedFragment.access$300(AppboyFeedFragment)>
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
				if(k > mPreviousVisibleHeadCardIndex)
			//*  21   37:iload           4
			//*  22   39:aload_0         
			//*  23   40:getfield        #17  <Field AppboyFeedFragment this$0>
			//*  24   43:getfield        #37  <Field int AppboyFeedFragment.mPreviousVisibleHeadCardIndex>
			//*  25   46:icmple          68
					mAdapter.batchSetCardsToRead(mPreviousVisibleHeadCardIndex, k);
			//   26   49:aload_0         
			//   27   50:getfield        #17  <Field AppboyFeedFragment this$0>
			//   28   53:invokestatic    #41  <Method AppboyListAdapter AppboyFeedFragment.access$400(AppboyFeedFragment)>
			//   29   56:aload_0         
			//   30   57:getfield        #17  <Field AppboyFeedFragment this$0>
			//   31   60:getfield        #37  <Field int AppboyFeedFragment.mPreviousVisibleHeadCardIndex>
			//   32   63:iload           4
			//   33   65:invokevirtual   #47  <Method void AppboyListAdapter.batchSetCardsToRead(int, int)>
				abslistview = ((AbsListView) (AppboyFeedFragment.this));
			//   34   68:aload_0         
			//   35   69:getfield        #17  <Field AppboyFeedFragment this$0>
			//   36   72:astore_1        
				abslistview.mPreviousVisibleHeadCardIndex = k;
			//   37   73:aload_1         
			//   38   74:iload           4
			//   39   76:putfield        #37  <Field int AppboyFeedFragment.mPreviousVisibleHeadCardIndex>
				abslistview.mCurrentCardIndexAtBottomOfScreen = i + j;
			//   40   79:aload_1         
			//   41   80:iload_2         
			//   42   81:iload_3         
			//   43   82:iadd            
			//   44   83:putfield        #50  <Field int AppboyFeedFragment.mCurrentCardIndexAtBottomOfScreen>
			//   45   86:return          
			}

			public void onScrollStateChanged(AbsListView abslistview, int i)
			{
			//    0    0:return          
			}

			final AppboyFeedFragment this$0;

			
			{
				this$0 = AppboyFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   46   93:aload_2         
	//   47   94:new             #12  <Class AppboyFeedFragment$3>
	//   48   97:dup             
	//   49   98:aload_0         
	//   50   99:invokespecial   #285 <Method void AppboyFeedFragment$3(AppboyFeedFragment)>
	//   51  102:invokevirtual   #289 <Method void ListView.setOnScrollListener(android.widget.AbsListView$OnScrollListener)>
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

			final AppboyFeedFragment this$0;

			
			{
				this$0 = AppboyFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   52  105:aload_0         
	//   53  106:getfield        #131 <Field View mTransparentFullBoundsContainerView>
	//   54  109:new             #14  <Class AppboyFeedFragment$4>
	//   55  112:dup             
	//   56  113:aload_0         
	//   57  114:invokespecial   #290 <Method void AppboyFeedFragment$4(AppboyFeedFragment)>
	//   58  117:invokevirtual   #293 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
		Appboy.getInstance(getContext()).removeSingleSubscription(mFeedUpdatedSubscriber, com/appboy/events/FeedUpdatedEvent);
	//   59  120:aload_0         
	//   60  121:invokevirtual   #297 <Method Context getContext()>
	//   61  124:invokestatic    #303 <Method Appboy Appboy.getInstance(Context)>
	//   62  127:aload_0         
	//   63  128:getfield        #305 <Field IEventSubscriber mFeedUpdatedSubscriber>
	//   64  131:ldc2            #307 <Class FeedUpdatedEvent>
	//   65  134:invokevirtual   #311 <Method void Appboy.removeSingleSubscription(IEventSubscriber, Class)>
		mFeedUpdatedSubscriber = new IEventSubscriber() {

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
					((Activity) (fragmentactivity)).runOnUiThread(((_cls1) (feedupdatedevent)). new Runnable() {

						public void run()
						{
							String s = AppboyFeedFragment.TAG;
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
							stringbuilder.append(((Object) (event)));
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
							mMainThreadLooper.removeCallbacks(mShowNetworkError);
						//   20   37:aload_0         
						//   21   38:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//   22   41:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//   23   44:invokestatic    #61  <Method Handler AppboyFeedFragment.access$700(AppboyFeedFragment)>
						//   24   47:aload_0         
						//   25   48:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//   26   51:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//   27   54:invokestatic    #65  <Method Runnable AppboyFeedFragment.access$600(AppboyFeedFragment)>
						//   28   57:invokevirtual   #71  <Method void Handler.removeCallbacks(Runnable)>
							mNetworkErrorLayout.setVisibility(8);
						//   29   60:aload_0         
						//   30   61:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//   31   64:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//   32   67:invokestatic    #75  <Method LinearLayout AppboyFeedFragment.access$100(AppboyFeedFragment)>
						//   33   70:bipush          8
						//   34   72:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
							if(event.getCardCount(mCategories) == 0)
						//*  35   75:aload_0         
						//*  36   76:getfield        #21  <Field FeedUpdatedEvent val$event>
						//*  37   79:aload_0         
						//*  38   80:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//*  39   83:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//*  40   86:invokestatic    #85  <Method EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
						//*  41   89:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(EnumSet)>
						//*  42   92:ifne            123
							{
								listView.setVisibility(8);
						//   43   95:aload_0         
						//   44   96:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//   45   99:getfield        #95  <Field ListView AppboyFeedFragment$5.val$listView>
						//   46  102:bipush          8
						//   47  104:invokevirtual   #98  <Method void ListView.setVisibility(int)>
								mAdapter.clear();
						//   48  107:aload_0         
						//   49  108:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//   50  111:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//   51  114:invokestatic    #102 <Method AppboyListAdapter AppboyFeedFragment.access$400(AppboyFeedFragment)>
						//   52  117:invokevirtual   #107 <Method void AppboyListAdapter.clear()>
							} else
						//*  53  120:goto            168
							{
								mEmptyFeedLayout.setVisibility(8);
						//   54  123:aload_0         
						//   55  124:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//   56  127:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//   57  130:invokestatic    #110 <Method LinearLayout AppboyFeedFragment.access$900(AppboyFeedFragment)>
						//   58  133:bipush          8
						//   59  135:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
								mLoadingSpinner.setVisibility(8);
						//   60  138:aload_0         
						//   61  139:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//   62  142:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//   63  145:invokestatic    #114 <Method ProgressBar AppboyFeedFragment.access$000(AppboyFeedFragment)>
						//   64  148:bipush          8
						//   65  150:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
								mTransparentFullBoundsContainerView.setVisibility(8);
						//   66  153:aload_0         
						//   67  154:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//   68  157:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//   69  160:invokestatic    #121 <Method View AppboyFeedFragment.access$1000(AppboyFeedFragment)>
						//   70  163:bipush          8
						//   71  165:invokevirtual   #124 <Method void View.setVisibility(int)>
							}
							if(event.isFromOfflineStorage() && (event.lastUpdatedInSecondsFromEpoch() + 60L) * 1000L < System.currentTimeMillis())
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
								AppboyLogger.i(AppboyFeedFragment.TAG, "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
						//   86  200:invokestatic    #32  <Method String AppboyFeedFragment.access$500()>
						//   87  203:ldc1            #143 <String "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.">
						//   88  205:invokestatic    #146 <Method int AppboyLogger.i(String, String)>
						//   89  208:pop             
								Appboy.getInstance(getContext()).requestFeedRefresh();
						//   90  209:aload_0         
						//   91  210:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//   92  213:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//   93  216:invokevirtual   #150 <Method Context AppboyFeedFragment.getContext()>
						//   94  219:invokestatic    #156 <Method Appboy Appboy.getInstance(Context)>
						//   95  222:invokevirtual   #159 <Method void Appboy.requestFeedRefresh()>
								if(event.getCardCount(mCategories) == 0)
						//*  96  225:aload_0         
						//*  97  226:getfield        #21  <Field FeedUpdatedEvent val$event>
						//*  98  229:aload_0         
						//*  99  230:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//* 100  233:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//* 101  236:invokestatic    #85  <Method EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
						//* 102  239:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(EnumSet)>
						//* 103  242:ifne            325
								{
									AppboyLogger.d(AppboyFeedFragment.TAG, "Old feed was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.");
						//  104  245:invokestatic    #32  <Method String AppboyFeedFragment.access$500()>
						//  105  248:ldc1            #161 <String "Old feed was empty, putting up a network spinner and registering the network error message on a delay of 5000ms.">
						//  106  250:invokestatic    #164 <Method int AppboyLogger.d(String, String)>
						//  107  253:pop             
									mEmptyFeedLayout.setVisibility(8);
						//  108  254:aload_0         
						//  109  255:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//  110  258:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//  111  261:invokestatic    #110 <Method LinearLayout AppboyFeedFragment.access$900(AppboyFeedFragment)>
						//  112  264:bipush          8
						//  113  266:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
									mLoadingSpinner.setVisibility(0);
						//  114  269:aload_0         
						//  115  270:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//  116  273:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//  117  276:invokestatic    #114 <Method ProgressBar AppboyFeedFragment.access$000(AppboyFeedFragment)>
						//  118  279:iconst_0        
						//  119  280:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
									mTransparentFullBoundsContainerView.setVisibility(0);
						//  120  283:aload_0         
						//  121  284:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//  122  287:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//  123  290:invokestatic    #121 <Method View AppboyFeedFragment.access$1000(AppboyFeedFragment)>
						//  124  293:iconst_0        
						//  125  294:invokevirtual   #124 <Method void View.setVisibility(int)>
									mMainThreadLooper.postDelayed(mShowNetworkError, 5000L);
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
							if(event.getCardCount(mCategories) == 0)
						//* 138  325:aload_0         
						//* 139  326:getfield        #21  <Field FeedUpdatedEvent val$event>
						//* 140  329:aload_0         
						//* 141  330:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//* 142  333:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//* 143  336:invokestatic    #85  <Method EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
						//* 144  339:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(EnumSet)>
						//* 145  342:ifne            391
							{
								mLoadingSpinner.setVisibility(8);
						//  146  345:aload_0         
						//  147  346:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//  148  349:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//  149  352:invokestatic    #114 <Method ProgressBar AppboyFeedFragment.access$000(AppboyFeedFragment)>
						//  150  355:bipush          8
						//  151  357:invokevirtual   #117 <Method void ProgressBar.setVisibility(int)>
								mEmptyFeedLayout.setVisibility(0);
						//  152  360:aload_0         
						//  153  361:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//  154  364:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//  155  367:invokestatic    #110 <Method LinearLayout AppboyFeedFragment.access$900(AppboyFeedFragment)>
						//  156  370:iconst_0        
						//  157  371:invokevirtual   #81  <Method void LinearLayout.setVisibility(int)>
								mTransparentFullBoundsContainerView.setVisibility(0);
						//  158  374:aload_0         
						//  159  375:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//  160  378:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//  161  381:invokestatic    #121 <Method View AppboyFeedFragment.access$1000(AppboyFeedFragment)>
						//  162  384:iconst_0        
						//  163  385:invokevirtual   #124 <Method void View.setVisibility(int)>
							} else
						//* 164  388:goto            525
							{
								if(mSortEnabled && event.getCardCount(mCategories) != event.getUnreadCardCount(mCategories))
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
						//* 175  415:invokestatic    #85  <Method EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
						//* 176  418:invokevirtual   #91  <Method int FeedUpdatedEvent.getCardCount(EnumSet)>
						//* 177  421:aload_0         
						//* 178  422:getfield        #21  <Field FeedUpdatedEvent val$event>
						//* 179  425:aload_0         
						//* 180  426:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//* 181  429:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//* 182  432:invokestatic    #85  <Method EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
						//* 183  435:invokevirtual   #177 <Method int FeedUpdatedEvent.getUnreadCardCount(EnumSet)>
						//* 184  438:icmpeq          484
									mAdapter.replaceFeed(sortFeedCards(event.getFeedCards(mCategories)));
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
						//  197  469:invokestatic    #85  <Method EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
						//  198  472:invokevirtual   #181 <Method List FeedUpdatedEvent.getFeedCards(EnumSet)>
						//  199  475:invokevirtual   #185 <Method List AppboyFeedFragment.sortFeedCards(List)>
						//  200  478:invokevirtual   #189 <Method void AppboyListAdapter.replaceFeed(List)>
								else
						//* 201  481:goto            514
									mAdapter.replaceFeed(event.getFeedCards(mCategories));
						//  202  484:aload_0         
						//  203  485:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//  204  488:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//  205  491:invokestatic    #102 <Method AppboyListAdapter AppboyFeedFragment.access$400(AppboyFeedFragment)>
						//  206  494:aload_0         
						//  207  495:getfield        #21  <Field FeedUpdatedEvent val$event>
						//  208  498:aload_0         
						//  209  499:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//  210  502:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//  211  505:invokestatic    #85  <Method EnumSet AppboyFeedFragment.access$800(AppboyFeedFragment)>
						//  212  508:invokevirtual   #181 <Method List FeedUpdatedEvent.getFeedCards(EnumSet)>
						//  213  511:invokevirtual   #189 <Method void AppboyListAdapter.replaceFeed(List)>
								listView.setVisibility(0);
						//  214  514:aload_0         
						//  215  515:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//  216  518:getfield        #95  <Field ListView AppboyFeedFragment$5.val$listView>
						//  217  521:iconst_0        
						//  218  522:invokevirtual   #98  <Method void ListView.setVisibility(int)>
							}
							mFeedSwipeLayout.setRefreshing(false);
						//  219  525:aload_0         
						//  220  526:getfield        #19  <Field AppboyFeedFragment$5 this$1>
						//  221  529:getfield        #57  <Field AppboyFeedFragment AppboyFeedFragment$5.this$0>
						//  222  532:invokestatic    #193 <Method SwipeRefreshLayout AppboyFeedFragment.access$300(AppboyFeedFragment)>
						//  223  535:iconst_0        
						//  224  536:invokevirtual   #199 <Method void SwipeRefreshLayout.setRefreshing(boolean)>
						//  225  539:return          
						}

						final _cls5 this$1;
						final FeedUpdatedEvent val$event;

			
			{
				this$1 = final__pcls5;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppboyFeedFragment$5 this$1>
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
				this$0 = AppboyFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AppboyFeedFragment this$0>
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
	//   66  137:aload_0         
	//   67  138:new             #16  <Class AppboyFeedFragment$5>
	//   68  141:dup             
	//   69  142:aload_0         
	//   70  143:aload_2         
	//   71  144:invokespecial   #314 <Method void AppboyFeedFragment$5(AppboyFeedFragment, ListView)>
	//   72  147:putfield        #305 <Field IEventSubscriber mFeedUpdatedSubscriber>
		Appboy.getInstance(getContext()).subscribeToFeedUpdates(mFeedUpdatedSubscriber);
	//   73  150:aload_0         
	//   74  151:invokevirtual   #297 <Method Context getContext()>
	//   75  154:invokestatic    #303 <Method Appboy Appboy.getInstance(Context)>
	//   76  157:aload_0         
	//   77  158:getfield        #305 <Field IEventSubscriber mFeedUpdatedSubscriber>
	//   78  161:invokevirtual   #318 <Method void Appboy.subscribeToFeedUpdates(IEventSubscriber)>
		listView.setAdapter(((android.widget.ListAdapter) (mAdapter)));
	//   79  164:aload_2         
	//   80  165:aload_0         
	//   81  166:getfield        #145 <Field AppboyListAdapter mAdapter>
	//   82  169:invokevirtual   #322 <Method void ListView.setAdapter(android.widget.ListAdapter)>
		Appboy.getInstance(getContext()).requestFeedRefreshFromCache();
	//   83  172:aload_0         
	//   84  173:invokevirtual   #297 <Method Context getContext()>
	//   85  176:invokestatic    #303 <Method Appboy Appboy.getInstance(Context)>
	//   86  179:invokevirtual   #325 <Method void Appboy.requestFeedRefreshFromCache()>
	//   87  182:return          
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #329 <Method void ListFragment.onAttach(Context)>
		if(mAdapter == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #145 <Field AppboyListAdapter mAdapter>
	//*   5    9:ifnonnull       41
		{
			mAdapter = new AppboyListAdapter(context, R.id.tag, ((List) (new ArrayList())));
	//    6   12:aload_0         
	//    7   13:new             #161 <Class AppboyListAdapter>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:getstatic       #334 <Field int R$id.tag>
	//   11   21:new             #199 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #335 <Method void ArrayList()>
	//   14   28:invokespecial   #338 <Method void AppboyListAdapter(Context, int, List)>
	//   15   31:putfield        #145 <Field AppboyListAdapter mAdapter>
			mCategories = CardCategory.getAllCategories();
	//   16   34:aload_0         
	//   17   35:invokestatic    #178 <Method EnumSet CardCategory.getAllCategories()>
	//   18   38:putfield        #155 <Field EnumSet mCategories>
		}
		mGestureDetector = new GestureDetectorCompat(context, ((android.view.GestureDetector.OnGestureListener) (new FeedGestureListener())));
	//   19   41:aload_0         
	//   20   42:new             #340 <Class GestureDetectorCompat>
	//   21   45:dup             
	//   22   46:aload_1         
	//   23   47:new             #24  <Class AppboyFeedFragment$FeedGestureListener>
	//   24   50:dup             
	//   25   51:aload_0         
	//   26   52:invokespecial   #341 <Method void AppboyFeedFragment$FeedGestureListener(AppboyFeedFragment)>
	//   27   55:invokespecial   #344 <Method void GestureDetectorCompat(Context, android.view.GestureDetector$OnGestureListener)>
	//   28   58:putfield        #137 <Field GestureDetectorCompat mGestureDetector>
	//   29   61:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		layoutinflater = ((LayoutInflater) (layoutinflater.inflate(R.layout.com_appboy_feed, viewgroup, false)));
	//    0    0:aload_1         
	//    1    1:getstatic       #349 <Field int R$layout.com_appboy_feed>
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #352 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    5    9:astore_1        
		mNetworkErrorLayout = (LinearLayout)((View) (layoutinflater)).findViewById(R.id.com_appboy_feed_network_error);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getstatic       #355 <Field int R$id.com_appboy_feed_network_error>
	//    9   15:invokevirtual   #359 <Method View View.findViewById(int)>
	//   10   18:checkcast       #361 <Class LinearLayout>
	//   11   21:putfield        #127 <Field LinearLayout mNetworkErrorLayout>
		mLoadingSpinner = (ProgressBar)((View) (layoutinflater)).findViewById(R.id.com_appboy_feed_loading_spinner);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getstatic       #364 <Field int R$id.com_appboy_feed_loading_spinner>
	//   15   29:invokevirtual   #359 <Method View View.findViewById(int)>
	//   16   32:checkcast       #366 <Class ProgressBar>
	//   17   35:putfield        #123 <Field ProgressBar mLoadingSpinner>
		mEmptyFeedLayout = (LinearLayout)((View) (layoutinflater)).findViewById(R.id.com_appboy_feed_empty_feed);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:getstatic       #369 <Field int R$id.com_appboy_feed_empty_feed>
	//   21   43:invokevirtual   #359 <Method View View.findViewById(int)>
	//   22   46:checkcast       #361 <Class LinearLayout>
	//   23   49:putfield        #158 <Field LinearLayout mEmptyFeedLayout>
		mFeedRootLayout = (RelativeLayout)((View) (layoutinflater)).findViewById(R.id.com_appboy_feed_root);
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:getstatic       #372 <Field int R$id.com_appboy_feed_root>
	//   27   57:invokevirtual   #359 <Method View View.findViewById(int)>
	//   28   60:checkcast       #280 <Class RelativeLayout>
	//   29   63:putfield        #277 <Field RelativeLayout mFeedRootLayout>
		mFeedSwipeLayout = (SwipeRefreshLayout)((View) (layoutinflater)).findViewById(R.id.appboy_feed_swipe_container);
	//   30   66:aload_0         
	//   31   67:aload_1         
	//   32   68:getstatic       #375 <Field int R$id.appboy_feed_swipe_container>
	//   33   71:invokevirtual   #359 <Method View View.findViewById(int)>
	//   34   74:checkcast       #377 <Class SwipeRefreshLayout>
	//   35   77:putfield        #141 <Field SwipeRefreshLayout mFeedSwipeLayout>
		mFeedSwipeLayout.setOnRefreshListener(((android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener) (this)));
	//   36   80:aload_0         
	//   37   81:getfield        #141 <Field SwipeRefreshLayout mFeedSwipeLayout>
	//   38   84:aload_0         
	//   39   85:invokevirtual   #381 <Method void SwipeRefreshLayout.setOnRefreshListener(android.support.v4.widget.SwipeRefreshLayout$OnRefreshListener)>
		mFeedSwipeLayout.setEnabled(false);
	//   40   88:aload_0         
	//   41   89:getfield        #141 <Field SwipeRefreshLayout mFeedSwipeLayout>
	//   42   92:iconst_0        
	//   43   93:invokevirtual   #385 <Method void SwipeRefreshLayout.setEnabled(boolean)>
		mFeedSwipeLayout.setColorSchemeResources(new int[] {
			R.color.com_appboy_newsfeed_swipe_refresh_color_1, R.color.com_appboy_newsfeed_swipe_refresh_color_2, R.color.com_appboy_newsfeed_swipe_refresh_color_3, R.color.com_appboy_newsfeed_swipe_refresh_color_4
		});
	//   44   96:aload_0         
	//   45   97:getfield        #141 <Field SwipeRefreshLayout mFeedSwipeLayout>
	//   46  100:iconst_4        
	//   47  101:newarray        int[]
	//   48  103:dup             
	//   49  104:iconst_0        
	//   50  105:getstatic       #390 <Field int R$color.com_appboy_newsfeed_swipe_refresh_color_1>
	//   51  108:iastore         
	//   52  109:dup             
	//   53  110:iconst_1        
	//   54  111:getstatic       #393 <Field int R$color.com_appboy_newsfeed_swipe_refresh_color_2>
	//   55  114:iastore         
	//   56  115:dup             
	//   57  116:iconst_2        
	//   58  117:getstatic       #396 <Field int R$color.com_appboy_newsfeed_swipe_refresh_color_3>
	//   59  120:iastore         
	//   60  121:dup             
	//   61  122:iconst_3        
	//   62  123:getstatic       #399 <Field int R$color.com_appboy_newsfeed_swipe_refresh_color_4>
	//   63  126:iastore         
	//   64  127:invokevirtual   #403 <Method void SwipeRefreshLayout.setColorSchemeResources(int[])>
		mTransparentFullBoundsContainerView = ((View) (layoutinflater)).findViewById(R.id.com_appboy_feed_transparent_full_bounds_container_view);
	//   65  130:aload_0         
	//   66  131:aload_1         
	//   67  132:getstatic       #406 <Field int R$id.com_appboy_feed_transparent_full_bounds_container_view>
	//   68  135:invokevirtual   #359 <Method View View.findViewById(int)>
	//   69  138:putfield        #131 <Field View mTransparentFullBoundsContainerView>
		return ((View) (layoutinflater));
	//   70  141:aload_1         
	//   71  142:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #409 <Method void ListFragment.onDestroyView()>
		Appboy.getInstance(getContext()).removeSingleSubscription(mFeedUpdatedSubscriber, com/appboy/events/FeedUpdatedEvent);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #297 <Method Context getContext()>
	//    4    8:invokestatic    #303 <Method Appboy Appboy.getInstance(Context)>
	//    5   11:aload_0         
	//    6   12:getfield        #305 <Field IEventSubscriber mFeedUpdatedSubscriber>
	//    7   15:ldc2            #307 <Class FeedUpdatedEvent>
	//    8   18:invokevirtual   #311 <Method void Appboy.removeSingleSubscription(IEventSubscriber, Class)>
		setOnScreenCardsToRead();
	//    9   21:aload_0         
	//   10   22:invokespecial   #411 <Method void setOnScreenCardsToRead()>
	//   11   25:return          
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #414 <Method void ListFragment.onDetach()>
		setListAdapter(((android.widget.ListAdapter) (null)));
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #417 <Method void setListAdapter(android.widget.ListAdapter)>
	//    5    9:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #420 <Method void ListFragment.onPause()>
		setOnScreenCardsToRead();
	//    2    4:aload_0         
	//    3    5:invokespecial   #411 <Method void setOnScreenCardsToRead()>
	//    4    8:return          
	}

	public void onRefresh()
	{
		Appboy.getInstance(getContext()).requestFeedRefresh();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #297 <Method Context getContext()>
	//    2    4:invokestatic    #303 <Method Appboy Appboy.getInstance(Context)>
	//    3    7:invokevirtual   #424 <Method void Appboy.requestFeedRefresh()>
		mMainThreadLooper.postDelayed(new Runnable() {

			public void run()
			{
				mFeedSwipeLayout.setRefreshing(false);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AppboyFeedFragment this$0>
			//    2    4:invokestatic    #25  <Method SwipeRefreshLayout AppboyFeedFragment.access$300(AppboyFeedFragment)>
			//    3    7:iconst_0        
			//    4    8:invokevirtual   #31  <Method void SwipeRefreshLayout.setRefreshing(boolean)>
			//    5   11:return          
			}

			final AppboyFeedFragment this$0;

			
			{
				this$0 = AppboyFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 2500L);
	//    4   10:aload_0         
	//    5   11:getfield        #106 <Field Handler mMainThreadLooper>
	//    6   14:new             #22  <Class AppboyFeedFragment$7>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokespecial   #425 <Method void AppboyFeedFragment$7(AppboyFeedFragment)>
	//   10   22:ldc2w           #28  <Long 2500L>
	//   11   25:invokevirtual   #429 <Method boolean Handler.postDelayed(Runnable, long)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #432 <Method void ListFragment.onResume()>
		Appboy.getInstance(((Context) (getActivity()))).logFeedDisplayed();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #244 <Method android.support.v4.app.FragmentActivity getActivity()>
	//    4    8:invokestatic    #303 <Method Appboy Appboy.getInstance(Context)>
	//    5   11:invokevirtual   #435 <Method void Appboy.logFeedDisplayed()>
	//    6   14:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		bundle.putInt("PREVIOUS_VISIBLE_HEAD_CARD_INDEX", mPreviousVisibleHeadCardIndex);
	//    0    0:aload_1         
	//    1    1:ldc1            #45  <String "PREVIOUS_VISIBLE_HEAD_CARD_INDEX">
	//    2    3:aload_0         
	//    3    4:getfield        #117 <Field int mPreviousVisibleHeadCardIndex>
	//    4    7:invokevirtual   #440 <Method void Bundle.putInt(String, int)>
		bundle.putInt("CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN", mCurrentCardIndexAtBottomOfScreen);
	//    5   10:aload_1         
	//    6   11:ldc1            #42  <String "CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN">
	//    7   13:aload_0         
	//    8   14:getfield        #119 <Field int mCurrentCardIndexAtBottomOfScreen>
	//    9   17:invokevirtual   #440 <Method void Bundle.putInt(String, int)>
		bundle.putBoolean("SKIP_CARD_IMPRESSIONS_RESET", mSkipCardImpressionsReset);
	//   10   20:aload_1         
	//   11   21:ldc1            #48  <String "SKIP_CARD_IMPRESSIONS_RESET">
	//   12   23:aload_0         
	//   13   24:getfield        #115 <Field boolean mSkipCardImpressionsReset>
	//   14   27:invokevirtual   #444 <Method void Bundle.putBoolean(String, boolean)>
		if(mCategories == null)
	//*  15   30:aload_0         
	//*  16   31:getfield        #155 <Field EnumSet mCategories>
	//*  17   34:ifnonnull       44
			mCategories = CardCategory.getAllCategories();
	//   18   37:aload_0         
	//   19   38:invokestatic    #178 <Method EnumSet CardCategory.getAllCategories()>
	//   20   41:putfield        #155 <Field EnumSet mCategories>
		ArrayList arraylist = new ArrayList(mCategories.size());
	//   21   44:new             #199 <Class ArrayList>
	//   22   47:dup             
	//   23   48:aload_0         
	//   24   49:getfield        #155 <Field EnumSet mCategories>
	//   25   52:invokevirtual   #448 <Method int EnumSet.size()>
	//   26   55:invokespecial   #451 <Method void ArrayList(int)>
	//   27   58:astore_2        
		for(Iterator iterator = mCategories.iterator(); iterator.hasNext(); arraylist.add(((Object) (((CardCategory)iterator.next()).name()))));
	//   28   59:aload_0         
	//   29   60:getfield        #155 <Field EnumSet mCategories>
	//   30   63:invokevirtual   #452 <Method Iterator EnumSet.iterator()>
	//   31   66:astore_3        
	//   32   67:aload_3         
	//   33   68:invokeinterface #208 <Method boolean Iterator.hasNext()>
	//   34   73:ifeq            96
	//   35   76:aload_2         
	//   36   77:aload_3         
	//   37   78:invokeinterface #212 <Method Object Iterator.next()>
	//   38   83:checkcast       #175 <Class CardCategory>
	//   39   86:invokevirtual   #455 <Method String CardCategory.name()>
	//   40   89:invokevirtual   #456 <Method boolean ArrayList.add(Object)>
	//   41   92:pop             
	//*  42   93:goto            67
		bundle.putStringArrayList("CARD_CATEGORY", arraylist);
	//   43   96:aload_1         
	//   44   97:ldc1            #38  <String "CARD_CATEGORY">
	//   45   99:aload_2         
	//   46  100:invokevirtual   #460 <Method void Bundle.putStringArrayList(String, ArrayList)>
		super.onSaveInstanceState(bundle);
	//   47  103:aload_0         
	//   48  104:aload_1         
	//   49  105:invokespecial   #462 <Method void ListFragment.onSaveInstanceState(Bundle)>
		if(isVisible())
	//*  50  108:aload_0         
	//*  51  109:invokevirtual   #465 <Method boolean isVisible()>
	//*  52  112:ifeq            120
			mSkipCardImpressionsReset = true;
	//   53  115:aload_0         
	//   54  116:iconst_1        
	//   55  117:putfield        #115 <Field boolean mSkipCardImpressionsReset>
	//   56  120:return          
	}

	public void setCategories(EnumSet enumset)
	{
		if(enumset == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       24
		{
			AppboyLogger.i(TAG, "The categories passed into setCategories are null, AppboyFeedFragment is going to display all the cards in cache.");
	//    2    4:getstatic       #89  <Field String TAG>
	//    3    7:ldc2            #469 <String "The categories passed into setCategories are null, AppboyFeedFragment is going to display all the cards in cache.">
	//    4   10:invokestatic    #472 <Method int AppboyLogger.i(String, String)>
	//    5   13:pop             
			mCategories = CardCategory.getAllCategories();
	//    6   14:aload_0         
	//    7   15:invokestatic    #178 <Method EnumSet CardCategory.getAllCategories()>
	//    8   18:putfield        #155 <Field EnumSet mCategories>
		} else
	//*   9   21:goto            59
		{
			if(enumset.isEmpty())
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #475 <Method boolean EnumSet.isEmpty()>
	//*  12   28:ifeq            42
			{
				AppboyLogger.w(TAG, "The categories set had no elements and have been ignored. Please pass a valid EnumSet of CardCategory.");
	//   13   31:getstatic       #89  <Field String TAG>
	//   14   34:ldc2            #477 <String "The categories set had no elements and have been ignored. Please pass a valid EnumSet of CardCategory.">
	//   15   37:invokestatic    #480 <Method int AppboyLogger.w(String, String)>
	//   16   40:pop             
				return;
	//   17   41:return          
			}
			if(enumset.equals(((Object) (mCategories))))
	//*  18   42:aload_1         
	//*  19   43:aload_0         
	//*  20   44:getfield        #155 <Field EnumSet mCategories>
	//*  21   47:invokevirtual   #483 <Method boolean EnumSet.equals(Object)>
	//*  22   50:ifeq            54
				return;
	//   23   53:return          
			mCategories = enumset;
	//   24   54:aload_0         
	//   25   55:aload_1         
	//   26   56:putfield        #155 <Field EnumSet mCategories>
		}
		if(Appboy.getInstance(getContext()) != null)
	//*  27   59:aload_0         
	//*  28   60:invokevirtual   #297 <Method Context getContext()>
	//*  29   63:invokestatic    #303 <Method Appboy Appboy.getInstance(Context)>
	//*  30   66:ifnull          79
			Appboy.getInstance(getContext()).requestFeedRefreshFromCache();
	//   31   69:aload_0         
	//   32   70:invokevirtual   #297 <Method Context getContext()>
	//   33   73:invokestatic    #303 <Method Appboy Appboy.getInstance(Context)>
	//   34   76:invokevirtual   #325 <Method void Appboy.requestFeedRefreshFromCache()>
	//   35   79:return          
	}

	public void setCategory(CardCategory cardcategory)
	{
		setCategories(EnumSet.of(((Enum) (cardcategory))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #490 <Method EnumSet EnumSet.of(Enum)>
	//    3    5:invokevirtual   #492 <Method void setCategories(EnumSet)>
	//    4    8:return          
	}

	public void setSortEnabled(boolean flag)
	{
		mSortEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #113 <Field boolean mSortEnabled>
	//    3    5:return          
	}

	public List sortFeedCards(List list)
	{
		Collections.sort(list, new Comparator() {

			public int compare(Card card, Card card1)
			{
				if(card.isRead() == card1.isRead())
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #30  <Method boolean Card.isRead()>
			//*   2    4:aload_2         
			//*   3    5:invokevirtual   #30  <Method boolean Card.isRead()>
			//*   4    8:icmpne          13
					return 0;
			//    5   11:iconst_0        
			//    6   12:ireturn         
				return !card.isRead() ? -1 : 1;
			//    7   13:aload_1         
			//    8   14:invokevirtual   #30  <Method boolean Card.isRead()>
			//    9   17:ifeq            22
			//   10   20:iconst_1        
			//   11   21:ireturn         
			//   12   22:iconst_m1       
			//   13   23:ireturn         
			}

			public volatile int compare(Object obj, Object obj1)
			{
				return compare((Card)obj, (Card)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Card>
			//    3    5:aload_2         
			//    4    6:checkcast       #26  <Class Card>
			//    5    9:invokevirtual   #33  <Method int compare(Card, Card)>
			//    6   12:ireturn         
			}

			final AppboyFeedFragment this$0;

			
			{
				this$0 = AppboyFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AppboyFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_1         
	//    1    1:new             #20  <Class AppboyFeedFragment$6>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #496 <Method void AppboyFeedFragment$6(AppboyFeedFragment)>
	//    5    9:invokestatic    #502 <Method void Collections.sort(List, Comparator)>
		return list;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500L;
	private static final int MAX_FEED_TTL_SECONDS = 60;
	private static final int NETWORK_PROBLEM_WARNING_MS = 5000;
	static final String SAVED_INSTANCE_STATE_KEY_CARD_CATEGORY = "CARD_CATEGORY";
	static final String SAVED_INSTANCE_STATE_KEY_CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN = "CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN";
	static final String SAVED_INSTANCE_STATE_KEY_PREVIOUS_VISIBLE_HEAD_CARD_INDEX = "PREVIOUS_VISIBLE_HEAD_CARD_INDEX";
	static final String SAVED_INSTANCE_STATE_KEY_SKIP_CARD_IMPRESSIONS_RESET = "SKIP_CARD_IMPRESSIONS_RESET";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/AppboyFeedFragment);
	private AppboyListAdapter mAdapter;
	private EnumSet mCategories;
	int mCurrentCardIndexAtBottomOfScreen;
	private LinearLayout mEmptyFeedLayout;
	private RelativeLayout mFeedRootLayout;
	private SwipeRefreshLayout mFeedSwipeLayout;
	private IEventSubscriber mFeedUpdatedSubscriber;
	private GestureDetectorCompat mGestureDetector;
	private ProgressBar mLoadingSpinner;
	private final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
	private LinearLayout mNetworkErrorLayout;
	int mPreviousVisibleHeadCardIndex;
	private final Runnable mShowNetworkError = new Runnable() {

		public void run()
		{
			if(mLoadingSpinner != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field AppboyFeedFragment this$0>
		//*   2    4:invokestatic    #23  <Method ProgressBar AppboyFeedFragment.access$000(AppboyFeedFragment)>
		//*   3    7:ifnull          22
				mLoadingSpinner.setVisibility(8);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field AppboyFeedFragment this$0>
		//    6   14:invokestatic    #23  <Method ProgressBar AppboyFeedFragment.access$000(AppboyFeedFragment)>
		//    7   17:bipush          8
		//    8   19:invokevirtual   #29  <Method void ProgressBar.setVisibility(int)>
			if(mNetworkErrorLayout != null)
		//*   9   22:aload_0         
		//*  10   23:getfield        #14  <Field AppboyFeedFragment this$0>
		//*  11   26:invokestatic    #33  <Method LinearLayout AppboyFeedFragment.access$100(AppboyFeedFragment)>
		//*  12   29:ifnull          43
				mNetworkErrorLayout.setVisibility(0);
		//   13   32:aload_0         
		//   14   33:getfield        #14  <Field AppboyFeedFragment this$0>
		//   15   36:invokestatic    #33  <Method LinearLayout AppboyFeedFragment.access$100(AppboyFeedFragment)>
		//   16   39:iconst_0        
		//   17   40:invokevirtual   #36  <Method void LinearLayout.setVisibility(int)>
		//   18   43:return          
		}

		final AppboyFeedFragment this$0;

			
			{
				this$0 = AppboyFeedFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AppboyFeedFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	boolean mSkipCardImpressionsReset;
	private boolean mSortEnabled;
	private View mTransparentFullBoundsContainerView;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyFeedFragment>
	//    1    2:invokestatic    #87  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #89  <Field String TAG>
	//*   3    8:return          
	}


/*
	static ProgressBar access$000(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mLoadingSpinner;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field ProgressBar mLoadingSpinner>
	//    2    4:areturn         
	}

*/


/*
	static LinearLayout access$100(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mNetworkErrorLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field LinearLayout mNetworkErrorLayout>
	//    2    4:areturn         
	}

*/


/*
	static View access$1000(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mTransparentFullBoundsContainerView;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field View mTransparentFullBoundsContainerView>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1100(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mSortEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field boolean mSortEnabled>
	//    2    4:ireturn         
	}

*/


/*
	static GestureDetectorCompat access$200(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mGestureDetector;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field GestureDetectorCompat mGestureDetector>
	//    2    4:areturn         
	}

*/


/*
	static SwipeRefreshLayout access$300(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mFeedSwipeLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field SwipeRefreshLayout mFeedSwipeLayout>
	//    2    4:areturn         
	}

*/


/*
	static AppboyListAdapter access$400(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field AppboyListAdapter mAdapter>
	//    2    4:areturn         
	}

*/


/*
	static String access$500()
	{
		return TAG;
	//    0    0:getstatic       #89  <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static Runnable access$600(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mShowNetworkError;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Runnable mShowNetworkError>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$700(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mMainThreadLooper;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Handler mMainThreadLooper>
	//    2    4:areturn         
	}

*/


/*
	static EnumSet access$800(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mCategories;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field EnumSet mCategories>
	//    2    4:areturn         
	}

*/


/*
	static LinearLayout access$900(AppboyFeedFragment appboyfeedfragment)
	{
		return appboyfeedfragment.mEmptyFeedLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field LinearLayout mEmptyFeedLayout>
	//    2    4:areturn         
	}

*/
}
