// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwo, zzwp

final class zzwq
	implements Iterator
{

	private zzwq(zzwo zzwo1)
	{
		zzcca = zzwo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzwo zzcca>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		pos = zzwo.zzb(zzcca).size();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field zzwo zzcca>
	//    8   14:invokestatic    #27  <Method List zzwo.zzb(zzwo)>
	//    9   17:invokeinterface #33  <Method int List.size()>
	//   10   22:putfield        #35  <Field int pos>
	//   11   25:return          
	}

	zzwq(zzwo zzwo1, zzwp zzwp)
	{
		this(zzwo1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method void zzwq(zzwo)>
	//    3    5:return          
	}

	private final Iterator zzyh()
	{
		if(zzcbz == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Iterator zzcbz>
	//*   2    4:ifnonnull       28
			zzcbz = zzwo.zzd(zzcca).entrySet().iterator();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field zzwo zzcca>
	//    6   12:invokestatic    #47  <Method Map zzwo.zzd(zzwo)>
	//    7   15:invokeinterface #53  <Method Set Map.entrySet()>
	//    8   20:invokeinterface #58  <Method Iterator Set.iterator()>
	//    9   25:putfield        #43  <Field Iterator zzcbz>
		return zzcbz;
	//   10   28:aload_0         
	//   11   29:getfield        #43  <Field Iterator zzcbz>
	//   12   32:areturn         
	}

	public final boolean hasNext()
	{
		return pos > 0 && pos <= zzwo.zzb(zzcca).size() || zzyh().hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int pos>
	//    2    4:ifle            26
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field int pos>
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field zzwo zzcca>
	//    7   15:invokestatic    #27  <Method List zzwo.zzb(zzwo)>
	//    8   18:invokeinterface #33  <Method int List.size()>
	//    9   23:icmple          38
	//   10   26:aload_0         
	//   11   27:invokespecial   #64  <Method Iterator zzyh()>
	//   12   30:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   13   35:ifeq            40
	//   14   38:iconst_1        
	//   15   39:ireturn         
	//   16   40:iconst_0        
	//   17   41:ireturn         
	}

	public final Object next()
	{
		Object obj;
		if(zzyh().hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #64  <Method Iterator zzyh()>
	//*   2    4:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//*   3    9:ifeq            27
		{
			obj = zzyh().next();
	//    4   12:aload_0         
	//    5   13:invokespecial   #64  <Method Iterator zzyh()>
	//    6   16:invokeinterface #70  <Method Object Iterator.next()>
	//    7   21:astore_2        
		} else
	//*   8   22:aload_2         
	//*   9   23:checkcast       #72  <Class java.util.Map$Entry>
	//*  10   26:areturn         
		{
			obj = ((Object) (zzwo.zzb(zzcca)));
	//   11   27:aload_0         
	//   12   28:getfield        #18  <Field zzwo zzcca>
	//   13   31:invokestatic    #27  <Method List zzwo.zzb(zzwo)>
	//   14   34:astore_2        
			int i = pos - 1;
	//   15   35:aload_0         
	//   16   36:getfield        #35  <Field int pos>
	//   17   39:iconst_1        
	//   18   40:isub            
	//   19   41:istore_1        
			pos = i;
	//   20   42:aload_0         
	//   21   43:iload_1         
	//   22   44:putfield        #35  <Field int pos>
			obj = ((List) (obj)).get(i);
	//   23   47:aload_2         
	//   24   48:iload_1         
	//   25   49:invokeinterface #76  <Method Object List.get(int)>
	//   26   54:astore_2        
		}
		return ((Object) ((java.util.Map.Entry)obj));
	//*  27   55:goto            22
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #79  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private int pos;
	private Iterator zzcbz;
	private final zzwo zzcca;
}