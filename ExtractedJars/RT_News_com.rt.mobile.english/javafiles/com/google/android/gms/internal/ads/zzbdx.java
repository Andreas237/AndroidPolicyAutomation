// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbdp, zzbdq

final class zzbdx
	implements Iterator
{

	private zzbdx(zzbdp zzbdp1)
	{
		zzdyq = zzbdp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field zzbdp zzdyq>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		pos = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #25  <Field int pos>
	//    8   14:return          
	}

	zzbdx(zzbdp zzbdp1, zzbdq zzbdq)
	{
		this(zzbdp1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void zzbdx(zzbdp)>
	//    3    5:return          
	}

	private final Iterator zzafx()
	{
		if(zzdyp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Iterator zzdyp>
	//*   2    4:ifnonnull       28
			zzdyp = zzbdp.zzc(zzdyq).entrySet().iterator();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field zzbdp zzdyq>
	//    6   12:invokestatic    #39  <Method Map zzbdp.zzc(zzbdp)>
	//    7   15:invokeinterface #45  <Method Set Map.entrySet()>
	//    8   20:invokeinterface #50  <Method Iterator Set.iterator()>
	//    9   25:putfield        #33  <Field Iterator zzdyp>
		return zzdyp;
	//   10   28:aload_0         
	//   11   29:getfield        #33  <Field Iterator zzdyp>
	//   12   32:areturn         
	}

	public final boolean hasNext()
	{
		if(pos + 1 >= zzbdp.zzb(zzdyq).size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field int pos>
	//*   2    4:iconst_1        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #20  <Field zzbdp zzdyq>
	//*   6   10:invokestatic    #58  <Method List zzbdp.zzb(zzbdp)>
	//*   7   13:invokeinterface #64  <Method int List.size()>
	//*   8   18:icmplt          52
			return !zzbdp.zzc(zzdyq).isEmpty() && zzafx().hasNext();
	//    9   21:aload_0         
	//   10   22:getfield        #20  <Field zzbdp zzdyq>
	//   11   25:invokestatic    #39  <Method Map zzbdp.zzc(zzbdp)>
	//   12   28:invokeinterface #67  <Method boolean Map.isEmpty()>
	//   13   33:ifne            50
	//   14   36:aload_0         
	//   15   37:invokespecial   #69  <Method Iterator zzafx()>
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
		zzdyu = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #75  <Field boolean zzdyu>
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
		Object obj;
		if(i < zzbdp.zzb(zzdyq).size())
	//*  11   17:iload_1         
	//*  12   18:aload_0         
	//*  13   19:getfield        #20  <Field zzbdp zzdyq>
	//*  14   22:invokestatic    #58  <Method List zzbdp.zzb(zzbdp)>
	//*  15   25:invokeinterface #64  <Method int List.size()>
	//*  16   30:icmpge          55
			obj = zzbdp.zzb(zzdyq).get(pos);
	//   17   33:aload_0         
	//   18   34:getfield        #20  <Field zzbdp zzdyq>
	//   19   37:invokestatic    #58  <Method List zzbdp.zzb(zzbdp)>
	//   20   40:aload_0         
	//   21   41:getfield        #25  <Field int pos>
	//   22   44:invokeinterface #79  <Method Object List.get(int)>
	//   23   49:astore_2        
		else
	//*  24   50:aload_2         
	//*  25   51:checkcast       #81  <Class java.util.Map$Entry>
	//*  26   54:areturn         
			obj = zzafx().next();
	//   27   55:aload_0         
	//   28   56:invokespecial   #69  <Method Iterator zzafx()>
	//   29   59:invokeinterface #83  <Method Object Iterator.next()>
	//   30   64:astore_2        
		return ((Object) ((java.util.Map.Entry)obj));
	//*  31   65:goto            50
	}

	public final void remove()
	{
		if(!zzdyu)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field boolean zzdyu>
	//*   2    4:ifne            17
			throw new IllegalStateException("remove() was called before next()");
	//    3    7:new             #86  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #88  <String "remove() was called before next()">
	//    6   13:invokespecial   #91  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		zzdyu = false;
	//    8   17:aload_0         
	//    9   18:iconst_0        
	//   10   19:putfield        #75  <Field boolean zzdyu>
		zzbdp.zza(zzdyq);
	//   11   22:aload_0         
	//   12   23:getfield        #20  <Field zzbdp zzdyq>
	//   13   26:invokestatic    #94  <Method void zzbdp.zza(zzbdp)>
		if(pos < zzbdp.zzb(zzdyq).size())
	//*  14   29:aload_0         
	//*  15   30:getfield        #25  <Field int pos>
	//*  16   33:aload_0         
	//*  17   34:getfield        #20  <Field zzbdp zzdyq>
	//*  18   37:invokestatic    #58  <Method List zzbdp.zzb(zzbdp)>
	//*  19   40:invokeinterface #64  <Method int List.size()>
	//*  20   45:icmpge          72
		{
			zzbdp zzbdp1 = zzdyq;
	//   21   48:aload_0         
	//   22   49:getfield        #20  <Field zzbdp zzdyq>
	//   23   52:astore_2        
			int i = pos;
	//   24   53:aload_0         
	//   25   54:getfield        #25  <Field int pos>
	//   26   57:istore_1        
			pos = i - 1;
	//   27   58:aload_0         
	//   28   59:iload_1         
	//   29   60:iconst_1        
	//   30   61:isub            
	//   31   62:putfield        #25  <Field int pos>
			zzbdp.zza(zzbdp1, i);
	//   32   65:aload_2         
	//   33   66:iload_1         
	//   34   67:invokestatic    #97  <Method Object zzbdp.zza(zzbdp, int)>
	//   35   70:pop             
			return;
	//   36   71:return          
		} else
		{
			zzafx().remove();
	//   37   72:aload_0         
	//   38   73:invokespecial   #69  <Method Iterator zzafx()>
	//   39   76:invokeinterface #99  <Method void Iterator.remove()>
			return;
	//   40   81:return          
		}
	}

	private int pos;
	private Iterator zzdyp;
	private final zzbdp zzdyq;
	private boolean zzdyu;
}
