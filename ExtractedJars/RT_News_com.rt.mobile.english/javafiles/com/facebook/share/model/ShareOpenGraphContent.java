// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareOpenGraphAction, ShareModelBuilder, ShareModel

public final class ShareOpenGraphContent extends ShareContent
{
	public static final class Builder extends ShareContent.Builder
	{

		public ShareOpenGraphContent build()
		{
			return new ShareOpenGraphContent(this);
		//    0    0:new             #7   <Class ShareOpenGraphContent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #30  <Method void ShareOpenGraphContent(ShareOpenGraphContent$Builder, ShareOpenGraphContent$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #33  <Method ShareOpenGraphContent build()>
		//    2    4:areturn         
		}

		public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
		{
			return ((ShareContent.Builder) (readFrom((ShareOpenGraphContent)sharecontent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareOpenGraphContent>
		//    3    5:invokevirtual   #38  <Method ShareOpenGraphContent$Builder readFrom(ShareOpenGraphContent)>
		//    4    8:areturn         
		}

		public volatile ShareModelBuilder readFrom(Parcel parcel)
		{
			return ((ShareModelBuilder) (readFrom(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #42  <Method ShareOpenGraphContent$Builder readFrom(Parcel)>
		//    3    5:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareOpenGraphContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareOpenGraphContent>
		//    3    5:invokevirtual   #38  <Method ShareOpenGraphContent$Builder readFrom(ShareOpenGraphContent)>
		//    4    8:areturn         
		}

		public Builder readFrom(Parcel parcel)
		{
			return readFrom((ShareOpenGraphContent)parcel.readParcelable(((Class) (com/facebook/share/model/ShareOpenGraphContent)).getClassLoader()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class ShareOpenGraphContent>
		//    3    4:invokevirtual   #49  <Method ClassLoader Class.getClassLoader()>
		//    4    7:invokevirtual   #55  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
		//    5   10:checkcast       #7   <Class ShareOpenGraphContent>
		//    6   13:invokevirtual   #38  <Method ShareOpenGraphContent$Builder readFrom(ShareOpenGraphContent)>
		//    7   16:areturn         
		}

		public Builder readFrom(ShareOpenGraphContent shareopengraphcontent)
		{
			if(shareopengraphcontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return ((Builder)super.readFrom(((ShareContent) (shareopengraphcontent)))).setAction(shareopengraphcontent.getAction()).setPreviewPropertyName(shareopengraphcontent.getPreviewPropertyName());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #57  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
		//    7   11:checkcast       #2   <Class ShareOpenGraphContent$Builder>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #61  <Method ShareOpenGraphAction ShareOpenGraphContent.getAction()>
		//   10   18:invokevirtual   #65  <Method ShareOpenGraphContent$Builder setAction(ShareOpenGraphAction)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #69  <Method String ShareOpenGraphContent.getPreviewPropertyName()>
		//   13   25:invokevirtual   #73  <Method ShareOpenGraphContent$Builder setPreviewPropertyName(String)>
		//   14   28:areturn         
		}

		public Builder setAction(ShareOpenGraphAction shareopengraphaction)
		{
			if(shareopengraphaction == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       9
				shareopengraphaction = null;
		//    2    4:aconst_null     
		//    3    5:astore_1        
			else
		//*   4    6:goto            24
				shareopengraphaction = (new ShareOpenGraphAction.Builder()).readFrom(shareopengraphaction).build();
		//    5    9:new             #76  <Class ShareOpenGraphAction$Builder>
		//    6   12:dup             
		//    7   13:invokespecial   #77  <Method void ShareOpenGraphAction$Builder()>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #80  <Method ShareOpenGraphAction$Builder ShareOpenGraphAction$Builder.readFrom(ShareOpenGraphAction)>
		//   10   20:invokevirtual   #82  <Method ShareOpenGraphAction ShareOpenGraphAction$Builder.build()>
		//   11   23:astore_1        
			action = shareopengraphaction;
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:putfield        #21  <Field ShareOpenGraphAction action>
			return this;
		//   15   29:aload_0         
		//   16   30:areturn         
		}

		public Builder setPreviewPropertyName(String s)
		{
			previewPropertyName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field String previewPropertyName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private ShareOpenGraphAction action;
		private String previewPropertyName;


/*
		static ShareOpenGraphAction access$000(Builder builder)
		{
			return builder.action;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field ShareOpenGraphAction action>
		//    2    4:areturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.previewPropertyName;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field String previewPropertyName>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void ShareContent$Builder()>
		//    2    4:return          
		}
	}


	ShareOpenGraphContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void ShareContent(Parcel)>
		action = (new ShareOpenGraphAction.Builder()).readFrom(parcel).build();
	//    3    5:aload_0         
	//    4    6:new             #30  <Class ShareOpenGraphAction$Builder>
	//    5    9:dup             
	//    6   10:invokespecial   #31  <Method void ShareOpenGraphAction$Builder()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #35  <Method ShareOpenGraphAction$Builder ShareOpenGraphAction$Builder.readFrom(Parcel)>
	//    9   17:invokevirtual   #39  <Method ShareOpenGraphAction ShareOpenGraphAction$Builder.build()>
	//   10   20:putfield        #41  <Field ShareOpenGraphAction action>
		previewPropertyName = parcel.readString();
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #47  <Method String Parcel.readString()>
	//   14   28:putfield        #49  <Field String previewPropertyName>
	//   15   31:return          
	}

	private ShareOpenGraphContent(Builder builder)
	{
		super(((ShareContent.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #53  <Method void ShareContent(ShareContent$Builder)>
		action = builder.action;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #57  <Method ShareOpenGraphAction ShareOpenGraphContent$Builder.access$000(ShareOpenGraphContent$Builder)>
	//    6   10:putfield        #41  <Field ShareOpenGraphAction action>
		previewPropertyName = builder.previewPropertyName;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #61  <Method String ShareOpenGraphContent$Builder.access$100(ShareOpenGraphContent$Builder)>
	//   10   18:putfield        #49  <Field String previewPropertyName>
	//   11   21:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ShareOpenGraphAction getAction()
	{
		return action;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ShareOpenGraphAction action>
	//    2    4:areturn         
	}

	public String getPreviewPropertyName()
	{
		return previewPropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String previewPropertyName>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #74  <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeParcelable(((android.os.Parcelable) (action)), 0);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field ShareOpenGraphAction action>
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #78  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeString(previewPropertyName);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #49  <Field String previewPropertyName>
	//   12   20:invokevirtual   #82  <Method void Parcel.writeString(String)>
	//   13   23:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareOpenGraphContent createFromParcel(Parcel parcel)
		{
			return new ShareOpenGraphContent(parcel);
		//    0    0:new             #9   <Class ShareOpenGraphContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareOpenGraphContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareOpenGraphContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareOpenGraphContent[] newArray(int i)
		{
			return new ShareOpenGraphContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareOpenGraphContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareOpenGraphContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final ShareOpenGraphAction action;
	private final String previewPropertyName;

	static 
	{
	//    0    0:new             #7   <Class ShareOpenGraphContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ShareOpenGraphContent$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
