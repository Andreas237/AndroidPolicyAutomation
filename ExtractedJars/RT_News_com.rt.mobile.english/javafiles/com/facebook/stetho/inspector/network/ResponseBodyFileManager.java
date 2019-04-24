// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import android.content.Context;
import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.common.Util;
import java.io.*;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			ResponseBodyData

public class ResponseBodyFileManager
{

	public ResponseBodyFileManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Context mContext>
	//    5    9:return          
	}

	private static String getFilename(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("network-response-body-");
	//    4    8:aload_1         
	//    5    9:ldc1            #8   <String "network-response-body-">
	//    6   11:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		return stringbuilder.toString();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   14   25:areturn         
	}

	private static String readContentsAsUTF8(InputStream inputstream)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #40  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		Util.copy(inputstream, ((OutputStream) (bytearrayoutputstream)), new byte[1024]);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:sipush          1024
	//    7   13:newarray        byte[]
	//    8   15:invokestatic    #47  <Method void Util.copy(InputStream, OutputStream, byte[])>
		return bytearrayoutputstream.toString("UTF-8");
	//    9   18:aload_1         
	//   10   19:ldc1            #49  <String "UTF-8">
	//   11   21:invokevirtual   #51  <Method String ByteArrayOutputStream.toString(String)>
	//   12   24:areturn         
	}

	public void cleanupFiles()
	{
		File afile[] = mContext.getFilesDir().listFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context mContext>
	//    2    4:invokevirtual   #59  <Method File Context.getFilesDir()>
	//    3    7:invokevirtual   #65  <Method File[] File.listFiles()>
	//    4   10:astore_3        
		int i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_1        
		for(int j = afile.length; i < j; i++)
	//*   7   13:aload_3         
	//*   8   14:arraylength     
	//*   9   15:istore_2        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          92
		{
			File file = afile[i];
	//   13   21:aload_3         
	//   14   22:iload_1         
	//   15   23:aaload          
	//   16   24:astore          4
			if(file.getName().startsWith("network-response-body-") && !file.delete())
	//*  17   26:aload           4
	//*  18   28:invokevirtual   #68  <Method String File.getName()>
	//*  19   31:ldc1            #8   <String "network-response-body-">
	//*  20   33:invokevirtual   #74  <Method boolean String.startsWith(String)>
	//*  21   36:ifeq            85
	//*  22   39:aload           4
	//*  23   41:invokevirtual   #78  <Method boolean File.delete()>
	//*  24   44:ifne            85
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   25   47:new             #25  <Class StringBuilder>
	//   26   50:dup             
	//   27   51:invokespecial   #26  <Method void StringBuilder()>
	//   28   54:astore          5
				stringbuilder.append("Failed to delete ");
	//   29   56:aload           5
	//   30   58:ldc1            #80  <String "Failed to delete ">
	//   31   60:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
				stringbuilder.append(file.getAbsolutePath());
	//   33   64:aload           5
	//   34   66:aload           4
	//   35   68:invokevirtual   #83  <Method String File.getAbsolutePath()>
	//   36   71:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
				LogRedirector.w("ResponseBodyFileManager", stringbuilder.toString());
	//   38   75:ldc1            #11  <String "ResponseBodyFileManager">
	//   39   77:aload           5
	//   40   79:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   41   82:invokestatic    #89  <Method void LogRedirector.w(String, String)>
			}
		}

	//   42   85:iload_1         
	//   43   86:iconst_1        
	//   44   87:iadd            
	//   45   88:istore_1        
	//*  46   89:goto            16
		LogRedirector.i("ResponseBodyFileManager", "Cleaned up temporary network files.");
	//   47   92:ldc1            #11  <String "ResponseBodyFileManager">
	//   48   94:ldc1            #91  <String "Cleaned up temporary network files.">
	//   49   96:invokestatic    #94  <Method void LogRedirector.i(String, String)>
	//   50   99:return          
	}

	public OutputStream openResponseBodyFile(String s, boolean flag)
		throws IOException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #98  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #100 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #105 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public ResponseBodyData readFile(String s)
		throws IOException
	{
		s = ((String) (mContext.openFileInput(getFilename(s))));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context mContext>
	//    2    4:aload_1         
	//    3    5:invokestatic    #109 <Method String getFilename(String)>
	//    4    8:invokevirtual   #113 <Method java.io.FileInputStream Context.openFileInput(String)>
	//    5   11:astore_1        
		int i = ((InputStream) (s)).read();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #119 <Method int InputStream.read()>
	//    8   16:istore_2        
		if(i != -1)
			break MISSING_BLOCK_LABEL_32;
	//    9   17:iload_2         
	//   10   18:iconst_m1       
	//   11   19:icmpne          32
		throw new EOFException("Failed to read base64Encode byte");
	//   12   22:new             #121 <Class EOFException>
	//   13   25:dup             
	//   14   26:ldc1            #123 <String "Failed to read base64Encode byte">
	//   15   28:invokespecial   #124 <Method void EOFException(String)>
	//   16   31:athrow          
		ResponseBodyData responsebodydata = new ResponseBodyData();
	//   17   32:new             #126 <Class ResponseBodyData>
	//   18   35:dup             
	//   19   36:invokespecial   #127 <Method void ResponseBodyData()>
	//   20   39:astore          4
		boolean flag;
		Exception exception;
		if(i != 0)
	//*  21   41:iload_2         
	//*  22   42:ifeq            81
			flag = true;
	//   23   45:iconst_1        
	//   24   46:istore_3        
		else
	//*  25   47:goto            50
	//*  26   50:aload           4
	//*  27   52:iload_3         
	//*  28   53:putfield        #131 <Field boolean ResponseBodyData.base64Encoded>
	//*  29   56:aload           4
	//*  30   58:aload_1         
	//*  31   59:invokestatic    #133 <Method String readContentsAsUTF8(InputStream)>
	//*  32   62:putfield        #136 <Field String ResponseBodyData.data>
	//*  33   65:aload_1         
	//*  34   66:invokevirtual   #139 <Method void InputStream.close()>
	//*  35   69:aload           4
	//*  36   71:areturn         
	//*  37   72:astore          4
	//*  38   74:aload_1         
	//*  39   75:invokevirtual   #139 <Method void InputStream.close()>
	//*  40   78:aload           4
	//*  41   80:athrow          
			flag = false;
	//   42   81:iconst_0        
	//   43   82:istore_3        
		responsebodydata.base64Encoded = flag;
		responsebodydata.data = readContentsAsUTF8(((InputStream) (s)));
		((InputStream) (s)).close();
		return responsebodydata;
		exception;
		((InputStream) (s)).close();
		throw exception;
	//*  44   83:goto            50
	}

	private static final String FILENAME_PREFIX = "network-response-body-";
	private static final String TAG = "ResponseBodyFileManager";
	private final Context mContext;
}
