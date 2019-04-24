// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.cache.disc.impl;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.disc.DiskCache;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.core.DefaultConfigurationFactory;
import com.nostra13.universalimageloader.utils.IoUtils;
import java.io.*;

public abstract class BaseDiskCache
	implements DiskCache
{

	public BaseDiskCache(File file)
	{
		this(file, ((File) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #43  <Method void BaseDiskCache(File, File)>
	//    4    6:return          
	}

	public BaseDiskCache(File file, File file1)
	{
		this(file, file1, DefaultConfigurationFactory.createFileNameGenerator());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #49  <Method FileNameGenerator DefaultConfigurationFactory.createFileNameGenerator()>
	//    4    6:invokespecial   #52  <Method void BaseDiskCache(File, File, FileNameGenerator)>
	//    5    9:return          
	}

	public BaseDiskCache(File file, File file1, FileNameGenerator filenamegenerator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		bufferSize = 32768;
	//    2    4:aload_0         
	//    3    5:ldc1            #9   <Int 32768>
	//    4    7:putfield        #56  <Field int bufferSize>
		compressFormat = DEFAULT_COMPRESS_FORMAT;
	//    5   10:aload_0         
	//    6   11:getstatic       #37  <Field android.graphics.Bitmap$CompressFormat DEFAULT_COMPRESS_FORMAT>
	//    7   14:putfield        #58  <Field android.graphics.Bitmap$CompressFormat compressFormat>
		compressQuality = 100;
	//    8   17:aload_0         
	//    9   18:bipush          100
	//   10   20:putfield        #60  <Field int compressQuality>
		if(file == null)
	//*  11   23:aload_1         
	//*  12   24:ifnonnull       37
			throw new IllegalArgumentException("cacheDir argument must be not null");
	//   13   27:new             #62  <Class IllegalArgumentException>
	//   14   30:dup             
	//   15   31:ldc1            #64  <String "cacheDir argument must be not null">
	//   16   33:invokespecial   #67  <Method void IllegalArgumentException(String)>
	//   17   36:athrow          
		if(filenamegenerator == null)
	//*  18   37:aload_3         
	//*  19   38:ifnonnull       51
		{
			throw new IllegalArgumentException("fileNameGenerator argument must be not null");
	//   20   41:new             #62  <Class IllegalArgumentException>
	//   21   44:dup             
	//   22   45:ldc1            #69  <String "fileNameGenerator argument must be not null">
	//   23   47:invokespecial   #67  <Method void IllegalArgumentException(String)>
	//   24   50:athrow          
		} else
		{
			cacheDir = file;
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:putfield        #71  <Field File cacheDir>
			reserveCacheDir = file1;
	//   28   56:aload_0         
	//   29   57:aload_2         
	//   30   58:putfield        #73  <Field File reserveCacheDir>
			fileNameGenerator = filenamegenerator;
	//   31   61:aload_0         
	//   32   62:aload_3         
	//   33   63:putfield        #75  <Field FileNameGenerator fileNameGenerator>
			return;
	//   34   66:return          
		}
	}

	public void clear()
	{
		File afile[] = cacheDir.listFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field File cacheDir>
	//    2    4:invokevirtual   #82  <Method File[] File.listFiles()>
	//    3    7:astore_3        
		if(afile != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          36
		{
			int j = afile.length;
	//    6   12:aload_3         
	//    7   13:arraylength     
	//    8   14:istore_2        
			for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:iload_2         
	//*  13   19:icmpge          36
				afile[i].delete();
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:invokevirtual   #86  <Method boolean File.delete()>
	//   18   28:pop             

	//   19   29:iload_1         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:istore_1        
		}
	//*  23   33:goto            17
	//   24   36:return          
	}

	public void close()
	{
	//    0    0:return          
	}

	public File get(String s)
	{
		return getFile(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method File getFile(String)>
	//    3    5:areturn         
	}

	public File getDirectory()
	{
		return cacheDir;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field File cacheDir>
	//    2    4:areturn         
	}

	protected File getFile(String s)
	{
		String s1;
label0:
		{
			s1 = fileNameGenerator.generate(s);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field FileNameGenerator fileNameGenerator>
	//    2    4:aload_1         
	//    3    5:invokeinterface #100 <Method String FileNameGenerator.generate(String)>
	//    4   10:astore_3        
			File file = cacheDir;
	//    5   11:aload_0         
	//    6   12:getfield        #71  <Field File cacheDir>
	//    7   15:astore_2        
			s = ((String) (file));
	//    8   16:aload_2         
	//    9   17:astore_1        
			if(cacheDir.exists())
				break label0;
	//   10   18:aload_0         
	//   11   19:getfield        #71  <Field File cacheDir>
	//   12   22:invokevirtual   #103 <Method boolean File.exists()>
	//   13   25:ifne            76
			s = ((String) (file));
	//   14   28:aload_2         
	//   15   29:astore_1        
			if(cacheDir.mkdirs())
				break label0;
	//   16   30:aload_0         
	//   17   31:getfield        #71  <Field File cacheDir>
	//   18   34:invokevirtual   #106 <Method boolean File.mkdirs()>
	//   19   37:ifne            76
			s = ((String) (file));
	//   20   40:aload_2         
	//   21   41:astore_1        
			if(reserveCacheDir == null)
				break label0;
	//   22   42:aload_0         
	//   23   43:getfield        #73  <Field File reserveCacheDir>
	//   24   46:ifnull          76
			if(!reserveCacheDir.exists())
	//*  25   49:aload_0         
	//*  26   50:getfield        #73  <Field File reserveCacheDir>
	//*  27   53:invokevirtual   #103 <Method boolean File.exists()>
	//*  28   56:ifne            71
			{
				s = ((String) (file));
	//   29   59:aload_2         
	//   30   60:astore_1        
				if(!reserveCacheDir.mkdirs())
					break label0;
	//   31   61:aload_0         
	//   32   62:getfield        #73  <Field File reserveCacheDir>
	//   33   65:invokevirtual   #106 <Method boolean File.mkdirs()>
	//   34   68:ifeq            76
			}
			s = ((String) (reserveCacheDir));
	//   35   71:aload_0         
	//   36   72:getfield        #73  <Field File reserveCacheDir>
	//   37   75:astore_1        
		}
		return new File(((File) (s)), s1);
	//   38   76:new             #78  <Class File>
	//   39   79:dup             
	//   40   80:aload_1         
	//   41   81:aload_3         
	//   42   82:invokespecial   #109 <Method void File(File, String)>
	//   43   85:areturn         
	}

	public boolean remove(String s)
	{
		return getFile(s).delete();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method File getFile(String)>
	//    3    5:invokevirtual   #86  <Method boolean File.delete()>
	//    4    8:ireturn         
	}

	public boolean save(String s, Bitmap bitmap)
		throws IOException
	{
		Object obj;
		BufferedOutputStream bufferedoutputstream;
		s = ((String) (getFile(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method File getFile(String)>
	//    3    5:astore_1        
		obj = ((Object) (new StringBuilder()));
	//    4    6:new             #117 <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #118 <Method void StringBuilder()>
	//    7   13:astore          5
		((StringBuilder) (obj)).append(((File) (s)).getAbsolutePath());
	//    8   15:aload           5
	//    9   17:aload_1         
	//   10   18:invokevirtual   #122 <Method String File.getAbsolutePath()>
	//   11   21:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		((StringBuilder) (obj)).append(".tmp");
	//   13   25:aload           5
	//   14   27:ldc1            #20  <String ".tmp">
	//   15   29:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		obj = ((Object) (new File(((StringBuilder) (obj)).toString())));
	//   17   33:new             #78  <Class File>
	//   18   36:dup             
	//   19   37:aload           5
	//   20   39:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   21   42:invokespecial   #130 <Method void File(String)>
	//   22   45:astore          5
		bufferedoutputstream = new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(((File) (obj))))), bufferSize);
	//   23   47:new             #132 <Class BufferedOutputStream>
	//   24   50:dup             
	//   25   51:new             #134 <Class FileOutputStream>
	//   26   54:dup             
	//   27   55:aload           5
	//   28   57:invokespecial   #136 <Method void FileOutputStream(File)>
	//   29   60:aload_0         
	//   30   61:getfield        #56  <Field int bufferSize>
	//   31   64:invokespecial   #139 <Method void BufferedOutputStream(java.io.OutputStream, int)>
	//   32   67:astore          6
		boolean flag1 = bitmap.compress(compressFormat, compressQuality, ((java.io.OutputStream) (bufferedoutputstream)));
	//   33   69:aload_2         
	//   34   70:aload_0         
	//   35   71:getfield        #58  <Field android.graphics.Bitmap$CompressFormat compressFormat>
	//   36   74:aload_0         
	//   37   75:getfield        #60  <Field int compressQuality>
	//   38   78:aload           6
	//   39   80:invokevirtual   #145 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   40   83:istore          4
		IoUtils.closeSilently(((java.io.Closeable) (bufferedoutputstream)));
	//   41   85:aload           6
	//   42   87:invokestatic    #151 <Method void IoUtils.closeSilently(java.io.Closeable)>
		boolean flag = flag1;
	//   43   90:iload           4
	//   44   92:istore_3        
		if(flag1)
	//*  45   93:iload           4
	//*  46   95:ifeq            112
		{
			flag = flag1;
	//   47   98:iload           4
	//   48  100:istore_3        
			if(!((File) (obj)).renameTo(((File) (s))))
	//*  49  101:aload           5
	//*  50  103:aload_1         
	//*  51  104:invokevirtual   #155 <Method boolean File.renameTo(File)>
	//*  52  107:ifne            112
				flag = false;
	//   53  110:iconst_0        
	//   54  111:istore_3        
		}
		if(!flag)
	//*  55  112:iload_3         
	//*  56  113:ifne            122
			((File) (obj)).delete();
	//   57  116:aload           5
	//   58  118:invokevirtual   #86  <Method boolean File.delete()>
	//   59  121:pop             
		bitmap.recycle();
	//   60  122:aload_2         
	//   61  123:invokevirtual   #158 <Method void Bitmap.recycle()>
		return flag;
	//   62  126:iload_3         
	//   63  127:ireturn         
		s;
	//   64  128:astore_1        
		IoUtils.closeSilently(((java.io.Closeable) (bufferedoutputstream)));
	//   65  129:aload           6
	//   66  131:invokestatic    #151 <Method void IoUtils.closeSilently(java.io.Closeable)>
		((File) (obj)).delete();
	//   67  134:aload           5
	//   68  136:invokevirtual   #86  <Method boolean File.delete()>
	//   69  139:pop             
		throw s;
	//   70  140:aload_1         
	//   71  141:athrow          
	}

	public boolean save(String s, InputStream inputstream, com.nostra13.universalimageloader.utils.IoUtils.CopyListener copylistener)
		throws IOException
	{
		File file;
		File file1;
		file = getFile(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method File getFile(String)>
	//    3    5:astore          6
		s = ((String) (new StringBuilder()));
	//    4    7:new             #117 <Class StringBuilder>
	//    5   10:dup             
	//    6   11:invokespecial   #118 <Method void StringBuilder()>
	//    7   14:astore_1        
		((StringBuilder) (s)).append(file.getAbsolutePath());
	//    8   15:aload_1         
	//    9   16:aload           6
	//   10   18:invokevirtual   #122 <Method String File.getAbsolutePath()>
	//   11   21:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		((StringBuilder) (s)).append(".tmp");
	//   13   25:aload_1         
	//   14   26:ldc1            #20  <String ".tmp">
	//   15   28:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		file1 = new File(((StringBuilder) (s)).toString());
	//   17   32:new             #78  <Class File>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   21   40:invokespecial   #130 <Method void File(String)>
	//   22   43:astore          7
		s = ((String) (new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(file1))), bufferSize)));
	//   23   45:new             #132 <Class BufferedOutputStream>
	//   24   48:dup             
	//   25   49:new             #134 <Class FileOutputStream>
	//   26   52:dup             
	//   27   53:aload           7
	//   28   55:invokespecial   #136 <Method void FileOutputStream(File)>
	//   29   58:aload_0         
	//   30   59:getfield        #56  <Field int bufferSize>
	//   31   62:invokespecial   #139 <Method void BufferedOutputStream(java.io.OutputStream, int)>
	//   32   65:astore_1        
		boolean flag = IoUtils.copyStream(inputstream, ((java.io.OutputStream) (s)), copylistener, bufferSize);
	//   33   66:aload_2         
	//   34   67:aload_1         
	//   35   68:aload_3         
	//   36   69:aload_0         
	//   37   70:getfield        #56  <Field int bufferSize>
	//   38   73:invokestatic    #164 <Method boolean IoUtils.copyStream(InputStream, java.io.OutputStream, com.nostra13.universalimageloader.utils.IoUtils$CopyListener, int)>
	//   39   76:istore          4
		IoUtils.closeSilently(((java.io.Closeable) (s)));
	//   40   78:aload_1         
	//   41   79:invokestatic    #151 <Method void IoUtils.closeSilently(java.io.Closeable)>
		boolean flag1 = flag;
	//   42   82:iload           4
	//   43   84:istore          5
		if(flag)
	//*  44   86:iload           4
	//*  45   88:ifeq            108
		{
			flag1 = flag;
	//   46   91:iload           4
	//   47   93:istore          5
			if(!file1.renameTo(file))
	//*  48   95:aload           7
	//*  49   97:aload           6
	//*  50   99:invokevirtual   #155 <Method boolean File.renameTo(File)>
	//*  51  102:ifne            108
				flag1 = false;
	//   52  105:iconst_0        
	//   53  106:istore          5
		}
		if(!flag1)
	//*  54  108:iload           5
	//*  55  110:ifne            119
			file1.delete();
	//   56  113:aload           7
	//   57  115:invokevirtual   #86  <Method boolean File.delete()>
	//   58  118:pop             
		return flag1;
	//   59  119:iload           5
	//   60  121:ireturn         
		s;
	//   61  122:astore_1        
		break MISSING_BLOCK_LABEL_137;
	//   62  123:goto            137
		inputstream;
	//   63  126:astore_2        
		IoUtils.closeSilently(((java.io.Closeable) (s)));
	//   64  127:aload_1         
	//   65  128:invokestatic    #151 <Method void IoUtils.closeSilently(java.io.Closeable)>
		throw inputstream;
	//   66  131:aload_2         
	//   67  132:athrow          
		s;
	//   68  133:astore_1        
		flag = false;
	//   69  134:iconst_0        
	//   70  135:istore          4
		boolean flag2 = flag;
	//   71  137:iload           4
	//   72  139:istore          5
		if(flag)
	//*  73  141:iload           4
	//*  74  143:ifeq            163
		{
			flag2 = flag;
	//   75  146:iload           4
	//   76  148:istore          5
			if(!file1.renameTo(file))
	//*  77  150:aload           7
	//*  78  152:aload           6
	//*  79  154:invokevirtual   #155 <Method boolean File.renameTo(File)>
	//*  80  157:ifne            163
				flag2 = false;
	//   81  160:iconst_0        
	//   82  161:istore          5
		}
		if(!flag2)
	//*  83  163:iload           5
	//*  84  165:ifne            174
			file1.delete();
	//   85  168:aload           7
	//   86  170:invokevirtual   #86  <Method boolean File.delete()>
	//   87  173:pop             
		throw s;
	//   88  174:aload_1         
	//   89  175:athrow          
	}

	public void setBufferSize(int i)
	{
		bufferSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int bufferSize>
	//    3    5:return          
	}

	public void setCompressFormat(android.graphics.Bitmap.CompressFormat compressformat)
	{
		compressFormat = compressformat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field android.graphics.Bitmap$CompressFormat compressFormat>
	//    3    5:return          
	}

	public void setCompressQuality(int i)
	{
		compressQuality = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field int compressQuality>
	//    3    5:return          
	}

	public static final int DEFAULT_BUFFER_SIZE = 32768;
	public static final android.graphics.Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT;
	public static final int DEFAULT_COMPRESS_QUALITY = 100;
	private static final String ERROR_ARG_NULL = " argument must be not null";
	private static final String TEMP_IMAGE_POSTFIX = ".tmp";
	protected int bufferSize;
	protected final File cacheDir;
	protected android.graphics.Bitmap.CompressFormat compressFormat;
	protected int compressQuality;
	protected final FileNameGenerator fileNameGenerator;
	protected final File reserveCacheDir;

	static 
	{
		DEFAULT_COMPRESS_FORMAT = android.graphics.Bitmap.CompressFormat.PNG;
	//    0    0:getstatic       #35  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//    1    3:putstatic       #37  <Field android.graphics.Bitmap$CompressFormat DEFAULT_COMPRESS_FORMAT>
	//*   2    6:return          
	}
}
