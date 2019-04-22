// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, ShareHashtag, ShareModel

public static class ShareHashtag$Builder
	implements ShareModelBuilder
{

	public ShareHashtag build()
	{
		return new ShareHashtag(this, ((ShareHashtag._cls1) (null)));
	//    0    0:new             #9   <Class ShareHashtag>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #26  <Method void ShareHashtag(ShareHashtag$Builder, ShareHashtag$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method ShareHashtag build()>
	//    2    4:areturn         
	}

	ShareHashtag$Builder readFrom(Parcel parcel)
	{
		return readFrom((ShareHashtag)parcel.readParcelable(((Class) (com/facebook/share/model/ShareHashtag)).getClassLoader()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #9   <Class ShareHashtag>
	//    3    4:invokevirtual   #37  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokevirtual   #43  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    5   10:checkcast       #9   <Class ShareHashtag>
	//    6   13:invokevirtual   #46  <Method ShareHashtag$Builder readFrom(ShareHashtag)>
	//    7   16:areturn         
	}

	public ShareHashtag$Builder readFrom(ShareHashtag sharehashtag)
	{
		if(sharehashtag == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return setHashtag(sharehashtag.getHashtag());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #50  <Method String ShareHashtag.getHashtag()>
	//    7   11:invokevirtual   #54  <Method ShareHashtag$Builder setHashtag(String)>
	//    8   14:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareHashtag)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class ShareHashtag>
	//    3    5:invokevirtual   #46  <Method ShareHashtag$Builder readFrom(ShareHashtag)>
	//    4    8:areturn         
	}

	public ShareHashtag$Builder setHashtag(String s)
	{
		hashtag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String hashtag>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String hashtag;


/*
	static String access$000(ShareHashtag$Builder sharehashtag$builder)
	{
		return sharehashtag$builder.hashtag;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String hashtag>
	//    2    4:areturn         
	}

*/

	public ShareHashtag$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
