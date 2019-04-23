// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.HashSet;
import java.util.Set;
import org.json.*;

public class bz
{

	public bz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		f = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #43  <Field boolean f>
		g = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #45  <Field boolean g>
		h = -1L;
	//    8   14:aload_0         
	//    9   15:ldc2w           #46  <Long -1L>
	//   10   18:putfield        #49  <Field long h>
		i = -1F;
	//   11   21:aload_0         
	//   12   22:ldc1            #50  <Float -1F>
	//   13   24:putfield        #52  <Field float i>
		j = -1;
	//   14   27:aload_0         
	//   15   28:iconst_m1       
	//   16   29:putfield        #54  <Field int j>
		k = -1;
	//   17   32:aload_0         
	//   18   33:iconst_m1       
	//   19   34:putfield        #56  <Field int k>
		l = -1;
	//   20   37:aload_0         
	//   21   38:iconst_m1       
	//   22   39:putfield        #58  <Field int l>
		m = false;
	//   23   42:aload_0         
	//   24   43:iconst_0        
	//   25   44:putfield        #60  <Field boolean m>
		n = false;
	//   26   47:aload_0         
	//   27   48:iconst_0        
	//   28   49:putfield        #62  <Field boolean n>
		o = -1L;
	//   29   52:aload_0         
	//   30   53:ldc2w           #46  <Long -1L>
	//   31   56:putfield        #64  <Field long o>
		p = false;
	//   32   59:aload_0         
	//   33   60:iconst_0        
	//   34   61:putfield        #66  <Field boolean p>
	//   35   64:return          
	}

	public bz(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		f = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #43  <Field boolean f>
		g = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #45  <Field boolean g>
		h = -1L;
	//    8   14:aload_0         
	//    9   15:ldc2w           #46  <Long -1L>
	//   10   18:putfield        #49  <Field long h>
		i = -1F;
	//   11   21:aload_0         
	//   12   22:ldc1            #50  <Float -1F>
	//   13   24:putfield        #52  <Field float i>
		j = -1;
	//   14   27:aload_0         
	//   15   28:iconst_m1       
	//   16   29:putfield        #54  <Field int j>
		k = -1;
	//   17   32:aload_0         
	//   18   33:iconst_m1       
	//   19   34:putfield        #56  <Field int k>
		l = -1;
	//   20   37:aload_0         
	//   21   38:iconst_m1       
	//   22   39:putfield        #58  <Field int l>
		m = false;
	//   23   42:aload_0         
	//   24   43:iconst_0        
	//   25   44:putfield        #60  <Field boolean m>
		n = false;
	//   26   47:aload_0         
	//   27   48:iconst_0        
	//   28   49:putfield        #62  <Field boolean n>
		o = -1L;
	//   29   52:aload_0         
	//   30   53:ldc2w           #46  <Long -1L>
	//   31   56:putfield        #64  <Field long o>
		p = false;
	//   32   59:aload_0         
	//   33   60:iconst_0        
	//   34   61:putfield        #66  <Field boolean p>
		c = a(jsonobject, "events_blacklist");
	//   35   64:aload_0         
	//   36   65:aload_0         
	//   37   66:aload_1         
	//   38   67:ldc1            #71  <String "events_blacklist">
	//   39   69:invokespecial   #74  <Method Set a(JSONObject, String)>
	//   40   72:putfield        #76  <Field Set c>
		d = a(jsonobject, "attributes_blacklist");
	//   41   75:aload_0         
	//   42   76:aload_0         
	//   43   77:aload_1         
	//   44   78:ldc1            #78  <String "attributes_blacklist">
	//   45   80:invokespecial   #74  <Method Set a(JSONObject, String)>
	//   46   83:putfield        #80  <Field Set d>
		e = a(jsonobject, "purchases_blacklist");
	//   47   86:aload_0         
	//   48   87:aload_0         
	//   49   88:aload_1         
	//   50   89:ldc1            #82  <String "purchases_blacklist">
	//   51   91:invokespecial   #74  <Method Set a(JSONObject, String)>
	//   52   94:putfield        #84  <Field Set e>
		b = jsonobject.optLong("time", 0L);
	//   53   97:aload_0         
	//   54   98:aload_1         
	//   55   99:ldc1            #86  <String "time">
	//   56  101:lconst_0        
	//   57  102:invokevirtual   #92  <Method long JSONObject.optLong(String, long)>
	//   58  105:putfield        #94  <Field long b>
		o = jsonobject.optLong("messaging_session_timeout", -1L);
	//   59  108:aload_0         
	//   60  109:aload_1         
	//   61  110:ldc1            #96  <String "messaging_session_timeout">
	//   62  112:ldc2w           #46  <Long -1L>
	//   63  115:invokevirtual   #92  <Method long JSONObject.optLong(String, long)>
	//   64  118:putfield        #64  <Field long o>
		JSONObject jsonobject1 = jsonobject.optJSONObject("location");
	//   65  121:aload_1         
	//   66  122:ldc1            #98  <String "location">
	//   67  124:invokevirtual   #102 <Method JSONObject JSONObject.optJSONObject(String)>
	//   68  127:astore          4
		if(jsonobject1 != null)
	//*  69  129:aload           4
	//*  70  131:ifnull          212
		{
			try
			{
				g = jsonobject1.getBoolean("enabled");
	//   71  134:aload_0         
	//   72  135:aload           4
	//   73  137:ldc1            #104 <String "enabled">
	//   74  139:invokevirtual   #108 <Method boolean JSONObject.getBoolean(String)>
	//   75  142:putfield        #45  <Field boolean g>
				f = true;
	//   76  145:aload_0         
	//   77  146:iconst_1        
	//   78  147:putfield        #43  <Field boolean f>
			}
	//*  79  150:goto            171
			catch(JSONException jsonexception1)
	//*  80  153:astore          5
			{
				AppboyLogger.e(a, "Required location collection fields were null. Using defaults.", ((Throwable) (jsonexception1)));
	//   81  155:getstatic       #37  <Field String a>
	//   82  158:ldc1            #110 <String "Required location collection fields were null. Using defaults.">
	//   83  160:aload           5
	//   84  162:invokestatic    #113 <Method int AppboyLogger.e(String, String, Throwable)>
	//   85  165:pop             
				f = false;
	//   86  166:aload_0         
	//   87  167:iconst_0        
	//   88  168:putfield        #43  <Field boolean f>
			}
			long l1 = jsonobject1.optLong("time", -1L);
	//   89  171:aload           4
	//   90  173:ldc1            #86  <String "time">
	//   91  175:ldc2w           #46  <Long -1L>
	//   92  178:invokevirtual   #92  <Method long JSONObject.optLong(String, long)>
	//   93  181:lstore_2        
			if(l1 >= 0L)
	//*  94  182:lload_2         
	//*  95  183:lconst_0        
	//*  96  184:lcmp            
	//*  97  185:iflt            197
				h = l1 * 1000L;
	//   98  188:aload_0         
	//   99  189:lload_2         
	//  100  190:ldc2w           #114 <Long 1000L>
	//  101  193:lmul            
	//  102  194:putfield        #49  <Field long h>
			i = (float)jsonobject1.optDouble("distance", -1D);
	//  103  197:aload_0         
	//  104  198:aload           4
	//  105  200:ldc1            #117 <String "distance">
	//  106  202:ldc2w           #118 <Double -1D>
	//  107  205:invokevirtual   #123 <Method double JSONObject.optDouble(String, double)>
	//  108  208:d2f             
	//  109  209:putfield        #52  <Field float i>
		}
		jsonobject1 = jsonobject.optJSONObject("geofences");
	//  110  212:aload_1         
	//  111  213:ldc1            #125 <String "geofences">
	//  112  215:invokevirtual   #102 <Method JSONObject JSONObject.optJSONObject(String)>
	//  113  218:astore          4
		if(jsonobject1 != null)
	//* 114  220:aload           4
	//* 115  222:ifnull          317
			try
			{
				j = jsonobject1.getInt("min_time_since_last_request");
	//  116  225:aload_0         
	//  117  226:aload           4
	//  118  228:ldc1            #127 <String "min_time_since_last_request">
	//  119  230:invokevirtual   #131 <Method int JSONObject.getInt(String)>
	//  120  233:putfield        #54  <Field int j>
				k = jsonobject1.getInt("min_time_since_last_report");
	//  121  236:aload_0         
	//  122  237:aload           4
	//  123  239:ldc1            #133 <String "min_time_since_last_report">
	//  124  241:invokevirtual   #131 <Method int JSONObject.getInt(String)>
	//  125  244:putfield        #56  <Field int k>
				n = jsonobject1.getBoolean("enabled");
	//  126  247:aload_0         
	//  127  248:aload           4
	//  128  250:ldc1            #104 <String "enabled">
	//  129  252:invokevirtual   #108 <Method boolean JSONObject.getBoolean(String)>
	//  130  255:putfield        #62  <Field boolean n>
				m = true;
	//  131  258:aload_0         
	//  132  259:iconst_1        
	//  133  260:putfield        #60  <Field boolean m>
				l = jsonobject1.optInt("max_num_to_register", 20);
	//  134  263:aload_0         
	//  135  264:aload           4
	//  136  266:ldc1            #135 <String "max_num_to_register">
	//  137  268:bipush          20
	//  138  270:invokevirtual   #139 <Method int JSONObject.optInt(String, int)>
	//  139  273:putfield        #58  <Field int l>
			}
	//* 140  276:goto            317
			catch(JSONException jsonexception)
	//* 141  279:astore          4
			{
				AppboyLogger.e(a, "Required geofence fields were null. Using defaults.", ((Throwable) (jsonexception)));
	//  142  281:getstatic       #37  <Field String a>
	//  143  284:ldc1            #141 <String "Required geofence fields were null. Using defaults.">
	//  144  286:aload           4
	//  145  288:invokestatic    #113 <Method int AppboyLogger.e(String, String, Throwable)>
	//  146  291:pop             
				j = -1;
	//  147  292:aload_0         
	//  148  293:iconst_m1       
	//  149  294:putfield        #54  <Field int j>
				k = -1;
	//  150  297:aload_0         
	//  151  298:iconst_m1       
	//  152  299:putfield        #56  <Field int k>
				l = -1;
	//  153  302:aload_0         
	//  154  303:iconst_m1       
	//  155  304:putfield        #58  <Field int l>
				n = false;
	//  156  307:aload_0         
	//  157  308:iconst_0        
	//  158  309:putfield        #62  <Field boolean n>
				m = false;
	//  159  312:aload_0         
	//  160  313:iconst_0        
	//  161  314:putfield        #60  <Field boolean m>
			}
		jsonobject = jsonobject.optJSONObject("test_user");
	//  162  317:aload_1         
	//  163  318:ldc1            #143 <String "test_user">
	//  164  320:invokevirtual   #102 <Method JSONObject JSONObject.optJSONObject(String)>
	//  165  323:astore_1        
		if(jsonobject != null)
	//* 166  324:aload_1         
	//* 167  325:ifnull          355
		{
			try
			{
				p = jsonobject.getBoolean("device_logging_enabled");
	//  168  328:aload_0         
	//  169  329:aload_1         
	//  170  330:ldc1            #145 <String "device_logging_enabled">
	//  171  332:invokevirtual   #108 <Method boolean JSONObject.getBoolean(String)>
	//  172  335:putfield        #66  <Field boolean p>
				return;
	//  173  338:return          
			}
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//* 174  339:astore_1        
			{
				AppboyLogger.e(a, "Required test user fields were null. Using defaults", ((Throwable) (jsonobject)));
	//  175  340:getstatic       #37  <Field String a>
	//  176  343:ldc1            #147 <String "Required test user fields were null. Using defaults">
	//  177  345:aload_1         
	//  178  346:invokestatic    #113 <Method int AppboyLogger.e(String, String, Throwable)>
	//  179  349:pop             
			}
			p = false;
	//  180  350:aload_0         
	//  181  351:iconst_0        
	//  182  352:putfield        #66  <Field boolean p>
		}
	//  183  355:return          
	}

	private Set a(JSONObject jsonobject, String s)
	{
		if(jsonobject.optJSONArray(s) != null)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #151 <Method JSONArray JSONObject.optJSONArray(String)>
	//*   3    5:ifnull          56
		{
			HashSet hashset = new HashSet();
	//    4    8:new             #153 <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #154 <Method void HashSet()>
	//    7   15:astore          4
			jsonobject = ((JSONObject) (jsonobject.optJSONArray(s)));
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:invokevirtual   #151 <Method JSONArray JSONObject.optJSONArray(String)>
	//   11   22:astore_1        
			for(int i1 = 0; i1 < ((JSONArray) (jsonobject)).length(); i1++)
	//*  12   23:iconst_0        
	//*  13   24:istore_3        
	//*  14   25:iload_3         
	//*  15   26:aload_1         
	//*  16   27:invokevirtual   #160 <Method int JSONArray.length()>
	//*  17   30:icmpge          53
				((Set) (hashset)).add(((Object) (((JSONArray) (jsonobject)).getString(i1))));
	//   18   33:aload           4
	//   19   35:aload_1         
	//   20   36:iload_3         
	//   21   37:invokevirtual   #164 <Method String JSONArray.getString(int)>
	//   22   40:invokeinterface #170 <Method boolean Set.add(Object)>
	//   23   45:pop             

	//   24   46:iload_3         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_3        
	//*  28   50:goto            25
			return ((Set) (hashset));
	//   29   53:aload           4
	//   30   55:areturn         
		} else
		{
			return null;
	//   31   56:aconst_null     
	//   32   57:areturn         
		}
	}

	public long a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field long b>
	//    2    4:lreturn         
	}

	public void a(float f1)
	{
		i = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #52  <Field float i>
	//    3    5:return          
	}

	public void a(int i1)
	{
		j = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #54  <Field int j>
	//    3    5:return          
	}

	public void a(long l1)
	{
		b = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #94  <Field long b>
	//    3    5:return          
	}

	public void a(Set set)
	{
		c = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field Set c>
	//    3    5:return          
	}

	public void a(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field boolean g>
	//    3    5:return          
	}

	public Set b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Set c>
	//    2    4:areturn         
	}

	public void b(int i1)
	{
		k = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int k>
	//    3    5:return          
	}

	public void b(long l1)
	{
		h = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #49  <Field long h>
	//    3    5:return          
	}

	public void b(Set set)
	{
		d = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field Set d>
	//    3    5:return          
	}

	public void b(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field boolean f>
	//    3    5:return          
	}

	public Set c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Set d>
	//    2    4:areturn         
	}

	public void c(int i1)
	{
		l = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #58  <Field int l>
	//    3    5:return          
	}

	public void c(long l1)
	{
		o = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #64  <Field long o>
	//    3    5:return          
	}

	public void c(Set set)
	{
		e = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Set e>
	//    3    5:return          
	}

	public void c(boolean flag)
	{
		n = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean n>
	//    3    5:return          
	}

	public Set d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Set e>
	//    2    4:areturn         
	}

	public void d(boolean flag)
	{
		m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field boolean m>
	//    3    5:return          
	}

	public long e()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field long o>
	//    2    4:lreturn         
	}

	public void e(boolean flag)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field boolean p>
	//    3    5:return          
	}

	public boolean f()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean g>
	//    2    4:ireturn         
	}

	public boolean g()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean f>
	//    2    4:ireturn         
	}

	public long h()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long h>
	//    2    4:lreturn         
	}

	public float i()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field float i>
	//    2    4:freturn         
	}

	public int j()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int j>
	//    2    4:ireturn         
	}

	public int k()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int k>
	//    2    4:ireturn         
	}

	public int l()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int l>
	//    2    4:ireturn         
	}

	public boolean m()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean n>
	//    2    4:ireturn         
	}

	public boolean n()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean m>
	//    2    4:ireturn         
	}

	public boolean o()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean p>
	//    2    4:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/bz);
	private long b;
	private Set c;
	private Set d;
	private Set e;
	private boolean f;
	private boolean g;
	private long h;
	private float i;
	private int j;
	private int k;
	private int l;
	private boolean m;
	private boolean n;
	private long o;
	private boolean p;

	static 
	{
	//    0    0:ldc1            #2   <Class bz>
	//    1    2:invokestatic    #35  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #37  <Field String a>
	//*   3    8:return          
	}
}
