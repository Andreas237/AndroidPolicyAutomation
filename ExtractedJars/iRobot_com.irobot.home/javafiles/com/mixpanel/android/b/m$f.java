// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import android.util.Pair;
import com.mixpanel.android.a.d;
import com.mixpanel.android.a.e;
import com.mixpanel.android.a.f;
import com.mixpanel.android.mpmetrics.h;
import com.mixpanel.android.mpmetrics.j;
import com.mixpanel.android.mpmetrics.l;
import com.mixpanel.android.mpmetrics.r;
import com.mixpanel.android.mpmetrics.u;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.b:
//			m, c, e, n, 
//			d

private class m$f extends Handler
{

	private void a(o$e o$e1)
	{
		JsonWriter jsonwriter;
		if(b == null || !b.a())
			break MISSING_BLOCK_LABEL_151;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field com.mixpanel.android.b.e b>
	//    2    4:ifnull          151
	//    3    7:aload_0         
	//    4    8:getfield        #135 <Field com.mixpanel.android.b.e b>
	//    5   11:invokevirtual   #140 <Method boolean e.a()>
	//    6   14:ifeq            151
		if(!b.b())
	//*   7   17:aload_0         
	//*   8   18:getfield        #135 <Field com.mixpanel.android.b.e b>
	//*   9   21:invokevirtual   #142 <Method boolean e.b()>
	//*  10   24:ifne            28
			return;
	//   11   27:return          
		jsonwriter = new JsonWriter(((java.io.Writer) (new OutputStreamWriter(((java.io.OutputStream) (b.c()))))));
	//   12   28:new             #144 <Class JsonWriter>
	//   13   31:dup             
	//   14   32:new             #146 <Class OutputStreamWriter>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:getfield        #135 <Field com.mixpanel.android.b.e b>
	//   18   40:invokevirtual   #149 <Method java.io.BufferedOutputStream e.c()>
	//   19   43:invokespecial   #152 <Method void OutputStreamWriter(java.io.OutputStream)>
	//   20   46:invokespecial   #155 <Method void JsonWriter(java.io.Writer)>
	//   21   49:astore_2        
		jsonwriter.beginObject();
	//   22   50:aload_2         
	//   23   51:invokevirtual   #159 <Method JsonWriter JsonWriter.beginObject()>
	//   24   54:pop             
		jsonwriter.name("type").value("layout_error");
	//   25   55:aload_2         
	//   26   56:ldc1            #161 <String "type">
	//   27   58:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   28   61:ldc1            #167 <String "layout_error">
	//   29   63:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//   30   66:pop             
		jsonwriter.name("exception_type").value(o$e1.a());
	//   31   67:aload_2         
	//   32   68:ldc1            #172 <String "exception_type">
	//   33   70:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   34   73:aload_1         
	//   35   74:invokevirtual   #176 <Method String o$e.a()>
	//   36   77:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//   37   80:pop             
		jsonwriter.name("cid").value(o$e1.b());
	//   38   81:aload_2         
	//   39   82:ldc1            #178 <String "cid">
	//   40   84:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   41   87:aload_1         
	//   42   88:invokevirtual   #180 <Method String o$e.b()>
	//   43   91:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//   44   94:pop             
		jsonwriter.endObject();
	//   45   95:aload_2         
	//   46   96:invokevirtual   #183 <Method JsonWriter JsonWriter.endObject()>
	//   47   99:pop             
		{
			try
			{
				jsonwriter.close();
	//   48  100:aload_2         
	//   49  101:invokevirtual   #186 <Method void JsonWriter.close()>
				return;
	//   50  104:return          
			}
	//*  51  105:astore_1        
	//*  52  106:goto            133
	//*  53  109:astore_1        
	//*  54  110:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//*  55  112:ldc1            #190 <String "Can't write track_message to server">
	//*  56  114:aload_1         
	//*  57  115:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//*  58  118:aload_2         
	//*  59  119:invokevirtual   #186 <Method void JsonWriter.close()>
	//*  60  122:return          
			// Misplaced declaration of an exception variable
			catch(o$e o$e1)
	//*  61  123:astore_1        
			{
				com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ((Throwable) (o$e1)));
	//   62  124:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   63  126:ldc1            #197 <String "Can't close writer.">
	//   64  128:aload_1         
	//   65  129:invokestatic    #195 <Method void f.e(String, String, Throwable)>
			}
			break MISSING_BLOCK_LABEL_132;
		}
		o$e1;
		break MISSING_BLOCK_LABEL_133;
		o$e1;
		com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", ((Throwable) (o$e1)));
		jsonwriter.close();
		return;
		return;
	//   66  132:return          
		try
		{
			jsonwriter.close();
	//   67  133:aload_2         
	//   68  134:invokevirtual   #186 <Method void JsonWriter.close()>
		}
	//*  69  137:goto            149
		catch(IOException ioexception)
	//*  70  140:astore_2        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ((Throwable) (ioexception)));
	//   71  141:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   72  143:ldc1            #197 <String "Can't close writer.">
	//   73  145:aload_2         
	//   74  146:invokestatic    #195 <Method void f.e(String, String, Throwable)>
		}
		throw o$e1;
	//   75  149:aload_1         
	//   76  150:athrow          
	//   77  151:return          
	}

	private void a(String s)
	{
		if(s == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          107
_L1:
		s = ((String) (new JSONArray(s)));
	//    2    4:new             #202 <Class JSONArray>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #204 <Method void JSONArray(String)>
	//    6   12:astore_1        
		o.clear();
	//    7   13:aload_0         
	//    8   14:getfield        #117 <Field Set o>
	//    9   17:invokeinterface #209 <Method void Set.clear()>
		int i1 = 0;
	//   10   22:iconst_0        
	//   11   23:istore_2        
_L3:
		if(i1 >= ((JSONArray) (s)).length())
			break; /* Loop/switch isn't completed */
	//   12   24:iload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #213 <Method int JSONArray.length()>
	//   15   29:icmpge          107
		JSONObject jsonobject = ((JSONArray) (s)).getJSONObject(i1);
	//   16   32:aload_1         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #217 <Method JSONObject JSONArray.getJSONObject(int)>
	//   19   37:astore_3        
		String s1 = com.mixpanel.android.a.e.a(jsonobject, "target_activity");
	//   20   38:aload_3         
	//   21   39:ldc1            #219 <String "target_activity">
	//   22   41:invokestatic    #224 <Method String e.a(JSONObject, String)>
	//   23   44:astore          4
		o.add(((Object) (new Pair(((Object) (s1)), ((Object) (jsonobject))))));
	//   24   46:aload_0         
	//   25   47:getfield        #117 <Field Set o>
	//   26   50:new             #226 <Class Pair>
	//   27   53:dup             
	//   28   54:aload           4
	//   29   56:aload_3         
	//   30   57:invokespecial   #229 <Method void Pair(Object, Object)>
	//   31   60:invokeinterface #233 <Method boolean Set.add(Object)>
	//   32   65:pop             
		i1++;
	//   33   66:iload_2         
	//   34   67:iconst_1        
	//   35   68:iadd            
	//   36   69:istore_2        
		if(true) goto _L3; else goto _L2
	//   37   70:goto            24
		s;
	//   38   73:astore_1        
		com.mixpanel.android.a.f.c("MixpanelAPI.ViewCrawler", "JSON error when loading event bindings, clearing persistent memory", ((Throwable) (s)));
	//   39   74:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   40   76:ldc1            #235 <String "JSON error when loading event bindings, clearing persistent memory">
	//   41   78:aload_1         
	//   42   79:invokestatic    #237 <Method void f.c(String, String, Throwable)>
		s = ((String) (g().edit()));
	//   43   82:aload_0         
	//   44   83:invokespecial   #240 <Method SharedPreferences g()>
	//   45   86:invokeinterface #246 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   46   91:astore_1        
		((android.content.edPreferences.Editor) (s)).remove("mixpanel.viewcrawler.bindings");
	//   47   92:aload_1         
	//   48   93:ldc1            #248 <String "mixpanel.viewcrawler.bindings">
	//   49   95:invokeinterface #254 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   50  100:pop             
		((android.content.edPreferences.Editor) (s)).apply();
	//   51  101:aload_1         
	//   52  102:invokeinterface #257 <Method void android.content.SharedPreferences$Editor.apply()>
_L2:
	//   53  107:return          
	}

	private void a(String s, boolean flag)
	{
		if(s == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          317
_L1:
		int l1;
		s = ((String) (new JSONArray(s)));
	//    2    4:new             #202 <Class JSONArray>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #204 <Method void JSONArray(String)>
	//    6   12:astore_1        
		l1 = ((JSONArray) (s)).length();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #213 <Method int JSONArray.length()>
	//    9   17:istore          5
		int i1 = 0;
	//   10   19:iconst_0        
	//   11   20:istore_3        
_L7:
		if(i1 >= l1)
			break; /* Loop/switch isn't completed */
	//   12   21:iload_3         
	//   13   22:iload           5
	//   14   24:icmpge          317
		int i2;
		Pair pair;
		Object obj;
		JSONArray jsonarray;
		obj = ((Object) (((JSONArray) (s)).getJSONObject(i1)));
	//   15   27:aload_1         
	//   16   28:iload_3         
	//   17   29:invokevirtual   #217 <Method JSONObject JSONArray.getJSONObject(int)>
	//   18   32:astore          9
		int j1 = ((JSONObject) (obj)).getInt("id");
	//   19   34:aload           9
	//   20   36:ldc2            #260 <String "id">
	//   21   39:invokevirtual   #266 <Method int JSONObject.getInt(String)>
	//   22   42:istore          4
		pair = new Pair(((Object) (Integer.valueOf(((JSONObject) (obj)).getInt("experiment_id")))), ((Object) (Integer.valueOf(j1))));
	//   23   44:new             #226 <Class Pair>
	//   24   47:dup             
	//   25   48:aload           9
	//   26   50:ldc2            #268 <String "experiment_id">
	//   27   53:invokevirtual   #266 <Method int JSONObject.getInt(String)>
	//   28   56:invokestatic    #274 <Method Integer Integer.valueOf(int)>
	//   29   59:iload           4
	//   30   61:invokestatic    #274 <Method Integer Integer.valueOf(int)>
	//   31   64:invokespecial   #229 <Method void Pair(Object, Object)>
	//   32   67:astore          8
		jsonarray = ((JSONObject) (obj)).getJSONArray("actions");
	//   33   69:aload           9
	//   34   71:ldc2            #276 <String "actions">
	//   35   74:invokevirtual   #280 <Method JSONArray JSONObject.getJSONArray(String)>
	//   36   77:astore          10
		i2 = jsonarray.length();
	//   37   79:aload           10
	//   38   81:invokevirtual   #213 <Method int JSONArray.length()>
	//   39   84:istore          6
		int k1 = 0;
	//   40   86:iconst_0        
	//   41   87:istore          4
_L4:
		if(k1 >= i2)
			break; /* Loop/switch isn't completed */
	//   42   89:iload           4
	//   43   91:iload           6
	//   44   93:icmpge          158
		Object obj2 = ((Object) (jsonarray.getJSONObject(k1)));
	//   45   96:aload           10
	//   46   98:iload           4
	//   47  100:invokevirtual   #217 <Method JSONObject JSONArray.getJSONObject(int)>
	//   48  103:astore          11
		String s1 = com.mixpanel.android.a.e.a(((JSONObject) (obj2)), "target_activity");
	//   49  105:aload           11
	//   50  107:ldc1            #219 <String "target_activity">
	//   51  109:invokestatic    #224 <Method String e.a(JSONObject, String)>
	//   52  112:astore          12
		obj2 = ((Object) (new m$d(((JSONObject) (obj2)).getString("name"), s1, ((JSONObject) (obj2)), pair)));
	//   53  114:new             #282 <Class m$d>
	//   54  117:dup             
	//   55  118:aload           11
	//   56  120:ldc2            #283 <String "name">
	//   57  123:invokevirtual   #287 <Method String JSONObject.getString(String)>
	//   58  126:aload           12
	//   59  128:aload           11
	//   60  130:aload           8
	//   61  132:invokespecial   #290 <Method void m$d(String, String, JSONObject, Pair)>
	//   62  135:astore          11
		l.add(obj2);
	//   63  137:aload_0         
	//   64  138:getfield        #111 <Field Set l>
	//   65  141:aload           11
	//   66  143:invokeinterface #233 <Method boolean Set.add(Object)>
	//   67  148:pop             
		k1++;
	//   68  149:iload           4
	//   69  151:iconst_1        
	//   70  152:iadd            
	//   71  153:istore          4
		if(true) goto _L4; else goto _L3
	//   72  155:goto            89
_L3:
		int j2;
		obj = ((Object) (((JSONObject) (obj)).getJSONArray("tweaks")));
	//   73  158:aload           9
	//   74  160:ldc2            #292 <String "tweaks">
	//   75  163:invokevirtual   #280 <Method JSONArray JSONObject.getJSONArray(String)>
	//   76  166:astore          9
		j2 = ((JSONArray) (obj)).length();
	//   77  168:aload           9
	//   78  170:invokevirtual   #213 <Method int JSONArray.length()>
	//   79  173:istore          7
		k1 = 0;
	//   80  175:iconst_0        
	//   81  176:istore          4
_L6:
		if(k1 >= j2)
			break; /* Loop/switch isn't completed */
	//   82  178:iload           4
	//   83  180:iload           7
	//   84  182:icmpge          236
		Object obj1 = ((Object) (((JSONArray) (obj)).getJSONObject(k1)));
	//   85  185:aload           9
	//   86  187:iload           4
	//   87  189:invokevirtual   #217 <Method JSONObject JSONArray.getJSONObject(int)>
	//   88  192:astore          10
		obj1 = ((Object) (new m$e(((JSONObject) (obj1)).getString("name"), ((JSONObject) (obj1)), pair)));
	//   89  194:new             #294 <Class m$e>
	//   90  197:dup             
	//   91  198:aload           10
	//   92  200:ldc2            #283 <String "name">
	//   93  203:invokevirtual   #287 <Method String JSONObject.getString(String)>
	//   94  206:aload           10
	//   95  208:aload           8
	//   96  210:invokespecial   #297 <Method void m$e(String, JSONObject, Pair)>
	//   97  213:astore          10
		m.add(obj1);
	//   98  215:aload_0         
	//   99  216:getfield        #113 <Field Set m>
	//  100  219:aload           10
	//  101  221:invokeinterface #233 <Method boolean Set.add(Object)>
	//  102  226:pop             
		k1++;
	//  103  227:iload           4
	//  104  229:iconst_1        
	//  105  230:iadd            
	//  106  231:istore          4
		if(true) goto _L6; else goto _L5
	//  107  233:goto            178
_L5:
		if(flag)
			break MISSING_BLOCK_LABEL_252;
	//  108  236:iload_2         
	//  109  237:ifne            252
		q.add(((Object) (pair)));
	//  110  240:aload_0         
	//  111  241:getfield        #119 <Field Set q>
	//  112  244:aload           8
	//  113  246:invokeinterface #233 <Method boolean Set.add(Object)>
	//  114  251:pop             
		if(j2 != 0 || i2 != 0)
			break MISSING_BLOCK_LABEL_274;
	//  115  252:iload           7
	//  116  254:ifne            274
	//  117  257:iload           6
	//  118  259:ifne            274
		n.add(((Object) (pair)));
	//  119  262:aload_0         
	//  120  263:getfield        #115 <Field Set n>
	//  121  266:aload           8
	//  122  268:invokeinterface #233 <Method boolean Set.add(Object)>
	//  123  273:pop             
		i1++;
	//  124  274:iload_3         
	//  125  275:iconst_1        
	//  126  276:iadd            
	//  127  277:istore_3        
		if(true) goto _L7; else goto _L2
	//  128  278:goto            21
		s;
	//  129  281:astore_1        
		com.mixpanel.android.a.f.c("MixpanelAPI.ViewCrawler", "JSON error when loading ab tests / tweaks, clearing persistent memory", ((Throwable) (s)));
	//  130  282:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  131  284:ldc2            #299 <String "JSON error when loading ab tests / tweaks, clearing persistent memory">
	//  132  287:aload_1         
	//  133  288:invokestatic    #237 <Method void f.c(String, String, Throwable)>
		s = ((String) (g().edit()));
	//  134  291:aload_0         
	//  135  292:invokespecial   #240 <Method SharedPreferences g()>
	//  136  295:invokeinterface #246 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//  137  300:astore_1        
		((android.content.edPreferences.Editor) (s)).remove("mixpanel.viewcrawler.changes");
	//  138  301:aload_1         
	//  139  302:ldc2            #301 <String "mixpanel.viewcrawler.changes">
	//  140  305:invokeinterface #254 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//  141  310:pop             
		((android.content.edPreferences.Editor) (s)).apply();
	//  142  311:aload_1         
	//  143  312:invokeinterface #257 <Method void android.content.SharedPreferences$Editor.apply()>
_L2:
	//  144  317:return          
	}

	private void a(Set set)
	{
		if(set != null && set.size() > 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          181
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #305 <Method int Set.size()>
	//*   4   10:ifle            181
		{
			JSONObject jsonobject = new JSONObject();
	//    5   13:new             #262 <Class JSONObject>
	//    6   16:dup             
	//    7   17:invokespecial   #306 <Method void JSONObject()>
	//    8   20:astore          4
			try
			{
				Object obj;
				for(set = ((Set) (set.iterator())); ((Iterator) (set)).hasNext(); com.mixpanel.android.b.m.b(a).a("$experiment_started", ((JSONObject) (obj))))
	//*   9   22:aload_1         
	//*  10   23:invokeinterface #310 <Method Iterator Set.iterator()>
	//*  11   28:astore_1        
	//*  12   29:aload_1         
	//*  13   30:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//*  14   35:ifeq            181
				{
					obj = ((Object) ((Pair)((Iterator) (set)).next()));
	//   15   38:aload_1         
	//   16   39:invokeinterface #319 <Method Object Iterator.next()>
	//   17   44:checkcast       #226 <Class Pair>
	//   18   47:astore          5
					int i1 = ((Integer)((Pair) (obj)).first).intValue();
	//   19   49:aload           5
	//   20   51:getfield        #323 <Field Object Pair.first>
	//   21   54:checkcast       #270 <Class Integer>
	//   22   57:invokevirtual   #326 <Method int Integer.intValue()>
	//   23   60:istore_2        
					int j1 = ((Integer)((Pair) (obj)).second).intValue();
	//   24   61:aload           5
	//   25   63:getfield        #329 <Field Object Pair.second>
	//   26   66:checkcast       #270 <Class Integer>
	//   27   69:invokevirtual   #326 <Method int Integer.intValue()>
	//   28   72:istore_3        
					obj = ((Object) (new JSONObject()));
	//   29   73:new             #262 <Class JSONObject>
	//   30   76:dup             
	//   31   77:invokespecial   #306 <Method void JSONObject()>
	//   32   80:astore          5
					((JSONObject) (obj)).put("$experiment_id", i1);
	//   33   82:aload           5
	//   34   84:ldc2            #331 <String "$experiment_id">
	//   35   87:iload_2         
	//   36   88:invokevirtual   #335 <Method JSONObject JSONObject.put(String, int)>
	//   37   91:pop             
					((JSONObject) (obj)).put("$variant_id", j1);
	//   38   92:aload           5
	//   39   94:ldc2            #337 <String "$variant_id">
	//   40   97:iload_3         
	//   41   98:invokevirtual   #335 <Method JSONObject JSONObject.put(String, int)>
	//   42  101:pop             
					jsonobject.put(Integer.toString(i1), j1);
	//   43  102:aload           4
	//   44  104:iload_2         
	//   45  105:invokestatic    #341 <Method String Integer.toString(int)>
	//   46  108:iload_3         
	//   47  109:invokevirtual   #335 <Method JSONObject JSONObject.put(String, int)>
	//   48  112:pop             
					com.mixpanel.android.b.m.b(a).c().a("$experiments", jsonobject);
	//   49  113:aload_0         
	//   50  114:getfield        #46  <Field m a>
	//   51  117:invokestatic    #344 <Method j m.b(m)>
	//   52  120:invokevirtual   #349 <Method com.mixpanel.android.mpmetrics.j$c j.c()>
	//   53  123:ldc2            #351 <String "$experiments">
	//   54  126:aload           4
	//   55  128:invokeinterface #356 <Method void com.mixpanel.android.mpmetrics.j$c.a(String, JSONObject)>
					com.mixpanel.android.b.m.b(a).a(new r(jsonobject) {

						public JSONObject a(JSONObject jsonobject1)
						{
							try
							{
								jsonobject1.put("$experiments", ((Object) (a)));
						//    0    0:aload_1         
						//    1    1:ldc1            #32  <String "$experiments">
						//    2    3:aload_0         
						//    3    4:getfield        #23  <Field JSONObject a>
						//    4    7:invokevirtual   #38  <Method JSONObject JSONObject.put(String, Object)>
						//    5   10:pop             
							}
						//*   6   11:aload_1         
						//*   7   12:areturn         
							catch(JSONException jsonexception)
						//*   8   13:astore_2        
							{
								com.mixpanel.android.a.f.f("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", ((Throwable) (jsonexception)));
						//    9   14:ldc1            #40  <String "MixpanelAPI.ViewCrawler">
						//   10   16:ldc1            #42  <String "Can't write $experiments super property">
						//   11   18:aload_2         
						//   12   19:invokestatic    #47  <Method void f.f(String, String, Throwable)>
								return jsonobject1;
						//   13   22:aload_1         
						//   14   23:areturn         
							}
							return jsonobject1;
						}

						final JSONObject a;
						final m.f b;

			
			{
				b = m.f.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field m$f b>
				a = jsonobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field JSONObject a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
					}
);
	//   56  133:aload_0         
	//   57  134:getfield        #46  <Field m a>
	//   58  137:invokestatic    #344 <Method j m.b(m)>
	//   59  140:new             #9   <Class m$f$1>
	//   60  143:dup             
	//   61  144:aload_0         
	//   62  145:aload           4
	//   63  147:invokespecial   #359 <Method void m$f$1(m$f, JSONObject)>
	//   64  150:invokevirtual   #362 <Method void j.a(r)>
				}

	//   65  153:aload_0         
	//   66  154:getfield        #46  <Field m a>
	//   67  157:invokestatic    #344 <Method j m.b(m)>
	//   68  160:ldc2            #364 <String "$experiment_started">
	//   69  163:aload           5
	//   70  165:invokevirtual   #365 <Method void j.a(String, JSONObject)>
			}
	//*  71  168:goto            29
			// Misplaced declaration of an exception variable
			catch(Set set)
	//*  72  171:astore_1        
			{
				com.mixpanel.android.a.f.f("MixpanelAPI.ViewCrawler", "Could not build JSON for reporting experiment start", ((Throwable) (set)));
	//   73  172:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   74  174:ldc2            #367 <String "Could not build JSON for reporting experiment start">
	//   75  177:aload_1         
	//   76  178:invokestatic    #369 <Method void f.f(String, String, Throwable)>
			}
		}
	//   77  181:return          
	}

	private void a(JSONArray jsonarray)
	{
		android.content.edPreferences.Editor editor = g().edit();
	//    0    0:aload_0         
	//    1    1:invokespecial   #240 <Method SharedPreferences g()>
	//    2    4:invokeinterface #246 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		editor.putString("mixpanel.viewcrawler.changes", jsonarray.toString());
	//    4   10:aload_2         
	//    5   11:ldc2            #301 <String "mixpanel.viewcrawler.changes">
	//    6   14:aload_1         
	//    7   15:invokevirtual   #374 <Method String JSONArray.toString()>
	//    8   18:invokeinterface #378 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    9   23:pop             
		editor.apply();
	//   10   24:aload_2         
	//   11   25:invokeinterface #257 <Method void android.content.SharedPreferences$Editor.apply()>
	//   12   30:return          
	}

	private void a(JSONObject jsonobject)
	{
		long l1 = System.currentTimeMillis();
	//    0    0:invokestatic    #387 <Method long System.currentTimeMillis()>
	//    1    3:lstore_2        
		long l2;
		java.io.BufferedOutputStream bufferedoutputstream;
		Object obj;
		try
		{
			jsonobject = jsonobject.getJSONObject("payload");
	//    2    4:aload_1         
	//    3    5:ldc2            #389 <String "payload">
	//    4    8:invokevirtual   #392 <Method JSONObject JSONObject.getJSONObject(String)>
	//    5   11:astore_1        
			if(jsonobject.has("config"))
	//*   6   12:aload_1         
	//*   7   13:ldc2            #394 <String "config">
	//*   8   16:invokevirtual   #398 <Method boolean JSONObject.has(String)>
	//*   9   19:ifeq            42
			{
				c = f.b(jsonobject);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #88  <Field c f>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #401 <Method n c.b(JSONObject)>
	//   15   31:putfield        #53  <Field n c>
				com.mixpanel.android.a.f.a("MixpanelAPI.ViewCrawler", "Initializing snapshot with configuration");
	//   16   34:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   17   36:ldc2            #403 <String "Initializing snapshot with configuration">
	//   18   39:invokestatic    #406 <Method void f.a(String, String)>
			}
		}
	//*  19   42:aload_0         
	//*  20   43:getfield        #53  <Field n c>
	//*  21   46:ifnonnull       65
	//*  22   49:aload_0         
	//*  23   50:ldc2            #408 <String "No snapshot configuration (or a malformed snapshot configuration) was sent.">
	//*  24   53:invokespecial   #410 <Method void b(String)>
	//*  25   56:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//*  26   58:ldc2            #412 <String "Mixpanel editor is misconfigured, sent a snapshot request without a valid configuration.">
	//*  27   61:invokestatic    #414 <Method void f.d(String, String)>
	//*  28   64:return          
	//*  29   65:aload_0         
	//*  30   66:getfield        #135 <Field com.mixpanel.android.b.e b>
	//*  31   69:invokevirtual   #149 <Method java.io.BufferedOutputStream e.c()>
	//*  32   72:astore          6
	//*  33   74:new             #146 <Class OutputStreamWriter>
	//*  34   77:dup             
	//*  35   78:aload           6
	//*  36   80:invokespecial   #152 <Method void OutputStreamWriter(java.io.OutputStream)>
	//*  37   83:astore_1        
	//*  38   84:aload_1         
	//*  39   85:ldc2            #416 <String "{">
	//*  40   88:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
	//*  41   91:aload_1         
	//*  42   92:ldc2            #421 <String "\"type\": \"snapshot_response\",">
	//*  43   95:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
	//*  44   98:aload_1         
	//*  45   99:ldc2            #423 <String "\"payload\": {">
	//*  46  102:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
	//*  47  105:aload_1         
	//*  48  106:ldc2            #425 <String "\"activities\":">
	//*  49  109:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
	//*  50  112:aload_1         
	//*  51  113:invokevirtual   #428 <Method void OutputStreamWriter.flush()>
	//*  52  116:aload_0         
	//*  53  117:getfield        #53  <Field n c>
	//*  54  120:aload_0         
	//*  55  121:getfield        #46  <Field m a>
	//*  56  124:invokestatic    #431 <Method com.mixpanel.android.b.d m.c(m)>
	//*  57  127:aload           6
	//*  58  129:invokevirtual   #436 <Method void n.a(k, java.io.OutputStream)>
	//*  59  132:invokestatic    #387 <Method long System.currentTimeMillis()>
	//*  60  135:lstore          4
	//*  61  137:aload_1         
	//*  62  138:ldc2            #438 <String ",\"snapshot_time_millis\": ">
	//*  63  141:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
	//*  64  144:aload_1         
	//*  65  145:lload           4
	//*  66  147:lload_2         
	//*  67  148:lsub            
	//*  68  149:invokestatic    #443 <Method String Long.toString(long)>
	//*  69  152:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
	//*  70  155:aload_1         
	//*  71  156:ldc2            #445 <String "}">
	//*  72  159:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
	//*  73  162:aload_1         
	//*  74  163:ldc2            #445 <String "}">
	//*  75  166:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
	//*  76  169:aload_1         
	//*  77  170:invokevirtual   #446 <Method void OutputStreamWriter.close()>
	//*  78  173:return          
	//*  79  174:astore          6
	//*  80  176:goto            206
	//*  81  179:astore          6
	//*  82  181:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//*  83  183:ldc2            #448 <String "Can't write snapshot request to server">
	//*  84  186:aload           6
	//*  85  188:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//*  86  191:aload_1         
	//*  87  192:invokevirtual   #446 <Method void OutputStreamWriter.close()>
	//*  88  195:return          
	//*  89  196:astore_1        
	//*  90  197:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//*  91  199:ldc1            #197 <String "Can't close writer.">
	//*  92  201:aload_1         
	//*  93  202:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//*  94  205:return          
	//*  95  206:aload_1         
	//*  96  207:invokevirtual   #446 <Method void OutputStreamWriter.close()>
	//*  97  210:goto            222
	//*  98  213:astore_1        
	//*  99  214:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//* 100  216:ldc1            #197 <String "Can't close writer.">
	//* 101  218:aload_1         
	//* 102  219:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//* 103  222:aload           6
	//* 104  224:athrow          
	//* 105  225:astore_1        
	//* 106  226:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//* 107  228:ldc2            #450 <String "Editor sent malformed message with snapshot request">
	//* 108  231:aload_1         
	//* 109  232:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//* 110  235:aload_0         
	//* 111  236:aload_1         
	//* 112  237:invokevirtual   #453 <Method String c$a.getMessage()>
	//* 113  240:invokespecial   #410 <Method void b(String)>
	//* 114  243:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//* 115  244:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Payload with snapshot config required with snapshot request", ((Throwable) (jsonobject)));
	//  116  245:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  117  247:ldc2            #455 <String "Payload with snapshot config required with snapshot request">
	//  118  250:aload_1         
	//  119  251:invokestatic    #195 <Method void f.e(String, String, Throwable)>
			b("Payload with snapshot config required with snapshot request");
	//  120  254:aload_0         
	//  121  255:ldc2            #455 <String "Payload with snapshot config required with snapshot request">
	//  122  258:invokespecial   #410 <Method void b(String)>
			return;
	//  123  261:return          
		}
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Editor sent malformed message with snapshot request", ((Throwable) (jsonobject)));
			b(((c$a) (jsonobject)).getMessage());
			return;
		}
		if(c == null)
		{
			b("No snapshot configuration (or a malformed snapshot configuration) was sent.");
			com.mixpanel.android.a.f.d("MixpanelAPI.ViewCrawler", "Mixpanel editor is misconfigured, sent a snapshot request without a valid configuration.");
			return;
		}
		bufferedoutputstream = b.c();
		jsonobject = ((JSONObject) (new OutputStreamWriter(((java.io.OutputStream) (bufferedoutputstream)))));
		((OutputStreamWriter) (jsonobject)).write("{");
		((OutputStreamWriter) (jsonobject)).write("\"type\": \"snapshot_response\",");
		((OutputStreamWriter) (jsonobject)).write("\"payload\": {");
		((OutputStreamWriter) (jsonobject)).write("\"activities\":");
		((OutputStreamWriter) (jsonobject)).flush();
		c.a(((k) (com.mixpanel.android.b.m.c(a))), ((java.io.OutputStream) (bufferedoutputstream)));
		l2 = System.currentTimeMillis();
		((OutputStreamWriter) (jsonobject)).write(",\"snapshot_time_millis\": ");
		((OutputStreamWriter) (jsonobject)).write(Long.toString(l2 - l1));
		((OutputStreamWriter) (jsonobject)).write("}");
		((OutputStreamWriter) (jsonobject)).write("}");
		{
			try
			{
				((OutputStreamWriter) (jsonobject)).close();
				return;
			}
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
			{
				com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ((Throwable) (jsonobject)));
			}
			break MISSING_BLOCK_LABEL_205;
		}
		obj;
		break MISSING_BLOCK_LABEL_206;
		obj;
		com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't write snapshot request to server", ((Throwable) (obj)));
		((OutputStreamWriter) (jsonobject)).close();
		return;
		return;
		try
		{
			((OutputStreamWriter) (jsonobject)).close();
		}
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ((Throwable) (jsonobject)));
		}
		throw obj;
	}

	private void b()
	{
		Object obj = ((Object) (g()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #240 <Method SharedPreferences g()>
	//    2    4:astore_2        
		String s = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.changes", ((String) (null)));
	//    3    5:aload_2         
	//    4    6:ldc2            #301 <String "mixpanel.viewcrawler.changes">
	//    5    9:aconst_null     
	//    6   10:invokeinterface #458 <Method String SharedPreferences.getString(String, String)>
	//    7   15:astore_1        
		obj = ((Object) (((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.bindings", ((String) (null)))));
	//    8   16:aload_2         
	//    9   17:ldc1            #248 <String "mixpanel.viewcrawler.bindings">
	//   10   19:aconst_null     
	//   11   20:invokeinterface #458 <Method String SharedPreferences.getString(String, String)>
	//   12   25:astore_2        
		l.clear();
	//   13   26:aload_0         
	//   14   27:getfield        #111 <Field Set l>
	//   15   30:invokeinterface #209 <Method void Set.clear()>
		m.clear();
	//   16   35:aload_0         
	//   17   36:getfield        #113 <Field Set m>
	//   18   39:invokeinterface #209 <Method void Set.clear()>
		q.clear();
	//   19   44:aload_0         
	//   20   45:getfield        #119 <Field Set q>
	//   21   48:invokeinterface #209 <Method void Set.clear()>
		a(s, false);
	//   22   53:aload_0         
	//   23   54:aload_1         
	//   24   55:iconst_0        
	//   25   56:invokespecial   #460 <Method void a(String, boolean)>
		o.clear();
	//   26   59:aload_0         
	//   27   60:getfield        #117 <Field Set o>
	//   28   63:invokeinterface #209 <Method void Set.clear()>
		a(((String) (obj)));
	//   29   68:aload_0         
	//   30   69:aload_2         
	//   31   70:invokespecial   #462 <Method void a(String)>
		f();
	//   32   73:aload_0         
	//   33   74:invokespecial   #464 <Method void f()>
	//   34   77:return          
	}

	private void b(String s)
	{
		JSONObject jsonobject;
		if(b == null || !b.a())
			break MISSING_BLOCK_LABEL_156;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field com.mixpanel.android.b.e b>
	//    2    4:ifnull          156
	//    3    7:aload_0         
	//    4    8:getfield        #135 <Field com.mixpanel.android.b.e b>
	//    5   11:invokevirtual   #140 <Method boolean e.a()>
	//    6   14:ifeq            156
		if(!b.b())
	//*   7   17:aload_0         
	//*   8   18:getfield        #135 <Field com.mixpanel.android.b.e b>
	//*   9   21:invokevirtual   #142 <Method boolean e.b()>
	//*  10   24:ifne            28
			return;
	//   11   27:return          
		jsonobject = new JSONObject();
	//   12   28:new             #262 <Class JSONObject>
	//   13   31:dup             
	//   14   32:invokespecial   #306 <Method void JSONObject()>
	//   15   35:astore_2        
		try
		{
			jsonobject.put("error_message", ((Object) (s)));
	//   16   36:aload_2         
	//   17   37:ldc2            #466 <String "error_message">
	//   18   40:aload_1         
	//   19   41:invokevirtual   #469 <Method JSONObject JSONObject.put(String, Object)>
	//   20   44:pop             
		}
	//*  21   45:goto            58
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  22   48:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Apparently impossible JSONException", ((Throwable) (s)));
	//   23   49:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   24   51:ldc2            #471 <String "Apparently impossible JSONException">
	//   25   54:aload_1         
	//   26   55:invokestatic    #195 <Method void f.e(String, String, Throwable)>
		}
		s = ((String) (new OutputStreamWriter(((java.io.OutputStream) (b.c())))));
	//   27   58:new             #146 <Class OutputStreamWriter>
	//   28   61:dup             
	//   29   62:aload_0         
	//   30   63:getfield        #135 <Field com.mixpanel.android.b.e b>
	//   31   66:invokevirtual   #149 <Method java.io.BufferedOutputStream e.c()>
	//   32   69:invokespecial   #152 <Method void OutputStreamWriter(java.io.OutputStream)>
	//   33   72:astore_1        
		((OutputStreamWriter) (s)).write("{\"type\": \"error\", ");
	//   34   73:aload_1         
	//   35   74:ldc2            #473 <String "{\"type\": \"error\", ">
	//   36   77:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
		((OutputStreamWriter) (s)).write("\"payload\": ");
	//   37   80:aload_1         
	//   38   81:ldc2            #475 <String "\"payload\": ">
	//   39   84:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
		((OutputStreamWriter) (s)).write(jsonobject.toString());
	//   40   87:aload_1         
	//   41   88:aload_2         
	//   42   89:invokevirtual   #476 <Method String JSONObject.toString()>
	//   43   92:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
		((OutputStreamWriter) (s)).write("}");
	//   44   95:aload_1         
	//   45   96:ldc2            #445 <String "}">
	//   46   99:invokevirtual   #419 <Method void OutputStreamWriter.write(String)>
		Object obj;
		{
			try
			{
				((OutputStreamWriter) (s)).close();
	//   47  102:aload_1         
	//   48  103:invokevirtual   #446 <Method void OutputStreamWriter.close()>
				return;
	//   49  106:return          
			}
	//*  50  107:astore_2        
	//*  51  108:goto            137
	//*  52  111:astore_2        
	//*  53  112:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//*  54  114:ldc2            #478 <String "Can't write error message to editor">
	//*  55  117:aload_2         
	//*  56  118:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//*  57  121:aload_1         
	//*  58  122:invokevirtual   #446 <Method void OutputStreamWriter.close()>
	//*  59  125:return          
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  60  126:astore_1        
			{
				com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", ((Throwable) (s)));
	//   61  127:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   62  129:ldc2            #480 <String "Could not close output writer to editor">
	//   63  132:aload_1         
	//   64  133:invokestatic    #195 <Method void f.e(String, String, Throwable)>
			}
			break MISSING_BLOCK_LABEL_136;
		}
		obj;
		break MISSING_BLOCK_LABEL_137;
		obj;
		com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't write error message to editor", ((Throwable) (obj)));
		((OutputStreamWriter) (s)).close();
		return;
		return;
	//   65  136:return          
		try
		{
			((OutputStreamWriter) (s)).close();
	//   66  137:aload_1         
	//   67  138:invokevirtual   #446 <Method void OutputStreamWriter.close()>
		}
	//*  68  141:goto            154
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  69  144:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", ((Throwable) (s)));
	//   70  145:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   71  147:ldc2            #480 <String "Could not close output writer to editor">
	//   72  150:aload_1         
	//   73  151:invokestatic    #195 <Method void f.e(String, String, Throwable)>
		}
		throw obj;
	//   74  154:aload_2         
	//   75  155:athrow          
	//   76  156:return          
	}

	private void b(JSONArray jsonarray)
	{
		a(jsonarray);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #482 <Method void a(JSONArray)>
		a(jsonarray.toString(), true);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #374 <Method String JSONArray.toString()>
	//    6   10:iconst_1        
	//    7   11:invokespecial   #460 <Method void a(String, boolean)>
		f();
	//    8   14:aload_0         
	//    9   15:invokespecial   #464 <Method void f()>
	//   10   18:return          
	}

	private void b(JSONObject jsonobject)
	{
		jsonobject = ((JSONObject) (jsonobject.getJSONObject("payload").getJSONArray("actions")));
	//    0    0:aload_1         
	//    1    1:ldc2            #389 <String "payload">
	//    2    4:invokevirtual   #392 <Method JSONObject JSONObject.getJSONObject(String)>
	//    3    7:ldc2            #276 <String "actions">
	//    4   10:invokevirtual   #280 <Method JSONArray JSONObject.getJSONArray(String)>
	//    5   13:astore_1        
		int i1 = 0;
	//    6   14:iconst_0        
	//    7   15:istore_2        
_L2:
		if(i1 >= ((JSONArray) (jsonobject)).length())
			break; /* Loop/switch isn't completed */
	//    8   16:iload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #213 <Method int JSONArray.length()>
	//   11   21:icmpge          76
		JSONObject jsonobject1 = ((JSONArray) (jsonobject)).getJSONObject(i1);
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #217 <Method JSONObject JSONArray.getJSONObject(int)>
	//   15   29:astore_3        
		String s = com.mixpanel.android.a.e.a(jsonobject1, "target_activity");
	//   16   30:aload_3         
	//   17   31:ldc1            #219 <String "target_activity">
	//   18   33:invokestatic    #224 <Method String e.a(JSONObject, String)>
	//   19   36:astore          4
		String s1 = jsonobject1.getString("name");
	//   20   38:aload_3         
	//   21   39:ldc2            #283 <String "name">
	//   22   42:invokevirtual   #287 <Method String JSONObject.getString(String)>
	//   23   45:astore          5
		h.put(((Object) (s1)), ((Object) (new Pair(((Object) (s)), ((Object) (jsonobject1))))));
	//   24   47:aload_0         
	//   25   48:getfield        #100 <Field Map h>
	//   26   51:aload           5
	//   27   53:new             #226 <Class Pair>
	//   28   56:dup             
	//   29   57:aload           4
	//   30   59:aload_3         
	//   31   60:invokespecial   #229 <Method void Pair(Object, Object)>
	//   32   63:invokeinterface #487 <Method Object Map.put(Object, Object)>
	//   33   68:pop             
		i1++;
	//   34   69:iload_2         
	//   35   70:iconst_1        
	//   36   71:iadd            
	//   37   72:istore_2        
		if(true) goto _L2; else goto _L1
	//   38   73:goto            16
_L1:
		try
		{
			f();
	//   39   76:aload_0         
	//   40   77:invokespecial   #464 <Method void f()>
			return;
	//   41   80:return          
		}
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  42   81:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Bad change request received", ((Throwable) (jsonobject)));
	//   43   82:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   44   84:ldc2            #489 <String "Bad change request received">
	//   45   87:aload_1         
	//   46   88:invokestatic    #195 <Method void f.e(String, String, Throwable)>
		}
		return;
	//   47   91:return          
	}

	private void c()
	{
		com.mixpanel.android.a.f.a("MixpanelAPI.ViewCrawler", "connecting to editor");
	//    0    0:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//    1    2:ldc2            #495 <String "connecting to editor">
	//    2    5:invokestatic    #406 <Method void f.a(String, String)>
		if(b == null || !b.a()) goto _L2; else goto _L1
	//    3    8:aload_0         
	//    4    9:getfield        #135 <Field com.mixpanel.android.b.e b>
	//    5   12:ifnull          36
	//    6   15:aload_0         
	//    7   16:getfield        #135 <Field com.mixpanel.android.b.e b>
	//    8   19:invokevirtual   #140 <Method boolean e.a()>
	//    9   22:ifeq            36
_L1:
		Object obj = "There is already a valid connection to an events editor.";
	//   10   25:ldc2            #497 <String "There is already a valid connection to an events editor.">
	//   11   28:astore_1        
_L4:
		com.mixpanel.android.a.f.a("MixpanelAPI.ViewCrawler", ((String) (obj)));
	//   12   29:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   13   31:aload_1         
	//   14   32:invokestatic    #406 <Method void f.a(String, String)>
		return;
	//   15   35:return          
_L2:
		obj = ((Object) (com.mixpanel.android.b.m.d(a).y()));
	//   16   36:aload_0         
	//   17   37:getfield        #46  <Field m a>
	//   18   40:invokestatic    #56  <Method h com.mixpanel.android.b.m.d(m)>
	//   19   43:invokevirtual   #501 <Method SSLSocketFactory h.y()>
	//   20   46:astore_1        
		if(obj != null)
			break; /* Loop/switch isn't completed */
	//   21   47:aload_1         
	//   22   48:ifnonnull       58
		obj = "SSL is not available on this device, no connection will be attempted to the events editor.";
	//   23   51:ldc2            #503 <String "SSL is not available on this device, no connection will be attempted to the events editor.">
	//   24   54:astore_1        
		if(true) goto _L4; else goto _L3
	//   25   55:goto            29
_L3:
		Object obj2;
		obj2 = ((Object) (new StringBuilder()));
	//   26   58:new             #505 <Class StringBuilder>
	//   27   61:dup             
	//   28   62:invokespecial   #506 <Method void StringBuilder()>
	//   29   65:astore_2        
		((StringBuilder) (obj2)).append(com.mixpanel.android.mpmetrics.h.a(com.mixpanel.android.b.m.e(a)).o());
	//   30   66:aload_2         
	//   31   67:aload_0         
	//   32   68:getfield        #46  <Field m a>
	//   33   71:invokestatic    #509 <Method Context com.mixpanel.android.b.m.e(m)>
	//   34   74:invokestatic    #512 <Method h h.a(Context)>
	//   35   77:invokevirtual   #514 <Method String h.o()>
	//   36   80:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   37   83:pop             
		((StringBuilder) (obj2)).append(d);
	//   38   84:aload_2         
	//   39   85:aload_0         
	//   40   86:getfield        #51  <Field String d>
	//   41   89:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
		obj2 = ((Object) (((StringBuilder) (obj2)).toString()));
	//   43   93:aload_2         
	//   44   94:invokevirtual   #519 <Method String StringBuilder.toString()>
	//   45   97:astore_2        
		obj = ((Object) (((SSLSocketFactory) (obj)).createSocket()));
	//   46   98:aload_1         
	//   47   99:invokevirtual   #525 <Method java.net.Socket SSLSocketFactory.createSocket()>
	//   48  102:astore_1        
		b = new com.mixpanel.android.b.e(new URI(((String) (obj2))), ((e$a) (new m$a(a, ((m$1) (null))))), ((java.net.Socket) (obj)));
	//   49  103:aload_0         
	//   50  104:new             #137 <Class com.mixpanel.android.b.e>
	//   51  107:dup             
	//   52  108:new             #527 <Class URI>
	//   53  111:dup             
	//   54  112:aload_2         
	//   55  113:invokespecial   #528 <Method void URI(String)>
	//   56  116:new             #530 <Class m$a>
	//   57  119:dup             
	//   58  120:aload_0         
	//   59  121:getfield        #46  <Field m a>
	//   60  124:aconst_null     
	//   61  125:invokespecial   #533 <Method void m$a(m, m$1)>
	//   62  128:aload_1         
	//   63  129:invokespecial   #536 <Method void com.mixpanel.android.b.e(URI, e$a, java.net.Socket)>
	//   64  132:putfield        #135 <Field com.mixpanel.android.b.e b>
		return;
	//   65  135:return          
		Object obj1;
		obj1;
	//   66  136:astore_1        
		com.mixpanel.android.a.f.c("MixpanelAPI.ViewCrawler", "Can't create SSL Socket to connect to editor service", ((Throwable) (obj1)));
	//   67  137:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   68  139:ldc2            #538 <String "Can't create SSL Socket to connect to editor service">
	//   69  142:aload_1         
	//   70  143:invokestatic    #237 <Method void f.c(String, String, Throwable)>
		return;
	//   71  146:return          
		obj1;
	//   72  147:astore_1        
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder();
	//   73  148:new             #505 <Class StringBuilder>
	//   74  151:dup             
	//   75  152:invokespecial   #506 <Method void StringBuilder()>
	//   76  155:astore_3        
		stringbuilder.append("Error connecting to URI ");
	//   77  156:aload_3         
	//   78  157:ldc2            #540 <String "Error connecting to URI ">
	//   79  160:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   80  163:pop             
		break MISSING_BLOCK_LABEL_194;
	//   81  164:goto            194
		obj1;
	//   82  167:astore_1        
		stringbuilder = new StringBuilder();
	//   83  168:new             #505 <Class StringBuilder>
	//   84  171:dup             
	//   85  172:invokespecial   #506 <Method void StringBuilder()>
	//   86  175:astore_3        
		stringbuilder.append("Error parsing URI ");
	//   87  176:aload_3         
	//   88  177:ldc2            #542 <String "Error parsing URI ">
	//   89  180:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   90  183:pop             
		stringbuilder.append(((String) (obj2)));
	//   91  184:aload_3         
	//   92  185:aload_2         
	//   93  186:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   94  189:pop             
		obj2 = " for editor websocket";
	//   95  190:ldc2            #544 <String " for editor websocket">
	//   96  193:astore_2        
		stringbuilder.append(((String) (obj2)));
	//   97  194:aload_3         
	//   98  195:aload_2         
	//   99  196:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//  100  199:pop             
		com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", stringbuilder.toString(), ((Throwable) (obj1)));
	//  101  200:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  102  202:aload_3         
	//  103  203:invokevirtual   #519 <Method String StringBuilder.toString()>
	//  104  206:aload_1         
	//  105  207:invokestatic    #195 <Method void f.e(String, String, Throwable)>
		return;
	//  106  210:return          
	}

	private void c(String s)
	{
		JsonWriter jsonwriter;
		if(b == null || !b.a())
			break MISSING_BLOCK_LABEL_158;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field com.mixpanel.android.b.e b>
	//    2    4:ifnull          158
	//    3    7:aload_0         
	//    4    8:getfield        #135 <Field com.mixpanel.android.b.e b>
	//    5   11:invokevirtual   #140 <Method boolean e.a()>
	//    6   14:ifeq            158
		if(!b.b())
	//*   7   17:aload_0         
	//*   8   18:getfield        #135 <Field com.mixpanel.android.b.e b>
	//*   9   21:invokevirtual   #142 <Method boolean e.b()>
	//*  10   24:ifne            28
			return;
	//   11   27:return          
		jsonwriter = new JsonWriter(((java.io.Writer) (new OutputStreamWriter(((java.io.OutputStream) (b.c()))))));
	//   12   28:new             #144 <Class JsonWriter>
	//   13   31:dup             
	//   14   32:new             #146 <Class OutputStreamWriter>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:getfield        #135 <Field com.mixpanel.android.b.e b>
	//   18   40:invokevirtual   #149 <Method java.io.BufferedOutputStream e.c()>
	//   19   43:invokespecial   #152 <Method void OutputStreamWriter(java.io.OutputStream)>
	//   20   46:invokespecial   #155 <Method void JsonWriter(java.io.Writer)>
	//   21   49:astore_2        
		jsonwriter.beginObject();
	//   22   50:aload_2         
	//   23   51:invokevirtual   #159 <Method JsonWriter JsonWriter.beginObject()>
	//   24   54:pop             
		jsonwriter.name("type").value("track_message");
	//   25   55:aload_2         
	//   26   56:ldc1            #161 <String "type">
	//   27   58:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   28   61:ldc2            #546 <String "track_message">
	//   29   64:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//   30   67:pop             
		jsonwriter.name("payload");
	//   31   68:aload_2         
	//   32   69:ldc2            #389 <String "payload">
	//   33   72:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   34   75:pop             
		jsonwriter.beginObject();
	//   35   76:aload_2         
	//   36   77:invokevirtual   #159 <Method JsonWriter JsonWriter.beginObject()>
	//   37   80:pop             
		jsonwriter.name("event_name").value(s);
	//   38   81:aload_2         
	//   39   82:ldc2            #548 <String "event_name">
	//   40   85:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   41   88:aload_1         
	//   42   89:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//   43   92:pop             
		jsonwriter.endObject();
	//   44   93:aload_2         
	//   45   94:invokevirtual   #183 <Method JsonWriter JsonWriter.endObject()>
	//   46   97:pop             
		jsonwriter.endObject();
	//   47   98:aload_2         
	//   48   99:invokevirtual   #183 <Method JsonWriter JsonWriter.endObject()>
	//   49  102:pop             
		jsonwriter.flush();
	//   50  103:aload_2         
	//   51  104:invokevirtual   #549 <Method void JsonWriter.flush()>
		{
			try
			{
				jsonwriter.close();
	//   52  107:aload_2         
	//   53  108:invokevirtual   #186 <Method void JsonWriter.close()>
				return;
	//   54  111:return          
			}
	//*  55  112:astore_1        
	//*  56  113:goto            140
	//*  57  116:astore_1        
	//*  58  117:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//*  59  119:ldc1            #190 <String "Can't write track_message to server">
	//*  60  121:aload_1         
	//*  61  122:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//*  62  125:aload_2         
	//*  63  126:invokevirtual   #186 <Method void JsonWriter.close()>
	//*  64  129:return          
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  65  130:astore_1        
			{
				com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ((Throwable) (s)));
	//   66  131:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   67  133:ldc1            #197 <String "Can't close writer.">
	//   68  135:aload_1         
	//   69  136:invokestatic    #195 <Method void f.e(String, String, Throwable)>
			}
			break MISSING_BLOCK_LABEL_139;
		}
		s;
		break MISSING_BLOCK_LABEL_140;
		s;
		com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", ((Throwable) (s)));
		jsonwriter.close();
		return;
		return;
	//   70  139:return          
		try
		{
			jsonwriter.close();
	//   71  140:aload_2         
	//   72  141:invokevirtual   #186 <Method void JsonWriter.close()>
		}
	//*  73  144:goto            156
		catch(IOException ioexception)
	//*  74  147:astore_2        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ((Throwable) (ioexception)));
	//   75  148:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   76  150:ldc1            #197 <String "Can't close writer.">
	//   77  152:aload_2         
	//   78  153:invokestatic    #195 <Method void f.e(String, String, Throwable)>
		}
		throw s;
	//   79  156:aload_1         
	//   80  157:athrow          
	//   81  158:return          
	}

	private void c(JSONArray jsonarray)
	{
		android.content.edPreferences.Editor editor = g().edit();
	//    0    0:aload_0         
	//    1    1:invokespecial   #240 <Method SharedPreferences g()>
	//    2    4:invokeinterface #246 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		editor.putString("mixpanel.viewcrawler.bindings", jsonarray.toString());
	//    4   10:aload_2         
	//    5   11:ldc1            #248 <String "mixpanel.viewcrawler.bindings">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #374 <Method String JSONArray.toString()>
	//    8   17:invokeinterface #378 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    9   22:pop             
		editor.apply();
	//   10   23:aload_2         
	//   11   24:invokeinterface #257 <Method void android.content.SharedPreferences$Editor.apply()>
		a(jsonarray.toString());
	//   12   29:aload_0         
	//   13   30:aload_1         
	//   14   31:invokevirtual   #374 <Method String JSONArray.toString()>
	//   15   34:invokespecial   #462 <Method void a(String)>
		f();
	//   16   37:aload_0         
	//   17   38:invokespecial   #464 <Method void f()>
	//   18   41:return          
	}

	private void c(JSONObject jsonobject)
	{
		jsonobject = ((JSONObject) (jsonobject.getJSONObject("payload").getJSONArray("actions")));
	//    0    0:aload_1         
	//    1    1:ldc2            #389 <String "payload">
	//    2    4:invokevirtual   #392 <Method JSONObject JSONObject.getJSONObject(String)>
	//    3    7:ldc2            #276 <String "actions">
	//    4   10:invokevirtual   #280 <Method JSONArray JSONObject.getJSONArray(String)>
	//    5   13:astore_1        
		int i1 = 0;
	//    6   14:iconst_0        
	//    7   15:istore_2        
_L2:
		if(i1 >= ((JSONArray) (jsonobject)).length())
			break; /* Loop/switch isn't completed */
	//    8   16:iload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #213 <Method int JSONArray.length()>
	//   11   21:icmpge          58
		String s = ((JSONArray) (jsonobject)).getString(i1);
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokevirtual   #551 <Method String JSONArray.getString(int)>
	//   15   29:astore_3        
		h.remove(((Object) (s)));
	//   16   30:aload_0         
	//   17   31:getfield        #100 <Field Map h>
	//   18   34:aload_3         
	//   19   35:invokeinterface #554 <Method Object Map.remove(Object)>
	//   20   40:pop             
		i1++;
	//   21   41:iload_2         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_2        
		if(true) goto _L2; else goto _L1
	//   25   45:goto            16
		jsonobject;
	//   26   48:astore_1        
		com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Bad clear request received", ((Throwable) (jsonobject)));
	//   27   49:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   28   51:ldc2            #556 <String "Bad clear request received">
	//   29   54:aload_1         
	//   30   55:invokestatic    #195 <Method void f.e(String, String, Throwable)>
_L1:
		f();
	//   31   58:aload_0         
	//   32   59:invokespecial   #464 <Method void f()>
		return;
	//   33   62:return          
	}

	private void d()
	{
		Object obj;
		if(b == null || !b.a())
			break MISSING_BLOCK_LABEL_754;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field com.mixpanel.android.b.e b>
	//    2    4:ifnull          754
	//    3    7:aload_0         
	//    4    8:getfield        #135 <Field com.mixpanel.android.b.e b>
	//    5   11:invokevirtual   #140 <Method boolean e.a()>
	//    6   14:ifeq            754
		if(!b.b())
	//*   7   17:aload_0         
	//*   8   18:getfield        #135 <Field com.mixpanel.android.b.e b>
	//*   9   21:invokevirtual   #142 <Method boolean e.b()>
	//*  10   24:ifne            28
			return;
	//   11   27:return          
		obj = ((Object) (new JsonWriter(((java.io.Writer) (new OutputStreamWriter(((java.io.OutputStream) (b.c()))))))));
	//   12   28:new             #144 <Class JsonWriter>
	//   13   31:dup             
	//   14   32:new             #146 <Class OutputStreamWriter>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:getfield        #135 <Field com.mixpanel.android.b.e b>
	//   18   40:invokevirtual   #149 <Method java.io.BufferedOutputStream e.c()>
	//   19   43:invokespecial   #152 <Method void OutputStreamWriter(java.io.OutputStream)>
	//   20   46:invokespecial   #155 <Method void JsonWriter(java.io.Writer)>
	//   21   49:astore_1        
		((JsonWriter) (obj)).beginObject();
	//   22   50:aload_1         
	//   23   51:invokevirtual   #159 <Method JsonWriter JsonWriter.beginObject()>
	//   24   54:pop             
		((JsonWriter) (obj)).name("type").value("device_info_response");
	//   25   55:aload_1         
	//   26   56:ldc1            #161 <String "type">
	//   27   58:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   28   61:ldc2            #558 <String "device_info_response">
	//   29   64:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//   30   67:pop             
		((JsonWriter) (obj)).name("payload").beginObject();
	//   31   68:aload_1         
	//   32   69:ldc2            #389 <String "payload">
	//   33   72:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   34   75:invokevirtual   #159 <Method JsonWriter JsonWriter.beginObject()>
	//   35   78:pop             
		((JsonWriter) (obj)).name("device_type").value("Android");
	//   36   79:aload_1         
	//   37   80:ldc2            #560 <String "device_type">
	//   38   83:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   39   86:ldc2            #562 <String "Android">
	//   40   89:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//   41   92:pop             
		JsonWriter jsonwriter = ((JsonWriter) (obj)).name("device_name");
	//   42   93:aload_1         
	//   43   94:ldc2            #564 <String "device_name">
	//   44   97:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   45  100:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   46  101:new             #505 <Class StringBuilder>
	//   47  104:dup             
	//   48  105:invokespecial   #506 <Method void StringBuilder()>
	//   49  108:astore_3        
		stringbuilder.append(Build.BRAND);
	//   50  109:aload_3         
	//   51  110:getstatic       #569 <Field String Build.BRAND>
	//   52  113:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   53  116:pop             
		stringbuilder.append("/");
	//   54  117:aload_3         
	//   55  118:ldc2            #571 <String "/">
	//   56  121:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   57  124:pop             
		stringbuilder.append(Build.MODEL);
	//   58  125:aload_3         
	//   59  126:getstatic       #574 <Field String Build.MODEL>
	//   60  129:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   61  132:pop             
		jsonwriter.value(stringbuilder.toString());
	//   62  133:aload_2         
	//   63  134:aload_3         
	//   64  135:invokevirtual   #519 <Method String StringBuilder.toString()>
	//   65  138:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//   66  141:pop             
		((JsonWriter) (obj)).name("scaled_density").value(com.mixpanel.android.b.m.f(a));
	//   67  142:aload_1         
	//   68  143:ldc2            #576 <String "scaled_density">
	//   69  146:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   70  149:aload_0         
	//   71  150:getfield        #46  <Field m a>
	//   72  153:invokestatic    #579 <Method float com.mixpanel.android.b.m.f(m)>
	//   73  156:f2d             
	//   74  157:invokevirtual   #582 <Method JsonWriter JsonWriter.value(double)>
	//   75  160:pop             
		java.util.Entry entry;
		for(Iterator iterator = com.mixpanel.android.b.m.g(a).entrySet().iterator(); iterator.hasNext(); ((JsonWriter) (obj)).name((String)entry.getKey()).value((String)entry.getValue()))
	//*  76  161:aload_0         
	//*  77  162:getfield        #46  <Field m a>
	//*  78  165:invokestatic    #585 <Method Map m.g(m)>
	//*  79  168:invokeinterface #589 <Method Set Map.entrySet()>
	//*  80  173:invokeinterface #310 <Method Iterator Set.iterator()>
	//*  81  178:astore_2        
	//*  82  179:aload_2         
	//*  83  180:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//*  84  185:ifeq            227
			entry = (java.util.Entry)iterator.next();
	//   85  188:aload_2         
	//   86  189:invokeinterface #319 <Method Object Iterator.next()>
	//   87  194:checkcast       #591 <Class java.util.Map$Entry>
	//   88  197:astore_3        

	//   89  198:aload_1         
	//   90  199:aload_3         
	//   91  200:invokeinterface #594 <Method Object java.util.Map$Entry.getKey()>
	//   92  205:checkcast       #596 <Class String>
	//   93  208:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//   94  211:aload_3         
	//   95  212:invokeinterface #599 <Method Object java.util.Map$Entry.getValue()>
	//   96  217:checkcast       #596 <Class String>
	//   97  220:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//   98  223:pop             
	//*  99  224:goto            179
		Object obj1;
		obj1 = ((Object) (com.mixpanel.android.b.m.h(a).a()));
	//  100  227:aload_0         
	//  101  228:getfield        #46  <Field m a>
	//  102  231:invokestatic    #602 <Method u com.mixpanel.android.b.m.h(m)>
	//  103  234:invokevirtual   #607 <Method Map u.a()>
	//  104  237:astore_2        
		((JsonWriter) (obj)).name("tweaks").beginArray();
	//  105  238:aload_1         
	//  106  239:ldc2            #292 <String "tweaks">
	//  107  242:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  108  245:invokevirtual   #610 <Method JsonWriter JsonWriter.beginArray()>
	//  109  248:pop             
		obj1 = ((Object) (((Map) (obj1)).entrySet().iterator()));
	//  110  249:aload_2         
	//  111  250:invokeinterface #589 <Method Set Map.entrySet()>
	//  112  255:invokeinterface #310 <Method Iterator Set.iterator()>
	//  113  260:astore_2        
_L6:
		com.mixpanel.android.mpmetrics.u$b u$b1;
		if(!((Iterator) (obj1)).hasNext())
			break MISSING_BLOCK_LABEL_685;
	//  114  261:aload_2         
	//  115  262:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//  116  267:ifeq            685
		Object obj3 = ((Object) ((java.util.Entry)((Iterator) (obj1)).next()));
	//  117  270:aload_2         
	//  118  271:invokeinterface #319 <Method Object Iterator.next()>
	//  119  276:checkcast       #591 <Class java.util.Map$Entry>
	//  120  279:astore          4
		u$b1 = (com.mixpanel.android.mpmetrics.u$b)((java.util.Entry) (obj3)).getValue();
	//  121  281:aload           4
	//  122  283:invokeinterface #599 <Method Object java.util.Map$Entry.getValue()>
	//  123  288:checkcast       #612 <Class com.mixpanel.android.mpmetrics.u$b>
	//  124  291:astore_3        
		obj3 = ((Object) ((String)((java.util.Entry) (obj3)).getKey()));
	//  125  292:aload           4
	//  126  294:invokeinterface #594 <Method Object java.util.Map$Entry.getKey()>
	//  127  299:checkcast       #596 <Class String>
	//  128  302:astore          4
		((JsonWriter) (obj)).beginObject();
	//  129  304:aload_1         
	//  130  305:invokevirtual   #159 <Method JsonWriter JsonWriter.beginObject()>
	//  131  308:pop             
		((JsonWriter) (obj)).name("name").value(((String) (obj3)));
	//  132  309:aload_1         
	//  133  310:ldc2            #283 <String "name">
	//  134  313:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  135  316:aload           4
	//  136  318:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//  137  321:pop             
		((JsonWriter) (obj)).name("minimum").value(u$b1.d());
	//  138  322:aload_1         
	//  139  323:ldc2            #614 <String "minimum">
	//  140  326:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  141  329:aload_3         
	//  142  330:invokevirtual   #617 <Method Number com.mixpanel.android.mpmetrics.u$b.d()>
	//  143  333:invokevirtual   #620 <Method JsonWriter JsonWriter.value(Number)>
	//  144  336:pop             
		((JsonWriter) (obj)).name("maximum").value(u$b1.e());
	//  145  337:aload_1         
	//  146  338:ldc2            #622 <String "maximum">
	//  147  341:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  148  344:aload_3         
	//  149  345:invokevirtual   #624 <Method Number com.mixpanel.android.mpmetrics.u$b.e()>
	//  150  348:invokevirtual   #620 <Method JsonWriter JsonWriter.value(Number)>
	//  151  351:pop             
		u$b1.a;
	//  152  352:aload_3         
	//  153  353:getfield        #627 <Field int com.mixpanel.android.mpmetrics.u$b.a>
		JVM INSTR tableswitch 1 4: default 755
	//	               1 575
	//	               2 506
	//	               3 437
	//	               4 388;
	//  154  356:tableswitch     1 4: default 755
	//	               1 575
	//	               2 506
	//	               3 437
	//	               4 388
		   goto _L1 _L2 _L3 _L4 _L5
_L5:
		((JsonWriter) (obj)).name("type").value("string");
	//  155  388:aload_1         
	//  156  389:ldc1            #161 <String "type">
	//  157  391:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  158  394:ldc2            #629 <String "string">
	//  159  397:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//  160  400:pop             
		((JsonWriter) (obj)).name("value").value(u$b1.a());
	//  161  401:aload_1         
	//  162  402:ldc2            #630 <String "value">
	//  163  405:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  164  408:aload_3         
	//  165  409:invokevirtual   #631 <Method String com.mixpanel.android.mpmetrics.u$b.a()>
	//  166  412:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//  167  415:pop             
		((JsonWriter) (obj)).name("default").value((String)u$b1.f());
	//  168  416:aload_1         
	//  169  417:ldc2            #633 <String "default">
	//  170  420:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  171  423:aload_3         
	//  172  424:invokevirtual   #635 <Method Object com.mixpanel.android.mpmetrics.u$b.f()>
	//  173  427:checkcast       #596 <Class String>
	//  174  430:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//  175  433:pop             
		break; /* Loop/switch isn't completed */
	//  176  434:goto            677
_L4:
		Object obj2;
		StringBuilder stringbuilder1;
		try
		{
			((JsonWriter) (obj)).name("type").value("number");
	//  177  437:aload_1         
	//  178  438:ldc1            #161 <String "type">
	//  179  440:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  180  443:ldc2            #637 <String "number">
	//  181  446:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//  182  449:pop             
			((JsonWriter) (obj)).name("encoding").value("l");
	//  183  450:aload_1         
	//  184  451:ldc2            #639 <String "encoding">
	//  185  454:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  186  457:ldc2            #640 <String "l">
	//  187  460:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//  188  463:pop             
			((JsonWriter) (obj)).name("value").value(u$b1.b().longValue());
	//  189  464:aload_1         
	//  190  465:ldc2            #630 <String "value">
	//  191  468:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  192  471:aload_3         
	//  193  472:invokevirtual   #642 <Method Number com.mixpanel.android.mpmetrics.u$b.b()>
	//  194  475:invokevirtual   #647 <Method long Number.longValue()>
	//  195  478:invokevirtual   #650 <Method JsonWriter JsonWriter.value(long)>
	//  196  481:pop             
			((JsonWriter) (obj)).name("default").value(((Number)u$b1.f()).longValue());
	//  197  482:aload_1         
	//  198  483:ldc2            #633 <String "default">
	//  199  486:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//  200  489:aload_3         
	//  201  490:invokevirtual   #635 <Method Object com.mixpanel.android.mpmetrics.u$b.f()>
	//  202  493:checkcast       #644 <Class Number>
	//  203  496:invokevirtual   #647 <Method long Number.longValue()>
	//  204  499:invokevirtual   #650 <Method JsonWriter JsonWriter.value(long)>
	//  205  502:pop             
			break; /* Loop/switch isn't completed */
	//  206  503:goto            677
		}
	//* 207  506:aload_1         
	//* 208  507:ldc1            #161 <String "type">
	//* 209  509:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//* 210  512:ldc2            #637 <String "number">
	//* 211  515:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//* 212  518:pop             
	//* 213  519:aload_1         
	//* 214  520:ldc2            #639 <String "encoding">
	//* 215  523:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//* 216  526:ldc2            #651 <String "d">
	//* 217  529:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//* 218  532:pop             
	//* 219  533:aload_1         
	//* 220  534:ldc2            #630 <String "value">
	//* 221  537:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//* 222  540:aload_3         
	//* 223  541:invokevirtual   #642 <Method Number com.mixpanel.android.mpmetrics.u$b.b()>
	//* 224  544:invokevirtual   #655 <Method double Number.doubleValue()>
	//* 225  547:invokevirtual   #582 <Method JsonWriter JsonWriter.value(double)>
	//* 226  550:pop             
	//* 227  551:aload_1         
	//* 228  552:ldc2            #633 <String "default">
	//* 229  555:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//* 230  558:aload_3         
	//* 231  559:invokevirtual   #635 <Method Object com.mixpanel.android.mpmetrics.u$b.f()>
	//* 232  562:checkcast       #644 <Class Number>
	//* 233  565:invokevirtual   #655 <Method double Number.doubleValue()>
	//* 234  568:invokevirtual   #582 <Method JsonWriter JsonWriter.value(double)>
	//* 235  571:pop             
	//* 236  572:goto            677
	//* 237  575:aload_1         
	//* 238  576:ldc1            #161 <String "type">
	//* 239  578:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//* 240  581:ldc2            #657 <String "boolean">
	//* 241  584:invokevirtual   #170 <Method JsonWriter JsonWriter.value(String)>
	//* 242  587:pop             
	//* 243  588:aload_1         
	//* 244  589:ldc2            #630 <String "value">
	//* 245  592:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//* 246  595:aload_3         
	//* 247  596:invokevirtual   #660 <Method Boolean com.mixpanel.android.mpmetrics.u$b.c()>
	//* 248  599:invokevirtual   #665 <Method boolean Boolean.booleanValue()>
	//* 249  602:invokevirtual   #668 <Method JsonWriter JsonWriter.value(boolean)>
	//* 250  605:pop             
	//* 251  606:aload_1         
	//* 252  607:ldc2            #633 <String "default">
	//* 253  610:invokevirtual   #165 <Method JsonWriter JsonWriter.name(String)>
	//* 254  613:aload_3         
	//* 255  614:invokevirtual   #635 <Method Object com.mixpanel.android.mpmetrics.u$b.f()>
	//* 256  617:checkcast       #662 <Class Boolean>
	//* 257  620:invokevirtual   #665 <Method boolean Boolean.booleanValue()>
	//* 258  623:invokevirtual   #668 <Method JsonWriter JsonWriter.value(boolean)>
	//* 259  626:pop             
	//* 260  627:goto            677
	//* 261  630:new             #505 <Class StringBuilder>
	//* 262  633:dup             
	//* 263  634:invokespecial   #506 <Method void StringBuilder()>
	//* 264  637:astore          4
	//* 265  639:aload           4
	//* 266  641:ldc2            #670 <String "Unrecognized Tweak Type ">
	//* 267  644:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//* 268  647:pop             
	//* 269  648:aload           4
	//* 270  650:aload_3         
	//* 271  651:getfield        #627 <Field int com.mixpanel.android.mpmetrics.u$b.a>
	//* 272  654:invokevirtual   #673 <Method StringBuilder StringBuilder.append(int)>
	//* 273  657:pop             
	//* 274  658:aload           4
	//* 275  660:ldc2            #675 <String " encountered.">
	//* 276  663:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//* 277  666:pop             
	//* 278  667:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//* 279  669:aload           4
	//* 280  671:invokevirtual   #519 <Method String StringBuilder.toString()>
	//* 281  674:invokestatic    #677 <Method void f.f(String, String)>
	//* 282  677:aload_1         
	//* 283  678:invokevirtual   #183 <Method JsonWriter JsonWriter.endObject()>
	//* 284  681:pop             
	//* 285  682:goto            261
	//* 286  685:aload_1         
	//* 287  686:invokevirtual   #680 <Method JsonWriter JsonWriter.endArray()>
	//* 288  689:pop             
	//* 289  690:aload_1         
	//* 290  691:invokevirtual   #183 <Method JsonWriter JsonWriter.endObject()>
	//* 291  694:pop             
	//* 292  695:aload_1         
	//* 293  696:invokevirtual   #183 <Method JsonWriter JsonWriter.endObject()>
	//* 294  699:pop             
	//* 295  700:aload_1         
	//* 296  701:invokevirtual   #186 <Method void JsonWriter.close()>
	//* 297  704:return          
	//* 298  705:astore_2        
	//* 299  706:goto            735
		// Misplaced declaration of an exception variable
		catch(Object obj2) { }
	//  300  709:astore_2        
		break MISSING_BLOCK_LABEL_710;
_L3:
		((JsonWriter) (obj)).name("type").value("number");
		((JsonWriter) (obj)).name("encoding").value("d");
		((JsonWriter) (obj)).name("value").value(u$b1.b().doubleValue());
		((JsonWriter) (obj)).name("default").value(((Number)u$b1.f()).doubleValue());
		break; /* Loop/switch isn't completed */
_L2:
		((JsonWriter) (obj)).name("type").value("boolean");
		((JsonWriter) (obj)).name("value").value(u$b1.c().booleanValue());
		((JsonWriter) (obj)).name("default").value(((Boolean)u$b1.f()).booleanValue());
		break; /* Loop/switch isn't completed */
_L1:
		stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Unrecognized Tweak Type ");
		stringbuilder1.append(u$b1.a);
		stringbuilder1.append(" encountered.");
		com.mixpanel.android.a.f.f("MixpanelAPI.ViewCrawler", stringbuilder1.toString());
		((JsonWriter) (obj)).endObject();
		  goto _L6
		((JsonWriter) (obj)).endArray();
		((JsonWriter) (obj)).endObject();
		((JsonWriter) (obj)).endObject();
		try
		{
			((JsonWriter) (obj)).close();
			return;
		}
	//* 301  710:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//* 302  712:ldc2            #682 <String "Can't write device_info to server">
	//* 303  715:aload_2         
	//* 304  716:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//* 305  719:aload_1         
	//* 306  720:invokevirtual   #186 <Method void JsonWriter.close()>
	//* 307  723:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 308  724:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ((Throwable) (obj)));
	//  309  725:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  310  727:ldc2            #684 <String "Can't close websocket writer">
	//  311  730:aload_1         
	//  312  731:invokestatic    #195 <Method void f.e(String, String, Throwable)>
		}
		break MISSING_BLOCK_LABEL_734;
		obj2;
		break MISSING_BLOCK_LABEL_735;
		com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't write device_info to server", ((Throwable) (obj2)));
		((JsonWriter) (obj)).close();
		return;
		return;
	//  313  734:return          
		try
		{
			((JsonWriter) (obj)).close();
	//  314  735:aload_1         
	//  315  736:invokevirtual   #186 <Method void JsonWriter.close()>
		}
	//* 316  739:goto            752
		catch(IOException ioexception)
	//* 317  742:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ((Throwable) (ioexception)));
	//  318  743:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  319  745:ldc2            #684 <String "Can't close websocket writer">
	//  320  748:aload_1         
	//  321  749:invokestatic    #195 <Method void f.e(String, String, Throwable)>
		}
		throw obj2;
	//  322  752:aload_2         
	//  323  753:athrow          
	//  324  754:return          
	//* 325  755:goto            630
	}

	private void d(JSONObject jsonobject)
	{
		int j1;
		i.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field List i>
	//    2    4:invokeinterface #687 <Method void List.clear()>
		jsonobject = ((JSONObject) (jsonobject.getJSONObject("payload").getJSONArray("tweaks")));
	//    3    9:aload_1         
	//    4   10:ldc2            #389 <String "payload">
	//    5   13:invokevirtual   #392 <Method JSONObject JSONObject.getJSONObject(String)>
	//    6   16:ldc2            #292 <String "tweaks">
	//    7   19:invokevirtual   #280 <Method JSONArray JSONObject.getJSONArray(String)>
	//    8   22:astore_1        
		j1 = ((JSONArray) (jsonobject)).length();
	//    9   23:aload_1         
	//   10   24:invokevirtual   #213 <Method int JSONArray.length()>
	//   11   27:istore_3        
		int i1 = 0;
	//   12   28:iconst_0        
	//   13   29:istore_2        
_L2:
		if(i1 >= j1)
			break; /* Loop/switch isn't completed */
	//   14   30:iload_2         
	//   15   31:iload_3         
	//   16   32:icmpge          71
		JSONObject jsonobject1 = ((JSONArray) (jsonobject)).getJSONObject(i1);
	//   17   35:aload_1         
	//   18   36:iload_2         
	//   19   37:invokevirtual   #217 <Method JSONObject JSONArray.getJSONObject(int)>
	//   20   40:astore          4
		i.add(((Object) (jsonobject1)));
	//   21   42:aload_0         
	//   22   43:getfield        #105 <Field List i>
	//   23   46:aload           4
	//   24   48:invokeinterface #688 <Method boolean List.add(Object)>
	//   25   53:pop             
		i1++;
	//   26   54:iload_2         
	//   27   55:iconst_1        
	//   28   56:iadd            
	//   29   57:istore_2        
		if(true) goto _L2; else goto _L1
	//   30   58:goto            30
		jsonobject;
	//   31   61:astore_1        
		com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Bad tweaks received", ((Throwable) (jsonobject)));
	//   32   62:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   33   64:ldc2            #690 <String "Bad tweaks received">
	//   34   67:aload_1         
	//   35   68:invokestatic    #195 <Method void f.e(String, String, Throwable)>
_L1:
		f();
	//   36   71:aload_0         
	//   37   72:invokespecial   #464 <Method void f()>
		return;
	//   38   75:return          
	}

	private void e()
	{
		h.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Map h>
	//    2    4:invokeinterface #691 <Method void Map.clear()>
		k.clear();
	//    3    9:aload_0         
	//    4   10:getfield        #109 <Field Map k>
	//    5   13:invokeinterface #691 <Method void Map.clear()>
		i.clear();
	//    6   18:aload_0         
	//    7   19:getfield        #105 <Field List i>
	//    8   22:invokeinterface #687 <Method void List.clear()>
		o.addAll(((Collection) (p)));
	//    9   27:aload_0         
	//   10   28:getfield        #117 <Field Set o>
	//   11   31:aload_0         
	//   12   32:getfield        #95  <Field Set p>
	//   13   35:invokeinterface #695 <Method boolean Set.addAll(Collection)>
	//   14   40:pop             
		p.clear();
	//   15   41:aload_0         
	//   16   42:getfield        #95  <Field Set p>
	//   17   45:invokeinterface #209 <Method void Set.clear()>
		c = null;
	//   18   50:aload_0         
	//   19   51:aconst_null     
	//   20   52:putfield        #53  <Field n c>
		com.mixpanel.android.a.f.a("MixpanelAPI.ViewCrawler", "Editor closed- freeing snapshot");
	//   21   55:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   22   57:ldc2            #697 <String "Editor closed- freeing snapshot">
	//   23   60:invokestatic    #406 <Method void f.a(String, String)>
		f();
	//   24   63:aload_0         
	//   25   64:invokespecial   #464 <Method void f()>
		String s;
		for(Iterator iterator = j.iterator(); iterator.hasNext(); g.c(s))
	//*  26   67:aload_0         
	//*  27   68:getfield        #107 <Field List j>
	//*  28   71:invokeinterface #698 <Method Iterator List.iterator()>
	//*  29   76:astore_1        
	//*  30   77:aload_1         
	//*  31   78:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//*  32   83:ifeq            107
			s = (String)iterator.next();
	//   33   86:aload_1         
	//   34   87:invokeinterface #319 <Method Object Iterator.next()>
	//   35   92:checkcast       #596 <Class String>
	//   36   95:astore_2        

	//   37   96:aload_0         
	//   38   97:getfield        #81  <Field d g>
	//   39  100:aload_2         
	//   40  101:invokevirtual   #700 <Method void d.c(String)>
	//*  41  104:goto            77
	//   42  107:return          
	}

	private void e(JSONObject jsonobject)
	{
		int j1;
		try
		{
			jsonobject = ((JSONObject) (jsonobject.getJSONObject("payload").getJSONArray("events")));
	//    0    0:aload_1         
	//    1    1:ldc2            #389 <String "payload">
	//    2    4:invokevirtual   #392 <Method JSONObject JSONObject.getJSONObject(String)>
	//    3    7:ldc2            #702 <String "events">
	//    4   10:invokevirtual   #280 <Method JSONArray JSONObject.getJSONArray(String)>
	//    5   13:astore_1        
		}
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #213 <Method int JSONArray.length()>
	//*   8   18:istore_3        
	//*   9   19:aload_0         
	//*  10   20:getfield        #109 <Field Map k>
	//*  11   23:invokeinterface #691 <Method void Map.clear()>
	//*  12   28:aload_0         
	//*  13   29:getfield        #117 <Field Set o>
	//*  14   32:invokeinterface #705 <Method boolean Set.isEmpty()>
	//*  15   37:ifne            150
	//*  16   40:aload_0         
	//*  17   41:getfield        #95  <Field Set p>
	//*  18   44:invokeinterface #705 <Method boolean Set.isEmpty()>
	//*  19   49:ifeq            150
	//*  20   52:aload_0         
	//*  21   53:getfield        #95  <Field Set p>
	//*  22   56:aload_0         
	//*  23   57:getfield        #117 <Field Set o>
	//*  24   60:invokeinterface #695 <Method boolean Set.addAll(Collection)>
	//*  25   65:pop             
	//*  26   66:aload_0         
	//*  27   67:getfield        #117 <Field Set o>
	//*  28   70:invokeinterface #310 <Method Iterator Set.iterator()>
	//*  29   75:astore          4
	//*  30   77:aload           4
	//*  31   79:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//*  32   84:ifeq            141
	//*  33   87:aload           4
	//*  34   89:invokeinterface #319 <Method Object Iterator.next()>
	//*  35   94:checkcast       #226 <Class Pair>
	//*  36   97:astore          5
	//*  37   99:aload_0         
	//*  38  100:getfield        #109 <Field Map k>
	//*  39  103:aload           5
	//*  40  105:getfield        #329 <Field Object Pair.second>
	//*  41  108:checkcast       #262 <Class JSONObject>
	//*  42  111:ldc2            #707 <String "path">
	//*  43  114:invokevirtual   #711 <Method Object JSONObject.get(String)>
	//*  44  117:invokevirtual   #714 <Method String Object.toString()>
	//*  45  120:aload           5
	//*  46  122:invokeinterface #487 <Method Object Map.put(Object, Object)>
	//*  47  127:pop             
	//*  48  128:goto            77
	//*  49  131:astore          5
	//*  50  133:aload           5
	//*  51  135:invokevirtual   #717 <Method void JSONException.printStackTrace()>
	//*  52  138:goto            77
	//*  53  141:aload_0         
	//*  54  142:getfield        #117 <Field Set o>
	//*  55  145:invokeinterface #209 <Method void Set.clear()>
	//*  56  150:iconst_0        
	//*  57  151:istore_2        
	//*  58  152:iload_2         
	//*  59  153:iload_3         
	//*  60  154:icmpge          257
	//*  61  157:aload_1         
	//*  62  158:iload_2         
	//*  63  159:invokevirtual   #217 <Method JSONObject JSONArray.getJSONObject(int)>
	//*  64  162:astore          4
	//*  65  164:aload           4
	//*  66  166:ldc1            #219 <String "target_activity">
	//*  67  168:invokestatic    #224 <Method String e.a(JSONObject, String)>
	//*  68  171:astore          5
	//*  69  173:aload_0         
	//*  70  174:getfield        #109 <Field Map k>
	//*  71  177:aload           4
	//*  72  179:ldc2            #707 <String "path">
	//*  73  182:invokevirtual   #711 <Method Object JSONObject.get(String)>
	//*  74  185:invokevirtual   #714 <Method String Object.toString()>
	//*  75  188:new             #226 <Class Pair>
	//*  76  191:dup             
	//*  77  192:aload           5
	//*  78  194:aload           4
	//*  79  196:invokespecial   #229 <Method void Pair(Object, Object)>
	//*  80  199:invokeinterface #487 <Method Object Map.put(Object, Object)>
	//*  81  204:pop             
	//*  82  205:goto            250
	//*  83  208:astore          4
	//*  84  210:new             #505 <Class StringBuilder>
	//*  85  213:dup             
	//*  86  214:invokespecial   #506 <Method void StringBuilder()>
	//*  87  217:astore          5
	//*  88  219:aload           5
	//*  89  221:ldc2            #719 <String "Bad event binding received from editor in ">
	//*  90  224:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//*  91  227:pop             
	//*  92  228:aload           5
	//*  93  230:aload_1         
	//*  94  231:invokevirtual   #374 <Method String JSONArray.toString()>
	//*  95  234:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//*  96  237:pop             
	//*  97  238:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//*  98  240:aload           5
	//*  99  242:invokevirtual   #519 <Method String StringBuilder.toString()>
	//* 100  245:aload           4
	//* 101  247:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//* 102  250:iload_2         
	//* 103  251:iconst_1        
	//* 104  252:iadd            
	//* 105  253:istore_2        
	//* 106  254:goto            152
	//* 107  257:aload_0         
	//* 108  258:invokespecial   #464 <Method void f()>
	//* 109  261:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//* 110  262:astore_1        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Bad event bindings received", ((Throwable) (jsonobject)));
	//  111  263:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  112  265:ldc2            #721 <String "Bad event bindings received">
	//  113  268:aload_1         
	//  114  269:invokestatic    #195 <Method void f.e(String, String, Throwable)>
			return;
	//  115  272:return          
		}
		j1 = ((JSONArray) (jsonobject)).length();
		k.clear();
		if(!o.isEmpty() && p.isEmpty())
		{
			p.addAll(((Collection) (o)));
			for(Iterator iterator = o.iterator(); iterator.hasNext();)
			{
				Pair pair = (Pair)iterator.next();
				try
				{
					k.put(((Object) (((JSONObject)pair.second).get("path").toString())), ((Object) (pair)));
				}
				catch(JSONException jsonexception1)
				{
					jsonexception1.printStackTrace();
				}
			}

			o.clear();
		}
		for(int i1 = 0; i1 < j1;)
			try
			{
				JSONObject jsonobject1 = ((JSONArray) (jsonobject)).getJSONObject(i1);
				String s = com.mixpanel.android.a.e.a(jsonobject1, "target_activity");
				k.put(((Object) (jsonobject1.get("path").toString())), ((Object) (new Pair(((Object) (s)), ((Object) (jsonobject1))))));
				continue;
			}
			catch(JSONException jsonexception)
			{
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("Bad event binding received from editor in ");
				stringbuilder.append(((JSONArray) (jsonobject)).toString());
				com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", stringbuilder.toString(), ((Throwable) (jsonexception)));
				i1++;
			}

		f();
	}

	private void f()
	{
		HashSet hashset;
		ArrayList arraylist;
		HashSet hashset1;
		Iterator iterator6;
		arraylist = new ArrayList();
	//    0    0:new             #102 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void ArrayList()>
	//    3    7:astore          6
		hashset1 = new HashSet();
	//    4    9:new             #90  <Class HashSet>
	//    5   12:dup             
	//    6   13:invokespecial   #93  <Method void HashSet()>
	//    7   16:astore          7
		hashset = new HashSet();
	//    8   18:new             #90  <Class HashSet>
	//    9   21:dup             
	//   10   22:invokespecial   #93  <Method void HashSet()>
	//   11   25:astore          5
		Iterator iterator = l.iterator();
	//   12   27:aload_0         
	//   13   28:getfield        #111 <Field Set l>
	//   14   31:invokeinterface #310 <Method Iterator Set.iterator()>
	//   15   36:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   16   38:aload           4
	//   17   40:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//   18   45:ifeq            177
			m$d m$d1 = (m$d)iterator.next();
	//   19   48:aload           4
	//   20   50:invokeinterface #319 <Method Object Iterator.next()>
	//   21   55:checkcast       #282 <Class m$d>
	//   22   58:astore          8
			try
			{
				c$c c$c1 = f.a(m$d1.c);
	//   23   60:aload_0         
	//   24   61:getfield        #88  <Field c f>
	//   25   64:aload           8
	//   26   66:getfield        #728 <Field JSONObject m$d.c>
	//   27   69:invokevirtual   #731 <Method c$c c.a(JSONObject)>
	//   28   72:astore          9
				((List) (arraylist)).add(((Object) (new Pair(((Object) (m$d1.b)), ((Object) (c$c1.a))))));
	//   29   74:aload           6
	//   30   76:new             #226 <Class Pair>
	//   31   79:dup             
	//   32   80:aload           8
	//   33   82:getfield        #733 <Field String m$d.b>
	//   34   85:aload           9
	//   35   87:getfield        #738 <Field o c$c.a>
	//   36   90:invokespecial   #229 <Method void Pair(Object, Object)>
	//   37   93:invokeinterface #688 <Method boolean List.add(Object)>
	//   38   98:pop             
				if(!q.contains(((Object) (m$d1.d))))
	//*  39   99:aload_0         
	//*  40  100:getfield        #119 <Field Set q>
	//*  41  103:aload           8
	//*  42  105:getfield        #741 <Field Pair com.mixpanel.android.b.m$d.d>
	//*  43  108:invokeinterface #744 <Method boolean Set.contains(Object)>
	//*  44  113:ifne            38
					((Set) (hashset1)).add(((Object) (m$d1.d)));
	//   45  116:aload           7
	//   46  118:aload           8
	//   47  120:getfield        #741 <Field Pair com.mixpanel.android.b.m$d.d>
	//   48  123:invokeinterface #233 <Method boolean Set.add(Object)>
	//   49  128:pop             
			}
	//*  50  129:goto            38
	//*  51  132:astore          8
	//*  52  134:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//*  53  136:ldc2            #746 <String "Bad persistent change request cannot be applied.">
	//*  54  139:aload           8
	//*  55  141:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//*  56  144:goto            38
	//*  57  147:astore          8
	//*  58  149:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//*  59  151:aload           8
	//*  60  153:invokevirtual   #747 <Method String c$d.getMessage()>
	//*  61  156:invokestatic    #749 <Method void f.c(String, String)>
	//*  62  159:goto            38
			catch(c$b c$b1)
	//*  63  162:astore          8
			{
				com.mixpanel.android.a.f.a("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", ((Throwable) (c$b1)));
	//   64  164:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//   65  166:ldc2            #751 <String "Can't load assets for an edit, won't apply the change now">
	//   66  169:aload           8
	//   67  171:invokestatic    #753 <Method void f.a(String, String, Throwable)>
			}
			catch(c$d c$d1)
			{
				com.mixpanel.android.a.f.c("MixpanelAPI.ViewCrawler", c$d1.getMessage());
			}
			catch(c$a c$a3)
			{
				com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Bad persistent change request cannot be applied.", ((Throwable) (c$a3)));
			}
		} while(true);
	//   68  174:goto            38
		iterator6 = m.iterator();
	//   69  177:aload_0         
	//   70  178:getfield        #113 <Field Set m>
	//   71  181:invokeinterface #310 <Method Iterator Set.iterator()>
	//   72  186:astore          8
_L3:
		m$e m$e1;
		if(!iterator6.hasNext())
			break; /* Loop/switch isn't completed */
	//   73  188:aload           8
	//   74  190:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//   75  195:ifeq            427
		m$e1 = (m$e)iterator6.next();
	//   76  198:aload           8
	//   77  200:invokeinterface #319 <Method Object Iterator.next()>
	//   78  205:checkcast       #294 <Class m$e>
	//   79  208:astore          10
		Object obj;
		Pair pair3;
		pair3 = f.c(m$e1.b);
	//   80  210:aload_0         
	//   81  211:getfield        #88  <Field c f>
	//   82  214:aload           10
	//   83  216:getfield        #755 <Field JSONObject m$e.b>
	//   84  219:invokevirtual   #758 <Method Pair c.c(JSONObject)>
	//   85  222:astore          9
		if(q.contains(((Object) (m$e1.c))))
			break MISSING_BLOCK_LABEL_274;
	//   86  224:aload_0         
	//   87  225:getfield        #119 <Field Set q>
	//   88  228:aload           10
	//   89  230:getfield        #760 <Field Pair m$e.c>
	//   90  233:invokeinterface #744 <Method boolean Set.contains(Object)>
	//   91  238:ifne            274
		((Set) (hashset1)).add(((Object) (m$e1.c)));
	//   92  241:aload           7
	//   93  243:aload           10
	//   94  245:getfield        #760 <Field Pair m$e.c>
	//   95  248:invokeinterface #233 <Method boolean Set.add(Object)>
	//   96  253:pop             
		obj = pair3.first;
	//   97  254:aload           9
	//   98  256:getfield        #323 <Field Object Pair.first>
	//   99  259:astore          4
_L1:
		((Set) (hashset)).add(obj);
	//  100  261:aload           5
	//  101  263:aload           4
	//  102  265:invokeinterface #233 <Method boolean Set.add(Object)>
	//  103  270:pop             
		break MISSING_BLOCK_LABEL_310;
	//  104  271:goto            310
		if(!com.mixpanel.android.b.m.h(a).b((String)pair3.first, pair3.second))
			break MISSING_BLOCK_LABEL_310;
	//  105  274:aload_0         
	//  106  275:getfield        #46  <Field m a>
	//  107  278:invokestatic    #602 <Method u com.mixpanel.android.b.m.h(m)>
	//  108  281:aload           9
	//  109  283:getfield        #323 <Field Object Pair.first>
	//  110  286:checkcast       #596 <Class String>
	//  111  289:aload           9
	//  112  291:getfield        #329 <Field Object Pair.second>
	//  113  294:invokevirtual   #763 <Method boolean u.b(String, Object)>
	//  114  297:ifeq            310
		obj = pair3.first;
	//  115  300:aload           9
	//  116  302:getfield        #323 <Field Object Pair.first>
	//  117  305:astore          4
		  goto _L1
	//* 118  307:goto            261
		if(com.mixpanel.android.b.m.h(a).a().containsKey(pair3.first))
			break MISSING_BLOCK_LABEL_386;
	//  119  310:aload_0         
	//  120  311:getfield        #46  <Field m a>
	//  121  314:invokestatic    #602 <Method u com.mixpanel.android.b.m.h(m)>
	//  122  317:invokevirtual   #607 <Method Map u.a()>
	//  123  320:aload           9
	//  124  322:getfield        #323 <Field Object Pair.first>
	//  125  325:invokeinterface #766 <Method boolean Map.containsKey(Object)>
	//  126  330:ifne            386
		obj = ((Object) (com.mixpanel.android.mpmetrics.u$b.a(m$e1.b)));
	//  127  333:aload           10
	//  128  335:getfield        #755 <Field JSONObject m$e.b>
	//  129  338:invokestatic    #769 <Method com.mixpanel.android.mpmetrics.u$b com.mixpanel.android.mpmetrics.u$b.a(JSONObject)>
	//  130  341:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_386;
	//  131  343:aload           4
	//  132  345:ifnull          386
		com.mixpanel.android.b.m.h(a).a((String)pair3.first, ((com.mixpanel.android.mpmetrics.u$b) (obj)).f(), ((com.mixpanel.android.mpmetrics.u$b) (obj)).d(), ((com.mixpanel.android.mpmetrics.u$b) (obj)).e(), ((com.mixpanel.android.mpmetrics.u$b) (obj)).a);
	//  133  348:aload_0         
	//  134  349:getfield        #46  <Field m a>
	//  135  352:invokestatic    #602 <Method u com.mixpanel.android.b.m.h(m)>
	//  136  355:aload           9
	//  137  357:getfield        #323 <Field Object Pair.first>
	//  138  360:checkcast       #596 <Class String>
	//  139  363:aload           4
	//  140  365:invokevirtual   #635 <Method Object com.mixpanel.android.mpmetrics.u$b.f()>
	//  141  368:aload           4
	//  142  370:invokevirtual   #617 <Method Number com.mixpanel.android.mpmetrics.u$b.d()>
	//  143  373:aload           4
	//  144  375:invokevirtual   #624 <Method Number com.mixpanel.android.mpmetrics.u$b.e()>
	//  145  378:aload           4
	//  146  380:getfield        #627 <Field int com.mixpanel.android.mpmetrics.u$b.a>
	//  147  383:invokevirtual   #772 <Method void u.a(String, Object, Number, Number, int)>
		com.mixpanel.android.b.m.h(a).a((String)pair3.first, pair3.second);
	//  148  386:aload_0         
	//  149  387:getfield        #46  <Field m a>
	//  150  390:invokestatic    #602 <Method u com.mixpanel.android.b.m.h(m)>
	//  151  393:aload           9
	//  152  395:getfield        #323 <Field Object Pair.first>
	//  153  398:checkcast       #596 <Class String>
	//  154  401:aload           9
	//  155  403:getfield        #329 <Field Object Pair.second>
	//  156  406:invokevirtual   #775 <Method void u.a(String, Object)>
		continue; /* Loop/switch isn't completed */
	//  157  409:goto            188
		c$a c$a1;
		c$a1;
	//  158  412:astore          4
		com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Bad editor tweak cannot be applied.", ((Throwable) (c$a1)));
	//  159  414:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  160  416:ldc2            #777 <String "Bad editor tweak cannot be applied.">
	//  161  419:aload           4
	//  162  421:invokestatic    #195 <Method void f.e(String, String, Throwable)>
		if(true) goto _L3; else goto _L2
	//  163  424:goto            188
_L2:
		if(m.size() == 0)
	//* 164  427:aload_0         
	//* 165  428:getfield        #113 <Field Set m>
	//* 166  431:invokeinterface #305 <Method int Set.size()>
	//* 167  436:ifne            557
		{
			Iterator iterator1 = com.mixpanel.android.b.m.h(a).b().entrySet().iterator();
	//  168  439:aload_0         
	//  169  440:getfield        #46  <Field m a>
	//  170  443:invokestatic    #602 <Method u com.mixpanel.android.b.m.h(m)>
	//  171  446:invokevirtual   #779 <Method Map u.b()>
	//  172  449:invokeinterface #589 <Method Set Map.entrySet()>
	//  173  454:invokeinterface #310 <Method Iterator Set.iterator()>
	//  174  459:astore          4
			do
			{
				if(!iterator1.hasNext())
					break;
	//  175  461:aload           4
	//  176  463:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//  177  468:ifeq            557
				Object obj3 = ((Object) ((java.util.Entry)iterator1.next()));
	//  178  471:aload           4
	//  179  473:invokeinterface #319 <Method Object Iterator.next()>
	//  180  478:checkcast       #591 <Class java.util.Map$Entry>
	//  181  481:astore          9
				com.mixpanel.android.mpmetrics.u$b u$b1 = (com.mixpanel.android.mpmetrics.u$b)((java.util.Entry) (obj3)).getValue();
	//  182  483:aload           9
	//  183  485:invokeinterface #599 <Method Object java.util.Map$Entry.getValue()>
	//  184  490:checkcast       #612 <Class com.mixpanel.android.mpmetrics.u$b>
	//  185  493:astore          8
				obj3 = ((Object) ((String)((java.util.Entry) (obj3)).getKey()));
	//  186  495:aload           9
	//  187  497:invokeinterface #594 <Method Object java.util.Map$Entry.getKey()>
	//  188  502:checkcast       #596 <Class String>
	//  189  505:astore          9
				if(com.mixpanel.android.b.m.h(a).b(((String) (obj3)), u$b1.g()))
	//* 190  507:aload_0         
	//* 191  508:getfield        #46  <Field m a>
	//* 192  511:invokestatic    #602 <Method u com.mixpanel.android.b.m.h(m)>
	//* 193  514:aload           9
	//* 194  516:aload           8
	//* 195  518:invokevirtual   #781 <Method Object com.mixpanel.android.mpmetrics.u$b.g()>
	//* 196  521:invokevirtual   #763 <Method boolean u.b(String, Object)>
	//* 197  524:ifeq            461
				{
					com.mixpanel.android.b.m.h(a).a(((String) (obj3)), u$b1.g());
	//  198  527:aload_0         
	//  199  528:getfield        #46  <Field m a>
	//  200  531:invokestatic    #602 <Method u com.mixpanel.android.b.m.h(m)>
	//  201  534:aload           9
	//  202  536:aload           8
	//  203  538:invokevirtual   #781 <Method Object com.mixpanel.android.mpmetrics.u$b.g()>
	//  204  541:invokevirtual   #775 <Method void u.a(String, Object)>
					((Set) (hashset)).add(obj3);
	//  205  544:aload           5
	//  206  546:aload           9
	//  207  548:invokeinterface #233 <Method boolean Set.add(Object)>
	//  208  553:pop             
				}
			} while(true);
	//  209  554:goto            461
		}
		for(Iterator iterator2 = h.values().iterator(); iterator2.hasNext();)
	//* 210  557:aload_0         
	//* 211  558:getfield        #100 <Field Map h>
	//* 212  561:invokeinterface #785 <Method Collection Map.values()>
	//* 213  566:invokeinterface #788 <Method Iterator Collection.iterator()>
	//* 214  571:astore          4
	//* 215  573:aload           4
	//* 216  575:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//* 217  580:ifeq            700
		{
			Pair pair = (Pair)iterator2.next();
	//  218  583:aload           4
	//  219  585:invokeinterface #319 <Method Object Iterator.next()>
	//  220  590:checkcast       #226 <Class Pair>
	//  221  593:astore          8
			try
			{
				c$c c$c2 = f.a((JSONObject)pair.second);
	//  222  595:aload_0         
	//  223  596:getfield        #88  <Field c f>
	//  224  599:aload           8
	//  225  601:getfield        #329 <Field Object Pair.second>
	//  226  604:checkcast       #262 <Class JSONObject>
	//  227  607:invokevirtual   #731 <Method c$c c.a(JSONObject)>
	//  228  610:astore          9
				((List) (arraylist)).add(((Object) (new Pair(pair.first, ((Object) (c$c2.a))))));
	//  229  612:aload           6
	//  230  614:new             #226 <Class Pair>
	//  231  617:dup             
	//  232  618:aload           8
	//  233  620:getfield        #323 <Field Object Pair.first>
	//  234  623:aload           9
	//  235  625:getfield        #738 <Field o c$c.a>
	//  236  628:invokespecial   #229 <Method void Pair(Object, Object)>
	//  237  631:invokeinterface #688 <Method boolean List.add(Object)>
	//  238  636:pop             
				j.addAll(((Collection) (c$c2.b)));
	//  239  637:aload_0         
	//  240  638:getfield        #107 <Field List j>
	//  241  641:aload           9
	//  242  643:getfield        #790 <Field List c$c.b>
	//  243  646:invokeinterface #791 <Method boolean List.addAll(Collection)>
	//  244  651:pop             
			}
	//* 245  652:goto            573
	//* 246  655:astore          8
	//* 247  657:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//* 248  659:ldc2            #793 <String "Bad editor change request cannot be applied.">
	//* 249  662:aload           8
	//* 250  664:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//* 251  667:goto            573
	//* 252  670:astore          8
	//* 253  672:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//* 254  674:aload           8
	//* 255  676:invokevirtual   #747 <Method String c$d.getMessage()>
	//* 256  679:invokestatic    #749 <Method void f.c(String, String)>
	//* 257  682:goto            573
			catch(c$b c$b2)
	//* 258  685:astore          8
			{
				com.mixpanel.android.a.f.a("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", ((Throwable) (c$b2)));
	//  259  687:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  260  689:ldc2            #751 <String "Can't load assets for an edit, won't apply the change now">
	//  261  692:aload           8
	//  262  694:invokestatic    #753 <Method void f.a(String, String, Throwable)>
			}
			catch(c$d c$d2)
			{
				com.mixpanel.android.a.f.c("MixpanelAPI.ViewCrawler", c$d2.getMessage());
			}
			catch(c$a c$a4)
			{
				com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Bad editor change request cannot be applied.", ((Throwable) (c$a4)));
			}
		}

	//* 263  697:goto            573
		int k1 = i.size();
	//  264  700:aload_0         
	//  265  701:getfield        #105 <Field List i>
	//  266  704:invokeinterface #794 <Method int List.size()>
	//  267  709:istore_3        
		boolean flag = false;
	//  268  710:iconst_0        
	//  269  711:istore_2        
		for(int i1 = 0; i1 < k1; i1++)
	//* 270  712:iconst_0        
	//* 271  713:istore_1        
	//* 272  714:iload_1         
	//* 273  715:iload_3         
	//* 274  716:icmpge          829
		{
			Object obj1 = ((Object) ((JSONObject)i.get(i1)));
	//  275  719:aload_0         
	//  276  720:getfield        #105 <Field List i>
	//  277  723:iload_1         
	//  278  724:invokeinterface #797 <Method Object List.get(int)>
	//  279  729:checkcast       #262 <Class JSONObject>
	//  280  732:astore          4
			try
			{
				obj1 = ((Object) (f.c(((JSONObject) (obj1)))));
	//  281  734:aload_0         
	//  282  735:getfield        #88  <Field c f>
	//  283  738:aload           4
	//  284  740:invokevirtual   #758 <Method Pair c.c(JSONObject)>
	//  285  743:astore          4
				if(com.mixpanel.android.b.m.h(a).b((String)((Pair) (obj1)).first, ((Pair) (obj1)).second))
	//* 286  745:aload_0         
	//* 287  746:getfield        #46  <Field m a>
	//* 288  749:invokestatic    #602 <Method u com.mixpanel.android.b.m.h(m)>
	//* 289  752:aload           4
	//* 290  754:getfield        #323 <Field Object Pair.first>
	//* 291  757:checkcast       #596 <Class String>
	//* 292  760:aload           4
	//* 293  762:getfield        #329 <Field Object Pair.second>
	//* 294  765:invokevirtual   #763 <Method boolean u.b(String, Object)>
	//* 295  768:ifeq            784
					((Set) (hashset)).add(((Pair) (obj1)).first);
	//  296  771:aload           5
	//  297  773:aload           4
	//  298  775:getfield        #323 <Field Object Pair.first>
	//  299  778:invokeinterface #233 <Method boolean Set.add(Object)>
	//  300  783:pop             
				com.mixpanel.android.b.m.h(a).a((String)((Pair) (obj1)).first, ((Pair) (obj1)).second);
	//  301  784:aload_0         
	//  302  785:getfield        #46  <Field m a>
	//  303  788:invokestatic    #602 <Method u com.mixpanel.android.b.m.h(m)>
	//  304  791:aload           4
	//  305  793:getfield        #323 <Field Object Pair.first>
	//  306  796:checkcast       #596 <Class String>
	//  307  799:aload           4
	//  308  801:getfield        #329 <Field Object Pair.second>
	//  309  804:invokevirtual   #775 <Method void u.a(String, Object)>
			}
	//* 310  807:goto            822
			catch(c$a c$a2)
	//* 311  810:astore          4
			{
				com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Strange tweaks received", ((Throwable) (c$a2)));
	//  312  812:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  313  814:ldc2            #799 <String "Strange tweaks received">
	//  314  817:aload           4
	//  315  819:invokestatic    #195 <Method void f.e(String, String, Throwable)>
			}
		}

	//  316  822:iload_1         
	//  317  823:iconst_1        
	//  318  824:iadd            
	//  319  825:istore_1        
	//* 320  826:goto            714
		if(k.size() == 0 && p.size() == 0)
	//* 321  829:aload_0         
	//* 322  830:getfield        #109 <Field Map k>
	//* 323  833:invokeinterface #800 <Method int Map.size()>
	//* 324  838:ifne            965
	//* 325  841:aload_0         
	//* 326  842:getfield        #95  <Field Set p>
	//* 327  845:invokeinterface #305 <Method int Set.size()>
	//* 328  850:ifne            965
		{
			for(Iterator iterator3 = o.iterator(); iterator3.hasNext();)
	//* 329  853:aload_0         
	//* 330  854:getfield        #117 <Field Set o>
	//* 331  857:invokeinterface #310 <Method Iterator Set.iterator()>
	//* 332  862:astore          4
	//* 333  864:aload           4
	//* 334  866:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//* 335  871:ifeq            965
			{
				Pair pair1 = (Pair)iterator3.next();
	//  336  874:aload           4
	//  337  876:invokeinterface #319 <Method Object Iterator.next()>
	//  338  881:checkcast       #226 <Class Pair>
	//  339  884:astore          8
				try
				{
					o o1 = f.a((JSONObject)pair1.second, ((o$h) (com.mixpanel.android.b.m.i(a))));
	//  340  886:aload_0         
	//  341  887:getfield        #88  <Field c f>
	//  342  890:aload           8
	//  343  892:getfield        #329 <Field Object Pair.second>
	//  344  895:checkcast       #262 <Class JSONObject>
	//  345  898:aload_0         
	//  346  899:getfield        #46  <Field m a>
	//  347  902:invokestatic    #803 <Method b m.i(m)>
	//  348  905:invokevirtual   #806 <Method o c.a(JSONObject, o$h)>
	//  349  908:astore          9
					((List) (arraylist)).add(((Object) (new Pair(pair1.first, ((Object) (o1))))));
	//  350  910:aload           6
	//  351  912:new             #226 <Class Pair>
	//  352  915:dup             
	//  353  916:aload           8
	//  354  918:getfield        #323 <Field Object Pair.first>
	//  355  921:aload           9
	//  356  923:invokespecial   #229 <Method void Pair(Object, Object)>
	//  357  926:invokeinterface #688 <Method boolean List.add(Object)>
	//  358  931:pop             
				}
	//* 359  932:goto            864
	//* 360  935:astore          8
	//* 361  937:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//* 362  939:ldc2            #808 <String "Bad persistent event binding cannot be applied.">
	//* 363  942:aload           8
	//* 364  944:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//* 365  947:goto            864
				catch(c$d c$d3)
	//* 366  950:astore          8
				{
					com.mixpanel.android.a.f.c("MixpanelAPI.ViewCrawler", c$d3.getMessage());
	//  367  952:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  368  954:aload           8
	//  369  956:invokevirtual   #747 <Method String c$d.getMessage()>
	//  370  959:invokestatic    #749 <Method void f.c(String, String)>
				}
				catch(c$a c$a5)
				{
					com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Bad persistent event binding cannot be applied.", ((Throwable) (c$a5)));
				}
			}

		}
	//* 371  962:goto            864
		for(Iterator iterator4 = k.values().iterator(); iterator4.hasNext();)
	//* 372  965:aload_0         
	//* 373  966:getfield        #109 <Field Map k>
	//* 374  969:invokeinterface #785 <Method Collection Map.values()>
	//* 375  974:invokeinterface #788 <Method Iterator Collection.iterator()>
	//* 376  979:astore          4
	//* 377  981:aload           4
	//* 378  983:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//* 379  988:ifeq            1082
		{
			Pair pair2 = (Pair)iterator4.next();
	//  380  991:aload           4
	//  381  993:invokeinterface #319 <Method Object Iterator.next()>
	//  382  998:checkcast       #226 <Class Pair>
	//  383 1001:astore          8
			try
			{
				o o2 = f.a((JSONObject)pair2.second, ((o$h) (com.mixpanel.android.b.m.i(a))));
	//  384 1003:aload_0         
	//  385 1004:getfield        #88  <Field c f>
	//  386 1007:aload           8
	//  387 1009:getfield        #329 <Field Object Pair.second>
	//  388 1012:checkcast       #262 <Class JSONObject>
	//  389 1015:aload_0         
	//  390 1016:getfield        #46  <Field m a>
	//  391 1019:invokestatic    #803 <Method b m.i(m)>
	//  392 1022:invokevirtual   #806 <Method o c.a(JSONObject, o$h)>
	//  393 1025:astore          9
				((List) (arraylist)).add(((Object) (new Pair(pair2.first, ((Object) (o2))))));
	//  394 1027:aload           6
	//  395 1029:new             #226 <Class Pair>
	//  396 1032:dup             
	//  397 1033:aload           8
	//  398 1035:getfield        #323 <Field Object Pair.first>
	//  399 1038:aload           9
	//  400 1040:invokespecial   #229 <Method void Pair(Object, Object)>
	//  401 1043:invokeinterface #688 <Method boolean List.add(Object)>
	//  402 1048:pop             
			}
	//* 403 1049:goto            981
	//* 404 1052:astore          8
	//* 405 1054:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//* 406 1056:ldc2            #810 <String "Bad editor event binding cannot be applied.">
	//* 407 1059:aload           8
	//* 408 1061:invokestatic    #195 <Method void f.e(String, String, Throwable)>
	//* 409 1064:goto            981
			catch(c$d c$d4)
	//* 410 1067:astore          8
			{
				com.mixpanel.android.a.f.c("MixpanelAPI.ViewCrawler", c$d4.getMessage());
	//  411 1069:ldc1            #188 <String "MixpanelAPI.ViewCrawler">
	//  412 1071:aload           8
	//  413 1073:invokevirtual   #747 <Method String c$d.getMessage()>
	//  414 1076:invokestatic    #749 <Method void f.c(String, String)>
			}
			catch(c$a c$a6)
			{
				com.mixpanel.android.a.f.e("MixpanelAPI.ViewCrawler", "Bad editor event binding cannot be applied.", ((Throwable) (c$a6)));
			}
		}

	//* 415 1079:goto            981
		HashMap hashmap = new HashMap();
	//  416 1082:new             #97  <Class HashMap>
	//  417 1085:dup             
	//  418 1086:invokespecial   #98  <Method void HashMap()>
	//  419 1089:astore          8
		k1 = ((List) (arraylist)).size();
	//  420 1091:aload           6
	//  421 1093:invokeinterface #794 <Method int List.size()>
	//  422 1098:istore_3        
		for(int j1 = ((int) (flag)); j1 < k1; j1++)
	//* 423 1099:iload_2         
	//* 424 1100:istore_1        
	//* 425 1101:iload_1         
	//* 426 1102:iload_3         
	//* 427 1103:icmpge          1198
		{
			Pair pair4 = (Pair)((List) (arraylist)).get(j1);
	//  428 1106:aload           6
	//  429 1108:iload_1         
	//  430 1109:invokeinterface #797 <Method Object List.get(int)>
	//  431 1114:checkcast       #226 <Class Pair>
	//  432 1117:astore          9
			Object obj2;
			if(((Map) (hashmap)).containsKey(pair4.first))
	//* 433 1119:aload           8
	//* 434 1121:aload           9
	//* 435 1123:getfield        #323 <Field Object Pair.first>
	//* 436 1126:invokeinterface #766 <Method boolean Map.containsKey(Object)>
	//* 437 1131:ifeq            1154
			{
				obj2 = ((Object) ((List)((Map) (hashmap)).get(pair4.first)));
	//  438 1134:aload           8
	//  439 1136:aload           9
	//  440 1138:getfield        #323 <Field Object Pair.first>
	//  441 1141:invokeinterface #812 <Method Object Map.get(Object)>
	//  442 1146:checkcast       #686 <Class List>
	//  443 1149:astore          4
			} else
	//* 444 1151:goto            1178
			{
				obj2 = ((Object) (new ArrayList()));
	//  445 1154:new             #102 <Class ArrayList>
	//  446 1157:dup             
	//  447 1158:invokespecial   #103 <Method void ArrayList()>
	//  448 1161:astore          4
				((Map) (hashmap)).put(pair4.first, obj2);
	//  449 1163:aload           8
	//  450 1165:aload           9
	//  451 1167:getfield        #323 <Field Object Pair.first>
	//  452 1170:aload           4
	//  453 1172:invokeinterface #487 <Method Object Map.put(Object, Object)>
	//  454 1177:pop             
			}
			((List) (obj2)).add(pair4.second);
	//  455 1178:aload           4
	//  456 1180:aload           9
	//  457 1182:getfield        #329 <Field Object Pair.second>
	//  458 1185:invokeinterface #688 <Method boolean List.add(Object)>
	//  459 1190:pop             
		}

	//  460 1191:iload_1         
	//  461 1192:iconst_1        
	//  462 1193:iadd            
	//  463 1194:istore_1        
	//* 464 1195:goto            1101
		com.mixpanel.android.b.m.c(a).a(((Map) (hashmap)));
	//  465 1198:aload_0         
	//  466 1199:getfield        #46  <Field m a>
	//  467 1202:invokestatic    #431 <Method com.mixpanel.android.b.d m.c(m)>
	//  468 1205:aload           8
	//  469 1207:invokevirtual   #817 <Method void d.a(Map)>
		q.addAll(((Collection) (hashset1)));
	//  470 1210:aload_0         
	//  471 1211:getfield        #119 <Field Set q>
	//  472 1214:aload           7
	//  473 1216:invokeinterface #695 <Method boolean Set.addAll(Collection)>
	//  474 1221:pop             
		((Set) (hashset1)).addAll(((Collection) (n)));
	//  475 1222:aload           7
	//  476 1224:aload_0         
	//  477 1225:getfield        #115 <Field Set n>
	//  478 1228:invokeinterface #695 <Method boolean Set.addAll(Collection)>
	//  479 1233:pop             
		a(((Set) (hashset1)));
	//  480 1234:aload_0         
	//  481 1235:aload           7
	//  482 1237:invokespecial   #819 <Method void a(Set)>
		n.clear();
	//  483 1240:aload_0         
	//  484 1241:getfield        #115 <Field Set n>
	//  485 1244:invokeinterface #209 <Method void Set.clear()>
		if(((Set) (hashset)).size() > 0)
	//* 486 1249:aload           5
	//* 487 1251:invokeinterface #305 <Method int Set.size()>
	//* 488 1256:ifle            1303
		{
			for(Iterator iterator5 = com.mixpanel.android.b.m.j(a).iterator(); iterator5.hasNext(); ((l)iterator5.next()).a(((Set) (hashset))));
	//  489 1259:aload_0         
	//  490 1260:getfield        #46  <Field m a>
	//  491 1263:invokestatic    #822 <Method Set com.mixpanel.android.b.m.j(m)>
	//  492 1266:invokeinterface #310 <Method Iterator Set.iterator()>
	//  493 1271:astore          4
	//  494 1273:aload           4
	//  495 1275:invokeinterface #315 <Method boolean Iterator.hasNext()>
	//  496 1280:ifeq            1303
	//  497 1283:aload           4
	//  498 1285:invokeinterface #319 <Method Object Iterator.next()>
	//  499 1290:checkcast       #824 <Class l>
	//  500 1293:aload           5
	//  501 1295:invokeinterface #825 <Method void l.a(Set)>
		}
	//* 502 1300:goto            1273
		return;
	//  503 1303:return          
	}

	private SharedPreferences g()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #505 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #506 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("mixpanel.viewcrawler.changes");
	//    4    8:aload_1         
	//    5    9:ldc2            #301 <String "mixpanel.viewcrawler.changes">
	//    6   12:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #51  <Field String d>
	//   11   21:invokevirtual   #518 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   13   25:aload_1         
	//   14   26:invokevirtual   #519 <Method String StringBuilder.toString()>
	//   15   29:astore_1        
		return com.mixpanel.android.b.m.e(a).getSharedPreferences(((String) (obj)), 0);
	//   16   30:aload_0         
	//   17   31:getfield        #46  <Field m a>
	//   18   34:invokestatic    #509 <Method Context com.mixpanel.android.b.m.e(m)>
	//   19   37:aload_1         
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #829 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   22   42:areturn         
	}

	public void a()
	{
		e.unlock();
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Lock e>
	//    2    4:invokeinterface #832 <Method void Lock.unlock()>
	//    3    9:return          
	}

	public void handleMessage(Message message)
	{
		e.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Lock e>
	//    2    4:invokeinterface #129 <Method void Lock.lock()>
		message.what;
	//    3    9:aload_1         
	//    4   10:getfield        #839 <Field int Message.what>
		JVM INSTR tableswitch 0 13: default 271
	//	               0 245
	//	               1 238
	//	               2 224
	//	               3 210
	//	               4 203
	//	               5 189
	//	               6 175
	//	               7 161
	//	               8 154
	//	               9 140
	//	               10 126
	//	               11 112
	//	               12 98
	//	               13 84;
	//    5   13:tableswitch     0 13: default 271
	//	               0 245
	//	               1 238
	//	               2 224
	//	               3 210
	//	               4 203
	//	               5 189
	//	               6 175
	//	               7 161
	//	               8 154
	//	               9 140
	//	               10 126
	//	               11 112
	//	               12 98
	//	               13 84
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
		break; /* Loop/switch isn't completed */
_L15:
		a((JSONArray)message.obj);
	//    6   84:aload_0         
	//    7   85:aload_1         
	//    8   86:getfield        #842 <Field Object Message.obj>
	//    9   89:checkcast       #202 <Class JSONArray>
	//   10   92:invokespecial   #482 <Method void a(JSONArray)>
		break; /* Loop/switch isn't completed */
	//   11   95:goto            249
_L14:
		a((o$e)message.obj);
	//   12   98:aload_0         
	//   13   99:aload_1         
	//   14  100:getfield        #842 <Field Object Message.obj>
	//   15  103:checkcast       #174 <Class o$e>
	//   16  106:invokespecial   #844 <Method void a(o$e)>
		break; /* Loop/switch isn't completed */
	//   17  109:goto            249
_L13:
		d((JSONObject)message.obj);
	//   18  112:aload_0         
	//   19  113:aload_1         
	//   20  114:getfield        #842 <Field Object Message.obj>
	//   21  117:checkcast       #262 <Class JSONObject>
	//   22  120:invokespecial   #846 <Method void d(JSONObject)>
		break; /* Loop/switch isn't completed */
	//   23  123:goto            249
_L12:
		c((JSONObject)message.obj);
	//   24  126:aload_0         
	//   25  127:aload_1         
	//   26  128:getfield        #842 <Field Object Message.obj>
	//   27  131:checkcast       #262 <Class JSONObject>
	//   28  134:invokespecial   #848 <Method void c(JSONObject)>
		break; /* Loop/switch isn't completed */
	//   29  137:goto            249
_L11:
		b((JSONArray)message.obj);
	//   30  140:aload_0         
	//   31  141:aload_1         
	//   32  142:getfield        #842 <Field Object Message.obj>
	//   33  145:checkcast       #202 <Class JSONArray>
	//   34  148:invokespecial   #850 <Method void b(JSONArray)>
		break; /* Loop/switch isn't completed */
	//   35  151:goto            249
_L10:
		e();
	//   36  154:aload_0         
	//   37  155:invokespecial   #852 <Method void e()>
		break; /* Loop/switch isn't completed */
	//   38  158:goto            249
_L9:
		c((String)message.obj);
	//   39  161:aload_0         
	//   40  162:aload_1         
	//   41  163:getfield        #842 <Field Object Message.obj>
	//   42  166:checkcast       #596 <Class String>
	//   43  169:invokespecial   #853 <Method void c(String)>
		break; /* Loop/switch isn't completed */
	//   44  172:goto            249
_L8:
		e((JSONObject)message.obj);
	//   45  175:aload_0         
	//   46  176:aload_1         
	//   47  177:getfield        #842 <Field Object Message.obj>
	//   48  180:checkcast       #262 <Class JSONObject>
	//   49  183:invokespecial   #855 <Method void e(JSONObject)>
		break; /* Loop/switch isn't completed */
	//   50  186:goto            249
_L7:
		c((JSONArray)message.obj);
	//   51  189:aload_0         
	//   52  190:aload_1         
	//   53  191:getfield        #842 <Field Object Message.obj>
	//   54  194:checkcast       #202 <Class JSONArray>
	//   55  197:invokespecial   #857 <Method void c(JSONArray)>
		break; /* Loop/switch isn't completed */
	//   56  200:goto            249
_L6:
		d();
	//   57  203:aload_0         
	//   58  204:invokespecial   #859 <Method void d()>
		break; /* Loop/switch isn't completed */
	//   59  207:goto            249
_L5:
		b((JSONObject)message.obj);
	//   60  210:aload_0         
	//   61  211:aload_1         
	//   62  212:getfield        #842 <Field Object Message.obj>
	//   63  215:checkcast       #262 <Class JSONObject>
	//   64  218:invokespecial   #861 <Method void b(JSONObject)>
		break; /* Loop/switch isn't completed */
	//   65  221:goto            249
_L4:
		a((JSONObject)message.obj);
	//   66  224:aload_0         
	//   67  225:aload_1         
	//   68  226:getfield        #842 <Field Object Message.obj>
	//   69  229:checkcast       #262 <Class JSONObject>
	//   70  232:invokespecial   #863 <Method void a(JSONObject)>
		break; /* Loop/switch isn't completed */
	//   71  235:goto            249
_L3:
		c();
	//   72  238:aload_0         
	//   73  239:invokespecial   #865 <Method void c()>
		break; /* Loop/switch isn't completed */
	//   74  242:goto            249
_L2:
		b();
	//   75  245:aload_0         
	//   76  246:invokespecial   #867 <Method void b()>
		e.unlock();
	//   77  249:aload_0         
	//   78  250:getfield        #124 <Field Lock e>
	//   79  253:invokeinterface #832 <Method void Lock.unlock()>
		return;
	//   80  258:return          
		message;
	//   81  259:astore_1        
		e.unlock();
	//   82  260:aload_0         
	//   83  261:getfield        #124 <Field Lock e>
	//   84  264:invokeinterface #832 <Method void Lock.unlock()>
		throw message;
	//   85  269:aload_1         
	//   86  270:athrow          
	//*  87  271:goto            249
	}

	final m a;
	private com.mixpanel.android.b.e b;
	private n c;
	private final String d;
	private final Lock e = new ReentrantLock();
	private final c f;
	private final d g;
	private final Map h = new HashMap();
	private final List i = new ArrayList();
	private final List j = new ArrayList();
	private final Map k = new HashMap();
	private final Set l = new HashSet();
	private final Set m = new HashSet();
	private final Set n = new HashSet();
	private final Set o = new HashSet();
	private final Set p = new HashSet();
	private final Set q = new HashSet();

	public m$f(m m1, Context context, String s, Looper looper, o$i o$i)
	{
		a = m1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field m a>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:invokespecial   #49  <Method void Handler(Looper)>
		d = s;
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:putfield        #51  <Field String d>
		c = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #53  <Field n c>
		s = com.mixpanel.android.b.m.d(m1).x();
	//   12   21:aload_1         
	//   13   22:invokestatic    #56  <Method h com.mixpanel.android.b.m.d(m)>
	//   14   25:invokevirtual   #62  <Method String h.x()>
	//   15   28:astore_3        
		m1 = ((m) (s));
	//   16   29:aload_3         
	//   17   30:astore_1        
		if(s == null)
	//*  18   31:aload_3         
	//*  19   32:ifnonnull       40
			m1 = ((m) (context.getPackageName()));
	//   20   35:aload_2         
	//   21   36:invokevirtual   #67  <Method String Context.getPackageName()>
	//   22   39:astore_1        
		m1 = ((m) (new com.mixpanel.android.mpmetrics.p$b(((String) (m1)), context)));
	//   23   40:new             #69  <Class com.mixpanel.android.mpmetrics.p$b>
	//   24   43:dup             
	//   25   44:aload_1         
	//   26   45:aload_2         
	//   27   46:invokespecial   #72  <Method void com.mixpanel.android.mpmetrics.p$b(String, Context)>
	//   28   49:astore_1        
		g = new d(context, "ViewCrawler");
	//   29   50:aload_0         
	//   30   51:new             #74  <Class d>
	//   31   54:dup             
	//   32   55:aload_2         
	//   33   56:ldc1            #76  <String "ViewCrawler">
	//   34   58:invokespecial   #79  <Method void d(Context, String)>
	//   35   61:putfield        #81  <Field d g>
		f = new c(context, ((com.mixpanel.android.mpmetrics.o) (m1)), g, o$i);
	//   36   64:aload_0         
	//   37   65:new             #83  <Class c>
	//   38   68:dup             
	//   39   69:aload_2         
	//   40   70:aload_1         
	//   41   71:aload_0         
	//   42   72:getfield        #81  <Field d g>
	//   43   75:aload           5
	//   44   77:invokespecial   #86  <Method void c(Context, com.mixpanel.android.mpmetrics.o, d, o$i)>
	//   45   80:putfield        #88  <Field c f>
	//   46   83:aload_0         
	//   47   84:new             #90  <Class HashSet>
	//   48   87:dup             
	//   49   88:invokespecial   #93  <Method void HashSet()>
	//   50   91:putfield        #95  <Field Set p>
	//   51   94:aload_0         
	//   52   95:new             #97  <Class HashMap>
	//   53   98:dup             
	//   54   99:invokespecial   #98  <Method void HashMap()>
	//   55  102:putfield        #100 <Field Map h>
	//   56  105:aload_0         
	//   57  106:new             #102 <Class ArrayList>
	//   58  109:dup             
	//   59  110:invokespecial   #103 <Method void ArrayList()>
	//   60  113:putfield        #105 <Field List i>
	//   61  116:aload_0         
	//   62  117:new             #102 <Class ArrayList>
	//   63  120:dup             
	//   64  121:invokespecial   #103 <Method void ArrayList()>
	//   65  124:putfield        #107 <Field List j>
	//   66  127:aload_0         
	//   67  128:new             #97  <Class HashMap>
	//   68  131:dup             
	//   69  132:invokespecial   #98  <Method void HashMap()>
	//   70  135:putfield        #109 <Field Map k>
	//   71  138:aload_0         
	//   72  139:new             #90  <Class HashSet>
	//   73  142:dup             
	//   74  143:invokespecial   #93  <Method void HashSet()>
	//   75  146:putfield        #111 <Field Set l>
	//   76  149:aload_0         
	//   77  150:new             #90  <Class HashSet>
	//   78  153:dup             
	//   79  154:invokespecial   #93  <Method void HashSet()>
	//   80  157:putfield        #113 <Field Set m>
	//   81  160:aload_0         
	//   82  161:new             #90  <Class HashSet>
	//   83  164:dup             
	//   84  165:invokespecial   #93  <Method void HashSet()>
	//   85  168:putfield        #115 <Field Set n>
	//   86  171:aload_0         
	//   87  172:new             #90  <Class HashSet>
	//   88  175:dup             
	//   89  176:invokespecial   #93  <Method void HashSet()>
	//   90  179:putfield        #117 <Field Set o>
	//   91  182:aload_0         
	//   92  183:new             #90  <Class HashSet>
	//   93  186:dup             
	//   94  187:invokespecial   #93  <Method void HashSet()>
	//   95  190:putfield        #119 <Field Set q>
	//   96  193:aload_0         
	//   97  194:new             #121 <Class ReentrantLock>
	//   98  197:dup             
	//   99  198:invokespecial   #122 <Method void ReentrantLock()>
	//  100  201:putfield        #124 <Field Lock e>
		e.lock();
	//  101  204:aload_0         
	//  102  205:getfield        #124 <Field Lock e>
	//  103  208:invokeinterface #129 <Method void Lock.lock()>
	//  104  213:return          
	}
}
