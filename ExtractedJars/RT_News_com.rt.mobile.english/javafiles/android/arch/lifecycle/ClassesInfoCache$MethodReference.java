// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.arch.lifecycle:
//			ClassesInfoCache, LifecycleOwner

static class ClassesInfoCache$MethodReference
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
			obj = ((Object) ((ClassesInfoCache$MethodReference)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ClassesInfoCache$MethodReference>
	//   16   28:astore_1        
			return mCallType == ((ClassesInfoCache$MethodReference) (obj)).mCallType && mMethod.getName().equals(((Object) (((ClassesInfoCache$MethodReference) (obj)).mMethod.getName())));
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
	//	               0 72
	//	               1 54
	//	               2 32;
	//    2    4:tableswitch     0 2: default 111
	//	               0 72
	//	               1 54
	//	               2 32
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

	ClassesInfoCache$MethodReference(int i, Method method)
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
