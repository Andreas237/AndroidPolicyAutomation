// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;
import java.util.Map;
import org.json.JSONException;

// Referenced classes of package bo.app:
//			d, db, ei, y, 
//			cp, g, cr, bt, 
//			dr, ad, dn, dx, 
//			an, av, dh, ak, 
//			aj, ah, af, aw, 
//			ag, cs, ae

public final class cv
	implements Runnable
{

	public cv(db db1, d d1, g g1, ad ad1, ad ad2, dr dr1, bt bt1, 
			dx dx1, dn dn1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		b = db1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field db b>
		c = ad1;
	//    5    9:aload_0         
	//    6   10:aload           4
	//    7   12:putfield        #47  <Field ad c>
		d = ad2;
	//    8   15:aload_0         
	//    9   16:aload           5
	//   10   18:putfield        #49  <Field ad d>
		e = d1.a();
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #54  <Method Map d.a()>
	//   14   26:putfield        #56  <Field Map e>
		b.a(e);
	//   15   29:aload_0         
	//   16   30:getfield        #45  <Field db b>
	//   17   33:aload_0         
	//   18   34:getfield        #56  <Field Map e>
	//   19   37:invokeinterface #61  <Method void db.a(Map)>
		f = g1;
	//   20   42:aload_0         
	//   21   43:aload_3         
	//   22   44:putfield        #63  <Field g f>
		g = dr1;
	//   23   47:aload_0         
	//   24   48:aload           6
	//   25   50:putfield        #65  <Field dr g>
		j = bt1;
	//   26   53:aload_0         
	//   27   54:aload           7
	//   28   56:putfield        #67  <Field bt j>
		h = dx1;
	//   29   59:aload_0         
	//   30   60:aload           8
	//   31   62:putfield        #69  <Field dx h>
		i = dn1;
	//   32   65:aload_0         
	//   33   66:aload           9
	//   34   68:putfield        #71  <Field dn i>
	//   35   71:return          
	}

	private cp a()
	{
		Object obj = ((Object) (ei.a(b.a())));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field db b>
	//    2    4:invokeinterface #75  <Method android.net.Uri db.a()>
	//    3    9:invokestatic    #80  <Method java.net.URI ei.a(android.net.Uri)>
	//    4   12:astore_1        
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[y.values().length];
			//    0    0:invokestatic    #18  <Method y[] y.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[y.a.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #23  <Field y y.a>
			//    6   15:invokevirtual   #27  <Method int y.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #30  <Field y y.b>
			//*  11   26:invokevirtual   #27  <Method int y.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					a[y.b.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1.a[b.i().ordinal()])
	//*   5   13:getstatic       #83  <Field int[] cv$1.a>
	//*   6   16:aload_0         
	//*   7   17:getfield        #45  <Field db b>
	//*   8   20:invokeinterface #86  <Method y db.i()>
	//*   9   25:invokevirtual   #92  <Method int y.ordinal()>
	//*  10   28:iaload          
		{
	//*  11   29:tableswitch     1 2: default 52
	//	               1 159
	//	               2 103
		default:
			obj = ((Object) (a));
	//   12   52:getstatic       #38  <Field String a>
	//   13   55:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   14   56:new             #94  <Class StringBuilder>
	//   15   59:dup             
	//   16   60:invokespecial   #95  <Method void StringBuilder()>
	//   17   63:astore_2        
			stringbuilder.append("Received a request with an unknown Http verb: [");
	//   18   64:aload_2         
	//   19   65:ldc1            #97  <String "Received a request with an unknown Http verb: [">
	//   20   67:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   21   70:pop             
			stringbuilder.append(((Object) (b.i())));
	//   22   71:aload_2         
	//   23   72:aload_0         
	//   24   73:getfield        #45  <Field db b>
	//   25   76:invokeinterface #86  <Method y db.i()>
	//   26   81:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//   27   84:pop             
			stringbuilder.append("]");
	//   28   85:aload_2         
	//   29   86:ldc1            #106 <String "]">
	//   30   88:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   31   91:pop             
			AppboyLogger.w(((String) (obj)), stringbuilder.toString());
	//   32   92:aload_1         
	//   33   93:aload_2         
	//   34   94:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   35   97:invokestatic    #114 <Method int AppboyLogger.w(String, String)>
	//   36  100:pop             
			return null;
	//   37  101:aconst_null     
	//   38  102:areturn         

		case 2: // '\002'
			org.json.JSONObject jsonobject = b.g();
	//   39  103:aload_0         
	//   40  104:getfield        #45  <Field db b>
	//   41  107:invokeinterface #117 <Method org.json.JSONObject db.g()>
	//   42  112:astore_2        
			if(jsonobject == null)
	//*  43  113:aload_2         
	//*  44  114:ifnonnull       128
			{
				AppboyLogger.e(a, "Could not parse request parameters for put request to [%s], canceling request.");
	//   45  117:getstatic       #38  <Field String a>
	//   46  120:ldc1            #119 <String "Could not parse request parameters for put request to [%s], canceling request.">
	//   47  122:invokestatic    #121 <Method int AppboyLogger.e(String, String)>
	//   48  125:pop             
				return null;
	//   49  126:aconst_null     
	//   50  127:areturn         
			} else
			{
				return new cp(f.a(((java.net.URI) (obj)), e, jsonobject), b, j);
	//   51  128:new             #123 <Class cp>
	//   52  131:dup             
	//   53  132:aload_0         
	//   54  133:getfield        #63  <Field g f>
	//   55  136:aload_1         
	//   56  137:aload_0         
	//   57  138:getfield        #56  <Field Map e>
	//   58  141:aload_2         
	//   59  142:invokeinterface #128 <Method org.json.JSONObject g.a(java.net.URI, Map, org.json.JSONObject)>
	//   60  147:aload_0         
	//   61  148:getfield        #45  <Field db b>
	//   62  151:aload_0         
	//   63  152:getfield        #67  <Field bt j>
	//   64  155:invokespecial   #131 <Method void cp(org.json.JSONObject, db, bt)>
	//   65  158:areturn         
			}

		case 1: // '\001'
			return new cp(f.a(((java.net.URI) (obj)), e), b, j);
	//   66  159:new             #123 <Class cp>
	//   67  162:dup             
	//   68  163:aload_0         
	//   69  164:getfield        #63  <Field g f>
	//   70  167:aload_1         
	//   71  168:aload_0         
	//   72  169:getfield        #56  <Field Map e>
	//   73  172:invokeinterface #134 <Method org.json.JSONObject g.a(java.net.URI, Map)>
	//   74  177:aload_0         
	//   75  178:getfield        #45  <Field db b>
	//   76  181:aload_0         
	//   77  182:getfield        #67  <Field bt j>
	//   78  185:invokespecial   #131 <Method void cp(org.json.JSONObject, db, bt)>
	//   79  188:areturn         
		}
	}

	private void a(cr cr1)
	{
		String s = a;
	//    0    0:getstatic       #38  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #94  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #95  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Received server error from request: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #137 <String "Received server error from request: ">
	//    8   15:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(cr1.a());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokeinterface #141 <Method String cr.a()>
	//   13   26:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		AppboyLogger.e(s, stringbuilder.toString());
	//   15   30:aload_2         
	//   16   31:aload_3         
	//   17   32:invokevirtual   #110 <Method String StringBuilder.toString()>
	//   18   35:invokestatic    #121 <Method int AppboyLogger.e(String, String)>
	//   19   38:pop             
	//   20   39:return          
	}

	void a(cp cp1)
	{
		if(!cp1.e())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #147 <Method boolean cp.e()>
	//*   2    4:ifne            24
		{
			b.a(d, cp1);
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field db b>
	//    5   11:aload_0         
	//    6   12:getfield        #49  <Field ad d>
	//    7   15:aload_1         
	//    8   16:invokeinterface #150 <Method void db.a(ad, cp)>
		} else
	//*   9   21:goto            53
		{
			a(cp1.n());
	//   10   24:aload_0         
	//   11   25:aload_1         
	//   12   26:invokevirtual   #154 <Method cr cp.n()>
	//   13   29:invokespecial   #156 <Method void a(cr)>
			b.a(c, d, cp1.n());
	//   14   32:aload_0         
	//   15   33:getfield        #45  <Field db b>
	//   16   36:aload_0         
	//   17   37:getfield        #47  <Field ad c>
	//   18   40:aload_0         
	//   19   41:getfield        #49  <Field ad d>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #154 <Method cr cp.n()>
	//   22   48:invokeinterface #159 <Method void db.a(ad, ad, cr)>
		}
		b(cp1);
	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:invokevirtual   #161 <Method void b(cp)>
		b.a(c);
	//   26   58:aload_0         
	//   27   59:getfield        #45  <Field db b>
	//   28   62:aload_0         
	//   29   63:getfield        #47  <Field ad c>
	//   30   66:invokeinterface #164 <Method void db.a(ad)>
	//   31   71:return          
	}

	void b(cp cp1)
	{
		String s;
		s = j.e();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field bt j>
	//    2    4:invokeinterface #172 <Method String bt.e()>
	//    3    9:astore_2        
		if(!cp1.a())
			break MISSING_BLOCK_LABEL_58;
	//    4   10:aload_1         
	//    5   11:invokevirtual   #174 <Method boolean cp.a()>
	//    6   14:ifeq            58
		Object obj = ((Object) (g.a(cp1.h(), s)));
	//    7   17:aload_0         
	//    8   18:getfield        #65  <Field dr g>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #177 <Method org.json.JSONArray cp.h()>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #182 <Method FeedUpdatedEvent dr.a(org.json.JSONArray, String)>
	//   13   29:astore_3        
		if(obj != null)
	//*  14   30:aload_3         
	//*  15   31:ifnull          58
			try
			{
				d.a(obj, com/appboy/events/FeedUpdatedEvent);
	//   16   34:aload_0         
	//   17   35:getfield        #49  <Field ad d>
	//   18   38:aload_3         
	//   19   39:ldc1            #184 <Class FeedUpdatedEvent>
	//   20   41:invokeinterface #189 <Method void ad.a(Object, Class)>
			}
	//*  21   46:goto            58
	//*  22   49:getstatic       #38  <Field String a>
	//*  23   52:ldc1            #191 <String "Unable to update/publish feed.">
	//*  24   54:invokestatic    #114 <Method int AppboyLogger.w(String, String)>
	//*  25   57:pop             
	//*  26   58:aload_1         
	//*  27   59:invokevirtual   #193 <Method boolean cp.g()>
	//*  28   62:ifeq            108
	//*  29   65:aload_0         
	//*  30   66:getfield        #71  <Field dn i>
	//*  31   69:aload_1         
	//*  32   70:invokevirtual   #197 <Method cq cp.m()>
	//*  33   73:aload_2         
	//*  34   74:invokevirtual   #202 <Method ContentCardsUpdatedEvent dn.a(cq, String)>
	//*  35   77:astore_3        
	//*  36   78:aload_3         
	//*  37   79:ifnull          108
	//*  38   82:aload_0         
	//*  39   83:getfield        #49  <Field ad d>
	//*  40   86:aload_3         
	//*  41   87:ldc1            #204 <Class ContentCardsUpdatedEvent>
	//*  42   89:invokeinterface #189 <Method void ad.a(Object, Class)>
	//*  43   94:goto            108
	//*  44   97:astore_3        
	//*  45   98:getstatic       #38  <Field String a>
	//*  46  101:ldc1            #206 <String "Encountered JSON exception while parsing Content Cards update. Unable to publish Content Cards update event.">
	//*  47  103:aload_3         
	//*  48  104:invokestatic    #209 <Method int AppboyLogger.e(String, String, Throwable)>
	//*  49  107:pop             
	//*  50  108:aload_1         
	//*  51  109:invokevirtual   #211 <Method boolean cp.c()>
	//*  52  112:ifeq            148
	//*  53  115:aload_0         
	//*  54  116:getfield        #69  <Field dx h>
	//*  55  119:aload_1         
	//*  56  120:invokevirtual   #214 <Method ct cp.j()>
	//*  57  123:invokevirtual   #219 <Method void dx.a(ct)>
	//*  58  126:aload_0         
	//*  59  127:getfield        #47  <Field ad c>
	//*  60  130:new             #221 <Class an>
	//*  61  133:dup             
	//*  62  134:aload_1         
	//*  63  135:invokevirtual   #214 <Method ct cp.j()>
	//*  64  138:invokespecial   #223 <Method void an(ct)>
	//*  65  141:ldc1            #221 <Class an>
	//*  66  143:invokeinterface #189 <Method void ad.a(Object, Class)>
	//*  67  148:aload_1         
	//*  68  149:invokevirtual   #225 <Method boolean cp.d()>
	//*  69  152:ifeq            177
	//*  70  155:aload_0         
	//*  71  156:getfield        #47  <Field ad c>
	//*  72  159:new             #227 <Class av>
	//*  73  162:dup             
	//*  74  163:aload_1         
	//*  75  164:invokevirtual   #231 <Method java.util.List cp.k()>
	//*  76  167:invokespecial   #234 <Method void av(java.util.List)>
	//*  77  170:ldc1            #227 <Class av>
	//*  78  172:invokeinterface #189 <Method void ad.a(Object, Class)>
	//*  79  177:aload_1         
	//*  80  178:invokevirtual   #236 <Method boolean cp.b()>
	//*  81  181:ifeq            248
	//*  82  184:aload_0         
	//*  83  185:getfield        #45  <Field db b>
	//*  84  188:astore_3        
	//*  85  189:aload_3         
	//*  86  190:instanceof      #238 <Class dh>
	//*  87  193:ifeq            248
	//*  88  196:aload_3         
	//*  89  197:checkcast       #238 <Class dh>
	//*  90  200:astore          4
	//*  91  202:aload_1         
	//*  92  203:invokevirtual   #241 <Method IInAppMessage cp.i()>
	//*  93  206:astore_3        
	//*  94  207:aload_3         
	//*  95  208:aload           4
	//*  96  210:invokevirtual   #244 <Method long dh.k()>
	//*  97  213:invokeinterface #250 <Method void IInAppMessage.setExpirationTimestamp(long)>
	//*  98  218:aload           4
	//*  99  220:invokevirtual   #254 <Method er dh.l()>
	//* 100  223:astore          4
	//* 101  225:aload_0         
	//* 102  226:getfield        #47  <Field ad c>
	//* 103  229:new             #256 <Class ak>
	//* 104  232:dup             
	//* 105  233:aload           4
	//* 106  235:aload_3         
	//* 107  236:aload_2         
	//* 108  237:invokespecial   #259 <Method void ak(er, IInAppMessage, String)>
	//* 109  240:ldc2            #256 <Class ak>
	//* 110  243:invokeinterface #189 <Method void ad.a(Object, Class)>
	//* 111  248:aload_1         
	//* 112  249:invokevirtual   #261 <Method boolean cp.f()>
	//* 113  252:ifeq            278
	//* 114  255:aload_0         
	//* 115  256:getfield        #47  <Field ad c>
	//* 116  259:new             #263 <Class aj>
	//* 117  262:dup             
	//* 118  263:aload_1         
	//* 119  264:invokevirtual   #265 <Method java.util.List cp.l()>
	//* 120  267:invokespecial   #266 <Method void aj(java.util.List)>
	//* 121  270:ldc2            #263 <Class aj>
	//* 122  273:invokeinterface #189 <Method void ad.a(Object, Class)>
	//* 123  278:return          
			// Misplaced declaration of an exception variable
			catch(JSONException jsonexception1)
			{
				AppboyLogger.w(a, "Unable to update/publish feed.");
			}
		if(!cp1.g())
			break MISSING_BLOCK_LABEL_108;
		obj = ((Object) (i.a(cp1.m(), s)));
		if(obj != null)
			try
			{
				d.a(obj, com/appboy/events/ContentCardsUpdatedEvent);
			}
			catch(JSONException jsonexception)
			{
				AppboyLogger.e(a, "Encountered JSON exception while parsing Content Cards update. Unable to publish Content Cards update event.", ((Throwable) (jsonexception)));
			}
		JSONException jsonexception1;
		if(cp1.c())
		{
			h.a(cp1.j());
			c.a(((Object) (new an(cp1.j()))), bo/app/an);
		}
		if(cp1.d())
			c.a(((Object) (new av(cp1.k()))), bo/app/av);
		if(cp1.b())
		{
			Object obj1 = ((Object) (b));
			if(obj1 instanceof dh)
			{
				Object obj2 = ((Object) ((dh)obj1));
				obj1 = ((Object) (cp1.i()));
				((IInAppMessage) (obj1)).setExpirationTimestamp(((dh) (obj2)).k());
				obj2 = ((Object) (((dh) (obj2)).l()));
				c.a(((Object) (new ak(((er) (obj2)), ((IInAppMessage) (obj1)), s))), bo/app/ak);
			}
		}
		if(cp1.f())
			c.a(((Object) (new aj(cp1.l()))), bo/app/aj);
		return;
	//* 124  279:astore_3        
	//* 125  280:goto            49
	}

	public void run()
	{
		cp cp1 = a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #271 <Method cp a()>
	//    2    4:astore_1        
		if(cp1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          61
		{
			try
			{
				a(cp1);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #273 <Method void a(cp)>
				c.a(((Object) (new ah(b))), bo/app/ah);
	//    8   14:aload_0         
	//    9   15:getfield        #47  <Field ad c>
	//   10   18:new             #275 <Class ah>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #45  <Field db b>
	//   14   26:invokespecial   #278 <Method void ah(db)>
	//   15   29:ldc2            #275 <Class ah>
	//   16   32:invokeinterface #189 <Method void ad.a(Object, Class)>
				c.a(((Object) (new af(b))), bo/app/af);
	//   17   37:aload_0         
	//   18   38:getfield        #47  <Field ad c>
	//   19   41:new             #280 <Class af>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:getfield        #45  <Field db b>
	//   23   49:invokespecial   #281 <Method void af(db)>
	//   24   52:ldc2            #280 <Class af>
	//   25   55:invokeinterface #189 <Method void ad.a(Object, Class)>
				return;
	//   26   60:return          
			}
	//*  27   61:getstatic       #38  <Field String a>
	//*  28   64:ldc2            #283 <String "Api response was null, failing task.">
	//*  29   67:invokestatic    #114 <Method int AppboyLogger.w(String, String)>
	//*  30   70:pop             
	//*  31   71:goto            126
			catch(Exception exception)
	//*  32   74:astore_1        
			{
				if(exception instanceof aw)
	//*  33   75:aload_1         
	//*  34   76:instanceof      #285 <Class aw>
	//*  35   79:ifeq            115
				{
					AppboyLogger.d(a, "Experienced network communication exception processing API response. Sending network error event.");
	//   36   82:getstatic       #38  <Field String a>
	//   37   85:ldc2            #287 <String "Experienced network communication exception processing API response. Sending network error event.">
	//   38   88:invokestatic    #289 <Method int AppboyLogger.d(String, String)>
	//   39   91:pop             
					c.a(((Object) (new ag(b))), bo/app/ag);
	//   40   92:aload_0         
	//   41   93:getfield        #47  <Field ad c>
	//   42   96:new             #291 <Class ag>
	//   43   99:dup             
	//   44  100:aload_0         
	//   45  101:getfield        #45  <Field db b>
	//   46  104:invokespecial   #292 <Method void ag(db)>
	//   47  107:ldc2            #291 <Class ag>
	//   48  110:invokeinterface #189 <Method void ad.a(Object, Class)>
				}
				AppboyLogger.w(a, "Experienced exception processing API response. Failing task.", ((Throwable) (exception)));
	//   49  115:getstatic       #38  <Field String a>
	//   50  118:ldc2            #294 <String "Experienced exception processing API response. Failing task.">
	//   51  121:aload_1         
	//   52  122:invokestatic    #296 <Method int AppboyLogger.w(String, String, Throwable)>
	//   53  125:pop             
			}
			break MISSING_BLOCK_LABEL_126;
		}
		AppboyLogger.w(a, "Api response was null, failing task.");
		b.a(c, d, ((cr) (new cs("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details."))));
	//   54  126:aload_0         
	//   55  127:getfield        #45  <Field db b>
	//   56  130:aload_0         
	//   57  131:getfield        #47  <Field ad c>
	//   58  134:aload_0         
	//   59  135:getfield        #49  <Field ad d>
	//   60  138:new             #298 <Class cs>
	//   61  141:dup             
	//   62  142:ldc2            #300 <String "An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.">
	//   63  145:invokespecial   #303 <Method void cs(String)>
	//   64  148:invokeinterface #159 <Method void db.a(ad, ad, cr)>
		c.a(((Object) (new ae(b))), bo/app/ae);
	//   65  153:aload_0         
	//   66  154:getfield        #47  <Field ad c>
	//   67  157:new             #305 <Class ae>
	//   68  160:dup             
	//   69  161:aload_0         
	//   70  162:getfield        #45  <Field db b>
	//   71  165:invokespecial   #306 <Method void ae(db)>
	//   72  168:ldc2            #305 <Class ae>
	//   73  171:invokeinterface #189 <Method void ad.a(Object, Class)>
		return;
	//   74  176:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/cv);
	private final db b;
	private final ad c;
	private final ad d;
	private final Map e;
	private final g f;
	private final dr g;
	private final dx h;
	private final dn i;
	private final bt j;

	static 
	{
	//    0    0:ldc1            #2   <Class cv>
	//    1    2:invokestatic    #36  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #38  <Field String a>
	//*   3    8:return          
	}
}
