// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.android.id;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.comscore.android.id:
//			b, c, API4, DeviceId, 
//			API9

public class IdHelperAndroid
{

	public IdHelperAndroid()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
	//    2    4:return          
	}

	private static String a(Context context)
	{
		b b1;
		Object obj;
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #55  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #58  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       19
			throw new IllegalStateException("Cannot be called from the main thread");
	//    3    9:new             #60  <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #62  <String "Cannot be called from the main thread">
	//    6   15:invokespecial   #65  <Method void IllegalStateException(String)>
	//    7   18:athrow          
		b1 = new b(((a) (null)));
	//    8   19:new             #67  <Class b>
	//    9   22:dup             
	//   10   23:aconst_null     
	//   11   24:invokespecial   #70  <Method void b(a)>
	//   12   27:astore_1        
		obj = ((Object) (new Intent(b)));
	//   13   28:new             #72  <Class Intent>
	//   14   31:dup             
	//   15   32:getstatic       #74  <Field String b>
	//   16   35:invokespecial   #75  <Method void Intent(String)>
	//   17   38:astore_2        
		((Intent) (obj)).setPackage(a);
	//   18   39:aload_2         
	//   19   40:getstatic       #77  <Field String a>
	//   20   43:invokevirtual   #81  <Method Intent Intent.setPackage(String)>
	//   21   46:pop             
		if(!context.bindService(((Intent) (obj)), ((android.content.ServiceConnection) (b1)), 1)) goto _L2; else goto _L1
	//   22   47:aload_0         
	//   23   48:aload_2         
	//   24   49:aload_1         
	//   25   50:iconst_1        
	//   26   51:invokevirtual   #87  <Method boolean Context.bindService(Intent, android.content.ServiceConnection, int)>
	//   27   54:ifeq            92
_L1:
		obj = ((Object) ((new c(b1.getBinder())).getId()));
	//   28   57:new             #89  <Class c>
	//   29   60:dup             
	//   30   61:aload_1         
	//   31   62:invokevirtual   #93  <Method android.os.IBinder b.getBinder()>
	//   32   65:invokespecial   #96  <Method void c(android.os.IBinder)>
	//   33   68:invokevirtual   #100 <Method String c.getId()>
	//   34   71:astore_2        
		context.unbindService(((android.content.ServiceConnection) (b1)));
	//   35   72:aload_0         
	//   36   73:aload_1         
	//   37   74:invokevirtual   #104 <Method void Context.unbindService(android.content.ServiceConnection)>
		return ((String) (obj));
	//   38   77:aload_2         
	//   39   78:areturn         
		Object obj1;
		obj1;
	//   40   79:astore_2        
		context.unbindService(((android.content.ServiceConnection) (b1)));
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:invokevirtual   #104 <Method void Context.unbindService(android.content.ServiceConnection)>
		throw obj1;
	//   44   85:aload_2         
	//   45   86:athrow          
_L4:
		context.unbindService(((android.content.ServiceConnection) (b1)));
	//   46   87:aload_0         
	//   47   88:aload_1         
	//   48   89:invokevirtual   #104 <Method void Context.unbindService(android.content.ServiceConnection)>
_L2:
		return "";
	//   49   92:ldc1            #106 <String "">
	//   50   94:areturn         
		obj1;
	//   51   95:astore_2        
		if(true) goto _L4; else goto _L3
_L3:
	//*  52   96:goto            87
	}

	private static boolean b(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT > 4)
	//*   0    0:getstatic       #113 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:iconst_4        
	//*   2    4:icmple          20
		{
			if(d)
	//*   3    7:getstatic       #115 <Field boolean d>
	//*   4   10:ifeq            15
				return true;
	//    5   13:iconst_1        
	//    6   14:ireturn         
			else
				return API4.isPackageInstalledFromGooglePlayStore(context);
	//    7   15:aload_0         
	//    8   16:invokestatic    #120 <Method boolean API4.isPackageInstalledFromGooglePlayStore(Context)>
	//    9   19:ireturn         
		} else
		{
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		}
	}

	public static boolean checkAndroidId(String s)
	{
		for(int i = 0; i < INVALID_ID_VALUES.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:getstatic       #42  <Field String[] INVALID_ID_VALUES>
	//*   4    6:arraylength     
	//*   5    7:icmpge          31
			if(INVALID_ID_VALUES[i].equals(((Object) (s))))
	//*   6   10:getstatic       #42  <Field String[] INVALID_ID_VALUES>
	//*   7   13:iload_1         
	//*   8   14:aaload          
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #126 <Method boolean String.equals(Object)>
	//*  11   19:ifeq            24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         

	//   14   24:iload_1         
	//   15   25:iconst_1        
	//   16   26:iadd            
	//   17   27:istore_1        
	//*  18   28:goto            2
		return true;
	//   19   31:iconst_1        
	//   20   32:ireturn         
	}

	public static boolean checkAndroidSerial(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		for(int i = 0; i < INVALID_ID_VALUES.length; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_1        
	//*   6    8:iload_1         
	//*   7    9:getstatic       #42  <Field String[] INVALID_ID_VALUES>
	//*   8   12:arraylength     
	//*   9   13:icmpge          37
			if(INVALID_ID_VALUES[i].equals(((Object) (s))))
	//*  10   16:getstatic       #42  <Field String[] INVALID_ID_VALUES>
	//*  11   19:iload_1         
	//*  12   20:aaload          
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #126 <Method boolean String.equals(Object)>
	//*  15   25:ifeq            30
				return false;
	//   16   28:iconst_0        
	//   17   29:ireturn         

	//   18   30:iload_1         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_1        
	//*  22   34:goto            8
		return s.length() > 3 && !s.substring(0, 3).equals("***") && !s.substring(0, 3).equals("000");
	//   23   37:aload_0         
	//   24   38:invokevirtual   #131 <Method int String.length()>
	//   25   41:iconst_3        
	//   26   42:icmple          75
	//   27   45:aload_0         
	//   28   46:iconst_0        
	//   29   47:iconst_3        
	//   30   48:invokevirtual   #135 <Method String String.substring(int, int)>
	//   31   51:ldc1            #137 <String "***">
	//   32   53:invokevirtual   #126 <Method boolean String.equals(Object)>
	//   33   56:ifne            75
	//   34   59:aload_0         
	//   35   60:iconst_0        
	//   36   61:iconst_3        
	//   37   62:invokevirtual   #135 <Method String String.substring(int, int)>
	//   38   65:ldc1            #139 <String "000">
	//   39   67:invokevirtual   #126 <Method boolean String.equals(Object)>
	//   40   70:ifne            75
	//   41   73:iconst_1        
	//   42   74:ireturn         
	//   43   75:iconst_0        
	//   44   76:ireturn         
	}

	public static final DeviceId getAdvertisingDeviceId(Context context)
	{
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #55  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #58  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       19
			throw new IllegalStateException("Cannot be called from the main thread");
	//    3    9:new             #60  <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #62  <String "Cannot be called from the main thread">
	//    6   15:invokespecial   #65  <Method void IllegalStateException(String)>
	//    7   18:athrow          
		if(b(context))
	//*   8   19:aload_0         
	//*   9   20:invokestatic    #143 <Method boolean b(Context)>
	//*  10   23:ifeq            31
			return getGooglePlayAdvertisingDeviceId(context);
	//   11   26:aload_0         
	//   12   27:invokestatic    #146 <Method DeviceId getGooglePlayAdvertisingDeviceId(Context)>
	//   13   30:areturn         
		else
			return getDeviceId(context);
	//   14   31:aload_0         
	//   15   32:invokestatic    #149 <Method DeviceId getDeviceId(Context)>
	//   16   35:areturn         
	}

	public static final DeviceId getAndroidId(Context context)
	{
		if(Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 3)
	//*   0    0:getstatic       #113 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:invokestatic    #156 <Method Integer Integer.valueOf(int)>
	//*   2    6:invokevirtual   #159 <Method int Integer.intValue()>
	//*   3    9:iconst_3        
	//*   4   10:icmplt          48
		{
			context = ((Context) (android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id")));
	//    5   13:aload_0         
	//    6   14:invokevirtual   #163 <Method android.content.ContentResolver Context.getContentResolver()>
	//    7   17:ldc1            #38  <String "android_id">
	//    8   19:invokestatic    #169 <Method String android.provider.Settings$Secure.getString(android.content.ContentResolver, String)>
	//    9   22:astore_0        
			if(context != null && ((String) (context)).length() > 0)
	//*  10   23:aload_0         
	//*  11   24:ifnull          48
	//*  12   27:aload_0         
	//*  13   28:invokevirtual   #131 <Method int String.length()>
	//*  14   31:ifle            48
				return new DeviceId("AndroidId", ((String) (context)), 7, 2);
	//   15   34:new             #171 <Class DeviceId>
	//   16   37:dup             
	//   17   38:ldc1            #173 <String "AndroidId">
	//   18   40:aload_0         
	//   19   41:bipush          7
	//   20   43:iconst_2        
	//   21   44:invokespecial   #176 <Method void DeviceId(String, String, int, int)>
	//   22   47:areturn         
		}
		return null;
	//   23   48:aconst_null     
	//   24   49:areturn         
	}

	public static final DeviceId getAndroidSerial()
	{
		if(Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 9)
	//*   0    0:getstatic       #113 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:invokestatic    #156 <Method Integer Integer.valueOf(int)>
	//*   2    6:invokevirtual   #159 <Method int Integer.intValue()>
	//*   3    9:bipush          9
	//*   4   11:icmplt          29
			return new DeviceId("AndroidSerial", API9.getAndroidSerial(), 3, 1);
	//    5   14:new             #171 <Class DeviceId>
	//    6   17:dup             
	//    7   18:ldc1            #180 <String "AndroidSerial">
	//    8   20:invokestatic    #184 <Method String API9.getAndroidSerial()>
	//    9   23:iconst_3        
	//   10   24:iconst_1        
	//   11   25:invokespecial   #176 <Method void DeviceId(String, String, int, int)>
	//   12   28:areturn         
		else
			return null;
	//   13   29:aconst_null     
	//   14   30:areturn         
	}

	public static DeviceId getDeviceId(Context context)
	{
		DeviceId deviceid = getAndroidSerial();
	//    0    0:invokestatic    #186 <Method DeviceId getAndroidSerial()>
	//    1    3:astore_2        
		Object obj = ((Object) (deviceid));
	//    2    4:aload_2         
	//    3    5:astore_1        
		if(!checkAndroidSerial(deviceid.getId()))
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #187 <Method String DeviceId.getId()>
	//*   6   10:invokestatic    #189 <Method boolean checkAndroidSerial(String)>
	//*   7   13:ifne            35
		{
			context = ((Context) (getAndroidId(context)));
	//    8   16:aload_0         
	//    9   17:invokestatic    #191 <Method DeviceId getAndroidId(Context)>
	//   10   20:astore_0        
			obj = ((Object) (context));
	//   11   21:aload_0         
	//   12   22:astore_1        
			if(!checkAndroidId(((DeviceId) (context)).getId()))
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #187 <Method String DeviceId.getId()>
	//*  15   27:invokestatic    #193 <Method boolean checkAndroidId(String)>
	//*  16   30:ifne            35
				return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
		}
		return ((DeviceId) (obj));
	//   19   35:aload_1         
	//   20   36:areturn         
	}

	public static final DeviceId getGooglePlayAdvertisingDeviceId(Context context)
	{
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #55  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #58  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       19
			throw new IllegalStateException("Cannot be called from the main thread");
	//    3    9:new             #60  <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #62  <String "Cannot be called from the main thread">
	//    6   15:invokespecial   #65  <Method void IllegalStateException(String)>
	//    7   18:athrow          
		boolean flag;
		try
		{
			flag = isGooglePlayServicesAvailable(context);
	//    8   19:aload_0         
	//    9   20:invokestatic    #196 <Method boolean isGooglePlayServicesAvailable(Context)>
	//   10   23:istore_1        
		}
	//*  11   24:iload_1         
	//*  12   25:ifeq            55
	//*  13   28:aload_0         
	//*  14   29:invokestatic    #199 <Method boolean isAdvertisingIdEnabled(Context)>
	//*  15   32:ifeq            43
	//*  16   35:aload_0         
	//*  17   36:invokestatic    #201 <Method String a(Context)>
	//*  18   39:astore_0        
	//*  19   40:goto            46
	//*  20   43:ldc1            #10  <String "none">
	//*  21   45:astore_0        
	//*  22   46:new             #171 <Class DeviceId>
	//*  23   49:dup             
	//*  24   50:aload_0         
	//*  25   51:invokespecial   #202 <Method void DeviceId(String)>
	//*  26   54:areturn         
	//*  27   55:aconst_null     
	//*  28   56:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  29   57:astore_0        
		{
			throw context;
	//   30   58:aload_0         
	//   31   59:athrow          
		}
		if(flag)
		{
			if(isAdvertisingIdEnabled(context))
				context = ((Context) (a(context)));
			else
				context = "none";
			return new DeviceId(((String) (context)));
		} else
		{
			return null;
		}
	}

	public static boolean isAdvertisingIdEnabled(Context context)
	{
		boolean flag;
		boolean flag1;
		b b1;
		Intent intent;
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #55  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #58  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       19
			throw new IllegalStateException("Cannot be called from the main thread");
	//    3    9:new             #60  <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #62  <String "Cannot be called from the main thread">
	//    6   15:invokespecial   #65  <Method void IllegalStateException(String)>
	//    7   18:athrow          
		boolean flag2 = c;
	//    8   19:getstatic       #204 <Field boolean c>
	//    9   22:istore_3        
		flag = false;
	//   10   23:iconst_0        
	//   11   24:istore_1        
		flag1 = false;
	//   12   25:iconst_0        
	//   13   26:istore_2        
		if(flag2)
	//*  14   27:iload_3         
	//*  15   28:ifeq            33
			return false;
	//   16   31:iconst_0        
	//   17   32:ireturn         
		b1 = new b(((a) (null)));
	//   18   33:new             #67  <Class b>
	//   19   36:dup             
	//   20   37:aconst_null     
	//   21   38:invokespecial   #70  <Method void b(a)>
	//   22   41:astore          4
		intent = new Intent(b);
	//   23   43:new             #72  <Class Intent>
	//   24   46:dup             
	//   25   47:getstatic       #74  <Field String b>
	//   26   50:invokespecial   #75  <Method void Intent(String)>
	//   27   53:astore          5
		intent.setPackage(a);
	//   28   55:aload           5
	//   29   57:getstatic       #77  <Field String a>
	//   30   60:invokevirtual   #81  <Method Intent Intent.setPackage(String)>
	//   31   63:pop             
		if(!context.bindService(intent, ((android.content.ServiceConnection) (b1)), 1)) goto _L2; else goto _L1
	//   32   64:aload_0         
	//   33   65:aload           5
	//   34   67:aload           4
	//   35   69:iconst_1        
	//   36   70:invokevirtual   #87  <Method boolean Context.bindService(Intent, android.content.ServiceConnection, int)>
	//   37   73:ifeq            117
_L1:
		flag = (new c(b1.getBinder())).isLimitAdTrackingEnabled(true);
	//   38   76:new             #89  <Class c>
	//   39   79:dup             
	//   40   80:aload           4
	//   41   82:invokevirtual   #93  <Method android.os.IBinder b.getBinder()>
	//   42   85:invokespecial   #96  <Method void c(android.os.IBinder)>
	//   43   88:iconst_1        
	//   44   89:invokevirtual   #208 <Method boolean c.isLimitAdTrackingEnabled(boolean)>
	//   45   92:istore_1        
		flag ^= true;
	//   46   93:iload_1         
	//   47   94:iconst_1        
	//   48   95:ixor            
	//   49   96:istore_1        
_L4:
		context.unbindService(((android.content.ServiceConnection) (b1)));
	//   50   97:aload_0         
	//   51   98:aload           4
	//   52  100:invokevirtual   #104 <Method void Context.unbindService(android.content.ServiceConnection)>
		  goto _L2
	//*  53  103:goto            117
		Object obj;
		obj;
	//   54  106:astore          5
		context.unbindService(((android.content.ServiceConnection) (b1)));
	//   55  108:aload_0         
	//   56  109:aload           4
	//   57  111:invokevirtual   #104 <Method void Context.unbindService(android.content.ServiceConnection)>
		throw obj;
	//   58  114:aload           5
	//   59  116:athrow          
_L2:
		if(!flag)
	//*  60  117:iload_1         
	//*  61  118:ifne            125
			c = true;
	//   62  121:iconst_1        
	//   63  122:putstatic       #204 <Field boolean c>
		return flag;
	//   64  125:iload_1         
	//   65  126:ireturn         
		obj;
	//   66  127:astore          5
		flag = flag1;
	//   67  129:iload_2         
	//   68  130:istore_1        
		if(true) goto _L4; else goto _L3
	//   69  131:goto            97
_L3:
	}

	public static boolean isGooglePlayServicesAvailable(Context context)
	{
		if(Looper.myLooper() == Looper.getMainLooper())
	//*   0    0:invokestatic    #55  <Method Looper Looper.myLooper()>
	//*   1    3:invokestatic    #58  <Method Looper Looper.getMainLooper()>
	//*   2    6:if_acmpne       19
			throw new IllegalStateException("Cannot be called from the main thread");
	//    3    9:new             #60  <Class IllegalStateException>
	//    4   12:dup             
	//    5   13:ldc1            #62  <String "Cannot be called from the main thread">
	//    6   15:invokespecial   #65  <Method void IllegalStateException(String)>
	//    7   18:athrow          
		int i = android.os.Build.VERSION.SDK_INT;
	//    8   19:getstatic       #113 <Field int android.os.Build$VERSION.SDK_INT>
	//    9   22:istore_1        
		boolean flag = false;
	//   10   23:iconst_0        
	//   11   24:istore_2        
		if(i <= 8)
	//*  12   25:iload_1         
	//*  13   26:bipush          8
	//*  14   28:icmpgt          33
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		b b1;
		Intent intent;
		try
		{
			context.getPackageManager().getPackageInfo("com.android.vending", 0);
	//   17   33:aload_0         
	//   18   34:invokevirtual   #212 <Method PackageManager Context.getPackageManager()>
	//   19   37:ldc1            #214 <String "com.android.vending">
	//   20   39:iconst_0        
	//   21   40:invokevirtual   #220 <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//   22   43:pop             
		}
	//*  23   44:new             #67  <Class b>
	//*  24   47:dup             
	//*  25   48:aconst_null     
	//*  26   49:invokespecial   #70  <Method void b(a)>
	//*  27   52:astore_3        
	//*  28   53:new             #72  <Class Intent>
	//*  29   56:dup             
	//*  30   57:getstatic       #74  <Field String b>
	//*  31   60:invokespecial   #75  <Method void Intent(String)>
	//*  32   63:astore          4
	//*  33   65:aload           4
	//*  34   67:getstatic       #77  <Field String a>
	//*  35   70:invokevirtual   #81  <Method Intent Intent.setPackage(String)>
	//*  36   73:pop             
	//*  37   74:aload_0         
	//*  38   75:aload           4
	//*  39   77:aload_3         
	//*  40   78:iconst_1        
	//*  41   79:invokevirtual   #87  <Method boolean Context.bindService(Intent, android.content.ServiceConnection, int)>
	//*  42   82:ifeq            92
	//*  43   85:aload_0         
	//*  44   86:aload_3         
	//*  45   87:invokevirtual   #104 <Method void Context.unbindService(android.content.ServiceConnection)>
	//*  46   90:iconst_1        
	//*  47   91:istore_2        
	//*  48   92:iload_2         
	//*  49   93:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  50   94:astore_0        
		{
			return false;
	//   51   95:iconst_0        
	//   52   96:ireturn         
		}
		b1 = new b(((a) (null)));
		intent = new Intent(b);
		intent.setPackage(a);
		if(context.bindService(intent, ((android.content.ServiceConnection) (b1)), 1))
		{
			context.unbindService(((android.content.ServiceConnection) (b1)));
			flag = true;
		}
		return flag;
	}

	public static String md5(String s)
	{
		int j;
		StringBuilder stringbuilder;
		try
		{
			s = ((String) (MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"))));
	//    0    0:ldc1            #228 <String "MD5">
	//    1    2:invokestatic    #234 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:aload_0         
	//    3    6:ldc1            #236 <String "UTF-8">
	//    4    8:invokevirtual   #240 <Method byte[] String.getBytes(String)>
	//    5   11:invokevirtual   #244 <Method byte[] MessageDigest.digest(byte[])>
	//    6   14:astore_0        
		}
	//*   7   15:new             #246 <Class StringBuilder>
	//*   8   18:dup             
	//*   9   19:aload_0         
	//*  10   20:arraylength     
	//*  11   21:iconst_2        
	//*  12   22:imul            
	//*  13   23:invokespecial   #249 <Method void StringBuilder(int)>
	//*  14   26:astore          4
	//*  15   28:aload_0         
	//*  16   29:arraylength     
	//*  17   30:istore_2        
	//*  18   31:iconst_0        
	//*  19   32:istore_1        
	//*  20   33:iload_1         
	//*  21   34:iload_2         
	//*  22   35:icmpge          77
	//*  23   38:aload_0         
	//*  24   39:iload_1         
	//*  25   40:baload          
	//*  26   41:sipush          255
	//*  27   44:iand            
	//*  28   45:istore_3        
	//*  29   46:iload_3         
	//*  30   47:bipush          16
	//*  31   49:icmpge          60
	//*  32   52:aload           4
	//*  33   54:bipush          48
	//*  34   56:invokevirtual   #253 <Method StringBuilder StringBuilder.append(char)>
	//*  35   59:pop             
	//*  36   60:aload           4
	//*  37   62:iload_3         
	//*  38   63:invokestatic    #257 <Method String Integer.toHexString(int)>
	//*  39   66:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//*  40   69:pop             
	//*  41   70:iload_1         
	//*  42   71:iconst_1        
	//*  43   72:iadd            
	//*  44   73:istore_1        
	//*  45   74:goto            33
	//*  46   77:aload           4
	//*  47   79:invokevirtual   #263 <Method String StringBuilder.toString()>
	//*  48   82:areturn         
	//*  49   83:astore_0        
	//*  50   84:new             #265 <Class RuntimeException>
	//*  51   87:dup             
	//*  52   88:ldc2            #267 <String "Huh, UTF-8 should be supported?">
	//*  53   91:aload_0         
	//*  54   92:invokespecial   #270 <Method void RuntimeException(String, Throwable)>
	//*  55   95:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  56   96:astore_0        
		{
			throw new RuntimeException("Huh, MD5 should be supported?", ((Throwable) (s)));
	//   57   97:new             #265 <Class RuntimeException>
	//   58  100:dup             
	//   59  101:ldc2            #272 <String "Huh, MD5 should be supported?">
	//   60  104:aload_0         
	//   61  105:invokespecial   #270 <Method void RuntimeException(String, Throwable)>
	//   62  108:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new RuntimeException("Huh, UTF-8 should be supported?", ((Throwable) (s)));
		}
		stringbuilder = new StringBuilder(s.length * 2);
		j = s.length;
		for(int i = 0; i < j; i++)
		{
			int k = s[i] & 0xff;
			if(k < 16)
				stringbuilder.append('0');
			stringbuilder.append(Integer.toHexString(k));
		}

		return stringbuilder.toString();
	}

	public static final String INVALID_ID_VALUES[] = {
		"0123456789ABCDEF", "0123456789abcdef", "9774d56d682e549c", "9774D56D682E549C", "unknown", "UNKNOWN", "android_id", "ANDROID_ID"
	};
	public static final String NO_ID_AVAILABLE = "none";
	private static final String a = "com.google.android.gms";
	private static final String b = "com.google.android.gms.ads.identifier.service.START";
	private static boolean c = false;
	private static final boolean d = false;

	static 
	{
	//    0    0:bipush          8
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #26  <String "0123456789ABCDEF">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #28  <String "0123456789abcdef">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #30  <String "9774d56d682e549c">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #32  <String "9774D56D682E549C">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #34  <String "unknown">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #36  <String "UNKNOWN">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #38  <String "android_id">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #40  <String "ANDROID_ID">
	//   33   46:aastore         
	//   34   47:putstatic       #42  <Field String[] INVALID_ID_VALUES>
	//*  35   50:return          
	}
}
