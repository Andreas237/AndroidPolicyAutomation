// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package android.support.v4.provider:
//			DocumentFile, DocumentsContractApi19

class SingleDocumentFile extends DocumentFile
{

	SingleDocumentFile(DocumentFile documentfile, Context context, Uri uri)
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
		throw new UnsupportedOperationException();
	//    0    0:new             #35  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public DocumentFile createFile(String s, String s1)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #35  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean delete()
	{
		return DocumentsContractApi19.delete(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #43  <Method boolean DocumentsContractApi19.delete(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean exists()
	{
		return DocumentsContractApi19.exists(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #46  <Method boolean DocumentsContractApi19.exists(Context, Uri)>
	//    5   11:ireturn         
	}

	public String getName()
	{
		return DocumentsContractApi19.getName(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #51  <Method String DocumentsContractApi19.getName(Context, Uri)>
	//    5   11:areturn         
	}

	public String getType()
	{
		return DocumentsContractApi19.getType(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #54  <Method String DocumentsContractApi19.getType(Context, Uri)>
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
	//    4    8:invokestatic    #59  <Method boolean DocumentsContractApi19.isDirectory(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean isFile()
	{
		return DocumentsContractApi19.isFile(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #62  <Method boolean DocumentsContractApi19.isFile(Context, Uri)>
	//    5   11:ireturn         
	}

	public boolean isVirtual()
	{
		return DocumentsContractApi19.isVirtual(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #65  <Method boolean DocumentsContractApi19.isVirtual(Context, Uri)>
	//    5   11:ireturn         
	}

	public long lastModified()
	{
		return DocumentsContractApi19.lastModified(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #70  <Method long DocumentsContractApi19.lastModified(Context, Uri)>
	//    5   11:lreturn         
	}

	public long length()
	{
		return DocumentsContractApi19.length(mContext, mUri);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Uri mUri>
	//    4    8:invokestatic    #73  <Method long DocumentsContractApi19.length(Context, Uri)>
	//    5   11:lreturn         
	}

	public DocumentFile[] listFiles()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #35  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean renameTo(String s)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #35  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	private Context mContext;
	private Uri mUri;
}
