// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.accessibilityservice.AccessibilityService;
import android.accounts.AccountManager;
import android.app.*;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.*;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import java.io.File;
import java.util.HashMap;

public class ContextCompat
{
	private static final class LegacyServiceMapHolder
	{

		static final HashMap SERVICES;

		static 
		{
			SERVICES = new HashMap();
		//    0    0:new             #14  <Class HashMap>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void HashMap()>
		//    3    7:putstatic       #19  <Field HashMap SERVICES>
			if(android.os.Build.VERSION.SDK_INT > 22)
		//*   4   10:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*   5   13:bipush          22
		//*   6   15:icmple          40
			{
				SERVICES.put(android/telephony/SubscriptionManager, "telephony_subscription_service");
		//    7   18:getstatic       #19  <Field HashMap SERVICES>
		//    8   21:ldc1            #27  <Class SubscriptionManager>
		//    9   23:ldc1            #29  <String "telephony_subscription_service">
		//   10   25:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   11   28:pop             
				SERVICES.put(android/app/usage/UsageStatsManager, "usagestats");
		//   12   29:getstatic       #19  <Field HashMap SERVICES>
		//   13   32:ldc1            #35  <Class UsageStatsManager>
		//   14   34:ldc1            #37  <String "usagestats">
		//   15   36:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   16   39:pop             
			}
			if(android.os.Build.VERSION.SDK_INT > 21)
		//*  17   40:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*  18   43:bipush          21
		//*  19   45:icmple          158
			{
				SERVICES.put(android/appwidget/AppWidgetManager, "appwidget");
		//   20   48:getstatic       #19  <Field HashMap SERVICES>
		//   21   51:ldc1            #39  <Class AppWidgetManager>
		//   22   53:ldc1            #41  <String "appwidget">
		//   23   55:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   24   58:pop             
				SERVICES.put(android/os/BatteryManager, "batterymanager");
		//   25   59:getstatic       #19  <Field HashMap SERVICES>
		//   26   62:ldc1            #43  <Class BatteryManager>
		//   27   64:ldc1            #45  <String "batterymanager">
		//   28   66:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   29   69:pop             
				SERVICES.put(android/hardware/camera2/CameraManager, "camera");
		//   30   70:getstatic       #19  <Field HashMap SERVICES>
		//   31   73:ldc1            #47  <Class CameraManager>
		//   32   75:ldc1            #49  <String "camera">
		//   33   77:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   34   80:pop             
				SERVICES.put(android/app/job/JobScheduler, "jobscheduler");
		//   35   81:getstatic       #19  <Field HashMap SERVICES>
		//   36   84:ldc1            #51  <Class JobScheduler>
		//   37   86:ldc1            #53  <String "jobscheduler">
		//   38   88:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   39   91:pop             
				SERVICES.put(android/content/pm/LauncherApps, "launcherapps");
		//   40   92:getstatic       #19  <Field HashMap SERVICES>
		//   41   95:ldc1            #55  <Class LauncherApps>
		//   42   97:ldc1            #57  <String "launcherapps">
		//   43   99:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   44  102:pop             
				SERVICES.put(android/media/projection/MediaProjectionManager, "media_projection");
		//   45  103:getstatic       #19  <Field HashMap SERVICES>
		//   46  106:ldc1            #59  <Class MediaProjectionManager>
		//   47  108:ldc1            #61  <String "media_projection">
		//   48  110:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   49  113:pop             
				SERVICES.put(android/media/session/MediaSessionManager, "media_session");
		//   50  114:getstatic       #19  <Field HashMap SERVICES>
		//   51  117:ldc1            #63  <Class MediaSessionManager>
		//   52  119:ldc1            #65  <String "media_session">
		//   53  121:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   54  124:pop             
				SERVICES.put(android/content/RestrictionsManager, "restrictions");
		//   55  125:getstatic       #19  <Field HashMap SERVICES>
		//   56  128:ldc1            #67  <Class RestrictionsManager>
		//   57  130:ldc1            #69  <String "restrictions">
		//   58  132:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   59  135:pop             
				SERVICES.put(android/telecom/TelecomManager, "telecom");
		//   60  136:getstatic       #19  <Field HashMap SERVICES>
		//   61  139:ldc1            #71  <Class TelecomManager>
		//   62  141:ldc1            #73  <String "telecom">
		//   63  143:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   64  146:pop             
				SERVICES.put(android/media/tv/TvInputManager, "tv_input");
		//   65  147:getstatic       #19  <Field HashMap SERVICES>
		//   66  150:ldc1            #75  <Class TvInputManager>
		//   67  152:ldc1            #77  <String "tv_input">
		//   68  154:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   69  157:pop             
			}
			if(android.os.Build.VERSION.SDK_INT > 19)
		//*  70  158:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*  71  161:bipush          19
		//*  72  163:icmple          210
			{
				SERVICES.put(android/app/AppOpsManager, "appops");
		//   73  166:getstatic       #19  <Field HashMap SERVICES>
		//   74  169:ldc1            #79  <Class AppOpsManager>
		//   75  171:ldc1            #81  <String "appops">
		//   76  173:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   77  176:pop             
				SERVICES.put(android/view/accessibility/CaptioningManager, "captioning");
		//   78  177:getstatic       #19  <Field HashMap SERVICES>
		//   79  180:ldc1            #83  <Class CaptioningManager>
		//   80  182:ldc1            #85  <String "captioning">
		//   81  184:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   82  187:pop             
				SERVICES.put(android/hardware/ConsumerIrManager, "consumer_ir");
		//   83  188:getstatic       #19  <Field HashMap SERVICES>
		//   84  191:ldc1            #87  <Class ConsumerIrManager>
		//   85  193:ldc1            #89  <String "consumer_ir">
		//   86  195:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   87  198:pop             
				SERVICES.put(android/print/PrintManager, "print");
		//   88  199:getstatic       #19  <Field HashMap SERVICES>
		//   89  202:ldc1            #91  <Class PrintManager>
		//   90  204:ldc1            #93  <String "print">
		//   91  206:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//   92  209:pop             
			}
			if(android.os.Build.VERSION.SDK_INT > 18)
		//*  93  210:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//*  94  213:bipush          18
		//*  95  215:icmple          229
				SERVICES.put(android/bluetooth/BluetoothManager, "bluetooth");
		//   96  218:getstatic       #19  <Field HashMap SERVICES>
		//   97  221:ldc1            #95  <Class BluetoothManager>
		//   98  223:ldc1            #97  <String "bluetooth">
		//   99  225:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  100  228:pop             
			if(android.os.Build.VERSION.SDK_INT > 17)
		//* 101  229:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//* 102  232:bipush          17
		//* 103  234:icmple          259
			{
				SERVICES.put(android/hardware/display/DisplayManager, "display");
		//  104  237:getstatic       #19  <Field HashMap SERVICES>
		//  105  240:ldc1            #99  <Class DisplayManager>
		//  106  242:ldc1            #101 <String "display">
		//  107  244:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  108  247:pop             
				SERVICES.put(android/os/UserManager, "user");
		//  109  248:getstatic       #19  <Field HashMap SERVICES>
		//  110  251:ldc1            #103 <Class UserManager>
		//  111  253:ldc1            #105 <String "user">
		//  112  255:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  113  258:pop             
			}
			if(android.os.Build.VERSION.SDK_INT > 16)
		//* 114  259:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
		//* 115  262:bipush          16
		//* 116  264:icmple          300
			{
				SERVICES.put(android/hardware/input/InputManager, "input");
		//  117  267:getstatic       #19  <Field HashMap SERVICES>
		//  118  270:ldc1            #107 <Class InputManager>
		//  119  272:ldc1            #109 <String "input">
		//  120  274:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  121  277:pop             
				SERVICES.put(android/media/MediaRouter, "media_router");
		//  122  278:getstatic       #19  <Field HashMap SERVICES>
		//  123  281:ldc1            #111 <Class MediaRouter>
		//  124  283:ldc1            #113 <String "media_router">
		//  125  285:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  126  288:pop             
				SERVICES.put(android/net/nsd/NsdManager, "servicediscovery");
		//  127  289:getstatic       #19  <Field HashMap SERVICES>
		//  128  292:ldc1            #115 <Class NsdManager>
		//  129  294:ldc1            #117 <String "servicediscovery">
		//  130  296:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  131  299:pop             
			}
			SERVICES.put(android/accessibilityservice/AccessibilityService, "accessibility");
		//  132  300:getstatic       #19  <Field HashMap SERVICES>
		//  133  303:ldc1            #119 <Class AccessibilityService>
		//  134  305:ldc1            #121 <String "accessibility">
		//  135  307:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  136  310:pop             
			SERVICES.put(android/accounts/AccountManager, "account");
		//  137  311:getstatic       #19  <Field HashMap SERVICES>
		//  138  314:ldc1            #123 <Class AccountManager>
		//  139  316:ldc1            #125 <String "account">
		//  140  318:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  141  321:pop             
			SERVICES.put(android/app/ActivityManager, "activity");
		//  142  322:getstatic       #19  <Field HashMap SERVICES>
		//  143  325:ldc1            #127 <Class ActivityManager>
		//  144  327:ldc1            #129 <String "activity">
		//  145  329:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  146  332:pop             
			SERVICES.put(android/app/AlarmManager, "alarm");
		//  147  333:getstatic       #19  <Field HashMap SERVICES>
		//  148  336:ldc1            #131 <Class AlarmManager>
		//  149  338:ldc1            #133 <String "alarm">
		//  150  340:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  151  343:pop             
			SERVICES.put(android/media/AudioManager, "audio");
		//  152  344:getstatic       #19  <Field HashMap SERVICES>
		//  153  347:ldc1            #135 <Class AudioManager>
		//  154  349:ldc1            #137 <String "audio">
		//  155  351:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  156  354:pop             
			SERVICES.put(android/content/ClipboardManager, "clipboard");
		//  157  355:getstatic       #19  <Field HashMap SERVICES>
		//  158  358:ldc1            #139 <Class ClipboardManager>
		//  159  360:ldc1            #141 <String "clipboard">
		//  160  362:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  161  365:pop             
			SERVICES.put(android/net/ConnectivityManager, "connectivity");
		//  162  366:getstatic       #19  <Field HashMap SERVICES>
		//  163  369:ldc1            #143 <Class ConnectivityManager>
		//  164  371:ldc1            #145 <String "connectivity">
		//  165  373:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  166  376:pop             
			SERVICES.put(android/app/admin/DevicePolicyManager, "device_policy");
		//  167  377:getstatic       #19  <Field HashMap SERVICES>
		//  168  380:ldc1            #147 <Class DevicePolicyManager>
		//  169  382:ldc1            #149 <String "device_policy">
		//  170  384:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  171  387:pop             
			SERVICES.put(android/app/DownloadManager, "download");
		//  172  388:getstatic       #19  <Field HashMap SERVICES>
		//  173  391:ldc1            #151 <Class DownloadManager>
		//  174  393:ldc1            #153 <String "download">
		//  175  395:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  176  398:pop             
			SERVICES.put(android/os/DropBoxManager, "dropbox");
		//  177  399:getstatic       #19  <Field HashMap SERVICES>
		//  178  402:ldc1            #155 <Class DropBoxManager>
		//  179  404:ldc1            #157 <String "dropbox">
		//  180  406:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  181  409:pop             
			SERVICES.put(android/view/inputmethod/InputMethodManager, "input_method");
		//  182  410:getstatic       #19  <Field HashMap SERVICES>
		//  183  413:ldc1            #159 <Class InputMethodManager>
		//  184  415:ldc1            #161 <String "input_method">
		//  185  417:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  186  420:pop             
			SERVICES.put(android/app/KeyguardManager, "keyguard");
		//  187  421:getstatic       #19  <Field HashMap SERVICES>
		//  188  424:ldc1            #163 <Class KeyguardManager>
		//  189  426:ldc1            #165 <String "keyguard">
		//  190  428:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  191  431:pop             
			SERVICES.put(android/view/LayoutInflater, "layout_inflater");
		//  192  432:getstatic       #19  <Field HashMap SERVICES>
		//  193  435:ldc1            #167 <Class LayoutInflater>
		//  194  437:ldc1            #169 <String "layout_inflater">
		//  195  439:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  196  442:pop             
			SERVICES.put(android/location/LocationManager, "location");
		//  197  443:getstatic       #19  <Field HashMap SERVICES>
		//  198  446:ldc1            #171 <Class LocationManager>
		//  199  448:ldc1            #173 <String "location">
		//  200  450:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  201  453:pop             
			SERVICES.put(android/nfc/NfcManager, "nfc");
		//  202  454:getstatic       #19  <Field HashMap SERVICES>
		//  203  457:ldc1            #175 <Class NfcManager>
		//  204  459:ldc1            #177 <String "nfc">
		//  205  461:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  206  464:pop             
			SERVICES.put(android/app/NotificationManager, "notification");
		//  207  465:getstatic       #19  <Field HashMap SERVICES>
		//  208  468:ldc1            #179 <Class NotificationManager>
		//  209  470:ldc1            #181 <String "notification">
		//  210  472:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  211  475:pop             
			SERVICES.put(android/os/PowerManager, "power");
		//  212  476:getstatic       #19  <Field HashMap SERVICES>
		//  213  479:ldc1            #183 <Class PowerManager>
		//  214  481:ldc1            #185 <String "power">
		//  215  483:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  216  486:pop             
			SERVICES.put(android/app/SearchManager, "search");
		//  217  487:getstatic       #19  <Field HashMap SERVICES>
		//  218  490:ldc1            #187 <Class SearchManager>
		//  219  492:ldc1            #189 <String "search">
		//  220  494:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  221  497:pop             
			SERVICES.put(android/hardware/SensorManager, "sensor");
		//  222  498:getstatic       #19  <Field HashMap SERVICES>
		//  223  501:ldc1            #191 <Class SensorManager>
		//  224  503:ldc1            #193 <String "sensor">
		//  225  505:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  226  508:pop             
			SERVICES.put(android/os/storage/StorageManager, "storage");
		//  227  509:getstatic       #19  <Field HashMap SERVICES>
		//  228  512:ldc1            #195 <Class StorageManager>
		//  229  514:ldc1            #197 <String "storage">
		//  230  516:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  231  519:pop             
			SERVICES.put(android/telephony/TelephonyManager, "phone");
		//  232  520:getstatic       #19  <Field HashMap SERVICES>
		//  233  523:ldc1            #199 <Class TelephonyManager>
		//  234  525:ldc1            #201 <String "phone">
		//  235  527:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  236  530:pop             
			SERVICES.put(android/view/textservice/TextServicesManager, "textservices");
		//  237  531:getstatic       #19  <Field HashMap SERVICES>
		//  238  534:ldc1            #203 <Class TextServicesManager>
		//  239  536:ldc1            #205 <String "textservices">
		//  240  538:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  241  541:pop             
			SERVICES.put(android/app/UiModeManager, "uimode");
		//  242  542:getstatic       #19  <Field HashMap SERVICES>
		//  243  545:ldc1            #207 <Class UiModeManager>
		//  244  547:ldc1            #209 <String "uimode">
		//  245  549:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  246  552:pop             
			SERVICES.put(android/hardware/usb/UsbManager, "usb");
		//  247  553:getstatic       #19  <Field HashMap SERVICES>
		//  248  556:ldc1            #211 <Class UsbManager>
		//  249  558:ldc1            #213 <String "usb">
		//  250  560:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  251  563:pop             
			SERVICES.put(android/os/Vibrator, "vibrator");
		//  252  564:getstatic       #19  <Field HashMap SERVICES>
		//  253  567:ldc1            #215 <Class Vibrator>
		//  254  569:ldc1            #217 <String "vibrator">
		//  255  571:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  256  574:pop             
			SERVICES.put(android/app/WallpaperManager, "wallpaper");
		//  257  575:getstatic       #19  <Field HashMap SERVICES>
		//  258  578:ldc1            #219 <Class WallpaperManager>
		//  259  580:ldc1            #221 <String "wallpaper">
		//  260  582:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  261  585:pop             
			SERVICES.put(android/net/wifi/p2p/WifiP2pManager, "wifip2p");
		//  262  586:getstatic       #19  <Field HashMap SERVICES>
		//  263  589:ldc1            #223 <Class WifiP2pManager>
		//  264  591:ldc1            #225 <String "wifip2p">
		//  265  593:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  266  596:pop             
			SERVICES.put(android/net/wifi/WifiManager, "wifi");
		//  267  597:getstatic       #19  <Field HashMap SERVICES>
		//  268  600:ldc1            #227 <Class WifiManager>
		//  269  602:ldc1            #229 <String "wifi">
		//  270  604:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  271  607:pop             
			SERVICES.put(android/view/WindowManager, "window");
		//  272  608:getstatic       #19  <Field HashMap SERVICES>
		//  273  611:ldc1            #231 <Class WindowManager>
		//  274  613:ldc1            #233 <String "window">
		//  275  615:invokevirtual   #33  <Method Object HashMap.put(Object, Object)>
		//  276  618:pop             
		//* 277  619:return          
		}

		private LegacyServiceMapHolder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #235 <Method void Object()>
		//    2    4:return          
		}
	}


	protected ContextCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	private static transient File buildPath(File file, String as[])
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int i = 0;
	//    3    3:iconst_0        
	//    4    4:istore_2        
		File file1;
		for(file1 = file; i < j; file1 = file)
	//*   5    5:aload_0         
	//*   6    6:astore          4
	//*   7    8:iload_2         
	//*   8    9:iload_3         
	//*   9   10:icmpge          66
		{
			String s = as[i];
	//   10   13:aload_1         
	//   11   14:iload_2         
	//   12   15:aaload          
	//   13   16:astore          5
			if(file1 == null)
	//*  14   18:aload           4
	//*  15   20:ifnonnull       36
			{
				file = new File(s);
	//   16   23:new             #27  <Class File>
	//   17   26:dup             
	//   18   27:aload           5
	//   19   29:invokespecial   #30  <Method void File(String)>
	//   20   32:astore_0        
			} else
	//*  21   33:goto            56
			{
				file = file1;
	//   22   36:aload           4
	//   23   38:astore_0        
				if(s != null)
	//*  24   39:aload           5
	//*  25   41:ifnull          56
					file = new File(file1, s);
	//   26   44:new             #27  <Class File>
	//   27   47:dup             
	//   28   48:aload           4
	//   29   50:aload           5
	//   30   52:invokespecial   #33  <Method void File(File, String)>
	//   31   55:astore_0        
			}
			i++;
	//   32   56:iload_2         
	//   33   57:iconst_1        
	//   34   58:iadd            
	//   35   59:istore_2        
		}

	//   36   60:aload_0         
	//   37   61:astore          4
	//*  38   63:goto            8
		return file1;
	//   39   66:aload           4
	//   40   68:areturn         
	}

	public static int checkSelfPermission(Context context, String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
			return context.checkPermission(s, Process.myPid(), Process.myUid());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #42  <Method int Process.myPid()>
	//    5    9:invokestatic    #45  <Method int Process.myUid()>
	//    6   12:invokevirtual   #51  <Method int Context.checkPermission(String, int, int)>
	//    7   15:ireturn         
		else
			throw new IllegalArgumentException("permission is null");
	//    8   16:new             #53  <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc1            #55  <String "permission is null">
	//   11   22:invokespecial   #56  <Method void IllegalArgumentException(String)>
	//   12   25:athrow          
	}

	public static Context createDeviceProtectedStorageContext(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return context.createDeviceProtectedStorageContext();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #69  <Method Context Context.createDeviceProtectedStorageContext()>
	//    5   12:areturn         
		else
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
	}

	private static File createFilesDir(File file)
	{
		android/support/v4/content/ContextCompat;
	//    0    0:ldc1            #2   <Class ContextCompat>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		if(file.exists() || file.mkdirs())
			break MISSING_BLOCK_LABEL_70;
	//    2    3:aload_0         
	//    3    4:invokevirtual   #76  <Method boolean File.exists()>
	//    4    7:ifne            70
	//    5   10:aload_0         
	//    6   11:invokevirtual   #79  <Method boolean File.mkdirs()>
	//    7   14:ifne            70
		flag = file.exists();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #76  <Method boolean File.exists()>
	//   10   21:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_31;
	//   11   22:iload_1         
	//   12   23:ifeq            31
		android/support/v4/content/ContextCompat;
	//   13   26:ldc1            #2   <Class ContextCompat>
		JVM INSTR monitorexit ;
	//   14   28:monitorexit     
		return file;
	//   15   29:aload_0         
	//   16   30:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   17   31:new             #81  <Class StringBuilder>
	//   18   34:dup             
	//   19   35:invokespecial   #82  <Method void StringBuilder()>
	//   20   38:astore_2        
		stringbuilder.append("Unable to create files subdir ");
	//   21   39:aload_2         
	//   22   40:ldc1            #84  <String "Unable to create files subdir ">
	//   23   42:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		stringbuilder.append(file.getPath());
	//   25   46:aload_2         
	//   26   47:aload_0         
	//   27   48:invokevirtual   #92  <Method String File.getPath()>
	//   28   51:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
		Log.w("ContextCompat", stringbuilder.toString());
	//   30   55:ldc1            #11  <String "ContextCompat">
	//   31   57:aload_2         
	//   32   58:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   33   61:invokestatic    #101 <Method int Log.w(String, String)>
	//   34   64:pop             
		android/support/v4/content/ContextCompat;
	//   35   65:ldc1            #2   <Class ContextCompat>
		JVM INSTR monitorexit ;
	//   36   67:monitorexit     
		return null;
	//   37   68:aconst_null     
	//   38   69:areturn         
		android/support/v4/content/ContextCompat;
	//   39   70:ldc1            #2   <Class ContextCompat>
		JVM INSTR monitorexit ;
	//   40   72:monitorexit     
		return file;
	//   41   73:aload_0         
	//   42   74:areturn         
		file;
	//   43   75:astore_0        
	//*  44   76:ldc1            #2   <Class ContextCompat>
		throw file;
	//   45   78:monitorexit     
	//   46   79:aload_0         
	//   47   80:athrow          
	}

	public static File getCodeCacheDir(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return context.getCodeCacheDir();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #106 <Method File Context.getCodeCacheDir()>
	//    5   12:areturn         
		else
			return createFilesDir(new File(context.getApplicationInfo().dataDir, "code_cache"));
	//    6   13:new             #27  <Class File>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #110 <Method ApplicationInfo Context.getApplicationInfo()>
	//   10   21:getfield        #115 <Field String ApplicationInfo.dataDir>
	//   11   24:ldc1            #117 <String "code_cache">
	//   12   26:invokespecial   #120 <Method void File(String, String)>
	//   13   29:invokestatic    #122 <Method File createFilesDir(File)>
	//   14   32:areturn         
	}

	public static int getColor(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getColor(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #129 <Method int Context.getColor(int)>
	//    6   13:ireturn         
		else
			return context.getResources().getColor(i);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #133 <Method Resources Context.getResources()>
	//    9   18:iload_1         
	//   10   19:invokevirtual   #136 <Method int Resources.getColor(int)>
	//   11   22:ireturn         
	}

	public static ColorStateList getColorStateList(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getColorStateList(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #141 <Method ColorStateList Context.getColorStateList(int)>
	//    6   13:areturn         
		else
			return context.getResources().getColorStateList(i);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #133 <Method Resources Context.getResources()>
	//    9   18:iload_1         
	//   10   19:invokevirtual   #142 <Method ColorStateList Resources.getColorStateList(int)>
	//   11   22:areturn         
	}

	public static File getDataDir(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return context.getDataDir();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #145 <Method File Context.getDataDir()>
	//    5   12:areturn         
		context = ((Context) (context.getApplicationInfo().dataDir));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #110 <Method ApplicationInfo Context.getApplicationInfo()>
	//    8   17:getfield        #115 <Field String ApplicationInfo.dataDir>
	//    9   20:astore_0        
		if(context != null)
	//*  10   21:aload_0         
	//*  11   22:ifnull          34
			return new File(((String) (context)));
	//   12   25:new             #27  <Class File>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:invokespecial   #30  <Method void File(String)>
	//   16   33:areturn         
		else
			return null;
	//   17   34:aconst_null     
	//   18   35:areturn         
	}

	public static Drawable getDrawable(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			return context.getDrawable(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #151 <Method Drawable Context.getDrawable(int)>
	//    6   13:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   14:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          16
	//*   9   19:icmplt          31
			return context.getResources().getDrawable(i);
	//   10   22:aload_0         
	//   11   23:invokevirtual   #133 <Method Resources Context.getResources()>
	//   12   26:iload_1         
	//   13   27:invokevirtual   #152 <Method Drawable Resources.getDrawable(int)>
	//   14   30:areturn         
		synchronized(sLock)
	//*  15   31:getstatic       #22  <Field Object sLock>
	//*  16   34:astore_2        
	//*  17   35:aload_2         
	//*  18   36:monitorenter    
		{
			if(sTempValue == null)
	//*  19   37:getstatic       #154 <Field TypedValue sTempValue>
	//*  20   40:ifnonnull       53
				sTempValue = new TypedValue();
	//   21   43:new             #156 <Class TypedValue>
	//   22   46:dup             
	//   23   47:invokespecial   #157 <Method void TypedValue()>
	//   24   50:putstatic       #154 <Field TypedValue sTempValue>
			context.getResources().getValue(i, sTempValue, true);
	//   25   53:aload_0         
	//   26   54:invokevirtual   #133 <Method Resources Context.getResources()>
	//   27   57:iload_1         
	//   28   58:getstatic       #154 <Field TypedValue sTempValue>
	//   29   61:iconst_1        
	//   30   62:invokevirtual   #161 <Method void Resources.getValue(int, TypedValue, boolean)>
			i = sTempValue.resourceId;
	//   31   65:getstatic       #154 <Field TypedValue sTempValue>
	//   32   68:getfield        #164 <Field int TypedValue.resourceId>
	//   33   71:istore_1        
		}
	//   34   72:aload_2         
	//   35   73:monitorexit     
		return context.getResources().getDrawable(i);
	//   36   74:aload_0         
	//   37   75:invokevirtual   #133 <Method Resources Context.getResources()>
	//   38   78:iload_1         
	//   39   79:invokevirtual   #152 <Method Drawable Resources.getDrawable(int)>
	//   40   82:areturn         
		context;
	//   41   83:astore_0        
		obj;
	//   42   84:aload_2         
		JVM INSTR monitorexit ;
	//   43   85:monitorexit     
		throw context;
	//   44   86:aload_0         
	//   45   87:athrow          
	}

	public static File[] getExternalCacheDirs(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return context.getExternalCacheDirs();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #169 <Method File[] Context.getExternalCacheDirs()>
	//    5   12:areturn         
		else
			return (new File[] {
				context.getExternalCacheDir()
			});
	//    6   13:iconst_1        
	//    7   14:anewarray       File[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_0         
	//   11   20:invokevirtual   #172 <Method File Context.getExternalCacheDir()>
	//   12   23:aastore         
	//   13   24:areturn         
	}

	public static File[] getExternalFilesDirs(Context context, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          14
			return context.getExternalFilesDirs(s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #177 <Method File[] Context.getExternalFilesDirs(String)>
	//    6   13:areturn         
		else
			return (new File[] {
				context.getExternalFilesDir(s)
			});
	//    7   14:iconst_1        
	//    8   15:anewarray       File[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokevirtual   #181 <Method File Context.getExternalFilesDir(String)>
	//   14   25:aastore         
	//   15   26:areturn         
	}

	public static File getNoBackupFilesDir(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return context.getNoBackupFilesDir();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #184 <Method File Context.getNoBackupFilesDir()>
	//    5   12:areturn         
		else
			return createFilesDir(new File(context.getApplicationInfo().dataDir, "no_backup"));
	//    6   13:new             #27  <Class File>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #110 <Method ApplicationInfo Context.getApplicationInfo()>
	//   10   21:getfield        #115 <Field String ApplicationInfo.dataDir>
	//   11   24:ldc1            #186 <String "no_backup">
	//   12   26:invokespecial   #120 <Method void File(String, String)>
	//   13   29:invokestatic    #122 <Method File createFilesDir(File)>
	//   14   32:areturn         
	}

	public static File[] getObbDirs(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return context.getObbDirs();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #189 <Method File[] Context.getObbDirs()>
	//    5   12:areturn         
		else
			return (new File[] {
				context.getObbDir()
			});
	//    6   13:iconst_1        
	//    7   14:anewarray       File[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_0         
	//   11   20:invokevirtual   #192 <Method File Context.getObbDir()>
	//   12   23:aastore         
	//   13   24:areturn         
	}

	public static Object getSystemService(Context context, Class class1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getSystemService(class1);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #197 <Method Object Context.getSystemService(Class)>
	//    6   13:areturn         
		class1 = ((Class) (getSystemServiceName(context, class1)));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokestatic    #201 <Method String getSystemServiceName(Context, Class)>
	//   10   19:astore_1        
		if(class1 != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          30
			return context.getSystemService(((String) (class1)));
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #204 <Method Object Context.getSystemService(String)>
	//   16   29:areturn         
		else
			return ((Object) (null));
	//   17   30:aconst_null     
	//   18   31:areturn         
	}

	public static String getSystemServiceName(Context context, Class class1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getSystemServiceName(class1);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #209 <Method String Context.getSystemServiceName(Class)>
	//    6   13:areturn         
		else
			return (String)LegacyServiceMapHolder.SERVICES.get(((Object) (class1)));
	//    7   14:getstatic       #213 <Field HashMap ContextCompat$LegacyServiceMapHolder.SERVICES>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #219 <Method Object HashMap.get(Object)>
	//   10   21:checkcast       #221 <Class String>
	//   11   24:areturn         
	}

	public static boolean isDeviceProtectedStorage(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return context.isDeviceProtectedStorage();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #226 <Method boolean Context.isDeviceProtectedStorage()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean startActivities(Context context, Intent aintent[])
	{
		return startActivities(context, aintent, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #231 <Method boolean startActivities(Context, Intent[], Bundle)>
	//    4    6:ireturn         
	}

	public static boolean startActivities(Context context, Intent aintent[], Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          17
			context.startActivities(aintent, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #234 <Method void Context.startActivities(Intent[], Bundle)>
		else
	//*   7   14:goto            22
			context.startActivities(aintent);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #237 <Method void Context.startActivities(Intent[])>
		return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
	}

	public static void startActivity(Context context, Intent intent, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          15
		{
			context.startActivity(intent, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #242 <Method void Context.startActivity(Intent, Bundle)>
			return;
	//    7   14:return          
		} else
		{
			context.startActivity(intent);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #245 <Method void Context.startActivity(Intent)>
			return;
	//   11   20:return          
		}
	}

	public static void startForegroundService(Context context, Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #66  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
		{
			context.startForegroundService(intent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #250 <Method android.content.ComponentName Context.startForegroundService(Intent)>
	//    6   13:pop             
			return;
	//    7   14:return          
		} else
		{
			context.startService(intent);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #253 <Method android.content.ComponentName Context.startService(Intent)>
	//   11   20:pop             
			return;
	//   12   21:return          
		}
	}

	private static final String TAG = "ContextCompat";
	private static final Object sLock = new Object();
	private static TypedValue sTempValue;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void Object()>
	//    3    7:putstatic       #22  <Field Object sLock>
	//*   4   10:return          
	}
}
