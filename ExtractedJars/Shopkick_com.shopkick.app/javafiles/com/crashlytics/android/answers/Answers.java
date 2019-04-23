// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import android.content.pm.*;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.*;
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
	//    1    1:invokespecial   #20  <Method void Kit()>
		firebaseEnabled = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean firebaseEnabled>
	//    5    9:return          
	}

	public static Answers getInstance()
	{
		return (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
	//    0    0:ldc1            #2   <Class Answers>
	//    1    2:invokestatic    #31  <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #2   <Class Answers>
	//    3    8:areturn         
	}

	private void logFirebaseModeEnabledWarning(String s)
	{
		Logger logger = Fabric.getLogger();
	//    0    0:invokestatic    #37  <Method Logger Fabric.getLogger()>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #39  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #40  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Method ");
	//    6   12:aload_3         
	//    7   13:ldc1            #42  <String "Method ">
	//    8   15:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(s);
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		stringbuilder.append(" is not supported when using Crashlytics through Firebase.");
	//   14   25:aload_3         
	//   15   26:ldc1            #48  <String " is not supported when using Crashlytics through Firebase.">
	//   16   28:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
		logger.w("Answers", stringbuilder.toString());
	//   18   32:aload_2         
	//   19   33:ldc1            #12  <String "Answers">
	//   20   35:aload_3         
	//   21   36:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   22   39:invokeinterface #58  <Method void Logger.w(String, String)>
	//   23   44:return          
	}

	protected Boolean doInBackground()
	{
		if(!DataCollectionArbiter.getInstance(getContext()).isDataCollectionEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #66  <Method Context getContext()>
	//*   2    4:invokestatic    #71  <Method DataCollectionArbiter DataCollectionArbiter.getInstance(Context)>
	//*   3    7:invokevirtual   #75  <Method boolean DataCollectionArbiter.isDataCollectionEnabled()>
	//*   4   10:ifne            37
		{
			Fabric.getLogger().d("Fabric", "Analytics collection disabled, because data collection is disabled by Firebase.");
	//    5   13:invokestatic    #37  <Method Logger Fabric.getLogger()>
	//    6   16:ldc1            #77  <String "Fabric">
	//    7   18:ldc1            #79  <String "Analytics collection disabled, because data collection is disabled by Firebase.">
	//    8   20:invokeinterface #82  <Method void Logger.d(String, String)>
			analyticsManager.disable();
	//    9   25:aload_0         
	//   10   26:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   29:invokevirtual   #89  <Method void SessionAnalyticsManager.disable()>
			return Boolean.valueOf(false);
	//   12   32:iconst_0        
	//   13   33:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//   14   36:areturn         
		}
		SettingsData settingsdata;
		try
		{
			settingsdata = Settings.getInstance().awaitSettingsData();
	//   15   37:invokestatic    #100 <Method Settings Settings.getInstance()>
	//   16   40:invokevirtual   #104 <Method SettingsData Settings.awaitSettingsData()>
	//   17   43:astore_1        
		}
	//*  18   44:aload_1         
	//*  19   45:ifnonnull       65
	//*  20   48:invokestatic    #37  <Method Logger Fabric.getLogger()>
	//*  21   51:ldc1            #12  <String "Answers">
	//*  22   53:ldc1            #106 <String "Failed to retrieve settings">
	//*  23   55:invokeinterface #109 <Method void Logger.e(String, String)>
	//*  24   60:iconst_0        
	//*  25   61:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//*  26   64:areturn         
	//*  27   65:aload_1         
	//*  28   66:getfield        #115 <Field FeaturesSettingsData SettingsData.featuresData>
	//*  29   69:getfield        #120 <Field boolean FeaturesSettingsData.collectAnalytics>
	//*  30   72:ifeq            107
	//*  31   75:invokestatic    #37  <Method Logger Fabric.getLogger()>
	//*  32   78:ldc1            #12  <String "Answers">
	//*  33   80:ldc1            #122 <String "Analytics collection enabled">
	//*  34   82:invokeinterface #82  <Method void Logger.d(String, String)>
	//*  35   87:aload_0         
	//*  36   88:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//*  37   91:aload_1         
	//*  38   92:getfield        #126 <Field io.fabric.sdk.android.services.settings.AnalyticsSettingsData SettingsData.analyticsSettingsData>
	//*  39   95:aload_0         
	//*  40   96:invokevirtual   #129 <Method String getOverridenSpiEndpoint()>
	//*  41   99:invokevirtual   #133 <Method void SessionAnalyticsManager.setAnalyticsSettingsData(io.fabric.sdk.android.services.settings.AnalyticsSettingsData, String)>
	//*  42  102:iconst_1        
	//*  43  103:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//*  44  106:areturn         
	//*  45  107:invokestatic    #37  <Method Logger Fabric.getLogger()>
	//*  46  110:ldc1            #12  <String "Answers">
	//*  47  112:ldc1            #135 <String "Analytics collection disabled">
	//*  48  114:invokeinterface #82  <Method void Logger.d(String, String)>
	//*  49  119:aload_0         
	//*  50  120:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//*  51  123:invokevirtual   #89  <Method void SessionAnalyticsManager.disable()>
	//*  52  126:iconst_0        
	//*  53  127:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//*  54  130:areturn         
		catch(Exception exception)
	//*  55  131:astore_1        
		{
			Fabric.getLogger().e("Answers", "Error dealing with settings", ((Throwable) (exception)));
	//   56  132:invokestatic    #37  <Method Logger Fabric.getLogger()>
	//   57  135:ldc1            #12  <String "Answers">
	//   58  137:ldc1            #137 <String "Error dealing with settings">
	//   59  139:aload_1         
	//   60  140:invokeinterface #140 <Method void Logger.e(String, String, Throwable)>
			return Boolean.valueOf(false);
	//   61  145:iconst_0        
	//   62  146:invokestatic    #95  <Method Boolean Boolean.valueOf(boolean)>
	//   63  149:areturn         
		}
		if(settingsdata != null)
			break MISSING_BLOCK_LABEL_65;
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
	//    1    1:invokevirtual   #143 <Method Boolean doInBackground()>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android:answers";
	//    0    0:ldc1            #146 <String "com.crashlytics.sdk.android:answers">
	//    1    2:areturn         
	}

	String getOverridenSpiEndpoint()
	{
		return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method Context getContext()>
	//    2    4:ldc1            #9   <String "com.crashlytics.ApiEndpoint">
	//    3    6:invokestatic    #152 <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    4    9:areturn         
	}

	public String getVersion()
	{
		return "1.4.5.29";
	//    0    0:ldc1            #155 <String "1.4.5.29">
	//    1    2:areturn         
	}

	public void logAddToCart(AddToCartEvent addtocartevent)
	{
		if(addtocartevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logAddToCart");
	//    5   11:aload_0         
	//    6   12:ldc1            #158 <String "logAddToCart">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (addtocartevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logContentView(ContentViewEvent contentviewevent)
	{
		if(contentviewevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logContentView");
	//    5   11:aload_0         
	//    6   12:ldc1            #173 <String "logContentView">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (contentviewevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logCustom(CustomEvent customevent)
	{
		if(customevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logCustom");
	//    5   11:aload_0         
	//    6   12:ldc1            #176 <String "logCustom">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onCustom(customevent);
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #179 <Method void SessionAnalyticsManager.onCustom(CustomEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logInvite(InviteEvent inviteevent)
	{
		if(inviteevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logInvite");
	//    5   11:aload_0         
	//    6   12:ldc1            #182 <String "logInvite">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (inviteevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logLevelEnd(LevelEndEvent levelendevent)
	{
		if(levelendevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logLevelEnd");
	//    5   11:aload_0         
	//    6   12:ldc1            #185 <String "logLevelEnd">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (levelendevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logLevelStart(LevelStartEvent levelstartevent)
	{
		if(levelstartevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logLevelStart");
	//    5   11:aload_0         
	//    6   12:ldc1            #188 <String "logLevelStart">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (levelstartevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logLogin(LoginEvent loginevent)
	{
		if(loginevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logLogin");
	//    5   11:aload_0         
	//    6   12:ldc1            #191 <String "logLogin">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (loginevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logPurchase(PurchaseEvent purchaseevent)
	{
		if(purchaseevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logPurchase");
	//    5   11:aload_0         
	//    6   12:ldc1            #194 <String "logPurchase">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (purchaseevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logRating(RatingEvent ratingevent)
	{
		if(ratingevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logRating");
	//    5   11:aload_0         
	//    6   12:ldc1            #197 <String "logRating">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (ratingevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logSearch(SearchEvent searchevent)
	{
		if(searchevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logSearch");
	//    5   11:aload_0         
	//    6   12:ldc1            #200 <String "logSearch">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (searchevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logShare(ShareEvent shareevent)
	{
		if(shareevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logShare");
	//    5   11:aload_0         
	//    6   12:ldc1            #203 <String "logShare">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (shareevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logSignUp(SignUpEvent signupevent)
	{
		if(signupevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logSignUp");
	//    5   11:aload_0         
	//    6   12:ldc1            #206 <String "logSignUp">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (signupevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void logStartCheckout(StartCheckoutEvent startcheckoutevent)
	{
		if(startcheckoutevent != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(firebaseEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean firebaseEnabled>
	//*   4    8:ifeq            18
			{
				logFirebaseModeEnabledWarning("logStartCheckout");
	//    5   11:aload_0         
	//    6   12:ldc1            #209 <String "logStartCheckout">
	//    7   14:invokespecial   #160 <Method void logFirebaseModeEnabledWarning(String)>
				return;
	//    8   17:return          
			}
			SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    9   18:aload_0         
	//   10   19:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   11   22:astore_2        
			if(sessionanalyticsmanager != null)
	//*  12   23:aload_2         
	//*  13   24:ifnull          32
				sessionanalyticsmanager.onPredefined(((PredefinedEvent) (startcheckoutevent)));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #164 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
			return;
	//   17   32:return          
		} else
		{
			throw new NullPointerException("event must not be null");
	//   18   33:new             #166 <Class NullPointerException>
	//   19   36:dup             
	//   20   37:ldc1            #168 <String "event must not be null">
	//   21   39:invokespecial   #170 <Method void NullPointerException(String)>
	//   22   42:athrow          
		}
	}

	public void onException(io.fabric.sdk.android.services.common.Crash.FatalException fatalexception)
	{
		SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//    2    4:astore_2        
		if(sessionanalyticsmanager != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          21
			sessionanalyticsmanager.onCrash(fatalexception.getSessionId(), fatalexception.getExceptionName());
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #216 <Method String io.fabric.sdk.android.services.common.Crash$FatalException.getSessionId()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #219 <Method String io.fabric.sdk.android.services.common.Crash$FatalException.getExceptionName()>
	//   10   18:invokevirtual   #222 <Method void SessionAnalyticsManager.onCrash(String, String)>
	//   11   21:return          
	}

	public void onException(io.fabric.sdk.android.services.common.Crash.LoggedException loggedexception)
	{
		SessionAnalyticsManager sessionanalyticsmanager = analyticsManager;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//    2    4:astore_2        
		if(sessionanalyticsmanager != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			sessionanalyticsmanager.onError(loggedexception.getSessionId());
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #226 <Method String io.fabric.sdk.android.services.common.Crash$LoggedException.getSessionId()>
	//    8   14:invokevirtual   #229 <Method void SessionAnalyticsManager.onError(String)>
	//    9   17:return          
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
	//    1    1:invokevirtual   #66  <Method Context getContext()>
	//    2    4:astore          4
		packagemanager = context.getPackageManager();
	//    3    6:aload           4
	//    4    8:invokevirtual   #239 <Method PackageManager Context.getPackageManager()>
	//    5   11:astore          5
		s1 = context.getPackageName();
	//    6   13:aload           4
	//    7   15:invokevirtual   #242 <Method String Context.getPackageName()>
	//    8   18:astore          6
		packageinfo = packagemanager.getPackageInfo(s1, 0);
	//    9   20:aload           5
	//   10   22:aload           6
	//   11   24:iconst_0        
	//   12   25:invokevirtual   #248 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   13   28:astore          7
		s2 = Integer.toString(packageinfo.versionCode);
	//   14   30:aload           7
	//   15   32:getfield        #254 <Field int PackageInfo.versionCode>
	//   16   35:invokestatic    #259 <Method String Integer.toString(int)>
	//   17   38:astore          8
		String s;
		if(packageinfo.versionName == null)
	//*  18   40:aload           7
	//*  19   42:getfield        #262 <Field String PackageInfo.versionName>
	//*  20   45:ifnonnull       55
		{
			s = "0.0";
	//   21   48:ldc2            #264 <String "0.0">
	//   22   51:astore_3        
			break MISSING_BLOCK_LABEL_61;
	//   23   52:goto            61
		}
		s = packageinfo.versionName;
	//   24   55:aload           7
	//   25   57:getfield        #262 <Field String PackageInfo.versionName>
	//   26   60:astore_3        
		long l;
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  27   61:getstatic       #269 <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   64:bipush          9
	//*  29   66:icmplt          78
		{
			l = packageinfo.firstInstallTime;
	//   30   69:aload           7
	//   31   71:getfield        #273 <Field long PackageInfo.firstInstallTime>
	//   32   74:lstore_1        
			break MISSING_BLOCK_LABEL_100;
	//   33   75:goto            100
		}
		l = (new File(packagemanager.getApplicationInfo(s1, 0).sourceDir)).lastModified();
	//   34   78:new             #275 <Class File>
	//   35   81:dup             
	//   36   82:aload           5
	//   37   84:aload           6
	//   38   86:iconst_0        
	//   39   87:invokevirtual   #279 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   40   90:getfield        #284 <Field String ApplicationInfo.sourceDir>
	//   41   93:invokespecial   #285 <Method void File(String)>
	//   42   96:invokevirtual   #289 <Method long File.lastModified()>
	//   43   99:lstore_1        
		analyticsManager = SessionAnalyticsManager.build(((Kit) (this)), context, getIdManager(), s2, s, l);
	//   44  100:aload_0         
	//   45  101:aload_0         
	//   46  102:aload           4
	//   47  104:aload_0         
	//   48  105:invokevirtual   #293 <Method io.fabric.sdk.android.services.common.IdManager getIdManager()>
	//   49  108:aload           8
	//   50  110:aload_3         
	//   51  111:lload_1         
	//   52  112:invokestatic    #297 <Method SessionAnalyticsManager SessionAnalyticsManager.build(Kit, Context, io.fabric.sdk.android.services.common.IdManager, String, String, long)>
	//   53  115:putfield        #84  <Field SessionAnalyticsManager analyticsManager>
		analyticsManager.enable();
	//   54  118:aload_0         
	//   55  119:getfield        #84  <Field SessionAnalyticsManager analyticsManager>
	//   56  122:invokevirtual   #300 <Method void SessionAnalyticsManager.enable()>
		firebaseEnabled = (new FirebaseInfo()).isFirebaseCrashlyticsEnabled(context);
	//   57  125:aload_0         
	//   58  126:new             #302 <Class FirebaseInfo>
	//   59  129:dup             
	//   60  130:invokespecial   #303 <Method void FirebaseInfo()>
	//   61  133:aload           4
	//   62  135:invokevirtual   #307 <Method boolean FirebaseInfo.isFirebaseCrashlyticsEnabled(Context)>
	//   63  138:putfield        #22  <Field boolean firebaseEnabled>
		return true;
	//   64  141:iconst_1        
	//   65  142:ireturn         
		Exception exception;
		exception;
	//   66  143:astore_3        
		Fabric.getLogger().e("Answers", "Error retrieving app properties", ((Throwable) (exception)));
	//   67  144:invokestatic    #37  <Method Logger Fabric.getLogger()>
	//   68  147:ldc1            #12  <String "Answers">
	//   69  149:ldc2            #309 <String "Error retrieving app properties">
	//   70  152:aload_3         
	//   71  153:invokeinterface #140 <Method void Logger.e(String, String, Throwable)>
		return false;
	//   72  158:iconst_0        
	//   73  159:ireturn         
	}

	static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
	public static final String TAG = "Answers";
	SessionAnalyticsManager analyticsManager;
	boolean firebaseEnabled;
}
