// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf, bcr, bik, big, 
//			bih, bij, bii, bie, 
//			zzfs, bmp

public final class bif
{

	public bif(Handler handler, bie bie)
	{
		this(handler, bie, 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lconst_0        
	//    4    4:invokespecial   #15  <Method void bif(Handler, bie, long)>
	//    5    7:return          
	}

	private bif(Handler handler, bie bie, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		if(bie != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          19
			handler = (Handler)bnf.a(((Object) (handler)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #24  <Method Object bnf.a(Object)>
	//    6   12:checkcast       #26  <Class Handler>
	//    7   15:astore_1        
		else
	//*   8   16:goto            21
			handler = null;
	//    9   19:aconst_null     
	//   10   20:astore_1        
		a = handler;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #28  <Field Handler a>
		b = bie;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #30  <Field bie b>
		c = l;
	//   17   31:aload_0         
	//   18   32:lload_3         
	//   19   33:putfield        #32  <Field long c>
	//   20   36:return          
	}

	static long a(bif bif1, long l)
	{
		return bif1.b(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #36  <Method long b(long)>
	//    3    5:lreturn         
	}

	static bie a(bif bif1)
	{
		return bif1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field bie b>
	//    2    4:areturn         
	}

	private final long b(long l)
	{
		l = bcr.a(l);
	//    0    0:lload_1         
	//    1    1:invokestatic    #41  <Method long bcr.a(long)>
	//    2    4:lstore_1        
		if(l == 0x1L)
	//*   3    5:lload_1         
	//*   4    6:ldc2w           #42  <Long 0x1L>
	//*   5    9:lcmp            
	//*   6   10:ifne            17
			return 0x1L;
	//    7   13:ldc2w           #42  <Long 0x1L>
	//    8   16:lreturn         
		else
			return c + l;
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field long c>
	//   11   21:lload_1         
	//   12   22:ladd            
	//   13   23:lreturn         
	}

	public final bif a(long l)
	{
		return new bif(a, b, l);
	//    0    0:new             #2   <Class bif>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Handler a>
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field bie b>
	//    6   12:lload_1         
	//    7   13:invokespecial   #15  <Method void bif(Handler, bie, long)>
	//    8   16:areturn         
	}

	public final void a(int i, zzfs zzfs, int j, Object obj, long l)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field bie b>
	//*   2    4:ifnull          30
			a.post(((Runnable) (new bik(this, i, zzfs, j, obj, l))));
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Handler a>
	//    5   11:new             #47  <Class bik>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:iload_3         
	//   11   19:aload           4
	//   12   21:lload           5
	//   13   23:invokespecial   #50  <Method void bik(bif, int, zzfs, int, Object, long)>
	//   14   26:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	public final void a(bmp bmp, int i, int j, zzfs zzfs, int k, Object obj, long l, long l1, long l2)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field bie b>
	//*   2    4:ifnull          38
			a.post(((Runnable) (new big(this, bmp, i, j, zzfs, k, obj, l, l1, l2))));
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Handler a>
	//    5   11:new             #57  <Class big>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:aload           4
	//   12   21:iload           5
	//   13   23:aload           6
	//   14   25:lload           7
	//   15   27:lload           9
	//   16   29:lload           11
	//   17   31:invokespecial   #60  <Method void big(bif, bmp, int, int, zzfs, int, Object, long, long, long)>
	//   18   34:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   19   37:pop             
	//   20   38:return          
	}

	public final void a(bmp bmp, int i, int j, zzfs zzfs, int k, Object obj, long l, long l1, long l2, long l3, 
			long l4)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field bie b>
	//*   2    4:ifnull          42
			a.post(((Runnable) (new bih(this, bmp, i, j, zzfs, k, obj, l, l1, l2, l3, l4))));
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Handler a>
	//    5   11:new             #63  <Class bih>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:aload           4
	//   12   21:iload           5
	//   13   23:aload           6
	//   14   25:lload           7
	//   15   27:lload           9
	//   16   29:lload           11
	//   17   31:lload           13
	//   18   33:lload           15
	//   19   35:invokespecial   #66  <Method void bih(bif, bmp, int, int, zzfs, int, Object, long, long, long, long, long)>
	//   20   38:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   21   41:pop             
	//   22   42:return          
	}

	public final void a(bmp bmp, int i, int j, zzfs zzfs, int k, Object obj, long l, long l1, long l2, long l3, 
			long l4, IOException ioexception, boolean flag)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field bie b>
	//*   2    4:ifnull          46
			a.post(((Runnable) (new bij(this, bmp, i, j, zzfs, k, obj, l, l1, l2, l3, l4, ioexception, flag))));
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Handler a>
	//    5   11:new             #69  <Class bij>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:aload           4
	//   12   21:iload           5
	//   13   23:aload           6
	//   14   25:lload           7
	//   15   27:lload           9
	//   16   29:lload           11
	//   17   31:lload           13
	//   18   33:lload           15
	//   19   35:aload           17
	//   20   37:iload           18
	//   21   39:invokespecial   #72  <Method void bij(bif, bmp, int, int, zzfs, int, Object, long, long, long, long, long, IOException, boolean)>
	//   22   42:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   23   45:pop             
	//   24   46:return          
	}

	public final void a(bmp bmp, int i, long l)
	{
		a(bmp, i, -1, ((zzfs) (null)), 0, ((Object) (null)), 0x1L, 0x1L, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aconst_null     
	//    7    7:ldc2w           #42  <Long 0x1L>
	//    8   10:ldc2w           #42  <Long 0x1L>
	//    9   13:lload_3         
	//   10   14:invokevirtual   #75  <Method void a(bmp, int, int, zzfs, int, Object, long, long, long)>
	//   11   17:return          
	}

	public final void a(bmp bmp, int i, long l, long l1, long l2)
	{
		a(bmp, i, -1, ((zzfs) (null)), 0, ((Object) (null)), 0x1L, 0x1L, l, l1, l2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aconst_null     
	//    7    7:ldc2w           #42  <Long 0x1L>
	//    8   10:ldc2w           #42  <Long 0x1L>
	//    9   13:lload_3         
	//   10   14:lload           5
	//   11   16:lload           7
	//   12   18:invokevirtual   #78  <Method void a(bmp, int, int, zzfs, int, Object, long, long, long, long, long)>
	//   13   21:return          
	}

	public final void a(bmp bmp, int i, long l, long l1, long l2, IOException ioexception, boolean flag)
	{
		a(bmp, i, -1, ((zzfs) (null)), 0, ((Object) (null)), 0x1L, 0x1L, l, l1, l2, ioexception, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aconst_null     
	//    7    7:ldc2w           #42  <Long 0x1L>
	//    8   10:ldc2w           #42  <Long 0x1L>
	//    9   13:lload_3         
	//   10   14:lload           5
	//   11   16:lload           7
	//   12   18:aload           9
	//   13   20:iload           10
	//   14   22:invokevirtual   #81  <Method void a(bmp, int, int, zzfs, int, Object, long, long, long, long, long, IOException, boolean)>
	//   15   25:return          
	}

	public final void b(bmp bmp, int i, int j, zzfs zzfs, int k, Object obj, long l, long l1, long l2, long l3, 
			long l4)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field bie b>
	//*   2    4:ifnull          42
			a.post(((Runnable) (new bii(this, bmp, i, j, zzfs, k, obj, l, l1, l2, l3, l4))));
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field Handler a>
	//    5   11:new             #83  <Class bii>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:aload           4
	//   12   21:iload           5
	//   13   23:aload           6
	//   14   25:lload           7
	//   15   27:lload           9
	//   16   29:lload           11
	//   17   31:lload           13
	//   18   33:lload           15
	//   19   35:invokespecial   #84  <Method void bii(bif, bmp, int, int, zzfs, int, Object, long, long, long, long, long)>
	//   20   38:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   21   41:pop             
	//   22   42:return          
	}

	public final void b(bmp bmp, int i, long l, long l1, long l2)
	{
		b(bmp, i, -1, ((zzfs) (null)), 0, ((Object) (null)), 0x1L, 0x1L, l, l1, l2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_m1       
	//    4    4:aconst_null     
	//    5    5:iconst_0        
	//    6    6:aconst_null     
	//    7    7:ldc2w           #42  <Long 0x1L>
	//    8   10:ldc2w           #42  <Long 0x1L>
	//    9   13:lload_3         
	//   10   14:lload           5
	//   11   16:lload           7
	//   12   18:invokevirtual   #86  <Method void b(bmp, int, int, zzfs, int, Object, long, long, long, long, long)>
	//   13   21:return          
	}

	private final Handler a;
	private final bie b;
	private final long c;
}
