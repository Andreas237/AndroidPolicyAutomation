// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzcx, zzfc, zzfb

public final class zzfa extends AbstractList
	implements zzcx, RandomAccess
{

	public zzfa(zzcx zzcx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void AbstractList()>
		zzpb = zzcx1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field zzcx zzpb>
	//    5    9:return          
	}

	static zzcx zza(zzfa zzfa1)
	{
		return zzfa1.zzpb;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzcx zzpb>
	//    2    4:areturn         
	}

	public final Object get(int i)
	{
		return ((Object) ((String)zzpb.get(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzcx zzpb>
	//    2    4:iload_1         
	//    3    5:invokeinterface #25  <Method Object zzcx.get(int)>
	//    4   10:checkcast       #27  <Class String>
	//    5   13:areturn         
	}

	public final Object getRaw(int i)
	{
		return zzpb.getRaw(i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzcx zzpb>
	//    2    4:iload_1         
	//    3    5:invokeinterface #30  <Method Object zzcx.getRaw(int)>
	//    4   10:areturn         
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new zzfc(this)));
	//    0    0:new             #34  <Class zzfc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #37  <Method void zzfc(zzfa)>
	//    4    8:areturn         
	}

	public final ListIterator listIterator(int i)
	{
		return ((ListIterator) (new zzfb(this, i)));
	//    0    0:new             #43  <Class zzfb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #46  <Method void zzfb(zzfa, int)>
	//    5    9:areturn         
	}

	public final int size()
	{
		return zzpb.size();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzcx zzpb>
	//    2    4:invokeinterface #51  <Method int zzcx.size()>
	//    3    9:ireturn         
	}

	public final List zzbt()
	{
		return zzpb.zzbt();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzcx zzpb>
	//    2    4:invokeinterface #55  <Method List zzcx.zzbt()>
	//    3    9:areturn         
	}

	public final zzcx zzbu()
	{
		return ((zzcx) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private final zzcx zzpb;
}
