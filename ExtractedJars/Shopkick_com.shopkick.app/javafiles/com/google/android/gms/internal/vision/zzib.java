// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzhz, zzia

final class zzib
	implements Iterator
{

	private zzib(zzhz zzhz1)
	{
		zzaal = zzhz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzhz zzaal>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		pos = zzhz.zzb(zzaal).size();
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field zzhz zzaal>
	//    8   14:invokestatic    #27  <Method List zzhz.zzb(zzhz)>
	//    9   17:invokeinterface #33  <Method int List.size()>
	//   10   22:putfield        #35  <Field int pos>
	//   11   25:return          
	}

	zzib(zzhz zzhz1, zzia zzia)
	{
		this(zzhz1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method void zzib(zzhz)>
	//    3    5:return          
	}

	private final Iterator zzgz()
	{
		if(zzaak == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field Iterator zzaak>
	//*   2    4:ifnonnull       28
			zzaak = zzhz.zzd(zzaal).entrySet().iterator();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field zzhz zzaal>
	//    6   12:invokestatic    #47  <Method Map zzhz.zzd(zzhz)>
	//    7   15:invokeinterface #53  <Method Set Map.entrySet()>
	//    8   20:invokeinterface #58  <Method Iterator Set.iterator()>
	//    9   25:putfield        #43  <Field Iterator zzaak>
		return zzaak;
	//   10   28:aload_0         
	//   11   29:getfield        #43  <Field Iterator zzaak>
	//   12   32:areturn         
	}

	public final boolean hasNext()
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int pos>
	//    2    4:istore_1        
		return i > 0 && i <= zzhz.zzb(zzaal).size() || zzgz().hasNext();
	//    3    5:iload_1         
	//    4    6:ifle            25
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #18  <Field zzhz zzaal>
	//    8   14:invokestatic    #27  <Method List zzhz.zzb(zzhz)>
	//    9   17:invokeinterface #33  <Method int List.size()>
	//   10   22:icmple          37
	//   11   25:aload_0         
	//   12   26:invokespecial   #64  <Method Iterator zzgz()>
	//   13   29:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            39
	//   15   37:iconst_1        
	//   16   38:ireturn         
	//   17   39:iconst_0        
	//   18   40:ireturn         
	}

	public final Object next()
	{
		if(zzgz().hasNext())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #64  <Method Iterator zzgz()>
	//*   2    4:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//*   3    9:ifeq            25
		{
			return ((Object) ((java.util.Map.Entry)zzgz().next()));
	//    4   12:aload_0         
	//    5   13:invokespecial   #64  <Method Iterator zzgz()>
	//    6   16:invokeinterface #70  <Method Object Iterator.next()>
	//    7   21:checkcast       #72  <Class java.util.Map$Entry>
	//    8   24:areturn         
		} else
		{
			List list = zzhz.zzb(zzaal);
	//    9   25:aload_0         
	//   10   26:getfield        #18  <Field zzhz zzaal>
	//   11   29:invokestatic    #27  <Method List zzhz.zzb(zzhz)>
	//   12   32:astore_2        
			int i = pos - 1;
	//   13   33:aload_0         
	//   14   34:getfield        #35  <Field int pos>
	//   15   37:iconst_1        
	//   16   38:isub            
	//   17   39:istore_1        
			pos = i;
	//   18   40:aload_0         
	//   19   41:iload_1         
	//   20   42:putfield        #35  <Field int pos>
			return ((Object) ((java.util.Map.Entry)list.get(i)));
	//   21   45:aload_2         
	//   22   46:iload_1         
	//   23   47:invokeinterface #76  <Method Object List.get(int)>
	//   24   52:checkcast       #72  <Class java.util.Map$Entry>
	//   25   55:areturn         
		}
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
	private Iterator zzaak;
	private final zzhz zzaal;
}
