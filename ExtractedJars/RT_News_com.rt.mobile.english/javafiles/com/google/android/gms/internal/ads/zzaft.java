// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoj, zzafu, zzafv, zzafw

public final class zzaft
{

	public zzaft(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void Object()>
	//    6   12:putfield        #27  <Field Object mLock>
		zzchr = new zzaoj();
	//    7   15:aload_0         
	//    8   16:new             #29  <Class zzaoj>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void zzaoj()>
	//   11   23:putfield        #32  <Field zzaoj zzchr>
	//   12   26:aload_0         
	//   13   27:new             #34  <Class zzafu>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #37  <Method void zzafu(zzaft)>
	//   17   35:putfield        #39  <Field zzv zzchs>
	//   18   38:aload_0         
	//   19   39:new             #41  <Class zzafv>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:invokespecial   #42  <Method void zzafv(zzaft)>
	//   23   47:putfield        #44  <Field zzv zzcht>
	//   24   50:aload_0         
	//   25   51:new             #46  <Class zzafw>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:invokespecial   #47  <Method void zzafw(zzaft)>
	//   29   59:putfield        #49  <Field zzv zzchu>
		mContext = context;
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:putfield        #51  <Field Context mContext>
		zzchq = s1;
	//   33   67:aload_0         
	//   34   68:aload_3         
	//   35   69:putfield        #53  <Field String zzchq>
		zzchp = s;
	//   36   72:aload_0         
	//   37   73:aload_2         
	//   38   74:putfield        #55  <Field String zzchp>
	//   39   77:return          
	}

	static Object zza(zzaft zzaft1)
	{
		return zzaft1.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object mLock>
	//    2    4:areturn         
	}

	static zzaoj zzb(zzaft zzaft1)
	{
		return zzaft1.zzchr;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field zzaoj zzchr>
	//    2    4:areturn         
	}

	static String zzc(zzaft zzaft1)
	{
		return zzaft1.zzchp;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String zzchp>
	//    2    4:areturn         
	}

	static Context zzd(zzaft zzaft1)
	{
		return zzaft1.mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Context mContext>
	//    2    4:areturn         
	}

	static String zze(zzaft zzaft1)
	{
		return zzaft1.zzchq;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String zzchq>
	//    2    4:areturn         
	}

	private final Context mContext;
	private final Object mLock = new Object();
	private String zzchp;
	private String zzchq;
	private zzaoj zzchr;
	private final zzv zzchs = new zzafu(this);
	private final zzv zzcht = new zzafv(this);
	private final zzv zzchu = new zzafw(this);
}
