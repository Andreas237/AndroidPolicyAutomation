// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			UriDataSource, TransferListener, DataSpec

public final class AssetDataSource
	implements UriDataSource
{
	public static final class AssetDataSourceException extends IOException
	{

		public AssetDataSourceException(IOException ioexception)
		{
			super(((Throwable) (ioexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void IOException(Throwable)>
		//    3    5:return          
		}
	}


	public AssetDataSource(Context context)
	{
		this(context, ((TransferListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #26  <Method void AssetDataSource(Context, TransferListener)>
	//    4    6:return          
	}

	public AssetDataSource(Context context, TransferListener transferlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		assetManager = context.getAssets();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method AssetManager Context.getAssets()>
	//    5    9:putfield        #38  <Field AssetManager assetManager>
		listener = transferlistener;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #40  <Field TransferListener listener>
	//    9   17:return          
	}

	public void close()
		throws AssetDataSourceException
	{
		InputStream inputstream;
		uriString = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #45  <Field String uriString>
		inputstream = inputStream;
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field InputStream inputStream>
	//    5    9:astore_1        
		if(inputstream == null)
			break MISSING_BLOCK_LABEL_99;
	//    6   10:aload_1         
	//    7   11:ifnull          99
		inputstream.close();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #51  <Method void InputStream.close()>
		inputStream = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #47  <Field InputStream inputStream>
		if(opened)
	//*  13   23:aload_0         
	//*  14   24:getfield        #53  <Field boolean opened>
	//*  15   27:ifeq            99
		{
			opened = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #53  <Field boolean opened>
			TransferListener transferlistener = listener;
	//   19   35:aload_0         
	//   20   36:getfield        #40  <Field TransferListener listener>
	//   21   39:astore_1        
			if(transferlistener != null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          99
			{
				transferlistener.onTransferEnd();
	//   24   44:aload_1         
	//   25   45:invokeinterface #58  <Method void TransferListener.onTransferEnd()>
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
		throw new AssetDataSourceException(((IOException) (obj)));
	//   30   56:new             #8   <Class AssetDataSource$AssetDataSourceException>
	//   31   59:dup             
	//   32   60:aload_1         
	//   33   61:invokespecial   #61  <Method void AssetDataSource$AssetDataSourceException(IOException)>
	//   34   64:athrow          
		inputStream = null;
	//   35   65:aload_0         
	//   36   66:aconst_null     
	//   37   67:putfield        #47  <Field InputStream inputStream>
		if(opened)
	//*  38   70:aload_0         
	//*  39   71:getfield        #53  <Field boolean opened>
	//*  40   74:ifeq            97
		{
			opened = false;
	//   41   77:aload_0         
	//   42   78:iconst_0        
	//   43   79:putfield        #53  <Field boolean opened>
			TransferListener transferlistener1 = listener;
	//   44   82:aload_0         
	//   45   83:getfield        #40  <Field TransferListener listener>
	//   46   86:astore_2        
			if(transferlistener1 != null)
	//*  47   87:aload_2         
	//*  48   88:ifnull          97
				transferlistener1.onTransferEnd();
	//   49   91:aload_2         
	//   50   92:invokeinterface #58  <Method void TransferListener.onTransferEnd()>
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
	//    1    1:getfield        #45  <Field String uriString>
	//    2    4:areturn         
	}

	public long open(DataSpec dataspec)
		throws AssetDataSourceException
	{
		String s;
		String s1;
		uriString = dataspec.uri.toString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #72  <Field Uri DataSpec.uri>
	//    3    5:invokevirtual   #77  <Method String Uri.toString()>
	//    4    8:putfield        #45  <Field String uriString>
		s1 = dataspec.uri.getPath();
	//    5   11:aload_1         
	//    6   12:getfield        #72  <Field Uri DataSpec.uri>
	//    7   15:invokevirtual   #80  <Method String Uri.getPath()>
	//    8   18:astore_3        
		if(s1.startsWith("/android_asset/"))
	//*   9   19:aload_3         
	//*  10   20:ldc1            #82  <String "/android_asset/">
	//*  11   22:invokevirtual   #88  <Method boolean String.startsWith(String)>
	//*  12   25:ifeq            38
		{
			s = s1.substring(15);
	//   13   28:aload_3         
	//   14   29:bipush          15
	//   15   31:invokevirtual   #92  <Method String String.substring(int)>
	//   16   34:astore_2        
			break MISSING_BLOCK_LABEL_55;
	//   17   35:goto            55
		}
		s = s1;
	//   18   38:aload_3         
	//   19   39:astore_2        
		if(s1.startsWith("/"))
	//*  20   40:aload_3         
	//*  21   41:ldc1            #94  <String "/">
	//*  22   43:invokevirtual   #88  <Method boolean String.startsWith(String)>
	//*  23   46:ifeq            55
			s = s1.substring(1);
	//   24   49:aload_3         
	//   25   50:iconst_1        
	//   26   51:invokevirtual   #92  <Method String String.substring(int)>
	//   27   54:astore_2        
		uriString = dataspec.uri.toString();
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:getfield        #72  <Field Uri DataSpec.uri>
	//   31   60:invokevirtual   #77  <Method String Uri.toString()>
	//   32   63:putfield        #45  <Field String uriString>
		inputStream = assetManager.open(s, 1);
	//   33   66:aload_0         
	//   34   67:aload_0         
	//   35   68:getfield        #38  <Field AssetManager assetManager>
	//   36   71:aload_2         
	//   37   72:iconst_1        
	//   38   73:invokevirtual   #99  <Method InputStream AssetManager.open(String, int)>
	//   39   76:putfield        #47  <Field InputStream inputStream>
		if(inputStream.skip(dataspec.position) < dataspec.position)
			break MISSING_BLOCK_LABEL_175;
	//   40   79:aload_0         
	//   41   80:getfield        #47  <Field InputStream inputStream>
	//   42   83:aload_1         
	//   43   84:getfield        #102 <Field long DataSpec.position>
	//   44   87:invokevirtual   #106 <Method long InputStream.skip(long)>
	//   45   90:aload_1         
	//   46   91:getfield        #102 <Field long DataSpec.position>
	//   47   94:lcmp            
	//   48   95:iflt            175
		if(dataspec.length != -1L)
	//*  49   98:aload_1         
	//*  50   99:getfield        #109 <Field long DataSpec.length>
	//*  51  102:ldc2w           #110 <Long -1L>
	//*  52  105:lcmp            
	//*  53  106:ifeq            120
		{
			bytesRemaining = dataspec.length;
	//   54  109:aload_0         
	//   55  110:aload_1         
	//   56  111:getfield        #109 <Field long DataSpec.length>
	//   57  114:putfield        #113 <Field long bytesRemaining>
			break MISSING_BLOCK_LABEL_150;
	//   58  117:goto            150
		}
		try
		{
			bytesRemaining = inputStream.available();
	//   59  120:aload_0         
	//   60  121:aload_0         
	//   61  122:getfield        #47  <Field InputStream inputStream>
	//   62  125:invokevirtual   #117 <Method int InputStream.available()>
	//   63  128:i2l             
	//   64  129:putfield        #113 <Field long bytesRemaining>
			if(bytesRemaining == 0x7fffffffL)
	//*  65  132:aload_0         
	//*  66  133:getfield        #113 <Field long bytesRemaining>
	//*  67  136:ldc2w           #118 <Long 0x7fffffffL>
	//*  68  139:lcmp            
	//*  69  140:ifne            150
				bytesRemaining = -1L;
	//   70  143:aload_0         
	//   71  144:ldc2w           #110 <Long -1L>
	//   72  147:putfield        #113 <Field long bytesRemaining>
		}
	//*  73  150:aload_0         
	//*  74  151:iconst_1        
	//*  75  152:putfield        #53  <Field boolean opened>
	//*  76  155:aload_0         
	//*  77  156:getfield        #40  <Field TransferListener listener>
	//*  78  159:astore_1        
	//*  79  160:aload_1         
	//*  80  161:ifnull          170
	//*  81  164:aload_1         
	//*  82  165:invokeinterface #122 <Method void TransferListener.onTransferStart()>
	//*  83  170:aload_0         
	//*  84  171:getfield        #113 <Field long bytesRemaining>
	//*  85  174:lreturn         
	//*  86  175:new             #124 <Class EOFException>
	//*  87  178:dup             
	//*  88  179:invokespecial   #125 <Method void EOFException()>
	//*  89  182:athrow          
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//*  90  183:astore_1        
		{
			throw new AssetDataSourceException(((IOException) (dataspec)));
	//   91  184:new             #8   <Class AssetDataSource$AssetDataSourceException>
	//   92  187:dup             
	//   93  188:aload_1         
	//   94  189:invokespecial   #61  <Method void AssetDataSource$AssetDataSourceException(IOException)>
	//   95  192:athrow          
		}
		opened = true;
		dataspec = ((DataSpec) (listener));
		if(dataspec != null)
			((TransferListener) (dataspec)).onTransferStart();
		return bytesRemaining;
		throw new EOFException();
	}

	public int read(byte abyte0[], int i, int j)
		throws AssetDataSourceException
	{
		long l;
		long l2;
		l = bytesRemaining;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field long bytesRemaining>
	//    2    4:lstore          4
		if(l == 0L)
	//*   3    6:lload           4
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifne            15
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		if(l == -1L)
	//*   9   15:lload           4
	//*  10   17:ldc2w           #110 <Long -1L>
	//*  11   20:lcmp            
	//*  12   21:ifne            27
			break MISSING_BLOCK_LABEL_40;
	//   13   24:goto            40
		l2 = j;
	//   14   27:iload_3         
	//   15   28:i2l             
	//   16   29:lstore          6
		j = (int)Math.min(l, l2);
	//   17   31:lload           4
	//   18   33:lload           6
	//   19   35:invokestatic    #133 <Method long Math.min(long, long)>
	//   20   38:l2i             
	//   21   39:istore_3        
		i = inputStream.read(abyte0, i, j);
	//   22   40:aload_0         
	//   23   41:getfield        #47  <Field InputStream inputStream>
	//   24   44:aload_1         
	//   25   45:iload_2         
	//   26   46:iload_3         
	//   27   47:invokevirtual   #135 <Method int InputStream.read(byte[], int, int)>
	//   28   50:istore_2        
		if(i > 0)
	//*  29   51:iload_2         
	//*  30   52:ifle            95
		{
			long l1 = bytesRemaining;
	//   31   55:aload_0         
	//   32   56:getfield        #113 <Field long bytesRemaining>
	//   33   59:lstore          4
			if(l1 != -1L)
	//*  34   61:lload           4
	//*  35   63:ldc2w           #110 <Long -1L>
	//*  36   66:lcmp            
	//*  37   67:ifeq            79
				bytesRemaining = l1 - (long)i;
	//   38   70:aload_0         
	//   39   71:lload           4
	//   40   73:iload_2         
	//   41   74:i2l             
	//   42   75:lsub            
	//   43   76:putfield        #113 <Field long bytesRemaining>
			abyte0 = ((byte []) (listener));
	//   44   79:aload_0         
	//   45   80:getfield        #40  <Field TransferListener listener>
	//   46   83:astore_1        
			if(abyte0 != null)
	//*  47   84:aload_1         
	//*  48   85:ifnull          95
				((TransferListener) (abyte0)).onBytesTransferred(i);
	//   49   88:aload_1         
	//   50   89:iload_2         
	//   51   90:invokeinterface #139 <Method void TransferListener.onBytesTransferred(int)>
		}
		return i;
	//   52   95:iload_2         
	//   53   96:ireturn         
		abyte0;
	//   54   97:astore_1        
		throw new AssetDataSourceException(((IOException) (abyte0)));
	//   55   98:new             #8   <Class AssetDataSource$AssetDataSourceException>
	//   56  101:dup             
	//   57  102:aload_1         
	//   58  103:invokespecial   #61  <Method void AssetDataSource$AssetDataSourceException(IOException)>
	//   59  106:athrow          
	}

	private final AssetManager assetManager;
	private long bytesRemaining;
	private InputStream inputStream;
	private final TransferListener listener;
	private boolean opened;
	private String uriString;
}
