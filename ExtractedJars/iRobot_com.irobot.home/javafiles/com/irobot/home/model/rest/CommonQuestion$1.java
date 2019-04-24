// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model.rest;

import android.os.Parcel;

// Referenced classes of package com.irobot.home.model.rest:
//			CommonQuestion

static final class CommonQuestion$1
	implements android.os.r
{

	public CommonQuestion createFromParcel(Parcel parcel)
	{
		return new CommonQuestion(parcel);
	//    0    0:new             #9   <Class CommonQuestion>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #19  <Method void CommonQuestion(Parcel)>
	//    4    8:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method CommonQuestion createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public CommonQuestion[] newArray(int i)
	{
		return new CommonQuestion[i];
	//    0    0:iload_1         
	//    1    1:anewarray       CommonQuestion[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #27  <Method CommonQuestion[] newArray(int)>
	//    3    5:areturn         
	}

	CommonQuestion$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
