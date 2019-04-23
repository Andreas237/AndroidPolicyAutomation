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
	//    1    1:invokespecial   #78  <Method void Object()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #80  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #81  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("MultiDexExtractor(");
	//    6   12:aload_3         
	//    7   13:ldc1            #83  <String "MultiDexExtractor(">
	//    8   15:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(file.getPath());
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokevirtual   #93  <Method String File.getPath()>
	//   13   24:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append(", ");
	//   15   28:aload_3         
	//   16   29:ldc1            #95  <String ", ">
	//   17   31:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(file1.getPath());
	//   19   35:aload_3         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #93  <Method String File.getPath()>
	//   22   40:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(")");
	//   24   44:aload_3         
	//   25   45:ldc1            #97  <String ")">
	//   26   47:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		Log.i("MultiDex", stringbuilder.toString());
	//   28   51:ldc1            #57  <String "MultiDex">
	//   29   53:aload_3         
	//   30   54:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   31   57:invokestatic    #106 <Method int Log.i(String, String)>
	//   32   60:pop             
		sourceApk = file;
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:putfield        #108 <Field File sourceApk>
		dexDir = file1;
	//   36   66:aload_0         
	//   37   67:aload_2         
	//   38   68:putfield        #110 <Field File dexDir>
		sourceCrc = getZipCrc(file);
	//   39   71:aload_0         
	//   40   72:aload_1         
	//   41   73:invokestatic    #114 <Method long getZipCrc(File)>
	//   42   76:putfield        #116 <Field long sourceCrc>
		file = new File(file1, "MultiDex.lock");
	//   43   79:new             #89  <Class File>
	//   44   82:dup             
	//   45   83:aload_2         
	//   46   84:ldc1            #45  <String "MultiDex.lock">
	//   47   86:invokespecial   #119 <Method void File(File, String)>
	//   48   89:astore_1        
		lockRaf = new RandomAccessFile(file, "rw");
	//   49   90:aload_0         
	//   50   91:new             #121 <Class RandomAccessFile>
	//   51   94:dup             
	//   52   95:aload_1         
	//   53   96:ldc1            #123 <String "rw">
	//   54   98:invokespecial   #124 <Method void RandomAccessFile(File, String)>
	//   55  101:putfield        #126 <Field RandomAccessFile lockRaf>
		lockChannel = lockRaf.getChannel();
	//   56  104:aload_0         
	//   57  105:aload_0         
	//   58  106:getfield        #126 <Field RandomAccessFile lockRaf>
	//   59  109:invokevirtual   #130 <Method FileChannel RandomAccessFile.getChannel()>
	//   60  112:putfield        #132 <Field FileChannel lockChannel>
		try
		{
			file1 = ((File) (new StringBuilder()));
	//   61  115:new             #80  <Class StringBuilder>
	//   62  118:dup             
	//   63  119:invokespecial   #81  <Method void StringBuilder()>
	//   64  122:astore_2        
			((StringBuilder) (file1)).append("Blocking on lock ");
	//   65  123:aload_2         
	//   66  124:ldc1            #134 <String "Blocking on lock ">
	//   67  126:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   68  129:pop             
			((StringBuilder) (file1)).append(file.getPath());
	//   69  130:aload_2         
	//   70  131:aload_1         
	//   71  132:invokevirtual   #93  <Method String File.getPath()>
	//   72  135:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   73  138:pop             
			Log.i("MultiDex", ((StringBuilder) (file1)).toString());
	//   74  139:ldc1            #57  <String "MultiDex">
	//   75  141:aload_2         
	//   76  142:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   77  145:invokestatic    #106 <Method int Log.i(String, String)>
	//   78  148:pop             
			cacheLock = lockChannel.lock();
	//   79  149:aload_0         
	//   80  150:aload_0         
	//   81  151:getfield        #132 <Field FileChannel lockChannel>
	//   82  154:invokevirtual   #140 <Method FileLock FileChannel.lock()>
	//   83  157:putfield        #142 <Field FileLock cacheLock>
			break MISSING_BLOCK_LABEL_160;
		}
	//*  84  160:new             #80  <Class StringBuilder>
	//*  85  163:dup             
	//*  86  164:invokespecial   #81  <Method void StringBuilder()>
	//*  87  167:astore_2        
	//*  88  168:aload_2         
	//*  89  169:aload_1         
	//*  90  170:invokevirtual   #93  <Method String File.getPath()>
	//*  91  173:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  92  176:pop             
	//*  93  177:aload_2         
	//*  94  178:ldc1            #144 <String " locked">
	//*  95  180:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  96  183:pop             
	//*  97  184:ldc1            #57  <String "MultiDex">
	//*  98  186:aload_2         
	//*  99  187:invokevirtual   #100 <Method String StringBuilder.toString()>
	//* 100  190:invokestatic    #106 <Method int Log.i(String, String)>
	//* 101  193:pop             
	//* 102  194:return          
	//* 103  195:aload_0         
	//* 104  196:getfield        #132 <Field FileChannel lockChannel>
	//* 105  199:invokestatic    #148 <Method void closeQuietly(Closeable)>
	//* 106  202:aload_1         
	//* 107  203:athrow          
	//* 108  204:astore_1        
	//* 109  205:goto            213
	//* 110  208:astore_1        
	//* 111  209:goto            213
	//* 112  212:astore_1        
	//* 113  213:aload_0         
	//* 114  214:getfield        #126 <Field RandomAccessFile lockRaf>
	//* 115  217:invokestatic    #148 <Method void closeQuietly(Closeable)>
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
	//    1    1:getfield        #110 <Field File dexDir>
	//    2    4:new             #8   <Class MultiDexExtractor$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #154 <Method void MultiDexExtractor$1(MultiDexExtractor)>
	//    6   12:invokevirtual   #158 <Method File[] File.listFiles(FileFilter)>
	//    7   15:astore_3        
		if(obj == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       65
		{
			obj = ((Object) (new StringBuilder()));
	//   10   20:new             #80  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #81  <Method void StringBuilder()>
	//   13   27:astore_3        
			((StringBuilder) (obj)).append("Failed to list secondary dex dir content (");
	//   14   28:aload_3         
	//   15   29:ldc1            #160 <String "Failed to list secondary dex dir content (">
	//   16   31:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			((StringBuilder) (obj)).append(dexDir.getPath());
	//   18   35:aload_3         
	//   19   36:aload_0         
	//   20   37:getfield        #110 <Field File dexDir>
	//   21   40:invokevirtual   #93  <Method String File.getPath()>
	//   22   43:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			((StringBuilder) (obj)).append(").");
	//   24   47:aload_3         
	//   25   48:ldc1            #162 <String ").">
	//   26   50:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			Log.w("MultiDex", ((StringBuilder) (obj)).toString());
	//   28   54:ldc1            #57  <String "MultiDex">
	//   29   56:aload_3         
	//   30   57:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   31   60:invokestatic    #165 <Method int Log.w(String, String)>
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
	//   46   80:new             #80  <Class StringBuilder>
	//   47   83:dup             
	//   48   84:invokespecial   #81  <Method void StringBuilder()>
	//   49   87:astore          5
			stringbuilder.append("Trying to delete old file ");
	//   50   89:aload           5
	//   51   91:ldc1            #167 <String "Trying to delete old file ">
	//   52   93:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   53   96:pop             
			stringbuilder.append(file.getPath());
	//   54   97:aload           5
	//   55   99:aload           4
	//   56  101:invokevirtual   #93  <Method String File.getPath()>
	//   57  104:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   58  107:pop             
			stringbuilder.append(" of size ");
	//   59  108:aload           5
	//   60  110:ldc1            #169 <String " of size ">
	//   61  112:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   62  115:pop             
			stringbuilder.append(file.length());
	//   63  116:aload           5
	//   64  118:aload           4
	//   65  120:invokevirtual   #173 <Method long File.length()>
	//   66  123:invokevirtual   #176 <Method StringBuilder StringBuilder.append(long)>
	//   67  126:pop             
			Log.i("MultiDex", stringbuilder.toString());
	//   68  127:ldc1            #57  <String "MultiDex">
	//   69  129:aload           5
	//   70  131:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   71  134:invokestatic    #106 <Method int Log.i(String, String)>
	//   72  137:pop             
			if(!file.delete())
	//*  73  138:aload           4
	//*  74  140:invokevirtual   #180 <Method boolean File.delete()>
	//*  75  143:ifne            188
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   76  146:new             #80  <Class StringBuilder>
	//   77  149:dup             
	//   78  150:invokespecial   #81  <Method void StringBuilder()>
	//   79  153:astore          5
				stringbuilder1.append("Failed to delete old file ");
	//   80  155:aload           5
	//   81  157:ldc1            #182 <String "Failed to delete old file ">
	//   82  159:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   83  162:pop             
				stringbuilder1.append(file.getPath());
	//   84  163:aload           5
	//   85  165:aload           4
	//   86  167:invokevirtual   #93  <Method String File.getPath()>
	//   87  170:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   88  173:pop             
				Log.w("MultiDex", stringbuilder1.toString());
	//   89  174:ldc1            #57  <String "MultiDex">
	//   90  176:aload           5
	//   91  178:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   92  181:invokestatic    #165 <Method int Log.w(String, String)>
	//   93  184:pop             
			} else
	//*  94  185:goto            227
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   95  188:new             #80  <Class StringBuilder>
	//   96  191:dup             
	//   97  192:invokespecial   #81  <Method void StringBuilder()>
	//   98  195:astore          5
				stringbuilder2.append("Deleted old file ");
	//   99  197:aload           5
	//  100  199:ldc1            #184 <String "Deleted old file ">
	//  101  201:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  102  204:pop             
				stringbuilder2.append(file.getPath());
	//  103  205:aload           5
	//  104  207:aload           4
	//  105  209:invokevirtual   #93  <Method String File.getPath()>
	//  106  212:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  107  215:pop             
				Log.i("MultiDex", stringbuilder2.toString());
	//  108  216:ldc1            #57  <String "MultiDex">
	//  109  218:aload           5
	//  110  220:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  111  223:invokestatic    #106 <Method int Log.i(String, String)>
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
	//    1    1:invokeinterface #187 <Method void Closeable.close()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   3    7:astore_0        
		{
			Log.w("MultiDex", "Failed to close resource", ((Throwable) (closeable)));
	//    4    8:ldc1            #57  <String "MultiDex">
	//    5   10:ldc1            #189 <String "Failed to close resource">
	//    6   12:aload_0         
	//    7   13:invokestatic    #192 <Method int Log.w(String, String, Throwable)>
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
	//    2    2:invokevirtual   #202 <Method InputStream ZipFile.getInputStream(ZipEntry)>
	//    3    5:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #80  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #81  <Method void StringBuilder()>
	//    7   13:astore          6
		stringbuilder.append("tmp-");
	//    8   15:aload           6
	//    9   17:ldc1            #204 <String "tmp-">
	//   10   19:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(s);
	//   12   23:aload           6
	//   13   25:aload_3         
	//   14   26:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		s = ((String) (File.createTempFile(stringbuilder.toString(), ".zip", file.getParentFile())));
	//   16   30:aload           6
	//   17   32:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   18   35:ldc1            #27  <String ".zip">
	//   19   37:aload_2         
	//   20   38:invokevirtual   #208 <Method File File.getParentFile()>
	//   21   41:invokestatic    #212 <Method File File.createTempFile(String, String, File)>
	//   22   44:astore_3        
		stringbuilder = new StringBuilder();
	//   23   45:new             #80  <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #81  <Method void StringBuilder()>
	//   26   52:astore          6
		stringbuilder.append("Extracting ");
	//   27   54:aload           6
	//   28   56:ldc1            #214 <String "Extracting ">
	//   29   58:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
		stringbuilder.append(((File) (s)).getPath());
	//   31   62:aload           6
	//   32   64:aload_3         
	//   33   65:invokevirtual   #93  <Method String File.getPath()>
	//   34   68:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
		Log.i("MultiDex", stringbuilder.toString());
	//   36   72:ldc1            #57  <String "MultiDex">
	//   37   74:aload           6
	//   38   76:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   39   79:invokestatic    #106 <Method int Log.i(String, String)>
	//   40   82:pop             
		ZipOutputStream zipoutputstream = new ZipOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(((File) (s)))))))));
	//   41   83:new             #216 <Class ZipOutputStream>
	//   42   86:dup             
	//   43   87:new             #218 <Class BufferedOutputStream>
	//   44   90:dup             
	//   45   91:new             #220 <Class FileOutputStream>
	//   46   94:dup             
	//   47   95:aload_3         
	//   48   96:invokespecial   #223 <Method void FileOutputStream(File)>
	//   49   99:invokespecial   #226 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   50  102:invokespecial   #227 <Method void ZipOutputStream(java.io.OutputStream)>
	//   51  105:astore          6
		int i;
		ZipEntry zipentry1 = new ZipEntry("classes.dex");
	//   52  107:new             #229 <Class ZipEntry>
	//   53  110:dup             
	//   54  111:ldc1            #231 <String "classes.dex">
	//   55  113:invokespecial   #234 <Method void ZipEntry(String)>
	//   56  116:astore          7
		zipentry1.setTime(zipentry.getTime());
	//   57  118:aload           7
	//   58  120:aload_1         
	//   59  121:invokevirtual   #237 <Method long ZipEntry.getTime()>
	//   60  124:invokevirtual   #241 <Method void ZipEntry.setTime(long)>
		zipoutputstream.putNextEntry(zipentry1);
	//   61  127:aload           6
	//   62  129:aload           7
	//   63  131:invokevirtual   #245 <Method void ZipOutputStream.putNextEntry(ZipEntry)>
		zipentry = ((ZipEntry) (new byte[16384]));
	//   64  134:sipush          16384
	//   65  137:newarray        byte[]
	//   66  139:astore_1        
		i = ((InputStream) (zipfile)).read(((byte []) (zipentry)));
	//   67  140:aload_0         
	//   68  141:aload_1         
	//   69  142:invokevirtual   #251 <Method int InputStream.read(byte[])>
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
	//   78  159:invokevirtual   #255 <Method void ZipOutputStream.write(byte[], int, int)>
		i = ((InputStream) (zipfile)).read(((byte []) (zipentry)));
	//   79  162:aload_0         
	//   80  163:aload_1         
	//   81  164:invokevirtual   #251 <Method int InputStream.read(byte[])>
	//   82  167:istore          4
		  goto _L1
	//*  83  169:goto            147
		zipoutputstream.closeEntry();
	//   84  172:aload           6
	//   85  174:invokevirtual   #258 <Method void ZipOutputStream.closeEntry()>
		boolean flag;
		zipoutputstream.close();
	//   86  177:aload           6
	//   87  179:invokevirtual   #259 <Method void ZipOutputStream.close()>
		if(!((File) (s)).setReadOnly())
			break MISSING_BLOCK_LABEL_308;
	//   88  182:aload_3         
	//   89  183:invokevirtual   #262 <Method boolean File.setReadOnly()>
	//   90  186:ifeq            308
		zipentry = ((ZipEntry) (new StringBuilder()));
	//   91  189:new             #80  <Class StringBuilder>
	//   92  192:dup             
	//   93  193:invokespecial   #81  <Method void StringBuilder()>
	//   94  196:astore_1        
		((StringBuilder) (zipentry)).append("Renaming to ");
	//   95  197:aload_1         
	//   96  198:ldc2            #264 <String "Renaming to ">
	//   97  201:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   98  204:pop             
		((StringBuilder) (zipentry)).append(file.getPath());
	//   99  205:aload_1         
	//  100  206:aload_2         
	//  101  207:invokevirtual   #93  <Method String File.getPath()>
	//  102  210:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  103  213:pop             
		Log.i("MultiDex", ((StringBuilder) (zipentry)).toString());
	//  104  214:ldc1            #57  <String "MultiDex">
	//  105  216:aload_1         
	//  106  217:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  107  220:invokestatic    #106 <Method int Log.i(String, String)>
	//  108  223:pop             
		flag = ((File) (s)).renameTo(file);
	//  109  224:aload_3         
	//  110  225:aload_2         
	//  111  226:invokevirtual   #268 <Method boolean File.renameTo(File)>
	//  112  229:istore          5
		if(flag)
	//* 113  231:iload           5
	//* 114  233:ifeq            246
		{
			closeQuietly(((Closeable) (zipfile)));
	//  115  236:aload_0         
	//  116  237:invokestatic    #148 <Method void closeQuietly(Closeable)>
			((File) (s)).delete();
	//  117  240:aload_3         
	//  118  241:invokevirtual   #180 <Method boolean File.delete()>
	//  119  244:pop             
			return;
	//  120  245:return          
		}
		zipentry = ((ZipEntry) (new StringBuilder()));
	//  121  246:new             #80  <Class StringBuilder>
	//  122  249:dup             
	//  123  250:invokespecial   #81  <Method void StringBuilder()>
	//  124  253:astore_1        
		((StringBuilder) (zipentry)).append("Failed to rename \"");
	//  125  254:aload_1         
	//  126  255:ldc2            #270 <String "Failed to rename \"">
	//  127  258:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  128  261:pop             
		((StringBuilder) (zipentry)).append(((File) (s)).getAbsolutePath());
	//  129  262:aload_1         
	//  130  263:aload_3         
	//  131  264:invokevirtual   #273 <Method String File.getAbsolutePath()>
	//  132  267:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  133  270:pop             
		((StringBuilder) (zipentry)).append("\" to \"");
	//  134  271:aload_1         
	//  135  272:ldc2            #275 <String "\" to \"">
	//  136  275:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  137  278:pop             
		((StringBuilder) (zipentry)).append(file.getAbsolutePath());
	//  138  279:aload_1         
	//  139  280:aload_2         
	//  140  281:invokevirtual   #273 <Method String File.getAbsolutePath()>
	//  141  284:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  142  287:pop             
		((StringBuilder) (zipentry)).append("\"");
	//  143  288:aload_1         
	//  144  289:ldc2            #277 <String "\"">
	//  145  292:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  146  295:pop             
		throw new IOException(((StringBuilder) (zipentry)).toString());
	//  147  296:new             #71  <Class IOException>
	//  148  299:dup             
	//  149  300:aload_1         
	//  150  301:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  151  304:invokespecial   #278 <Method void IOException(String)>
	//  152  307:athrow          
		zipentry = ((ZipEntry) (new StringBuilder()));
	//  153  308:new             #80  <Class StringBuilder>
	//  154  311:dup             
	//  155  312:invokespecial   #81  <Method void StringBuilder()>
	//  156  315:astore_1        
		((StringBuilder) (zipentry)).append("Failed to mark readonly \"");
	//  157  316:aload_1         
	//  158  317:ldc2            #280 <String "Failed to mark readonly \"">
	//  159  320:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  160  323:pop             
		((StringBuilder) (zipentry)).append(((File) (s)).getAbsolutePath());
	//  161  324:aload_1         
	//  162  325:aload_3         
	//  163  326:invokevirtual   #273 <Method String File.getAbsolutePath()>
	//  164  329:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  165  332:pop             
		((StringBuilder) (zipentry)).append("\" (tmp of \"");
	//  166  333:aload_1         
	//  167  334:ldc2            #282 <String "\" (tmp of \"">
	//  168  337:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  169  340:pop             
		((StringBuilder) (zipentry)).append(file.getAbsolutePath());
	//  170  341:aload_1         
	//  171  342:aload_2         
	//  172  343:invokevirtual   #273 <Method String File.getAbsolutePath()>
	//  173  346:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  174  349:pop             
		((StringBuilder) (zipentry)).append("\")");
	//  175  350:aload_1         
	//  176  351:ldc2            #284 <String "\")">
	//  177  354:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  178  357:pop             
		throw new IOException(((StringBuilder) (zipentry)).toString());
	//  179  358:new             #71  <Class IOException>
	//  180  361:dup             
	//  181  362:aload_1         
	//  182  363:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  183  366:invokespecial   #278 <Method void IOException(String)>
	//  184  369:athrow          
		zipentry;
	//  185  370:astore_1        
		zipoutputstream.close();
	//  186  371:aload           6
	//  187  373:invokevirtual   #259 <Method void ZipOutputStream.close()>
		throw zipentry;
	//  188  376:aload_1         
	//  189  377:athrow          
		zipentry;
	//  190  378:astore_1        
		closeQuietly(((Closeable) (zipfile)));
	//  191  379:aload_0         
	//  192  380:invokestatic    #148 <Method void closeQuietly(Closeable)>
		((File) (s)).delete();
	//  193  383:aload_3         
	//  194  384:invokevirtual   #180 <Method boolean File.delete()>
	//  195  387:pop             
		throw zipentry;
	//  196  388:aload_1         
	//  197  389:athrow          
	}

	private static SharedPreferences getMultiDexPreferences(Context context)
	{
		byte byte0;
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #291 <Field int android.os.Build$VERSION.SDK_INT>
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
	//    9   16:ldc1            #54  <String "multidex.version">
	//   10   18:iload_1         
	//   11   19:invokevirtual   #297 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   22:areturn         
	}

	private static long getTimeStamp(File file)
	{
		long l1 = file.lastModified();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #301 <Method long File.lastModified()>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 == -1L)
	//*   5    7:lload_3         
	//*   6    8:ldc2w           #50  <Long -1L>
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
	//    1    1:invokestatic    #304 <Method long ZipUtil.getZipCrc(File)>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 == -1L)
	//*   5    7:lload_3         
	//*   6    8:ldc2w           #50  <Long -1L>
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
	//    1    1:invokestatic    #308 <Method SharedPreferences getMultiDexPreferences(Context)>
	//    2    4:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #80  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #81  <Method void StringBuilder()>
	//    6   12:astore          5
		stringbuilder.append(s);
	//    7   14:aload           5
	//    8   16:aload           4
	//    9   18:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		stringbuilder.append("timestamp");
	//   11   22:aload           5
	//   12   24:ldc1            #42  <String "timestamp">
	//   13   26:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		if(((SharedPreferences) (context)).getLong(stringbuilder.toString(), -1L) == getTimeStamp(file))
	//*  15   30:aload_0         
	//*  16   31:aload           5
	//*  17   33:invokevirtual   #100 <Method String StringBuilder.toString()>
	//*  18   36:ldc2w           #50  <Long -1L>
	//*  19   39:invokeinterface #314 <Method long SharedPreferences.getLong(String, long)>
	//*  20   44:aload_1         
	//*  21   45:invokestatic    #316 <Method long getTimeStamp(File)>
	//*  22   48:lcmp            
	//*  23   49:ifne            97
		{
			file = ((File) (new StringBuilder()));
	//   24   52:new             #80  <Class StringBuilder>
	//   25   55:dup             
	//   26   56:invokespecial   #81  <Method void StringBuilder()>
	//   27   59:astore_1        
			((StringBuilder) (file)).append(s);
	//   28   60:aload_1         
	//   29   61:aload           4
	//   30   63:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   31   66:pop             
			((StringBuilder) (file)).append("crc");
	//   32   67:aload_1         
	//   33   68:ldc1            #30  <String "crc">
	//   34   70:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   35   73:pop             
			if(((SharedPreferences) (context)).getLong(((StringBuilder) (file)).toString(), -1L) == l)
	//*  36   74:aload_0         
	//*  37   75:aload_1         
	//*  38   76:invokevirtual   #100 <Method String StringBuilder.toString()>
	//*  39   79:ldc2w           #50  <Long -1L>
	//*  40   82:invokeinterface #314 <Method long SharedPreferences.getLong(String, long)>
	//*  41   87:lload_2         
	//*  42   88:lcmp            
	//*  43   89:ifeq            95
	//*  44   92:goto            97
				return false;
	//   45   95:iconst_0        
	//   46   96:ireturn         
		}
		return true;
	//   47   97:iconst_1        
	//   48   98:ireturn         
	}

	private List loadExistingExtractions(Context context, String s)
		throws IOException
	{
		Log.i("MultiDex", "loading existing secondary dex files");
	//    0    0:ldc1            #57  <String "MultiDex">
	//    1    2:ldc2            #320 <String "loading existing secondary dex files">
	//    2    5:invokestatic    #106 <Method int Log.i(String, String)>
	//    3    8:pop             
		Object obj = ((Object) (new StringBuilder()));
	//    4    9:new             #80  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #81  <Method void StringBuilder()>
	//    7   16:astore          11
		((StringBuilder) (obj)).append(sourceApk.getName());
	//    8   18:aload           11
	//    9   20:aload_0         
	//   10   21:getfield        #108 <Field File sourceApk>
	//   11   24:invokevirtual   #323 <Method String File.getName()>
	//   12   27:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:pop             
		((StringBuilder) (obj)).append(".classes");
	//   14   31:aload           11
	//   15   33:ldc1            #24  <String ".classes">
	//   16   35:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
		String s1 = ((StringBuilder) (obj)).toString();
	//   18   39:aload           11
	//   19   41:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   20   44:astore          12
		obj = ((Object) (getMultiDexPreferences(context)));
	//   21   46:aload_1         
	//   22   47:invokestatic    #308 <Method SharedPreferences getMultiDexPreferences(Context)>
	//   23   50:astore          11
		context = ((Context) (new StringBuilder()));
	//   24   52:new             #80  <Class StringBuilder>
	//   25   55:dup             
	//   26   56:invokespecial   #81  <Method void StringBuilder()>
	//   27   59:astore_1        
		((StringBuilder) (context)).append(s);
	//   28   60:aload_1         
	//   29   61:aload_2         
	//   30   62:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
		((StringBuilder) (context)).append("dex.number");
	//   32   66:aload_1         
	//   33   67:ldc1            #36  <String "dex.number">
	//   34   69:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
		int j = ((SharedPreferences) (obj)).getInt(((StringBuilder) (context)).toString(), 1);
	//   36   73:aload           11
	//   37   75:aload_1         
	//   38   76:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   39   79:iconst_1        
	//   40   80:invokeinterface #327 <Method int SharedPreferences.getInt(String, int)>
	//   41   85:istore          4
		ArrayList arraylist = new ArrayList(j - 1);
	//   42   87:new             #329 <Class ArrayList>
	//   43   90:dup             
	//   44   91:iload           4
	//   45   93:iconst_1        
	//   46   94:isub            
	//   47   95:invokespecial   #332 <Method void ArrayList(int)>
	//   48   98:astore          13
		int i = 2;
	//   49  100:iconst_2        
	//   50  101:istore_3        
		context = ((Context) (s1));
	//   51  102:aload           12
	//   52  104:astore_1        
		while(i <= j) 
	//*  53  105:iload_3         
	//*  54  106:iload           4
	//*  55  108:icmpgt          479
		{
			Object obj1 = ((Object) (new StringBuilder()));
	//   56  111:new             #80  <Class StringBuilder>
	//   57  114:dup             
	//   58  115:invokespecial   #81  <Method void StringBuilder()>
	//   59  118:astore          12
			((StringBuilder) (obj1)).append(((String) (context)));
	//   60  120:aload           12
	//   61  122:aload_1         
	//   62  123:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   63  126:pop             
			((StringBuilder) (obj1)).append(i);
	//   64  127:aload           12
	//   65  129:iload_3         
	//   66  130:invokevirtual   #335 <Method StringBuilder StringBuilder.append(int)>
	//   67  133:pop             
			((StringBuilder) (obj1)).append(".zip");
	//   68  134:aload           12
	//   69  136:ldc1            #27  <String ".zip">
	//   70  138:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   71  141:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   72  142:aload           12
	//   73  144:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   74  147:astore          12
			obj1 = ((Object) (new ExtractedDex(dexDir, ((String) (obj1)))));
	//   75  149:new             #10  <Class MultiDexExtractor$ExtractedDex>
	//   76  152:dup             
	//   77  153:aload_0         
	//   78  154:getfield        #110 <Field File dexDir>
	//   79  157:aload           12
	//   80  159:invokespecial   #336 <Method void MultiDexExtractor$ExtractedDex(File, String)>
	//   81  162:astore          12
			if(((ExtractedDex) (obj1)).isFile())
	//*  82  164:aload           12
	//*  83  166:invokevirtual   #339 <Method boolean MultiDexExtractor$ExtractedDex.isFile()>
	//*  84  169:ifeq            433
			{
				obj1.crc = getZipCrc(((File) (obj1)));
	//   85  172:aload           12
	//   86  174:aload           12
	//   87  176:invokestatic    #114 <Method long getZipCrc(File)>
	//   88  179:putfield        #341 <Field long MultiDexExtractor$ExtractedDex.crc>
				StringBuilder stringbuilder = new StringBuilder();
	//   89  182:new             #80  <Class StringBuilder>
	//   90  185:dup             
	//   91  186:invokespecial   #81  <Method void StringBuilder()>
	//   92  189:astore          14
				stringbuilder.append(s);
	//   93  191:aload           14
	//   94  193:aload_2         
	//   95  194:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   96  197:pop             
				stringbuilder.append("dex.crc.");
	//   97  198:aload           14
	//   98  200:ldc1            #33  <String "dex.crc.">
	//   99  202:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  100  205:pop             
				stringbuilder.append(i);
	//  101  206:aload           14
	//  102  208:iload_3         
	//  103  209:invokevirtual   #335 <Method StringBuilder StringBuilder.append(int)>
	//  104  212:pop             
				long l = ((SharedPreferences) (obj)).getLong(stringbuilder.toString(), -1L);
	//  105  213:aload           11
	//  106  215:aload           14
	//  107  217:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  108  220:ldc2w           #50  <Long -1L>
	//  109  223:invokeinterface #314 <Method long SharedPreferences.getLong(String, long)>
	//  110  228:lstore          5
				stringbuilder = new StringBuilder();
	//  111  230:new             #80  <Class StringBuilder>
	//  112  233:dup             
	//  113  234:invokespecial   #81  <Method void StringBuilder()>
	//  114  237:astore          14
				stringbuilder.append(s);
	//  115  239:aload           14
	//  116  241:aload_2         
	//  117  242:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  118  245:pop             
				stringbuilder.append("dex.time.");
	//  119  246:aload           14
	//  120  248:ldc1            #39  <String "dex.time.">
	//  121  250:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  122  253:pop             
				stringbuilder.append(i);
	//  123  254:aload           14
	//  124  256:iload_3         
	//  125  257:invokevirtual   #335 <Method StringBuilder StringBuilder.append(int)>
	//  126  260:pop             
				long l1 = ((SharedPreferences) (obj)).getLong(stringbuilder.toString(), -1L);
	//  127  261:aload           11
	//  128  263:aload           14
	//  129  265:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  130  268:ldc2w           #50  <Long -1L>
	//  131  271:invokeinterface #314 <Method long SharedPreferences.getLong(String, long)>
	//  132  276:lstore          7
				long l2 = ((ExtractedDex) (obj1)).lastModified();
	//  133  278:aload           12
	//  134  280:invokevirtual   #342 <Method long MultiDexExtractor$ExtractedDex.lastModified()>
	//  135  283:lstore          9
				if(l1 == l2 && l == ((ExtractedDex) (obj1)).crc)
	//* 136  285:lload           7
	//* 137  287:lload           9
	//* 138  289:lcmp            
	//* 139  290:ifne            321
	//* 140  293:lload           5
	//* 141  295:aload           12
	//* 142  297:getfield        #341 <Field long MultiDexExtractor$ExtractedDex.crc>
	//* 143  300:lcmp            
	//* 144  301:ifne            321
				{
					((List) (arraylist)).add(obj1);
	//  145  304:aload           13
	//  146  306:aload           12
	//  147  308:invokeinterface #348 <Method boolean List.add(Object)>
	//  148  313:pop             
					i++;
	//  149  314:iload_3         
	//  150  315:iconst_1        
	//  151  316:iadd            
	//  152  317:istore_3        
				} else
	//* 153  318:goto            105
				{
					context = ((Context) (new StringBuilder()));
	//  154  321:new             #80  <Class StringBuilder>
	//  155  324:dup             
	//  156  325:invokespecial   #81  <Method void StringBuilder()>
	//  157  328:astore_1        
					((StringBuilder) (context)).append("Invalid extracted dex: ");
	//  158  329:aload_1         
	//  159  330:ldc2            #350 <String "Invalid extracted dex: ">
	//  160  333:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  161  336:pop             
					((StringBuilder) (context)).append(obj1);
	//  162  337:aload_1         
	//  163  338:aload           12
	//  164  340:invokevirtual   #353 <Method StringBuilder StringBuilder.append(Object)>
	//  165  343:pop             
					((StringBuilder) (context)).append(" (key \"");
	//  166  344:aload_1         
	//  167  345:ldc2            #355 <String " (key \"">
	//  168  348:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  169  351:pop             
					((StringBuilder) (context)).append(s);
	//  170  352:aload_1         
	//  171  353:aload_2         
	//  172  354:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  173  357:pop             
					((StringBuilder) (context)).append("\"), expected modification time: ");
	//  174  358:aload_1         
	//  175  359:ldc2            #357 <String "\"), expected modification time: ">
	//  176  362:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  177  365:pop             
					((StringBuilder) (context)).append(l1);
	//  178  366:aload_1         
	//  179  367:lload           7
	//  180  369:invokevirtual   #176 <Method StringBuilder StringBuilder.append(long)>
	//  181  372:pop             
					((StringBuilder) (context)).append(", modification time: ");
	//  182  373:aload_1         
	//  183  374:ldc2            #359 <String ", modification time: ">
	//  184  377:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  185  380:pop             
					((StringBuilder) (context)).append(l2);
	//  186  381:aload_1         
	//  187  382:lload           9
	//  188  384:invokevirtual   #176 <Method StringBuilder StringBuilder.append(long)>
	//  189  387:pop             
					((StringBuilder) (context)).append(", expected crc: ");
	//  190  388:aload_1         
	//  191  389:ldc2            #361 <String ", expected crc: ">
	//  192  392:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  193  395:pop             
					((StringBuilder) (context)).append(l);
	//  194  396:aload_1         
	//  195  397:lload           5
	//  196  399:invokevirtual   #176 <Method StringBuilder StringBuilder.append(long)>
	//  197  402:pop             
					((StringBuilder) (context)).append(", file crc: ");
	//  198  403:aload_1         
	//  199  404:ldc2            #363 <String ", file crc: ">
	//  200  407:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  201  410:pop             
					((StringBuilder) (context)).append(((ExtractedDex) (obj1)).crc);
	//  202  411:aload_1         
	//  203  412:aload           12
	//  204  414:getfield        #341 <Field long MultiDexExtractor$ExtractedDex.crc>
	//  205  417:invokevirtual   #176 <Method StringBuilder StringBuilder.append(long)>
	//  206  420:pop             
					throw new IOException(((StringBuilder) (context)).toString());
	//  207  421:new             #71  <Class IOException>
	//  208  424:dup             
	//  209  425:aload_1         
	//  210  426:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  211  429:invokespecial   #278 <Method void IOException(String)>
	//  212  432:athrow          
				}
			} else
			{
				context = ((Context) (new StringBuilder()));
	//  213  433:new             #80  <Class StringBuilder>
	//  214  436:dup             
	//  215  437:invokespecial   #81  <Method void StringBuilder()>
	//  216  440:astore_1        
				((StringBuilder) (context)).append("Missing extracted secondary dex file '");
	//  217  441:aload_1         
	//  218  442:ldc2            #365 <String "Missing extracted secondary dex file '">
	//  219  445:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  220  448:pop             
				((StringBuilder) (context)).append(((ExtractedDex) (obj1)).getPath());
	//  221  449:aload_1         
	//  222  450:aload           12
	//  223  452:invokevirtual   #366 <Method String MultiDexExtractor$ExtractedDex.getPath()>
	//  224  455:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  225  458:pop             
				((StringBuilder) (context)).append("'");
	//  226  459:aload_1         
	//  227  460:ldc2            #368 <String "'">
	//  228  463:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  229  466:pop             
				throw new IOException(((StringBuilder) (context)).toString());
	//  230  467:new             #71  <Class IOException>
	//  231  470:dup             
	//  232  471:aload_1         
	//  233  472:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  234  475:invokespecial   #278 <Method void IOException(String)>
	//  235  478:athrow          
			}
		}
		return ((List) (arraylist));
	//  236  479:aload           13
	//  237  481:areturn         
	}

	private List performExtractions()
		throws IOException
	{
		int i;
		ZipFile zipfile;
		ArrayList arraylist;
		String s;
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #80  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append(sourceApk.getName());
	//    4    9:aload           6
	//    5   11:aload_0         
	//    6   12:getfield        #108 <Field File sourceApk>
	//    7   15:invokevirtual   #323 <Method String File.getName()>
	//    8   18:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
		stringbuilder.append(".classes");
	//   10   22:aload           6
	//   11   24:ldc1            #24  <String ".classes">
	//   12   26:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		s = stringbuilder.toString();
	//   14   30:aload           6
	//   15   32:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   16   35:astore          10
		clearDexDir();
	//   17   37:aload_0         
	//   18   38:invokespecial   #374 <Method void clearDexDir()>
		arraylist = new ArrayList();
	//   19   41:new             #329 <Class ArrayList>
	//   20   44:dup             
	//   21   45:invokespecial   #375 <Method void ArrayList()>
	//   22   48:astore          9
		zipfile = new ZipFile(sourceApk);
	//   23   50:new             #198 <Class ZipFile>
	//   24   53:dup             
	//   25   54:aload_0         
	//   26   55:getfield        #108 <Field File sourceApk>
	//   27   58:invokespecial   #376 <Method void ZipFile(File)>
	//   28   61:astore          8
		i = 2;
	//   29   63:iconst_2        
	//   30   64:istore_2        
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//   31   65:new             #80  <Class StringBuilder>
	//   32   68:dup             
	//   33   69:invokespecial   #81  <Method void StringBuilder()>
	//   34   72:astore          6
		((StringBuilder) (obj)).append("classes");
	//   35   74:aload           6
	//   36   76:ldc1            #18  <String "classes">
	//   37   78:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   38   81:pop             
		((StringBuilder) (obj)).append(2);
	//   39   82:aload           6
	//   40   84:iconst_2        
	//   41   85:invokevirtual   #335 <Method StringBuilder StringBuilder.append(int)>
	//   42   88:pop             
		((StringBuilder) (obj)).append(".dex");
	//   43   89:aload           6
	//   44   91:ldc1            #21  <String ".dex">
	//   45   93:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   46   96:pop             
		obj = ((Object) (zipfile.getEntry(((StringBuilder) (obj)).toString())));
	//   47   97:aload           8
	//   48   99:aload           6
	//   49  101:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   50  104:invokevirtual   #380 <Method ZipEntry ZipFile.getEntry(String)>
	//   51  107:astore          6
_L3:
		if(obj == null)
			break MISSING_BLOCK_LABEL_627;
	//   52  109:aload           6
	//   53  111:ifnull          627
		ExtractedDex extracteddex;
		Object obj1 = ((Object) (new StringBuilder()));
	//   54  114:new             #80  <Class StringBuilder>
	//   55  117:dup             
	//   56  118:invokespecial   #81  <Method void StringBuilder()>
	//   57  121:astore          7
		((StringBuilder) (obj1)).append(s);
	//   58  123:aload           7
	//   59  125:aload           10
	//   60  127:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   61  130:pop             
		((StringBuilder) (obj1)).append(i);
	//   62  131:aload           7
	//   63  133:iload_2         
	//   64  134:invokevirtual   #335 <Method StringBuilder StringBuilder.append(int)>
	//   65  137:pop             
		((StringBuilder) (obj1)).append(".zip");
	//   66  138:aload           7
	//   67  140:ldc1            #27  <String ".zip">
	//   68  142:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   69  145:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   70  146:aload           7
	//   71  148:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   72  151:astore          7
		extracteddex = new ExtractedDex(dexDir, ((String) (obj1)));
	//   73  153:new             #10  <Class MultiDexExtractor$ExtractedDex>
	//   74  156:dup             
	//   75  157:aload_0         
	//   76  158:getfield        #110 <Field File dexDir>
	//   77  161:aload           7
	//   78  163:invokespecial   #336 <Method void MultiDexExtractor$ExtractedDex(File, String)>
	//   79  166:astore          11
		((List) (arraylist)).add(((Object) (extracteddex)));
	//   80  168:aload           9
	//   81  170:aload           11
	//   82  172:invokeinterface #348 <Method boolean List.add(Object)>
	//   83  177:pop             
		obj1 = ((Object) (new StringBuilder()));
	//   84  178:new             #80  <Class StringBuilder>
	//   85  181:dup             
	//   86  182:invokespecial   #81  <Method void StringBuilder()>
	//   87  185:astore          7
		((StringBuilder) (obj1)).append("Extraction is needed for file ");
	//   88  187:aload           7
	//   89  189:ldc2            #382 <String "Extraction is needed for file ">
	//   90  192:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   91  195:pop             
		((StringBuilder) (obj1)).append(((Object) (extracteddex)));
	//   92  196:aload           7
	//   93  198:aload           11
	//   94  200:invokevirtual   #353 <Method StringBuilder StringBuilder.append(Object)>
	//   95  203:pop             
		Log.i("MultiDex", ((StringBuilder) (obj1)).toString());
	//   96  204:ldc1            #57  <String "MultiDex">
	//   97  206:aload           7
	//   98  208:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   99  211:invokestatic    #106 <Method int Log.i(String, String)>
	//  100  214:pop             
		int j;
		int k;
		k = 0;
	//  101  215:iconst_0        
	//  102  216:istore          4
		j = k;
	//  103  218:iload           4
	//  104  220:istore_3        
_L2:
		int l;
		if(k >= 3 || j != 0)
			break; /* Loop/switch isn't completed */
	//  105  221:iload           4
	//  106  223:iconst_3        
	//  107  224:icmpge          506
	//  108  227:iload_3         
	//  109  228:ifne            506
		l = k + 1;
	//  110  231:iload           4
	//  111  233:iconst_1        
	//  112  234:iadd            
	//  113  235:istore          5
		extract(zipfile, ((ZipEntry) (obj)), ((File) (extracteddex)), s);
	//  114  237:aload           8
	//  115  239:aload           6
	//  116  241:aload           11
	//  117  243:aload           10
	//  118  245:invokestatic    #384 <Method void extract(ZipFile, ZipEntry, File, String)>
		extracteddex.crc = getZipCrc(((File) (extracteddex)));
	//  119  248:aload           11
	//  120  250:aload           11
	//  121  252:invokestatic    #114 <Method long getZipCrc(File)>
	//  122  255:putfield        #341 <Field long MultiDexExtractor$ExtractedDex.crc>
		boolean flag;
		flag = true;
	//  123  258:iconst_1        
	//  124  259:istore_1        
		break MISSING_BLOCK_LABEL_309;
	//  125  260:goto            309
		IOException ioexception1;
		ioexception1;
	//  126  263:astore          7
		StringBuilder stringbuilder2 = new StringBuilder();
	//  127  265:new             #80  <Class StringBuilder>
	//  128  268:dup             
	//  129  269:invokespecial   #81  <Method void StringBuilder()>
	//  130  272:astore          12
		stringbuilder2.append("Failed to read crc from ");
	//  131  274:aload           12
	//  132  276:ldc2            #386 <String "Failed to read crc from ">
	//  133  279:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  134  282:pop             
		stringbuilder2.append(extracteddex.getAbsolutePath());
	//  135  283:aload           12
	//  136  285:aload           11
	//  137  287:invokevirtual   #387 <Method String MultiDexExtractor$ExtractedDex.getAbsolutePath()>
	//  138  290:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  139  293:pop             
		Log.w("MultiDex", stringbuilder2.toString(), ((Throwable) (ioexception1)));
	//  140  294:ldc1            #57  <String "MultiDex">
	//  141  296:aload           12
	//  142  298:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  143  301:aload           7
	//  144  303:invokestatic    #192 <Method int Log.w(String, String, Throwable)>
	//  145  306:pop             
		flag = false;
	//  146  307:iconst_0        
	//  147  308:istore_1        
		StringBuilder stringbuilder3;
		stringbuilder3 = new StringBuilder();
	//  148  309:new             #80  <Class StringBuilder>
	//  149  312:dup             
	//  150  313:invokespecial   #81  <Method void StringBuilder()>
	//  151  316:astore          12
		stringbuilder3.append("Extraction ");
	//  152  318:aload           12
	//  153  320:ldc2            #389 <String "Extraction ">
	//  154  323:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  155  326:pop             
		Exception exception;
		Object obj2;
		if(flag)
	//* 156  327:iload_1         
	//* 157  328:ifeq            675
			obj2 = "succeeded";
	//  158  331:ldc2            #391 <String "succeeded">
	//  159  334:astore          7
		else
	//* 160  336:goto            339
	//* 161  339:aload           12
	//* 162  341:aload           7
	//* 163  343:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 164  346:pop             
	//* 165  347:aload           12
	//* 166  349:ldc2            #393 <String " '">
	//* 167  352:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 168  355:pop             
	//* 169  356:aload           12
	//* 170  358:aload           11
	//* 171  360:invokevirtual   #387 <Method String MultiDexExtractor$ExtractedDex.getAbsolutePath()>
	//* 172  363:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 173  366:pop             
	//* 174  367:aload           12
	//* 175  369:ldc2            #395 <String "': length ">
	//* 176  372:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 177  375:pop             
	//* 178  376:aload           12
	//* 179  378:aload           11
	//* 180  380:invokevirtual   #396 <Method long MultiDexExtractor$ExtractedDex.length()>
	//* 181  383:invokevirtual   #176 <Method StringBuilder StringBuilder.append(long)>
	//* 182  386:pop             
	//* 183  387:aload           12
	//* 184  389:ldc2            #398 <String " - crc: ">
	//* 185  392:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 186  395:pop             
	//* 187  396:aload           12
	//* 188  398:aload           11
	//* 189  400:getfield        #341 <Field long MultiDexExtractor$ExtractedDex.crc>
	//* 190  403:invokevirtual   #176 <Method StringBuilder StringBuilder.append(long)>
	//* 191  406:pop             
	//* 192  407:ldc1            #57  <String "MultiDex">
	//* 193  409:aload           12
	//* 194  411:invokevirtual   #100 <Method String StringBuilder.toString()>
	//* 195  414:invokestatic    #106 <Method int Log.i(String, String)>
	//* 196  417:pop             
	//* 197  418:iload           5
	//* 198  420:istore          4
	//* 199  422:iload_1         
	//* 200  423:istore_3        
	//* 201  424:iload_1         
	//* 202  425:ifne            221
	//* 203  428:aload           11
	//* 204  430:invokevirtual   #399 <Method boolean MultiDexExtractor$ExtractedDex.delete()>
	//* 205  433:pop             
	//* 206  434:iload           5
	//* 207  436:istore          4
	//* 208  438:iload_1         
	//* 209  439:istore_3        
	//* 210  440:aload           11
	//* 211  442:invokevirtual   #402 <Method boolean MultiDexExtractor$ExtractedDex.exists()>
	//* 212  445:ifeq            221
	//* 213  448:new             #80  <Class StringBuilder>
	//* 214  451:dup             
	//* 215  452:invokespecial   #81  <Method void StringBuilder()>
	//* 216  455:astore          7
	//* 217  457:aload           7
	//* 218  459:ldc2            #404 <String "Failed to delete corrupted secondary dex '">
	//* 219  462:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 220  465:pop             
	//* 221  466:aload           7
	//* 222  468:aload           11
	//* 223  470:invokevirtual   #366 <Method String MultiDexExtractor$ExtractedDex.getPath()>
	//* 224  473:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 225  476:pop             
	//* 226  477:aload           7
	//* 227  479:ldc2            #368 <String "'">
	//* 228  482:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 229  485:pop             
	//* 230  486:ldc1            #57  <String "MultiDex">
	//* 231  488:aload           7
	//* 232  490:invokevirtual   #100 <Method String StringBuilder.toString()>
	//* 233  493:invokestatic    #165 <Method int Log.w(String, String)>
	//* 234  496:pop             
	//* 235  497:iload           5
	//* 236  499:istore          4
	//* 237  501:iload_1         
	//* 238  502:istore_3        
	//* 239  503:goto            221
	//* 240  506:iload_3         
	//* 241  507:ifeq            561
	//* 242  510:iload_2         
	//* 243  511:iconst_1        
	//* 244  512:iadd            
	//* 245  513:istore_2        
	//* 246  514:new             #80  <Class StringBuilder>
	//* 247  517:dup             
	//* 248  518:invokespecial   #81  <Method void StringBuilder()>
	//* 249  521:astore          6
	//* 250  523:aload           6
	//* 251  525:ldc1            #18  <String "classes">
	//* 252  527:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 253  530:pop             
	//* 254  531:aload           6
	//* 255  533:iload_2         
	//* 256  534:invokevirtual   #335 <Method StringBuilder StringBuilder.append(int)>
	//* 257  537:pop             
	//* 258  538:aload           6
	//* 259  540:ldc1            #21  <String ".dex">
	//* 260  542:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 261  545:pop             
	//* 262  546:aload           8
	//* 263  548:aload           6
	//* 264  550:invokevirtual   #100 <Method String StringBuilder.toString()>
	//* 265  553:invokevirtual   #380 <Method ZipEntry ZipFile.getEntry(String)>
	//* 266  556:astore          6
	//* 267  558:goto            109
	//* 268  561:new             #80  <Class StringBuilder>
	//* 269  564:dup             
	//* 270  565:invokespecial   #81  <Method void StringBuilder()>
	//* 271  568:astore          6
	//* 272  570:aload           6
	//* 273  572:ldc2            #406 <String "Could not create zip file ">
	//* 274  575:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 275  578:pop             
	//* 276  579:aload           6
	//* 277  581:aload           11
	//* 278  583:invokevirtual   #387 <Method String MultiDexExtractor$ExtractedDex.getAbsolutePath()>
	//* 279  586:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 280  589:pop             
	//* 281  590:aload           6
	//* 282  592:ldc2            #408 <String " for secondary dex (">
	//* 283  595:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 284  598:pop             
	//* 285  599:aload           6
	//* 286  601:iload_2         
	//* 287  602:invokevirtual   #335 <Method StringBuilder StringBuilder.append(int)>
	//* 288  605:pop             
	//* 289  606:aload           6
	//* 290  608:ldc1            #97  <String ")">
	//* 291  610:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//* 292  613:pop             
	//* 293  614:new             #71  <Class IOException>
	//* 294  617:dup             
	//* 295  618:aload           6
	//* 296  620:invokevirtual   #100 <Method String StringBuilder.toString()>
	//* 297  623:invokespecial   #278 <Method void IOException(String)>
	//* 298  626:athrow          
	//* 299  627:aload           8
	//* 300  629:invokevirtual   #409 <Method void ZipFile.close()>
	//* 301  632:aload           9
	//* 302  634:areturn         
	//* 303  635:astore          6
	//* 304  637:ldc1            #57  <String "MultiDex">
	//* 305  639:ldc1            #189 <String "Failed to close resource">
	//* 306  641:aload           6
	//* 307  643:invokestatic    #192 <Method int Log.w(String, String, Throwable)>
	//* 308  646:pop             
	//* 309  647:aload           9
	//* 310  649:areturn         
	//* 311  650:astore          6
	//* 312  652:aload           8
	//* 313  654:invokevirtual   #409 <Method void ZipFile.close()>
	//* 314  657:goto            672
	//* 315  660:astore          7
	//* 316  662:ldc1            #57  <String "MultiDex">
	//* 317  664:ldc1            #189 <String "Failed to close resource">
	//* 318  666:aload           7
	//* 319  668:invokestatic    #192 <Method int Log.w(String, String, Throwable)>
	//* 320  671:pop             
	//* 321  672:aload           6
	//* 322  674:athrow          
			obj2 = "failed";
	//  323  675:ldc2            #411 <String "failed">
	//  324  678:astore          7
		stringbuilder3.append(((String) (obj2)));
		stringbuilder3.append(" '");
		stringbuilder3.append(extracteddex.getAbsolutePath());
		stringbuilder3.append("': length ");
		stringbuilder3.append(extracteddex.length());
		stringbuilder3.append(" - crc: ");
		stringbuilder3.append(extracteddex.crc);
		Log.i("MultiDex", stringbuilder3.toString());
		k = l;
		j = ((int) (flag));
		if(flag)
			continue; /* Loop/switch isn't completed */
		extracteddex.delete();
		k = l;
		j = ((int) (flag));
		if(!extracteddex.exists())
			continue; /* Loop/switch isn't completed */
		obj2 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj2)).append("Failed to delete corrupted secondary dex '");
		((StringBuilder) (obj2)).append(extracteddex.getPath());
		((StringBuilder) (obj2)).append("'");
		Log.w("MultiDex", ((StringBuilder) (obj2)).toString());
		k = l;
		j = ((int) (flag));
		if(true) goto _L2; else goto _L1
_L1:
		if(j == 0)
			break MISSING_BLOCK_LABEL_561;
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
	//* 325  680:goto            339
	}

	private static void putStoredApkInfo(Context context, String s, long l, long l1, List list)
	{
		context = ((Context) (getMultiDexPreferences(context).edit()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #308 <Method SharedPreferences getMultiDexPreferences(Context)>
	//    2    4:invokeinterface #418 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #80  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #81  <Method void StringBuilder()>
	//    7   17:astore          8
		stringbuilder.append(s);
	//    8   19:aload           8
	//    9   21:aload_1         
	//   10   22:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
		stringbuilder.append("timestamp");
	//   12   26:aload           8
	//   13   28:ldc1            #42  <String "timestamp">
	//   14   30:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
		((android.content.SharedPreferences.Editor) (context)).putLong(stringbuilder.toString(), l);
	//   16   34:aload_0         
	//   17   35:aload           8
	//   18   37:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   19   40:lload_2         
	//   20   41:invokeinterface #424 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   21   46:pop             
		stringbuilder = new StringBuilder();
	//   22   47:new             #80  <Class StringBuilder>
	//   23   50:dup             
	//   24   51:invokespecial   #81  <Method void StringBuilder()>
	//   25   54:astore          8
		stringbuilder.append(s);
	//   26   56:aload           8
	//   27   58:aload_1         
	//   28   59:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
		stringbuilder.append("crc");
	//   30   63:aload           8
	//   31   65:ldc1            #30  <String "crc">
	//   32   67:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
		((android.content.SharedPreferences.Editor) (context)).putLong(stringbuilder.toString(), l1);
	//   34   71:aload_0         
	//   35   72:aload           8
	//   36   74:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   37   77:lload           4
	//   38   79:invokeinterface #424 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   39   84:pop             
		stringbuilder = new StringBuilder();
	//   40   85:new             #80  <Class StringBuilder>
	//   41   88:dup             
	//   42   89:invokespecial   #81  <Method void StringBuilder()>
	//   43   92:astore          8
		stringbuilder.append(s);
	//   44   94:aload           8
	//   45   96:aload_1         
	//   46   97:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   47  100:pop             
		stringbuilder.append("dex.number");
	//   48  101:aload           8
	//   49  103:ldc1            #36  <String "dex.number">
	//   50  105:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   51  108:pop             
		((android.content.SharedPreferences.Editor) (context)).putInt(stringbuilder.toString(), list.size() + 1);
	//   52  109:aload_0         
	//   53  110:aload           8
	//   54  112:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   55  115:aload           6
	//   56  117:invokeinterface #428 <Method int List.size()>
	//   57  122:iconst_1        
	//   58  123:iadd            
	//   59  124:invokeinterface #432 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   60  129:pop             
		list = ((List) (list.iterator()));
	//   61  130:aload           6
	//   62  132:invokeinterface #436 <Method Iterator List.iterator()>
	//   63  137:astore          6
		for(int i = 2; ((Iterator) (list)).hasNext(); i++)
	//*  64  139:iconst_2        
	//*  65  140:istore          7
	//*  66  142:aload           6
	//*  67  144:invokeinterface #441 <Method boolean Iterator.hasNext()>
	//*  68  149:ifeq            271
		{
			ExtractedDex extracteddex = (ExtractedDex)((Iterator) (list)).next();
	//   69  152:aload           6
	//   70  154:invokeinterface #445 <Method Object Iterator.next()>
	//   71  159:checkcast       #10  <Class MultiDexExtractor$ExtractedDex>
	//   72  162:astore          8
			StringBuilder stringbuilder1 = new StringBuilder();
	//   73  164:new             #80  <Class StringBuilder>
	//   74  167:dup             
	//   75  168:invokespecial   #81  <Method void StringBuilder()>
	//   76  171:astore          9
			stringbuilder1.append(s);
	//   77  173:aload           9
	//   78  175:aload_1         
	//   79  176:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   80  179:pop             
			stringbuilder1.append("dex.crc.");
	//   81  180:aload           9
	//   82  182:ldc1            #33  <String "dex.crc.">
	//   83  184:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   84  187:pop             
			stringbuilder1.append(i);
	//   85  188:aload           9
	//   86  190:iload           7
	//   87  192:invokevirtual   #335 <Method StringBuilder StringBuilder.append(int)>
	//   88  195:pop             
			((android.content.SharedPreferences.Editor) (context)).putLong(stringbuilder1.toString(), extracteddex.crc);
	//   89  196:aload_0         
	//   90  197:aload           9
	//   91  199:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   92  202:aload           8
	//   93  204:getfield        #341 <Field long MultiDexExtractor$ExtractedDex.crc>
	//   94  207:invokeinterface #424 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   95  212:pop             
			stringbuilder1 = new StringBuilder();
	//   96  213:new             #80  <Class StringBuilder>
	//   97  216:dup             
	//   98  217:invokespecial   #81  <Method void StringBuilder()>
	//   99  220:astore          9
			stringbuilder1.append(s);
	//  100  222:aload           9
	//  101  224:aload_1         
	//  102  225:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  103  228:pop             
			stringbuilder1.append("dex.time.");
	//  104  229:aload           9
	//  105  231:ldc1            #39  <String "dex.time.">
	//  106  233:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  107  236:pop             
			stringbuilder1.append(i);
	//  108  237:aload           9
	//  109  239:iload           7
	//  110  241:invokevirtual   #335 <Method StringBuilder StringBuilder.append(int)>
	//  111  244:pop             
			((android.content.SharedPreferences.Editor) (context)).putLong(stringbuilder1.toString(), extracteddex.lastModified());
	//  112  245:aload_0         
	//  113  246:aload           9
	//  114  248:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  115  251:aload           8
	//  116  253:invokevirtual   #342 <Method long MultiDexExtractor$ExtractedDex.lastModified()>
	//  117  256:invokeinterface #424 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//  118  261:pop             
		}

	//  119  262:iload           7
	//  120  264:iconst_1        
	//  121  265:iadd            
	//  122  266:istore          7
	//* 123  268:goto            142
		((android.content.SharedPreferences.Editor) (context)).commit();
	//  124  271:aload_0         
	//  125  272:invokeinterface #448 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//  126  277:pop             
	//  127  278:return          
	}

	public void close()
		throws IOException
	{
		cacheLock.release();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field FileLock cacheLock>
	//    2    4:invokevirtual   #454 <Method void FileLock.release()>
		lockChannel.close();
	//    3    7:aload_0         
	//    4    8:getfield        #132 <Field FileChannel lockChannel>
	//    5   11:invokevirtual   #455 <Method void FileChannel.close()>
		lockRaf.close();
	//    6   14:aload_0         
	//    7   15:getfield        #126 <Field RandomAccessFile lockRaf>
	//    8   18:invokevirtual   #456 <Method void RandomAccessFile.close()>
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
	//    0    0:new             #80  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void StringBuilder()>
	//    3    7:astore          4
				((StringBuilder) (obj)).append("MultiDexExtractor.load(");
	//    4    9:aload           4
	//    5   11:ldc2            #460 <String "MultiDexExtractor.load(">
	//    6   14:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
				((StringBuilder) (obj)).append(sourceApk.getPath());
	//    8   18:aload           4
	//    9   20:aload_0         
	//   10   21:getfield        #108 <Field File sourceApk>
	//   11   24:invokevirtual   #93  <Method String File.getPath()>
	//   12   27:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:pop             
				((StringBuilder) (obj)).append(", ");
	//   14   31:aload           4
	//   15   33:ldc1            #95  <String ", ">
	//   16   35:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
				((StringBuilder) (obj)).append(flag);
	//   18   39:aload           4
	//   19   41:iload_3         
	//   20   42:invokevirtual   #463 <Method StringBuilder StringBuilder.append(boolean)>
	//   21   45:pop             
				((StringBuilder) (obj)).append(", ");
	//   22   46:aload           4
	//   23   48:ldc1            #95  <String ", ">
	//   24   50:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
				((StringBuilder) (obj)).append(s);
	//   26   54:aload           4
	//   27   56:aload_2         
	//   28   57:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
				((StringBuilder) (obj)).append(")");
	//   30   61:aload           4
	//   31   63:ldc1            #97  <String ")">
	//   32   65:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   33   68:pop             
				Log.i("MultiDex", ((StringBuilder) (obj)).toString());
	//   34   69:ldc1            #57  <String "MultiDex">
	//   35   71:aload           4
	//   36   73:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   37   76:invokestatic    #106 <Method int Log.i(String, String)>
	//   38   79:pop             
				if(!cacheLock.isValid())
					break label0;
	//   39   80:aload_0         
	//   40   81:getfield        #142 <Field FileLock cacheLock>
	//   41   84:invokevirtual   #466 <Method boolean FileLock.isValid()>
	//   42   87:ifeq            266
				if(!flag && !isModified(context, sourceApk, sourceCrc, s))
	//*  43   90:iload_3         
	//*  44   91:ifne            167
	//*  45   94:aload_1         
	//*  46   95:aload_0         
	//*  47   96:getfield        #108 <Field File sourceApk>
	//*  48   99:aload_0         
	//*  49  100:getfield        #116 <Field long sourceCrc>
	//*  50  103:aload_2         
	//*  51  104:invokestatic    #468 <Method boolean isModified(Context, File, long, String)>
	//*  52  107:ifne            167
				{
					try
					{
						obj = ((Object) (loadExistingExtractions(context, s)));
	//   53  110:aload_0         
	//   54  111:aload_1         
	//   55  112:aload_2         
	//   56  113:invokespecial   #470 <Method List loadExistingExtractions(Context, String)>
	//   57  116:astore          4
					}
	//*  58  118:aload           4
	//*  59  120:astore_1        
	//*  60  121:goto            219
					catch(IOException ioexception)
	//*  61  124:astore          4
					{
						Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", ((Throwable) (ioexception)));
	//   62  126:ldc1            #57  <String "MultiDex">
	//   63  128:ldc2            #472 <String "Failed to reload existing extracted secondary dex files, falling back to fresh extraction">
	//   64  131:aload           4
	//   65  133:invokestatic    #192 <Method int Log.w(String, String, Throwable)>
	//   66  136:pop             
						ioexception = ((IOException) (performExtractions()));
	//   67  137:aload_0         
	//   68  138:invokespecial   #474 <Method List performExtractions()>
	//   69  141:astore          4
						putStoredApkInfo(context, s, getTimeStamp(sourceApk), sourceCrc, ((List) (ioexception)));
	//   70  143:aload_1         
	//   71  144:aload_2         
	//   72  145:aload_0         
	//   73  146:getfield        #108 <Field File sourceApk>
	//   74  149:invokestatic    #316 <Method long getTimeStamp(File)>
	//   75  152:aload_0         
	//   76  153:getfield        #116 <Field long sourceCrc>
	//   77  156:aload           4
	//   78  158:invokestatic    #476 <Method void putStoredApkInfo(Context, String, long, long, List)>
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
	//   84  171:ldc1            #57  <String "MultiDex">
	//   85  173:ldc2            #478 <String "Forced extraction must be performed.">
	//   86  176:invokestatic    #106 <Method int Log.i(String, String)>
	//   87  179:pop             
				else
	//*  88  180:goto            192
					Log.i("MultiDex", "Detected that extraction must be performed.");
	//   89  183:ldc1            #57  <String "MultiDex">
	//   90  185:ldc2            #480 <String "Detected that extraction must be performed.">
	//   91  188:invokestatic    #106 <Method int Log.i(String, String)>
	//   92  191:pop             
				ioexception = ((IOException) (performExtractions()));
	//   93  192:aload_0         
	//   94  193:invokespecial   #474 <Method List performExtractions()>
	//   95  196:astore          4
				putStoredApkInfo(context, s, getTimeStamp(sourceApk), sourceCrc, ((List) (ioexception)));
	//   96  198:aload_1         
	//   97  199:aload_2         
	//   98  200:aload_0         
	//   99  201:getfield        #108 <Field File sourceApk>
	//  100  204:invokestatic    #316 <Method long getTimeStamp(File)>
	//  101  207:aload_0         
	//  102  208:getfield        #116 <Field long sourceCrc>
	//  103  211:aload           4
	//  104  213:invokestatic    #476 <Method void putStoredApkInfo(Context, String, long, long, List)>
				context = ((Context) (ioexception));
	//  105  216:aload           4
	//  106  218:astore_1        
			}
			s = ((String) (new StringBuilder()));
	//  107  219:new             #80  <Class StringBuilder>
	//  108  222:dup             
	//  109  223:invokespecial   #81  <Method void StringBuilder()>
	//  110  226:astore_2        
			((StringBuilder) (s)).append("load found ");
	//  111  227:aload_2         
	//  112  228:ldc2            #482 <String "load found ">
	//  113  231:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  114  234:pop             
			((StringBuilder) (s)).append(((List) (context)).size());
	//  115  235:aload_2         
	//  116  236:aload_1         
	//  117  237:invokeinterface #428 <Method int List.size()>
	//  118  242:invokevirtual   #335 <Method StringBuilder StringBuilder.append(int)>
	//  119  245:pop             
			((StringBuilder) (s)).append(" secondary dex files");
	//  120  246:aload_2         
	//  121  247:ldc2            #484 <String " secondary dex files">
	//  122  250:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  123  253:pop             
			Log.i("MultiDex", ((StringBuilder) (s)).toString());
	//  124  254:ldc1            #57  <String "MultiDex">
	//  125  256:aload_2         
	//  126  257:invokevirtual   #100 <Method String StringBuilder.toString()>
	//  127  260:invokestatic    #106 <Method int Log.i(String, String)>
	//  128  263:pop             
			return ((List) (context));
	//  129  264:aload_1         
	//  130  265:areturn         
		}
		throw new IllegalStateException("MultiDexExtractor was closed");
	//  131  266:new             #486 <Class IllegalStateException>
	//  132  269:dup             
	//  133  270:ldc2            #488 <String "MultiDexExtractor was closed">
	//  134  273:invokespecial   #489 <Method void IllegalStateException(String)>
	//  135  276:athrow          
	}

	private static final int BUFFER_SIZE = 16384;
	private static final String DEX_PREFIX = "classes";
	static final String DEX_SUFFIX = ".dex";
	private static final String EXTRACTED_NAME_EXT = ".classes";
	static final String EXTRACTED_SUFFIX = ".zip";
	private static final String KEY_CRC = "crc";
	private static final String KEY_DEX_CRC = "dex.crc.";
	private static final String KEY_DEX_NUMBER = "dex.number";
	private static final String KEY_DEX_TIME = "dex.time.";
	private static final String KEY_TIME_STAMP = "timestamp";
	private static final String LOCK_FILENAME = "MultiDex.lock";
	private static final int MAX_EXTRACT_ATTEMPTS = 3;
	private static final long NO_VALUE = -1L;
	private static final String PREFS_FILE = "multidex.version";
	private static final String TAG = "MultiDex";
	private final FileLock cacheLock;
	private final File dexDir;
	private final FileChannel lockChannel;
	private final RandomAccessFile lockRaf;
	private final File sourceApk;
	private final long sourceCrc;
}
