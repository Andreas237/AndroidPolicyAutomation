// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zztz, zzjj, zzss

final class zzty
{

	zzty(zzjj zzjj, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		Preconditions.checkNotNull(((Object) (zzjj)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:pop             
		Preconditions.checkNotNull(((Object) (s)));
	//    5    9:aload_2         
	//    6   10:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object)>
	//    7   13:pop             
	//    8   14:aload_0         
	//    9   15:new             #30  <Class LinkedList>
	//   10   18:dup             
	//   11   19:invokespecial   #31  <Method void LinkedList()>
	//   12   22:putfield        #33  <Field LinkedList zzbon>
		zzboo = zzjj;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #35  <Field zzjj zzboo>
		zzye = s;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #37  <Field String zzye>
		zzbop = i;
	//   19   35:aload_0         
	//   20   36:iload_3         
	//   21   37:putfield        #39  <Field int zzbop>
	//   22   40:return          
	}

	static String zza(zzty zzty1)
	{
		return zzty1.zzye;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String zzye>
	//    2    4:areturn         
	}

	static zzjj zzb(zzty zzty1)
	{
		return zzty1.zzboo;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzjj zzboo>
	//    2    4:areturn         
	}

	final String getAdUnitId()
	{
		return zzye;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String zzye>
	//    2    4:areturn         
	}

	final int getNetworkType()
	{
		return zzbop;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int zzbop>
	//    2    4:ireturn         
	}

	final int size()
	{
		return zzbon.size();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LinkedList zzbon>
	//    2    4:invokevirtual   #51  <Method int LinkedList.size()>
	//    3    7:ireturn         
	}

	final void zza(zzss zzss, zzjj zzjj)
	{
		zzss = ((zzss) (new zztz(this, zzss, zzjj)));
	//    0    0:new             #54  <Class zztz>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #57  <Method void zztz(zzty, zzss, zzjj)>
	//    6   10:astore_1        
		zzbon.add(((Object) (zzss)));
	//    7   11:aload_0         
	//    8   12:getfield        #33  <Field LinkedList zzbon>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #61  <Method boolean LinkedList.add(Object)>
	//   11   19:pop             
	//   12   20:return          
	}

	final boolean zzb(zzss zzss)
	{
		zzss = ((zzss) (new zztz(this, zzss)));
	//    0    0:new             #54  <Class zztz>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #65  <Method void zztz(zzty, zzss)>
	//    5    9:astore_1        
		zzbon.add(((Object) (zzss)));
	//    6   10:aload_0         
	//    7   11:getfield        #33  <Field LinkedList zzbon>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #61  <Method boolean LinkedList.add(Object)>
	//   10   18:pop             
		return ((zztz) (zzss)).load();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #69  <Method boolean zztz.load()>
	//   13   23:ireturn         
	}

	final zztz zzl(zzjj zzjj)
	{
		if(zzjj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			zzboo = zzjj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field zzjj zzboo>
		return (zztz)zzbon.remove();
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field LinkedList zzbon>
	//    7   13:invokevirtual   #76  <Method Object LinkedList.remove()>
	//    8   16:checkcast       #54  <Class zztz>
	//    9   19:areturn         
	}

	final zzjj zzlf()
	{
		return zzboo;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field zzjj zzboo>
	//    2    4:areturn         
	}

	final int zzlg()
	{
		Iterator iterator = zzbon.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LinkedList zzbon>
	//    2    4:invokevirtual   #84  <Method Iterator LinkedList.iterator()>
	//    3    7:astore_2        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   10:aload_2         
	//    7   11:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//    8   16:ifeq            41
			if(((zztz)iterator.next()).zzwa)
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #92  <Method Object Iterator.next()>
	//*  11   25:checkcast       #54  <Class zztz>
	//*  12   28:getfield        #95  <Field boolean zztz.zzwa>
	//*  13   31:ifeq            10
				i++;
	//   14   34:iload_1         
	//   15   35:iconst_1        
	//   16   36:iadd            
	//   17   37:istore_1        
		} while(true);
	//   18   38:goto            10
		return i;
	//   19   41:iload_1         
	//   20   42:ireturn         
	}

	final int zzlh()
	{
		Iterator iterator = zzbon.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LinkedList zzbon>
	//    2    4:invokevirtual   #84  <Method Iterator LinkedList.iterator()>
	//    3    7:astore_2        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   10:aload_2         
	//    7   11:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//    8   16:ifeq            41
			if(((zztz)iterator.next()).load())
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #92  <Method Object Iterator.next()>
	//*  11   25:checkcast       #54  <Class zztz>
	//*  12   28:invokevirtual   #69  <Method boolean zztz.load()>
	//*  13   31:ifeq            10
				i++;
	//   14   34:iload_1         
	//   15   35:iconst_1        
	//   16   36:iadd            
	//   17   37:istore_1        
		} while(true);
	//   18   38:goto            10
		return i;
	//   19   41:iload_1         
	//   20   42:ireturn         
	}

	final void zzli()
	{
		zzboq = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #99  <Field boolean zzboq>
	//    3    5:return          
	}

	final boolean zzlj()
	{
		return zzboq;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean zzboq>
	//    2    4:ireturn         
	}

	private final LinkedList zzbon = new LinkedList();
	private zzjj zzboo;
	private final int zzbop;
	private boolean zzboq;
	private final String zzye;
}
