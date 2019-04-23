// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bjb, bjc, bdr, bnf, 
//			bip, bmm, bfq, bjl, 
//			bdp, biy, bmj, biz, 
//			bct

public final class bix
	implements bjb, bjc
{

	public bix(Uri uri, bmm bmm1, bfq bfq1, int i1, Handler handler, biy biy, String s, 
			int j1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		a = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field Uri a>
		b = bmm1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field bmm b>
		c = bfq1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #42  <Field bfq c>
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #44  <Field int d>
		e = handler;
	//   14   24:aload_0         
	//   15   25:aload           5
	//   16   27:putfield        #46  <Field Handler e>
		f = biy;
	//   17   30:aload_0         
	//   18   31:aload           6
	//   19   33:putfield        #48  <Field biy f>
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #50  <Field String h>
		i = j1;
	//   23   41:aload_0         
	//   24   42:iload           8
	//   25   44:putfield        #52  <Field int i>
	//   26   47:aload_0         
	//   27   48:new             #54  <Class bdr>
	//   28   51:dup             
	//   29   52:invokespecial   #55  <Method void bdr()>
	//   30   55:putfield        #57  <Field bdr g>
	//   31   58:return          
	}

	public final biz a(int i1, bmj bmj)
	{
		boolean flag;
		if(i1 == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_3        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		bnf.a(flag);
	//    7   11:iload_3         
	//    8   12:invokestatic    #64  <Method void bnf.a(boolean)>
		return ((biz) (new bip(a, b.a(), c.a(), d, e, f, ((bjc) (this)), bmj, ((String) (null)), i)));
	//    9   15:new             #66  <Class bip>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #38  <Field Uri a>
	//   13   23:aload_0         
	//   14   24:getfield        #40  <Field bmm b>
	//   15   27:invokeinterface #71  <Method bml bmm.a()>
	//   16   32:aload_0         
	//   17   33:getfield        #42  <Field bfq c>
	//   18   36:invokeinterface #76  <Method bfm[] bfq.a()>
	//   19   41:aload_0         
	//   20   42:getfield        #44  <Field int d>
	//   21   45:aload_0         
	//   22   46:getfield        #46  <Field Handler e>
	//   23   49:aload_0         
	//   24   50:getfield        #48  <Field biy f>
	//   25   53:aload_0         
	//   26   54:aload_2         
	//   27   55:aconst_null     
	//   28   56:aload_0         
	//   29   57:getfield        #52  <Field int i>
	//   30   60:invokespecial   #79  <Method void bip(Uri, bml, bfm[], int, Handler, biy, bjc, bmj, String, int)>
	//   31   63:areturn         
	}

	public final void a()
	{
	//    0    0:return          
	}

	public final void a(bct bct, boolean flag, bjc bjc1)
	{
		j = bjc1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #82  <Field bjc j>
		k = ((bdp) (new bjl(0x1L, false)));
	//    3    5:aload_0         
	//    4    6:new             #84  <Class bjl>
	//    5    9:dup             
	//    6   10:ldc2w           #85  <Long 0x1L>
	//    7   13:iconst_0        
	//    8   14:invokespecial   #89  <Method void bjl(long, boolean)>
	//    9   17:putfield        #91  <Field bdp k>
		bjc1.a(k, ((Object) (null)));
	//   10   20:aload_3         
	//   11   21:aload_0         
	//   12   22:getfield        #91  <Field bdp k>
	//   13   25:aconst_null     
	//   14   26:invokeinterface #94  <Method void bjc.a(bdp, Object)>
	//   15   31:return          
	}

	public final void a(bdp bdp1, Object obj)
	{
		obj = ((Object) (g));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field bdr g>
	//    2    4:astore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(bdp1.a(0, ((bdr) (obj)), false).c != 0x1L)
	//*   5    7:aload_1         
	//*   6    8:iconst_0        
	//*   7    9:aload_2         
	//*   8   10:iconst_0        
	//*   9   11:invokevirtual   #99  <Method bdr bdp.a(int, bdr, boolean)>
	//*  10   14:getfield        #102 <Field long bdr.c>
	//*  11   17:ldc2w           #85  <Long 0x1L>
	//*  12   20:lcmp            
	//*  13   21:ifeq            26
			flag = true;
	//   14   24:iconst_1        
	//   15   25:istore_3        
		if(l && !flag)
	//*  16   26:aload_0         
	//*  17   27:getfield        #104 <Field boolean l>
	//*  18   30:ifeq            38
	//*  19   33:iload_3         
	//*  20   34:ifne            38
		{
			return;
	//   21   37:return          
		} else
		{
			k = bdp1;
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:putfield        #91  <Field bdp k>
			l = flag;
	//   25   43:aload_0         
	//   26   44:iload_3         
	//   27   45:putfield        #104 <Field boolean l>
			j.a(k, ((Object) (null)));
	//   28   48:aload_0         
	//   29   49:getfield        #82  <Field bjc j>
	//   30   52:aload_0         
	//   31   53:getfield        #91  <Field bdp k>
	//   32   56:aconst_null     
	//   33   57:invokeinterface #94  <Method void bjc.a(bdp, Object)>
			return;
	//   34   62:return          
		}
	}

	public final void a(biz biz)
	{
		((bip)biz).b();
	//    0    0:aload_1         
	//    1    1:checkcast       #66  <Class bip>
	//    2    4:invokevirtual   #107 <Method void bip.b()>
	//    3    7:return          
	}

	public final void b()
	{
		j = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #82  <Field bjc j>
	//    3    5:return          
	}

	private final Uri a;
	private final bmm b;
	private final bfq c;
	private final int d = -1;
	private final Handler e;
	private final biy f;
	private final bdr g = new bdr();
	private final String h = null;
	private final int i;
	private bjc j;
	private bdp k;
	private boolean l;
}
