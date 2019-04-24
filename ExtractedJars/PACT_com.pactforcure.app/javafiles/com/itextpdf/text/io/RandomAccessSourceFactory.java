// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.*;
import java.net.URL;
import java.nio.channels.FileChannel;

// Referenced classes of package com.itextpdf.text.io:
//			ArrayRandomAccessSource, StreamUtil, MapFailedException, RAFRandomAccessSource, 
//			GetBufferedRandomAccessSource, FileChannelRandomAccessSource, PagedChannelRandomAccessSource, RandomAccessSource, 
//			WindowRandomAccessSource, GroupedRandomAccessSource

public final class RandomAccessSourceFactory
{

	public RandomAccessSourceFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		forceRead = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field boolean forceRead>
		usePlainRandomAccess = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #16  <Field boolean usePlainRandomAccess>
		exclusivelyLockFile = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #18  <Field boolean exclusivelyLockFile>
	//   11   19:return          
	}

	private RandomAccessSource createByReadingToMemory(InputStream inputstream)
		throws IOException
	{
		Object obj = ((Object) (new ArrayRandomAccessSource(StreamUtil.inputStreamToArray(inputstream))));
	//    0    0:new             #25  <Class ArrayRandomAccessSource>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #31  <Method byte[] StreamUtil.inputStreamToArray(InputStream)>
	//    4    8:invokespecial   #34  <Method void ArrayRandomAccessSource(byte[])>
	//    5   11:astore_2        
		try
		{
			inputstream.close();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #39  <Method void InputStream.close()>
		}
	//*   8   16:aload_2         
	//*   9   17:areturn         
	//*  10   18:astore_2        
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #39  <Method void InputStream.close()>
	//*  13   23:aload_2         
	//*  14   24:athrow          
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  15   25:astore_1        
		{
			return ((RandomAccessSource) (obj));
	//   16   26:aload_2         
	//   17   27:areturn         
		}
		return ((RandomAccessSource) (obj));
		obj;
		try
		{
			inputstream.close();
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream) { }
	//   18   28:astore_1        
		throw obj;
	//*  19   29:goto            23
	}

	private RandomAccessSource createByReadingToMemory(String s)
		throws IOException
	{
		InputStream inputstream = StreamUtil.getResourceStream(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #45  <Method InputStream StreamUtil.getResourceStream(String)>
	//    2    4:astore_2        
		if(inputstream == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       30
			throw new IOException(MessageLocalization.getComposedMessage("1.not.found.as.file.or.resource", new Object[] {
				s
			}));
	//    5    9:new             #23  <Class IOException>
	//    6   12:dup             
	//    7   13:ldc1            #47  <String "1.not.found.as.file.or.resource">
	//    8   15:iconst_1        
	//    9   16:anewarray       Object[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:aload_1         
	//   13   22:aastore         
	//   14   23:invokestatic    #53  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   15   26:invokespecial   #56  <Method void IOException(String)>
	//   16   29:athrow          
		else
			return createByReadingToMemory(inputstream);
	//   17   30:aload_0         
	//   18   31:aload_2         
	//   19   32:invokespecial   #58  <Method RandomAccessSource createByReadingToMemory(InputStream)>
	//   20   35:areturn         
	}

	public RandomAccessSource createBestSource(RandomAccessFile randomaccessfile)
		throws IOException
	{
		if(usePlainRandomAccess)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field boolean usePlainRandomAccess>
	//*   2    4:ifeq            16
			return ((RandomAccessSource) (new RAFRandomAccessSource(randomaccessfile)));
	//    3    7:new             #64  <Class RAFRandomAccessSource>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #67  <Method void RAFRandomAccessSource(RandomAccessFile)>
	//    7   15:areturn         
		if(randomaccessfile.length() <= 0L)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #73  <Method long RandomAccessFile.length()>
	//*  10   20:lconst_0        
	//*  11   21:lcmp            
	//*  12   22:ifgt            34
			return ((RandomAccessSource) (new RAFRandomAccessSource(randomaccessfile)));
	//   13   25:new             #64  <Class RAFRandomAccessSource>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:invokespecial   #67  <Method void RAFRandomAccessSource(RandomAccessFile)>
	//   17   33:areturn         
		RandomAccessSource randomaccesssource;
		try
		{
			randomaccesssource = createBestSource(randomaccessfile.getChannel());
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #77  <Method FileChannel RandomAccessFile.getChannel()>
	//   21   39:invokevirtual   #80  <Method RandomAccessSource createBestSource(FileChannel)>
	//   22   42:astore_2        
		}
	//*  23   43:aload_2         
	//*  24   44:areturn         
		catch(MapFailedException mapfailedexception)
	//*  25   45:astore_2        
		{
			return ((RandomAccessSource) (new RAFRandomAccessSource(randomaccessfile)));
	//   26   46:new             #64  <Class RAFRandomAccessSource>
	//   27   49:dup             
	//   28   50:aload_1         
	//   29   51:invokespecial   #67  <Method void RAFRandomAccessSource(RandomAccessFile)>
	//   30   54:areturn         
		}
		return randomaccesssource;
	}

	public RandomAccessSource createBestSource(String s)
		throws IOException
	{
		Object obj = ((Object) (new File(s)));
	//    0    0:new             #84  <Class File>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #85  <Method void File(String)>
	//    4    8:astore_2        
		if(!((File) (obj)).canRead())
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #89  <Method boolean File.canRead()>
	//*   7   13:ifne            98
			if(s.startsWith("file:/") || s.startsWith("http://") || s.startsWith("https://") || s.startsWith("jar:") || s.startsWith("wsjar:") || s.startsWith("wsjar:") || s.startsWith("vfszip:"))
	//*   8   16:aload_1         
	//*   9   17:ldc1            #91  <String "file:/">
	//*  10   19:invokevirtual   #97  <Method boolean String.startsWith(String)>
	//*  11   22:ifne            79
	//*  12   25:aload_1         
	//*  13   26:ldc1            #99  <String "http://">
	//*  14   28:invokevirtual   #97  <Method boolean String.startsWith(String)>
	//*  15   31:ifne            79
	//*  16   34:aload_1         
	//*  17   35:ldc1            #101 <String "https://">
	//*  18   37:invokevirtual   #97  <Method boolean String.startsWith(String)>
	//*  19   40:ifne            79
	//*  20   43:aload_1         
	//*  21   44:ldc1            #103 <String "jar:">
	//*  22   46:invokevirtual   #97  <Method boolean String.startsWith(String)>
	//*  23   49:ifne            79
	//*  24   52:aload_1         
	//*  25   53:ldc1            #105 <String "wsjar:">
	//*  26   55:invokevirtual   #97  <Method boolean String.startsWith(String)>
	//*  27   58:ifne            79
	//*  28   61:aload_1         
	//*  29   62:ldc1            #105 <String "wsjar:">
	//*  30   64:invokevirtual   #97  <Method boolean String.startsWith(String)>
	//*  31   67:ifne            79
	//*  32   70:aload_1         
	//*  33   71:ldc1            #107 <String "vfszip:">
	//*  34   73:invokevirtual   #97  <Method boolean String.startsWith(String)>
	//*  35   76:ifeq            92
				return createSource(new URL(s));
	//   36   79:aload_0         
	//   37   80:new             #109 <Class URL>
	//   38   83:dup             
	//   39   84:aload_1         
	//   40   85:invokespecial   #110 <Method void URL(String)>
	//   41   88:invokevirtual   #114 <Method RandomAccessSource createSource(URL)>
	//   42   91:areturn         
			else
				return createByReadingToMemory(s);
	//   43   92:aload_0         
	//   44   93:aload_1         
	//   45   94:invokespecial   #116 <Method RandomAccessSource createByReadingToMemory(String)>
	//   46   97:areturn         
		if(forceRead)
	//*  47   98:aload_0         
	//*  48   99:getfield        #14  <Field boolean forceRead>
	//*  49  102:ifeq            118
			return createByReadingToMemory(((InputStream) (new FileInputStream(s))));
	//   50  105:aload_0         
	//   51  106:new             #118 <Class FileInputStream>
	//   52  109:dup             
	//   53  110:aload_1         
	//   54  111:invokespecial   #119 <Method void FileInputStream(String)>
	//   55  114:invokespecial   #58  <Method RandomAccessSource createByReadingToMemory(InputStream)>
	//   56  117:areturn         
		if(exclusivelyLockFile)
	//*  57  118:aload_0         
	//*  58  119:getfield        #18  <Field boolean exclusivelyLockFile>
	//*  59  122:ifeq            161
			s = "rw";
	//   60  125:ldc1            #121 <String "rw">
	//   61  127:astore_1        
		else
	//*  62  128:new             #69  <Class RandomAccessFile>
	//*  63  131:dup             
	//*  64  132:aload_2         
	//*  65  133:aload_1         
	//*  66  134:invokespecial   #124 <Method void RandomAccessFile(File, String)>
	//*  67  137:astore_1        
	//*  68  138:aload_0         
	//*  69  139:getfield        #18  <Field boolean exclusivelyLockFile>
	//*  70  142:ifeq            153
	//*  71  145:aload_1         
	//*  72  146:invokevirtual   #77  <Method FileChannel RandomAccessFile.getChannel()>
	//*  73  149:invokevirtual   #130 <Method java.nio.channels.FileLock FileChannel.lock()>
	//*  74  152:pop             
	//*  75  153:aload_0         
	//*  76  154:aload_1         
	//*  77  155:invokevirtual   #132 <Method RandomAccessSource createBestSource(RandomAccessFile)>
	//*  78  158:astore_2        
	//*  79  159:aload_2         
	//*  80  160:areturn         
			s = "r";
	//   81  161:ldc1            #134 <String "r">
	//   82  163:astore_1        
		s = ((String) (new RandomAccessFile(((File) (obj)), s)));
		if(exclusivelyLockFile)
			((RandomAccessFile) (s)).getChannel().lock();
		try
		{
			obj = ((Object) (createBestSource(((RandomAccessFile) (s)))));
		}
	//*  83  164:goto            128
		catch(Object obj1)
	//*  84  167:astore_2        
		{
			try
			{
				((RandomAccessFile) (s)).close();
	//   85  168:aload_1         
	//   86  169:invokevirtual   #135 <Method void RandomAccessFile.close()>
			}
	//*  87  172:aload_2         
	//*  88  173:athrow          
	//*  89  174:astore_2        
	//*  90  175:aload_1         
	//*  91  176:invokevirtual   #135 <Method void RandomAccessFile.close()>
	//*  92  179:aload_2         
	//*  93  180:athrow          
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//   94  181:astore_1        
			throw obj1;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1)
		{
			try
			{
				((RandomAccessFile) (s)).close();
			}
	//*  95  182:goto            172
			// Misplaced declaration of an exception variable
			catch(String s) { }
	//   96  185:astore_1        
			throw obj1;
		}
		return ((RandomAccessSource) (obj));
	//*  97  186:goto            179
	}

	public RandomAccessSource createBestSource(FileChannel filechannel)
		throws IOException
	{
		if(filechannel.size() <= 0x4000000L)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #138 <Method long FileChannel.size()>
	//*   2    4:ldc2w           #139 <Long 0x4000000L>
	//*   3    7:lcmp            
	//*   4    8:ifgt            27
			return ((RandomAccessSource) (new GetBufferedRandomAccessSource(((RandomAccessSource) (new FileChannelRandomAccessSource(filechannel))))));
	//    5   11:new             #142 <Class GetBufferedRandomAccessSource>
	//    6   14:dup             
	//    7   15:new             #144 <Class FileChannelRandomAccessSource>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #147 <Method void FileChannelRandomAccessSource(FileChannel)>
	//   11   23:invokespecial   #150 <Method void GetBufferedRandomAccessSource(RandomAccessSource)>
	//   12   26:areturn         
		else
			return ((RandomAccessSource) (new GetBufferedRandomAccessSource(((RandomAccessSource) (new PagedChannelRandomAccessSource(filechannel))))));
	//   13   27:new             #142 <Class GetBufferedRandomAccessSource>
	//   14   30:dup             
	//   15   31:new             #152 <Class PagedChannelRandomAccessSource>
	//   16   34:dup             
	//   17   35:aload_1         
	//   18   36:invokespecial   #153 <Method void PagedChannelRandomAccessSource(FileChannel)>
	//   19   39:invokespecial   #150 <Method void GetBufferedRandomAccessSource(RandomAccessSource)>
	//   20   42:areturn         
	}

	public RandomAccessSource createRanged(RandomAccessSource randomaccesssource, long al[])
		throws IOException
	{
		RandomAccessSource arandomaccesssource[] = new RandomAccessSource[al.length / 2];
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:iconst_2        
	//    3    3:idiv            
	//    4    4:anewarray       RandomAccessSource[]
	//    5    7:astore          4
		for(int i = 0; i < al.length; i += 2)
	//*   6    9:iconst_0        
	//*   7   10:istore_3        
	//*   8   11:iload_3         
	//*   9   12:aload_2         
	//*  10   13:arraylength     
	//*  11   14:icmpge          46
			arandomaccesssource[i / 2] = ((RandomAccessSource) (new WindowRandomAccessSource(randomaccesssource, al[i], al[i + 1])));
	//   12   17:aload           4
	//   13   19:iload_3         
	//   14   20:iconst_2        
	//   15   21:idiv            
	//   16   22:new             #159 <Class WindowRandomAccessSource>
	//   17   25:dup             
	//   18   26:aload_1         
	//   19   27:aload_2         
	//   20   28:iload_3         
	//   21   29:laload          
	//   22   30:aload_2         
	//   23   31:iload_3         
	//   24   32:iconst_1        
	//   25   33:iadd            
	//   26   34:laload          
	//   27   35:invokespecial   #162 <Method void WindowRandomAccessSource(RandomAccessSource, long, long)>
	//   28   38:aastore         

	//   29   39:iload_3         
	//   30   40:iconst_2        
	//   31   41:iadd            
	//   32   42:istore_3        
	//*  33   43:goto            11
		return ((RandomAccessSource) (new GroupedRandomAccessSource(arandomaccesssource)));
	//   34   46:new             #164 <Class GroupedRandomAccessSource>
	//   35   49:dup             
	//   36   50:aload           4
	//   37   52:invokespecial   #167 <Method void GroupedRandomAccessSource(RandomAccessSource[])>
	//   38   55:areturn         
	}

	public RandomAccessSource createSource(InputStream inputstream)
		throws IOException
	{
		Object obj = ((Object) (createSource(StreamUtil.inputStreamToArray(inputstream))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #31  <Method byte[] StreamUtil.inputStreamToArray(InputStream)>
	//    3    5:invokevirtual   #170 <Method RandomAccessSource createSource(byte[])>
	//    4    8:astore_2        
		try
		{
			inputstream.close();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #39  <Method void InputStream.close()>
		}
	//*   7   13:aload_2         
	//*   8   14:areturn         
	//*   9   15:astore_2        
	//*  10   16:aload_1         
	//*  11   17:invokevirtual   #39  <Method void InputStream.close()>
	//*  12   20:aload_2         
	//*  13   21:athrow          
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  14   22:astore_1        
		{
			return ((RandomAccessSource) (obj));
	//   15   23:aload_2         
	//   16   24:areturn         
		}
		return ((RandomAccessSource) (obj));
		obj;
		try
		{
			inputstream.close();
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream) { }
	//   17   25:astore_1        
		throw obj;
	//*  18   26:goto            20
	}

	public RandomAccessSource createSource(RandomAccessFile randomaccessfile)
		throws IOException
	{
		return ((RandomAccessSource) (new RAFRandomAccessSource(randomaccessfile)));
	//    0    0:new             #64  <Class RAFRandomAccessSource>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #67  <Method void RAFRandomAccessSource(RandomAccessFile)>
	//    4    8:areturn         
	}

	public RandomAccessSource createSource(URL url)
		throws IOException
	{
		url = ((URL) (url.openStream()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #174 <Method InputStream URL.openStream()>
	//    2    4:astore_1        
		Object obj = ((Object) (createSource(((InputStream) (url)))));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #176 <Method RandomAccessSource createSource(InputStream)>
	//    6   10:astore_2        
		try
		{
			((InputStream) (url)).close();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #39  <Method void InputStream.close()>
		}
	//*   9   15:aload_2         
	//*  10   16:areturn         
	//*  11   17:astore_2        
	//*  12   18:aload_1         
	//*  13   19:invokevirtual   #39  <Method void InputStream.close()>
	//*  14   22:aload_2         
	//*  15   23:athrow          
		// Misplaced declaration of an exception variable
		catch(URL url)
	//*  16   24:astore_1        
		{
			return ((RandomAccessSource) (obj));
	//   17   25:aload_2         
	//   18   26:areturn         
		}
		return ((RandomAccessSource) (obj));
		obj;
		try
		{
			((InputStream) (url)).close();
		}
		// Misplaced declaration of an exception variable
		catch(URL url) { }
	//   19   27:astore_1        
		throw obj;
	//*  20   28:goto            22
	}

	public RandomAccessSource createSource(byte abyte0[])
	{
		return ((RandomAccessSource) (new ArrayRandomAccessSource(abyte0)));
	//    0    0:new             #25  <Class ArrayRandomAccessSource>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #34  <Method void ArrayRandomAccessSource(byte[])>
	//    4    8:areturn         
	}

	public RandomAccessSourceFactory setExclusivelyLockFile(boolean flag)
	{
		exclusivelyLockFile = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #18  <Field boolean exclusivelyLockFile>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RandomAccessSourceFactory setForceRead(boolean flag)
	{
		forceRead = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #14  <Field boolean forceRead>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public RandomAccessSourceFactory setUsePlainRandomAccess(boolean flag)
	{
		usePlainRandomAccess = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #16  <Field boolean usePlainRandomAccess>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean exclusivelyLockFile;
	private boolean forceRead;
	private boolean usePlainRandomAccess;
}
