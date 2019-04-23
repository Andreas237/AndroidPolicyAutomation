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
		int i = URI_MATCHER.match(uri);
	//    0    0:getstatic       #28  <Field UriMatcher URI_MATCHER>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #58  <Method int UriMatcher.match(Uri)>
	//    3    7:istore_3        
		if(i != 1)
	//*   4    8:iload_3         
	//*   5    9:iconst_1        
	//*   6   10:icmpeq          36
			if(i != 3)
	//*   7   13:iload_3         
	//*   8   14:iconst_3        
	//*   9   15:icmpeq          29
			{
				if(i != 5)
	//*  10   18:iload_3         
	//*  11   19:iconst_5        
	//*  12   20:icmpeq          36
					return contentresolver.openInputStream(uri);
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #64  <Method InputStream ContentResolver.openInputStream(Uri)>
	//   16   28:areturn         
			} else
			{
				return openContactPhotoInputStream(contentresolver, uri);
	//   17   29:aload_0         
	//   18   30:aload_2         
	//   19   31:aload_1         
	//   20   32:invokespecial   #68  <Method InputStream openContactPhotoInputStream(ContentResolver, Uri)>
	//   21   35:areturn         
			}
		uri = android.provider.ContactsContract.Contacts.lookupContact(contentresolver, uri);
	//   22   36:aload_2         
	//   23   37:aload_1         
	//   24   38:invokestatic    #74  <Method Uri android.provider.ContactsContract$Contacts.lookupContact(ContentResolver, Uri)>
	//   25   41:astore_1        
		if(uri != null)
	//*  26   42:aload_1         
	//*  27   43:ifnull          53
			return openContactPhotoInputStream(contentresolver, uri);
	//   28   46:aload_0         
	//   29   47:aload_2         
	//   30   48:aload_1         
	//   31   49:invokespecial   #68  <Method InputStream openContactPhotoInputStream(ContentResolver, Uri)>
	//   32   52:areturn         
		else
			throw new FileNotFoundException("Contact cannot be found");
	//   33   53:new             #54  <Class FileNotFoundException>
	//   34   56:dup             
	//   35   57:ldc1            #76  <String "Contact cannot be found">
	//   36   59:invokespecial   #79  <Method void FileNotFoundException(String)>
	//   37   62:athrow          
	}

	private InputStream openContactPhotoInputStream(ContentResolver contentresolver, Uri uri)
	{
		return android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentresolver, uri, true);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #83  <Method InputStream android.provider.ContactsContract$Contacts.openContactPhotoInputStream(ContentResolver, Uri, boolean)>
	//    4    6:areturn         
	}

	protected void close(InputStream inputstream)
		throws IOException
	{
		inputstream.close();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #91  <Method void InputStream.close()>
	//    2    4:return          
	}

	protected volatile void close(Object obj)
		throws IOException
	{
		close((InputStream)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #89  <Class InputStream>
	//    3    5:invokevirtual   #94  <Method void close(InputStream)>
	//    4    8:return          
	}

	public Class getDataClass()
	{
		return java/io/InputStream;
	//    0    0:ldc1            #89  <Class InputStream>
	//    1    2:areturn         
	}

	protected InputStream loadResource(Uri uri, ContentResolver contentresolver)
		throws FileNotFoundException
	{
		contentresolver = ((ContentResolver) (loadResourceFromUri(uri, contentresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #103 <Method InputStream loadResourceFromUri(Uri, ContentResolver)>
	//    4    6:astore_2        
		if(contentresolver != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          13
		{
			return ((InputStream) (contentresolver));
	//    7   11:aload_2         
	//    8   12:areturn         
		} else
		{
			contentresolver = ((ContentResolver) (new StringBuilder()));
	//    9   13:new             #105 <Class StringBuilder>
	//   10   16:dup             
	//   11   17:invokespecial   #107 <Method void StringBuilder()>
	//   12   20:astore_2        
			((StringBuilder) (contentresolver)).append("InputStream is null for ");
	//   13   21:aload_2         
	//   14   22:ldc1            #109 <String "InputStream is null for ">
	//   15   24:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   16   27:pop             
			((StringBuilder) (contentresolver)).append(((Object) (uri)));
	//   17   28:aload_2         
	//   18   29:aload_1         
	//   19   30:invokevirtual   #116 <Method StringBuilder StringBuilder.append(Object)>
	//   20   33:pop             
			throw new FileNotFoundException(((StringBuilder) (contentresolver)).toString());
	//   21   34:new             #54  <Class FileNotFoundException>
	//   22   37:dup             
	//   23   38:aload_2         
	//   24   39:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   25   42:invokespecial   #79  <Method void FileNotFoundException(String)>
	//   26   45:athrow          
		}
	}

	protected volatile Object loadResource(Uri uri, ContentResolver contentresolver)
		throws FileNotFoundException
	{
		return ((Object) (loadResource(uri, contentresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #123 <Method InputStream loadResource(Uri, ContentResolver)>
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
