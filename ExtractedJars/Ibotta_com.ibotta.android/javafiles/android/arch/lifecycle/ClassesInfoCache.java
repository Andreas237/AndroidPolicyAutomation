// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package android.arch.lifecycle:
//			OnLifecycleEvent, LifecycleOwner

class ClassesInfoCache
{
	static class CallbackInfo
	{

		private static void invokeMethodsForEvent(List list, LifecycleOwner lifecycleowner, Lifecycle.Event event, Object obj)
		{
			if(list != null)
		//*   0    0:aload_0         
		//*   1    1:ifnull          45
			{
				for(int i = list.size() - 1; i >= 0; i--)
		//*   2    4:aload_0         
		//*   3    5:invokeinterface #82  <Method int List.size()>
		//*   4   10:iconst_1        
		//*   5   11:isub            
		//*   6   12:istore          4
		//*   7   14:iload           4
		//*   8   16:iflt            45
					((MethodReference)list.get(i)).invokeCallback(lifecycleowner, event, obj);
		//    9   19:aload_0         
		//   10   20:iload           4
		//   11   22:invokeinterface #85  <Method Object List.get(int)>
		//   12   27:checkcast       #87  <Class ClassesInfoCache$MethodReference>
		//   13   30:aload_1         
		//   14   31:aload_2         
		//   15   32:aload_3         
		//   16   33:invokevirtual   #91  <Method void ClassesInfoCache$MethodReference.invokeCallback(LifecycleOwner, Lifecycle$Event, Object)>

		//   17   36:iload           4
		//   18   38:iconst_1        
		//   19   39:isub            
		//   20   40:istore          4
			}
		//*  21   42:goto            14
		//   22   45:return          
		}

		void invokeCallbacks(LifecycleOwner lifecycleowner, Lifecycle.Event event, Object obj)
		{
			invokeMethodsForEvent((List)mEventToHandlers.get(((Object) (event))), lifecycleowner, event, obj);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Map mEventToHandlers>
		//    2    4:aload_2         
		//    3    5:invokeinterface #57  <Method Object Map.get(Object)>
		//    4   10:checkcast       #59  <Class List>
		//    5   13:aload_1         
		//    6   14:aload_2         
		//    7   15:aload_3         
		//    8   16:invokestatic    #95  <Method void invokeMethodsForEvent(List, LifecycleOwner, Lifecycle$Event, Object)>
			invokeMethodsForEvent((List)mEventToHandlers.get(((Object) (Lifecycle.Event.ON_ANY))), lifecycleowner, event, obj);
		//    9   19:aload_0         
		//   10   20:getfield        #24  <Field Map mEventToHandlers>
		//   11   23:getstatic       #99  <Field Lifecycle$Event Lifecycle$Event.ON_ANY>
		//   12   26:invokeinterface #57  <Method Object Map.get(Object)>
		//   13   31:checkcast       #59  <Class List>
		//   14   34:aload_1         
		//   15   35:aload_2         
		//   16   36:aload_3         
		//   17   37:invokestatic    #95  <Method void invokeMethodsForEvent(List, LifecycleOwner, Lifecycle$Event, Object)>
		//   18   40:return          
		}

		final Map mEventToHandlers = new HashMap();
		final Map mHandlerToEvent;

		CallbackInfo(Map map)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mHandlerToEvent = map;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Map mHandlerToEvent>
		//    5    9:aload_0         
		//    6   10:new             #21  <Class HashMap>
		//    7   13:dup             
		//    8   14:invokespecial   #22  <Method void HashMap()>
		//    9   17:putfield        #24  <Field Map mEventToHandlers>
			java.util.Map.Entry entry;
			for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ((List) (map)).add(entry.getKey()))
		//*  10   20:aload_1         
		//*  11   21:invokeinterface #30  <Method Set Map.entrySet()>
		//*  12   26:invokeinterface #36  <Method Iterator Set.iterator()>
		//*  13   31:astore_3        
		//*  14   32:aload_3         
		//*  15   33:invokeinterface #42  <Method boolean Iterator.hasNext()>
		//*  16   38:ifeq            123
			{
				entry = (java.util.Map.Entry)iterator.next();
		//   17   41:aload_3         
		//   18   42:invokeinterface #46  <Method Object Iterator.next()>
		//   19   47:checkcast       #48  <Class java.util.Map$Entry>
		//   20   50:astore          4
				Lifecycle.Event event = (Lifecycle.Event)entry.getValue();
		//   21   52:aload           4
		//   22   54:invokeinterface #51  <Method Object java.util.Map$Entry.getValue()>
		//   23   59:checkcast       #53  <Class Lifecycle$Event>
		//   24   62:astore          5
				List list = (List)mEventToHandlers.get(((Object) (event)));
		//   25   64:aload_0         
		//   26   65:getfield        #24  <Field Map mEventToHandlers>
		//   27   68:aload           5
		//   28   70:invokeinterface #57  <Method Object Map.get(Object)>
		//   29   75:checkcast       #59  <Class List>
		//   30   78:astore_2        
				map = ((Map) (list));
		//   31   79:aload_2         
		//   32   80:astore_1        
				if(list == null)
		//*  33   81:aload_2         
		//*  34   82:ifnonnull       106
				{
					map = ((Map) (new ArrayList()));
		//   35   85:new             #61  <Class ArrayList>
		//   36   88:dup             
		//   37   89:invokespecial   #62  <Method void ArrayList()>
		//   38   92:astore_1        
					mEventToHandlers.put(((Object) (event)), ((Object) (map)));
		//   39   93:aload_0         
		//   40   94:getfield        #24  <Field Map mEventToHandlers>
		//   41   97:aload           5
		//   42   99:aload_1         
		//   43  100:invokeinterface #66  <Method Object Map.put(Object, Object)>
		//   44  105:pop             
				}
			}

		//   45  106:aload_1         
		//   46  107:aload           4
		//   47  109:invokeinterface #69  <Method Object java.util.Map$Entry.getKey()>
		//   48  114:invokeinterface #73  <Method boolean List.add(Object)>
		//   49  119:pop             
		//*  50  120:goto            32
		//   51  123:return          
		}
	}

	static class MethodReference
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          64
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #33  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #33  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((MethodReference)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class ClassesInfoCache$MethodReference>
		//   16   28:astore_1        
				return mCallType == ((MethodReference) (obj)).mCallType && mMethod.getName().equals(((Object) (((MethodReference) (obj)).mMethod.getName())));
		//   17   29:aload_0         
		//   18   30:getfield        #18  <Field int mCallType>
		//   19   33:aload_1         
		//   20   34:getfield        #18  <Field int mCallType>
		//   21   37:icmpne          62
		//   22   40:aload_0         
		//   23   41:getfield        #20  <Field Method mMethod>
		//   24   44:invokevirtual   #37  <Method String Method.getName()>
		//   25   47:aload_1         
		//   26   48:getfield        #20  <Field Method mMethod>
		//   27   51:invokevirtual   #37  <Method String Method.getName()>
		//   28   54:invokevirtual   #41  <Method boolean String.equals(Object)>
		//   29   57:ifeq            62
		//   30   60:iconst_1        
		//   31   61:ireturn         
		//   32   62:iconst_0        
		//   33   63:ireturn         
			} else
			{
				return false;
		//   34   64:iconst_0        
		//   35   65:ireturn         
			}
		}

		public int hashCode()
		{
			return mCallType * 31 + mMethod.getName().hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int mCallType>
		//    2    4:bipush          31
		//    3    6:imul            
		//    4    7:aload_0         
		//    5    8:getfield        #20  <Field Method mMethod>
		//    6   11:invokevirtual   #37  <Method String Method.getName()>
		//    7   14:invokevirtual   #45  <Method int String.hashCode()>
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		void invokeCallback(LifecycleOwner lifecycleowner, Lifecycle.Event event, Object obj)
		{
			mCallType;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int mCallType>
			JVM INSTR tableswitch 0 2: default 111
		//		               0 72
		//		               1 54
		//		               2 32;
		//    2    4:tableswitch     0 2: default 111
		//		               0 72
		//		               1 54
		//		               2 32
			   goto _L1 _L2 _L3 _L4
_L4:
			mMethod.invoke(obj, new Object[] {
				lifecycleowner, event
			});
		//    3   32:aload_0         
		//    4   33:getfield        #20  <Field Method mMethod>
		//    5   36:aload_3         
		//    6   37:iconst_2        
		//    7   38:anewarray       Object[]
		//    8   41:dup             
		//    9   42:iconst_0        
		//   10   43:aload_1         
		//   11   44:aastore         
		//   12   45:dup             
		//   13   46:iconst_1        
		//   14   47:aload_2         
		//   15   48:aastore         
		//   16   49:invokevirtual   #55  <Method Object Method.invoke(Object, Object[])>
		//   17   52:pop             
			return;
		//   18   53:return          
_L3:
			try
			{
				mMethod.invoke(obj, new Object[] {
					lifecycleowner
				});
		//   19   54:aload_0         
		//   20   55:getfield        #20  <Field Method mMethod>
		//   21   58:aload_3         
		//   22   59:iconst_1        
		//   23   60:anewarray       Object[]
		//   24   63:dup             
		//   25   64:iconst_0        
		//   26   65:aload_1         
		//   27   66:aastore         
		//   28   67:invokevirtual   #55  <Method Object Method.invoke(Object, Object[])>
		//   29   70:pop             
				return;
		//   30   71:return          
			}
		//*  31   72:aload_0         
		//*  32   73:getfield        #20  <Field Method mMethod>
		//*  33   76:aload_3         
		//*  34   77:iconst_0        
		//*  35   78:anewarray       Object[]
		//*  36   81:invokevirtual   #55  <Method Object Method.invoke(Object, Object[])>
		//*  37   84:pop             
		//*  38   85:return          
		//*  39   86:astore_1        
		//*  40   87:new             #57  <Class RuntimeException>
		//*  41   90:dup             
		//*  42   91:aload_1         
		//*  43   92:invokespecial   #60  <Method void RuntimeException(Throwable)>
		//*  44   95:athrow          
			// Misplaced declaration of an exception variable
			catch(LifecycleOwner lifecycleowner)
		//*  45   96:astore_1        
			{
				throw new RuntimeException("Failed to call observer method", ((InvocationTargetException) (lifecycleowner)).getCause());
		//   46   97:new             #57  <Class RuntimeException>
		//   47  100:dup             
		//   48  101:ldc1            #62  <String "Failed to call observer method">
		//   49  103:aload_1         
		//   50  104:invokevirtual   #66  <Method Throwable InvocationTargetException.getCause()>
		//   51  107:invokespecial   #69  <Method void RuntimeException(String, Throwable)>
		//   52  110:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(LifecycleOwner lifecycleowner)
			{
				throw new RuntimeException(((Throwable) (lifecycleowner)));
			}
_L2:
			mMethod.invoke(obj, new Object[0]);
			return;
_L1:
		//   53  111:return          
		}

		final int mCallType;
		final Method mMethod;

		MethodReference(int i, Method method)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mCallType = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int mCallType>
			mMethod = method;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field Method mMethod>
			mMethod.setAccessible(true);
		//    8   14:aload_0         
		//    9   15:getfield        #20  <Field Method mMethod>
		//   10   18:iconst_1        
		//   11   19:invokevirtual   #26  <Method void Method.setAccessible(boolean)>
		//   12   22:return          
		}
	}


	ClassesInfoCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void HashMap()>
	//    6   12:putfield        #31  <Field Map mCallbackMap>
	//    7   15:aload_0         
	//    8   16:new             #28  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #29  <Method void HashMap()>
	//   11   23:putfield        #33  <Field Map mHasLifecycleMethods>
	//   12   26:return          
	}

	private CallbackInfo createInfo(Class class1, Method amethod[])
	{
		boolean flag;
		HashMap hashmap;
label0:
		{
			Object obj = ((Object) (class1.getSuperclass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method Class Class.getSuperclass()>
	//    2    4:astore          8
			hashmap = new HashMap();
	//    3    6:new             #28  <Class HashMap>
	//    4    9:dup             
	//    5   10:invokespecial   #29  <Method void HashMap()>
	//    6   13:astore          7
			if(obj != null)
	//*   7   15:aload           8
	//*   8   17:ifnull          45
			{
				obj = ((Object) (getInfo(((Class) (obj)))));
	//    9   20:aload_0         
	//   10   21:aload           8
	//   11   23:invokevirtual   #46  <Method ClassesInfoCache$CallbackInfo getInfo(Class)>
	//   12   26:astore          8
				if(obj != null)
	//*  13   28:aload           8
	//*  14   30:ifnull          45
					((Map) (hashmap)).putAll(((CallbackInfo) (obj)).mHandlerToEvent);
	//   15   33:aload           7
	//   16   35:aload           8
	//   17   37:getfield        #49  <Field Map ClassesInfoCache$CallbackInfo.mHandlerToEvent>
	//   18   40:invokeinterface #55  <Method void Map.putAll(Map)>
			}
			Class aclass[] = class1.getInterfaces();
	//   19   45:aload_1         
	//   20   46:invokevirtual   #59  <Method Class[] Class.getInterfaces()>
	//   21   49:astore          8
			int j = aclass.length;
	//   22   51:aload           8
	//   23   53:arraylength     
	//   24   54:istore          4
			for(int i = 0; i < j; i++)
	//*  25   56:iconst_0        
	//*  26   57:istore_3        
	//*  27   58:iload_3         
	//*  28   59:iload           4
	//*  29   61:icmpge          146
			{
				java.util.Map.Entry entry;
				for(Iterator iterator = getInfo(aclass[i]).mHandlerToEvent.entrySet().iterator(); iterator.hasNext(); verifyAndPutHandler(((Map) (hashmap)), (MethodReference)entry.getKey(), (Lifecycle.Event)entry.getValue(), class1))
	//*  30   64:aload_0         
	//*  31   65:aload           8
	//*  32   67:iload_3         
	//*  33   68:aaload          
	//*  34   69:invokevirtual   #46  <Method ClassesInfoCache$CallbackInfo getInfo(Class)>
	//*  35   72:getfield        #49  <Field Map ClassesInfoCache$CallbackInfo.mHandlerToEvent>
	//*  36   75:invokeinterface #63  <Method Set Map.entrySet()>
	//*  37   80:invokeinterface #69  <Method Iterator Set.iterator()>
	//*  38   85:astore          9
	//*  39   87:aload           9
	//*  40   89:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//*  41   94:ifeq            139
					entry = (java.util.Map.Entry)iterator.next();
	//   42   97:aload           9
	//   43   99:invokeinterface #79  <Method Object Iterator.next()>
	//   44  104:checkcast       #81  <Class java.util.Map$Entry>
	//   45  107:astore          10

	//   46  109:aload_0         
	//   47  110:aload           7
	//   48  112:aload           10
	//   49  114:invokeinterface #84  <Method Object java.util.Map$Entry.getKey()>
	//   50  119:checkcast       #9   <Class ClassesInfoCache$MethodReference>
	//   51  122:aload           10
	//   52  124:invokeinterface #87  <Method Object java.util.Map$Entry.getValue()>
	//   53  129:checkcast       #89  <Class Lifecycle$Event>
	//   54  132:aload_1         
	//   55  133:invokespecial   #93  <Method void verifyAndPutHandler(Map, ClassesInfoCache$MethodReference, Lifecycle$Event, Class)>
			}

	//   56  136:goto            87
	//   57  139:iload_3         
	//   58  140:iconst_1        
	//   59  141:iadd            
	//   60  142:istore_3        
	//*  61  143:goto            58
			if(amethod == null)
	//*  62  146:aload_2         
	//*  63  147:ifnull          153
	//*  64  150:goto            159
				amethod = getDeclaredMethods(class1);
	//   65  153:aload_0         
	//   66  154:aload_1         
	//   67  155:invokespecial   #97  <Method Method[] getDeclaredMethods(Class)>
	//   68  158:astore_2        
			int k = amethod.length;
	//   69  159:aload_2         
	//   70  160:arraylength     
	//   71  161:istore          5
			j = 0;
	//   72  163:iconst_0        
	//   73  164:istore          4
			flag = false;
	//   74  166:iconst_0        
	//   75  167:istore          6
			do
			{
				if(j >= k)
					break label0;
	//   76  169:iload           4
	//   77  171:iload           5
	//   78  173:icmpge          353
				Method method = amethod[j];
	//   79  176:aload_2         
	//   80  177:iload           4
	//   81  179:aaload          
	//   82  180:astore          8
				Object obj1 = ((Object) ((OnLifecycleEvent)method.getAnnotation(android/arch/lifecycle/OnLifecycleEvent)));
	//   83  182:aload           8
	//   84  184:ldc1            #99  <Class OnLifecycleEvent>
	//   85  186:invokevirtual   #105 <Method java.lang.annotation.Annotation Method.getAnnotation(Class)>
	//   86  189:checkcast       #99  <Class OnLifecycleEvent>
	//   87  192:astore          10
				if(obj1 != null)
	//*  88  194:aload           10
	//*  89  196:ifnonnull       202
	//*  90  199:goto            334
				{
					Class aclass1[] = method.getParameterTypes();
	//   91  202:aload           8
	//   92  204:invokevirtual   #108 <Method Class[] Method.getParameterTypes()>
	//   93  207:astore          9
					byte byte0;
					if(aclass1.length > 0)
	//*  94  209:aload           9
	//*  95  211:arraylength     
	//*  96  212:ifle            242
					{
						if(aclass1[0].isAssignableFrom(android/arch/lifecycle/LifecycleOwner))
	//*  97  215:aload           9
	//*  98  217:iconst_0        
	//*  99  218:aaload          
	//* 100  219:ldc1            #110 <Class LifecycleOwner>
	//* 101  221:invokevirtual   #114 <Method boolean Class.isAssignableFrom(Class)>
	//* 102  224:ifeq            232
							byte0 = 1;
	//  103  227:iconst_1        
	//  104  228:istore_3        
						else
	//* 105  229:goto            244
							throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
	//  106  232:new             #116 <Class IllegalArgumentException>
	//  107  235:dup             
	//  108  236:ldc1            #118 <String "invalid parameter type. Must be one and instanceof LifecycleOwner">
	//  109  238:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//  110  241:athrow          
					} else
					{
						byte0 = 0;
	//  111  242:iconst_0        
	//  112  243:istore_3        
					}
					obj1 = ((Object) (((OnLifecycleEvent) (obj1)).value()));
	//  113  244:aload           10
	//  114  246:invokeinterface #125 <Method Lifecycle$Event OnLifecycleEvent.value()>
	//  115  251:astore          10
					if(aclass1.length > 1)
	//* 116  253:aload           9
	//* 117  255:arraylength     
	//* 118  256:iconst_1        
	//* 119  257:icmple          305
						if(aclass1[1].isAssignableFrom(android/arch/lifecycle/Lifecycle$Event))
	//* 120  260:aload           9
	//* 121  262:iconst_1        
	//* 122  263:aaload          
	//* 123  264:ldc1            #89  <Class Lifecycle$Event>
	//* 124  266:invokevirtual   #114 <Method boolean Class.isAssignableFrom(Class)>
	//* 125  269:ifeq            295
						{
							if(obj1 == Lifecycle.Event.ON_ANY)
	//* 126  272:aload           10
	//* 127  274:getstatic       #129 <Field Lifecycle$Event Lifecycle$Event.ON_ANY>
	//* 128  277:if_acmpne       285
								byte0 = 2;
	//  129  280:iconst_2        
	//  130  281:istore_3        
							else
	//* 131  282:goto            305
								throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
	//  132  285:new             #116 <Class IllegalArgumentException>
	//  133  288:dup             
	//  134  289:ldc1            #131 <String "Second arg is supported only for ON_ANY value">
	//  135  291:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//  136  294:athrow          
						} else
						{
							throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
	//  137  295:new             #116 <Class IllegalArgumentException>
	//  138  298:dup             
	//  139  299:ldc1            #133 <String "invalid parameter type. second arg must be an event">
	//  140  301:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//  141  304:athrow          
						}
					if(aclass1.length > 2)
						break;
	//  142  305:aload           9
	//  143  307:arraylength     
	//  144  308:iconst_2        
	//  145  309:icmpgt          343
					verifyAndPutHandler(((Map) (hashmap)), new MethodReference(((int) (byte0)), method), ((Lifecycle.Event) (obj1)), class1);
	//  146  312:aload_0         
	//  147  313:aload           7
	//  148  315:new             #9   <Class ClassesInfoCache$MethodReference>
	//  149  318:dup             
	//  150  319:iload_3         
	//  151  320:aload           8
	//  152  322:invokespecial   #136 <Method void ClassesInfoCache$MethodReference(int, Method)>
	//  153  325:aload           10
	//  154  327:aload_1         
	//  155  328:invokespecial   #93  <Method void verifyAndPutHandler(Map, ClassesInfoCache$MethodReference, Lifecycle$Event, Class)>
					flag = true;
	//  156  331:iconst_1        
	//  157  332:istore          6
				}
				j++;
	//  158  334:iload           4
	//  159  336:iconst_1        
	//  160  337:iadd            
	//  161  338:istore          4
			} while(true);
	//  162  340:goto            169
			throw new IllegalArgumentException("cannot have more than 2 params");
	//  163  343:new             #116 <Class IllegalArgumentException>
	//  164  346:dup             
	//  165  347:ldc1            #138 <String "cannot have more than 2 params">
	//  166  349:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//  167  352:athrow          
		}
		amethod = ((Method []) (new CallbackInfo(((Map) (hashmap)))));
	//  168  353:new             #6   <Class ClassesInfoCache$CallbackInfo>
	//  169  356:dup             
	//  170  357:aload           7
	//  171  359:invokespecial   #140 <Method void ClassesInfoCache$CallbackInfo(Map)>
	//  172  362:astore_2        
		mCallbackMap.put(((Object) (class1)), ((Object) (amethod)));
	//  173  363:aload_0         
	//  174  364:getfield        #31  <Field Map mCallbackMap>
	//  175  367:aload_1         
	//  176  368:aload_2         
	//  177  369:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  178  374:pop             
		mHasLifecycleMethods.put(((Object) (class1)), ((Object) (Boolean.valueOf(flag))));
	//  179  375:aload_0         
	//  180  376:getfield        #33  <Field Map mHasLifecycleMethods>
	//  181  379:aload_1         
	//  182  380:iload           6
	//  183  382:invokestatic    #150 <Method Boolean Boolean.valueOf(boolean)>
	//  184  385:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//  185  390:pop             
		return ((CallbackInfo) (amethod));
	//  186  391:aload_2         
	//  187  392:areturn         
	}

	private Method[] getDeclaredMethods(Class class1)
	{
		try
		{
			class1 = ((Class) (class1.getDeclaredMethods()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #156 <Method Method[] Class.getDeclaredMethods()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*   5    7:astore_1        
		{
			throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", ((Throwable) (class1)));
	//    6    8:new             #116 <Class IllegalArgumentException>
	//    7   11:dup             
	//    8   12:ldc1            #158 <String "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.">
	//    9   14:aload_1         
	//   10   15:invokespecial   #161 <Method void IllegalArgumentException(String, Throwable)>
	//   11   18:athrow          
		}
		return ((Method []) (class1));
	}

	private void verifyAndPutHandler(Map map, MethodReference methodreference, Lifecycle.Event event, Class class1)
	{
		Lifecycle.Event event1 = (Lifecycle.Event)map.get(((Object) (methodreference)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #165 <Method Object Map.get(Object)>
	//    3    7:checkcast       #89  <Class Lifecycle$Event>
	//    4   10:astore          5
		if(event1 != null && event != event1)
	//*   5   12:aload           5
	//*   6   14:ifnull          111
	//*   7   17:aload_3         
	//*   8   18:aload           5
	//*   9   20:if_acmpne       26
	//*  10   23:goto            111
		{
			map = ((Map) (methodreference.mMethod));
	//   11   26:aload_2         
	//   12   27:getfield        #169 <Field Method ClassesInfoCache$MethodReference.mMethod>
	//   13   30:astore_1        
			methodreference = ((MethodReference) (new StringBuilder()));
	//   14   31:new             #171 <Class StringBuilder>
	//   15   34:dup             
	//   16   35:invokespecial   #172 <Method void StringBuilder()>
	//   17   38:astore_2        
			((StringBuilder) (methodreference)).append("Method ");
	//   18   39:aload_2         
	//   19   40:ldc1            #174 <String "Method ">
	//   20   42:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
			((StringBuilder) (methodreference)).append(((Method) (map)).getName());
	//   22   46:aload_2         
	//   23   47:aload_1         
	//   24   48:invokevirtual   #182 <Method String Method.getName()>
	//   25   51:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			((StringBuilder) (methodreference)).append(" in ");
	//   27   55:aload_2         
	//   28   56:ldc1            #184 <String " in ">
	//   29   58:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
			((StringBuilder) (methodreference)).append(class1.getName());
	//   31   62:aload_2         
	//   32   63:aload           4
	//   33   65:invokevirtual   #185 <Method String Class.getName()>
	//   34   68:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
			((StringBuilder) (methodreference)).append(" already declared with different @OnLifecycleEvent value: previous value ");
	//   36   72:aload_2         
	//   37   73:ldc1            #187 <String " already declared with different @OnLifecycleEvent value: previous value ">
	//   38   75:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
			((StringBuilder) (methodreference)).append(((Object) (event1)));
	//   40   79:aload_2         
	//   41   80:aload           5
	//   42   82:invokevirtual   #190 <Method StringBuilder StringBuilder.append(Object)>
	//   43   85:pop             
			((StringBuilder) (methodreference)).append(", new value ");
	//   44   86:aload_2         
	//   45   87:ldc1            #192 <String ", new value ">
	//   46   89:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
			((StringBuilder) (methodreference)).append(((Object) (event)));
	//   48   93:aload_2         
	//   49   94:aload_3         
	//   50   95:invokevirtual   #190 <Method StringBuilder StringBuilder.append(Object)>
	//   51   98:pop             
			throw new IllegalArgumentException(((StringBuilder) (methodreference)).toString());
	//   52   99:new             #116 <Class IllegalArgumentException>
	//   53  102:dup             
	//   54  103:aload_2         
	//   55  104:invokevirtual   #195 <Method String StringBuilder.toString()>
	//   56  107:invokespecial   #121 <Method void IllegalArgumentException(String)>
	//   57  110:athrow          
		}
		if(event1 == null)
	//*  58  111:aload           5
	//*  59  113:ifnonnull       125
			map.put(((Object) (methodreference)), ((Object) (event)));
	//   60  116:aload_1         
	//   61  117:aload_2         
	//   62  118:aload_3         
	//   63  119:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//   64  124:pop             
	//   65  125:return          
	}

	CallbackInfo getInfo(Class class1)
	{
		CallbackInfo callbackinfo = (CallbackInfo)mCallbackMap.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Map mCallbackMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #165 <Method Object Map.get(Object)>
	//    4   10:checkcast       #6   <Class ClassesInfoCache$CallbackInfo>
	//    5   13:astore_2        
		if(callbackinfo != null)
	//*   6   14:aload_2         
	//*   7   15:ifnull          20
			return callbackinfo;
	//    8   18:aload_2         
	//    9   19:areturn         
		else
			return createInfo(class1, ((Method []) (null)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aconst_null     
	//   13   23:invokespecial   #199 <Method ClassesInfoCache$CallbackInfo createInfo(Class, Method[])>
	//   14   26:areturn         
	}

	boolean hasLifecycleMethods(Class class1)
	{
		if(mHasLifecycleMethods.containsKey(((Object) (class1))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Map mHasLifecycleMethods>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #204 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifeq            30
			return ((Boolean)mHasLifecycleMethods.get(((Object) (class1)))).booleanValue();
	//    5   13:aload_0         
	//    6   14:getfield        #33  <Field Map mHasLifecycleMethods>
	//    7   17:aload_1         
	//    8   18:invokeinterface #165 <Method Object Map.get(Object)>
	//    9   23:checkcast       #146 <Class Boolean>
	//   10   26:invokevirtual   #207 <Method boolean Boolean.booleanValue()>
	//   11   29:ireturn         
		Method amethod[] = getDeclaredMethods(class1);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:invokespecial   #97  <Method Method[] getDeclaredMethods(Class)>
	//   15   35:astore          4
		int j = amethod.length;
	//   16   37:aload           4
	//   17   39:arraylength     
	//   18   40:istore_3        
		for(int i = 0; i < j; i++)
	//*  19   41:iconst_0        
	//*  20   42:istore_2        
	//*  21   43:iload_2         
	//*  22   44:iload_3         
	//*  23   45:icmpge          80
			if((OnLifecycleEvent)amethod[i].getAnnotation(android/arch/lifecycle/OnLifecycleEvent) != null)
	//*  24   48:aload           4
	//*  25   50:iload_2         
	//*  26   51:aaload          
	//*  27   52:ldc1            #99  <Class OnLifecycleEvent>
	//*  28   54:invokevirtual   #105 <Method java.lang.annotation.Annotation Method.getAnnotation(Class)>
	//*  29   57:checkcast       #99  <Class OnLifecycleEvent>
	//*  30   60:ifnull          73
			{
				createInfo(class1, amethod);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:aload           4
	//   34   67:invokespecial   #199 <Method ClassesInfoCache$CallbackInfo createInfo(Class, Method[])>
	//   35   70:pop             
				return true;
	//   36   71:iconst_1        
	//   37   72:ireturn         
			}

	//   38   73:iload_2         
	//   39   74:iconst_1        
	//   40   75:iadd            
	//   41   76:istore_2        
	//*  42   77:goto            43
		mHasLifecycleMethods.put(((Object) (class1)), ((Object) (Boolean.valueOf(false))));
	//   43   80:aload_0         
	//   44   81:getfield        #33  <Field Map mHasLifecycleMethods>
	//   45   84:aload_1         
	//   46   85:iconst_0        
	//   47   86:invokestatic    #150 <Method Boolean Boolean.valueOf(boolean)>
	//   48   89:invokeinterface #144 <Method Object Map.put(Object, Object)>
	//   49   94:pop             
		return false;
	//   50   95:iconst_0        
	//   51   96:ireturn         
	}

	static ClassesInfoCache sInstance = new ClassesInfoCache();
	private final Map mCallbackMap = new HashMap();
	private final Map mHasLifecycleMethods = new HashMap();

	static 
	{
	//    0    0:new             #2   <Class ClassesInfoCache>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ClassesInfoCache()>
	//    3    7:putstatic       #24  <Field ClassesInfoCache sInstance>
	//*   4   10:return          
	}
}
