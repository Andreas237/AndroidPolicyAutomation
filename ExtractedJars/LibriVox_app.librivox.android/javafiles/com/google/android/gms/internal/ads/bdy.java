// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf, bee, bec, bdz, 
//			beb, bea, bed, bdx, 
//			bfb, zzfs

public final class bdy
{

	public bdy(Handler handler, bdx bdx)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		if(bdx != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          19
			handler = (Handler)bnf.a(((Object) (handler)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #18  <Method Object bnf.a(Object)>
	//    6   12:checkcast       #20  <Class Handler>
	//    7   15:astore_1        
		else
	//*   8   16:goto            21
			handler = null;
	//    9   19:aconst_null     
	//   10   20:astore_1        
		a = handler;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #22  <Field Handler a>
		b = bdx;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #24  <Field bdx b>
	//   17   31:return          
	}

	static bdx a(bdy bdy1)
	{
		return bdy1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field bdx b>
	//    2    4:areturn         
	}

	public final void a(int i)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bdx b>
	//*   2    4:ifnull          24
			a.post(((Runnable) (new bee(this, i))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #29  <Class bee>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:invokespecial   #32  <Method void bee(bdy, int)>
	//   10   20:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public final void a(int i, long l, long l1)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bdx b>
	//*   2    4:ifnull          27
			a.post(((Runnable) (new bec(this, i, l, l1))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #39  <Class bec>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:lload_2         
	//   10   18:lload           4
	//   11   20:invokespecial   #42  <Method void bec(bdy, int, long, long)>
	//   12   23:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   13   26:pop             
	//   14   27:return          
	}

	public final void a(bfb bfb)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bdx b>
	//*   2    4:ifnull          24
			a.post(((Runnable) (new bdz(this, bfb))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #45  <Class bdz>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #48  <Method void bdz(bdy, bfb)>
	//   10   20:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public final void a(zzfs zzfs)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bdx b>
	//*   2    4:ifnull          24
			a.post(((Runnable) (new beb(this, zzfs))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #51  <Class beb>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #54  <Method void beb(bdy, zzfs)>
	//   10   20:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public final void a(String s, long l, long l1)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bdx b>
	//*   2    4:ifnull          27
			a.post(((Runnable) (new bea(this, s, l, l1))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #57  <Class bea>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:lload_2         
	//   10   18:lload           4
	//   11   20:invokespecial   #60  <Method void bea(bdy, String, long, long)>
	//   12   23:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   13   26:pop             
	//   14   27:return          
	}

	public final void b(bfb bfb)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bdx b>
	//*   2    4:ifnull          24
			a.post(((Runnable) (new bed(this, bfb))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #62  <Class bed>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #63  <Method void bed(bdy, bfb)>
	//   10   20:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	private final Handler a;
	private final bdx b;
}
