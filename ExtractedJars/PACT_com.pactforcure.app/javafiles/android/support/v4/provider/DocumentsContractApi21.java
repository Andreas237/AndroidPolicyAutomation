// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

class DocumentsContractApi21
{

	DocumentsContractApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static void closeQuietly(AutoCloseable autocloseable)
	{
		if(autocloseable == null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_0         
	//    1    1:ifnull          10
		autocloseable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #27  <Method void AutoCloseable.close()>
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

	public static Uri createDirectory(Context context, Uri uri, String s)
	{
		return createFile(context, uri, "vnd.android.document/directory", s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #31  <String "vnd.android.document/directory">
	//    3    4:aload_2         
	//    4    5:invokestatic    #35  <Method Uri createFile(Context, Uri, String, String)>
	//    5    8:areturn         
	}

	public static Uri createFile(Context context, Uri uri, String s, String s1)
	{
		try
		{
			context = ((Context) (DocumentsContract.createDocument(context.getContentResolver(), uri, s, s1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method ContentResolver Context.getContentResolver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokestatic    #47  <Method Uri DocumentsContract.createDocument(ContentResolver, Uri, String, String)>
	//    6   10:astore_0        
		}
	//*   7   11:aload_0         
	//*   8   12:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   9   13:astore_0        
		{
			return null;
	//   10   14:aconst_null     
	//   11   15:areturn         
		}
		return ((Uri) (context));
	}

	public static Uri[] listFiles(Context context, Uri uri)
	{
		Object obj;
		Object obj1;
		ArrayList arraylist;
		Uri uri1;
		obj1 = ((Object) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore_3        
		uri1 = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokestatic    #53  <Method String DocumentsContract.getDocumentId(Uri)>
	//    6   10:invokestatic    #57  <Method Uri DocumentsContract.buildChildDocumentsUriUsingTree(Uri, String)>
	//    7   13:astore          5
		arraylist = new ArrayList();
	//    8   15:new             #59  <Class ArrayList>
	//    9   18:dup             
	//   10   19:invokespecial   #60  <Method void ArrayList()>
	//   11   22:astore          4
		obj = null;
	//   12   24:aconst_null     
	//   13   25:astore_2        
		context = null;
	//   14   26:aconst_null     
	//   15   27:astore_0        
		obj1 = ((Object) (((ContentResolver) (obj1)).query(uri1, new String[] {
			"document_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   16   28:aload_3         
	//   17   29:aload           5
	//   18   31:iconst_1        
	//   19   32:anewarray       String[]
	//   20   35:dup             
	//   21   36:iconst_0        
	//   22   37:ldc1            #64  <String "document_id">
	//   23   39:aastore         
	//   24   40:aconst_null     
	//   25   41:aconst_null     
	//   26   42:aconst_null     
	//   27   43:invokevirtual   #70  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   28   46:astore_3        
_L2:
		context = ((Context) (obj1));
	//   29   47:aload_3         
	//   30   48:astore_0        
		obj = obj1;
	//   31   49:aload_3         
	//   32   50:astore_2        
		if(!((Cursor) (obj1)).moveToNext())
			break; /* Loop/switch isn't completed */
	//   33   51:aload_3         
	//   34   52:invokeinterface #76  <Method boolean Cursor.moveToNext()>
	//   35   57:ifeq            133
		context = ((Context) (obj1));
	//   36   60:aload_3         
	//   37   61:astore_0        
		obj = obj1;
	//   38   62:aload_3         
	//   39   63:astore_2        
		arraylist.add(((Object) (DocumentsContract.buildDocumentUriUsingTree(uri, ((Cursor) (obj1)).getString(0)))));
	//   40   64:aload           4
	//   41   66:aload_1         
	//   42   67:aload_3         
	//   43   68:iconst_0        
	//   44   69:invokeinterface #80  <Method String Cursor.getString(int)>
	//   45   74:invokestatic    #83  <Method Uri DocumentsContract.buildDocumentUriUsingTree(Uri, String)>
	//   46   77:invokevirtual   #87  <Method boolean ArrayList.add(Object)>
	//   47   80:pop             
		if(true) goto _L2; else goto _L1
	//   48   81:goto            47
		uri;
	//   49   84:astore_1        
		obj = ((Object) (context));
	//   50   85:aload_0         
	//   51   86:astore_2        
		Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(((Object) (uri))).toString());
	//   52   87:ldc1            #11  <String "DocumentFile">
	//   53   89:new             #89  <Class StringBuilder>
	//   54   92:dup             
	//   55   93:invokespecial   #90  <Method void StringBuilder()>
	//   56   96:ldc1            #92  <String "Failed query: ">
	//   57   98:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   58  101:aload_1         
	//   59  102:invokevirtual   #99  <Method StringBuilder StringBuilder.append(Object)>
	//   60  105:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   61  108:invokestatic    #109 <Method int Log.w(String, String)>
	//   62  111:pop             
		closeQuietly(((AutoCloseable) (context)));
	//   63  112:aload_0         
	//   64  113:invokestatic    #111 <Method void closeQuietly(AutoCloseable)>
_L4:
		return (Uri[])arraylist.toArray(((Object []) (new Uri[arraylist.size()])));
	//   65  116:aload           4
	//   66  118:aload           4
	//   67  120:invokevirtual   #115 <Method int ArrayList.size()>
	//   68  123:anewarray       Uri[]
	//   69  126:invokevirtual   #121 <Method Object[] ArrayList.toArray(Object[])>
	//   70  129:checkcast       #123 <Class Uri[]>
	//   71  132:areturn         
_L1:
		closeQuietly(((AutoCloseable) (obj1)));
	//   72  133:aload_3         
	//   73  134:invokestatic    #111 <Method void closeQuietly(AutoCloseable)>
		if(true) goto _L4; else goto _L3
	//   74  137:goto            116
_L3:
		context;
	//   75  140:astore_0        
		closeQuietly(((AutoCloseable) (obj)));
	//   76  141:aload_2         
	//   77  142:invokestatic    #111 <Method void closeQuietly(AutoCloseable)>
		throw context;
	//   78  145:aload_0         
	//   79  146:athrow          
	}

	public static Uri prepareTreeUri(Uri uri)
	{
		return DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokestatic    #128 <Method String DocumentsContract.getTreeDocumentId(Uri)>
	//    3    5:invokestatic    #83  <Method Uri DocumentsContract.buildDocumentUriUsingTree(Uri, String)>
	//    4    8:areturn         
	}

	public static Uri renameTo(Context context, Uri uri, String s)
	{
		try
		{
			context = ((Context) (DocumentsContract.renameDocument(context.getContentResolver(), uri, s)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method ContentResolver Context.getContentResolver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #133 <Method Uri DocumentsContract.renameDocument(ContentResolver, Uri, String)>
	//    5    9:astore_0        
		}
	//*   6   10:aload_0         
	//*   7   11:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   8   12:astore_0        
		{
			return null;
	//    9   13:aconst_null     
	//   10   14:areturn         
		}
		return ((Uri) (context));
	}

	private static final String TAG = "DocumentFile";
}
