// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzal;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaam, zzaan, zzaal, zzabq, 
//			zzabp

public class zzaai
	implements zzaam
{

	public zzaai(zzaan zzaan1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzazL = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean zzazL>
		zzazK = zzaan1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field zzaan zzazK>
	//    8   14:return          
	}

	static zzaan zza(zzaai zzaai1)
	{
		return zzaai1.zzazK;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzaan zzazK>
	//    2    4:areturn         
	}

	private void zzd(zzzv.zza zza1)
		throws DeadObjectException
	{
		zzazK.zzazd.zzaAx.zzb(((zzzx) (zza1)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzaan zzazK>
	//    2    4:getfield        #36  <Field zzaal zzaan.zzazd>
	//    3    7:getfield        #42  <Field zzabq zzaal.zzaAx>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #48  <Method void zzabq.zzb(zzzx)>
		com.google.android.gms.common.api.Api.zze zze = zzazK.zzazd.zzb(zza1.zzuH());
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field zzaan zzazK>
	//    8   18:getfield        #36  <Field zzaal zzaan.zzazd>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #54  <Method com.google.android.gms.common.api.Api$zzc zzzv$zza.zzuH()>
	//   11   25:invokevirtual   #57  <Method com.google.android.gms.common.api.Api$zze zzaal.zzb(com.google.android.gms.common.api.Api$zzc)>
	//   12   28:astore_3        
		if(!zze.isConnected() && zzazK.zzaAG.containsKey(((Object) (zza1.zzuH()))))
	//*  13   29:aload_3         
	//*  14   30:invokeinterface #63  <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
	//*  15   35:ifne            71
	//*  16   38:aload_0         
	//*  17   39:getfield        #23  <Field zzaan zzazK>
	//*  18   42:getfield        #67  <Field Map zzaan.zzaAG>
	//*  19   45:aload_1         
	//*  20   46:invokevirtual   #54  <Method com.google.android.gms.common.api.Api$zzc zzzv$zza.zzuH()>
	//*  21   49:invokeinterface #73  <Method boolean Map.containsKey(Object)>
	//*  22   54:ifeq            71
		{
			zza1.zzA(new Status(17));
	//   23   57:aload_1         
	//   24   58:new             #75  <Class Status>
	//   25   61:dup             
	//   26   62:bipush          17
	//   27   64:invokespecial   #78  <Method void Status(int)>
	//   28   67:invokevirtual   #82  <Method void zzzv$zza.zzA(Status)>
			return;
	//   29   70:return          
		}
		Object obj = ((Object) (zze));
	//   30   71:aload_3         
	//   31   72:astore_2        
		if(zze instanceof zzal)
	//*  32   73:aload_3         
	//*  33   74:instanceof      #84  <Class zzal>
	//*  34   77:ifeq            88
			obj = ((Object) (((zzal)zze).zzxG()));
	//   35   80:aload_3         
	//   36   81:checkcast       #84  <Class zzal>
	//   37   84:invokevirtual   #88  <Method com.google.android.gms.common.api.Api$zzg zzal.zzxG()>
	//   38   87:astore_2        
		zza1.zzb(((com.google.android.gms.common.api.Api.zzb) (obj)));
	//   39   88:aload_1         
	//   40   89:aload_2         
	//   41   90:invokevirtual   #91  <Method void zzzv$zza.zzb(com.google.android.gms.common.api.Api$zzb)>
	//   42   93:return          
	}

	public void begin()
	{
	//    0    0:return          
	}

	public void connect()
	{
		if(zzazL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean zzazL>
	//*   2    4:ifeq            28
		{
			zzazL = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #21  <Field boolean zzazL>
			zzazK.zza(((zzaan.zza) (new zzaan.zza(((zzaam) (this))) {

				public void zzvA()
				{
					zzaai.zza(zzazM).zzaAK.zzo(((Bundle) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field zzaai zzazM>
				//    2    4:invokestatic    #24  <Method zzaan zzaai.zza(zzaai)>
				//    3    7:getfield        #30  <Field zzaau$zza zzaan.zzaAK>
				//    4   10:aconst_null     
				//    5   11:invokeinterface #36  <Method void zzaau$zza.zzo(Bundle)>
				//    6   16:return          
				}

				final zzaai zzazM;

			
			{
				zzazM = zzaai.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field zzaai zzazM>
				super(zzaam1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaan$zza(zzaam)>
			//    6   10:return          
			}
			}
)));
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field zzaan zzazK>
	//    8   16:new             #10  <Class zzaai$2>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokespecial   #99  <Method void zzaai$2(zzaai, zzaam)>
	//   13   25:invokevirtual   #102 <Method void zzaan.zza(zzaan$zza)>
		}
	//   14   28:return          
	}

	public boolean disconnect()
	{
		if(zzazL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean zzazL>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(zzazK.zzazd.zzvM())
	//*   5    9:aload_0         
	//*   6   10:getfield        #23  <Field zzaan zzazK>
	//*   7   13:getfield        #36  <Field zzaal zzaan.zzazd>
	//*   8   16:invokevirtual   #106 <Method boolean zzaal.zzvM()>
	//*   9   19:ifeq            69
		{
			zzazL = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #21  <Field boolean zzazL>
			for(Iterator iterator = zzazK.zzazd.zzaAw.iterator(); iterator.hasNext(); ((zzabp)iterator.next()).zzwu());
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field zzaan zzazK>
	//   15   31:getfield        #36  <Field zzaal zzaan.zzazd>
	//   16   34:getfield        #110 <Field Set zzaal.zzaAw>
	//   17   37:invokeinterface #116 <Method Iterator Set.iterator()>
	//   18   42:astore_1        
	//   19   43:aload_1         
	//   20   44:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//   21   49:ifeq            67
	//   22   52:aload_1         
	//   23   53:invokeinterface #125 <Method Object Iterator.next()>
	//   24   58:checkcast       #127 <Class zzabp>
	//   25   61:invokevirtual   #130 <Method void zzabp.zzwu()>
	//*  26   64:goto            43
			return false;
	//   27   67:iconst_0        
	//   28   68:ireturn         
		} else
		{
			zzazK.zzh(((ConnectionResult) (null)));
	//   29   69:aload_0         
	//   30   70:getfield        #23  <Field zzaan zzazK>
	//   31   73:aconst_null     
	//   32   74:invokevirtual   #134 <Method void zzaan.zzh(ConnectionResult)>
			return true;
	//   33   77:iconst_1        
	//   34   78:ireturn         
		}
	}

	public void onConnected(Bundle bundle)
	{
	//    0    0:return          
	}

	public void onConnectionSuspended(int i)
	{
		zzazK.zzh(((ConnectionResult) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzaan zzazK>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #134 <Method void zzaan.zzh(ConnectionResult)>
		zzazK.zzaAK.zzc(i, zzazL);
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field zzaan zzazK>
	//    6   12:getfield        #141 <Field zzaau$zza zzaan.zzaAK>
	//    7   15:iload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field boolean zzazL>
	//   10   20:invokeinterface #147 <Method void zzaau$zza.zzc(int, boolean)>
	//   11   25:return          
	}

	public zzzv.zza zza(zzzv.zza zza1)
	{
		return zzb(zza1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #150 <Method zzzv$zza zzb(zzzv$zza)>
	//    3    5:areturn         
	}

	public void zza(ConnectionResult connectionresult, Api api, int i)
	{
	//    0    0:return          
	}

	public zzzv.zza zzb(zzzv.zza zza1)
	{
		try
		{
			zzd(zza1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #155 <Method void zzd(zzzv$zza)>
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
		catch(DeadObjectException deadobjectexception)
	//*   5    7:astore_2        
		{
			zzazK.zza(((zzaan.zza) (new zzaan.zza(((zzaam) (this))) {

				public void zzvA()
				{
					zzazM.onConnectionSuspended(1);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field zzaai zzazM>
				//    2    4:iconst_1        
				//    3    5:invokevirtual   #25  <Method void zzaai.onConnectionSuspended(int)>
				//    4    8:return          
				}

				final zzaai zzazM;

			
			{
				zzazM = zzaai.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field zzaai zzazM>
				super(zzaam1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaan$zza(zzaam)>
			//    6   10:return          
			}
			}
)));
	//    6    8:aload_0         
	//    7    9:getfield        #23  <Field zzaan zzazK>
	//    8   12:new             #8   <Class zzaai$1>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:aload_0         
	//   12   18:invokespecial   #156 <Method void zzaai$1(zzaai, zzaam)>
	//   13   21:invokevirtual   #102 <Method void zzaan.zza(zzaan$zza)>
			return zza1;
	//   14   24:aload_1         
	//   15   25:areturn         
		}
		return zza1;
	}

	void zzvz()
	{
		if(zzazL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean zzazL>
	//*   2    4:ifeq            30
		{
			zzazL = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #21  <Field boolean zzazL>
			zzazK.zzazd.zzaAx.release();
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field zzaan zzazK>
	//    8   16:getfield        #36  <Field zzaal zzaan.zzazd>
	//    9   19:getfield        #42  <Field zzabq zzaal.zzaAx>
	//   10   22:invokevirtual   #161 <Method void zzabq.release()>
			disconnect();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #163 <Method boolean disconnect()>
	//   13   29:pop             
		}
	//   14   30:return          
	}

	private final zzaan zzazK;
	private boolean zzazL;
}
