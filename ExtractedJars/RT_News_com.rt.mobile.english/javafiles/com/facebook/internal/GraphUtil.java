// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookException;
import org.json.*;

public class GraphUtil
{

	public GraphUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static JSONObject createOpenGraphActionForPost(String s)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #28  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void JSONObject()>
	//    3    7:astore_1        
		if(s != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          34
		{
			try
			{
				jsonobject.put("type", ((Object) (s)));
	//    6   12:aload_1         
	//    7   13:ldc1            #31  <String "type">
	//    8   15:aload_0         
	//    9   16:invokevirtual   #35  <Method JSONObject JSONObject.put(String, Object)>
	//   10   19:pop             
			}
	//*  11   20:aload_1         
	//*  12   21:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  13   22:astore_0        
			{
				throw new FacebookException("An error occurred while setting up the open graph action", ((Throwable) (s)));
	//   14   23:new             #37  <Class FacebookException>
	//   15   26:dup             
	//   16   27:ldc1            #39  <String "An error occurred while setting up the open graph action">
	//   17   29:aload_0         
	//   18   30:invokespecial   #42  <Method void FacebookException(String, Throwable)>
	//   19   33:athrow          
			}
			return jsonobject;
		} else
		{
			return jsonobject;
	//   20   34:aload_1         
	//   21   35:areturn         
		}
	}

	public static JSONObject createOpenGraphObjectForPost(String s)
	{
		return createOpenGraphObjectForPost(s, ((String) (null)), ((String) (null)), ((String) (null)), ((String) (null)), ((JSONObject) (null)), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:invokestatic    #46  <Method JSONObject createOpenGraphObjectForPost(String, String, String, String, String, JSONObject, String)>
	//    8   10:areturn         
	}

	public static JSONObject createOpenGraphObjectForPost(String s, String s1, String s2, String s3, String s4, JSONObject jsonobject, String s5)
	{
		JSONObject jsonobject1 = new JSONObject();
	//    0    0:new             #28  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void JSONObject()>
	//    3    7:astore          7
		if(s != null)
	//*   4    9:aload_0         
	//*   5   10:ifnull          25
			try
			{
				jsonobject1.put("type", ((Object) (s)));
	//    6   13:aload           7
	//    7   15:ldc1            #31  <String "type">
	//    8   17:aload_0         
	//    9   18:invokevirtual   #35  <Method JSONObject JSONObject.put(String, Object)>
	//   10   21:pop             
			}
	//*  11   22:goto            25
	//*  12   25:aload           7
	//*  13   27:ldc1            #48  <String "title">
	//*  14   29:aload_1         
	//*  15   30:invokevirtual   #35  <Method JSONObject JSONObject.put(String, Object)>
	//*  16   33:pop             
	//*  17   34:aload_2         
	//*  18   35:ifnull          77
	//*  19   38:new             #28  <Class JSONObject>
	//*  20   41:dup             
	//*  21   42:invokespecial   #29  <Method void JSONObject()>
	//*  22   45:astore_0        
	//*  23   46:aload_0         
	//*  24   47:ldc1            #50  <String "url">
	//*  25   49:aload_2         
	//*  26   50:invokevirtual   #35  <Method JSONObject JSONObject.put(String, Object)>
	//*  27   53:pop             
	//*  28   54:new             #52  <Class JSONArray>
	//*  29   57:dup             
	//*  30   58:invokespecial   #53  <Method void JSONArray()>
	//*  31   61:astore_1        
	//*  32   62:aload_1         
	//*  33   63:aload_0         
	//*  34   64:invokevirtual   #56  <Method JSONArray JSONArray.put(Object)>
	//*  35   67:pop             
	//*  36   68:aload           7
	//*  37   70:ldc1            #58  <String "image">
	//*  38   72:aload_1         
	//*  39   73:invokevirtual   #35  <Method JSONObject JSONObject.put(String, Object)>
	//*  40   76:pop             
	//*  41   77:aload           7
	//*  42   79:ldc1            #50  <String "url">
	//*  43   81:aload_3         
	//*  44   82:invokevirtual   #35  <Method JSONObject JSONObject.put(String, Object)>
	//*  45   85:pop             
	//*  46   86:aload           7
	//*  47   88:ldc1            #60  <String "description">
	//*  48   90:aload           4
	//*  49   92:invokevirtual   #35  <Method JSONObject JSONObject.put(String, Object)>
	//*  50   95:pop             
	//*  51   96:aload           7
	//*  52   98:ldc1            #62  <String "fbsdk:create_object">
	//*  53  100:iconst_1        
	//*  54  101:invokevirtual   #65  <Method JSONObject JSONObject.put(String, boolean)>
	//*  55  104:pop             
	//*  56  105:aload           5
	//*  57  107:ifnull          120
	//*  58  110:aload           7
	//*  59  112:ldc1            #67  <String "data">
	//*  60  114:aload           5
	//*  61  116:invokevirtual   #35  <Method JSONObject JSONObject.put(String, Object)>
	//*  62  119:pop             
	//*  63  120:aload           6
	//*  64  122:ifnull          135
	//*  65  125:aload           7
	//*  66  127:ldc1            #69  <String "id">
	//*  67  129:aload           6
	//*  68  131:invokevirtual   #35  <Method JSONObject JSONObject.put(String, Object)>
	//*  69  134:pop             
	//*  70  135:aload           7
	//*  71  137:areturn         
	//*  72  138:new             #37  <Class FacebookException>
	//*  73  141:dup             
	//*  74  142:ldc1            #71  <String "An error occurred while setting up the graph object">
	//*  75  144:aload_0         
	//*  76  145:invokespecial   #42  <Method void FacebookException(String, Throwable)>
	//*  77  148:athrow          
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				throw new FacebookException("An error occurred while setting up the graph object", ((Throwable) (s)));
			}
		jsonobject1.put("title", ((Object) (s1)));
		if(s2 == null)
			break MISSING_BLOCK_LABEL_77;
		s = ((String) (new JSONObject()));
		((JSONObject) (s)).put("url", ((Object) (s2)));
		s1 = ((String) (new JSONArray()));
		((JSONArray) (s1)).put(((Object) (s)));
		jsonobject1.put("image", ((Object) (s1)));
		jsonobject1.put("url", ((Object) (s3)));
		jsonobject1.put("description", ((Object) (s4)));
		jsonobject1.put("fbsdk:create_object", true);
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_120;
		jsonobject1.put("data", ((Object) (jsonobject)));
		if(s5 == null)
			break MISSING_BLOCK_LABEL_135;
		jsonobject1.put("id", ((Object) (s5)));
		return jsonobject1;
	//*  78  149:astore_0        
	//*  79  150:goto            138
	}

	public static boolean isOpenGraphObjectForPost(JSONObject jsonobject)
	{
		if(jsonobject != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
			return jsonobject.optBoolean("fbsdk:create_object");
	//    2    4:aload_0         
	//    3    5:ldc1            #62  <String "fbsdk:create_object">
	//    4    7:invokevirtual   #77  <Method boolean JSONObject.optBoolean(String)>
	//    5   10:ireturn         
		else
			return false;
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	private static final String dateFormats[] = {
		"yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd"
	};

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #12  <String "yyyy-MM-dd'T'HH:mm:ssZ">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #14  <String "yyyy-MM-dd'T'HH:mm:ss">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #16  <String "yyyy-MM-dd">
	//   13   18:aastore         
	//   14   19:putstatic       #18  <Field String[] dateFormats>
	//*  15   22:return          
	}
}
