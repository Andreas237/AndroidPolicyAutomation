// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.integration.recyclerview;

import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.RequestManager;

// Referenced classes of package com.bumptech.glide.integration.recyclerview:
//			RecyclerToListViewScrollListener

public final class RecyclerViewPreloader extends android.support.v7.widget.RecyclerView.OnScrollListener
{

	public RecyclerViewPreloader(Activity activity, com.bumptech.glide.ListPreloader.PreloadModelProvider preloadmodelprovider, com.bumptech.glide.ListPreloader.PreloadSizeProvider preloadsizeprovider, int i)
	{
		this(Glide.with(activity), preloadmodelprovider, preloadsizeprovider, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #16  <Method RequestManager Glide.with(Activity)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokespecial   #19  <Method void RecyclerViewPreloader(RequestManager, com.bumptech.glide.ListPreloader$PreloadModelProvider, com.bumptech.glide.ListPreloader$PreloadSizeProvider, int)>
	//    7   12:return          
	}

	public RecyclerViewPreloader(Fragment fragment, com.bumptech.glide.ListPreloader.PreloadModelProvider preloadmodelprovider, com.bumptech.glide.ListPreloader.PreloadSizeProvider preloadsizeprovider, int i)
	{
		this(Glide.with(fragment), preloadmodelprovider, preloadsizeprovider, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #28  <Method RequestManager Glide.with(Fragment)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokespecial   #19  <Method void RecyclerViewPreloader(RequestManager, com.bumptech.glide.ListPreloader$PreloadModelProvider, com.bumptech.glide.ListPreloader$PreloadSizeProvider, int)>
	//    7   12:return          
	}

	public RecyclerViewPreloader(android.support.v4.app.Fragment fragment, com.bumptech.glide.ListPreloader.PreloadModelProvider preloadmodelprovider, com.bumptech.glide.ListPreloader.PreloadSizeProvider preloadsizeprovider, int i)
	{
		this(Glide.with(fragment), preloadmodelprovider, preloadsizeprovider, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #34  <Method RequestManager Glide.with(android.support.v4.app.Fragment)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokespecial   #19  <Method void RecyclerViewPreloader(RequestManager, com.bumptech.glide.ListPreloader$PreloadModelProvider, com.bumptech.glide.ListPreloader$PreloadSizeProvider, int)>
	//    7   12:return          
	}

	public RecyclerViewPreloader(FragmentActivity fragmentactivity, com.bumptech.glide.ListPreloader.PreloadModelProvider preloadmodelprovider, com.bumptech.glide.ListPreloader.PreloadSizeProvider preloadsizeprovider, int i)
	{
		this(Glide.with(fragmentactivity), preloadmodelprovider, preloadsizeprovider, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #39  <Method RequestManager Glide.with(FragmentActivity)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokespecial   #19  <Method void RecyclerViewPreloader(RequestManager, com.bumptech.glide.ListPreloader$PreloadModelProvider, com.bumptech.glide.ListPreloader$PreloadSizeProvider, int)>
	//    7   12:return          
	}

	public RecyclerViewPreloader(RequestManager requestmanager, com.bumptech.glide.ListPreloader.PreloadModelProvider preloadmodelprovider, com.bumptech.glide.ListPreloader.PreloadSizeProvider preloadsizeprovider, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void android.support.v7.widget.RecyclerView$OnScrollListener()>
		recyclerScrollListener = new RecyclerToListViewScrollListener(((android.widget.AbsListView.OnScrollListener) (new ListPreloader(requestmanager, preloadmodelprovider, preloadsizeprovider, i))));
	//    2    4:aload_0         
	//    3    5:new             #45  <Class RecyclerToListViewScrollListener>
	//    4    8:dup             
	//    5    9:new             #47  <Class ListPreloader>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iload           4
	//   11   18:invokespecial   #48  <Method void ListPreloader(RequestManager, com.bumptech.glide.ListPreloader$PreloadModelProvider, com.bumptech.glide.ListPreloader$PreloadSizeProvider, int)>
	//   12   21:invokespecial   #51  <Method void RecyclerToListViewScrollListener(android.widget.AbsListView$OnScrollListener)>
	//   13   24:putfield        #53  <Field RecyclerToListViewScrollListener recyclerScrollListener>
	//   14   27:return          
	}

	public void onScrolled(RecyclerView recyclerview, int i, int j)
	{
		recyclerScrollListener.onScrolled(recyclerview, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field RecyclerToListViewScrollListener recyclerScrollListener>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #58  <Method void RecyclerToListViewScrollListener.onScrolled(RecyclerView, int, int)>
	//    6   10:return          
	}

	private final RecyclerToListViewScrollListener recyclerScrollListener;
}
