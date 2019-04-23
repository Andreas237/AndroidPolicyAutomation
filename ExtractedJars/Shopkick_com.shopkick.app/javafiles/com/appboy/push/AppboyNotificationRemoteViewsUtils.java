// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.push;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PackageUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.appboy.push:
//			AppboyNotificationUtils

public class AppboyNotificationRemoteViewsUtils
{

	public AppboyNotificationRemoteViewsUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public static RemoteViews createMultiLineContentNotificationView(Context context, Bundle bundle, int i, boolean flag)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          480
		{
			String s3 = bundle.getString("t");
	//    2    4:aload_1         
	//    3    5:ldc1            #50  <String "t">
	//    4    7:invokevirtual   #56  <Method String Bundle.getString(String)>
	//    5   10:astore          13
			String s4 = bundle.getString("a");
	//    6   12:aload_1         
	//    7   13:ldc1            #58  <String "a">
	//    8   15:invokevirtual   #56  <Method String Bundle.getString(String)>
	//    9   18:astore          14
			bundle = ((Bundle) (context.getResources()));
	//   10   20:aload_0         
	//   11   21:invokevirtual   #64  <Method Resources Context.getResources()>
	//   12   24:astore_1        
			String s = PackageUtils.getResourcePackageName(context);
	//   13   25:aload_0         
	//   14   26:invokestatic    #70  <Method String PackageUtils.getResourcePackageName(Context)>
	//   15   29:astore          11
			int j;
			if(flag)
	//*  16   31:iload_3         
	//*  17   32:ifeq            50
				j = ((Resources) (bundle)).getIdentifier("com_appboy_notification", "layout", s);
	//   18   35:aload_1         
	//   19   36:ldc1            #14  <String "com_appboy_notification">
	//   20   38:ldc1            #72  <String "layout">
	//   21   40:aload           11
	//   22   42:invokevirtual   #78  <Method int Resources.getIdentifier(String, String, String)>
	//   23   45:istore          4
			else
	//*  24   47:goto            62
				j = ((Resources) (bundle)).getIdentifier("com_appboy_notification_no_icon", "layout", s);
	//   25   50:aload_1         
	//   26   51:ldc1            #17  <String "com_appboy_notification_no_icon">
	//   27   53:ldc1            #72  <String "layout">
	//   28   55:aload           11
	//   29   57:invokevirtual   #78  <Method int Resources.getIdentifier(String, String, String)>
	//   30   60:istore          4
			int k = ((Resources) (bundle)).getIdentifier("com_appboy_notification_title", "id", s);
	//   31   62:aload_1         
	//   32   63:ldc1            #23  <String "com_appboy_notification_title">
	//   33   65:ldc1            #80  <String "id">
	//   34   67:aload           11
	//   35   69:invokevirtual   #78  <Method int Resources.getIdentifier(String, String, String)>
	//   36   72:istore          5
			int l = ((Resources) (bundle)).getIdentifier("com_appboy_notification_content", "id", s);
	//   37   74:aload_1         
	//   38   75:ldc1            #8   <String "com_appboy_notification_content">
	//   39   77:ldc1            #80  <String "id">
	//   40   79:aload           11
	//   41   81:invokevirtual   #78  <Method int Resources.getIdentifier(String, String, String)>
	//   42   84:istore          6
			int i1 = ((Resources) (bundle)).getIdentifier("com_appboy_notification_icon", "id", s);
	//   43   86:aload_1         
	//   44   87:ldc1            #11  <String "com_appboy_notification_icon">
	//   45   89:ldc1            #80  <String "id">
	//   46   91:aload           11
	//   47   93:invokevirtual   #78  <Method int Resources.getIdentifier(String, String, String)>
	//   48   96:istore          7
			int j1 = ((Resources) (bundle)).getIdentifier("com_appboy_notification_time", "id", s);
	//   49   98:aload_1         
	//   50   99:ldc1            #20  <String "com_appboy_notification_time">
	//   51  101:ldc1            #80  <String "id">
	//   52  103:aload           11
	//   53  105:invokevirtual   #78  <Method int Resources.getIdentifier(String, String, String)>
	//   54  108:istore          8
			int k1 = ((Resources) (bundle)).getIdentifier("com_appboy_notification_time_twenty_four_hour_format", "string", s);
	//   55  110:aload_1         
	//   56  111:ldc1            #29  <String "com_appboy_notification_time_twenty_four_hour_format">
	//   57  113:ldc1            #82  <String "string">
	//   58  115:aload           11
	//   59  117:invokevirtual   #78  <Method int Resources.getIdentifier(String, String, String)>
	//   60  120:istore          9
			int l1 = ((Resources) (bundle)).getIdentifier("com_appboy_notification_time_twelve_hour_format", "string", s);
	//   61  122:aload_1         
	//   62  123:ldc1            #26  <String "com_appboy_notification_time_twelve_hour_format">
	//   63  125:ldc1            #82  <String "string">
	//   64  127:aload           11
	//   65  129:invokevirtual   #78  <Method int Resources.getIdentifier(String, String, String)>
	//   66  132:istore          10
			String s2 = AppboyNotificationUtils.getOptionalStringResource(((Resources) (bundle)), k1, "HH:mm");
	//   67  134:aload_1         
	//   68  135:iload           9
	//   69  137:ldc1            #84  <String "HH:mm">
	//   70  139:invokestatic    #90  <Method String AppboyNotificationUtils.getOptionalStringResource(Resources, int, String)>
	//   71  142:astore          12
			s = AppboyNotificationUtils.getOptionalStringResource(((Resources) (bundle)), l1, "h:mm a");
	//   72  144:aload_1         
	//   73  145:iload           10
	//   74  147:ldc1            #92  <String "h:mm a">
	//   75  149:invokestatic    #90  <Method String AppboyNotificationUtils.getOptionalStringResource(Resources, int, String)>
	//   76  152:astore          11
			if(j != 0 && k != 0 && l != 0 && i1 != 0 && j1 != 0)
	//*  77  154:iload           4
	//*  78  156:ifeq            382
	//*  79  159:iload           5
	//*  80  161:ifeq            382
	//*  81  164:iload           6
	//*  82  166:ifeq            382
	//*  83  169:iload           7
	//*  84  171:ifeq            382
	//*  85  174:iload           8
	//*  86  176:ifne            182
	//*  87  179:goto            382
			{
				AppboyLogger.d(TAG, "Using RemoteViews for rendering of push notification.");
	//   88  182:getstatic       #40  <Field String TAG>
	//   89  185:ldc1            #94  <String "Using RemoteViews for rendering of push notification.">
	//   90  187:invokestatic    #98  <Method int AppboyLogger.d(String, String)>
	//   91  190:pop             
				try
				{
					bundle = ((Bundle) (new RemoteViews(PackageUtils.getResourcePackageName(context), j)));
	//   92  191:new             #100 <Class RemoteViews>
	//   93  194:dup             
	//   94  195:aload_0         
	//   95  196:invokestatic    #70  <Method String PackageUtils.getResourcePackageName(Context)>
	//   96  199:iload           4
	//   97  201:invokespecial   #103 <Method void RemoteViews(String, int)>
	//   98  204:astore_1        
				}
	//*  99  205:goto            267
				// Misplaced declaration of an exception variable
				catch(Bundle bundle)
	//* 100  208:astore_1        
				{
					String s5 = TAG;
	//  101  209:getstatic       #40  <Field String TAG>
	//  102  212:astore          15
					StringBuilder stringbuilder1 = new StringBuilder();
	//  103  214:new             #105 <Class StringBuilder>
	//  104  217:dup             
	//  105  218:invokespecial   #106 <Method void StringBuilder()>
	//  106  221:astore          16
					stringbuilder1.append("Failed to initialize remote views with package ");
	//  107  223:aload           16
	//  108  225:ldc1            #108 <String "Failed to initialize remote views with package ">
	//  109  227:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  110  230:pop             
					stringbuilder1.append(PackageUtils.getResourcePackageName(context));
	//  111  231:aload           16
	//  112  233:aload_0         
	//  113  234:invokestatic    #70  <Method String PackageUtils.getResourcePackageName(Context)>
	//  114  237:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  115  240:pop             
					AppboyLogger.e(s5, stringbuilder1.toString(), ((Throwable) (bundle)));
	//  116  241:aload           15
	//  117  243:aload           16
	//  118  245:invokevirtual   #116 <Method String StringBuilder.toString()>
	//  119  248:aload_1         
	//  120  249:invokestatic    #120 <Method int AppboyLogger.e(String, String, Throwable)>
	//  121  252:pop             
					try
					{
						bundle = ((Bundle) (new RemoteViews(context.getPackageName(), j)));
	//  122  253:new             #100 <Class RemoteViews>
	//  123  256:dup             
	//  124  257:aload_0         
	//  125  258:invokevirtual   #123 <Method String Context.getPackageName()>
	//  126  261:iload           4
	//  127  263:invokespecial   #103 <Method void RemoteViews(String, int)>
	//  128  266:astore_1        
					}
	//* 129  267:aload_1         
	//* 130  268:iload           5
	//* 131  270:aload           13
	//* 132  272:invokevirtual   #127 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 133  275:aload_1         
	//* 134  276:iload           6
	//* 135  278:aload           14
	//* 136  280:invokevirtual   #127 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 137  283:iload_3         
	//* 138  284:ifeq            294
	//* 139  287:aload_1         
	//* 140  288:iload           7
	//* 141  290:iload_2         
	//* 142  291:invokevirtual   #131 <Method void RemoteViews.setImageViewResource(int, int)>
	//* 143  294:aload_0         
	//* 144  295:invokestatic    #137 <Method boolean DateFormat.is24HourFormat(Context)>
	//* 145  298:ifeq            305
	//* 146  301:aload           12
	//* 147  303:astore          11
	//* 148  305:aload_1         
	//* 149  306:iload           8
	//* 150  308:new             #139 <Class SimpleDateFormat>
	//* 151  311:dup             
	//* 152  312:aload           11
	//* 153  314:invokestatic    #145 <Method Locale Locale.getDefault()>
	//* 154  317:invokespecial   #148 <Method void SimpleDateFormat(String, Locale)>
	//* 155  320:new             #150 <Class Date>
	//* 156  323:dup             
	//* 157  324:invokespecial   #151 <Method void Date()>
	//* 158  327:invokevirtual   #155 <Method String SimpleDateFormat.format(Date)>
	//* 159  330:invokevirtual   #127 <Method void RemoteViews.setTextViewText(int, CharSequence)>
	//* 160  333:aload_1         
	//* 161  334:areturn         
					// Misplaced declaration of an exception variable
					catch(Bundle bundle)
	//* 162  335:astore_1        
					{
						String s1 = TAG;
	//  163  336:getstatic       #40  <Field String TAG>
	//  164  339:astore          11
						StringBuilder stringbuilder = new StringBuilder();
	//  165  341:new             #105 <Class StringBuilder>
	//  166  344:dup             
	//  167  345:invokespecial   #106 <Method void StringBuilder()>
	//  168  348:astore          12
						stringbuilder.append("Failed to initialize remote views with package ");
	//  169  350:aload           12
	//  170  352:ldc1            #108 <String "Failed to initialize remote views with package ">
	//  171  354:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  172  357:pop             
						stringbuilder.append(context.getPackageName());
	//  173  358:aload           12
	//  174  360:aload_0         
	//  175  361:invokevirtual   #123 <Method String Context.getPackageName()>
	//  176  364:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  177  367:pop             
						AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (bundle)));
	//  178  368:aload           11
	//  179  370:aload           12
	//  180  372:invokevirtual   #116 <Method String StringBuilder.toString()>
	//  181  375:aload_1         
	//  182  376:invokestatic    #120 <Method int AppboyLogger.e(String, String, Throwable)>
	//  183  379:pop             
						return null;
	//  184  380:aconst_null     
	//  185  381:areturn         
					}
				}
				((RemoteViews) (bundle)).setTextViewText(k, ((CharSequence) (s3)));
				((RemoteViews) (bundle)).setTextViewText(l, ((CharSequence) (s4)));
				if(flag)
					((RemoteViews) (bundle)).setImageViewResource(i1, i);
				if(DateFormat.is24HourFormat(context))
					s = s2;
				((RemoteViews) (bundle)).setTextViewText(j1, ((CharSequence) ((new SimpleDateFormat(s, Locale.getDefault())).format(new Date()))));
				return ((RemoteViews) (bundle));
			}
			context = ((Context) (TAG));
	//  186  382:getstatic       #40  <Field String TAG>
	//  187  385:astore_0        
			bundle = ((Bundle) (new StringBuilder()));
	//  188  386:new             #105 <Class StringBuilder>
	//  189  389:dup             
	//  190  390:invokespecial   #106 <Method void StringBuilder()>
	//  191  393:astore_1        
			((StringBuilder) (bundle)).append("Couldn't find all resource IDs for custom notification view, extended view will not be used for push notifications. Received ");
	//  192  394:aload_1         
	//  193  395:ldc1            #157 <String "Couldn't find all resource IDs for custom notification view, extended view will not be used for push notifications. Received ">
	//  194  397:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  195  400:pop             
			((StringBuilder) (bundle)).append(j);
	//  196  401:aload_1         
	//  197  402:iload           4
	//  198  404:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//  199  407:pop             
			((StringBuilder) (bundle)).append(" for layout, ");
	//  200  408:aload_1         
	//  201  409:ldc1            #162 <String " for layout, ">
	//  202  411:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  203  414:pop             
			((StringBuilder) (bundle)).append(k);
	//  204  415:aload_1         
	//  205  416:iload           5
	//  206  418:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//  207  421:pop             
			((StringBuilder) (bundle)).append(" for title, ");
	//  208  422:aload_1         
	//  209  423:ldc1            #164 <String " for title, ">
	//  210  425:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  211  428:pop             
			((StringBuilder) (bundle)).append(l);
	//  212  429:aload_1         
	//  213  430:iload           6
	//  214  432:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//  215  435:pop             
			((StringBuilder) (bundle)).append(" for content, ");
	//  216  436:aload_1         
	//  217  437:ldc1            #166 <String " for content, ">
	//  218  439:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  219  442:pop             
			((StringBuilder) (bundle)).append(i1);
	//  220  443:aload_1         
	//  221  444:iload           7
	//  222  446:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//  223  449:pop             
			((StringBuilder) (bundle)).append(" for icon, and ");
	//  224  450:aload_1         
	//  225  451:ldc1            #168 <String " for icon, and ">
	//  226  453:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  227  456:pop             
			((StringBuilder) (bundle)).append(j1);
	//  228  457:aload_1         
	//  229  458:iload           8
	//  230  460:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//  231  463:pop             
			((StringBuilder) (bundle)).append(" for time.");
	//  232  464:aload_1         
	//  233  465:ldc1            #170 <String " for time.">
	//  234  467:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  235  470:pop             
			AppboyLogger.w(((String) (context)), ((StringBuilder) (bundle)).toString());
	//  236  471:aload_0         
	//  237  472:aload_1         
	//  238  473:invokevirtual   #116 <Method String StringBuilder.toString()>
	//  239  476:invokestatic    #173 <Method int AppboyLogger.w(String, String)>
	//  240  479:pop             
		}
		return null;
	//  241  480:aconst_null     
	//  242  481:areturn         
	}

	public static final String APPBOY_NOTIFICATION_CONTENT_ID = "com_appboy_notification_content";
	public static final String APPBOY_NOTIFICATION_ICON_ID = "com_appboy_notification_icon";
	public static final String APPBOY_NOTIFICATION_ID = "com_appboy_notification";
	public static final String APPBOY_NOTIFICATION_ID_NO_ICON = "com_appboy_notification_no_icon";
	public static final String APPBOY_NOTIFICATION_TIME_ID = "com_appboy_notification_time";
	public static final String APPBOY_NOTIFICATION_TITLE_ID = "com_appboy_notification_title";
	public static final String APPBOY_NOTIFICATION_TWELVE_HOUR_FORTMAT_ID = "com_appboy_notification_time_twelve_hour_format";
	public static final String APPBOY_NOTIFICATION_TWENTY_FOUR_HOUR_FORMAT_ID = "com_appboy_notification_time_twenty_four_hour_format";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/push/AppboyNotificationRemoteViewsUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyNotificationRemoteViewsUtils>
	//    1    2:invokestatic    #38  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #40  <Field String TAG>
	//*   3    8:return          
	}
}
