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
		if(autocloseable != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          15
			try
			{
				autocloseable.close();
	//    2    4:aload_0         
	//    3    5:invokeinterface #27  <Method void AutoCloseable.close()>
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
			// Misplaced declaration of an exception variable
			catch(AutoCloseable autocloseable) { }
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
		return DocumentsContract.createDocument(context.getContentResolver(), uri, s, s1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method ContentResolver Context.getContentResolver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokestatic    #47  <Method Uri DocumentsContract.createDocument(ContentResolver, Uri, String, String)>
	//    6   10:areturn         
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
	//   35   57:ifeq            84
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
_L1:
		closeQuietly(((AutoCloseable) (obj1)));
	//   49   84:aload_3         
	//   50   85:invokestatic    #89  <Method void closeQuietly(AutoCloseable)>
		break MISSING_BLOCK_LABEL_133;
	//   51   88:goto            133
		uri;
	//   52   91:astore_1        
		obj = ((Object) (context));
	//   53   92:aload_0         
	//   54   93:astore_2        
		Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(((Object) (uri))).toString());
	//   55   94:ldc1            #11  <String "DocumentFile">
	//   56   96:new             #91  <Class StringBuilder>
	//   57   99:dup             
	//   58  100:invokespecial   #92  <Method void StringBuilder()>
	//   59  103:ldc1            #94  <String "Failed query: ">
	//   60  105:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   61  108:aload_1         
	//   62  109:invokevirtual   #101 <Method StringBuilder StringBuilder.append(Object)>
	//   63  112:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   64  115:invokestatic    #111 <Method int Log.w(String, String)>
	//   65  118:pop             
		closeQuietly(((AutoCloseable) (context)));
	//   66  119:aload_0         
	//   67  120:invokestatic    #89  <Method void closeQuietly(AutoCloseable)>
		break MISSING_BLOCK_LABEL_133;
	//   68  123:goto            133
		context;
	//   69  126:astore_0        
		closeQuietly(((AutoCloseable) (obj)));
	//   70  127:aload_2         
	//   71  128:invokestatic    #89  <Method void closeQuietly(AutoCloseable)>
		throw context;
	//   72  131:aload_0         
	//   73  132:athrow          
		return (Uri[])arraylist.toArray(((Object []) (new Uri[arraylist.size()])));
	//   74  133:aload           4
	//   75  135:aload           4
	//   76  137:invokevirtual   #115 <Method int ArrayList.size()>
	//   77  140:anewarray       Uri[]
	//   78  143:invokevirtual   #121 <Method Object[] ArrayList.toArray(Object[])>
	//   79  146:checkcast       #123 <Class Uri[]>
	//   80  149:areturn         
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
		return DocumentsContract.renameDocument(context.getContentResolver(), uri, s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #41  <Method ContentResolver Context.getContentResolver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #133 <Method Uri DocumentsContract.renameDocument(ContentResolver, Uri, String)>
	//    5    9:areturn         
	}

	private static final String TAG = "DocumentFile";
}
