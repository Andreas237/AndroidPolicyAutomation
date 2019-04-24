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
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.internal.OpenGraphJSONUtility;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.*;

// Referenced classes of package com.facebook:
//			HttpMethod, AccessToken, FacebookSdk, LoggingBehavior, 
//			FacebookException, GraphResponse, GraphRequestBatch, GraphRequestAsyncTask, 
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
		//*   2    4:ifne            71
			{
				if(firstWrite)
		//*   3    7:aload_0         
		//*   4    8:getfield        #23  <Field boolean firstWrite>
		//*   5   11:ifeq            55
				{
					outputStream.write("--".getBytes());
		//    6   14:aload_0         
		//    7   15:getfield        #27  <Field OutputStream outputStream>
		//    8   18:ldc1            #45  <String "--">
		//    9   20:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   10   23:invokevirtual   #56  <Method void OutputStream.write(byte[])>
					outputStream.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
		//   11   26:aload_0         
		//   12   27:getfield        #27  <Field OutputStream outputStream>
		//   13   30:ldc1            #58  <String "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f">
		//   14   32:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   15   35:invokevirtual   #56  <Method void OutputStream.write(byte[])>
					outputStream.write("\r\n".getBytes());
		//   16   38:aload_0         
		//   17   39:getfield        #27  <Field OutputStream outputStream>
		//   18   42:ldc1            #60  <String "\r\n">
		//   19   44:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   20   47:invokevirtual   #56  <Method void OutputStream.write(byte[])>
					firstWrite = false;
		//   21   50:aload_0         
		//   22   51:iconst_0        
		//   23   52:putfield        #23  <Field boolean firstWrite>
				}
				outputStream.write(String.format(s, aobj).getBytes());
		//   24   55:aload_0         
		//   25   56:getfield        #27  <Field OutputStream outputStream>
		//   26   59:aload_1         
		//   27   60:aload_2         
		//   28   61:invokestatic    #64  <Method String String.format(String, Object[])>
		//   29   64:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   30   67:invokevirtual   #56  <Method void OutputStream.write(byte[])>
				return;
		//   31   70:return          
			} else
			{
				outputStream.write(URLEncoder.encode(String.format(Locale.US, s, aobj), "UTF-8").getBytes());
		//   32   71:aload_0         
		//   33   72:getfield        #27  <Field OutputStream outputStream>
		//   34   75:getstatic       #70  <Field Locale Locale.US>
		//   35   78:aload_1         
		//   36   79:aload_2         
		//   37   80:invokestatic    #73  <Method String String.format(Locale, String, Object[])>
		//   38   83:ldc1            #75  <String "UTF-8">
		//   39   85:invokestatic    #81  <Method String URLEncoder.encode(String, String)>
		//   40   88:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   41   91:invokevirtual   #56  <Method void OutputStream.write(byte[])>
				return;
		//   42   94:return          
			}
		}

		public void writeBitmap(String s, Bitmap bitmap)
			throws IOException
		{
			writeContentDisposition(s, s, "image/png");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_1         
		//    3    3:ldc1            #86  <String "image/png">
		//    4    5:invokevirtual   #90  <Method void writeContentDisposition(String, String, String)>
			bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, outputStream);
		//    5    8:aload_2         
		//    6    9:getstatic       #96  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
		//    7   12:bipush          100
		//    8   14:aload_0         
		//    9   15:getfield        #27  <Field OutputStream outputStream>
		//   10   18:invokevirtual   #102 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, OutputStream)>
		//   11   21:pop             
			writeLine("", new Object[0]);
		//   12   22:aload_0         
		//   13   23:ldc1            #104 <String "">
		//   14   25:iconst_0        
		//   15   26:anewarray       Object[]
		//   16   29:invokevirtual   #107 <Method void writeLine(String, Object[])>
			writeRecordBoundary();
		//   17   32:aload_0         
		//   18   33:invokevirtual   #110 <Method void writeRecordBoundary()>
			if(logger != null)
		//*  19   36:aload_0         
		//*  20   37:getfield        #29  <Field Logger logger>
		//*  21   40:ifnull          79
			{
				bitmap = ((Bitmap) (logger));
		//   22   43:aload_0         
		//   23   44:getfield        #29  <Field Logger logger>
		//   24   47:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
		//   25   48:new             #112 <Class StringBuilder>
		//   26   51:dup             
		//   27   52:invokespecial   #113 <Method void StringBuilder()>
		//   28   55:astore_3        
				stringbuilder.append("    ");
		//   29   56:aload_3         
		//   30   57:ldc1            #115 <String "    ">
		//   31   59:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   32   62:pop             
				stringbuilder.append(s);
		//   33   63:aload_3         
		//   34   64:aload_1         
		//   35   65:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   36   68:pop             
				((Logger) (bitmap)).appendKeyValue(stringbuilder.toString(), "<Image>");
		//   37   69:aload_2         
		//   38   70:aload_3         
		//   39   71:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   40   74:ldc1            #125 <String "<Image>">
		//   41   76:invokevirtual   #131 <Method void Logger.appendKeyValue(String, Object)>
			}
		//   42   79:return          
		}

		public void writeBytes(String s, byte abyte0[])
			throws IOException
		{
			writeContentDisposition(s, s, "content/unknown");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_1         
		//    3    3:ldc1            #135 <String "content/unknown">
		//    4    5:invokevirtual   #90  <Method void writeContentDisposition(String, String, String)>
			outputStream.write(abyte0);
		//    5    8:aload_0         
		//    6    9:getfield        #27  <Field OutputStream outputStream>
		//    7   12:aload_2         
		//    8   13:invokevirtual   #56  <Method void OutputStream.write(byte[])>
			writeLine("", new Object[0]);
		//    9   16:aload_0         
		//   10   17:ldc1            #104 <String "">
		//   11   19:iconst_0        
		//   12   20:anewarray       Object[]
		//   13   23:invokevirtual   #107 <Method void writeLine(String, Object[])>
			writeRecordBoundary();
		//   14   26:aload_0         
		//   15   27:invokevirtual   #110 <Method void writeRecordBoundary()>
			if(logger != null)
		//*  16   30:aload_0         
		//*  17   31:getfield        #29  <Field Logger logger>
		//*  18   34:ifnull          95
			{
				Logger logger1 = logger;
		//   19   37:aload_0         
		//   20   38:getfield        #29  <Field Logger logger>
		//   21   41:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
		//   22   42:new             #112 <Class StringBuilder>
		//   23   45:dup             
		//   24   46:invokespecial   #113 <Method void StringBuilder()>
		//   25   49:astore          4
				stringbuilder.append("    ");
		//   26   51:aload           4
		//   27   53:ldc1            #115 <String "    ">
		//   28   55:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   29   58:pop             
				stringbuilder.append(s);
		//   30   59:aload           4
		//   31   61:aload_1         
		//   32   62:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   33   65:pop             
				logger1.appendKeyValue(stringbuilder.toString(), ((Object) (String.format(Locale.ROOT, "<Data: %d>", new Object[] {
					Integer.valueOf(abyte0.length)
				}))));
		//   34   66:aload_3         
		//   35   67:aload           4
		//   36   69:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   37   72:getstatic       #138 <Field Locale Locale.ROOT>
		//   38   75:ldc1            #140 <String "<Data: %d>">
		//   39   77:iconst_1        
		//   40   78:anewarray       Object[]
		//   41   81:dup             
		//   42   82:iconst_0        
		//   43   83:aload_2         
		//   44   84:arraylength     
		//   45   85:invokestatic    #146 <Method Integer Integer.valueOf(int)>
		//   46   88:aastore         
		//   47   89:invokestatic    #73  <Method String String.format(Locale, String, Object[])>
		//   48   92:invokevirtual   #131 <Method void Logger.appendKeyValue(String, Object)>
			}
		//   49   95:return          
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
		//    4    8:ldc1            #148 <String "Content-Disposition: form-data; name=\"%s\"">
		//    5   10:iconst_1        
		//    6   11:anewarray       Object[]
		//    7   14:dup             
		//    8   15:iconst_0        
		//    9   16:aload_1         
		//   10   17:aastore         
		//   11   18:invokevirtual   #150 <Method void write(String, Object[])>
				if(s1 != null)
		//*  12   21:aload_2         
		//*  13   22:ifnull          39
					write("; filename=\"%s\"", new Object[] {
						s1
					});
		//   14   25:aload_0         
		//   15   26:ldc1            #152 <String "; filename=\"%s\"">
		//   16   28:iconst_1        
		//   17   29:anewarray       Object[]
		//   18   32:dup             
		//   19   33:iconst_0        
		//   20   34:aload_2         
		//   21   35:aastore         
		//   22   36:invokevirtual   #150 <Method void write(String, Object[])>
				writeLine("", new Object[0]);
		//   23   39:aload_0         
		//   24   40:ldc1            #104 <String "">
		//   25   42:iconst_0        
		//   26   43:anewarray       Object[]
		//   27   46:invokevirtual   #107 <Method void writeLine(String, Object[])>
				if(s2 != null)
		//*  28   49:aload_3         
		//*  29   50:ifnull          72
					writeLine("%s: %s", new Object[] {
						"Content-Type", s2
					});
		//   30   53:aload_0         
		//   31   54:ldc1            #154 <String "%s: %s">
		//   32   56:iconst_2        
		//   33   57:anewarray       Object[]
		//   34   60:dup             
		//   35   61:iconst_0        
		//   36   62:ldc1            #156 <String "Content-Type">
		//   37   64:aastore         
		//   38   65:dup             
		//   39   66:iconst_1        
		//   40   67:aload_3         
		//   41   68:aastore         
		//   42   69:invokevirtual   #107 <Method void writeLine(String, Object[])>
				writeLine("", new Object[0]);
		//   43   72:aload_0         
		//   44   73:ldc1            #104 <String "">
		//   45   75:iconst_0        
		//   46   76:anewarray       Object[]
		//   47   79:invokevirtual   #107 <Method void writeLine(String, Object[])>
				return;
		//   48   82:return          
			} else
			{
				outputStream.write(String.format("%s=", new Object[] {
					s
				}).getBytes());
		//   49   83:aload_0         
		//   50   84:getfield        #27  <Field OutputStream outputStream>
		//   51   87:ldc1            #158 <String "%s=">
		//   52   89:iconst_1        
		//   53   90:anewarray       Object[]
		//   54   93:dup             
		//   55   94:iconst_0        
		//   56   95:aload_1         
		//   57   96:aastore         
		//   58   97:invokestatic    #64  <Method String String.format(String, Object[])>
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
		//    4    7:ldc1            #135 <String "content/unknown">
		//    5    9:astore          7
			writeContentDisposition(s, s, s2);
		//    6   11:aload_0         
		//    7   12:aload_1         
		//    8   13:aload_1         
		//    9   14:aload           7
		//   10   16:invokevirtual   #90  <Method void writeContentDisposition(String, String, String)>
			s1 = ((String) (FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri)));
		//   11   19:invokestatic    #166 <Method Context FacebookSdk.getApplicationContext()>
		//   12   22:invokevirtual   #172 <Method ContentResolver Context.getContentResolver()>
		//   13   25:aload_2         
		//   14   26:invokevirtual   #178 <Method java.io.InputStream ContentResolver.openInputStream(Uri)>
		//   15   29:astore_3        
			int i;
			if(outputStream instanceof ProgressNoopOutputStream)
		//*  16   30:aload_0         
		//*  17   31:getfield        #27  <Field OutputStream outputStream>
		//*  18   34:instanceof      #180 <Class ProgressNoopOutputStream>
		//*  19   37:ifeq            64
			{
				long l = Utility.getContentSize(uri);
		//   20   40:aload_2         
		//   21   41:invokestatic    #186 <Method long Utility.getContentSize(Uri)>
		//   22   44:lstore          5
				((ProgressNoopOutputStream)outputStream).addProgress(l);
		//   23   46:aload_0         
		//   24   47:getfield        #27  <Field OutputStream outputStream>
		//   25   50:checkcast       #180 <Class ProgressNoopOutputStream>
		//   26   53:lload           5
		//   27   55:invokevirtual   #190 <Method void ProgressNoopOutputStream.addProgress(long)>
				i = 0;
		//   28   58:iconst_0        
		//   29   59:istore          4
			} else
		//*  30   61:goto            76
			{
				i = Utility.copyAndCloseInputStream(((java.io.InputStream) (s1)), outputStream) + 0;
		//   31   64:aload_3         
		//   32   65:aload_0         
		//   33   66:getfield        #27  <Field OutputStream outputStream>
		//   34   69:invokestatic    #194 <Method int Utility.copyAndCloseInputStream(java.io.InputStream, OutputStream)>
		//   35   72:iconst_0        
		//   36   73:iadd            
		//   37   74:istore          4
			}
			writeLine("", new Object[0]);
		//   38   76:aload_0         
		//   39   77:ldc1            #104 <String "">
		//   40   79:iconst_0        
		//   41   80:anewarray       Object[]
		//   42   83:invokevirtual   #107 <Method void writeLine(String, Object[])>
			writeRecordBoundary();
		//   43   86:aload_0         
		//   44   87:invokevirtual   #110 <Method void writeRecordBoundary()>
			if(logger != null)
		//*  45   90:aload_0         
		//*  46   91:getfield        #29  <Field Logger logger>
		//*  47   94:ifnull          151
			{
				uri = ((Uri) (logger));
		//   48   97:aload_0         
		//   49   98:getfield        #29  <Field Logger logger>
		//   50  101:astore_2        
				s1 = ((String) (new StringBuilder()));
		//   51  102:new             #112 <Class StringBuilder>
		//   52  105:dup             
		//   53  106:invokespecial   #113 <Method void StringBuilder()>
		//   54  109:astore_3        
				((StringBuilder) (s1)).append("    ");
		//   55  110:aload_3         
		//   56  111:ldc1            #115 <String "    ">
		//   57  113:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   58  116:pop             
				((StringBuilder) (s1)).append(s);
		//   59  117:aload_3         
		//   60  118:aload_1         
		//   61  119:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   62  122:pop             
				((Logger) (uri)).appendKeyValue(((StringBuilder) (s1)).toString(), ((Object) (String.format(Locale.ROOT, "<Data: %d>", new Object[] {
					Integer.valueOf(i)
				}))));
		//   63  123:aload_2         
		//   64  124:aload_3         
		//   65  125:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   66  128:getstatic       #138 <Field Locale Locale.ROOT>
		//   67  131:ldc1            #140 <String "<Data: %d>">
		//   68  133:iconst_1        
		//   69  134:anewarray       Object[]
		//   70  137:dup             
		//   71  138:iconst_0        
		//   72  139:iload           4
		//   73  141:invokestatic    #146 <Method Integer Integer.valueOf(int)>
		//   74  144:aastore         
		//   75  145:invokestatic    #73  <Method String String.format(Locale, String, Object[])>
		//   76  148:invokevirtual   #131 <Method void Logger.appendKeyValue(String, Object)>
			}
		//   77  151:return          
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
		//    4    7:ldc1            #135 <String "content/unknown">
		//    5    9:astore          5
			writeContentDisposition(s, s, s2);
		//    6   11:aload_0         
		//    7   12:aload_1         
		//    8   13:aload_1         
		//    9   14:aload           5
		//   10   16:invokevirtual   #90  <Method void writeContentDisposition(String, String, String)>
			int i;
			if(outputStream instanceof ProgressNoopOutputStream)
		//*  11   19:aload_0         
		//*  12   20:getfield        #27  <Field OutputStream outputStream>
		//*  13   23:instanceof      #180 <Class ProgressNoopOutputStream>
		//*  14   26:ifeq            49
			{
				((ProgressNoopOutputStream)outputStream).addProgress(parcelfiledescriptor.getStatSize());
		//   15   29:aload_0         
		//   16   30:getfield        #27  <Field OutputStream outputStream>
		//   17   33:checkcast       #180 <Class ProgressNoopOutputStream>
		//   18   36:aload_2         
		//   19   37:invokevirtual   #202 <Method long ParcelFileDescriptor.getStatSize()>
		//   20   40:invokevirtual   #190 <Method void ProgressNoopOutputStream.addProgress(long)>
				i = 0;
		//   21   43:iconst_0        
		//   22   44:istore          4
			} else
		//*  23   46:goto            68
			{
				i = Utility.copyAndCloseInputStream(((java.io.InputStream) (new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor))), outputStream) + 0;
		//   24   49:new             #204 <Class android.os.ParcelFileDescriptor$AutoCloseInputStream>
		//   25   52:dup             
		//   26   53:aload_2         
		//   27   54:invokespecial   #207 <Method void android.os.ParcelFileDescriptor$AutoCloseInputStream(ParcelFileDescriptor)>
		//   28   57:aload_0         
		//   29   58:getfield        #27  <Field OutputStream outputStream>
		//   30   61:invokestatic    #194 <Method int Utility.copyAndCloseInputStream(java.io.InputStream, OutputStream)>
		//   31   64:iconst_0        
		//   32   65:iadd            
		//   33   66:istore          4
			}
			writeLine("", new Object[0]);
		//   34   68:aload_0         
		//   35   69:ldc1            #104 <String "">
		//   36   71:iconst_0        
		//   37   72:anewarray       Object[]
		//   38   75:invokevirtual   #107 <Method void writeLine(String, Object[])>
			writeRecordBoundary();
		//   39   78:aload_0         
		//   40   79:invokevirtual   #110 <Method void writeRecordBoundary()>
			if(logger != null)
		//*  41   82:aload_0         
		//*  42   83:getfield        #29  <Field Logger logger>
		//*  43   86:ifnull          143
			{
				parcelfiledescriptor = ((ParcelFileDescriptor) (logger));
		//   44   89:aload_0         
		//   45   90:getfield        #29  <Field Logger logger>
		//   46   93:astore_2        
				s1 = ((String) (new StringBuilder()));
		//   47   94:new             #112 <Class StringBuilder>
		//   48   97:dup             
		//   49   98:invokespecial   #113 <Method void StringBuilder()>
		//   50  101:astore_3        
				((StringBuilder) (s1)).append("    ");
		//   51  102:aload_3         
		//   52  103:ldc1            #115 <String "    ">
		//   53  105:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   54  108:pop             
				((StringBuilder) (s1)).append(s);
		//   55  109:aload_3         
		//   56  110:aload_1         
		//   57  111:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   58  114:pop             
				((Logger) (parcelfiledescriptor)).appendKeyValue(((StringBuilder) (s1)).toString(), ((Object) (String.format(Locale.ROOT, "<Data: %d>", new Object[] {
					Integer.valueOf(i)
				}))));
		//   59  115:aload_2         
		//   60  116:aload_3         
		//   61  117:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   62  120:getstatic       #138 <Field Locale Locale.ROOT>
		//   63  123:ldc1            #140 <String "<Data: %d>">
		//   64  125:iconst_1        
		//   65  126:anewarray       Object[]
		//   66  129:dup             
		//   67  130:iconst_0        
		//   68  131:iload           4
		//   69  133:invokestatic    #146 <Method Integer Integer.valueOf(int)>
		//   70  136:aastore         
		//   71  137:invokestatic    #73  <Method String String.format(Locale, String, Object[])>
		//   72  140:invokevirtual   #131 <Method void Logger.appendKeyValue(String, Object)>
			}
		//   73  143:return          
		}

		public transient void writeLine(String s, Object aobj[])
			throws IOException
		{
			write(s, aobj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #150 <Method void write(String, Object[])>
			if(!useUrlEncode)
		//*   4    6:aload_0         
		//*   5    7:getfield        #25  <Field boolean useUrlEncode>
		//*   6   10:ifne            23
				write("\r\n", new Object[0]);
		//    7   13:aload_0         
		//    8   14:ldc1            #60  <String "\r\n">
		//    9   16:iconst_0        
		//   10   17:anewarray       Object[]
		//   11   20:invokevirtual   #150 <Method void write(String, Object[])>
		//   12   23:return          
		}

		public void writeObject(String s, Object obj, GraphRequest graphrequest)
			throws IOException
		{
			if(outputStream instanceof RequestOutputStream)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field OutputStream outputStream>
		//*   2    4:instanceof      #211 <Class RequestOutputStream>
		//*   3    7:ifeq            23
				((RequestOutputStream)outputStream).setCurrentRequest(graphrequest);
		//    4   10:aload_0         
		//    5   11:getfield        #27  <Field OutputStream outputStream>
		//    6   14:checkcast       #211 <Class RequestOutputStream>
		//    7   17:aload_3         
		//    8   18:invokeinterface #215 <Method void RequestOutputStream.setCurrentRequest(GraphRequest)>
			if(GraphRequest.isSupportedParameterType(obj))
		//*   9   23:aload_2         
		//*  10   24:invokestatic    #219 <Method boolean GraphRequest.access$000(Object)>
		//*  11   27:ifeq            40
			{
				writeString(s, GraphRequest.parameterToString(obj));
		//   12   30:aload_0         
		//   13   31:aload_1         
		//   14   32:aload_2         
		//   15   33:invokestatic    #223 <Method String GraphRequest.access$100(Object)>
		//   16   36:invokevirtual   #227 <Method void writeString(String, String)>
				return;
		//   17   39:return          
			}
			if(obj instanceof Bitmap)
		//*  18   40:aload_2         
		//*  19   41:instanceof      #98  <Class Bitmap>
		//*  20   44:ifeq            57
			{
				writeBitmap(s, (Bitmap)obj);
		//   21   47:aload_0         
		//   22   48:aload_1         
		//   23   49:aload_2         
		//   24   50:checkcast       #98  <Class Bitmap>
		//   25   53:invokevirtual   #229 <Method void writeBitmap(String, Bitmap)>
				return;
		//   26   56:return          
			}
			if(obj instanceof byte[])
		//*  27   57:aload_2         
		//*  28   58:instanceof      #231 <Class byte[]>
		//*  29   61:ifeq            74
			{
				writeBytes(s, (byte[])obj);
		//   30   64:aload_0         
		//   31   65:aload_1         
		//   32   66:aload_2         
		//   33   67:checkcast       #231 <Class byte[]>
		//   34   70:invokevirtual   #233 <Method void writeBytes(String, byte[])>
				return;
		//   35   73:return          
			}
			if(obj instanceof Uri)
		//*  36   74:aload_2         
		//*  37   75:instanceof      #235 <Class Uri>
		//*  38   78:ifeq            92
			{
				writeContentUri(s, (Uri)obj, ((String) (null)));
		//   39   81:aload_0         
		//   40   82:aload_1         
		//   41   83:aload_2         
		//   42   84:checkcast       #235 <Class Uri>
		//   43   87:aconst_null     
		//   44   88:invokevirtual   #237 <Method void writeContentUri(String, Uri, String)>
				return;
		//   45   91:return          
			}
			if(obj instanceof ParcelFileDescriptor)
		//*  46   92:aload_2         
		//*  47   93:instanceof      #198 <Class ParcelFileDescriptor>
		//*  48   96:ifeq            110
			{
				writeFile(s, (ParcelFileDescriptor)obj, ((String) (null)));
		//   49   99:aload_0         
		//   50  100:aload_1         
		//   51  101:aload_2         
		//   52  102:checkcast       #198 <Class ParcelFileDescriptor>
		//   53  105:aconst_null     
		//   54  106:invokevirtual   #239 <Method void writeFile(String, ParcelFileDescriptor, String)>
				return;
		//   55  109:return          
			}
			if(obj instanceof ParcelableResourceWithMimeType)
		//*  56  110:aload_2         
		//*  57  111:instanceof      #241 <Class GraphRequest$ParcelableResourceWithMimeType>
		//*  58  114:ifeq            173
			{
				graphrequest = ((GraphRequest) ((ParcelableResourceWithMimeType)obj));
		//   59  117:aload_2         
		//   60  118:checkcast       #241 <Class GraphRequest$ParcelableResourceWithMimeType>
		//   61  121:astore_3        
				obj = ((Object) (((ParcelableResourceWithMimeType) (graphrequest)).getResource()));
		//   62  122:aload_3         
		//   63  123:invokevirtual   #245 <Method Parcelable GraphRequest$ParcelableResourceWithMimeType.getResource()>
		//   64  126:astore_2        
				graphrequest = ((GraphRequest) (((ParcelableResourceWithMimeType) (graphrequest)).getMimeType()));
		//   65  127:aload_3         
		//   66  128:invokevirtual   #248 <Method String GraphRequest$ParcelableResourceWithMimeType.getMimeType()>
		//   67  131:astore_3        
				if(obj instanceof ParcelFileDescriptor)
		//*  68  132:aload_2         
		//*  69  133:instanceof      #198 <Class ParcelFileDescriptor>
		//*  70  136:ifeq            150
				{
					writeFile(s, (ParcelFileDescriptor)obj, ((String) (graphrequest)));
		//   71  139:aload_0         
		//   72  140:aload_1         
		//   73  141:aload_2         
		//   74  142:checkcast       #198 <Class ParcelFileDescriptor>
		//   75  145:aload_3         
		//   76  146:invokevirtual   #239 <Method void writeFile(String, ParcelFileDescriptor, String)>
					return;
		//   77  149:return          
				}
				if(obj instanceof Uri)
		//*  78  150:aload_2         
		//*  79  151:instanceof      #235 <Class Uri>
		//*  80  154:ifeq            168
				{
					writeContentUri(s, (Uri)obj, ((String) (graphrequest)));
		//   81  157:aload_0         
		//   82  158:aload_1         
		//   83  159:aload_2         
		//   84  160:checkcast       #235 <Class Uri>
		//   85  163:aload_3         
		//   86  164:invokevirtual   #237 <Method void writeContentUri(String, Uri, String)>
					return;
		//   87  167:return          
				} else
				{
					throw getInvalidTypeError();
		//   88  168:aload_0         
		//   89  169:invokespecial   #250 <Method RuntimeException getInvalidTypeError()>
		//   90  172:athrow          
				}
			} else
			{
				throw getInvalidTypeError();
		//   91  173:aload_0         
		//   92  174:invokespecial   #250 <Method RuntimeException getInvalidTypeError()>
		//   93  177:athrow          
			}
		}

		public void writeRecordBoundary()
			throws IOException
		{
			if(!useUrlEncode)
		//*   0    0:aload_0         
		//*   1    1:getfield        #25  <Field boolean useUrlEncode>
		//*   2    4:ifne            23
			{
				writeLine("--%s", new Object[] {
					"3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
				});
		//    3    7:aload_0         
		//    4    8:ldc1            #252 <String "--%s">
		//    5   10:iconst_1        
		//    6   11:anewarray       Object[]
		//    7   14:dup             
		//    8   15:iconst_0        
		//    9   16:ldc1            #58  <String "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f">
		//   10   18:aastore         
		//   11   19:invokevirtual   #107 <Method void writeLine(String, Object[])>
				return;
		//   12   22:return          
			} else
			{
				outputStream.write("&".getBytes());
		//   13   23:aload_0         
		//   14   24:getfield        #27  <Field OutputStream outputStream>
		//   15   27:ldc1            #254 <String "&">
		//   16   29:invokevirtual   #51  <Method byte[] String.getBytes()>
		//   17   32:invokevirtual   #56  <Method void OutputStream.write(byte[])>
				return;
		//   18   35:return          
			}
		}

		public void writeRequestsAsJson(String s, JSONArray jsonarray, Collection collection)
			throws IOException, JSONException
		{
			if(!(outputStream instanceof RequestOutputStream))
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field OutputStream outputStream>
		//*   2    4:instanceof      #211 <Class RequestOutputStream>
		//*   3    7:ifne            20
			{
				writeString(s, jsonarray.toString());
		//    4   10:aload_0         
		//    5   11:aload_1         
		//    6   12:aload_2         
		//    7   13:invokevirtual   #261 <Method String JSONArray.toString()>
		//    8   16:invokevirtual   #227 <Method void writeString(String, String)>
				return;
		//    9   19:return          
			}
			RequestOutputStream requestoutputstream = (RequestOutputStream)outputStream;
		//   10   20:aload_0         
		//   11   21:getfield        #27  <Field OutputStream outputStream>
		//   12   24:checkcast       #211 <Class RequestOutputStream>
		//   13   27:astore          5
			writeContentDisposition(s, ((String) (null)), ((String) (null)));
		//   14   29:aload_0         
		//   15   30:aload_1         
		//   16   31:aconst_null     
		//   17   32:aconst_null     
		//   18   33:invokevirtual   #90  <Method void writeContentDisposition(String, String, String)>
			write("[", new Object[0]);
		//   19   36:aload_0         
		//   20   37:ldc2            #263 <String "[">
		//   21   40:iconst_0        
		//   22   41:anewarray       Object[]
		//   23   44:invokevirtual   #150 <Method void write(String, Object[])>
			collection = ((Collection) (collection.iterator()));
		//   24   47:aload_3         
		//   25   48:invokeinterface #269 <Method Iterator Collection.iterator()>
		//   26   53:astore_3        
			for(int i = 0; ((Iterator) (collection)).hasNext(); i++)
		//*  27   54:iconst_0        
		//*  28   55:istore          4
		//*  29   57:aload_3         
		//*  30   58:invokeinterface #275 <Method boolean Iterator.hasNext()>
		//*  31   63:ifeq            149
			{
				GraphRequest graphrequest = (GraphRequest)((Iterator) (collection)).next();
		//   32   66:aload_3         
		//   33   67:invokeinterface #279 <Method Object Iterator.next()>
		//   34   72:checkcast       #8   <Class GraphRequest>
		//   35   75:astore          6
				JSONObject jsonobject = jsonarray.getJSONObject(i);
		//   36   77:aload_2         
		//   37   78:iload           4
		//   38   80:invokevirtual   #283 <Method JSONObject JSONArray.getJSONObject(int)>
		//   39   83:astore          7
				requestoutputstream.setCurrentRequest(graphrequest);
		//   40   85:aload           5
		//   41   87:aload           6
		//   42   89:invokeinterface #215 <Method void RequestOutputStream.setCurrentRequest(GraphRequest)>
				if(i > 0)
		//*  43   94:iload           4
		//*  44   96:ifle            121
					write(",%s", new Object[] {
						jsonobject.toString()
					});
		//   45   99:aload_0         
		//   46  100:ldc2            #285 <String ",%s">
		//   47  103:iconst_1        
		//   48  104:anewarray       Object[]
		//   49  107:dup             
		//   50  108:iconst_0        
		//   51  109:aload           7
		//   52  111:invokevirtual   #288 <Method String JSONObject.toString()>
		//   53  114:aastore         
		//   54  115:invokevirtual   #150 <Method void write(String, Object[])>
				else
		//*  55  118:goto            140
					write("%s", new Object[] {
						jsonobject.toString()
					});
		//   56  121:aload_0         
		//   57  122:ldc2            #290 <String "%s">
		//   58  125:iconst_1        
		//   59  126:anewarray       Object[]
		//   60  129:dup             
		//   61  130:iconst_0        
		//   62  131:aload           7
		//   63  133:invokevirtual   #288 <Method String JSONObject.toString()>
		//   64  136:aastore         
		//   65  137:invokevirtual   #150 <Method void write(String, Object[])>
			}

		//   66  140:iload           4
		//   67  142:iconst_1        
		//   68  143:iadd            
		//   69  144:istore          4
		//*  70  146:goto            57
			write("]", new Object[0]);
		//   71  149:aload_0         
		//   72  150:ldc2            #292 <String "]">
		//   73  153:iconst_0        
		//   74  154:anewarray       Object[]
		//   75  157:invokevirtual   #150 <Method void write(String, Object[])>
			if(logger != null)
		//*  76  160:aload_0         
		//*  77  161:getfield        #29  <Field Logger logger>
		//*  78  164:ifnull          209
			{
				collection = ((Collection) (logger));
		//   79  167:aload_0         
		//   80  168:getfield        #29  <Field Logger logger>
		//   81  171:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
		//   82  172:new             #112 <Class StringBuilder>
		//   83  175:dup             
		//   84  176:invokespecial   #113 <Method void StringBuilder()>
		//   85  179:astore          5
				stringbuilder.append("    ");
		//   86  181:aload           5
		//   87  183:ldc1            #115 <String "    ">
		//   88  185:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   89  188:pop             
				stringbuilder.append(s);
		//   90  189:aload           5
		//   91  191:aload_1         
		//   92  192:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   93  195:pop             
				((Logger) (collection)).appendKeyValue(stringbuilder.toString(), ((Object) (jsonarray.toString())));
		//   94  196:aload_3         
		//   95  197:aload           5
		//   96  199:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   97  202:aload_2         
		//   98  203:invokevirtual   #261 <Method String JSONArray.toString()>
		//   99  206:invokevirtual   #131 <Method void Logger.appendKeyValue(String, Object)>
			}
		//  100  209:return          
		}

		public void writeString(String s, String s1)
			throws IOException
		{
			writeContentDisposition(s, ((String) (null)), ((String) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:aconst_null     
		//    4    4:invokevirtual   #90  <Method void writeContentDisposition(String, String, String)>
			writeLine("%s", new Object[] {
				s1
			});
		//    5    7:aload_0         
		//    6    8:ldc2            #290 <String "%s">
		//    7   11:iconst_1        
		//    8   12:anewarray       Object[]
		//    9   15:dup             
		//   10   16:iconst_0        
		//   11   17:aload_2         
		//   12   18:aastore         
		//   13   19:invokevirtual   #107 <Method void writeLine(String, Object[])>
			writeRecordBoundary();
		//   14   22:aload_0         
		//   15   23:invokevirtual   #110 <Method void writeRecordBoundary()>
			if(logger != null)
		//*  16   26:aload_0         
		//*  17   27:getfield        #29  <Field Logger logger>
		//*  18   30:ifnull          72
			{
				Logger logger1 = logger;
		//   19   33:aload_0         
		//   20   34:getfield        #29  <Field Logger logger>
		//   21   37:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
		//   22   38:new             #112 <Class StringBuilder>
		//   23   41:dup             
		//   24   42:invokespecial   #113 <Method void StringBuilder()>
		//   25   45:astore          4
				stringbuilder.append("    ");
		//   26   47:aload           4
		//   27   49:ldc1            #115 <String "    ">
		//   28   51:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   29   54:pop             
				stringbuilder.append(s);
		//   30   55:aload           4
		//   31   57:aload_1         
		//   32   58:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   33   61:pop             
				logger1.appendKeyValue(stringbuilder.toString(), ((Object) (s1)));
		//   34   62:aload_3         
		//   35   63:aload           4
		//   36   65:invokevirtual   #123 <Method String StringBuilder.toString()>
		//   37   68:aload_2         
		//   38   69:invokevirtual   #131 <Method void Logger.appendKeyValue(String, Object)>
			}
		//   39   72:return          
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
	//    6    6:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
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
	//    6    6:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
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
	//    6    7:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
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
	//    7    9:invokespecial   #214 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback, String)>
	//    8   12:return          
	}

	public GraphRequest(AccessToken accesstoken, String s, Bundle bundle, HttpMethod httpmethod, Callback callback1, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #216 <Method void Object()>
		batchEntryOmitResultOnSuccess = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #218 <Field boolean batchEntryOmitResultOnSuccess>
		skipClientToken = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #220 <Field boolean skipClientToken>
		accessToken = accesstoken;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #222 <Field AccessToken accessToken>
		graphPath = s;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #224 <Field String graphPath>
		version = s1;
	//   14   24:aload_0         
	//   15   25:aload           6
	//   16   27:putfield        #226 <Field String version>
		setCallback(callback1);
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:invokevirtual   #230 <Method void setCallback(GraphRequest$Callback)>
		setHttpMethod(httpmethod);
	//   20   36:aload_0         
	//   21   37:aload           4
	//   22   39:invokevirtual   #234 <Method void setHttpMethod(HttpMethod)>
		if(bundle != null)
	//*  23   42:aload_3         
	//*  24   43:ifnull          61
			parameters = new Bundle(bundle);
	//   25   46:aload_0         
	//   26   47:new             #236 <Class Bundle>
	//   27   50:dup             
	//   28   51:aload_3         
	//   29   52:invokespecial   #239 <Method void Bundle(Bundle)>
	//   30   55:putfield        #241 <Field Bundle parameters>
		else
	//*  31   58:goto            72
			parameters = new Bundle();
	//   32   61:aload_0         
	//   33   62:new             #236 <Class Bundle>
	//   34   65:dup             
	//   35   66:invokespecial   #242 <Method void Bundle()>
	//   36   69:putfield        #241 <Field Bundle parameters>
		if(version == null)
	//*  37   72:aload_0         
	//*  38   73:getfield        #226 <Field String version>
	//*  39   76:ifnonnull       86
			version = ServerProtocol.getAPIVersion();
	//   40   79:aload_0         
	//   41   80:invokestatic    #248 <Method String ServerProtocol.getAPIVersion()>
	//   42   83:putfield        #226 <Field String version>
	//   43   86:return          
	}

	GraphRequest(AccessToken accesstoken, URL url)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #216 <Method void Object()>
		batchEntryOmitResultOnSuccess = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #218 <Field boolean batchEntryOmitResultOnSuccess>
		skipClientToken = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #220 <Field boolean skipClientToken>
		accessToken = accesstoken;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #222 <Field AccessToken accessToken>
		overriddenURL = url.toString();
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #254 <Method String URL.toString()>
	//   14   24:putfield        #256 <Field String overriddenURL>
		setHttpMethod(HttpMethod.GET);
	//   15   27:aload_0         
	//   16   28:getstatic       #261 <Field HttpMethod HttpMethod.GET>
	//   17   31:invokevirtual   #234 <Method void setHttpMethod(HttpMethod)>
		parameters = new Bundle();
	//   18   34:aload_0         
	//   19   35:new             #236 <Class Bundle>
	//   20   38:dup             
	//   21   39:invokespecial   #242 <Method void Bundle()>
	//   22   42:putfield        #241 <Field Bundle parameters>
	//   23   45:return          
	}

	private void addCommonParameters()
	{
		if(accessToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #222 <Field AccessToken accessToken>
	//*   2    4:ifnull          44
		{
			if(!parameters.containsKey("access_token"))
	//*   3    7:aload_0         
	//*   4    8:getfield        #241 <Field Bundle parameters>
	//*   5   11:ldc1            #51  <String "access_token">
	//*   6   13:invokevirtual   #276 <Method boolean Bundle.containsKey(String)>
	//*   7   16:ifne            141
			{
				String s = accessToken.getToken();
	//    8   19:aload_0         
	//    9   20:getfield        #222 <Field AccessToken accessToken>
	//   10   23:invokevirtual   #281 <Method String AccessToken.getToken()>
	//   11   26:astore_1        
				Logger.registerAccessToken(s);
	//   12   27:aload_1         
	//   13   28:invokestatic    #287 <Method void Logger.registerAccessToken(String)>
				parameters.putString("access_token", s);
	//   14   31:aload_0         
	//   15   32:getfield        #241 <Field Bundle parameters>
	//   16   35:ldc1            #51  <String "access_token">
	//   17   37:aload_1         
	//   18   38:invokevirtual   #291 <Method void Bundle.putString(String, String)>
			}
		} else
	//*  19   41:goto            141
		if(!skipClientToken && !parameters.containsKey("access_token"))
	//*  20   44:aload_0         
	//*  21   45:getfield        #220 <Field boolean skipClientToken>
	//*  22   48:ifne            141
	//*  23   51:aload_0         
	//*  24   52:getfield        #241 <Field Bundle parameters>
	//*  25   55:ldc1            #51  <String "access_token">
	//*  26   57:invokevirtual   #276 <Method boolean Bundle.containsKey(String)>
	//*  27   60:ifne            141
		{
			String s1 = FacebookSdk.getApplicationId();
	//   28   63:invokestatic    #296 <Method String FacebookSdk.getApplicationId()>
	//   29   66:astore_1        
			String s2 = FacebookSdk.getClientToken();
	//   30   67:invokestatic    #299 <Method String FacebookSdk.getClientToken()>
	//   31   70:astore_2        
			if(!Utility.isNullOrEmpty(s1) && !Utility.isNullOrEmpty(s2))
	//*  32   71:aload_1         
	//*  33   72:invokestatic    #304 <Method boolean Utility.isNullOrEmpty(String)>
	//*  34   75:ifne            131
	//*  35   78:aload_2         
	//*  36   79:invokestatic    #304 <Method boolean Utility.isNullOrEmpty(String)>
	//*  37   82:ifne            131
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   38   85:new             #306 <Class StringBuilder>
	//   39   88:dup             
	//   40   89:invokespecial   #307 <Method void StringBuilder()>
	//   41   92:astore_3        
				stringbuilder.append(s1);
	//   42   93:aload_3         
	//   43   94:aload_1         
	//   44   95:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   45   98:pop             
				stringbuilder.append("|");
	//   46   99:aload_3         
	//   47  100:ldc2            #313 <String "|">
	//   48  103:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   49  106:pop             
				stringbuilder.append(s2);
	//   50  107:aload_3         
	//   51  108:aload_2         
	//   52  109:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   53  112:pop             
				s1 = stringbuilder.toString();
	//   54  113:aload_3         
	//   55  114:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   56  117:astore_1        
				parameters.putString("access_token", s1);
	//   57  118:aload_0         
	//   58  119:getfield        #241 <Field Bundle parameters>
	//   59  122:ldc1            #51  <String "access_token">
	//   60  124:aload_1         
	//   61  125:invokevirtual   #291 <Method void Bundle.putString(String, String)>
			} else
	//*  62  128:goto            141
			{
				Log.d(TAG, "Warning: Request without access token missing application ID or client token.");
	//   63  131:getstatic       #316 <Field String TAG>
	//   64  134:ldc2            #318 <String "Warning: Request without access token missing application ID or client token.">
	//   65  137:invokestatic    #324 <Method int Log.d(String, String)>
	//   66  140:pop             
			}
		}
		parameters.putString("sdk", "android");
	//   67  141:aload_0         
	//   68  142:getfield        #241 <Field Bundle parameters>
	//   69  145:ldc1            #153 <String "sdk">
	//   70  147:ldc1            #150 <String "android">
	//   71  149:invokevirtual   #291 <Method void Bundle.putString(String, String)>
		parameters.putString("format", "json");
	//   72  152:aload_0         
	//   73  153:getfield        #241 <Field Bundle parameters>
	//   74  156:ldc1            #123 <String "format">
	//   75  158:ldc1            #120 <String "json">
	//   76  160:invokevirtual   #291 <Method void Bundle.putString(String, String)>
		if(FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO))
	//*  77  163:getstatic       #330 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_INFO>
	//*  78  166:invokestatic    #334 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*  79  169:ifeq            184
		{
			parameters.putString("debug", "info");
	//   80  172:aload_0         
	//   81  173:getfield        #241 <Field Bundle parameters>
	//   82  176:ldc1            #108 <String "debug">
	//   83  178:ldc1            #111 <String "info">
	//   84  180:invokevirtual   #291 <Method void Bundle.putString(String, String)>
			return;
	//   85  183:return          
		}
		if(FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING))
	//*  86  184:getstatic       #337 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
	//*  87  187:invokestatic    #334 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*  88  190:ifeq            204
			parameters.putString("debug", "warning");
	//   89  193:aload_0         
	//   90  194:getfield        #241 <Field Bundle parameters>
	//   91  197:ldc1            #108 <String "debug">
	//   92  199:ldc1            #114 <String "warning">
	//   93  201:invokevirtual   #291 <Method void Bundle.putString(String, String)>
	//   94  204:return          
	}

	private String appendParametersToBaseUrl(String s)
	{
		android.net.Uri.Builder builder;
label0:
		{
			builder = (new android.net.Uri.Builder()).encodedPath(s);
	//    0    0:new             #341 <Class android.net.Uri$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #342 <Method void android.net.Uri$Builder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #346 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedPath(String)>
	//    5   11:astore_3        
label1:
			do
			{
				String s1;
				for(Iterator iterator = parameters.keySet().iterator(); iterator.hasNext(); builder.appendQueryParameter(s1, ((Object) (parameterToString(((Object) (s))))).toString()))
	//*   6   12:aload_0         
	//*   7   13:getfield        #241 <Field Bundle parameters>
	//*   8   16:invokevirtual   #350 <Method Set Bundle.keySet()>
	//*   9   19:invokeinterface #356 <Method Iterator Set.iterator()>
	//*  10   24:astore          4
	//*  11   26:aload           4
	//*  12   28:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//*  13   33:ifeq            133
				{
					s1 = (String)iterator.next();
	//   14   36:aload           4
	//   15   38:invokeinterface #366 <Method Object Iterator.next()>
	//   16   43:checkcast       #368 <Class String>
	//   17   46:astore          5
					Object obj = parameters.get(s1);
	//   18   48:aload_0         
	//   19   49:getfield        #241 <Field Bundle parameters>
	//   20   52:aload           5
	//   21   54:invokevirtual   #372 <Method Object Bundle.get(String)>
	//   22   57:astore_2        
					s = ((String) (obj));
	//   23   58:aload_2         
	//   24   59:astore_1        
					if(obj == null)
	//*  25   60:aload_2         
	//*  26   61:ifnonnull       68
						s = "";
	//   27   64:ldc2            #374 <String "">
	//   28   67:astore_1        
					if(!isSupportedParameterType(((Object) (s))))
						continue label1;
	//   29   68:aload_1         
	//   30   69:invokestatic    #266 <Method boolean isSupportedParameterType(Object)>
	//   31   72:ifeq            92
				}

	//   32   75:aload_3         
	//   33   76:aload           5
	//   34   78:aload_1         
	//   35   79:invokestatic    #271 <Method String parameterToString(Object)>
	//   36   82:invokevirtual   #375 <Method String Object.toString()>
	//   37   85:invokevirtual   #379 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   38   88:pop             
				break label0;
	//   39   89:goto            26
			} while(httpMethod != HttpMethod.GET);
	//   40   92:aload_0         
	//   41   93:getfield        #381 <Field HttpMethod httpMethod>
	//   42   96:getstatic       #261 <Field HttpMethod HttpMethod.GET>
	//   43   99:if_acmpne       26
			throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[] {
				((Object) (s)).getClass().getSimpleName()
			}));
	//   44  102:new             #383 <Class IllegalArgumentException>
	//   45  105:dup             
	//   46  106:getstatic       #389 <Field Locale Locale.US>
	//   47  109:ldc2            #391 <String "Unsupported parameter type for GET request: %s">
	//   48  112:iconst_1        
	//   49  113:anewarray       Object[]
	//   50  116:dup             
	//   51  117:iconst_0        
	//   52  118:aload_1         
	//   53  119:invokevirtual   #395 <Method Class Object.getClass()>
	//   54  122:invokevirtual   #400 <Method String Class.getSimpleName()>
	//   55  125:aastore         
	//   56  126:invokestatic    #403 <Method String String.format(Locale, String, Object[])>
	//   57  129:invokespecial   #405 <Method void IllegalArgumentException(String)>
	//   58  132:athrow          
		}
		return builder.toString();
	//   59  133:aload_3         
	//   60  134:invokevirtual   #406 <Method String android.net.Uri$Builder.toString()>
	//   61  137:areturn         
	}

	private static HttpURLConnection createConnection(URL url)
		throws IOException
	{
		url = ((URL) ((HttpURLConnection)url.openConnection()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #414 <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #416 <Class HttpURLConnection>
	//    3    7:astore_0        
		((HttpURLConnection) (url)).setRequestProperty("User-Agent", getUserAgent());
	//    4    8:aload_0         
	//    5    9:ldc1            #165 <String "User-Agent">
	//    6   11:invokestatic    #419 <Method String getUserAgent()>
	//    7   14:invokevirtual   #422 <Method void HttpURLConnection.setRequestProperty(String, String)>
		((HttpURLConnection) (url)).setRequestProperty("Accept-Language", Locale.getDefault().toString());
	//    8   17:aload_0         
	//    9   18:ldc1            #48  <String "Accept-Language">
	//   10   20:invokestatic    #426 <Method Locale Locale.getDefault()>
	//   11   23:invokevirtual   #427 <Method String Locale.toString()>
	//   12   26:invokevirtual   #422 <Method void HttpURLConnection.setRequestProperty(String, String)>
		((HttpURLConnection) (url)).setChunkedStreamingMode(0);
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:invokevirtual   #431 <Method void HttpURLConnection.setChunkedStreamingMode(int)>
		return ((HttpURLConnection) (url));
	//   16   34:aload_0         
	//   17   35:areturn         
	}

	public static GraphRequest createOpenGraphObject(ShareOpenGraphObject shareopengraphobject)
		throws FacebookException
	{
		String s1 = shareopengraphobject.getString("type");
	//    0    0:aload_0         
	//    1    1:ldc1            #105 <String "type">
	//    2    3:invokevirtual   #443 <Method String ShareOpenGraphObject.getString(String)>
	//    3    6:astore_2        
		String s = s1;
	//    4    7:aload_2         
	//    5    8:astore_1        
		if(s1 == null)
	//*   6    9:aload_2         
	//*   7   10:ifnonnull       21
			s = shareopengraphobject.getString("og:type");
	//    8   13:aload_0         
	//    9   14:ldc2            #445 <String "og:type">
	//   10   17:invokevirtual   #443 <Method String ShareOpenGraphObject.getString(String)>
	//   11   20:astore_1        
		if(s == null)
	//*  12   21:aload_1         
	//*  13   22:ifnonnull       36
			throw new FacebookException("Open graph object type cannot be null");
	//   14   25:new             #436 <Class FacebookException>
	//   15   28:dup             
	//   16   29:ldc2            #447 <String "Open graph object type cannot be null">
	//   17   32:invokespecial   #448 <Method void FacebookException(String)>
	//   18   35:athrow          
		try
		{
			Object obj = ((Object) ((JSONObject)OpenGraphJSONUtility.toJSONValue(((Object) (shareopengraphobject)), new com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor() {

				public JSONObject toJSONObject(SharePhoto sharephoto)
				{
					sharephoto = ((SharePhoto) (sharephoto.getImageUrl()));
				//    0    0:aload_1         
				//    1    1:invokevirtual   #26  <Method Uri SharePhoto.getImageUrl()>
				//    2    4:astore_1        
					JSONObject jsonobject = new JSONObject();
				//    3    5:new             #28  <Class JSONObject>
				//    4    8:dup             
				//    5    9:invokespecial   #29  <Method void JSONObject()>
				//    6   12:astore_2        
					try
					{
						jsonobject.put("url", ((Object) (((Uri) (sharephoto)).toString())));
				//    7   13:aload_2         
				//    8   14:ldc1            #31  <String "url">
				//    9   16:aload_1         
				//   10   17:invokevirtual   #37  <Method String Uri.toString()>
				//   11   20:invokevirtual   #41  <Method JSONObject JSONObject.put(String, Object)>
				//   12   23:pop             
					}
				//*  13   24:aload_2         
				//*  14   25:areturn         
					// Misplaced declaration of an exception variable
					catch(SharePhoto sharephoto)
				//*  15   26:astore_1        
					{
						throw new FacebookException("Unable to attach images", ((Throwable) (sharephoto)));
				//   16   27:new             #43  <Class FacebookException>
				//   17   30:dup             
				//   18   31:ldc1            #45  <String "Unable to attach images">
				//   19   33:aload_1         
				//   20   34:invokespecial   #48  <Method void FacebookException(String, Throwable)>
				//   21   37:athrow          
					}
					return jsonobject;
				}

			}
)));
	//   19   36:aload_0         
	//   20   37:new             #18  <Class GraphRequest$7>
	//   21   40:dup             
	//   22   41:invokespecial   #449 <Method void GraphRequest$7()>
	//   23   44:invokestatic    #455 <Method Object OpenGraphJSONUtility.toJSONValue(Object, com.facebook.share.internal.OpenGraphJSONUtility$PhotoJSONProcessor)>
	//   24   47:checkcast       #457 <Class JSONObject>
	//   25   50:astore_2        
			shareopengraphobject = ((ShareOpenGraphObject) (new Bundle()));
	//   26   51:new             #236 <Class Bundle>
	//   27   54:dup             
	//   28   55:invokespecial   #242 <Method void Bundle()>
	//   29   58:astore_0        
			((Bundle) (shareopengraphobject)).putString("object", ((JSONObject) (obj)).toString());
	//   30   59:aload_0         
	//   31   60:ldc2            #459 <String "object">
	//   32   63:aload_2         
	//   33   64:invokevirtual   #460 <Method String JSONObject.toString()>
	//   34   67:invokevirtual   #291 <Method void Bundle.putString(String, String)>
			obj = ((Object) (Locale.ROOT));
	//   35   70:getstatic       #463 <Field Locale Locale.ROOT>
	//   36   73:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   37   74:new             #306 <Class StringBuilder>
	//   38   77:dup             
	//   39   78:invokespecial   #307 <Method void StringBuilder()>
	//   40   81:astore_3        
			stringbuilder.append("objects/");
	//   41   82:aload_3         
	//   42   83:ldc2            #465 <String "objects/">
	//   43   86:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   44   89:pop             
			stringbuilder.append(s);
	//   45   90:aload_3         
	//   46   91:aload_1         
	//   47   92:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   48   95:pop             
			s = String.format(((Locale) (obj)), "%s/%s", new Object[] {
				"me", stringbuilder.toString()
			});
	//   49   96:aload_2         
	//   50   97:ldc1            #126 <String "%s/%s">
	//   51   99:iconst_2        
	//   52  100:anewarray       Object[]
	//   53  103:dup             
	//   54  104:iconst_0        
	//   55  105:ldc1            #135 <String "me">
	//   56  107:aastore         
	//   57  108:dup             
	//   58  109:iconst_1        
	//   59  110:aload_3         
	//   60  111:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   61  114:aastore         
	//   62  115:invokestatic    #403 <Method String String.format(Locale, String, Object[])>
	//   63  118:astore_1        
			shareopengraphobject = ((ShareOpenGraphObject) (new GraphRequest(AccessToken.getCurrentAccessToken(), s, ((Bundle) (shareopengraphobject)), HttpMethod.POST)));
	//   64  119:new             #2   <Class GraphRequest>
	//   65  122:dup             
	//   66  123:invokestatic    #469 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   67  126:aload_1         
	//   68  127:aload_0         
	//   69  128:getstatic       #472 <Field HttpMethod HttpMethod.POST>
	//   70  131:invokespecial   #474 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   71  134:astore_0        
		}
	//*  72  135:aload_0         
	//*  73  136:areturn         
		// Misplaced declaration of an exception variable
		catch(ShareOpenGraphObject shareopengraphobject)
	//*  74  137:astore_0        
		{
			throw new FacebookException(((JSONException) (shareopengraphobject)).getMessage());
	//   75  138:new             #436 <Class FacebookException>
	//   76  141:dup             
	//   77  142:aload_0         
	//   78  143:invokevirtual   #477 <Method String JSONException.getMessage()>
	//   79  146:invokespecial   #448 <Method void FacebookException(String)>
	//   80  149:athrow          
		}
		return ((GraphRequest) (shareopengraphobject));
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
	//    6    8:invokestatic    #483 <Method List executeBatchAndWait(GraphRequest[])>
	//    7   11:astore_0        
		if(graphrequest != null && ((List) (graphrequest)).size() == 1)
	//*   8   12:aload_0         
	//*   9   13:ifnull          40
	//*  10   16:aload_0         
	//*  11   17:invokeinterface #489 <Method int List.size()>
	//*  12   22:iconst_1        
	//*  13   23:icmpeq          29
	//*  14   26:goto            40
			return (GraphResponse)((List) (graphrequest)).get(0);
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:invokeinterface #492 <Method Object List.get(int)>
	//   18   36:checkcast       #494 <Class GraphResponse>
	//   19   39:areturn         
		else
			throw new FacebookException("invalid state: expected a single response");
	//   20   40:new             #436 <Class FacebookException>
	//   21   43:dup             
	//   22   44:ldc2            #496 <String "invalid state: expected a single response">
	//   23   47:invokespecial   #448 <Method void FacebookException(String)>
	//   24   50:athrow          
	}

	public static List executeBatchAndWait(GraphRequestBatch graphrequestbatch)
	{
		Validate.notEmptyAndContainsNoNulls(((Collection) (graphrequestbatch)), "requests");
	//    0    0:aload_0         
	//    1    1:ldc2            #501 <String "requests">
	//    2    4:invokestatic    #507 <Method void Validate.notEmptyAndContainsNoNulls(Collection, String)>
		HttpURLConnection httpurlconnection;
		try
		{
			httpurlconnection = toHttpConnection(graphrequestbatch);
	//    3    7:aload_0         
	//    4    8:invokestatic    #511 <Method HttpURLConnection toHttpConnection(GraphRequestBatch)>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #515 <Method List executeConnectionAndWait(HttpURLConnection, GraphRequestBatch)>
	//*   9   17:areturn         
		catch(Exception exception)
	//*  10   18:astore_1        
		{
			List list = GraphResponse.constructErrorResponses(graphrequestbatch.getRequests(), ((HttpURLConnection) (null)), new FacebookException(((Throwable) (exception))));
	//   11   19:aload_0         
	//   12   20:invokevirtual   #521 <Method List GraphRequestBatch.getRequests()>
	//   13   23:aconst_null     
	//   14   24:new             #436 <Class FacebookException>
	//   15   27:dup             
	//   16   28:aload_1         
	//   17   29:invokespecial   #524 <Method void FacebookException(Throwable)>
	//   18   32:invokestatic    #528 <Method List GraphResponse.constructErrorResponses(List, HttpURLConnection, FacebookException)>
	//   19   35:astore_1        
			runCallbacks(graphrequestbatch, list);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokestatic    #532 <Method void runCallbacks(GraphRequestBatch, List)>
			return list;
	//   23   41:aload_1         
	//   24   42:areturn         
		}
		return executeConnectionAndWait(httpurlconnection, graphrequestbatch);
	}

	public static List executeBatchAndWait(Collection collection)
	{
		return executeBatchAndWait(new GraphRequestBatch(collection));
	//    0    0:new             #517 <Class GraphRequestBatch>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #538 <Method void GraphRequestBatch(Collection)>
	//    4    8:invokestatic    #540 <Method List executeBatchAndWait(GraphRequestBatch)>
	//    5   11:areturn         
	}

	public static transient List executeBatchAndWait(GraphRequest agraphrequest[])
	{
		Validate.notNull(((Object) (agraphrequest)), "requests");
	//    0    0:aload_0         
	//    1    1:ldc2            #501 <String "requests">
	//    2    4:invokestatic    #545 <Method void Validate.notNull(Object, String)>
		return executeBatchAndWait(((Collection) (Arrays.asList(((Object []) (agraphrequest))))));
	//    3    7:aload_0         
	//    4    8:invokestatic    #551 <Method List Arrays.asList(Object[])>
	//    5   11:invokestatic    #553 <Method List executeBatchAndWait(Collection)>
	//    6   14:areturn         
	}

	public static GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch graphrequestbatch)
	{
		Validate.notEmptyAndContainsNoNulls(((Collection) (graphrequestbatch)), "requests");
	//    0    0:aload_0         
	//    1    1:ldc2            #501 <String "requests">
	//    2    4:invokestatic    #507 <Method void Validate.notEmptyAndContainsNoNulls(Collection, String)>
		graphrequestbatch = ((GraphRequestBatch) (new GraphRequestAsyncTask(graphrequestbatch)));
	//    3    7:new             #558 <Class GraphRequestAsyncTask>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #561 <Method void GraphRequestAsyncTask(GraphRequestBatch)>
	//    7   15:astore_0        
		((GraphRequestAsyncTask) (graphrequestbatch)).executeOnExecutor(FacebookSdk.getExecutor(), ((Object []) (null)));
	//    8   16:aload_0         
	//    9   17:invokestatic    #565 <Method java.util.concurrent.Executor FacebookSdk.getExecutor()>
	//   10   20:aconst_null     
	//   11   21:invokevirtual   #569 <Method android.os.AsyncTask GraphRequestAsyncTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   12   24:pop             
		return ((GraphRequestAsyncTask) (graphrequestbatch));
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	public static GraphRequestAsyncTask executeBatchAsync(Collection collection)
	{
		return executeBatchAsync(new GraphRequestBatch(collection));
	//    0    0:new             #517 <Class GraphRequestBatch>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #538 <Method void GraphRequestBatch(Collection)>
	//    4    8:invokestatic    #572 <Method GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch)>
	//    5   11:areturn         
	}

	public static transient GraphRequestAsyncTask executeBatchAsync(GraphRequest agraphrequest[])
	{
		Validate.notNull(((Object) (agraphrequest)), "requests");
	//    0    0:aload_0         
	//    1    1:ldc2            #501 <String "requests">
	//    2    4:invokestatic    #545 <Method void Validate.notNull(Object, String)>
		return executeBatchAsync(((Collection) (Arrays.asList(((Object []) (agraphrequest))))));
	//    3    7:aload_0         
	//    4    8:invokestatic    #551 <Method List Arrays.asList(Object[])>
	//    5   11:invokestatic    #576 <Method GraphRequestAsyncTask executeBatchAsync(Collection)>
	//    6   14:areturn         
	}

	public static List executeConnectionAndWait(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
	{
		List list = GraphResponse.fromHttpConnection(httpurlconnection, graphrequestbatch);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #579 <Method List GraphResponse.fromHttpConnection(HttpURLConnection, GraphRequestBatch)>
	//    3    5:astore_3        
		Utility.disconnectQuietly(((java.net.URLConnection) (httpurlconnection)));
	//    4    6:aload_0         
	//    5    7:invokestatic    #583 <Method void Utility.disconnectQuietly(java.net.URLConnection)>
		int i = graphrequestbatch.size();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #584 <Method int GraphRequestBatch.size()>
	//    8   14:istore_2        
		if(i != list.size())
	//*   9   15:iload_2         
	//*  10   16:aload_3         
	//*  11   17:invokeinterface #489 <Method int List.size()>
	//*  12   22:icmpeq          65
		{
			throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[] {
				Integer.valueOf(list.size()), Integer.valueOf(i)
			}));
	//   13   25:new             #436 <Class FacebookException>
	//   14   28:dup             
	//   15   29:getstatic       #389 <Field Locale Locale.US>
	//   16   32:ldc2            #586 <String "Received %d responses while expecting %d">
	//   17   35:iconst_2        
	//   18   36:anewarray       Object[]
	//   19   39:dup             
	//   20   40:iconst_0        
	//   21   41:aload_3         
	//   22   42:invokeinterface #489 <Method int List.size()>
	//   23   47:invokestatic    #592 <Method Integer Integer.valueOf(int)>
	//   24   50:aastore         
	//   25   51:dup             
	//   26   52:iconst_1        
	//   27   53:iload_2         
	//   28   54:invokestatic    #592 <Method Integer Integer.valueOf(int)>
	//   29   57:aastore         
	//   30   58:invokestatic    #403 <Method String String.format(Locale, String, Object[])>
	//   31   61:invokespecial   #448 <Method void FacebookException(String)>
	//   32   64:athrow          
		} else
		{
			runCallbacks(graphrequestbatch, list);
	//   33   65:aload_1         
	//   34   66:aload_3         
	//   35   67:invokestatic    #532 <Method void runCallbacks(GraphRequestBatch, List)>
			AccessTokenManager.getInstance().extendAccessTokenIfNeeded();
	//   36   70:invokestatic    #598 <Method AccessTokenManager AccessTokenManager.getInstance()>
	//   37   73:invokevirtual   #601 <Method void AccessTokenManager.extendAccessTokenIfNeeded()>
			return list;
	//   38   76:aload_3         
	//   39   77:areturn         
		}
	}

	public static List executeConnectionAndWait(HttpURLConnection httpurlconnection, Collection collection)
	{
		return executeConnectionAndWait(httpurlconnection, new GraphRequestBatch(collection));
	//    0    0:aload_0         
	//    1    1:new             #517 <Class GraphRequestBatch>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #538 <Method void GraphRequestBatch(Collection)>
	//    5    9:invokestatic    #515 <Method List executeConnectionAndWait(HttpURLConnection, GraphRequestBatch)>
	//    6   12:areturn         
	}

	public static GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
	{
		Validate.notNull(((Object) (httpurlconnection)), "connection");
	//    0    0:aload_1         
	//    1    1:ldc2            #608 <String "connection">
	//    2    4:invokestatic    #545 <Method void Validate.notNull(Object, String)>
		httpurlconnection = ((HttpURLConnection) (new GraphRequestAsyncTask(httpurlconnection, graphrequestbatch)));
	//    3    7:new             #558 <Class GraphRequestAsyncTask>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokespecial   #611 <Method void GraphRequestAsyncTask(HttpURLConnection, GraphRequestBatch)>
	//    8   16:astore_1        
		graphrequestbatch.setCallbackHandler(handler);
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #615 <Method void GraphRequestBatch.setCallbackHandler(Handler)>
		((GraphRequestAsyncTask) (httpurlconnection)).executeOnExecutor(FacebookSdk.getExecutor(), ((Object []) (null)));
	//   12   22:aload_1         
	//   13   23:invokestatic    #565 <Method java.util.concurrent.Executor FacebookSdk.getExecutor()>
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #569 <Method android.os.AsyncTask GraphRequestAsyncTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   16   30:pop             
		return ((GraphRequestAsyncTask) (httpurlconnection));
	//   17   31:aload_1         
	//   18   32:areturn         
	}

	public static GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
	{
		return executeConnectionAsync(((Handler) (null)), httpurlconnection, graphrequestbatch);
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #618 <Method GraphRequestAsyncTask executeConnectionAsync(Handler, HttpURLConnection, GraphRequestBatch)>
	//    4    6:areturn         
	}

	private static String getBatchAppId(GraphRequestBatch graphrequestbatch)
	{
		if(!Utility.isNullOrEmpty(graphrequestbatch.getBatchApplicationId()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #623 <Method String GraphRequestBatch.getBatchApplicationId()>
	//*   2    4:invokestatic    #304 <Method boolean Utility.isNullOrEmpty(String)>
	//*   3    7:ifne            15
			return graphrequestbatch.getBatchApplicationId();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #623 <Method String GraphRequestBatch.getBatchApplicationId()>
	//    6   14:areturn         
		for(graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.iterator())); ((Iterator) (graphrequestbatch)).hasNext();)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #624 <Method Iterator GraphRequestBatch.iterator()>
	//*   9   19:astore_0        
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//*  12   26:ifeq            57
		{
			Object obj = ((Object) (((GraphRequest)((Iterator) (graphrequestbatch)).next()).accessToken));
	//   13   29:aload_0         
	//   14   30:invokeinterface #366 <Method Object Iterator.next()>
	//   15   35:checkcast       #2   <Class GraphRequest>
	//   16   38:getfield        #222 <Field AccessToken accessToken>
	//   17   41:astore_1        
			if(obj != null)
	//*  18   42:aload_1         
	//*  19   43:ifnull          20
			{
				obj = ((Object) (((AccessToken) (obj)).getApplicationId()));
	//   20   46:aload_1         
	//   21   47:invokevirtual   #625 <Method String AccessToken.getApplicationId()>
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
	//*  27   57:getstatic       #627 <Field String defaultBatchApplicationId>
	//*  28   60:invokestatic    #304 <Method boolean Utility.isNullOrEmpty(String)>
	//*  29   63:ifne            70
			return defaultBatchApplicationId;
	//   30   66:getstatic       #627 <Field String defaultBatchApplicationId>
	//   31   69:areturn         
		else
			return FacebookSdk.getApplicationId();
	//   32   70:invokestatic    #296 <Method String FacebookSdk.getApplicationId()>
	//   33   73:areturn         
	}

	public static final String getDefaultBatchApplicationId()
	{
		return defaultBatchApplicationId;
	//    0    0:getstatic       #627 <Field String defaultBatchApplicationId>
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
	//    4    6:ldc1            #144 <String "me/photos">
	//    5    8:astore_1        
		return s1;
	//    6    9:aload_1         
	//    7   10:areturn         
	}

	private String getGraphPathWithVersion()
	{
		if(versionPattern.matcher(((CharSequence) (graphPath))).matches())
	//*   0    0:getstatic       #204 <Field Pattern versionPattern>
	//*   1    3:aload_0         
	//*   2    4:getfield        #224 <Field String graphPath>
	//*   3    7:invokevirtual   #634 <Method Matcher Pattern.matcher(CharSequence)>
	//*   4   10:invokevirtual   #639 <Method boolean Matcher.matches()>
	//*   5   13:ifeq            21
			return graphPath;
	//    6   16:aload_0         
	//    7   17:getfield        #224 <Field String graphPath>
	//    8   20:areturn         
		else
			return String.format("%s/%s", new Object[] {
				version, graphPath
			});
	//    9   21:ldc1            #126 <String "%s/%s">
	//   10   23:iconst_2        
	//   11   24:anewarray       Object[]
	//   12   27:dup             
	//   13   28:iconst_0        
	//   14   29:aload_0         
	//   15   30:getfield        #226 <Field String version>
	//   16   33:aastore         
	//   17   34:dup             
	//   18   35:iconst_1        
	//   19   36:aload_0         
	//   20   37:getfield        #224 <Field String graphPath>
	//   21   40:aastore         
	//   22   41:invokestatic    #642 <Method String String.format(String, Object[])>
	//   23   44:areturn         
	}

	private static String getMimeContentType()
	{
		return String.format("multipart/form-data; boundary=%s", new Object[] {
			"3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
		});
	//    0    0:ldc2            #645 <String "multipart/form-data; boundary=%s">
	//    1    3:iconst_1        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:ldc1            #138 <String "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f">
	//    6   11:aastore         
	//    7   12:invokestatic    #642 <Method String String.format(String, Object[])>
	//    8   15:areturn         
	}

	private static String getUserAgent()
	{
		if(userAgent == null)
	//*   0    0:getstatic       #647 <Field String userAgent>
	//*   1    3:ifnonnull       66
		{
			userAgent = String.format("%s.%s", new Object[] {
				"FBAndroidSDK", "4.6.0"
			});
	//    2    6:ldc2            #649 <String "%s.%s">
	//    3    9:iconst_2        
	//    4   10:anewarray       Object[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:ldc1            #162 <String "FBAndroidSDK">
	//    8   17:aastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc2            #651 <String "4.6.0">
	//   12   23:aastore         
	//   13   24:invokestatic    #642 <Method String String.format(String, Object[])>
	//   14   27:putstatic       #647 <Field String userAgent>
			String s = InternalSettings.getCustomUserAgent();
	//   15   30:invokestatic    #656 <Method String InternalSettings.getCustomUserAgent()>
	//   16   33:astore_0        
			if(!Utility.isNullOrEmpty(s))
	//*  17   34:aload_0         
	//*  18   35:invokestatic    #304 <Method boolean Utility.isNullOrEmpty(String)>
	//*  19   38:ifne            66
				userAgent = String.format(Locale.ROOT, "%s/%s", new Object[] {
					userAgent, s
				});
	//   20   41:getstatic       #463 <Field Locale Locale.ROOT>
	//   21   44:ldc1            #126 <String "%s/%s">
	//   22   46:iconst_2        
	//   23   47:anewarray       Object[]
	//   24   50:dup             
	//   25   51:iconst_0        
	//   26   52:getstatic       #647 <Field String userAgent>
	//   27   55:aastore         
	//   28   56:dup             
	//   29   57:iconst_1        
	//   30   58:aload_0         
	//   31   59:aastore         
	//   32   60:invokestatic    #403 <Method String String.format(Locale, String, Object[])>
	//   33   63:putstatic       #647 <Field String userAgent>
		}
		return userAgent;
	//   34   66:getstatic       #647 <Field String userAgent>
	//   35   69:areturn         
	}

	private static boolean hasOnProgressCallbacks(GraphRequestBatch graphrequestbatch)
	{
		for(Iterator iterator = graphrequestbatch.getCallbacks().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #661 <Method List GraphRequestBatch.getCallbacks()>
	//*   2    4:invokeinterface #662 <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            36
			if((GraphRequestBatch.Callback)iterator.next() instanceof GraphRequestBatch.OnProgressCallback)
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #366 <Method Object Iterator.next()>
	//*   9   25:checkcast       #664 <Class GraphRequestBatch$Callback>
	//*  10   28:instanceof      #666 <Class GraphRequestBatch$OnProgressCallback>
	//*  11   31:ifeq            10
				return true;
	//   12   34:iconst_1        
	//   13   35:ireturn         

		for(graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.iterator())); ((Iterator) (graphrequestbatch)).hasNext();)
	//*  14   36:aload_0         
	//*  15   37:invokevirtual   #624 <Method Iterator GraphRequestBatch.iterator()>
	//*  16   40:astore_0        
	//*  17   41:aload_0         
	//*  18   42:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//*  19   47:ifeq            70
			if(((GraphRequest)((Iterator) (graphrequestbatch)).next()).getCallback() instanceof OnProgressCallback)
	//*  20   50:aload_0         
	//*  21   51:invokeinterface #366 <Method Object Iterator.next()>
	//*  22   56:checkcast       #2   <Class GraphRequest>
	//*  23   59:invokevirtual   #670 <Method GraphRequest$Callback getCallback()>
	//*  24   62:instanceof      #35  <Class GraphRequest$OnProgressCallback>
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
	//    1    1:invokevirtual   #624 <Method Iterator GraphRequestBatch.iterator()>
	//    2    4:astore_0        
label0:
		do
			if(((Iterator) (graphrequestbatch)).hasNext())
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            72
			{
				GraphRequest graphrequest = (GraphRequest)((Iterator) (graphrequestbatch)).next();
	//    6   14:aload_0         
	//    7   15:invokeinterface #366 <Method Object Iterator.next()>
	//    8   20:checkcast       #2   <Class GraphRequest>
	//    9   23:astore_1        
				Iterator iterator = graphrequest.parameters.keySet().iterator();
	//   10   24:aload_1         
	//   11   25:getfield        #241 <Field Bundle parameters>
	//   12   28:invokevirtual   #350 <Method Set Bundle.keySet()>
	//   13   31:invokeinterface #356 <Method Iterator Set.iterator()>
	//   14   36:astore_2        
				String s;
				do
				{
					if(!iterator.hasNext())
						continue label0;
	//   15   37:aload_2         
	//   16   38:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//   17   43:ifeq            5
					s = (String)iterator.next();
	//   18   46:aload_2         
	//   19   47:invokeinterface #366 <Method Object Iterator.next()>
	//   20   52:checkcast       #368 <Class String>
	//   21   55:astore_3        
				} while(!isSupportedAttachmentType(graphrequest.parameters.get(s)));
	//   22   56:aload_1         
	//   23   57:getfield        #241 <Field Bundle parameters>
	//   24   60:aload_3         
	//   25   61:invokevirtual   #372 <Method Object Bundle.get(String)>
	//   26   64:invokestatic    #674 <Method boolean isSupportedAttachmentType(Object)>
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
	//    0    0:getstatic       #204 <Field Pattern versionPattern>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #634 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_1        
		if(matcher.matches())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #639 <Method boolean Matcher.matches()>
	//*   6   12:ifeq            21
			s = matcher.group(1);
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #679 <Method String Matcher.group(int)>
	//   10   20:astore_0        
		if(!s.startsWith("me/"))
	//*  11   21:aload_0         
	//*  12   22:ldc2            #681 <String "me/">
	//*  13   25:invokevirtual   #684 <Method boolean String.startsWith(String)>
	//*  14   28:ifne            45
			return s.startsWith("/me/");
	//   15   31:aload_0         
	//   16   32:ldc2            #686 <String "/me/">
	//   17   35:invokevirtual   #684 <Method boolean String.startsWith(String)>
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
	//    1    1:instanceof      #688 <Class Bitmap>
	//    2    4:ifne            40
	//    3    7:aload_0         
	//    4    8:instanceof      #690 <Class byte[]>
	//    5   11:ifne            40
	//    6   14:aload_0         
	//    7   15:instanceof      #692 <Class Uri>
	//    8   18:ifne            40
	//    9   21:aload_0         
	//   10   22:instanceof      #694 <Class ParcelFileDescriptor>
	//   11   25:ifne            40
	//   12   28:aload_0         
	//   13   29:instanceof      #38  <Class GraphRequest$ParcelableResourceWithMimeType>
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
	//    1    1:instanceof      #368 <Class String>
	//    2    4:ifne            33
	//    3    7:aload_0         
	//    4    8:instanceof      #696 <Class Boolean>
	//    5   11:ifne            33
	//    6   14:aload_0         
	//    7   15:instanceof      #698 <Class Number>
	//    8   18:ifne            33
	//    9   21:aload_0         
	//   10   22:instanceof      #700 <Class Date>
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
	//    4    4:invokestatic    #705 <Method GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken, Context, String, GraphRequest$Callback)>
	//    5    7:areturn         
	}

	public static GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accesstoken, Context context, String s, Callback callback1)
	{
		Object obj = ((Object) (s));
	//    0    0:aload_2         
	//    1    1:astore          4
		if(s == null)
	//*   2    3:aload_2         
	//*   3    4:ifnonnull       20
		{
			obj = ((Object) (s));
	//    4    7:aload_2         
	//    5    8:astore          4
			if(accesstoken != null)
	//*   6   10:aload_0         
	//*   7   11:ifnull          20
				obj = ((Object) (accesstoken.getApplicationId()));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #625 <Method String AccessToken.getApplicationId()>
	//   10   18:astore          4
		}
		s = ((String) (obj));
	//   11   20:aload           4
	//   12   22:astore_2        
		if(obj == null)
	//*  13   23:aload           4
	//*  14   25:ifnonnull       33
			s = Utility.getMetadataApplicationId(context);
	//   15   28:aload_1         
	//   16   29:invokestatic    #709 <Method String Utility.getMetadataApplicationId(Context)>
	//   17   32:astore_2        
		if(s == null)
	//*  18   33:aload_2         
	//*  19   34:ifnonnull       48
			throw new FacebookException("Facebook App ID cannot be determined");
	//   20   37:new             #436 <Class FacebookException>
	//   21   40:dup             
	//   22   41:ldc2            #711 <String "Facebook App ID cannot be determined">
	//   23   44:invokespecial   #448 <Method void FacebookException(String)>
	//   24   47:athrow          
		obj = ((Object) (new StringBuilder()));
	//   25   48:new             #306 <Class StringBuilder>
	//   26   51:dup             
	//   27   52:invokespecial   #307 <Method void StringBuilder()>
	//   28   55:astore          4
		((StringBuilder) (obj)).append(s);
	//   29   57:aload           4
	//   30   59:aload_2         
	//   31   60:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
		((StringBuilder) (obj)).append("/custom_audience_third_party_id");
	//   33   64:aload           4
	//   34   66:ldc2            #713 <String "/custom_audience_third_party_id">
	//   35   69:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   37   73:aload           4
	//   38   75:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   39   78:astore          4
		AttributionIdentifiers attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
	//   40   80:aload_1         
	//   41   81:invokestatic    #719 <Method AttributionIdentifiers AttributionIdentifiers.getAttributionIdentifiers(Context)>
	//   42   84:astore          5
		Bundle bundle = new Bundle();
	//   43   86:new             #236 <Class Bundle>
	//   44   89:dup             
	//   45   90:invokespecial   #242 <Method void Bundle()>
	//   46   93:astore          6
		if(accesstoken == null)
	//*  47   95:aload_0         
	//*  48   96:ifnonnull       139
		{
			if(attributionidentifiers.getAttributionId() != null)
	//*  49   99:aload           5
	//*  50  101:invokevirtual   #722 <Method String AttributionIdentifiers.getAttributionId()>
	//*  51  104:ifnull          116
				s = attributionidentifiers.getAttributionId();
	//   52  107:aload           5
	//   53  109:invokevirtual   #722 <Method String AttributionIdentifiers.getAttributionId()>
	//   54  112:astore_2        
			else
	//*  55  113:goto            122
				s = attributionidentifiers.getAndroidAdvertiserId();
	//   56  116:aload           5
	//   57  118:invokevirtual   #725 <Method String AttributionIdentifiers.getAndroidAdvertiserId()>
	//   58  121:astore_2        
			if(attributionidentifiers.getAttributionId() != null)
	//*  59  122:aload           5
	//*  60  124:invokevirtual   #722 <Method String AttributionIdentifiers.getAttributionId()>
	//*  61  127:ifnull          139
				bundle.putString("udid", s);
	//   62  130:aload           6
	//   63  132:ldc2            #727 <String "udid">
	//   64  135:aload_2         
	//   65  136:invokevirtual   #291 <Method void Bundle.putString(String, String)>
		}
		if(FacebookSdk.getLimitEventAndDataUsage(context) || attributionidentifiers.isTrackingLimited())
	//*  66  139:aload_1         
	//*  67  140:invokestatic    #731 <Method boolean FacebookSdk.getLimitEventAndDataUsage(Context)>
	//*  68  143:ifne            154
	//*  69  146:aload           5
	//*  70  148:invokevirtual   #734 <Method boolean AttributionIdentifiers.isTrackingLimited()>
	//*  71  151:ifeq            165
			bundle.putString("limit_event_usage", "1");
	//   72  154:aload           6
	//   73  156:ldc2            #736 <String "limit_event_usage">
	//   74  159:ldc2            #738 <String "1">
	//   75  162:invokevirtual   #291 <Method void Bundle.putString(String, String)>
		return new GraphRequest(accesstoken, ((String) (obj)), bundle, HttpMethod.GET, callback1);
	//   76  165:new             #2   <Class GraphRequest>
	//   77  168:dup             
	//   78  169:aload_0         
	//   79  170:aload           4
	//   80  172:aload           6
	//   81  174:getstatic       #261 <Field HttpMethod HttpMethod.GET>
	//   82  177:aload_3         
	//   83  178:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   84  181:areturn         
	}

	public static GraphRequest newDeleteObjectRequest(AccessToken accesstoken, String s, Callback callback1)
	{
		return new GraphRequest(accesstoken, s, ((Bundle) (null)), HttpMethod.DELETE, callback1);
	//    0    0:new             #2   <Class GraphRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:getstatic       #743 <Field HttpMethod HttpMethod.DELETE>
	//    6   10:aload_2         
	//    7   11:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
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
	//    7    9:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//    8   12:areturn         
	}

	public static GraphRequest newMeRequest(AccessToken accesstoken, GraphJSONObjectCallback graphjsonobjectcallback)
	{
		return new GraphRequest(accesstoken, "me", ((Bundle) (null)), ((HttpMethod) (null)), new Callback(graphjsonobjectcallback) {

			public void onCompleted(GraphResponse graphresponse)
			{
				if(callback != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field GraphRequest$GraphJSONObjectCallback val$callback>
			//*   2    4:ifnull          21
					callback.onCompleted(graphresponse.getJSONObject(), graphresponse);
			//    3    7:aload_0         
			//    4    8:getfield        #17  <Field GraphRequest$GraphJSONObjectCallback val$callback>
			//    5   11:aload_1         
			//    6   12:invokevirtual   #29  <Method JSONObject GraphResponse.getJSONObject()>
			//    7   15:aload_1         
			//    8   16:invokeinterface #34  <Method void GraphRequest$GraphJSONObjectCallback.onCompleted(JSONObject, GraphResponse)>
			//    9   21:return          
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
	//    3    5:ldc1            #135 <String "me">
	//    4    7:aconst_null     
	//    5    8:aconst_null     
	//    6    9:new             #6   <Class GraphRequest$1>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #749 <Method void GraphRequest$1(GraphRequest$GraphJSONObjectCallback)>
	//   10   17:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
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
	//    3    5:ldc1            #141 <String "me/friends">
	//    4    7:aconst_null     
	//    5    8:aconst_null     
	//    6    9:new             #8   <Class GraphRequest$2>
	//    7   12:dup             
	//    8   13:aload_1         
	//    9   14:invokespecial   #754 <Method void GraphRequest$2(GraphRequest$GraphJSONArrayCallback)>
	//   10   17:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   11   20:areturn         
	}

	public static GraphRequest newPlacesSearchRequest(AccessToken accesstoken, Location location, int i, int j, String s, GraphJSONArrayCallback graphjsonarraycallback)
	{
		if(location == null && Utility.isNullOrEmpty(s))
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       23
	//*   2    4:aload           4
	//*   3    6:invokestatic    #304 <Method boolean Utility.isNullOrEmpty(String)>
	//*   4    9:ifeq            23
			throw new FacebookException("Either location or searchText must be specified.");
	//    5   12:new             #436 <Class FacebookException>
	//    6   15:dup             
	//    7   16:ldc2            #758 <String "Either location or searchText must be specified.">
	//    8   19:invokespecial   #448 <Method void FacebookException(String)>
	//    9   22:athrow          
		Bundle bundle = new Bundle(5);
	//   10   23:new             #236 <Class Bundle>
	//   11   26:dup             
	//   12   27:iconst_5        
	//   13   28:invokespecial   #760 <Method void Bundle(int)>
	//   14   31:astore          6
		bundle.putString("type", "place");
	//   15   33:aload           6
	//   16   35:ldc1            #105 <String "type">
	//   17   37:ldc2            #762 <String "place">
	//   18   40:invokevirtual   #291 <Method void Bundle.putString(String, String)>
		bundle.putInt("limit", j);
	//   19   43:aload           6
	//   20   45:ldc2            #764 <String "limit">
	//   21   48:iload_3         
	//   22   49:invokevirtual   #768 <Method void Bundle.putInt(String, int)>
		if(location != null)
	//*  23   52:aload_1         
	//*  24   53:ifnull          106
		{
			bundle.putString("center", String.format(Locale.US, "%f,%f", new Object[] {
				Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())
			}));
	//   25   56:aload           6
	//   26   58:ldc2            #770 <String "center">
	//   27   61:getstatic       #389 <Field Locale Locale.US>
	//   28   64:ldc2            #772 <String "%f,%f">
	//   29   67:iconst_2        
	//   30   68:anewarray       Object[]
	//   31   71:dup             
	//   32   72:iconst_0        
	//   33   73:aload_1         
	//   34   74:invokevirtual   #778 <Method double Location.getLatitude()>
	//   35   77:invokestatic    #783 <Method Double Double.valueOf(double)>
	//   36   80:aastore         
	//   37   81:dup             
	//   38   82:iconst_1        
	//   39   83:aload_1         
	//   40   84:invokevirtual   #786 <Method double Location.getLongitude()>
	//   41   87:invokestatic    #783 <Method Double Double.valueOf(double)>
	//   42   90:aastore         
	//   43   91:invokestatic    #403 <Method String String.format(Locale, String, Object[])>
	//   44   94:invokevirtual   #291 <Method void Bundle.putString(String, String)>
			bundle.putInt("distance", i);
	//   45   97:aload           6
	//   46   99:ldc2            #788 <String "distance">
	//   47  102:iload_2         
	//   48  103:invokevirtual   #768 <Method void Bundle.putInt(String, int)>
		}
		if(!Utility.isNullOrEmpty(s))
	//*  49  106:aload           4
	//*  50  108:invokestatic    #304 <Method boolean Utility.isNullOrEmpty(String)>
	//*  51  111:ifne            124
			bundle.putString("q", s);
	//   52  114:aload           6
	//   53  116:ldc2            #790 <String "q">
	//   54  119:aload           4
	//   55  121:invokevirtual   #291 <Method void Bundle.putString(String, String)>
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
	//   56  124:new             #10  <Class GraphRequest$3>
	//   57  127:dup             
	//   58  128:aload           5
	//   59  130:invokespecial   #791 <Method void GraphRequest$3(GraphRequest$GraphJSONArrayCallback)>
	//   60  133:astore_1        
		return new GraphRequest(accesstoken, "search", bundle, HttpMethod.GET, ((Callback) (location)));
	//   61  134:new             #2   <Class GraphRequest>
	//   62  137:dup             
	//   63  138:aload_0         
	//   64  139:ldc1            #156 <String "search">
	//   65  141:aload           6
	//   66  143:getstatic       #261 <Field HttpMethod HttpMethod.GET>
	//   67  146:aload_1         
	//   68  147:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   69  150:areturn         
	}

	public static GraphRequest newPostRequest(AccessToken accesstoken, String s, JSONObject jsonobject, Callback callback1)
	{
		accesstoken = ((AccessToken) (new GraphRequest(accesstoken, s, ((Bundle) (null)), HttpMethod.POST, callback1)));
	//    0    0:new             #2   <Class GraphRequest>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:getstatic       #472 <Field HttpMethod HttpMethod.POST>
	//    6   10:aload_3         
	//    7   11:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//    8   14:astore_0        
		((GraphRequest) (accesstoken)).setGraphObject(jsonobject);
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #797 <Method void setGraphObject(JSONObject)>
		return ((GraphRequest) (accesstoken));
	//   12   20:aload_0         
	//   13   21:areturn         
	}

	public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, String s, Bitmap bitmap, String s1, Bundle bundle, Callback callback1)
	{
		s = getDefaultPhotoPathIfNull(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #801 <Method String getDefaultPhotoPathIfNull(String)>
	//    2    4:astore_1        
		Bundle bundle1 = new Bundle();
	//    3    5:new             #236 <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #242 <Method void Bundle()>
	//    6   12:astore          6
		if(bundle != null)
	//*   7   14:aload           4
	//*   8   16:ifnull          26
			bundle1.putAll(bundle);
	//    9   19:aload           6
	//   10   21:aload           4
	//   11   23:invokevirtual   #804 <Method void Bundle.putAll(Bundle)>
		bundle1.putParcelable("picture", ((Parcelable) (bitmap)));
	//   12   26:aload           6
	//   13   28:ldc1            #147 <String "picture">
	//   14   30:aload_2         
	//   15   31:invokevirtual   #808 <Method void Bundle.putParcelable(String, Parcelable)>
		if(s1 != null && !s1.isEmpty())
	//*  16   34:aload_3         
	//*  17   35:ifnull          53
	//*  18   38:aload_3         
	//*  19   39:invokevirtual   #811 <Method boolean String.isEmpty()>
	//*  20   42:ifne            53
			bundle1.putString("caption", s1);
	//   21   45:aload           6
	//   22   47:ldc1            #84  <String "caption">
	//   23   49:aload_3         
	//   24   50:invokevirtual   #291 <Method void Bundle.putString(String, String)>
		return new GraphRequest(accesstoken, s, bundle1, HttpMethod.POST, callback1);
	//   25   53:new             #2   <Class GraphRequest>
	//   26   56:dup             
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:aload           6
	//   30   61:getstatic       #472 <Field HttpMethod HttpMethod.POST>
	//   31   64:aload           5
	//   32   66:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   33   69:areturn         
	}

	public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, String s, Uri uri, String s1, Bundle bundle, Callback callback1)
		throws FileNotFoundException
	{
		s = getDefaultPhotoPathIfNull(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #801 <Method String getDefaultPhotoPathIfNull(String)>
	//    2    4:astore_1        
		if(Utility.isFileUri(uri))
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #818 <Method boolean Utility.isFileUri(Uri)>
	//*   5    9:ifeq            34
			return newUploadPhotoRequest(accesstoken, s, new File(uri.getPath()), s1, bundle, callback1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:new             #820 <Class File>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokevirtual   #823 <Method String Uri.getPath()>
	//   12   22:invokespecial   #824 <Method void File(String)>
	//   13   25:aload_3         
	//   14   26:aload           4
	//   15   28:aload           5
	//   16   30:invokestatic    #827 <Method GraphRequest newUploadPhotoRequest(AccessToken, String, File, String, Bundle, GraphRequest$Callback)>
	//   17   33:areturn         
		if(!Utility.isContentUri(uri))
	//*  18   34:aload_2         
	//*  19   35:invokestatic    #830 <Method boolean Utility.isContentUri(Uri)>
	//*  20   38:ifne            52
			throw new FacebookException("The photo Uri must be either a file:// or content:// Uri");
	//   21   41:new             #436 <Class FacebookException>
	//   22   44:dup             
	//   23   45:ldc2            #832 <String "The photo Uri must be either a file:// or content:// Uri">
	//   24   48:invokespecial   #448 <Method void FacebookException(String)>
	//   25   51:athrow          
		s1 = ((String) (new Bundle()));
	//   26   52:new             #236 <Class Bundle>
	//   27   55:dup             
	//   28   56:invokespecial   #242 <Method void Bundle()>
	//   29   59:astore_3        
		if(bundle != null)
	//*  30   60:aload           4
	//*  31   62:ifnull          71
			((Bundle) (s1)).putAll(bundle);
	//   32   65:aload_3         
	//   33   66:aload           4
	//   34   68:invokevirtual   #804 <Method void Bundle.putAll(Bundle)>
		((Bundle) (s1)).putParcelable("picture", ((Parcelable) (uri)));
	//   35   71:aload_3         
	//   36   72:ldc1            #147 <String "picture">
	//   37   74:aload_2         
	//   38   75:invokevirtual   #808 <Method void Bundle.putParcelable(String, Parcelable)>
		return new GraphRequest(accesstoken, s, ((Bundle) (s1)), HttpMethod.POST, callback1);
	//   39   78:new             #2   <Class GraphRequest>
	//   40   81:dup             
	//   41   82:aload_0         
	//   42   83:aload_1         
	//   43   84:aload_3         
	//   44   85:getstatic       #472 <Field HttpMethod HttpMethod.POST>
	//   45   88:aload           5
	//   46   90:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   47   93:areturn         
	}

	public static GraphRequest newUploadPhotoRequest(AccessToken accesstoken, String s, File file, String s1, Bundle bundle, Callback callback1)
		throws FileNotFoundException
	{
		s = getDefaultPhotoPathIfNull(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #801 <Method String getDefaultPhotoPathIfNull(String)>
	//    2    4:astore_1        
		file = ((File) (ParcelFileDescriptor.open(file, 0x10000000)));
	//    3    5:aload_2         
	//    4    6:ldc2            #833 <Int 0x10000000>
	//    5    9:invokestatic    #837 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//    6   12:astore_2        
		Bundle bundle1 = new Bundle();
	//    7   13:new             #236 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #242 <Method void Bundle()>
	//   10   20:astore          6
		if(bundle != null)
	//*  11   22:aload           4
	//*  12   24:ifnull          34
			bundle1.putAll(bundle);
	//   13   27:aload           6
	//   14   29:aload           4
	//   15   31:invokevirtual   #804 <Method void Bundle.putAll(Bundle)>
		bundle1.putParcelable("picture", ((Parcelable) (file)));
	//   16   34:aload           6
	//   17   36:ldc1            #147 <String "picture">
	//   18   38:aload_2         
	//   19   39:invokevirtual   #808 <Method void Bundle.putParcelable(String, Parcelable)>
		if(s1 != null && !s1.isEmpty())
	//*  20   42:aload_3         
	//*  21   43:ifnull          61
	//*  22   46:aload_3         
	//*  23   47:invokevirtual   #811 <Method boolean String.isEmpty()>
	//*  24   50:ifne            61
			bundle1.putString("caption", s1);
	//   25   53:aload           6
	//   26   55:ldc1            #84  <String "caption">
	//   27   57:aload_3         
	//   28   58:invokevirtual   #291 <Method void Bundle.putString(String, String)>
		return new GraphRequest(accesstoken, s, bundle1, HttpMethod.POST, callback1);
	//   29   61:new             #2   <Class GraphRequest>
	//   30   64:dup             
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:aload           6
	//   34   69:getstatic       #472 <Field HttpMethod HttpMethod.POST>
	//   35   72:aload           5
	//   36   74:invokespecial   #209 <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod, GraphRequest$Callback)>
	//   37   77:areturn         
	}

	private static String parameterToString(Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #368 <Class String>
	//*   2    4:ifeq            12
			return (String)obj;
	//    3    7:aload_0         
	//    4    8:checkcast       #368 <Class String>
	//    5   11:areturn         
		if(!(obj instanceof Boolean) && !(obj instanceof Number))
	//*   6   12:aload_0         
	//*   7   13:instanceof      #696 <Class Boolean>
	//*   8   16:ifne            64
	//*   9   19:aload_0         
	//*  10   20:instanceof      #698 <Class Number>
	//*  11   23:ifeq            29
	//*  12   26:goto            64
		{
			if(obj instanceof Date)
	//*  13   29:aload_0         
	//*  14   30:instanceof      #700 <Class Date>
	//*  15   33:ifeq            53
				return (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(obj);
	//   16   36:new             #839 <Class SimpleDateFormat>
	//   17   39:dup             
	//   18   40:ldc1            #129 <String "yyyy-MM-dd'T'HH:mm:ssZ">
	//   19   42:getstatic       #389 <Field Locale Locale.US>
	//   20   45:invokespecial   #842 <Method void SimpleDateFormat(String, Locale)>
	//   21   48:aload_0         
	//   22   49:invokevirtual   #844 <Method String SimpleDateFormat.format(Object)>
	//   23   52:areturn         
			else
				throw new IllegalArgumentException("Unsupported parameter type.");
	//   24   53:new             #383 <Class IllegalArgumentException>
	//   25   56:dup             
	//   26   57:ldc2            #846 <String "Unsupported parameter type.">
	//   27   60:invokespecial   #405 <Method void IllegalArgumentException(String)>
	//   28   63:athrow          
		} else
		{
			return obj.toString();
	//   29   64:aload_0         
	//   30   65:invokevirtual   #375 <Method String Object.toString()>
	//   31   68:areturn         
		}
	}

	private static void processGraphObject(JSONObject jsonobject, String s, KeyValueSerializer keyvalueserializer)
		throws IOException
	{
		int i;
label0:
		{
			if(isMeRequest(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #850 <Method boolean isMeRequest(String)>
	//*   2    4:ifeq            46
			{
				i = s.indexOf(":");
	//    3    7:aload_1         
	//    4    8:ldc2            #852 <String ":">
	//    5   11:invokevirtual   #856 <Method int String.indexOf(String)>
	//    6   14:istore_3        
				int j = s.indexOf("?");
	//    7   15:aload_1         
	//    8   16:ldc2            #858 <String "?">
	//    9   19:invokevirtual   #856 <Method int String.indexOf(String)>
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
				{
					i = 1;
	//   20   41:iconst_1        
	//   21   42:istore_3        
					break label0;
	//   22   43:goto            48
				}
			}
			i = 0;
	//   23   46:iconst_0        
	//   24   47:istore_3        
		}
		boolean flag;
		String s1;
		Object obj;
		for(s = ((String) (jsonobject.keys())); ((Iterator) (s)).hasNext(); processGraphObjectProperty(s1, obj, keyvalueserializer, flag))
	//*  25   48:aload_0         
	//*  26   49:invokevirtual   #861 <Method Iterator JSONObject.keys()>
	//*  27   52:astore_1        
	//*  28   53:aload_1         
	//*  29   54:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//*  30   59:ifeq            118
		{
			s1 = (String)((Iterator) (s)).next();
	//   31   62:aload_1         
	//   32   63:invokeinterface #366 <Method Object Iterator.next()>
	//   33   68:checkcast       #368 <Class String>
	//   34   71:astore          6
			obj = jsonobject.opt(s1);
	//   35   73:aload_0         
	//   36   74:aload           6
	//   37   76:invokevirtual   #864 <Method Object JSONObject.opt(String)>
	//   38   79:astore          7
			if(i && s1.equalsIgnoreCase("image"))
	//*  39   81:iload_3         
	//*  40   82:ifeq            102
	//*  41   85:aload           6
	//*  42   87:ldc2            #866 <String "image">
	//*  43   90:invokevirtual   #869 <Method boolean String.equalsIgnoreCase(String)>
	//*  44   93:ifeq            102
				flag = true;
	//   45   96:iconst_1        
	//   46   97:istore          5
			else
	//*  47   99:goto            105
				flag = false;
	//   48  102:iconst_0        
	//   49  103:istore          5
		}

	//   50  105:aload           6
	//   51  107:aload           7
	//   52  109:aload_2         
	//   53  110:iload           5
	//   54  112:invokestatic    #873 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
	//*  55  115:goto            53
	//   56  118:return          
	}

	private static void processGraphObjectProperty(String s, Object obj, KeyValueSerializer keyvalueserializer, boolean flag)
		throws IOException
	{
		Object obj1 = ((Object) (obj.getClass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #395 <Method Class Object.getClass()>
	//    2    4:astore          6
		if(((Class) (org/json/JSONObject)).isAssignableFrom(((Class) (obj1))))
	//*   3    6:ldc2            #457 <Class JSONObject>
	//*   4    9:aload           6
	//*   5   11:invokevirtual   #877 <Method boolean Class.isAssignableFrom(Class)>
	//*   6   14:ifeq            156
		{
			obj = ((Object) ((JSONObject)obj));
	//    7   17:aload_1         
	//    8   18:checkcast       #457 <Class JSONObject>
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
	//*  13   27:invokevirtual   #861 <Method Iterator JSONObject.keys()>
	//*  14   30:astore          6
	//*  15   32:aload           6
	//*  16   34:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//*  17   39:ifeq            320
					s1 = (String)((Iterator) (obj1)).next();
	//   18   42:aload           6
	//   19   44:invokeinterface #366 <Method Object Iterator.next()>
	//   20   49:checkcast       #368 <Class String>
	//   21   52:astore          7

	//   22   54:ldc2            #879 <String "%s[%s]">
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
	//   33   70:invokestatic    #642 <Method String String.format(String, Object[])>
	//   34   73:aload_1         
	//   35   74:aload           7
	//   36   76:invokevirtual   #864 <Method Object JSONObject.opt(String)>
	//   37   79:aload_2         
	//   38   80:iload_3         
	//   39   81:invokestatic    #873 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
			} else
	//*  40   84:goto            32
			{
				if(((JSONObject) (obj)).has("id"))
	//*  41   87:aload_1         
	//*  42   88:ldc2            #881 <String "id">
	//*  43   91:invokevirtual   #884 <Method boolean JSONObject.has(String)>
	//*  44   94:ifeq            111
				{
					processGraphObjectProperty(s, ((Object) (((JSONObject) (obj)).optString("id"))), keyvalueserializer, flag);
	//   45   97:aload_0         
	//   46   98:aload_1         
	//   47   99:ldc2            #881 <String "id">
	//   48  102:invokevirtual   #887 <Method String JSONObject.optString(String)>
	//   49  105:aload_2         
	//   50  106:iload_3         
	//   51  107:invokestatic    #873 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
					return;
	//   52  110:return          
				}
				if(((JSONObject) (obj)).has("url"))
	//*  53  111:aload_1         
	//*  54  112:ldc2            #889 <String "url">
	//*  55  115:invokevirtual   #884 <Method boolean JSONObject.has(String)>
	//*  56  118:ifeq            135
				{
					processGraphObjectProperty(s, ((Object) (((JSONObject) (obj)).optString("url"))), keyvalueserializer, flag);
	//   57  121:aload_0         
	//   58  122:aload_1         
	//   59  123:ldc2            #889 <String "url">
	//   60  126:invokevirtual   #887 <Method String JSONObject.optString(String)>
	//   61  129:aload_2         
	//   62  130:iload_3         
	//   63  131:invokestatic    #873 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
					return;
	//   64  134:return          
				}
				if(((JSONObject) (obj)).has("fbsdk:create_object"))
	//*  65  135:aload_1         
	//*  66  136:ldc2            #891 <String "fbsdk:create_object">
	//*  67  139:invokevirtual   #884 <Method boolean JSONObject.has(String)>
	//*  68  142:ifeq            320
				{
					processGraphObjectProperty(s, ((Object) (((JSONObject) (obj)).toString())), keyvalueserializer, flag);
	//   69  145:aload_0         
	//   70  146:aload_1         
	//   71  147:invokevirtual   #460 <Method String JSONObject.toString()>
	//   72  150:aload_2         
	//   73  151:iload_3         
	//   74  152:invokestatic    #873 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>
					return;
	//   75  155:return          
				}
			}
		} else
		if(((Class) (org/json/JSONArray)).isAssignableFrom(((Class) (obj1))))
	//*  76  156:ldc2            #893 <Class JSONArray>
	//*  77  159:aload           6
	//*  78  161:invokevirtual   #877 <Method boolean Class.isAssignableFrom(Class)>
	//*  79  164:ifeq            233
		{
			obj = ((Object) ((JSONArray)obj));
	//   80  167:aload_1         
	//   81  168:checkcast       #893 <Class JSONArray>
	//   82  171:astore_1        
			int j = ((JSONArray) (obj)).length();
	//   83  172:aload_1         
	//   84  173:invokevirtual   #896 <Method int JSONArray.length()>
	//   85  176:istore          5
			for(int i = 0; i < j; i++)
	//*  86  178:iconst_0        
	//*  87  179:istore          4
	//*  88  181:iload           4
	//*  89  183:iload           5
	//*  90  185:icmpge          320
				processGraphObjectProperty(String.format(Locale.ROOT, "%s[%d]", new Object[] {
					s, Integer.valueOf(i)
				}), ((JSONArray) (obj)).opt(i), keyvalueserializer, flag);
	//   91  188:getstatic       #463 <Field Locale Locale.ROOT>
	//   92  191:ldc2            #898 <String "%s[%d]">
	//   93  194:iconst_2        
	//   94  195:anewarray       Object[]
	//   95  198:dup             
	//   96  199:iconst_0        
	//   97  200:aload_0         
	//   98  201:aastore         
	//   99  202:dup             
	//  100  203:iconst_1        
	//  101  204:iload           4
	//  102  206:invokestatic    #592 <Method Integer Integer.valueOf(int)>
	//  103  209:aastore         
	//  104  210:invokestatic    #403 <Method String String.format(Locale, String, Object[])>
	//  105  213:aload_1         
	//  106  214:iload           4
	//  107  216:invokevirtual   #900 <Method Object JSONArray.opt(int)>
	//  108  219:aload_2         
	//  109  220:iload_3         
	//  110  221:invokestatic    #873 <Method void processGraphObjectProperty(String, Object, GraphRequest$KeyValueSerializer, boolean)>

	//  111  224:iload           4
	//  112  226:iconst_1        
	//  113  227:iadd            
	//  114  228:istore          4
		} else
	//* 115  230:goto            181
		if(!((Class) (java/lang/String)).isAssignableFrom(((Class) (obj1))) && !((Class) (java/lang/Number)).isAssignableFrom(((Class) (obj1))) && !((Class) (java/lang/Boolean)).isAssignableFrom(((Class) (obj1))))
	//* 116  233:ldc2            #368 <Class String>
	//* 117  236:aload           6
	//* 118  238:invokevirtual   #877 <Method boolean Class.isAssignableFrom(Class)>
	//* 119  241:ifne            309
	//* 120  244:ldc2            #698 <Class Number>
	//* 121  247:aload           6
	//* 122  249:invokevirtual   #877 <Method boolean Class.isAssignableFrom(Class)>
	//* 123  252:ifne            309
	//* 124  255:ldc2            #696 <Class Boolean>
	//* 125  258:aload           6
	//* 126  260:invokevirtual   #877 <Method boolean Class.isAssignableFrom(Class)>
	//* 127  263:ifeq            269
	//* 128  266:goto            309
		{
			if(((Class) (java/util/Date)).isAssignableFrom(((Class) (obj1))))
	//* 129  269:ldc2            #700 <Class Date>
	//* 130  272:aload           6
	//* 131  274:invokevirtual   #877 <Method boolean Class.isAssignableFrom(Class)>
	//* 132  277:ifeq            320
			{
				obj = ((Object) ((Date)obj));
	//  133  280:aload_1         
	//  134  281:checkcast       #700 <Class Date>
	//  135  284:astore_1        
				keyvalueserializer.writeString(s, (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)).format(((Date) (obj))));
	//  136  285:aload_2         
	//  137  286:aload_0         
	//  138  287:new             #839 <Class SimpleDateFormat>
	//  139  290:dup             
	//  140  291:ldc1            #129 <String "yyyy-MM-dd'T'HH:mm:ssZ">
	//  141  293:getstatic       #389 <Field Locale Locale.US>
	//  142  296:invokespecial   #842 <Method void SimpleDateFormat(String, Locale)>
	//  143  299:aload_1         
	//  144  300:invokevirtual   #903 <Method String SimpleDateFormat.format(Date)>
	//  145  303:invokeinterface #906 <Method void GraphRequest$KeyValueSerializer.writeString(String, String)>
				return;
	//  146  308:return          
			}
		} else
		{
			keyvalueserializer.writeString(s, obj.toString());
	//  147  309:aload_2         
	//  148  310:aload_0         
	//  149  311:aload_1         
	//  150  312:invokevirtual   #375 <Method String Object.toString()>
	//  151  315:invokeinterface #906 <Method void GraphRequest$KeyValueSerializer.writeString(String, String)>
		}
	//  152  320:return          
	}

	private static void processRequest(GraphRequestBatch graphrequestbatch, Logger logger, int i, URL url, OutputStream outputstream, boolean flag)
		throws IOException, JSONException
	{
		outputstream = ((OutputStream) (new Serializer(outputstream, logger, flag)));
	//    0    0:new             #43  <Class GraphRequest$Serializer>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:aload_1         
	//    4    7:iload           5
	//    5    9:invokespecial   #911 <Method void GraphRequest$Serializer(OutputStream, Logger, boolean)>
	//    6   12:astore          4
		if(i == 1)
	//*   7   14:iload_2         
	//*   8   15:iconst_1        
	//*   9   16:icmpne          172
		{
			graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.get(0)));
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #914 <Method GraphRequest GraphRequestBatch.get(int)>
	//   13   24:astore_0        
			HashMap hashmap = new HashMap();
	//   14   25:new             #916 <Class HashMap>
	//   15   28:dup             
	//   16   29:invokespecial   #917 <Method void HashMap()>
	//   17   32:astore          6
			Iterator iterator = ((GraphRequest) (graphrequestbatch)).parameters.keySet().iterator();
	//   18   34:aload_0         
	//   19   35:getfield        #241 <Field Bundle parameters>
	//   20   38:invokevirtual   #350 <Method Set Bundle.keySet()>
	//   21   41:invokeinterface #356 <Method Iterator Set.iterator()>
	//   22   46:astore          7
			do
			{
				if(!iterator.hasNext())
					break;
	//   23   48:aload           7
	//   24   50:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//   25   55:ifeq            112
				String s = (String)iterator.next();
	//   26   58:aload           7
	//   27   60:invokeinterface #366 <Method Object Iterator.next()>
	//   28   65:checkcast       #368 <Class String>
	//   29   68:astore          8
				Object obj = ((GraphRequest) (graphrequestbatch)).parameters.get(s);
	//   30   70:aload_0         
	//   31   71:getfield        #241 <Field Bundle parameters>
	//   32   74:aload           8
	//   33   76:invokevirtual   #372 <Method Object Bundle.get(String)>
	//   34   79:astore          9
				if(isSupportedAttachmentType(obj))
	//*  35   81:aload           9
	//*  36   83:invokestatic    #674 <Method boolean isSupportedAttachmentType(Object)>
	//*  37   86:ifeq            48
					((Map) (hashmap)).put(((Object) (s)), ((Object) (new Attachment(((GraphRequest) (graphrequestbatch)), obj))));
	//   38   89:aload           6
	//   39   91:aload           8
	//   40   93:new             #20  <Class GraphRequest$Attachment>
	//   41   96:dup             
	//   42   97:aload_0         
	//   43   98:aload           9
	//   44  100:invokespecial   #920 <Method void GraphRequest$Attachment(GraphRequest, Object)>
	//   45  103:invokeinterface #926 <Method Object Map.put(Object, Object)>
	//   46  108:pop             
			} while(true);
	//   47  109:goto            48
			if(logger != null)
	//*  48  112:aload_1         
	//*  49  113:ifnull          123
				logger.append("  Parameters:\n");
	//   50  116:aload_1         
	//   51  117:ldc2            #928 <String "  Parameters:\n">
	//   52  120:invokevirtual   #930 <Method void Logger.append(String)>
			serializeParameters(((GraphRequest) (graphrequestbatch)).parameters, ((Serializer) (outputstream)), ((GraphRequest) (graphrequestbatch)));
	//   53  123:aload_0         
	//   54  124:getfield        #241 <Field Bundle parameters>
	//   55  127:aload           4
	//   56  129:aload_0         
	//   57  130:invokestatic    #934 <Method void serializeParameters(Bundle, GraphRequest$Serializer, GraphRequest)>
			if(logger != null)
	//*  58  133:aload_1         
	//*  59  134:ifnull          144
				logger.append("  Attachments:\n");
	//   60  137:aload_1         
	//   61  138:ldc2            #936 <String "  Attachments:\n">
	//   62  141:invokevirtual   #930 <Method void Logger.append(String)>
			serializeAttachments(((Map) (hashmap)), ((Serializer) (outputstream)));
	//   63  144:aload           6
	//   64  146:aload           4
	//   65  148:invokestatic    #940 <Method void serializeAttachments(Map, GraphRequest$Serializer)>
			if(((GraphRequest) (graphrequestbatch)).graphObject != null)
	//*  66  151:aload_0         
	//*  67  152:getfield        #942 <Field JSONObject graphObject>
	//*  68  155:ifnull          235
			{
				processGraphObject(((GraphRequest) (graphrequestbatch)).graphObject, url.getPath(), ((KeyValueSerializer) (outputstream)));
	//   69  158:aload_0         
	//   70  159:getfield        #942 <Field JSONObject graphObject>
	//   71  162:aload_3         
	//   72  163:invokevirtual   #943 <Method String URL.getPath()>
	//   73  166:aload           4
	//   74  168:invokestatic    #945 <Method void processGraphObject(JSONObject, String, GraphRequest$KeyValueSerializer)>
				return;
	//   75  171:return          
			}
		} else
		{
			url = ((URL) (getBatchAppId(graphrequestbatch)));
	//   76  172:aload_0         
	//   77  173:invokestatic    #947 <Method String getBatchAppId(GraphRequestBatch)>
	//   78  176:astore_3        
			if(Utility.isNullOrEmpty(((String) (url))))
	//*  79  177:aload_3         
	//*  80  178:invokestatic    #304 <Method boolean Utility.isNullOrEmpty(String)>
	//*  81  181:ifeq            195
				throw new FacebookException("App ID was not specified at the request or Settings.");
	//   82  184:new             #436 <Class FacebookException>
	//   83  187:dup             
	//   84  188:ldc2            #949 <String "App ID was not specified at the request or Settings.">
	//   85  191:invokespecial   #448 <Method void FacebookException(String)>
	//   86  194:athrow          
			((Serializer) (outputstream)).writeString("batch_app_id", ((String) (url)));
	//   87  195:aload           4
	//   88  197:ldc1            #60  <String "batch_app_id">
	//   89  199:aload_3         
	//   90  200:invokevirtual   #950 <Method void GraphRequest$Serializer.writeString(String, String)>
			url = ((URL) (new HashMap()));
	//   91  203:new             #916 <Class HashMap>
	//   92  206:dup             
	//   93  207:invokespecial   #917 <Method void HashMap()>
	//   94  210:astore_3        
			serializeRequestsAsJSON(((Serializer) (outputstream)), ((Collection) (graphrequestbatch)), ((Map) (url)));
	//   95  211:aload           4
	//   96  213:aload_0         
	//   97  214:aload_3         
	//   98  215:invokestatic    #954 <Method void serializeRequestsAsJSON(GraphRequest$Serializer, Collection, Map)>
			if(logger != null)
	//*  99  218:aload_1         
	//* 100  219:ifnull          229
				logger.append("  Attachments:\n");
	//  101  222:aload_1         
	//  102  223:ldc2            #936 <String "  Attachments:\n">
	//  103  226:invokevirtual   #930 <Method void Logger.append(String)>
			serializeAttachments(((Map) (url)), ((Serializer) (outputstream)));
	//  104  229:aload_3         
	//  105  230:aload           4
	//  106  232:invokestatic    #940 <Method void serializeAttachments(Map, GraphRequest$Serializer)>
		}
	//  107  235:return          
	}

	static void runCallbacks(GraphRequestBatch graphrequestbatch, List list)
	{
		int j = graphrequestbatch.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #584 <Method int GraphRequestBatch.size()>
	//    2    4:istore_3        
		ArrayList arraylist = new ArrayList();
	//    3    5:new             #956 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #957 <Method void ArrayList()>
	//    6   12:astore          4
		for(int i = 0; i < j; i++)
	//*   7   14:iconst_0        
	//*   8   15:istore_2        
	//*   9   16:iload_2         
	//*  10   17:iload_3         
	//*  11   18:icmpge          68
		{
			GraphRequest graphrequest = graphrequestbatch.get(i);
	//   12   21:aload_0         
	//   13   22:iload_2         
	//   14   23:invokevirtual   #914 <Method GraphRequest GraphRequestBatch.get(int)>
	//   15   26:astore          5
			if(graphrequest.callback != null)
	//*  16   28:aload           5
	//*  17   30:getfield        #959 <Field GraphRequest$Callback callback>
	//*  18   33:ifnull          61
				arraylist.add(((Object) (new Pair(((Object) (graphrequest.callback)), list.get(i)))));
	//   19   36:aload           4
	//   20   38:new             #961 <Class Pair>
	//   21   41:dup             
	//   22   42:aload           5
	//   23   44:getfield        #959 <Field GraphRequest$Callback callback>
	//   24   47:aload_1         
	//   25   48:iload_2         
	//   26   49:invokeinterface #492 <Method Object List.get(int)>
	//   27   54:invokespecial   #964 <Method void Pair(Object, Object)>
	//   28   57:invokevirtual   #967 <Method boolean ArrayList.add(Object)>
	//   29   60:pop             
		}

	//   30   61:iload_2         
	//   31   62:iconst_1        
	//   32   63:iadd            
	//   33   64:istore_2        
	//*  34   65:goto            16
		if(arraylist.size() > 0)
	//*  35   68:aload           4
	//*  36   70:invokevirtual   #968 <Method int ArrayList.size()>
	//*  37   73:ifle            109
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
	//   38   76:new             #14  <Class GraphRequest$5>
	//   39   79:dup             
	//   40   80:aload           4
	//   41   82:aload_0         
	//   42   83:invokespecial   #971 <Method void GraphRequest$5(ArrayList, GraphRequestBatch)>
	//   43   86:astore_1        
			graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.getCallbackHandler()));
	//   44   87:aload_0         
	//   45   88:invokevirtual   #975 <Method Handler GraphRequestBatch.getCallbackHandler()>
	//   46   91:astore_0        
			if(graphrequestbatch == null)
	//*  47   92:aload_0         
	//*  48   93:ifnonnull       103
			{
				((Runnable) (list)).run();
	//   49   96:aload_1         
	//   50   97:invokeinterface #980 <Method void Runnable.run()>
				return;
	//   51  102:return          
			}
			((Handler) (graphrequestbatch)).post(((Runnable) (list)));
	//   52  103:aload_0         
	//   53  104:aload_1         
	//   54  105:invokevirtual   #986 <Method boolean Handler.post(Runnable)>
	//   55  108:pop             
		}
	//   56  109:return          
	}

	private static void serializeAttachments(Map map, Serializer serializer)
		throws IOException
	{
		Iterator iterator = map.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:invokeinterface #988 <Method Set Map.keySet()>
	//    2    6:invokeinterface #356 <Method Iterator Set.iterator()>
	//    3   11:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   12:aload_2         
	//    5   13:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//    6   18:ifeq            72
			String s = (String)iterator.next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #366 <Method Object Iterator.next()>
	//    9   27:checkcast       #368 <Class String>
	//   10   30:astore_3        
			Attachment attachment = (Attachment)map.get(((Object) (s)));
	//   11   31:aload_0         
	//   12   32:aload_3         
	//   13   33:invokeinterface #991 <Method Object Map.get(Object)>
	//   14   38:checkcast       #20  <Class GraphRequest$Attachment>
	//   15   41:astore          4
			if(isSupportedAttachmentType(attachment.getValue()))
	//*  16   43:aload           4
	//*  17   45:invokevirtual   #994 <Method Object GraphRequest$Attachment.getValue()>
	//*  18   48:invokestatic    #674 <Method boolean isSupportedAttachmentType(Object)>
	//*  19   51:ifeq            12
				serializer.writeObject(s, attachment.getValue(), attachment.getRequest());
	//   20   54:aload_1         
	//   21   55:aload_3         
	//   22   56:aload           4
	//   23   58:invokevirtual   #994 <Method Object GraphRequest$Attachment.getValue()>
	//   24   61:aload           4
	//   25   63:invokevirtual   #998 <Method GraphRequest GraphRequest$Attachment.getRequest()>
	//   26   66:invokevirtual   #1002 <Method void GraphRequest$Serializer.writeObject(String, Object, GraphRequest)>
		} while(true);
	//   27   69:goto            12
	//   28   72:return          
	}

	private static void serializeParameters(Bundle bundle, Serializer serializer, GraphRequest graphrequest)
		throws IOException
	{
		Iterator iterator = bundle.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #350 <Method Set Bundle.keySet()>
	//    2    4:invokeinterface #356 <Method Iterator Set.iterator()>
	//    3    9:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   10:aload_3         
	//    5   11:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            58
			String s = (String)iterator.next();
	//    7   19:aload_3         
	//    8   20:invokeinterface #366 <Method Object Iterator.next()>
	//    9   25:checkcast       #368 <Class String>
	//   10   28:astore          4
			Object obj = bundle.get(s);
	//   11   30:aload_0         
	//   12   31:aload           4
	//   13   33:invokevirtual   #372 <Method Object Bundle.get(String)>
	//   14   36:astore          5
			if(isSupportedParameterType(obj))
	//*  15   38:aload           5
	//*  16   40:invokestatic    #266 <Method boolean isSupportedParameterType(Object)>
	//*  17   43:ifeq            10
				serializer.writeObject(s, obj, graphrequest);
	//   18   46:aload_1         
	//   19   47:aload           4
	//   20   49:aload           5
	//   21   51:aload_2         
	//   22   52:invokevirtual   #1002 <Method void GraphRequest$Serializer.writeObject(String, Object, GraphRequest)>
		} while(true);
	//   23   55:goto            10
	//   24   58:return          
	}

	private static void serializeRequestsAsJSON(Serializer serializer, Collection collection, Map map)
		throws JSONException, IOException
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #893 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #1004 <Method void JSONArray()>
	//    3    7:astore_3        
		for(Iterator iterator = collection.iterator(); iterator.hasNext(); ((GraphRequest)iterator.next()).serializeToBatch(jsonarray, map));
	//    4    8:aload_1         
	//    5    9:invokeinterface #1007 <Method Iterator Collection.iterator()>
	//    6   14:astore          4
	//    7   16:aload           4
	//    8   18:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            44
	//   10   26:aload           4
	//   11   28:invokeinterface #366 <Method Object Iterator.next()>
	//   12   33:checkcast       #2   <Class GraphRequest>
	//   13   36:aload_3         
	//   14   37:aload_2         
	//   15   38:invokespecial   #1011 <Method void serializeToBatch(JSONArray, Map)>
	//*  16   41:goto            16
		serializer.writeRequestsAsJson("batch", jsonarray, collection);
	//   17   44:aload_0         
	//   18   45:ldc1            #78  <String "batch">
	//   19   47:aload_3         
	//   20   48:aload_1         
	//   21   49:invokevirtual   #1015 <Method void GraphRequest$Serializer.writeRequestsAsJson(String, JSONArray, Collection)>
	//   22   52:return          
	}

	private void serializeToBatch(JSONArray jsonarray, final Map keysAndValues)
		throws JSONException, IOException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #457 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #1017 <Method void JSONObject()>
	//    3    7:astore_3        
		if(batchEntryName != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #1019 <Field String batchEntryName>
	//*   6   12:ifnull          37
		{
			jsonobject.put("name", ((Object) (batchEntryName)));
	//    7   15:aload_3         
	//    8   16:ldc1            #69  <String "name">
	//    9   18:aload_0         
	//   10   19:getfield        #1019 <Field String batchEntryName>
	//   11   22:invokevirtual   #1022 <Method JSONObject JSONObject.put(String, Object)>
	//   12   25:pop             
			jsonobject.put("omit_response_on_success", batchEntryOmitResultOnSuccess);
	//   13   26:aload_3         
	//   14   27:ldc1            #72  <String "omit_response_on_success">
	//   15   29:aload_0         
	//   16   30:getfield        #218 <Field boolean batchEntryOmitResultOnSuccess>
	//   17   33:invokevirtual   #1025 <Method JSONObject JSONObject.put(String, boolean)>
	//   18   36:pop             
		}
		if(batchEntryDependsOn != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #1027 <Field String batchEntryDependsOn>
	//*  21   41:ifnull          55
			jsonobject.put("depends_on", ((Object) (batchEntryDependsOn)));
	//   22   44:aload_3         
	//   23   45:ldc1            #66  <String "depends_on">
	//   24   47:aload_0         
	//   25   48:getfield        #1027 <Field String batchEntryDependsOn>
	//   26   51:invokevirtual   #1022 <Method JSONObject JSONObject.put(String, Object)>
	//   27   54:pop             
		String s = getUrlForBatchedRequest();
	//   28   55:aload_0         
	//   29   56:invokevirtual   #1030 <Method String getUrlForBatchedRequest()>
	//   30   59:astore          4
		jsonobject.put("relative_url", ((Object) (s)));
	//   31   61:aload_3         
	//   32   62:ldc1            #81  <String "relative_url">
	//   33   64:aload           4
	//   34   66:invokevirtual   #1022 <Method JSONObject JSONObject.put(String, Object)>
	//   35   69:pop             
		jsonobject.put("method", ((Object) (httpMethod)));
	//   36   70:aload_3         
	//   37   71:ldc1            #75  <String "method">
	//   38   73:aload_0         
	//   39   74:getfield        #381 <Field HttpMethod httpMethod>
	//   40   77:invokevirtual   #1022 <Method JSONObject JSONObject.put(String, Object)>
	//   41   80:pop             
		if(accessToken != null)
	//*  42   81:aload_0         
	//*  43   82:getfield        #222 <Field AccessToken accessToken>
	//*  44   85:ifnull          98
			Logger.registerAccessToken(accessToken.getToken());
	//   45   88:aload_0         
	//   46   89:getfield        #222 <Field AccessToken accessToken>
	//   47   92:invokevirtual   #281 <Method String AccessToken.getToken()>
	//   48   95:invokestatic    #287 <Method void Logger.registerAccessToken(String)>
		ArrayList arraylist = new ArrayList();
	//   49   98:new             #956 <Class ArrayList>
	//   50  101:dup             
	//   51  102:invokespecial   #957 <Method void ArrayList()>
	//   52  105:astore          5
		Iterator iterator = parameters.keySet().iterator();
	//   53  107:aload_0         
	//   54  108:getfield        #241 <Field Bundle parameters>
	//   55  111:invokevirtual   #350 <Method Set Bundle.keySet()>
	//   56  114:invokeinterface #356 <Method Iterator Set.iterator()>
	//   57  119:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//   58  121:aload           6
	//   59  123:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//   60  128:ifeq            224
			Object obj = ((Object) ((String)iterator.next()));
	//   61  131:aload           6
	//   62  133:invokeinterface #366 <Method Object Iterator.next()>
	//   63  138:checkcast       #368 <Class String>
	//   64  141:astore          7
			obj = parameters.get(((String) (obj)));
	//   65  143:aload_0         
	//   66  144:getfield        #241 <Field Bundle parameters>
	//   67  147:aload           7
	//   68  149:invokevirtual   #372 <Method Object Bundle.get(String)>
	//   69  152:astore          7
			if(isSupportedAttachmentType(obj))
	//*  70  154:aload           7
	//*  71  156:invokestatic    #674 <Method boolean isSupportedAttachmentType(Object)>
	//*  72  159:ifeq            121
			{
				String s1 = String.format(Locale.ROOT, "%s%d", new Object[] {
					"file", Integer.valueOf(keysAndValues.size())
				});
	//   73  162:getstatic       #463 <Field Locale Locale.ROOT>
	//   74  165:ldc2            #1032 <String "%s%d">
	//   75  168:iconst_2        
	//   76  169:anewarray       Object[]
	//   77  172:dup             
	//   78  173:iconst_0        
	//   79  174:ldc1            #57  <String "file">
	//   80  176:aastore         
	//   81  177:dup             
	//   82  178:iconst_1        
	//   83  179:aload_2         
	//   84  180:invokeinterface #1033 <Method int Map.size()>
	//   85  185:invokestatic    #592 <Method Integer Integer.valueOf(int)>
	//   86  188:aastore         
	//   87  189:invokestatic    #403 <Method String String.format(Locale, String, Object[])>
	//   88  192:astore          8
				arraylist.add(((Object) (s1)));
	//   89  194:aload           5
	//   90  196:aload           8
	//   91  198:invokevirtual   #967 <Method boolean ArrayList.add(Object)>
	//   92  201:pop             
				keysAndValues.put(((Object) (s1)), ((Object) (new Attachment(this, obj))));
	//   93  202:aload_2         
	//   94  203:aload           8
	//   95  205:new             #20  <Class GraphRequest$Attachment>
	//   96  208:dup             
	//   97  209:aload_0         
	//   98  210:aload           7
	//   99  212:invokespecial   #920 <Method void GraphRequest$Attachment(GraphRequest, Object)>
	//  100  215:invokeinterface #926 <Method Object Map.put(Object, Object)>
	//  101  220:pop             
			}
		} while(true);
	//  102  221:goto            121
		if(!arraylist.isEmpty())
	//* 103  224:aload           5
	//* 104  226:invokevirtual   #1034 <Method boolean ArrayList.isEmpty()>
	//* 105  229:ifne            247
			jsonobject.put("attached_files", ((Object) (TextUtils.join(",", ((Iterable) (arraylist))))));
	//  106  232:aload_3         
	//  107  233:ldc1            #54  <String "attached_files">
	//  108  235:ldc2            #1036 <String ",">
	//  109  238:aload           5
	//  110  240:invokestatic    #1042 <Method String TextUtils.join(CharSequence, Iterable)>
	//  111  243:invokevirtual   #1022 <Method JSONObject JSONObject.put(String, Object)>
	//  112  246:pop             
		if(graphObject != null)
	//* 113  247:aload_0         
	//* 114  248:getfield        #942 <Field JSONObject graphObject>
	//* 115  251:ifnull          294
		{
			keysAndValues = ((Map) (new ArrayList()));
	//  116  254:new             #956 <Class ArrayList>
	//  117  257:dup             
	//  118  258:invokespecial   #957 <Method void ArrayList()>
	//  119  261:astore_2        
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
	//  120  262:aload_0         
	//  121  263:getfield        #942 <Field JSONObject graphObject>
	//  122  266:aload           4
	//  123  268:new             #16  <Class GraphRequest$6>
	//  124  271:dup             
	//  125  272:aload_0         
	//  126  273:aload_2         
	//  127  274:invokespecial   #1045 <Method void GraphRequest$6(GraphRequest, ArrayList)>
	//  128  277:invokestatic    #945 <Method void processGraphObject(JSONObject, String, GraphRequest$KeyValueSerializer)>
			jsonobject.put("body", ((Object) (TextUtils.join("&", ((Iterable) (keysAndValues))))));
	//  129  280:aload_3         
	//  130  281:ldc1            #63  <String "body">
	//  131  283:ldc2            #1047 <String "&">
	//  132  286:aload_2         
	//  133  287:invokestatic    #1042 <Method String TextUtils.join(CharSequence, Iterable)>
	//  134  290:invokevirtual   #1022 <Method JSONObject JSONObject.put(String, Object)>
	//  135  293:pop             
		}
		jsonarray.put(((Object) (jsonobject)));
	//  136  294:aload_1         
	//  137  295:aload_3         
	//  138  296:invokevirtual   #1050 <Method JSONArray JSONArray.put(Object)>
	//  139  299:pop             
	//  140  300:return          
	}

	static final void serializeToUrlConnection(GraphRequestBatch graphrequestbatch, HttpURLConnection httpurlconnection)
		throws IOException, JSONException
	{
		int j;
		boolean flag1;
		Logger logger;
		URL url;
		logger = new Logger(LoggingBehavior.REQUESTS, "Request");
	//    0    0:new             #283 <Class Logger>
	//    1    3:dup             
	//    2    4:getstatic       #1056 <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//    3    7:ldc2            #1058 <String "Request">
	//    4   10:invokespecial   #1061 <Method void Logger(LoggingBehavior, String)>
	//    5   13:astore          7
		j = graphrequestbatch.size();
	//    6   15:aload_0         
	//    7   16:invokevirtual   #584 <Method int GraphRequestBatch.size()>
	//    8   19:istore_3        
		flag1 = isGzipCompressible(graphrequestbatch);
	//    9   20:aload_0         
	//   10   21:invokestatic    #1063 <Method boolean isGzipCompressible(GraphRequestBatch)>
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
	//   19   35:invokevirtual   #914 <Method GraphRequest GraphRequestBatch.get(int)>
	//   20   38:getfield        #381 <Field HttpMethod httpMethod>
	//   21   41:astore          5
		else
	//*  22   43:goto            51
			httpmethod = HttpMethod.POST;
	//   23   46:getstatic       #472 <Field HttpMethod HttpMethod.POST>
	//   24   49:astore          5
		httpurlconnection.setRequestMethod(httpmethod.name());
	//   25   51:aload_1         
	//   26   52:aload           5
	//   27   54:invokevirtual   #1065 <Method String HttpMethod.name()>
	//   28   57:invokevirtual   #1068 <Method void HttpURLConnection.setRequestMethod(String)>
		setConnectionContentType(httpurlconnection, flag1);
	//   29   60:aload_1         
	//   30   61:iload           4
	//   31   63:invokestatic    #1072 <Method void setConnectionContentType(HttpURLConnection, boolean)>
		url = httpurlconnection.getURL();
	//   32   66:aload_1         
	//   33   67:invokevirtual   #1076 <Method URL HttpURLConnection.getURL()>
	//   34   70:astore          8
		logger.append("Request:\n");
	//   35   72:aload           7
	//   36   74:ldc2            #1078 <String "Request:\n">
	//   37   77:invokevirtual   #930 <Method void Logger.append(String)>
		logger.appendKeyValue("Id", ((Object) (graphrequestbatch.getId())));
	//   38   80:aload           7
	//   39   82:ldc2            #1080 <String "Id">
	//   40   85:aload_0         
	//   41   86:invokevirtual   #1083 <Method String GraphRequestBatch.getId()>
	//   42   89:invokevirtual   #1087 <Method void Logger.appendKeyValue(String, Object)>
		logger.appendKeyValue("URL", ((Object) (url)));
	//   43   92:aload           7
	//   44   94:ldc2            #1089 <String "URL">
	//   45   97:aload           8
	//   46   99:invokevirtual   #1087 <Method void Logger.appendKeyValue(String, Object)>
		logger.appendKeyValue("Method", ((Object) (httpurlconnection.getRequestMethod())));
	//   47  102:aload           7
	//   48  104:ldc2            #1091 <String "Method">
	//   49  107:aload_1         
	//   50  108:invokevirtual   #1094 <Method String HttpURLConnection.getRequestMethod()>
	//   51  111:invokevirtual   #1087 <Method void Logger.appendKeyValue(String, Object)>
		logger.appendKeyValue("User-Agent", ((Object) (httpurlconnection.getRequestProperty("User-Agent"))));
	//   52  114:aload           7
	//   53  116:ldc1            #165 <String "User-Agent">
	//   54  118:aload_1         
	//   55  119:ldc1            #165 <String "User-Agent">
	//   56  121:invokevirtual   #1097 <Method String HttpURLConnection.getRequestProperty(String)>
	//   57  124:invokevirtual   #1087 <Method void Logger.appendKeyValue(String, Object)>
		logger.appendKeyValue("Content-Type", ((Object) (httpurlconnection.getRequestProperty("Content-Type"))));
	//   58  127:aload           7
	//   59  129:ldc1            #90  <String "Content-Type">
	//   60  131:aload_1         
	//   61  132:ldc1            #90  <String "Content-Type">
	//   62  134:invokevirtual   #1097 <Method String HttpURLConnection.getRequestProperty(String)>
	//   63  137:invokevirtual   #1087 <Method void Logger.appendKeyValue(String, Object)>
		httpurlconnection.setConnectTimeout(graphrequestbatch.getTimeout());
	//   64  140:aload_1         
	//   65  141:aload_0         
	//   66  142:invokevirtual   #1100 <Method int GraphRequestBatch.getTimeout()>
	//   67  145:invokevirtual   #1103 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setReadTimeout(graphrequestbatch.getTimeout());
	//   68  148:aload_1         
	//   69  149:aload_0         
	//   70  150:invokevirtual   #1100 <Method int GraphRequestBatch.getTimeout()>
	//   71  153:invokevirtual   #1106 <Method void HttpURLConnection.setReadTimeout(int)>
		if(httpmethod == HttpMethod.POST)
	//*  72  156:aload           5
	//*  73  158:getstatic       #472 <Field HttpMethod HttpMethod.POST>
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
	//   80  172:invokevirtual   #1109 <Method void Logger.log()>
			return;
	//   81  175:return          
		}
		httpurlconnection.setDoOutput(true);
	//   82  176:aload_1         
	//   83  177:iconst_1        
	//   84  178:invokevirtual   #1113 <Method void HttpURLConnection.setDoOutput(boolean)>
		httpurlconnection = ((HttpURLConnection) (new BufferedOutputStream(httpurlconnection.getOutputStream())));
	//   85  181:new             #1115 <Class BufferedOutputStream>
	//   86  184:dup             
	//   87  185:aload_1         
	//   88  186:invokevirtual   #1119 <Method OutputStream HttpURLConnection.getOutputStream()>
	//   89  189:invokespecial   #1122 <Method void BufferedOutputStream(OutputStream)>
	//   90  192:astore_1        
		if(!flag1)
			break MISSING_BLOCK_LABEL_221;
	//   91  193:iload           4
	//   92  195:ifeq            221
		Object obj = ((Object) (new GZIPOutputStream(((OutputStream) (httpurlconnection)))));
	//   93  198:new             #1124 <Class GZIPOutputStream>
	//   94  201:dup             
	//   95  202:aload_1         
	//   96  203:invokespecial   #1125 <Method void GZIPOutputStream(OutputStream)>
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
		break MISSING_BLOCK_LABEL_336;
	//  104  218:goto            336
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
	//  110  228:invokestatic    #1127 <Method boolean hasOnProgressCallbacks(GraphRequestBatch)>
	//  111  231:ifeq            295
		obj = ((Object) (httpurlconnection));
	//  112  234:aload_1         
	//  113  235:astore          5
		obj1 = ((Object) (new ProgressNoopOutputStream(graphrequestbatch.getCallbackHandler())));
	//  114  237:new             #1129 <Class ProgressNoopOutputStream>
	//  115  240:dup             
	//  116  241:aload_0         
	//  117  242:invokevirtual   #975 <Method Handler GraphRequestBatch.getCallbackHandler()>
	//  118  245:invokespecial   #1131 <Method void ProgressNoopOutputStream(Handler)>
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
	//  128  262:invokestatic    #1133 <Method void processRequest(GraphRequestBatch, Logger, int, URL, OutputStream, boolean)>
		obj = ((Object) (httpurlconnection));
	//  129  265:aload_1         
	//  130  266:astore          5
		int i = ((ProgressNoopOutputStream) (obj1)).getMaxProgress();
	//  131  268:aload           6
	//  132  270:invokevirtual   #1136 <Method int ProgressNoopOutputStream.getMaxProgress()>
	//  133  273:istore_2        
		obj = ((Object) (httpurlconnection));
	//  134  274:aload_1         
	//  135  275:astore          5
		obj1 = ((Object) (new ProgressOutputStream(((OutputStream) (httpurlconnection)), graphrequestbatch, ((ProgressNoopOutputStream) (obj1)).getProgressMap(), i)));
	//  136  277:new             #1138 <Class ProgressOutputStream>
	//  137  280:dup             
	//  138  281:aload_1         
	//  139  282:aload_0         
	//  140  283:aload           6
	//  141  285:invokevirtual   #1142 <Method Map ProgressNoopOutputStream.getProgressMap()>
	//  142  288:iload_2         
	//  143  289:i2l             
	//  144  290:invokespecial   #1145 <Method void ProgressOutputStream(OutputStream, GraphRequestBatch, Map, long)>
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
	//  154  309:invokestatic    #1133 <Method void processRequest(GraphRequestBatch, Logger, int, URL, OutputStream, boolean)>
		if(obj1 != null)
	//* 155  312:aload           6
	//* 156  314:ifnull          322
			((OutputStream) (obj1)).close();
	//  157  317:aload           6
	//  158  319:invokevirtual   #1150 <Method void OutputStream.close()>
		logger.log();
	//  159  322:aload           7
	//  160  324:invokevirtual   #1109 <Method void Logger.log()>
		return;
	//  161  327:return          
		graphrequestbatch;
	//  162  328:astore_0        
		break MISSING_BLOCK_LABEL_336;
	//  163  329:goto            336
		graphrequestbatch;
	//  164  332:astore_0        
		obj = null;
	//  165  333:aconst_null     
	//  166  334:astore          5
		if(obj != null)
	//* 167  336:aload           5
	//* 168  338:ifnull          346
			((OutputStream) (obj)).close();
	//  169  341:aload           5
	//  170  343:invokevirtual   #1150 <Method void OutputStream.close()>
		throw graphrequestbatch;
	//  171  346:aload_0         
	//  172  347:athrow          
	}

	private static void setConnectionContentType(HttpURLConnection httpurlconnection, boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
		{
			httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	//    2    4:aload_0         
	//    3    5:ldc1            #90  <String "Content-Type">
	//    4    7:ldc2            #1152 <String "application/x-www-form-urlencoded">
	//    5   10:invokevirtual   #422 <Method void HttpURLConnection.setRequestProperty(String, String)>
			httpurlconnection.setRequestProperty("Content-Encoding", "gzip");
	//    6   13:aload_0         
	//    7   14:ldc1            #87  <String "Content-Encoding">
	//    8   16:ldc2            #1154 <String "gzip">
	//    9   19:invokevirtual   #422 <Method void HttpURLConnection.setRequestProperty(String, String)>
			return;
	//   10   22:return          
		} else
		{
			httpurlconnection.setRequestProperty("Content-Type", getMimeContentType());
	//   11   23:aload_0         
	//   12   24:ldc1            #90  <String "Content-Type">
	//   13   26:invokestatic    #1156 <Method String getMimeContentType()>
	//   14   29:invokevirtual   #422 <Method void HttpURLConnection.setRequestProperty(String, String)>
			return;
	//   15   32:return          
		}
	}

	public static final void setDefaultBatchApplicationId(String s)
	{
		defaultBatchApplicationId = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #627 <Field String defaultBatchApplicationId>
	//    2    4:return          
	}

	static final boolean shouldWarnOnMissingFieldsParam(GraphRequest graphrequest)
	{
		boolean flag;
label0:
		{
			String s = graphrequest.getVersion();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1162 <Method String getVersion()>
	//    2    4:astore_3        
			if(Utility.isNullOrEmpty(s))
	//*   3    5:aload_3         
	//*   4    6:invokestatic    #304 <Method boolean Utility.isNullOrEmpty(String)>
	//*   5    9:ifeq            14
				return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
			graphrequest = ((GraphRequest) (s));
	//    8   14:aload_3         
	//    9   15:astore_0        
			if(s.startsWith("v"))
	//*  10   16:aload_3         
	//*  11   17:ldc2            #1164 <String "v">
	//*  12   20:invokevirtual   #684 <Method boolean String.startsWith(String)>
	//*  13   23:ifeq            32
				graphrequest = ((GraphRequest) (s.substring(1)));
	//   14   26:aload_3         
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #1167 <Method String String.substring(int)>
	//   17   31:astore_0        
			graphrequest = ((GraphRequest) (((String) (graphrequest)).split("\\.")));
	//   18   32:aload_0         
	//   19   33:ldc2            #1169 <String "\\.">
	//   20   36:invokevirtual   #1173 <Method String[] String.split(String)>
	//   21   39:astore_0        
			boolean flag1 = false;
	//   22   40:iconst_0        
	//   23   41:istore_2        
			if(graphrequest.length < 2 || Integer.parseInt(((String) (graphrequest[0]))) <= 2)
	//*  24   42:aload_0         
	//*  25   43:arraylength     
	//*  26   44:iconst_2        
	//*  27   45:icmplt          58
	//*  28   48:aload_0         
	//*  29   49:iconst_0        
	//*  30   50:aaload          
	//*  31   51:invokestatic    #1176 <Method int Integer.parseInt(String)>
	//*  32   54:iconst_2        
	//*  33   55:icmpgt          82
			{
				flag = flag1;
	//   34   58:iload_2         
	//   35   59:istore_1        
				if(Integer.parseInt(((String) (graphrequest[0]))) < 2)
					break label0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:aaload          
	//   39   63:invokestatic    #1176 <Method int Integer.parseInt(String)>
	//   40   66:iconst_2        
	//   41   67:icmplt          84
				flag = flag1;
	//   42   70:iload_2         
	//   43   71:istore_1        
				if(Integer.parseInt(((String) (graphrequest[1]))) < 4)
					break label0;
	//   44   72:aload_0         
	//   45   73:iconst_1        
	//   46   74:aaload          
	//   47   75:invokestatic    #1176 <Method int Integer.parseInt(String)>
	//   48   78:iconst_4        
	//   49   79:icmplt          84
			}
			flag = true;
	//   50   82:iconst_1        
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
	//    1    1:invokestatic    #1181 <Method void validateFieldsParamForGetRequests(GraphRequestBatch)>
label0:
		{
			Object obj;
			if(graphrequestbatch.size() == 1)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #584 <Method int GraphRequestBatch.size()>
	//*   4    8:iconst_1        
	//*   5    9:icmpne          31
			{
				obj = ((Object) (new URL(graphrequestbatch.get(0).getUrlForSingleRequest())));
	//    6   12:new             #251 <Class URL>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #914 <Method GraphRequest GraphRequestBatch.get(int)>
	//   11   21:invokevirtual   #1184 <Method String getUrlForSingleRequest()>
	//   12   24:invokespecial   #1185 <Method void URL(String)>
	//   13   27:astore_1        
				break label0;
	//   14   28:goto            42
			}
			try
			{
				obj = ((Object) (new URL(ServerProtocol.getGraphUrlBase())));
	//   15   31:new             #251 <Class URL>
	//   16   34:dup             
	//   17   35:invokestatic    #1188 <Method String ServerProtocol.getGraphUrlBase()>
	//   18   38:invokespecial   #1185 <Method void URL(String)>
	//   19   41:astore_1        
			}
	//*  20   42:aload_1         
	//*  21   43:invokestatic    #1190 <Method HttpURLConnection createConnection(URL)>
	//*  22   46:astore_1        
	//*  23   47:aload_0         
	//*  24   48:aload_1         
	//*  25   49:invokestatic    #1192 <Method void serializeToUrlConnection(GraphRequestBatch, HttpURLConnection)>
	//*  26   52:aload_1         
	//*  27   53:areturn         
	//*  28   54:astore_0        
	//*  29   55:new             #436 <Class FacebookException>
	//*  30   58:dup             
	//*  31   59:ldc2            #1194 <String "could not construct request body">
	//*  32   62:aload_0         
	//*  33   63:invokespecial   #1197 <Method void FacebookException(String, Throwable)>
	//*  34   66:athrow          
	//*  35   67:astore_0        
	//*  36   68:new             #436 <Class FacebookException>
	//*  37   71:dup             
	//*  38   72:ldc2            #1194 <String "could not construct request body">
	//*  39   75:aload_0         
	//*  40   76:invokespecial   #1197 <Method void FacebookException(String, Throwable)>
	//*  41   79:athrow          
			// Misplaced declaration of an exception variable
			catch(GraphRequestBatch graphrequestbatch)
	//*  42   80:astore_0        
			{
				throw new FacebookException("could not construct URL for request", ((Throwable) (graphrequestbatch)));
	//   43   81:new             #436 <Class FacebookException>
	//   44   84:dup             
	//   45   85:ldc2            #1199 <String "could not construct URL for request">
	//   46   88:aload_0         
	//   47   89:invokespecial   #1197 <Method void FacebookException(String, Throwable)>
	//   48   92:athrow          
			}
		}
		try
		{
			obj = ((Object) (createConnection(((URL) (obj)))));
			serializeToUrlConnection(graphrequestbatch, ((HttpURLConnection) (obj)));
		}
		// Misplaced declaration of an exception variable
		catch(GraphRequestBatch graphrequestbatch)
		{
			throw new FacebookException("could not construct request body", ((Throwable) (graphrequestbatch)));
		}
		// Misplaced declaration of an exception variable
		catch(GraphRequestBatch graphrequestbatch)
		{
			throw new FacebookException("could not construct request body", ((Throwable) (graphrequestbatch)));
		}
		return ((HttpURLConnection) (obj));
	}

	public static HttpURLConnection toHttpConnection(Collection collection)
	{
		Validate.notEmptyAndContainsNoNulls(collection, "requests");
	//    0    0:aload_0         
	//    1    1:ldc2            #501 <String "requests">
	//    2    4:invokestatic    #507 <Method void Validate.notEmptyAndContainsNoNulls(Collection, String)>
		return toHttpConnection(new GraphRequestBatch(collection));
	//    3    7:new             #517 <Class GraphRequestBatch>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #538 <Method void GraphRequestBatch(Collection)>
	//    7   15:invokestatic    #511 <Method HttpURLConnection toHttpConnection(GraphRequestBatch)>
	//    8   18:areturn         
	}

	public static transient HttpURLConnection toHttpConnection(GraphRequest agraphrequest[])
	{
		return toHttpConnection(((Collection) (Arrays.asList(((Object []) (agraphrequest))))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #551 <Method List Arrays.asList(Object[])>
	//    2    4:invokestatic    #1204 <Method HttpURLConnection toHttpConnection(Collection)>
	//    3    7:areturn         
	}

	static final void validateFieldsParamForGetRequests(GraphRequestBatch graphrequestbatch)
	{
		graphrequestbatch = ((GraphRequestBatch) (graphrequestbatch.iterator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #624 <Method Iterator GraphRequestBatch.iterator()>
	//    2    4:astore_0        
		do
		{
			if(!((Iterator) (graphrequestbatch)).hasNext())
				break;
	//    3    5:aload_0         
	//    4    6:invokeinterface #362 <Method boolean Iterator.hasNext()>
	//    5   11:ifeq            97
			GraphRequest graphrequest = (GraphRequest)((Iterator) (graphrequestbatch)).next();
	//    6   14:aload_0         
	//    7   15:invokeinterface #366 <Method Object Iterator.next()>
	//    8   20:checkcast       #2   <Class GraphRequest>
	//    9   23:astore_1        
			if(HttpMethod.GET.equals(((Object) (graphrequest.getHttpMethod()))) && shouldWarnOnMissingFieldsParam(graphrequest))
	//*  10   24:getstatic       #261 <Field HttpMethod HttpMethod.GET>
	//*  11   27:aload_1         
	//*  12   28:invokevirtual   #1208 <Method HttpMethod getHttpMethod()>
	//*  13   31:invokevirtual   #1211 <Method boolean HttpMethod.equals(Object)>
	//*  14   34:ifeq            5
	//*  15   37:aload_1         
	//*  16   38:invokestatic    #1213 <Method boolean shouldWarnOnMissingFieldsParam(GraphRequest)>
	//*  17   41:ifeq            5
			{
				Bundle bundle = graphrequest.getParameters();
	//   18   44:aload_1         
	//   19   45:invokevirtual   #1217 <Method Bundle getParameters()>
	//   20   48:astore_2        
				if(!bundle.containsKey("fields") || Utility.isNullOrEmpty(bundle.getString("fields")))
	//*  21   49:aload_2         
	//*  22   50:ldc1            #117 <String "fields">
	//*  23   52:invokevirtual   #276 <Method boolean Bundle.containsKey(String)>
	//*  24   55:ifeq            70
	//*  25   58:aload_2         
	//*  26   59:ldc1            #117 <String "fields">
	//*  27   61:invokevirtual   #1218 <Method String Bundle.getString(String)>
	//*  28   64:invokestatic    #304 <Method boolean Utility.isNullOrEmpty(String)>
	//*  29   67:ifeq            5
					Logger.log(LoggingBehavior.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", new Object[] {
						graphrequest.getGraphPath()
					});
	//   30   70:getstatic       #1221 <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
	//   31   73:iconst_5        
	//   32   74:ldc2            #1058 <String "Request">
	//   33   77:ldc2            #1223 <String "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.">
	//   34   80:iconst_1        
	//   35   81:anewarray       Object[]
	//   36   84:dup             
	//   37   85:iconst_0        
	//   38   86:aload_1         
	//   39   87:invokevirtual   #1226 <Method String getGraphPath()>
	//   40   90:aastore         
	//   41   91:invokestatic    #1229 <Method void Logger.log(LoggingBehavior, int, String, String, Object[])>
			}
		} while(true);
	//   42   94:goto            5
	//   43   97:return          
	}

	public final GraphResponse executeAndWait()
	{
		return executeAndWait(this);
	//    0    0:aload_0         
	//    1    1:invokestatic    #1232 <Method GraphResponse executeAndWait(GraphRequest)>
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
	//    6    8:invokestatic    #1236 <Method GraphRequestAsyncTask executeBatchAsync(GraphRequest[])>
	//    7   11:areturn         
	}

	public final AccessToken getAccessToken()
	{
		return accessToken;
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field AccessToken accessToken>
	//    2    4:areturn         
	}

	public final String getBatchEntryDependsOn()
	{
		return batchEntryDependsOn;
	//    0    0:aload_0         
	//    1    1:getfield        #1027 <Field String batchEntryDependsOn>
	//    2    4:areturn         
	}

	public final String getBatchEntryName()
	{
		return batchEntryName;
	//    0    0:aload_0         
	//    1    1:getfield        #1019 <Field String batchEntryName>
	//    2    4:areturn         
	}

	public final boolean getBatchEntryOmitResultOnSuccess()
	{
		return batchEntryOmitResultOnSuccess;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field boolean batchEntryOmitResultOnSuccess>
	//    2    4:ireturn         
	}

	public final Callback getCallback()
	{
		return callback;
	//    0    0:aload_0         
	//    1    1:getfield        #959 <Field GraphRequest$Callback callback>
	//    2    4:areturn         
	}

	public final JSONObject getGraphObject()
	{
		return graphObject;
	//    0    0:aload_0         
	//    1    1:getfield        #942 <Field JSONObject graphObject>
	//    2    4:areturn         
	}

	public final String getGraphPath()
	{
		return graphPath;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field String graphPath>
	//    2    4:areturn         
	}

	public final HttpMethod getHttpMethod()
	{
		return httpMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #381 <Field HttpMethod httpMethod>
	//    2    4:areturn         
	}

	public final Bundle getParameters()
	{
		return parameters;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field Bundle parameters>
	//    2    4:areturn         
	}

	public final Object getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #1245 <Field Object tag>
	//    2    4:areturn         
	}

	final String getUrlForBatchedRequest()
	{
		if(overriddenURL != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field String overriddenURL>
	//*   2    4:ifnull          18
		{
			throw new FacebookException("Can't override URL for a batch request");
	//    3    7:new             #436 <Class FacebookException>
	//    4   10:dup             
	//    5   11:ldc2            #1247 <String "Can't override URL for a batch request">
	//    6   14:invokespecial   #448 <Method void FacebookException(String)>
	//    7   17:athrow          
		} else
		{
			String s = getGraphPathWithVersion();
	//    8   18:aload_0         
	//    9   19:invokespecial   #1249 <Method String getGraphPathWithVersion()>
	//   10   22:astore_1        
			addCommonParameters();
	//   11   23:aload_0         
	//   12   24:invokespecial   #1251 <Method void addCommonParameters()>
			return appendParametersToBaseUrl(s);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokespecial   #1253 <Method String appendParametersToBaseUrl(String)>
	//   16   32:areturn         
		}
	}

	final String getUrlForSingleRequest()
	{
		if(overriddenURL != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field String overriddenURL>
	//*   2    4:ifnull          15
			return overriddenURL.toString();
	//    3    7:aload_0         
	//    4    8:getfield        #256 <Field String overriddenURL>
	//    5   11:invokevirtual   #1254 <Method String String.toString()>
	//    6   14:areturn         
		String s;
		if(getHttpMethod() == HttpMethod.POST && graphPath != null && graphPath.endsWith("/videos"))
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #1208 <Method HttpMethod getHttpMethod()>
	//*   9   19:getstatic       #472 <Field HttpMethod HttpMethod.POST>
	//*  10   22:if_acmpne       51
	//*  11   25:aload_0         
	//*  12   26:getfield        #224 <Field String graphPath>
	//*  13   29:ifnull          51
	//*  14   32:aload_0         
	//*  15   33:getfield        #224 <Field String graphPath>
	//*  16   36:ldc1            #168 <String "/videos">
	//*  17   38:invokevirtual   #1257 <Method boolean String.endsWith(String)>
	//*  18   41:ifeq            51
			s = ServerProtocol.getGraphVideoUrlBase();
	//   19   44:invokestatic    #1260 <Method String ServerProtocol.getGraphVideoUrlBase()>
	//   20   47:astore_1        
		else
	//*  21   48:goto            55
			s = ServerProtocol.getGraphUrlBase();
	//   22   51:invokestatic    #1188 <Method String ServerProtocol.getGraphUrlBase()>
	//   23   54:astore_1        
		s = String.format("%s/%s", new Object[] {
			s, getGraphPathWithVersion()
		});
	//   24   55:ldc1            #126 <String "%s/%s">
	//   25   57:iconst_2        
	//   26   58:anewarray       Object[]
	//   27   61:dup             
	//   28   62:iconst_0        
	//   29   63:aload_1         
	//   30   64:aastore         
	//   31   65:dup             
	//   32   66:iconst_1        
	//   33   67:aload_0         
	//   34   68:invokespecial   #1249 <Method String getGraphPathWithVersion()>
	//   35   71:aastore         
	//   36   72:invokestatic    #642 <Method String String.format(String, Object[])>
	//   37   75:astore_1        
		addCommonParameters();
	//   38   76:aload_0         
	//   39   77:invokespecial   #1251 <Method void addCommonParameters()>
		return appendParametersToBaseUrl(s);
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:invokespecial   #1253 <Method String appendParametersToBaseUrl(String)>
	//   43   85:areturn         
	}

	public final String getVersion()
	{
		return version;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field String version>
	//    2    4:areturn         
	}

	public final void setAccessToken(AccessToken accesstoken)
	{
		accessToken = accesstoken;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #222 <Field AccessToken accessToken>
	//    3    5:return          
	}

	public final void setBatchEntryDependsOn(String s)
	{
		batchEntryDependsOn = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1027 <Field String batchEntryDependsOn>
	//    3    5:return          
	}

	public final void setBatchEntryName(String s)
	{
		batchEntryName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1019 <Field String batchEntryName>
	//    3    5:return          
	}

	public final void setBatchEntryOmitResultOnSuccess(boolean flag)
	{
		batchEntryOmitResultOnSuccess = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #218 <Field boolean batchEntryOmitResultOnSuccess>
	//    3    5:return          
	}

	public final void setCallback(final Callback callback)
	{
		if(!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO) && !FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING))
	//*   0    0:getstatic       #330 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_INFO>
	//*   1    3:invokestatic    #334 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*   2    6:ifne            27
	//*   3    9:getstatic       #337 <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
	//*   4   12:invokestatic    #334 <Method boolean FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior)>
	//*   5   15:ifeq            21
	//*   6   18:goto            27
		{
			this.callback = callback;
	//    7   21:aload_0         
	//    8   22:aload_1         
	//    9   23:putfield        #959 <Field GraphRequest$Callback callback>
			return;
	//   10   26:return          
		} else
		{
			this.callback = new Callback() {

				public void onCompleted(GraphResponse graphresponse)
				{
					JSONObject jsonobject = graphresponse.getJSONObject();
				//    0    0:aload_1         
				//    1    1:invokevirtual   #33  <Method JSONObject GraphResponse.getJSONObject()>
				//    2    4:astore_3        
					if(jsonobject != null)
				//*   3    5:aload_3         
				//*   4    6:ifnull          19
						jsonobject = jsonobject.optJSONObject("__debug__");
				//    5    9:aload_3         
				//    6   10:ldc1            #35  <String "__debug__">
				//    7   12:invokevirtual   #41  <Method JSONObject JSONObject.optJSONObject(String)>
				//    8   15:astore_3        
					else
				//*   9   16:goto            21
						jsonobject = null;
				//   10   19:aconst_null     
				//   11   20:astore_3        
					JSONArray jsonarray;
					if(jsonobject != null)
				//*  12   21:aload_3         
				//*  13   22:ifnull          36
						jsonarray = jsonobject.optJSONArray("messages");
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
							Object obj1 = ((Object) (jsonarray.optJSONObject(i)));
				//   29   55:aload           4
				//   30   57:iload_2         
				//   31   58:invokevirtual   #56  <Method JSONObject JSONArray.optJSONObject(int)>
				//   32   61:astore          6
							String s;
							if(obj1 != null)
				//*  33   63:aload           6
				//*  34   65:ifnull          79
								s = ((JSONObject) (obj1)).optString("message");
				//   35   68:aload           6
				//   36   70:ldc1            #58  <String "message">
				//   37   72:invokevirtual   #62  <Method String JSONObject.optString(String)>
				//   38   75:astore_3        
							else
				//*  39   76:goto            81
								s = null;
				//   40   79:aconst_null     
				//   41   80:astore_3        
							Object obj;
							if(obj1 != null)
				//*  42   81:aload           6
				//*  43   83:ifnull          98
								obj = ((Object) (((JSONObject) (obj1)).optString("type")));
				//   44   86:aload           6
				//   45   88:ldc1            #64  <String "type">
				//   46   90:invokevirtual   #62  <Method String JSONObject.optString(String)>
				//   47   93:astore          5
							else
				//*  48   95:goto            101
								obj = null;
				//   49   98:aconst_null     
				//   50   99:astore          5
							if(obj1 != null)
				//*  51  101:aload           6
				//*  52  103:ifnull          118
								obj1 = ((Object) (((JSONObject) (obj1)).optString("link")));
				//   53  106:aload           6
				//   54  108:ldc1            #66  <String "link">
				//   55  110:invokevirtual   #62  <Method String JSONObject.optString(String)>
				//   56  113:astore          6
							else
				//*  57  115:goto            121
								obj1 = null;
				//   58  118:aconst_null     
				//   59  119:astore          6
							if(s == null || obj == null)
								continue;
				//   60  121:aload_3         
				//   61  122:ifnull          210
				//   62  125:aload           5
				//   63  127:ifnull          210
							LoggingBehavior loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
				//   64  130:getstatic       #72  <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_INFO>
				//   65  133:astore          7
							if(((String) (obj)).equals("warning"))
				//*  66  135:aload           5
				//*  67  137:ldc1            #74  <String "warning">
				//*  68  139:invokevirtual   #80  <Method boolean String.equals(Object)>
				//*  69  142:ifeq            150
								loggingbehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
				//   70  145:getstatic       #83  <Field LoggingBehavior LoggingBehavior.GRAPH_API_DEBUG_WARNING>
				//   71  148:astore          7
							obj = ((Object) (s));
				//   72  150:aload_3         
				//   73  151:astore          5
							if(!Utility.isNullOrEmpty(((String) (obj1))))
				//*  74  153:aload           6
				//*  75  155:invokestatic    #89  <Method boolean Utility.isNullOrEmpty(String)>
				//*  76  158:ifne            200
							{
								obj = ((Object) (new StringBuilder()));
				//   77  161:new             #91  <Class StringBuilder>
				//   78  164:dup             
				//   79  165:invokespecial   #92  <Method void StringBuilder()>
				//   80  168:astore          5
								((StringBuilder) (obj)).append(s);
				//   81  170:aload           5
				//   82  172:aload_3         
				//   83  173:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
				//   84  176:pop             
								((StringBuilder) (obj)).append(" Link: ");
				//   85  177:aload           5
				//   86  179:ldc1            #98  <String " Link: ">
				//   87  181:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
				//   88  184:pop             
								((StringBuilder) (obj)).append(((String) (obj1)));
				//   89  185:aload           5
				//   90  187:aload           6
				//   91  189:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
				//   92  192:pop             
								obj = ((Object) (((StringBuilder) (obj)).toString()));
				//   93  193:aload           5
				//   94  195:invokevirtual   #102 <Method String StringBuilder.toString()>
				//   95  198:astore          5
							}
							Logger.log(loggingbehavior, GraphRequest.TAG, ((String) (obj)));
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
					if(callback != null)
				//* 105  217:aload_0         
				//* 106  218:getfield        #21  <Field GraphRequest$Callback val$callback>
				//* 107  221:ifnull          234
						callback.onCompleted(graphresponse);
				//  108  224:aload_0         
				//  109  225:getfield        #21  <Field GraphRequest$Callback val$callback>
				//  110  228:aload_1         
				//  111  229:invokeinterface #114 <Method void GraphRequest$Callback.onCompleted(GraphResponse)>
				//  112  234:return          
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
	//   16   34:invokespecial   #1268 <Method void GraphRequest$4(GraphRequest, GraphRequest$Callback)>
	//   17   37:putfield        #959 <Field GraphRequest$Callback callback>
			return;
	//   18   40:return          
		}
	}

	public final void setGraphObject(JSONObject jsonobject)
	{
		graphObject = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #942 <Field JSONObject graphObject>
	//    3    5:return          
	}

	public final void setGraphPath(String s)
	{
		graphPath = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #224 <Field String graphPath>
	//    3    5:return          
	}

	public final void setHttpMethod(HttpMethod httpmethod)
	{
		if(overriddenURL != null && httpmethod != HttpMethod.GET)
	//*   0    0:aload_0         
	//*   1    1:getfield        #256 <Field String overriddenURL>
	//*   2    4:ifnull          25
	//*   3    7:aload_1         
	//*   4    8:getstatic       #261 <Field HttpMethod HttpMethod.GET>
	//*   5   11:if_acmpeq       25
			throw new FacebookException("Can't change HTTP method on request with overridden URL.");
	//    6   14:new             #436 <Class FacebookException>
	//    7   17:dup             
	//    8   18:ldc2            #1271 <String "Can't change HTTP method on request with overridden URL.">
	//    9   21:invokespecial   #448 <Method void FacebookException(String)>
	//   10   24:athrow          
		if(httpmethod == null)
	//*  11   25:aload_1         
	//*  12   26:ifnull          32
	//*  13   29:goto            36
			httpmethod = HttpMethod.GET;
	//   14   32:getstatic       #261 <Field HttpMethod HttpMethod.GET>
	//   15   35:astore_1        
		httpMethod = httpmethod;
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:putfield        #381 <Field HttpMethod httpMethod>
	//   19   41:return          
	}

	public final void setParameters(Bundle bundle)
	{
		parameters = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #241 <Field Bundle parameters>
	//    3    5:return          
	}

	public final void setSkipClientToken(boolean flag)
	{
		skipClientToken = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #220 <Field boolean skipClientToken>
	//    3    5:return          
	}

	public final void setTag(Object obj)
	{
		tag = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1245 <Field Object tag>
	//    3    5:return          
	}

	public final void setVersion(String s)
	{
		version = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #226 <Field String version>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #306 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #307 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("{Request: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #1278 <String "{Request: ">
	//    6   12:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(" accessToken: ");
	//    8   16:aload_2         
	//    9   17:ldc2            #1280 <String " accessToken: ">
	//   10   20:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		Object obj;
		if(accessToken == null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #222 <Field AccessToken accessToken>
	//*  14   28:ifnonnull       38
			obj = "null";
	//   15   31:ldc2            #1282 <String "null">
	//   16   34:astore_1        
		else
	//*  17   35:goto            43
			obj = ((Object) (accessToken));
	//   18   38:aload_0         
	//   19   39:getfield        #222 <Field AccessToken accessToken>
	//   20   42:astore_1        
		stringbuilder.append(obj);
	//   21   43:aload_2         
	//   22   44:aload_1         
	//   23   45:invokevirtual   #1285 <Method StringBuilder StringBuilder.append(Object)>
	//   24   48:pop             
		stringbuilder.append(", graphPath: ");
	//   25   49:aload_2         
	//   26   50:ldc2            #1287 <String ", graphPath: ">
	//   27   53:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append(graphPath);
	//   29   57:aload_2         
	//   30   58:aload_0         
	//   31   59:getfield        #224 <Field String graphPath>
	//   32   62:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
		stringbuilder.append(", graphObject: ");
	//   34   66:aload_2         
	//   35   67:ldc2            #1289 <String ", graphObject: ">
	//   36   70:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
		stringbuilder.append(((Object) (graphObject)));
	//   38   74:aload_2         
	//   39   75:aload_0         
	//   40   76:getfield        #942 <Field JSONObject graphObject>
	//   41   79:invokevirtual   #1285 <Method StringBuilder StringBuilder.append(Object)>
	//   42   82:pop             
		stringbuilder.append(", httpMethod: ");
	//   43   83:aload_2         
	//   44   84:ldc2            #1291 <String ", httpMethod: ">
	//   45   87:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   46   90:pop             
		stringbuilder.append(((Object) (httpMethod)));
	//   47   91:aload_2         
	//   48   92:aload_0         
	//   49   93:getfield        #381 <Field HttpMethod httpMethod>
	//   50   96:invokevirtual   #1285 <Method StringBuilder StringBuilder.append(Object)>
	//   51   99:pop             
		stringbuilder.append(", parameters: ");
	//   52  100:aload_2         
	//   53  101:ldc2            #1293 <String ", parameters: ">
	//   54  104:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   55  107:pop             
		stringbuilder.append(((Object) (parameters)));
	//   56  108:aload_2         
	//   57  109:aload_0         
	//   58  110:getfield        #241 <Field Bundle parameters>
	//   59  113:invokevirtual   #1285 <Method StringBuilder StringBuilder.append(Object)>
	//   60  116:pop             
		stringbuilder.append("}");
	//   61  117:aload_2         
	//   62  118:ldc2            #1295 <String "}">
	//   63  121:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   64  124:pop             
		return stringbuilder.toString();
	//   65  125:aload_2         
	//   66  126:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   67  129:areturn         
	}

	private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
	private static final String ACCESS_TOKEN_PARAM = "access_token";
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
	private static final String MIME_BOUNDARY = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f";
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
	//    0    0:ldc1            #196 <String "^/?v\\d+\\.\\d+/(.*)">
	//    1    2:invokestatic    #202 <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #204 <Field Pattern versionPattern>
	//*   3    8:return          
	}


/*
	static boolean access$000(Object obj)
	{
		return isSupportedParameterType(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #266 <Method boolean isSupportedParameterType(Object)>
	//    2    4:ireturn         
	}

*/


/*
	static String access$100(Object obj)
	{
		return parameterToString(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #271 <Method String parameterToString(Object)>
	//    2    4:areturn         
	}

*/
}
