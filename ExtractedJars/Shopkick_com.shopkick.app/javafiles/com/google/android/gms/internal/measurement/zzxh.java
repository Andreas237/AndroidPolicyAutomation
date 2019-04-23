// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxg, zzve

final class zzxh
	implements ListIterator
{

	zzxh(zzxg zzxg1, int i)
	{
		zzcck = zzxg1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzxg zzcck>
		zzccj = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field int zzccj>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
		zzcci = zzxg.zza(zzcck).listIterator(zzccj);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #18  <Field zzxg zzcck>
	//   11   19:invokestatic    #29  <Method zzve zzxg.zza(zzxg)>
	//   12   22:aload_0         
	//   13   23:getfield        #20  <Field int zzccj>
	//   14   26:invokeinterface #35  <Method ListIterator zzve.listIterator(int)>
	//   15   31:putfield        #37  <Field ListIterator zzcci>
	//   16   34:return          
	}

	public final void add(Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #42  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final boolean hasNext()
	{
		return zzcci.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ListIterator zzcci>
	//    2    4:invokeinterface #47  <Method boolean ListIterator.hasNext()>
	//    3    9:ireturn         
	}

	public final boolean hasPrevious()
	{
		return zzcci.hasPrevious();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ListIterator zzcci>
	//    2    4:invokeinterface #50  <Method boolean ListIterator.hasPrevious()>
	//    3    9:ireturn         
	}

	public final Object next()
	{
		return ((Object) ((String)zzcci.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ListIterator zzcci>
	//    2    4:invokeinterface #54  <Method Object ListIterator.next()>
	//    3    9:checkcast       #56  <Class String>
	//    4   12:areturn         
	}

	public final int nextIndex()
	{
		return zzcci.nextIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ListIterator zzcci>
	//    2    4:invokeinterface #60  <Method int ListIterator.nextIndex()>
	//    3    9:ireturn         
	}

	public final Object previous()
	{
		return ((Object) ((String)zzcci.previous()));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ListIterator zzcci>
	//    2    4:invokeinterface #63  <Method Object ListIterator.previous()>
	//    3    9:checkcast       #56  <Class String>
	//    4   12:areturn         
	}

	public final int previousIndex()
	{
		return zzcci.previousIndex();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ListIterator zzcci>
	//    2    4:invokeinterface #66  <Method int ListIterator.previousIndex()>
	//    3    9:ireturn         
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #42  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final void set(Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #42  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private ListIterator zzcci;
	private final int zzccj;
	private final zzxg zzcck;
}
