// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, ShareMessengerActionButton, ShareModel

public static abstract class ShareMessengerActionButton$Builder
	implements ShareModelBuilder
{

	public ShareMessengerActionButton$Builder readFrom(ShareMessengerActionButton sharemessengeractionbutton)
	{
		if(sharemessengeractionbutton == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return setTitle(sharemessengeractionbutton.getTitle());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #27  <Method String ShareMessengerActionButton.getTitle()>
	//    7   11:invokevirtual   #31  <Method ShareMessengerActionButton$Builder setTitle(String)>
	//    8   14:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareMessengerActionButton)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class ShareMessengerActionButton>
	//    3    5:invokevirtual   #36  <Method ShareMessengerActionButton$Builder readFrom(ShareMessengerActionButton)>
	//    4    8:areturn         
	}

	public ShareMessengerActionButton$Builder setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String title>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String title;


/*
	static String access$000(ShareMessengerActionButton$Builder sharemessengeractionbutton$builder)
	{
		return sharemessengeractionbutton$builder.title;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String title>
	//    2    4:areturn         
	}

*/

	public ShareMessengerActionButton$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
