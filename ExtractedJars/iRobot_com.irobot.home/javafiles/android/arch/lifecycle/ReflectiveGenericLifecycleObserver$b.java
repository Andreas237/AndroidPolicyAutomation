// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import java.lang.reflect.Method;

// Referenced classes of package android.arch.lifecycle:
//			ReflectiveGenericLifecycleObserver

static class ReflectiveGenericLifecycleObserver$b
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
	//*   8   12:invokevirtual   #32  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #32  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((ReflectiveGenericLifecycleObserver$b)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ReflectiveGenericLifecycleObserver$b>
	//   16   28:astore_1        
			return a == ((ReflectiveGenericLifecycleObserver$b) (obj)).a && b.getName().equals(((Object) (((ReflectiveGenericLifecycleObserver$b) (obj)).b.getName())));
	//   17   29:aload_0         
	//   18   30:getfield        #17  <Field int a>
	//   19   33:aload_1         
	//   20   34:getfield        #17  <Field int a>
	//   21   37:icmpne          62
	//   22   40:aload_0         
	//   23   41:getfield        #19  <Field Method b>
	//   24   44:invokevirtual   #36  <Method String Method.getName()>
	//   25   47:aload_1         
	//   26   48:getfield        #19  <Field Method b>
	//   27   51:invokevirtual   #36  <Method String Method.getName()>
	//   28   54:invokevirtual   #40  <Method boolean String.equals(Object)>
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
		return a * 31 + b.getName().hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int a>
	//    2    4:bipush          31
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #19  <Field Method b>
	//    6   11:invokevirtual   #36  <Method String Method.getName()>
	//    7   14:invokevirtual   #44  <Method int String.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	final int a;
	final Method b;

	ReflectiveGenericLifecycleObserver$b(int i, Method method)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int a>
		b = method;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Method b>
		b.setAccessible(true);
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field Method b>
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #25  <Method void Method.setAccessible(boolean)>
	//   12   22:return          
	}
}
