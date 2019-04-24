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
					catch(InstantiationException instantiationexception)
				//*   7   11:astore_1        
					{
						throw new RuntimeException((new StringBuilder()).append("Failed to invoke ").append(((Object) (constructor))).append(" with no args").toString(), ((Throwable) (instantiationexception)));
				//    8   12:new             #42  <Class RuntimeException>
				//    9   15:dup             
				//   10   16:new             #44  <Class StringBuilder>
				//   11   19:dup             
				//   12   20:invokespecial   #45  <Method void StringBuilder()>
				//   13   23:ldc1            #47  <String "Failed to invoke ">
				//   14   25:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//   15   28:aload_0         
				//   16   29:getfield        #22  <Field Constructor val$constructor>
				//   17   32:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
				//   18   35:ldc1            #56  <String " with no args">
				//   19   37:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//   20   40:invokevirtual   #60  <Method String StringBuilder.toString()>
				//   21   43:aload_1         
				//   22   44:invokespecial   #63  <Method void RuntimeException(String, Throwable)>
				//   23   47:athrow          
					}
					catch(InvocationTargetException invocationtargetexception)
				//*  24   48:astore_1        
					{
						throw new RuntimeException((new StringBuilder()).append("Failed to invoke ").append(((Object) (constructor))).append(" with no args").toString(), invocationtargetexception.getTargetException());
				//   25   49:new             #42  <Class RuntimeException>
				//   26   52:dup             
				//   27   53:new             #44  <Class StringBuilder>
				//   28   56:dup             
				//   29   57:invokespecial   #45  <Method void StringBuilder()>
				//   30   60:ldc1            #47  <String "Failed to invoke ">
				//   31   62:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//   32   65:aload_0         
				//   33   66:getfield        #22  <Field Constructor val$constructor>
				//   34   69:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
				//   35   72:ldc1            #56  <String " with no args">
				//   36   74:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
				//   37   77:invokevirtual   #60  <Method String StringBuilder.toString()>
				//   38   80:aload_1         
				//   39   81:invokevirtual   #67  <Method Throwable InvocationTargetException.getTargetException()>
				//   40   84:invokespecial   #63  <Method void RuntimeException(String, Throwable)>
				//   41   87:athrow          
					}
					catch(IllegalAccessException illegalaccessexception)
				//*  42   88:astore_1        
					{
						throw new AssertionError(((Object) (illegalaccessexception)));
				//   43   89:new             #69  <Class AssertionError>
				//   44   92:dup             
				//   45   93:aload_1         
				//   46   94:invokespecial   #72  <Method void AssertionError(Object)>
				//   47   97:athrow          
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
		// Misplaced declaration of an exception variable
		catch(final Class constructor)
	//*  19   33:astore_1        
		{
			return null;
	//   20   34:aconst_null     
	//   21   35:areturn         
		}
		return ((ObjectConstructor) (constructor));
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
					//*   3    7:ifeq            73
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
								return ((Object) (EnumSet.noneOf((Class)type1)));
					//   14   32:aload_1         
					//   15   33:checkcast       #36  <Class Class>
					//   16   36:invokestatic    #42  <Method EnumSet EnumSet.noneOf(Class)>
					//   17   39:areturn         
							else
								throw new JsonIOException((new StringBuilder()).append("Invalid EnumSet type: ").append(((Object) (type)).toString()).toString());
					//   18   40:new             #44  <Class JsonIOException>
					//   19   43:dup             
					//   20   44:new             #46  <Class StringBuilder>
					//   21   47:dup             
					//   22   48:invokespecial   #47  <Method void StringBuilder()>
					//   23   51:ldc1            #49  <String "Invalid EnumSet type: ">
					//   24   53:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//   25   56:aload_0         
					//   26   57:getfield        #22  <Field Type val$type>
					//   27   60:invokevirtual   #57  <Method String Object.toString()>
					//   28   63:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//   29   66:invokevirtual   #58  <Method String StringBuilder.toString()>
					//   30   69:invokespecial   #61  <Method void JsonIOException(String)>
					//   31   72:athrow          
						} else
						{
							throw new JsonIOException((new StringBuilder()).append("Invalid EnumSet type: ").append(((Object) (type)).toString()).toString());
					//   32   73:new             #44  <Class JsonIOException>
					//   33   76:dup             
					//   34   77:new             #46  <Class StringBuilder>
					//   35   80:dup             
					//   36   81:invokespecial   #47  <Method void StringBuilder()>
					//   37   84:ldc1            #49  <String "Invalid EnumSet type: ">
					//   38   86:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//   39   89:aload_0         
					//   40   90:getfield        #22  <Field Type val$type>
					//   41   93:invokevirtual   #57  <Method String Object.toString()>
					//   42   96:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
					//   43   99:invokevirtual   #58  <Method String StringBuilder.toString()>
					//   44  102:invokespecial   #61  <Method void JsonIOException(String)>
					//   45  105:athrow          
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
					throw new RuntimeException((new StringBuilder()).append("Unable to invoke no-args constructor for ").append(((Object) (type))).append(". ").append("Register an InstanceCreator with Gson for this type may fix this problem.").toString(), ((Throwable) (exception)));
			//    9   15:new             #50  <Class RuntimeException>
			//   10   18:dup             
			//   11   19:new             #52  <Class StringBuilder>
			//   12   22:dup             
			//   13   23:invokespecial   #53  <Method void StringBuilder()>
			//   14   26:ldc1            #55  <String "Unable to invoke no-args constructor for ">
			//   15   28:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   16   31:aload_0         
			//   17   32:getfield        #28  <Field Type val$type>
			//   18   35:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
			//   19   38:ldc1            #64  <String ". ">
			//   20   40:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   21   43:ldc1            #66  <String "Register an InstanceCreator with Gson for this type may fix this problem.">
			//   22   45:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   23   48:invokevirtual   #70  <Method String StringBuilder.toString()>
			//   24   51:aload_1         
			//   25   52:invokespecial   #73  <Method void RuntimeException(String, Throwable)>
			//   26   55:athrow          
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

	public ObjectConstructor get(final TypeToken typeCreator)
	{
		final Type type = typeCreator.getType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #125 <Method Type TypeToken.getType()>
	//    2    4:astore_3        
		Class class1 = typeCreator.getRawType();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #113 <Method Class TypeToken.getRawType()>
	//    5    9:astore          4
		typeCreator = ((TypeToken) ((InstanceCreator)instanceCreators.get(((Object) (type)))));
	//    6   11:aload_0         
	//    7   12:getfield        #38  <Field Map instanceCreators>
	//    8   15:aload_3         
	//    9   16:invokeinterface #128 <Method Object Map.get(Object)>
	//   10   21:checkcast       #130 <Class InstanceCreator>
	//   11   24:astore_1        
		if(typeCreator != null)
	//*  12   25:aload_1         
	//*  13   26:ifnull          42
		{
			typeCreator = ((TypeToken) (new ObjectConstructor() {

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
));
	//   14   29:new             #6   <Class ConstructorConstructor$1>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:aload_3         
	//   19   36:invokespecial   #133 <Method void ConstructorConstructor$1(ConstructorConstructor, InstanceCreator, Type)>
	//   20   39:astore_1        
		} else
	//*  21   40:aload_1         
	//*  22   41:areturn         
		{
			typeCreator = ((TypeToken) ((InstanceCreator)instanceCreators.get(((Object) (class1)))));
	//   23   42:aload_0         
	//   24   43:getfield        #38  <Field Map instanceCreators>
	//   25   46:aload           4
	//   26   48:invokeinterface #128 <Method Object Map.get(Object)>
	//   27   53:checkcast       #130 <Class InstanceCreator>
	//   28   56:astore_1        
			if(typeCreator != null)
	//*  29   57:aload_1         
	//*  30   58:ifnull          72
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
	//   31   61:new             #14  <Class ConstructorConstructor$2>
	//   32   64:dup             
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:aload_3         
	//   36   68:invokespecial   #134 <Method void ConstructorConstructor$2(ConstructorConstructor, InstanceCreator, Type)>
	//   37   71:areturn         
			ObjectConstructor objectconstructor = newDefaultConstructor(class1);
	//   38   72:aload_0         
	//   39   73:aload           4
	//   40   75:invokespecial   #136 <Method ObjectConstructor newDefaultConstructor(Class)>
	//   41   78:astore_2        
			typeCreator = ((TypeToken) (objectconstructor));
	//   42   79:aload_2         
	//   43   80:astore_1        
			if(objectconstructor == null)
	//*  44   81:aload_2         
	//*  45   82:ifnonnull       40
			{
				typeCreator = ((TypeToken) (newDefaultImplementationConstructor(type, class1)));
	//   46   85:aload_0         
	//   47   86:aload_3         
	//   48   87:aload           4
	//   49   89:invokespecial   #138 <Method ObjectConstructor newDefaultImplementationConstructor(Type, Class)>
	//   50   92:astore_1        
				if(typeCreator != null)
	//*  51   93:aload_1         
	//*  52   94:ifnull          99
					return ((ObjectConstructor) (typeCreator));
	//   53   97:aload_1         
	//   54   98:areturn         
				else
					return newUnsafeAllocator(type, class1);
	//   55   99:aload_0         
	//   56  100:aload_3         
	//   57  101:aload           4
	//   58  103:invokespecial   #140 <Method ObjectConstructor newUnsafeAllocator(Type, Class)>
	//   59  106:areturn         
			}
		}
		return ((ObjectConstructor) (typeCreator));
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
