// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareVideo, ShareMedia, ShareModelBuilder, ShareModel

public static final class ShareVideo$Builder extends ShareMedia$Builder
{

	public ShareVideo build()
	{
		return new ShareVideo(this, ((ShareVideo._cls1) (null)));
	//    0    0:new             #7   <Class ShareVideo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #24  <Method void ShareVideo(ShareVideo$Builder, ShareVideo$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method ShareVideo build()>
	//    2    4:areturn         
	}

	public volatile ShareMedia$Builder readFrom(ShareMedia sharemedia)
	{
		return ((ShareMedia$Builder) (readFrom((ShareVideo)sharemedia)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareVideo>
	//    3    5:invokevirtual   #32  <Method ShareVideo$Builder readFrom(ShareVideo)>
	//    4    8:areturn         
	}

	public volatile ShareModelBuilder readFrom(Parcel parcel)
	{
		return ((ShareModelBuilder) (readFrom(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method ShareVideo$Builder readFrom(Parcel)>
	//    3    5:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareVideo)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareVideo>
	//    3    5:invokevirtual   #32  <Method ShareVideo$Builder readFrom(ShareVideo)>
	//    4    8:areturn         
	}

	public ShareVideo$Builder readFrom(Parcel parcel)
	{
		return readFrom((ShareVideo)parcel.readParcelable(((Class) (com/facebook/share/model/ShareVideo)).getClassLoader()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #7   <Class ShareVideo>
	//    3    4:invokevirtual   #43  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokevirtual   #49  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    5   10:checkcast       #7   <Class ShareVideo>
	//    6   13:invokevirtual   #32  <Method ShareVideo$Builder readFrom(ShareVideo)>
	//    7   16:areturn         
	}

	public ShareVideo$Builder readFrom(ShareVideo sharevideo)
	{
		if(sharevideo == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareVideo$Builder)super.readFrom(((ShareMedia) (sharevideo)))).setLocalUrl(sharevideo.getLocalUrl());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #51  <Method ShareMedia$Builder ShareMedia$Builder.readFrom(ShareMedia)>
	//    7   11:checkcast       #2   <Class ShareVideo$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #55  <Method Uri ShareVideo.getLocalUrl()>
	//   10   18:invokevirtual   #59  <Method ShareVideo$Builder setLocalUrl(Uri)>
	//   11   21:areturn         
	}

	public ShareVideo$Builder setLocalUrl(Uri uri)
	{
		localUrl = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Uri localUrl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private Uri localUrl;


/*
	static Uri access$000(ShareVideo$Builder sharevideo$builder)
	{
		return sharevideo$builder.localUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Uri localUrl>
	//    2    4:areturn         
	}

*/

	public ShareVideo$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ShareMedia$Builder()>
	//    2    4:return          
	}
}
