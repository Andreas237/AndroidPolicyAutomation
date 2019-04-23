// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.io.*;

// Referenced classes of package bo.app:
//			av

class av$a$a extends FilterOutputStream
{

	public void close()
	{
		IOException ioexception;
		try
		{
			out.close();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field OutputStream out>
	//    2    4:invokevirtual   #33  <Method void OutputStream.close()>
			return;
	//    3    7:return          
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #14  <Field av$a a>
	//*   6   12:iconst_1        
	//*   7   13:invokestatic    #36  <Method boolean av$a.a(av$a, boolean)>
	//*   8   16:pop             
	//*   9   17:return          
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			av.a.a(a, true);
		}
	//*  10   18:astore_1        
	//*  11   19:goto            8
	}

	public void flush()
	{
		IOException ioexception;
		try
		{
			out.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field OutputStream out>
	//    2    4:invokevirtual   #39  <Method void OutputStream.flush()>
			return;
	//    3    7:return          
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #14  <Field av$a a>
	//*   6   12:iconst_1        
	//*   7   13:invokestatic    #36  <Method boolean av$a.a(av$a, boolean)>
	//*   8   16:pop             
	//*   9   17:return          
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			av.a.a(a, true);
		}
	//*  10   18:astore_1        
	//*  11   19:goto            8
	}

	public void write(int i)
	{
		IOException ioexception;
		try
		{
			out.write(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field OutputStream out>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #43  <Method void OutputStream.write(int)>
			return;
	//    4    8:return          
		}
	//*   5    9:aload_0         
	//*   6   10:getfield        #14  <Field av$a a>
	//*   7   13:iconst_1        
	//*   8   14:invokestatic    #36  <Method boolean av$a.a(av$a, boolean)>
	//*   9   17:pop             
	//*  10   18:return          
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			av.a.a(a, true);
		}
	//*  11   19:astore_2        
	//*  12   20:goto            9
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
	//    5    7:invokevirtual   #46  <Method void OutputStream.write(byte[], int, int)>
			return;
	//    6   10:return          
		}
	//*   7   11:aload_0         
	//*   8   12:getfield        #14  <Field av$a a>
	//*   9   15:iconst_1        
	//*  10   16:invokestatic    #36  <Method boolean av$a.a(av$a, boolean)>
	//*  11   19:pop             
	//*  12   20:return          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			av.a.a(a, true);
		}
	//*  13   21:astore_1        
	//*  14   22:goto            11
	}

	final av.a a;

	private av$a$a(av.a a1, OutputStream outputstream)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field av$a a>
		super(outputstream);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void FilterOutputStream(OutputStream)>
	//    6   10:return          
	}

	av$a$a(av.a a1, OutputStream outputstream, av._cls1 _pcls1)
	{
		this(a1, outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void av$a$a(av$a, OutputStream)>
	//    4    6:return          
	}
}
