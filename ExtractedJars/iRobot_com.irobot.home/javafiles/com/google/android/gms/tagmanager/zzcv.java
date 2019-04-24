// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.measurement.*;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj, zzcw

final class zzcv extends zzbq
{

	public zzcv(Context context)
	{
		super(ID, new String[0]);
	//    0    0:aload_0         
	//    1    1:getstatic       #23  <Field String ID>
	//    2    4:iconst_0        
	//    3    5:anewarray       String[]
	//    4    8:invokespecial   #40  <Method void zzbq(String, String[])>
		zzri = context;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #42  <Field Context zzri>
	//    8   16:return          
	}

	public final zzp zzc(Map map)
	{
		if((zzp)map.get(((Object) (zzazi))) != null)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #32  <Field String zzazi>
	//*   2    4:invokeinterface #50  <Method Object Map.get(Object)>
	//*   3    9:checkcast       #52  <Class zzp>
	//*   4   12:ifnull          34
			map = ((Map) (zzgj.zzc((zzp)map.get(((Object) (zzazi))))));
	//    5   15:aload_1         
	//    6   16:getstatic       #32  <Field String zzazi>
	//    7   19:invokeinterface #50  <Method Object Map.get(Object)>
	//    8   24:checkcast       #52  <Class zzp>
	//    9   27:invokestatic    #57  <Method String zzgj.zzc(zzp)>
	//   10   30:astore_1        
		else
	//*  11   31:goto            36
			map = null;
	//   12   34:aconst_null     
	//   13   35:astore_1        
		map = ((Map) (zzcw.zzg(zzri, ((String) (map)))));
	//   14   36:aload_0         
	//   15   37:getfield        #42  <Field Context zzri>
	//   16   40:aload_1         
	//   17   41:invokestatic    #63  <Method String zzcw.zzg(Context, String)>
	//   18   44:astore_1        
		if(map != null)
	//*  19   45:aload_1         
	//*  20   46:ifnull          54
			return zzgj.zzj(((Object) (map)));
	//   21   49:aload_1         
	//   22   50:invokestatic    #67  <Method zzp zzgj.zzj(Object)>
	//   23   53:areturn         
		else
			return zzgj.zzqq();
	//   24   54:invokestatic    #71  <Method zzp zzgj.zzqq()>
	//   25   57:areturn         
	}

	public final boolean zznk()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final String zzazi;
	private final Context zzri;

	static 
	{
		ID = zza.zzam.toString();
	//    0    0:getstatic       #17  <Field zza zza.zzam>
	//    1    3:invokevirtual   #21  <Method String zza.toString()>
	//    2    6:putstatic       #23  <Field String ID>
		zzazi = zzb.zzfi.toString();
	//    3    9:getstatic       #29  <Field zzb zzb.zzfi>
	//    4   12:invokevirtual   #30  <Method String zzb.toString()>
	//    5   15:putstatic       #32  <Field String zzazi>
	//*   6   18:return          
	}
}
