// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni, zzakk, 
//			zzapq, zzapf

public final class zzapp
{

	zzapp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		TimeUnit timeunit = TimeUnit.MILLISECONDS;
	//    2    4:getstatic       #23  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    3    7:astore_1        
		zzna zzna = zznk.zzavh;
	//    4    8:getstatic       #29  <Field zzna zznk.zzavh>
	//    5   11:astore_2        
		zzcyj = timeunit.toNanos(((Long)zzkb.zzik().zzd(zzna)).longValue());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #35  <Method zzni zzkb.zzik()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #41  <Method Object zzni.zzd(zzna)>
	//   11   21:checkcast       #43  <Class Long>
	//   12   24:invokevirtual   #47  <Method long Long.longValue()>
	//   13   27:invokevirtual   #51  <Method long TimeUnit.toNanos(long)>
	//   14   30:putfield        #53  <Field long zzcyj>
		zzcyl = true;
	//   15   33:aload_0         
	//   16   34:iconst_1        
	//   17   35:putfield        #55  <Field boolean zzcyl>
	//   18   38:return          
	}

	public final void zza(SurfaceTexture surfacetexture, zzapf zzapf)
	{
		if(zzapf == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		long l = surfacetexture.getTimestamp();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #63  <Method long SurfaceTexture.getTimestamp()>
	//    5    9:lstore_3        
		if(zzcyl || Math.abs(l - zzcyk) >= zzcyj)
	//*   6   10:aload_0         
	//*   7   11:getfield        #55  <Field boolean zzcyl>
	//*   8   14:ifne            34
	//*   9   17:lload_3         
	//*  10   18:aload_0         
	//*  11   19:getfield        #65  <Field long zzcyk>
	//*  12   22:lsub            
	//*  13   23:invokestatic    #70  <Method long Math.abs(long)>
	//*  14   26:aload_0         
	//*  15   27:getfield        #53  <Field long zzcyj>
	//*  16   30:lcmp            
	//*  17   31:iflt            60
		{
			zzcyl = false;
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:putfield        #55  <Field boolean zzcyl>
			zzcyk = l;
	//   21   39:aload_0         
	//   22   40:lload_3         
	//   23   41:putfield        #65  <Field long zzcyk>
			zzakk.zzcrm.post(((Runnable) (new zzapq(this, zzapf))));
	//   24   44:getstatic       #76  <Field Handler zzakk.zzcrm>
	//   25   47:new             #78  <Class zzapq>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:aload_2         
	//   29   53:invokespecial   #81  <Method void zzapq(zzapp, zzapf)>
	//   30   56:invokevirtual   #87  <Method boolean Handler.post(Runnable)>
	//   31   59:pop             
		}
	//   32   60:return          
	}

	public final void zzsw()
	{
		zzcyl = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #55  <Field boolean zzcyl>
	//    3    5:return          
	}

	private final long zzcyj;
	private long zzcyk;
	private boolean zzcyl;
}
