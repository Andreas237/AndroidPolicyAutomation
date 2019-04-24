// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareOpenGraphValueContainer, ShareModelBuilder

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer
{
	public static final class Builder extends ShareOpenGraphValueContainer.Builder
	{

		public ShareOpenGraphObject build()
		{
			return new ShareOpenGraphObject(this);
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

		public Builder readFrom(Parcel parcel)
		{
			return (Builder)readFrom(((ShareOpenGraphValueContainer) ((ShareOpenGraphObject)parcel.readParcelable(((Class) (com/facebook/share/model/ShareOpenGraphObject)).getClassLoader()))));
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

		public Builder()
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


	ShareOpenGraphObject(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void ShareOpenGraphValueContainer(Parcel)>
	//    3    5:return          
	}

	private ShareOpenGraphObject(Builder builder)
	{
		super(((ShareOpenGraphValueContainer.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void ShareOpenGraphValueContainer(ShareOpenGraphValueContainer$Builder)>
	//    3    5:return          
	}


	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareOpenGraphObject createFromParcel(Parcel parcel)
		{
			return new ShareOpenGraphObject(parcel);
		//    0    0:new             #9   <Class ShareOpenGraphObject>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareOpenGraphObject(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareOpenGraphObject createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareOpenGraphObject[] newArray(int i)
		{
			return new ShareOpenGraphObject[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareOpenGraphObject[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareOpenGraphObject[] newArray(int)>
		//    3    5:areturn         
		}

	}
;

	static 
	{
	//    0    0:new             #7   <Class ShareOpenGraphObject$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ShareOpenGraphObject$1()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
