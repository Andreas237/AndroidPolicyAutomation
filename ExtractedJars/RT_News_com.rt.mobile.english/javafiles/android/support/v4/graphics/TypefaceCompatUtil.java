// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.*;
import android.util.Log;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TypefaceCompatUtil
{

	private TypefaceCompatUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #29  <Method void Closeable.close()>
		return;
	//    4   10:return          
		closeable;
	//    5   11:astore_0        
	//    6   12:return          
	}

	public static ByteBuffer copyToDirectBuffer(Context context, Resources resources, int i)
	{
		context = ((Context) (getTempFile(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #38  <Method File getTempFile(Context)>
	//    2    4:astore_0        
		if(context == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		boolean flag = copyToFile(((File) (context)), resources, i);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:iload_2         
	//   10   14:invokestatic    #42  <Method boolean copyToFile(File, Resources, int)>
	//   11   17:istore_3        
		if(!flag)
	//*  12   18:iload_3         
	//*  13   19:ifne            29
		{
			((File) (context)).delete();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #48  <Method boolean File.delete()>
	//   16   26:pop             
			return null;
	//   17   27:aconst_null     
	//   18   28:areturn         
		}
		resources = ((Resources) (mmap(((File) (context)))));
	//   19   29:aload_0         
	//   20   30:invokestatic    #52  <Method ByteBuffer mmap(File)>
	//   21   33:astore_1        
		((File) (context)).delete();
	//   22   34:aload_0         
	//   23   35:invokevirtual   #48  <Method boolean File.delete()>
	//   24   38:pop             
		return ((ByteBuffer) (resources));
	//   25   39:aload_1         
	//   26   40:areturn         
		resources;
	//   27   41:astore_1        
		((File) (context)).delete();
	//   28   42:aload_0         
	//   29   43:invokevirtual   #48  <Method boolean File.delete()>
	//   30   46:pop             
		throw resources;
	//   31   47:aload_1         
	//   32   48:athrow          
	}

	public static boolean copyToFile(File file, Resources resources, int i)
	{
		resources = ((Resources) (resources.openRawResource(i)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #59  <Method InputStream Resources.openRawResource(int)>
	//    3    5:astore_1        
		boolean flag = copyToFile(file, ((InputStream) (resources)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokestatic    #62  <Method boolean copyToFile(File, InputStream)>
	//    7   11:istore_3        
		closeQuietly(((Closeable) (resources)));
	//    8   12:aload_1         
	//    9   13:invokestatic    #64  <Method void closeQuietly(Closeable)>
		return flag;
	//   10   16:iload_3         
	//   11   17:ireturn         
		file;
	//   12   18:astore_0        
		break MISSING_BLOCK_LABEL_25;
	//   13   19:goto            25
		file;
	//   14   22:astore_0        
		resources = null;
	//   15   23:aconst_null     
	//   16   24:astore_1        
		closeQuietly(((Closeable) (resources)));
	//   17   25:aload_1         
	//   18   26:invokestatic    #64  <Method void closeQuietly(Closeable)>
		throw file;
	//   19   29:aload_0         
	//   20   30:athrow          
	}

	public static boolean copyToFile(File file, InputStream inputstream)
	{
		Object obj;
		StringBuilder stringbuilder;
		stringbuilder = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		file = ((File) (new FileOutputStream(file, false)));
	//    4    5:new             #66  <Class FileOutputStream>
	//    5    8:dup             
	//    6    9:aload_0         
	//    7   10:iconst_0        
	//    8   11:invokespecial   #69  <Method void FileOutputStream(File, boolean)>
	//    9   14:astore_0        
		obj = ((Object) (new byte[1024]));
	//   10   15:sipush          1024
	//   11   18:newarray        byte[]
	//   12   20:astore_3        
_L1:
		int i = inputstream.read(((byte []) (obj)));
	//   13   21:aload_1         
	//   14   22:aload_3         
	//   15   23:invokevirtual   #75  <Method int InputStream.read(byte[])>
	//   16   26:istore_2        
		if(i == -1)
			break MISSING_BLOCK_LABEL_42;
	//   17   27:iload_2         
	//   18   28:iconst_m1       
	//   19   29:icmpeq          42
		try
		{
			((FileOutputStream) (file)).write(((byte []) (obj)), 0, i);
	//   20   32:aload_0         
	//   21   33:aload_3         
	//   22   34:iconst_0        
	//   23   35:iload_2         
	//   24   36:invokevirtual   #79  <Method void FileOutputStream.write(byte[], int, int)>
		}
	//*  25   39:goto            21
	//*  26   42:aload_0         
	//*  27   43:invokestatic    #64  <Method void closeQuietly(Closeable)>
	//*  28   46:iconst_1        
	//*  29   47:ireturn         
	//*  30   48:astore_1        
	//*  31   49:aload_0         
	//*  32   50:astore_3        
	//*  33   51:aload_1         
	//*  34   52:astore_0        
	//*  35   53:goto            120
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  36   56:astore_1        
		{
			break MISSING_BLOCK_LABEL_68;
	//   37   57:goto            68
		}
		  goto _L1
		closeQuietly(((Closeable) (file)));
		return true;
		inputstream;
		obj = ((Object) (file));
		file = ((File) (inputstream));
		break MISSING_BLOCK_LABEL_120;
		file;
	//   38   60:astore_0        
		break MISSING_BLOCK_LABEL_120;
	//   39   61:goto            120
		inputstream;
	//   40   64:astore_1        
		file = ((File) (stringbuilder));
	//   41   65:aload           4
	//   42   67:astore_0        
		obj = ((Object) (file));
	//   43   68:aload_0         
	//   44   69:astore_3        
		stringbuilder = new StringBuilder();
	//   45   70:new             #81  <Class StringBuilder>
	//   46   73:dup             
	//   47   74:invokespecial   #82  <Method void StringBuilder()>
	//   48   77:astore          4
		obj = ((Object) (file));
	//   49   79:aload_0         
	//   50   80:astore_3        
		stringbuilder.append("Error copying resource contents to temp file: ");
	//   51   81:aload           4
	//   52   83:ldc1            #84  <String "Error copying resource contents to temp file: ">
	//   53   85:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   54   88:pop             
		obj = ((Object) (file));
	//   55   89:aload_0         
	//   56   90:astore_3        
		stringbuilder.append(((IOException) (inputstream)).getMessage());
	//   57   91:aload           4
	//   58   93:aload_1         
	//   59   94:invokevirtual   #92  <Method String IOException.getMessage()>
	//   60   97:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   61  100:pop             
		obj = ((Object) (file));
	//   62  101:aload_0         
	//   63  102:astore_3        
		Log.e("TypefaceCompatUtil", stringbuilder.toString());
	//   64  103:ldc1            #15  <String "TypefaceCompatUtil">
	//   65  105:aload           4
	//   66  107:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   67  110:invokestatic    #101 <Method int Log.e(String, String)>
	//   68  113:pop             
		closeQuietly(((Closeable) (file)));
	//   69  114:aload_0         
	//   70  115:invokestatic    #64  <Method void closeQuietly(Closeable)>
		return false;
	//   71  118:iconst_0        
	//   72  119:ireturn         
		closeQuietly(((Closeable) (obj)));
	//   73  120:aload_3         
	//   74  121:invokestatic    #64  <Method void closeQuietly(Closeable)>
		throw file;
	//   75  124:aload_0         
	//   76  125:athrow          
	}

	public static File getTempFile(Context context)
	{
		int i;
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (obj)).append(".font");
	//    4    8:aload_3         
	//    5    9:ldc1            #12  <String ".font">
	//    6   11:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(Process.myPid());
	//    8   15:aload_3         
	//    9   16:invokestatic    #107 <Method int Process.myPid()>
	//   10   19:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
	//   11   22:pop             
		((StringBuilder) (obj)).append("-");
	//   12   23:aload_3         
	//   13   24:ldc1            #112 <String "-">
	//   14   26:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		((StringBuilder) (obj)).append(Process.myTid());
	//   16   30:aload_3         
	//   17   31:invokestatic    #115 <Method int Process.myTid()>
	//   18   34:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
	//   19   37:pop             
		((StringBuilder) (obj)).append("-");
	//   20   38:aload_3         
	//   21   39:ldc1            #112 <String "-">
	//   22   41:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   24   45:aload_3         
	//   25   46:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   26   49:astore_3        
		i = 0;
	//   27   50:iconst_0        
	//   28   51:istore_1        
_L2:
		File file;
		if(i >= 100)
			break; /* Loop/switch isn't completed */
	//   29   52:iload_1         
	//   30   53:bipush          100
	//   31   55:icmpge          123
		file = context.getCacheDir();
	//   32   58:aload_0         
	//   33   59:invokevirtual   #121 <Method File Context.getCacheDir()>
	//   34   62:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   35   64:new             #81  <Class StringBuilder>
	//   36   67:dup             
	//   37   68:invokespecial   #82  <Method void StringBuilder()>
	//   38   71:astore          5
		stringbuilder.append(((String) (obj)));
	//   39   73:aload           5
	//   40   75:aload_3         
	//   41   76:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   42   79:pop             
		stringbuilder.append(i);
	//   43   80:aload           5
	//   44   82:iload_1         
	//   45   83:invokevirtual   #110 <Method StringBuilder StringBuilder.append(int)>
	//   46   86:pop             
		file = new File(file, stringbuilder.toString());
	//   47   87:new             #44  <Class File>
	//   48   90:dup             
	//   49   91:aload           4
	//   50   93:aload           5
	//   51   95:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   52   98:invokespecial   #124 <Method void File(File, String)>
	//   53  101:astore          4
		boolean flag = file.createNewFile();
	//   54  103:aload           4
	//   55  105:invokevirtual   #127 <Method boolean File.createNewFile()>
	//   56  108:istore_2        
		if(flag)
	//*  57  109:iload_2         
	//*  58  110:ifeq            116
			return file;
	//   59  113:aload           4
	//   60  115:areturn         
_L3:
		i++;
	//   61  116:iload_1         
	//   62  117:iconst_1        
	//   63  118:iadd            
	//   64  119:istore_1        
		if(true) goto _L2; else goto _L1
	//   65  120:goto            52
_L1:
		return null;
	//   66  123:aconst_null     
	//   67  124:areturn         
		IOException ioexception;
		ioexception;
	//   68  125:astore          4
		  goto _L3
	//*  69  127:goto            116
	}

	public static ByteBuffer mmap(Context context, CancellationSignal cancellationsignal, Uri uri)
	{
		context = ((Context) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		long l;
		Object obj;
		try
		{
			uri = ((Uri) (((ContentResolver) (context)).openFileDescriptor(uri, "r", cancellationsignal)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:ldc1            #136 <String "r">
	//    6    9:aload_1         
	//    7   10:invokevirtual   #142 <Method ParcelFileDescriptor ContentResolver.openFileDescriptor(Uri, String, CancellationSignal)>
	//    8   13:astore_2        
		}
	//*   9   14:aload_2         
	//*  10   15:ifnonnull       28
	//*  11   18:aload_2         
	//*  12   19:ifnull          26
	//*  13   22:aload_2         
	//*  14   23:invokevirtual   #145 <Method void ParcelFileDescriptor.close()>
	//*  15   26:aconst_null     
	//*  16   27:areturn         
	//*  17   28:new             #147 <Class FileInputStream>
	//*  18   31:dup             
	//*  19   32:aload_2         
	//*  20   33:invokevirtual   #151 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//*  21   36:invokespecial   #154 <Method void FileInputStream(java.io.FileDescriptor)>
	//*  22   39:astore          5
	//*  23   41:aload           5
	//*  24   43:invokevirtual   #158 <Method FileChannel FileInputStream.getChannel()>
	//*  25   46:astore_0        
	//*  26   47:aload_0         
	//*  27   48:invokevirtual   #164 <Method long FileChannel.size()>
	//*  28   51:lstore_3        
	//*  29   52:aload_0         
	//*  30   53:getstatic       #170 <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_ONLY>
	//*  31   56:lconst_0        
	//*  32   57:lload_3         
	//*  33   58:invokevirtual   #174 <Method java.nio.MappedByteBuffer FileChannel.map(java.nio.channels.FileChannel$MapMode, long, long)>
	//*  34   61:astore_0        
	//*  35   62:aload           5
	//*  36   64:ifnull          72
	//*  37   67:aload           5
	//*  38   69:invokevirtual   #175 <Method void FileInputStream.close()>
	//*  39   72:aload_2         
	//*  40   73:ifnull          80
	//*  41   76:aload_2         
	//*  42   77:invokevirtual   #145 <Method void ParcelFileDescriptor.close()>
	//*  43   80:aload_0         
	//*  44   81:areturn         
	//*  45   82:astore_1        
	//*  46   83:aconst_null     
	//*  47   84:astore_0        
	//*  48   85:goto            92
	//*  49   88:astore_0        
	//*  50   89:aload_0         
	//*  51   90:athrow          
	//*  52   91:astore_1        
	//*  53   92:aload           5
	//*  54   94:ifnull          125
	//*  55   97:aload_0         
	//*  56   98:ifnull          120
	//*  57  101:aload           5
	//*  58  103:invokevirtual   #175 <Method void FileInputStream.close()>
	//*  59  106:goto            125
	//*  60  109:astore          5
	//*  61  111:aload_0         
	//*  62  112:aload           5
	//*  63  114:invokestatic    #181 <Method void ThrowableExtension.addSuppressed(Throwable, Throwable)>
	//*  64  117:goto            125
	//*  65  120:aload           5
	//*  66  122:invokevirtual   #175 <Method void FileInputStream.close()>
	//*  67  125:aload_1         
	//*  68  126:athrow          
	//*  69  127:astore_0        
	//*  70  128:aconst_null     
	//*  71  129:astore_1        
	//*  72  130:goto            137
	//*  73  133:astore_1        
	//*  74  134:aload_1         
	//*  75  135:athrow          
	//*  76  136:astore_0        
	//*  77  137:aload_2         
	//*  78  138:ifnull          165
	//*  79  141:aload_1         
	//*  80  142:ifnull          161
	//*  81  145:aload_2         
	//*  82  146:invokevirtual   #145 <Method void ParcelFileDescriptor.close()>
	//*  83  149:goto            165
	//*  84  152:astore_2        
	//*  85  153:aload_1         
	//*  86  154:aload_2         
	//*  87  155:invokestatic    #181 <Method void ThrowableExtension.addSuppressed(Throwable, Throwable)>
	//*  88  158:goto            165
	//*  89  161:aload_2         
	//*  90  162:invokevirtual   #145 <Method void ParcelFileDescriptor.close()>
	//*  91  165:aload_0         
	//*  92  166:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  93  167:astore_0        
		{
			return null;
	//   94  168:aconst_null     
	//   95  169:areturn         
		}
		if(uri != null)
			break MISSING_BLOCK_LABEL_28;
		if(uri == null)
			break MISSING_BLOCK_LABEL_26;
		((ParcelFileDescriptor) (uri)).close();
		return null;
		obj = ((Object) (new FileInputStream(((ParcelFileDescriptor) (uri)).getFileDescriptor())));
		context = ((Context) (((FileInputStream) (obj)).getChannel()));
		l = ((FileChannel) (context)).size();
		context = ((Context) (((FileChannel) (context)).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, l)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_72;
		((FileInputStream) (obj)).close();
		if(uri == null)
			break MISSING_BLOCK_LABEL_80;
		((ParcelFileDescriptor) (uri)).close();
		return ((ByteBuffer) (context));
		cancellationsignal;
		context = null;
		break MISSING_BLOCK_LABEL_92;
		context;
		throw context;
		cancellationsignal;
		if(obj == null)
			break MISSING_BLOCK_LABEL_125;
		if(context == null) goto _L2; else goto _L1
_L1:
		try
		{
			((FileInputStream) (obj)).close();
			break MISSING_BLOCK_LABEL_125;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		try
		{
			ThrowableExtension.addSuppressed(((Throwable) (context)), ((Throwable) (obj)));
			break MISSING_BLOCK_LABEL_125;
		}
		// Misplaced declaration of an exception variable
		catch(CancellationSignal cancellationsignal) { }
		  goto _L3
_L2:
		((FileInputStream) (obj)).close();
		throw cancellationsignal;
		context;
		cancellationsignal = null;
		break MISSING_BLOCK_LABEL_137;
_L3:
		throw cancellationsignal;
		context;
		if(uri == null)
			break MISSING_BLOCK_LABEL_165;
		if(cancellationsignal == null)
			break MISSING_BLOCK_LABEL_161;
		((ParcelFileDescriptor) (uri)).close();
		break MISSING_BLOCK_LABEL_165;
		uri;
		ThrowableExtension.addSuppressed(((Throwable) (cancellationsignal)), ((Throwable) (uri)));
		break MISSING_BLOCK_LABEL_165;
		((ParcelFileDescriptor) (uri)).close();
		throw context;
	}

	private static ByteBuffer mmap(File file)
	{
		long l;
		Exception exception;
		Object obj;
		try
		{
			obj = ((Object) (new FileInputStream(file)));
	//    0    0:new             #147 <Class FileInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #184 <Method void FileInputStream(File)>
	//    4    8:astore          4
		}
	//*   5   10:aload           4
	//*   6   12:invokevirtual   #158 <Method FileChannel FileInputStream.getChannel()>
	//*   7   15:astore_0        
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #164 <Method long FileChannel.size()>
	//*  10   20:lstore_1        
	//*  11   21:aload_0         
	//*  12   22:getstatic       #170 <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_ONLY>
	//*  13   25:lconst_0        
	//*  14   26:lload_1         
	//*  15   27:invokevirtual   #174 <Method java.nio.MappedByteBuffer FileChannel.map(java.nio.channels.FileChannel$MapMode, long, long)>
	//*  16   30:astore_0        
	//*  17   31:aload           4
	//*  18   33:ifnull          41
	//*  19   36:aload           4
	//*  20   38:invokevirtual   #175 <Method void FileInputStream.close()>
	//*  21   41:aload_0         
	//*  22   42:areturn         
	//*  23   43:astore_3        
	//*  24   44:aconst_null     
	//*  25   45:astore_0        
	//*  26   46:goto            53
	//*  27   49:astore_0        
	//*  28   50:aload_0         
	//*  29   51:athrow          
	//*  30   52:astore_3        
	//*  31   53:aload           4
	//*  32   55:ifnull          86
	//*  33   58:aload_0         
	//*  34   59:ifnull          81
	//*  35   62:aload           4
	//*  36   64:invokevirtual   #175 <Method void FileInputStream.close()>
	//*  37   67:goto            86
	//*  38   70:astore          4
	//*  39   72:aload_0         
	//*  40   73:aload           4
	//*  41   75:invokestatic    #181 <Method void ThrowableExtension.addSuppressed(Throwable, Throwable)>
	//*  42   78:goto            86
	//*  43   81:aload           4
	//*  44   83:invokevirtual   #175 <Method void FileInputStream.close()>
	//*  45   86:aload_3         
	//*  46   87:athrow          
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  47   88:astore_0        
		{
			return null;
	//   48   89:aconst_null     
	//   49   90:areturn         
		}
		file = ((File) (((FileInputStream) (obj)).getChannel()));
		l = ((FileChannel) (file)).size();
		file = ((File) (((FileChannel) (file)).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, l)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_41;
		((FileInputStream) (obj)).close();
		return ((ByteBuffer) (file));
		exception;
		file = null;
		break MISSING_BLOCK_LABEL_53;
		file;
		throw file;
		exception;
		if(obj == null)
			break MISSING_BLOCK_LABEL_86;
		if(file == null)
			break MISSING_BLOCK_LABEL_81;
		((FileInputStream) (obj)).close();
		break MISSING_BLOCK_LABEL_86;
		obj;
		ThrowableExtension.addSuppressed(((Throwable) (file)), ((Throwable) (obj)));
		break MISSING_BLOCK_LABEL_86;
		((FileInputStream) (obj)).close();
		throw exception;
	}

	private static final String CACHE_FILE_PREFIX = ".font";
	private static final String TAG = "TypefaceCompatUtil";
}
