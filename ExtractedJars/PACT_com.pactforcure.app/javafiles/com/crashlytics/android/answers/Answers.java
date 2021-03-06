// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import android.content.pm.*;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.*;
import java.io.File;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionAnalyticsManager, AddToCartEvent, ContentViewEvent, CustomEvent, 
//			InviteEvent, LevelEndEvent, LevelStartEvent, LoginEvent, 
//			PurchaseEvent, RatingEvent, SearchEvent, ShareEvent, 
//			SignUpEvent, StartCheckoutEvent

public class Answers extends Kit
{

	public Answers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Kit()>
	//    2    4:return          
	}

	public static Answers getInstance()
	{
		return (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
	//    0    0:ldc1            #2   <Class Answers>
	//    1    2:invokestatic    #27  <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #2   <Class Answers>
	//    3    8:areturn         
	}

	protected Boolean doInBackground()
	{
		SettingsData settingsdata;
		try
		{
			settingsdata = Settings.getInstance().awaitSettingsData();
	//    0    0:invokestatic    #36  <Method Settings Settings.getInstance()>
	//    1    3:invokevirtual   #40  <Method SettingsData Settings.awaitSettingsData()>
	//    2    6:astore_1        
		}
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       28
	//*   5   11:invokestatic    #44  <Method Logger Fabric.getLogger()>
	//*   6   14:ldc1            #12  <String "Answers">
	//*   7   16:ldc1            #46  <String "Failed to retrieve settings">
	//*   8   18:invokeinterface #52  <Method void Logger.e(String, String)>
	//*   9   23:iconst_0        
	//*  10   24:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//*  11   27:areturn         
	//*  12   28:aload_1         
	//*  13   29:getfield        #64  <Field FeaturesSettingsData SettingsData.featuresData>
	//*  14   32:getfield        #70  <Field boolean FeaturesSettingsData.collectAnalytics>
	//*  15   35:ifeq            70
	//*  16   38:invokestatic    #44  <Method Logger Fabric.getLogger()>
	//*  17   41:ldc1            #12  <String "Answers">
	//*  18   43:ldc1            #72  <String "Analytics collection enabled">
	//*  19   45:invokeinterface #75  <Method void Logger.d(String, String)>
	//*  20   50:aload_0         
	//*  21   51:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*  22   54:aload_1         
	//*  23   55:getfield        #81  <Field io.fabric.sdk.android.services.settings.AnalyticsSettingsData SettingsData.analyticsSettingsData>
	//*  24   58:aload_0         
	//*  25   59:invokevirtual   #85  <Method String getOverridenSpiEndpoint()>
	//*  26   62:invokevirtual   #91  <Method void SessionAnalyticsManager.setAnalyticsSettingsData(io.fabric.sdk.android.services.settings.AnalyticsSettingsData, String)>
	//*  27   65:iconst_1        
	//*  28   66:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//*  29   69:areturn         
	//*  30   70:invokestatic    #44  <Method Logger Fabric.getLogger()>
	//*  31   73:ldc1            #12  <String "Answers">
	//*  32   75:ldc1            #93  <String "Analytics collection disabled">
	//*  33   77:invokeinterface #75  <Method void Logger.d(String, String)>
	//*  34   82:aload_0         
	//*  35   83:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*  36   86:invokevirtual   #96  <Method void SessionAnalyticsManager.disable()>
	//*  37   89:iconst_0        
	//*  38   90:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//*  39   93:areturn         
		catch(Exception exception)
	//*  40   94:astore_1        
		{
			Fabric.getLogger().e("Answers", "Error dealing with settings", ((Throwable) (exception)));
	//   41   95:invokestatic    #44  <Method Logger Fabric.getLogger()>
	//   42   98:ldc1            #12  <String "Answers">
	//   43  100:ldc1            #98  <String "Error dealing with settings">
	//   44  102:aload_1         
	//   45  103:invokeinterface #101 <Method void Logger.e(String, String, Throwable)>
			return Boolean.valueOf(false);
	//   46  108:iconst_0        
	//   47  109:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//   48  112:areturn         
		}
		if(settingsdata != null)
			break MISSING_BLOCK_LABEL_28;
		Fabric.getLogger().e("Answers", "Failed to retrieve settings");
		return Boolean.valueOf(false);
		if(settingsdata.featuresData.collectAnalytics)
		{
			Fabric.getLogger().d("Answers", "Analytics collection enabled");
			analyticsManager.setAnalyticsSettingsData(settingsdata.analyticsSettingsData, getOverridenSpiEndpoint());
			return Boolean.valueOf(true);
		}
		Fabric.getLogger().d("Answers", "Analytics collection disabled");
		analyticsManager.disable();
		return Boolean.valueOf(false);
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method Boolean doInBackground()>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android:answers";
	//    0    0:ldc1            #107 <String "com.crashlytics.sdk.android:answers">
	//    1    2:areturn         
	}

	String getOverridenSpiEndpoint()
	{
		return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method Context getContext()>
	//    2    4:ldc1            #9   <String "com.crashlytics.ApiEndpoint">
	//    3    6:invokestatic    #117 <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    4    9:areturn         
	}

	public String getVersion()
	{
		return "1.3.10.143";
	//    0    0:ldc1            #120 <String "1.3.10.143">
	//    1    2:areturn         
	}

	public void logAddToCart(AddToCartEvent addtocartevent)
	{
		if(addtocartevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (addtocartevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logContentView(ContentViewEvent contentviewevent)
	{
		if(contentviewevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (contentviewevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logCustom(CustomEvent customevent)
	{
		if(customevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onCustom(customevent);
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #140 <Method void SessionAnalyticsManager.onCustom(CustomEvent)>
	//   14   29:return          
	}

	public void logInvite(InviteEvent inviteevent)
	{
		if(inviteevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (inviteevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logLevelEnd(LevelEndEvent levelendevent)
	{
		if(levelendevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (levelendevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logLevelStart(LevelStartEvent levelstartevent)
	{
		if(levelstartevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (levelstartevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logLogin(LoginEvent loginevent)
	{
		if(loginevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (loginevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logPurchase(PurchaseEvent purchaseevent)
	{
		if(purchaseevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (purchaseevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logRating(RatingEvent ratingevent)
	{
		if(ratingevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (ratingevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logSearch(SearchEvent searchevent)
	{
		if(searchevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (searchevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logShare(ShareEvent shareevent)
	{
		if(shareevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (shareevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logSignUp(SignUpEvent signupevent)
	{
		if(signupevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (signupevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void logStartCheckout(StartCheckoutEvent startcheckoutevent)
	{
		if(startcheckoutevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #124 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #126 <String "event must not be null">
	//    5   10:invokespecial   #129 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(analyticsManager != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   9   18:ifnull          29
			analyticsManager.onPredefined(((PredefinedEvent) (startcheckoutevent)));
	//   10   21:aload_0         
	//   11   22:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #133 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   14   29:return          
	}

	public void onException(io.fabric.sdk.android.services.common.Crash.FatalException fatalexception)
	{
		if(analyticsManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   2    4:ifnull          22
			analyticsManager.onCrash(fatalexception.getSessionId(), fatalexception.getExceptionName());
	//    3    7:aload_0         
	//    4    8:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #167 <Method String io.fabric.sdk.android.services.common.Crash$FatalException.getSessionId()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #170 <Method String io.fabric.sdk.android.services.common.Crash$FatalException.getExceptionName()>
	//    9   19:invokevirtual   #173 <Method void SessionAnalyticsManager.onCrash(String, String)>
	//   10   22:return          
	}

	public void onException(io.fabric.sdk.android.services.common.Crash.LoggedException loggedexception)
	{
		if(analyticsManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*   2    4:ifnull          18
			analyticsManager.onError(loggedexception.getSessionId());
	//    3    7:aload_0         
	//    4    8:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #177 <Method String io.fabric.sdk.android.services.common.Crash$LoggedException.getSessionId()>
	//    7   15:invokevirtual   #180 <Method void SessionAnalyticsManager.onError(String)>
	//    8   18:return          
	}

	protected boolean onPreExecute()
	{
		Context context;
		PackageManager packagemanager;
		String s1;
		PackageInfo packageinfo;
		String s2;
		context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method Context getContext()>
	//    2    4:astore          4
		packagemanager = context.getPackageManager();
	//    3    6:aload           4
	//    4    8:invokevirtual   #191 <Method PackageManager Context.getPackageManager()>
	//    5   11:astore          5
		s1 = context.getPackageName();
	//    6   13:aload           4
	//    7   15:invokevirtual   #194 <Method String Context.getPackageName()>
	//    8   18:astore          6
		packageinfo = packagemanager.getPackageInfo(s1, 0);
	//    9   20:aload           5
	//   10   22:aload           6
	//   11   24:iconst_0        
	//   12   25:invokevirtual   #200 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   13   28:astore          7
		s2 = Integer.toString(packageinfo.versionCode);
	//   14   30:aload           7
	//   15   32:getfield        #206 <Field int PackageInfo.versionCode>
	//   16   35:invokestatic    #212 <Method String Integer.toString(int)>
	//   17   38:astore          8
		long l;
		String s;
		if(packageinfo.versionName == null)
	//*  18   40:aload           7
	//*  19   42:getfield        #215 <Field String PackageInfo.versionName>
	//*  20   45:ifnonnull       92
			s = "0.0";
	//   21   48:ldc1            #217 <String "0.0">
	//   22   50:astore_3        
		else
	//*  23   51:getstatic       #222 <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   54:bipush          9
	//*  25   56:icmplt          101
	//*  26   59:aload           7
	//*  27   61:getfield        #226 <Field long PackageInfo.firstInstallTime>
	//*  28   64:lstore_1        
	//*  29   65:aload_0         
	//*  30   66:aload_0         
	//*  31   67:aload           4
	//*  32   69:aload_0         
	//*  33   70:invokevirtual   #230 <Method io.fabric.sdk.android.services.common.IdManager getIdManager()>
	//*  34   73:aload           8
	//*  35   75:aload_3         
	//*  36   76:lload_1         
	//*  37   77:invokestatic    #234 <Method SessionAnalyticsManager SessionAnalyticsManager.build(Kit, Context, io.fabric.sdk.android.services.common.IdManager, String, String, long)>
	//*  38   80:putfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*  39   83:aload_0         
	//*  40   84:getfield        #77  <Field SessionAnalyticsManager analyticsManager>
	//*  41   87:invokevirtual   #237 <Method void SessionAnalyticsManager.enable()>
	//*  42   90:iconst_1        
	//*  43   91:ireturn         
			try
			{
				s = packageinfo.versionName;
	//   44   92:aload           7
	//   45   94:getfield        #215 <Field String PackageInfo.versionName>
	//   46   97:astore_3        
			}
	//*  47   98:goto            51
	//*  48  101:new             #239 <Class File>
	//*  49  104:dup             
	//*  50  105:aload           5
	//*  51  107:aload           6
	//*  52  109:iconst_0        
	//*  53  110:invokevirtual   #243 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//*  54  113:getfield        #248 <Field String ApplicationInfo.sourceDir>
	//*  55  116:invokespecial   #249 <Method void File(String)>
	//*  56  119:invokevirtual   #253 <Method long File.lastModified()>
	//*  57  122:lstore_1        
	//*  58  123:goto            65
			catch(Exception exception)
	//*  59  126:astore_3        
			{
				Fabric.getLogger().e("Answers", "Error retrieving app properties", ((Throwable) (exception)));
	//   60  127:invokestatic    #44  <Method Logger Fabric.getLogger()>
	//   61  130:ldc1            #12  <String "Answers">
	//   62  132:ldc1            #255 <String "Error retrieving app properties">
	//   63  134:aload_3         
	//   64  135:invokeinterface #101 <Method void Logger.e(String, String, Throwable)>
				return false;
	//   65  140:iconst_0        
	//   66  141:ireturn         
			}
		if(android.os.Build.VERSION.SDK_INT < 9)
			break MISSING_BLOCK_LABEL_101;
		l = packageinfo.firstInstallTime;
_L1:
		analyticsManager = SessionAnalyticsManager.build(((Kit) (this)), context, getIdManager(), s2, s, l);
		analyticsManager.enable();
		return true;
		l = (new File(packagemanager.getApplicationInfo(s1, 0).sourceDir)).lastModified();
		  goto _L1
	}

	static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
	public static final String TAG = "Answers";
	SessionAnalyticsManager analyticsManager;
}
