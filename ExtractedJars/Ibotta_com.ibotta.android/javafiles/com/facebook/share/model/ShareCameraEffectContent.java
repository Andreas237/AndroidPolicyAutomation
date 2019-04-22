// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, CameraEffectArguments, CameraEffectTextures

public class ShareCameraEffectContent extends ShareContent
{

	ShareCameraEffectContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void ShareContent(Parcel)>
		effectId = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #33  <Method String Parcel.readString()>
	//    6   10:putfield        #35  <Field String effectId>
		arguments = (new CameraEffectArguments.Builder()).readFrom(parcel).build();
	//    7   13:aload_0         
	//    8   14:new             #37  <Class CameraEffectArguments$Builder>
	//    9   17:dup             
	//   10   18:invokespecial   #38  <Method void CameraEffectArguments$Builder()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #42  <Method CameraEffectArguments$Builder CameraEffectArguments$Builder.readFrom(Parcel)>
	//   13   25:invokevirtual   #46  <Method CameraEffectArguments CameraEffectArguments$Builder.build()>
	//   14   28:putfield        #48  <Field CameraEffectArguments arguments>
		textures = (new CameraEffectTextures.Builder()).readFrom(parcel).build();
	//   15   31:aload_0         
	//   16   32:new             #50  <Class CameraEffectTextures$Builder>
	//   17   35:dup             
	//   18   36:invokespecial   #51  <Method void CameraEffectTextures$Builder()>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #54  <Method CameraEffectTextures$Builder CameraEffectTextures$Builder.readFrom(Parcel)>
	//   21   43:invokevirtual   #57  <Method CameraEffectTextures CameraEffectTextures$Builder.build()>
	//   22   46:putfield        #59  <Field CameraEffectTextures textures>
	//   23   49:return          
	}

	public CameraEffectArguments getArguments()
	{
		return arguments;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field CameraEffectArguments arguments>
	//    2    4:areturn         
	}

	public String getEffectId()
	{
		return effectId;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String effectId>
	//    2    4:areturn         
	}

	public CameraEffectTextures getTextures()
	{
		return textures;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field CameraEffectTextures textures>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #66  <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeString(effectId);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field String effectId>
	//    7   11:invokevirtual   #70  <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((android.os.Parcelable) (arguments)), 0);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #48  <Field CameraEffectArguments arguments>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #74  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (textures)), 0);
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #59  <Field CameraEffectTextures textures>
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #74  <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
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
	//    2    4:invokespecial   #21  <Method void ShareCameraEffectContent$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
