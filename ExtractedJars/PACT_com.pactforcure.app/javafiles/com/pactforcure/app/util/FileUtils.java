// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.util;

import android.content.res.Resources;
import android.util.Log;
import com.pactforcure.app.core.BackboneApplication;
import java.io.*;

public class FileUtils
{

	public FileUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static String rawResToString(int i)
	{
		Resources resources;
		ByteArrayOutputStream bytearrayoutputstream;
		Object obj;
		byte abyte0[];
		resources = BackboneApplication.get().getResources();
	//    0    0:invokestatic    #24  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:invokevirtual   #28  <Method Resources BackboneApplication.getResources()>
	//    2    6:astore_2        
		obj = ((Object) (resources.openRawResource(i)));
	//    3    7:aload_2         
	//    4    8:iload_0         
	//    5    9:invokevirtual   #34  <Method InputStream Resources.openRawResource(int)>
	//    6   12:astore          4
		bytearrayoutputstream = new ByteArrayOutputStream();
	//    7   14:new             #36  <Class ByteArrayOutputStream>
	//    8   17:dup             
	//    9   18:invokespecial   #37  <Method void ByteArrayOutputStream()>
	//   10   21:astore_3        
		abyte0 = new byte[1024];
	//   11   22:sipush          1024
	//   12   25:newarray        byte[]
	//   13   27:astore          5
_L2:
		int j = ((InputStream) (obj)).read(abyte0);
	//   14   29:aload           4
	//   15   31:aload           5
	//   16   33:invokevirtual   #43  <Method int InputStream.read(byte[])>
	//   17   36:istore_1        
		if(j == -1)
			break; /* Loop/switch isn't completed */
	//   18   37:iload_1         
	//   19   38:iconst_m1       
	//   20   39:icmpeq          89
		bytearrayoutputstream.write(abyte0, 0, j);
	//   21   42:aload_3         
	//   22   43:aload           5
	//   23   45:iconst_0        
	//   24   46:iload_1         
	//   25   47:invokevirtual   #47  <Method void ByteArrayOutputStream.write(byte[], int, int)>
		if(true) goto _L2; else goto _L1
	//   26   50:goto            29
	//*  27   53:astore          4
	//*  28   55:ldc1            #8   <String "FileUtils">
	//*  29   57:new             #49  <Class StringBuilder>
	//*  30   60:dup             
	//*  31   61:invokespecial   #50  <Method void StringBuilder()>
	//*  32   64:ldc1            #52  <String "couldn't read raw file: ">
	//*  33   66:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  34   69:aload_2         
	//*  35   70:iload_0         
	//*  36   71:invokevirtual   #59  <Method String Resources.getResourceEntryName(int)>
	//*  37   74:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  38   77:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  39   80:invokestatic    #69  <Method int Log.e(String, String)>
	//*  40   83:pop             
_L4:
		return bytearrayoutputstream.toString();
	//   41   84:aload_3         
	//   42   85:invokevirtual   #70  <Method String ByteArrayOutputStream.toString()>
	//   43   88:areturn         
_L1:
		try
		{
			bytearrayoutputstream.close();
	//   44   89:aload_3         
	//   45   90:invokevirtual   #73  <Method void ByteArrayOutputStream.close()>
			((InputStream) (obj)).close();
	//   46   93:aload           4
	//   47   95:invokevirtual   #74  <Method void InputStream.close()>
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			Log.e("FileUtils", (new StringBuilder()).append("couldn't read raw file: ").append(resources.getResourceEntryName(i)).toString());
		}
		if(true) goto _L4; else goto _L3
	//   48   98:goto            84
_L3:
	}

	private static final String TAG = "FileUtils";
}
