// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.support.v4.util.SimpleArrayMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzacd, zzabv, zzakb, zzoj, 
//			zzaqw, zzos, zzpb

public final class zzacp
	implements zzacd
{

	public zzacp(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzcbk = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field boolean zzcbk>
	//    5    9:return          
	}

	public final zzpb zza(zzabv zzabv1, JSONObject jsonobject)
		throws JSONException, InterruptedException, ExecutionException
	{
		Object obj1 = ((Object) (new SimpleArrayMap()));
	//    0    0:new             #28  <Class SimpleArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void SimpleArrayMap()>
	//    3    7:astore          7
		SimpleArrayMap simplearraymap = new SimpleArrayMap();
	//    4    9:new             #28  <Class SimpleArrayMap>
	//    5   12:dup             
	//    6   13:invokespecial   #29  <Method void SimpleArrayMap()>
	//    7   16:astore          6
		zzanz zzanz = zzabv1.zzg(jsonobject);
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokevirtual   #35  <Method zzanz zzabv.zzg(JSONObject)>
	//   11   23:astore          8
		Object obj2 = ((Object) (zzabv1.zzc(jsonobject, "video")));
	//   12   25:aload_1         
	//   13   26:aload_2         
	//   14   27:ldc1            #37  <String "video">
	//   15   29:invokevirtual   #41  <Method zzanz zzabv.zzc(JSONObject, String)>
	//   16   32:astore          9
		Object obj3 = ((Object) (jsonobject.getJSONArray("custom_assets")));
	//   17   34:aload_2         
	//   18   35:ldc1            #43  <String "custom_assets">
	//   19   37:invokevirtual   #49  <Method JSONArray JSONObject.getJSONArray(String)>
	//   20   40:astore          10
		boolean flag = false;
	//   21   42:iconst_0        
	//   22   43:istore          4
		for(int i = 0; i < ((JSONArray) (obj3)).length(); i++)
	//*  23   45:iconst_0        
	//*  24   46:istore_3        
	//*  25   47:iload_3         
	//*  26   48:aload           10
	//*  27   50:invokevirtual   #55  <Method int JSONArray.length()>
	//*  28   53:icmpge          194
		{
			Object obj = ((Object) (((JSONArray) (obj3)).getJSONObject(i)));
	//   29   56:aload           10
	//   30   58:iload_3         
	//   31   59:invokevirtual   #59  <Method JSONObject JSONArray.getJSONObject(int)>
	//   32   62:astore          5
			String s1 = ((JSONObject) (obj)).getString("type");
	//   33   64:aload           5
	//   34   66:ldc1            #61  <String "type">
	//   35   68:invokevirtual   #65  <Method String JSONObject.getString(String)>
	//   36   71:astore          11
			if("string".equals(((Object) (s1))))
	//*  37   73:ldc1            #67  <String "string">
	//*  38   75:aload           11
	//*  39   77:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  40   80:ifeq            106
			{
				simplearraymap.put(((Object) (((JSONObject) (obj)).getString("name"))), ((Object) (((JSONObject) (obj)).getString("string_value"))));
	//   41   83:aload           6
	//   42   85:aload           5
	//   43   87:ldc1            #75  <String "name">
	//   44   89:invokevirtual   #65  <Method String JSONObject.getString(String)>
	//   45   92:aload           5
	//   46   94:ldc1            #77  <String "string_value">
	//   47   96:invokevirtual   #65  <Method String JSONObject.getString(String)>
	//   48   99:invokevirtual   #81  <Method Object SimpleArrayMap.put(Object, Object)>
	//   49  102:pop             
				continue;
	//   50  103:goto            187
			}
			if("image".equals(((Object) (s1))))
	//*  51  106:ldc1            #83  <String "image">
	//*  52  108:aload           11
	//*  53  110:invokevirtual   #73  <Method boolean String.equals(Object)>
	//*  54  113:ifeq            144
			{
				((SimpleArrayMap) (obj1)).put(((Object) (((JSONObject) (obj)).getString("name"))), ((Object) (zzabv1.zza(((JSONObject) (obj)), "image_value", zzcbk))));
	//   55  116:aload           7
	//   56  118:aload           5
	//   57  120:ldc1            #75  <String "name">
	//   58  122:invokevirtual   #65  <Method String JSONObject.getString(String)>
	//   59  125:aload_1         
	//   60  126:aload           5
	//   61  128:ldc1            #85  <String "image_value">
	//   62  130:aload_0         
	//   63  131:getfield        #17  <Field boolean zzcbk>
	//   64  134:invokevirtual   #88  <Method Future zzabv.zza(JSONObject, String, boolean)>
	//   65  137:invokevirtual   #81  <Method Object SimpleArrayMap.put(Object, Object)>
	//   66  140:pop             
				continue;
	//   67  141:goto            187
			}
			obj = ((Object) (String.valueOf(((Object) (s1)))));
	//   68  144:aload           11
	//   69  146:invokestatic    #92  <Method String String.valueOf(Object)>
	//   70  149:astore          5
			if(((String) (obj)).length() != 0)
	//*  71  151:aload           5
	//*  72  153:invokevirtual   #93  <Method int String.length()>
	//*  73  156:ifeq            171
				obj = ((Object) ("Unknown custom asset type: ".concat(((String) (obj)))));
	//   74  159:ldc1            #95  <String "Unknown custom asset type: ">
	//   75  161:aload           5
	//   76  163:invokevirtual   #98  <Method String String.concat(String)>
	//   77  166:astore          5
			else
	//*  78  168:goto            182
				obj = ((Object) (new String("Unknown custom asset type: ")));
	//   79  171:new             #69  <Class String>
	//   80  174:dup             
	//   81  175:ldc1            #95  <String "Unknown custom asset type: ">
	//   82  177:invokespecial   #101 <Method void String(String)>
	//   83  180:astore          5
			zzakb.zzdk(((String) (obj)));
	//   84  182:aload           5
	//   85  184:invokestatic    #106 <Method void zzakb.zzdk(String)>
		}

	//   86  187:iload_3         
	//   87  188:iconst_1        
	//   88  189:iadd            
	//   89  190:istore_3        
	//*  90  191:goto            47
		obj3 = ((Object) (zzabv.zzc(((zzanz) (obj2)))));
	//   91  194:aload           9
	//   92  196:invokestatic    #109 <Method zzaqw zzabv.zzc(zzanz)>
	//   93  199:astore          10
		String s = jsonobject.getString("custom_template_id");
	//   94  201:aload_2         
	//   95  202:ldc1            #111 <String "custom_template_id">
	//   96  204:invokevirtual   #65  <Method String JSONObject.getString(String)>
	//   97  207:astore          5
		obj2 = ((Object) (new SimpleArrayMap()));
	//   98  209:new             #28  <Class SimpleArrayMap>
	//   99  212:dup             
	//  100  213:invokespecial   #29  <Method void SimpleArrayMap()>
	//  101  216:astore          9
		for(int j = ((int) (flag)); j < ((SimpleArrayMap) (obj1)).size(); j++)
	//* 102  218:iload           4
	//* 103  220:istore_3        
	//* 104  221:iload_3         
	//* 105  222:aload           7
	//* 106  224:invokevirtual   #114 <Method int SimpleArrayMap.size()>
	//* 107  227:icmpge          263
			((SimpleArrayMap) (obj2)).put(((SimpleArrayMap) (obj1)).keyAt(j), ((Future)((SimpleArrayMap) (obj1)).valueAt(j)).get());
	//  108  230:aload           9
	//  109  232:aload           7
	//  110  234:iload_3         
	//  111  235:invokevirtual   #118 <Method Object SimpleArrayMap.keyAt(int)>
	//  112  238:aload           7
	//  113  240:iload_3         
	//  114  241:invokevirtual   #121 <Method Object SimpleArrayMap.valueAt(int)>
	//  115  244:checkcast       #123 <Class Future>
	//  116  247:invokeinterface #127 <Method Object Future.get()>
	//  117  252:invokevirtual   #81  <Method Object SimpleArrayMap.put(Object, Object)>
	//  118  255:pop             

	//  119  256:iload_3         
	//  120  257:iconst_1        
	//  121  258:iadd            
	//  122  259:istore_3        
	//* 123  260:goto            221
		obj1 = ((Object) ((zzoj)((Future) (zzanz)).get()));
	//  124  263:aload           8
	//  125  265:invokeinterface #127 <Method Object Future.get()>
	//  126  270:checkcast       #129 <Class zzoj>
	//  127  273:astore          7
		if(obj3 != null)
	//* 128  275:aload           10
	//* 129  277:ifnull          291
			zzabv1 = ((zzabv) (((zzaqw) (obj3)).zztm()));
	//  130  280:aload           10
	//  131  282:invokeinterface #135 <Method zzarl zzaqw.zztm()>
	//  132  287:astore_1        
		else
	//* 133  288:goto            293
			zzabv1 = null;
	//  134  291:aconst_null     
	//  135  292:astore_1        
		if(obj3 != null)
	//* 136  293:aload           10
	//* 137  295:ifnull          309
			jsonobject = ((JSONObject) (((zzaqw) (obj3)).getView()));
	//  138  298:aload           10
	//  139  300:invokeinterface #139 <Method android.view.View zzaqw.getView()>
	//  140  305:astore_2        
		else
	//* 141  306:goto            311
			jsonobject = null;
	//  142  309:aconst_null     
	//  143  310:astore_2        
		return ((zzpb) (new zzos(s, ((SimpleArrayMap) (obj2)), simplearraymap, ((zzoj) (obj1)), ((zzlo) (zzabv1)), ((android.view.View) (jsonobject)))));
	//  144  311:new             #141 <Class zzos>
	//  145  314:dup             
	//  146  315:aload           5
	//  147  317:aload           9
	//  148  319:aload           6
	//  149  321:aload           7
	//  150  323:aload_1         
	//  151  324:aload_2         
	//  152  325:invokespecial   #144 <Method void zzos(String, SimpleArrayMap, SimpleArrayMap, zzoj, zzlo, android.view.View)>
	//  153  328:areturn         
	}

	private final boolean zzcbk;
}
