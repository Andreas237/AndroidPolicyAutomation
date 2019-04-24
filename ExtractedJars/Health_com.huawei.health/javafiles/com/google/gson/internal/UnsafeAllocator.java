// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.*;

public abstract class UnsafeAllocator
{

	public UnsafeAllocator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	static void assertInstantiable(Class class1)
	{
		int i = class1.getModifiers();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method int Class.getModifiers()>
	//    2    4:istore_1        
		if(Modifier.isInterface(i))
	//*   3    5:iload_1         
	//*   4    6:invokestatic    #31  <Method boolean Modifier.isInterface(int)>
	//*   5    9:ifeq            42
			throw new UnsupportedOperationException((new StringBuilder()).append("Interface can't be instantiated! Interface name: ").append(class1.getName()).toString());
	//    6   12:new             #33  <Class UnsupportedOperationException>
	//    7   15:dup             
	//    8   16:new             #35  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #36  <Method void StringBuilder()>
	//   11   23:ldc1            #38  <String "Interface can't be instantiated! Interface name: ">
	//   12   25:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:aload_0         
	//   14   29:invokevirtual   #46  <Method String Class.getName()>
	//   15   32:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   17   38:invokespecial   #52  <Method void UnsupportedOperationException(String)>
	//   18   41:athrow          
		if(Modifier.isAbstract(i))
	//*  19   42:iload_1         
	//*  20   43:invokestatic    #55  <Method boolean Modifier.isAbstract(int)>
	//*  21   46:ifeq            79
			throw new UnsupportedOperationException((new StringBuilder()).append("Abstract class can't be instantiated! Class name: ").append(class1.getName()).toString());
	//   22   49:new             #33  <Class UnsupportedOperationException>
	//   23   52:dup             
	//   24   53:new             #35  <Class StringBuilder>
	//   25   56:dup             
	//   26   57:invokespecial   #36  <Method void StringBuilder()>
	//   27   60:ldc1            #57  <String "Abstract class can't be instantiated! Class name: ">
	//   28   62:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   29   65:aload_0         
	//   30   66:invokevirtual   #46  <Method String Class.getName()>
	//   31   69:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   32   72:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   33   75:invokespecial   #52  <Method void UnsupportedOperationException(String)>
	//   34   78:athrow          
		else
			return;
	//   35   79:return          
	}

	public static UnsafeAllocator create()
	{
		Object obj;
		try
		{
			obj = ((Object) (Class.forName("sun.misc.Unsafe")));
	//    0    0:ldc1            #65  <String "sun.misc.Unsafe">
	//    1    2:invokestatic    #69  <Method Class Class.forName(String)>
	//    2    5:astore_1        
			Object obj3 = ((Object) (((Class) (obj)).getDeclaredField("theUnsafe")));
	//    3    6:aload_1         
	//    4    7:ldc1            #71  <String "theUnsafe">
	//    5    9:invokevirtual   #75  <Method Field Class.getDeclaredField(String)>
	//    6   12:astore_2        
			((Field) (obj3)).setAccessible(true);
	//    7   13:aload_2         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #81  <Method void Field.setAccessible(boolean)>
			obj3 = ((Field) (obj3)).get(((Object) (null)));
	//   10   18:aload_2         
	//   11   19:aconst_null     
	//   12   20:invokevirtual   #85  <Method Object Field.get(Object)>
	//   13   23:astore_2        
			obj = ((Object) (new UnsafeAllocator(((Class) (obj)).getMethod("allocateInstance", new Class[] {
				java/lang/Class
			}), obj3) {

				public Object newInstance(Class class1)
					throws Exception
				{
					assertInstantiable(class1);
				//    0    0:aload_1         
				//    1    1:invokestatic    #29  <Method void assertInstantiable(Class)>
					return allocateInstance.invoke(unsafe, new Object[] {
						class1
					});
				//    2    4:aload_0         
				//    3    5:getfield        #15  <Field Method val$allocateInstance>
				//    4    8:aload_0         
				//    5    9:getfield        #17  <Field Object val$unsafe>
				//    6   12:iconst_1        
				//    7   13:anewarray       Object[]
				//    8   16:dup             
				//    9   17:iconst_0        
				//   10   18:aload_1         
				//   11   19:aastore         
				//   12   20:invokevirtual   #37  <Method Object Method.invoke(Object, Object[])>
				//   13   23:areturn         
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
	//   17   29:ldc1            #87  <String "allocateInstance">
	//   18   31:iconst_1        
	//   19   32:anewarray       Class[]
	//   20   35:dup             
	//   21   36:iconst_0        
	//   22   37:ldc1            #21  <Class Class>
	//   23   39:aastore         
	//   24   40:invokevirtual   #91  <Method Method Class.getMethod(String, Class[])>
	//   25   43:aload_2         
	//   26   44:invokespecial   #94  <Method void UnsafeAllocator$1(Method, Object)>
	//   27   47:astore_1        
		}
	//*  28   48:aload_1         
	//*  29   49:areturn         
		catch(Exception exception)
	//*  30   50:astore_1        
		{
			Object obj1;
			try
			{
				obj1 = ((Object) (((Class) (java/io/ObjectStreamClass)).getDeclaredMethod("getConstructorId", new Class[] {
					java/lang/Class
				})));
	//   31   51:ldc1            #96  <Class ObjectStreamClass>
	//   32   53:ldc1            #98  <String "getConstructorId">
	//   33   55:iconst_1        
	//   34   56:anewarray       Class[]
	//   35   59:dup             
	//   36   60:iconst_0        
	//   37   61:ldc1            #21  <Class Class>
	//   38   63:aastore         
	//   39   64:invokevirtual   #101 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   40   67:astore_1        
				((Method) (obj1)).setAccessible(true);
	//   41   68:aload_1         
	//   42   69:iconst_1        
	//   43   70:invokevirtual   #104 <Method void Method.setAccessible(boolean)>
				int i = ((Integer)((Method) (obj1)).invoke(((Object) (null)), new Object[] {
					java/lang/Object
				})).intValue();
	//   44   73:aload_1         
	//   45   74:aconst_null     
	//   46   75:iconst_1        
	//   47   76:anewarray       Object[]
	//   48   79:dup             
	//   49   80:iconst_0        
	//   50   81:ldc1            #4   <Class Object>
	//   51   83:aastore         
	//   52   84:invokevirtual   #108 <Method Object Method.invoke(Object, Object[])>
	//   53   87:checkcast       #110 <Class Integer>
	//   54   90:invokevirtual   #113 <Method int Integer.intValue()>
	//   55   93:istore_0        
				obj1 = ((Object) (((Class) (java/io/ObjectStreamClass)).getDeclaredMethod("newInstance", new Class[] {
					java/lang/Class, Integer.TYPE
				})));
	//   56   94:ldc1            #96  <Class ObjectStreamClass>
	//   57   96:ldc1            #115 <String "newInstance">
	//   58   98:iconst_2        
	//   59   99:anewarray       Class[]
	//   60  102:dup             
	//   61  103:iconst_0        
	//   62  104:ldc1            #21  <Class Class>
	//   63  106:aastore         
	//   64  107:dup             
	//   65  108:iconst_1        
	//   66  109:getstatic       #119 <Field Class Integer.TYPE>
	//   67  112:aastore         
	//   68  113:invokevirtual   #101 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   69  116:astore_1        
				((Method) (obj1)).setAccessible(true);
	//   70  117:aload_1         
	//   71  118:iconst_1        
	//   72  119:invokevirtual   #104 <Method void Method.setAccessible(boolean)>
				obj1 = ((Object) (new UnsafeAllocator(((Method) (obj1)), i) {

					public Object newInstance(Class class1)
						throws Exception
					{
						assertInstantiable(class1);
					//    0    0:aload_1         
					//    1    1:invokestatic    #29  <Method void assertInstantiable(Class)>
						return newInstance.invoke(((Object) (null)), new Object[] {
							class1, Integer.valueOf(constructorId)
						});
					//    2    4:aload_0         
					//    3    5:getfield        #15  <Field Method val$newInstance>
					//    4    8:aconst_null     
					//    5    9:iconst_2        
					//    6   10:anewarray       Object[]
					//    7   13:dup             
					//    8   14:iconst_0        
					//    9   15:aload_1         
					//   10   16:aastore         
					//   11   17:dup             
					//   12   18:iconst_1        
					//   13   19:aload_0         
					//   14   20:getfield        #17  <Field int val$constructorId>
					//   15   23:invokestatic    #37  <Method Integer Integer.valueOf(int)>
					//   16   26:aastore         
					//   17   27:invokevirtual   #43  <Method Object Method.invoke(Object, Object[])>
					//   18   30:areturn         
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
	//   73  122:new             #8   <Class UnsafeAllocator$2>
	//   74  125:dup             
	//   75  126:aload_1         
	//   76  127:iload_0         
	//   77  128:invokespecial   #122 <Method void UnsafeAllocator$2(Method, int)>
	//   78  131:astore_1        
			}
	//*  79  132:aload_1         
	//*  80  133:areturn         
			catch(Exception exception1)
	//*  81  134:astore_1        
			{
				Object obj2;
				try
				{
					obj2 = ((Object) (((Class) (java/io/ObjectInputStream)).getDeclaredMethod("newInstance", new Class[] {
						java/lang/Class, java/lang/Class
					})));
	//   82  135:ldc1            #124 <Class ObjectInputStream>
	//   83  137:ldc1            #115 <String "newInstance">
	//   84  139:iconst_2        
	//   85  140:anewarray       Class[]
	//   86  143:dup             
	//   87  144:iconst_0        
	//   88  145:ldc1            #21  <Class Class>
	//   89  147:aastore         
	//   90  148:dup             
	//   91  149:iconst_1        
	//   92  150:ldc1            #21  <Class Class>
	//   93  152:aastore         
	//   94  153:invokevirtual   #101 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   95  156:astore_1        
					((Method) (obj2)).setAccessible(true);
	//   96  157:aload_1         
	//   97  158:iconst_1        
	//   98  159:invokevirtual   #104 <Method void Method.setAccessible(boolean)>
					obj2 = ((Object) (new UnsafeAllocator(((Method) (obj2))) {

						public Object newInstance(Class class1)
							throws Exception
						{
							assertInstantiable(class1);
						//    0    0:aload_1         
						//    1    1:invokestatic    #25  <Method void assertInstantiable(Class)>
							return newInstance.invoke(((Object) (null)), new Object[] {
								class1, java/lang/Object
							});
						//    2    4:aload_0         
						//    3    5:getfield        #13  <Field Method val$newInstance>
						//    4    8:aconst_null     
						//    5    9:iconst_2        
						//    6   10:anewarray       Object[]
						//    7   13:dup             
						//    8   14:iconst_0        
						//    9   15:aload_1         
						//   10   16:aastore         
						//   11   17:dup             
						//   12   18:iconst_1        
						//   13   19:ldc1            #27  <Class Object>
						//   14   21:aastore         
						//   15   22:invokevirtual   #33  <Method Object Method.invoke(Object, Object[])>
						//   16   25:areturn         
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
	//   99  162:new             #10  <Class UnsafeAllocator$3>
	//  100  165:dup             
	//  101  166:aload_1         
	//  102  167:invokespecial   #127 <Method void UnsafeAllocator$3(Method)>
	//  103  170:astore_1        
				}
	//* 104  171:aload_1         
	//* 105  172:areturn         
				catch(Exception exception2)
	//* 106  173:astore_1        
				{
					return ((UnsafeAllocator) (new UnsafeAllocator() {

						public Object newInstance(Class class1)
						{
							throw new UnsupportedOperationException((new StringBuilder()).append("Cannot allocate ").append(((Object) (class1))).toString());
						//    0    0:new             #16  <Class UnsupportedOperationException>
						//    1    3:dup             
						//    2    4:new             #18  <Class StringBuilder>
						//    3    7:dup             
						//    4    8:invokespecial   #19  <Method void StringBuilder()>
						//    5   11:ldc1            #21  <String "Cannot allocate ">
						//    6   13:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
						//    7   16:aload_1         
						//    8   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(Object)>
						//    9   20:invokevirtual   #32  <Method String StringBuilder.toString()>
						//   10   23:invokespecial   #35  <Method void UnsupportedOperationException(String)>
						//   11   26:athrow          
						}

					}
));
	//  107  174:new             #12  <Class UnsafeAllocator$4>
	//  108  177:dup             
	//  109  178:invokespecial   #128 <Method void UnsafeAllocator$4()>
	//  110  181:areturn         
				}
				return ((UnsafeAllocator) (obj2));
			}
			return ((UnsafeAllocator) (obj1));
		}
		return ((UnsafeAllocator) (obj));
	}

	public abstract Object newInstance(Class class1)
		throws Exception;
}
