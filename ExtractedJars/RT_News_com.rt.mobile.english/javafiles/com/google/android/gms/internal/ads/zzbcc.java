// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbab, zzbcd, zzbah, zzbbq, 
//			zzbeh, zzbbt

public final class zzbcc extends zzbab
	implements zzbcd, RandomAccess
{

	public zzbcc()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #32  <Method void zzbcc(int)>
	//    3    6:return          
	}

	public zzbcc(int i)
	{
		this(new ArrayList(i));
	//    0    0:aload_0         
	//    1    1:new             #34  <Class ArrayList>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #35  <Method void ArrayList(int)>
	//    5    9:invokespecial   #38  <Method void zzbcc(ArrayList)>
	//    6   12:return          
	}

	private zzbcc(ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void zzbab()>
		zzdvp = ((List) (arraylist));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field List zzdvp>
	//    5    9:return          
	}

	private static String zzq(Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #47  <Class String>
	//*   2    4:ifeq            12
			return (String)obj;
	//    3    7:aload_0         
	//    4    8:checkcast       #47  <Class String>
	//    5   11:areturn         
		if(obj instanceof zzbah)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #49  <Class zzbah>
	//*   8   16:ifeq            27
			return ((zzbah)obj).zzabd();
	//    9   19:aload_0         
	//   10   20:checkcast       #49  <Class zzbah>
	//   11   23:invokevirtual   #53  <Method String zzbah.zzabd()>
	//   12   26:areturn         
		else
			return zzbbq.zzt((byte[])obj);
	//   13   27:aload_0         
	//   14   28:checkcast       #55  <Class byte[]>
	//   15   31:invokestatic    #61  <Method String zzbbq.zzt(byte[])>
	//   16   34:areturn         
	}

	public final void add(int i, Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #47  <Class String>
	//    2    4:astore_2        
		((zzbab)this).zzaba();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #66  <Method void zzbab.zzaba()>
		zzdvp.add(i, obj);
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field List zzdvp>
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
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzbab.zzaba()>
		Object obj = ((Object) (collection));
	//    2    4:aload_2         
	//    3    5:astore          4
		if(collection instanceof zzbcd)
	//*   4    7:aload_2         
	//*   5    8:instanceof      #7   <Class zzbcd>
	//*   6   11:ifeq            25
			obj = ((Object) (((zzbcd)collection).zzadw()));
	//    7   14:aload_2         
	//    8   15:checkcast       #7   <Class zzbcd>
	//    9   18:invokeinterface #80  <Method List zzbcd.zzadw()>
	//   10   23:astore          4
		boolean flag = zzdvp.addAll(i, ((Collection) (obj)));
	//   11   25:aload_0         
	//   12   26:getfield        #41  <Field List zzdvp>
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
		return ((zzbab)this).addAll(size(), collection);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #88  <Method int size()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #89  <Method boolean zzbab.addAll(int, Collection)>
	//    5    9:ireturn         
	}

	public final void clear()
	{
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzbab.zzaba()>
		zzdvp.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field List zzdvp>
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
	//    2    2:invokespecial   #97  <Method boolean zzbab.equals(Object)>
	//    3    5:ireturn         
	}

	public final Object get(int i)
	{
		Object obj = zzdvp.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzdvp>
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
		if(obj instanceof zzbah)
	//*  11   23:aload_2         
	//*  12   24:instanceof      #49  <Class zzbah>
	//*  13   27:ifeq            61
		{
			obj = ((Object) ((zzbah)obj));
	//   14   30:aload_2         
	//   15   31:checkcast       #49  <Class zzbah>
	//   16   34:astore_2        
			String s = ((zzbah) (obj)).zzabd();
	//   17   35:aload_2         
	//   18   36:invokevirtual   #53  <Method String zzbah.zzabd()>
	//   19   39:astore_3        
			if(((zzbah) (obj)).zzabe())
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #105 <Method boolean zzbah.zzabe()>
	//*  22   44:ifeq            59
				zzdvp.set(i, ((Object) (s)));
	//   23   47:aload_0         
	//   24   48:getfield        #41  <Field List zzdvp>
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
		String s1 = zzbbq.zzt(abyte0);
	//   34   66:aload_2         
	//   35   67:invokestatic    #61  <Method String zzbbq.zzt(byte[])>
	//   36   70:astore_3        
		if(zzbbq.zzs(abyte0))
	//*  37   71:aload_2         
	//*  38   72:invokestatic    #113 <Method boolean zzbbq.zzs(byte[])>
	//*  39   75:ifeq            90
			zzdvp.set(i, ((Object) (s1)));
	//   40   78:aload_0         
	//   41   79:getfield        #41  <Field List zzdvp>
	//   42   82:iload_1         
	//   43   83:aload_3         
	//   44   84:invokeinterface #109 <Method Object List.set(int, Object)>
	//   45   89:pop             
		return ((Object) (s1));
	//   46   90:aload_3         
	//   47   91:areturn         
	}

	public final volatile int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method int zzbab.hashCode()>
	//    2    4:ireturn         
	}

	public final Object remove(int i)
	{
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzbab.zzaba()>
		Object obj = zzdvp.remove(i);
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field List zzdvp>
	//    4    8:iload_1         
	//    5    9:invokeinterface #119 <Method Object List.remove(int)>
	//    6   14:astore_2        
		modCount = modCount + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #74  <Field int modCount>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #74  <Field int modCount>
		return ((Object) (zzq(obj)));
	//   13   25:aload_2         
	//   14   26:invokestatic    #121 <Method String zzq(Object)>
	//   15   29:areturn         
	}

	public final volatile boolean remove(Object obj)
	{
		return super.remove(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method boolean zzbab.remove(Object)>
	//    3    5:ireturn         
	}

	public final volatile boolean removeAll(Collection collection)
	{
		return super.removeAll(collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method boolean zzbab.removeAll(Collection)>
	//    3    5:ireturn         
	}

	public final volatile boolean retainAll(Collection collection)
	{
		return super.retainAll(collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #129 <Method boolean zzbab.retainAll(Collection)>
	//    3    5:ireturn         
	}

	public final Object set(int i, Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #47  <Class String>
	//    2    4:astore_2        
		((zzbab)this).zzaba();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #66  <Method void zzbab.zzaba()>
		return ((Object) (zzq(zzdvp.set(i, obj))));
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field List zzdvp>
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #109 <Method Object List.set(int, Object)>
	//   10   20:invokestatic    #121 <Method String zzq(Object)>
	//   11   23:areturn         
	}

	public final int size()
	{
		return zzdvp.size();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzdvp>
	//    2    4:invokeinterface #130 <Method int List.size()>
	//    3    9:ireturn         
	}

	public final volatile boolean zzaay()
	{
		return super.zzaay();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method boolean zzbab.zzaay()>
	//    2    4:ireturn         
	}

	public final List zzadw()
	{
		return Collections.unmodifiableList(zzdvp);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzdvp>
	//    2    4:invokestatic    #139 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public final zzbcd zzadx()
	{
		if(((zzbab)this).zzaay())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #133 <Method boolean zzbab.zzaay()>
	//*   2    4:ifeq            16
			return ((zzbcd) (new zzbeh(((zzbcd) (this)))));
	//    3    7:new             #144 <Class zzbeh>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #147 <Method void zzbeh(zzbcd)>
	//    7   15:areturn         
		else
			return ((zzbcd) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public final void zzap(zzbah zzbah1)
	{
		((zzbab)this).zzaba();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzbab.zzaba()>
		zzdvp.add(((Object) (zzbah1)));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field List zzdvp>
	//    4    8:aload_1         
	//    5    9:invokeinterface #151 <Method boolean List.add(Object)>
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

	public final zzbbt zzbm(int i)
	{
		if(i < size())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #88  <Method int size()>
	//*   3    5:icmpge          16
		{
			throw new IllegalArgumentException();
	//    4    8:new             #155 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:invokespecial   #156 <Method void IllegalArgumentException()>
	//    7   15:athrow          
		} else
		{
			ArrayList arraylist = new ArrayList(i);
	//    8   16:new             #34  <Class ArrayList>
	//    9   19:dup             
	//   10   20:iload_1         
	//   11   21:invokespecial   #35  <Method void ArrayList(int)>
	//   12   24:astore_2        
			arraylist.addAll(((Collection) (zzdvp)));
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:getfield        #41  <Field List zzdvp>
	//   16   30:invokevirtual   #158 <Method boolean ArrayList.addAll(Collection)>
	//   17   33:pop             
			return ((zzbbt) (new zzbcc(arraylist)));
	//   18   34:new             #2   <Class zzbcc>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:invokespecial   #38  <Method void zzbcc(ArrayList)>
	//   22   42:areturn         
		}
	}

	public final Object zzcp(int i)
	{
		return zzdvp.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzdvp>
	//    2    4:iload_1         
	//    3    5:invokeinterface #101 <Method Object List.get(int)>
	//    4   10:areturn         
	}

	private static final zzbcc zzdvn;
	private static final zzbcd zzdvo;
	private final List zzdvp;

	static 
	{
		zzbcc zzbcc1 = new zzbcc();
	//    0    0:new             #2   <Class zzbcc>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzbcc()>
	//    3    7:astore_0        
		zzdvn = zzbcc1;
	//    4    8:aload_0         
	//    5    9:putstatic       #23  <Field zzbcc zzdvn>
		((zzbab) (zzbcc1)).zzaaz();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #26  <Method void zzbab.zzaaz()>
		zzdvo = ((zzbcd) (zzdvn));
	//    8   16:getstatic       #23  <Field zzbcc zzdvn>
	//    9   19:putstatic       #28  <Field zzbcd zzdvo>
	//*  10   22:return          
	}
}
