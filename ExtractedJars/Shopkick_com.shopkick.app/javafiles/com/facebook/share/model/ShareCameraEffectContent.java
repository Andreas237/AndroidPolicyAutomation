// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, CameraEffectArguments, CameraEffectTextures, ShareModel, 
//			ShareModelBuilder

public class ShareCameraEffectContent extends ShareContent
{
	public static final class Builder extends ShareContent.Builder
	{

		public ShareCameraEffectContent build()
		{
			return new ShareCameraEffectContent(this);
		//    0    0:new             #7   <Class ShareCameraEffectContent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #36  <Method void ShareCameraEffectContent(ShareCameraEffectContent$Builder, ShareCameraEffectContent$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #39  <Method ShareCameraEffectContent build()>
		//    2    4:areturn         
		}

		public Builder readFrom(ShareCameraEffectContent sharecameraeffectcontent)
		{
			if(sharecameraeffectcontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return ((Builder)super.readFrom(((ShareContent) (sharecameraeffectcontent)))).setEffectId(effectId).setArguments(arguments);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #44  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
		//    7   11:checkcast       #2   <Class ShareCameraEffectContent$Builder>
		//    8   14:aload_0         
		//    9   15:getfield        #23  <Field String effectId>
		//   10   18:invokevirtual   #48  <Method ShareCameraEffectContent$Builder setEffectId(String)>
		//   11   21:aload_0         
		//   12   22:getfield        #27  <Field CameraEffectArguments arguments>
		//   13   25:invokevirtual   #52  <Method ShareCameraEffectContent$Builder setArguments(CameraEffectArguments)>
		//   14   28:areturn         
		}

		public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
		{
			return ((ShareContent.Builder) (readFrom((ShareCameraEffectContent)sharecontent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareCameraEffectContent>
		//    3    5:invokevirtual   #54  <Method ShareCameraEffectContent$Builder readFrom(ShareCameraEffectContent)>
		//    4    8:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareCameraEffectContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareCameraEffectContent>
		//    3    5:invokevirtual   #54  <Method ShareCameraEffectContent$Builder readFrom(ShareCameraEffectContent)>
		//    4    8:areturn         
		}

		public Builder setArguments(CameraEffectArguments cameraeffectarguments)
		{
			arguments = cameraeffectarguments;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field CameraEffectArguments arguments>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setEffectId(String s)
		{
			effectId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field String effectId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTextures(CameraEffectTextures cameraeffecttextures)
		{
			textures = cameraeffecttextures;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field CameraEffectTextures textures>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private CameraEffectArguments arguments;
		private String effectId;
		private CameraEffectTextures textures;


/*
		static String access$000(Builder builder)
		{
			return builder.effectId;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String effectId>
		//    2    4:areturn         
		}

*/


/*
		static CameraEffectArguments access$100(Builder builder)
		{
			return builder.arguments;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field CameraEffectArguments arguments>
		//    2    4:areturn         
		}

*/


/*
		static CameraEffectTextures access$200(Builder builder)
		{
			return builder.textures;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field CameraEffectTextures textures>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void ShareContent$Builder()>
		//    2    4:return          
		}
	}


	ShareCameraEffectContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void ShareContent(Parcel)>
		effectId = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #36  <Method String Parcel.readString()>
	//    6   10:putfield        #38  <Field String effectId>
		arguments = (new CameraEffectArguments.Builder()).readFrom(parcel).build();
	//    7   13:aload_0         
	//    8   14:new             #40  <Class CameraEffectArguments$Builder>
	//    9   17:dup             
	//   10   18:invokespecial   #41  <Method void CameraEffectArguments$Builder()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #45  <Method CameraEffectArguments$Builder CameraEffectArguments$Builder.readFrom(Parcel)>
	//   13   25:invokevirtual   #49  <Method CameraEffectArguments CameraEffectArguments$Builder.build()>
	//   14   28:putfield        #51  <Field CameraEffectArguments arguments>
		textures = (new CameraEffectTextures.Builder()).readFrom(parcel).build();
	//   15   31:aload_0         
	//   16   32:new             #53  <Class CameraEffectTextures$Builder>
	//   17   35:dup             
	//   18   36:invokespecial   #54  <Method void CameraEffectTextures$Builder()>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #57  <Method CameraEffectTextures$Builder CameraEffectTextures$Builder.readFrom(Parcel)>
	//   21   43:invokevirtual   #60  <Method CameraEffectTextures CameraEffectTextures$Builder.build()>
	//   22   46:putfield        #62  <Field CameraEffectTextures textures>
	//   23   49:return          
	}

	private ShareCameraEffectContent(Builder builder)
	{
		super(((ShareContent.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void ShareContent(ShareContent$Builder)>
		effectId = builder.effectId;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #70  <Method String ShareCameraEffectContent$Builder.access$000(ShareCameraEffectContent$Builder)>
	//    6   10:putfield        #38  <Field String effectId>
		arguments = builder.arguments;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #74  <Method CameraEffectArguments ShareCameraEffectContent$Builder.access$100(ShareCameraEffectContent$Builder)>
	//   10   18:putfield        #51  <Field CameraEffectArguments arguments>
		textures = builder.textures;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #78  <Method CameraEffectTextures ShareCameraEffectContent$Builder.access$200(ShareCameraEffectContent$Builder)>
	//   14   26:putfield        #62  <Field CameraEffectTextures textures>
	//   15   29:return          
	}


	public CameraEffectArguments getArguments()
	{
		return arguments;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field CameraEffectArguments arguments>
	//    2    4:areturn         
	}

	public String getEffectId()
	{
		return effectId;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String effectId>
	//    2    4:areturn         
	}

	public CameraEffectTextures getTextures()
	{
		return textures;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field CameraEffectTextures textures>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #88  <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeString(effectId);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field String effectId>
	//    7   11:invokevirtual   #92  <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((android.os.Parcelable) (arguments)), 0);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #51  <Field CameraEffectArguments arguments>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #96  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (textures)), 0);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #62  <Field CameraEffectTextures textures>
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #96  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//   18   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareCameraEffectContent createFromParcel(Parcel parcel)
		{
			return new ShareCameraEffectContent(parcel);
		//    0    0:new             #9   <Class ShareCameraEffectContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareCameraEffectContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareCameraEffectContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareCameraEffectContent[] newArray(int i)
		{
			return new ShareCameraEffectContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareCameraEffectContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareCameraEffectContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private CameraEffectArguments arguments;
	private String effectId;
	private CameraEffectTextures textures;

	static 
	{
	//    0    0:new             #7   <Class ShareCameraEffectContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void ShareCameraEffectContent$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
