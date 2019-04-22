// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;


// Referenced classes of package com.ibotta.android.mvp.base:
//			MvpPresenter, MvpPresenterActions, MvpView

public abstract class AbstractMvpPresenter
	implements MvpPresenter
{

	protected AbstractMvpPresenter(MvpPresenterActions mvppresenteractions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mvpPresenterActions = mvppresenteractions;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field MvpPresenterActions mvpPresenterActions>
	//    5    9:return          
	}

	public Object getPersistedState()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected void ifNetworkConnected(Runnable runnable)
	{
		if(mvpPresenterActions.isNetworkConnected())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field MvpPresenterActions mvpPresenterActions>
	//*   2    4:invokeinterface #33  <Method boolean MvpPresenterActions.isNetworkConnected()>
	//*   3    9:ifeq            19
		{
			runnable.run();
	//    4   12:aload_1         
	//    5   13:invokeinterface #38  <Method void Runnable.run()>
			return;
	//    6   18:return          
		} else
		{
			mvpView.showNetworkConnectionErrorDialog();
	//    7   19:aload_0         
	//    8   20:getfield        #40  <Field MvpView mvpView>
	//    9   23:invokeinterface #45  <Method void MvpView.showNetworkConnectionErrorDialog()>
			return;
	//   10   28:return          
		}
	}

	protected boolean isAttached()
	{
		return attached;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean attached>
	//    2    4:ireturn         
	}

	public boolean isExpectingActivityResult()
	{
		return isExpectingActivityResult;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean isExpectingActivityResult>
	//    2    4:ireturn         
	}

	public void onAttach(MvpView mvpview)
	{
		mvpView = mvpview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field MvpView mvpView>
		attached = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #48  <Field boolean attached>
	//    6   10:return          
	}

	public void onDetach()
	{
		mvpView = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #40  <Field MvpView mvpView>
		attached = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #48  <Field boolean attached>
	//    6   10:return          
	}

	public void onNavAccountClicked()
	{
		mvpView.showAccount();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field MvpView mvpView>
	//    2    4:invokeinterface #59  <Method void MvpView.showAccount()>
	//    3    9:return          
	}

	public void onNavFeaturedClicked()
	{
		mvpView.showFeatured();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field MvpView mvpView>
	//    2    4:invokeinterface #63  <Method void MvpView.showFeatured()>
	//    3    9:return          
	}

	public void onNavFindRebatesClicked()
	{
		mvpView.showFindRebates();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field MvpView mvpView>
	//    2    4:invokeinterface #67  <Method void MvpView.showFindRebates()>
	//    3    9:return          
	}

	public void onNavMyRebatesClicked()
	{
		mvpView.showMyRebates();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field MvpView mvpView>
	//    2    4:invokeinterface #71  <Method void MvpView.showMyRebates()>
	//    3    9:return          
	}

	public void onNavRedeemClicked()
	{
		mvpView.showRedeem();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field MvpView mvpView>
	//    2    4:invokeinterface #75  <Method void MvpView.showRedeem()>
	//    3    9:return          
	}

	public void onPause()
	{
	//    0    0:return          
	}

	public void onResume()
	{
	//    0    0:return          
	}

	public void onStart()
	{
	//    0    0:return          
	}

	public void onStop()
	{
	//    0    0:return          
	}

	public void onUpgradeClicked()
	{
		mvpView.showIbottaInGooglePlayStore();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field MvpView mvpView>
	//    2    4:invokeinterface #83  <Method void MvpView.showIbottaInGooglePlayStore()>
	//    3    9:return          
	}

	public void onViewsBound()
	{
	//    0    0:return          
	}

	public void setIsExpectingActivityResult(boolean flag)
	{
		isExpectingActivityResult = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #50  <Field boolean isExpectingActivityResult>
	//    3    5:return          
	}

	public void setPersistedState(Object obj)
	{
	//    0    0:return          
	}

	private boolean attached;
	private boolean isExpectingActivityResult;
	protected final MvpPresenterActions mvpPresenterActions;
	protected MvpView mvpView;
}
