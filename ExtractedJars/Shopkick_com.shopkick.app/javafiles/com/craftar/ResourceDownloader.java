// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.os.HandlerThread;
import java.io.*;
import java.net.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

// Referenced classes of package com.craftar:
//			CLog

class ResourceDownloader extends HandlerThread
	implements Runnable
{
	static interface DownloadProgressHandler
	{

		public abstract void onDownloadFinished(int i, int j, URL url, boolean flag);

		public abstract void onDownloadProgress(int i, int j);

		public abstract void onFileSizeDetermined(int i, long l);
	}


	public ResourceDownloader(int i, int j, URL url, String s, DownloadProgressHandler downloadprogresshandler)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append("ResourceDownloader");
	//    4    9:aload           6
	//    5   11:ldc1            #42  <String "ResourceDownloader">
	//    6   13:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(j);
	//    8   17:aload           6
	//    9   19:iload_2         
	//   10   20:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		super(stringbuilder.toString());
	//   12   24:aload_0         
	//   13   25:aload           6
	//   14   27:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   15   30:invokespecial   #56  <Method void HandlerThread(String)>
		streamLength = 0L;
	//   16   33:aload_0         
	//   17   34:lconst_0        
	//   18   35:putfield        #58  <Field long streamLength>
		data = new byte[1024];
	//   19   38:aload_0         
	//   20   39:sipush          1024
	//   21   42:newarray        byte[]
	//   22   44:putfield        #60  <Field byte[] data>
		mStoreDecompressed = true;
	//   23   47:aload_0         
	//   24   48:iconst_1        
	//   25   49:putfield        #62  <Field boolean mStoreDecompressed>
		mIsCachingEnabled = true;
	//   26   52:aload_0         
	//   27   53:iconst_1        
	//   28   54:putfield        #64  <Field boolean mIsCachingEnabled>
		mID = j;
	//   29   57:aload_0         
	//   30   58:iload_2         
	//   31   59:putfield        #66  <Field int mID>
		mLabel = i;
	//   32   62:aload_0         
	//   33   63:iload_1         
	//   34   64:putfield        #68  <Field int mLabel>
		mResourceURL = url;
	//   35   67:aload_0         
	//   36   68:aload_3         
	//   37   69:putfield        #70  <Field URL mResourceURL>
		mHandler = downloadprogresshandler;
	//   38   72:aload_0         
	//   39   73:aload           5
	//   40   75:putfield        #72  <Field ResourceDownloader$DownloadProgressHandler mHandler>
		mOutputPath = s;
	//   41   78:aload_0         
	//   42   79:aload           4
	//   43   81:putfield        #74  <Field String mOutputPath>
	//   44   84:return          
	}

	private void dumpHeaders(URLConnection urlconnection, String s)
		throws Exception
	{
		int j = urlconnection.getContentLength();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #85  <Method int URLConnection.getContentLength()>
	//    2    4:istore          4
		int i = j;
	//    3    6:iload           4
	//    4    8:istore_3        
		if(j == -1)
	//*   5    9:iload           4
	//*   6   11:iconst_m1       
	//*   7   12:icmpne          54
		{
			CLog.d("Content length not available in server, requesting it with a HEAD petition");
	//    8   15:ldc1            #87  <String "Content length not available in server, requesting it with a HEAD petition">
	//    9   17:invokestatic    #92  <Method void CLog.d(String)>
			HttpURLConnection httpurlconnection = (HttpURLConnection)mResourceURL.openConnection();
	//   10   20:aload_0         
	//   11   21:getfield        #70  <Field URL mResourceURL>
	//   12   24:invokevirtual   #98  <Method URLConnection URL.openConnection()>
	//   13   27:checkcast       #100 <Class HttpURLConnection>
	//   14   30:astore          7
			httpurlconnection.setRequestMethod("HEAD");
	//   15   32:aload           7
	//   16   34:ldc1            #102 <String "HEAD">
	//   17   36:invokevirtual   #105 <Method void HttpURLConnection.setRequestMethod(String)>
			httpurlconnection.setRequestProperty("Accept-encoding", "");
	//   18   39:aload           7
	//   19   41:ldc1            #107 <String "Accept-encoding">
	//   20   43:ldc1            #109 <String "">
	//   21   45:invokevirtual   #113 <Method void HttpURLConnection.setRequestProperty(String, String)>
			i = httpurlconnection.getContentLength();
	//   22   48:aload           7
	//   23   50:invokevirtual   #114 <Method int HttpURLConnection.getContentLength()>
	//   24   53:istore_3        
		}
		long l = urlconnection.getLastModified();
	//   25   54:aload_1         
	//   26   55:invokevirtual   #118 <Method long URLConnection.getLastModified()>
	//   27   58:lstore          5
		urlconnection = ((URLConnection) (new JSONObject()));
	//   28   60:new             #120 <Class JSONObject>
	//   29   63:dup             
	//   30   64:invokespecial   #121 <Method void JSONObject()>
	//   31   67:astore_1        
		((JSONObject) (urlconnection)).put("content-length", i);
	//   32   68:aload_1         
	//   33   69:ldc1            #16  <String "content-length">
	//   34   71:iload_3         
	//   35   72:invokevirtual   #125 <Method JSONObject JSONObject.put(String, int)>
	//   36   75:pop             
		((JSONObject) (urlconnection)).put("last-modified", l);
	//   37   76:aload_1         
	//   38   77:ldc1            #19  <String "last-modified">
	//   39   79:lload           5
	//   40   81:invokevirtual   #128 <Method JSONObject JSONObject.put(String, long)>
	//   41   84:pop             
		s = ((String) (new FileWriter(new File(s))));
	//   42   85:new             #130 <Class FileWriter>
	//   43   88:dup             
	//   44   89:new             #132 <Class File>
	//   45   92:dup             
	//   46   93:aload_2         
	//   47   94:invokespecial   #133 <Method void File(String)>
	//   48   97:invokespecial   #136 <Method void FileWriter(File)>
	//   49  100:astore_2        
		((FileWriter) (s)).write(((JSONObject) (urlconnection)).toString());
	//   50  101:aload_2         
	//   51  102:aload_1         
	//   52  103:invokevirtual   #137 <Method String JSONObject.toString()>
	//   53  106:invokevirtual   #140 <Method void FileWriter.write(String)>
		((FileWriter) (s)).close();
	//   54  109:aload_2         
	//   55  110:invokevirtual   #143 <Method void FileWriter.close()>
	//   56  113:return          
	}

	private boolean isDownloadNeeded(URL url, String s, long l)
	{
		long l1;
		long l2;
		long l3;
		Object obj;
		url = ((URL) (url.openConnection()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #98  <Method URLConnection URL.openConnection()>
	//    2    4:astore_1        
		((URLConnection) (url)).connect();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #149 <Method void URLConnection.connect()>
		((URLConnection) (url)).getHeaderFields();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #153 <Method java.util.Map URLConnection.getHeaderFields()>
	//    7   13:pop             
		obj = ((Object) (new StringBuilder()));
	//    8   14:new             #37  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #40  <Method void StringBuilder()>
	//   11   21:astore          11
		((StringBuilder) (obj)).append(s);
	//   12   23:aload           11
	//   13   25:aload_2         
	//   14   26:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		((StringBuilder) (obj)).append(".info");
	//   16   30:aload           11
	//   17   32:ldc1            #155 <String ".info">
	//   18   34:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   20   38:aload           11
	//   21   40:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   22   43:astore          11
		l1 = ((URLConnection) (url)).getLastModified();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #118 <Method long URLConnection.getLastModified()>
	//   25   49:lstore          5
		File file = new File(((String) (obj)));
	//   26   51:new             #132 <Class File>
	//   27   54:dup             
	//   28   55:aload           11
	//   29   57:invokespecial   #133 <Method void File(String)>
	//   30   60:astore          12
		if(!file.exists())
			break MISSING_BLOCK_LABEL_154;
	//   31   62:aload           12
	//   32   64:invokevirtual   #159 <Method boolean File.exists()>
	//   33   67:ifeq            154
		url = ((URL) (new FileInputStream(file)));
	//   34   70:new             #161 <Class FileInputStream>
	//   35   73:dup             
	//   36   74:aload           12
	//   37   76:invokespecial   #162 <Method void FileInputStream(File)>
	//   38   79:astore_1        
		obj = ((Object) (new byte[((FileInputStream) (url)).available()]));
	//   39   80:aload_1         
	//   40   81:invokevirtual   #165 <Method int FileInputStream.available()>
	//   41   84:newarray        byte[]
	//   42   86:astore          11
		((FileInputStream) (url)).read(((byte []) (obj)));
	//   43   88:aload_1         
	//   44   89:aload           11
	//   45   91:invokevirtual   #169 <Method int FileInputStream.read(byte[])>
	//   46   94:pop             
		((FileInputStream) (url)).close();
	//   47   95:aload_1         
	//   48   96:invokevirtual   #170 <Method void FileInputStream.close()>
		l2 = (new JSONObject(new String(((byte []) (obj)), "UTF-8"))).getLong("last-modified");
	//   49   99:new             #120 <Class JSONObject>
	//   50  102:dup             
	//   51  103:new             #172 <Class String>
	//   52  106:dup             
	//   53  107:aload           11
	//   54  109:ldc1            #174 <String "UTF-8">
	//   55  111:invokespecial   #177 <Method void String(byte[], String)>
	//   56  114:invokespecial   #178 <Method void JSONObject(String)>
	//   57  117:ldc1            #19  <String "last-modified">
	//   58  119:invokevirtual   #182 <Method long JSONObject.getLong(String)>
	//   59  122:lstore          7
		l3 = (new File(s)).length();
	//   60  124:new             #132 <Class File>
	//   61  127:dup             
	//   62  128:aload_2         
	//   63  129:invokespecial   #133 <Method void File(String)>
	//   64  132:invokevirtual   #185 <Method long File.length()>
	//   65  135:lstore          9
		if(l1 == l2 && l == l3)
	//*  66  137:lload           5
	//*  67  139:lload           7
	//*  68  141:lcmp            
	//*  69  142:ifne            169
	//*  70  145:lload_3         
	//*  71  146:lload           9
	//*  72  148:lcmp            
	//*  73  149:ifne            169
			return false;
	//   74  152:iconst_0        
	//   75  153:ireturn         
		break MISSING_BLOCK_LABEL_169;
		try
		{
			dumpHeaders(((URLConnection) (url)), ((String) (obj)));
	//   76  154:aload_0         
	//   77  155:aload_1         
	//   78  156:aload           11
	//   79  158:invokespecial   #187 <Method void dumpHeaders(URLConnection, String)>
		}
	//*  80  161:goto            169
		// Misplaced declaration of an exception variable
		catch(URL url)
	//*  81  164:astore_1        
		{
			((Exception) (url)).printStackTrace();
	//   82  165:aload_1         
	//   83  166:invokevirtual   #190 <Method void Exception.printStackTrace()>
		}
		return true;
	//   84  169:iconst_1        
	//   85  170:ireturn         
	}

	public void computeSize()
		throws IOException
	{
		Object obj = ((Object) (mResourceURL.openConnection()));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field URL mResourceURL>
	//    2    4:invokevirtual   #98  <Method URLConnection URL.openConnection()>
	//    3    7:astore_1        
		((URLConnection) (obj)).addRequestProperty("Accept-encoding", "gzip");
	//    4    8:aload_1         
	//    5    9:ldc1            #107 <String "Accept-encoding">
	//    6   11:ldc1            #195 <String "gzip">
	//    7   13:invokevirtual   #198 <Method void URLConnection.addRequestProperty(String, String)>
		((URLConnection) (obj)).getHeaderFields();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #153 <Method java.util.Map URLConnection.getHeaderFields()>
	//   10   20:pop             
		streamLength = ((URLConnection) (obj)).getContentLength();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #85  <Method int URLConnection.getContentLength()>
	//   14   26:i2l             
	//   15   27:putfield        #58  <Field long streamLength>
		if(streamLength == -1L)
	//*  16   30:aload_0         
	//*  17   31:getfield        #58  <Field long streamLength>
	//*  18   34:ldc2w           #199 <Long -1L>
	//*  19   37:lcmp            
	//*  20   38:ifne            135
		{
			CLog.d("Content length not available in server, requesting it with a HEAD petition");
	//   21   41:ldc1            #87  <String "Content length not available in server, requesting it with a HEAD petition">
	//   22   43:invokestatic    #92  <Method void CLog.d(String)>
			obj = ((Object) ((HttpURLConnection)mResourceURL.openConnection()));
	//   23   46:aload_0         
	//   24   47:getfield        #70  <Field URL mResourceURL>
	//   25   50:invokevirtual   #98  <Method URLConnection URL.openConnection()>
	//   26   53:checkcast       #100 <Class HttpURLConnection>
	//   27   56:astore_1        
			((HttpURLConnection) (obj)).setRequestMethod("HEAD");
	//   28   57:aload_1         
	//   29   58:ldc1            #102 <String "HEAD">
	//   30   60:invokevirtual   #105 <Method void HttpURLConnection.setRequestMethod(String)>
			((HttpURLConnection) (obj)).setRequestProperty("Accept-encoding", "");
	//   31   63:aload_1         
	//   32   64:ldc1            #107 <String "Accept-encoding">
	//   33   66:ldc1            #109 <String "">
	//   34   68:invokevirtual   #113 <Method void HttpURLConnection.setRequestProperty(String, String)>
			streamLength = ((HttpURLConnection) (obj)).getContentLength();
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #114 <Method int HttpURLConnection.getContentLength()>
	//   38   76:i2l             
	//   39   77:putfield        #58  <Field long streamLength>
			if(streamLength == -1L)
	//*  40   80:aload_0         
	//*  41   81:getfield        #58  <Field long streamLength>
	//*  42   84:ldc2w           #199 <Long -1L>
	//*  43   87:lcmp            
	//*  44   88:ifne            104
			{
				CLog.w("Content length not available");
	//   45   91:ldc1            #202 <String "Content length not available">
	//   46   93:invokestatic    #205 <Method void CLog.w(String)>
				streamLength = 0L;
	//   47   96:aload_0         
	//   48   97:lconst_0        
	//   49   98:putfield        #58  <Field long streamLength>
			} else
	//*  50  101:goto            135
			{
				obj = ((Object) (new StringBuilder()));
	//   51  104:new             #37  <Class StringBuilder>
	//   52  107:dup             
	//   53  108:invokespecial   #40  <Method void StringBuilder()>
	//   54  111:astore_1        
				((StringBuilder) (obj)).append("Content length in HEAD petition:");
	//   55  112:aload_1         
	//   56  113:ldc1            #207 <String "Content length in HEAD petition:">
	//   57  115:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   58  118:pop             
				((StringBuilder) (obj)).append(streamLength);
	//   59  119:aload_1         
	//   60  120:aload_0         
	//   61  121:getfield        #58  <Field long streamLength>
	//   62  124:invokevirtual   #210 <Method StringBuilder StringBuilder.append(long)>
	//   63  127:pop             
				CLog.d(((StringBuilder) (obj)).toString());
	//   64  128:aload_1         
	//   65  129:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   66  132:invokestatic    #92  <Method void CLog.d(String)>
			}
		}
		obj = ((Object) (new StringBuilder()));
	//   67  135:new             #37  <Class StringBuilder>
	//   68  138:dup             
	//   69  139:invokespecial   #40  <Method void StringBuilder()>
	//   70  142:astore_1        
		((StringBuilder) (obj)).append("Ready to download file with size ");
	//   71  143:aload_1         
	//   72  144:ldc1            #212 <String "Ready to download file with size ">
	//   73  146:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   74  149:pop             
		((StringBuilder) (obj)).append(streamLength);
	//   75  150:aload_1         
	//   76  151:aload_0         
	//   77  152:getfield        #58  <Field long streamLength>
	//   78  155:invokevirtual   #210 <Method StringBuilder StringBuilder.append(long)>
	//   79  158:pop             
		((StringBuilder) (obj)).append(" : ");
	//   80  159:aload_1         
	//   81  160:ldc1            #214 <String " : ">
	//   82  162:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   83  165:pop             
		((StringBuilder) (obj)).append(mResourceURL.toString());
	//   84  166:aload_1         
	//   85  167:aload_0         
	//   86  168:getfield        #70  <Field URL mResourceURL>
	//   87  171:invokevirtual   #215 <Method String URL.toString()>
	//   88  174:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   89  177:pop             
		((StringBuilder) (obj)).append(" to :");
	//   90  178:aload_1         
	//   91  179:ldc1            #217 <String " to :">
	//   92  181:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   93  184:pop             
		((StringBuilder) (obj)).append(mOutputPath);
	//   94  185:aload_1         
	//   95  186:aload_0         
	//   96  187:getfield        #74  <Field String mOutputPath>
	//   97  190:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   98  193:pop             
		CLog.d(((StringBuilder) (obj)).toString());
	//   99  194:aload_1         
	//  100  195:invokevirtual   #53  <Method String StringBuilder.toString()>
	//  101  198:invokestatic    #92  <Method void CLog.d(String)>
		mHandler.onFileSizeDetermined(mID, streamLength);
	//  102  201:aload_0         
	//  103  202:getfield        #72  <Field ResourceDownloader$DownloadProgressHandler mHandler>
	//  104  205:aload_0         
	//  105  206:getfield        #66  <Field int mID>
	//  106  209:aload_0         
	//  107  210:getfield        #58  <Field long streamLength>
	//  108  213:invokeinterface #221 <Method void ResourceDownloader$DownloadProgressHandler.onFileSizeDetermined(int, long)>
	//  109  218:return          
	}

	public void setCachingEnabled(boolean flag)
	{
		mIsCachingEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field boolean mIsCachingEnabled>
	//    3    5:return          
	}

	public void setStoreUncompressed(boolean flag)
	{
		mStoreDecompressed = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean mStoreDecompressed>
	//    3    5:return          
	}

	public void startDownloading()
		throws IOException
	{
		boolean flag;
		Object obj1;
		boolean flag1 = mIsCachingEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean mIsCachingEnabled>
	//    2    4:istore_3        
		flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(flag1 && !isDownloadNeeded(mResourceURL, mOutputPath, streamLength))
	//*   5    7:iload_3         
	//*   6    8:ifeq            53
	//*   7   11:aload_0         
	//*   8   12:aload_0         
	//*   9   13:getfield        #70  <Field URL mResourceURL>
	//*  10   16:aload_0         
	//*  11   17:getfield        #74  <Field String mOutputPath>
	//*  12   20:aload_0         
	//*  13   21:getfield        #58  <Field long streamLength>
	//*  14   24:invokespecial   #229 <Method boolean isDownloadNeeded(URL, String, long)>
	//*  15   27:ifne            53
		{
			mHandler.onDownloadFinished(mLabel, mID, mResourceURL, true);
	//   16   30:aload_0         
	//   17   31:getfield        #72  <Field ResourceDownloader$DownloadProgressHandler mHandler>
	//   18   34:aload_0         
	//   19   35:getfield        #68  <Field int mLabel>
	//   20   38:aload_0         
	//   21   39:getfield        #66  <Field int mID>
	//   22   42:aload_0         
	//   23   43:getfield        #70  <Field URL mResourceURL>
	//   24   46:iconst_1        
	//   25   47:invokeinterface #233 <Method void ResourceDownloader$DownloadProgressHandler.onDownloadFinished(int, int, URL, boolean)>
			return;
	//   26   52:return          
		}
		obj1 = null;
	//   27   53:aconst_null     
	//   28   54:astore          5
		URLConnection urlconnection = mResourceURL.openConnection();
	//   29   56:aload_0         
	//   30   57:getfield        #70  <Field URL mResourceURL>
	//   31   60:invokevirtual   #98  <Method URLConnection URL.openConnection()>
	//   32   63:astore          6
		urlconnection.addRequestProperty("Accept-encoding", "gzip");
	//   33   65:aload           6
	//   34   67:ldc1            #107 <String "Accept-encoding">
	//   35   69:ldc1            #195 <String "gzip">
	//   36   71:invokevirtual   #198 <Method void URLConnection.addRequestProperty(String, String)>
		String s = urlconnection.getHeaderField("Content-Type");
	//   37   74:aload           6
	//   38   76:ldc1            #235 <String "Content-Type">
	//   39   78:invokevirtual   #239 <Method String URLConnection.getHeaderField(String)>
	//   40   81:astore          7
		Object obj = obj1;
	//   41   83:aload           5
	//   42   85:astore          4
		if(mStoreDecompressed)
	//*  43   87:aload_0         
	//*  44   88:getfield        #62  <Field boolean mStoreDecompressed>
	//*  45   91:ifeq            219
			if(s != null && s.matches("application/zip"))
	//*  46   94:aload           7
	//*  47   96:ifnull          131
	//*  48   99:aload           7
	//*  49  101:ldc1            #241 <String "application/zip">
	//*  50  103:invokevirtual   #245 <Method boolean String.matches(String)>
	//*  51  106:ifeq            131
			{
				CLog.d("Creating ZIPInputStream");
	//   52  109:ldc1            #247 <String "Creating ZIPInputStream">
	//   53  111:invokestatic    #92  <Method void CLog.d(String)>
				obj = ((Object) (new ZipInputStream(urlconnection.getInputStream())));
	//   54  114:new             #249 <Class ZipInputStream>
	//   55  117:dup             
	//   56  118:aload           6
	//   57  120:invokevirtual   #253 <Method InputStream URLConnection.getInputStream()>
	//   58  123:invokespecial   #256 <Method void ZipInputStream(InputStream)>
	//   59  126:astore          4
			} else
	//*  60  128:goto            219
			if(s != null && s.matches("application/gzip"))
	//*  61  131:aload           7
	//*  62  133:ifnull          170
	//*  63  136:aload           7
	//*  64  138:ldc2            #258 <String "application/gzip">
	//*  65  141:invokevirtual   #245 <Method boolean String.matches(String)>
	//*  66  144:ifeq            170
			{
				CLog.d("Creating GZIPInputStream");
	//   67  147:ldc2            #260 <String "Creating GZIPInputStream">
	//   68  150:invokestatic    #92  <Method void CLog.d(String)>
				obj = ((Object) (new GZIPInputStream(urlconnection.getInputStream())));
	//   69  153:new             #262 <Class GZIPInputStream>
	//   70  156:dup             
	//   71  157:aload           6
	//   72  159:invokevirtual   #253 <Method InputStream URLConnection.getInputStream()>
	//   73  162:invokespecial   #263 <Method void GZIPInputStream(InputStream)>
	//   74  165:astore          4
			} else
	//*  75  167:goto            219
			{
				obj = obj1;
	//   76  170:aload           5
	//   77  172:astore          4
				if(urlconnection.getContentEncoding() != null)
	//*  78  174:aload           6
	//*  79  176:invokevirtual   #266 <Method String URLConnection.getContentEncoding()>
	//*  80  179:ifnull          219
				{
					obj = obj1;
	//   81  182:aload           5
	//   82  184:astore          4
					if(urlconnection.getContentEncoding().matches("gzip"))
	//*  83  186:aload           6
	//*  84  188:invokevirtual   #266 <Method String URLConnection.getContentEncoding()>
	//*  85  191:ldc1            #195 <String "gzip">
	//*  86  193:invokevirtual   #245 <Method boolean String.matches(String)>
	//*  87  196:ifeq            219
					{
						CLog.d("Creating GZIPInputStream");
	//   88  199:ldc2            #260 <String "Creating GZIPInputStream">
	//   89  202:invokestatic    #92  <Method void CLog.d(String)>
						obj = ((Object) (new GZIPInputStream(urlconnection.getInputStream())));
	//   90  205:new             #262 <Class GZIPInputStream>
	//   91  208:dup             
	//   92  209:aload           6
	//   93  211:invokevirtual   #253 <Method InputStream URLConnection.getInputStream()>
	//   94  214:invokespecial   #263 <Method void GZIPInputStream(InputStream)>
	//   95  217:astore          4
					}
				}
			}
		obj1 = obj;
	//   96  219:aload           4
	//   97  221:astore          5
		if(obj == null)
	//*  98  223:aload           4
	//*  99  225:ifnonnull       248
		{
			CLog.d("Creating BufferedInputStream");
	//  100  228:ldc2            #268 <String "Creating BufferedInputStream">
	//  101  231:invokestatic    #92  <Method void CLog.d(String)>
			obj1 = ((Object) (new BufferedInputStream(urlconnection.getInputStream())));
	//  102  234:new             #270 <Class BufferedInputStream>
	//  103  237:dup             
	//  104  238:aload           6
	//  105  240:invokevirtual   #253 <Method InputStream URLConnection.getInputStream()>
	//  106  243:invokespecial   #271 <Method void BufferedInputStream(InputStream)>
	//  107  246:astore          5
		}
		BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(mOutputPath))));
	//  108  248:new             #273 <Class BufferedOutputStream>
	//  109  251:dup             
	//  110  252:new             #275 <Class FileOutputStream>
	//  111  255:dup             
	//  112  256:aload_0         
	//  113  257:getfield        #74  <Field String mOutputPath>
	//  114  260:invokespecial   #276 <Method void FileOutputStream(String)>
	//  115  263:invokespecial   #279 <Method void BufferedOutputStream(java.io.OutputStream)>
	//  116  266:astore          4
_L1:
		int i = ((InputStream) (obj1)).read(data, 0, 1024);
	//  117  268:aload           5
	//  118  270:aload_0         
	//  119  271:getfield        #60  <Field byte[] data>
	//  120  274:iconst_0        
	//  121  275:sipush          1024
	//  122  278:invokevirtual   #284 <Method int InputStream.read(byte[], int, int)>
	//  123  281:istore_1        
		if(i < 0)
			break MISSING_BLOCK_LABEL_323;
	//  124  282:iload_1         
	//  125  283:iflt            323
		bufferedoutputstream.write(data, 0, i);
	//  126  286:aload           4
	//  127  288:aload_0         
	//  128  289:getfield        #60  <Field byte[] data>
	//  129  292:iconst_0        
	//  130  293:iload_1         
	//  131  294:invokevirtual   #287 <Method void BufferedOutputStream.write(byte[], int, int)>
		if(streamLength > 0L)
	//* 132  297:aload_0         
	//* 133  298:getfield        #58  <Field long streamLength>
	//* 134  301:lconst_0        
	//* 135  302:lcmp            
	//* 136  303:ifle            268
			mHandler.onDownloadProgress(mID, i);
	//  137  306:aload_0         
	//  138  307:getfield        #72  <Field ResourceDownloader$DownloadProgressHandler mHandler>
	//  139  310:aload_0         
	//  140  311:getfield        #66  <Field int mID>
	//  141  314:iload_1         
	//  142  315:invokeinterface #291 <Method void ResourceDownloader$DownloadProgressHandler.onDownloadProgress(int, int)>
		  goto _L1
	//* 143  320:goto            268
label0:
		{
			try
			{
				bufferedoutputstream.close();
	//  144  323:aload           4
	//  145  325:invokevirtual   #292 <Method void BufferedOutputStream.close()>
				((InputStream) (obj1)).close();
	//  146  328:aload           5
	//  147  330:invokevirtual   #293 <Method void InputStream.close()>
				break label0;
	//  148  333:goto            355
			}
	//* 149  336:astore          4
	//* 150  338:aload           4
	//* 151  340:invokevirtual   #190 <Method void Exception.printStackTrace()>
	//* 152  343:goto            353
			catch(MalformedURLException malformedurlexception)
	//* 153  346:astore          4
			{
				malformedurlexception.printStackTrace();
	//  154  348:aload           4
	//  155  350:invokevirtual   #294 <Method void MalformedURLException.printStackTrace()>
			}
			catch(Exception exception)
			{
				exception.printStackTrace();
			}
			flag = false;
	//  156  353:iconst_0        
	//  157  354:istore_2        
		}
		mHandler.onDownloadFinished(mLabel, mID, mResourceURL, flag);
	//  158  355:aload_0         
	//  159  356:getfield        #72  <Field ResourceDownloader$DownloadProgressHandler mHandler>
	//  160  359:aload_0         
	//  161  360:getfield        #68  <Field int mLabel>
	//  162  363:aload_0         
	//  163  364:getfield        #66  <Field int mID>
	//  164  367:aload_0         
	//  165  368:getfield        #70  <Field URL mResourceURL>
	//  166  371:iload_2         
	//  167  372:invokeinterface #233 <Method void ResourceDownloader$DownloadProgressHandler.onDownloadFinished(int, int, URL, boolean)>
		return;
	//  168  377:return          
	}

	private static final int CHUNK_SIZE = 1024;
	private static final String HEADER_CONTENT_LENGTH_KEY = "content-length";
	private static final String HEADER_LAST_MODIFIED_KEY = "last-modified";
	byte data[];
	private DownloadProgressHandler mHandler;
	private int mID;
	private boolean mIsCachingEnabled;
	private int mLabel;
	private String mOutputPath;
	private URL mResourceURL;
	private boolean mStoreDecompressed;
	private long streamLength;
}
