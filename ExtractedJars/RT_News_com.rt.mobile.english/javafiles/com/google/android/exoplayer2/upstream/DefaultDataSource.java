// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, DefaultHttpDataSource, AssetDataSource, ContentDataSource, 
//			DataSchemeDataSource, FileDataSource, RawResourceDataSource, DataSpec, 
//			TransferListener

public final class DefaultDataSource
	implements DataSource
{

	public DefaultDataSource(Context context1, TransferListener transferlistener, DataSource datasource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #47  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #49  <Field Context context>
		listener = transferlistener;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #51  <Field TransferListener listener>
		baseDataSource = (DataSource)Assertions.checkNotNull(((Object) (datasource)));
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokestatic    #57  <Method Object Assertions.checkNotNull(Object)>
	//   12   22:checkcast       #6   <Class DataSource>
	//   13   25:putfield        #59  <Field DataSource baseDataSource>
	//   14   28:return          
	}

	public DefaultDataSource(Context context1, TransferListener transferlistener, String s, int i, int j, boolean flag)
	{
		this(context1, transferlistener, ((DataSource) (new DefaultHttpDataSource(s, ((com.google.android.exoplayer2.util.Predicate) (null)), transferlistener, i, j, flag, ((HttpDataSource.RequestProperties) (null))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #65  <Class DefaultHttpDataSource>
	//    4    6:dup             
	//    5    7:aload_3         
	//    6    8:aconst_null     
	//    7    9:aload_2         
	//    8   10:iload           4
	//    9   12:iload           5
	//   10   14:iload           6
	//   11   16:aconst_null     
	//   12   17:invokespecial   #68  <Method void DefaultHttpDataSource(String, com.google.android.exoplayer2.util.Predicate, TransferListener, int, int, boolean, HttpDataSource$RequestProperties)>
	//   13   20:invokespecial   #70  <Method void DefaultDataSource(Context, TransferListener, DataSource)>
	//   14   23:return          
	}

	public DefaultDataSource(Context context1, TransferListener transferlistener, String s, boolean flag)
	{
		this(context1, transferlistener, s, 8000, 8000, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:sipush          8000
	//    5    7:sipush          8000
	//    6   10:iload           4
	//    7   12:invokespecial   #74  <Method void DefaultDataSource(Context, TransferListener, String, int, int, boolean)>
	//    8   15:return          
	}

	private DataSource getAssetDataSource()
	{
		if(assetDataSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field DataSource assetDataSource>
	//*   2    4:ifnonnull       26
			assetDataSource = ((DataSource) (new AssetDataSource(context, listener)));
	//    3    7:aload_0         
	//    4    8:new             #81  <Class AssetDataSource>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field Context context>
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field TransferListener listener>
	//   10   20:invokespecial   #84  <Method void AssetDataSource(Context, TransferListener)>
	//   11   23:putfield        #79  <Field DataSource assetDataSource>
		return assetDataSource;
	//   12   26:aload_0         
	//   13   27:getfield        #79  <Field DataSource assetDataSource>
	//   14   30:areturn         
	}

	private DataSource getContentDataSource()
	{
		if(contentDataSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field DataSource contentDataSource>
	//*   2    4:ifnonnull       26
			contentDataSource = ((DataSource) (new ContentDataSource(context, listener)));
	//    3    7:aload_0         
	//    4    8:new             #89  <Class ContentDataSource>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field Context context>
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field TransferListener listener>
	//   10   20:invokespecial   #90  <Method void ContentDataSource(Context, TransferListener)>
	//   11   23:putfield        #87  <Field DataSource contentDataSource>
		return contentDataSource;
	//   12   26:aload_0         
	//   13   27:getfield        #87  <Field DataSource contentDataSource>
	//   14   30:areturn         
	}

	private DataSource getDataSchemeDataSource()
	{
		if(dataSchemeDataSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field DataSource dataSchemeDataSource>
	//*   2    4:ifnonnull       18
			dataSchemeDataSource = ((DataSource) (new DataSchemeDataSource()));
	//    3    7:aload_0         
	//    4    8:new             #95  <Class DataSchemeDataSource>
	//    5   11:dup             
	//    6   12:invokespecial   #96  <Method void DataSchemeDataSource()>
	//    7   15:putfield        #93  <Field DataSource dataSchemeDataSource>
		return dataSchemeDataSource;
	//    8   18:aload_0         
	//    9   19:getfield        #93  <Field DataSource dataSchemeDataSource>
	//   10   22:areturn         
	}

	private DataSource getFileDataSource()
	{
		if(fileDataSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field DataSource fileDataSource>
	//*   2    4:ifnonnull       22
			fileDataSource = ((DataSource) (new FileDataSource(listener)));
	//    3    7:aload_0         
	//    4    8:new             #101 <Class FileDataSource>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field TransferListener listener>
	//    8   16:invokespecial   #104 <Method void FileDataSource(TransferListener)>
	//    9   19:putfield        #99  <Field DataSource fileDataSource>
		return fileDataSource;
	//   10   22:aload_0         
	//   11   23:getfield        #99  <Field DataSource fileDataSource>
	//   12   26:areturn         
	}

	private DataSource getRawResourceDataSource()
	{
		if(rawResourceDataSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field DataSource rawResourceDataSource>
	//*   2    4:ifnonnull       26
			rawResourceDataSource = ((DataSource) (new RawResourceDataSource(context, listener)));
	//    3    7:aload_0         
	//    4    8:new             #109 <Class RawResourceDataSource>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #49  <Field Context context>
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field TransferListener listener>
	//   10   20:invokespecial   #110 <Method void RawResourceDataSource(Context, TransferListener)>
	//   11   23:putfield        #107 <Field DataSource rawResourceDataSource>
		return rawResourceDataSource;
	//   12   26:aload_0         
	//   13   27:getfield        #107 <Field DataSource rawResourceDataSource>
	//   14   30:areturn         
	}

	private DataSource getRtmpDataSource()
	{
		ClassNotFoundException classnotfoundexception;
		if(rtmpDataSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field DataSource rtmpDataSource>
	//*   2    4:ifnonnull       71
		{
			try
			{
				rtmpDataSource = (DataSource)Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
	//    3    7:aload_0         
	//    4    8:ldc1            #119 <String "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource">
	//    5   10:invokestatic    #125 <Method Class Class.forName(String)>
	//    6   13:iconst_0        
	//    7   14:anewarray       Class[]
	//    8   17:invokevirtual   #129 <Method Constructor Class.getConstructor(Class[])>
	//    9   20:iconst_0        
	//   10   21:anewarray       Object[]
	//   11   24:invokevirtual   #135 <Method Object Constructor.newInstance(Object[])>
	//   12   27:checkcast       #6   <Class DataSource>
	//   13   30:putfield        #117 <Field DataSource rtmpDataSource>
			}
	//*  14   33:goto            56
	//*  15   36:astore_1        
	//*  16   37:new             #137 <Class RuntimeException>
	//*  17   40:dup             
	//*  18   41:ldc1            #139 <String "Error instantiating RTMP extension">
	//*  19   43:aload_1         
	//*  20   44:invokespecial   #142 <Method void RuntimeException(String, Throwable)>
	//*  21   47:athrow          
	//*  22   48:ldc1            #22  <String "DefaultDataSource">
	//*  23   50:ldc1            #144 <String "Attempting to play RTMP stream without depending on the RTMP extension">
	//*  24   52:invokestatic    #150 <Method int Log.w(String, String)>
	//*  25   55:pop             
	//*  26   56:aload_0         
	//*  27   57:getfield        #117 <Field DataSource rtmpDataSource>
	//*  28   60:ifnonnull       71
	//*  29   63:aload_0         
	//*  30   64:aload_0         
	//*  31   65:getfield        #59  <Field DataSource baseDataSource>
	//*  32   68:putfield        #117 <Field DataSource rtmpDataSource>
	//*  33   71:aload_0         
	//*  34   72:getfield        #117 <Field DataSource rtmpDataSource>
	//*  35   75:areturn         
			// Misplaced declaration of an exception variable
			catch(ClassNotFoundException classnotfoundexception)
			{
				Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
			}
			catch(Exception exception)
			{
				throw new RuntimeException("Error instantiating RTMP extension", ((Throwable) (exception)));
			}
			if(rtmpDataSource == null)
				rtmpDataSource = baseDataSource;
		}
		return rtmpDataSource;
	//*  36   76:astore_1        
	//*  37   77:goto            48
	}

	public void close()
		throws IOException
	{
		if(dataSource == null)
			break MISSING_BLOCK_LABEL_30;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field DataSource dataSource>
	//    2    4:ifnull          30
		dataSource.close();
	//    3    7:aload_0         
	//    4    8:getfield        #155 <Field DataSource dataSource>
	//    5   11:invokeinterface #157 <Method void DataSource.close()>
		dataSource = null;
	//    6   16:aload_0         
	//    7   17:aconst_null     
	//    8   18:putfield        #155 <Field DataSource dataSource>
		return;
	//    9   21:return          
		Exception exception;
		exception;
	//   10   22:astore_1        
		dataSource = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #155 <Field DataSource dataSource>
		throw exception;
	//   14   28:aload_1         
	//   15   29:athrow          
	//   16   30:return          
	}

	public Uri getUri()
	{
		if(dataSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field DataSource dataSource>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return dataSource.getUri();
	//    5    9:aload_0         
	//    6   10:getfield        #155 <Field DataSource dataSource>
	//    7   13:invokeinterface #162 <Method Uri DataSource.getUri()>
	//    8   18:areturn         
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		boolean flag;
		if(dataSource == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #155 <Field DataSource dataSource>
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
	//    9   15:invokestatic    #168 <Method void Assertions.checkState(boolean)>
		String s = dataspec.uri.getScheme();
	//   10   18:aload_1         
	//   11   19:getfield        #174 <Field Uri DataSpec.uri>
	//   12   22:invokevirtual   #180 <Method String Uri.getScheme()>
	//   13   25:astore_3        
		if(Util.isLocalFileUri(dataspec.uri))
	//*  14   26:aload_1         
	//*  15   27:getfield        #174 <Field Uri DataSpec.uri>
	//*  16   30:invokestatic    #186 <Method boolean Util.isLocalFileUri(Uri)>
	//*  17   33:ifeq            73
		{
			if(dataspec.uri.getPath().startsWith("/android_asset/"))
	//*  18   36:aload_1         
	//*  19   37:getfield        #174 <Field Uri DataSpec.uri>
	//*  20   40:invokevirtual   #189 <Method String Uri.getPath()>
	//*  21   43:ldc1            #191 <String "/android_asset/">
	//*  22   45:invokevirtual   #197 <Method boolean String.startsWith(String)>
	//*  23   48:ifeq            62
				dataSource = getAssetDataSource();
	//   24   51:aload_0         
	//   25   52:aload_0         
	//   26   53:invokespecial   #199 <Method DataSource getAssetDataSource()>
	//   27   56:putfield        #155 <Field DataSource dataSource>
			else
	//*  28   59:goto            181
				dataSource = getFileDataSource();
	//   29   62:aload_0         
	//   30   63:aload_0         
	//   31   64:invokespecial   #201 <Method DataSource getFileDataSource()>
	//   32   67:putfield        #155 <Field DataSource dataSource>
		} else
	//*  33   70:goto            181
		if("asset".equals(((Object) (s))))
	//*  34   73:ldc1            #10  <String "asset">
	//*  35   75:aload_3         
	//*  36   76:invokevirtual   #205 <Method boolean String.equals(Object)>
	//*  37   79:ifeq            93
			dataSource = getAssetDataSource();
	//   38   82:aload_0         
	//   39   83:aload_0         
	//   40   84:invokespecial   #199 <Method DataSource getAssetDataSource()>
	//   41   87:putfield        #155 <Field DataSource dataSource>
		else
	//*  42   90:goto            181
		if("content".equals(((Object) (s))))
	//*  43   93:ldc1            #13  <String "content">
	//*  44   95:aload_3         
	//*  45   96:invokevirtual   #205 <Method boolean String.equals(Object)>
	//*  46   99:ifeq            113
			dataSource = getContentDataSource();
	//   47  102:aload_0         
	//   48  103:aload_0         
	//   49  104:invokespecial   #207 <Method DataSource getContentDataSource()>
	//   50  107:putfield        #155 <Field DataSource dataSource>
		else
	//*  51  110:goto            181
		if("rtmp".equals(((Object) (s))))
	//*  52  113:ldc1            #19  <String "rtmp">
	//*  53  115:aload_3         
	//*  54  116:invokevirtual   #205 <Method boolean String.equals(Object)>
	//*  55  119:ifeq            133
			dataSource = getRtmpDataSource();
	//   56  122:aload_0         
	//   57  123:aload_0         
	//   58  124:invokespecial   #209 <Method DataSource getRtmpDataSource()>
	//   59  127:putfield        #155 <Field DataSource dataSource>
		else
	//*  60  130:goto            181
		if("data".equals(((Object) (s))))
	//*  61  133:ldc1            #211 <String "data">
	//*  62  135:aload_3         
	//*  63  136:invokevirtual   #205 <Method boolean String.equals(Object)>
	//*  64  139:ifeq            153
			dataSource = getDataSchemeDataSource();
	//   65  142:aload_0         
	//   66  143:aload_0         
	//   67  144:invokespecial   #213 <Method DataSource getDataSchemeDataSource()>
	//   68  147:putfield        #155 <Field DataSource dataSource>
		else
	//*  69  150:goto            181
		if("rawresource".equals(((Object) (s))))
	//*  70  153:ldc1            #16  <String "rawresource">
	//*  71  155:aload_3         
	//*  72  156:invokevirtual   #205 <Method boolean String.equals(Object)>
	//*  73  159:ifeq            173
			dataSource = getRawResourceDataSource();
	//   74  162:aload_0         
	//   75  163:aload_0         
	//   76  164:invokespecial   #215 <Method DataSource getRawResourceDataSource()>
	//   77  167:putfield        #155 <Field DataSource dataSource>
		else
	//*  78  170:goto            181
			dataSource = baseDataSource;
	//   79  173:aload_0         
	//   80  174:aload_0         
	//   81  175:getfield        #59  <Field DataSource baseDataSource>
	//   82  178:putfield        #155 <Field DataSource dataSource>
		return dataSource.open(dataspec);
	//   83  181:aload_0         
	//   84  182:getfield        #155 <Field DataSource dataSource>
	//   85  185:aload_1         
	//   86  186:invokeinterface #217 <Method long DataSource.open(DataSpec)>
	//   87  191:lreturn         
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		return dataSource.read(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field DataSource dataSource>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #221 <Method int DataSource.read(byte[], int, int)>
	//    6   12:ireturn         
	}

	private static final String SCHEME_ASSET = "asset";
	private static final String SCHEME_CONTENT = "content";
	private static final String SCHEME_RAW = "rawresource";
	private static final String SCHEME_RTMP = "rtmp";
	private static final String TAG = "DefaultDataSource";
	private DataSource assetDataSource;
	private final DataSource baseDataSource;
	private DataSource contentDataSource;
	private final Context context;
	private DataSource dataSchemeDataSource;
	private DataSource dataSource;
	private DataSource fileDataSource;
	private final TransferListener listener;
	private DataSource rawResourceDataSource;
	private DataSource rtmpDataSource;
}
