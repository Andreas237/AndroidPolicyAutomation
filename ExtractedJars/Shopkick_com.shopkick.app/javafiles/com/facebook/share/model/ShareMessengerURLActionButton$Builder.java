// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;

// Referenced classes of package com.facebook.share.model:
//			ShareMessengerURLActionButton, ShareMessengerActionButton, ShareModel, ShareModelBuilder

public static final class ShareMessengerURLActionButton$Builder extends ShareMessengerActionButton.Builder
{

	public ShareMessengerURLActionButton build()
	{
		return new ShareMessengerURLActionButton(this, ((ShareMessengerURLActionButton._cls1) (null)));
	//    0    0:new             #7   <Class ShareMessengerURLActionButton>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #44  <Method void ShareMessengerURLActionButton(ShareMessengerURLActionButton$Builder, ShareMessengerURLActionButton$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method ShareMessengerURLActionButton build()>
	//    2    4:areturn         
	}

	public volatile ShareMessengerActionButton.Builder readFrom(ShareMessengerActionButton sharemessengeractionbutton)
	{
		return ((ShareMessengerActionButton.Builder) (readFrom((ShareMessengerURLActionButton)sharemessengeractionbutton)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareMessengerURLActionButton>
	//    3    5:invokevirtual   #52  <Method ShareMessengerURLActionButton$Builder readFrom(ShareMessengerURLActionButton)>
	//    4    8:areturn         
	}

	public ShareMessengerURLActionButton$Builder readFrom(ShareMessengerURLActionButton sharemessengerurlactionbutton)
	{
		if(sharemessengerurlactionbutton == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return setUrl(sharemessengerurlactionbutton.getUrl()).setIsMessengerExtensionURL(sharemessengerurlactionbutton.getIsMessengerExtensionURL()).setFallbackUrl(sharemessengerurlactionbutton.getFallbackUrl()).setWebviewHeightRatio(sharemessengerurlactionbutton.getWebviewHeightRatio()).setShouldHideWebviewShareButton(sharemessengerurlactionbutton.getShouldHideWebviewShareButton());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #56  <Method Uri ShareMessengerURLActionButton.getUrl()>
	//    7   11:invokevirtual   #60  <Method ShareMessengerURLActionButton$Builder setUrl(Uri)>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #64  <Method boolean ShareMessengerURLActionButton.getIsMessengerExtensionURL()>
	//   10   18:invokevirtual   #68  <Method ShareMessengerURLActionButton$Builder setIsMessengerExtensionURL(boolean)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #71  <Method Uri ShareMessengerURLActionButton.getFallbackUrl()>
	//   13   25:invokevirtual   #74  <Method ShareMessengerURLActionButton$Builder setFallbackUrl(Uri)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #78  <Method ShareMessengerURLActionButton$WebviewHeightRatio ShareMessengerURLActionButton.getWebviewHeightRatio()>
	//   16   32:invokevirtual   #82  <Method ShareMessengerURLActionButton$Builder setWebviewHeightRatio(ShareMessengerURLActionButton$WebviewHeightRatio)>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #85  <Method boolean ShareMessengerURLActionButton.getShouldHideWebviewShareButton()>
	//   19   39:invokevirtual   #88  <Method ShareMessengerURLActionButton$Builder setShouldHideWebviewShareButton(boolean)>
	//   20   42:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareMessengerURLActionButton)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareMessengerURLActionButton>
	//    3    5:invokevirtual   #52  <Method ShareMessengerURLActionButton$Builder readFrom(ShareMessengerURLActionButton)>
	//    4    8:areturn         
	}

	public ShareMessengerURLActionButton$Builder setFallbackUrl(Uri uri)
	{
		fallbackUrl = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field Uri fallbackUrl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerURLActionButton$Builder setIsMessengerExtensionURL(boolean flag)
	{
		isMessengerExtensionURL = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field boolean isMessengerExtensionURL>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerURLActionButton$Builder setShouldHideWebviewShareButton(boolean flag)
	{
		shouldHideWebviewShareButton = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #39  <Field boolean shouldHideWebviewShareButton>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerURLActionButton$Builder setUrl(Uri uri)
	{
		url = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Uri url>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerURLActionButton$Builder setWebviewHeightRatio(eightRatio eightratio)
	{
		webviewHeightRatio = eightratio;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field ShareMessengerURLActionButton$WebviewHeightRatio webviewHeightRatio>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private Uri fallbackUrl;
	private boolean isMessengerExtensionURL;
	private boolean shouldHideWebviewShareButton;
	private Uri url;
	private eightRatio webviewHeightRatio;


/*
	static Uri access$000(ShareMessengerURLActionButton$Builder sharemessengerurlactionbutton$builder)
	{
		return sharemessengerurlactionbutton$builder.url;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Uri url>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$100(ShareMessengerURLActionButton$Builder sharemessengerurlactionbutton$builder)
	{
		return sharemessengerurlactionbutton$builder.isMessengerExtensionURL;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean isMessengerExtensionURL>
	//    2    4:ireturn         
	}

*/


/*
	static Uri access$200(ShareMessengerURLActionButton$Builder sharemessengerurlactionbutton$builder)
	{
		return sharemessengerurlactionbutton$builder.fallbackUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Uri fallbackUrl>
	//    2    4:areturn         
	}

*/


/*
	static eightRatio access$300(ShareMessengerURLActionButton$Builder sharemessengerurlactionbutton$builder)
	{
		return sharemessengerurlactionbutton$builder.webviewHeightRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ShareMessengerURLActionButton$WebviewHeightRatio webviewHeightRatio>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$400(ShareMessengerURLActionButton$Builder sharemessengerurlactionbutton$builder)
	{
		return sharemessengerurlactionbutton$builder.shouldHideWebviewShareButton;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean shouldHideWebviewShareButton>
	//    2    4:ireturn         
	}

*/

	public ShareMessengerURLActionButton$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ShareMessengerActionButton$Builder()>
	//    2    4:return          
	}
}
