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
	//    1    1:invokestatic    #37  <Method File getTempFile(Context)>
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
	//   10   14:invokestatic    #41  <Method boolean copyToFile(File, Resources, int)>
	//   11   17:istore_3        
		if(!flag)
	//*  12   18:iload_3         
	//*  13   19:ifne            29
		{
			((File) (context)).delete();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #47  <Method boolean File.delete()>
	//   16   26:pop             
			return null;
	//   17   27:aconst_null     
	//   18   28:areturn         
		}
		resources = ((Resources) (mmap(((File) (context)))));
	//   19   29:aload_0         
	//   20   30:invokestatic    #51  <Method ByteBuffer mmap(File)>
	//   21   33:astore_1        
		((File) (context)).delete();
	//   22   34:aload_0         
	//   23   35:invokevirtual   #47  <Method boolean File.delete()>
	//   24   38:pop             
		return ((ByteBuffer) (resources));
	//   25   39:aload_1         
	//   26   40:areturn         
		resources;
	//   27   41:astore_1        
		((File) (context)).delete();
	//   28   42:aload_0         
	//   29   43:invokevirtual   #47  <Method boolean File.delete()>
	//   30   46:pop             
		throw resources;
	//   31   47:aload_1         
	//   32   48:athrow          
	}

	public static boolean copyToFile(File file, Resources resources, int i)
	{
		Resources resources1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		resources = ((Resources) (resources.openRawResource(i)));
	//    2    3:aload_1         
	//    3    4:iload_2         
	//    4    5:invokevirtual   #58  <Method InputStream Resources.openRawResource(int)>
	//    5    8:astore_1        
		resources1 = resources;
	//    6    9:aload_1         
	//    7   10:astore          4
		boolean flag = copyToFile(file, ((InputStream) (resources)));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokestatic    #61  <Method boolean copyToFile(File, InputStream)>
	//   11   17:istore_3        
		closeQuietly(((Closeable) (resources)));
	//   12   18:aload_1         
	//   13   19:invokestatic    #63  <Method void closeQuietly(Closeable)>
		return flag;
	//   14   22:iload_3         
	//   15   23:ireturn         
		file;
	//   16   24:astore_0        
		closeQuietly(((Closeable) (resources1)));
	//   17   25:aload           4
	//   18   27:invokestatic    #63  <Method void closeQuietly(Closeable)>
		throw file;
	//   19   30:aload_0         
	//   20   31:athrow          
	}

	public static boolean copyToFile(File file, InputStream inputstream)
	{
		Object obj;
		Object obj1;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj1 = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		file = ((File) (new FileOutputStream(file, false)));
	//    4    5:new             #65  <Class FileOutputStream>
	//    5    8:dup             
	//    6    9:aload_0         
	//    7   10:iconst_0        
	//    8   11:invokespecial   #68  <Method void FileOutputStream(File, boolean)>
	//    9   14:astore_0        
		obj = ((Object) (new byte[1024]));
	//   10   15:sipush          1024
	//   11   18:newarray        byte[]
	//   12   20:astore_3        
_L3:
		int i = inputstream.read(((byte []) (obj)));
	//   13   21:aload_1         
	//   14   22:aload_3         
	//   15   23:invokevirtual   #74  <Method int InputStream.read(byte[])>
	//   16   26:istore_2        
		if(i == -1) goto _L2; else goto _L1
	//   17   27:iload_2         
	//   18   28:iconst_m1       
	//   19   29:icmpeq          79
_L1:
		((FileOutputStream) (file)).write(((byte []) (obj)), 0, i);
	//   20   32:aload_0         
	//   21   33:aload_3         
	//   22   34:iconst_0        
	//   23   35:iload_2         
	//   24   36:invokevirtual   #78  <Method void FileOutputStream.write(byte[], int, int)>
		  goto _L3
	//*  25   39:goto            21
		inputstream;
	//   26   42:astore_1        
_L7:
		obj = ((Object) (file));
	//   27   43:aload_0         
	//   28   44:astore_3        
		Log.e("TypefaceCompatUtil", (new StringBuilder()).append("Error copying resource contents to temp file: ").append(((IOException) (inputstream)).getMessage()).toString());
	//   29   45:ldc1            #15  <String "TypefaceCompatUtil">
	//   30   47:new             #80  <Class StringBuilder>
	//   31   50:dup             
	//   32   51:invokespecial   #81  <Method void StringBuilder()>
	//   33   54:ldc1            #83  <String "Error copying resource contents to temp file: ">
	//   34   56:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   35   59:aload_1         
	//   36   60:invokevirtual   #91  <Method String IOException.getMessage()>
	//   37   63:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   38   66:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   39   69:invokestatic    #100 <Method int Log.e(String, String)>
	//   40   72:pop             
		closeQuietly(((Closeable) (file)));
	//   41   73:aload_0         
	//   42   74:invokestatic    #63  <Method void closeQuietly(Closeable)>
		return false;
	//   43   77:iconst_0        
	//   44   78:ireturn         
_L2:
		closeQuietly(((Closeable) (file)));
	//   45   79:aload_0         
	//   46   80:invokestatic    #63  <Method void closeQuietly(Closeable)>
		return true;
	//   47   83:iconst_1        
	//   48   84:ireturn         
		file;
	//   49   85:astore_0        
_L5:
		closeQuietly(((Closeable) (obj)));
	//   50   86:aload_3         
	//   51   87:invokestatic    #63  <Method void closeQuietly(Closeable)>
		throw file;
	//   52   90:aload_0         
	//   53   91:athrow          
		inputstream;
	//   54   92:astore_1        
		obj = ((Object) (file));
	//   55   93:aload_0         
	//   56   94:astore_3        
		file = ((File) (inputstream));
	//   57   95:aload_1         
	//   58   96:astore_0        
		if(true) goto _L5; else goto _L4
	//   59   97:goto            86
_L4:
		inputstream;
	//   60  100:astore_1        
		file = ((File) (obj1));
	//   61  101:aload           4
	//   62  103:astore_0        
		if(true) goto _L7; else goto _L6
	//   63  104:goto            43
_L6:
	}

	public static File getTempFile(Context context)
	{
		int i;
		String s;
		s = (new StringBuilder()).append(".font").append(Process.myPid()).append("-").append(Process.myTid()).append("-").toString();
	//    0    0:new             #80  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void StringBuilder()>
	//    3    7:ldc1            #12  <String ".font">
	//    4    9:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:invokestatic    #106 <Method int Process.myPid()>
	//    6   15:invokevirtual   #109 <Method StringBuilder StringBuilder.append(int)>
	//    7   18:ldc1            #111 <String "-">
	//    8   20:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    9   23:invokestatic    #114 <Method int Process.myTid()>
	//   10   26:invokevirtual   #109 <Method StringBuilder StringBuilder.append(int)>
	//   11   29:ldc1            #111 <String "-">
	//   12   31:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   13   34:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   14   37:astore_3        
		i = 0;
	//   15   38:iconst_0        
	//   16   39:istore_1        
_L3:
		if(i >= 100) goto _L2; else goto _L1
	//   17   40:iload_1         
	//   18   41:bipush          100
	//   19   43:icmpge          99
_L1:
		File file = new File(context.getCacheDir(), (new StringBuilder()).append(s).append(i).toString());
	//   20   46:new             #43  <Class File>
	//   21   49:dup             
	//   22   50:aload_0         
	//   23   51:invokevirtual   #120 <Method File Context.getCacheDir()>
	//   24   54:new             #80  <Class StringBuilder>
	//   25   57:dup             
	//   26   58:invokespecial   #81  <Method void StringBuilder()>
	//   27   61:aload_3         
	//   28   62:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   29   65:iload_1         
	//   30   66:invokevirtual   #109 <Method StringBuilder StringBuilder.append(int)>
	//   31   69:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   32   72:invokespecial   #123 <Method void File(File, String)>
	//   33   75:astore          4
		boolean flag = file.createNewFile();
	//   34   77:aload           4
	//   35   79:invokevirtual   #126 <Method boolean File.createNewFile()>
	//   36   82:istore_2        
		if(flag)
	//*  37   83:iload_2         
	//*  38   84:ifeq            92
			return file;
	//   39   87:aload           4
	//   40   89:areturn         
		continue; /* Loop/switch isn't completed */
		IOException ioexception;
		ioexception;
	//   41   90:astore          4
		i++;
	//   42   92:iload_1         
	//   43   93:iconst_1        
	//   44   94:iadd            
	//   45   95:istore_1        
		  goto _L3
	//*  46   96:goto            40
_L2:
		return null;
	//   47   99:aconst_null     
	//   48  100:areturn         
	}

	public static ByteBuffer mmap(Context context, CancellationSignal cancellationsignal, Uri uri)
	{
		Object obj;
		context = ((Context) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #133 <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		long l;
		try
		{
			uri = ((Uri) (((ContentResolver) (context)).openFileDescriptor(uri, "r", cancellationsignal)));
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:ldc1            #135 <String "r">
	//    6    9:aload_1         
	//    7   10:invokevirtual   #141 <Method ParcelFileDescriptor ContentResolver.openFileDescriptor(Uri, String, CancellationSignal)>
	//    8   13:astore_2        
		}
	//*   9   14:new             #143 <Class FileInputStream>
	//*  10   17:dup             
	//*  11   18:aload_2         
	//*  12   19:invokevirtual   #149 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//*  13   22:invokespecial   #152 <Method void FileInputStream(java.io.FileDescriptor)>
	//*  14   25:astore          5
	//*  15   27:aload           5
	//*  16   29:invokevirtual   #156 <Method FileChannel FileInputStream.getChannel()>
	//*  17   32:astore_0        
	//*  18   33:aload_0         
	//*  19   34:invokevirtual   #162 <Method long FileChannel.size()>
	//*  20   37:lstore_3        
	//*  21   38:aload_0         
	//*  22   39:getstatic       #168 <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_ONLY>
	//*  23   42:lconst_0        
	//*  24   43:lload_3         
	//*  25   44:invokevirtual   #172 <Method java.nio.MappedByteBuffer FileChannel.map(java.nio.channels.FileChannel$MapMode, long, long)>
	//*  26   47:astore_0        
	//*  27   48:aload           5
	//*  28   50:ifnull          62
	//*  29   53:iconst_0        
	//*  30   54:ifeq            106
	//*  31   57:aload           5
	//*  32   59:invokevirtual   #173 <Method void FileInputStream.close()>
	//*  33   62:aload_2         
	//*  34   63:ifnull          74
	//*  35   66:iconst_0        
	//*  36   67:ifeq            129
	//*  37   70:aload_2         
	//*  38   71:invokevirtual   #174 <Method void ParcelFileDescriptor.close()>
	//*  39   74:aload_0         
	//*  40   75:areturn         
	//*  41   76:astore_0        
	//*  42   77:new             #176 <Class NullPointerException>
	//*  43   80:dup             
	//*  44   81:invokespecial   #177 <Method void NullPointerException()>
	//*  45   84:athrow          
	//*  46   85:astore_1        
	//*  47   86:aload_1         
	//*  48   87:athrow          
	//*  49   88:astore_0        
	//*  50   89:aload_2         
	//*  51   90:ifnull          101
	//*  52   93:aload_1         
	//*  53   94:ifnull          183
	//*  54   97:aload_2         
	//*  55   98:invokevirtual   #174 <Method void ParcelFileDescriptor.close()>
	//*  56  101:aload_0         
	//*  57  102:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  58  103:astore_0        
		{
			return null;
	//   59  104:aconst_null     
	//   60  105:areturn         
		}
		obj = ((Object) (new FileInputStream(((ParcelFileDescriptor) (uri)).getFileDescriptor())));
		context = ((Context) (((FileInputStream) (obj)).getChannel()));
		l = ((FileChannel) (context)).size();
		context = ((Context) (((FileChannel) (context)).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, l)));
		if(obj == null) goto _L2; else goto _L1
_L1:
		if(true) goto _L4; else goto _L3
_L3:
		((FileInputStream) (obj)).close();
_L2:
		if(uri == null) goto _L6; else goto _L5
_L5:
		if(true) goto _L8; else goto _L7
_L7:
		((ParcelFileDescriptor) (uri)).close();
_L6:
		return ((ByteBuffer) (context));
		context;
		try
		{
			throw new NullPointerException();
		}
		// Misplaced declaration of an exception variable
		catch(CancellationSignal cancellationsignal) { }
		throw cancellationsignal;
		context;
_L13:
		if(uri == null) goto _L10; else goto _L9
_L9:
		if(cancellationsignal == null) goto _L12; else goto _L11
_L11:
		((ParcelFileDescriptor) (uri)).close();
_L10:
		throw context;
_L4:
		((FileInputStream) (obj)).close();
	//   61  106:aload           5
	//   62  108:invokevirtual   #173 <Method void FileInputStream.close()>
		  goto _L2
	//*  63  111:goto            62
		context;
	//   64  114:astore_0        
		cancellationsignal = null;
	//   65  115:aconst_null     
	//   66  116:astore_1        
		  goto _L13
	//*  67  117:goto            89
		context;
	//   68  120:astore_0        
		throw new NullPointerException();
	//   69  121:new             #176 <Class NullPointerException>
	//   70  124:dup             
	//   71  125:invokespecial   #177 <Method void NullPointerException()>
	//   72  128:athrow          
_L8:
		((ParcelFileDescriptor) (uri)).close();
	//   73  129:aload_2         
	//   74  130:invokevirtual   #174 <Method void ParcelFileDescriptor.close()>
		return ((ByteBuffer) (context));
	//   75  133:aload_0         
	//   76  134:areturn         
		context;
	//   77  135:astore_0        
		throw context;
	//   78  136:aload_0         
	//   79  137:athrow          
		cancellationsignal;
	//   80  138:astore_1        
_L19:
		if(obj == null) goto _L15; else goto _L14
	//   81  139:aload           5
	//   82  141:ifnull          153
_L14:
		if(context == null) goto _L17; else goto _L16
	//   83  144:aload_0         
	//   84  145:ifnull          166
_L16:
		((FileInputStream) (obj)).close();
	//   85  148:aload           5
	//   86  150:invokevirtual   #173 <Method void FileInputStream.close()>
_L15:
		throw cancellationsignal;
	//   87  153:aload_1         
	//   88  154:athrow          
		obj;
	//   89  155:astore          5
		((Throwable) (context)).addSuppressed(((Throwable) (obj)));
	//   90  157:aload_0         
	//   91  158:aload           5
	//   92  160:invokevirtual   #181 <Method void Throwable.addSuppressed(Throwable)>
		continue; /* Loop/switch isn't completed */
	//   93  163:goto            153
_L17:
		((FileInputStream) (obj)).close();
	//   94  166:aload           5
	//   95  168:invokevirtual   #173 <Method void FileInputStream.close()>
		if(true) goto _L15; else goto _L18
	//   96  171:goto            153
_L18:
		uri;
	//   97  174:astore_2        
		((Throwable) (cancellationsignal)).addSuppressed(((Throwable) (uri)));
	//   98  175:aload_1         
	//   99  176:aload_2         
	//  100  177:invokevirtual   #181 <Method void Throwable.addSuppressed(Throwable)>
		  goto _L10
	//* 101  180:goto            101
_L12:
		((ParcelFileDescriptor) (uri)).close();
	//  102  183:aload_2         
	//  103  184:invokevirtual   #174 <Method void ParcelFileDescriptor.close()>
		  goto _L10
	//* 104  187:goto            101
		cancellationsignal;
	//  105  190:astore_1        
		context = null;
	//  106  191:aconst_null     
	//  107  192:astore_0        
		  goto _L19
	//* 108  193:goto            139
	}

	private static ByteBuffer mmap(File file)
	{
		long l;
		Exception exception;
		Object obj;
		try
		{
			obj = ((Object) (new FileInputStream(file)));
	//    0    0:new             #143 <Class FileInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #184 <Method void FileInputStream(File)>
	//    4    8:astore          4
		}
	//*   5   10:aload           4
	//*   6   12:invokevirtual   #156 <Method FileChannel FileInputStream.getChannel()>
	//*   7   15:astore_0        
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #162 <Method long FileChannel.size()>
	//*  10   20:lstore_1        
	//*  11   21:aload_0         
	//*  12   22:getstatic       #168 <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_ONLY>
	//*  13   25:lconst_0        
	//*  14   26:lload_1         
	//*  15   27:invokevirtual   #172 <Method java.nio.MappedByteBuffer FileChannel.map(java.nio.channels.FileChannel$MapMode, long, long)>
	//*  16   30:astore_0        
	//*  17   31:aload           4
	//*  18   33:ifnull          45
	//*  19   36:iconst_0        
	//*  20   37:ifeq            56
	//*  21   40:aload           4
	//*  22   42:invokevirtual   #173 <Method void FileInputStream.close()>
	//*  23   45:aload_0         
	//*  24   46:areturn         
	//*  25   47:astore_0        
	//*  26   48:new             #176 <Class NullPointerException>
	//*  27   51:dup             
	//*  28   52:invokespecial   #177 <Method void NullPointerException()>
	//*  29   55:athrow          
	//*  30   56:aload           4
	//*  31   58:invokevirtual   #173 <Method void FileInputStream.close()>
	//*  32   61:aload_0         
	//*  33   62:areturn         
	//*  34   63:astore_0        
	//*  35   64:aload_0         
	//*  36   65:athrow          
	//*  37   66:astore_3        
	//*  38   67:aload           4
	//*  39   69:ifnull          81
	//*  40   72:aload_0         
	//*  41   73:ifnull          94
	//*  42   76:aload           4
	//*  43   78:invokevirtual   #173 <Method void FileInputStream.close()>
	//*  44   81:aload_3         
	//*  45   82:athrow          
	//*  46   83:astore          4
	//*  47   85:aload_0         
	//*  48   86:aload           4
	//*  49   88:invokevirtual   #181 <Method void Throwable.addSuppressed(Throwable)>
	//*  50   91:goto            81
	//*  51   94:aload           4
	//*  52   96:invokevirtual   #173 <Method void FileInputStream.close()>
	//*  53   99:goto            81
	//*  54  102:astore_3        
	//*  55  103:aconst_null     
	//*  56  104:astore_0        
	//*  57  105:goto            67
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  58  108:astore_0        
		{
			return null;
	//   59  109:aconst_null     
	//   60  110:areturn         
		}
		file = ((File) (((FileInputStream) (obj)).getChannel()));
		l = ((FileChannel) (file)).size();
		file = ((File) (((FileChannel) (file)).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, l)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_45;
		if(true)
			break MISSING_BLOCK_LABEL_56;
		((FileInputStream) (obj)).close();
		return ((ByteBuffer) (file));
		file;
		throw new NullPointerException();
		((FileInputStream) (obj)).close();
		return ((ByteBuffer) (file));
		file;
		throw file;
		exception;
_L3:
		if(obj == null)
			break MISSING_BLOCK_LABEL_81;
		if(file == null)
			break MISSING_BLOCK_LABEL_94;
		((FileInputStream) (obj)).close();
_L1:
		throw exception;
		obj;
		((Throwable) (file)).addSuppressed(((Throwable) (obj)));
		  goto _L1
		((FileInputStream) (obj)).close();
		  goto _L1
		exception;
		file = null;
		if(true) goto _L3; else goto _L2
_L2:
	}

	private static final String CACHE_FILE_PREFIX = ".font";
	private static final String TAG = "TypefaceCompatUtil";
}
