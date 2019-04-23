// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.internal:
//			LikeContent

static final class LikeContent$1
	implements android.os.ator
{

	public LikeContent createFromParcel(Parcel parcel)
	{
		return new LikeContent(parcel);
	//    0    0:new             #9   <Class LikeContent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void LikeContent(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method LikeContent createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public LikeContent[] newArray(int i)
	{
		return new LikeContent[i];
	//    0    0:iload_1         
	//    1    1:anewarray       LikeContent[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #27  <Method LikeContent[] newArray(int)>
	//    3    5:areturn         
	}

	LikeContent$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
