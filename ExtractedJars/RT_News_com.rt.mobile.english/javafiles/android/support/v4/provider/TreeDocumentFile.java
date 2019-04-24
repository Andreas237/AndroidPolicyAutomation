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
	//    2    2:invokespecial   #16  <Method void DocumentFile(DocumentFile)>
		mContext = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Context mContext>
		mUri = uri;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field Uri mUri>
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
	//    3    5:invokeinterface #33  <Method void AutoCloseable.close()>
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
	//    1    1:invokevirtual   #41  <Method ContentResolver Context.getContentResolver()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokestatic    #47  <Method Uri DocumentsContract.createDocument(ContentResolver, Uri, String, String)>
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
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #54  <Method boolean DocumentsContractApi19.canRead(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean canWrite()
	{
		return DocumentsContractApi19.canWrite(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #57  <Method boolean DocumentsContractApi19.canWrite(Context, Uri)>
	//    5   11:ireturn         
	}

	public DocumentFile createDirectory(String s)
	{
		s = ((String) (createFile(mContext, mUri, "vnd.android.document/directory", s)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:ldc1            #61  <String "vnd.android.document/directory">
	//    5   10:aload_1         
	//    6   11:invokestatic    #63  <Method Uri createFile(Context, Uri, String, String)>
	//    7   14:astore_1        
		if(s != null)
	//*   8   15:aload_1         
	//*   9   16:ifnull          33
			return ((DocumentFile) (new TreeDocumentFile(((DocumentFile) (this)), mContext, ((Uri) (s)))));
	//   10   19:new             #2   <Class TreeDocumentFile>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #18  <Field Context mContext>
	//   15   28:aload_1         
	//   16   29:invokespecial   #65  <Method void TreeDocumentFile(DocumentFile, Context, Uri)>
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
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #63  <Method Uri createFile(Context, Uri, String, String)>
	//    7   13:astore_1        
		if(s != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          32
			return ((DocumentFile) (new TreeDocumentFile(((DocumentFile) (this)), mContext, ((Uri) (s)))));
	//   10   18:new             #2   <Class TreeDocumentFile>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #18  <Field Context mContext>
	//   15   27:aload_1         
	//   16   28:invokespecial   #65  <Method void TreeDocumentFile(DocumentFile, Context, Uri)>
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
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:invokevirtual   #41  <Method ContentResolver Context.getContentResolver()>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field Uri mUri>
	//    5   11:invokestatic    #71  <Method boolean DocumentsContract.deleteDocument(ContentResolver, Uri)>
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
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #74  <Method boolean DocumentsContractApi19.exists(Context, Uri)>
	//    5   11:ireturn         
	}

	public String getName()
	{
		return DocumentsContractApi19.getName(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #79  <Method String DocumentsContractApi19.getName(Context, Uri)>
	//    5   11:areturn         
	}

	public String getType()
	{
		return DocumentsContractApi19.getType(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #82  <Method String DocumentsContractApi19.getType(Context, Uri)>
	//    5   11:areturn         
	}

	public Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Uri mUri>
	//    2    4:areturn         
	}

	public boolean isDirectory()
	{
		return DocumentsContractApi19.isDirectory(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #87  <Method boolean DocumentsContractApi19.isDirectory(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean isFile()
	{
		return DocumentsContractApi19.isFile(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #90  <Method boolean DocumentsContractApi19.isFile(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean isVirtual()
	{
		return DocumentsContractApi19.isVirtual(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #93  <Method boolean DocumentsContractApi19.isVirtual(Context, Uri)>
	//    5   11:ireturn         
	}

	public long lastModified()
	{
		return DocumentsContractApi19.lastModified(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #98  <Method long DocumentsContractApi19.lastModified(Context, Uri)>
	//    5   11:lreturn         
	}

	public long length()
	{
		return DocumentsContractApi19.length(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #101 <Method long DocumentsContractApi19.length(Context, Uri)>
	//    5   11:lreturn         
	}

	public DocumentFile[] listFiles()
	{
		int i;
		Object obj;
		Object obj1;
		Object obj2;
		ArrayList arraylist;
		Object obj3;
		obj1 = ((Object) (mContext.getContentResolver()));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:invokevirtual   #41  <Method ContentResolver Context.getContentResolver()>
	//    3    7:astore_3        
		obj3 = ((Object) (DocumentsContract.buildChildDocumentsUriUsingTree(mUri, DocumentsContract.getDocumentId(mUri))));
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field Uri mUri>
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field Uri mUri>
	//    8   16:invokestatic    #107 <Method String DocumentsContract.getDocumentId(Uri)>
	//    9   19:invokestatic    #111 <Method Uri DocumentsContract.buildChildDocumentsUriUsingTree(Uri, String)>
	//   10   22:astore          6
		arraylist = new ArrayList();
	//   11   24:new             #113 <Class ArrayList>
	//   12   27:dup             
	//   13   28:invokespecial   #115 <Method void ArrayList()>
	//   14   31:astore          5
		i = 0;
	//   15   33:iconst_0        
	//   16   34:istore_1        
		obj2 = null;
	//   17   35:aconst_null     
	//   18   36:astore          4
		obj = null;
	//   19   38:aconst_null     
	//   20   39:astore_2        
		obj1 = ((Object) (((ContentResolver) (obj1)).query(((Uri) (obj3)), new String[] {
			"document_id"
		}, ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   21   40:aload_3         
	//   22   41:aload           6
	//   23   43:iconst_1        
	//   24   44:anewarray       String[]
	//   25   47:dup             
	//   26   48:iconst_0        
	//   27   49:ldc1            #119 <String "document_id">
	//   28   51:aastore         
	//   29   52:aconst_null     
	//   30   53:aconst_null     
	//   31   54:aconst_null     
	//   32   55:invokevirtual   #125 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   33   58:astore_3        
		try
		{
			while(((Cursor) (obj1)).moveToNext()) 
	//*  34   59:aload_3         
	//*  35   60:invokeinterface #130 <Method boolean Cursor.moveToNext()>
	//*  36   65:ifeq            93
			{
				obj = ((Object) (((Cursor) (obj1)).getString(0)));
	//   37   68:aload_3         
	//   38   69:iconst_0        
	//   39   70:invokeinterface #134 <Method String Cursor.getString(int)>
	//   40   75:astore_2        
				arraylist.add(((Object) (DocumentsContract.buildDocumentUriUsingTree(mUri, ((String) (obj))))));
	//   41   76:aload           5
	//   42   78:aload_0         
	//   43   79:getfield        #20  <Field Uri mUri>
	//   44   82:aload_2         
	//   45   83:invokestatic    #137 <Method Uri DocumentsContract.buildDocumentUriUsingTree(Uri, String)>
	//   46   86:invokevirtual   #141 <Method boolean ArrayList.add(Object)>
	//   47   89:pop             
			}
		}
	//*  48   90:goto            59
	//*  49   93:aload_3         
	//*  50   94:invokestatic    #143 <Method void closeQuietly(AutoCloseable)>
	//*  51   97:goto            174
	//*  52  100:astore          4
	//*  53  102:aload_3         
	//*  54  103:astore_2        
	//*  55  104:aload           4
	//*  56  106:astore_3        
	//*  57  107:goto            230
		// Misplaced declaration of an exception variable
		catch(Object obj2)
	//*  58  110:astore          4
		{
			break MISSING_BLOCK_LABEL_126;
	//   59  112:goto            126
		}
		closeQuietly(((AutoCloseable) (obj1)));
		break MISSING_BLOCK_LABEL_174;
		obj2;
		obj = obj1;
		obj1 = obj2;
		break MISSING_BLOCK_LABEL_230;
		obj1;
	//   60  115:astore_3        
		break MISSING_BLOCK_LABEL_230;
	//   61  116:goto            230
		obj;
	//   62  119:astore_2        
		obj1 = obj2;
	//   63  120:aload           4
	//   64  122:astore_3        
		obj2 = obj;
	//   65  123:aload_2         
	//   66  124:astore          4
		obj = obj1;
	//   67  126:aload_3         
	//   68  127:astore_2        
		obj3 = ((Object) (new StringBuilder()));
	//   69  128:new             #145 <Class StringBuilder>
	//   70  131:dup             
	//   71  132:invokespecial   #146 <Method void StringBuilder()>
	//   72  135:astore          6
		obj = obj1;
	//   73  137:aload_3         
	//   74  138:astore_2        
		((StringBuilder) (obj3)).append("Failed query: ");
	//   75  139:aload           6
	//   76  141:ldc1            #148 <String "Failed query: ">
	//   77  143:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   78  146:pop             
		obj = obj1;
	//   79  147:aload_3         
	//   80  148:astore_2        
		((StringBuilder) (obj3)).append(obj2);
	//   81  149:aload           6
	//   82  151:aload           4
	//   83  153:invokevirtual   #155 <Method StringBuilder StringBuilder.append(Object)>
	//   84  156:pop             
		obj = obj1;
	//   85  157:aload_3         
	//   86  158:astore_2        
		Log.w("DocumentFile", ((StringBuilder) (obj3)).toString());
	//   87  159:ldc1            #157 <String "DocumentFile">
	//   88  161:aload           6
	//   89  163:invokevirtual   #160 <Method String StringBuilder.toString()>
	//   90  166:invokestatic    #166 <Method int Log.w(String, String)>
	//   91  169:pop             
		closeQuietly(((AutoCloseable) (obj1)));
	//   92  170:aload_3         
	//   93  171:invokestatic    #143 <Method void closeQuietly(AutoCloseable)>
		obj = ((Object) ((Uri[])arraylist.toArray(((Object []) (new Uri[arraylist.size()])))));
	//   94  174:aload           5
	//   95  176:aload           5
	//   96  178:invokevirtual   #170 <Method int ArrayList.size()>
	//   97  181:anewarray       Uri[]
	//   98  184:invokevirtual   #176 <Method Object[] ArrayList.toArray(Object[])>
	//   99  187:checkcast       #178 <Class Uri[]>
	//  100  190:astore_2        
		obj1 = ((Object) (new DocumentFile[obj.length]));
	//  101  191:aload_2         
	//  102  192:arraylength     
	//  103  193:anewarray       DocumentFile[]
	//  104  196:astore_3        
		for(; i < obj.length; i++)
	//* 105  197:iload_1         
	//* 106  198:aload_2         
	//* 107  199:arraylength     
	//* 108  200:icmpge          228
			obj1[i] = ((DocumentFile) (new TreeDocumentFile(((DocumentFile) (this)), mContext, ((Uri) (obj[i])))));
	//  109  203:aload_3         
	//  110  204:iload_1         
	//  111  205:new             #2   <Class TreeDocumentFile>
	//  112  208:dup             
	//  113  209:aload_0         
	//  114  210:aload_0         
	//  115  211:getfield        #18  <Field Context mContext>
	//  116  214:aload_2         
	//  117  215:iload_1         
	//  118  216:aaload          
	//  119  217:invokespecial   #65  <Method void TreeDocumentFile(DocumentFile, Context, Uri)>
	//  120  220:aastore         

	//  121  221:iload_1         
	//  122  222:iconst_1        
	//  123  223:iadd            
	//  124  224:istore_1        
	//* 125  225:goto            197
		return ((DocumentFile []) (obj1));
	//  126  228:aload_3         
	//  127  229:areturn         
		closeQuietly(((AutoCloseable) (obj)));
	//  128  230:aload_2         
	//  129  231:invokestatic    #143 <Method void closeQuietly(AutoCloseable)>
		throw obj1;
	//  130  234:aload_3         
	//  131  235:athrow          
	}

	public boolean renameTo(String s)
	{
		try
		{
			s = ((String) (DocumentsContract.renameDocument(mContext.getContentResolver(), mUri, s)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:invokevirtual   #41  <Method ContentResolver Context.getContentResolver()>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field Uri mUri>
	//    5   11:aload_1         
	//    6   12:invokestatic    #184 <Method Uri DocumentsContract.renameDocument(ContentResolver, Uri, String)>
	//    7   15:astore_1        
		}
	//*   8   16:aload_1         
	//*   9   17:ifnull          27
	//*  10   20:aload_0         
	//*  11   21:aload_1         
	//*  12   22:putfield        #20  <Field Uri mUri>
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
