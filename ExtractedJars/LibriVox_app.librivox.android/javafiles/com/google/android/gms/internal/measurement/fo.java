// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			cy, fp, dc, fa, 
//			hs, fe

public final class fo extends cy
	implements fp, RandomAccess
{

	public fo()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #29  <Method void fo(int)>
	//    3    6:return          
	}

	public fo(int i)
	{
		this(new ArrayList(i));
	//    0    0:aload_0         
	//    1    1:new             #31  <Class ArrayList>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #32  <Method void ArrayList(int)>
	//    5    9:invokespecial   #35  <Method void fo(ArrayList)>
	//    6   12:return          
	}

	private fo(ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void cy()>
		c = ((List) (arraylist));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field List c>
	//    5    9:return          
	}

	private static String a(Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #41  <Class String>
	//*   2    4:ifeq            12
			return (String)obj;
	//    3    7:aload_0         
	//    4    8:checkcast       #41  <Class String>
	//    5   11:areturn         
		if(obj instanceof dc)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #43  <Class dc>
	//*   8   16:ifeq            27
			return ((dc)obj).b();
	//    9   19:aload_0         
	//   10   20:checkcast       #43  <Class dc>
	//   11   23:invokevirtual   #46  <Method String dc.b()>
	//   12   26:areturn         
		else
			return fa.b((byte[])obj);
	//   13   27:aload_0         
	//   14   28:checkcast       #48  <Class byte[]>
	//   15   31:invokestatic    #53  <Method String fa.b(byte[])>
	//   16   34:areturn         
	}

	public final fe a(int i)
	{
		if(i >= size())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #58  <Method int size()>
	//*   3    5:icmplt          35
		{
			ArrayList arraylist = new ArrayList(i);
	//    4    8:new             #31  <Class ArrayList>
	//    5   11:dup             
	//    6   12:iload_1         
	//    7   13:invokespecial   #32  <Method void ArrayList(int)>
	//    8   16:astore_2        
			arraylist.addAll(((Collection) (c)));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #38  <Field List c>
	//   12   22:invokevirtual   #62  <Method boolean ArrayList.addAll(Collection)>
	//   13   25:pop             
			return ((fe) (new fo(arraylist)));
	//   14   26:new             #2   <Class fo>
	//   15   29:dup             
	//   16   30:aload_2         
	//   17   31:invokespecial   #35  <Method void fo(ArrayList)>
	//   18   34:areturn         
		} else
		{
			throw new IllegalArgumentException();
	//   19   35:new             #64  <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:invokespecial   #65  <Method void IllegalArgumentException()>
	//   22   42:athrow          
		}
	}

	public final void a(dc dc1)
	{
		((cy)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method void cy.c()>
		c.add(((Object) (dc1)));
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field List c>
	//    4    8:aload_1         
	//    5    9:invokeinterface #74  <Method boolean List.add(Object)>
	//    6   14:pop             
		modCount = modCount + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field int modCount>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #78  <Field int modCount>
	//   13   25:return          
	}

	public final volatile boolean a()
	{
		return super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method boolean cy.a()>
	//    2    4:ireturn         
	}

	public final void add(int i, Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #41  <Class String>
	//    2    4:astore_2        
		((cy)this).c();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #68  <Method void cy.c()>
		c.add(i, obj);
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field List c>
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #84  <Method void List.add(int, Object)>
		modCount = modCount + 1;
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #78  <Field int modCount>
	//   13   25:iconst_1        
	//   14   26:iadd            
	//   15   27:putfield        #78  <Field int modCount>
	//   16   30:return          
	}

	public final boolean addAll(int i, Collection collection)
	{
		((cy)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method void cy.c()>
		Object obj = ((Object) (collection));
	//    2    4:aload_2         
	//    3    5:astore          4
		if(collection instanceof fp)
	//*   4    7:aload_2         
	//*   5    8:instanceof      #6   <Class fp>
	//*   6   11:ifeq            25
			obj = ((Object) (((fp)collection).d()));
	//    7   14:aload_2         
	//    8   15:checkcast       #6   <Class fp>
	//    9   18:invokeinterface #89  <Method List fp.d()>
	//   10   23:astore          4
		boolean flag = c.addAll(i, ((Collection) (obj)));
	//   11   25:aload_0         
	//   12   26:getfield        #38  <Field List c>
	//   13   29:iload_1         
	//   14   30:aload           4
	//   15   32:invokeinterface #91  <Method boolean List.addAll(int, Collection)>
	//   16   37:istore_3        
		modCount = modCount + 1;
	//   17   38:aload_0         
	//   18   39:aload_0         
	//   19   40:getfield        #78  <Field int modCount>
	//   20   43:iconst_1        
	//   21   44:iadd            
	//   22   45:putfield        #78  <Field int modCount>
		return flag;
	//   23   48:iload_3         
	//   24   49:ireturn         
	}

	public final boolean addAll(Collection collection)
	{
		return ((cy)this).addAll(size(), collection);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #58  <Method int size()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #92  <Method boolean cy.addAll(int, Collection)>
	//    5    9:ireturn         
	}

	public final Object b(int i)
	{
		return c.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List c>
	//    2    4:iload_1         
	//    3    5:invokeinterface #96  <Method Object List.get(int)>
	//    4   10:areturn         
	}

	public final void clear()
	{
		((cy)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method void cy.c()>
		c.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field List c>
	//    4    8:invokeinterface #99  <Method void List.clear()>
		modCount = modCount + 1;
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:getfield        #78  <Field int modCount>
	//    8   18:iconst_1        
	//    9   19:iadd            
	//   10   20:putfield        #78  <Field int modCount>
	//   11   23:return          
	}

	public final List d()
	{
		return Collections.unmodifiableList(c);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List c>
	//    2    4:invokestatic    #105 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public final fp e()
	{
		if(((cy)this).a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #81  <Method boolean cy.a()>
	//*   2    4:ifeq            16
			return ((fp) (new hs(((fp) (this)))));
	//    3    7:new             #109 <Class hs>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #112 <Method void hs(fp)>
	//    7   15:areturn         
		else
			return ((fp) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public final volatile boolean equals(Object obj)
	{
		return super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method boolean cy.equals(Object)>
	//    3    5:ireturn         
	}

	public final Object get(int i)
	{
		Object obj = c.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List c>
	//    2    4:iload_1         
	//    3    5:invokeinterface #96  <Method Object List.get(int)>
	//    4   10:astore_2        
		if(obj instanceof String)
	//*   5   11:aload_2         
	//*   6   12:instanceof      #41  <Class String>
	//*   7   15:ifeq            23
			return ((Object) ((String)obj));
	//    8   18:aload_2         
	//    9   19:checkcast       #41  <Class String>
	//   10   22:areturn         
		if(obj instanceof dc)
	//*  11   23:aload_2         
	//*  12   24:instanceof      #43  <Class dc>
	//*  13   27:ifeq            61
		{
			obj = ((Object) ((dc)obj));
	//   14   30:aload_2         
	//   15   31:checkcast       #43  <Class dc>
	//   16   34:astore_2        
			String s = ((dc) (obj)).b();
	//   17   35:aload_2         
	//   18   36:invokevirtual   #46  <Method String dc.b()>
	//   19   39:astore_3        
			if(((dc) (obj)).c())
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #117 <Method boolean dc.c()>
	//*  22   44:ifeq            59
				c.set(i, ((Object) (s)));
	//   23   47:aload_0         
	//   24   48:getfield        #38  <Field List c>
	//   25   51:iload_1         
	//   26   52:aload_3         
	//   27   53:invokeinterface #121 <Method Object List.set(int, Object)>
	//   28   58:pop             
			return ((Object) (s));
	//   29   59:aload_3         
	//   30   60:areturn         
		}
		byte abyte0[] = (byte[])obj;
	//   31   61:aload_2         
	//   32   62:checkcast       #48  <Class byte[]>
	//   33   65:astore_2        
		String s1 = fa.b(abyte0);
	//   34   66:aload_2         
	//   35   67:invokestatic    #53  <Method String fa.b(byte[])>
	//   36   70:astore_3        
		if(fa.a(abyte0))
	//*  37   71:aload_2         
	//*  38   72:invokestatic    #124 <Method boolean fa.a(byte[])>
	//*  39   75:ifeq            90
			c.set(i, ((Object) (s1)));
	//   40   78:aload_0         
	//   41   79:getfield        #38  <Field List c>
	//   42   82:iload_1         
	//   43   83:aload_3         
	//   44   84:invokeinterface #121 <Method Object List.set(int, Object)>
	//   45   89:pop             
		return ((Object) (s1));
	//   46   90:aload_3         
	//   47   91:areturn         
	}

	public final volatile int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method int cy.hashCode()>
	//    2    4:ireturn         
	}

	public final Object remove(int i)
	{
		((cy)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method void cy.c()>
		Object obj = c.remove(i);
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field List c>
	//    4    8:iload_1         
	//    5    9:invokeinterface #130 <Method Object List.remove(int)>
	//    6   14:astore_2        
		modCount = modCount + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #78  <Field int modCount>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #78  <Field int modCount>
		return ((Object) (a(obj)));
	//   13   25:aload_2         
	//   14   26:invokestatic    #132 <Method String a(Object)>
	//   15   29:areturn         
	}

	public final volatile boolean remove(Object obj)
	{
		return super.remove(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #134 <Method boolean cy.remove(Object)>
	//    3    5:ireturn         
	}

	public final volatile boolean removeAll(Collection collection)
	{
		return super.removeAll(collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #137 <Method boolean cy.removeAll(Collection)>
	//    3    5:ireturn         
	}

	public final volatile boolean retainAll(Collection collection)
	{
		return super.retainAll(collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #140 <Method boolean cy.retainAll(Collection)>
	//    3    5:ireturn         
	}

	public final Object set(int i, Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #41  <Class String>
	//    2    4:astore_2        
		((cy)this).c();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #68  <Method void cy.c()>
		return ((Object) (a(c.set(i, obj))));
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field List c>
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #121 <Method Object List.set(int, Object)>
	//   10   20:invokestatic    #132 <Method String a(Object)>
	//   11   23:areturn         
	}

	public final int size()
	{
		return c.size();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List c>
	//    2    4:invokeinterface #141 <Method int List.size()>
	//    3    9:ireturn         
	}

	private static final fo a;
	private static final fp b;
	private final List c;

	static 
	{
		fo fo1 = new fo();
	//    0    0:new             #2   <Class fo>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void fo()>
	//    3    7:astore_0        
		a = fo1;
	//    4    8:aload_0         
	//    5    9:putstatic       #21  <Field fo a>
		((cy) (fo1)).b();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #23  <Method void cy.b()>
		b = ((fp) (a));
	//    8   16:getstatic       #21  <Field fo a>
	//    9   19:putstatic       #25  <Field fp b>
	//*  10   22:return          
	}
}
