// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni, zzeo, 
//			zzen, zzane, zzhz

public final class zzhx
{

	public zzhx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public zzhx(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zznk.initialize(context);
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void zznk.initialize(Context)>
		zzna zzna = zznk.zzbeo;
	//    4    8:getstatic       #31  <Field zzna zznk.zzbeo>
	//    5   11:astore_2        
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
			break MISSING_BLOCK_LABEL_80;
	//    6   12:invokestatic    #37  <Method zzni zzkb.zzik()>
	//    7   15:aload_2         
	//    8   16:invokevirtual   #43  <Method Object zzni.zzd(zzna)>
	//    9   19:checkcast       #45  <Class Boolean>
	//   10   22:invokevirtual   #49  <Method boolean Boolean.booleanValue()>
	//   11   25:ifeq            80
		try
		{
			zzaln = zzeo.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite").instantiate("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:getstatic       #55  <Field com.google.android.gms.dynamite.DynamiteModule$VersionPolicy DynamiteModule.PREFER_REMOTE>
	//   15   33:ldc1            #57  <String "com.google.android.gms.ads.dynamite">
	//   16   35:invokestatic    #61  <Method DynamiteModule DynamiteModule.load(Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, String)>
	//   17   38:ldc1            #63  <String "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger">
	//   18   40:invokevirtual   #67  <Method android.os.IBinder DynamiteModule.instantiate(String)>
	//   19   43:invokestatic    #73  <Method zzen zzeo.zza(android.os.IBinder)>
	//   20   46:putfield        #75  <Field zzen zzaln>
			ObjectWrapper.wrap(((Object) (context)));
	//   21   49:aload_1         
	//   22   50:invokestatic    #81  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   23   53:pop             
			zzaln.zza(ObjectWrapper.wrap(((Object) (context))), "GMA_SDK");
	//   24   54:aload_0         
	//   25   55:getfield        #75  <Field zzen zzaln>
	//   26   58:aload_1         
	//   27   59:invokestatic    #81  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   28   62:ldc1            #83  <String "GMA_SDK">
	//   29   64:invokeinterface #88  <Method void zzen.zza(com.google.android.gms.dynamic.IObjectWrapper, String)>
			zzalo = true;
	//   30   69:aload_0         
	//   31   70:iconst_1        
	//   32   71:putfield        #90  <Field boolean zzalo>
			return;
	//   33   74:return          
		}
	//*  34   75:ldc1            #92  <String "Cannot dynamite load clearcut">
	//*  35   77:invokestatic    #98  <Method void zzane.zzck(String)>
	//*  36   80:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			zzane.zzck("Cannot dynamite load clearcut");
		}
	//*  37   81:astore_1        
	//*  38   82:goto            75
	}

	public zzhx(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zznk.initialize(context);
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void zznk.initialize(Context)>
		try
		{
			zzaln = zzeo.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite").instantiate("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getstatic       #55  <Field com.google.android.gms.dynamite.DynamiteModule$VersionPolicy DynamiteModule.PREFER_REMOTE>
	//    7   13:ldc1            #57  <String "com.google.android.gms.ads.dynamite">
	//    8   15:invokestatic    #61  <Method DynamiteModule DynamiteModule.load(Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, String)>
	//    9   18:ldc1            #63  <String "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger">
	//   10   20:invokevirtual   #67  <Method android.os.IBinder DynamiteModule.instantiate(String)>
	//   11   23:invokestatic    #73  <Method zzen zzeo.zza(android.os.IBinder)>
	//   12   26:putfield        #75  <Field zzen zzaln>
			ObjectWrapper.wrap(((Object) (context)));
	//   13   29:aload_1         
	//   14   30:invokestatic    #81  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   15   33:pop             
			zzaln.zza(ObjectWrapper.wrap(((Object) (context))), s, ((String) (null)));
	//   16   34:aload_0         
	//   17   35:getfield        #75  <Field zzen zzaln>
	//   18   38:aload_1         
	//   19   39:invokestatic    #81  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   20   42:aload_2         
	//   21   43:aconst_null     
	//   22   44:invokeinterface #102 <Method void zzen.zza(com.google.android.gms.dynamic.IObjectWrapper, String, String)>
			zzalo = true;
	//   23   49:aload_0         
	//   24   50:iconst_1        
	//   25   51:putfield        #90  <Field boolean zzalo>
			return;
	//   26   54:return          
		}
	//*  27   55:ldc1            #92  <String "Cannot dynamite load clearcut">
	//*  28   57:invokestatic    #98  <Method void zzane.zzck(String)>
	//*  29   60:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			zzane.zzck("Cannot dynamite load clearcut");
		}
		return;
	//*  30   61:astore_1        
	//*  31   62:goto            55
	}

	public final zzhz zzd(byte abyte0[])
	{
		return new zzhz(this, abyte0, ((zzhy) (null)));
	//    0    0:new             #105 <Class zzhz>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #108 <Method void zzhz(zzhx, byte[], zzhy)>
	//    6   10:areturn         
	}

	zzen zzaln;
	boolean zzalo;
}
