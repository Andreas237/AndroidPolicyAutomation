// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzve, zzxi, zzxh, zzte

public final class zzxg extends AbstractList
	implements zzve, RandomAccess
{

	public zzxg(zzve zzve1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void AbstractList()>
		zzcch = zzve1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field zzve zzcch>
	//    5    9:return          
	}

	static zzve zza(zzxg zzxg1)
	{
		return zzxg1.zzcch;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzve zzcch>
	//    2    4:areturn         
	}

	public final Object get(int i)
	{
		return ((Object) ((String)zzcch.get(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzve zzcch>
	//    2    4:iload_1         
	//    3    5:invokeinterface #25  <Method Object zzve.get(int)>
	//    4   10:checkcast       #27  <Class String>
	//    5   13:areturn         
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new zzxi(this)));
	//    0    0:new             #31  <Class zzxi>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void zzxi(zzxg)>
	//    4    8:areturn         
	}

	public final ListIterator listIterator(int i)
	{
		return ((ListIterator) (new zzxh(this, i)));
	//    0    0:new             #40  <Class zzxh>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #43  <Method void zzxh(zzxg, int)>
	//    5    9:areturn         
	}

	public final int size()
	{
		return zzcch.size();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzve zzcch>
	//    2    4:invokeinterface #48  <Method int zzve.size()>
	//    3    9:ireturn         
	}

	public final Object zzbp(int i)
	{
		return zzcch.zzbp(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzve zzcch>
	//    2    4:iload_1         
	//    3    5:invokeinterface #51  <Method Object zzve.zzbp(int)>
	//    4   10:areturn         
	}

	public final void zzc(zzte zzte)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #55  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final List zzxb()
	{
		return zzcch.zzxb();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzve zzcch>
	//    2    4:invokeinterface #60  <Method List zzve.zzxb()>
	//    3    9:areturn         
	}

	public final zzve zzxc()
	{
		return ((zzve) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private final zzve zzcch;
}
