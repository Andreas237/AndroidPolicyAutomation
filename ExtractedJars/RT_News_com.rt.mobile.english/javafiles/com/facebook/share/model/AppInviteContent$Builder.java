// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, AppInviteContent, ShareModel

public static class AppInviteContent$Builder
	implements ShareModelBuilder
{

	public AppInviteContent build()
	{
		return new AppInviteContent(this, ((AppInviteContent._cls1) (null)));
	//    0    0:new             #9   <Class AppInviteContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #30  <Method void AppInviteContent(AppInviteContent$Builder, AppInviteContent$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method AppInviteContent build()>
	//    2    4:areturn         
	}

	public AppInviteContent$Builder readFrom(Parcel parcel)
	{
		return readFrom((AppInviteContent)parcel.readParcelable(((Class) (com/facebook/share/model/AppInviteContent)).getClassLoader()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #9   <Class AppInviteContent>
	//    3    4:invokevirtual   #41  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokevirtual   #47  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    5   10:checkcast       #9   <Class AppInviteContent>
	//    6   13:invokevirtual   #50  <Method AppInviteContent$Builder readFrom(AppInviteContent)>
	//    7   16:areturn         
	}

	public AppInviteContent$Builder readFrom(AppInviteContent appinvitecontent)
	{
		if(appinvitecontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return setApplinkUrl(appinvitecontent.getApplinkUrl()).setPreviewImageUrl(appinvitecontent.getPreviewImageUrl());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #54  <Method String AppInviteContent.getApplinkUrl()>
	//    7   11:invokevirtual   #58  <Method AppInviteContent$Builder setApplinkUrl(String)>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #61  <Method String AppInviteContent.getPreviewImageUrl()>
	//   10   18:invokevirtual   #64  <Method AppInviteContent$Builder setPreviewImageUrl(String)>
	//   11   21:areturn         
	}

	public volatile ShareModelBuilder readFrom(Parcel parcel)
	{
		return ((ShareModelBuilder) (readFrom(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method AppInviteContent$Builder readFrom(Parcel)>
	//    3    5:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((AppInviteContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class AppInviteContent>
	//    3    5:invokevirtual   #50  <Method AppInviteContent$Builder readFrom(AppInviteContent)>
	//    4    8:areturn         
	}

	public AppInviteContent$Builder setApplinkUrl(String s)
	{
		applinkUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String applinkUrl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AppInviteContent$Builder setPreviewImageUrl(String s)
	{
		previewImageUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String previewImageUrl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String applinkUrl;
	private String previewImageUrl;


/*
	static String access$000(AppInviteContent$Builder appinvitecontent$builder)
	{
		return appinvitecontent$builder.applinkUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String applinkUrl>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(AppInviteContent$Builder appinvitecontent$builder)
	{
		return appinvitecontent$builder.previewImageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String previewImageUrl>
	//    2    4:areturn         
	}

*/

	public AppInviteContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
