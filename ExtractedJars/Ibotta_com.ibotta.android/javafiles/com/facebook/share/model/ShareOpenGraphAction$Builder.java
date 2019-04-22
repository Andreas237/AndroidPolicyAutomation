// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareOpenGraphAction, ShareModel, ShareModelBuilder, ShareOpenGraphValueContainer

public static final class ShareOpenGraphAction$Builder extends Builder
{

	public ShareOpenGraphAction build()
	{
		return new ShareOpenGraphAction(this, ((ShareOpenGraphAction._cls1) (null)));
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

	ShareOpenGraphAction$Builder readFrom(Parcel parcel)
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

	public ShareOpenGraphAction$Builder readFrom(ShareOpenGraphAction shareopengraphaction)
	{
		if(shareopengraphaction == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareOpenGraphAction$Builder)super.readFrom(((ShareOpenGraphValueContainer) (shareopengraphaction)))).setActionType(shareopengraphaction.getActionType());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #42  <Method ShareOpenGraphValueContainer$Builder ShareOpenGraphValueContainer$Builder.readFrom(ShareOpenGraphValueContainer)>
	//    7   11:checkcast       #2   <Class ShareOpenGraphAction$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #46  <Method String ShareOpenGraphAction.getActionType()>
	//   10   18:invokevirtual   #50  <Method ShareOpenGraphAction$Builder setActionType(String)>
	//   11   21:areturn         
	}

	public volatile Builder readFrom(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
	{
		return ((Builder) (readFrom((ShareOpenGraphAction)shareopengraphvaluecontainer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareOpenGraphAction>
	//    3    5:invokevirtual   #26  <Method ShareOpenGraphAction$Builder readFrom(ShareOpenGraphAction)>
	//    4    8:areturn         
	}

	public ShareOpenGraphAction$Builder setActionType(String s)
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

	public ShareOpenGraphAction$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ShareOpenGraphValueContainer$Builder()>
	//    2    4:return          
	}
}
