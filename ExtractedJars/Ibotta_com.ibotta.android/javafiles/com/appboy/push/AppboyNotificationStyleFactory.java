// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import com.appboy.Appboy;
import com.appboy.IAppboyImageLoader;
import com.appboy.enums.AppboyViewBounds;
import com.appboy.support.*;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.appboy.push:
//			AppboyNotificationRoutingActivity, AppboyNotificationUtils, AppboyNotificationActionUtils

public class AppboyNotificationStyleFactory
{

	public AppboyNotificationStyleFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void Object()>
	//    2    4:return          
	}

	private static PendingIntent createStoryPageClickedPendingIntent(Context context, String s, String s1, String s2, String s3)
	{
		Intent intent = (new Intent("com.appboy.action.APPBOY_STORY_CLICKED")).setClass(context, com/appboy/push/AppboyNotificationRoutingActivity);
	//    0    0:new             #88  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #90  <String "com.appboy.action.APPBOY_STORY_CLICKED">
	//    3    6:invokespecial   #93  <Method void Intent(String)>
	//    4    9:aload_0         
	//    5   10:ldc1            #95  <Class AppboyNotificationRoutingActivity>
	//    6   12:invokevirtual   #99  <Method Intent Intent.setClass(Context, Class)>
	//    7   15:astore          5
		intent.putExtra("appboy_action_uri", s);
	//    8   17:aload           5
	//    9   19:ldc1            #101 <String "appboy_action_uri">
	//   10   21:aload_1         
	//   11   22:invokevirtual   #105 <Method Intent Intent.putExtra(String, String)>
	//   12   25:pop             
		intent.putExtra("appboy_action_use_webview", s1);
	//   13   26:aload           5
	//   14   28:ldc1            #107 <String "appboy_action_use_webview">
	//   15   30:aload_2         
	//   16   31:invokevirtual   #105 <Method Intent Intent.putExtra(String, String)>
	//   17   34:pop             
		intent.putExtra("appboy_story_page_id", s2);
	//   18   35:aload           5
	//   19   37:ldc1            #109 <String "appboy_story_page_id">
	//   20   39:aload_3         
	//   21   40:invokevirtual   #105 <Method Intent Intent.putExtra(String, String)>
	//   22   43:pop             
		intent.putExtra("appboy_campaign_id", s3);
	//   23   44:aload           5
	//   24   46:ldc1            #111 <String "appboy_campaign_id">
	//   25   48:aload           4
	//   26   50:invokevirtual   #105 <Method Intent Intent.putExtra(String, String)>
	//   27   53:pop             
		return PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 0x40000000);
	//   28   54:aload_0         
	//   29   55:invokestatic    #117 <Method int IntentUtils.getRequestCode()>
	//   30   58:aload           5
	//   31   60:ldc1            #118 <Int 0x40000000>
	//   32   62:invokestatic    #124 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//   33   65:areturn         
	}

	private static PendingIntent createStoryTraversedPendingIntent(Context context, Bundle bundle, int i)
	{
		Intent intent = (new Intent("com.appboy.action.STORY_TRAVERSE")).setClass(context, AppboyNotificationUtils.getNotificationReceiverClass());
	//    0    0:new             #88  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #128 <String "com.appboy.action.STORY_TRAVERSE">
	//    3    6:invokespecial   #93  <Method void Intent(String)>
	//    4    9:aload_0         
	//    5   10:invokestatic    #134 <Method Class AppboyNotificationUtils.getNotificationReceiverClass()>
	//    6   13:invokevirtual   #99  <Method Intent Intent.setClass(Context, Class)>
	//    7   16:astore_3        
		if(bundle != null)
	//*   8   17:aload_1         
	//*   9   18:ifnull          34
		{
			bundle.putInt("appboy_story_index", i);
	//   10   21:aload_1         
	//   11   22:ldc1            #136 <String "appboy_story_index">
	//   12   24:iload_2         
	//   13   25:invokevirtual   #142 <Method void Bundle.putInt(String, int)>
			intent.putExtras(bundle);
	//   14   28:aload_3         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #146 <Method Intent Intent.putExtras(Bundle)>
	//   17   33:pop             
		}
		return PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, 0x40000000);
	//   18   34:aload_0         
	//   19   35:invokestatic    #117 <Method int IntentUtils.getRequestCode()>
	//   20   38:aload_3         
	//   21   39:ldc1            #118 <Int 0x40000000>
	//   22   41:invokestatic    #149 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   23   44:areturn         
	}

	public static android.support.v4.app.NotificationCompat.Style getBigNotificationStyle(Context context, Bundle bundle, Bundle bundle1, android.support.v4.app.NotificationCompat.Builder builder)
	{
		if(bundle.containsKey("ab_c"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #153 <String "ab_c">
	//*   2    3:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//*   3    6:ifeq            28
		{
			AppboyLogger.d(TAG, "Rendering push notification with DecoratedCustomViewStyle (Story)");
	//    4    9:getstatic       #39  <Field String TAG>
	//    5   12:ldc1            #159 <String "Rendering push notification with DecoratedCustomViewStyle (Story)">
	//    6   14:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//    7   17:pop             
			context = ((Context) (getStoryStyle(context, bundle, builder)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_3         
	//   11   21:invokestatic    #167 <Method android.support.v4.app.NotificationCompat$DecoratedCustomViewStyle getStoryStyle(Context, Bundle, android.support.v4.app.NotificationCompat$Builder)>
	//   12   24:astore_0        
		} else
	//*  13   25:goto            62
		if(bundle1 != null && bundle1.containsKey("appboy_image_url"))
	//*  14   28:aload_2         
	//*  15   29:ifnull          60
	//*  16   32:aload_2         
	//*  17   33:ldc1            #169 <String "appboy_image_url">
	//*  18   35:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//*  19   38:ifeq            60
		{
			AppboyLogger.d(TAG, "Rendering push notification with BigPictureStyle");
	//   20   41:getstatic       #39  <Field String TAG>
	//   21   44:ldc1            #171 <String "Rendering push notification with BigPictureStyle">
	//   22   46:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//   23   49:pop             
			context = ((Context) (getBigPictureNotificationStyle(context, bundle, bundle1)));
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokestatic    #175 <Method android.support.v4.app.NotificationCompat$BigPictureStyle getBigPictureNotificationStyle(Context, Bundle, Bundle)>
	//   28   56:astore_0        
		} else
	//*  29   57:goto            62
		{
			context = null;
	//   30   60:aconst_null     
	//   31   61:astore_0        
		}
		bundle1 = ((Bundle) (context));
	//   32   62:aload_0         
	//   33   63:astore_2        
		if(context == null)
	//*  34   64:aload_0         
	//*  35   65:ifnonnull       82
		{
			AppboyLogger.d(TAG, "Rendering push notification with BigTextStyle");
	//   36   68:getstatic       #39  <Field String TAG>
	//   37   71:ldc1            #177 <String "Rendering push notification with BigTextStyle">
	//   38   73:invokestatic    #163 <Method int AppboyLogger.d(String, String)>
	//   39   76:pop             
			bundle1 = ((Bundle) (getBigTextNotificationStyle(bundle)));
	//   40   77:aload_1         
	//   41   78:invokestatic    #181 <Method android.support.v4.app.NotificationCompat$BigTextStyle getBigTextNotificationStyle(Bundle)>
	//   42   81:astore_2        
		}
		return ((android.support.v4.app.NotificationCompat.Style) (bundle1));
	//   43   82:aload_2         
	//   44   83:areturn         
	}

	public static android.support.v4.app.NotificationCompat.BigPictureStyle getBigPictureNotificationStyle(Context context, Bundle bundle, Bundle bundle1)
	{
		Bitmap bitmap;
		if(bundle1 == null)
			break MISSING_BLOCK_LABEL_184;
	//    0    0:aload_2         
	//    1    1:ifnull          184
		if(!bundle1.containsKey("appboy_image_url"))
	//*   2    4:aload_2         
	//*   3    5:ldc1            #169 <String "appboy_image_url">
	//*   4    7:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//*   5   10:ifne            15
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
		bundle1 = ((Bundle) (bundle1.getString("appboy_image_url")));
	//    8   15:aload_2         
	//    9   16:ldc1            #169 <String "appboy_image_url">
	//   10   18:invokevirtual   #187 <Method String Bundle.getString(String)>
	//   11   21:astore_2        
		if(StringUtils.isNullOrBlank(((String) (bundle1))))
	//*  12   22:aload_2         
	//*  13   23:invokestatic    #192 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  14   26:ifeq            31
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
		bitmap = AppboyImageUtils.getBitmap(context, Uri.parse(((String) (bundle1))), AppboyViewBounds.NOTIFICATION_EXPANDED_IMAGE);
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:invokestatic    #198 <Method Uri Uri.parse(String)>
	//   20   36:getstatic       #204 <Field AppboyViewBounds AppboyViewBounds.NOTIFICATION_EXPANDED_IMAGE>
	//   21   39:invokestatic    #210 <Method Bitmap AppboyImageUtils.getBitmap(Context, Uri, AppboyViewBounds)>
	//   22   42:astore          6
		if(bitmap == null)
	//*  23   44:aload           6
	//*  24   46:ifnonnull       51
			return null;
	//   25   49:aconst_null     
	//   26   50:areturn         
		bundle1 = ((Bundle) (bitmap));
	//   27   51:aload           6
	//   28   53:astore_2        
		int k;
		if(bitmap.getWidth() <= bitmap.getHeight())
			break MISSING_BLOCK_LABEL_134;
	//   29   54:aload           6
	//   30   56:invokevirtual   #215 <Method int Bitmap.getWidth()>
	//   31   59:aload           6
	//   32   61:invokevirtual   #218 <Method int Bitmap.getHeight()>
	//   33   64:icmple          134
		context = ((Context) (AppboyImageUtils.getDefaultScreenDisplayMetrics(context)));
	//   34   67:aload_0         
	//   35   68:invokestatic    #222 <Method DisplayMetrics AppboyImageUtils.getDefaultScreenDisplayMetrics(Context)>
	//   36   71:astore_0        
		k = AppboyImageUtils.getPixelsFromDensityAndDp(((DisplayMetrics) (context)).densityDpi, 192);
	//   37   72:aload_0         
	//   38   73:getfield        #227 <Field int DisplayMetrics.densityDpi>
	//   39   76:sipush          192
	//   40   79:invokestatic    #231 <Method int AppboyImageUtils.getPixelsFromDensityAndDp(int, int)>
	//   41   82:istore          5
		int j = k * 2;
	//   42   84:iload           5
	//   43   86:iconst_2        
	//   44   87:imul            
	//   45   88:istore          4
		int i = j;
	//   46   90:iload           4
	//   47   92:istore_3        
		try
		{
			if(j > ((DisplayMetrics) (context)).widthPixels)
	//*  48   93:iload           4
	//*  49   95:aload_0         
	//*  50   96:getfield        #234 <Field int DisplayMetrics.widthPixels>
	//*  51   99:icmple          107
				i = ((DisplayMetrics) (context)).widthPixels;
	//   52  102:aload_0         
	//   53  103:getfield        #234 <Field int DisplayMetrics.widthPixels>
	//   54  106:istore_3        
		}
	//*  55  107:aload           6
	//*  56  109:iload_3         
	//*  57  110:iload           5
	//*  58  112:iconst_1        
	//*  59  113:invokestatic    #238 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//*  60  116:astore_2        
	//*  61  117:goto            134
	//*  62  120:astore_0        
	//*  63  121:getstatic       #39  <Field String TAG>
	//*  64  124:ldc1            #240 <String "Failed to scale image bitmap, using original.">
	//*  65  126:aload_0         
	//*  66  127:invokestatic    #244 <Method int AppboyLogger.e(String, String, Throwable)>
	//*  67  130:pop             
	//*  68  131:aload           6
	//*  69  133:astore_2        
	//*  70  134:aload_2         
	//*  71  135:ifnonnull       149
	//*  72  138:getstatic       #39  <Field String TAG>
	//*  73  141:ldc1            #246 <String "Bitmap download failed for push notification. No image will be included with the notification.">
	//*  74  143:invokestatic    #249 <Method int AppboyLogger.i(String, String)>
	//*  75  146:pop             
	//*  76  147:aconst_null     
	//*  77  148:areturn         
	//*  78  149:new             #251 <Class android.support.v4.app.NotificationCompat$BigPictureStyle>
	//*  79  152:dup             
	//*  80  153:invokespecial   #252 <Method void android.support.v4.app.NotificationCompat$BigPictureStyle()>
	//*  81  156:astore_0        
	//*  82  157:aload_0         
	//*  83  158:aload_2         
	//*  84  159:invokevirtual   #256 <Method android.support.v4.app.NotificationCompat$BigPictureStyle android.support.v4.app.NotificationCompat$BigPictureStyle.bigPicture(Bitmap)>
	//*  85  162:pop             
	//*  86  163:aload_0         
	//*  87  164:aload_1         
	//*  88  165:invokestatic    #260 <Method void setBigPictureSummaryAndTitle(android.support.v4.app.NotificationCompat$BigPictureStyle, Bundle)>
	//*  89  168:aload_0         
	//*  90  169:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  91  170:astore_0        
		{
			AppboyLogger.e(TAG, "Failed to create Big Picture Style.", ((Throwable) (context)));
	//   92  171:getstatic       #39  <Field String TAG>
	//   93  174:ldc2            #262 <String "Failed to create Big Picture Style.">
	//   94  177:aload_0         
	//   95  178:invokestatic    #244 <Method int AppboyLogger.e(String, String, Throwable)>
	//   96  181:pop             
			return null;
	//   97  182:aconst_null     
	//   98  183:areturn         
		}
		try
		{
			bundle1 = ((Bundle) (Bitmap.createScaledBitmap(bitmap, i, k, true)));
			break MISSING_BLOCK_LABEL_134;
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
		AppboyLogger.e(TAG, "Failed to scale image bitmap, using original.", ((Throwable) (context)));
		bundle1 = ((Bundle) (bitmap));
		if(bundle1 != null)
			break MISSING_BLOCK_LABEL_149;
		AppboyLogger.i(TAG, "Bitmap download failed for push notification. No image will be included with the notification.");
		return null;
		context = ((Context) (new android.support.v4.app.NotificationCompat.BigPictureStyle()));
		((android.support.v4.app.NotificationCompat.BigPictureStyle) (context)).bigPicture(((Bitmap) (bundle1)));
		setBigPictureSummaryAndTitle(((android.support.v4.app.NotificationCompat.BigPictureStyle) (context)), bundle);
		return ((android.support.v4.app.NotificationCompat.BigPictureStyle) (context));
		return null;
	//   99  184:aconst_null     
	//  100  185:areturn         
	}

	public static android.support.v4.app.NotificationCompat.BigTextStyle getBigTextNotificationStyle(Bundle bundle)
	{
		String s1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(bundle != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          89
		{
			android.support.v4.app.NotificationCompat.BigTextStyle bigtextstyle = new android.support.v4.app.NotificationCompat.BigTextStyle();
	//    4    6:new             #264 <Class android.support.v4.app.NotificationCompat$BigTextStyle>
	//    5    9:dup             
	//    6   10:invokespecial   #265 <Method void android.support.v4.app.NotificationCompat$BigTextStyle()>
	//    7   13:astore_3        
			bigtextstyle.bigText(((CharSequence) (bundle.getString("a"))));
	//    8   14:aload_3         
	//    9   15:aload_0         
	//   10   16:ldc2            #267 <String "a">
	//   11   19:invokevirtual   #187 <Method String Bundle.getString(String)>
	//   12   22:invokevirtual   #271 <Method android.support.v4.app.NotificationCompat$BigTextStyle android.support.v4.app.NotificationCompat$BigTextStyle.bigText(CharSequence)>
	//   13   25:pop             
			String s;
			if(bundle.containsKey("ab_bs"))
	//*  14   26:aload_0         
	//*  15   27:ldc2            #273 <String "ab_bs">
	//*  16   30:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//*  17   33:ifeq            47
				s = bundle.getString("ab_bs");
	//   18   36:aload_0         
	//   19   37:ldc2            #273 <String "ab_bs">
	//   20   40:invokevirtual   #187 <Method String Bundle.getString(String)>
	//   21   43:astore_1        
			else
	//*  22   44:goto            49
				s = null;
	//   23   47:aconst_null     
	//   24   48:astore_1        
			if(bundle.containsKey("ab_bt"))
	//*  25   49:aload_0         
	//*  26   50:ldc2            #275 <String "ab_bt">
	//*  27   53:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//*  28   56:ifeq            67
				s1 = bundle.getString("ab_bt");
	//   29   59:aload_0         
	//   30   60:ldc2            #275 <String "ab_bt">
	//   31   63:invokevirtual   #187 <Method String Bundle.getString(String)>
	//   32   66:astore_2        
			if(s != null)
	//*  33   67:aload_1         
	//*  34   68:ifnull          77
				bigtextstyle.setSummaryText(((CharSequence) (s)));
	//   35   71:aload_3         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #278 <Method android.support.v4.app.NotificationCompat$BigTextStyle android.support.v4.app.NotificationCompat$BigTextStyle.setSummaryText(CharSequence)>
	//   38   76:pop             
			if(s1 != null)
	//*  39   77:aload_2         
	//*  40   78:ifnull          87
				bigtextstyle.setBigContentTitle(((CharSequence) (s1)));
	//   41   81:aload_3         
	//   42   82:aload_2         
	//   43   83:invokevirtual   #281 <Method android.support.v4.app.NotificationCompat$BigTextStyle android.support.v4.app.NotificationCompat$BigTextStyle.setBigContentTitle(CharSequence)>
	//   44   86:pop             
			return bigtextstyle;
	//   45   87:aload_3         
	//   46   88:areturn         
		} else
		{
			return null;
	//   47   89:aconst_null     
	//   48   90:areturn         
		}
	}

	static int getPushStoryPageCount(Bundle bundle)
	{
		int i;
		for(i = 0; pushStoryPageExistsForIndex(bundle, i); i++);
	//    0    0:iconst_0        
	//    1    1:istore_1        
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:invokestatic    #288 <Method boolean pushStoryPageExistsForIndex(Bundle, int)>
	//    5    7:ifeq            17
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:iadd            
	//    9   13:istore_1        
	//*  10   14:goto            2
		return i;
	//   11   17:iload_1         
	//   12   18:ireturn         
	}

	static int getPushStoryPageIndex(Bundle bundle)
	{
		if(!bundle.containsKey("appboy_story_index"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #136 <String "appboy_story_index">
	//*   2    3:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//*   3    6:ifne            11
			return 0;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		else
			return bundle.getInt("appboy_story_index");
	//    6   11:aload_0         
	//    7   12:ldc1            #136 <String "appboy_story_index">
	//    8   14:invokevirtual   #294 <Method int Bundle.getInt(String)>
	//    9   17:ireturn         
	}

	public static android.support.v4.app.NotificationCompat.DecoratedCustomViewStyle getStoryStyle(Context context, Bundle bundle, android.support.v4.app.NotificationCompat.Builder builder)
	{
		android.support.v4.app.NotificationCompat.DecoratedCustomViewStyle decoratedcustomviewstyle = new android.support.v4.app.NotificationCompat.DecoratedCustomViewStyle();
	//    0    0:new             #296 <Class android.support.v4.app.NotificationCompat$DecoratedCustomViewStyle>
	//    1    3:dup             
	//    2    4:invokespecial   #297 <Method void android.support.v4.app.NotificationCompat$DecoratedCustomViewStyle()>
	//    3    7:astore          5
		int i = getPushStoryPageCount(bundle);
	//    4    9:aload_1         
	//    5   10:invokestatic    #299 <Method int getPushStoryPageCount(Bundle)>
	//    6   13:istore_3        
		int j = getPushStoryPageIndex(bundle);
	//    7   14:aload_1         
	//    8   15:invokestatic    #301 <Method int getPushStoryPageIndex(Bundle)>
	//    9   18:istore          4
		RemoteViews remoteviews = new RemoteViews(context.getPackageName(), com.appboy.ui.R.layout.com_appboy_notification_story_one_image);
	//   10   20:new             #303 <Class RemoteViews>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokevirtual   #309 <Method String Context.getPackageName()>
	//   14   28:getstatic       #314 <Field int com.appboy.ui.R$layout.com_appboy_notification_story_one_image>
	//   15   31:invokespecial   #316 <Method void RemoteViews(String, int)>
	//   16   34:astore          6
		if(!populatePushStoryPage(remoteviews, context, bundle, j))
	//*  17   36:aload           6
	//*  18   38:aload_0         
	//*  19   39:aload_1         
	//*  20   40:iload           4
	//*  21   42:invokestatic    #320 <Method boolean populatePushStoryPage(RemoteViews, Context, Bundle, int)>
	//*  22   45:ifne            60
		{
			AppboyLogger.w(TAG, "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.");
	//   23   48:getstatic       #39  <Field String TAG>
	//   24   51:ldc2            #322 <String "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.">
	//   25   54:invokestatic    #325 <Method int AppboyLogger.w(String, String)>
	//   26   57:pop             
			return null;
	//   27   58:aconst_null     
	//   28   59:areturn         
		} else
		{
			PendingIntent pendingintent = createStoryTraversedPendingIntent(context, bundle, ((j - 1) + i) % i);
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:iload           4
	//   32   64:iconst_1        
	//   33   65:isub            
	//   34   66:iload_3         
	//   35   67:iadd            
	//   36   68:iload_3         
	//   37   69:irem            
	//   38   70:invokestatic    #327 <Method PendingIntent createStoryTraversedPendingIntent(Context, Bundle, int)>
	//   39   73:astore          7
			remoteviews.setOnClickPendingIntent(com.appboy.ui.R.id.com_appboy_story_button_previous, pendingintent);
	//   40   75:aload           6
	//   41   77:getstatic       #330 <Field int com.appboy.ui.R$id.com_appboy_story_button_previous>
	//   42   80:aload           7
	//   43   82:invokevirtual   #334 <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
			context = ((Context) (createStoryTraversedPendingIntent(context, bundle, (j + 1) % i)));
	//   44   85:aload_0         
	//   45   86:aload_1         
	//   46   87:iload           4
	//   47   89:iconst_1        
	//   48   90:iadd            
	//   49   91:iload_3         
	//   50   92:irem            
	//   51   93:invokestatic    #327 <Method PendingIntent createStoryTraversedPendingIntent(Context, Bundle, int)>
	//   52   96:astore_0        
			remoteviews.setOnClickPendingIntent(com.appboy.ui.R.id.com_appboy_story_button_next, ((PendingIntent) (context)));
	//   53   97:aload           6
	//   54   99:getstatic       #337 <Field int com.appboy.ui.R$id.com_appboy_story_button_next>
	//   55  102:aload_0         
	//   56  103:invokevirtual   #334 <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
			builder.setCustomBigContentView(remoteviews);
	//   57  106:aload_2         
	//   58  107:aload           6
	//   59  109:invokevirtual   #343 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setCustomBigContentView(RemoteViews)>
	//   60  112:pop             
			builder.setOnlyAlertOnce(true);
	//   61  113:aload_2         
	//   62  114:iconst_1        
	//   63  115:invokevirtual   #347 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setOnlyAlertOnce(boolean)>
	//   64  118:pop             
			return decoratedcustomviewstyle;
	//   65  119:aload           5
	//   66  121:areturn         
		}
	}

	private static boolean populatePushStoryPage(RemoteViews remoteviews, Context context, Bundle bundle, int i)
	{
		String s = bundle.getString("cid");
	//    0    0:aload_2         
	//    1    1:ldc2            #349 <String "cid">
	//    2    4:invokevirtual   #187 <Method String Bundle.getString(String)>
	//    3    7:astore          5
		Object obj = ((Object) (AppboyNotificationActionUtils.getActionFieldAtIndex(i, bundle, "ab_c*_t")));
	//    4    9:iload_3         
	//    5   10:aload_2         
	//    6   11:ldc2            #351 <String "ab_c*_t">
	//    7   14:invokestatic    #357 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String)>
	//    8   17:astore          6
		if(!StringUtils.isNullOrBlank(((String) (obj))))
	//*   9   19:aload           6
	//*  10   21:invokestatic    #192 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  11   24:ifne            90
		{
			remoteviews.setTextViewText(STORY_FULL_VIEW_XML_IDS[0].intValue(), ((CharSequence) (obj)));
	//   12   27:aload_0         
	//   13   28:getstatic       #67  <Field Integer[] STORY_FULL_VIEW_XML_IDS>
	//   14   31:iconst_0        
	//   15   32:aaload          
	//   16   33:invokevirtual   #360 <Method int Integer.intValue()>
	//   17   36:aload           6
	//   18   38:invokevirtual   #364 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			obj = ((Object) (AppboyNotificationActionUtils.getActionFieldAtIndex(i, bundle, "ab_c*_t_j", "center")));
	//   19   41:iload_3         
	//   20   42:aload_2         
	//   21   43:ldc2            #366 <String "ab_c*_t_j">
	//   22   46:ldc1            #11  <String "center">
	//   23   48:invokestatic    #369 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String, String)>
	//   24   51:astore          6
			int j = ((Integer)GRAVITY_MAP.get(obj)).intValue();
	//   25   53:getstatic       #82  <Field Map GRAVITY_MAP>
	//   26   56:aload           6
	//   27   58:invokeinterface #373 <Method Object Map.get(Object)>
	//   28   63:checkcast       #41  <Class Integer>
	//   29   66:invokevirtual   #360 <Method int Integer.intValue()>
	//   30   69:istore          4
			remoteviews.setInt(STORY_FULL_VIEW_XML_IDS[1].intValue(), "setGravity", j);
	//   31   71:aload_0         
	//   32   72:getstatic       #67  <Field Integer[] STORY_FULL_VIEW_XML_IDS>
	//   33   75:iconst_1        
	//   34   76:aaload          
	//   35   77:invokevirtual   #360 <Method int Integer.intValue()>
	//   36   80:ldc1            #25  <String "setGravity">
	//   37   82:iload           4
	//   38   84:invokevirtual   #377 <Method void RemoteViews.setInt(int, String, int)>
		} else
	//*  39   87:goto            106
		{
			remoteviews.setInt(STORY_FULL_VIEW_XML_IDS[1].intValue(), "setVisibility", 8);
	//   40   90:aload_0         
	//   41   91:getstatic       #67  <Field Integer[] STORY_FULL_VIEW_XML_IDS>
	//   42   94:iconst_1        
	//   43   95:aaload          
	//   44   96:invokevirtual   #360 <Method int Integer.intValue()>
	//   45   99:ldc1            #28  <String "setVisibility">
	//   46  101:bipush          8
	//   47  103:invokevirtual   #377 <Method void RemoteViews.setInt(int, String, int)>
		}
		obj = ((Object) (AppboyNotificationActionUtils.getActionFieldAtIndex(i, bundle, "ab_c*_st")));
	//   48  106:iload_3         
	//   49  107:aload_2         
	//   50  108:ldc2            #379 <String "ab_c*_st">
	//   51  111:invokestatic    #357 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String)>
	//   52  114:astore          6
		if(!StringUtils.isNullOrBlank(((String) (obj))))
	//*  53  116:aload           6
	//*  54  118:invokestatic    #192 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  55  121:ifne            187
		{
			remoteviews.setTextViewText(STORY_FULL_VIEW_XML_IDS[2].intValue(), ((CharSequence) (obj)));
	//   56  124:aload_0         
	//   57  125:getstatic       #67  <Field Integer[] STORY_FULL_VIEW_XML_IDS>
	//   58  128:iconst_2        
	//   59  129:aaload          
	//   60  130:invokevirtual   #360 <Method int Integer.intValue()>
	//   61  133:aload           6
	//   62  135:invokevirtual   #364 <Method void RemoteViews.setTextViewText(int, CharSequence)>
			obj = ((Object) (AppboyNotificationActionUtils.getActionFieldAtIndex(i, bundle, "ab_c*_st_j", "center")));
	//   63  138:iload_3         
	//   64  139:aload_2         
	//   65  140:ldc2            #381 <String "ab_c*_st_j">
	//   66  143:ldc1            #11  <String "center">
	//   67  145:invokestatic    #369 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String, String)>
	//   68  148:astore          6
			int k = ((Integer)GRAVITY_MAP.get(obj)).intValue();
	//   69  150:getstatic       #82  <Field Map GRAVITY_MAP>
	//   70  153:aload           6
	//   71  155:invokeinterface #373 <Method Object Map.get(Object)>
	//   72  160:checkcast       #41  <Class Integer>
	//   73  163:invokevirtual   #360 <Method int Integer.intValue()>
	//   74  166:istore          4
			remoteviews.setInt(STORY_FULL_VIEW_XML_IDS[3].intValue(), "setGravity", k);
	//   75  168:aload_0         
	//   76  169:getstatic       #67  <Field Integer[] STORY_FULL_VIEW_XML_IDS>
	//   77  172:iconst_3        
	//   78  173:aaload          
	//   79  174:invokevirtual   #360 <Method int Integer.intValue()>
	//   80  177:ldc1            #25  <String "setGravity">
	//   81  179:iload           4
	//   82  181:invokevirtual   #377 <Method void RemoteViews.setInt(int, String, int)>
		} else
	//*  83  184:goto            203
		{
			remoteviews.setInt(STORY_FULL_VIEW_XML_IDS[3].intValue(), "setVisibility", 8);
	//   84  187:aload_0         
	//   85  188:getstatic       #67  <Field Integer[] STORY_FULL_VIEW_XML_IDS>
	//   86  191:iconst_3        
	//   87  192:aaload          
	//   88  193:invokevirtual   #360 <Method int Integer.intValue()>
	//   89  196:ldc1            #28  <String "setVisibility">
	//   90  198:bipush          8
	//   91  200:invokevirtual   #377 <Method void RemoteViews.setInt(int, String, int)>
		}
		obj = ((Object) (AppboyNotificationActionUtils.getActionFieldAtIndex(i, bundle, "ab_c*_i")));
	//   92  203:iload_3         
	//   93  204:aload_2         
	//   94  205:ldc2            #383 <String "ab_c*_i">
	//   95  208:invokestatic    #357 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String)>
	//   96  211:astore          6
		obj = ((Object) (Appboy.getInstance(context).getAppboyImageLoader().getBitmapFromUrl(context, ((String) (obj)), AppboyViewBounds.NOTIFICATION_ONE_IMAGE_STORY)));
	//   97  213:aload_1         
	//   98  214:invokestatic    #389 <Method Appboy Appboy.getInstance(Context)>
	//   99  217:invokevirtual   #393 <Method IAppboyImageLoader Appboy.getAppboyImageLoader()>
	//  100  220:aload_1         
	//  101  221:aload           6
	//  102  223:getstatic       #396 <Field AppboyViewBounds AppboyViewBounds.NOTIFICATION_ONE_IMAGE_STORY>
	//  103  226:invokeinterface #402 <Method Bitmap IAppboyImageLoader.getBitmapFromUrl(Context, String, AppboyViewBounds)>
	//  104  231:astore          6
		if(obj == null)
	//* 105  233:aload           6
	//* 106  235:ifnonnull       240
		{
			return false;
	//  107  238:iconst_0        
	//  108  239:ireturn         
		} else
		{
			remoteviews.setImageViewBitmap(STORY_FULL_VIEW_XML_IDS[4].intValue(), ((Bitmap) (obj)));
	//  109  240:aload_0         
	//  110  241:getstatic       #67  <Field Integer[] STORY_FULL_VIEW_XML_IDS>
	//  111  244:iconst_4        
	//  112  245:aaload          
	//  113  246:invokevirtual   #360 <Method int Integer.intValue()>
	//  114  249:aload           6
	//  115  251:invokevirtual   #406 <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
			obj = ((Object) (AppboyNotificationActionUtils.getActionFieldAtIndex(i, bundle, "ab_c*_id", "")));
	//  116  254:iload_3         
	//  117  255:aload_2         
	//  118  256:ldc2            #408 <String "ab_c*_id">
	//  119  259:ldc2            #410 <String "">
	//  120  262:invokestatic    #369 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String, String)>
	//  121  265:astore          6
			context = ((Context) (createStoryPageClickedPendingIntent(context, AppboyNotificationActionUtils.getActionFieldAtIndex(i, bundle, "ab_c*_uri"), AppboyNotificationActionUtils.getActionFieldAtIndex(i, bundle, "ab_c*_use_webview"), ((String) (obj)), s)));
	//  122  267:aload_1         
	//  123  268:iload_3         
	//  124  269:aload_2         
	//  125  270:ldc2            #412 <String "ab_c*_uri">
	//  126  273:invokestatic    #357 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String)>
	//  127  276:iload_3         
	//  128  277:aload_2         
	//  129  278:ldc2            #414 <String "ab_c*_use_webview">
	//  130  281:invokestatic    #357 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String)>
	//  131  284:aload           6
	//  132  286:aload           5
	//  133  288:invokestatic    #416 <Method PendingIntent createStoryPageClickedPendingIntent(Context, String, String, String, String)>
	//  134  291:astore_1        
			remoteviews.setOnClickPendingIntent(STORY_FULL_VIEW_XML_IDS[5].intValue(), ((PendingIntent) (context)));
	//  135  292:aload_0         
	//  136  293:getstatic       #67  <Field Integer[] STORY_FULL_VIEW_XML_IDS>
	//  137  296:iconst_5        
	//  138  297:aaload          
	//  139  298:invokevirtual   #360 <Method int Integer.intValue()>
	//  140  301:aload_1         
	//  141  302:invokevirtual   #334 <Method void RemoteViews.setOnClickPendingIntent(int, PendingIntent)>
			return true;
	//  142  305:iconst_1        
	//  143  306:ireturn         
		}
	}

	static boolean pushStoryPageExistsForIndex(Bundle bundle, int i)
	{
		return AppboyNotificationActionUtils.getActionFieldAtIndex(i, bundle, "ab_c*_i", ((String) (null))) != null;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:ldc2            #383 <String "ab_c*_i">
	//    3    5:aconst_null     
	//    4    6:invokestatic    #369 <Method String AppboyNotificationActionUtils.getActionFieldAtIndex(int, Bundle, String, String)>
	//    5    9:ifnull          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	static void setBigPictureSummaryAndTitle(android.support.v4.app.NotificationCompat.BigPictureStyle bigpicturestyle, Bundle bundle)
	{
		boolean flag = bundle.containsKey("ab_bs");
	//    0    0:aload_1         
	//    1    1:ldc2            #273 <String "ab_bs">
	//    2    4:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//    3    7:istore_2        
		String s1 = null;
	//    4    8:aconst_null     
	//    5    9:astore          4
		String s;
		if(flag)
	//*   6   11:iload_2         
	//*   7   12:ifeq            26
			s = bundle.getString("ab_bs");
	//    8   15:aload_1         
	//    9   16:ldc2            #273 <String "ab_bs">
	//   10   19:invokevirtual   #187 <Method String Bundle.getString(String)>
	//   11   22:astore_3        
		else
	//*  12   23:goto            28
			s = null;
	//   13   26:aconst_null     
	//   14   27:astore_3        
		if(bundle.containsKey("ab_bt"))
	//*  15   28:aload_1         
	//*  16   29:ldc2            #275 <String "ab_bt">
	//*  17   32:invokevirtual   #157 <Method boolean Bundle.containsKey(String)>
	//*  18   35:ifeq            47
			s1 = bundle.getString("ab_bt");
	//   19   38:aload_1         
	//   20   39:ldc2            #275 <String "ab_bt">
	//   21   42:invokevirtual   #187 <Method String Bundle.getString(String)>
	//   22   45:astore          4
		if(s != null)
	//*  23   47:aload_3         
	//*  24   48:ifnull          57
			bigpicturestyle.setSummaryText(((CharSequence) (s)));
	//   25   51:aload_0         
	//   26   52:aload_3         
	//   27   53:invokevirtual   #419 <Method android.support.v4.app.NotificationCompat$BigPictureStyle android.support.v4.app.NotificationCompat$BigPictureStyle.setSummaryText(CharSequence)>
	//   28   56:pop             
		if(s1 != null)
	//*  29   57:aload           4
	//*  30   59:ifnull          69
			bigpicturestyle.setBigContentTitle(((CharSequence) (s1)));
	//   31   62:aload_0         
	//   32   63:aload           4
	//   33   65:invokevirtual   #421 <Method android.support.v4.app.NotificationCompat$BigPictureStyle android.support.v4.app.NotificationCompat$BigPictureStyle.setBigContentTitle(CharSequence)>
	//   34   68:pop             
		if(bundle.getString("s") == null && s == null)
	//*  35   69:aload_1         
	//*  36   70:ldc2            #423 <String "s">
	//*  37   73:invokevirtual   #187 <Method String Bundle.getString(String)>
	//*  38   76:ifnonnull       95
	//*  39   79:aload_3         
	//*  40   80:ifnonnull       95
			bigpicturestyle.setSummaryText(((CharSequence) (bundle.getString("a"))));
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:ldc2            #267 <String "a">
	//   44   88:invokevirtual   #187 <Method String Bundle.getString(String)>
	//   45   91:invokevirtual   #419 <Method android.support.v4.app.NotificationCompat$BigPictureStyle android.support.v4.app.NotificationCompat$BigPictureStyle.setSummaryText(CharSequence)>
	//   46   94:pop             
	//   47   95:return          
	}

	public static final int BIG_PICTURE_STYLE_IMAGE_HEIGHT = 192;
	private static final String CENTER = "center";
	private static final String END = "end";
	private static final Map GRAVITY_MAP;
	private static final String START = "start";
	private static final Integer STORY_FULL_VIEW_XML_IDS[];
	private static final String STORY_SET_GRAVITY = "setGravity";
	private static final String STORY_SET_VISIBILITY = "setVisibility";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/push/AppboyNotificationStyleFactory);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyNotificationStyleFactory>
	//    1    2:invokestatic    #37  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #39  <Field String TAG>
		STORY_FULL_VIEW_XML_IDS = (new Integer[] {
			Integer.valueOf(com.appboy.ui.R.id.com_appboy_story_text_view), Integer.valueOf(com.appboy.ui.R.id.com_appboy_story_text_view_container), Integer.valueOf(com.appboy.ui.R.id.com_appboy_story_text_view_small), Integer.valueOf(com.appboy.ui.R.id.com_appboy_story_text_view_small_container), Integer.valueOf(com.appboy.ui.R.id.com_appboy_story_image_view), Integer.valueOf(com.appboy.ui.R.id.com_appboy_story_relative_layout)
		});
	//    3    8:bipush          6
	//    4   10:anewarray       Integer[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:getstatic       #46  <Field int com.appboy.ui.R$id.com_appboy_story_text_view>
	//    8   18:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//    9   21:aastore         
	//   10   22:dup             
	//   11   23:iconst_1        
	//   12   24:getstatic       #53  <Field int com.appboy.ui.R$id.com_appboy_story_text_view_container>
	//   13   27:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   14   30:aastore         
	//   15   31:dup             
	//   16   32:iconst_2        
	//   17   33:getstatic       #56  <Field int com.appboy.ui.R$id.com_appboy_story_text_view_small>
	//   18   36:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   19   39:aastore         
	//   20   40:dup             
	//   21   41:iconst_3        
	//   22   42:getstatic       #59  <Field int com.appboy.ui.R$id.com_appboy_story_text_view_small_container>
	//   23   45:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   24   48:aastore         
	//   25   49:dup             
	//   26   50:iconst_4        
	//   27   51:getstatic       #62  <Field int com.appboy.ui.R$id.com_appboy_story_image_view>
	//   28   54:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   29   57:aastore         
	//   30   58:dup             
	//   31   59:iconst_5        
	//   32   60:getstatic       #65  <Field int com.appboy.ui.R$id.com_appboy_story_relative_layout>
	//   33   63:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   34   66:aastore         
	//   35   67:putstatic       #67  <Field Integer[] STORY_FULL_VIEW_XML_IDS>
		HashMap hashmap = new HashMap();
	//   36   70:new             #69  <Class HashMap>
	//   37   73:dup             
	//   38   74:invokespecial   #72  <Method void HashMap()>
	//   39   77:astore_0        
		((Map) (hashmap)).put("start", ((Object) (Integer.valueOf(0x800003))));
	//   40   78:aload_0         
	//   41   79:ldc1            #20  <String "start">
	//   42   81:ldc1            #73  <Int 0x800003>
	//   43   83:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   44   86:invokeinterface #79  <Method Object Map.put(Object, Object)>
	//   45   91:pop             
		((Map) (hashmap)).put("center", ((Object) (Integer.valueOf(17))));
	//   46   92:aload_0         
	//   47   93:ldc1            #11  <String "center">
	//   48   95:bipush          17
	//   49   97:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   50  100:invokeinterface #79  <Method Object Map.put(Object, Object)>
	//   51  105:pop             
		((Map) (hashmap)).put("end", ((Object) (Integer.valueOf(0x800005))));
	//   52  106:aload_0         
	//   53  107:ldc1            #14  <String "end">
	//   54  109:ldc1            #80  <Int 0x800005>
	//   55  111:invokestatic    #50  <Method Integer Integer.valueOf(int)>
	//   56  114:invokeinterface #79  <Method Object Map.put(Object, Object)>
	//   57  119:pop             
		GRAVITY_MAP = ((Map) (hashmap));
	//   58  120:aload_0         
	//   59  121:putstatic       #82  <Field Map GRAVITY_MAP>
	//*  60  124:return          
	}
}
