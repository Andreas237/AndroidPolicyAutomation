// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount;

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
import com.ibotta.android.mvp.ui.misc.password.*;
import com.ibotta.android.views.base.title.TitleBarView;
import com.ibotta.android.views.base.title.TitleBarViewState;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount:
//			LinkCashAccountView, LinkCashAccountPresenter, DaggerLinkCashAccountComponent, LinkCashAccountModule, 
//			LinkCashAccountComponent

public class LinkCashAccountActivity extends LoadingMvpActivity
	implements LinkCashAccountView, PasswordListener
{

	public LinkCashAccountActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void LoadingMvpActivity()>
	//    2    4:return          
	}

	private void initInputFields()
	{
		if(type == CashOutType.PAYPAL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field CashOutType type>
	//*   2    4:getstatic       #67  <Field CashOutType CashOutType.PAYPAL>
	//*   3    7:if_acmpne       35
		{
			tilFirstName.setVisibility(0);
	//    4   10:aload_0         
	//    5   11:getfield        #69  <Field TextInputLayout tilFirstName>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #75  <Method void TextInputLayout.setVisibility(int)>
			tilLastName.setVisibility(0);
	//    8   18:aload_0         
	//    9   19:getfield        #77  <Field TextInputLayout tilLastName>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #75  <Method void TextInputLayout.setVisibility(int)>
			tilEmailName.setVisibility(0);
	//   12   26:aload_0         
	//   13   27:getfield        #79  <Field TextInputLayout tilEmailName>
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #75  <Method void TextInputLayout.setVisibility(int)>
			return;
	//   16   34:return          
		}
		if(type == CashOutType.VENMO)
	//*  17   35:aload_0         
	//*  18   36:getfield        #62  <Field CashOutType type>
	//*  19   39:getstatic       #82  <Field CashOutType CashOutType.VENMO>
	//*  20   42:if_acmpne       71
		{
			tilFirstName.setVisibility(8);
	//   21   45:aload_0         
	//   22   46:getfield        #69  <Field TextInputLayout tilFirstName>
	//   23   49:bipush          8
	//   24   51:invokevirtual   #75  <Method void TextInputLayout.setVisibility(int)>
			tilLastName.setVisibility(8);
	//   25   54:aload_0         
	//   26   55:getfield        #77  <Field TextInputLayout tilLastName>
	//   27   58:bipush          8
	//   28   60:invokevirtual   #75  <Method void TextInputLayout.setVisibility(int)>
			tilEmailName.setVisibility(0);
	//   29   63:aload_0         
	//   30   64:getfield        #79  <Field TextInputLayout tilEmailName>
	//   31   67:iconst_0        
	//   32   68:invokevirtual   #75  <Method void TextInputLayout.setVisibility(int)>
		}
	//   33   71:return          
	}

	private void initListeners()
	{
		etFirstName.addTextChangedListener(new TextWatcher() );
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field EditText etFirstName>
	//    2    4:new             #11  <Class LinkCashAccountActivity$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #88  <Method void LinkCashAccountActivity$1(LinkCashAccountActivity)>
	//    6   12:invokevirtual   #94  <Method void EditText.addTextChangedListener(TextWatcher)>
		etLastName.addTextChangedListener(new TextWatcher() );
	//    7   15:aload_0         
	//    8   16:getfield        #96  <Field EditText etLastName>
	//    9   19:new             #13  <Class LinkCashAccountActivity$2>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #97  <Method void LinkCashAccountActivity$2(LinkCashAccountActivity)>
	//   13   27:invokevirtual   #94  <Method void EditText.addTextChangedListener(TextWatcher)>
		etEmail.addTextChangedListener(new TextWatcher() );
	//   14   30:aload_0         
	//   15   31:getfield        #99  <Field EditText etEmail>
	//   16   34:new             #15  <Class LinkCashAccountActivity$3>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #100 <Method void LinkCashAccountActivity$3(LinkCashAccountActivity)>
	//   20   42:invokevirtual   #94  <Method void EditText.addTextChangedListener(TextWatcher)>
		Button button = bLinkAccount;
	//   21   45:aload_0         
	//   22   46:getfield        #102 <Field Button bLinkAccount>
	//   23   49:astore_1        
		_2D_..Lambda.LinkCashAccountActivity.sPz_2D_G4ZShX_udLuLAwOcWv7AjaI spz_2d_g4zshx_udlulawocwv7ajai = new sPz_2D_G4ZShX_udLuLAwOcWv7AjaI(this);
	//   24   50:new             #104 <Class _2D_$$Lambda$LinkCashAccountActivity$sPz_2D_G4ZShX_udLuLAwOcWv7AjaI>
	//   25   53:dup             
	//   26   54:aload_0         
	//   27   55:invokespecial   #105 <Method void _2D_$$Lambda$LinkCashAccountActivity$sPz_2D_G4ZShX_udLuLAwOcWv7AjaI(LinkCashAccountActivity)>
	//   28   58:astore_2        
		if(!(button instanceof View))
	//*  29   59:aload_1         
	//*  30   60:instanceof      #107 <Class View>
	//*  31   63:ifne            72
		{
			button.setOnClickListener(((android.view.View.OnClickListener) (spz_2d_g4zshx_udlulawocwv7ajai)));
	//   32   66:aload_1         
	//   33   67:aload_2         
	//   34   68:invokevirtual   #113 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   35   71:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)button, ((android.view.View.OnClickListener) (spz_2d_g4zshx_udlulawocwv7ajai)));
	//   36   72:aload_1         
	//   37   73:checkcast       #107 <Class View>
	//   38   76:aload_2         
	//   39   77:invokestatic    #118 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   40   80:return          
		}
	}

	private void initLogo()
	{
		ivLogo.setImageResource(type.getSvgDrawableResId());
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field ImageView ivLogo>
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field CashOutType type>
	//    4    8:invokevirtual   #125 <Method int CashOutType.getSvgDrawableResId()>
	//    5   11:invokevirtual   #130 <Method void ImageView.setImageResource(int)>
	//    6   14:return          
	}

	private void initTitle()
	{
		setTitle(((CharSequence) (type.getName())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #62  <Field CashOutType type>
	//    3    5:invokevirtual   #135 <Method String CashOutType.getName()>
	//    4    8:invokevirtual   #139 <Method void setTitle(CharSequence)>
	//    5   11:return          
	}

	public static void lambda$initListeners$0(LinkCashAccountActivity linkcashaccountactivity, View view)
	{
		((LinkCashAccountPresenter)linkcashaccountactivity.mvpPresenter).onLinkAccountClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #143 <Class LinkCashAccountPresenter>
	//    3    7:invokeinterface #146 <Method void LinkCashAccountPresenter.onLinkAccountClicked()>
	//    4   12:return          
	}

	private static Intent newIntent(Context context, CashOutType cashouttype)
	{
		context = ((Context) (new Intent(context, com/ibotta/android/mvp/ui/activity/account/withdraw/cashaccount/LinkCashAccountActivity)));
	//    0    0:new             #150 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class LinkCashAccountActivity>
	//    4    7:invokespecial   #153 <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).putExtra("account_type", ((java.io.Serializable) (cashouttype)));
	//    6   11:aload_0         
	//    7   12:ldc1            #155 <String "account_type">
	//    8   14:aload_1         
	//    9   15:invokevirtual   #159 <Method Intent Intent.putExtra(String, java.io.Serializable)>
	//   10   18:pop             
		return ((Intent) (context));
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public static void startForResult(Activity activity, CashOutType cashouttype)
	{
		if(activity == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			activity.startActivityForResult(newIntent(((Context) (activity)), cashouttype), 20);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokestatic    #163 <Method Intent newIntent(Context, CashOutType)>
	//    7   11:bipush          20
	//    8   13:invokevirtual   #169 <Method void Activity.startActivityForResult(Intent, int)>
			return;
	//    9   16:return          
		}
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #174 <Method LinkCashAccountComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected LinkCashAccountComponent createComponent(MainComponent maincomponent)
	{
		return DaggerLinkCashAccountComponent.builder().mainComponent(maincomponent).linkCashAccountModule(new LinkCashAccountModule(this)).build();
	//    0    0:invokestatic    #180 <Method DaggerLinkCashAccountComponent$Builder DaggerLinkCashAccountComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #186 <Method DaggerLinkCashAccountComponent$Builder DaggerLinkCashAccountComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #188 <Class LinkCashAccountModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #189 <Method void LinkCashAccountModule(LinkCashAccountActivity)>
	//    7   15:invokevirtual   #193 <Method DaggerLinkCashAccountComponent$Builder DaggerLinkCashAccountComponent$Builder.linkCashAccountModule(LinkCashAccountModule)>
	//    8   18:invokevirtual   #197 <Method LinkCashAccountComponent DaggerLinkCashAccountComponent$Builder.build()>
	//    9   21:areturn         
	}

	public void finish()
	{
		setResult(-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokevirtual   #201 <Method void setResult(int)>
		((LoadingMvpActivity)this).finish();
	//    3    5:aload_0         
	//    4    6:invokespecial   #203 <Method void LoadingMvpActivity.finish()>
	//    5    9:return          
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((LinkCashAccountComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #207 <Class LinkCashAccountComponent>
	//    3    5:invokevirtual   #210 <Method void inject(LinkCashAccountComponent)>
	//    4    8:return          
	}

	protected void inject(LinkCashAccountComponent linkcashaccountcomponent)
	{
		linkcashaccountcomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #212 <Method void LinkCashAccountComponent.inject(LinkCashAccountActivity)>
	//    3    7:return          
	}

	protected void onCreate(Bundle bundle)
	{
		((LoadingMvpActivity)this).onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #217 <Method void LoadingMvpActivity.onCreate(Bundle)>
		setContentView(0x7f0c0045);
	//    3    5:aload_0         
	//    4    6:ldc1            #218 <Int 0x7f0c0045>
	//    5    8:invokevirtual   #221 <Method void setContentView(int)>
		setUnbinder(ButterKnife.bind(((Activity) (this))));
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:invokestatic    #227 <Method butterknife.Unbinder ButterKnife.bind(Activity)>
	//    9   16:invokevirtual   #231 <Method void setUnbinder(butterknife.Unbinder)>
		if(getIntent() != null)
	//*  10   19:aload_0         
	//*  11   20:invokevirtual   #235 <Method Intent getIntent()>
	//*  12   23:ifnull          42
			type = (CashOutType)getIntent().getSerializableExtra("account_type");
	//   13   26:aload_0         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #235 <Method Intent getIntent()>
	//   16   31:ldc1            #155 <String "account_type">
	//   17   33:invokevirtual   #239 <Method java.io.Serializable Intent.getSerializableExtra(String)>
	//   18   36:checkcast       #64  <Class CashOutType>
	//   19   39:putfield        #62  <Field CashOutType type>
		((LinkCashAccountPresenter)mvpPresenter).setAccountType(type);
	//   20   42:aload_0         
	//   21   43:getfield        #57  <Field MvpPresenter mvpPresenter>
	//   22   46:checkcast       #143 <Class LinkCashAccountPresenter>
	//   23   49:aload_0         
	//   24   50:getfield        #62  <Field CashOutType type>
	//   25   53:invokeinterface #243 <Method void LinkCashAccountPresenter.setAccountType(CashOutType)>
		initTitle();
	//   26   58:aload_0         
	//   27   59:invokespecial   #245 <Method void initTitle()>
		initLogo();
	//   28   62:aload_0         
	//   29   63:invokespecial   #247 <Method void initLogo()>
		initInputFields();
	//   30   66:aload_0         
	//   31   67:invokespecial   #249 <Method void initInputFields()>
		initListeners();
	//   32   70:aload_0         
	//   33   71:invokespecial   #251 <Method void initListeners()>
	//   34   74:return          
	}

	public void onPasswordCaptured(String s, String s1)
	{
		((LinkCashAccountPresenter)mvpPresenter).onPasswordCaptured(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #143 <Class LinkCashAccountPresenter>
	//    3    7:aload_2         
	//    4    8:invokeinterface #257 <Method void LinkCashAccountPresenter.onPasswordCaptured(String)>
	//    5   13:return          
	}

	public void setLinkAccountEnabled(boolean flag)
	{
		bLinkAccount.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Button bLinkAccount>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #262 <Method void Button.setEnabled(boolean)>
	//    4    8:return          
	}

	public void setLinkAccountTitle(TitleBarViewState titlebarviewstate)
	{
		tbvLinkAccount.updateViewState(titlebarviewstate);
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field TitleBarView tbvLinkAccount>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #271 <Method void TitleBarView.updateViewState(TitleBarViewState)>
	//    4    8:return          
	}

	public void showCapturePassword(String s)
	{
		passwordPrompterFactory.create(((PasswordListener) (this)), s).capturePassword();
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field PasswordPrompterFactory passwordPrompterFactory>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #280 <Method PasswordPrompter PasswordPrompterFactory.create(PasswordListener, String)>
	//    5   11:invokeinterface #285 <Method void PasswordPrompter.capturePassword()>
	//    6   16:return          
	}

	public void showInvalidEmailAddress()
	{
		etEmail.setError(((CharSequence) (getString(0x7f11019b))));
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field EditText etEmail>
	//    2    4:aload_0         
	//    3    5:ldc2            #287 <Int 0x7f11019b>
	//    4    8:invokevirtual   #291 <Method String getString(int)>
	//    5   11:invokevirtual   #294 <Method void EditText.setError(CharSequence)>
	//    6   14:return          
	}

	protected Button bLinkAccount;
	protected EditText etEmail;
	protected EditText etFirstName;
	protected EditText etLastName;
	protected ImageView ivLogo;
	protected PasswordPrompterFactory passwordPrompterFactory;
	protected TitleBarView tbvLinkAccount;
	protected TextInputLayout tilEmailName;
	protected TextInputLayout tilFirstName;
	protected TextInputLayout tilLastName;
	private CashOutType type;


/*
	static MvpPresenter access$000(LinkCashAccountActivity linkcashaccountactivity)
	{
		return linkcashaccountactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/


/*
	static MvpPresenter access$100(LinkCashAccountActivity linkcashaccountactivity)
	{
		return linkcashaccountactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/


/*
	static MvpPresenter access$200(LinkCashAccountActivity linkcashaccountactivity)
	{
		return linkcashaccountactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/
}
