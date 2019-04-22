// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.response;

import com.apollographql.apollo.CustomTypeAdapter;
import com.apollographql.apollo.api.ScalarType;
import com.apollographql.apollo.api.internal.Utils;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ScalarTypeAdapters
{
	private static abstract class DefaultCustomTypeAdapter
		implements CustomTypeAdapter
	{

		public String encode(Object obj)
		{
			return obj.toString();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #24  <Method String Object.toString()>
		//    2    4:areturn         
		}

		private DefaultCustomTypeAdapter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}


	public ScalarTypeAdapters(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		customAdapters = (Map)Utils.checkNotNull(((Object) (map)), "customAdapters == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #40  <String "customAdapters == null">
	//    5    8:invokestatic    #46  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #48  <Class Map>
	//    7   14:putfield        #50  <Field Map customAdapters>
	//    8   17:return          
	}

	private static Map defaultAdapters()
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #55  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void LinkedHashMap()>
	//    3    7:astore_0        
		((Map) (linkedhashmap)).put(java/lang/String, ((Object) (new DefaultCustomTypeAdapter() {

			public volatile Object decode(String s)
			{
				return ((Object) (decode(s)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #22  <Method String decode(String)>
			//    3    5:areturn         
			}

			public String decode(String s)
			{
				return s;
			//    0    0:aload_1         
			//    1    1:areturn         
			}

		}
)));
	//    4    8:aload_0         
	//    5    9:ldc1            #58  <Class String>
	//    6   11:new             #6   <Class ScalarTypeAdapters$1>
	//    7   14:dup             
	//    8   15:invokespecial   #59  <Method void ScalarTypeAdapters$1()>
	//    9   18:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//   10   23:pop             
		((Map) (linkedhashmap)).put(java/lang/Boolean, ((Object) (new DefaultCustomTypeAdapter() {

			public Boolean decode(String s)
			{
				return Boolean.valueOf(Boolean.parseBoolean(s));
			//    0    0:aload_1         
			//    1    1:invokestatic    #25  <Method boolean Boolean.parseBoolean(String)>
			//    2    4:invokestatic    #29  <Method Boolean Boolean.valueOf(boolean)>
			//    3    7:areturn         
			}

			public volatile Object decode(String s)
			{
				return ((Object) (decode(s)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #34  <Method Boolean decode(String)>
			//    3    5:areturn         
			}

		}
)));
	//   11   24:aload_0         
	//   12   25:ldc1            #64  <Class Boolean>
	//   13   27:new             #8   <Class ScalarTypeAdapters$2>
	//   14   30:dup             
	//   15   31:invokespecial   #65  <Method void ScalarTypeAdapters$2()>
	//   16   34:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//   17   39:pop             
		((Map) (linkedhashmap)).put(java/lang/Integer, ((Object) (new DefaultCustomTypeAdapter() {

			public Integer decode(String s)
			{
				return Integer.valueOf(Integer.parseInt(s));
			//    0    0:aload_1         
			//    1    1:invokestatic    #25  <Method int Integer.parseInt(String)>
			//    2    4:invokestatic    #29  <Method Integer Integer.valueOf(int)>
			//    3    7:areturn         
			}

			public volatile Object decode(String s)
			{
				return ((Object) (decode(s)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #34  <Method Integer decode(String)>
			//    3    5:areturn         
			}

		}
)));
	//   18   40:aload_0         
	//   19   41:ldc1            #67  <Class Integer>
	//   20   43:new             #10  <Class ScalarTypeAdapters$3>
	//   21   46:dup             
	//   22   47:invokespecial   #68  <Method void ScalarTypeAdapters$3()>
	//   23   50:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//   24   55:pop             
		((Map) (linkedhashmap)).put(java/lang/Long, ((Object) (new DefaultCustomTypeAdapter() {

			public Long decode(String s)
			{
				return Long.valueOf(Long.parseLong(s));
			//    0    0:aload_1         
			//    1    1:invokestatic    #25  <Method long Long.parseLong(String)>
			//    2    4:invokestatic    #29  <Method Long Long.valueOf(long)>
			//    3    7:areturn         
			}

			public volatile Object decode(String s)
			{
				return ((Object) (decode(s)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #34  <Method Long decode(String)>
			//    3    5:areturn         
			}

		}
)));
	//   25   56:aload_0         
	//   26   57:ldc1            #70  <Class Long>
	//   27   59:new             #12  <Class ScalarTypeAdapters$4>
	//   28   62:dup             
	//   29   63:invokespecial   #71  <Method void ScalarTypeAdapters$4()>
	//   30   66:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//   31   71:pop             
		((Map) (linkedhashmap)).put(java/lang/Float, ((Object) (new DefaultCustomTypeAdapter() {

			public Float decode(String s)
			{
				return Float.valueOf(Float.parseFloat(s));
			//    0    0:aload_1         
			//    1    1:invokestatic    #25  <Method float Float.parseFloat(String)>
			//    2    4:invokestatic    #29  <Method Float Float.valueOf(float)>
			//    3    7:areturn         
			}

			public volatile Object decode(String s)
			{
				return ((Object) (decode(s)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #34  <Method Float decode(String)>
			//    3    5:areturn         
			}

		}
)));
	//   32   72:aload_0         
	//   33   73:ldc1            #73  <Class Float>
	//   34   75:new             #14  <Class ScalarTypeAdapters$5>
	//   35   78:dup             
	//   36   79:invokespecial   #74  <Method void ScalarTypeAdapters$5()>
	//   37   82:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//   38   87:pop             
		((Map) (linkedhashmap)).put(java/lang/Double, ((Object) (new DefaultCustomTypeAdapter() {

			public Double decode(String s)
			{
				return Double.valueOf(Double.parseDouble(s));
			//    0    0:aload_1         
			//    1    1:invokestatic    #25  <Method double Double.parseDouble(String)>
			//    2    4:invokestatic    #29  <Method Double Double.valueOf(double)>
			//    3    7:areturn         
			}

			public volatile Object decode(String s)
			{
				return ((Object) (decode(s)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #34  <Method Double decode(String)>
			//    3    5:areturn         
			}

		}
)));
	//   39   88:aload_0         
	//   40   89:ldc1            #76  <Class Double>
	//   41   91:new             #16  <Class ScalarTypeAdapters$6>
	//   42   94:dup             
	//   43   95:invokespecial   #77  <Method void ScalarTypeAdapters$6()>
	//   44   98:invokeinterface #62  <Method Object Map.put(Object, Object)>
	//   45  103:pop             
		return ((Map) (linkedhashmap));
	//   46  104:aload_0         
	//   47  105:areturn         
	}

	public CustomTypeAdapter adapterFor(ScalarType scalartype)
	{
		Utils.checkNotNull(((Object) (scalartype)), "scalarType == null");
	//    0    0:aload_1         
	//    1    1:ldc1            #82  <String "scalarType == null">
	//    2    3:invokestatic    #46  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:pop             
		CustomTypeAdapter customtypeadapter1 = (CustomTypeAdapter)customAdapters.get(((Object) (scalartype)));
	//    4    7:aload_0         
	//    5    8:getfield        #50  <Field Map customAdapters>
	//    6   11:aload_1         
	//    7   12:invokeinterface #86  <Method Object Map.get(Object)>
	//    8   17:checkcast       #88  <Class CustomTypeAdapter>
	//    9   20:astore_3        
		CustomTypeAdapter customtypeadapter = customtypeadapter1;
	//   10   21:aload_3         
	//   11   22:astore_2        
		if(customtypeadapter1 == null)
	//*  12   23:aload_3         
	//*  13   24:ifnonnull       45
			customtypeadapter = (CustomTypeAdapter)DEFAULT_ADAPTERS.get(((Object) (scalartype.javaType())));
	//   14   27:getstatic       #32  <Field Map DEFAULT_ADAPTERS>
	//   15   30:aload_1         
	//   16   31:invokeinterface #94  <Method Class ScalarType.javaType()>
	//   17   36:invokeinterface #86  <Method Object Map.get(Object)>
	//   18   41:checkcast       #88  <Class CustomTypeAdapter>
	//   19   44:astore_2        
		if(customtypeadapter != null)
	//*  20   45:aload_2         
	//*  21   46:ifnull          51
			return customtypeadapter;
	//   22   49:aload_2         
	//   23   50:areturn         
		else
			throw new IllegalArgumentException(String.format("Can't map GraphQL type: %s to: %s. Did you forget to add custom type adapter?", new Object[] {
				scalartype.typeName(), scalartype.javaType()
			}));
	//   24   51:new             #96  <Class IllegalArgumentException>
	//   25   54:dup             
	//   26   55:ldc1            #98  <String "Can't map GraphQL type: %s to: %s. Did you forget to add custom type adapter?">
	//   27   57:iconst_2        
	//   28   58:anewarray       Object[]
	//   29   61:dup             
	//   30   62:iconst_0        
	//   31   63:aload_1         
	//   32   64:invokeinterface #102 <Method String ScalarType.typeName()>
	//   33   69:aastore         
	//   34   70:dup             
	//   35   71:iconst_1        
	//   36   72:aload_1         
	//   37   73:invokeinterface #94  <Method Class ScalarType.javaType()>
	//   38   78:aastore         
	//   39   79:invokestatic    #106 <Method String String.format(String, Object[])>
	//   40   82:invokespecial   #109 <Method void IllegalArgumentException(String)>
	//   41   85:athrow          
	}

	private static final Map DEFAULT_ADAPTERS = defaultAdapters();
	private final Map customAdapters;

	static 
	{
	//    0    0:invokestatic    #30  <Method Map defaultAdapters()>
	//    1    3:putstatic       #32  <Field Map DEFAULT_ADAPTERS>
	//*   2    6:return          
	}
}
