// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource

class ArrayRandomAccessSource
	implements RandomAccessSource
{

	public ArrayRandomAccessSource(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		if(abyte0 == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       16
		{
			throw new NullPointerException();
	//    4    8:new             #15  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:invokespecial   #16  <Method void NullPointerException()>
	//    7   15:athrow          
		} else
		{
			array = abyte0;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #18  <Field byte[] array>
			return;
	//   11   21:return          
		}
	}

	public void close()
		throws IOException
	{
		array = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #18  <Field byte[] array>
	//    3    5:return          
	}

	public int get(long l)
	{
		if(l >= (long)array.length)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #18  <Field byte[] array>
	//*   3    5:arraylength     
	//*   4    6:i2l             
	//*   5    7:lcmp            
	//*   6    8:iflt            13
			return -1;
	//    7   11:iconst_m1       
	//    8   12:ireturn         
		else
			return array[(int)l] & 0xff;
	//    9   13:aload_0         
	//   10   14:getfield        #18  <Field byte[] array>
	//   11   17:lload_1         
	//   12   18:l2i             
	//   13   19:baload          
	//   14   20:sipush          255
	//   15   23:iand            
	//   16   24:ireturn         
	}

	public int get(long l, byte abyte0[], int i, int j)
	{
		if(array == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field byte[] array>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("Already closed");
	//    3    7:new             #28  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #30  <String "Already closed">
	//    6   13:invokespecial   #33  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(l >= (long)array.length)
	//*   8   17:lload_1         
	//*   9   18:aload_0         
	//*  10   19:getfield        #18  <Field byte[] array>
	//*  11   22:arraylength     
	//*  12   23:i2l             
	//*  13   24:lcmp            
	//*  14   25:iflt            30
			return -1;
	//   15   28:iconst_m1       
	//   16   29:ireturn         
		int k = j;
	//   17   30:iload           5
	//   18   32:istore          6
		if((long)j + l > (long)array.length)
	//*  19   34:iload           5
	//*  20   36:i2l             
	//*  21   37:lload_1         
	//*  22   38:ladd            
	//*  23   39:aload_0         
	//*  24   40:getfield        #18  <Field byte[] array>
	//*  25   43:arraylength     
	//*  26   44:i2l             
	//*  27   45:lcmp            
	//*  28   46:ifle            60
			k = (int)((long)array.length - l);
	//   29   49:aload_0         
	//   30   50:getfield        #18  <Field byte[] array>
	//   31   53:arraylength     
	//   32   54:i2l             
	//   33   55:lload_1         
	//   34   56:lsub            
	//   35   57:l2i             
	//   36   58:istore          6
		System.arraycopy(((Object) (array)), (int)l, ((Object) (abyte0)), i, k);
	//   37   60:aload_0         
	//   38   61:getfield        #18  <Field byte[] array>
	//   39   64:lload_1         
	//   40   65:l2i             
	//   41   66:aload_3         
	//   42   67:iload           4
	//   43   69:iload           6
	//   44   71:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		return k;
	//   45   74:iload           6
	//   46   76:ireturn         
	}

	public long length()
	{
		return (long)array.length;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field byte[] array>
	//    2    4:arraylength     
	//    3    5:i2l             
	//    4    6:lreturn         
	}

	private byte array[];
}
