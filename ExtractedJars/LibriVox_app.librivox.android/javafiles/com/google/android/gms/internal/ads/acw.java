// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.ads:
//			p, bwk, m, xg, 
//			acx, acl

public final class acw
{

	acw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		TimeUnit timeunit = TimeUnit.MILLISECONDS;
	//    2    4:getstatic       #23  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    3    7:astore_1        
		e e = p.x;
	//    4    8:getstatic       #29  <Field e p.x>
	//    5   11:astore_2        
		a = timeunit.toNanos(((Long)bwk.e().a(e)).longValue());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #35  <Method m bwk.e()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #40  <Method Object m.a(e)>
	//   11   21:checkcast       #42  <Class Long>
	//   12   24:invokevirtual   #46  <Method long Long.longValue()>
	//   13   27:invokevirtual   #50  <Method long TimeUnit.toNanos(long)>
	//   14   30:putfield        #52  <Field long a>
		c = true;
	//   15   33:aload_0         
	//   16   34:iconst_1        
	//   17   35:putfield        #54  <Field boolean c>
	//   18   38:return          
	}

	public final void a()
	{
		c = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #54  <Field boolean c>
	//    3    5:return          
	}

	public final void a(SurfaceTexture surfacetexture, acl acl)
	{
		if(acl == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		long l = surfacetexture.getTimestamp();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #61  <Method long SurfaceTexture.getTimestamp()>
	//    5    9:lstore_3        
		if(c || Math.abs(l - b) >= a)
	//*   6   10:aload_0         
	//*   7   11:getfield        #54  <Field boolean c>
	//*   8   14:ifne            34
	//*   9   17:lload_3         
	//*  10   18:aload_0         
	//*  11   19:getfield        #63  <Field long b>
	//*  12   22:lsub            
	//*  13   23:invokestatic    #68  <Method long Math.abs(long)>
	//*  14   26:aload_0         
	//*  15   27:getfield        #52  <Field long a>
	//*  16   30:lcmp            
	//*  17   31:iflt            60
		{
			c = false;
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:putfield        #54  <Field boolean c>
			b = l;
	//   21   39:aload_0         
	//   22   40:lload_3         
	//   23   41:putfield        #63  <Field long b>
			xg.a.post(((Runnable) (new acx(this, acl))));
	//   24   44:getstatic       #73  <Field Handler xg.a>
	//   25   47:new             #75  <Class acx>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:aload_2         
	//   29   53:invokespecial   #78  <Method void acx(acw, acl)>
	//   30   56:invokevirtual   #84  <Method boolean Handler.post(Runnable)>
	//   31   59:pop             
		}
	//   32   60:return          
	}

	private final long a;
	private long b;
	private boolean c;
}
