// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.*;

// Referenced classes of package com.google.android.gms.security:
//			ProviderInstaller

final class ProviderInstaller$1 extends AsyncTask
{

	protected Object doInBackground(Object aobj[])
	{
		return ((Object) (zzb((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class Void[]>
	//    3    5:invokevirtual   #31  <Method Integer zzb(Void[])>
	//    4    8:areturn         
	}

	protected void onPostExecute(Object obj)
	{
		zzg((Integer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class Integer>
	//    3    5:invokevirtual   #39  <Method void zzg(Integer)>
	//    4    8:return          
	}

	protected transient Integer zzb(Void avoid[])
	{
		try
		{
			ProviderInstaller.installIfNeeded(zztf);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Context zztf>
	//    2    4:invokestatic    #47  <Method void ProviderInstaller.installIfNeeded(Context)>
		}
	//*   3    7:goto            28
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
	//*   4   10:astore_1        
		{
			return Integer.valueOf(((GooglePlayServicesRepairableException) (avoid)).getConnectionStatusCode());
	//    5   11:aload_1         
	//    6   12:invokevirtual   #51  <Method int GooglePlayServicesRepairableException.getConnectionStatusCode()>
	//    7   15:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//    8   18:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
	//*   9   19:astore_1        
		{
			return Integer.valueOf(((GooglePlayServicesNotAvailableException) (avoid)).errorCode);
	//   10   20:aload_1         
	//   11   21:getfield        #59  <Field int GooglePlayServicesNotAvailableException.errorCode>
	//   12   24:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   13   27:areturn         
		}
		return Integer.valueOf(0);
	//   14   28:iconst_0        
	//   15   29:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   16   32:areturn         
	}

	protected void zzg(Integer integer)
	{
		if(integer.intValue() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #62  <Method int Integer.intValue()>
	//*   2    4:ifne            17
		{
			zzbEe.onProviderInstalled();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field ProviderInstaller$ProviderInstallListener zzbEe>
	//    5   11:invokeinterface #67  <Method void ProviderInstaller$ProviderInstallListener.onProviderInstalled()>
			return;
	//    6   16:return          
		} else
		{
			android.content.Intent intent = ProviderInstaller.zzPH().zzb(zztf, integer.intValue(), "pi");
	//    7   17:invokestatic    #71  <Method zze ProviderInstaller.zzPH()>
	//    8   20:aload_0         
	//    9   21:getfield        #17  <Field Context zztf>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #62  <Method int Integer.intValue()>
	//   12   28:ldc1            #73  <String "pi">
	//   13   30:invokevirtual   #78  <Method android.content.Intent zze.zzb(Context, int, String)>
	//   14   33:astore_2        
			zzbEe.onProviderInstallFailed(integer.intValue(), intent);
	//   15   34:aload_0         
	//   16   35:getfield        #19  <Field ProviderInstaller$ProviderInstallListener zzbEe>
	//   17   38:aload_1         
	//   18   39:invokevirtual   #62  <Method int Integer.intValue()>
	//   19   42:aload_2         
	//   20   43:invokeinterface #82  <Method void ProviderInstaller$ProviderInstallListener.onProviderInstallFailed(int, android.content.Intent)>
			return;
	//   21   48:return          
		}
	}

	final oviderInstallListener zzbEe;
	final Context zztf;

	ProviderInstaller$1(Context context, oviderInstallListener oviderinstalllistener)
	{
		zztf = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Context zztf>
		zzbEe = oviderinstalllistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field ProviderInstaller$ProviderInstallListener zzbEe>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AsyncTask()>
	//    8   14:return          
	}
}
