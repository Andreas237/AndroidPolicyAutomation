// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			gb, ge, gg, ci, 
//			bt, fx, eb, er, 
//			fl, fr, gi, ga, 
//			gd, cc, ek, gj, 
//			ad

public class gf
	implements gb
{

	public gf(Context context, bt bt1, ad ad, AppboyConfigurationProvider appboyconfigurationprovider, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		j = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #50  <Field long j>
	//    5    9:aload_0         
	//    6   10:new             #4   <Class Object>
	//    7   13:dup             
	//    8   14:invokespecial   #48  <Method void Object()>
	//    9   17:putfield        #52  <Field Object k>
		b = context.getApplicationContext();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #58  <Method Context Context.getApplicationContext()>
	//   13   25:putfield        #60  <Field Context b>
		c = bt1;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #62  <Field bt c>
		d = ad;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #64  <Field ad d>
		e = appboyconfigurationprovider.getTriggerActionMinimumTimeIntervalInSeconds();
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:invokevirtual   #70  <Method long AppboyConfigurationProvider.getTriggerActionMinimumTimeIntervalInSeconds()>
	//   23   44:putfield        #72  <Field long e>
		bt1 = ((bt) (new StringBuilder()));
	//   24   47:new             #74  <Class StringBuilder>
	//   25   50:dup             
	//   26   51:invokespecial   #75  <Method void StringBuilder()>
	//   27   54:astore_2        
		((StringBuilder) (bt1)).append("com.appboy.storage.triggers.actions");
	//   28   55:aload_2         
	//   29   56:ldc1            #77  <String "com.appboy.storage.triggers.actions">
	//   30   58:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
		((StringBuilder) (bt1)).append(StringUtils.getCacheFileSuffix(context, s, s1));
	//   32   62:aload_2         
	//   33   63:aload_1         
	//   34   64:aload           5
	//   35   66:aload           6
	//   36   68:invokestatic    #87  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//   37   71:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   38   74:pop             
		f = context.getSharedPreferences(((StringBuilder) (bt1)).toString(), 0);
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:aload_2         
	//   42   78:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   43   81:iconst_0        
	//   44   82:invokevirtual   #95  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   45   85:putfield        #97  <Field SharedPreferences f>
		g = ((ga) (new ge(context, s1)));
	//   46   88:aload_0         
	//   47   89:new             #99  <Class ge>
	//   48   92:dup             
	//   49   93:aload_1         
	//   50   94:aload           6
	//   51   96:invokespecial   #102 <Method void ge(Context, String)>
	//   52   99:putfield        #104 <Field ga g>
		h = ((gd) (new gg(context, s, s1)));
	//   53  102:aload_0         
	//   54  103:new             #106 <Class gg>
	//   55  106:dup             
	//   56  107:aload_1         
	//   57  108:aload           5
	//   58  110:aload           6
	//   59  112:invokespecial   #109 <Method void gg(Context, String, String)>
	//   60  115:putfield        #111 <Field gd h>
		i = b();
	//   61  118:aload_0         
	//   62  119:aload_0         
	//   63  120:invokevirtual   #114 <Method Map b()>
	//   64  123:putfield        #116 <Field Map i>
	//   65  126:return          
	}

	static Context a(gf gf1)
	{
		return gf1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Context b>
	//    2    4:areturn         
	}

	static void a(bt bt1, String s, InAppMessageFailureType inappmessagefailuretype)
	{
		String s1 = a;
	//    0    0:getstatic       #43  <Field String a>
	//    1    3:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #74  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #75  <Method void StringBuilder()>
	//    5   11:astore          4
		stringbuilder.append("Trigger internal timeout exceeded. Attempting to log trigger failure: ");
	//    6   13:aload           4
	//    7   15:ldc1            #123 <String "Trigger internal timeout exceeded. Attempting to log trigger failure: ">
	//    8   17:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
		stringbuilder.append(((Object) (inappmessagefailuretype)));
	//   10   21:aload           4
	//   11   23:aload_2         
	//   12   24:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
		AppboyLogger.i(s1, stringbuilder.toString());
	//   14   28:aload_3         
	//   15   29:aload           4
	//   16   31:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #129 <Method int AppboyLogger.i(String, String)>
	//   18   37:pop             
		if(StringUtils.isNullOrBlank(s))
	//*  19   38:aload_1         
	//*  20   39:invokestatic    #133 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  21   42:ifeq            80
		{
			bt1 = ((bt) (a));
	//   22   45:getstatic       #43  <Field String a>
	//   23   48:astore_0        
			s = ((String) (new StringBuilder()));
	//   24   49:new             #74  <Class StringBuilder>
	//   25   52:dup             
	//   26   53:invokespecial   #75  <Method void StringBuilder()>
	//   27   56:astore_1        
			((StringBuilder) (s)).append("Trigger ID is null or blank. Not logging trigger failure: ");
	//   28   57:aload_1         
	//   29   58:ldc1            #135 <String "Trigger ID is null or blank. Not logging trigger failure: ">
	//   30   60:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			((StringBuilder) (s)).append(((Object) (inappmessagefailuretype)));
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   35   69:pop             
			AppboyLogger.d(((String) (bt1)), ((StringBuilder) (s)).toString());
	//   36   70:aload_0         
	//   37   71:aload_1         
	//   38   72:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   39   75:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//   40   78:pop             
			return;
	//   41   79:return          
		}
		if(bt1 == null)
	//*  42   80:aload_0         
	//*  43   81:ifnonnull       119
		{
			bt1 = ((bt) (a));
	//   44   84:getstatic       #43  <Field String a>
	//   45   87:astore_0        
			s = ((String) (new StringBuilder()));
	//   46   88:new             #74  <Class StringBuilder>
	//   47   91:dup             
	//   48   92:invokespecial   #75  <Method void StringBuilder()>
	//   49   95:astore_1        
			((StringBuilder) (s)).append("Cannot log an trigger failure because the IAppboyManager is null. Trigger failure: ");
	//   50   96:aload_1         
	//   51   97:ldc1            #139 <String "Cannot log an trigger failure because the IAppboyManager is null. Trigger failure: ">
	//   52   99:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   53  102:pop             
			((StringBuilder) (s)).append(((Object) (inappmessagefailuretype)));
	//   54  103:aload_1         
	//   55  104:aload_2         
	//   56  105:invokevirtual   #126 <Method StringBuilder StringBuilder.append(Object)>
	//   57  108:pop             
			AppboyLogger.e(((String) (bt1)), ((StringBuilder) (s)).toString());
	//   58  109:aload_0         
	//   59  110:aload_1         
	//   60  111:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   61  114:invokestatic    #141 <Method int AppboyLogger.e(String, String)>
	//   62  117:pop             
			return;
	//   63  118:return          
		}
		try
		{
			bt1.a(((cc) (ci.a(((String) (null)), ((String) (null)), s, inappmessagefailuretype))));
	//   64  119:aload_0         
	//   65  120:aconst_null     
	//   66  121:aconst_null     
	//   67  122:aload_1         
	//   68  123:aload_2         
	//   69  124:invokestatic    #146 <Method ci ci.a(String, String, String, InAppMessageFailureType)>
	//   70  127:invokeinterface #151 <Method boolean bt.a(cc)>
	//   71  132:pop             
			return;
	//   72  133:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  73  134:astore_1        
		{
			AppboyLogger.i(a, "Failed to log trigger failure event from trigger manager.", ((Throwable) (s)));
	//   74  135:getstatic       #43  <Field String a>
	//   75  138:ldc1            #153 <String "Failed to log trigger failure event from trigger manager.">
	//   76  140:aload_1         
	//   77  141:invokestatic    #156 <Method int AppboyLogger.i(String, String, Throwable)>
	//   78  144:pop             
		}
		bt1.a(((Throwable) (s)));
	//   79  145:aload_0         
	//   80  146:aload_1         
	//   81  147:invokeinterface #159 <Method void bt.a(Throwable)>
	//   82  152:return          
	}

	static boolean a(fr fr1, er er1, long l, long l1)
	{
		if(fr1 instanceof fx)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #163 <Class fx>
	//*   2    4:ifeq            18
		{
			AppboyLogger.d(a, "Ignoring minimum time interval between triggered actions because the trigger event is a test.");
	//    3    7:getstatic       #43  <Field String a>
	//    4   10:ldc1            #165 <String "Ignoring minimum time interval between triggered actions because the trigger event is a test.">
	//    5   12:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//    6   15:pop             
			return true;
	//    7   16:iconst_1        
	//    8   17:ireturn         
		}
		long l2 = eb.a() + (long)er1.c().d();
	//    9   18:invokestatic    #169 <Method long eb.a()>
	//   10   21:aload_1         
	//   11   22:invokeinterface #174 <Method fl er.c()>
	//   12   27:invokeinterface #179 <Method int fl.d()>
	//   13   32:i2l             
	//   14   33:ladd            
	//   15   34:lstore          7
		int i1 = er1.c().g();
	//   16   36:aload_1         
	//   17   37:invokeinterface #174 <Method fl er.c()>
	//   18   42:invokeinterface #181 <Method int fl.g()>
	//   19   47:istore          6
		if(i1 != -1)
	//*  20   49:iload           6
	//*  21   51:iconst_m1       
	//*  22   52:icmpeq          99
		{
			fr1 = ((fr) (a));
	//   23   55:getstatic       #43  <Field String a>
	//   24   58:astore_0        
			er1 = ((er) (new StringBuilder()));
	//   25   59:new             #74  <Class StringBuilder>
	//   26   62:dup             
	//   27   63:invokespecial   #75  <Method void StringBuilder()>
	//   28   66:astore_1        
			((StringBuilder) (er1)).append("Using override minimum display interval: ");
	//   29   67:aload_1         
	//   30   68:ldc1            #183 <String "Using override minimum display interval: ">
	//   31   70:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   32   73:pop             
			((StringBuilder) (er1)).append(i1);
	//   33   74:aload_1         
	//   34   75:iload           6
	//   35   77:invokevirtual   #186 <Method StringBuilder StringBuilder.append(int)>
	//   36   80:pop             
			AppboyLogger.d(((String) (fr1)), ((StringBuilder) (er1)).toString());
	//   37   81:aload_0         
	//   38   82:aload_1         
	//   39   83:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   40   86:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//   41   89:pop             
			l += i1;
	//   42   90:lload_2         
	//   43   91:iload           6
	//   44   93:i2l             
	//   45   94:ladd            
	//   46   95:lstore_2        
		} else
	//*  47   96:goto            104
		{
			l += l1;
	//   48   99:lload_2         
	//   49  100:lload           4
	//   50  102:ladd            
	//   51  103:lstore_2        
		}
		if(l2 >= l)
	//*  52  104:lload           7
	//*  53  106:lload_2         
	//*  54  107:lcmp            
	//*  55  108:iflt            161
		{
			fr1 = ((fr) (a));
	//   56  111:getstatic       #43  <Field String a>
	//   57  114:astore_0        
			er1 = ((er) (new StringBuilder()));
	//   58  115:new             #74  <Class StringBuilder>
	//   59  118:dup             
	//   60  119:invokespecial   #75  <Method void StringBuilder()>
	//   61  122:astore_1        
			((StringBuilder) (er1)).append("Minimum time interval requirement met for matched trigger. Action display time: ");
	//   62  123:aload_1         
	//   63  124:ldc1            #188 <String "Minimum time interval requirement met for matched trigger. Action display time: ">
	//   64  126:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   65  129:pop             
			((StringBuilder) (er1)).append(l2);
	//   66  130:aload_1         
	//   67  131:lload           7
	//   68  133:invokevirtual   #191 <Method StringBuilder StringBuilder.append(long)>
	//   69  136:pop             
			((StringBuilder) (er1)).append(" . Next viable display time: ");
	//   70  137:aload_1         
	//   71  138:ldc1            #193 <String " . Next viable display time: ">
	//   72  140:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   73  143:pop             
			((StringBuilder) (er1)).append(l);
	//   74  144:aload_1         
	//   75  145:lload_2         
	//   76  146:invokevirtual   #191 <Method StringBuilder StringBuilder.append(long)>
	//   77  149:pop             
			AppboyLogger.i(((String) (fr1)), ((StringBuilder) (er1)).toString());
	//   78  150:aload_0         
	//   79  151:aload_1         
	//   80  152:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   81  155:invokestatic    #129 <Method int AppboyLogger.i(String, String)>
	//   82  158:pop             
			return true;
	//   83  159:iconst_1        
	//   84  160:ireturn         
		} else
		{
			fr1 = ((fr) (a));
	//   85  161:getstatic       #43  <Field String a>
	//   86  164:astore_0        
			er1 = ((er) (new StringBuilder()));
	//   87  165:new             #74  <Class StringBuilder>
	//   88  168:dup             
	//   89  169:invokespecial   #75  <Method void StringBuilder()>
	//   90  172:astore_1        
			((StringBuilder) (er1)).append("Minimum time interval requirement and triggered action override time interval requirement of ");
	//   91  173:aload_1         
	//   92  174:ldc1            #195 <String "Minimum time interval requirement and triggered action override time interval requirement of ">
	//   93  176:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   94  179:pop             
			((StringBuilder) (er1)).append(l1);
	//   95  180:aload_1         
	//   96  181:lload           4
	//   97  183:invokevirtual   #191 <Method StringBuilder StringBuilder.append(long)>
	//   98  186:pop             
			((StringBuilder) (er1)).append(" not met for matched trigger. Returning null. Next viable display time: ");
	//   99  187:aload_1         
	//  100  188:ldc1            #197 <String " not met for matched trigger. Returning null. Next viable display time: ">
	//  101  190:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  102  193:pop             
			((StringBuilder) (er1)).append(l);
	//  103  194:aload_1         
	//  104  195:lload_2         
	//  105  196:invokevirtual   #191 <Method StringBuilder StringBuilder.append(long)>
	//  106  199:pop             
			((StringBuilder) (er1)).append(". Action display time: ");
	//  107  200:aload_1         
	//  108  201:ldc1            #199 <String ". Action display time: ">
	//  109  203:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  110  206:pop             
			((StringBuilder) (er1)).append(l2);
	//  111  207:aload_1         
	//  112  208:lload           7
	//  113  210:invokevirtual   #191 <Method StringBuilder StringBuilder.append(long)>
	//  114  213:pop             
			AppboyLogger.i(((String) (fr1)), ((StringBuilder) (er1)).toString());
	//  115  214:aload_0         
	//  116  215:aload_1         
	//  117  216:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  118  219:invokestatic    #129 <Method int AppboyLogger.i(String, String)>
	//  119  222:pop             
			return false;
	//  120  223:iconst_0        
	//  121  224:ireturn         
		}
	}

	static ad b(gf gf1)
	{
		return gf1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ad d>
	//    2    4:areturn         
	}

	public gd a()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field gd h>
	//    2    4:areturn         
	}

	public void a(long l)
	{
		j = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #50  <Field long j>
	//    3    5:return          
	}

	public void a(fr fr1)
	{
		Object obj = ((Object) (a));
	//    0    0:getstatic       #43  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #74  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #75  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("New incoming <");
	//    6   12:aload_3         
	//    7   13:ldc1            #205 <String "New incoming <">
	//    8   15:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(fr1.b());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokeinterface #209 <Method String fr.b()>
	//   13   26:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(">. Searching for matching triggers.");
	//   15   30:aload_3         
	//   16   31:ldc1            #211 <String ">. Searching for matching triggers.">
	//   17   33:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   22   42:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//   23   45:pop             
		obj = ((Object) (b(fr1)));
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #214 <Method er b(fr)>
	//   27   51:astore_2        
		if(obj != null)
	//*  28   52:aload_2         
	//*  29   53:ifnull          62
			b(fr1, ((er) (obj)));
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:aload_2         
	//   33   59:invokevirtual   #217 <Method void b(fr, er)>
	//   34   62:return          
	}

	public void a(fr fr1, er er1)
	{
		Object obj = ((Object) (a));
	//    0    0:getstatic       #43  <Field String a>
	//    1    3:astore          9
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #74  <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #75  <Method void StringBuilder()>
	//    5   12:astore          10
		stringbuilder.append("Trigger manager received failed triggered action with id: <");
	//    6   14:aload           10
	//    7   16:ldc1            #219 <String "Trigger manager received failed triggered action with id: <">
	//    8   18:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(er1.b());
	//   10   22:aload           10
	//   11   24:aload_2         
	//   12   25:invokeinterface #220 <Method String er.b()>
	//   13   30:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:pop             
		stringbuilder.append(">. Will attempt to perform fallback triggered actions, if present.");
	//   15   34:aload           10
	//   16   36:ldc1            #222 <String ">. Will attempt to perform fallback triggered actions, if present.">
	//   17   38:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   19   42:aload           9
	//   20   44:aload           10
	//   21   46:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   22   49:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//   23   52:pop             
		obj = ((Object) (er1.e()));
	//   24   53:aload_2         
	//   25   54:invokeinterface #225 <Method gi er.e()>
	//   26   59:astore          9
		if(obj == null)
	//*  27   61:aload           9
	//*  28   63:ifnonnull       76
		{
			AppboyLogger.d(a, "Triggered action has no trigger metadata and cannot fallback. Doing nothing");
	//   29   66:getstatic       #43  <Field String a>
	//   30   69:ldc1            #227 <String "Triggered action has no trigger metadata and cannot fallback. Doing nothing">
	//   31   71:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//   32   74:pop             
			return;
	//   33   75:return          
		}
		er1 = ((gi) (obj)).a();
	//   34   76:aload           9
	//   35   78:invokevirtual   #232 <Method er gi.a()>
	//   36   81:astore_2        
		if(er1 == null)
	//*  37   82:aload_2         
	//*  38   83:ifnonnull       96
		{
			AppboyLogger.d(a, "Triggered action has no fallback action to perform. Doing nothing");
	//   39   86:getstatic       #43  <Field String a>
	//   40   89:ldc1            #234 <String "Triggered action has no fallback action to perform. Doing nothing">
	//   41   91:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//   42   94:pop             
			return;
	//   43   95:return          
		}
		er1.a(((gi) (obj)));
	//   44   96:aload_2         
	//   45   97:aload           9
	//   46   99:invokeinterface #237 <Method void er.a(gi)>
		er1.a(g.a(er1));
	//   47  104:aload_2         
	//   48  105:aload_0         
	//   49  106:getfield        #104 <Field ga g>
	//   50  109:aload_2         
	//   51  110:invokeinterface #242 <Method String ga.a(er)>
	//   52  115:invokeinterface #245 <Method void er.a(String)>
		long l1 = fr1.d();
	//   53  120:aload_1         
	//   54  121:invokeinterface #247 <Method long fr.d()>
	//   55  126:lstore          5
		obj = ((Object) (er1.c()));
	//   56  128:aload_2         
	//   57  129:invokeinterface #174 <Method fl er.c()>
	//   58  134:astore          9
		long l = ((fl) (obj)).e();
	//   59  136:aload           9
	//   60  138:invokeinterface #249 <Method int fl.e()>
	//   61  143:i2l             
	//   62  144:lstore_3        
		long l2 = TimeUnit.SECONDS.toMillis(((fl) (obj)).d());
	//   63  145:getstatic       #255 <Field TimeUnit TimeUnit.SECONDS>
	//   64  148:aload           9
	//   65  150:invokeinterface #179 <Method int fl.d()>
	//   66  155:i2l             
	//   67  156:invokevirtual   #259 <Method long TimeUnit.toMillis(long)>
	//   68  159:lstore          7
		if(l != -1L)
	//*  69  161:lload_3         
	//*  70  162:ldc2w           #260 <Long -1L>
	//*  71  165:lcmp            
	//*  72  166:ifeq            177
			l += l1;
	//   73  169:lload_3         
	//   74  170:lload           5
	//   75  172:ladd            
	//   76  173:lstore_3        
		else
	//*  77  174:goto            193
			l = l1 + l2 + TimeUnit.SECONDS.toMillis(30L);
	//   78  177:lload           5
	//   79  179:lload           7
	//   80  181:ladd            
	//   81  182:getstatic       #255 <Field TimeUnit TimeUnit.SECONDS>
	//   82  185:ldc2w           #262 <Long 30L>
	//   83  188:invokevirtual   #259 <Method long TimeUnit.toMillis(long)>
	//   84  191:ladd            
	//   85  192:lstore_3        
		if(l < eb.c())
	//*  86  193:lload_3         
	//*  87  194:invokestatic    #265 <Method long eb.c()>
	//*  88  197:lcmp            
	//*  89  198:ifge            270
		{
			String s = a;
	//   90  201:getstatic       #43  <Field String a>
	//   91  204:astore          9
			StringBuilder stringbuilder1 = new StringBuilder();
	//   92  206:new             #74  <Class StringBuilder>
	//   93  209:dup             
	//   94  210:invokespecial   #75  <Method void StringBuilder()>
	//   95  213:astore          10
			stringbuilder1.append("Fallback trigger has expired. Trigger id: ");
	//   96  215:aload           10
	//   97  217:ldc2            #267 <String "Fallback trigger has expired. Trigger id: ">
	//   98  220:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   99  223:pop             
			stringbuilder1.append(er1.b());
	//  100  224:aload           10
	//  101  226:aload_2         
	//  102  227:invokeinterface #220 <Method String er.b()>
	//  103  232:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  104  235:pop             
			AppboyLogger.d(s, stringbuilder1.toString());
	//  105  236:aload           9
	//  106  238:aload           10
	//  107  240:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  108  243:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//  109  246:pop             
			a(c, er1.b(), InAppMessageFailureType.INTERNAL_TIMEOUT_EXCEEDED);
	//  110  247:aload_0         
	//  111  248:getfield        #62  <Field bt c>
	//  112  251:aload_2         
	//  113  252:invokeinterface #220 <Method String er.b()>
	//  114  257:getstatic       #273 <Field InAppMessageFailureType InAppMessageFailureType.INTERNAL_TIMEOUT_EXCEEDED>
	//  115  260:invokestatic    #275 <Method void a(bt, String, InAppMessageFailureType)>
			a(fr1, er1);
	//  116  263:aload_0         
	//  117  264:aload_1         
	//  118  265:aload_2         
	//  119  266:invokevirtual   #277 <Method void a(fr, er)>
			return;
	//  120  269:return          
		} else
		{
			l1 = Math.max(0L, (l2 + l1) - eb.c());
	//  121  270:lconst_0        
	//  122  271:lload           7
	//  123  273:lload           5
	//  124  275:ladd            
	//  125  276:invokestatic    #265 <Method long eb.c()>
	//  126  279:lsub            
	//  127  280:invokestatic    #283 <Method long Math.max(long, long)>
	//  128  283:lstore          5
			String s1 = a;
	//  129  285:getstatic       #43  <Field String a>
	//  130  288:astore          9
			StringBuilder stringbuilder2 = new StringBuilder();
	//  131  290:new             #74  <Class StringBuilder>
	//  132  293:dup             
	//  133  294:invokespecial   #75  <Method void StringBuilder()>
	//  134  297:astore          10
			stringbuilder2.append("Performing fallback triggered action with id: <");
	//  135  299:aload           10
	//  136  301:ldc2            #285 <String "Performing fallback triggered action with id: <">
	//  137  304:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  138  307:pop             
			stringbuilder2.append(er1.b());
	//  139  308:aload           10
	//  140  310:aload_2         
	//  141  311:invokeinterface #220 <Method String er.b()>
	//  142  316:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  143  319:pop             
			stringbuilder2.append("> with a ms delay: ");
	//  144  320:aload           10
	//  145  322:ldc2            #287 <String "> with a ms delay: ">
	//  146  325:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  147  328:pop             
			stringbuilder2.append(l1);
	//  148  329:aload           10
	//  149  331:lload           5
	//  150  333:invokevirtual   #191 <Method StringBuilder StringBuilder.append(long)>
	//  151  336:pop             
			AppboyLogger.d(s1, stringbuilder2.toString());
	//  152  337:aload           9
	//  153  339:aload           10
	//  154  341:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  155  344:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//  156  347:pop             
			(new Handler(Looper.getMainLooper())).postDelayed(new Runnable(er1, fr1, l) {

				public void run()
				{
					a.a(gf.a(d), gf.b(d), b, c);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field er a>
				//    2    4:aload_0         
				//    3    5:getfield        #22  <Field gf d>
				//    4    8:invokestatic    #36  <Method Context gf.a(gf)>
				//    5   11:aload_0         
				//    6   12:getfield        #22  <Field gf d>
				//    7   15:invokestatic    #39  <Method ad gf.b(gf)>
				//    8   18:aload_0         
				//    9   19:getfield        #26  <Field fr b>
				//   10   22:aload_0         
				//   11   23:getfield        #28  <Field long c>
				//   12   26:invokeinterface #44  <Method void er.a(Context, ad, fr, long)>
				//   13   31:return          
				}

				final er a;
				final fr b;
				final long c;
				final gf d;

			
			{
				d = gf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field gf d>
				a = er1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field er a>
				b = fr1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field fr b>
				c = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #28  <Field long c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
			}
, l1);
	//  157  348:new             #289 <Class Handler>
	//  158  351:dup             
	//  159  352:invokestatic    #295 <Method Looper Looper.getMainLooper()>
	//  160  355:invokespecial   #298 <Method void Handler(Looper)>
	//  161  358:new             #8   <Class gf$1>
	//  162  361:dup             
	//  163  362:aload_0         
	//  164  363:aload_2         
	//  165  364:aload_1         
	//  166  365:lload_3         
	//  167  366:invokespecial   #301 <Method void gf$1(gf, er, fr, long)>
	//  168  369:lload           5
	//  169  371:invokevirtual   #305 <Method boolean Handler.postDelayed(Runnable, long)>
	//  170  374:pop             
			return;
	//  171  375:return          
		}
	}

	public void a(List list)
	{
		fx fx1;
		fx1 = new fx();
	//    0    0:new             #163 <Class fx>
	//    1    3:dup             
	//    2    4:invokespecial   #307 <Method void fx()>
	//    3    7:astore          5
		if(list == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       24
		{
			AppboyLogger.w(a, "Received a null list of triggers in registerTriggeredActions(). Doing nothing.");
	//    6   13:getstatic       #43  <Field String a>
	//    7   16:ldc2            #309 <String "Received a null list of triggers in registerTriggeredActions(). Doing nothing.">
	//    8   19:invokestatic    #312 <Method int AppboyLogger.w(String, String)>
	//    9   22:pop             
			return;
	//   10   23:return          
		}
		Object obj1 = k;
	//   11   24:aload_0         
	//   12   25:getfield        #52  <Field Object k>
	//   13   28:astore          4
		obj1;
	//   14   30:aload           4
		JVM INSTR monitorenter ;
	//   15   32:monitorenter    
		android.content.SharedPreferences.Editor editor;
		Object obj2;
		i.clear();
	//   16   33:aload_0         
	//   17   34:getfield        #116 <Field Map i>
	//   18   37:invokeinterface #317 <Method void Map.clear()>
		editor = f.edit();
	//   19   42:aload_0         
	//   20   43:getfield        #97  <Field SharedPreferences f>
	//   21   46:invokeinterface #323 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   22   51:astore          6
		editor.clear();
	//   23   53:aload           6
	//   24   55:invokeinterface #327 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   25   60:pop             
		String s = a;
	//   26   61:getstatic       #43  <Field String a>
	//   27   64:astore_3        
		obj2 = ((Object) (new StringBuilder()));
	//   28   65:new             #74  <Class StringBuilder>
	//   29   68:dup             
	//   30   69:invokespecial   #75  <Method void StringBuilder()>
	//   31   72:astore          7
		((StringBuilder) (obj2)).append("Registering ");
	//   32   74:aload           7
	//   33   76:ldc2            #329 <String "Registering ">
	//   34   79:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   35   82:pop             
		((StringBuilder) (obj2)).append(list.size());
	//   36   83:aload           7
	//   37   85:aload_1         
	//   38   86:invokeinterface #334 <Method int List.size()>
	//   39   91:invokevirtual   #186 <Method StringBuilder StringBuilder.append(int)>
	//   40   94:pop             
		((StringBuilder) (obj2)).append(" new triggered actions.");
	//   41   95:aload           7
	//   42   97:ldc2            #336 <String " new triggered actions.">
	//   43  100:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   44  103:pop             
		AppboyLogger.d(s, ((StringBuilder) (obj2)).toString());
	//   45  104:aload_3         
	//   46  105:aload           7
	//   47  107:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   48  110:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//   49  113:pop             
		obj2 = ((Object) (list.iterator()));
	//   50  114:aload_1         
	//   51  115:invokeinterface #340 <Method Iterator List.iterator()>
	//   52  120:astore          7
		boolean flag = false;
	//   53  122:iconst_0        
	//   54  123:istore_2        
_L2:
		Object obj;
		er er1;
		Object obj3;
		if(!((Iterator) (obj2)).hasNext())
			break; /* Loop/switch isn't completed */
	//   55  124:aload           7
	//   56  126:invokeinterface #346 <Method boolean Iterator.hasNext()>
	//   57  131:ifeq            281
		er1 = (er)((Iterator) (obj2)).next();
	//   58  134:aload           7
	//   59  136:invokeinterface #350 <Method Object Iterator.next()>
	//   60  141:checkcast       #171 <Class er>
	//   61  144:astore          8
		obj = ((Object) (a));
	//   62  146:getstatic       #43  <Field String a>
	//   63  149:astore_3        
		obj3 = ((Object) (new StringBuilder()));
	//   64  150:new             #74  <Class StringBuilder>
	//   65  153:dup             
	//   66  154:invokespecial   #75  <Method void StringBuilder()>
	//   67  157:astore          9
		((StringBuilder) (obj3)).append("Registering triggered action id ");
	//   68  159:aload           9
	//   69  161:ldc2            #352 <String "Registering triggered action id ">
	//   70  164:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   71  167:pop             
		((StringBuilder) (obj3)).append(er1.b());
	//   72  168:aload           9
	//   73  170:aload           8
	//   74  172:invokeinterface #220 <Method String er.b()>
	//   75  177:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   76  180:pop             
		AppboyLogger.d(((String) (obj)), ((StringBuilder) (obj3)).toString());
	//   77  181:aload_3         
	//   78  182:aload           9
	//   79  184:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   80  187:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//   81  190:pop             
		i.put(((Object) (er1.b())), ((Object) (er1)));
	//   82  191:aload_0         
	//   83  192:getfield        #116 <Field Map i>
	//   84  195:aload           8
	//   85  197:invokeinterface #220 <Method String er.b()>
	//   86  202:aload           8
	//   87  204:invokeinterface #356 <Method Object Map.put(Object, Object)>
	//   88  209:pop             
		obj3 = ((Object) (er1.b()));
	//   89  210:aload           8
	//   90  212:invokeinterface #220 <Method String er.b()>
	//   91  217:astore          9
		obj = ((Object) ((JSONObject)er1.forJsonPut()));
	//   92  219:aload           8
	//   93  221:invokeinterface #359 <Method Object er.forJsonPut()>
	//   94  226:checkcast       #361 <Class JSONObject>
	//   95  229:astore_3        
		if(!(obj instanceof JSONObject))
	//*  96  230:aload_3         
	//*  97  231:instanceof      #361 <Class JSONObject>
	//*  98  234:ifne            245
		{
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//   99  237:aload_3         
	//  100  238:invokevirtual   #362 <Method String JSONObject.toString()>
	//  101  241:astore_3        
			break MISSING_BLOCK_LABEL_253;
	//  102  242:goto            253
		}
		obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj)));
	//  103  245:aload_3         
	//  104  246:checkcast       #361 <Class JSONObject>
	//  105  249:invokestatic    #367 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//  106  252:astore_3        
		editor.putString(((String) (obj3)), ((String) (obj)));
	//  107  253:aload           6
	//  108  255:aload           9
	//  109  257:aload_3         
	//  110  258:invokeinterface #371 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//  111  263:pop             
		if(er1.a(((fr) (fx1))))
	//* 112  264:aload           8
	//* 113  266:aload           5
	//* 114  268:invokeinterface #374 <Method boolean er.a(fr)>
	//* 115  273:ifeq            124
			flag = true;
	//  116  276:iconst_1        
	//  117  277:istore_2        
		if(true) goto _L2; else goto _L1
	//  118  278:goto            124
_L1:
		editor.apply();
	//  119  281:aload           6
	//  120  283:invokeinterface #377 <Method void android.content.SharedPreferences$Editor.apply()>
		obj1;
	//  121  288:aload           4
		JVM INSTR monitorexit ;
	//  122  290:monitorexit     
		h.a(list);
	//  123  291:aload_0         
	//  124  292:getfield        #111 <Field gd h>
	//  125  295:aload_1         
	//  126  296:invokeinterface #381 <Method void gd.a(List)>
		g.a(list);
	//  127  301:aload_0         
	//  128  302:getfield        #104 <Field ga g>
	//  129  305:aload_1         
	//  130  306:invokeinterface #382 <Method void ga.a(List)>
		if(flag)
	//* 131  311:iload_2         
	//* 132  312:ifeq            332
		{
			AppboyLogger.i(a, "Test triggered actions found, triggering test event.");
	//  133  315:getstatic       #43  <Field String a>
	//  134  318:ldc2            #384 <String "Test triggered actions found, triggering test event.">
	//  135  321:invokestatic    #129 <Method int AppboyLogger.i(String, String)>
	//  136  324:pop             
			a(((fr) (fx1)));
	//  137  325:aload_0         
	//  138  326:aload           5
	//  139  328:invokevirtual   #386 <Method void a(fr)>
			return;
	//  140  331:return          
		} else
		{
			AppboyLogger.d(a, "No test triggered actions found.");
	//  141  332:getstatic       #43  <Field String a>
	//  142  335:ldc2            #388 <String "No test triggered actions found.">
	//  143  338:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//  144  341:pop             
			return;
	//  145  342:return          
		}
		list;
	//  146  343:astore_1        
		obj1;
	//  147  344:aload           4
		JVM INSTR monitorexit ;
	//  148  346:monitorexit     
		throw list;
	//  149  347:aload_1         
	//  150  348:athrow          
	}

	er b(fr fr1)
	{
		Object obj2 = k;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object k>
	//    2    4:astore          7
		obj2;
	//    3    6:aload           7
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object obj3;
		Iterator iterator;
		obj3 = ((Object) (new ArrayList()));
	//    5    9:new             #392 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #393 <Method void ArrayList()>
	//    8   16:astore          8
		iterator = i.values().iterator();
	//    9   18:aload_0         
	//   10   19:getfield        #116 <Field Map i>
	//   11   22:invokeinterface #397 <Method Collection Map.values()>
	//   12   27:invokeinterface #400 <Method Iterator Collection.iterator()>
	//   13   32:astore          9
		int l;
		Object obj;
		obj = null;
	//   14   34:aconst_null     
	//   15   35:astore          5
		l = 0x80000000;
	//   16   37:ldc2            #401 <Int 0x80000000>
	//   17   40:istore_2        
_L2:
		int j1;
		Object obj1;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   18   41:aload           9
	//   19   43:invokeinterface #346 <Method boolean Iterator.hasNext()>
	//   20   48:ifeq            205
		obj1 = ((Object) ((er)iterator.next()));
	//   21   51:aload           9
	//   22   53:invokeinterface #350 <Method Object Iterator.next()>
	//   23   58:checkcast       #171 <Class er>
	//   24   61:astore          6
		if(!((er) (obj1)).a(fr1) || !h.a(((er) (obj1))) || !a(fr1, ((er) (obj1)), j, e))
			continue; /* Loop/switch isn't completed */
	//   25   63:aload           6
	//   26   65:aload_1         
	//   27   66:invokeinterface #374 <Method boolean er.a(fr)>
	//   28   71:ifeq            41
	//   29   74:aload_0         
	//   30   75:getfield        #111 <Field gd h>
	//   31   78:aload           6
	//   32   80:invokeinterface #404 <Method boolean gd.a(er)>
	//   33   85:ifeq            41
	//   34   88:aload_1         
	//   35   89:aload           6
	//   36   91:aload_0         
	//   37   92:getfield        #50  <Field long j>
	//   38   95:aload_0         
	//   39   96:getfield        #72  <Field long e>
	//   40   99:invokestatic    #406 <Method boolean a(fr, er, long, long)>
	//   41  102:ifeq            41
		String s = a;
	//   42  105:getstatic       #43  <Field String a>
	//   43  108:astore          10
		StringBuilder stringbuilder = new StringBuilder();
	//   44  110:new             #74  <Class StringBuilder>
	//   45  113:dup             
	//   46  114:invokespecial   #75  <Method void StringBuilder()>
	//   47  117:astore          11
		stringbuilder.append("Found potential triggered action for incoming trigger event. Action id ");
	//   48  119:aload           11
	//   49  121:ldc2            #408 <String "Found potential triggered action for incoming trigger event. Action id ">
	//   50  124:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   51  127:pop             
		stringbuilder.append(((er) (obj1)).b());
	//   52  128:aload           11
	//   53  130:aload           6
	//   54  132:invokeinterface #220 <Method String er.b()>
	//   55  137:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   56  140:pop             
		stringbuilder.append(".");
	//   57  141:aload           11
	//   58  143:ldc2            #410 <String ".">
	//   59  146:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   60  149:pop             
		AppboyLogger.d(s, stringbuilder.toString());
	//   61  150:aload           10
	//   62  152:aload           11
	//   63  154:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   64  157:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//   65  160:pop             
		j1 = ((er) (obj1)).c().c();
	//   66  161:aload           6
	//   67  163:invokeinterface #174 <Method fl er.c()>
	//   68  168:invokeinterface #412 <Method int fl.c()>
	//   69  173:istore          4
		int i1;
		i1 = l;
	//   70  175:iload_2         
	//   71  176:istore_3        
		if(j1 > l)
	//*  72  177:iload           4
	//*  73  179:iload_2         
	//*  74  180:icmple          190
		{
			obj = obj1;
	//   75  183:aload           6
	//   76  185:astore          5
			i1 = j1;
	//   77  187:iload           4
	//   78  189:istore_3        
		}
		((List) (obj3)).add(obj1);
	//   79  190:aload           8
	//   80  192:aload           6
	//   81  194:invokeinterface #416 <Method boolean List.add(Object)>
	//   82  199:pop             
		l = i1;
	//   83  200:iload_3         
	//   84  201:istore_2        
		if(true) goto _L2; else goto _L1
	//   85  202:goto            41
_L1:
		if(obj != null)
			break MISSING_BLOCK_LABEL_270;
	//   86  205:aload           5
	//   87  207:ifnonnull       270
		obj = ((Object) (a));
	//   88  210:getstatic       #43  <Field String a>
	//   89  213:astore          5
		obj1 = ((Object) (new StringBuilder()));
	//   90  215:new             #74  <Class StringBuilder>
	//   91  218:dup             
	//   92  219:invokespecial   #75  <Method void StringBuilder()>
	//   93  222:astore          6
		((StringBuilder) (obj1)).append("Failed to match triggered action for incoming <");
	//   94  224:aload           6
	//   95  226:ldc2            #418 <String "Failed to match triggered action for incoming <">
	//   96  229:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   97  232:pop             
		((StringBuilder) (obj1)).append(fr1.b());
	//   98  233:aload           6
	//   99  235:aload_1         
	//  100  236:invokeinterface #209 <Method String fr.b()>
	//  101  241:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  102  244:pop             
		((StringBuilder) (obj1)).append(">.");
	//  103  245:aload           6
	//  104  247:ldc2            #420 <String ">.">
	//  105  250:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  106  253:pop             
		AppboyLogger.d(((String) (obj)), ((StringBuilder) (obj1)).toString());
	//  107  254:aload           5
	//  108  256:aload           6
	//  109  258:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  110  261:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//  111  264:pop             
		obj2;
	//  112  265:aload           7
		JVM INSTR monitorexit ;
	//  113  267:monitorexit     
		return null;
	//  114  268:aconst_null     
	//  115  269:areturn         
		((List) (obj3)).remove(obj);
	//  116  270:aload           8
	//  117  272:aload           5
	//  118  274:invokeinterface #423 <Method boolean List.remove(Object)>
	//  119  279:pop             
		((er) (obj)).a(new gi(((List) (obj3))));
	//  120  280:aload           5
	//  121  282:new             #229 <Class gi>
	//  122  285:dup             
	//  123  286:aload           8
	//  124  288:invokespecial   #425 <Method void gi(List)>
	//  125  291:invokeinterface #237 <Method void er.a(gi)>
		obj1 = ((Object) (a));
	//  126  296:getstatic       #43  <Field String a>
	//  127  299:astore          6
		obj3 = ((Object) (new StringBuilder()));
	//  128  301:new             #74  <Class StringBuilder>
	//  129  304:dup             
	//  130  305:invokespecial   #75  <Method void StringBuilder()>
	//  131  308:astore          8
		((StringBuilder) (obj3)).append("Found best triggered action for incoming trigger event ");
	//  132  310:aload           8
	//  133  312:ldc2            #427 <String "Found best triggered action for incoming trigger event ">
	//  134  315:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  135  318:pop             
		if(fr1.e() == null) goto _L4; else goto _L3
	//  136  319:aload_1         
	//  137  320:invokeinterface #430 <Method cc fr.e()>
	//  138  325:ifnull          410
_L3:
		fr1 = ((fr) (ek.a((JSONObject)fr1.e().forJsonPut())));
	//  139  328:aload_1         
	//  140  329:invokeinterface #430 <Method cc fr.e()>
	//  141  334:invokeinterface #433 <Method Object cc.forJsonPut()>
	//  142  339:checkcast       #361 <Class JSONObject>
	//  143  342:invokestatic    #437 <Method String ek.a(JSONObject)>
	//  144  345:astore_1        
	//* 145  346:goto            349
_L6:
		((StringBuilder) (obj3)).append(((String) (fr1)));
	//  146  349:aload           8
	//  147  351:aload_1         
	//  148  352:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  149  355:pop             
		((StringBuilder) (obj3)).append(".\nMatched Action id: ");
	//  150  356:aload           8
	//  151  358:ldc2            #439 <String ".\nMatched Action id: ">
	//  152  361:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  153  364:pop             
		((StringBuilder) (obj3)).append(((er) (obj)).b());
	//  154  365:aload           8
	//  155  367:aload           5
	//  156  369:invokeinterface #220 <Method String er.b()>
	//  157  374:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  158  377:pop             
		((StringBuilder) (obj3)).append(".");
	//  159  378:aload           8
	//  160  380:ldc2            #410 <String ".">
	//  161  383:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  162  386:pop             
		AppboyLogger.d(((String) (obj1)), ((StringBuilder) (obj3)).toString());
	//  163  387:aload           6
	//  164  389:aload           8
	//  165  391:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  166  394:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//  167  397:pop             
		obj2;
	//  168  398:aload           7
		JVM INSTR monitorexit ;
	//  169  400:monitorexit     
		return ((er) (obj));
	//  170  401:aload           5
	//  171  403:areturn         
		fr1;
	//  172  404:astore_1        
		obj2;
	//  173  405:aload           7
		JVM INSTR monitorexit ;
	//  174  407:monitorexit     
		throw fr1;
	//  175  408:aload_1         
	//  176  409:athrow          
_L4:
		fr1 = "";
	//  177  410:ldc2            #441 <String "">
	//  178  413:astore_1        
		if(true) goto _L6; else goto _L5
	//  179  414:goto            349
_L5:
	}

	Map b()
	{
		HashMap hashmap;
		Object obj;
		hashmap = new HashMap();
	//    0    0:new             #445 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #446 <Method void HashMap()>
	//    3    7:astore_1        
		obj = ((Object) (f.getAll()));
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field SharedPreferences f>
	//    6   12:invokeinterface #449 <Method Map SharedPreferences.getAll()>
	//    7   17:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_274;
	//    8   18:aload_2         
	//    9   19:ifnull          274
		if(((Map) (obj)).size() == 0)
	//*  10   22:aload_2         
	//*  11   23:invokeinterface #450 <Method int Map.size()>
	//*  12   28:ifne            33
			return ((Map) (hashmap));
	//   13   31:aload_1         
	//   14   32:areturn         
		obj = ((Object) (((Map) (obj)).keySet()));
	//   15   33:aload_2         
	//   16   34:invokeinterface #454 <Method Set Map.keySet()>
	//   17   39:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_272;
	//   18   40:aload_2         
	//   19   41:ifnull          272
		if(((Set) (obj)).size() == 0)
	//*  20   44:aload_2         
	//*  21   45:invokeinterface #457 <Method int Set.size()>
	//*  22   50:ifne            55
			return ((Map) (hashmap));
	//   23   53:aload_1         
	//   24   54:areturn         
		obj = ((Object) (((Set) (obj)).iterator()));
	//   25   55:aload_2         
	//   26   56:invokeinterface #458 <Method Iterator Set.iterator()>
	//   27   61:astore_2        
_L3:
		Object obj2;
		String s;
		if(!((Iterator) (obj)).hasNext())
			break MISSING_BLOCK_LABEL_270;
	//   28   62:aload_2         
	//   29   63:invokeinterface #346 <Method boolean Iterator.hasNext()>
	//   30   68:ifeq            270
		obj2 = ((Object) ((String)((Iterator) (obj)).next()));
	//   31   71:aload_2         
	//   32   72:invokeinterface #350 <Method Object Iterator.next()>
	//   33   77:checkcast       #460 <Class String>
	//   34   80:astore_3        
		s = f.getString(((String) (obj2)), ((String) (null)));
	//   35   81:aload_0         
	//   36   82:getfield        #97  <Field SharedPreferences f>
	//   37   85:aload_3         
	//   38   86:aconst_null     
	//   39   87:invokeinterface #464 <Method String SharedPreferences.getString(String, String)>
	//   40   92:astore          4
		if(!StringUtils.isNullOrBlank(s)) goto _L2; else goto _L1
	//   41   94:aload           4
	//   42   96:invokestatic    #133 <Method boolean StringUtils.isNullOrBlank(String)>
	//   43   99:ifeq            155
_L1:
		s = a;
	//   44  102:getstatic       #43  <Field String a>
	//   45  105:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   46  107:new             #74  <Class StringBuilder>
	//   47  110:dup             
	//   48  111:invokespecial   #75  <Method void StringBuilder()>
	//   49  114:astore          5
		stringbuilder.append("Received null or blank serialized triggered action string for action id ");
	//   50  116:aload           5
	//   51  118:ldc2            #466 <String "Received null or blank serialized triggered action string for action id ">
	//   52  121:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   53  124:pop             
		stringbuilder.append(((String) (obj2)));
	//   54  125:aload           5
	//   55  127:aload_3         
	//   56  128:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   57  131:pop             
		stringbuilder.append(" from shared preferences. Not parsing.");
	//   58  132:aload           5
	//   59  134:ldc2            #468 <String " from shared preferences. Not parsing.">
	//   60  137:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   61  140:pop             
		AppboyLogger.w(s, stringbuilder.toString());
	//   62  141:aload           4
	//   63  143:aload           5
	//   64  145:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   65  148:invokestatic    #312 <Method int AppboyLogger.w(String, String)>
	//   66  151:pop             
		  goto _L3
	//*  67  152:goto            62
_L2:
		obj2 = ((Object) (gj.b(JSONObjectInstrumentation.init(s), c)));
	//   68  155:aload           4
	//   69  157:invokestatic    #472 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   70  160:aload_0         
	//   71  161:getfield        #62  <Field bt c>
	//   72  164:invokestatic    #477 <Method er gj.b(JSONObject, bt)>
	//   73  167:astore_3        
		if(obj2 == null) goto _L3; else goto _L4
	//   74  168:aload_3         
	//   75  169:ifnull          62
_L4:
		((Map) (hashmap)).put(((Object) (((er) (obj2)).b())), obj2);
	//   76  172:aload_1         
	//   77  173:aload_3         
	//   78  174:invokeinterface #220 <Method String er.b()>
	//   79  179:aload_3         
	//   80  180:invokeinterface #356 <Method Object Map.put(Object, Object)>
	//   81  185:pop             
		String s1 = a;
	//   82  186:getstatic       #43  <Field String a>
	//   83  189:astore          4
		StringBuilder stringbuilder1 = new StringBuilder();
	//   84  191:new             #74  <Class StringBuilder>
	//   85  194:dup             
	//   86  195:invokespecial   #75  <Method void StringBuilder()>
	//   87  198:astore          5
		stringbuilder1.append("Retrieving templated triggered action id ");
	//   88  200:aload           5
	//   89  202:ldc2            #479 <String "Retrieving templated triggered action id ">
	//   90  205:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   91  208:pop             
		stringbuilder1.append(((er) (obj2)).b());
	//   92  209:aload           5
	//   93  211:aload_3         
	//   94  212:invokeinterface #220 <Method String er.b()>
	//   95  217:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   96  220:pop             
		stringbuilder1.append(" from local storage.");
	//   97  221:aload           5
	//   98  223:ldc2            #481 <String " from local storage.">
	//   99  226:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  100  229:pop             
		AppboyLogger.d(s1, stringbuilder1.toString());
	//  101  230:aload           4
	//  102  232:aload           5
	//  103  234:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  104  237:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//  105  240:pop             
		  goto _L3
	//* 106  241:goto            62
		Object obj1;
		obj1;
	//  107  244:astore_2        
		AppboyLogger.e(a, "Encountered unexpected exception while parsing stored triggered actions.", ((Throwable) (obj1)));
	//  108  245:getstatic       #43  <Field String a>
	//  109  248:ldc2            #483 <String "Encountered unexpected exception while parsing stored triggered actions.">
	//  110  251:aload_2         
	//  111  252:invokestatic    #485 <Method int AppboyLogger.e(String, String, Throwable)>
	//  112  255:pop             
		return ((Map) (hashmap));
	//  113  256:aload_1         
	//  114  257:areturn         
		obj1;
	//  115  258:astore_2        
		AppboyLogger.e(a, "Encountered Json exception while parsing stored triggered actions.", ((Throwable) (obj1)));
	//  116  259:getstatic       #43  <Field String a>
	//  117  262:ldc2            #487 <String "Encountered Json exception while parsing stored triggered actions.">
	//  118  265:aload_2         
	//  119  266:invokestatic    #485 <Method int AppboyLogger.e(String, String, Throwable)>
	//  120  269:pop             
		return ((Map) (hashmap));
	//  121  270:aload_1         
	//  122  271:areturn         
		return ((Map) (hashmap));
	//  123  272:aload_1         
	//  124  273:areturn         
		return ((Map) (hashmap));
	//  125  274:aload_1         
	//  126  275:areturn         
	}

	void b(fr fr1, er er1)
	{
		er1.a(g.a(er1));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #104 <Field ga g>
	//    3    5:aload_2         
	//    4    6:invokeinterface #242 <Method String ga.a(er)>
	//    5   11:invokeinterface #245 <Method void er.a(String)>
		Object obj = ((Object) (er1.c()));
	//    6   16:aload_2         
	//    7   17:invokeinterface #174 <Method fl er.c()>
	//    8   22:astore          7
		long l1;
		if(((fl) (obj)).e() != -1)
	//*   9   24:aload           7
	//*  10   26:invokeinterface #249 <Method int fl.e()>
	//*  11   31:iconst_m1       
	//*  12   32:icmpeq          55
			l1 = fr1.d() + (long)((fl) (obj)).e();
	//   13   35:aload_1         
	//   14   36:invokeinterface #247 <Method long fr.d()>
	//   15   41:aload           7
	//   16   43:invokeinterface #249 <Method int fl.e()>
	//   17   48:i2l             
	//   18   49:ladd            
	//   19   50:lstore          4
		else
	//*  20   52:goto            60
			l1 = -1L;
	//   21   55:ldc2w           #260 <Long -1L>
	//   22   58:lstore          4
		Handler handler = new Handler(Looper.getMainLooper());
	//   23   60:new             #289 <Class Handler>
	//   24   63:dup             
	//   25   64:invokestatic    #295 <Method Looper Looper.getMainLooper()>
	//   26   67:invokespecial   #298 <Method void Handler(Looper)>
	//   27   70:astore          6
		int l = ((fl) (obj)).d();
	//   28   72:aload           7
	//   29   74:invokeinterface #179 <Method int fl.d()>
	//   30   79:istore_3        
		obj = ((Object) (a));
	//   31   80:getstatic       #43  <Field String a>
	//   32   83:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   33   85:new             #74  <Class StringBuilder>
	//   34   88:dup             
	//   35   89:invokespecial   #75  <Method void StringBuilder()>
	//   36   92:astore          8
		stringbuilder.append("Performing triggered action after a delay of ");
	//   37   94:aload           8
	//   38   96:ldc2            #490 <String "Performing triggered action after a delay of ">
	//   39   99:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   40  102:pop             
		stringbuilder.append(l);
	//   41  103:aload           8
	//   42  105:iload_3         
	//   43  106:invokevirtual   #186 <Method StringBuilder StringBuilder.append(int)>
	//   44  109:pop             
		stringbuilder.append(" seconds.");
	//   45  110:aload           8
	//   46  112:ldc2            #492 <String " seconds.">
	//   47  115:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   48  118:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   49  119:aload           7
	//   50  121:aload           8
	//   51  123:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   52  126:invokestatic    #137 <Method int AppboyLogger.d(String, String)>
	//   53  129:pop             
		handler.postDelayed(new Runnable(er1, fr1, l1) {

			public void run()
			{
				a.a(gf.a(d), gf.b(d), b, c);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field er a>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field gf d>
			//    4    8:invokestatic    #36  <Method Context gf.a(gf)>
			//    5   11:aload_0         
			//    6   12:getfield        #22  <Field gf d>
			//    7   15:invokestatic    #39  <Method ad gf.b(gf)>
			//    8   18:aload_0         
			//    9   19:getfield        #26  <Field fr b>
			//   10   22:aload_0         
			//   11   23:getfield        #28  <Field long c>
			//   12   26:invokeinterface #44  <Method void er.a(Context, ad, fr, long)>
			//   13   31:return          
			}

			final er a;
			final fr b;
			final long c;
			final gf d;

			
			{
				d = gf.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field gf d>
				a = er1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field er a>
				b = fr1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field fr b>
				c = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #28  <Field long c>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
, l * 1000);
	//   54  130:aload           6
	//   55  132:new             #10  <Class gf$2>
	//   56  135:dup             
	//   57  136:aload_0         
	//   58  137:aload_2         
	//   59  138:aload_1         
	//   60  139:lload           4
	//   61  141:invokespecial   #493 <Method void gf$2(gf, er, fr, long)>
	//   62  144:iload_3         
	//   63  145:sipush          1000
	//   64  148:imul            
	//   65  149:i2l             
	//   66  150:invokevirtual   #305 <Method boolean Handler.postDelayed(Runnable, long)>
	//   67  153:pop             
	//   68  154:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/gf);
	private final Context b;
	private final bt c;
	private final ad d;
	private final long e;
	private final SharedPreferences f;
	private final ga g;
	private final gd h;
	private Map i;
	private volatile long j;
	private final Object k = new Object();

	static 
	{
	//    0    0:ldc1            #2   <Class gf>
	//    1    2:invokestatic    #41  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #43  <Field String a>
	//*   3    8:return          
	}
}
