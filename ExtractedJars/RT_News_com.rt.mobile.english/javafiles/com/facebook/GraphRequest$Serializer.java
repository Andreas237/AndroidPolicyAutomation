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
//			GraphRequest, FacebookSdk, ProgressNoopOutputStream, RequestOutputStream

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
			i = Utility.copyAndCloseInputStream(((java.io.InputStream) (new android.os.oCloseInputStream(parcelfiledescriptor))), outputStream) + 0;
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
		if(GraphRequest.access$000(obj))
	//*   9   23:aload_2         
	//*  10   24:invokestatic    #219 <Method boolean GraphRequest.access$000(Object)>
	//*  11   27:ifeq            40
		{
			writeString(s, GraphRequest.access$100(obj));
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
		if(obj instanceof esourceWithMimeType)
	//*  56  110:aload_2         
	//*  57  111:instanceof      #241 <Class GraphRequest$ParcelableResourceWithMimeType>
	//*  58  114:ifeq            173
		{
			graphrequest = ((GraphRequest) ((esourceWithMimeType)obj));
	//   59  117:aload_2         
	//   60  118:checkcast       #241 <Class GraphRequest$ParcelableResourceWithMimeType>
	//   61  121:astore_3        
			obj = ((Object) (((esourceWithMimeType) (graphrequest)).getResource()));
	//   62  122:aload_3         
	//   63  123:invokevirtual   #245 <Method android.os.Parcelable GraphRequest$ParcelableResourceWithMimeType.getResource()>
	//   64  126:astore_2        
			graphrequest = ((GraphRequest) (((esourceWithMimeType) (graphrequest)).getMimeType()));
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
