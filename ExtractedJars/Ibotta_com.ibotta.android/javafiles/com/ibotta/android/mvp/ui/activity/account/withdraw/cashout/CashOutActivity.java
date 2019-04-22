// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.*;
import butterknife.ButterKnife;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.mvp.base.MvpComponent;
import com.ibotta.android.mvp.base.MvpPresenter;
import com.ibotta.android.mvp.base.loading.LoadingMvpActivity;
import com.ibotta.android.mvp.ui.activity.account.withdraw.CashOutType;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawalDetails;
import com.ibotta.android.mvp.ui.misc.password.*;
import com.ibotta.android.util.Formatting;
import com.ibotta.android.views.base.title.TitleBarView;
import com.ibotta.android.views.base.title.TitleBarViewState;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import org.parceler.Parcels;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout:
//			CashOutView, CashOutPresenter, DaggerCashOutComponent, CashOutModule, 
//			CashOutComponent

public class CashOutActivity extends LoadingMvpActivity
	implements CashOutView, PasswordListener
{

	public CashOutActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void LoadingMvpActivity()>
	//    2    4:return          
	}

	private void initListeners()
	{
		etAmount.addTextChangedListener(new TextWatcher() );
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field EditText etAmount>
	//    2    4:new             #11  <Class CashOutActivity$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #58  <Method void CashOutActivity$1(CashOutActivity)>
	//    6   12:invokevirtual   #64  <Method void EditText.addTextChangedListener(TextWatcher)>
		Button button = bTransferCash;
	//    7   15:aload_0         
	//    8   16:getfield        #66  <Field Button bTransferCash>
	//    9   19:astore_1        
		_2D_..Lambda.CashOutActivity.d_yehHiwTzS_vPPhwFBm_IsAeiQ d_yehhiwtzs_vpphwfbm_isaeiq = new d_yehHiwTzS_vPPhwFBm_IsAeiQ(this);
	//   10   20:new             #68  <Class _2D_$$Lambda$CashOutActivity$d_yehHiwTzS_vPPhwFBm_IsAeiQ>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #69  <Method void _2D_$$Lambda$CashOutActivity$d_yehHiwTzS_vPPhwFBm_IsAeiQ(CashOutActivity)>
	//   14   28:astore_2        
		if(!(button instanceof View))
	//*  15   29:aload_1         
	//*  16   30:instanceof      #71  <Class View>
	//*  17   33:ifne            42
		{
			button.setOnClickListener(((android.view.View.OnClickListener) (d_yehhiwtzs_vpphwfbm_isaeiq)));
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #77  <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   21   41:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)button, ((android.view.View.OnClickListener) (d_yehhiwtzs_vpphwfbm_isaeiq)));
	//   22   42:aload_1         
	//   23   43:checkcast       #71  <Class View>
	//   24   46:aload_2         
	//   25   47:invokestatic    #82  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   26   50:return          
		}
	}

	private void initLogo(CashOutType cashouttype)
	{
		ivLogo.setImageResource(cashouttype.getSvgDrawableResId());
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field ImageView ivLogo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #92  <Method int CashOutType.getSvgDrawableResId()>
	//    4    8:invokevirtual   #98  <Method void ImageView.setImageResource(int)>
	//    5   11:return          
	}

	private void initTitle(CashOutType cashouttype)
	{
		setTitle(((CharSequence) (cashouttype.getName())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method String CashOutType.getName()>
	//    3    5:invokevirtual   #107 <Method void setTitle(CharSequence)>
	//    4    8:return          
	}

	public static void lambda$initListeners$0(CashOutActivity cashoutactivity, View view)
	{
		((CashOutPresenter)cashoutactivity.mvpPresenter).onTransferCashClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #111 <Class CashOutPresenter>
	//    3    7:invokeinterface #114 <Method void CashOutPresenter.onTransferCashClicked()>
	//    4   12:return          
	}

	private static Intent newIntent(Context context, String s)
	{
		context = ((Context) (new Intent(context, com/ibotta/android/mvp/ui/activity/account/withdraw/cashout/CashOutActivity)));
	//    0    0:new             #118 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class CashOutActivity>
	//    4    7:invokespecial   #121 <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).putExtra("account_type", s);
	//    6   11:aload_0         
	//    7   12:ldc1            #123 <String "account_type">
	//    8   14:aload_1         
	//    9   15:invokevirtual   #127 <Method Intent Intent.putExtra(String, String)>
	//   10   18:pop             
		return ((Intent) (context));
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public static void startForResult(Activity activity, String s)
	{
		if(activity == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			activity.startActivityForResult(newIntent(((Context) (activity)), s), 22);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokestatic    #131 <Method Intent newIntent(Context, String)>
	//    7   11:bipush          22
	//    8   13:invokevirtual   #137 <Method void Activity.startActivityForResult(Intent, int)>
			return;
	//    9   16:return          
		}
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #142 <Method CashOutComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected CashOutComponent createComponent(MainComponent maincomponent)
	{
		return DaggerCashOutComponent.builder().mainComponent(maincomponent).cashOutModule(new CashOutModule(this)).build();
	//    0    0:invokestatic    #148 <Method DaggerCashOutComponent$Builder DaggerCashOutComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #154 <Method DaggerCashOutComponent$Builder DaggerCashOutComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #156 <Class CashOutModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #157 <Method void CashOutModule(CashOutActivity)>
	//    7   15:invokevirtual   #161 <Method DaggerCashOutComponent$Builder DaggerCashOutComponent$Builder.cashOutModule(CashOutModule)>
	//    8   18:invokevirtual   #165 <Method CashOutComponent DaggerCashOutComponent$Builder.build()>
	//    9   21:areturn         
	}

	public void finishSuccessfully(WithdrawalDetails withdrawaldetails)
	{
		Intent intent = new Intent();
	//    0    0:new             #118 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #168 <Method void Intent()>
	//    3    7:astore_2        
		intent.putExtra("cashout_withdrawal_details", Parcels.wrap(((Object) (withdrawaldetails))));
	//    4    8:aload_2         
	//    5    9:ldc1            #170 <String "cashout_withdrawal_details">
	//    6   11:aload_1         
	//    7   12:invokestatic    #176 <Method android.os.Parcelable Parcels.wrap(Object)>
	//    8   15:invokevirtual   #179 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//    9   18:pop             
		setResult(-1, intent);
	//   10   19:aload_0         
	//   11   20:iconst_m1       
	//   12   21:aload_2         
	//   13   22:invokevirtual   #183 <Method void setResult(int, Intent)>
		finish();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #186 <Method void finish()>
	//   16   29:return          
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((CashOutComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #190 <Class CashOutComponent>
	//    3    5:invokevirtual   #193 <Method void inject(CashOutComponent)>
	//    4    8:return          
	}

	protected void inject(CashOutComponent cashoutcomponent)
	{
		cashoutcomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #195 <Method void CashOutComponent.inject(CashOutActivity)>
	//    3    7:return          
	}

	protected void onCreate(Bundle bundle)
	{
		((LoadingMvpActivity)this).onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #200 <Method void LoadingMvpActivity.onCreate(Bundle)>
		setContentView(0x7f0c0024);
	//    3    5:aload_0         
	//    4    6:ldc1            #201 <Int 0x7f0c0024>
	//    5    8:invokevirtual   #204 <Method void setContentView(int)>
		setUnbinder(ButterKnife.bind(((Activity) (this))));
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:invokestatic    #210 <Method butterknife.Unbinder ButterKnife.bind(Activity)>
	//    9   16:invokevirtual   #214 <Method void setUnbinder(butterknife.Unbinder)>
		bundle = ((Bundle) (CashOutType.PAYPAL));
	//   10   19:getstatic       #218 <Field CashOutType CashOutType.PAYPAL>
	//   11   22:astore_1        
		if(getIntent() != null)
	//*  12   23:aload_0         
	//*  13   24:invokevirtual   #222 <Method Intent getIntent()>
	//*  14   27:ifnull          43
			bundle = ((Bundle) (CashOutType.fromString(getIntent().getStringExtra("account_type"))));
	//   15   30:aload_0         
	//   16   31:invokevirtual   #222 <Method Intent getIntent()>
	//   17   34:ldc1            #123 <String "account_type">
	//   18   36:invokevirtual   #226 <Method String Intent.getStringExtra(String)>
	//   19   39:invokestatic    #230 <Method CashOutType CashOutType.fromString(String)>
	//   20   42:astore_1        
		((CashOutPresenter)mvpPresenter).setAccountType(((CashOutType) (bundle)));
	//   21   43:aload_0         
	//   22   44:getfield        #52  <Field MvpPresenter mvpPresenter>
	//   23   47:checkcast       #111 <Class CashOutPresenter>
	//   24   50:aload_1         
	//   25   51:invokeinterface #233 <Method void CashOutPresenter.setAccountType(CashOutType)>
		initTitle(((CashOutType) (bundle)));
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:invokespecial   #235 <Method void initTitle(CashOutType)>
		initLogo(((CashOutType) (bundle)));
	//   29   61:aload_0         
	//   30   62:aload_1         
	//   31   63:invokespecial   #237 <Method void initLogo(CashOutType)>
		initListeners();
	//   32   66:aload_0         
	//   33   67:invokespecial   #239 <Method void initListeners()>
	//   34   70:return          
	}

	public void onPasswordCaptured(String s, String s1)
	{
		((CashOutPresenter)mvpPresenter).onPasswordCaptured(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #111 <Class CashOutPresenter>
	//    3    7:aload_2         
	//    4    8:invokeinterface #245 <Method void CashOutPresenter.onPasswordCaptured(String)>
	//    5   13:return          
	}

	public void setAccountName(String s)
	{
		tvAccountName.setText(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #248 <Field TextView tvAccountName>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #253 <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	public void setAmountAvailable(String s)
	{
		tvAmountAvailable.setText(((CharSequence) (getString(0x7f1100f1, new Object[] {
			s
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field TextView tvAmountAvailable>
	//    2    4:aload_0         
	//    3    5:ldc2            #257 <Int 0x7f1100f1>
	//    4    8:iconst_1        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:invokevirtual   #263 <Method String getString(int, Object[])>
	//   11   19:invokevirtual   #253 <Method void TextView.setText(CharSequence)>
	//   12   22:return          
	}

	public void setAmountRemaining(String s)
	{
		tvAmountRemaining.setText(((CharSequence) (getString(0x7f1100f5, new Object[] {
			s
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field TextView tvAmountRemaining>
	//    2    4:aload_0         
	//    3    5:ldc2            #267 <Int 0x7f1100f5>
	//    4    8:iconst_1        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:invokevirtual   #263 <Method String getString(int, Object[])>
	//   11   19:invokevirtual   #253 <Method void TextView.setText(CharSequence)>
	//   12   22:return          
	}

	public void setMinimumCashOutAmountHint(float f)
	{
		tilAmount.setHint(((CharSequence) (getString(0x7f110189, new Object[] {
			formatting.currency(f)
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #271 <Field TextInputLayout tilAmount>
	//    2    4:aload_0         
	//    3    5:ldc2            #272 <Int 0x7f110189>
	//    4    8:iconst_1        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_0         
	//    9   15:getfield        #274 <Field Formatting formatting>
	//   10   18:fload_1         
	//   11   19:f2d             
	//   12   20:invokeinterface #280 <Method String Formatting.currency(double)>
	//   13   25:aastore         
	//   14   26:invokevirtual   #263 <Method String getString(int, Object[])>
	//   15   29:invokevirtual   #285 <Method void TextInputLayout.setHint(CharSequence)>
	//   16   32:return          
	}

	public void setTransferCashEnabled(boolean flag)
	{
		bTransferCash.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Button bTransferCash>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #290 <Method void Button.setEnabled(boolean)>
	//    4    8:return          
	}

	public void setTransferToTitle(TitleBarViewState titlebarviewstate)
	{
		tbvTransferToHeader.updateViewState(titlebarviewstate);
	//    0    0:aload_0         
	//    1    1:getfield        #294 <Field TitleBarView tbvTransferToHeader>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #299 <Method void TitleBarView.updateViewState(TitleBarViewState)>
	//    4    8:return          
	}

	public void showCapturePassword(String s)
	{
		passwordPrompterFactory.create(((PasswordListener) (this)), s).capturePassword();
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field PasswordPrompterFactory passwordPrompterFactory>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #308 <Method PasswordPrompter PasswordPrompterFactory.create(PasswordListener, String)>
	//    5   11:invokeinterface #313 <Method void PasswordPrompter.capturePassword()>
	//    6   16:return          
	}

	public void showInvalidAmount()
	{
		etAmount.setError(((CharSequence) (getString(0x7f1100ef))));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field EditText etAmount>
	//    2    4:aload_0         
	//    3    5:ldc2            #315 <Int 0x7f1100ef>
	//    4    8:invokevirtual   #318 <Method String getString(int)>
	//    5   11:invokevirtual   #321 <Method void EditText.setError(CharSequence)>
	//    6   14:return          
	}

	protected Button bTransferCash;
	protected EditText etAmount;
	protected Formatting formatting;
	protected ImageView ivLogo;
	protected PasswordPrompterFactory passwordPrompterFactory;
	protected TitleBarView tbvTransferToHeader;
	protected TextInputLayout tilAmount;
	protected TextView tvAccountName;
	protected TextView tvAmountAvailable;
	protected TextView tvAmountRemaining;


/*
	static MvpPresenter access$000(CashOutActivity cashoutactivity)
	{
		return cashoutactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/
}
