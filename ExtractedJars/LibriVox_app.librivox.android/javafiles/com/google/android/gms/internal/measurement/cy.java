// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			fe

abstract class cy extends AbstractList
	implements fe
{

	cy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AbstractList()>
		a = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #14  <Field boolean a>
	//    5    9:return          
	}

	public boolean a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field boolean a>
	//    2    4:ireturn         
	}

	public void add(int i, Object obj)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method void c()>
		super.add(i, obj);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #23  <Method void AbstractList.add(int, Object)>
	//    6   10:return          
	}

	public boolean add(Object obj)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method void c()>
		return super.add(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #26  <Method boolean AbstractList.add(Object)>
	//    5    9:ireturn         
	}

	public boolean addAll(int i, Collection collection)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method void c()>
		return super.addAll(i, collection);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #30  <Method boolean AbstractList.addAll(int, Collection)>
	//    6   10:ireturn         
	}

	public boolean addAll(Collection collection)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method void c()>
		return super.addAll(collection);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #33  <Method boolean AbstractList.addAll(Collection)>
	//    5    9:ireturn         
	}

	public final void b()
	{
		a = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #14  <Field boolean a>
	//    3    5:return          
	}

	protected final void c()
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field boolean a>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new UnsupportedOperationException();
	//    4    8:new             #36  <Class UnsupportedOperationException>
	//    5   11:dup             
	//    6   12:invokespecial   #37  <Method void UnsupportedOperationException()>
	//    7   15:athrow          
	}

	public void clear()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method void c()>
		super.clear();
	//    2    4:aload_0         
	//    3    5:invokespecial   #40  <Method void AbstractList.clear()>
	//    4    8:return          
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof List))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #43  <Class List>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		if(!(obj instanceof RandomAccess))
	//*  10   16:aload_1         
	//*  11   17:instanceof      #45  <Class RandomAccess>
	//*  12   20:ifne            29
			return super.equals(obj);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokespecial   #47  <Method boolean AbstractList.equals(Object)>
	//   16   28:ireturn         
		obj = ((Object) ((List)obj));
	//   17   29:aload_1         
	//   18   30:checkcast       #43  <Class List>
	//   19   33:astore_1        
		int j = size();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #51  <Method int size()>
	//   22   38:istore_3        
		if(j != ((List) (obj)).size())
	//*  23   39:iload_3         
	//*  24   40:aload_1         
	//*  25   41:invokeinterface #52  <Method int List.size()>
	//*  26   46:icmpeq          51
			return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
		for(int i = 0; i < j; i++)
	//*  29   51:iconst_0        
	//*  30   52:istore_2        
	//*  31   53:iload_2         
	//*  32   54:iload_3         
	//*  33   55:icmpge          85
			if(!get(i).equals(((List) (obj)).get(i)))
	//*  34   58:aload_0         
	//*  35   59:iload_2         
	//*  36   60:invokevirtual   #56  <Method Object get(int)>
	//*  37   63:aload_1         
	//*  38   64:iload_2         
	//*  39   65:invokeinterface #57  <Method Object List.get(int)>
	//*  40   70:invokevirtual   #60  <Method boolean Object.equals(Object)>
	//*  41   73:ifne            78
				return false;
	//   42   76:iconst_0        
	//   43   77:ireturn         

	//   44   78:iload_2         
	//   45   79:iconst_1        
	//   46   80:iadd            
	//   47   81:istore_2        
	//*  48   82:goto            53
		return true;
	//   49   85:iconst_1        
	//   50   86:ireturn         
	}

	public int hashCode()
	{
		int k = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method int size()>
	//    2    4:istore_3        
		int j = 1;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		for(int i = 0; i < k; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_3         
	//*   9   11:icmpge          35
			j = j * 31 + get(i).hashCode();
	//   10   14:iload_2         
	//   11   15:bipush          31
	//   12   17:imul            
	//   13   18:aload_0         
	//   14   19:iload_1         
	//   15   20:invokevirtual   #56  <Method Object get(int)>
	//   16   23:invokevirtual   #63  <Method int Object.hashCode()>
	//   17   26:iadd            
	//   18   27:istore_2        

	//   19   28:iload_1         
	//   20   29:iconst_1        
	//   21   30:iadd            
	//   22   31:istore_1        
	//*  23   32:goto            9
		return j;
	//   24   35:iload_2         
	//   25   36:ireturn         
	}

	public Object remove(int i)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method void c()>
		return super.remove(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #66  <Method Object AbstractList.remove(int)>
	//    5    9:areturn         
	}

	public boolean remove(Object obj)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method void c()>
		return super.remove(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #68  <Method boolean AbstractList.remove(Object)>
	//    5    9:ireturn         
	}

	public boolean removeAll(Collection collection)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method void c()>
		return super.removeAll(collection);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #71  <Method boolean AbstractList.removeAll(Collection)>
	//    5    9:ireturn         
	}

	public boolean retainAll(Collection collection)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method void c()>
		return super.retainAll(collection);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #74  <Method boolean AbstractList.retainAll(Collection)>
	//    5    9:ireturn         
	}

	public Object set(int i, Object obj)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method void c()>
		return super.set(i, obj);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #78  <Method Object AbstractList.set(int, Object)>
	//    6   10:areturn         
	}

	private boolean a;
}
