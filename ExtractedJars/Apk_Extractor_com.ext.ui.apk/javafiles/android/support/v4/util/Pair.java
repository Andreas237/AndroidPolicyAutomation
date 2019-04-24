// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


public class Pair
{

	public Pair(Object obj, Object obj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		first = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Object first>
		second = obj1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Object second>
	//    8   14:return          
	}

	public static Pair create(Object obj, Object obj1)
	{
		return new Pair(obj, obj1);
	//    0    0:new             #2   <Class Pair>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #26  <Method void Pair(Object, Object)>
	//    5    9:areturn         
	}

	private static boolean objectsEqual(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       17
	//    3    5:aload_0         
	//    4    6:ifnull          19
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #33  <Method boolean Object.equals(Object)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof Pair)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class Pair>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_1         
	//*   6   10:checkcast       #2   <Class Pair>
	//*   7   13:astore_1        
			if(objectsEqual(((Pair) (obj = ((Object) ((Pair)obj)))).first, first) && objectsEqual(((Pair) (obj)).second, second))
	//*   8   14:aload_1         
	//*   9   15:getfield        #17  <Field Object first>
	//*  10   18:aload_0         
	//*  11   19:getfield        #17  <Field Object first>
	//*  12   22:invokestatic    #35  <Method boolean objectsEqual(Object, Object)>
	//*  13   25:ifeq            7
	//*  14   28:aload_1         
	//*  15   29:getfield        #19  <Field Object second>
	//*  16   32:aload_0         
	//*  17   33:getfield        #19  <Field Object second>
	//*  18   36:invokestatic    #35  <Method boolean objectsEqual(Object, Object)>
	//*  19   39:ifeq            7
				return true;
	//   20   42:iconst_1        
	//   21   43:ireturn         
		return false;
	}

	public int hashCode()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		if(first == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #17  <Field Object first>
	//*   4    6:ifnonnull       22
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		else
	//*   7   11:aload_0         
	//*   8   12:getfield        #19  <Field Object second>
	//*   9   15:ifnonnull       33
	//*  10   18:iload_1         
	//*  11   19:iload_2         
	//*  12   20:ixor            
	//*  13   21:ireturn         
			i = first.hashCode();
	//   14   22:aload_0         
	//   15   23:getfield        #17  <Field Object first>
	//   16   26:invokevirtual   #39  <Method int Object.hashCode()>
	//   17   29:istore_1        
		if(second != null)
	//*  18   30:goto            11
			j = second.hashCode();
	//   19   33:aload_0         
	//   20   34:getfield        #19  <Field Object second>
	//   21   37:invokevirtual   #39  <Method int Object.hashCode()>
	//   22   40:istore_2        
		return ((int) (i ^ j));
	//*  23   41:goto            18
	}

	public String toString()
	{
		return (new StringBuilder()).append("Pair{").append(String.valueOf(first)).append(" ").append(String.valueOf(second)).append("}").toString();
	//    0    0:new             #43  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void StringBuilder()>
	//    3    7:ldc1            #46  <String "Pair{">
	//    4    9:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #17  <Field Object first>
	//    7   16:invokestatic    #56  <Method String String.valueOf(Object)>
	//    8   19:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #58  <String " ">
	//   10   24:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #19  <Field Object second>
	//   13   31:invokestatic    #56  <Method String String.valueOf(Object)>
	//   14   34:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   15   37:ldc1            #60  <String "}">
	//   16   39:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   17   42:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   18   45:areturn         
	}

	public final Object first;
	public final Object second;
}
