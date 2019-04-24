// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package b.a.a.a.a.e;

import java.io.*;

// Referenced classes of package b.a.a.a.a.e:
//			d

class d$1 extends d$a
{

	public d a()
	{
		byte abyte0[] = new byte[d.a(c)];
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field d c>
	//    2    4:invokestatic    #31  <Method int d.a(d)>
	//    3    7:newarray        byte[]
	//    4    9:astore_2        
		do
		{
			int i = a.read(abyte0);
	//    5   10:aload_0         
	//    6   11:getfield        #21  <Field InputStream a>
	//    7   14:aload_2         
	//    8   15:invokevirtual   #37  <Method int InputStream.read(byte[])>
	//    9   18:istore_1        
			if(i != -1)
	//*  10   19:iload_1         
	//*  11   20:iconst_m1       
	//*  12   21:icmpeq          37
				b.write(abyte0, 0, i);
	//   13   24:aload_0         
	//   14   25:getfield        #23  <Field OutputStream b>
	//   15   28:aload_2         
	//   16   29:iconst_0        
	//   17   30:iload_1         
	//   18   31:invokevirtual   #43  <Method void OutputStream.write(byte[], int, int)>
			else
	//*  19   34:goto            10
				return c;
	//   20   37:aload_0         
	//   21   38:getfield        #19  <Field d c>
	//   22   41:areturn         
		} while(true);
	}

	public Object b()
	{
		return ((Object) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method d a()>
	//    2    4:areturn         
	}

	final InputStream a;
	final OutputStream b;
	final d c;

	d$1(d d1, Closeable closeable, boolean flag, InputStream inputstream, OutputStream outputstream)
	{
		c = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field d c>
		a = inputstream;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #21  <Field InputStream a>
		b = outputstream;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #23  <Field OutputStream b>
		super(closeable, flag);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:iload_3         
	//   12   20:invokespecial   #26  <Method void d$a(Closeable, boolean)>
	//   13   23:return          
	}
}
