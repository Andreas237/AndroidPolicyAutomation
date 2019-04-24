// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.*;
import android.content.pm.*;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.*;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkb, zzamu, zzoh, zzaga, 
//			zzajm, zzakk

public final class zzagb
{

	public zzagb(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		PackageManager packagemanager = context.getPackageManager();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method PackageManager Context.getPackageManager()>
	//    4    8:astore          4
		zzn(context);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #51  <Method void zzn(Context)>
		zzo(context);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokespecial   #54  <Method void zzo(Context)>
		zzp(context);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokespecial   #57  <Method void zzp(Context)>
		Locale locale = Locale.getDefault();
	//   14   25:invokestatic    #63  <Method Locale Locale.getDefault()>
	//   15   28:astore          5
		ResolveInfo resolveinfo = zza(packagemanager, "geo:0,0?q=donuts");
	//   16   30:aload           4
	//   17   32:ldc1            #65  <String "geo:0,0?q=donuts">
	//   18   34:invokestatic    #69  <Method ResolveInfo zza(PackageManager, String)>
	//   19   37:astore          6
		boolean flag1 = false;
	//   20   39:iconst_0        
	//   21   40:istore_3        
		boolean flag;
		if(resolveinfo != null)
	//*  22   41:aload           6
	//*  23   43:ifnull          51
			flag = true;
	//   24   46:iconst_1        
	//   25   47:istore_2        
		else
	//*  26   48:goto            53
			flag = false;
	//   27   51:iconst_0        
	//   28   52:istore_2        
		zzcjl = flag;
	//   29   53:aload_0         
	//   30   54:iload_2         
	//   31   55:putfield        #71  <Field boolean zzcjl>
		flag = flag1;
	//   32   58:iload_3         
	//   33   59:istore_2        
		if(zza(packagemanager, "http://www.google.com") != null)
	//*  34   60:aload           4
	//*  35   62:ldc1            #73  <String "http://www.google.com">
	//*  36   64:invokestatic    #69  <Method ResolveInfo zza(PackageManager, String)>
	//*  37   67:ifnull          72
			flag = true;
	//   38   70:iconst_1        
	//   39   71:istore_2        
		zzcjm = flag;
	//   40   72:aload_0         
	//   41   73:iload_2         
	//   42   74:putfield        #75  <Field boolean zzcjm>
		zzcjo = locale.getCountry();
	//   43   77:aload_0         
	//   44   78:aload           5
	//   45   80:invokevirtual   #79  <Method String Locale.getCountry()>
	//   46   83:putfield        #81  <Field String zzcjo>
		zzkb.zzif();
	//   47   86:invokestatic    #87  <Method zzamu zzkb.zzif()>
	//   48   89:pop             
		zzcjp = zzamu.zzsg();
	//   49   90:aload_0         
	//   50   91:invokestatic    #93  <Method boolean zzamu.zzsg()>
	//   51   94:putfield        #95  <Field boolean zzcjp>
		zzcjq = DeviceProperties.isSidewinder(context);
	//   52   97:aload_0         
	//   53   98:aload_1         
	//   54   99:invokestatic    #101 <Method boolean DeviceProperties.isSidewinder(Context)>
	//   55  102:putfield        #103 <Field boolean zzcjq>
		zzcjt = locale.getLanguage();
	//   56  105:aload_0         
	//   57  106:aload           5
	//   58  108:invokevirtual   #106 <Method String Locale.getLanguage()>
	//   59  111:putfield        #108 <Field String zzcjt>
		zzcju = zzb(context, packagemanager);
	//   60  114:aload_0         
	//   61  115:aload_1         
	//   62  116:aload           4
	//   63  118:invokestatic    #112 <Method String zzb(Context, PackageManager)>
	//   64  121:putfield        #114 <Field String zzcju>
		zzcjv = zza(context, packagemanager);
	//   65  124:aload_0         
	//   66  125:aload_1         
	//   67  126:aload           4
	//   68  128:invokestatic    #116 <Method String zza(Context, PackageManager)>
	//   69  131:putfield        #118 <Field String zzcjv>
		context = ((Context) (context.getResources()));
	//   70  134:aload_1         
	//   71  135:invokevirtual   #122 <Method Resources Context.getResources()>
	//   72  138:astore_1        
		if(context == null)
	//*  73  139:aload_1         
	//*  74  140:ifnonnull       144
			return;
	//   75  143:return          
		context = ((Context) (((Resources) (context)).getDisplayMetrics()));
	//   76  144:aload_1         
	//   77  145:invokevirtual   #128 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   78  148:astore_1        
		if(context == null)
	//*  79  149:aload_1         
	//*  80  150:ifnonnull       154
		{
			return;
	//   81  153:return          
		} else
		{
			zzagu = ((DisplayMetrics) (context)).density;
	//   82  154:aload_0         
	//   83  155:aload_1         
	//   84  156:getfield        #133 <Field float DisplayMetrics.density>
	//   85  159:putfield        #135 <Field float zzagu>
			zzcde = ((DisplayMetrics) (context)).widthPixels;
	//   86  162:aload_0         
	//   87  163:aload_1         
	//   88  164:getfield        #138 <Field int DisplayMetrics.widthPixels>
	//   89  167:putfield        #140 <Field int zzcde>
			zzcdf = ((DisplayMetrics) (context)).heightPixels;
	//   90  170:aload_0         
	//   91  171:aload_1         
	//   92  172:getfield        #143 <Field int DisplayMetrics.heightPixels>
	//   93  175:putfield        #145 <Field int zzcdf>
			return;
	//   94  178:return          
		}
	}

	public zzagb(Context context, zzaga zzaga1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		context.getPackageManager();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method PackageManager Context.getPackageManager()>
	//    4    8:pop             
		zzn(context);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #51  <Method void zzn(Context)>
		zzo(context);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #54  <Method void zzo(Context)>
		zzp(context);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokespecial   #57  <Method void zzp(Context)>
		zzckg = Build.FINGERPRINT;
	//   14   24:aload_0         
	//   15   25:getstatic       #152 <Field String Build.FINGERPRINT>
	//   16   28:putfield        #154 <Field String zzckg>
		zzckh = Build.DEVICE;
	//   17   31:aload_0         
	//   18   32:getstatic       #157 <Field String Build.DEVICE>
	//   19   35:putfield        #159 <Field String zzckh>
		boolean flag;
		if(PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzoh.zzh(context))
	//*  20   38:invokestatic    #164 <Method boolean PlatformVersion.isAtLeastIceCreamSandwichMR1()>
	//*  21   41:ifeq            56
	//*  22   44:aload_1         
	//*  23   45:invokestatic    #169 <Method boolean zzoh.zzh(Context)>
	//*  24   48:ifeq            56
			flag = true;
	//   25   51:iconst_1        
	//   26   52:istore_3        
		else
	//*  27   53:goto            58
			flag = false;
	//   28   56:iconst_0        
	//   29   57:istore_3        
		zzcki = flag;
	//   30   58:aload_0         
	//   31   59:iload_3         
	//   32   60:putfield        #171 <Field boolean zzcki>
		zzcjl = zzaga1.zzcjl;
	//   33   63:aload_0         
	//   34   64:aload_2         
	//   35   65:getfield        #174 <Field boolean zzaga.zzcjl>
	//   36   68:putfield        #71  <Field boolean zzcjl>
		zzcjm = zzaga1.zzcjm;
	//   37   71:aload_0         
	//   38   72:aload_2         
	//   39   73:getfield        #175 <Field boolean zzaga.zzcjm>
	//   40   76:putfield        #75  <Field boolean zzcjm>
		zzcjo = zzaga1.zzcjo;
	//   41   79:aload_0         
	//   42   80:aload_2         
	//   43   81:getfield        #176 <Field String zzaga.zzcjo>
	//   44   84:putfield        #81  <Field String zzcjo>
		zzcjp = zzaga1.zzcjp;
	//   45   87:aload_0         
	//   46   88:aload_2         
	//   47   89:getfield        #177 <Field boolean zzaga.zzcjp>
	//   48   92:putfield        #95  <Field boolean zzcjp>
		zzcjq = zzaga1.zzcjq;
	//   49   95:aload_0         
	//   50   96:aload_2         
	//   51   97:getfield        #178 <Field boolean zzaga.zzcjq>
	//   52  100:putfield        #103 <Field boolean zzcjq>
		zzcjt = zzaga1.zzcjt;
	//   53  103:aload_0         
	//   54  104:aload_2         
	//   55  105:getfield        #179 <Field String zzaga.zzcjt>
	//   56  108:putfield        #108 <Field String zzcjt>
		zzcju = zzaga1.zzcju;
	//   57  111:aload_0         
	//   58  112:aload_2         
	//   59  113:getfield        #180 <Field String zzaga.zzcju>
	//   60  116:putfield        #114 <Field String zzcju>
		zzcjv = zzaga1.zzcjv;
	//   61  119:aload_0         
	//   62  120:aload_2         
	//   63  121:getfield        #181 <Field String zzaga.zzcjv>
	//   64  124:putfield        #118 <Field String zzcjv>
		zzagu = zzaga1.zzagu;
	//   65  127:aload_0         
	//   66  128:aload_2         
	//   67  129:getfield        #182 <Field float zzaga.zzagu>
	//   68  132:putfield        #135 <Field float zzagu>
		zzcde = zzaga1.zzcde;
	//   69  135:aload_0         
	//   70  136:aload_2         
	//   71  137:getfield        #183 <Field int zzaga.zzcde>
	//   72  140:putfield        #140 <Field int zzcde>
		zzcdf = zzaga1.zzcdf;
	//   73  143:aload_0         
	//   74  144:aload_2         
	//   75  145:getfield        #184 <Field int zzaga.zzcdf>
	//   76  148:putfield        #145 <Field int zzcdf>
	//   77  151:return          
	}

	private static ResolveInfo zza(PackageManager packagemanager, String s)
	{
		try
		{
			packagemanager = ((PackageManager) (packagemanager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0x10000)));
	//    0    0:aload_0         
	//    1    1:new             #188 <Class Intent>
	//    2    4:dup             
	//    3    5:ldc1            #190 <String "android.intent.action.VIEW">
	//    4    7:aload_1         
	//    5    8:invokestatic    #196 <Method Uri Uri.parse(String)>
	//    6   11:invokespecial   #199 <Method void Intent(String, Uri)>
	//    7   14:ldc1            #200 <Int 0x10000>
	//    8   16:invokevirtual   #206 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:areturn         
		// Misplaced declaration of an exception variable
		catch(PackageManager packagemanager)
	//*  12   22:astore_0        
		{
			zzbv.zzeo().zza(((Throwable) (packagemanager)), "DeviceInfo.getResolveInfo");
	//   13   23:invokestatic    #212 <Method zzajm zzbv.zzeo()>
	//   14   26:aload_0         
	//   15   27:ldc1            #214 <String "DeviceInfo.getResolveInfo">
	//   16   29:invokevirtual   #219 <Method void zzajm.zza(Throwable, String)>
			return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
		}
		return ((ResolveInfo) (packagemanager));
	}

	private static String zza(Context context, PackageManager packagemanager)
	{
		int i;
		try
		{
			context = ((Context) (Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #227 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    2    4:ldc1            #229 <String "com.android.vending">
	//    3    6:sipush          128
	//    4    9:invokevirtual   #235 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//    5   12:astore_0        
		}
	//*   6   13:aload_0         
	//*   7   14:ifnull          72
	//*   8   17:aload_0         
	//*   9   18:getfield        #240 <Field int PackageInfo.versionCode>
	//*  10   21:istore_2        
	//*  11   22:aload_0         
	//*  12   23:getfield        #243 <Field String PackageInfo.packageName>
	//*  13   26:astore_0        
	//*  14   27:new             #245 <Class StringBuilder>
	//*  15   30:dup             
	//*  16   31:bipush          12
	//*  17   33:aload_0         
	//*  18   34:invokestatic    #251 <Method String String.valueOf(Object)>
	//*  19   37:invokevirtual   #255 <Method int String.length()>
	//*  20   40:iadd            
	//*  21   41:invokespecial   #258 <Method void StringBuilder(int)>
	//*  22   44:astore_1        
	//*  23   45:aload_1         
	//*  24   46:iload_2         
	//*  25   47:invokevirtual   #262 <Method StringBuilder StringBuilder.append(int)>
	//*  26   50:pop             
	//*  27   51:aload_1         
	//*  28   52:ldc2            #264 <String ".">
	//*  29   55:invokevirtual   #267 <Method StringBuilder StringBuilder.append(String)>
	//*  30   58:pop             
	//*  31   59:aload_1         
	//*  32   60:aload_0         
	//*  33   61:invokevirtual   #267 <Method StringBuilder StringBuilder.append(String)>
	//*  34   64:pop             
	//*  35   65:aload_1         
	//*  36   66:invokevirtual   #270 <Method String StringBuilder.toString()>
	//*  37   69:astore_0        
	//*  38   70:aload_0         
	//*  39   71:areturn         
	//*  40   72:aconst_null     
	//*  41   73:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  42   74:astore_0        
		{
			return null;
	//   43   75:aconst_null     
	//   44   76:areturn         
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_72;
		i = ((PackageInfo) (context)).versionCode;
		context = ((Context) (((PackageInfo) (context)).packageName));
		packagemanager = ((PackageManager) (new StringBuilder(12 + String.valueOf(((Object) (context))).length())));
		((StringBuilder) (packagemanager)).append(i);
		((StringBuilder) (packagemanager)).append(".");
		((StringBuilder) (packagemanager)).append(((String) (context)));
		context = ((Context) (((StringBuilder) (packagemanager)).toString()));
		return ((String) (context));
		return null;
	}

	private static String zzb(Context context, PackageManager packagemanager)
	{
		packagemanager = ((PackageManager) (zza(packagemanager, "market://details?id=com.google.android.gms.ads")));
	//    0    0:aload_1         
	//    1    1:ldc2            #274 <String "market://details?id=com.google.android.gms.ads">
	//    2    4:invokestatic    #69  <Method ResolveInfo zza(PackageManager, String)>
	//    3    7:astore_1        
		if(packagemanager == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		packagemanager = ((PackageManager) (((ResolveInfo) (packagemanager)).activityInfo));
	//    8   14:aload_1         
	//    9   15:getfield        #280 <Field ActivityInfo ResolveInfo.activityInfo>
	//   10   18:astore_1        
		if(packagemanager == null)
	//*  11   19:aload_1         
	//*  12   20:ifnonnull       25
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
		int i;
		try
		{
			context = ((Context) (Wrappers.packageManager(context).getPackageInfo(((ActivityInfo) (packagemanager)).packageName, 0)));
	//   15   25:aload_0         
	//   16   26:invokestatic    #227 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   17   29:aload_1         
	//   18   30:getfield        #283 <Field String ActivityInfo.packageName>
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #235 <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//   21   37:astore_0        
		}
	//*  22   38:aload_0         
	//*  23   39:ifnull          97
	//*  24   42:aload_0         
	//*  25   43:getfield        #240 <Field int PackageInfo.versionCode>
	//*  26   46:istore_2        
	//*  27   47:aload_1         
	//*  28   48:getfield        #283 <Field String ActivityInfo.packageName>
	//*  29   51:astore_0        
	//*  30   52:new             #245 <Class StringBuilder>
	//*  31   55:dup             
	//*  32   56:bipush          12
	//*  33   58:aload_0         
	//*  34   59:invokestatic    #251 <Method String String.valueOf(Object)>
	//*  35   62:invokevirtual   #255 <Method int String.length()>
	//*  36   65:iadd            
	//*  37   66:invokespecial   #258 <Method void StringBuilder(int)>
	//*  38   69:astore_1        
	//*  39   70:aload_1         
	//*  40   71:iload_2         
	//*  41   72:invokevirtual   #262 <Method StringBuilder StringBuilder.append(int)>
	//*  42   75:pop             
	//*  43   76:aload_1         
	//*  44   77:ldc2            #264 <String ".">
	//*  45   80:invokevirtual   #267 <Method StringBuilder StringBuilder.append(String)>
	//*  46   83:pop             
	//*  47   84:aload_1         
	//*  48   85:aload_0         
	//*  49   86:invokevirtual   #267 <Method StringBuilder StringBuilder.append(String)>
	//*  50   89:pop             
	//*  51   90:aload_1         
	//*  52   91:invokevirtual   #270 <Method String StringBuilder.toString()>
	//*  53   94:astore_0        
	//*  54   95:aload_0         
	//*  55   96:areturn         
	//*  56   97:aconst_null     
	//*  57   98:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  58   99:astore_0        
		{
			return null;
	//   59  100:aconst_null     
	//   60  101:areturn         
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_97;
		i = ((PackageInfo) (context)).versionCode;
		context = ((Context) (((ActivityInfo) (packagemanager)).packageName));
		packagemanager = ((PackageManager) (new StringBuilder(12 + String.valueOf(((Object) (context))).length())));
		((StringBuilder) (packagemanager)).append(i);
		((StringBuilder) (packagemanager)).append(".");
		((StringBuilder) (packagemanager)).append(((String) (context)));
		context = ((Context) (((StringBuilder) (packagemanager)).toString()));
		return ((String) (context));
		return null;
	}

	private final void zzn(Context context)
	{
		context = ((Context) ((AudioManager)context.getSystemService("audio")));
	//    0    0:aload_1         
	//    1    1:ldc2            #285 <String "audio">
	//    2    4:invokevirtual   #289 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #291 <Class AudioManager>
	//    4   10:astore_1        
		if(context != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          77
			try
			{
				zzcjk = ((AudioManager) (context)).getMode();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #294 <Method int AudioManager.getMode()>
	//   10   20:putfield        #296 <Field int zzcjk>
				zzcjr = ((AudioManager) (context)).isMusicActive();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #299 <Method boolean AudioManager.isMusicActive()>
	//   14   28:putfield        #301 <Field boolean zzcjr>
				zzcjs = ((AudioManager) (context)).isSpeakerphoneOn();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #304 <Method boolean AudioManager.isSpeakerphoneOn()>
	//   18   36:putfield        #306 <Field boolean zzcjs>
				zzcjw = ((AudioManager) (context)).getStreamVolume(3);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iconst_3        
	//   22   42:invokevirtual   #310 <Method int AudioManager.getStreamVolume(int)>
	//   23   45:putfield        #312 <Field int zzcjw>
				zzcka = ((AudioManager) (context)).getRingerMode();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #315 <Method int AudioManager.getRingerMode()>
	//   27   53:putfield        #317 <Field int zzcka>
				zzckb = ((AudioManager) (context)).getStreamVolume(2);
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:iconst_2        
	//   31   59:invokevirtual   #310 <Method int AudioManager.getStreamVolume(int)>
	//   32   62:putfield        #319 <Field int zzckb>
				return;
	//   33   65:return          
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  34   66:astore_1        
			{
				zzbv.zzeo().zza(((Throwable) (context)), "DeviceInfo.gatherAudioInfo");
	//   35   67:invokestatic    #212 <Method zzajm zzbv.zzeo()>
	//   36   70:aload_1         
	//   37   71:ldc2            #321 <String "DeviceInfo.gatherAudioInfo">
	//   38   74:invokevirtual   #219 <Method void zzajm.zza(Throwable, String)>
			}
		zzcjk = -2;
	//   39   77:aload_0         
	//   40   78:bipush          -2
	//   41   80:putfield        #296 <Field int zzcjk>
		zzcjr = false;
	//   42   83:aload_0         
	//   43   84:iconst_0        
	//   44   85:putfield        #301 <Field boolean zzcjr>
		zzcjs = false;
	//   45   88:aload_0         
	//   46   89:iconst_0        
	//   47   90:putfield        #306 <Field boolean zzcjs>
		zzcjw = 0;
	//   48   93:aload_0         
	//   49   94:iconst_0        
	//   50   95:putfield        #312 <Field int zzcjw>
		zzcka = 0;
	//   51   98:aload_0         
	//   52   99:iconst_0        
	//   53  100:putfield        #317 <Field int zzcka>
		zzckb = 0;
	//   54  103:aload_0         
	//   55  104:iconst_0        
	//   56  105:putfield        #319 <Field int zzckb>
	//   57  108:return          
	}

	private final void zzo(Context context)
	{
		TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
	//    0    0:aload_1         
	//    1    1:ldc2            #326 <String "phone">
	//    2    4:invokevirtual   #289 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #328 <Class TelephonyManager>
	//    4   10:astore_3        
		ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
	//    5   11:aload_1         
	//    6   12:ldc2            #330 <String "connectivity">
	//    7   15:invokevirtual   #289 <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #332 <Class ConnectivityManager>
	//    9   21:astore_2        
		zzcjn = telephonymanager.getNetworkOperator();
	//   10   22:aload_0         
	//   11   23:aload_3         
	//   12   24:invokevirtual   #335 <Method String TelephonyManager.getNetworkOperator()>
	//   13   27:putfield        #337 <Field String zzcjn>
		zzcjy = telephonymanager.getNetworkType();
	//   14   30:aload_0         
	//   15   31:aload_3         
	//   16   32:invokevirtual   #340 <Method int TelephonyManager.getNetworkType()>
	//   17   35:putfield        #342 <Field int zzcjy>
		zzcjz = telephonymanager.getPhoneType();
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:invokevirtual   #345 <Method int TelephonyManager.getPhoneType()>
	//   21   43:putfield        #347 <Field int zzcjz>
		zzcjx = -2;
	//   22   46:aload_0         
	//   23   47:bipush          -2
	//   24   49:putfield        #349 <Field int zzcjx>
		zzcke = false;
	//   25   52:aload_0         
	//   26   53:iconst_0        
	//   27   54:putfield        #351 <Field boolean zzcke>
		zzckf = -1;
	//   28   57:aload_0         
	//   29   58:iconst_m1       
	//   30   59:putfield        #353 <Field int zzckf>
		zzbv.zzek();
	//   31   62:invokestatic    #357 <Method zzakk zzbv.zzek()>
	//   32   65:pop             
		if(zzakk.zzl(context, "android.permission.ACCESS_NETWORK_STATE"))
	//*  33   66:aload_1         
	//*  34   67:ldc2            #359 <String "android.permission.ACCESS_NETWORK_STATE">
	//*  35   70:invokestatic    #365 <Method boolean zzakk.zzl(Context, String)>
	//*  36   73:ifeq            128
		{
			context = ((Context) (connectivitymanager.getActiveNetworkInfo()));
	//   37   76:aload_2         
	//   38   77:invokevirtual   #369 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//   39   80:astore_1        
			if(context != null)
	//*  40   81:aload_1         
	//*  41   82:ifnull          107
			{
				zzcjx = ((NetworkInfo) (context)).getType();
	//   42   85:aload_0         
	//   43   86:aload_1         
	//   44   87:invokevirtual   #374 <Method int NetworkInfo.getType()>
	//   45   90:putfield        #349 <Field int zzcjx>
				zzckf = ((NetworkInfo) (context)).getDetailedState().ordinal();
	//   46   93:aload_0         
	//   47   94:aload_1         
	//   48   95:invokevirtual   #378 <Method android.net.NetworkInfo$DetailedState NetworkInfo.getDetailedState()>
	//   49   98:invokevirtual   #383 <Method int android.net.NetworkInfo$DetailedState.ordinal()>
	//   50  101:putfield        #353 <Field int zzckf>
			} else
	//*  51  104:goto            112
			{
				zzcjx = -1;
	//   52  107:aload_0         
	//   53  108:iconst_m1       
	//   54  109:putfield        #349 <Field int zzcjx>
			}
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  55  112:getstatic       #388 <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  115:bipush          16
	//*  57  117:icmplt          128
				zzcke = connectivitymanager.isActiveNetworkMetered();
	//   58  120:aload_0         
	//   59  121:aload_2         
	//   60  122:invokevirtual   #391 <Method boolean ConnectivityManager.isActiveNetworkMetered()>
	//   61  125:putfield        #351 <Field boolean zzcke>
		}
	//   62  128:return          
	}

	private final void zzp(Context context)
	{
		context = ((Context) (context.registerReceiver(((android.content.BroadcastReceiver) (null)), new IntentFilter("android.intent.action.BATTERY_CHANGED"))));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:new             #394 <Class IntentFilter>
	//    3    5:dup             
	//    4    6:ldc2            #396 <String "android.intent.action.BATTERY_CHANGED">
	//    5    9:invokespecial   #399 <Method void IntentFilter(String)>
	//    6   12:invokevirtual   #403 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//    7   15:astore_1        
		boolean flag = false;
	//    8   16:iconst_0        
	//    9   17:istore          5
		if(context != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          82
		{
			int i = ((Intent) (context)).getIntExtra("status", -1);
	//   12   23:aload_1         
	//   13   24:ldc2            #405 <String "status">
	//   14   27:iconst_m1       
	//   15   28:invokevirtual   #409 <Method int Intent.getIntExtra(String, int)>
	//   16   31:istore_2        
			int j = ((Intent) (context)).getIntExtra("level", -1);
	//   17   32:aload_1         
	//   18   33:ldc2            #411 <String "level">
	//   19   36:iconst_m1       
	//   20   37:invokevirtual   #409 <Method int Intent.getIntExtra(String, int)>
	//   21   40:istore_3        
			int k = ((Intent) (context)).getIntExtra("scale", -1);
	//   22   41:aload_1         
	//   23   42:ldc2            #413 <String "scale">
	//   24   45:iconst_m1       
	//   25   46:invokevirtual   #409 <Method int Intent.getIntExtra(String, int)>
	//   26   49:istore          4
			zzckc = (float)j / (float)k;
	//   27   51:aload_0         
	//   28   52:iload_3         
	//   29   53:i2f             
	//   30   54:iload           4
	//   31   56:i2f             
	//   32   57:fdiv            
	//   33   58:f2d             
	//   34   59:putfield        #415 <Field double zzckc>
			if(i == 2 || i == 5)
	//*  35   62:iload_2         
	//*  36   63:iconst_2        
	//*  37   64:icmpeq          72
	//*  38   67:iload_2         
	//*  39   68:iconst_5        
	//*  40   69:icmpne          75
				flag = true;
	//   41   72:iconst_1        
	//   42   73:istore          5
			zzckd = flag;
	//   43   75:aload_0         
	//   44   76:iload           5
	//   45   78:putfield        #417 <Field boolean zzckd>
			return;
	//   46   81:return          
		} else
		{
			zzckc = -1D;
	//   47   82:aload_0         
	//   48   83:ldc2w           #418 <Double -1D>
	//   49   86:putfield        #415 <Field double zzckc>
			zzckd = false;
	//   50   89:aload_0         
	//   51   90:iconst_0        
	//   52   91:putfield        #417 <Field boolean zzckd>
			return;
	//   53   94:return          
		}
	}

	public final zzaga zzoo()
	{
		return new zzaga(zzcjk, zzcjl, zzcjm, zzcjn, zzcjo, zzcjp, zzcjq, zzcjr, zzcjs, zzcjt, zzcju, zzcjv, zzcjw, zzcjx, zzcjy, zzcjz, zzcka, zzckb, zzagu, zzcde, zzcdf, zzckc, zzckd, zzcke, zzckf, zzckg, zzcki, zzckh);
	//    0    0:new             #173 <Class zzaga>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #296 <Field int zzcjk>
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field boolean zzcjl>
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field boolean zzcjm>
	//    8   16:aload_0         
	//    9   17:getfield        #337 <Field String zzcjn>
	//   10   20:aload_0         
	//   11   21:getfield        #81  <Field String zzcjo>
	//   12   24:aload_0         
	//   13   25:getfield        #95  <Field boolean zzcjp>
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field boolean zzcjq>
	//   16   32:aload_0         
	//   17   33:getfield        #301 <Field boolean zzcjr>
	//   18   36:aload_0         
	//   19   37:getfield        #306 <Field boolean zzcjs>
	//   20   40:aload_0         
	//   21   41:getfield        #108 <Field String zzcjt>
	//   22   44:aload_0         
	//   23   45:getfield        #114 <Field String zzcju>
	//   24   48:aload_0         
	//   25   49:getfield        #118 <Field String zzcjv>
	//   26   52:aload_0         
	//   27   53:getfield        #312 <Field int zzcjw>
	//   28   56:aload_0         
	//   29   57:getfield        #349 <Field int zzcjx>
	//   30   60:aload_0         
	//   31   61:getfield        #342 <Field int zzcjy>
	//   32   64:aload_0         
	//   33   65:getfield        #347 <Field int zzcjz>
	//   34   68:aload_0         
	//   35   69:getfield        #317 <Field int zzcka>
	//   36   72:aload_0         
	//   37   73:getfield        #319 <Field int zzckb>
	//   38   76:aload_0         
	//   39   77:getfield        #135 <Field float zzagu>
	//   40   80:aload_0         
	//   41   81:getfield        #140 <Field int zzcde>
	//   42   84:aload_0         
	//   43   85:getfield        #145 <Field int zzcdf>
	//   44   88:aload_0         
	//   45   89:getfield        #415 <Field double zzckc>
	//   46   92:aload_0         
	//   47   93:getfield        #417 <Field boolean zzckd>
	//   48   96:aload_0         
	//   49   97:getfield        #351 <Field boolean zzcke>
	//   50  100:aload_0         
	//   51  101:getfield        #353 <Field int zzckf>
	//   52  104:aload_0         
	//   53  105:getfield        #154 <Field String zzckg>
	//   54  108:aload_0         
	//   55  109:getfield        #171 <Field boolean zzcki>
	//   56  112:aload_0         
	//   57  113:getfield        #159 <Field String zzckh>
	//   58  116:invokespecial   #424 <Method void zzaga(int, boolean, boolean, String, String, boolean, boolean, boolean, boolean, String, String, String, int, int, int, int, int, int, float, int, int, double, boolean, boolean, int, String, boolean, String)>
	//   59  119:areturn         
	}

	private float zzagu;
	private int zzcde;
	private int zzcdf;
	private int zzcjk;
	private boolean zzcjl;
	private boolean zzcjm;
	private String zzcjn;
	private String zzcjo;
	private boolean zzcjp;
	private boolean zzcjq;
	private boolean zzcjr;
	private boolean zzcjs;
	private String zzcjt;
	private String zzcju;
	private String zzcjv;
	private int zzcjw;
	private int zzcjx;
	private int zzcjy;
	private int zzcjz;
	private int zzcka;
	private int zzckb;
	private double zzckc;
	private boolean zzckd;
	private boolean zzcke;
	private int zzckf;
	private String zzckg;
	private String zzckh;
	private boolean zzcki;
}
