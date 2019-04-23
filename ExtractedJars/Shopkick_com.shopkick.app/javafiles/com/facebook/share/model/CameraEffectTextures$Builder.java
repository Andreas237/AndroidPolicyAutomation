// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.*;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, CameraEffectTextures, ShareModel

public static class CameraEffectTextures$Builder
	implements ShareModelBuilder
{

	private CameraEffectTextures$Builder putParcelableTexture(String s, Parcelable parcelable)
	{
		if(!Utility.isNullOrEmpty(s) && parcelable != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #32  <Method boolean Utility.isNullOrEmpty(String)>
	//*   2    4:ifne            20
	//*   3    7:aload_2         
	//*   4    8:ifnull          20
			textures.putParcelable(s, parcelable);
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field Bundle textures>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #36  <Method void Bundle.putParcelable(String, Parcelable)>
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public CameraEffectTextures build()
	{
		return new CameraEffectTextures(this, ((CameraEffectTextures._cls1) (null)));
	//    0    0:new             #9   <Class CameraEffectTextures>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #41  <Method void CameraEffectTextures(CameraEffectTextures$Builder, CameraEffectTextures$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method CameraEffectTextures build()>
	//    2    4:areturn         
	}

	public CameraEffectTextures$Builder putTexture(String s, Bitmap bitmap)
	{
		return putParcelableTexture(s, ((Parcelable) (bitmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #48  <Method CameraEffectTextures$Builder putParcelableTexture(String, Parcelable)>
	//    4    6:areturn         
	}

	public CameraEffectTextures$Builder putTexture(String s, Uri uri)
	{
		return putParcelableTexture(s, ((Parcelable) (uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #48  <Method CameraEffectTextures$Builder putParcelableTexture(String, Parcelable)>
	//    4    6:areturn         
	}

	public CameraEffectTextures$Builder readFrom(Parcel parcel)
	{
		return readFrom((CameraEffectTextures)parcel.readParcelable(((Class) (com/facebook/share/model/CameraEffectTextures)).getClassLoader()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #9   <Class CameraEffectTextures>
	//    3    4:invokevirtual   #57  <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokevirtual   #63  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//    5   10:checkcast       #9   <Class CameraEffectTextures>
	//    6   13:invokevirtual   #66  <Method CameraEffectTextures$Builder readFrom(CameraEffectTextures)>
	//    7   16:areturn         
	}

	public CameraEffectTextures$Builder readFrom(CameraEffectTextures cameraeffecttextures)
	{
		if(cameraeffecttextures != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
			textures.putAll(CameraEffectTextures.access$100(cameraeffecttextures));
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Bundle textures>
	//    4    8:aload_1         
	//    5    9:invokestatic    #70  <Method Bundle CameraEffectTextures.access$100(CameraEffectTextures)>
	//    6   12:invokevirtual   #74  <Method void Bundle.putAll(Bundle)>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((CameraEffectTextures)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class CameraEffectTextures>
	//    3    5:invokevirtual   #66  <Method CameraEffectTextures$Builder readFrom(CameraEffectTextures)>
	//    4    8:areturn         
	}

	private Bundle textures;


/*
	static Bundle access$000(CameraEffectTextures$Builder cameraeffecttextures$builder)
	{
		return cameraeffecttextures$builder.textures;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Bundle textures>
	//    2    4:areturn         
	}

*/

	public CameraEffectTextures$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		textures = new Bundle();
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void Bundle()>
	//    6   12:putfield        #21  <Field Bundle textures>
	//    7   15:return          
	}
}
