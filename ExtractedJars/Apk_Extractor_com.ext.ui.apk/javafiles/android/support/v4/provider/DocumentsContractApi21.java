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
		ArrayList arraylist;
		context = ((Context) (context.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method ContentResolver Context.getContentResolver()>
	//    2    4:astore_0        
		obj = ((Object) (DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri))));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokestatic    #53  <Method String DocumentsContract.getDocumentId(Uri)>
	//    6   10:invokestatic    #57  <Method Uri DocumentsContract.buildChildDocumentsUriUsingTree(Uri, String)>
	//    7   13:astore_2        
		arraylist = new ArrayList();
	//    8   14:new             #59  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #60  <Method void ArrayList()>
	//   11   21:astore_3        
		obj = ((Object) (((ContentResolver) (context)).query(((Uri) (obj)), new String[] {
			"document_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:iconst_1        
	//   15   25:anewarray       String[]
	//   16   28:dup             
	//   17   29:iconst_0        
	//   18   30:ldc1            #64  <String "document_id">
	//   19   32:aastore         
	//   20   33:aconst_null     
	//   21   34:aconst_null     
	//   22   35:aconst_null     
	//   23   36:invokevirtual   #70  <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   24   39:astore_2        
_L2:
		context = ((Context) (obj));
	//   25   40:aload_2         
	//   26   41:astore_0        
		if(!((Cursor) (obj)).moveToNext())
			break; /* Loop/switch isn't completed */
	//   27   42:aload_2         
	//   28   43:invokeinterface #76  <Method boolean Cursor.moveToNext()>
	//   29   48:ifeq            119
		context = ((Context) (obj));
	//   30   51:aload_2         
	//   31   52:astore_0        
		arraylist.add(((Object) (DocumentsContract.buildDocumentUriUsingTree(uri, ((Cursor) (obj)).getString(0)))));
	//   32   53:aload_3         
	//   33   54:aload_1         
	//   34   55:aload_2         
	//   35   56:iconst_0        
	//   36   57:invokeinterface #80  <Method String Cursor.getString(int)>
	//   37   62:invokestatic    #83  <Method Uri DocumentsContract.buildDocumentUriUsingTree(Uri, String)>
	//   38   65:invokevirtual   #87  <Method boolean ArrayList.add(Object)>
	//   39   68:pop             
		if(true) goto _L2; else goto _L1
	//   40   69:goto            40
		uri;
	//   41   72:astore_1        
_L8:
		context = ((Context) (obj));
	//   42   73:aload_2         
	//   43   74:astore_0        
		Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(((Object) (uri))).toString());
	//   44   75:ldc1            #11  <String "DocumentFile">
	//   45   77:new             #89  <Class StringBuilder>
	//   46   80:dup             
	//   47   81:invokespecial   #90  <Method void StringBuilder()>
	//   48   84:ldc1            #92  <String "Failed query: ">
	//   49   86:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   50   89:aload_1         
	//   51   90:invokevirtual   #99  <Method StringBuilder StringBuilder.append(Object)>
	//   52   93:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   53   96:invokestatic    #109 <Method int Log.w(String, String)>
	//   54   99:pop             
		closeQuietly(((AutoCloseable) (obj)));
	//   55  100:aload_2         
	//   56  101:invokestatic    #111 <Method void closeQuietly(AutoCloseable)>
_L4:
		return (Uri[])arraylist.toArray(((Object []) (new Uri[arraylist.size()])));
	//   57  104:aload_3         
	//   58  105:aload_3         
	//   59  106:invokevirtual   #115 <Method int ArrayList.size()>
	//   60  109:anewarray       Uri[]
	//   61  112:invokevirtual   #121 <Method Object[] ArrayList.toArray(Object[])>
	//   62  115:checkcast       #123 <Class Uri[]>
	//   63  118:areturn         
_L1:
		closeQuietly(((AutoCloseable) (obj)));
	//   64  119:aload_2         
	//   65  120:invokestatic    #111 <Method void closeQuietly(AutoCloseable)>
		if(true) goto _L4; else goto _L3
	//   66  123:goto            104
_L3:
		uri;
	//   67  126:astore_1        
		context = null;
	//   68  127:aconst_null     
	//   69  128:astore_0        
_L6:
		closeQuietly(((AutoCloseable) (context)));
	//   70  129:aload_0         
	//   71  130:invokestatic    #111 <Method void closeQuietly(AutoCloseable)>
		throw uri;
	//   72  133:aload_1         
	//   73  134:athrow          
		uri;
	//   74  135:astore_1        
		if(true) goto _L6; else goto _L5
	//   75  136:goto            129
_L5:
		uri;
	//   76  139:astore_1        
		obj = null;
	//   77  140:aconst_null     
	//   78  141:astore_2        
		if(true) goto _L8; else goto _L7
	//   79  142:goto            73
_L7:
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
