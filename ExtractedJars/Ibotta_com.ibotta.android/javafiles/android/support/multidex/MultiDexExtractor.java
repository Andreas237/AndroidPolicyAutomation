// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.*;
import java.util.zip.*;

// Referenced classes of package android.support.multidex:
//			ZipUtil

final class MultiDexExtractor
	implements Closeable
{
	private static class ExtractedDex extends File
	{

		public long crc;

		public ExtractedDex(File file, String s)
		{
			super(file, s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #13  <Method void File(File, String)>
			crc = -1L;
		//    4    6:aload_0         
		//    5    7:ldc2w           #14  <Long -1L>
		//    6   10:putfield        #17  <Field long crc>
		//    7   13:return          
		}
	}


	MultiDexExtractor(File file, File file1)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #35  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #36  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("MultiDexExtractor(");
	//    6   12:aload_3         
	//    7   13:ldc1            #38  <String "MultiDexExtractor(">
	//    8   15:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(file.getPath());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #48  <Method String File.getPath()>
	//   13   24:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append(", ");
	//   15   28:aload_3         
	//   16   29:ldc1            #50  <String ", ">
	//   17   31:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(file1.getPath());
	//   19   35:aload_3         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #48  <Method String File.getPath()>
	//   22   40:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(")");
	//   24   44:aload_3         
	//   25   45:ldc1            #52  <String ")">
	//   26   47:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		Log.i("MultiDex", stringbuilder.toString());
	//   28   51:ldc1            #54  <String "MultiDex">
	//   29   53:aload_3         
	//   30   54:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   31   57:invokestatic    #63  <Method int Log.i(String, String)>
	//   32   60:pop             
		sourceApk = file;
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:putfield        #65  <Field File sourceApk>
		dexDir = file1;
	//   36   66:aload_0         
	//   37   67:aload_2         
	//   38   68:putfield        #67  <Field File dexDir>
		sourceCrc = getZipCrc(file);
	//   39   71:aload_0         
	//   40   72:aload_1         
	//   41   73:invokestatic    #71  <Method long getZipCrc(File)>
	//   42   76:putfield        #73  <Field long sourceCrc>
		file = new File(file1, "MultiDex.lock");
	//   43   79:new             #44  <Class File>
	//   44   82:dup             
	//   45   83:aload_2         
	//   46   84:ldc1            #75  <String "MultiDex.lock">
	//   47   86:invokespecial   #78  <Method void File(File, String)>
	//   48   89:astore_1        
		lockRaf = new RandomAccessFile(file, "rw");
	//   49   90:aload_0         
	//   50   91:new             #80  <Class RandomAccessFile>
	//   51   94:dup             
	//   52   95:aload_1         
	//   53   96:ldc1            #82  <String "rw">
	//   54   98:invokespecial   #83  <Method void RandomAccessFile(File, String)>
	//   55  101:putfield        #85  <Field RandomAccessFile lockRaf>
		lockChannel = lockRaf.getChannel();
	//   56  104:aload_0         
	//   57  105:aload_0         
	//   58  106:getfield        #85  <Field RandomAccessFile lockRaf>
	//   59  109:invokevirtual   #89  <Method FileChannel RandomAccessFile.getChannel()>
	//   60  112:putfield        #91  <Field FileChannel lockChannel>
		try
		{
			file1 = ((File) (new StringBuilder()));
	//   61  115:new             #35  <Class StringBuilder>
	//   62  118:dup             
	//   63  119:invokespecial   #36  <Method void StringBuilder()>
	//   64  122:astore_2        
			((StringBuilder) (file1)).append("Blocking on lock ");
	//   65  123:aload_2         
	//   66  124:ldc1            #93  <String "Blocking on lock ">
	//   67  126:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   68  129:pop             
			((StringBuilder) (file1)).append(file.getPath());
	//   69  130:aload_2         
	//   70  131:aload_1         
	//   71  132:invokevirtual   #48  <Method String File.getPath()>
	//   72  135:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   73  138:pop             
			Log.i("MultiDex", ((StringBuilder) (file1)).toString());
	//   74  139:ldc1            #54  <String "MultiDex">
	//   75  141:aload_2         
	//   76  142:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   77  145:invokestatic    #63  <Method int Log.i(String, String)>
	//   78  148:pop             
			cacheLock = lockChannel.lock();
	//   79  149:aload_0         
	//   80  150:aload_0         
	//   81  151:getfield        #91  <Field FileChannel lockChannel>
	//   82  154:invokevirtual   #99  <Method FileLock FileChannel.lock()>
	//   83  157:putfield        #101 <Field FileLock cacheLock>
			break MISSING_BLOCK_LABEL_160;
		}
	//*  84  160:new             #35  <Class StringBuilder>
	//*  85  163:dup             
	//*  86  164:invokespecial   #36  <Method void StringBuilder()>
	//*  87  167:astore_2        
	//*  88  168:aload_2         
	//*  89  169:aload_1         
	//*  90  170:invokevirtual   #48  <Method String File.getPath()>
	//*  91  173:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  92  176:pop             
	//*  93  177:aload_2         
	//*  94  178:ldc1            #103 <String " locked">
	//*  95  180:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  96  183:pop             
	//*  97  184:ldc1            #54  <String "MultiDex">
	//*  98  186:aload_2         
	//*  99  187:invokevirtual   #57  <Method String StringBuilder.toString()>
	//* 100  190:invokestatic    #63  <Method int Log.i(String, String)>
	//* 101  193:pop             
	//* 102  194:return          
	//* 103  195:aload_0         
	//* 104  196:getfield        #91  <Field FileChannel lockChannel>
	//* 105  199:invokestatic    #107 <Method void closeQuietly(Closeable)>
	//* 106  202:aload_1         
	//* 107  203:athrow          
	//* 108  204:astore_1        
	//* 109  205:goto            213
	//* 110  208:astore_1        
	//* 111  209:goto            213
	//* 112  212:astore_1        
	//* 113  213:aload_0         
	//* 114  214:getfield        #85  <Field RandomAccessFile lockRaf>
	//* 115  217:invokestatic    #107 <Method void closeQuietly(Closeable)>
	//* 116  220:aload_1         
	//* 117  221:athrow          
	//* 118  222:astore_1        
	//* 119  223:goto            195
	//* 120  226:astore_1        
	//* 121  227:goto            195
		// Misplaced declaration of an exception variable
		catch(File file) { }
	//  122  230:astore_1        
		// Misplaced declaration of an exception variable
		catch(File file) { }
		// Misplaced declaration of an exception variable
		catch(File file) { }
		closeQuietly(((Closeable) (lockChannel)));
		throw file;
		try
		{
			file1 = ((File) (new StringBuilder()));
			((StringBuilder) (file1)).append(file.getPath());
			((StringBuilder) (file1)).append(" locked");
			Log.i("MultiDex", ((StringBuilder) (file1)).toString());
			return;
		}
		// Misplaced declaration of an exception variable
		catch(File file) { }
		// Misplaced declaration of an exception variable
		catch(File file) { }
		// Misplaced declaration of an exception variable
		catch(File file) { }
		closeQuietly(((Closeable) (lockRaf)));
		throw file;
	//* 123  231:goto            195
	}

	private void clearDexDir()
	{
		Object obj = ((Object) (dexDir.listFiles(new FileFilter() {

			public boolean accept(File file1)
			{
				return file1.getName().equals("MultiDex.lock") ^ true;
			//    0    0:aload_1         
			//    1    1:invokevirtual   #28  <Method String File.getName()>
			//    2    4:ldc1            #30  <String "MultiDex.lock">
			//    3    6:invokevirtual   #36  <Method boolean String.equals(Object)>
			//    4    9:iconst_1        
			//    5   10:ixor            
			//    6   11:ireturn         
			}

			final MultiDexExtractor this$0;

			
			{
				this$0 = MultiDexExtractor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MultiDexExtractor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field File dexDir>
	//    2    4:new             #8   <Class MultiDexExtractor$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #113 <Method void MultiDexExtractor$1(MultiDexExtractor)>
	//    6   12:invokevirtual   #117 <Method File[] File.listFiles(FileFilter)>
	//    7   15:astore_3        
		if(obj == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       65
		{
			obj = ((Object) (new StringBuilder()));
	//   10   20:new             #35  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #36  <Method void StringBuilder()>
	//   13   27:astore_3        
			((StringBuilder) (obj)).append("Failed to list secondary dex dir content (");
	//   14   28:aload_3         
	//   15   29:ldc1            #119 <String "Failed to list secondary dex dir content (">
	//   16   31:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			((StringBuilder) (obj)).append(dexDir.getPath());
	//   18   35:aload_3         
	//   19   36:aload_0         
	//   20   37:getfield        #67  <Field File dexDir>
	//   21   40:invokevirtual   #48  <Method String File.getPath()>
	//   22   43:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			((StringBuilder) (obj)).append(").");
	//   24   47:aload_3         
	//   25   48:ldc1            #121 <String ").">
	//   26   50:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			Log.w("MultiDex", ((StringBuilder) (obj)).toString());
	//   28   54:ldc1            #54  <String "MultiDex">
	//   29   56:aload_3         
	//   30   57:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   31   60:invokestatic    #124 <Method int Log.w(String, String)>
	//   32   63:pop             
			return;
	//   33   64:return          
		}
		int j = obj.length;
	//   34   65:aload_3         
	//   35   66:arraylength     
	//   36   67:istore_2        
		for(int i = 0; i < j; i++)
	//*  37   68:iconst_0        
	//*  38   69:istore_1        
	//*  39   70:iload_1         
	//*  40   71:iload_2         
	//*  41   72:icmpge          234
		{
			File file = ((File) (obj[i]));
	//   42   75:aload_3         
	//   43   76:iload_1         
	//   44   77:aaload          
	//   45   78:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   46   80:new             #35  <Class StringBuilder>
	//   47   83:dup             
	//   48   84:invokespecial   #36  <Method void StringBuilder()>
	//   49   87:astore          5
			stringbuilder.append("Trying to delete old file ");
	//   50   89:aload           5
	//   51   91:ldc1            #126 <String "Trying to delete old file ">
	//   52   93:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   53   96:pop             
			stringbuilder.append(file.getPath());
	//   54   97:aload           5
	//   55   99:aload           4
	//   56  101:invokevirtual   #48  <Method String File.getPath()>
	//   57  104:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   58  107:pop             
			stringbuilder.append(" of size ");
	//   59  108:aload           5
	//   60  110:ldc1            #128 <String " of size ">
	//   61  112:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   62  115:pop             
			stringbuilder.append(file.length());
	//   63  116:aload           5
	//   64  118:aload           4
	//   65  120:invokevirtual   #132 <Method long File.length()>
	//   66  123:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//   67  126:pop             
			Log.i("MultiDex", stringbuilder.toString());
	//   68  127:ldc1            #54  <String "MultiDex">
	//   69  129:aload           5
	//   70  131:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   71  134:invokestatic    #63  <Method int Log.i(String, String)>
	//   72  137:pop             
			if(!file.delete())
	//*  73  138:aload           4
	//*  74  140:invokevirtual   #139 <Method boolean File.delete()>
	//*  75  143:ifne            188
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   76  146:new             #35  <Class StringBuilder>
	//   77  149:dup             
	//   78  150:invokespecial   #36  <Method void StringBuilder()>
	//   79  153:astore          5
				stringbuilder1.append("Failed to delete old file ");
	//   80  155:aload           5
	//   81  157:ldc1            #141 <String "Failed to delete old file ">
	//   82  159:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   83  162:pop             
				stringbuilder1.append(file.getPath());
	//   84  163:aload           5
	//   85  165:aload           4
	//   86  167:invokevirtual   #48  <Method String File.getPath()>
	//   87  170:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   88  173:pop             
				Log.w("MultiDex", stringbuilder1.toString());
	//   89  174:ldc1            #54  <String "MultiDex">
	//   90  176:aload           5
	//   91  178:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   92  181:invokestatic    #124 <Method int Log.w(String, String)>
	//   93  184:pop             
			} else
	//*  94  185:goto            227
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   95  188:new             #35  <Class StringBuilder>
	//   96  191:dup             
	//   97  192:invokespecial   #36  <Method void StringBuilder()>
	//   98  195:astore          5
				stringbuilder2.append("Deleted old file ");
	//   99  197:aload           5
	//  100  199:ldc1            #143 <String "Deleted old file ">
	//  101  201:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  102  204:pop             
				stringbuilder2.append(file.getPath());
	//  103  205:aload           5
	//  104  207:aload           4
	//  105  209:invokevirtual   #48  <Method String File.getPath()>
	//  106  212:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  107  215:pop             
				Log.i("MultiDex", stringbuilder2.toString());
	//  108  216:ldc1            #54  <String "MultiDex">
	//  109  218:aload           5
	//  110  220:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  111  223:invokestatic    #63  <Method int Log.i(String, String)>
	//  112  226:pop             
			}
		}

	//  113  227:iload_1         
	//  114  228:iconst_1        
	//  115  229:iadd            
	//  116  230:istore_1        
	//* 117  231:goto            70
	//  118  234:return          
	}

	private static void closeQuietly(Closeable closeable)
	{
		try
		{
			closeable.close();
	//    0    0:aload_0         
	//    1    1:invokeinterface #146 <Method void Closeable.close()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   3    7:astore_0        
		{
			Log.w("MultiDex", "Failed to close resource", ((Throwable) (closeable)));
	//    4    8:ldc1            #54  <String "MultiDex">
	//    5   10:ldc1            #148 <String "Failed to close resource">
	//    6   12:aload_0         
	//    7   13:invokestatic    #151 <Method int Log.w(String, String, Throwable)>
	//    8   16:pop             
		}
	//    9   17:return          
	}

	private static void extract(ZipFile zipfile, ZipEntry zipentry, File file, String s)
		throws IOException, FileNotFoundException
	{
		zipfile = ((ZipFile) (zipfile.getInputStream(zipentry)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #161 <Method InputStream ZipFile.getInputStream(ZipEntry)>
	//    3    5:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #35  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #36  <Method void StringBuilder()>
	//    7   13:astore          6
		stringbuilder.append("tmp-");
	//    8   15:aload           6
	//    9   17:ldc1            #163 <String "tmp-">
	//   10   19:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(s);
	//   12   23:aload           6
	//   13   25:aload_3         
	//   14   26:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		s = ((String) (File.createTempFile(stringbuilder.toString(), ".zip", file.getParentFile())));
	//   16   30:aload           6
	//   17   32:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   18   35:ldc1            #165 <String ".zip">
	//   19   37:aload_2         
	//   20   38:invokevirtual   #169 <Method File File.getParentFile()>
	//   21   41:invokestatic    #173 <Method File File.createTempFile(String, String, File)>
	//   22   44:astore_3        
		stringbuilder = new StringBuilder();
	//   23   45:new             #35  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #36  <Method void StringBuilder()>
	//   26   52:astore          6
		stringbuilder.append("Extracting ");
	//   27   54:aload           6
	//   28   56:ldc1            #175 <String "Extracting ">
	//   29   58:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
		stringbuilder.append(((File) (s)).getPath());
	//   31   62:aload           6
	//   32   64:aload_3         
	//   33   65:invokevirtual   #48  <Method String File.getPath()>
	//   34   68:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
		Log.i("MultiDex", stringbuilder.toString());
	//   36   72:ldc1            #54  <String "MultiDex">
	//   37   74:aload           6
	//   38   76:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   39   79:invokestatic    #63  <Method int Log.i(String, String)>
	//   40   82:pop             
		ZipOutputStream zipoutputstream = new ZipOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(((File) (s)))))))));
	//   41   83:new             #177 <Class ZipOutputStream>
	//   42   86:dup             
	//   43   87:new             #179 <Class BufferedOutputStream>
	//   44   90:dup             
	//   45   91:new             #181 <Class FileOutputStream>
	//   46   94:dup             
	//   47   95:aload_3         
	//   48   96:invokespecial   #184 <Method void FileOutputStream(File)>
	//   49   99:invokespecial   #187 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   50  102:invokespecial   #188 <Method void ZipOutputStream(java.io.OutputStream)>
	//   51  105:astore          6
		int i;
		ZipEntry zipentry1 = new ZipEntry("classes.dex");
	//   52  107:new             #190 <Class ZipEntry>
	//   53  110:dup             
	//   54  111:ldc1            #192 <String "classes.dex">
	//   55  113:invokespecial   #195 <Method void ZipEntry(String)>
	//   56  116:astore          7
		zipentry1.setTime(zipentry.getTime());
	//   57  118:aload           7
	//   58  120:aload_1         
	//   59  121:invokevirtual   #198 <Method long ZipEntry.getTime()>
	//   60  124:invokevirtual   #202 <Method void ZipEntry.setTime(long)>
		zipoutputstream.putNextEntry(zipentry1);
	//   61  127:aload           6
	//   62  129:aload           7
	//   63  131:invokevirtual   #206 <Method void ZipOutputStream.putNextEntry(ZipEntry)>
		zipentry = ((ZipEntry) (new byte[16384]));
	//   64  134:sipush          16384
	//   65  137:newarray        byte[]
	//   66  139:astore_1        
		i = ((InputStream) (zipfile)).read(((byte []) (zipentry)));
	//   67  140:aload_0         
	//   68  141:aload_1         
	//   69  142:invokevirtual   #212 <Method int InputStream.read(byte[])>
	//   70  145:istore          4
_L1:
		if(i == -1)
			break MISSING_BLOCK_LABEL_172;
	//   71  147:iload           4
	//   72  149:iconst_m1       
	//   73  150:icmpeq          172
		zipoutputstream.write(((byte []) (zipentry)), 0, i);
	//   74  153:aload           6
	//   75  155:aload_1         
	//   76  156:iconst_0        
	//   77  157:iload           4
	//   78  159:invokevirtual   #216 <Method void ZipOutputStream.write(byte[], int, int)>
		i = ((InputStream) (zipfile)).read(((byte []) (zipentry)));
	//   79  162:aload_0         
	//   80  163:aload_1         
	//   81  164:invokevirtual   #212 <Method int InputStream.read(byte[])>
	//   82  167:istore          4
		  goto _L1
	//*  83  169:goto            147
		zipoutputstream.closeEntry();
	//   84  172:aload           6
	//   85  174:invokevirtual   #219 <Method void ZipOutputStream.closeEntry()>
		boolean flag;
		zipoutputstream.close();
	//   86  177:aload           6
	//   87  179:invokevirtual   #220 <Method void ZipOutputStream.close()>
		if(!((File) (s)).setReadOnly())
			break MISSING_BLOCK_LABEL_304;
	//   88  182:aload_3         
	//   89  183:invokevirtual   #223 <Method boolean File.setReadOnly()>
	//   90  186:ifeq            304
		zipentry = ((ZipEntry) (new StringBuilder()));
	//   91  189:new             #35  <Class StringBuilder>
	//   92  192:dup             
	//   93  193:invokespecial   #36  <Method void StringBuilder()>
	//   94  196:astore_1        
		((StringBuilder) (zipentry)).append("Renaming to ");
	//   95  197:aload_1         
	//   96  198:ldc1            #225 <String "Renaming to ">
	//   97  200:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   98  203:pop             
		((StringBuilder) (zipentry)).append(file.getPath());
	//   99  204:aload_1         
	//  100  205:aload_2         
	//  101  206:invokevirtual   #48  <Method String File.getPath()>
	//  102  209:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  103  212:pop             
		Log.i("MultiDex", ((StringBuilder) (zipentry)).toString());
	//  104  213:ldc1            #54  <String "MultiDex">
	//  105  215:aload_1         
	//  106  216:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  107  219:invokestatic    #63  <Method int Log.i(String, String)>
	//  108  222:pop             
		flag = ((File) (s)).renameTo(file);
	//  109  223:aload_3         
	//  110  224:aload_2         
	//  111  225:invokevirtual   #229 <Method boolean File.renameTo(File)>
	//  112  228:istore          5
		if(flag)
	//* 113  230:iload           5
	//* 114  232:ifeq            245
		{
			closeQuietly(((Closeable) (zipfile)));
	//  115  235:aload_0         
	//  116  236:invokestatic    #107 <Method void closeQuietly(Closeable)>
			((File) (s)).delete();
	//  117  239:aload_3         
	//  118  240:invokevirtual   #139 <Method boolean File.delete()>
	//  119  243:pop             
			return;
	//  120  244:return          
		}
		zipentry = ((ZipEntry) (new StringBuilder()));
	//  121  245:new             #35  <Class StringBuilder>
	//  122  248:dup             
	//  123  249:invokespecial   #36  <Method void StringBuilder()>
	//  124  252:astore_1        
		((StringBuilder) (zipentry)).append("Failed to rename \"");
	//  125  253:aload_1         
	//  126  254:ldc1            #231 <String "Failed to rename \"">
	//  127  256:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  128  259:pop             
		((StringBuilder) (zipentry)).append(((File) (s)).getAbsolutePath());
	//  129  260:aload_1         
	//  130  261:aload_3         
	//  131  262:invokevirtual   #234 <Method String File.getAbsolutePath()>
	//  132  265:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  133  268:pop             
		((StringBuilder) (zipentry)).append("\" to \"");
	//  134  269:aload_1         
	//  135  270:ldc1            #236 <String "\" to \"">
	//  136  272:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  137  275:pop             
		((StringBuilder) (zipentry)).append(file.getAbsolutePath());
	//  138  276:aload_1         
	//  139  277:aload_2         
	//  140  278:invokevirtual   #234 <Method String File.getAbsolutePath()>
	//  141  281:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  142  284:pop             
		((StringBuilder) (zipentry)).append("\"");
	//  143  285:aload_1         
	//  144  286:ldc1            #238 <String "\"">
	//  145  288:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  146  291:pop             
		throw new IOException(((StringBuilder) (zipentry)).toString());
	//  147  292:new             #26  <Class IOException>
	//  148  295:dup             
	//  149  296:aload_1         
	//  150  297:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  151  300:invokespecial   #239 <Method void IOException(String)>
	//  152  303:athrow          
		zipentry = ((ZipEntry) (new StringBuilder()));
	//  153  304:new             #35  <Class StringBuilder>
	//  154  307:dup             
	//  155  308:invokespecial   #36  <Method void StringBuilder()>
	//  156  311:astore_1        
		((StringBuilder) (zipentry)).append("Failed to mark readonly \"");
	//  157  312:aload_1         
	//  158  313:ldc1            #241 <String "Failed to mark readonly \"">
	//  159  315:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  160  318:pop             
		((StringBuilder) (zipentry)).append(((File) (s)).getAbsolutePath());
	//  161  319:aload_1         
	//  162  320:aload_3         
	//  163  321:invokevirtual   #234 <Method String File.getAbsolutePath()>
	//  164  324:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  165  327:pop             
		((StringBuilder) (zipentry)).append("\" (tmp of \"");
	//  166  328:aload_1         
	//  167  329:ldc1            #243 <String "\" (tmp of \"">
	//  168  331:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  169  334:pop             
		((StringBuilder) (zipentry)).append(file.getAbsolutePath());
	//  170  335:aload_1         
	//  171  336:aload_2         
	//  172  337:invokevirtual   #234 <Method String File.getAbsolutePath()>
	//  173  340:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  174  343:pop             
		((StringBuilder) (zipentry)).append("\")");
	//  175  344:aload_1         
	//  176  345:ldc1            #245 <String "\")">
	//  177  347:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  178  350:pop             
		throw new IOException(((StringBuilder) (zipentry)).toString());
	//  179  351:new             #26  <Class IOException>
	//  180  354:dup             
	//  181  355:aload_1         
	//  182  356:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  183  359:invokespecial   #239 <Method void IOException(String)>
	//  184  362:athrow          
		zipentry;
	//  185  363:astore_1        
		zipoutputstream.close();
	//  186  364:aload           6
	//  187  366:invokevirtual   #220 <Method void ZipOutputStream.close()>
		throw zipentry;
	//  188  369:aload_1         
	//  189  370:athrow          
		zipentry;
	//  190  371:astore_1        
		closeQuietly(((Closeable) (zipfile)));
	//  191  372:aload_0         
	//  192  373:invokestatic    #107 <Method void closeQuietly(Closeable)>
		((File) (s)).delete();
	//  193  376:aload_3         
	//  194  377:invokevirtual   #139 <Method boolean File.delete()>
	//  195  380:pop             
		throw zipentry;
	//  196  381:aload_1         
	//  197  382:athrow          
	}

	private static SharedPreferences getMultiDexPreferences(Context context)
	{
		byte byte0;
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #253 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          13
			byte0 = 0;
	//    3    8:iconst_0        
	//    4    9:istore_1        
		else
	//*   5   10:goto            15
			byte0 = 4;
	//    6   13:iconst_4        
	//    7   14:istore_1        
		return context.getSharedPreferences("multidex.version", ((int) (byte0)));
	//    8   15:aload_0         
	//    9   16:ldc1            #255 <String "multidex.version">
	//   10   18:iload_1         
	//   11   19:invokevirtual   #261 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   22:areturn         
	}

	private static long getTimeStamp(File file)
	{
		long l1 = file.lastModified();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #265 <Method long File.lastModified()>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 == -1L)
	//*   5    7:lload_3         
	//*   6    8:ldc2w           #266 <Long -1L>
	//*   7   11:lcmp            
	//*   8   12:ifne            19
			l = l1 - 1L;
	//    9   15:lload_3         
	//   10   16:lconst_1        
	//   11   17:lsub            
	//   12   18:lstore_1        
		return l;
	//   13   19:lload_1         
	//   14   20:lreturn         
	}

	private static long getZipCrc(File file)
		throws IOException
	{
		long l1 = ZipUtil.getZipCrc(file);
	//    0    0:aload_0         
	//    1    1:invokestatic    #270 <Method long ZipUtil.getZipCrc(File)>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 == -1L)
	//*   5    7:lload_3         
	//*   6    8:ldc2w           #266 <Long -1L>
	//*   7   11:lcmp            
	//*   8   12:ifne            19
			l = l1 - 1L;
	//    9   15:lload_3         
	//   10   16:lconst_1        
	//   11   17:lsub            
	//   12   18:lstore_1        
		return l;
	//   13   19:lload_1         
	//   14   20:lreturn         
	}

	private static boolean isModified(Context context, File file, long l, String s)
	{
		context = ((Context) (getMultiDexPreferences(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #274 <Method SharedPreferences getMultiDexPreferences(Context)>
	//    2    4:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #35  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void StringBuilder()>
	//    6   12:astore          5
		stringbuilder.append(s);
	//    7   14:aload           5
	//    8   16:aload           4
	//    9   18:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		stringbuilder.append("timestamp");
	//   11   22:aload           5
	//   12   24:ldc2            #276 <String "timestamp">
	//   13   27:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		if(((SharedPreferences) (context)).getLong(stringbuilder.toString(), -1L) == getTimeStamp(file))
	//*  15   31:aload_0         
	//*  16   32:aload           5
	//*  17   34:invokevirtual   #57  <Method String StringBuilder.toString()>
	//*  18   37:ldc2w           #266 <Long -1L>
	//*  19   40:invokeinterface #282 <Method long SharedPreferences.getLong(String, long)>
	//*  20   45:aload_1         
	//*  21   46:invokestatic    #284 <Method long getTimeStamp(File)>
	//*  22   49:lcmp            
	//*  23   50:ifne            99
		{
			file = ((File) (new StringBuilder()));
	//   24   53:new             #35  <Class StringBuilder>
	//   25   56:dup             
	//   26   57:invokespecial   #36  <Method void StringBuilder()>
	//   27   60:astore_1        
			((StringBuilder) (file)).append(s);
	//   28   61:aload_1         
	//   29   62:aload           4
	//   30   64:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   31   67:pop             
			((StringBuilder) (file)).append("crc");
	//   32   68:aload_1         
	//   33   69:ldc2            #286 <String "crc">
	//   34   72:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   35   75:pop             
			if(((SharedPreferences) (context)).getLong(((StringBuilder) (file)).toString(), -1L) == l)
	//*  36   76:aload_0         
	//*  37   77:aload_1         
	//*  38   78:invokevirtual   #57  <Method String StringBuilder.toString()>
	//*  39   81:ldc2w           #266 <Long -1L>
	//*  40   84:invokeinterface #282 <Method long SharedPreferences.getLong(String, long)>
	//*  41   89:lload_2         
	//*  42   90:lcmp            
	//*  43   91:ifeq            97
	//*  44   94:goto            99
				return false;
	//   45   97:iconst_0        
	//   46   98:ireturn         
		}
		return true;
	//   47   99:iconst_1        
	//   48  100:ireturn         
	}

	private List loadExistingExtractions(Context context, String s)
		throws IOException
	{
		Log.i("MultiDex", "loading existing secondary dex files");
	//    0    0:ldc1            #54  <String "MultiDex">
	//    1    2:ldc2            #290 <String "loading existing secondary dex files">
	//    2    5:invokestatic    #63  <Method int Log.i(String, String)>
	//    3    8:pop             
		Object obj = ((Object) (new StringBuilder()));
	//    4    9:new             #35  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #36  <Method void StringBuilder()>
	//    7   16:astore          11
		((StringBuilder) (obj)).append(sourceApk.getName());
	//    8   18:aload           11
	//    9   20:aload_0         
	//   10   21:getfield        #65  <Field File sourceApk>
	//   11   24:invokevirtual   #293 <Method String File.getName()>
	//   12   27:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:pop             
		((StringBuilder) (obj)).append(".classes");
	//   14   31:aload           11
	//   15   33:ldc2            #295 <String ".classes">
	//   16   36:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
		String s1 = ((StringBuilder) (obj)).toString();
	//   18   40:aload           11
	//   19   42:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   20   45:astore          12
		obj = ((Object) (getMultiDexPreferences(context)));
	//   21   47:aload_1         
	//   22   48:invokestatic    #274 <Method SharedPreferences getMultiDexPreferences(Context)>
	//   23   51:astore          11
		context = ((Context) (new StringBuilder()));
	//   24   53:new             #35  <Class StringBuilder>
	//   25   56:dup             
	//   26   57:invokespecial   #36  <Method void StringBuilder()>
	//   27   60:astore_1        
		((StringBuilder) (context)).append(s);
	//   28   61:aload_1         
	//   29   62:aload_2         
	//   30   63:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   31   66:pop             
		((StringBuilder) (context)).append("dex.number");
	//   32   67:aload_1         
	//   33   68:ldc2            #297 <String "dex.number">
	//   34   71:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
		int j = ((SharedPreferences) (obj)).getInt(((StringBuilder) (context)).toString(), 1);
	//   36   75:aload           11
	//   37   77:aload_1         
	//   38   78:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   39   81:iconst_1        
	//   40   82:invokeinterface #301 <Method int SharedPreferences.getInt(String, int)>
	//   41   87:istore          4
		ArrayList arraylist = new ArrayList(j - 1);
	//   42   89:new             #303 <Class ArrayList>
	//   43   92:dup             
	//   44   93:iload           4
	//   45   95:iconst_1        
	//   46   96:isub            
	//   47   97:invokespecial   #306 <Method void ArrayList(int)>
	//   48  100:astore          13
		int i = 2;
	//   49  102:iconst_2        
	//   50  103:istore_3        
		context = ((Context) (s1));
	//   51  104:aload           12
	//   52  106:astore_1        
		while(i <= j) 
	//*  53  107:iload_3         
	//*  54  108:iload           4
	//*  55  110:icmpgt          483
		{
			Object obj1 = ((Object) (new StringBuilder()));
	//   56  113:new             #35  <Class StringBuilder>
	//   57  116:dup             
	//   58  117:invokespecial   #36  <Method void StringBuilder()>
	//   59  120:astore          12
			((StringBuilder) (obj1)).append(((String) (context)));
	//   60  122:aload           12
	//   61  124:aload_1         
	//   62  125:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   63  128:pop             
			((StringBuilder) (obj1)).append(i);
	//   64  129:aload           12
	//   65  131:iload_3         
	//   66  132:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//   67  135:pop             
			((StringBuilder) (obj1)).append(".zip");
	//   68  136:aload           12
	//   69  138:ldc1            #165 <String ".zip">
	//   70  140:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   71  143:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   72  144:aload           12
	//   73  146:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   74  149:astore          12
			obj1 = ((Object) (new ExtractedDex(dexDir, ((String) (obj1)))));
	//   75  151:new             #10  <Class MultiDexExtractor$ExtractedDex>
	//   76  154:dup             
	//   77  155:aload_0         
	//   78  156:getfield        #67  <Field File dexDir>
	//   79  159:aload           12
	//   80  161:invokespecial   #310 <Method void MultiDexExtractor$ExtractedDex(File, String)>
	//   81  164:astore          12
			if(((ExtractedDex) (obj1)).isFile())
	//*  82  166:aload           12
	//*  83  168:invokevirtual   #313 <Method boolean MultiDexExtractor$ExtractedDex.isFile()>
	//*  84  171:ifeq            437
			{
				obj1.crc = getZipCrc(((File) (obj1)));
	//   85  174:aload           12
	//   86  176:aload           12
	//   87  178:invokestatic    #71  <Method long getZipCrc(File)>
	//   88  181:putfield        #315 <Field long MultiDexExtractor$ExtractedDex.crc>
				StringBuilder stringbuilder = new StringBuilder();
	//   89  184:new             #35  <Class StringBuilder>
	//   90  187:dup             
	//   91  188:invokespecial   #36  <Method void StringBuilder()>
	//   92  191:astore          14
				stringbuilder.append(s);
	//   93  193:aload           14
	//   94  195:aload_2         
	//   95  196:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   96  199:pop             
				stringbuilder.append("dex.crc.");
	//   97  200:aload           14
	//   98  202:ldc2            #317 <String "dex.crc.">
	//   99  205:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  100  208:pop             
				stringbuilder.append(i);
	//  101  209:aload           14
	//  102  211:iload_3         
	//  103  212:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//  104  215:pop             
				long l = ((SharedPreferences) (obj)).getLong(stringbuilder.toString(), -1L);
	//  105  216:aload           11
	//  106  218:aload           14
	//  107  220:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  108  223:ldc2w           #266 <Long -1L>
	//  109  226:invokeinterface #282 <Method long SharedPreferences.getLong(String, long)>
	//  110  231:lstore          5
				stringbuilder = new StringBuilder();
	//  111  233:new             #35  <Class StringBuilder>
	//  112  236:dup             
	//  113  237:invokespecial   #36  <Method void StringBuilder()>
	//  114  240:astore          14
				stringbuilder.append(s);
	//  115  242:aload           14
	//  116  244:aload_2         
	//  117  245:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  118  248:pop             
				stringbuilder.append("dex.time.");
	//  119  249:aload           14
	//  120  251:ldc2            #319 <String "dex.time.">
	//  121  254:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  122  257:pop             
				stringbuilder.append(i);
	//  123  258:aload           14
	//  124  260:iload_3         
	//  125  261:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//  126  264:pop             
				long l1 = ((SharedPreferences) (obj)).getLong(stringbuilder.toString(), -1L);
	//  127  265:aload           11
	//  128  267:aload           14
	//  129  269:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  130  272:ldc2w           #266 <Long -1L>
	//  131  275:invokeinterface #282 <Method long SharedPreferences.getLong(String, long)>
	//  132  280:lstore          7
				long l2 = ((ExtractedDex) (obj1)).lastModified();
	//  133  282:aload           12
	//  134  284:invokevirtual   #320 <Method long MultiDexExtractor$ExtractedDex.lastModified()>
	//  135  287:lstore          9
				if(l1 == l2 && l == ((ExtractedDex) (obj1)).crc)
	//* 136  289:lload           7
	//* 137  291:lload           9
	//* 138  293:lcmp            
	//* 139  294:ifne            325
	//* 140  297:lload           5
	//* 141  299:aload           12
	//* 142  301:getfield        #315 <Field long MultiDexExtractor$ExtractedDex.crc>
	//* 143  304:lcmp            
	//* 144  305:ifne            325
				{
					((List) (arraylist)).add(obj1);
	//  145  308:aload           13
	//  146  310:aload           12
	//  147  312:invokeinterface #326 <Method boolean List.add(Object)>
	//  148  317:pop             
					i++;
	//  149  318:iload_3         
	//  150  319:iconst_1        
	//  151  320:iadd            
	//  152  321:istore_3        
				} else
	//* 153  322:goto            107
				{
					context = ((Context) (new StringBuilder()));
	//  154  325:new             #35  <Class StringBuilder>
	//  155  328:dup             
	//  156  329:invokespecial   #36  <Method void StringBuilder()>
	//  157  332:astore_1        
					((StringBuilder) (context)).append("Invalid extracted dex: ");
	//  158  333:aload_1         
	//  159  334:ldc2            #328 <String "Invalid extracted dex: ">
	//  160  337:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  161  340:pop             
					((StringBuilder) (context)).append(obj1);
	//  162  341:aload_1         
	//  163  342:aload           12
	//  164  344:invokevirtual   #331 <Method StringBuilder StringBuilder.append(Object)>
	//  165  347:pop             
					((StringBuilder) (context)).append(" (key \"");
	//  166  348:aload_1         
	//  167  349:ldc2            #333 <String " (key \"">
	//  168  352:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  169  355:pop             
					((StringBuilder) (context)).append(s);
	//  170  356:aload_1         
	//  171  357:aload_2         
	//  172  358:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  173  361:pop             
					((StringBuilder) (context)).append("\"), expected modification time: ");
	//  174  362:aload_1         
	//  175  363:ldc2            #335 <String "\"), expected modification time: ">
	//  176  366:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  177  369:pop             
					((StringBuilder) (context)).append(l1);
	//  178  370:aload_1         
	//  179  371:lload           7
	//  180  373:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//  181  376:pop             
					((StringBuilder) (context)).append(", modification time: ");
	//  182  377:aload_1         
	//  183  378:ldc2            #337 <String ", modification time: ">
	//  184  381:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  185  384:pop             
					((StringBuilder) (context)).append(l2);
	//  186  385:aload_1         
	//  187  386:lload           9
	//  188  388:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//  189  391:pop             
					((StringBuilder) (context)).append(", expected crc: ");
	//  190  392:aload_1         
	//  191  393:ldc2            #339 <String ", expected crc: ">
	//  192  396:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  193  399:pop             
					((StringBuilder) (context)).append(l);
	//  194  400:aload_1         
	//  195  401:lload           5
	//  196  403:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//  197  406:pop             
					((StringBuilder) (context)).append(", file crc: ");
	//  198  407:aload_1         
	//  199  408:ldc2            #341 <String ", file crc: ">
	//  200  411:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  201  414:pop             
					((StringBuilder) (context)).append(((ExtractedDex) (obj1)).crc);
	//  202  415:aload_1         
	//  203  416:aload           12
	//  204  418:getfield        #315 <Field long MultiDexExtractor$ExtractedDex.crc>
	//  205  421:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//  206  424:pop             
					throw new IOException(((StringBuilder) (context)).toString());
	//  207  425:new             #26  <Class IOException>
	//  208  428:dup             
	//  209  429:aload_1         
	//  210  430:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  211  433:invokespecial   #239 <Method void IOException(String)>
	//  212  436:athrow          
				}
			} else
			{
				context = ((Context) (new StringBuilder()));
	//  213  437:new             #35  <Class StringBuilder>
	//  214  440:dup             
	//  215  441:invokespecial   #36  <Method void StringBuilder()>
	//  216  444:astore_1        
				((StringBuilder) (context)).append("Missing extracted secondary dex file '");
	//  217  445:aload_1         
	//  218  446:ldc2            #343 <String "Missing extracted secondary dex file '">
	//  219  449:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  220  452:pop             
				((StringBuilder) (context)).append(((ExtractedDex) (obj1)).getPath());
	//  221  453:aload_1         
	//  222  454:aload           12
	//  223  456:invokevirtual   #344 <Method String MultiDexExtractor$ExtractedDex.getPath()>
	//  224  459:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  225  462:pop             
				((StringBuilder) (context)).append("'");
	//  226  463:aload_1         
	//  227  464:ldc2            #346 <String "'">
	//  228  467:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  229  470:pop             
				throw new IOException(((StringBuilder) (context)).toString());
	//  230  471:new             #26  <Class IOException>
	//  231  474:dup             
	//  232  475:aload_1         
	//  233  476:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  234  479:invokespecial   #239 <Method void IOException(String)>
	//  235  482:athrow          
			}
		}
		return ((List) (arraylist));
	//  236  483:aload           13
	//  237  485:areturn         
	}

	private List performExtractions()
		throws IOException
	{
		int i;
		ZipFile zipfile;
		ArrayList arraylist;
		String s;
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append(sourceApk.getName());
	//    4    9:aload           6
	//    5   11:aload_0         
	//    6   12:getfield        #65  <Field File sourceApk>
	//    7   15:invokevirtual   #293 <Method String File.getName()>
	//    8   18:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(".classes");
	//   10   22:aload           6
	//   11   24:ldc2            #295 <String ".classes">
	//   12   27:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:pop             
		s = stringbuilder.toString();
	//   14   31:aload           6
	//   15   33:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   16   36:astore          10
		clearDexDir();
	//   17   38:aload_0         
	//   18   39:invokespecial   #352 <Method void clearDexDir()>
		arraylist = new ArrayList();
	//   19   42:new             #303 <Class ArrayList>
	//   20   45:dup             
	//   21   46:invokespecial   #353 <Method void ArrayList()>
	//   22   49:astore          9
		zipfile = new ZipFile(sourceApk);
	//   23   51:new             #157 <Class ZipFile>
	//   24   54:dup             
	//   25   55:aload_0         
	//   26   56:getfield        #65  <Field File sourceApk>
	//   27   59:invokespecial   #354 <Method void ZipFile(File)>
	//   28   62:astore          8
		i = 2;
	//   29   64:iconst_2        
	//   30   65:istore_2        
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//   31   66:new             #35  <Class StringBuilder>
	//   32   69:dup             
	//   33   70:invokespecial   #36  <Method void StringBuilder()>
	//   34   73:astore          6
		((StringBuilder) (obj)).append("classes");
	//   35   75:aload           6
	//   36   77:ldc2            #356 <String "classes">
	//   37   80:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   38   83:pop             
		((StringBuilder) (obj)).append(2);
	//   39   84:aload           6
	//   40   86:iconst_2        
	//   41   87:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//   42   90:pop             
		((StringBuilder) (obj)).append(".dex");
	//   43   91:aload           6
	//   44   93:ldc2            #358 <String ".dex">
	//   45   96:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   46   99:pop             
		obj = ((Object) (zipfile.getEntry(((StringBuilder) (obj)).toString())));
	//   47  100:aload           8
	//   48  102:aload           6
	//   49  104:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   50  107:invokevirtual   #362 <Method ZipEntry ZipFile.getEntry(String)>
	//   51  110:astore          6
_L3:
		if(obj == null)
			break MISSING_BLOCK_LABEL_631;
	//   52  112:aload           6
	//   53  114:ifnull          631
		ExtractedDex extracteddex;
		Object obj1 = ((Object) (new StringBuilder()));
	//   54  117:new             #35  <Class StringBuilder>
	//   55  120:dup             
	//   56  121:invokespecial   #36  <Method void StringBuilder()>
	//   57  124:astore          7
		((StringBuilder) (obj1)).append(s);
	//   58  126:aload           7
	//   59  128:aload           10
	//   60  130:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   61  133:pop             
		((StringBuilder) (obj1)).append(i);
	//   62  134:aload           7
	//   63  136:iload_2         
	//   64  137:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//   65  140:pop             
		((StringBuilder) (obj1)).append(".zip");
	//   66  141:aload           7
	//   67  143:ldc1            #165 <String ".zip">
	//   68  145:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   69  148:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   70  149:aload           7
	//   71  151:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   72  154:astore          7
		extracteddex = new ExtractedDex(dexDir, ((String) (obj1)));
	//   73  156:new             #10  <Class MultiDexExtractor$ExtractedDex>
	//   74  159:dup             
	//   75  160:aload_0         
	//   76  161:getfield        #67  <Field File dexDir>
	//   77  164:aload           7
	//   78  166:invokespecial   #310 <Method void MultiDexExtractor$ExtractedDex(File, String)>
	//   79  169:astore          11
		((List) (arraylist)).add(((Object) (extracteddex)));
	//   80  171:aload           9
	//   81  173:aload           11
	//   82  175:invokeinterface #326 <Method boolean List.add(Object)>
	//   83  180:pop             
		obj1 = ((Object) (new StringBuilder()));
	//   84  181:new             #35  <Class StringBuilder>
	//   85  184:dup             
	//   86  185:invokespecial   #36  <Method void StringBuilder()>
	//   87  188:astore          7
		((StringBuilder) (obj1)).append("Extraction is needed for file ");
	//   88  190:aload           7
	//   89  192:ldc2            #364 <String "Extraction is needed for file ">
	//   90  195:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   91  198:pop             
		((StringBuilder) (obj1)).append(((Object) (extracteddex)));
	//   92  199:aload           7
	//   93  201:aload           11
	//   94  203:invokevirtual   #331 <Method StringBuilder StringBuilder.append(Object)>
	//   95  206:pop             
		Log.i("MultiDex", ((StringBuilder) (obj1)).toString());
	//   96  207:ldc1            #54  <String "MultiDex">
	//   97  209:aload           7
	//   98  211:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   99  214:invokestatic    #63  <Method int Log.i(String, String)>
	//  100  217:pop             
		boolean flag1;
		int j;
		j = 0;
	//  101  218:iconst_0        
	//  102  219:istore          4
		flag1 = false;
	//  103  221:iconst_0        
	//  104  222:istore_3        
_L2:
		int k;
		if(j >= 3 || flag1)
			break; /* Loop/switch isn't completed */
	//  105  223:iload           4
	//  106  225:iconst_3        
	//  107  226:icmpge          508
	//  108  229:iload_3         
	//  109  230:ifne            508
		k = j + 1;
	//  110  233:iload           4
	//  111  235:iconst_1        
	//  112  236:iadd            
	//  113  237:istore          5
		extract(zipfile, ((ZipEntry) (obj)), ((File) (extracteddex)), s);
	//  114  239:aload           8
	//  115  241:aload           6
	//  116  243:aload           11
	//  117  245:aload           10
	//  118  247:invokestatic    #366 <Method void extract(ZipFile, ZipEntry, File, String)>
		extracteddex.crc = getZipCrc(((File) (extracteddex)));
	//  119  250:aload           11
	//  120  252:aload           11
	//  121  254:invokestatic    #71  <Method long getZipCrc(File)>
	//  122  257:putfield        #315 <Field long MultiDexExtractor$ExtractedDex.crc>
		boolean flag;
		flag = true;
	//  123  260:iconst_1        
	//  124  261:istore_1        
		break MISSING_BLOCK_LABEL_311;
	//  125  262:goto            311
		IOException ioexception1;
		ioexception1;
	//  126  265:astore          7
		StringBuilder stringbuilder2 = new StringBuilder();
	//  127  267:new             #35  <Class StringBuilder>
	//  128  270:dup             
	//  129  271:invokespecial   #36  <Method void StringBuilder()>
	//  130  274:astore          12
		stringbuilder2.append("Failed to read crc from ");
	//  131  276:aload           12
	//  132  278:ldc2            #368 <String "Failed to read crc from ">
	//  133  281:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  134  284:pop             
		stringbuilder2.append(extracteddex.getAbsolutePath());
	//  135  285:aload           12
	//  136  287:aload           11
	//  137  289:invokevirtual   #369 <Method String MultiDexExtractor$ExtractedDex.getAbsolutePath()>
	//  138  292:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  139  295:pop             
		Log.w("MultiDex", stringbuilder2.toString(), ((Throwable) (ioexception1)));
	//  140  296:ldc1            #54  <String "MultiDex">
	//  141  298:aload           12
	//  142  300:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  143  303:aload           7
	//  144  305:invokestatic    #151 <Method int Log.w(String, String, Throwable)>
	//  145  308:pop             
		flag = false;
	//  146  309:iconst_0        
	//  147  310:istore_1        
		StringBuilder stringbuilder3;
		stringbuilder3 = new StringBuilder();
	//  148  311:new             #35  <Class StringBuilder>
	//  149  314:dup             
	//  150  315:invokespecial   #36  <Method void StringBuilder()>
	//  151  318:astore          12
		stringbuilder3.append("Extraction ");
	//  152  320:aload           12
	//  153  322:ldc2            #371 <String "Extraction ">
	//  154  325:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  155  328:pop             
		Exception exception;
		Object obj2;
		if(flag)
	//* 156  329:iload_1         
	//* 157  330:ifeq            679
			obj2 = "succeeded";
	//  158  333:ldc2            #373 <String "succeeded">
	//  159  336:astore          7
		else
	//* 160  338:goto            341
	//* 161  341:aload           12
	//* 162  343:aload           7
	//* 163  345:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 164  348:pop             
	//* 165  349:aload           12
	//* 166  351:ldc2            #375 <String " '">
	//* 167  354:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 168  357:pop             
	//* 169  358:aload           12
	//* 170  360:aload           11
	//* 171  362:invokevirtual   #369 <Method String MultiDexExtractor$ExtractedDex.getAbsolutePath()>
	//* 172  365:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 173  368:pop             
	//* 174  369:aload           12
	//* 175  371:ldc2            #377 <String "': length ">
	//* 176  374:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 177  377:pop             
	//* 178  378:aload           12
	//* 179  380:aload           11
	//* 180  382:invokevirtual   #378 <Method long MultiDexExtractor$ExtractedDex.length()>
	//* 181  385:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//* 182  388:pop             
	//* 183  389:aload           12
	//* 184  391:ldc2            #380 <String " - crc: ">
	//* 185  394:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 186  397:pop             
	//* 187  398:aload           12
	//* 188  400:aload           11
	//* 189  402:getfield        #315 <Field long MultiDexExtractor$ExtractedDex.crc>
	//* 190  405:invokevirtual   #135 <Method StringBuilder StringBuilder.append(long)>
	//* 191  408:pop             
	//* 192  409:ldc1            #54  <String "MultiDex">
	//* 193  411:aload           12
	//* 194  413:invokevirtual   #57  <Method String StringBuilder.toString()>
	//* 195  416:invokestatic    #63  <Method int Log.i(String, String)>
	//* 196  419:pop             
	//* 197  420:iload           5
	//* 198  422:istore          4
	//* 199  424:iload_1         
	//* 200  425:istore_3        
	//* 201  426:iload_1         
	//* 202  427:ifne            223
	//* 203  430:aload           11
	//* 204  432:invokevirtual   #381 <Method boolean MultiDexExtractor$ExtractedDex.delete()>
	//* 205  435:pop             
	//* 206  436:iload           5
	//* 207  438:istore          4
	//* 208  440:iload_1         
	//* 209  441:istore_3        
	//* 210  442:aload           11
	//* 211  444:invokevirtual   #384 <Method boolean MultiDexExtractor$ExtractedDex.exists()>
	//* 212  447:ifeq            223
	//* 213  450:new             #35  <Class StringBuilder>
	//* 214  453:dup             
	//* 215  454:invokespecial   #36  <Method void StringBuilder()>
	//* 216  457:astore          7
	//* 217  459:aload           7
	//* 218  461:ldc2            #386 <String "Failed to delete corrupted secondary dex '">
	//* 219  464:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 220  467:pop             
	//* 221  468:aload           7
	//* 222  470:aload           11
	//* 223  472:invokevirtual   #344 <Method String MultiDexExtractor$ExtractedDex.getPath()>
	//* 224  475:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 225  478:pop             
	//* 226  479:aload           7
	//* 227  481:ldc2            #346 <String "'">
	//* 228  484:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 229  487:pop             
	//* 230  488:ldc1            #54  <String "MultiDex">
	//* 231  490:aload           7
	//* 232  492:invokevirtual   #57  <Method String StringBuilder.toString()>
	//* 233  495:invokestatic    #124 <Method int Log.w(String, String)>
	//* 234  498:pop             
	//* 235  499:iload           5
	//* 236  501:istore          4
	//* 237  503:iload_1         
	//* 238  504:istore_3        
	//* 239  505:goto            223
	//* 240  508:iload_3         
	//* 241  509:ifeq            565
	//* 242  512:iload_2         
	//* 243  513:iconst_1        
	//* 244  514:iadd            
	//* 245  515:istore_2        
	//* 246  516:new             #35  <Class StringBuilder>
	//* 247  519:dup             
	//* 248  520:invokespecial   #36  <Method void StringBuilder()>
	//* 249  523:astore          6
	//* 250  525:aload           6
	//* 251  527:ldc2            #356 <String "classes">
	//* 252  530:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 253  533:pop             
	//* 254  534:aload           6
	//* 255  536:iload_2         
	//* 256  537:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//* 257  540:pop             
	//* 258  541:aload           6
	//* 259  543:ldc2            #358 <String ".dex">
	//* 260  546:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 261  549:pop             
	//* 262  550:aload           8
	//* 263  552:aload           6
	//* 264  554:invokevirtual   #57  <Method String StringBuilder.toString()>
	//* 265  557:invokevirtual   #362 <Method ZipEntry ZipFile.getEntry(String)>
	//* 266  560:astore          6
	//* 267  562:goto            112
	//* 268  565:new             #35  <Class StringBuilder>
	//* 269  568:dup             
	//* 270  569:invokespecial   #36  <Method void StringBuilder()>
	//* 271  572:astore          6
	//* 272  574:aload           6
	//* 273  576:ldc2            #388 <String "Could not create zip file ">
	//* 274  579:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 275  582:pop             
	//* 276  583:aload           6
	//* 277  585:aload           11
	//* 278  587:invokevirtual   #369 <Method String MultiDexExtractor$ExtractedDex.getAbsolutePath()>
	//* 279  590:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 280  593:pop             
	//* 281  594:aload           6
	//* 282  596:ldc2            #390 <String " for secondary dex (">
	//* 283  599:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 284  602:pop             
	//* 285  603:aload           6
	//* 286  605:iload_2         
	//* 287  606:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//* 288  609:pop             
	//* 289  610:aload           6
	//* 290  612:ldc1            #52  <String ")">
	//* 291  614:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 292  617:pop             
	//* 293  618:new             #26  <Class IOException>
	//* 294  621:dup             
	//* 295  622:aload           6
	//* 296  624:invokevirtual   #57  <Method String StringBuilder.toString()>
	//* 297  627:invokespecial   #239 <Method void IOException(String)>
	//* 298  630:athrow          
	//* 299  631:aload           8
	//* 300  633:invokevirtual   #391 <Method void ZipFile.close()>
	//* 301  636:aload           9
	//* 302  638:areturn         
	//* 303  639:astore          6
	//* 304  641:ldc1            #54  <String "MultiDex">
	//* 305  643:ldc1            #148 <String "Failed to close resource">
	//* 306  645:aload           6
	//* 307  647:invokestatic    #151 <Method int Log.w(String, String, Throwable)>
	//* 308  650:pop             
	//* 309  651:aload           9
	//* 310  653:areturn         
	//* 311  654:astore          6
	//* 312  656:aload           8
	//* 313  658:invokevirtual   #391 <Method void ZipFile.close()>
	//* 314  661:goto            676
	//* 315  664:astore          7
	//* 316  666:ldc1            #54  <String "MultiDex">
	//* 317  668:ldc1            #148 <String "Failed to close resource">
	//* 318  670:aload           7
	//* 319  672:invokestatic    #151 <Method int Log.w(String, String, Throwable)>
	//* 320  675:pop             
	//* 321  676:aload           6
	//* 322  678:athrow          
			obj2 = "failed";
	//  323  679:ldc2            #393 <String "failed">
	//  324  682:astore          7
		stringbuilder3.append(((String) (obj2)));
		stringbuilder3.append(" '");
		stringbuilder3.append(extracteddex.getAbsolutePath());
		stringbuilder3.append("': length ");
		stringbuilder3.append(extracteddex.length());
		stringbuilder3.append(" - crc: ");
		stringbuilder3.append(extracteddex.crc);
		Log.i("MultiDex", stringbuilder3.toString());
		j = k;
		flag1 = flag;
		if(flag)
			continue; /* Loop/switch isn't completed */
		extracteddex.delete();
		j = k;
		flag1 = flag;
		if(!extracteddex.exists())
			continue; /* Loop/switch isn't completed */
		obj2 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj2)).append("Failed to delete corrupted secondary dex '");
		((StringBuilder) (obj2)).append(extracteddex.getPath());
		((StringBuilder) (obj2)).append("'");
		Log.w("MultiDex", ((StringBuilder) (obj2)).toString());
		j = k;
		flag1 = flag;
		if(true) goto _L2; else goto _L1
_L1:
		if(!flag1)
			break MISSING_BLOCK_LABEL_565;
		i++;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("classes");
		((StringBuilder) (obj)).append(i);
		((StringBuilder) (obj)).append(".dex");
		obj = ((Object) (zipfile.getEntry(((StringBuilder) (obj)).toString())));
		  goto _L3
		StringBuilder stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Could not create zip file ");
		stringbuilder1.append(extracteddex.getAbsolutePath());
		stringbuilder1.append(" for secondary dex (");
		stringbuilder1.append(i);
		stringbuilder1.append(")");
		throw new IOException(stringbuilder1.toString());
		try
		{
			zipfile.close();
		}
		catch(IOException ioexception)
		{
			Log.w("MultiDex", "Failed to close resource", ((Throwable) (ioexception)));
			return ((List) (arraylist));
		}
		return ((List) (arraylist));
		exception;
		try
		{
			zipfile.close();
		}
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			Log.w("MultiDex", "Failed to close resource", ((Throwable) (obj2)));
		}
		throw exception;
	//* 325  684:goto            341
	}

	private static void putStoredApkInfo(Context context, String s, long l, long l1, List list)
	{
		context = ((Context) (getMultiDexPreferences(context).edit()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #274 <Method SharedPreferences getMultiDexPreferences(Context)>
	//    2    4:invokeinterface #400 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #35  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #36  <Method void StringBuilder()>
	//    7   17:astore          8
		stringbuilder.append(s);
	//    8   19:aload           8
	//    9   21:aload_1         
	//   10   22:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
		stringbuilder.append("timestamp");
	//   12   26:aload           8
	//   13   28:ldc2            #276 <String "timestamp">
	//   14   31:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   15   34:pop             
		((android.content.SharedPreferences.Editor) (context)).putLong(stringbuilder.toString(), l);
	//   16   35:aload_0         
	//   17   36:aload           8
	//   18   38:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   19   41:lload_2         
	//   20   42:invokeinterface #406 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   21   47:pop             
		stringbuilder = new StringBuilder();
	//   22   48:new             #35  <Class StringBuilder>
	//   23   51:dup             
	//   24   52:invokespecial   #36  <Method void StringBuilder()>
	//   25   55:astore          8
		stringbuilder.append(s);
	//   26   57:aload           8
	//   27   59:aload_1         
	//   28   60:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
		stringbuilder.append("crc");
	//   30   64:aload           8
	//   31   66:ldc2            #286 <String "crc">
	//   32   69:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   33   72:pop             
		((android.content.SharedPreferences.Editor) (context)).putLong(stringbuilder.toString(), l1);
	//   34   73:aload_0         
	//   35   74:aload           8
	//   36   76:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   37   79:lload           4
	//   38   81:invokeinterface #406 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   39   86:pop             
		stringbuilder = new StringBuilder();
	//   40   87:new             #35  <Class StringBuilder>
	//   41   90:dup             
	//   42   91:invokespecial   #36  <Method void StringBuilder()>
	//   43   94:astore          8
		stringbuilder.append(s);
	//   44   96:aload           8
	//   45   98:aload_1         
	//   46   99:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   47  102:pop             
		stringbuilder.append("dex.number");
	//   48  103:aload           8
	//   49  105:ldc2            #297 <String "dex.number">
	//   50  108:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   51  111:pop             
		((android.content.SharedPreferences.Editor) (context)).putInt(stringbuilder.toString(), list.size() + 1);
	//   52  112:aload_0         
	//   53  113:aload           8
	//   54  115:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   55  118:aload           6
	//   56  120:invokeinterface #410 <Method int List.size()>
	//   57  125:iconst_1        
	//   58  126:iadd            
	//   59  127:invokeinterface #414 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   60  132:pop             
		list = ((List) (list.iterator()));
	//   61  133:aload           6
	//   62  135:invokeinterface #418 <Method Iterator List.iterator()>
	//   63  140:astore          6
		for(int i = 2; ((Iterator) (list)).hasNext(); i++)
	//*  64  142:iconst_2        
	//*  65  143:istore          7
	//*  66  145:aload           6
	//*  67  147:invokeinterface #423 <Method boolean Iterator.hasNext()>
	//*  68  152:ifeq            276
		{
			ExtractedDex extracteddex = (ExtractedDex)((Iterator) (list)).next();
	//   69  155:aload           6
	//   70  157:invokeinterface #427 <Method Object Iterator.next()>
	//   71  162:checkcast       #10  <Class MultiDexExtractor$ExtractedDex>
	//   72  165:astore          8
			StringBuilder stringbuilder1 = new StringBuilder();
	//   73  167:new             #35  <Class StringBuilder>
	//   74  170:dup             
	//   75  171:invokespecial   #36  <Method void StringBuilder()>
	//   76  174:astore          9
			stringbuilder1.append(s);
	//   77  176:aload           9
	//   78  178:aload_1         
	//   79  179:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   80  182:pop             
			stringbuilder1.append("dex.crc.");
	//   81  183:aload           9
	//   82  185:ldc2            #317 <String "dex.crc.">
	//   83  188:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   84  191:pop             
			stringbuilder1.append(i);
	//   85  192:aload           9
	//   86  194:iload           7
	//   87  196:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//   88  199:pop             
			((android.content.SharedPreferences.Editor) (context)).putLong(stringbuilder1.toString(), extracteddex.crc);
	//   89  200:aload_0         
	//   90  201:aload           9
	//   91  203:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   92  206:aload           8
	//   93  208:getfield        #315 <Field long MultiDexExtractor$ExtractedDex.crc>
	//   94  211:invokeinterface #406 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   95  216:pop             
			stringbuilder1 = new StringBuilder();
	//   96  217:new             #35  <Class StringBuilder>
	//   97  220:dup             
	//   98  221:invokespecial   #36  <Method void StringBuilder()>
	//   99  224:astore          9
			stringbuilder1.append(s);
	//  100  226:aload           9
	//  101  228:aload_1         
	//  102  229:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  103  232:pop             
			stringbuilder1.append("dex.time.");
	//  104  233:aload           9
	//  105  235:ldc2            #319 <String "dex.time.">
	//  106  238:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  107  241:pop             
			stringbuilder1.append(i);
	//  108  242:aload           9
	//  109  244:iload           7
	//  110  246:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//  111  249:pop             
			((android.content.SharedPreferences.Editor) (context)).putLong(stringbuilder1.toString(), extracteddex.lastModified());
	//  112  250:aload_0         
	//  113  251:aload           9
	//  114  253:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  115  256:aload           8
	//  116  258:invokevirtual   #320 <Method long MultiDexExtractor$ExtractedDex.lastModified()>
	//  117  261:invokeinterface #406 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//  118  266:pop             
		}

	//  119  267:iload           7
	//  120  269:iconst_1        
	//  121  270:iadd            
	//  122  271:istore          7
	//* 123  273:goto            145
		((android.content.SharedPreferences.Editor) (context)).commit();
	//  124  276:aload_0         
	//  125  277:invokeinterface #430 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//  126  282:pop             
	//  127  283:return          
	}

	public void close()
		throws IOException
	{
		cacheLock.release();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field FileLock cacheLock>
	//    2    4:invokevirtual   #436 <Method void FileLock.release()>
		lockChannel.close();
	//    3    7:aload_0         
	//    4    8:getfield        #91  <Field FileChannel lockChannel>
	//    5   11:invokevirtual   #437 <Method void FileChannel.close()>
		lockRaf.close();
	//    6   14:aload_0         
	//    7   15:getfield        #85  <Field RandomAccessFile lockRaf>
	//    8   18:invokevirtual   #438 <Method void RandomAccessFile.close()>
	//    9   21:return          
	}

	List load(Context context, String s, boolean flag)
		throws IOException
	{
label0:
		{
label1:
			{
				Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #35  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuilder()>
	//    3    7:astore          4
				((StringBuilder) (obj)).append("MultiDexExtractor.load(");
	//    4    9:aload           4
	//    5   11:ldc2            #442 <String "MultiDexExtractor.load(">
	//    6   14:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
				((StringBuilder) (obj)).append(sourceApk.getPath());
	//    8   18:aload           4
	//    9   20:aload_0         
	//   10   21:getfield        #65  <Field File sourceApk>
	//   11   24:invokevirtual   #48  <Method String File.getPath()>
	//   12   27:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:pop             
				((StringBuilder) (obj)).append(", ");
	//   14   31:aload           4
	//   15   33:ldc1            #50  <String ", ">
	//   16   35:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
				((StringBuilder) (obj)).append(flag);
	//   18   39:aload           4
	//   19   41:iload_3         
	//   20   42:invokevirtual   #445 <Method StringBuilder StringBuilder.append(boolean)>
	//   21   45:pop             
				((StringBuilder) (obj)).append(", ");
	//   22   46:aload           4
	//   23   48:ldc1            #50  <String ", ">
	//   24   50:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
				((StringBuilder) (obj)).append(s);
	//   26   54:aload           4
	//   27   56:aload_2         
	//   28   57:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
				((StringBuilder) (obj)).append(")");
	//   30   61:aload           4
	//   31   63:ldc1            #52  <String ")">
	//   32   65:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
				Log.i("MultiDex", ((StringBuilder) (obj)).toString());
	//   34   69:ldc1            #54  <String "MultiDex">
	//   35   71:aload           4
	//   36   73:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   37   76:invokestatic    #63  <Method int Log.i(String, String)>
	//   38   79:pop             
				if(!cacheLock.isValid())
					break label0;
	//   39   80:aload_0         
	//   40   81:getfield        #101 <Field FileLock cacheLock>
	//   41   84:invokevirtual   #448 <Method boolean FileLock.isValid()>
	//   42   87:ifeq            266
				if(!flag && !isModified(context, sourceApk, sourceCrc, s))
	//*  43   90:iload_3         
	//*  44   91:ifne            167
	//*  45   94:aload_1         
	//*  46   95:aload_0         
	//*  47   96:getfield        #65  <Field File sourceApk>
	//*  48   99:aload_0         
	//*  49  100:getfield        #73  <Field long sourceCrc>
	//*  50  103:aload_2         
	//*  51  104:invokestatic    #450 <Method boolean isModified(Context, File, long, String)>
	//*  52  107:ifne            167
				{
					try
					{
						obj = ((Object) (loadExistingExtractions(context, s)));
	//   53  110:aload_0         
	//   54  111:aload_1         
	//   55  112:aload_2         
	//   56  113:invokespecial   #452 <Method List loadExistingExtractions(Context, String)>
	//   57  116:astore          4
					}
	//*  58  118:aload           4
	//*  59  120:astore_1        
	//*  60  121:goto            219
					catch(IOException ioexception)
	//*  61  124:astore          4
					{
						Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", ((Throwable) (ioexception)));
	//   62  126:ldc1            #54  <String "MultiDex">
	//   63  128:ldc2            #454 <String "Failed to reload existing extracted secondary dex files, falling back to fresh extraction">
	//   64  131:aload           4
	//   65  133:invokestatic    #151 <Method int Log.w(String, String, Throwable)>
	//   66  136:pop             
						ioexception = ((IOException) (performExtractions()));
	//   67  137:aload_0         
	//   68  138:invokespecial   #456 <Method List performExtractions()>
	//   69  141:astore          4
						putStoredApkInfo(context, s, getTimeStamp(sourceApk), sourceCrc, ((List) (ioexception)));
	//   70  143:aload_1         
	//   71  144:aload_2         
	//   72  145:aload_0         
	//   73  146:getfield        #65  <Field File sourceApk>
	//   74  149:invokestatic    #284 <Method long getTimeStamp(File)>
	//   75  152:aload_0         
	//   76  153:getfield        #73  <Field long sourceCrc>
	//   77  156:aload           4
	//   78  158:invokestatic    #458 <Method void putStoredApkInfo(Context, String, long, long, List)>
						context = ((Context) (ioexception));
	//   79  161:aload           4
	//   80  163:astore_1        
						break label1;
	//   81  164:goto            219
					}
					context = ((Context) (obj));
					break label1;
				}
				if(flag)
	//*  82  167:iload_3         
	//*  83  168:ifeq            183
					Log.i("MultiDex", "Forced extraction must be performed.");
	//   84  171:ldc1            #54  <String "MultiDex">
	//   85  173:ldc2            #460 <String "Forced extraction must be performed.">
	//   86  176:invokestatic    #63  <Method int Log.i(String, String)>
	//   87  179:pop             
				else
	//*  88  180:goto            192
					Log.i("MultiDex", "Detected that extraction must be performed.");
	//   89  183:ldc1            #54  <String "MultiDex">
	//   90  185:ldc2            #462 <String "Detected that extraction must be performed.">
	//   91  188:invokestatic    #63  <Method int Log.i(String, String)>
	//   92  191:pop             
				ioexception = ((IOException) (performExtractions()));
	//   93  192:aload_0         
	//   94  193:invokespecial   #456 <Method List performExtractions()>
	//   95  196:astore          4
				putStoredApkInfo(context, s, getTimeStamp(sourceApk), sourceCrc, ((List) (ioexception)));
	//   96  198:aload_1         
	//   97  199:aload_2         
	//   98  200:aload_0         
	//   99  201:getfield        #65  <Field File sourceApk>
	//  100  204:invokestatic    #284 <Method long getTimeStamp(File)>
	//  101  207:aload_0         
	//  102  208:getfield        #73  <Field long sourceCrc>
	//  103  211:aload           4
	//  104  213:invokestatic    #458 <Method void putStoredApkInfo(Context, String, long, long, List)>
				context = ((Context) (ioexception));
	//  105  216:aload           4
	//  106  218:astore_1        
			}
			s = ((String) (new StringBuilder()));
	//  107  219:new             #35  <Class StringBuilder>
	//  108  222:dup             
	//  109  223:invokespecial   #36  <Method void StringBuilder()>
	//  110  226:astore_2        
			((StringBuilder) (s)).append("load found ");
	//  111  227:aload_2         
	//  112  228:ldc2            #464 <String "load found ">
	//  113  231:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  114  234:pop             
			((StringBuilder) (s)).append(((List) (context)).size());
	//  115  235:aload_2         
	//  116  236:aload_1         
	//  117  237:invokeinterface #410 <Method int List.size()>
	//  118  242:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//  119  245:pop             
			((StringBuilder) (s)).append(" secondary dex files");
	//  120  246:aload_2         
	//  121  247:ldc2            #466 <String " secondary dex files">
	//  122  250:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  123  253:pop             
			Log.i("MultiDex", ((StringBuilder) (s)).toString());
	//  124  254:ldc1            #54  <String "MultiDex">
	//  125  256:aload_2         
	//  126  257:invokevirtual   #57  <Method String StringBuilder.toString()>
	//  127  260:invokestatic    #63  <Method int Log.i(String, String)>
	//  128  263:pop             
			return ((List) (context));
	//  129  264:aload_1         
	//  130  265:areturn         
		}
		throw new IllegalStateException("MultiDexExtractor was closed");
	//  131  266:new             #468 <Class IllegalStateException>
	//  132  269:dup             
	//  133  270:ldc2            #470 <String "MultiDexExtractor was closed">
	//  134  273:invokespecial   #471 <Method void IllegalStateException(String)>
	//  135  276:athrow          
	}

	private final FileLock cacheLock;
	private final File dexDir;
	private final FileChannel lockChannel;
	private final RandomAccessFile lockRaf;
	private final File sourceApk;
	private final long sourceCrc;
}
