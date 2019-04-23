// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.util.Log;

// Referenced classes of package com.facebook.share.model:
//			ShareLinkContent, ShareContent, ShareModel, ShareModelBuilder

public static final class ShareLinkContent$Builder extends ShareContent.Builder
{

	public ShareLinkContent build()
	{
		return new ShareLinkContent(this, ((ShareLinkContent._cls1) (null)));
	//    0    0:new             #7   <Class ShareLinkContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #43  <Method void ShareLinkContent(ShareLinkContent$Builder, ShareLinkContent$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method ShareLinkContent build()>
	//    2    4:areturn         
	}

	public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
	{
		return ((ShareContent.Builder) (readFrom((ShareLinkContent)sharecontent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareLinkContent>
	//    3    5:invokevirtual   #51  <Method ShareLinkContent$Builder readFrom(ShareLinkContent)>
	//    4    8:areturn         
	}

	public ShareLinkContent$Builder readFrom(ShareLinkContent sharelinkcontent)
	{
		if(sharelinkcontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareLinkContent$Builder)super.readFrom(((ShareContent) (sharelinkcontent)))).setContentDescription(sharelinkcontent.getContentDescription()).setImageUrl(sharelinkcontent.getImageUrl()).setContentTitle(sharelinkcontent.getContentTitle()).setQuote(sharelinkcontent.getQuote());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #53  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
	//    7   11:checkcast       #2   <Class ShareLinkContent$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #57  <Method String ShareLinkContent.getContentDescription()>
	//   10   18:invokevirtual   #61  <Method ShareLinkContent$Builder setContentDescription(String)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #65  <Method Uri ShareLinkContent.getImageUrl()>
	//   13   25:invokevirtual   #69  <Method ShareLinkContent$Builder setImageUrl(Uri)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #72  <Method String ShareLinkContent.getContentTitle()>
	//   16   32:invokevirtual   #75  <Method ShareLinkContent$Builder setContentTitle(String)>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #78  <Method String ShareLinkContent.getQuote()>
	//   19   39:invokevirtual   #81  <Method ShareLinkContent$Builder setQuote(String)>
	//   20   42:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareLinkContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareLinkContent>
	//    3    5:invokevirtual   #51  <Method ShareLinkContent$Builder readFrom(ShareLinkContent)>
	//    4    8:areturn         
	}

	public ShareLinkContent$Builder setContentDescription(String s)
	{
		Log.w(TAG, "This method does nothing. ContentDescription is deprecated in Graph API 2.9.");
	//    0    0:getstatic       #85  <Field String TAG>
	//    1    3:ldc1            #87  <String "This method does nothing. ContentDescription is deprecated in Graph API 2.9.">
	//    2    5:invokestatic    #93  <Method int Log.w(String, String)>
	//    3    8:pop             
		return this;
	//    4    9:aload_0         
	//    5   10:areturn         
	}

	public ShareLinkContent$Builder setContentTitle(String s)
	{
		Log.w(TAG, "This method does nothing. ContentTitle is deprecated in Graph API 2.9.");
	//    0    0:getstatic       #85  <Field String TAG>
	//    1    3:ldc1            #97  <String "This method does nothing. ContentTitle is deprecated in Graph API 2.9.">
	//    2    5:invokestatic    #93  <Method int Log.w(String, String)>
	//    3    8:pop             
		return this;
	//    4    9:aload_0         
	//    5   10:areturn         
	}

	public ShareLinkContent$Builder setImageUrl(Uri uri)
	{
		Log.w(TAG, "This method does nothing. ImageUrl is deprecated in Graph API 2.9.");
	//    0    0:getstatic       #85  <Field String TAG>
	//    1    3:ldc1            #99  <String "This method does nothing. ImageUrl is deprecated in Graph API 2.9.">
	//    2    5:invokestatic    #93  <Method int Log.w(String, String)>
	//    3    8:pop             
		return this;
	//    4    9:aload_0         
	//    5   10:areturn         
	}

	public ShareLinkContent$Builder setQuote(String s)
	{
		quote = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String quote>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	static final String TAG = "ShareLinkContent$Builder";
	private String contentDescription;
	private String contentTitle;
	private Uri imageUrl;
	private String quote;

	static 
	{
	//    0    0:return          
	}


/*
	static String access$000(ShareLinkContent$Builder sharelinkcontent$builder)
	{
		return sharelinkcontent$builder.contentDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String contentDescription>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(ShareLinkContent$Builder sharelinkcontent$builder)
	{
		return sharelinkcontent$builder.contentTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String contentTitle>
	//    2    4:areturn         
	}

*/


/*
	static Uri access$200(ShareLinkContent$Builder sharelinkcontent$builder)
	{
		return sharelinkcontent$builder.imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Uri imageUrl>
	//    2    4:areturn         
	}

*/


/*
	static String access$300(ShareLinkContent$Builder sharelinkcontent$builder)
	{
		return sharelinkcontent$builder.quote;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String quote>
	//    2    4:areturn         
	}

*/

	public ShareLinkContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void ShareContent$Builder()>
	//    2    4:return          
	}
}
