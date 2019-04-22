// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import java.util.*;

// Referenced classes of package com.facebook.share.model:
//			SharePhotoContent, SharePhoto, ShareContent, ShareModel, 
//			ShareModelBuilder

public static class SharePhotoContent$Builder extends ShareContent.Builder
{

	public SharePhotoContent$Builder addPhoto(SharePhoto sharephoto)
	{
		if(sharephoto != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
			photos.add(((Object) ((new SharePhoto.Builder()).readFrom(sharephoto).build())));
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field List photos>
	//    4    8:new             #28  <Class SharePhoto$Builder>
	//    5   11:dup             
	//    6   12:invokespecial   #29  <Method void SharePhoto$Builder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #33  <Method SharePhoto$Builder SharePhoto$Builder.readFrom(SharePhoto)>
	//    9   19:invokevirtual   #37  <Method SharePhoto SharePhoto$Builder.build()>
	//   10   22:invokeinterface #43  <Method boolean List.add(Object)>
	//   11   27:pop             
		return this;
	//   12   28:aload_0         
	//   13   29:areturn         
	}

	public SharePhotoContent$Builder addPhotos(List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          37
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); addPhoto((SharePhoto)((Iterator) (list)).next()));
	//    2    4:aload_1         
	//    3    5:invokeinterface #50  <Method Iterator List.iterator()>
	//    4   10:astore_1        
	//    5   11:aload_1         
	//    6   12:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            37
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokeinterface #60  <Method Object Iterator.next()>
	//   11   27:checkcast       #62  <Class SharePhoto>
	//   12   30:invokevirtual   #64  <Method SharePhotoContent$Builder addPhoto(SharePhoto)>
	//   13   33:pop             
	//*  14   34:goto            11
		return this;
	//   15   37:aload_0         
	//   16   38:areturn         
	}

	public SharePhotoContent build()
	{
		return new SharePhotoContent(this, ((SharePhotoContent._cls1) (null)));
	//    0    0:new             #7   <Class SharePhotoContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #70  <Method void SharePhotoContent(SharePhotoContent$Builder, SharePhotoContent$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method SharePhotoContent build()>
	//    2    4:areturn         
	}

	public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
	{
		return ((ShareContent.Builder) (readFrom((SharePhotoContent)sharecontent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class SharePhotoContent>
	//    3    5:invokevirtual   #76  <Method SharePhotoContent$Builder readFrom(SharePhotoContent)>
	//    4    8:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((SharePhotoContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class SharePhotoContent>
	//    3    5:invokevirtual   #76  <Method SharePhotoContent$Builder readFrom(SharePhotoContent)>
	//    4    8:areturn         
	}

	public SharePhotoContent$Builder readFrom(SharePhotoContent sharephotocontent)
	{
		if(sharephotocontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((SharePhotoContent$Builder)super.readFrom(((ShareContent) (sharephotocontent)))).addPhotos(sharephotocontent.getPhotos());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #79  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
	//    7   11:checkcast       #2   <Class SharePhotoContent$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #83  <Method List SharePhotoContent.getPhotos()>
	//   10   18:invokevirtual   #85  <Method SharePhotoContent$Builder addPhotos(List)>
	//   11   21:areturn         
	}

	public SharePhotoContent$Builder setPhotos(List list)
	{
		photos.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List photos>
	//    2    4:invokeinterface #89  <Method void List.clear()>
		addPhotos(list);
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:invokevirtual   #85  <Method SharePhotoContent$Builder addPhotos(List)>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	private final List photos = new ArrayList();


/*
	static List access$000(SharePhotoContent$Builder sharephotocontent$builder)
	{
		return sharephotocontent$builder.photos;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List photos>
	//    2    4:areturn         
	}

*/

	public SharePhotoContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ShareContent$Builder()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List photos>
	//    7   15:return          
	}
}
