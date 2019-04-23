// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer.util.Predicate;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			UriDataSource, DataSpec

public interface HttpDataSource
	extends UriDataSource
{
	public static class HttpDataSourceException extends IOException
	{

		public static final int TYPE_CLOSE = 3;
		public static final int TYPE_OPEN = 1;
		public static final int TYPE_READ = 2;
		public final DataSpec dataSpec;
		public final int type;

		public HttpDataSourceException(DataSpec dataspec, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void IOException()>
			dataSpec = dataspec;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field DataSpec dataSpec>
			type = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #26  <Field int type>
		//    8   14:return          
		}

		public HttpDataSourceException(IOException ioexception, DataSpec dataspec, int i)
		{
			super(((Throwable) (ioexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #31  <Method void IOException(Throwable)>
			dataSpec = dataspec;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #24  <Field DataSpec dataSpec>
			type = i;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #26  <Field int type>
		//    9   15:return          
		}

		public HttpDataSourceException(String s, DataSpec dataspec, int i)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #35  <Method void IOException(String)>
			dataSpec = dataspec;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #24  <Field DataSpec dataSpec>
			type = i;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #26  <Field int type>
		//    9   15:return          
		}

		public HttpDataSourceException(String s, IOException ioexception, DataSpec dataspec, int i)
		{
			super(s, ((Throwable) (ioexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #39  <Method void IOException(String, Throwable)>
			dataSpec = dataspec;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #24  <Field DataSpec dataSpec>
			type = i;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #26  <Field int type>
		//   10   17:return          
		}
	}

	public static final class InvalidContentTypeException extends HttpDataSourceException
	{

		public final String contentType;

		public InvalidContentTypeException(String s, DataSpec dataspec)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #13  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void StringBuilder()>
		//    3    7:astore_3        
			stringbuilder.append("Invalid content type: ");
		//    4    8:aload_3         
		//    5    9:ldc1            #18  <String "Invalid content type: ">
		//    6   11:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_3         
		//    9   16:aload_1         
		//   10   17:invokevirtual   #22  <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			super(stringbuilder.toString(), dataspec, 1);
		//   12   21:aload_0         
		//   13   22:aload_3         
		//   14   23:invokevirtual   #26  <Method String StringBuilder.toString()>
		//   15   26:aload_2         
		//   16   27:iconst_1        
		//   17   28:invokespecial   #29  <Method void HttpDataSource$HttpDataSourceException(String, DataSpec, int)>
			contentType = s;
		//   18   31:aload_0         
		//   19   32:aload_1         
		//   20   33:putfield        #31  <Field String contentType>
		//   21   36:return          
		}
	}

	public static final class InvalidResponseCodeException extends HttpDataSourceException
	{

		public final Map headerFields;
		public final int responseCode;

		public InvalidResponseCodeException(int i, Map map, DataSpec dataspec)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #16  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void StringBuilder()>
		//    3    7:astore          4
			stringbuilder.append("Response code: ");
		//    4    9:aload           4
		//    5   11:ldc1            #21  <String "Response code: ">
		//    6   13:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			stringbuilder.append(i);
		//    8   17:aload           4
		//    9   19:iload_1         
		//   10   20:invokevirtual   #28  <Method StringBuilder StringBuilder.append(int)>
		//   11   23:pop             
			super(stringbuilder.toString(), dataspec, 1);
		//   12   24:aload_0         
		//   13   25:aload           4
		//   14   27:invokevirtual   #32  <Method String StringBuilder.toString()>
		//   15   30:aload_3         
		//   16   31:iconst_1        
		//   17   32:invokespecial   #35  <Method void HttpDataSource$HttpDataSourceException(String, DataSpec, int)>
			responseCode = i;
		//   18   35:aload_0         
		//   19   36:iload_1         
		//   20   37:putfield        #37  <Field int responseCode>
			headerFields = map;
		//   21   40:aload_0         
		//   22   41:aload_2         
		//   23   42:putfield        #39  <Field Map headerFields>
		//   24   45:return          
		}
	}


	public abstract void clearAllRequestProperties();

	public abstract void clearRequestProperty(String s);

	public abstract void close()
		throws HttpDataSourceException;

	public abstract Map getResponseHeaders();

	public abstract long open(DataSpec dataspec)
		throws HttpDataSourceException;

	public abstract int read(byte abyte0[], int i, int j)
		throws HttpDataSourceException;

	public abstract void setRequestProperty(String s, String s1);

	public static final Predicate REJECT_PAYWALL_TYPES = new Predicate() {

		public volatile boolean evaluate(Object obj)
		{
			return evaluate((String)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class String>
		//    3    5:invokevirtual   #21  <Method boolean evaluate(String)>
		//    4    8:ireturn         
		}

		public boolean evaluate(String s)
		{
			s = Util.toLowerInvariant(s);
		//    0    0:aload_1         
		//    1    1:invokestatic    #27  <Method String Util.toLowerInvariant(String)>
		//    2    4:astore_1        
			return !TextUtils.isEmpty(((CharSequence) (s))) && (!s.contains("text") || s.contains("text/vtt")) && !s.contains("html") && !s.contains("xml");
		//    3    5:aload_1         
		//    4    6:invokestatic    #33  <Method boolean TextUtils.isEmpty(CharSequence)>
		//    5    9:ifne            50
		//    6   12:aload_1         
		//    7   13:ldc1            #35  <String "text">
		//    8   15:invokevirtual   #38  <Method boolean String.contains(CharSequence)>
		//    9   18:ifeq            30
		//   10   21:aload_1         
		//   11   22:ldc1            #40  <String "text/vtt">
		//   12   24:invokevirtual   #38  <Method boolean String.contains(CharSequence)>
		//   13   27:ifeq            50
		//   14   30:aload_1         
		//   15   31:ldc1            #42  <String "html">
		//   16   33:invokevirtual   #38  <Method boolean String.contains(CharSequence)>
		//   17   36:ifne            50
		//   18   39:aload_1         
		//   19   40:ldc1            #44  <String "xml">
		//   20   42:invokevirtual   #38  <Method boolean String.contains(CharSequence)>
		//   21   45:ifne            50
		//   22   48:iconst_1        
		//   23   49:ireturn         
		//   24   50:iconst_0        
		//   25   51:ireturn         
		}

	}
;

	/* static  */
	/* { */
	//    0    0:new             #8   <Class HttpDataSource$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void HttpDataSource$1()>
	//    3    7:putstatic       #27  <Field Predicate REJECT_PAYWALL_TYPES>
	//*   4   10:return          
	/* } */
}
