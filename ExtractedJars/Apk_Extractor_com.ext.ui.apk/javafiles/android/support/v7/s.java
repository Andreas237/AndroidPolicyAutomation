// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import java.io.Serializable;
import java.util.*;

// Referenced classes of package android.support.v7:
//			ae, r, aa

public final class s
	implements Serializable, List, RandomAccess
{

	private s()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public int a()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Void a(int i)
	{
		throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("Empty list doesn't contain element at index ").append(i).append('.').toString());
	//    0    0:new             #26  <Class IndexOutOfBoundsException>
	//    1    3:dup             
	//    2    4:new             #28  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #29  <Method void StringBuilder()>
	//    5   11:ldc1            #31  <String "Empty list doesn't contain element at index ">
	//    6   13:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:iload_1         
	//    8   17:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//    9   20:bipush          46
	//   10   22:invokevirtual   #41  <Method StringBuilder StringBuilder.append(char)>
	//   11   25:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   12   28:invokespecial   #48  <Method void IndexOutOfBoundsException(String)>
	//   13   31:checkcast       #50  <Class Throwable>
	//   14   34:athrow          
	}

	public boolean a(Void void1)
	{
		ae.b(((Object) (void1)), "element");
	//    0    0:aload_1         
	//    1    1:ldc1            #54  <String "element">
	//    2    3:invokestatic    #60  <Method void ae.b(Object, String)>
		return false;
	//    3    6:iconst_0        
	//    4    7:ireturn         
	}

	public void add(int i, Object obj)
	{
		throw new UnsupportedOperationException("Operation is not supported for read-only collection");
	//    0    0:new             #65  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "Operation is not supported for read-only collection">
	//    3    6:invokespecial   #68  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean add(Object obj)
	{
		throw new UnsupportedOperationException("Operation is not supported for read-only collection");
	//    0    0:new             #65  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "Operation is not supported for read-only collection">
	//    3    6:invokespecial   #68  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean addAll(int i, Collection collection)
	{
		throw new UnsupportedOperationException("Operation is not supported for read-only collection");
	//    0    0:new             #65  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "Operation is not supported for read-only collection">
	//    3    6:invokespecial   #68  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean addAll(Collection collection)
	{
		throw new UnsupportedOperationException("Operation is not supported for read-only collection");
	//    0    0:new             #65  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "Operation is not supported for read-only collection">
	//    3    6:invokespecial   #68  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public int b(Void void1)
	{
		ae.b(((Object) (void1)), "element");
	//    0    0:aload_1         
	//    1    1:ldc1            #54  <String "element">
	//    2    3:invokestatic    #60  <Method void ae.b(Object, String)>
		return -1;
	//    3    6:iconst_m1       
	//    4    7:ireturn         
	}

	public int c(Void void1)
	{
		ae.b(((Object) (void1)), "element");
	//    0    0:aload_1         
	//    1    1:ldc1            #54  <String "element">
	//    2    3:invokestatic    #60  <Method void ae.b(Object, String)>
		return -1;
	//    3    6:iconst_m1       
	//    4    7:ireturn         
	}

	public void clear()
	{
		throw new UnsupportedOperationException("Operation is not supported for read-only collection");
	//    0    0:new             #65  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "Operation is not supported for read-only collection">
	//    3    6:invokespecial   #68  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final boolean contains(Object obj)
	{
		if(obj instanceof Void)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #78  <Class Void>
	//*   2    4:ifeq            16
			return a((Void)obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #78  <Class Void>
	//    6   12:invokevirtual   #80  <Method boolean a(Void)>
	//    7   15:ireturn         
		else
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean containsAll(Collection collection)
	{
		ae.b(((Object) (collection)), "elements");
	//    0    0:aload_1         
	//    1    1:ldc1            #83  <String "elements">
	//    2    3:invokestatic    #60  <Method void ae.b(Object, String)>
		return collection.isEmpty();
	//    3    6:aload_1         
	//    4    7:invokeinterface #89  <Method boolean Collection.isEmpty()>
	//    5   12:ireturn         
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof List) && ((List)obj).isEmpty();
	//    0    0:aload_1         
	//    1    1:instanceof      #8   <Class List>
	//    2    4:ifeq            21
	//    3    7:aload_1         
	//    4    8:checkcast       #8   <Class List>
	//    5   11:invokeinterface #92  <Method boolean List.isEmpty()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public Object get(int i)
	{
		return ((Object) (a(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #96  <Method Void a(int)>
	//    3    5:areturn         
	}

	public int hashCode()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final int indexOf(Object obj)
	{
		if(obj instanceof Void)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #78  <Class Void>
	//*   2    4:ifeq            16
			return b((Void)obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #78  <Class Void>
	//    6   12:invokevirtual   #101 <Method int b(Void)>
	//    7   15:ireturn         
		else
			return -1;
	//    8   16:iconst_m1       
	//    9   17:ireturn         
	}

	public boolean isEmpty()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Iterator iterator()
	{
		return (Iterator)r.a;
	//    0    0:getstatic       #108 <Field r r.a>
	//    1    3:checkcast       #110 <Class Iterator>
	//    2    6:areturn         
	}

	public final int lastIndexOf(Object obj)
	{
		if(obj instanceof Void)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #78  <Class Void>
	//*   2    4:ifeq            16
			return c((Void)obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #78  <Class Void>
	//    6   12:invokevirtual   #113 <Method int c(Void)>
	//    7   15:ireturn         
		else
			return -1;
	//    8   16:iconst_m1       
	//    9   17:ireturn         
	}

	public ListIterator listIterator()
	{
		return (ListIterator)r.a;
	//    0    0:getstatic       #108 <Field r r.a>
	//    1    3:checkcast       #117 <Class ListIterator>
	//    2    6:areturn         
	}

	public ListIterator listIterator(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            34
			throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("Index: ").append(i).toString());
	//    2    4:new             #26  <Class IndexOutOfBoundsException>
	//    3    7:dup             
	//    4    8:new             #28  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #29  <Method void StringBuilder()>
	//    7   15:ldc1            #120 <String "Index: ">
	//    8   17:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:iload_1         
	//   10   21:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   11   24:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   12   27:invokespecial   #48  <Method void IndexOutOfBoundsException(String)>
	//   13   30:checkcast       #50  <Class Throwable>
	//   14   33:athrow          
		else
			return (ListIterator)r.a;
	//   15   34:getstatic       #108 <Field r r.a>
	//   16   37:checkcast       #117 <Class ListIterator>
	//   17   40:areturn         
	}

	public Object remove(int i)
	{
		throw new UnsupportedOperationException("Operation is not supported for read-only collection");
	//    0    0:new             #65  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "Operation is not supported for read-only collection">
	//    3    6:invokespecial   #68  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean remove(Object obj)
	{
		throw new UnsupportedOperationException("Operation is not supported for read-only collection");
	//    0    0:new             #65  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "Operation is not supported for read-only collection">
	//    3    6:invokespecial   #68  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean removeAll(Collection collection)
	{
		throw new UnsupportedOperationException("Operation is not supported for read-only collection");
	//    0    0:new             #65  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "Operation is not supported for read-only collection">
	//    3    6:invokespecial   #68  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public boolean retainAll(Collection collection)
	{
		throw new UnsupportedOperationException("Operation is not supported for read-only collection");
	//    0    0:new             #65  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "Operation is not supported for read-only collection">
	//    3    6:invokespecial   #68  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Object set(int i, Object obj)
	{
		throw new UnsupportedOperationException("Operation is not supported for read-only collection");
	//    0    0:new             #65  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #67  <String "Operation is not supported for read-only collection">
	//    3    6:invokespecial   #68  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public final int size()
	{
		return a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #128 <Method int a()>
	//    2    4:ireturn         
	}

	public List subList(int i, int j)
	{
		if(i == 0 && j == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            13
	//*   2    4:iload_2         
	//*   3    5:ifne            13
			return (List)this;
	//    4    8:aload_0         
	//    5    9:checkcast       #8   <Class List>
	//    6   12:areturn         
		else
			throw (Throwable)new IndexOutOfBoundsException((new StringBuilder()).append("fromIndex: ").append(i).append(", toIndex: ").append(j).toString());
	//    7   13:new             #26  <Class IndexOutOfBoundsException>
	//    8   16:dup             
	//    9   17:new             #28  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #29  <Method void StringBuilder()>
	//   12   24:ldc1            #132 <String "fromIndex: ">
	//   13   26:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:iload_1         
	//   15   30:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   16   33:ldc1            #134 <String ", toIndex: ">
	//   17   35:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:iload_2         
	//   19   39:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   20   42:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   21   45:invokespecial   #48  <Method void IndexOutOfBoundsException(String)>
	//   22   48:checkcast       #50  <Class Throwable>
	//   23   51:athrow          
	}

	public Object[] toArray()
	{
		return aa.a(((Collection) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #141 <Method Object[] aa.a(Collection)>
	//    2    4:areturn         
	}

	public Object[] toArray(Object aobj[])
	{
		return aa.a(((Collection) (this)), aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #145 <Method Object[] aa.a(Collection, Object[])>
	//    3    5:areturn         
	}

	public String toString()
	{
		return "[]";
	//    0    0:ldc1            #149 <String "[]">
	//    1    2:areturn         
	}

	public static final s a = new s();

	static 
	{
	//    0    0:new             #2   <Class s>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void s()>
	//    3    7:putstatic       #19  <Field s a>
	//*   4   10:return          
	}
}
