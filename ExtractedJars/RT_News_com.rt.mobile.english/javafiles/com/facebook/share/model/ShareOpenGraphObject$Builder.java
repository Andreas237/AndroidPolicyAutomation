// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareOpenGraphObject, ShareModelBuilder

public static final class ShareOpenGraphObject$Builder extends Builder
{

	public ShareOpenGraphObject build()
	{
		return new ShareOpenGraphObject(this, ((ShareOpenGraphObject._cls1) (null)));
	//    0    0:new             #7   <Class ShareOpenGraphObject>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #24  <Method void ShareOpenGraphObject(ShareOpenGraphObject$Builder, ShareOpenGraphObject$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method ShareOpenGraphObject build()>
	//    2    4:areturn         
	}

	public volatile ShareModelBuilder readFrom(Parcel parcel)
	{
		return ((ShareModelBuilder) (readFrom(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method ShareOpenGraphObject$Builder readFrom(Parcel)>
	//    3    5:areturn         
	}

	public ShareOpenGraphObject$Builder readFrom(Parcel parcel)
	{
		return (ShareOpenGraphObject$Builder)readFrom(((ShareOpenGraphValueContainer) ((ShareOpenGraphObject)parcel.readParcelable(((Class) (com/facebook/share/model/ShareOpenGraphObject)).getClassLoader()))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #7   <Class ShareOpenGraphObject>
	//    3    4:invokevirtual   #38  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokevirtual   #44  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    5   10:checkcast       #7   <Class ShareOpenGraphObject>
	//    6   13:invokevirtual   #47  <Method ShareOpenGraphValueContainer$Builder readFrom(ShareOpenGraphValueContainer)>
	//    7   16:checkcast       #2   <Class ShareOpenGraphObject$Builder>
	//    8   19:areturn         
	}

	public ShareOpenGraphObject$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ShareOpenGraphValueContainer$Builder()>
		putBoolean("fbsdk:create_object", true);
	//    2    4:aload_0         
	//    3    5:ldc1            #14  <String "fbsdk:create_object">
	//    4    7:iconst_1        
	//    5    8:invokevirtual   #18  <Method ShareOpenGraphValueContainer$Builder putBoolean(String, boolean)>
	//    6   11:pop             
	//    7   12:return          
	}
}
