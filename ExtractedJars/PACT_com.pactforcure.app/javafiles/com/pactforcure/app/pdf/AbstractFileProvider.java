// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.pdf;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.io.*;
import java.net.URLConnection;

// Referenced classes of package com.pactforcure.app.pdf:
//			LegacyCompatCursorWrapper

abstract class AbstractFileProvider extends ContentProvider
{

	AbstractFileProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void ContentProvider()>
	//    2    4:return          
	}

	static void copy(InputStream inputstream, File file)
		throws IOException
	{
		file = ((File) (new FileOutputStream(file)));
	//    0    0:new             #30  <Class FileOutputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #33  <Method void FileOutputStream(File)>
	//    4    8:astore_1        
		byte abyte0[] = new byte[1024];
	//    5    9:sipush          1024
	//    6   12:newarray        byte[]
	//    7   14:astore_3        
		do
		{
			int i = inputstream.read(abyte0);
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:invokevirtual   #39  <Method int InputStream.read(byte[])>
	//   11   20:istore_2        
			if(i >= 0)
	//*  12   21:iload_2         
	//*  13   22:iflt            35
			{
				((FileOutputStream) (file)).write(abyte0, 0, i);
	//   14   25:aload_1         
	//   15   26:aload_3         
	//   16   27:iconst_0        
	//   17   28:iload_2         
	//   18   29:invokevirtual   #43  <Method void FileOutputStream.write(byte[], int, int)>
			} else
	//*  19   32:goto            15
			{
				inputstream.close();
	//   20   35:aload_0         
	//   21   36:invokevirtual   #46  <Method void InputStream.close()>
				((FileOutputStream) (file)).close();
	//   22   39:aload_1         
	//   23   40:invokevirtual   #47  <Method void FileOutputStream.close()>
				return;
	//   24   43:return          
			}
		} while(true);
	}

	public int delete(Uri uri, String s, String as[])
	{
		throw new RuntimeException("Operation not supported");
	//    0    0:new             #52  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #10  <String "Operation not supported">
	//    3    6:invokespecial   #55  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	protected long getDataLength(Uri uri)
	{
		return -1L;
	//    0    0:ldc2w           #58  <Long -1L>
	//    1    3:lreturn         
	}

	protected String getFileName(Uri uri)
	{
		return uri.getLastPathSegment();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #67  <Method String Uri.getLastPathSegment()>
	//    2    4:areturn         
	}

	public String getType(Uri uri)
	{
		return URLConnection.guessContentTypeFromName(uri.toString());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #71  <Method String Uri.toString()>
	//    2    4:invokestatic    #77  <Method String URLConnection.guessContentTypeFromName(String)>
	//    3    7:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		throw new RuntimeException("Operation not supported");
	//    0    0:new             #52  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #10  <String "Operation not supported">
	//    3    6:invokespecial   #55  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		s = ((String) (as));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(as == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       10
			s = ((String) (OPENABLE_PROJECTION));
	//    4    6:getstatic       #20  <Field String[] OPENABLE_PROJECTION>
	//    5    9:astore_3        
		as = ((String []) (new MatrixCursor(((String []) (s)), 1)));
	//    6   10:new             #84  <Class MatrixCursor>
	//    7   13:dup             
	//    8   14:aload_3         
	//    9   15:iconst_1        
	//   10   16:invokespecial   #87  <Method void MatrixCursor(String[], int)>
	//   11   19:astore_2        
		as1 = ((String []) (((MatrixCursor) (as)).newRow()));
	//   12   20:aload_2         
	//   13   21:invokevirtual   #91  <Method android.database.MatrixCursor$RowBuilder MatrixCursor.newRow()>
	//   14   24:astore          4
		int j = s.length;
	//   15   26:aload_3         
	//   16   27:arraylength     
	//   17   28:istore          7
		int i = 0;
	//   18   30:iconst_0        
	//   19   31:istore          6
		while(i < j) 
	//*  20   33:iload           6
	//*  21   35:iload           7
	//*  22   37:icmpge          113
		{
			s1 = ((String) (s[i]));
	//   23   40:aload_3         
	//   24   41:iload           6
	//   25   43:aaload          
	//   26   44:astore          5
			if("_display_name".equals(((Object) (s1))))
	//*  27   46:ldc1            #16  <String "_display_name">
	//*  28   48:aload           5
	//*  29   50:invokevirtual   #95  <Method boolean String.equals(Object)>
	//*  30   53:ifeq            76
				((android.database.MatrixCursor.RowBuilder) (as1)).add(((Object) (getFileName(uri))));
	//   31   56:aload           4
	//   32   58:aload_0         
	//   33   59:aload_1         
	//   34   60:invokevirtual   #97  <Method String getFileName(Uri)>
	//   35   63:invokevirtual   #103 <Method android.database.MatrixCursor$RowBuilder android.database.MatrixCursor$RowBuilder.add(Object)>
	//   36   66:pop             
			else
	//*  37   67:iload           6
	//*  38   69:iconst_1        
	//*  39   70:iadd            
	//*  40   71:istore          6
	//*  41   73:goto            33
			if("_size".equals(((Object) (s1))))
	//*  42   76:ldc1            #18  <String "_size">
	//*  43   78:aload           5
	//*  44   80:invokevirtual   #95  <Method boolean String.equals(Object)>
	//*  45   83:ifeq            103
				((android.database.MatrixCursor.RowBuilder) (as1)).add(((Object) (Long.valueOf(getDataLength(uri)))));
	//   46   86:aload           4
	//   47   88:aload_0         
	//   48   89:aload_1         
	//   49   90:invokevirtual   #105 <Method long getDataLength(Uri)>
	//   50   93:invokestatic    #111 <Method Long Long.valueOf(long)>
	//   51   96:invokevirtual   #103 <Method android.database.MatrixCursor$RowBuilder android.database.MatrixCursor$RowBuilder.add(Object)>
	//   52   99:pop             
			else
	//*  53  100:goto            67
				((android.database.MatrixCursor.RowBuilder) (as1)).add(((Object) (null)));
	//   54  103:aload           4
	//   55  105:aconst_null     
	//   56  106:invokevirtual   #103 <Method android.database.MatrixCursor$RowBuilder android.database.MatrixCursor$RowBuilder.add(Object)>
	//   57  109:pop             
			i++;
		}
	//*  58  110:goto            67
		return ((Cursor) (new LegacyCompatCursorWrapper(((Cursor) (as)))));
	//   59  113:new             #113 <Class LegacyCompatCursorWrapper>
	//   60  116:dup             
	//   61  117:aload_2         
	//   62  118:invokespecial   #116 <Method void LegacyCompatCursorWrapper(Cursor)>
	//   63  121:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		throw new RuntimeException("Operation not supported");
	//    0    0:new             #52  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #10  <String "Operation not supported">
	//    3    6:invokespecial   #55  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	private static final String OPENABLE_PROJECTION[] = {
		"_display_name", "_size"
	};
	public static final String OPERATION_NOT_SUPPORTED = "Operation not supported";

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #16  <String "_display_name">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #18  <String "_size">
	//    9   13:aastore         
	//   10   14:putstatic       #20  <Field String[] OPENABLE_PROJECTION>
	//*  11   17:return          
	}
}
