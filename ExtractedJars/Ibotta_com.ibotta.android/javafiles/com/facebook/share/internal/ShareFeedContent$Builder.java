// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.share.model.*;

// Referenced classes of package com.facebook.share.internal:
//			ShareFeedContent

public static final class ShareFeedContent$Builder extends com.facebook.share.model.ShareContent.Builder
{

	public ShareFeedContent build()
	{
		return new ShareFeedContent(this, ((ShareFeedContent._cls1) (null)));
	//    0    0:new             #7   <Class ShareFeedContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #48  <Method void ShareFeedContent(ShareFeedContent$Builder, ShareFeedContent$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method ShareFeedContent build()>
	//    2    4:areturn         
	}

	public ShareFeedContent$Builder readFrom(ShareFeedContent sharefeedcontent)
	{
		if(sharefeedcontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareFeedContent$Builder)super.readFrom(((ShareContent) (sharefeedcontent)))).setToId(sharefeedcontent.getToId()).setLink(sharefeedcontent.getLink()).setLinkName(sharefeedcontent.getLinkName()).setLinkCaption(sharefeedcontent.getLinkCaption()).setLinkDescription(sharefeedcontent.getLinkDescription()).setPicture(sharefeedcontent.getPicture()).setMediaSource(sharefeedcontent.getMediaSource());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #56  <Method com.facebook.share.model.ShareContent$Builder com.facebook.share.model.ShareContent$Builder.readFrom(ShareContent)>
	//    7   11:checkcast       #2   <Class ShareFeedContent$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #60  <Method String ShareFeedContent.getToId()>
	//   10   18:invokevirtual   #64  <Method ShareFeedContent$Builder setToId(String)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #67  <Method String ShareFeedContent.getLink()>
	//   13   25:invokevirtual   #70  <Method ShareFeedContent$Builder setLink(String)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #73  <Method String ShareFeedContent.getLinkName()>
	//   16   32:invokevirtual   #76  <Method ShareFeedContent$Builder setLinkName(String)>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #79  <Method String ShareFeedContent.getLinkCaption()>
	//   19   39:invokevirtual   #82  <Method ShareFeedContent$Builder setLinkCaption(String)>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #85  <Method String ShareFeedContent.getLinkDescription()>
	//   22   46:invokevirtual   #88  <Method ShareFeedContent$Builder setLinkDescription(String)>
	//   23   49:aload_1         
	//   24   50:invokevirtual   #91  <Method String ShareFeedContent.getPicture()>
	//   25   53:invokevirtual   #94  <Method ShareFeedContent$Builder setPicture(String)>
	//   26   56:aload_1         
	//   27   57:invokevirtual   #97  <Method String ShareFeedContent.getMediaSource()>
	//   28   60:invokevirtual   #100 <Method ShareFeedContent$Builder setMediaSource(String)>
	//   29   63:areturn         
	}

	public volatile com.facebook.share.model.ShareContent.Builder readFrom(ShareContent sharecontent)
	{
		return ((com.facebook.share.model.ShareContent.Builder) (readFrom((ShareFeedContent)sharecontent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareFeedContent>
	//    3    5:invokevirtual   #102 <Method ShareFeedContent$Builder readFrom(ShareFeedContent)>
	//    4    8:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareFeedContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareFeedContent>
	//    3    5:invokevirtual   #102 <Method ShareFeedContent$Builder readFrom(ShareFeedContent)>
	//    4    8:areturn         
	}

	public ShareFeedContent$Builder setLink(String s)
	{
		link = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field String link>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareFeedContent$Builder setLinkCaption(String s)
	{
		linkCaption = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String linkCaption>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareFeedContent$Builder setLinkDescription(String s)
	{
		linkDescription = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String linkDescription>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareFeedContent$Builder setLinkName(String s)
	{
		linkName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String linkName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareFeedContent$Builder setMediaSource(String s)
	{
		mediaSource = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String mediaSource>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareFeedContent$Builder setPicture(String s)
	{
		picture = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String picture>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareFeedContent$Builder setToId(String s)
	{
		toId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String toId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String link;
	private String linkCaption;
	private String linkDescription;
	private String linkName;
	private String mediaSource;
	private String picture;
	private String toId;


/*
	static String access$000(ShareFeedContent$Builder sharefeedcontent$builder)
	{
		return sharefeedcontent$builder.toId;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String toId>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(ShareFeedContent$Builder sharefeedcontent$builder)
	{
		return sharefeedcontent$builder.link;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String link>
	//    2    4:areturn         
	}

*/


/*
	static String access$200(ShareFeedContent$Builder sharefeedcontent$builder)
	{
		return sharefeedcontent$builder.linkName;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String linkName>
	//    2    4:areturn         
	}

*/


/*
	static String access$300(ShareFeedContent$Builder sharefeedcontent$builder)
	{
		return sharefeedcontent$builder.linkCaption;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String linkCaption>
	//    2    4:areturn         
	}

*/


/*
	static String access$400(ShareFeedContent$Builder sharefeedcontent$builder)
	{
		return sharefeedcontent$builder.linkDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String linkDescription>
	//    2    4:areturn         
	}

*/


/*
	static String access$500(ShareFeedContent$Builder sharefeedcontent$builder)
	{
		return sharefeedcontent$builder.picture;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String picture>
	//    2    4:areturn         
	}

*/


/*
	static String access$600(ShareFeedContent$Builder sharefeedcontent$builder)
	{
		return sharefeedcontent$builder.mediaSource;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String mediaSource>
	//    2    4:areturn         
	}

*/

	public ShareFeedContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void com.facebook.share.model.ShareContent$Builder()>
	//    2    4:return          
	}
}
