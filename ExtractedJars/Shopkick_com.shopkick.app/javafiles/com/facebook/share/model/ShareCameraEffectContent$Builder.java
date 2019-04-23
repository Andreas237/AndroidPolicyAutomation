// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//			ShareCameraEffectContent, CameraEffectArguments, CameraEffectTextures, ShareContent, 
//			ShareModel, ShareModelBuilder

public static final class ShareCameraEffectContent$Builder extends ShareContent.Builder
{

	public ShareCameraEffectContent build()
	{
		return new ShareCameraEffectContent(this, ((ShareCameraEffectContent._cls1) (null)));
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

	public ShareCameraEffectContent$Builder readFrom(ShareCameraEffectContent sharecameraeffectcontent)
	{
		if(sharecameraeffectcontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareCameraEffectContent$Builder)super.readFrom(((ShareContent) (sharecameraeffectcontent)))).setEffectId(effectId).setArguments(arguments);
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

	public ShareCameraEffectContent$Builder setArguments(CameraEffectArguments cameraeffectarguments)
	{
		arguments = cameraeffectarguments;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field CameraEffectArguments arguments>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareCameraEffectContent$Builder setEffectId(String s)
	{
		effectId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field String effectId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareCameraEffectContent$Builder setTextures(CameraEffectTextures cameraeffecttextures)
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
	static String access$000(ShareCameraEffectContent$Builder sharecameraeffectcontent$builder)
	{
		return sharecameraeffectcontent$builder.effectId;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String effectId>
	//    2    4:areturn         
	}

*/


/*
	static CameraEffectArguments access$100(ShareCameraEffectContent$Builder sharecameraeffectcontent$builder)
	{
		return sharecameraeffectcontent$builder.arguments;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field CameraEffectArguments arguments>
	//    2    4:areturn         
	}

*/


/*
	static CameraEffectTextures access$200(ShareCameraEffectContent$Builder sharecameraeffectcontent$builder)
	{
		return sharecameraeffectcontent$builder.textures;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field CameraEffectTextures textures>
	//    2    4:areturn         
	}

*/

	public ShareCameraEffectContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ShareContent$Builder()>
	//    2    4:return          
	}
}
