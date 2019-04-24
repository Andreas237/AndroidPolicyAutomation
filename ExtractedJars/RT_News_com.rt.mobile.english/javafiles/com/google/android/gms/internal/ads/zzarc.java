// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzano, zzard, zzaoe, zzarg, 
//			zznk, zzkb, zzni, zzaso, 
//			zzare, zzaml, zzaqw, zzang, 
//			zzci, zzanz, zzasi, zznx, 
//			zzhs

public final class zzarc
{

	public zzarc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static zzanz zza(Context context, zzang zzang, String s, zzci zzci, zzw zzw)
	{
		return zzano.zza(((zzanz) (zzano.zzi(((Object) (null))))), ((zzanj) (new zzard(context, zzci, zzang, zzw, s))), zzaoe.zzcvy);
	//    0    0:aconst_null     
	//    1    1:invokestatic    #19  <Method zzany zzano.zzi(Object)>
	//    2    4:new             #21  <Class zzard>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload           4
	//    8   13:aload_2         
	//    9   14:invokespecial   #24  <Method void zzard(Context, zzci, zzang, zzw, String)>
	//   10   17:getstatic       #30  <Field java.util.concurrent.Executor zzaoe.zzcvy>
	//   11   20:invokestatic    #33  <Method zzanz zzano.zza(zzanz, zzanj, java.util.concurrent.Executor)>
	//   12   23:areturn         
	}

	public static zzaqw zza(Context context, zzasi zzasi, String s, boolean flag, boolean flag1, zzci zzci, zzang zzang, zznx zznx, 
			zzbo zzbo, zzw zzw, zzhs zzhs)
		throws zzarg
	{
		zznk.initialize(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #47  <Method void zznk.initialize(Context)>
		zzna zzna = zznk.zzaxy;
	//    2    4:getstatic       #51  <Field zzna zznk.zzaxy>
	//    3    7:astore          11
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   4    9:invokestatic    #57  <Method zzni zzkb.zzik()>
	//*   5   12:aload           11
	//*   6   14:invokevirtual   #63  <Method Object zzni.zzd(zzna)>
	//*   7   17:checkcast       #65  <Class Boolean>
	//*   8   20:invokevirtual   #69  <Method boolean Boolean.booleanValue()>
	//*   9   23:ifeq            48
			return zzaso.zza(context, zzasi, s, flag1, flag, zzci, zzang, zznx, zzbo, zzw, zzhs);
	//   10   26:aload_0         
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:iload           4
	//   14   31:iload_3         
	//   15   32:aload           5
	//   16   34:aload           6
	//   17   36:aload           7
	//   18   38:aload           8
	//   19   40:aload           9
	//   20   42:aload           10
	//   21   44:invokestatic    #73  <Method zzaqw zzaso.zza(Context, zzasi, String, boolean, boolean, zzci, zzang, zznx, zzbo, zzw, zzhs)>
	//   22   47:areturn         
		try
		{
			context = ((Context) ((zzaqw)zzaml.zzb(((java.util.concurrent.Callable) (new zzare(context, zzasi, s, flag, flag1, zzci, zzang, zznx, zzbo, zzw, zzhs))))));
	//   23   48:new             #75  <Class zzare>
	//   24   51:dup             
	//   25   52:aload_0         
	//   26   53:aload_1         
	//   27   54:aload_2         
	//   28   55:iload_3         
	//   29   56:iload           4
	//   30   58:aload           5
	//   31   60:aload           6
	//   32   62:aload           7
	//   33   64:aload           8
	//   34   66:aload           9
	//   35   68:aload           10
	//   36   70:invokespecial   #78  <Method void zzare(Context, zzasi, String, boolean, boolean, zzci, zzang, zznx, zzbo, zzw, zzhs)>
	//   37   73:invokestatic    #84  <Method Object zzaml.zzb(java.util.concurrent.Callable)>
	//   38   76:checkcast       #86  <Class zzaqw>
	//   39   79:astore_0        
		}
	//*  40   80:aload_0         
	//*  41   81:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  42   82:astore_0        
		{
			throw new zzarg("Webview initialization failed.", ((Throwable) (context)));
	//   43   83:new             #38  <Class zzarg>
	//   44   86:dup             
	//   45   87:ldc1            #88  <String "Webview initialization failed.">
	//   46   89:aload_0         
	//   47   90:invokespecial   #91  <Method void zzarg(String, Throwable)>
	//   48   93:athrow          
		}
		return ((zzaqw) (context));
	}
}
