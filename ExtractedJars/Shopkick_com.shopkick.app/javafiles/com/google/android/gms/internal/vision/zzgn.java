// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzef, zzgo, zzeo, zzga, 
//			zzir, zzge

public final class zzgn extends zzef
	implements zzgo, RandomAccess
{

	public zzgn()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #32  <Method void zzgn(int)>
	//    3    6:return          
	}

	public zzgn(int i)
	{
		this(new ArrayList(i));
	//    0    0:aload_0         
	//    1    1:new             #34  <Class ArrayList>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #35  <Method void ArrayList(int)>
	//    5    9:invokespecial   #38  <Method void zzgn(ArrayList)>
	//    6   12:return          
	}

	private zzgn(ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void zzef()>
		zzym = ((List) (arraylist));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field List zzym>
	//    5    9:return          
	}

	private static String zzh(Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #47  <Class String>
	//*   2    4:ifeq            12
			return (String)obj;
	//    3    7:aload_0         
	//    4    8:checkcast       #47  <Class String>
	//    5   11:areturn         
		if(obj instanceof zzeo)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #49  <Class zzeo>
	//*   8   16:ifeq            27
			return ((zzeo)obj).zzdk();
	//    9   19:aload_0         
	//   10   20:checkcast       #49  <Class zzeo>
	//   11   23:invokevirtual   #53  <Method String zzeo.zzdk()>
	//   12   26:areturn         
		else
			return zzga.zzj((byte[])obj);
	//   13   27:aload_0         
	//   14   28:checkcast       #55  <Class byte[]>
	//   15   31:invokestatic    #61  <Method String zzga.zzj(byte[])>
	//   16   34:areturn         
	}

	public final void add(int i, Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #47  <Class String>
	//    2    4:astore_2        
		((zzef)this).zzcj();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #66  <Method void zzef.zzcj()>
		zzym.add(i, obj);
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field List zzym>
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #70  <Method void List.add(int, Object)>
		modCount = modCount + 1;
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #74  <Field int modCount>
	//   13   25:iconst_1        
	//   14   26:iadd            
	//   15   27:putfield        #74  <Field int modCount>
	//   16   30:return          
	}

	public final boolean addAll(int i, Collection collection)
	{
		((zzef)this).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzef.zzcj()>
		Object obj = ((Object) (collection));
	//    2    4:aload_2         
	//    3    5:astore          4
		if(collection instanceof zzgo)
	//*   4    7:aload_2         
	//*   5    8:instanceof      #7   <Class zzgo>
	//*   6   11:ifeq            25
			obj = ((Object) (((zzgo)collection).zzft()));
	//    7   14:aload_2         
	//    8   15:checkcast       #7   <Class zzgo>
	//    9   18:invokeinterface #80  <Method List zzgo.zzft()>
	//   10   23:astore          4
		boolean flag = zzym.addAll(i, ((Collection) (obj)));
	//   11   25:aload_0         
	//   12   26:getfield        #41  <Field List zzym>
	//   13   29:iload_1         
	//   14   30:aload           4
	//   15   32:invokeinterface #82  <Method boolean List.addAll(int, Collection)>
	//   16   37:istore_3        
		modCount = modCount + 1;
	//   17   38:aload_0         
	//   18   39:aload_0         
	//   19   40:getfield        #74  <Field int modCount>
	//   20   43:iconst_1        
	//   21   44:iadd            
	//   22   45:putfield        #74  <Field int modCount>
		return flag;
	//   23   48:iload_3         
	//   24   49:ireturn         
	}

	public final boolean addAll(Collection collection)
	{
		return ((zzef)this).addAll(size(), collection);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #88  <Method int size()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #89  <Method boolean zzef.addAll(int, Collection)>
	//    5    9:ireturn         
	}

	public final void clear()
	{
		((zzef)this).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzef.zzcj()>
		zzym.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field List zzym>
	//    4    8:invokeinterface #93  <Method void List.clear()>
		modCount = modCount + 1;
	//    5   13:aload_0         
	//    6   14:aload_0         
	//    7   15:getfield        #74  <Field int modCount>
	//    8   18:iconst_1        
	//    9   19:iadd            
	//   10   20:putfield        #74  <Field int modCount>
	//   11   23:return          
	}

	public final volatile boolean equals(Object obj)
	{
		return super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #97  <Method boolean zzef.equals(Object)>
	//    3    5:ireturn         
	}

	public final Object get(int i)
	{
		Object obj = zzym.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzym>
	//    2    4:iload_1         
	//    3    5:invokeinterface #101 <Method Object List.get(int)>
	//    4   10:astore_2        
		if(obj instanceof String)
	//*   5   11:aload_2         
	//*   6   12:instanceof      #47  <Class String>
	//*   7   15:ifeq            23
			return ((Object) ((String)obj));
	//    8   18:aload_2         
	//    9   19:checkcast       #47  <Class String>
	//   10   22:areturn         
		if(obj instanceof zzeo)
	//*  11   23:aload_2         
	//*  12   24:instanceof      #49  <Class zzeo>
	//*  13   27:ifeq            61
		{
			obj = ((Object) ((zzeo)obj));
	//   14   30:aload_2         
	//   15   31:checkcast       #49  <Class zzeo>
	//   16   34:astore_2        
			String s = ((zzeo) (obj)).zzdk();
	//   17   35:aload_2         
	//   18   36:invokevirtual   #53  <Method String zzeo.zzdk()>
	//   19   39:astore_3        
			if(((zzeo) (obj)).zzdl())
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #105 <Method boolean zzeo.zzdl()>
	//*  22   44:ifeq            59
				zzym.set(i, ((Object) (s)));
	//   23   47:aload_0         
	//   24   48:getfield        #41  <Field List zzym>
	//   25   51:iload_1         
	//   26   52:aload_3         
	//   27   53:invokeinterface #109 <Method Object List.set(int, Object)>
	//   28   58:pop             
			return ((Object) (s));
	//   29   59:aload_3         
	//   30   60:areturn         
		}
		byte abyte0[] = (byte[])obj;
	//   31   61:aload_2         
	//   32   62:checkcast       #55  <Class byte[]>
	//   33   65:astore_2        
		String s1 = zzga.zzj(abyte0);
	//   34   66:aload_2         
	//   35   67:invokestatic    #61  <Method String zzga.zzj(byte[])>
	//   36   70:astore_3        
		if(zzga.zzi(abyte0))
	//*  37   71:aload_2         
	//*  38   72:invokestatic    #113 <Method boolean zzga.zzi(byte[])>
	//*  39   75:ifeq            90
			zzym.set(i, ((Object) (s1)));
	//   40   78:aload_0         
	//   41   79:getfield        #41  <Field List zzym>
	//   42   82:iload_1         
	//   43   83:aload_3         
	//   44   84:invokeinterface #109 <Method Object List.set(int, Object)>
	//   45   89:pop             
		return ((Object) (s1));
	//   46   90:aload_3         
	//   47   91:areturn         
	}

	public final Object getRaw(int i)
	{
		return zzym.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzym>
	//    2    4:iload_1         
	//    3    5:invokeinterface #101 <Method Object List.get(int)>
	//    4   10:areturn         
	}

	public final volatile int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method int zzef.hashCode()>
	//    2    4:ireturn         
	}

	public final Object remove(int i)
	{
		((zzef)this).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzef.zzcj()>
		Object obj = zzym.remove(i);
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field List zzym>
	//    4    8:iload_1         
	//    5    9:invokeinterface #120 <Method Object List.remove(int)>
	//    6   14:astore_2        
		modCount = modCount + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #74  <Field int modCount>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #74  <Field int modCount>
		return ((Object) (zzh(obj)));
	//   13   25:aload_2         
	//   14   26:invokestatic    #122 <Method String zzh(Object)>
	//   15   29:areturn         
	}

	public final volatile boolean remove(Object obj)
	{
		return super.remove(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #124 <Method boolean zzef.remove(Object)>
	//    3    5:ireturn         
	}

	public final volatile boolean removeAll(Collection collection)
	{
		return super.removeAll(collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #127 <Method boolean zzef.removeAll(Collection)>
	//    3    5:ireturn         
	}

	public final volatile boolean retainAll(Collection collection)
	{
		return super.retainAll(collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method boolean zzef.retainAll(Collection)>
	//    3    5:ireturn         
	}

	public final Object set(int i, Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #47  <Class String>
	//    2    4:astore_2        
		((zzef)this).zzcj();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #66  <Method void zzef.zzcj()>
		return ((Object) (zzh(zzym.set(i, obj))));
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field List zzym>
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #109 <Method Object List.set(int, Object)>
	//   10   20:invokestatic    #122 <Method String zzh(Object)>
	//   11   23:areturn         
	}

	public final int size()
	{
		return zzym.size();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzym>
	//    2    4:invokeinterface #131 <Method int List.size()>
	//    3    9:ireturn         
	}

	public final zzge zzah(int i)
	{
		if(i >= size())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #88  <Method int size()>
	//*   3    5:icmplt          35
		{
			ArrayList arraylist = new ArrayList(i);
	//    4    8:new             #34  <Class ArrayList>
	//    5   11:dup             
	//    6   12:iload_1         
	//    7   13:invokespecial   #35  <Method void ArrayList(int)>
	//    8   16:astore_2        
			arraylist.addAll(((Collection) (zzym)));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #41  <Field List zzym>
	//   12   22:invokevirtual   #135 <Method boolean ArrayList.addAll(Collection)>
	//   13   25:pop             
			return ((zzge) (new zzgn(arraylist)));
	//   14   26:new             #2   <Class zzgn>
	//   15   29:dup             
	//   16   30:aload_2         
	//   17   31:invokespecial   #38  <Method void zzgn(ArrayList)>
	//   18   34:areturn         
		} else
		{
			throw new IllegalArgumentException();
	//   19   35:new             #137 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:invokespecial   #138 <Method void IllegalArgumentException()>
	//   22   42:athrow          
		}
	}

	public final void zzc(zzeo zzeo1)
	{
		((zzef)this).zzcj();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzef.zzcj()>
		zzym.add(((Object) (zzeo1)));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field List zzym>
	//    4    8:aload_1         
	//    5    9:invokeinterface #142 <Method boolean List.add(Object)>
	//    6   14:pop             
		modCount = modCount + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #74  <Field int modCount>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #74  <Field int modCount>
	//   13   25:return          
	}

	public final volatile boolean zzch()
	{
		return super.zzch();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method boolean zzef.zzch()>
	//    2    4:ireturn         
	}

	public final List zzft()
	{
		return Collections.unmodifiableList(zzym);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzym>
	//    2    4:invokestatic    #151 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public final zzgo zzfu()
	{
		if(((zzef)this).zzch())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #145 <Method boolean zzef.zzch()>
	//*   2    4:ifeq            16
			return ((zzgo) (new zzir(((zzgo) (this)))));
	//    3    7:new             #156 <Class zzir>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #159 <Method void zzir(zzgo)>
	//    7   15:areturn         
		else
			return ((zzgo) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	private static final zzgn zzyk;
	private static final zzgo zzyl;
	private final List zzym;

	static 
	{
		zzgn zzgn1 = new zzgn();
	//    0    0:new             #2   <Class zzgn>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzgn()>
	//    3    7:astore_0        
		zzyk = zzgn1;
	//    4    8:aload_0         
	//    5    9:putstatic       #23  <Field zzgn zzyk>
		((zzef) (zzgn1)).zzci();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #26  <Method void zzef.zzci()>
		zzyl = ((zzgo) (zzyk));
	//    8   16:getstatic       #23  <Field zzgn zzyk>
	//    9   19:putstatic       #28  <Field zzgo zzyl>
	//*  10   22:return          
	}
}
