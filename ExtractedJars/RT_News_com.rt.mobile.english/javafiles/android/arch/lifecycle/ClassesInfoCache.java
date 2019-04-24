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
			return 31 * mCallType + mMethod.getName().hashCode();
		//    0    0:bipush          31
		//    1    2:aload_0         
		//    2    3:getfield        #18  <Field int mCallType>
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
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #35  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void HashMap()>
	//    6   12:putfield        #38  <Field Map mCallbackMap>
	//    7   15:aload_0         
	//    8   16:new             #35  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #36  <Method void HashMap()>
	//   11   23:putfield        #40  <Field Map mHasLifecycleMethods>
	//   12   26:return          
	}

	private CallbackInfo createInfo(Class class1, Method amethod[])
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #45  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #47  <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #52  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private Method[] getDeclaredMethods(Class class1)
	{
		try
		{
			class1 = ((Class) (class1.getDeclaredMethods()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #62  <Method Method[] Class.getDeclaredMethods()>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*   5    7:astore_1        
		{
			throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", ((Throwable) (class1)));
	//    6    8:new             #64  <Class IllegalArgumentException>
	//    7   11:dup             
	//    8   12:ldc1            #66  <String "The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.">
	//    9   14:aload_1         
	//   10   15:invokespecial   #69  <Method void IllegalArgumentException(String, Throwable)>
	//   11   18:athrow          
		}
		return ((Method []) (class1));
	}

	private void verifyAndPutHandler(Map map, MethodReference methodreference, Lifecycle.Event event, Class class1)
	{
		Lifecycle.Event event1 = (Lifecycle.Event)map.get(((Object) (methodreference)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #77  <Method Object Map.get(Object)>
	//    3    7:checkcast       #79  <Class Lifecycle$Event>
	//    4   10:astore          5
		if(event1 != null && event != event1)
	//*   5   12:aload           5
	//*   6   14:ifnull          115
	//*   7   17:aload_3         
	//*   8   18:aload           5
	//*   9   20:if_acmpeq       115
		{
			map = ((Map) (methodreference.mMethod));
	//   10   23:aload_2         
	//   11   24:getfield        #83  <Field Method ClassesInfoCache$MethodReference.mMethod>
	//   12   27:astore_1        
			methodreference = ((MethodReference) (new StringBuilder()));
	//   13   28:new             #85  <Class StringBuilder>
	//   14   31:dup             
	//   15   32:invokespecial   #86  <Method void StringBuilder()>
	//   16   35:astore_2        
			((StringBuilder) (methodreference)).append("Method ");
	//   17   36:aload_2         
	//   18   37:ldc1            #88  <String "Method ">
	//   19   39:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
			((StringBuilder) (methodreference)).append(((Method) (map)).getName());
	//   21   43:aload_2         
	//   22   44:aload_1         
	//   23   45:invokevirtual   #98  <Method String Method.getName()>
	//   24   48:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			((StringBuilder) (methodreference)).append(" in ");
	//   26   52:aload_2         
	//   27   53:ldc1            #100 <String " in ">
	//   28   55:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			((StringBuilder) (methodreference)).append(class1.getName());
	//   30   59:aload_2         
	//   31   60:aload           4
	//   32   62:invokevirtual   #101 <Method String Class.getName()>
	//   33   65:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
			((StringBuilder) (methodreference)).append(" already declared with different @OnLifecycleEvent value: previous");
	//   35   69:aload_2         
	//   36   70:ldc1            #103 <String " already declared with different @OnLifecycleEvent value: previous">
	//   37   72:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   38   75:pop             
			((StringBuilder) (methodreference)).append(" value ");
	//   39   76:aload_2         
	//   40   77:ldc1            #105 <String " value ">
	//   41   79:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   42   82:pop             
			((StringBuilder) (methodreference)).append(((Object) (event1)));
	//   43   83:aload_2         
	//   44   84:aload           5
	//   45   86:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   46   89:pop             
			((StringBuilder) (methodreference)).append(", new value ");
	//   47   90:aload_2         
	//   48   91:ldc1            #110 <String ", new value ">
	//   49   93:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   50   96:pop             
			((StringBuilder) (methodreference)).append(((Object) (event)));
	//   51   97:aload_2         
	//   52   98:aload_3         
	//   53   99:invokevirtual   #108 <Method StringBuilder StringBuilder.append(Object)>
	//   54  102:pop             
			throw new IllegalArgumentException(((StringBuilder) (methodreference)).toString());
	//   55  103:new             #64  <Class IllegalArgumentException>
	//   56  106:dup             
	//   57  107:aload_2         
	//   58  108:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   59  111:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   60  114:athrow          
		}
		if(event1 == null)
	//*  61  115:aload           5
	//*  62  117:ifnonnull       129
			map.put(((Object) (methodreference)), ((Object) (event)));
	//   63  120:aload_1         
	//   64  121:aload_2         
	//   65  122:aload_3         
	//   66  123:invokeinterface #118 <Method Object Map.put(Object, Object)>
	//   67  128:pop             
	//   68  129:return          
	}

	CallbackInfo getInfo(Class class1)
	{
		CallbackInfo callbackinfo = (CallbackInfo)mCallbackMap.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Map mCallbackMap>
	//    2    4:aload_1         
	//    3    5:invokeinterface #77  <Method Object Map.get(Object)>
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
	//   13   23:invokespecial   #124 <Method ClassesInfoCache$CallbackInfo createInfo(Class, Method[])>
	//   14   26:areturn         
	}

	boolean hasLifecycleMethods(Class class1)
	{
		if(mHasLifecycleMethods.containsKey(((Object) (class1))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Map mHasLifecycleMethods>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #130 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifeq            30
			return ((Boolean)mHasLifecycleMethods.get(((Object) (class1)))).booleanValue();
	//    5   13:aload_0         
	//    6   14:getfield        #40  <Field Map mHasLifecycleMethods>
	//    7   17:aload_1         
	//    8   18:invokeinterface #77  <Method Object Map.get(Object)>
	//    9   23:checkcast       #132 <Class Boolean>
	//   10   26:invokevirtual   #136 <Method boolean Boolean.booleanValue()>
	//   11   29:ireturn         
		Method amethod[] = getDeclaredMethods(class1);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:invokespecial   #138 <Method Method[] getDeclaredMethods(Class)>
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
	//*  27   52:ldc1            #140 <Class OnLifecycleEvent>
	//*  28   54:invokevirtual   #144 <Method java.lang.annotation.Annotation Method.getAnnotation(Class)>
	//*  29   57:checkcast       #140 <Class OnLifecycleEvent>
	//*  30   60:ifnull          73
			{
				createInfo(class1, amethod);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:aload           4
	//   34   67:invokespecial   #124 <Method ClassesInfoCache$CallbackInfo createInfo(Class, Method[])>
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
	//   44   81:getfield        #40  <Field Map mHasLifecycleMethods>
	//   45   84:aload_1         
	//   46   85:iconst_0        
	//   47   86:invokestatic    #148 <Method Boolean Boolean.valueOf(boolean)>
	//   48   89:invokeinterface #118 <Method Object Map.put(Object, Object)>
	//   49   94:pop             
		return false;
	//   50   95:iconst_0        
	//   51   96:ireturn         
	}

	private static final int CALL_TYPE_NO_ARG = 0;
	private static final int CALL_TYPE_PROVIDER = 1;
	private static final int CALL_TYPE_PROVIDER_WITH_EVENT = 2;
	static ClassesInfoCache sInstance = new ClassesInfoCache();
	private final Map mCallbackMap = new HashMap();
	private final Map mHasLifecycleMethods = new HashMap();

	static 
	{
	//    0    0:new             #2   <Class ClassesInfoCache>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void ClassesInfoCache()>
	//    3    7:putstatic       #31  <Field ClassesInfoCache sInstance>
	//*   4   10:return          
	}
}
