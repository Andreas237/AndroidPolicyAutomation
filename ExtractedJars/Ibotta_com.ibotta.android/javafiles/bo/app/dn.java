// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.enums.CardKey;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import org.json.*;

// Referenced classes of package bo.app:
//			dt, a, eb, cq, 
//			cb, c, bo

public class dn
	implements dt
{

	public dn(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		f = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #62  <Field String f>
		s = StringUtils.getCacheFileSuffix(context, s, s1);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #68  <Method String StringUtils.getCacheFileSuffix(Context, String, String)>
	//    9   15:astore_2        
		s1 = ((String) (new StringBuilder()));
	//   10   16:new             #70  <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #71  <Method void StringBuilder()>
	//   13   23:astore_3        
		((StringBuilder) (s1)).append("com.appboy.storage.content_cards_storage_provider.metadata");
	//   14   24:aload_3         
	//   15   25:ldc1            #73  <String "com.appboy.storage.content_cards_storage_provider.metadata">
	//   16   27:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
		((StringBuilder) (s1)).append(s);
	//   18   31:aload_3         
	//   19   32:aload_2         
	//   20   33:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   21   36:pop             
		d = context.getSharedPreferences(((StringBuilder) (s1)).toString(), 0);
	//   22   37:aload_0         
	//   23   38:aload_1         
	//   24   39:aload_3         
	//   25   40:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   26   43:iconst_0        
	//   27   44:invokevirtual   #86  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   28   47:putfield        #88  <Field SharedPreferences d>
		s1 = ((String) (new StringBuilder()));
	//   29   50:new             #70  <Class StringBuilder>
	//   30   53:dup             
	//   31   54:invokespecial   #71  <Method void StringBuilder()>
	//   32   57:astore_3        
		((StringBuilder) (s1)).append("com.appboy.storage.content_cards_storage_provider.cards");
	//   33   58:aload_3         
	//   34   59:ldc1            #90  <String "com.appboy.storage.content_cards_storage_provider.cards">
	//   35   61:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   36   64:pop             
		((StringBuilder) (s1)).append(s);
	//   37   65:aload_3         
	//   38   66:aload_2         
	//   39   67:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   40   70:pop             
		c = context.getSharedPreferences(((StringBuilder) (s1)).toString(), 0);
	//   41   71:aload_0         
	//   42   72:aload_1         
	//   43   73:aload_3         
	//   44   74:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   45   77:iconst_0        
	//   46   78:invokevirtual   #86  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   47   81:putfield        #92  <Field SharedPreferences c>
	//   48   84:aload_0         
	//   49   85:new             #94  <Class a>
	//   50   88:dup             
	//   51   89:invokespecial   #95  <Method void a()>
	//   52   92:putfield        #97  <Field c e>
	//   53   95:return          
	}

	static boolean a(JSONObject jsonobject, JSONObject jsonobject1)
	{
		if(jsonobject1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		if(jsonobject == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		String s = CardKey.CREATED.getContentCardsKey();
	//    8   12:getstatic       #103 <Field CardKey CardKey.CREATED>
	//    9   15:invokevirtual   #48  <Method String CardKey.getContentCardsKey()>
	//   10   18:astore_2        
		return jsonobject.has(s) && jsonobject1.has(s) && jsonobject.getLong(s) > jsonobject1.getLong(s);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #109 <Method boolean JSONObject.has(String)>
	//   14   24:ifeq            51
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #109 <Method boolean JSONObject.has(String)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #113 <Method long JSONObject.getLong(String)>
	//   22   40:aload_1         
	//   23   41:aload_2         
	//   24   42:invokevirtual   #113 <Method long JSONObject.getLong(String)>
	//   25   45:lcmp            
	//   26   46:ifle            51
	//   27   49:iconst_1        
	//   28   50:ireturn         
	//   29   51:iconst_0        
	//   30   52:ireturn         
	}

	static JSONObject b(JSONObject jsonobject, JSONObject jsonobject1)
	{
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return jsonobject1;
	//    2    4:aload_1         
	//    3    5:areturn         
		JSONObject jsonobject2 = new JSONObject();
	//    4    6:new             #105 <Class JSONObject>
	//    5    9:dup             
	//    6   10:invokespecial   #117 <Method void JSONObject()>
	//    7   13:astore          4
		String s;
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); jsonobject2.put(s, jsonobject.get(s)))
	//*   8   15:aload_0         
	//*   9   16:invokevirtual   #121 <Method Iterator JSONObject.keys()>
	//*  10   19:astore          5
	//*  11   21:aload           5
	//*  12   23:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  13   28:ifeq            60
			s = (String)iterator.next();
	//   14   31:aload           5
	//   15   33:invokeinterface #131 <Method Object Iterator.next()>
	//   16   38:checkcast       #133 <Class String>
	//   17   41:astore          6

	//   18   43:aload           4
	//   19   45:aload           6
	//   20   47:aload_0         
	//   21   48:aload           6
	//   22   50:invokevirtual   #137 <Method Object JSONObject.get(String)>
	//   23   53:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   24   56:pop             
	//*  25   57:goto            21
		for(Iterator iterator1 = jsonobject1.keys(); iterator1.hasNext();)
	//*  26   60:aload_1         
	//*  27   61:invokevirtual   #121 <Method Iterator JSONObject.keys()>
	//*  28   64:astore          5
	//*  29   66:aload           5
	//*  30   68:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//*  31   73:ifeq            162
		{
			String s1 = (String)iterator1.next();
	//   32   76:aload           5
	//   33   78:invokeinterface #131 <Method Object Iterator.next()>
	//   34   83:checkcast       #133 <Class String>
	//   35   86:astore          6
			if(b.contains(((Object) (s1))))
	//*  36   88:getstatic       #38  <Field Set b>
	//*  37   91:aload           6
	//*  38   93:invokeinterface #144 <Method boolean Set.contains(Object)>
	//*  39   98:ifeq            145
			{
				boolean flag = jsonobject.getBoolean(s1);
	//   40  101:aload_0         
	//   41  102:aload           6
	//   42  104:invokevirtual   #147 <Method boolean JSONObject.getBoolean(String)>
	//   43  107:istore_2        
				boolean flag1 = jsonobject1.getBoolean(s1);
	//   44  108:aload_1         
	//   45  109:aload           6
	//   46  111:invokevirtual   #147 <Method boolean JSONObject.getBoolean(String)>
	//   47  114:istore_3        
				if(!flag && !flag1)
	//*  48  115:iload_2         
	//*  49  116:ifne            131
	//*  50  119:iload_3         
	//*  51  120:ifeq            126
	//*  52  123:goto            131
					flag = false;
	//   53  126:iconst_0        
	//   54  127:istore_2        
				else
	//*  55  128:goto            133
					flag = true;
	//   56  131:iconst_1        
	//   57  132:istore_2        
				jsonobject2.put(s1, flag);
	//   58  133:aload           4
	//   59  135:aload           6
	//   60  137:iload_2         
	//   61  138:invokevirtual   #150 <Method JSONObject JSONObject.put(String, boolean)>
	//   62  141:pop             
			} else
	//*  63  142:goto            66
			{
				jsonobject2.put(s1, jsonobject1.get(s1));
	//   64  145:aload           4
	//   65  147:aload           6
	//   66  149:aload_1         
	//   67  150:aload           6
	//   68  152:invokevirtual   #137 <Method Object JSONObject.get(String)>
	//   69  155:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   70  158:pop             
			}
		}

	//*  71  159:goto            66
		return jsonobject2;
	//   72  162:aload           4
	//   73  164:areturn         
	}

	private void e()
	{
		android.content.SharedPreferences.Editor editor = d.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field SharedPreferences d>
	//    2    4:invokeinterface #156 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_1        
		editor.putLong("last_storage_update_timestamp", eb.a());
	//    4   10:aload_1         
	//    5   11:ldc1            #158 <String "last_storage_update_timestamp">
	//    6   13:invokestatic    #163 <Method long eb.a()>
	//    7   16:invokeinterface #169 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//    8   21:pop             
		editor.apply();
	//    9   22:aload_1         
	//   10   23:invokeinterface #172 <Method void android.content.SharedPreferences$Editor.apply()>
	//   11   28:return          
	}

	private long f()
	{
		return d.getLong("last_storage_update_timestamp", 0L);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field SharedPreferences d>
	//    2    4:ldc1            #158 <String "last_storage_update_timestamp">
	//    3    6:lconst_0        
	//    4    7:invokeinterface #175 <Method long SharedPreferences.getLong(String, long)>
	//    5   12:lreturn         
	}

	public ContentCardsUpdatedEvent a()
	{
		return a(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #179 <Method ContentCardsUpdatedEvent a(boolean)>
	//    3    5:areturn         
	}

	public ContentCardsUpdatedEvent a(cq cq1, String s)
	{
		Object obj = ((Object) (s));
	//    0    0:aload_2         
	//    1    1:astore          5
		if(s == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       20
		{
			AppboyLogger.d(a, "Input user id was null. Defaulting to the empty user id");
	//    4    7:getstatic       #31  <Field String a>
	//    5   10:ldc1            #182 <String "Input user id was null. Defaulting to the empty user id">
	//    6   12:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//    7   15:pop             
			obj = "";
	//    8   16:ldc1            #187 <String "">
	//    9   18:astore          5
		}
		if(!f.equals(obj))
	//*  10   20:aload_0         
	//*  11   21:getfield        #62  <Field String f>
	//*  12   24:aload           5
	//*  13   26:invokevirtual   #190 <Method boolean String.equals(Object)>
	//*  14   29:ifne            92
		{
			cq1 = ((cq) (a));
	//   15   32:getstatic       #31  <Field String a>
	//   16   35:astore_1        
			s = ((String) (new StringBuilder()));
	//   17   36:new             #70  <Class StringBuilder>
	//   18   39:dup             
	//   19   40:invokespecial   #71  <Method void StringBuilder()>
	//   20   43:astore_2        
			((StringBuilder) (s)).append("The received cards are for user ");
	//   21   44:aload_2         
	//   22   45:ldc1            #192 <String "The received cards are for user ">
	//   23   47:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			((StringBuilder) (s)).append(((String) (obj)));
	//   25   51:aload_2         
	//   26   52:aload           5
	//   27   54:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
			((StringBuilder) (s)).append(" and the current user is ");
	//   29   58:aload_2         
	//   30   59:ldc1            #194 <String " and the current user is ">
	//   31   61:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
			((StringBuilder) (s)).append(f);
	//   33   65:aload_2         
	//   34   66:aload_0         
	//   35   67:getfield        #62  <Field String f>
	//   36   70:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
			((StringBuilder) (s)).append(" , the cards will be discarded and no changes will be made.");
	//   38   74:aload_2         
	//   39   75:ldc1            #196 <String " , the cards will be discarded and no changes will be made.">
	//   40   77:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
			AppboyLogger.i(((String) (cq1)), ((StringBuilder) (s)).toString());
	//   42   81:aload_1         
	//   43   82:aload_2         
	//   44   83:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   45   86:invokestatic    #199 <Method int AppboyLogger.i(String, String)>
	//   46   89:pop             
			return null;
	//   47   90:aconst_null     
	//   48   91:areturn         
		}
		s = a;
	//   49   92:getstatic       #31  <Field String a>
	//   50   95:astore_2        
		Object obj1 = ((Object) (new StringBuilder()));
	//   51   96:new             #70  <Class StringBuilder>
	//   52   99:dup             
	//   53  100:invokespecial   #71  <Method void StringBuilder()>
	//   54  103:astore          6
		((StringBuilder) (obj1)).append("Updating offline Content Cards for user with id: ");
	//   55  105:aload           6
	//   56  107:ldc1            #201 <String "Updating offline Content Cards for user with id: ">
	//   57  109:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   58  112:pop             
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   59  113:aload           6
	//   60  115:aload           5
	//   61  117:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   62  120:pop             
		AppboyLogger.i(s, ((StringBuilder) (obj1)).toString());
	//   63  121:aload_2         
	//   64  122:aload           6
	//   65  124:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   66  127:invokestatic    #199 <Method int AppboyLogger.i(String, String)>
	//   67  130:pop             
		a(cq1);
	//   68  131:aload_0         
	//   69  132:aload_1         
	//   70  133:invokevirtual   #204 <Method void a(cq)>
		e();
	//   71  136:aload_0         
	//   72  137:invokespecial   #206 <Method void e()>
		obj = ((Object) (new HashSet()));
	//   73  140:new             #33  <Class HashSet>
	//   74  143:dup             
	//   75  144:invokespecial   #36  <Method void HashSet()>
	//   76  147:astore          5
		obj1 = ((Object) (cq1.d()));
	//   77  149:aload_1         
	//   78  150:invokevirtual   #211 <Method JSONArray cq.d()>
	//   79  153:astore          6
		if(obj1 != null && ((JSONArray) (obj1)).length() != 0)
	//*  80  155:aload           6
	//*  81  157:ifnull          614
	//*  82  160:aload           6
	//*  83  162:invokevirtual   #217 <Method int JSONArray.length()>
	//*  84  165:ifeq            614
		{
			Set set = d();
	//   85  168:aload_0         
	//   86  169:invokevirtual   #220 <Method Set d()>
	//   87  172:astore          7
			for(int i = 0; i < ((JSONArray) (obj1)).length(); i++)
	//*  88  174:iconst_0        
	//*  89  175:istore_3        
	//*  90  176:iload_3         
	//*  91  177:aload           6
	//*  92  179:invokevirtual   #217 <Method int JSONArray.length()>
	//*  93  182:icmpge          614
			{
				Object obj2 = ((Object) (((JSONArray) (obj1)).getJSONObject(i)));
	//   94  185:aload           6
	//   95  187:iload_3         
	//   96  188:invokevirtual   #224 <Method JSONObject JSONArray.getJSONObject(int)>
	//   97  191:astore          8
				s = ((JSONObject) (obj2)).getString(CardKey.ID.getContentCardsKey());
	//   98  193:aload           8
	//   99  195:getstatic       #227 <Field CardKey CardKey.ID>
	//  100  198:invokevirtual   #48  <Method String CardKey.getContentCardsKey()>
	//  101  201:invokevirtual   #231 <Method String JSONObject.getString(String)>
	//  102  204:astore_2        
				Object obj3 = ((Object) (e(s)));
	//  103  205:aload_0         
	//  104  206:aload_2         
	//  105  207:invokevirtual   #234 <Method JSONObject e(String)>
	//  106  210:astore          9
				if(a(((JSONObject) (obj3)), ((JSONObject) (obj2))))
	//* 107  212:aload           9
	//* 108  214:aload           8
	//* 109  216:invokestatic    #236 <Method boolean a(JSONObject, JSONObject)>
	//* 110  219:ifeq            367
				{
					AppboyLogger.i(a, "The server card received is older than the cached card. Discarding the server card.");
	//  111  222:getstatic       #31  <Field String a>
	//  112  225:ldc1            #238 <String "The server card received is older than the cached card. Discarding the server card.">
	//  113  227:invokestatic    #199 <Method int AppboyLogger.i(String, String)>
	//  114  230:pop             
					obj3 = ((Object) (a));
	//  115  231:getstatic       #31  <Field String a>
	//  116  234:astore          9
					StringBuilder stringbuilder = new StringBuilder();
	//  117  236:new             #70  <Class StringBuilder>
	//  118  239:dup             
	//  119  240:invokespecial   #71  <Method void StringBuilder()>
	//  120  243:astore          10
					stringbuilder.append("Server card json: ");
	//  121  245:aload           10
	//  122  247:ldc1            #240 <String "Server card json: ">
	//  123  249:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  124  252:pop             
					boolean flag = obj2 instanceof JSONObject;
	//  125  253:aload           8
	//  126  255:instanceof      #105 <Class JSONObject>
	//  127  258:istore          4
					if(!flag)
	//* 128  260:iload           4
	//* 129  262:ifne            274
						s = ((JSONObject) (obj2)).toString();
	//  130  265:aload           8
	//  131  267:invokevirtual   #241 <Method String JSONObject.toString()>
	//  132  270:astore_2        
					else
	//* 133  271:goto            283
						s = JSONObjectInstrumentation.toString((JSONObject)obj2);
	//  134  274:aload           8
	//  135  276:checkcast       #105 <Class JSONObject>
	//  136  279:invokestatic    #246 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//  137  282:astore_2        
					stringbuilder.append(s);
	//  138  283:aload           10
	//  139  285:aload_2         
	//  140  286:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  141  289:pop             
					AppboyLogger.d(((String) (obj3)), stringbuilder.toString());
	//  142  290:aload           9
	//  143  292:aload           10
	//  144  294:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  145  297:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//  146  300:pop             
					obj3 = ((Object) (a));
	//  147  301:getstatic       #31  <Field String a>
	//  148  304:astore          9
					stringbuilder = new StringBuilder();
	//  149  306:new             #70  <Class StringBuilder>
	//  150  309:dup             
	//  151  310:invokespecial   #71  <Method void StringBuilder()>
	//  152  313:astore          10
					stringbuilder.append("Cached card json: ");
	//  153  315:aload           10
	//  154  317:ldc1            #248 <String "Cached card json: ">
	//  155  319:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  156  322:pop             
					if(!flag)
	//* 157  323:iload           4
	//* 158  325:ifne            337
						s = ((JSONObject) (obj2)).toString();
	//  159  328:aload           8
	//  160  330:invokevirtual   #241 <Method String JSONObject.toString()>
	//  161  333:astore_2        
					else
	//* 162  334:goto            346
						s = JSONObjectInstrumentation.toString((JSONObject)obj2);
	//  163  337:aload           8
	//  164  339:checkcast       #105 <Class JSONObject>
	//  165  342:invokestatic    #246 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//  166  345:astore_2        
					stringbuilder.append(s);
	//  167  346:aload           10
	//  168  348:aload_2         
	//  169  349:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  170  352:pop             
					AppboyLogger.d(((String) (obj3)), stringbuilder.toString());
	//  171  353:aload           9
	//  172  355:aload           10
	//  173  357:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  174  360:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//  175  363:pop             
					continue;
	//  176  364:goto            607
				}
				((Set) (obj)).add(((Object) (s)));
	//  177  367:aload           5
	//  178  369:aload_2         
	//  179  370:invokeinterface #54  <Method boolean Set.add(Object)>
	//  180  375:pop             
				if(((JSONObject) (obj2)).has(CardKey.REMOVED.getContentCardsKey()) && ((JSONObject) (obj2)).getBoolean(CardKey.REMOVED.getContentCardsKey()))
	//* 181  376:aload           8
	//* 182  378:getstatic       #251 <Field CardKey CardKey.REMOVED>
	//* 183  381:invokevirtual   #48  <Method String CardKey.getContentCardsKey()>
	//* 184  384:invokevirtual   #109 <Method boolean JSONObject.has(String)>
	//* 185  387:ifeq            458
	//* 186  390:aload           8
	//* 187  392:getstatic       #251 <Field CardKey CardKey.REMOVED>
	//* 188  395:invokevirtual   #48  <Method String CardKey.getContentCardsKey()>
	//* 189  398:invokevirtual   #147 <Method boolean JSONObject.getBoolean(String)>
	//* 190  401:ifeq            458
				{
					obj2 = ((Object) (a));
	//  191  404:getstatic       #31  <Field String a>
	//  192  407:astore          8
					obj3 = ((Object) (new StringBuilder()));
	//  193  409:new             #70  <Class StringBuilder>
	//  194  412:dup             
	//  195  413:invokespecial   #71  <Method void StringBuilder()>
	//  196  416:astore          9
					((StringBuilder) (obj3)).append("Server card is marked as removed. Removing from card storage with id: ");
	//  197  418:aload           9
	//  198  420:ldc1            #253 <String "Server card is marked as removed. Removing from card storage with id: ">
	//  199  422:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  200  425:pop             
					((StringBuilder) (obj3)).append(s);
	//  201  426:aload           9
	//  202  428:aload_2         
	//  203  429:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  204  432:pop             
					AppboyLogger.d(((String) (obj2)), ((StringBuilder) (obj3)).toString());
	//  205  433:aload           8
	//  206  435:aload           9
	//  207  437:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  208  440:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//  209  443:pop             
					g(s);
	//  210  444:aload_0         
	//  211  445:aload_2         
	//  212  446:invokevirtual   #256 <Method void g(String)>
					a(s, ((JSONObject) (null)));
	//  213  449:aload_0         
	//  214  450:aload_2         
	//  215  451:aconst_null     
	//  216  452:invokevirtual   #259 <Method void a(String, JSONObject)>
					continue;
	//  217  455:goto            607
				}
				if(set.contains(((Object) (s))))
	//* 218  458:aload           7
	//* 219  460:aload_2         
	//* 220  461:invokeinterface #144 <Method boolean Set.contains(Object)>
	//* 221  466:ifeq            512
				{
					s = a;
	//  222  469:getstatic       #31  <Field String a>
	//  223  472:astore_2        
					obj3 = ((Object) (new StringBuilder()));
	//  224  473:new             #70  <Class StringBuilder>
	//  225  476:dup             
	//  226  477:invokespecial   #71  <Method void StringBuilder()>
	//  227  480:astore          9
					((StringBuilder) (obj3)).append("Server card was locally dismissed already. Not adding card to storage. Server card: ");
	//  228  482:aload           9
	//  229  484:ldc2            #261 <String "Server card was locally dismissed already. Not adding card to storage. Server card: ">
	//  230  487:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  231  490:pop             
					((StringBuilder) (obj3)).append(obj2);
	//  232  491:aload           9
	//  233  493:aload           8
	//  234  495:invokevirtual   #264 <Method StringBuilder StringBuilder.append(Object)>
	//  235  498:pop             
					AppboyLogger.d(s, ((StringBuilder) (obj3)).toString());
	//  236  499:aload_2         
	//  237  500:aload           9
	//  238  502:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  239  505:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//  240  508:pop             
					continue;
	//  241  509:goto            607
				}
				if(((JSONObject) (obj2)).has(CardKey.DISMISSED.getContentCardsKey()) && ((JSONObject) (obj2)).getBoolean(CardKey.DISMISSED.getContentCardsKey()))
	//* 242  512:aload           8
	//* 243  514:getstatic       #57  <Field CardKey CardKey.DISMISSED>
	//* 244  517:invokevirtual   #48  <Method String CardKey.getContentCardsKey()>
	//* 245  520:invokevirtual   #109 <Method boolean JSONObject.has(String)>
	//* 246  523:ifeq            595
	//* 247  526:aload           8
	//* 248  528:getstatic       #57  <Field CardKey CardKey.DISMISSED>
	//* 249  531:invokevirtual   #48  <Method String CardKey.getContentCardsKey()>
	//* 250  534:invokevirtual   #147 <Method boolean JSONObject.getBoolean(String)>
	//* 251  537:ifeq            595
				{
					obj2 = ((Object) (a));
	//  252  540:getstatic       #31  <Field String a>
	//  253  543:astore          8
					obj3 = ((Object) (new StringBuilder()));
	//  254  545:new             #70  <Class StringBuilder>
	//  255  548:dup             
	//  256  549:invokespecial   #71  <Method void StringBuilder()>
	//  257  552:astore          9
					((StringBuilder) (obj3)).append("Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ");
	//  258  554:aload           9
	//  259  556:ldc2            #266 <String "Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ">
	//  260  559:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  261  562:pop             
					((StringBuilder) (obj3)).append(s);
	//  262  563:aload           9
	//  263  565:aload_2         
	//  264  566:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//  265  569:pop             
					AppboyLogger.d(((String) (obj2)), ((StringBuilder) (obj3)).toString());
	//  266  570:aload           8
	//  267  572:aload           9
	//  268  574:invokevirtual   #80  <Method String StringBuilder.toString()>
	//  269  577:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//  270  580:pop             
					f(s);
	//  271  581:aload_0         
	//  272  582:aload_2         
	//  273  583:invokevirtual   #268 <Method void f(String)>
					a(s, ((JSONObject) (null)));
	//  274  586:aload_0         
	//  275  587:aload_2         
	//  276  588:aconst_null     
	//  277  589:invokevirtual   #259 <Method void a(String, JSONObject)>
				} else
	//* 278  592:goto            607
				{
					a(s, b(((JSONObject) (obj3)), ((JSONObject) (obj2))));
	//  279  595:aload_0         
	//  280  596:aload_2         
	//  281  597:aload           9
	//  282  599:aload           8
	//  283  601:invokestatic    #270 <Method JSONObject b(JSONObject, JSONObject)>
	//  284  604:invokevirtual   #259 <Method void a(String, JSONObject)>
				}
			}

	//  285  607:iload_3         
	//  286  608:iconst_1        
	//  287  609:iadd            
	//  288  610:istore_3        
		}
	//* 289  611:goto            176
		if(cq1.c())
	//* 290  614:aload_1         
	//* 291  615:invokevirtual   #272 <Method boolean cq.c()>
	//* 292  618:ifeq            633
		{
			a(((Set) (obj)));
	//  293  621:aload_0         
	//  294  622:aload           5
	//  295  624:invokevirtual   #275 <Method void a(Set)>
			b(((Set) (obj)));
	//  296  627:aload_0         
	//  297  628:aload           5
	//  298  630:invokevirtual   #277 <Method void b(Set)>
		}
		return a(false);
	//  299  633:aload_0         
	//  300  634:iconst_0        
	//  301  635:invokevirtual   #179 <Method ContentCardsUpdatedEvent a(boolean)>
	//  302  638:areturn         
	}

	ContentCardsUpdatedEvent a(boolean flag)
	{
		Object obj = ((Object) (new com.appboy.enums.CardKey.Provider(true)));
	//    0    0:new             #279 <Class com.appboy.enums.CardKey$Provider>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #282 <Method void com.appboy.enums.CardKey$Provider(boolean)>
	//    4    8:astore_2        
		Object obj2 = ((Object) (c.getAll()));
	//    5    9:aload_0         
	//    6   10:getfield        #92  <Field SharedPreferences c>
	//    7   13:invokeinterface #286 <Method Map SharedPreferences.getAll()>
	//    8   18:astore          4
		Object obj1 = ((Object) (new JSONArray()));
	//    9   20:new             #213 <Class JSONArray>
	//   10   23:dup             
	//   11   24:invokespecial   #287 <Method void JSONArray()>
	//   12   27:astore_3        
		for(obj2 = ((Object) (((Map) (obj2)).values().iterator())); ((Iterator) (obj2)).hasNext(); ((JSONArray) (obj1)).put(((Object) ((String)((Iterator) (obj2)).next()))));
	//   13   28:aload           4
	//   14   30:invokeinterface #293 <Method Collection Map.values()>
	//   15   35:invokeinterface #298 <Method Iterator Collection.iterator()>
	//   16   40:astore          4
	//   17   42:aload           4
	//   18   44:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//   19   49:ifeq            70
	//   20   52:aload_3         
	//   21   53:aload           4
	//   22   55:invokeinterface #131 <Method Object Iterator.next()>
	//   23   60:checkcast       #133 <Class String>
	//   24   63:invokevirtual   #301 <Method JSONArray JSONArray.put(Object)>
	//   25   66:pop             
	//*  26   67:goto            42
		obj = ((Object) (cb.a(((JSONArray) (obj1)), ((com.appboy.enums.CardKey.Provider) (obj)), g, ((dt) (this)), e)));
	//   27   70:aload_3         
	//   28   71:aload_2         
	//   29   72:aload_0         
	//   30   73:getfield        #303 <Field bo g>
	//   31   76:aload_0         
	//   32   77:aload_0         
	//   33   78:getfield        #97  <Field c e>
	//   34   81:invokestatic    #308 <Method List cb.a(JSONArray, com.appboy.enums.CardKey$Provider, bo, dt, c)>
	//   35   84:astore_2        
		obj1 = ((Object) (((List) (obj)).iterator()));
	//   36   85:aload_2         
	//   37   86:invokeinterface #311 <Method Iterator List.iterator()>
	//   38   91:astore_3        
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   39   92:aload_3         
	//   40   93:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//   41   98:ifeq            184
			Card card = (Card)((Iterator) (obj1)).next();
	//   42  101:aload_3         
	//   43  102:invokeinterface #131 <Method Object Iterator.next()>
	//   44  107:checkcast       #313 <Class Card>
	//   45  110:astore          4
			if(card.isExpired())
	//*  46  112:aload           4
	//*  47  114:invokevirtual   #316 <Method boolean Card.isExpired()>
	//*  48  117:ifeq            92
			{
				String s = a;
	//   49  120:getstatic       #31  <Field String a>
	//   50  123:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   51  125:new             #70  <Class StringBuilder>
	//   52  128:dup             
	//   53  129:invokespecial   #71  <Method void StringBuilder()>
	//   54  132:astore          6
				stringbuilder.append("Deleting expired card from storage with id: ");
	//   55  134:aload           6
	//   56  136:ldc2            #318 <String "Deleting expired card from storage with id: ">
	//   57  139:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   58  142:pop             
				stringbuilder.append(card.getId());
	//   59  143:aload           6
	//   60  145:aload           4
	//   61  147:invokevirtual   #321 <Method String Card.getId()>
	//   62  150:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   63  153:pop             
				AppboyLogger.d(s, stringbuilder.toString());
	//   64  154:aload           5
	//   65  156:aload           6
	//   66  158:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   67  161:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//   68  164:pop             
				a(card.getId(), ((JSONObject) (null)));
	//   69  165:aload_0         
	//   70  166:aload           4
	//   71  168:invokevirtual   #321 <Method String Card.getId()>
	//   72  171:aconst_null     
	//   73  172:invokevirtual   #259 <Method void a(String, JSONObject)>
				((Iterator) (obj1)).remove();
	//   74  175:aload_3         
	//   75  176:invokeinterface #324 <Method void Iterator.remove()>
			}
		} while(true);
	//   76  181:goto            92
		return new ContentCardsUpdatedEvent(((List) (obj)), f, f(), flag);
	//   77  184:new             #326 <Class ContentCardsUpdatedEvent>
	//   78  187:dup             
	//   79  188:aload_2         
	//   80  189:aload_0         
	//   81  190:getfield        #62  <Field String f>
	//   82  193:aload_0         
	//   83  194:invokespecial   #328 <Method long f()>
	//   84  197:iload_1         
	//   85  198:invokespecial   #331 <Method void ContentCardsUpdatedEvent(List, String, long, boolean)>
	//   86  201:areturn         
	}

	public void a(bo bo)
	{
		g = bo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #303 <Field bo g>
	//    3    5:return          
	}

	void a(cq cq1)
	{
		android.content.SharedPreferences.Editor editor = d.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field SharedPreferences d>
	//    2    4:invokeinterface #156 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		if(cq1.b() != -1L)
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #334 <Method long cq.b()>
	//*   6   14:ldc2w           #335 <Long -1L>
	//*   7   17:lcmp            
	//*   8   18:ifeq            35
			editor.putLong("last_card_updated_at", cq1.b());
	//    9   21:aload_2         
	//   10   22:ldc2            #338 <String "last_card_updated_at">
	//   11   25:aload_1         
	//   12   26:invokevirtual   #334 <Method long cq.b()>
	//   13   29:invokeinterface #169 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   14   34:pop             
		if(cq1.a() != -1L)
	//*  15   35:aload_1         
	//*  16   36:invokevirtual   #339 <Method long cq.a()>
	//*  17   39:ldc2w           #335 <Long -1L>
	//*  18   42:lcmp            
	//*  19   43:ifeq            60
			editor.putLong("last_full_sync_at", cq1.a());
	//   20   46:aload_2         
	//   21   47:ldc2            #341 <String "last_full_sync_at">
	//   22   50:aload_1         
	//   23   51:invokevirtual   #339 <Method long cq.a()>
	//   24   54:invokeinterface #169 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   25   59:pop             
		editor.apply();
	//   26   60:aload_2         
	//   27   61:invokeinterface #172 <Method void android.content.SharedPreferences$Editor.apply()>
	//   28   66:return          
	}

	public void a(String s)
	{
		a(s, CardKey.READ, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #344 <Field CardKey CardKey.READ>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #347 <Method void a(String, CardKey, boolean)>
	//    5    9:return          
	}

	void a(String s, CardKey cardkey, boolean flag)
	{
		Object obj = ((Object) (e(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #234 <Method JSONObject e(String)>
	//    3    5:astore          4
		if(obj == null)
	//*   4    7:aload           4
	//*   5    9:ifnonnull       52
		{
			cardkey = ((CardKey) (a));
	//    6   12:getstatic       #31  <Field String a>
	//    7   15:astore_2        
			obj = ((Object) (new StringBuilder()));
	//    8   16:new             #70  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #71  <Method void StringBuilder()>
	//   11   23:astore          4
			((StringBuilder) (obj)).append("Can't update card field. Json cannot be parsed from disk or is not present. Id: ");
	//   12   25:aload           4
	//   13   27:ldc2            #351 <String "Can't update card field. Json cannot be parsed from disk or is not present. Id: ">
	//   14   30:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			((StringBuilder) (obj)).append(s);
	//   16   34:aload           4
	//   17   36:aload_1         
	//   18   37:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			AppboyLogger.d(((String) (cardkey)), ((StringBuilder) (obj)).toString());
	//   20   41:aload_2         
	//   21   42:aload           4
	//   22   44:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   23   47:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//   24   50:pop             
			return;
	//   25   51:return          
		}
		try
		{
			((JSONObject) (obj)).put(cardkey.getContentCardsKey(), flag);
	//   26   52:aload           4
	//   27   54:aload_2         
	//   28   55:invokevirtual   #48  <Method String CardKey.getContentCardsKey()>
	//   29   58:iload_3         
	//   30   59:invokevirtual   #150 <Method JSONObject JSONObject.put(String, boolean)>
	//   31   62:pop             
		}
	//*  32   63:aload_0         
	//*  33   64:aload_1         
	//*  34   65:aload           4
	//*  35   67:invokevirtual   #259 <Method void a(String, JSONObject)>
	//*  36   70:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  37   71:astore_1        
		{
			String s1 = a;
	//   38   72:getstatic       #31  <Field String a>
	//   39   75:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   40   77:new             #70  <Class StringBuilder>
	//   41   80:dup             
	//   42   81:invokespecial   #71  <Method void StringBuilder()>
	//   43   84:astore          5
			stringbuilder.append("Failed to update card json field to ");
	//   44   86:aload           5
	//   45   88:ldc2            #353 <String "Failed to update card json field to ">
	//   46   91:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   47   94:pop             
			stringbuilder.append(flag);
	//   48   95:aload           5
	//   49   97:iload_3         
	//   50   98:invokevirtual   #356 <Method StringBuilder StringBuilder.append(boolean)>
	//   51  101:pop             
			stringbuilder.append(" with key: ");
	//   52  102:aload           5
	//   53  104:ldc2            #358 <String " with key: ">
	//   54  107:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   55  110:pop             
			stringbuilder.append(((Object) (cardkey)));
	//   56  111:aload           5
	//   57  113:aload_2         
	//   58  114:invokevirtual   #264 <Method StringBuilder StringBuilder.append(Object)>
	//   59  117:pop             
			AppboyLogger.e(s1, stringbuilder.toString(), ((Throwable) (s)));
	//   60  118:aload           4
	//   61  120:aload           5
	//   62  122:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   63  125:aload_1         
	//   64  126:invokestatic    #361 <Method int AppboyLogger.e(String, String, Throwable)>
	//   65  129:pop             
			return;
	//   66  130:return          
		}
		a(s, ((JSONObject) (obj)));
	}

	void a(String s, JSONObject jsonobject)
	{
		android.content.SharedPreferences.Editor editor = c.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field SharedPreferences c>
	//    2    4:invokeinterface #156 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_3        
		if(jsonobject != null)
	//*   4   10:aload_2         
	//*   5   11:ifnull          49
		{
			if(!(jsonobject instanceof JSONObject))
	//*   6   14:aload_2         
	//*   7   15:instanceof      #105 <Class JSONObject>
	//*   8   18:ifne            29
				jsonobject = ((JSONObject) (jsonobject.toString()));
	//    9   21:aload_2         
	//   10   22:invokevirtual   #241 <Method String JSONObject.toString()>
	//   11   25:astore_2        
			else
	//*  12   26:goto            37
				jsonobject = ((JSONObject) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   13   29:aload_2         
	//   14   30:checkcast       #105 <Class JSONObject>
	//   15   33:invokestatic    #246 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   16   36:astore_2        
			editor.putString(s, ((String) (jsonobject)));
	//   17   37:aload_3         
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokeinterface #365 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   21   45:pop             
		} else
	//*  22   46:goto            57
		{
			editor.remove(s);
	//   23   49:aload_3         
	//   24   50:aload_1         
	//   25   51:invokeinterface #368 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   26   56:pop             
		}
		editor.apply();
	//   27   57:aload_3         
	//   28   58:invokeinterface #172 <Method void android.content.SharedPreferences$Editor.apply()>
	//   29   63:return          
	}

	void a(Set set)
	{
		Set set1 = d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #220 <Method Set d()>
	//    2    4:astore_2        
		set1.retainAll(((Collection) (set)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokeinterface #372 <Method boolean Set.retainAll(Collection)>
	//    6   12:pop             
		d.edit().putStringSet("dismissed", set1).apply();
	//    7   13:aload_0         
	//    8   14:getfield        #88  <Field SharedPreferences d>
	//    9   17:invokeinterface #156 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   10   22:ldc2            #374 <String "dismissed">
	//   11   25:aload_2         
	//   12   26:invokeinterface #378 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   13   31:invokeinterface #172 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   36:return          
	}

	public long b()
	{
		return d.getLong("last_card_updated_at", 0L);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field SharedPreferences d>
	//    2    4:ldc2            #338 <String "last_card_updated_at">
	//    3    7:lconst_0        
	//    4    8:invokeinterface #175 <Method long SharedPreferences.getLong(String, long)>
	//    5   13:lreturn         
	}

	public void b(String s)
	{
		a(s, CardKey.VIEWED, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #44  <Field CardKey CardKey.VIEWED>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #347 <Method void a(String, CardKey, boolean)>
	//    5    9:return          
	}

	void b(Set set)
	{
		Object obj = ((Object) (c.getAll().keySet()));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field SharedPreferences c>
	//    2    4:invokeinterface #286 <Method Map SharedPreferences.getAll()>
	//    3    9:invokeinterface #383 <Method Set Map.keySet()>
	//    4   14:astore_3        
		android.content.SharedPreferences.Editor editor = c.edit();
	//    5   15:aload_0         
	//    6   16:getfield        #92  <Field SharedPreferences c>
	//    7   19:invokeinterface #156 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    8   24:astore_2        
		obj = ((Object) (((Set) (obj)).iterator()));
	//    9   25:aload_3         
	//   10   26:invokeinterface #384 <Method Iterator Set.iterator()>
	//   11   31:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   12   32:aload_3         
	//   13   33:invokeinterface #127 <Method boolean Iterator.hasNext()>
	//   14   38:ifeq            117
			String s = (String)((Iterator) (obj)).next();
	//   15   41:aload_3         
	//   16   42:invokeinterface #131 <Method Object Iterator.next()>
	//   17   47:checkcast       #133 <Class String>
	//   18   50:astore          4
			if(!set.contains(((Object) (s))))
	//*  19   52:aload_1         
	//*  20   53:aload           4
	//*  21   55:invokeinterface #144 <Method boolean Set.contains(Object)>
	//*  22   60:ifne            32
			{
				String s1 = a;
	//   23   63:getstatic       #31  <Field String a>
	//   24   66:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   25   68:new             #70  <Class StringBuilder>
	//   26   71:dup             
	//   27   72:invokespecial   #71  <Method void StringBuilder()>
	//   28   75:astore          6
				stringbuilder.append("Removing card from storage with id: ");
	//   29   77:aload           6
	//   30   79:ldc2            #386 <String "Removing card from storage with id: ">
	//   31   82:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   32   85:pop             
				stringbuilder.append(s);
	//   33   86:aload           6
	//   34   88:aload           4
	//   35   90:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   36   93:pop             
				AppboyLogger.d(s1, stringbuilder.toString());
	//   37   94:aload           5
	//   38   96:aload           6
	//   39   98:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   40  101:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//   41  104:pop             
				editor.remove(s);
	//   42  105:aload_2         
	//   43  106:aload           4
	//   44  108:invokeinterface #368 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   45  113:pop             
			}
		} while(true);
	//   46  114:goto            32
		editor.apply();
	//   47  117:aload_2         
	//   48  118:invokeinterface #172 <Method void android.content.SharedPreferences$Editor.apply()>
	//   49  123:return          
	}

	public long c()
	{
		return d.getLong("last_full_sync_at", 0L);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field SharedPreferences d>
	//    2    4:ldc2            #341 <String "last_full_sync_at">
	//    3    7:lconst_0        
	//    4    8:invokeinterface #175 <Method long SharedPreferences.getLong(String, long)>
	//    5   13:lreturn         
	}

	public void c(String s)
	{
		a(s, CardKey.CLICKED, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #389 <Field CardKey CardKey.CLICKED>
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #347 <Method void a(String, CardKey, boolean)>
	//    5    9:return          
	}

	Set d()
	{
		return ((Set) (new HashSet(((Collection) (d.getStringSet("dismissed", ((Set) (new HashSet()))))))));
	//    0    0:new             #33  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #88  <Field SharedPreferences d>
	//    4    8:ldc2            #374 <String "dismissed">
	//    5   11:new             #33  <Class HashSet>
	//    6   14:dup             
	//    7   15:invokespecial   #36  <Method void HashSet()>
	//    8   18:invokeinterface #393 <Method Set SharedPreferences.getStringSet(String, Set)>
	//    9   23:invokespecial   #396 <Method void HashSet(Collection)>
	//   10   26:areturn         
	}

	public void d(String s)
	{
		f(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #268 <Method void f(String)>
		a(s, ((JSONObject) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #259 <Method void a(String, JSONObject)>
	//    7   11:return          
	}

	JSONObject e(String s)
	{
		String s1 = c.getString(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field SharedPreferences c>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokeinterface #400 <Method String SharedPreferences.getString(String, String)>
	//    5   11:astore_2        
		if(s1 == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       53
		{
			s1 = a;
	//    8   16:getstatic       #31  <Field String a>
	//    9   19:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   10   20:new             #70  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #71  <Method void StringBuilder()>
	//   13   27:astore_3        
			stringbuilder.append("Card not present in storage for id: ");
	//   14   28:aload_3         
	//   15   29:ldc2            #402 <String "Card not present in storage for id: ">
	//   16   32:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			stringbuilder.append(s);
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			AppboyLogger.d(s1, stringbuilder.toString());
	//   22   42:aload_2         
	//   23   43:aload_3         
	//   24   44:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   25   47:invokestatic    #185 <Method int AppboyLogger.d(String, String)>
	//   26   50:pop             
			return null;
	//   27   51:aconst_null     
	//   28   52:areturn         
		}
		try
		{
			s = ((String) (JSONObjectInstrumentation.init(s1)));
	//   29   53:aload_2         
	//   30   54:invokestatic    #405 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   31   57:astore_1        
		}
	//*  32   58:aload_1         
	//*  33   59:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  34   60:astore_1        
		{
			String s2 = a;
	//   35   61:getstatic       #31  <Field String a>
	//   36   64:astore_3        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   37   65:new             #70  <Class StringBuilder>
	//   38   68:dup             
	//   39   69:invokespecial   #71  <Method void StringBuilder()>
	//   40   72:astore          4
			stringbuilder1.append("Failed to read card json from storage. Json: ");
	//   41   74:aload           4
	//   42   76:ldc2            #407 <String "Failed to read card json from storage. Json: ">
	//   43   79:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
			stringbuilder1.append(s1);
	//   45   83:aload           4
	//   46   85:aload_2         
	//   47   86:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   48   89:pop             
			AppboyLogger.e(s2, stringbuilder1.toString(), ((Throwable) (s)));
	//   49   90:aload_3         
	//   50   91:aload           4
	//   51   93:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   52   96:aload_1         
	//   53   97:invokestatic    #361 <Method int AppboyLogger.e(String, String, Throwable)>
	//   54  100:pop             
			return null;
	//   55  101:aconst_null     
	//   56  102:areturn         
		}
		return ((JSONObject) (s));
	}

	void f(String s)
	{
		Set set = d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #220 <Method Set d()>
	//    2    4:astore_2        
		set.add(((Object) (s)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokeinterface #54  <Method boolean Set.add(Object)>
	//    6   12:pop             
		d.edit().putStringSet("dismissed", set).apply();
	//    7   13:aload_0         
	//    8   14:getfield        #88  <Field SharedPreferences d>
	//    9   17:invokeinterface #156 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   10   22:ldc2            #374 <String "dismissed">
	//   11   25:aload_2         
	//   12   26:invokeinterface #378 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   13   31:invokeinterface #172 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   36:return          
	}

	void g(String s)
	{
		Set set = d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #220 <Method Set d()>
	//    2    4:astore_2        
		set.remove(((Object) (s)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokeinterface #409 <Method boolean Set.remove(Object)>
	//    6   12:pop             
		d.edit().putStringSet("dismissed", set).apply();
	//    7   13:aload_0         
	//    8   14:getfield        #88  <Field SharedPreferences d>
	//    9   17:invokeinterface #156 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   10   22:ldc2            #374 <String "dismissed">
	//   11   25:aload_2         
	//   12   26:invokeinterface #378 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putStringSet(String, Set)>
	//   13   31:invokeinterface #172 <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   36:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dn);
	private static final Set b;
	private final SharedPreferences c;
	private final SharedPreferences d;
	private final c e = new a();
	private final String f;
	private bo g;

	static 
	{
	//    0    0:ldc1            #2   <Class dn>
	//    1    2:invokestatic    #29  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #31  <Field String a>
		b = ((Set) (new HashSet()));
	//    3    8:new             #33  <Class HashSet>
	//    4   11:dup             
	//    5   12:invokespecial   #36  <Method void HashSet()>
	//    6   15:putstatic       #38  <Field Set b>
		b.add(((Object) (CardKey.VIEWED.getContentCardsKey())));
	//    7   18:getstatic       #38  <Field Set b>
	//    8   21:getstatic       #44  <Field CardKey CardKey.VIEWED>
	//    9   24:invokevirtual   #48  <Method String CardKey.getContentCardsKey()>
	//   10   27:invokeinterface #54  <Method boolean Set.add(Object)>
	//   11   32:pop             
		b.add(((Object) (CardKey.DISMISSED.getContentCardsKey())));
	//   12   33:getstatic       #38  <Field Set b>
	//   13   36:getstatic       #57  <Field CardKey CardKey.DISMISSED>
	//   14   39:invokevirtual   #48  <Method String CardKey.getContentCardsKey()>
	//   15   42:invokeinterface #54  <Method boolean Set.add(Object)>
	//   16   47:pop             
	//*  17   48:return          
	}
}
