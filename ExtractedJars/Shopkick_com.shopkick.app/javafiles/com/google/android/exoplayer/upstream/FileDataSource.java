// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.net.Uri;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			UriDataSource, TransferListener, DataSpec

public final class FileDataSource
	implements UriDataSource
{
	public static class FileDataSourceException extends IOException
	{

		public FileDataSourceException(IOException ioexception)
		{
			super(((Throwable) (ioexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void IOException(Throwable)>
		//    3    5:return          
		}
	}


	public FileDataSource()
	{
		this(((TransferListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #24  <Method void FileDataSource(TransferListener)>
	//    3    5:return          
	}

	public FileDataSource(TransferListener transferlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		listener = transferlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field TransferListener listener>
	//    5    9:return          
	}

	public void close()
		throws FileDataSourceException
	{
		RandomAccessFile randomaccessfile;
		uriString = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #34  <Field String uriString>
		randomaccessfile = file;
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field RandomAccessFile file>
	//    5    9:astore_1        
		if(randomaccessfile == null)
			break MISSING_BLOCK_LABEL_99;
	//    6   10:aload_1         
	//    7   11:ifnull          99
		randomaccessfile.close();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #40  <Method void RandomAccessFile.close()>
		file = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #36  <Field RandomAccessFile file>
		if(opened)
	//*  13   23:aload_0         
	//*  14   24:getfield        #42  <Field boolean opened>
	//*  15   27:ifeq            99
		{
			opened = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #42  <Field boolean opened>
			TransferListener transferlistener = listener;
	//   19   35:aload_0         
	//   20   36:getfield        #29  <Field TransferListener listener>
	//   21   39:astore_1        
			if(transferlistener != null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          99
			{
				transferlistener.onTransferEnd();
	//   24   44:aload_1         
	//   25   45:invokeinterface #47  <Method void TransferListener.onTransferEnd()>
				return;
	//   26   50:return          
			}
		}
		break MISSING_BLOCK_LABEL_99;
		Object obj;
		obj;
	//   27   51:astore_1        
		break MISSING_BLOCK_LABEL_65;
	//   28   52:goto            65
		obj;
	//   29   55:astore_1        
		throw new FileDataSourceException(((IOException) (obj)));
	//   30   56:new             #8   <Class FileDataSource$FileDataSourceException>
	//   31   59:dup             
	//   32   60:aload_1         
	//   33   61:invokespecial   #50  <Method void FileDataSource$FileDataSourceException(IOException)>
	//   34   64:athrow          
		file = null;
	//   35   65:aload_0         
	//   36   66:aconst_null     
	//   37   67:putfield        #36  <Field RandomAccessFile file>
		if(opened)
	//*  38   70:aload_0         
	//*  39   71:getfield        #42  <Field boolean opened>
	//*  40   74:ifeq            97
		{
			opened = false;
	//   41   77:aload_0         
	//   42   78:iconst_0        
	//   43   79:putfield        #42  <Field boolean opened>
			TransferListener transferlistener1 = listener;
	//   44   82:aload_0         
	//   45   83:getfield        #29  <Field TransferListener listener>
	//   46   86:astore_2        
			if(transferlistener1 != null)
	//*  47   87:aload_2         
	//*  48   88:ifnull          97
				transferlistener1.onTransferEnd();
	//   49   91:aload_2         
	//   50   92:invokeinterface #47  <Method void TransferListener.onTransferEnd()>
		}
		throw obj;
	//   51   97:aload_1         
	//   52   98:athrow          
	//   53   99:return          
	}

	public String getUri()
	{
		return uriString;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String uriString>
	//    2    4:areturn         
	}

	public long open(DataSpec dataspec)
		throws FileDataSourceException
	{
		long l;
		uriString = dataspec.uri.toString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #61  <Field Uri DataSpec.uri>
	//    3    5:invokevirtual   #66  <Method String Uri.toString()>
	//    4    8:putfield        #34  <Field String uriString>
		file = new RandomAccessFile(dataspec.uri.getPath(), "r");
	//    5   11:aload_0         
	//    6   12:new             #38  <Class RandomAccessFile>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:getfield        #61  <Field Uri DataSpec.uri>
	//   10   20:invokevirtual   #69  <Method String Uri.getPath()>
	//   11   23:ldc1            #71  <String "r">
	//   12   25:invokespecial   #74  <Method void RandomAccessFile(String, String)>
	//   13   28:putfield        #36  <Field RandomAccessFile file>
		file.seek(dataspec.position);
	//   14   31:aload_0         
	//   15   32:getfield        #36  <Field RandomAccessFile file>
	//   16   35:aload_1         
	//   17   36:getfield        #77  <Field long DataSpec.position>
	//   18   39:invokevirtual   #81  <Method void RandomAccessFile.seek(long)>
		if(dataspec.length == -1L)
	//*  19   42:aload_1         
	//*  20   43:getfield        #84  <Field long DataSpec.length>
	//*  21   46:ldc2w           #85  <Long -1L>
	//*  22   49:lcmp            
	//*  23   50:ifne            69
		{
			l = file.length() - dataspec.position;
	//   24   53:aload_0         
	//   25   54:getfield        #36  <Field RandomAccessFile file>
	//   26   57:invokevirtual   #89  <Method long RandomAccessFile.length()>
	//   27   60:aload_1         
	//   28   61:getfield        #77  <Field long DataSpec.position>
	//   29   64:lsub            
	//   30   65:lstore_2        
			break MISSING_BLOCK_LABEL_74;
	//   31   66:goto            74
		}
		l = dataspec.length;
	//   32   69:aload_1         
	//   33   70:getfield        #84  <Field long DataSpec.length>
	//   34   73:lstore_2        
		bytesRemaining = l;
	//   35   74:aload_0         
	//   36   75:lload_2         
	//   37   76:putfield        #91  <Field long bytesRemaining>
		l = bytesRemaining;
	//   38   79:aload_0         
	//   39   80:getfield        #91  <Field long bytesRemaining>
	//   40   83:lstore_2        
		if(l >= 0L)
	//*  41   84:lload_2         
	//*  42   85:lconst_0        
	//*  43   86:lcmp            
	//*  44   87:iflt            115
		{
			opened = true;
	//   45   90:aload_0         
	//   46   91:iconst_1        
	//   47   92:putfield        #42  <Field boolean opened>
			dataspec = ((DataSpec) (listener));
	//   48   95:aload_0         
	//   49   96:getfield        #29  <Field TransferListener listener>
	//   50   99:astore_1        
			if(dataspec != null)
	//*  51  100:aload_1         
	//*  52  101:ifnull          110
				((TransferListener) (dataspec)).onTransferStart();
	//   53  104:aload_1         
	//   54  105:invokeinterface #94  <Method void TransferListener.onTransferStart()>
			return bytesRemaining;
	//   55  110:aload_0         
	//   56  111:getfield        #91  <Field long bytesRemaining>
	//   57  114:lreturn         
		}
		try
		{
			throw new EOFException();
	//   58  115:new             #96  <Class EOFException>
	//   59  118:dup             
	//   60  119:invokespecial   #97  <Method void EOFException()>
	//   61  122:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//*  62  123:astore_1        
		{
			throw new FileDataSourceException(((IOException) (dataspec)));
	//   63  124:new             #8   <Class FileDataSource$FileDataSourceException>
	//   64  127:dup             
	//   65  128:aload_1         
	//   66  129:invokespecial   #50  <Method void FileDataSource$FileDataSourceException(IOException)>
	//   67  132:athrow          
		}
	}

	public int read(byte abyte0[], int i, int j)
		throws FileDataSourceException
	{
		long l = bytesRemaining;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field long bytesRemaining>
	//    2    4:lstore          4
		if(l == 0L)
	//*   3    6:lload           4
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifne            15
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		try
		{
			i = file.read(abyte0, i, (int)Math.min(l, j));
	//    9   15:aload_0         
	//   10   16:getfield        #36  <Field RandomAccessFile file>
	//   11   19:aload_1         
	//   12   20:iload_2         
	//   13   21:lload           4
	//   14   23:iload_3         
	//   15   24:i2l             
	//   16   25:invokestatic    #105 <Method long Math.min(long, long)>
	//   17   28:l2i             
	//   18   29:invokevirtual   #107 <Method int RandomAccessFile.read(byte[], int, int)>
	//   19   32:istore_2        
		}
	//*  20   33:iload_2         
	//*  21   34:ifle            64
	//*  22   37:aload_0         
	//*  23   38:aload_0         
	//*  24   39:getfield        #91  <Field long bytesRemaining>
	//*  25   42:iload_2         
	//*  26   43:i2l             
	//*  27   44:lsub            
	//*  28   45:putfield        #91  <Field long bytesRemaining>
	//*  29   48:aload_0         
	//*  30   49:getfield        #29  <Field TransferListener listener>
	//*  31   52:astore_1        
	//*  32   53:aload_1         
	//*  33   54:ifnull          64
	//*  34   57:aload_1         
	//*  35   58:iload_2         
	//*  36   59:invokeinterface #111 <Method void TransferListener.onBytesTransferred(int)>
	//*  37   64:iload_2         
	//*  38   65:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  39   66:astore_1        
		{
			throw new FileDataSourceException(((IOException) (abyte0)));
	//   40   67:new             #8   <Class FileDataSource$FileDataSourceException>
	//   41   70:dup             
	//   42   71:aload_1         
	//   43   72:invokespecial   #50  <Method void FileDataSource$FileDataSourceException(IOException)>
	//   44   75:athrow          
		}
		if(i > 0)
		{
			bytesRemaining = bytesRemaining - (long)i;
			abyte0 = ((byte []) (listener));
			if(abyte0 != null)
				((TransferListener) (abyte0)).onBytesTransferred(i);
		}
		return i;
	}

	private long bytesRemaining;
	private RandomAccessFile file;
	private final TransferListener listener;
	private boolean opened;
	private String uriString;
}
