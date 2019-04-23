// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnj, bdk, bcr

public final class bns
	implements bnj
{

	public bns()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		d = bdk.a;
	//    2    4:aload_0         
	//    3    5:getstatic       #21  <Field bdk bdk.a>
	//    4    8:putfield        #23  <Field bdk d>
	//    5   11:return          
	}

	public final bdk a(bdk bdk1)
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean a>
	//*   2    4:ifeq            15
			a(w());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #31  <Method long w()>
	//    6   12:invokevirtual   #34  <Method void a(long)>
		d = bdk1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #23  <Field bdk d>
		return bdk1;
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public final void a()
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean a>
	//*   2    4:ifne            19
		{
			c = SystemClock.elapsedRealtime();
	//    3    7:aload_0         
	//    4    8:invokestatic    #39  <Method long SystemClock.elapsedRealtime()>
	//    5   11:putfield        #41  <Field long c>
			a = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #27  <Field boolean a>
		}
	//    9   19:return          
	}

	public final void a(long l)
	{
		b = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #43  <Field long b>
		if(a)
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field boolean a>
	//*   5    9:ifeq            19
			c = SystemClock.elapsedRealtime();
	//    6   12:aload_0         
	//    7   13:invokestatic    #39  <Method long SystemClock.elapsedRealtime()>
	//    8   16:putfield        #41  <Field long c>
	//    9   19:return          
	}

	public final void a(bnj bnj1)
	{
		a(bnj1.w());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #45  <Method long bnj.w()>
	//    3    7:invokevirtual   #34  <Method void a(long)>
		d = bnj1.x();
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokeinterface #49  <Method bdk bnj.x()>
	//    7   17:putfield        #23  <Field bdk d>
	//    8   20:return          
	}

	public final void b()
	{
		if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean a>
	//*   2    4:ifeq            20
		{
			a(w());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #31  <Method long w()>
	//    6   12:invokevirtual   #34  <Method void a(long)>
			a = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #27  <Field boolean a>
		}
	//   10   20:return          
	}

	public final long w()
	{
		long l1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long b>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(a)
	//*   5    7:aload_0         
	//*   6    8:getfield        #27  <Field boolean a>
	//*   7   11:ifeq            53
		{
			l = SystemClock.elapsedRealtime() - c;
	//    8   14:invokestatic    #39  <Method long SystemClock.elapsedRealtime()>
	//    9   17:aload_0         
	//   10   18:getfield        #41  <Field long c>
	//   11   21:lsub            
	//   12   22:lstore_1        
			if(d.b == 1.0F)
	//*  13   23:aload_0         
	//*  14   24:getfield        #23  <Field bdk d>
	//*  15   27:getfield        #52  <Field float bdk.b>
	//*  16   30:fconst_1        
	//*  17   31:fcmpl           
	//*  18   32:ifne            42
				return l1 + bcr.b(l);
	//   19   35:lload_3         
	//   20   36:lload_1         
	//   21   37:invokestatic    #57  <Method long bcr.b(long)>
	//   22   40:ladd            
	//   23   41:lreturn         
			l = l1 + d.a(l);
	//   24   42:lload_3         
	//   25   43:aload_0         
	//   26   44:getfield        #23  <Field bdk d>
	//   27   47:lload_1         
	//   28   48:invokevirtual   #59  <Method long bdk.a(long)>
	//   29   51:ladd            
	//   30   52:lstore_1        
		}
		return l;
	//   31   53:lload_1         
	//   32   54:lreturn         
	}

	public final bdk x()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field bdk d>
	//    2    4:areturn         
	}

	private boolean a;
	private long b;
	private long c;
	private bdk d;
}
