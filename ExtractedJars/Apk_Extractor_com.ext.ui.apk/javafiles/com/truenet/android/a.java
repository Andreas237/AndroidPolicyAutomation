// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.os.Build;
import android.support.v7.ab;
import android.support.v7.ae;
import android.support.v7.g;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.startapp.common.c;
import com.truenet.android.a.b;
import com.truenet.android.a.d;
import com.truenet.android.a.e;
import com.truenet.android.a.f;
import com.truenet.android.a.h;
import com.truenet.android.a.i;
import java.util.Collection;
import java.util.Locale;

// Referenced classes of package com.truenet.android:
//			DeviceInfo

public final class a
{

	public a(Context context, TelephonyManager telephonymanager)
	{
		ae.b(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #13  <String "context">
	//    2    3:invokestatic    #18  <Method void ae.b(Object, String)>
		ae.b(((Object) (telephonymanager)), "telephonyManager");
	//    3    6:aload_2         
	//    4    7:ldc1            #20  <String "telephonyManager">
	//    5    9:invokestatic    #18  <Method void ae.b(Object, String)>
		super();
	//    6   12:aload_0         
	//    7   13:invokespecial   #23  <Method void Object()>
		a = context;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #25  <Field Context a>
		b = telephonymanager;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #27  <Field TelephonyManager b>
		c.c(a);
	//   14   26:aload_0         
	//   15   27:getfield        #25  <Field Context a>
	//   16   30:invokestatic    #33  <Method void c.c(Context)>
	//   17   33:return          
	}

	public a(Context context, TelephonyManager telephonymanager, int j, ab ab)
	{
		if((j & 2) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			telephonymanager = com.truenet.android.a.c.a(context);
	//    4    6:aload_1         
	//    5    7:invokestatic    #41  <Method TelephonyManager com.truenet.android.a.c.a(Context)>
	//    6   10:astore_2        
		this(context, telephonymanager);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokespecial   #43  <Method void a(Context, TelephonyManager)>
	//   11   17:return          
	}

	private final boolean b()
	{
		Object obj = ((Object) (Resources.getSystem()));
	//    0    0:invokestatic    #50  <Method Resources Resources.getSystem()>
	//    1    3:astore          5
		ae.a(obj, "Resources.getSystem()");
	//    2    5:aload           5
	//    3    7:ldc1            #52  <String "Resources.getSystem()">
	//    4    9:invokestatic    #54  <Method void ae.a(Object, String)>
		obj = ((Object) (((Resources) (obj)).getDisplayMetrics()));
	//    5   12:aload           5
	//    6   14:invokevirtual   #58  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    7   17:astore          5
		double d1 = (float)((DisplayMetrics) (obj)).widthPixels / ((DisplayMetrics) (obj)).xdpi;
	//    8   19:aload           5
	//    9   21:getfield        #64  <Field int DisplayMetrics.widthPixels>
	//   10   24:i2f             
	//   11   25:aload           5
	//   12   27:getfield        #68  <Field float DisplayMetrics.xdpi>
	//   13   30:fdiv            
	//   14   31:f2d             
	//   15   32:dstore_1        
		double d2 = (float)((DisplayMetrics) (obj)).heightPixels / ((DisplayMetrics) (obj)).ydpi;
	//   16   33:aload           5
	//   17   35:getfield        #71  <Field int DisplayMetrics.heightPixels>
	//   18   38:i2f             
	//   19   39:aload           5
	//   20   41:getfield        #74  <Field float DisplayMetrics.ydpi>
	//   21   44:fdiv            
	//   22   45:f2d             
	//   23   46:dstore_3        
		return Math.sqrt(d2 * d2 + d1 * d1) > 6.5D;
	//   24   47:dload_3         
	//   25   48:dload_3         
	//   26   49:dmul            
	//   27   50:dload_1         
	//   28   51:dload_1         
	//   29   52:dmul            
	//   30   53:dadd            
	//   31   54:invokestatic    #80  <Method double Math.sqrt(double)>
	//   32   57:ldc2w           #81  <Double 6.5D>
	//   33   60:dcmpl           
	//   34   61:ifle            66
	//   35   64:iconst_1        
	//   36   65:ireturn         
	//   37   66:iconst_0        
	//   38   67:ireturn         
	}

	public final DeviceInfo a()
	{
		Object obj = ((Object) (g.a()));
	//    0    0:invokestatic    #88  <Method java.util.List g.a()>
	//    1    3:astore          4
		String s2 = "";
	//    2    5:ldc1            #90  <String "">
	//    3    7:astore          6
		int j;
		String s1;
		Object obj1;
		Object obj2;
		String s3;
		String s4;
		Object obj3;
		String s5;
		Object obj4;
		if(!((Collection)obj).isEmpty())
	//*   4    9:aload           4
	//*   5   11:checkcast       #92  <Class Collection>
	//*   6   14:invokeinterface #95  <Method boolean Collection.isEmpty()>
	//*   7   19:ifne            489
			j = 1;
	//    8   22:iconst_1        
	//    9   23:istore_3        
		else
	//*  10   24:iload_3         
	//*  11   25:ifeq            549
	//*  12   28:aload           4
	//*  13   30:invokestatic    #98  <Method Object g.c(java.util.List)>
	//*  14   33:checkcast       #100 <Class Location>
	//*  15   36:invokevirtual   #104 <Method double Location.getLatitude()>
	//*  16   39:dstore_1        
	//*  17   40:aload           4
	//*  18   42:invokestatic    #98  <Method Object g.c(java.util.List)>
	//*  19   45:checkcast       #100 <Class Location>
	//*  20   48:invokevirtual   #107 <Method double Location.getLongitude()>
	//*  21   51:invokestatic    #113 <Method String String.valueOf(double)>
	//*  22   54:astore          6
	//*  23   56:dload_1         
	//*  24   57:invokestatic    #113 <Method String String.valueOf(double)>
	//*  25   60:astore          5
	//*  26   62:aload_0         
	//*  27   63:getfield        #25  <Field Context a>
	//*  28   66:invokevirtual   #118 <Method Resources Context.getResources()>
	//*  29   69:astore          4
	//*  30   71:aload           4
	//*  31   73:ldc1            #120 <String "context.resources">
	//*  32   75:invokestatic    #54  <Method void ae.a(Object, String)>
	//*  33   78:aload           4
	//*  34   80:invokevirtual   #124 <Method android.content.res.Configuration Resources.getConfiguration()>
	//*  35   83:astore          4
	//*  36   85:aload           4
	//*  37   87:ldc1            #126 <String "context.resources.configuration">
	//*  38   89:invokestatic    #54  <Method void ae.a(Object, String)>
	//*  39   92:aload           4
	//*  40   94:invokestatic    #131 <Method Locale b.a(android.content.res.Configuration)>
	//*  41   97:astore          13
	//*  42   99:invokestatic    #136 <Method com.startapp.common.a.b com.startapp.common.a.b.a()>
	//*  43  102:aload_0         
	//*  44  103:getfield        #25  <Field Context a>
	//*  45  106:invokevirtual   #139 <Method com.startapp.common.a.b$c com.startapp.common.a.b.a(Context)>
	//*  46  109:astore          4
	//*  47  111:aload           4
	//*  48  113:ldc1            #141 <String "AdvertisingIdSingleton.g\u2026getAdvertisingId(context)">
	//*  49  115:invokestatic    #54  <Method void ae.a(Object, String)>
	//*  50  118:aload           4
	//*  51  120:invokevirtual   #146 <Method String com.startapp.common.a.b$c.a()>
	//*  52  123:astore          12
	//*  53  125:aload_0         
	//*  54  126:getfield        #27  <Field TelephonyManager b>
	//*  55  129:invokevirtual   #152 <Method int TelephonyManager.getPhoneType()>
	//*  56  132:tableswitch     0 2: default 160
	//	               0 494
	//	               1 160
	//	               2 494
	//*  57  160:aload_0         
	//*  58  161:getfield        #27  <Field TelephonyManager b>
	//*  59  164:invokevirtual   #155 <Method String TelephonyManager.getNetworkOperatorName()>
	//*  60  167:astore          4
	//*  61  169:aload           4
	//*  62  171:ifnull          501
	//*  63  174:aload_0         
	//*  64  175:getfield        #27  <Field TelephonyManager b>
	//*  65  178:astore          7
	//*  66  180:aload           7
	//*  67  182:invokevirtual   #158 <Method int TelephonyManager.getSimState()>
	//*  68  185:iconst_5        
	//*  69  186:icmpne          508
	//*  70  189:aload           7
	//*  71  191:invokevirtual   #161 <Method String TelephonyManager.getSimOperator()>
	//*  72  194:astore          7
	//*  73  196:aload_0         
	//*  74  197:getfield        #27  <Field TelephonyManager b>
	//*  75  200:astore          8
	//*  76  202:aload           8
	//*  77  204:invokevirtual   #158 <Method int TelephonyManager.getSimState()>
	//*  78  207:iconst_5        
	//*  79  208:icmpne          515
	//*  80  211:aload           8
	//*  81  213:invokevirtual   #164 <Method String TelephonyManager.getSimOperatorName()>
	//*  82  216:astore          8
	//*  83  218:aload_0         
	//*  84  219:getfield        #25  <Field Context a>
	//*  85  222:ldc1            #166 <String "android.permission.ACCESS_FINE_LOCATION">
	//*  86  224:invokestatic    #171 <Method boolean h.a(Context, String)>
	//*  87  227:ifne            242
	//*  88  230:aload_0         
	//*  89  231:getfield        #25  <Field Context a>
	//*  90  234:ldc1            #173 <String "android.permission.ACCESS_COARSE_LOCATION">
	//*  91  236:invokestatic    #171 <Method boolean h.a(Context, String)>
	//*  92  239:ifeq            522
	//*  93  242:iconst_1        
	//*  94  243:istore_3        
	//*  95  244:iload_3         
	//*  96  245:ifeq            527
	//*  97  248:aload_0         
	//*  98  249:getfield        #27  <Field TelephonyManager b>
	//*  99  252:invokestatic    #178 <Method int f.a(TelephonyManager)>
	//* 100  255:invokestatic    #183 <Method Integer Integer.valueOf(int)>
	//* 101  258:invokestatic    #186 <Method String String.valueOf(Object)>
	//* 102  261:astore          9
	//* 103  263:iload_3         
	//* 104  264:ifeq            534
	//* 105  267:aload_0         
	//* 106  268:getfield        #27  <Field TelephonyManager b>
	//* 107  271:invokestatic    #188 <Method int f.b(TelephonyManager)>
	//* 108  274:invokestatic    #183 <Method Integer Integer.valueOf(int)>
	//* 109  277:invokestatic    #186 <Method String String.valueOf(Object)>
	//* 110  280:astore          10
	//* 111  282:invokestatic    #191 <Method c c.a()>
	//* 112  285:astore          11
	//* 113  287:aload           11
	//* 114  289:ldc1            #193 <String "NetworkStats.get()">
	//* 115  291:invokestatic    #54  <Method void ae.a(Object, String)>
	//* 116  294:aload           11
	//* 117  296:invokevirtual   #195 <Method String c.b()>
	//* 118  299:astore          14
	//* 119  301:getstatic       #200 <Field com.truenet.android.a.i$a i.a>
	//* 120  304:aload_0         
	//* 121  305:getfield        #25  <Field Context a>
	//* 122  308:invokevirtual   #205 <Method String com.truenet.android.a.i$a.a(Context)>
	//* 123  311:astore          15
	//* 124  313:aload_0         
	//* 125  314:invokespecial   #207 <Method boolean b()>
	//* 126  317:ifeq            541
	//* 127  320:ldc1            #209 <String "tablet">
	//* 128  322:astore          11
	//* 129  324:aload           13
	//* 130  326:invokevirtual   #214 <Method String Locale.toString()>
	//* 131  329:astore          13
	//* 132  331:aload           13
	//* 133  333:ldc1            #216 <String "locale.toString()">
	//* 134  335:invokestatic    #54  <Method void ae.a(Object, String)>
	//* 135  338:aload           12
	//* 136  340:ldc1            #218 <String "advertisingId">
	//* 137  342:invokestatic    #54  <Method void ae.a(Object, String)>
	//* 138  345:getstatic       #223 <Field int android.os.Build$VERSION.SDK_INT>
	//* 139  348:istore_3        
	//* 140  349:getstatic       #229 <Field String Build.MODEL>
	//* 141  352:astore          16
	//* 142  354:aload           16
	//* 143  356:ldc1            #231 <String "Build.MODEL">
	//* 144  358:invokestatic    #54  <Method void ae.a(Object, String)>
	//* 145  361:getstatic       #234 <Field String Build.MANUFACTURER>
	//* 146  364:astore          17
	//* 147  366:aload           17
	//* 148  368:ldc1            #236 <String "Build.MANUFACTURER">
	//* 149  370:invokestatic    #54  <Method void ae.a(Object, String)>
	//* 150  373:getstatic       #239 <Field String android.os.Build$VERSION.RELEASE>
	//* 151  376:astore          18
	//* 152  378:aload           18
	//* 153  380:ldc1            #241 <String "Build.VERSION.RELEASE">
	//* 154  382:invokestatic    #54  <Method void ae.a(Object, String)>
	//* 155  385:aload_0         
	//* 156  386:getfield        #25  <Field Context a>
	//* 157  389:invokevirtual   #244 <Method String Context.getPackageName()>
	//* 158  392:astore          19
	//* 159  394:aload           19
	//* 160  396:ldc1            #246 <String "context.packageName">
	//* 161  398:invokestatic    #54  <Method void ae.a(Object, String)>
	//* 162  401:aload           7
	//* 163  403:ldc1            #248 <String "ips">
	//* 164  405:invokestatic    #54  <Method void ae.a(Object, String)>
	//* 165  408:aload           8
	//* 166  410:ldc1            #250 <String "ipsName">
	//* 167  412:invokestatic    #54  <Method void ae.a(Object, String)>
	//* 168  415:aload_0         
	//* 169  416:getfield        #25  <Field Context a>
	//* 170  419:invokestatic    #255 <Method e d.b(Context)>
	//* 171  422:invokevirtual   #258 <Method String e.a()>
	//* 172  425:astore          20
	//* 173  427:aload           14
	//* 174  429:ldc2            #260 <String "signalLevel">
	//* 175  432:invokestatic    #54  <Method void ae.a(Object, String)>
	//* 176  435:new             #262 <Class DeviceInfo>
	//* 177  438:dup             
	//* 178  439:aload           5
	//* 179  441:aload           6
	//* 180  443:aload           15
	//* 181  445:aload           13
	//* 182  447:aload           12
	//* 183  449:ldc2            #264 <String "android">
	//* 184  452:iload_3         
	//* 185  453:invokestatic    #267 <Method String String.valueOf(int)>
	//* 186  456:aload           16
	//* 187  458:aload           17
	//* 188  460:aload           18
	//* 189  462:aload           19
	//* 190  464:aload           4
	//* 191  466:aload           7
	//* 192  468:aload           8
	//* 193  470:aload           9
	//* 194  472:aload           10
	//* 195  474:aload           20
	//* 196  476:aload           14
	//* 197  478:aload           11
	//* 198  480:ldc2            #269 <String "1.0.12">
	//* 199  483:ldc1            #90  <String "">
	//* 200  485:invokespecial   #272 <Method void DeviceInfo(String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String)>
	//* 201  488:areturn         
			j = 0;
	//  202  489:iconst_0        
	//  203  490:istore_3        
		if(j != 0)
		{
			double d1 = ((Location)g.c(((java.util.List) (obj)))).getLatitude();
			s2 = String.valueOf(((Location)g.c(((java.util.List) (obj)))).getLongitude());
			s1 = String.valueOf(d1);
		} else
	//* 204  491:goto            24
	//* 205  494:ldc1            #90  <String "">
	//* 206  496:astore          4
	//* 207  498:goto            174
	//* 208  501:ldc1            #90  <String "">
	//* 209  503:astore          4
	//* 210  505:goto            174
	//* 211  508:ldc1            #90  <String "">
	//* 212  510:astore          7
	//* 213  512:goto            196
	//* 214  515:ldc1            #90  <String "">
	//* 215  517:astore          8
	//* 216  519:goto            218
	//* 217  522:iconst_0        
	//* 218  523:istore_3        
	//* 219  524:goto            244
	//* 220  527:ldc1            #90  <String "">
	//* 221  529:astore          9
	//* 222  531:goto            263
	//* 223  534:ldc1            #90  <String "">
	//* 224  536:astore          10
	//* 225  538:goto            282
	//* 226  541:ldc2            #274 <String "phone">
	//* 227  544:astore          11
	//* 228  546:goto            324
		{
			s1 = "";
	//  229  549:ldc1            #90  <String "">
	//  230  551:astore          5
		}
		obj = ((Object) (a.getResources()));
		ae.a(obj, "context.resources");
		obj = ((Object) (((Resources) (obj)).getConfiguration()));
		ae.a(obj, "context.resources.configuration");
		obj4 = ((Object) (com.truenet.android.a.b.a(((android.content.res.Configuration) (obj)))));
		obj = ((Object) (com.startapp.common.a.b.a().a(a)));
		ae.a(obj, "AdvertisingIdSingleton.g\u2026getAdvertisingId(context)");
		s5 = ((com.startapp.common.a.b.c) (obj)).a();
		switch(b.getPhoneType())
		{
		case 1: // '\001'
		default:
			String s = b.getNetworkOperatorName();
			String s6;
			String s7;
			String s8;
			String s9;
			String s10;
			String s11;
			String s12;
			if(s == null)
				s = "";
			break;

		case 0: // '\0'
		case 2: // '\002'
			break MISSING_BLOCK_LABEL_494;
		}
		obj1 = ((Object) (b));
		if(((TelephonyManager) (obj1)).getSimState() == 5)
			obj1 = ((Object) (((TelephonyManager) (obj1)).getSimOperator()));
		else
			obj1 = "";
		obj2 = ((Object) (b));
		if(((TelephonyManager) (obj2)).getSimState() == 5)
			obj2 = ((Object) (((TelephonyManager) (obj2)).getSimOperatorName()));
		else
			obj2 = "";
		if(h.a(a, "android.permission.ACCESS_FINE_LOCATION") || h.a(a, "android.permission.ACCESS_COARSE_LOCATION"))
			j = 1;
		else
			j = 0;
		if(j != 0)
			s3 = String.valueOf(((Object) (Integer.valueOf(f.a(b)))));
		else
			s3 = "";
		if(j != 0)
			s4 = String.valueOf(((Object) (Integer.valueOf(f.b(b)))));
		else
			s4 = "";
		obj3 = ((Object) (c.a()));
		ae.a(obj3, "NetworkStats.get()");
		s6 = ((c) (obj3)).b();
		s7 = i.a.a(a);
		if(b())
			obj3 = "tablet";
		else
			obj3 = "phone";
		obj4 = ((Object) (((Locale) (obj4)).toString()));
		ae.a(obj4, "locale.toString()");
		ae.a(((Object) (s5)), "advertisingId");
		j = android.os.Build.VERSION.SDK_INT;
		s8 = Build.MODEL;
		ae.a(((Object) (s8)), "Build.MODEL");
		s9 = Build.MANUFACTURER;
		ae.a(((Object) (s9)), "Build.MANUFACTURER");
		s10 = android.os.Build.VERSION.RELEASE;
		ae.a(((Object) (s10)), "Build.VERSION.RELEASE");
		s11 = a.getPackageName();
		ae.a(((Object) (s11)), "context.packageName");
		ae.a(obj1, "ips");
		ae.a(obj2, "ipsName");
		s12 = d.b(a).a();
		ae.a(((Object) (s6)), "signalLevel");
		return new DeviceInfo(s1, s2, s7, ((String) (obj4)), s5, "android", String.valueOf(j), s8, s9, s10, s11, s, ((String) (obj1)), ((String) (obj2)), s3, s4, s12, s6, ((String) (obj3)), "1.0.12", "");
		s = "";
		break MISSING_BLOCK_LABEL_174;
	//* 231  553:goto            62
	}

	private final Context a;
	private final TelephonyManager b;
}
