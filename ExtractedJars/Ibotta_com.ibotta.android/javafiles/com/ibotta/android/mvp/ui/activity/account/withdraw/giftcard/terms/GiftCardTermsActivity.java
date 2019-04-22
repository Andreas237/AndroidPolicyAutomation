// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.mvp.base.MvpComponent;
import com.ibotta.android.mvp.base.loading.LoadingMvpActivity;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms:
//			GiftCardTermsView, DaggerGiftCardTermsComponent, GiftCardTermsModule, GiftCardTermsComponent, 
//			GiftCardTermsPresenter

public class GiftCardTermsActivity extends LoadingMvpActivity
	implements GiftCardTermsView
{

	public GiftCardTermsActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void LoadingMvpActivity()>
	//    2    4:return          
	}

	private void initTitle()
	{
		setTitle(0x7f110311);
	//    0    0:aload_0         
	//    1    1:ldc1            #19  <Int 0x7f110311>
	//    2    3:invokevirtual   #23  <Method void setTitle(int)>
	//    3    6:return          
	}

	private static Intent newIntent(Context context, int i)
	{
		context = ((Context) (new Intent(context, com/ibotta/android/mvp/ui/activity/account/withdraw/giftcard/terms/GiftCardTermsActivity)));
	//    0    0:new             #27  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class GiftCardTermsActivity>
	//    4    7:invokespecial   #30  <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).putExtra("gift_card_id", i);
	//    6   11:aload_0         
	//    7   12:ldc1            #32  <String "gift_card_id">
	//    8   14:iload_1         
	//    9   15:invokevirtual   #36  <Method Intent Intent.putExtra(String, int)>
	//   10   18:pop             
		return ((Intent) (context));
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public static void start(Context context, int i)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			context.startActivity(newIntent(context, i));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokestatic    #40  <Method Intent newIntent(Context, int)>
	//    7   11:invokevirtual   #46  <Method void Context.startActivity(Intent)>
			return;
	//    8   14:return          
		}
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method GiftCardTermsComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected GiftCardTermsComponent createComponent(MainComponent maincomponent)
	{
		return DaggerGiftCardTermsComponent.builder().mainComponent(maincomponent).giftCardTermsModule(new GiftCardTermsModule(((GiftCardTermsView) (this)))).build();
	//    0    0:invokestatic    #57  <Method DaggerGiftCardTermsComponent$Builder DaggerGiftCardTermsComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #63  <Method DaggerGiftCardTermsComponent$Builder DaggerGiftCardTermsComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #65  <Class GiftCardTermsModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #68  <Method void GiftCardTermsModule(GiftCardTermsView)>
	//    7   15:invokevirtual   #72  <Method DaggerGiftCardTermsComponent$Builder DaggerGiftCardTermsComponent$Builder.giftCardTermsModule(GiftCardTermsModule)>
	//    8   18:invokevirtual   #76  <Method GiftCardTermsComponent DaggerGiftCardTermsComponent$Builder.build()>
	//    9   21:areturn         
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((GiftCardTermsComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #80  <Class GiftCardTermsComponent>
	//    3    5:invokevirtual   #83  <Method void inject(GiftCardTermsComponent)>
	//    4    8:return          
	}

	protected void inject(GiftCardTermsComponent giftcardtermscomponent)
	{
		giftcardtermscomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #86  <Method void GiftCardTermsComponent.inject(GiftCardTermsActivity)>
	//    3    7:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #91  <Method void LoadingMvpActivity.onCreate(Bundle)>
		setContentView(0x7f0c003c);
	//    3    5:aload_0         
	//    4    6:ldc1            #92  <Int 0x7f0c003c>
	//    5    8:invokevirtual   #95  <Method void setContentView(int)>
		setUnbinder(ButterKnife.bind(((android.app.Activity) (this))));
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:invokestatic    #101 <Method butterknife.Unbinder ButterKnife.bind(android.app.Activity)>
	//    9   16:invokevirtual   #105 <Method void setUnbinder(butterknife.Unbinder)>
		bundle = ((Bundle) (getIntent()));
	//   10   19:aload_0         
	//   11   20:invokevirtual   #109 <Method Intent getIntent()>
	//   12   23:astore_1        
		int i = -1;
	//   13   24:iconst_m1       
	//   14   25:istore_2        
		if(bundle != null)
	//*  15   26:aload_1         
	//*  16   27:ifnull          41
			i = getIntent().getIntExtra("gift_card_id", -1);
	//   17   30:aload_0         
	//   18   31:invokevirtual   #109 <Method Intent getIntent()>
	//   19   34:ldc1            #32  <String "gift_card_id">
	//   20   36:iconst_m1       
	//   21   37:invokevirtual   #113 <Method int Intent.getIntExtra(String, int)>
	//   22   40:istore_2        
		((GiftCardTermsPresenter)mvpPresenter).setGiftCardId(i);
	//   23   41:aload_0         
	//   24   42:getfield        #117 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   25   45:checkcast       #119 <Class GiftCardTermsPresenter>
	//   26   48:iload_2         
	//   27   49:invokeinterface #122 <Method void GiftCardTermsPresenter.setGiftCardId(int)>
		initTitle();
	//   28   54:aload_0         
	//   29   55:invokespecial   #124 <Method void initTitle()>
	//   30   58:return          
	}

	public void setTerms(String s)
	{
		tvTerms.setText(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field TextView tvTerms>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #135 <Method void TextView.setText(CharSequence)>
	//    4    8:return          
	}

	protected TextView tvTerms;
}
