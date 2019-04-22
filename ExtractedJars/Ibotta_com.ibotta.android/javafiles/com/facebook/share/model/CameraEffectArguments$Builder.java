// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, CameraEffectArguments, ShareModel

public static class CameraEffectArguments$Builder
	implements ShareModelBuilder
{

	public CameraEffectArguments build()
	{
		return new CameraEffectArguments(this, ((CameraEffectArguments._cls1) (null)));
	//    0    0:new             #9   <Class CameraEffectArguments>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #29  <Method void CameraEffectArguments(CameraEffectArguments$Builder, CameraEffectArguments$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method CameraEffectArguments build()>
	//    2    4:areturn         
	}

	public CameraEffectArguments$Builder putArgument(String s, String s1)
	{
		params.putString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle params>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #38  <Method void Bundle.putString(String, String)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public CameraEffectArguments$Builder putArgument(String s, String as[])
	{
		params.putStringArray(s, as);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle params>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #43  <Method void Bundle.putStringArray(String, String[])>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public CameraEffectArguments$Builder readFrom(Parcel parcel)
	{
		return readFrom((CameraEffectArguments)parcel.readParcelable(((Class) (com/facebook/share/model/CameraEffectArguments)).getClassLoader()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #9   <Class CameraEffectArguments>
	//    3    4:invokevirtual   #51  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokevirtual   #57  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    5   10:checkcast       #9   <Class CameraEffectArguments>
	//    6   13:invokevirtual   #60  <Method CameraEffectArguments$Builder readFrom(CameraEffectArguments)>
	//    7   16:areturn         
	}

	public CameraEffectArguments$Builder readFrom(CameraEffectArguments cameraeffectarguments)
	{
		if(cameraeffectarguments != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			params.putAll(CameraEffectArguments.access$100(cameraeffectarguments));
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Bundle params>
	//    4    8:aload_1         
	//    5    9:invokestatic    #64  <Method Bundle CameraEffectArguments.access$100(CameraEffectArguments)>
	//    6   12:invokevirtual   #68  <Method void Bundle.putAll(Bundle)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((CameraEffectArguments)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class CameraEffectArguments>
	//    3    5:invokevirtual   #60  <Method CameraEffectArguments$Builder readFrom(CameraEffectArguments)>
	//    4    8:areturn         
	}

	private Bundle params;


/*
	static Bundle access$000(CameraEffectArguments$Builder cameraeffectarguments$builder)
	{
		return cameraeffectarguments$builder.params;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle params>
	//    2    4:areturn         
	}

*/

	public CameraEffectArguments$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		params = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Bundle()>
	//    6   12:putfield        #21  <Field Bundle params>
	//    7   15:return          
	}
}
