// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.appsflyer;

import android.content.*;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.ibotta.android.App;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.mvp.base.MvpActivity;
import com.ibotta.android.mvp.base.MvpComponent;
import com.ibotta.android.mvp.ui.view.nav.NavButtonType;
import com.ibotta.android.routing.intent.LaunchIntentCreator;
import com.ibotta.android.routing.intent.RoutingIntentCreator;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.tracking.sdk.LifecycleTracker;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.appsflyer:
//			AppsFlyerRoutingView, AppsFlyerRoutingPresenter, DaggerAppsFlyerRoutingComponent, AppsFlyerRoutingModule, 
//			AppsFlyerRoutingComponent

public class AppsFlyerRoutingActivity extends MvpActivity
	implements AppsFlyerRoutingView
{

	public AppsFlyerRoutingActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void MvpActivity()>
	//    2    4:aload_0         
	//    3    5:new             #9   <Class AppsFlyerRoutingActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #30  <Method void AppsFlyerRoutingActivity$1(AppsFlyerRoutingActivity)>
	//    7   13:putfield        #32  <Field BroadcastReceiver receiver>
	//    8   16:return          
	}

	private String parseIntentForLink(Intent intent)
	{
		return intent.getStringExtra("link");
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String "link">
	//    2    3:invokevirtual   #48  <Method String Intent.getStringExtra(String)>
	//    3    6:areturn         
	}

	private void processIntent(Intent intent)
	{
		intent = ((Intent) (parseIntentForLink(intent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method String parseIntentForLink(Intent)>
	//    3    5:astore_1        
		((AppsFlyerRoutingPresenter)mvpPresenter).parseUrl(((String) (intent)));
	//    4    6:aload_0         
	//    5    7:getfield        #55  <Field com.ibotta.android.mvp.base.MvpPresenter mvpPresenter>
	//    6   10:checkcast       #57  <Class AppsFlyerRoutingPresenter>
	//    7   13:aload_1         
	//    8   14:invokeinterface #61  <Method void AppsFlyerRoutingPresenter.parseUrl(String)>
	//    9   19:return          
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #66  <Method AppsFlyerRoutingComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected AppsFlyerRoutingComponent createComponent(MainComponent maincomponent)
	{
		return DaggerAppsFlyerRoutingComponent.builder().mainComponent(maincomponent).appsFlyerRoutingModule(new AppsFlyerRoutingModule(((AppsFlyerRoutingView) (this)))).build();
	//    0    0:invokestatic    #72  <Method DaggerAppsFlyerRoutingComponent$Builder DaggerAppsFlyerRoutingComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #78  <Method DaggerAppsFlyerRoutingComponent$Builder DaggerAppsFlyerRoutingComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #80  <Class AppsFlyerRoutingModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #83  <Method void AppsFlyerRoutingModule(AppsFlyerRoutingView)>
	//    7   15:invokevirtual   #87  <Method DaggerAppsFlyerRoutingComponent$Builder DaggerAppsFlyerRoutingComponent$Builder.appsFlyerRoutingModule(AppsFlyerRoutingModule)>
	//    8   18:invokevirtual   #91  <Method AppsFlyerRoutingComponent DaggerAppsFlyerRoutingComponent$Builder.build()>
	//    9   21:areturn         
	}

	protected NavButtonType getNavButtonType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((AppsFlyerRoutingComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #97  <Class AppsFlyerRoutingComponent>
	//    3    5:invokevirtual   #100 <Method void inject(AppsFlyerRoutingComponent)>
	//    4    8:return          
	}

	protected void inject(AppsFlyerRoutingComponent appsflyerroutingcomponent)
	{
		appsflyerroutingcomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #102 <Method void AppsFlyerRoutingComponent.inject(AppsFlyerRoutingActivity)>
	//    3    7:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #106 <Method void MvpActivity.onCreate(Bundle)>
		App.instance().getMainComponent().inject(this);
	//    3    5:invokestatic    #112 <Method App App.instance()>
	//    4    8:invokevirtual   #116 <Method MainComponent App.getMainComponent()>
	//    5   11:aload_0         
	//    6   12:invokeinterface #119 <Method void MainComponent.inject(AppsFlyerRoutingActivity)>
		setContentView(0x7f0c0067);
	//    7   17:aload_0         
	//    8   18:ldc1            #120 <Int 0x7f0c0067>
	//    9   20:invokevirtual   #124 <Method void setContentView(int)>
	//   10   23:return          
	}

	public void onNoAppsFlyerUrl()
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method void finish()>
	//    2    4:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #132 <Method void MvpActivity.onResume()>
		lifecycleTracker.trackOpenReferrer(((android.support.v4.app.FragmentActivity) (this)));
	//    2    4:aload_0         
	//    3    5:getfield        #134 <Field LifecycleTracker lifecycleTracker>
	//    4    8:aload_0         
	//    5    9:invokeinterface #140 <Method void LifecycleTracker.trackOpenReferrer(android.support.v4.app.FragmentActivity)>
	//    6   14:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method void MvpActivity.onStart()>
		LocalBroadcastManager.getInstance(((Context) (this))).registerReceiver(receiver, new IntentFilter("com.ibotta.android.APPS_FLYER_DEEP_LINK"));
	//    2    4:aload_0         
	//    3    5:invokestatic    #149 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field BroadcastReceiver receiver>
	//    6   12:new             #151 <Class IntentFilter>
	//    7   15:dup             
	//    8   16:ldc1            #13  <String "com.ibotta.android.APPS_FLYER_DEEP_LINK">
	//    9   18:invokespecial   #153 <Method void IntentFilter(String)>
	//   10   21:invokevirtual   #157 <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   11   24:return          
	}

	protected void onStop()
	{
		LocalBroadcastManager.getInstance(((Context) (this))).unregisterReceiver(receiver);
	//    0    0:aload_0         
	//    1    1:invokestatic    #149 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field BroadcastReceiver receiver>
	//    4    8:invokevirtual   #162 <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
		super.onStop();
	//    5   11:aload_0         
	//    6   12:invokespecial   #164 <Method void MvpActivity.onStop()>
	//    7   15:return          
	}

	public void routeToLogin()
	{
		startActivity((new LaunchIntentCreator(((Context) (this)), false)).create());
	//    0    0:aload_0         
	//    1    1:new             #168 <Class LaunchIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokespecial   #171 <Method void LaunchIntentCreator(Context, boolean)>
	//    6   10:invokevirtual   #175 <Method Intent LaunchIntentCreator.create()>
	//    7   13:invokevirtual   #178 <Method void startActivity(Intent)>
		finish();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #129 <Method void finish()>
	//   10   20:return          
	}

	public void routeToRouting(String s)
	{
		startActivity((new RoutingIntentCreator(((Context) (this)), s, true)).clearTask(true).create());
	//    0    0:aload_0         
	//    1    1:new             #182 <Class RoutingIntentCreator>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:invokespecial   #185 <Method void RoutingIntentCreator(Context, String, boolean)>
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #189 <Method RoutingIntentCreator RoutingIntentCreator.clearTask(boolean)>
	//    9   15:invokevirtual   #190 <Method Intent RoutingIntentCreator.create()>
	//   10   18:invokevirtual   #178 <Method void startActivity(Intent)>
		finish();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #129 <Method void finish()>
	//   13   25:return          
	}

	public static final String APPS_FLYER_ACTION = "com.ibotta.android.APPS_FLYER_DEEP_LINK";
	public static final String APPS_FLYER_LINK = "link";
	protected LifecycleTracker lifecycleTracker;
	private final BroadcastReceiver receiver = new BroadcastReceiver() {

		public void onReceive(Context context, Intent intent)
		{
			processIntent(intent);
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field AppsFlyerRoutingActivity this$0>
		//    2    4:aload_2         
		//    3    5:invokestatic    #23  <Method void AppsFlyerRoutingActivity.access$000(AppsFlyerRoutingActivity, Intent)>
		//    4    8:return          
		}

		final AppsFlyerRoutingActivity this$0;

			
			{
				this$0 = AppsFlyerRoutingActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field AppsFlyerRoutingActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
	}
;
	protected UserState userState;


/*
	static void access$000(AppsFlyerRoutingActivity appsflyerroutingactivity, Intent intent)
	{
		appsflyerroutingactivity.processIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method void processIntent(Intent)>
		return;
	//    3    5:return          
	}

*/
}
