// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Parcel;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

public class LikeContent
	implements ShareModel
{
	public static class Builder
		implements ShareModelBuilder
	{

		public LikeContent build()
		{
			return new LikeContent(this);
		//    0    0:new             #9   <Class LikeContent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #30  <Method void LikeContent(LikeContent$Builder, LikeContent$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #33  <Method LikeContent build()>
		//    2    4:areturn         
		}

		public Builder readFrom(Parcel parcel)
		{
			return readFrom((LikeContent)parcel.readParcelable(((Class) (com/facebook/share/internal/LikeContent)).getClassLoader()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #9   <Class LikeContent>
		//    3    4:invokevirtual   #41  <Method ClassLoader Class.getClassLoader()>
		//    4    7:invokevirtual   #47  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
		//    5   10:checkcast       #9   <Class LikeContent>
		//    6   13:invokevirtual   #50  <Method LikeContent$Builder readFrom(LikeContent)>
		//    7   16:areturn         
		}

		public Builder readFrom(LikeContent likecontent)
		{
			if(likecontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return setObjectId(likecontent.getObjectId()).setObjectType(likecontent.getObjectType());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #54  <Method String LikeContent.getObjectId()>
		//    7   11:invokevirtual   #58  <Method LikeContent$Builder setObjectId(String)>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #61  <Method String LikeContent.getObjectType()>
		//   10   18:invokevirtual   #64  <Method LikeContent$Builder setObjectType(String)>
		//   11   21:areturn         
		}

		public volatile ShareModelBuilder readFrom(Parcel parcel)
		{
			return ((ShareModelBuilder) (readFrom(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #67  <Method LikeContent$Builder readFrom(Parcel)>
		//    3    5:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((LikeContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class LikeContent>
		//    3    5:invokevirtual   #50  <Method LikeContent$Builder readFrom(LikeContent)>
		//    4    8:areturn         
		}

		public Builder setObjectId(String s)
		{
			objectId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field String objectId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setObjectType(String s)
		{
			objectType = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field String objectType>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String objectId;
		private String objectType;


/*
		static String access$000(Builder builder)
		{
			return builder.objectId;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String objectId>
		//    2    4:areturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.objectType;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field String objectType>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}


	LikeContent(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		objectId = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #33  <Method String Parcel.readString()>
	//    5    9:putfield        #35  <Field String objectId>
		objectType = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #33  <Method String Parcel.readString()>
	//    9   17:putfield        #37  <Field String objectType>
	//   10   20:return          
	}

	private LikeContent(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		objectId = builder.objectId;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #42  <Method String LikeContent$Builder.access$000(LikeContent$Builder)>
	//    5    9:putfield        #35  <Field String objectId>
		objectType = builder.objectType;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #45  <Method String LikeContent$Builder.access$100(LikeContent$Builder)>
	//    9   17:putfield        #37  <Field String objectType>
	//   10   20:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getObjectId()
	{
		return objectId;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String objectId>
	//    2    4:areturn         
	}

	public String getObjectType()
	{
		return objectType;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String objectType>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(objectId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field String objectId>
	//    3    5:invokevirtual   #58  <Method void Parcel.writeString(String)>
		parcel.writeString(objectType);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field String objectType>
	//    7   13:invokevirtual   #58  <Method void Parcel.writeString(String)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public LikeContent createFromParcel(Parcel parcel)
		{
			return new LikeContent(parcel);
		//    0    0:new             #9   <Class LikeContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void LikeContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method LikeContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public LikeContent[] newArray(int i)
		{
			return new LikeContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       LikeContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method LikeContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String objectId;
	private final String objectType;

	static 
	{
	//    0    0:new             #8   <Class LikeContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void LikeContent$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
