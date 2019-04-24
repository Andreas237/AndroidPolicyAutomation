// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package android.support.v4.provider:
//			DocumentFile, DocumentsContractApi19, DocumentsContractApi21

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

	public boolean canRead()
	{
		return DocumentsContractApi19.canRead(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #28  <Method boolean DocumentsContractApi19.canRead(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean canWrite()
	{
		return DocumentsContractApi19.canWrite(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #31  <Method boolean DocumentsContractApi19.canWrite(Context, Uri)>
	//    5   11:ireturn         
	}

	public DocumentFile createDirectory(String s)
	{
		s = ((String) (DocumentsContractApi21.createDirectory(mContext, mUri, s)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:aload_1         
	//    5    9:invokestatic    #38  <Method Uri DocumentsContractApi21.createDirectory(Context, Uri, String)>
	//    6   12:astore_1        
		if(s != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          31
			return ((DocumentFile) (new TreeDocumentFile(((DocumentFile) (this)), mContext, ((Uri) (s)))));
	//    9   17:new             #2   <Class TreeDocumentFile>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #18  <Field Context mContext>
	//   14   26:aload_1         
	//   15   27:invokespecial   #40  <Method void TreeDocumentFile(DocumentFile, Context, Uri)>
	//   16   30:areturn         
		else
			return null;
	//   17   31:aconst_null     
	//   18   32:areturn         
	}

	public DocumentFile createFile(String s, String s1)
	{
		s = ((String) (DocumentsContractApi21.createFile(mContext, mUri, s, s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #45  <Method Uri DocumentsContractApi21.createFile(Context, Uri, String, String)>
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
	//   16   28:invokespecial   #40  <Method void TreeDocumentFile(DocumentFile, Context, Uri)>
	//   17   31:areturn         
		else
			return null;
	//   18   32:aconst_null     
	//   19   33:areturn         
	}

	public boolean delete()
	{
		return DocumentsContractApi19.delete(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #48  <Method boolean DocumentsContractApi19.delete(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean exists()
	{
		return DocumentsContractApi19.exists(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #51  <Method boolean DocumentsContractApi19.exists(Context, Uri)>
	//    5   11:ireturn         
	}

	public String getName()
	{
		return DocumentsContractApi19.getName(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #56  <Method String DocumentsContractApi19.getName(Context, Uri)>
	//    5   11:areturn         
	}

	public String getType()
	{
		return DocumentsContractApi19.getType(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #59  <Method String DocumentsContractApi19.getType(Context, Uri)>
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
	//    4    8:invokestatic    #64  <Method boolean DocumentsContractApi19.isDirectory(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean isFile()
	{
		return DocumentsContractApi19.isFile(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #67  <Method boolean DocumentsContractApi19.isFile(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean isVirtual()
	{
		return DocumentsContractApi19.isVirtual(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #70  <Method boolean DocumentsContractApi19.isVirtual(Context, Uri)>
	//    5   11:ireturn         
	}

	public long lastModified()
	{
		return DocumentsContractApi19.lastModified(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #75  <Method long DocumentsContractApi19.lastModified(Context, Uri)>
	//    5   11:lreturn         
	}

	public long length()
	{
		return DocumentsContractApi19.length(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #78  <Method long DocumentsContractApi19.length(Context, Uri)>
	//    5   11:lreturn         
	}

	public DocumentFile[] listFiles()
	{
		Uri auri[] = DocumentsContractApi21.listFiles(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #83  <Method Uri[] DocumentsContractApi21.listFiles(Context, Uri)>
	//    5   11:astore_2        
		DocumentFile adocumentfile[] = new DocumentFile[auri.length];
	//    6   12:aload_2         
	//    7   13:arraylength     
	//    8   14:anewarray       DocumentFile[]
	//    9   17:astore_3        
		for(int i = 0; i < auri.length; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_1        
	//*  12   20:iload_1         
	//*  13   21:aload_2         
	//*  14   22:arraylength     
	//*  15   23:icmpge          51
			adocumentfile[i] = ((DocumentFile) (new TreeDocumentFile(((DocumentFile) (this)), mContext, auri[i])));
	//   16   26:aload_3         
	//   17   27:iload_1         
	//   18   28:new             #2   <Class TreeDocumentFile>
	//   19   31:dup             
	//   20   32:aload_0         
	//   21   33:aload_0         
	//   22   34:getfield        #18  <Field Context mContext>
	//   23   37:aload_2         
	//   24   38:iload_1         
	//   25   39:aaload          
	//   26   40:invokespecial   #40  <Method void TreeDocumentFile(DocumentFile, Context, Uri)>
	//   27   43:aastore         

	//   28   44:iload_1         
	//   29   45:iconst_1        
	//   30   46:iadd            
	//   31   47:istore_1        
	//*  32   48:goto            20
		return adocumentfile;
	//   33   51:aload_3         
	//   34   52:areturn         
	}

	public boolean renameTo(String s)
	{
		s = ((String) (DocumentsContractApi21.renameTo(mContext, mUri, s)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:aload_1         
	//    5    9:invokestatic    #87  <Method Uri DocumentsContractApi21.renameTo(Context, Uri, String)>
	//    6   12:astore_1        
		if(s != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          24
		{
			mUri = ((Uri) (s));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #20  <Field Uri mUri>
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		} else
		{
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		}
	}

	private Context mContext;
	private Uri mUri;
}
