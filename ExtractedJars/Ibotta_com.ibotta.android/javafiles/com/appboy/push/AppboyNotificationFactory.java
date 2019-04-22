// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.appboy.IAppboyNotificationFactory;
import com.appboy.configuration.AppboyConfigurationProvider;

// Referenced classes of package com.appboy.push:
//			AppboyNotificationUtils, AppboyNotificationActionUtils

public class AppboyNotificationFactory
	implements IAppboyNotificationFactory
{

	public AppboyNotificationFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static AppboyNotificationFactory getInstance()
	{
		if(sInstance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #18  <Field AppboyNotificationFactory sInstance>
	//    1    3:ifnonnull       37
		com/appboy/push/AppboyNotificationFactory;
	//    2    6:ldc1            #2   <Class AppboyNotificationFactory>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(sInstance == null)
	//*   4    9:getstatic       #18  <Field AppboyNotificationFactory sInstance>
	//*   5   12:ifnonnull       25
			sInstance = new AppboyNotificationFactory();
	//    6   15:new             #2   <Class AppboyNotificationFactory>
	//    7   18:dup             
	//    8   19:invokespecial   #19  <Method void AppboyNotificationFactory()>
	//    9   22:putstatic       #18  <Field AppboyNotificationFactory sInstance>
		com/appboy/push/AppboyNotificationFactory;
	//   10   25:ldc1            #2   <Class AppboyNotificationFactory>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/appboy/push/AppboyNotificationFactory;
	//   14   32:ldc1            #2   <Class AppboyNotificationFactory>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return sInstance;
	//   18   37:getstatic       #18  <Field AppboyNotificationFactory sInstance>
	//   19   40:areturn         
	}

	public Notification createNotification(AppboyConfigurationProvider appboyconfigurationprovider, Context context, Bundle bundle, Bundle bundle1)
	{
		return populateNotificationBuilder(appboyconfigurationprovider, context, bundle, bundle1).build();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #25  <Method android.support.v4.app.NotificationCompat$Builder populateNotificationBuilder(AppboyConfigurationProvider, Context, Bundle, Bundle)>
	//    6    9:invokevirtual   #31  <Method Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//    7   12:areturn         
	}

	public android.support.v4.app.NotificationCompat.Builder populateNotificationBuilder(AppboyConfigurationProvider appboyconfigurationprovider, Context context, Bundle bundle, Bundle bundle1)
	{
		AppboyNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(context, bundle);
	//    0    0:aload_2         
	//    1    1:aload_3         
	//    2    2:invokestatic    #37  <Method void AppboyNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(Context, Bundle)>
		android.support.v4.app.NotificationCompat.Builder builder = (new android.support.v4.app.NotificationCompat.Builder(context)).setAutoCancel(true);
	//    3    5:new             #27  <Class android.support.v4.app.NotificationCompat$Builder>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #40  <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #44  <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setAutoCancel(boolean)>
	//    9   17:astore          5
		AppboyNotificationUtils.setTitleIfPresent(builder, bundle);
	//   10   19:aload           5
	//   11   21:aload_3         
	//   12   22:invokestatic    #48  <Method void AppboyNotificationUtils.setTitleIfPresent(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setContentIfPresent(builder, bundle);
	//   13   25:aload           5
	//   14   27:aload_3         
	//   15   28:invokestatic    #51  <Method void AppboyNotificationUtils.setContentIfPresent(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setTickerIfPresent(builder, bundle);
	//   16   31:aload           5
	//   17   33:aload_3         
	//   18   34:invokestatic    #54  <Method void AppboyNotificationUtils.setTickerIfPresent(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setSetShowWhen(builder, bundle);
	//   19   37:aload           5
	//   20   39:aload_3         
	//   21   40:invokestatic    #57  <Method void AppboyNotificationUtils.setSetShowWhen(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setContentIntentIfPresent(context, builder, bundle);
	//   22   43:aload_2         
	//   23   44:aload           5
	//   24   46:aload_3         
	//   25   47:invokestatic    #61  <Method void AppboyNotificationUtils.setContentIntentIfPresent(Context, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setDeleteIntent(context, builder, bundle);
	//   26   50:aload_2         
	//   27   51:aload           5
	//   28   53:aload_3         
	//   29   54:invokestatic    #64  <Method void AppboyNotificationUtils.setDeleteIntent(Context, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setSmallIcon(appboyconfigurationprovider, builder);
	//   30   57:aload_1         
	//   31   58:aload           5
	//   32   60:invokestatic    #68  <Method int AppboyNotificationUtils.setSmallIcon(AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder)>
	//   33   63:pop             
		AppboyNotificationUtils.setLargeIconIfPresentAndSupported(context, appboyconfigurationprovider, builder, bundle);
	//   34   64:aload_2         
	//   35   65:aload_1         
	//   36   66:aload           5
	//   37   68:aload_3         
	//   38   69:invokestatic    #72  <Method boolean AppboyNotificationUtils.setLargeIconIfPresentAndSupported(Context, AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder, Bundle)>
	//   39   72:pop             
		AppboyNotificationUtils.setSoundIfPresentAndSupported(builder, bundle);
	//   40   73:aload           5
	//   41   75:aload_3         
	//   42   76:invokestatic    #75  <Method void AppboyNotificationUtils.setSoundIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setSummaryTextIfPresentAndSupported(builder, bundle);
	//   43   79:aload           5
	//   44   81:aload_3         
	//   45   82:invokestatic    #78  <Method void AppboyNotificationUtils.setSummaryTextIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setPriorityIfPresentAndSupported(builder, bundle);
	//   46   85:aload           5
	//   47   87:aload_3         
	//   48   88:invokestatic    #81  <Method void AppboyNotificationUtils.setPriorityIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setStyleIfSupported(context, builder, bundle, bundle1);
	//   49   91:aload_2         
	//   50   92:aload           5
	//   51   94:aload_3         
	//   52   95:aload           4
	//   53   97:invokestatic    #85  <Method void AppboyNotificationUtils.setStyleIfSupported(Context, android.support.v4.app.NotificationCompat$Builder, Bundle, Bundle)>
		AppboyNotificationActionUtils.addNotificationActions(context, builder, bundle);
	//   54  100:aload_2         
	//   55  101:aload           5
	//   56  103:aload_3         
	//   57  104:invokestatic    #90  <Method void AppboyNotificationActionUtils.addNotificationActions(Context, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setAccentColorIfPresentAndSupported(appboyconfigurationprovider, builder, bundle);
	//   58  107:aload_1         
	//   59  108:aload           5
	//   60  110:aload_3         
	//   61  111:invokestatic    #94  <Method void AppboyNotificationUtils.setAccentColorIfPresentAndSupported(AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setCategoryIfPresentAndSupported(builder, bundle);
	//   62  114:aload           5
	//   63  116:aload_3         
	//   64  117:invokestatic    #97  <Method void AppboyNotificationUtils.setCategoryIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setVisibilityIfPresentAndSupported(builder, bundle);
	//   65  120:aload           5
	//   66  122:aload_3         
	//   67  123:invokestatic    #100 <Method void AppboyNotificationUtils.setVisibilityIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setPublicVersionIfPresentAndSupported(context, appboyconfigurationprovider, builder, bundle);
	//   68  126:aload_2         
	//   69  127:aload_1         
	//   70  128:aload           5
	//   71  130:aload_3         
	//   72  131:invokestatic    #104 <Method void AppboyNotificationUtils.setPublicVersionIfPresentAndSupported(Context, AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setNotificationChannelIfSupported(context, appboyconfigurationprovider, builder, bundle);
	//   73  134:aload_2         
	//   74  135:aload_1         
	//   75  136:aload           5
	//   76  138:aload_3         
	//   77  139:invokestatic    #107 <Method void AppboyNotificationUtils.setNotificationChannelIfSupported(Context, AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setNotificationBadgeNumberIfPresent(builder, bundle);
	//   78  142:aload           5
	//   79  144:aload_3         
	//   80  145:invokestatic    #110 <Method void AppboyNotificationUtils.setNotificationBadgeNumberIfPresent(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		return builder;
	//   81  148:aload           5
	//   82  150:areturn         
	}

	private static volatile AppboyNotificationFactory sInstance;

	static 
	{
	//    0    0:return          
	}
}
