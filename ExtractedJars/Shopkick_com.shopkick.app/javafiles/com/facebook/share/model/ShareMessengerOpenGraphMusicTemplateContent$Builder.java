// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;

// Referenced classes of package com.facebook.share.model:
//			ShareMessengerOpenGraphMusicTemplateContent, ShareMessengerActionButton, ShareContent, ShareModel, 
//			ShareModelBuilder

public static class ShareMessengerOpenGraphMusicTemplateContent$Builder extends ShareContent.Builder
{

	public ShareMessengerOpenGraphMusicTemplateContent build()
	{
		return new ShareMessengerOpenGraphMusicTemplateContent(this, ((ShareMessengerOpenGraphMusicTemplateContent._cls1) (null)));
	//    0    0:new             #7   <Class ShareMessengerOpenGraphMusicTemplateContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #30  <Method void ShareMessengerOpenGraphMusicTemplateContent(ShareMessengerOpenGraphMusicTemplateContent$Builder, ShareMessengerOpenGraphMusicTemplateContent$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method ShareMessengerOpenGraphMusicTemplateContent build()>
	//    2    4:areturn         
	}

	public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
	{
		return ((ShareContent.Builder) (readFrom((ShareMessengerOpenGraphMusicTemplateContent)sharecontent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareMessengerOpenGraphMusicTemplateContent>
	//    3    5:invokevirtual   #38  <Method ShareMessengerOpenGraphMusicTemplateContent$Builder readFrom(ShareMessengerOpenGraphMusicTemplateContent)>
	//    4    8:areturn         
	}

	public ShareMessengerOpenGraphMusicTemplateContent$Builder readFrom(ShareMessengerOpenGraphMusicTemplateContent sharemessengeropengraphmusictemplatecontent)
	{
		if(sharemessengeropengraphmusictemplatecontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareMessengerOpenGraphMusicTemplateContent$Builder)super.readFrom(((ShareContent) (sharemessengeropengraphmusictemplatecontent)))).setUrl(sharemessengeropengraphmusictemplatecontent.getUrl()).setButton(sharemessengeropengraphmusictemplatecontent.getButton());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #40  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
	//    7   11:checkcast       #2   <Class ShareMessengerOpenGraphMusicTemplateContent$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #44  <Method Uri ShareMessengerOpenGraphMusicTemplateContent.getUrl()>
	//   10   18:invokevirtual   #48  <Method ShareMessengerOpenGraphMusicTemplateContent$Builder setUrl(Uri)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #52  <Method ShareMessengerActionButton ShareMessengerOpenGraphMusicTemplateContent.getButton()>
	//   13   25:invokevirtual   #56  <Method ShareMessengerOpenGraphMusicTemplateContent$Builder setButton(ShareMessengerActionButton)>
	//   14   28:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareMessengerOpenGraphMusicTemplateContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareMessengerOpenGraphMusicTemplateContent>
	//    3    5:invokevirtual   #38  <Method ShareMessengerOpenGraphMusicTemplateContent$Builder readFrom(ShareMessengerOpenGraphMusicTemplateContent)>
	//    4    8:areturn         
	}

	public ShareMessengerOpenGraphMusicTemplateContent$Builder setButton(ShareMessengerActionButton sharemessengeractionbutton)
	{
		button = sharemessengeractionbutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field ShareMessengerActionButton button>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerOpenGraphMusicTemplateContent$Builder setUrl(Uri uri)
	{
		url = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Uri url>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private ShareMessengerActionButton button;
	private Uri url;


/*
	static Uri access$000(ShareMessengerOpenGraphMusicTemplateContent$Builder sharemessengeropengraphmusictemplatecontent$builder)
	{
		return sharemessengeropengraphmusictemplatecontent$builder.url;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Uri url>
	//    2    4:areturn         
	}

*/


/*
	static ShareMessengerActionButton access$100(ShareMessengerOpenGraphMusicTemplateContent$Builder sharemessengeropengraphmusictemplatecontent$builder)
	{
		return sharemessengeropengraphmusictemplatecontent$builder.button;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ShareMessengerActionButton button>
	//    2    4:areturn         
	}

*/

	public ShareMessengerOpenGraphMusicTemplateContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ShareContent$Builder()>
	//    2    4:return          
	}
}
