// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;

// Referenced classes of package o:
//			jw

class jw$b$b extends FilterOutputStream
{

	public void close()
	{
		try
		{
			out.close();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field OutputStream out>
	//    2    4:invokevirtual   #33  <Method void OutputStream.close()>
			return;
	//    3    7:return          
		}
		catch(IOException ioexception)
	//*   4    8:astore_1        
		{
			jw.b.d(b, true);
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field jw$b b>
	//    7   13:iconst_1        
	//    8   14:invokestatic    #37  <Method boolean jw$b.d(jw$b, boolean)>
	//    9   17:pop             
		}
	//   10   18:return          
	}

	public void flush()
	{
		try
		{
			out.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field OutputStream out>
	//    2    4:invokevirtual   #40  <Method void OutputStream.flush()>
			return;
	//    3    7:return          
		}
		catch(IOException ioexception)
	//*   4    8:astore_1        
		{
			jw.b.d(b, true);
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field jw$b b>
	//    7   13:iconst_1        
	//    8   14:invokestatic    #37  <Method boolean jw$b.d(jw$b, boolean)>
	//    9   17:pop             
		}
	//   10   18:return          
	}

	public void write(int i)
	{
		try
		{
			out.write(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field OutputStream out>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #44  <Method void OutputStream.write(int)>
			return;
	//    4    8:return          
		}
		catch(IOException ioexception)
	//*   5    9:astore_2        
		{
			jw.b.d(b, true);
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field jw$b b>
	//    8   14:iconst_1        
	//    9   15:invokestatic    #37  <Method boolean jw$b.d(jw$b, boolean)>
	//   10   18:pop             
		}
	//   11   19:return          
	}

	public void write(byte abyte0[], int i, int j)
	{
		try
		{
			out.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field OutputStream out>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #47  <Method void OutputStream.write(byte[], int, int)>
			return;
	//    6   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   7   11:astore_1        
		{
			jw.b.d(b, true);
	//    8   12:aload_0         
	//    9   13:getfield        #14  <Field jw$b b>
	//   10   16:iconst_1        
	//   11   17:invokestatic    #37  <Method boolean jw$b.d(jw$b, boolean)>
	//   12   20:pop             
		}
	//   13   21:return          
	}

	final jw.b b;

	private jw$b$b(jw.b b1, OutputStream outputstream)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field jw$b b>
		super(outputstream);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void FilterOutputStream(OutputStream)>
	//    6   10:return          
	}

	jw$b$b(jw.b b1, OutputStream outputstream, jw.a a)
	{
		this(b1, outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void jw$b$b(jw$b, OutputStream)>
	//    4    6:return          
	}
}
