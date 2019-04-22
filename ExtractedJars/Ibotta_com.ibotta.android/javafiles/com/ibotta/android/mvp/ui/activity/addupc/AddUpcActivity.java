// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.addupc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.images.ImageCache;
import com.ibotta.android.mvp.base.MvpComponent;
import com.ibotta.android.mvp.base.loading.LoadingMvpActivity;
import com.ibotta.android.views.images.Sizes;
import com.ibotta.api.model.OfferModel;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.addupc:
//			AddUpcView, AddUpcPresenter, DaggerAddUpcComponent, AddUpcModule, 
//			AddUpcComponent

public class AddUpcActivity extends LoadingMvpActivity
	implements AddUpcView
{

	public AddUpcActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void LoadingMvpActivity()>
	//    2    4:return          
	}

	private void initDescription(OfferModel offermodel)
	{
		tvDescription.setText(((CharSequence) (offermodel.getDescription())));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field TextView tvDescription>
	//    2    4:aload_1         
	//    3    5:invokeinterface #41  <Method String OfferModel.getDescription()>
	//    4   10:invokevirtual   #47  <Method void TextView.setText(CharSequence)>
	//    5   13:return          
	}

	private void initImage(OfferModel offermodel)
	{
		imageCache.load(((Context) (this)), offermodel.getUrl(), ivImage, ((com.ibotta.android.images.ImageCache.Size) (Sizes.PRODUCT_SMALL)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ImageCache imageCache>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #53  <Method String OfferModel.getUrl()>
	//    5   11:aload_0         
	//    6   12:getfield        #55  <Field ImageView ivImage>
	//    7   15:getstatic       #61  <Field Sizes Sizes.PRODUCT_SMALL>
	//    8   18:invokeinterface #67  <Method com.ibotta.android.images.ImageLoadJob ImageCache.load(Context, String, ImageView, com.ibotta.android.images.ImageCache$Size)>
	//    9   23:pop             
	//   10   24:return          
	}

	private void initName(OfferModel offermodel)
	{
		tvName.setText(((CharSequence) (offermodel.getName())));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field TextView tvName>
	//    2    4:aload_1         
	//    3    5:invokeinterface #73  <Method String OfferModel.getName()>
	//    4   10:invokevirtual   #47  <Method void TextView.setText(CharSequence)>
	//    5   13:return          
	}

	private void initTitle()
	{
		setTitle(0x7f11006f);
	//    0    0:aload_0         
	//    1    1:ldc1            #75  <Int 0x7f11006f>
	//    2    3:invokevirtual   #79  <Method void setTitle(int)>
	//    3    6:return          
	}

	private void loadState(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			offerId = bundle.getInt("offer_id", -1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #83  <String "offer_id">
	//    5    8:iconst_m1       
	//    6    9:invokevirtual   #89  <Method int Bundle.getInt(String, int)>
	//    7   12:putfield        #91  <Field int offerId>
		else
	//*   8   15:goto            39
		if(getIntent() != null)
	//*   9   18:aload_0         
	//*  10   19:invokevirtual   #95  <Method Intent getIntent()>
	//*  11   22:ifnull          39
			offerId = getIntent().getIntExtra("offer_id", -1);
	//   12   25:aload_0         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #95  <Method Intent getIntent()>
	//   15   30:ldc1            #83  <String "offer_id">
	//   16   32:iconst_m1       
	//   17   33:invokevirtual   #100 <Method int Intent.getIntExtra(String, int)>
	//   18   36:putfield        #91  <Field int offerId>
		((AddUpcPresenter)mvpPresenter).setOfferId(offerId);
	//   19   39:aload_0         
	//   20   40:getfield        #104 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//   21   43:checkcast       #106 <Class AddUpcPresenter>
	//   22   46:aload_0         
	//   23   47:getfield        #91  <Field int offerId>
	//   24   50:invokeinterface #109 <Method void AddUpcPresenter.setOfferId(int)>
	//   25   55:return          
	}

	private static Intent newIntent(Context context, int i)
	{
		context = ((Context) (new Intent(context, com/ibotta/android/mvp/ui/activity/addupc/AddUpcActivity)));
	//    0    0:new             #97  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class AddUpcActivity>
	//    4    7:invokespecial   #114 <Method void Intent(Context, Class)>
	//    5   10:astore_0        
		((Intent) (context)).putExtra("offer_id", i);
	//    6   11:aload_0         
	//    7   12:ldc1            #83  <String "offer_id">
	//    8   14:iload_1         
	//    9   15:invokevirtual   #118 <Method Intent Intent.putExtra(String, int)>
	//   10   18:pop             
		return ((Intent) (context));
	//   11   19:aload_0         
	//   12   20:areturn         
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
			activity.startActivityForResult(newIntent(((Context) (activity)), i), 9);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokestatic    #122 <Method Intent newIntent(Context, int)>
	//    7   11:bipush          9
	//    8   13:invokevirtual   #128 <Method void Activity.startActivityForResult(Intent, int)>
			return;
	//    9   16:return          
		}
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #133 <Method AddUpcComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected AddUpcComponent createComponent(MainComponent maincomponent)
	{
		return DaggerAddUpcComponent.builder().mainComponent(maincomponent).addUpcModule(new AddUpcModule(((AddUpcView) (this)))).build();
	//    0    0:invokestatic    #139 <Method DaggerAddUpcComponent$Builder DaggerAddUpcComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #145 <Method DaggerAddUpcComponent$Builder DaggerAddUpcComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #147 <Class AddUpcModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #150 <Method void AddUpcModule(AddUpcView)>
	//    7   15:invokevirtual   #154 <Method DaggerAddUpcComponent$Builder DaggerAddUpcComponent$Builder.addUpcModule(AddUpcModule)>
	//    8   18:invokevirtual   #158 <Method AddUpcComponent DaggerAddUpcComponent$Builder.build()>
	//    9   21:areturn         
	}

	public void finishWithNoResult()
	{
		setResult(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #162 <Method void setResult(int)>
		finish();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #165 <Method void finish()>
	//    5    9:return          
	}

	public void finishWithYesResult()
	{
		setResult(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #162 <Method void setResult(int)>
		finish();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #165 <Method void finish()>
	//    5    9:return          
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((AddUpcComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #170 <Class AddUpcComponent>
	//    3    5:invokevirtual   #173 <Method void inject(AddUpcComponent)>
	//    4    8:return          
	}

	protected void inject(AddUpcComponent addupccomponent)
	{
		addupccomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #176 <Method void AddUpcComponent.inject(AddUpcActivity)>
	//    3    7:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #180 <Method void LoadingMvpActivity.onCreate(Bundle)>
		setContentView(0x7f0c001e);
	//    3    5:aload_0         
	//    4    6:ldc1            #181 <Int 0x7f0c001e>
	//    5    8:invokevirtual   #184 <Method void setContentView(int)>
		setUnbinder(ButterKnife.bind(((Activity) (this))));
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:invokestatic    #190 <Method butterknife.Unbinder ButterKnife.bind(Activity)>
	//    9   16:invokevirtual   #194 <Method void setUnbinder(butterknife.Unbinder)>
		loadState(bundle);
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:invokespecial   #196 <Method void loadState(Bundle)>
		initTitle();
	//   13   24:aload_0         
	//   14   25:invokespecial   #198 <Method void initTitle()>
	//   15   28:return          
	}

	protected void onNoClicked()
	{
		((AddUpcPresenter)mvpPresenter).onNoClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #106 <Class AddUpcPresenter>
	//    3    7:invokeinterface #204 <Method void AddUpcPresenter.onNoClicked()>
	//    4   12:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #208 <Method void LoadingMvpActivity.onSaveInstanceState(Bundle)>
		bundle.putInt("offer_id", offerId);
	//    3    5:aload_1         
	//    4    6:ldc1            #83  <String "offer_id">
	//    5    8:aload_0         
	//    6    9:getfield        #91  <Field int offerId>
	//    7   12:invokevirtual   #212 <Method void Bundle.putInt(String, int)>
	//    8   15:return          
	}

	protected void onYesClicked()
	{
		((AddUpcPresenter)mvpPresenter).onYesClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    2    4:checkcast       #106 <Class AddUpcPresenter>
	//    3    7:invokeinterface #216 <Method void AddUpcPresenter.onYesClicked()>
	//    4   12:return          
	}

	public void setOfferModel(OfferModel offermodel)
	{
		initImage(offermodel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #219 <Method void initImage(OfferModel)>
		initName(offermodel);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #221 <Method void initName(OfferModel)>
		initDescription(offermodel);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #223 <Method void initDescription(OfferModel)>
	//    9   15:return          
	}

	public static final int KEY_RESP_CODE_NO = 0;
	public static final int KEY_RESP_CODE_YES = 1;
	ImageCache imageCache;
	protected ImageView ivImage;
	private int offerId;
	protected TextView tvDescription;
	protected TextView tvName;
}
