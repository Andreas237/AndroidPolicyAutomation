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
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.b.b;
import com.google.android.gms.common.b.c;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.o;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwk, zv, an, sw, 
//			wi, xg

public final class sy
{

	public sy(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		PackageManager packagemanager = context.getPackageManager();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method PackageManager Context.getPackageManager()>
	//    4    8:astore          4
		a(context);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokespecial   #51  <Method void a(Context)>
		b(context);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokespecial   #53  <Method void b(Context)>
		c(context);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokespecial   #55  <Method void c(Context)>
		Locale locale = Locale.getDefault();
	//   14   25:invokestatic    #61  <Method Locale Locale.getDefault()>
	//   15   28:astore          5
		ResolveInfo resolveinfo = a(packagemanager, "geo:0,0?q=donuts");
	//   16   30:aload           4
	//   17   32:ldc1            #63  <String "geo:0,0?q=donuts">
	//   18   34:invokestatic    #66  <Method ResolveInfo a(PackageManager, String)>
	//   19   37:astore          6
		boolean flag1 = true;
	//   20   39:iconst_1        
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
		q = flag;
	//   29   53:aload_0         
	//   30   54:iload_2         
	//   31   55:putfield        #68  <Field boolean q>
		if(a(packagemanager, "http://www.google.com") != null)
	//*  32   58:aload           4
	//*  33   60:ldc1            #70  <String "http://www.google.com">
	//*  34   62:invokestatic    #66  <Method ResolveInfo a(PackageManager, String)>
	//*  35   65:ifnull          73
			flag = flag1;
	//   36   68:iload_3         
	//   37   69:istore_2        
		else
	//*  38   70:goto            75
			flag = false;
	//   39   73:iconst_0        
	//   40   74:istore_2        
		r = flag;
	//   41   75:aload_0         
	//   42   76:iload_2         
	//   43   77:putfield        #72  <Field boolean r>
		s = locale.getCountry();
	//   44   80:aload_0         
	//   45   81:aload           5
	//   46   83:invokevirtual   #76  <Method String Locale.getCountry()>
	//   47   86:putfield        #78  <Field String s>
		bwk.a();
	//   48   89:invokestatic    #83  <Method zv bwk.a()>
	//   49   92:pop             
		t = zv.a();
	//   50   93:aload_0         
	//   51   94:invokestatic    #88  <Method boolean zv.a()>
	//   52   97:putfield        #90  <Field boolean t>
		u = com.google.android.gms.common.util.i.d(context);
	//   53  100:aload_0         
	//   54  101:aload_1         
	//   55  102:invokestatic    #95  <Method boolean i.d(Context)>
	//   56  105:putfield        #97  <Field boolean u>
		v = com.google.android.gms.common.util.i.c(context);
	//   57  108:aload_0         
	//   58  109:aload_1         
	//   59  110:invokestatic    #99  <Method boolean i.c(Context)>
	//   60  113:putfield        #101 <Field boolean v>
		w = locale.getLanguage();
	//   61  116:aload_0         
	//   62  117:aload           5
	//   63  119:invokevirtual   #104 <Method String Locale.getLanguage()>
	//   64  122:putfield        #106 <Field String w>
		x = a(context, packagemanager);
	//   65  125:aload_0         
	//   66  126:aload_1         
	//   67  127:aload           4
	//   68  129:invokestatic    #109 <Method String a(Context, PackageManager)>
	//   69  132:putfield        #111 <Field String x>
		B = d(context);
	//   70  135:aload_0         
	//   71  136:aload_1         
	//   72  137:invokestatic    #114 <Method String d(Context)>
	//   73  140:putfield        #116 <Field String B>
		context = ((Context) (context.getResources()));
	//   74  143:aload_1         
	//   75  144:invokevirtual   #120 <Method Resources Context.getResources()>
	//   76  147:astore_1        
		if(context == null)
	//*  77  148:aload_1         
	//*  78  149:ifnonnull       153
			return;
	//   79  152:return          
		context = ((Context) (((Resources) (context)).getDisplayMetrics()));
	//   80  153:aload_1         
	//   81  154:invokevirtual   #126 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   82  157:astore_1        
		if(context == null)
	//*  83  158:aload_1         
	//*  84  159:ifnonnull       163
		{
			return;
	//   85  162:return          
		} else
		{
			y = ((DisplayMetrics) (context)).density;
	//   86  163:aload_0         
	//   87  164:aload_1         
	//   88  165:getfield        #131 <Field float DisplayMetrics.density>
	//   89  168:putfield        #133 <Field float y>
			z = ((DisplayMetrics) (context)).widthPixels;
	//   90  171:aload_0         
	//   91  172:aload_1         
	//   92  173:getfield        #136 <Field int DisplayMetrics.widthPixels>
	//   93  176:putfield        #138 <Field int z>
			A = ((DisplayMetrics) (context)).heightPixels;
	//   94  179:aload_0         
	//   95  180:aload_1         
	//   96  181:getfield        #141 <Field int DisplayMetrics.heightPixels>
	//   97  184:putfield        #143 <Field int A>
			return;
	//   98  187:return          
		}
	}

	public sy(Context context, sw sw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		a(context);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #51  <Method void a(Context)>
		b(context);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #53  <Method void b(Context)>
		c(context);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #55  <Method void c(Context)>
		o = Build.FINGERPRINT;
	//   11   19:aload_0         
	//   12   20:getstatic       #150 <Field String Build.FINGERPRINT>
	//   13   23:putfield        #152 <Field String o>
		p = Build.DEVICE;
	//   14   26:aload_0         
	//   15   27:getstatic       #155 <Field String Build.DEVICE>
	//   16   30:putfield        #157 <Field String p>
		boolean flag;
		if(com.google.android.gms.common.util.o.b() && an.a(context))
	//*  17   33:invokestatic    #161 <Method boolean o.b()>
	//*  18   36:ifeq            51
	//*  19   39:aload_1         
	//*  20   40:invokestatic    #165 <Method boolean an.a(Context)>
	//*  21   43:ifeq            51
			flag = true;
	//   22   46:iconst_1        
	//   23   47:istore_3        
		else
	//*  24   48:goto            53
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_3        
		C = flag;
	//   27   53:aload_0         
	//   28   54:iload_3         
	//   29   55:putfield        #167 <Field boolean C>
		q = sw1.b;
	//   30   58:aload_0         
	//   31   59:aload_2         
	//   32   60:getfield        #171 <Field boolean com.google.android.gms.internal.ads.sw.b>
	//   33   63:putfield        #68  <Field boolean q>
		r = sw1.c;
	//   34   66:aload_0         
	//   35   67:aload_2         
	//   36   68:getfield        #173 <Field boolean com.google.android.gms.internal.ads.sw.c>
	//   37   71:putfield        #72  <Field boolean r>
		s = sw1.e;
	//   38   74:aload_0         
	//   39   75:aload_2         
	//   40   76:getfield        #175 <Field String sw.e>
	//   41   79:putfield        #78  <Field String s>
		t = sw1.f;
	//   42   82:aload_0         
	//   43   83:aload_2         
	//   44   84:getfield        #177 <Field boolean sw.f>
	//   45   87:putfield        #90  <Field boolean t>
		u = sw1.g;
	//   46   90:aload_0         
	//   47   91:aload_2         
	//   48   92:getfield        #179 <Field boolean sw.g>
	//   49   95:putfield        #97  <Field boolean u>
		v = sw1.h;
	//   50   98:aload_0         
	//   51   99:aload_2         
	//   52  100:getfield        #181 <Field boolean sw.h>
	//   53  103:putfield        #101 <Field boolean v>
		w = sw1.k;
	//   54  106:aload_0         
	//   55  107:aload_2         
	//   56  108:getfield        #183 <Field String sw.k>
	//   57  111:putfield        #106 <Field String w>
		x = sw1.l;
	//   58  114:aload_0         
	//   59  115:aload_2         
	//   60  116:getfield        #185 <Field String sw.l>
	//   61  119:putfield        #111 <Field String x>
		B = sw1.m;
	//   62  122:aload_0         
	//   63  123:aload_2         
	//   64  124:getfield        #187 <Field String sw.m>
	//   65  127:putfield        #116 <Field String B>
		y = sw1.t;
	//   66  130:aload_0         
	//   67  131:aload_2         
	//   68  132:getfield        #189 <Field float sw.t>
	//   69  135:putfield        #133 <Field float y>
		z = sw1.u;
	//   70  138:aload_0         
	//   71  139:aload_2         
	//   72  140:getfield        #191 <Field int sw.u>
	//   73  143:putfield        #138 <Field int z>
		A = sw1.v;
	//   74  146:aload_0         
	//   75  147:aload_2         
	//   76  148:getfield        #193 <Field int sw.v>
	//   77  151:putfield        #143 <Field int A>
	//   78  154:return          
	}

	private static ResolveInfo a(PackageManager packagemanager, String s1)
	{
		try
		{
			packagemanager = ((PackageManager) (packagemanager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1)), 0x10000)));
	//    0    0:aload_0         
	//    1    1:new             #197 <Class Intent>
	//    2    4:dup             
	//    3    5:ldc1            #199 <String "android.intent.action.VIEW">
	//    4    7:aload_1         
	//    5    8:invokestatic    #205 <Method Uri Uri.parse(String)>
	//    6   11:invokespecial   #208 <Method void Intent(String, Uri)>
	//    7   14:ldc1            #209 <Int 0x10000>
	//    8   16:invokevirtual   #215 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:areturn         
		// Misplaced declaration of an exception variable
		catch(PackageManager packagemanager)
	//*  12   22:astore_0        
		{
			aw.i().a(((Throwable) (packagemanager)), "DeviceInfo.getResolveInfo");
	//   13   23:invokestatic    #220 <Method wi aw.i()>
	//   14   26:aload_0         
	//   15   27:ldc1            #222 <String "DeviceInfo.getResolveInfo">
	//   16   29:invokevirtual   #227 <Method void wi.a(Throwable, String)>
			return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
		}
		return ((ResolveInfo) (packagemanager));
	}

	private static String a(Context context, PackageManager packagemanager)
	{
		packagemanager = ((PackageManager) (a(packagemanager, "market://details?id=com.google.android.gms.ads")));
	//    0    0:aload_1         
	//    1    1:ldc1            #231 <String "market://details?id=com.google.android.gms.ads">
	//    2    3:invokestatic    #66  <Method ResolveInfo a(PackageManager, String)>
	//    3    6:astore_1        
		if(packagemanager == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       13
			return null;
	//    6   11:aconst_null     
	//    7   12:areturn         
		packagemanager = ((PackageManager) (((ResolveInfo) (packagemanager)).activityInfo));
	//    8   13:aload_1         
	//    9   14:getfield        #237 <Field ActivityInfo ResolveInfo.activityInfo>
	//   10   17:astore_1        
		if(packagemanager == null)
	//*  11   18:aload_1         
	//*  12   19:ifnonnull       24
			return null;
	//   13   22:aconst_null     
	//   14   23:areturn         
		int i1;
		try
		{
			context = ((Context) (com.google.android.gms.common.b.c.a(context).b(((ActivityInfo) (packagemanager)).packageName, 0)));
	//   15   24:aload_0         
	//   16   25:invokestatic    #242 <Method b c.a(Context)>
	//   17   28:aload_1         
	//   18   29:getfield        #247 <Field String ActivityInfo.packageName>
	//   19   32:iconst_0        
	//   20   33:invokevirtual   #252 <Method PackageInfo b.b(String, int)>
	//   21   36:astore_0        
		}
	//*  22   37:aload_0         
	//*  23   38:ifnull          96
	//*  24   41:aload_0         
	//*  25   42:getfield        #257 <Field int PackageInfo.versionCode>
	//*  26   45:istore_2        
	//*  27   46:aload_1         
	//*  28   47:getfield        #247 <Field String ActivityInfo.packageName>
	//*  29   50:astore_0        
	//*  30   51:new             #259 <Class StringBuilder>
	//*  31   54:dup             
	//*  32   55:aload_0         
	//*  33   56:invokestatic    #265 <Method String String.valueOf(Object)>
	//*  34   59:invokevirtual   #269 <Method int String.length()>
	//*  35   62:bipush          12
	//*  36   64:iadd            
	//*  37   65:invokespecial   #272 <Method void StringBuilder(int)>
	//*  38   68:astore_1        
	//*  39   69:aload_1         
	//*  40   70:iload_2         
	//*  41   71:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//*  42   74:pop             
	//*  43   75:aload_1         
	//*  44   76:ldc2            #278 <String ".">
	//*  45   79:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//*  46   82:pop             
	//*  47   83:aload_1         
	//*  48   84:aload_0         
	//*  49   85:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//*  50   88:pop             
	//*  51   89:aload_1         
	//*  52   90:invokevirtual   #284 <Method String StringBuilder.toString()>
	//*  53   93:astore_0        
	//*  54   94:aload_0         
	//*  55   95:areturn         
	//*  56   96:aconst_null     
	//*  57   97:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  58   98:astore_0        
		{
			return null;
	//   59   99:aconst_null     
	//   60  100:areturn         
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_96;
		i1 = ((PackageInfo) (context)).versionCode;
		context = ((Context) (((ActivityInfo) (packagemanager)).packageName));
		packagemanager = ((PackageManager) (new StringBuilder(String.valueOf(((Object) (context))).length() + 12)));
		((StringBuilder) (packagemanager)).append(i1);
		((StringBuilder) (packagemanager)).append(".");
		((StringBuilder) (packagemanager)).append(((String) (context)));
		context = ((Context) (((StringBuilder) (packagemanager)).toString()));
		return ((String) (context));
		return null;
	}

	private final void a(Context context)
	{
		context = ((Context) ((AudioManager)context.getSystemService("audio")));
	//    0    0:aload_1         
	//    1    1:ldc2            #286 <String "audio">
	//    2    4:invokevirtual   #290 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #292 <Class AudioManager>
	//    4   10:astore_1        
		if(context != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          77
			try
			{
				a = ((AudioManager) (context)).getMode();
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #295 <Method int AudioManager.getMode()>
	//   10   20:putfield        #297 <Field int a>
				b = ((AudioManager) (context)).isMusicActive();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #300 <Method boolean AudioManager.isMusicActive()>
	//   14   28:putfield        #301 <Field boolean b>
				c = ((AudioManager) (context)).isSpeakerphoneOn();
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #304 <Method boolean AudioManager.isSpeakerphoneOn()>
	//   18   36:putfield        #305 <Field boolean c>
				d = ((AudioManager) (context)).getStreamVolume(3);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iconst_3        
	//   22   42:invokevirtual   #309 <Method int AudioManager.getStreamVolume(int)>
	//   23   45:putfield        #311 <Field int d>
				e = ((AudioManager) (context)).getRingerMode();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #314 <Method int AudioManager.getRingerMode()>
	//   27   53:putfield        #316 <Field int e>
				f = ((AudioManager) (context)).getStreamVolume(2);
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:iconst_2        
	//   31   59:invokevirtual   #309 <Method int AudioManager.getStreamVolume(int)>
	//   32   62:putfield        #318 <Field int f>
				return;
	//   33   65:return          
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  34   66:astore_1        
			{
				aw.i().a(((Throwable) (context)), "DeviceInfo.gatherAudioInfo");
	//   35   67:invokestatic    #220 <Method wi aw.i()>
	//   36   70:aload_1         
	//   37   71:ldc2            #320 <String "DeviceInfo.gatherAudioInfo">
	//   38   74:invokevirtual   #227 <Method void wi.a(Throwable, String)>
			}
		a = -2;
	//   39   77:aload_0         
	//   40   78:bipush          -2
	//   41   80:putfield        #297 <Field int a>
		b = false;
	//   42   83:aload_0         
	//   43   84:iconst_0        
	//   44   85:putfield        #301 <Field boolean b>
		c = false;
	//   45   88:aload_0         
	//   46   89:iconst_0        
	//   47   90:putfield        #305 <Field boolean c>
		d = 0;
	//   48   93:aload_0         
	//   49   94:iconst_0        
	//   50   95:putfield        #311 <Field int d>
		e = 0;
	//   51   98:aload_0         
	//   52   99:iconst_0        
	//   53  100:putfield        #316 <Field int e>
		f = 0;
	//   54  103:aload_0         
	//   55  104:iconst_0        
	//   56  105:putfield        #318 <Field int f>
	//   57  108:return          
	}

	private final void b(Context context)
	{
		TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
	//    0    0:aload_1         
	//    1    1:ldc2            #325 <String "phone">
	//    2    4:invokevirtual   #290 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #327 <Class TelephonyManager>
	//    4   10:astore_3        
		ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
	//    5   11:aload_1         
	//    6   12:ldc2            #329 <String "connectivity">
	//    7   15:invokevirtual   #290 <Method Object Context.getSystemService(String)>
	//    8   18:checkcast       #331 <Class ConnectivityManager>
	//    9   21:astore_2        
		g = telephonymanager.getNetworkOperator();
	//   10   22:aload_0         
	//   11   23:aload_3         
	//   12   24:invokevirtual   #334 <Method String TelephonyManager.getNetworkOperator()>
	//   13   27:putfield        #336 <Field String g>
		i = telephonymanager.getNetworkType();
	//   14   30:aload_0         
	//   15   31:aload_3         
	//   16   32:invokevirtual   #339 <Method int TelephonyManager.getNetworkType()>
	//   17   35:putfield        #341 <Field int i>
		j = telephonymanager.getPhoneType();
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:invokevirtual   #344 <Method int TelephonyManager.getPhoneType()>
	//   21   43:putfield        #346 <Field int j>
		h = -2;
	//   22   46:aload_0         
	//   23   47:bipush          -2
	//   24   49:putfield        #348 <Field int h>
		k = false;
	//   25   52:aload_0         
	//   26   53:iconst_0        
	//   27   54:putfield        #350 <Field boolean k>
		l = -1;
	//   28   57:aload_0         
	//   29   58:iconst_m1       
	//   30   59:putfield        #352 <Field int l>
		aw.e();
	//   31   62:invokestatic    #355 <Method xg aw.e()>
	//   32   65:pop             
		if(xg.a(context, "android.permission.ACCESS_NETWORK_STATE"))
	//*  33   66:aload_1         
	//*  34   67:ldc2            #357 <String "android.permission.ACCESS_NETWORK_STATE">
	//*  35   70:invokestatic    #362 <Method boolean xg.a(Context, String)>
	//*  36   73:ifeq            128
		{
			context = ((Context) (connectivitymanager.getActiveNetworkInfo()));
	//   37   76:aload_2         
	//   38   77:invokevirtual   #366 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//   39   80:astore_1        
			if(context != null)
	//*  40   81:aload_1         
	//*  41   82:ifnull          107
			{
				h = ((NetworkInfo) (context)).getType();
	//   42   85:aload_0         
	//   43   86:aload_1         
	//   44   87:invokevirtual   #371 <Method int NetworkInfo.getType()>
	//   45   90:putfield        #348 <Field int h>
				l = ((NetworkInfo) (context)).getDetailedState().ordinal();
	//   46   93:aload_0         
	//   47   94:aload_1         
	//   48   95:invokevirtual   #375 <Method android.net.NetworkInfo$DetailedState NetworkInfo.getDetailedState()>
	//   49   98:invokevirtual   #380 <Method int android.net.NetworkInfo$DetailedState.ordinal()>
	//   50  101:putfield        #352 <Field int l>
			} else
	//*  51  104:goto            112
			{
				h = -1;
	//   52  107:aload_0         
	//   53  108:iconst_m1       
	//   54  109:putfield        #348 <Field int h>
			}
			if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  55  112:getstatic       #385 <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  115:bipush          16
	//*  57  117:icmplt          128
				k = connectivitymanager.isActiveNetworkMetered();
	//   58  120:aload_0         
	//   59  121:aload_2         
	//   60  122:invokevirtual   #388 <Method boolean ConnectivityManager.isActiveNetworkMetered()>
	//   61  125:putfield        #350 <Field boolean k>
		}
	//   62  128:return          
	}

	private final void c(Context context)
	{
		context = ((Context) (context.registerReceiver(((android.content.BroadcastReceiver) (null)), new IntentFilter("android.intent.action.BATTERY_CHANGED"))));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:new             #391 <Class IntentFilter>
	//    3    5:dup             
	//    4    6:ldc2            #393 <String "android.intent.action.BATTERY_CHANGED">
	//    5    9:invokespecial   #396 <Method void IntentFilter(String)>
	//    6   12:invokevirtual   #400 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//    7   15:astore_1        
		boolean flag = false;
	//    8   16:iconst_0        
	//    9   17:istore          5
		if(context != null)
	//*  10   19:aload_1         
	//*  11   20:ifnull          82
		{
			int i1 = ((Intent) (context)).getIntExtra("status", -1);
	//   12   23:aload_1         
	//   13   24:ldc2            #402 <String "status">
	//   14   27:iconst_m1       
	//   15   28:invokevirtual   #406 <Method int Intent.getIntExtra(String, int)>
	//   16   31:istore_2        
			int j1 = ((Intent) (context)).getIntExtra("level", -1);
	//   17   32:aload_1         
	//   18   33:ldc2            #408 <String "level">
	//   19   36:iconst_m1       
	//   20   37:invokevirtual   #406 <Method int Intent.getIntExtra(String, int)>
	//   21   40:istore_3        
			int k1 = ((Intent) (context)).getIntExtra("scale", -1);
	//   22   41:aload_1         
	//   23   42:ldc2            #410 <String "scale">
	//   24   45:iconst_m1       
	//   25   46:invokevirtual   #406 <Method int Intent.getIntExtra(String, int)>
	//   26   49:istore          4
			m = (float)j1 / (float)k1;
	//   27   51:aload_0         
	//   28   52:iload_3         
	//   29   53:i2f             
	//   30   54:iload           4
	//   31   56:i2f             
	//   32   57:fdiv            
	//   33   58:f2d             
	//   34   59:putfield        #412 <Field double m>
			if(i1 == 2 || i1 == 5)
	//*  35   62:iload_2         
	//*  36   63:iconst_2        
	//*  37   64:icmpeq          72
	//*  38   67:iload_2         
	//*  39   68:iconst_5        
	//*  40   69:icmpne          75
				flag = true;
	//   41   72:iconst_1        
	//   42   73:istore          5
			n = flag;
	//   43   75:aload_0         
	//   44   76:iload           5
	//   45   78:putfield        #414 <Field boolean n>
			return;
	//   46   81:return          
		} else
		{
			m = -1D;
	//   47   82:aload_0         
	//   48   83:ldc2w           #415 <Double -1D>
	//   49   86:putfield        #412 <Field double m>
			n = false;
	//   50   89:aload_0         
	//   51   90:iconst_0        
	//   52   91:putfield        #414 <Field boolean n>
			return;
	//   53   94:return          
		}
	}

	private static String d(Context context)
	{
		int i1;
		StringBuilder stringbuilder;
		try
		{
			context = ((Context) (com.google.android.gms.common.b.c.a(context).b("com.android.vending", 128)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #242 <Method b c.a(Context)>
	//    2    4:ldc2            #420 <String "com.android.vending">
	//    3    7:sipush          128
	//    4   10:invokevirtual   #252 <Method PackageInfo b.b(String, int)>
	//    5   13:astore_0        
		}
	//*   6   14:aload_0         
	//*   7   15:ifnull          73
	//*   8   18:aload_0         
	//*   9   19:getfield        #257 <Field int PackageInfo.versionCode>
	//*  10   22:istore_1        
	//*  11   23:aload_0         
	//*  12   24:getfield        #421 <Field String PackageInfo.packageName>
	//*  13   27:astore_0        
	//*  14   28:new             #259 <Class StringBuilder>
	//*  15   31:dup             
	//*  16   32:aload_0         
	//*  17   33:invokestatic    #265 <Method String String.valueOf(Object)>
	//*  18   36:invokevirtual   #269 <Method int String.length()>
	//*  19   39:bipush          12
	//*  20   41:iadd            
	//*  21   42:invokespecial   #272 <Method void StringBuilder(int)>
	//*  22   45:astore_2        
	//*  23   46:aload_2         
	//*  24   47:iload_1         
	//*  25   48:invokevirtual   #276 <Method StringBuilder StringBuilder.append(int)>
	//*  26   51:pop             
	//*  27   52:aload_2         
	//*  28   53:ldc2            #278 <String ".">
	//*  29   56:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//*  30   59:pop             
	//*  31   60:aload_2         
	//*  32   61:aload_0         
	//*  33   62:invokevirtual   #281 <Method StringBuilder StringBuilder.append(String)>
	//*  34   65:pop             
	//*  35   66:aload_2         
	//*  36   67:invokevirtual   #284 <Method String StringBuilder.toString()>
	//*  37   70:astore_0        
	//*  38   71:aload_0         
	//*  39   72:areturn         
	//*  40   73:aconst_null     
	//*  41   74:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  42   75:astore_0        
		{
			return null;
	//   43   76:aconst_null     
	//   44   77:areturn         
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_73;
		i1 = ((PackageInfo) (context)).versionCode;
		context = ((Context) (((PackageInfo) (context)).packageName));
		stringbuilder = new StringBuilder(String.valueOf(((Object) (context))).length() + 12);
		stringbuilder.append(i1);
		stringbuilder.append(".");
		stringbuilder.append(((String) (context)));
		context = ((Context) (stringbuilder.toString()));
		return ((String) (context));
		return null;
	}

	public final sw a()
	{
		return new sw(a, q, r, g, s, t, u, v, b, c, w, x, B, d, h, i, j, e, f, y, z, A, m, n, k, l, o, C, p);
	//    0    0:new             #169 <Class sw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field int a>
	//    4    8:aload_0         
	//    5    9:getfield        #68  <Field boolean q>
	//    6   12:aload_0         
	//    7   13:getfield        #72  <Field boolean r>
	//    8   16:aload_0         
	//    9   17:getfield        #336 <Field String g>
	//   10   20:aload_0         
	//   11   21:getfield        #78  <Field String s>
	//   12   24:aload_0         
	//   13   25:getfield        #90  <Field boolean t>
	//   14   28:aload_0         
	//   15   29:getfield        #97  <Field boolean u>
	//   16   32:aload_0         
	//   17   33:getfield        #101 <Field boolean v>
	//   18   36:aload_0         
	//   19   37:getfield        #301 <Field boolean b>
	//   20   40:aload_0         
	//   21   41:getfield        #305 <Field boolean c>
	//   22   44:aload_0         
	//   23   45:getfield        #106 <Field String w>
	//   24   48:aload_0         
	//   25   49:getfield        #111 <Field String x>
	//   26   52:aload_0         
	//   27   53:getfield        #116 <Field String B>
	//   28   56:aload_0         
	//   29   57:getfield        #311 <Field int d>
	//   30   60:aload_0         
	//   31   61:getfield        #348 <Field int h>
	//   32   64:aload_0         
	//   33   65:getfield        #341 <Field int i>
	//   34   68:aload_0         
	//   35   69:getfield        #346 <Field int j>
	//   36   72:aload_0         
	//   37   73:getfield        #316 <Field int e>
	//   38   76:aload_0         
	//   39   77:getfield        #318 <Field int f>
	//   40   80:aload_0         
	//   41   81:getfield        #133 <Field float y>
	//   42   84:aload_0         
	//   43   85:getfield        #138 <Field int z>
	//   44   88:aload_0         
	//   45   89:getfield        #143 <Field int A>
	//   46   92:aload_0         
	//   47   93:getfield        #412 <Field double m>
	//   48   96:aload_0         
	//   49   97:getfield        #414 <Field boolean n>
	//   50  100:aload_0         
	//   51  101:getfield        #350 <Field boolean k>
	//   52  104:aload_0         
	//   53  105:getfield        #352 <Field int l>
	//   54  108:aload_0         
	//   55  109:getfield        #152 <Field String o>
	//   56  112:aload_0         
	//   57  113:getfield        #167 <Field boolean C>
	//   58  116:aload_0         
	//   59  117:getfield        #157 <Field String p>
	//   60  120:invokespecial   #425 <Method void sw(int, boolean, boolean, String, String, boolean, boolean, boolean, boolean, boolean, String, String, String, int, int, int, int, int, int, float, int, int, double, boolean, boolean, int, String, boolean, String)>
	//   61  123:areturn         
	}

	private int A;
	private String B;
	private boolean C;
	private int a;
	private boolean b;
	private boolean c;
	private int d;
	private int e;
	private int f;
	private String g;
	private int h;
	private int i;
	private int j;
	private boolean k;
	private int l;
	private double m;
	private boolean n;
	private String o;
	private String p;
	private boolean q;
	private boolean r;
	private String s;
	private boolean t;
	private final boolean u;
	private boolean v;
	private String w;
	private String x;
	private float y;
	private int z;
}
