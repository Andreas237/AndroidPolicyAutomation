// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.games.GameManagerClient;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzbu, zzbl, zzcm, zzbn, 
//			zzbt, zzdm

final class zzbm extends zzbu
{

	zzbm(zzbl zzbl1, GameManagerClient gamemanagerclient)
	{
		zzth = zzbl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzbl zzth>
		super(zzbl1, gamemanagerclient);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #12  <Method void zzbu(zzbl, GameManagerClient)>
	//    7   11:return          
	}

	public final void execute()
	{
		Object obj;
		try
		{
			zzbl.zzb(zzth).setMessageReceivedCallbacks(zzbl.zza(zzth), ((zzcm) (zzth)).getNamespace(), ((com.google.android.gms.cast.Cast.MessageReceivedCallback) (new zzbn(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzbl zzth>
	//    2    4:invokestatic    #25  <Method com.google.android.gms.cast.Cast$CastApi zzbl.zzb(zzbl)>
	//    3    7:aload_0         
	//    4    8:getfield        #10  <Field zzbl zzth>
	//    5   11:invokestatic    #29  <Method com.google.android.gms.common.api.GoogleApiClient zzbl.zza(zzbl)>
	//    6   14:aload_0         
	//    7   15:getfield        #10  <Field zzbl zzth>
	//    8   18:invokevirtual   #35  <Method String zzcm.getNamespace()>
	//    9   21:new             #37  <Class zzbn>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:invokespecial   #40  <Method void zzbn(zzbm)>
	//   13   29:invokeinterface #46  <Method void com.google.android.gms.cast.Cast$CastApi.setMessageReceivedCallbacks(com.google.android.gms.common.api.GoogleApiClient, String, com.google.android.gms.cast.Cast$MessageReceivedCallback)>
		}
	//*  14   34:aload_0         
	//*  15   35:getfield        #10  <Field zzbl zzth>
	//*  16   38:invokestatic    #50  <Method void zzbl.zzc(zzbl)>
	//*  17   41:aload_0         
	//*  18   42:getfield        #10  <Field zzbl zzth>
	//*  19   45:invokestatic    #53  <Method void zzbl.zzd(zzbl)>
	//*  20   48:aload_0         
	//*  21   49:getfield        #10  <Field zzbl zzth>
	//*  22   52:aconst_null     
	//*  23   53:sipush          1100
	//*  24   56:aconst_null     
	//*  25   57:aload_0         
	//*  26   58:getfield        #59  <Field zzdm zzbt.zztp>
	//*  27   61:invokestatic    #62  <Method void zzbl.zza(zzbl, String, int, org.json.JSONObject, zzdm)>
	//*  28   64:return          
	//*  29   65:aload_0         
	//*  30   66:getfield        #59  <Field zzdm zzbt.zztp>
	//*  31   69:ldc2w           #63  <Long -1L>
	//*  32   72:bipush          8
	//*  33   74:aconst_null     
	//*  34   75:invokeinterface #69  <Method void zzdm.zza(long, int, Object)>
	//*  35   80:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			((zzbt)this).zztp.zza(-1L, 8, ((Object) (null)));
			return;
		}
		zzbl.zzc(zzth);
		zzbl.zzd(zzth);
		zzbl.zza(zzth, ((String) (null)), 1100, ((org.json.JSONObject) (null)), ((zzbt)this).zztp);
	//*  36   81:astore_1        
	//*  37   82:goto            65
	}

	final zzbl zzth;
}
