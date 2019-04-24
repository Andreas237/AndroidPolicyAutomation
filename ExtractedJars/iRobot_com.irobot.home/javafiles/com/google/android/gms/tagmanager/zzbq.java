// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzp;
import java.util.*;

abstract class zzbq
{

	public transient zzbq(String s, String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzqn = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field String zzqn>
		zzbcj = ((Set) (new HashSet(as.length)));
	//    5    9:aload_0         
	//    6   10:new             #18  <Class HashSet>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:arraylength     
	//   10   16:invokespecial   #21  <Method void HashSet(int)>
	//   11   19:putfield        #23  <Field Set zzbcj>
		int j = as.length;
	//   12   22:aload_2         
	//   13   23:arraylength     
	//   14   24:istore          4
		for(int i = 0; i < j; i++)
	//*  15   26:iconst_0        
	//*  16   27:istore_3        
	//*  17   28:iload_3         
	//*  18   29:iload           4
	//*  19   31:icmpge          56
		{
			s = as[i];
	//   20   34:aload_2         
	//   21   35:iload_3         
	//   22   36:aaload          
	//   23   37:astore_1        
			zzbcj.add(((Object) (s)));
	//   24   38:aload_0         
	//   25   39:getfield        #23  <Field Set zzbcj>
	//   26   42:aload_1         
	//   27   43:invokeinterface #29  <Method boolean Set.add(Object)>
	//   28   48:pop             
		}

	//   29   49:iload_3         
	//   30   50:iconst_1        
	//   31   51:iadd            
	//   32   52:istore_3        
	//*  33   53:goto            28
	//   34   56:return          
	}

	final boolean zza(Set set)
	{
		return set.containsAll(((java.util.Collection) (zzbcj)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field Set zzbcj>
	//    3    5:invokeinterface #36  <Method boolean Set.containsAll(java.util.Collection)>
	//    4   10:ireturn         
	}

	public abstract zzp zzc(Map map);

	public abstract boolean zznk();

	public String zzot()
	{
		return zzqn;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String zzqn>
	//    2    4:areturn         
	}

	public Set zzou()
	{
		return zzbcj;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Set zzbcj>
	//    2    4:areturn         
	}

	private final Set zzbcj;
	private final String zzqn;
}
