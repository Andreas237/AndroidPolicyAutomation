// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import java.io.*;

// Referenced classes of package com.android.volley.toolbox:
//			DiskBasedCache

static class DiskBasedCache$CountingInputStream extends FilterInputStream
{

	long bytesRemaining()
	{
		return length - bytesRead;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field long length>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field long bytesRead>
	//    4    8:lsub            
	//    5    9:lreturn         
	}

	public int read()
		throws IOException
	{
		int i = super.read();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method int FilterInputStream.read()>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          20
			bytesRead = bytesRead + 1L;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #22  <Field long bytesRead>
	//    9   15:lconst_1        
	//   10   16:ladd            
	//   11   17:putfield        #22  <Field long bytesRead>
		return i;
	//   12   20:iload_1         
	//   13   21:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		i = super.read(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #32  <Method int FilterInputStream.read(byte[], int, int)>
	//    5    7:istore_2        
		if(i != -1)
	//*   6    8:iload_2         
	//*   7    9:iconst_m1       
	//*   8   10:icmpeq          24
			bytesRead = bytesRead + (long)i;
	//    9   13:aload_0         
	//   10   14:aload_0         
	//   11   15:getfield        #22  <Field long bytesRead>
	//   12   18:iload_2         
	//   13   19:i2l             
	//   14   20:ladd            
	//   15   21:putfield        #22  <Field long bytesRead>
		return i;
	//   16   24:iload_2         
	//   17   25:ireturn         
	}

	private long bytesRead;
	private final long length;

	DiskBasedCache$CountingInputStream(InputStream inputstream, long l)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void FilterInputStream(InputStream)>
		length = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #17  <Field long length>
	//    6   10:return          
	}
}
