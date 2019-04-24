// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.Closeable;
import java.io.InputStream;

// Referenced classes of package com.amap.api.mapcore.util:
//			iz, jc

public final class iz$b
	implements Closeable
{

	public InputStream a(int i)
	{
		return d[i];
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field InputStream[] d>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public void close()
	{
		InputStream ainputstream[] = d;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field InputStream[] d>
	//    2    4:astore_3        
		int j = ainputstream.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          28
			jc.a(((Closeable) (ainputstream[i])));
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:invokestatic    #44  <Method void jc.a(Closeable)>

	//   15   21:iload_1         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_1        
	//*  19   25:goto            10
	//   20   28:return          
	}

	final iz a;
	private final String b;
	private final long c;
	private final InputStream d[];
	private final long e[];

	private iz$b(iz iz1, String s, long l, InputStream ainputstream[], long al[])
	{
		a = iz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field iz a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String b>
		c = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #29  <Field long c>
		d = ainputstream;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #31  <Field InputStream[] d>
		e = al;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #33  <Field long[] e>
	//   17   31:return          
	}

	iz$b(iz iz1, String s, long l, InputStream ainputstream[], long al[], iz$1 iz$1)
	{
		this(iz1, s, l, ainputstream, al);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:aload           5
	//    5    6:aload           6
	//    6    8:invokespecial   #37  <Method void iz$b(iz, String, long, InputStream[], long[])>
	//    7   11:return          
	}
}
