// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import android.os.Parcel;
import org.parceler.IdentityCollection;

class WithdrawalDetails$$Parcelable$1
	implements android.os.Parcelable.Creator
{

	public WithdrawalDetails..Parcelable createFromParcel(Parcel parcel)
	{
		return new WithdrawalDetails..Parcelable(WithdrawalDetails..Parcelable.read(parcel, new IdentityCollection()));
	//    0    0:new             #9   <Class WithdrawalDetails$$Parcelable>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #18  <Class IdentityCollection>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void IdentityCollection()>
	//    6   12:invokestatic    #23  <Method WithdrawalDetails WithdrawalDetails$$Parcelable.read(Parcel, IdentityCollection)>
	//    7   15:invokespecial   #26  <Method void WithdrawalDetails$$Parcelable(WithdrawalDetails)>
	//    8   18:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #29  <Method WithdrawalDetails$$Parcelable createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public WithdrawalDetails..Parcelable[] newArray(int i)
	{
		return new WithdrawalDetails..Parcelable[i];
	//    0    0:iload_1         
	//    1    1:anewarray       WithdrawalDetails..Parcelable[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #34  <Method WithdrawalDetails$$Parcelable[] newArray(int)>
	//    3    5:areturn         
	}

	WithdrawalDetails$$Parcelable$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
