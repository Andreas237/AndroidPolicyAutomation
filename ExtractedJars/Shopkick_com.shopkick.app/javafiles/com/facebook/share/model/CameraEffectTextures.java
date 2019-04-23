// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.*;
import com.facebook.internal.Utility;
import java.util.Set;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

public class CameraEffectTextures
	implements ShareModel
{
	public static class Builder
		implements ShareModelBuilder
	{

		private Builder putParcelableTexture(String s, Parcelable parcelable)
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
			return new CameraEffectTextures(this);
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

		public Builder putTexture(String s, Bitmap bitmap)
		{
			return putParcelableTexture(s, ((Parcelable) (bitmap)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #48  <Method CameraEffectTextures$Builder putParcelableTexture(String, Parcelable)>
		//    4    6:areturn         
		}

		public Builder putTexture(String s, Uri uri)
		{
			return putParcelableTexture(s, ((Parcelable) (uri)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #48  <Method CameraEffectTextures$Builder putParcelableTexture(String, Parcelable)>
		//    4    6:areturn         
		}

		public Builder readFrom(Parcel parcel)
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

		public Builder readFrom(CameraEffectTextures cameraeffecttextures)
		{
			if(cameraeffecttextures != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          15
				textures.putAll(cameraeffecttextures.textures);
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
		static Bundle access$000(Builder builder)
		{
			return builder.textures;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Bundle textures>
		//    2    4:areturn         
		}

*/

		public Builder()
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


	CameraEffectTextures(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		textures = parcel.readBundle(((Object)this).getClass().getClassLoader());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #30  <Method Class Object.getClass()>
	//    6   10:invokevirtual   #36  <Method ClassLoader Class.getClassLoader()>
	//    7   13:invokevirtual   #42  <Method Bundle Parcel.readBundle(ClassLoader)>
	//    8   16:putfield        #44  <Field Bundle textures>
	//    9   19:return          
	}

	private CameraEffectTextures(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		textures = builder.textures;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #49  <Method Bundle CameraEffectTextures$Builder.access$000(CameraEffectTextures$Builder)>
	//    5    9:putfield        #44  <Field Bundle textures>
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
		return textures.get(s);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Bundle textures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #63  <Method Object Bundle.get(String)>
	//    4    8:areturn         
	}

	public Bitmap getTextureBitmap(String s)
	{
		s = ((String) (textures.get(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Bundle textures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #63  <Method Object Bundle.get(String)>
	//    4    8:astore_1        
		if(s instanceof Bitmap)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #68  <Class Bitmap>
	//*   7   13:ifeq            21
			return (Bitmap)s;
	//    8   16:aload_1         
	//    9   17:checkcast       #68  <Class Bitmap>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	public Uri getTextureUri(String s)
	{
		s = ((String) (textures.get(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Bundle textures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #63  <Method Object Bundle.get(String)>
	//    4    8:astore_1        
		if(s instanceof Uri)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #72  <Class Uri>
	//*   7   13:ifeq            21
			return (Uri)s;
	//    8   16:aload_1         
	//    9   17:checkcast       #72  <Class Uri>
	//   10   20:areturn         
		else
			return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
	}

	public Set keySet()
	{
		return textures.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Bundle textures>
	//    2    4:invokevirtual   #76  <Method Set Bundle.keySet()>
	//    3    7:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(textures);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field Bundle textures>
	//    3    5:invokevirtual   #84  <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public CameraEffectTextures createFromParcel(Parcel parcel)
		{
			return new CameraEffectTextures(parcel);
		//    0    0:new             #9   <Class CameraEffectTextures>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void CameraEffectTextures(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method CameraEffectTextures createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public CameraEffectTextures[] newArray(int i)
		{
			return new CameraEffectTextures[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CameraEffectTextures[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method CameraEffectTextures[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final Bundle textures;

	static 
	{
	//    0    0:new             #8   <Class CameraEffectTextures$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void CameraEffectTextures$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}


/*
	static Bundle access$100(CameraEffectTextures cameraeffecttextures)
	{
		return cameraeffecttextures.textures;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Bundle textures>
	//    2    4:areturn         
	}

*/
}
