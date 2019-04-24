// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

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

// Referenced classes of package o:
//			ai

public final class af
{

	af()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static boolean a(File file)
	{
		ZipFile zipfile = new ZipFile(file);
	//    0    0:new             #36  <Class ZipFile>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #39  <Method void ZipFile(File)>
	//    4    8:astore_1        
		try
		{
			zipfile.close();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #42  <Method void ZipFile.close()>
		}
	//*   7   13:iconst_1        
	//*   8   14:ireturn         
		catch(IOException ioexception)
	//*   9   15:astore_1        
		{
			try
			{
				Log.w("MultiDex", (new StringBuilder()).append("Failed to close zip file: ").append(file.getAbsolutePath()).toString());
	//   10   16:ldc1            #44  <String "MultiDex">
	//   11   18:new             #46  <Class StringBuilder>
	//   12   21:dup             
	//   13   22:invokespecial   #47  <Method void StringBuilder()>
	//   14   25:ldc1            #49  <String "Failed to close zip file: ">
	//   15   27:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #59  <Method String File.getAbsolutePath()>
	//   18   34:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   20   40:invokestatic    #68  <Method int Log.w(String, String)>
	//   21   43:pop             
			}
	//*  22   44:goto            115
			catch(ZipException zipexception)
	//*  23   47:astore_1        
			{
				Log.w("MultiDex", (new StringBuilder()).append("File ").append(file.getAbsolutePath()).append(" is not a valid zip file.").toString(), ((Throwable) (zipexception)));
	//   24   48:ldc1            #44  <String "MultiDex">
	//   25   50:new             #46  <Class StringBuilder>
	//   26   53:dup             
	//   27   54:invokespecial   #47  <Method void StringBuilder()>
	//   28   57:ldc1            #70  <String "File ">
	//   29   59:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:aload_0         
	//   31   63:invokevirtual   #59  <Method String File.getAbsolutePath()>
	//   32   66:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   33   69:ldc1            #72  <String " is not a valid zip file.">
	//   34   71:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   35   74:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   36   77:aload_1         
	//   37   78:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
	//   38   81:pop             
			}
	//*  39   82:goto            115
			catch(IOException ioexception1)
	//*  40   85:astore_1        
			{
				Log.w("MultiDex", (new StringBuilder()).append("Got an IOException trying to open zip file: ").append(file.getAbsolutePath()).toString(), ((Throwable) (ioexception1)));
	//   41   86:ldc1            #44  <String "MultiDex">
	//   42   88:new             #46  <Class StringBuilder>
	//   43   91:dup             
	//   44   92:invokespecial   #47  <Method void StringBuilder()>
	//   45   95:ldc1            #77  <String "Got an IOException trying to open zip file: ">
	//   46   97:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   47  100:aload_0         
	//   48  101:invokevirtual   #59  <Method String File.getAbsolutePath()>
	//   49  104:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   50  107:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   51  110:aload_1         
	//   52  111:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
	//   53  114:pop             
			}
			return false;
	//   54  115:iconst_0        
	//   55  116:ireturn         
		}
		return true;
	}

	public static List b(Context context, ApplicationInfo applicationinfo, File file, boolean flag)
		throws IOException
	{
label0:
		{
			Log.i("MultiDex", (new StringBuilder()).append("MultiDexExtractor.load(").append(applicationinfo.sourceDir).append(", ").append(flag).append(")").toString());
	//    0    0:ldc1            #44  <String "MultiDex">
	//    1    2:new             #46  <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #47  <Method void StringBuilder()>
	//    4    9:ldc1            #80  <String "MultiDexExtractor.load(">
	//    5   11:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_1         
	//    7   15:getfield        #86  <Field String ApplicationInfo.sourceDir>
	//    8   18:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:ldc1            #88  <String ", ">
	//   10   23:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:iload_3         
	//   12   27:invokevirtual   #91  <Method StringBuilder StringBuilder.append(boolean)>
	//   13   30:ldc1            #93  <String ")">
	//   14   32:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   16   38:invokestatic    #96  <Method int Log.i(String, String)>
	//   17   41:pop             
			File file1 = new File(applicationinfo.sourceDir);
	//   18   42:new             #55  <Class File>
	//   19   45:dup             
	//   20   46:aload_1         
	//   21   47:getfield        #86  <Field String ApplicationInfo.sourceDir>
	//   22   50:invokespecial   #99  <Method void File(String)>
	//   23   53:astore          6
			long l = d(file1);
	//   24   55:aload           6
	//   25   57:invokestatic    #103 <Method long d(File)>
	//   26   60:lstore          4
			if(!flag && !e(context, file1, l))
	//*  27   62:iload_3         
	//*  28   63:ifne            131
	//*  29   66:aload_0         
	//*  30   67:aload           6
	//*  31   69:lload           4
	//*  32   71:invokestatic    #107 <Method boolean e(Context, File, long)>
	//*  33   74:ifne            131
			{
				try
				{
					applicationinfo = ((ApplicationInfo) (c(context, file1, file)));
	//   34   77:aload_0         
	//   35   78:aload           6
	//   36   80:aload_2         
	//   37   81:invokestatic    #111 <Method List c(Context, File, File)>
	//   38   84:astore_1        
				}
	//*  39   85:aload_1         
	//*  40   86:astore_0        
	//*  41   87:goto            167
				// Misplaced declaration of an exception variable
				catch(ApplicationInfo applicationinfo)
	//*  42   90:astore_1        
				{
					Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", ((Throwable) (applicationinfo)));
	//   43   91:ldc1            #44  <String "MultiDex">
	//   44   93:ldc1            #113 <String "Failed to reload existing extracted secondary dex files, falling back to fresh extraction">
	//   45   95:aload_1         
	//   46   96:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
	//   47   99:pop             
					applicationinfo = ((ApplicationInfo) (c(file1, file)));
	//   48  100:aload           6
	//   49  102:aload_2         
	//   50  103:invokestatic    #116 <Method List c(File, File)>
	//   51  106:astore_1        
					e(context, c(file1), l, ((List) (applicationinfo)).size() + 1);
	//   52  107:aload_0         
	//   53  108:aload           6
	//   54  110:invokestatic    #118 <Method long c(File)>
	//   55  113:lload           4
	//   56  115:aload_1         
	//   57  116:invokeinterface #124 <Method int List.size()>
	//   58  121:iconst_1        
	//   59  122:iadd            
	//   60  123:invokestatic    #127 <Method void e(Context, long, long, int)>
					context = ((Context) (applicationinfo));
	//   61  126:aload_1         
	//   62  127:astore_0        
					break label0;
	//   63  128:goto            167
				}
				context = ((Context) (applicationinfo));
				break label0;
			}
			Log.i("MultiDex", "Detected that extraction must be performed.");
	//   64  131:ldc1            #44  <String "MultiDex">
	//   65  133:ldc1            #129 <String "Detected that extraction must be performed.">
	//   66  135:invokestatic    #96  <Method int Log.i(String, String)>
	//   67  138:pop             
			applicationinfo = ((ApplicationInfo) (c(file1, file)));
	//   68  139:aload           6
	//   69  141:aload_2         
	//   70  142:invokestatic    #116 <Method List c(File, File)>
	//   71  145:astore_1        
			e(context, c(file1), l, ((List) (applicationinfo)).size() + 1);
	//   72  146:aload_0         
	//   73  147:aload           6
	//   74  149:invokestatic    #118 <Method long c(File)>
	//   75  152:lload           4
	//   76  154:aload_1         
	//   77  155:invokeinterface #124 <Method int List.size()>
	//   78  160:iconst_1        
	//   79  161:iadd            
	//   80  162:invokestatic    #127 <Method void e(Context, long, long, int)>
			context = ((Context) (applicationinfo));
	//   81  165:aload_1         
	//   82  166:astore_0        
		}
		Log.i("MultiDex", (new StringBuilder()).append("load found ").append(((List) (context)).size()).append(" secondary dex files").toString());
	//   83  167:ldc1            #44  <String "MultiDex">
	//   84  169:new             #46  <Class StringBuilder>
	//   85  172:dup             
	//   86  173:invokespecial   #47  <Method void StringBuilder()>
	//   87  176:ldc1            #131 <String "load found ">
	//   88  178:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   89  181:aload_0         
	//   90  182:invokeinterface #124 <Method int List.size()>
	//   91  187:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   92  190:ldc1            #136 <String " secondary dex files">
	//   93  192:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   94  195:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   95  198:invokestatic    #96  <Method int Log.i(String, String)>
	//   96  201:pop             
		return ((List) (context));
	//   97  202:aload_0         
	//   98  203:areturn         
	}

	private static void b(File file)
		throws IOException
	{
		file.mkdir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method boolean File.mkdir()>
	//    2    4:pop             
		if(!file.isDirectory())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #146 <Method boolean File.isDirectory()>
	//*   5    9:ifne            175
		{
			File file1 = file.getParentFile();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #150 <Method File File.getParentFile()>
	//    8   16:astore_1        
			if(file1 == null)
	//*   9   17:aload_1         
	//*  10   18:ifnonnull       57
				Log.e("MultiDex", (new StringBuilder()).append("Failed to create dir ").append(file.getPath()).append(". Parent file is null.").toString());
	//   11   21:ldc1            #44  <String "MultiDex">
	//   12   23:new             #46  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #47  <Method void StringBuilder()>
	//   15   30:ldc1            #152 <String "Failed to create dir ">
	//   16   32:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:aload_0         
	//   18   36:invokevirtual   #155 <Method String File.getPath()>
	//   19   39:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   20   42:ldc1            #157 <String ". Parent file is null.">
	//   21   44:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   22   47:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   23   50:invokestatic    #159 <Method int Log.e(String, String)>
	//   24   53:pop             
			else
	//*  25   54:goto            145
				Log.e("MultiDex", (new StringBuilder()).append("Failed to create dir ").append(file.getPath()).append(". parent file is a dir ").append(file1.isDirectory()).append(", a file ").append(file1.isFile()).append(", exists ").append(file1.exists()).append(", readable ").append(file1.canRead()).append(", writable ").append(file1.canWrite()).toString());
	//   26   57:ldc1            #44  <String "MultiDex">
	//   27   59:new             #46  <Class StringBuilder>
	//   28   62:dup             
	//   29   63:invokespecial   #47  <Method void StringBuilder()>
	//   30   66:ldc1            #152 <String "Failed to create dir ">
	//   31   68:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   32   71:aload_0         
	//   33   72:invokevirtual   #155 <Method String File.getPath()>
	//   34   75:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   35   78:ldc1            #161 <String ". parent file is a dir ">
	//   36   80:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   37   83:aload_1         
	//   38   84:invokevirtual   #146 <Method boolean File.isDirectory()>
	//   39   87:invokevirtual   #91  <Method StringBuilder StringBuilder.append(boolean)>
	//   40   90:ldc1            #163 <String ", a file ">
	//   41   92:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   42   95:aload_1         
	//   43   96:invokevirtual   #166 <Method boolean File.isFile()>
	//   44   99:invokevirtual   #91  <Method StringBuilder StringBuilder.append(boolean)>
	//   45  102:ldc1            #168 <String ", exists ">
	//   46  104:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   47  107:aload_1         
	//   48  108:invokevirtual   #171 <Method boolean File.exists()>
	//   49  111:invokevirtual   #91  <Method StringBuilder StringBuilder.append(boolean)>
	//   50  114:ldc1            #173 <String ", readable ">
	//   51  116:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   52  119:aload_1         
	//   53  120:invokevirtual   #176 <Method boolean File.canRead()>
	//   54  123:invokevirtual   #91  <Method StringBuilder StringBuilder.append(boolean)>
	//   55  126:ldc1            #178 <String ", writable ">
	//   56  128:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   57  131:aload_1         
	//   58  132:invokevirtual   #181 <Method boolean File.canWrite()>
	//   59  135:invokevirtual   #91  <Method StringBuilder StringBuilder.append(boolean)>
	//   60  138:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   61  141:invokestatic    #159 <Method int Log.e(String, String)>
	//   62  144:pop             
			throw new IOException((new StringBuilder()).append("Failed to create cache directory ").append(file.getPath()).toString());
	//   63  145:new             #34  <Class IOException>
	//   64  148:dup             
	//   65  149:new             #46  <Class StringBuilder>
	//   66  152:dup             
	//   67  153:invokespecial   #47  <Method void StringBuilder()>
	//   68  156:ldc1            #183 <String "Failed to create cache directory ">
	//   69  158:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   70  161:aload_0         
	//   71  162:invokevirtual   #155 <Method String File.getPath()>
	//   72  165:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   73  168:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   74  171:invokespecial   #184 <Method void IOException(String)>
	//   75  174:athrow          
		} else
		{
			return;
	//   76  175:return          
		}
	}

	private static long c(File file)
	{
		long l1 = file.lastModified();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method long File.lastModified()>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 == -1L)
	//*   5    7:lload_3         
	//*   6    8:ldc2w           #189 <Long -1L>
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

	private static SharedPreferences c(Context context)
	{
		byte byte0;
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #197 <Field int android.os.Build$VERSION.SDK_INT>
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
	//    9   16:ldc1            #199 <String "multidex.version">
	//   10   18:iload_1         
	//   11   19:invokevirtual   #205 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   12   22:areturn         
	}

	private static List c(Context context, File file, File file1)
		throws IOException
	{
		Log.i("MultiDex", "loading existing secondary dex files");
	//    0    0:ldc1            #44  <String "MultiDex">
	//    1    2:ldc1            #207 <String "loading existing secondary dex files">
	//    2    4:invokestatic    #96  <Method int Log.i(String, String)>
	//    3    7:pop             
		file = ((File) ((new StringBuilder()).append(file.getName()).append(".classes").toString()));
	//    4    8:new             #46  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #47  <Method void StringBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #210 <Method String File.getName()>
	//    9   19:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:ldc1            #212 <String ".classes">
	//   11   24:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   13   30:astore_1        
		int j = c(context).getInt("dex.number", 1);
	//   14   31:aload_0         
	//   15   32:invokestatic    #214 <Method SharedPreferences c(Context)>
	//   16   35:ldc1            #216 <String "dex.number">
	//   17   37:iconst_1        
	//   18   38:invokeinterface #222 <Method int SharedPreferences.getInt(String, int)>
	//   19   43:istore          4
		context = ((Context) (new ArrayList(j)));
	//   20   45:new             #224 <Class ArrayList>
	//   21   48:dup             
	//   22   49:iload           4
	//   23   51:invokespecial   #227 <Method void ArrayList(int)>
	//   24   54:astore_0        
		for(int i = 2; i <= j; i++)
	//*  25   55:iconst_2        
	//*  26   56:istore_3        
	//*  27   57:iload_3         
	//*  28   58:iload           4
	//*  29   60:icmpgt          200
		{
			File file2 = new File(file1, (new StringBuilder()).append(((String) (file))).append(i).append(".zip").toString());
	//   30   63:new             #55  <Class File>
	//   31   66:dup             
	//   32   67:aload_2         
	//   33   68:new             #46  <Class StringBuilder>
	//   34   71:dup             
	//   35   72:invokespecial   #47  <Method void StringBuilder()>
	//   36   75:aload_1         
	//   37   76:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:iload_3         
	//   39   80:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   40   83:ldc1            #229 <String ".zip">
	//   41   85:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   42   88:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   43   91:invokespecial   #232 <Method void File(File, String)>
	//   44   94:astore          5
			if(file2.isFile())
	//*  45   96:aload           5
	//*  46   98:invokevirtual   #166 <Method boolean File.isFile()>
	//*  47  101:ifeq            157
			{
				((List) (context)).add(((Object) (file2)));
	//   48  104:aload_0         
	//   49  105:aload           5
	//   50  107:invokeinterface #236 <Method boolean List.add(Object)>
	//   51  112:pop             
				if(!a(file2))
	//*  52  113:aload           5
	//*  53  115:invokestatic    #238 <Method boolean a(File)>
	//*  54  118:ifne            193
				{
					Log.i("MultiDex", (new StringBuilder()).append("Invalid zip file: ").append(((Object) (file2))).toString());
	//   55  121:ldc1            #44  <String "MultiDex">
	//   56  123:new             #46  <Class StringBuilder>
	//   57  126:dup             
	//   58  127:invokespecial   #47  <Method void StringBuilder()>
	//   59  130:ldc1            #240 <String "Invalid zip file: ">
	//   60  132:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   61  135:aload           5
	//   62  137:invokevirtual   #243 <Method StringBuilder StringBuilder.append(Object)>
	//   63  140:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   64  143:invokestatic    #96  <Method int Log.i(String, String)>
	//   65  146:pop             
					throw new IOException("Invalid ZIP file.");
	//   66  147:new             #34  <Class IOException>
	//   67  150:dup             
	//   68  151:ldc1            #245 <String "Invalid ZIP file.">
	//   69  153:invokespecial   #184 <Method void IOException(String)>
	//   70  156:athrow          
				}
			} else
			{
				throw new IOException((new StringBuilder()).append("Missing extracted secondary dex file '").append(file2.getPath()).append("'").toString());
	//   71  157:new             #34  <Class IOException>
	//   72  160:dup             
	//   73  161:new             #46  <Class StringBuilder>
	//   74  164:dup             
	//   75  165:invokespecial   #47  <Method void StringBuilder()>
	//   76  168:ldc1            #247 <String "Missing extracted secondary dex file '">
	//   77  170:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   78  173:aload           5
	//   79  175:invokevirtual   #155 <Method String File.getPath()>
	//   80  178:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   81  181:ldc1            #249 <String "'">
	//   82  183:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   83  186:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   84  189:invokespecial   #184 <Method void IOException(String)>
	//   85  192:athrow          
			}
		}

	//   86  193:iload_3         
	//   87  194:iconst_1        
	//   88  195:iadd            
	//   89  196:istore_3        
	//*  90  197:goto            57
		return ((List) (context));
	//   91  200:aload_0         
	//   92  201:areturn         
	}

	private static List c(File file, File file1)
		throws IOException
	{
		int i;
		ArrayList arraylist;
		String s1;
		ZipFile zipfile;
		s1 = (new StringBuilder()).append(file.getName()).append(".classes").toString();
	//    0    0:new             #46  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #210 <Method String File.getName()>
	//    5   11:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #212 <String ".classes">
	//    7   16:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #62  <Method String StringBuilder.toString()>
	//    9   22:astore          9
		e(file1, s1);
	//   10   24:aload_1         
	//   11   25:aload           9
	//   12   27:invokestatic    #252 <Method void e(File, String)>
		arraylist = new ArrayList();
	//   13   30:new             #224 <Class ArrayList>
	//   14   33:dup             
	//   15   34:invokespecial   #253 <Method void ArrayList()>
	//   16   37:astore          8
		zipfile = new ZipFile(file);
	//   17   39:new             #36  <Class ZipFile>
	//   18   42:dup             
	//   19   43:aload_0         
	//   20   44:invokespecial   #39  <Method void ZipFile(File)>
	//   21   47:astore          10
		i = 2;
	//   22   49:iconst_2        
	//   23   50:istore_2        
		file = ((File) (zipfile.getEntry((new StringBuilder()).append("classes").append(2).append(".dex").toString())));
	//   24   51:aload           10
	//   25   53:new             #46  <Class StringBuilder>
	//   26   56:dup             
	//   27   57:invokespecial   #47  <Method void StringBuilder()>
	//   28   60:ldc1            #255 <String "classes">
	//   29   62:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   30   65:iconst_2        
	//   31   66:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   32   69:ldc2            #257 <String ".dex">
	//   33   72:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   34   75:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   35   78:invokevirtual   #261 <Method ZipEntry ZipFile.getEntry(String)>
	//   36   81:astore_0        
_L4:
		if(file == null)
			break; /* Loop/switch isn't completed */
	//   37   82:aload_0         
	//   38   83:ifnull          434
		File file2;
		file2 = new File(file1, (new StringBuilder()).append(s1).append(i).append(".zip").toString());
	//   39   86:new             #55  <Class File>
	//   40   89:dup             
	//   41   90:aload_1         
	//   42   91:new             #46  <Class StringBuilder>
	//   43   94:dup             
	//   44   95:invokespecial   #47  <Method void StringBuilder()>
	//   45   98:aload           9
	//   46  100:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   47  103:iload_2         
	//   48  104:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   49  107:ldc1            #229 <String ".zip">
	//   50  109:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   51  112:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   52  115:invokespecial   #232 <Method void File(File, String)>
	//   53  118:astore          11
		((List) (arraylist)).add(((Object) (file2)));
	//   54  120:aload           8
	//   55  122:aload           11
	//   56  124:invokeinterface #236 <Method boolean List.add(Object)>
	//   57  129:pop             
		Log.i("MultiDex", (new StringBuilder()).append("Extraction is needed for file ").append(((Object) (file2))).toString());
	//   58  130:ldc1            #44  <String "MultiDex">
	//   59  132:new             #46  <Class StringBuilder>
	//   60  135:dup             
	//   61  136:invokespecial   #47  <Method void StringBuilder()>
	//   62  139:ldc2            #263 <String "Extraction is needed for file ">
	//   63  142:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   64  145:aload           11
	//   65  147:invokevirtual   #243 <Method StringBuilder StringBuilder.append(Object)>
	//   66  150:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   67  153:invokestatic    #96  <Method int Log.i(String, String)>
	//   68  156:pop             
		int j;
		boolean flag;
		j = 0;
	//   69  157:iconst_0        
	//   70  158:istore_3        
		flag = false;
	//   71  159:iconst_0        
	//   72  160:istore          5
_L2:
		int k;
		if(j >= 3 || flag)
			break; /* Loop/switch isn't completed */
	//   73  162:iload_3         
	//   74  163:iconst_3        
	//   75  164:icmpge          344
	//   76  167:iload           5
	//   77  169:ifne            344
		k = j + 1;
	//   78  172:iload_3         
	//   79  173:iconst_1        
	//   80  174:iadd            
	//   81  175:istore          4
		boolean flag1;
		StringBuilder stringbuilder;
		d(zipfile, ((ZipEntry) (file)), file2, s1);
	//   82  177:aload           10
	//   83  179:aload_0         
	//   84  180:aload           11
	//   85  182:aload           9
	//   86  184:invokestatic    #266 <Method void d(ZipFile, ZipEntry, File, String)>
		flag1 = a(file2);
	//   87  187:aload           11
	//   88  189:invokestatic    #238 <Method boolean a(File)>
	//   89  192:istore          6
		stringbuilder = (new StringBuilder()).append("Extraction ");
	//   90  194:new             #46  <Class StringBuilder>
	//   91  197:dup             
	//   92  198:invokespecial   #47  <Method void StringBuilder()>
	//   93  201:ldc2            #268 <String "Extraction ">
	//   94  204:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   95  207:astore          12
		String s;
		if(flag1)
	//*  96  209:iload           6
	//*  97  211:ifeq            478
			s = "success";
	//   98  214:ldc2            #270 <String "success">
	//   99  217:astore          7
		else
	//* 100  219:goto            222
	//* 101  222:ldc1            #44  <String "MultiDex">
	//* 102  224:aload           12
	//* 103  226:aload           7
	//* 104  228:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 105  231:ldc2            #272 <String " - length ">
	//* 106  234:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 107  237:aload           11
	//* 108  239:invokevirtual   #59  <Method String File.getAbsolutePath()>
	//* 109  242:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 110  245:ldc2            #274 <String ": ">
	//* 111  248:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 112  251:aload           11
	//* 113  253:invokevirtual   #277 <Method long File.length()>
	//* 114  256:invokevirtual   #280 <Method StringBuilder StringBuilder.append(long)>
	//* 115  259:invokevirtual   #62  <Method String StringBuilder.toString()>
	//* 116  262:invokestatic    #96  <Method int Log.i(String, String)>
	//* 117  265:pop             
	//* 118  266:iload           4
	//* 119  268:istore_3        
	//* 120  269:iload           6
	//* 121  271:istore          5
	//* 122  273:iload           6
	//* 123  275:ifne            162
	//* 124  278:aload           11
	//* 125  280:invokevirtual   #283 <Method boolean File.delete()>
	//* 126  283:pop             
	//* 127  284:iload           4
	//* 128  286:istore_3        
	//* 129  287:iload           6
	//* 130  289:istore          5
	//* 131  291:aload           11
	//* 132  293:invokevirtual   #171 <Method boolean File.exists()>
	//* 133  296:ifeq            162
	//* 134  299:ldc1            #44  <String "MultiDex">
	//* 135  301:new             #46  <Class StringBuilder>
	//* 136  304:dup             
	//* 137  305:invokespecial   #47  <Method void StringBuilder()>
	//* 138  308:ldc2            #285 <String "Failed to delete corrupted secondary dex '">
	//* 139  311:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 140  314:aload           11
	//* 141  316:invokevirtual   #155 <Method String File.getPath()>
	//* 142  319:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 143  322:ldc1            #249 <String "'">
	//* 144  324:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 145  327:invokevirtual   #62  <Method String StringBuilder.toString()>
	//* 146  330:invokestatic    #68  <Method int Log.w(String, String)>
	//* 147  333:pop             
	//* 148  334:iload           4
	//* 149  336:istore_3        
	//* 150  337:iload           6
	//* 151  339:istore          5
	//* 152  341:goto            162
	//* 153  344:iload           5
	//* 154  346:ifne            396
	//* 155  349:new             #34  <Class IOException>
	//* 156  352:dup             
	//* 157  353:new             #46  <Class StringBuilder>
	//* 158  356:dup             
	//* 159  357:invokespecial   #47  <Method void StringBuilder()>
	//* 160  360:ldc2            #287 <String "Could not create zip file ">
	//* 161  363:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 162  366:aload           11
	//* 163  368:invokevirtual   #59  <Method String File.getAbsolutePath()>
	//* 164  371:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 165  374:ldc2            #289 <String " for secondary dex (">
	//* 166  377:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 167  380:iload_2         
	//* 168  381:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//* 169  384:ldc1            #93  <String ")">
	//* 170  386:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 171  389:invokevirtual   #62  <Method String StringBuilder.toString()>
	//* 172  392:invokespecial   #184 <Method void IOException(String)>
	//* 173  395:athrow          
	//* 174  396:iload_2         
	//* 175  397:iconst_1        
	//* 176  398:iadd            
	//* 177  399:istore_2        
	//* 178  400:aload           10
	//* 179  402:new             #46  <Class StringBuilder>
	//* 180  405:dup             
	//* 181  406:invokespecial   #47  <Method void StringBuilder()>
	//* 182  409:ldc1            #255 <String "classes">
	//* 183  411:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 184  414:iload_2         
	//* 185  415:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//* 186  418:ldc2            #257 <String ".dex">
	//* 187  421:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//* 188  424:invokevirtual   #62  <Method String StringBuilder.toString()>
	//* 189  427:invokevirtual   #261 <Method ZipEntry ZipFile.getEntry(String)>
	//* 190  430:astore_0        
	//* 191  431:goto            82
	//* 192  434:aload           10
	//* 193  436:invokevirtual   #42  <Method void ZipFile.close()>
	//* 194  439:aload           8
	//* 195  441:areturn         
	//* 196  442:astore_0        
	//* 197  443:ldc1            #44  <String "MultiDex">
	//* 198  445:ldc2            #291 <String "Failed to close resource">
	//* 199  448:aload_0         
	//* 200  449:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
	//* 201  452:pop             
	//* 202  453:aload           8
	//* 203  455:areturn         
	//* 204  456:astore_0        
	//* 205  457:aload           10
	//* 206  459:invokevirtual   #42  <Method void ZipFile.close()>
	//* 207  462:goto            476
	//* 208  465:astore_1        
	//* 209  466:ldc1            #44  <String "MultiDex">
	//* 210  468:ldc2            #291 <String "Failed to close resource">
	//* 211  471:aload_1         
	//* 212  472:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
	//* 213  475:pop             
	//* 214  476:aload_0         
	//* 215  477:athrow          
			s = "failed";
	//  216  478:ldc2            #293 <String "failed">
	//  217  481:astore          7
		Log.i("MultiDex", stringbuilder.append(s).append(" - length ").append(file2.getAbsolutePath()).append(": ").append(file2.length()).toString());
		j = k;
		flag = flag1;
		if(flag1)
			continue; /* Loop/switch isn't completed */
		file2.delete();
		j = k;
		flag = flag1;
		if(!file2.exists())
			continue; /* Loop/switch isn't completed */
		Log.w("MultiDex", (new StringBuilder()).append("Failed to delete corrupted secondary dex '").append(file2.getPath()).append("'").toString());
		j = k;
		flag = flag1;
		if(true) goto _L2; else goto _L1
_L1:
		if(flag)
			break MISSING_BLOCK_LABEL_396;
		throw new IOException((new StringBuilder()).append("Could not create zip file ").append(file2.getAbsolutePath()).append(" for secondary dex (").append(i).append(")").toString());
		i++;
		file = ((File) (zipfile.getEntry((new StringBuilder()).append("classes").append(i).append(".dex").toString())));
		if(true) goto _L4; else goto _L3
_L3:
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
		file;
		try
		{
			zipfile.close();
		}
		// Misplaced declaration of an exception variable
		catch(File file1)
		{
			Log.w("MultiDex", "Failed to close resource", ((Throwable) (file1)));
		}
		throw file;
	//* 218  483:goto            222
	}

	private static void c(Closeable closeable)
	{
		try
		{
			closeable.close();
	//    0    0:aload_0         
	//    1    1:invokeinterface #298 <Method void Closeable.close()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   3    7:astore_0        
		{
			Log.w("MultiDex", "Failed to close resource", ((Throwable) (closeable)));
	//    4    8:ldc1            #44  <String "MultiDex">
	//    5   10:ldc2            #291 <String "Failed to close resource">
	//    6   13:aload_0         
	//    7   14:invokestatic    #75  <Method int Log.w(String, String, Throwable)>
	//    8   17:pop             
		}
	//    9   18:return          
	}

	private static long d(File file)
		throws IOException
	{
		long l1 = ai.b(file);
	//    0    0:aload_0         
	//    1    1:invokestatic    #302 <Method long ai.b(File)>
	//    2    4:lstore_3        
		long l = l1;
	//    3    5:lload_3         
	//    4    6:lstore_1        
		if(l1 == -1L)
	//*   5    7:lload_3         
	//*   6    8:ldc2w           #189 <Long -1L>
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

	private static void d(android.content.SharedPreferences.Editor editor)
	{
		if(b != null)
	//*   0    0:getstatic       #24  <Field Method b>
	//*   1    3:ifnull          24
			try
			{
				b.invoke(((Object) (editor)), new Object[0]);
	//    2    6:getstatic       #24  <Field Method b>
	//    3    9:aload_0         
	//    4   10:iconst_0        
	//    5   11:anewarray       Object[]
	//    6   14:invokevirtual   #313 <Method Object Method.invoke(Object, Object[])>
	//    7   17:pop             
				return;
	//    8   18:return          
			}
			catch(InvocationTargetException invocationtargetexception) { }
	//    9   19:astore_1        
	//*  10   20:goto            24
			catch(IllegalAccessException illegalaccessexception) { }
	//   11   23:astore_1        
		editor.commit();
	//   12   24:aload_0         
	//   13   25:invokeinterface #316 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   14   30:pop             
	//   15   31:return          
	}

	private static void d(ZipFile zipfile, ZipEntry zipentry, File file, String s)
		throws IOException, FileNotFoundException
	{
		zipfile = ((ZipFile) (zipfile.getInputStream(zipentry)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #322 <Method InputStream ZipFile.getInputStream(ZipEntry)>
	//    3    5:astore_0        
		s = ((String) (File.createTempFile(s, ".zip", file.getParentFile())));
	//    4    6:aload_3         
	//    5    7:ldc1            #229 <String ".zip">
	//    6    9:aload_2         
	//    7   10:invokevirtual   #150 <Method File File.getParentFile()>
	//    8   13:invokestatic    #326 <Method File File.createTempFile(String, String, File)>
	//    9   16:astore_3        
		Log.i("MultiDex", (new StringBuilder()).append("Extracting ").append(((File) (s)).getPath()).toString());
	//   10   17:ldc1            #44  <String "MultiDex">
	//   11   19:new             #46  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #47  <Method void StringBuilder()>
	//   14   26:ldc2            #328 <String "Extracting ">
	//   15   29:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:aload_3         
	//   17   33:invokevirtual   #155 <Method String File.getPath()>
	//   18   36:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   20   42:invokestatic    #96  <Method int Log.i(String, String)>
	//   21   45:pop             
		ZipOutputStream zipoutputstream = new ZipOutputStream(((java.io.OutputStream) (new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(((File) (s)))))))));
	//   22   46:new             #330 <Class ZipOutputStream>
	//   23   49:dup             
	//   24   50:new             #332 <Class BufferedOutputStream>
	//   25   53:dup             
	//   26   54:new             #334 <Class FileOutputStream>
	//   27   57:dup             
	//   28   58:aload_3         
	//   29   59:invokespecial   #335 <Method void FileOutputStream(File)>
	//   30   62:invokespecial   #338 <Method void BufferedOutputStream(java.io.OutputStream)>
	//   31   65:invokespecial   #339 <Method void ZipOutputStream(java.io.OutputStream)>
	//   32   68:astore          5
		int i;
		ZipEntry zipentry1 = new ZipEntry("classes.dex");
	//   33   70:new             #341 <Class ZipEntry>
	//   34   73:dup             
	//   35   74:ldc2            #343 <String "classes.dex">
	//   36   77:invokespecial   #344 <Method void ZipEntry(String)>
	//   37   80:astore          6
		zipentry1.setTime(zipentry.getTime());
	//   38   82:aload           6
	//   39   84:aload_1         
	//   40   85:invokevirtual   #347 <Method long ZipEntry.getTime()>
	//   41   88:invokevirtual   #351 <Method void ZipEntry.setTime(long)>
		zipoutputstream.putNextEntry(zipentry1);
	//   42   91:aload           5
	//   43   93:aload           6
	//   44   95:invokevirtual   #355 <Method void ZipOutputStream.putNextEntry(ZipEntry)>
		zipentry = ((ZipEntry) (new byte[16384]));
	//   45   98:sipush          16384
	//   46  101:newarray        byte[]
	//   47  103:astore_1        
		i = ((InputStream) (zipfile)).read(((byte []) (zipentry)));
	//   48  104:aload_0         
	//   49  105:aload_1         
	//   50  106:invokevirtual   #361 <Method int InputStream.read(byte[])>
	//   51  109:istore          4
_L1:
		if(i == -1)
			break MISSING_BLOCK_LABEL_136;
	//   52  111:iload           4
	//   53  113:iconst_m1       
	//   54  114:icmpeq          136
		zipoutputstream.write(((byte []) (zipentry)), 0, i);
	//   55  117:aload           5
	//   56  119:aload_1         
	//   57  120:iconst_0        
	//   58  121:iload           4
	//   59  123:invokevirtual   #365 <Method void ZipOutputStream.write(byte[], int, int)>
		i = ((InputStream) (zipfile)).read(((byte []) (zipentry)));
	//   60  126:aload_0         
	//   61  127:aload_1         
	//   62  128:invokevirtual   #361 <Method int InputStream.read(byte[])>
	//   63  131:istore          4
		  goto _L1
	//*  64  133:goto            111
		zipoutputstream.closeEntry();
	//   65  136:aload           5
	//   66  138:invokevirtual   #368 <Method void ZipOutputStream.closeEntry()>
		zipoutputstream.close();
	//   67  141:aload           5
	//   68  143:invokevirtual   #369 <Method void ZipOutputStream.close()>
		break MISSING_BLOCK_LABEL_157;
	//   69  146:goto            157
		zipentry;
	//   70  149:astore_1        
		zipoutputstream.close();
	//   71  150:aload           5
	//   72  152:invokevirtual   #369 <Method void ZipOutputStream.close()>
		throw zipentry;
	//   73  155:aload_1         
	//   74  156:athrow          
		Log.i("MultiDex", (new StringBuilder()).append("Renaming to ").append(file.getPath()).toString());
	//   75  157:ldc1            #44  <String "MultiDex">
	//   76  159:new             #46  <Class StringBuilder>
	//   77  162:dup             
	//   78  163:invokespecial   #47  <Method void StringBuilder()>
	//   79  166:ldc2            #371 <String "Renaming to ">
	//   80  169:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   81  172:aload_2         
	//   82  173:invokevirtual   #155 <Method String File.getPath()>
	//   83  176:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   84  179:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   85  182:invokestatic    #96  <Method int Log.i(String, String)>
	//   86  185:pop             
		if(!((File) (s)).renameTo(file))
	//*  87  186:aload_3         
	//*  88  187:aload_2         
	//*  89  188:invokevirtual   #374 <Method boolean File.renameTo(File)>
	//*  90  191:ifne            244
			throw new IOException((new StringBuilder()).append("Failed to rename \"").append(((File) (s)).getAbsolutePath()).append("\" to \"").append(file.getAbsolutePath()).append("\"").toString());
	//   91  194:new             #34  <Class IOException>
	//   92  197:dup             
	//   93  198:new             #46  <Class StringBuilder>
	//   94  201:dup             
	//   95  202:invokespecial   #47  <Method void StringBuilder()>
	//   96  205:ldc2            #376 <String "Failed to rename \"">
	//   97  208:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   98  211:aload_3         
	//   99  212:invokevirtual   #59  <Method String File.getAbsolutePath()>
	//  100  215:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  101  218:ldc2            #378 <String "\" to \"">
	//  102  221:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  103  224:aload_2         
	//  104  225:invokevirtual   #59  <Method String File.getAbsolutePath()>
	//  105  228:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  106  231:ldc2            #380 <String "\"">
	//  107  234:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  108  237:invokevirtual   #62  <Method String StringBuilder.toString()>
	//  109  240:invokespecial   #184 <Method void IOException(String)>
	//  110  243:athrow          
		c(((Closeable) (zipfile)));
	//  111  244:aload_0         
	//  112  245:invokestatic    #382 <Method void c(Closeable)>
		((File) (s)).delete();
	//  113  248:aload_3         
	//  114  249:invokevirtual   #283 <Method boolean File.delete()>
	//  115  252:pop             
		return;
	//  116  253:return          
		zipentry;
	//  117  254:astore_1        
		c(((Closeable) (zipfile)));
	//  118  255:aload_0         
	//  119  256:invokestatic    #382 <Method void c(Closeable)>
		((File) (s)).delete();
	//  120  259:aload_3         
	//  121  260:invokevirtual   #283 <Method boolean File.delete()>
	//  122  263:pop             
		throw zipentry;
	//  123  264:aload_1         
	//  124  265:athrow          
	}

	private static void e(Context context, long l, long l1, int i)
	{
		context = ((Context) (c(context).edit()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #214 <Method SharedPreferences c(Context)>
	//    2    4:invokeinterface #386 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_0        
		((android.content.SharedPreferences.Editor) (context)).putLong("timestamp", l);
	//    4   10:aload_0         
	//    5   11:ldc2            #388 <String "timestamp">
	//    6   14:lload_1         
	//    7   15:invokeinterface #392 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//    8   20:pop             
		((android.content.SharedPreferences.Editor) (context)).putLong("crc", l1);
	//    9   21:aload_0         
	//   10   22:ldc2            #394 <String "crc">
	//   11   25:lload_3         
	//   12   26:invokeinterface #392 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//   13   31:pop             
		((android.content.SharedPreferences.Editor) (context)).putInt("dex.number", i);
	//   14   32:aload_0         
	//   15   33:ldc1            #216 <String "dex.number">
	//   16   35:iload           5
	//   17   37:invokeinterface #398 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   18   42:pop             
		d(((android.content.SharedPreferences.Editor) (context)));
	//   19   43:aload_0         
	//   20   44:invokestatic    #400 <Method void d(android.content.SharedPreferences$Editor)>
	//   21   47:return          
	}

	private static void e(File file, String s)
		throws IOException
	{
		b(file.getParentFile());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method File File.getParentFile()>
	//    2    4:invokestatic    #402 <Method void b(File)>
		b(file);
	//    3    7:aload_0         
	//    4    8:invokestatic    #402 <Method void b(File)>
		s = ((String) (file.listFiles(new FileFilter(s) {

			public boolean accept(File file1)
			{
				return !file1.getName().startsWith(a);
			//    0    0:aload_1         
			//    1    1:invokevirtual   #29  <Method String File.getName()>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field String a>
			//    4    8:invokevirtual   #35  <Method boolean String.startsWith(String)>
			//    5   11:ifne            16
			//    6   14:iconst_1        
			//    7   15:ireturn         
			//    8   16:iconst_0        
			//    9   17:ireturn         
			}

			final String a;

			
			{
				a = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field String a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//    5   11:aload_0         
	//    6   12:new             #6   <Class af$2>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #403 <Method void af$2(String)>
	//   10   20:invokevirtual   #407 <Method File[] File.listFiles(FileFilter)>
	//   11   23:astore_1        
		if(s == null)
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       64
		{
			Log.w("MultiDex", (new StringBuilder()).append("Failed to list secondary dex dir content (").append(file.getPath()).append(").").toString());
	//   14   28:ldc1            #44  <String "MultiDex">
	//   15   30:new             #46  <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #47  <Method void StringBuilder()>
	//   18   37:ldc2            #409 <String "Failed to list secondary dex dir content (">
	//   19   40:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:aload_0         
	//   21   44:invokevirtual   #155 <Method String File.getPath()>
	//   22   47:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   23   50:ldc2            #411 <String ").">
	//   24   53:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   26   59:invokestatic    #68  <Method int Log.w(String, String)>
	//   27   62:pop             
			return;
	//   28   63:return          
		}
		int j = s.length;
	//   29   64:aload_1         
	//   30   65:arraylength     
	//   31   66:istore_3        
		for(int i = 0; i < j; i++)
	//*  32   67:iconst_0        
	//*  33   68:istore_2        
	//*  34   69:iload_2         
	//*  35   70:iload_3         
	//*  36   71:icmpge          195
		{
			file = ((File) (s[i]));
	//   37   74:aload_1         
	//   38   75:iload_2         
	//   39   76:aaload          
	//   40   77:astore_0        
			Log.i("MultiDex", (new StringBuilder()).append("Trying to delete old file ").append(file.getPath()).append(" of size ").append(file.length()).toString());
	//   41   78:ldc1            #44  <String "MultiDex">
	//   42   80:new             #46  <Class StringBuilder>
	//   43   83:dup             
	//   44   84:invokespecial   #47  <Method void StringBuilder()>
	//   45   87:ldc2            #413 <String "Trying to delete old file ">
	//   46   90:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   47   93:aload_0         
	//   48   94:invokevirtual   #155 <Method String File.getPath()>
	//   49   97:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   50  100:ldc2            #415 <String " of size ">
	//   51  103:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   52  106:aload_0         
	//   53  107:invokevirtual   #277 <Method long File.length()>
	//   54  110:invokevirtual   #280 <Method StringBuilder StringBuilder.append(long)>
	//   55  113:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   56  116:invokestatic    #96  <Method int Log.i(String, String)>
	//   57  119:pop             
			if(!file.delete())
	//*  58  120:aload_0         
	//*  59  121:invokevirtual   #283 <Method boolean File.delete()>
	//*  60  124:ifne            159
				Log.w("MultiDex", (new StringBuilder()).append("Failed to delete old file ").append(file.getPath()).toString());
	//   61  127:ldc1            #44  <String "MultiDex">
	//   62  129:new             #46  <Class StringBuilder>
	//   63  132:dup             
	//   64  133:invokespecial   #47  <Method void StringBuilder()>
	//   65  136:ldc2            #417 <String "Failed to delete old file ">
	//   66  139:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   67  142:aload_0         
	//   68  143:invokevirtual   #155 <Method String File.getPath()>
	//   69  146:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   70  149:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   71  152:invokestatic    #68  <Method int Log.w(String, String)>
	//   72  155:pop             
			else
	//*  73  156:goto            188
				Log.i("MultiDex", (new StringBuilder()).append("Deleted old file ").append(file.getPath()).toString());
	//   74  159:ldc1            #44  <String "MultiDex">
	//   75  161:new             #46  <Class StringBuilder>
	//   76  164:dup             
	//   77  165:invokespecial   #47  <Method void StringBuilder()>
	//   78  168:ldc2            #419 <String "Deleted old file ">
	//   79  171:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   80  174:aload_0         
	//   81  175:invokevirtual   #155 <Method String File.getPath()>
	//   82  178:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   83  181:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   84  184:invokestatic    #96  <Method int Log.i(String, String)>
	//   85  187:pop             
		}

	//   86  188:iload_2         
	//   87  189:iconst_1        
	//   88  190:iadd            
	//   89  191:istore_2        
	//*  90  192:goto            69
	//   91  195:return          
	}

	private static boolean e(Context context, File file, long l)
	{
		context = ((Context) (c(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #214 <Method SharedPreferences c(Context)>
	//    2    4:astore_0        
		return ((SharedPreferences) (context)).getLong("timestamp", -1L) != c(file) || ((SharedPreferences) (context)).getLong("crc", -1L) != l;
	//    3    5:aload_0         
	//    4    6:ldc2            #388 <String "timestamp">
	//    5    9:ldc2w           #189 <Long -1L>
	//    6   12:invokeinterface #423 <Method long SharedPreferences.getLong(String, long)>
	//    7   17:aload_1         
	//    8   18:invokestatic    #118 <Method long c(File)>
	//    9   21:lcmp            
	//   10   22:ifne            42
	//   11   25:aload_0         
	//   12   26:ldc2            #394 <String "crc">
	//   13   29:ldc2w           #189 <Long -1L>
	//   14   32:invokeinterface #423 <Method long SharedPreferences.getLong(String, long)>
	//   15   37:lload_2         
	//   16   38:lcmp            
	//   17   39:ifeq            44
	//   18   42:iconst_1        
	//   19   43:ireturn         
	//   20   44:iconst_0        
	//   21   45:ireturn         
	}

	private static Method b;

	static 
	{
		try
		{
			b = ((Class) (android/content/SharedPreferences$Editor)).getMethod("apply", new Class[0]);
	//    0    0:ldc1            #14  <Class android.content.SharedPreferences$Editor>
	//    1    2:ldc1            #16  <String "apply">
	//    2    4:iconst_0        
	//    3    5:anewarray       Class[]
	//    4    8:invokevirtual   #22  <Method Method Class.getMethod(String, Class[])>
	//    5   11:putstatic       #24  <Field Method b>
	//    6   14:return          
		}
		catch(NoSuchMethodException nosuchmethodexception)
	//*   7   15:astore_0        
		{
			b = null;
	//    8   16:aconst_null     
	//    9   17:putstatic       #24  <Field Method b>
		}
	//*  10   20:return          
	}
}
