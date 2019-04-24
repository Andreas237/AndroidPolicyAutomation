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
//			zzaau, zzaav, zzaat, zzaby, 
//			zzabx

public class zzaaq
	implements zzaau
{

	public zzaaq(zzaav zzaav1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzaBl = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean zzaBl>
		zzaBk = zzaav1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field zzaav zzaBk>
	//    8   14:return          
	}

	static zzaav zza(zzaaq zzaaq1)
	{
		return zzaaq1.zzaBk;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzaav zzaBk>
	//    2    4:areturn         
	}

	private void zze(zzaad.zza zza1)
		throws DeadObjectException
	{
		zzaBk.zzaAw.zzaBW.zzb(((zzaaf) (zza1)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzaav zzaBk>
	//    2    4:getfield        #36  <Field zzaat zzaav.zzaAw>
	//    3    7:getfield        #42  <Field zzaby zzaat.zzaBW>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #48  <Method void zzaby.zzb(zzaaf)>
		Object obj = ((Object) (zzaBk.zzaAw.zzc(zza1.zzvg())));
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field zzaav zzaBk>
	//    8   18:getfield        #36  <Field zzaat zzaav.zzaAw>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #54  <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//   11   25:invokevirtual   #58  <Method com.google.android.gms.common.api.Api$zze zzaat.zzc(com.google.android.gms.common.api.Api$zzc)>
	//   12   28:astore_2        
		if(!((com.google.android.gms.common.api.Api.zze) (obj)).isConnected() && zzaBk.zzaCf.containsKey(((Object) (zza1.zzvg()))))
	//*  13   29:aload_2         
	//*  14   30:invokeinterface #64  <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
	//*  15   35:ifne            71
	//*  16   38:aload_0         
	//*  17   39:getfield        #23  <Field zzaav zzaBk>
	//*  18   42:getfield        #68  <Field Map zzaav.zzaCf>
	//*  19   45:aload_1         
	//*  20   46:invokevirtual   #54  <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//*  21   49:invokeinterface #74  <Method boolean Map.containsKey(Object)>
	//*  22   54:ifeq            71
		{
			zza1.zzB(new Status(17));
	//   23   57:aload_1         
	//   24   58:new             #76  <Class Status>
	//   25   61:dup             
	//   26   62:bipush          17
	//   27   64:invokespecial   #79  <Method void Status(int)>
	//   28   67:invokevirtual   #83  <Method void zzaad$zza.zzB(Status)>
			return;
	//   29   70:return          
		}
		if(obj instanceof zzal)
	//*  30   71:aload_2         
	//*  31   72:instanceof      #85  <Class zzal>
	//*  32   75:ifeq            89
			obj = ((Object) (((zzal)obj).zzyn()));
	//   33   78:aload_2         
	//   34   79:checkcast       #85  <Class zzal>
	//   35   82:invokevirtual   #89  <Method com.google.android.gms.common.api.Api$zzg zzal.zzyn()>
	//   36   85:astore_2        
	//*  37   86:goto            89
		zza1.zzb(((com.google.android.gms.common.api.Api.zzb) (obj)));
	//   38   89:aload_1         
	//   39   90:aload_2         
	//   40   91:invokevirtual   #92  <Method void zzaad$zza.zzb(com.google.android.gms.common.api.Api$zzb)>
	//   41   94:return          
	}

	public void begin()
	{
	//    0    0:return          
	}

	public void connect()
	{
		if(zzaBl)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean zzaBl>
	//*   2    4:ifeq            28
		{
			zzaBl = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #21  <Field boolean zzaBl>
			zzaBk.zza(((zzaav.zza) (new zzaav.zza(((zzaau) (this))) {

				public void zzwe()
				{
					zzaaq.zza(zzaBm).zzaCj.zzo(((Bundle) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field zzaaq zzaBm>
				//    2    4:invokestatic    #24  <Method zzaav zzaaq.zza(zzaaq)>
				//    3    7:getfield        #30  <Field zzabc$zza zzaav.zzaCj>
				//    4   10:aconst_null     
				//    5   11:invokeinterface #36  <Method void zzabc$zza.zzo(Bundle)>
				//    6   16:return          
				}

				final zzaaq zzaBm;

			
			{
				zzaBm = zzaaq.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field zzaaq zzaBm>
				super(zzaau1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaav$zza(zzaau)>
			//    6   10:return          
			}
			}
)));
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field zzaav zzaBk>
	//    8   16:new             #10  <Class zzaaq$2>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokespecial   #100 <Method void zzaaq$2(zzaaq, zzaau)>
	//   13   25:invokevirtual   #103 <Method void zzaav.zza(zzaav$zza)>
		}
	//   14   28:return          
	}

	public boolean disconnect()
	{
		if(zzaBl)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean zzaBl>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(zzaBk.zzaAw.zzwq())
	//*   5    9:aload_0         
	//*   6   10:getfield        #23  <Field zzaav zzaBk>
	//*   7   13:getfield        #36  <Field zzaat zzaav.zzaAw>
	//*   8   16:invokevirtual   #107 <Method boolean zzaat.zzwq()>
	//*   9   19:ifeq            69
		{
			zzaBl = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #21  <Field boolean zzaBl>
			for(Iterator iterator = zzaBk.zzaAw.zzaBV.iterator(); iterator.hasNext(); ((zzabx)iterator.next()).zzxb());
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field zzaav zzaBk>
	//   15   31:getfield        #36  <Field zzaat zzaav.zzaAw>
	//   16   34:getfield        #111 <Field Set zzaat.zzaBV>
	//   17   37:invokeinterface #117 <Method Iterator Set.iterator()>
	//   18   42:astore_1        
	//   19   43:aload_1         
	//   20   44:invokeinterface #122 <Method boolean Iterator.hasNext()>
	//   21   49:ifeq            67
	//   22   52:aload_1         
	//   23   53:invokeinterface #126 <Method Object Iterator.next()>
	//   24   58:checkcast       #128 <Class zzabx>
	//   25   61:invokevirtual   #131 <Method void zzabx.zzxb()>
	//*  26   64:goto            43
			return false;
	//   27   67:iconst_0        
	//   28   68:ireturn         
		} else
		{
			zzaBk.zzh(((ConnectionResult) (null)));
	//   29   69:aload_0         
	//   30   70:getfield        #23  <Field zzaav zzaBk>
	//   31   73:aconst_null     
	//   32   74:invokevirtual   #135 <Method void zzaav.zzh(ConnectionResult)>
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
		zzaBk.zzh(((ConnectionResult) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzaav zzaBk>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #135 <Method void zzaav.zzh(ConnectionResult)>
		zzaBk.zzaCj.zzc(i, zzaBl);
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field zzaav zzaBk>
	//    6   12:getfield        #142 <Field zzabc$zza zzaav.zzaCj>
	//    7   15:iload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field boolean zzaBl>
	//   10   20:invokeinterface #147 <Method void zzabc$zza.zzc(int, boolean)>
	//   11   25:return          
	}

	public zzaad.zza zza(zzaad.zza zza1)
	{
		return zzb(zza1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #150 <Method zzaad$zza zzb(zzaad$zza)>
	//    3    5:areturn         
	}

	public void zza(ConnectionResult connectionresult, Api api, boolean flag)
	{
	//    0    0:return          
	}

	public zzaad.zza zzb(zzaad.zza zza1)
	{
		DeadObjectException deadobjectexception;
		try
		{
			zze(zza1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #155 <Method void zze(zzaad$zza)>
		}
	//*   3    5:aload_1         
	//*   4    6:areturn         
	//*   5    7:aload_0         
	//*   6    8:getfield        #23  <Field zzaav zzaBk>
	//*   7   11:new             #8   <Class zzaaq$1>
	//*   8   14:dup             
	//*   9   15:aload_0         
	//*  10   16:aload_0         
	//*  11   17:invokespecial   #156 <Method void zzaaq$1(zzaaq, zzaau)>
	//*  12   20:invokevirtual   #103 <Method void zzaav.zza(zzaav$zza)>
	//*  13   23:aload_1         
	//*  14   24:areturn         
		// Misplaced declaration of an exception variable
		catch(DeadObjectException deadobjectexception)
		{
			zzaBk.zza(((zzaav.zza) (new zzaav.zza(((zzaau) (this))) {

				public void zzwe()
				{
					zzaBm.onConnectionSuspended(1);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field zzaaq zzaBm>
				//    2    4:iconst_1        
				//    3    5:invokevirtual   #25  <Method void zzaaq.onConnectionSuspended(int)>
				//    4    8:return          
				}

				final zzaaq zzaBm;

			
			{
				zzaBm = zzaaq.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field zzaaq zzaBm>
				super(zzaau1);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void zzaav$zza(zzaau)>
			//    6   10:return          
			}
			}
)));
			return zza1;
		}
		return zza1;
	//*  15   25:astore_2        
	//*  16   26:goto            7
	}

	void zzwd()
	{
		if(zzaBl)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean zzaBl>
	//*   2    4:ifeq            30
		{
			zzaBl = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #21  <Field boolean zzaBl>
			zzaBk.zzaAw.zzaBW.release();
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field zzaav zzaBk>
	//    8   16:getfield        #36  <Field zzaat zzaav.zzaAw>
	//    9   19:getfield        #42  <Field zzaby zzaat.zzaBW>
	//   10   22:invokevirtual   #161 <Method void zzaby.release()>
			disconnect();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #163 <Method boolean disconnect()>
	//   13   29:pop             
		}
	//   14   30:return          
	}

	private final zzaav zzaBk;
	private boolean zzaBl;
}
