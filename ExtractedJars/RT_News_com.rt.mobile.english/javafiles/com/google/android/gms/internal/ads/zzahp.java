// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahn, zzxq, zzakb, zzahv, 
//			zzjj

final class zzahp
	implements Runnable
{

	zzahp(zzahn zzahn1, zzxq zzxq1, zzjj zzjj, zzahv zzahv)
	{
		zzclv = zzahn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzahn zzclv>
		zzclu = zzxq1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field zzxq zzclu>
		zzyh = zzjj;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field zzjj zzyh>
		zzclw = zzahv;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #24  <Field zzahv zzclw>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #27  <Method void Object()>
	//   14   25:return          
	}

	public final void run()
	{
		try
		{
			zzclu.zza(ObjectWrapper.wrap(((Object) (zzahn.zza(zzclv)))), zzyh, ((String) (null)), ((zzaic) (zzclw)), zzahn.zzb(zzclv));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zzxq zzclu>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field zzahn zzclv>
	//    4    8:invokestatic    #37  <Method android.content.Context zzahn.zza(zzahn)>
	//    5   11:invokestatic    #43  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    6   14:aload_0         
	//    7   15:getfield        #22  <Field zzjj zzyh>
	//    8   18:aconst_null     
	//    9   19:aload_0         
	//   10   20:getfield        #24  <Field zzahv zzclw>
	//   11   23:aload_0         
	//   12   24:getfield        #18  <Field zzahn zzclv>
	//   13   27:invokestatic    #47  <Method String zzahn.zzb(zzahn)>
	//   14   30:invokeinterface #52  <Method void zzxq.zza(com.google.android.gms.dynamic.IObjectWrapper, zzjj, String, zzaic, String)>
			return;
	//   15   35:return          
		}
		catch(RemoteException remoteexception)
	//*  16   36:astore_2        
		{
			String s = String.valueOf(((Object) (zzclv.zzbth)));
	//   17   37:aload_0         
	//   18   38:getfield        #18  <Field zzahn zzclv>
	//   19   41:getfield        #56  <Field String zzahn.zzbth>
	//   20   44:invokestatic    #62  <Method String String.valueOf(Object)>
	//   21   47:astore_1        
			if(s.length() != 0)
	//*  22   48:aload_1         
	//*  23   49:invokevirtual   #66  <Method int String.length()>
	//*  24   52:ifeq            65
				s = "Fail to initialize adapter ".concat(s);
	//   25   55:ldc1            #68  <String "Fail to initialize adapter ">
	//   26   57:aload_1         
	//   27   58:invokevirtual   #72  <Method String String.concat(String)>
	//   28   61:astore_1        
			else
	//*  29   62:goto            75
				s = new String("Fail to initialize adapter ");
	//   30   65:new             #58  <Class String>
	//   31   68:dup             
	//   32   69:ldc1            #68  <String "Fail to initialize adapter ">
	//   33   71:invokespecial   #75  <Method void String(String)>
	//   34   74:astore_1        
			zzakb.zzc(s, ((Throwable) (remoteexception)));
	//   35   75:aload_1         
	//   36   76:aload_2         
	//   37   77:invokestatic    #81  <Method void zzakb.zzc(String, Throwable)>
			zzclv.zza(zzclv.zzbth, 0);
	//   38   80:aload_0         
	//   39   81:getfield        #18  <Field zzahn zzclv>
	//   40   84:aload_0         
	//   41   85:getfield        #18  <Field zzahn zzclv>
	//   42   88:getfield        #56  <Field String zzahn.zzbth>
	//   43   91:iconst_0        
	//   44   92:invokevirtual   #84  <Method void zzahn.zza(String, int)>
			return;
	//   45   95:return          
		}
	}

	private final zzxq zzclu;
	private final zzahn zzclv;
	private final zzahv zzclw;
	private final zzjj zzyh;
}
