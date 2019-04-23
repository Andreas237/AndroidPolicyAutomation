// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			auq

final class aux
	implements Comparable, java.util.Map.Entry
{

	aux(auq auq1, Comparable comparable, Object obj)
	{
		c = auq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field auq c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		a = comparable;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Comparable a>
		b = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Object b>
	//   11   19:return          
	}

	aux(auq auq1, java.util.Map.Entry entry)
	{
		this(auq1, (Comparable)entry.getKey(), entry.getValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #31  <Method Object java.util.Map$Entry.getKey()>
	//    4    8:checkcast       #6   <Class Comparable>
	//    5   11:aload_2         
	//    6   12:invokeinterface #34  <Method Object java.util.Map$Entry.getValue()>
	//    7   17:invokespecial   #36  <Method void aux(auq, Comparable, Object)>
	//    8   20:return          
	}

	private static boolean a(Object obj, Object obj1)
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
	//   10   14:invokevirtual   #41  <Method boolean Object.equals(Object)>
	//   11   17:ireturn         
	}

	public final int compareTo(Object obj)
	{
		obj = ((Object) ((aux)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class aux>
	//    2    4:astore_1        
		return ((Comparable)getKey()).compareTo(((Object) ((Comparable)((aux) (obj)).getKey())));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #44  <Method Object getKey()>
	//    5    9:checkcast       #6   <Class Comparable>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #44  <Method Object getKey()>
	//    8   16:checkcast       #6   <Class Comparable>
	//    9   19:invokeinterface #46  <Method int Comparable.compareTo(Object)>
	//   10   24:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof java.util.Map.Entry))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #8   <Class java.util.Map$Entry>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((java.util.Map.Entry)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #8   <Class java.util.Map$Entry>
	//   12   20:astore_1        
		return a(((Object) (a)), ((java.util.Map.Entry) (obj)).getKey()) && a(b, ((java.util.Map.Entry) (obj)).getValue());
	//   13   21:aload_0         
	//   14   22:getfield        #23  <Field Comparable a>
	//   15   25:aload_1         
	//   16   26:invokeinterface #31  <Method Object java.util.Map$Entry.getKey()>
	//   17   31:invokestatic    #48  <Method boolean a(Object, Object)>
	//   18   34:ifeq            55
	//   19   37:aload_0         
	//   20   38:getfield        #25  <Field Object b>
	//   21   41:aload_1         
	//   22   42:invokeinterface #34  <Method Object java.util.Map$Entry.getValue()>
	//   23   47:invokestatic    #48  <Method boolean a(Object, Object)>
	//   24   50:ifeq            55
	//   25   53:iconst_1        
	//   26   54:ireturn         
	//   27   55:iconst_0        
	//   28   56:ireturn         
	}

	public final Object getKey()
	{
		return ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Comparable a>
	//    2    4:areturn         
	}

	public final Object getValue()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object b>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Comparable a>
	//    2    4:astore_3        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int i;
		if(obj == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       16
			i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_1        
		else
	//*   9   13:goto            21
			i = obj.hashCode();
	//   10   16:aload_3         
	//   11   17:invokevirtual   #52  <Method int Object.hashCode()>
	//   12   20:istore_1        
		obj = b;
	//   13   21:aload_0         
	//   14   22:getfield        #25  <Field Object b>
	//   15   25:astore_3        
		if(obj != null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       33
	//*  18   30:goto            38
			j = obj.hashCode();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #52  <Method int Object.hashCode()>
	//   21   37:istore_2        
		return i ^ j;
	//   22   38:iload_1         
	//   23   39:iload_2         
	//   24   40:ixor            
	//   25   41:ireturn         
	}

	public final Object setValue(Object obj)
	{
		auq.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field auq c>
	//    2    4:invokestatic    #59  <Method void auq.a(auq)>
		Object obj1 = b;
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field Object b>
	//    5   11:astore_2        
		b = obj;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #25  <Field Object b>
		return obj1;
	//    9   17:aload_2         
	//   10   18:areturn         
	}

	public final String toString()
	{
		String s = String.valueOf(((Object) (a)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Comparable a>
	//    2    4:invokestatic    #67  <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		String s1 = String.valueOf(b);
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field Object b>
	//    6   12:invokestatic    #67  <Method String String.valueOf(Object)>
	//    7   15:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 1 + String.valueOf(((Object) (s1))).length());
	//    8   16:new             #69  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokestatic    #67  <Method String String.valueOf(Object)>
	//   12   24:invokevirtual   #72  <Method int String.length()>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:aload_2         
	//   16   30:invokestatic    #67  <Method String String.valueOf(Object)>
	//   17   33:invokevirtual   #72  <Method int String.length()>
	//   18   36:iadd            
	//   19   37:invokespecial   #75  <Method void StringBuilder(int)>
	//   20   40:astore_3        
		stringbuilder.append(s);
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
		stringbuilder.append("=");
	//   25   47:aload_3         
	//   26   48:ldc1            #81  <String "=">
	//   27   50:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
		stringbuilder.append(s1);
	//   29   54:aload_3         
	//   30   55:aload_2         
	//   31   56:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
		return stringbuilder.toString();
	//   33   60:aload_3         
	//   34   61:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   35   64:areturn         
	}

	private final Comparable a;
	private Object b;
	private final auq c;
}
