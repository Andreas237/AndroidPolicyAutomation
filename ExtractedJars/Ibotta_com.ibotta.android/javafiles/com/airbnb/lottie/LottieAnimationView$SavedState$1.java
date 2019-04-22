// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.os.Parcel;

// Referenced classes of package com.airbnb.lottie:
//			LottieAnimationView

static final class LottieAnimationView$SavedState$1
	implements android.os.Parcelable.Creator
{

	public LottieAnimationView.SavedState createFromParcel(Parcel parcel)
	{
		return new LottieAnimationView.SavedState(parcel, ((LottieAnimationView._cls1) (null)));
	//    0    0:new             #9   <Class LottieAnimationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #22  <Method void LottieAnimationView$SavedState(Parcel, LottieAnimationView$1)>
	//    5    9:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #25  <Method LottieAnimationView$SavedState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public LottieAnimationView.SavedState[] newArray(int i)
	{
		return new LottieAnimationView.SavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       LottieAnimationView.SavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #30  <Method LottieAnimationView$SavedState[] newArray(int)>
	//    3    5:areturn         
	}

	LottieAnimationView$SavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
