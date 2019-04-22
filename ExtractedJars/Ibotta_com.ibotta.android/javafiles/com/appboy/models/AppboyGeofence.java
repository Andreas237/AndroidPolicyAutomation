// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models;

import bo.app.gm;
import bo.app.go;
import com.google.android.gms.location.Geofence;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models:
//			IPutIntoJson

public class AppboyGeofence
	implements IPutIntoJson, Comparable
{

	public AppboyGeofence(JSONObject jsonobject)
	{
		this(jsonobject, jsonobject.getString("id"), jsonobject.getDouble("latitude"), jsonobject.getDouble("longitude"), jsonobject.getInt("radius"), jsonobject.getInt("cooldown_enter"), jsonobject.getInt("cooldown_exit"), jsonobject.getBoolean("analytics_enabled_enter"), jsonobject.getBoolean("analytics_enabled_exit"), jsonobject.optBoolean("enter_events", true), jsonobject.optBoolean("exit_events", true), jsonobject.optInt("notification_responsiveness", 30000));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:ldc1            #32  <String "id">
	//    4    5:invokevirtual   #38  <Method String JSONObject.getString(String)>
	//    5    8:aload_1         
	//    6    9:ldc1            #40  <String "latitude">
	//    7   11:invokevirtual   #44  <Method double JSONObject.getDouble(String)>
	//    8   14:aload_1         
	//    9   15:ldc1            #46  <String "longitude">
	//   10   17:invokevirtual   #44  <Method double JSONObject.getDouble(String)>
	//   11   20:aload_1         
	//   12   21:ldc1            #48  <String "radius">
	//   13   23:invokevirtual   #52  <Method int JSONObject.getInt(String)>
	//   14   26:aload_1         
	//   15   27:ldc1            #54  <String "cooldown_enter">
	//   16   29:invokevirtual   #52  <Method int JSONObject.getInt(String)>
	//   17   32:aload_1         
	//   18   33:ldc1            #56  <String "cooldown_exit">
	//   19   35:invokevirtual   #52  <Method int JSONObject.getInt(String)>
	//   20   38:aload_1         
	//   21   39:ldc1            #58  <String "analytics_enabled_enter">
	//   22   41:invokevirtual   #62  <Method boolean JSONObject.getBoolean(String)>
	//   23   44:aload_1         
	//   24   45:ldc1            #64  <String "analytics_enabled_exit">
	//   25   47:invokevirtual   #62  <Method boolean JSONObject.getBoolean(String)>
	//   26   50:aload_1         
	//   27   51:ldc1            #66  <String "enter_events">
	//   28   53:iconst_1        
	//   29   54:invokevirtual   #70  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   30   57:aload_1         
	//   31   58:ldc1            #72  <String "exit_events">
	//   32   60:iconst_1        
	//   33   61:invokevirtual   #70  <Method boolean JSONObject.optBoolean(String, boolean)>
	//   34   64:aload_1         
	//   35   65:ldc1            #74  <String "notification_responsiveness">
	//   36   67:sipush          30000
	//   37   70:invokevirtual   #78  <Method int JSONObject.optInt(String, int)>
	//   38   73:invokespecial   #81  <Method void AppboyGeofence(JSONObject, String, double, double, int, int, int, boolean, boolean, boolean, boolean, int)>
	//   39   76:return          
	}

	AppboyGeofence(JSONObject jsonobject, String s, double d1, double d2, int i1, 
			int j1, int k1, boolean flag, boolean flag1, boolean flag2, boolean flag3, int l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
		e = -1D;
	//    2    4:aload_0         
	//    3    5:ldc2w           #86  <Double -1D>
	//    4    8:putfield        #89  <Field double e>
		f = jsonobject;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #91  <Field JSONObject f>
		g = s;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #93  <Field String g>
		h = d1;
	//   11   21:aload_0         
	//   12   22:dload_3         
	//   13   23:putfield        #95  <Field double h>
		i = d2;
	//   14   26:aload_0         
	//   15   27:dload           5
	//   16   29:putfield        #97  <Field double i>
		a = i1;
	//   17   32:aload_0         
	//   18   33:iload           7
	//   19   35:putfield        #99  <Field int a>
		j = j1;
	//   20   38:aload_0         
	//   21   39:iload           8
	//   22   41:putfield        #101 <Field int j>
		k = k1;
	//   23   44:aload_0         
	//   24   45:iload           9
	//   25   47:putfield        #103 <Field int k>
		m = flag;
	//   26   50:aload_0         
	//   27   51:iload           10
	//   28   53:putfield        #105 <Field boolean m>
		l = flag1;
	//   29   56:aload_0         
	//   30   57:iload           11
	//   31   59:putfield        #107 <Field boolean l>
		b = flag2;
	//   32   62:aload_0         
	//   33   63:iload           12
	//   34   65:putfield        #109 <Field boolean b>
		c = flag3;
	//   35   68:aload_0         
	//   36   69:iload           13
	//   37   71:putfield        #111 <Field boolean c>
		d = l1;
	//   38   74:aload_0         
	//   39   75:iload           14
	//   40   77:putfield        #113 <Field int d>
	//   41   80:return          
	}

	public int compareTo(AppboyGeofence appboygeofence)
	{
		double d1 = e;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field double e>
	//    2    4:dstore_2        
		byte byte0 = 1;
	//    3    5:iconst_1        
	//    4    6:istore          4
		if(d1 == -1D)
	//*   5    8:dload_2         
	//*   6    9:ldc2w           #86  <Double -1D>
	//*   7   12:dcmpl           
	//*   8   13:ifne            18
			return 1;
	//    9   16:iconst_1        
	//   10   17:ireturn         
		if(d1 < appboygeofence.getDistanceFromGeofenceRefresh())
	//*  11   18:dload_2         
	//*  12   19:aload_1         
	//*  13   20:invokevirtual   #119 <Method double getDistanceFromGeofenceRefresh()>
	//*  14   23:dcmpg           
	//*  15   24:ifge            30
			byte0 = -1;
	//   16   27:iconst_m1       
	//   17   28:istore          4
		return ((int) (byte0));
	//   18   30:iload           4
	//   19   32:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((AppboyGeofence)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class AppboyGeofence>
	//    3    5:invokevirtual   #122 <Method int compareTo(AppboyGeofence)>
	//    4    8:ireturn         
	}

	public boolean equivalentServerData(AppboyGeofence appboygeofence)
	{
		try
		{
			gm.a(appboygeofence.forJsonPut(), f, go.b);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #132 <Method JSONObject forJsonPut()>
	//    2    4:aload_0         
	//    3    5:getfield        #91  <Field JSONObject f>
	//    4    8:getstatic       #137 <Field go go.b>
	//    5   11:invokestatic    #142 <Method void gm.a(JSONObject, JSONObject, go)>
		}
	//*   6   14:iconst_1        
	//*   7   15:ireturn         
		// Misplaced declaration of an exception variable
		catch(AppboyGeofence appboygeofence)
	//*   8   16:astore_1        
		{
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(AppboyGeofence appboygeofence)
	//*  11   19:astore_1        
		{
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		}
		return true;
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field JSONObject f>
	//    2    4:areturn         
	}

	public boolean getAnalyticsEnabledEnter()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field boolean m>
	//    2    4:ireturn         
	}

	public boolean getAnalyticsEnabledExit()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean l>
	//    2    4:ireturn         
	}

	public int getCooldownEnterSeconds()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int j>
	//    2    4:ireturn         
	}

	public int getCooldownExitSeconds()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int k>
	//    2    4:ireturn         
	}

	public double getDistanceFromGeofenceRefresh()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field double e>
	//    2    4:dreturn         
	}

	public String getId()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field String g>
	//    2    4:areturn         
	}

	public double getLatitude()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field double h>
	//    2    4:dreturn         
	}

	public double getLongitude()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field double i>
	//    2    4:dreturn         
	}

	public double getRadiusMeters()
	{
		return (double)a;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field int a>
	//    2    4:i2d             
	//    3    5:dreturn         
	}

	public void setDistanceFromGeofenceRefresh(double d1)
	{
		e = d1;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #89  <Field double e>
	//    3    5:return          
	}

	public Geofence toGeofence()
	{
		com.google.android.gms.location.Geofence.Builder builder = new com.google.android.gms.location.Geofence.Builder();
	//    0    0:new             #160 <Class com.google.android.gms.location.Geofence$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #161 <Method void com.google.android.gms.location.Geofence$Builder()>
	//    3    7:astore_3        
		builder.setRequestId(g).setCircularRegion(h, i, a).setNotificationResponsiveness(d).setExpirationDuration(-1L);
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #93  <Field String g>
	//    7   13:invokevirtual   #165 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setRequestId(String)>
	//    8   16:aload_0         
	//    9   17:getfield        #95  <Field double h>
	//   10   20:aload_0         
	//   11   21:getfield        #97  <Field double i>
	//   12   24:aload_0         
	//   13   25:getfield        #99  <Field int a>
	//   14   28:i2f             
	//   15   29:invokevirtual   #169 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setCircularRegion(double, double, float)>
	//   16   32:aload_0         
	//   17   33:getfield        #113 <Field int d>
	//   18   36:invokevirtual   #173 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setNotificationResponsiveness(int)>
	//   19   39:ldc2w           #174 <Long -1L>
	//   20   42:invokevirtual   #179 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setExpirationDuration(long)>
	//   21   45:pop             
		int i1;
		if(b)
	//*  22   46:aload_0         
	//*  23   47:getfield        #109 <Field boolean b>
	//*  24   50:ifeq            58
			i1 = 1;
	//   25   53:iconst_1        
	//   26   54:istore_1        
		else
	//*  27   55:goto            60
			i1 = 0;
	//   28   58:iconst_0        
	//   29   59:istore_1        
		int j1 = i1;
	//   30   60:iload_1         
	//   31   61:istore_2        
		if(c)
	//*  32   62:aload_0         
	//*  33   63:getfield        #111 <Field boolean c>
	//*  34   66:ifeq            73
			j1 = i1 | 2;
	//   35   69:iload_1         
	//   36   70:iconst_2        
	//   37   71:ior             
	//   38   72:istore_2        
		builder.setTransitionTypes(j1);
	//   39   73:aload_3         
	//   40   74:iload_2         
	//   41   75:invokevirtual   #182 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setTransitionTypes(int)>
	//   42   78:pop             
		return builder.build();
	//   43   79:aload_3         
	//   44   80:invokevirtual   #185 <Method Geofence com.google.android.gms.location.Geofence$Builder.build()>
	//   45   83:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("AppboyGeofence{");
	//    0    0:new             #188 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #190 <String "AppboyGeofence{">
	//    3    6:invokespecial   #193 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append("id=");
	//    5   10:aload_1         
	//    6   11:ldc1            #195 <String "id=">
	//    7   13:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(g);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #93  <Field String g>
	//   12   22:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(", latitude='");
	//   14   26:aload_1         
	//   15   27:ldc1            #201 <String ", latitude='">
	//   16   29:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(h);
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #95  <Field double h>
	//   21   38:invokevirtual   #204 <Method StringBuilder StringBuilder.append(double)>
	//   22   41:pop             
		stringbuilder.append(", longitude=");
	//   23   42:aload_1         
	//   24   43:ldc1            #206 <String ", longitude=">
	//   25   45:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append(i);
	//   27   49:aload_1         
	//   28   50:aload_0         
	//   29   51:getfield        #97  <Field double i>
	//   30   54:invokevirtual   #204 <Method StringBuilder StringBuilder.append(double)>
	//   31   57:pop             
		stringbuilder.append(", radiusMeters=");
	//   32   58:aload_1         
	//   33   59:ldc1            #208 <String ", radiusMeters=">
	//   34   61:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		stringbuilder.append(a);
	//   36   65:aload_1         
	//   37   66:aload_0         
	//   38   67:getfield        #99  <Field int a>
	//   39   70:invokevirtual   #211 <Method StringBuilder StringBuilder.append(int)>
	//   40   73:pop             
		stringbuilder.append(", cooldownEnterSeconds=");
	//   41   74:aload_1         
	//   42   75:ldc1            #213 <String ", cooldownEnterSeconds=">
	//   43   77:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   44   80:pop             
		stringbuilder.append(j);
	//   45   81:aload_1         
	//   46   82:aload_0         
	//   47   83:getfield        #101 <Field int j>
	//   48   86:invokevirtual   #211 <Method StringBuilder StringBuilder.append(int)>
	//   49   89:pop             
		stringbuilder.append(", cooldownExitSeconds=");
	//   50   90:aload_1         
	//   51   91:ldc1            #215 <String ", cooldownExitSeconds=">
	//   52   93:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   53   96:pop             
		stringbuilder.append(k);
	//   54   97:aload_1         
	//   55   98:aload_0         
	//   56   99:getfield        #103 <Field int k>
	//   57  102:invokevirtual   #211 <Method StringBuilder StringBuilder.append(int)>
	//   58  105:pop             
		stringbuilder.append(", analyticsEnabledEnter=");
	//   59  106:aload_1         
	//   60  107:ldc1            #217 <String ", analyticsEnabledEnter=">
	//   61  109:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   62  112:pop             
		stringbuilder.append(m);
	//   63  113:aload_1         
	//   64  114:aload_0         
	//   65  115:getfield        #105 <Field boolean m>
	//   66  118:invokevirtual   #220 <Method StringBuilder StringBuilder.append(boolean)>
	//   67  121:pop             
		stringbuilder.append(", analyticsEnabledExit=");
	//   68  122:aload_1         
	//   69  123:ldc1            #222 <String ", analyticsEnabledExit=">
	//   70  125:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   71  128:pop             
		stringbuilder.append(l);
	//   72  129:aload_1         
	//   73  130:aload_0         
	//   74  131:getfield        #107 <Field boolean l>
	//   75  134:invokevirtual   #220 <Method StringBuilder StringBuilder.append(boolean)>
	//   76  137:pop             
		stringbuilder.append(", enterEvents=");
	//   77  138:aload_1         
	//   78  139:ldc1            #224 <String ", enterEvents=">
	//   79  141:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   80  144:pop             
		stringbuilder.append(b);
	//   81  145:aload_1         
	//   82  146:aload_0         
	//   83  147:getfield        #109 <Field boolean b>
	//   84  150:invokevirtual   #220 <Method StringBuilder StringBuilder.append(boolean)>
	//   85  153:pop             
		stringbuilder.append(", exitEvents=");
	//   86  154:aload_1         
	//   87  155:ldc1            #226 <String ", exitEvents=">
	//   88  157:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   89  160:pop             
		stringbuilder.append(c);
	//   90  161:aload_1         
	//   91  162:aload_0         
	//   92  163:getfield        #111 <Field boolean c>
	//   93  166:invokevirtual   #220 <Method StringBuilder StringBuilder.append(boolean)>
	//   94  169:pop             
		stringbuilder.append(", notificationResponsivenessMs=");
	//   95  170:aload_1         
	//   96  171:ldc1            #228 <String ", notificationResponsivenessMs=">
	//   97  173:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//   98  176:pop             
		stringbuilder.append(d);
	//   99  177:aload_1         
	//  100  178:aload_0         
	//  101  179:getfield        #113 <Field int d>
	//  102  182:invokevirtual   #211 <Method StringBuilder StringBuilder.append(int)>
	//  103  185:pop             
		stringbuilder.append(", distanceFromGeofenceRefresh=");
	//  104  186:aload_1         
	//  105  187:ldc1            #230 <String ", distanceFromGeofenceRefresh=">
	//  106  189:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
	//  107  192:pop             
		stringbuilder.append(e);
	//  108  193:aload_1         
	//  109  194:aload_0         
	//  110  195:getfield        #89  <Field double e>
	//  111  198:invokevirtual   #204 <Method StringBuilder StringBuilder.append(double)>
	//  112  201:pop             
		stringbuilder.append('}');
	//  113  202:aload_1         
	//  114  203:bipush          125
	//  115  205:invokevirtual   #233 <Method StringBuilder StringBuilder.append(char)>
	//  116  208:pop             
		return stringbuilder.toString();
	//  117  209:aload_1         
	//  118  210:invokevirtual   #235 <Method String StringBuilder.toString()>
	//  119  213:areturn         
	}

	final int a;
	final boolean b;
	final boolean c;
	final int d;
	double e;
	private final JSONObject f;
	private final String g;
	private final double h;
	private final double i;
	private final int j;
	private final int k;
	private final boolean l;
	private final boolean m;
}
