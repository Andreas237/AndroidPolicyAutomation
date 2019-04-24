// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.*;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.util:
//			zzb

public final class IOUtils
{
	private static final class zza extends ByteArrayOutputStream
	{

		final void zza(byte abyte0[], int i)
		{
			System.arraycopy(((Object) (buf)), 0, ((Object) (abyte0)), i, count);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field byte[] buf>
		//    2    4:iconst_0        
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:aload_0         
		//    6    8:getfield        #23  <Field int count>
		//    7   11:invokestatic    #29  <Method void System.arraycopy(Object, int, Object, int, int)>
		//    8   14:return          
		}

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ByteArrayOutputStream()>
		//    2    4:return          
		}

		zza(com.google.android.gms.common.util.zzb zzb1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void IOUtils$zza()>
		//    2    4:return          
		}
	}

	private static final class zzb
	{

		public final byte[] zzdd()
			throws IOException
		{
			FileInputStream fileinputstream = new FileInputStream(file);
		//    0    0:new             #34  <Class FileInputStream>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field File file>
		//    4    8:invokespecial   #35  <Method void FileInputStream(File)>
		//    5   11:astore_2        
			byte abyte0[] = IOUtils.zzb(((InputStream) (fileinputstream)), fileinputstream.getChannel().size());
		//    6   12:aload_2         
		//    7   13:aload_2         
		//    8   14:invokevirtual   #39  <Method FileChannel FileInputStream.getChannel()>
		//    9   17:invokevirtual   #45  <Method long FileChannel.size()>
		//   10   20:invokestatic    #48  <Method byte[] IOUtils.zzb(InputStream, long)>
		//   11   23:astore_1        
			IOUtils.closeQuietly(((Closeable) (fileinputstream)));
		//   12   24:aload_2         
		//   13   25:invokestatic    #52  <Method void IOUtils.closeQuietly(Closeable)>
			return abyte0;
		//   14   28:aload_1         
		//   15   29:areturn         
			Exception exception;
			exception;
		//   16   30:astore_1        
			break MISSING_BLOCK_LABEL_37;
		//   17   31:goto            37
			exception;
		//   18   34:astore_1        
			fileinputstream = null;
		//   19   35:aconst_null     
		//   20   36:astore_2        
			IOUtils.closeQuietly(((Closeable) (fileinputstream)));
		//   21   37:aload_2         
		//   22   38:invokestatic    #52  <Method void IOUtils.closeQuietly(Closeable)>
			throw exception;
		//   23   41:aload_1         
		//   24   42:athrow          
		}

		private final File file;

		private zzb(File file1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			file = (File)Preconditions.checkNotNull(((Object) (file1)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:checkcast       #22  <Class File>
		//    6   12:putfield        #24  <Field File file>
		//    7   15:return          
		}

		zzb(File file1, com.google.android.gms.common.util.zzb zzb1)
		{
			this(file1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #28  <Method void IOUtils$zzb(File)>
		//    3    5:return          
		}
	}


	private IOUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static void close(Closeable closeable, String s, String s1)
	{
		if(closeable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          19
			try
			{
				closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #24  <Method void Closeable.close()>
				return;
	//    4   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(Closeable closeable)
	//*   5   11:astore_0        
			{
				Log.d(s, s1, ((Throwable) (closeable)));
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:invokestatic    #30  <Method int Log.d(String, String, Throwable)>
	//   10   18:pop             
			}
	//   11   19:return          
	}

	public static void closeQuietly(ParcelFileDescriptor parcelfiledescriptor)
	{
		if(parcelfiledescriptor == null)
			break MISSING_BLOCK_LABEL_8;
	//    0    0:aload_0         
	//    1    1:ifnull          8
		parcelfiledescriptor.close();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #36  <Method void ParcelFileDescriptor.close()>
		return;
	//    4    8:return          
		parcelfiledescriptor;
	//    5    9:astore_0        
	//    6   10:return          
	}

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #24  <Method void Closeable.close()>
		return;
	//    4   10:return          
		closeable;
	//    5   11:astore_0        
	//    6   12:return          
	}

	public static void closeQuietly(ServerSocket serversocket)
	{
		if(serversocket == null)
			break MISSING_BLOCK_LABEL_8;
	//    0    0:aload_0         
	//    1    1:ifnull          8
		serversocket.close();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #41  <Method void ServerSocket.close()>
		return;
	//    4    8:return          
		serversocket;
	//    5    9:astore_0        
	//    6   10:return          
	}

	public static void closeQuietly(Socket socket)
	{
		if(socket == null)
			break MISSING_BLOCK_LABEL_8;
	//    0    0:aload_0         
	//    1    1:ifnull          8
		socket.close();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #45  <Method void Socket.close()>
		return;
	//    4    8:return          
		socket;
	//    5    9:astore_0        
	//    6   10:return          
	}

	public static long copyStream(InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		return copyStream(inputstream, outputstream, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #50  <Method long copyStream(InputStream, OutputStream, boolean)>
	//    4    6:lreturn         
	}

	public static long copyStream(InputStream inputstream, OutputStream outputstream, boolean flag)
		throws IOException
	{
		return copyStream(inputstream, outputstream, flag, 1024);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:sipush          1024
	//    4    6:invokestatic    #54  <Method long copyStream(InputStream, OutputStream, boolean, int)>
	//    5    9:lreturn         
	}

	public static long copyStream(InputStream inputstream, OutputStream outputstream, boolean flag, int i)
		throws IOException
	{
		long l;
		byte abyte0[];
		abyte0 = new byte[i];
	//    0    0:iload_3         
	//    1    1:newarray        byte[]
	//    2    3:astore          9
		l = 0L;
	//    3    5:lconst_0        
	//    4    6:lstore          5
_L2:
		int j = inputstream.read(abyte0, 0, i);
	//    5    8:aload_0         
	//    6    9:aload           9
	//    7   11:iconst_0        
	//    8   12:iload_3         
	//    9   13:invokevirtual   #60  <Method int InputStream.read(byte[], int, int)>
	//   10   16:istore          4
		long l1;
		if(j == -1)
			break; /* Loop/switch isn't completed */
	//   11   18:iload           4
	//   12   20:iconst_m1       
	//   13   21:icmpeq          48
		l1 = j;
	//   14   24:iload           4
	//   15   26:i2l             
	//   16   27:lstore          7
		outputstream.write(abyte0, 0, j);
	//   17   29:aload_1         
	//   18   30:aload           9
	//   19   32:iconst_0        
	//   20   33:iload           4
	//   21   35:invokevirtual   #66  <Method void OutputStream.write(byte[], int, int)>
		l += l1;
	//   22   38:lload           5
	//   23   40:lload           7
	//   24   42:ladd            
	//   25   43:lstore          5
		if(true) goto _L2; else goto _L1
	//   26   45:goto            8
_L1:
		if(flag)
	//*  27   48:iload_2         
	//*  28   49:ifeq            60
		{
			closeQuietly(((Closeable) (inputstream)));
	//   29   52:aload_0         
	//   30   53:invokestatic    #68  <Method void closeQuietly(Closeable)>
			closeQuietly(((Closeable) (outputstream)));
	//   31   56:aload_1         
	//   32   57:invokestatic    #68  <Method void closeQuietly(Closeable)>
		}
		return l;
	//   33   60:lload           5
	//   34   62:lreturn         
		Exception exception;
		exception;
	//   35   63:astore          9
		if(flag)
	//*  36   65:iload_2         
	//*  37   66:ifeq            77
		{
			closeQuietly(((Closeable) (inputstream)));
	//   38   69:aload_0         
	//   39   70:invokestatic    #68  <Method void closeQuietly(Closeable)>
			closeQuietly(((Closeable) (outputstream)));
	//   40   73:aload_1         
	//   41   74:invokestatic    #68  <Method void closeQuietly(Closeable)>
		}
		throw exception;
	//   42   77:aload           9
	//   43   79:athrow          
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
	//*  19   26:ldc1            #71  <Int 35615>
	//*  20   28:icmpne          33
				return true;
	//   21   31:iconst_1        
	//   22   32:ireturn         
		}
		return false;
	//   23   33:iconst_0        
	//   24   34:ireturn         
	}

	public static void lockAndTruncateFile(File file)
		throws IOException, OverlappingFileLockException
	{
		FileLock filelock;
		if(!file.exists())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #82  <Method boolean File.exists()>
	//*   2    4:ifne            15
			throw new FileNotFoundException();
	//    3    7:new             #84  <Class FileNotFoundException>
	//    4   10:dup             
	//    5   11:invokespecial   #85  <Method void FileNotFoundException()>
	//    6   14:athrow          
		filelock = null;
	//    7   15:aconst_null     
	//    8   16:astore_2        
		RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
	//    9   17:new             #87  <Class RandomAccessFile>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:ldc1            #89  <String "rw">
	//   13   24:invokespecial   #92  <Method void RandomAccessFile(File, String)>
	//   14   27:astore_1        
		FileLock filelock1;
		file = ((File) (randomaccessfile.getChannel()));
	//   15   28:aload_1         
	//   16   29:invokevirtual   #96  <Method FileChannel RandomAccessFile.getChannel()>
	//   17   32:astore_0        
		filelock1 = ((FileChannel) (file)).lock();
	//   18   33:aload_0         
	//   19   34:invokevirtual   #102 <Method FileLock FileChannel.lock()>
	//   20   37:astore_3        
		((FileChannel) (file)).truncate(0L);
	//   21   38:aload_0         
	//   22   39:lconst_0        
	//   23   40:invokevirtual   #106 <Method FileChannel FileChannel.truncate(long)>
	//   24   43:pop             
		if(filelock1 != null && filelock1.isValid())
	//*  25   44:aload_3         
	//*  26   45:ifnull          59
	//*  27   48:aload_3         
	//*  28   49:invokevirtual   #111 <Method boolean FileLock.isValid()>
	//*  29   52:ifeq            59
			try
			{
				filelock1.release();
	//   30   55:aload_3         
	//   31   56:invokevirtual   #114 <Method void FileLock.release()>
			}
	//*  32   59:aload_1         
	//*  33   60:invokestatic    #68  <Method void closeQuietly(Closeable)>
	//*  34   63:return          
	//*  35   64:astore_0        
	//*  36   65:aload_3         
	//*  37   66:astore_2        
	//*  38   67:goto            77
	//*  39   70:astore_0        
	//*  40   71:goto            77
	//*  41   74:astore_0        
	//*  42   75:aconst_null     
	//*  43   76:astore_1        
	//*  44   77:aload_2         
	//*  45   78:ifnull          92
	//*  46   81:aload_2         
	//*  47   82:invokevirtual   #111 <Method boolean FileLock.isValid()>
	//*  48   85:ifeq            92
	//*  49   88:aload_2         
	//*  50   89:invokevirtual   #114 <Method void FileLock.release()>
	//*  51   92:aload_1         
	//*  52   93:ifnull          100
	//*  53   96:aload_1         
	//*  54   97:invokestatic    #68  <Method void closeQuietly(Closeable)>
	//*  55  100:aload_0         
	//*  56  101:athrow          
			// Misplaced declaration of an exception variable
			catch(File file) { }
	//   57  102:astore_0        
		closeQuietly(((Closeable) (randomaccessfile)));
		return;
		file;
		filelock = filelock1;
		break MISSING_BLOCK_LABEL_77;
		file;
		break MISSING_BLOCK_LABEL_77;
		file;
		randomaccessfile = null;
		if(filelock != null && filelock.isValid())
			try
			{
				filelock.release();
			}
	//*  58  103:goto            59
			catch(IOException ioexception) { }
	//   59  106:astore_2        
		if(randomaccessfile != null)
			closeQuietly(((Closeable) (randomaccessfile)));
		throw file;
	//*  60  107:goto            92
	}

	public static byte[] readInputStreamFully(InputStream inputstream)
		throws IOException
	{
		return readInputStreamFully(inputstream, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #120 <Method byte[] readInputStreamFully(InputStream, boolean)>
	//    3    5:areturn         
	}

	public static byte[] readInputStreamFully(InputStream inputstream, boolean flag)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #122 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		copyStream(inputstream, ((OutputStream) (bytearrayoutputstream)), flag);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokestatic    #50  <Method long copyStream(InputStream, OutputStream, boolean)>
	//    8   14:pop2            
		return bytearrayoutputstream.toByteArray();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #127 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   11   19:areturn         
	}

	public static byte[] toByteArray(File file)
		throws IOException
	{
		return (new zzb(file, ((com.google.android.gms.common.util.zzb) (null)))).zzdd();
	//    0    0:new             #9   <Class IOUtils$zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #131 <Method void IOUtils$zzb(File, zzb)>
	//    5    9:invokevirtual   #134 <Method byte[] IOUtils$zzb.zzdd()>
	//    6   12:areturn         
	}

	public static byte[] toByteArray(InputStream inputstream)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #122 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		zza(inputstream, ((OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #136 <Method long zza(InputStream, OutputStream)>
	//    7   13:pop2            
		return bytearrayoutputstream.toByteArray();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #127 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   10   18:areturn         
	}

	private static long zza(InputStream inputstream, OutputStream outputstream)
		throws IOException
	{
		Preconditions.checkNotNull(((Object) (inputstream)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #142 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		Preconditions.checkNotNull(((Object) (outputstream)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #142 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		byte abyte0[] = new byte[4096];
	//    6   10:sipush          4096
	//    7   13:newarray        byte[]
	//    8   15:astore          5
		long l = 0L;
	//    9   17:lconst_0        
	//   10   18:lstore_3        
		do
		{
			int i = inputstream.read(abyte0);
	//   11   19:aload_0         
	//   12   20:aload           5
	//   13   22:invokevirtual   #145 <Method int InputStream.read(byte[])>
	//   14   25:istore_2        
			if(i != -1)
	//*  15   26:iload_2         
	//*  16   27:iconst_m1       
	//*  17   28:icmpeq          47
			{
				outputstream.write(abyte0, 0, i);
	//   18   31:aload_1         
	//   19   32:aload           5
	//   20   34:iconst_0        
	//   21   35:iload_2         
	//   22   36:invokevirtual   #66  <Method void OutputStream.write(byte[], int, int)>
				l += i;
	//   23   39:lload_3         
	//   24   40:iload_2         
	//   25   41:i2l             
	//   26   42:ladd            
	//   27   43:lstore_3        
			} else
	//*  28   44:goto            19
			{
				return l;
	//   29   47:lload_3         
	//   30   48:lreturn         
			}
		} while(true);
	}

	private static byte[] zza(InputStream inputstream, long l)
		throws IOException
	{
		if(l > 0x7fffffffL)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #147 <Long 0x7fffffffL>
	//*   2    4:lcmp            
	//*   3    5:ifle            50
		{
			inputstream = ((InputStream) (new StringBuilder(68)));
	//    4    8:new             #150 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:bipush          68
	//    7   14:invokespecial   #153 <Method void StringBuilder(int)>
	//    8   17:astore_0        
			((StringBuilder) (inputstream)).append("file is too large to fit in a byte array: ");
	//    9   18:aload_0         
	//   10   19:ldc1            #155 <String "file is too large to fit in a byte array: ">
	//   11   21:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			((StringBuilder) (inputstream)).append(l);
	//   13   25:aload_0         
	//   14   26:lload_1         
	//   15   27:invokevirtual   #162 <Method StringBuilder StringBuilder.append(long)>
	//   16   30:pop             
			((StringBuilder) (inputstream)).append(" bytes");
	//   17   31:aload_0         
	//   18   32:ldc1            #164 <String " bytes">
	//   19   34:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
			throw new OutOfMemoryError(((StringBuilder) (inputstream)).toString());
	//   21   38:new             #166 <Class OutOfMemoryError>
	//   22   41:dup             
	//   23   42:aload_0         
	//   24   43:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   25   46:invokespecial   #173 <Method void OutOfMemoryError(String)>
	//   26   49:athrow          
		}
		if(l == 0L)
	//*  27   50:lload_1         
	//*  28   51:lconst_0        
	//*  29   52:lcmp            
	//*  30   53:ifne            61
			return toByteArray(inputstream);
	//   31   56:aload_0         
	//   32   57:invokestatic    #175 <Method byte[] toByteArray(InputStream)>
	//   33   60:areturn         
		int k = (int)l;
	//   34   61:lload_1         
	//   35   62:l2i             
	//   36   63:istore          4
		byte abyte0[] = new byte[k];
	//   37   65:iload           4
	//   38   67:newarray        byte[]
	//   39   69:astore          7
		int j1;
		for(int i = k; i > 0; i -= j1)
	//*  40   71:iload           4
	//*  41   73:istore_3        
	//*  42   74:iload_3         
	//*  43   75:ifle            117
		{
			int i1 = k - i;
	//   44   78:iload           4
	//   45   80:iload_3         
	//   46   81:isub            
	//   47   82:istore          5
			j1 = inputstream.read(abyte0, i1, i);
	//   48   84:aload_0         
	//   49   85:aload           7
	//   50   87:iload           5
	//   51   89:iload_3         
	//   52   90:invokevirtual   #60  <Method int InputStream.read(byte[], int, int)>
	//   53   93:istore          6
			if(j1 == -1)
	//*  54   95:iload           6
	//*  55   97:iconst_m1       
	//*  56   98:icmpne          109
				return Arrays.copyOf(abyte0, i1);
	//   57  101:aload           7
	//   58  103:iload           5
	//   59  105:invokestatic    #181 <Method byte[] Arrays.copyOf(byte[], int)>
	//   60  108:areturn         
		}

	//   61  109:iload_3         
	//   62  110:iload           6
	//   63  112:isub            
	//   64  113:istore_3        
	//*  65  114:goto            74
		int j = inputstream.read();
	//   66  117:aload_0         
	//   67  118:invokevirtual   #184 <Method int InputStream.read()>
	//   68  121:istore_3        
		if(j == -1)
	//*  69  122:iload_3         
	//*  70  123:iconst_m1       
	//*  71  124:icmpne          130
		{
			return abyte0;
	//   72  127:aload           7
	//   73  129:areturn         
		} else
		{
			zza zza1 = new zza(((com.google.android.gms.common.util.zzb) (null)));
	//   74  130:new             #6   <Class IOUtils$zza>
	//   75  133:dup             
	//   76  134:aconst_null     
	//   77  135:invokespecial   #187 <Method void IOUtils$zza(zzb)>
	//   78  138:astore          8
			zza1.write(j);
	//   79  140:aload           8
	//   80  142:iload_3         
	//   81  143:invokevirtual   #189 <Method void IOUtils$zza.write(int)>
			zza(inputstream, ((OutputStream) (zza1)));
	//   82  146:aload_0         
	//   83  147:aload           8
	//   84  149:invokestatic    #136 <Method long zza(InputStream, OutputStream)>
	//   85  152:pop2            
			inputstream = ((InputStream) (Arrays.copyOf(abyte0, abyte0.length + zza1.size())));
	//   86  153:aload           7
	//   87  155:aload           7
	//   88  157:arraylength     
	//   89  158:aload           8
	//   90  160:invokevirtual   #192 <Method int IOUtils$zza.size()>
	//   91  163:iadd            
	//   92  164:invokestatic    #181 <Method byte[] Arrays.copyOf(byte[], int)>
	//   93  167:astore_0        
			zza1.zza(((byte []) (inputstream)), abyte0.length);
	//   94  168:aload           8
	//   95  170:aload_0         
	//   96  171:aload           7
	//   97  173:arraylength     
	//   98  174:invokevirtual   #195 <Method void IOUtils$zza.zza(byte[], int)>
			return ((byte []) (inputstream));
	//   99  177:aload_0         
	//  100  178:areturn         
		}
	}

	static byte[] zzb(InputStream inputstream, long l)
		throws IOException
	{
		return zza(inputstream, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #197 <Method byte[] zza(InputStream, long)>
	//    3    5:areturn         
	}
}
