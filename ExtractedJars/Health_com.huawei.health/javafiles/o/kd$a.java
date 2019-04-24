// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;

// Referenced classes of package o:
//			kd

static class kd$a extends FilterOutputStream
{

	public void close()
		throws IOException
	{
		IOException ioexception = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		try
		{
			super.close();
	//    2    2:aload_0         
	//    3    3:invokespecial   #30  <Method void FilterOutputStream.close()>
		}
	//*   4    6:goto            10
		// Misplaced declaration of an exception variable
		catch(IOException ioexception) { }
	//    5    9:astore_1        
		if(b)
	//*   6   10:aload_0         
	//*   7   11:getfield        #18  <Field boolean b>
	//*   8   14:ifeq            27
			c.c();
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field jw$b c>
	//   11   21:invokevirtual   #34  <Method void jw$b.c()>
		else
	//*  12   24:goto            34
			c.d();
	//   13   27:aload_0         
	//   14   28:getfield        #20  <Field jw$b c>
	//   15   31:invokevirtual   #37  <Method void jw$b.d()>
		if(ioexception != null)
	//*  16   34:aload_1         
	//*  17   35:ifnull          40
			throw ioexception;
	//   18   38:aload_1         
	//   19   39:athrow          
		else
			return;
	//   20   40:return          
	}

	public void flush()
		throws IOException
	{
		try
		{
			super.flush();
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void FilterOutputStream.flush()>
			return;
	//    2    4:return          
		}
		catch(IOException ioexception)
	//*   3    5:astore_1        
		{
			b = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #18  <Field boolean b>
			throw ioexception;
	//    7   11:aload_1         
	//    8   12:athrow          
		}
	}

	public void write(int i)
		throws IOException
	{
		try
		{
			super.write(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #45  <Method void FilterOutputStream.write(int)>
			return;
	//    3    5:return          
		}
		catch(IOException ioexception)
	//*   4    6:astore_2        
		{
			b = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #18  <Field boolean b>
			throw ioexception;
	//    8   12:aload_2         
	//    9   13:athrow          
		}
	}

	public void write(byte abyte0[])
		throws IOException
	{
		try
		{
			super.write(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void FilterOutputStream.write(byte[])>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   4    6:astore_1        
		{
			b = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #18  <Field boolean b>
		}
		throw abyte0;
	//    8   12:aload_1         
	//    9   13:athrow          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		try
		{
			super.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #51  <Method void FilterOutputStream.write(byte[], int, int)>
			return;
	//    5    7:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   6    8:astore_1        
		{
			b = true;
	//    7    9:aload_0         
	//    8   10:iconst_1        
	//    9   11:putfield        #18  <Field boolean b>
		}
		throw abyte0;
	//   10   14:aload_1         
	//   11   15:athrow          
	}

	private boolean b;
	private final jw$b c;

	private kd$a(OutputStream outputstream, jw$b jw$b1)
	{
		super(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void FilterOutputStream(OutputStream)>
		b = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #18  <Field boolean b>
		c = jw$b1;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #20  <Field jw$b c>
	//    9   15:return          
	}

	kd$a(OutputStream outputstream, jw$b jw$b1, kd$1 kd$1)
	{
		this(outputstream, jw$b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void kd$a(OutputStream, jw$b)>
	//    4    6:return          
	}
}
