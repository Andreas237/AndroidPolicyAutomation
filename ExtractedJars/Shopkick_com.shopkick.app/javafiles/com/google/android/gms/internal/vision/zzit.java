// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzir, zzgo

final class zzit
	implements Iterator
{

	zzit(zzir zzir1)
	{
		zzaax = zzir1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzir zzaax>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		zzaay = zzir.zza(zzaax).iterator();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field zzir zzaax>
	//    8   14:invokestatic    #25  <Method zzgo zzir.zza(zzir)>
	//    9   17:invokeinterface #31  <Method Iterator zzgo.iterator()>
	//   10   22:putfield        #33  <Field Iterator zzaay>
	//   11   25:return          
	}

	public final boolean hasNext()
	{
		return zzaay.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Iterator zzaay>
	//    2    4:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//    3    9:ireturn         
	}

	public final Object next()
	{
		return ((Object) ((String)zzaay.next()));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Iterator zzaay>
	//    2    4:invokeinterface #42  <Method Object Iterator.next()>
	//    3    9:checkcast       #44  <Class String>
	//    4   12:areturn         
	}

	public final void remove()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #47  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private final zzir zzaax;
	private Iterator zzaay;
}
