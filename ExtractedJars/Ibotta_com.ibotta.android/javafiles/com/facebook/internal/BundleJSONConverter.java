// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.os.Bundle;
import java.util.*;
import org.json.*;

public class BundleJSONConverter
{
	public static interface Setter
	{

		public abstract void setOnBundle(Bundle bundle, String s, Object obj)
			throws JSONException;

		public abstract void setOnJSON(JSONObject jsonobject, String s, Object obj)
			throws JSONException;
	}


	public static Bundle convertToBundle(JSONObject jsonobject)
		throws JSONException
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #67  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void Bundle()>
	//    3    7:astore_2        
		Iterator iterator = jsonobject.keys();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #74  <Method Iterator JSONObject.keys()>
	//    6   12:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   13:aload_3         
	//    8   14:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            149
			String s = (String)iterator.next();
	//   10   22:aload_3         
	//   11   23:invokeinterface #84  <Method Object Iterator.next()>
	//   12   28:checkcast       #53  <Class String>
	//   13   31:astore          4
			Object obj = jsonobject.get(s);
	//   14   33:aload_0         
	//   15   34:aload           4
	//   16   36:invokevirtual   #88  <Method Object JSONObject.get(String)>
	//   17   39:astore_1        
			if(obj != null && obj != JSONObject.NULL)
	//*  18   40:aload_1         
	//*  19   41:ifnull          13
	//*  20   44:aload_1         
	//*  21   45:getstatic       #92  <Field Object JSONObject.NULL>
	//*  22   48:if_acmpne       54
	//*  23   51:goto            13
				if(obj instanceof JSONObject)
	//*  24   54:aload_1         
	//*  25   55:instanceof      #70  <Class JSONObject>
	//*  26   58:ifeq            77
				{
					bundle.putBundle(s, convertToBundle((JSONObject)obj));
	//   27   61:aload_2         
	//   28   62:aload           4
	//   29   64:aload_1         
	//   30   65:checkcast       #70  <Class JSONObject>
	//   31   68:invokestatic    #94  <Method Bundle convertToBundle(JSONObject)>
	//   32   71:invokevirtual   #98  <Method void Bundle.putBundle(String, Bundle)>
				} else
	//*  33   74:goto            13
				{
					Setter setter = (Setter)SETTERS.get(((Object) (obj.getClass())));
	//   34   77:getstatic       #33  <Field Map SETTERS>
	//   35   80:aload_1         
	//   36   81:invokevirtual   #102 <Method Class Object.getClass()>
	//   37   84:invokeinterface #105 <Method Object Map.get(Object)>
	//   38   89:checkcast       #20  <Class BundleJSONConverter$Setter>
	//   39   92:astore          5
					if(setter != null)
	//*  40   94:aload           5
	//*  41   96:ifnull          113
					{
						setter.setOnBundle(bundle, s, obj);
	//   42   99:aload           5
	//   43  101:aload_2         
	//   44  102:aload           4
	//   45  104:aload_1         
	//   46  105:invokeinterface #109 <Method void BundleJSONConverter$Setter.setOnBundle(Bundle, String, Object)>
					} else
	//*  47  110:goto            13
					{
						jsonobject = ((JSONObject) (new StringBuilder()));
	//   48  113:new             #111 <Class StringBuilder>
	//   49  116:dup             
	//   50  117:invokespecial   #112 <Method void StringBuilder()>
	//   51  120:astore_0        
						((StringBuilder) (jsonobject)).append("Unsupported type: ");
	//   52  121:aload_0         
	//   53  122:ldc1            #114 <String "Unsupported type: ">
	//   54  124:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   55  127:pop             
						((StringBuilder) (jsonobject)).append(((Object) (obj.getClass())));
	//   56  128:aload_0         
	//   57  129:aload_1         
	//   58  130:invokevirtual   #102 <Method Class Object.getClass()>
	//   59  133:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   60  136:pop             
						throw new IllegalArgumentException(((StringBuilder) (jsonobject)).toString());
	//   61  137:new             #123 <Class IllegalArgumentException>
	//   62  140:dup             
	//   63  141:aload_0         
	//   64  142:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   65  145:invokespecial   #130 <Method void IllegalArgumentException(String)>
	//   66  148:athrow          
					}
				}
		} while(true);
		return bundle;
	//   67  149:aload_2         
	//   68  150:areturn         
	}

	public static JSONObject convertToJSON(Bundle bundle)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #70  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void JSONObject()>
	//    3    7:astore_1        
		Iterator iterator = bundle.keySet().iterator();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #138 <Method Set Bundle.keySet()>
	//    6   12:invokeinterface #143 <Method Iterator Set.iterator()>
	//    7   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            220
			String s = (String)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #84  <Method Object Iterator.next()>
	//   13   33:checkcast       #53  <Class String>
	//   14   36:astore_3        
			Object obj = bundle.get(s);
	//   15   37:aload_0         
	//   16   38:aload_3         
	//   17   39:invokevirtual   #144 <Method Object Bundle.get(String)>
	//   18   42:astore          4
			if(obj != null)
	//*  19   44:aload           4
	//*  20   46:ifnonnull       52
	//*  21   49:goto            18
				if(obj instanceof List)
	//*  22   52:aload           4
	//*  23   54:instanceof      #146 <Class List>
	//*  24   57:ifeq            121
				{
					JSONArray jsonarray = new JSONArray();
	//   25   60:new             #59  <Class JSONArray>
	//   26   63:dup             
	//   27   64:invokespecial   #147 <Method void JSONArray()>
	//   28   67:astore          5
					for(obj = ((Object) (((List)obj).iterator())); ((Iterator) (obj)).hasNext(); jsonarray.put(((Object) ((String)((Iterator) (obj)).next()))));
	//   29   69:aload           4
	//   30   71:checkcast       #146 <Class List>
	//   31   74:invokeinterface #148 <Method Iterator List.iterator()>
	//   32   79:astore          4
	//   33   81:aload           4
	//   34   83:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//   35   88:ifeq            110
	//   36   91:aload           5
	//   37   93:aload           4
	//   38   95:invokeinterface #84  <Method Object Iterator.next()>
	//   39  100:checkcast       #53  <Class String>
	//   40  103:invokevirtual   #151 <Method JSONArray JSONArray.put(Object)>
	//   41  106:pop             
	//*  42  107:goto            81
					jsonobject.put(s, ((Object) (jsonarray)));
	//   43  110:aload_1         
	//   44  111:aload_3         
	//   45  112:aload           5
	//   46  114:invokevirtual   #154 <Method JSONObject JSONObject.put(String, Object)>
	//   47  117:pop             
				} else
	//*  48  118:goto            18
				if(obj instanceof Bundle)
	//*  49  121:aload           4
	//*  50  123:instanceof      #67  <Class Bundle>
	//*  51  126:ifeq            146
				{
					jsonobject.put(s, ((Object) (convertToJSON((Bundle)obj))));
	//   52  129:aload_1         
	//   53  130:aload_3         
	//   54  131:aload           4
	//   55  133:checkcast       #67  <Class Bundle>
	//   56  136:invokestatic    #156 <Method JSONObject convertToJSON(Bundle)>
	//   57  139:invokevirtual   #154 <Method JSONObject JSONObject.put(String, Object)>
	//   58  142:pop             
				} else
	//*  59  143:goto            18
				{
					Setter setter = (Setter)SETTERS.get(((Object) (obj.getClass())));
	//   60  146:getstatic       #33  <Field Map SETTERS>
	//   61  149:aload           4
	//   62  151:invokevirtual   #102 <Method Class Object.getClass()>
	//   63  154:invokeinterface #105 <Method Object Map.get(Object)>
	//   64  159:checkcast       #20  <Class BundleJSONConverter$Setter>
	//   65  162:astore          5
					if(setter != null)
	//*  66  164:aload           5
	//*  67  166:ifnull          183
					{
						setter.setOnJSON(jsonobject, s, obj);
	//   68  169:aload           5
	//   69  171:aload_1         
	//   70  172:aload_3         
	//   71  173:aload           4
	//   72  175:invokeinterface #160 <Method void BundleJSONConverter$Setter.setOnJSON(JSONObject, String, Object)>
					} else
	//*  73  180:goto            18
					{
						bundle = ((Bundle) (new StringBuilder()));
	//   74  183:new             #111 <Class StringBuilder>
	//   75  186:dup             
	//   76  187:invokespecial   #112 <Method void StringBuilder()>
	//   77  190:astore_0        
						((StringBuilder) (bundle)).append("Unsupported type: ");
	//   78  191:aload_0         
	//   79  192:ldc1            #114 <String "Unsupported type: ">
	//   80  194:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   81  197:pop             
						((StringBuilder) (bundle)).append(((Object) (obj.getClass())));
	//   82  198:aload_0         
	//   83  199:aload           4
	//   84  201:invokevirtual   #102 <Method Class Object.getClass()>
	//   85  204:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   86  207:pop             
						throw new IllegalArgumentException(((StringBuilder) (bundle)).toString());
	//   87  208:new             #123 <Class IllegalArgumentException>
	//   88  211:dup             
	//   89  212:aload_0         
	//   90  213:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   91  216:invokespecial   #130 <Method void IllegalArgumentException(String)>
	//   92  219:athrow          
					}
				}
		} while(true);
		return jsonobject;
	//   93  220:aload_1         
	//   94  221:areturn         
	}

	private static final Map SETTERS;

	static 
	{
		SETTERS = ((Map) (new HashMap()));
	//    0    0:new             #28  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void HashMap()>
	//    3    7:putstatic       #33  <Field Map SETTERS>
		SETTERS.put(java/lang/Boolean, ((Object) (new Setter() {

			public void setOnBundle(Bundle bundle, String s, Object obj)
				throws JSONException
			{
				bundle.putBoolean(s, ((Boolean)obj).booleanValue());
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:checkcast       #19  <Class Boolean>
			//    4    6:invokevirtual   #23  <Method boolean Boolean.booleanValue()>
			//    5    9:invokevirtual   #29  <Method void Bundle.putBoolean(String, boolean)>
			//    6   12:return          
			}

			public void setOnJSON(JSONObject jsonobject, String s, Object obj)
				throws JSONException
			{
				jsonobject.put(s, obj);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:invokevirtual   #38  <Method JSONObject JSONObject.put(String, Object)>
			//    4    6:pop             
			//    5    7:return          
			}

		}
)));
	//    4   10:getstatic       #33  <Field Map SETTERS>
	//    5   13:ldc1            #35  <Class Boolean>
	//    6   15:new             #6   <Class BundleJSONConverter$1>
	//    7   18:dup             
	//    8   19:invokespecial   #36  <Method void BundleJSONConverter$1()>
	//    9   22:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   10   27:pop             
		SETTERS.put(java/lang/Integer, ((Object) (new Setter() {

			public void setOnBundle(Bundle bundle, String s, Object obj)
				throws JSONException
			{
				bundle.putInt(s, ((Integer)obj).intValue());
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:checkcast       #19  <Class Integer>
			//    4    6:invokevirtual   #23  <Method int Integer.intValue()>
			//    5    9:invokevirtual   #29  <Method void Bundle.putInt(String, int)>
			//    6   12:return          
			}

			public void setOnJSON(JSONObject jsonobject, String s, Object obj)
				throws JSONException
			{
				jsonobject.put(s, obj);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:invokevirtual   #38  <Method JSONObject JSONObject.put(String, Object)>
			//    4    6:pop             
			//    5    7:return          
			}

		}
)));
	//   11   28:getstatic       #33  <Field Map SETTERS>
	//   12   31:ldc1            #44  <Class Integer>
	//   13   33:new             #8   <Class BundleJSONConverter$2>
	//   14   36:dup             
	//   15   37:invokespecial   #45  <Method void BundleJSONConverter$2()>
	//   16   40:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   17   45:pop             
		SETTERS.put(java/lang/Long, ((Object) (new Setter() {

			public void setOnBundle(Bundle bundle, String s, Object obj)
				throws JSONException
			{
				bundle.putLong(s, ((Long)obj).longValue());
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:checkcast       #19  <Class Long>
			//    4    6:invokevirtual   #23  <Method long Long.longValue()>
			//    5    9:invokevirtual   #29  <Method void Bundle.putLong(String, long)>
			//    6   12:return          
			}

			public void setOnJSON(JSONObject jsonobject, String s, Object obj)
				throws JSONException
			{
				jsonobject.put(s, obj);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:invokevirtual   #38  <Method JSONObject JSONObject.put(String, Object)>
			//    4    6:pop             
			//    5    7:return          
			}

		}
)));
	//   18   46:getstatic       #33  <Field Map SETTERS>
	//   19   49:ldc1            #47  <Class Long>
	//   20   51:new             #10  <Class BundleJSONConverter$3>
	//   21   54:dup             
	//   22   55:invokespecial   #48  <Method void BundleJSONConverter$3()>
	//   23   58:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   24   63:pop             
		SETTERS.put(java/lang/Double, ((Object) (new Setter() {

			public void setOnBundle(Bundle bundle, String s, Object obj)
				throws JSONException
			{
				bundle.putDouble(s, ((Double)obj).doubleValue());
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:checkcast       #19  <Class Double>
			//    4    6:invokevirtual   #23  <Method double Double.doubleValue()>
			//    5    9:invokevirtual   #29  <Method void Bundle.putDouble(String, double)>
			//    6   12:return          
			}

			public void setOnJSON(JSONObject jsonobject, String s, Object obj)
				throws JSONException
			{
				jsonobject.put(s, obj);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:invokevirtual   #38  <Method JSONObject JSONObject.put(String, Object)>
			//    4    6:pop             
			//    5    7:return          
			}

		}
)));
	//   25   64:getstatic       #33  <Field Map SETTERS>
	//   26   67:ldc1            #50  <Class Double>
	//   27   69:new             #12  <Class BundleJSONConverter$4>
	//   28   72:dup             
	//   29   73:invokespecial   #51  <Method void BundleJSONConverter$4()>
	//   30   76:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   31   81:pop             
		SETTERS.put(java/lang/String, ((Object) (new Setter() {

			public void setOnBundle(Bundle bundle, String s, Object obj)
				throws JSONException
			{
				bundle.putString(s, (String)obj);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:aload_3         
			//    3    3:checkcast       #19  <Class String>
			//    4    6:invokevirtual   #25  <Method void Bundle.putString(String, String)>
			//    5    9:return          
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
	//   32   82:getstatic       #33  <Field Map SETTERS>
	//   33   85:ldc1            #53  <Class String>
	//   34   87:new             #14  <Class BundleJSONConverter$5>
	//   35   90:dup             
	//   36   91:invokespecial   #54  <Method void BundleJSONConverter$5()>
	//   37   94:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   38   99:pop             
		SETTERS.put([Ljava/lang/String;, ((Object) (new Setter() {

			public void setOnBundle(Bundle bundle, String s, Object obj)
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
	//   39  100:getstatic       #33  <Field Map SETTERS>
	//   40  103:ldc1            #56  <Class String[]>
	//   41  105:new             #16  <Class BundleJSONConverter$6>
	//   42  108:dup             
	//   43  109:invokespecial   #57  <Method void BundleJSONConverter$6()>
	//   44  112:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   45  117:pop             
		SETTERS.put(org/json/JSONArray, ((Object) (new Setter() {

			public void setOnBundle(Bundle bundle, String s, Object obj)
				throws JSONException
			{
				JSONArray jsonarray = (JSONArray)obj;
			//    0    0:aload_3         
			//    1    1:checkcast       #19  <Class JSONArray>
			//    2    4:astore          5
				ArrayList arraylist = new ArrayList();
			//    3    6:new             #21  <Class ArrayList>
			//    4    9:dup             
			//    5   10:invokespecial   #22  <Method void ArrayList()>
			//    6   13:astore          6
				if(jsonarray.length() == 0)
			//*   7   15:aload           5
			//*   8   17:invokevirtual   #26  <Method int JSONArray.length()>
			//*   9   20:ifne            31
				{
					bundle.putStringArrayList(s, arraylist);
			//   10   23:aload_1         
			//   11   24:aload_2         
			//   12   25:aload           6
			//   13   27:invokevirtual   #32  <Method void Bundle.putStringArrayList(String, ArrayList)>
					return;
			//   14   30:return          
				}
				for(int i = 0; i < jsonarray.length();)
			//*  15   31:iconst_0        
			//*  16   32:istore          4
			//*  17   34:iload           4
			//*  18   36:aload           5
			//*  19   38:invokevirtual   #26  <Method int JSONArray.length()>
			//*  20   41:icmpge          114
				{
					obj = jsonarray.get(i);
			//   21   44:aload           5
			//   22   46:iload           4
			//   23   48:invokevirtual   #36  <Method Object JSONArray.get(int)>
			//   24   51:astore_3        
					if(obj instanceof String)
			//*  25   52:aload_3         
			//*  26   53:instanceof      #38  <Class String>
			//*  27   56:ifeq            78
					{
						arraylist.add(((Object) ((String)obj)));
			//   28   59:aload           6
			//   29   61:aload_3         
			//   30   62:checkcast       #38  <Class String>
			//   31   65:invokevirtual   #42  <Method boolean ArrayList.add(Object)>
			//   32   68:pop             
						i++;
			//   33   69:iload           4
			//   34   71:iconst_1        
			//   35   72:iadd            
			//   36   73:istore          4
					} else
			//*  37   75:goto            34
					{
						bundle = ((Bundle) (new StringBuilder()));
			//   38   78:new             #44  <Class StringBuilder>
			//   39   81:dup             
			//   40   82:invokespecial   #45  <Method void StringBuilder()>
			//   41   85:astore_1        
						((StringBuilder) (bundle)).append("Unexpected type in an array: ");
			//   42   86:aload_1         
			//   43   87:ldc1            #47  <String "Unexpected type in an array: ">
			//   44   89:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
			//   45   92:pop             
						((StringBuilder) (bundle)).append(((Object) (obj.getClass())));
			//   46   93:aload_1         
			//   47   94:aload_3         
			//   48   95:invokevirtual   #55  <Method Class Object.getClass()>
			//   49   98:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
			//   50  101:pop             
						throw new IllegalArgumentException(((StringBuilder) (bundle)).toString());
			//   51  102:new             #60  <Class IllegalArgumentException>
			//   52  105:dup             
			//   53  106:aload_1         
			//   54  107:invokevirtual   #64  <Method String StringBuilder.toString()>
			//   55  110:invokespecial   #67  <Method void IllegalArgumentException(String)>
			//   56  113:athrow          
					}
				}

				bundle.putStringArrayList(s, arraylist);
			//   57  114:aload_1         
			//   58  115:aload_2         
			//   59  116:aload           6
			//   60  118:invokevirtual   #32  <Method void Bundle.putStringArrayList(String, ArrayList)>
			//   61  121:return          
			}

			public void setOnJSON(JSONObject jsonobject, String s, Object obj)
				throws JSONException
			{
				throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
			//    0    0:new             #60  <Class IllegalArgumentException>
			//    1    3:dup             
			//    2    4:ldc1            #72  <String "JSONArray's are not supported in bundles.">
			//    3    6:invokespecial   #67  <Method void IllegalArgumentException(String)>
			//    4    9:athrow          
			}

		}
)));
	//   46  118:getstatic       #33  <Field Map SETTERS>
	//   47  121:ldc1            #59  <Class JSONArray>
	//   48  123:new             #18  <Class BundleJSONConverter$7>
	//   49  126:dup             
	//   50  127:invokespecial   #60  <Method void BundleJSONConverter$7()>
	//   51  130:invokeinterface #42  <Method Object Map.put(Object, Object)>
	//   52  135:pop             
	//*  53  136:return          
	}
}
