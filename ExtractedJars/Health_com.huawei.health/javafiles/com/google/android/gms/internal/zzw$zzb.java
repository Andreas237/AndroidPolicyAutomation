// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzw

static class zzw$zzb extends FilterInputStream
{

	static int zza(zzw$zzb zzw$zzb1)
	{
		return zzw$zzb1.zzaC;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int zzaC>
	//    2    4:ireturn         
	}

	public int read()
		throws IOException
	{
		int i = super.read();
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method int FilterInputStream.read()>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          20
			zzaC = zzaC + 1;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #15  <Field int zzaC>
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:putfield        #15  <Field int zzaC>
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
	//    4    4:invokespecial   #30  <Method int FilterInputStream.read(byte[], int, int)>
	//    5    7:istore_2        
		if(i != -1)
	//*   6    8:iload_2         
	//*   7    9:iconst_m1       
	//*   8   10:icmpeq          23
			zzaC = zzaC + i;
	//    9   13:aload_0         
	//   10   14:aload_0         
	//   11   15:getfield        #15  <Field int zzaC>
	//   12   18:iload_2         
	//   13   19:iadd            
	//   14   20:putfield        #15  <Field int zzaC>
		return i;
	//   15   23:iload_2         
	//   16   24:ireturn         
	}

	private int zzaC;

	private zzw$zzb(InputStream inputstream)
	{
		super(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void FilterInputStream(InputStream)>
		zzaC = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #15  <Field int zzaC>
	//    6   10:return          
	}

	zzw$zzb(InputStream inputstream, zzw._cls1 _pcls1)
	{
		this(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void zzw$zzb(InputStream)>
	//    3    5:return          
	}
}
