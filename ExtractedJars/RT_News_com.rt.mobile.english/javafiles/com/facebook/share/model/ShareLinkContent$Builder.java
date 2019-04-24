// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareLinkContent, ShareContent, ShareModelBuilder, ShareModel

public static final class ShareLinkContent$Builder extends ShareContent.Builder
{

	public ShareLinkContent build()
	{
		return new ShareLinkContent(this, ((ShareLinkContent._cls1) (null)));
	//    0    0:new             #7   <Class ShareLinkContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #34  <Method void ShareLinkContent(ShareLinkContent$Builder, ShareLinkContent$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method ShareLinkContent build()>
	//    2    4:areturn         
	}

	public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
	{
		return ((ShareContent.Builder) (readFrom((ShareLinkContent)sharecontent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareLinkContent>
	//    3    5:invokevirtual   #42  <Method ShareLinkContent$Builder readFrom(ShareLinkContent)>
	//    4    8:areturn         
	}

	public ShareLinkContent$Builder readFrom(Parcel parcel)
	{
		return readFrom((ShareLinkContent)parcel.readParcelable(((Class) (com/facebook/share/model/ShareLinkContent)).getClassLoader()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #7   <Class ShareLinkContent>
	//    3    4:invokevirtual   #49  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokevirtual   #55  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    5   10:checkcast       #7   <Class ShareLinkContent>
	//    6   13:invokevirtual   #42  <Method ShareLinkContent$Builder readFrom(ShareLinkContent)>
	//    7   16:areturn         
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
			return ((ShareLinkContent$Builder)super.readFrom(((ShareContent) (sharelinkcontent)))).setContentDescription(sharelinkcontent.getContentDescription()).setImageUrl(sharelinkcontent.getImageUrl()).setContentTitle(sharelinkcontent.getContentTitle());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #57  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
	//    7   11:checkcast       #2   <Class ShareLinkContent$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #61  <Method String ShareLinkContent.getContentDescription()>
	//   10   18:invokevirtual   #65  <Method ShareLinkContent$Builder setContentDescription(String)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #69  <Method Uri ShareLinkContent.getImageUrl()>
	//   13   25:invokevirtual   #73  <Method ShareLinkContent$Builder setImageUrl(Uri)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #76  <Method String ShareLinkContent.getContentTitle()>
	//   16   32:invokevirtual   #79  <Method ShareLinkContent$Builder setContentTitle(String)>
	//   17   35:areturn         
	}

	public volatile ShareModelBuilder readFrom(Parcel parcel)
	{
		return ((ShareModelBuilder) (readFrom(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method ShareLinkContent$Builder readFrom(Parcel)>
	//    3    5:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareLinkContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareLinkContent>
	//    3    5:invokevirtual   #42  <Method ShareLinkContent$Builder readFrom(ShareLinkContent)>
	//    4    8:areturn         
	}

	public ShareLinkContent$Builder setContentDescription(String s)
	{
		contentDescription = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String contentDescription>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareLinkContent$Builder setContentTitle(String s)
	{
		contentTitle = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String contentTitle>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareLinkContent$Builder setImageUrl(Uri uri)
	{
		imageUrl = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field Uri imageUrl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String contentDescription;
	private String contentTitle;
	private Uri imageUrl;


/*
	static String access$000(ShareLinkContent$Builder sharelinkcontent$builder)
	{
		return sharelinkcontent$builder.contentDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String contentDescription>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(ShareLinkContent$Builder sharelinkcontent$builder)
	{
		return sharelinkcontent$builder.contentTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String contentTitle>
	//    2    4:areturn         
	}

*/


/*
	static Uri access$200(ShareLinkContent$Builder sharelinkcontent$builder)
	{
		return sharelinkcontent$builder.imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Uri imageUrl>
	//    2    4:areturn         
	}

*/

	public ShareLinkContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void ShareContent$Builder()>
	//    2    4:return          
	}
}
