// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.Closeable;
import java.io.InputStream;

// Referenced classes of package o:
//			jw, kf

public final class jw$e
	implements Closeable
{

	public void close()
	{
		InputStream ainputstream[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field InputStream[] a>
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
			kf.b(((Closeable) (ainputstream[i])));
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:invokestatic    #43  <Method void kf.b(Closeable)>

	//   15   21:iload_1         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_1        
	//*  19   25:goto            10
	//   20   28:return          
	}

	public InputStream e(int i)
	{
		return a[i];
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field InputStream[] a>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	private final InputStream a[];
	private final String b;
	private final long c;
	private final long d[];
	final jw e;

	private jw$e(jw jw1, String s, long l, InputStream ainputstream[], long al[])
	{
		e = jw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field jw e>
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
		a = ainputstream;
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:putfield        #31  <Field InputStream[] a>
		d = al;
	//   14   25:aload_0         
	//   15   26:aload           6
	//   16   28:putfield        #33  <Field long[] d>
	//   17   31:return          
	}

	jw$e(jw jw1, String s, long l, InputStream ainputstream[], long al[], jw$a jw$a)
	{
		this(jw1, s, l, ainputstream, al);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:aload           5
	//    5    6:aload           6
	//    6    8:invokespecial   #37  <Method void jw$e(jw, String, long, InputStream[], long[])>
	//    7   11:return          
	}
}
