// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf, bor, bop, bos, 
//			bom, boo, bon, bot, 
//			bok, bfb, zzfs

public final class bol
{

	public bol(Handler handler, bok bok)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		if(bok != null)
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
		b = bok;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #24  <Field bok b>
	//   17   31:return          
	}

	static bok a(bol bol1)
	{
		return bol1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field bok b>
	//    2    4:areturn         
	}

	public final void a(int i, int j, int k, float f)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bok b>
	//*   2    4:ifnull          28
			a.post(((Runnable) (new bor(this, i, j, k, f))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #29  <Class bor>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:fload           4
	//   12   21:invokespecial   #32  <Method void bor(bol, int, int, int, float)>
	//   13   24:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   14   27:pop             
	//   15   28:return          
	}

	public final void a(int i, long l)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bok b>
	//*   2    4:ifnull          25
			a.post(((Runnable) (new bop(this, i, l))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #39  <Class bop>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:lload_2         
	//   10   18:invokespecial   #42  <Method void bop(bol, int, long)>
	//   11   21:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   12   24:pop             
	//   13   25:return          
	}

	public final void a(Surface surface)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bok b>
	//*   2    4:ifnull          24
			a.post(((Runnable) (new bos(this, surface))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #45  <Class bos>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #48  <Method void bos(bol, Surface)>
	//   10   20:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public final void a(bfb bfb)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bok b>
	//*   2    4:ifnull          24
			a.post(((Runnable) (new bom(this, bfb))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #51  <Class bom>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #54  <Method void bom(bol, bfb)>
	//   10   20:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public final void a(zzfs zzfs)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bok b>
	//*   2    4:ifnull          24
			a.post(((Runnable) (new boo(this, zzfs))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #57  <Class boo>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #60  <Method void boo(bol, zzfs)>
	//   10   20:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	public final void a(String s, long l, long l1)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bok b>
	//*   2    4:ifnull          27
			a.post(((Runnable) (new bon(this, s, l, l1))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #63  <Class bon>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:lload_2         
	//   10   18:lload           4
	//   11   20:invokespecial   #66  <Method void bon(bol, String, long, long)>
	//   12   23:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   13   26:pop             
	//   14   27:return          
	}

	public final void b(bfb bfb)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field bok b>
	//*   2    4:ifnull          24
			a.post(((Runnable) (new bot(this, bfb))));
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field Handler a>
	//    5   11:new             #68  <Class bot>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #69  <Method void bot(bol, bfb)>
	//   10   20:invokevirtual   #36  <Method boolean Handler.post(Runnable)>
	//   11   23:pop             
	//   12   24:return          
	}

	private final Handler a;
	private final bok b;
}
