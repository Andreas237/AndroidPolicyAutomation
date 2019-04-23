// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;

// Referenced classes of package com.facebook.share.model:
//			ShareMessengerMediaTemplateContent, ShareMessengerActionButton, ShareContent, ShareModel, 
//			ShareModelBuilder

public static class ShareMessengerMediaTemplateContent$Builder extends ShareContent.Builder
{

	public ShareMessengerMediaTemplateContent build()
	{
		return new ShareMessengerMediaTemplateContent(this, ((ShareMessengerMediaTemplateContent._cls1) (null)));
	//    0    0:new             #7   <Class ShareMessengerMediaTemplateContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #42  <Method void ShareMessengerMediaTemplateContent(ShareMessengerMediaTemplateContent$Builder, ShareMessengerMediaTemplateContent$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method ShareMessengerMediaTemplateContent build()>
	//    2    4:areturn         
	}

	public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
	{
		return ((ShareContent.Builder) (readFrom((ShareMessengerMediaTemplateContent)sharecontent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareMessengerMediaTemplateContent>
	//    3    5:invokevirtual   #50  <Method ShareMessengerMediaTemplateContent$Builder readFrom(ShareMessengerMediaTemplateContent)>
	//    4    8:areturn         
	}

	public ShareMessengerMediaTemplateContent$Builder readFrom(ShareMessengerMediaTemplateContent sharemessengermediatemplatecontent)
	{
		if(sharemessengermediatemplatecontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareMessengerMediaTemplateContent$Builder)super.readFrom(((ShareContent) (sharemessengermediatemplatecontent)))).setMediaType(sharemessengermediatemplatecontent.getMediaType()).setAttachmentId(sharemessengermediatemplatecontent.getAttachmentId()).setMediaUrl(sharemessengermediatemplatecontent.getMediaUrl()).setButton(sharemessengermediatemplatecontent.getButton());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #52  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
	//    7   11:checkcast       #2   <Class ShareMessengerMediaTemplateContent$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #56  <Method ShareMessengerMediaTemplateContent$MediaType ShareMessengerMediaTemplateContent.getMediaType()>
	//   10   18:invokevirtual   #60  <Method ShareMessengerMediaTemplateContent$Builder setMediaType(ShareMessengerMediaTemplateContent$MediaType)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #64  <Method String ShareMessengerMediaTemplateContent.getAttachmentId()>
	//   13   25:invokevirtual   #68  <Method ShareMessengerMediaTemplateContent$Builder setAttachmentId(String)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #72  <Method Uri ShareMessengerMediaTemplateContent.getMediaUrl()>
	//   16   32:invokevirtual   #76  <Method ShareMessengerMediaTemplateContent$Builder setMediaUrl(Uri)>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #80  <Method ShareMessengerActionButton ShareMessengerMediaTemplateContent.getButton()>
	//   19   39:invokevirtual   #84  <Method ShareMessengerMediaTemplateContent$Builder setButton(ShareMessengerActionButton)>
	//   20   42:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareMessengerMediaTemplateContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareMessengerMediaTemplateContent>
	//    3    5:invokevirtual   #50  <Method ShareMessengerMediaTemplateContent$Builder readFrom(ShareMessengerMediaTemplateContent)>
	//    4    8:areturn         
	}

	public ShareMessengerMediaTemplateContent$Builder setAttachmentId(String s)
	{
		attachmentId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String attachmentId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerMediaTemplateContent$Builder setButton(ShareMessengerActionButton sharemessengeractionbutton)
	{
		button = sharemessengeractionbutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field ShareMessengerActionButton button>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerMediaTemplateContent$Builder setMediaType(e e)
	{
		mediaType = e;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field ShareMessengerMediaTemplateContent$MediaType mediaType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerMediaTemplateContent$Builder setMediaUrl(Uri uri)
	{
		mediaUrl = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field Uri mediaUrl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String attachmentId;
	private ShareMessengerActionButton button;
	private e mediaType;
	private Uri mediaUrl;


/*
	static e access$000(ShareMessengerMediaTemplateContent$Builder sharemessengermediatemplatecontent$builder)
	{
		return sharemessengermediatemplatecontent$builder.mediaType;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ShareMessengerMediaTemplateContent$MediaType mediaType>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(ShareMessengerMediaTemplateContent$Builder sharemessengermediatemplatecontent$builder)
	{
		return sharemessengermediatemplatecontent$builder.attachmentId;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String attachmentId>
	//    2    4:areturn         
	}

*/


/*
	static Uri access$200(ShareMessengerMediaTemplateContent$Builder sharemessengermediatemplatecontent$builder)
	{
		return sharemessengermediatemplatecontent$builder.mediaUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Uri mediaUrl>
	//    2    4:areturn         
	}

*/


/*
	static ShareMessengerActionButton access$300(ShareMessengerMediaTemplateContent$Builder sharemessengermediatemplatecontent$builder)
	{
		return sharemessengermediatemplatecontent$builder.button;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ShareMessengerActionButton button>
	//    2    4:areturn         
	}

*/

	public ShareMessengerMediaTemplateContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ShareContent$Builder()>
	//    2    4:return          
	}
}
