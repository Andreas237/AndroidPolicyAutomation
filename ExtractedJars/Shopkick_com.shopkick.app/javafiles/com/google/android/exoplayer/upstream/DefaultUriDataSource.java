// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			UriDataSource, FileDataSource, AssetDataSource, ContentDataSource, 
//			DefaultHttpDataSource, DataSpec, TransferListener

public final class DefaultUriDataSource
	implements UriDataSource
{

	public DefaultUriDataSource(Context context, TransferListener transferlistener, UriDataSource uridatasource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		httpDataSource = (UriDataSource)Assertions.checkNotNull(((Object) (uridatasource)));
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:invokestatic    #30  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #6   <Class UriDataSource>
	//    6   12:putfield        #32  <Field UriDataSource httpDataSource>
		fileDataSource = ((UriDataSource) (new FileDataSource(transferlistener)));
	//    7   15:aload_0         
	//    8   16:new             #34  <Class FileDataSource>
	//    9   19:dup             
	//   10   20:aload_2         
	//   11   21:invokespecial   #37  <Method void FileDataSource(TransferListener)>
	//   12   24:putfield        #39  <Field UriDataSource fileDataSource>
		assetDataSource = ((UriDataSource) (new AssetDataSource(context, transferlistener)));
	//   13   27:aload_0         
	//   14   28:new             #41  <Class AssetDataSource>
	//   15   31:dup             
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokespecial   #44  <Method void AssetDataSource(Context, TransferListener)>
	//   19   37:putfield        #46  <Field UriDataSource assetDataSource>
		contentDataSource = ((UriDataSource) (new ContentDataSource(context, transferlistener)));
	//   20   40:aload_0         
	//   21   41:new             #48  <Class ContentDataSource>
	//   22   44:dup             
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:invokespecial   #49  <Method void ContentDataSource(Context, TransferListener)>
	//   26   50:putfield        #51  <Field UriDataSource contentDataSource>
	//   27   53:return          
	}

	public DefaultUriDataSource(Context context, TransferListener transferlistener, String s)
	{
		this(context, transferlistener, s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #56  <Method void DefaultUriDataSource(Context, TransferListener, String, boolean)>
	//    6    8:return          
	}

	public DefaultUriDataSource(Context context, TransferListener transferlistener, String s, boolean flag)
	{
		this(context, transferlistener, ((UriDataSource) (new DefaultHttpDataSource(s, ((com.google.android.exoplayer.util.Predicate) (null)), transferlistener, 8000, 8000, flag))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #58  <Class DefaultHttpDataSource>
	//    4    6:dup             
	//    5    7:aload_3         
	//    6    8:aconst_null     
	//    7    9:aload_2         
	//    8   10:sipush          8000
	//    9   13:sipush          8000
	//   10   16:iload           4
	//   11   18:invokespecial   #61  <Method void DefaultHttpDataSource(String, com.google.android.exoplayer.util.Predicate, TransferListener, int, int, boolean)>
	//   12   21:invokespecial   #63  <Method void DefaultUriDataSource(Context, TransferListener, UriDataSource)>
	//   13   24:return          
	}

	public DefaultUriDataSource(Context context, String s)
	{
		this(context, ((TransferListener) (null)), s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #56  <Method void DefaultUriDataSource(Context, TransferListener, String, boolean)>
	//    6    8:return          
	}

	public void close()
		throws IOException
	{
		UriDataSource uridatasource;
		uridatasource = dataSource;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field UriDataSource dataSource>
	//    2    4:astore_1        
		if(uridatasource == null)
			break MISSING_BLOCK_LABEL_29;
	//    3    5:aload_1         
	//    4    6:ifnull          29
		uridatasource.close();
	//    5    9:aload_1         
	//    6   10:invokeinterface #71  <Method void UriDataSource.close()>
		dataSource = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #69  <Field UriDataSource dataSource>
		return;
	//   10   20:return          
		Exception exception;
		exception;
	//   11   21:astore_1        
		dataSource = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #69  <Field UriDataSource dataSource>
		throw exception;
	//   15   27:aload_1         
	//   16   28:athrow          
	//   17   29:return          
	}

	public String getUri()
	{
		UriDataSource uridatasource = dataSource;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field UriDataSource dataSource>
	//    2    4:astore_1        
		if(uridatasource == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return uridatasource.getUri();
	//    7   11:aload_1         
	//    8   12:invokeinterface #76  <Method String UriDataSource.getUri()>
	//    9   17:areturn         
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		boolean flag;
		if(dataSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field UriDataSource dataSource>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #82  <Method void Assertions.checkState(boolean)>
		String s = dataspec.uri.getScheme();
	//   10   18:aload_1         
	//   11   19:getfield        #88  <Field Uri DataSpec.uri>
	//   12   22:invokevirtual   #93  <Method String Uri.getScheme()>
	//   13   25:astore_3        
		if(Util.isLocalFileUri(dataspec.uri))
	//*  14   26:aload_1         
	//*  15   27:getfield        #88  <Field Uri DataSpec.uri>
	//*  16   30:invokestatic    #99  <Method boolean Util.isLocalFileUri(Uri)>
	//*  17   33:ifeq            73
		{
			if(dataspec.uri.getPath().startsWith("/android_asset/"))
	//*  18   36:aload_1         
	//*  19   37:getfield        #88  <Field Uri DataSpec.uri>
	//*  20   40:invokevirtual   #102 <Method String Uri.getPath()>
	//*  21   43:ldc1            #104 <String "/android_asset/">
	//*  22   45:invokevirtual   #110 <Method boolean String.startsWith(String)>
	//*  23   48:ifeq            62
				dataSource = assetDataSource;
	//   24   51:aload_0         
	//   25   52:aload_0         
	//   26   53:getfield        #46  <Field UriDataSource assetDataSource>
	//   27   56:putfield        #69  <Field UriDataSource dataSource>
			else
	//*  28   59:goto            121
				dataSource = fileDataSource;
	//   29   62:aload_0         
	//   30   63:aload_0         
	//   31   64:getfield        #39  <Field UriDataSource fileDataSource>
	//   32   67:putfield        #69  <Field UriDataSource dataSource>
		} else
	//*  33   70:goto            121
		if("asset".equals(((Object) (s))))
	//*  34   73:ldc1            #10  <String "asset">
	//*  35   75:aload_3         
	//*  36   76:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  37   79:ifeq            93
			dataSource = assetDataSource;
	//   38   82:aload_0         
	//   39   83:aload_0         
	//   40   84:getfield        #46  <Field UriDataSource assetDataSource>
	//   41   87:putfield        #69  <Field UriDataSource dataSource>
		else
	//*  42   90:goto            121
		if("content".equals(((Object) (s))))
	//*  43   93:ldc1            #13  <String "content">
	//*  44   95:aload_3         
	//*  45   96:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  46   99:ifeq            113
			dataSource = contentDataSource;
	//   47  102:aload_0         
	//   48  103:aload_0         
	//   49  104:getfield        #51  <Field UriDataSource contentDataSource>
	//   50  107:putfield        #69  <Field UriDataSource dataSource>
		else
	//*  51  110:goto            121
			dataSource = httpDataSource;
	//   52  113:aload_0         
	//   53  114:aload_0         
	//   54  115:getfield        #32  <Field UriDataSource httpDataSource>
	//   55  118:putfield        #69  <Field UriDataSource dataSource>
		return dataSource.open(dataspec);
	//   56  121:aload_0         
	//   57  122:getfield        #69  <Field UriDataSource dataSource>
	//   58  125:aload_1         
	//   59  126:invokeinterface #116 <Method long UriDataSource.open(DataSpec)>
	//   60  131:lreturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		return dataSource.read(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field UriDataSource dataSource>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #120 <Method int UriDataSource.read(byte[], int, int)>
	//    6   12:ireturn         
	}

	private static final String SCHEME_ASSET = "asset";
	private static final String SCHEME_CONTENT = "content";
	private final UriDataSource assetDataSource;
	private final UriDataSource contentDataSource;
	private UriDataSource dataSource;
	private final UriDataSource fileDataSource;
	private final UriDataSource httpDataSource;
}
