// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Set;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

public class CameraEffectArguments
	implements ShareModel
{
	public static class Builder
		implements ShareModelBuilder
	{

		public CameraEffectArguments build()
		{
			return new CameraEffectArguments(this);
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

		public Builder putArgument(String s, String s1)
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

		public Builder putArgument(String s, String as[])
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

		public Builder readFrom(Parcel parcel)
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

		public Builder readFrom(CameraEffectArguments cameraeffectarguments)
		{
			if(cameraeffectarguments != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          15
				params.putAll(cameraeffectarguments.params);
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
		static Bundle access$000(Builder builder)
		{
			return builder.params;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle params>
		//    2    4:areturn         
		}

*/

		public Builder()
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


	CameraEffectArguments(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		params = parcel.readBundle(((Object)this).getClass().getClassLoader());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #30  <Method Class Object.getClass()>
	//    6   10:invokevirtual   #36  <Method ClassLoader Class.getClassLoader()>
	//    7   13:invokevirtual   #42  <Method Bundle Parcel.readBundle(ClassLoader)>
	//    8   16:putfield        #44  <Field Bundle params>
	//    9   19:return          
	}

	private CameraEffectArguments(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		params = builder.params;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #49  <Method Bundle CameraEffectArguments$Builder.access$000(CameraEffectArguments$Builder)>
	//    5    9:putfield        #44  <Field Bundle params>
	//    6   12:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object get(String s)
	{
		return params.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Bundle params>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #63  <Method Object Bundle.get(String)>
	//    4    8:areturn         
	}

	public Set keySet()
	{
		return params.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Bundle params>
	//    2    4:invokevirtual   #68  <Method Set Bundle.keySet()>
	//    3    7:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(params);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field Bundle params>
	//    3    5:invokevirtual   #76  <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public CameraEffectArguments createFromParcel(Parcel parcel)
		{
			return new CameraEffectArguments(parcel);
		//    0    0:new             #9   <Class CameraEffectArguments>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void CameraEffectArguments(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method CameraEffectArguments createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public CameraEffectArguments[] newArray(int i)
		{
			return new CameraEffectArguments[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CameraEffectArguments[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method CameraEffectArguments[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final Bundle params;

	static 
	{
	//    0    0:new             #8   <Class CameraEffectArguments$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void CameraEffectArguments$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}


/*
	static Bundle access$100(CameraEffectArguments cameraeffectarguments)
	{
		return cameraeffectarguments.params;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Bundle params>
	//    2    4:areturn         
	}

*/
}
