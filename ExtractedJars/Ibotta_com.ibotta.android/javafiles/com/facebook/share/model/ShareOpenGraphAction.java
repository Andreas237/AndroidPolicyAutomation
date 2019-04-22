// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareOpenGraphValueContainer, ShareModel, ShareModelBuilder

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer
{
	public static final class Builder extends ShareOpenGraphValueContainer.Builder
	{

		public ShareOpenGraphAction build()
		{
			return new ShareOpenGraphAction(this);
		//    0    0:new             #7   <Class ShareOpenGraphAction>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #18  <Method void ShareOpenGraphAction(ShareOpenGraphAction$Builder, ShareOpenGraphAction$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #21  <Method ShareOpenGraphAction build()>
		//    2    4:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareOpenGraphAction)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareOpenGraphAction>
		//    3    5:invokevirtual   #26  <Method ShareOpenGraphAction$Builder readFrom(ShareOpenGraphAction)>
		//    4    8:areturn         
		}

		Builder readFrom(Parcel parcel)
		{
			return readFrom((ShareOpenGraphAction)parcel.readParcelable(((Class) (com/facebook/share/model/ShareOpenGraphAction)).getClassLoader()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class ShareOpenGraphAction>
		//    3    4:invokevirtual   #33  <Method ClassLoader Class.getClassLoader()>
		//    4    7:invokevirtual   #39  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
		//    5   10:checkcast       #7   <Class ShareOpenGraphAction>
		//    6   13:invokevirtual   #26  <Method ShareOpenGraphAction$Builder readFrom(ShareOpenGraphAction)>
		//    7   16:areturn         
		}

		public Builder readFrom(ShareOpenGraphAction shareopengraphaction)
		{
			if(shareopengraphaction == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return ((Builder)super.readFrom(((ShareOpenGraphValueContainer) (shareopengraphaction)))).setActionType(shareopengraphaction.getActionType());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #42  <Method ShareOpenGraphValueContainer$Builder ShareOpenGraphValueContainer$Builder.readFrom(ShareOpenGraphValueContainer)>
		//    7   11:checkcast       #2   <Class ShareOpenGraphAction$Builder>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #46  <Method String ShareOpenGraphAction.getActionType()>
		//   10   18:invokevirtual   #50  <Method ShareOpenGraphAction$Builder setActionType(String)>
		//   11   21:areturn         
		}

		public volatile ShareOpenGraphValueContainer.Builder readFrom(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
		{
			return ((ShareOpenGraphValueContainer.Builder) (readFrom((ShareOpenGraphAction)shareopengraphvaluecontainer)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareOpenGraphAction>
		//    3    5:invokevirtual   #26  <Method ShareOpenGraphAction$Builder readFrom(ShareOpenGraphAction)>
		//    4    8:areturn         
		}

		public Builder setActionType(String s)
		{
			putString("og:type", s);
		//    0    0:aload_0         
		//    1    1:ldc1            #52  <String "og:type">
		//    2    3:aload_1         
		//    3    4:invokevirtual   #56  <Method ShareOpenGraphValueContainer$Builder putString(String, String)>
		//    4    7:pop             
			return this;
		//    5    8:aload_0         
		//    6    9:areturn         
		}

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void ShareOpenGraphValueContainer$Builder()>
		//    2    4:return          
		}
	}


	ShareOpenGraphAction(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void ShareOpenGraphValueContainer(Parcel)>
	//    3    5:return          
	}

	private ShareOpenGraphAction(Builder builder)
	{
		super(((ShareOpenGraphValueContainer.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void ShareOpenGraphValueContainer(ShareOpenGraphValueContainer$Builder)>
	//    3    5:return          
	}


	public String getActionType()
	{
		return getString("og:type");
	//    0    0:aload_0         
	//    1    1:ldc1            #36  <String "og:type">
	//    2    3:invokevirtual   #40  <Method String getString(String)>
	//    3    6:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareOpenGraphAction createFromParcel(Parcel parcel)
		{
			return new ShareOpenGraphAction(parcel);
		//    0    0:new             #9   <Class ShareOpenGraphAction>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareOpenGraphAction(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareOpenGraphAction createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareOpenGraphAction[] newArray(int i)
		{
			return new ShareOpenGraphAction[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareOpenGraphAction[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareOpenGraphAction[] newArray(int)>
		//    3    5:areturn         
		}

	}
;

	static 
	{
	//    0    0:new             #7   <Class ShareOpenGraphAction$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ShareOpenGraphAction$1()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
