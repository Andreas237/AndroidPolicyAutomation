// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareLinkContent

static final class ShareLinkContent$1
	implements android.os.Parcelable$Creator
{

	public ShareLinkContent createFromParcel(Parcel parcel)
	{
		return new ShareLinkContent(parcel);
	//    0    0:new             #9   <Class ShareLinkContent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void ShareLinkContent(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method ShareLinkContent createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ShareLinkContent[] newArray(int i)
	{
		return new ShareLinkContent[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ShareLinkContent[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #27  <Method ShareLinkContent[] newArray(int)>
	//    3    5:areturn         
	}

	ShareLinkContent$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
