// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzgo, zzit, zzis, zzeo

public final class zzir extends AbstractList
	implements zzgo, RandomAccess
{

	public zzir(zzgo zzgo1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void AbstractList()>
		zzaau = zzgo1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field zzgo zzaau>
	//    5    9:return          
	}

	static zzgo zza(zzir zzir1)
	{
		return zzir1.zzaau;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzgo zzaau>
	//    2    4:areturn         
	}

	public final Object get(int i)
	{
		return ((Object) ((String)zzaau.get(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzgo zzaau>
	//    2    4:iload_1         
	//    3    5:invokeinterface #25  <Method Object zzgo.get(int)>
	//    4   10:checkcast       #27  <Class String>
	//    5   13:areturn         
	}

	public final Object getRaw(int i)
	{
		return zzaau.getRaw(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzgo zzaau>
	//    2    4:iload_1         
	//    3    5:invokeinterface #30  <Method Object zzgo.getRaw(int)>
	//    4   10:areturn         
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new zzit(this)));
	//    0    0:new             #34  <Class zzit>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #37  <Method void zzit(zzir)>
	//    4    8:areturn         
	}

	public final ListIterator listIterator(int i)
	{
		return ((ListIterator) (new zzis(this, i)));
	//    0    0:new             #43  <Class zzis>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #46  <Method void zzis(zzir, int)>
	//    5    9:areturn         
	}

	public final int size()
	{
		return zzaau.size();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzgo zzaau>
	//    2    4:invokeinterface #51  <Method int zzgo.size()>
	//    3    9:ireturn         
	}

	public final void zzc(zzeo zzeo)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #55  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final List zzft()
	{
		return zzaau.zzft();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzgo zzaau>
	//    2    4:invokeinterface #60  <Method List zzgo.zzft()>
	//    3    9:areturn         
	}

	public final zzgo zzfu()
	{
		return ((zzgo) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private final zzgo zzaau;
}
