// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import android.util.Log;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.craftar:
//			CLog

class FileUtil
{
	public static interface UnzipProgressHandler
	{

		public abstract void fileUnzipped(String s);
	}


	FileUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static void _dirChecker(String s)
	{
		s = ((String) (new File(s)));
	//    0    0:new             #16  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #18  <Method void File(String)>
	//    4    8:astore_0        
		if(!((File) (s)).isDirectory())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #22  <Method boolean File.isDirectory()>
	//*   7   13:ifne            21
			((File) (s)).mkdirs();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #25  <Method boolean File.mkdirs()>
	//   10   20:pop             
	//   11   21:return          
	}

	public static boolean checkFileCanRead(File file)
	{
		if(!file.exists())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #32  <Method boolean File.exists()>
	//*   2    4:ifne            14
		{
			CLog.e("File does not exist");
	//    3    7:ldc1            #34  <String "File does not exist">
	//    4    9:invokestatic    #39  <Method void CLog.e(String)>
			return false;
	//    5   12:iconst_0        
	//    6   13:ireturn         
		}
		if(!file.canRead())
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #42  <Method boolean File.canRead()>
	//*   9   18:ifne            28
		{
			CLog.e("File Cannot be read");
	//   10   21:ldc1            #44  <String "File Cannot be read">
	//   11   23:invokestatic    #39  <Method void CLog.e(String)>
			return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
		}
		try
		{
			file = ((File) (new FileReader(file.getAbsolutePath())));
	//   14   28:new             #46  <Class FileReader>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokevirtual   #50  <Method String File.getAbsolutePath()>
	//   18   36:invokespecial   #51  <Method void FileReader(String)>
	//   19   39:astore_0        
			((FileReader) (file)).read();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #55  <Method int FileReader.read()>
	//   22   44:pop             
			((FileReader) (file)).close();
	//   23   45:aload_0         
	//   24   46:invokevirtual   #58  <Method void FileReader.close()>
		}
	//*  25   49:iconst_1        
	//*  26   50:ireturn         
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  27   51:astore_0        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   28   52:new             #60  <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #61  <Method void StringBuilder()>
	//   31   59:astore_1        
			stringbuilder.append("Exception when checked file can read with message:");
	//   32   60:aload_1         
	//   33   61:ldc1            #63  <String "Exception when checked file can read with message:">
	//   34   63:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
			stringbuilder.append(((Exception) (file)).getMessage());
	//   36   67:aload_1         
	//   37   68:aload_0         
	//   38   69:invokevirtual   #70  <Method String Exception.getMessage()>
	//   39   72:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   40   75:pop             
			CLog.e(stringbuilder.toString());
	//   41   76:aload_1         
	//   42   77:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   43   80:invokestatic    #39  <Method void CLog.e(String)>
			return false;
	//   44   83:iconst_0        
	//   45   84:ireturn         
		}
		return true;
	}

	public static boolean checkFolderCanRead(File file)
	{
		if(!file.isDirectory())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #22  <Method boolean File.isDirectory()>
	//*   2    4:ifne            14
		{
			CLog.e("File is not a directory!");
	//    3    7:ldc1            #76  <String "File is not a directory!">
	//    4    9:invokestatic    #39  <Method void CLog.e(String)>
			return false;
	//    5   12:iconst_0        
	//    6   13:ireturn         
		}
		if(!file.exists())
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #32  <Method boolean File.exists()>
	//*   9   18:ifne            28
		{
			CLog.e("File does not exist");
	//   10   21:ldc1            #34  <String "File does not exist">
	//   11   23:invokestatic    #39  <Method void CLog.e(String)>
			return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
		}
		if(!file.canRead())
	//*  14   28:aload_0         
	//*  15   29:invokevirtual   #42  <Method boolean File.canRead()>
	//*  16   32:ifne            42
		{
			CLog.e("File Cannot be read");
	//   17   35:ldc1            #44  <String "File Cannot be read">
	//   18   37:invokestatic    #39  <Method void CLog.e(String)>
			return false;
	//   19   40:iconst_0        
	//   20   41:ireturn         
		} else
		{
			return true;
	//   21   42:iconst_1        
	//   22   43:ireturn         
		}
	}

	public static long countLinesInFile(String s)
	{
		s = ((String) (new File(s)));
	//    0    0:new             #16  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #18  <Method void File(String)>
	//    4    8:astore_0        
		long l;
		try
		{
			s = ((String) (new BufferedReader(((java.io.Reader) (new FileReader(((File) (s))))))));
	//    5    9:new             #80  <Class BufferedReader>
	//    6   12:dup             
	//    7   13:new             #46  <Class FileReader>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #83  <Method void FileReader(File)>
	//   11   21:invokespecial   #86  <Method void BufferedReader(java.io.Reader)>
	//   12   24:astore_0        
		}
	//*  13   25:lconst_0        
	//*  14   26:lstore_1        
	//*  15   27:aload_0         
	//*  16   28:invokevirtual   #89  <Method String BufferedReader.readLine()>
	//*  17   31:ifnull          41
	//*  18   34:lload_1         
	//*  19   35:lconst_1        
	//*  20   36:ladd            
	//*  21   37:lstore_1        
	//*  22   38:goto            27
	//*  23   41:aload_0         
	//*  24   42:invokevirtual   #90  <Method void BufferedReader.close()>
	//*  25   45:lload_1         
	//*  26   46:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  27   47:astore_0        
		{
			((Exception) (s)).printStackTrace();
	//   28   48:aload_0         
	//   29   49:invokevirtual   #93  <Method void Exception.printStackTrace()>
			return -1L;
	//   30   52:ldc2w           #94  <Long -1L>
	//   31   55:lreturn         
		}
		l = 0L;
		while(((BufferedReader) (s)).readLine() != null) 
			l++;
		((BufferedReader) (s)).close();
		return l;
	}

	public static long countLinesNotEmptyInFile(String s)
	{
		s = ((String) (new File(s)));
	//    0    0:new             #16  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #18  <Method void File(String)>
	//    4    8:astore_0        
		long l;
		BufferedReader bufferedreader;
		try
		{
			bufferedreader = new BufferedReader(((java.io.Reader) (new FileReader(((File) (s))))));
	//    5    9:new             #80  <Class BufferedReader>
	//    6   12:dup             
	//    7   13:new             #46  <Class FileReader>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #83  <Method void FileReader(File)>
	//   11   21:invokespecial   #86  <Method void BufferedReader(java.io.Reader)>
	//   12   24:astore_3        
			s = bufferedreader.readLine();
	//   13   25:aload_3         
	//   14   26:invokevirtual   #89  <Method String BufferedReader.readLine()>
	//   15   29:astore_0        
		}
	//*  16   30:lconst_0        
	//*  17   31:lstore_1        
	//*  18   32:aload_0         
	//*  19   33:ifnull          55
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #101 <Method int String.length()>
	//*  22   40:ifle            55
	//*  23   43:lload_1         
	//*  24   44:lconst_1        
	//*  25   45:ladd            
	//*  26   46:lstore_1        
	//*  27   47:aload_3         
	//*  28   48:invokevirtual   #89  <Method String BufferedReader.readLine()>
	//*  29   51:astore_0        
	//*  30   52:goto            32
	//*  31   55:aload_3         
	//*  32   56:invokevirtual   #90  <Method void BufferedReader.close()>
	//*  33   59:lload_1         
	//*  34   60:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  35   61:astore_0        
		{
			((Exception) (s)).printStackTrace();
	//   36   62:aload_0         
	//   37   63:invokevirtual   #93  <Method void Exception.printStackTrace()>
			return -1L;
	//   38   66:ldc2w           #94  <Long -1L>
	//   39   69:lreturn         
		}
		l = 0L;
		if(s == null)
			break MISSING_BLOCK_LABEL_55;
		if(s.length() <= 0)
			break MISSING_BLOCK_LABEL_55;
		l++;
		s = bufferedreader.readLine();
		break MISSING_BLOCK_LABEL_32;
		bufferedreader.close();
		return l;
	}

	public static JSONObject getJSONfromFilePath(String s)
		throws FileNotFoundException, IOException, JSONException
	{
		Object obj = "";
	//    0    0:ldc1            #111 <String "">
	//    1    2:astore_1        
		BufferedReader bufferedreader;
		StringBuilder stringbuilder;
		try
		{
			bufferedreader = new BufferedReader(((java.io.Reader) (new FileReader(s))));
	//    2    3:new             #80  <Class BufferedReader>
	//    3    6:dup             
	//    4    7:new             #46  <Class FileReader>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:invokespecial   #51  <Method void FileReader(String)>
	//    8   15:invokespecial   #86  <Method void BufferedReader(java.io.Reader)>
	//    9   18:astore_2        
		}
	//*  10   19:aload_1         
	//*  11   20:astore_0        
	//*  12   21:aload_2         
	//*  13   22:invokevirtual   #89  <Method String BufferedReader.readLine()>
	//*  14   25:astore_1        
	//*  15   26:aload_1         
	//*  16   27:ifnull          58
	//*  17   30:new             #60  <Class StringBuilder>
	//*  18   33:dup             
	//*  19   34:invokespecial   #61  <Method void StringBuilder()>
	//*  20   37:astore_3        
	//*  21   38:aload_3         
	//*  22   39:aload_0         
	//*  23   40:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//*  24   43:pop             
	//*  25   44:aload_3         
	//*  26   45:aload_1         
	//*  27   46:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//*  28   49:pop             
	//*  29   50:aload_3         
	//*  30   51:invokevirtual   #73  <Method String StringBuilder.toString()>
	//*  31   54:astore_0        
	//*  32   55:goto            21
	//*  33   58:aload_2         
	//*  34   59:invokevirtual   #90  <Method void BufferedReader.close()>
	//*  35   62:new             #60  <Class StringBuilder>
	//*  36   65:dup             
	//*  37   66:invokespecial   #61  <Method void StringBuilder()>
	//*  38   69:astore_1        
	//*  39   70:aload_1         
	//*  40   71:ldc1            #113 <String "Trying to create JSON from : ">
	//*  41   73:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//*  42   76:pop             
	//*  43   77:aload_1         
	//*  44   78:aload_0         
	//*  45   79:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//*  46   82:pop             
	//*  47   83:aload_1         
	//*  48   84:invokevirtual   #73  <Method String StringBuilder.toString()>
	//*  49   87:invokestatic    #116 <Method void CLog.d(String)>
	//*  50   90:new             #118 <Class JSONObject>
	//*  51   93:dup             
	//*  52   94:aload_0         
	//*  53   95:invokespecial   #119 <Method void JSONObject(String)>
	//*  54   98:astore_0        
	//*  55   99:aload_0         
	//*  56  100:areturn         
	//*  57  101:astore_0        
	//*  58  102:aload_0         
	//*  59  103:athrow          
	//*  60  104:astore_0        
	//*  61  105:aload_2         
	//*  62  106:invokevirtual   #90  <Method void BufferedReader.close()>
	//*  63  109:aload_0         
	//*  64  110:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  65  111:astore_0        
		{
			throw s;
	//   66  112:aload_0         
	//   67  113:athrow          
		}
		s = ((String) (obj));
		obj = ((Object) (bufferedreader.readLine()));
		if(obj == null)
			break MISSING_BLOCK_LABEL_58;
		stringbuilder = new StringBuilder();
		stringbuilder.append(s);
		stringbuilder.append(((String) (obj)));
		s = stringbuilder.toString();
		break MISSING_BLOCK_LABEL_21;
		bufferedreader.close();
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Trying to create JSON from : ");
		((StringBuilder) (obj)).append(s);
		CLog.d(((StringBuilder) (obj)).toString());
		s = ((String) (new JSONObject(s)));
		return ((JSONObject) (s));
		s;
		throw s;
		s;
		try
		{
			bufferedreader.close();
		}
		catch(IOException ioexception) { }
	//   68  114:astore_1        
		throw s;
	//*  69  115:goto            109
	}

	public static int getNumberOfFilesInZip(String s)
	{
		int i;
		try
		{
			s = ((String) (new ZipInputStream(((InputStream) (new FileInputStream(s))))));
	//    0    0:new             #124 <Class ZipInputStream>
	//    1    3:dup             
	//    2    4:new             #126 <Class FileInputStream>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #127 <Method void FileInputStream(String)>
	//    6   12:invokespecial   #130 <Method void ZipInputStream(InputStream)>
	//    7   15:astore_0        
		}
	//*   8   16:iconst_0        
	//*   9   17:istore_1        
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #134 <Method ZipEntry ZipInputStream.getNextEntry()>
	//*  12   22:ifnull          32
	//*  13   25:iload_1         
	//*  14   26:iconst_1        
	//*  15   27:iadd            
	//*  16   28:istore_1        
	//*  17   29:goto            18
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #137 <Method void ZipInputStream.closeEntry()>
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #138 <Method void ZipInputStream.close()>
	//*  22   40:iload_1         
	//*  23   41:ireturn         
	//*  24   42:iconst_m1       
	//*  25   43:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return -1;
		}
		i = 0;
		while(((ZipInputStream) (s)).getNextEntry() != null) 
			i++;
		((ZipInputStream) (s)).closeEntry();
		((ZipInputStream) (s)).close();
		return i;
	//*  26   44:astore_0        
	//*  27   45:goto            42
	}

	public static void moveFile(String s, String s1, String s2)
	{
		FileInputStream fileinputstream;
		Object obj = ((Object) (new File(s2)));
	//    0    0:new             #16  <Class File>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #18  <Method void File(String)>
	//    4    8:astore          4
		if(!((File) (obj)).exists())
	//*   5   10:aload           4
	//*   6   12:invokevirtual   #32  <Method boolean File.exists()>
	//*   7   15:ifne            24
			((File) (obj)).mkdirs();
	//    8   18:aload           4
	//    9   20:invokevirtual   #25  <Method boolean File.mkdirs()>
	//   10   23:pop             
		obj = ((Object) (new StringBuilder()));
	//   11   24:new             #60  <Class StringBuilder>
	//   12   27:dup             
	//   13   28:invokespecial   #61  <Method void StringBuilder()>
	//   14   31:astore          4
		((StringBuilder) (obj)).append(s);
	//   15   33:aload           4
	//   16   35:aload_0         
	//   17   36:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
		((StringBuilder) (obj)).append(s1);
	//   19   40:aload           4
	//   20   42:aload_1         
	//   21   43:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
		fileinputstream = new FileInputStream(((StringBuilder) (obj)).toString());
	//   23   47:new             #126 <Class FileInputStream>
	//   24   50:dup             
	//   25   51:aload           4
	//   26   53:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   27   56:invokespecial   #127 <Method void FileInputStream(String)>
	//   28   59:astore          5
		Object obj1 = ((Object) (s2));
	//   29   61:aload_2         
	//   30   62:astore          4
		byte abyte0[];
		if(!s2.endsWith("/"))
	//*  31   64:aload_2         
	//*  32   65:ldc1            #142 <String "/">
	//*  33   67:invokevirtual   #146 <Method boolean String.endsWith(String)>
	//*  34   70:ifne            104
		{
			obj1 = ((Object) (new StringBuilder()));
	//   35   73:new             #60  <Class StringBuilder>
	//   36   76:dup             
	//   37   77:invokespecial   #61  <Method void StringBuilder()>
	//   38   80:astore          4
			((StringBuilder) (obj1)).append(s2);
	//   39   82:aload           4
	//   40   84:aload_2         
	//   41   85:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   42   88:pop             
			((StringBuilder) (obj1)).append("/");
	//   43   89:aload           4
	//   44   91:ldc1            #142 <String "/">
	//   45   93:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   46   96:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   47   97:aload           4
	//   48   99:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   49  102:astore          4
		}
		s2 = ((String) (new StringBuilder()));
	//   50  104:new             #60  <Class StringBuilder>
	//   51  107:dup             
	//   52  108:invokespecial   #61  <Method void StringBuilder()>
	//   53  111:astore_2        
		((StringBuilder) (s2)).append(((String) (obj1)));
	//   54  112:aload_2         
	//   55  113:aload           4
	//   56  115:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   57  118:pop             
		((StringBuilder) (s2)).append(s1);
	//   58  119:aload_2         
	//   59  120:aload_1         
	//   60  121:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   61  124:pop             
		s2 = ((String) (new FileOutputStream(((StringBuilder) (s2)).toString())));
	//   62  125:new             #148 <Class FileOutputStream>
	//   63  128:dup             
	//   64  129:aload_2         
	//   65  130:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   66  133:invokespecial   #149 <Method void FileOutputStream(String)>
	//   67  136:astore_2        
		abyte0 = new byte[1024];
	//   68  137:sipush          1024
	//   69  140:newarray        byte[]
	//   70  142:astore          4
_L1:
		int i = ((InputStream) (fileinputstream)).read(abyte0);
	//   71  144:aload           5
	//   72  146:aload           4
	//   73  148:invokevirtual   #154 <Method int InputStream.read(byte[])>
	//   74  151:istore_3        
		if(i == -1)
			break MISSING_BLOCK_LABEL_168;
	//   75  152:iload_3         
	//   76  153:iconst_m1       
	//   77  154:icmpeq          168
		((OutputStream) (s2)).write(abyte0, 0, i);
	//   78  157:aload_2         
	//   79  158:aload           4
	//   80  160:iconst_0        
	//   81  161:iload_3         
	//   82  162:invokevirtual   #160 <Method void OutputStream.write(byte[], int, int)>
		  goto _L1
	//*  83  165:goto            144
		try
		{
			((InputStream) (fileinputstream)).close();
	//   84  168:aload           5
	//   85  170:invokevirtual   #161 <Method void InputStream.close()>
			((OutputStream) (s2)).flush();
	//   86  173:aload_2         
	//   87  174:invokevirtual   #164 <Method void OutputStream.flush()>
			((OutputStream) (s2)).close();
	//   88  177:aload_2         
	//   89  178:invokevirtual   #165 <Method void OutputStream.close()>
			s2 = ((String) (new StringBuilder()));
	//   90  181:new             #60  <Class StringBuilder>
	//   91  184:dup             
	//   92  185:invokespecial   #61  <Method void StringBuilder()>
	//   93  188:astore_2        
			((StringBuilder) (s2)).append(s);
	//   94  189:aload_2         
	//   95  190:aload_0         
	//   96  191:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   97  194:pop             
			((StringBuilder) (s2)).append(s1);
	//   98  195:aload_2         
	//   99  196:aload_1         
	//  100  197:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  101  200:pop             
			(new File(((StringBuilder) (s2)).toString())).delete();
	//  102  201:new             #16  <Class File>
	//  103  204:dup             
	//  104  205:aload_2         
	//  105  206:invokevirtual   #73  <Method String StringBuilder.toString()>
	//  106  209:invokespecial   #18  <Method void File(String)>
	//  107  212:invokevirtual   #168 <Method boolean File.delete()>
	//  108  215:pop             
			return;
	//  109  216:return          
		}
	//* 110  217:astore_0        
	//* 111  218:aload_0         
	//* 112  219:invokevirtual   #70  <Method String Exception.getMessage()>
	//* 113  222:invokestatic    #39  <Method void CLog.e(String)>
	//* 114  225:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 115  226:astore_0        
		{
			CLog.e(((FileNotFoundException) (s)).getMessage());
	//  116  227:aload_0         
	//  117  228:invokevirtual   #169 <Method String FileNotFoundException.getMessage()>
	//  118  231:invokestatic    #39  <Method void CLog.e(String)>
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			CLog.e(((Exception) (s)).getMessage());
			return;
		}
		return;
	//  119  234:return          
	}

	public static void unzip(UnzipProgressHandler unzipprogresshandler, String s, String s1)
	{
		ZipInputStream zipinputstream = new ZipInputStream(((InputStream) (new FileInputStream(s))));
	//    0    0:new             #124 <Class ZipInputStream>
	//    1    3:dup             
	//    2    4:new             #126 <Class FileInputStream>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #127 <Method void FileInputStream(String)>
	//    6   12:invokespecial   #130 <Method void ZipInputStream(InputStream)>
	//    7   15:astore          4
_L1:
		Object obj = ((Object) (zipinputstream.getNextEntry()));
	//    8   17:aload           4
	//    9   19:invokevirtual   #134 <Method ZipEntry ZipInputStream.getNextEntry()>
	//   10   22:astore          5
		if(obj == null)
			break MISSING_BLOCK_LABEL_226;
	//   11   24:aload           5
	//   12   26:ifnull          226
label0:
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   29:new             #60  <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #61  <Method void StringBuilder()>
	//   16   36:astore          6
			stringbuilder.append("Unzipping ");
	//   17   38:aload           6
	//   18   40:ldc1            #173 <String "Unzipping ">
	//   19   42:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   20   45:pop             
			stringbuilder.append(((ZipEntry) (obj)).getName());
	//   21   46:aload           6
	//   22   48:aload           5
	//   23   50:invokevirtual   #178 <Method String ZipEntry.getName()>
	//   24   53:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
			Log.v("Decompress", stringbuilder.toString());
	//   26   57:ldc1            #180 <String "Decompress">
	//   27   59:aload           6
	//   28   61:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   29   64:invokestatic    #186 <Method int Log.v(String, String)>
	//   30   67:pop             
			if(!((ZipEntry) (obj)).isDirectory())
				break label0;
	//   31   68:aload           5
	//   32   70:invokevirtual   #187 <Method boolean ZipEntry.isDirectory()>
	//   33   73:ifeq            114
			stringbuilder = new StringBuilder();
	//   34   76:new             #60  <Class StringBuilder>
	//   35   79:dup             
	//   36   80:invokespecial   #61  <Method void StringBuilder()>
	//   37   83:astore          6
			stringbuilder.append(s1);
	//   38   85:aload           6
	//   39   87:aload_2         
	//   40   88:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   41   91:pop             
			stringbuilder.append(((ZipEntry) (obj)).getName());
	//   42   92:aload           6
	//   43   94:aload           5
	//   44   96:invokevirtual   #178 <Method String ZipEntry.getName()>
	//   45   99:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   46  102:pop             
			_dirChecker(stringbuilder.toString());
	//   47  103:aload           6
	//   48  105:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   49  108:invokestatic    #189 <Method void _dirChecker(String)>
		}
		  goto _L1
	//*  50  111:goto            17
		Object obj1;
		byte abyte0[];
		obj1 = ((Object) (new StringBuilder()));
	//   51  114:new             #60  <Class StringBuilder>
	//   52  117:dup             
	//   53  118:invokespecial   #61  <Method void StringBuilder()>
	//   54  121:astore          6
		((StringBuilder) (obj1)).append(s1);
	//   55  123:aload           6
	//   56  125:aload_2         
	//   57  126:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   58  129:pop             
		((StringBuilder) (obj1)).append(((ZipEntry) (obj)).getName());
	//   59  130:aload           6
	//   60  132:aload           5
	//   61  134:invokevirtual   #178 <Method String ZipEntry.getName()>
	//   62  137:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   63  140:pop             
		obj = ((Object) (new FileOutputStream(((StringBuilder) (obj1)).toString())));
	//   64  141:new             #148 <Class FileOutputStream>
	//   65  144:dup             
	//   66  145:aload           6
	//   67  147:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   68  150:invokespecial   #149 <Method void FileOutputStream(String)>
	//   69  153:astore          5
		obj1 = ((Object) (new BufferedOutputStream(((OutputStream) (obj)))));
	//   70  155:new             #191 <Class BufferedOutputStream>
	//   71  158:dup             
	//   72  159:aload           5
	//   73  161:invokespecial   #194 <Method void BufferedOutputStream(OutputStream)>
	//   74  164:astore          6
		abyte0 = new byte[1024];
	//   75  166:sipush          1024
	//   76  169:newarray        byte[]
	//   77  171:astore          7
_L2:
		int i = zipinputstream.read(abyte0);
	//   78  173:aload           4
	//   79  175:aload           7
	//   80  177:invokevirtual   #195 <Method int ZipInputStream.read(byte[])>
	//   81  180:istore_3        
		if(i <= 0)
			break MISSING_BLOCK_LABEL_208;
	//   82  181:iload_3         
	//   83  182:ifle            208
		if(unzipprogresshandler == null)
			break MISSING_BLOCK_LABEL_196;
	//   84  185:aload_0         
	//   85  186:ifnull          196
		unzipprogresshandler.fileUnzipped(s);
	//   86  189:aload_0         
	//   87  190:aload_1         
	//   88  191:invokeinterface #198 <Method void FileUtil$UnzipProgressHandler.fileUnzipped(String)>
		((BufferedOutputStream) (obj1)).write(abyte0, 0, i);
	//   89  196:aload           6
	//   90  198:aload           7
	//   91  200:iconst_0        
	//   92  201:iload_3         
	//   93  202:invokevirtual   #199 <Method void BufferedOutputStream.write(byte[], int, int)>
		  goto _L2
	//*  94  205:goto            173
		((BufferedOutputStream) (obj1)).close();
	//   95  208:aload           6
	//   96  210:invokevirtual   #200 <Method void BufferedOutputStream.close()>
		zipinputstream.closeEntry();
	//   97  213:aload           4
	//   98  215:invokevirtual   #137 <Method void ZipInputStream.closeEntry()>
		((FileOutputStream) (obj)).close();
	//   99  218:aload           5
	//  100  220:invokevirtual   #201 <Method void FileOutputStream.close()>
		  goto _L1
	//* 101  223:goto            17
		try
		{
			zipinputstream.close();
	//  102  226:aload           4
	//  103  228:invokevirtual   #138 <Method void ZipInputStream.close()>
			unzipprogresshandler = ((UnzipProgressHandler) (new StringBuilder()));
	//  104  231:new             #60  <Class StringBuilder>
	//  105  234:dup             
	//  106  235:invokespecial   #61  <Method void StringBuilder()>
	//  107  238:astore_0        
			((StringBuilder) (unzipprogresshandler)).append("Finished decompressing ");
	//  108  239:aload_0         
	//  109  240:ldc1            #203 <String "Finished decompressing ">
	//  110  242:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  111  245:pop             
			((StringBuilder) (unzipprogresshandler)).append(s);
	//  112  246:aload_0         
	//  113  247:aload_1         
	//  114  248:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//  115  251:pop             
			Log.v("Decompress", ((StringBuilder) (unzipprogresshandler)).toString());
	//  116  252:ldc1            #180 <String "Decompress">
	//  117  254:aload_0         
	//  118  255:invokevirtual   #73  <Method String StringBuilder.toString()>
	//  119  258:invokestatic    #186 <Method int Log.v(String, String)>
	//  120  261:pop             
			return;
	//  121  262:return          
		}
		// Misplaced declaration of an exception variable
		catch(UnzipProgressHandler unzipprogresshandler)
	//* 122  263:astore_0        
		{
			Log.e("Decompress", "unzip", ((Throwable) (unzipprogresshandler)));
	//  123  264:ldc1            #180 <String "Decompress">
	//  124  266:ldc1            #204 <String "unzip">
	//  125  268:aload_0         
	//  126  269:invokestatic    #207 <Method int Log.e(String, String, Throwable)>
	//  127  272:pop             
		}
		return;
	//  128  273:return          
	}

	public static void unzip(String s, String s1)
	{
		unzip(((UnzipProgressHandler) (null)), s, s1);
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #210 <Method void unzip(FileUtil$UnzipProgressHandler, String, String)>
	//    4    6:return          
	}

	public static void writeToFile(byte abyte0[], String s)
		throws IOException, FileNotFoundException
	{
		s = ((String) (new FileOutputStream(s)));
	//    0    0:new             #148 <Class FileOutputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #149 <Method void FileOutputStream(String)>
	//    4    8:astore_1        
		((FileOutputStream) (s)).write(abyte0);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #215 <Method void FileOutputStream.write(byte[])>
		((FileOutputStream) (s)).close();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #201 <Method void FileOutputStream.close()>
	//   10   18:return          
	}

	public void copyFile(String s, String s1, String s2)
	{
		Object obj = ((Object) (new File(s2)));
	//    0    0:new             #16  <Class File>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokespecial   #18  <Method void File(String)>
	//    4    8:astore          5
		if(!((File) (obj)).exists())
	//*   5   10:aload           5
	//*   6   12:invokevirtual   #32  <Method boolean File.exists()>
	//*   7   15:ifne            24
			((File) (obj)).mkdirs();
	//    8   18:aload           5
	//    9   20:invokevirtual   #25  <Method boolean File.mkdirs()>
	//   10   23:pop             
		obj = ((Object) (new StringBuilder()));
	//   11   24:new             #60  <Class StringBuilder>
	//   12   27:dup             
	//   13   28:invokespecial   #61  <Method void StringBuilder()>
	//   14   31:astore          5
		((StringBuilder) (obj)).append(s);
	//   15   33:aload           5
	//   16   35:aload_1         
	//   17   36:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
		((StringBuilder) (obj)).append(s1);
	//   19   40:aload           5
	//   20   42:aload_2         
	//   21   43:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
		s = ((String) (new FileInputStream(((StringBuilder) (obj)).toString())));
	//   23   47:new             #126 <Class FileInputStream>
	//   24   50:dup             
	//   25   51:aload           5
	//   26   53:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   27   56:invokespecial   #127 <Method void FileInputStream(String)>
	//   28   59:astore_1        
		obj = ((Object) (new StringBuilder()));
	//   29   60:new             #60  <Class StringBuilder>
	//   30   63:dup             
	//   31   64:invokespecial   #61  <Method void StringBuilder()>
	//   32   67:astore          5
		((StringBuilder) (obj)).append(s2);
	//   33   69:aload           5
	//   34   71:aload_3         
	//   35   72:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
		((StringBuilder) (obj)).append(s1);
	//   37   76:aload           5
	//   38   78:aload_2         
	//   39   79:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   40   82:pop             
		s1 = ((String) (new FileOutputStream(((StringBuilder) (obj)).toString())));
	//   41   83:new             #148 <Class FileOutputStream>
	//   42   86:dup             
	//   43   87:aload           5
	//   44   89:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   45   92:invokespecial   #149 <Method void FileOutputStream(String)>
	//   46   95:astore_2        
		s2 = ((String) (new byte[1024]));
	//   47   96:sipush          1024
	//   48   99:newarray        byte[]
	//   49  101:astore_3        
_L1:
		int i = ((InputStream) (s)).read(((byte []) (s2)));
	//   50  102:aload_1         
	//   51  103:aload_3         
	//   52  104:invokevirtual   #154 <Method int InputStream.read(byte[])>
	//   53  107:istore          4
		if(i == -1)
			break MISSING_BLOCK_LABEL_126;
	//   54  109:iload           4
	//   55  111:iconst_m1       
	//   56  112:icmpeq          126
		((OutputStream) (s1)).write(((byte []) (s2)), 0, i);
	//   57  115:aload_2         
	//   58  116:aload_3         
	//   59  117:iconst_0        
	//   60  118:iload           4
	//   61  120:invokevirtual   #160 <Method void OutputStream.write(byte[], int, int)>
		  goto _L1
	//*  62  123:goto            102
		try
		{
			((InputStream) (s)).close();
	//   63  126:aload_1         
	//   64  127:invokevirtual   #161 <Method void InputStream.close()>
			((OutputStream) (s1)).flush();
	//   65  130:aload_2         
	//   66  131:invokevirtual   #164 <Method void OutputStream.flush()>
			((OutputStream) (s1)).close();
	//   67  134:aload_2         
	//   68  135:invokevirtual   #165 <Method void OutputStream.close()>
			return;
	//   69  138:return          
		}
	//*  70  139:astore_1        
	//*  71  140:aload_1         
	//*  72  141:invokevirtual   #70  <Method String Exception.getMessage()>
	//*  73  144:invokestatic    #39  <Method void CLog.e(String)>
	//*  74  147:return          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  75  148:astore_1        
		{
			CLog.e(((FileNotFoundException) (s)).getMessage());
	//   76  149:aload_1         
	//   77  150:invokevirtual   #169 <Method String FileNotFoundException.getMessage()>
	//   78  153:invokestatic    #39  <Method void CLog.e(String)>
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			CLog.e(((Exception) (s)).getMessage());
			return;
		}
		return;
	//   79  156:return          
	}

	public void deleteFile(String s, String s1)
	{
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void StringBuilder()>
	//    3    7:astore_3        
			stringbuilder.append(s);
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
			stringbuilder.append(s1);
	//    8   14:aload_3         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   11   19:pop             
			(new File(stringbuilder.toString())).delete();
	//   12   20:new             #16  <Class File>
	//   13   23:dup             
	//   14   24:aload_3         
	//   15   25:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   16   28:invokespecial   #18  <Method void File(String)>
	//   17   31:invokevirtual   #168 <Method boolean File.delete()>
	//   18   34:pop             
			return;
	//   19   35:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  20   36:astore_1        
		{
			CLog.e(((Exception) (s)).getMessage());
	//   21   37:aload_1         
	//   22   38:invokevirtual   #70  <Method String Exception.getMessage()>
	//   23   41:invokestatic    #39  <Method void CLog.e(String)>
		}
	//   24   44:return          
	}
}
