// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.models.outgoing;

import com.appboy.enums.Gender;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import org.json.*;

public class FacebookUser
	implements IPutIntoJson
{

	public FacebookUser(String s, String s1, String s2, String s3, String s4, String s5, Gender gender, 
			Integer integer, Collection collection, String s6)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field String b>
		c = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field String c>
		d = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #44  <Field String d>
		e = s3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #46  <Field String e>
		f = s4;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #48  <Field String f>
		g = s5;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #50  <Field String g>
		h = gender;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #52  <Field Gender h>
		i = integer;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #54  <Field Integer i>
		j = collection;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #56  <Field Collection j>
		k = s6;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #58  <Field String k>
	//   32   61:return          
	}

	private JSONArray a()
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #63  <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void JSONArray()>
	//    3    7:astore_1        
		JSONObject jsonobject;
		for(Iterator iterator = j.iterator(); iterator.hasNext(); jsonarray.put(((Object) (jsonobject))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #56  <Field Collection j>
	//*   6   12:invokeinterface #70  <Method Iterator Collection.iterator()>
	//*   7   17:astore_2        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            65
		{
			String s = (String)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #80  <Method Object Iterator.next()>
	//   13   33:checkcast       #82  <Class String>
	//   14   36:astore_3        
			jsonobject = new JSONObject();
	//   15   37:new             #84  <Class JSONObject>
	//   16   40:dup             
	//   17   41:invokespecial   #85  <Method void JSONObject()>
	//   18   44:astore          4
			jsonobject.put("name", ((Object) (s)));
	//   19   46:aload           4
	//   20   48:ldc1            #87  <String "name">
	//   21   50:aload_3         
	//   22   51:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   23   54:pop             
		}

	//   24   55:aload_1         
	//   25   56:aload           4
	//   26   58:invokevirtual   #94  <Method JSONArray JSONArray.put(Object)>
	//   27   61:pop             
	//*  28   62:goto            18
		return jsonarray;
	//   29   65:aload_1         
	//   30   66:areturn         
	}

	public volatile Object forJsonPut()
	{
		return ((Object) (forJsonPut()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method JSONObject forJsonPut()>
	//    2    4:areturn         
	}

	public JSONObject forJsonPut()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #84  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void JSONObject()>
	//    3    7:astore_1        
		if(!StringUtils.isNullOrBlank(b))
	//*   4    8:aload_0         
	//*   5    9:getfield        #40  <Field String b>
	//*   6   12:invokestatic    #106 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   7   15:ifne            29
			jsonobject.put("id", ((Object) (b)));
	//    8   18:aload_1         
	//    9   19:ldc1            #108 <String "id">
	//   10   21:aload_0         
	//   11   22:getfield        #40  <Field String b>
	//   12   25:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   13   28:pop             
		if(!StringUtils.isNullOrBlank(c))
	//*  14   29:aload_0         
	//*  15   30:getfield        #42  <Field String c>
	//*  16   33:invokestatic    #106 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  17   36:ifne            50
			jsonobject.put("first_name", ((Object) (c)));
	//   18   39:aload_1         
	//   19   40:ldc1            #110 <String "first_name">
	//   20   42:aload_0         
	//   21   43:getfield        #42  <Field String c>
	//   22   46:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   23   49:pop             
		if(!StringUtils.isNullOrBlank(d))
	//*  24   50:aload_0         
	//*  25   51:getfield        #44  <Field String d>
	//*  26   54:invokestatic    #106 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  27   57:ifne            71
			jsonobject.put("last_name", ((Object) (d)));
	//   28   60:aload_1         
	//   29   61:ldc1            #112 <String "last_name">
	//   30   63:aload_0         
	//   31   64:getfield        #44  <Field String d>
	//   32   67:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   33   70:pop             
		if(!StringUtils.isNullOrBlank(e))
	//*  34   71:aload_0         
	//*  35   72:getfield        #46  <Field String e>
	//*  36   75:invokestatic    #106 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  37   78:ifne            92
			jsonobject.put("email", ((Object) (e)));
	//   38   81:aload_1         
	//   39   82:ldc1            #114 <String "email">
	//   40   84:aload_0         
	//   41   85:getfield        #46  <Field String e>
	//   42   88:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   43   91:pop             
		if(!StringUtils.isNullOrBlank(f))
	//*  44   92:aload_0         
	//*  45   93:getfield        #48  <Field String f>
	//*  46   96:invokestatic    #106 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  47   99:ifne            113
			jsonobject.put("bio", ((Object) (f)));
	//   48  102:aload_1         
	//   49  103:ldc1            #116 <String "bio">
	//   50  105:aload_0         
	//   51  106:getfield        #48  <Field String f>
	//   52  109:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   53  112:pop             
		if(!StringUtils.isNullOrBlank(k))
	//*  54  113:aload_0         
	//*  55  114:getfield        #58  <Field String k>
	//*  56  117:invokestatic    #106 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  57  120:ifne            134
			jsonobject.put("birthday", ((Object) (k)));
	//   58  123:aload_1         
	//   59  124:ldc1            #118 <String "birthday">
	//   60  126:aload_0         
	//   61  127:getfield        #58  <Field String k>
	//   62  130:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   63  133:pop             
		if(!StringUtils.isNullOrBlank(g))
	//*  64  134:aload_0         
	//*  65  135:getfield        #50  <Field String g>
	//*  66  138:invokestatic    #106 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  67  141:ifne            171
		{
			JSONObject jsonobject1 = new JSONObject();
	//   68  144:new             #84  <Class JSONObject>
	//   69  147:dup             
	//   70  148:invokespecial   #85  <Method void JSONObject()>
	//   71  151:astore_2        
			jsonobject1.put("name", ((Object) (g)));
	//   72  152:aload_2         
	//   73  153:ldc1            #87  <String "name">
	//   74  155:aload_0         
	//   75  156:getfield        #50  <Field String g>
	//   76  159:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   77  162:pop             
			jsonobject.put("location", ((Object) (jsonobject1)));
	//   78  163:aload_1         
	//   79  164:ldc1            #120 <String "location">
	//   80  166:aload_2         
	//   81  167:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   82  170:pop             
		}
		if(h != null)
	//*  83  171:aload_0         
	//*  84  172:getfield        #52  <Field Gender h>
	//*  85  175:ifnull          192
			jsonobject.put("gender", ((Object) (h.forJsonPut())));
	//   86  178:aload_1         
	//   87  179:ldc1            #122 <String "gender">
	//   88  181:aload_0         
	//   89  182:getfield        #52  <Field Gender h>
	//   90  185:invokevirtual   #127 <Method String Gender.forJsonPut()>
	//   91  188:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   92  191:pop             
		jsonobject.put("num_friends", ((Object) (i)));
	//   93  192:aload_1         
	//   94  193:ldc1            #129 <String "num_friends">
	//   95  195:aload_0         
	//   96  196:getfield        #54  <Field Integer i>
	//   97  199:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//   98  202:pop             
		if(j == null || j.isEmpty())
			break MISSING_BLOCK_LABEL_246;
	//   99  203:aload_0         
	//  100  204:getfield        #56  <Field Collection j>
	//  101  207:ifnull          246
	//  102  210:aload_0         
	//  103  211:getfield        #56  <Field Collection j>
	//  104  214:invokeinterface #132 <Method boolean Collection.isEmpty()>
	//  105  219:ifne            246
		jsonobject.put("likes", ((Object) (a())));
	//  106  222:aload_1         
	//  107  223:ldc1            #134 <String "likes">
	//  108  225:aload_0         
	//  109  226:invokespecial   #136 <Method JSONArray a()>
	//  110  229:invokevirtual   #91  <Method JSONObject JSONObject.put(String, Object)>
	//  111  232:pop             
		return jsonobject;
	//  112  233:aload_1         
	//  113  234:areturn         
		JSONException jsonexception;
		jsonexception;
	//  114  235:astore_2        
		AppboyLogger.e(a, "Caught exception creating facebook user Json.", ((Throwable) (jsonexception)));
	//  115  236:getstatic       #33  <Field String a>
	//  116  239:ldc1            #138 <String "Caught exception creating facebook user Json.">
	//  117  241:aload_2         
	//  118  242:invokestatic    #141 <Method int AppboyLogger.e(String, String, Throwable)>
	//  119  245:pop             
		return jsonobject;
	//  120  246:aload_1         
	//  121  247:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/models/outgoing/FacebookUser);
	private final String b;
	private final String c;
	private final String d;
	private final String e;
	private final String f;
	private final String g;
	private final Gender h;
	private final Integer i;
	private final Collection j;
	private final String k;

	static 
	{
	//    0    0:ldc1            #2   <Class FacebookUser>
	//    1    2:invokestatic    #31  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #33  <Field String a>
	//*   3    8:return          
	}
}
