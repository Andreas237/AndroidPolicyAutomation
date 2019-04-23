// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;

class DocumentsContractApi19
{

	private DocumentsContractApi19()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static boolean canRead(Context context, Uri uri)
	{
		if(context.checkCallingOrSelfUriPermission(uri, 1) != 0)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iconst_1        
	//*   3    3:invokevirtual   #27  <Method int Context.checkCallingOrSelfUriPermission(Uri, int)>
	//*   4    6:ifeq            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		return !TextUtils.isEmpty(((CharSequence) (getRawType(context, uri))));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokestatic    #31  <Method String getRawType(Context, Uri)>
	//   10   16:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   11   19:ifeq            24
	//   12   22:iconst_0        
	//   13   23:ireturn         
	//   14   24:iconst_1        
	//   15   25:ireturn         
	}

	public static boolean canWrite(Context context, Uri uri)
	{
		if(context.checkCallingOrSelfUriPermission(uri, 2) != 0)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iconst_2        
	//*   3    3:invokevirtual   #27  <Method int Context.checkCallingOrSelfUriPermission(Uri, int)>
	//*   4    6:ifeq            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		String s = getRawType(context, uri);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokestatic    #31  <Method String getRawType(Context, Uri)>
	//   10   16:astore_3        
		int i = queryForInt(context, uri, "flags", 0);
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:ldc1            #40  <String "flags">
	//   14   21:iconst_0        
	//   15   22:invokestatic    #44  <Method int queryForInt(Context, Uri, String, int)>
	//   16   25:istore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  17   26:aload_3         
	//*  18   27:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   30:ifeq            35
			return false;
	//   20   33:iconst_0        
	//   21   34:ireturn         
		if((i & 4) != 0)
	//*  22   35:iload_2         
	//*  23   36:iconst_4        
	//*  24   37:iand            
	//*  25   38:ifeq            43
			return true;
	//   26   41:iconst_1        
	//   27   42:ireturn         
		if("vnd.android.document/directory".equals(((Object) (s))) && (i & 8) != 0)
	//*  28   43:ldc1            #46  <String "vnd.android.document/directory">
	//*  29   45:aload_3         
	//*  30   46:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  31   49:ifeq            61
	//*  32   52:iload_2         
	//*  33   53:bipush          8
	//*  34   55:iand            
	//*  35   56:ifeq            61
			return true;
	//   36   59:iconst_1        
	//   37   60:ireturn         
		return !TextUtils.isEmpty(((CharSequence) (s))) && (i & 2) != 0;
	//   38   61:aload_3         
	//   39   62:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   40   65:ifne            76
	//   41   68:iload_2         
	//   42   69:iconst_2        
	//   43   70:iand            
	//   44   71:ifeq            76
	//   45   74:iconst_1        
	//   46   75:ireturn         
	//   47   76:iconst_0        
	//   48   77:ireturn         
	}

	private static void closeQuietly(AutoCloseable autocloseable)
	{
		if(autocloseable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
			try
			{
				autocloseable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #64  <Method void AutoCloseable.close()>
				return;
	//    4   10:return          
			}
			// Misplaced declaration of an exception variable
			catch(AutoCloseable autocloseable)
	//*   5   11:astore_0        
			{
				throw autocloseable;
	//    6   12:aload_0         
	//    7   13:athrow          
			}
	//*   8   14:return          
			// Misplaced declaration of an exception variable
			catch(AutoCloseable autocloseable)
	//*   9   15:astore_0        
			{
				return;
	//   10   16:return          
			}
		else
			return;
	}

	public static boolean exists(Context context, Uri uri)
	{
		boolean flag;
		Uri uri1;
		Object obj;
		obj = ((Object) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore          5
		flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		uri1 = null;
	//    5    8:aconst_null     
	//    6    9:astore          4
		context = null;
	//    7   11:aconst_null     
	//    8   12:astore_0        
		uri = ((Uri) (((ContentResolver) (obj)).query(uri, new String[] {
			"document_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    9   13:aload           5
	//   10   15:aload_1         
	//   11   16:iconst_1        
	//   12   17:anewarray       String[]
	//   13   20:dup             
	//   14   21:iconst_0        
	//   15   22:ldc1            #72  <String "document_id">
	//   16   24:aastore         
	//   17   25:aconst_null     
	//   18   26:aconst_null     
	//   19   27:aconst_null     
	//   20   28:invokevirtual   #78  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   21   31:astore_1        
		context = ((Context) (uri));
	//   22   32:aload_1         
	//   23   33:astore_0        
		uri1 = uri;
	//   24   34:aload_1         
	//   25   35:astore          4
		int i = ((Cursor) (uri)).getCount();
	//   26   37:aload_1         
	//   27   38:invokeinterface #84  <Method int Cursor.getCount()>
	//   28   43:istore_2        
		if(i > 0)
	//*  29   44:iload_2         
	//*  30   45:ifle            50
			flag = true;
	//   31   48:iconst_1        
	//   32   49:istore_3        
		closeQuietly(((AutoCloseable) (uri)));
	//   33   50:aload_1         
	//   34   51:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		return flag;
	//   35   54:iload_3         
	//   36   55:ireturn         
		uri;
	//   37   56:astore_1        
		break MISSING_BLOCK_LABEL_115;
	//   38   57:goto            115
		uri;
	//   39   60:astore_1        
		context = ((Context) (uri1));
	//   40   61:aload           4
	//   41   63:astore_0        
		obj = ((Object) (new StringBuilder()));
	//   42   64:new             #88  <Class StringBuilder>
	//   43   67:dup             
	//   44   68:invokespecial   #89  <Method void StringBuilder()>
	//   45   71:astore          5
		context = ((Context) (uri1));
	//   46   73:aload           4
	//   47   75:astore_0        
		((StringBuilder) (obj)).append("Failed query: ");
	//   48   76:aload           5
	//   49   78:ldc1            #91  <String "Failed query: ">
	//   50   80:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   51   83:pop             
		context = ((Context) (uri1));
	//   52   84:aload           4
	//   53   86:astore_0        
		((StringBuilder) (obj)).append(((Object) (uri)));
	//   54   87:aload           5
	//   55   89:aload_1         
	//   56   90:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   57   93:pop             
		context = ((Context) (uri1));
	//   58   94:aload           4
	//   59   96:astore_0        
		Log.w("DocumentFile", ((StringBuilder) (obj)).toString());
	//   60   97:ldc1            #14  <String "DocumentFile">
	//   61   99:aload           5
	//   62  101:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   63  104:invokestatic    #108 <Method int Log.w(String, String)>
	//   64  107:pop             
		closeQuietly(((AutoCloseable) (uri1)));
	//   65  108:aload           4
	//   66  110:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		return false;
	//   67  113:iconst_0        
	//   68  114:ireturn         
		closeQuietly(((AutoCloseable) (context)));
	//   69  115:aload_0         
	//   70  116:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		throw uri;
	//   71  119:aload_1         
	//   72  120:athrow          
	}

	public static long getFlags(Context context, Uri uri)
	{
		return queryForLong(context, uri, "flags", 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #40  <String "flags">
	//    3    4:lconst_0        
	//    4    5:invokestatic    #114 <Method long queryForLong(Context, Uri, String, long)>
	//    5    8:lreturn         
	}

	public static String getName(Context context, Uri uri)
	{
		return queryForString(context, uri, "_display_name", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #117 <String "_display_name">
	//    3    4:aconst_null     
	//    4    5:invokestatic    #121 <Method String queryForString(Context, Uri, String, String)>
	//    5    8:areturn         
	}

	private static String getRawType(Context context, Uri uri)
	{
		return queryForString(context, uri, "mime_type", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #124 <String "mime_type">
	//    3    4:aconst_null     
	//    4    5:invokestatic    #121 <Method String queryForString(Context, Uri, String, String)>
	//    5    8:areturn         
	}

	public static String getType(Context context, Uri uri)
	{
		context = ((Context) (getRawType(context, uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #31  <Method String getRawType(Context, Uri)>
	//    3    5:astore_0        
		if("vnd.android.document/directory".equals(((Object) (context))))
	//*   4    6:ldc1            #46  <String "vnd.android.document/directory">
	//*   5    8:aload_0         
	//*   6    9:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*   7   12:ifeq            17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return ((String) (context));
	//   10   17:aload_0         
	//   11   18:areturn         
	}

	public static boolean isDirectory(Context context, Uri uri)
	{
		return "vnd.android.document/directory".equals(((Object) (getRawType(context, uri))));
	//    0    0:ldc1            #46  <String "vnd.android.document/directory">
	//    1    2:aload_0         
	//    2    3:aload_1         
	//    3    4:invokestatic    #31  <Method String getRawType(Context, Uri)>
	//    4    7:invokevirtual   #52  <Method boolean String.equals(Object)>
	//    5   10:ireturn         
	}

	public static boolean isFile(Context context, Uri uri)
	{
		context = ((Context) (getRawType(context, uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #31  <Method String getRawType(Context, Uri)>
	//    3    5:astore_0        
		return !"vnd.android.document/directory".equals(((Object) (context))) && !TextUtils.isEmpty(((CharSequence) (context)));
	//    4    6:ldc1            #46  <String "vnd.android.document/directory">
	//    5    8:aload_0         
	//    6    9:invokevirtual   #52  <Method boolean String.equals(Object)>
	//    7   12:ifne            27
	//    8   15:aload_0         
	//    9   16:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   10   19:ifeq            25
	//   11   22:goto            27
	//   12   25:iconst_1        
	//   13   26:ireturn         
	//   14   27:iconst_0        
	//   15   28:ireturn         
	}

	public static boolean isVirtual(Context context, Uri uri)
	{
		boolean flag1 = DocumentsContract.isDocumentUri(context, uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #133 <Method boolean DocumentsContract.isDocumentUri(Context, Uri)>
	//    3    5:istore_3        
		boolean flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		if(!flag1)
	//*   6    8:iload_3         
	//*   7    9:ifne            14
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		if((getFlags(context, uri) & 512L) != 0L)
	//*  10   14:aload_0         
	//*  11   15:aload_1         
	//*  12   16:invokestatic    #135 <Method long getFlags(Context, Uri)>
	//*  13   19:ldc2w           #136 <Long 512L>
	//*  14   22:land            
	//*  15   23:lconst_0        
	//*  16   24:lcmp            
	//*  17   25:ifeq            30
			flag = true;
	//   18   28:iconst_1        
	//   19   29:istore_2        
		return flag;
	//   20   30:iload_2         
	//   21   31:ireturn         
	}

	public static long lastModified(Context context, Uri uri)
	{
		return queryForLong(context, uri, "last_modified", 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #140 <String "last_modified">
	//    3    4:lconst_0        
	//    4    5:invokestatic    #114 <Method long queryForLong(Context, Uri, String, long)>
	//    5    8:lreturn         
	}

	public static long length(Context context, Uri uri)
	{
		return queryForLong(context, uri, "_size", 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #143 <String "_size">
	//    3    4:lconst_0        
	//    4    5:invokestatic    #114 <Method long queryForLong(Context, Uri, String, long)>
	//    5    8:lreturn         
	}

	private static int queryForInt(Context context, Uri uri, String s, int i)
	{
		return (int)queryForLong(context, uri, s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:i2l             
	//    5    5:invokestatic    #114 <Method long queryForLong(Context, Uri, String, long)>
	//    6    8:l2i             
	//    7    9:ireturn         
	}

	private static long queryForLong(Context context, Uri uri, String s, long l)
	{
		Uri uri1;
		ContentResolver contentresolver;
		contentresolver = context.getContentResolver();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore          8
		uri1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          7
		context = null;
	//    5    9:aconst_null     
	//    6   10:astore_0        
		uri = ((Uri) (contentresolver.query(uri, new String[] {
			s
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    7   11:aload           8
	//    8   13:aload_1         
	//    9   14:iconst_1        
	//   10   15:anewarray       String[]
	//   11   18:dup             
	//   12   19:iconst_0        
	//   13   20:aload_2         
	//   14   21:aastore         
	//   15   22:aconst_null     
	//   16   23:aconst_null     
	//   17   24:aconst_null     
	//   18   25:invokevirtual   #78  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   19   28:astore_1        
		context = ((Context) (uri));
	//   20   29:aload_1         
	//   21   30:astore_0        
		uri1 = uri;
	//   22   31:aload_1         
	//   23   32:astore          7
		if(!((Cursor) (uri)).moveToFirst())
			break MISSING_BLOCK_LABEL_79;
	//   24   34:aload_1         
	//   25   35:invokeinterface #147 <Method boolean Cursor.moveToFirst()>
	//   26   40:ifeq            79
		context = ((Context) (uri));
	//   27   43:aload_1         
	//   28   44:astore_0        
		uri1 = uri;
	//   29   45:aload_1         
	//   30   46:astore          7
		if(((Cursor) (uri)).isNull(0))
			break MISSING_BLOCK_LABEL_79;
	//   31   48:aload_1         
	//   32   49:iconst_0        
	//   33   50:invokeinterface #151 <Method boolean Cursor.isNull(int)>
	//   34   55:ifne            79
		context = ((Context) (uri));
	//   35   58:aload_1         
	//   36   59:astore_0        
		uri1 = uri;
	//   37   60:aload_1         
	//   38   61:astore          7
		long l1 = ((Cursor) (uri)).getLong(0);
	//   39   63:aload_1         
	//   40   64:iconst_0        
	//   41   65:invokeinterface #155 <Method long Cursor.getLong(int)>
	//   42   70:lstore          5
		closeQuietly(((AutoCloseable) (uri)));
	//   43   72:aload_1         
	//   44   73:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		return l1;
	//   45   76:lload           5
	//   46   78:lreturn         
		closeQuietly(((AutoCloseable) (uri)));
	//   47   79:aload_1         
	//   48   80:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		return l;
	//   49   83:lload_3         
	//   50   84:lreturn         
		uri;
	//   51   85:astore_1        
		break MISSING_BLOCK_LABEL_140;
	//   52   86:goto            140
		uri;
	//   53   89:astore_1        
		context = ((Context) (uri1));
	//   54   90:aload           7
	//   55   92:astore_0        
		s = ((String) (new StringBuilder()));
	//   56   93:new             #88  <Class StringBuilder>
	//   57   96:dup             
	//   58   97:invokespecial   #89  <Method void StringBuilder()>
	//   59  100:astore_2        
		context = ((Context) (uri1));
	//   60  101:aload           7
	//   61  103:astore_0        
		((StringBuilder) (s)).append("Failed query: ");
	//   62  104:aload_2         
	//   63  105:ldc1            #91  <String "Failed query: ">
	//   64  107:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   65  110:pop             
		context = ((Context) (uri1));
	//   66  111:aload           7
	//   67  113:astore_0        
		((StringBuilder) (s)).append(((Object) (uri)));
	//   68  114:aload_2         
	//   69  115:aload_1         
	//   70  116:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   71  119:pop             
		context = ((Context) (uri1));
	//   72  120:aload           7
	//   73  122:astore_0        
		Log.w("DocumentFile", ((StringBuilder) (s)).toString());
	//   74  123:ldc1            #14  <String "DocumentFile">
	//   75  125:aload_2         
	//   76  126:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   77  129:invokestatic    #108 <Method int Log.w(String, String)>
	//   78  132:pop             
		closeQuietly(((AutoCloseable) (uri1)));
	//   79  133:aload           7
	//   80  135:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		return l;
	//   81  138:lload_3         
	//   82  139:lreturn         
		closeQuietly(((AutoCloseable) (context)));
	//   83  140:aload_0         
	//   84  141:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		throw uri;
	//   85  144:aload_1         
	//   86  145:athrow          
	}

	private static String queryForString(Context context, Uri uri, String s, String s1)
	{
		Uri uri1;
		ContentResolver contentresolver;
		contentresolver = context.getContentResolver();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #70  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore          5
		uri1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          4
		context = null;
	//    5    9:aconst_null     
	//    6   10:astore_0        
		uri = ((Uri) (contentresolver.query(uri, new String[] {
			s
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    7   11:aload           5
	//    8   13:aload_1         
	//    9   14:iconst_1        
	//   10   15:anewarray       String[]
	//   11   18:dup             
	//   12   19:iconst_0        
	//   13   20:aload_2         
	//   14   21:aastore         
	//   15   22:aconst_null     
	//   16   23:aconst_null     
	//   17   24:aconst_null     
	//   18   25:invokevirtual   #78  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   19   28:astore_1        
		context = ((Context) (uri));
	//   20   29:aload_1         
	//   21   30:astore_0        
		uri1 = uri;
	//   22   31:aload_1         
	//   23   32:astore          4
		if(!((Cursor) (uri)).moveToFirst())
			break MISSING_BLOCK_LABEL_77;
	//   24   34:aload_1         
	//   25   35:invokeinterface #147 <Method boolean Cursor.moveToFirst()>
	//   26   40:ifeq            77
		context = ((Context) (uri));
	//   27   43:aload_1         
	//   28   44:astore_0        
		uri1 = uri;
	//   29   45:aload_1         
	//   30   46:astore          4
		if(((Cursor) (uri)).isNull(0))
			break MISSING_BLOCK_LABEL_77;
	//   31   48:aload_1         
	//   32   49:iconst_0        
	//   33   50:invokeinterface #151 <Method boolean Cursor.isNull(int)>
	//   34   55:ifne            77
		context = ((Context) (uri));
	//   35   58:aload_1         
	//   36   59:astore_0        
		uri1 = uri;
	//   37   60:aload_1         
	//   38   61:astore          4
		s = ((Cursor) (uri)).getString(0);
	//   39   63:aload_1         
	//   40   64:iconst_0        
	//   41   65:invokeinterface #159 <Method String Cursor.getString(int)>
	//   42   70:astore_2        
		closeQuietly(((AutoCloseable) (uri)));
	//   43   71:aload_1         
	//   44   72:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		return s;
	//   45   75:aload_2         
	//   46   76:areturn         
		closeQuietly(((AutoCloseable) (uri)));
	//   47   77:aload_1         
	//   48   78:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		return s1;
	//   49   81:aload_3         
	//   50   82:areturn         
		uri;
	//   51   83:astore_1        
		break MISSING_BLOCK_LABEL_138;
	//   52   84:goto            138
		uri;
	//   53   87:astore_1        
		context = ((Context) (uri1));
	//   54   88:aload           4
	//   55   90:astore_0        
		s = ((String) (new StringBuilder()));
	//   56   91:new             #88  <Class StringBuilder>
	//   57   94:dup             
	//   58   95:invokespecial   #89  <Method void StringBuilder()>
	//   59   98:astore_2        
		context = ((Context) (uri1));
	//   60   99:aload           4
	//   61  101:astore_0        
		((StringBuilder) (s)).append("Failed query: ");
	//   62  102:aload_2         
	//   63  103:ldc1            #91  <String "Failed query: ">
	//   64  105:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   65  108:pop             
		context = ((Context) (uri1));
	//   66  109:aload           4
	//   67  111:astore_0        
		((StringBuilder) (s)).append(((Object) (uri)));
	//   68  112:aload_2         
	//   69  113:aload_1         
	//   70  114:invokevirtual   #98  <Method StringBuilder StringBuilder.append(Object)>
	//   71  117:pop             
		context = ((Context) (uri1));
	//   72  118:aload           4
	//   73  120:astore_0        
		Log.w("DocumentFile", ((StringBuilder) (s)).toString());
	//   74  121:ldc1            #14  <String "DocumentFile">
	//   75  123:aload_2         
	//   76  124:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   77  127:invokestatic    #108 <Method int Log.w(String, String)>
	//   78  130:pop             
		closeQuietly(((AutoCloseable) (uri1)));
	//   79  131:aload           4
	//   80  133:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		return s1;
	//   81  136:aload_3         
	//   82  137:areturn         
		closeQuietly(((AutoCloseable) (context)));
	//   83  138:aload_0         
	//   84  139:invokestatic    #86  <Method void closeQuietly(AutoCloseable)>
		throw uri;
	//   85  142:aload_1         
	//   86  143:athrow          
	}

	private static final int FLAG_VIRTUAL_DOCUMENT = 512;
	private static final String TAG = "DocumentFile";
}
