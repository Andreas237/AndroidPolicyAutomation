// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//			ShareOpenGraphContent, ShareOpenGraphAction, ShareContent, ShareModelBuilder, 
//			ShareModel

public static final class ShareOpenGraphContent$Builder extends ShareContent.Builder
{

	public ShareOpenGraphContent build()
	{
		return new ShareOpenGraphContent(this, ((ShareOpenGraphContent._cls1) (null)));
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

	public ShareOpenGraphContent$Builder readFrom(Parcel parcel)
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

	public ShareOpenGraphContent$Builder readFrom(ShareOpenGraphContent shareopengraphcontent)
	{
		if(shareopengraphcontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareOpenGraphContent$Builder)super.readFrom(((ShareContent) (shareopengraphcontent)))).setAction(shareopengraphcontent.getAction()).setPreviewPropertyName(shareopengraphcontent.getPreviewPropertyName());
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

	public ShareOpenGraphContent$Builder setAction(ShareOpenGraphAction shareopengraphaction)
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

	public ShareOpenGraphContent$Builder setPreviewPropertyName(String s)
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
	static ShareOpenGraphAction access$000(ShareOpenGraphContent$Builder shareopengraphcontent$builder)
	{
		return shareopengraphcontent$builder.action;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ShareOpenGraphAction action>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(ShareOpenGraphContent$Builder shareopengraphcontent$builder)
	{
		return shareopengraphcontent$builder.previewPropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String previewPropertyName>
	//    2    4:areturn         
	}

*/

	public ShareOpenGraphContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ShareContent$Builder()>
	//    2    4:return          
	}
}
