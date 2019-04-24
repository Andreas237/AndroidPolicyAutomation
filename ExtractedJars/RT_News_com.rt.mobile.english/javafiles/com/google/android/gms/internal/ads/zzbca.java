// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbx, zzbbz

final class zzbca
	implements Iterator
{

	public zzbca(Iterator iterator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzdvj = iterator;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Iterator zzdvj>
	//    5    9:return          
	}

	public final boolean hasNext()
	{
		return zzdvj.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Iterator zzdvj>
	//    2    4:invokeinterface #24  <Method boolean Iterator.hasNext()>
	//    3    9:ireturn         
	}

	public final Object next()
	{
		java.util.Map.Entry entry = (java.util.Map.Entry)zzdvj.next();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Iterator zzdvj>
	//    2    4:invokeinterface #28  <Method Object Iterator.next()>
	//    3    9:checkcast       #30  <Class java.util.Map$Entry>
	//    4   12:astore_1        
		if(entry.getValue() instanceof zzbbx)
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #33  <Method Object java.util.Map$Entry.getValue()>
	//*   7   19:instanceof      #35  <Class zzbbx>
	//*   8   22:ifeq            35
			return ((Object) (new zzbbz(entry, ((zzbby) (null)))));
	//    9   25:new             #37  <Class zzbbz>
	//   10   28:dup             
	//   11   29:aload_1         
	//   12   30:aconst_null     
	//   13   31:invokespecial   #40  <Method void zzbbz(java.util.Map$Entry, zzbby)>
	//   14   34:areturn         
		else
			return ((Object) (entry));
	//   15   35:aload_1         
	//   16   36:areturn         
	}

	public final void remove()
	{
		zzdvj.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Iterator zzdvj>
	//    2    4:invokeinterface #43  <Method void Iterator.remove()>
	//    3    9:return          
	}

	private Iterator zzdvj;
}
