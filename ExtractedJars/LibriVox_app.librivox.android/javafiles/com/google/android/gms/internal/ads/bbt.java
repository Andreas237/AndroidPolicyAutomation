// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, akh, bav

public final class bbt extends bcg
{

	public bbt(bav bav1, String s, String s1, akh akh1, int i, int j)
	{
		super(bav1, s, s1, akh1, i, 12);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          12
	//    7   10:invokespecial   #10  <Method void bcg(bav, String, String, akh, int, int)>
		d = -1L;
	//    8   13:aload_0         
	//    9   14:ldc2w           #11  <Long -1L>
	//   10   17:putfield        #14  <Field long d>
	//   11   20:return          
	}

	protected final void a()
	{
		b.f = Long.valueOf(-1L);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field akh b>
	//    2    4:ldc2w           #11  <Long -1L>
	//    3    7:invokestatic    #27  <Method Long Long.valueOf(long)>
	//    4   10:putfield        #33  <Field Long akh.f>
		b.f = (Long)c.invoke(((Object) (null)), new Object[] {
			a.a()
		});
	//    5   13:aload_0         
	//    6   14:getfield        #21  <Field akh b>
	//    7   17:aload_0         
	//    8   18:getfield        #37  <Field Method c>
	//    9   21:aconst_null     
	//   10   22:iconst_1        
	//   11   23:anewarray       Object[]
	//   12   26:dup             
	//   13   27:iconst_0        
	//   14   28:aload_0         
	//   15   29:getfield        #42  <Field bav a>
	//   16   32:invokevirtual   #47  <Method android.content.Context bav.a()>
	//   17   35:aastore         
	//   18   36:invokevirtual   #53  <Method Object Method.invoke(Object, Object[])>
	//   19   39:checkcast       #23  <Class Long>
	//   20   42:putfield        #33  <Field Long akh.f>
	//   21   45:return          
	}

	private long d;
}
