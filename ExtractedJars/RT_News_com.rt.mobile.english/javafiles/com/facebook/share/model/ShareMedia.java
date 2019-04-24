// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

public abstract class ShareMedia
	implements ShareModel
{
	public static abstract class Builder
		implements ShareModelBuilder
	{

		public Builder readFrom(ShareMedia sharemedia)
		{
			if(sharemedia == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return setParameters(sharemedia.getParameters());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #30  <Method Bundle ShareMedia.getParameters()>
		//    7   11:invokevirtual   #34  <Method ShareMedia$Builder setParameters(Bundle)>
		//    8   14:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareMedia)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class ShareMedia>
		//    3    5:invokevirtual   #39  <Method ShareMedia$Builder readFrom(ShareMedia)>
		//    4    8:areturn         
		}

		public Builder setParameter(String s, String s1)
		{
			params.putString(s, s1);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle params>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #46  <Method void Bundle.putString(String, String)>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Builder setParameters(Bundle bundle)
		{
			params.putAll(bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle params>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #52  <Method void Bundle.putAll(Bundle)>
			return this;
		//    4    8:aload_0         
		//    5    9:areturn         
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


	ShareMedia(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		params = parcel.readBundle();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #22  <Method Bundle Parcel.readBundle()>
	//    5    9:putfield        #24  <Field Bundle params>
	//    6   12:return          
	}

	protected ShareMedia(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		params = new Bundle(builder.params);
	//    2    4:aload_0         
	//    3    5:new             #28  <Class Bundle>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokestatic    #32  <Method Bundle ShareMedia$Builder.access$000(ShareMedia$Builder)>
	//    7   13:invokespecial   #35  <Method void Bundle(Bundle)>
	//    8   16:putfield        #24  <Field Bundle params>
	//    9   19:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Bundle getParameters()
	{
		return new Bundle(params);
	//    0    0:new             #28  <Class Bundle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field Bundle params>
	//    4    8:invokespecial   #35  <Method void Bundle(Bundle)>
	//    5   11:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(params);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field Bundle params>
	//    3    5:invokevirtual   #45  <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	private final Bundle params;
}
