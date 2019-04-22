// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading;

import android.content.res.Resources;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomSheetBehavior;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.ibotta.android.fragment.dialog.*;
import com.ibotta.android.mvp.base.contentevents.ContentEventsActivity;
import com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel;
import com.ibotta.android.mvp.ui.misc.*;
import com.ibotta.android.mvp.ui.view.error.NetworkConnectionErrorView;
import com.ibotta.android.mvp.ui.view.nav.NavButtonType;
import com.ibotta.android.routing.intent.MCommEscortIntentCreator;
import com.ibotta.api.ApiErrorDetails;

// Referenced classes of package com.ibotta.android.mvp.base.loading:
//			LoadingMvpView, LoadingMvpPresenter

public abstract class LoadingMvpActivity extends ContentEventsActivity
	implements LoadingMvpView, com.ibotta.android.mvp.ui.view.error.NetworkConnectionErrorView.NetworkConnectionErrorViewListener
{

	public LoadingMvpActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void ContentEventsActivity()>
	//    2    4:return          
	}

	private void checkForBottomNavIdentifier(NetworkConnectionErrorView networkconnectionerrorview)
	{
		if(getActivity() instanceof BottomNavIdentifier)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #38  <Method android.app.Activity getActivity()>
	//*   2    4:instanceof      #40  <Class BottomNavIdentifier>
	//*   3    7:ifeq            23
		{
			networkconnectionerrorview.initConnectionErrorViewBottomNavigation((BottomNavIdentifier)getActivity(), ((com.ibotta.android.mvp.ui.view.nav.NavBarListener) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokevirtual   #38  <Method android.app.Activity getActivity()>
	//    7   15:checkcast       #40  <Class BottomNavIdentifier>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #46  <Method void NetworkConnectionErrorView.initConnectionErrorViewBottomNavigation(BottomNavIdentifier, com.ibotta.android.mvp.ui.view.nav.NavBarListener)>
			return;
	//   10   22:return          
		} else
		{
			networkconnectionerrorview.hideConnectionErrorViewBottomNavigation();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #49  <Method void NetworkConnectionErrorView.hideConnectionErrorViewBottomNavigation()>
			return;
	//   13   27:return          
		}
	}

	private void checkForCustomToolbarIdentifier(NetworkConnectionErrorView networkconnectionerrorview)
	{
		if(getActivity() instanceof CustomToolbarIdentifier)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #38  <Method android.app.Activity getActivity()>
	//*   2    4:instanceof      #52  <Class CustomToolbarIdentifier>
	//*   3    7:ifeq            44
		{
			AppBarLayout appbarlayout = (AppBarLayout)findViewById(0x7f090029);
	//    4   10:aload_0         
	//    5   11:ldc1            #53  <Int 0x7f090029>
	//    6   13:invokevirtual   #57  <Method View findViewById(int)>
	//    7   16:checkcast       #59  <Class AppBarLayout>
	//    8   19:astore_2        
			if(appbarlayout != null)
	//*   9   20:aload_2         
	//*  10   21:ifnull          44
			{
				View view = appbarlayout.getChildAt(0);
	//   11   24:aload_2         
	//   12   25:iconst_0        
	//   13   26:invokevirtual   #62  <Method View AppBarLayout.getChildAt(int)>
	//   14   29:astore_3        
				if(view != null)
	//*  15   30:aload_3         
	//*  16   31:ifnull          44
				{
					appbarlayout.removeView(view);
	//   17   34:aload_2         
	//   18   35:aload_3         
	//   19   36:invokevirtual   #66  <Method void AppBarLayout.removeView(View)>
					networkconnectionerrorview.setAppBarChild(view);
	//   20   39:aload_1         
	//   21   40:aload_3         
	//   22   41:invokevirtual   #69  <Method void NetworkConnectionErrorView.setAppBarChild(View)>
				}
			}
		}
	//   23   44:return          
	}

	public NavButtonType getNavButtonType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected String getScreenLoadingMessage()
	{
		return "";
	//    0    0:ldc1            #77  <String "">
	//    1    2:areturn         
	}

	public void hideScreenLoading()
	{
		DialogFragmentHelper.INSTANCE.hide(((com.ibotta.android.activity.CompatSupplier) (this)), "screen_loading");
	//    0    0:getstatic       #84  <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    1    3:aload_0         
	//    2    4:ldc1            #18  <String "screen_loading">
	//    3    6:invokevirtual   #88  <Method void DialogFragmentHelper.hide(com.ibotta.android.activity.CompatSupplier, String)>
	//    4    9:return          
	}

	public void hideSubmittedJobLoading()
	{
		DialogFragmentHelper.INSTANCE.hide(((com.ibotta.android.activity.CompatSupplier) (this)), "submitted_job_loading");
	//    0    0:getstatic       #84  <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    1    3:aload_0         
	//    2    4:ldc1            #27  <String "submitted_job_loading">
	//    3    6:invokevirtual   #88  <Method void DialogFragmentHelper.hide(com.ibotta.android.activity.CompatSupplier, String)>
	//    4    9:return          
	}

	protected void initBottomSheetBehavior(LinearLayout linearlayout)
	{
		if(linearlayout == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			linearlayout = ((LinearLayout) (BottomSheetBehavior.from(((View) (linearlayout)))));
	//    3    5:aload_1         
	//    4    6:invokestatic    #97  <Method BottomSheetBehavior BottomSheetBehavior.from(View)>
	//    5    9:astore_1        
			((BottomSheetBehavior) (linearlayout)).setHideable(true);
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #101 <Method void BottomSheetBehavior.setHideable(boolean)>
			((BottomSheetBehavior) (linearlayout)).setPeekHeight(getResources().getDisplayMetrics().heightPixels);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #105 <Method Resources getResources()>
	//   12   20:invokevirtual   #111 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   13   23:getfield        #117 <Field int DisplayMetrics.heightPixels>
	//   14   26:invokevirtual   #121 <Method void BottomSheetBehavior.setPeekHeight(int)>
			((BottomSheetBehavior) (linearlayout)).setBottomSheetCallback(((android.support.design.widget.BottomSheetBehavior.BottomSheetCallback) (new android.support.design.widget.BottomSheetBehavior.BottomSheetCallback() {

				public void onSlide(View view, float f)
				{
				//    0    0:return          
				}

				public void onStateChanged(View view, int i)
				{
					if(i != 5)
				//*   0    0:iload_2         
				//*   1    1:iconst_5        
				//*   2    2:icmpeq          6
					{
						return;
				//    3    5:return          
					} else
					{
						finish();
				//    4    6:aload_0         
				//    5    7:getfield        #15  <Field LoadingMvpActivity this$0>
				//    6   10:invokevirtual   #28  <Method void LoadingMvpActivity.finish()>
						return;
				//    7   13:return          
					}
				}

				final LoadingMvpActivity this$0;

			
			{
				this$0 = LoadingMvpActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field LoadingMvpActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.support.design.widget.BottomSheetBehavior$BottomSheetCallback()>
			//    5    9:return          
			}
			}
)));
	//   15   29:aload_1         
	//   16   30:new             #11  <Class LoadingMvpActivity$1>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #124 <Method void LoadingMvpActivity$1(LoadingMvpActivity)>
	//   20   38:invokevirtual   #128 <Method void BottomSheetBehavior.setBottomSheetCallback(android.support.design.widget.BottomSheetBehavior$BottomSheetCallback)>
			return;
	//   21   41:return          
		}
	}

	public void onChoice(String s, int i, String s1)
	{
		if("screen_load_retry".equals(((Object) (s))))
	//*   0    0:ldc1            #21  <String "screen_load_retry">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            34
			if(i == 0x7f1101e4)
	//*   4    9:iload_2         
	//*   5   10:ldc1            #137 <Int 0x7f1101e4>
	//*   6   12:icmpne          30
				((LoadingMvpPresenter)mvpPresenter).onScreenLoadingRetry();
	//    7   15:aload_0         
	//    8   16:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    9   19:checkcast       #143 <Class LoadingMvpPresenter>
	//   10   22:invokeinterface #146 <Method void LoadingMvpPresenter.onScreenLoadingRetry()>
			else
	//*  11   27:goto            34
				finish();
	//   12   30:aload_0         
	//   13   31:invokevirtual   #149 <Method void finish()>
		super.onChoice(s, i, s1);
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:iload_2         
	//   17   37:aload_3         
	//   18   38:invokespecial   #151 <Method void ContentEventsActivity.onChoice(String, int, String)>
	//   19   41:return          
	}

	public void onDialogFragmentCancelled(String s)
	{
		if("screen_loading".equals(((Object) (s))))
	//*   0    0:ldc1            #18  <String "screen_loading">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            24
			((LoadingMvpPresenter)mvpPresenter).onScreenLoadingCancelled();
	//    4    9:aload_0         
	//    5   10:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    6   13:checkcast       #143 <Class LoadingMvpPresenter>
	//    7   16:invokeinterface #156 <Method void LoadingMvpPresenter.onScreenLoadingCancelled()>
		else
	//*   8   21:goto            117
		if("screen_load_retry".equals(((Object) (s))))
	//*   9   24:ldc1            #21  <String "screen_load_retry">
	//*  10   26:aload_1         
	//*  11   27:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  12   30:ifeq            48
			((LoadingMvpPresenter)mvpPresenter).onScreenLoadingRetryCancelled();
	//   13   33:aload_0         
	//   14   34:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   15   37:checkcast       #143 <Class LoadingMvpPresenter>
	//   16   40:invokeinterface #159 <Method void LoadingMvpPresenter.onScreenLoadingRetryCancelled()>
		else
	//*  17   45:goto            117
		if("fetch_job_error".equals(((Object) (s))))
	//*  18   48:ldc1            #15  <String "fetch_job_error">
	//*  19   50:aload_1         
	//*  20   51:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  21   54:ifeq            72
			((LoadingMvpPresenter)mvpPresenter).onFetchJobErrorCancelled();
	//   22   57:aload_0         
	//   23   58:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   24   61:checkcast       #143 <Class LoadingMvpPresenter>
	//   25   64:invokeinterface #162 <Method void LoadingMvpPresenter.onFetchJobErrorCancelled()>
		else
	//*  26   69:goto            117
		if("submitted_job_loading".equals(((Object) (s))))
	//*  27   72:ldc1            #27  <String "submitted_job_loading">
	//*  28   74:aload_1         
	//*  29   75:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  30   78:ifeq            96
			((LoadingMvpPresenter)mvpPresenter).onSubmittedJobLoadingCancelled();
	//   31   81:aload_0         
	//   32   82:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   33   85:checkcast       #143 <Class LoadingMvpPresenter>
	//   34   88:invokeinterface #165 <Method void LoadingMvpPresenter.onSubmittedJobLoadingCancelled()>
		else
	//*  35   93:goto            117
		if("submitted_job_error".equals(((Object) (s))))
	//*  36   96:ldc1            #24  <String "submitted_job_error">
	//*  37   98:aload_1         
	//*  38   99:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  39  102:ifeq            117
			((LoadingMvpPresenter)mvpPresenter).onSubmittedJobErrorCancelled();
	//   40  105:aload_0         
	//   41  106:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   42  109:checkcast       #143 <Class LoadingMvpPresenter>
	//   43  112:invokeinterface #168 <Method void LoadingMvpPresenter.onSubmittedJobErrorCancelled()>
		super.onDialogFragmentCancelled(s);
	//   44  117:aload_0         
	//   45  118:aload_1         
	//   46  119:invokespecial   #170 <Method void ContentEventsActivity.onDialogFragmentCancelled(String)>
	//   47  122:return          
	}

	public void onNetworkConnectionErrorRetryClicked()
	{
		((LoadingMvpPresenter)mvpPresenter).onNetworkConnectionErrorRetryClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #143 <Class LoadingMvpPresenter>
	//    3    7:invokeinterface #173 <Method void LoadingMvpPresenter.onNetworkConnectionErrorRetryClicked()>
	//    4   12:return          
	}

	public void onNetworkConnectionModalIdentified(LinearLayout linearlayout)
	{
		initBottomSheetBehavior(linearlayout);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method void initBottomSheetBehavior(LinearLayout)>
	//    3    5:return          
	}

	public void setTitleForLoadFailure()
	{
	//    0    0:return          
	}

	public void showFacebookAuthFailed()
	{
		showQuickMessage(0x7f1102ac, false, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #179 <Int 0x7f1102ac>
	//    2    3:iconst_0        
	//    3    4:iconst_1        
	//    4    5:invokevirtual   #183 <Method void showQuickMessage(int, boolean, boolean)>
	//    5    8:return          
	}

	public void showFacebookInfoFailed()
	{
		showQuickMessage(0x7f1102ae, false, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #185 <Int 0x7f1102ae>
	//    2    3:iconst_0        
	//    3    4:iconst_1        
	//    4    5:invokevirtual   #183 <Method void showQuickMessage(int, boolean, boolean)>
	//    5    8:return          
	}

	public void showFacebookLinkFailed()
	{
		showQuickMessage(0x7f1102af, false, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #187 <Int 0x7f1102af>
	//    2    3:iconst_0        
	//    3    4:iconst_1        
	//    4    5:invokevirtual   #183 <Method void showQuickMessage(int, boolean, boolean)>
	//    5    8:return          
	}

	public void showFacebookUnlinkFailed()
	{
		showQuickMessage(0x7f1102b0, false, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #189 <Int 0x7f1102b0>
	//    2    3:iconst_0        
	//    3    4:iconst_1        
	//    4    5:invokevirtual   #183 <Method void showQuickMessage(int, boolean, boolean)>
	//    5    8:return          
	}

	public void showFetchJobFailed(ApiErrorDetails apierrordetails)
	{
		showErrorMessage(apierrordetails, "fetch_job_error");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #15  <String "fetch_job_error">
	//    3    4:invokevirtual   #195 <Method void showErrorMessage(ApiErrorDetails, String)>
	//    4    7:return          
	}

	public void showMcommEscort(McommEscortParamsParcel mcommescortparamsparcel)
	{
		startActivity((new MCommEscortIntentCreator(((android.content.Context) (this)), mcommescortparamsparcel)).create());
	//    0    0:aload_0         
	//    1    1:new             #199 <Class MCommEscortIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #202 <Method void MCommEscortIntentCreator(android.content.Context, McommEscortParamsParcel)>
	//    6   10:invokevirtual   #206 <Method android.content.Intent MCommEscortIntentCreator.create()>
	//    7   13:invokevirtual   #210 <Method void startActivity(android.content.Intent)>
	//    8   16:return          
	}

	public void showNetworkConnectionError()
	{
		((LoadingMvpPresenter)mvpPresenter).setNetworkConnectionErrorViewShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #143 <Class LoadingMvpPresenter>
	//    3    7:invokeinterface #214 <Method void LoadingMvpPresenter.setNetworkConnectionErrorViewShowing()>
		NetworkConnectionErrorView networkconnectionerrorview = new NetworkConnectionErrorView(((android.content.Context) (this)));
	//    4   12:new             #42  <Class NetworkConnectionErrorView>
	//    5   15:dup             
	//    6   16:aload_0         
	//    7   17:invokespecial   #217 <Method void NetworkConnectionErrorView(android.content.Context)>
	//    8   20:astore_1        
		networkconnectionerrorview.setup(getActivity() instanceof ModalIdentifier);
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:invokevirtual   #38  <Method android.app.Activity getActivity()>
	//   12   26:instanceof      #219 <Class ModalIdentifier>
	//   13   29:invokevirtual   #222 <Method void NetworkConnectionErrorView.setup(boolean)>
		networkconnectionerrorview.setNetworkConnectionErrorViewListener(((com.ibotta.android.mvp.ui.view.error.NetworkConnectionErrorView.NetworkConnectionErrorViewListener) (this)));
	//   14   32:aload_1         
	//   15   33:aload_0         
	//   16   34:invokevirtual   #226 <Method void NetworkConnectionErrorView.setNetworkConnectionErrorViewListener(com.ibotta.android.mvp.ui.view.error.NetworkConnectionErrorView$NetworkConnectionErrorViewListener)>
		checkForBottomNavIdentifier(networkconnectionerrorview);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:invokespecial   #228 <Method void checkForBottomNavIdentifier(NetworkConnectionErrorView)>
		checkForCustomToolbarIdentifier(networkconnectionerrorview);
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:invokespecial   #230 <Method void checkForCustomToolbarIdentifier(NetworkConnectionErrorView)>
		setContentView(((View) (networkconnectionerrorview)));
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokevirtual   #233 <Method void setContentView(View)>
	//   26   52:return          
	}

	public void showScreenLoadFailed()
	{
		PromptDialogFragment promptdialogfragment = PromptDialogFragment.newInstance(((String) (null)), getString(0x7f110158), new int[] {
			0x7f110142, 0x7f1101e4
		});
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:ldc1            #235 <Int 0x7f110158>
	//    3    4:invokevirtual   #239 <Method String getString(int)>
	//    4    7:iconst_2        
	//    5    8:newarray        int[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:ldc1            #240 <Int 0x7f110142>
	//    9   14:iastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:ldc1            #137 <Int 0x7f1101e4>
	//   13   19:iastore         
	//   14   20:invokestatic    #246 <Method PromptDialogFragment PromptDialogFragment.newInstance(String, String, int[])>
	//   15   23:astore_1        
		promptdialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//   16   24:aload_1         
	//   17   25:aload_0         
	//   18   26:invokevirtual   #250 <Method void PromptDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (promptdialogfragment)), "screen_load_retry");
	//   19   29:getstatic       #84  <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   20   32:aload_0         
	//   21   33:aload_1         
	//   22   34:ldc1            #21  <String "screen_load_retry">
	//   23   36:invokevirtual   #254 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
	//   24   39:return          
	}

	public void showScreenLoading()
	{
		if(DialogFragmentHelper.INSTANCE.isShowing(((com.ibotta.android.activity.CompatSupplier) (this)), "screen_loading"))
	//*   0    0:getstatic       #84  <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//*   1    3:aload_0         
	//*   2    4:ldc1            #18  <String "screen_loading">
	//*   3    6:invokevirtual   #259 <Method boolean DialogFragmentHelper.isShowing(com.ibotta.android.activity.CompatSupplier, String)>
	//*   4    9:ifeq            13
		{
			return;
	//    5   12:return          
		} else
		{
			LoadingIndicatorDialogFragment loadingindicatordialogfragment = LoadingIndicatorDialogFragment.newInstance(getScreenLoadingMessage());
	//    6   13:aload_0         
	//    7   14:invokevirtual   #261 <Method String getScreenLoadingMessage()>
	//    8   17:invokestatic    #266 <Method LoadingIndicatorDialogFragment LoadingIndicatorDialogFragment.newInstance(String)>
	//    9   20:astore_1        
			loadingindicatordialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #267 <Method void LoadingIndicatorDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
			loadingindicatordialogfragment.setCancelable(true);
	//   13   26:aload_1         
	//   14   27:iconst_1        
	//   15   28:invokevirtual   #270 <Method void LoadingIndicatorDialogFragment.setCancelable(boolean)>
			DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (loadingindicatordialogfragment)), "screen_loading");
	//   16   31:getstatic       #84  <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:ldc1            #18  <String "screen_loading">
	//   20   38:invokevirtual   #254 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
			return;
	//   21   41:return          
		}
	}

	public void showSubmittedJobFailed(ApiErrorDetails apierrordetails)
	{
		showErrorMessage(apierrordetails, "submitted_job_error");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #24  <String "submitted_job_error">
	//    3    4:invokevirtual   #195 <Method void showErrorMessage(ApiErrorDetails, String)>
	//    4    7:return          
	}

	public void showSubmittedJobLoading()
	{
		showSubmittedJobLoading("");
	//    0    0:aload_0         
	//    1    1:ldc1            #77  <String "">
	//    2    3:invokevirtual   #274 <Method void showSubmittedJobLoading(String)>
	//    3    6:return          
	}

	public void showSubmittedJobLoading(String s)
	{
		if(DialogFragmentHelper.INSTANCE.isShowing(((com.ibotta.android.activity.CompatSupplier) (this)), "submitted_job_loading"))
	//*   0    0:getstatic       #84  <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//*   1    3:aload_0         
	//*   2    4:ldc1            #27  <String "submitted_job_loading">
	//*   3    6:invokevirtual   #259 <Method boolean DialogFragmentHelper.isShowing(com.ibotta.android.activity.CompatSupplier, String)>
	//*   4    9:ifeq            13
		{
			return;
	//    5   12:return          
		} else
		{
			s = ((String) (LoadingIndicatorDialogFragment.newInstance(s)));
	//    6   13:aload_1         
	//    7   14:invokestatic    #266 <Method LoadingIndicatorDialogFragment LoadingIndicatorDialogFragment.newInstance(String)>
	//    8   17:astore_1        
			((LoadingIndicatorDialogFragment) (s)).setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokevirtual   #267 <Method void LoadingIndicatorDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
			((LoadingIndicatorDialogFragment) (s)).setCancelable(true);
	//   12   23:aload_1         
	//   13   24:iconst_1        
	//   14   25:invokevirtual   #270 <Method void LoadingIndicatorDialogFragment.setCancelable(boolean)>
			DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (s)), "submitted_job_loading");
	//   15   28:getstatic       #84  <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:ldc1            #27  <String "submitted_job_loading">
	//   19   35:invokevirtual   #254 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
			return;
	//   20   38:return          
		}
	}

	public void showUnknownErrorDialog()
	{
		PromptDialogFragment promptdialogfragment = PromptDialogFragment.newInstance(((String) (null)), getString(0x7f11015a), new int[] {
			0x7f110142, 0x7f1101e4
		});
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:ldc2            #276 <Int 0x7f11015a>
	//    3    5:invokevirtual   #239 <Method String getString(int)>
	//    4    8:iconst_2        
	//    5    9:newarray        int[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:ldc1            #240 <Int 0x7f110142>
	//    9   15:iastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:ldc1            #137 <Int 0x7f1101e4>
	//   13   20:iastore         
	//   14   21:invokestatic    #246 <Method PromptDialogFragment PromptDialogFragment.newInstance(String, String, int[])>
	//   15   24:astore_1        
		promptdialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//   16   25:aload_1         
	//   17   26:aload_0         
	//   18   27:invokevirtual   #250 <Method void PromptDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (promptdialogfragment)), "screen_load_retry");
	//   19   30:getstatic       #84  <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   20   33:aload_0         
	//   21   34:aload_1         
	//   22   35:ldc1            #21  <String "screen_load_retry">
	//   23   37:invokevirtual   #254 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
	//   24   40:return          
	}

	protected static final String TAG_FETCH_JOB_ERROR = "fetch_job_error";
	protected static final String TAG_SCREEN_LOADING = "screen_loading";
	protected static final String TAG_SCREEN_LOAD_RETRY = "screen_load_retry";
	protected static final String TAG_SUBMITTED_JOB_ERROR = "submitted_job_error";
	protected static final String TAG_SUBMITTED_JOB_LOADING = "submitted_job_loading";
}
