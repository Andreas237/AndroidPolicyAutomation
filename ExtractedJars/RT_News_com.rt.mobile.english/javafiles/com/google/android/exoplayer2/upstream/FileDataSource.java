// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, TransferListener, DataSpec

public final class FileDataSource
	implements DataSource
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
	//    2    2:invokespecial   #25  <Method void FileDataSource(TransferListener)>
	//    3    5:return          
	}

	public FileDataSource(TransferListener transferlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		listener = transferlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field TransferListener listener>
	//    5    9:return          
	}

	public void close()
		throws FileDataSourceException
	{
		uri = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #37  <Field Uri uri>
		if(file != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #39  <Field RandomAccessFile file>
	//*   5    9:ifnull          19
			file.close();
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field RandomAccessFile file>
	//    8   16:invokevirtual   #43  <Method void RandomAccessFile.close()>
		file = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #39  <Field RandomAccessFile file>
		if(opened)
	//*  12   24:aload_0         
	//*  13   25:getfield        #45  <Field boolean opened>
	//*  14   28:ifeq            53
		{
			opened = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #45  <Field boolean opened>
			if(listener != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #30  <Field TransferListener listener>
	//*  20   40:ifnull          53
				listener.onTransferEnd(((Object) (this)));
	//   21   43:aload_0         
	//   22   44:getfield        #30  <Field TransferListener listener>
	//   23   47:aload_0         
	//   24   48:invokeinterface #51  <Method void TransferListener.onTransferEnd(Object)>
		}
		return;
	//   25   53:return          
		Object obj;
		obj;
	//   26   54:astore_1        
		break MISSING_BLOCK_LABEL_68;
	//   27   55:goto            68
		obj;
	//   28   58:astore_1        
		throw new FileDataSourceException(((IOException) (obj)));
	//   29   59:new             #8   <Class FileDataSource$FileDataSourceException>
	//   30   62:dup             
	//   31   63:aload_1         
	//   32   64:invokespecial   #54  <Method void FileDataSource$FileDataSourceException(IOException)>
	//   33   67:athrow          
		file = null;
	//   34   68:aload_0         
	//   35   69:aconst_null     
	//   36   70:putfield        #39  <Field RandomAccessFile file>
		if(opened)
	//*  37   73:aload_0         
	//*  38   74:getfield        #45  <Field boolean opened>
	//*  39   77:ifeq            102
		{
			opened = false;
	//   40   80:aload_0         
	//   41   81:iconst_0        
	//   42   82:putfield        #45  <Field boolean opened>
			if(listener != null)
	//*  43   85:aload_0         
	//*  44   86:getfield        #30  <Field TransferListener listener>
	//*  45   89:ifnull          102
				listener.onTransferEnd(((Object) (this)));
	//   46   92:aload_0         
	//   47   93:getfield        #30  <Field TransferListener listener>
	//   48   96:aload_0         
	//   49   97:invokeinterface #51  <Method void TransferListener.onTransferEnd(Object)>
		}
		throw obj;
	//   50  102:aload_1         
	//   51  103:athrow          
	}

	public Uri getUri()
	{
		return uri;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Uri uri>
	//    2    4:areturn         
	}

	public long open(DataSpec dataspec)
		throws FileDataSourceException
	{
		long l;
		try
		{
			uri = dataspec.uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #62  <Field Uri DataSpec.uri>
	//    3    5:putfield        #37  <Field Uri uri>
			file = new RandomAccessFile(dataspec.uri.getPath(), "r");
	//    4    8:aload_0         
	//    5    9:new             #41  <Class RandomAccessFile>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:getfield        #62  <Field Uri DataSpec.uri>
	//    9   17:invokevirtual   #68  <Method String Uri.getPath()>
	//   10   20:ldc1            #70  <String "r">
	//   11   22:invokespecial   #73  <Method void RandomAccessFile(String, String)>
	//   12   25:putfield        #39  <Field RandomAccessFile file>
			file.seek(dataspec.position);
	//   13   28:aload_0         
	//   14   29:getfield        #39  <Field RandomAccessFile file>
	//   15   32:aload_1         
	//   16   33:getfield        #76  <Field long DataSpec.position>
	//   17   36:invokevirtual   #80  <Method void RandomAccessFile.seek(long)>
			if(dataspec.length == -1L)
	//*  18   39:aload_1         
	//*  19   40:getfield        #83  <Field long DataSpec.length>
	//*  20   43:ldc2w           #84  <Long -1L>
	//*  21   46:lcmp            
	//*  22   47:ifne            66
			{
				l = file.length() - dataspec.position;
	//   23   50:aload_0         
	//   24   51:getfield        #39  <Field RandomAccessFile file>
	//   25   54:invokevirtual   #88  <Method long RandomAccessFile.length()>
	//   26   57:aload_1         
	//   27   58:getfield        #76  <Field long DataSpec.position>
	//   28   61:lsub            
	//   29   62:lstore_2        
				break MISSING_BLOCK_LABEL_71;
	//   30   63:goto            71
			}
		}
	//*  31   66:aload_1         
	//*  32   67:getfield        #83  <Field long DataSpec.length>
	//*  33   70:lstore_2        
	//*  34   71:aload_0         
	//*  35   72:lload_2         
	//*  36   73:putfield        #90  <Field long bytesRemaining>
	//*  37   76:aload_0         
	//*  38   77:getfield        #90  <Field long bytesRemaining>
	//*  39   80:lconst_0        
	//*  40   81:lcmp            
	//*  41   82:ifge            93
	//*  42   85:new             #92  <Class EOFException>
	//*  43   88:dup             
	//*  44   89:invokespecial   #93  <Method void EOFException()>
	//*  45   92:athrow          
	//*  46   93:aload_0         
	//*  47   94:iconst_1        
	//*  48   95:putfield        #45  <Field boolean opened>
	//*  49   98:aload_0         
	//*  50   99:getfield        #30  <Field TransferListener listener>
	//*  51  102:ifnull          116
	//*  52  105:aload_0         
	//*  53  106:getfield        #30  <Field TransferListener listener>
	//*  54  109:aload_0         
	//*  55  110:aload_1         
	//*  56  111:invokeinterface #97  <Method void TransferListener.onTransferStart(Object, DataSpec)>
	//*  57  116:aload_0         
	//*  58  117:getfield        #90  <Field long bytesRemaining>
	//*  59  120:lreturn         
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//*  60  121:astore_1        
		{
			throw new FileDataSourceException(((IOException) (dataspec)));
	//   61  122:new             #8   <Class FileDataSource$FileDataSourceException>
	//   62  125:dup             
	//   63  126:aload_1         
	//   64  127:invokespecial   #54  <Method void FileDataSource$FileDataSourceException(IOException)>
	//   65  130:athrow          
		}
		l = dataspec.length;
		bytesRemaining = l;
		if(bytesRemaining < 0L)
			throw new EOFException();
		opened = true;
		if(listener != null)
			listener.onTransferStart(((Object) (this)), dataspec);
		return bytesRemaining;
	}

	public int read(byte abyte0[], int i, int j)
		throws FileDataSourceException
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(bytesRemaining == 0L)
	//*   4    6:aload_0         
	//*   5    7:getfield        #90  <Field long bytesRemaining>
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:ifne            17
			return -1;
	//    9   15:iconst_m1       
	//   10   16:ireturn         
		try
		{
			i = file.read(abyte0, i, (int)Math.min(bytesRemaining, j));
	//   11   17:aload_0         
	//   12   18:getfield        #39  <Field RandomAccessFile file>
	//   13   21:aload_1         
	//   14   22:iload_2         
	//   15   23:aload_0         
	//   16   24:getfield        #90  <Field long bytesRemaining>
	//   17   27:iload_3         
	//   18   28:i2l             
	//   19   29:invokestatic    #105 <Method long Math.min(long, long)>
	//   20   32:l2i             
	//   21   33:invokevirtual   #107 <Method int RandomAccessFile.read(byte[], int, int)>
	//   22   36:istore_2        
		}
	//*  23   37:iload_2         
	//*  24   38:ifle            70
	//*  25   41:aload_0         
	//*  26   42:aload_0         
	//*  27   43:getfield        #90  <Field long bytesRemaining>
	//*  28   46:iload_2         
	//*  29   47:i2l             
	//*  30   48:lsub            
	//*  31   49:putfield        #90  <Field long bytesRemaining>
	//*  32   52:aload_0         
	//*  33   53:getfield        #30  <Field TransferListener listener>
	//*  34   56:ifnull          70
	//*  35   59:aload_0         
	//*  36   60:getfield        #30  <Field TransferListener listener>
	//*  37   63:aload_0         
	//*  38   64:iload_2         
	//*  39   65:invokeinterface #111 <Method void TransferListener.onBytesTransferred(Object, int)>
	//*  40   70:iload_2         
	//*  41   71:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  42   72:astore_1        
		{
			throw new FileDataSourceException(((IOException) (abyte0)));
	//   43   73:new             #8   <Class FileDataSource$FileDataSourceException>
	//   44   76:dup             
	//   45   77:aload_1         
	//   46   78:invokespecial   #54  <Method void FileDataSource$FileDataSourceException(IOException)>
	//   47   81:athrow          
		}
		if(i > 0)
		{
			bytesRemaining = bytesRemaining - (long)i;
			if(listener != null)
				listener.onBytesTransferred(((Object) (this)), i);
		}
		return i;
	}

	private long bytesRemaining;
	private RandomAccessFile file;
	private final TransferListener listener;
	private boolean opened;
	private Uri uri;
}
