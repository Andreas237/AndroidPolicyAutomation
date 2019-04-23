// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

final class mx extends FilterInputStream
{

	mx(InputStream inputstream, long l)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void FilterInputStream(InputStream)>
		a = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #14  <Field long a>
	//    6   10:return          
	}

	final long a()
	{
		return a - b;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field long a>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field long b>
	//    4    8:lsub            
	//    5    9:lreturn         
	}

	public final int read()
	{
		int i = super.read();
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method int FilterInputStream.read()>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          20
			b = b + 1L;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #18  <Field long b>
	//    9   15:lconst_1        
	//   10   16:ladd            
	//   11   17:putfield        #18  <Field long b>
		return i;
	//   12   20:iload_1         
	//   13   21:ireturn         
	}

	public final int read(byte abyte0[], int i, int j)
	{
		i = super.read(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #25  <Method int FilterInputStream.read(byte[], int, int)>
	//    5    7:istore_2        
		if(i != -1)
	//*   6    8:iload_2         
	//*   7    9:iconst_m1       
	//*   8   10:icmpeq          24
			b = b + (long)i;
	//    9   13:aload_0         
	//   10   14:aload_0         
	//   11   15:getfield        #18  <Field long b>
	//   12   18:iload_2         
	//   13   19:i2l             
	//   14   20:ladd            
	//   15   21:putfield        #18  <Field long b>
		return i;
	//   16   24:iload_2         
	//   17   25:ireturn         
	}

	private final long a;
	private long b;
}
