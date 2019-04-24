// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.*;
import java.nio.channels.FileChannel;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, TransferListener, DataSpec

public final class ContentDataSource
	implements DataSource
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
	//    3    3:invokespecial   #29  <Method void ContentDataSource(Context, TransferListener)>
	//    4    6:return          
	}

	public ContentDataSource(Context context, TransferListener transferlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		resolver = context.getContentResolver();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #39  <Method ContentResolver Context.getContentResolver()>
	//    5    9:putfield        #41  <Field ContentResolver resolver>
		listener = transferlistener;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #43  <Field TransferListener listener>
	//    9   17:return          
	}

	public void close()
		throws ContentDataSourceException
	{
		uri = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #50  <Field Uri uri>
		if(inputStream != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #52  <Field FileInputStream inputStream>
	//*   5    9:ifnull          19
			inputStream.close();
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field FileInputStream inputStream>
	//    8   16:invokevirtual   #56  <Method void FileInputStream.close()>
		inputStream = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #52  <Field FileInputStream inputStream>
		if(assetFileDescriptor != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
	//*  14   28:ifnull          38
			assetFileDescriptor.close();
	//   15   31:aload_0         
	//   16   32:getfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
	//   17   35:invokevirtual   #61  <Method void AssetFileDescriptor.close()>
		assetFileDescriptor = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//*  21   43:aload_0         
	//*  22   44:getfield        #63  <Field boolean opened>
	//*  23   47:ifeq            72
		{
			opened = false;
	//   24   50:aload_0         
	//   25   51:iconst_0        
	//   26   52:putfield        #63  <Field boolean opened>
			if(listener != null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #43  <Field TransferListener listener>
	//*  29   59:ifnull          72
				listener.onTransferEnd(((Object) (this)));
	//   30   62:aload_0         
	//   31   63:getfield        #43  <Field TransferListener listener>
	//   32   66:aload_0         
	//   33   67:invokeinterface #69  <Method void TransferListener.onTransferEnd(Object)>
		}
		return;
	//   34   72:return          
		Object obj;
		obj;
	//   35   73:astore_1        
		break MISSING_BLOCK_LABEL_87;
	//   36   74:goto            87
		obj;
	//   37   77:astore_1        
		throw new ContentDataSourceException(((IOException) (obj)));
	//   38   78:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//   39   81:dup             
	//   40   82:aload_1         
	//   41   83:invokespecial   #72  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//   42   86:athrow          
		assetFileDescriptor = null;
	//   43   87:aload_0         
	//   44   88:aconst_null     
	//   45   89:putfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//*  46   92:aload_0         
	//*  47   93:getfield        #63  <Field boolean opened>
	//*  48   96:ifeq            121
		{
			opened = false;
	//   49   99:aload_0         
	//   50  100:iconst_0        
	//   51  101:putfield        #63  <Field boolean opened>
			if(listener != null)
	//*  52  104:aload_0         
	//*  53  105:getfield        #43  <Field TransferListener listener>
	//*  54  108:ifnull          121
				listener.onTransferEnd(((Object) (this)));
	//   55  111:aload_0         
	//   56  112:getfield        #43  <Field TransferListener listener>
	//   57  115:aload_0         
	//   58  116:invokeinterface #69  <Method void TransferListener.onTransferEnd(Object)>
		}
		throw obj;
	//   59  121:aload_1         
	//   60  122:athrow          
		obj;
	//   61  123:astore_1        
		break MISSING_BLOCK_LABEL_137;
	//   62  124:goto            137
		obj;
	//   63  127:astore_1        
		throw new ContentDataSourceException(((IOException) (obj)));
	//   64  128:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//   65  131:dup             
	//   66  132:aload_1         
	//   67  133:invokespecial   #72  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//   68  136:athrow          
		inputStream = null;
	//   69  137:aload_0         
	//   70  138:aconst_null     
	//   71  139:putfield        #52  <Field FileInputStream inputStream>
		if(assetFileDescriptor != null)
	//*  72  142:aload_0         
	//*  73  143:getfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
	//*  74  146:ifnull          156
			assetFileDescriptor.close();
	//   75  149:aload_0         
	//   76  150:getfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
	//   77  153:invokevirtual   #61  <Method void AssetFileDescriptor.close()>
		assetFileDescriptor = null;
	//   78  156:aload_0         
	//   79  157:aconst_null     
	//   80  158:putfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//*  81  161:aload_0         
	//*  82  162:getfield        #63  <Field boolean opened>
	//*  83  165:ifeq            190
		{
			opened = false;
	//   84  168:aload_0         
	//   85  169:iconst_0        
	//   86  170:putfield        #63  <Field boolean opened>
			if(listener != null)
	//*  87  173:aload_0         
	//*  88  174:getfield        #43  <Field TransferListener listener>
	//*  89  177:ifnull          190
				listener.onTransferEnd(((Object) (this)));
	//   90  180:aload_0         
	//   91  181:getfield        #43  <Field TransferListener listener>
	//   92  184:aload_0         
	//   93  185:invokeinterface #69  <Method void TransferListener.onTransferEnd(Object)>
		}
		throw obj;
	//   94  190:aload_1         
	//   95  191:athrow          
		obj;
	//   96  192:astore_1        
		break MISSING_BLOCK_LABEL_206;
	//   97  193:goto            206
		obj;
	//   98  196:astore_1        
		throw new ContentDataSourceException(((IOException) (obj)));
	//   99  197:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//  100  200:dup             
	//  101  201:aload_1         
	//  102  202:invokespecial   #72  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//  103  205:athrow          
		assetFileDescriptor = null;
	//  104  206:aload_0         
	//  105  207:aconst_null     
	//  106  208:putfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//* 107  211:aload_0         
	//* 108  212:getfield        #63  <Field boolean opened>
	//* 109  215:ifeq            240
		{
			opened = false;
	//  110  218:aload_0         
	//  111  219:iconst_0        
	//  112  220:putfield        #63  <Field boolean opened>
			if(listener != null)
	//* 113  223:aload_0         
	//* 114  224:getfield        #43  <Field TransferListener listener>
	//* 115  227:ifnull          240
				listener.onTransferEnd(((Object) (this)));
	//  116  230:aload_0         
	//  117  231:getfield        #43  <Field TransferListener listener>
	//  118  234:aload_0         
	//  119  235:invokeinterface #69  <Method void TransferListener.onTransferEnd(Object)>
		}
		throw obj;
	//  120  240:aload_1         
	//  121  241:athrow          
	}

	public Uri getUri()
	{
		return uri;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Uri uri>
	//    2    4:areturn         
	}

	public long open(DataSpec dataspec)
		throws ContentDataSourceException
	{
		long l1;
		long l2;
		long l3;
		FileChannel filechannel;
		try
		{
			uri = dataspec.uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #80  <Field Uri DataSpec.uri>
	//    3    5:putfield        #50  <Field Uri uri>
			assetFileDescriptor = resolver.openAssetFileDescriptor(uri, "r");
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field ContentResolver resolver>
	//    7   13:aload_0         
	//    8   14:getfield        #50  <Field Uri uri>
	//    9   17:ldc1            #82  <String "r">
	//   10   19:invokevirtual   #88  <Method AssetFileDescriptor ContentResolver.openAssetFileDescriptor(Uri, String)>
	//   11   22:putfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
			if(assetFileDescriptor == null)
	//*  12   25:aload_0         
	//*  13   26:getfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
	//*  14   29:ifnonnull       68
			{
				dataspec = ((DataSpec) (new StringBuilder()));
	//   15   32:new             #90  <Class StringBuilder>
	//   16   35:dup             
	//   17   36:invokespecial   #91  <Method void StringBuilder()>
	//   18   39:astore_1        
				((StringBuilder) (dataspec)).append("Could not open file descriptor for: ");
	//   19   40:aload_1         
	//   20   41:ldc1            #93  <String "Could not open file descriptor for: ">
	//   21   43:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
				((StringBuilder) (dataspec)).append(((Object) (uri)));
	//   23   47:aload_1         
	//   24   48:aload_0         
	//   25   49:getfield        #50  <Field Uri uri>
	//   26   52:invokevirtual   #100 <Method StringBuilder StringBuilder.append(Object)>
	//   27   55:pop             
				throw new FileNotFoundException(((StringBuilder) (dataspec)).toString());
	//   28   56:new             #102 <Class FileNotFoundException>
	//   29   59:dup             
	//   30   60:aload_1         
	//   31   61:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   32   64:invokespecial   #109 <Method void FileNotFoundException(String)>
	//   33   67:athrow          
			}
			inputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
	//   34   68:aload_0         
	//   35   69:new             #54  <Class FileInputStream>
	//   36   72:dup             
	//   37   73:aload_0         
	//   38   74:getfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
	//   39   77:invokevirtual   #113 <Method java.io.FileDescriptor AssetFileDescriptor.getFileDescriptor()>
	//   40   80:invokespecial   #116 <Method void FileInputStream(java.io.FileDescriptor)>
	//   41   83:putfield        #52  <Field FileInputStream inputStream>
			long l = assetFileDescriptor.getStartOffset();
	//   42   86:aload_0         
	//   43   87:getfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
	//   44   90:invokevirtual   #120 <Method long AssetFileDescriptor.getStartOffset()>
	//   45   93:lstore_2        
			l2 = inputStream.skip(l + dataspec.position) - l;
	//   46   94:aload_0         
	//   47   95:getfield        #52  <Field FileInputStream inputStream>
	//   48   98:lload_2         
	//   49   99:aload_1         
	//   50  100:getfield        #123 <Field long DataSpec.position>
	//   51  103:ladd            
	//   52  104:invokevirtual   #127 <Method long FileInputStream.skip(long)>
	//   53  107:lload_2         
	//   54  108:lsub            
	//   55  109:lstore          4
			if(l2 != dataspec.position)
	//*  56  111:lload           4
	//*  57  113:aload_1         
	//*  58  114:getfield        #123 <Field long DataSpec.position>
	//*  59  117:lcmp            
	//*  60  118:ifeq            129
				throw new EOFException();
	//   61  121:new             #129 <Class EOFException>
	//   62  124:dup             
	//   63  125:invokespecial   #130 <Method void EOFException()>
	//   64  128:athrow          
			l3 = dataspec.length;
	//   65  129:aload_1         
	//   66  130:getfield        #133 <Field long DataSpec.length>
	//   67  133:lstore          6
		}
	//*  68  135:ldc2w           #134 <Long -1L>
	//*  69  138:lstore_2        
	//*  70  139:lload           6
	//*  71  141:ldc2w           #134 <Long -1L>
	//*  72  144:lcmp            
	//*  73  145:ifeq            159
	//*  74  148:aload_0         
	//*  75  149:aload_1         
	//*  76  150:getfield        #133 <Field long DataSpec.length>
	//*  77  153:putfield        #137 <Field long bytesRemaining>
	//*  78  156:goto            229
	//*  79  159:aload_0         
	//*  80  160:getfield        #58  <Field AssetFileDescriptor assetFileDescriptor>
	//*  81  163:invokevirtual   #140 <Method long AssetFileDescriptor.getLength()>
	//*  82  166:lstore          6
	//*  83  168:lload           6
	//*  84  170:ldc2w           #134 <Long -1L>
	//*  85  173:lcmp            
	//*  86  174:ifne            220
	//*  87  177:aload_0         
	//*  88  178:getfield        #52  <Field FileInputStream inputStream>
	//*  89  181:invokevirtual   #144 <Method FileChannel FileInputStream.getChannel()>
	//*  90  184:astore          8
	//*  91  186:aload           8
	//*  92  188:invokevirtual   #149 <Method long FileChannel.size()>
	//*  93  191:lstore          4
	//*  94  193:lload           4
	//*  95  195:lconst_0        
	//*  96  196:lcmp            
	//*  97  197:ifne            203
	//*  98  200:goto            212
	//*  99  203:lload           4
	//* 100  205:aload           8
	//* 101  207:invokevirtual   #151 <Method long FileChannel.position()>
	//* 102  210:lsub            
	//* 103  211:lstore_2        
	//* 104  212:aload_0         
	//* 105  213:lload_2         
	//* 106  214:putfield        #137 <Field long bytesRemaining>
	//* 107  217:goto            229
	//* 108  220:aload_0         
	//* 109  221:lload           6
	//* 110  223:lload           4
	//* 111  225:lsub            
	//* 112  226:putfield        #137 <Field long bytesRemaining>
	//* 113  229:aload_0         
	//* 114  230:iconst_1        
	//* 115  231:putfield        #63  <Field boolean opened>
	//* 116  234:aload_0         
	//* 117  235:getfield        #43  <Field TransferListener listener>
	//* 118  238:ifnull          252
	//* 119  241:aload_0         
	//* 120  242:getfield        #43  <Field TransferListener listener>
	//* 121  245:aload_0         
	//* 122  246:aload_1         
	//* 123  247:invokeinterface #155 <Method void TransferListener.onTransferStart(Object, DataSpec)>
	//* 124  252:aload_0         
	//* 125  253:getfield        #137 <Field long bytesRemaining>
	//* 126  256:lreturn         
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//* 127  257:astore_1        
		{
			throw new ContentDataSourceException(((IOException) (dataspec)));
	//  128  258:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//  129  261:dup             
	//  130  262:aload_1         
	//  131  263:invokespecial   #72  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//  132  266:athrow          
		}
		l1 = -1L;
		if(l3 == -1L)
			break MISSING_BLOCK_LABEL_159;
		bytesRemaining = dataspec.length;
		break MISSING_BLOCK_LABEL_229;
		l3 = assetFileDescriptor.getLength();
		if(l3 != -1L)
			break MISSING_BLOCK_LABEL_220;
		filechannel = inputStream.getChannel();
		l2 = filechannel.size();
		if(l2 == 0L)
			break MISSING_BLOCK_LABEL_212;
		l1 = l2 - filechannel.position();
		bytesRemaining = l1;
		break MISSING_BLOCK_LABEL_229;
		bytesRemaining = l3 - l2;
		opened = true;
		if(listener != null)
			listener.onTransferStart(((Object) (this)), dataspec);
		return bytesRemaining;
	}

	public int read(byte abyte0[], int i, int j)
		throws ContentDataSourceException
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(bytesRemaining == 0L)
	//*   4    6:aload_0         
	//*   5    7:getfield        #137 <Field long bytesRemaining>
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
	//*  12   18:getfield        #137 <Field long bytesRemaining>
	//*  13   21:ldc2w           #134 <Long -1L>
	//*  14   24:lcmp            
	//*  15   25:ifne            31
				break MISSING_BLOCK_LABEL_42;
	//   16   28:goto            42
		}
	//*  17   31:aload_0         
	//*  18   32:getfield        #137 <Field long bytesRemaining>
	//*  19   35:iload_3         
	//*  20   36:i2l             
	//*  21   37:invokestatic    #163 <Method long Math.min(long, long)>
	//*  22   40:l2i             
	//*  23   41:istore_3        
	//*  24   42:aload_0         
	//*  25   43:getfield        #52  <Field FileInputStream inputStream>
	//*  26   46:aload_1         
	//*  27   47:iload_2         
	//*  28   48:iload_3         
	//*  29   49:invokevirtual   #165 <Method int FileInputStream.read(byte[], int, int)>
	//*  30   52:istore_2        
	//*  31   53:iload_2         
	//*  32   54:iconst_m1       
	//*  33   55:icmpne          86
	//*  34   58:aload_0         
	//*  35   59:getfield        #137 <Field long bytesRemaining>
	//*  36   62:ldc2w           #134 <Long -1L>
	//*  37   65:lcmp            
	//*  38   66:ifeq            84
	//*  39   69:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//*  40   72:dup             
	//*  41   73:new             #129 <Class EOFException>
	//*  42   76:dup             
	//*  43   77:invokespecial   #130 <Method void EOFException()>
	//*  44   80:invokespecial   #72  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//*  45   83:athrow          
	//*  46   84:iconst_m1       
	//*  47   85:ireturn         
	//*  48   86:aload_0         
	//*  49   87:getfield        #137 <Field long bytesRemaining>
	//*  50   90:ldc2w           #134 <Long -1L>
	//*  51   93:lcmp            
	//*  52   94:ifeq            108
	//*  53   97:aload_0         
	//*  54   98:aload_0         
	//*  55   99:getfield        #137 <Field long bytesRemaining>
	//*  56  102:iload_2         
	//*  57  103:i2l             
	//*  58  104:lsub            
	//*  59  105:putfield        #137 <Field long bytesRemaining>
	//*  60  108:aload_0         
	//*  61  109:getfield        #43  <Field TransferListener listener>
	//*  62  112:ifnull          126
	//*  63  115:aload_0         
	//*  64  116:getfield        #43  <Field TransferListener listener>
	//*  65  119:aload_0         
	//*  66  120:iload_2         
	//*  67  121:invokeinterface #169 <Method void TransferListener.onBytesTransferred(Object, int)>
	//*  68  126:iload_2         
	//*  69  127:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  70  128:astore_1        
		{
			throw new ContentDataSourceException(((IOException) (abyte0)));
	//   71  129:new             #8   <Class ContentDataSource$ContentDataSourceException>
	//   72  132:dup             
	//   73  133:aload_1         
	//   74  134:invokespecial   #72  <Method void ContentDataSource$ContentDataSourceException(IOException)>
	//   75  137:athrow          
		}
		j = (int)Math.min(bytesRemaining, j);
		i = inputStream.read(abyte0, i, j);
		if(i == -1)
			if(bytesRemaining != -1L)
				throw new ContentDataSourceException(((IOException) (new EOFException())));
			else
				return -1;
		if(bytesRemaining != -1L)
			bytesRemaining = bytesRemaining - (long)i;
		if(listener != null)
			listener.onBytesTransferred(((Object) (this)), i);
		return i;
	}

	private AssetFileDescriptor assetFileDescriptor;
	private long bytesRemaining;
	private FileInputStream inputStream;
	private final TransferListener listener;
	private boolean opened;
	private final ContentResolver resolver;
	private Uri uri;
}
