// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.pdf;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package com.pactforcure.app.pdf:
//			AbstractFileProvider

public class FileProvider extends AbstractFileProvider
{

	public FileProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractFileProvider()>
	//    2    4:return          
	}

	private static int parseMode(String s)
	{
		if("r".equals(((Object) (s))))
	//*   0    0:ldc1            #26  <String "r">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            12
			return 0x10000000;
	//    4    9:ldc1            #33  <Int 0x10000000>
	//    5   11:ireturn         
		if("w".equals(((Object) (s))) || "wt".equals(((Object) (s))))
	//*   6   12:ldc1            #35  <String "w">
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*   9   18:ifne            30
	//*  10   21:ldc1            #37  <String "wt">
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  13   27:ifeq            33
			return 0x2c000000;
	//   14   30:ldc1            #38  <Int 0x2c000000>
	//   15   32:ireturn         
		if("wa".equals(((Object) (s))))
	//*  16   33:ldc1            #40  <String "wa">
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  19   39:ifeq            45
			return 0x2a000000;
	//   20   42:ldc1            #41  <Int 0x2a000000>
	//   21   44:ireturn         
		if("rw".equals(((Object) (s))))
	//*  22   45:ldc1            #43  <String "rw">
	//*  23   47:aload_0         
	//*  24   48:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  25   51:ifeq            57
			return 0x38000000;
	//   26   54:ldc1            #44  <Int 0x38000000>
	//   27   56:ireturn         
		if("rwt".equals(((Object) (s))))
	//*  28   57:ldc1            #46  <String "rwt">
	//*  29   59:aload_0         
	//*  30   60:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  31   63:ifeq            69
			return 0x3c000000;
	//   32   66:ldc1            #47  <Int 0x3c000000>
	//   33   68:ireturn         
		else
			throw new IllegalArgumentException((new StringBuilder()).append("Bad mode '").append(s).append("'").toString());
	//   34   69:new             #49  <Class IllegalArgumentException>
	//   35   72:dup             
	//   36   73:new             #51  <Class StringBuilder>
	//   37   76:dup             
	//   38   77:invokespecial   #52  <Method void StringBuilder()>
	//   39   80:ldc1            #54  <String "Bad mode '">
	//   40   82:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   41   85:aload_0         
	//   42   86:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   43   89:ldc1            #60  <String "'">
	//   44   91:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   45   94:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   46   97:invokespecial   #67  <Method void IllegalArgumentException(String)>
	//   47  100:athrow          
	}

	public volatile int delete(Uri uri, String s, String as[])
	{
		return super.delete(uri, s, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #71  <Method int AbstractFileProvider.delete(Uri, String, String[])>
	//    5    7:ireturn         
	}

	protected long getDataLength(Uri uri)
	{
		return (new File(getContext().getFilesDir(), uri.getPath())).length();
	//    0    0:new             #75  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #79  <Method Context getContext()>
	//    4    8:invokevirtual   #85  <Method File Context.getFilesDir()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #88  <Method String Uri.getPath()>
	//    7   15:invokespecial   #91  <Method void File(File, String)>
	//    8   18:invokevirtual   #95  <Method long File.length()>
	//    9   21:lreturn         
	}

	public volatile String getType(Uri uri)
	{
		return super.getType(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #99  <Method String AbstractFileProvider.getType(Uri)>
	//    3    5:areturn         
	}

	public volatile Uri insert(Uri uri, ContentValues contentvalues)
	{
		return super.insert(uri, contentvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #103 <Method Uri AbstractFileProvider.insert(Uri, ContentValues)>
	//    4    6:areturn         
	}

	public boolean onCreate()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ParcelFileDescriptor openFile(Uri uri, String s)
		throws FileNotFoundException
	{
		File file = getContext().getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method Context getContext()>
	//    2    4:invokevirtual   #85  <Method File Context.getFilesDir()>
	//    3    7:astore_3        
		File file1 = new File(file, uri.getPath());
	//    4    8:new             #75  <Class File>
	//    5   11:dup             
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #88  <Method String Uri.getPath()>
	//    9   17:invokespecial   #91  <Method void File(File, String)>
	//   10   20:astore          4
		if(!file1.getPath().startsWith(file.getPath()))
	//*  11   22:aload           4
	//*  12   24:invokevirtual   #110 <Method String File.getPath()>
	//*  13   27:aload_3         
	//*  14   28:invokevirtual   #110 <Method String File.getPath()>
	//*  15   31:invokevirtual   #114 <Method boolean String.startsWith(String)>
	//*  16   34:ifne            47
			throw new SecurityException("Resolved path jumped beyond root");
	//   17   37:new             #116 <Class SecurityException>
	//   18   40:dup             
	//   19   41:ldc1            #118 <String "Resolved path jumped beyond root">
	//   20   43:invokespecial   #119 <Method void SecurityException(String)>
	//   21   46:athrow          
		if(file1.exists())
	//*  22   47:aload           4
	//*  23   49:invokevirtual   #122 <Method boolean File.exists()>
	//*  24   52:ifeq            65
			return ParcelFileDescriptor.open(file1, parseMode(s));
	//   25   55:aload           4
	//   26   57:aload_2         
	//   27   58:invokestatic    #124 <Method int parseMode(String)>
	//   28   61:invokestatic    #130 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
	//   29   64:areturn         
		else
			throw new FileNotFoundException(uri.getPath());
	//   30   65:new             #109 <Class FileNotFoundException>
	//   31   68:dup             
	//   32   69:aload_1         
	//   33   70:invokevirtual   #88  <Method String Uri.getPath()>
	//   34   73:invokespecial   #131 <Method void FileNotFoundException(String)>
	//   35   76:athrow          
	}

	public volatile Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		return super.query(uri, as, s, as1, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #137 <Method Cursor AbstractFileProvider.query(Uri, String[], String, String[], String)>
	//    7   11:areturn         
	}

	public volatile int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		return super.update(uri, contentvalues, s, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #142 <Method int AbstractFileProvider.update(Uri, ContentValues, String, String[])>
	//    6    9:ireturn         
	}

	public static final Uri CONTENT_URI = Uri.parse("content://com.pactforcure.app/");

	static 
	{
	//    0    0:ldc1            #10  <String "content://com.pactforcure.app/">
	//    1    2:invokestatic    #16  <Method Uri Uri.parse(String)>
	//    2    5:putstatic       #18  <Field Uri CONTENT_URI>
	//*   3    8:return          
	}
}
