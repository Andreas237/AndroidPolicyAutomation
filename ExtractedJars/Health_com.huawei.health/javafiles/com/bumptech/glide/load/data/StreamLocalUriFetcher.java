// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.*;

// Referenced classes of package com.bumptech.glide.load.data:
//			LocalUriFetcher

public class StreamLocalUriFetcher extends LocalUriFetcher
{

	public StreamLocalUriFetcher(ContentResolver contentresolver, Uri uri)
	{
		super(contentresolver, uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #50  <Method void LocalUriFetcher(ContentResolver, Uri)>
	//    4    6:return          
	}

	private InputStream loadResourceFromUri(Uri uri, ContentResolver contentresolver)
		throws FileNotFoundException
	{
		switch(URI_MATCHER.match(uri))
	//*   0    0:getstatic       #28  <Field UriMatcher URI_MATCHER>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #58  <Method int UriMatcher.match(Uri)>
		{
	//*   3    7:tableswitch     -1 5: default 48
	//	               -1 85
	//	               0 85
	//	               1 58
	//	               2 85
	//	               3 51
	//	               4 85
	//	               5 58
	//*   4   48:goto            85
		case 3: // '\003'
			return openContactPhotoInputStream(contentresolver, uri);
	//    5   51:aload_0         
	//    6   52:aload_2         
	//    7   53:aload_1         
	//    8   54:invokespecial   #62  <Method InputStream openContactPhotoInputStream(ContentResolver, Uri)>
	//    9   57:areturn         

		case 1: // '\001'
		case 5: // '\005'
			uri = android.provider.ContactsContract.Contacts.lookupContact(contentresolver, uri);
	//   10   58:aload_2         
	//   11   59:aload_1         
	//   12   60:invokestatic    #68  <Method Uri android.provider.ContactsContract$Contacts.lookupContact(ContentResolver, Uri)>
	//   13   63:astore_1        
			if(uri == null)
	//*  14   64:aload_1         
	//*  15   65:ifnonnull       78
				throw new FileNotFoundException("Contact cannot be found");
	//   16   68:new             #54  <Class FileNotFoundException>
	//   17   71:dup             
	//   18   72:ldc1            #70  <String "Contact cannot be found">
	//   19   74:invokespecial   #73  <Method void FileNotFoundException(String)>
	//   20   77:athrow          
			else
				return openContactPhotoInputStream(contentresolver, uri);
	//   21   78:aload_0         
	//   22   79:aload_2         
	//   23   80:aload_1         
	//   24   81:invokespecial   #62  <Method InputStream openContactPhotoInputStream(ContentResolver, Uri)>
	//   25   84:areturn         
		}
		return contentresolver.openInputStream(uri);
	//   26   85:aload_2         
	//   27   86:aload_1         
	//   28   87:invokevirtual   #79  <Method InputStream ContentResolver.openInputStream(Uri)>
	//   29   90:areturn         
	}

	private InputStream openContactPhotoInputStream(ContentResolver contentresolver, Uri uri)
	{
		return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, uri, true);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #86  <Method InputStream android.provider.ContactsContract$Contacts.openContactPhotoInputStream(ContentResolver, Uri, boolean)>
	//    4    6:areturn         
	}

	protected void close(InputStream inputstream)
		throws IOException
	{
		inputstream.close();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #95  <Method void InputStream.close()>
	//    2    4:return          
	}

	protected volatile void close(Object obj)
		throws IOException
	{
		close((InputStream)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #93  <Class InputStream>
	//    3    5:invokevirtual   #98  <Method void close(InputStream)>
	//    4    8:return          
	}

	public Class getDataClass()
	{
		return java/io/InputStream;
	//    0    0:ldc1            #93  <Class InputStream>
	//    1    2:areturn         
	}

	protected InputStream loadResource(Uri uri, ContentResolver contentresolver)
		throws FileNotFoundException
	{
		contentresolver = ((ContentResolver) (loadResourceFromUri(uri, contentresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #106 <Method InputStream loadResourceFromUri(Uri, ContentResolver)>
	//    4    6:astore_2        
		if(contentresolver == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       38
			throw new FileNotFoundException((new StringBuilder()).append("InputStream is null for ").append(((Object) (uri))).toString());
	//    7   11:new             #54  <Class FileNotFoundException>
	//    8   14:dup             
	//    9   15:new             #108 <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #110 <Method void StringBuilder()>
	//   12   22:ldc1            #112 <String "InputStream is null for ">
	//   13   24:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:aload_1         
	//   15   28:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   17   34:invokespecial   #73  <Method void FileNotFoundException(String)>
	//   18   37:athrow          
		else
			return ((InputStream) (contentresolver));
	//   19   38:aload_2         
	//   20   39:areturn         
	}

	protected volatile Object loadResource(Uri uri, ContentResolver contentresolver)
		throws FileNotFoundException
	{
		return ((Object) (loadResource(uri, contentresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #126 <Method InputStream loadResource(Uri, ContentResolver)>
	//    4    6:areturn         
	}

	private static final int ID_CONTACTS_CONTACT = 3;
	private static final int ID_CONTACTS_LOOKUP = 1;
	private static final int ID_CONTACTS_PHOTO = 4;
	private static final int ID_CONTACTS_THUMBNAIL = 2;
	private static final int ID_LOOKUP_BY_PHONE = 5;
	private static final UriMatcher URI_MATCHER;

	static 
	{
		URI_MATCHER = new UriMatcher(-1);
	//    0    0:new             #22  <Class UriMatcher>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:invokespecial   #26  <Method void UriMatcher(int)>
	//    4    8:putstatic       #28  <Field UriMatcher URI_MATCHER>
		URI_MATCHER.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
	//    5   11:getstatic       #28  <Field UriMatcher URI_MATCHER>
	//    6   14:ldc1            #30  <String "com.android.contacts">
	//    7   16:ldc1            #32  <String "contacts/lookup/*/#">
	//    8   18:iconst_1        
	//    9   19:invokevirtual   #36  <Method void UriMatcher.addURI(String, String, int)>
		URI_MATCHER.addURI("com.android.contacts", "contacts/lookup/*", 1);
	//   10   22:getstatic       #28  <Field UriMatcher URI_MATCHER>
	//   11   25:ldc1            #30  <String "com.android.contacts">
	//   12   27:ldc1            #38  <String "contacts/lookup/*">
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #36  <Method void UriMatcher.addURI(String, String, int)>
		URI_MATCHER.addURI("com.android.contacts", "contacts/#/photo", 2);
	//   15   33:getstatic       #28  <Field UriMatcher URI_MATCHER>
	//   16   36:ldc1            #30  <String "com.android.contacts">
	//   17   38:ldc1            #40  <String "contacts/#/photo">
	//   18   40:iconst_2        
	//   19   41:invokevirtual   #36  <Method void UriMatcher.addURI(String, String, int)>
		URI_MATCHER.addURI("com.android.contacts", "contacts/#", 3);
	//   20   44:getstatic       #28  <Field UriMatcher URI_MATCHER>
	//   21   47:ldc1            #30  <String "com.android.contacts">
	//   22   49:ldc1            #42  <String "contacts/#">
	//   23   51:iconst_3        
	//   24   52:invokevirtual   #36  <Method void UriMatcher.addURI(String, String, int)>
		URI_MATCHER.addURI("com.android.contacts", "contacts/#/display_photo", 4);
	//   25   55:getstatic       #28  <Field UriMatcher URI_MATCHER>
	//   26   58:ldc1            #30  <String "com.android.contacts">
	//   27   60:ldc1            #44  <String "contacts/#/display_photo">
	//   28   62:iconst_4        
	//   29   63:invokevirtual   #36  <Method void UriMatcher.addURI(String, String, int)>
		URI_MATCHER.addURI("com.android.contacts", "phone_lookup/*", 5);
	//   30   66:getstatic       #28  <Field UriMatcher URI_MATCHER>
	//   31   69:ldc1            #30  <String "com.android.contacts">
	//   32   71:ldc1            #46  <String "phone_lookup/*">
	//   33   73:iconst_5        
	//   34   74:invokevirtual   #36  <Method void UriMatcher.addURI(String, String, int)>
	//*  35   77:return          
	}
}
