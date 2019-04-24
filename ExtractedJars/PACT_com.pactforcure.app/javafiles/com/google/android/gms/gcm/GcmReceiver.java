// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Base64;
import android.util.Log;

public class GcmReceiver extends WakefulBroadcastReceiver
{

	public GcmReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void WakefulBroadcastReceiver()>
	//    2    4:return          
	}

	private void doStartService(Context context, Intent intent)
	{
		if(isOrderedBroadcast())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #24  <Method boolean isOrderedBroadcast()>
	//*   2    4:ifeq            14
			setResultCode(500);
	//    3    7:aload_0         
	//    4    8:sipush          500
	//    5   11:invokevirtual   #28  <Method void setResultCode(int)>
		zze(context, intent);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokespecial   #31  <Method void zze(Context, Intent)>
		if(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") != 0) goto _L2; else goto _L1
	//   10   20:aload_1         
	//   11   21:ldc1            #33  <String "android.permission.WAKE_LOCK">
	//   12   23:invokevirtual   #39  <Method int Context.checkCallingOrSelfPermission(String)>
	//   13   26:ifne            62
_L1:
		context = ((Context) (startWakefulService(context, intent)));
	//   14   29:aload_1         
	//   15   30:aload_2         
	//   16   31:invokestatic    #43  <Method android.content.ComponentName startWakefulService(Context, Intent)>
	//   17   34:astore_1        
_L4:
		if(context != null)
			break; /* Loop/switch isn't completed */
	//   18   35:aload_1         
	//   19   36:ifnonnull       104
		try
		{
			Log.e("GcmReceiver", "Error while delivering the message: ServiceIntent not found.");
	//   20   39:ldc1            #45  <String "GcmReceiver">
	//   21   41:ldc1            #47  <String "Error while delivering the message: ServiceIntent not found.">
	//   22   43:invokestatic    #53  <Method int Log.e(String, String)>
	//   23   46:pop             
			if(isOrderedBroadcast())
	//*  24   47:aload_0         
	//*  25   48:invokevirtual   #24  <Method boolean isOrderedBroadcast()>
	//*  26   51:ifeq            116
			{
				setResultCode(404);
	//   27   54:aload_0         
	//   28   55:sipush          404
	//   29   58:invokevirtual   #28  <Method void setResultCode(int)>
				return;
	//   30   61:return          
			}
		}
	//*  31   62:aload_1         
	//*  32   63:aload_2         
	//*  33   64:invokevirtual   #57  <Method android.content.ComponentName Context.startService(Intent)>
	//*  34   67:astore_1        
	//*  35   68:ldc1            #45  <String "GcmReceiver">
	//*  36   70:ldc1            #59  <String "Missing wake lock permission, service start may be delayed">
	//*  37   72:invokestatic    #62  <Method int Log.d(String, String)>
	//*  38   75:pop             
	//*  39   76:goto            35
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  40   79:astore_1        
		{
			Log.e("GcmReceiver", "Error while delivering the message to the serviceIntent", ((Throwable) (context)));
	//   41   80:ldc1            #45  <String "GcmReceiver">
	//   42   82:ldc1            #64  <String "Error while delivering the message to the serviceIntent">
	//   43   84:aload_1         
	//   44   85:invokestatic    #67  <Method int Log.e(String, String, Throwable)>
	//   45   88:pop             
			if(isOrderedBroadcast())
	//*  46   89:aload_0         
	//*  47   90:invokevirtual   #24  <Method boolean isOrderedBroadcast()>
	//*  48   93:ifeq            116
			{
				setResultCode(401);
	//   49   96:aload_0         
	//   50   97:sipush          401
	//   51  100:invokevirtual   #28  <Method void setResultCode(int)>
				return;
	//   52  103:return          
			}
		}
		break MISSING_BLOCK_LABEL_116;
_L2:
		context = ((Context) (context.startService(intent)));
		Log.d("GcmReceiver", "Missing wake lock permission, service start may be delayed");
		if(true) goto _L4; else goto _L3
_L3:
		if(isOrderedBroadcast())
	//*  53  104:aload_0         
	//*  54  105:invokevirtual   #24  <Method boolean isOrderedBroadcast()>
	//*  55  108:ifeq            116
			setResultCode(-1);
	//   56  111:aload_0         
	//   57  112:iconst_m1       
	//   58  113:invokevirtual   #28  <Method void setResultCode(int)>
	//   59  116:return          
	}

	private void zze(Context context, Intent intent)
	{
		Object obj = ((Object) (context.getPackageManager().resolveService(intent, 0)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #71  <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #77  <Method ResolveInfo PackageManager.resolveService(Intent, int)>
	//    5    9:astore_3        
		if(obj == null || ((ResolveInfo) (obj)).serviceInfo == null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          21
	//*   8   14:aload_3         
	//*   9   15:getfield        #83  <Field ServiceInfo ResolveInfo.serviceInfo>
	//*  10   18:ifnonnull       30
		{
			Log.e("GcmReceiver", "Failed to resolve target intent service, skipping classname enforcement");
	//   11   21:ldc1            #45  <String "GcmReceiver">
	//   12   23:ldc1            #85  <String "Failed to resolve target intent service, skipping classname enforcement">
	//   13   25:invokestatic    #53  <Method int Log.e(String, String)>
	//   14   28:pop             
			return;
	//   15   29:return          
		}
		obj = ((Object) (((ResolveInfo) (obj)).serviceInfo));
	//   16   30:aload_3         
	//   17   31:getfield        #83  <Field ServiceInfo ResolveInfo.serviceInfo>
	//   18   34:astore_3        
		if(!context.getPackageName().equals(((Object) (((ServiceInfo) (obj)).packageName))) || ((ServiceInfo) (obj)).name == null)
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #89  <Method String Context.getPackageName()>
	//*  21   39:aload_3         
	//*  22   40:getfield        #94  <Field String ServiceInfo.packageName>
	//*  23   43:invokevirtual   #100 <Method boolean String.equals(Object)>
	//*  24   46:ifeq            56
	//*  25   49:aload_3         
	//*  26   50:getfield        #103 <Field String ServiceInfo.name>
	//*  27   53:ifnonnull       125
		{
			context = ((Context) (String.valueOf(((Object) (((ServiceInfo) (obj)).packageName)))));
	//   28   56:aload_3         
	//   29   57:getfield        #94  <Field String ServiceInfo.packageName>
	//   30   60:invokestatic    #107 <Method String String.valueOf(Object)>
	//   31   63:astore_1        
			intent = ((Intent) (String.valueOf(((Object) (((ServiceInfo) (obj)).name)))));
	//   32   64:aload_3         
	//   33   65:getfield        #103 <Field String ServiceInfo.name>
	//   34   68:invokestatic    #107 <Method String String.valueOf(Object)>
	//   35   71:astore_2        
			Log.e("GcmReceiver", (new StringBuilder(String.valueOf(((Object) (context))).length() + 94 + String.valueOf(((Object) (intent))).length())).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append(((String) (context))).append("/").append(((String) (intent))).toString());
	//   36   72:ldc1            #45  <String "GcmReceiver">
	//   37   74:new             #109 <Class StringBuilder>
	//   38   77:dup             
	//   39   78:aload_1         
	//   40   79:invokestatic    #107 <Method String String.valueOf(Object)>
	//   41   82:invokevirtual   #113 <Method int String.length()>
	//   42   85:bipush          94
	//   43   87:iadd            
	//   44   88:aload_2         
	//   45   89:invokestatic    #107 <Method String String.valueOf(Object)>
	//   46   92:invokevirtual   #113 <Method int String.length()>
	//   47   95:iadd            
	//   48   96:invokespecial   #115 <Method void StringBuilder(int)>
	//   49   99:ldc1            #117 <String "Error resolving target intent service, skipping classname enforcement. Resolved service was: ">
	//   50  101:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   51  104:aload_1         
	//   52  105:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   53  108:ldc1            #123 <String "/">
	//   54  110:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   55  113:aload_2         
	//   56  114:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   57  117:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   58  120:invokestatic    #53  <Method int Log.e(String, String)>
	//   59  123:pop             
			return;
	//   60  124:return          
		}
		String s = ((ServiceInfo) (obj)).name;
	//   61  125:aload_3         
	//   62  126:getfield        #103 <Field String ServiceInfo.name>
	//   63  129:astore          4
		obj = ((Object) (s));
	//   64  131:aload           4
	//   65  133:astore_3        
		if(s.startsWith("."))
	//*  66  134:aload           4
	//*  67  136:ldc1            #128 <String ".">
	//*  68  138:invokevirtual   #132 <Method boolean String.startsWith(String)>
	//*  69  141:ifeq            174
		{
			obj = ((Object) (String.valueOf(((Object) (context.getPackageName())))));
	//   70  144:aload_1         
	//   71  145:invokevirtual   #89  <Method String Context.getPackageName()>
	//   72  148:invokestatic    #107 <Method String String.valueOf(Object)>
	//   73  151:astore_3        
			s = String.valueOf(((Object) (s)));
	//   74  152:aload           4
	//   75  154:invokestatic    #107 <Method String String.valueOf(Object)>
	//   76  157:astore          4
			if(s.length() != 0)
	//*  77  159:aload           4
	//*  78  161:invokevirtual   #113 <Method int String.length()>
	//*  79  164:ifeq            225
				obj = ((Object) (((String) (obj)).concat(s)));
	//   80  167:aload_3         
	//   81  168:aload           4
	//   82  170:invokevirtual   #136 <Method String String.concat(String)>
	//   83  173:astore_3        
			else
	//*  84  174:ldc1            #45  <String "GcmReceiver">
	//*  85  176:iconst_3        
	//*  86  177:invokestatic    #140 <Method boolean Log.isLoggable(String, int)>
	//*  87  180:ifeq            214
	//*  88  183:aload_3         
	//*  89  184:invokestatic    #107 <Method String String.valueOf(Object)>
	//*  90  187:astore          4
	//*  91  189:aload           4
	//*  92  191:invokevirtual   #113 <Method int String.length()>
	//*  93  194:ifeq            237
	//*  94  197:ldc1            #142 <String "Restricting intent to a specific service: ">
	//*  95  199:aload           4
	//*  96  201:invokevirtual   #136 <Method String String.concat(String)>
	//*  97  204:astore          4
	//*  98  206:ldc1            #45  <String "GcmReceiver">
	//*  99  208:aload           4
	//* 100  210:invokestatic    #62  <Method int Log.d(String, String)>
	//* 101  213:pop             
	//* 102  214:aload_2         
	//* 103  215:aload_1         
	//* 104  216:invokevirtual   #89  <Method String Context.getPackageName()>
	//* 105  219:aload_3         
	//* 106  220:invokevirtual   #148 <Method Intent Intent.setClassName(String, String)>
	//* 107  223:pop             
	//* 108  224:return          
				obj = ((Object) (new String(((String) (obj)))));
	//  109  225:new             #96  <Class String>
	//  110  228:dup             
	//  111  229:aload_3         
	//  112  230:invokespecial   #151 <Method void String(String)>
	//  113  233:astore_3        
		}
		if(Log.isLoggable("GcmReceiver", 3))
		{
			s = String.valueOf(obj);
			if(s.length() != 0)
				s = "Restricting intent to a specific service: ".concat(s);
			else
	//* 114  234:goto            174
				s = new String("Restricting intent to a specific service: ");
	//  115  237:new             #96  <Class String>
	//  116  240:dup             
	//  117  241:ldc1            #142 <String "Restricting intent to a specific service: ">
	//  118  243:invokespecial   #151 <Method void String(String)>
	//  119  246:astore          4
			Log.d("GcmReceiver", s);
		}
		intent.setClassName(context.getPackageName(), ((String) (obj)));
	//* 120  248:goto            206
	}

	public void onReceive(Context context, Intent intent)
	{
		intent.setComponent(((android.content.ComponentName) (null)));
	//    0    0:aload_2         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #156 <Method Intent Intent.setComponent(android.content.ComponentName)>
	//    3    5:pop             
		intent.setPackage(context.getPackageName());
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #89  <Method String Context.getPackageName()>
	//    7   11:invokevirtual   #160 <Method Intent Intent.setPackage(String)>
	//    8   14:pop             
		if(android.os.Build.VERSION.SDK_INT <= 18)
	//*   9   15:getstatic       #166 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   18:bipush          18
	//*  11   20:icmpgt          31
			intent.removeCategory(context.getPackageName());
	//   12   23:aload_2         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #89  <Method String Context.getPackageName()>
	//   15   28:invokevirtual   #169 <Method void Intent.removeCategory(String)>
		String s = intent.getStringExtra("from");
	//   16   31:aload_2         
	//   17   32:ldc1            #171 <String "from">
	//   18   34:invokevirtual   #174 <Method String Intent.getStringExtra(String)>
	//   19   37:astore_3        
		if("com.google.android.c2dm.intent.REGISTRATION".equals(((Object) (intent.getAction()))) || "google.com/iid".equals(((Object) (s))) || zzbfQ.equals(((Object) (s))))
	//*  20   38:ldc1            #176 <String "com.google.android.c2dm.intent.REGISTRATION">
	//*  21   40:aload_2         
	//*  22   41:invokevirtual   #179 <Method String Intent.getAction()>
	//*  23   44:invokevirtual   #100 <Method boolean String.equals(Object)>
	//*  24   47:ifne            69
	//*  25   50:ldc1            #181 <String "google.com/iid">
	//*  26   52:aload_3         
	//*  27   53:invokevirtual   #100 <Method boolean String.equals(Object)>
	//*  28   56:ifne            69
	//*  29   59:getstatic       #12  <Field String zzbfQ>
	//*  30   62:aload_3         
	//*  31   63:invokevirtual   #100 <Method boolean String.equals(Object)>
	//*  32   66:ifeq            76
			intent.setAction("com.google.android.gms.iid.InstanceID");
	//   33   69:aload_2         
	//   34   70:ldc1            #183 <String "com.google.android.gms.iid.InstanceID">
	//   35   72:invokevirtual   #186 <Method Intent Intent.setAction(String)>
	//   36   75:pop             
		s = intent.getStringExtra("gcm.rawData64");
	//   37   76:aload_2         
	//   38   77:ldc1            #188 <String "gcm.rawData64">
	//   39   79:invokevirtual   #174 <Method String Intent.getStringExtra(String)>
	//   40   82:astore_3        
		if(s != null)
	//*  41   83:aload_3         
	//*  42   84:ifnull          105
		{
			intent.putExtra("rawData", Base64.decode(s, 0));
	//   43   87:aload_2         
	//   44   88:ldc1            #190 <String "rawData">
	//   45   90:aload_3         
	//   46   91:iconst_0        
	//   47   92:invokestatic    #196 <Method byte[] Base64.decode(String, int)>
	//   48   95:invokevirtual   #200 <Method Intent Intent.putExtra(String, byte[])>
	//   49   98:pop             
			intent.removeExtra("gcm.rawData64");
	//   50   99:aload_2         
	//   51  100:ldc1            #188 <String "gcm.rawData64">
	//   52  102:invokevirtual   #203 <Method void Intent.removeExtra(String)>
		}
		if("com.google.android.c2dm.intent.RECEIVE".equals(((Object) (intent.getAction()))))
	//*  53  105:ldc1            #205 <String "com.google.android.c2dm.intent.RECEIVE">
	//*  54  107:aload_2         
	//*  55  108:invokevirtual   #179 <Method String Intent.getAction()>
	//*  56  111:invokevirtual   #100 <Method boolean String.equals(Object)>
	//*  57  114:ifeq            143
			zzd(context, intent);
	//   58  117:aload_0         
	//   59  118:aload_1         
	//   60  119:aload_2         
	//   61  120:invokevirtual   #208 <Method void zzd(Context, Intent)>
		else
	//*  62  123:aload_0         
	//*  63  124:invokevirtual   #24  <Method boolean isOrderedBroadcast()>
	//*  64  127:ifeq            142
	//*  65  130:aload_0         
	//*  66  131:invokevirtual   #211 <Method int getResultCode()>
	//*  67  134:ifne            142
	//*  68  137:aload_0         
	//*  69  138:iconst_m1       
	//*  70  139:invokevirtual   #28  <Method void setResultCode(int)>
	//*  71  142:return          
			doStartService(context, intent);
	//   72  143:aload_0         
	//   73  144:aload_1         
	//   74  145:aload_2         
	//   75  146:invokespecial   #213 <Method void doStartService(Context, Intent)>
		if(isOrderedBroadcast() && getResultCode() == 0)
			setResultCode(-1);
	//*  76  149:goto            123
	}

	public void zzd(Context context, Intent intent)
	{
		doStartService(context, intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #213 <Method void doStartService(Context, Intent)>
	//    4    6:return          
	}

	private static String zzbfQ = "gcm.googleapis.com/refresh";

	static 
	{
	//    0    0:ldc1            #10  <String "gcm.googleapis.com/refresh">
	//    1    2:putstatic       #12  <Field String zzbfQ>
	//*   2    5:return          
	}
}
