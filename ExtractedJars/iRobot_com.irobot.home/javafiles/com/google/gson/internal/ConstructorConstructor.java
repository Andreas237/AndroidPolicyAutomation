// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.*;
import java.util.*;

// Referenced classes of package com.google.gson.internal:
//			ObjectConstructor, LinkedTreeMap, UnsafeAllocator

public final class ConstructorConstructor
{

	public ConstructorConstructor(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		instanceCreators = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field Map instanceCreators>
	//    5    9:return          
	}

	private ObjectConstructor newDefaultConstructor(final Class constructor)
	{
		try
		{
			constructor = ((Class) (constructor.getDeclaredConstructor(new Class[0])));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:anewarray       Class[]
	//    3    5:invokevirtual   #51  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    4    8:astore_1        
			if(!((Constructor) (constructor)).isAccessible())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #57  <Method boolean Constructor.isAccessible()>
	//*   7   13:ifne            21
				((Constructor) (constructor)).setAccessible(true);
	//    8   16:aload_1         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #61  <Method void Constructor.setAccessible(boolean)>
			constructor = ((Class) (new ObjectConstructor() {

				public Object construct()
				{
					Object obj;
					try
					{
						obj = constructor.newInstance(((Object []) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field Constructor val$constructor>
				//    2    4:aconst_null     
				//    3    5:invokevirtual   #40  <Method Object Constructor.newInstance(Object[])>
				//    4    8:astore_1        
					}
				//*   5    9:aload_1         
				//*   6   10:areturn         
				//*   7   11:astore_1        
				//*   8   12:new             #42  <Class AssertionError>
				//*   9   15:dup             
				//*  10   16:aload_1         
				//*  11   17:invokespecial   #45  <Method void AssertionError(Object)>
				//*  12   20:athrow          
				//*  13   21:astore_1        
				//*  14   22:new             #47  <Class StringBuilder>
				//*  15   25:dup             
				//*  16   26:invokespecial   #48  <Method void StringBuilder()>
				//*  17   29:astore_2        
				//*  18   30:aload_2         
				//*  19   31:ldc1            #50  <String "Failed to invoke ">
				//*  20   33:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//*  21   36:pop             
				//*  22   37:aload_2         
				//*  23   38:aload_0         
				//*  24   39:getfield        #22  <Field Constructor val$constructor>
				//*  25   42:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
				//*  26   45:pop             
				//*  27   46:aload_2         
				//*  28   47:ldc1            #59  <String " with no args">
				//*  29   49:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//*  30   52:pop             
				//*  31   53:new             #61  <Class RuntimeException>
				//*  32   56:dup             
				//*  33   57:aload_2         
				//*  34   58:invokevirtual   #65  <Method String StringBuilder.toString()>
				//*  35   61:aload_1         
				//*  36   62:invokevirtual   #69  <Method Throwable InvocationTargetException.getTargetException()>
				//*  37   65:invokespecial   #72  <Method void RuntimeException(String, Throwable)>
				//*  38   68:athrow          
					catch(InstantiationException instantiationexception)
				//*  39   69:astore_1        
					{
						StringBuilder stringbuilder1 = new StringBuilder();
				//   40   70:new             #47  <Class StringBuilder>
				//   41   73:dup             
				//   42   74:invokespecial   #48  <Method void StringBuilder()>
				//   43   77:astore_2        
						stringbuilder1.append("Failed to invoke ");
				//   44   78:aload_2         
				//   45   79:ldc1            #50  <String "Failed to invoke ">
				//   46   81:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//   47   84:pop             
						stringbuilder1.append(((Object) (constructor)));
				//   48   85:aload_2         
				//   49   86:aload_0         
				//   50   87:getfield        #22  <Field Constructor val$constructor>
				//   51   90:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
				//   52   93:pop             
						stringbuilder1.append(" with no args");
				//   53   94:aload_2         
				//   54   95:ldc1            #59  <String " with no args">
				//   55   97:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
				//   56  100:pop             
						throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (instantiationexception)));
				//   57  101:new             #61  <Class RuntimeException>
				//   58  104:dup             
				//   59  105:aload_2         
				//   60  106:invokevirtual   #65  <Method String StringBuilder.toString()>
				//   61  109:aload_1         
				//   62  110:invokespecial   #72  <Method void RuntimeException(String, Throwable)>
				//   63  113:athrow          
					}
					catch(InvocationTargetException invocationtargetexception)
					{
						StringBuilder stringbuilder = new StringBuilder();
						stringbuilder.append("Failed to invoke ");
						stringbuilder.append(((Object) (constructor)));
						stringbuilder.append(" with no args");
						throw new RuntimeException(stringbuilder.toString(), invocationtargetexception.getTargetException());
					}
					catch(IllegalAccessException illegalaccessexception)
					{
						throw new AssertionError(((Object) (illegalaccessexception)));
					}
					return obj;
				}

				final ConstructorConstructor this$0;
				final Constructor val$constructor;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ConstructorConstructor this$0>
				constructor = constructor1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Constructor val$constructor>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   11   21:new             #16  <Class ConstructorConstructor$3>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #64  <Method void ConstructorConstructor$3(ConstructorConstructor, Constructor)>
	//   16   30:astore_1        
		}
	//*  17   31:aload_1         
	//*  18   32:areturn         
	//*  19   33:aconst_null     
	//*  20   34:areturn         
		// Misplaced declaration of an exception variable
		catch(final Class constructor)
		{
			return null;
		}
		return ((ObjectConstructor) (constructor));
	//*  21   35:astore_1        
	//*  22   36:goto            33
	}

	private ObjectConstructor newDefaultImplementationConstructor(final Type type, Class class1)
	{
		if(((Class) (java/util/Collection)).isAssignableFrom(class1))
	//*   0    0:ldc1            #69  <Class Collection>
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #73  <Method boolean Class.isAssignableFrom(Class)>
	//*   3    6:ifeq            91
		{
			if(((Class) (java/util/SortedSet)).isAssignableFrom(class1))
	//*   4    9:ldc1            #75  <Class SortedSet>
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #73  <Method boolean Class.isAssignableFrom(Class)>
	//*   7   15:ifeq            27
				return new ObjectConstructor() {

					public Object construct()
					{
						return ((Object) (new TreeSet()));
					//    0    0:new             #26  <Class TreeSet>
					//    1    3:dup             
					//    2    4:invokespecial   #27  <Method void TreeSet()>
					//    3    7:areturn         
					}

					final ConstructorConstructor this$0;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ConstructorConstructor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//    8   18:new             #18  <Class ConstructorConstructor$4>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #78  <Method void ConstructorConstructor$4(ConstructorConstructor)>
	//   12   26:areturn         
			if(((Class) (java/util/EnumSet)).isAssignableFrom(class1))
	//*  13   27:ldc1            #80  <Class EnumSet>
	//*  14   29:aload_2         
	//*  15   30:invokevirtual   #73  <Method boolean Class.isAssignableFrom(Class)>
	//*  16   33:ifeq            46
				return new ObjectConstructor() {

					public Object construct()
					{
						if(type instanceof ParameterizedType)
					//*   0    0:aload_0         
					//*   1    1:getfield        #22  <Field Type val$type>
					//*   2    4:instanceof      #30  <Class ParameterizedType>
					//*   3    7:ifeq            79
						{
							Type type1 = ((ParameterizedType)type).getActualTypeArguments()[0];
					//    4   10:aload_0         
					//    5   11:getfield        #22  <Field Type val$type>
					//    6   14:checkcast       #30  <Class ParameterizedType>
					//    7   17:invokeinterface #34  <Method Type[] ParameterizedType.getActualTypeArguments()>
					//    8   22:iconst_0        
					//    9   23:aaload          
					//   10   24:astore_1        
							if(type1 instanceof Class)
					//*  11   25:aload_1         
					//*  12   26:instanceof      #36  <Class Class>
					//*  13   29:ifeq            40
							{
								return ((Object) (EnumSet.noneOf((Class)type1)));
					//   14   32:aload_1         
					//   15   33:checkcast       #36  <Class Class>
					//   16   36:invokestatic    #42  <Method EnumSet EnumSet.noneOf(Class)>
					//   17   39:areturn         
							} else
							{
								StringBuilder stringbuilder = new StringBuilder();
					//   18   40:new             #44  <Class StringBuilder>
					//   19   43:dup             
					//   20   44:invokespecial   #45  <Method void StringBuilder()>
					//   21   47:astore_1        
								stringbuilder.append("Invalid EnumSet type: ");
					//   22   48:aload_1         
					//   23   49:ldc1            #47  <String "Invalid EnumSet type: ">
					//   24   51:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
					//   25   54:pop             
								stringbuilder.append(((Object) (type)).toString());
					//   26   55:aload_1         
					//   27   56:aload_0         
					//   28   57:getfield        #22  <Field Type val$type>
					//   29   60:invokevirtual   #55  <Method String Object.toString()>
					//   30   63:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
					//   31   66:pop             
								throw new JsonIOException(stringbuilder.toString());
					//   32   67:new             #57  <Class JsonIOException>
					//   33   70:dup             
					//   34   71:aload_1         
					//   35   72:invokevirtual   #58  <Method String StringBuilder.toString()>
					//   36   75:invokespecial   #61  <Method void JsonIOException(String)>
					//   37   78:athrow          
							}
						} else
						{
							StringBuilder stringbuilder1 = new StringBuilder();
					//   38   79:new             #44  <Class StringBuilder>
					//   39   82:dup             
					//   40   83:invokespecial   #45  <Method void StringBuilder()>
					//   41   86:astore_1        
							stringbuilder1.append("Invalid EnumSet type: ");
					//   42   87:aload_1         
					//   43   88:ldc1            #47  <String "Invalid EnumSet type: ">
					//   44   90:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
					//   45   93:pop             
							stringbuilder1.append(((Object) (type)).toString());
					//   46   94:aload_1         
					//   47   95:aload_0         
					//   48   96:getfield        #22  <Field Type val$type>
					//   49   99:invokevirtual   #55  <Method String Object.toString()>
					//   50  102:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
					//   51  105:pop             
							throw new JsonIOException(stringbuilder1.toString());
					//   52  106:new             #57  <Class JsonIOException>
					//   53  109:dup             
					//   54  110:aload_1         
					//   55  111:invokevirtual   #58  <Method String StringBuilder.toString()>
					//   56  114:invokespecial   #61  <Method void JsonIOException(String)>
					//   57  117:athrow          
						}
					}

					final ConstructorConstructor this$0;
					final Type val$type;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ConstructorConstructor this$0>
				type = type1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Type val$type>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
				}
;
	//   17   36:new             #20  <Class ConstructorConstructor$5>
	//   18   39:dup             
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:invokespecial   #83  <Method void ConstructorConstructor$5(ConstructorConstructor, Type)>
	//   22   45:areturn         
			if(((Class) (java/util/Set)).isAssignableFrom(class1))
	//*  23   46:ldc1            #85  <Class Set>
	//*  24   48:aload_2         
	//*  25   49:invokevirtual   #73  <Method boolean Class.isAssignableFrom(Class)>
	//*  26   52:ifeq            64
				return new ObjectConstructor() {

					public Object construct()
					{
						return ((Object) (new LinkedHashSet()));
					//    0    0:new             #26  <Class LinkedHashSet>
					//    1    3:dup             
					//    2    4:invokespecial   #27  <Method void LinkedHashSet()>
					//    3    7:areturn         
					}

					final ConstructorConstructor this$0;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ConstructorConstructor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   27   55:new             #22  <Class ConstructorConstructor$6>
	//   28   58:dup             
	//   29   59:aload_0         
	//   30   60:invokespecial   #86  <Method void ConstructorConstructor$6(ConstructorConstructor)>
	//   31   63:areturn         
			if(((Class) (java/util/Queue)).isAssignableFrom(class1))
	//*  32   64:ldc1            #88  <Class Queue>
	//*  33   66:aload_2         
	//*  34   67:invokevirtual   #73  <Method boolean Class.isAssignableFrom(Class)>
	//*  35   70:ifeq            82
				return new ObjectConstructor() {

					public Object construct()
					{
						return ((Object) (new LinkedList()));
					//    0    0:new             #26  <Class LinkedList>
					//    1    3:dup             
					//    2    4:invokespecial   #27  <Method void LinkedList()>
					//    3    7:areturn         
					}

					final ConstructorConstructor this$0;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ConstructorConstructor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   36   73:new             #24  <Class ConstructorConstructor$7>
	//   37   76:dup             
	//   38   77:aload_0         
	//   39   78:invokespecial   #89  <Method void ConstructorConstructor$7(ConstructorConstructor)>
	//   40   81:areturn         
			else
				return new ObjectConstructor() {

					public Object construct()
					{
						return ((Object) (new ArrayList()));
					//    0    0:new             #26  <Class ArrayList>
					//    1    3:dup             
					//    2    4:invokespecial   #27  <Method void ArrayList()>
					//    3    7:areturn         
					}

					final ConstructorConstructor this$0;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ConstructorConstructor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   41   82:new             #26  <Class ConstructorConstructor$8>
	//   42   85:dup             
	//   43   86:aload_0         
	//   44   87:invokespecial   #90  <Method void ConstructorConstructor$8(ConstructorConstructor)>
	//   45   90:areturn         
		}
		if(((Class) (java/util/Map)).isAssignableFrom(class1))
	//*  46   91:ldc1            #92  <Class Map>
	//*  47   93:aload_2         
	//*  48   94:invokevirtual   #73  <Method boolean Class.isAssignableFrom(Class)>
	//*  49   97:ifeq            168
		{
			if(((Class) (java/util/SortedMap)).isAssignableFrom(class1))
	//*  50  100:ldc1            #94  <Class SortedMap>
	//*  51  102:aload_2         
	//*  52  103:invokevirtual   #73  <Method boolean Class.isAssignableFrom(Class)>
	//*  53  106:ifeq            118
				return new ObjectConstructor() {

					public Object construct()
					{
						return ((Object) (new TreeMap()));
					//    0    0:new             #26  <Class TreeMap>
					//    1    3:dup             
					//    2    4:invokespecial   #27  <Method void TreeMap()>
					//    3    7:areturn         
					}

					final ConstructorConstructor this$0;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ConstructorConstructor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   54  109:new             #28  <Class ConstructorConstructor$9>
	//   55  112:dup             
	//   56  113:aload_0         
	//   57  114:invokespecial   #95  <Method void ConstructorConstructor$9(ConstructorConstructor)>
	//   58  117:areturn         
			if((type instanceof ParameterizedType) && !((Class) (java/lang/String)).isAssignableFrom(TypeToken.get(((ParameterizedType)type).getActualTypeArguments()[0]).getRawType()))
	//*  59  118:aload_1         
	//*  60  119:instanceof      #97  <Class ParameterizedType>
	//*  61  122:ifeq            159
	//*  62  125:ldc1            #99  <Class String>
	//*  63  127:aload_1         
	//*  64  128:checkcast       #97  <Class ParameterizedType>
	//*  65  131:invokeinterface #103 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//*  66  136:iconst_0        
	//*  67  137:aaload          
	//*  68  138:invokestatic    #109 <Method TypeToken TypeToken.get(Type)>
	//*  69  141:invokevirtual   #113 <Method Class TypeToken.getRawType()>
	//*  70  144:invokevirtual   #73  <Method boolean Class.isAssignableFrom(Class)>
	//*  71  147:ifne            159
				return new ObjectConstructor() {

					public Object construct()
					{
						return ((Object) (new LinkedHashMap()));
					//    0    0:new             #26  <Class LinkedHashMap>
					//    1    3:dup             
					//    2    4:invokespecial   #27  <Method void LinkedHashMap()>
					//    3    7:areturn         
					}

					final ConstructorConstructor this$0;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ConstructorConstructor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   72  150:new             #8   <Class ConstructorConstructor$10>
	//   73  153:dup             
	//   74  154:aload_0         
	//   75  155:invokespecial   #114 <Method void ConstructorConstructor$10(ConstructorConstructor)>
	//   76  158:areturn         
			else
				return new ObjectConstructor() {

					public Object construct()
					{
						return ((Object) (new LinkedTreeMap()));
					//    0    0:new             #26  <Class LinkedTreeMap>
					//    1    3:dup             
					//    2    4:invokespecial   #27  <Method void LinkedTreeMap()>
					//    3    7:areturn         
					}

					final ConstructorConstructor this$0;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ConstructorConstructor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   77  159:new             #10  <Class ConstructorConstructor$11>
	//   78  162:dup             
	//   79  163:aload_0         
	//   80  164:invokespecial   #115 <Method void ConstructorConstructor$11(ConstructorConstructor)>
	//   81  167:areturn         
		} else
		{
			return null;
	//   82  168:aconst_null     
	//   83  169:areturn         
		}
	}

	private ObjectConstructor newUnsafeAllocator(final Type type, final Class rawType)
	{
		return new ObjectConstructor() {

			public Object construct()
			{
				Object obj;
				try
				{
					obj = unsafeAllocator.newInstance(rawType);
			//    0    0:aload_0         
			//    1    1:getfield        #39  <Field UnsafeAllocator unsafeAllocator>
			//    2    4:aload_0         
			//    3    5:getfield        #26  <Field Class val$rawType>
			//    4    8:invokevirtual   #48  <Method Object UnsafeAllocator.newInstance(Class)>
			//    5   11:astore_1        
				}
			//*   6   12:aload_1         
			//*   7   13:areturn         
				catch(Exception exception)
			//*   8   14:astore_1        
				{
					StringBuilder stringbuilder = new StringBuilder();
			//    9   15:new             #50  <Class StringBuilder>
			//   10   18:dup             
			//   11   19:invokespecial   #51  <Method void StringBuilder()>
			//   12   22:astore_2        
					stringbuilder.append("Unable to invoke no-args constructor for ");
			//   13   23:aload_2         
			//   14   24:ldc1            #53  <String "Unable to invoke no-args constructor for ">
			//   15   26:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   16   29:pop             
					stringbuilder.append(((Object) (type)));
			//   17   30:aload_2         
			//   18   31:aload_0         
			//   19   32:getfield        #28  <Field Type val$type>
			//   20   35:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
			//   21   38:pop             
					stringbuilder.append(". ");
			//   22   39:aload_2         
			//   23   40:ldc1            #62  <String ". ">
			//   24   42:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   25   45:pop             
					stringbuilder.append("Register an InstanceCreator with Gson for this type may fix this problem.");
			//   26   46:aload_2         
			//   27   47:ldc1            #64  <String "Register an InstanceCreator with Gson for this type may fix this problem.">
			//   28   49:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   29   52:pop             
					throw new RuntimeException(stringbuilder.toString(), ((Throwable) (exception)));
			//   30   53:new             #66  <Class RuntimeException>
			//   31   56:dup             
			//   32   57:aload_2         
			//   33   58:invokevirtual   #70  <Method String StringBuilder.toString()>
			//   34   61:aload_1         
			//   35   62:invokespecial   #73  <Method void RuntimeException(String, Throwable)>
			//   36   65:athrow          
				}
				return obj;
			}

			final ConstructorConstructor this$0;
			private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();
			final Class val$rawType;
			final Type val$type;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field ConstructorConstructor this$0>
				rawType = class1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field Class val$rawType>
				type = type1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field Type val$type>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:aload_0         
			//   12   20:invokestatic    #37  <Method UnsafeAllocator UnsafeAllocator.create()>
			//   13   23:putfield        #39  <Field UnsafeAllocator unsafeAllocator>
			//   14   26:return          
			}
		}
;
	//    0    0:new             #12  <Class ConstructorConstructor$12>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #120 <Method void ConstructorConstructor$12(ConstructorConstructor, Class, Type)>
	//    6   10:areturn         
	}

	public ObjectConstructor get(TypeToken typetoken)
	{
		final Type type = typetoken.getType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #125 <Method Type TypeToken.getType()>
	//    2    4:astore_2        
		typetoken = ((TypeToken) (typetoken.getRawType()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #113 <Method Class TypeToken.getRawType()>
	//    5    9:astore_1        
		final InstanceCreator typeCreator = (InstanceCreator)instanceCreators.get(((Object) (type)));
	//    6   10:aload_0         
	//    7   11:getfield        #38  <Field Map instanceCreators>
	//    8   14:aload_2         
	//    9   15:invokeinterface #128 <Method Object Map.get(Object)>
	//   10   20:checkcast       #130 <Class InstanceCreator>
	//   11   23:astore_3        
		if(typeCreator != null)
	//*  12   24:aload_3         
	//*  13   25:ifnull          39
			return new ObjectConstructor() {

				public Object construct()
				{
					return typeCreator.createInstance(type);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field InstanceCreator val$typeCreator>
				//    2    4:aload_0         
				//    3    5:getfield        #26  <Field Type val$type>
				//    4    8:invokeinterface #38  <Method Object InstanceCreator.createInstance(Type)>
				//    5   13:areturn         
				}

				final ConstructorConstructor this$0;
				final Type val$type;
				final InstanceCreator val$typeCreator;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ConstructorConstructor this$0>
				typeCreator = instancecreator;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field InstanceCreator val$typeCreator>
				type = type1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field Type val$type>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
			}
;
	//   14   28:new             #6   <Class ConstructorConstructor$1>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_3         
	//   18   34:aload_2         
	//   19   35:invokespecial   #133 <Method void ConstructorConstructor$1(ConstructorConstructor, InstanceCreator, Type)>
	//   20   38:areturn         
		final InstanceCreator rawTypeCreator = (InstanceCreator)instanceCreators.get(((Object) (typetoken)));
	//   21   39:aload_0         
	//   22   40:getfield        #38  <Field Map instanceCreators>
	//   23   43:aload_1         
	//   24   44:invokeinterface #128 <Method Object Map.get(Object)>
	//   25   49:checkcast       #130 <Class InstanceCreator>
	//   26   52:astore_3        
		if(rawTypeCreator != null)
	//*  27   53:aload_3         
	//*  28   54:ifnull          68
			return new ObjectConstructor() {

				public Object construct()
				{
					return rawTypeCreator.createInstance(type);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field InstanceCreator val$rawTypeCreator>
				//    2    4:aload_0         
				//    3    5:getfield        #26  <Field Type val$type>
				//    4    8:invokeinterface #38  <Method Object InstanceCreator.createInstance(Type)>
				//    5   13:areturn         
				}

				final ConstructorConstructor this$0;
				final InstanceCreator val$rawTypeCreator;
				final Type val$type;

			
			{
				this$0 = ConstructorConstructor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ConstructorConstructor this$0>
				rawTypeCreator = instancecreator;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field InstanceCreator val$rawTypeCreator>
				type = type1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field Type val$type>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
			}
;
	//   29   57:new             #14  <Class ConstructorConstructor$2>
	//   30   60:dup             
	//   31   61:aload_0         
	//   32   62:aload_3         
	//   33   63:aload_2         
	//   34   64:invokespecial   #134 <Method void ConstructorConstructor$2(ConstructorConstructor, InstanceCreator, Type)>
	//   35   67:areturn         
		rawTypeCreator = ((InstanceCreator) (newDefaultConstructor(((Class) (typetoken)))));
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:invokespecial   #136 <Method ObjectConstructor newDefaultConstructor(Class)>
	//   39   73:astore_3        
		if(rawTypeCreator != null)
	//*  40   74:aload_3         
	//*  41   75:ifnull          80
			return ((ObjectConstructor) (rawTypeCreator));
	//   42   78:aload_3         
	//   43   79:areturn         
		rawTypeCreator = ((InstanceCreator) (newDefaultImplementationConstructor(type, ((Class) (typetoken)))));
	//   44   80:aload_0         
	//   45   81:aload_2         
	//   46   82:aload_1         
	//   47   83:invokespecial   #138 <Method ObjectConstructor newDefaultImplementationConstructor(Type, Class)>
	//   48   86:astore_3        
		if(rawTypeCreator != null)
	//*  49   87:aload_3         
	//*  50   88:ifnull          93
			return ((ObjectConstructor) (rawTypeCreator));
	//   51   91:aload_3         
	//   52   92:areturn         
		else
			return newUnsafeAllocator(type, ((Class) (typetoken)));
	//   53   93:aload_0         
	//   54   94:aload_2         
	//   55   95:aload_1         
	//   56   96:invokespecial   #140 <Method ObjectConstructor newUnsafeAllocator(Type, Class)>
	//   57   99:areturn         
	}

	public String toString()
	{
		return ((Object) (instanceCreators)).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Map instanceCreators>
	//    2    4:invokevirtual   #145 <Method String Object.toString()>
	//    3    7:areturn         
	}

	private final Map instanceCreators;
}
