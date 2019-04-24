// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj, DataLayer

final class zzas extends zzbq
{

	public zzas(DataLayer datalayer)
	{
		super(ID, new String[] {
			NAME
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #25  <Field String ID>
	//    2    4:iconst_1        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #34  <Field String NAME>
	//    7   13:aastore         
	//    8   14:invokespecial   #47  <Method void zzbq(String, String[])>
		zzazr = datalayer;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #49  <Field DataLayer zzazr>
	//   12   22:return          
	}

	public final zzp zzc(Map map)
	{
		Object obj = zzazr.get(zzgj.zzc((zzp)map.get(((Object) (NAME)))));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field DataLayer zzazr>
	//    2    4:aload_1         
	//    3    5:getstatic       #34  <Field String NAME>
	//    4    8:invokeinterface #57  <Method Object Map.get(Object)>
	//    5   13:checkcast       #59  <Class zzp>
	//    6   16:invokestatic    #64  <Method String zzgj.zzc(zzp)>
	//    7   19:invokevirtual   #69  <Method Object DataLayer.get(String)>
	//    8   22:astore_2        
		if(obj == null)
	//*   9   23:aload_2         
	//*  10   24:ifnonnull       50
		{
			map = ((Map) ((zzp)map.get(((Object) (zzbbk)))));
	//   11   27:aload_1         
	//   12   28:getstatic       #39  <Field String zzbbk>
	//   13   31:invokeinterface #57  <Method Object Map.get(Object)>
	//   14   36:checkcast       #59  <Class zzp>
	//   15   39:astore_1        
			if(map != null)
	//*  16   40:aload_1         
	//*  17   41:ifnull          46
				return ((zzp) (map));
	//   18   44:aload_1         
	//   19   45:areturn         
			else
				return zzgj.zzqq();
	//   20   46:invokestatic    #73  <Method zzp zzgj.zzqq()>
	//   21   49:areturn         
		} else
		{
			return zzgj.zzj(obj);
	//   22   50:aload_2         
	//   23   51:invokestatic    #77  <Method zzp zzgj.zzj(Object)>
	//   24   54:areturn         
		}
	}

	public final boolean zznk()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final String NAME;
	private static final String zzbbk;
	private final DataLayer zzazr;

	static 
	{
		ID = zza.zzi.toString();
	//    0    0:getstatic       #19  <Field zza zza.zzi>
	//    1    3:invokevirtual   #23  <Method String zza.toString()>
	//    2    6:putstatic       #25  <Field String ID>
		NAME = zzb.zzjk.toString();
	//    3    9:getstatic       #31  <Field zzb zzb.zzjk>
	//    4   12:invokevirtual   #32  <Method String zzb.toString()>
	//    5   15:putstatic       #34  <Field String NAME>
		zzbbk = zzb.zzgp.toString();
	//    6   18:getstatic       #37  <Field zzb zzb.zzgp>
	//    7   21:invokevirtual   #32  <Method String zzb.toString()>
	//    8   24:putstatic       #39  <Field String zzbbk>
	//*   9   27:return          
	}
}
