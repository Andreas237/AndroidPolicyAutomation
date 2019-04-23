// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.InAppMessageEvent;
import com.appboy.models.IInAppMessage;
import com.appboy.models.ResponseError;
import com.appboy.support.AppboyLogger;
import java.util.Map;
import org.json.JSONException;

// Referenced classes of package bo.app:
//			a, co, dr, v, 
//			bs, d, bl, dc, 
//			aa, dh, ah, ao, 
//			cu, ae, ac, ab

public final class cj
	implements Runnable
{

	public cj(co co1, a a1, d d1, aa aa1, aa aa2, dc dc1, bl bl1, 
			dh dh1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		b = co1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field co b>
		c = aa1;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #45  <Field aa c>
		d = aa2;
	//    8   15:aload_0         
	//    9   16:aload           5
	//   10   18:putfield        #47  <Field aa d>
		e = a1.a();
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #52  <Method Map a.a()>
	//   14   26:putfield        #54  <Field Map e>
		b.a(e);
	//   15   29:aload_0         
	//   16   30:getfield        #43  <Field co b>
	//   17   33:aload_0         
	//   18   34:getfield        #54  <Field Map e>
	//   19   37:invokeinterface #59  <Method void co.a(Map)>
		f = d1;
	//   20   42:aload_0         
	//   21   43:aload_3         
	//   22   44:putfield        #61  <Field d f>
		g = dc1;
	//   23   47:aload_0         
	//   24   48:aload           6
	//   25   50:putfield        #63  <Field dc g>
		i = bl1;
	//   26   53:aload_0         
	//   27   54:aload           7
	//   28   56:putfield        #65  <Field bl i>
		h = dh1;
	//   29   59:aload_0         
	//   30   60:aload           8
	//   31   62:putfield        #67  <Field dh h>
	//   32   65:return          
	}

	private bs a()
	{
		Object obj = ((Object) (dr.a(b.a())));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field co b>
	//    2    4:invokeinterface #71  <Method android.net.Uri co.a()>
	//    3    9:invokestatic    #76  <Method java.net.URI dr.a(android.net.Uri)>
	//    4   12:astore_1        
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[v.values().length];
			//    0    0:invokestatic    #18  <Method v[] v.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[v.a.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #23  <Field v v.a>
			//    6   15:invokevirtual   #27  <Method int v.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #30  <Field v v.b>
			//*  11   26:invokevirtual   #27  <Method int v.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					a[v.b.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1.a[b.i().ordinal()])
	//*   5   13:getstatic       #79  <Field int[] cj$1.a>
	//*   6   16:aload_0         
	//*   7   17:getfield        #43  <Field co b>
	//*   8   20:invokeinterface #82  <Method v co.i()>
	//*   9   25:invokevirtual   #88  <Method int v.ordinal()>
	//*  10   28:iaload          
		{
	//*  11   29:tableswitch     1 2: default 52
	//	               1 155
	//	               2 103
		default:
			obj = ((Object) (a));
	//   12   52:getstatic       #36  <Field String a>
	//   13   55:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   14   56:new             #90  <Class StringBuilder>
	//   15   59:dup             
	//   16   60:invokespecial   #91  <Method void StringBuilder()>
	//   17   63:astore_2        
			stringbuilder.append("Received a request with an unknown Http verb: [");
	//   18   64:aload_2         
	//   19   65:ldc1            #93  <String "Received a request with an unknown Http verb: [">
	//   20   67:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   21   70:pop             
			stringbuilder.append(((Object) (b.i())));
	//   22   71:aload_2         
	//   23   72:aload_0         
	//   24   73:getfield        #43  <Field co b>
	//   25   76:invokeinterface #82  <Method v co.i()>
	//   26   81:invokevirtual   #100 <Method StringBuilder StringBuilder.append(Object)>
	//   27   84:pop             
			stringbuilder.append("]");
	//   28   85:aload_2         
	//   29   86:ldc1            #102 <String "]">
	//   30   88:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   31   91:pop             
			AppboyLogger.w(((String) (obj)), stringbuilder.toString());
	//   32   92:aload_1         
	//   33   93:aload_2         
	//   34   94:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   35   97:invokestatic    #110 <Method int AppboyLogger.w(String, String)>
	//   36  100:pop             
			return null;
	//   37  101:aconst_null     
	//   38  102:areturn         

		case 2: // '\002'
			org.json.JSONObject jsonobject = b.g();
	//   39  103:aload_0         
	//   40  104:getfield        #43  <Field co b>
	//   41  107:invokeinterface #113 <Method org.json.JSONObject co.g()>
	//   42  112:astore_2        
			if(jsonobject == null)
	//*  43  113:aload_2         
	//*  44  114:ifnonnull       128
			{
				AppboyLogger.e(a, "Could not parse request parameters for put request to [%s], canceling request.");
	//   45  117:getstatic       #36  <Field String a>
	//   46  120:ldc1            #115 <String "Could not parse request parameters for put request to [%s], canceling request.">
	//   47  122:invokestatic    #117 <Method int AppboyLogger.e(String, String)>
	//   48  125:pop             
				return null;
	//   49  126:aconst_null     
	//   50  127:areturn         
			} else
			{
				return new bs(f.a(((java.net.URI) (obj)), e, jsonobject), i);
	//   51  128:new             #119 <Class bs>
	//   52  131:dup             
	//   53  132:aload_0         
	//   54  133:getfield        #61  <Field d f>
	//   55  136:aload_1         
	//   56  137:aload_0         
	//   57  138:getfield        #54  <Field Map e>
	//   58  141:aload_2         
	//   59  142:invokeinterface #124 <Method org.json.JSONObject d.a(java.net.URI, Map, org.json.JSONObject)>
	//   60  147:aload_0         
	//   61  148:getfield        #65  <Field bl i>
	//   62  151:invokespecial   #127 <Method void bs(org.json.JSONObject, bl)>
	//   63  154:areturn         
			}

		case 1: // '\001'
			return new bs(f.a(((java.net.URI) (obj)), e), i);
	//   64  155:new             #119 <Class bs>
	//   65  158:dup             
	//   66  159:aload_0         
	//   67  160:getfield        #61  <Field d f>
	//   68  163:aload_1         
	//   69  164:aload_0         
	//   70  165:getfield        #54  <Field Map e>
	//   71  168:invokeinterface #130 <Method org.json.JSONObject d.a(java.net.URI, Map)>
	//   72  173:aload_0         
	//   73  174:getfield        #65  <Field bl i>
	//   74  177:invokespecial   #127 <Method void bs(org.json.JSONObject, bl)>
	//   75  180:areturn         
		}
	}

	private void a(ResponseError responseerror)
	{
		String s = a;
	//    0    0:getstatic       #36  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #90  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #91  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Received server error from request: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #133 <String "Received server error from request: ">
	//    8   15:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(responseerror.getMessage());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #138 <Method String ResponseError.getMessage()>
	//   13   24:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		AppboyLogger.e(s, stringbuilder.toString());
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   18   33:invokestatic    #117 <Method int AppboyLogger.e(String, String)>
	//   19   36:pop             
	//   20   37:return          
	}

	void a(bs bs1)
	{
		if(!bs1.e())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #144 <Method boolean bs.e()>
	//*   2    4:ifne            24
		{
			b.a(d, bs1);
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field co b>
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field aa d>
	//    7   15:aload_1         
	//    8   16:invokeinterface #147 <Method void co.a(aa, bs)>
		} else
	//*   9   21:goto            49
		{
			a(bs1.l());
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:invokevirtual   #151 <Method ResponseError bs.l()>
	//   13   29:invokespecial   #153 <Method void a(ResponseError)>
			b.a(d, bs1.l());
	//   14   32:aload_0         
	//   15   33:getfield        #43  <Field co b>
	//   16   36:aload_0         
	//   17   37:getfield        #47  <Field aa d>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #151 <Method ResponseError bs.l()>
	//   20   44:invokeinterface #156 <Method void co.a(aa, ResponseError)>
		}
		b(bs1);
	//   21   49:aload_0         
	//   22   50:aload_1         
	//   23   51:invokevirtual   #158 <Method void b(bs)>
		b.a(c);
	//   24   54:aload_0         
	//   25   55:getfield        #43  <Field co b>
	//   26   58:aload_0         
	//   27   59:getfield        #45  <Field aa c>
	//   28   62:invokeinterface #161 <Method void co.a(aa)>
	//   29   67:return          
	}

	void b(bs bs1)
	{
		String s;
		s = i.e();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field bl i>
	//    2    4:invokeinterface #169 <Method String bl.e()>
	//    3    9:astore_2        
		if(!bs1.a())
			break MISSING_BLOCK_LABEL_58;
	//    4   10:aload_1         
	//    5   11:invokevirtual   #171 <Method boolean bs.a()>
	//    6   14:ifeq            58
		FeedUpdatedEvent feedupdatedevent = g.a(bs1.g(), s);
	//    7   17:aload_0         
	//    8   18:getfield        #63  <Field dc g>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #174 <Method org.json.JSONArray bs.g()>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #179 <Method FeedUpdatedEvent dc.a(org.json.JSONArray, String)>
	//   13   29:astore_3        
		if(feedupdatedevent != null)
	//*  14   30:aload_3         
	//*  15   31:ifnull          58
			try
			{
				d.a(((Object) (feedupdatedevent)), com/appboy/events/FeedUpdatedEvent);
	//   16   34:aload_0         
	//   17   35:getfield        #47  <Field aa d>
	//   18   38:aload_3         
	//   19   39:ldc1            #181 <Class FeedUpdatedEvent>
	//   20   41:invokeinterface #186 <Method void aa.a(Object, Class)>
			}
	//*  21   46:goto            58
	//*  22   49:getstatic       #36  <Field String a>
	//*  23   52:ldc1            #188 <String "Unable to update/publish feed.">
	//*  24   54:invokestatic    #110 <Method int AppboyLogger.w(String, String)>
	//*  25   57:pop             
	//*  26   58:aload_1         
	//*  27   59:invokevirtual   #190 <Method boolean bs.c()>
	//*  28   62:ifeq            98
	//*  29   65:aload_0         
	//*  30   66:getfield        #67  <Field dh h>
	//*  31   69:aload_1         
	//*  32   70:invokevirtual   #193 <Method bz bs.i()>
	//*  33   73:invokevirtual   #198 <Method void dh.a(bz)>
	//*  34   76:aload_0         
	//*  35   77:getfield        #45  <Field aa c>
	//*  36   80:new             #200 <Class ah>
	//*  37   83:dup             
	//*  38   84:aload_1         
	//*  39   85:invokevirtual   #193 <Method bz bs.i()>
	//*  40   88:invokespecial   #202 <Method void ah(bz)>
	//*  41   91:ldc1            #200 <Class ah>
	//*  42   93:invokeinterface #186 <Method void aa.a(Object, Class)>
	//*  43   98:aload_1         
	//*  44   99:invokevirtual   #204 <Method boolean bs.d()>
	//*  45  102:ifeq            127
	//*  46  105:aload_0         
	//*  47  106:getfield        #45  <Field aa c>
	//*  48  109:new             #206 <Class ao>
	//*  49  112:dup             
	//*  50  113:aload_1         
	//*  51  114:invokevirtual   #210 <Method java.util.List bs.j()>
	//*  52  117:invokespecial   #213 <Method void ao(java.util.List)>
	//*  53  120:ldc1            #206 <Class ao>
	//*  54  122:invokeinterface #186 <Method void aa.a(Object, Class)>
	//*  55  127:aload_1         
	//*  56  128:invokevirtual   #215 <Method boolean bs.b()>
	//*  57  131:ifeq            187
	//*  58  134:aload_0         
	//*  59  135:getfield        #43  <Field co b>
	//*  60  138:astore_3        
	//*  61  139:aload_3         
	//*  62  140:instanceof      #217 <Class cu>
	//*  63  143:ifeq            187
	//*  64  146:aload_3         
	//*  65  147:checkcast       #217 <Class cu>
	//*  66  150:astore_3        
	//*  67  151:aload_1         
	//*  68  152:invokevirtual   #220 <Method IInAppMessage bs.h()>
	//*  69  155:aload_3         
	//*  70  156:invokevirtual   #224 <Method long cu.k()>
	//*  71  159:invokeinterface #230 <Method void IInAppMessage.setExpirationTimestamp(long)>
	//*  72  164:aload_0         
	//*  73  165:getfield        #47  <Field aa d>
	//*  74  168:new             #232 <Class InAppMessageEvent>
	//*  75  171:dup             
	//*  76  172:aload_1         
	//*  77  173:invokevirtual   #220 <Method IInAppMessage bs.h()>
	//*  78  176:aload_2         
	//*  79  177:invokespecial   #235 <Method void InAppMessageEvent(IInAppMessage, String)>
	//*  80  180:ldc1            #232 <Class InAppMessageEvent>
	//*  81  182:invokeinterface #186 <Method void aa.a(Object, Class)>
	//*  82  187:aload_1         
	//*  83  188:invokevirtual   #237 <Method boolean bs.f()>
	//*  84  191:ifeq            216
	//*  85  194:aload_0         
	//*  86  195:getfield        #45  <Field aa c>
	//*  87  198:new             #239 <Class ae>
	//*  88  201:dup             
	//*  89  202:aload_1         
	//*  90  203:invokevirtual   #241 <Method java.util.List bs.k()>
	//*  91  206:invokespecial   #242 <Method void ae(java.util.List)>
	//*  92  209:ldc1            #239 <Class ae>
	//*  93  211:invokeinterface #186 <Method void aa.a(Object, Class)>
	//*  94  216:return          
			// Misplaced declaration of an exception variable
			catch(JSONException jsonexception)
			{
				AppboyLogger.w(a, "Unable to update/publish feed.");
			}
		JSONException jsonexception;
		if(bs1.c())
		{
			h.a(bs1.i());
			c.a(((Object) (new ah(bs1.i()))), bo/app/ah);
		}
		if(bs1.d())
			c.a(((Object) (new ao(bs1.j()))), bo/app/ao);
		if(bs1.b())
		{
			Object obj = ((Object) (b));
			if(obj instanceof cu)
			{
				obj = ((Object) ((cu)obj));
				bs1.h().setExpirationTimestamp(((cu) (obj)).k());
				d.a(((Object) (new InAppMessageEvent(bs1.h(), s))), com/appboy/events/InAppMessageEvent);
			}
		}
		if(bs1.f())
			c.a(((Object) (new ae(bs1.k()))), bo/app/ae);
		return;
	//*  95  217:astore_3        
	//*  96  218:goto            49
	}

	public void run()
	{
		bs bs1 = a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #247 <Method bs a()>
	//    2    4:astore_1        
		if(bs1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          37
		{
			try
			{
				a(bs1);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #249 <Method void a(bs)>
				c.a(((Object) (new ac(b))), bo/app/ac);
	//    8   14:aload_0         
	//    9   15:getfield        #45  <Field aa c>
	//   10   18:new             #251 <Class ac>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #43  <Field co b>
	//   14   26:invokespecial   #254 <Method void ac(co)>
	//   15   29:ldc1            #251 <Class ac>
	//   16   31:invokeinterface #186 <Method void aa.a(Object, Class)>
				return;
	//   17   36:return          
			}
	//*  18   37:getstatic       #36  <Field String a>
	//*  19   40:ldc2            #256 <String "Api response was null, failing task.">
	//*  20   43:invokestatic    #110 <Method int AppboyLogger.w(String, String)>
	//*  21   46:pop             
	//*  22   47:goto            62
			catch(Exception exception)
	//*  23   50:astore_1        
			{
				AppboyLogger.w(a, "Experienced exception processing API response. Failing task.", ((Throwable) (exception)));
	//   24   51:getstatic       #36  <Field String a>
	//   25   54:ldc2            #258 <String "Experienced exception processing API response. Failing task.">
	//   26   57:aload_1         
	//   27   58:invokestatic    #261 <Method int AppboyLogger.w(String, String, Throwable)>
	//   28   61:pop             
			}
			break MISSING_BLOCK_LABEL_62;
		}
		AppboyLogger.w(a, "Api response was null, failing task.");
		b.a(d, new ResponseError("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details."));
	//   29   62:aload_0         
	//   30   63:getfield        #43  <Field co b>
	//   31   66:aload_0         
	//   32   67:getfield        #47  <Field aa d>
	//   33   70:new             #135 <Class ResponseError>
	//   34   73:dup             
	//   35   74:ldc2            #263 <String "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.">
	//   36   77:invokespecial   #266 <Method void ResponseError(String)>
	//   37   80:invokeinterface #156 <Method void co.a(aa, ResponseError)>
		c.a(((Object) (new ab(b))), bo/app/ab);
	//   38   85:aload_0         
	//   39   86:getfield        #45  <Field aa c>
	//   40   89:new             #268 <Class ab>
	//   41   92:dup             
	//   42   93:aload_0         
	//   43   94:getfield        #43  <Field co b>
	//   44   97:invokespecial   #269 <Method void ab(co)>
	//   45  100:ldc2            #268 <Class ab>
	//   46  103:invokeinterface #186 <Method void aa.a(Object, Class)>
		return;
	//   47  108:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/cj);
	private final co b;
	private final aa c;
	private final aa d;
	private final Map e;
	private final d f;
	private final dc g;
	private final dh h;
	private final bl i;

	static 
	{
	//    0    0:ldc1            #2   <Class cj>
	//    1    2:invokestatic    #34  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #36  <Field String a>
	//*   3    8:return          
	}
}
