// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading;

import android.support.v4.widget.SwipeRefreshLayout;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.base.loading:
//			LoadingMvpActivity, LoadingMvpView, LoadingMvpPresenter

public abstract class PtrLoadingMvpActivity extends LoadingMvpActivity
	implements LoadingMvpView
{

	public PtrLoadingMvpActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void LoadingMvpActivity()>
		isLoadingEnabled = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #15  <Field boolean isLoadingEnabled>
	//    5    9:return          
	}

	public abstract SwipeRefreshLayout getPtrView();

	public void hideScreenLoading()
	{
		SwipeRefreshLayout swiperefreshlayout = getPtrView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SwipeRefreshLayout getPtrView()>
	//    2    4:astore_1        
		if(swiperefreshlayout != null && swiperefreshlayout.isRefreshing())
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #28  <Method boolean SwipeRefreshLayout.isRefreshing()>
	//*   7   13:ifeq            22
		{
			swiperefreshlayout.setRefreshing(false);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #32  <Method void SwipeRefreshLayout.setRefreshing(boolean)>
			return;
	//   11   21:return          
		} else
		{
			super.hideScreenLoading();
	//   12   22:aload_0         
	//   13   23:invokespecial   #34  <Method void LoadingMvpActivity.hideScreenLoading()>
			return;
	//   14   26:return          
		}
	}

	protected void onRefresh()
	{
		Timber.d("onRefresh", new Object[0]);
	//    0    0:ldc1            #36  <String "onRefresh">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #44  <Method void Timber.d(String, Object[])>
		if(((LoadingMvpPresenter)mvpPresenter).isLoading())
	//*   4    9:aload_0         
	//*   5   10:getfield        #48  <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//*   6   13:checkcast       #50  <Class LoadingMvpPresenter>
	//*   7   16:invokeinterface #53  <Method boolean LoadingMvpPresenter.isLoading()>
	//*   8   21:ifeq            25
		{
			return;
	//    9   24:return          
		} else
		{
			((LoadingMvpPresenter)mvpPresenter).onRefresh();
	//   10   25:aload_0         
	//   11   26:getfield        #48  <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   12   29:checkcast       #50  <Class LoadingMvpPresenter>
	//   13   32:invokeinterface #55  <Method void LoadingMvpPresenter.onRefresh()>
			return;
	//   14   37:return          
		}
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void LoadingMvpActivity.onStart()>
		SwipeRefreshLayout swiperefreshlayout = getPtrView();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #22  <Method SwipeRefreshLayout getPtrView()>
	//    4    8:astore_1        
		if(swiperefreshlayout != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          48
		{
			swiperefreshlayout.setSize(0);
	//    7   13:aload_1         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #62  <Method void SwipeRefreshLayout.setSize(int)>
			swiperefreshlayout.setColorSchemeResources(new int[] {
				0x7f060171
			});
	//   10   18:aload_1         
	//   11   19:iconst_1        
	//   12   20:newarray        int[]
	//   13   22:dup             
	//   14   23:iconst_0        
	//   15   24:ldc1            #63  <Int 0x7f060171>
	//   16   26:iastore         
	//   17   27:invokevirtual   #67  <Method void SwipeRefreshLayout.setColorSchemeResources(int[])>
			swiperefreshlayout.setProgressBackgroundColorSchemeResource(0x7f060027);
	//   18   30:aload_1         
	//   19   31:ldc1            #68  <Int 0x7f060027>
	//   20   33:invokevirtual   #71  <Method void SwipeRefreshLayout.setProgressBackgroundColorSchemeResource(int)>
			swiperefreshlayout.setOnRefreshListener(((android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener) (new _2D_..Lambda.cdbd7hSIkV3RB2sbMR37wheYWsM(this))));
	//   21   36:aload_1         
	//   22   37:new             #73  <Class _2D_$$Lambda$cdbd7hSIkV3RB2sbMR37wheYWsM>
	//   23   40:dup             
	//   24   41:aload_0         
	//   25   42:invokespecial   #76  <Method void _2D_$$Lambda$cdbd7hSIkV3RB2sbMR37wheYWsM(PtrLoadingMvpActivity)>
	//   26   45:invokevirtual   #80  <Method void SwipeRefreshLayout.setOnRefreshListener(android.support.v4.widget.SwipeRefreshLayout$OnRefreshListener)>
		}
	//   27   48:return          
	}

	public void onStop()
	{
		SwipeRefreshLayout swiperefreshlayout = getPtrView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SwipeRefreshLayout getPtrView()>
	//    2    4:astore_1        
		if(swiperefreshlayout != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			swiperefreshlayout.setOnRefreshListener(((android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener) (null)));
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #80  <Method void SwipeRefreshLayout.setOnRefreshListener(android.support.v4.widget.SwipeRefreshLayout$OnRefreshListener)>
		super.onStop();
	//    8   14:aload_0         
	//    9   15:invokespecial   #83  <Method void LoadingMvpActivity.onStop()>
	//   10   18:return          
	}

	protected void setLoadingEnabled(boolean flag)
	{
		isLoadingEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #15  <Field boolean isLoadingEnabled>
	//    3    5:return          
	}

	protected void showPtrLoading(SwipeRefreshLayout swiperefreshlayout)
	{
		if(swiperefreshlayout != null && !swiperefreshlayout.isRefreshing() && isLoadingEnabled)
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #28  <Method boolean SwipeRefreshLayout.isRefreshing()>
	//*   4    8:ifne            23
	//*   5   11:aload_0         
	//*   6   12:getfield        #15  <Field boolean isLoadingEnabled>
	//*   7   15:ifeq            23
			swiperefreshlayout.setRefreshing(true);
	//    8   18:aload_1         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #32  <Method void SwipeRefreshLayout.setRefreshing(boolean)>
	//   11   23:return          
	}

	public void showScreenLoading()
	{
		SwipeRefreshLayout swiperefreshlayout = getPtrView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method SwipeRefreshLayout getPtrView()>
	//    2    4:astore_1        
		if(swiperefreshlayout != null && !swiperefreshlayout.isRefreshing())
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #28  <Method boolean SwipeRefreshLayout.isRefreshing()>
	//*   7   13:ifne            22
		{
			showPtrLoading(swiperefreshlayout);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #89  <Method void showPtrLoading(SwipeRefreshLayout)>
			return;
	//   11   21:return          
		}
		if(swiperefreshlayout == null)
	//*  12   22:aload_1         
	//*  13   23:ifnonnull       30
			super.showScreenLoading();
	//   14   26:aload_0         
	//   15   27:invokespecial   #91  <Method void LoadingMvpActivity.showScreenLoading()>
	//   16   30:return          
	}

	private boolean isLoadingEnabled;
}
