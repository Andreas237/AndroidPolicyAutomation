// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//			ShareModelBuilder, ShareContent, ShareHashtag, ShareModel

public static abstract class ShareContent$Builder
	implements ShareModelBuilder
{

	public ShareContent$Builder readFrom(ShareContent sharecontent)
	{
		if(sharecontent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return setContentUrl(sharecontent.getContentUrl()).setPeopleIds(sharecontent.getPeopleIds()).setPlaceId(sharecontent.getPlaceId()).setPageId(sharecontent.getPageId()).setRef(sharecontent.getRef());
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #54  <Method Uri ShareContent.getContentUrl()>
	//    7   11:invokevirtual   #58  <Method ShareContent$Builder setContentUrl(Uri)>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #62  <Method List ShareContent.getPeopleIds()>
	//   10   18:invokevirtual   #66  <Method ShareContent$Builder setPeopleIds(List)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #70  <Method String ShareContent.getPlaceId()>
	//   13   25:invokevirtual   #74  <Method ShareContent$Builder setPlaceId(String)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #77  <Method String ShareContent.getPageId()>
	//   16   32:invokevirtual   #80  <Method ShareContent$Builder setPageId(String)>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #83  <Method String ShareContent.getRef()>
	//   19   39:invokevirtual   #86  <Method ShareContent$Builder setRef(String)>
	//   20   42:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((ShareContent)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class ShareContent>
	//    3    5:invokevirtual   #91  <Method ShareContent$Builder readFrom(ShareContent)>
	//    4    8:areturn         
	}

	public ShareContent$Builder setContentUrl(Uri uri)
	{
		contentUrl = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field Uri contentUrl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareContent$Builder setPageId(String s)
	{
		pageId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String pageId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareContent$Builder setPeopleIds(List list)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			list = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            14
			list = Collections.unmodifiableList(list);
	//    5    9:aload_1         
	//    6   10:invokestatic    #101 <Method List Collections.unmodifiableList(List)>
	//    7   13:astore_1        
		peopleIds = list;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #34  <Field List peopleIds>
		return this;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	public ShareContent$Builder setPlaceId(String s)
	{
		placeId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field String placeId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareContent$Builder setRef(String s)
	{
		ref = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String ref>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ShareContent$Builder setShareHashtag(ShareHashtag sharehashtag)
	{
		hashtag = sharehashtag;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field ShareHashtag hashtag>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private Uri contentUrl;
	private ShareHashtag hashtag;
	private String pageId;
	private List peopleIds;
	private String placeId;
	private String ref;


/*
	static Uri access$000(ShareContent$Builder sharecontent$builder)
	{
		return sharecontent$builder.contentUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Uri contentUrl>
	//    2    4:areturn         
	}

*/


/*
	static List access$100(ShareContent$Builder sharecontent$builder)
	{
		return sharecontent$builder.peopleIds;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field List peopleIds>
	//    2    4:areturn         
	}

*/


/*
	static String access$200(ShareContent$Builder sharecontent$builder)
	{
		return sharecontent$builder.placeId;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field String placeId>
	//    2    4:areturn         
	}

*/


/*
	static String access$300(ShareContent$Builder sharecontent$builder)
	{
		return sharecontent$builder.pageId;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String pageId>
	//    2    4:areturn         
	}

*/


/*
	static String access$400(ShareContent$Builder sharecontent$builder)
	{
		return sharecontent$builder.ref;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String ref>
	//    2    4:areturn         
	}

*/


/*
	static ShareHashtag access$500(ShareContent$Builder sharecontent$builder)
	{
		return sharecontent$builder.hashtag;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ShareHashtag hashtag>
	//    2    4:areturn         
	}

*/

	public ShareContent$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}
}
