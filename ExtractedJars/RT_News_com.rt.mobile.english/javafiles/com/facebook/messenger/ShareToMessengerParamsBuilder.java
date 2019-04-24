// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.messenger;

import android.net.Uri;

// Referenced classes of package com.facebook.messenger:
//			ShareToMessengerParams

public class ShareToMessengerParamsBuilder
{

	ShareToMessengerParamsBuilder(Uri uri, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mUri = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Uri mUri>
		mMimeType = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String mMimeType>
	//    8   14:return          
	}

	public ShareToMessengerParams build()
	{
		return new ShareToMessengerParams(this);
	//    0    0:new             #24  <Class ShareToMessengerParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #27  <Method void ShareToMessengerParams(ShareToMessengerParamsBuilder)>
	//    4    8:areturn         
	}

	public Uri getExternalUri()
	{
		return mExternalUri;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Uri mExternalUri>
	//    2    4:areturn         
	}

	public String getMetaData()
	{
		return mMetaData;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String mMetaData>
	//    2    4:areturn         
	}

	public String getMimeType()
	{
		return mMimeType;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String mMimeType>
	//    2    4:areturn         
	}

	public Uri getUri()
	{
		return mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Uri mUri>
	//    2    4:areturn         
	}

	public ShareToMessengerParamsBuilder setExternalUri(Uri uri)
	{
		mExternalUri = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field Uri mExternalUri>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareToMessengerParamsBuilder setMetaData(String s)
	{
		mMetaData = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String mMetaData>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private Uri mExternalUri;
	private String mMetaData;
	private final String mMimeType;
	private final Uri mUri;
}
