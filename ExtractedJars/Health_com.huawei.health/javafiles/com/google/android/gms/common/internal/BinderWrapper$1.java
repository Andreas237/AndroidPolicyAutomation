// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.common.internal:
//			BinderWrapper

final class BinderWrapper$1
	implements android.os.or
{

	public Object createFromParcel(Parcel parcel)
	{
		return ((Object) (zzaR(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method BinderWrapper zzaR(Parcel)>
	//    3    5:areturn         
	}

	public Object[] newArray(int i)
	{
		return ((Object []) (zzcT(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #26  <Method BinderWrapper[] zzcT(int)>
	//    3    5:areturn         
	}

	public BinderWrapper zzaR(Parcel parcel)
	{
		return new BinderWrapper(parcel, ((BinderWrapper$1) (null)));
	//    0    0:new             #9   <Class BinderWrapper>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #29  <Method void BinderWrapper(Parcel, BinderWrapper$1)>
	//    5    9:areturn         
	}

	public BinderWrapper[] zzcT(int i)
	{
		return new BinderWrapper[i];
	//    0    0:iload_1         
	//    1    1:anewarray       BinderWrapper[]
	//    2    4:areturn         
	}

	BinderWrapper$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
