// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, bbf, akh, bav

public final class bca extends bcg
{

	public bca(bav bav, String s, String s1, akh akh1, int i, int j, bbf bbf1)
	{
		super(bav, s, s1, akh1, i, 53);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          53
	//    7   10:invokespecial   #13  <Method void bcg(bav, String, String, akh, int, int)>
		d = bbf1;
	//    8   13:aload_0         
	//    9   14:aload           7
	//   10   16:putfield        #15  <Field bbf d>
		if(bbf1 != null)
	//*  11   19:aload           7
	//*  12   21:ifnull          33
			e = bbf1.a();
	//   13   24:aload_0         
	//   14   25:aload           7
	//   15   27:invokevirtual   #21  <Method long bbf.a()>
	//   16   30:putfield        #23  <Field long e>
	//   17   33:return          
	}

	protected final void a()
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field bbf d>
	//*   2    4:ifnull          39
			b.I = (Long)c.invoke(((Object) (null)), new Object[] {
				Long.valueOf(e)
			});
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field akh b>
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field Method c>
	//    7   15:aconst_null     
	//    8   16:iconst_1        
	//    9   17:anewarray       Object[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field long e>
	//   14   26:invokestatic    #41  <Method Long Long.valueOf(long)>
	//   15   29:aastore         
	//   16   30:invokevirtual   #47  <Method Object Method.invoke(Object, Object[])>
	//   17   33:checkcast       #37  <Class Long>
	//   18   36:putfield        #53  <Field Long akh.I>
	//   19   39:return          
	}

	private final bbf d;
	private long e;
}
