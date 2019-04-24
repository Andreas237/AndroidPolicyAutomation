// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class UnsafeAllocator
{

	public UnsafeAllocator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static UnsafeAllocator create()
	{
		Exception exception;
		int i;
		Object obj;
		try
		{
			obj = ((Object) (Class.forName("sun.misc.Unsafe")));
	//    0    0:ldc1            #23  <String "sun.misc.Unsafe">
	//    1    2:invokestatic    #29  <Method Class Class.forName(String)>
	//    2    5:astore_1        
			Object obj1 = ((Object) (((Class) (obj)).getDeclaredField("theUnsafe")));
	//    3    6:aload_1         
	//    4    7:ldc1            #31  <String "theUnsafe">
	//    5    9:invokevirtual   #35  <Method Field Class.getDeclaredField(String)>
	//    6   12:astore_2        
			((Field) (obj1)).setAccessible(true);
	//    7   13:aload_2         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #41  <Method void Field.setAccessible(boolean)>
			obj1 = ((Field) (obj1)).get(((Object) (null)));
	//   10   18:aload_2         
	//   11   19:aconst_null     
	//   12   20:invokevirtual   #45  <Method Object Field.get(Object)>
	//   13   23:astore_2        
			obj = ((Object) (new UnsafeAllocator(((Class) (obj)).getMethod("allocateInstance", new Class[] {
				java/lang/Class
			}), obj1) {

				public Object newInstance(Class class1)
				{
					return allocateInstance.invoke(unsafe, new Object[] {
						class1
					});
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field Method val$allocateInstance>
				//    2    4:aload_0         
				//    3    5:getfield        #17  <Field Object val$unsafe>
				//    4    8:iconst_1        
				//    5    9:anewarray       Object[]
				//    6   12:dup             
				//    7   13:iconst_0        
				//    8   14:aload_1         
				//    9   15:aastore         
				//   10   16:invokevirtual   #31  <Method Object Method.invoke(Object, Object[])>
				//   11   19:areturn         
				}

				final Method val$allocateInstance;
				final Object val$unsafe;

			
			{
				allocateInstance = method;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Method val$allocateInstance>
				unsafe = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #17  <Field Object val$unsafe>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #20  <Method void UnsafeAllocator()>
			//    8   14:return          
			}
			}
));
	//   14   24:new             #6   <Class UnsafeAllocator$1>
	//   15   27:dup             
	//   16   28:aload_1         
	//   17   29:ldc1            #47  <String "allocateInstance">
	//   18   31:iconst_1        
	//   19   32:anewarray       Class[]
	//   20   35:dup             
	//   21   36:iconst_0        
	//   22   37:ldc1            #25  <Class Class>
	//   23   39:aastore         
	//   24   40:invokevirtual   #51  <Method Method Class.getMethod(String, Class[])>
	//   25   43:aload_2         
	//   26   44:invokespecial   #54  <Method void UnsafeAllocator$1(Method, Object)>
	//   27   47:astore_1        
		}
	//*  28   48:aload_1         
	//*  29   49:areturn         
	//*  30   50:ldc1            #56  <Class ObjectStreamClass>
	//*  31   52:ldc1            #58  <String "getConstructorId">
	//*  32   54:iconst_1        
	//*  33   55:anewarray       Class[]
	//*  34   58:dup             
	//*  35   59:iconst_0        
	//*  36   60:ldc1            #25  <Class Class>
	//*  37   62:aastore         
	//*  38   63:invokevirtual   #61  <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  39   66:astore_1        
	//*  40   67:aload_1         
	//*  41   68:iconst_1        
	//*  42   69:invokevirtual   #64  <Method void Method.setAccessible(boolean)>
	//*  43   72:aload_1         
	//*  44   73:aconst_null     
	//*  45   74:iconst_1        
	//*  46   75:anewarray       Object[]
	//*  47   78:dup             
	//*  48   79:iconst_0        
	//*  49   80:ldc1            #4   <Class Object>
	//*  50   82:aastore         
	//*  51   83:invokevirtual   #68  <Method Object Method.invoke(Object, Object[])>
	//*  52   86:checkcast       #70  <Class Integer>
	//*  53   89:invokevirtual   #74  <Method int Integer.intValue()>
	//*  54   92:istore_0        
	//*  55   93:ldc1            #56  <Class ObjectStreamClass>
	//*  56   95:ldc1            #76  <String "newInstance">
	//*  57   97:iconst_2        
	//*  58   98:anewarray       Class[]
	//*  59  101:dup             
	//*  60  102:iconst_0        
	//*  61  103:ldc1            #25  <Class Class>
	//*  62  105:aastore         
	//*  63  106:dup             
	//*  64  107:iconst_1        
	//*  65  108:getstatic       #80  <Field Class Integer.TYPE>
	//*  66  111:aastore         
	//*  67  112:invokevirtual   #61  <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  68  115:astore_1        
	//*  69  116:aload_1         
	//*  70  117:iconst_1        
	//*  71  118:invokevirtual   #64  <Method void Method.setAccessible(boolean)>
	//*  72  121:new             #8   <Class UnsafeAllocator$2>
	//*  73  124:dup             
	//*  74  125:aload_1         
	//*  75  126:iload_0         
	//*  76  127:invokespecial   #83  <Method void UnsafeAllocator$2(Method, int)>
	//*  77  130:astore_1        
	//*  78  131:aload_1         
	//*  79  132:areturn         
	//*  80  133:ldc1            #85  <Class ObjectInputStream>
	//*  81  135:ldc1            #76  <String "newInstance">
	//*  82  137:iconst_2        
	//*  83  138:anewarray       Class[]
	//*  84  141:dup             
	//*  85  142:iconst_0        
	//*  86  143:ldc1            #25  <Class Class>
	//*  87  145:aastore         
	//*  88  146:dup             
	//*  89  147:iconst_1        
	//*  90  148:ldc1            #25  <Class Class>
	//*  91  150:aastore         
	//*  92  151:invokevirtual   #61  <Method Method Class.getDeclaredMethod(String, Class[])>
	//*  93  154:astore_1        
	//*  94  155:aload_1         
	//*  95  156:iconst_1        
	//*  96  157:invokevirtual   #64  <Method void Method.setAccessible(boolean)>
	//*  97  160:new             #10  <Class UnsafeAllocator$3>
	//*  98  163:dup             
	//*  99  164:aload_1         
	//* 100  165:invokespecial   #88  <Method void UnsafeAllocator$3(Method)>
	//* 101  168:astore_1        
	//* 102  169:aload_1         
	//* 103  170:areturn         
	//* 104  171:new             #12  <Class UnsafeAllocator$4>
	//* 105  174:dup             
	//* 106  175:invokespecial   #89  <Method void UnsafeAllocator$4()>
	//* 107  178:areturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			try
			{
				obj = ((Object) (((Class) (java/io/ObjectStreamClass)).getDeclaredMethod("getConstructorId", new Class[] {
					java/lang/Class
				})));
				((Method) (obj)).setAccessible(true);
				i = ((Integer)((Method) (obj)).invoke(((Object) (null)), new Object[] {
					java/lang/Object
				})).intValue();
				obj = ((Object) (((Class) (java/io/ObjectStreamClass)).getDeclaredMethod("newInstance", new Class[] {
					java/lang/Class, Integer.TYPE
				})));
				((Method) (obj)).setAccessible(true);
				obj = ((Object) (new UnsafeAllocator(((Method) (obj)), i) {

					public Object newInstance(Class class1)
					{
						return newInstance.invoke(((Object) (null)), new Object[] {
							class1, Integer.valueOf(constructorId)
						});
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field Method val$newInstance>
					//    2    4:aconst_null     
					//    3    5:iconst_2        
					//    4    6:anewarray       Object[]
					//    5    9:dup             
					//    6   10:iconst_0        
					//    7   11:aload_1         
					//    8   12:aastore         
					//    9   13:dup             
					//   10   14:iconst_1        
					//   11   15:aload_0         
					//   12   16:getfield        #17  <Field int val$constructorId>
					//   13   19:invokestatic    #31  <Method Integer Integer.valueOf(int)>
					//   14   22:aastore         
					//   15   23:invokevirtual   #37  <Method Object Method.invoke(Object, Object[])>
					//   16   26:areturn         
					}

					final int val$constructorId;
					final Method val$newInstance;

			
			{
				newInstance = method;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Method val$newInstance>
				constructorId = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #17  <Field int val$constructorId>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #20  <Method void UnsafeAllocator()>
			//    8   14:return          
			}
				}
));
			}
	//* 108  179:astore_1        
	//* 109  180:goto            50
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				try
				{
					obj = ((Object) (((Class) (java/io/ObjectInputStream)).getDeclaredMethod("newInstance", new Class[] {
						java/lang/Class, java/lang/Class
					})));
					((Method) (obj)).setAccessible(true);
					obj = ((Object) (new UnsafeAllocator(((Method) (obj))) {

						public Object newInstance(Class class1)
						{
							return newInstance.invoke(((Object) (null)), new Object[] {
								class1, java/lang/Object
							});
						//    0    0:aload_0         
						//    1    1:getfield        #13  <Field Method val$newInstance>
						//    2    4:aconst_null     
						//    3    5:iconst_2        
						//    4    6:anewarray       Object[]
						//    5    9:dup             
						//    6   10:iconst_0        
						//    7   11:aload_1         
						//    8   12:aastore         
						//    9   13:dup             
						//   10   14:iconst_1        
						//   11   15:ldc1            #21  <Class Object>
						//   12   17:aastore         
						//   13   18:invokevirtual   #27  <Method Object Method.invoke(Object, Object[])>
						//   14   21:areturn         
						}

						final Method val$newInstance;

			
			{
				newInstance = method;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #13  <Field Method val$newInstance>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #16  <Method void UnsafeAllocator()>
			//    5    9:return          
			}
					}
));
				}
	//* 110  183:astore_1        
	//* 111  184:goto            133
				// Misplaced declaration of an exception variable
				catch(Exception exception)
				{
					return ((UnsafeAllocator) (new UnsafeAllocator() {

						public Object newInstance(Class class1)
						{
							StringBuilder stringbuilder = new StringBuilder();
						//    0    0:new             #16  <Class StringBuilder>
						//    1    3:dup             
						//    2    4:invokespecial   #17  <Method void StringBuilder()>
						//    3    7:astore_2        
							stringbuilder.append("Cannot allocate ");
						//    4    8:aload_2         
						//    5    9:ldc1            #19  <String "Cannot allocate ">
						//    6   11:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
						//    7   14:pop             
							stringbuilder.append(((Object) (class1)));
						//    8   15:aload_2         
						//    9   16:aload_1         
						//   10   17:invokevirtual   #26  <Method StringBuilder StringBuilder.append(Object)>
						//   11   20:pop             
							throw new UnsupportedOperationException(stringbuilder.toString());
						//   12   21:new             #28  <Class UnsupportedOperationException>
						//   13   24:dup             
						//   14   25:aload_2         
						//   15   26:invokevirtual   #32  <Method String StringBuilder.toString()>
						//   16   29:invokespecial   #35  <Method void UnsupportedOperationException(String)>
						//   17   32:athrow          
						}

					}
));
				}
				return ((UnsafeAllocator) (obj));
			}
			return ((UnsafeAllocator) (obj));
		}
		return ((UnsafeAllocator) (obj));
	//* 112  187:astore_1        
	//* 113  188:goto            171
	}

	public abstract Object newInstance(Class class1);
}
