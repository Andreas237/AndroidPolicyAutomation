// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.tools;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class GLFileUtil
{

	public GLFileUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			try
			{
				closeable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #18  <Method void Closeable.close()>
				return;
	//    4   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(Closeable closeable) { }
	//    5   11:astore_0        
	//    6   12:return          
	}

	public static void copy(Context context, String s, File file)
		throws Exception
	{
		file.delete();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #26  <Method boolean File.delete()>
	//    2    4:pop             
		context = ((Context) (context.getAssets().open(s)));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #32  <Method AssetManager Context.getAssets()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #38  <Method InputStream AssetManager.open(String)>
	//    7   13:astore_0        
		s = ((String) (new byte[((InputStream) (context)).available()]));
	//    8   14:aload_0         
	//    9   15:invokevirtual   #44  <Method int InputStream.available()>
	//   10   18:newarray        byte[]
	//   11   20:astore_1        
		((InputStream) (context)).read(((byte []) (s)));
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:invokevirtual   #48  <Method int InputStream.read(byte[])>
	//   15   26:pop             
		closeQuietly(((Closeable) (context)));
	//   16   27:aload_0         
	//   17   28:invokestatic    #50  <Method void closeQuietly(Closeable)>
		break MISSING_BLOCK_LABEL_41;
	//   18   31:goto            41
		s;
	//   19   34:astore_1        
		closeQuietly(((Closeable) (context)));
	//   20   35:aload_0         
	//   21   36:invokestatic    #50  <Method void closeQuietly(Closeable)>
		throw s;
	//   22   39:aload_1         
	//   23   40:athrow          
		context = ((Context) (new FileOutputStream(file)));
	//   24   41:new             #52  <Class FileOutputStream>
	//   25   44:dup             
	//   26   45:aload_2         
	//   27   46:invokespecial   #55  <Method void FileOutputStream(File)>
	//   28   49:astore_0        
		((FileOutputStream) (context)).write(((byte []) (s)));
	//   29   50:aload_0         
	//   30   51:aload_1         
	//   31   52:invokevirtual   #59  <Method void FileOutputStream.write(byte[])>
		closeQuietly(((Closeable) (context)));
	//   32   55:aload_0         
	//   33   56:invokestatic    #50  <Method void closeQuietly(Closeable)>
		return;
	//   34   59:return          
		s;
	//   35   60:astore_1        
		closeQuietly(((Closeable) (context)));
	//   36   61:aload_0         
	//   37   62:invokestatic    #50  <Method void closeQuietly(Closeable)>
		throw s;
	//   38   65:aload_1         
	//   39   66:athrow          
	}

	public static void deleteFile(File file)
	{
		if(file == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		File afile[] = file.listFiles();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #65  <Method File[] File.listFiles()>
	//    5    9:astore_3        
		if(file.isDirectory() && afile != null)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #68  <Method boolean File.isDirectory()>
	//*   8   14:ifeq            44
	//*   9   17:aload_3         
	//*  10   18:ifnull          44
		{
			int i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_1        
			for(int j = afile.length; i < j; i++)
	//*  13   23:aload_3         
	//*  14   24:arraylength     
	//*  15   25:istore_2        
	//*  16   26:iload_1         
	//*  17   27:iload_2         
	//*  18   28:icmpge          44
				deleteFile(afile[i]);
	//   19   31:aload_3         
	//   20   32:iload_1         
	//   21   33:aaload          
	//   22   34:invokestatic    #70  <Method void deleteFile(File)>

	//   23   37:iload_1         
	//   24   38:iconst_1        
	//   25   39:iadd            
	//   26   40:istore_1        
		}
	//*  27   41:goto            26
		file.delete();
	//   28   44:aload_0         
	//   29   45:invokevirtual   #26  <Method boolean File.delete()>
	//   30   48:pop             
	//   31   49:return          
	}

	public static File getCacheDir(Context context)
	{
		File file1 = context.getCacheDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method File Context.getCacheDir()>
	//    2    4:astore_2        
		File file = file1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(file1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       19
			file = context.getDir("cache", 0);
	//    7   11:aload_0         
	//    8   12:ldc1            #77  <String "cache">
	//    9   14:iconst_0        
	//   10   15:invokevirtual   #81  <Method File Context.getDir(String, int)>
	//   11   18:astore_1        
		file1 = file;
	//   12   19:aload_1         
	//   13   20:astore_2        
		if(file == null)
	//*  14   21:aload_1         
	//*  15   22:ifnonnull       60
			file1 = new File((new StringBuilder()).append("/data/data/").append(context.getPackageName()).append("/app_cache").toString());
	//   16   25:new             #22  <Class File>
	//   17   28:dup             
	//   18   29:new             #83  <Class StringBuilder>
	//   19   32:dup             
	//   20   33:invokespecial   #84  <Method void StringBuilder()>
	//   21   36:ldc1            #86  <String "/data/data/">
	//   22   38:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:aload_0         
	//   24   42:invokevirtual   #94  <Method String Context.getPackageName()>
	//   25   45:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:ldc1            #96  <String "/app_cache">
	//   27   50:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   29   56:invokespecial   #102 <Method void File(String)>
	//   30   59:astore_2        
		if(!file1.exists())
	//*  31   60:aload_2         
	//*  32   61:invokevirtual   #105 <Method boolean File.exists()>
	//*  33   64:ifne            72
			file1.mkdirs();
	//   34   67:aload_2         
	//   35   68:invokevirtual   #108 <Method boolean File.mkdirs()>
	//   36   71:pop             
		return file1;
	//   37   72:aload_2         
	//   38   73:areturn         
	}

	public static File getFilesDir(Context context)
	{
		File file1 = context.getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #111 <Method File Context.getFilesDir()>
	//    2    4:astore_2        
		File file = file1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(file1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       19
			file = context.getDir("files", 0);
	//    7   11:aload_0         
	//    8   12:ldc1            #113 <String "files">
	//    9   14:iconst_0        
	//   10   15:invokevirtual   #81  <Method File Context.getDir(String, int)>
	//   11   18:astore_1        
		file1 = file;
	//   12   19:aload_1         
	//   13   20:astore_2        
		if(file == null)
	//*  14   21:aload_1         
	//*  15   22:ifnonnull       60
			file1 = new File((new StringBuilder()).append("/data/data/").append(context.getPackageName()).append("/app_files").toString());
	//   16   25:new             #22  <Class File>
	//   17   28:dup             
	//   18   29:new             #83  <Class StringBuilder>
	//   19   32:dup             
	//   20   33:invokespecial   #84  <Method void StringBuilder()>
	//   21   36:ldc1            #86  <String "/data/data/">
	//   22   38:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:aload_0         
	//   24   42:invokevirtual   #94  <Method String Context.getPackageName()>
	//   25   45:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:ldc1            #115 <String "/app_files">
	//   27   50:invokevirtual   #90  <Method StringBuilder StringBuilder.append(String)>
	//   28   53:invokevirtual   #99  <Method String StringBuilder.toString()>
	//   29   56:invokespecial   #102 <Method void File(String)>
	//   30   59:astore_2        
		if(!file1.exists())
	//*  31   60:aload_2         
	//*  32   61:invokevirtual   #105 <Method boolean File.exists()>
	//*  33   64:ifne            72
			file1.mkdirs();
	//   34   67:aload_2         
	//   35   68:invokevirtual   #108 <Method boolean File.mkdirs()>
	//   36   71:pop             
		return file1;
	//   37   72:aload_2         
	//   38   73:areturn         
	}

	public static byte[] readFileContents(String s)
	{
		String s1;
		String s2;
		byte abyte0[];
		ByteArrayOutputStream bytearrayoutputstream;
		bytearrayoutputstream = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		abyte0 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		s1 = ((String) (abyte0));
	//    4    6:aload           5
	//    5    8:astore_3        
		s2 = ((String) (bytearrayoutputstream));
	//    6    9:aload           6
	//    7   11:astore          4
		int i;
		boolean flag;
		try
		{
			s = ((String) (new File(s)));
	//    8   13:new             #22  <Class File>
	//    9   16:dup             
	//   10   17:aload_0         
	//   11   18:invokespecial   #102 <Method void File(String)>
	//   12   21:astore_0        
		}
	//*  13   22:aload           5
	//*  14   24:astore_3        
	//*  15   25:aload           6
	//*  16   27:astore          4
	//*  17   29:aload_0         
	//*  18   30:invokevirtual   #105 <Method boolean File.exists()>
	//*  19   33:istore_2        
	//*  20   34:iload_2         
	//*  21   35:ifne            44
	//*  22   38:aconst_null     
	//*  23   39:invokestatic    #50  <Method void closeQuietly(Closeable)>
	//*  24   42:aconst_null     
	//*  25   43:areturn         
	//*  26   44:aload           5
	//*  27   46:astore_3        
	//*  28   47:aload           6
	//*  29   49:astore          4
	//*  30   51:new             #119 <Class FileInputStream>
	//*  31   54:dup             
	//*  32   55:aload_0         
	//*  33   56:invokespecial   #120 <Method void FileInputStream(File)>
	//*  34   59:astore_0        
	//*  35   60:aload_0         
	//*  36   61:astore_3        
	//*  37   62:aload_0         
	//*  38   63:astore          4
	//*  39   65:sipush          1024
	//*  40   68:newarray        byte[]
	//*  41   70:astore          5
	//*  42   72:aload_0         
	//*  43   73:astore_3        
	//*  44   74:aload_0         
	//*  45   75:astore          4
	//*  46   77:new             #122 <Class ByteArrayOutputStream>
	//*  47   80:dup             
	//*  48   81:invokespecial   #123 <Method void ByteArrayOutputStream()>
	//*  49   84:astore          6
	//*  50   86:aload_0         
	//*  51   87:astore_3        
	//*  52   88:aload_0         
	//*  53   89:astore          4
	//*  54   91:aload_0         
	//*  55   92:aload           5
	//*  56   94:invokevirtual   #124 <Method int FileInputStream.read(byte[])>
	//*  57   97:istore_1        
	//*  58   98:iload_1         
	//*  59   99:iconst_m1       
	//*  60  100:icmpeq          120
	//*  61  103:aload_0         
	//*  62  104:astore_3        
	//*  63  105:aload_0         
	//*  64  106:astore          4
	//*  65  108:aload           6
	//*  66  110:aload           5
	//*  67  112:iconst_0        
	//*  68  113:iload_1         
	//*  69  114:invokevirtual   #127 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//*  70  117:goto            86
	//*  71  120:aload_0         
	//*  72  121:astore_3        
	//*  73  122:aload_0         
	//*  74  123:astore          4
	//*  75  125:aload           6
	//*  76  127:invokevirtual   #128 <Method void ByteArrayOutputStream.close()>
	//*  77  130:aload_0         
	//*  78  131:astore_3        
	//*  79  132:aload_0         
	//*  80  133:astore          4
	//*  81  135:aload           6
	//*  82  137:invokevirtual   #132 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  83  140:astore          5
	//*  84  142:aload_0         
	//*  85  143:invokestatic    #50  <Method void closeQuietly(Closeable)>
	//*  86  146:aload           5
	//*  87  148:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  88  149:astore_0        
		{
			closeQuietly(((Closeable) (s1)));
	//   89  150:aload_3         
	//   90  151:invokestatic    #50  <Method void closeQuietly(Closeable)>
			break MISSING_BLOCK_LABEL_165;
	//   91  154:goto            165
		}
		s1 = ((String) (abyte0));
		s2 = ((String) (bytearrayoutputstream));
		flag = ((File) (s)).exists();
		if(!flag)
		{
			closeQuietly(((Closeable) (null)));
			return null;
		}
		s1 = ((String) (abyte0));
		s2 = ((String) (bytearrayoutputstream));
		s = ((String) (new FileInputStream(((File) (s)))));
		s1 = s;
		s2 = s;
		abyte0 = new byte[1024];
		s1 = s;
		s2 = s;
		bytearrayoutputstream = new ByteArrayOutputStream();
_L2:
		s1 = s;
		s2 = s;
		i = ((FileInputStream) (s)).read(abyte0);
		if(i == -1)
			break; /* Loop/switch isn't completed */
		s1 = s;
		s2 = s;
		bytearrayoutputstream.write(abyte0, 0, i);
		if(true) goto _L2; else goto _L1
_L1:
		s1 = s;
		s2 = s;
		bytearrayoutputstream.close();
		s1 = s;
		s2 = s;
		abyte0 = bytearrayoutputstream.toByteArray();
		closeQuietly(((Closeable) (s)));
		return abyte0;
		s;
	//   92  157:astore_0        
		closeQuietly(((Closeable) (s2)));
	//   93  158:aload           4
	//   94  160:invokestatic    #50  <Method void closeQuietly(Closeable)>
		throw s;
	//   95  163:aload_0         
	//   96  164:athrow          
		return null;
	//   97  165:aconst_null     
	//   98  166:areturn         
	}

	public static void writeDatasToFile(String s, byte abyte0[])
	{
		String s1;
		String s2;
		Object obj;
		Object obj1;
		java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writelock;
		writelock = (new ReentrantReadWriteLock()).writeLock();
	//    0    0:new             #136 <Class ReentrantReadWriteLock>
	//    1    3:dup             
	//    2    4:invokespecial   #137 <Method void ReentrantReadWriteLock()>
	//    3    7:invokevirtual   #141 <Method java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock ReentrantReadWriteLock.writeLock()>
	//    4   10:astore          7
		writelock.lock();
	//    5   12:aload           7
	//    6   14:invokevirtual   #146 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.lock()>
		obj1 = null;
	//    7   17:aconst_null     
	//    8   18:astore          6
		obj = null;
	//    9   20:aconst_null     
	//   10   21:astore          5
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_41;
	//   11   23:aload_1         
	//   12   24:ifnull          41
		s1 = ((String) (obj));
	//   13   27:aload           5
	//   14   29:astore_3        
		s2 = ((String) (obj1));
	//   15   30:aload           6
	//   16   32:astore          4
		int i;
		File file;
		try
		{
			i = abyte0.length;
	//   17   34:aload_1         
	//   18   35:arraylength     
	//   19   36:istore_2        
		}
	//*  20   37:iload_2         
	//*  21   38:ifne            51
	//*  22   41:aload           7
	//*  23   43:invokevirtual   #149 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
	//*  24   46:aconst_null     
	//*  25   47:invokestatic    #50  <Method void closeQuietly(Closeable)>
	//*  26   50:return          
	//*  27   51:aload           5
	//*  28   53:astore_3        
	//*  29   54:aload           6
	//*  30   56:astore          4
	//*  31   58:new             #22  <Class File>
	//*  32   61:dup             
	//*  33   62:aload_0         
	//*  34   63:invokespecial   #102 <Method void File(String)>
	//*  35   66:astore_0        
	//*  36   67:aload           5
	//*  37   69:astore_3        
	//*  38   70:aload           6
	//*  39   72:astore          4
	//*  40   74:aload_0         
	//*  41   75:invokevirtual   #152 <Method File File.getParentFile()>
	//*  42   78:astore          8
	//*  43   80:aload           5
	//*  44   82:astore_3        
	//*  45   83:aload           6
	//*  46   85:astore          4
	//*  47   87:aload           8
	//*  48   89:invokevirtual   #105 <Method boolean File.exists()>
	//*  49   92:ifne            108
	//*  50   95:aload           5
	//*  51   97:astore_3        
	//*  52   98:aload           6
	//*  53  100:astore          4
	//*  54  102:aload           8
	//*  55  104:invokevirtual   #108 <Method boolean File.mkdirs()>
	//*  56  107:pop             
	//*  57  108:aload           5
	//*  58  110:astore_3        
	//*  59  111:aload           6
	//*  60  113:astore          4
	//*  61  115:aload_0         
	//*  62  116:invokevirtual   #105 <Method boolean File.exists()>
	//*  63  119:ifeq            134
	//*  64  122:aload           5
	//*  65  124:astore_3        
	//*  66  125:aload           6
	//*  67  127:astore          4
	//*  68  129:aload_0         
	//*  69  130:invokevirtual   #26  <Method boolean File.delete()>
	//*  70  133:pop             
	//*  71  134:aload           5
	//*  72  136:astore_3        
	//*  73  137:aload           6
	//*  74  139:astore          4
	//*  75  141:aload_0         
	//*  76  142:invokevirtual   #155 <Method boolean File.createNewFile()>
	//*  77  145:pop             
	//*  78  146:aload           5
	//*  79  148:astore_3        
	//*  80  149:aload           6
	//*  81  151:astore          4
	//*  82  153:new             #52  <Class FileOutputStream>
	//*  83  156:dup             
	//*  84  157:aload_0         
	//*  85  158:invokespecial   #55  <Method void FileOutputStream(File)>
	//*  86  161:astore_0        
	//*  87  162:aload_0         
	//*  88  163:astore_3        
	//*  89  164:aload_0         
	//*  90  165:astore          4
	//*  91  167:aload_0         
	//*  92  168:aload_1         
	//*  93  169:invokevirtual   #158 <Method void OutputStream.write(byte[])>
	//*  94  172:aload_0         
	//*  95  173:astore_3        
	//*  96  174:aload_0         
	//*  97  175:astore          4
	//*  98  177:aload_0         
	//*  99  178:invokevirtual   #161 <Method void OutputStream.flush()>
	//* 100  181:aload           7
	//* 101  183:invokevirtual   #149 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
	//* 102  186:aload_0         
	//* 103  187:invokestatic    #50  <Method void closeQuietly(Closeable)>
	//* 104  190:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 105  191:astore_0        
		{
			writelock.unlock();
	//  106  192:aload           7
	//  107  194:invokevirtual   #149 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
			closeQuietly(((Closeable) (s1)));
	//  108  197:aload_3         
	//  109  198:invokestatic    #50  <Method void closeQuietly(Closeable)>
			return;
	//  110  201:return          
		}
		if(i != 0)
			break MISSING_BLOCK_LABEL_51;
		writelock.unlock();
		closeQuietly(((Closeable) (null)));
		return;
		s1 = ((String) (obj));
		s2 = ((String) (obj1));
		s = ((String) (new File(s)));
		s1 = ((String) (obj));
		s2 = ((String) (obj1));
		file = ((File) (s)).getParentFile();
		s1 = ((String) (obj));
		s2 = ((String) (obj1));
		if(file.exists())
			break MISSING_BLOCK_LABEL_108;
		s1 = ((String) (obj));
		s2 = ((String) (obj1));
		file.mkdirs();
		s1 = ((String) (obj));
		s2 = ((String) (obj1));
		if(!((File) (s)).exists())
			break MISSING_BLOCK_LABEL_134;
		s1 = ((String) (obj));
		s2 = ((String) (obj1));
		((File) (s)).delete();
		s1 = ((String) (obj));
		s2 = ((String) (obj1));
		((File) (s)).createNewFile();
		s1 = ((String) (obj));
		s2 = ((String) (obj1));
		s = ((String) (new FileOutputStream(((File) (s)))));
		s1 = s;
		s2 = s;
		((OutputStream) (s)).write(abyte0);
		s1 = s;
		s2 = s;
		((OutputStream) (s)).flush();
		writelock.unlock();
		closeQuietly(((Closeable) (s)));
		return;
		s;
	//  111  202:astore_0        
		writelock.unlock();
	//  112  203:aload           7
	//  113  205:invokevirtual   #149 <Method void java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock.unlock()>
		closeQuietly(((Closeable) (s2)));
	//  114  208:aload           4
	//  115  210:invokestatic    #50  <Method void closeQuietly(Closeable)>
		throw s;
	//  116  213:aload_0         
	//  117  214:athrow          
	}
}
