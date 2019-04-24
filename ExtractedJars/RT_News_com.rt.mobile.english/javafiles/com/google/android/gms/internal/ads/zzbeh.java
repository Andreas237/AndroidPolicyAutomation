// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbcd, zzbej, zzbei, zzbah

public final class zzbeh extends AbstractList
	implements zzbcd, RandomAccess
{

	public zzbeh(zzbcd zzbcd1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void AbstractList()>
		zzdyz = zzbcd1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field zzbcd zzdyz>
	//    5    9:return          
	}

	static zzbcd zza(zzbeh zzbeh1)
	{
		return zzbeh1.zzdyz;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzbcd zzdyz>
	//    2    4:areturn         
	}

	public final Object get(int i)
	{
		return ((Object) ((String)zzdyz.get(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzbcd zzdyz>
	//    2    4:iload_1         
	//    3    5:invokeinterface #25  <Method Object zzbcd.get(int)>
	//    4   10:checkcast       #27  <Class String>
	//    5   13:areturn         
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new zzbej(this)));
	//    0    0:new             #31  <Class zzbej>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void zzbej(zzbeh)>
	//    4    8:areturn         
	}

	public final ListIterator listIterator(int i)
	{
		return ((ListIterator) (new zzbei(this, i)));
	//    0    0:new             #40  <Class zzbei>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #43  <Method void zzbei(zzbeh, int)>
	//    5    9:areturn         
	}

	public final int size()
	{
		return zzdyz.size();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzbcd zzdyz>
	//    2    4:invokeinterface #48  <Method int zzbcd.size()>
	//    3    9:ireturn         
	}

	public final List zzadw()
	{
		return zzdyz.zzadw();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzbcd zzdyz>
	//    2    4:invokeinterface #52  <Method List zzbcd.zzadw()>
	//    3    9:areturn         
	}

	public final zzbcd zzadx()
	{
		return ((zzbcd) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final void zzap(zzbah zzbah)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #59  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final Object zzcp(int i)
	{
		return zzdyz.zzcp(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzbcd zzdyz>
	//    2    4:iload_1         
	//    3    5:invokeinterface #63  <Method Object zzbcd.zzcp(int)>
	//    4   10:areturn         
	}

	private final zzbcd zzdyz;
}
