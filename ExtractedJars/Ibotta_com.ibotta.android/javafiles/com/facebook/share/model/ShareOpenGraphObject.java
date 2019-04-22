// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareOpenGraphValueContainer

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer
{

	ShareOpenGraphObject(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void ShareOpenGraphValueContainer(Parcel)>
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
	//    2    4:invokespecial   #15  <Method void ShareOpenGraphObject$1()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
