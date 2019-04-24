// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.amap.api.mapcore.util.*;
import java.io.*;
import java.util.zip.*;

// Referenced classes of package com.autonavi.amap.mapcore:
//			FileUtil

public class AeUtil
{
	public static class UnZipFileBrake
	{

		public boolean mIsAborted;

		public UnZipFileBrake()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
			mIsAborted = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #15  <Field boolean mIsAborted>
		//    5    9:return          
		}
	}

	public static interface ZipCompressProgressListener
	{

		public abstract void onFinishProgress(long l);
	}


	public AeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:return          
	}

	private static boolean checkEngineRes(File file)
	{
		file = ((File) (file.listFiles()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method File[] File.listFiles()>
	//    2    4:astore_0        
		return file != null && file.length >= 2;
	//    3    5:aload_0         
	//    4    6:ifnull          17
	//    5    9:aload_0         
	//    6   10:arraylength     
	//    7   11:iconst_2        
	//    8   12:icmplt          17
	//    9   15:iconst_1        
	//   10   16:ireturn         
	//   11   17:iconst_0        
	//   12   18:ireturn         
	}

	private static void decompress(File file, File file1, ZipInputStream zipinputstream, long l, ZipCompressProgressListener zipcompressprogresslistener, UnZipFileBrake unzipfilebrake)
		throws Exception
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          7
		boolean flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          9
		boolean flag;
		do
		{
			ZipEntry zipentry = zipinputstream.getNextEntry();
	//    4    6:aload_2         
	//    5    7:invokevirtual   #71  <Method ZipEntry ZipInputStream.getNextEntry()>
	//    6   10:astore          10
			flag = flag1;
	//    7   12:iload           9
	//    8   14:istore          8
			if(zipentry == null)
				break;
	//    9   16:aload           10
	//   10   18:ifnull          155
			if(unzipfilebrake != null && unzipfilebrake.mIsAborted)
	//*  11   21:aload           6
	//*  12   23:ifnull          39
	//*  13   26:aload           6
	//*  14   28:getfield        #74  <Field boolean AeUtil$UnZipFileBrake.mIsAborted>
	//*  15   31:ifeq            39
			{
				zipinputstream.closeEntry();
	//   16   34:aload_2         
	//   17   35:invokevirtual   #77  <Method void ZipInputStream.closeEntry()>
				return;
	//   18   38:return          
			}
			Object obj = ((Object) (zipentry.getName()));
	//   19   39:aload           10
	//   20   41:invokevirtual   #83  <Method String ZipEntry.getName()>
	//   21   44:astore          11
			if(TextUtils.isEmpty(((CharSequence) (obj))) || ((String) (obj)).contains("../"))
	//*  22   46:aload           11
	//*  23   48:invokestatic    #89  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  24   51:ifne            64
	//*  25   54:aload           11
	//*  26   56:ldc1            #91  <String "../">
	//*  27   58:invokevirtual   #96  <Method boolean String.contains(CharSequence)>
	//*  28   61:ifeq            70
			{
				flag = true;
	//   29   64:iconst_1        
	//   30   65:istore          8
				break;
	//   31   67:goto            155
			}
			obj = ((Object) (new File((new StringBuilder()).append(file1.getPath()).append(File.separator).append(((String) (obj))).toString())));
	//   32   70:new             #57  <Class File>
	//   33   73:dup             
	//   34   74:new             #98  <Class StringBuilder>
	//   35   77:dup             
	//   36   78:invokespecial   #99  <Method void StringBuilder()>
	//   37   81:aload_1         
	//   38   82:invokevirtual   #102 <Method String File.getPath()>
	//   39   85:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   40   88:getstatic       #109 <Field String File.separator>
	//   41   91:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   42   94:aload           11
	//   43   96:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   44   99:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   45  102:invokespecial   #115 <Method void File(String)>
	//   46  105:astore          11
			fileProber(((File) (obj)));
	//   47  107:aload           11
	//   48  109:invokestatic    #119 <Method void fileProber(File)>
			if(zipentry.isDirectory())
	//*  49  112:aload           10
	//*  50  114:invokevirtual   #123 <Method boolean ZipEntry.isDirectory()>
	//*  51  117:ifeq            129
				((File) (obj)).mkdirs();
	//   52  120:aload           11
	//   53  122:invokevirtual   #126 <Method boolean File.mkdirs()>
	//   54  125:pop             
			else
	//*  55  126:goto            148
				i += decompressFile(((File) (obj)), zipinputstream, i, l, zipcompressprogresslistener, unzipfilebrake);
	//   56  129:iload           7
	//   57  131:aload           11
	//   58  133:aload_2         
	//   59  134:iload           7
	//   60  136:i2l             
	//   61  137:lload_3         
	//   62  138:aload           5
	//   63  140:aload           6
	//   64  142:invokestatic    #130 <Method int decompressFile(File, ZipInputStream, long, long, AeUtil$ZipCompressProgressListener, AeUtil$UnZipFileBrake)>
	//   65  145:iadd            
	//   66  146:istore          7
			zipinputstream.closeEntry();
	//   67  148:aload_2         
	//   68  149:invokevirtual   #77  <Method void ZipInputStream.closeEntry()>
		} while(true);
	//   69  152:goto            6
		if(!flag)
			break MISSING_BLOCK_LABEL_171;
	//   70  155:iload           8
	//   71  157:ifeq            171
		if(file == null)
			break MISSING_BLOCK_LABEL_169;
	//   72  160:aload_0         
	//   73  161:ifnull          169
		file.delete();
	//   74  164:aload_0         
	//   75  165:invokevirtual   #133 <Method boolean File.delete()>
	//   76  168:pop             
		return;
	//   77  169:return          
		file;
	//   78  170:astore_0        
	//   79  171:return          
	}

	public static void decompress(InputStream inputstream, String s)
		throws Exception
	{
		decompress(inputstream, s, 0L, ((ZipCompressProgressListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lconst_0        
	//    3    3:aconst_null     
	//    4    4:invokestatic    #138 <Method void decompress(InputStream, String, long, AeUtil$ZipCompressProgressListener)>
	//    5    7:return          
	}

	private static void decompress(InputStream inputstream, String s, long l, ZipCompressProgressListener zipcompressprogresslistener)
		throws Exception
	{
		inputstream = ((InputStream) (new CheckedInputStream(inputstream, ((java.util.zip.Checksum) (new CRC32())))));
	//    0    0:new             #140 <Class CheckedInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #142 <Class CRC32>
	//    4    8:dup             
	//    5    9:invokespecial   #143 <Method void CRC32()>
	//    6   12:invokespecial   #146 <Method void CheckedInputStream(InputStream, java.util.zip.Checksum)>
	//    7   15:astore_0        
		ZipInputStream zipinputstream = new ZipInputStream(inputstream);
	//    8   16:new             #67  <Class ZipInputStream>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #149 <Method void ZipInputStream(InputStream)>
	//   12   24:astore          5
		decompress(((File) (null)), new File(s), zipinputstream, l, zipcompressprogresslistener, ((UnZipFileBrake) (null)));
	//   13   26:aconst_null     
	//   14   27:new             #57  <Class File>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokespecial   #115 <Method void File(String)>
	//   18   35:aload           5
	//   19   37:lload_2         
	//   20   38:aload           4
	//   21   40:aconst_null     
	//   22   41:invokestatic    #151 <Method void decompress(File, File, ZipInputStream, long, AeUtil$ZipCompressProgressListener, AeUtil$UnZipFileBrake)>
		zipinputstream.close();
	//   23   44:aload           5
	//   24   46:invokevirtual   #154 <Method void ZipInputStream.close()>
		((CheckedInputStream) (inputstream)).close();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #155 <Method void CheckedInputStream.close()>
	//   27   53:return          
	}

	private static int decompressFile(File file, ZipInputStream zipinputstream, long l, long l1, ZipCompressProgressListener zipcompressprogresslistener, UnZipFileBrake unzipfilebrake)
		throws Exception
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          8
		file = ((File) (new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(file))))));
	//    2    3:new             #157 <Class BufferedOutputStream>
	//    3    6:dup             
	//    4    7:new             #159 <Class FileOutputStream>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:invokespecial   #161 <Method void FileOutputStream(File)>
	//    8   15:invokespecial   #164 <Method void BufferedOutputStream(java.io.OutputStream)>
	//    9   18:astore_0        
		byte abyte0[] = new byte[1024];
	//   10   19:sipush          1024
	//   11   22:newarray        byte[]
	//   12   24:astore          12
		do
		{
			int j = zipinputstream.read(abyte0, 0, 1024);
	//   13   26:aload_1         
	//   14   27:aload           12
	//   15   29:iconst_0        
	//   16   30:sipush          1024
	//   17   33:invokevirtual   #168 <Method int ZipInputStream.read(byte[], int, int)>
	//   18   36:istore          9
			if(j == -1)
				break;
	//   19   38:iload           9
	//   20   40:iconst_m1       
	//   21   41:icmpeq          143
			if(unzipfilebrake != null && unzipfilebrake.mIsAborted)
	//*  22   44:aload           7
	//*  23   46:ifnull          64
	//*  24   49:aload           7
	//*  25   51:getfield        #74  <Field boolean AeUtil$UnZipFileBrake.mIsAborted>
	//*  26   54:ifeq            64
			{
				((BufferedOutputStream) (file)).close();
	//   27   57:aload_0         
	//   28   58:invokevirtual   #169 <Method void BufferedOutputStream.close()>
				return i;
	//   29   61:iload           8
	//   30   63:ireturn         
			}
			((BufferedOutputStream) (file)).write(abyte0, 0, j);
	//   31   64:aload_0         
	//   32   65:aload           12
	//   33   67:iconst_0        
	//   34   68:iload           9
	//   35   70:invokevirtual   #173 <Method void BufferedOutputStream.write(byte[], int, int)>
			j = i + j;
	//   36   73:iload           8
	//   37   75:iload           9
	//   38   77:iadd            
	//   39   78:istore          9
			i = j;
	//   40   80:iload           9
	//   41   82:istore          8
			if(l1 > 0L)
	//*  42   84:lload           4
	//*  43   86:lconst_0        
	//*  44   87:lcmp            
	//*  45   88:ifle            26
			{
				i = j;
	//   46   91:iload           9
	//   47   93:istore          8
				if(zipcompressprogresslistener != null)
	//*  48   95:aload           6
	//*  49   97:ifnull          26
				{
					long l2 = (((long)j + l) * 100L) / l1;
	//   50  100:iload           9
	//   51  102:i2l             
	//   52  103:lload_2         
	//   53  104:ladd            
	//   54  105:ldc2w           #174 <Long 100L>
	//   55  108:lmul            
	//   56  109:lload           4
	//   57  111:ldiv            
	//   58  112:lstore          10
					if(unzipfilebrake == null || !unzipfilebrake.mIsAborted)
	//*  59  114:aload           7
	//*  60  116:ifnull          127
	//*  61  119:aload           7
	//*  62  121:getfield        #74  <Field boolean AeUtil$UnZipFileBrake.mIsAborted>
	//*  63  124:ifne            136
						zipcompressprogresslistener.onFinishProgress(l2);
	//   64  127:aload           6
	//   65  129:lload           10
	//   66  131:invokeinterface #179 <Method void AeUtil$ZipCompressProgressListener.onFinishProgress(long)>
					i = j;
	//   67  136:iload           9
	//   68  138:istore          8
				}
			}
		} while(true);
	//   69  140:goto            26
		((BufferedOutputStream) (file)).close();
	//   70  143:aload_0         
	//   71  144:invokevirtual   #169 <Method void BufferedOutputStream.close()>
		return i;
	//   72  147:iload           8
	//   73  149:ireturn         
	}

	private static void fileProber(File file)
	{
		file = file.getParentFile();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method File File.getParentFile()>
	//    2    4:astore_0        
		if(!file.exists())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #186 <Method boolean File.exists()>
	//*   5    9:ifne            21
		{
			fileProber(file);
	//    6   12:aload_0         
	//    7   13:invokestatic    #119 <Method void fileProber(File)>
			file.mkdir();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #189 <Method boolean File.mkdir()>
	//   10   20:pop             
		}
	//   11   21:return          
	}

	public static com.autonavi.ae.gmap.GLMapEngine.InitParam initResource(Context context)
	{
		String s = FileUtil.getMapBaseStorage(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #199 <Method String FileUtil.getMapBaseStorage(Context)>
	//    2    4:astore_1        
		String s1 = (new StringBuilder()).append(s).append("data_v6").append("/").toString();
	//    3    5:new             #98  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #99  <Method void StringBuilder()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:ldc1            #34  <String "data_v6">
	//    9   18:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:ldc1            #201 <String "/">
	//   11   23:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   13   29:astore_2        
		Object obj = ((Object) (new File(s)));
	//   14   30:new             #57  <Class File>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokespecial   #115 <Method void File(String)>
	//   18   38:astore_3        
		if(!((File) (obj)).exists())
	//*  19   39:aload_3         
	//*  20   40:invokevirtual   #186 <Method boolean File.exists()>
	//*  21   43:ifne            51
			((File) (obj)).mkdir();
	//   22   46:aload_3         
	//   23   47:invokevirtual   #189 <Method boolean File.mkdir()>
	//   24   50:pop             
		if(Looper.myLooper() == Looper.getMainLooper())
	//*  25   51:invokestatic    #207 <Method Looper Looper.myLooper()>
	//*  26   54:invokestatic    #210 <Method Looper Looper.getMainLooper()>
	//*  27   57:if_acmpne       87
			try
			{
				kj.a(1).a(((kk) (new kk(s, context) {

					public void runTask()
					{
						AeUtil.loadEngineRes(currentPath, context);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field String val$currentPath>
					//    2    4:aload_0         
					//    3    5:getfield        #19  <Field Context val$context>
					//    4    8:invokestatic    #27  <Method void AeUtil.access$000(String, Context)>
					//    5   11:return          
					}

					final Context val$context;
					final String val$currentPath;

			
			{
				currentPath = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field String val$currentPath>
				context = context1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Context val$context>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void kk()>
			//    8   14:return          
			}
				}
)));
	//   28   60:iconst_1        
	//   29   61:invokestatic    #216 <Method kj kj.a(int)>
	//   30   64:new             #6   <Class AeUtil$1>
	//   31   67:dup             
	//   32   68:aload_1         
	//   33   69:aload_0         
	//   34   70:invokespecial   #218 <Method void AeUtil$1(String, Context)>
	//   35   73:invokevirtual   #221 <Method void kj.a(kk)>
			}
	//*  36   76:goto            92
			catch(gn gn1)
	//*  37   79:astore_3        
			{
				gn1.printStackTrace();
	//   38   80:aload_3         
	//   39   81:invokevirtual   #224 <Method void gn.printStackTrace()>
			}
		else
	//*  40   84:goto            92
			loadEngineRes(s, context);
	//   41   87:aload_1         
	//   42   88:aload_0         
	//   43   89:invokestatic    #53  <Method void loadEngineRes(String, Context)>
		gn1 = ((gn) (new com.autonavi.ae.gmap.GLMapEngine.InitParam()));
	//   44   92:new             #226 <Class com.autonavi.ae.gmap.GLMapEngine$InitParam>
	//   45   95:dup             
	//   46   96:invokespecial   #227 <Method void com.autonavi.ae.gmap.GLMapEngine$InitParam()>
	//   47   99:astore_3        
		File file = new File(s, "GNaviConfig.xml");
	//   48  100:new             #57  <Class File>
	//   49  103:dup             
	//   50  104:aload_1         
	//   51  105:ldc1            #22  <String "GNaviConfig.xml">
	//   52  107:invokespecial   #230 <Method void File(String, String)>
	//   53  110:astore          4
		if(!file.exists() || !file.isFile() || file.length() <= 0L)
	//*  54  112:aload           4
	//*  55  114:invokevirtual   #186 <Method boolean File.exists()>
	//*  56  117:ifeq            141
	//*  57  120:aload           4
	//*  58  122:invokevirtual   #233 <Method boolean File.isFile()>
	//*  59  125:ifeq            141
	//*  60  128:aload           4
	//*  61  130:invokevirtual   #237 <Method long File.length()>
	//*  62  133:lconst_0        
	//*  63  134:lcmp            
	//*  64  135:ifle            141
	//*  65  138:goto            166
			readAssetsFileAndSave("ae/GNaviConfig.xml", (new StringBuilder()).append(s).append("GNaviConfig.xml").toString(), context);
	//   66  141:ldc1            #239 <String "ae/GNaviConfig.xml">
	//   67  143:new             #98  <Class StringBuilder>
	//   68  146:dup             
	//   69  147:invokespecial   #99  <Method void StringBuilder()>
	//   70  150:aload_1         
	//   71  151:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   72  154:ldc1            #22  <String "GNaviConfig.xml">
	//   73  156:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   74  159:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   75  162:aload_0         
	//   76  163:invokestatic    #243 <Method void readAssetsFileAndSave(String, String, Context)>
		gn1.mRootPath = s;
	//   77  166:aload_3         
	//   78  167:aload_1         
	//   79  168:putfield        #246 <Field String com.autonavi.ae.gmap.GLMapEngine$InitParam.mRootPath>
		gn1.mConfigPath = (new StringBuilder()).append(s).append("GNaviConfig.xml").toString();
	//   80  171:aload_3         
	//   81  172:new             #98  <Class StringBuilder>
	//   82  175:dup             
	//   83  176:invokespecial   #99  <Method void StringBuilder()>
	//   84  179:aload_1         
	//   85  180:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   86  183:ldc1            #22  <String "GNaviConfig.xml">
	//   87  185:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   88  188:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   89  191:putfield        #249 <Field String com.autonavi.ae.gmap.GLMapEngine$InitParam.mConfigPath>
		gn1.mOfflineDataPath = (new StringBuilder()).append(s1).append("/").append("map/").toString();
	//   90  194:aload_3         
	//   91  195:new             #98  <Class StringBuilder>
	//   92  198:dup             
	//   93  199:invokespecial   #99  <Method void StringBuilder()>
	//   94  202:aload_2         
	//   95  203:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   96  206:ldc1            #201 <String "/">
	//   97  208:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   98  211:ldc1            #251 <String "map/">
	//   99  213:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  100  216:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  101  219:putfield        #254 <Field String com.autonavi.ae.gmap.GLMapEngine$InitParam.mOfflineDataPath>
		gn1.mP3dCrossPath = s1;
	//  102  222:aload_3         
	//  103  223:aload_2         
	//  104  224:putfield        #257 <Field String com.autonavi.ae.gmap.GLMapEngine$InitParam.mP3dCrossPath>
		return ((com.autonavi.ae.gmap.GLMapEngine.InitParam) (gn1));
	//  105  227:aload_3         
	//  106  228:areturn         
	}

	private static void loadEngineRes(String s, Context context)
	{
		Context context1;
		Context context2;
		File file;
		file = new File(s, "res");
	//    0    0:new             #57  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc2            #263 <String "res">
	//    4    8:invokespecial   #230 <Method void File(String, String)>
	//    5   11:astore          4
		if(!file.exists() || !file.isDirectory())
	//*   6   13:aload           4
	//*   7   15:invokevirtual   #186 <Method boolean File.exists()>
	//*   8   18:ifeq            29
	//*   9   21:aload           4
	//*  10   23:invokevirtual   #264 <Method boolean File.isDirectory()>
	//*  11   26:ifne            35
			file.mkdirs();
	//   12   29:aload           4
	//   13   31:invokevirtual   #126 <Method boolean File.mkdirs()>
	//   14   34:pop             
		if(checkEngineRes(file))
			break MISSING_BLOCK_LABEL_182;
	//   15   35:aload           4
	//   16   37:invokestatic    #266 <Method boolean checkEngineRes(File)>
	//   17   40:ifne            182
		context2 = null;
	//   18   43:aconst_null     
	//   19   44:astore_3        
		s = null;
	//   20   45:aconst_null     
	//   21   46:astore_0        
		context1 = null;
	//   22   47:aconst_null     
	//   23   48:astore_2        
		context = ((Context) (context.getAssets().open("ae/res.zip")));
	//   24   49:aload_1         
	//   25   50:invokevirtual   #272 <Method AssetManager Context.getAssets()>
	//   26   53:ldc2            #274 <String "ae/res.zip">
	//   27   56:invokevirtual   #280 <Method InputStream AssetManager.open(String)>
	//   28   59:astore_1        
		context1 = context;
	//   29   60:aload_1         
	//   30   61:astore_2        
		context2 = context;
	//   31   62:aload_1         
	//   32   63:astore_3        
		s = ((String) (context));
	//   33   64:aload_1         
	//   34   65:astore_0        
		decompress(((InputStream) (context)), file.getAbsolutePath());
	//   35   66:aload_1         
	//   36   67:aload           4
	//   37   69:invokevirtual   #283 <Method String File.getAbsolutePath()>
	//   38   72:invokestatic    #285 <Method void decompress(InputStream, String)>
		context1 = context;
	//   39   75:aload_1         
	//   40   76:astore_2        
		context2 = context;
	//   41   77:aload_1         
	//   42   78:astore_3        
		s = ((String) (context));
	//   43   79:aload_1         
	//   44   80:astore_0        
		Log.d("DEBUG", "loadEngineRes:OK");
	//   45   81:ldc2            #287 <String "DEBUG">
	//   46   84:ldc2            #289 <String "loadEngineRes:OK">
	//   47   87:invokestatic    #295 <Method int Log.d(String, String)>
	//   48   90:pop             
		if(context != null)
	//*  49   91:aload_1         
	//*  50   92:ifnull          181
			try
			{
				((InputStream) (context)).close();
	//   51   95:aload_1         
	//   52   96:invokevirtual   #298 <Method void InputStream.close()>
			}
	//*  53   99:goto            181
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  54  102:astore_0        
			{
				((IOException) (s)).printStackTrace();
	//   55  103:aload_0         
	//   56  104:invokevirtual   #299 <Method void IOException.printStackTrace()>
			}
		break MISSING_BLOCK_LABEL_181;
	//   57  107:goto            181
		context;
	//   58  110:astore_1        
		s = ((String) (context1));
	//   59  111:aload_2         
	//   60  112:astore_0        
		((Exception) (context)).printStackTrace();
	//   61  113:aload_1         
	//   62  114:invokevirtual   #300 <Method void Exception.printStackTrace()>
		if(context1 != null)
	//*  63  117:aload_2         
	//*  64  118:ifnull          181
			try
			{
				((InputStream) (context1)).close();
	//   65  121:aload_2         
	//   66  122:invokevirtual   #298 <Method void InputStream.close()>
			}
	//*  67  125:goto            181
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  68  128:astore_0        
			{
				((IOException) (s)).printStackTrace();
	//   69  129:aload_0         
	//   70  130:invokevirtual   #299 <Method void IOException.printStackTrace()>
			}
		break MISSING_BLOCK_LABEL_181;
	//   71  133:goto            181
		context;
	//   72  136:astore_1        
		s = ((String) (context2));
	//   73  137:aload_3         
	//   74  138:astore_0        
		((OutOfMemoryError) (context)).printStackTrace();
	//   75  139:aload_1         
	//   76  140:invokevirtual   #301 <Method void OutOfMemoryError.printStackTrace()>
		if(context2 != null)
	//*  77  143:aload_3         
	//*  78  144:ifnull          181
			try
			{
				((InputStream) (context2)).close();
	//   79  147:aload_3         
	//   80  148:invokevirtual   #298 <Method void InputStream.close()>
			}
	//*  81  151:goto            181
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  82  154:astore_0        
			{
				((IOException) (s)).printStackTrace();
	//   83  155:aload_0         
	//   84  156:invokevirtual   #299 <Method void IOException.printStackTrace()>
			}
		break MISSING_BLOCK_LABEL_181;
	//   85  159:goto            181
		context;
	//   86  162:astore_1        
		if(s != null)
	//*  87  163:aload_0         
	//*  88  164:ifnull          179
			try
			{
				((InputStream) (s)).close();
	//   89  167:aload_0         
	//   90  168:invokevirtual   #298 <Method void InputStream.close()>
			}
	//*  91  171:goto            179
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  92  174:astore_0        
			{
				((IOException) (s)).printStackTrace();
	//   93  175:aload_0         
	//   94  176:invokevirtual   #299 <Method void IOException.printStackTrace()>
			}
		throw context;
	//   95  179:aload_1         
	//   96  180:athrow          
		return;
	//   97  181:return          
		Log.d("DEBUG", "checkEngineRes:OK");
	//   98  182:ldc2            #287 <String "DEBUG">
	//   99  185:ldc2            #303 <String "checkEngineRes:OK">
	//  100  188:invokestatic    #295 <Method int Log.d(String, String)>
	//  101  191:pop             
		return;
	//  102  192:return          
	}

	public static void loadLib(Context context)
	{
		try
		{
			ii.a().a(context, ei.a(), "AMapSDK_MAP_v6_3_1");
	//    0    0:invokestatic    #312 <Method ii ii.a()>
	//    1    3:aload_0         
	//    2    4:invokestatic    #317 <Method com.amap.api.mapcore.util.ij ei.a()>
	//    3    7:ldc1            #40  <String "AMapSDK_MAP_v6_3_1">
	//    4    9:invokevirtual   #320 <Method boolean ii.a(Context, com.amap.api.mapcore.util.ij, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   7   14:astore_0        
		{
			hm.c(((Throwable) (context)), "AeUtil", "loadLib");
	//    8   15:aload_0         
	//    9   16:ldc2            #322 <String "AeUtil">
	//   10   19:ldc2            #323 <String "loadLib">
	//   11   22:invokestatic    #329 <Method void hm.c(Throwable, String, String)>
		}
	//   12   25:return          
	}

	public static void readAssetsFileAndSave(String s, String s1, Context context)
	{
		String s2;
		String s3;
		String s4;
		String s5;
		Object obj;
		Object obj1;
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #89  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		s5 = null;
	//    4    8:aconst_null     
	//    5    9:astore          7
		s4 = null;
	//    6   11:aconst_null     
	//    7   12:astore          6
		obj1 = null;
	//    8   14:aconst_null     
	//    9   15:astore          9
		obj = null;
	//   10   17:aconst_null     
	//   11   18:astore          8
		s2 = ((String) (obj));
	//   12   20:aload           8
	//   13   22:astore          4
		s3 = ((String) (obj1));
	//   14   24:aload           9
	//   15   26:astore          5
		s = ((String) (context.getAssets().open(s)));
	//   16   28:aload_2         
	//   17   29:invokevirtual   #272 <Method AssetManager Context.getAssets()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #280 <Method InputStream AssetManager.open(String)>
	//   20   36:astore_0        
		s4 = s;
	//   21   37:aload_0         
	//   22   38:astore          6
		s2 = ((String) (obj));
	//   23   40:aload           8
	//   24   42:astore          4
		s5 = s;
	//   25   44:aload_0         
	//   26   45:astore          7
		s3 = ((String) (obj1));
	//   27   47:aload           9
	//   28   49:astore          5
		s1 = ((String) (new File(s1)));
	//   29   51:new             #57  <Class File>
	//   30   54:dup             
	//   31   55:aload_1         
	//   32   56:invokespecial   #115 <Method void File(String)>
	//   33   59:astore_1        
		s4 = s;
	//   34   60:aload_0         
	//   35   61:astore          6
		s2 = ((String) (obj));
	//   36   63:aload           8
	//   37   65:astore          4
		s5 = s;
	//   38   67:aload_0         
	//   39   68:astore          7
		s3 = ((String) (obj1));
	//   40   70:aload           9
	//   41   72:astore          5
		if(!((File) (s1)).exists())
			break MISSING_BLOCK_LABEL_100;
	//   42   74:aload_1         
	//   43   75:invokevirtual   #186 <Method boolean File.exists()>
	//   44   78:ifeq            100
		s4 = s;
	//   45   81:aload_0         
	//   46   82:astore          6
		s2 = ((String) (obj));
	//   47   84:aload           8
	//   48   86:astore          4
		s5 = s;
	//   49   88:aload_0         
	//   50   89:astore          7
		s3 = ((String) (obj1));
	//   51   91:aload           9
	//   52   93:astore          5
		((File) (s1)).delete();
	//   53   95:aload_1         
	//   54   96:invokevirtual   #133 <Method boolean File.delete()>
	//   55   99:pop             
		s4 = s;
	//   56  100:aload_0         
	//   57  101:astore          6
		s2 = ((String) (obj));
	//   58  103:aload           8
	//   59  105:astore          4
		s5 = s;
	//   60  107:aload_0         
	//   61  108:astore          7
		s3 = ((String) (obj1));
	//   62  110:aload           9
	//   63  112:astore          5
		((File) (s1)).createNewFile();
	//   64  114:aload_1         
	//   65  115:invokevirtual   #332 <Method boolean File.createNewFile()>
	//   66  118:pop             
		s4 = s;
	//   67  119:aload_0         
	//   68  120:astore          6
		s2 = ((String) (obj));
	//   69  122:aload           8
	//   70  124:astore          4
		s5 = s;
	//   71  126:aload_0         
	//   72  127:astore          7
		s3 = ((String) (obj1));
	//   73  129:aload           9
	//   74  131:astore          5
		s1 = ((String) (new FileOutputStream(((File) (s1)))));
	//   75  133:new             #159 <Class FileOutputStream>
	//   76  136:dup             
	//   77  137:aload_1         
	//   78  138:invokespecial   #161 <Method void FileOutputStream(File)>
	//   79  141:astore_1        
		s4 = s;
	//   80  142:aload_0         
	//   81  143:astore          6
		s2 = s1;
	//   82  145:aload_1         
	//   83  146:astore          4
		s5 = s;
	//   84  148:aload_0         
	//   85  149:astore          7
		s3 = s1;
	//   86  151:aload_1         
	//   87  152:astore          5
		context = ((Context) (new byte[1024]));
	//   88  154:sipush          1024
	//   89  157:newarray        byte[]
	//   90  159:astore_2        
_L2:
		s4 = s;
	//   91  160:aload_0         
	//   92  161:astore          6
		s2 = s1;
	//   93  163:aload_1         
	//   94  164:astore          4
		s5 = s;
	//   95  166:aload_0         
	//   96  167:astore          7
		s3 = s1;
	//   97  169:aload_1         
	//   98  170:astore          5
		int i = ((InputStream) (s)).read(((byte []) (context)), 0, 1024);
	//   99  172:aload_0         
	//  100  173:aload_2         
	//  101  174:iconst_0        
	//  102  175:sipush          1024
	//  103  178:invokevirtual   #333 <Method int InputStream.read(byte[], int, int)>
	//  104  181:istore_3        
		if(i <= 0)
			break; /* Loop/switch isn't completed */
	//  105  182:iload_3         
	//  106  183:ifle            208
		s4 = s;
	//  107  186:aload_0         
	//  108  187:astore          6
		s2 = s1;
	//  109  189:aload_1         
	//  110  190:astore          4
		s5 = s;
	//  111  192:aload_0         
	//  112  193:astore          7
		s3 = s1;
	//  113  195:aload_1         
	//  114  196:astore          5
		((FileOutputStream) (s1)).write(((byte []) (context)), 0, i);
	//  115  198:aload_1         
	//  116  199:aload_2         
	//  117  200:iconst_0        
	//  118  201:iload_3         
	//  119  202:invokevirtual   #334 <Method void FileOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//  120  205:goto            160
_L1:
		if(s != null)
	//* 121  208:aload_0         
	//* 122  209:ifnull          224
			try
			{
				((InputStream) (s)).close();
	//  123  212:aload_0         
	//  124  213:invokevirtual   #298 <Method void InputStream.close()>
			}
	//* 125  216:goto            224
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 126  219:astore_0        
			{
				((IOException) (s)).printStackTrace();
	//  127  220:aload_0         
	//  128  221:invokevirtual   #299 <Method void IOException.printStackTrace()>
			}
		if(s1 != null)
	//* 129  224:aload_1         
	//* 130  225:ifnull          326
		{
			try
			{
				((FileOutputStream) (s1)).close();
	//  131  228:aload_1         
	//  132  229:invokevirtual   #335 <Method void FileOutputStream.close()>
				return;
	//  133  232:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 134  233:astore_0        
			{
				((IOException) (s)).printStackTrace();
	//  135  234:aload_0         
	//  136  235:invokevirtual   #299 <Method void IOException.printStackTrace()>
			}
			return;
	//  137  238:return          
		}
		break MISSING_BLOCK_LABEL_326;
		s;
	//  138  239:astore_0        
		s5 = s4;
	//  139  240:aload           6
	//  140  242:astore          7
		s3 = s2;
	//  141  244:aload           4
	//  142  246:astore          5
		((Throwable) (s)).printStackTrace();
	//  143  248:aload_0         
	//  144  249:invokevirtual   #336 <Method void Throwable.printStackTrace()>
		if(s4 != null)
	//* 145  252:aload           6
	//* 146  254:ifnull          270
			try
			{
				((InputStream) (s4)).close();
	//  147  257:aload           6
	//  148  259:invokevirtual   #298 <Method void InputStream.close()>
			}
	//* 149  262:goto            270
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 150  265:astore_0        
			{
				((IOException) (s)).printStackTrace();
	//  151  266:aload_0         
	//  152  267:invokevirtual   #299 <Method void IOException.printStackTrace()>
			}
		if(s2 != null)
	//* 153  270:aload           4
	//* 154  272:ifnull          326
		{
			try
			{
				((FileOutputStream) (s2)).close();
	//  155  275:aload           4
	//  156  277:invokevirtual   #335 <Method void FileOutputStream.close()>
				return;
	//  157  280:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 158  281:astore_0        
			{
				((IOException) (s)).printStackTrace();
	//  159  282:aload_0         
	//  160  283:invokevirtual   #299 <Method void IOException.printStackTrace()>
			}
			return;
	//  161  286:return          
		}
		break MISSING_BLOCK_LABEL_326;
		s;
	//  162  287:astore_0        
		if(s5 != null)
	//* 163  288:aload           7
	//* 164  290:ifnull          306
			try
			{
				((InputStream) (s5)).close();
	//  165  293:aload           7
	//  166  295:invokevirtual   #298 <Method void InputStream.close()>
			}
	//* 167  298:goto            306
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 168  301:astore_1        
			{
				((IOException) (s1)).printStackTrace();
	//  169  302:aload_1         
	//  170  303:invokevirtual   #299 <Method void IOException.printStackTrace()>
			}
		if(s3 != null)
	//* 171  306:aload           5
	//* 172  308:ifnull          324
			try
			{
				((FileOutputStream) (s3)).close();
	//  173  311:aload           5
	//  174  313:invokevirtual   #335 <Method void FileOutputStream.close()>
			}
	//* 175  316:goto            324
			// Misplaced declaration of an exception variable
			catch(String s1)
	//* 176  319:astore_1        
			{
				((IOException) (s1)).printStackTrace();
	//  177  320:aload_1         
	//  178  321:invokevirtual   #299 <Method void IOException.printStackTrace()>
			}
		throw s;
	//  179  324:aload_0         
	//  180  325:athrow          
	//  181  326:return          
	}

	private static final int BUFFER = 1024;
	public static final String CONFIGNAME = "GNaviConfig.xml";
	public static final boolean IS_AE = true;
	public static final String RESZIPNAME = "res.zip";
	public static final String ROOTPATH = "/amap/";
	public static final String ROOT_DATA_PATH_NAME = "data_v6";
	public static final String ROOT_DATA_PATH_OLD_NAME = "data";
	public static final String SO_FILENAME = "AMapSDK_MAP_v6_3_1";
	public static final String SO_FILENAME_NAVI = "AMapSDK_NAVI_v6_1_0";


/*
	static void access$000(String s, Context context)
	{
		loadEngineRes(s, context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #53  <Method void loadEngineRes(String, Context)>
		return;
	//    3    5:return          
	}

*/
}
