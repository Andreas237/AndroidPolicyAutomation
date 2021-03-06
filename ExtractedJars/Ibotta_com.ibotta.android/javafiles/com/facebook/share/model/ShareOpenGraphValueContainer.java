// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Set;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

public abstract class ShareOpenGraphValueContainer
	implements ShareModel
{
	public static abstract class Builder
		implements ShareModelBuilder
	{

		public Builder putString(String s, String s1)
		{
			bundle.putString(s, s1);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #30  <Method void Bundle.putString(String, String)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareOpenGraphValueContainer)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class ShareOpenGraphValueContainer>
		//    3    5:invokevirtual   #38  <Method ShareOpenGraphValueContainer$Builder readFrom(ShareOpenGraphValueContainer)>
		//    4    8:areturn         
		}

		public Builder readFrom(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
		{
			if(shareopengraphvaluecontainer != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          15
				bundle.putAll(shareopengraphvaluecontainer.getBundle());
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field Bundle bundle>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #42  <Method Bundle ShareOpenGraphValueContainer.getBundle()>
		//    6   12:invokevirtual   #46  <Method void Bundle.putAll(Bundle)>
			return this;
		//    7   15:aload_0         
		//    8   16:areturn         
		}

		private Bundle bundle;


/*
		static Bundle access$000(Builder builder)
		{
			return builder.bundle;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle bundle>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			bundle = new Bundle();
		//    2    4:aload_0         
		//    3    5:new             #18  <Class Bundle>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void Bundle()>
		//    6   12:putfield        #21  <Field Bundle bundle>
		//    7   15:return          
		}
	}


	ShareOpenGraphValueContainer(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		bundle = parcel.readBundle(((Class) (com/facebook/share/model/ShareOpenGraphValueContainer$Builder)).getClassLoader());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #9   <Class ShareOpenGraphValueContainer$Builder>
	//    5    8:invokevirtual   #23  <Method ClassLoader Class.getClassLoader()>
	//    6   11:invokevirtual   #29  <Method Bundle Parcel.readBundle(ClassLoader)>
	//    7   14:putfield        #31  <Field Bundle bundle>
	//    8   17:return          
	}

	protected ShareOpenGraphValueContainer(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		bundle = (Bundle)builder.bundle.clone();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #37  <Method Bundle ShareOpenGraphValueContainer$Builder.access$000(ShareOpenGraphValueContainer$Builder)>
	//    5    9:invokevirtual   #43  <Method Object Bundle.clone()>
	//    6   12:checkcast       #39  <Class Bundle>
	//    7   15:putfield        #31  <Field Bundle bundle>
	//    8   18:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object get(String s)
	{
		return bundle.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method Object Bundle.get(String)>
	//    4    8:areturn         
	}

	public Bundle getBundle()
	{
		return (Bundle)bundle.clone();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:invokevirtual   #43  <Method Object Bundle.clone()>
	//    3    7:checkcast       #39  <Class Bundle>
	//    4   10:areturn         
	}

	public String getString(String s)
	{
		return bundle.getString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #59  <Method String Bundle.getString(String)>
	//    4    8:areturn         
	}

	public Set keySet()
	{
		return bundle.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bundle bundle>
	//    2    4:invokevirtual   #63  <Method Set Bundle.keySet()>
	//    3    7:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(bundle);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field Bundle bundle>
	//    3    5:invokevirtual   #70  <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	private final Bundle bundle;
}
