// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.*;

public final class IOUtils
{

	private IOUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void closeQuietly(ParcelFileDescriptor parcelfiledescriptor)
	{
		if(parcelfiledescriptor != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          9
			try
			{
				parcelfiledescriptor.close();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #22  <Method void ParcelFileDescriptor.close()>
				return;
	//    4    8:return          
			}
	//*   5    9:return          
			// Misplaced declaration of an exception variable
			catch(ParcelFileDescriptor parcelfiledescriptor)
	//*   6   10:astore_0        
			{
				return;
	//    7   11:return          
			}
		else
			return;
	}

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
			try
			{
				closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #28  <Method void Closeable.close()>
				return;
	//    4   10:return          
			}
	//*   5   11:return          
			// Misplaced declaration of an exception variable
			catch(Closeable closeable)
	//*   6   12:astore_0        
			{
				return;
	//    7   13:return          
			}
		else
			return;
	}

	public static long copyStream(InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		return zza(inputstream, outputstream, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #34  <Method long zza(InputStream, OutputStream, boolean)>
	//    4    6:lreturn         
	}

	public static long copyStream(InputStream inputstream, OutputStream outputstream, boolean flag, int i)
		throws IOException
	{
		long l;
		byte abyte0[];
		abyte0 = new byte[i];
	//    0    0:iload_3         
	//    1    1:newarray        byte[]
	//    2    3:astore          7
		l = 0L;
	//    3    5:lconst_0        
	//    4    6:lstore          5
_L2:
		int j = inputstream.read(abyte0, 0, i);
	//    5    8:aload_0         
	//    6    9:aload           7
	//    7   11:iconst_0        
	//    8   12:iload_3         
	//    9   13:invokevirtual   #43  <Method int InputStream.read(byte[], int, int)>
	//   10   16:istore          4
		if(j == -1)
			break; /* Loop/switch isn't completed */
	//   11   18:iload           4
	//   12   20:iconst_m1       
	//   13   21:icmpeq          44
		l += j;
	//   14   24:lload           5
	//   15   26:iload           4
	//   16   28:i2l             
	//   17   29:ladd            
	//   18   30:lstore          5
		outputstream.write(abyte0, 0, j);
	//   19   32:aload_1         
	//   20   33:aload           7
	//   21   35:iconst_0        
	//   22   36:iload           4
	//   23   38:invokevirtual   #49  <Method void OutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   24   41:goto            8
_L1:
		if(flag)
	//*  25   44:iload_2         
	//*  26   45:ifeq            56
		{
			closeQuietly(((Closeable) (inputstream)));
	//   27   48:aload_0         
	//   28   49:invokestatic    #51  <Method void closeQuietly(Closeable)>
			closeQuietly(((Closeable) (outputstream)));
	//   29   52:aload_1         
	//   30   53:invokestatic    #51  <Method void closeQuietly(Closeable)>
		}
		return l;
	//   31   56:lload           5
	//   32   58:lreturn         
		Exception exception;
		exception;
	//   33   59:astore          7
		if(flag)
	//*  34   61:iload_2         
	//*  35   62:ifeq            73
		{
			closeQuietly(((Closeable) (inputstream)));
	//   36   65:aload_0         
	//   37   66:invokestatic    #51  <Method void closeQuietly(Closeable)>
			closeQuietly(((Closeable) (outputstream)));
	//   38   69:aload_1         
	//   39   70:invokestatic    #51  <Method void closeQuietly(Closeable)>
		}
		throw exception;
	//   40   73:aload           7
	//   41   75:athrow          
	}

	public static boolean isGzipByteBuffer(byte abyte0[])
	{
		if(abyte0.length > 1)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:iconst_1        
	//*   3    3:icmple          33
		{
			byte byte0 = abyte0[0];
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:baload          
	//    7    9:istore_1        
			if(((abyte0[1] & 0xff) << 8 | byte0 & 0xff) == 35615)
	//*   8   10:aload_0         
	//*   9   11:iconst_1        
	//*  10   12:baload          
	//*  11   13:sipush          255
	//*  12   16:iand            
	//*  13   17:bipush          8
	//*  14   19:ishl            
	//*  15   20:iload_1         
	//*  16   21:sipush          255
	//*  17   24:iand            
	//*  18   25:ior             
	//*  19   26:ldc1            #54  <Int 35615>
	//*  20   28:icmpne          33
				return true;
	//   21   31:iconst_1        
	//   22   32:ireturn         
		}
		return false;
	//   23   33:iconst_0        
	//   24   34:ireturn         
	}

	public static byte[] readInputStreamFully(InputStream inputstream)
		throws IOException
	{
		return readInputStreamFully(inputstream, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #59  <Method byte[] readInputStreamFully(InputStream, boolean)>
	//    3    5:areturn         
	}

	public static byte[] readInputStreamFully(InputStream inputstream, boolean flag)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #61  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		zza(inputstream, ((OutputStream) (bytearrayoutputstream)), flag);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokestatic    #34  <Method long zza(InputStream, OutputStream, boolean)>
	//    8   14:pop2            
		return bytearrayoutputstream.toByteArray();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #66  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   11   19:areturn         
	}

	public static byte[] toByteArray(InputStream inputstream)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #61  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		Preconditions.checkNotNull(((Object) (inputstream)));
	//    4    8:aload_0         
	//    5    9:invokestatic    #72  <Method Object Preconditions.checkNotNull(Object)>
	//    6   12:pop             
		Preconditions.checkNotNull(((Object) (bytearrayoutputstream)));
	//    7   13:aload_2         
	//    8   14:invokestatic    #72  <Method Object Preconditions.checkNotNull(Object)>
	//    9   17:pop             
		byte abyte0[] = new byte[4096];
	//   10   18:sipush          4096
	//   11   21:newarray        byte[]
	//   12   23:astore_3        
		do
		{
			int i = inputstream.read(abyte0);
	//   13   24:aload_0         
	//   14   25:aload_3         
	//   15   26:invokevirtual   #75  <Method int InputStream.read(byte[])>
	//   16   29:istore_1        
			if(i != -1)
	//*  17   30:iload_1         
	//*  18   31:iconst_m1       
	//*  19   32:icmpeq          45
				((OutputStream) (bytearrayoutputstream)).write(abyte0, 0, i);
	//   20   35:aload_2         
	//   21   36:aload_3         
	//   22   37:iconst_0        
	//   23   38:iload_1         
	//   24   39:invokevirtual   #49  <Method void OutputStream.write(byte[], int, int)>
			else
	//*  25   42:goto            24
				return bytearrayoutputstream.toByteArray();
	//   26   45:aload_2         
	//   27   46:invokevirtual   #66  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   28   49:areturn         
		} while(true);
	}

	private static long zza(InputStream inputstream, OutputStream outputstream, boolean flag)
		throws IOException
	{
		return copyStream(inputstream, outputstream, flag, 1024);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:sipush          1024
	//    4    6:invokestatic    #77  <Method long copyStream(InputStream, OutputStream, boolean, int)>
	//    5    9:lreturn         
	}
}
