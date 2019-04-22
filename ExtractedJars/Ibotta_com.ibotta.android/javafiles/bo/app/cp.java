// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.List;
import org.json.*;

// Referenced classes of package bo.app:
//			co, cw, cq, gj, 
//			ct, ed, cr, db, 
//			bt

public class cp
{

	public cp(JSONObject jsonobject, db db, bt bt)
	{
label0:
		{
label1:
			{
label2:
				{
					super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
					Object obj = ((Object) (jsonobject.optString("error", ((String) (null)))));
	//    2    4:aload_1         
	//    3    5:ldc1            #43  <String "error">
	//    4    7:aconst_null     
	//    5    8:invokevirtual   #49  <Method String JSONObject.optString(String, String)>
	//    6   11:astore          4
					if(obj != null)
	//*   7   13:aload           4
	//*   8   15:ifnull          34
						h = ((cr) (new co(((String) (obj)))));
	//    9   18:aload_0         
	//   10   19:new             #51  <Class co>
	//   11   22:dup             
	//   12   23:aload           4
	//   13   25:invokespecial   #54  <Method void co(String)>
	//   14   28:putfield        #56  <Field cr h>
					else
	//*  15   31:goto            39
						h = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #56  <Field cr h>
					obj = ((Object) (jsonobject.optJSONArray("feed")));
	//   19   39:aload_1         
	//   20   40:ldc1            #58  <String "feed">
	//   21   42:invokevirtual   #62  <Method JSONArray JSONObject.optJSONArray(String)>
	//   22   45:astore          4
					if(obj != null)
	//*  23   47:aload           4
	//*  24   49:ifnull          61
						b = ((JSONArray) (obj));
	//   25   52:aload_0         
	//   26   53:aload           4
	//   27   55:putfield        #64  <Field JSONArray b>
					else
	//*  28   58:goto            66
						b = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #64  <Field JSONArray b>
					if(h != null || !(db instanceof cw))
						break label1;
	//   32   66:aload_0         
	//   33   67:getfield        #56  <Field cr h>
	//   34   70:ifnonnull       239
	//   35   73:aload_2         
	//   36   74:instanceof      #66  <Class cw>
	//   37   77:ifeq            239
					try
					{
						db = ((db) (new cq(jsonobject)));
	//   38   80:new             #68  <Class cq>
	//   39   83:dup             
	//   40   84:aload_1         
	//   41   85:invokespecial   #71  <Method void cq(JSONObject)>
	//   42   88:astore_2        
						break label2;
	//   43   89:goto            231
					}
	//*  44   92:astore          4
	//*  45   94:getstatic       #32  <Field String a>
	//*  46   97:astore          5
	//*  47   99:new             #73  <Class StringBuilder>
	//*  48  102:dup             
	//*  49  103:invokespecial   #74  <Method void StringBuilder()>
	//*  50  106:astore          6
	//*  51  108:aload           6
	//*  52  110:ldc1            #76  <String "Encountered Exception processing Content Cards response: ">
	//*  53  112:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  54  115:pop             
	//*  55  116:aload_1         
	//*  56  117:instanceof      #45  <Class JSONObject>
	//*  57  120:ifne            131
	//*  58  123:aload_1         
	//*  59  124:invokevirtual   #84  <Method String JSONObject.toString()>
	//*  60  127:astore_2        
	//*  61  128:goto            139
	//*  62  131:aload_1         
	//*  63  132:checkcast       #45  <Class JSONObject>
	//*  64  135:invokestatic    #89  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*  65  138:astore_2        
	//*  66  139:aload           6
	//*  67  141:aload_2         
	//*  68  142:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  69  145:pop             
	//*  70  146:aload           5
	//*  71  148:aload           6
	//*  72  150:invokevirtual   #90  <Method String StringBuilder.toString()>
	//*  73  153:aload           4
	//*  74  155:invokestatic    #94  <Method int AppboyLogger.w(String, String, Throwable)>
	//*  75  158:pop             
	//*  76  159:goto            229
					catch(JSONException jsonexception)
	//*  77  162:astore          4
					{
						String s1 = a;
	//   78  164:getstatic       #32  <Field String a>
	//   79  167:astore          5
						StringBuilder stringbuilder1 = new StringBuilder();
	//   80  169:new             #73  <Class StringBuilder>
	//   81  172:dup             
	//   82  173:invokespecial   #74  <Method void StringBuilder()>
	//   83  176:astore          6
						stringbuilder1.append("Encountered JSONException processing Content Cards response: ");
	//   84  178:aload           6
	//   85  180:ldc1            #96  <String "Encountered JSONException processing Content Cards response: ">
	//   86  182:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   87  185:pop             
						if(!(jsonobject instanceof JSONObject))
	//*  88  186:aload_1         
	//*  89  187:instanceof      #45  <Class JSONObject>
	//*  90  190:ifne            201
							db = ((db) (jsonobject.toString()));
	//   91  193:aload_1         
	//   92  194:invokevirtual   #84  <Method String JSONObject.toString()>
	//   93  197:astore_2        
						else
	//*  94  198:goto            209
							db = ((db) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   95  201:aload_1         
	//   96  202:checkcast       #45  <Class JSONObject>
	//   97  205:invokestatic    #89  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   98  208:astore_2        
						stringbuilder1.append(((String) (db)));
	//   99  209:aload           6
	//  100  211:aload_2         
	//  101  212:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  102  215:pop             
						AppboyLogger.w(s1, stringbuilder1.toString(), ((Throwable) (jsonexception)));
	//  103  216:aload           5
	//  104  218:aload           6
	//  105  220:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  106  223:aload           4
	//  107  225:invokestatic    #94  <Method int AppboyLogger.w(String, String, Throwable)>
	//  108  228:pop             
					}
					catch(Exception exception)
					{
						String s = a;
						StringBuilder stringbuilder = new StringBuilder();
						stringbuilder.append("Encountered Exception processing Content Cards response: ");
						if(!(jsonobject instanceof JSONObject))
							db = ((db) (jsonobject.toString()));
						else
							db = ((db) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
						stringbuilder.append(((String) (db)));
						AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
					}
					db = null;
	//  109  229:aconst_null     
	//  110  230:astore_2        
				}
				c = ((cq) (db));
	//  111  231:aload_0         
	//  112  232:aload_2         
	//  113  233:putfield        #98  <Field cq c>
				break label0;
	//  114  236:goto            244
			}
			c = null;
	//  115  239:aload_0         
	//  116  240:aconst_null     
	//  117  241:putfield        #98  <Field cq c>
		}
label3:
		{
			e = gj.a(jsonobject.optJSONArray("triggers"), bt);
	//  118  244:aload_0         
	//  119  245:aload_1         
	//  120  246:ldc1            #100 <String "triggers">
	//  121  248:invokevirtual   #62  <Method JSONArray JSONObject.optJSONArray(String)>
	//  122  251:aload_3         
	//  123  252:invokestatic    #105 <Method List gj.a(JSONArray, bt)>
	//  124  255:putfield        #107 <Field List e>
			JSONObject jsonobject1 = jsonobject.optJSONObject("config");
	//  125  258:aload_1         
	//  126  259:ldc1            #109 <String "config">
	//  127  261:invokevirtual   #113 <Method JSONObject JSONObject.optJSONObject(String)>
	//  128  264:astore          4
			if(jsonobject1 != null)
	//* 129  266:aload           4
	//* 130  268:ifnull          427
				try
				{
					db = ((db) (new ct(jsonobject1)));
	//  131  271:new             #115 <Class ct>
	//  132  274:dup             
	//  133  275:aload           4
	//  134  277:invokespecial   #116 <Method void ct(JSONObject)>
	//  135  280:astore_2        
					break label3;
	//  136  281:goto            429
				}
	//* 137  284:astore          5
	//* 138  286:getstatic       #32  <Field String a>
	//* 139  289:astore          6
	//* 140  291:new             #73  <Class StringBuilder>
	//* 141  294:dup             
	//* 142  295:invokespecial   #74  <Method void StringBuilder()>
	//* 143  298:astore          7
	//* 144  300:aload           7
	//* 145  302:ldc1            #118 <String "Encountered Exception processing server config: ">
	//* 146  304:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//* 147  307:pop             
	//* 148  308:aload           4
	//* 149  310:instanceof      #45  <Class JSONObject>
	//* 150  313:ifne            325
	//* 151  316:aload           4
	//* 152  318:invokevirtual   #84  <Method String JSONObject.toString()>
	//* 153  321:astore_2        
	//* 154  322:goto            334
	//* 155  325:aload           4
	//* 156  327:checkcast       #45  <Class JSONObject>
	//* 157  330:invokestatic    #89  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//* 158  333:astore_2        
	//* 159  334:aload           7
	//* 160  336:aload_2         
	//* 161  337:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//* 162  340:pop             
	//* 163  341:aload           6
	//* 164  343:aload           7
	//* 165  345:invokevirtual   #90  <Method String StringBuilder.toString()>
	//* 166  348:aload           5
	//* 167  350:invokestatic    #94  <Method int AppboyLogger.w(String, String, Throwable)>
	//* 168  353:pop             
	//* 169  354:goto            427
				catch(JSONException jsonexception1)
	//* 170  357:astore          5
				{
					String s3 = a;
	//  171  359:getstatic       #32  <Field String a>
	//  172  362:astore          6
					StringBuilder stringbuilder3 = new StringBuilder();
	//  173  364:new             #73  <Class StringBuilder>
	//  174  367:dup             
	//  175  368:invokespecial   #74  <Method void StringBuilder()>
	//  176  371:astore          7
					stringbuilder3.append("Encountered JSONException processing server config: ");
	//  177  373:aload           7
	//  178  375:ldc1            #120 <String "Encountered JSONException processing server config: ">
	//  179  377:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  180  380:pop             
					if(!(jsonobject1 instanceof JSONObject))
	//* 181  381:aload           4
	//* 182  383:instanceof      #45  <Class JSONObject>
	//* 183  386:ifne            398
						db = ((db) (jsonobject1.toString()));
	//  184  389:aload           4
	//  185  391:invokevirtual   #84  <Method String JSONObject.toString()>
	//  186  394:astore_2        
					else
	//* 187  395:goto            407
						db = ((db) (JSONObjectInstrumentation.toString((JSONObject)jsonobject1)));
	//  188  398:aload           4
	//  189  400:checkcast       #45  <Class JSONObject>
	//  190  403:invokestatic    #89  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//  191  406:astore_2        
					stringbuilder3.append(((String) (db)));
	//  192  407:aload           7
	//  193  409:aload_2         
	//  194  410:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  195  413:pop             
					AppboyLogger.w(s3, stringbuilder3.toString(), ((Throwable) (jsonexception1)));
	//  196  414:aload           6
	//  197  416:aload           7
	//  198  418:invokevirtual   #90  <Method String StringBuilder.toString()>
	//  199  421:aload           5
	//  200  423:invokestatic    #94  <Method int AppboyLogger.w(String, String, Throwable)>
	//  201  426:pop             
				}
				catch(Exception exception1)
				{
					String s2 = a;
					StringBuilder stringbuilder2 = new StringBuilder();
					stringbuilder2.append("Encountered Exception processing server config: ");
					if(!(jsonobject1 instanceof JSONObject))
						db = ((db) (jsonobject1.toString()));
					else
						db = ((db) (JSONObjectInstrumentation.toString((JSONObject)jsonobject1)));
					stringbuilder2.append(((String) (db)));
					AppboyLogger.w(s2, stringbuilder2.toString(), ((Throwable) (exception1)));
				}
			db = null;
	//  202  427:aconst_null     
	//  203  428:astore_2        
		}
		f = ((ct) (db));
	//  204  429:aload_0         
	//  205  430:aload_2         
	//  206  431:putfield        #122 <Field ct f>
		d = gj.a(jsonobject.optJSONObject("templated_message"), bt);
	//  207  434:aload_0         
	//  208  435:aload_1         
	//  209  436:ldc1            #124 <String "templated_message">
	//  210  438:invokevirtual   #113 <Method JSONObject JSONObject.optJSONObject(String)>
	//  211  441:aload_3         
	//  212  442:invokestatic    #127 <Method IInAppMessage gj.a(JSONObject, bt)>
	//  213  445:putfield        #129 <Field IInAppMessage d>
		g = ed.a(jsonobject.optJSONArray("geofences"));
	//  214  448:aload_0         
	//  215  449:aload_1         
	//  216  450:ldc1            #131 <String "geofences">
	//  217  452:invokevirtual   #62  <Method JSONArray JSONObject.optJSONArray(String)>
	//  218  455:invokestatic    #136 <Method List ed.a(JSONArray)>
	//  219  458:putfield        #138 <Field List g>
	//  220  461:return          
	}

	public boolean a()
	{
		return b != null;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JSONArray b>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean b()
	{
		return d != null;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field IInAppMessage d>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean c()
	{
		return f != null;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field ct f>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean d()
	{
		return e != null;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field List e>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean e()
	{
		return h != null;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field cr h>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean f()
	{
		return g != null;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field List g>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean g()
	{
		return c != null;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field cq c>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public JSONArray h()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JSONArray b>
	//    2    4:areturn         
	}

	public IInAppMessage i()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field IInAppMessage d>
	//    2    4:areturn         
	}

	public ct j()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field ct f>
	//    2    4:areturn         
	}

	public List k()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field List e>
	//    2    4:areturn         
	}

	public List l()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field List g>
	//    2    4:areturn         
	}

	public cq m()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field cq c>
	//    2    4:areturn         
	}

	public cr n()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field cr h>
	//    2    4:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/cp);
	private final JSONArray b;
	private final cq c;
	private final IInAppMessage d;
	private final List e;
	private final ct f;
	private final List g;
	private final cr h;

	static 
	{
	//    0    0:ldc1            #2   <Class cp>
	//    1    2:invokestatic    #30  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #32  <Field String a>
	//*   3    8:return          
	}
}
