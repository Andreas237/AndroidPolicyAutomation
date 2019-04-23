// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwo

final class zzwv
	implements Comparable, java.util.Map.Entry
{

	zzwv(zzwo zzwo1, Comparable comparable, Object obj)
	{
		zzcby = zzwo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzwo zzcby>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		zzccb = comparable;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Comparable zzccb>
		value = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field Object value>
	//   11   19:return          
	}

	zzwv(zzwo zzwo1, java.util.Map.Entry entry)
	{
		this(zzwo1, (Comparable)entry.getKey(), entry.getValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #36  <Method Object java.util.Map$Entry.getKey()>
	//    4    8:checkcast       #7   <Class Comparable>
	//    5   11:aload_2         
	//    6   12:invokeinterface #39  <Method Object java.util.Map$Entry.getValue()>
	//    7   17:invokespecial   #41  <Method void zzwv(zzwo, Comparable, Object)>
	//    8   20:return          
	}

	private static boolean equals(Object obj, Object obj1)
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
	//   10   14:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//   11   17:ireturn         
	}

	public final int compareTo(Object obj)
	{
		obj = ((Object) ((zzwv)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class zzwv>
	//    2    4:astore_1        
		return ((Comparable)getKey()).compareTo(((Object) ((Comparable)((zzwv) (obj)).getKey())));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #50  <Method Object getKey()>
	//    5    9:checkcast       #7   <Class Comparable>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #50  <Method Object getKey()>
	//    8   16:checkcast       #7   <Class Comparable>
	//    9   19:invokeinterface #52  <Method int Comparable.compareTo(Object)>
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
	//*   6    8:instanceof      #9   <Class java.util.Map$Entry>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((java.util.Map.Entry)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #9   <Class java.util.Map$Entry>
	//   12   20:astore_1        
		return equals(((Object) (zzccb)), ((java.util.Map.Entry) (obj)).getKey()) && equals(value, ((java.util.Map.Entry) (obj)).getValue());
	//   13   21:aload_0         
	//   14   22:getfield        #26  <Field Comparable zzccb>
	//   15   25:aload_1         
	//   16   26:invokeinterface #36  <Method Object java.util.Map$Entry.getKey()>
	//   17   31:invokestatic    #54  <Method boolean equals(Object, Object)>
	//   18   34:ifeq            55
	//   19   37:aload_0         
	//   20   38:getfield        #28  <Field Object value>
	//   21   41:aload_1         
	//   22   42:invokeinterface #39  <Method Object java.util.Map$Entry.getValue()>
	//   23   47:invokestatic    #54  <Method boolean equals(Object, Object)>
	//   24   50:ifeq            55
	//   25   53:iconst_1        
	//   26   54:ireturn         
	//   27   55:iconst_0        
	//   28   56:ireturn         
	}

	public final Object getKey()
	{
		return ((Object) (zzccb));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Comparable zzccb>
	//    2    4:areturn         
	}

	public final Object getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object value>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		Object obj = ((Object) (zzccb));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Comparable zzccb>
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
	//   11   17:invokevirtual   #59  <Method int Object.hashCode()>
	//   12   20:istore_1        
		obj = value;
	//   13   21:aload_0         
	//   14   22:getfield        #28  <Field Object value>
	//   15   25:astore_3        
		if(obj != null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       33
	//*  18   30:goto            38
			j = obj.hashCode();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #59  <Method int Object.hashCode()>
	//   21   37:istore_2        
		return i ^ j;
	//   22   38:iload_1         
	//   23   39:iload_2         
	//   24   40:ixor            
	//   25   41:ireturn         
	}

	public final Object setValue(Object obj)
	{
		zzwo.zza(zzcby);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzwo zzcby>
	//    2    4:invokestatic    #67  <Method void zzwo.zza(zzwo)>
		Object obj1 = value;
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Object value>
	//    5   11:astore_2        
		value = obj;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #28  <Field Object value>
		return obj1;
	//    9   17:aload_2         
	//   10   18:areturn         
	}

	public final String toString()
	{
		String s = String.valueOf(((Object) (zzccb)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Comparable zzccb>
	//    2    4:invokestatic    #76  <Method String String.valueOf(Object)>
	//    3    7:astore_1        
		String s1 = String.valueOf(value);
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field Object value>
	//    6   12:invokestatic    #76  <Method String String.valueOf(Object)>
	//    7   15:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 1 + String.valueOf(((Object) (s1))).length());
	//    8   16:new             #78  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokestatic    #76  <Method String String.valueOf(Object)>
	//   12   24:invokevirtual   #81  <Method int String.length()>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:aload_2         
	//   16   30:invokestatic    #76  <Method String String.valueOf(Object)>
	//   17   33:invokevirtual   #81  <Method int String.length()>
	//   18   36:iadd            
	//   19   37:invokespecial   #84  <Method void StringBuilder(int)>
	//   20   40:astore_3        
		stringbuilder.append(s);
	//   21   41:aload_3         
	//   22   42:aload_1         
	//   23   43:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
		stringbuilder.append("=");
	//   25   47:aload_3         
	//   26   48:ldc1            #90  <String "=">
	//   27   50:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:pop             
		stringbuilder.append(s1);
	//   29   54:aload_3         
	//   30   55:aload_2         
	//   31   56:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   32   59:pop             
		return stringbuilder.toString();
	//   33   60:aload_3         
	//   34   61:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   35   64:areturn         
	}

	private Object value;
	private final zzwo zzcby;
	private final Comparable zzccb;
}
