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

	DocumentsContractApi19()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static boolean canRead(Context context, Uri uri)
	{
		while(context.checkCallingOrSelfUriPermission(uri, 1) != 0 || TextUtils.isEmpty(((CharSequence) (getRawType(context, uri))))) 
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iconst_1        
	//*   3    3:invokevirtual   #27  <Method int Context.checkCallingOrSelfUriPermission(Uri, int)>
	//*   4    6:ifeq            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokestatic    #31  <Method String getRawType(Context, Uri)>
	//   10   16:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   11   19:ifne            9
		return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public static boolean canWrite(Context context, Uri uri)
	{
		if(context.checkCallingOrSelfUriPermission(uri, 2) == 0)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iconst_2        
	//*   3    3:invokevirtual   #27  <Method int Context.checkCallingOrSelfUriPermission(Uri, int)>
	//*   4    6:ifeq            11
	//*   5    9:iconst_0        
	//*   6   10:ireturn         
		{
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
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  17   26:aload_3         
	//*  18   27:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   30:ifne            9
			{
				if((i & 4) != 0)
	//*  20   33:iload_2         
	//*  21   34:iconst_4        
	//*  22   35:iand            
	//*  23   36:ifeq            41
					return true;
	//   24   39:iconst_1        
	//   25   40:ireturn         
				if("vnd.android.document/directory".equals(((Object) (s))) && (i & 8) != 0)
	//*  26   41:ldc1            #46  <String "vnd.android.document/directory">
	//*  27   43:aload_3         
	//*  28   44:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  29   47:ifeq            59
	//*  30   50:iload_2         
	//*  31   51:bipush          8
	//*  32   53:iand            
	//*  33   54:ifeq            59
					return true;
	//   34   57:iconst_1        
	//   35   58:ireturn         
				if(!TextUtils.isEmpty(((CharSequence) (s))) && (i & 2) != 0)
	//*  36   59:aload_3         
	//*  37   60:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  38   63:ifne            9
	//*  39   66:iload_2         
	//*  40   67:iconst_2        
	//*  41   68:iand            
	//*  42   69:ifeq            9
					return true;
	//   43   72:iconst_1        
	//   44   73:ireturn         
			}
		}
		return false;
	}

	private static void closeQuietly(AutoCloseable autocloseable)
	{
		if(autocloseable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		autocloseable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #63  <Method void AutoCloseable.close()>
		return;
	//    4   10:return          
		autocloseable;
	//    5   11:astore_0        
		throw autocloseable;
	//    6   12:aload_0         
	//    7   13:athrow          
		autocloseable;
	//    8   14:astore_0        
	//    9   15:return          
	}

	public static boolean delete(Context context, Uri uri)
	{
		boolean flag;
		try
		{
			flag = DocumentsContract.deleteDocument(context.getContentResolver(), uri);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ContentResolver Context.getContentResolver()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #74  <Method boolean DocumentsContract.deleteDocument(ContentResolver, Uri)>
	//    4    8:istore_2        
		}
	//*   5    9:iload_2         
	//*   6   10:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   7   11:astore_0        
		{
			return false;
	//    8   12:iconst_0        
	//    9   13:ireturn         
		}
		return flag;
	}

	public static boolean exists(Context context, Uri uri)
	{
		Object obj;
		ContentResolver contentresolver;
		contentresolver = context.getContentResolver();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore          5
		obj = null;
	//    3    6:aconst_null     
	//    4    7:astore          4
		context = null;
	//    5    9:aconst_null     
	//    6   10:astore_0        
		uri = ((Uri) (contentresolver.query(uri, new String[] {
			"document_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    7   11:aload           5
	//    8   13:aload_1         
	//    9   14:iconst_1        
	//   10   15:anewarray       String[]
	//   11   18:dup             
	//   12   19:iconst_0        
	//   13   20:ldc1            #77  <String "document_id">
	//   14   22:aastore         
	//   15   23:aconst_null     
	//   16   24:aconst_null     
	//   17   25:aconst_null     
	//   18   26:invokevirtual   #83  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   19   29:astore_1        
		context = ((Context) (uri));
	//   20   30:aload_1         
	//   21   31:astore_0        
		obj = ((Object) (uri));
	//   22   32:aload_1         
	//   23   33:astore          4
		int i = ((Cursor) (uri)).getCount();
	//   24   35:aload_1         
	//   25   36:invokeinterface #89  <Method int Cursor.getCount()>
	//   26   41:istore_2        
		boolean flag;
		if(i > 0)
	//*  27   42:iload_2         
	//*  28   43:ifle            54
			flag = true;
	//   29   46:iconst_1        
	//   30   47:istore_3        
		else
	//*  31   48:aload_1         
	//*  32   49:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
	//*  33   52:iload_3         
	//*  34   53:ireturn         
			flag = false;
	//   35   54:iconst_0        
	//   36   55:istore_3        
		closeQuietly(((AutoCloseable) (uri)));
		return flag;
	//*  37   56:goto            48
		uri;
	//   38   59:astore_1        
		obj = ((Object) (context));
	//   39   60:aload_0         
	//   40   61:astore          4
		Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(((Object) (uri))).toString());
	//   41   63:ldc1            #14  <String "DocumentFile">
	//   42   65:new             #93  <Class StringBuilder>
	//   43   68:dup             
	//   44   69:invokespecial   #94  <Method void StringBuilder()>
	//   45   72:ldc1            #96  <String "Failed query: ">
	//   46   74:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   47   77:aload_1         
	//   48   78:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   49   81:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   50   84:invokestatic    #113 <Method int Log.w(String, String)>
	//   51   87:pop             
		closeQuietly(((AutoCloseable) (context)));
	//   52   88:aload_0         
	//   53   89:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return false;
	//   54   92:iconst_0        
	//   55   93:ireturn         
		context;
	//   56   94:astore_0        
		closeQuietly(((AutoCloseable) (obj)));
	//   57   95:aload           4
	//   58   97:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		throw context;
	//   59  100:aload_0         
	//   60  101:athrow          
	}

	public static long getFlags(Context context, Uri uri)
	{
		return queryForLong(context, uri, "flags", 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #40  <String "flags">
	//    3    4:lconst_0        
	//    4    5:invokestatic    #119 <Method long queryForLong(Context, Uri, String, long)>
	//    5    8:lreturn         
	}

	public static String getName(Context context, Uri uri)
	{
		return queryForString(context, uri, "_display_name", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #122 <String "_display_name">
	//    3    4:aconst_null     
	//    4    5:invokestatic    #126 <Method String queryForString(Context, Uri, String, String)>
	//    5    8:areturn         
	}

	private static String getRawType(Context context, Uri uri)
	{
		return queryForString(context, uri, "mime_type", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #128 <String "mime_type">
	//    3    4:aconst_null     
	//    4    5:invokestatic    #126 <Method String queryForString(Context, Uri, String, String)>
	//    5    8:areturn         
	}

	public static String getType(Context context, Uri uri)
	{
		uri = ((Uri) (getRawType(context, uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #31  <Method String getRawType(Context, Uri)>
	//    3    5:astore_1        
		context = ((Context) (uri));
	//    4    6:aload_1         
	//    5    7:astore_0        
		if("vnd.android.document/directory".equals(((Object) (uri))))
	//*   6    8:ldc1            #46  <String "vnd.android.document/directory">
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*   9   14:ifeq            19
			context = null;
	//   10   17:aconst_null     
	//   11   18:astore_0        
		return ((String) (context));
	//   12   19:aload_0         
	//   13   20:areturn         
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

	public static boolean isDocumentUri(Context context, Uri uri)
	{
		return DocumentsContract.isDocumentUri(context, uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #133 <Method boolean DocumentsContract.isDocumentUri(Context, Uri)>
	//    3    5:ireturn         
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
	//    7   12:ifne            22
	//    8   15:aload_0         
	//    9   16:invokestatic    #37  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   10   19:ifeq            24
	//   11   22:iconst_0        
	//   12   23:ireturn         
	//   13   24:iconst_1        
	//   14   25:ireturn         
	}

	public static boolean isVirtual(Context context, Uri uri)
	{
		while(!isDocumentUri(context, uri) || (getFlags(context, uri) & 512L) == 0L) 
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokestatic    #136 <Method boolean isDocumentUri(Context, Uri)>
	//*   3    5:ifne            10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #138 <Method long getFlags(Context, Uri)>
	//    9   15:ldc2w           #139 <Long 512L>
	//   10   18:land            
	//   11   19:lconst_0        
	//   12   20:lcmp            
	//   13   21:ifeq            8
		return true;
	//   14   24:iconst_1        
	//   15   25:ireturn         
	}

	public static long lastModified(Context context, Uri uri)
	{
		return queryForLong(context, uri, "last_modified", 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #143 <String "last_modified">
	//    3    4:lconst_0        
	//    4    5:invokestatic    #119 <Method long queryForLong(Context, Uri, String, long)>
	//    5    8:lreturn         
	}

	public static long length(Context context, Uri uri)
	{
		return queryForLong(context, uri, "_size", 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #146 <String "_size">
	//    3    4:lconst_0        
	//    4    5:invokestatic    #119 <Method long queryForLong(Context, Uri, String, long)>
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
	//    5    5:invokestatic    #119 <Method long queryForLong(Context, Uri, String, long)>
	//    6    8:l2i             
	//    7    9:ireturn         
	}

	private static long queryForLong(Context context, Uri uri, String s, long l)
	{
		Object obj;
		ContentResolver contentresolver;
		contentresolver = context.getContentResolver();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore          8
		obj = null;
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
	//   18   25:invokevirtual   #83  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   19   28:astore_1        
		context = ((Context) (uri));
	//   20   29:aload_1         
	//   21   30:astore_0        
		obj = ((Object) (uri));
	//   22   31:aload_1         
	//   23   32:astore          7
		if(!((Cursor) (uri)).moveToFirst())
			break MISSING_BLOCK_LABEL_79;
	//   24   34:aload_1         
	//   25   35:invokeinterface #150 <Method boolean Cursor.moveToFirst()>
	//   26   40:ifeq            79
		context = ((Context) (uri));
	//   27   43:aload_1         
	//   28   44:astore_0        
		obj = ((Object) (uri));
	//   29   45:aload_1         
	//   30   46:astore          7
		if(((Cursor) (uri)).isNull(0))
			break MISSING_BLOCK_LABEL_79;
	//   31   48:aload_1         
	//   32   49:iconst_0        
	//   33   50:invokeinterface #154 <Method boolean Cursor.isNull(int)>
	//   34   55:ifne            79
		context = ((Context) (uri));
	//   35   58:aload_1         
	//   36   59:astore_0        
		obj = ((Object) (uri));
	//   37   60:aload_1         
	//   38   61:astore          7
		long l1 = ((Cursor) (uri)).getLong(0);
	//   39   63:aload_1         
	//   40   64:iconst_0        
	//   41   65:invokeinterface #158 <Method long Cursor.getLong(int)>
	//   42   70:lstore          5
		closeQuietly(((AutoCloseable) (uri)));
	//   43   72:aload_1         
	//   44   73:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return l1;
	//   45   76:lload           5
	//   46   78:lreturn         
		closeQuietly(((AutoCloseable) (uri)));
	//   47   79:aload_1         
	//   48   80:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return l;
	//   49   83:lload_3         
	//   50   84:lreturn         
		uri;
	//   51   85:astore_1        
		obj = ((Object) (context));
	//   52   86:aload_0         
	//   53   87:astore          7
		Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(((Object) (uri))).toString());
	//   54   89:ldc1            #14  <String "DocumentFile">
	//   55   91:new             #93  <Class StringBuilder>
	//   56   94:dup             
	//   57   95:invokespecial   #94  <Method void StringBuilder()>
	//   58   98:ldc1            #96  <String "Failed query: ">
	//   59  100:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   60  103:aload_1         
	//   61  104:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   62  107:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   63  110:invokestatic    #113 <Method int Log.w(String, String)>
	//   64  113:pop             
		closeQuietly(((AutoCloseable) (context)));
	//   65  114:aload_0         
	//   66  115:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return l;
	//   67  118:lload_3         
	//   68  119:lreturn         
		context;
	//   69  120:astore_0        
		closeQuietly(((AutoCloseable) (obj)));
	//   70  121:aload           7
	//   71  123:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		throw context;
	//   72  126:aload_0         
	//   73  127:athrow          
	}

	private static String queryForString(Context context, Uri uri, String s, String s1)
	{
		Object obj;
		ContentResolver contentresolver;
		contentresolver = context.getContentResolver();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore          5
		obj = null;
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
	//   18   25:invokevirtual   #83  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   19   28:astore_1        
		context = ((Context) (uri));
	//   20   29:aload_1         
	//   21   30:astore_0        
		obj = ((Object) (uri));
	//   22   31:aload_1         
	//   23   32:astore          4
		if(!((Cursor) (uri)).moveToFirst())
			break MISSING_BLOCK_LABEL_77;
	//   24   34:aload_1         
	//   25   35:invokeinterface #150 <Method boolean Cursor.moveToFirst()>
	//   26   40:ifeq            77
		context = ((Context) (uri));
	//   27   43:aload_1         
	//   28   44:astore_0        
		obj = ((Object) (uri));
	//   29   45:aload_1         
	//   30   46:astore          4
		if(((Cursor) (uri)).isNull(0))
			break MISSING_BLOCK_LABEL_77;
	//   31   48:aload_1         
	//   32   49:iconst_0        
	//   33   50:invokeinterface #154 <Method boolean Cursor.isNull(int)>
	//   34   55:ifne            77
		context = ((Context) (uri));
	//   35   58:aload_1         
	//   36   59:astore_0        
		obj = ((Object) (uri));
	//   37   60:aload_1         
	//   38   61:astore          4
		s = ((Cursor) (uri)).getString(0);
	//   39   63:aload_1         
	//   40   64:iconst_0        
	//   41   65:invokeinterface #162 <Method String Cursor.getString(int)>
	//   42   70:astore_2        
		closeQuietly(((AutoCloseable) (uri)));
	//   43   71:aload_1         
	//   44   72:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return s;
	//   45   75:aload_2         
	//   46   76:areturn         
		closeQuietly(((AutoCloseable) (uri)));
	//   47   77:aload_1         
	//   48   78:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return s1;
	//   49   81:aload_3         
	//   50   82:areturn         
		uri;
	//   51   83:astore_1        
		obj = ((Object) (context));
	//   52   84:aload_0         
	//   53   85:astore          4
		Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(((Object) (uri))).toString());
	//   54   87:ldc1            #14  <String "DocumentFile">
	//   55   89:new             #93  <Class StringBuilder>
	//   56   92:dup             
	//   57   93:invokespecial   #94  <Method void StringBuilder()>
	//   58   96:ldc1            #96  <String "Failed query: ">
	//   59   98:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   60  101:aload_1         
	//   61  102:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   62  105:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   63  108:invokestatic    #113 <Method int Log.w(String, String)>
	//   64  111:pop             
		closeQuietly(((AutoCloseable) (context)));
	//   65  112:aload_0         
	//   66  113:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return s1;
	//   67  116:aload_3         
	//   68  117:areturn         
		context;
	//   69  118:astore_0        
		closeQuietly(((AutoCloseable) (obj)));
	//   70  119:aload           4
	//   71  121:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		throw context;
	//   72  124:aload_0         
	//   73  125:athrow          
	}

	private static final int FLAG_VIRTUAL_DOCUMENT = 512;
	private static final String TAG = "DocumentFile";
}
