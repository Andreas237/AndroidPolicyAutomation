// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, ShareMessengerGenericTemplateElement, ShareMessengerActionButton, ShareModel

public static class ShareMessengerGenericTemplateElement$Builder
	implements ShareModelBuilder
{

	public ShareMessengerGenericTemplateElement build()
	{
		return new ShareMessengerGenericTemplateElement(this, ((ShareMessengerGenericTemplateElement._cls1) (null)));
	//    0    0:new             #9   <Class ShareMessengerGenericTemplateElement>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #46  <Method void ShareMessengerGenericTemplateElement(ShareMessengerGenericTemplateElement$Builder, ShareMessengerGenericTemplateElement$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method ShareMessengerGenericTemplateElement build()>
	//    2    4:areturn         
	}

	ShareMessengerGenericTemplateElement$Builder readFrom(Parcel parcel)
	{
		return readFrom((ShareMessengerGenericTemplateElement)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMessengerGenericTemplateElement)).getClassLoader()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #9   <Class ShareMessengerGenericTemplateElement>
	//    3    4:invokevirtual   #57  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokevirtual   #63  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    5   10:checkcast       #9   <Class ShareMessengerGenericTemplateElement>
	//    6   13:invokevirtual   #66  <Method ShareMessengerGenericTemplateElement$Builder readFrom(ShareMessengerGenericTemplateElement)>
	//    7   16:areturn         
	}

	public ShareMessengerGenericTemplateElement$Builder readFrom(ShareMessengerGenericTemplateElement sharemessengergenerictemplateelement)
	{
		if(sharemessengergenerictemplateelement == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return setTitle(ShareMessengerGenericTemplateElement.access$1000(sharemessengergenerictemplateelement)).setSubtitle(ShareMessengerGenericTemplateElement.access$900(sharemessengergenerictemplateelement)).setImageUrl(ShareMessengerGenericTemplateElement.access$800(sharemessengergenerictemplateelement)).setDefaultAction(ShareMessengerGenericTemplateElement.access$700(sharemessengergenerictemplateelement)).setButton(ShareMessengerGenericTemplateElement.access$600(sharemessengergenerictemplateelement));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokestatic    #70  <Method String ShareMessengerGenericTemplateElement.access$1000(ShareMessengerGenericTemplateElement)>
	//    7   11:invokevirtual   #74  <Method ShareMessengerGenericTemplateElement$Builder setTitle(String)>
	//    8   14:aload_1         
	//    9   15:invokestatic    #77  <Method String ShareMessengerGenericTemplateElement.access$900(ShareMessengerGenericTemplateElement)>
	//   10   18:invokevirtual   #80  <Method ShareMessengerGenericTemplateElement$Builder setSubtitle(String)>
	//   11   21:aload_1         
	//   12   22:invokestatic    #84  <Method Uri ShareMessengerGenericTemplateElement.access$800(ShareMessengerGenericTemplateElement)>
	//   13   25:invokevirtual   #88  <Method ShareMessengerGenericTemplateElement$Builder setImageUrl(Uri)>
	//   14   28:aload_1         
	//   15   29:invokestatic    #92  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.access$700(ShareMessengerGenericTemplateElement)>
	//   16   32:invokevirtual   #96  <Method ShareMessengerGenericTemplateElement$Builder setDefaultAction(ShareMessengerActionButton)>
	//   17   35:aload_1         
	//   18   36:invokestatic    #99  <Method ShareMessengerActionButton ShareMessengerGenericTemplateElement.access$600(ShareMessengerGenericTemplateElement)>
	//   19   39:invokevirtual   #102 <Method ShareMessengerGenericTemplateElement$Builder setButton(ShareMessengerActionButton)>
	//   20   42:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareMessengerGenericTemplateElement)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class ShareMessengerGenericTemplateElement>
	//    3    5:invokevirtual   #66  <Method ShareMessengerGenericTemplateElement$Builder readFrom(ShareMessengerGenericTemplateElement)>
	//    4    8:areturn         
	}

	public ShareMessengerGenericTemplateElement$Builder setButton(ShareMessengerActionButton sharemessengeractionbutton)
	{
		button = sharemessengeractionbutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field ShareMessengerActionButton button>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerGenericTemplateElement$Builder setDefaultAction(ShareMessengerActionButton sharemessengeractionbutton)
	{
		defaultAction = sharemessengeractionbutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field ShareMessengerActionButton defaultAction>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerGenericTemplateElement$Builder setImageUrl(Uri uri)
	{
		imageUrl = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field Uri imageUrl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerGenericTemplateElement$Builder setSubtitle(String s)
	{
		subtitle = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String subtitle>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareMessengerGenericTemplateElement$Builder setTitle(String s)
	{
		title = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String title>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private ShareMessengerActionButton button;
	private ShareMessengerActionButton defaultAction;
	private Uri imageUrl;
	private String subtitle;
	private String title;


/*
	static String access$000(ShareMessengerGenericTemplateElement$Builder sharemessengergenerictemplateelement$builder)
	{
		return sharemessengergenerictemplateelement$builder.title;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String title>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(ShareMessengerGenericTemplateElement$Builder sharemessengergenerictemplateelement$builder)
	{
		return sharemessengergenerictemplateelement$builder.subtitle;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String subtitle>
	//    2    4:areturn         
	}

*/


/*
	static Uri access$200(ShareMessengerGenericTemplateElement$Builder sharemessengergenerictemplateelement$builder)
	{
		return sharemessengergenerictemplateelement$builder.imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Uri imageUrl>
	//    2    4:areturn         
	}

*/


/*
	static ShareMessengerActionButton access$300(ShareMessengerGenericTemplateElement$Builder sharemessengergenerictemplateelement$builder)
	{
		return sharemessengergenerictemplateelement$builder.defaultAction;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ShareMessengerActionButton defaultAction>
	//    2    4:areturn         
	}

*/


/*
	static ShareMessengerActionButton access$400(ShareMessengerGenericTemplateElement$Builder sharemessengergenerictemplateelement$builder)
	{
		return sharemessengergenerictemplateelement$builder.button;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ShareMessengerActionButton button>
	//    2    4:areturn         
	}

*/

	public ShareMessengerGenericTemplateElement$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}
}
