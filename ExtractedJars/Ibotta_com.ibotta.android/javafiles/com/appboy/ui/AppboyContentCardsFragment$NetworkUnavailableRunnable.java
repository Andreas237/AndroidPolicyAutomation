// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.Toast;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.ui:
//			AppboyContentCardsFragment

private class AppboyContentCardsFragment$NetworkUnavailableRunnable
	implements Runnable
{

	public void run()
	{
		AppboyLogger.v(AppboyContentCardsFragment.access$300(), "Displaying network unavailable toast.");
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
		AppboyContentCardsFragment.access$600(((AppboyContentCardsFragment) (obj)), ((android.support.v7.widget.RecyclerView.Adapter) (AppboyContentCardsFragment.access$700(((AppboyContentCardsFragment) (obj))))));
	//   17   34:aload_1         
	//   18   35:aload_1         
	//   19   36:invokestatic    #64  <Method com.appboy.ui.contentcards.AppboyEmptyContentCardsAdapter AppboyContentCardsFragment.access$700(AppboyContentCardsFragment)>
	//   20   39:invokestatic    #68  <Method void AppboyContentCardsFragment.access$600(AppboyContentCardsFragment, android.support.v7.widget.RecyclerView$Adapter)>
		AppboyContentCardsFragment.access$100(AppboyContentCardsFragment.this).setRefreshing(false);
	//   21   42:aload_0         
	//   22   43:getfield        #17  <Field AppboyContentCardsFragment this$0>
	//   23   46:invokestatic    #72  <Method SwipeRefreshLayout AppboyContentCardsFragment.access$100(AppboyContentCardsFragment)>
	//   24   49:iconst_0        
	//   25   50:invokevirtual   #78  <Method void SwipeRefreshLayout.setRefreshing(boolean)>
	//   26   53:return          
	}

	private final Context mApplicationContext;
	final AppboyContentCardsFragment this$0;

	private AppboyContentCardsFragment$NetworkUnavailableRunnable(Context context)
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

	AppboyContentCardsFragment$NetworkUnavailableRunnable(Context context, AppboyContentCardsFragment._cls1 _pcls1)
	{
		this(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void AppboyContentCardsFragment$NetworkUnavailableRunnable(AppboyContentCardsFragment, Context)>
	//    4    6:return          
	}
}
