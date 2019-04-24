// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.app.PendingIntent;
import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.cast.*;
import com.google.android.gms.tasks.Task;

// Referenced classes of package com.google.android.gms.cast:
//			zzp, zzq, zzs, CastDevice

public class CastRemoteDisplayClient extends GoogleApi
{
	private static class zza extends zzed
	{

		public void onDisconnected()
			throws RemoteException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #19  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public void onError(int i)
			throws RemoteException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #19  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public void zza(int i, int j, Surface surface)
			throws RemoteException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #19  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public void zzc()
			throws RemoteException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #19  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void zzed()>
		//    2    4:return          
		}

		zza(zzp zzp1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CastRemoteDisplayClient$zza()>
		//    2    4:return          
		}
	}


	CastRemoteDisplayClient(Context context)
	{
		super(context, API, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #45  <Field Api API>
	//    3    5:aconst_null     
	//    4    6:getstatic       #54  <Field com.google.android.gms.common.api.GoogleApi$Settings com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS>
	//    5    9:invokespecial   #57  <Method void GoogleApi(Context, Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.GoogleApi$Settings)>
	//    6   12:aload_0         
	//    7   13:new             #59  <Class zzdg>
	//    8   16:dup             
	//    9   17:ldc1            #61  <String "CastRemoteDisplay">
	//   10   19:invokespecial   #64  <Method void zzdg(String)>
	//   11   22:putfield        #66  <Field zzdg zzbd>
	//   12   25:return          
	}

	private final void a_()
	{
		if(zzbe != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field VirtualDisplay zzbe>
	//*   2    4:ifnull          80
		{
			if(zzbe.getDisplay() != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #70  <Field VirtualDisplay zzbe>
	//*   5   11:invokevirtual   #76  <Method Display VirtualDisplay.getDisplay()>
	//*   6   14:ifnull          68
			{
				zzdg zzdg1 = zzbd;
	//    7   17:aload_0         
	//    8   18:getfield        #66  <Field zzdg zzbd>
	//    9   21:astore_2        
				int i = zzbe.getDisplay().getDisplayId();
	//   10   22:aload_0         
	//   11   23:getfield        #70  <Field VirtualDisplay zzbe>
	//   12   26:invokevirtual   #76  <Method Display VirtualDisplay.getDisplay()>
	//   13   29:invokevirtual   #82  <Method int Display.getDisplayId()>
	//   14   32:istore_1        
				StringBuilder stringbuilder = new StringBuilder(38);
	//   15   33:new             #84  <Class StringBuilder>
	//   16   36:dup             
	//   17   37:bipush          38
	//   18   39:invokespecial   #87  <Method void StringBuilder(int)>
	//   19   42:astore_3        
				stringbuilder.append("releasing virtual display: ");
	//   20   43:aload_3         
	//   21   44:ldc1            #89  <String "releasing virtual display: ">
	//   22   46:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
				stringbuilder.append(i);
	//   24   50:aload_3         
	//   25   51:iload_1         
	//   26   52:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   27   55:pop             
				zzdg1.d(stringbuilder.toString(), new Object[0]);
	//   28   56:aload_2         
	//   29   57:aload_3         
	//   30   58:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   31   61:iconst_0        
	//   32   62:anewarray       Object[]
	//   33   65:invokevirtual   #106 <Method void zzdg.d(String, Object[])>
			}
			zzbe.release();
	//   34   68:aload_0         
	//   35   69:getfield        #70  <Field VirtualDisplay zzbe>
	//   36   72:invokevirtual   #109 <Method void VirtualDisplay.release()>
			zzbe = null;
	//   37   75:aload_0         
	//   38   76:aconst_null     
	//   39   77:putfield        #70  <Field VirtualDisplay zzbe>
		}
	//   40   80:return          
	}

	private static int zza(int i, int j)
	{
		return (Math.min(i, j) * 320) / 1080;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #116 <Method int Math.min(int, int)>
	//    3    5:sipush          320
	//    4    8:imul            
	//    5    9:sipush          1080
	//    6   12:idiv            
	//    7   13:ireturn         
	}

	static int zza(CastRemoteDisplayClient castremotedisplayclient, int i, int j)
	{
		return zza(i, j);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #119 <Method int zza(int, int)>
	//    3    5:ireturn         
	}

	static VirtualDisplay zza(CastRemoteDisplayClient castremotedisplayclient, VirtualDisplay virtualdisplay)
	{
		castremotedisplayclient.zzbe = virtualdisplay;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field VirtualDisplay zzbe>
		return virtualdisplay;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static zzdg zza(CastRemoteDisplayClient castremotedisplayclient)
	{
		return castremotedisplayclient.zzbd;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field zzdg zzbd>
	//    2    4:areturn         
	}

	static void zzb(CastRemoteDisplayClient castremotedisplayclient)
	{
		castremotedisplayclient.a_();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void a_()>
	//    2    4:return          
	}

	static VirtualDisplay zzc(CastRemoteDisplayClient castremotedisplayclient)
	{
		return castremotedisplayclient.zzbe;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field VirtualDisplay zzbe>
	//    2    4:areturn         
	}

	public Task startRemoteDisplay(CastDevice castdevice, String s, int i, PendingIntent pendingintent)
	{
		return doWrite(((com.google.android.gms.common.api.internal.TaskApiCall) (new zzq(this, i, pendingintent, castdevice, s))));
	//    0    0:aload_0         
	//    1    1:new             #133 <Class zzq>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:aload_1         
	//    7   10:aload_2         
	//    8   11:invokespecial   #136 <Method void zzq(CastRemoteDisplayClient, int, PendingIntent, CastDevice, String)>
	//    9   14:invokevirtual   #140 <Method Task doWrite(com.google.android.gms.common.api.internal.TaskApiCall)>
	//   10   17:areturn         
	}

	public Task stopRemoteDisplay()
	{
		return doWrite(((com.google.android.gms.common.api.internal.TaskApiCall) (new zzs(this))));
	//    0    0:aload_0         
	//    1    1:new             #146 <Class zzs>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #148 <Method void zzs(CastRemoteDisplayClient)>
	//    5    9:invokevirtual   #140 <Method Task doWrite(com.google.android.gms.common.api.internal.TaskApiCall)>
	//    6   12:areturn         
	}

	private static final Api API;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
	private final zzdg zzbd = new zzdg("CastRemoteDisplay");
	private VirtualDisplay zzbe;

	static 
	{
		CLIENT_BUILDER = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zzp()));
	//    0    0:new             #25  <Class zzp>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzp()>
	//    3    7:putstatic       #30  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
		API = new Api("CastRemoteDisplay.API", CLIENT_BUILDER, zzdf.zzwf);
	//    4   10:new             #32  <Class Api>
	//    5   13:dup             
	//    6   14:ldc1            #34  <String "CastRemoteDisplay.API">
	//    7   16:getstatic       #30  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder CLIENT_BUILDER>
	//    8   19:getstatic       #40  <Field com.google.android.gms.common.api.Api$ClientKey zzdf.zzwf>
	//    9   22:invokespecial   #43  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   10   25:putstatic       #45  <Field Api API>
	//*  11   28:return          
	}
}
