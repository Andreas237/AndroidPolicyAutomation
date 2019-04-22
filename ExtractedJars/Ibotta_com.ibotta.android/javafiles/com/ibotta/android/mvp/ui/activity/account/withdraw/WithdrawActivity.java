// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.fragment.cashout.CashOutTransferSuccessFlyUpCreator;
import com.ibotta.android.fragment.cashout.UnconfirmedFlyUpPageCreator;
import com.ibotta.android.fragment.dialog.DialogFragmentHelper;
import com.ibotta.android.fragment.dialog.PromptDialogFragment;
import com.ibotta.android.fragment.dialog.flyup.*;
import com.ibotta.android.mvp.base.MvpComponent;
import com.ibotta.android.mvp.base.loading.PtrLoadingMvpActivity;
import com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount.LinkCashAccountActivity;
import com.ibotta.android.mvp.ui.activity.account.withdraw.cashout.CashOutActivity;
import com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.GiftCardActivity;
import com.ibotta.android.mvp.ui.activity.settings.verify.VerifyDeviceActivity;
import com.ibotta.android.mvp.ui.misc.CustomToolbarIdentifier;
import com.ibotta.android.mvp.ui.misc.password.*;
import com.ibotta.android.mvp.ui.view.IBSwipeRefreshLayout;
import com.ibotta.android.mvp.ui.view.account.withdraw.WithdrawListView;
import com.ibotta.android.routing.intent.InviteIntentCreator;
import com.ibotta.android.routing.intent.PayPalConnectIntentCreator;
import com.ibotta.android.tracking.braze.BrazeTracking;
import com.ibotta.android.util.Validation;
import com.ibotta.api.model.card.GiftCard;
import com.ibotta.api.model.customer.Customer;
import com.ibotta.api.model.customer.CustomerAccount;
import java.util.List;
import org.parceler.Parcels;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			WithdrawAdapterListener, WithdrawView, DaggerWithdrawComponent, WithdrawModule, 
//			WithdrawPresenter, WithdrawComponent, CashOutType, WithdrawalDetails

public class WithdrawActivity extends PtrLoadingMvpActivity
	implements com.ibotta.android.fragment.dialog.flyup.FlyUpDialogFragment.FlyUpDialogListener, WithdrawAdapterListener, WithdrawView, CustomToolbarIdentifier, PasswordListener
{

	public WithdrawActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void PtrLoadingMvpActivity()>
	//    2    4:return          
	}

	private void initListView()
	{
		wlvWithdrawOptions.setListener(((WithdrawAdapterListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field WithdrawListView wlvWithdrawOptions>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #77  <Method void WithdrawListView.setListener(WithdrawAdapterListener)>
	//    4    8:return          
	}

	private void initTitle()
	{
		setTitle(0x7f110036);
	//    0    0:aload_0         
	//    1    1:ldc1            #79  <Int 0x7f110036>
	//    2    3:invokevirtual   #83  <Method void setTitle(int)>
	//    3    6:return          
	}

	public void capturePasswordForPayPalLink(String s)
	{
		passwordPrompterFactory.create(((PasswordListener) (this)), s, "pw_capture_link_paypal").capturePassword();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field PasswordPrompterFactory passwordPrompterFactory>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #40  <String "pw_capture_link_paypal">
	//    5    8:invokeinterface #93  <Method PasswordPrompter PasswordPrompterFactory.create(PasswordListener, String, String)>
	//    6   13:invokeinterface #98  <Method void PasswordPrompter.capturePassword()>
	//    7   18:return          
	}

	public void capturePasswordForResetEmail(String s)
	{
		passwordPrompterFactory.create(((PasswordListener) (this)), s, "pw_capture_reset_email").capturePassword();
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field PasswordPrompterFactory passwordPrompterFactory>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #43  <String "pw_capture_reset_email">
	//    5    8:invokeinterface #93  <Method PasswordPrompter PasswordPrompterFactory.create(PasswordListener, String, String)>
	//    6   13:invokeinterface #98  <Method void PasswordPrompter.capturePassword()>
	//    7   18:return          
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #104 <Method WithdrawComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected WithdrawComponent createComponent(MainComponent maincomponent)
	{
		return DaggerWithdrawComponent.builder().mainComponent(maincomponent).withdrawModule(new WithdrawModule(this)).build();
	//    0    0:invokestatic    #110 <Method DaggerWithdrawComponent$Builder DaggerWithdrawComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #116 <Method DaggerWithdrawComponent$Builder DaggerWithdrawComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #118 <Class WithdrawModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #121 <Method void WithdrawModule(WithdrawActivity)>
	//    7   15:invokevirtual   #125 <Method DaggerWithdrawComponent$Builder DaggerWithdrawComponent$Builder.withdrawModule(WithdrawModule)>
	//    8   18:invokevirtual   #129 <Method WithdrawComponent DaggerWithdrawComponent$Builder.build()>
	//    9   21:areturn         
	}

	public FlyUpPageCreator getFlyUpPageCreator(String s, FlyUpPagerController flyuppagercontroller)
	{
		if("fly_up_unconfirmed".equals(((Object) (s))) && ((WithdrawPresenter)mvpPresenter).getCustomer() != null)
	//*   0    0:ldc1            #37  <String "fly_up_unconfirmed">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            52
	//*   4    9:aload_0         
	//*   5   10:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//*   6   13:checkcast       #143 <Class WithdrawPresenter>
	//*   7   16:invokeinterface #147 <Method Customer WithdrawPresenter.getCustomer()>
	//*   8   21:ifnull          52
			return ((FlyUpPageCreator) (new UnconfirmedFlyUpPageCreator(flyuppagercontroller, ((WithdrawPresenter)mvpPresenter).getCustomer().getEmail(), validation)));
	//    9   24:new             #149 <Class UnconfirmedFlyUpPageCreator>
	//   10   27:dup             
	//   11   28:aload_2         
	//   12   29:aload_0         
	//   13   30:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   14   33:checkcast       #143 <Class WithdrawPresenter>
	//   15   36:invokeinterface #147 <Method Customer WithdrawPresenter.getCustomer()>
	//   16   41:invokevirtual   #155 <Method String Customer.getEmail()>
	//   17   44:aload_0         
	//   18   45:getfield        #157 <Field Validation validation>
	//   19   48:invokespecial   #160 <Method void UnconfirmedFlyUpPageCreator(FlyUpPagerController, String, Validation)>
	//   20   51:areturn         
		if("fly_up_card_purchase_success".equals(((Object) (s))))
	//*  21   52:ldc1            #31  <String "fly_up_card_purchase_success">
	//*  22   54:aload_1         
	//*  23   55:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  24   58:ifeq            73
			return ((FlyUpPageCreator) (new OnePageFlyUpCreator(flyuppagercontroller, ((com.ibotta.android.fragment.dialog.flyup.OnePageFlyUpCreator.OnePageFlyUpCreatorListener) (null)), 0x7f0c00e2)));
	//   25   61:new             #162 <Class OnePageFlyUpCreator>
	//   26   64:dup             
	//   27   65:aload_2         
	//   28   66:aconst_null     
	//   29   67:ldc1            #163 <Int 0x7f0c00e2>
	//   30   69:invokespecial   #166 <Method void OnePageFlyUpCreator(FlyUpPagerController, com.ibotta.android.fragment.dialog.flyup.OnePageFlyUpCreator$OnePageFlyUpCreatorListener, int)>
	//   31   72:areturn         
		if("fly_up_cash_out_success".equals(((Object) (s))))
	//*  32   73:ldc1            #34  <String "fly_up_cash_out_success">
	//*  33   75:aload_1         
	//*  34   76:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  35   79:ifeq            104
			return ((FlyUpPageCreator) (new CashOutTransferSuccessFlyUpCreator(flyuppagercontroller, ((com.ibotta.android.fragment.dialog.flyup.OnePageFlyUpCreator.OnePageFlyUpCreatorListener) (null)), ((WithdrawPresenter)mvpPresenter).getCashOutSuccessType())));
	//   36   82:new             #168 <Class CashOutTransferSuccessFlyUpCreator>
	//   37   85:dup             
	//   38   86:aload_2         
	//   39   87:aconst_null     
	//   40   88:aload_0         
	//   41   89:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   42   92:checkcast       #143 <Class WithdrawPresenter>
	//   43   95:invokeinterface #172 <Method com.ibotta.api.model.customer.CustomerAccount$Type WithdrawPresenter.getCashOutSuccessType()>
	//   44  100:invokespecial   #175 <Method void CashOutTransferSuccessFlyUpCreator(FlyUpPagerController, com.ibotta.android.fragment.dialog.flyup.OnePageFlyUpCreator$OnePageFlyUpCreatorListener, com.ibotta.api.model.customer.CustomerAccount$Type)>
	//   45  103:areturn         
		else
			return null;
	//   46  104:aconst_null     
	//   47  105:areturn         
	}

	public volatile SwipeRefreshLayout getPtrView()
	{
		return ((SwipeRefreshLayout) (getPtrView()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method IBSwipeRefreshLayout getPtrView()>
	//    2    4:areturn         
	}

	public IBSwipeRefreshLayout getPtrView()
	{
		return srlSwipeRefresh;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field IBSwipeRefreshLayout srlSwipeRefresh>
	//    2    4:areturn         
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((WithdrawComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #186 <Class WithdrawComponent>
	//    3    5:invokevirtual   #189 <Method void inject(WithdrawComponent)>
	//    4    8:return          
	}

	protected void inject(WithdrawComponent withdrawcomponent)
	{
		withdrawcomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #191 <Method void WithdrawComponent.inject(WithdrawActivity)>
	//    3    7:return          
	}

	public void launchCashOut(com.ibotta.api.model.customer.CustomerAccount.Type type)
	{
		if(com.ibotta.api.model.customer.CustomerAccount.Type.PAYPAL == type)
	//*   0    0:getstatic       #199 <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.PAYPAL>
	//*   1    3:aload_1         
	//*   2    4:if_acmpne       18
		{
			CashOutActivity.startForResult(((android.app.Activity) (this)), CashOutType.PAYPAL.name());
	//    3    7:aload_0         
	//    4    8:getstatic       #204 <Field CashOutType CashOutType.PAYPAL>
	//    5   11:invokevirtual   #207 <Method String CashOutType.name()>
	//    6   14:invokestatic    #213 <Method void CashOutActivity.startForResult(android.app.Activity, String)>
			return;
	//    7   17:return          
		} else
		{
			CashOutActivity.startForResult(((android.app.Activity) (this)), CashOutType.VENMO.name());
	//    8   18:aload_0         
	//    9   19:getstatic       #216 <Field CashOutType CashOutType.VENMO>
	//   10   22:invokevirtual   #207 <Method String CashOutType.name()>
	//   11   25:invokestatic    #213 <Method void CashOutActivity.startForResult(android.app.Activity, String)>
			return;
	//   12   28:return          
		}
	}

	public void launchGiftCard(int i)
	{
		GiftCardActivity.startForResult(((android.app.Activity) (this)), i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #222 <Method void GiftCardActivity.startForResult(android.app.Activity, int)>
	//    3    5:return          
	}

	public void launchInviteFriends()
	{
		startActivity((new InviteIntentCreator(((android.content.Context) (this)))).create());
	//    0    0:aload_0         
	//    1    1:new             #225 <Class InviteIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #228 <Method void InviteIntentCreator(android.content.Context)>
	//    5    9:invokevirtual   #231 <Method Intent InviteIntentCreator.create()>
	//    6   12:invokevirtual   #235 <Method void startActivity(Intent)>
	//    7   15:return          
	}

	public void launchLinkGenericCashAccount(CashOutType cashouttype)
	{
		LinkCashAccountActivity.startForResult(((android.app.Activity) (this)), cashouttype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #242 <Method void LinkCashAccountActivity.startForResult(android.app.Activity, CashOutType)>
	//    3    5:return          
	}

	public void launchPayPalLink(String s)
	{
		startActivity((new PayPalConnectIntentCreator(((android.content.Context) (this)), s)).create());
	//    0    0:aload_0         
	//    1    1:new             #245 <Class PayPalConnectIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #248 <Method void PayPalConnectIntentCreator(android.content.Context, String)>
	//    6   10:invokevirtual   #249 <Method Intent PayPalConnectIntentCreator.create()>
	//    7   13:invokevirtual   #235 <Method void startActivity(Intent)>
	//    8   16:return          
	}

	public void linkAccount(CashOutType cashouttype)
	{
		((WithdrawPresenter)mvpPresenter).onLinkAccountClicked(cashouttype);
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #143 <Class WithdrawPresenter>
	//    3    7:aload_1         
	//    4    8:invokeinterface #253 <Method void WithdrawPresenter.onLinkAccountClicked(CashOutType)>
	//    5   13:return          
	}

	public void onAccountClicked(CustomerAccount customeraccount)
	{
		((WithdrawPresenter)mvpPresenter).onCashAccountClicked(customeraccount);
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #143 <Class WithdrawPresenter>
	//    3    7:aload_1         
	//    4    8:invokeinterface #258 <Method void WithdrawPresenter.onCashAccountClicked(CustomerAccount)>
	//    5   13:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		if(j == -1)
	//*   0    0:iload_2         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          146
		{
			WithdrawalDetails withdrawaldetails = new WithdrawalDetails();
	//    3    5:new             #262 <Class WithdrawalDetails>
	//    4    8:dup             
	//    5    9:invokespecial   #263 <Method void WithdrawalDetails()>
	//    6   12:astore          4
			switch(i)
	//*   7   14:iload_1         
			{
	//*   8   15:tableswitch     20 23: default 44
	//	               20 133
	//	               21 120
	//	               22 86
	//	               23 52
			default:
				super.onActivityResult(i, j, intent);
	//    9   44:aload_0         
	//   10   45:iload_1         
	//   11   46:iload_2         
	//   12   47:aload_3         
	//   13   48:invokespecial   #265 <Method void PtrLoadingMvpActivity.onActivityResult(int, int, Intent)>
				return;
	//   14   51:return          

			case 23: // '\027'
				if(intent != null)
	//*  15   52:aload_3         
	//*  16   53:ifnull          71
					withdrawaldetails = (WithdrawalDetails)Parcels.unwrap(intent.getParcelableExtra("gift_card_withdrawal_details"));
	//   17   56:aload_3         
	//   18   57:ldc2            #267 <String "gift_card_withdrawal_details">
	//   19   60:invokevirtual   #273 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   20   63:invokestatic    #279 <Method Object Parcels.unwrap(android.os.Parcelable)>
	//   21   66:checkcast       #262 <Class WithdrawalDetails>
	//   22   69:astore          4
				((WithdrawPresenter)mvpPresenter).onGiftCardSuccess(withdrawaldetails);
	//   23   71:aload_0         
	//   24   72:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   25   75:checkcast       #143 <Class WithdrawPresenter>
	//   26   78:aload           4
	//   27   80:invokeinterface #283 <Method void WithdrawPresenter.onGiftCardSuccess(WithdrawalDetails)>
				return;
	//   28   85:return          

			case 22: // '\026'
				if(intent != null)
	//*  29   86:aload_3         
	//*  30   87:ifnull          105
					withdrawaldetails = (WithdrawalDetails)Parcels.unwrap(intent.getParcelableExtra("cashout_withdrawal_details"));
	//   31   90:aload_3         
	//   32   91:ldc2            #285 <String "cashout_withdrawal_details">
	//   33   94:invokevirtual   #273 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   34   97:invokestatic    #279 <Method Object Parcels.unwrap(android.os.Parcelable)>
	//   35  100:checkcast       #262 <Class WithdrawalDetails>
	//   36  103:astore          4
				((WithdrawPresenter)mvpPresenter).onCashOutSuccess(withdrawaldetails);
	//   37  105:aload_0         
	//   38  106:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   39  109:checkcast       #143 <Class WithdrawPresenter>
	//   40  112:aload           4
	//   41  114:invokeinterface #288 <Method void WithdrawPresenter.onCashOutSuccess(WithdrawalDetails)>
				return;
	//   42  119:return          

			case 21: // '\025'
				((WithdrawPresenter)mvpPresenter).onVerifyDeviceSuccess();
	//   43  120:aload_0         
	//   44  121:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   45  124:checkcast       #143 <Class WithdrawPresenter>
	//   46  127:invokeinterface #291 <Method void WithdrawPresenter.onVerifyDeviceSuccess()>
				return;
	//   47  132:return          

			case 20: // '\024'
				((WithdrawPresenter)mvpPresenter).onLinkSuccess();
	//   48  133:aload_0         
	//   49  134:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   50  137:checkcast       #143 <Class WithdrawPresenter>
	//   51  140:invokeinterface #294 <Method void WithdrawPresenter.onLinkSuccess()>
				return;
	//   52  145:return          
			}
		} else
		{
			super.onActivityResult(i, j, intent);
	//   53  146:aload_0         
	//   54  147:iload_1         
	//   55  148:iload_2         
	//   56  149:aload_3         
	//   57  150:invokespecial   #265 <Method void PtrLoadingMvpActivity.onActivityResult(int, int, Intent)>
			return;
	//   58  153:return          
		}
	}

	public void onChoice(String s, int i, String s1)
	{
		if("delete_confirmation".equals(((Object) (s))))
	//*   0    0:ldc1            #22  <String "delete_confirmation">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            32
		{
			if(i == 0x7f1100ea)
	//*   4    9:iload_2         
	//*   5   10:ldc2            #297 <Int 0x7f1100ea>
	//*   6   13:icmpne          91
				((WithdrawPresenter)mvpPresenter).onUnlinkAccountActionClicked(i);
	//    7   16:aload_0         
	//    8   17:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    9   20:checkcast       #143 <Class WithdrawPresenter>
	//   10   23:iload_2         
	//   11   24:invokeinterface #300 <Method void WithdrawPresenter.onUnlinkAccountActionClicked(int)>
		} else
	//*  12   29:goto            91
		if("email_reset".equals(((Object) (s))))
	//*  13   32:ldc1            #28  <String "email_reset">
	//*  14   34:aload_1         
	//*  15   35:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  16   38:ifeq            63
		{
			if(i == 0x7f1101c8)
	//*  17   41:iload_2         
	//*  18   42:ldc2            #301 <Int 0x7f1101c8>
	//*  19   45:icmpne          91
				((WithdrawPresenter)mvpPresenter).onEmailResetSuccess();
	//   20   48:aload_0         
	//   21   49:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   22   52:checkcast       #143 <Class WithdrawPresenter>
	//   23   55:invokeinterface #304 <Method void WithdrawPresenter.onEmailResetSuccess()>
		} else
	//*  24   60:goto            91
		if("confirmation_sent".equals(((Object) (s))) && i == 0x7f1101c8)
	//*  25   63:ldc1            #19  <String "confirmation_sent">
	//*  26   65:aload_1         
	//*  27   66:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  28   69:ifeq            91
	//*  29   72:iload_2         
	//*  30   73:ldc2            #301 <Int 0x7f1101c8>
	//*  31   76:icmpne          91
			((WithdrawPresenter)mvpPresenter).onResendConfirmationSuccess();
	//   32   79:aload_0         
	//   33   80:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   34   83:checkcast       #143 <Class WithdrawPresenter>
	//   35   86:invokeinterface #307 <Method void WithdrawPresenter.onResendConfirmationSuccess()>
		super.onChoice(s, i, s1);
	//   36   91:aload_0         
	//   37   92:aload_1         
	//   38   93:iload_2         
	//   39   94:aload_3         
	//   40   95:invokespecial   #309 <Method void PtrLoadingMvpActivity.onChoice(String, int, String)>
	//   41   98:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #314 <Method void PtrLoadingMvpActivity.onCreate(Bundle)>
		setContentView(0x7f0c007f);
	//    3    5:aload_0         
	//    4    6:ldc2            #315 <Int 0x7f0c007f>
	//    5    9:invokevirtual   #318 <Method void setContentView(int)>
		setUnbinder(ButterKnife.bind(((android.app.Activity) (this))));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokestatic    #324 <Method butterknife.Unbinder ButterKnife.bind(android.app.Activity)>
	//    9   17:invokevirtual   #328 <Method void setUnbinder(butterknife.Unbinder)>
		initTitle();
	//   10   20:aload_0         
	//   11   21:invokespecial   #330 <Method void initTitle()>
		initListView();
	//   12   24:aload_0         
	//   13   25:invokespecial   #332 <Method void initListView()>
	//   14   28:return          
	}

	public boolean onFlyUpCancel(String s, int i)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onFlyUpPageEvent(String s, FlyUpPageEvent flyuppageevent)
	{
		if("fly_up_unconfirmed".equals(((Object) (s))))
	//*   0    0:ldc1            #37  <String "fly_up_unconfirmed">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            64
		{
			if(flyuppageevent.getEventId() == 2)
	//*   4    9:aload_2         
	//*   5   10:invokevirtual   #343 <Method int FlyUpPageEvent.getEventId()>
	//*   6   13:iconst_2        
	//*   7   14:icmpne          30
			{
				((WithdrawPresenter)mvpPresenter).onResendEmailClicked();
	//    8   17:aload_0         
	//    9   18:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   10   21:checkcast       #143 <Class WithdrawPresenter>
	//   11   24:invokeinterface #346 <Method void WithdrawPresenter.onResendEmailClicked()>
				return;
	//   12   29:return          
			}
			if(flyuppageevent.getEventId() == 1 && (flyuppageevent instanceof com.ibotta.android.fragment.cashout.UnconfirmedFlyUpPageCreator.ResetEmailPageEvent))
	//*  13   30:aload_2         
	//*  14   31:invokevirtual   #343 <Method int FlyUpPageEvent.getEventId()>
	//*  15   34:iconst_1        
	//*  16   35:icmpne          64
	//*  17   38:aload_2         
	//*  18   39:instanceof      #348 <Class com.ibotta.android.fragment.cashout.UnconfirmedFlyUpPageCreator$ResetEmailPageEvent>
	//*  19   42:ifeq            64
				((WithdrawPresenter)mvpPresenter).onResetEmailClicked(((com.ibotta.android.fragment.cashout.UnconfirmedFlyUpPageCreator.ResetEmailPageEvent)flyuppageevent).getNewEmail());
	//   20   45:aload_0         
	//   21   46:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   22   49:checkcast       #143 <Class WithdrawPresenter>
	//   23   52:aload_2         
	//   24   53:checkcast       #348 <Class com.ibotta.android.fragment.cashout.UnconfirmedFlyUpPageCreator$ResetEmailPageEvent>
	//   25   56:invokevirtual   #351 <Method String com.ibotta.android.fragment.cashout.UnconfirmedFlyUpPageCreator$ResetEmailPageEvent.getNewEmail()>
	//   26   59:invokeinterface #354 <Method void WithdrawPresenter.onResetEmailClicked(String)>
		}
	//   27   64:return          
	}

	public void onGiftCardClicked(GiftCard giftcard)
	{
		((WithdrawPresenter)mvpPresenter).onGiftCardClicked(giftcard);
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #143 <Class WithdrawPresenter>
	//    3    7:aload_1         
	//    4    8:invokeinterface #358 <Method void WithdrawPresenter.onGiftCardClicked(GiftCard)>
	//    5   13:return          
	}

	public void onInviteFriendsClicked()
	{
		((WithdrawPresenter)mvpPresenter).onInviteFriendsClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #143 <Class WithdrawPresenter>
	//    3    7:invokeinterface #361 <Method void WithdrawPresenter.onInviteFriendsClicked()>
	//    4   12:return          
	}

	public void onPasswordCaptured(String s, String s1)
	{
		if("pw_capture_link_paypal".equals(((Object) (s))))
	//*   0    0:ldc1            #40  <String "pw_capture_link_paypal">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            23
		{
			((WithdrawPresenter)mvpPresenter).onPayPalLinkPasswordCaptured(s1);
	//    4    9:aload_0         
	//    5   10:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    6   13:checkcast       #143 <Class WithdrawPresenter>
	//    7   16:aload_2         
	//    8   17:invokeinterface #366 <Method void WithdrawPresenter.onPayPalLinkPasswordCaptured(String)>
			return;
	//    9   22:return          
		}
		if("pw_capture_reset_email".equals(((Object) (s))))
	//*  10   23:ldc1            #43  <String "pw_capture_reset_email">
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  13   29:ifeq            45
			((WithdrawPresenter)mvpPresenter).onResetEmailPasswordCaptured(s1);
	//   14   32:aload_0         
	//   15   33:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   16   36:checkcast       #143 <Class WithdrawPresenter>
	//   17   39:aload_2         
	//   18   40:invokeinterface #369 <Method void WithdrawPresenter.onResetEmailPasswordCaptured(String)>
	//   19   45:return          
	}

	public void onResendEmailSuccess()
	{
		DialogFragmentHelper.INSTANCE.hide(((com.ibotta.android.activity.CompatSupplier) (this)), "fly_up_unconfirmed");
	//    0    0:getstatic       #376 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    1    3:aload_0         
	//    2    4:ldc1            #37  <String "fly_up_unconfirmed">
	//    3    6:invokevirtual   #380 <Method void DialogFragmentHelper.hide(com.ibotta.android.activity.CompatSupplier, String)>
		PromptDialogFragment promptdialogfragment = PromptDialogFragment.newInstance(((String) (null)), getString(0x7f110683), new int[] {
			0x7f1101c8
		});
	//    4    9:aconst_null     
	//    5   10:aload_0         
	//    6   11:ldc2            #381 <Int 0x7f110683>
	//    7   14:invokevirtual   #385 <Method String getString(int)>
	//    8   17:iconst_1        
	//    9   18:newarray        int[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:ldc2            #301 <Int 0x7f1101c8>
	//   13   25:iastore         
	//   14   26:invokestatic    #391 <Method PromptDialogFragment PromptDialogFragment.newInstance(String, String, int[])>
	//   15   29:astore_1        
		promptdialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #394 <Method void PromptDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (promptdialogfragment)), "confirmation_sent");
	//   19   35:getstatic       #376 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:ldc1            #19  <String "confirmation_sent">
	//   23   42:invokevirtual   #398 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
	//   24   45:return          
	}

	public void onResetEmailSuccess()
	{
		DialogFragmentHelper.INSTANCE.hide(((com.ibotta.android.activity.CompatSupplier) (this)), "fly_up_unconfirmed");
	//    0    0:getstatic       #376 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    1    3:aload_0         
	//    2    4:ldc1            #37  <String "fly_up_unconfirmed">
	//    3    6:invokevirtual   #380 <Method void DialogFragmentHelper.hide(com.ibotta.android.activity.CompatSupplier, String)>
		PromptDialogFragment promptdialogfragment = PromptDialogFragment.newInstance(((String) (null)), getString(0x7f110597), new int[] {
			0x7f1101c8
		});
	//    4    9:aconst_null     
	//    5   10:aload_0         
	//    6   11:ldc2            #400 <Int 0x7f110597>
	//    7   14:invokevirtual   #385 <Method String getString(int)>
	//    8   17:iconst_1        
	//    9   18:newarray        int[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:ldc2            #301 <Int 0x7f1101c8>
	//   13   25:iastore         
	//   14   26:invokestatic    #391 <Method PromptDialogFragment PromptDialogFragment.newInstance(String, String, int[])>
	//   15   29:astore_1        
		promptdialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #394 <Method void PromptDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (promptdialogfragment)), "email_reset");
	//   19   35:getstatic       #376 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:ldc1            #28  <String "email_reset">
	//   23   42:invokevirtual   #398 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
	//   24   45:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #403 <Method void PtrLoadingMvpActivity.onResume()>
		brazeTracking.trackWithdrawCashView();
	//    2    4:aload_0         
	//    3    5:getfield        #405 <Field BrazeTracking brazeTracking>
	//    4    8:invokeinterface #410 <Method void BrazeTracking.trackWithdrawCashView()>
	//    5   13:return          
	}

	public void setBalanceBelowMinimum()
	{
		tvDollarSign.setTextColor(getResources().getColor(0x7f06010e));
	//    0    0:aload_0         
	//    1    1:getfield        #413 <Field TextView tvDollarSign>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #417 <Method Resources getResources()>
	//    4    8:ldc2            #418 <Int 0x7f06010e>
	//    5   11:invokevirtual   #424 <Method int Resources.getColor(int)>
	//    6   14:invokevirtual   #429 <Method void TextView.setTextColor(int)>
		tvDollarSign.setText(0x7f110154);
	//    7   17:aload_0         
	//    8   18:getfield        #413 <Field TextView tvDollarSign>
	//    9   21:ldc2            #430 <Int 0x7f110154>
	//   10   24:invokevirtual   #433 <Method void TextView.setText(int)>
		tvAmount.setTextColor(getResources().getColor(0x7f06010e));
	//   11   27:aload_0         
	//   12   28:getfield        #435 <Field TextView tvAmount>
	//   13   31:aload_0         
	//   14   32:invokevirtual   #417 <Method Resources getResources()>
	//   15   35:ldc2            #418 <Int 0x7f06010e>
	//   16   38:invokevirtual   #424 <Method int Resources.getColor(int)>
	//   17   41:invokevirtual   #429 <Method void TextView.setTextColor(int)>
	//   18   44:return          
	}

	public void setBalanceMinimumMet()
	{
		tvDollarSign.setTextColor(getResources().getColor(0x7f060171));
	//    0    0:aload_0         
	//    1    1:getfield        #413 <Field TextView tvDollarSign>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #417 <Method Resources getResources()>
	//    4    8:ldc2            #437 <Int 0x7f060171>
	//    5   11:invokevirtual   #424 <Method int Resources.getColor(int)>
	//    6   14:invokevirtual   #429 <Method void TextView.setTextColor(int)>
		tvDollarSign.setText(0x7f110154);
	//    7   17:aload_0         
	//    8   18:getfield        #413 <Field TextView tvDollarSign>
	//    9   21:ldc2            #430 <Int 0x7f110154>
	//   10   24:invokevirtual   #433 <Method void TextView.setText(int)>
		tvAmount.setTextColor(getResources().getColor(0x7f060171));
	//   11   27:aload_0         
	//   12   28:getfield        #435 <Field TextView tvAmount>
	//   13   31:aload_0         
	//   14   32:invokevirtual   #417 <Method Resources getResources()>
	//   15   35:ldc2            #437 <Int 0x7f060171>
	//   16   38:invokevirtual   #424 <Method int Resources.getColor(int)>
	//   17   41:invokevirtual   #429 <Method void TextView.setTextColor(int)>
	//   18   44:return          
	}

	public void setRows(List list)
	{
		wlvWithdrawOptions.setRows(list);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field WithdrawListView wlvWithdrawOptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #441 <Method void WithdrawListView.setRows(List)>
	//    4    8:return          
	}

	public void setWithdrawAvailableAmount(String s)
	{
		tvAmount.setText(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #435 <Field TextView tvAmount>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #447 <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	public void showCashOutSuccess()
	{
		FlyUpDialogFragment flyupdialogfragment = FlyUpDialogFragment.newInstance();
	//    0    0:invokestatic    #453 <Method FlyUpDialogFragment FlyUpDialogFragment.newInstance()>
	//    1    3:astore_1        
		flyupdialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #454 <Method void FlyUpDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (flyupdialogfragment)), "fly_up_cash_out_success");
	//    5    9:getstatic       #376 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:ldc1            #34  <String "fly_up_cash_out_success">
	//    9   16:invokevirtual   #398 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
	//   10   19:return          
	}

	public void showDeleteAccountConfirmation()
	{
		PromptDialogFragment promptdialogfragment = PromptDialogFragment.newInstance(getString(0x7f1100ec), getString(0x7f1100eb), new int[] {
			0x7f1100e9, 0x7f1100ea
		});
	//    0    0:aload_0         
	//    1    1:ldc2            #456 <Int 0x7f1100ec>
	//    2    4:invokevirtual   #385 <Method String getString(int)>
	//    3    7:aload_0         
	//    4    8:ldc2            #457 <Int 0x7f1100eb>
	//    5   11:invokevirtual   #385 <Method String getString(int)>
	//    6   14:iconst_2        
	//    7   15:newarray        int[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:ldc2            #458 <Int 0x7f1100e9>
	//   11   22:iastore         
	//   12   23:dup             
	//   13   24:iconst_1        
	//   14   25:ldc2            #297 <Int 0x7f1100ea>
	//   15   28:iastore         
	//   16   29:invokestatic    #391 <Method PromptDialogFragment PromptDialogFragment.newInstance(String, String, int[])>
	//   17   32:astore_1        
		promptdialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:invokevirtual   #394 <Method void PromptDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (promptdialogfragment)), "delete_confirmation");
	//   21   38:getstatic       #376 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:ldc1            #22  <String "delete_confirmation">
	//   25   45:invokevirtual   #398 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
	//   26   48:return          
	}

	public void showEmailConfirmation()
	{
		FlyUpDialogFragment flyupdialogfragment = FlyUpDialogFragment.newInstance();
	//    0    0:invokestatic    #453 <Method FlyUpDialogFragment FlyUpDialogFragment.newInstance()>
	//    1    3:astore_1        
		flyupdialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #454 <Method void FlyUpDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (flyupdialogfragment)), "fly_up_unconfirmed");
	//    5    9:getstatic       #376 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:ldc1            #37  <String "fly_up_unconfirmed">
	//    9   16:invokevirtual   #398 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
	//   10   19:return          
	}

	public void showGiftCardSuccess()
	{
		FlyUpDialogFragment flyupdialogfragment = FlyUpDialogFragment.newInstance();
	//    0    0:invokestatic    #453 <Method FlyUpDialogFragment FlyUpDialogFragment.newInstance()>
	//    1    3:astore_1        
		flyupdialogfragment.setListener(((com.ibotta.android.fragment.dialog.IbottaDialogFragment.IbottaDialogFragmentListener) (this)));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #454 <Method void FlyUpDialogFragment.setListener(com.ibotta.android.fragment.dialog.IbottaDialogFragment$IbottaDialogFragmentListener)>
		DialogFragmentHelper.INSTANCE.show(((com.ibotta.android.activity.CompatSupplier) (this)), ((android.support.v4.app.DialogFragment) (flyupdialogfragment)), "fly_up_card_purchase_success");
	//    5    9:getstatic       #376 <Field DialogFragmentHelper DialogFragmentHelper.INSTANCE>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:ldc1            #31  <String "fly_up_card_purchase_success">
	//    9   16:invokevirtual   #398 <Method void DialogFragmentHelper.show(com.ibotta.android.activity.CompatSupplier, android.support.v4.app.DialogFragment, String)>
	//   10   19:return          
	}

	public void showInsufficientFundsDialog(CustomerAccount customeraccount, String s)
	{
		if(customeraccount.getTypeEnum() == com.ibotta.api.model.customer.CustomerAccount.Type.VENMO)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #467 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//*   2    4:getstatic       #469 <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.VENMO>
	//*   3    7:if_acmpne       21
			customeraccount = ((CustomerAccount) (getString(0x7f110209)));
	//    4   10:aload_0         
	//    5   11:ldc2            #470 <Int 0x7f110209>
	//    6   14:invokevirtual   #385 <Method String getString(int)>
	//    7   17:astore_1        
		else
	//*   8   18:goto            44
		if(customeraccount.getTypeEnum() == com.ibotta.api.model.customer.CustomerAccount.Type.PAYPAL)
	//*   9   21:aload_1         
	//*  10   22:invokevirtual   #467 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//*  11   25:getstatic       #199 <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.PAYPAL>
	//*  12   28:if_acmpne       42
			customeraccount = ((CustomerAccount) (getString(0x7f1101d1)));
	//   13   31:aload_0         
	//   14   32:ldc2            #471 <Int 0x7f1101d1>
	//   15   35:invokevirtual   #385 <Method String getString(int)>
	//   16   38:astore_1        
		else
	//*  17   39:goto            44
			customeraccount = null;
	//   18   42:aconst_null     
	//   19   43:astore_1        
		showErrorMessage(getString(0x7f1100e8, new Object[] {
			getString(0x7f1100f0, new Object[] {
				s
			}), customeraccount
		}), "dialog_cash_min_balance");
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:ldc2            #472 <Int 0x7f1100e8>
	//   23   49:iconst_2        
	//   24   50:anewarray       Object[]
	//   25   53:dup             
	//   26   54:iconst_0        
	//   27   55:aload_0         
	//   28   56:ldc2            #475 <Int 0x7f1100f0>
	//   29   59:iconst_1        
	//   30   60:anewarray       Object[]
	//   31   63:dup             
	//   32   64:iconst_0        
	//   33   65:aload_2         
	//   34   66:aastore         
	//   35   67:invokevirtual   #478 <Method String getString(int, Object[])>
	//   36   70:aastore         
	//   37   71:dup             
	//   38   72:iconst_1        
	//   39   73:aload_1         
	//   40   74:aastore         
	//   41   75:invokevirtual   #478 <Method String getString(int, Object[])>
	//   42   78:ldc1            #25  <String "dialog_cash_min_balance">
	//   43   80:invokevirtual   #481 <Method void showErrorMessage(String, String)>
	//   44   83:return          
	}

	public void showPhoneVerification()
	{
		VerifyDeviceActivity.startForResult(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #487 <Method void VerifyDeviceActivity.startForResult(android.app.Activity)>
	//    2    4:return          
	}

	public void unlinkAccount(CustomerAccount customeraccount)
	{
		((WithdrawPresenter)mvpPresenter).onUnlinkAccountClicked(customeraccount);
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #143 <Class WithdrawPresenter>
	//    3    7:aload_1         
	//    4    8:invokeinterface #491 <Method void WithdrawPresenter.onUnlinkAccountClicked(CustomerAccount)>
	//    5   13:return          
	}

	private static final String TAG_CONFIRMATION_RESENT = "confirmation_sent";
	private static final String TAG_DELETE_CONFIRMATION = "delete_confirmation";
	private static final String TAG_DIALOG_CASH_MIN_BALANCE = "dialog_cash_min_balance";
	private static final String TAG_EMAIL_RESET = "email_reset";
	private static final String TAG_FLY_UP_CARD_PURCHASE_SUCCESS = "fly_up_card_purchase_success";
	private static final String TAG_FLY_UP_CASH_OUT_SUCCESS = "fly_up_cash_out_success";
	private static final String TAG_FLY_UP_UNCONFIRMED = "fly_up_unconfirmed";
	private static final String TAG_PW_CAPTURE_LINK_PAYPAL = "pw_capture_link_paypal";
	private static final String TAG_PW_CAPTURE_RESET_EMAIL = "pw_capture_reset_email";
	protected BrazeTracking brazeTracking;
	protected PasswordPrompterFactory passwordPrompterFactory;
	protected IBSwipeRefreshLayout srlSwipeRefresh;
	protected TextView tvAmount;
	protected TextView tvDollarSign;
	protected Validation validation;
	protected WithdrawListView wlvWithdrawOptions;
}
