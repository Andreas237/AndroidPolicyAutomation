// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, TransferListener, DataSpec

public final class RawResourceDataSource
	implements DataSource
{
	public static class RawResourceDataSourceException extends IOException
	{

		public RawResourceDataSourceException(IOException ioexception)
		{
			super(((Throwable) (ioexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void IOException(Throwable)>
		//    3    5:return          
		}

		public RawResourceDataSourceException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void IOException(String)>
		//    3    5:return          
		}
	}


	public RawResourceDataSource(Context context)
	{
		this(context, ((TransferListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #33  <Method void RawResourceDataSource(Context, TransferListener)>
	//    4    6:return          
	}

	public RawResourceDataSource(Context context, TransferListener transferlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		resources = context.getResources();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #43  <Method Resources Context.getResources()>
	//    5    9:putfield        #45  <Field Resources resources>
		listener = transferlistener;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #47  <Field TransferListener listener>
	//    9   17:return          
	}

	public static Uri buildRawResourceUri(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("rawresource:///");
	//    4    8:aload_1         
	//    5    9:ldc1            #56  <String "rawresource:///">
	//    6   11:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_1         
	//    9   16:iload_0         
	//   10   17:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		return Uri.parse(stringbuilder.toString());
	//   12   21:aload_1         
	//   13   22:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   14   25:invokestatic    #73  <Method Uri Uri.parse(String)>
	//   15   28:areturn         
	}

	public void close()
		throws RawResourceDataSourceException
	{
		uri = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #78  <Field Uri uri>
		if(inputStream != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #80  <Field InputStream inputStream>
	//*   5    9:ifnull          19
			inputStream.close();
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field InputStream inputStream>
	//    8   16:invokevirtual   #84  <Method void InputStream.close()>
		inputStream = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #80  <Field InputStream inputStream>
		if(assetFileDescriptor != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
	//*  14   28:ifnull          38
			assetFileDescriptor.close();
	//   15   31:aload_0         
	//   16   32:getfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
	//   17   35:invokevirtual   #89  <Method void AssetFileDescriptor.close()>
		assetFileDescriptor = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//*  21   43:aload_0         
	//*  22   44:getfield        #91  <Field boolean opened>
	//*  23   47:ifeq            72
		{
			opened = false;
	//   24   50:aload_0         
	//   25   51:iconst_0        
	//   26   52:putfield        #91  <Field boolean opened>
			if(listener != null)
	//*  27   55:aload_0         
	//*  28   56:getfield        #47  <Field TransferListener listener>
	//*  29   59:ifnull          72
				listener.onTransferEnd(((Object) (this)));
	//   30   62:aload_0         
	//   31   63:getfield        #47  <Field TransferListener listener>
	//   32   66:aload_0         
	//   33   67:invokeinterface #97  <Method void TransferListener.onTransferEnd(Object)>
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
		throw new RawResourceDataSourceException(((IOException) (obj)));
	//   38   78:new             #8   <Class RawResourceDataSource$RawResourceDataSourceException>
	//   39   81:dup             
	//   40   82:aload_1         
	//   41   83:invokespecial   #100 <Method void RawResourceDataSource$RawResourceDataSourceException(IOException)>
	//   42   86:athrow          
		assetFileDescriptor = null;
	//   43   87:aload_0         
	//   44   88:aconst_null     
	//   45   89:putfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//*  46   92:aload_0         
	//*  47   93:getfield        #91  <Field boolean opened>
	//*  48   96:ifeq            121
		{
			opened = false;
	//   49   99:aload_0         
	//   50  100:iconst_0        
	//   51  101:putfield        #91  <Field boolean opened>
			if(listener != null)
	//*  52  104:aload_0         
	//*  53  105:getfield        #47  <Field TransferListener listener>
	//*  54  108:ifnull          121
				listener.onTransferEnd(((Object) (this)));
	//   55  111:aload_0         
	//   56  112:getfield        #47  <Field TransferListener listener>
	//   57  115:aload_0         
	//   58  116:invokeinterface #97  <Method void TransferListener.onTransferEnd(Object)>
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
		throw new RawResourceDataSourceException(((IOException) (obj)));
	//   64  128:new             #8   <Class RawResourceDataSource$RawResourceDataSourceException>
	//   65  131:dup             
	//   66  132:aload_1         
	//   67  133:invokespecial   #100 <Method void RawResourceDataSource$RawResourceDataSourceException(IOException)>
	//   68  136:athrow          
		inputStream = null;
	//   69  137:aload_0         
	//   70  138:aconst_null     
	//   71  139:putfield        #80  <Field InputStream inputStream>
		if(assetFileDescriptor != null)
	//*  72  142:aload_0         
	//*  73  143:getfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
	//*  74  146:ifnull          156
			assetFileDescriptor.close();
	//   75  149:aload_0         
	//   76  150:getfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
	//   77  153:invokevirtual   #89  <Method void AssetFileDescriptor.close()>
		assetFileDescriptor = null;
	//   78  156:aload_0         
	//   79  157:aconst_null     
	//   80  158:putfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//*  81  161:aload_0         
	//*  82  162:getfield        #91  <Field boolean opened>
	//*  83  165:ifeq            190
		{
			opened = false;
	//   84  168:aload_0         
	//   85  169:iconst_0        
	//   86  170:putfield        #91  <Field boolean opened>
			if(listener != null)
	//*  87  173:aload_0         
	//*  88  174:getfield        #47  <Field TransferListener listener>
	//*  89  177:ifnull          190
				listener.onTransferEnd(((Object) (this)));
	//   90  180:aload_0         
	//   91  181:getfield        #47  <Field TransferListener listener>
	//   92  184:aload_0         
	//   93  185:invokeinterface #97  <Method void TransferListener.onTransferEnd(Object)>
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
		throw new RawResourceDataSourceException(((IOException) (obj)));
	//   99  197:new             #8   <Class RawResourceDataSource$RawResourceDataSourceException>
	//  100  200:dup             
	//  101  201:aload_1         
	//  102  202:invokespecial   #100 <Method void RawResourceDataSource$RawResourceDataSourceException(IOException)>
	//  103  205:athrow          
		assetFileDescriptor = null;
	//  104  206:aload_0         
	//  105  207:aconst_null     
	//  106  208:putfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
		if(opened)
	//* 107  211:aload_0         
	//* 108  212:getfield        #91  <Field boolean opened>
	//* 109  215:ifeq            240
		{
			opened = false;
	//  110  218:aload_0         
	//  111  219:iconst_0        
	//  112  220:putfield        #91  <Field boolean opened>
			if(listener != null)
	//* 113  223:aload_0         
	//* 114  224:getfield        #47  <Field TransferListener listener>
	//* 115  227:ifnull          240
				listener.onTransferEnd(((Object) (this)));
	//  116  230:aload_0         
	//  117  231:getfield        #47  <Field TransferListener listener>
	//  118  234:aload_0         
	//  119  235:invokeinterface #97  <Method void TransferListener.onTransferEnd(Object)>
		}
		throw obj;
	//  120  240:aload_1         
	//  121  241:athrow          
	}

	public Uri getUri()
	{
		return uri;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Uri uri>
	//    2    4:areturn         
	}

	public long open(DataSpec dataspec)
		throws RawResourceDataSourceException
	{
		uri = dataspec.uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #110 <Field Uri DataSpec.uri>
	//    3    5:putfield        #78  <Field Uri uri>
		if(!TextUtils.equals("rawresource", ((CharSequence) (uri.getScheme()))))
	//*   4    8:ldc1            #13  <String "rawresource">
	//*   5   10:aload_0         
	//*   6   11:getfield        #78  <Field Uri uri>
	//*   7   14:invokevirtual   #113 <Method String Uri.getScheme()>
	//*   8   17:invokestatic    #119 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//*   9   20:ifne            33
			throw new RawResourceDataSourceException("URI must use scheme rawresource");
	//   10   23:new             #8   <Class RawResourceDataSource$RawResourceDataSourceException>
	//   11   26:dup             
	//   12   27:ldc1            #121 <String "URI must use scheme rawresource">
	//   13   29:invokespecial   #124 <Method void RawResourceDataSource$RawResourceDataSourceException(String)>
	//   14   32:athrow          
		int i = Integer.parseInt(uri.getLastPathSegment());
	//   15   33:aload_0         
	//   16   34:getfield        #78  <Field Uri uri>
	//   17   37:invokevirtual   #127 <Method String Uri.getLastPathSegment()>
	//   18   40:invokestatic    #133 <Method int Integer.parseInt(String)>
	//   19   43:istore_2        
		long l1;
		assetFileDescriptor = resources.openRawResourceFd(i);
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #45  <Field Resources resources>
	//   23   49:iload_2         
	//   24   50:invokevirtual   #139 <Method AssetFileDescriptor Resources.openRawResourceFd(int)>
	//   25   53:putfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
		inputStream = ((InputStream) (new FileInputStream(assetFileDescriptor.getFileDescriptor())));
	//   26   56:aload_0         
	//   27   57:new             #141 <Class FileInputStream>
	//   28   60:dup             
	//   29   61:aload_0         
	//   30   62:getfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
	//   31   65:invokevirtual   #145 <Method java.io.FileDescriptor AssetFileDescriptor.getFileDescriptor()>
	//   32   68:invokespecial   #148 <Method void FileInputStream(java.io.FileDescriptor)>
	//   33   71:putfield        #80  <Field InputStream inputStream>
		inputStream.skip(assetFileDescriptor.getStartOffset());
	//   34   74:aload_0         
	//   35   75:getfield        #80  <Field InputStream inputStream>
	//   36   78:aload_0         
	//   37   79:getfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
	//   38   82:invokevirtual   #152 <Method long AssetFileDescriptor.getStartOffset()>
	//   39   85:invokevirtual   #156 <Method long InputStream.skip(long)>
	//   40   88:pop2            
		if(inputStream.skip(dataspec.position) < dataspec.position)
	//*  41   89:aload_0         
	//*  42   90:getfield        #80  <Field InputStream inputStream>
	//*  43   93:aload_1         
	//*  44   94:getfield        #159 <Field long DataSpec.position>
	//*  45   97:invokevirtual   #156 <Method long InputStream.skip(long)>
	//*  46  100:aload_1         
	//*  47  101:getfield        #159 <Field long DataSpec.position>
	//*  48  104:lcmp            
	//*  49  105:ifge            116
			throw new EOFException();
	//   50  108:new             #161 <Class EOFException>
	//   51  111:dup             
	//   52  112:invokespecial   #162 <Method void EOFException()>
	//   53  115:athrow          
		l1 = dataspec.length;
	//   54  116:aload_1         
	//   55  117:getfield        #165 <Field long DataSpec.length>
	//   56  120:lstore          5
		long l = -1L;
	//   57  122:ldc2w           #166 <Long -1L>
	//   58  125:lstore_3        
		if(l1 != -1L)
	//*  59  126:lload           5
	//*  60  128:ldc2w           #166 <Long -1L>
	//*  61  131:lcmp            
	//*  62  132:ifeq            146
		{
			long l2;
			try
			{
				bytesRemaining = dataspec.length;
	//   63  135:aload_0         
	//   64  136:aload_1         
	//   65  137:getfield        #165 <Field long DataSpec.length>
	//   66  140:putfield        #169 <Field long bytesRemaining>
			}
	//*  67  143:goto            180
	//*  68  146:aload_0         
	//*  69  147:getfield        #86  <Field AssetFileDescriptor assetFileDescriptor>
	//*  70  150:invokevirtual   #172 <Method long AssetFileDescriptor.getLength()>
	//*  71  153:lstore          5
	//*  72  155:lload           5
	//*  73  157:ldc2w           #166 <Long -1L>
	//*  74  160:lcmp            
	//*  75  161:ifne            167
	//*  76  164:goto            175
	//*  77  167:lload           5
	//*  78  169:aload_1         
	//*  79  170:getfield        #159 <Field long DataSpec.position>
	//*  80  173:lsub            
	//*  81  174:lstore_3        
	//*  82  175:aload_0         
	//*  83  176:lload_3         
	//*  84  177:putfield        #169 <Field long bytesRemaining>
	//*  85  180:aload_0         
	//*  86  181:iconst_1        
	//*  87  182:putfield        #91  <Field boolean opened>
	//*  88  185:aload_0         
	//*  89  186:getfield        #47  <Field TransferListener listener>
	//*  90  189:ifnull          203
	//*  91  192:aload_0         
	//*  92  193:getfield        #47  <Field TransferListener listener>
	//*  93  196:aload_0         
	//*  94  197:aload_1         
	//*  95  198:invokeinterface #176 <Method void TransferListener.onTransferStart(Object, DataSpec)>
	//*  96  203:aload_0         
	//*  97  204:getfield        #169 <Field long bytesRemaining>
	//*  98  207:lreturn         
	//*  99  208:new             #8   <Class RawResourceDataSource$RawResourceDataSourceException>
	//* 100  211:dup             
	//* 101  212:ldc1            #178 <String "Resource identifier must be an integer.">
	//* 102  214:invokespecial   #124 <Method void RawResourceDataSource$RawResourceDataSourceException(String)>
	//* 103  217:athrow          
			// Misplaced declaration of an exception variable
			catch(DataSpec dataspec)
	//* 104  218:astore_1        
			{
				throw new RawResourceDataSourceException(((IOException) (dataspec)));
	//  105  219:new             #8   <Class RawResourceDataSource$RawResourceDataSourceException>
	//  106  222:dup             
	//  107  223:aload_1         
	//  108  224:invokespecial   #100 <Method void RawResourceDataSource$RawResourceDataSourceException(IOException)>
	//  109  227:athrow          
			}
			break MISSING_BLOCK_LABEL_180;
		}
		l2 = assetFileDescriptor.getLength();
		if(l2 == -1L)
			break MISSING_BLOCK_LABEL_175;
		l = l2 - dataspec.position;
		bytesRemaining = l;
		opened = true;
		if(listener != null)
			listener.onTransferStart(((Object) (this)), dataspec);
		return bytesRemaining;
_L2:
		throw new RawResourceDataSourceException("Resource identifier must be an integer.");
		dataspec;
	//  110  228:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//* 111  229:goto            208
	}

	public int read(byte abyte0[], int i, int j)
		throws RawResourceDataSourceException
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(bytesRemaining == 0L)
	//*   4    6:aload_0         
	//*   5    7:getfield        #169 <Field long bytesRemaining>
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
	//*  12   18:getfield        #169 <Field long bytesRemaining>
	//*  13   21:ldc2w           #166 <Long -1L>
	//*  14   24:lcmp            
	//*  15   25:ifne            31
				break MISSING_BLOCK_LABEL_42;
	//   16   28:goto            42
		}
	//*  17   31:aload_0         
	//*  18   32:getfield        #169 <Field long bytesRemaining>
	//*  19   35:iload_3         
	//*  20   36:i2l             
	//*  21   37:invokestatic    #186 <Method long Math.min(long, long)>
	//*  22   40:l2i             
	//*  23   41:istore_3        
	//*  24   42:aload_0         
	//*  25   43:getfield        #80  <Field InputStream inputStream>
	//*  26   46:aload_1         
	//*  27   47:iload_2         
	//*  28   48:iload_3         
	//*  29   49:invokevirtual   #188 <Method int InputStream.read(byte[], int, int)>
	//*  30   52:istore_2        
	//*  31   53:iload_2         
	//*  32   54:iconst_m1       
	//*  33   55:icmpne          86
	//*  34   58:aload_0         
	//*  35   59:getfield        #169 <Field long bytesRemaining>
	//*  36   62:ldc2w           #166 <Long -1L>
	//*  37   65:lcmp            
	//*  38   66:ifeq            84
	//*  39   69:new             #8   <Class RawResourceDataSource$RawResourceDataSourceException>
	//*  40   72:dup             
	//*  41   73:new             #161 <Class EOFException>
	//*  42   76:dup             
	//*  43   77:invokespecial   #162 <Method void EOFException()>
	//*  44   80:invokespecial   #100 <Method void RawResourceDataSource$RawResourceDataSourceException(IOException)>
	//*  45   83:athrow          
	//*  46   84:iconst_m1       
	//*  47   85:ireturn         
	//*  48   86:aload_0         
	//*  49   87:getfield        #169 <Field long bytesRemaining>
	//*  50   90:ldc2w           #166 <Long -1L>
	//*  51   93:lcmp            
	//*  52   94:ifeq            108
	//*  53   97:aload_0         
	//*  54   98:aload_0         
	//*  55   99:getfield        #169 <Field long bytesRemaining>
	//*  56  102:iload_2         
	//*  57  103:i2l             
	//*  58  104:lsub            
	//*  59  105:putfield        #169 <Field long bytesRemaining>
	//*  60  108:aload_0         
	//*  61  109:getfield        #47  <Field TransferListener listener>
	//*  62  112:ifnull          126
	//*  63  115:aload_0         
	//*  64  116:getfield        #47  <Field TransferListener listener>
	//*  65  119:aload_0         
	//*  66  120:iload_2         
	//*  67  121:invokeinterface #192 <Method void TransferListener.onBytesTransferred(Object, int)>
	//*  68  126:iload_2         
	//*  69  127:ireturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  70  128:astore_1        
		{
			throw new RawResourceDataSourceException(((IOException) (abyte0)));
	//   71  129:new             #8   <Class RawResourceDataSource$RawResourceDataSourceException>
	//   72  132:dup             
	//   73  133:aload_1         
	//   74  134:invokespecial   #100 <Method void RawResourceDataSource$RawResourceDataSourceException(IOException)>
	//   75  137:athrow          
		}
		j = (int)Math.min(bytesRemaining, j);
		i = inputStream.read(abyte0, i, j);
		if(i == -1)
			if(bytesRemaining != -1L)
				throw new RawResourceDataSourceException(((IOException) (new EOFException())));
			else
				return -1;
		if(bytesRemaining != -1L)
			bytesRemaining = bytesRemaining - (long)i;
		if(listener != null)
			listener.onBytesTransferred(((Object) (this)), i);
		return i;
	}

	public static final String RAW_RESOURCE_SCHEME = "rawresource";
	private AssetFileDescriptor assetFileDescriptor;
	private long bytesRemaining;
	private InputStream inputStream;
	private final TransferListener listener;
	private boolean opened;
	private final Resources resources;
	private Uri uri;
}
