// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.PendingIntent;
import android.content.*;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.*;

// Referenced classes of package bo.app:
//			dp, bp

public class bk
{

	public bk(Context context, bp bp1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		b = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Context b>
		c = bp1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field bp c>
	//    8   14:return          
	}

	public static boolean a(Context context, AppboyConfigurationProvider appboyconfigurationprovider)
	{
		return dp.b(context) && b(context, appboyconfigurationprovider);
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method boolean dp.b(Context)>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #37  <Method boolean b(Context, AppboyConfigurationProvider)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	private static boolean b(Context context, AppboyConfigurationProvider appboyconfigurationprovider)
	{
		StringBuilder stringbuilder;
		Object obj;
		stringbuilder = new StringBuilder();
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:astore_2        
		obj = ((Object) (context.getPackageManager()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #51  <Method PackageManager Context.getPackageManager()>
	//    6   12:astore_3        
		String s = context.getPackageName();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #55  <Method String Context.getPackageName()>
	//    9   17:astore          4
		StringBuilder stringbuilder3 = new StringBuilder();
	//   10   19:new             #44  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #45  <Method void StringBuilder()>
	//   13   26:astore          5
		stringbuilder3.append(s);
	//   14   28:aload           5
	//   15   30:aload           4
	//   16   32:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder3.append(".permission.C2D_MESSAGE");
	//   18   36:aload           5
	//   19   38:ldc1            #61  <String ".permission.C2D_MESSAGE">
	//   20   40:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
		s = stringbuilder3.toString();
	//   22   44:aload           5
	//   23   46:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   24   49:astore          4
		try
		{
			((PackageManager) (obj)).getPermissionInfo(s, 4096);
	//   25   51:aload_3         
	//   26   52:aload           4
	//   27   54:sipush          4096
	//   28   57:invokevirtual   #70  <Method android.content.pm.PermissionInfo PackageManager.getPermissionInfo(String, int)>
	//   29   60:pop             
		}
	//*  30   61:goto            107
	//*  31   64:new             #44  <Class StringBuilder>
	//*  32   67:dup             
	//*  33   68:invokespecial   #45  <Method void StringBuilder()>
	//*  34   71:astore          5
	//*  35   73:aload           5
	//*  36   75:ldc1            #72  <String "The manifest does not define the ">
	//*  37   77:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  38   80:pop             
	//*  39   81:aload           5
	//*  40   83:aload           4
	//*  41   85:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  42   88:pop             
	//*  43   89:aload           5
	//*  44   91:ldc1            #74  <String " permission.">
	//*  45   93:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  46   96:pop             
	//*  47   97:aload_2         
	//*  48   98:aload           5
	//*  49  100:invokevirtual   #64  <Method String StringBuilder.toString()>
	//*  50  103:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  51  106:pop             
	//*  52  107:aload_0         
	//*  53  108:ldc1            #76  <String "android.permission.INTERNET">
	//*  54  110:invokestatic    #82  <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  55  113:ifne            126
	//*  56  116:aload_2         
	//*  57  117:ldc1            #84  <String "Missing permission. The android.permission.INTERNET permission must be set so that the Android application can send the registration ID to the 3rd party server.">
	//*  58  119:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  59  122:pop             
	//*  60  123:goto            197
	//*  61  126:aload_0         
	//*  62  127:ldc1            #86  <String "com.google.android.c2dm.permission.RECEIVE">
	//*  63  129:invokestatic    #82  <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  64  132:ifne            145
	//*  65  135:aload_2         
	//*  66  136:ldc1            #88  <String "Missing permission. The com.google.android.c2dm.permission.RECEIVE permission must be set so that the Android application can register and receive messages.">
	//*  67  138:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  68  141:pop             
	//*  69  142:goto            197
	//*  70  145:aload_0         
	//*  71  146:aload           4
	//*  72  148:invokestatic    #82  <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  73  151:ifne            197
	//*  74  154:new             #44  <Class StringBuilder>
	//*  75  157:dup             
	//*  76  158:invokespecial   #45  <Method void StringBuilder()>
	//*  77  161:astore          5
	//*  78  163:aload           5
	//*  79  165:ldc1            #90  <String "Missing permission. The ">
	//*  80  167:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  81  170:pop             
	//*  82  171:aload           5
	//*  83  173:aload           4
	//*  84  175:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  85  178:pop             
	//*  86  179:aload           5
	//*  87  181:ldc1            #92  <String " permission must be set so that ONLY this Android application can register and receive GCM messages.">
	//*  88  183:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  89  186:pop             
	//*  90  187:aload_2         
	//*  91  188:aload           5
	//*  92  190:invokevirtual   #64  <Method String StringBuilder.toString()>
	//*  93  193:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  94  196:pop             
	//*  95  197:aload_0         
	//*  96  198:ldc1            #94  <String "android.permission.GET_ACCOUNTS">
	//*  97  200:invokestatic    #82  <Method boolean PermissionUtils.hasPermission(Context, String)>
	//*  98  203:ifne            221
	//*  99  206:getstatic       #100 <Field int android.os.Build$VERSION.SDK_INT>
	//* 100  209:bipush          16
	//* 101  211:icmpge          221
	//* 102  214:aload_2         
	//* 103  215:ldc1            #102 <String "Missing permission. The android.permission.GET_ACCOUNTS permission must be set so that this pre-Jelly Bean Android device can register with the GCM server.">
	//* 104  217:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 105  220:pop             
	//* 106  221:aload_0         
	//* 107  222:ldc1            #104 <String "android.permission.WAKE_LOCK">
	//* 108  224:invokestatic    #82  <Method boolean PermissionUtils.hasPermission(Context, String)>
	//* 109  227:ifne            239
	//* 110  230:getstatic       #20  <Field String a>
	//* 111  233:ldc1            #106 <String "Missing permission. The android.permission.WAKE_LOCK permission is recommended be set so that the GCM receiver can notify users by waking the phone when a message is received.">
	//* 112  235:invokestatic    #110 <Method int AppboyLogger.i(String, String)>
	//* 113  238:pop             
	//* 114  239:new             #112 <Class ComponentName>
	//* 115  242:dup             
	//* 116  243:aload_0         
	//* 117  244:ldc1            #114 <String "com.appboy.AppboyGcmReceiver">
	//* 118  246:invokespecial   #117 <Method void ComponentName(Context, String)>
	//* 119  249:astore_0        
	//* 120  250:aload_3         
	//* 121  251:aload_0         
	//* 122  252:iconst_2        
	//* 123  253:invokevirtual   #121 <Method ActivityInfo PackageManager.getReceiverInfo(ComponentName, int)>
	//* 124  256:astore_3        
	//* 125  257:aload_3         
	//* 126  258:ifnull          268
	//* 127  261:aload_3         
	//* 128  262:getfield        #127 <Field boolean ActivityInfo.enabled>
	//* 129  265:ifne            351
	//* 130  268:new             #44  <Class StringBuilder>
	//* 131  271:dup             
	//* 132  272:invokespecial   #45  <Method void StringBuilder()>
	//* 133  275:astore_3        
	//* 134  276:aload_3         
	//* 135  277:ldc1            #129 <String "The ">
	//* 136  279:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 137  282:pop             
	//* 138  283:aload_3         
	//* 139  284:aload_0         
	//* 140  285:invokevirtual   #132 <Method String ComponentName.getClassName()>
	//* 141  288:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 142  291:pop             
	//* 143  292:aload_3         
	//* 144  293:ldc1            #134 <String " broadcast receiver is either not found or is disabled">
	//* 145  295:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 146  298:pop             
	//* 147  299:aload_2         
	//* 148  300:aload_3         
	//* 149  301:invokevirtual   #64  <Method String StringBuilder.toString()>
	//* 150  304:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 151  307:pop             
	//* 152  308:goto            351
	//* 153  311:new             #44  <Class StringBuilder>
	//* 154  314:dup             
	//* 155  315:invokespecial   #45  <Method void StringBuilder()>
	//* 156  318:astore_3        
	//* 157  319:aload_3         
	//* 158  320:ldc1            #136 <String "No ">
	//* 159  322:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 160  325:pop             
	//* 161  326:aload_3         
	//* 162  327:aload_0         
	//* 163  328:invokevirtual   #132 <Method String ComponentName.getClassName()>
	//* 164  331:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 165  334:pop             
	//* 166  335:aload_3         
	//* 167  336:ldc1            #138 <String " broadcast receiver is registered in the manifest.">
	//* 168  338:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 169  341:pop             
	//* 170  342:aload_2         
	//* 171  343:aload_3         
	//* 172  344:invokevirtual   #64  <Method String StringBuilder.toString()>
	//* 173  347:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 174  350:pop             
	//* 175  351:aload_1         
	//* 176  352:invokevirtual   #143 <Method String AppboyConfigurationProvider.getGcmSenderId()>
	//* 177  355:ifnonnull       365
	//* 178  358:aload_2         
	//* 179  359:ldc1            #145 <String "Cannot find the Google Cloud Messaging sender ID value in configuration">
	//* 180  361:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//* 181  364:pop             
	//* 182  365:aload_2         
	//* 183  366:invokevirtual   #149 <Method int StringBuilder.length()>
	//* 184  369:ifne            374
	//* 185  372:iconst_1        
	//* 186  373:ireturn         
	//* 187  374:getstatic       #20  <Field String a>
	//* 188  377:aload_2         
	//* 189  378:invokevirtual   #64  <Method String StringBuilder.toString()>
	//* 190  381:invokestatic    #152 <Method int AppboyLogger.e(String, String)>
	//* 191  384:pop             
	//* 192  385:iconst_0        
	//* 193  386:ireturn         
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception1)
		{
			stringbuilder3 = new StringBuilder();
			stringbuilder3.append("The manifest does not define the ");
			stringbuilder3.append(s);
			stringbuilder3.append(" permission.");
			stringbuilder.append(stringbuilder3.toString());
		}
		if(!PermissionUtils.hasPermission(context, "android.permission.INTERNET"))
			stringbuilder.append("Missing permission. The android.permission.INTERNET permission must be set so that the Android application can send the registration ID to the 3rd party server.");
		else
		if(!PermissionUtils.hasPermission(context, "com.google.android.c2dm.permission.RECEIVE"))
			stringbuilder.append("Missing permission. The com.google.android.c2dm.permission.RECEIVE permission must be set so that the Android application can register and receive messages.");
		else
		if(!PermissionUtils.hasPermission(context, s))
		{
			StringBuilder stringbuilder4 = new StringBuilder();
			stringbuilder4.append("Missing permission. The ");
			stringbuilder4.append(s);
			stringbuilder4.append(" permission must be set so that ONLY this Android application can register and receive GCM messages.");
			stringbuilder.append(stringbuilder4.toString());
		}
		if(!PermissionUtils.hasPermission(context, "android.permission.GET_ACCOUNTS") && android.os.Build.VERSION.SDK_INT < 16)
			stringbuilder.append("Missing permission. The android.permission.GET_ACCOUNTS permission must be set so that this pre-Jelly Bean Android device can register with the GCM server.");
		if(!PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK"))
			AppboyLogger.i(a, "Missing permission. The android.permission.WAKE_LOCK permission is recommended be set so that the GCM receiver can notify users by waking the phone when a message is received.");
		context = ((Context) (new ComponentName(context, "com.appboy.AppboyGcmReceiver")));
		obj = ((Object) (((PackageManager) (obj)).getReceiverInfo(((ComponentName) (context)), 2)));
		if(obj == null) goto _L2; else goto _L1
_L1:
		if(((ActivityInfo) (obj)).enabled) goto _L3; else goto _L2
_L2:
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append("The ");
		stringbuilder1.append(((ComponentName) (context)).getClassName());
		stringbuilder1.append(" broadcast receiver is either not found or is disabled");
		stringbuilder.append(stringbuilder1.toString());
		  goto _L3
_L5:
		StringBuilder stringbuilder2 = new StringBuilder();
		stringbuilder2.append("No ");
		stringbuilder2.append(((ComponentName) (context)).getClassName());
		stringbuilder2.append(" broadcast receiver is registered in the manifest.");
		stringbuilder.append(stringbuilder2.toString());
_L3:
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception1;
		if(appboyconfigurationprovider.getGcmSenderId() == null)
			stringbuilder.append("Cannot find the Google Cloud Messaging sender ID value in configuration");
		if(stringbuilder.length() == 0)
		{
			return true;
		} else
		{
			AppboyLogger.e(a, stringbuilder.toString());
			return false;
		}
	//* 194  387:astore          5
	//* 195  389:goto            64
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
	//  196  392:astore_3        
		if(true) goto _L5; else goto _L4
_L4:
	//* 197  393:goto            311
	}

	public transient void a(String as[])
	{
		if(c.a() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field bp c>
	//*   2    4:invokeinterface #158 <Method String bp.a()>
	//*   3    9:ifnull          22
		{
			AppboyLogger.w(a, "The device is already registered with the GCM server and is eligible to receive GCM messages.");
	//    4   12:getstatic       #20  <Field String a>
	//    5   15:ldc1            #160 <String "The device is already registered with the GCM server and is eligible to receive GCM messages.">
	//    6   17:invokestatic    #163 <Method int AppboyLogger.w(String, String)>
	//    7   20:pop             
			return;
	//    8   21:return          
		} else
		{
			AppboyLogger.d(a, "Registering the application with the GCM server.");
	//    9   22:getstatic       #20  <Field String a>
	//   10   25:ldc1            #165 <String "Registering the application with the GCM server.">
	//   11   27:invokestatic    #168 <Method int AppboyLogger.d(String, String)>
	//   12   30:pop             
			as = ((String []) (StringUtils.join(as, ",")));
	//   13   31:aload_1         
	//   14   32:ldc1            #170 <String ",">
	//   15   34:invokestatic    #176 <Method String StringUtils.join(String[], String)>
	//   16   37:astore_1        
			Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
	//   17   38:new             #178 <Class Intent>
	//   18   41:dup             
	//   19   42:ldc1            #180 <String "com.google.android.c2dm.intent.REGISTER">
	//   20   44:invokespecial   #183 <Method void Intent(String)>
	//   21   47:astore_2        
			intent.setPackage("com.google.android.gsf");
	//   22   48:aload_2         
	//   23   49:ldc1            #185 <String "com.google.android.gsf">
	//   24   51:invokevirtual   #189 <Method Intent Intent.setPackage(String)>
	//   25   54:pop             
			intent.putExtra("app", ((android.os.Parcelable) (PendingIntent.getBroadcast(b, 0, new Intent(), 0))));
	//   26   55:aload_2         
	//   27   56:ldc1            #191 <String "app">
	//   28   58:aload_0         
	//   29   59:getfield        #27  <Field Context b>
	//   30   62:iconst_0        
	//   31   63:new             #178 <Class Intent>
	//   32   66:dup             
	//   33   67:invokespecial   #192 <Method void Intent()>
	//   34   70:iconst_0        
	//   35   71:invokestatic    #198 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   36   74:invokevirtual   #202 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   37   77:pop             
			intent.putExtra("sender", ((String) (as)));
	//   38   78:aload_2         
	//   39   79:ldc1            #204 <String "sender">
	//   40   81:aload_1         
	//   41   82:invokevirtual   #207 <Method Intent Intent.putExtra(String, String)>
	//   42   85:pop             
			b.startService(intent);
	//   43   86:aload_0         
	//   44   87:getfield        #27  <Field Context b>
	//   45   90:aload_2         
	//   46   91:invokevirtual   #211 <Method ComponentName Context.startService(Intent)>
	//   47   94:pop             
			return;
	//   48   95:return          
		}
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bk);
	private final Context b;
	private final bp c;

	static 
	{
	//    0    0:ldc1            #2   <Class bk>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String a>
	//*   3    8:return          
	}
}
