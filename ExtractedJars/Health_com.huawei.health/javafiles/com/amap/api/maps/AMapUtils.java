// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.amap.api.mapcore.util.*;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.NaviPara;
import com.amap.api.maps.model.PoiPara;
import com.amap.api.maps.model.RoutePara;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.amap.api.maps:
//			AMapException

public class AMapUtils
{
	static class a extends Thread
	{

		public void run()
		{
			if(b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field Context b>
		//*   2    4:ifnull          58
				try
				{
					com.amap.api.mapcore.util.gy gy = (new com.amap.api.mapcore.util.gy.a(a, "6.3.1", l.c)).a(new String[] {
						"com.amap.api.maps"
					}).a();
		//    3    7:new             #33  <Class com.amap.api.mapcore.util.gy$a>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:getfield        #19  <Field String a>
		//    7   15:ldc1            #35  <String "6.3.1">
		//    8   17:getstatic       #40  <Field String l.c>
		//    9   20:invokespecial   #43  <Method void com.amap.api.mapcore.util.gy$a(String, String, String)>
		//   10   23:iconst_1        
		//   11   24:anewarray       String[]
		//   12   27:dup             
		//   13   28:iconst_0        
		//   14   29:ldc1            #47  <String "com.amap.api.maps">
		//   15   31:aastore         
		//   16   32:invokevirtual   #50  <Method com.amap.api.mapcore.util.gy$a com.amap.api.mapcore.util.gy$a.a(String[])>
		//   17   35:invokevirtual   #53  <Method com.amap.api.mapcore.util.gy com.amap.api.mapcore.util.gy$a.a()>
		//   18   38:astore_1        
					gq.a(b, gy);
		//   19   39:aload_0         
		//   20   40:getfield        #27  <Field Context b>
		//   21   43:aload_1         
		//   22   44:invokestatic    #58  <Method boolean gq.a(Context, com.amap.api.mapcore.util.gy)>
		//   23   47:pop             
					interrupt();
		//   24   48:aload_0         
		//   25   49:invokevirtual   #61  <Method void interrupt()>
					return;
		//   26   52:return          
				}
				catch(gn gn1)
		//*  27   53:astore_1        
				{
					gn1.printStackTrace();
		//   28   54:aload_1         
		//   29   55:invokevirtual   #64  <Method void gn.printStackTrace()>
				}
		//   30   58:return          
		}

		String a;
		Context b;

		public a(String s, Context context)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Thread()>
			a = "";
		//    2    4:aload_0         
		//    3    5:ldc1            #17  <String "">
		//    4    7:putfield        #19  <Field String a>
			a = s;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #19  <Field String a>
			if(context != null)
		//*   8   15:aload_2         
		//*   9   16:ifnull          27
				b = context.getApplicationContext();
		//   10   19:aload_0         
		//   11   20:aload_2         
		//   12   21:invokevirtual   #25  <Method Context Context.getApplicationContext()>
		//   13   24:putfield        #27  <Field Context b>
		//   14   27:return          
		}
	}


	public AMapUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	private static String a(NaviPara navipara, Context context)
	{
		return String.format(Locale.US, "androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=0&style=%d", new Object[] {
			go.b(context), Double.valueOf(navipara.getTargetPoint().latitude), Double.valueOf(navipara.getTargetPoint().longitude), Integer.valueOf(navipara.getNaviStyle())
		});
	//    0    0:getstatic       #44  <Field Locale Locale.US>
	//    1    3:ldc1            #46  <String "androidamap://navi?sourceApplication=%s&lat=%f&lon=%f&dev=0&style=%d">
	//    2    5:iconst_4        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_1         
	//    7   12:invokestatic    #52  <Method String go.b(Context)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:invokevirtual   #58  <Method LatLng NaviPara.getTargetPoint()>
	//   13   22:getfield        #64  <Field double LatLng.latitude>
	//   14   25:invokestatic    #70  <Method Double Double.valueOf(double)>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_2        
	//   18   31:aload_0         
	//   19   32:invokevirtual   #58  <Method LatLng NaviPara.getTargetPoint()>
	//   20   35:getfield        #73  <Field double LatLng.longitude>
	//   21   38:invokestatic    #70  <Method Double Double.valueOf(double)>
	//   22   41:aastore         
	//   23   42:dup             
	//   24   43:iconst_3        
	//   25   44:aload_0         
	//   26   45:invokevirtual   #77  <Method int NaviPara.getNaviStyle()>
	//   27   48:invokestatic    #82  <Method Integer Integer.valueOf(int)>
	//   28   51:aastore         
	//   29   52:invokestatic    #88  <Method String String.format(Locale, String, Object[])>
	//   30   55:areturn         
	}

	private static String a(PoiPara poipara, Context context)
	{
		String s = String.format(Locale.US, "androidamap://arroundpoi?sourceApplication=%s&keywords=%s&dev=0", new Object[] {
			go.b(context), poipara.getKeywords()
		});
	//    0    0:getstatic       #44  <Field Locale Locale.US>
	//    1    3:ldc1            #91  <String "androidamap://arroundpoi?sourceApplication=%s&keywords=%s&dev=0">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_1         
	//    7   12:invokestatic    #52  <Method String go.b(Context)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:invokevirtual   #97  <Method String PoiPara.getKeywords()>
	//   13   22:aastore         
	//   14   23:invokestatic    #88  <Method String String.format(Locale, String, Object[])>
	//   15   26:astore_2        
		context = ((Context) (s));
	//   16   27:aload_2         
	//   17   28:astore_1        
		if(poipara.getCenter() != null)
	//*  18   29:aload_0         
	//*  19   30:invokevirtual   #100 <Method LatLng PoiPara.getCenter()>
	//*  20   33:ifnull          81
			context = ((Context) ((new StringBuilder()).append(s).append("&lat=").append(poipara.getCenter().latitude).append("&lon=").append(poipara.getCenter().longitude).toString()));
	//   21   36:new             #102 <Class StringBuilder>
	//   22   39:dup             
	//   23   40:invokespecial   #103 <Method void StringBuilder()>
	//   24   43:aload_2         
	//   25   44:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   26   47:ldc1            #109 <String "&lat=">
	//   27   49:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:aload_0         
	//   29   53:invokevirtual   #100 <Method LatLng PoiPara.getCenter()>
	//   30   56:getfield        #64  <Field double LatLng.latitude>
	//   31   59:invokevirtual   #112 <Method StringBuilder StringBuilder.append(double)>
	//   32   62:ldc1            #114 <String "&lon=">
	//   33   64:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:aload_0         
	//   35   68:invokevirtual   #100 <Method LatLng PoiPara.getCenter()>
	//   36   71:getfield        #73  <Field double LatLng.longitude>
	//   37   74:invokevirtual   #112 <Method StringBuilder StringBuilder.append(double)>
	//   38   77:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   39   80:astore_1        
		return ((String) (context));
	//   40   81:aload_1         
	//   41   82:areturn         
	}

	private static void a(RoutePara routepara, Context context, int i)
		throws AMapException
	{
		if(a(context))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #125 <Method boolean a(Context)>
	//*   2    4:ifeq            99
		{
			if(a(routepara))
	//*   3    7:aload_0         
	//*   4    8:invokestatic    #128 <Method boolean a(RoutePara)>
	//*   5   11:ifeq            89
				try
				{
					Intent intent = new Intent("android.intent.action.VIEW");
	//    6   14:new             #130 <Class Intent>
	//    7   17:dup             
	//    8   18:ldc1            #132 <String "android.intent.action.VIEW">
	//    9   20:invokespecial   #135 <Method void Intent(String)>
	//   10   23:astore_3        
					intent.addFlags(0x10800000);
	//   11   24:aload_3         
	//   12   25:ldc1            #136 <Int 0x10800000>
	//   13   27:invokevirtual   #140 <Method Intent Intent.addFlags(int)>
	//   14   30:pop             
					intent.addCategory("android.intent.category.DEFAULT");
	//   15   31:aload_3         
	//   16   32:ldc1            #142 <String "android.intent.category.DEFAULT">
	//   17   34:invokevirtual   #146 <Method Intent Intent.addCategory(String)>
	//   18   37:pop             
					intent.setData(Uri.parse(b(routepara, context, i)));
	//   19   38:aload_3         
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:iload_2         
	//   23   42:invokestatic    #149 <Method String b(RoutePara, Context, int)>
	//   24   45:invokestatic    #155 <Method Uri Uri.parse(String)>
	//   25   48:invokevirtual   #159 <Method Intent Intent.setData(Uri)>
	//   26   51:pop             
					intent.setPackage("com.autonavi.minimap");
	//   27   52:aload_3         
	//   28   53:ldc1            #161 <String "com.autonavi.minimap">
	//   29   55:invokevirtual   #164 <Method Intent Intent.setPackage(String)>
	//   30   58:pop             
					(new a("oan", context)).start();
	//   31   59:new             #6   <Class AMapUtils$a>
	//   32   62:dup             
	//   33   63:ldc1            #166 <String "oan">
	//   34   65:aload_1         
	//   35   66:invokespecial   #169 <Method void AMapUtils$a(String, Context)>
	//   36   69:invokevirtual   #172 <Method void AMapUtils$a.start()>
					context.startActivity(intent);
	//   37   72:aload_1         
	//   38   73:aload_3         
	//   39   74:invokevirtual   #178 <Method void Context.startActivity(Intent)>
					return;
	//   40   77:return          
				}
				// Misplaced declaration of an exception variable
				catch(RoutePara routepara)
	//*  41   78:astore_0        
				{
					throw new AMapException("\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7");
	//   42   79:new             #120 <Class AMapException>
	//   43   82:dup             
	//   44   83:ldc1            #180 <String "\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7">
	//   45   85:invokespecial   #181 <Method void AMapException(String)>
	//   46   88:athrow          
				}
			else
				throw new AMapException("\u975E\u6CD5\u53C2\u6570");
	//   47   89:new             #120 <Class AMapException>
	//   48   92:dup             
	//   49   93:ldc1            #183 <String "\u975E\u6CD5\u53C2\u6570">
	//   50   95:invokespecial   #181 <Method void AMapException(String)>
	//   51   98:athrow          
		} else
		{
			throw new AMapException("\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7");
	//   52   99:new             #120 <Class AMapException>
	//   53  102:dup             
	//   54  103:ldc1            #180 <String "\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7">
	//   55  105:invokespecial   #181 <Method void AMapException(String)>
	//   56  108:athrow          
		}
	}

	private static boolean a(Context context)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo("com.autonavi.minimap", 0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #161 <String "com.autonavi.minimap">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #196 <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:astore_0        
		}
	//*   6   11:goto            17
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   7   14:astore_0        
		{
			return false;
	//    8   15:iconst_0        
	//    9   16:ireturn         
		}
		return context != null;
	//   10   17:aload_0         
	//   11   18:ifnull          23
	//   12   21:iconst_1        
	//   13   22:ireturn         
	//   14   23:iconst_0        
	//   15   24:ireturn         
	}

	private static boolean a(RoutePara routepara)
	{
		return routepara.getStartPoint() != null && routepara.getEndPoint() != null && routepara.getStartName() != null && routepara.getStartName().trim().length() > 0 && routepara.getEndName() != null && routepara.getEndName().trim().length() > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #201 <Method LatLng RoutePara.getStartPoint()>
	//    2    4:ifnull          54
	//    3    7:aload_0         
	//    4    8:invokevirtual   #204 <Method LatLng RoutePara.getEndPoint()>
	//    5   11:ifnull          54
	//    6   14:aload_0         
	//    7   15:invokevirtual   #207 <Method String RoutePara.getStartName()>
	//    8   18:ifnull          54
	//    9   21:aload_0         
	//   10   22:invokevirtual   #207 <Method String RoutePara.getStartName()>
	//   11   25:invokevirtual   #210 <Method String String.trim()>
	//   12   28:invokevirtual   #213 <Method int String.length()>
	//   13   31:ifle            54
	//   14   34:aload_0         
	//   15   35:invokevirtual   #216 <Method String RoutePara.getEndName()>
	//   16   38:ifnull          54
	//   17   41:aload_0         
	//   18   42:invokevirtual   #216 <Method String RoutePara.getEndName()>
	//   19   45:invokevirtual   #210 <Method String String.trim()>
	//   20   48:invokevirtual   #213 <Method int String.length()>
	//   21   51:ifgt            56
	//   22   54:iconst_0        
	//   23   55:ireturn         
	//   24   56:iconst_1        
	//   25   57:ireturn         
	}

	private static String b(RoutePara routepara, Context context, int i)
	{
		String s = String.format(Locale.US, "androidamap://route?sourceApplication=%s&slat=%f&slon=%f&sname=%s&dlat=%f&dlon=%f&dname=%s&dev=0&t=%d", new Object[] {
			go.b(context), Double.valueOf(routepara.getStartPoint().latitude), Double.valueOf(routepara.getStartPoint().longitude), routepara.getStartName(), Double.valueOf(routepara.getEndPoint().latitude), Double.valueOf(routepara.getEndPoint().longitude), routepara.getEndName(), Integer.valueOf(i)
		});
	//    0    0:getstatic       #44  <Field Locale Locale.US>
	//    1    3:ldc1            #218 <String "androidamap://route?sourceApplication=%s&slat=%f&slon=%f&sname=%s&dlat=%f&dlon=%f&dname=%s&dev=0&t=%d">
	//    2    5:bipush          8
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:aload_1         
	//    7   13:invokestatic    #52  <Method String go.b(Context)>
	//    8   16:aastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:aload_0         
	//   12   20:invokevirtual   #201 <Method LatLng RoutePara.getStartPoint()>
	//   13   23:getfield        #64  <Field double LatLng.latitude>
	//   14   26:invokestatic    #70  <Method Double Double.valueOf(double)>
	//   15   29:aastore         
	//   16   30:dup             
	//   17   31:iconst_2        
	//   18   32:aload_0         
	//   19   33:invokevirtual   #201 <Method LatLng RoutePara.getStartPoint()>
	//   20   36:getfield        #73  <Field double LatLng.longitude>
	//   21   39:invokestatic    #70  <Method Double Double.valueOf(double)>
	//   22   42:aastore         
	//   23   43:dup             
	//   24   44:iconst_3        
	//   25   45:aload_0         
	//   26   46:invokevirtual   #207 <Method String RoutePara.getStartName()>
	//   27   49:aastore         
	//   28   50:dup             
	//   29   51:iconst_4        
	//   30   52:aload_0         
	//   31   53:invokevirtual   #204 <Method LatLng RoutePara.getEndPoint()>
	//   32   56:getfield        #64  <Field double LatLng.latitude>
	//   33   59:invokestatic    #70  <Method Double Double.valueOf(double)>
	//   34   62:aastore         
	//   35   63:dup             
	//   36   64:iconst_5        
	//   37   65:aload_0         
	//   38   66:invokevirtual   #204 <Method LatLng RoutePara.getEndPoint()>
	//   39   69:getfield        #73  <Field double LatLng.longitude>
	//   40   72:invokestatic    #70  <Method Double Double.valueOf(double)>
	//   41   75:aastore         
	//   42   76:dup             
	//   43   77:bipush          6
	//   44   79:aload_0         
	//   45   80:invokevirtual   #216 <Method String RoutePara.getEndName()>
	//   46   83:aastore         
	//   47   84:dup             
	//   48   85:bipush          7
	//   49   87:iload_2         
	//   50   88:invokestatic    #82  <Method Integer Integer.valueOf(int)>
	//   51   91:aastore         
	//   52   92:invokestatic    #88  <Method String String.format(Locale, String, Object[])>
	//   53   95:astore_3        
		if(i == 1)
	//*  54   96:iload_2         
	//*  55   97:iconst_1        
	//*  56   98:icmpne          128
			return (new StringBuilder()).append(s).append("&m=").append(routepara.getTransitRouteStyle()).toString();
	//   57  101:new             #102 <Class StringBuilder>
	//   58  104:dup             
	//   59  105:invokespecial   #103 <Method void StringBuilder()>
	//   60  108:aload_3         
	//   61  109:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   62  112:ldc1            #220 <String "&m=">
	//   63  114:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   64  117:aload_0         
	//   65  118:invokevirtual   #223 <Method int RoutePara.getTransitRouteStyle()>
	//   66  121:invokevirtual   #226 <Method StringBuilder StringBuilder.append(int)>
	//   67  124:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   68  127:areturn         
		context = ((Context) (s));
	//   69  128:aload_3         
	//   70  129:astore_1        
		if(i == 2)
	//*  71  130:iload_2         
	//*  72  131:iconst_2        
	//*  73  132:icmpne          162
			context = ((Context) ((new StringBuilder()).append(s).append("&m=").append(routepara.getDrivingRouteStyle()).toString()));
	//   74  135:new             #102 <Class StringBuilder>
	//   75  138:dup             
	//   76  139:invokespecial   #103 <Method void StringBuilder()>
	//   77  142:aload_3         
	//   78  143:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   79  146:ldc1            #220 <String "&m=">
	//   80  148:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   81  151:aload_0         
	//   82  152:invokevirtual   #229 <Method int RoutePara.getDrivingRouteStyle()>
	//   83  155:invokevirtual   #226 <Method StringBuilder StringBuilder.append(int)>
	//   84  158:invokevirtual   #117 <Method String StringBuilder.toString()>
	//   85  161:astore_1        
		return ((String) (context));
	//   86  162:aload_1         
	//   87  163:areturn         
	}

	public static float calculateArea(LatLng latlng, LatLng latlng1)
	{
		if(latlng == null || latlng1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       25
		{
			try
			{
				throw new AMapException("\u975E\u6CD5\u5750\u6807\u503C");
	//    4    8:new             #120 <Class AMapException>
	//    5   11:dup             
	//    6   12:ldc1            #233 <String "\u975E\u6CD5\u5750\u6807\u503C">
	//    7   14:invokespecial   #181 <Method void AMapException(String)>
	//    8   17:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(LatLng latlng)
	//*   9   18:astore_0        
			{
				((AMapException) (latlng)).printStackTrace();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #236 <Method void AMapException.printStackTrace()>
			}
			return 0.0F;
	//   12   23:fconst_0        
	//   13   24:freturn         
		}
		double d;
		double d1;
		double d2;
		double d3;
		try
		{
			d2 = Math.sin((latlng.latitude * 3.1415926535897931D) / 180D);
	//   14   25:aload_0         
	//   15   26:getfield        #64  <Field double LatLng.latitude>
	//   16   29:ldc2w           #237 <Double 3.1415926535897931D>
	//   17   32:dmul            
	//   18   33:ldc2w           #239 <Double 180D>
	//   19   36:ddiv            
	//   20   37:invokestatic    #246 <Method double Math.sin(double)>
	//   21   40:dstore          6
			d3 = Math.sin((latlng1.latitude * 3.1415926535897931D) / 180D);
	//   22   42:aload_1         
	//   23   43:getfield        #64  <Field double LatLng.latitude>
	//   24   46:ldc2w           #237 <Double 3.1415926535897931D>
	//   25   49:dmul            
	//   26   50:ldc2w           #239 <Double 180D>
	//   27   53:ddiv            
	//   28   54:invokestatic    #246 <Method double Math.sin(double)>
	//   29   57:dstore          8
			d = latlng1.longitude;
	//   30   59:aload_1         
	//   31   60:getfield        #73  <Field double LatLng.longitude>
	//   32   63:dstore_2        
			d1 = latlng.longitude;
	//   33   64:aload_0         
	//   34   65:getfield        #73  <Field double LatLng.longitude>
	//   35   68:dstore          4
		}
	//*  36   70:dload_2         
	//*  37   71:dload           4
	//*  38   73:dsub            
	//*  39   74:ldc2w           #247 <Double 360D>
	//*  40   77:ddiv            
	//*  41   78:dstore          4
	//*  42   80:dload           4
	//*  43   82:dstore_2        
	//*  44   83:dload           4
	//*  45   85:dconst_0        
	//*  46   86:dcmpg           
	//*  47   87:ifge            95
	//*  48   90:dload           4
	//*  49   92:dconst_1        
	//*  50   93:dadd            
	//*  51   94:dstore_2        
	//*  52   95:ldc2w           #249 <Double 255603946697905.53D>
	//*  53   98:dload           6
	//*  54  100:dload           8
	//*  55  102:dsub            
	//*  56  103:dmul            
	//*  57  104:dload_2         
	//*  58  105:dmul            
	//*  59  106:d2f             
	//*  60  107:freturn         
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//*  61  108:astore_0        
		{
			((Throwable) (latlng)).printStackTrace();
	//   62  109:aload_0         
	//   63  110:invokevirtual   #251 <Method void Throwable.printStackTrace()>
			return 0.0F;
	//   64  113:fconst_0        
	//   65  114:freturn         
		}
		d1 = (d - d1) / 360D;
		d = d1;
		if(d1 < 0.0D)
			d = d1 + 1.0D;
		return (float)(255603946697905.53D * (d2 - d3) * d);
	}

	public static float calculateArea(List list)
	{
		if(list == null || list.size() < 3)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
	//*   2    4:aload_0         
	//*   3    5:invokeinterface #257 <Method int List.size()>
	//*   4   10:iconst_3        
	//*   5   11:icmpge          16
			return 0.0F;
	//    6   14:fconst_0        
	//    7   15:freturn         
		double d = 0.0D;
	//    8   16:dconst_0        
	//    9   17:dstore_1        
		int j = list.size();
	//   10   18:aload_0         
	//   11   19:invokeinterface #257 <Method int List.size()>
	//   12   24:istore          14
		for(int i = 0; i < j; i++)
	//*  13   26:iconst_0        
	//*  14   27:istore          13
	//*  15   29:iload           13
	//*  16   31:iload           14
	//*  17   33:icmpge          162
		{
			LatLng latlng = (LatLng)list.get(i);
	//   18   36:aload_0         
	//   19   37:iload           13
	//   20   39:invokeinterface #261 <Method Object List.get(int)>
	//   21   44:checkcast       #60  <Class LatLng>
	//   22   47:astore          15
			LatLng latlng1 = (LatLng)list.get((i + 1) % j);
	//   23   49:aload_0         
	//   24   50:iload           13
	//   25   52:iconst_1        
	//   26   53:iadd            
	//   27   54:iload           14
	//   28   56:irem            
	//   29   57:invokeinterface #261 <Method Object List.get(int)>
	//   30   62:checkcast       #60  <Class LatLng>
	//   31   65:astore          16
			double d1 = latlng.longitude;
	//   32   67:aload           15
	//   33   69:getfield        #73  <Field double LatLng.longitude>
	//   34   72:dstore_3        
			double d2 = Math.cos(latlng.latitude * 0.017453292519943295D);
	//   35   73:aload           15
	//   36   75:getfield        #64  <Field double LatLng.latitude>
	//   37   78:ldc2w           #262 <Double 0.017453292519943295D>
	//   38   81:dmul            
	//   39   82:invokestatic    #266 <Method double Math.cos(double)>
	//   40   85:dstore          5
			double d3 = latlng.latitude;
	//   41   87:aload           15
	//   42   89:getfield        #64  <Field double LatLng.latitude>
	//   43   92:dstore          7
			double d4 = latlng1.longitude;
	//   44   94:aload           16
	//   45   96:getfield        #73  <Field double LatLng.longitude>
	//   46   99:dstore          9
			double d5 = Math.cos(latlng1.latitude * 0.017453292519943295D);
	//   47  101:aload           16
	//   48  103:getfield        #64  <Field double LatLng.latitude>
	//   49  106:ldc2w           #262 <Double 0.017453292519943295D>
	//   50  109:dmul            
	//   51  110:invokestatic    #266 <Method double Math.cos(double)>
	//   52  113:dstore          11
			d += d1 * 111319.49079327357D * d2 * (latlng1.latitude * 111319.49079327357D) - d4 * 111319.49079327357D * d5 * (d3 * 111319.49079327357D);
	//   53  115:dload_1         
	//   54  116:dload_3         
	//   55  117:ldc2w           #267 <Double 111319.49079327357D>
	//   56  120:dmul            
	//   57  121:dload           5
	//   58  123:dmul            
	//   59  124:aload           16
	//   60  126:getfield        #64  <Field double LatLng.latitude>
	//   61  129:ldc2w           #267 <Double 111319.49079327357D>
	//   62  132:dmul            
	//   63  133:dmul            
	//   64  134:dload           9
	//   65  136:ldc2w           #267 <Double 111319.49079327357D>
	//   66  139:dmul            
	//   67  140:dload           11
	//   68  142:dmul            
	//   69  143:dload           7
	//   70  145:ldc2w           #267 <Double 111319.49079327357D>
	//   71  148:dmul            
	//   72  149:dmul            
	//   73  150:dsub            
	//   74  151:dadd            
	//   75  152:dstore_1        
		}

	//   76  153:iload           13
	//   77  155:iconst_1        
	//   78  156:iadd            
	//   79  157:istore          13
	//*  80  159:goto            29
		return (float)Math.abs(d / 2D);
	//   81  162:dload_1         
	//   82  163:ldc2w           #269 <Double 2D>
	//   83  166:ddiv            
	//   84  167:invokestatic    #273 <Method double Math.abs(double)>
	//   85  170:d2f             
	//   86  171:freturn         
	}

	public static float calculateLineDistance(LatLng latlng, LatLng latlng1)
	{
		if(latlng == null || latlng1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       25
		{
			try
			{
				throw new AMapException("\u975E\u6CD5\u5750\u6807\u503C");
	//    4    8:new             #120 <Class AMapException>
	//    5   11:dup             
	//    6   12:ldc1            #233 <String "\u975E\u6CD5\u5750\u6807\u503C">
	//    7   14:invokespecial   #181 <Method void AMapException(String)>
	//    8   17:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(LatLng latlng)
	//*   9   18:astore_0        
			{
				((AMapException) (latlng)).printStackTrace();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #236 <Method void AMapException.printStackTrace()>
			}
			return 0.0F;
	//   12   23:fconst_0        
	//   13   24:freturn         
		}
		double d;
		double d1;
		double d2;
		double d3;
		double d4;
		double d5;
		double d6;
		double d7;
		try
		{
			d3 = latlng.longitude;
	//   14   25:aload_0         
	//   15   26:getfield        #73  <Field double LatLng.longitude>
	//   16   29:dstore          8
			d2 = latlng.latitude;
	//   17   31:aload_0         
	//   18   32:getfield        #64  <Field double LatLng.latitude>
	//   19   35:dstore          6
			d1 = latlng1.longitude;
	//   20   37:aload_1         
	//   21   38:getfield        #73  <Field double LatLng.longitude>
	//   22   41:dstore          4
			d = latlng1.latitude;
	//   23   43:aload_1         
	//   24   44:getfield        #64  <Field double LatLng.latitude>
	//   25   47:dstore_2        
		}
	//*  26   48:dload           8
	//*  27   50:ldc2w           #277 <Double 0.017453292519943289D>
	//*  28   53:dmul            
	//*  29   54:dstore          10
	//*  30   56:dload           6
	//*  31   58:ldc2w           #277 <Double 0.017453292519943289D>
	//*  32   61:dmul            
	//*  33   62:dstore          12
	//*  34   64:dload           4
	//*  35   66:ldc2w           #277 <Double 0.017453292519943289D>
	//*  36   69:dmul            
	//*  37   70:dstore          6
	//*  38   72:dload_2         
	//*  39   73:ldc2w           #277 <Double 0.017453292519943289D>
	//*  40   76:dmul            
	//*  41   77:dstore          8
	//*  42   79:dload           10
	//*  43   81:invokestatic    #246 <Method double Math.sin(double)>
	//*  44   84:dstore_2        
	//*  45   85:dload           12
	//*  46   87:invokestatic    #246 <Method double Math.sin(double)>
	//*  47   90:dstore          4
	//*  48   92:dload           10
	//*  49   94:invokestatic    #266 <Method double Math.cos(double)>
	//*  50   97:dstore          10
	//*  51   99:dload           12
	//*  52  101:invokestatic    #266 <Method double Math.cos(double)>
	//*  53  104:dstore          12
	//*  54  106:dload           6
	//*  55  108:invokestatic    #246 <Method double Math.sin(double)>
	//*  56  111:dstore          14
	//*  57  113:dload           8
	//*  58  115:invokestatic    #246 <Method double Math.sin(double)>
	//*  59  118:dstore          16
	//*  60  120:dload           6
	//*  61  122:invokestatic    #266 <Method double Math.cos(double)>
	//*  62  125:dstore          6
	//*  63  127:dload           8
	//*  64  129:invokestatic    #266 <Method double Math.cos(double)>
	//*  65  132:dstore          8
	//*  66  134:iconst_3        
	//*  67  135:newarray        double[]
	//*  68  137:astore_0        
	//*  69  138:iconst_3        
	//*  70  139:newarray        double[]
	//*  71  141:astore_1        
	//*  72  142:aload_0         
	//*  73  143:iconst_0        
	//*  74  144:dload           12
	//*  75  146:dload           10
	//*  76  148:dmul            
	//*  77  149:dastore         
	//*  78  150:aload_0         
	//*  79  151:iconst_1        
	//*  80  152:dload           12
	//*  81  154:dload_2         
	//*  82  155:dmul            
	//*  83  156:dastore         
	//*  84  157:aload_0         
	//*  85  158:iconst_2        
	//*  86  159:dload           4
	//*  87  161:dastore         
	//*  88  162:aload_1         
	//*  89  163:iconst_0        
	//*  90  164:dload           8
	//*  91  166:dload           6
	//*  92  168:dmul            
	//*  93  169:dastore         
	//*  94  170:aload_1         
	//*  95  171:iconst_1        
	//*  96  172:dload           8
	//*  97  174:dload           14
	//*  98  176:dmul            
	//*  99  177:dastore         
	//* 100  178:aload_1         
	//* 101  179:iconst_2        
	//* 102  180:dload           16
	//* 103  182:dastore         
	//* 104  183:aload_0         
	//* 105  184:iconst_0        
	//* 106  185:daload          
	//* 107  186:aload_1         
	//* 108  187:iconst_0        
	//* 109  188:daload          
	//* 110  189:dsub            
	//* 111  190:aload_0         
	//* 112  191:iconst_0        
	//* 113  192:daload          
	//* 114  193:aload_1         
	//* 115  194:iconst_0        
	//* 116  195:daload          
	//* 117  196:dsub            
	//* 118  197:dmul            
	//* 119  198:aload_0         
	//* 120  199:iconst_1        
	//* 121  200:daload          
	//* 122  201:aload_1         
	//* 123  202:iconst_1        
	//* 124  203:daload          
	//* 125  204:dsub            
	//* 126  205:aload_0         
	//* 127  206:iconst_1        
	//* 128  207:daload          
	//* 129  208:aload_1         
	//* 130  209:iconst_1        
	//* 131  210:daload          
	//* 132  211:dsub            
	//* 133  212:dmul            
	//* 134  213:dadd            
	//* 135  214:aload_0         
	//* 136  215:iconst_2        
	//* 137  216:daload          
	//* 138  217:aload_1         
	//* 139  218:iconst_2        
	//* 140  219:daload          
	//* 141  220:dsub            
	//* 142  221:aload_0         
	//* 143  222:iconst_2        
	//* 144  223:daload          
	//* 145  224:aload_1         
	//* 146  225:iconst_2        
	//* 147  226:daload          
	//* 148  227:dsub            
	//* 149  228:dmul            
	//* 150  229:dadd            
	//* 151  230:invokestatic    #281 <Method double Math.sqrt(double)>
	//* 152  233:ldc2w           #269 <Double 2D>
	//* 153  236:ddiv            
	//* 154  237:invokestatic    #284 <Method double Math.asin(double)>
	//* 155  240:dstore_2        
	//* 156  241:dload_2         
	//* 157  242:ldc2w           #285 <Double 12742001.579854401D>
	//* 158  245:dmul            
	//* 159  246:d2f             
	//* 160  247:freturn         
		// Misplaced declaration of an exception variable
		catch(LatLng latlng)
	//* 161  248:astore_0        
		{
			((Throwable) (latlng)).printStackTrace();
	//  162  249:aload_0         
	//  163  250:invokevirtual   #251 <Method void Throwable.printStackTrace()>
			return 0.0F;
	//  164  253:fconst_0        
	//  165  254:freturn         
		}
		d4 = d3 * 0.017453292519943289D;
		d5 = d2 * 0.017453292519943289D;
		d2 = d1 * 0.017453292519943289D;
		d3 = d * 0.017453292519943289D;
		d = Math.sin(d4);
		d1 = Math.sin(d5);
		d4 = Math.cos(d4);
		d5 = Math.cos(d5);
		d6 = Math.sin(d2);
		d7 = Math.sin(d3);
		d2 = Math.cos(d2);
		d3 = Math.cos(d3);
		latlng = ((LatLng) (new double[3]));
		latlng1 = ((LatLng) (new double[3]));
		latlng[0] = d5 * d4;
		latlng[1] = d5 * d;
		latlng[2] = d1;
		latlng1[0] = d3 * d2;
		latlng1[1] = d3 * d6;
		latlng1[2] = d7;
		d = Math.asin(Math.sqrt((latlng[0] - latlng1[0]) * (latlng[0] - latlng1[0]) + (latlng[1] - latlng1[1]) * (latlng[1] - latlng1[1]) + (latlng[2] - latlng1[2]) * (latlng[2] - latlng1[2])) / 2D);
		return (float)(d * 12742001.579854401D);
	}

	public static void getLatestAMapApp(Context context)
	{
		try
		{
			Intent intent = new Intent("android.intent.action.VIEW");
	//    0    0:new             #130 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #132 <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #135 <Method void Intent(String)>
	//    4    9:astore_1        
			intent.addFlags(0x10800000);
	//    5   10:aload_1         
	//    6   11:ldc1            #136 <Int 0x10800000>
	//    7   13:invokevirtual   #140 <Method Intent Intent.addFlags(int)>
	//    8   16:pop             
			intent.addCategory("android.intent.category.DEFAULT");
	//    9   17:aload_1         
	//   10   18:ldc1            #142 <String "android.intent.category.DEFAULT">
	//   11   20:invokevirtual   #146 <Method Intent Intent.addCategory(String)>
	//   12   23:pop             
			intent.setData(Uri.parse("http://wap.amap.com/"));
	//   13   24:aload_1         
	//   14   25:ldc2            #290 <String "http://wap.amap.com/">
	//   15   28:invokestatic    #155 <Method Uri Uri.parse(String)>
	//   16   31:invokevirtual   #159 <Method Intent Intent.setData(Uri)>
	//   17   34:pop             
			(new a("glaa", context)).start();
	//   18   35:new             #6   <Class AMapUtils$a>
	//   19   38:dup             
	//   20   39:ldc2            #292 <String "glaa">
	//   21   42:aload_0         
	//   22   43:invokespecial   #169 <Method void AMapUtils$a(String, Context)>
	//   23   46:invokevirtual   #172 <Method void AMapUtils$a.start()>
			context.startActivity(intent);
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:invokevirtual   #178 <Method void Context.startActivity(Intent)>
			return;
	//   27   54:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  28   55:astore_0        
		{
			((Throwable) (context)).printStackTrace();
	//   29   56:aload_0         
	//   30   57:invokevirtual   #251 <Method void Throwable.printStackTrace()>
		}
	//   31   60:return          
	}

	public static void openAMapDrivingRoute(RoutePara routepara, Context context)
		throws AMapException
	{
		a(routepara, context, 2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:invokestatic    #296 <Method void a(RoutePara, Context, int)>
	//    4    6:return          
	}

	public static void openAMapNavi(NaviPara navipara, Context context)
		throws AMapException
	{
		if(a(context))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #125 <Method boolean a(Context)>
	//*   2    4:ifeq            98
		{
			if(navipara.getTargetPoint() != null)
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #58  <Method LatLng NaviPara.getTargetPoint()>
	//*   5   11:ifnull          88
				try
				{
					Intent intent = new Intent("android.intent.action.VIEW");
	//    6   14:new             #130 <Class Intent>
	//    7   17:dup             
	//    8   18:ldc1            #132 <String "android.intent.action.VIEW">
	//    9   20:invokespecial   #135 <Method void Intent(String)>
	//   10   23:astore_2        
					intent.addFlags(0x10800000);
	//   11   24:aload_2         
	//   12   25:ldc1            #136 <Int 0x10800000>
	//   13   27:invokevirtual   #140 <Method Intent Intent.addFlags(int)>
	//   14   30:pop             
					intent.addCategory("android.intent.category.DEFAULT");
	//   15   31:aload_2         
	//   16   32:ldc1            #142 <String "android.intent.category.DEFAULT">
	//   17   34:invokevirtual   #146 <Method Intent Intent.addCategory(String)>
	//   18   37:pop             
					intent.setData(Uri.parse(a(navipara, context)));
	//   19   38:aload_2         
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:invokestatic    #300 <Method String a(NaviPara, Context)>
	//   23   44:invokestatic    #155 <Method Uri Uri.parse(String)>
	//   24   47:invokevirtual   #159 <Method Intent Intent.setData(Uri)>
	//   25   50:pop             
					intent.setPackage("com.autonavi.minimap");
	//   26   51:aload_2         
	//   27   52:ldc1            #161 <String "com.autonavi.minimap">
	//   28   54:invokevirtual   #164 <Method Intent Intent.setPackage(String)>
	//   29   57:pop             
					(new a("oan", context)).start();
	//   30   58:new             #6   <Class AMapUtils$a>
	//   31   61:dup             
	//   32   62:ldc1            #166 <String "oan">
	//   33   64:aload_1         
	//   34   65:invokespecial   #169 <Method void AMapUtils$a(String, Context)>
	//   35   68:invokevirtual   #172 <Method void AMapUtils$a.start()>
					context.startActivity(intent);
	//   36   71:aload_1         
	//   37   72:aload_2         
	//   38   73:invokevirtual   #178 <Method void Context.startActivity(Intent)>
					return;
	//   39   76:return          
				}
				// Misplaced declaration of an exception variable
				catch(NaviPara navipara)
	//*  40   77:astore_0        
				{
					throw new AMapException("\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7");
	//   41   78:new             #120 <Class AMapException>
	//   42   81:dup             
	//   43   82:ldc1            #180 <String "\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7">
	//   44   84:invokespecial   #181 <Method void AMapException(String)>
	//   45   87:athrow          
				}
			else
				throw new AMapException("\u975E\u6CD5\u53C2\u6570");
	//   46   88:new             #120 <Class AMapException>
	//   47   91:dup             
	//   48   92:ldc1            #183 <String "\u975E\u6CD5\u53C2\u6570">
	//   49   94:invokespecial   #181 <Method void AMapException(String)>
	//   50   97:athrow          
		} else
		{
			throw new AMapException("\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7");
	//   51   98:new             #120 <Class AMapException>
	//   52  101:dup             
	//   53  102:ldc1            #180 <String "\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7">
	//   54  104:invokespecial   #181 <Method void AMapException(String)>
	//   55  107:athrow          
		}
	}

	public static void openAMapPoiNearbySearch(PoiPara poipara, Context context)
		throws AMapException
	{
		if(a(context))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #125 <Method boolean a(Context)>
	//*   2    4:ifeq            111
		{
			if(poipara.getKeywords() != null && poipara.getKeywords().trim().length() > 0)
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #97  <Method String PoiPara.getKeywords()>
	//*   5   11:ifnull          101
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #97  <Method String PoiPara.getKeywords()>
	//*   8   18:invokevirtual   #210 <Method String String.trim()>
	//*   9   21:invokevirtual   #213 <Method int String.length()>
	//*  10   24:ifle            101
				try
				{
					Intent intent = new Intent("android.intent.action.VIEW");
	//   11   27:new             #130 <Class Intent>
	//   12   30:dup             
	//   13   31:ldc1            #132 <String "android.intent.action.VIEW">
	//   14   33:invokespecial   #135 <Method void Intent(String)>
	//   15   36:astore_2        
					intent.addFlags(0x10800000);
	//   16   37:aload_2         
	//   17   38:ldc1            #136 <Int 0x10800000>
	//   18   40:invokevirtual   #140 <Method Intent Intent.addFlags(int)>
	//   19   43:pop             
					intent.addCategory("android.intent.category.DEFAULT");
	//   20   44:aload_2         
	//   21   45:ldc1            #142 <String "android.intent.category.DEFAULT">
	//   22   47:invokevirtual   #146 <Method Intent Intent.addCategory(String)>
	//   23   50:pop             
					intent.setData(Uri.parse(a(poipara, context)));
	//   24   51:aload_2         
	//   25   52:aload_0         
	//   26   53:aload_1         
	//   27   54:invokestatic    #304 <Method String a(PoiPara, Context)>
	//   28   57:invokestatic    #155 <Method Uri Uri.parse(String)>
	//   29   60:invokevirtual   #159 <Method Intent Intent.setData(Uri)>
	//   30   63:pop             
					intent.setPackage("com.autonavi.minimap");
	//   31   64:aload_2         
	//   32   65:ldc1            #161 <String "com.autonavi.minimap">
	//   33   67:invokevirtual   #164 <Method Intent Intent.setPackage(String)>
	//   34   70:pop             
					(new a("oan", context)).start();
	//   35   71:new             #6   <Class AMapUtils$a>
	//   36   74:dup             
	//   37   75:ldc1            #166 <String "oan">
	//   38   77:aload_1         
	//   39   78:invokespecial   #169 <Method void AMapUtils$a(String, Context)>
	//   40   81:invokevirtual   #172 <Method void AMapUtils$a.start()>
					context.startActivity(intent);
	//   41   84:aload_1         
	//   42   85:aload_2         
	//   43   86:invokevirtual   #178 <Method void Context.startActivity(Intent)>
					return;
	//   44   89:return          
				}
				// Misplaced declaration of an exception variable
				catch(PoiPara poipara)
	//*  45   90:astore_0        
				{
					throw new AMapException("\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7");
	//   46   91:new             #120 <Class AMapException>
	//   47   94:dup             
	//   48   95:ldc1            #180 <String "\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7">
	//   49   97:invokespecial   #181 <Method void AMapException(String)>
	//   50  100:athrow          
				}
			else
				throw new AMapException("\u975E\u6CD5\u53C2\u6570");
	//   51  101:new             #120 <Class AMapException>
	//   52  104:dup             
	//   53  105:ldc1            #183 <String "\u975E\u6CD5\u53C2\u6570">
	//   54  107:invokespecial   #181 <Method void AMapException(String)>
	//   55  110:athrow          
		} else
		{
			throw new AMapException("\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7");
	//   56  111:new             #120 <Class AMapException>
	//   57  114:dup             
	//   58  115:ldc1            #180 <String "\u79FB\u52A8\u8BBE\u5907\u4E0A\u672A\u5B89\u88C5\u9AD8\u5FB7\u5730\u56FE\u6216\u9AD8\u5FB7\u5730\u56FE\u7248\u672C\u8F83\u65E7">
	//   59  117:invokespecial   #181 <Method void AMapException(String)>
	//   60  120:athrow          
		}
	}

	public static void openAMapTransitRoute(RoutePara routepara, Context context)
		throws AMapException
	{
		a(routepara, context, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #296 <Method void a(RoutePara, Context, int)>
	//    4    6:return          
	}

	public static void openAMapWalkingRoute(RoutePara routepara, Context context)
		throws AMapException
	{
		a(routepara, context, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #296 <Method void a(RoutePara, Context, int)>
	//    4    6:return          
	}

	public static final int BUS_COMFORT = 4;
	public static final int BUS_MONEY_LITTLE = 1;
	public static final int BUS_NO_SUBWAY = 5;
	public static final int BUS_TIME_FIRST = 0;
	public static final int BUS_TRANSFER_LITTLE = 2;
	public static final int BUS_WALK_LITTLE = 3;
	public static final int DRIVING_AVOID_CONGESTION = 4;
	public static final int DRIVING_DEFAULT = 0;
	public static final int DRIVING_NO_HIGHWAY = 3;
	public static final int DRIVING_NO_HIGHWAY_AVOID_CONGESTION = 6;
	public static final int DRIVING_NO_HIGHWAY_AVOID_SHORT_MONEY = 5;
	public static final int DRIVING_NO_HIGHWAY_SAVE_MONEY_AVOID_CONGESTION = 8;
	public static final int DRIVING_SAVE_MONEY = 1;
	public static final int DRIVING_SAVE_MONEY_AVOID_CONGESTION = 7;
	public static final int DRIVING_SHORT_DISTANCE = 2;
}
