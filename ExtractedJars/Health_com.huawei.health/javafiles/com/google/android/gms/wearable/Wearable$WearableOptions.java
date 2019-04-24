// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;


// Referenced classes of package com.google.android.gms.wearable:
//			Wearable

public static final class Wearable$WearableOptions
	implements com.google.android.gms.common.api.Api.ApiOptions.Optional
{
	public static class Builder
	{

		public Wearable.WearableOptions build()
		{
			return new Wearable.WearableOptions(this, ((Wearable._cls1) (null)));
		//    0    0:new             #6   <Class Wearable$WearableOptions>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #20  <Method void Wearable$WearableOptions(Wearable$WearableOptions$Builder, Wearable$1)>
		//    5    9:areturn         
		}

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	private Wearable$WearableOptions(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	Wearable$WearableOptions(Builder builder, Wearable._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void Wearable$WearableOptions(Wearable$WearableOptions$Builder)>
	//    3    5:return          
	}
}
