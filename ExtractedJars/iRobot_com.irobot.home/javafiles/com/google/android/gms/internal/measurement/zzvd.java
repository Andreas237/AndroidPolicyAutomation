// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzta, zzve, zzte, zzuq, 
//			zzxg, zzuu

public final class zzvd extends zzta
	implements zzve, RandomAccess
{

	public zzvd()
	{
		this(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #32  <Method void zzvd(int)>
	//    3    6:return          
	}

	public zzvd(int i)
	{
		this(new ArrayList(i));
	//    0    0:aload_0         
	//    1    1:new             #34  <Class ArrayList>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #35  <Method void ArrayList(int)>
	//    5    9:invokespecial   #38  <Method void zzvd(ArrayList)>
	//    6   12:return          
	}

	private zzvd(ArrayList arraylist)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void zzta()>
		zzcab = ((List) (arraylist));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field List zzcab>
	//    5    9:return          
	}

	private static String zzaa(Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #47  <Class String>
	//*   2    4:ifeq            12
			return (String)obj;
	//    3    7:aload_0         
	//    4    8:checkcast       #47  <Class String>
	//    5   11:areturn         
		if(obj instanceof zzte)
	//*   6   12:aload_0         
	//*   7   13:instanceof      #49  <Class zzte>
	//*   8   16:ifeq            27
			return ((zzte)obj).zzud();
	//    9   19:aload_0         
	//   10   20:checkcast       #49  <Class zzte>
	//   11   23:invokevirtual   #53  <Method String zzte.zzud()>
	//   12   26:areturn         
		else
			return zzuq.zzm((byte[])obj);
	//   13   27:aload_0         
	//   14   28:checkcast       #55  <Class byte[]>
	//   15   31:invokestatic    #61  <Method String zzuq.zzm(byte[])>
	//   16   34:areturn         
	}

	public final void add(int i, Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #47  <Class String>
	//    2    4:astore_2        
		((zzta)this).zzua();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #66  <Method void zzta.zzua()>
		zzcab.add(i, obj);
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field List zzcab>
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
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzta.zzua()>
		Object obj = ((Object) (collection));
	//    2    4:aload_2         
	//    3    5:astore          4
		if(collection instanceof zzve)
	//*   4    7:aload_2         
	//*   5    8:instanceof      #7   <Class zzve>
	//*   6   11:ifeq            25
			obj = ((Object) (((zzve)collection).zzxb()));
	//    7   14:aload_2         
	//    8   15:checkcast       #7   <Class zzve>
	//    9   18:invokeinterface #80  <Method List zzve.zzxb()>
	//   10   23:astore          4
		boolean flag = zzcab.addAll(i, ((Collection) (obj)));
	//   11   25:aload_0         
	//   12   26:getfield        #41  <Field List zzcab>
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
		return ((zzta)this).addAll(size(), collection);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #88  <Method int size()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #89  <Method boolean zzta.addAll(int, Collection)>
	//    5    9:ireturn         
	}

	public final void clear()
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzta.zzua()>
		zzcab.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field List zzcab>
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
	//    2    2:invokespecial   #97  <Method boolean zzta.equals(Object)>
	//    3    5:ireturn         
	}

	public final Object get(int i)
	{
		Object obj = zzcab.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzcab>
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
		if(obj instanceof zzte)
	//*  11   23:aload_2         
	//*  12   24:instanceof      #49  <Class zzte>
	//*  13   27:ifeq            61
		{
			obj = ((Object) ((zzte)obj));
	//   14   30:aload_2         
	//   15   31:checkcast       #49  <Class zzte>
	//   16   34:astore_2        
			String s = ((zzte) (obj)).zzud();
	//   17   35:aload_2         
	//   18   36:invokevirtual   #53  <Method String zzte.zzud()>
	//   19   39:astore_3        
			if(((zzte) (obj)).zzue())
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #105 <Method boolean zzte.zzue()>
	//*  22   44:ifeq            59
				zzcab.set(i, ((Object) (s)));
	//   23   47:aload_0         
	//   24   48:getfield        #41  <Field List zzcab>
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
		String s1 = zzuq.zzm(abyte0);
	//   34   66:aload_2         
	//   35   67:invokestatic    #61  <Method String zzuq.zzm(byte[])>
	//   36   70:astore_3        
		if(zzuq.zzl(abyte0))
	//*  37   71:aload_2         
	//*  38   72:invokestatic    #113 <Method boolean zzuq.zzl(byte[])>
	//*  39   75:ifeq            90
			zzcab.set(i, ((Object) (s1)));
	//   40   78:aload_0         
	//   41   79:getfield        #41  <Field List zzcab>
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
	//    1    1:invokespecial   #116 <Method int zzta.hashCode()>
	//    2    4:ireturn         
	}

	public final Object remove(int i)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzta.zzua()>
		Object obj = zzcab.remove(i);
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field List zzcab>
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
		return ((Object) (zzaa(obj)));
	//   13   25:aload_2         
	//   14   26:invokestatic    #121 <Method String zzaa(Object)>
	//   15   29:areturn         
	}

	public final volatile boolean remove(Object obj)
	{
		return super.remove(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method boolean zzta.remove(Object)>
	//    3    5:ireturn         
	}

	public final volatile boolean removeAll(Collection collection)
	{
		return super.removeAll(collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method boolean zzta.removeAll(Collection)>
	//    3    5:ireturn         
	}

	public final volatile boolean retainAll(Collection collection)
	{
		return super.retainAll(collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #129 <Method boolean zzta.retainAll(Collection)>
	//    3    5:ireturn         
	}

	public final Object set(int i, Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #47  <Class String>
	//    2    4:astore_2        
		((zzta)this).zzua();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #66  <Method void zzta.zzua()>
		return ((Object) (zzaa(zzcab.set(i, obj))));
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field List zzcab>
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #109 <Method Object List.set(int, Object)>
	//   10   20:invokestatic    #121 <Method String zzaa(Object)>
	//   11   23:areturn         
	}

	public final int size()
	{
		return zzcab.size();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzcab>
	//    2    4:invokeinterface #130 <Method int List.size()>
	//    3    9:ireturn         
	}

	public final zzuu zzal(int i)
	{
		if(i < size())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #88  <Method int size()>
	//*   3    5:icmpge          16
		{
			throw new IllegalArgumentException();
	//    4    8:new             #134 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:invokespecial   #135 <Method void IllegalArgumentException()>
	//    7   15:athrow          
		} else
		{
			ArrayList arraylist = new ArrayList(i);
	//    8   16:new             #34  <Class ArrayList>
	//    9   19:dup             
	//   10   20:iload_1         
	//   11   21:invokespecial   #35  <Method void ArrayList(int)>
	//   12   24:astore_2        
			arraylist.addAll(((Collection) (zzcab)));
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:getfield        #41  <Field List zzcab>
	//   16   30:invokevirtual   #137 <Method boolean ArrayList.addAll(Collection)>
	//   17   33:pop             
			return ((zzuu) (new zzvd(arraylist)));
	//   18   34:new             #2   <Class zzvd>
	//   19   37:dup             
	//   20   38:aload_2         
	//   21   39:invokespecial   #38  <Method void zzvd(ArrayList)>
	//   22   42:areturn         
		}
	}

	public final Object zzbp(int i)
	{
		return zzcab.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzcab>
	//    2    4:iload_1         
	//    3    5:invokeinterface #101 <Method Object List.get(int)>
	//    4   10:areturn         
	}

	public final void zzc(zzte zzte1)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method void zzta.zzua()>
		zzcab.add(((Object) (zzte1)));
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field List zzcab>
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

	public final volatile boolean zztz()
	{
		return super.zztz();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method boolean zzta.zztz()>
	//    2    4:ireturn         
	}

	public final List zzxb()
	{
		return Collections.unmodifiableList(zzcab);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List zzcab>
	//    2    4:invokestatic    #151 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public final zzve zzxc()
	{
		if(((zzta)this).zztz())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #145 <Method boolean zzta.zztz()>
	//*   2    4:ifeq            16
			return ((zzve) (new zzxg(((zzve) (this)))));
	//    3    7:new             #156 <Class zzxg>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #159 <Method void zzxg(zzve)>
	//    7   15:areturn         
		else
			return ((zzve) (this));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	private static final zzvd zzbzz;
	private static final zzve zzcaa;
	private final List zzcab;

	static 
	{
		zzvd zzvd1 = new zzvd();
	//    0    0:new             #2   <Class zzvd>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzvd()>
	//    3    7:astore_0        
		zzbzz = zzvd1;
	//    4    8:aload_0         
	//    5    9:putstatic       #23  <Field zzvd zzbzz>
		((zzta) (zzvd1)).zzsw();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #26  <Method void zzta.zzsw()>
		zzcaa = ((zzve) (zzbzz));
	//    8   16:getstatic       #23  <Field zzvd zzbzz>
	//    9   19:putstatic       #28  <Field zzve zzcaa>
	//*  10   22:return          
	}
}
