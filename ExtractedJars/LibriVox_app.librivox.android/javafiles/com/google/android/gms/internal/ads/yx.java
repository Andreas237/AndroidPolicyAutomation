// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			uy, zz, ys, byq, 
//			bxr

final class yx extends uy
{

	yx(ys ys, int i, String s, byq byq, bxr bxr, byte abyte0[], Map map, 
			zz zz1)
	{
		a = abyte0;
	//    0    0:aload_0         
	//    1    1:aload           6
	//    2    3:putfield        #14  <Field byte[] a>
		b = map;
	//    3    6:aload_0         
	//    4    7:aload           7
	//    5    9:putfield        #16  <Field Map b>
		c = zz1;
	//    6   12:aload_0         
	//    7   13:aload           8
	//    8   15:putfield        #18  <Field zz c>
		super(i, s, byq, bxr);
	//    9   18:aload_0         
	//   10   19:iload_2         
	//   11   20:aload_3         
	//   12   21:aload           4
	//   13   23:aload           5
	//   14   25:invokespecial   #21  <Method void uy(int, String, byq, bxr)>
	//   15   28:return          
	}

	protected final void a(Object obj)
	{
		((uy)this).a((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class String>
	//    3    5:invokevirtual   #28  <Method void uy.a(String)>
	//    4    8:return          
	}

	protected final void a(String s)
	{
		c.a(s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zz c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method void zz.a(String)>
		super.a(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #28  <Method void uy.a(String)>
	//    7   13:return          
	}

	public final byte[] a()
	{
		byte abyte1[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field byte[] a>
	//    2    4:astore_2        
		byte abyte0[] = abyte1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(abyte1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			abyte0 = super.a();
	//    7   11:aload_0         
	//    8   12:invokespecial   #34  <Method byte[] uy.a()>
	//    9   15:astore_1        
		return abyte0;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public final Map b()
	{
		Map map1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Map b>
	//    2    4:astore_2        
		Map map = map1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(map1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			map = super.b();
	//    7   11:aload_0         
	//    8   12:invokespecial   #37  <Method Map uy.b()>
	//    9   15:astore_1        
		return map;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	private final byte a[];
	private final Map b;
	private final zz c;
}
