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
//			AppboyNotificationUtils, AppboyNotificationRemoteViewsUtils, AppboyNotificationActionUtils

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
	//    9   17:astore          7
		AppboyNotificationUtils.setTitleIfPresent(builder, bundle);
	//   10   19:aload           7
	//   11   21:aload_3         
	//   12   22:invokestatic    #48  <Method void AppboyNotificationUtils.setTitleIfPresent(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setContentIfPresent(builder, bundle);
	//   13   25:aload           7
	//   14   27:aload_3         
	//   15   28:invokestatic    #51  <Method void AppboyNotificationUtils.setContentIfPresent(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setTickerIfPresent(builder, bundle);
	//   16   31:aload           7
	//   17   33:aload_3         
	//   18   34:invokestatic    #54  <Method void AppboyNotificationUtils.setTickerIfPresent(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setSetShowWhen(builder, bundle);
	//   19   37:aload           7
	//   20   39:aload_3         
	//   21   40:invokestatic    #57  <Method void AppboyNotificationUtils.setSetShowWhen(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setContentIntentIfPresent(context, builder, bundle);
	//   22   43:aload_2         
	//   23   44:aload           7
	//   24   46:aload_3         
	//   25   47:invokestatic    #61  <Method void AppboyNotificationUtils.setContentIntentIfPresent(Context, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setDeleteIntent(context, builder, bundle);
	//   26   50:aload_2         
	//   27   51:aload           7
	//   28   53:aload_3         
	//   29   54:invokestatic    #64  <Method void AppboyNotificationUtils.setDeleteIntent(Context, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		int i = AppboyNotificationUtils.setSmallIcon(appboyconfigurationprovider, builder);
	//   30   57:aload_1         
	//   31   58:aload           7
	//   32   60:invokestatic    #68  <Method int AppboyNotificationUtils.setSmallIcon(AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder)>
	//   33   63:istore          5
		boolean flag = AppboyNotificationUtils.setLargeIconIfPresentAndSupported(context, appboyconfigurationprovider, builder, bundle);
	//   34   65:aload_2         
	//   35   66:aload_1         
	//   36   67:aload           7
	//   37   69:aload_3         
	//   38   70:invokestatic    #72  <Method boolean AppboyNotificationUtils.setLargeIconIfPresentAndSupported(Context, AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder, Bundle)>
	//   39   73:istore          6
		AppboyNotificationUtils.setSoundIfPresentAndSupported(builder, bundle);
	//   40   75:aload           7
	//   41   77:aload_3         
	//   42   78:invokestatic    #75  <Method void AppboyNotificationUtils.setSoundIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		if(android.os.Build.VERSION.SDK_INT < 16)
	//*  43   81:getstatic       #81  <Field int android.os.Build$VERSION.SDK_INT>
	//*  44   84:bipush          16
	//*  45   86:icmpge          118
		{
			android.widget.RemoteViews remoteviews = AppboyNotificationRemoteViewsUtils.createMultiLineContentNotificationView(context, bundle, i, true ^ flag);
	//   46   89:aload_2         
	//   47   90:aload_3         
	//   48   91:iload           5
	//   49   93:iconst_1        
	//   50   94:iload           6
	//   51   96:ixor            
	//   52   97:invokestatic    #87  <Method android.widget.RemoteViews AppboyNotificationRemoteViewsUtils.createMultiLineContentNotificationView(Context, Bundle, int, boolean)>
	//   53  100:astore          8
			if(remoteviews != null)
	//*  54  102:aload           8
	//*  55  104:ifnull          118
			{
				builder.setContent(remoteviews);
	//   56  107:aload           7
	//   57  109:aload           8
	//   58  111:invokevirtual   #91  <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContent(android.widget.RemoteViews)>
	//   59  114:pop             
				return builder;
	//   60  115:aload           7
	//   61  117:areturn         
			}
		}
		AppboyNotificationUtils.setSummaryTextIfPresentAndSupported(builder, bundle);
	//   62  118:aload           7
	//   63  120:aload_3         
	//   64  121:invokestatic    #94  <Method void AppboyNotificationUtils.setSummaryTextIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setPriorityIfPresentAndSupported(builder, bundle);
	//   65  124:aload           7
	//   66  126:aload_3         
	//   67  127:invokestatic    #97  <Method void AppboyNotificationUtils.setPriorityIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setStyleIfSupported(context, builder, bundle, bundle1);
	//   68  130:aload_2         
	//   69  131:aload           7
	//   70  133:aload_3         
	//   71  134:aload           4
	//   72  136:invokestatic    #101 <Method void AppboyNotificationUtils.setStyleIfSupported(Context, android.support.v4.app.NotificationCompat$Builder, Bundle, Bundle)>
		AppboyNotificationActionUtils.addNotificationActions(context, builder, bundle);
	//   73  139:aload_2         
	//   74  140:aload           7
	//   75  142:aload_3         
	//   76  143:invokestatic    #106 <Method void AppboyNotificationActionUtils.addNotificationActions(Context, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setAccentColorIfPresentAndSupported(appboyconfigurationprovider, builder, bundle);
	//   77  146:aload_1         
	//   78  147:aload           7
	//   79  149:aload_3         
	//   80  150:invokestatic    #110 <Method void AppboyNotificationUtils.setAccentColorIfPresentAndSupported(AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setCategoryIfPresentAndSupported(builder, bundle);
	//   81  153:aload           7
	//   82  155:aload_3         
	//   83  156:invokestatic    #113 <Method void AppboyNotificationUtils.setCategoryIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setVisibilityIfPresentAndSupported(builder, bundle);
	//   84  159:aload           7
	//   85  161:aload_3         
	//   86  162:invokestatic    #116 <Method void AppboyNotificationUtils.setVisibilityIfPresentAndSupported(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setPublicVersionIfPresentAndSupported(context, appboyconfigurationprovider, builder, bundle);
	//   87  165:aload_2         
	//   88  166:aload_1         
	//   89  167:aload           7
	//   90  169:aload_3         
	//   91  170:invokestatic    #120 <Method void AppboyNotificationUtils.setPublicVersionIfPresentAndSupported(Context, AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setNotificationChannelIfSupported(context, appboyconfigurationprovider, builder, bundle);
	//   92  173:aload_2         
	//   93  174:aload_1         
	//   94  175:aload           7
	//   95  177:aload_3         
	//   96  178:invokestatic    #123 <Method void AppboyNotificationUtils.setNotificationChannelIfSupported(Context, AppboyConfigurationProvider, android.support.v4.app.NotificationCompat$Builder, Bundle)>
		AppboyNotificationUtils.setNotificationBadgeNumberIfPresent(builder, bundle);
	//   97  181:aload           7
	//   98  183:aload_3         
	//   99  184:invokestatic    #126 <Method void AppboyNotificationUtils.setNotificationBadgeNumberIfPresent(android.support.v4.app.NotificationCompat$Builder, Bundle)>
		return builder;
	//  100  187:aload           7
	//  101  189:areturn         
	}

	private static volatile AppboyNotificationFactory sInstance;

	static 
	{
	//    0    0:return          
	}
}
