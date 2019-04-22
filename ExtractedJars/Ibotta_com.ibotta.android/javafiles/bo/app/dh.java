// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.net.Uri;
import android.os.Handler;
import com.appboy.enums.inappmessage.InAppMessageFailureType;
import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			cu, et, fl, dj, 
//			co, au, ad, cs, 
//			fr, eb, eh, cp, 
//			cc, cm, y, ci, 
//			bt, cr, er, db

public class dh extends cu
{

	public dh(String s, et et1, fr fr1, bt bt1, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append(s);
	//    4    9:aload           6
	//    5   11:aload_1         
	//    6   12:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append("template");
	//    8   16:aload           6
	//    9   18:ldc1            #46  <String "template">
	//   10   20:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		super(Uri.parse(stringbuilder.toString()), ((java.util.Map) (null)));
	//   12   24:aload_0         
	//   13   25:aload           6
	//   14   27:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   15   30:invokestatic    #56  <Method Uri Uri.parse(String)>
	//   16   33:aconst_null     
	//   17   34:invokespecial   #59  <Method void cu(Uri, java.util.Map)>
		c = et1.h();
	//   18   37:aload_0         
	//   19   38:aload_2         
	//   20   39:invokevirtual   #63  <Method String et.h()>
	//   21   42:putfield        #65  <Field String c>
		d = et1.g();
	//   22   45:aload_0         
	//   23   46:aload_2         
	//   24   47:invokevirtual   #68  <Method long et.g()>
	//   25   50:putfield        #70  <Field long d>
		e = et1.i();
	//   26   53:aload_0         
	//   27   54:aload_2         
	//   28   55:invokevirtual   #72  <Method String et.i()>
	//   29   58:putfield        #74  <Field String e>
		f = fr1;
	//   30   61:aload_0         
	//   31   62:aload_3         
	//   32   63:putfield        #76  <Field fr f>
		h = (new cm.a()).a(s1).c();
	//   33   66:aload_0         
	//   34   67:new             #78  <Class cm$a>
	//   35   70:dup             
	//   36   71:invokespecial   #79  <Method void cm$a()>
	//   37   74:aload           5
	//   38   76:invokevirtual   #83  <Method cm$a cm$a.a(String)>
	//   39   79:invokevirtual   #86  <Method cm cm$a.c()>
	//   40   82:putfield        #88  <Field cm h>
		i = bt1;
	//   41   85:aload_0         
	//   42   86:aload           4
	//   43   88:putfield        #90  <Field bt i>
		g = et1;
	//   44   91:aload_0         
	//   45   92:aload_2         
	//   46   93:putfield        #92  <Field et g>
		k = a(g.c());
	//   47   96:aload_0         
	//   48   97:aload_0         
	//   49   98:aload_0         
	//   50   99:getfield        #92  <Field et g>
	//   51  102:invokevirtual   #95  <Method fl et.c()>
	//   52  105:invokespecial   #98  <Method long a(fl)>
	//   53  108:putfield        #100 <Field long k>
	//   54  111:aload_0         
	//   55  112:aload_0         
	//   56  113:invokespecial   #104 <Method dj o()>
	//   57  116:putfield        #106 <Field dj j>
	//   58  119:return          
	}

	private long a(fl fl1)
	{
		if(fl1.e() == -1)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #111 <Method int fl.e()>
	//*   2    6:iconst_m1       
	//*   3    7:icmpne          27
			return TimeUnit.SECONDS.toMillis(fl1.d() + 30);
	//    4   10:getstatic       #117 <Field TimeUnit TimeUnit.SECONDS>
	//    5   13:aload_1         
	//    6   14:invokeinterface #119 <Method int fl.d()>
	//    7   19:bipush          30
	//    8   21:iadd            
	//    9   22:i2l             
	//   10   23:invokevirtual   #123 <Method long TimeUnit.toMillis(long)>
	//   11   26:lreturn         
		else
			return (long)fl1.e();
	//   12   27:aload_1         
	//   13   28:invokeinterface #111 <Method int fl.e()>
	//   14   33:i2l             
	//   15   34:lreturn         
	}

	static bt a(dh dh1)
	{
		return dh1.i;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field bt i>
	//    2    4:areturn         
	}

	static String n()
	{
		return b;
	//    0    0:getstatic       #33  <Field String b>
	//    1    3:areturn         
	}

	private dj o()
	{
		return new dj((int)Math.min(k, TimeUnit.MINUTES.toMillis(1L)), (int)TimeUnit.SECONDS.toMillis(1L));
	//    0    0:new             #127 <Class dj>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #100 <Field long k>
	//    4    8:getstatic       #130 <Field TimeUnit TimeUnit.MINUTES>
	//    5   11:lconst_1        
	//    6   12:invokevirtual   #123 <Method long TimeUnit.toMillis(long)>
	//    7   15:invokestatic    #136 <Method long Math.min(long, long)>
	//    8   18:l2i             
	//    9   19:getstatic       #117 <Field TimeUnit TimeUnit.SECONDS>
	//   10   22:lconst_1        
	//   11   23:invokevirtual   #123 <Method long TimeUnit.toMillis(long)>
	//   12   26:l2i             
	//   13   27:invokespecial   #139 <Method void dj(int, int)>
	//   14   30:areturn         
	}

	public void a(ad ad1, ad ad2, cr cr)
	{
		super.a(ad1, ad2, cr);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #142 <Method void cu.a(ad, ad, cr)>
		m();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #145 <Method void m()>
		if(cr instanceof co)
	//*   7   11:aload_3         
	//*   8   12:instanceof      #147 <Class co>
	//*   9   15:ifeq            42
		{
			ad1.a(((Object) (new au(f, ((er) (g))))), bo/app/au);
	//   10   18:aload_1         
	//   11   19:new             #149 <Class au>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:getfield        #76  <Field fr f>
	//   15   27:aload_0         
	//   16   28:getfield        #92  <Field et g>
	//   17   31:invokespecial   #152 <Method void au(fr, er)>
	//   18   34:ldc1            #149 <Class au>
	//   19   36:invokeinterface #157 <Method void ad.a(Object, Class)>
			return;
	//   20   41:return          
		}
		if(cr instanceof cs)
	//*  21   42:aload_3         
	//*  22   43:instanceof      #159 <Class cs>
	//*  23   46:ifeq            196
		{
			AppboyLogger.v(b, "Response error was a server failure. Retrying request after some delay if not expired.");
	//   24   49:getstatic       #33  <Field String b>
	//   25   52:ldc1            #161 <String "Response error was a server failure. Retrying request after some delay if not expired.">
	//   26   54:invokestatic    #165 <Method int AppboyLogger.v(String, String)>
	//   27   57:pop             
			long l1 = f.d() + k;
	//   28   58:aload_0         
	//   29   59:getfield        #76  <Field fr f>
	//   30   62:invokeinterface #169 <Method long fr.d()>
	//   31   67:aload_0         
	//   32   68:getfield        #100 <Field long k>
	//   33   71:ladd            
	//   34   72:lstore          5
			if(eb.c() < l1)
	//*  35   74:invokestatic    #173 <Method long eb.c()>
	//*  36   77:lload           5
	//*  37   79:lcmp            
	//*  38   80:ifge            154
			{
				int i1 = j.c();
	//   39   83:aload_0         
	//   40   84:getfield        #106 <Field dj j>
	//   41   87:invokevirtual   #175 <Method int dj.c()>
	//   42   90:istore          4
				ad1 = ((ad) (b));
	//   43   92:getstatic       #33  <Field String b>
	//   44   95:astore_1        
				ad2 = ((ad) (new StringBuilder()));
	//   45   96:new             #38  <Class StringBuilder>
	//   46   99:dup             
	//   47  100:invokespecial   #40  <Method void StringBuilder()>
	//   48  103:astore_2        
				((StringBuilder) (ad2)).append("Retrying template request after delay of ");
	//   49  104:aload_2         
	//   50  105:ldc1            #177 <String "Retrying template request after delay of ">
	//   51  107:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   52  110:pop             
				((StringBuilder) (ad2)).append(i1);
	//   53  111:aload_2         
	//   54  112:iload           4
	//   55  114:invokevirtual   #180 <Method StringBuilder StringBuilder.append(int)>
	//   56  117:pop             
				((StringBuilder) (ad2)).append(" ms");
	//   57  118:aload_2         
	//   58  119:ldc1            #182 <String " ms">
	//   59  121:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   60  124:pop             
				AppboyLogger.d(((String) (ad1)), ((StringBuilder) (ad2)).toString());
	//   61  125:aload_1         
	//   62  126:aload_2         
	//   63  127:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   64  130:invokestatic    #184 <Method int AppboyLogger.d(String, String)>
	//   65  133:pop             
				eh.a().postDelayed(new Runnable(((db) (this))) {

					public void run()
					{
						AppboyLogger.d(dh.n(), "Adding request to dispatch");
					//    0    0:invokestatic    #29  <Method String dh.n()>
					//    1    3:ldc1            #31  <String "Adding request to dispatch">
					//    2    5:invokestatic    #37  <Method int AppboyLogger.d(String, String)>
					//    3    8:pop             
						dh.a(b).a(a);
					//    4    9:aload_0         
					//    5   10:getfield        #18  <Field dh b>
					//    6   13:invokestatic    #40  <Method bt dh.a(dh)>
					//    7   16:aload_0         
					//    8   17:getfield        #20  <Field db a>
					//    9   20:invokeinterface #45  <Method void bt.a(db)>
					//   10   25:return          
					}

					final db a;
					final dh b;

			
			{
				b = dh.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field dh b>
				a = db;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field db a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
				}
, i1);
	//   66  134:invokestatic    #189 <Method Handler eh.a()>
	//   67  137:new             #6   <Class dh$1>
	//   68  140:dup             
	//   69  141:aload_0         
	//   70  142:aload_0         
	//   71  143:invokespecial   #192 <Method void dh$1(dh, db)>
	//   72  146:iload           4
	//   73  148:i2l             
	//   74  149:invokevirtual   #198 <Method boolean Handler.postDelayed(Runnable, long)>
	//   75  152:pop             
				return;
	//   76  153:return          
			}
			ad1 = ((ad) (b));
	//   77  154:getstatic       #33  <Field String b>
	//   78  157:astore_1        
			ad2 = ((ad) (new StringBuilder()));
	//   79  158:new             #38  <Class StringBuilder>
	//   80  161:dup             
	//   81  162:invokespecial   #40  <Method void StringBuilder()>
	//   82  165:astore_2        
			((StringBuilder) (ad2)).append("Template request expired at time: ");
	//   83  166:aload_2         
	//   84  167:ldc1            #200 <String "Template request expired at time: ">
	//   85  169:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   86  172:pop             
			((StringBuilder) (ad2)).append(l1);
	//   87  173:aload_2         
	//   88  174:lload           5
	//   89  176:invokevirtual   #203 <Method StringBuilder StringBuilder.append(long)>
	//   90  179:pop             
			((StringBuilder) (ad2)).append(" and is not eligible for a backoff response. Not retrying or performing any fallback triggers");
	//   91  180:aload_2         
	//   92  181:ldc1            #205 <String " and is not eligible for a backoff response. Not retrying or performing any fallback triggers">
	//   93  183:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   94  186:pop             
			AppboyLogger.d(((String) (ad1)), ((StringBuilder) (ad2)).toString());
	//   95  187:aload_1         
	//   96  188:aload_2         
	//   97  189:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   98  192:invokestatic    #184 <Method int AppboyLogger.d(String, String)>
	//   99  195:pop             
		}
	//  100  196:return          
	}

	public void a(ad ad1, cp cp1)
	{
		j.a();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field dj j>
	//    2    4:invokevirtual   #208 <Method void dj.a()>
		if(cp1 != null && cp1.b())
	//*   3    7:aload_2         
	//*   4    8:ifnull          42
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #213 <Method boolean cp.b()>
	//*   7   15:ifeq            42
		{
			if(!StringUtils.isNullOrBlank(e))
	//*   8   18:aload_0         
	//*   9   19:getfield        #74  <Field String e>
	//*  10   22:invokestatic    #219 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  11   25:ifne            46
			{
				cp1.i().setLocalAssetPathForPrefetch(e);
	//   12   28:aload_2         
	//   13   29:invokevirtual   #222 <Method IInAppMessage cp.i()>
	//   14   32:aload_0         
	//   15   33:getfield        #74  <Field String e>
	//   16   36:invokeinterface #228 <Method void IInAppMessage.setLocalAssetPathForPrefetch(String)>
				return;
	//   17   41:return          
			}
		} else
		{
			m();
	//   18   42:aload_0         
	//   19   43:invokevirtual   #145 <Method void m()>
		}
	//   20   46:return          
	}

	public JSONObject g()
	{
		JSONObject jsonobject = super.g();
	//    0    0:aload_0         
	//    1    1:invokespecial   #233 <Method JSONObject cu.g()>
	//    2    4:astore_1        
		if(jsonobject == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		JSONObject jsonobject1 = new JSONObject();
	//    7   11:new             #235 <Class JSONObject>
	//    8   14:dup             
	//    9   15:invokespecial   #236 <Method void JSONObject()>
	//   10   18:astore_2        
		try
		{
			jsonobject1.put("trigger_id", ((Object) (c)));
	//   11   19:aload_2         
	//   12   20:ldc1            #238 <String "trigger_id">
	//   13   22:aload_0         
	//   14   23:getfield        #65  <Field String c>
	//   15   26:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   16   29:pop             
			jsonobject1.put("trigger_event_type", ((Object) (f.b())));
	//   17   30:aload_2         
	//   18   31:ldc1            #244 <String "trigger_event_type">
	//   19   33:aload_0         
	//   20   34:getfield        #76  <Field fr f>
	//   21   37:invokeinterface #246 <Method String fr.b()>
	//   22   42:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   23   45:pop             
			if(f.e() != null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #76  <Field fr f>
	//*  26   50:invokeinterface #249 <Method cc fr.e()>
	//*  27   55:ifnull          79
				jsonobject1.put("data", f.e().forJsonPut());
	//   28   58:aload_2         
	//   29   59:ldc1            #251 <String "data">
	//   30   61:aload_0         
	//   31   62:getfield        #76  <Field fr f>
	//   32   65:invokeinterface #249 <Method cc fr.e()>
	//   33   70:invokeinterface #257 <Method Object cc.forJsonPut()>
	//   34   75:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   35   78:pop             
			jsonobject.put("template", ((Object) (jsonobject1)));
	//   36   79:aload_1         
	//   37   80:ldc1            #46  <String "template">
	//   38   82:aload_2         
	//   39   83:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   40   86:pop             
			if(h.f())
	//*  41   87:aload_0         
	//*  42   88:getfield        #88  <Field cm h>
	//*  43   91:invokevirtual   #261 <Method boolean cm.f()>
	//*  44   94:ifeq            112
				jsonobject.put("respond_with", ((Object) (h.a())));
	//   45   97:aload_1         
	//   46   98:ldc2            #263 <String "respond_with">
	//   47  101:aload_0         
	//   48  102:getfield        #88  <Field cm h>
	//   49  105:invokevirtual   #265 <Method JSONObject cm.a()>
	//   50  108:invokevirtual   #242 <Method JSONObject JSONObject.put(String, Object)>
	//   51  111:pop             
		}
	//*  52  112:aload_1         
	//*  53  113:areturn         
		catch(JSONException jsonexception)
	//*  54  114:astore_1        
		{
			AppboyLogger.w(b, "Experienced JSONException while retrieving parameters. Returning null.", ((Throwable) (jsonexception)));
	//   55  115:getstatic       #33  <Field String b>
	//   56  118:ldc2            #267 <String "Experienced JSONException while retrieving parameters. Returning null.">
	//   57  121:aload_1         
	//   58  122:invokestatic    #271 <Method int AppboyLogger.w(String, String, Throwable)>
	//   59  125:pop             
			return null;
	//   60  126:aconst_null     
	//   61  127:areturn         
		}
		return jsonobject;
	}

	public boolean h()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public y i()
	{
		return y.b;
	//    0    0:getstatic       #277 <Field y y.b>
	//    1    3:areturn         
	}

	public long k()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field long d>
	//    2    4:lreturn         
	}

	public er l()
	{
		return ((er) (g));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field et g>
	//    2    4:areturn         
	}

	void m()
	{
		AppboyLogger.i(b, "Template request failed. Attempting to log in-app message template request failure.");
	//    0    0:getstatic       #33  <Field String b>
	//    1    3:ldc2            #282 <String "Template request failed. Attempting to log in-app message template request failure.">
	//    2    6:invokestatic    #284 <Method int AppboyLogger.i(String, String)>
	//    3    9:pop             
		if(StringUtils.isNullOrBlank(c))
	//*   4   10:aload_0         
	//*   5   11:getfield        #65  <Field String c>
	//*   6   14:invokestatic    #219 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   17:ifeq            31
		{
			AppboyLogger.d(b, "Trigger ID not found. Not logging in-app message template request failure.");
	//    8   20:getstatic       #33  <Field String b>
	//    9   23:ldc2            #286 <String "Trigger ID not found. Not logging in-app message template request failure.">
	//   10   26:invokestatic    #184 <Method int AppboyLogger.d(String, String)>
	//   11   29:pop             
			return;
	//   12   30:return          
		}
		if(i == null)
	//*  13   31:aload_0         
	//*  14   32:getfield        #90  <Field bt i>
	//*  15   35:ifnonnull       49
		{
			AppboyLogger.e(b, "Cannot log an in-app message template request failure because the IAppboyManager is null.");
	//   16   38:getstatic       #33  <Field String b>
	//   17   41:ldc2            #288 <String "Cannot log an in-app message template request failure because the IAppboyManager is null.">
	//   18   44:invokestatic    #290 <Method int AppboyLogger.e(String, String)>
	//   19   47:pop             
			return;
	//   20   48:return          
		}
		try
		{
			ci ci1 = ci.a(((String) (null)), ((String) (null)), c, InAppMessageFailureType.TEMPLATE_REQUEST);
	//   21   49:aconst_null     
	//   22   50:aconst_null     
	//   23   51:aload_0         
	//   24   52:getfield        #65  <Field String c>
	//   25   55:getstatic       #296 <Field InAppMessageFailureType InAppMessageFailureType.TEMPLATE_REQUEST>
	//   26   58:invokestatic    #301 <Method ci ci.a(String, String, String, InAppMessageFailureType)>
	//   27   61:astore_1        
			i.a(((cc) (ci1)));
	//   28   62:aload_0         
	//   29   63:getfield        #90  <Field bt i>
	//   30   66:aload_1         
	//   31   67:invokeinterface #306 <Method boolean bt.a(cc)>
	//   32   72:pop             
			return;
	//   33   73:return          
		}
		catch(JSONException jsonexception)
	//*  34   74:astore_1        
		{
			i.a(((Throwable) (jsonexception)));
	//   35   75:aload_0         
	//   36   76:getfield        #90  <Field bt i>
	//   37   79:aload_1         
	//   38   80:invokeinterface #309 <Method void bt.a(Throwable)>
		}
	//   39   85:return          
	}

	private static final String b = AppboyLogger.getAppboyLogTag(bo/app/dh);
	private final String c;
	private final long d;
	private final String e;
	private final fr f;
	private final et g;
	private final cm h;
	private final bt i;
	private final dj j = o();
	private final long k;

	static 
	{
	//    0    0:ldc1            #2   <Class dh>
	//    1    2:invokestatic    #31  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #33  <Field String b>
	//*   3    8:return          
	}
}
