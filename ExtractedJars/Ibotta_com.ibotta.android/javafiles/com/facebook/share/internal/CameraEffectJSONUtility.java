// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import java.util.*;
import org.json.*;

public class CameraEffectJSONUtility
{
	public static interface Setter
	{

		public abstract void setOnArgumentsBuilder(com.facebook.share.model.CameraEffectArguments.Builder builder, String s, Object obj)
			throws JSONException;

		public abstract void setOnJSON(JSONObject jsonobject, String s, Object obj)
			throws JSONException;
	}


	public static JSONObject convertToJSON(CameraEffectArguments cameraeffectarguments)
		throws JSONException
	{
		if(cameraeffectarguments == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		JSONObject jsonobject = new JSONObject();
	//    4    6:new             #47  <Class JSONObject>
	//    5    9:dup             
	//    6   10:invokespecial   #48  <Method void JSONObject()>
	//    7   13:astore_2        
		Iterator iterator = cameraeffectarguments.keySet().iterator();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #54  <Method Set CameraEffectArguments.keySet()>
	//   10   18:invokeinterface #60  <Method Iterator Set.iterator()>
	//   11   23:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   24:aload_3         
	//   13   25:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   14   30:ifeq            130
			String s = (String)iterator.next();
	//   15   33:aload_3         
	//   16   34:invokeinterface #70  <Method Object Iterator.next()>
	//   17   39:checkcast       #27  <Class String>
	//   18   42:astore          4
			Object obj = cameraeffectarguments.get(s);
	//   19   44:aload_0         
	//   20   45:aload           4
	//   21   47:invokevirtual   #74  <Method Object CameraEffectArguments.get(String)>
	//   22   50:astore_1        
			if(obj != null)
	//*  23   51:aload_1         
	//*  24   52:ifnonnull       58
	//*  25   55:goto            24
			{
				Setter setter = (Setter)SETTERS.get(((Object) (obj.getClass())));
	//   26   58:getstatic       #25  <Field Map SETTERS>
	//   27   61:aload_1         
	//   28   62:invokevirtual   #78  <Method Class Object.getClass()>
	//   29   65:invokeinterface #81  <Method Object Map.get(Object)>
	//   30   70:checkcast       #12  <Class CameraEffectJSONUtility$Setter>
	//   31   73:astore          5
				if(setter != null)
	//*  32   75:aload           5
	//*  33   77:ifnull          94
				{
					setter.setOnJSON(jsonobject, s, obj);
	//   34   80:aload           5
	//   35   82:aload_2         
	//   36   83:aload           4
	//   37   85:aload_1         
	//   38   86:invokeinterface #85  <Method void CameraEffectJSONUtility$Setter.setOnJSON(JSONObject, String, Object)>
				} else
	//*  39   91:goto            24
				{
					cameraeffectarguments = ((CameraEffectArguments) (new StringBuilder()));
	//   40   94:new             #87  <Class StringBuilder>
	//   41   97:dup             
	//   42   98:invokespecial   #88  <Method void StringBuilder()>
	//   43  101:astore_0        
					((StringBuilder) (cameraeffectarguments)).append("Unsupported type: ");
	//   44  102:aload_0         
	//   45  103:ldc1            #90  <String "Unsupported type: ">
	//   46  105:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   47  108:pop             
					((StringBuilder) (cameraeffectarguments)).append(((Object) (obj.getClass())));
	//   48  109:aload_0         
	//   49  110:aload_1         
	//   50  111:invokevirtual   #78  <Method Class Object.getClass()>
	//   51  114:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   52  117:pop             
					throw new IllegalArgumentException(((StringBuilder) (cameraeffectarguments)).toString());
	//   53  118:new             #99  <Class IllegalArgumentException>
	//   54  121:dup             
	//   55  122:aload_0         
	//   56  123:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   57  126:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   58  129:athrow          
				}
			}
		} while(true);
		return jsonobject;
	//   59  130:aload_2         
	//   60  131:areturn         
	}

	private static final Map SETTERS;

	static 
	{
		SETTERS = ((Map) (new HashMap()));
	//    0    0:new             #20  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void HashMap()>
	//    3    7:putstatic       #25  <Field Map SETTERS>
		SETTERS.put(java/lang/String, ((Object) (new Setter() {

			public void setOnArgumentsBuilder(com.facebook.share.model.CameraEffectArguments.Builder builder, String s, Object obj)
				throws JSONException
			{
				builder.putArgument(s, (String)obj);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:checkcast       #19  <Class String>
			//    4    6:invokevirtual   #25  <Method com.facebook.share.model.CameraEffectArguments$Builder com.facebook.share.model.CameraEffectArguments$Builder.putArgument(String, String)>
			//    5    9:pop             
			//    6   10:return          
			}

			public void setOnJSON(JSONObject jsonobject, String s, Object obj)
				throws JSONException
			{
				jsonobject.put(s, obj);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:invokevirtual   #34  <Method JSONObject JSONObject.put(String, Object)>
			//    4    6:pop             
			//    5    7:return          
			}

		}
)));
	//    4   10:getstatic       #25  <Field Map SETTERS>
	//    5   13:ldc1            #27  <Class String>
	//    6   15:new             #6   <Class CameraEffectJSONUtility$1>
	//    7   18:dup             
	//    8   19:invokespecial   #28  <Method void CameraEffectJSONUtility$1()>
	//    9   22:invokeinterface #34  <Method Object Map.put(Object, Object)>
	//   10   27:pop             
		SETTERS.put([Ljava/lang/String;, ((Object) (new Setter() {

			public void setOnArgumentsBuilder(com.facebook.share.model.CameraEffectArguments.Builder builder, String s, Object obj)
				throws JSONException
			{
				throw new IllegalArgumentException("Unexpected type from JSON");
			//    0    0:new             #19  <Class IllegalArgumentException>
			//    1    3:dup             
			//    2    4:ldc1            #21  <String "Unexpected type from JSON">
			//    3    6:invokespecial   #24  <Method void IllegalArgumentException(String)>
			//    4    9:athrow          
			}

			public void setOnJSON(JSONObject jsonobject, String s, Object obj)
				throws JSONException
			{
				JSONArray jsonarray = new JSONArray();
			//    0    0:new             #29  <Class JSONArray>
			//    1    3:dup             
			//    2    4:invokespecial   #30  <Method void JSONArray()>
			//    3    7:astore          6
				obj = ((Object) ((String[])obj));
			//    4    9:aload_3         
			//    5   10:checkcast       #32  <Class String[]>
			//    6   13:astore_3        
				int j = obj.length;
			//    7   14:aload_3         
			//    8   15:arraylength     
			//    9   16:istore          5
				for(int i = 0; i < j; i++)
			//*  10   18:iconst_0        
			//*  11   19:istore          4
			//*  12   21:iload           4
			//*  13   23:iload           5
			//*  14   25:icmpge          47
					jsonarray.put(((Object) (obj[i])));
			//   15   28:aload           6
			//   16   30:aload_3         
			//   17   31:iload           4
			//   18   33:aaload          
			//   19   34:invokevirtual   #36  <Method JSONArray JSONArray.put(Object)>
			//   20   37:pop             

			//   21   38:iload           4
			//   22   40:iconst_1        
			//   23   41:iadd            
			//   24   42:istore          4
			//*  25   44:goto            21
				jsonobject.put(s, ((Object) (jsonarray)));
			//   26   47:aload_1         
			//   27   48:aload_2         
			//   28   49:aload           6
			//   29   51:invokevirtual   #41  <Method JSONObject JSONObject.put(String, Object)>
			//   30   54:pop             
			//   31   55:return          
			}

		}
)));
	//   11   28:getstatic       #25  <Field Map SETTERS>
	//   12   31:ldc1            #36  <Class String[]>
	//   13   33:new             #8   <Class CameraEffectJSONUtility$2>
	//   14   36:dup             
	//   15   37:invokespecial   #37  <Method void CameraEffectJSONUtility$2()>
	//   16   40:invokeinterface #34  <Method Object Map.put(Object, Object)>
	//   17   45:pop             
		SETTERS.put(org/json/JSONArray, ((Object) (new Setter() {

			public void setOnArgumentsBuilder(com.facebook.share.model.CameraEffectArguments.Builder builder, String s, Object obj)
				throws JSONException
			{
				JSONArray jsonarray = (JSONArray)obj;
			//    0    0:aload_3         
			//    1    1:checkcast       #19  <Class JSONArray>
			//    2    4:astore          5
				String as[] = new String[jsonarray.length()];
			//    3    6:aload           5
			//    4    8:invokevirtual   #23  <Method int JSONArray.length()>
			//    5   11:anewarray       String[]
			//    6   14:astore          6
				for(int i = 0; i < jsonarray.length();)
			//*   7   16:iconst_0        
			//*   8   17:istore          4
			//*   9   19:iload           4
			//*  10   21:aload           5
			//*  11   23:invokevirtual   #23  <Method int JSONArray.length()>
			//*  12   26:icmpge          98
				{
					obj = jsonarray.get(i);
			//   13   29:aload           5
			//   14   31:iload           4
			//   15   33:invokevirtual   #29  <Method Object JSONArray.get(int)>
			//   16   36:astore_3        
					if(obj instanceof String)
			//*  17   37:aload_3         
			//*  18   38:instanceof      #25  <Class String>
			//*  19   41:ifeq            62
					{
						as[i] = (String)obj;
			//   20   44:aload           6
			//   21   46:iload           4
			//   22   48:aload_3         
			//   23   49:checkcast       #25  <Class String>
			//   24   52:aastore         
						i++;
			//   25   53:iload           4
			//   26   55:iconst_1        
			//   27   56:iadd            
			//   28   57:istore          4
					} else
			//*  29   59:goto            19
					{
						builder = ((com.facebook.share.model.CameraEffectArguments.Builder) (new StringBuilder()));
			//   30   62:new             #31  <Class StringBuilder>
			//   31   65:dup             
			//   32   66:invokespecial   #32  <Method void StringBuilder()>
			//   33   69:astore_1        
						((StringBuilder) (builder)).append("Unexpected type in an array: ");
			//   34   70:aload_1         
			//   35   71:ldc1            #34  <String "Unexpected type in an array: ">
			//   36   73:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//   37   76:pop             
						((StringBuilder) (builder)).append(((Object) (obj.getClass())));
			//   38   77:aload_1         
			//   39   78:aload_3         
			//   40   79:invokevirtual   #42  <Method Class Object.getClass()>
			//   41   82:invokevirtual   #45  <Method StringBuilder StringBuilder.append(Object)>
			//   42   85:pop             
						throw new IllegalArgumentException(((StringBuilder) (builder)).toString());
			//   43   86:new             #47  <Class IllegalArgumentException>
			//   44   89:dup             
			//   45   90:aload_1         
			//   46   91:invokevirtual   #51  <Method String StringBuilder.toString()>
			//   47   94:invokespecial   #54  <Method void IllegalArgumentException(String)>
			//   48   97:athrow          
					}
				}

				builder.putArgument(s, as);
			//   49   98:aload_1         
			//   50   99:aload_2         
			//   51  100:aload           6
			//   52  102:invokevirtual   #60  <Method com.facebook.share.model.CameraEffectArguments$Builder com.facebook.share.model.CameraEffectArguments$Builder.putArgument(String, String[])>
			//   53  105:pop             
			//   54  106:return          
			}

			public void setOnJSON(JSONObject jsonobject, String s, Object obj)
				throws JSONException
			{
				throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
			//    0    0:new             #47  <Class IllegalArgumentException>
			//    1    3:dup             
			//    2    4:ldc1            #65  <String "JSONArray's are not supported in bundles.">
			//    3    6:invokespecial   #54  <Method void IllegalArgumentException(String)>
			//    4    9:athrow          
			}

		}
)));
	//   18   46:getstatic       #25  <Field Map SETTERS>
	//   19   49:ldc1            #39  <Class JSONArray>
	//   20   51:new             #10  <Class CameraEffectJSONUtility$3>
	//   21   54:dup             
	//   22   55:invokespecial   #40  <Method void CameraEffectJSONUtility$3()>
	//   23   58:invokeinterface #34  <Method Object Map.put(Object, Object)>
	//   24   63:pop             
	//*  25   64:return          
	}
}
