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
import android.content.ClipboardManager;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
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
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import java.util.HashMap;

// Referenced classes of package android.support.v4.content:
//			ContextCompat

private static final class ContextCompat$LegacyServiceMapHolder
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

	private ContextCompat$LegacyServiceMapHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #235 <Method void Object()>
	//    2    4:return          
	}
}
