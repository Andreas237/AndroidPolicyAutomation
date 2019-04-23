// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.InputStream;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bml, bnf, bmp

public final class bmo extends InputStream
{

	public bmo(bml bml1, bmp bmp)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void InputStream()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean d>
		e = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field boolean e>
		a = bml1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #26  <Field bml a>
		b = bmp;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #28  <Field bmp b>
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:newarray        byte[]
	//   17   28:putfield        #30  <Field byte[] c>
	//   18   31:return          
	}

	private final void c()
	{
		if(!d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean d>
	//*   2    4:ifne            26
		{
			a.a(b);
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field bml a>
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field bmp b>
	//    7   15:invokeinterface #36  <Method long bml.a(bmp)>
	//    8   20:pop2            
			d = true;
	//    9   21:aload_0         
	//   10   22:iconst_1        
	//   11   23:putfield        #22  <Field boolean d>
		}
	//   12   26:return          
	}

	public final long a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field long f>
	//    2    4:lreturn         
	}

	public final void b()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void c()>
	//    2    4:return          
	}

	public final void close()
	{
		if(!e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean e>
	//*   2    4:ifne            21
		{
			a.a();
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field bml a>
	//    5   11:invokeinterface #44  <Method void bml.a()>
			e = true;
	//    6   16:aload_0         
	//    7   17:iconst_1        
	//    8   18:putfield        #24  <Field boolean e>
		}
	//    9   21:return          
	}

	public final int read()
	{
		if(read(c) == -1)
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #30  <Field byte[] c>
	//*   3    5:invokevirtual   #49  <Method int read(byte[])>
	//*   4    8:iconst_m1       
	//*   5    9:icmpne          14
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
		else
			return c[0] & 0xff;
	//    8   14:aload_0         
	//    9   15:getfield        #30  <Field byte[] c>
	//   10   18:iconst_0        
	//   11   19:baload          
	//   12   20:sipush          255
	//   13   23:iand            
	//   14   24:ireturn         
	}

	public final int read(byte abyte0[])
	{
		return read(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #52  <Method int read(byte[], int, int)>
	//    6    8:ireturn         
	}

	public final int read(byte abyte0[], int i, int j)
	{
		bnf.b(e ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean e>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #57  <Method void bnf.b(boolean)>
		c();
	//    5    9:aload_0         
	//    6   10:invokespecial   #41  <Method void c()>
		i = a.a(abyte0, i, j);
	//    7   13:aload_0         
	//    8   14:getfield        #26  <Field bml a>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:iload_3         
	//   12   20:invokeinterface #59  <Method int bml.a(byte[], int, int)>
	//   13   25:istore_2        
		if(i == -1)
	//*  14   26:iload_2         
	//*  15   27:iconst_m1       
	//*  16   28:icmpne          33
		{
			return -1;
	//   17   31:iconst_m1       
	//   18   32:ireturn         
		} else
		{
			f = f + (long)i;
	//   19   33:aload_0         
	//   20   34:aload_0         
	//   21   35:getfield        #39  <Field long f>
	//   22   38:iload_2         
	//   23   39:i2l             
	//   24   40:ladd            
	//   25   41:putfield        #39  <Field long f>
			return i;
	//   26   44:iload_2         
	//   27   45:ireturn         
		}
	}

	private final bml a;
	private final bmp b;
	private final byte c[] = new byte[1];
	private boolean d;
	private boolean e;
	private long f;
}
