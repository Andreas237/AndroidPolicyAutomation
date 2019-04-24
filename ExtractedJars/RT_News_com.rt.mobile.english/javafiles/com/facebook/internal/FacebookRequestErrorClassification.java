// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FacebookRequestErrorClassification
{

	FacebookRequestErrorClassification(Map map, Map map1, Map map2, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		otherErrors = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #58  <Field Map otherErrors>
		transientErrors = map1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #60  <Field Map transientErrors>
		loginRecoverableErrors = map2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #62  <Field Map loginRecoverableErrors>
		otherRecoveryMessage = s;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #64  <Field String otherRecoveryMessage>
		transientRecoveryMessage = s1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #66  <Field String transientRecoveryMessage>
		loginRecoverableRecoveryMessage = s2;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #68  <Field String loginRecoverableRecoveryMessage>
	//   20   37:return          
	}

	public static FacebookRequestErrorClassification createFromJSON(JSONArray jsonarray)
	{
		if(jsonarray == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		Map map2 = null;
	//    6    8:aconst_null     
	//    7    9:astore          7
		Map map = map2;
	//    8   11:aload           7
	//    9   13:astore_2        
		Map map1 = map;
	//   10   14:aload_2         
	//   11   15:astore_3        
		Object obj = ((Object) (map1));
	//   12   16:aload_3         
	//   13   17:astore          4
		Object obj1 = obj;
	//   14   19:aload           4
	//   15   21:astore          5
		Object obj2 = obj1;
	//   16   23:aload           5
	//   17   25:astore          6
		while(i < jsonarray.length()) 
	//*  18   27:iload_1         
	//*  19   28:aload_0         
	//*  20   29:invokevirtual   #79  <Method int JSONArray.length()>
	//*  21   32:icmpge          250
		{
			JSONObject jsonobject = jsonarray.optJSONObject(i);
	//   22   35:aload_0         
	//   23   36:iload_1         
	//   24   37:invokevirtual   #83  <Method JSONObject JSONArray.optJSONObject(int)>
	//   25   40:astore          12
			Map map3;
			Map map4;
			Object obj3;
			Object obj4;
			if(jsonobject == null)
	//*  26   42:aload           12
	//*  27   44:ifnonnull       65
			{
				map3 = map2;
	//   28   47:aload           7
	//   29   49:astore          8
				map4 = map;
	//   30   51:aload_2         
	//   31   52:astore          9
				obj3 = obj;
	//   32   54:aload           4
	//   33   56:astore          10
				obj4 = obj1;
	//   34   58:aload           5
	//   35   60:astore          11
			} else
	//*  36   62:goto            228
			{
				String s = jsonobject.optString("name");
	//   37   65:aload           12
	//   38   67:ldc1            #32  <String "name">
	//   39   69:invokevirtual   #89  <Method String JSONObject.optString(String)>
	//   40   72:astore          13
				if(s == null)
	//*  41   74:aload           13
	//*  42   76:ifnonnull       97
				{
					map3 = map2;
	//   43   79:aload           7
	//   44   81:astore          8
					map4 = map;
	//   45   83:aload_2         
	//   46   84:astore          9
					obj3 = obj;
	//   47   86:aload           4
	//   48   88:astore          10
					obj4 = obj1;
	//   49   90:aload           5
	//   50   92:astore          11
				} else
	//*  51   94:goto            228
				if(s.equalsIgnoreCase("other"))
	//*  52   97:aload           13
	//*  53   99:ldc1            #35  <String "other">
	//*  54  101:invokevirtual   #95  <Method boolean String.equalsIgnoreCase(String)>
	//*  55  104:ifeq            134
				{
					obj3 = ((Object) (jsonobject.optString("recovery_message", ((String) (null)))));
	//   56  107:aload           12
	//   57  109:ldc1            #38  <String "recovery_message">
	//   58  111:aconst_null     
	//   59  112:invokevirtual   #98  <Method String JSONObject.optString(String, String)>
	//   60  115:astore          10
					map3 = parseJSONDefinition(jsonobject);
	//   61  117:aload           12
	//   62  119:invokestatic    #102 <Method Map parseJSONDefinition(JSONObject)>
	//   63  122:astore          8
					map4 = map;
	//   64  124:aload_2         
	//   65  125:astore          9
					obj4 = obj1;
	//   66  127:aload           5
	//   67  129:astore          11
				} else
	//*  68  131:goto            228
				if(s.equalsIgnoreCase("transient"))
	//*  69  134:aload           13
	//*  70  136:ldc1            #41  <String "transient">
	//*  71  138:invokevirtual   #95  <Method boolean String.equalsIgnoreCase(String)>
	//*  72  141:ifeq            172
				{
					obj4 = ((Object) (jsonobject.optString("recovery_message", ((String) (null)))));
	//   73  144:aload           12
	//   74  146:ldc1            #38  <String "recovery_message">
	//   75  148:aconst_null     
	//   76  149:invokevirtual   #98  <Method String JSONObject.optString(String, String)>
	//   77  152:astore          11
					map4 = parseJSONDefinition(jsonobject);
	//   78  154:aload           12
	//   79  156:invokestatic    #102 <Method Map parseJSONDefinition(JSONObject)>
	//   80  159:astore          9
					map3 = map2;
	//   81  161:aload           7
	//   82  163:astore          8
					obj3 = obj;
	//   83  165:aload           4
	//   84  167:astore          10
				} else
	//*  85  169:goto            228
				{
					map3 = map2;
	//   86  172:aload           7
	//   87  174:astore          8
					map4 = map;
	//   88  176:aload_2         
	//   89  177:astore          9
					obj3 = obj;
	//   90  179:aload           4
	//   91  181:astore          10
					obj4 = obj1;
	//   92  183:aload           5
	//   93  185:astore          11
					if(s.equalsIgnoreCase("login_recoverable"))
	//*  94  187:aload           13
	//*  95  189:ldc1            #29  <String "login_recoverable">
	//*  96  191:invokevirtual   #95  <Method boolean String.equalsIgnoreCase(String)>
	//*  97  194:ifeq            228
					{
						obj2 = ((Object) (jsonobject.optString("recovery_message", ((String) (null)))));
	//   98  197:aload           12
	//   99  199:ldc1            #38  <String "recovery_message">
	//  100  201:aconst_null     
	//  101  202:invokevirtual   #98  <Method String JSONObject.optString(String, String)>
	//  102  205:astore          6
						map1 = parseJSONDefinition(jsonobject);
	//  103  207:aload           12
	//  104  209:invokestatic    #102 <Method Map parseJSONDefinition(JSONObject)>
	//  105  212:astore_3        
						obj4 = obj1;
	//  106  213:aload           5
	//  107  215:astore          11
						obj3 = obj;
	//  108  217:aload           4
	//  109  219:astore          10
						map4 = map;
	//  110  221:aload_2         
	//  111  222:astore          9
						map3 = map2;
	//  112  224:aload           7
	//  113  226:astore          8
					}
				}
			}
			i++;
	//  114  228:iload_1         
	//  115  229:iconst_1        
	//  116  230:iadd            
	//  117  231:istore_1        
			map2 = map3;
	//  118  232:aload           8
	//  119  234:astore          7
			map = map4;
	//  120  236:aload           9
	//  121  238:astore_2        
			obj = obj3;
	//  122  239:aload           10
	//  123  241:astore          4
			obj1 = obj4;
	//  124  243:aload           11
	//  125  245:astore          5
		}
	//* 126  247:goto            27
		return new FacebookRequestErrorClassification(map2, map, map1, ((String) (obj)), ((String) (obj1)), ((String) (obj2)));
	//  127  250:new             #2   <Class FacebookRequestErrorClassification>
	//  128  253:dup             
	//  129  254:aload           7
	//  130  256:aload_2         
	//  131  257:aload_3         
	//  132  258:aload           4
	//  133  260:aload           5
	//  134  262:aload           6
	//  135  264:invokespecial   #104 <Method void FacebookRequestErrorClassification(Map, Map, Map, String, String, String)>
	//  136  267:areturn         
	}

	public static FacebookRequestErrorClassification getDefaultErrorClassification()
	{
		com/facebook/internal/FacebookRequestErrorClassification;
	//    0    0:ldc1            #2   <Class FacebookRequestErrorClassification>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		FacebookRequestErrorClassification facebookrequesterrorclassification;
		if(defaultInstance == null)
	//*   2    3:getstatic       #108 <Field FacebookRequestErrorClassification defaultInstance>
	//*   3    6:ifnonnull       15
			defaultInstance = getDefaultErrorClassificationImpl();
	//    4    9:invokestatic    #111 <Method FacebookRequestErrorClassification getDefaultErrorClassificationImpl()>
	//    5   12:putstatic       #108 <Field FacebookRequestErrorClassification defaultInstance>
		facebookrequesterrorclassification = defaultInstance;
	//    6   15:getstatic       #108 <Field FacebookRequestErrorClassification defaultInstance>
	//    7   18:astore_0        
		com/facebook/internal/FacebookRequestErrorClassification;
	//    8   19:ldc1            #2   <Class FacebookRequestErrorClassification>
		JVM INSTR monitorexit ;
	//    9   21:monitorexit     
		return facebookrequesterrorclassification;
	//   10   22:aload_0         
	//   11   23:areturn         
		Exception exception;
		exception;
	//   12   24:astore_0        
	//*  13   25:ldc1            #2   <Class FacebookRequestErrorClassification>
		throw exception;
	//   14   27:monitorexit     
	//   15   28:aload_0         
	//   16   29:athrow          
	}

	private static FacebookRequestErrorClassification getDefaultErrorClassificationImpl()
	{
		return new FacebookRequestErrorClassification(((Map) (null)), ((Map) (new HashMap() {

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #14  <Method void HashMap()>
				put(((Object) (Integer.valueOf(2))), ((Object) (null)));
			//    2    4:aload_0         
			//    3    5:iconst_2        
			//    4    6:invokestatic    #20  <Method Integer Integer.valueOf(int)>
			//    5    9:aconst_null     
			//    6   10:invokevirtual   #24  <Method Object put(Object, Object)>
			//    7   13:pop             
				put(((Object) (Integer.valueOf(4))), ((Object) (null)));
			//    8   14:aload_0         
			//    9   15:iconst_4        
			//   10   16:invokestatic    #20  <Method Integer Integer.valueOf(int)>
			//   11   19:aconst_null     
			//   12   20:invokevirtual   #24  <Method Object put(Object, Object)>
			//   13   23:pop             
				put(((Object) (Integer.valueOf(9))), ((Object) (null)));
			//   14   24:aload_0         
			//   15   25:bipush          9
			//   16   27:invokestatic    #20  <Method Integer Integer.valueOf(int)>
			//   17   30:aconst_null     
			//   18   31:invokevirtual   #24  <Method Object put(Object, Object)>
			//   19   34:pop             
				put(((Object) (Integer.valueOf(17))), ((Object) (null)));
			//   20   35:aload_0         
			//   21   36:bipush          17
			//   22   38:invokestatic    #20  <Method Integer Integer.valueOf(int)>
			//   23   41:aconst_null     
			//   24   42:invokevirtual   #24  <Method Object put(Object, Object)>
			//   25   45:pop             
				put(((Object) (Integer.valueOf(341))), ((Object) (null)));
			//   26   46:aload_0         
			//   27   47:sipush          341
			//   28   50:invokestatic    #20  <Method Integer Integer.valueOf(int)>
			//   29   53:aconst_null     
			//   30   54:invokevirtual   #24  <Method Object put(Object, Object)>
			//   31   57:pop             
			//   32   58:return          
			}
		}
)), ((Map) (new HashMap() {

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #14  <Method void HashMap()>
				put(((Object) (Integer.valueOf(102))), ((Object) (null)));
			//    2    4:aload_0         
			//    3    5:bipush          102
			//    4    7:invokestatic    #20  <Method Integer Integer.valueOf(int)>
			//    5   10:aconst_null     
			//    6   11:invokevirtual   #24  <Method Object put(Object, Object)>
			//    7   14:pop             
				put(((Object) (Integer.valueOf(190))), ((Object) (null)));
			//    8   15:aload_0         
			//    9   16:sipush          190
			//   10   19:invokestatic    #20  <Method Integer Integer.valueOf(int)>
			//   11   22:aconst_null     
			//   12   23:invokevirtual   #24  <Method Object put(Object, Object)>
			//   13   26:pop             
			//   14   27:return          
			}
		}
)), ((String) (null)), ((String) (null)), ((String) (null)));
	//    0    0:new             #2   <Class FacebookRequestErrorClassification>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:new             #6   <Class FacebookRequestErrorClassification$1>
	//    4    8:dup             
	//    5    9:invokespecial   #112 <Method void FacebookRequestErrorClassification$1()>
	//    6   12:new             #8   <Class FacebookRequestErrorClassification$2>
	//    7   15:dup             
	//    8   16:invokespecial   #113 <Method void FacebookRequestErrorClassification$2()>
	//    9   19:aconst_null     
	//   10   20:aconst_null     
	//   11   21:aconst_null     
	//   12   22:invokespecial   #104 <Method void FacebookRequestErrorClassification(Map, Map, Map, String, String, String)>
	//   13   25:areturn         
	}

	private static Map parseJSONDefinition(JSONObject jsonobject)
	{
		JSONArray jsonarray = jsonobject.optJSONArray("items");
	//    0    0:aload_0         
	//    1    1:ldc1            #115 <String "items">
	//    2    3:invokevirtual   #119 <Method JSONArray JSONObject.optJSONArray(String)>
	//    3    6:astore          6
		if(jsonarray.length() == 0)
	//*   4    8:aload           6
	//*   5   10:invokevirtual   #79  <Method int JSONArray.length()>
	//*   6   13:ifne            18
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
		HashMap hashmap = new HashMap();
	//    9   18:new             #121 <Class HashMap>
	//   10   21:dup             
	//   11   22:invokespecial   #122 <Method void HashMap()>
	//   12   25:astore          7
		for(int i = 0; i < jsonarray.length(); i++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
	//*  15   29:iload_1         
	//*  16   30:aload           6
	//*  17   32:invokevirtual   #79  <Method int JSONArray.length()>
	//*  18   35:icmpge          165
		{
			jsonobject = jsonarray.optJSONObject(i);
	//   19   38:aload           6
	//   20   40:iload_1         
	//   21   41:invokevirtual   #83  <Method JSONObject JSONArray.optJSONObject(int)>
	//   22   44:astore_0        
			if(jsonobject == null)
	//*  23   45:aload_0         
	//*  24   46:ifnonnull       52
				continue;
	//   25   49:goto            158
			int k = jsonobject.optInt("code");
	//   26   52:aload_0         
	//   27   53:ldc1            #124 <String "code">
	//   28   55:invokevirtual   #128 <Method int JSONObject.optInt(String)>
	//   29   58:istore_3        
			if(k == 0)
	//*  30   59:iload_3         
	//*  31   60:ifne            66
				continue;
	//   32   63:goto            158
			JSONArray jsonarray1 = jsonobject.optJSONArray("subcodes");
	//   33   66:aload_0         
	//   34   67:ldc1            #130 <String "subcodes">
	//   35   69:invokevirtual   #119 <Method JSONArray JSONObject.optJSONArray(String)>
	//   36   72:astore          8
			if(jsonarray1 != null && jsonarray1.length() > 0)
	//*  37   74:aload           8
	//*  38   76:ifnull          143
	//*  39   79:aload           8
	//*  40   81:invokevirtual   #79  <Method int JSONArray.length()>
	//*  41   84:ifle            143
			{
				HashSet hashset = new HashSet();
	//   42   87:new             #132 <Class HashSet>
	//   43   90:dup             
	//   44   91:invokespecial   #133 <Method void HashSet()>
	//   45   94:astore          5
				int j = 0;
	//   46   96:iconst_0        
	//   47   97:istore_2        
				do
				{
					jsonobject = ((JSONObject) (hashset));
	//   48   98:aload           5
	//   49  100:astore_0        
					if(j >= jsonarray1.length())
						break;
	//   50  101:iload_2         
	//   51  102:aload           8
	//   52  104:invokevirtual   #79  <Method int JSONArray.length()>
	//   53  107:icmpge          145
					int l = jsonarray1.optInt(j);
	//   54  110:aload           8
	//   55  112:iload_2         
	//   56  113:invokevirtual   #136 <Method int JSONArray.optInt(int)>
	//   57  116:istore          4
					if(l != 0)
	//*  58  118:iload           4
	//*  59  120:ifeq            136
						((Set) (hashset)).add(((Object) (Integer.valueOf(l))));
	//   60  123:aload           5
	//   61  125:iload           4
	//   62  127:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   63  130:invokeinterface #148 <Method boolean Set.add(Object)>
	//   64  135:pop             
					j++;
	//   65  136:iload_2         
	//   66  137:iconst_1        
	//   67  138:iadd            
	//   68  139:istore_2        
				} while(true);
	//   69  140:goto            98
			} else
			{
				jsonobject = null;
	//   70  143:aconst_null     
	//   71  144:astore_0        
			}
			((Map) (hashmap)).put(((Object) (Integer.valueOf(k))), ((Object) (jsonobject)));
	//   72  145:aload           7
	//   73  147:iload_3         
	//   74  148:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   75  151:aload_0         
	//   76  152:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   77  157:pop             
		}

	//   78  158:iload_1         
	//   79  159:iconst_1        
	//   80  160:iadd            
	//   81  161:istore_1        
	//*  82  162:goto            29
		return ((Map) (hashmap));
	//   83  165:aload           7
	//   84  167:areturn         
	}

	public com.facebook.FacebookRequestError.Category classify(int i, int j, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            8
			return com.facebook.FacebookRequestError.Category.TRANSIENT;
	//    2    4:getstatic       #163 <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.TRANSIENT>
	//    3    7:areturn         
		if(otherErrors != null && otherErrors.containsKey(((Object) (Integer.valueOf(i)))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #58  <Field Map otherErrors>
	//*   6   12:ifnull          72
	//*   7   15:aload_0         
	//*   8   16:getfield        #58  <Field Map otherErrors>
	//*   9   19:iload_1         
	//*  10   20:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  11   23:invokeinterface #166 <Method boolean Map.containsKey(Object)>
	//*  12   28:ifeq            72
		{
			Set set = (Set)otherErrors.get(((Object) (Integer.valueOf(i))));
	//   13   31:aload_0         
	//   14   32:getfield        #58  <Field Map otherErrors>
	//   15   35:iload_1         
	//   16   36:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   17   39:invokeinterface #170 <Method Object Map.get(Object)>
	//   18   44:checkcast       #144 <Class Set>
	//   19   47:astore          4
			if(set == null || set.contains(((Object) (Integer.valueOf(j)))))
	//*  20   49:aload           4
	//*  21   51:ifnull          68
	//*  22   54:aload           4
	//*  23   56:iload_2         
	//*  24   57:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  25   60:invokeinterface #173 <Method boolean Set.contains(Object)>
	//*  26   65:ifeq            72
				return com.facebook.FacebookRequestError.Category.OTHER;
	//   27   68:getstatic       #176 <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.OTHER>
	//   28   71:areturn         
		}
		if(loginRecoverableErrors != null && loginRecoverableErrors.containsKey(((Object) (Integer.valueOf(i)))))
	//*  29   72:aload_0         
	//*  30   73:getfield        #62  <Field Map loginRecoverableErrors>
	//*  31   76:ifnull          136
	//*  32   79:aload_0         
	//*  33   80:getfield        #62  <Field Map loginRecoverableErrors>
	//*  34   83:iload_1         
	//*  35   84:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  36   87:invokeinterface #166 <Method boolean Map.containsKey(Object)>
	//*  37   92:ifeq            136
		{
			Set set1 = (Set)loginRecoverableErrors.get(((Object) (Integer.valueOf(i))));
	//   38   95:aload_0         
	//   39   96:getfield        #62  <Field Map loginRecoverableErrors>
	//   40   99:iload_1         
	//   41  100:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   42  103:invokeinterface #170 <Method Object Map.get(Object)>
	//   43  108:checkcast       #144 <Class Set>
	//   44  111:astore          4
			if(set1 == null || set1.contains(((Object) (Integer.valueOf(j)))))
	//*  45  113:aload           4
	//*  46  115:ifnull          132
	//*  47  118:aload           4
	//*  48  120:iload_2         
	//*  49  121:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  50  124:invokeinterface #173 <Method boolean Set.contains(Object)>
	//*  51  129:ifeq            136
				return com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE;
	//   52  132:getstatic       #179 <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.LOGIN_RECOVERABLE>
	//   53  135:areturn         
		}
		if(transientErrors != null && transientErrors.containsKey(((Object) (Integer.valueOf(i)))))
	//*  54  136:aload_0         
	//*  55  137:getfield        #60  <Field Map transientErrors>
	//*  56  140:ifnull          200
	//*  57  143:aload_0         
	//*  58  144:getfield        #60  <Field Map transientErrors>
	//*  59  147:iload_1         
	//*  60  148:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  61  151:invokeinterface #166 <Method boolean Map.containsKey(Object)>
	//*  62  156:ifeq            200
		{
			Set set2 = (Set)transientErrors.get(((Object) (Integer.valueOf(i))));
	//   63  159:aload_0         
	//   64  160:getfield        #60  <Field Map transientErrors>
	//   65  163:iload_1         
	//   66  164:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//   67  167:invokeinterface #170 <Method Object Map.get(Object)>
	//   68  172:checkcast       #144 <Class Set>
	//   69  175:astore          4
			if(set2 == null || set2.contains(((Object) (Integer.valueOf(j)))))
	//*  70  177:aload           4
	//*  71  179:ifnull          196
	//*  72  182:aload           4
	//*  73  184:iload_2         
	//*  74  185:invokestatic    #142 <Method Integer Integer.valueOf(int)>
	//*  75  188:invokeinterface #173 <Method boolean Set.contains(Object)>
	//*  76  193:ifeq            200
				return com.facebook.FacebookRequestError.Category.TRANSIENT;
	//   77  196:getstatic       #163 <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.TRANSIENT>
	//   78  199:areturn         
		}
		return com.facebook.FacebookRequestError.Category.OTHER;
	//   79  200:getstatic       #176 <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.OTHER>
	//   80  203:areturn         
	}

	public Map getLoginRecoverableErrors()
	{
		return loginRecoverableErrors;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Map loginRecoverableErrors>
	//    2    4:areturn         
	}

	public Map getOtherErrors()
	{
		return otherErrors;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Map otherErrors>
	//    2    4:areturn         
	}

	public String getRecoveryMessage(com.facebook.FacebookRequestError.Category category)
	{
		static class _cls3
		{

			static final int $SwitchMap$com$facebook$FacebookRequestError$Category[];

			static 
			{
				$SwitchMap$com$facebook$FacebookRequestError$Category = new int[com.facebook.FacebookRequestError.Category.values().length];
			//    0    0:invokestatic    #18  <Method com.facebook.FacebookRequestError$Category[] com.facebook.FacebookRequestError$Category.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$FacebookRequestError$Category>
				try
				{
					$SwitchMap$com$facebook$FacebookRequestError$Category[com.facebook.FacebookRequestError.Category.OTHER.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$FacebookRequestError$Category>
			//    5   12:getstatic       #24  <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.OTHER>
			//    6   15:invokevirtual   #28  <Method int com.facebook.FacebookRequestError$Category.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$facebook$FacebookRequestError$Category>
			//*  10   23:getstatic       #31  <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.LOGIN_RECOVERABLE>
			//*  11   26:invokevirtual   #28  <Method int com.facebook.FacebookRequestError$Category.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$facebook$FacebookRequestError$Category>
			//*  15   34:getstatic       #34  <Field com.facebook.FacebookRequestError$Category com.facebook.FacebookRequestError$Category.TRANSIENT>
			//*  16   37:invokevirtual   #28  <Method int com.facebook.FacebookRequestError$Category.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$com$facebook$FacebookRequestError$Category[com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$com$facebook$FacebookRequestError$Category[com.facebook.FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls3..SwitchMap.com.facebook.FacebookRequestError.Category[category.ordinal()])
	//*   0    0:getstatic       #189 <Field int[] FacebookRequestErrorClassification$3.$SwitchMap$com$facebook$FacebookRequestError$Category>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #192 <Method int com.facebook.FacebookRequestError$Category.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 3: default 36
	//	               1 48
	//	               2 43
	//	               3 38
		default:
			return null;
	//    5   36:aconst_null     
	//    6   37:areturn         

		case 3: // '\003'
			return transientRecoveryMessage;
	//    7   38:aload_0         
	//    8   39:getfield        #66  <Field String transientRecoveryMessage>
	//    9   42:areturn         

		case 2: // '\002'
			return loginRecoverableRecoveryMessage;
	//   10   43:aload_0         
	//   11   44:getfield        #68  <Field String loginRecoverableRecoveryMessage>
	//   12   47:areturn         

		case 1: // '\001'
			return otherRecoveryMessage;
	//   13   48:aload_0         
	//   14   49:getfield        #64  <Field String otherRecoveryMessage>
	//   15   52:areturn         
		}
	}

	public Map getTransientErrors()
	{
		return transientErrors;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Map transientErrors>
	//    2    4:areturn         
	}

	public static final int EC_APP_TOO_MANY_CALLS = 4;
	public static final int EC_INVALID_SESSION = 102;
	public static final int EC_INVALID_TOKEN = 190;
	public static final int EC_RATE = 9;
	public static final int EC_SERVICE_UNAVAILABLE = 2;
	public static final int EC_TOO_MANY_USER_ACTION_CALLS = 341;
	public static final int EC_USER_TOO_MANY_CALLS = 17;
	public static final String KEY_LOGIN_RECOVERABLE = "login_recoverable";
	public static final String KEY_NAME = "name";
	public static final String KEY_OTHER = "other";
	public static final String KEY_RECOVERY_MESSAGE = "recovery_message";
	public static final String KEY_TRANSIENT = "transient";
	private static FacebookRequestErrorClassification defaultInstance;
	private final Map loginRecoverableErrors;
	private final String loginRecoverableRecoveryMessage;
	private final Map otherErrors;
	private final String otherRecoveryMessage;
	private final Map transientErrors;
	private final String transientRecoveryMessage;
}
