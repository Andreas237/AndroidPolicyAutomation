// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//			ShareMessengerGenericTemplateContent, ShareMessengerGenericTemplateElement, ShareContent, ShareModel, 
//			ShareModelBuilder

public static class ShareMessengerGenericTemplateContent$Builder extends ShareContent.Builder
{

	public ShareMessengerGenericTemplateContent build()
	{
		return new ShareMessengerGenericTemplateContent(this);
	//    0    0:new             #7   <Class ShareMessengerGenericTemplateContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void ShareMessengerGenericTemplateContent(ShareMessengerGenericTemplateContent$Builder)>
	//    4    8:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method ShareMessengerGenericTemplateContent build()>
	//    2    4:areturn         
	}

	public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
	{
		return ((ShareContent.Builder) (readFrom((ShareMessengerGenericTemplateContent)sharecontent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareMessengerGenericTemplateContent>
	//    3    5:invokevirtual   #44  <Method ShareMessengerGenericTemplateContent$Builder readFrom(ShareMessengerGenericTemplateContent)>
	//    4    8:areturn         
	}

	public ShareMessengerGenericTemplateContent$Builder readFrom(ShareMessengerGenericTemplateContent sharemessengergenerictemplatecontent)
	{
		if(sharemessengergenerictemplatecontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareMessengerGenericTemplateContent$Builder)super.readFrom(((ShareContent) (sharemessengergenerictemplatecontent)))).setIsSharable(sharemessengergenerictemplatecontent.getIsSharable()).setImageAspectRatio(sharemessengergenerictemplatecontent.getImageAspectRatio()).setGenericTemplateElement(sharemessengergenerictemplatecontent.getGenericTemplateElement());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #46  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
	//    7   11:checkcast       #2   <Class ShareMessengerGenericTemplateContent$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #50  <Method boolean ShareMessengerGenericTemplateContent.getIsSharable()>
	//   10   18:invokevirtual   #54  <Method ShareMessengerGenericTemplateContent$Builder setIsSharable(boolean)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #58  <Method ShareMessengerGenericTemplateContent$ImageAspectRatio ShareMessengerGenericTemplateContent.getImageAspectRatio()>
	//   13   25:invokevirtual   #62  <Method ShareMessengerGenericTemplateContent$Builder setImageAspectRatio(ShareMessengerGenericTemplateContent$ImageAspectRatio)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #66  <Method ShareMessengerGenericTemplateElement ShareMessengerGenericTemplateContent.getGenericTemplateElement()>
	//   16   32:invokevirtual   #70  <Method ShareMessengerGenericTemplateContent$Builder setGenericTemplateElement(ShareMessengerGenericTemplateElement)>
	//   17   35:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareMessengerGenericTemplateContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareMessengerGenericTemplateContent>
	//    3    5:invokevirtual   #44  <Method ShareMessengerGenericTemplateContent$Builder readFrom(ShareMessengerGenericTemplateContent)>
	//    4    8:areturn         
	}

	public ShareMessengerGenericTemplateContent$Builder setGenericTemplateElement(ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
	{
		genericTemplateElement = sharemessengergenerictemplateelement;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field ShareMessengerGenericTemplateElement genericTemplateElement>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerGenericTemplateContent$Builder setImageAspectRatio(ectRatio ectratio)
	{
		imageAspectRatio = ectratio;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio imageAspectRatio>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerGenericTemplateContent$Builder setIsSharable(boolean flag)
	{
		isSharable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field boolean isSharable>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private ShareMessengerGenericTemplateElement genericTemplateElement;
	private ectRatio imageAspectRatio;
	private boolean isSharable;


/*
	static boolean access$000(ShareMessengerGenericTemplateContent$Builder sharemessengergenerictemplatecontent$builder)
	{
		return sharemessengergenerictemplatecontent$builder.isSharable;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field boolean isSharable>
	//    2    4:ireturn         
	}

*/


/*
	static ectRatio access$100(ShareMessengerGenericTemplateContent$Builder sharemessengergenerictemplatecontent$builder)
	{
		return sharemessengergenerictemplatecontent$builder.imageAspectRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ShareMessengerGenericTemplateContent$ImageAspectRatio imageAspectRatio>
	//    2    4:areturn         
	}

*/


/*
	static ShareMessengerGenericTemplateElement access$200(ShareMessengerGenericTemplateContent$Builder sharemessengergenerictemplatecontent$builder)
	{
		return sharemessengergenerictemplatecontent$builder.genericTemplateElement;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ShareMessengerGenericTemplateElement genericTemplateElement>
	//    2    4:areturn         
	}

*/

	public ShareMessengerGenericTemplateContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ShareContent$Builder()>
	//    2    4:return          
	}
}
