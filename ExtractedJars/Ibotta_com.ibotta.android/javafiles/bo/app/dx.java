// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

// Referenced classes of package bo.app:
//			ct

public class dx
{
	class a extends AsyncTask
		implements TraceFieldInterface
	{

		public void _nr_setTrace(Trace trace)
		{
			try
			{
				_nr_trace = trace;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field Trace _nr_trace>
				return;
		//    3    5:return          
			}
			// Misplaced declaration of an exception variable
			catch(Trace trace)
		//*   4    6:astore_1        
			{
				return;
		//    5    7:return          
			}
		}

		protected transient Void a(Void avoid[])
		{
			ct ct1 = new ct();
		//    0    0:new             #34  <Class ct>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void ct()>
		//    3    7:astore_2        
			ct1.b(a.i());
		//    4    8:aload_2         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field dx a>
		//    7   13:invokevirtual   #39  <Method Set dx.i()>
		//    8   16:invokevirtual   #43  <Method void ct.b(Set)>
			ct1.a(a.h());
		//    9   19:aload_2         
		//   10   20:aload_0         
		//   11   21:getfield        #18  <Field dx a>
		//   12   24:invokevirtual   #46  <Method Set dx.h()>
		//   13   27:invokevirtual   #48  <Method void ct.a(Set)>
			ct1.c(a.j());
		//   14   30:aload_2         
		//   15   31:aload_0         
		//   16   32:getfield        #18  <Field dx a>
		//   17   35:invokevirtual   #51  <Method Set dx.j()>
		//   18   38:invokevirtual   #54  <Method void ct.c(Set)>
			ct1.a(a.g());
		//   19   41:aload_2         
		//   20   42:aload_0         
		//   21   43:getfield        #18  <Field dx a>
		//   22   46:invokevirtual   #58  <Method long dx.g()>
		//   23   49:invokevirtual   #61  <Method void ct.a(long)>
			ct1.b(a.f());
		//   24   52:aload_2         
		//   25   53:aload_0         
		//   26   54:getfield        #18  <Field dx a>
		//   27   57:invokevirtual   #64  <Method long dx.f()>
		//   28   60:invokevirtual   #66  <Method void ct.b(long)>
			ct1.a(a.c());
		//   29   63:aload_2         
		//   30   64:aload_0         
		//   31   65:getfield        #18  <Field dx a>
		//   32   68:invokevirtual   #69  <Method int dx.c()>
		//   33   71:invokevirtual   #72  <Method void ct.a(int)>
			ct1.b(a.d());
		//   34   74:aload_2         
		//   35   75:aload_0         
		//   36   76:getfield        #18  <Field dx a>
		//   37   79:invokevirtual   #75  <Method int dx.d()>
		//   38   82:invokevirtual   #77  <Method void ct.b(int)>
			ct1.c(a.e());
		//   39   85:aload_2         
		//   40   86:aload_0         
		//   41   87:getfield        #18  <Field dx a>
		//   42   90:invokevirtual   #80  <Method int dx.e()>
		//   43   93:invokevirtual   #82  <Method void ct.c(int)>
			ct1.a(a.b());
		//   44   96:aload_2         
		//   45   97:aload_0         
		//   46   98:getfield        #18  <Field dx a>
		//   47  101:invokevirtual   #85  <Method boolean dx.b()>
		//   48  104:invokevirtual   #88  <Method void ct.a(boolean)>
			ct1.b(a.a());
		//   49  107:aload_2         
		//   50  108:aload_0         
		//   51  109:getfield        #18  <Field dx a>
		//   52  112:invokevirtual   #90  <Method boolean dx.a()>
		//   53  115:invokevirtual   #92  <Method void ct.b(boolean)>
			ct1.c(a.k());
		//   54  118:aload_2         
		//   55  119:aload_0         
		//   56  120:getfield        #18  <Field dx a>
		//   57  123:invokevirtual   #95  <Method boolean dx.k()>
		//   58  126:invokevirtual   #97  <Method void ct.c(boolean)>
			synchronized(dx.a(a))
		//*  59  129:aload_0         
		//*  60  130:getfield        #18  <Field dx a>
		//*  61  133:invokestatic    #100 <Method Object dx.a(dx)>
		//*  62  136:astore_1        
		//*  63  137:aload_1         
		//*  64  138:monitorenter    
			{
				dx.a(a, ct1);
		//   65  139:aload_0         
		//   66  140:getfield        #18  <Field dx a>
		//   67  143:aload_2         
		//   68  144:invokestatic    #103 <Method ct dx.a(dx, ct)>
		//   69  147:pop             
			}
		//   70  148:aload_1         
		//   71  149:monitorexit     
			return null;
		//   72  150:aconst_null     
		//   73  151:areturn         
			exception;
		//   74  152:astore_2        
			avoid;
		//   75  153:aload_1         
			JVM INSTR monitorexit ;
		//   76  154:monitorexit     
			throw exception;
		//   77  155:aload_2         
		//   78  156:athrow          
		}

		protected Object doInBackground(Object aobj[])
		{
			TraceMachine.enterMethod(_nr_trace, "dx$a#doInBackground", ((java.util.ArrayList) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Trace _nr_trace>
		//    2    4:ldc1            #109 <String "dx$a#doInBackground">
		//    3    6:aconst_null     
		//    4    7:invokestatic    #115 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
			  goto _L1
		//*   5   10:goto            20
_L3:
			TraceMachine.enterMethod(((Trace) (null)), "dx$a#doInBackground", ((java.util.ArrayList) (null)));
		//    6   13:aconst_null     
		//    7   14:ldc1            #109 <String "dx$a#doInBackground">
		//    8   16:aconst_null     
		//    9   17:invokestatic    #115 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
			aobj = ((Object []) (a((Void[])aobj)));
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:checkcast       #117 <Class Void[]>
		//   13   25:invokevirtual   #119 <Method Void a(Void[])>
		//   14   28:astore_1        
			TraceMachine.exitMethod();
		//   15   29:invokestatic    #122 <Method void TraceMachine.exitMethod()>
			TraceMachine.unloadTraceContext(((Object) (this)));
		//   16   32:aload_0         
		//   17   33:invokestatic    #126 <Method void TraceMachine.unloadTraceContext(Object)>
			return ((Object) (aobj));
		//   18   36:aload_1         
		//   19   37:areturn         
			NoSuchFieldError nosuchfielderror;
			nosuchfielderror;
		//   20   38:astore_2        
			if(true) goto _L3; else goto _L2
_L2:
		//*  21   39:goto            13
		}

		public Trace _nr_trace;
		final dx a;

		private a()
		{
			a = dx.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field dx a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void AsyncTask()>
		//    5    9:return          
		}

	}


	public dx(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void Object()>
	//    6   12:putfield        #36  <Field Object c>
		d = new AtomicBoolean(false);
	//    7   15:aload_0         
	//    8   16:new             #38  <Class AtomicBoolean>
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:invokespecial   #41  <Method void AtomicBoolean(boolean)>
	//   12   24:putfield        #43  <Field AtomicBoolean d>
		if(s == null)
	//*  13   27:aload_2         
	//*  14   28:ifnonnull       46
		{
			AppboyLogger.e(a, "ServerConfigStorageProvider received null api key.");
	//   15   31:getstatic       #29  <Field String a>
	//   16   34:ldc1            #45  <String "ServerConfigStorageProvider received null api key.">
	//   17   36:invokestatic    #48  <Method int AppboyLogger.e(String, String)>
	//   18   39:pop             
			s = "";
	//   19   40:ldc1            #50  <String "">
	//   20   42:astore_2        
		} else
	//*  21   43:goto            72
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   22   46:new             #52  <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #53  <Method void StringBuilder()>
	//   25   53:astore_3        
			stringbuilder.append(".");
	//   26   54:aload_3         
	//   27   55:ldc1            #55  <String ".">
	//   28   57:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
			stringbuilder.append(s);
	//   30   61:aload_3         
	//   31   62:aload_2         
	//   32   63:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
			s = stringbuilder.toString();
	//   34   67:aload_3         
	//   35   68:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   36   71:astore_2        
		}
		StringBuilder stringbuilder1 = new StringBuilder();
	//   37   72:new             #52  <Class StringBuilder>
	//   38   75:dup             
	//   39   76:invokespecial   #53  <Method void StringBuilder()>
	//   40   79:astore_3        
		stringbuilder1.append("com.appboy.storage.serverconfigstorageprovider");
	//   41   80:aload_3         
	//   42   81:ldc1            #65  <String "com.appboy.storage.serverconfigstorageprovider">
	//   43   83:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
		stringbuilder1.append(s);
	//   45   87:aload_3         
	//   46   88:aload_2         
	//   47   89:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
		b = context.getSharedPreferences(stringbuilder1.toString(), 0);
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:aload_3         
	//   52   96:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   53   99:iconst_0        
	//   54  100:invokevirtual   #71  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   55  103:putfield        #73  <Field SharedPreferences b>
		context = ((Context) (new a()));
	//   56  106:new             #8   <Class dx$a>
	//   57  109:dup             
	//   58  110:aload_0         
	//   59  111:aconst_null     
	//   60  112:invokespecial   #76  <Method void dx$a(dx, dx$1)>
	//   61  115:astore_1        
		s = ((String) (new Void[0]));
	//   62  116:iconst_0        
	//   63  117:anewarray       Void[]
	//   64  120:astore_2        
		if(!(context instanceof AsyncTask))
	//*  65  121:aload_1         
	//*  66  122:instanceof      #80  <Class AsyncTask>
	//*  67  125:ifne            135
		{
			((a) (context)).execute(((Object []) (s)));
	//   68  128:aload_1         
	//   69  129:aload_2         
	//   70  130:invokevirtual   #84  <Method AsyncTask dx$a.execute(Object[])>
	//   71  133:pop             
			return;
	//   72  134:return          
		} else
		{
			AsyncTaskInstrumentation.execute((AsyncTask)context, ((Object []) (s)));
	//   73  135:aload_1         
	//   74  136:checkcast       #80  <Class AsyncTask>
	//   75  139:aload_2         
	//   76  140:invokestatic    #89  <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
	//   77  143:pop             
			return;
	//   78  144:return          
		}
	}

	static ct a(dx dx1, ct ct1)
	{
		dx1.e = ct1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field ct e>
		return ct1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Object a(dx dx1)
	{
		return dx1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object c>
	//    2    4:areturn         
	}

	private Set a(String s)
	{
		s = b.getString(s, "");
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field SharedPreferences b>
	//    2    4:aload_1         
	//    3    5:ldc1            #50  <String "">
	//    4    7:invokeinterface #102 <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_1        
		if(StringUtils.isNullOrBlank(s))
	//*   6   13:aload_1         
	//*   7   14:invokestatic    #108 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   8   17:ifeq            22
			return null;
	//    9   20:aconst_null     
	//   10   21:areturn         
		int i1;
		HashSet hashset;
		try
		{
			s = ((String) (JSONArrayInstrumentation.init(s)));
	//   11   22:aload_1         
	//   12   23:invokestatic    #114 <Method JSONArray JSONArrayInstrumentation.init(String)>
	//   13   26:astore_1        
			hashset = new HashSet();
	//   14   27:new             #116 <Class HashSet>
	//   15   30:dup             
	//   16   31:invokespecial   #117 <Method void HashSet()>
	//   17   34:astore_3        
		}
	//*  18   35:iconst_0        
	//*  19   36:istore_2        
	//*  20   37:iload_2         
	//*  21   38:aload_1         
	//*  22   39:invokevirtual   #123 <Method int JSONArray.length()>
	//*  23   42:icmpge          64
	//*  24   45:aload_3         
	//*  25   46:aload_1         
	//*  26   47:iload_2         
	//*  27   48:invokevirtual   #126 <Method String JSONArray.getString(int)>
	//*  28   51:invokeinterface #132 <Method boolean Set.add(Object)>
	//*  29   56:pop             
	//*  30   57:iload_2         
	//*  31   58:iconst_1        
	//*  32   59:iadd            
	//*  33   60:istore_2        
	//*  34   61:goto            37
	//*  35   64:aload_3         
	//*  36   65:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  37   66:astore_1        
		{
			AppboyLogger.w(a, "Experienced exception retrieving blacklisted strings from local storage. Returning null.", ((Throwable) (s)));
	//   38   67:getstatic       #29  <Field String a>
	//   39   70:ldc1            #134 <String "Experienced exception retrieving blacklisted strings from local storage. Returning null.">
	//   40   72:aload_1         
	//   41   73:invokestatic    #138 <Method int AppboyLogger.w(String, String, Throwable)>
	//   42   76:pop             
			return null;
	//   43   77:aconst_null     
	//   44   78:areturn         
		}
		i1 = 0;
		if(i1 >= ((JSONArray) (s)).length())
			break; /* Loop/switch isn't completed */
		((Set) (hashset)).add(((Object) (((JSONArray) (s)).getString(i1))));
		i1++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_37;
_L1:
		return ((Set) (hashset));
	}

	public void a(ct ct1)
	{
		synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			e = ct1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #92  <Field ct e>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		android.content.SharedPreferences.Editor editor;
		try
		{
			editor = b.edit();
	//   10   14:aload_0         
	//   11   15:getfield        #73  <Field SharedPreferences b>
	//   12   18:invokeinterface #145 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   13   23:astore_3        
			if(ct1.b() == null)
				break MISSING_BLOCK_LABEL_76;
	//   14   24:aload_1         
	//   15   25:invokevirtual   #150 <Method Set ct.b()>
	//   16   28:ifnull          76
			obj = ((Object) (new JSONArray(((java.util.Collection) (ct1.b())))));
	//   17   31:new             #119 <Class JSONArray>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:invokevirtual   #150 <Method Set ct.b()>
	//   21   39:invokespecial   #153 <Method void JSONArray(java.util.Collection)>
	//   22   42:astore_2        
			if(!(obj instanceof JSONArray))
	//*  23   43:aload_2         
	//*  24   44:instanceof      #119 <Class JSONArray>
	//*  25   47:ifne            58
			{
				obj = ((Object) (((JSONArray) (obj)).toString()));
	//   26   50:aload_2         
	//   27   51:invokevirtual   #154 <Method String JSONArray.toString()>
	//   28   54:astore_2        
				break MISSING_BLOCK_LABEL_66;
	//   29   55:goto            66
			}
		}
	//*  30   58:aload_2         
	//*  31   59:checkcast       #119 <Class JSONArray>
	//*  32   62:invokestatic    #157 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//*  33   65:astore_2        
	//*  34   66:aload_3         
	//*  35   67:ldc1            #159 <String "blacklisted_events">
	//*  36   69:aload_2         
	//*  37   70:invokeinterface #165 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//*  38   75:pop             
	//*  39   76:aload_1         
	//*  40   77:invokevirtual   #167 <Method Set ct.c()>
	//*  41   80:ifnull          128
	//*  42   83:new             #119 <Class JSONArray>
	//*  43   86:dup             
	//*  44   87:aload_1         
	//*  45   88:invokevirtual   #167 <Method Set ct.c()>
	//*  46   91:invokespecial   #153 <Method void JSONArray(java.util.Collection)>
	//*  47   94:astore_2        
	//*  48   95:aload_2         
	//*  49   96:instanceof      #119 <Class JSONArray>
	//*  50   99:ifne            110
	//*  51  102:aload_2         
	//*  52  103:invokevirtual   #154 <Method String JSONArray.toString()>
	//*  53  106:astore_2        
	//*  54  107:goto            118
	//*  55  110:aload_2         
	//*  56  111:checkcast       #119 <Class JSONArray>
	//*  57  114:invokestatic    #157 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//*  58  117:astore_2        
	//*  59  118:aload_3         
	//*  60  119:ldc1            #169 <String "blacklisted_attributes">
	//*  61  121:aload_2         
	//*  62  122:invokeinterface #165 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//*  63  127:pop             
	//*  64  128:aload_1         
	//*  65  129:invokevirtual   #171 <Method Set ct.d()>
	//*  66  132:ifnull          180
	//*  67  135:new             #119 <Class JSONArray>
	//*  68  138:dup             
	//*  69  139:aload_1         
	//*  70  140:invokevirtual   #171 <Method Set ct.d()>
	//*  71  143:invokespecial   #153 <Method void JSONArray(java.util.Collection)>
	//*  72  146:astore_2        
	//*  73  147:aload_2         
	//*  74  148:instanceof      #119 <Class JSONArray>
	//*  75  151:ifne            162
	//*  76  154:aload_2         
	//*  77  155:invokevirtual   #154 <Method String JSONArray.toString()>
	//*  78  158:astore_2        
	//*  79  159:goto            170
	//*  80  162:aload_2         
	//*  81  163:checkcast       #119 <Class JSONArray>
	//*  82  166:invokestatic    #157 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//*  83  169:astore_2        
	//*  84  170:aload_3         
	//*  85  171:ldc1            #173 <String "blacklisted_purchases">
	//*  86  173:aload_2         
	//*  87  174:invokeinterface #165 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//*  88  179:pop             
	//*  89  180:aload_3         
	//*  90  181:ldc1            #175 <String "config_time">
	//*  91  183:aload_1         
	//*  92  184:invokevirtual   #178 <Method long ct.a()>
	//*  93  187:invokeinterface #182 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//*  94  192:pop             
	//*  95  193:aload_3         
	//*  96  194:ldc1            #184 <String "geofences_min_time_since_last_request">
	//*  97  196:aload_1         
	//*  98  197:invokevirtual   #187 <Method int ct.f()>
	//*  99  200:invokeinterface #191 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//* 100  205:pop             
	//* 101  206:aload_3         
	//* 102  207:ldc1            #193 <String "geofences_min_time_since_last_report">
	//* 103  209:aload_1         
	//* 104  210:invokevirtual   #196 <Method int ct.g()>
	//* 105  213:invokeinterface #191 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//* 106  218:pop             
	//* 107  219:aload_3         
	//* 108  220:ldc1            #198 <String "geofences_max_num_to_register">
	//* 109  222:aload_1         
	//* 110  223:invokevirtual   #201 <Method int ct.h()>
	//* 111  226:invokeinterface #191 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//* 112  231:pop             
	//* 113  232:aload_3         
	//* 114  233:ldc1            #203 <String "geofences_enabled">
	//* 115  235:aload_1         
	//* 116  236:invokevirtual   #207 <Method boolean ct.i()>
	//* 117  239:invokeinterface #211 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//* 118  244:pop             
	//* 119  245:aload_3         
	//* 120  246:ldc1            #213 <String "geofences_enabled_set">
	//* 121  248:aload_1         
	//* 122  249:invokevirtual   #216 <Method boolean ct.j()>
	//* 123  252:invokeinterface #211 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//* 124  257:pop             
	//* 125  258:aload_3         
	//* 126  259:ldc1            #218 <String "messaging_session_timeout">
	//* 127  261:aload_1         
	//* 128  262:invokevirtual   #220 <Method long ct.e()>
	//* 129  265:invokeinterface #182 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//* 130  270:pop             
	//* 131  271:aload_3         
	//* 132  272:ldc1            #222 <String "test_user_device_logging_enabled">
	//* 133  274:aload_1         
	//* 134  275:invokevirtual   #225 <Method boolean ct.k()>
	//* 135  278:invokeinterface #211 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//* 136  283:pop             
	//* 137  284:aload_3         
	//* 138  285:invokeinterface #228 <Method void android.content.SharedPreferences$Editor.apply()>
	//* 139  290:return          
		// Misplaced declaration of an exception variable
		catch(ct ct1)
	//* 140  291:astore_1        
		{
			AppboyLogger.w(a, "Could not persist server config to shared preferences.", ((Throwable) (ct1)));
	//  141  292:getstatic       #29  <Field String a>
	//  142  295:ldc1            #230 <String "Could not persist server config to shared preferences.">
	//  143  297:aload_1         
	//  144  298:invokestatic    #138 <Method int AppboyLogger.w(String, String, Throwable)>
	//  145  301:pop             
			return;
	//  146  302:return          
		}
		obj = ((Object) (JSONArrayInstrumentation.toString((JSONArray)obj)));
		editor.putString("blacklisted_events", ((String) (obj)));
		if(ct1.c() == null)
			break MISSING_BLOCK_LABEL_128;
		obj = ((Object) (new JSONArray(((java.util.Collection) (ct1.c())))));
		if(!(obj instanceof JSONArray))
		{
			obj = ((Object) (((JSONArray) (obj)).toString()));
			break MISSING_BLOCK_LABEL_118;
		}
		obj = ((Object) (JSONArrayInstrumentation.toString((JSONArray)obj)));
		editor.putString("blacklisted_attributes", ((String) (obj)));
		if(ct1.d() == null)
			break MISSING_BLOCK_LABEL_180;
		obj = ((Object) (new JSONArray(((java.util.Collection) (ct1.d())))));
		if(!(obj instanceof JSONArray))
		{
			obj = ((Object) (((JSONArray) (obj)).toString()));
			break MISSING_BLOCK_LABEL_170;
		}
		obj = ((Object) (JSONArrayInstrumentation.toString((JSONArray)obj)));
		editor.putString("blacklisted_purchases", ((String) (obj)));
		editor.putLong("config_time", ct1.a());
		editor.putInt("geofences_min_time_since_last_request", ct1.f());
		editor.putInt("geofences_min_time_since_last_report", ct1.g());
		editor.putInt("geofences_max_num_to_register", ct1.h());
		editor.putBoolean("geofences_enabled", ct1.i());
		editor.putBoolean("geofences_enabled_set", ct1.j());
		editor.putLong("messaging_session_timeout", ct1.e());
		editor.putBoolean("test_user_device_logging_enabled", ct1.k());
		editor.apply();
		return;
		ct1;
	//  147  303:astore_1        
		obj;
	//  148  304:aload_2         
		JVM INSTR monitorexit ;
	//  149  305:monitorexit     
		throw ct1;
	//  150  306:aload_1         
	//  151  307:athrow          
	}

	public void a(boolean flag)
	{
		d.set(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field AtomicBoolean d>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #233 <Method void AtomicBoolean.set(boolean)>
	//    4    8:return          
	}

	public boolean a()
	{
label0:
		{
			boolean flag;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field ct e>
	//    7   11:ifnull          26
				flag = e.j();
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #216 <Method boolean ct.j()>
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
	//   17   27:getfield        #73  <Field SharedPreferences b>
	//   18   30:ldc1            #213 <String "geofences_enabled_set">
	//   19   32:iconst_0        
	//   20   33:invokeinterface #237 <Method boolean SharedPreferences.getBoolean(String, boolean)>
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
	//*   1    1:getfield        #36  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field ct e>
	//    7   11:ifnull          26
				flag = e.i();
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #207 <Method boolean ct.i()>
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
	//   17   27:getfield        #73  <Field SharedPreferences b>
	//   18   30:ldc1            #203 <String "geofences_enabled">
	//   19   32:iconst_0        
	//   20   33:invokeinterface #237 <Method boolean SharedPreferences.getBoolean(String, boolean)>
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

	public int c()
	{
label0:
		{
			int i1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field ct e>
	//    7   11:ifnull          26
				i1 = e.f();
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #187 <Method int ct.f()>
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
	//   17   27:getfield        #73  <Field SharedPreferences b>
	//   18   30:ldc1            #184 <String "geofences_min_time_since_last_request">
	//   19   32:iconst_m1       
	//   20   33:invokeinterface #241 <Method int SharedPreferences.getInt(String, int)>
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

	public int d()
	{
label0:
		{
			int i1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field ct e>
	//    7   11:ifnull          26
				i1 = e.g();
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #196 <Method int ct.g()>
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
	//   17   27:getfield        #73  <Field SharedPreferences b>
	//   18   30:ldc1            #193 <String "geofences_min_time_since_last_report">
	//   19   32:iconst_m1       
	//   20   33:invokeinterface #241 <Method int SharedPreferences.getInt(String, int)>
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

	public int e()
	{
label0:
		{
			int i1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field ct e>
	//    7   11:ifnull          26
				i1 = e.h();
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #201 <Method int ct.h()>
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
	//   17   27:getfield        #73  <Field SharedPreferences b>
	//   18   30:ldc1            #198 <String "geofences_max_num_to_register">
	//   19   32:iconst_m1       
	//   20   33:invokeinterface #241 <Method int SharedPreferences.getInt(String, int)>
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

	public long f()
	{
label0:
		{
			long l1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object c>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field ct e>
	//    7   11:ifnull          26
				l1 = e.e();
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #220 <Method long ct.e()>
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
	//   17   27:getfield        #73  <Field SharedPreferences b>
	//   18   30:ldc1            #218 <String "messaging_session_timeout">
	//   19   32:ldc2w           #242 <Long -1L>
	//   20   35:invokeinterface #247 <Method long SharedPreferences.getLong(String, long)>
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

	public long g()
	{
label0:
		{
			long l1;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object c>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field ct e>
	//    7   11:ifnull          26
				l1 = e.a();
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #178 <Method long ct.a()>
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
	//   17   27:getfield        #73  <Field SharedPreferences b>
	//   18   30:ldc1            #175 <String "config_time">
	//   19   32:lconst_0        
	//   20   33:invokeinterface #247 <Method long SharedPreferences.getLong(String, long)>
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

	public Set h()
	{
		Object obj1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object c>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj;
		if(e != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #92  <Field ct e>
	//*   7   11:ifnull          25
		{
			obj = ((Object) (e.b()));
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #150 <Method Set ct.b()>
	//   11   21:astore_1        
			break MISSING_BLOCK_LABEL_32;
	//   12   22:goto            32
		}
		obj = ((Object) (a("blacklisted_events")));
	//   13   25:aload_0         
	//   14   26:ldc1            #159 <String "blacklisted_events">
	//   15   28:invokespecial   #249 <Method Set a(String)>
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
	//   23   40:new             #116 <Class HashSet>
	//   24   43:dup             
	//   25   44:invokespecial   #117 <Method void HashSet()>
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

	public Set i()
	{
		Object obj1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object c>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj;
		if(e != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #92  <Field ct e>
	//*   7   11:ifnull          25
		{
			obj = ((Object) (e.c()));
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #167 <Method Set ct.c()>
	//   11   21:astore_1        
			break MISSING_BLOCK_LABEL_32;
	//   12   22:goto            32
		}
		obj = ((Object) (a("blacklisted_attributes")));
	//   13   25:aload_0         
	//   14   26:ldc1            #169 <String "blacklisted_attributes">
	//   15   28:invokespecial   #249 <Method Set a(String)>
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
	//   23   40:new             #116 <Class HashSet>
	//   24   43:dup             
	//   25   44:invokespecial   #117 <Method void HashSet()>
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

	public Set j()
	{
		Object obj1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object c>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj;
		if(e != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #92  <Field ct e>
	//*   7   11:ifnull          25
		{
			obj = ((Object) (e.d()));
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #171 <Method Set ct.d()>
	//   11   21:astore_1        
			break MISSING_BLOCK_LABEL_32;
	//   12   22:goto            32
		}
		obj = ((Object) (a("blacklisted_purchases")));
	//   13   25:aload_0         
	//   14   26:ldc1            #173 <String "blacklisted_purchases">
	//   15   28:invokespecial   #249 <Method Set a(String)>
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
	//   23   40:new             #116 <Class HashSet>
	//   24   43:dup             
	//   25   44:invokespecial   #117 <Method void HashSet()>
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

	public boolean k()
	{
label0:
		{
			boolean flag;
			synchronized(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object c>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(e == null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field ct e>
	//    7   11:ifnull          26
				flag = e.k();
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field ct e>
	//   10   18:invokevirtual   #225 <Method boolean ct.k()>
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
	//   17   27:getfield        #73  <Field SharedPreferences b>
	//   18   30:ldc1            #222 <String "test_user_device_logging_enabled">
	//   19   32:iconst_0        
	//   20   33:invokeinterface #237 <Method boolean SharedPreferences.getBoolean(String, boolean)>
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

	public boolean l()
	{
		return d.get();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field AtomicBoolean d>
	//    2    4:invokevirtual   #254 <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dx);
	private final SharedPreferences b;
	private final Object c = new Object();
	private AtomicBoolean d;
	private ct e;

	static 
	{
	//    0    0:ldc1            #2   <Class dx>
	//    1    2:invokestatic    #27  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #29  <Field String a>
	//*   3    8:return          
	}
}
