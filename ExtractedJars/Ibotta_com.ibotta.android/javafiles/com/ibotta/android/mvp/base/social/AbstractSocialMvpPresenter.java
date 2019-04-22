// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.social;

import com.ibotta.android.FacebookFeed;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter;
import com.ibotta.android.social.facebook.FacebookManager;
import com.ibotta.api.model.customer.Customer;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.base.social:
//			SocialMvpPresenter, SocialMvpView

public abstract class AbstractSocialMvpPresenter extends AbstractLoadingMvpPresenter
	implements SocialMvpPresenter
{

	public AbstractSocialMvpPresenter(MvpPresenterActions mvppresenteractions, Hardware hardware1)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void AbstractLoadingMvpPresenter(MvpPresenterActions)>
		hardware = hardware1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Hardware hardware>
	//    6   10:return          
	}

	protected abstract Customer getCustomer();

	public FacebookManager getFacebookManager()
	{
		return facebookManager;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field FacebookManager facebookManager>
	//    2    4:areturn         
	}

	protected String getShareMessage()
	{
		com.ibotta.api.model.customer.Customer.InviteMessaging invitemessaging = getCustomer().getInviteMessaging();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method Customer getCustomer()>
	//    2    4:invokevirtual   #37  <Method com.ibotta.api.model.customer.Customer$InviteMessaging Customer.getInviteMessaging()>
	//    3    7:astore_1        
		if(invitemessaging != null && invitemessaging.getShortMessage() != null && invitemessaging.getShortMessage().length() > 0)
	//*   4    8:aload_1         
	//*   5    9:ifnull          34
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #42  <Method String com.ibotta.api.model.customer.Customer$InviteMessaging.getShortMessage()>
	//*   8   16:ifnull          34
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #42  <Method String com.ibotta.api.model.customer.Customer$InviteMessaging.getShortMessage()>
	//*  11   23:invokevirtual   #48  <Method int String.length()>
	//*  12   26:ifle            34
			return invitemessaging.getShortMessage();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #42  <Method String com.ibotta.api.model.customer.Customer$InviteMessaging.getShortMessage()>
	//   15   33:areturn         
		else
			return ((SocialMvpView)mvpView).getBackUpShareMessage(getCustomer().getInviteUrl());
	//   16   34:aload_0         
	//   17   35:getfield        #52  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   18   38:checkcast       #54  <Class SocialMvpView>
	//   19   41:aload_0         
	//   20   42:invokevirtual   #31  <Method Customer getCustomer()>
	//   21   45:invokevirtual   #57  <Method String Customer.getInviteUrl()>
	//   22   48:invokeinterface #61  <Method String SocialMvpView.getBackUpShareMessage(String)>
	//   23   53:areturn         
	}

	protected String getShareSubject()
	{
		com.ibotta.api.model.customer.Customer.InviteMessaging invitemessaging = getCustomer().getInviteMessaging();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method Customer getCustomer()>
	//    2    4:invokevirtual   #37  <Method com.ibotta.api.model.customer.Customer$InviteMessaging Customer.getInviteMessaging()>
	//    3    7:astore_1        
		if(invitemessaging != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			return invitemessaging.getSubject();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #65  <Method String com.ibotta.api.model.customer.Customer$InviteMessaging.getSubject()>
	//    8   16:areturn         
		else
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	public void onFacebookAuthFailed()
	{
		((SocialMvpView)mvpView).showFacebookAuthFailed();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #54  <Class SocialMvpView>
	//    3    7:invokeinterface #70  <Method void SocialMvpView.showFacebookAuthFailed()>
	//    4   12:return          
	}

	public void onFacebookAuthSuccess()
	{
		Object obj = ((Object) (getCustomer()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method Customer getCustomer()>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		obj = ((Object) (((Customer) (obj)).getInviteMessaging()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #37  <Method com.ibotta.api.model.customer.Customer$InviteMessaging Customer.getInviteMessaging()>
	//    8   14:astore_1        
		if(obj != null && ((com.ibotta.api.model.customer.Customer.InviteMessaging) (obj)).getFacebook() != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          72
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #74  <Method String com.ibotta.api.model.customer.Customer$InviteMessaging.getFacebook()>
	//*  13   23:ifnull          72
		{
			if(((com.ibotta.api.model.customer.Customer.InviteMessaging) (obj)).getFacebookUrl() == null)
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #77  <Method String com.ibotta.api.model.customer.Customer$InviteMessaging.getFacebookUrl()>
	//*  16   30:ifnonnull       34
			{
				return;
	//   17   33:return          
			} else
			{
				FacebookFeed facebookfeed = new FacebookFeed();
	//   18   34:new             #79  <Class FacebookFeed>
	//   19   37:dup             
	//   20   38:invokespecial   #81  <Method void FacebookFeed()>
	//   21   41:astore_2        
				facebookfeed.setLink(((com.ibotta.api.model.customer.Customer.InviteMessaging) (obj)).getFacebookUrl());
	//   22   42:aload_2         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #77  <Method String com.ibotta.api.model.customer.Customer$InviteMessaging.getFacebookUrl()>
	//   25   47:invokevirtual   #85  <Method void FacebookFeed.setLink(String)>
				facebookfeed.setName(((com.ibotta.api.model.customer.Customer.InviteMessaging) (obj)).getFacebook());
	//   26   50:aload_2         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #74  <Method String com.ibotta.api.model.customer.Customer$InviteMessaging.getFacebook()>
	//   29   55:invokevirtual   #88  <Method void FacebookFeed.setName(String)>
				((SocialMvpView)mvpView).doFacebookShare(facebookfeed);
	//   30   58:aload_0         
	//   31   59:getfield        #52  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   32   62:checkcast       #54  <Class SocialMvpView>
	//   33   65:aload_2         
	//   34   66:invokeinterface #92  <Method void SocialMvpView.doFacebookShare(FacebookFeed)>
				return;
	//   35   71:return          
			}
		} else
		{
			return;
	//   36   72:return          
		}
	}

	public void onFacebookFeedCancelled()
	{
		Timber.d("onFacebookFeedCancelled", new Object[0]);
	//    0    0:ldc1            #94  <String "onFacebookFeedCancelled">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #102 <Method void Timber.d(String, Object[])>
	//    4    9:return          
	}

	public void onFacebookFeedFail(Exception exception)
	{
		Timber.d("onFacebookFeedFail", new Object[0]);
	//    0    0:ldc1            #105 <String "onFacebookFeedFail">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #102 <Method void Timber.d(String, Object[])>
		if(hardware.isNetworkConnected() && exception != null && exception.getMessage() != null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #18  <Field Hardware hardware>
	//*   6   13:invokeinterface #111 <Method boolean Hardware.isNetworkConnected()>
	//*   7   18:ifeq            49
	//*   8   21:aload_1         
	//*   9   22:ifnull          49
	//*  10   25:aload_1         
	//*  11   26:invokevirtual   #116 <Method String Exception.getMessage()>
	//*  12   29:ifnull          49
		{
			((SocialMvpView)mvpView).showFacebookPostFailedMessage(exception.getMessage());
	//   13   32:aload_0         
	//   14   33:getfield        #52  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   15   36:checkcast       #54  <Class SocialMvpView>
	//   16   39:aload_1         
	//   17   40:invokevirtual   #116 <Method String Exception.getMessage()>
	//   18   43:invokeinterface #119 <Method void SocialMvpView.showFacebookPostFailedMessage(String)>
			return;
	//   19   48:return          
		}
		if(!hardware.isNetworkConnected())
	//*  20   49:aload_0         
	//*  21   50:getfield        #18  <Field Hardware hardware>
	//*  22   53:invokeinterface #111 <Method boolean Hardware.isNetworkConnected()>
	//*  23   58:ifne            74
		{
			((SocialMvpView)mvpView).showNetworkConnectionErrorDialog();
	//   24   61:aload_0         
	//   25   62:getfield        #52  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   26   65:checkcast       #54  <Class SocialMvpView>
	//   27   68:invokeinterface #122 <Method void SocialMvpView.showNetworkConnectionErrorDialog()>
			return;
	//   28   73:return          
		} else
		{
			((SocialMvpView)mvpView).showUnknownErrorMessage();
	//   29   74:aload_0         
	//   30   75:getfield        #52  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   31   78:checkcast       #54  <Class SocialMvpView>
	//   32   81:invokeinterface #125 <Method void SocialMvpView.showUnknownErrorMessage()>
			return;
	//   33   86:return          
		}
	}

	public void onFacebookFeedSuccess()
	{
		((SocialMvpView)mvpView).showUnlockAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #54  <Class SocialMvpView>
	//    3    7:invokeinterface #129 <Method void SocialMvpView.showUnlockAnimation()>
	//    4   12:return          
	}

	public void setFacebookManager(FacebookManager facebookmanager)
	{
		facebookManager = facebookmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field FacebookManager facebookManager>
	//    3    5:return          
	}

	protected FacebookManager facebookManager;
	private final Hardware hardware;
}
