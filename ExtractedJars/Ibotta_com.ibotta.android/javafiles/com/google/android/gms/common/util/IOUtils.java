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
	//    9   13:invokevirtual   #60  <Method int InputStream.read(byte[], int, int)>
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
	//   23   38:invokevirtual   #66  <Method void OutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   24   41:goto            8
_L1:
		if(flag)
	//*  25   44:iload_2         
	//*  26   45:ifeq            56
		{
			closeQuietly(((Closeable) (inputstream)));
	//   27   48:aload_0         
	//   28   49:invokestatic    #68  <Method void closeQuietly(Closeable)>
			closeQuietly(((Closeable) (outputstream)));
	//   29   52:aload_1         
	//   30   53:invokestatic    #68  <Method void closeQuietly(Closeable)>
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
	//   37   66:invokestatic    #68  <Method void closeQuietly(Closeable)>
			closeQuietly(((Closeable) (outputstream)));
	//   38   69:aload_1         
	//   39   70:invokestatic    #68  <Method void closeQuietly(Closeable)>
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
		Object obj;
		Object obj1;
		if(!file.exists())
			break MISSING_BLOCK_LABEL_108;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method boolean File.exists()>
	//    2    4:ifeq            108
		obj = null;
	//    3    7:aconst_null     
	//    4    8:astore_2        
		obj1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_3        
		RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
	//    7   11:new             #84  <Class RandomAccessFile>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:ldc1            #86  <String "rw">
	//   11   18:invokespecial   #89  <Method void RandomAccessFile(File, String)>
	//   12   21:astore_1        
		file = ((File) (obj1));
	//   13   22:aload_3         
	//   14   23:astore_0        
		FileChannel filechannel = randomaccessfile.getChannel();
	//   15   24:aload_1         
	//   16   25:invokevirtual   #93  <Method FileChannel RandomAccessFile.getChannel()>
	//   17   28:astore          4
		file = ((File) (obj1));
	//   18   30:aload_3         
	//   19   31:astore_0        
		obj = ((Object) (filechannel.lock()));
	//   20   32:aload           4
	//   21   34:invokevirtual   #99  <Method FileLock FileChannel.lock()>
	//   22   37:astore_2        
		file = ((File) (obj));
	//   23   38:aload_2         
	//   24   39:astore_0        
		filechannel.truncate(0L);
	//   25   40:aload           4
	//   26   42:lconst_0        
	//   27   43:invokevirtual   #103 <Method FileChannel FileChannel.truncate(long)>
	//   28   46:pop             
		Exception exception;
		Exception exception1;
		if(obj != null && ((FileLock) (obj)).isValid())
	//*  29   47:aload_2         
	//*  30   48:ifnull          62
	//*  31   51:aload_2         
	//*  32   52:invokevirtual   #108 <Method boolean FileLock.isValid()>
	//*  33   55:ifeq            62
			try
			{
				((FileLock) (obj)).release();
	//   34   58:aload_2         
	//   35   59:invokevirtual   #111 <Method void FileLock.release()>
			}
	//*  36   62:aload_1         
	//*  37   63:invokestatic    #68  <Method void closeQuietly(Closeable)>
	//*  38   66:return          
	//*  39   67:astore_3        
	//*  40   68:aload_0         
	//*  41   69:astore_2        
	//*  42   70:aload_1         
	//*  43   71:astore_0        
	//*  44   72:aload_3         
	//*  45   73:astore_1        
	//*  46   74:goto            80
	//*  47   77:astore_1        
	//*  48   78:aconst_null     
	//*  49   79:astore_0        
	//*  50   80:aload_2         
	//*  51   81:ifnull          98
	//*  52   84:aload_2         
	//*  53   85:invokevirtual   #108 <Method boolean FileLock.isValid()>
	//*  54   88:ifeq            98
	//*  55   91:aload_2         
	//*  56   92:invokevirtual   #111 <Method void FileLock.release()>
	//*  57   95:goto            98
	//*  58   98:aload_0         
	//*  59   99:ifnull          106
	//*  60  102:aload_0         
	//*  61  103:invokestatic    #68  <Method void closeQuietly(Closeable)>
	//*  62  106:aload_1         
	//*  63  107:athrow          
	//*  64  108:new             #113 <Class FileNotFoundException>
	//*  65  111:dup             
	//*  66  112:invokespecial   #114 <Method void FileNotFoundException()>
	//*  67  115:athrow          
			// Misplaced declaration of an exception variable
			catch(File file) { }
	//   68  116:astore_0        
		closeQuietly(((Closeable) (randomaccessfile)));
		return;
		exception1;
		obj = ((Object) (file));
		file = ((File) (randomaccessfile));
		exception = exception1;
		break MISSING_BLOCK_LABEL_80;
		exception;
		file = null;
		if(obj != null && ((FileLock) (obj)).isValid())
			try
			{
				((FileLock) (obj)).release();
			}
	//*  69  117:goto            62
			catch(IOException ioexception) { }
	//   70  120:astore_2        
		if(file != null)
			closeQuietly(((Closeable) (file)));
		throw exception;
		throw new FileNotFoundException();
	//*  71  121:goto            98
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
		if(l <= 0x7fffffffL)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #147 <Long 0x7fffffffL>
	//*   2    4:lcmp            
	//*   3    5:ifgt            137
		{
			if(l == 0L)
	//*   4    8:lload_1         
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifne            19
				return toByteArray(inputstream);
	//    8   14:aload_0         
	//    9   15:invokestatic    #150 <Method byte[] toByteArray(InputStream)>
	//   10   18:areturn         
			int k = (int)l;
	//   11   19:lload_1         
	//   12   20:l2i             
	//   13   21:istore          4
			byte abyte0[] = new byte[k];
	//   14   23:iload           4
	//   15   25:newarray        byte[]
	//   16   27:astore          7
			int j1;
			for(int i = k; i > 0; i -= j1)
	//*  17   29:iload           4
	//*  18   31:istore_3        
	//*  19   32:iload_3         
	//*  20   33:ifle            75
			{
				int i1 = k - i;
	//   21   36:iload           4
	//   22   38:iload_3         
	//   23   39:isub            
	//   24   40:istore          5
				j1 = inputstream.read(abyte0, i1, i);
	//   25   42:aload_0         
	//   26   43:aload           7
	//   27   45:iload           5
	//   28   47:iload_3         
	//   29   48:invokevirtual   #60  <Method int InputStream.read(byte[], int, int)>
	//   30   51:istore          6
				if(j1 == -1)
	//*  31   53:iload           6
	//*  32   55:iconst_m1       
	//*  33   56:icmpne          67
					return Arrays.copyOf(abyte0, i1);
	//   34   59:aload           7
	//   35   61:iload           5
	//   36   63:invokestatic    #156 <Method byte[] Arrays.copyOf(byte[], int)>
	//   37   66:areturn         
			}

	//   38   67:iload_3         
	//   39   68:iload           6
	//   40   70:isub            
	//   41   71:istore_3        
	//*  42   72:goto            32
			int j = inputstream.read();
	//   43   75:aload_0         
	//   44   76:invokevirtual   #159 <Method int InputStream.read()>
	//   45   79:istore_3        
			if(j == -1)
	//*  46   80:iload_3         
	//*  47   81:iconst_m1       
	//*  48   82:icmpne          88
			{
				return abyte0;
	//   49   85:aload           7
	//   50   87:areturn         
			} else
			{
				zza zza1 = new zza(((com.google.android.gms.common.util.zzb) (null)));
	//   51   88:new             #6   <Class IOUtils$zza>
	//   52   91:dup             
	//   53   92:aconst_null     
	//   54   93:invokespecial   #162 <Method void IOUtils$zza(zzb)>
	//   55   96:astore          8
				zza1.write(j);
	//   56   98:aload           8
	//   57  100:iload_3         
	//   58  101:invokevirtual   #165 <Method void IOUtils$zza.write(int)>
				zza(inputstream, ((OutputStream) (zza1)));
	//   59  104:aload_0         
	//   60  105:aload           8
	//   61  107:invokestatic    #136 <Method long zza(InputStream, OutputStream)>
	//   62  110:pop2            
				inputstream = ((InputStream) (Arrays.copyOf(abyte0, abyte0.length + zza1.size())));
	//   63  111:aload           7
	//   64  113:aload           7
	//   65  115:arraylength     
	//   66  116:aload           8
	//   67  118:invokevirtual   #168 <Method int IOUtils$zza.size()>
	//   68  121:iadd            
	//   69  122:invokestatic    #156 <Method byte[] Arrays.copyOf(byte[], int)>
	//   70  125:astore_0        
				zza1.zza(((byte []) (inputstream)), abyte0.length);
	//   71  126:aload           8
	//   72  128:aload_0         
	//   73  129:aload           7
	//   74  131:arraylength     
	//   75  132:invokevirtual   #171 <Method void IOUtils$zza.zza(byte[], int)>
				return ((byte []) (inputstream));
	//   76  135:aload_0         
	//   77  136:areturn         
			}
		} else
		{
			inputstream = ((InputStream) (new StringBuilder(68)));
	//   78  137:new             #173 <Class StringBuilder>
	//   79  140:dup             
	//   80  141:bipush          68
	//   81  143:invokespecial   #175 <Method void StringBuilder(int)>
	//   82  146:astore_0        
			((StringBuilder) (inputstream)).append("file is too large to fit in a byte array: ");
	//   83  147:aload_0         
	//   84  148:ldc1            #177 <String "file is too large to fit in a byte array: ">
	//   85  150:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   86  153:pop             
			((StringBuilder) (inputstream)).append(l);
	//   87  154:aload_0         
	//   88  155:lload_1         
	//   89  156:invokevirtual   #184 <Method StringBuilder StringBuilder.append(long)>
	//   90  159:pop             
			((StringBuilder) (inputstream)).append(" bytes");
	//   91  160:aload_0         
	//   92  161:ldc1            #186 <String " bytes">
	//   93  163:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   94  166:pop             
			throw new OutOfMemoryError(((StringBuilder) (inputstream)).toString());
	//   95  167:new             #188 <Class OutOfMemoryError>
	//   96  170:dup             
	//   97  171:aload_0         
	//   98  172:invokevirtual   #192 <Method String StringBuilder.toString()>
	//   99  175:invokespecial   #195 <Method void OutOfMemoryError(String)>
	//  100  178:athrow          
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
