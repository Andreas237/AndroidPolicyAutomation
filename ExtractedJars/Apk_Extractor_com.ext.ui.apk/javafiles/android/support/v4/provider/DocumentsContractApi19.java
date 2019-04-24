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
		context = ((Context) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		uri = ((Uri) (((ContentResolver) (context)).query(uri, new String[] {
			"document_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:anewarray       String[]
	//    7   11:dup             
	//    8   12:iconst_0        
	//    9   13:ldc1            #77  <String "document_id">
	//   10   15:aastore         
	//   11   16:aconst_null     
	//   12   17:aconst_null     
	//   13   18:aconst_null     
	//   14   19:invokevirtual   #83  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   15   22:astore_1        
		context = ((Context) (uri));
	//   16   23:aload_1         
	//   17   24:astore_0        
		int i = ((Cursor) (uri)).getCount();
	//   18   25:aload_1         
	//   19   26:invokeinterface #89  <Method int Cursor.getCount()>
	//   20   31:istore_2        
		boolean flag;
		if(i > 0)
	//*  21   32:iload_2         
	//*  22   33:ifle            44
			flag = true;
	//   23   36:iconst_1        
	//   24   37:istore_3        
		else
	//*  25   38:aload_1         
	//*  26   39:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
	//*  27   42:iload_3         
	//*  28   43:ireturn         
			flag = false;
	//   29   44:iconst_0        
	//   30   45:istore_3        
		closeQuietly(((AutoCloseable) (uri)));
		return flag;
	//*  31   46:goto            38
		Exception exception;
		exception;
	//   32   49:astore          4
		uri = null;
	//   33   51:aconst_null     
	//   34   52:astore_1        
_L4:
		context = ((Context) (uri));
	//   35   53:aload_1         
	//   36   54:astore_0        
		Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(((Object) (exception))).toString());
	//   37   55:ldc1            #14  <String "DocumentFile">
	//   38   57:new             #93  <Class StringBuilder>
	//   39   60:dup             
	//   40   61:invokespecial   #94  <Method void StringBuilder()>
	//   41   64:ldc1            #96  <String "Failed query: ">
	//   42   66:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   43   69:aload           4
	//   44   71:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   45   74:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   46   77:invokestatic    #113 <Method int Log.w(String, String)>
	//   47   80:pop             
		closeQuietly(((AutoCloseable) (uri)));
	//   48   81:aload_1         
	//   49   82:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return false;
	//   50   85:iconst_0        
	//   51   86:ireturn         
		uri;
	//   52   87:astore_1        
		context = null;
	//   53   88:aconst_null     
	//   54   89:astore_0        
_L2:
		closeQuietly(((AutoCloseable) (context)));
	//   55   90:aload_0         
	//   56   91:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		throw uri;
	//   57   94:aload_1         
	//   58   95:athrow          
		uri;
	//   59   96:astore_1        
		if(true) goto _L2; else goto _L1
	//   60   97:goto            90
_L1:
		exception;
	//   61  100:astore          4
		if(true) goto _L4; else goto _L3
	//   62  102:goto            53
_L3:
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
		context = ((Context) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		uri = ((Uri) (((ContentResolver) (context)).query(uri, new String[] {
			s
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:anewarray       String[]
	//    7   11:dup             
	//    8   12:iconst_0        
	//    9   13:aload_2         
	//   10   14:aastore         
	//   11   15:aconst_null     
	//   12   16:aconst_null     
	//   13   17:aconst_null     
	//   14   18:invokevirtual   #83  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   15   21:astore_1        
		context = ((Context) (uri));
	//   16   22:aload_1         
	//   17   23:astore_0        
		if(!((Cursor) (uri)).moveToFirst())
			break MISSING_BLOCK_LABEL_63;
	//   18   24:aload_1         
	//   19   25:invokeinterface #150 <Method boolean Cursor.moveToFirst()>
	//   20   30:ifeq            63
		context = ((Context) (uri));
	//   21   33:aload_1         
	//   22   34:astore_0        
		if(((Cursor) (uri)).isNull(0))
			break MISSING_BLOCK_LABEL_63;
	//   23   35:aload_1         
	//   24   36:iconst_0        
	//   25   37:invokeinterface #154 <Method boolean Cursor.isNull(int)>
	//   26   42:ifne            63
		context = ((Context) (uri));
	//   27   45:aload_1         
	//   28   46:astore_0        
		long l1 = ((Cursor) (uri)).getLong(0);
	//   29   47:aload_1         
	//   30   48:iconst_0        
	//   31   49:invokeinterface #158 <Method long Cursor.getLong(int)>
	//   32   54:lstore          5
		closeQuietly(((AutoCloseable) (uri)));
	//   33   56:aload_1         
	//   34   57:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return l1;
	//   35   60:lload           5
	//   36   62:lreturn         
		closeQuietly(((AutoCloseable) (uri)));
	//   37   63:aload_1         
	//   38   64:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return l;
	//   39   67:lload_3         
	//   40   68:lreturn         
		s;
	//   41   69:astore_2        
		uri = null;
	//   42   70:aconst_null     
	//   43   71:astore_1        
_L4:
		context = ((Context) (uri));
	//   44   72:aload_1         
	//   45   73:astore_0        
		Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(((Object) (s))).toString());
	//   46   74:ldc1            #14  <String "DocumentFile">
	//   47   76:new             #93  <Class StringBuilder>
	//   48   79:dup             
	//   49   80:invokespecial   #94  <Method void StringBuilder()>
	//   50   83:ldc1            #96  <String "Failed query: ">
	//   51   85:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   52   88:aload_2         
	//   53   89:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   54   92:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   55   95:invokestatic    #113 <Method int Log.w(String, String)>
	//   56   98:pop             
		closeQuietly(((AutoCloseable) (uri)));
	//   57   99:aload_1         
	//   58  100:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return l;
	//   59  103:lload_3         
	//   60  104:lreturn         
		uri;
	//   61  105:astore_1        
		context = null;
	//   62  106:aconst_null     
	//   63  107:astore_0        
_L2:
		closeQuietly(((AutoCloseable) (context)));
	//   64  108:aload_0         
	//   65  109:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		throw uri;
	//   66  112:aload_1         
	//   67  113:athrow          
		uri;
	//   68  114:astore_1        
		if(true) goto _L2; else goto _L1
	//   69  115:goto            108
_L1:
		s;
	//   70  118:astore_2        
		if(true) goto _L4; else goto _L3
_L3:
	//*  71  119:goto            72
	}

	private static String queryForString(Context context, Uri uri, String s, String s1)
	{
		context = ((Context) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		uri = ((Uri) (((ContentResolver) (context)).query(uri, new String[] {
			s
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:anewarray       String[]
	//    7   11:dup             
	//    8   12:iconst_0        
	//    9   13:aload_2         
	//   10   14:aastore         
	//   11   15:aconst_null     
	//   12   16:aconst_null     
	//   13   17:aconst_null     
	//   14   18:invokevirtual   #83  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   15   21:astore_1        
		context = ((Context) (uri));
	//   16   22:aload_1         
	//   17   23:astore_0        
		if(!((Cursor) (uri)).moveToFirst())
			break MISSING_BLOCK_LABEL_61;
	//   18   24:aload_1         
	//   19   25:invokeinterface #150 <Method boolean Cursor.moveToFirst()>
	//   20   30:ifeq            61
		context = ((Context) (uri));
	//   21   33:aload_1         
	//   22   34:astore_0        
		if(((Cursor) (uri)).isNull(0))
			break MISSING_BLOCK_LABEL_61;
	//   23   35:aload_1         
	//   24   36:iconst_0        
	//   25   37:invokeinterface #154 <Method boolean Cursor.isNull(int)>
	//   26   42:ifne            61
		context = ((Context) (uri));
	//   27   45:aload_1         
	//   28   46:astore_0        
		s = ((Cursor) (uri)).getString(0);
	//   29   47:aload_1         
	//   30   48:iconst_0        
	//   31   49:invokeinterface #162 <Method String Cursor.getString(int)>
	//   32   54:astore_2        
		closeQuietly(((AutoCloseable) (uri)));
	//   33   55:aload_1         
	//   34   56:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return s;
	//   35   59:aload_2         
	//   36   60:areturn         
		closeQuietly(((AutoCloseable) (uri)));
	//   37   61:aload_1         
	//   38   62:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return s1;
	//   39   65:aload_3         
	//   40   66:areturn         
		s;
	//   41   67:astore_2        
		uri = null;
	//   42   68:aconst_null     
	//   43   69:astore_1        
_L4:
		context = ((Context) (uri));
	//   44   70:aload_1         
	//   45   71:astore_0        
		Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(((Object) (s))).toString());
	//   46   72:ldc1            #14  <String "DocumentFile">
	//   47   74:new             #93  <Class StringBuilder>
	//   48   77:dup             
	//   49   78:invokespecial   #94  <Method void StringBuilder()>
	//   50   81:ldc1            #96  <String "Failed query: ">
	//   51   83:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   52   86:aload_2         
	//   53   87:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   54   90:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   55   93:invokestatic    #113 <Method int Log.w(String, String)>
	//   56   96:pop             
		closeQuietly(((AutoCloseable) (uri)));
	//   57   97:aload_1         
	//   58   98:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		return s1;
	//   59  101:aload_3         
	//   60  102:areturn         
		uri;
	//   61  103:astore_1        
		context = null;
	//   62  104:aconst_null     
	//   63  105:astore_0        
_L2:
		closeQuietly(((AutoCloseable) (context)));
	//   64  106:aload_0         
	//   65  107:invokestatic    #91  <Method void closeQuietly(AutoCloseable)>
		throw uri;
	//   66  110:aload_1         
	//   67  111:athrow          
		uri;
	//   68  112:astore_1        
		if(true) goto _L2; else goto _L1
	//   69  113:goto            106
_L1:
		s;
	//   70  116:astore_2        
		if(true) goto _L4; else goto _L3
_L3:
	//*  71  117:goto            70
	}

	private static final int FLAG_VIRTUAL_DOCUMENT = 512;
	private static final String TAG = "DocumentFile";
}
