// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import b.a.a.a.a.b.o;
import b.a.a.a.a.g.m;
import b.a.a.a.a.g.q;
import b.a.a.a.a.g.t;
import b.a.a.a.c;
import b.a.a.a.i;
import b.a.a.a.l;
import java.io.File;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionAnalyticsManager, AddToCartEvent, ContentViewEvent, CustomEvent, 
//			InviteEvent, LevelEndEvent, LevelStartEvent, LoginEvent, 
//			PurchaseEvent, RatingEvent, SearchEvent, ShareEvent, 
//			SignUpEvent, StartCheckoutEvent

public class Answers extends i
{

	public Answers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void i()>
		firebaseEnabled = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean firebaseEnabled>
	//    5    9:return          
	}

	public static Answers getInstance()
	{
		return (Answers)c.a(com/crashlytics/android/answers/Answers);
	//    0    0:ldc1            #2   <Class Answers>
	//    1    2:invokestatic    #31  <Method i c.a(Class)>
	//    2    5:checkcast       #2   <Class Answers>
	//    3    8:areturn         
	}

	private void logFirebaseModeEnabledWarning(String s)
	{
		l l1 = c.g();
	//    0    0:invokestatic    #37  <Method l c.g()>
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
		l1.d("Answers", stringbuilder.toString());
	//   18   32:aload_2         
	//   19   33:ldc1            #12  <String "Answers">
	//   20   35:aload_3         
	//   21   36:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   22   39:invokeinterface #58  <Method void l.d(String, String)>
	//   23   44:return          
	}

	protected Boolean doInBackground()
	{
		t t1;
		try
		{
			t1 = q.a().b();
	//    0    0:invokestatic    #67  <Method q q.a()>
	//    1    3:invokevirtual   #71  <Method t q.b()>
	//    2    6:astore_1        
		}
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       28
	//*   5   11:invokestatic    #37  <Method l c.g()>
	//*   6   14:ldc1            #12  <String "Answers">
	//*   7   16:ldc1            #73  <String "Failed to retrieve settings">
	//*   8   18:invokeinterface #76  <Method void l.e(String, String)>
	//*   9   23:iconst_0        
	//*  10   24:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//*  11   27:areturn         
	//*  12   28:aload_1         
	//*  13   29:getfield        #87  <Field m t.d>
	//*  14   32:getfield        #91  <Field boolean m.d>
	//*  15   35:ifeq            70
	//*  16   38:invokestatic    #37  <Method l c.g()>
	//*  17   41:ldc1            #12  <String "Answers">
	//*  18   43:ldc1            #93  <String "Analytics collection enabled">
	//*  19   45:invokeinterface #95  <Method void l.a(String, String)>
	//*  20   50:aload_0         
	//*  21   51:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  22   54:aload_1         
	//*  23   55:getfield        #100 <Field b.a.a.a.a.g.b t.e>
	//*  24   58:aload_0         
	//*  25   59:invokevirtual   #103 <Method String getOverridenSpiEndpoint()>
	//*  26   62:invokevirtual   #109 <Method void SessionAnalyticsManager.setAnalyticsSettingsData(b.a.a.a.a.g.b, String)>
	//*  27   65:iconst_1        
	//*  28   66:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//*  29   69:areturn         
	//*  30   70:invokestatic    #37  <Method l c.g()>
	//*  31   73:ldc1            #12  <String "Answers">
	//*  32   75:ldc1            #111 <String "Analytics collection disabled">
	//*  33   77:invokeinterface #95  <Method void l.a(String, String)>
	//*  34   82:aload_0         
	//*  35   83:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  36   86:invokevirtual   #114 <Method void SessionAnalyticsManager.disable()>
	//*  37   89:iconst_0        
	//*  38   90:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//*  39   93:areturn         
		catch(Exception exception)
	//*  40   94:astore_1        
		{
			c.g().e("Answers", "Error dealing with settings", ((Throwable) (exception)));
	//   41   95:invokestatic    #37  <Method l c.g()>
	//   42   98:ldc1            #12  <String "Answers">
	//   43  100:ldc1            #116 <String "Error dealing with settings">
	//   44  102:aload_1         
	//   45  103:invokeinterface #119 <Method void l.e(String, String, Throwable)>
			return Boolean.valueOf(false);
	//   46  108:iconst_0        
	//   47  109:invokestatic    #82  <Method Boolean Boolean.valueOf(boolean)>
	//   48  112:areturn         
		}
		if(t1 != null)
			break MISSING_BLOCK_LABEL_28;
		c.g().e("Answers", "Failed to retrieve settings");
		return Boolean.valueOf(false);
		if(t1.d.d)
		{
			c.g().a("Answers", "Analytics collection enabled");
			analyticsManager.setAnalyticsSettingsData(t1.e, getOverridenSpiEndpoint());
			return Boolean.valueOf(true);
		}
		c.g().a("Answers", "Analytics collection disabled");
		analyticsManager.disable();
		return Boolean.valueOf(false);
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method Boolean doInBackground()>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android:answers";
	//    0    0:ldc1            #125 <String "com.crashlytics.sdk.android:answers">
	//    1    2:areturn         
	}

	String getOverridenSpiEndpoint()
	{
		return b.a.a.a.a.b.i.b(getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method Context getContext()>
	//    2    4:ldc1            #9   <String "com.crashlytics.ApiEndpoint">
	//    3    6:invokestatic    #134 <Method String b.a.a.a.a.b.i.b(Context, String)>
	//    4    9:areturn         
	}

	public String getVersion()
	{
		return "1.4.2.25";
	//    0    0:ldc1            #137 <String "1.4.2.25">
	//    1    2:areturn         
	}

	public void logAddToCart(AddToCartEvent addtocartevent)
	{
		if(addtocartevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logAddToCart");
	//   10   21:aload_0         
	//   11   22:ldc1            #146 <String "logAddToCart">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (addtocartevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logContentView(ContentViewEvent contentviewevent)
	{
		if(contentviewevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logContentView");
	//   10   21:aload_0         
	//   11   22:ldc1            #155 <String "logContentView">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (contentviewevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logCustom(CustomEvent customevent)
	{
		if(customevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logCustom");
	//   10   21:aload_0         
	//   11   22:ldc1            #158 <String "logCustom">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onCustom(customevent);
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #161 <Method void SessionAnalyticsManager.onCustom(CustomEvent)>
	//   21   43:return          
	}

	public void logInvite(InviteEvent inviteevent)
	{
		if(inviteevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logInvite");
	//   10   21:aload_0         
	//   11   22:ldc1            #164 <String "logInvite">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (inviteevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logLevelEnd(LevelEndEvent levelendevent)
	{
		if(levelendevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logLevelEnd");
	//   10   21:aload_0         
	//   11   22:ldc1            #167 <String "logLevelEnd">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (levelendevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logLevelStart(LevelStartEvent levelstartevent)
	{
		if(levelstartevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logLevelStart");
	//   10   21:aload_0         
	//   11   22:ldc1            #170 <String "logLevelStart">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (levelstartevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logLogin(LoginEvent loginevent)
	{
		if(loginevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logLogin");
	//   10   21:aload_0         
	//   11   22:ldc1            #173 <String "logLogin">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (loginevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logPurchase(PurchaseEvent purchaseevent)
	{
		if(purchaseevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logPurchase");
	//   10   21:aload_0         
	//   11   22:ldc1            #176 <String "logPurchase">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (purchaseevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logRating(RatingEvent ratingevent)
	{
		if(ratingevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logRating");
	//   10   21:aload_0         
	//   11   22:ldc1            #179 <String "logRating">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (ratingevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logSearch(SearchEvent searchevent)
	{
		if(searchevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logSearch");
	//   10   21:aload_0         
	//   11   22:ldc1            #182 <String "logSearch">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (searchevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logShare(ShareEvent shareevent)
	{
		if(shareevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logShare");
	//   10   21:aload_0         
	//   11   22:ldc1            #185 <String "logShare">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (shareevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logSignUp(SignUpEvent signupevent)
	{
		if(signupevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logSignUp");
	//   10   21:aload_0         
	//   11   22:ldc1            #188 <String "logSignUp">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (signupevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void logStartCheckout(StartCheckoutEvent startcheckoutevent)
	{
		if(startcheckoutevent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("event must not be null");
	//    2    4:new             #141 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #143 <String "event must not be null">
	//    5   10:invokespecial   #145 <Method void NullPointerException(String)>
	//    6   13:athrow          
		if(firebaseEnabled)
	//*   7   14:aload_0         
	//*   8   15:getfield        #22  <Field boolean firebaseEnabled>
	//*   9   18:ifeq            28
		{
			logFirebaseModeEnabledWarning("logStartCheckout");
	//   10   21:aload_0         
	//   11   22:ldc1            #191 <String "logStartCheckout">
	//   12   24:invokespecial   #148 <Method void logFirebaseModeEnabledWarning(String)>
			return;
	//   13   27:return          
		}
		if(analyticsManager != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  16   32:ifnull          43
			analyticsManager.onPredefined(((PredefinedEvent) (startcheckoutevent)));
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #152 <Method void SessionAnalyticsManager.onPredefined(PredefinedEvent)>
	//   21   43:return          
	}

	public void onException(b.a.a.a.a.b.j.a a)
	{
		if(analyticsManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*   2    4:ifnull          22
			analyticsManager.onCrash(a.a(), a.b());
	//    3    7:aload_0         
	//    4    8:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #197 <Method String b.a.a.a.a.b.j$a.a()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #199 <Method String b.a.a.a.a.b.j$a.b()>
	//    9   19:invokevirtual   #202 <Method void SessionAnalyticsManager.onCrash(String, String)>
	//   10   22:return          
	}

	public void onException(b.a.a.a.a.b.j.b b)
	{
		if(analyticsManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*   2    4:ifnull          18
			analyticsManager.onError(b.a());
	//    3    7:aload_0         
	//    4    8:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #206 <Method String b.a.a.a.a.b.j$b.a()>
	//    7   15:invokevirtual   #209 <Method void SessionAnalyticsManager.onError(String)>
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
	//    1    1:invokevirtual   #129 <Method Context getContext()>
	//    2    4:astore          4
		packagemanager = context.getPackageManager();
	//    3    6:aload           4
	//    4    8:invokevirtual   #220 <Method PackageManager Context.getPackageManager()>
	//    5   11:astore          5
		s1 = context.getPackageName();
	//    6   13:aload           4
	//    7   15:invokevirtual   #223 <Method String Context.getPackageName()>
	//    8   18:astore          6
		packageinfo = packagemanager.getPackageInfo(s1, 0);
	//    9   20:aload           5
	//   10   22:aload           6
	//   11   24:iconst_0        
	//   12   25:invokevirtual   #229 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   13   28:astore          7
		s2 = Integer.toString(packageinfo.versionCode);
	//   14   30:aload           7
	//   15   32:getfield        #235 <Field int PackageInfo.versionCode>
	//   16   35:invokestatic    #240 <Method String Integer.toString(int)>
	//   17   38:astore          8
		String s;
		if(packageinfo.versionName == null)
	//*  18   40:aload           7
	//*  19   42:getfield        #243 <Field String PackageInfo.versionName>
	//*  20   45:ifnonnull       54
		{
			s = "0.0";
	//   21   48:ldc1            #245 <String "0.0">
	//   22   50:astore_3        
			break MISSING_BLOCK_LABEL_60;
	//   23   51:goto            60
		}
		s = packageinfo.versionName;
	//   24   54:aload           7
	//   25   56:getfield        #243 <Field String PackageInfo.versionName>
	//   26   59:astore_3        
		long l1;
		if(android.os.Build.VERSION.SDK_INT >= 9)
	//*  27   60:getstatic       #250 <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   63:bipush          9
	//*  29   65:icmplt          77
		{
			l1 = packageinfo.firstInstallTime;
	//   30   68:aload           7
	//   31   70:getfield        #254 <Field long PackageInfo.firstInstallTime>
	//   32   73:lstore_1        
			break MISSING_BLOCK_LABEL_102;
	//   33   74:goto            162
		}
		try
		{
			l1 = (new File(packagemanager.getApplicationInfo(s1, 0).sourceDir)).lastModified();
	//   34   77:new             #256 <Class File>
	//   35   80:dup             
	//   36   81:aload           5
	//   37   83:aload           6
	//   38   85:iconst_0        
	//   39   86:invokevirtual   #260 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   40   89:getfield        #265 <Field String ApplicationInfo.sourceDir>
	//   41   92:invokespecial   #266 <Method void File(String)>
	//   42   95:invokevirtual   #270 <Method long File.lastModified()>
	//   43   98:lstore_1        
		}
	//*  44   99:goto            162
	//*  45  102:aload_0         
	//*  46  103:aload_0         
	//*  47  104:aload           4
	//*  48  106:aload_0         
	//*  49  107:invokevirtual   #274 <Method b.a.a.a.a.b.p getIdManager()>
	//*  50  110:aload           8
	//*  51  112:aload_3         
	//*  52  113:lload_1         
	//*  53  114:invokestatic    #278 <Method SessionAnalyticsManager SessionAnalyticsManager.build(i, Context, b.a.a.a.a.b.p, String, String, long)>
	//*  54  117:putfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  55  120:aload_0         
	//*  56  121:getfield        #97  <Field SessionAnalyticsManager analyticsManager>
	//*  57  124:invokevirtual   #281 <Method void SessionAnalyticsManager.enable()>
	//*  58  127:aload_0         
	//*  59  128:new             #283 <Class o>
	//*  60  131:dup             
	//*  61  132:invokespecial   #284 <Method void o()>
	//*  62  135:aload           4
	//*  63  137:invokevirtual   #287 <Method boolean o.b(Context)>
	//*  64  140:putfield        #22  <Field boolean firebaseEnabled>
	//*  65  143:iconst_1        
	//*  66  144:ireturn         
		catch(Exception exception)
	//*  67  145:astore_3        
		{
			c.g().e("Answers", "Error retrieving app properties", ((Throwable) (exception)));
	//   68  146:invokestatic    #37  <Method l c.g()>
	//   69  149:ldc1            #12  <String "Answers">
	//   70  151:ldc2            #289 <String "Error retrieving app properties">
	//   71  154:aload_3         
	//   72  155:invokeinterface #119 <Method void l.e(String, String, Throwable)>
			return false;
	//   73  160:iconst_0        
	//   74  161:ireturn         
		}
		analyticsManager = SessionAnalyticsManager.build(((i) (this)), context, getIdManager(), s2, s, l1);
		analyticsManager.enable();
		firebaseEnabled = (new o()).b(context);
		return true;
	//*  75  162:goto            102
	}

	static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
	public static final String TAG = "Answers";
	SessionAnalyticsManager analyticsManager;
	boolean firebaseEnabled;
}
