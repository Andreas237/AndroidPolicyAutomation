// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.Context;
import android.net.Uri;
import java.io.File;

// Referenced classes of package android.support.v4.provider:
//			RawDocumentFile, SingleDocumentFile, TreeDocumentFile, DocumentsContractApi21, 
//			DocumentsContractApi19

public abstract class DocumentFile
{

	DocumentFile(DocumentFile documentfile)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mParent = documentfile;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field DocumentFile mParent>
	//    5    9:return          
	}

	public static DocumentFile fromFile(File file)
	{
		return ((DocumentFile) (new RawDocumentFile(((DocumentFile) (null)), file)));
	//    0    0:new             #22  <Class RawDocumentFile>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void RawDocumentFile(DocumentFile, File)>
	//    5    9:areturn         
	}

	public static DocumentFile fromSingleUri(Context context, Uri uri)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			return ((DocumentFile) (new SingleDocumentFile(((DocumentFile) (null)), context, uri)));
	//    3    8:new             #35  <Class SingleDocumentFile>
	//    4   11:dup             
	//    5   12:aconst_null     
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #38  <Method void SingleDocumentFile(DocumentFile, Context, Uri)>
	//    9   18:areturn         
		else
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
	}

	public static DocumentFile fromTreeUri(Context context, Uri uri)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          22
			return ((DocumentFile) (new TreeDocumentFile(((DocumentFile) (null)), context, DocumentsContractApi21.prepareTreeUri(uri))));
	//    3    8:new             #41  <Class TreeDocumentFile>
	//    4   11:dup             
	//    5   12:aconst_null     
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokestatic    #47  <Method Uri DocumentsContractApi21.prepareTreeUri(Uri)>
	//    9   18:invokespecial   #48  <Method void TreeDocumentFile(DocumentFile, Context, Uri)>
	//   10   21:areturn         
		else
			return null;
	//   11   22:aconst_null     
	//   12   23:areturn         
	}

	public static boolean isDocumentUri(Context context, Uri uri)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          14
			return DocumentsContractApi19.isDocumentUri(context, uri);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokestatic    #54  <Method boolean DocumentsContractApi19.isDocumentUri(Context, Uri)>
	//    6   13:ireturn         
		else
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	public abstract boolean canRead();

	public abstract boolean canWrite();

	public abstract DocumentFile createDirectory(String s);

	public abstract DocumentFile createFile(String s, String s1);

	public abstract boolean delete();

	public abstract boolean exists();

	public DocumentFile findFile(String s)
	{
		DocumentFile adocumentfile[] = listFiles();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method DocumentFile[] listFiles()>
	//    2    4:astore          4
		int j = adocumentfile.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          45
		{
			DocumentFile documentfile = adocumentfile[i];
	//   11   17:aload           4
	//   12   19:iload_2         
	//   13   20:aaload          
	//   14   21:astore          5
			if(s.equals(((Object) (documentfile.getName()))))
	//*  15   23:aload_1         
	//*  16   24:aload           5
	//*  17   26:invokevirtual   #72  <Method String getName()>
	//*  18   29:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  19   32:ifeq            38
				return documentfile;
	//   20   35:aload           5
	//   21   37:areturn         
		}

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
	//*  26   42:goto            12
		return null;
	//   27   45:aconst_null     
	//   28   46:areturn         
	}

	public abstract String getName();

	public DocumentFile getParentFile()
	{
		return mParent;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DocumentFile mParent>
	//    2    4:areturn         
	}

	public abstract String getType();

	public abstract Uri getUri();

	public abstract boolean isDirectory();

	public abstract boolean isFile();

	public abstract boolean isVirtual();

	public abstract long lastModified();

	public abstract long length();

	public abstract DocumentFile[] listFiles();

	public abstract boolean renameTo(String s);

	static final String TAG = "DocumentFile";
	private final DocumentFile mParent;
}
