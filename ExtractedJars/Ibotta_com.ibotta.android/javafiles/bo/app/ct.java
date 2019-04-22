// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.HashSet;
import java.util.Set;
import org.json.*;

public class ct
{

	public ct()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		f = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #38  <Field int f>
		g = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #40  <Field int g>
		h = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #42  <Field int h>
		i = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #44  <Field boolean i>
		j = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #46  <Field boolean j>
		k = -1L;
	//   17   29:aload_0         
	//   18   30:ldc2w           #47  <Long -1L>
	//   19   33:putfield        #50  <Field long k>
		l = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #52  <Field boolean l>
	//   23   41:return          
	}

	public ct(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		f = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #38  <Field int f>
		g = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #40  <Field int g>
		h = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #42  <Field int h>
		i = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #44  <Field boolean i>
		j = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #46  <Field boolean j>
		k = -1L;
	//   17   29:aload_0         
	//   18   30:ldc2w           #47  <Long -1L>
	//   19   33:putfield        #50  <Field long k>
		l = false;
	//   20   36:aload_0         
	//   21   37:iconst_0        
	//   22   38:putfield        #52  <Field boolean l>
		c = a(jsonobject, "events_blacklist");
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:aload_1         
	//   26   44:ldc1            #57  <String "events_blacklist">
	//   27   46:invokespecial   #60  <Method Set a(JSONObject, String)>
	//   28   49:putfield        #62  <Field Set c>
		d = a(jsonobject, "attributes_blacklist");
	//   29   52:aload_0         
	//   30   53:aload_0         
	//   31   54:aload_1         
	//   32   55:ldc1            #64  <String "attributes_blacklist">
	//   33   57:invokespecial   #60  <Method Set a(JSONObject, String)>
	//   34   60:putfield        #66  <Field Set d>
		e = a(jsonobject, "purchases_blacklist");
	//   35   63:aload_0         
	//   36   64:aload_0         
	//   37   65:aload_1         
	//   38   66:ldc1            #68  <String "purchases_blacklist">
	//   39   68:invokespecial   #60  <Method Set a(JSONObject, String)>
	//   40   71:putfield        #70  <Field Set e>
		b = jsonobject.optLong("time", 0L);
	//   41   74:aload_0         
	//   42   75:aload_1         
	//   43   76:ldc1            #72  <String "time">
	//   44   78:lconst_0        
	//   45   79:invokevirtual   #78  <Method long JSONObject.optLong(String, long)>
	//   46   82:putfield        #80  <Field long b>
		k = jsonobject.optLong("messaging_session_timeout", -1L);
	//   47   85:aload_0         
	//   48   86:aload_1         
	//   49   87:ldc1            #82  <String "messaging_session_timeout">
	//   50   89:ldc2w           #47  <Long -1L>
	//   51   92:invokevirtual   #78  <Method long JSONObject.optLong(String, long)>
	//   52   95:putfield        #50  <Field long k>
		JSONObject jsonobject1 = jsonobject.optJSONObject("geofences");
	//   53   98:aload_1         
	//   54   99:ldc1            #84  <String "geofences">
	//   55  101:invokevirtual   #88  <Method JSONObject JSONObject.optJSONObject(String)>
	//   56  104:astore_2        
		if(jsonobject1 != null)
	//*  57  105:aload_2         
	//*  58  106:ifnull          195
			try
			{
				f = jsonobject1.getInt("min_time_since_last_request");
	//   59  109:aload_0         
	//   60  110:aload_2         
	//   61  111:ldc1            #90  <String "min_time_since_last_request">
	//   62  113:invokevirtual   #94  <Method int JSONObject.getInt(String)>
	//   63  116:putfield        #38  <Field int f>
				g = jsonobject1.getInt("min_time_since_last_report");
	//   64  119:aload_0         
	//   65  120:aload_2         
	//   66  121:ldc1            #96  <String "min_time_since_last_report">
	//   67  123:invokevirtual   #94  <Method int JSONObject.getInt(String)>
	//   68  126:putfield        #40  <Field int g>
				j = jsonobject1.getBoolean("enabled");
	//   69  129:aload_0         
	//   70  130:aload_2         
	//   71  131:ldc1            #98  <String "enabled">
	//   72  133:invokevirtual   #102 <Method boolean JSONObject.getBoolean(String)>
	//   73  136:putfield        #46  <Field boolean j>
				i = true;
	//   74  139:aload_0         
	//   75  140:iconst_1        
	//   76  141:putfield        #44  <Field boolean i>
				h = jsonobject1.optInt("max_num_to_register", 20);
	//   77  144:aload_0         
	//   78  145:aload_2         
	//   79  146:ldc1            #104 <String "max_num_to_register">
	//   80  148:bipush          20
	//   81  150:invokevirtual   #108 <Method int JSONObject.optInt(String, int)>
	//   82  153:putfield        #42  <Field int h>
			}
	//*  83  156:goto            195
			catch(JSONException jsonexception)
	//*  84  159:astore_2        
			{
				AppboyLogger.e(a, "Required geofence fields were null. Using defaults.", ((Throwable) (jsonexception)));
	//   85  160:getstatic       #32  <Field String a>
	//   86  163:ldc1            #110 <String "Required geofence fields were null. Using defaults.">
	//   87  165:aload_2         
	//   88  166:invokestatic    #113 <Method int AppboyLogger.e(String, String, Throwable)>
	//   89  169:pop             
				f = -1;
	//   90  170:aload_0         
	//   91  171:iconst_m1       
	//   92  172:putfield        #38  <Field int f>
				g = -1;
	//   93  175:aload_0         
	//   94  176:iconst_m1       
	//   95  177:putfield        #40  <Field int g>
				h = -1;
	//   96  180:aload_0         
	//   97  181:iconst_m1       
	//   98  182:putfield        #42  <Field int h>
				j = false;
	//   99  185:aload_0         
	//  100  186:iconst_0        
	//  101  187:putfield        #46  <Field boolean j>
				i = false;
	//  102  190:aload_0         
	//  103  191:iconst_0        
	//  104  192:putfield        #44  <Field boolean i>
			}
		jsonobject = jsonobject.optJSONObject("test_user");
	//  105  195:aload_1         
	//  106  196:ldc1            #115 <String "test_user">
	//  107  198:invokevirtual   #88  <Method JSONObject JSONObject.optJSONObject(String)>
	//  108  201:astore_1        
		if(jsonobject != null)
	//* 109  202:aload_1         
	//* 110  203:ifnull          233
		{
			try
			{
				l = jsonobject.getBoolean("device_logging_enabled");
	//  111  206:aload_0         
	//  112  207:aload_1         
	//  113  208:ldc1            #117 <String "device_logging_enabled">
	//  114  210:invokevirtual   #102 <Method boolean JSONObject.getBoolean(String)>
	//  115  213:putfield        #52  <Field boolean l>
				return;
	//  116  216:return          
			}
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//* 117  217:astore_1        
			{
				AppboyLogger.e(a, "Required test user fields were null. Using defaults", ((Throwable) (jsonobject)));
	//  118  218:getstatic       #32  <Field String a>
	//  119  221:ldc1            #119 <String "Required test user fields were null. Using defaults">
	//  120  223:aload_1         
	//  121  224:invokestatic    #113 <Method int AppboyLogger.e(String, String, Throwable)>
	//  122  227:pop             
			}
			l = false;
	//  123  228:aload_0         
	//  124  229:iconst_0        
	//  125  230:putfield        #52  <Field boolean l>
		}
	//  126  233:return          
	}

	private Set a(JSONObject jsonobject, String s)
	{
		if(jsonobject.optJSONArray(s) != null)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #123 <Method JSONArray JSONObject.optJSONArray(String)>
	//*   3    5:ifnull          56
		{
			HashSet hashset = new HashSet();
	//    4    8:new             #125 <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #126 <Method void HashSet()>
	//    7   15:astore          4
			jsonobject = ((JSONObject) (jsonobject.optJSONArray(s)));
	//    8   17:aload_1         
	//    9   18:aload_2         
	//   10   19:invokevirtual   #123 <Method JSONArray JSONObject.optJSONArray(String)>
	//   11   22:astore_1        
			for(int i1 = 0; i1 < ((JSONArray) (jsonobject)).length(); i1++)
	//*  12   23:iconst_0        
	//*  13   24:istore_3        
	//*  14   25:iload_3         
	//*  15   26:aload_1         
	//*  16   27:invokevirtual   #132 <Method int JSONArray.length()>
	//*  17   30:icmpge          53
				((Set) (hashset)).add(((Object) (((JSONArray) (jsonobject)).getString(i1))));
	//   18   33:aload           4
	//   19   35:aload_1         
	//   20   36:iload_3         
	//   21   37:invokevirtual   #136 <Method String JSONArray.getString(int)>
	//   22   40:invokeinterface #142 <Method boolean Set.add(Object)>
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
	//    1    1:getfield        #80  <Field long b>
	//    2    4:lreturn         
	}

	public void a(int i1)
	{
		f = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int f>
	//    3    5:return          
	}

	public void a(long l1)
	{
		b = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #80  <Field long b>
	//    3    5:return          
	}

	public void a(Set set)
	{
		c = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field Set c>
	//    3    5:return          
	}

	public void a(boolean flag)
	{
		j = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field boolean j>
	//    3    5:return          
	}

	public Set b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Set c>
	//    2    4:areturn         
	}

	public void b(int i1)
	{
		g = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field int g>
	//    3    5:return          
	}

	public void b(long l1)
	{
		k = l1;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #50  <Field long k>
	//    3    5:return          
	}

	public void b(Set set)
	{
		d = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field Set d>
	//    3    5:return          
	}

	public void b(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field boolean i>
	//    3    5:return          
	}

	public Set c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Set d>
	//    2    4:areturn         
	}

	public void c(int i1)
	{
		h = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int h>
	//    3    5:return          
	}

	public void c(Set set)
	{
		e = set;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field Set e>
	//    3    5:return          
	}

	public void c(boolean flag)
	{
		l = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean l>
	//    3    5:return          
	}

	public Set d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Set e>
	//    2    4:areturn         
	}

	public long e()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long k>
	//    2    4:lreturn         
	}

	public int f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int f>
	//    2    4:ireturn         
	}

	public int g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int g>
	//    2    4:ireturn         
	}

	public int h()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int h>
	//    2    4:ireturn         
	}

	public boolean i()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean j>
	//    2    4:ireturn         
	}

	public boolean j()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean i>
	//    2    4:ireturn         
	}

	public boolean k()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean l>
	//    2    4:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ct);
	private long b;
	private Set c;
	private Set d;
	private Set e;
	private int f;
	private int g;
	private int h;
	private boolean i;
	private boolean j;
	private long k;
	private boolean l;

	static 
	{
	//    0    0:ldc1            #2   <Class ct>
	//    1    2:invokestatic    #30  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #32  <Field String a>
	//*   3    8:return          
	}
}
