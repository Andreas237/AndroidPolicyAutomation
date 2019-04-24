// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, TransferListener, DataSpec

public final class AssetDataSource
	implements DataSource
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
	//    3    3:invokespecial   #27  <Method void AssetDataSource(Context, TransferListener)>
	//    4    6:return          
	}

	public AssetDataSource(Context context, TransferListener transferlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		assetManager = context.getAssets();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #37  <Method AssetManager Context.getAssets()>
	//    5    9:putfield        #39  <Field AssetManager assetManager>
		listener = transferlistener;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #41  <Field TransferListener listener>
	//    9   17:return          
	}

	public void close()
		throws AssetDataSourceException
	{
		uri = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #48  <Field Uri uri>
		if(inputStream != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #50  <Field InputStream inputStream>
	//*   5    9:ifnull          19
			inputStream.close();
	//    6   12:aload_0         
	//    7   13:getfield        #50  <Field InputStream inputStream>
	//    8   16:invokevirtual   #54  <Method void InputStream.close()>
		inputStream = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #50  <Field InputStream inputStream>
		if(opened)
	//*  12   24:aload_0         
	//*  13   25:getfield        #56  <Field boolean opened>
	//*  14   28:ifeq            53
		{
			opened = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #56  <Field boolean opened>
			if(listener != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #41  <Field TransferListener listener>
	//*  20   40:ifnull          53
				listener.onTransferEnd(((Object) (this)));
	//   21   43:aload_0         
	//   22   44:getfield        #41  <Field TransferListener listener>
	//   23   47:aload_0         
	//   24   48:invokeinterface #62  <Method void TransferListener.onTransferEnd(Object)>
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
		throw new AssetDataSourceException(((IOException) (obj)));
	//   29   59:new             #8   <Class AssetDataSource$AssetDataSourceException>
	//   30   62:dup             
	//   31   63:aload_1         
	//   32   64:invokespecial   #65  <Method void AssetDataSource$AssetDataSourceException(IOException)>
	//   33   67:athrow          
		inputStream = null;
	//   34   68:aload_0         
	//   35   69:aconst_null     
	//   36   70:putfield        #50  <Field InputStream inputStream>
		if(opened)
	//*  37   73:aload_0         
	//*  38   74:getfield        #56  <Field boolean opened>
	//*  39   77:ifeq            102
		{
			opened = false;
	//   40   80:aload_0         
	//   41   81:iconst_0        
	//   42   82:putfield        #56  <Field boolean opened>
			if(listener != null)
	//*  43   85:aload_0         
	//*  44   86:getfield        #41  <Field TransferListener listener>
	//*  45   89:ifnull          102
				listener.onTransferEnd(((Object) (this)));
	//   46   92:aload_0         
	//   47   93:getfield        #41  <Field TransferListener listener>
	//   48   96:aload_0         
	//   49   97:invokeinterface #62  <Method void TransferListener.onTransferEnd(Object)>
		}
		throw obj;
	//   50  102:aload_1         
	//   51  103:athrow          
	}

	public Uri getUri()
	{
		return uri;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Uri uri>
	//    2    4:areturn         
	}

	public long open(DataSpec dataspec)
		throws AssetDataSourceException
	{
		String s;
		String s1;
		uri = dataspec.uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #73  <Field Uri DataSpec.uri>
	//    3    5:putfield        #48  <Field Uri uri>
		s1 = uri.getPath();
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field Uri uri>
	//    6   12:invokevirtual   #79  <Method String Uri.getPath()>
	//    7   15:astore_3        
		if(s1.startsWith("/android_asset/"))
	//*   8   16:aload_3         
	//*   9   17:ldc1            #81  <String "/android_asset/">
	//*  10   19:invokevirtual   #87  <Method boolean String.startsWith(String)>
	//*  11   22:ifeq            35
		{
			s = s1.substring(15);
	//   12   25:aload_3         
	//   13   26:bipush          15
	//   14   28:invokevirtual   #91  <Method String String.substring(int)>
	//   15   31:astore_2        
			break MISSING_BLOCK_LABEL_52;
	//   16   32:goto            52
		}
		s = s1;
	//   17   35:aload_3         
	//   18   36:astore_2        
		if(s1.startsWith("/"))
	//*  19   37:aload_3         
	//*  20   38:ldc1            #93  <String "/">
	//*  21   40:invokevirtual   #87  <Method boolean String.startsWith(String)>
	//*  22   43:ifeq            52
			s = s1.substring(1);
	//   23   46:aload_3         
	//   24   47:iconst_1        
	//   25   48:invokevirtual   #91  <Method String String.substring(int)>
	//   26   51:astore_2        
		inputStream = assetManager.open(s, 1);
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #39  <Field AssetManager assetManager>
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokevirtual   #98  <Method InputStream AssetManager.open(String, int)>
	//   33   62:putfield        #50  <Field InputStream inputStream>
		if(inputStream.skip(dataspec.position) < dataspec.position)
	//*  34   65:aload_0         
	//*  35   66:getfield        #50  <Field InputStream inputStream>
	//*  36   69:aload_1         
	//*  37   70:getfield        #101 <Field long DataSpec.position>
	//*  38   73:invokevirtual   #105 <Method long InputStream.skip(long)>
	//*  39   76:aload_1         
	//*  40   77:getfield        #101 <Field long DataSpec.position>
	//*  41   80:lcmp            
	//*  42   81:ifge            92
			throw new EOFException();
	//   43   84:new             #107 <Class EOFException>
	//   44   87:dup             
	//   45   88:invokespecial   #108 <Method void EOFException()>
	//   46   91:athrow          
		if(dataspec.length != -1L)
	//*  47   92:aload_1         
	//*  48   93:getfield        #111 <Field long DataSpec.length>
	//*  49   96:ldc2w           #112 <Long -1L>
	//*  50   99:lcmp            
	//*  51  100:ifeq            114
		{
			bytesRemaining = dataspec.length;
	//   52  103:aload_0         
	//   53  104:aload_1         
	//   54  105:getfield        #111 <Field long DataSpec.length>
	//   55  108:putfield        #115 <Field long bytesRemaining>
			break MISSING_BLOCK_LABEL_144;
	//   56  111:goto            144
		}
		try
		{
			bytesRemaining = inputStream.available();
	//   57  114:aload_0         
	//   58  115:aload_0         
	//   59  116:getfield        #50  <Field InputStream inputStream>
	//   60  119:invokevirtual   #119 <Method int InputStream.available()>
	//   61  122:i2l             
	//   62  123:putfield        #115 <Field long bytesRemaining>
			if(bytesRemaining == 0x7fffffffL)
	//*  63  126:aload_0         
	//*  64  127:getfield        #115 <Field long bytesRemaining>
	//*  65  130:ldc2w           #120 <Long 0x7fffffffL>
	//*  66  133:lcmp            
	//*  67  134:ifne            144
				bytesRemaining = -1L;
	//   68  137:aload_0         
	//   69  138:ldc2w           #112 <Long -1L>
	//   70  141:putfield        #115 <Field long bytesRemaining>
		}
	//*  71  144:aload_0         
	//*  72  145:iconst_1        
	//*  73  146:putfield        #56  <Field boolean opened>
	//*  74  149:aload_0         
	//*  75  150:getfield        #41  <Field TransferListener listener>
	//*  76  153:ifnull          167
	//*  77  156:aload_0         
	//*  78  157:getfield        #41  <Field TransferListener listener>
	//*  79  160:aload_0         
	//*  80  161:aload_1         
	//*  81  162:invokeinterface #125 <Method void TransferListener.onTransferStart(Object, DataSpec)>
	//*  82  167:aload_0         
	//*  83  168:getfield        #115 <Field long bytesRemaining>
	//*  84  171:lreturn         
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//*  85  172:astore_1        
		{
			throw new AssetDataSourceException(((IOException) (dataspec)));
	//   86  173:new             #8   <Class AssetDataSource$AssetDataSourceException>
	//   87  176:dup             
	//   88  177:aload_1         
	//   89  178:invokespecial   #65  <Method void AssetDataSource$AssetDataSourceException(IOException)>
	//   90  181:athrow          
		}
		opened = true;
		if(listener != null)
			listener.onTransferStart(((Object) (this)), dataspec);
		return bytesRemaining;
	}

	public int read(byte abyte0[], int i, int j)
		throws AssetDataSourceException
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(bytesRemaining == 0L)
	//*   4    6:aload_0         
	//*   5    7:getfield        #115 <Field long bytesRemaining>
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:ifne            17
			return -1;
	//    9   15:iconst_m1       
	//   10   16:ireturn         
		try
		{
			if(bytesRemaining == -1L)
	//*  11   17:aload_0         
	//*  12   18:getfield        #115 <Field long bytesRemaining>
	//*  13   21:ldc2w           #112 <Long -1L>
	//*  14   24:lcmp            
	//*  15   25:ifne            31
				break MISSING_BLOCK_LABEL_42;
	//   16   28:goto            42
		}
	//*  17   31:aload_0         
	//*  18   32:getfield        #115 <Field long bytesRemaining>
	//*  19   35:iload_3         
	//*  20   36:i2l             
	//*  21   37:invokestatic    #133 <Method long Math.min(long, long)>
	//*  22   40:l2i             
	//*  23   41:istore_3        
	//*  24   42:aload_0         
	//*  25   43:getfield        #50  <Field InputStream inputStream>
	//*  26   46:aload_1         
	//*  27   47:iload_2         
	//*  28   48:iload_3         
	//*  29   49:invokevirtual   #135 <Method int InputStream.read(byte[], int, int)>
	//*  30   52:istore_2        
	//*  31   53:iload_2         
	//*  32   54:iconst_m1       
	//*  33   55:icmpne          86
	//*  34   58:aload_0         
	//*  35   59:getfield        #115 <Field long bytesRemaining>
	//*  36   62:ldc2w           #112 <Long -1L>
	//*  37   65:lcmp            
	//*  38   66:ifeq            84
	//*  39   69:new             #8   <Class AssetDataSource$AssetDataSourceException>
	//*  40   72:dup             
	//*  41   73:new             #107 <Class EOFException>
	//*  42   76:dup             
	//*  43   77:invokespecial   #108 <Method void EOFException()>
	//*  44   80:invokespecial   #65  <Method void AssetDataSource$AssetDataSourceException(IOException)>
	//*  45   83:athrow          
	//*  46   84:iconst_m1       
	//*  47   85:ireturn         
	//*  48   86:aload_0         
	//*  49   87:getfield        #115 <Field long bytesRemaining>
	//*  50   90:ldc2w           #112 <Long -1L>
	//*  51   93:lcmp            
	//*  52   94:ifeq            108
	//*  53   97:aload_0         
	//*  54   98:aload_0         
	//*  55   99:getfield        #115 <Field long bytesRemaining>
	//*  56  102:iload_2         
	//*  57  103:i2l             
	//*  58  104:lsub            
	//*  59  105:putfield        #115 <Field long bytesRemaining>
	//*  60  108:aload_0         
	//*  61  109:getfield        #41  <Field TransferListener listener>
	//*  62  112:ifnull          126
	//*  63  115:aload_0         
	//*  64  116:getfield        #41  <Field TransferListener listener>
	//*  65  119:aload_0         
	//*  66  120:iload_2         
	//*  67  121:invokeinterface #139 <Method void TransferListener.onBytesTransferred(Object, int)>
	//*  68  126:iload_2         
	//*  69  127:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  70  128:astore_1        
		{
			throw new AssetDataSourceException(((IOException) (abyte0)));
	//   71  129:new             #8   <Class AssetDataSource$AssetDataSourceException>
	//   72  132:dup             
	//   73  133:aload_1         
	//   74  134:invokespecial   #65  <Method void AssetDataSource$AssetDataSourceException(IOException)>
	//   75  137:athrow          
		}
		j = (int)Math.min(bytesRemaining, j);
		i = inputStream.read(abyte0, i, j);
		if(i == -1)
			if(bytesRemaining != -1L)
				throw new AssetDataSourceException(((IOException) (new EOFException())));
			else
				return -1;
		if(bytesRemaining != -1L)
			bytesRemaining = bytesRemaining - (long)i;
		if(listener != null)
			listener.onBytesTransferred(((Object) (this)), i);
		return i;
	}

	private final AssetManager assetManager;
	private long bytesRemaining;
	private InputStream inputStream;
	private final TransferListener listener;
	private boolean opened;
	private Uri uri;
}
