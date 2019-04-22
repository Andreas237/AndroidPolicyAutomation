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
	//    1    1:invokespecial   #14  <Method void ContentProvider()>
	//    2    4:return          
	}

	public static String getAttachmentUrl(String s, UUID uuid, String s1)
	{
		return String.format("%s%s/%s/%s", new Object[] {
			"content://com.facebook.app.FacebookContentProvider", s, uuid.toString(), s1
		});
	//    0    0:ldc1            #18  <String "%s%s/%s/%s">
	//    1    2:iconst_4        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #22  <String "content://com.facebook.app.FacebookContentProvider">
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:aastore         
	//   11   15:dup             
	//   12   16:iconst_2        
	//   13   17:aload_1         
	//   14   18:invokevirtual   #28  <Method String UUID.toString()>
	//   15   21:aastore         
	//   16   22:dup             
	//   17   23:iconst_3        
	//   18   24:aload_2         
	//   19   25:aastore         
	//   20   26:invokestatic    #34  <Method String String.format(String, Object[])>
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
	//    2    2:invokevirtual   #50  <Method Pair parseCallIdAndAttachmentName(Uri)>
	//    3    5:astore_1        
		if(uri == null)
			break MISSING_BLOCK_LABEL_84;
	//    4    6:aload_1         
	//    5    7:ifnull          84
		try
		{
			uri = ((Uri) (NativeAppCallAttachmentStore.openAttachment((UUID)((Pair) (uri)).first, (String)((Pair) (uri)).second)));
	//    6   10:aload_1         
	//    7   11:getfield        #56  <Field Object Pair.first>
	//    8   14:checkcast       #24  <Class UUID>
	//    9   17:aload_1         
	//   10   18:getfield        #59  <Field Object Pair.second>
	//   11   21:checkcast       #30  <Class String>
	//   12   24:invokestatic    #65  <Method java.io.File NativeAppCallAttachmentStore.openAttachment(UUID, String)>
	//   13   27:astore_1        
		}
	//*  14   28:aload_1         
	//*  15   29:ifnull          39
	//*  16   32:aload_1         
	//*  17   33:ldc1            #66  <Int 0x10000000>
	//*  18   35:invokestatic    #72  <Method ParcelFileDescriptor ParcelFileDescriptor.open(java.io.File, int)>
	//*  19   38:areturn         
	//*  20   39:new             #46  <Class FileNotFoundException>
	//*  21   42:dup             
	//*  22   43:invokespecial   #73  <Method void FileNotFoundException()>
	//*  23   46:athrow          
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//*  24   47:astore_1        
		{
			s = TAG;
	//   25   48:getstatic       #75  <Field String TAG>
	//   26   51:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   27   52:new             #77  <Class StringBuilder>
	//   28   55:dup             
	//   29   56:invokespecial   #78  <Method void StringBuilder()>
	//   30   59:astore_3        
			stringbuilder.append("Got unexpected exception:");
	//   31   60:aload_3         
	//   32   61:ldc1            #80  <String "Got unexpected exception:">
	//   33   63:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
			stringbuilder.append(((Object) (uri)));
	//   35   67:aload_3         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #87  <Method StringBuilder StringBuilder.append(Object)>
	//   38   72:pop             
			Log.e(s, stringbuilder.toString());
	//   39   73:aload_2         
	//   40   74:aload_3         
	//   41   75:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   42   78:invokestatic    #94  <Method int Log.e(String, String)>
	//   43   81:pop             
			throw uri;
	//   44   82:aload_1         
	//   45   83:athrow          
		}
		if(uri == null)
			break MISSING_BLOCK_LABEL_39;
		return ParcelFileDescriptor.open(((java.io.File) (uri)), 0x10000000);
		throw new FileNotFoundException();
		throw new FileNotFoundException();
	//   46   84:new             #46  <Class FileNotFoundException>
	//   47   87:dup             
	//   48   88:invokespecial   #73  <Method void FileNotFoundException()>
	//   49   91:athrow          
	}

	Pair parseCallIdAndAttachmentName(Uri uri)
	{
		String as[];
		String s;
		try
		{
			as = uri.getPath().substring(1).split("/");
	//    0    0:aload_1         
	//    1    1:invokevirtual   #102 <Method String Uri.getPath()>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #106 <Method String String.substring(int)>
	//    4    8:ldc1            #108 <String "/">
	//    5   10:invokevirtual   #112 <Method String[] String.split(String)>
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
	//*  15   22:ldc1            #114 <String "..">
	//*  16   24:aload_1         
	//*  17   25:invokevirtual   #118 <Method boolean String.contentEquals(CharSequence)>
	//*  18   28:ifne            53
	//*  19   31:ldc1            #114 <String "..">
	//*  20   33:aload_2         
	//*  21   34:invokevirtual   #118 <Method boolean String.contentEquals(CharSequence)>
	//*  22   37:ifne            53
	//*  23   40:new             #52  <Class Pair>
	//*  24   43:dup             
	//*  25   44:aload_1         
	//*  26   45:invokestatic    #122 <Method UUID UUID.fromString(String)>
	//*  27   48:aload_2         
	//*  28   49:invokespecial   #125 <Method void Pair(Object, Object)>
	//*  29   52:areturn         
	//*  30   53:new             #97  <Class Exception>
	//*  31   56:dup             
	//*  32   57:invokespecial   #126 <Method void Exception()>
	//*  33   60:athrow          
	//*  34   61:aconst_null     
	//*  35   62:areturn         
		// Misplaced declaration of an exception variable
		catch(Uri uri)
		{
			return null;
		}
		uri = ((Uri) (as[0]));
		s = as[1];
		if(!"..".contentEquals(((CharSequence) (uri))) && !"..".contentEquals(((CharSequence) (s))))
			return new Pair(((Object) (UUID.fromString(((String) (uri))))), ((Object) (s)));
		else
			throw new Exception();
	//*  36   63:astore_1        
	//*  37   64:goto            61
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

	private static final String TAG = "com.facebook.FacebookContentProvider";

	static 
	{
	//    0    0:return          
	}
}
