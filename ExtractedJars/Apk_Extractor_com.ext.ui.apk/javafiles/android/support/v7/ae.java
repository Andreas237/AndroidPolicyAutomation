// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.util.Arrays;
import java.util.List;

// Referenced classes of package android.support.v7:
//			t

public class ae
{

	private ae()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static Throwable a(Throwable throwable)
	{
		return a(throwable, ((Class) (android/support/v7/ae)).getName());
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class ae>
	//    2    3:invokevirtual   #17  <Method String Class.getName()>
	//    3    6:invokestatic    #20  <Method Throwable a(Throwable, String)>
	//    4    9:areturn         
	}

	static Throwable a(Throwable throwable, String s)
	{
		StackTraceElement astacktraceelement[] = throwable.getStackTrace();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method StackTraceElement[] Throwable.getStackTrace()>
	//    2    4:astore          5
		int k = astacktraceelement.length;
	//    3    6:aload           5
	//    4    8:arraylength     
	//    5    9:istore          4
		int j = -1;
	//    6   11:iconst_m1       
	//    7   12:istore_3        
		for(int i = 0; i < k; i++)
	//*   8   13:iconst_0        
	//*   9   14:istore_2        
	//*  10   15:iload_2         
	//*  11   16:iload           4
	//*  12   18:icmpge          44
			if(s.equals(((Object) (astacktraceelement[i].getClassName()))))
	//*  13   21:aload_1         
	//*  14   22:aload           5
	//*  15   24:iload_2         
	//*  16   25:aaload          
	//*  17   26:invokevirtual   #33  <Method String StackTraceElement.getClassName()>
	//*  18   29:invokevirtual   #39  <Method boolean String.equals(Object)>
	//*  19   32:ifeq            37
				j = i;
	//   20   35:iload_2         
	//   21   36:istore_3        

	//   22   37:iload_2         
	//   23   38:iconst_1        
	//   24   39:iadd            
	//   25   40:istore_2        
	//*  26   41:goto            15
		s = ((String) (Arrays.asList(((Object []) (astacktraceelement))).subList(j + 1, k)));
	//   27   44:aload           5
	//   28   46:invokestatic    #45  <Method List Arrays.asList(Object[])>
	//   29   49:iload_3         
	//   30   50:iconst_1        
	//   31   51:iadd            
	//   32   52:iload           4
	//   33   54:invokeinterface #51  <Method List List.subList(int, int)>
	//   34   59:astore_1        
		throwable.setStackTrace((StackTraceElement[])((List) (s)).toArray(((Object []) (new StackTraceElement[((List) (s)).size()]))));
	//   35   60:aload_0         
	//   36   61:aload_1         
	//   37   62:aload_1         
	//   38   63:invokeinterface #55  <Method int List.size()>
	//   39   68:anewarray       StackTraceElement[]
	//   40   71:invokeinterface #59  <Method Object[] List.toArray(Object[])>
	//   41   76:checkcast       #61  <Class StackTraceElement[]>
	//   42   79:invokevirtual   #65  <Method void Throwable.setStackTrace(StackTraceElement[])>
		return throwable;
	//   43   82:aload_0         
	//   44   83:areturn         
	}

	public static void a()
	{
		throw (t)a(((Throwable) (new t())));
	//    0    0:new             #68  <Class t>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void t()>
	//    3    7:invokestatic    #71  <Method Throwable a(Throwable)>
	//    4   10:checkcast       #68  <Class t>
	//    5   13:athrow          
	}

	public static void a(Object obj, String s)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       37
			throw (IllegalStateException)a(((Throwable) (new IllegalStateException((new StringBuilder()).append(s).append(" must not be null").toString()))));
	//    2    4:new             #74  <Class IllegalStateException>
	//    3    7:dup             
	//    4    8:new             #76  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #77  <Method void StringBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #83  <String " must not be null">
	//   10   21:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   12   27:invokespecial   #89  <Method void IllegalStateException(String)>
	//   13   30:invokestatic    #71  <Method Throwable a(Throwable)>
	//   14   33:checkcast       #74  <Class IllegalStateException>
	//   15   36:athrow          
		else
			return;
	//   16   37:return          
	}

	private static void a(String s)
	{
		Object obj = ((Object) (Thread.currentThread().getStackTrace()[3]));
	//    0    0:invokestatic    #95  <Method Thread Thread.currentThread()>
	//    1    3:invokevirtual   #96  <Method StackTraceElement[] Thread.getStackTrace()>
	//    2    6:iconst_3        
	//    3    7:aaload          
	//    4    8:astore_2        
		String s1 = ((StackTraceElement) (obj)).getClassName();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #33  <Method String StackTraceElement.getClassName()>
	//    7   13:astore_1        
		obj = ((Object) (((StackTraceElement) (obj)).getMethodName()));
	//    8   14:aload_2         
	//    9   15:invokevirtual   #99  <Method String StackTraceElement.getMethodName()>
	//   10   18:astore_2        
		throw (IllegalArgumentException)a(((Throwable) (new IllegalArgumentException((new StringBuilder()).append("Parameter specified as non-null is null: method ").append(s1).append(".").append(((String) (obj))).append(", parameter ").append(s).toString()))));
	//   11   19:new             #101 <Class IllegalArgumentException>
	//   12   22:dup             
	//   13   23:new             #76  <Class StringBuilder>
	//   14   26:dup             
	//   15   27:invokespecial   #77  <Method void StringBuilder()>
	//   16   30:ldc1            #103 <String "Parameter specified as non-null is null: method ">
	//   17   32:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:aload_1         
	//   19   36:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:ldc1            #105 <String ".">
	//   21   41:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:aload_2         
	//   23   45:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:ldc1            #107 <String ", parameter ">
	//   25   50:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:aload_0         
	//   27   54:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   29   60:invokespecial   #108 <Method void IllegalArgumentException(String)>
	//   30   63:invokestatic    #71  <Method Throwable a(Throwable)>
	//   31   66:checkcast       #101 <Class IllegalArgumentException>
	//   32   69:athrow          
	}

	public static boolean a(Object obj, Object obj1)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return obj1 == null;
	//    2    4:aload_1         
	//    3    5:ifnonnull       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
		else
			return obj.equals(obj1);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #110 <Method boolean Object.equals(Object)>
	//   11   17:ireturn         
	}

	public static void b(Object obj, String s)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			a(s);
	//    2    4:aload_1         
	//    3    5:invokestatic    #113 <Method void a(String)>
	//    4    8:return          
	}
}
