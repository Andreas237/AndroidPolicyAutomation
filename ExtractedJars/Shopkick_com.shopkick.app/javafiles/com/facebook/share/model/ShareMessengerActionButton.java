// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

public abstract class ShareMessengerActionButton
	implements ShareModel
{
	public static abstract class Builder
		implements ShareModelBuilder
	{

		public Builder readFrom(ShareMessengerActionButton sharemessengeractionbutton)
		{
			if(sharemessengeractionbutton == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return setTitle(sharemessengeractionbutton.getTitle());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #27  <Method String ShareMessengerActionButton.getTitle()>
		//    7   11:invokevirtual   #31  <Method ShareMessengerActionButton$Builder setTitle(String)>
		//    8   14:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareMessengerActionButton)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class ShareMessengerActionButton>
		//    3    5:invokevirtual   #36  <Method ShareMessengerActionButton$Builder readFrom(ShareMessengerActionButton)>
		//    4    8:areturn         
		}

		public Builder setTitle(String s)
		{
			title = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field String title>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String title;


/*
		static String access$000(Builder builder)
		{
			return builder.title;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String title>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	ShareMessengerActionButton(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		title = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #22  <Method String Parcel.readString()>
	//    5    9:putfield        #24  <Field String title>
	//    6   12:return          
	}

	protected ShareMessengerActionButton(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		title = builder.title;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #30  <Method String ShareMessengerActionButton$Builder.access$000(ShareMessengerActionButton$Builder)>
	//    5    9:putfield        #24  <Field String title>
	//    6   12:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getTitle()
	{
		return title;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String title>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(title);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field String title>
	//    3    5:invokevirtual   #39  <Method void Parcel.writeString(String)>
	//    4    8:return          
	}

	private final String title;
}
