// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzgh, zzgj, DataLayer

final class zzaz extends zzgh
{

	public zzaz(DataLayer datalayer)
	{
		super(ID, new String[] {
			VALUE
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #24  <Field String ID>
	//    2    4:iconst_1        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #33  <Field String VALUE>
	//    7   13:aastore         
	//    8   14:invokespecial   #46  <Method void zzgh(String, String[])>
		zzazr = datalayer;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #48  <Field DataLayer zzazr>
	//   12   22:return          
	}

	public final void zze(Map map)
	{
		Object obj = ((Object) ((zzp)map.get(((Object) (VALUE)))));
	//    0    0:aload_1         
	//    1    1:getstatic       #33  <Field String VALUE>
	//    2    4:invokeinterface #56  <Method Object Map.get(Object)>
	//    3    9:checkcast       #58  <Class zzp>
	//    4   12:astore_2        
		if(obj != null && obj != zzgj.zzqk())
	//*   5   13:aload_2         
	//*   6   14:ifnull          88
	//*   7   17:aload_2         
	//*   8   18:invokestatic    #64  <Method Object zzgj.zzqk()>
	//*   9   21:if_acmpne       27
	//*  10   24:goto            88
		{
			obj = zzgj.zzh(((zzp) (obj)));
	//   11   27:aload_2         
	//   12   28:invokestatic    #68  <Method Object zzgj.zzh(zzp)>
	//   13   31:astore_2        
			if(obj instanceof List)
	//*  14   32:aload_2         
	//*  15   33:instanceof      #70  <Class List>
	//*  16   36:ifeq            88
			{
				obj = ((Object) (((List)obj).iterator()));
	//   17   39:aload_2         
	//   18   40:checkcast       #70  <Class List>
	//   19   43:invokeinterface #74  <Method Iterator List.iterator()>
	//   20   48:astore_2        
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break;
	//   21   49:aload_2         
	//   22   50:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//   23   55:ifeq            88
					Object obj1 = ((Iterator) (obj)).next();
	//   24   58:aload_2         
	//   25   59:invokeinterface #83  <Method Object Iterator.next()>
	//   26   64:astore_3        
					if(obj1 instanceof Map)
	//*  27   65:aload_3         
	//*  28   66:instanceof      #52  <Class Map>
	//*  29   69:ifeq            49
					{
						obj1 = ((Object) ((Map)obj1));
	//   30   72:aload_3         
	//   31   73:checkcast       #52  <Class Map>
	//   32   76:astore_3        
						zzazr.push(((Map) (obj1)));
	//   33   77:aload_0         
	//   34   78:getfield        #48  <Field DataLayer zzazr>
	//   35   81:aload_3         
	//   36   82:invokevirtual   #88  <Method void DataLayer.push(Map)>
					}
				} while(true);
	//   37   85:goto            49
			}
		}
		map = ((Map) ((zzp)map.get(((Object) (zzbbv)))));
	//   38   88:aload_1         
	//   39   89:getstatic       #38  <Field String zzbbv>
	//   40   92:invokeinterface #56  <Method Object Map.get(Object)>
	//   41   97:checkcast       #58  <Class zzp>
	//   42  100:astore_1        
		if(map != null)
	//*  43  101:aload_1         
	//*  44  102:ifnull          133
		{
			if(map == zzgj.zzqk())
	//*  45  105:aload_1         
	//*  46  106:invokestatic    #64  <Method Object zzgj.zzqk()>
	//*  47  109:if_acmpne       113
				return;
	//   48  112:return          
			map = ((Map) (zzgj.zzc(((zzp) (map)))));
	//   49  113:aload_1         
	//   50  114:invokestatic    #92  <Method String zzgj.zzc(zzp)>
	//   51  117:astore_1        
			if(map != zzgj.zzqp())
	//*  52  118:aload_1         
	//*  53  119:invokestatic    #95  <Method String zzgj.zzqp()>
	//*  54  122:if_acmpeq       133
				zzazr.zzdh(((String) (map)));
	//   55  125:aload_0         
	//   56  126:getfield        #48  <Field DataLayer zzazr>
	//   57  129:aload_1         
	//   58  130:invokevirtual   #99  <Method void DataLayer.zzdh(String)>
		}
	//   59  133:return          
	}

	private static final String ID;
	private static final String VALUE;
	private static final String zzbbv;
	private final DataLayer zzazr;

	static 
	{
		ID = zza.zzaq.toString();
	//    0    0:getstatic       #18  <Field zza zza.zzaq>
	//    1    3:invokevirtual   #22  <Method String zza.toString()>
	//    2    6:putstatic       #24  <Field String ID>
		VALUE = zzb.zznh.toString();
	//    3    9:getstatic       #30  <Field zzb zzb.zznh>
	//    4   12:invokevirtual   #31  <Method String zzb.toString()>
	//    5   15:putstatic       #33  <Field String VALUE>
		zzbbv = zzb.zzfd.toString();
	//    6   18:getstatic       #36  <Field zzb zzb.zzfd>
	//    7   21:invokevirtual   #31  <Method String zzb.toString()>
	//    8   24:putstatic       #38  <Field String zzbbv>
	//*   9   27:return          
	}
}
