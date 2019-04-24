// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.*;

// Referenced classes of package android.support.multidex:
//			ZipUtil

final class MultiDexExtractor
{

	MultiDexExtractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
	//    2    4:return          
	}

	private static void apply(android.content.SharedPreferences.Editor editor)
	{
		if(sApplyMethod != null)
	//*   0    0:getstatic       #61  <Field Method sApplyMethod>
	//*   1    3:ifnull          20
			try
			{
				sApplyMethod.invoke(((Object) (editor)), new Object[0]);
	//    2    6:getstatic       #61  <Field Method sApplyMethod>
	//    3    9:aload_0         
	//    4   10:iconst_0        
	//    5   11:anewarray       Object[]
	//    6   14:invokevirtual   #76  <Method Object Method.invoke(Object, Object[])>
	//    7   17:pop             
				return;
	//    8   18:return          
			}
	//*   9   19:astore_1        
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #80  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//*  12   26:pop             
	//*  13   27:return          
			catch(InvocationTargetException invocationtargetexception) { }
	//   14   28:astore_1        
			catch(IllegalAccessException illegalaccessexception) { }
		editor.commit();
	//*  15   29:goto            20
	}

	private static void closeQuietly(Closeable closeable)
	{
		try
		{
			closeable.close();
	//    0    0:aload_0         
	//    1    1:invokeinterface #89  <Method void Closeable.close()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   3    7:astore_0        
		{
			Log.w("MultiDex", "Failed to close resource", ((Throwable) (closeable)));
	//    4    8:ldc1            #43  <String "MultiDex">
	//    5   10:ldc1            #91  <String "Failed to close resource">
	//    6   12:aload_0         
	//    7   13:invokestatic    #97  <Method int Log.w(String, String, Throwable)>
	//    8   16:pop             
		}
	//    9   17:return          
	}

	private static void extract(ZipFile zipfile, ZipEntry zipentry, File file, String s)
		throws IOException, FileNotFoundException
	{
		InputStream inputstream;
		inputstream = zipfile.getInputStream(zipentry);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #107 <Method InputStream ZipFile.getInputStream(ZipEntry)>
	//    3    5:astore          5
		s = ((String) (File.createTempFile(s, ".zip", file.getParentFile())));
	//    4    7:aload_3         
	//    5    8:ldc1            #22  <String ".zip">
	//    6   10:aload_2         
	//    7   11:invokevirtual   #113 <Method File File.getParentFile()>
	//    8   14:invokestatic    #117 <Method File File.createTempFile(String, String, File)>
	//    9   17:astore_3        
		Log.i("MultiDex", (new StringBuilder()).append("Extracting ").append(((File) (s)).getPath()).toString());
	//   10   18:ldc1            #43  <String "MultiDex">
	//   11   20:new             #119 <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #120 <Method void StringBuilder()>
	//   14   27:ldc1            #122 <String "Extracting ">
	//   15   29:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:aload_3         
	//   17   33:invokevirtual   #130 <Method String File.getPath()>
	//   18   36:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   20   42:invokestatic    #137 <Method int Log.i(String, String)>
	//   21   45:pop             
		zipfile = ((ZipFile) (new ZipOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(((File) (s)))))))))));
	//   22   46:new             #139 <Class ZipOutputStream>
	//   23   49:dup             
	//   24   50:new             #141 <Class BufferedOutputStream>
	//   25   53:dup             
	//   26   54:new             #143 <Class FileOutputStream>
	//   27   57:dup             
	//   28   58:aload_3         
	//   29   59:invokespecial   #146 <Method void FileOutputStream(File)>
	//   30   62:invokespecial   #149 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   31   65:invokespecial   #150 <Method void ZipOutputStream(java.io.OutputStream)>
	//   32   68:astore_0        
		int i;
		ZipEntry zipentry1 = new ZipEntry("classes.dex");
	//   33   69:new             #152 <Class ZipEntry>
	//   34   72:dup             
	//   35   73:ldc1            #154 <String "classes.dex">
	//   36   75:invokespecial   #157 <Method void ZipEntry(String)>
	//   37   78:astore          6
		zipentry1.setTime(zipentry.getTime());
	//   38   80:aload           6
	//   39   82:aload_1         
	//   40   83:invokevirtual   #161 <Method long ZipEntry.getTime()>
	//   41   86:invokevirtual   #165 <Method void ZipEntry.setTime(long)>
		((ZipOutputStream) (zipfile)).putNextEntry(zipentry1);
	//   42   89:aload_0         
	//   43   90:aload           6
	//   44   92:invokevirtual   #169 <Method void ZipOutputStream.putNextEntry(ZipEntry)>
		zipentry = ((ZipEntry) (new byte[16384]));
	//   45   95:sipush          16384
	//   46   98:newarray        byte[]
	//   47  100:astore_1        
		i = inputstream.read(((byte []) (zipentry)));
	//   48  101:aload           5
	//   49  103:aload_1         
	//   50  104:invokevirtual   #175 <Method int InputStream.read(byte[])>
	//   51  107:istore          4
_L1:
		if(i == -1)
			break MISSING_BLOCK_LABEL_134;
	//   52  109:iload           4
	//   53  111:iconst_m1       
	//   54  112:icmpeq          134
		((ZipOutputStream) (zipfile)).write(((byte []) (zipentry)), 0, i);
	//   55  115:aload_0         
	//   56  116:aload_1         
	//   57  117:iconst_0        
	//   58  118:iload           4
	//   59  120:invokevirtual   #179 <Method void ZipOutputStream.write(byte[], int, int)>
		i = inputstream.read(((byte []) (zipentry)));
	//   60  123:aload           5
	//   61  125:aload_1         
	//   62  126:invokevirtual   #175 <Method int InputStream.read(byte[])>
	//   63  129:istore          4
		  goto _L1
	//*  64  131:goto            109
		((ZipOutputStream) (zipfile)).closeEntry();
	//   65  134:aload_0         
	//   66  135:invokevirtual   #182 <Method void ZipOutputStream.closeEntry()>
		((ZipOutputStream) (zipfile)).close();
	//   67  138:aload_0         
	//   68  139:invokevirtual   #183 <Method void ZipOutputStream.close()>
		Log.i("MultiDex", (new StringBuilder()).append("Renaming to ").append(file.getPath()).toString());
	//   69  142:ldc1            #43  <String "MultiDex">
	//   70  144:new             #119 <Class StringBuilder>
	//   71  147:dup             
	//   72  148:invokespecial   #120 <Method void StringBuilder()>
	//   73  151:ldc1            #185 <String "Renaming to ">
	//   74  153:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   75  156:aload_2         
	//   76  157:invokevirtual   #130 <Method String File.getPath()>
	//   77  160:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   78  163:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   79  166:invokestatic    #137 <Method int Log.i(String, String)>
	//   80  169:pop             
		if(!((File) (s)).renameTo(file))
	//*  81  170:aload_3         
	//*  82  171:aload_2         
	//*  83  172:invokevirtual   #189 <Method boolean File.renameTo(File)>
	//*  84  175:ifne            245
			throw new IOException((new StringBuilder()).append("Failed to rename \"").append(((File) (s)).getAbsolutePath()).append("\" to \"").append(file.getAbsolutePath()).append("\"").toString());
	//   85  178:new             #84  <Class IOException>
	//   86  181:dup             
	//   87  182:new             #119 <Class StringBuilder>
	//   88  185:dup             
	//   89  186:invokespecial   #120 <Method void StringBuilder()>
	//   90  189:ldc1            #191 <String "Failed to rename \"">
	//   91  191:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   92  194:aload_3         
	//   93  195:invokevirtual   #194 <Method String File.getAbsolutePath()>
	//   94  198:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   95  201:ldc1            #196 <String "\" to \"">
	//   96  203:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   97  206:aload_2         
	//   98  207:invokevirtual   #194 <Method String File.getAbsolutePath()>
	//   99  210:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//  100  213:ldc1            #198 <String "\"">
	//  101  215:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//  102  218:invokevirtual   #133 <Method String StringBuilder.toString()>
	//  103  221:invokespecial   #199 <Method void IOException(String)>
	//  104  224:athrow          
		  goto _L2
		zipfile;
	//  105  225:astore_0        
_L4:
		closeQuietly(((Closeable) (inputstream)));
	//  106  226:aload           5
	//  107  228:invokestatic    #201 <Method void closeQuietly(Closeable)>
		((File) (s)).delete();
	//  108  231:aload_3         
	//  109  232:invokevirtual   #204 <Method boolean File.delete()>
	//  110  235:pop             
		throw zipfile;
	//  111  236:aload_0         
	//  112  237:athrow          
		zipentry;
	//  113  238:astore_1        
		((ZipOutputStream) (zipfile)).close();
	//  114  239:aload_0         
	//  115  240:invokevirtual   #183 <Method void ZipOutputStream.close()>
		throw zipentry;
	//  116  243:aload_1         
	//  117  244:athrow          
_L2:
		closeQuietly(((Closeable) (inputstream)));
	//  118  245:aload           5
	//  119  247:invokestatic    #201 <Method void closeQuietly(Closeable)>
		((File) (s)).delete();
	//  120  250:aload_3         
	//  121  251:invokevirtual   #204 <Method boolean File.delete()>
	//  122  254:pop             
		return;
	//  123  255:return          
		zipfile;
	//  124  256:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//* 125  257:goto            226
	}

	private static SharedPreferences getMultiDexPreferences(Context context)
	{
		int i;
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #212 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          18
			i = 0;
	//    3    8:iconst_0        
	//    4    9:istore_1        
		else
	//*   5   10:aload_0         
	//*   6   11:ldc1            #40  <String "multidex.version">
	//*   7   13:iload_1         
	//*   8   14:invokevirtual   #218 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//*   9   17:areturn         
			i = 4;
	//   10   18:iconst_4        
	//   11   19:istore_1        
		return context.getSharedPreferences("multidex.version", i);
	//*  12   20:goto            10
	}

	private static long getTimeStamp(File file)
	{
		long l1 = file.lastModified();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #223 <Method long File.lastModified()>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 == -1L)
	//*   5    7:lload_3         
	//*   6    8:ldc2w           #36  <Long -1L>
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
	//    1    1:invokestatic    #228 <Method long ZipUtil.getZipCrc(File)>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 == -1L)
	//*   5    7:lload_3         
	//*   6    8:ldc2w           #36  <Long -1L>
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

	private static boolean isModified(Context context, File file, long l)
	{
		context = ((Context) (getMultiDexPreferences(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #232 <Method SharedPreferences getMultiDexPreferences(Context)>
	//    2    4:astore_0        
		return ((SharedPreferences) (context)).getLong("timestamp", -1L) != getTimeStamp(file) || ((SharedPreferences) (context)).getLong("crc", -1L) != l;
	//    3    5:aload_0         
	//    4    6:ldc1            #31  <String "timestamp">
	//    5    8:ldc2w           #36  <Long -1L>
	//    6   11:invokeinterface #238 <Method long SharedPreferences.getLong(String, long)>
	//    7   16:aload_1         
	//    8   17:invokestatic    #240 <Method long getTimeStamp(File)>
	//    9   20:lcmp            
	//   10   21:ifne            40
	//   11   24:aload_0         
	//   12   25:ldc1            #25  <String "crc">
	//   13   27:ldc2w           #36  <Long -1L>
	//   14   30:invokeinterface #238 <Method long SharedPreferences.getLong(String, long)>
	//   15   35:lload_2         
	//   16   36:lcmp            
	//   17   37:ifeq            42
	//   18   40:iconst_1        
	//   19   41:ireturn         
	//   20   42:iconst_0        
	//   21   43:ireturn         
	}

	static List load(Context context, ApplicationInfo applicationinfo, File file, boolean flag)
		throws IOException
	{
		long l;
		File file1;
		Log.i("MultiDex", (new StringBuilder()).append("MultiDexExtractor.load(").append(applicationinfo.sourceDir).append(", ").append(flag).append(")").toString());
	//    0    0:ldc1            #43  <String "MultiDex">
	//    1    2:new             #119 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #120 <Method void StringBuilder()>
	//    4    9:ldc1            #244 <String "MultiDexExtractor.load(">
	//    5   11:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_1         
	//    7   15:getfield        #249 <Field String ApplicationInfo.sourceDir>
	//    8   18:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:ldc1            #251 <String ", ">
	//   10   23:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:iload_3         
	//   12   27:invokevirtual   #254 <Method StringBuilder StringBuilder.append(boolean)>
	//   13   30:ldc2            #256 <String ")">
	//   14   33:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   16   39:invokestatic    #137 <Method int Log.i(String, String)>
	//   17   42:pop             
		file1 = new File(applicationinfo.sourceDir);
	//   18   43:new             #109 <Class File>
	//   19   46:dup             
	//   20   47:aload_1         
	//   21   48:getfield        #249 <Field String ApplicationInfo.sourceDir>
	//   22   51:invokespecial   #257 <Method void File(String)>
	//   23   54:astore          6
		l = getZipCrc(file1);
	//   24   56:aload           6
	//   25   58:invokestatic    #258 <Method long getZipCrc(File)>
	//   26   61:lstore          4
		if(flag || isModified(context, file1, l)) goto _L2; else goto _L1
	//   27   63:iload_3         
	//   28   64:ifne            169
	//   29   67:aload_0         
	//   30   68:aload           6
	//   31   70:lload           4
	//   32   72:invokestatic    #260 <Method boolean isModified(Context, File, long)>
	//   33   75:ifne            169
_L1:
		try
		{
			applicationinfo = ((ApplicationInfo) (loadExistingExtractions(context, file1, file)));
	//   34   78:aload_0         
	//   35   79:aload           6
	//   36   81:aload_2         
	//   37   82:invokestatic    #264 <Method List loadExistingExtractions(Context, File, File)>
	//   38   85:astore_1        
		}
	//*  39   86:aload_1         
	//*  40   87:astore_0        
	//*  41   88:ldc1            #43  <String "MultiDex">
	//*  42   90:new             #119 <Class StringBuilder>
	//*  43   93:dup             
	//*  44   94:invokespecial   #120 <Method void StringBuilder()>
	//*  45   97:ldc2            #266 <String "load found ">
	//*  46  100:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//*  47  103:aload_0         
	//*  48  104:invokeinterface #272 <Method int List.size()>
	//*  49  109:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//*  50  112:ldc2            #277 <String " secondary dex files">
	//*  51  115:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//*  52  118:invokevirtual   #133 <Method String StringBuilder.toString()>
	//*  53  121:invokestatic    #137 <Method int Log.i(String, String)>
	//*  54  124:pop             
	//*  55  125:aload_0         
	//*  56  126:areturn         
		// Misplaced declaration of an exception variable
		catch(ApplicationInfo applicationinfo)
	//*  57  127:astore_1        
		{
			Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", ((Throwable) (applicationinfo)));
	//   58  128:ldc1            #43  <String "MultiDex">
	//   59  130:ldc2            #279 <String "Failed to reload existing extracted secondary dex files, falling back to fresh extraction">
	//   60  133:aload_1         
	//   61  134:invokestatic    #97  <Method int Log.w(String, String, Throwable)>
	//   62  137:pop             
			applicationinfo = ((ApplicationInfo) (performExtractions(file1, file)));
	//   63  138:aload           6
	//   64  140:aload_2         
	//   65  141:invokestatic    #283 <Method List performExtractions(File, File)>
	//   66  144:astore_1        
			putStoredApkInfo(context, getTimeStamp(file1), l, ((List) (applicationinfo)).size() + 1);
	//   67  145:aload_0         
	//   68  146:aload           6
	//   69  148:invokestatic    #240 <Method long getTimeStamp(File)>
	//   70  151:lload           4
	//   71  153:aload_1         
	//   72  154:invokeinterface #272 <Method int List.size()>
	//   73  159:iconst_1        
	//   74  160:iadd            
	//   75  161:invokestatic    #287 <Method void putStoredApkInfo(Context, long, long, int)>
			context = ((Context) (applicationinfo));
	//   76  164:aload_1         
	//   77  165:astore_0        
			continue; /* Loop/switch isn't completed */
	//   78  166:goto            88
		}
		context = ((Context) (applicationinfo));
_L4:
		Log.i("MultiDex", (new StringBuilder()).append("load found ").append(((List) (context)).size()).append(" secondary dex files").toString());
		return ((List) (context));
_L2:
		Log.i("MultiDex", "Detected that extraction must be performed.");
	//   79  169:ldc1            #43  <String "MultiDex">
	//   80  171:ldc2            #289 <String "Detected that extraction must be performed.">
	//   81  174:invokestatic    #137 <Method int Log.i(String, String)>
	//   82  177:pop             
		applicationinfo = ((ApplicationInfo) (performExtractions(file1, file)));
	//   83  178:aload           6
	//   84  180:aload_2         
	//   85  181:invokestatic    #283 <Method List performExtractions(File, File)>
	//   86  184:astore_1        
		putStoredApkInfo(context, getTimeStamp(file1), l, ((List) (applicationinfo)).size() + 1);
	//   87  185:aload_0         
	//   88  186:aload           6
	//   89  188:invokestatic    #240 <Method long getTimeStamp(File)>
	//   90  191:lload           4
	//   91  193:aload_1         
	//   92  194:invokeinterface #272 <Method int List.size()>
	//   93  199:iconst_1        
	//   94  200:iadd            
	//   95  201:invokestatic    #287 <Method void putStoredApkInfo(Context, long, long, int)>
		context = ((Context) (applicationinfo));
	//   96  204:aload_1         
	//   97  205:astore_0        
		if(true) goto _L4; else goto _L3
	//   98  206:goto            88
_L3:
	}

	private static List loadExistingExtractions(Context context, File file, File file1)
		throws IOException
	{
		Log.i("MultiDex", "loading existing secondary dex files");
	//    0    0:ldc1            #43  <String "MultiDex">
	//    1    2:ldc2            #293 <String "loading existing secondary dex files">
	//    2    5:invokestatic    #137 <Method int Log.i(String, String)>
	//    3    8:pop             
		file = ((File) ((new StringBuilder()).append(file.getName()).append(".classes").toString()));
	//    4    9:new             #119 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #120 <Method void StringBuilder()>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #296 <Method String File.getName()>
	//    9   20:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:ldc1            #19  <String ".classes">
	//   11   25:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   13   31:astore_1        
		int j = getMultiDexPreferences(context).getInt("dex.number", 1);
	//   14   32:aload_0         
	//   15   33:invokestatic    #232 <Method SharedPreferences getMultiDexPreferences(Context)>
	//   16   36:ldc1            #28  <String "dex.number">
	//   17   38:iconst_1        
	//   18   39:invokeinterface #300 <Method int SharedPreferences.getInt(String, int)>
	//   19   44:istore          4
		context = ((Context) (new ArrayList(j)));
	//   20   46:new             #302 <Class ArrayList>
	//   21   49:dup             
	//   22   50:iload           4
	//   23   52:invokespecial   #305 <Method void ArrayList(int)>
	//   24   55:astore_0        
		for(int i = 2; i <= j; i++)
	//*  25   56:iconst_2        
	//*  26   57:istore_3        
	//*  27   58:iload_3         
	//*  28   59:iload           4
	//*  29   61:icmpgt          205
		{
			File file2 = new File(file1, (new StringBuilder()).append(((String) (file))).append(i).append(".zip").toString());
	//   30   64:new             #109 <Class File>
	//   31   67:dup             
	//   32   68:aload_2         
	//   33   69:new             #119 <Class StringBuilder>
	//   34   72:dup             
	//   35   73:invokespecial   #120 <Method void StringBuilder()>
	//   36   76:aload_1         
	//   37   77:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:iload_3         
	//   39   81:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//   40   84:ldc1            #22  <String ".zip">
	//   41   86:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   42   89:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   43   92:invokespecial   #308 <Method void File(File, String)>
	//   44   95:astore          5
			if(file2.isFile())
	//*  45   97:aload           5
	//*  46   99:invokevirtual   #311 <Method boolean File.isFile()>
	//*  47  102:ifeq            160
			{
				((List) (context)).add(((Object) (file2)));
	//   48  105:aload_0         
	//   49  106:aload           5
	//   50  108:invokeinterface #315 <Method boolean List.add(Object)>
	//   51  113:pop             
				if(!verifyZipFile(file2))
	//*  52  114:aload           5
	//*  53  116:invokestatic    #318 <Method boolean verifyZipFile(File)>
	//*  54  119:ifne            198
				{
					Log.i("MultiDex", (new StringBuilder()).append("Invalid zip file: ").append(((Object) (file2))).toString());
	//   55  122:ldc1            #43  <String "MultiDex">
	//   56  124:new             #119 <Class StringBuilder>
	//   57  127:dup             
	//   58  128:invokespecial   #120 <Method void StringBuilder()>
	//   59  131:ldc2            #320 <String "Invalid zip file: ">
	//   60  134:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   61  137:aload           5
	//   62  139:invokevirtual   #323 <Method StringBuilder StringBuilder.append(Object)>
	//   63  142:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   64  145:invokestatic    #137 <Method int Log.i(String, String)>
	//   65  148:pop             
					throw new IOException("Invalid ZIP file.");
	//   66  149:new             #84  <Class IOException>
	//   67  152:dup             
	//   68  153:ldc2            #325 <String "Invalid ZIP file.">
	//   69  156:invokespecial   #199 <Method void IOException(String)>
	//   70  159:athrow          
				}
			} else
			{
				throw new IOException((new StringBuilder()).append("Missing extracted secondary dex file '").append(file2.getPath()).append("'").toString());
	//   71  160:new             #84  <Class IOException>
	//   72  163:dup             
	//   73  164:new             #119 <Class StringBuilder>
	//   74  167:dup             
	//   75  168:invokespecial   #120 <Method void StringBuilder()>
	//   76  171:ldc2            #327 <String "Missing extracted secondary dex file '">
	//   77  174:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   78  177:aload           5
	//   79  179:invokevirtual   #130 <Method String File.getPath()>
	//   80  182:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   81  185:ldc2            #329 <String "'">
	//   82  188:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   83  191:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   84  194:invokespecial   #199 <Method void IOException(String)>
	//   85  197:athrow          
			}
		}

	//   86  198:iload_3         
	//   87  199:iconst_1        
	//   88  200:iadd            
	//   89  201:istore_3        
	//*  90  202:goto            58
		return ((List) (context));
	//   91  205:aload_0         
	//   92  206:areturn         
	}

	private static void mkdirChecked(File file)
		throws IOException
	{
		file.mkdir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #334 <Method boolean File.mkdir()>
	//    2    4:pop             
		if(!file.isDirectory())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #337 <Method boolean File.isDirectory()>
	//*   5    9:ifne            184
		{
			File file1 = file.getParentFile();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #113 <Method File File.getParentFile()>
	//    8   16:astore_1        
			if(file1 == null)
	//*   9   17:aload_1         
	//*  10   18:ifnonnull       87
				Log.e("MultiDex", (new StringBuilder()).append("Failed to create dir ").append(file.getPath()).append(". Parent file is null.").toString());
	//   11   21:ldc1            #43  <String "MultiDex">
	//   12   23:new             #119 <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #120 <Method void StringBuilder()>
	//   15   30:ldc2            #339 <String "Failed to create dir ">
	//   16   33:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:aload_0         
	//   18   37:invokevirtual   #130 <Method String File.getPath()>
	//   19   40:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:ldc2            #341 <String ". Parent file is null.">
	//   21   46:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   23   52:invokestatic    #344 <Method int Log.e(String, String)>
	//   24   55:pop             
			else
	//*  25   56:new             #84  <Class IOException>
	//*  26   59:dup             
	//*  27   60:new             #119 <Class StringBuilder>
	//*  28   63:dup             
	//*  29   64:invokespecial   #120 <Method void StringBuilder()>
	//*  30   67:ldc2            #346 <String "Failed to create cache directory ">
	//*  31   70:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//*  32   73:aload_0         
	//*  33   74:invokevirtual   #130 <Method String File.getPath()>
	//*  34   77:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//*  35   80:invokevirtual   #133 <Method String StringBuilder.toString()>
	//*  36   83:invokespecial   #199 <Method void IOException(String)>
	//*  37   86:athrow          
				Log.e("MultiDex", (new StringBuilder()).append("Failed to create dir ").append(file.getPath()).append(". parent file is a dir ").append(file1.isDirectory()).append(", a file ").append(file1.isFile()).append(", exists ").append(file1.exists()).append(", readable ").append(file1.canRead()).append(", writable ").append(file1.canWrite()).toString());
	//   38   87:ldc1            #43  <String "MultiDex">
	//   39   89:new             #119 <Class StringBuilder>
	//   40   92:dup             
	//   41   93:invokespecial   #120 <Method void StringBuilder()>
	//   42   96:ldc2            #339 <String "Failed to create dir ">
	//   43   99:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   44  102:aload_0         
	//   45  103:invokevirtual   #130 <Method String File.getPath()>
	//   46  106:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   47  109:ldc2            #348 <String ". parent file is a dir ">
	//   48  112:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   49  115:aload_1         
	//   50  116:invokevirtual   #337 <Method boolean File.isDirectory()>
	//   51  119:invokevirtual   #254 <Method StringBuilder StringBuilder.append(boolean)>
	//   52  122:ldc2            #350 <String ", a file ">
	//   53  125:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   54  128:aload_1         
	//   55  129:invokevirtual   #311 <Method boolean File.isFile()>
	//   56  132:invokevirtual   #254 <Method StringBuilder StringBuilder.append(boolean)>
	//   57  135:ldc2            #352 <String ", exists ">
	//   58  138:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   59  141:aload_1         
	//   60  142:invokevirtual   #355 <Method boolean File.exists()>
	//   61  145:invokevirtual   #254 <Method StringBuilder StringBuilder.append(boolean)>
	//   62  148:ldc2            #357 <String ", readable ">
	//   63  151:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   64  154:aload_1         
	//   65  155:invokevirtual   #360 <Method boolean File.canRead()>
	//   66  158:invokevirtual   #254 <Method StringBuilder StringBuilder.append(boolean)>
	//   67  161:ldc2            #362 <String ", writable ">
	//   68  164:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   69  167:aload_1         
	//   70  168:invokevirtual   #365 <Method boolean File.canWrite()>
	//   71  171:invokevirtual   #254 <Method StringBuilder StringBuilder.append(boolean)>
	//   72  174:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   73  177:invokestatic    #344 <Method int Log.e(String, String)>
	//   74  180:pop             
			throw new IOException((new StringBuilder()).append("Failed to create cache directory ").append(file.getPath()).toString());
		} else
	//*  75  181:goto            56
		{
			return;
	//   76  184:return          
		}
	}

	private static List performExtractions(File file, File file1)
		throws IOException
	{
		int i;
		ArrayList arraylist;
		String s1;
		ZipFile zipfile;
		s1 = (new StringBuilder()).append(file.getName()).append(".classes").toString();
	//    0    0:new             #119 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #296 <Method String File.getName()>
	//    5   11:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #19  <String ".classes">
	//    7   16:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #133 <Method String StringBuilder.toString()>
	//    9   22:astore          9
		prepareDexDir(file1, s1);
	//   10   24:aload_1         
	//   11   25:aload           9
	//   12   27:invokestatic    #368 <Method void prepareDexDir(File, String)>
		arraylist = new ArrayList();
	//   13   30:new             #302 <Class ArrayList>
	//   14   33:dup             
	//   15   34:invokespecial   #369 <Method void ArrayList()>
	//   16   37:astore          8
		zipfile = new ZipFile(file);
	//   17   39:new             #103 <Class ZipFile>
	//   18   42:dup             
	//   19   43:aload_0         
	//   20   44:invokespecial   #370 <Method void ZipFile(File)>
	//   21   47:astore          10
		i = 2;
	//   22   49:iconst_2        
	//   23   50:istore_2        
		file = ((File) (zipfile.getEntry((new StringBuilder()).append("classes").append(2).append(".dex").toString())));
	//   24   51:aload           10
	//   25   53:new             #119 <Class StringBuilder>
	//   26   56:dup             
	//   27   57:invokespecial   #120 <Method void StringBuilder()>
	//   28   60:ldc1            #13  <String "classes">
	//   29   62:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   30   65:iconst_2        
	//   31   66:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//   32   69:ldc1            #16  <String ".dex">
	//   33   71:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   34   74:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   35   77:invokevirtual   #374 <Method ZipEntry ZipFile.getEntry(String)>
	//   36   80:astore_0        
_L5:
		if(file == null)
			break; /* Loop/switch isn't completed */
	//   37   81:aload_0         
	//   38   82:ifnull          447
		File file2;
		file2 = new File(file1, (new StringBuilder()).append(s1).append(i).append(".zip").toString());
	//   39   85:new             #109 <Class File>
	//   40   88:dup             
	//   41   89:aload_1         
	//   42   90:new             #119 <Class StringBuilder>
	//   43   93:dup             
	//   44   94:invokespecial   #120 <Method void StringBuilder()>
	//   45   97:aload           9
	//   46   99:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   47  102:iload_2         
	//   48  103:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//   49  106:ldc1            #22  <String ".zip">
	//   50  108:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   51  111:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   52  114:invokespecial   #308 <Method void File(File, String)>
	//   53  117:astore          11
		((List) (arraylist)).add(((Object) (file2)));
	//   54  119:aload           8
	//   55  121:aload           11
	//   56  123:invokeinterface #315 <Method boolean List.add(Object)>
	//   57  128:pop             
		Log.i("MultiDex", (new StringBuilder()).append("Extraction is needed for file ").append(((Object) (file2))).toString());
	//   58  129:ldc1            #43  <String "MultiDex">
	//   59  131:new             #119 <Class StringBuilder>
	//   60  134:dup             
	//   61  135:invokespecial   #120 <Method void StringBuilder()>
	//   62  138:ldc2            #376 <String "Extraction is needed for file ">
	//   63  141:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   64  144:aload           11
	//   65  146:invokevirtual   #323 <Method StringBuilder StringBuilder.append(Object)>
	//   66  149:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   67  152:invokestatic    #137 <Method int Log.i(String, String)>
	//   68  155:pop             
		int j;
		boolean flag;
		j = 0;
	//   69  156:iconst_0        
	//   70  157:istore_3        
		flag = false;
	//   71  158:iconst_0        
	//   72  159:istore          5
_L2:
		int k;
		if(j >= 3 || flag)
			break MISSING_BLOCK_LABEL_357;
	//   73  161:iload_3         
	//   74  162:iconst_3        
	//   75  163:icmpge          357
	//   76  166:iload           5
	//   77  168:ifne            357
		k = j + 1;
	//   78  171:iload_3         
	//   79  172:iconst_1        
	//   80  173:iadd            
	//   81  174:istore          4
		boolean flag1;
		StringBuilder stringbuilder;
		extract(zipfile, ((ZipEntry) (file)), file2, s1);
	//   82  176:aload           10
	//   83  178:aload_0         
	//   84  179:aload           11
	//   85  181:aload           9
	//   86  183:invokestatic    #378 <Method void extract(ZipFile, ZipEntry, File, String)>
		flag1 = verifyZipFile(file2);
	//   87  186:aload           11
	//   88  188:invokestatic    #318 <Method boolean verifyZipFile(File)>
	//   89  191:istore          6
		stringbuilder = (new StringBuilder()).append("Extraction ");
	//   90  193:new             #119 <Class StringBuilder>
	//   91  196:dup             
	//   92  197:invokespecial   #120 <Method void StringBuilder()>
	//   93  200:ldc2            #380 <String "Extraction ">
	//   94  203:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   95  206:astore          12
		String s;
		if(flag1)
	//*  96  208:iload           6
	//*  97  210:ifeq            349
			s = "success";
	//   98  213:ldc2            #382 <String "success">
	//   99  216:astore          7
		else
	//* 100  218:ldc1            #43  <String "MultiDex">
	//* 101  220:aload           12
	//* 102  222:aload           7
	//* 103  224:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 104  227:ldc2            #384 <String " - length ">
	//* 105  230:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 106  233:aload           11
	//* 107  235:invokevirtual   #194 <Method String File.getAbsolutePath()>
	//* 108  238:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 109  241:ldc2            #386 <String ": ">
	//* 110  244:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 111  247:aload           11
	//* 112  249:invokevirtual   #389 <Method long File.length()>
	//* 113  252:invokevirtual   #392 <Method StringBuilder StringBuilder.append(long)>
	//* 114  255:invokevirtual   #133 <Method String StringBuilder.toString()>
	//* 115  258:invokestatic    #137 <Method int Log.i(String, String)>
	//* 116  261:pop             
	//* 117  262:iload           6
	//* 118  264:istore          5
	//* 119  266:iload           4
	//* 120  268:istore_3        
	//* 121  269:iload           6
	//* 122  271:ifne            161
	//* 123  274:aload           11
	//* 124  276:invokevirtual   #204 <Method boolean File.delete()>
	//* 125  279:pop             
	//* 126  280:iload           6
	//* 127  282:istore          5
	//* 128  284:iload           4
	//* 129  286:istore_3        
	//* 130  287:aload           11
	//* 131  289:invokevirtual   #355 <Method boolean File.exists()>
	//* 132  292:ifeq            161
	//* 133  295:ldc1            #43  <String "MultiDex">
	//* 134  297:new             #119 <Class StringBuilder>
	//* 135  300:dup             
	//* 136  301:invokespecial   #120 <Method void StringBuilder()>
	//* 137  304:ldc2            #394 <String "Failed to delete corrupted secondary dex '">
	//* 138  307:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 139  310:aload           11
	//* 140  312:invokevirtual   #130 <Method String File.getPath()>
	//* 141  315:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 142  318:ldc2            #329 <String "'">
	//* 143  321:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 144  324:invokevirtual   #133 <Method String StringBuilder.toString()>
	//* 145  327:invokestatic    #396 <Method int Log.w(String, String)>
	//* 146  330:pop             
	//* 147  331:iload           6
	//* 148  333:istore          5
	//* 149  335:iload           4
	//* 150  337:istore_3        
	//* 151  338:goto            161
	//* 152  341:astore_0        
	//* 153  342:aload           10
	//* 154  344:invokevirtual   #397 <Method void ZipFile.close()>
	//* 155  347:aload_0         
	//* 156  348:athrow          
			s = "failed";
	//  157  349:ldc2            #399 <String "failed">
	//  158  352:astore          7
		Log.i("MultiDex", stringbuilder.append(s).append(" - length ").append(file2.getAbsolutePath()).append(": ").append(file2.length()).toString());
		flag = flag1;
		j = k;
		if(flag1) goto _L2; else goto _L1
_L1:
		file2.delete();
		flag = flag1;
		j = k;
		if(!file2.exists()) goto _L2; else goto _L3
_L3:
		Log.w("MultiDex", (new StringBuilder()).append("Failed to delete corrupted secondary dex '").append(file2.getPath()).append("'").toString());
		flag = flag1;
		j = k;
		  goto _L2
		file;
		try
		{
			zipfile.close();
		}
	//* 159  354:goto            218
	//* 160  357:iload           5
	//* 161  359:ifne            410
	//* 162  362:new             #84  <Class IOException>
	//* 163  365:dup             
	//* 164  366:new             #119 <Class StringBuilder>
	//* 165  369:dup             
	//* 166  370:invokespecial   #120 <Method void StringBuilder()>
	//* 167  373:ldc2            #401 <String "Could not create zip file ">
	//* 168  376:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 169  379:aload           11
	//* 170  381:invokevirtual   #194 <Method String File.getAbsolutePath()>
	//* 171  384:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 172  387:ldc2            #403 <String " for secondary dex (">
	//* 173  390:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 174  393:iload_2         
	//* 175  394:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//* 176  397:ldc2            #256 <String ")">
	//* 177  400:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 178  403:invokevirtual   #133 <Method String StringBuilder.toString()>
	//* 179  406:invokespecial   #199 <Method void IOException(String)>
	//* 180  409:athrow          
	//* 181  410:iload_2         
	//* 182  411:iconst_1        
	//* 183  412:iadd            
	//* 184  413:istore_2        
	//* 185  414:aload           10
	//* 186  416:new             #119 <Class StringBuilder>
	//* 187  419:dup             
	//* 188  420:invokespecial   #120 <Method void StringBuilder()>
	//* 189  423:ldc1            #13  <String "classes">
	//* 190  425:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 191  428:iload_2         
	//* 192  429:invokevirtual   #275 <Method StringBuilder StringBuilder.append(int)>
	//* 193  432:ldc1            #16  <String ".dex">
	//* 194  434:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//* 195  437:invokevirtual   #133 <Method String StringBuilder.toString()>
	//* 196  440:invokevirtual   #374 <Method ZipEntry ZipFile.getEntry(String)>
	//* 197  443:astore_0        
	//* 198  444:goto            81
	//* 199  447:aload           10
	//* 200  449:invokevirtual   #397 <Method void ZipFile.close()>
	//* 201  452:aload           8
	//* 202  454:areturn         
	//* 203  455:astore_0        
	//* 204  456:ldc1            #43  <String "MultiDex">
	//* 205  458:ldc1            #91  <String "Failed to close resource">
	//* 206  460:aload_0         
	//* 207  461:invokestatic    #97  <Method int Log.w(String, String, Throwable)>
	//* 208  464:pop             
	//* 209  465:aload           8
	//* 210  467:areturn         
		// Misplaced declaration of an exception variable
		catch(File file1)
	//* 211  468:astore_1        
		{
			Log.w("MultiDex", "Failed to close resource", ((Throwable) (file1)));
	//  212  469:ldc1            #43  <String "MultiDex">
	//  213  471:ldc1            #91  <String "Failed to close resource">
	//  214  473:aload_1         
	//  215  474:invokestatic    #97  <Method int Log.w(String, String, Throwable)>
	//  216  477:pop             
		}
		throw file;
		if(flag)
			break MISSING_BLOCK_LABEL_410;
		throw new IOException((new StringBuilder()).append("Could not create zip file ").append(file2.getAbsolutePath()).append(" for secondary dex (").append(i).append(")").toString());
		i++;
		file = ((File) (zipfile.getEntry((new StringBuilder()).append("classes").append(i).append(".dex").toString())));
		if(true) goto _L5; else goto _L4
_L4:
		try
		{
			zipfile.close();
		}
		// Misplaced declaration of an exception variable
		catch(File file)
		{
			Log.w("MultiDex", "Failed to close resource", ((Throwable) (file)));
			return ((List) (arraylist));
		}
		return ((List) (arraylist));
	//* 217  478:goto            347
	}

	private static void prepareDexDir(File file, String s)
		throws IOException
	{
		mkdirChecked(file.getParentFile());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method File File.getParentFile()>
	//    2    4:invokestatic    #406 <Method void mkdirChecked(File)>
		mkdirChecked(file);
	//    3    7:aload_0         
	//    4    8:invokestatic    #406 <Method void mkdirChecked(File)>
		s = ((String) (file.listFiles(new FileFilter(s) {

			public boolean accept(File file1)
			{
				return !file1.getName().startsWith(extractedFilePrefix);
			//    0    0:aload_1         
			//    1    1:invokevirtual   #29  <Method String File.getName()>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field String val$extractedFilePrefix>
			//    4    8:invokevirtual   #35  <Method boolean String.startsWith(String)>
			//    5   11:ifne            16
			//    6   14:iconst_1        
			//    7   15:ireturn         
			//    8   16:iconst_0        
			//    9   17:ireturn         
			}

			final String val$extractedFilePrefix;

			
			{
				extractedFilePrefix = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field String val$extractedFilePrefix>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//    5   11:aload_0         
	//    6   12:new             #6   <Class MultiDexExtractor$1>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #407 <Method void MultiDexExtractor$1(String)>
	//   10   20:invokevirtual   #411 <Method File[] File.listFiles(FileFilter)>
	//   11   23:astore_1        
		if(s == null)
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       64
		{
			Log.w("MultiDex", (new StringBuilder()).append("Failed to list secondary dex dir content (").append(file.getPath()).append(").").toString());
	//   14   28:ldc1            #43  <String "MultiDex">
	//   15   30:new             #119 <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #120 <Method void StringBuilder()>
	//   18   37:ldc2            #413 <String "Failed to list secondary dex dir content (">
	//   19   40:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:aload_0         
	//   21   44:invokevirtual   #130 <Method String File.getPath()>
	//   22   47:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:ldc2            #415 <String ").">
	//   24   53:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   25   56:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   26   59:invokestatic    #396 <Method int Log.w(String, String)>
	//   27   62:pop             
		} else
	//*  28   63:return          
		{
			int j = s.length;
	//   29   64:aload_1         
	//   30   65:arraylength     
	//   31   66:istore_3        
			int i = 0;
	//   32   67:iconst_0        
	//   33   68:istore_2        
			while(i < j) 
	//*  34   69:iload_2         
	//*  35   70:iload_3         
	//*  36   71:icmpge          63
			{
				file = ((File) (s[i]));
	//   37   74:aload_1         
	//   38   75:iload_2         
	//   39   76:aaload          
	//   40   77:astore_0        
				Log.i("MultiDex", (new StringBuilder()).append("Trying to delete old file ").append(file.getPath()).append(" of size ").append(file.length()).toString());
	//   41   78:ldc1            #43  <String "MultiDex">
	//   42   80:new             #119 <Class StringBuilder>
	//   43   83:dup             
	//   44   84:invokespecial   #120 <Method void StringBuilder()>
	//   45   87:ldc2            #417 <String "Trying to delete old file ">
	//   46   90:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   47   93:aload_0         
	//   48   94:invokevirtual   #130 <Method String File.getPath()>
	//   49   97:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   50  100:ldc2            #419 <String " of size ">
	//   51  103:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   52  106:aload_0         
	//   53  107:invokevirtual   #389 <Method long File.length()>
	//   54  110:invokevirtual   #392 <Method StringBuilder StringBuilder.append(long)>
	//   55  113:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   56  116:invokestatic    #137 <Method int Log.i(String, String)>
	//   57  119:pop             
				if(!file.delete())
	//*  58  120:aload_0         
	//*  59  121:invokevirtual   #204 <Method boolean File.delete()>
	//*  60  124:ifne            163
					Log.w("MultiDex", (new StringBuilder()).append("Failed to delete old file ").append(file.getPath()).toString());
	//   61  127:ldc1            #43  <String "MultiDex">
	//   62  129:new             #119 <Class StringBuilder>
	//   63  132:dup             
	//   64  133:invokespecial   #120 <Method void StringBuilder()>
	//   65  136:ldc2            #421 <String "Failed to delete old file ">
	//   66  139:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   67  142:aload_0         
	//   68  143:invokevirtual   #130 <Method String File.getPath()>
	//   69  146:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   70  149:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   71  152:invokestatic    #396 <Method int Log.w(String, String)>
	//   72  155:pop             
				else
	//*  73  156:iload_2         
	//*  74  157:iconst_1        
	//*  75  158:iadd            
	//*  76  159:istore_2        
	//*  77  160:goto            69
					Log.i("MultiDex", (new StringBuilder()).append("Deleted old file ").append(file.getPath()).toString());
	//   78  163:ldc1            #43  <String "MultiDex">
	//   79  165:new             #119 <Class StringBuilder>
	//   80  168:dup             
	//   81  169:invokespecial   #120 <Method void StringBuilder()>
	//   82  172:ldc2            #423 <String "Deleted old file ">
	//   83  175:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   84  178:aload_0         
	//   85  179:invokevirtual   #130 <Method String File.getPath()>
	//   86  182:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   87  185:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   88  188:invokestatic    #137 <Method int Log.i(String, String)>
	//   89  191:pop             
				i++;
			}
		}
	//*  90  192:goto            156
	}

	private static void putStoredApkInfo(Context context, long l, long l1, int i)
	{
		context = ((Context) (getMultiDexPreferences(context).edit()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #232 <Method SharedPreferences getMultiDexPreferences(Context)>
	//    2    4:invokeinterface #427 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putLong("timestamp", l);
	//    4   10:aload_0         
	//    5   11:ldc1            #31  <String "timestamp">
	//    6   13:lload_1         
	//    7   14:invokeinterface #431 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//    8   19:pop             
		((android.content.SharedPreferences.Editor) (context)).putLong("crc", l1);
	//    9   20:aload_0         
	//   10   21:ldc1            #25  <String "crc">
	//   11   23:lload_3         
	//   12   24:invokeinterface #431 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   13   29:pop             
		((android.content.SharedPreferences.Editor) (context)).putInt("dex.number", i);
	//   14   30:aload_0         
	//   15   31:ldc1            #28  <String "dex.number">
	//   16   33:iload           5
	//   17   35:invokeinterface #435 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   18   40:pop             
		apply(((android.content.SharedPreferences.Editor) (context)));
	//   19   41:aload_0         
	//   20   42:invokestatic    #437 <Method void apply(android.content.SharedPreferences$Editor)>
	//   21   45:return          
	}

	static boolean verifyZipFile(File file)
	{
		ZipFile zipfile = new ZipFile(file);
	//    0    0:new             #103 <Class ZipFile>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #370 <Method void ZipFile(File)>
	//    4    8:astore_1        
		try
		{
			zipfile.close();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #397 <Method void ZipFile.close()>
		}
	//*   7   13:iconst_1        
	//*   8   14:ireturn         
		catch(IOException ioexception)
	//*   9   15:astore_1        
		{
			try
			{
				Log.w("MultiDex", (new StringBuilder()).append("Failed to close zip file: ").append(file.getAbsolutePath()).toString());
	//   10   16:ldc1            #43  <String "MultiDex">
	//   11   18:new             #119 <Class StringBuilder>
	//   12   21:dup             
	//   13   22:invokespecial   #120 <Method void StringBuilder()>
	//   14   25:ldc2            #441 <String "Failed to close zip file: ">
	//   15   28:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:aload_0         
	//   17   32:invokevirtual   #194 <Method String File.getAbsolutePath()>
	//   18   35:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   20   41:invokestatic    #396 <Method int Log.w(String, String)>
	//   21   44:pop             
			}
	//*  22   45:iconst_0        
	//*  23   46:ireturn         
			catch(ZipException zipexception)
	//*  24   47:astore_1        
			{
				Log.w("MultiDex", (new StringBuilder()).append("File ").append(file.getAbsolutePath()).append(" is not a valid zip file.").toString(), ((Throwable) (zipexception)));
	//   25   48:ldc1            #43  <String "MultiDex">
	//   26   50:new             #119 <Class StringBuilder>
	//   27   53:dup             
	//   28   54:invokespecial   #120 <Method void StringBuilder()>
	//   29   57:ldc2            #443 <String "File ">
	//   30   60:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:aload_0         
	//   32   64:invokevirtual   #194 <Method String File.getAbsolutePath()>
	//   33   67:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   34   70:ldc2            #445 <String " is not a valid zip file.">
	//   35   73:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   36   76:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   37   79:aload_1         
	//   38   80:invokestatic    #97  <Method int Log.w(String, String, Throwable)>
	//   39   83:pop             
			}
	//*  40   84:goto            45
			catch(IOException ioexception1)
	//*  41   87:astore_1        
			{
				Log.w("MultiDex", (new StringBuilder()).append("Got an IOException trying to open zip file: ").append(file.getAbsolutePath()).toString(), ((Throwable) (ioexception1)));
	//   42   88:ldc1            #43  <String "MultiDex">
	//   43   90:new             #119 <Class StringBuilder>
	//   44   93:dup             
	//   45   94:invokespecial   #120 <Method void StringBuilder()>
	//   46   97:ldc2            #447 <String "Got an IOException trying to open zip file: ">
	//   47  100:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   48  103:aload_0         
	//   49  104:invokevirtual   #194 <Method String File.getAbsolutePath()>
	//   50  107:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   51  110:invokevirtual   #133 <Method String StringBuilder.toString()>
	//   52  113:aload_1         
	//   53  114:invokestatic    #97  <Method int Log.w(String, String, Throwable)>
	//   54  117:pop             
			}
			return false;
		}
		return true;
	//*  55  118:goto            45
	}

	private static final int BUFFER_SIZE = 16384;
	private static final String DEX_PREFIX = "classes";
	private static final String DEX_SUFFIX = ".dex";
	private static final String EXTRACTED_NAME_EXT = ".classes";
	private static final String EXTRACTED_SUFFIX = ".zip";
	private static final String KEY_CRC = "crc";
	private static final String KEY_DEX_NUMBER = "dex.number";
	private static final String KEY_TIME_STAMP = "timestamp";
	private static final int MAX_EXTRACT_ATTEMPTS = 3;
	private static final long NO_VALUE = -1L;
	private static final String PREFS_FILE = "multidex.version";
	private static final String TAG = "MultiDex";
	private static Method sApplyMethod;

	static 
	{
		try
		{
			sApplyMethod = ((Class) (android/content/SharedPreferences$Editor)).getMethod("apply", new Class[0]);
	//    0    0:ldc1            #51  <Class android.content.SharedPreferences$Editor>
	//    1    2:ldc1            #53  <String "apply">
	//    2    4:iconst_0        
	//    3    5:anewarray       Class[]
	//    4    8:invokevirtual   #59  <Method Method Class.getMethod(String, Class[])>
	//    5   11:putstatic       #61  <Field Method sApplyMethod>
	//    6   14:return          
		}
		catch(NoSuchMethodException nosuchmethodexception)
	//*   7   15:astore_0        
		{
			sApplyMethod = null;
	//    8   16:aconst_null     
	//    9   17:putstatic       #61  <Field Method sApplyMethod>
		}
	//*  10   20:return          
	}
}
