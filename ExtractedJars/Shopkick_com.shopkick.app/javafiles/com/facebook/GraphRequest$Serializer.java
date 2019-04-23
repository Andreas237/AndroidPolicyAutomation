// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook:
//			GraphRequest, ProgressNoopOutputStream, FacebookSdk, RequestOutputStream

private static class GraphRequest$Serializer
	implements ializer
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
				outputStream.write(GraphRequest.access$200().getBytes());
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
			i = Utility.copyAndCloseInputStream(((java.io.InputStream) (new android.os.oCloseInputStream(parcelfiledescriptor))), outputStream) + 0;
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
		if(GraphRequest.access$000(obj))
	//*  10   25:aload_2         
	//*  11   26:invokestatic    #220 <Method boolean GraphRequest.access$000(Object)>
	//*  12   29:ifeq            42
		{
			writeString(s, GraphRequest.access$100(obj));
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
		if(obj instanceof esourceWithMimeType)
	//*  57  112:aload_2         
	//*  58  113:instanceof      #242 <Class GraphRequest$ParcelableResourceWithMimeType>
	//*  59  116:ifeq            175
		{
			graphrequest = ((GraphRequest) ((esourceWithMimeType)obj));
	//   60  119:aload_2         
	//   61  120:checkcast       #242 <Class GraphRequest$ParcelableResourceWithMimeType>
	//   62  123:astore_3        
			obj = ((Object) (((esourceWithMimeType) (graphrequest)).getResource()));
	//   63  124:aload_3         
	//   64  125:invokevirtual   #246 <Method android.os.Parcelable GraphRequest$ParcelableResourceWithMimeType.getResource()>
	//   65  128:astore_2        
			graphrequest = ((GraphRequest) (((esourceWithMimeType) (graphrequest)).getMimeType()));
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
				GraphRequest.access$200()
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

	public GraphRequest$Serializer(OutputStream outputstream, Logger logger1, boolean flag)
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
