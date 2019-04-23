// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			UriDataSource, TransferListener, DataSpec

public final class ContentDataSource
	implements UriDataSource
{
	public static class ContentDataSourceException extends IOException
	{

		public ContentDataSourceException(IOException ioexception)
		{
			super(((Throwable) (ioexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void IOException(Throwable)>
		//    3    5:return          
		}
	}


	public ContentDataSource(Context context)
	{
		this(context, ((TransferListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #28  <Method void ContentDataSource(Context, TransferListener)>
	//    4    6:return          
	}

	public ContentDataSource(Context context, TransferListener transferlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		resolver = context.getContentResolver();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #38  <Method ContentResolver Context.getContentResolver()>
	//    5    9:putfield        #40  <Field ContentResolver resolver>
		listener = transferlistener;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #42  <Field TransferListener listener>
	//    9   17:return          
	}

	public void close()
		throws ContentDataSourceException
	{
		uriString = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #47  <Field String uriString>
		if(inputStream != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #49  <Field InputStream inputStream>
	//*   5    9:ifnull          19
			inputStream.close();
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field InputStream inputStream>
	//    8   16:invokevirtual   #53  <Method void InputStream.close()>
		inputStream = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #49  <Field InputStream inputStream>
		if(assetFileDescriptor != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #55  <Field AssetFileDescriptor assetFileDescriptor>
	//*  14   28:ifnull          38
			assetFileDescriptor.close();
	//   15   31:aload_0         
	//   16   32:getfield        #55  <Field AssetFileDescriptor assetFileDescriptor>
	//   17   35:invokevirtual   #58  <Method void AssetFileDescriptor.close()>
		assetFileDescriptor = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #55  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//*  21   43:aload_0         
	//*  22   44:getfield        #60  <Field boolean opened>
	//*  23   47:ifeq            70
		{
			opened = false;
	//   24   50:aload_0         
	//   25   51:iconst_0        
	//   26   52:putfield        #60  <Field boolean opened>
			TransferListener transferlistener = listener;
	//   27   55:aload_0         
	//   28   56:getfield        #42  <Field TransferListener listener>
	//   29   59:astore_1        
			if(transferlistener != null)
	//*  30   60:aload_1         
	//*  31   61:ifnull          70
				transferlistener.onTransferEnd();
	//   32   64:aload_1         
	//   33   65:invokeinterface #65  <Method void TransferListener.onTransferEnd()>
		}
		return;
	//   34   70:return          
		Object obj;
		obj;
	//   35   71:astore_1        
		break MISSING_BLOCK_LABEL_85;
	//   36   72:goto            85
		obj;
	//   37   75:astore_1        
		throw new ContentDataSourceException(((IOException) (obj)));
	//   38   76:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//   39   79:dup             
	//   40   80:aload_1         
	//   41   81:invokespecial   #68  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//   42   84:athrow          
		assetFileDescriptor = null;
	//   43   85:aload_0         
	//   44   86:aconst_null     
	//   45   87:putfield        #55  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//*  46   90:aload_0         
	//*  47   91:getfield        #60  <Field boolean opened>
	//*  48   94:ifeq            117
		{
			opened = false;
	//   49   97:aload_0         
	//   50   98:iconst_0        
	//   51   99:putfield        #60  <Field boolean opened>
			TransferListener transferlistener1 = listener;
	//   52  102:aload_0         
	//   53  103:getfield        #42  <Field TransferListener listener>
	//   54  106:astore_2        
			if(transferlistener1 != null)
	//*  55  107:aload_2         
	//*  56  108:ifnull          117
				transferlistener1.onTransferEnd();
	//   57  111:aload_2         
	//   58  112:invokeinterface #65  <Method void TransferListener.onTransferEnd()>
		}
		throw obj;
	//   59  117:aload_1         
	//   60  118:athrow          
		obj;
	//   61  119:astore_1        
		break MISSING_BLOCK_LABEL_133;
	//   62  120:goto            133
		obj;
	//   63  123:astore_1        
		throw new ContentDataSourceException(((IOException) (obj)));
	//   64  124:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//   65  127:dup             
	//   66  128:aload_1         
	//   67  129:invokespecial   #68  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//   68  132:athrow          
		inputStream = null;
	//   69  133:aload_0         
	//   70  134:aconst_null     
	//   71  135:putfield        #49  <Field InputStream inputStream>
		if(assetFileDescriptor != null)
	//*  72  138:aload_0         
	//*  73  139:getfield        #55  <Field AssetFileDescriptor assetFileDescriptor>
	//*  74  142:ifnull          152
			assetFileDescriptor.close();
	//   75  145:aload_0         
	//   76  146:getfield        #55  <Field AssetFileDescriptor assetFileDescriptor>
	//   77  149:invokevirtual   #58  <Method void AssetFileDescriptor.close()>
		assetFileDescriptor = null;
	//   78  152:aload_0         
	//   79  153:aconst_null     
	//   80  154:putfield        #55  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//*  81  157:aload_0         
	//*  82  158:getfield        #60  <Field boolean opened>
	//*  83  161:ifeq            184
		{
			opened = false;
	//   84  164:aload_0         
	//   85  165:iconst_0        
	//   86  166:putfield        #60  <Field boolean opened>
			TransferListener transferlistener2 = listener;
	//   87  169:aload_0         
	//   88  170:getfield        #42  <Field TransferListener listener>
	//   89  173:astore_2        
			if(transferlistener2 != null)
	//*  90  174:aload_2         
	//*  91  175:ifnull          184
				transferlistener2.onTransferEnd();
	//   92  178:aload_2         
	//   93  179:invokeinterface #65  <Method void TransferListener.onTransferEnd()>
		}
		throw obj;
	//   94  184:aload_1         
	//   95  185:athrow          
		obj;
	//   96  186:astore_1        
		break MISSING_BLOCK_LABEL_200;
	//   97  187:goto            200
		obj;
	//   98  190:astore_1        
		throw new ContentDataSourceException(((IOException) (obj)));
	//   99  191:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//  100  194:dup             
	//  101  195:aload_1         
	//  102  196:invokespecial   #68  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//  103  199:athrow          
		assetFileDescriptor = null;
	//  104  200:aload_0         
	//  105  201:aconst_null     
	//  106  202:putfield        #55  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//* 107  205:aload_0         
	//* 108  206:getfield        #60  <Field boolean opened>
	//* 109  209:ifeq            232
		{
			opened = false;
	//  110  212:aload_0         
	//  111  213:iconst_0        
	//  112  214:putfield        #60  <Field boolean opened>
			TransferListener transferlistener3 = listener;
	//  113  217:aload_0         
	//  114  218:getfield        #42  <Field TransferListener listener>
	//  115  221:astore_2        
			if(transferlistener3 != null)
	//* 116  222:aload_2         
	//* 117  223:ifnull          232
				transferlistener3.onTransferEnd();
	//  118  226:aload_2         
	//  119  227:invokeinterface #65  <Method void TransferListener.onTransferEnd()>
		}
		throw obj;
	//  120  232:aload_1         
	//  121  233:athrow          
	}

	public String getUri()
	{
		return uriString;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String uriString>
	//    2    4:areturn         
	}

	public long open(DataSpec dataspec)
		throws ContentDataSourceException
	{
label0:
		{
label1:
			{
				uriString = dataspec.uri.toString();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #79  <Field Uri DataSpec.uri>
	//    3    5:invokevirtual   #84  <Method String Uri.toString()>
	//    4    8:putfield        #47  <Field String uriString>
				assetFileDescriptor = resolver.openAssetFileDescriptor(dataspec.uri, "r");
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field ContentResolver resolver>
	//    8   16:aload_1         
	//    9   17:getfield        #79  <Field Uri DataSpec.uri>
	//   10   20:ldc1            #86  <String "r">
	//   11   22:invokevirtual   #92  <Method AssetFileDescriptor ContentResolver.openAssetFileDescriptor(Uri, String)>
	//   12   25:putfield        #55  <Field AssetFileDescriptor assetFileDescriptor>
				inputStream = ((InputStream) (new FileInputStream(assetFileDescriptor.getFileDescriptor())));
	//   13   28:aload_0         
	//   14   29:new             #94  <Class FileInputStream>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:getfield        #55  <Field AssetFileDescriptor assetFileDescriptor>
	//   18   37:invokevirtual   #98  <Method java.io.FileDescriptor AssetFileDescriptor.getFileDescriptor()>
	//   19   40:invokespecial   #101 <Method void FileInputStream(java.io.FileDescriptor)>
	//   20   43:putfield        #49  <Field InputStream inputStream>
				if(inputStream.skip(dataspec.position) < dataspec.position)
					break label0;
	//   21   46:aload_0         
	//   22   47:getfield        #49  <Field InputStream inputStream>
	//   23   50:aload_1         
	//   24   51:getfield        #104 <Field long DataSpec.position>
	//   25   54:invokevirtual   #108 <Method long InputStream.skip(long)>
	//   26   57:aload_1         
	//   27   58:getfield        #104 <Field long DataSpec.position>
	//   28   61:lcmp            
	//   29   62:iflt            140
				if(dataspec.length != -1L)
	//*  30   65:aload_1         
	//*  31   66:getfield        #111 <Field long DataSpec.length>
	//*  32   69:ldc2w           #112 <Long -1L>
	//*  33   72:lcmp            
	//*  34   73:ifeq            87
				{
					bytesRemaining = dataspec.length;
	//   35   76:aload_0         
	//   36   77:aload_1         
	//   37   78:getfield        #111 <Field long DataSpec.length>
	//   38   81:putfield        #115 <Field long bytesRemaining>
					break label1;
	//   39   84:goto            115
				}
				try
				{
					bytesRemaining = inputStream.available();
	//   40   87:aload_0         
	//   41   88:aload_0         
	//   42   89:getfield        #49  <Field InputStream inputStream>
	//   43   92:invokevirtual   #119 <Method int InputStream.available()>
	//   44   95:i2l             
	//   45   96:putfield        #115 <Field long bytesRemaining>
					if(bytesRemaining == 0L)
	//*  46   99:aload_0         
	//*  47  100:getfield        #115 <Field long bytesRemaining>
	//*  48  103:lconst_0        
	//*  49  104:lcmp            
	//*  50  105:ifne            115
						bytesRemaining = -1L;
	//   51  108:aload_0         
	//   52  109:ldc2w           #112 <Long -1L>
	//   53  112:putfield        #115 <Field long bytesRemaining>
				}
	//*  54  115:aload_0         
	//*  55  116:iconst_1        
	//*  56  117:putfield        #60  <Field boolean opened>
	//*  57  120:aload_0         
	//*  58  121:getfield        #42  <Field TransferListener listener>
	//*  59  124:astore_1        
	//*  60  125:aload_1         
	//*  61  126:ifnull          135
	//*  62  129:aload_1         
	//*  63  130:invokeinterface #122 <Method void TransferListener.onTransferStart()>
	//*  64  135:aload_0         
	//*  65  136:getfield        #115 <Field long bytesRemaining>
	//*  66  139:lreturn         
	//*  67  140:new             #124 <Class EOFException>
	//*  68  143:dup             
	//*  69  144:invokespecial   #125 <Method void EOFException()>
	//*  70  147:athrow          
				// Misplaced declaration of an exception variable
				catch(DataSpec dataspec)
	//*  71  148:astore_1        
				{
					throw new ContentDataSourceException(((IOException) (dataspec)));
	//   72  149:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//   73  152:dup             
	//   74  153:aload_1         
	//   75  154:invokespecial   #68  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//   76  157:athrow          
				}
			}
			opened = true;
			dataspec = ((DataSpec) (listener));
			if(dataspec != null)
				((TransferListener) (dataspec)).onTransferStart();
			return bytesRemaining;
		}
		throw new EOFException();
	}

	public int read(byte abyte0[], int i, int j)
		throws ContentDataSourceException
	{
		long l;
		long l2;
		l = bytesRemaining;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field long bytesRemaining>
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
	//*  10   17:ldc2w           #112 <Long -1L>
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
	//   23   41:getfield        #49  <Field InputStream inputStream>
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
	//   32   56:getfield        #115 <Field long bytesRemaining>
	//   33   59:lstore          4
			if(l1 != -1L)
	//*  34   61:lload           4
	//*  35   63:ldc2w           #112 <Long -1L>
	//*  36   66:lcmp            
	//*  37   67:ifeq            79
				bytesRemaining = l1 - (long)i;
	//   38   70:aload_0         
	//   39   71:lload           4
	//   40   73:iload_2         
	//   41   74:i2l             
	//   42   75:lsub            
	//   43   76:putfield        #115 <Field long bytesRemaining>
			abyte0 = ((byte []) (listener));
	//   44   79:aload_0         
	//   45   80:getfield        #42  <Field TransferListener listener>
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
		throw new ContentDataSourceException(((IOException) (abyte0)));
	//   55   98:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//   56  101:dup             
	//   57  102:aload_1         
	//   58  103:invokespecial   #68  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//   59  106:athrow          
	}

	private AssetFileDescriptor assetFileDescriptor;
	private long bytesRemaining;
	private InputStream inputStream;
	private final TransferListener listener;
	private boolean opened;
	private final ContentResolver resolver;
	private String uriString;
}
