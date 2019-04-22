// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import com.ibotta.android.tracking.EventContextProvider;
import com.ibotta.android.tracking.proprietary.TrackingQueue;
import com.ibotta.android.tracking.proprietary.event.AccountEvent;
import com.ibotta.android.tracking.proprietary.event.enums.ClickType;
import com.ibotta.android.util.AppHelper;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountMenu

public class AccountTracking
{

	public AccountTracking(AppHelper apphelper, EventContextProvider eventcontextprovider, TrackingQueue trackingqueue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		appHelper = apphelper;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field AppHelper appHelper>
		eventContextProvider = eventcontextprovider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field EventContextProvider eventContextProvider>
		trackingQueue = trackingqueue;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #40  <Field TrackingQueue trackingQueue>
	//   11   19:return          
	}

	private AccountEvent createAccountClickEvent()
	{
		AccountEvent accountevent = new AccountEvent();
	//    0    0:new             #45  <Class AccountEvent>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void AccountEvent()>
	//    3    7:astore_1        
		eventContextProvider.provideContext(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (accountevent)));
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field EventContextProvider eventContextProvider>
	//    6   12:aload_1         
	//    7   13:invokeinterface #52  <Method void EventContextProvider.provideContext(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
		accountevent.setEventAt(appHelper.getCurrentTime());
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #36  <Field AppHelper appHelper>
	//   11   23:invokeinterface #58  <Method long AppHelper.getCurrentTime()>
	//   12   28:invokevirtual   #62  <Method void AccountEvent.setEventAt(long)>
		accountevent.setClicked(Boolean.valueOf(true));
	//   13   31:aload_1         
	//   14   32:iconst_1        
	//   15   33:invokestatic    #68  <Method Boolean Boolean.valueOf(boolean)>
	//   16   36:invokevirtual   #72  <Method void AccountEvent.setClicked(Boolean)>
		return accountevent;
	//   17   39:aload_1         
	//   18   40:areturn         
	}

	public void trackAccountMenuItemClick(AccountMenu accountmenu)
	{
		AccountEvent accountevent = createAccountClickEvent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method AccountEvent createAccountClickEvent()>
	//    2    4:astore_2        
		accountevent.setClickType(ClickType.ACCOUNT_MENU_ITEM);
	//    3    5:aload_2         
	//    4    6:getstatic       #82  <Field ClickType ClickType.ACCOUNT_MENU_ITEM>
	//    5    9:invokevirtual   #86  <Method void AccountEvent.setClickType(ClickType)>
		accountmenu = ((AccountMenu) (appHelper.getString(accountmenu.getNameResId(), new Object[0])));
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field AppHelper appHelper>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #92  <Method int AccountMenu.getNameResId()>
	//   10   20:iconst_0        
	//   11   21:anewarray       Object[]
	//   12   24:invokeinterface #96  <Method String AppHelper.getString(int, Object[])>
	//   13   29:astore_1        
		accountevent.setContextDetail(((String) (accountmenu)));
	//   14   30:aload_2         
	//   15   31:aload_1         
	//   16   32:invokevirtual   #100 <Method void AccountEvent.setContextDetail(String)>
		Timber.d("Tracking Account %1$s Click: %2$s", new Object[] {
			accountmenu, accountevent
		});
	//   17   35:ldc1            #102 <String "Tracking Account %1$s Click: %2$s">
	//   18   37:iconst_2        
	//   19   38:anewarray       Object[]
	//   20   41:dup             
	//   21   42:iconst_0        
	//   22   43:aload_1         
	//   23   44:aastore         
	//   24   45:dup             
	//   25   46:iconst_1        
	//   26   47:aload_2         
	//   27   48:aastore         
	//   28   49:invokestatic    #108 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (accountevent)));
	//   29   52:aload_0         
	//   30   53:getfield        #40  <Field TrackingQueue trackingQueue>
	//   31   56:aload_2         
	//   32   57:invokeinterface #113 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   33   62:return          
	}

	public void trackAccountNavClick()
	{
		AccountEvent accountevent = createAccountClickEvent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method AccountEvent createAccountClickEvent()>
	//    2    4:astore_1        
		accountevent.setContextDetail("Account Main Nav");
	//    3    5:aload_1         
	//    4    6:ldc1            #8   <String "Account Main Nav">
	//    5    8:invokevirtual   #100 <Method void AccountEvent.setContextDetail(String)>
		Timber.d("Tracking Account Click: %1$s", new Object[] {
			"Account Main Nav"
		});
	//    6   11:ldc1            #116 <String "Tracking Account Click: %1$s">
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:ldc1            #8   <String "Account Main Nav">
	//   12   21:aastore         
	//   13   22:invokestatic    #108 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (accountevent)));
	//   14   25:aload_0         
	//   15   26:getfield        #40  <Field TrackingQueue trackingQueue>
	//   16   29:aload_1         
	//   17   30:invokeinterface #113 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   18   35:return          
	}

	public void trackLinkAccountClick()
	{
		AccountEvent accountevent = createAccountClickEvent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method AccountEvent createAccountClickEvent()>
	//    2    4:astore_1        
		accountevent.setContextDetail("Link Account");
	//    3    5:aload_1         
	//    4    6:ldc1            #11  <String "Link Account">
	//    5    8:invokevirtual   #100 <Method void AccountEvent.setContextDetail(String)>
		Timber.d("Tracking Account Click: %1$s", new Object[] {
			"Link Account"
		});
	//    6   11:ldc1            #116 <String "Tracking Account Click: %1$s">
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:ldc1            #11  <String "Link Account">
	//   12   21:aastore         
	//   13   22:invokestatic    #108 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (accountevent)));
	//   14   25:aload_0         
	//   15   26:getfield        #40  <Field TrackingQueue trackingQueue>
	//   16   29:aload_1         
	//   17   30:invokeinterface #113 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   18   35:return          
	}

	public void trackPendingEarningsClick()
	{
		AccountEvent accountevent = createAccountClickEvent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method AccountEvent createAccountClickEvent()>
	//    2    4:astore_1        
		accountevent.setContextDetail("Pending Earnings");
	//    3    5:aload_1         
	//    4    6:ldc1            #14  <String "Pending Earnings">
	//    5    8:invokevirtual   #100 <Method void AccountEvent.setContextDetail(String)>
		Timber.d("Tracking Account Click: %1$s", new Object[] {
			"Pending Earnings"
		});
	//    6   11:ldc1            #116 <String "Tracking Account Click: %1$s">
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:ldc1            #14  <String "Pending Earnings">
	//   12   21:aastore         
	//   13   22:invokestatic    #108 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (accountevent)));
	//   14   25:aload_0         
	//   15   26:getfield        #40  <Field TrackingQueue trackingQueue>
	//   16   29:aload_1         
	//   17   30:invokeinterface #113 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   18   35:return          
	}

	public void trackProfileImageClick()
	{
		AccountEvent accountevent = createAccountClickEvent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method AccountEvent createAccountClickEvent()>
	//    2    4:astore_1        
		accountevent.setContextDetail("Profile Image");
	//    3    5:aload_1         
	//    4    6:ldc1            #17  <String "Profile Image">
	//    5    8:invokevirtual   #100 <Method void AccountEvent.setContextDetail(String)>
		Timber.d("Tracking Account Click: %1$s", new Object[] {
			"Profile Image"
		});
	//    6   11:ldc1            #116 <String "Tracking Account Click: %1$s">
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:ldc1            #17  <String "Profile Image">
	//   12   21:aastore         
	//   13   22:invokestatic    #108 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (accountevent)));
	//   14   25:aload_0         
	//   15   26:getfield        #40  <Field TrackingQueue trackingQueue>
	//   16   29:aload_1         
	//   17   30:invokeinterface #113 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   18   35:return          
	}

	public void trackQuestionMarkClick()
	{
		AccountEvent accountevent = createAccountClickEvent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method AccountEvent createAccountClickEvent()>
	//    2    4:astore_1        
		accountevent.setContextDetail("Question Mark");
	//    3    5:aload_1         
	//    4    6:ldc1            #20  <String "Question Mark">
	//    5    8:invokevirtual   #100 <Method void AccountEvent.setContextDetail(String)>
		Timber.d("Tracking Account Click: %1$s", new Object[] {
			"Question Mark"
		});
	//    6   11:ldc1            #116 <String "Tracking Account Click: %1$s">
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:ldc1            #20  <String "Question Mark">
	//   12   21:aastore         
	//   13   22:invokestatic    #108 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (accountevent)));
	//   14   25:aload_0         
	//   15   26:getfield        #40  <Field TrackingQueue trackingQueue>
	//   16   29:aload_1         
	//   17   30:invokeinterface #113 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   18   35:return          
	}

	public void trackWithdrawCashClick()
	{
		AccountEvent accountevent = createAccountClickEvent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method AccountEvent createAccountClickEvent()>
	//    2    4:astore_1        
		accountevent.setContextDetail("Withdraw Cash");
	//    3    5:aload_1         
	//    4    6:ldc1            #23  <String "Withdraw Cash">
	//    5    8:invokevirtual   #100 <Method void AccountEvent.setContextDetail(String)>
		Timber.d("Tracking Account Click: %1$s", new Object[] {
			"Withdraw Cash"
		});
	//    6   11:ldc1            #116 <String "Tracking Account Click: %1$s">
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:ldc1            #23  <String "Withdraw Cash">
	//   12   21:aastore         
	//   13   22:invokestatic    #108 <Method void Timber.d(String, Object[])>
		trackingQueue.send(((com.ibotta.android.tracking.proprietary.event.AbstractEvent) (accountevent)));
	//   14   25:aload_0         
	//   15   26:getfield        #40  <Field TrackingQueue trackingQueue>
	//   16   29:aload_1         
	//   17   30:invokeinterface #113 <Method void TrackingQueue.send(com.ibotta.android.tracking.proprietary.event.AbstractEvent)>
	//   18   35:return          
	}

	private static final String ACCOUNT_MAIN_NAV = "Account Main Nav";
	private static final String LINK_ACCOUNT = "Link Account";
	private static final String PENDING_EARNINGS = "Pending Earnings";
	private static final String PROFILE_IMG = "Profile Image";
	private static final String QUESTION_MARK = "Question Mark";
	private static final String WITHDRAW_CASH = "Withdraw Cash";
	private final AppHelper appHelper;
	private final EventContextProvider eventContextProvider;
	private final TrackingQueue trackingQueue;
}
