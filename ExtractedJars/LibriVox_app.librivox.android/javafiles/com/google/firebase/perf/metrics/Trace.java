// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.perf.metrics;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.a.g;
import android.util.Log;
import com.google.android.gms.internal.firebase-perf.*;
import com.google.firebase.perf.internal.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.firebase.perf.metrics:
//			d, e, c, zza, 
//			f, g

public class Trace extends f
	implements Parcelable
{

	private Trace(Parcel parcel, boolean flag)
	{
		a a1;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            9
			a1 = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		else
	//*   4    6:goto            13
			a1 = com.google.firebase.perf.internal.a.a();
	//    5    9:invokestatic    #58  <Method a a.a()>
	//    6   12:astore_3        
		super(a1);
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:invokespecial   #61  <Method void f(a)>
		m = ((BroadcastReceiver) (new c(this)));
	//   10   18:aload_0         
	//   11   19:new             #63  <Class c>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:invokespecial   #66  <Method void c(Trace)>
	//   15   27:putfield        #68  <Field BroadcastReceiver m>
		b = (Trace)parcel.readParcelable(((Class) (com/google/firebase/perf/metrics/Trace)).getClassLoader());
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:ldc1            #2   <Class Trace>
	//   19   34:invokevirtual   #74  <Method ClassLoader Class.getClassLoader()>
	//   20   37:invokevirtual   #80  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   21   40:checkcast       #2   <Class Trace>
	//   22   43:putfield        #82  <Field Trace b>
		d = parcel.readString();
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:invokevirtual   #86  <Method String Parcel.readString()>
	//   26   51:putfield        #88  <Field String d>
		f = ((List) (new ArrayList()));
	//   27   54:aload_0         
	//   28   55:new             #90  <Class ArrayList>
	//   29   58:dup             
	//   30   59:invokespecial   #91  <Method void ArrayList()>
	//   31   62:putfield        #93  <Field List f>
		parcel.readList(f, ((Class) (com/google/firebase/perf/metrics/Trace)).getClassLoader());
	//   32   65:aload_1         
	//   33   66:aload_0         
	//   34   67:getfield        #93  <Field List f>
	//   35   70:ldc1            #2   <Class Trace>
	//   36   72:invokevirtual   #74  <Method ClassLoader Class.getClassLoader()>
	//   37   75:invokevirtual   #97  <Method void Parcel.readList(List, ClassLoader)>
		g = ((Map) (new ConcurrentHashMap()));
	//   38   78:aload_0         
	//   39   79:new             #36  <Class ConcurrentHashMap>
	//   40   82:dup             
	//   41   83:invokespecial   #39  <Method void ConcurrentHashMap()>
	//   42   86:putfield        #99  <Field Map g>
		j = ((Map) (new ConcurrentHashMap()));
	//   43   89:aload_0         
	//   44   90:new             #36  <Class ConcurrentHashMap>
	//   45   93:dup             
	//   46   94:invokespecial   #39  <Method void ConcurrentHashMap()>
	//   47   97:putfield        #101 <Field Map j>
		parcel.readMap(g, ((Class) (com/google/firebase/perf/metrics/zza)).getClassLoader());
	//   48  100:aload_1         
	//   49  101:aload_0         
	//   50  102:getfield        #99  <Field Map g>
	//   51  105:ldc1            #103 <Class zza>
	//   52  107:invokevirtual   #74  <Method ClassLoader Class.getClassLoader()>
	//   53  110:invokevirtual   #107 <Method void Parcel.readMap(Map, ClassLoader)>
		k = (zzbg)parcel.readParcelable(((Class) (com/google/android/gms/internal/firebase-perf/zzbg)).getClassLoader());
	//   54  113:aload_0         
	//   55  114:aload_1         
	//   56  115:ldc1            #109 <Class zzbg>
	//   57  117:invokevirtual   #74  <Method ClassLoader Class.getClassLoader()>
	//   58  120:invokevirtual   #80  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   59  123:checkcast       #109 <Class zzbg>
	//   60  126:putfield        #111 <Field zzbg k>
		l = (zzbg)parcel.readParcelable(((Class) (com/google/android/gms/internal/firebase-perf/zzbg)).getClassLoader());
	//   61  129:aload_0         
	//   62  130:aload_1         
	//   63  131:ldc1            #109 <Class zzbg>
	//   64  133:invokevirtual   #74  <Method ClassLoader Class.getClassLoader()>
	//   65  136:invokevirtual   #80  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   66  139:checkcast       #109 <Class zzbg>
	//   67  142:putfield        #113 <Field zzbg l>
		e = ((List) (new ArrayList()));
	//   68  145:aload_0         
	//   69  146:new             #90  <Class ArrayList>
	//   70  149:dup             
	//   71  150:invokespecial   #91  <Method void ArrayList()>
	//   72  153:putfield        #115 <Field List e>
		parcel.readList(e, ((Class) (com/google/firebase/perf/internal/zzt)).getClassLoader());
	//   73  156:aload_1         
	//   74  157:aload_0         
	//   75  158:getfield        #115 <Field List e>
	//   76  161:ldc1            #117 <Class zzt>
	//   77  163:invokevirtual   #74  <Method ClassLoader Class.getClassLoader()>
	//   78  166:invokevirtual   #97  <Method void Parcel.readList(List, ClassLoader)>
		if(flag)
	//*  79  169:iload_2         
	//*  80  170:ifeq            189
		{
			i = null;
	//   81  173:aload_0         
	//   82  174:aconst_null     
	//   83  175:putfield        #119 <Field h i>
			h = null;
	//   84  178:aload_0         
	//   85  179:aconst_null     
	//   86  180:putfield        #121 <Field x h>
			c = null;
	//   87  183:aload_0         
	//   88  184:aconst_null     
	//   89  185:putfield        #123 <Field GaugeManager c>
			return;
	//   90  188:return          
		} else
		{
			i = com.google.firebase.perf.internal.h.a();
	//   91  189:aload_0         
	//   92  190:invokestatic    #128 <Method h h.a()>
	//   93  193:putfield        #119 <Field h i>
			h = new x();
	//   94  196:aload_0         
	//   95  197:new             #130 <Class x>
	//   96  200:dup             
	//   97  201:invokespecial   #131 <Method void x()>
	//   98  204:putfield        #121 <Field x h>
			c = GaugeManager.zzbf();
	//   99  207:aload_0         
	//  100  208:invokestatic    #137 <Method GaugeManager GaugeManager.zzbf()>
	//  101  211:putfield        #123 <Field GaugeManager c>
			return;
	//  102  214:return          
		}
	}

	Trace(Parcel parcel, boolean flag, c c1)
	{
		this(parcel, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #140 <Method void Trace(Parcel, boolean)>
	//    4    6:return          
	}

	public Trace(String s, h h1, x x1, a a1)
	{
		this(s, h1, x1, a1, GaugeManager.zzbf());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #137 <Method GaugeManager GaugeManager.zzbf()>
	//    6    9:invokespecial   #144 <Method void Trace(String, h, x, a, GaugeManager)>
	//    7   12:return          
	}

	private Trace(String s, h h1, x x1, a a1, GaugeManager gaugemanager)
	{
		super(a1);
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:invokespecial   #61  <Method void f(a)>
		m = ((BroadcastReceiver) (new c(this)));
	//    3    6:aload_0         
	//    4    7:new             #63  <Class c>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:invokespecial   #66  <Method void c(Trace)>
	//    8   15:putfield        #68  <Field BroadcastReceiver m>
		b = null;
	//    9   18:aload_0         
	//   10   19:aconst_null     
	//   11   20:putfield        #82  <Field Trace b>
		d = s.trim();
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #149 <Method String String.trim()>
	//   15   28:putfield        #88  <Field String d>
		f = ((List) (new ArrayList()));
	//   16   31:aload_0         
	//   17   32:new             #90  <Class ArrayList>
	//   18   35:dup             
	//   19   36:invokespecial   #91  <Method void ArrayList()>
	//   20   39:putfield        #93  <Field List f>
		g = ((Map) (new ConcurrentHashMap()));
	//   21   42:aload_0         
	//   22   43:new             #36  <Class ConcurrentHashMap>
	//   23   46:dup             
	//   24   47:invokespecial   #39  <Method void ConcurrentHashMap()>
	//   25   50:putfield        #99  <Field Map g>
		j = ((Map) (new ConcurrentHashMap()));
	//   26   53:aload_0         
	//   27   54:new             #36  <Class ConcurrentHashMap>
	//   28   57:dup             
	//   29   58:invokespecial   #39  <Method void ConcurrentHashMap()>
	//   30   61:putfield        #101 <Field Map j>
		h = x1;
	//   31   64:aload_0         
	//   32   65:aload_3         
	//   33   66:putfield        #121 <Field x h>
		i = h1;
	//   34   69:aload_0         
	//   35   70:aload_2         
	//   36   71:putfield        #119 <Field h i>
		e = ((List) (new ArrayList()));
	//   37   74:aload_0         
	//   38   75:new             #90  <Class ArrayList>
	//   39   78:dup             
	//   40   79:invokespecial   #91  <Method void ArrayList()>
	//   41   82:putfield        #115 <Field List e>
		c = gaugemanager;
	//   42   85:aload_0         
	//   43   86:aload           5
	//   44   88:putfield        #123 <Field GaugeManager c>
	//   45   91:return          
	}

	private final zza a(String s)
	{
		zza zza2 = (zza)g.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Map g>
	//    2    4:aload_1         
	//    3    5:invokeinterface #156 <Method Object Map.get(Object)>
	//    4   10:checkcast       #103 <Class zza>
	//    5   13:astore_3        
		zza zza1 = zza2;
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(zza2 == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       41
		{
			zza1 = new zza(s);
	//   10   20:new             #103 <Class zza>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #159 <Method void zza(String)>
	//   14   28:astore_2        
			g.put(((Object) (s)), ((Object) (zza1)));
	//   15   29:aload_0         
	//   16   30:getfield        #99  <Field Map g>
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:invokeinterface #163 <Method Object Map.put(Object, Object)>
	//   20   40:pop             
		}
		return zza1;
	//   21   41:aload_2         
	//   22   42:areturn         
	}

	static List a(Trace trace)
	{
		return trace.e;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field List e>
	//    2    4:areturn         
	}

	private final void a(String s, long l1, int i1)
	{
		String s1 = u.a(s, i1);
	//    0    0:aload_1         
	//    1    1:iload           4
	//    2    3:invokestatic    #170 <Method String u.a(String, int)>
	//    3    6:astore          5
		if(s1 != null)
	//*   4    8:aload           5
	//*   5   10:ifnull          95
			switch(com.google.firebase.perf.metrics.f.a[i1 - 1])
	//*   6   13:getstatic       #175 <Field int[] com.google.firebase.perf.metrics.f.a>
	//*   7   16:iload           4
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:iaload          
			{
	//*  11   21:tableswitch     1 2: default 44
	//	               1 70
	//	               2 45
			default:
				return;
	//   12   44:return          

			case 2: // '\002'
				Log.e("FirebasePerformance", String.format("Cannot increment metric %s. Metric name is invalid.(%s)", new Object[] {
					s, s1
				}));
	//   13   45:ldc1            #177 <String "FirebasePerformance">
	//   14   47:ldc1            #179 <String "Cannot increment metric %s. Metric name is invalid.(%s)">
	//   15   49:iconst_2        
	//   16   50:anewarray       Object[]
	//   17   53:dup             
	//   18   54:iconst_0        
	//   19   55:aload_1         
	//   20   56:aastore         
	//   21   57:dup             
	//   22   58:iconst_1        
	//   23   59:aload           5
	//   24   61:aastore         
	//   25   62:invokestatic    #185 <Method String String.format(String, Object[])>
	//   26   65:invokestatic    #190 <Method int Log.e(String, String)>
	//   27   68:pop             
				return;
	//   28   69:return          

			case 1: // '\001'
				Log.e("FirebasePerformance", String.format("Cannot increment counter %s. Counter name is invalid.(%s)", new Object[] {
					s, s1
				}));
	//   29   70:ldc1            #177 <String "FirebasePerformance">
	//   30   72:ldc1            #192 <String "Cannot increment counter %s. Counter name is invalid.(%s)">
	//   31   74:iconst_2        
	//   32   75:anewarray       Object[]
	//   33   78:dup             
	//   34   79:iconst_0        
	//   35   80:aload_1         
	//   36   81:aastore         
	//   37   82:dup             
	//   38   83:iconst_1        
	//   39   84:aload           5
	//   40   86:aastore         
	//   41   87:invokestatic    #185 <Method String String.format(String, Object[])>
	//   42   90:invokestatic    #190 <Method int Log.e(String, String)>
	//   43   93:pop             
				return;
	//   44   94:return          
			}
		if(!g())
	//*  45   95:aload_0         
	//*  46   96:invokevirtual   #195 <Method boolean g()>
	//*  47   99:ifne            187
			switch(com.google.firebase.perf.metrics.f.a[i1 - 1])
	//*  48  102:getstatic       #175 <Field int[] com.google.firebase.perf.metrics.f.a>
	//*  49  105:iload           4
	//*  50  107:iconst_1        
	//*  51  108:isub            
	//*  52  109:iaload          
			{
	//*  53  110:tableswitch     1 2: default 132
	//	               1 160
	//	               2 133
			default:
				return;
	//   54  132:return          

			case 2: // '\002'
				Log.w("FirebasePerformance", String.format("Cannot increment metric '%s' for trace '%s' because it's not started", new Object[] {
					s, d
				}));
	//   55  133:ldc1            #177 <String "FirebasePerformance">
	//   56  135:ldc1            #197 <String "Cannot increment metric '%s' for trace '%s' because it's not started">
	//   57  137:iconst_2        
	//   58  138:anewarray       Object[]
	//   59  141:dup             
	//   60  142:iconst_0        
	//   61  143:aload_1         
	//   62  144:aastore         
	//   63  145:dup             
	//   64  146:iconst_1        
	//   65  147:aload_0         
	//   66  148:getfield        #88  <Field String d>
	//   67  151:aastore         
	//   68  152:invokestatic    #185 <Method String String.format(String, Object[])>
	//   69  155:invokestatic    #200 <Method int Log.w(String, String)>
	//   70  158:pop             
				return;
	//   71  159:return          

			case 1: // '\001'
				Log.w("FirebasePerformance", String.format("Cannot increment counter '%s' for trace '%s' because it's not started", new Object[] {
					s, d
				}));
	//   72  160:ldc1            #177 <String "FirebasePerformance">
	//   73  162:ldc1            #202 <String "Cannot increment counter '%s' for trace '%s' because it's not started">
	//   74  164:iconst_2        
	//   75  165:anewarray       Object[]
	//   76  168:dup             
	//   77  169:iconst_0        
	//   78  170:aload_1         
	//   79  171:aastore         
	//   80  172:dup             
	//   81  173:iconst_1        
	//   82  174:aload_0         
	//   83  175:getfield        #88  <Field String d>
	//   84  178:aastore         
	//   85  179:invokestatic    #185 <Method String String.format(String, Object[])>
	//   86  182:invokestatic    #200 <Method int Log.w(String, String)>
	//   87  185:pop             
				return;
	//   88  186:return          
			}
		if(f())
	//*  89  187:aload_0         
	//*  90  188:invokevirtual   #204 <Method boolean f()>
	//*  91  191:ifeq            279
		{
			switch(com.google.firebase.perf.metrics.f.a[i1 - 1])
	//*  92  194:getstatic       #175 <Field int[] com.google.firebase.perf.metrics.f.a>
	//*  93  197:iload           4
	//*  94  199:iconst_1        
	//*  95  200:isub            
	//*  96  201:iaload          
			{
	//*  97  202:tableswitch     1 2: default 224
	//	               1 252
	//	               2 225
			default:
				return;
	//   98  224:return          

			case 2: // '\002'
				Log.w("FirebasePerformance", String.format("Cannot increment metric '%s' for trace '%s' because it's been stopped", new Object[] {
					s, d
				}));
	//   99  225:ldc1            #177 <String "FirebasePerformance">
	//  100  227:ldc1            #206 <String "Cannot increment metric '%s' for trace '%s' because it's been stopped">
	//  101  229:iconst_2        
	//  102  230:anewarray       Object[]
	//  103  233:dup             
	//  104  234:iconst_0        
	//  105  235:aload_1         
	//  106  236:aastore         
	//  107  237:dup             
	//  108  238:iconst_1        
	//  109  239:aload_0         
	//  110  240:getfield        #88  <Field String d>
	//  111  243:aastore         
	//  112  244:invokestatic    #185 <Method String String.format(String, Object[])>
	//  113  247:invokestatic    #200 <Method int Log.w(String, String)>
	//  114  250:pop             
				return;
	//  115  251:return          

			case 1: // '\001'
				Log.w("FirebasePerformance", String.format("Cannot increment counter '%s' for trace '%s' because it's been stopped", new Object[] {
					s, d
				}));
	//  116  252:ldc1            #177 <String "FirebasePerformance">
	//  117  254:ldc1            #208 <String "Cannot increment counter '%s' for trace '%s' because it's been stopped">
	//  118  256:iconst_2        
	//  119  257:anewarray       Object[]
	//  120  260:dup             
	//  121  261:iconst_0        
	//  122  262:aload_1         
	//  123  263:aastore         
	//  124  264:dup             
	//  125  265:iconst_1        
	//  126  266:aload_0         
	//  127  267:getfield        #88  <Field String d>
	//  128  270:aastore         
	//  129  271:invokestatic    #185 <Method String String.format(String, Object[])>
	//  130  274:invokestatic    #200 <Method int Log.w(String, String)>
	//  131  277:pop             
				return;
	//  132  278:return          
			}
		} else
		{
			a(s.trim()).a(l1);
	//  133  279:aload_0         
	//  134  280:aload_1         
	//  135  281:invokevirtual   #149 <Method String String.trim()>
	//  136  284:invokespecial   #210 <Method zza a(String)>
	//  137  287:lload_2         
	//  138  288:invokevirtual   #213 <Method void com.google.firebase.perf.metrics.zza.a(long)>
			return;
	//  139  291:return          
		}
	}

	final String a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String d>
	//    2    4:areturn         
	}

	final Map b()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Map g>
	//    2    4:areturn         
	}

	final zzbg c()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field zzbg k>
	//    2    4:areturn         
	}

	final zzbg d()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field zzbg l>
	//    2    4:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final List e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field List f>
	//    2    4:areturn         
	}

	final boolean f()
	{
		return l != null;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field zzbg l>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected void finalize()
	{
		boolean flag;
		Exception exception;
		if(g() && !f())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #195 <Method boolean g()>
	//*   2    4:ifeq            62
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #204 <Method boolean f()>
	//*   5   11:ifne            62
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_1        
		else
	//*   8   16:goto            19
	//*   9   19:iload_1         
	//*  10   20:ifeq            50
	//*  11   23:ldc1            #177 <String "FirebasePerformance">
	//*  12   25:ldc1            #222 <String "Trace '%s' is started but not stopped when it is destructed!">
	//*  13   27:iconst_1        
	//*  14   28:anewarray       Object[]
	//*  15   31:dup             
	//*  16   32:iconst_0        
	//*  17   33:aload_0         
	//*  18   34:getfield        #88  <Field String d>
	//*  19   37:aastore         
	//*  20   38:invokestatic    #185 <Method String String.format(String, Object[])>
	//*  21   41:invokestatic    #200 <Method int Log.w(String, String)>
	//*  22   44:pop             
	//*  23   45:aload_0         
	//*  24   46:iconst_1        
	//*  25   47:invokevirtual   #226 <Method void f.zzc(int)>
	//*  26   50:aload_0         
	//*  27   51:invokespecial   #228 <Method void Object.finalize()>
	//*  28   54:return          
	//*  29   55:astore_2        
	//*  30   56:aload_0         
	//*  31   57:invokespecial   #228 <Method void Object.finalize()>
	//*  32   60:aload_2         
	//*  33   61:athrow          
			flag = false;
	//   34   62:iconst_0        
	//   35   63:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_50;
		Log.w("FirebasePerformance", String.format("Trace '%s' is started but not stopped when it is destructed!", new Object[] {
			d
		}));
		((f)this).zzc(1);
		((Object)this).finalize();
		return;
		exception;
		((Object)this).finalize();
		throw exception;
	//*  36   64:goto            19
	}

	final boolean g()
	{
		return k != null;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field zzbg k>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String getAttribute(String s)
	{
		return (String)j.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Map j>
	//    2    4:aload_1         
	//    3    5:invokeinterface #156 <Method Object Map.get(Object)>
	//    4   10:checkcast       #146 <Class String>
	//    5   13:areturn         
	}

	public Map getAttributes()
	{
		return ((Map) (new HashMap(j)));
	//    0    0:new             #233 <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #101 <Field Map j>
	//    4    8:invokespecial   #236 <Method void HashMap(Map)>
	//    5   11:areturn         
	}

	public long getLongMetric(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
			s = ((String) ((zza)g.get(((Object) (s.trim())))));
	//    2    4:aload_0         
	//    3    5:getfield        #99  <Field Map g>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #149 <Method String String.trim()>
	//    6   12:invokeinterface #156 <Method Object Map.get(Object)>
	//    7   17:checkcast       #103 <Class zza>
	//    8   20:astore_1        
		else
	//*   9   21:goto            26
			s = null;
	//   10   24:aconst_null     
	//   11   25:astore_1        
		if(s == null)
	//*  12   26:aload_1         
	//*  13   27:ifnonnull       32
			return 0L;
	//   14   30:lconst_0        
	//   15   31:lreturn         
		else
			return ((zza) (s)).b();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #241 <Method long zza.b()>
	//   18   36:lreturn         
	}

	public final List h()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field List e>
	//    2    4:areturn         
	}

	public void incrementCounter(String s)
	{
		incrementCounter(s, 1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lconst_1        
	//    3    3:invokevirtual   #246 <Method void incrementCounter(String, long)>
	//    4    6:return          
	}

	public void incrementCounter(String s, long l1)
	{
		a(s, l1, w.a);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:getstatic       #252 <Field int w.a>
	//    4    6:invokespecial   #254 <Method void a(String, long, int)>
	//    5    9:return          
	}

	public void incrementMetric(String s, long l1)
	{
		a(s, l1, w.b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:getstatic       #257 <Field int w.b>
	//    4    6:invokespecial   #254 <Method void a(String, long, int)>
	//    5    9:return          
	}

	public void putAttribute(String s, String s1)
	{
		boolean flag;
		String s2;
		String s3;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		s2 = s;
	//    2    2:aload_1         
	//    3    3:astore          4
		s3 = s1;
	//    4    5:aload_2         
	//    5    6:astore          5
		s = s.trim();
	//    6    8:aload_1         
	//    7    9:invokevirtual   #149 <Method String String.trim()>
	//    8   12:astore_1        
		s2 = s;
	//    9   13:aload_1         
	//   10   14:astore          4
		s3 = s1;
	//   11   16:aload_2         
	//   12   17:astore          5
		s1 = s1.trim();
	//   13   19:aload_2         
	//   14   20:invokevirtual   #149 <Method String String.trim()>
	//   15   23:astore_2        
		s2 = s;
	//   16   24:aload_1         
	//   17   25:astore          4
		s3 = s1;
	//   18   27:aload_2         
	//   19   28:astore          5
		if(f())
			break MISSING_BLOCK_LABEL_158;
	//   20   30:aload_0         
	//   21   31:invokevirtual   #204 <Method boolean f()>
	//   22   34:ifne            158
		s2 = s;
	//   23   37:aload_1         
	//   24   38:astore          4
		s3 = s1;
	//   25   40:aload_2         
	//   26   41:astore          5
		if(j.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_112;
	//   27   43:aload_0         
	//   28   44:getfield        #101 <Field Map j>
	//   29   47:aload_1         
	//   30   48:invokeinterface #265 <Method boolean Map.containsKey(Object)>
	//   31   53:ifne            112
		s2 = s;
	//   32   56:aload_1         
	//   33   57:astore          4
		s3 = s1;
	//   34   59:aload_2         
	//   35   60:astore          5
		if(j.size() >= 5)
	//*  36   62:aload_0         
	//*  37   63:getfield        #101 <Field Map j>
	//*  38   66:invokeinterface #268 <Method int Map.size()>
	//*  39   71:iconst_5        
	//*  40   72:icmpge          78
	//*  41   75:goto            112
		{
			s2 = s;
	//   42   78:aload_1         
	//   43   79:astore          4
			s3 = s1;
	//   44   81:aload_2         
	//   45   82:astore          5
			String s4;
			try
			{
				throw new IllegalArgumentException(String.format(Locale.US, "Exceeds max limit of number of attributes - %d", new Object[] {
					Integer.valueOf(5)
				}));
	//   46   84:new             #270 <Class IllegalArgumentException>
	//   47   87:dup             
	//   48   88:getstatic       #276 <Field Locale Locale.US>
	//   49   91:ldc2            #278 <String "Exceeds max limit of number of attributes - %d">
	//   50   94:iconst_1        
	//   51   95:anewarray       Object[]
	//   52   98:dup             
	//   53   99:iconst_0        
	//   54  100:iconst_5        
	//   55  101:invokestatic    #284 <Method Integer Integer.valueOf(int)>
	//   56  104:aastore         
	//   57  105:invokestatic    #287 <Method String String.format(Locale, String, Object[])>
	//   58  108:invokespecial   #288 <Method void IllegalArgumentException(String)>
	//   59  111:athrow          
			}
	//*  60  112:aload_1         
	//*  61  113:astore          4
	//*  62  115:aload_2         
	//*  63  116:astore          5
	//*  64  118:new             #290 <Class java.util.AbstractMap$SimpleEntry>
	//*  65  121:dup             
	//*  66  122:aload_1         
	//*  67  123:aload_2         
	//*  68  124:invokespecial   #293 <Method void java.util.AbstractMap$SimpleEntry(Object, Object)>
	//*  69  127:invokestatic    #296 <Method String u.a(java.util.Map$Entry)>
	//*  70  130:astore          6
	//*  71  132:aload           6
	//*  72  134:ifnonnull       142
	//*  73  137:iconst_1        
	//*  74  138:istore_3        
	//*  75  139:goto            232
	//*  76  142:aload_1         
	//*  77  143:astore          4
	//*  78  145:aload_2         
	//*  79  146:astore          5
	//*  80  148:new             #270 <Class IllegalArgumentException>
	//*  81  151:dup             
	//*  82  152:aload           6
	//*  83  154:invokespecial   #288 <Method void IllegalArgumentException(String)>
	//*  84  157:athrow          
	//*  85  158:aload_1         
	//*  86  159:astore          4
	//*  87  161:aload_2         
	//*  88  162:astore          5
	//*  89  164:new             #270 <Class IllegalArgumentException>
	//*  90  167:dup             
	//*  91  168:getstatic       #276 <Field Locale Locale.US>
	//*  92  171:ldc2            #298 <String "Trace %s has been stopped">
	//*  93  174:iconst_1        
	//*  94  175:anewarray       Object[]
	//*  95  178:dup             
	//*  96  179:iconst_0        
	//*  97  180:aload_0         
	//*  98  181:getfield        #88  <Field String d>
	//*  99  184:aastore         
	//* 100  185:invokestatic    #287 <Method String String.format(Locale, String, Object[])>
	//* 101  188:invokespecial   #288 <Method void IllegalArgumentException(String)>
	//* 102  191:athrow          
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 103  192:astore_1        
			{
				Log.e("FirebasePerformance", String.format("Can not set attribute %s with value %s (%s)", new Object[] {
					s2, s3, ((Exception) (s)).getMessage()
				}));
	//  104  193:ldc1            #177 <String "FirebasePerformance">
	//  105  195:ldc2            #300 <String "Can not set attribute %s with value %s (%s)">
	//  106  198:iconst_3        
	//  107  199:anewarray       Object[]
	//  108  202:dup             
	//  109  203:iconst_0        
	//  110  204:aload           4
	//  111  206:aastore         
	//  112  207:dup             
	//  113  208:iconst_1        
	//  114  209:aload           5
	//  115  211:aastore         
	//  116  212:dup             
	//  117  213:iconst_2        
	//  118  214:aload_1         
	//  119  215:invokevirtual   #303 <Method String Exception.getMessage()>
	//  120  218:aastore         
	//  121  219:invokestatic    #185 <Method String String.format(String, Object[])>
	//  122  222:invokestatic    #190 <Method int Log.e(String, String)>
	//  123  225:pop             
			}
			break MISSING_BLOCK_LABEL_226;
		}
		s2 = s;
		s3 = s1;
		s4 = u.a(((java.util.Map.Entry) (new java.util.AbstractMap.SimpleEntry(((Object) (s)), ((Object) (s1))))));
		if(s4 == null)
		{
			flag = true;
			break MISSING_BLOCK_LABEL_232;
		}
		s2 = s;
		s3 = s1;
		throw new IllegalArgumentException(s4);
		s2 = s;
		s3 = s1;
		throw new IllegalArgumentException(String.format(Locale.US, "Trace %s has been stopped", new Object[] {
			d
		}));
		s1 = s3;
	//  124  226:aload           5
	//  125  228:astore_2        
		s = s2;
	//  126  229:aload           4
	//  127  231:astore_1        
		if(flag)
	//* 128  232:iload_3         
	//* 129  233:ifeq            248
			j.put(((Object) (s)), ((Object) (s1)));
	//  130  236:aload_0         
	//  131  237:getfield        #101 <Field Map j>
	//  132  240:aload_1         
	//  133  241:aload_2         
	//  134  242:invokeinterface #163 <Method Object Map.put(Object, Object)>
	//  135  247:pop             
		return;
	//  136  248:return          
	}

	public void putMetric(String s, long l1)
	{
		String s1 = u.a(s, w.b);
	//    0    0:aload_1         
	//    1    1:getstatic       #257 <Field int w.b>
	//    2    4:invokestatic    #170 <Method String u.a(String, int)>
	//    3    7:astore          4
		if(s1 != null)
	//*   4    9:aload           4
	//*   5   11:ifnull          40
		{
			Log.e("FirebasePerformance", String.format("Cannot set value for metric %s. Metric name is invalid.(%s)", new Object[] {
				s, s1
			}));
	//    6   14:ldc1            #177 <String "FirebasePerformance">
	//    7   16:ldc2            #306 <String "Cannot set value for metric %s. Metric name is invalid.(%s)">
	//    8   19:iconst_2        
	//    9   20:anewarray       Object[]
	//   10   23:dup             
	//   11   24:iconst_0        
	//   12   25:aload_1         
	//   13   26:aastore         
	//   14   27:dup             
	//   15   28:iconst_1        
	//   16   29:aload           4
	//   17   31:aastore         
	//   18   32:invokestatic    #185 <Method String String.format(String, Object[])>
	//   19   35:invokestatic    #190 <Method int Log.e(String, String)>
	//   20   38:pop             
			return;
	//   21   39:return          
		}
		if(!g())
	//*  22   40:aload_0         
	//*  23   41:invokevirtual   #195 <Method boolean g()>
	//*  24   44:ifne            75
		{
			Log.w("FirebasePerformance", String.format("Cannot set value for metric '%s' for trace '%s' because it's not started", new Object[] {
				s, d
			}));
	//   25   47:ldc1            #177 <String "FirebasePerformance">
	//   26   49:ldc2            #308 <String "Cannot set value for metric '%s' for trace '%s' because it's not started">
	//   27   52:iconst_2        
	//   28   53:anewarray       Object[]
	//   29   56:dup             
	//   30   57:iconst_0        
	//   31   58:aload_1         
	//   32   59:aastore         
	//   33   60:dup             
	//   34   61:iconst_1        
	//   35   62:aload_0         
	//   36   63:getfield        #88  <Field String d>
	//   37   66:aastore         
	//   38   67:invokestatic    #185 <Method String String.format(String, Object[])>
	//   39   70:invokestatic    #200 <Method int Log.w(String, String)>
	//   40   73:pop             
			return;
	//   41   74:return          
		}
		if(f())
	//*  42   75:aload_0         
	//*  43   76:invokevirtual   #204 <Method boolean f()>
	//*  44   79:ifeq            110
		{
			Log.w("FirebasePerformance", String.format("Cannot set value for metric '%s' for trace '%s' because it's been stopped", new Object[] {
				s, d
			}));
	//   45   82:ldc1            #177 <String "FirebasePerformance">
	//   46   84:ldc2            #310 <String "Cannot set value for metric '%s' for trace '%s' because it's been stopped">
	//   47   87:iconst_2        
	//   48   88:anewarray       Object[]
	//   49   91:dup             
	//   50   92:iconst_0        
	//   51   93:aload_1         
	//   52   94:aastore         
	//   53   95:dup             
	//   54   96:iconst_1        
	//   55   97:aload_0         
	//   56   98:getfield        #88  <Field String d>
	//   57  101:aastore         
	//   58  102:invokestatic    #185 <Method String String.format(String, Object[])>
	//   59  105:invokestatic    #200 <Method int Log.w(String, String)>
	//   60  108:pop             
			return;
	//   61  109:return          
		} else
		{
			a(s.trim()).b(l1);
	//   62  110:aload_0         
	//   63  111:aload_1         
	//   64  112:invokevirtual   #149 <Method String String.trim()>
	//   65  115:invokespecial   #210 <Method zza a(String)>
	//   66  118:lload_2         
	//   67  119:invokevirtual   #312 <Method void zza.b(long)>
			return;
	//   68  122:return          
		}
	}

	public void removeAttribute(String s)
	{
		if(f())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #204 <Method boolean f()>
	//*   2    4:ifeq            17
		{
			Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
	//    3    7:ldc1            #177 <String "FirebasePerformance">
	//    4    9:ldc2            #315 <String "Can't remove a attribute from a Trace that's stopped.">
	//    5   12:invokestatic    #190 <Method int Log.e(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		} else
		{
			j.remove(((Object) (s)));
	//    8   17:aload_0         
	//    9   18:getfield        #101 <Field Map j>
	//   10   21:aload_1         
	//   11   22:invokeinterface #318 <Method Object Map.remove(Object)>
	//   12   27:pop             
			return;
	//   13   28:return          
		}
	}

	public void start()
	{
		Object obj;
label0:
		{
label1:
			{
				obj = ((Object) (d));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field String d>
	//    2    4:astore_3        
				if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       16
				{
					obj = "Trace name must not be null";
	//    5    9:ldc2            #321 <String "Trace name must not be null">
	//    6   12:astore_3        
					break label0;
	//    7   13:goto            116
				}
				if(((String) (obj)).length() > 100)
	//*   8   16:aload_3         
	//*   9   17:invokevirtual   #324 <Method int String.length()>
	//*  10   20:bipush          100
	//*  11   22:icmple          50
				{
					obj = ((Object) (String.format(Locale.US, "Trace name must not exceed %d characters", new Object[] {
						Integer.valueOf(100)
					})));
	//   12   25:getstatic       #276 <Field Locale Locale.US>
	//   13   28:ldc2            #326 <String "Trace name must not exceed %d characters">
	//   14   31:iconst_1        
	//   15   32:anewarray       Object[]
	//   16   35:dup             
	//   17   36:iconst_0        
	//   18   37:bipush          100
	//   19   39:invokestatic    #284 <Method Integer Integer.valueOf(int)>
	//   20   42:aastore         
	//   21   43:invokestatic    #287 <Method String String.format(Locale, String, Object[])>
	//   22   46:astore_3        
					break label0;
	//   23   47:goto            116
				}
				if(!((String) (obj)).startsWith("_"))
					break label1;
	//   24   50:aload_3         
	//   25   51:ldc2            #328 <String "_">
	//   26   54:invokevirtual   #332 <Method boolean String.startsWith(String)>
	//   27   57:ifeq            114
				z az[] = z.values();
	//   28   60:invokestatic    #338 <Method z[] z.values()>
	//   29   63:astore          4
				int j1 = az.length;
	//   30   65:aload           4
	//   31   67:arraylength     
	//   32   68:istore_2        
				for(int i1 = 0; i1 < j1; i1++)
	//*  33   69:iconst_0        
	//*  34   70:istore_1        
	//*  35   71:iload_1         
	//*  36   72:iload_2         
	//*  37   73:icmpge          97
					if(az[i1].toString().equals(obj))
						break label1;
	//   38   76:aload           4
	//   39   78:iload_1         
	//   40   79:aaload          
	//   41   80:invokevirtual   #341 <Method String z.toString()>
	//   42   83:aload_3         
	//   43   84:invokevirtual   #344 <Method boolean String.equals(Object)>
	//   44   87:ifne            114

	//   45   90:iload_1         
	//   46   91:iconst_1        
	//   47   92:iadd            
	//   48   93:istore_1        
	//*  49   94:goto            71
				if(!((String) (obj)).startsWith("_st_"))
	//*  50   97:aload_3         
	//*  51   98:ldc2            #346 <String "_st_">
	//*  52  101:invokevirtual   #332 <Method boolean String.startsWith(String)>
	//*  53  104:ifne            114
				{
					obj = "Trace name must not start with '_'";
	//   54  107:ldc2            #348 <String "Trace name must not start with '_'">
	//   55  110:astore_3        
					break label0;
	//   56  111:goto            116
				}
			}
			obj = null;
	//   57  114:aconst_null     
	//   58  115:astore_3        
		}
		if(obj != null)
	//*  59  116:aload_3         
	//*  60  117:ifnull          148
		{
			Log.e("FirebasePerformance", String.format("Cannot start trace %s. Trace name is invalid.(%s)", new Object[] {
				d, obj
			}));
	//   61  120:ldc1            #177 <String "FirebasePerformance">
	//   62  122:ldc2            #350 <String "Cannot start trace %s. Trace name is invalid.(%s)">
	//   63  125:iconst_2        
	//   64  126:anewarray       Object[]
	//   65  129:dup             
	//   66  130:iconst_0        
	//   67  131:aload_0         
	//   68  132:getfield        #88  <Field String d>
	//   69  135:aastore         
	//   70  136:dup             
	//   71  137:iconst_1        
	//   72  138:aload_3         
	//   73  139:aastore         
	//   74  140:invokestatic    #185 <Method String String.format(String, Object[])>
	//   75  143:invokestatic    #190 <Method int Log.e(String, String)>
	//   76  146:pop             
			return;
	//   77  147:return          
		}
		if(k != null)
	//*  78  148:aload_0         
	//*  79  149:getfield        #111 <Field zzbg k>
	//*  80  152:ifnull          179
		{
			Log.e("FirebasePerformance", String.format("Trace '%s' has already started, should not start again!", new Object[] {
				d
			}));
	//   81  155:ldc1            #177 <String "FirebasePerformance">
	//   82  157:ldc2            #352 <String "Trace '%s' has already started, should not start again!">
	//   83  160:iconst_1        
	//   84  161:anewarray       Object[]
	//   85  164:dup             
	//   86  165:iconst_0        
	//   87  166:aload_0         
	//   88  167:getfield        #88  <Field String d>
	//   89  170:aastore         
	//   90  171:invokestatic    #185 <Method String String.format(String, Object[])>
	//   91  174:invokestatic    #190 <Method int Log.e(String, String)>
	//   92  177:pop             
			return;
	//   93  178:return          
		}
		((f)this).zzap();
	//   94  179:aload_0         
	//   95  180:invokevirtual   #355 <Method void f.zzap()>
		obj = ((Object) (SessionManager.zzcn().zzco()));
	//   96  183:invokestatic    #361 <Method SessionManager SessionManager.zzcn()>
	//   97  186:invokevirtual   #365 <Method zzt SessionManager.zzco()>
	//   98  189:astore_3        
		e.add(obj);
	//   99  190:aload_0         
	//  100  191:getfield        #115 <Field List e>
	//  101  194:aload_3         
	//  102  195:invokeinterface #370 <Method boolean List.add(Object)>
	//  103  200:pop             
		k = new zzbg();
	//  104  201:aload_0         
	//  105  202:new             #109 <Class zzbg>
	//  106  205:dup             
	//  107  206:invokespecial   #371 <Method void zzbg()>
	//  108  209:putfield        #111 <Field zzbg k>
		Log.i("FirebasePerformance", String.format("Session ID - %s", new Object[] {
			((zzt) (obj)).b()
		}));
	//  109  212:ldc1            #177 <String "FirebasePerformance">
	//  110  214:ldc2            #373 <String "Session ID - %s">
	//  111  217:iconst_1        
	//  112  218:anewarray       Object[]
	//  113  221:dup             
	//  114  222:iconst_0        
	//  115  223:aload_3         
	//  116  224:invokevirtual   #375 <Method String zzt.b()>
	//  117  227:aastore         
	//  118  228:invokestatic    #185 <Method String String.format(String, Object[])>
	//  119  231:invokestatic    #377 <Method int Log.i(String, String)>
	//  120  234:pop             
		android.support.v4.a.g.a(SessionManager.zzcp()).a(m, new IntentFilter("SessionIdUpdate"));
	//  121  235:invokestatic    #381 <Method android.content.Context SessionManager.zzcp()>
	//  122  238:invokestatic    #386 <Method g g.a(android.content.Context)>
	//  123  241:aload_0         
	//  124  242:getfield        #68  <Field BroadcastReceiver m>
	//  125  245:new             #388 <Class IntentFilter>
	//  126  248:dup             
	//  127  249:ldc2            #390 <String "SessionIdUpdate">
	//  128  252:invokespecial   #391 <Method void IntentFilter(String)>
	//  129  255:invokevirtual   #394 <Method void g.a(BroadcastReceiver, IntentFilter)>
		if(((zzt) (obj)).c())
	//* 130  258:aload_3         
	//* 131  259:invokevirtual   #396 <Method boolean zzt.c()>
	//* 132  262:ifeq            272
			c.zzbh();
	//  133  265:aload_0         
	//  134  266:getfield        #123 <Field GaugeManager c>
	//  135  269:invokevirtual   #399 <Method void GaugeManager.zzbh()>
	//  136  272:return          
	}

	public void stop()
	{
		if(!g())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #195 <Method boolean g()>
	//*   2    4:ifne            31
		{
			Log.e("FirebasePerformance", String.format("Trace '%s' has not been started so unable to stop!", new Object[] {
				d
			}));
	//    3    7:ldc1            #177 <String "FirebasePerformance">
	//    4    9:ldc2            #402 <String "Trace '%s' has not been started so unable to stop!">
	//    5   12:iconst_1        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:aload_0         
	//   10   19:getfield        #88  <Field String d>
	//   11   22:aastore         
	//   12   23:invokestatic    #185 <Method String String.format(String, Object[])>
	//   13   26:invokestatic    #190 <Method int Log.e(String, String)>
	//   14   29:pop             
			return;
	//   15   30:return          
		}
		if(f())
	//*  16   31:aload_0         
	//*  17   32:invokevirtual   #204 <Method boolean f()>
	//*  18   35:ifeq            62
		{
			Log.e("FirebasePerformance", String.format("Trace '%s' has already stopped, should not stop again!", new Object[] {
				d
			}));
	//   19   38:ldc1            #177 <String "FirebasePerformance">
	//   20   40:ldc2            #404 <String "Trace '%s' has already stopped, should not stop again!">
	//   21   43:iconst_1        
	//   22   44:anewarray       Object[]
	//   23   47:dup             
	//   24   48:iconst_0        
	//   25   49:aload_0         
	//   26   50:getfield        #88  <Field String d>
	//   27   53:aastore         
	//   28   54:invokestatic    #185 <Method String String.format(String, Object[])>
	//   29   57:invokestatic    #190 <Method int Log.e(String, String)>
	//   30   60:pop             
			return;
	//   31   61:return          
		}
		SessionManager.zzcn();
	//   32   62:invokestatic    #361 <Method SessionManager SessionManager.zzcn()>
	//   33   65:pop             
		android.support.v4.a.g.a(SessionManager.zzcp()).a(m);
	//   34   66:invokestatic    #381 <Method android.content.Context SessionManager.zzcp()>
	//   35   69:invokestatic    #386 <Method g g.a(android.content.Context)>
	//   36   72:aload_0         
	//   37   73:getfield        #68  <Field BroadcastReceiver m>
	//   38   76:invokevirtual   #407 <Method void g.a(BroadcastReceiver)>
		((f)this).zzaq();
	//   39   79:aload_0         
	//   40   80:invokevirtual   #410 <Method void f.zzaq()>
		l = new zzbg();
	//   41   83:aload_0         
	//   42   84:new             #109 <Class zzbg>
	//   43   87:dup             
	//   44   88:invokespecial   #371 <Method void zzbg()>
	//   45   91:putfield        #113 <Field zzbg l>
		if(b == null)
	//*  46   94:aload_0         
	//*  47   95:getfield        #82  <Field Trace b>
	//*  48   98:ifnonnull       223
		{
			zzbg zzbg1 = l;
	//   49  101:aload_0         
	//   50  102:getfield        #113 <Field zzbg l>
	//   51  105:astore_2        
			if(!f.isEmpty())
	//*  52  106:aload_0         
	//*  53  107:getfield        #93  <Field List f>
	//*  54  110:invokeinterface #413 <Method boolean List.isEmpty()>
	//*  55  115:ifne            156
			{
				int i1 = f.size();
	//   56  118:aload_0         
	//   57  119:getfield        #93  <Field List f>
	//   58  122:invokeinterface #414 <Method int List.size()>
	//   59  127:istore_1        
				Trace trace = (Trace)f.get(i1 - 1);
	//   60  128:aload_0         
	//   61  129:getfield        #93  <Field List f>
	//   62  132:iload_1         
	//   63  133:iconst_1        
	//   64  134:isub            
	//   65  135:invokeinterface #417 <Method Object List.get(int)>
	//   66  140:checkcast       #2   <Class Trace>
	//   67  143:astore_3        
				if(trace.l == null)
	//*  68  144:aload_3         
	//*  69  145:getfield        #113 <Field zzbg l>
	//*  70  148:ifnonnull       156
					trace.l = zzbg1;
	//   71  151:aload_3         
	//   72  152:aload_2         
	//   73  153:putfield        #113 <Field zzbg l>
			}
			if(!d.isEmpty())
	//*  74  156:aload_0         
	//*  75  157:getfield        #88  <Field String d>
	//*  76  160:invokevirtual   #418 <Method boolean String.isEmpty()>
	//*  77  163:ifne            214
			{
				h h1 = i;
	//   78  166:aload_0         
	//   79  167:getfield        #119 <Field h i>
	//   80  170:astore_2        
				if(h1 != null)
	//*  81  171:aload_2         
	//*  82  172:ifnull          223
				{
					h1.a((new com.google.firebase.perf.metrics.g(this)).a(), ((f)this).zzam());
	//   83  175:aload_2         
	//   84  176:new             #420 <Class com.google.firebase.perf.metrics.g>
	//   85  179:dup             
	//   86  180:aload_0         
	//   87  181:invokespecial   #421 <Method void com.google.firebase.perf.metrics.g(Trace)>
	//   88  184:invokevirtual   #424 <Method com.google.android.gms.internal.firebase_2D_perf.cq com.google.firebase.perf.metrics.g.a()>
	//   89  187:aload_0         
	//   90  188:invokevirtual   #428 <Method com.google.android.gms.internal.firebase_2D_perf.ax f.zzam()>
	//   91  191:invokevirtual   #431 <Method void h.a(com.google.android.gms.internal.firebase_2D_perf.cq, com.google.android.gms.internal.firebase_2D_perf.ax)>
					if(SessionManager.zzcn().zzco().c())
	//*  92  194:invokestatic    #361 <Method SessionManager SessionManager.zzcn()>
	//*  93  197:invokevirtual   #365 <Method zzt SessionManager.zzco()>
	//*  94  200:invokevirtual   #396 <Method boolean zzt.c()>
	//*  95  203:ifeq            223
					{
						c.zzbh();
	//   96  206:aload_0         
	//   97  207:getfield        #123 <Field GaugeManager c>
	//   98  210:invokevirtual   #399 <Method void GaugeManager.zzbh()>
						return;
	//   99  213:return          
					}
				}
			} else
			{
				Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
	//  100  214:ldc1            #177 <String "FirebasePerformance">
	//  101  216:ldc2            #433 <String "Trace name is empty, no log is sent to server">
	//  102  219:invokestatic    #190 <Method int Log.e(String, String)>
	//  103  222:pop             
			}
		}
	//  104  223:return          
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeParcelable(((Parcelable) (b)), 0);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #82  <Field Trace b>
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #439 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeString(d);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #88  <Field String d>
	//    8   14:invokevirtual   #442 <Method void Parcel.writeString(String)>
		parcel.writeList(f);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #93  <Field List f>
	//   12   22:invokevirtual   #446 <Method void Parcel.writeList(List)>
		parcel.writeMap(g);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #99  <Field Map g>
	//   16   30:invokevirtual   #449 <Method void Parcel.writeMap(Map)>
		parcel.writeParcelable(((Parcelable) (k)), 0);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #111 <Field zzbg k>
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #439 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (l)), 0);
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #113 <Field zzbg l>
	//   25   47:iconst_0        
	//   26   48:invokevirtual   #439 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeList(e);
	//   27   51:aload_1         
	//   28   52:aload_0         
	//   29   53:getfield        #115 <Field List e>
	//   30   56:invokevirtual   #446 <Method void Parcel.writeList(List)>
	//   31   59:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new d();
	private static final Map a = new ConcurrentHashMap();
	private static final android.os.Parcelable.Creator n = new e();
	private final Trace b;
	private final GaugeManager c;
	private final String d;
	private final List e;
	private final List f;
	private final Map g;
	private final x h;
	private final h i;
	private final Map j;
	private zzbg k;
	private zzbg l;
	private BroadcastReceiver m;

	static 
	{
	//    0    0:new             #36  <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void ConcurrentHashMap()>
	//    3    7:putstatic       #41  <Field Map a>
	//    4   10:new             #43  <Class d>
	//    5   13:dup             
	//    6   14:invokespecial   #44  <Method void d()>
	//    7   17:putstatic       #46  <Field android.os.Parcelable$Creator CREATOR>
	//    8   20:new             #48  <Class e>
	//    9   23:dup             
	//   10   24:invokespecial   #49  <Method void e()>
	//   11   27:putstatic       #51  <Field android.os.Parcelable$Creator n>
	//*  12   30:return          
	}
}
