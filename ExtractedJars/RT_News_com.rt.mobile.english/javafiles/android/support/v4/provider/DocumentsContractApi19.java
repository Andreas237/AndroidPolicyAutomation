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
	//    3    5:invokeinterface #63  <Method void AutoCloseable.close()>
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
		ContentResolver contentresolver;
		StringBuilder stringbuilder;
		contentresolver = context.getContentResolver();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore          4
		flag = true;
	//    3    6:iconst_1        
	//    4    7:istore_3        
		stringbuilder = null;
	//    5    8:aconst_null     
	//    6    9:astore          5
		context = null;
	//    7   11:aconst_null     
	//    8   12:astore_0        
		uri = ((Uri) (contentresolver.query(uri, new String[] {
			"document_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//    9   13:aload           4
	//   10   15:aload_1         
	//   11   16:iconst_1        
	//   12   17:anewarray       String[]
	//   13   20:dup             
	//   14   21:iconst_0        
	//   15   22:ldc1            #70  <String "document_id">
	//   16   24:aastore         
	//   17   25:aconst_null     
	//   18   26:aconst_null     
	//   19   27:aconst_null     
	//   20   28:invokevirtual   #76  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   21   31:astore_1        
		int i = ((Cursor) (uri)).getCount();
	//   22   32:aload_1         
	//   23   33:invokeinterface #82  <Method int Cursor.getCount()>
	//   24   38:istore_2        
		if(i <= 0)
	//*  25   39:iload_2         
	//*  26   40:ifle            46
	//*  27   43:goto            48
			flag = false;
	//   28   46:iconst_0        
	//   29   47:istore_3        
		closeQuietly(((AutoCloseable) (uri)));
	//   30   48:aload_1         
	//   31   49:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
		return flag;
	//   32   52:iload_3         
	//   33   53:ireturn         
		Object obj;
		obj;
	//   34   54:astore          4
		context = ((Context) (uri));
	//   35   56:aload_1         
	//   36   57:astore_0        
		uri = ((Uri) (obj));
	//   37   58:aload           4
	//   38   60:astore_1        
		break MISSING_BLOCK_LABEL_128;
	//   39   61:goto            128
		obj;
	//   40   64:astore          4
		break MISSING_BLOCK_LABEL_78;
	//   41   66:goto            78
		uri;
	//   42   69:astore_1        
		break MISSING_BLOCK_LABEL_128;
	//   43   70:goto            128
		obj;
	//   44   73:astore          4
		uri = ((Uri) (stringbuilder));
	//   45   75:aload           5
	//   46   77:astore_1        
		context = ((Context) (uri));
	//   47   78:aload_1         
	//   48   79:astore_0        
		stringbuilder = new StringBuilder();
	//   49   80:new             #86  <Class StringBuilder>
	//   50   83:dup             
	//   51   84:invokespecial   #87  <Method void StringBuilder()>
	//   52   87:astore          5
		context = ((Context) (uri));
	//   53   89:aload_1         
	//   54   90:astore_0        
		stringbuilder.append("Failed query: ");
	//   55   91:aload           5
	//   56   93:ldc1            #89  <String "Failed query: ">
	//   57   95:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   58   98:pop             
		context = ((Context) (uri));
	//   59   99:aload_1         
	//   60  100:astore_0        
		stringbuilder.append(obj);
	//   61  101:aload           5
	//   62  103:aload           4
	//   63  105:invokevirtual   #96  <Method StringBuilder StringBuilder.append(Object)>
	//   64  108:pop             
		context = ((Context) (uri));
	//   65  109:aload_1         
	//   66  110:astore_0        
		Log.w("DocumentFile", stringbuilder.toString());
	//   67  111:ldc1            #14  <String "DocumentFile">
	//   68  113:aload           5
	//   69  115:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   70  118:invokestatic    #106 <Method int Log.w(String, String)>
	//   71  121:pop             
		closeQuietly(((AutoCloseable) (uri)));
	//   72  122:aload_1         
	//   73  123:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
		return false;
	//   74  126:iconst_0        
	//   75  127:ireturn         
		closeQuietly(((AutoCloseable) (context)));
	//   76  128:aload_0         
	//   77  129:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
		throw uri;
	//   78  132:aload_1         
	//   79  133:athrow          
	}

	public static long getFlags(Context context, Uri uri)
	{
		return queryForLong(context, uri, "flags", 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #40  <String "flags">
	//    3    4:lconst_0        
	//    4    5:invokestatic    #112 <Method long queryForLong(Context, Uri, String, long)>
	//    5    8:lreturn         
	}

	public static String getName(Context context, Uri uri)
	{
		return queryForString(context, uri, "_display_name", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #115 <String "_display_name">
	//    3    4:aconst_null     
	//    4    5:invokestatic    #119 <Method String queryForString(Context, Uri, String, String)>
	//    5    8:areturn         
	}

	private static String getRawType(Context context, Uri uri)
	{
		return queryForString(context, uri, "mime_type", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #121 <String "mime_type">
	//    3    4:aconst_null     
	//    4    5:invokestatic    #119 <Method String queryForString(Context, Uri, String, String)>
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

	public static boolean isDocumentUri(Context context, Uri uri)
	{
		return DocumentsContract.isDocumentUri(context, uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #128 <Method boolean DocumentsContract.isDocumentUri(Context, Uri)>
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
		boolean flag1 = isDocumentUri(context, uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #131 <Method boolean isDocumentUri(Context, Uri)>
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
	//*  12   16:invokestatic    #133 <Method long getFlags(Context, Uri)>
	//*  13   19:ldc2w           #134 <Long 512L>
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
	//    2    2:ldc1            #138 <String "last_modified">
	//    3    4:lconst_0        
	//    4    5:invokestatic    #112 <Method long queryForLong(Context, Uri, String, long)>
	//    5    8:lreturn         
	}

	public static long length(Context context, Uri uri)
	{
		return queryForLong(context, uri, "_size", 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #141 <String "_size">
	//    3    4:lconst_0        
	//    4    5:invokestatic    #112 <Method long queryForLong(Context, Uri, String, long)>
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
	//    5    5:invokestatic    #112 <Method long queryForLong(Context, Uri, String, long)>
	//    6    8:l2i             
	//    7    9:ireturn         
	}

	private static long queryForLong(Context context, Uri uri, String s, long l)
	{
		StringBuilder stringbuilder;
		ContentResolver contentresolver;
		contentresolver = context.getContentResolver();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore          8
		stringbuilder = null;
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
	//   18   25:invokevirtual   #76  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   19   28:astore_1        
label0:
		{
			long l1;
			try
			{
				if(!((Cursor) (uri)).moveToFirst() || ((Cursor) (uri)).isNull(0))
					break label0;
	//   20   29:aload_1         
	//   21   30:invokeinterface #145 <Method boolean Cursor.moveToFirst()>
	//   22   35:ifeq            64
	//   23   38:aload_1         
	//   24   39:iconst_0        
	//   25   40:invokeinterface #149 <Method boolean Cursor.isNull(int)>
	//   26   45:ifne            64
				l1 = ((Cursor) (uri)).getLong(0);
	//   27   48:aload_1         
	//   28   49:iconst_0        
	//   29   50:invokeinterface #153 <Method long Cursor.getLong(int)>
	//   30   55:lstore          5
			}
	//*  31   57:aload_1         
	//*  32   58:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
	//*  33   61:lload           5
	//*  34   63:lreturn         
	//*  35   64:aload_1         
	//*  36   65:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
	//*  37   68:lload_3         
	//*  38   69:lreturn         
	//*  39   70:astore_2        
	//*  40   71:aload_1         
	//*  41   72:astore_0        
	//*  42   73:aload_2         
	//*  43   74:astore_1        
	//*  44   75:goto            139
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  45   78:astore_2        
			{
				break MISSING_BLOCK_LABEL_90;
	//   46   79:goto            90
			}
			closeQuietly(((AutoCloseable) (uri)));
			return l1;
		}
		closeQuietly(((AutoCloseable) (uri)));
		return l;
		s;
		context = ((Context) (uri));
		uri = ((Uri) (s));
		break MISSING_BLOCK_LABEL_139;
		uri;
	//   47   82:astore_1        
		break MISSING_BLOCK_LABEL_139;
	//   48   83:goto            139
		s;
	//   49   86:astore_2        
		uri = ((Uri) (stringbuilder));
	//   50   87:aload           7
	//   51   89:astore_1        
		context = ((Context) (uri));
	//   52   90:aload_1         
	//   53   91:astore_0        
		stringbuilder = new StringBuilder();
	//   54   92:new             #86  <Class StringBuilder>
	//   55   95:dup             
	//   56   96:invokespecial   #87  <Method void StringBuilder()>
	//   57   99:astore          7
		context = ((Context) (uri));
	//   58  101:aload_1         
	//   59  102:astore_0        
		stringbuilder.append("Failed query: ");
	//   60  103:aload           7
	//   61  105:ldc1            #89  <String "Failed query: ">
	//   62  107:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   63  110:pop             
		context = ((Context) (uri));
	//   64  111:aload_1         
	//   65  112:astore_0        
		stringbuilder.append(((Object) (s)));
	//   66  113:aload           7
	//   67  115:aload_2         
	//   68  116:invokevirtual   #96  <Method StringBuilder StringBuilder.append(Object)>
	//   69  119:pop             
		context = ((Context) (uri));
	//   70  120:aload_1         
	//   71  121:astore_0        
		Log.w("DocumentFile", stringbuilder.toString());
	//   72  122:ldc1            #14  <String "DocumentFile">
	//   73  124:aload           7
	//   74  126:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   75  129:invokestatic    #106 <Method int Log.w(String, String)>
	//   76  132:pop             
		closeQuietly(((AutoCloseable) (uri)));
	//   77  133:aload_1         
	//   78  134:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
		return l;
	//   79  137:lload_3         
	//   80  138:lreturn         
		closeQuietly(((AutoCloseable) (context)));
	//   81  139:aload_0         
	//   82  140:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
		throw uri;
	//   83  143:aload_1         
	//   84  144:athrow          
	}

	private static String queryForString(Context context, Uri uri, String s, String s1)
	{
		StringBuilder stringbuilder;
		ContentResolver contentresolver;
		contentresolver = context.getContentResolver();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore          5
		stringbuilder = null;
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
	//   18   25:invokevirtual   #76  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   19   28:astore_1        
label0:
		{
			try
			{
				if(!((Cursor) (uri)).moveToFirst() || ((Cursor) (uri)).isNull(0))
					break label0;
	//   20   29:aload_1         
	//   21   30:invokeinterface #145 <Method boolean Cursor.moveToFirst()>
	//   22   35:ifeq            62
	//   23   38:aload_1         
	//   24   39:iconst_0        
	//   25   40:invokeinterface #149 <Method boolean Cursor.isNull(int)>
	//   26   45:ifne            62
				context = ((Context) (((Cursor) (uri)).getString(0)));
	//   27   48:aload_1         
	//   28   49:iconst_0        
	//   29   50:invokeinterface #157 <Method String Cursor.getString(int)>
	//   30   55:astore_0        
			}
	//*  31   56:aload_1         
	//*  32   57:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
	//*  33   60:aload_0         
	//*  34   61:areturn         
	//*  35   62:aload_1         
	//*  36   63:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
	//*  37   66:aload_3         
	//*  38   67:areturn         
	//*  39   68:astore_2        
	//*  40   69:aload_1         
	//*  41   70:astore_0        
	//*  42   71:aload_2         
	//*  43   72:astore_1        
	//*  44   73:goto            137
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  45   76:astore_2        
			{
				break MISSING_BLOCK_LABEL_88;
	//   46   77:goto            88
			}
			closeQuietly(((AutoCloseable) (uri)));
			return ((String) (context));
		}
		closeQuietly(((AutoCloseable) (uri)));
		return s1;
		s;
		context = ((Context) (uri));
		uri = ((Uri) (s));
		break MISSING_BLOCK_LABEL_137;
		uri;
	//   47   80:astore_1        
		break MISSING_BLOCK_LABEL_137;
	//   48   81:goto            137
		s;
	//   49   84:astore_2        
		uri = ((Uri) (stringbuilder));
	//   50   85:aload           4
	//   51   87:astore_1        
		context = ((Context) (uri));
	//   52   88:aload_1         
	//   53   89:astore_0        
		stringbuilder = new StringBuilder();
	//   54   90:new             #86  <Class StringBuilder>
	//   55   93:dup             
	//   56   94:invokespecial   #87  <Method void StringBuilder()>
	//   57   97:astore          4
		context = ((Context) (uri));
	//   58   99:aload_1         
	//   59  100:astore_0        
		stringbuilder.append("Failed query: ");
	//   60  101:aload           4
	//   61  103:ldc1            #89  <String "Failed query: ">
	//   62  105:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   63  108:pop             
		context = ((Context) (uri));
	//   64  109:aload_1         
	//   65  110:astore_0        
		stringbuilder.append(((Object) (s)));
	//   66  111:aload           4
	//   67  113:aload_2         
	//   68  114:invokevirtual   #96  <Method StringBuilder StringBuilder.append(Object)>
	//   69  117:pop             
		context = ((Context) (uri));
	//   70  118:aload_1         
	//   71  119:astore_0        
		Log.w("DocumentFile", stringbuilder.toString());
	//   72  120:ldc1            #14  <String "DocumentFile">
	//   73  122:aload           4
	//   74  124:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   75  127:invokestatic    #106 <Method int Log.w(String, String)>
	//   76  130:pop             
		closeQuietly(((AutoCloseable) (uri)));
	//   77  131:aload_1         
	//   78  132:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
		return s1;
	//   79  135:aload_3         
	//   80  136:areturn         
		closeQuietly(((AutoCloseable) (context)));
	//   81  137:aload_0         
	//   82  138:invokestatic    #84  <Method void closeQuietly(AutoCloseable)>
		throw uri;
	//   83  141:aload_1         
	//   84  142:athrow          
	}

	private static final int FLAG_VIRTUAL_DOCUMENT = 512;
	private static final String TAG = "DocumentFile";
}
