// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.gson.internal:
//			ObjectConstructor, LinkedTreeMap, UnsafeAllocator

public final class ConstructorConstructor
{

	public ConstructorConstructor(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		instanceCreators = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field Map instanceCreators>
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
	//    3    5:invokevirtual   #55  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    4    8:astore_1        
			if(!((Constructor) (constructor)).isAccessible())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #61  <Method boolean Constructor.isAccessible()>
	//*   7   13:ifne            21
				((Constructor) (constructor)).setAccessible(true);
	//    8   16:aload_1         
	//    9   17:iconst_1        
	//   10   18:invokevirtual   #65  <Method void Constructor.setAccessible(boolean)>
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
	//   11   21:new             #20  <Class ConstructorConstructor$3>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #68  <Method void ConstructorConstructor$3(ConstructorConstructor, Constructor)>
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
	//*   0    0:ldc1            #73  <Class Collection>
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
	//*   3    6:ifeq            91
		{
			if(((Class) (java/util/SortedSet)).isAssignableFrom(class1))
	//*   4    9:ldc1            #79  <Class SortedSet>
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
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
	//    8   18:new             #22  <Class ConstructorConstructor$4>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #82  <Method void ConstructorConstructor$4(ConstructorConstructor)>
	//   12   26:areturn         
			if(((Class) (java/util/EnumSet)).isAssignableFrom(class1))
	//*  13   27:ldc1            #84  <Class EnumSet>
	//*  14   29:aload_2         
	//*  15   30:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
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
	//   17   36:new             #24  <Class ConstructorConstructor$5>
	//   18   39:dup             
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:invokespecial   #87  <Method void ConstructorConstructor$5(ConstructorConstructor, Type)>
	//   22   45:areturn         
			if(((Class) (java/util/Set)).isAssignableFrom(class1))
	//*  23   46:ldc1            #89  <Class Set>
	//*  24   48:aload_2         
	//*  25   49:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
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
	//   27   55:new             #26  <Class ConstructorConstructor$6>
	//   28   58:dup             
	//   29   59:aload_0         
	//   30   60:invokespecial   #90  <Method void ConstructorConstructor$6(ConstructorConstructor)>
	//   31   63:areturn         
			if(((Class) (java/util/Queue)).isAssignableFrom(class1))
	//*  32   64:ldc1            #92  <Class Queue>
	//*  33   66:aload_2         
	//*  34   67:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
	//*  35   70:ifeq            82
				return new ObjectConstructor() {

					public Object construct()
					{
						return ((Object) (new ArrayDeque()));
					//    0    0:new             #26  <Class ArrayDeque>
					//    1    3:dup             
					//    2    4:invokespecial   #27  <Method void ArrayDeque()>
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
	//   36   73:new             #28  <Class ConstructorConstructor$7>
	//   37   76:dup             
	//   38   77:aload_0         
	//   39   78:invokespecial   #93  <Method void ConstructorConstructor$7(ConstructorConstructor)>
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
	//   41   82:new             #30  <Class ConstructorConstructor$8>
	//   42   85:dup             
	//   43   86:aload_0         
	//   44   87:invokespecial   #94  <Method void ConstructorConstructor$8(ConstructorConstructor)>
	//   45   90:areturn         
		}
		if(((Class) (java/util/Map)).isAssignableFrom(class1))
	//*  46   91:ldc1            #96  <Class Map>
	//*  47   93:aload_2         
	//*  48   94:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
	//*  49   97:ifeq            204
		{
			if(((Class) (java/util/concurrent/ConcurrentNavigableMap)).isAssignableFrom(class1))
	//*  50  100:ldc1            #98  <Class ConcurrentNavigableMap>
	//*  51  102:aload_2         
	//*  52  103:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
	//*  53  106:ifeq            118
				return new ObjectConstructor() {

					public Object construct()
					{
						return ((Object) (new ConcurrentSkipListMap()));
					//    0    0:new             #26  <Class ConcurrentSkipListMap>
					//    1    3:dup             
					//    2    4:invokespecial   #27  <Method void ConcurrentSkipListMap()>
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
	//   54  109:new             #32  <Class ConstructorConstructor$9>
	//   55  112:dup             
	//   56  113:aload_0         
	//   57  114:invokespecial   #99  <Method void ConstructorConstructor$9(ConstructorConstructor)>
	//   58  117:areturn         
			if(((Class) (java/util/concurrent/ConcurrentMap)).isAssignableFrom(class1))
	//*  59  118:ldc1            #101 <Class ConcurrentMap>
	//*  60  120:aload_2         
	//*  61  121:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
	//*  62  124:ifeq            136
				return new ObjectConstructor() {

					public Object construct()
					{
						return ((Object) (new ConcurrentHashMap()));
					//    0    0:new             #26  <Class ConcurrentHashMap>
					//    1    3:dup             
					//    2    4:invokespecial   #27  <Method void ConcurrentHashMap()>
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
	//   63  127:new             #8   <Class ConstructorConstructor$10>
	//   64  130:dup             
	//   65  131:aload_0         
	//   66  132:invokespecial   #102 <Method void ConstructorConstructor$10(ConstructorConstructor)>
	//   67  135:areturn         
			if(((Class) (java/util/SortedMap)).isAssignableFrom(class1))
	//*  68  136:ldc1            #104 <Class SortedMap>
	//*  69  138:aload_2         
	//*  70  139:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
	//*  71  142:ifeq            154
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
	//   72  145:new             #10  <Class ConstructorConstructor$11>
	//   73  148:dup             
	//   74  149:aload_0         
	//   75  150:invokespecial   #105 <Method void ConstructorConstructor$11(ConstructorConstructor)>
	//   76  153:areturn         
			if((type instanceof ParameterizedType) && !((Class) (java/lang/String)).isAssignableFrom(TypeToken.get(((ParameterizedType)type).getActualTypeArguments()[0]).getRawType()))
	//*  77  154:aload_1         
	//*  78  155:instanceof      #107 <Class ParameterizedType>
	//*  79  158:ifeq            195
	//*  80  161:ldc1            #109 <Class String>
	//*  81  163:aload_1         
	//*  82  164:checkcast       #107 <Class ParameterizedType>
	//*  83  167:invokeinterface #113 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//*  84  172:iconst_0        
	//*  85  173:aaload          
	//*  86  174:invokestatic    #119 <Method TypeToken TypeToken.get(Type)>
	//*  87  177:invokevirtual   #123 <Method Class TypeToken.getRawType()>
	//*  88  180:invokevirtual   #77  <Method boolean Class.isAssignableFrom(Class)>
	//*  89  183:ifne            195
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
	//   90  186:new             #12  <Class ConstructorConstructor$12>
	//   91  189:dup             
	//   92  190:aload_0         
	//   93  191:invokespecial   #124 <Method void ConstructorConstructor$12(ConstructorConstructor)>
	//   94  194:areturn         
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
	//   95  195:new             #14  <Class ConstructorConstructor$13>
	//   96  198:dup             
	//   97  199:aload_0         
	//   98  200:invokespecial   #125 <Method void ConstructorConstructor$13(ConstructorConstructor)>
	//   99  203:areturn         
		} else
		{
			return null;
	//  100  204:aconst_null     
	//  101  205:areturn         
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
					throw new RuntimeException((new StringBuilder()).append("Unable to invoke no-args constructor for ").append(((Object) (type))).append(". Registering an InstanceCreator with Gson for this type may fix this problem.").toString(), ((Throwable) (exception)));
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
			//   19   38:ldc1            #64  <String ". Registering an InstanceCreator with Gson for this type may fix this problem.">
			//   20   40:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   21   43:invokevirtual   #68  <Method String StringBuilder.toString()>
			//   22   46:aload_1         
			//   23   47:invokespecial   #71  <Method void RuntimeException(String, Throwable)>
			//   24   50:athrow          
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
	//    0    0:new             #16  <Class ConstructorConstructor$14>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokespecial   #130 <Method void ConstructorConstructor$14(ConstructorConstructor, Class, Type)>
	//    6   10:areturn         
	}

	public ObjectConstructor get(TypeToken typetoken)
	{
		final Type type = typetoken.getType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #135 <Method Type TypeToken.getType()>
	//    2    4:astore_2        
		typetoken = ((TypeToken) (typetoken.getRawType()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #123 <Method Class TypeToken.getRawType()>
	//    5    9:astore_1        
		final InstanceCreator typeCreator = (InstanceCreator)instanceCreators.get(((Object) (type)));
	//    6   10:aload_0         
	//    7   11:getfield        #42  <Field Map instanceCreators>
	//    8   14:aload_2         
	//    9   15:invokeinterface #138 <Method Object Map.get(Object)>
	//   10   20:checkcast       #140 <Class InstanceCreator>
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
	//   19   35:invokespecial   #143 <Method void ConstructorConstructor$1(ConstructorConstructor, InstanceCreator, Type)>
	//   20   38:areturn         
		final InstanceCreator rawTypeCreator = (InstanceCreator)instanceCreators.get(((Object) (typetoken)));
	//   21   39:aload_0         
	//   22   40:getfield        #42  <Field Map instanceCreators>
	//   23   43:aload_1         
	//   24   44:invokeinterface #138 <Method Object Map.get(Object)>
	//   25   49:checkcast       #140 <Class InstanceCreator>
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
	//   29   57:new             #18  <Class ConstructorConstructor$2>
	//   30   60:dup             
	//   31   61:aload_0         
	//   32   62:aload_3         
	//   33   63:aload_2         
	//   34   64:invokespecial   #144 <Method void ConstructorConstructor$2(ConstructorConstructor, InstanceCreator, Type)>
	//   35   67:areturn         
		rawTypeCreator = ((InstanceCreator) (newDefaultConstructor(((Class) (typetoken)))));
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:invokespecial   #146 <Method ObjectConstructor newDefaultConstructor(Class)>
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
	//   47   83:invokespecial   #148 <Method ObjectConstructor newDefaultImplementationConstructor(Type, Class)>
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
	//   56   96:invokespecial   #150 <Method ObjectConstructor newUnsafeAllocator(Type, Class)>
	//   57   99:areturn         
	}

	public String toString()
	{
		return ((Object) (instanceCreators)).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map instanceCreators>
	//    2    4:invokevirtual   #155 <Method String Object.toString()>
	//    3    7:areturn         
	}

	private final Map instanceCreators;
}
