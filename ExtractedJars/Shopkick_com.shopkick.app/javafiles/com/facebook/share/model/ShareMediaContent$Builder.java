// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import java.util.*;

// Referenced classes of package com.facebook.share.model:
//			ShareMediaContent, ShareMedia, SharePhoto, ShareVideo, 
//			ShareContent, ShareModel, ShareModelBuilder

public static class ShareMediaContent$Builder extends ShareContent.Builder
{

	public ShareMediaContent$Builder addMedia(List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          37
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); addMedium((ShareMedia)((Iterator) (list)).next()));
	//    2    4:aload_1         
	//    3    5:invokeinterface #32  <Method Iterator List.iterator()>
	//    4   10:astore_1        
	//    5   11:aload_1         
	//    6   12:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            37
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokeinterface #42  <Method Object Iterator.next()>
	//   11   27:checkcast       #44  <Class ShareMedia>
	//   12   30:invokevirtual   #48  <Method ShareMediaContent$Builder addMedium(ShareMedia)>
	//   13   33:pop             
	//*  14   34:goto            11
		return this;
	//   15   37:aload_0         
	//   16   38:areturn         
	}

	public ShareMediaContent$Builder addMedium(ShareMedia sharemedia)
	{
label0:
		{
label1:
			{
				if(sharemedia == null)
					break label0;
	//    0    0:aload_1         
	//    1    1:ifnull          80
				if(sharemedia instanceof SharePhoto)
	//*   2    4:aload_1         
	//*   3    5:instanceof      #53  <Class SharePhoto>
	//*   4    8:ifeq            32
				{
					sharemedia = ((ShareMedia) ((new SharePhoto.Builder()).readFrom((SharePhoto)sharemedia).build()));
	//    5   11:new             #55  <Class SharePhoto$Builder>
	//    6   14:dup             
	//    7   15:invokespecial   #56  <Method void SharePhoto$Builder()>
	//    8   18:aload_1         
	//    9   19:checkcast       #53  <Class SharePhoto>
	//   10   22:invokevirtual   #60  <Method SharePhoto$Builder SharePhoto$Builder.readFrom(SharePhoto)>
	//   11   25:invokevirtual   #64  <Method SharePhoto SharePhoto$Builder.build()>
	//   12   28:astore_1        
				} else
	//*  13   29:goto            57
				{
					if(!(sharemedia instanceof ShareVideo))
						break label1;
	//   14   32:aload_1         
	//   15   33:instanceof      #66  <Class ShareVideo>
	//   16   36:ifeq            70
					sharemedia = ((ShareMedia) ((new ShareVideo.Builder()).readFrom((ShareVideo)sharemedia).build()));
	//   17   39:new             #68  <Class ShareVideo$Builder>
	//   18   42:dup             
	//   19   43:invokespecial   #69  <Method void ShareVideo$Builder()>
	//   20   46:aload_1         
	//   21   47:checkcast       #66  <Class ShareVideo>
	//   22   50:invokevirtual   #72  <Method ShareVideo$Builder ShareVideo$Builder.readFrom(ShareVideo)>
	//   23   53:invokevirtual   #75  <Method ShareVideo ShareVideo$Builder.build()>
	//   24   56:astore_1        
				}
				media.add(((Object) (sharemedia)));
	//   25   57:aload_0         
	//   26   58:getfield        #20  <Field List media>
	//   27   61:aload_1         
	//   28   62:invokeinterface #79  <Method boolean List.add(Object)>
	//   29   67:pop             
				return this;
	//   30   68:aload_0         
	//   31   69:areturn         
			}
			throw new IllegalArgumentException("medium must be either a SharePhoto or ShareVideo");
	//   32   70:new             #81  <Class IllegalArgumentException>
	//   33   73:dup             
	//   34   74:ldc1            #83  <String "medium must be either a SharePhoto or ShareVideo">
	//   35   76:invokespecial   #86  <Method void IllegalArgumentException(String)>
	//   36   79:athrow          
		}
		return this;
	//   37   80:aload_0         
	//   38   81:areturn         
	}

	public ShareMediaContent build()
	{
		return new ShareMediaContent(this, ((ShareMediaContent._cls1) (null)));
	//    0    0:new             #7   <Class ShareMediaContent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #90  <Method void ShareMediaContent(ShareMediaContent$Builder, ShareMediaContent$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method ShareMediaContent build()>
	//    2    4:areturn         
	}

	public volatile ShareContent.Builder readFrom(ShareContent sharecontent)
	{
		return ((ShareContent.Builder) (readFrom((ShareMediaContent)sharecontent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareMediaContent>
	//    3    5:invokevirtual   #96  <Method ShareMediaContent$Builder readFrom(ShareMediaContent)>
	//    4    8:areturn         
	}

	public ShareMediaContent$Builder readFrom(ShareMediaContent sharemediacontent)
	{
		if(sharemediacontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((ShareMediaContent$Builder)super.readFrom(((ShareContent) (sharemediacontent)))).addMedia(sharemediacontent.getMedia());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #98  <Method ShareContent$Builder ShareContent$Builder.readFrom(ShareContent)>
	//    7   11:checkcast       #2   <Class ShareMediaContent$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #102 <Method List ShareMediaContent.getMedia()>
	//   10   18:invokevirtual   #104 <Method ShareMediaContent$Builder addMedia(List)>
	//   11   21:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareMediaContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class ShareMediaContent>
	//    3    5:invokevirtual   #96  <Method ShareMediaContent$Builder readFrom(ShareMediaContent)>
	//    4    8:areturn         
	}

	public ShareMediaContent$Builder setMedia(List list)
	{
		media.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List media>
	//    2    4:invokeinterface #109 <Method void List.clear()>
		addMedia(list);
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:invokevirtual   #104 <Method ShareMediaContent$Builder addMedia(List)>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	private final List media = new ArrayList();


/*
	static List access$000(ShareMediaContent$Builder sharemediacontent$builder)
	{
		return sharemediacontent$builder.media;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List media>
	//    2    4:areturn         
	}

*/

	public ShareMediaContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ShareContent$Builder()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List media>
	//    7   15:return          
	}
}
