// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

// Referenced classes of package bo.app:
//			bz

public class dh
{
	class a extends AsyncTask
	{

		protected transient Void a(Void avoid[])
		{
			bz bz1 = new bz();
		//    0    0:new             #23  <Class bz>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void bz()>
		//    3    7:astore_2        
			bz1.b(a.m());
		//    4    8:aload_2         
		//    5    9:aload_0         
		//    6   10:getfield        #13  <Field dh a>
		//    7   13:invokevirtual   #28  <Method Set dh.m()>
		//    8   16:invokevirtual   #32  <Method void bz.b(Set)>
			bz1.a(a.l());
		//    9   19:aload_2         
		//   10   20:aload_0         
		//   11   21:getfield        #13  <Field dh a>
		//   12   24:invokevirtual   #35  <Method Set dh.l()>
		//   13   27:invokevirtual   #37  <Method void bz.a(Set)>
			bz1.c(a.n());
		//   14   30:aload_2         
		//   15   31:aload_0         
		//   16   32:getfield        #13  <Field dh a>
		//   17   35:invokevirtual   #40  <Method Set dh.n()>
		//   18   38:invokevirtual   #43  <Method void bz.c(Set)>
			bz1.a(a.k());
		//   19   41:aload_2         
		//   20   42:aload_0         
		//   21   43:getfield        #13  <Field dh a>
		//   22   46:invokevirtual   #47  <Method long dh.k()>
		//   23   49:invokevirtual   #50  <Method void bz.a(long)>
			bz1.c(a.i());
		//   24   52:aload_2         
		//   25   53:aload_0         
		//   26   54:getfield        #13  <Field dh a>
		//   27   57:invokevirtual   #53  <Method long dh.i()>
		//   28   60:invokevirtual   #55  <Method void bz.c(long)>
			bz1.a(a.d());
		//   29   63:aload_2         
		//   30   64:aload_0         
		//   31   65:getfield        #13  <Field dh a>
		//   32   68:invokevirtual   #59  <Method boolean dh.d()>
		//   33   71:invokevirtual   #62  <Method void bz.a(boolean)>
			bz1.b(a.c());
		//   34   74:aload_2         
		//   35   75:aload_0         
		//   36   76:getfield        #13  <Field dh a>
		//   37   79:invokevirtual   #64  <Method boolean dh.c()>
		//   38   82:invokevirtual   #66  <Method void bz.b(boolean)>
			bz1.b(a.h());
		//   39   85:aload_2         
		//   40   86:aload_0         
		//   41   87:getfield        #13  <Field dh a>
		//   42   90:invokevirtual   #69  <Method long dh.h()>
		//   43   93:invokevirtual   #71  <Method void bz.b(long)>
			bz1.a(a.j());
		//   44   96:aload_2         
		//   45   97:aload_0         
		//   46   98:getfield        #13  <Field dh a>
		//   47  101:invokevirtual   #75  <Method float dh.j()>
		//   48  104:invokevirtual   #78  <Method void bz.a(float)>
			bz1.a(a.e());
		//   49  107:aload_2         
		//   50  108:aload_0         
		//   51  109:getfield        #13  <Field dh a>
		//   52  112:invokevirtual   #82  <Method int dh.e()>
		//   53  115:invokevirtual   #85  <Method void bz.a(int)>
			bz1.b(a.f());
		//   54  118:aload_2         
		//   55  119:aload_0         
		//   56  120:getfield        #13  <Field dh a>
		//   57  123:invokevirtual   #88  <Method int dh.f()>
		//   58  126:invokevirtual   #90  <Method void bz.b(int)>
			bz1.c(a.g());
		//   59  129:aload_2         
		//   60  130:aload_0         
		//   61  131:getfield        #13  <Field dh a>
		//   62  134:invokevirtual   #93  <Method int dh.g()>
		//   63  137:invokevirtual   #95  <Method void bz.c(int)>
			bz1.c(a.b());
		//   64  140:aload_2         
		//   65  141:aload_0         
		//   66  142:getfield        #13  <Field dh a>
		//   67  145:invokevirtual   #97  <Method boolean dh.b()>
		//   68  148:invokevirtual   #99  <Method void bz.c(boolean)>
			bz1.d(a.a());
		//   69  151:aload_2         
		//   70  152:aload_0         
		//   71  153:getfield        #13  <Field dh a>
		//   72  156:invokevirtual   #101 <Method boolean dh.a()>
		//   73  159:invokevirtual   #103 <Method void bz.d(boolean)>
			bz1.e(a.o());
		//   74  162:aload_2         
		//   75  163:aload_0         
		//   76  164:getfield        #13  <Field dh a>
		//   77  167:invokevirtual   #106 <Method boolean dh.o()>
		//   78  170:invokevirtual   #108 <Method void bz.e(boolean)>
			synchronized(dh.a(a))
		//*  79  173:aload_0         
		//*  80  174:getfield        #13  <Field dh a>
		//*  81  177:invokestatic    #111 <Method Object dh.a(dh)>
		//*  82  180:astore_1        
		//*  83  181:aload_1         
		//*  84  182:monitorenter    
			{
				dh.a(a, bz1);
		//   85  183:aload_0         
		//   86  184:getfield        #13  <Field dh a>
		//   87  187:aload_2         
		//   88  188:invokestatic    #114 <Method bz dh.a(dh, bz)>
		//   89  191:pop             
			}
		//   90  192:aload_1         
		//   91  193:monitorexit     
			return null;
		//   92  194:aconst_null     
		//   93  195:areturn         
			exception;
		//   94  196:astore_2        
			avoid;
		//   95  197:aload_1         
			JVM INSTR monitorexit ;
		//   96  198:monitorexit     
			throw exception;
		//   97  199:aload_2         
		//   98  200:athrow          
		}

		protected Object doInBackground(Object aobj[])
		{
			return ((Object) (a((Void[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #118 <Class Void[]>
		//    3    5:invokevirtual   #120 <Method Void a(Void[])>
		//    4    8:areturn         
		}

		final dh a;

		private a()
		{
			a = dh.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field dh a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void AsyncTask()>
		//    5    9:return          
		}

	}


	public dh(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Object()>
	//    6   12:putfield        #35  <Field Object c>
		d = new AtomicBoolean(false);
	//    7   15:aload_0         
	//    8   16:new             #37  <Class AtomicBoolean>
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:invokespecial   #40  <Method void AtomicBoolean(boolean)>
	//   12   24:putfield        #42  <Field AtomicBoolean d>
		if(s == null)
	//*  13   27:aload_2         
	//*  14   28:ifnonnull       46
		{
			AppboyLogger.e(a, "ServerConfigStorageProvider received null api key.");
	//   15   31:getstatic       #28  <Field String a>
	//   16   34:ldc1            #44  <String "ServerConfigStorageProvider received null api key.">
	//   17   36:invokestatic    #47  <Method int AppboyLogger.e(String, String)>
	//   18   39:pop             
			s = "";
	//   19   40:ldc1            #49  <String "">
	//   20   42:astore_2        
		} else
	//*  21   43:goto            72
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   22   46:new             #51  <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #52  <Method void StringBuilder()>
	//   25   53:astore_3        
			stringbuilder.append(".");
	//   26   54:aload_3         
	//   27   55:ldc1            #54  <String ".">
	//   28   57:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
			stringbuilder.append(s);
	//   30   61:aload_3         
	//   31   62:aload_2         
	//   32   63:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
			s = stringbuilder.toString();
	//   34   67:aload_3         
	//   35   68:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   36   71:astore_2        
		}
		StringBuilder stringbuilder1 = new StringBuilder();
	//   37   72:new             #51  <Class StringBuilder>
	//   38   75:dup             
	//   39   76:invokespecial   #52  <Method void StringBuilder()>
	//   40   79:astore_3        
		stringbuilder1.append("com.appboy.storage.serverconfigstorageprovider");
	//   41   80:aload_3         
	//   42   81:ldc1            #64  <String "com.appboy.storage.serverconfigstorageprovider">
	//   43   83:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
		stringbuilder1.append(s);
	//   45   87:aload_3         
	//   46   88:aload_2         
	//   47   89:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
		b = context.getSharedPreferences(stringbuilder1.toString(), 0);
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:aload_3         
	//   52   96:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   53   99:iconst_0        
	//   54  100:invokevirtual   #70  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   55  103:putfield        #72  <Field SharedPreferences b>
		(new a()).execute(((Object []) (new Void[0])));
	//   56  106:new             #8   <Class dh$a>
	//   57  109:dup             
	//   58  110:aload_0         
	//   59  111:aconst_null     
	//   60  112:invokespecial   #75  <Method void dh$a(dh, dh$1)>
	//   61  115:iconst_0        
	//   62  116:anewarray       Void[]
	//   63  119:invokevirtual   #81  <Method AsyncTask dh$a.execute(Object[])>
	//   64  122:pop             
	//   65  123:return          
	}

	static bz a(dh dh1, bz bz1)
	{
		dh1.e = bz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field bz e>
		return bz1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Object a(dh dh1)
	{
		return dh1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object c>
	//    2    4:areturn         
	}

	private Set a(String s)
	{
		s = b.getString(s, "");
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field SharedPreferences b>
	//    2    4:aload_1         
	//    3    5:ldc1            #49  <String "">
	//    4    7:invokeinterface #94  <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_1        
		if(StringUtils.isNullOrBlank(s))
	//*   6   13:aload_1         
	//*   7   14:invokestatic    #100 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   8   17:ifeq            22
			return null;
	//    9   20:aconst_null     
	//   10   21:areturn         
		int i1;
		HashSet hashset;
		try
		{
			s = ((String) (new JSONArray(s)));
	//   11   22:new             #102 <Class JSONArray>
	//   12   25:dup             
	//   13   26:aload_1         
	//   14   27:invokespecial   #105 <Method void JSONArray(String)>
	//   15   30:astore_1        
			hashset = new HashSet();
	//   16   31:new             #107 <Class HashSet>
	//   17   34:dup             
	//   18   35:invokespecial   #108 <Method void HashSet()>
	//   19   38:astore_3        
		}
	//*  20   39:iconst_0        
	//*  21   40:istore_2        
	//*  22   41:iload_2         
	//*  23   42:aload_1         
	//*  24   43:invokevirtual   #112 <Method int JSONArray.length()>
	//*  25   46:icmpge          68
	//*  26   49:aload_3         
	//*  27   50:aload_1         
	//*  28   51:iload_2         
	//*  29   52:invokevirtual   #115 <Method String JSONArray.getString(int)>
	//*  30   55:invokeinterface #121 <Method boolean Set.add(Object)>
	//*  31   60:pop             
	//*  32   61:iload_2         
	//*  33   62:iconst_1        
	//*  34   63:iadd            
	//*  35   64:istore_2        
	//*  36   65:goto            41
	//*  37   68:aload_3         
	//*  38   69:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  39   70:astore_1        
		{
			AppboyLogger.w(a, "Experienced exception retrieving blacklisted strings from local storage. Returning null.", ((Throwable) (s)));
	//   40   71:getstatic       #28  <Field String a>
	//   41   74:ldc1            #123 <String "Experienced exception retrieving blacklisted strings from local storage. Returning null.">
	//   42   76:aload_1         
	//   43   77:invokestatic    #127 <Method int AppboyLogger.w(String, String, Throwable)>
	//   44   80:pop             
			return null;
	//   45   81:aconst_null     
	//   46   82:areturn         
		}
		i1 = 0;
		if(i1 >= ((JSONArray) (s)).length())
			break; /* Loop/switch isn't completed */
		((Set) (hashset)).add(((Object) (((JSONArray) (s)).getString(i1))));
		i1++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_41;
_L1:
		return ((Set) (hashset));
	}

	public void a(bz bz1)
	{
		synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			e = bz1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #84  <Field bz e>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		try
		{
			obj = ((Object) (b.edit()));
	//   10   14:aload_0         
	//   11   15:getfield        #72  <Field SharedPreferences b>
	//   12   18:invokeinterface #134 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   13   23:astore_2        
			if(bz1.b() != null)
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #139 <Method Set bz.b()>
	//*  16   28:ifnull          54
				((android.content.SharedPreferences.Editor) (obj)).putString("blacklisted_events", (new JSONArray(((java.util.Collection) (bz1.b())))).toString());
	//   17   31:aload_2         
	//   18   32:ldc1            #141 <String "blacklisted_events">
	//   19   34:new             #102 <Class JSONArray>
	//   20   37:dup             
	//   21   38:aload_1         
	//   22   39:invokevirtual   #139 <Method Set bz.b()>
	//   23   42:invokespecial   #144 <Method void JSONArray(java.util.Collection)>
	//   24   45:invokevirtual   #145 <Method String JSONArray.toString()>
	//   25   48:invokeinterface #151 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   26   53:pop             
			if(bz1.c() != null)
	//*  27   54:aload_1         
	//*  28   55:invokevirtual   #153 <Method Set bz.c()>
	//*  29   58:ifnull          84
				((android.content.SharedPreferences.Editor) (obj)).putString("blacklisted_attributes", (new JSONArray(((java.util.Collection) (bz1.c())))).toString());
	//   30   61:aload_2         
	//   31   62:ldc1            #155 <String "blacklisted_attributes">
	//   32   64:new             #102 <Class JSONArray>
	//   33   67:dup             
	//   34   68:aload_1         
	//   35   69:invokevirtual   #153 <Method Set bz.c()>
	//   36   72:invokespecial   #144 <Method void JSONArray(java.util.Collection)>
	//   37   75:invokevirtual   #145 <Method String JSONArray.toString()>
	//   38   78:invokeinterface #151 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   39   83:pop             
			if(bz1.d() != null)
	//*  40   84:aload_1         
	//*  41   85:invokevirtual   #157 <Method Set bz.d()>
	//*  42   88:ifnull          114
				((android.content.SharedPreferences.Editor) (obj)).putString("blacklisted_purchases", (new JSONArray(((java.util.Collection) (bz1.d())))).toString());
	//   43   91:aload_2         
	//   44   92:ldc1            #159 <String "blacklisted_purchases">
	//   45   94:new             #102 <Class JSONArray>
	//   46   97:dup             
	//   47   98:aload_1         
	//   48   99:invokevirtual   #157 <Method Set bz.d()>
	//   49  102:invokespecial   #144 <Method void JSONArray(java.util.Collection)>
	//   50  105:invokevirtual   #145 <Method String JSONArray.toString()>
	//   51  108:invokeinterface #151 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   52  113:pop             
			((android.content.SharedPreferences.Editor) (obj)).putLong("config_time", bz1.a());
	//   53  114:aload_2         
	//   54  115:ldc1            #161 <String "config_time">
	//   55  117:aload_1         
	//   56  118:invokevirtual   #164 <Method long bz.a()>
	//   57  121:invokeinterface #168 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   58  126:pop             
			((android.content.SharedPreferences.Editor) (obj)).putBoolean("location_enabled", bz1.f());
	//   59  127:aload_2         
	//   60  128:ldc1            #170 <String "location_enabled">
	//   61  130:aload_1         
	//   62  131:invokevirtual   #174 <Method boolean bz.f()>
	//   63  134:invokeinterface #178 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   64  139:pop             
			((android.content.SharedPreferences.Editor) (obj)).putBoolean("location_enabled_set", bz1.g());
	//   65  140:aload_2         
	//   66  141:ldc1            #180 <String "location_enabled_set">
	//   67  143:aload_1         
	//   68  144:invokevirtual   #183 <Method boolean bz.g()>
	//   69  147:invokeinterface #178 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   70  152:pop             
			((android.content.SharedPreferences.Editor) (obj)).putLong("location_time", bz1.h());
	//   71  153:aload_2         
	//   72  154:ldc1            #185 <String "location_time">
	//   73  156:aload_1         
	//   74  157:invokevirtual   #188 <Method long bz.h()>
	//   75  160:invokeinterface #168 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   76  165:pop             
			((android.content.SharedPreferences.Editor) (obj)).putFloat("location_distance", bz1.i());
	//   77  166:aload_2         
	//   78  167:ldc1            #190 <String "location_distance">
	//   79  169:aload_1         
	//   80  170:invokevirtual   #194 <Method float bz.i()>
	//   81  173:invokeinterface #198 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   82  178:pop             
			((android.content.SharedPreferences.Editor) (obj)).putInt("geofences_min_time_since_last_request", bz1.j());
	//   83  179:aload_2         
	//   84  180:ldc1            #200 <String "geofences_min_time_since_last_request">
	//   85  182:aload_1         
	//   86  183:invokevirtual   #203 <Method int bz.j()>
	//   87  186:invokeinterface #207 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   88  191:pop             
			((android.content.SharedPreferences.Editor) (obj)).putInt("geofences_min_time_since_last_report", bz1.k());
	//   89  192:aload_2         
	//   90  193:ldc1            #209 <String "geofences_min_time_since_last_report">
	//   91  195:aload_1         
	//   92  196:invokevirtual   #212 <Method int bz.k()>
	//   93  199:invokeinterface #207 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   94  204:pop             
			((android.content.SharedPreferences.Editor) (obj)).putInt("geofences_max_num_to_register", bz1.l());
	//   95  205:aload_2         
	//   96  206:ldc1            #214 <String "geofences_max_num_to_register">
	//   97  208:aload_1         
	//   98  209:invokevirtual   #217 <Method int bz.l()>
	//   99  212:invokeinterface #207 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//  100  217:pop             
			((android.content.SharedPreferences.Editor) (obj)).putBoolean("geofences_enabled", bz1.m());
	//  101  218:aload_2         
	//  102  219:ldc1            #219 <String "geofences_enabled">
	//  103  221:aload_1         
	//  104  222:invokevirtual   #222 <Method boolean bz.m()>
	//  105  225:invokeinterface #178 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//  106  230:pop             
			((android.content.SharedPreferences.Editor) (obj)).putBoolean("geofences_enabled_set", bz1.n());
	//  107  231:aload_2         
	//  108  232:ldc1            #224 <String "geofences_enabled_set">
	//  109  234:aload_1         
	//  110  235:invokevirtual   #227 <Method boolean bz.n()>
	//  111  238:invokeinterface #178 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//  112  243:pop             
			((android.content.SharedPreferences.Editor) (obj)).putLong("messaging_session_timeout", bz1.e());
	//  113  244:aload_2         
	//  114  245:ldc1            #229 <String "messaging_session_timeout">
	//  115  247:aload_1         
	//  116  248:invokevirtual   #231 <Method long bz.e()>
	//  117  251:invokeinterface #168 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//  118  256:pop             
			((android.content.SharedPreferences.Editor) (obj)).putBoolean("test_user_device_logging_enabled", bz1.o());
	//  119  257:aload_2         
	//  120  258:ldc1            #233 <String "test_user_device_logging_enabled">
	//  121  260:aload_1         
	//  122  261:invokevirtual   #236 <Method boolean bz.o()>
	//  123  264:invokeinterface #178 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//  124  269:pop             
			((android.content.SharedPreferences.Editor) (obj)).apply();
	//  125  270:aload_2         
	//  126  271:invokeinterface #239 <Method void android.content.SharedPreferences$Editor.apply()>
			return;
	//  127  276:return          
		}
		// Misplaced declaration of an exception variable
		catch(bz bz1)
	//* 128  277:astore_1        
		{
			AppboyLogger.w(a, "Could not persist server config to shared preferences.", ((Throwable) (bz1)));
	//  129  278:getstatic       #28  <Field String a>
	//  130  281:ldc1            #241 <String "Could not persist server config to shared preferences.">
	//  131  283:aload_1         
	//  132  284:invokestatic    #127 <Method int AppboyLogger.w(String, String, Throwable)>
	//  133  287:pop             
		}
		return;
	//  134  288:return          
		bz1;
	//  135  289:astore_1        
		obj;
	//  136  290:aload_2         
		JVM INSTR monitorexit ;
	//  137  291:monitorexit     
		throw bz1;
	//  138  292:aload_1         
	//  139  293:athrow          
	}

	public void a(boolean flag)
	{
		d.set(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AtomicBoolean d>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #244 <Method void AtomicBoolean.set(boolean)>
	//    4    8:return          
	}

	public boolean a()
	{
label0:
		{
			boolean flag;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				flag = e.n();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #227 <Method boolean bz.n()>
	//   11   21:istore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return flag;
	//   14   24:iload_1         
	//   15   25:ireturn         
		}
		boolean flag1 = b.getBoolean("geofences_enabled_set", false);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #224 <String "geofences_enabled_set">
	//   19   32:iconst_0        
	//   20   33:invokeinterface #248 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   21   38:istore_1        
		obj;
	//   22   39:aload_2         
		JVM INSTR monitorexit ;
	//   23   40:monitorexit     
		return flag1;
	//   24   41:iload_1         
	//   25   42:ireturn         
		exception;
	//   26   43:astore_3        
		obj;
	//   27   44:aload_2         
		JVM INSTR monitorexit ;
	//   28   45:monitorexit     
		throw exception;
	//   29   46:aload_3         
	//   30   47:athrow          
	}

	public boolean b()
	{
label0:
		{
			boolean flag;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				flag = e.m();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #222 <Method boolean bz.m()>
	//   11   21:istore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return flag;
	//   14   24:iload_1         
	//   15   25:ireturn         
		}
		boolean flag1 = b.getBoolean("geofences_enabled", false);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #219 <String "geofences_enabled">
	//   19   32:iconst_0        
	//   20   33:invokeinterface #248 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   21   38:istore_1        
		obj;
	//   22   39:aload_2         
		JVM INSTR monitorexit ;
	//   23   40:monitorexit     
		return flag1;
	//   24   41:iload_1         
	//   25   42:ireturn         
		exception;
	//   26   43:astore_3        
		obj;
	//   27   44:aload_2         
		JVM INSTR monitorexit ;
	//   28   45:monitorexit     
		throw exception;
	//   29   46:aload_3         
	//   30   47:athrow          
	}

	public boolean c()
	{
label0:
		{
			boolean flag;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				flag = e.f();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #174 <Method boolean bz.f()>
	//   11   21:istore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return flag;
	//   14   24:iload_1         
	//   15   25:ireturn         
		}
		boolean flag1 = b.getBoolean("location_enabled_set", false);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #180 <String "location_enabled_set">
	//   19   32:iconst_0        
	//   20   33:invokeinterface #248 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   21   38:istore_1        
		obj;
	//   22   39:aload_2         
		JVM INSTR monitorexit ;
	//   23   40:monitorexit     
		return flag1;
	//   24   41:iload_1         
	//   25   42:ireturn         
		exception;
	//   26   43:astore_3        
		obj;
	//   27   44:aload_2         
		JVM INSTR monitorexit ;
	//   28   45:monitorexit     
		throw exception;
	//   29   46:aload_3         
	//   30   47:athrow          
	}

	public boolean d()
	{
label0:
		{
			boolean flag;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				flag = e.f();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #174 <Method boolean bz.f()>
	//   11   21:istore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return flag;
	//   14   24:iload_1         
	//   15   25:ireturn         
		}
		boolean flag1 = b.getBoolean("location_enabled", false);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #170 <String "location_enabled">
	//   19   32:iconst_0        
	//   20   33:invokeinterface #248 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   21   38:istore_1        
		obj;
	//   22   39:aload_2         
		JVM INSTR monitorexit ;
	//   23   40:monitorexit     
		return flag1;
	//   24   41:iload_1         
	//   25   42:ireturn         
		exception;
	//   26   43:astore_3        
		obj;
	//   27   44:aload_2         
		JVM INSTR monitorexit ;
	//   28   45:monitorexit     
		throw exception;
	//   29   46:aload_3         
	//   30   47:athrow          
	}

	public int e()
	{
label0:
		{
			int i1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				i1 = e.j();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #203 <Method int bz.j()>
	//   11   21:istore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return i1;
	//   14   24:iload_1         
	//   15   25:ireturn         
		}
		int j1 = b.getInt("geofences_min_time_since_last_request", -1);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #200 <String "geofences_min_time_since_last_request">
	//   19   32:iconst_m1       
	//   20   33:invokeinterface #252 <Method int SharedPreferences.getInt(String, int)>
	//   21   38:istore_1        
		obj;
	//   22   39:aload_2         
		JVM INSTR monitorexit ;
	//   23   40:monitorexit     
		return j1;
	//   24   41:iload_1         
	//   25   42:ireturn         
		exception;
	//   26   43:astore_3        
		obj;
	//   27   44:aload_2         
		JVM INSTR monitorexit ;
	//   28   45:monitorexit     
		throw exception;
	//   29   46:aload_3         
	//   30   47:athrow          
	}

	public int f()
	{
label0:
		{
			int i1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				i1 = e.k();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #212 <Method int bz.k()>
	//   11   21:istore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return i1;
	//   14   24:iload_1         
	//   15   25:ireturn         
		}
		int j1 = b.getInt("geofences_min_time_since_last_report", -1);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #209 <String "geofences_min_time_since_last_report">
	//   19   32:iconst_m1       
	//   20   33:invokeinterface #252 <Method int SharedPreferences.getInt(String, int)>
	//   21   38:istore_1        
		obj;
	//   22   39:aload_2         
		JVM INSTR monitorexit ;
	//   23   40:monitorexit     
		return j1;
	//   24   41:iload_1         
	//   25   42:ireturn         
		exception;
	//   26   43:astore_3        
		obj;
	//   27   44:aload_2         
		JVM INSTR monitorexit ;
	//   28   45:monitorexit     
		throw exception;
	//   29   46:aload_3         
	//   30   47:athrow          
	}

	public int g()
	{
label0:
		{
			int i1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				i1 = e.l();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #217 <Method int bz.l()>
	//   11   21:istore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return i1;
	//   14   24:iload_1         
	//   15   25:ireturn         
		}
		int j1 = b.getInt("geofences_max_num_to_register", -1);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #214 <String "geofences_max_num_to_register">
	//   19   32:iconst_m1       
	//   20   33:invokeinterface #252 <Method int SharedPreferences.getInt(String, int)>
	//   21   38:istore_1        
		obj;
	//   22   39:aload_2         
		JVM INSTR monitorexit ;
	//   23   40:monitorexit     
		return j1;
	//   24   41:iload_1         
	//   25   42:ireturn         
		exception;
	//   26   43:astore_3        
		obj;
	//   27   44:aload_2         
		JVM INSTR monitorexit ;
	//   28   45:monitorexit     
		throw exception;
	//   29   46:aload_3         
	//   30   47:athrow          
	}

	public long h()
	{
label0:
		{
			long l1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				l1 = e.h();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #188 <Method long bz.h()>
	//   11   21:lstore_1        
			}
	//   12   22:aload_3         
	//   13   23:monitorexit     
			return l1;
	//   14   24:lload_1         
	//   15   25:lreturn         
		}
		long l2 = b.getLong("location_time", -1L);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #185 <String "location_time">
	//   19   32:ldc2w           #253 <Long -1L>
	//   20   35:invokeinterface #258 <Method long SharedPreferences.getLong(String, long)>
	//   21   40:lstore_1        
		obj;
	//   22   41:aload_3         
		JVM INSTR monitorexit ;
	//   23   42:monitorexit     
		return l2;
	//   24   43:lload_1         
	//   25   44:lreturn         
		exception;
	//   26   45:astore          4
		obj;
	//   27   47:aload_3         
		JVM INSTR monitorexit ;
	//   28   48:monitorexit     
		throw exception;
	//   29   49:aload           4
	//   30   51:athrow          
	}

	public long i()
	{
label0:
		{
			long l1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				l1 = e.e();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #231 <Method long bz.e()>
	//   11   21:lstore_1        
			}
	//   12   22:aload_3         
	//   13   23:monitorexit     
			return l1;
	//   14   24:lload_1         
	//   15   25:lreturn         
		}
		long l2 = b.getLong("messaging_session_timeout", -1L);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #229 <String "messaging_session_timeout">
	//   19   32:ldc2w           #253 <Long -1L>
	//   20   35:invokeinterface #258 <Method long SharedPreferences.getLong(String, long)>
	//   21   40:lstore_1        
		obj;
	//   22   41:aload_3         
		JVM INSTR monitorexit ;
	//   23   42:monitorexit     
		return l2;
	//   24   43:lload_1         
	//   25   44:lreturn         
		exception;
	//   26   45:astore          4
		obj;
	//   27   47:aload_3         
		JVM INSTR monitorexit ;
	//   28   48:monitorexit     
		throw exception;
	//   29   49:aload           4
	//   30   51:athrow          
	}

	public float j()
	{
label0:
		{
			float f1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				f1 = e.i();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #194 <Method float bz.i()>
	//   11   21:fstore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return f1;
	//   14   24:fload_1         
	//   15   25:freturn         
		}
		float f2 = b.getFloat("location_distance", -1F);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #190 <String "location_distance">
	//   19   32:ldc2            #259 <Float -1F>
	//   20   35:invokeinterface #263 <Method float SharedPreferences.getFloat(String, float)>
	//   21   40:fstore_1        
		obj;
	//   22   41:aload_2         
		JVM INSTR monitorexit ;
	//   23   42:monitorexit     
		return f2;
	//   24   43:fload_1         
	//   25   44:freturn         
		exception;
	//   26   45:astore_3        
		obj;
	//   27   46:aload_2         
		JVM INSTR monitorexit ;
	//   28   47:monitorexit     
		throw exception;
	//   29   48:aload_3         
	//   30   49:athrow          
	}

	public long k()
	{
label0:
		{
			long l1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				l1 = e.a();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #164 <Method long bz.a()>
	//   11   21:lstore_1        
			}
	//   12   22:aload_3         
	//   13   23:monitorexit     
			return l1;
	//   14   24:lload_1         
	//   15   25:lreturn         
		}
		long l2 = b.getLong("config_time", 0L);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #161 <String "config_time">
	//   19   32:lconst_0        
	//   20   33:invokeinterface #258 <Method long SharedPreferences.getLong(String, long)>
	//   21   38:lstore_1        
		obj;
	//   22   39:aload_3         
		JVM INSTR monitorexit ;
	//   23   40:monitorexit     
		return l2;
	//   24   41:lload_1         
	//   25   42:lreturn         
		exception;
	//   26   43:astore          4
		obj;
	//   27   45:aload_3         
		JVM INSTR monitorexit ;
	//   28   46:monitorexit     
		throw exception;
	//   29   47:aload           4
	//   30   49:athrow          
	}

	public Set l()
	{
		Object obj1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object c>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj;
		if(e != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #84  <Field bz e>
	//*   7   11:ifnull          25
		{
			obj = ((Object) (e.b()));
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #139 <Method Set bz.b()>
	//   11   21:astore_1        
			break MISSING_BLOCK_LABEL_32;
	//   12   22:goto            32
		}
		obj = ((Object) (a("blacklisted_events")));
	//   13   25:aload_0         
	//   14   26:ldc1            #141 <String "blacklisted_events">
	//   15   28:invokespecial   #265 <Method Set a(String)>
	//   16   31:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_40;
	//   17   32:aload_1         
	//   18   33:ifnull          40
		obj1;
	//   19   36:aload_2         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		return ((Set) (obj));
	//   21   38:aload_1         
	//   22   39:areturn         
		obj = ((Object) (new HashSet()));
	//   23   40:new             #107 <Class HashSet>
	//   24   43:dup             
	//   25   44:invokespecial   #108 <Method void HashSet()>
	//   26   47:astore_1        
		obj1;
	//   27   48:aload_2         
		JVM INSTR monitorexit ;
	//   28   49:monitorexit     
		return ((Set) (obj));
	//   29   50:aload_1         
	//   30   51:areturn         
		Exception exception;
		exception;
	//   31   52:astore_1        
		obj1;
	//   32   53:aload_2         
		JVM INSTR monitorexit ;
	//   33   54:monitorexit     
		throw exception;
	//   34   55:aload_1         
	//   35   56:athrow          
	}

	public Set m()
	{
		Object obj1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object c>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj;
		if(e != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #84  <Field bz e>
	//*   7   11:ifnull          25
		{
			obj = ((Object) (e.c()));
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #153 <Method Set bz.c()>
	//   11   21:astore_1        
			break MISSING_BLOCK_LABEL_32;
	//   12   22:goto            32
		}
		obj = ((Object) (a("blacklisted_attributes")));
	//   13   25:aload_0         
	//   14   26:ldc1            #155 <String "blacklisted_attributes">
	//   15   28:invokespecial   #265 <Method Set a(String)>
	//   16   31:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_40;
	//   17   32:aload_1         
	//   18   33:ifnull          40
		obj1;
	//   19   36:aload_2         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		return ((Set) (obj));
	//   21   38:aload_1         
	//   22   39:areturn         
		obj = ((Object) (new HashSet()));
	//   23   40:new             #107 <Class HashSet>
	//   24   43:dup             
	//   25   44:invokespecial   #108 <Method void HashSet()>
	//   26   47:astore_1        
		obj1;
	//   27   48:aload_2         
		JVM INSTR monitorexit ;
	//   28   49:monitorexit     
		return ((Set) (obj));
	//   29   50:aload_1         
	//   30   51:areturn         
		Exception exception;
		exception;
	//   31   52:astore_1        
		obj1;
	//   32   53:aload_2         
		JVM INSTR monitorexit ;
	//   33   54:monitorexit     
		throw exception;
	//   34   55:aload_1         
	//   35   56:athrow          
	}

	public Set n()
	{
		Object obj1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object c>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj;
		if(e != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #84  <Field bz e>
	//*   7   11:ifnull          25
		{
			obj = ((Object) (e.d()));
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #157 <Method Set bz.d()>
	//   11   21:astore_1        
			break MISSING_BLOCK_LABEL_32;
	//   12   22:goto            32
		}
		obj = ((Object) (a("blacklisted_purchases")));
	//   13   25:aload_0         
	//   14   26:ldc1            #159 <String "blacklisted_purchases">
	//   15   28:invokespecial   #265 <Method Set a(String)>
	//   16   31:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_40;
	//   17   32:aload_1         
	//   18   33:ifnull          40
		obj1;
	//   19   36:aload_2         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		return ((Set) (obj));
	//   21   38:aload_1         
	//   22   39:areturn         
		obj = ((Object) (new HashSet()));
	//   23   40:new             #107 <Class HashSet>
	//   24   43:dup             
	//   25   44:invokespecial   #108 <Method void HashSet()>
	//   26   47:astore_1        
		obj1;
	//   27   48:aload_2         
		JVM INSTR monitorexit ;
	//   28   49:monitorexit     
		return ((Set) (obj));
	//   29   50:aload_1         
	//   30   51:areturn         
		Exception exception;
		exception;
	//   31   52:astore_1        
		obj1;
	//   32   53:aload_2         
		JVM INSTR monitorexit ;
	//   33   54:monitorexit     
		throw exception;
	//   34   55:aload_1         
	//   35   56:athrow          
	}

	public boolean o()
	{
label0:
		{
			boolean flag;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field bz e>
	//    7   11:ifnull          26
				flag = e.o();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field bz e>
	//   10   18:invokevirtual   #236 <Method boolean bz.o()>
	//   11   21:istore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return flag;
	//   14   24:iload_1         
	//   15   25:ireturn         
		}
		boolean flag1 = b.getBoolean("test_user_device_logging_enabled", false);
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field SharedPreferences b>
	//   18   30:ldc1            #233 <String "test_user_device_logging_enabled">
	//   19   32:iconst_0        
	//   20   33:invokeinterface #248 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   21   38:istore_1        
		obj;
	//   22   39:aload_2         
		JVM INSTR monitorexit ;
	//   23   40:monitorexit     
		return flag1;
	//   24   41:iload_1         
	//   25   42:ireturn         
		exception;
	//   26   43:astore_3        
		obj;
	//   27   44:aload_2         
		JVM INSTR monitorexit ;
	//   28   45:monitorexit     
		throw exception;
	//   29   46:aload_3         
	//   30   47:athrow          
	}

	public boolean p()
	{
		return d.get();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AtomicBoolean d>
	//    2    4:invokevirtual   #270 <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dh);
	private final SharedPreferences b;
	private final Object c = new Object();
	private AtomicBoolean d;
	private bz e;

	static 
	{
	//    0    0:ldc1            #2   <Class dh>
	//    1    2:invokestatic    #26  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #28  <Field String a>
	//*   3    8:return          
	}
}
