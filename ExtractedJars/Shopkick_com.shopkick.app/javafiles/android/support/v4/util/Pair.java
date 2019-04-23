// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


// Referenced classes of package android.support.v4.util:
//			ObjectsCompat

public class Pair
{

	public Pair(Object obj, Object obj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		first = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Object first>
		second = obj1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Object second>
	//    8   14:return          
	}

	public static Pair create(Object obj, Object obj1)
	{
		return new Pair(obj, obj1);
	//    0    0:new             #2   <Class Pair>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #29  <Method void Pair(Object, Object)>
	//    5    9:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof Pair;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class Pair>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((Pair)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class Pair>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(ObjectsCompat.equals(((Pair) (obj)).first, first))
	//*  14   20:aload_1         
	//*  15   21:getfield        #18  <Field Object first>
	//*  16   24:aload_0         
	//*  17   25:getfield        #18  <Field Object first>
	//*  18   28:invokestatic    #38  <Method boolean ObjectsCompat.equals(Object, Object)>
	//*  19   31:ifeq            52
		{
			flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
			if(ObjectsCompat.equals(((Pair) (obj)).second, second))
	//*  22   36:aload_1         
	//*  23   37:getfield        #20  <Field Object second>
	//*  24   40:aload_0         
	//*  25   41:getfield        #20  <Field Object second>
	//*  26   44:invokestatic    #38  <Method boolean ObjectsCompat.equals(Object, Object)>
	//*  27   47:ifeq            52
				flag = true;
	//   28   50:iconst_1        
	//   29   51:istore_2        
		}
		return flag;
	//   30   52:iload_2         
	//   31   53:ireturn         
	}

	public int hashCode()
	{
		Object obj = first;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object first>
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
	//   11   17:invokevirtual   #42  <Method int Object.hashCode()>
	//   12   20:istore_1        
		obj = second;
	//   13   21:aload_0         
	//   14   22:getfield        #20  <Field Object second>
	//   15   25:astore_3        
		if(obj != null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       33
	//*  18   30:goto            38
			j = obj.hashCode();
	//   19   33:aload_3         
	//   20   34:invokevirtual   #42  <Method int Object.hashCode()>
	//   21   37:istore_2        
		return i ^ j;
	//   22   38:iload_1         
	//   23   39:iload_2         
	//   24   40:ixor            
	//   25   41:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #46  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Pair{");
	//    4    8:aload_1         
	//    5    9:ldc1            #49  <String "Pair{">
	//    6   11:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.valueOf(first));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #18  <Field Object first>
	//   11   20:invokestatic    #59  <Method String String.valueOf(Object)>
	//   12   23:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" ");
	//   14   27:aload_1         
	//   15   28:ldc1            #61  <String " ">
	//   16   30:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(String.valueOf(second));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #20  <Field Object second>
	//   21   39:invokestatic    #59  <Method String String.valueOf(Object)>
	//   22   42:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder.append("}");
	//   24   46:aload_1         
	//   25   47:ldc1            #63  <String "}">
	//   26   49:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		return stringbuilder.toString();
	//   28   53:aload_1         
	//   29   54:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   30   57:areturn         
	}

	public final Object first;
	public final Object second;
}
