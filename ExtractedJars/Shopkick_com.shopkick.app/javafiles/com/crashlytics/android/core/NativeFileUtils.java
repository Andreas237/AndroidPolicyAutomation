// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.*;

// Referenced classes of package com.crashlytics.android.core:
//			BinaryImagesConverter, Sha1FileIdStrategy

final class NativeFileUtils
{

	private NativeFileUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static byte[] binaryImagesJsonFromBinaryLibsFile(File file, Context context)
		throws IOException
	{
		file = ((File) (readFile(file)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method byte[] readFile(File)>
	//    2    4:astore_0        
		if(file != null && file.length != 0)
	//*   3    5:aload_0         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:arraylength     
	//*   7   11:ifne            17
	//*   8   14:goto            30
			return processBinaryImages(context, new String(((byte []) (file))));
	//    9   17:aload_1         
	//   10   18:new             #19  <Class String>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #22  <Method void String(byte[])>
	//   14   26:invokestatic    #26  <Method byte[] processBinaryImages(Context, String)>
	//   15   29:areturn         
		else
			return null;
	//   16   30:aconst_null     
	//   17   31:areturn         
	}

	static byte[] binaryImagesJsonFromDirectory(File file, Context context)
		throws IOException
	{
		File file1 = filter(file, ".maps");
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String ".maps">
	//    2    3:invokestatic    #34  <Method File filter(File, String)>
	//    3    6:astore_2        
		if(file1 != null)
	//*   4    7:aload_2         
	//*   5    8:ifnull          17
			return binaryImagesJsonFromMapsFile(file1, context);
	//    6   11:aload_2         
	//    7   12:aload_1         
	//    8   13:invokestatic    #37  <Method byte[] binaryImagesJsonFromMapsFile(File, Context)>
	//    9   16:areturn         
		file = filter(file, ".binary_libs");
	//   10   17:aload_0         
	//   11   18:ldc1            #39  <String ".binary_libs">
	//   12   20:invokestatic    #34  <Method File filter(File, String)>
	//   13   23:astore_0        
		if(file != null)
	//*  14   24:aload_0         
	//*  15   25:ifnull          34
			return binaryImagesJsonFromBinaryLibsFile(file, context);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokestatic    #41  <Method byte[] binaryImagesJsonFromBinaryLibsFile(File, Context)>
	//   19   33:areturn         
		else
			return null;
	//   20   34:aconst_null     
	//   21   35:areturn         
	}

	private static byte[] binaryImagesJsonFromMapsFile(File file, Context context)
		throws IOException
	{
		if(!file.exists())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #47  <Method boolean File.exists()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		file = ((File) (new BufferedReader(((java.io.Reader) (new FileReader(file))))));
	//    5    9:new             #49  <Class BufferedReader>
	//    6   12:dup             
	//    7   13:new             #51  <Class FileReader>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #54  <Method void FileReader(File)>
	//   11   21:invokespecial   #57  <Method void BufferedReader(java.io.Reader)>
	//   12   24:astore_0        
		context = ((Context) ((new BinaryImagesConverter(context, ((BinaryImagesConverter.FileIdStrategy) (new Sha1FileIdStrategy())))).convert(((BufferedReader) (file)))));
	//   13   25:new             #59  <Class BinaryImagesConverter>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:new             #61  <Class Sha1FileIdStrategy>
	//   17   33:dup             
	//   18   34:invokespecial   #62  <Method void Sha1FileIdStrategy()>
	//   19   37:invokespecial   #65  <Method void BinaryImagesConverter(Context, BinaryImagesConverter$FileIdStrategy)>
	//   20   40:aload_0         
	//   21   41:invokevirtual   #69  <Method byte[] BinaryImagesConverter.convert(BufferedReader)>
	//   22   44:astore_1        
		CommonUtils.closeQuietly(((java.io.Closeable) (file)));
	//   23   45:aload_0         
	//   24   46:invokestatic    #75  <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		return ((byte []) (context));
	//   25   49:aload_1         
	//   26   50:areturn         
		context;
	//   27   51:astore_1        
		break MISSING_BLOCK_LABEL_58;
	//   28   52:goto            58
		context;
	//   29   55:astore_1        
		file = null;
	//   30   56:aconst_null     
	//   31   57:astore_0        
		CommonUtils.closeQuietly(((java.io.Closeable) (file)));
	//   32   58:aload_0         
	//   33   59:invokestatic    #75  <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		throw context;
	//   34   62:aload_1         
	//   35   63:athrow          
	}

	private static File filter(File file, String s)
	{
		file = ((File) (file.listFiles()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method File[] File.listFiles()>
	//    2    4:astore_0        
		int j = file.length;
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_2        
	//*   8   10:iload_2         
	//*   9   11:iload_3         
	//*  10   12:icmpge          42
		{
			File file1 = ((File) (file[i]));
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:aaload          
	//   14   18:astore          4
			if(file1.getName().endsWith(s))
	//*  15   20:aload           4
	//*  16   22:invokevirtual   #83  <Method String File.getName()>
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #87  <Method boolean String.endsWith(String)>
	//*  19   29:ifeq            35
				return file1;
	//   20   32:aload           4
	//   21   34:areturn         
		}

	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:istore_2        
	//*  26   39:goto            10
		return null;
	//   27   42:aconst_null     
	//   28   43:areturn         
	}

	static byte[] metadataJsonFromDirectory(File file)
	{
		file = filter(file, ".device_info");
	//    0    0:aload_0         
	//    1    1:ldc1            #90  <String ".device_info">
	//    2    3:invokestatic    #34  <Method File filter(File, String)>
	//    3    6:astore_0        
		if(file == null)
	//*   4    7:aload_0         
	//*   5    8:ifnonnull       13
			return null;
	//    6   11:aconst_null     
	//    7   12:areturn         
		else
			return readFile(file);
	//    8   13:aload_0         
	//    9   14:invokestatic    #17  <Method byte[] readFile(File)>
	//   10   17:areturn         
	}

	static byte[] minidumpFromDirectory(File file)
	{
		file = filter(file, ".dmp");
	//    0    0:aload_0         
	//    1    1:ldc1            #93  <String ".dmp">
	//    2    3:invokestatic    #34  <Method File filter(File, String)>
	//    3    6:astore_0        
		if(file == null)
	//*   4    7:aload_0         
	//*   5    8:ifnonnull       15
			return new byte[0];
	//    6   11:iconst_0        
	//    7   12:newarray        byte[]
	//    8   14:areturn         
		else
			return minidumpFromFile(file);
	//    9   15:aload_0         
	//   10   16:invokestatic    #96  <Method byte[] minidumpFromFile(File)>
	//   11   19:areturn         
	}

	private static byte[] minidumpFromFile(File file)
	{
		return readFile(file);
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method byte[] readFile(File)>
	//    2    4:areturn         
	}

	private static byte[] processBinaryImages(Context context, String s)
		throws IOException
	{
		return (new BinaryImagesConverter(context, ((BinaryImagesConverter.FileIdStrategy) (new Sha1FileIdStrategy())))).convert(s);
	//    0    0:new             #59  <Class BinaryImagesConverter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #61  <Class Sha1FileIdStrategy>
	//    4    8:dup             
	//    5    9:invokespecial   #62  <Method void Sha1FileIdStrategy()>
	//    6   12:invokespecial   #65  <Method void BinaryImagesConverter(Context, BinaryImagesConverter$FileIdStrategy)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #99  <Method byte[] BinaryImagesConverter.convert(String)>
	//    9   19:areturn         
	}

	private static byte[] readBytes(InputStream inputstream)
		throws IOException
	{
		byte abyte0[] = new byte[1024];
	//    0    0:sipush          1024
	//    1    3:newarray        byte[]
	//    2    5:astore_2        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    3    6:new             #103 <Class ByteArrayOutputStream>
	//    4    9:dup             
	//    5   10:invokespecial   #104 <Method void ByteArrayOutputStream()>
	//    6   13:astore_3        
		do
		{
			int i = inputstream.read(abyte0);
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #110 <Method int InputStream.read(byte[])>
	//   10   19:istore_1        
			if(i != -1)
	//*  11   20:iload_1         
	//*  12   21:iconst_m1       
	//*  13   22:icmpeq          35
				bytearrayoutputstream.write(abyte0, 0, i);
	//   14   25:aload_3         
	//   15   26:aload_2         
	//   16   27:iconst_0        
	//   17   28:iload_1         
	//   18   29:invokevirtual   #114 <Method void ByteArrayOutputStream.write(byte[], int, int)>
			else
	//*  19   32:goto            14
				return bytearrayoutputstream.toByteArray();
	//   20   35:aload_3         
	//   21   36:invokevirtual   #118 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   22   39:areturn         
		} while(true);
	}

	static byte[] readFile(File file)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		file = ((File) (new FileInputStream(file)));
	//    2    2:new             #122 <Class FileInputStream>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #123 <Method void FileInputStream(File)>
	//    6   10:astore_0        
		byte abyte0[] = readBytes(((InputStream) (file)));
	//    7   11:aload_0         
	//    8   12:invokestatic    #125 <Method byte[] readBytes(InputStream)>
	//    9   15:astore_1        
		CommonUtils.closeQuietly(((java.io.Closeable) (file)));
	//   10   16:aload_0         
	//   11   17:invokestatic    #75  <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		return abyte0;
	//   12   20:aload_1         
	//   13   21:areturn         
		Object obj;
		obj;
	//   14   22:astore_1        
		break MISSING_BLOCK_LABEL_29;
	//   15   23:goto            29
		obj;
	//   16   26:astore_1        
		file = ((File) (obj1));
	//   17   27:aload_2         
	//   18   28:astore_0        
		CommonUtils.closeQuietly(((java.io.Closeable) (file)));
	//   19   29:aload_0         
	//   20   30:invokestatic    #75  <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		throw obj;
	//   21   33:aload_1         
	//   22   34:athrow          
_L2:
		file = null;
	//   23   35:aconst_null     
	//   24   36:astore_0        
_L4:
		CommonUtils.closeQuietly(((java.io.Closeable) (file)));
	//   25   37:aload_0         
	//   26   38:invokestatic    #75  <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		return null;
	//   27   41:aconst_null     
	//   28   42:areturn         
_L1:
		file = null;
	//   29   43:aconst_null     
	//   30   44:astore_0        
_L3:
		CommonUtils.closeQuietly(((java.io.Closeable) (file)));
	//   31   45:aload_0         
	//   32   46:invokestatic    #75  <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		return null;
	//   33   49:aconst_null     
	//   34   50:areturn         
		file;
	//   35   51:astore_0        
		  goto _L1
	//*  36   52:goto            43
		file;
	//   37   55:astore_0        
		  goto _L2
	//*  38   56:goto            35
		obj;
	//   39   59:astore_1        
		  goto _L3
	//*  40   60:goto            45
		obj;
	//   41   63:astore_1        
		  goto _L4
	//*  42   64:goto            37
	}
}
