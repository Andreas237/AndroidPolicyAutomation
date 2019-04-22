// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.text.*;
import android.view.*;
import android.widget.*;
import butterknife.ButterKnife;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.images.ImageCache;
import com.ibotta.android.mvp.base.MvpComponent;
import com.ibotta.android.mvp.base.MvpPresenter;
import com.ibotta.android.mvp.base.loading.LoadingMvpActivity;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawalDetails;
import com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms.GiftCardTermsActivity;
import com.ibotta.android.mvp.ui.misc.password.*;
import com.ibotta.android.util.Formatting;
import com.ibotta.android.views.images.Sizes;
import com.ibotta.api.model.card.GiftCard;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
import org.parceler.Parcels;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard:
//			GiftCardView, GiftCardPresenter, DaggerGiftCardComponent, GiftCardModule, 
//			GiftCardComponent

public class GiftCardActivity extends LoadingMvpActivity
	implements GiftCardView, PasswordListener
{

	public GiftCardActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void LoadingMvpActivity()>
		giftCardName = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #59  <String "">
	//    4    7:putfield        #61  <Field String giftCardName>
		balance = 0.0F;
	//    5   10:aload_0         
	//    6   11:fconst_0        
	//    7   12:putfield        #63  <Field float balance>
		denominationsCount = 0;
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:putfield        #65  <Field int denominationsCount>
	//   11   20:return          
	}

	private LinearLayout generateRowLayout()
	{
		LinearLayout linearlayout = new LinearLayout(((Context) (this)));
	//    0    0:new             #76  <Class LinearLayout>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #79  <Method void LinearLayout(Context)>
	//    4    8:astore_1        
		android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
	//    5    9:new             #81  <Class android.widget.LinearLayout$LayoutParams>
	//    6   12:dup             
	//    7   13:iconst_m1       
	//    8   14:bipush          -2
	//    9   16:invokespecial   #84  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   10   19:astore_2        
		layoutparams.bottomMargin = getResources().getDimensionPixelSize(0x7f070165);
	//   11   20:aload_2         
	//   12   21:aload_0         
	//   13   22:invokevirtual   #88  <Method Resources getResources()>
	//   14   25:ldc1            #89  <Int 0x7f070165>
	//   15   27:invokevirtual   #95  <Method int Resources.getDimensionPixelSize(int)>
	//   16   30:putfield        #98  <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
		linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #102 <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		linearlayout.setOrientation(0);
	//   20   38:aload_1         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #106 <Method void LinearLayout.setOrientation(int)>
		linearlayout.setWeightSum(100F);
	//   23   43:aload_1         
	//   24   44:ldc1            #107 <Float 100F>
	//   25   46:invokevirtual   #111 <Method void LinearLayout.setWeightSum(float)>
		return linearlayout;
	//   26   49:aload_1         
	//   27   50:areturn         
	}

	private int getNumRows(int i)
	{
		denominationsCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #65  <Field int denominationsCount>
		int k = denominationsCount;
	//    3    5:aload_0         
	//    4    6:getfield        #65  <Field int denominationsCount>
	//    5    9:istore_3        
		int j = k / 3;
	//    6   10:iload_3         
	//    7   11:iconst_3        
	//    8   12:idiv            
	//    9   13:istore_2        
		i = j;
	//   10   14:iload_2         
	//   11   15:istore_1        
		if(k % 3 > 0)
	//*  12   16:iload_3         
	//*  13   17:iconst_3        
	//*  14   18:irem            
	//*  15   19:ifle            26
			i = j + 1;
	//   16   22:iload_2         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:istore_1        
		return i;
	//   20   26:iload_1         
	//   21   27:ireturn         
	}

	private void initBalanceAvailable()
	{
		tvBalanceAvailable.setText(((CharSequence) (getString(0x7f1100f1, new Object[] {
			formatting.currencyPositiveOrZeroNoLeadingZero(balance)
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field TextView tvBalanceAvailable>
	//    2    4:aload_0         
	//    3    5:ldc1            #116 <Int 0x7f1100f1>
	//    4    7:iconst_1        
	//    5    8:anewarray       Object[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:getfield        #120 <Field Formatting formatting>
	//   10   17:aload_0         
	//   11   18:getfield        #63  <Field float balance>
	//   12   21:f2d             
	//   13   22:invokeinterface #126 <Method String Formatting.currencyPositiveOrZeroNoLeadingZero(double)>
	//   14   27:aastore         
	//   15   28:invokevirtual   #130 <Method String getString(int, Object[])>
	//   16   31:invokevirtual   #136 <Method void TextView.setText(CharSequence)>
	//   17   34:return          
	}

	private void initBalanceRemaining(float f)
	{
		tvBalanceRemaining.setText(((CharSequence) (getString(0x7f1100f5, new Object[] {
			formatting.currencyPositiveOrZeroNoLeadingZero(balance - f)
		}))));
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field TextView tvBalanceRemaining>
	//    2    4:aload_0         
	//    3    5:ldc1            #140 <Int 0x7f1100f5>
	//    4    7:iconst_1        
	//    5    8:anewarray       Object[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:getfield        #120 <Field Formatting formatting>
	//   10   17:aload_0         
	//   11   18:getfield        #63  <Field float balance>
	//   12   21:fload_1         
	//   13   22:fsub            
	//   14   23:f2d             
	//   15   24:invokeinterface #126 <Method String Formatting.currencyPositiveOrZeroNoLeadingZero(double)>
	//   16   29:aastore         
	//   17   30:invokevirtual   #130 <Method String getString(int, Object[])>
	//   18   33:invokevirtual   #136 <Method void TextView.setText(CharSequence)>
	//   19   36:return          
	}

	private void initGiftCardImage(com.ibotta.api.model.card.GiftCard.Template template)
	{
		if(template != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
			imageCache.load(((Context) (this)), template.getThumbnailUrl(), ivGiftCard, ((com.ibotta.android.images.ImageCache.Size) (Sizes.CARD_SMALL)));
	//    2    4:aload_0         
	//    3    5:getfield        #144 <Field ImageCache imageCache>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #150 <Method String com.ibotta.api.model.card.GiftCard$Template.getThumbnailUrl()>
	//    7   13:aload_0         
	//    8   14:getfield        #152 <Field ImageView ivGiftCard>
	//    9   17:getstatic       #158 <Field Sizes Sizes.CARD_SMALL>
	//   10   20:invokeinterface #164 <Method com.ibotta.android.images.ImageLoadJob ImageCache.load(Context, String, ImageView, com.ibotta.android.images.ImageCache$Size)>
	//   11   25:pop             
	//   12   26:return          
	}

	private void initLegalText(String s)
	{
		tvLegalText.setText(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field TextView tvLegalText>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #136 <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	private void initListeners()
	{
		etAmount.addTextChangedListener(new TextWatcher() );
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field EditText etAmount>
	//    2    4:new             #11  <Class GiftCardActivity$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #174 <Method void GiftCardActivity$1(GiftCardActivity)>
	//    6   12:invokevirtual   #180 <Method void EditText.addTextChangedListener(TextWatcher)>
		Button button = bPurchase;
	//    7   15:aload_0         
	//    8   16:getfield        #182 <Field Button bPurchase>
	//    9   19:astore_1        
		_2D_..Lambda.GiftCardActivity.uS7p3LQMCr5ZwehQSiyM0em1X5w us7p3lqmcr5zwehqsiym0em1x5w = new uS7p3LQMCr5ZwehQSiyM0em1X5w(this);
	//   10   20:new             #184 <Class _2D_$$Lambda$GiftCardActivity$uS7p3LQMCr5ZwehQSiyM0em1X5w>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #185 <Method void _2D_$$Lambda$GiftCardActivity$uS7p3LQMCr5ZwehQSiyM0em1X5w(GiftCardActivity)>
	//   14   28:astore_2        
		if(!(button instanceof View))
	//*  15   29:aload_1         
	//*  16   30:instanceof      #187 <Class View>
	//*  17   33:ifne            42
		{
			button.setOnClickListener(((android.view.View.OnClickListener) (us7p3lqmcr5zwehqsiym0em1x5w)));
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #193 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   21   41:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)button, ((android.view.View.OnClickListener) (us7p3lqmcr5zwehqsiym0em1x5w)));
	//   22   42:aload_1         
	//   23   43:checkcast       #187 <Class View>
	//   24   46:aload_2         
	//   25   47:invokestatic    #198 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   26   50:return          
		}
	}

	private void initPurchaseGiftCard(float f)
	{
		if(f == 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifne            31
		{
			bPurchase.setText(((CharSequence) (getString(0x7f1100ed, new Object[] {
				giftCardName
			}))));
	//    4    6:aload_0         
	//    5    7:getfield        #182 <Field Button bPurchase>
	//    6   10:aload_0         
	//    7   11:ldc1            #200 <Int 0x7f1100ed>
	//    8   13:iconst_1        
	//    9   14:anewarray       Object[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:aload_0         
	//   13   20:getfield        #61  <Field String giftCardName>
	//   14   23:aastore         
	//   15   24:invokevirtual   #130 <Method String getString(int, Object[])>
	//   16   27:invokevirtual   #201 <Method void Button.setText(CharSequence)>
			return;
	//   17   30:return          
		} else
		{
			bPurchase.setText(((CharSequence) (getString(0x7f1100ee, new Object[] {
				formatting.currencyNoDecimal(f), giftCardName
			}))));
	//   18   31:aload_0         
	//   19   32:getfield        #182 <Field Button bPurchase>
	//   20   35:aload_0         
	//   21   36:ldc1            #202 <Int 0x7f1100ee>
	//   22   38:iconst_2        
	//   23   39:anewarray       Object[]
	//   24   42:dup             
	//   25   43:iconst_0        
	//   26   44:aload_0         
	//   27   45:getfield        #120 <Field Formatting formatting>
	//   28   48:fload_1         
	//   29   49:f2d             
	//   30   50:invokeinterface #205 <Method String Formatting.currencyNoDecimal(double)>
	//   31   55:aastore         
	//   32   56:dup             
	//   33   57:iconst_1        
	//   34   58:aload_0         
	//   35   59:getfield        #61  <Field String giftCardName>
	//   36   62:aastore         
	//   37   63:invokevirtual   #130 <Method String getString(int, Object[])>
	//   38   66:invokevirtual   #201 <Method void Button.setText(CharSequence)>
			return;
	//   39   69:return          
		}
	}

	private void initTitle()
	{
		setTitle(((CharSequence) (getString(0x7f1100f2, new Object[] {
			giftCardName
		}))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:ldc1            #207 <Int 0x7f1100f2>
	//    3    4:iconst_1        
	//    4    5:anewarray       Object[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:aload_0         
	//    8   11:getfield        #61  <Field String giftCardName>
	//    9   14:aastore         
	//   10   15:invokevirtual   #130 <Method String getString(int, Object[])>
	//   11   18:invokevirtual   #210 <Method void setTitle(CharSequence)>
	//   12   21:return          
	}

	public static void lambda$initListeners$0(GiftCardActivity giftcardactivity, View view)
	{
		((GiftCardPresenter)giftcardactivity.mvpPresenter).onPurchaseClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #214 <Class GiftCardPresenter>
	//    3    7:invokeinterface #217 <Method void GiftCardPresenter.onPurchaseClicked()>
	//    4   12:return          
	}

	public static void lambda$showFixedAmounts$1(GiftCardActivity giftcardactivity, View view)
	{
		giftcardactivity.onAmountClicked(view, ((Float)view.getTag()).floatValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #222 <Method Object View.getTag()>
	//    4    6:checkcast       #224 <Class Float>
	//    5    9:invokevirtual   #228 <Method float Float.floatValue()>
	//    6   12:invokespecial   #232 <Method void onAmountClicked(View, float)>
	//    7   15:return          
	}

	private static Intent newIntent(Context context, int i)
	{
		context = ((Context) (new Intent(context, com/ibotta/android/mvp/ui/activity/account/withdraw/giftcard/GiftCardActivity)));
	//    0    0:new             #236 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class GiftCardActivity>
	//    4    7:invokespecial   #239 <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).putExtra("gift_card_id", i);
	//    6   11:aload_0         
	//    7   12:ldc1            #241 <String "gift_card_id">
	//    8   14:iload_1         
	//    9   15:invokevirtual   #245 <Method Intent Intent.putExtra(String, int)>
	//   10   18:pop             
		return ((Intent) (context));
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	private void onAmountClicked(View view, float f)
	{
		view = ((View) ((Button)view));
	//    0    0:aload_1         
	//    1    1:checkcast       #189 <Class Button>
	//    2    4:astore_1        
		((Button) (view)).setSelected(((Button) (view)).isSelected() ^ true);
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #249 <Method boolean Button.isSelected()>
	//    6   10:iconst_1        
	//    7   11:ixor            
	//    8   12:invokevirtual   #253 <Method void Button.setSelected(boolean)>
		int j = denominationsCount;
	//    9   15:aload_0         
	//   10   16:getfield        #65  <Field int denominationsCount>
	//   11   19:istore          4
		for(int i = 0; i < llFixedAmounts.getChildCount(); i++)
	//*  12   21:iconst_0        
	//*  13   22:istore_3        
	//*  14   23:iload_3         
	//*  15   24:aload_0         
	//*  16   25:getfield        #255 <Field LinearLayout llFixedAmounts>
	//*  17   28:invokevirtual   #259 <Method int LinearLayout.getChildCount()>
	//*  18   31:icmpge          117
		{
			int i1 = Math.min(3, j);
	//   19   34:iconst_3        
	//   20   35:iload           4
	//   21   37:invokestatic    #265 <Method int Math.min(int, int)>
	//   22   40:istore          7
			int k = 0;
	//   23   42:iconst_0        
	//   24   43:istore          5
			int l = 0;
	//   25   45:iconst_0        
	//   26   46:istore          6
			for(; k < i1; k++)
	//*  27   48:iload           5
	//*  28   50:iload           7
	//*  29   52:icmpge          103
			{
				Button button = (Button)((LinearLayout)llFixedAmounts.getChildAt(i)).getChildAt(k);
	//   30   55:aload_0         
	//   31   56:getfield        #255 <Field LinearLayout llFixedAmounts>
	//   32   59:iload_3         
	//   33   60:invokevirtual   #269 <Method View LinearLayout.getChildAt(int)>
	//   34   63:checkcast       #76  <Class LinearLayout>
	//   35   66:iload           5
	//   36   68:invokevirtual   #269 <Method View LinearLayout.getChildAt(int)>
	//   37   71:checkcast       #189 <Class Button>
	//   38   74:astore          8
				if(button != view)
	//*  39   76:aload           8
	//*  40   78:aload_1         
	//*  41   79:if_acmpeq       88
					button.setSelected(false);
	//   42   82:aload           8
	//   43   84:iconst_0        
	//   44   85:invokevirtual   #253 <Method void Button.setSelected(boolean)>
				l++;
	//   45   88:iload           6
	//   46   90:iconst_1        
	//   47   91:iadd            
	//   48   92:istore          6
			}

	//   49   94:iload           5
	//   50   96:iconst_1        
	//   51   97:iadd            
	//   52   98:istore          5
	//*  53  100:goto            48
			j -= l;
	//   54  103:iload           4
	//   55  105:iload           6
	//   56  107:isub            
	//   57  108:istore          4
		}

	//   58  110:iload_3         
	//   59  111:iconst_1        
	//   60  112:iadd            
	//   61  113:istore_3        
	//*  62  114:goto            23
		if(((Button) (view)).isSelected())
	//*  63  117:aload_1         
	//*  64  118:invokevirtual   #249 <Method boolean Button.isSelected()>
	//*  65  121:ifeq            138
		{
			((GiftCardPresenter)mvpPresenter).onAmountSelected(f);
	//   66  124:aload_0         
	//   67  125:getfield        #72  <Field MvpPresenter mvpPresenter>
	//   68  128:checkcast       #214 <Class GiftCardPresenter>
	//   69  131:fload_2         
	//   70  132:invokeinterface #272 <Method void GiftCardPresenter.onAmountSelected(float)>
			return;
	//   71  137:return          
		} else
		{
			((GiftCardPresenter)mvpPresenter).onAmountSelected(0.0F);
	//   72  138:aload_0         
	//   73  139:getfield        #72  <Field MvpPresenter mvpPresenter>
	//   74  142:checkcast       #214 <Class GiftCardPresenter>
	//   75  145:fconst_0        
	//   76  146:invokeinterface #272 <Method void GiftCardPresenter.onAmountSelected(float)>
			return;
	//   77  151:return          
		}
	}

	public static void startForResult(Activity activity, int i)
	{
		if(activity == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			activity.startActivityForResult(newIntent(((Context) (activity)), i), 23);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokestatic    #276 <Method Intent newIntent(Context, int)>
	//    7   11:bipush          23
	//    8   13:invokevirtual   #282 <Method void Activity.startActivityForResult(Intent, int)>
			return;
	//    9   16:return          
		}
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #287 <Method GiftCardComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected GiftCardComponent createComponent(MainComponent maincomponent)
	{
		return DaggerGiftCardComponent.builder().mainComponent(maincomponent).giftCardModule(new GiftCardModule(this)).build();
	//    0    0:invokestatic    #293 <Method DaggerGiftCardComponent$Builder DaggerGiftCardComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #299 <Method DaggerGiftCardComponent$Builder DaggerGiftCardComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #301 <Class GiftCardModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #302 <Method void GiftCardModule(GiftCardActivity)>
	//    7   15:invokevirtual   #306 <Method DaggerGiftCardComponent$Builder DaggerGiftCardComponent$Builder.giftCardModule(GiftCardModule)>
	//    8   18:invokevirtual   #310 <Method GiftCardComponent DaggerGiftCardComponent$Builder.build()>
	//    9   21:areturn         
	}

	public void finishSuccessfully(WithdrawalDetails withdrawaldetails)
	{
		Intent intent = new Intent();
	//    0    0:new             #236 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #313 <Method void Intent()>
	//    3    7:astore_2        
		intent.putExtra("gift_card_withdrawal_details", Parcels.wrap(((Object) (withdrawaldetails))));
	//    4    8:aload_2         
	//    5    9:ldc2            #315 <String "gift_card_withdrawal_details">
	//    6   12:aload_1         
	//    7   13:invokestatic    #321 <Method android.os.Parcelable Parcels.wrap(Object)>
	//    8   16:invokevirtual   #324 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//    9   19:pop             
		setResult(-1, intent);
	//   10   20:aload_0         
	//   11   21:iconst_m1       
	//   12   22:aload_2         
	//   13   23:invokevirtual   #328 <Method void setResult(int, Intent)>
		finish();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #331 <Method void finish()>
	//   16   30:return          
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((GiftCardComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #335 <Class GiftCardComponent>
	//    3    5:invokevirtual   #338 <Method void inject(GiftCardComponent)>
	//    4    8:return          
	}

	protected void inject(GiftCardComponent giftcardcomponent)
	{
		giftcardcomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #340 <Method void GiftCardComponent.inject(GiftCardActivity)>
	//    3    7:return          
	}

	protected void onCreate(Bundle bundle)
	{
		((LoadingMvpActivity)this).onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #345 <Method void LoadingMvpActivity.onCreate(Bundle)>
		setContentView(0x7f0c003b);
	//    3    5:aload_0         
	//    4    6:ldc2            #346 <Int 0x7f0c003b>
	//    5    9:invokevirtual   #349 <Method void setContentView(int)>
		setUnbinder(ButterKnife.bind(((Activity) (this))));
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokestatic    #355 <Method butterknife.Unbinder ButterKnife.bind(Activity)>
	//    9   17:invokevirtual   #359 <Method void setUnbinder(butterknife.Unbinder)>
		setTitle(((CharSequence) (null)));
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #210 <Method void setTitle(CharSequence)>
		bundle = ((Bundle) (getIntent()));
	//   13   25:aload_0         
	//   14   26:invokevirtual   #363 <Method Intent getIntent()>
	//   15   29:astore_1        
		int i = -1;
	//   16   30:iconst_m1       
	//   17   31:istore_2        
		if(bundle != null)
	//*  18   32:aload_1         
	//*  19   33:ifnull          47
			i = getIntent().getIntExtra("gift_card_id", -1);
	//   20   36:aload_0         
	//   21   37:invokevirtual   #363 <Method Intent getIntent()>
	//   22   40:ldc1            #241 <String "gift_card_id">
	//   23   42:iconst_m1       
	//   24   43:invokevirtual   #367 <Method int Intent.getIntExtra(String, int)>
	//   25   46:istore_2        
		((GiftCardPresenter)mvpPresenter).setGiftCardId(i);
	//   26   47:aload_0         
	//   27   48:getfield        #72  <Field MvpPresenter mvpPresenter>
	//   28   51:checkcast       #214 <Class GiftCardPresenter>
	//   29   54:iload_2         
	//   30   55:invokeinterface #370 <Method void GiftCardPresenter.setGiftCardId(int)>
		initListeners();
	//   31   60:aload_0         
	//   32   61:invokespecial   #372 <Method void initListeners()>
	//   33   64:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(0x7f0d000a, menu);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #379 <Method MenuInflater getMenuInflater()>
	//    2    4:ldc2            #380 <Int 0x7f0d000a>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #386 <Method void MenuInflater.inflate(int, Menu)>
		return ((LoadingMvpActivity)this).onCreateOptionsMenu(menu);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #388 <Method boolean LoadingMvpActivity.onCreateOptionsMenu(Menu)>
	//    8   16:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() != 0x7f090027)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #395 <Method int MenuItem.getItemId()>
	//*   2    6:ldc2            #396 <Int 0x7f090027>
	//*   3    9:icmpeq          14
		{
			return false;
	//    4   12:iconst_0        
	//    5   13:ireturn         
		} else
		{
			((GiftCardPresenter)mvpPresenter).onTermsClicked();
	//    6   14:aload_0         
	//    7   15:getfield        #72  <Field MvpPresenter mvpPresenter>
	//    8   18:checkcast       #214 <Class GiftCardPresenter>
	//    9   21:invokeinterface #399 <Method void GiftCardPresenter.onTermsClicked()>
			return true;
	//   10   26:iconst_1        
	//   11   27:ireturn         
		}
	}

	public void onPasswordCaptured(String s, String s1)
	{
		((GiftCardPresenter)mvpPresenter).onPasswordCaptured(s1);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #214 <Class GiftCardPresenter>
	//    3    7:aload_2         
	//    4    8:invokeinterface #403 <Method void GiftCardPresenter.onPasswordCaptured(String)>
	//    5   13:return          
	}

	public void setBalance(float f)
	{
		balance = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #63  <Field float balance>
		initBalanceAvailable();
	//    3    5:aload_0         
	//    4    6:invokespecial   #406 <Method void initBalanceAvailable()>
		initBalanceRemaining(0.0F);
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:invokespecial   #408 <Method void initBalanceRemaining(float)>
	//    8   14:return          
	}

	public void setBalanceRemainingText(float f)
	{
		initBalanceRemaining(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #408 <Method void initBalanceRemaining(float)>
	//    3    5:return          
	}

	public void setGiftCard(GiftCard giftcard)
	{
		giftCardName = giftcard.getName();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #416 <Method String GiftCard.getName()>
	//    3    5:putfield        #61  <Field String giftCardName>
		initTitle();
	//    4    8:aload_0         
	//    5    9:invokespecial   #418 <Method void initTitle()>
		initGiftCardImage(giftcard.getFirstTemplate());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #422 <Method com.ibotta.api.model.card.GiftCard$Template GiftCard.getFirstTemplate()>
	//    9   17:invokespecial   #424 <Method void initGiftCardImage(com.ibotta.api.model.card.GiftCard$Template)>
		initPurchaseGiftCard(0.0F);
	//   10   20:aload_0         
	//   11   21:fconst_0        
	//   12   22:invokespecial   #426 <Method void initPurchaseGiftCard(float)>
		initLegalText(giftcard.getLegalText());
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #429 <Method String GiftCard.getLegalText()>
	//   16   30:invokespecial   #431 <Method void initLegalText(String)>
	//   17   33:return          
	}

	public void setPurchaseGiftCardEnabled(boolean flag)
	{
		bPurchase.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field Button bPurchase>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #435 <Method void Button.setEnabled(boolean)>
	//    4    8:return          
	}

	public void setPurchaseGiftCardText(float f)
	{
		initPurchaseGiftCard(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokespecial   #426 <Method void initPurchaseGiftCard(float)>
	//    3    5:return          
	}

	public void setTitleForLoadFailure()
	{
		setTitle(0x7f110170);
	//    0    0:aload_0         
	//    1    1:ldc2            #438 <Int 0x7f110170>
	//    2    4:invokevirtual   #440 <Method void setTitle(int)>
	//    3    7:return          
	}

	public void showCapturePassword(String s)
	{
		passwordPrompterFactory.create(((PasswordListener) (this)), s).capturePassword();
	//    0    0:aload_0         
	//    1    1:getfield        #443 <Field PasswordPrompterFactory passwordPrompterFactory>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #449 <Method PasswordPrompter PasswordPrompterFactory.create(PasswordListener, String)>
	//    5   11:invokeinterface #454 <Method void PasswordPrompter.capturePassword()>
	//    6   16:return          
	}

	public void showFixedAmounts(float af[], float f)
	{
		llFixedAmounts.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field LinearLayout llFixedAmounts>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #459 <Method void LinearLayout.setVisibility(int)>
		tilRange.setVisibility(8);
	//    4    8:aload_0         
	//    5    9:getfield        #461 <Field TextInputLayout tilRange>
	//    6   12:bipush          8
	//    7   14:invokevirtual   #464 <Method void TextInputLayout.setVisibility(int)>
		llFixedAmounts.removeAllViews();
	//    8   17:aload_0         
	//    9   18:getfield        #255 <Field LinearLayout llFixedAmounts>
	//   10   21:invokevirtual   #467 <Method void LinearLayout.removeAllViews()>
		int i1 = getNumRows(af.length);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:arraylength     
	//   14   27:invokespecial   #469 <Method int getNumRows(int)>
	//   15   30:istore          9
		int j = af.length;
	//   16   32:aload_1         
	//   17   33:arraylength     
	//   18   34:istore          6
		float f1 = llFixedAmounts.getWeightSum() / 3F;
	//   19   36:aload_0         
	//   20   37:getfield        #255 <Field LinearLayout llFixedAmounts>
	//   21   40:invokevirtual   #472 <Method float LinearLayout.getWeightSum()>
	//   22   43:ldc2            #473 <Float 3F>
	//   23   46:fdiv            
	//   24   47:fstore_3        
		LayoutInflater layoutinflater = getActivity().getLayoutInflater();
	//   25   48:aload_0         
	//   26   49:invokevirtual   #477 <Method Activity getActivity()>
	//   27   52:invokevirtual   #481 <Method LayoutInflater Activity.getLayoutInflater()>
	//   28   55:astore          12
		for(int i = 0; i < i1; i++)
	//*  29   57:iconst_0        
	//*  30   58:istore          5
	//*  31   60:iload           5
	//*  32   62:iload           9
	//*  33   64:icmpge          314
		{
			LinearLayout linearlayout = generateRowLayout();
	//   34   67:aload_0         
	//   35   68:invokespecial   #483 <Method LinearLayout generateRowLayout()>
	//   36   71:astore          13
			int j1 = Math.min(3, j);
	//   37   73:iconst_3        
	//   38   74:iload           6
	//   39   76:invokestatic    #265 <Method int Math.min(int, int)>
	//   40   79:istore          10
			int k = 0;
	//   41   81:iconst_0        
	//   42   82:istore          7
			int l = 0;
	//   43   84:iconst_0        
	//   44   85:istore          8
			for(; k < j1; k++)
	//*  45   87:iload           7
	//*  46   89:iload           10
	//*  47   91:icmpge          289
			{
				float f2 = af[i * 3 + k];
	//   48   94:aload_1         
	//   49   95:iload           5
	//   50   97:iconst_3        
	//   51   98:imul            
	//   52   99:iload           7
	//   53  101:iadd            
	//   54  102:faload          
	//   55  103:fstore          4
				Button button = (Button)layoutinflater.inflate(0x7f0c0160, ((android.view.ViewGroup) (null)), false);
	//   56  105:aload           12
	//   57  107:ldc2            #484 <Int 0x7f0c0160>
	//   58  110:aconst_null     
	//   59  111:iconst_0        
	//   60  112:invokevirtual   #489 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   61  115:checkcast       #189 <Class Button>
	//   62  118:astore          14
				Object obj = ((Object) (new LayoutParams(0, -2)));
	//   63  120:new             #81  <Class android.widget.LinearLayout$LayoutParams>
	//   64  123:dup             
	//   65  124:iconst_0        
	//   66  125:bipush          -2
	//   67  127:invokespecial   #84  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   68  130:astore          15
				obj.weight = f1;
	//   69  132:aload           15
	//   70  134:fload_3         
	//   71  135:putfield        #492 <Field float android.widget.LinearLayout$LayoutParams.weight>
				if(k < 2)
	//*  72  138:iload           7
	//*  73  140:iconst_2        
	//*  74  141:icmpge          159
					obj.rightMargin = getResources().getDimensionPixelSize(0x7f07016d);
	//   75  144:aload           15
	//   76  146:aload_0         
	//   77  147:invokevirtual   #88  <Method Resources getResources()>
	//   78  150:ldc2            #493 <Int 0x7f07016d>
	//   79  153:invokevirtual   #95  <Method int Resources.getDimensionPixelSize(int)>
	//   80  156:putfield        #496 <Field int android.widget.LinearLayout$LayoutParams.rightMargin>
				if(j == 1)
	//*  81  159:iload           6
	//*  82  161:iconst_1        
	//*  83  162:icmpne          177
					obj.rightMargin = ((android.widget.LinearLayout.LayoutParams) (obj)).rightMargin * 2;
	//   84  165:aload           15
	//   85  167:aload           15
	//   86  169:getfield        #496 <Field int android.widget.LinearLayout$LayoutParams.rightMargin>
	//   87  172:iconst_2        
	//   88  173:imul            
	//   89  174:putfield        #496 <Field int android.widget.LinearLayout$LayoutParams.rightMargin>
				linearlayout.addView(((View) (button)), ((android.view.ViewGroup.LayoutParams) (obj)));
	//   90  177:aload           13
	//   91  179:aload           14
	//   92  181:aload           15
	//   93  183:invokevirtual   #500 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
				button.setText(((CharSequence) (formatting.currencyNoDecimal(f2))));
	//   94  186:aload           14
	//   95  188:aload_0         
	//   96  189:getfield        #120 <Field Formatting formatting>
	//   97  192:fload           4
	//   98  194:f2d             
	//   99  195:invokeinterface #205 <Method String Formatting.currencyNoDecimal(double)>
	//  100  200:invokevirtual   #201 <Method void Button.setText(CharSequence)>
				button.setTag(((Object) (Float.valueOf(f2))));
	//  101  203:aload           14
	//  102  205:fload           4
	//  103  207:invokestatic    #504 <Method Float Float.valueOf(float)>
	//  104  210:invokevirtual   #508 <Method void Button.setTag(Object)>
				boolean flag;
				if(f >= f2)
	//* 105  213:fload_2         
	//* 106  214:fload           4
	//* 107  216:fcmpl           
	//* 108  217:iflt            226
					flag = true;
	//  109  220:iconst_1        
	//  110  221:istore          11
				else
	//* 111  223:goto            229
					flag = false;
	//  112  226:iconst_0        
	//  113  227:istore          11
				button.setEnabled(flag);
	//  114  229:aload           14
	//  115  231:iload           11
	//  116  233:invokevirtual   #435 <Method void Button.setEnabled(boolean)>
				obj = ((Object) (new _cls4fPKaCPTQGK1X_2D_BHdOkpkzaIrDI(this)));
	//  117  236:new             #510 <Class _2D_$$Lambda$GiftCardActivity$4fPKaCPTQGK1X_2D_BHdOkpkzaIrDI>
	//  118  239:dup             
	//  119  240:aload_0         
	//  120  241:invokespecial   #511 <Method void _2D_$$Lambda$GiftCardActivity$4fPKaCPTQGK1X_2D_BHdOkpkzaIrDI(GiftCardActivity)>
	//  121  244:astore          15
				if(!(button instanceof View))
	//* 122  246:aload           14
	//* 123  248:instanceof      #187 <Class View>
	//* 124  251:ifne            264
					button.setOnClickListener(((android.view.View.OnClickListener) (obj)));
	//  125  254:aload           14
	//  126  256:aload           15
	//  127  258:invokevirtual   #193 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
				else
	//* 128  261:goto            274
					ViewInstrumentation.setOnClickListener((View)button, ((android.view.View.OnClickListener) (obj)));
	//  129  264:aload           14
	//  130  266:checkcast       #187 <Class View>
	//  131  269:aload           15
	//  132  271:invokestatic    #198 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
				l++;
	//  133  274:iload           8
	//  134  276:iconst_1        
	//  135  277:iadd            
	//  136  278:istore          8
			}

	//  137  280:iload           7
	//  138  282:iconst_1        
	//  139  283:iadd            
	//  140  284:istore          7
	//* 141  286:goto            87
			j -= l;
	//  142  289:iload           6
	//  143  291:iload           8
	//  144  293:isub            
	//  145  294:istore          6
			llFixedAmounts.addView(((View) (linearlayout)));
	//  146  296:aload_0         
	//  147  297:getfield        #255 <Field LinearLayout llFixedAmounts>
	//  148  300:aload           13
	//  149  302:invokevirtual   #514 <Method void LinearLayout.addView(View)>
		}

	//  150  305:iload           5
	//  151  307:iconst_1        
	//  152  308:iadd            
	//  153  309:istore          5
	//* 154  311:goto            60
	//  155  314:return          
	}

	public void showRangeAmounts(float f, float f1)
	{
		llFixedAmounts.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field LinearLayout llFixedAmounts>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #459 <Method void LinearLayout.setVisibility(int)>
		tilRange.setVisibility(0);
	//    4    9:aload_0         
	//    5   10:getfield        #461 <Field TextInputLayout tilRange>
	//    6   13:iconst_0        
	//    7   14:invokevirtual   #464 <Method void TextInputLayout.setVisibility(int)>
		String s = formatting.currency(f);
	//    8   17:aload_0         
	//    9   18:getfield        #120 <Field Formatting formatting>
	//   10   21:fload_1         
	//   11   22:f2d             
	//   12   23:invokeinterface #519 <Method String Formatting.currency(double)>
	//   13   28:astore_3        
		String s1 = formatting.currencyPositiveOrZeroNoLeadingZero(f1);
	//   14   29:aload_0         
	//   15   30:getfield        #120 <Field Formatting formatting>
	//   16   33:fload_2         
	//   17   34:f2d             
	//   18   35:invokeinterface #126 <Method String Formatting.currencyPositiveOrZeroNoLeadingZero(double)>
	//   19   40:astore          4
		tvRange.setText(((CharSequence) (getString(0x7f1100e5, new Object[] {
			s, s1
		}))));
	//   20   42:aload_0         
	//   21   43:getfield        #521 <Field TextView tvRange>
	//   22   46:aload_0         
	//   23   47:ldc2            #522 <Int 0x7f1100e5>
	//   24   50:iconst_2        
	//   25   51:anewarray       Object[]
	//   26   54:dup             
	//   27   55:iconst_0        
	//   28   56:aload_3         
	//   29   57:aastore         
	//   30   58:dup             
	//   31   59:iconst_1        
	//   32   60:aload           4
	//   33   62:aastore         
	//   34   63:invokevirtual   #130 <Method String getString(int, Object[])>
	//   35   66:invokevirtual   #136 <Method void TextView.setText(CharSequence)>
	//   36   69:return          
	}

	public void showTerms(int i)
	{
		GiftCardTermsActivity.start(((Context) (this)), i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #529 <Method void GiftCardTermsActivity.start(Context, int)>
	//    3    5:return          
	}

	private static final int DENOMINATIONS_PER_ROW = 3;
	protected Button bPurchase;
	private float balance;
	private int denominationsCount;
	protected EditText etAmount;
	Formatting formatting;
	private String giftCardName;
	ImageCache imageCache;
	protected ImageView ivGiftCard;
	protected LinearLayout llFixedAmounts;
	protected PasswordPrompterFactory passwordPrompterFactory;
	protected TextInputLayout tilRange;
	protected TextView tvBalanceAvailable;
	protected TextView tvBalanceRemaining;
	protected TextView tvLegalText;
	protected TextView tvRange;


/*
	static MvpPresenter access$000(GiftCardActivity giftcardactivity)
	{
		return giftcardactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/
}
