// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzr, zzamc, zzamy, zzap, 
//			zzx, zzp, zzaoj

public final class zzamb extends zzr
{

	public zzamb(String s, zzaoj zzaoj1)
	{
		this(s, ((Map) (null)), zzaoj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #18  <Method void zzamb(String, Map, zzaoj)>
	//    5    7:return          
	}

	private zzamb(String s, Map map, zzaoj zzaoj1)
	{
		super(0, s, ((zzy) (new zzamc(zzaoj1))));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:new             #23  <Class zzamc>
	//    4    6:dup             
	//    5    7:aload_3         
	//    6    8:invokespecial   #26  <Method void zzamc(zzaoj)>
	//    7   11:invokespecial   #29  <Method void zzr(int, String, zzy)>
		zzcto = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #31  <Field Map zzcto>
		zzctn = zzaoj1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #33  <Field zzaoj zzctn>
		zzctp = new zzamy();
	//   14   24:aload_0         
	//   15   25:new             #35  <Class zzamy>
	//   16   28:dup             
	//   17   29:invokespecial   #38  <Method void zzamy()>
	//   18   32:putfield        #40  <Field zzamy zzctp>
		zzctp.zza(s, "GET", ((Map) (null)), ((byte []) (null)));
	//   19   35:aload_0         
	//   20   36:getfield        #40  <Field zzamy zzctp>
	//   21   39:aload_1         
	//   22   40:ldc1            #42  <String "GET">
	//   23   42:aconst_null     
	//   24   43:aconst_null     
	//   25   44:invokevirtual   #46  <Method void zzamy.zza(String, String, Map, byte[])>
	//   26   47:return          
	}

	protected final zzx zza(zzp zzp1)
	{
		return zzx.zza(((Object) (zzp1)), zzap.zzb(zzp1));
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:invokestatic    #54  <Method zzc zzap.zzb(zzp)>
	//    3    5:invokestatic    #59  <Method zzx zzx.zza(Object, zzc)>
	//    4    8:areturn         
	}

	protected final void zza(Object obj)
	{
		obj = ((Object) ((zzp)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #63  <Class zzp>
	//    2    4:astore_1        
		zzctp.zza(((zzp) (obj)).zzab, ((zzp) (obj)).statusCode);
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field zzamy zzctp>
	//    5    9:aload_1         
	//    6   10:getfield        #66  <Field Map zzp.zzab>
	//    7   13:aload_1         
	//    8   14:getfield        #70  <Field int zzp.statusCode>
	//    9   17:invokevirtual   #73  <Method void zzamy.zza(Map, int)>
		zzamy zzamy1 = zzctp;
	//   10   20:aload_0         
	//   11   21:getfield        #40  <Field zzamy zzctp>
	//   12   24:astore_2        
		byte abyte0[] = ((zzp) (obj)).data;
	//   13   25:aload_1         
	//   14   26:getfield        #77  <Field byte[] zzp.data>
	//   15   29:astore_3        
		if(zzamy.isEnabled() && abyte0 != null)
	//*  16   30:invokestatic    #81  <Method boolean zzamy.isEnabled()>
	//*  17   33:ifeq            45
	//*  18   36:aload_3         
	//*  19   37:ifnull          45
			zzamy1.zzf(abyte0);
	//   20   40:aload_2         
	//   21   41:aload_3         
	//   22   42:invokevirtual   #85  <Method void zzamy.zzf(byte[])>
		zzctn.set(obj);
	//   23   45:aload_0         
	//   24   46:getfield        #33  <Field zzaoj zzctn>
	//   25   49:aload_1         
	//   26   50:invokevirtual   #90  <Method void zzaoj.set(Object)>
	//   27   53:return          
	}

	private final zzaoj zzctn;
	private final Map zzcto;
	private final zzamy zzctp;
}
