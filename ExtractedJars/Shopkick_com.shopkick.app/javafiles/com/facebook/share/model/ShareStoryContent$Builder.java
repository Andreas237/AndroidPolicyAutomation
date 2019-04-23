// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import java.util.List;

// Referenced classes of package com.facebook.share.model:
//			ShareStoryContent, ShareMedia, SharePhoto, ShareContent, 
//			ShareModel, ShareModelBuilder

public static final class ShareStoryContent$Builder extends ShareContent.Builder
{

	public ShareStoryContent build()
	{
		return new ShareStoryContent(this, ((ShareStoryContent._cls1) (null)));
	//    0    0:new             #7   <Class ShareStoryContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #47  <Method void ShareStoryContent(ShareStoryContent$Builder, ShareStoryContent$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method ShareStoryContent build()>
	//    2    4:areturn         
	}

	public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
	{
		return ((ShareContent.Builder) (readFrom((ShareStoryContent)sharecontent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareStoryContent>
	//    3    5:invokevirtual   #55  <Method ShareStoryContent$Builder readFrom(ShareStoryContent)>
	//    4    8:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareStoryContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareStoryContent>
	//    3    5:invokevirtual   #55  <Method ShareStoryContent$Builder readFrom(ShareStoryContent)>
	//    4    8:areturn         
	}

	public ShareStoryContent$Builder readFrom(ShareStoryContent sharestorycontent)
	{
		if(sharestorycontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareStoryContent$Builder)super.readFrom(((ShareContent) (sharestorycontent)))).setBackgroundAsset(sharestorycontent.getBackgroundAsset()).setStickerAsset(sharestorycontent.getStickerAsset()).setBackgroundColorList(sharestorycontent.getBackgroundColorList()).setAttributionLink(sharestorycontent.getAttributionLink());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #58  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
	//    7   11:checkcast       #2   <Class ShareStoryContent$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #62  <Method ShareMedia ShareStoryContent.getBackgroundAsset()>
	//   10   18:invokevirtual   #66  <Method ShareStoryContent$Builder setBackgroundAsset(ShareMedia)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #70  <Method SharePhoto ShareStoryContent.getStickerAsset()>
	//   13   25:invokevirtual   #74  <Method ShareStoryContent$Builder setStickerAsset(SharePhoto)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #78  <Method List ShareStoryContent.getBackgroundColorList()>
	//   16   32:invokevirtual   #82  <Method ShareStoryContent$Builder setBackgroundColorList(List)>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #86  <Method String ShareStoryContent.getAttributionLink()>
	//   19   39:invokevirtual   #90  <Method ShareStoryContent$Builder setAttributionLink(String)>
	//   20   42:areturn         
	}

	public ShareStoryContent$Builder setAttributionLink(String s)
	{
		mAttributionLink = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String mAttributionLink>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareStoryContent$Builder setBackgroundAsset(ShareMedia sharemedia)
	{
		mBackgroundAsset = sharemedia;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field ShareMedia mBackgroundAsset>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareStoryContent$Builder setBackgroundColorList(List list)
	{
		mBackgroundColorList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field List mBackgroundColorList>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareStoryContent$Builder setStickerAsset(SharePhoto sharephoto)
	{
		mStickerAsset = sharephoto;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field SharePhoto mStickerAsset>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	static final String TAG = "ShareStoryContent$Builder";
	private String mAttributionLink;
	private ShareMedia mBackgroundAsset;
	private List mBackgroundColorList;
	private SharePhoto mStickerAsset;

	static 
	{
	//    0    0:return          
	}


/*
	static ShareMedia access$000(ShareStoryContent$Builder sharestorycontent$builder)
	{
		return sharestorycontent$builder.mBackgroundAsset;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ShareMedia mBackgroundAsset>
	//    2    4:areturn         
	}

*/


/*
	static SharePhoto access$100(ShareStoryContent$Builder sharestorycontent$builder)
	{
		return sharestorycontent$builder.mStickerAsset;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field SharePhoto mStickerAsset>
	//    2    4:areturn         
	}

*/


/*
	static List access$200(ShareStoryContent$Builder sharestorycontent$builder)
	{
		return sharestorycontent$builder.mBackgroundColorList;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List mBackgroundColorList>
	//    2    4:areturn         
	}

*/


/*
	static String access$300(ShareStoryContent$Builder sharestorycontent$builder)
	{
		return sharestorycontent$builder.mAttributionLink;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String mAttributionLink>
	//    2    4:areturn         
	}

*/

	public ShareStoryContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void ShareContent$Builder()>
	//    2    4:return          
	}
}
