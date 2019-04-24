// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.io.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			iz

class iz$a$a extends FilterOutputStream
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
			iz.a.a(a, true);
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field iz$a a>
	//    7   13:iconst_1        
	//    8   14:invokestatic    #36  <Method boolean iz$a.a(iz$a, boolean)>
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
	//    2    4:invokevirtual   #39  <Method void OutputStream.flush()>
			return;
	//    3    7:return          
		}
		catch(IOException ioexception)
	//*   4    8:astore_1        
		{
			iz.a.a(a, true);
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field iz$a a>
	//    7   13:iconst_1        
	//    8   14:invokestatic    #36  <Method boolean iz$a.a(iz$a, boolean)>
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
	//    3    5:invokevirtual   #43  <Method void OutputStream.write(int)>
			return;
	//    4    8:return          
		}
		catch(IOException ioexception)
	//*   5    9:astore_2        
		{
			iz.a.a(a, true);
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field iz$a a>
	//    8   14:iconst_1        
	//    9   15:invokestatic    #36  <Method boolean iz$a.a(iz$a, boolean)>
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
	//    5    7:invokevirtual   #46  <Method void OutputStream.write(byte[], int, int)>
			return;
	//    6   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   7   11:astore_1        
		{
			iz.a.a(a, true);
	//    8   12:aload_0         
	//    9   13:getfield        #14  <Field iz$a a>
	//   10   16:iconst_1        
	//   11   17:invokestatic    #36  <Method boolean iz$a.a(iz$a, boolean)>
	//   12   20:pop             
		}
	//   13   21:return          
	}

	final iz.a a;

	private iz$a$a(iz.a a1, OutputStream outputstream)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field iz$a a>
		super(outputstream);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #17  <Method void FilterOutputStream(OutputStream)>
	//    6   10:return          
	}

	iz$a$a(iz.a a1, OutputStream outputstream, iz._cls1 _pcls1)
	{
		this(a1, outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void iz$a$a(iz$a, OutputStream)>
	//    4    6:return          
	}
}
