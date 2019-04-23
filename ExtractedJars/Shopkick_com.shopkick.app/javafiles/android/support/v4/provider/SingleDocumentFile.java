// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

// Referenced classes of package android.support.v4.provider:
//			DocumentFile, DocumentsContractApi19

class SingleDocumentFile extends DocumentFile
{

	SingleDocumentFile(DocumentFile documentfile, Context context, Uri uri)
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

	public boolean canRead()
	{
		return DocumentsContractApi19.canRead(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #30  <Method boolean DocumentsContractApi19.canRead(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean canWrite()
	{
		return DocumentsContractApi19.canWrite(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #33  <Method boolean DocumentsContractApi19.canWrite(Context, Uri)>
	//    5   11:ireturn         
	}

	public DocumentFile createDirectory(String s)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #37  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public DocumentFile createFile(String s, String s1)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #37  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
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
	//    2    4:invokevirtual   #51  <Method android.content.ContentResolver Context.getContentResolver()>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Uri mUri>
	//    5   11:invokestatic    #57  <Method boolean DocumentsContract.deleteDocument(android.content.ContentResolver, Uri)>
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
	//    4    8:invokestatic    #60  <Method boolean DocumentsContractApi19.exists(Context, Uri)>
	//    5   11:ireturn         
	}

	public String getName()
	{
		return DocumentsContractApi19.getName(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #65  <Method String DocumentsContractApi19.getName(Context, Uri)>
	//    5   11:areturn         
	}

	public String getType()
	{
		return DocumentsContractApi19.getType(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #69  <Method String DocumentsContractApi19.getType(Context, Uri)>
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
	//    4    8:invokestatic    #74  <Method boolean DocumentsContractApi19.isDirectory(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean isFile()
	{
		return DocumentsContractApi19.isFile(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #77  <Method boolean DocumentsContractApi19.isFile(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean isVirtual()
	{
		return DocumentsContractApi19.isVirtual(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #80  <Method boolean DocumentsContractApi19.isVirtual(Context, Uri)>
	//    5   11:ireturn         
	}

	public long lastModified()
	{
		return DocumentsContractApi19.lastModified(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #85  <Method long DocumentsContractApi19.lastModified(Context, Uri)>
	//    5   11:lreturn         
	}

	public long length()
	{
		return DocumentsContractApi19.length(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Uri mUri>
	//    4    8:invokestatic    #88  <Method long DocumentsContractApi19.length(Context, Uri)>
	//    5   11:lreturn         
	}

	public DocumentFile[] listFiles()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #37  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean renameTo(String s)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #37  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private Context mContext;
	private Uri mUri;
}
