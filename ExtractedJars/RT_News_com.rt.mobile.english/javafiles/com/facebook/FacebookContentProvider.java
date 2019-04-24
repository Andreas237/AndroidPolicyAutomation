// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.NativeAppCallAttachmentStore;
import java.io.FileNotFoundException;
import java.util.UUID;

public class FacebookContentProvider extends ContentProvider
{

	public FacebookContentProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void ContentProvider()>
	//    2    4:return          
	}

	public static String getAttachmentUrl(String s, UUID uuid, String s1)
	{
		return String.format("%s%s/%s/%s", new Object[] {
			"content://com.facebook.app.FacebookContentProvider", s, uuid.toString(), s1
		});
	//    0    0:ldc1            #21  <String "%s%s/%s/%s">
	//    1    2:iconst_4        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #8   <String "content://com.facebook.app.FacebookContentProvider">
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:aastore         
	//   11   15:dup             
	//   12   16:iconst_2        
	//   13   17:aload_1         
	//   14   18:invokevirtual   #29  <Method String UUID.toString()>
	//   15   21:aastore         
	//   16   22:dup             
	//   17   23:iconst_3        
	//   18   24:aload_2         
	//   19   25:aastore         
	//   20   26:invokestatic    #35  <Method String String.format(String, Object[])>
	//   21   29:areturn         
	}

	public int delete(Uri uri, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getType(Uri uri)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Uri insert(Uri uri, ContentValues contentvalues)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean onCreate()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public ParcelFileDescriptor openFile(Uri uri, String s)
		throws FileNotFoundException
	{
		uri = ((Uri) (parseCallIdAndAttachmentName(uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method Pair parseCallIdAndAttachmentName(Uri)>
	//    3    5:astore_1        
		if(uri == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       18
			throw new FileNotFoundException();
	//    6   10:new             #47  <Class FileNotFoundException>
	//    7   13:dup             
	//    8   14:invokespecial   #52  <Method void FileNotFoundException()>
	//    9   17:athrow          
		try
		{
			uri = ((Uri) (ParcelFileDescriptor.open(NativeAppCallAttachmentStore.openAttachment((UUID)((Pair) (uri)).first, (String)((Pair) (uri)).second), 0x10000000)));
	//   10   18:aload_1         
	//   11   19:getfield        #58  <Field Object Pair.first>
	//   12   22:checkcast       #25  <Class UUID>
	//   13   25:aload_1         
	//   14   26:getfield        #61  <Field Object Pair.second>
	//   15   29:checkcast       #31  <Class String>
	//   16   32:invokestatic    #67  <Method java.io.File NativeAppCallAttachmentStore.openAttachment(UUID, String)>
	//   17   35:ldc1            #68  <Int 0x10000000>
	//   18   37:invokestatic    #74  <Method ParcelFileDescriptor ParcelFileDescriptor.open(java.io.File, int)>
	//   19   40:astore_1        
		}
	//*  20   41:aload_1         
	//*  21   42:areturn         
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*  22   43:astore_1        
		{
			s = TAG;
	//   23   44:getstatic       #76  <Field String TAG>
	//   24   47:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   25   48:new             #78  <Class StringBuilder>
	//   26   51:dup             
	//   27   52:invokespecial   #79  <Method void StringBuilder()>
	//   28   55:astore_3        
			stringbuilder.append("Got unexpected exception:");
	//   29   56:aload_3         
	//   30   57:ldc1            #81  <String "Got unexpected exception:">
	//   31   59:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
			stringbuilder.append(((Object) (uri)));
	//   33   63:aload_3         
	//   34   64:aload_1         
	//   35   65:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   36   68:pop             
			Log.e(s, stringbuilder.toString());
	//   37   69:aload_2         
	//   38   70:aload_3         
	//   39   71:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   40   74:invokestatic    #95  <Method int Log.e(String, String)>
	//   41   77:pop             
			throw uri;
	//   42   78:aload_1         
	//   43   79:athrow          
		}
		return ((ParcelFileDescriptor) (uri));
	}

	Pair parseCallIdAndAttachmentName(Uri uri)
	{
		String as[];
		String s;
		try
		{
			as = uri.getPath().substring(1).split("/");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #103 <Method String Uri.getPath()>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #107 <Method String String.substring(int)>
	//    4    8:ldc1            #109 <String "/">
	//    5   10:invokevirtual   #113 <Method String[] String.split(String)>
	//    6   13:astore_2        
		}
	//*   7   14:aload_2         
	//*   8   15:iconst_0        
	//*   9   16:aaload          
	//*  10   17:astore_1        
	//*  11   18:aload_2         
	//*  12   19:iconst_1        
	//*  13   20:aaload          
	//*  14   21:astore_2        
	//*  15   22:new             #54  <Class Pair>
	//*  16   25:dup             
	//*  17   26:aload_1         
	//*  18   27:invokestatic    #117 <Method UUID UUID.fromString(String)>
	//*  19   30:aload_2         
	//*  20   31:invokespecial   #120 <Method void Pair(Object, Object)>
	//*  21   34:astore_1        
	//*  22   35:aload_1         
	//*  23   36:areturn         
	//*  24   37:aconst_null     
	//*  25   38:areturn         
		// Misplaced declaration of an exception variable
		catch(Uri uri)
		{
			return null;
		}
		uri = ((Uri) (as[0]));
		s = as[1];
		uri = ((Uri) (new Pair(((Object) (UUID.fromString(((String) (uri))))), ((Object) (s)))));
		return ((Pair) (uri));
	//*  26   39:astore_1        
	//*  27   40:goto            37
	}

	public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int update(Uri uri, ContentValues contentvalues, String s, String as[])
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final String ATTACHMENT_URL_BASE = "content://com.facebook.app.FacebookContentProvider";
	private static final String TAG = "com.facebook.FacebookContentProvider";

	static 
	{
	//    0    0:return          
	}
}
