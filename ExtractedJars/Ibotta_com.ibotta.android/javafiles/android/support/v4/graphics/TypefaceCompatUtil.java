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
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TypefaceCompatUtil
{

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #18  <Method void Closeable.close()>
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
	//    1    1:invokestatic    #28  <Method File getTempFile(Context)>
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
	//   10   14:invokestatic    #32  <Method boolean copyToFile(File, Resources, int)>
	//   11   17:istore_3        
		if(!flag)
	//*  12   18:iload_3         
	//*  13   19:ifne            29
		{
			((File) (context)).delete();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #38  <Method boolean File.delete()>
	//   16   26:pop             
			return null;
	//   17   27:aconst_null     
	//   18   28:areturn         
		}
		resources = ((Resources) (mmap(((File) (context)))));
	//   19   29:aload_0         
	//   20   30:invokestatic    #42  <Method ByteBuffer mmap(File)>
	//   21   33:astore_1        
		((File) (context)).delete();
	//   22   34:aload_0         
	//   23   35:invokevirtual   #38  <Method boolean File.delete()>
	//   24   38:pop             
		return ((ByteBuffer) (resources));
	//   25   39:aload_1         
	//   26   40:areturn         
		resources;
	//   27   41:astore_1        
		((File) (context)).delete();
	//   28   42:aload_0         
	//   29   43:invokevirtual   #38  <Method boolean File.delete()>
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
	//    2    2:invokevirtual   #49  <Method InputStream Resources.openRawResource(int)>
	//    3    5:astore_1        
		boolean flag = copyToFile(file, ((InputStream) (resources)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokestatic    #52  <Method boolean copyToFile(File, InputStream)>
	//    7   11:istore_3        
		closeQuietly(((Closeable) (resources)));
	//    8   12:aload_1         
	//    9   13:invokestatic    #54  <Method void closeQuietly(Closeable)>
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
	//   18   26:invokestatic    #54  <Method void closeQuietly(Closeable)>
		throw file;
	//   19   29:aload_0         
	//   20   30:athrow          
	}

	public static boolean copyToFile(File file, InputStream inputstream)
	{
		Object obj;
		StringBuilder stringbuilder;
		android.os.StrictMode.ThreadPolicy threadpolicy;
		threadpolicy = StrictMode.allowThreadDiskWrites();
	//    0    0:invokestatic    #60  <Method android.os.StrictMode$ThreadPolicy StrictMode.allowThreadDiskWrites()>
	//    1    3:astore          5
		stringbuilder = null;
	//    2    5:aconst_null     
	//    3    6:astore          4
		obj = null;
	//    4    8:aconst_null     
	//    5    9:astore_3        
		file = ((File) (new FileOutputStream(file, false)));
	//    6   10:new             #62  <Class FileOutputStream>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:invokespecial   #66  <Method void FileOutputStream(File, boolean)>
	//   11   19:astore_0        
		obj = ((Object) (new byte[1024]));
	//   12   20:sipush          1024
	//   13   23:newarray        byte[]
	//   14   25:astore_3        
_L1:
		int i = inputstream.read(((byte []) (obj)));
	//   15   26:aload_1         
	//   16   27:aload_3         
	//   17   28:invokevirtual   #72  <Method int InputStream.read(byte[])>
	//   18   31:istore_2        
		if(i == -1)
			break MISSING_BLOCK_LABEL_47;
	//   19   32:iload_2         
	//   20   33:iconst_m1       
	//   21   34:icmpeq          47
		try
		{
			((FileOutputStream) (file)).write(((byte []) (obj)), 0, i);
	//   22   37:aload_0         
	//   23   38:aload_3         
	//   24   39:iconst_0        
	//   25   40:iload_2         
	//   26   41:invokevirtual   #76  <Method void FileOutputStream.write(byte[], int, int)>
		}
	//*  27   44:goto            26
	//*  28   47:aload_0         
	//*  29   48:invokestatic    #54  <Method void closeQuietly(Closeable)>
	//*  30   51:aload           5
	//*  31   53:invokestatic    #80  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
	//*  32   56:iconst_1        
	//*  33   57:ireturn         
	//*  34   58:astore_1        
	//*  35   59:aload_0         
	//*  36   60:astore_3        
	//*  37   61:aload_1         
	//*  38   62:astore_0        
	//*  39   63:goto            135
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  40   66:astore_1        
		{
			break MISSING_BLOCK_LABEL_78;
	//   41   67:goto            78
		}
		  goto _L1
		closeQuietly(((Closeable) (file)));
		StrictMode.setThreadPolicy(threadpolicy);
		return true;
		inputstream;
		obj = ((Object) (file));
		file = ((File) (inputstream));
		break MISSING_BLOCK_LABEL_135;
		file;
	//   42   70:astore_0        
		break MISSING_BLOCK_LABEL_135;
	//   43   71:goto            135
		inputstream;
	//   44   74:astore_1        
		file = ((File) (stringbuilder));
	//   45   75:aload           4
	//   46   77:astore_0        
		obj = ((Object) (file));
	//   47   78:aload_0         
	//   48   79:astore_3        
		stringbuilder = new StringBuilder();
	//   49   80:new             #82  <Class StringBuilder>
	//   50   83:dup             
	//   51   84:invokespecial   #84  <Method void StringBuilder()>
	//   52   87:astore          4
		obj = ((Object) (file));
	//   53   89:aload_0         
	//   54   90:astore_3        
		stringbuilder.append("Error copying resource contents to temp file: ");
	//   55   91:aload           4
	//   56   93:ldc1            #86  <String "Error copying resource contents to temp file: ">
	//   57   95:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   58   98:pop             
		obj = ((Object) (file));
	//   59   99:aload_0         
	//   60  100:astore_3        
		stringbuilder.append(((IOException) (inputstream)).getMessage());
	//   61  101:aload           4
	//   62  103:aload_1         
	//   63  104:invokevirtual   #94  <Method String IOException.getMessage()>
	//   64  107:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   65  110:pop             
		obj = ((Object) (file));
	//   66  111:aload_0         
	//   67  112:astore_3        
		Log.e("TypefaceCompatUtil", stringbuilder.toString());
	//   68  113:ldc1            #96  <String "TypefaceCompatUtil">
	//   69  115:aload           4
	//   70  117:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   71  120:invokestatic    #105 <Method int Log.e(String, String)>
	//   72  123:pop             
		closeQuietly(((Closeable) (file)));
	//   73  124:aload_0         
	//   74  125:invokestatic    #54  <Method void closeQuietly(Closeable)>
		StrictMode.setThreadPolicy(threadpolicy);
	//   75  128:aload           5
	//   76  130:invokestatic    #80  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return false;
	//   77  133:iconst_0        
	//   78  134:ireturn         
		closeQuietly(((Closeable) (obj)));
	//   79  135:aload_3         
	//   80  136:invokestatic    #54  <Method void closeQuietly(Closeable)>
		StrictMode.setThreadPolicy(threadpolicy);
	//   81  139:aload           5
	//   82  141:invokestatic    #80  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw file;
	//   83  144:aload_0         
	//   84  145:athrow          
	}

	public static File getTempFile(Context context)
	{
		int i;
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #84  <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (obj)).append(".font");
	//    4    8:aload_3         
	//    5    9:ldc1            #107 <String ".font">
	//    6   11:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(Process.myPid());
	//    8   15:aload_3         
	//    9   16:invokestatic    #113 <Method int Process.myPid()>
	//   10   19:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
	//   11   22:pop             
		((StringBuilder) (obj)).append("-");
	//   12   23:aload_3         
	//   13   24:ldc1            #118 <String "-">
	//   14   26:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		((StringBuilder) (obj)).append(Process.myTid());
	//   16   30:aload_3         
	//   17   31:invokestatic    #121 <Method int Process.myTid()>
	//   18   34:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
	//   19   37:pop             
		((StringBuilder) (obj)).append("-");
	//   20   38:aload_3         
	//   21   39:ldc1            #118 <String "-">
	//   22   41:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   24   45:aload_3         
	//   25   46:invokevirtual   #99  <Method String StringBuilder.toString()>
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
	//   33   59:invokevirtual   #127 <Method File Context.getCacheDir()>
	//   34   62:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   35   64:new             #82  <Class StringBuilder>
	//   36   67:dup             
	//   37   68:invokespecial   #84  <Method void StringBuilder()>
	//   38   71:astore          5
		stringbuilder.append(((String) (obj)));
	//   39   73:aload           5
	//   40   75:aload_3         
	//   41   76:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   42   79:pop             
		stringbuilder.append(i);
	//   43   80:aload           5
	//   44   82:iload_1         
	//   45   83:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
	//   46   86:pop             
		file = new File(file, stringbuilder.toString());
	//   47   87:new             #34  <Class File>
	//   48   90:dup             
	//   49   91:aload           4
	//   50   93:aload           5
	//   51   95:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   52   98:invokespecial   #130 <Method void File(File, String)>
	//   53  101:astore          4
		boolean flag = file.createNewFile();
	//   54  103:aload           4
	//   55  105:invokevirtual   #133 <Method boolean File.createNewFile()>
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
	//    1    1:invokevirtual   #140 <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		long l;
		Object obj;
		try
		{
			uri = ((Uri) (((ContentResolver) (context)).openFileDescriptor(uri, "r", cancellationsignal)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:ldc1            #142 <String "r">
	//    6    9:aload_1         
	//    7   10:invokevirtual   #148 <Method ParcelFileDescriptor ContentResolver.openFileDescriptor(Uri, String, CancellationSignal)>
	//    8   13:astore_2        
		}
	//*   9   14:aload_2         
	//*  10   15:ifnonnull       28
	//*  11   18:aload_2         
	//*  12   19:ifnull          26
	//*  13   22:aload_2         
	//*  14   23:invokevirtual   #151 <Method void ParcelFileDescriptor.close()>
	//*  15   26:aconst_null     
	//*  16   27:areturn         
	//*  17   28:new             #153 <Class FileInputStream>
	//*  18   31:dup             
	//*  19   32:aload_2         
	//*  20   33:invokevirtual   #157 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//*  21   36:invokespecial   #160 <Method void FileInputStream(java.io.FileDescriptor)>
	//*  22   39:astore          5
	//*  23   41:aload           5
	//*  24   43:invokevirtual   #164 <Method FileChannel FileInputStream.getChannel()>
	//*  25   46:astore_0        
	//*  26   47:aload_0         
	//*  27   48:invokevirtual   #170 <Method long FileChannel.size()>
	//*  28   51:lstore_3        
	//*  29   52:aload_0         
	//*  30   53:getstatic       #176 <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_ONLY>
	//*  31   56:lconst_0        
	//*  32   57:lload_3         
	//*  33   58:invokevirtual   #180 <Method java.nio.MappedByteBuffer FileChannel.map(java.nio.channels.FileChannel$MapMode, long, long)>
	//*  34   61:astore_0        
	//*  35   62:aload           5
	//*  36   64:invokevirtual   #181 <Method void FileInputStream.close()>
	//*  37   67:aload_2         
	//*  38   68:ifnull          75
	//*  39   71:aload_2         
	//*  40   72:invokevirtual   #151 <Method void ParcelFileDescriptor.close()>
	//*  41   75:aload_0         
	//*  42   76:areturn         
	//*  43   77:astore_1        
	//*  44   78:aconst_null     
	//*  45   79:astore_0        
	//*  46   80:goto            87
	//*  47   83:astore_0        
	//*  48   84:aload_0         
	//*  49   85:athrow          
	//*  50   86:astore_1        
	//*  51   87:aload_0         
	//*  52   88:ifnull          110
	//*  53   91:aload           5
	//*  54   93:invokevirtual   #181 <Method void FileInputStream.close()>
	//*  55   96:goto            115
	//*  56   99:astore          5
	//*  57  101:aload_0         
	//*  58  102:aload           5
	//*  59  104:invokevirtual   #185 <Method void Throwable.addSuppressed(Throwable)>
	//*  60  107:goto            115
	//*  61  110:aload           5
	//*  62  112:invokevirtual   #181 <Method void FileInputStream.close()>
	//*  63  115:aload_1         
	//*  64  116:athrow          
	//*  65  117:astore_0        
	//*  66  118:aconst_null     
	//*  67  119:astore_1        
	//*  68  120:goto            127
	//*  69  123:astore_1        
	//*  70  124:aload_1         
	//*  71  125:athrow          
	//*  72  126:astore_0        
	//*  73  127:aload_2         
	//*  74  128:ifnull          155
	//*  75  131:aload_1         
	//*  76  132:ifnull          151
	//*  77  135:aload_2         
	//*  78  136:invokevirtual   #151 <Method void ParcelFileDescriptor.close()>
	//*  79  139:goto            155
	//*  80  142:astore_2        
	//*  81  143:aload_1         
	//*  82  144:aload_2         
	//*  83  145:invokevirtual   #185 <Method void Throwable.addSuppressed(Throwable)>
	//*  84  148:goto            155
	//*  85  151:aload_2         
	//*  86  152:invokevirtual   #151 <Method void ParcelFileDescriptor.close()>
	//*  87  155:aload_0         
	//*  88  156:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  89  157:astore_0        
		{
			return null;
	//   90  158:aconst_null     
	//   91  159:areturn         
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
		((FileInputStream) (obj)).close();
		if(uri == null)
			break MISSING_BLOCK_LABEL_75;
		((ParcelFileDescriptor) (uri)).close();
		return ((ByteBuffer) (context));
		cancellationsignal;
		context = null;
		break MISSING_BLOCK_LABEL_87;
		context;
		throw context;
		cancellationsignal;
		if(context == null) goto _L2; else goto _L1
_L1:
		try
		{
			((FileInputStream) (obj)).close();
			break MISSING_BLOCK_LABEL_115;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		try
		{
			((Throwable) (context)).addSuppressed(((Throwable) (obj)));
			break MISSING_BLOCK_LABEL_115;
		}
		// Misplaced declaration of an exception variable
		catch(CancellationSignal cancellationsignal) { }
		  goto _L3
_L2:
		((FileInputStream) (obj)).close();
		throw cancellationsignal;
		context;
		cancellationsignal = null;
		break MISSING_BLOCK_LABEL_127;
_L3:
		throw cancellationsignal;
		context;
		if(uri == null)
			break MISSING_BLOCK_LABEL_155;
		if(cancellationsignal == null)
			break MISSING_BLOCK_LABEL_151;
		((ParcelFileDescriptor) (uri)).close();
		break MISSING_BLOCK_LABEL_155;
		uri;
		((Throwable) (cancellationsignal)).addSuppressed(((Throwable) (uri)));
		break MISSING_BLOCK_LABEL_155;
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
	//    0    0:new             #153 <Class FileInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #188 <Method void FileInputStream(File)>
	//    4    8:astore          4
		}
	//*   5   10:aload           4
	//*   6   12:invokevirtual   #164 <Method FileChannel FileInputStream.getChannel()>
	//*   7   15:astore_0        
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #170 <Method long FileChannel.size()>
	//*  10   20:lstore_1        
	//*  11   21:aload_0         
	//*  12   22:getstatic       #176 <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_ONLY>
	//*  13   25:lconst_0        
	//*  14   26:lload_1         
	//*  15   27:invokevirtual   #180 <Method java.nio.MappedByteBuffer FileChannel.map(java.nio.channels.FileChannel$MapMode, long, long)>
	//*  16   30:astore_0        
	//*  17   31:aload           4
	//*  18   33:invokevirtual   #181 <Method void FileInputStream.close()>
	//*  19   36:aload_0         
	//*  20   37:areturn         
	//*  21   38:astore_3        
	//*  22   39:aconst_null     
	//*  23   40:astore_0        
	//*  24   41:goto            48
	//*  25   44:astore_0        
	//*  26   45:aload_0         
	//*  27   46:athrow          
	//*  28   47:astore_3        
	//*  29   48:aload_0         
	//*  30   49:ifnull          71
	//*  31   52:aload           4
	//*  32   54:invokevirtual   #181 <Method void FileInputStream.close()>
	//*  33   57:goto            76
	//*  34   60:astore          4
	//*  35   62:aload_0         
	//*  36   63:aload           4
	//*  37   65:invokevirtual   #185 <Method void Throwable.addSuppressed(Throwable)>
	//*  38   68:goto            76
	//*  39   71:aload           4
	//*  40   73:invokevirtual   #181 <Method void FileInputStream.close()>
	//*  41   76:aload_3         
	//*  42   77:athrow          
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  43   78:astore_0        
		{
			return null;
	//   44   79:aconst_null     
	//   45   80:areturn         
		}
		file = ((File) (((FileInputStream) (obj)).getChannel()));
		l = ((FileChannel) (file)).size();
		file = ((File) (((FileChannel) (file)).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, l)));
		((FileInputStream) (obj)).close();
		return ((ByteBuffer) (file));
		exception;
		file = null;
		break MISSING_BLOCK_LABEL_48;
		file;
		throw file;
		exception;
		if(file == null)
			break MISSING_BLOCK_LABEL_71;
		((FileInputStream) (obj)).close();
		break MISSING_BLOCK_LABEL_76;
		obj;
		((Throwable) (file)).addSuppressed(((Throwable) (obj)));
		break MISSING_BLOCK_LABEL_76;
		((FileInputStream) (obj)).close();
		throw exception;
	}
}
