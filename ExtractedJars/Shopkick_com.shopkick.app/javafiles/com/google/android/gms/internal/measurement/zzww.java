// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwo, zzwp

final class zzww
	implements Iterator
{

	private zzww(zzwo zzwo1)
	{
		zzcby = zzwo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field zzwo zzcby>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		pos = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #25  <Field int pos>
	//    8   14:return          
	}

	zzww(zzwo zzwo1, zzwp zzwp)
	{
		this(zzwo1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void zzww(zzwo)>
	//    3    5:return          
	}

	private final Iterator zzyh()
	{
		if(zzcbx == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Iterator zzcbx>
	//*   2    4:ifnonnull       28
			zzcbx = zzwo.zzc(zzcby).entrySet().iterator();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field zzwo zzcby>
	//    6   12:invokestatic    #39  <Method Map zzwo.zzc(zzwo)>
	//    7   15:invokeinterface #45  <Method Set Map.entrySet()>
	//    8   20:invokeinterface #50  <Method Iterator Set.iterator()>
	//    9   25:putfield        #33  <Field Iterator zzcbx>
		return zzcbx;
	//   10   28:aload_0         
	//   11   29:getfield        #33  <Field Iterator zzcbx>
	//   12   32:areturn         
	}

	public final boolean hasNext()
	{
		if(pos + 1 >= zzwo.zzb(zzcby).size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field int pos>
	//*   2    4:iconst_1        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #20  <Field zzwo zzcby>
	//*   6   10:invokestatic    #58  <Method List zzwo.zzb(zzwo)>
	//*   7   13:invokeinterface #64  <Method int List.size()>
	//*   8   18:icmplt          52
			return !zzwo.zzc(zzcby).isEmpty() && zzyh().hasNext();
	//    9   21:aload_0         
	//   10   22:getfield        #20  <Field zzwo zzcby>
	//   11   25:invokestatic    #39  <Method Map zzwo.zzc(zzwo)>
	//   12   28:invokeinterface #67  <Method boolean Map.isEmpty()>
	//   13   33:ifne            50
	//   14   36:aload_0         
	//   15   37:invokespecial   #69  <Method Iterator zzyh()>
	//   16   40:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//   17   45:ifeq            50
	//   18   48:iconst_1        
	//   19   49:ireturn         
	//   20   50:iconst_0        
	//   21   51:ireturn         
		else
			return true;
	//   22   52:iconst_1        
	//   23   53:ireturn         
	}

	public final Object next()
	{
		zzccc = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #75  <Field boolean zzccc>
		int i = pos + 1;
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field int pos>
	//    5    9:iconst_1        
	//    6   10:iadd            
	//    7   11:istore_1        
		pos = i;
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:putfield        #25  <Field int pos>
		if(i < zzwo.zzb(zzcby).size())
	//*  11   17:iload_1         
	//*  12   18:aload_0         
	//*  13   19:getfield        #20  <Field zzwo zzcby>
	//*  14   22:invokestatic    #58  <Method List zzwo.zzb(zzwo)>
	//*  15   25:invokeinterface #64  <Method int List.size()>
	//*  16   30:icmpge          53
			return ((Object) ((java.util.Map.Entry)zzwo.zzb(zzcby).get(pos)));
	//   17   33:aload_0         
	//   18   34:getfield        #20  <Field zzwo zzcby>
	//   19   37:invokestatic    #58  <Method List zzwo.zzb(zzwo)>
	//   20   40:aload_0         
	//   21   41:getfield        #25  <Field int pos>
	//   22   44:invokeinterface #79  <Method Object List.get(int)>
	//   23   49:checkcast       #81  <Class java.util.Map$Entry>
	//   24   52:areturn         
		else
			return ((Object) ((java.util.Map.Entry)zzyh().next()));
	//   25   53:aload_0         
	//   26   54:invokespecial   #69  <Method Iterator zzyh()>
	//   27   57:invokeinterface #83  <Method Object Iterator.next()>
	//   28   62:checkcast       #81  <Class java.util.Map$Entry>
	//   29   65:areturn         
	}

	public final void remove()
	{
		if(zzccc)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field boolean zzccc>
	//*   2    4:ifeq            72
		{
			zzccc = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #75  <Field boolean zzccc>
			zzwo.zza(zzcby);
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field zzwo zzcby>
	//    8   16:invokestatic    #87  <Method void zzwo.zza(zzwo)>
			if(pos < zzwo.zzb(zzcby).size())
	//*   9   19:aload_0         
	//*  10   20:getfield        #25  <Field int pos>
	//*  11   23:aload_0         
	//*  12   24:getfield        #20  <Field zzwo zzcby>
	//*  13   27:invokestatic    #58  <Method List zzwo.zzb(zzwo)>
	//*  14   30:invokeinterface #64  <Method int List.size()>
	//*  15   35:icmpge          62
			{
				zzwo zzwo1 = zzcby;
	//   16   38:aload_0         
	//   17   39:getfield        #20  <Field zzwo zzcby>
	//   18   42:astore_2        
				int i = pos;
	//   19   43:aload_0         
	//   20   44:getfield        #25  <Field int pos>
	//   21   47:istore_1        
				pos = i - 1;
	//   22   48:aload_0         
	//   23   49:iload_1         
	//   24   50:iconst_1        
	//   25   51:isub            
	//   26   52:putfield        #25  <Field int pos>
				zzwo.zza(zzwo1, i);
	//   27   55:aload_2         
	//   28   56:iload_1         
	//   29   57:invokestatic    #90  <Method Object zzwo.zza(zzwo, int)>
	//   30   60:pop             
				return;
	//   31   61:return          
			} else
			{
				zzyh().remove();
	//   32   62:aload_0         
	//   33   63:invokespecial   #69  <Method Iterator zzyh()>
	//   34   66:invokeinterface #92  <Method void Iterator.remove()>
				return;
	//   35   71:return          
			}
		} else
		{
			throw new IllegalStateException("remove() was called before next()");
	//   36   72:new             #94  <Class IllegalStateException>
	//   37   75:dup             
	//   38   76:ldc1            #96  <String "remove() was called before next()">
	//   39   78:invokespecial   #99  <Method void IllegalStateException(String)>
	//   40   81:athrow          
		}
	}

	private int pos;
	private Iterator zzcbx;
	private final zzwo zzcby;
	private boolean zzccc;
}
