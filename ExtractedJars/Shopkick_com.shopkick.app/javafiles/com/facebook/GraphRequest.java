// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.*;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.*;
import java.net.*;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.*;

// Referenced classes of package com.facebook:
//			FacebookSdk, HttpMethod, AccessToken, LoggingBehavior, 
//			GraphResponse, FacebookException, GraphRequestBatch, GraphRequestAsyncTask, 
//			AccessTokenManager, ProgressNoopOutputStream, ProgressOutputStream, RequestOutputStream

public class GraphRequest
{
	private static class Attachment
	{

		public GraphRequest getRequest()
		{
			return request;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field GraphRequest request>
		//    2    4:areturn         
		}

		public Object getValue()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Object value>
		//    2    4:areturn         
		}

		private final GraphRequest request;
		private final Object value;

		public Attachment(GraphRequest graphrequest, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			request = graphrequest;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field GraphRequest request>
			value = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field Object value>
		//    8   14:return          
		}
	}

	public static interface Callback
	{

		public abstract void onCompleted(GraphResponse graphresponse);
	}

	public static interface GraphJSONArrayCallback
	{

		public abstract void onCompleted(JSONArray jsonarray, GraphResponse graphresponse);
	}

	public static interface GraphJSONObjectCallback
	{

		public abstract void onCompleted(JSONObject jsonobject, GraphResponse graphresponse);
	}

	private static interface KeyValueSerializer
	{

		public abstract void writeString(String s, String s1)
			throws IOException;
	}

	public static interface OnProgressCallback
		extends Callback
	{

		public abstract void onProgress(long l, long l1);
	}

	public static class ParcelableResourceWithMimeType
		implements Parcelable
	{

		public int describeContents()
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public String getMimeType()
		{
			return mimeType;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field String mimeType>
		//    2    4:areturn         
		}

		public Parcelable getResource()
		{
			return resource;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Parcelable resource>
		//    2    4:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeString(mimeType);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #38  <Field String mimeType>
		//    3    5:invokevirtual   #74  <Method void Parcel.writeString(String)>
			parcel.writeParcelable(resource, i);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #56  <Field Parcelable resource>
		//    7   13:iload_2         
		//    8   14:invokevirtual   #78  <Method void Parcel.writeParcelable(Parcelable, int)>
		//    9   17:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public ParcelableResourceWithMimeType createFromParcel(Parcel parcel)
			{
				return new ParcelableResourceWithMimeType(parcel);
			//    0    0:new             #9   <Class GraphRequest$ParcelableResourceWithMimeType>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void GraphRequest$ParcelableResourceWithMimeType(Parcel, GraphRequest$1)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method GraphRequest$ParcelableResourceWithMimeType createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public ParcelableResourceWithMimeType[] newArray(int i)
			{
				return new ParcelableResourceWithMimeType[i];
			//    0    0:iload_1         
			//    1    1:anewarray       ParcelableResourceWithMimeType[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method GraphRequest$ParcelableResourceWithMimeType[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		private final String mimeType;
		private final Parcelable resource;

		static 
		{
		//    0    0:new             #12  <Class GraphRequest$ParcelableResourceWithMimeType$1>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void GraphRequest$ParcelableResourceWithMimeType$1()>
		//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		private ParcelableResourceWithMimeType(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			mimeType = parcel.readString();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #36  <Method String Parcel.readString()>
		//    5    9:putfield        #38  <Field String mimeType>
			resource = parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokestatic    #44  <Method Context FacebookSdk.getApplicationContext()>
		//    9   17:invokevirtual   #50  <Method ClassLoader Context.getClassLoader()>
		//   10   20:invokevirtual   #54  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   11   23:putfield        #56  <Field Parcelable resource>
		//   12   26:return          
		}


		public ParcelableResourceWithMimeType(Parcelable parcelable, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			mimeType = s;
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:putfield        #38  <Field String mimeType>
			resource = parcelable;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #56  <Field Parcelable resource>
		//    8   14:return          
		}
	}

	private static class Serializer
		implements KeyValueSerializer
	{

		private RuntimeException getInvalidTypeError()
		{
			return ((RuntimeException) (new IllegalArgumentException("value is not a supported type.")));
		//    0    0:new             #34  <Class IllegalArgumentException>
		//    1    3:dup             
		//    2    4:ldc1            #36  <String "value is not a supported type.">
		//    3    6:invokespecial   #39  <Method void IllegalArgumentException(String)>
		//    4    9:areturn         
		}

		public transient void write(String s, Object aobj[])
			throws IOException
		{
			if(!useUrlEncode)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field boolean useUrlEncode>
		//*   2    4:ifne            72
			{
				if(firstWrite)
		//*   3    7:aload_0         
		//*   4    8:getfield        #23  <Field boolean firstWrite>
		//*   5   11:ifeq            56
				{
					outputStream.write("--".getBytes());
		//    6   14:aload_0         
		//    7   15:getfield        #27  <Field OutputStream outputStream>
		//    8   18:ldc1            #45  <String "--">
		//    9   20:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   10   23:invokevirtual   #56  <Method void OutputStream.write(byte[])>
					outputStream.write(GraphRequest.MIME_BOUNDARY.getBytes());
		//   11   26:aload_0         
		//   12   27:getfield        #27  <Field OutputStream outputStream>
		//   13   30:invokestatic    #60  <Method String GraphRequest.access$200()>
		//   14   33:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   15   36:invokevirtual   #56  <Method void OutputStream.write(byte[])>
					outputStream.write("\r\n".getBytes());
		//   16   39:aload_0         
		//   17   40:getfield        #27  <Field OutputStream outputStream>
		//   18   43:ldc1            #62  <String "\r\n">
		//   19   45:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   20   48:invokevirtual   #56  <Method void OutputStream.write(byte[])>
					firstWrite = false;
		//   21   51:aload_0         
		//   22   52:iconst_0        
		//   23   53:putfield        #23  <Field boolean firstWrite>
				}
				outputStream.write(String.format(s, aobj).getBytes());
		//   24   56:aload_0         
		//   25   57:getfield        #27  <Field OutputStream outputStream>
		//   26   60:aload_1         
		//   27   61:aload_2         
		//   28   62:invokestatic    #66  <Method String String.format(String, Object[])>
		//   29   65:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   30   68:invokevirtual   #56  <Method void OutputStream.write(byte[])>
				return;
		//   31   71:return          
			} else
			{
				outputStream.write(URLEncoder.encode(String.format(Locale.US, s, aobj), "UTF-8").getBytes());
		//   32   72:aload_0         
		//   33   73:getfield        #27  <Field OutputStream outputStream>
		//   34   76:getstatic       #72  <Field Locale Locale.US>
		//   35   79:aload_1         
		//   36   80:aload_2         
		//   37   81:invokestatic    #75  <Method String String.format(Locale, String, Object[])>
		//   38   84:ldc1            #77  <String "UTF-8">
		//   39   86:invokestatic    #83  <Method String URLEncoder.encode(String, String)>
		//   40   89:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   41   92:invokevirtual   #56  <Method void OutputStream.write(byte[])>
				return;
		//   42   95:return          
			}
		}

		public void writeBitmap(String s, Bitmap bitmap)
			throws IOException
		{
			writeContentDisposition(s, s, "image/png");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_1         
		//    3    3:ldc1            #88  <String "image/png">
		//    4    5:invokevirtual   #92  <Method void writeContentDisposition(String, String, String)>
			bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, outputStream);
		//    5    8:aload_2         
		//    6    9:getstatic       #98  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
		//    7   12:bipush          100
		//    8   14:aload_0         
		//    9   15:getfield        #27  <Field OutputStream outputStream>
		//   10   18:invokevirtual   #104 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, OutputStream)>
		//   11   21:pop             
			writeLine("", new Object[0]);
		//   12   22:aload_0         
		//   13   23:ldc1            #106 <String "">
		//   14   25:iconst_0        
		//   15   26:anewarray       Object[]
		//   16   29:invokevirtual   #109 <Method void writeLine(String, Object[])>
			writeRecordBoundary();
		//   17   32:aload_0         
		//   18   33:invokevirtual   #112 <Method void writeRecordBoundary()>
			bitmap = ((Bitmap) (logger));
		//   19   36:aload_0         
		//   20   37:getfield        #29  <Field Logger logger>
		//   21   40:astore_2        
			if(bitmap != null)
		//*  22   41:aload_2         
		//*  23   42:ifnull          76
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   24   45:new             #114 <Class StringBuilder>
		//   25   48:dup             
		//   26   49:invokespecial   #115 <Method void StringBuilder()>
		//   27   52:astore_3        
				stringbuilder.append("    ");
		//   28   53:aload_3         
		//   29   54:ldc1            #117 <String "    ">
		//   30   56:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   31   59:pop             
				stringbuilder.append(s);
		//   32   60:aload_3         
		//   33   61:aload_1         
		//   34   62:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   35   65:pop             
				((Logger) (bitmap)).appendKeyValue(stringbuilder.toString(), "<Image>");
		//   36   66:aload_2         
		//   37   67:aload_3         
		//   38   68:invokevirtual   #124 <Method String StringBuilder.toString()>
		//   39   71:ldc1            #126 <String "<Image>">
		//   40   73:invokevirtual   #132 <Method void Logger.appendKeyValue(String, Object)>
			}
		//   41   76:return          
		}

		public void writeBytes(String s, byte abyte0[])
			throws IOException
		{
			writeContentDisposition(s, s, "content/unknown");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_1         
		//    3    3:ldc1            #136 <String "content/unknown">
		//    4    5:invokevirtual   #92  <Method void writeContentDisposition(String, String, String)>
			outputStream.write(abyte0);
		//    5    8:aload_0         
		//    6    9:getfield        #27  <Field OutputStream outputStream>
		//    7   12:aload_2         
		//    8   13:invokevirtual   #56  <Method void OutputStream.write(byte[])>
			writeLine("", new Object[0]);
		//    9   16:aload_0         
		//   10   17:ldc1            #106 <String "">
		//   11   19:iconst_0        
		//   12   20:anewarray       Object[]
		//   13   23:invokevirtual   #109 <Method void writeLine(String, Object[])>
			writeRecordBoundary();
		//   14   26:aload_0         
		//   15   27:invokevirtual   #112 <Method void writeRecordBoundary()>
			Logger logger1 = logger;
		//   16   30:aload_0         
		//   17   31:getfield        #29  <Field Logger logger>
		//   18   34:astore_3        
			if(logger1 != null)
		//*  19   35:aload_3         
		//*  20   36:ifnull          92
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   21   39:new             #114 <Class StringBuilder>
		//   22   42:dup             
		//   23   43:invokespecial   #115 <Method void StringBuilder()>
		//   24   46:astore          4
				stringbuilder.append("    ");
		//   25   48:aload           4
		//   26   50:ldc1            #117 <String "    ">
		//   27   52:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   28   55:pop             
				stringbuilder.append(s);
		//   29   56:aload           4
		//   30   58:aload_1         
		//   31   59:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   32   62:pop             
				logger1.appendKeyValue(stringbuilder.toString(), ((Object) (String.format(Locale.ROOT, "<Data: %d>", new Object[] {
					Integer.valueOf(abyte0.length)
				}))));
		//   33   63:aload_3         
		//   34   64:aload           4
		//   35   66:invokevirtual   #124 <Method String StringBuilder.toString()>
		//   36   69:getstatic       #139 <Field Locale Locale.ROOT>
		//   37   72:ldc1            #141 <String "<Data: %d>">
		//   38   74:iconst_1        
		//   39   75:anewarray       Object[]
		//   40   78:dup             
		//   41   79:iconst_0        
		//   42   80:aload_2         
		//   43   81:arraylength     
		//   44   82:invokestatic    #147 <Method Integer Integer.valueOf(int)>
		//   45   85:aastore         
		//   46   86:invokestatic    #75  <Method String String.format(Locale, String, Object[])>
		//   47   89:invokevirtual   #132 <Method void Logger.appendKeyValue(String, Object)>
			}
		//   48   92:return          
		}

		public void writeContentDisposition(String s, String s1, String s2)
			throws IOException
		{
			if(!useUrlEncode)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field boolean useUrlEncode>
		//*   2    4:ifne            83
			{
				write("Content-Disposition: form-data; name=\"%s\"", new Object[] {
					s
				});
		//    3    7:aload_0         
		//    4    8:ldc1            #149 <String "Content-Disposition: form-data; name=\"%s\"">
		//    5   10:iconst_1        
		//    6   11:anewarray       Object[]
		//    7   14:dup             
		//    8   15:iconst_0        
		//    9   16:aload_1         
		//   10   17:aastore         
		//   11   18:invokevirtual   #151 <Method void write(String, Object[])>
				if(s1 != null)
		//*  12   21:aload_2         
		//*  13   22:ifnull          39
					write("; filename=\"%s\"", new Object[] {
						s1
					});
		//   14   25:aload_0         
		//   15   26:ldc1            #153 <String "; filename=\"%s\"">
		//   16   28:iconst_1        
		//   17   29:anewarray       Object[]
		//   18   32:dup             
		//   19   33:iconst_0        
		//   20   34:aload_2         
		//   21   35:aastore         
		//   22   36:invokevirtual   #151 <Method void write(String, Object[])>
				writeLine("", new Object[0]);
		//   23   39:aload_0         
		//   24   40:ldc1            #106 <String "">
		//   25   42:iconst_0        
		//   26   43:anewarray       Object[]
		//   27   46:invokevirtual   #109 <Method void writeLine(String, Object[])>
				if(s2 != null)
		//*  28   49:aload_3         
		//*  29   50:ifnull          72
					writeLine("%s: %s", new Object[] {
						"Content-Type", s2
					});
		//   30   53:aload_0         
		//   31   54:ldc1            #155 <String "%s: %s">
		//   32   56:iconst_2        
		//   33   57:anewarray       Object[]
		//   34   60:dup             
		//   35   61:iconst_0        
		//   36   62:ldc1            #157 <String "Content-Type">
		//   37   64:aastore         
		//   38   65:dup             
		//   39   66:iconst_1        
		//   40   67:aload_3         
		//   41   68:aastore         
		//   42   69:invokevirtual   #109 <Method void writeLine(String, Object[])>
				writeLine("", new Object[0]);
		//   43   72:aload_0         
		//   44   73:ldc1            #106 <String "">
		//   45   75:iconst_0        
		//   46   76:anewarray       Object[]
		//   47   79:invokevirtual   #109 <Method void writeLine(String, Object[])>
				return;
		//   48   82:return          
			} else
			{
				outputStream.write(String.format("%s=", new Object[] {
					s
				}).getBytes());
		//   49   83:aload_0         
		//   50   84:getfield        #27  <Field OutputStream outputStream>
		//   51   87:ldc1            #159 <String "%s=">
		//   52   89:iconst_1        
		//   53   90:anewarray       Object[]
		//   54   93:dup             
		//   55   94:iconst_0        
		//   56   95:aload_1         
		//   57   96:aastore         
		//   58   97:invokestatic    #66  <Method String String.format(String, Object[])>
		//   59  100:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   60  103:invokevirtual   #56  <Method void OutputStream.write(byte[])>
				return;
		//   61  106:return          
			}
		}

		public void writeContentUri(String s, Uri uri, String s1)
			throws IOException
		{
			String s2 = s1;
		//    0    0:aload_3         
		//    1    1:astore          7
			if(s1 == null)
		//*   2    3:aload_3         
		//*   3    4:ifnonnull       11
				s2 = "content/unknown";
		//    4    7:ldc1            #136 <String "content/unknown">
		//    5    9:astore          7
			writeContentDisposition(s, s, s2);
		//    6   11:aload_0         
		//    7   12:aload_1         
		//    8   13:aload_1         
		//    9   14:aload           7
		//   10   16:invokevirtual   #92  <Method void writeContentDisposition(String, String, String)>
			int i;
			if(outputStream instanceof ProgressNoopOutputStream)
		//*  11   19:aload_0         
		//*  12   20:getfield        #27  <Field OutputStream outputStream>
		//*  13   23:instanceof      #163 <Class ProgressNoopOutputStream>
		//*  14   26:ifeq            53
			{
				long l = Utility.getContentSize(uri);
		//   15   29:aload_2         
		//   16   30:invokestatic    #169 <Method long Utility.getContentSize(Uri)>
		//   17   33:lstore          5
				((ProgressNoopOutputStream)outputStream).addProgress(l);
		//   18   35:aload_0         
		//   19   36:getfield        #27  <Field OutputStream outputStream>
		//   20   39:checkcast       #163 <Class ProgressNoopOutputStream>
		//   21   42:lload           5
		//   22   44:invokevirtual   #173 <Method void ProgressNoopOutputStream.addProgress(long)>
				i = 0;
		//   23   47:iconst_0        
		//   24   48:istore          4
			} else
		//*  25   50:goto            74
			{
				i = Utility.copyAndCloseInputStream(FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri), outputStream) + 0;
		//   26   53:invokestatic    #179 <Method Context FacebookSdk.getApplicationContext()>
		//   27   56:invokevirtual   #185 <Method ContentResolver Context.getContentResolver()>
		//   28   59:aload_2         
		//   29   60:invokevirtual   #191 <Method java.io.InputStream ContentResolver.openInputStream(Uri)>
		//   30   63:aload_0         
		//   31   64:getfield        #27  <Field OutputStream outputStream>
		//   32   67:invokestatic    #195 <Method int Utility.copyAndCloseInputStream(java.io.InputStream, OutputStream)>
		//   33   70:iconst_0        
		//   34   71:iadd            
		//   35   72:istore          4
			}
			writeLine("", new Object[0]);
		//   36   74:aload_0         
		//   37   75:ldc1            #106 <String "">
		//   38   77:iconst_0        
		//   39   78:anewarray       Object[]
		//   40   81:invokevirtual   #109 <Method void writeLine(String, Object[])>
			writeRecordBoundary();
		//   41   84:aload_0         
		//   42   85:invokevirtual   #112 <Method void writeRecordBoundary()>
			uri = ((Uri) (logger));
		//   43   88:aload_0         
		//   44   89:getfield        #29  <Field Logger logger>
		//   45   92:astore_2        
			if(uri != null)
		//*  46   93:aload_2         
		//*  47   94:ifnull          146
			{
				s1 = ((String) (new StringBuilder()));
		//   48   97:new             #114 <Class StringBuilder>
		//   49  100:dup             
		//   50  101:invokespecial   #115 <Method void StringBuilder()>
		//   51  104:astore_3        
				((StringBuilder) (s1)).append("    ");
		//   52  105:aload_3         
		//   53  106:ldc1            #117 <String "    ">
		//   54  108:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   55  111:pop             
				((StringBuilder) (s1)).append(s);
		//   56  112:aload_3         
		//   57  113:aload_1         
		//   58  114:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   59  117:pop             
				((Logger) (uri)).appendKeyValue(((StringBuilder) (s1)).toString(), ((Object) (String.format(Locale.ROOT, "<Data: %d>", new Object[] {
					Integer.valueOf(i)
				}))));
		//   60  118:aload_2         
		//   61  119:aload_3         
		//   62  120:invokevirtual   #124 <Method String StringBuilder.toString()>
		//   63  123:getstatic       #139 <Field Locale Locale.ROOT>
		//   64  126:ldc1            #141 <String "<Data: %d>">
		//   65  128:iconst_1        
		//   66  129:anewarray       Object[]
		//   67  132:dup             
		//   68  133:iconst_0        
		//   69  134:iload           4
		//   70  136:invokestatic    #147 <Method Integer Integer.valueOf(int)>
		//   71  139:aastore         
		//   72  140:invokestatic    #75  <Method String String.format(Locale, String, Object[])>
		//   73  143:invokevirtual   #132 <Method void Logger.appendKeyValue(String, Object)>
			}
		//   74  146:return          
		}

		public void writeFile(String s, ParcelFileDescriptor parcelfiledescriptor, String s1)
			throws IOException
		{
			String s2 = s1;
		//    0    0:aload_3         
		//    1    1:astore          5
			if(s1 == null)
		//*   2    3:aload_3         
		//*   3    4:ifnonnull       11
				s2 = "content/unknown";
		//    4    7:ldc1            #136 <String "content/unknown">
		//    5    9:astore          5
			writeContentDisposition(s, s, s2);
		//    6   11:aload_0         
		//    7   12:aload_1         
		//    8   13:aload_1         
		//    9   14:aload           5
		//   10   16:invokevirtual   #92  <Method void writeContentDisposition(String, String, String)>
			s1 = ((String) (outputStream));
		//   11   19:aload_0         
		//   12   20:getfield        #27  <Field OutputStream outputStream>
		//   13   23:astore_3        
			int i;
			if(s1 instanceof ProgressNoopOutputStream)
		//*  14   24:aload_3         
		//*  15   25:instanceof      #163 <Class ProgressNoopOutputStream>
		//*  16   28:ifeq            48
			{
				((ProgressNoopOutputStream)s1).addProgress(parcelfiledescriptor.getStatSize());
		//   17   31:aload_3         
		//   18   32:checkcast       #163 <Class ProgressNoopOutputStream>
		//   19   35:aload_2         
		//   20   36:invokevirtual   #203 <Method long ParcelFileDescriptor.getStatSize()>
		//   21   39:invokevirtual   #173 <Method void ProgressNoopOutputStream.addProgress(long)>
				i = 0;
		//   22   42:iconst_0        
		//   23   43:istore          4
			} else
		//*  24   45:goto            67
			{
				i = Utility.copyAndCloseInputStream(((java.io.InputStream) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor))), outputStream) + 0;
		//   25   48:new             #205 <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
		//   26   51:dup             
		//   27   52:aload_2         
		//   28   53:invokespecial   #208 <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
		//   29   56:aload_0         
		//   30   57:getfield        #27  <Field OutputStream outputStream>
		//   31   60:invokestatic    #195 <Method int Utility.copyAndCloseInputStream(java.io.InputStream, OutputStream)>
		//   32   63:iconst_0        
		//   33   64:iadd            
		//   34   65:istore          4
			}
			writeLine("", new Object[0]);
		//   35   67:aload_0         
		//   36   68:ldc1            #106 <String "">
		//   37   70:iconst_0        
		//   38   71:anewarray       Object[]
		//   39   74:invokevirtual   #109 <Method void writeLine(String, Object[])>
			writeRecordBoundary();
		//   40   77:aload_0         
		//   41   78:invokevirtual   #112 <Method void writeRecordBoundary()>
			parcelfiledescriptor = ((ParcelFileDescriptor) (logger));
		//   42   81:aload_0         
		//   43   82:getfield        #29  <Field Logger logger>
		//   44   85:astore_2        
			if(parcelfiledescriptor != null)
		//*  45   86:aload_2         
		//*  46   87:ifnull          139
			{
				s1 = ((String) (new StringBuilder()));
		//   47   90:new             #114 <Class StringBuilder>
		//   48   93:dup             
		//   49   94:invokespecial   #115 <Method void StringBuilder()>
		//   50   97:astore_3        
				((StringBuilder) (s1)).append("    ");
		//   51   98:aload_3         
		//   52   99:ldc1            #117 <String "    ">
		//   53  101:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   54  104:pop             
				((StringBuilder) (s1)).append(s);
		//   55  105:aload_3         
		//   56  106:aload_1         
		//   57  107:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   58  110:pop             
				((Logger) (parcelfiledescriptor)).appendKeyValue(((StringBuilder) (s1)).toString(), ((Object) (String.format(Locale.ROOT, "<Data: %d>", new Object[] {
					Integer.valueOf(i)
				}))));
		//   59  111:aload_2         
		//   60  112:aload_3         
		//   61  113:invokevirtual   #124 <Method String StringBuilder.toString()>
		//   62  116:getstatic       #139 <Field Locale Locale.ROOT>
		//   63  119:ldc1            #141 <String "<Data: %d>">
		//   64  121:iconst_1        
		//   65  122:anewarray       Object[]
		//   66  125:dup             
		//   67  126:iconst_0        
		//   68  127:iload           4
		//   69  129:invokestatic    #147 <Method Integer Integer.valueOf(int)>
		//   70  132:aastore         
		//   71  133:invokestatic    #75  <Method String String.format(Locale, String, Object[])>
		//   72  136:invokevirtual   #132 <Method void Logger.appendKeyValue(String, Object)>
			}
		//   73  139:return          
		}

		public transient void writeLine(String s, Object aobj[])
			throws IOException
		{
			write(s, aobj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #151 <Method void write(String, Object[])>
			if(!useUrlEncode)
		//*   4    6:aload_0         
		//*   5    7:getfield        #25  <Field boolean useUrlEncode>
		//*   6   10:ifne            23
				write("\r\n", new Object[0]);
		//    7   13:aload_0         
		//    8   14:ldc1            #62  <String "\r\n">
		//    9   16:iconst_0        
		//   10   17:anewarray       Object[]
		//   11   20:invokevirtual   #151 <Method void write(String, Object[])>
		//   12   23:return          
		}

		public void writeObject(String s, Object obj, GraphRequest graphrequest)
			throws IOException
		{
			OutputStream outputstream = outputStream;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field OutputStream outputStream>
		//    2    4:astore          4
			if(outputstream instanceof RequestOutputStream)
		//*   3    6:aload           4
		//*   4    8:instanceof      #212 <Class RequestOutputStream>
		//*   5   11:ifeq            25
				((RequestOutputStream)outputstream).setCurrentRequest(graphrequest);
		//    6   14:aload           4
		//    7   16:checkcast       #212 <Class RequestOutputStream>
		//    8   19:aload_3         
		//    9   20:invokeinterface #216 <Method void RequestOutputStream.setCurrentRequest(GraphRequest)>
			if(GraphRequest.isSupportedParameterType(obj))
		//*  10   25:aload_2         
		//*  11   26:invokestatic    #220 <Method boolean GraphRequest.access$000(Object)>
		//*  12   29:ifeq            42
			{
				writeString(s, GraphRequest.parameterToString(obj));
		//   13   32:aload_0         
		//   14   33:aload_1         
		//   15   34:aload_2         
		//   16   35:invokestatic    #224 <Method String GraphRequest.access$100(Object)>
		//   17   38:invokevirtual   #228 <Method void writeString(String, String)>
				return;
		//   18   41:return          
			}
			if(obj instanceof Bitmap)
		//*  19   42:aload_2         
		//*  20   43:instanceof      #100 <Class Bitmap>
		//*  21   46:ifeq            59
			{
				writeBitmap(s, (Bitmap)obj);
		//   22   49:aload_0         
		//   23   50:aload_1         
		//   24   51:aload_2         
		//   25   52:checkcast       #100 <Class Bitmap>
		//   26   55:invokevirtual   #230 <Method void writeBitmap(String, Bitmap)>
				return;
		//   27   58:return          
			}
			if(obj instanceof byte[])
		//*  28   59:aload_2         
		//*  29   60:instanceof      #232 <Class byte[]>
		//*  30   63:ifeq            76
			{
				writeBytes(s, (byte[])obj);
		//   31   66:aload_0         
		//   32   67:aload_1         
		//   33   68:aload_2         
		//   34   69:checkcast       #232 <Class byte[]>
		//   35   72:invokevirtual   #234 <Method void writeBytes(String, byte[])>
				return;
		//   36   75:return          
			}
			if(obj instanceof Uri)
		//*  37   76:aload_2         
		//*  38   77:instanceof      #236 <Class Uri>
		//*  39   80:ifeq            94
			{
				writeContentUri(s, (Uri)obj, ((String) (null)));
		//   40   83:aload_0         
		//   41   84:aload_1         
		//   42   85:aload_2         
		//   43   86:checkcast       #236 <Class Uri>
		//   44   89:aconst_null     
		//   45   90:invokevirtual   #238 <Method void writeContentUri(String, Uri, String)>
				return;
		//   46   93:return          
			}
			if(obj instanceof ParcelFileDescriptor)
		//*  47   94:aload_2         
		//*  48   95:instanceof      #199 <Class ParcelFileDescriptor>
		//*  49   98:ifeq            112
			{
				writeFile(s, (ParcelFileDescriptor)obj, ((String) (null)));
		//   50  101:aload_0         
		//   51  102:aload_1         
		//   52  103:aload_2         
		//   53  104:checkcast       #199 <Class ParcelFileDescriptor>
		//   54  107:aconst_null     
		//   55  108:invokevirtual   #240 <Method void writeFile(String, ParcelFileDescriptor, String)>
				return;
		//   56  111:return          
			}
			if(obj instanceof ParcelableResourceWithMimeType)
		//*  57  112:aload_2         
		//*  58  113:instanceof      #242 <Class GraphRequest$ParcelableResourceWithMimeType>
		//*  59  116:ifeq            175
			{
				graphrequest = ((GraphRequest) ((ParcelableResourceWithMimeType)obj));
		//   60  119:aload_2         
		//   61  120:checkcast       #242 <Class GraphRequest$ParcelableResourceWithMimeType>
		//   62  123:astore_3        
				obj = ((Object) (((ParcelableResourceWithMimeType) (graphrequest)).getResource()));
		//   63  124:aload_3         
		//   64  125:invokevirtual   #246 <Method Parcelable GraphRequest$ParcelableResourceWithMimeType.getResource()>
		//   65  128:astore_2        
				graphrequest = ((GraphRequest) (((ParcelableResourceWithMimeType) (graphrequest)).getMimeType()));
		//   66  129:aload_3         
		//   67  130:invokevirtual   #249 <Method String GraphRequest$ParcelableResourceWithMimeType.getMimeType()>
		//   68  133:astore_3        
				if(obj instanceof ParcelFileDescriptor)
		//*  69  134:aload_2         
		//*  70  135:instanceof      #199 <Class ParcelFileDescriptor>
		//*  71  138:ifeq            152
				{
					writeFile(s, (ParcelFileDescriptor)obj, ((String) (graphrequest)));
		//   72  141:aload_0         
		//   73  142:aload_1         
		//   74  143:aload_2         
		//   75  144:checkcast       #199 <Class ParcelFileDescriptor>
		//   76  147:aload_3         
		//   77  148:invokevirtual   #240 <Method void writeFile(String, ParcelFileDescriptor, String)>
					return;
		//   78  151:return          
				}
				if(obj instanceof Uri)
		//*  79  152:aload_2         
		//*  80  153:instanceof      #236 <Class Uri>
		//*  81  156:ifeq            170
				{
					writeContentUri(s, (Uri)obj, ((String) (graphrequest)));
		//   82  159:aload_0         
		//   83  160:aload_1         
		//   84  161:aload_2         
		//   85  162:checkcast       #236 <Class Uri>
		//   86  165:aload_3         
		//   87  166:invokevirtual   #238 <Method void writeContentUri(String, Uri, String)>
					return;
		//   88  169:return          
				} else
				{
					throw getInvalidTypeError();
		//   89  170:aload_0         
		//   90  171:invokespecial   #251 <Method RuntimeException getInvalidTypeError()>
		//   91  174:athrow          
				}
			} else
			{
				throw getInvalidTypeError();
		//   92  175:aload_0         
		//   93  176:invokespecial   #251 <Method RuntimeException getInvalidTypeError()>
		//   94  179:athrow          
			}
		}

		public void writeRecordBoundary()
			throws IOException
		{
			if(!useUrlEncode)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field boolean useUrlEncode>
		//*   2    4:ifne            24
			{
				writeLine("--%s", new Object[] {
					GraphRequest.MIME_BOUNDARY
				});
		//    3    7:aload_0         
		//    4    8:ldc1            #253 <String "--%s">
		//    5   10:iconst_1        
		//    6   11:anewarray       Object[]
		//    7   14:dup             
		//    8   15:iconst_0        
		//    9   16:invokestatic    #60  <Method String GraphRequest.access$200()>
		//   10   19:aastore         
		//   11   20:invokevirtual   #109 <Method void writeLine(String, Object[])>
				return;
		//   12   23:return          
			} else
			{
				outputStream.write("&".getBytes());
		//   13   24:aload_0         
		//   14   25:getfield        #27  <Field OutputStream outputStream>
		//   15   28:ldc1            #255 <String "&">
		//   16   30:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   17   33:invokevirtual   #56  <Method void OutputStream.write(byte[])>
				return;
		//   18   36:return          
			}
		}

		public void writeRequestsAsJson(String s, JSONArray jsonarray, Collection collection)
			throws IOException, JSONException
		{
			Object obj = ((Object) (outputStream));
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field OutputStream outputStream>
		//    2    4:astore          5
			if(!(obj instanceof RequestOutputStream))
		//*   3    6:aload           5
		//*   4    8:instanceof      #212 <Class RequestOutputStream>
		//*   5   11:ifne            24
			{
				writeString(s, jsonarray.toString());
		//    6   14:aload_0         
		//    7   15:aload_1         
		//    8   16:aload_2         
		//    9   17:invokevirtual   #262 <Method String JSONArray.toString()>
		//   10   20:invokevirtual   #228 <Method void writeString(String, String)>
				return;
		//   11   23:return          
			}
			obj = ((Object) ((RequestOutputStream)obj));
		//   12   24:aload           5
		//   13   26:checkcast       #212 <Class RequestOutputStream>
		//   14   29:astore          5
			writeContentDisposition(s, ((String) (null)), ((String) (null)));
		//   15   31:aload_0         
		//   16   32:aload_1         
		//   17   33:aconst_null     
		//   18   34:aconst_null     
		//   19   35:invokevirtual   #92  <Method void writeContentDisposition(String, String, String)>
			write("[", new Object[0]);
		//   20   38:aload_0         
		//   21   39:ldc2            #264 <String "[">
		//   22   42:iconst_0        
		//   23   43:anewarray       Object[]
		//   24   46:invokevirtual   #151 <Method void write(String, Object[])>
			collection = ((Collection) (collection.iterator()));
		//   25   49:aload_3         
		//   26   50:invokeinterface #270 <Method Iterator Collection.iterator()>
		//   27   55:astore_3        
			for(int i = 0; ((Iterator) (collection)).hasNext(); i++)
		//*  28   56:iconst_0        
		//*  29   57:istore          4
		//*  30   59:aload_3         
		//*  31   60:invokeinterface #276 <Method boolean Iterator.hasNext()>
		//*  32   65:ifeq            151
			{
				GraphRequest graphrequest = (GraphRequest)((Iterator) (collection)).next();
		//   33   68:aload_3         
		//   34   69:invokeinterface #280 <Method Object Iterator.next()>
		//   35   74:checkcast       #8   <Class GraphRequest>
		//   36   77:astore          6
				JSONObject jsonobject = jsonarray.getJSONObject(i);
		//   37   79:aload_2         
		//   38   80:iload           4
		//   39   82:invokevirtual   #284 <Method JSONObject JSONArray.getJSONObject(int)>
		//   40   85:astore          7
				((RequestOutputStream) (obj)).setCurrentRequest(graphrequest);
		//   41   87:aload           5
		//   42   89:aload           6
		//   43   91:invokeinterface #216 <Method void RequestOutputStream.setCurrentRequest(GraphRequest)>
				if(i > 0)
		//*  44   96:iload           4
		//*  45   98:ifle            123
					write(",%s", new Object[] {
						jsonobject.toString()
					});
		//   46  101:aload_0         
		//   47  102:ldc2            #286 <String ",%s">
		//   48  105:iconst_1        
		//   49  106:anewarray       Object[]
		//   50  109:dup             
		//   51  110:iconst_0        
		//   52  111:aload           7
		//   53  113:invokevirtual   #289 <Method String JSONObject.toString()>
		//   54  116:aastore         
		//   55  117:invokevirtual   #151 <Method void write(String, Object[])>
				else
		//*  56  120:goto            142
					write("%s", new Object[] {
						jsonobject.toString()
					});
		//   57  123:aload_0         
		//   58  124:ldc2            #291 <String "%s">
		//   59  127:iconst_1        
		//   60  128:anewarray       Object[]
		//   61  131:dup             
		//   62  132:iconst_0        
		//   63  133:aload           7
		//   64  135:invokevirtual   #289 <Method String JSONObject.toString()>
		//   65  138:aastore         
		//   66  139:invokevirtual   #151 <Method void write(String, Object[])>
			}

		//   67  142:iload           4
		//   68  144:iconst_1        
		//   69  145:iadd            
		//   70  146:istore          4
		//*  71  148:goto            59
			write("]", new Object[0]);
		//   72  151:aload_0         
		//   73  152:ldc2            #293 <String "]">
		//   74  155:iconst_0        
		//   75  156:anewarray       Object[]
		//   76  159:invokevirtual   #151 <Method void write(String, Object[])>
			collection = ((Collection) (logger));
		//   77  162:aload_0         
		//   78  163:getfield        #29  <Field Logger logger>
		//   79  166:astore_3        
			if(collection != null)
		//*  80  167:aload_3         
		//*  81  168:ifnull          208
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   82  171:new             #114 <Class StringBuilder>
		//   83  174:dup             
		//   84  175:invokespecial   #115 <Method void StringBuilder()>
		//   85  178:astore          5
				stringbuilder.append("    ");
		//   86  180:aload           5
		//   87  182:ldc1            #117 <String "    ">
		//   88  184:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   89  187:pop             
				stringbuilder.append(s);
		//   90  188:aload           5
		//   91  190:aload_1         
		//   92  191:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   93  194:pop             
				((Logger) (collection)).appendKeyValue(stringbuilder.toString(), ((Object) (jsonarray.toString())));
		//   94  195:aload_3         
		//   95  196:aload           5
		//   96  198:invokevirtual   #124 <Method String StringBuilder.toString()>
		//   97  201:aload_2         
		//   98  202:invokevirtual   #262 <Method String JSONArray.toString()>
		//   99  205:invokevirtual   #132 <Method void Logger.appendKeyValue(String, Object)>
			}
		//  100  208:return          
		}

		public void writeString(String s, String s1)
			throws IOException
		{
			writeContentDisposition(s, ((String) (null)), ((String) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:aconst_null     
		//    4    4:invokevirtual   #92  <Method void writeContentDisposition(String, String, String)>
			writeLine("%s", new Object[] {
				s1
			});
		//    5    7:aload_0         
		//    6    8:ldc2            #291 <String "%s">
		//    7   11:iconst_1        
		//    8   12:anewarray       Object[]
		//    9   15:dup             
		//   10   16:iconst_0        
		//   11   17:aload_2         
		//   12   18:aastore         
		//   13   19:invokevirtual   #109 <Method void writeLine(String, Object[])>
			writeRecordBoundary();
		//   14   22:aload_0         
		//   15   23:invokevirtual   #112 <Method void writeRecordBoundary()>
			Logger logger1 = logger;
		//   16   26:aload_0         
		//   17   27:getfield        #29  <Field Logger logger>
		//   18   30:astore_3        
			if(logger1 != null)
		//*  19   31:aload_3         
		//*  20   32:ifnull          69
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   21   35:new             #114 <Class StringBuilder>
		//   22   38:dup             
		//   23   39:invokespecial   #115 <Method void StringBuilder()>
		//   24   42:astore          4
				stringbuilder.append("    ");
		//   25   44:aload           4
		//   26   46:ldc1            #117 <String "    ">
		//   27   48:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   28   51:pop             
				stringbuilder.append(s);
		//   29   52:aload           4
		//   30   54:aload_1         
		//   31   55:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
		//   32   58:pop             
				logger1.appendKeyValue(stringbuilder.toString(), ((Object) (s1)));
		//   33   59:aload_3         
		//   34   60:aload           4
		//   35   62:invokevirtual   #124 <Method String StringBuilder.toString()>
		//   36   65:aload_2         
		//   37   66:invokevirtual   #132 <Method void Logger.appendKeyValue(String, Object)>
			}
		//   38   69:return          
		}

		private boolean firstWrite;
		private final Logger logger;
		private final OutputStream outputStream;
		private boolean useUrlEncode;

		public Serializer(OutputStream outputstream, Logger logger1, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			firstWrite = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #23  <Field boolean firstWrite>
			useUrlEncode = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #25  <Field boolean useUrlEncode>
			outputStream = outputstream;
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:putfield        #27  <Field OutputStream outputStream>
			logger = logger1;
		//   11   19:aload_0         
		//   12   20:aload_2         
		//   13   21:putfield        #29  <Field Logger logger>
			useUrlEncode = flag;
		//   14   24:aload_0         
		//   15   25:iload_3         
		//   16   26:putfield        #25  <Field boolean useUrlEncode>
		//   17   29:return          
		}
	}


	public GraphRequest()
	{
		this(((AccessToken) (null)), ((String) (null)), ((Bundle) (null)), ((HttpMethod) (null)), ((Callback) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//    7    9:return          
	}

	public GraphRequest(AccessToken accesstoken, String s)
	{
		this(accesstoken, s, ((Bundle) (null)), ((HttpMethod) (null)), ((Callback) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//    7    9:return          
	}

	public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod)
	{
		this(accesstoken, s, bundle, httpmethod, ((Callback) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//    7   10:return          
	}

	public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod, Callback callback1)
	{
		this(accesstoken, s, bundle, httpmethod, callback1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:invokespecial   #239 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback, String)>
	//    8   12:return          
	}

	public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod, Callback callback1, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #240 <Method void Object()>
		batchEntryOmitResultOnSuccess = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #242 <Field boolean batchEntryOmitResultOnSuccess>
		skipClientToken = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #244 <Field boolean skipClientToken>
		accessToken = accesstoken;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #246 <Field AccessToken accessToken>
		graphPath = s;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #248 <Field String graphPath>
		version = s1;
	//   14   24:aload_0         
	//   15   25:aload           6
	//   16   27:putfield        #250 <Field String version>
		setCallback(callback1);
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:invokevirtual   #254 <Method void setCallback(GraphRequest$Callback)>
		setHttpMethod(httpmethod);
	//   20   36:aload_0         
	//   21   37:aload           4
	//   22   39:invokevirtual   #258 <Method void setHttpMethod(HttpMethod)>
		if(bundle != null)
	//*  23   42:aload_3         
	//*  24   43:ifnull          61
			parameters = new Bundle(bundle);
	//   25   46:aload_0         
	//   26   47:new             #260 <Class Bundle>
	//   27   50:dup             
	//   28   51:aload_3         
	//   29   52:invokespecial   #263 <Method void Bundle(Bundle)>
	//   30   55:putfield        #265 <Field Bundle parameters>
		else
	//*  31   58:goto            72
			parameters = new Bundle();
	//   32   61:aload_0         
	//   33   62:new             #260 <Class Bundle>
	//   34   65:dup             
	//   35   66:invokespecial   #266 <Method void Bundle()>
	//   36   69:putfield        #265 <Field Bundle parameters>
		if(version == null)
	//*  37   72:aload_0         
	//*  38   73:getfield        #250 <Field String version>
	//*  39   76:ifnonnull       86
			version = FacebookSdk.getGraphApiVersion();
	//   40   79:aload_0         
	//   41   80:invokestatic    #271 <Method String FacebookSdk.getGraphApiVersion()>
	//   42   83:putfield        #250 <Field String version>
	//   43   86:return          
	}

	GraphRequest(AccessToken accesstoken, URL url)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #240 <Method void Object()>
		batchEntryOmitResultOnSuccess = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #242 <Field boolean batchEntryOmitResultOnSuccess>
		skipClientToken = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #244 <Field boolean skipClientToken>
		accessToken = accesstoken;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #246 <Field AccessToken accessToken>
		overriddenURL = url.toString();
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #275 <Method String URL.toString()>
	//   14   24:putfield        #277 <Field String overriddenURL>
		setHttpMethod(HttpMethod.GET);
	//   15   27:aload_0         
	//   16   28:getstatic       #282 <Field HttpMethod HttpMethod.GET>
	//   17   31:invokevirtual   #258 <Method void setHttpMethod(HttpMethod)>
		parameters = new Bundle();
	//   18   34:aload_0         
	//   19   35:new             #260 <Class Bundle>
	//   20   38:dup             
	//   21   39:invokespecial   #266 <Method void Bundle()>
	//   22   42:putfield        #265 <Field Bundle parameters>
	//   23   45:return          
	}

	private void addCommonParameters()
	{
		if(accessToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #246 <Field AccessToken accessToken>
	//*   2    4:ifnull          44
		{
			if(!parameters.containsKey("access_token"))
	//*   3    7:aload_0         
	//*   4    8:getfield        #265 <Field Bundle parameters>
	//*   5   11:ldc1            #49  <String "access_token">
	//*   6   13:invokevirtual   #298 <Method boolean Bundle.containsKey(String)>
	//*   7   16:ifne            140
			{
				String s = accessToken.getToken();
	//    8   19:aload_0         
	//    9   20:getfield        #246 <Field AccessToken accessToken>
	//   10   23:invokevirtual   #303 <Method String AccessToken.getToken()>
	//   11   26:astore_1        
				Logger.registerAccessToken(s);
	//   12   27:aload_1         
	//   13   28:invokestatic    #309 <Method void Logger.registerAccessToken(String)>
				parameters.putString("access_token", s);
	//   14   31:aload_0         
	//   15   32:getfield        #265 <Field Bundle parameters>
	//   16   35:ldc1            #49  <String "access_token">
	//   17   37:aload_1         
	//   18   38:invokevirtual   #313 <Method void Bundle.putString(String, String)>
			}
		} else
	//*  19   41:goto            140
		if(!skipClientToken && !parameters.containsKey("access_token"))
	//*  20   44:aload_0         
	//*  21   45:getfield        #244 <Field boolean skipClientToken>
	//*  22   48:ifne            140
	//*  23   51:aload_0         
	//*  24   52:getfield        #265 <Field Bundle parameters>
	//*  25   55:ldc1            #49  <String "access_token">
	//*  26   57:invokevirtual   #298 <Method boolean Bundle.containsKey(String)>
	//*  27   60:ifne            140
		{
			String s1 = FacebookSdk.getApplicationId();
	//   28   63:invokestatic    #316 <Method String FacebookSdk.getApplicationId()>
	//   29   66:astore_1        
			String s2 = FacebookSdk.getClientToken();
	//   30   67:invokestatic    #319 <Method String FacebookSdk.getClientToken()>
	//   31   70:astore_2        
			if(!Utility.isNullOrEmpty(s1) && !Utility.isNullOrEmpty(s2))
	//*  32   71:aload_1         
	//*  33   72:invokestatic    #324 <Method boolean Utility.isNullOrEmpty(String)>
	//*  34   75:ifne            131
	//*  35   78:aload_2         
	//*  36   79:invokestatic    #324 <Method boolean Utility.isNullOrEmpty(String)>
	//*  37   82:ifne            131
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   38   85:new             #210 <Class StringBuilder>
	//   39   88:dup             
	//   40   89:invokespecial   #213 <Method void StringBuilder()>
	//   41   92:astore_3        
				stringbuilder.append(s1);
	//   42   93:aload_3         
	//   43   94:aload_1         
	//   44   95:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   45   98:pop             
				stringbuilder.append("|");
	//   46   99:aload_3         
	//   47  100:ldc2            #329 <String "|">
	//   48  103:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   49  106:pop             
				stringbuilder.append(s2);
	//   50  107:aload_3         
	//   51  108:aload_2         
	//   52  109:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   53  112:pop             
				s1 = stringbuilder.toString();
	//   54  113:aload_3         
	//   55  114:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   56  117:astore_1        
				parameters.putString("access_token", s1);
	//   57  118:aload_0         
	//   58  119:getfield        #265 <Field Bundle parameters>
	//   59  122:ldc1            #49  <String "access_token">
	//   60  124:aload_1         
	//   61  125:invokevirtual   #313 <Method void Bundle.putString(String, String)>
			} else
	//*  62  128:goto            140
			{
				Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
	//   63  131:getstatic       #331 <Field String TAG>
	//   64  134:ldc2            #333 <String "Warning: Request without access token missing application ID or client token.">
	//   65  137:invokestatic    #336 <Method void Utility.logd(String, String)>
			}
		}
		parameters.putString("sdk", "android");
	//   66  140:aload_0         
	//   67  141:getfield        #265 <Field Bundle parameters>
	//   68  144:ldc1            #149 <String "sdk">
	//   69  146:ldc1            #146 <String "android">
	//   70  148:invokevirtual   #313 <Method void Bundle.putString(String, String)>
		parameters.putString("format", "json");
	//   71  151:aload_0         
	//   72  152:getfield        #265 <Field Bundle parameters>
	//   73  155:ldc1            #121 <String "format">
	//   74  157:ldc1            #118 <String "json">
	//   75  159:invokevirtual   #313 <Method void Bundle.putString(String, String)>
		if(FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO))
	//*  76  162:getstatic       #342 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_INFO>
	//*  77  165:invokestatic    #346 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*  78  168:ifeq            183
		{
			parameters.putString("debug", "info");
	//   79  171:aload_0         
	//   80  172:getfield        #265 <Field Bundle parameters>
	//   81  175:ldc1            #106 <String "debug">
	//   82  177:ldc1            #109 <String "info">
	//   83  179:invokevirtual   #313 <Method void Bundle.putString(String, String)>
			return;
	//   84  182:return          
		}
		if(FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING))
	//*  85  183:getstatic       #349 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
	//*  86  186:invokestatic    #346 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*  87  189:ifeq            203
			parameters.putString("debug", "warning");
	//   88  192:aload_0         
	//   89  193:getfield        #265 <Field Bundle parameters>
	//   90  196:ldc1            #106 <String "debug">
	//   91  198:ldc1            #112 <String "warning">
	//   92  200:invokevirtual   #313 <Method void Bundle.putString(String, String)>
	//   93  203:return          
	}

	private String appendParametersToBaseUrl(String s, Boolean boolean1)
	{
		android.net.Uri.Builder builder;
label0:
		{
			if(!boolean1.booleanValue() && httpMethod == HttpMethod.POST)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #357 <Method boolean Boolean.booleanValue()>
	//*   2    4:ifne            19
	//*   3    7:aload_0         
	//*   4    8:getfield        #359 <Field HttpMethod httpMethod>
	//*   5   11:getstatic       #362 <Field HttpMethod HttpMethod.POST>
	//*   6   14:if_acmpne       19
				return s;
	//    7   17:aload_1         
	//    8   18:areturn         
			builder = Uri.parse(s).buildUpon();
	//    9   19:aload_1         
	//   10   20:invokestatic    #368 <Method Uri Uri.parse(String)>
	//   11   23:invokevirtual   #372 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   12   26:astore_3        
label1:
			do
			{
				String s1;
				for(Iterator iterator = parameters.keySet().iterator(); iterator.hasNext(); builder.appendQueryParameter(s1, ((Object) (parameterToString(((Object) (s))))).toString()))
	//*  13   27:aload_0         
	//*  14   28:getfield        #265 <Field Bundle parameters>
	//*  15   31:invokevirtual   #376 <Method Set Bundle.keySet()>
	//*  16   34:invokeinterface #382 <Method Iterator Set.iterator()>
	//*  17   39:astore          4
	//*  18   41:aload           4
	//*  19   43:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//*  20   48:ifeq            151
				{
					s1 = (String)iterator.next();
	//   21   51:aload           4
	//   22   53:invokeinterface #391 <Method Object Iterator.next()>
	//   23   58:checkcast       #204 <Class String>
	//   24   61:astore          5
					boolean1 = ((Boolean) (parameters.get(s1)));
	//   25   63:aload_0         
	//   26   64:getfield        #265 <Field Bundle parameters>
	//   27   67:aload           5
	//   28   69:invokevirtual   #395 <Method Object Bundle.get(String)>
	//   29   72:astore_2        
					s = ((String) (boolean1));
	//   30   73:aload_2         
	//   31   74:astore_1        
					if(boolean1 == null)
	//*  32   75:aload_2         
	//*  33   76:ifnonnull       83
						s = "";
	//   34   79:ldc2            #397 <String "">
	//   35   82:astore_1        
					if(!isSupportedParameterType(((Object) (s))))
						continue label1;
	//   36   83:aload_1         
	//   37   84:invokestatic    #287 <Method boolean isSupportedParameterType(Object)>
	//   38   87:ifeq            107
				}

	//   39   90:aload_3         
	//   40   91:aload           5
	//   41   93:aload_1         
	//   42   94:invokestatic    #292 <Method String parameterToString(Object)>
	//   43   97:invokevirtual   #398 <Method String Object.toString()>
	//   44  100:invokevirtual   #404 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   45  103:pop             
				break label0;
	//   46  104:goto            41
			} while(httpMethod != HttpMethod.GET);
	//   47  107:aload_0         
	//   48  108:getfield        #359 <Field HttpMethod httpMethod>
	//   49  111:getstatic       #282 <Field HttpMethod HttpMethod.GET>
	//   50  114:if_acmpeq       120
	//*  51  117:goto            41
			throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] {
				((Object) (s)).getClass().getSimpleName()
			}));
	//   52  120:new             #406 <Class IllegalArgumentException>
	//   53  123:dup             
	//   54  124:getstatic       #412 <Field Locale Locale.US>
	//   55  127:ldc2            #414 <String "Unsupported parameter type for GET request: %s">
	//   56  130:iconst_1        
	//   57  131:anewarray       Object[]
	//   58  134:dup             
	//   59  135:iconst_0        
	//   60  136:aload_1         
	//   61  137:invokevirtual   #418 <Method Class Object.getClass()>
	//   62  140:invokevirtual   #423 <Method String Class.getSimpleName()>
	//   63  143:aastore         
	//   64  144:invokestatic    #426 <Method String String.format(Locale, String, Object[])>
	//   65  147:invokespecial   #428 <Method void IllegalArgumentException(String)>
	//   66  150:athrow          
		}
		return builder.toString();
	//   67  151:aload_3         
	//   68  152:invokevirtual   #429 <Method String android.net.Uri$Builder.toString()>
	//   69  155:areturn         
	}

	private static HttpURLConnection createConnection(URL url)
		throws IOException
	{
		url = ((URL) ((HttpURLConnection)url.openConnection()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #437 <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #439 <Class HttpURLConnection>
	//    3    7:astore_0        
		((HttpURLConnection) (url)).setRequestProperty("User-Agent", getUserAgent());
	//    4    8:aload_0         
	//    5    9:ldc1            #161 <String "User-Agent">
	//    6   11:invokestatic    #442 <Method String getUserAgent()>
	//    7   14:invokevirtual   #445 <Method void HttpURLConnection.setRequestProperty(String, String)>
		((HttpURLConnection) (url)).setRequestProperty("Accept-Language", Locale.getDefault().toString());
	//    8   17:aload_0         
	//    9   18:ldc1            #46  <String "Accept-Language">
	//   10   20:invokestatic    #449 <Method Locale Locale.getDefault()>
	//   11   23:invokevirtual   #450 <Method String Locale.toString()>
	//   12   26:invokevirtual   #445 <Method void HttpURLConnection.setRequestProperty(String, String)>
		((HttpURLConnection) (url)).setChunkedStreamingMode(0);
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #454 <Method void HttpURLConnection.setChunkedStreamingMode(int)>
		return ((HttpURLConnection) (url));
	//   16   34:aload_0         
	//   17   35:areturn         
	}

	public static GraphResponse executeAndWait(GraphRequest graphrequest)
	{
		graphrequest = ((GraphRequest) (executeBatchAndWait(new GraphRequest[] {
			graphrequest
		})));
	//    0    0:iconst_1        
	//    1    1:anewarray       GraphRequest[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:invokestatic    #461 <Method List executeBatchAndWait(GraphRequest[])>
	//    7   11:astore_0        
		if(graphrequest != null && ((List) (graphrequest)).size() == 1)
	//*   8   12:aload_0         
	//*   9   13:ifnull          37
	//*  10   16:aload_0         
	//*  11   17:invokeinterface #467 <Method int List.size()>
	//*  12   22:iconst_1        
	//*  13   23:icmpne          37
			return (GraphResponse)((List) (graphrequest)).get(0);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #470 <Method Object List.get(int)>
	//   17   33:checkcast       #472 <Class GraphResponse>
	//   18   36:areturn         
		else
			throw new FacebookException("invalid state: expected a single response");
	//   19   37:new             #474 <Class FacebookException>
	//   20   40:dup             
	//   21   41:ldc2            #476 <String "invalid state: expected a single response">
	//   22   44:invokespecial   #477 <Method void FacebookException(String)>
	//   23   47:athrow          
	}

	public static List executeBatchAndWait(GraphRequestBatch graphrequestbatch)
	{
		HttpURLConnection httpurlconnection;
		Object obj;
		Validate.notEmptyAndContainsNoNulls(((Collection) (graphrequestbatch)), "requests");
	//    0    0:aload_0         
	//    1    1:ldc2            #482 <String "requests">
	//    2    4:invokestatic    #488 <Method void Validate.notEmptyAndContainsNoNulls(Collection, String)>
		obj = null;
	//    3    7:aconst_null     
	//    4    8:astore_2        
		httpurlconnection = ((HttpURLConnection) (obj));
	//    5    9:aload_2         
	//    6   10:astore_1        
		Object obj1 = ((Object) (toHttpConnection(graphrequestbatch)));
	//    7   11:aload_0         
	//    8   12:invokestatic    #492 <Method HttpURLConnection toHttpConnection(GraphRequestBatch)>
	//    9   15:astore_3        
		httpurlconnection = ((HttpURLConnection) (obj1));
	//   10   16:aload_3         
	//   11   17:astore_1        
		graphrequestbatch = ((GraphRequestBatch) (executeConnectionAndWait(((HttpURLConnection) (obj1)), graphrequestbatch)));
	//   12   18:aload_3         
	//   13   19:aload_0         
	//   14   20:invokestatic    #496 <Method List executeConnectionAndWait(HttpURLConnection, GraphRequestBatch)>
	//   15   23:astore_0        
		Utility.disconnectQuietly(((java.net.URLConnection) (obj1)));
	//   16   24:aload_3         
	//   17   25:invokestatic    #500 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		return ((List) (graphrequestbatch));
	//   18   28:aload_0         
	//   19   29:areturn         
		graphrequestbatch;
	//   20   30:astore_0        
		break MISSING_BLOCK_LABEL_67;
	//   21   31:goto            67
		Exception exception;
		exception;
	//   22   34:astore_3        
		httpurlconnection = ((HttpURLConnection) (obj));
	//   23   35:aload_2         
	//   24   36:astore_1        
		exception = ((Exception) (GraphResponse.constructErrorResponses(graphrequestbatch.getRequests(), ((HttpURLConnection) (null)), new FacebookException(((Throwable) (exception))))));
	//   25   37:aload_0         
	//   26   38:invokevirtual   #506 <Method List GraphRequestBatch.getRequests()>
	//   27   41:aconst_null     
	//   28   42:new             #474 <Class FacebookException>
	//   29   45:dup             
	//   30   46:aload_3         
	//   31   47:invokespecial   #509 <Method void FacebookException(Throwable)>
	//   32   50:invokestatic    #513 <Method List GraphResponse.constructErrorResponses(List, HttpURLConnection, FacebookException)>
	//   33   53:astore_3        
		httpurlconnection = ((HttpURLConnection) (obj));
	//   34   54:aload_2         
	//   35   55:astore_1        
		runCallbacks(graphrequestbatch, ((List) (exception)));
	//   36   56:aload_0         
	//   37   57:aload_3         
	//   38   58:invokestatic    #517 <Method void runCallbacks(GraphRequestBatch, List)>
		Utility.disconnectQuietly(((java.net.URLConnection) (null)));
	//   39   61:aconst_null     
	//   40   62:invokestatic    #500 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		return ((List) (exception));
	//   41   65:aload_3         
	//   42   66:areturn         
		Utility.disconnectQuietly(((java.net.URLConnection) (httpurlconnection)));
	//   43   67:aload_1         
	//   44   68:invokestatic    #500 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		throw graphrequestbatch;
	//   45   71:aload_0         
	//   46   72:athrow          
	}

	public static List executeBatchAndWait(Collection collection)
	{
		return executeBatchAndWait(new GraphRequestBatch(collection));
	//    0    0:new             #502 <Class GraphRequestBatch>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #523 <Method void GraphRequestBatch(Collection)>
	//    4    8:invokestatic    #525 <Method List executeBatchAndWait(GraphRequestBatch)>
	//    5   11:areturn         
	}

	public static transient List executeBatchAndWait(GraphRequest agraphrequest[])
	{
		Validate.notNull(((Object) (agraphrequest)), "requests");
	//    0    0:aload_0         
	//    1    1:ldc2            #482 <String "requests">
	//    2    4:invokestatic    #530 <Method void Validate.notNull(Object, String)>
		return executeBatchAndWait(((Collection) (Arrays.asList(((Object []) (agraphrequest))))));
	//    3    7:aload_0         
	//    4    8:invokestatic    #536 <Method List Arrays.asList(Object[])>
	//    5   11:invokestatic    #538 <Method List executeBatchAndWait(Collection)>
	//    6   14:areturn         
	}

	public static GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch graphrequestbatch)
	{
		Validate.notEmptyAndContainsNoNulls(((Collection) (graphrequestbatch)), "requests");
	//    0    0:aload_0         
	//    1    1:ldc2            #482 <String "requests">
	//    2    4:invokestatic    #488 <Method void Validate.notEmptyAndContainsNoNulls(Collection, String)>
		graphrequestbatch = ((GraphRequestBatch) (new GraphRequestAsyncTask(graphrequestbatch)));
	//    3    7:new             #543 <Class GraphRequestAsyncTask>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #546 <Method void GraphRequestAsyncTask(GraphRequestBatch)>
	//    7   15:astore_0        
		((GraphRequestAsyncTask) (graphrequestbatch)).executeOnExecutor(FacebookSdk.getExecutor(), ((Object []) (new Void[0])));
	//    8   16:aload_0         
	//    9   17:invokestatic    #550 <Method java.util.concurrent.Executor FacebookSdk.getExecutor()>
	//   10   20:iconst_0        
	//   11   21:anewarray       Void[]
	//   12   24:invokevirtual   #556 <Method android.os.AsyncTask GraphRequestAsyncTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   13   27:pop             
		return ((GraphRequestAsyncTask) (graphrequestbatch));
	//   14   28:aload_0         
	//   15   29:areturn         
	}

	public static GraphRequestAsyncTask executeBatchAsync(Collection collection)
	{
		return executeBatchAsync(new GraphRequestBatch(collection));
	//    0    0:new             #502 <Class GraphRequestBatch>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #523 <Method void GraphRequestBatch(Collection)>
	//    4    8:invokestatic    #559 <Method GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch)>
	//    5   11:areturn         
	}

	public static transient GraphRequestAsyncTask executeBatchAsync(GraphRequest agraphrequest[])
	{
		Validate.notNull(((Object) (agraphrequest)), "requests");
	//    0    0:aload_0         
	//    1    1:ldc2            #482 <String "requests">
	//    2    4:invokestatic    #530 <Method void Validate.notNull(Object, String)>
		return executeBatchAsync(((Collection) (Arrays.asList(((Object []) (agraphrequest))))));
	//    3    7:aload_0         
	//    4    8:invokestatic    #536 <Method List Arrays.asList(Object[])>
	//    5   11:invokestatic    #563 <Method GraphRequestAsyncTask executeBatchAsync(Collection)>
	//    6   14:areturn         
	}

	public static List executeConnectionAndWait(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
	{
		List list = GraphResponse.fromHttpConnection(httpurlconnection, graphrequestbatch);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #566 <Method List GraphResponse.fromHttpConnection(HttpURLConnection, GraphRequestBatch)>
	//    3    5:astore_3        
		Utility.disconnectQuietly(((java.net.URLConnection) (httpurlconnection)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #500 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		int i = graphrequestbatch.size();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #567 <Method int GraphRequestBatch.size()>
	//    8   14:istore_2        
		if(i == list.size())
	//*   9   15:iload_2         
	//*  10   16:aload_3         
	//*  11   17:invokeinterface #467 <Method int List.size()>
	//*  12   22:icmpne          38
		{
			runCallbacks(graphrequestbatch, list);
	//   13   25:aload_1         
	//   14   26:aload_3         
	//   15   27:invokestatic    #517 <Method void runCallbacks(GraphRequestBatch, List)>
			AccessTokenManager.getInstance().extendAccessTokenIfNeeded();
	//   16   30:invokestatic    #573 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//   17   33:invokevirtual   #576 <Method void AccessTokenManager.extendAccessTokenIfNeeded()>
			return list;
	//   18   36:aload_3         
	//   19   37:areturn         
		} else
		{
			throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] {
				Integer.valueOf(list.size()), Integer.valueOf(i)
			}));
	//   20   38:new             #474 <Class FacebookException>
	//   21   41:dup             
	//   22   42:getstatic       #412 <Field Locale Locale.US>
	//   23   45:ldc2            #578 <String "Received %d responses while expecting %d">
	//   24   48:iconst_2        
	//   25   49:anewarray       Object[]
	//   26   52:dup             
	//   27   53:iconst_0        
	//   28   54:aload_3         
	//   29   55:invokeinterface #467 <Method int List.size()>
	//   30   60:invokestatic    #584 <Method Integer Integer.valueOf(int)>
	//   31   63:aastore         
	//   32   64:dup             
	//   33   65:iconst_1        
	//   34   66:iload_2         
	//   35   67:invokestatic    #584 <Method Integer Integer.valueOf(int)>
	//   36   70:aastore         
	//   37   71:invokestatic    #426 <Method String String.format(Locale, String, Object[])>
	//   38   74:invokespecial   #477 <Method void FacebookException(String)>
	//   39   77:athrow          
		}
	}

	public static List executeConnectionAndWait(HttpURLConnection httpurlconnection, Collection collection)
	{
		return executeConnectionAndWait(httpurlconnection, new GraphRequestBatch(collection));
	//    0    0:aload_0         
	//    1    1:new             #502 <Class GraphRequestBatch>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #523 <Method void GraphRequestBatch(Collection)>
	//    5    9:invokestatic    #496 <Method List executeConnectionAndWait(HttpURLConnection, GraphRequestBatch)>
	//    6   12:areturn         
	}

	public static GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
	{
		Validate.notNull(((Object) (httpurlconnection)), "connection");
	//    0    0:aload_1         
	//    1    1:ldc2            #591 <String "connection">
	//    2    4:invokestatic    #530 <Method void Validate.notNull(Object, String)>
		httpurlconnection = ((HttpURLConnection) (new GraphRequestAsyncTask(httpurlconnection, graphrequestbatch)));
	//    3    7:new             #543 <Class GraphRequestAsyncTask>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokespecial   #594 <Method void GraphRequestAsyncTask(HttpURLConnection, GraphRequestBatch)>
	//    8   16:astore_1        
		graphrequestbatch.setCallbackHandler(handler);
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #598 <Method void GraphRequestBatch.setCallbackHandler(Handler)>
		((GraphRequestAsyncTask) (httpurlconnection)).executeOnExecutor(FacebookSdk.getExecutor(), ((Object []) (new Void[0])));
	//   12   22:aload_1         
	//   13   23:invokestatic    #550 <Method java.util.concurrent.Executor FacebookSdk.getExecutor()>
	//   14   26:iconst_0        
	//   15   27:anewarray       Void[]
	//   16   30:invokevirtual   #556 <Method android.os.AsyncTask GraphRequestAsyncTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   17   33:pop             
		return ((GraphRequestAsyncTask) (httpurlconnection));
	//   18   34:aload_1         
	//   19   35:areturn         
	}

	public static GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
	{
		return executeConnectionAsync(((Handler) (null)), httpurlconnection, graphrequestbatch);
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #601 <Method GraphRequestAsyncTask executeConnectionAsync(Handler, HttpURLConnection, GraphRequestBatch)>
	//    4    6:areturn         
	}

	private static String getBatchAppId(GraphRequestBatch graphrequestbatch)
	{
		if(!Utility.isNullOrEmpty(graphrequestbatch.getBatchApplicationId()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #606 <Method String GraphRequestBatch.getBatchApplicationId()>
	//*   2    4:invokestatic    #324 <Method boolean Utility.isNullOrEmpty(String)>
	//*   3    7:ifne            15
			return graphrequestbatch.getBatchApplicationId();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #606 <Method String GraphRequestBatch.getBatchApplicationId()>
	//    6   14:areturn         
		for(graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.iterator())); ((Iterator) (graphrequestbatch)).hasNext();)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #607 <Method Iterator GraphRequestBatch.iterator()>
	//*   9   19:astore_0        
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//*  12   26:ifeq            57
		{
			Object obj = ((Object) (((GraphRequest)((Iterator) (graphrequestbatch)).next()).accessToken));
	//   13   29:aload_0         
	//   14   30:invokeinterface #391 <Method Object Iterator.next()>
	//   15   35:checkcast       #2   <Class GraphRequest>
	//   16   38:getfield        #246 <Field AccessToken accessToken>
	//   17   41:astore_1        
			if(obj != null)
	//*  18   42:aload_1         
	//*  19   43:ifnull          20
			{
				obj = ((Object) (((AccessToken) (obj)).getApplicationId()));
	//   20   46:aload_1         
	//   21   47:invokevirtual   #608 <Method String AccessToken.getApplicationId()>
	//   22   50:astore_1        
				if(obj != null)
	//*  23   51:aload_1         
	//*  24   52:ifnull          20
					return ((String) (obj));
	//   25   55:aload_1         
	//   26   56:areturn         
			}
		}

		if(!Utility.isNullOrEmpty(defaultBatchApplicationId))
	//*  27   57:getstatic       #610 <Field String defaultBatchApplicationId>
	//*  28   60:invokestatic    #324 <Method boolean Utility.isNullOrEmpty(String)>
	//*  29   63:ifne            70
			return defaultBatchApplicationId;
	//   30   66:getstatic       #610 <Field String defaultBatchApplicationId>
	//   31   69:areturn         
		else
			return FacebookSdk.getApplicationId();
	//   32   70:invokestatic    #316 <Method String FacebookSdk.getApplicationId()>
	//   33   73:areturn         
	}

	public static final String getDefaultBatchApplicationId()
	{
		return defaultBatchApplicationId;
	//    0    0:getstatic       #610 <Field String defaultBatchApplicationId>
	//    1    3:areturn         
	}

	private static String getDefaultPhotoPathIfNull(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(s == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       9
			s1 = "me/photos";
	//    4    6:ldc1            #140 <String "me/photos">
	//    5    8:astore_1        
		return s1;
	//    6    9:aload_1         
	//    7   10:areturn         
	}

	private String getGraphPathWithVersion()
	{
		if(versionPattern.matcher(((CharSequence) (graphPath))).matches())
	//*   0    0:getstatic       #200 <Field Pattern versionPattern>
	//*   1    3:aload_0         
	//*   2    4:getfield        #248 <Field String graphPath>
	//*   3    7:invokevirtual   #618 <Method Matcher Pattern.matcher(CharSequence)>
	//*   4   10:invokevirtual   #623 <Method boolean Matcher.matches()>
	//*   5   13:ifeq            21
			return graphPath;
	//    6   16:aload_0         
	//    7   17:getfield        #248 <Field String graphPath>
	//    8   20:areturn         
		else
			return String.format("%s/%s", new Object[] {
				version, graphPath
			});
	//    9   21:ldc1            #124 <String "%s/%s">
	//   10   23:iconst_2        
	//   11   24:anewarray       Object[]
	//   12   27:dup             
	//   13   28:iconst_0        
	//   14   29:aload_0         
	//   15   30:getfield        #250 <Field String version>
	//   16   33:aastore         
	//   17   34:dup             
	//   18   35:iconst_1        
	//   19   36:aload_0         
	//   20   37:getfield        #248 <Field String graphPath>
	//   21   40:aastore         
	//   22   41:invokestatic    #626 <Method String String.format(String, Object[])>
	//   23   44:areturn         
	}

	private static String getMimeContentType()
	{
		return String.format("multipart/form-data; boundary=%s", new Object[] {
			MIME_BOUNDARY
		});
	//    0    0:ldc2            #629 <String "multipart/form-data; boundary=%s">
	//    1    3:iconst_1        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:getstatic       #230 <Field String MIME_BOUNDARY>
	//    6   12:aastore         
	//    7   13:invokestatic    #626 <Method String String.format(String, Object[])>
	//    8   16:areturn         
	}

	private static String getUserAgent()
	{
		if(userAgent == null)
	//*   0    0:getstatic       #631 <Field String userAgent>
	//*   1    3:ifnonnull       66
		{
			userAgent = String.format("%s.%s", new Object[] {
				"FBAndroidSDK", "4.39.0"
			});
	//    2    6:ldc2            #633 <String "%s.%s">
	//    3    9:iconst_2        
	//    4   10:anewarray       Object[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:ldc1            #158 <String "FBAndroidSDK">
	//    8   17:aastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc2            #635 <String "4.39.0">
	//   12   23:aastore         
	//   13   24:invokestatic    #626 <Method String String.format(String, Object[])>
	//   14   27:putstatic       #631 <Field String userAgent>
			String s = InternalSettings.getCustomUserAgent();
	//   15   30:invokestatic    #640 <Method String InternalSettings.getCustomUserAgent()>
	//   16   33:astore_0        
			if(!Utility.isNullOrEmpty(s))
	//*  17   34:aload_0         
	//*  18   35:invokestatic    #324 <Method boolean Utility.isNullOrEmpty(String)>
	//*  19   38:ifne            66
				userAgent = String.format(Locale.ROOT, "%s/%s", new Object[] {
					userAgent, s
				});
	//   20   41:getstatic       #643 <Field Locale Locale.ROOT>
	//   21   44:ldc1            #124 <String "%s/%s">
	//   22   46:iconst_2        
	//   23   47:anewarray       Object[]
	//   24   50:dup             
	//   25   51:iconst_0        
	//   26   52:getstatic       #631 <Field String userAgent>
	//   27   55:aastore         
	//   28   56:dup             
	//   29   57:iconst_1        
	//   30   58:aload_0         
	//   31   59:aastore         
	//   32   60:invokestatic    #426 <Method String String.format(Locale, String, Object[])>
	//   33   63:putstatic       #631 <Field String userAgent>
		}
		return userAgent;
	//   34   66:getstatic       #631 <Field String userAgent>
	//   35   69:areturn         
	}

	private static boolean hasOnProgressCallbacks(GraphRequestBatch graphrequestbatch)
	{
		for(Iterator iterator = graphrequestbatch.getCallbacks().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #648 <Method List GraphRequestBatch.getCallbacks()>
	//*   2    4:invokeinterface #649 <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            36
			if((GraphRequestBatch.Callback)iterator.next() instanceof GraphRequestBatch.OnProgressCallback)
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #391 <Method Object Iterator.next()>
	//*   9   25:checkcast       #651 <Class GraphRequestBatch$Callback>
	//*  10   28:instanceof      #653 <Class GraphRequestBatch$OnProgressCallback>
	//*  11   31:ifeq            10
				return true;
	//   12   34:iconst_1        
	//   13   35:ireturn         

		for(graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.iterator())); ((Iterator) (graphrequestbatch)).hasNext();)
	//*  14   36:aload_0         
	//*  15   37:invokevirtual   #607 <Method Iterator GraphRequestBatch.iterator()>
	//*  16   40:astore_0        
	//*  17   41:aload_0         
	//*  18   42:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//*  19   47:ifeq            70
			if(((GraphRequest)((Iterator) (graphrequestbatch)).next()).getCallback() instanceof OnProgressCallback)
	//*  20   50:aload_0         
	//*  21   51:invokeinterface #391 <Method Object Iterator.next()>
	//*  22   56:checkcast       #2   <Class GraphRequest>
	//*  23   59:invokevirtual   #657 <Method GraphRequest$Callback getCallback()>
	//*  24   62:instanceof      #33  <Class GraphRequest$OnProgressCallback>
	//*  25   65:ifeq            41
				return true;
	//   26   68:iconst_1        
	//   27   69:ireturn         

		return false;
	//   28   70:iconst_0        
	//   29   71:ireturn         
	}

	private static boolean isGzipCompressible(GraphRequestBatch graphrequestbatch)
	{
		graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.iterator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #607 <Method Iterator GraphRequestBatch.iterator()>
	//    2    4:astore_0        
label0:
		do
			if(((Iterator) (graphrequestbatch)).hasNext())
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            72
			{
				GraphRequest graphrequest = (GraphRequest)((Iterator) (graphrequestbatch)).next();
	//    6   14:aload_0         
	//    7   15:invokeinterface #391 <Method Object Iterator.next()>
	//    8   20:checkcast       #2   <Class GraphRequest>
	//    9   23:astore_1        
				Iterator iterator = graphrequest.parameters.keySet().iterator();
	//   10   24:aload_1         
	//   11   25:getfield        #265 <Field Bundle parameters>
	//   12   28:invokevirtual   #376 <Method Set Bundle.keySet()>
	//   13   31:invokeinterface #382 <Method Iterator Set.iterator()>
	//   14   36:astore_2        
				String s;
				do
				{
					if(!iterator.hasNext())
						continue label0;
	//   15   37:aload_2         
	//   16   38:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//   17   43:ifeq            5
					s = (String)iterator.next();
	//   18   46:aload_2         
	//   19   47:invokeinterface #391 <Method Object Iterator.next()>
	//   20   52:checkcast       #204 <Class String>
	//   21   55:astore_3        
				} while(!isSupportedAttachmentType(graphrequest.parameters.get(s)));
	//   22   56:aload_1         
	//   23   57:getfield        #265 <Field Bundle parameters>
	//   24   60:aload_3         
	//   25   61:invokevirtual   #395 <Method Object Bundle.get(String)>
	//   26   64:invokestatic    #661 <Method boolean isSupportedAttachmentType(Object)>
	//   27   67:ifeq            37
				break;
			} else
	//*  28   70:iconst_0        
	//*  29   71:ireturn         
			{
				return true;
	//   30   72:iconst_1        
	//   31   73:ireturn         
			}
		while(true);
		return false;
	}

	private static boolean isMeRequest(String s)
	{
		Matcher matcher = versionPattern.matcher(((CharSequence) (s)));
	//    0    0:getstatic       #200 <Field Pattern versionPattern>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #618 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_1        
		if(matcher.matches())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #623 <Method boolean Matcher.matches()>
	//*   6   12:ifeq            21
			s = matcher.group(1);
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #666 <Method String Matcher.group(int)>
	//   10   20:astore_0        
		if(!s.startsWith("me/"))
	//*  11   21:aload_0         
	//*  12   22:ldc2            #668 <String "me/">
	//*  13   25:invokevirtual   #671 <Method boolean String.startsWith(String)>
	//*  14   28:ifne            45
			return s.startsWith("/me/");
	//   15   31:aload_0         
	//   16   32:ldc2            #673 <String "/me/">
	//   17   35:invokevirtual   #671 <Method boolean String.startsWith(String)>
	//   18   38:ifeq            43
	//   19   41:iconst_1        
	//   20   42:ireturn         
	//   21   43:iconst_0        
	//   22   44:ireturn         
		else
			return true;
	//   23   45:iconst_1        
	//   24   46:ireturn         
	}

	private static boolean isSupportedAttachmentType(Object obj)
	{
		return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
	//    0    0:aload_0         
	//    1    1:instanceof      #675 <Class Bitmap>
	//    2    4:ifne            40
	//    3    7:aload_0         
	//    4    8:instanceof      #677 <Class byte[]>
	//    5   11:ifne            40
	//    6   14:aload_0         
	//    7   15:instanceof      #364 <Class Uri>
	//    8   18:ifne            40
	//    9   21:aload_0         
	//   10   22:instanceof      #679 <Class ParcelFileDescriptor>
	//   11   25:ifne            40
	//   12   28:aload_0         
	//   13   29:instanceof      #36  <Class GraphRequest$ParcelableResourceWithMimeType>
	//   14   32:ifeq            38
	//   15   35:goto            40
	//   16   38:iconst_0        
	//   17   39:ireturn         
	//   18   40:iconst_1        
	//   19   41:ireturn         
	}

	private static boolean isSupportedParameterType(Object obj)
	{
		return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
	//    0    0:aload_0         
	//    1    1:instanceof      #204 <Class String>
	//    2    4:ifne            33
	//    3    7:aload_0         
	//    4    8:instanceof      #353 <Class Boolean>
	//    5   11:ifne            33
	//    6   14:aload_0         
	//    7   15:instanceof      #681 <Class Number>
	//    8   18:ifne            33
	//    9   21:aload_0         
	//   10   22:instanceof      #683 <Class Date>
	//   11   25:ifeq            31
	//   12   28:goto            33
	//   13   31:iconst_0        
	//   14   32:ireturn         
	//   15   33:iconst_1        
	//   16   34:ireturn         
	}

	public static GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accesstoken, Context context, Callback callback1)
	{
		return newCustomAudienceThirdPartyIdRequest(accesstoken, context, ((String) (null)), callback1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokestatic    #688 <Method GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken, Context, String, GraphRequest$Callback)>
	//    5    7:areturn         
	}

	public static GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accesstoken, Context context, String s, Callback callback1)
	{
		String s1 = s;
	//    0    0:aload_2         
	//    1    1:astore          4
		if(s == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       20
		{
			s1 = s;
	//    4    7:aload_2         
	//    5    8:astore          4
			if(accesstoken != null)
	//*   6   10:aload_0         
	//*   7   11:ifnull          20
				s1 = accesstoken.getApplicationId();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #608 <Method String AccessToken.getApplicationId()>
	//   10   18:astore          4
		}
		s = s1;
	//   11   20:aload           4
	//   12   22:astore_2        
		if(s1 == null)
	//*  13   23:aload           4
	//*  14   25:ifnonnull       33
			s = Utility.getMetadataApplicationId(context);
	//   15   28:aload_1         
	//   16   29:invokestatic    #692 <Method String Utility.getMetadataApplicationId(Context)>
	//   17   32:astore_2        
		if(s != null)
	//*  18   33:aload_2         
	//*  19   34:ifnull          195
		{
			Object obj = ((Object) (new StringBuilder()));
	//   20   37:new             #210 <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #213 <Method void StringBuilder()>
	//   23   44:astore          4
			((StringBuilder) (obj)).append(s);
	//   24   46:aload           4
	//   25   48:aload_2         
	//   26   49:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			((StringBuilder) (obj)).append("/custom_audience_third_party_id");
	//   28   53:aload           4
	//   29   55:ldc2            #694 <String "/custom_audience_third_party_id">
	//   30   58:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   32   62:aload           4
	//   33   64:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   34   67:astore          4
			AttributionIdentifiers attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
	//   35   69:aload_1         
	//   36   70:invokestatic    #700 <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//   37   73:astore          5
			Bundle bundle = new Bundle();
	//   38   75:new             #260 <Class Bundle>
	//   39   78:dup             
	//   40   79:invokespecial   #266 <Method void Bundle()>
	//   41   82:astore          6
			if(accesstoken == null)
	//*  42   84:aload_0         
	//*  43   85:ifnonnull       147
				if(attributionidentifiers != null)
	//*  44   88:aload           5
	//*  45   90:ifnull          136
				{
					if(attributionidentifiers.getAttributionId() != null)
	//*  46   93:aload           5
	//*  47   95:invokevirtual   #703 <Method String AttributionIdentifiers.getAttributionId()>
	//*  48   98:ifnull          110
						s = attributionidentifiers.getAttributionId();
	//   49  101:aload           5
	//   50  103:invokevirtual   #703 <Method String AttributionIdentifiers.getAttributionId()>
	//   51  106:astore_2        
					else
	//*  52  107:goto            116
						s = attributionidentifiers.getAndroidAdvertiserId();
	//   53  110:aload           5
	//   54  112:invokevirtual   #706 <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   55  115:astore_2        
					if(attributionidentifiers.getAttributionId() != null)
	//*  56  116:aload           5
	//*  57  118:invokevirtual   #703 <Method String AttributionIdentifiers.getAttributionId()>
	//*  58  121:ifnull          147
						bundle.putString("udid", s);
	//   59  124:aload           6
	//   60  126:ldc2            #708 <String "udid">
	//   61  129:aload_2         
	//   62  130:invokevirtual   #313 <Method void Bundle.putString(String, String)>
				} else
	//*  63  133:goto            147
				{
					throw new FacebookException("There is no access token and attribution identifiers could not be retrieved");
	//   64  136:new             #474 <Class FacebookException>
	//   65  139:dup             
	//   66  140:ldc2            #710 <String "There is no access token and attribution identifiers could not be retrieved">
	//   67  143:invokespecial   #477 <Method void FacebookException(String)>
	//   68  146:athrow          
				}
			if(FacebookSdk.getLimitEventAndDataUsage(context) || attributionidentifiers != null && attributionidentifiers.isTrackingLimited())
	//*  69  147:aload_1         
	//*  70  148:invokestatic    #714 <Method boolean FacebookSdk.getLimitEventAndDataUsage(Context)>
	//*  71  151:ifne            167
	//*  72  154:aload           5
	//*  73  156:ifnull          178
	//*  74  159:aload           5
	//*  75  161:invokevirtual   #717 <Method boolean AttributionIdentifiers.isTrackingLimited()>
	//*  76  164:ifeq            178
				bundle.putString("limit_event_usage", "1");
	//   77  167:aload           6
	//   78  169:ldc2            #719 <String "limit_event_usage">
	//   79  172:ldc2            #721 <String "1">
	//   80  175:invokevirtual   #313 <Method void Bundle.putString(String, String)>
			return new GraphRequest(accesstoken, ((String) (obj)), bundle, HttpMethod.GET, callback1);
	//   81  178:new             #2   <Class GraphRequest>
	//   82  181:dup             
	//   83  182:aload_0         
	//   84  183:aload           4
	//   85  185:aload           6
	//   86  187:getstatic       #282 <Field HttpMethod HttpMethod.GET>
	//   87  190:aload_3         
	//   88  191:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   89  194:areturn         
		} else
		{
			throw new FacebookException("Facebook App ID cannot be determined");
	//   90  195:new             #474 <Class FacebookException>
	//   91  198:dup             
	//   92  199:ldc2            #723 <String "Facebook App ID cannot be determined">
	//   93  202:invokespecial   #477 <Method void FacebookException(String)>
	//   94  205:athrow          
		}
	}

	public static GraphRequest newDeleteObjectRequest(AccessToken accesstoken, String s, Callback callback1)
	{
		return new GraphRequest(accesstoken, s, ((Bundle) (null)), HttpMethod.DELETE, callback1);
	//    0    0:new             #2   <Class GraphRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:getstatic       #728 <Field HttpMethod HttpMethod.DELETE>
	//    6   10:aload_2         
	//    7   11:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//    8   14:areturn         
	}

	public static GraphRequest newGraphPathRequest(AccessToken accesstoken, String s, Callback callback1)
	{
		return new GraphRequest(accesstoken, s, ((Bundle) (null)), ((HttpMethod) (null)), callback1);
	//    0    0:new             #2   <Class GraphRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aload_2         
	//    7    9:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//    8   12:areturn         
	}

	public static GraphRequest newMeRequest(AccessToken accesstoken, GraphJSONObjectCallback graphjsonobjectcallback)
	{
		return new GraphRequest(accesstoken, "me", ((Bundle) (null)), ((HttpMethod) (null)), new Callback(graphjsonobjectcallback) {

			public void onCompleted(GraphResponse graphresponse)
			{
				GraphJSONObjectCallback graphjsonobjectcallback1 = callback;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field GraphRequest$GraphJSONObjectCallback val$callback>
			//    2    4:astore_2        
				if(graphjsonobjectcallback1 != null)
			//*   3    5:aload_2         
			//*   4    6:ifnull          20
					graphjsonobjectcallback1.onCompleted(graphresponse.getJSONObject(), graphresponse);
			//    5    9:aload_2         
			//    6   10:aload_1         
			//    7   11:invokevirtual   #29  <Method JSONObject GraphResponse.getJSONObject()>
			//    8   14:aload_1         
			//    9   15:invokeinterface #34  <Method void GraphRequest$GraphJSONObjectCallback.onCompleted(JSONObject, GraphResponse)>
			//   10   20:return          
			}

			final GraphJSONObjectCallback val$callback;

			
			{
				callback = graphjsonobjectcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GraphRequest$GraphJSONObjectCallback val$callback>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #2   <Class GraphRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #133 <String "me">
	//    4    7:aconst_null     
	//    5    8:aconst_null     
	//    6    9:new             #6   <Class GraphRequest$1>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #734 <Method void GraphRequest$1(GraphRequest$GraphJSONObjectCallback)>
	//   10   17:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   11   20:areturn         
	}

	public static GraphRequest newMyFriendsRequest(AccessToken accesstoken, GraphJSONArrayCallback graphjsonarraycallback)
	{
		return new GraphRequest(accesstoken, "me/friends", ((Bundle) (null)), ((HttpMethod) (null)), new Callback(graphjsonarraycallback) {

			public void onCompleted(GraphResponse graphresponse)
			{
				if(callback != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field GraphRequest$GraphJSONArrayCallback val$callback>
			//*   2    4:ifnull          39
				{
					Object obj = ((Object) (graphresponse.getJSONObject()));
			//    3    7:aload_1         
			//    4    8:invokevirtual   #29  <Method JSONObject GraphResponse.getJSONObject()>
			//    5   11:astore_2        
					if(obj != null)
			//*   6   12:aload_2         
			//*   7   13:ifnull          26
						obj = ((Object) (((JSONObject) (obj)).optJSONArray("data")));
			//    8   16:aload_2         
			//    9   17:ldc1            #31  <String "data">
			//   10   19:invokevirtual   #37  <Method JSONArray JSONObject.optJSONArray(String)>
			//   11   22:astore_2        
					else
			//*  12   23:goto            28
						obj = null;
			//   13   26:aconst_null     
			//   14   27:astore_2        
					callback.onCompleted(((JSONArray) (obj)), graphresponse);
			//   15   28:aload_0         
			//   16   29:getfield        #17  <Field GraphRequest$GraphJSONArrayCallback val$callback>
			//   17   32:aload_2         
			//   18   33:aload_1         
			//   19   34:invokeinterface #42  <Method void GraphRequest$GraphJSONArrayCallback.onCompleted(JSONArray, GraphResponse)>
				}
			//   20   39:return          
			}

			final GraphJSONArrayCallback val$callback;

			
			{
				callback = graphjsonarraycallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GraphRequest$GraphJSONArrayCallback val$callback>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #2   <Class GraphRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #137 <String "me/friends">
	//    4    7:aconst_null     
	//    5    8:aconst_null     
	//    6    9:new             #8   <Class GraphRequest$2>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #739 <Method void GraphRequest$2(GraphRequest$GraphJSONArrayCallback)>
	//   10   17:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   11   20:areturn         
	}

	public static GraphRequest newPlacesSearchRequest(AccessToken accesstoken, Location location, int i, int j, String s, GraphJSONArrayCallback graphjsonarraycallback)
	{
		if(location == null && Utility.isNullOrEmpty(s))
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       26
	//*   2    4:aload           4
	//*   3    6:invokestatic    #324 <Method boolean Utility.isNullOrEmpty(String)>
	//*   4    9:ifne            15
	//*   5   12:goto            26
			throw new FacebookException("Either location or searchText must be specified.");
	//    6   15:new             #474 <Class FacebookException>
	//    7   18:dup             
	//    8   19:ldc2            #743 <String "Either location or searchText must be specified.">
	//    9   22:invokespecial   #477 <Method void FacebookException(String)>
	//   10   25:athrow          
		Bundle bundle = new Bundle(5);
	//   11   26:new             #260 <Class Bundle>
	//   12   29:dup             
	//   13   30:iconst_5        
	//   14   31:invokespecial   #745 <Method void Bundle(int)>
	//   15   34:astore          6
		bundle.putString("type", "place");
	//   16   36:aload           6
	//   17   38:ldc1            #103 <String "type">
	//   18   40:ldc2            #747 <String "place">
	//   19   43:invokevirtual   #313 <Method void Bundle.putString(String, String)>
		bundle.putInt("limit", j);
	//   20   46:aload           6
	//   21   48:ldc2            #749 <String "limit">
	//   22   51:iload_3         
	//   23   52:invokevirtual   #753 <Method void Bundle.putInt(String, int)>
		if(location != null)
	//*  24   55:aload_1         
	//*  25   56:ifnull          109
		{
			bundle.putString("center", String.format(Locale.US, "%f,%f", new Object[] {
				Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())
			}));
	//   26   59:aload           6
	//   27   61:ldc2            #755 <String "center">
	//   28   64:getstatic       #412 <Field Locale Locale.US>
	//   29   67:ldc2            #757 <String "%f,%f">
	//   30   70:iconst_2        
	//   31   71:anewarray       Object[]
	//   32   74:dup             
	//   33   75:iconst_0        
	//   34   76:aload_1         
	//   35   77:invokevirtual   #763 <Method double Location.getLatitude()>
	//   36   80:invokestatic    #768 <Method Double Double.valueOf(double)>
	//   37   83:aastore         
	//   38   84:dup             
	//   39   85:iconst_1        
	//   40   86:aload_1         
	//   41   87:invokevirtual   #771 <Method double Location.getLongitude()>
	//   42   90:invokestatic    #768 <Method Double Double.valueOf(double)>
	//   43   93:aastore         
	//   44   94:invokestatic    #426 <Method String String.format(Locale, String, Object[])>
	//   45   97:invokevirtual   #313 <Method void Bundle.putString(String, String)>
			bundle.putInt("distance", i);
	//   46  100:aload           6
	//   47  102:ldc2            #773 <String "distance">
	//   48  105:iload_2         
	//   49  106:invokevirtual   #753 <Method void Bundle.putInt(String, int)>
		}
		if(!Utility.isNullOrEmpty(s))
	//*  50  109:aload           4
	//*  51  111:invokestatic    #324 <Method boolean Utility.isNullOrEmpty(String)>
	//*  52  114:ifne            127
			bundle.putString("q", s);
	//   53  117:aload           6
	//   54  119:ldc2            #775 <String "q">
	//   55  122:aload           4
	//   56  124:invokevirtual   #313 <Method void Bundle.putString(String, String)>
		location = ((Location) (new Callback(graphjsonarraycallback) {

			public void onCompleted(GraphResponse graphresponse)
			{
				if(callback != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field GraphRequest$GraphJSONArrayCallback val$callback>
			//*   2    4:ifnull          39
				{
					Object obj = ((Object) (graphresponse.getJSONObject()));
			//    3    7:aload_1         
			//    4    8:invokevirtual   #29  <Method JSONObject GraphResponse.getJSONObject()>
			//    5   11:astore_2        
					if(obj != null)
			//*   6   12:aload_2         
			//*   7   13:ifnull          26
						obj = ((Object) (((JSONObject) (obj)).optJSONArray("data")));
			//    8   16:aload_2         
			//    9   17:ldc1            #31  <String "data">
			//   10   19:invokevirtual   #37  <Method JSONArray JSONObject.optJSONArray(String)>
			//   11   22:astore_2        
					else
			//*  12   23:goto            28
						obj = null;
			//   13   26:aconst_null     
			//   14   27:astore_2        
					callback.onCompleted(((JSONArray) (obj)), graphresponse);
			//   15   28:aload_0         
			//   16   29:getfield        #17  <Field GraphRequest$GraphJSONArrayCallback val$callback>
			//   17   32:aload_2         
			//   18   33:aload_1         
			//   19   34:invokeinterface #42  <Method void GraphRequest$GraphJSONArrayCallback.onCompleted(JSONArray, GraphResponse)>
				}
			//   20   39:return          
			}

			final GraphJSONArrayCallback val$callback;

			
			{
				callback = graphjsonarraycallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GraphRequest$GraphJSONArrayCallback val$callback>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//   57  127:new             #10  <Class GraphRequest$3>
	//   58  130:dup             
	//   59  131:aload           5
	//   60  133:invokespecial   #776 <Method void GraphRequest$3(GraphRequest$GraphJSONArrayCallback)>
	//   61  136:astore_1        
		return new GraphRequest(accesstoken, "search", bundle, HttpMethod.GET, ((Callback) (location)));
	//   62  137:new             #2   <Class GraphRequest>
	//   63  140:dup             
	//   64  141:aload_0         
	//   65  142:ldc1            #152 <String "search">
	//   66  144:aload           6
	//   67  146:getstatic       #282 <Field HttpMethod HttpMethod.GET>
	//   68  149:aload_1         
	//   69  150:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   70  153:areturn         
	}

	public static GraphRequest newPostRequest(AccessToken accesstoken, String s, JSONObject jsonobject, Callback callback1)
	{
		accesstoken = ((AccessToken) (new GraphRequest(accesstoken, s, ((Bundle) (null)), HttpMethod.POST, callback1)));
	//    0    0:new             #2   <Class GraphRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:getstatic       #362 <Field HttpMethod HttpMethod.POST>
	//    6   10:aload_3         
	//    7   11:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//    8   14:astore_0        
		((GraphRequest) (accesstoken)).setGraphObject(jsonobject);
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #782 <Method void setGraphObject(JSONObject)>
		return ((GraphRequest) (accesstoken));
	//   12   20:aload_0         
	//   13   21:areturn         
	}

	public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, String s, Bitmap bitmap, String s1, Bundle bundle, Callback callback1)
	{
		s = getDefaultPhotoPathIfNull(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #786 <Method String getDefaultPhotoPathIfNull(String)>
	//    2    4:astore_1        
		Bundle bundle1 = new Bundle();
	//    3    5:new             #260 <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #266 <Method void Bundle()>
	//    6   12:astore          6
		if(bundle != null)
	//*   7   14:aload           4
	//*   8   16:ifnull          26
			bundle1.putAll(bundle);
	//    9   19:aload           6
	//   10   21:aload           4
	//   11   23:invokevirtual   #789 <Method void Bundle.putAll(Bundle)>
		bundle1.putParcelable("picture", ((Parcelable) (bitmap)));
	//   12   26:aload           6
	//   13   28:ldc1            #143 <String "picture">
	//   14   30:aload_2         
	//   15   31:invokevirtual   #793 <Method void Bundle.putParcelable(String, Parcelable)>
		if(s1 != null && !s1.isEmpty())
	//*  16   34:aload_3         
	//*  17   35:ifnull          53
	//*  18   38:aload_3         
	//*  19   39:invokevirtual   #796 <Method boolean String.isEmpty()>
	//*  20   42:ifne            53
			bundle1.putString("caption", s1);
	//   21   45:aload           6
	//   22   47:ldc1            #82  <String "caption">
	//   23   49:aload_3         
	//   24   50:invokevirtual   #313 <Method void Bundle.putString(String, String)>
		return new GraphRequest(accesstoken, s, bundle1, HttpMethod.POST, callback1);
	//   25   53:new             #2   <Class GraphRequest>
	//   26   56:dup             
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:aload           6
	//   30   61:getstatic       #362 <Field HttpMethod HttpMethod.POST>
	//   31   64:aload           5
	//   32   66:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   33   69:areturn         
	}

	public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, String s, Uri uri, String s1, Bundle bundle, Callback callback1)
		throws FileNotFoundException
	{
		s = getDefaultPhotoPathIfNull(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #786 <Method String getDefaultPhotoPathIfNull(String)>
	//    2    4:astore_1        
		if(Utility.isFileUri(uri))
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #803 <Method boolean Utility.isFileUri(Uri)>
	//*   5    9:ifeq            34
			return newUploadPhotoRequest(accesstoken, s, new File(uri.getPath()), s1, bundle, callback1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:new             #805 <Class File>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokevirtual   #808 <Method String Uri.getPath()>
	//   12   22:invokespecial   #809 <Method void File(String)>
	//   13   25:aload_3         
	//   14   26:aload           4
	//   15   28:aload           5
	//   16   30:invokestatic    #812 <Method GraphRequest newUploadPhotoRequest(AccessToken, String, File, String, Bundle, GraphRequest$Callback)>
	//   17   33:areturn         
		if(Utility.isContentUri(uri))
	//*  18   34:aload_2         
	//*  19   35:invokestatic    #815 <Method boolean Utility.isContentUri(Uri)>
	//*  20   38:ifeq            106
		{
			Bundle bundle1 = new Bundle();
	//   21   41:new             #260 <Class Bundle>
	//   22   44:dup             
	//   23   45:invokespecial   #266 <Method void Bundle()>
	//   24   48:astore          6
			if(bundle != null)
	//*  25   50:aload           4
	//*  26   52:ifnull          62
				bundle1.putAll(bundle);
	//   27   55:aload           6
	//   28   57:aload           4
	//   29   59:invokevirtual   #789 <Method void Bundle.putAll(Bundle)>
			bundle1.putParcelable("picture", ((Parcelable) (uri)));
	//   30   62:aload           6
	//   31   64:ldc1            #143 <String "picture">
	//   32   66:aload_2         
	//   33   67:invokevirtual   #793 <Method void Bundle.putParcelable(String, Parcelable)>
			if(s1 != null && !s1.isEmpty())
	//*  34   70:aload_3         
	//*  35   71:ifnull          89
	//*  36   74:aload_3         
	//*  37   75:invokevirtual   #796 <Method boolean String.isEmpty()>
	//*  38   78:ifne            89
				bundle1.putString("caption", s1);
	//   39   81:aload           6
	//   40   83:ldc1            #82  <String "caption">
	//   41   85:aload_3         
	//   42   86:invokevirtual   #313 <Method void Bundle.putString(String, String)>
			return new GraphRequest(accesstoken, s, bundle1, HttpMethod.POST, callback1);
	//   43   89:new             #2   <Class GraphRequest>
	//   44   92:dup             
	//   45   93:aload_0         
	//   46   94:aload_1         
	//   47   95:aload           6
	//   48   97:getstatic       #362 <Field HttpMethod HttpMethod.POST>
	//   49  100:aload           5
	//   50  102:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   51  105:areturn         
		} else
		{
			throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
	//   52  106:new             #474 <Class FacebookException>
	//   53  109:dup             
	//   54  110:ldc2            #817 <String "The photo Uri must be either a file:// or content:// Uri">
	//   55  113:invokespecial   #477 <Method void FacebookException(String)>
	//   56  116:athrow          
		}
	}

	public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, String s, File file, String s1, Bundle bundle, Callback callback1)
		throws FileNotFoundException
	{
		s = getDefaultPhotoPathIfNull(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #786 <Method String getDefaultPhotoPathIfNull(String)>
	//    2    4:astore_1        
		file = ((File) (ParcelFileDescriptor.open(file, 0x10000000)));
	//    3    5:aload_2         
	//    4    6:ldc2            #818 <Int 0x10000000>
	//    5    9:invokestatic    #822 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//    6   12:astore_2        
		Bundle bundle1 = new Bundle();
	//    7   13:new             #260 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #266 <Method void Bundle()>
	//   10   20:astore          6
		if(bundle != null)
	//*  11   22:aload           4
	//*  12   24:ifnull          34
			bundle1.putAll(bundle);
	//   13   27:aload           6
	//   14   29:aload           4
	//   15   31:invokevirtual   #789 <Method void Bundle.putAll(Bundle)>
		bundle1.putParcelable("picture", ((Parcelable) (file)));
	//   16   34:aload           6
	//   17   36:ldc1            #143 <String "picture">
	//   18   38:aload_2         
	//   19   39:invokevirtual   #793 <Method void Bundle.putParcelable(String, Parcelable)>
		if(s1 != null && !s1.isEmpty())
	//*  20   42:aload_3         
	//*  21   43:ifnull          61
	//*  22   46:aload_3         
	//*  23   47:invokevirtual   #796 <Method boolean String.isEmpty()>
	//*  24   50:ifne            61
			bundle1.putString("caption", s1);
	//   25   53:aload           6
	//   26   55:ldc1            #82  <String "caption">
	//   27   57:aload_3         
	//   28   58:invokevirtual   #313 <Method void Bundle.putString(String, String)>
		return new GraphRequest(accesstoken, s, bundle1, HttpMethod.POST, callback1);
	//   29   61:new             #2   <Class GraphRequest>
	//   30   64:dup             
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:aload           6
	//   34   69:getstatic       #362 <Field HttpMethod HttpMethod.POST>
	//   35   72:aload           5
	//   36   74:invokespecial   #234 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   37   77:areturn         
	}

	private static String parameterToString(Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #204 <Class String>
	//*   2    4:ifeq            12
			return (String)obj;
	//    3    7:aload_0         
	//    4    8:checkcast       #204 <Class String>
	//    5   11:areturn         
		if(!(obj instanceof Boolean) && !(obj instanceof Number))
	//*   6   12:aload_0         
	//*   7   13:instanceof      #353 <Class Boolean>
	//*   8   16:ifne            64
	//*   9   19:aload_0         
	//*  10   20:instanceof      #681 <Class Number>
	//*  11   23:ifeq            29
	//*  12   26:goto            64
		{
			if(obj instanceof Date)
	//*  13   29:aload_0         
	//*  14   30:instanceof      #683 <Class Date>
	//*  15   33:ifeq            53
				return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(obj);
	//   16   36:new             #824 <Class SimpleDateFormat>
	//   17   39:dup             
	//   18   40:ldc1            #127 <String "yyyy-MM-dd'T'HH:mm:ssZ">
	//   19   42:getstatic       #412 <Field Locale Locale.US>
	//   20   45:invokespecial   #827 <Method void SimpleDateFormat(String, Locale)>
	//   21   48:aload_0         
	//   22   49:invokevirtual   #829 <Method String SimpleDateFormat.format(Object)>
	//   23   52:areturn         
			else
				throw new IllegalArgumentException("Unsupported parameter type.");
	//   24   53:new             #406 <Class IllegalArgumentException>
	//   25   56:dup             
	//   26   57:ldc2            #831 <String "Unsupported parameter type.">
	//   27   60:invokespecial   #428 <Method void IllegalArgumentException(String)>
	//   28   63:athrow          
		} else
		{
			return obj.toString();
	//   29   64:aload_0         
	//   30   65:invokevirtual   #398 <Method String Object.toString()>
	//   31   68:areturn         
		}
	}

	private static void processGraphObject(JSONObject jsonobject, String s, KeyValueSerializer keyvalueserializer)
		throws IOException
	{
		int i;
		if(isMeRequest(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #835 <Method boolean isMeRequest(String)>
	//*   2    4:ifeq            51
		{
			i = s.indexOf(":");
	//    3    7:aload_1         
	//    4    8:ldc2            #837 <String ":">
	//    5   11:invokevirtual   #841 <Method int String.indexOf(String)>
	//    6   14:istore_3        
			int j = s.indexOf("?");
	//    7   15:aload_1         
	//    8   16:ldc2            #843 <String "?">
	//    9   19:invokevirtual   #841 <Method int String.indexOf(String)>
	//   10   22:istore          4
			if(i > 3 && (j == -1 || i < j))
	//*  11   24:iload_3         
	//*  12   25:iconst_3        
	//*  13   26:icmple          46
	//*  14   29:iload           4
	//*  15   31:iconst_m1       
	//*  16   32:icmpeq          41
	//*  17   35:iload_3         
	//*  18   36:iload           4
	//*  19   38:icmpge          46
				i = 1;
	//   20   41:iconst_1        
	//   21   42:istore_3        
			else
	//*  22   43:goto            53
				i = 0;
	//   23   46:iconst_0        
	//   24   47:istore_3        
		} else
	//*  25   48:goto            53
		{
			i = 0;
	//   26   51:iconst_0        
	//   27   52:istore_3        
		}
		boolean flag;
		String s1;
		Object obj;
		for(s = ((String) (jsonobject.keys())); ((Iterator) (s)).hasNext(); processGraphObjectProperty(s1, obj, keyvalueserializer, flag))
	//*  28   53:aload_0         
	//*  29   54:invokevirtual   #848 <Method Iterator JSONObject.keys()>
	//*  30   57:astore_1        
	//*  31   58:aload_1         
	//*  32   59:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//*  33   64:ifeq            123
		{
			s1 = (String)((Iterator) (s)).next();
	//   34   67:aload_1         
	//   35   68:invokeinterface #391 <Method Object Iterator.next()>
	//   36   73:checkcast       #204 <Class String>
	//   37   76:astore          6
			obj = jsonobject.opt(s1);
	//   38   78:aload_0         
	//   39   79:aload           6
	//   40   81:invokevirtual   #851 <Method Object JSONObject.opt(String)>
	//   41   84:astore          7
			if(i && s1.equalsIgnoreCase("image"))
	//*  42   86:iload_3         
	//*  43   87:ifeq            107
	//*  44   90:aload           6
	//*  45   92:ldc2            #853 <String "image">
	//*  46   95:invokevirtual   #856 <Method boolean String.equalsIgnoreCase(String)>
	//*  47   98:ifeq            107
				flag = true;
	//   48  101:iconst_1        
	//   49  102:istore          5
			else
	//*  50  104:goto            110
				flag = false;
	//   51  107:iconst_0        
	//   52  108:istore          5
		}

	//   53  110:aload           6
	//   54  112:aload           7
	//   55  114:aload_2         
	//   56  115:iload           5
	//   57  117:invokestatic    #860 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
	//*  58  120:goto            58
	//   59  123:return          
	}

	private static void processGraphObjectProperty(String s, Object obj, KeyValueSerializer keyvalueserializer, boolean flag)
		throws IOException
	{
		Object obj1 = ((Object) (obj.getClass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #418 <Method Class Object.getClass()>
	//    2    4:astore          6
		if(((Class) (org/json/JSONObject)).isAssignableFrom(((Class) (obj1))))
	//*   3    6:ldc2            #845 <Class JSONObject>
	//*   4    9:aload           6
	//*   5   11:invokevirtual   #866 <Method boolean Class.isAssignableFrom(Class)>
	//*   6   14:ifeq            156
		{
			obj = ((Object) ((JSONObject)obj));
	//    7   17:aload_1         
	//    8   18:checkcast       #845 <Class JSONObject>
	//    9   21:astore_1        
			if(flag)
	//*  10   22:iload_3         
	//*  11   23:ifeq            87
			{
				String s1;
				for(obj1 = ((Object) (((JSONObject) (obj)).keys())); ((Iterator) (obj1)).hasNext(); processGraphObjectProperty(String.format("%s[%s]", new Object[] {
	s, s1
}), ((JSONObject) (obj)).opt(s1), keyvalueserializer, flag))
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #848 <Method Iterator JSONObject.keys()>
	//*  14   30:astore          6
	//*  15   32:aload           6
	//*  16   34:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//*  17   39:ifeq            327
					s1 = (String)((Iterator) (obj1)).next();
	//   18   42:aload           6
	//   19   44:invokeinterface #391 <Method Object Iterator.next()>
	//   20   49:checkcast       #204 <Class String>
	//   21   52:astore          7

	//   22   54:ldc2            #868 <String "%s[%s]">
	//   23   57:iconst_2        
	//   24   58:anewarray       Object[]
	//   25   61:dup             
	//   26   62:iconst_0        
	//   27   63:aload_0         
	//   28   64:aastore         
	//   29   65:dup             
	//   30   66:iconst_1        
	//   31   67:aload           7
	//   32   69:aastore         
	//   33   70:invokestatic    #626 <Method String String.format(String, Object[])>
	//   34   73:aload_1         
	//   35   74:aload           7
	//   36   76:invokevirtual   #851 <Method Object JSONObject.opt(String)>
	//   37   79:aload_2         
	//   38   80:iload_3         
	//   39   81:invokestatic    #860 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
			} else
	//*  40   84:goto            32
			{
				if(((JSONObject) (obj)).has("id"))
	//*  41   87:aload_1         
	//*  42   88:ldc2            #870 <String "id">
	//*  43   91:invokevirtual   #873 <Method boolean JSONObject.has(String)>
	//*  44   94:ifeq            111
				{
					processGraphObjectProperty(s, ((Object) (((JSONObject) (obj)).optString("id"))), keyvalueserializer, flag);
	//   45   97:aload_0         
	//   46   98:aload_1         
	//   47   99:ldc2            #870 <String "id">
	//   48  102:invokevirtual   #876 <Method String JSONObject.optString(String)>
	//   49  105:aload_2         
	//   50  106:iload_3         
	//   51  107:invokestatic    #860 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
					return;
	//   52  110:return          
				}
				if(((JSONObject) (obj)).has("url"))
	//*  53  111:aload_1         
	//*  54  112:ldc2            #878 <String "url">
	//*  55  115:invokevirtual   #873 <Method boolean JSONObject.has(String)>
	//*  56  118:ifeq            135
				{
					processGraphObjectProperty(s, ((Object) (((JSONObject) (obj)).optString("url"))), keyvalueserializer, flag);
	//   57  121:aload_0         
	//   58  122:aload_1         
	//   59  123:ldc2            #878 <String "url">
	//   60  126:invokevirtual   #876 <Method String JSONObject.optString(String)>
	//   61  129:aload_2         
	//   62  130:iload_3         
	//   63  131:invokestatic    #860 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
					return;
	//   64  134:return          
				}
				if(((JSONObject) (obj)).has("fbsdk:create_object"))
	//*  65  135:aload_1         
	//*  66  136:ldc2            #880 <String "fbsdk:create_object">
	//*  67  139:invokevirtual   #873 <Method boolean JSONObject.has(String)>
	//*  68  142:ifeq            327
				{
					processGraphObjectProperty(s, ((Object) (((JSONObject) (obj)).toString())), keyvalueserializer, flag);
	//   69  145:aload_0         
	//   70  146:aload_1         
	//   71  147:invokevirtual   #881 <Method String JSONObject.toString()>
	//   72  150:aload_2         
	//   73  151:iload_3         
	//   74  152:invokestatic    #860 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
					return;
	//   75  155:return          
				}
			}
		} else
		if(((Class) (org/json/JSONArray)).isAssignableFrom(((Class) (obj1))))
	//*  76  156:ldc2            #883 <Class JSONArray>
	//*  77  159:aload           6
	//*  78  161:invokevirtual   #866 <Method boolean Class.isAssignableFrom(Class)>
	//*  79  164:ifeq            241
		{
			obj = ((Object) ((JSONArray)obj));
	//   80  167:aload_1         
	//   81  168:checkcast       #883 <Class JSONArray>
	//   82  171:astore_1        
			int j = ((JSONArray) (obj)).length();
	//   83  172:aload_1         
	//   84  173:invokevirtual   #886 <Method int JSONArray.length()>
	//   85  176:istore          5
			int i = 0;
	//   86  178:iconst_0        
	//   87  179:istore          4
			while(i < j) 
	//*  88  181:iload           4
	//*  89  183:iload           5
	//*  90  185:icmpge          327
			{
				obj1 = ((Object) (String.format(Locale.ROOT, "%s[%d]", new Object[] {
					s, Integer.valueOf(i)
				})));
	//   91  188:getstatic       #643 <Field Locale Locale.ROOT>
	//   92  191:ldc2            #888 <String "%s[%d]">
	//   93  194:iconst_2        
	//   94  195:anewarray       Object[]
	//   95  198:dup             
	//   96  199:iconst_0        
	//   97  200:aload_0         
	//   98  201:aastore         
	//   99  202:dup             
	//  100  203:iconst_1        
	//  101  204:iload           4
	//  102  206:invokestatic    #584 <Method Integer Integer.valueOf(int)>
	//  103  209:aastore         
	//  104  210:invokestatic    #426 <Method String String.format(Locale, String, Object[])>
	//  105  213:astore          6
				Object obj2 = ((JSONArray) (obj)).opt(i);
	//  106  215:aload_1         
	//  107  216:iload           4
	//  108  218:invokevirtual   #890 <Method Object JSONArray.opt(int)>
	//  109  221:astore          7
				try
				{
					processGraphObjectProperty(((String) (obj1)), obj2, keyvalueserializer, flag);
	//  110  223:aload           6
	//  111  225:aload           7
	//  112  227:aload_2         
	//  113  228:iload_3         
	//  114  229:invokestatic    #860 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
				}
	//* 115  232:iload           4
	//* 116  234:iconst_1        
	//* 117  235:iadd            
	//* 118  236:istore          4
	//* 119  238:goto            181
	//* 120  241:ldc1            #204 <Class String>
	//* 121  243:aload           6
	//* 122  245:invokevirtual   #866 <Method boolean Class.isAssignableFrom(Class)>
	//* 123  248:ifne            316
	//* 124  251:ldc2            #681 <Class Number>
	//* 125  254:aload           6
	//* 126  256:invokevirtual   #866 <Method boolean Class.isAssignableFrom(Class)>
	//* 127  259:ifne            316
	//* 128  262:ldc2            #353 <Class Boolean>
	//* 129  265:aload           6
	//* 130  267:invokevirtual   #866 <Method boolean Class.isAssignableFrom(Class)>
	//* 131  270:ifeq            276
	//* 132  273:goto            316
	//* 133  276:ldc2            #683 <Class Date>
	//* 134  279:aload           6
	//* 135  281:invokevirtual   #866 <Method boolean Class.isAssignableFrom(Class)>
	//* 136  284:ifeq            327
	//* 137  287:aload_1         
	//* 138  288:checkcast       #683 <Class Date>
	//* 139  291:astore_1        
	//* 140  292:aload_2         
	//* 141  293:aload_0         
	//* 142  294:new             #824 <Class SimpleDateFormat>
	//* 143  297:dup             
	//* 144  298:ldc1            #127 <String "yyyy-MM-dd'T'HH:mm:ssZ">
	//* 145  300:getstatic       #412 <Field Locale Locale.US>
	//* 146  303:invokespecial   #827 <Method void SimpleDateFormat(String, Locale)>
	//* 147  306:aload_1         
	//* 148  307:invokevirtual   #893 <Method String SimpleDateFormat.format(Date)>
	//* 149  310:invokeinterface #896 <Method void GraphRequest$KeyValueSerializer.writeString(String, String)>
	//* 150  315:return          
	//* 151  316:aload_2         
	//* 152  317:aload_0         
	//* 153  318:aload_1         
	//* 154  319:invokevirtual   #398 <Method String Object.toString()>
	//* 155  322:invokeinterface #896 <Method void GraphRequest$KeyValueSerializer.writeString(String, String)>
	//* 156  327:return          
				// Misplaced declaration of an exception variable
				catch(String s)
	//* 157  328:astore_0        
				{
					throw s;
	//  158  329:aload_0         
	//  159  330:athrow          
				}
				i++;
			}
		} else
		if(!((Class) (java/lang/String)).isAssignableFrom(((Class) (obj1))) && !((Class) (java/lang/Number)).isAssignableFrom(((Class) (obj1))) && !((Class) (java/lang/Boolean)).isAssignableFrom(((Class) (obj1))))
		{
			if(((Class) (java/util/Date)).isAssignableFrom(((Class) (obj1))))
			{
				obj = ((Object) ((Date)obj));
				keyvalueserializer.writeString(s, (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(((Date) (obj))));
				return;
			}
		} else
		{
			keyvalueserializer.writeString(s, obj.toString());
		}
	}

	private static void processRequest(GraphRequestBatch graphrequestbatch, Logger logger, int i, URL url, OutputStream outputstream, boolean flag)
		throws IOException, JSONException
	{
label0:
		{
			outputstream = ((OutputStream) (new Serializer(outputstream, logger, flag)));
	//    0    0:new             #41  <Class GraphRequest$Serializer>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:aload_1         
	//    4    7:iload           5
	//    5    9:invokespecial   #903 <Method void GraphRequest$Serializer(OutputStream, Logger, boolean)>
	//    6   12:astore          4
			if(i == 1)
	//*   7   14:iload_2         
	//*   8   15:iconst_1        
	//*   9   16:icmpne          171
			{
				graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.get(0)));
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #906 <Method GraphRequest GraphRequestBatch.get(int)>
	//   13   24:astore_0        
				HashMap hashmap = new HashMap();
	//   14   25:new             #908 <Class HashMap>
	//   15   28:dup             
	//   16   29:invokespecial   #909 <Method void HashMap()>
	//   17   32:astore          6
				Iterator iterator = ((GraphRequest) (graphrequestbatch)).parameters.keySet().iterator();
	//   18   34:aload_0         
	//   19   35:getfield        #265 <Field Bundle parameters>
	//   20   38:invokevirtual   #376 <Method Set Bundle.keySet()>
	//   21   41:invokeinterface #382 <Method Iterator Set.iterator()>
	//   22   46:astore          7
				do
				{
					if(!iterator.hasNext())
						break;
	//   23   48:aload           7
	//   24   50:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//   25   55:ifeq            112
					String s = (String)iterator.next();
	//   26   58:aload           7
	//   27   60:invokeinterface #391 <Method Object Iterator.next()>
	//   28   65:checkcast       #204 <Class String>
	//   29   68:astore          8
					Object obj = ((GraphRequest) (graphrequestbatch)).parameters.get(s);
	//   30   70:aload_0         
	//   31   71:getfield        #265 <Field Bundle parameters>
	//   32   74:aload           8
	//   33   76:invokevirtual   #395 <Method Object Bundle.get(String)>
	//   34   79:astore          9
					if(isSupportedAttachmentType(obj))
	//*  35   81:aload           9
	//*  36   83:invokestatic    #661 <Method boolean isSupportedAttachmentType(Object)>
	//*  37   86:ifeq            48
						((Map) (hashmap)).put(((Object) (s)), ((Object) (new Attachment(((GraphRequest) (graphrequestbatch)), obj))));
	//   38   89:aload           6
	//   39   91:aload           8
	//   40   93:new             #18  <Class GraphRequest$Attachment>
	//   41   96:dup             
	//   42   97:aload_0         
	//   43   98:aload           9
	//   44  100:invokespecial   #912 <Method void GraphRequest$Attachment(GraphRequest, Object)>
	//   45  103:invokeinterface #918 <Method Object Map.put(Object, Object)>
	//   46  108:pop             
				} while(true);
	//   47  109:goto            48
				if(logger != null)
	//*  48  112:aload_1         
	//*  49  113:ifnull          123
					logger.append("  Parameters:\n");
	//   50  116:aload_1         
	//   51  117:ldc2            #920 <String "  Parameters:\n">
	//   52  120:invokevirtual   #922 <Method void Logger.append(String)>
				serializeParameters(((GraphRequest) (graphrequestbatch)).parameters, ((Serializer) (outputstream)), ((GraphRequest) (graphrequestbatch)));
	//   53  123:aload_0         
	//   54  124:getfield        #265 <Field Bundle parameters>
	//   55  127:aload           4
	//   56  129:aload_0         
	//   57  130:invokestatic    #926 <Method void serializeParameters(Bundle, GraphRequest$Serializer, GraphRequest)>
				if(logger != null)
	//*  58  133:aload_1         
	//*  59  134:ifnull          144
					logger.append("  Attachments:\n");
	//   60  137:aload_1         
	//   61  138:ldc2            #928 <String "  Attachments:\n">
	//   62  141:invokevirtual   #922 <Method void Logger.append(String)>
				serializeAttachments(((Map) (hashmap)), ((Serializer) (outputstream)));
	//   63  144:aload           6
	//   64  146:aload           4
	//   65  148:invokestatic    #932 <Method void serializeAttachments(Map, GraphRequest$Serializer)>
				graphrequestbatch = ((GraphRequestBatch) (((GraphRequest) (graphrequestbatch)).graphObject));
	//   66  151:aload_0         
	//   67  152:getfield        #934 <Field JSONObject graphObject>
	//   68  155:astore_0        
				if(graphrequestbatch != null)
	//*  69  156:aload_0         
	//*  70  157:ifnull          223
				{
					processGraphObject(((JSONObject) (graphrequestbatch)), url.getPath(), ((KeyValueSerializer) (outputstream)));
	//   71  160:aload_0         
	//   72  161:aload_3         
	//   73  162:invokevirtual   #935 <Method String URL.getPath()>
	//   74  165:aload           4
	//   75  167:invokestatic    #937 <Method void processGraphObject(JSONObject, String, GraphRequest$KeyValueSerializer)>
					return;
	//   76  170:return          
				}
			} else
			{
				url = ((URL) (getBatchAppId(graphrequestbatch)));
	//   77  171:aload_0         
	//   78  172:invokestatic    #939 <Method String getBatchAppId(GraphRequestBatch)>
	//   79  175:astore_3        
				if(Utility.isNullOrEmpty(((String) (url))))
					break label0;
	//   80  176:aload_3         
	//   81  177:invokestatic    #324 <Method boolean Utility.isNullOrEmpty(String)>
	//   82  180:ifne            224
				((Serializer) (outputstream)).writeString("batch_app_id", ((String) (url)));
	//   83  183:aload           4
	//   84  185:ldc1            #58  <String "batch_app_id">
	//   85  187:aload_3         
	//   86  188:invokevirtual   #940 <Method void GraphRequest$Serializer.writeString(String, String)>
				url = ((URL) (new HashMap()));
	//   87  191:new             #908 <Class HashMap>
	//   88  194:dup             
	//   89  195:invokespecial   #909 <Method void HashMap()>
	//   90  198:astore_3        
				serializeRequestsAsJSON(((Serializer) (outputstream)), ((Collection) (graphrequestbatch)), ((Map) (url)));
	//   91  199:aload           4
	//   92  201:aload_0         
	//   93  202:aload_3         
	//   94  203:invokestatic    #944 <Method void serializeRequestsAsJSON(GraphRequest$Serializer, Collection, Map)>
				if(logger != null)
	//*  95  206:aload_1         
	//*  96  207:ifnull          217
					logger.append("  Attachments:\n");
	//   97  210:aload_1         
	//   98  211:ldc2            #928 <String "  Attachments:\n">
	//   99  214:invokevirtual   #922 <Method void Logger.append(String)>
				serializeAttachments(((Map) (url)), ((Serializer) (outputstream)));
	//  100  217:aload_3         
	//  101  218:aload           4
	//  102  220:invokestatic    #932 <Method void serializeAttachments(Map, GraphRequest$Serializer)>
			}
			return;
	//  103  223:return          
		}
		throw new FacebookException("App ID was not specified at the request or Settings.");
	//  104  224:new             #474 <Class FacebookException>
	//  105  227:dup             
	//  106  228:ldc2            #946 <String "App ID was not specified at the request or Settings.">
	//  107  231:invokespecial   #477 <Method void FacebookException(String)>
	//  108  234:athrow          
	}

	static void runCallbacks(GraphRequestBatch graphrequestbatch, List list)
	{
		int j = graphrequestbatch.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #567 <Method int GraphRequestBatch.size()>
	//    2    4:istore_3        
		ArrayList arraylist = new ArrayList();
	//    3    5:new             #948 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #949 <Method void ArrayList()>
	//    6   12:astore          4
		for(int i = 0; i < j; i++)
	//*   7   14:iconst_0        
	//*   8   15:istore_2        
	//*   9   16:iload_2         
	//*  10   17:iload_3         
	//*  11   18:icmpge          65
		{
			Callback callback1 = graphrequestbatch.get(i).callback;
	//   12   21:aload_0         
	//   13   22:iload_2         
	//   14   23:invokevirtual   #906 <Method GraphRequest GraphRequestBatch.get(int)>
	//   15   26:getfield        #951 <Field GraphRequest$Callback callback>
	//   16   29:astore          5
			if(callback1 != null)
	//*  17   31:aload           5
	//*  18   33:ifnull          58
				arraylist.add(((Object) (new Pair(((Object) (callback1)), list.get(i)))));
	//   19   36:aload           4
	//   20   38:new             #953 <Class Pair>
	//   21   41:dup             
	//   22   42:aload           5
	//   23   44:aload_1         
	//   24   45:iload_2         
	//   25   46:invokeinterface #470 <Method Object List.get(int)>
	//   26   51:invokespecial   #956 <Method void Pair(Object, Object)>
	//   27   54:invokevirtual   #959 <Method boolean ArrayList.add(Object)>
	//   28   57:pop             
		}

	//   29   58:iload_2         
	//   30   59:iconst_1        
	//   31   60:iadd            
	//   32   61:istore_2        
	//*  33   62:goto            16
		if(arraylist.size() > 0)
	//*  34   65:aload           4
	//*  35   67:invokevirtual   #960 <Method int ArrayList.size()>
	//*  36   70:ifle            106
		{
			list = ((List) (new Runnable(arraylist, graphrequestbatch) {

				public void run()
				{
					Pair pair;
					for(Iterator iterator = callbacks.iterator(); iterator.hasNext(); ((Callback)pair.first).onCompleted((GraphResponse)pair.second))
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field ArrayList val$callbacks>
				//*   2    4:invokevirtual   #32  <Method Iterator ArrayList.iterator()>
				//*   3    7:astore_1        
				//*   4    8:aload_1         
				//*   5    9:invokeinterface #38  <Method boolean Iterator.hasNext()>
				//*   6   14:ifeq            49
						pair = (Pair)iterator.next();
				//    7   17:aload_1         
				//    8   18:invokeinterface #42  <Method Object Iterator.next()>
				//    9   23:checkcast       #44  <Class Pair>
				//   10   26:astore_2        

				//   11   27:aload_2         
				//   12   28:getfield        #48  <Field Object Pair.first>
				//   13   31:checkcast       #50  <Class GraphRequest$Callback>
				//   14   34:aload_2         
				//   15   35:getfield        #53  <Field Object Pair.second>
				//   16   38:checkcast       #55  <Class GraphResponse>
				//   17   41:invokeinterface #59  <Method void GraphRequest$Callback.onCompleted(GraphResponse)>
				//*  18   46:goto            8
					for(Iterator iterator1 = requests.getCallbacks().iterator(); iterator1.hasNext(); ((GraphRequestBatch.Callback)iterator1.next()).onBatchCompleted(requests));
				//   19   49:aload_0         
				//   20   50:getfield        #21  <Field GraphRequestBatch val$requests>
				//   21   53:invokevirtual   #65  <Method List GraphRequestBatch.getCallbacks()>
				//   22   56:invokeinterface #68  <Method Iterator List.iterator()>
				//   23   61:astore_1        
				//   24   62:aload_1         
				//   25   63:invokeinterface #38  <Method boolean Iterator.hasNext()>
				//   26   68:ifeq            92
				//   27   71:aload_1         
				//   28   72:invokeinterface #42  <Method Object Iterator.next()>
				//   29   77:checkcast       #70  <Class GraphRequestBatch$Callback>
				//   30   80:aload_0         
				//   31   81:getfield        #21  <Field GraphRequestBatch val$requests>
				//   32   84:invokeinterface #74  <Method void GraphRequestBatch$Callback.onBatchCompleted(GraphRequestBatch)>
				//*  33   89:goto            62
				//   34   92:return          
				}

				final ArrayList val$callbacks;
				final GraphRequestBatch val$requests;

			
			{
				callbacks = arraylist;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ArrayList val$callbacks>
				requests = graphrequestbatch;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field GraphRequestBatch val$requests>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   37   73:new             #14  <Class GraphRequest$5>
	//   38   76:dup             
	//   39   77:aload           4
	//   40   79:aload_0         
	//   41   80:invokespecial   #963 <Method void GraphRequest$5(ArrayList, GraphRequestBatch)>
	//   42   83:astore_1        
			graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.getCallbackHandler()));
	//   43   84:aload_0         
	//   44   85:invokevirtual   #967 <Method Handler GraphRequestBatch.getCallbackHandler()>
	//   45   88:astore_0        
			if(graphrequestbatch == null)
	//*  46   89:aload_0         
	//*  47   90:ifnonnull       100
			{
				((Runnable) (list)).run();
	//   48   93:aload_1         
	//   49   94:invokeinterface #972 <Method void Runnable.run()>
				return;
	//   50   99:return          
			}
			((Handler) (graphrequestbatch)).post(((Runnable) (list)));
	//   51  100:aload_0         
	//   52  101:aload_1         
	//   53  102:invokevirtual   #978 <Method boolean Handler.post(Runnable)>
	//   54  105:pop             
		}
	//   55  106:return          
	}

	private static void serializeAttachments(Map map, Serializer serializer)
		throws IOException
	{
		Iterator iterator = map.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:invokeinterface #980 <Method Set Map.keySet()>
	//    2    6:invokeinterface #382 <Method Iterator Set.iterator()>
	//    3   11:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   12:aload_2         
	//    5   13:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//    6   18:ifeq            72
			String s = (String)iterator.next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #391 <Method Object Iterator.next()>
	//    9   27:checkcast       #204 <Class String>
	//   10   30:astore_3        
			Attachment attachment = (Attachment)map.get(((Object) (s)));
	//   11   31:aload_0         
	//   12   32:aload_3         
	//   13   33:invokeinterface #983 <Method Object Map.get(Object)>
	//   14   38:checkcast       #18  <Class GraphRequest$Attachment>
	//   15   41:astore          4
			if(isSupportedAttachmentType(attachment.getValue()))
	//*  16   43:aload           4
	//*  17   45:invokevirtual   #986 <Method Object GraphRequest$Attachment.getValue()>
	//*  18   48:invokestatic    #661 <Method boolean isSupportedAttachmentType(Object)>
	//*  19   51:ifeq            12
				serializer.writeObject(s, attachment.getValue(), attachment.getRequest());
	//   20   54:aload_1         
	//   21   55:aload_3         
	//   22   56:aload           4
	//   23   58:invokevirtual   #986 <Method Object GraphRequest$Attachment.getValue()>
	//   24   61:aload           4
	//   25   63:invokevirtual   #990 <Method GraphRequest GraphRequest$Attachment.getRequest()>
	//   26   66:invokevirtual   #994 <Method void GraphRequest$Serializer.writeObject(String, Object, GraphRequest)>
		} while(true);
	//   27   69:goto            12
	//   28   72:return          
	}

	private static void serializeParameters(Bundle bundle, Serializer serializer, GraphRequest graphrequest)
		throws IOException
	{
		Iterator iterator = bundle.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #376 <Method Set Bundle.keySet()>
	//    2    4:invokeinterface #382 <Method Iterator Set.iterator()>
	//    3    9:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   10:aload_3         
	//    5   11:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            58
			String s = (String)iterator.next();
	//    7   19:aload_3         
	//    8   20:invokeinterface #391 <Method Object Iterator.next()>
	//    9   25:checkcast       #204 <Class String>
	//   10   28:astore          4
			Object obj = bundle.get(s);
	//   11   30:aload_0         
	//   12   31:aload           4
	//   13   33:invokevirtual   #395 <Method Object Bundle.get(String)>
	//   14   36:astore          5
			if(isSupportedParameterType(obj))
	//*  15   38:aload           5
	//*  16   40:invokestatic    #287 <Method boolean isSupportedParameterType(Object)>
	//*  17   43:ifeq            10
				serializer.writeObject(s, obj, graphrequest);
	//   18   46:aload_1         
	//   19   47:aload           4
	//   20   49:aload           5
	//   21   51:aload_2         
	//   22   52:invokevirtual   #994 <Method void GraphRequest$Serializer.writeObject(String, Object, GraphRequest)>
		} while(true);
	//   23   55:goto            10
	//   24   58:return          
	}

	private static void serializeRequestsAsJSON(Serializer serializer, Collection collection, Map map)
		throws JSONException, IOException
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #883 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #996 <Method void JSONArray()>
	//    3    7:astore_3        
		for(Iterator iterator = collection.iterator(); iterator.hasNext(); ((GraphRequest)iterator.next()).serializeToBatch(jsonarray, map));
	//    4    8:aload_1         
	//    5    9:invokeinterface #999 <Method Iterator Collection.iterator()>
	//    6   14:astore          4
	//    7   16:aload           4
	//    8   18:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            44
	//   10   26:aload           4
	//   11   28:invokeinterface #391 <Method Object Iterator.next()>
	//   12   33:checkcast       #2   <Class GraphRequest>
	//   13   36:aload_3         
	//   14   37:aload_2         
	//   15   38:invokespecial   #1003 <Method void serializeToBatch(JSONArray, Map)>
	//*  16   41:goto            16
		serializer.writeRequestsAsJson("batch", jsonarray, collection);
	//   17   44:aload_0         
	//   18   45:ldc1            #76  <String "batch">
	//   19   47:aload_3         
	//   20   48:aload_1         
	//   21   49:invokevirtual   #1007 <Method void GraphRequest$Serializer.writeRequestsAsJson(String, JSONArray, Collection)>
	//   22   52:return          
	}

	private void serializeToBatch(JSONArray jsonarray, final Map keysAndValues)
		throws JSONException, IOException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #845 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #1009 <Method void JSONObject()>
	//    3    7:astore_3        
		String s = batchEntryName;
	//    4    8:aload_0         
	//    5    9:getfield        #1011 <Field String batchEntryName>
	//    6   12:astore          4
		if(s != null)
	//*   7   14:aload           4
	//*   8   16:ifnull          39
		{
			jsonobject.put("name", ((Object) (s)));
	//    9   19:aload_3         
	//   10   20:ldc1            #67  <String "name">
	//   11   22:aload           4
	//   12   24:invokevirtual   #1014 <Method JSONObject JSONObject.put(String, Object)>
	//   13   27:pop             
			jsonobject.put("omit_response_on_success", batchEntryOmitResultOnSuccess);
	//   14   28:aload_3         
	//   15   29:ldc1            #70  <String "omit_response_on_success">
	//   16   31:aload_0         
	//   17   32:getfield        #242 <Field boolean batchEntryOmitResultOnSuccess>
	//   18   35:invokevirtual   #1017 <Method JSONObject JSONObject.put(String, boolean)>
	//   19   38:pop             
		}
		s = batchEntryDependsOn;
	//   20   39:aload_0         
	//   21   40:getfield        #1019 <Field String batchEntryDependsOn>
	//   22   43:astore          4
		if(s != null)
	//*  23   45:aload           4
	//*  24   47:ifnull          59
			jsonobject.put("depends_on", ((Object) (s)));
	//   25   50:aload_3         
	//   26   51:ldc1            #64  <String "depends_on">
	//   27   53:aload           4
	//   28   55:invokevirtual   #1014 <Method JSONObject JSONObject.put(String, Object)>
	//   29   58:pop             
		s = getRelativeUrlForBatchedRequest();
	//   30   59:aload_0         
	//   31   60:invokevirtual   #1022 <Method String getRelativeUrlForBatchedRequest()>
	//   32   63:astore          4
		jsonobject.put("relative_url", ((Object) (s)));
	//   33   65:aload_3         
	//   34   66:ldc1            #79  <String "relative_url">
	//   35   68:aload           4
	//   36   70:invokevirtual   #1014 <Method JSONObject JSONObject.put(String, Object)>
	//   37   73:pop             
		jsonobject.put("method", ((Object) (httpMethod)));
	//   38   74:aload_3         
	//   39   75:ldc1            #73  <String "method">
	//   40   77:aload_0         
	//   41   78:getfield        #359 <Field HttpMethod httpMethod>
	//   42   81:invokevirtual   #1014 <Method JSONObject JSONObject.put(String, Object)>
	//   43   84:pop             
		Object obj = ((Object) (accessToken));
	//   44   85:aload_0         
	//   45   86:getfield        #246 <Field AccessToken accessToken>
	//   46   89:astore          5
		if(obj != null)
	//*  47   91:aload           5
	//*  48   93:ifnull          104
			Logger.registerAccessToken(((AccessToken) (obj)).getToken());
	//   49   96:aload           5
	//   50   98:invokevirtual   #303 <Method String AccessToken.getToken()>
	//   51  101:invokestatic    #309 <Method void Logger.registerAccessToken(String)>
		obj = ((Object) (new ArrayList()));
	//   52  104:new             #948 <Class ArrayList>
	//   53  107:dup             
	//   54  108:invokespecial   #949 <Method void ArrayList()>
	//   55  111:astore          5
		Iterator iterator = parameters.keySet().iterator();
	//   56  113:aload_0         
	//   57  114:getfield        #265 <Field Bundle parameters>
	//   58  117:invokevirtual   #376 <Method Set Bundle.keySet()>
	//   59  120:invokeinterface #382 <Method Iterator Set.iterator()>
	//   60  125:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//   61  127:aload           6
	//   62  129:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//   63  134:ifeq            230
			Object obj1 = ((Object) ((String)iterator.next()));
	//   64  137:aload           6
	//   65  139:invokeinterface #391 <Method Object Iterator.next()>
	//   66  144:checkcast       #204 <Class String>
	//   67  147:astore          7
			obj1 = parameters.get(((String) (obj1)));
	//   68  149:aload_0         
	//   69  150:getfield        #265 <Field Bundle parameters>
	//   70  153:aload           7
	//   71  155:invokevirtual   #395 <Method Object Bundle.get(String)>
	//   72  158:astore          7
			if(isSupportedAttachmentType(obj1))
	//*  73  160:aload           7
	//*  74  162:invokestatic    #661 <Method boolean isSupportedAttachmentType(Object)>
	//*  75  165:ifeq            127
			{
				String s1 = String.format(Locale.ROOT, "%s%d", new Object[] {
					"file", Integer.valueOf(keysAndValues.size())
				});
	//   76  168:getstatic       #643 <Field Locale Locale.ROOT>
	//   77  171:ldc2            #1024 <String "%s%d">
	//   78  174:iconst_2        
	//   79  175:anewarray       Object[]
	//   80  178:dup             
	//   81  179:iconst_0        
	//   82  180:ldc1            #55  <String "file">
	//   83  182:aastore         
	//   84  183:dup             
	//   85  184:iconst_1        
	//   86  185:aload_2         
	//   87  186:invokeinterface #1025 <Method int Map.size()>
	//   88  191:invokestatic    #584 <Method Integer Integer.valueOf(int)>
	//   89  194:aastore         
	//   90  195:invokestatic    #426 <Method String String.format(Locale, String, Object[])>
	//   91  198:astore          8
				((ArrayList) (obj)).add(((Object) (s1)));
	//   92  200:aload           5
	//   93  202:aload           8
	//   94  204:invokevirtual   #959 <Method boolean ArrayList.add(Object)>
	//   95  207:pop             
				keysAndValues.put(((Object) (s1)), ((Object) (new Attachment(this, obj1))));
	//   96  208:aload_2         
	//   97  209:aload           8
	//   98  211:new             #18  <Class GraphRequest$Attachment>
	//   99  214:dup             
	//  100  215:aload_0         
	//  101  216:aload           7
	//  102  218:invokespecial   #912 <Method void GraphRequest$Attachment(GraphRequest, Object)>
	//  103  221:invokeinterface #918 <Method Object Map.put(Object, Object)>
	//  104  226:pop             
			}
		} while(true);
	//  105  227:goto            127
		if(!((ArrayList) (obj)).isEmpty())
	//* 106  230:aload           5
	//* 107  232:invokevirtual   #1026 <Method boolean ArrayList.isEmpty()>
	//* 108  235:ifne            253
			jsonobject.put("attached_files", ((Object) (TextUtils.join(",", ((Iterable) (obj))))));
	//  109  238:aload_3         
	//  110  239:ldc1            #52  <String "attached_files">
	//  111  241:ldc2            #1028 <String ",">
	//  112  244:aload           5
	//  113  246:invokestatic    #1034 <Method String TextUtils.join(CharSequence, Iterable)>
	//  114  249:invokevirtual   #1014 <Method JSONObject JSONObject.put(String, Object)>
	//  115  252:pop             
		if(graphObject != null)
	//* 116  253:aload_0         
	//* 117  254:getfield        #934 <Field JSONObject graphObject>
	//* 118  257:ifnull          300
		{
			keysAndValues = ((Map) (new ArrayList()));
	//  119  260:new             #948 <Class ArrayList>
	//  120  263:dup             
	//  121  264:invokespecial   #949 <Method void ArrayList()>
	//  122  267:astore_2        
			processGraphObject(graphObject, s, new KeyValueSerializer() {

				public void writeString(String s2, String s3)
					throws IOException
				{
					keysAndValues.add(((Object) (String.format(Locale.US, "%s=%s", new Object[] {
						s2, URLEncoder.encode(s3, "UTF-8")
					}))));
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field ArrayList val$keysAndValues>
				//    2    4:getstatic       #35  <Field Locale Locale.US>
				//    3    7:ldc1            #37  <String "%s=%s">
				//    4    9:iconst_2        
				//    5   10:anewarray       Object[]
				//    6   13:dup             
				//    7   14:iconst_0        
				//    8   15:aload_1         
				//    9   16:aastore         
				//   10   17:dup             
				//   11   18:iconst_1        
				//   12   19:aload_2         
				//   13   20:ldc1            #39  <String "UTF-8">
				//   14   22:invokestatic    #45  <Method String URLEncoder.encode(String, String)>
				//   15   25:aastore         
				//   16   26:invokestatic    #51  <Method String String.format(Locale, String, Object[])>
				//   17   29:invokevirtual   #57  <Method boolean ArrayList.add(Object)>
				//   18   32:pop             
				//   19   33:return          
				}

				final GraphRequest this$0;
				final ArrayList val$keysAndValues;

			
			{
				this$0 = GraphRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GraphRequest this$0>
				keysAndValues = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ArrayList val$keysAndValues>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//  123  268:aload_0         
	//  124  269:getfield        #934 <Field JSONObject graphObject>
	//  125  272:aload           4
	//  126  274:new             #16  <Class GraphRequest$6>
	//  127  277:dup             
	//  128  278:aload_0         
	//  129  279:aload_2         
	//  130  280:invokespecial   #1037 <Method void GraphRequest$6(GraphRequest, ArrayList)>
	//  131  283:invokestatic    #937 <Method void processGraphObject(JSONObject, String, GraphRequest$KeyValueSerializer)>
			jsonobject.put("body", ((Object) (TextUtils.join("&", ((Iterable) (keysAndValues))))));
	//  132  286:aload_3         
	//  133  287:ldc1            #61  <String "body">
	//  134  289:ldc2            #1039 <String "&">
	//  135  292:aload_2         
	//  136  293:invokestatic    #1034 <Method String TextUtils.join(CharSequence, Iterable)>
	//  137  296:invokevirtual   #1014 <Method JSONObject JSONObject.put(String, Object)>
	//  138  299:pop             
		}
		jsonarray.put(((Object) (jsonobject)));
	//  139  300:aload_1         
	//  140  301:aload_3         
	//  141  302:invokevirtual   #1042 <Method JSONArray JSONArray.put(Object)>
	//  142  305:pop             
	//  143  306:return          
	}

	static final void serializeToUrlConnection(GraphRequestBatch graphrequestbatch, HttpURLConnection httpurlconnection)
		throws IOException, JSONException
	{
		int j;
		boolean flag1;
		Logger logger;
		URL url;
		logger = new Logger(LoggingBehavior.REQUESTS, "Request");
	//    0    0:new             #305 <Class Logger>
	//    1    3:dup             
	//    2    4:getstatic       #1048 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//    3    7:ldc2            #1050 <String "Request">
	//    4   10:invokespecial   #1053 <Method void Logger(LoggingBehavior, String)>
	//    5   13:astore          7
		j = graphrequestbatch.size();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #567 <Method int GraphRequestBatch.size()>
	//    8   19:istore_3        
		flag1 = isGzipCompressible(graphrequestbatch);
	//    9   20:aload_0         
	//   10   21:invokestatic    #1055 <Method boolean isGzipCompressible(GraphRequestBatch)>
	//   11   24:istore          4
		boolean flag = false;
	//   12   26:iconst_0        
	//   13   27:istore_2        
		HttpMethod httpmethod;
		if(j == 1)
	//*  14   28:iload_3         
	//*  15   29:iconst_1        
	//*  16   30:icmpne          46
			httpmethod = graphrequestbatch.get(0).httpMethod;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #906 <Method GraphRequest GraphRequestBatch.get(int)>
	//   20   38:getfield        #359 <Field HttpMethod httpMethod>
	//   21   41:astore          5
		else
	//*  22   43:goto            51
			httpmethod = HttpMethod.POST;
	//   23   46:getstatic       #362 <Field HttpMethod HttpMethod.POST>
	//   24   49:astore          5
		httpurlconnection.setRequestMethod(httpmethod.name());
	//   25   51:aload_1         
	//   26   52:aload           5
	//   27   54:invokevirtual   #1057 <Method String HttpMethod.name()>
	//   28   57:invokevirtual   #1060 <Method void HttpURLConnection.setRequestMethod(String)>
		setConnectionContentType(httpurlconnection, flag1);
	//   29   60:aload_1         
	//   30   61:iload           4
	//   31   63:invokestatic    #1064 <Method void setConnectionContentType(HttpURLConnection, boolean)>
		url = httpurlconnection.getURL();
	//   32   66:aload_1         
	//   33   67:invokevirtual   #1068 <Method URL HttpURLConnection.getURL()>
	//   34   70:astore          8
		logger.append("Request:\n");
	//   35   72:aload           7
	//   36   74:ldc2            #1070 <String "Request:\n">
	//   37   77:invokevirtual   #922 <Method void Logger.append(String)>
		logger.appendKeyValue("Id", ((Object) (graphrequestbatch.getId())));
	//   38   80:aload           7
	//   39   82:ldc2            #1072 <String "Id">
	//   40   85:aload_0         
	//   41   86:invokevirtual   #1075 <Method String GraphRequestBatch.getId()>
	//   42   89:invokevirtual   #1079 <Method void Logger.appendKeyValue(String, Object)>
		logger.appendKeyValue("URL", ((Object) (url)));
	//   43   92:aload           7
	//   44   94:ldc2            #1081 <String "URL">
	//   45   97:aload           8
	//   46   99:invokevirtual   #1079 <Method void Logger.appendKeyValue(String, Object)>
		logger.appendKeyValue("Method", ((Object) (httpurlconnection.getRequestMethod())));
	//   47  102:aload           7
	//   48  104:ldc2            #1083 <String "Method">
	//   49  107:aload_1         
	//   50  108:invokevirtual   #1086 <Method String HttpURLConnection.getRequestMethod()>
	//   51  111:invokevirtual   #1079 <Method void Logger.appendKeyValue(String, Object)>
		logger.appendKeyValue("User-Agent", ((Object) (httpurlconnection.getRequestProperty("User-Agent"))));
	//   52  114:aload           7
	//   53  116:ldc1            #161 <String "User-Agent">
	//   54  118:aload_1         
	//   55  119:ldc1            #161 <String "User-Agent">
	//   56  121:invokevirtual   #1089 <Method String HttpURLConnection.getRequestProperty(String)>
	//   57  124:invokevirtual   #1079 <Method void Logger.appendKeyValue(String, Object)>
		logger.appendKeyValue("Content-Type", ((Object) (httpurlconnection.getRequestProperty("Content-Type"))));
	//   58  127:aload           7
	//   59  129:ldc1            #88  <String "Content-Type">
	//   60  131:aload_1         
	//   61  132:ldc1            #88  <String "Content-Type">
	//   62  134:invokevirtual   #1089 <Method String HttpURLConnection.getRequestProperty(String)>
	//   63  137:invokevirtual   #1079 <Method void Logger.appendKeyValue(String, Object)>
		httpurlconnection.setConnectTimeout(graphrequestbatch.getTimeout());
	//   64  140:aload_1         
	//   65  141:aload_0         
	//   66  142:invokevirtual   #1092 <Method int GraphRequestBatch.getTimeout()>
	//   67  145:invokevirtual   #1095 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setReadTimeout(graphrequestbatch.getTimeout());
	//   68  148:aload_1         
	//   69  149:aload_0         
	//   70  150:invokevirtual   #1092 <Method int GraphRequestBatch.getTimeout()>
	//   71  153:invokevirtual   #1098 <Method void HttpURLConnection.setReadTimeout(int)>
		if(httpmethod == HttpMethod.POST)
	//*  72  156:aload           5
	//*  73  158:getstatic       #362 <Field HttpMethod HttpMethod.POST>
	//*  74  161:if_acmpne       166
			flag = true;
	//   75  164:iconst_1        
	//   76  165:istore_2        
		if(!flag)
	//*  77  166:iload_2         
	//*  78  167:ifne            176
		{
			logger.log();
	//   79  170:aload           7
	//   80  172:invokevirtual   #1101 <Method void Logger.log()>
			return;
	//   81  175:return          
		}
		httpurlconnection.setDoOutput(true);
	//   82  176:aload_1         
	//   83  177:iconst_1        
	//   84  178:invokevirtual   #1105 <Method void HttpURLConnection.setDoOutput(boolean)>
		httpurlconnection = ((HttpURLConnection) (new BufferedOutputStream(httpurlconnection.getOutputStream())));
	//   85  181:new             #1107 <Class BufferedOutputStream>
	//   86  184:dup             
	//   87  185:aload_1         
	//   88  186:invokevirtual   #1111 <Method OutputStream HttpURLConnection.getOutputStream()>
	//   89  189:invokespecial   #1114 <Method void BufferedOutputStream(OutputStream)>
	//   90  192:astore_1        
		if(!flag1)
			break MISSING_BLOCK_LABEL_221;
	//   91  193:iload           4
	//   92  195:ifeq            221
		Object obj = ((Object) (new GZIPOutputStream(((OutputStream) (httpurlconnection)))));
	//   93  198:new             #1116 <Class GZIPOutputStream>
	//   94  201:dup             
	//   95  202:aload_1         
	//   96  203:invokespecial   #1117 <Method void GZIPOutputStream(OutputStream)>
	//   97  206:astore          5
		httpurlconnection = ((HttpURLConnection) (obj));
	//   98  208:aload           5
	//   99  210:astore_1        
		break MISSING_BLOCK_LABEL_221;
	//  100  211:goto            221
		graphrequestbatch;
	//  101  214:astore_0        
		obj = ((Object) (httpurlconnection));
	//  102  215:aload_1         
	//  103  216:astore          5
		break MISSING_BLOCK_LABEL_331;
	//  104  218:goto            331
		Object obj1;
		obj1 = ((Object) (httpurlconnection));
	//  105  221:aload_1         
	//  106  222:astore          6
		obj = ((Object) (httpurlconnection));
	//  107  224:aload_1         
	//  108  225:astore          5
		if(!hasOnProgressCallbacks(graphrequestbatch))
			break MISSING_BLOCK_LABEL_295;
	//  109  227:aload_0         
	//  110  228:invokestatic    #1119 <Method boolean hasOnProgressCallbacks(GraphRequestBatch)>
	//  111  231:ifeq            295
		obj = ((Object) (httpurlconnection));
	//  112  234:aload_1         
	//  113  235:astore          5
		obj1 = ((Object) (new ProgressNoopOutputStream(graphrequestbatch.getCallbackHandler())));
	//  114  237:new             #1121 <Class ProgressNoopOutputStream>
	//  115  240:dup             
	//  116  241:aload_0         
	//  117  242:invokevirtual   #967 <Method Handler GraphRequestBatch.getCallbackHandler()>
	//  118  245:invokespecial   #1123 <Method void ProgressNoopOutputStream(Handler)>
	//  119  248:astore          6
		obj = ((Object) (httpurlconnection));
	//  120  250:aload_1         
	//  121  251:astore          5
		processRequest(graphrequestbatch, ((Logger) (null)), j, url, ((OutputStream) (obj1)), flag1);
	//  122  253:aload_0         
	//  123  254:aconst_null     
	//  124  255:iload_3         
	//  125  256:aload           8
	//  126  258:aload           6
	//  127  260:iload           4
	//  128  262:invokestatic    #1125 <Method void processRequest(GraphRequestBatch, Logger, int, URL, OutputStream, boolean)>
		obj = ((Object) (httpurlconnection));
	//  129  265:aload_1         
	//  130  266:astore          5
		int i = ((ProgressNoopOutputStream) (obj1)).getMaxProgress();
	//  131  268:aload           6
	//  132  270:invokevirtual   #1128 <Method int ProgressNoopOutputStream.getMaxProgress()>
	//  133  273:istore_2        
		obj = ((Object) (httpurlconnection));
	//  134  274:aload_1         
	//  135  275:astore          5
		obj1 = ((Object) (new ProgressOutputStream(((OutputStream) (httpurlconnection)), graphrequestbatch, ((ProgressNoopOutputStream) (obj1)).getProgressMap(), i)));
	//  136  277:new             #1130 <Class ProgressOutputStream>
	//  137  280:dup             
	//  138  281:aload_1         
	//  139  282:aload_0         
	//  140  283:aload           6
	//  141  285:invokevirtual   #1134 <Method Map ProgressNoopOutputStream.getProgressMap()>
	//  142  288:iload_2         
	//  143  289:i2l             
	//  144  290:invokespecial   #1137 <Method void ProgressOutputStream(OutputStream, GraphRequestBatch, Map, long)>
	//  145  293:astore          6
		obj = obj1;
	//  146  295:aload           6
	//  147  297:astore          5
		processRequest(graphrequestbatch, logger, j, url, ((OutputStream) (obj1)), flag1);
	//  148  299:aload_0         
	//  149  300:aload           7
	//  150  302:iload_3         
	//  151  303:aload           8
	//  152  305:aload           6
	//  153  307:iload           4
	//  154  309:invokestatic    #1125 <Method void processRequest(GraphRequestBatch, Logger, int, URL, OutputStream, boolean)>
		((OutputStream) (obj1)).close();
	//  155  312:aload           6
	//  156  314:invokevirtual   #1142 <Method void OutputStream.close()>
		logger.log();
	//  157  317:aload           7
	//  158  319:invokevirtual   #1101 <Method void Logger.log()>
		return;
	//  159  322:return          
		graphrequestbatch;
	//  160  323:astore_0        
		break MISSING_BLOCK_LABEL_331;
	//  161  324:goto            331
		graphrequestbatch;
	//  162  327:astore_0        
		obj = null;
	//  163  328:aconst_null     
	//  164  329:astore          5
		if(obj != null)
	//* 165  331:aload           5
	//* 166  333:ifnull          341
			((OutputStream) (obj)).close();
	//  167  336:aload           5
	//  168  338:invokevirtual   #1142 <Method void OutputStream.close()>
		throw graphrequestbatch;
	//  169  341:aload_0         
	//  170  342:athrow          
	}

	private static void setConnectionContentType(HttpURLConnection httpurlconnection, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
		{
			httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	//    2    4:aload_0         
	//    3    5:ldc1            #88  <String "Content-Type">
	//    4    7:ldc2            #1144 <String "application/x-www-form-urlencoded">
	//    5   10:invokevirtual   #445 <Method void HttpURLConnection.setRequestProperty(String, String)>
			httpurlconnection.setRequestProperty("Content-Encoding", "gzip");
	//    6   13:aload_0         
	//    7   14:ldc1            #85  <String "Content-Encoding">
	//    8   16:ldc2            #1146 <String "gzip">
	//    9   19:invokevirtual   #445 <Method void HttpURLConnection.setRequestProperty(String, String)>
			return;
	//   10   22:return          
		} else
		{
			httpurlconnection.setRequestProperty("Content-Type", getMimeContentType());
	//   11   23:aload_0         
	//   12   24:ldc1            #88  <String "Content-Type">
	//   13   26:invokestatic    #1148 <Method String getMimeContentType()>
	//   14   29:invokevirtual   #445 <Method void HttpURLConnection.setRequestProperty(String, String)>
			return;
	//   15   32:return          
		}
	}

	public static final void setDefaultBatchApplicationId(String s)
	{
		defaultBatchApplicationId = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #610 <Field String defaultBatchApplicationId>
	//    2    4:return          
	}

	static final boolean shouldWarnOnMissingFieldsParam(GraphRequest graphrequest)
	{
		String s = graphrequest.getVersion();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1154 <Method String getVersion()>
	//    2    4:astore_3        
		boolean flag1 = Utility.isNullOrEmpty(s);
	//    3    5:aload_3         
	//    4    6:invokestatic    #324 <Method boolean Utility.isNullOrEmpty(String)>
	//    5    9:istore_2        
		boolean flag = true;
	//    6   10:iconst_1        
	//    7   11:istore_1        
		if(flag1)
	//*   8   12:iload_2         
	//*   9   13:ifeq            18
			return true;
	//   10   16:iconst_1        
	//   11   17:ireturn         
		graphrequest = ((GraphRequest) (s));
	//   12   18:aload_3         
	//   13   19:astore_0        
		if(s.startsWith("v"))
	//*  14   20:aload_3         
	//*  15   21:ldc2            #1156 <String "v">
	//*  16   24:invokevirtual   #671 <Method boolean String.startsWith(String)>
	//*  17   27:ifeq            36
			graphrequest = ((GraphRequest) (s.substring(1)));
	//   18   30:aload_3         
	//   19   31:iconst_1        
	//   20   32:invokevirtual   #1159 <Method String String.substring(int)>
	//   21   35:astore_0        
		graphrequest = ((GraphRequest) (((String) (graphrequest)).split("\\.")));
	//   22   36:aload_0         
	//   23   37:ldc2            #1161 <String "\\.">
	//   24   40:invokevirtual   #1165 <Method String[] String.split(String)>
	//   25   43:astore_0        
		if(graphrequest.length < 2 || Integer.parseInt(((String) (graphrequest[0]))) <= 2)
	//*  26   44:aload_0         
	//*  27   45:arraylength     
	//*  28   46:iconst_2        
	//*  29   47:icmplt          60
	//*  30   50:aload_0         
	//*  31   51:iconst_0        
	//*  32   52:aaload          
	//*  33   53:invokestatic    #1168 <Method int Integer.parseInt(String)>
	//*  34   56:iconst_2        
	//*  35   57:icmpgt          84
		{
			if(Integer.parseInt(((String) (graphrequest[0]))) >= 2 && Integer.parseInt(((String) (graphrequest[1]))) >= 4)
	//*  36   60:aload_0         
	//*  37   61:iconst_0        
	//*  38   62:aaload          
	//*  39   63:invokestatic    #1168 <Method int Integer.parseInt(String)>
	//*  40   66:iconst_2        
	//*  41   67:icmplt          82
	//*  42   70:aload_0         
	//*  43   71:iconst_1        
	//*  44   72:aaload          
	//*  45   73:invokestatic    #1168 <Method int Integer.parseInt(String)>
	//*  46   76:iconst_4        
	//*  47   77:icmplt          82
				return true;
	//   48   80:iconst_1        
	//   49   81:ireturn         
			flag = false;
	//   50   82:iconst_0        
	//   51   83:istore_1        
		}
		return flag;
	//   52   84:iload_1         
	//   53   85:ireturn         
	}

	public static HttpURLConnection toHttpConnection(GraphRequestBatch graphrequestbatch)
	{
		validateFieldsParamForGetRequests(graphrequestbatch);
	//    0    0:aload_0         
	//    1    1:invokestatic    #1173 <Method void validateFieldsParamForGetRequests(GraphRequestBatch)>
label0:
		{
			Object obj;
			if(graphrequestbatch.size() == 1)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #567 <Method int GraphRequestBatch.size()>
	//*   4    8:iconst_1        
	//*   5    9:icmpne          31
			{
				obj = ((Object) (new URL(graphrequestbatch.get(0).getUrlForSingleRequest())));
	//    6   12:new             #274 <Class URL>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #906 <Method GraphRequest GraphRequestBatch.get(int)>
	//   11   21:invokevirtual   #1176 <Method String getUrlForSingleRequest()>
	//   12   24:invokespecial   #1177 <Method void URL(String)>
	//   13   27:astore_3        
				break label0;
	//   14   28:goto            42
			}
			HttpURLConnection httpurlconnection;
			HttpURLConnection httpurlconnection1;
			try
			{
				obj = ((Object) (new URL(ServerProtocol.getGraphUrlBase())));
	//   15   31:new             #274 <Class URL>
	//   16   34:dup             
	//   17   35:invokestatic    #1182 <Method String ServerProtocol.getGraphUrlBase()>
	//   18   38:invokespecial   #1177 <Method void URL(String)>
	//   19   41:astore_3        
			}
	//*  20   42:aconst_null     
	//*  21   43:astore_2        
	//*  22   44:aconst_null     
	//*  23   45:astore_1        
	//*  24   46:aload_3         
	//*  25   47:invokestatic    #1184 <Method HttpURLConnection createConnection(URL)>
	//*  26   50:astore_3        
	//*  27   51:aload_3         
	//*  28   52:astore_1        
	//*  29   53:aload_3         
	//*  30   54:astore_2        
	//*  31   55:aload_0         
	//*  32   56:aload_3         
	//*  33   57:invokestatic    #1186 <Method void serializeToUrlConnection(GraphRequestBatch, HttpURLConnection)>
	//*  34   60:aload_3         
	//*  35   61:areturn         
	//*  36   62:astore_0        
	//*  37   63:goto            69
	//*  38   66:astore_0        
	//*  39   67:aload_2         
	//*  40   68:astore_1        
	//*  41   69:aload_1         
	//*  42   70:invokestatic    #500 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
	//*  43   73:new             #474 <Class FacebookException>
	//*  44   76:dup             
	//*  45   77:ldc2            #1188 <String "could not construct request body">
	//*  46   80:aload_0         
	//*  47   81:invokespecial   #1191 <Method void FacebookException(String, Throwable)>
	//*  48   84:athrow          
			// Misplaced declaration of an exception variable
			catch(GraphRequestBatch graphrequestbatch)
	//*  49   85:astore_0        
			{
				throw new FacebookException("could not construct URL for request", ((Throwable) (graphrequestbatch)));
	//   50   86:new             #474 <Class FacebookException>
	//   51   89:dup             
	//   52   90:ldc2            #1193 <String "could not construct URL for request">
	//   53   93:aload_0         
	//   54   94:invokespecial   #1191 <Method void FacebookException(String, Throwable)>
	//   55   97:athrow          
			}
		}
		httpurlconnection1 = null;
		httpurlconnection = null;
		obj = ((Object) (createConnection(((URL) (obj)))));
		httpurlconnection = ((HttpURLConnection) (obj));
		httpurlconnection1 = ((HttpURLConnection) (obj));
		serializeToUrlConnection(graphrequestbatch, ((HttpURLConnection) (obj)));
		return ((HttpURLConnection) (obj));
		graphrequestbatch;
		break MISSING_BLOCK_LABEL_69;
		graphrequestbatch;
		httpurlconnection = httpurlconnection1;
		Utility.disconnectQuietly(((java.net.URLConnection) (httpurlconnection)));
		throw new FacebookException("could not construct request body", ((Throwable) (graphrequestbatch)));
	}

	public static HttpURLConnection toHttpConnection(Collection collection)
	{
		Validate.notEmptyAndContainsNoNulls(collection, "requests");
	//    0    0:aload_0         
	//    1    1:ldc2            #482 <String "requests">
	//    2    4:invokestatic    #488 <Method void Validate.notEmptyAndContainsNoNulls(Collection, String)>
		return toHttpConnection(new GraphRequestBatch(collection));
	//    3    7:new             #502 <Class GraphRequestBatch>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #523 <Method void GraphRequestBatch(Collection)>
	//    7   15:invokestatic    #492 <Method HttpURLConnection toHttpConnection(GraphRequestBatch)>
	//    8   18:areturn         
	}

	public static transient HttpURLConnection toHttpConnection(GraphRequest agraphrequest[])
	{
		return toHttpConnection(((Collection) (Arrays.asList(((Object []) (agraphrequest))))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #536 <Method List Arrays.asList(Object[])>
	//    2    4:invokestatic    #1198 <Method HttpURLConnection toHttpConnection(Collection)>
	//    3    7:areturn         
	}

	static final void validateFieldsParamForGetRequests(GraphRequestBatch graphrequestbatch)
	{
		graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.iterator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #607 <Method Iterator GraphRequestBatch.iterator()>
	//    2    4:astore_0        
		do
		{
			if(!((Iterator) (graphrequestbatch)).hasNext())
				break;
	//    3    5:aload_0         
	//    4    6:invokeinterface #387 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            97
			GraphRequest graphrequest = (GraphRequest)((Iterator) (graphrequestbatch)).next();
	//    6   14:aload_0         
	//    7   15:invokeinterface #391 <Method Object Iterator.next()>
	//    8   20:checkcast       #2   <Class GraphRequest>
	//    9   23:astore_1        
			if(HttpMethod.GET.equals(((Object) (graphrequest.getHttpMethod()))) && shouldWarnOnMissingFieldsParam(graphrequest))
	//*  10   24:getstatic       #282 <Field HttpMethod HttpMethod.GET>
	//*  11   27:aload_1         
	//*  12   28:invokevirtual   #1202 <Method HttpMethod getHttpMethod()>
	//*  13   31:invokevirtual   #1205 <Method boolean HttpMethod.equals(Object)>
	//*  14   34:ifeq            5
	//*  15   37:aload_1         
	//*  16   38:invokestatic    #1207 <Method boolean shouldWarnOnMissingFieldsParam(GraphRequest)>
	//*  17   41:ifeq            5
			{
				Bundle bundle = graphrequest.getParameters();
	//   18   44:aload_1         
	//   19   45:invokevirtual   #1211 <Method Bundle getParameters()>
	//   20   48:astore_2        
				if(!bundle.containsKey("fields") || Utility.isNullOrEmpty(bundle.getString("fields")))
	//*  21   49:aload_2         
	//*  22   50:ldc1            #115 <String "fields">
	//*  23   52:invokevirtual   #298 <Method boolean Bundle.containsKey(String)>
	//*  24   55:ifeq            70
	//*  25   58:aload_2         
	//*  26   59:ldc1            #115 <String "fields">
	//*  27   61:invokevirtual   #1214 <Method String Bundle.getString(String)>
	//*  28   64:invokestatic    #324 <Method boolean Utility.isNullOrEmpty(String)>
	//*  29   67:ifeq            5
					Logger.log(LoggingBehavior.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", new Object[] {
						graphrequest.getGraphPath()
					});
	//   30   70:getstatic       #1217 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//   31   73:iconst_5        
	//   32   74:ldc2            #1050 <String "Request">
	//   33   77:ldc2            #1219 <String "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.">
	//   34   80:iconst_1        
	//   35   81:anewarray       Object[]
	//   36   84:dup             
	//   37   85:iconst_0        
	//   38   86:aload_1         
	//   39   87:invokevirtual   #1222 <Method String getGraphPath()>
	//   40   90:aastore         
	//   41   91:invokestatic    #1225 <Method void Logger.log(LoggingBehavior, int, String, String, Object[])>
			}
		} while(true);
	//   42   94:goto            5
	//   43   97:return          
	}

	public final GraphResponse executeAndWait()
	{
		return executeAndWait(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #1228 <Method GraphResponse executeAndWait(GraphRequest)>
	//    2    4:areturn         
	}

	public final GraphRequestAsyncTask executeAsync()
	{
		return executeBatchAsync(new GraphRequest[] {
			this
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       GraphRequest[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:aastore         
	//    6    8:invokestatic    #1232 <Method GraphRequestAsyncTask executeBatchAsync(GraphRequest[])>
	//    7   11:areturn         
	}

	public final AccessToken getAccessToken()
	{
		return accessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #246 <Field AccessToken accessToken>
	//    2    4:areturn         
	}

	public final String getBatchEntryDependsOn()
	{
		return batchEntryDependsOn;
	//    0    0:aload_0         
	//    1    1:getfield        #1019 <Field String batchEntryDependsOn>
	//    2    4:areturn         
	}

	public final String getBatchEntryName()
	{
		return batchEntryName;
	//    0    0:aload_0         
	//    1    1:getfield        #1011 <Field String batchEntryName>
	//    2    4:areturn         
	}

	public final boolean getBatchEntryOmitResultOnSuccess()
	{
		return batchEntryOmitResultOnSuccess;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field boolean batchEntryOmitResultOnSuccess>
	//    2    4:ireturn         
	}

	public final Callback getCallback()
	{
		return callback;
	//    0    0:aload_0         
	//    1    1:getfield        #951 <Field GraphRequest$Callback callback>
	//    2    4:areturn         
	}

	public final JSONObject getGraphObject()
	{
		return graphObject;
	//    0    0:aload_0         
	//    1    1:getfield        #934 <Field JSONObject graphObject>
	//    2    4:areturn         
	}

	public final String getGraphPath()
	{
		return graphPath;
	//    0    0:aload_0         
	//    1    1:getfield        #248 <Field String graphPath>
	//    2    4:areturn         
	}

	public final HttpMethod getHttpMethod()
	{
		return httpMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #359 <Field HttpMethod httpMethod>
	//    2    4:areturn         
	}

	public final Bundle getParameters()
	{
		return parameters;
	//    0    0:aload_0         
	//    1    1:getfield        #265 <Field Bundle parameters>
	//    2    4:areturn         
	}

	final String getRelativeUrlForBatchedRequest()
	{
		if(overriddenURL == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field String overriddenURL>
	//*   2    4:ifnonnull       72
		{
			Object obj = ((Object) (String.format("%s/%s", new Object[] {
				ServerProtocol.getGraphUrlBase(), getGraphPathWithVersion()
			})));
	//    3    7:ldc1            #124 <String "%s/%s">
	//    4    9:iconst_2        
	//    5   10:anewarray       Object[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:invokestatic    #1182 <Method String ServerProtocol.getGraphUrlBase()>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:invokespecial   #1241 <Method String getGraphPathWithVersion()>
	//   14   25:aastore         
	//   15   26:invokestatic    #626 <Method String String.format(String, Object[])>
	//   16   29:astore_1        
			addCommonParameters();
	//   17   30:aload_0         
	//   18   31:invokespecial   #1243 <Method void addCommonParameters()>
			obj = ((Object) (Uri.parse(appendParametersToBaseUrl(((String) (obj)), Boolean.valueOf(true)))));
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:iconst_1        
	//   22   37:invokestatic    #1246 <Method Boolean Boolean.valueOf(boolean)>
	//   23   40:invokespecial   #1248 <Method String appendParametersToBaseUrl(String, Boolean)>
	//   24   43:invokestatic    #368 <Method Uri Uri.parse(String)>
	//   25   46:astore_1        
			return String.format("%s?%s", new Object[] {
				((Uri) (obj)).getPath(), ((Uri) (obj)).getQuery()
			});
	//   26   47:ldc2            #1250 <String "%s?%s">
	//   27   50:iconst_2        
	//   28   51:anewarray       Object[]
	//   29   54:dup             
	//   30   55:iconst_0        
	//   31   56:aload_1         
	//   32   57:invokevirtual   #808 <Method String Uri.getPath()>
	//   33   60:aastore         
	//   34   61:dup             
	//   35   62:iconst_1        
	//   36   63:aload_1         
	//   37   64:invokevirtual   #1253 <Method String Uri.getQuery()>
	//   38   67:aastore         
	//   39   68:invokestatic    #626 <Method String String.format(String, Object[])>
	//   40   71:areturn         
		} else
		{
			throw new FacebookException("Can't override URL for a batch request");
	//   41   72:new             #474 <Class FacebookException>
	//   42   75:dup             
	//   43   76:ldc2            #1255 <String "Can't override URL for a batch request">
	//   44   79:invokespecial   #477 <Method void FacebookException(String)>
	//   45   82:athrow          
		}
	}

	public final Object getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #1258 <Field Object tag>
	//    2    4:areturn         
	}

	final String getUrlForSingleRequest()
	{
		String s;
label0:
		{
			s = overriddenURL;
	//    0    0:aload_0         
	//    1    1:getfield        #277 <Field String overriddenURL>
	//    2    4:astore_1        
			if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
				return s.toString();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1259 <Method String String.toString()>
	//    7   13:areturn         
			if(getHttpMethod() == HttpMethod.POST)
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #1202 <Method HttpMethod getHttpMethod()>
	//*  10   18:getstatic       #362 <Field HttpMethod HttpMethod.POST>
	//*  11   21:if_acmpne       49
			{
				s = graphPath;
	//   12   24:aload_0         
	//   13   25:getfield        #248 <Field String graphPath>
	//   14   28:astore_1        
				if(s != null && s.endsWith("/videos"))
	//*  15   29:aload_1         
	//*  16   30:ifnull          49
	//*  17   33:aload_1         
	//*  18   34:ldc1            #164 <String "/videos">
	//*  19   36:invokevirtual   #1262 <Method boolean String.endsWith(String)>
	//*  20   39:ifeq            49
				{
					s = ServerProtocol.getGraphVideoUrlBase();
	//   21   42:invokestatic    #1265 <Method String ServerProtocol.getGraphVideoUrlBase()>
	//   22   45:astore_1        
					break label0;
	//   23   46:goto            53
				}
			}
			s = ServerProtocol.getGraphUrlBase();
	//   24   49:invokestatic    #1182 <Method String ServerProtocol.getGraphUrlBase()>
	//   25   52:astore_1        
		}
		s = String.format("%s/%s", new Object[] {
			s, getGraphPathWithVersion()
		});
	//   26   53:ldc1            #124 <String "%s/%s">
	//   27   55:iconst_2        
	//   28   56:anewarray       Object[]
	//   29   59:dup             
	//   30   60:iconst_0        
	//   31   61:aload_1         
	//   32   62:aastore         
	//   33   63:dup             
	//   34   64:iconst_1        
	//   35   65:aload_0         
	//   36   66:invokespecial   #1241 <Method String getGraphPathWithVersion()>
	//   37   69:aastore         
	//   38   70:invokestatic    #626 <Method String String.format(String, Object[])>
	//   39   73:astore_1        
		addCommonParameters();
	//   40   74:aload_0         
	//   41   75:invokespecial   #1243 <Method void addCommonParameters()>
		return appendParametersToBaseUrl(s, Boolean.valueOf(false));
	//   42   78:aload_0         
	//   43   79:aload_1         
	//   44   80:iconst_0        
	//   45   81:invokestatic    #1246 <Method Boolean Boolean.valueOf(boolean)>
	//   46   84:invokespecial   #1248 <Method String appendParametersToBaseUrl(String, Boolean)>
	//   47   87:areturn         
	}

	public final String getVersion()
	{
		return version;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field String version>
	//    2    4:areturn         
	}

	public final void setAccessToken(AccessToken accesstoken)
	{
		accessToken = accesstoken;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #246 <Field AccessToken accessToken>
	//    3    5:return          
	}

	public final void setBatchEntryDependsOn(String s)
	{
		batchEntryDependsOn = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1019 <Field String batchEntryDependsOn>
	//    3    5:return          
	}

	public final void setBatchEntryName(String s)
	{
		batchEntryName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1011 <Field String batchEntryName>
	//    3    5:return          
	}

	public final void setBatchEntryOmitResultOnSuccess(boolean flag)
	{
		batchEntryOmitResultOnSuccess = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #242 <Field boolean batchEntryOmitResultOnSuccess>
	//    3    5:return          
	}

	public final void setCallback(final Callback callback)
	{
		if(!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO) && !FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING))
	//*   0    0:getstatic       #342 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_INFO>
	//*   1    3:invokestatic    #346 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*   2    6:ifne            27
	//*   3    9:getstatic       #349 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
	//*   4   12:invokestatic    #346 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*   5   15:ifeq            21
	//*   6   18:goto            27
		{
			this.callback = callback;
	//    7   21:aload_0         
	//    8   22:aload_1         
	//    9   23:putfield        #951 <Field GraphRequest$Callback callback>
			return;
	//   10   26:return          
		} else
		{
			this.callback = new Callback() {

				public void onCompleted(GraphResponse graphresponse)
				{
					Object obj = ((Object) (graphresponse.getJSONObject()));
				//    0    0:aload_1         
				//    1    1:invokevirtual   #33  <Method JSONObject GraphResponse.getJSONObject()>
				//    2    4:astore_3        
					if(obj != null)
				//*   3    5:aload_3         
				//*   4    6:ifnull          19
						obj = ((Object) (((JSONObject) (obj)).optJSONObject("__debug__")));
				//    5    9:aload_3         
				//    6   10:ldc1            #35  <String "__debug__">
				//    7   12:invokevirtual   #41  <Method JSONObject JSONObject.optJSONObject(String)>
				//    8   15:astore_3        
					else
				//*   9   16:goto            21
						obj = null;
				//   10   19:aconst_null     
				//   11   20:astore_3        
					JSONArray jsonarray;
					if(obj != null)
				//*  12   21:aload_3         
				//*  13   22:ifnull          36
						jsonarray = ((JSONObject) (obj)).optJSONArray("messages");
				//   14   25:aload_3         
				//   15   26:ldc1            #43  <String "messages">
				//   16   28:invokevirtual   #47  <Method JSONArray JSONObject.optJSONArray(String)>
				//   17   31:astore          4
					else
				//*  18   33:goto            39
						jsonarray = null;
				//   19   36:aconst_null     
				//   20   37:astore          4
					if(jsonarray != null)
				//*  21   39:aload           4
				//*  22   41:ifnull          217
					{
						for(int i = 0; i < jsonarray.length(); i++)
				//*  23   44:iconst_0        
				//*  24   45:istore_2        
				//*  25   46:iload_2         
				//*  26   47:aload           4
				//*  27   49:invokevirtual   #53  <Method int JSONArray.length()>
				//*  28   52:icmpge          217
						{
							Object obj2 = ((Object) (jsonarray.optJSONObject(i)));
				//   29   55:aload           4
				//   30   57:iload_2         
				//   31   58:invokevirtual   #56  <Method JSONObject JSONArray.optJSONObject(int)>
				//   32   61:astore          6
							if(obj2 != null)
				//*  33   63:aload           6
				//*  34   65:ifnull          79
								obj = ((Object) (((JSONObject) (obj2)).optString("message")));
				//   35   68:aload           6
				//   36   70:ldc1            #58  <String "message">
				//   37   72:invokevirtual   #62  <Method String JSONObject.optString(String)>
				//   38   75:astore_3        
							else
				//*  39   76:goto            81
								obj = null;
				//   40   79:aconst_null     
				//   41   80:astore_3        
							Object obj1;
							if(obj2 != null)
				//*  42   81:aload           6
				//*  43   83:ifnull          98
								obj1 = ((Object) (((JSONObject) (obj2)).optString("type")));
				//   44   86:aload           6
				//   45   88:ldc1            #64  <String "type">
				//   46   90:invokevirtual   #62  <Method String JSONObject.optString(String)>
				//   47   93:astore          5
							else
				//*  48   95:goto            101
								obj1 = null;
				//   49   98:aconst_null     
				//   50   99:astore          5
							if(obj2 != null)
				//*  51  101:aload           6
				//*  52  103:ifnull          118
								obj2 = ((Object) (((JSONObject) (obj2)).optString("link")));
				//   53  106:aload           6
				//   54  108:ldc1            #66  <String "link">
				//   55  110:invokevirtual   #62  <Method String JSONObject.optString(String)>
				//   56  113:astore          6
							else
				//*  57  115:goto            121
								obj2 = null;
				//   58  118:aconst_null     
				//   59  119:astore          6
							if(obj == null || obj1 == null)
								continue;
				//   60  121:aload_3         
				//   61  122:ifnull          210
				//   62  125:aload           5
				//   63  127:ifnull          210
							LoggingBehavior loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
				//   64  130:getstatic       #72  <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_INFO>
				//   65  133:astore          7
							if(((String) (obj1)).equals("warning"))
				//*  66  135:aload           5
				//*  67  137:ldc1            #74  <String "warning">
				//*  68  139:invokevirtual   #80  <Method boolean String.equals(Object)>
				//*  69  142:ifeq            150
								loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
				//   70  145:getstatic       #83  <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
				//   71  148:astore          7
							obj1 = obj;
				//   72  150:aload_3         
				//   73  151:astore          5
							if(!Utility.isNullOrEmpty(((String) (obj2))))
				//*  74  153:aload           6
				//*  75  155:invokestatic    #89  <Method boolean Utility.isNullOrEmpty(String)>
				//*  76  158:ifne            200
							{
								obj1 = ((Object) (new StringBuilder()));
				//   77  161:new             #91  <Class StringBuilder>
				//   78  164:dup             
				//   79  165:invokespecial   #92  <Method void StringBuilder()>
				//   80  168:astore          5
								((StringBuilder) (obj1)).append(((String) (obj)));
				//   81  170:aload           5
				//   82  172:aload_3         
				//   83  173:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
				//   84  176:pop             
								((StringBuilder) (obj1)).append(" Link: ");
				//   85  177:aload           5
				//   86  179:ldc1            #98  <String " Link: ">
				//   87  181:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
				//   88  184:pop             
								((StringBuilder) (obj1)).append(((String) (obj2)));
				//   89  185:aload           5
				//   90  187:aload           6
				//   91  189:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
				//   92  192:pop             
								obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
				//   93  193:aload           5
				//   94  195:invokevirtual   #102 <Method String StringBuilder.toString()>
				//   95  198:astore          5
							}
							Logger.log(loggingbehavior, GraphRequest.TAG, ((String) (obj1)));
				//   96  200:aload           7
				//   97  202:getstatic       #106 <Field String GraphRequest.TAG>
				//   98  205:aload           5
				//   99  207:invokestatic    #112 <Method void Logger.log(LoggingBehavior, String, String)>
						}

				//  100  210:iload_2         
				//  101  211:iconst_1        
				//  102  212:iadd            
				//  103  213:istore_2        
					}
				//* 104  214:goto            46
					obj = ((Object) (callback));
				//  105  217:aload_0         
				//  106  218:getfield        #21  <Field GraphRequest$Callback val$callback>
				//  107  221:astore_3        
					if(obj != null)
				//* 108  222:aload_3         
				//* 109  223:ifnull          233
						((Callback) (obj)).onCompleted(graphresponse);
				//  110  226:aload_3         
				//  111  227:aload_1         
				//  112  228:invokeinterface #114 <Method void GraphRequest$Callback.onCompleted(GraphResponse)>
				//  113  233:return          
				}

				final GraphRequest this$0;
				final Callback val$callback;

			
			{
				this$0 = GraphRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GraphRequest this$0>
				callback = callback1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field GraphRequest$Callback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//   11   27:aload_0         
	//   12   28:new             #12  <Class GraphRequest$4>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:invokespecial   #1273 <Method void GraphRequest$4(GraphRequest, GraphRequest$Callback)>
	//   17   37:putfield        #951 <Field GraphRequest$Callback callback>
			return;
	//   18   40:return          
		}
	}

	public final void setGraphObject(JSONObject jsonobject)
	{
		graphObject = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #934 <Field JSONObject graphObject>
	//    3    5:return          
	}

	public final void setGraphPath(String s)
	{
		graphPath = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #248 <Field String graphPath>
	//    3    5:return          
	}

	public final void setHttpMethod(HttpMethod httpmethod)
	{
		if(overriddenURL != null && httpmethod != HttpMethod.GET)
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field String overriddenURL>
	//*   2    4:ifnull          28
	//*   3    7:aload_1         
	//*   4    8:getstatic       #282 <Field HttpMethod HttpMethod.GET>
	//*   5   11:if_acmpne       17
	//*   6   14:goto            28
			throw new FacebookException("Can't change HTTP method on request with overridden URL.");
	//    7   17:new             #474 <Class FacebookException>
	//    8   20:dup             
	//    9   21:ldc2            #1276 <String "Can't change HTTP method on request with overridden URL.">
	//   10   24:invokespecial   #477 <Method void FacebookException(String)>
	//   11   27:athrow          
		if(httpmethod == null)
	//*  12   28:aload_1         
	//*  13   29:ifnull          35
	//*  14   32:goto            39
			httpmethod = HttpMethod.GET;
	//   15   35:getstatic       #282 <Field HttpMethod HttpMethod.GET>
	//   16   38:astore_1        
		httpMethod = httpmethod;
	//   17   39:aload_0         
	//   18   40:aload_1         
	//   19   41:putfield        #359 <Field HttpMethod httpMethod>
	//   20   44:return          
	}

	public final void setParameters(Bundle bundle)
	{
		parameters = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #265 <Field Bundle parameters>
	//    3    5:return          
	}

	public final void setSkipClientToken(boolean flag)
	{
		skipClientToken = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #244 <Field boolean skipClientToken>
	//    3    5:return          
	}

	public final void setTag(Object obj)
	{
		tag = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1258 <Field Object tag>
	//    3    5:return          
	}

	public final void setVersion(String s)
	{
		version = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #250 <Field String version>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #210 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #213 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("{Request: ");
	//    4    8:aload_3         
	//    5    9:ldc2            #1283 <String "{Request: ">
	//    6   12:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(" accessToken: ");
	//    8   16:aload_3         
	//    9   17:ldc2            #1285 <String " accessToken: ">
	//   10   20:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		AccessToken accesstoken = accessToken;
	//   12   24:aload_0         
	//   13   25:getfield        #246 <Field AccessToken accessToken>
	//   14   28:astore_2        
		Object obj = ((Object) (accesstoken));
	//   15   29:aload_2         
	//   16   30:astore_1        
		if(accesstoken == null)
	//*  17   31:aload_2         
	//*  18   32:ifnonnull       39
			obj = "null";
	//   19   35:ldc2            #1287 <String "null">
	//   20   38:astore_1        
		stringbuilder.append(obj);
	//   21   39:aload_3         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #1290 <Method StringBuilder StringBuilder.append(Object)>
	//   24   44:pop             
		stringbuilder.append(", graphPath: ");
	//   25   45:aload_3         
	//   26   46:ldc2            #1292 <String ", graphPath: ">
	//   27   49:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
		stringbuilder.append(graphPath);
	//   29   53:aload_3         
	//   30   54:aload_0         
	//   31   55:getfield        #248 <Field String graphPath>
	//   32   58:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
		stringbuilder.append(", graphObject: ");
	//   34   62:aload_3         
	//   35   63:ldc2            #1294 <String ", graphObject: ">
	//   36   66:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
		stringbuilder.append(((Object) (graphObject)));
	//   38   70:aload_3         
	//   39   71:aload_0         
	//   40   72:getfield        #934 <Field JSONObject graphObject>
	//   41   75:invokevirtual   #1290 <Method StringBuilder StringBuilder.append(Object)>
	//   42   78:pop             
		stringbuilder.append(", httpMethod: ");
	//   43   79:aload_3         
	//   44   80:ldc2            #1296 <String ", httpMethod: ">
	//   45   83:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   46   86:pop             
		stringbuilder.append(((Object) (httpMethod)));
	//   47   87:aload_3         
	//   48   88:aload_0         
	//   49   89:getfield        #359 <Field HttpMethod httpMethod>
	//   50   92:invokevirtual   #1290 <Method StringBuilder StringBuilder.append(Object)>
	//   51   95:pop             
		stringbuilder.append(", parameters: ");
	//   52   96:aload_3         
	//   53   97:ldc2            #1298 <String ", parameters: ">
	//   54  100:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   55  103:pop             
		stringbuilder.append(((Object) (parameters)));
	//   56  104:aload_3         
	//   57  105:aload_0         
	//   58  106:getfield        #265 <Field Bundle parameters>
	//   59  109:invokevirtual   #1290 <Method StringBuilder StringBuilder.append(Object)>
	//   60  112:pop             
		stringbuilder.append("}");
	//   61  113:aload_3         
	//   62  114:ldc2            #1300 <String "}">
	//   63  117:invokevirtual   #327 <Method StringBuilder StringBuilder.append(String)>
	//   64  120:pop             
		return stringbuilder.toString();
	//   65  121:aload_3         
	//   66  122:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   67  125:areturn         
	}

	private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
	public static final String ACCESS_TOKEN_PARAM = "access_token";
	private static final String ATTACHED_FILES_PARAM = "attached_files";
	private static final String ATTACHMENT_FILENAME_PREFIX = "file";
	private static final String BATCH_APP_ID_PARAM = "batch_app_id";
	private static final String BATCH_BODY_PARAM = "body";
	private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
	private static final String BATCH_ENTRY_NAME_PARAM = "name";
	private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
	private static final String BATCH_METHOD_PARAM = "method";
	private static final String BATCH_PARAM = "batch";
	private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
	private static final String CAPTION_PARAM = "caption";
	private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";
	private static final String CONTENT_TYPE_HEADER = "Content-Type";
	private static final String DEBUG_KEY = "__debug__";
	private static final String DEBUG_MESSAGES_KEY = "messages";
	private static final String DEBUG_MESSAGE_KEY = "message";
	private static final String DEBUG_MESSAGE_LINK_KEY = "link";
	private static final String DEBUG_MESSAGE_TYPE_KEY = "type";
	private static final String DEBUG_PARAM = "debug";
	private static final String DEBUG_SEVERITY_INFO = "info";
	private static final String DEBUG_SEVERITY_WARNING = "warning";
	public static final String FIELDS_PARAM = "fields";
	private static final String FORMAT_JSON = "json";
	private static final String FORMAT_PARAM = "format";
	private static final String GRAPH_PATH_FORMAT = "%s/%s";
	private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
	public static final int MAXIMUM_BATCH_SIZE = 50;
	private static final String ME = "me";
	private static final String MIME_BOUNDARY;
	private static final String MY_FRIENDS = "me/friends";
	private static final String MY_PHOTOS = "me/photos";
	private static final String PICTURE_PARAM = "picture";
	private static final String SDK_ANDROID = "android";
	private static final String SDK_PARAM = "sdk";
	private static final String SEARCH = "search";
	public static final String TAG = "GraphRequest";
	private static final String USER_AGENT_BASE = "FBAndroidSDK";
	private static final String USER_AGENT_HEADER = "User-Agent";
	private static final String VIDEOS_SUFFIX = "/videos";
	private static String defaultBatchApplicationId;
	private static volatile String userAgent;
	private static Pattern versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
	private AccessToken accessToken;
	private String batchEntryDependsOn;
	private String batchEntryName;
	private boolean batchEntryOmitResultOnSuccess;
	private Callback callback;
	private JSONObject graphObject;
	private String graphPath;
	private HttpMethod httpMethod;
	private String overriddenURL;
	private Bundle parameters;
	private boolean skipClientToken;
	private Object tag;
	private String version;

	static 
	{
	//    0    0:ldc1            #192 <String "^/?v\\d+\\.\\d+/(.*)">
	//    1    2:invokestatic    #198 <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #200 <Field Pattern versionPattern>
		char ac[] = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	//    3    8:ldc1            #202 <String "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ">
	//    4   10:invokevirtual   #208 <Method char[] String.toCharArray()>
	//    5   13:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #210 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #213 <Method void StringBuilder()>
	//    9   21:astore_3        
		SecureRandom securerandom = new SecureRandom();
	//   10   22:new             #215 <Class SecureRandom>
	//   11   25:dup             
	//   12   26:invokespecial   #216 <Method void SecureRandom()>
	//   13   29:astore          4
		int j = securerandom.nextInt(11);
	//   14   31:aload           4
	//   15   33:bipush          11
	//   16   35:invokevirtual   #220 <Method int SecureRandom.nextInt(int)>
	//   17   38:istore_1        
		for(int i = 0; i < j + 30; i++)
	//*  18   39:iconst_0        
	//*  19   40:istore_0        
	//*  20   41:iload_0         
	//*  21   42:iload_1         
	//*  22   43:bipush          30
	//*  23   45:iadd            
	//*  24   46:icmpge          70
			stringbuilder.append(ac[securerandom.nextInt(ac.length)]);
	//   25   49:aload_3         
	//   26   50:aload_2         
	//   27   51:aload           4
	//   28   53:aload_2         
	//   29   54:arraylength     
	//   30   55:invokevirtual   #220 <Method int SecureRandom.nextInt(int)>
	//   31   58:caload          
	//   32   59:invokevirtual   #224 <Method StringBuilder StringBuilder.append(char)>
	//   33   62:pop             

	//   34   63:iload_0         
	//   35   64:iconst_1        
	//   36   65:iadd            
	//   37   66:istore_0        
	//*  38   67:goto            41
		MIME_BOUNDARY = stringbuilder.toString();
	//   39   70:aload_3         
	//   40   71:invokevirtual   #228 <Method String StringBuilder.toString()>
	//   41   74:putstatic       #230 <Field String MIME_BOUNDARY>
	//*  42   77:return          
	}


/*
	static boolean access$000(Object obj)
	{
		return isSupportedParameterType(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #287 <Method boolean isSupportedParameterType(Object)>
	//    2    4:ireturn         
	}

*/


/*
	static String access$100(Object obj)
	{
		return parameterToString(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #292 <Method String parameterToString(Object)>
	//    2    4:areturn         
	}

*/


/*
	static String access$200()
	{
		return MIME_BOUNDARY;
	//    0    0:getstatic       #230 <Field String MIME_BOUNDARY>
	//    1    3:areturn         
	}

*/
}
