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

// Referenced classes of package android.support.v4.provider:
//			DocumentFile, DocumentsContractApi19

class TreeDocumentFile extends DocumentFile
{

	TreeDocumentFile(DocumentFile documentfile, Context context, Uri uri)
	{
		super(documentfile);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void DocumentFile(DocumentFile)>
		mContext = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Context mContext>
		mUri = uri;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field Uri mUri>
	//    9   15:return          
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
	//    3    5:invokeinterface #35  <Method void AutoCloseable.close()>
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

	private static Uri createFile(Context context, Uri uri, String s, String s1)
	{
		try
		{
			context = ((Context) (DocumentsContract.createDocument(context.getContentResolver(), uri, s, s1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method ContentResolver Context.getContentResolver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokestatic    #49  <Method Uri DocumentsContract.createDocument(ContentResolver, Uri, String, String)>
	//    6   10:astore_0        
		}
	//*   7   11:aload_0         
	//*   8   12:areturn         
	//*   9   13:aconst_null     
	//*  10   14:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return null;
		}
		return ((Uri) (context));
	//*  11   15:astore_0        
	//*  12   16:goto            13
	}

	public boolean canRead()
	{
		return DocumentsContractApi19.canRead(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #57  <Method boolean DocumentsContractApi19.canRead(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean canWrite()
	{
		return DocumentsContractApi19.canWrite(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #60  <Method boolean DocumentsContractApi19.canWrite(Context, Uri)>
	//    5   11:ireturn         
	}

	public DocumentFile createDirectory(String s)
	{
		s = ((String) (createFile(mContext, mUri, "vnd.android.document/directory", s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:ldc1            #64  <String "vnd.android.document/directory">
	//    5   10:aload_1         
	//    6   11:invokestatic    #66  <Method Uri createFile(Context, Uri, String, String)>
	//    7   14:astore_1        
		if(s != null)
	//*   8   15:aload_1         
	//*   9   16:ifnull          33
			return ((DocumentFile) (new TreeDocumentFile(((DocumentFile) (this)), mContext, ((Uri) (s)))));
	//   10   19:new             #2   <Class TreeDocumentFile>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #19  <Field Context mContext>
	//   15   28:aload_1         
	//   16   29:invokespecial   #68  <Method void TreeDocumentFile(DocumentFile, Context, Uri)>
	//   17   32:areturn         
		else
			return null;
	//   18   33:aconst_null     
	//   19   34:areturn         
	}

	public DocumentFile createFile(String s, String s1)
	{
		s = ((String) (createFile(mContext, mUri, s, s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #66  <Method Uri createFile(Context, Uri, String, String)>
	//    7   13:astore_1        
		if(s != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          32
			return ((DocumentFile) (new TreeDocumentFile(((DocumentFile) (this)), mContext, ((Uri) (s)))));
	//   10   18:new             #2   <Class TreeDocumentFile>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #19  <Field Context mContext>
	//   15   27:aload_1         
	//   16   28:invokespecial   #68  <Method void TreeDocumentFile(DocumentFile, Context, Uri)>
	//   17   31:areturn         
		else
			return null;
	//   18   32:aconst_null     
	//   19   33:areturn         
	}

	public boolean delete()
	{
		Exception exception;
		boolean flag;
		try
		{
			flag = DocumentsContract.deleteDocument(mContext.getContentResolver(), mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:invokevirtual   #43  <Method ContentResolver Context.getContentResolver()>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Uri mUri>
	//    5   11:invokestatic    #74  <Method boolean DocumentsContract.deleteDocument(ContentResolver, Uri)>
	//    6   14:istore_1        
		}
	//*   7   15:iload_1         
	//*   8   16:ireturn         
	//*   9   17:iconst_0        
	//*  10   18:ireturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return false;
		}
		return flag;
	//*  11   19:astore_2        
	//*  12   20:goto            17
	}

	public boolean exists()
	{
		return DocumentsContractApi19.exists(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #77  <Method boolean DocumentsContractApi19.exists(Context, Uri)>
	//    5   11:ireturn         
	}

	public String getName()
	{
		return DocumentsContractApi19.getName(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #82  <Method String DocumentsContractApi19.getName(Context, Uri)>
	//    5   11:areturn         
	}

	public String getType()
	{
		return DocumentsContractApi19.getType(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #85  <Method String DocumentsContractApi19.getType(Context, Uri)>
	//    5   11:areturn         
	}

	public Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Uri mUri>
	//    2    4:areturn         
	}

	public boolean isDirectory()
	{
		return DocumentsContractApi19.isDirectory(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #90  <Method boolean DocumentsContractApi19.isDirectory(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean isFile()
	{
		return DocumentsContractApi19.isFile(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #93  <Method boolean DocumentsContractApi19.isFile(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean isVirtual()
	{
		return DocumentsContractApi19.isVirtual(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #96  <Method boolean DocumentsContractApi19.isVirtual(Context, Uri)>
	//    5   11:ireturn         
	}

	public long lastModified()
	{
		return DocumentsContractApi19.lastModified(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #101 <Method long DocumentsContractApi19.lastModified(Context, Uri)>
	//    5   11:lreturn         
	}

	public long length()
	{
		return DocumentsContractApi19.length(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #104 <Method long DocumentsContractApi19.length(Context, Uri)>
	//    5   11:lreturn         
	}

	public DocumentFile[] listFiles()
	{
		int i;
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		ArrayList arraylist;
		obj2 = ((Object) (mContext.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:invokevirtual   #43  <Method ContentResolver Context.getContentResolver()>
	//    3    7:astore          4
		obj = ((Object) (mUri));
	//    4    9:aload_0         
	//    5   10:getfield        #21  <Field Uri mUri>
	//    6   13:astore_2        
		obj3 = ((Object) (DocumentsContract.buildChildDocumentsUriUsingTree(((Uri) (obj)), DocumentsContract.getDocumentId(((Uri) (obj))))));
	//    7   14:aload_2         
	//    8   15:aload_2         
	//    9   16:invokestatic    #110 <Method String DocumentsContract.getDocumentId(Uri)>
	//   10   19:invokestatic    #114 <Method Uri DocumentsContract.buildChildDocumentsUriUsingTree(Uri, String)>
	//   11   22:astore          5
		arraylist = new ArrayList();
	//   12   24:new             #116 <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #118 <Method void ArrayList()>
	//   15   31:astore          6
		i = 0;
	//   16   33:iconst_0        
	//   17   34:istore_1        
		obj = null;
	//   18   35:aconst_null     
	//   19   36:astore_2        
		obj1 = null;
	//   20   37:aconst_null     
	//   21   38:astore_3        
		obj2 = ((Object) (((ContentResolver) (obj2)).query(((Uri) (obj3)), new String[] {
			"document_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   22   39:aload           4
	//   23   41:aload           5
	//   24   43:iconst_1        
	//   25   44:anewarray       String[]
	//   26   47:dup             
	//   27   48:iconst_0        
	//   28   49:ldc1            #122 <String "document_id">
	//   29   51:aastore         
	//   30   52:aconst_null     
	//   31   53:aconst_null     
	//   32   54:aconst_null     
	//   33   55:invokevirtual   #128 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   34   58:astore          4
_L2:
		obj3 = obj2;
	//   35   60:aload           4
	//   36   62:astore          5
		obj1 = obj2;
	//   37   64:aload           4
	//   38   66:astore_3        
		obj = obj2;
	//   39   67:aload           4
	//   40   69:astore_2        
		if(!((Cursor) (obj2)).moveToNext())
			break; /* Loop/switch isn't completed */
	//   41   70:aload           4
	//   42   72:invokeinterface #133 <Method boolean Cursor.moveToNext()>
	//   43   77:ifeq            120
		obj1 = obj2;
	//   44   80:aload           4
	//   45   82:astore_3        
		obj = obj2;
	//   46   83:aload           4
	//   47   85:astore_2        
		obj3 = ((Object) (((Cursor) (obj2)).getString(0)));
	//   48   86:aload           4
	//   49   88:iconst_0        
	//   50   89:invokeinterface #137 <Method String Cursor.getString(int)>
	//   51   94:astore          5
		obj1 = obj2;
	//   52   96:aload           4
	//   53   98:astore_3        
		obj = obj2;
	//   54   99:aload           4
	//   55  101:astore_2        
		arraylist.add(((Object) (DocumentsContract.buildDocumentUriUsingTree(mUri, ((String) (obj3))))));
	//   56  102:aload           6
	//   57  104:aload_0         
	//   58  105:getfield        #21  <Field Uri mUri>
	//   59  108:aload           5
	//   60  110:invokestatic    #140 <Method Uri DocumentsContract.buildDocumentUriUsingTree(Uri, String)>
	//   61  113:invokevirtual   #144 <Method boolean ArrayList.add(Object)>
	//   62  116:pop             
		if(true) goto _L2; else goto _L1
	//   63  117:goto            60
_L1:
		closeQuietly(((AutoCloseable) (obj3)));
	//   64  120:aload           5
	//   65  122:invokestatic    #146 <Method void closeQuietly(AutoCloseable)>
		break; /* Loop/switch isn't completed */
	//   66  125:goto            184
		obj;
	//   67  128:astore_2        
		break MISSING_BLOCK_LABEL_240;
	//   68  129:goto            240
		Exception exception;
		exception;
	//   69  132:astore          4
		obj1 = obj;
	//   70  134:aload_2         
	//   71  135:astore_3        
		obj3 = ((Object) (new StringBuilder()));
	//   72  136:new             #148 <Class StringBuilder>
	//   73  139:dup             
	//   74  140:invokespecial   #149 <Method void StringBuilder()>
	//   75  143:astore          5
		obj1 = obj;
	//   76  145:aload_2         
	//   77  146:astore_3        
		((StringBuilder) (obj3)).append("Failed query: ");
	//   78  147:aload           5
	//   79  149:ldc1            #151 <String "Failed query: ">
	//   80  151:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   81  154:pop             
		obj1 = obj;
	//   82  155:aload_2         
	//   83  156:astore_3        
		((StringBuilder) (obj3)).append(((Object) (exception)));
	//   84  157:aload           5
	//   85  159:aload           4
	//   86  161:invokevirtual   #158 <Method StringBuilder StringBuilder.append(Object)>
	//   87  164:pop             
		obj1 = obj;
	//   88  165:aload_2         
	//   89  166:astore_3        
		Log.w("DocumentFile", ((StringBuilder) (obj3)).toString());
	//   90  167:ldc1            #160 <String "DocumentFile">
	//   91  169:aload           5
	//   92  171:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   93  174:invokestatic    #169 <Method int Log.w(String, String)>
	//   94  177:pop             
		obj3 = obj;
	//   95  178:aload_2         
	//   96  179:astore          5
		if(true) goto _L1; else goto _L3
	//   97  181:goto            120
_L3:
		obj = ((Object) ((Uri[])arraylist.toArray(((Object []) (new Uri[arraylist.size()])))));
	//   98  184:aload           6
	//   99  186:aload           6
	//  100  188:invokevirtual   #173 <Method int ArrayList.size()>
	//  101  191:anewarray       Uri[]
	//  102  194:invokevirtual   #179 <Method Object[] ArrayList.toArray(Object[])>
	//  103  197:checkcast       #181 <Class Uri[]>
	//  104  200:astore_2        
		obj1 = ((Object) (new DocumentFile[obj.length]));
	//  105  201:aload_2         
	//  106  202:arraylength     
	//  107  203:anewarray       DocumentFile[]
	//  108  206:astore_3        
		for(; i < obj.length; i++)
	//* 109  207:iload_1         
	//* 110  208:aload_2         
	//* 111  209:arraylength     
	//* 112  210:icmpge          238
			obj1[i] = ((/*<invalid signature>*/java.lang.Object) (new TreeDocumentFile(((DocumentFile) (this)), mContext, obj[i])));
	//  113  213:aload_3         
	//  114  214:iload_1         
	//  115  215:new             #2   <Class TreeDocumentFile>
	//  116  218:dup             
	//  117  219:aload_0         
	//  118  220:aload_0         
	//  119  221:getfield        #19  <Field Context mContext>
	//  120  224:aload_2         
	//  121  225:iload_1         
	//  122  226:aaload          
	//  123  227:invokespecial   #68  <Method void TreeDocumentFile(DocumentFile, Context, Uri)>
	//  124  230:aastore         

	//  125  231:iload_1         
	//  126  232:iconst_1        
	//  127  233:iadd            
	//  128  234:istore_1        
	//* 129  235:goto            207
		return ((DocumentFile []) (obj1));
	//  130  238:aload_3         
	//  131  239:areturn         
		closeQuietly(((AutoCloseable) (obj1)));
	//  132  240:aload_3         
	//  133  241:invokestatic    #146 <Method void closeQuietly(AutoCloseable)>
		throw obj;
	//  134  244:aload_2         
	//  135  245:athrow          
	}

	public boolean renameTo(String s)
	{
		try
		{
			s = ((String) (DocumentsContract.renameDocument(mContext.getContentResolver(), mUri, s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:invokevirtual   #43  <Method ContentResolver Context.getContentResolver()>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Uri mUri>
	//    5   11:aload_1         
	//    6   12:invokestatic    #187 <Method Uri DocumentsContract.renameDocument(ContentResolver, Uri, String)>
	//    7   15:astore_1        
		}
	//*   8   16:aload_1         
	//*   9   17:ifnull          27
	//*  10   20:aload_0         
	//*  11   21:aload_1         
	//*  12   22:putfield        #21  <Field Uri mUri>
	//*  13   25:iconst_1        
	//*  14   26:ireturn         
	//*  15   27:iconst_0        
	//*  16   28:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  17   29:astore_1        
		{
			return false;
	//   18   30:iconst_0        
	//   19   31:ireturn         
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_27;
		mUri = ((Uri) (s));
		return true;
		return false;
	}

	private Context mContext;
	private Uri mUri;
}
