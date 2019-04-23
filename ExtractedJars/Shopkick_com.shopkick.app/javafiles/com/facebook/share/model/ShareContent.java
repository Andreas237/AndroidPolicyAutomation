// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import java.util.*;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareHashtag, ShareModelBuilder

public abstract class ShareContent
	implements ShareModel
{
	public static abstract class Builder
		implements ShareModelBuilder
	{

		public Builder readFrom(ShareContent sharecontent)
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

		public Builder setContentUrl(Uri uri)
		{
			contentUrl = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field Uri contentUrl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPageId(String s)
		{
			pageId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field String pageId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPeopleIds(List list)
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

		public Builder setPlaceId(String s)
		{
			placeId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field String placeId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRef(String s)
		{
			ref = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field String ref>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setShareHashtag(ShareHashtag sharehashtag)
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
		static Uri access$000(Builder builder)
		{
			return builder.contentUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Uri contentUrl>
		//    2    4:areturn         
		}

*/


/*
		static List access$100(Builder builder)
		{
			return builder.peopleIds;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field List peopleIds>
		//    2    4:areturn         
		}

*/


/*
		static String access$200(Builder builder)
		{
			return builder.placeId;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field String placeId>
		//    2    4:areturn         
		}

*/


/*
		static String access$300(Builder builder)
		{
			return builder.pageId;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field String pageId>
		//    2    4:areturn         
		}

*/


/*
		static String access$400(Builder builder)
		{
			return builder.ref;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field String ref>
		//    2    4:areturn         
		}

*/


/*
		static ShareHashtag access$500(Builder builder)
		{
			return builder.hashtag;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field ShareHashtag hashtag>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
		//    2    4:return          
		}
	}


	protected ShareContent(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		contentUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #28  <Class Uri>
	//    5    8:invokevirtual   #34  <Method ClassLoader Class.getClassLoader()>
	//    6   11:invokevirtual   #40  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    7   14:checkcast       #28  <Class Uri>
	//    8   17:putfield        #42  <Field Uri contentUrl>
		peopleIds = readUnmodifiableStringList(parcel);
	//    9   20:aload_0         
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokespecial   #46  <Method List readUnmodifiableStringList(Parcel)>
	//   13   26:putfield        #48  <Field List peopleIds>
		placeId = parcel.readString();
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #52  <Method String Parcel.readString()>
	//   17   34:putfield        #54  <Field String placeId>
		pageId = parcel.readString();
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:invokevirtual   #52  <Method String Parcel.readString()>
	//   21   42:putfield        #56  <Field String pageId>
		ref = parcel.readString();
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:invokevirtual   #52  <Method String Parcel.readString()>
	//   25   50:putfield        #58  <Field String ref>
		hashtag = (new ShareHashtag.Builder()).readFrom(parcel).build();
	//   26   53:aload_0         
	//   27   54:new             #60  <Class ShareHashtag$Builder>
	//   28   57:dup             
	//   29   58:invokespecial   #61  <Method void ShareHashtag$Builder()>
	//   30   61:aload_1         
	//   31   62:invokevirtual   #65  <Method ShareHashtag$Builder ShareHashtag$Builder.readFrom(Parcel)>
	//   32   65:invokevirtual   #69  <Method ShareHashtag ShareHashtag$Builder.build()>
	//   33   68:putfield        #71  <Field ShareHashtag hashtag>
	//   34   71:return          
	}

	protected ShareContent(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		contentUrl = builder.contentUrl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #77  <Method Uri ShareContent$Builder.access$000(ShareContent$Builder)>
	//    5    9:putfield        #42  <Field Uri contentUrl>
		peopleIds = builder.peopleIds;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #81  <Method List ShareContent$Builder.access$100(ShareContent$Builder)>
	//    9   17:putfield        #48  <Field List peopleIds>
		placeId = builder.placeId;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #85  <Method String ShareContent$Builder.access$200(ShareContent$Builder)>
	//   13   25:putfield        #54  <Field String placeId>
		pageId = builder.pageId;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #88  <Method String ShareContent$Builder.access$300(ShareContent$Builder)>
	//   17   33:putfield        #56  <Field String pageId>
		ref = builder.ref;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokestatic    #91  <Method String ShareContent$Builder.access$400(ShareContent$Builder)>
	//   21   41:putfield        #58  <Field String ref>
		hashtag = builder.hashtag;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokestatic    #95  <Method ShareHashtag ShareContent$Builder.access$500(ShareContent$Builder)>
	//   25   49:putfield        #71  <Field ShareHashtag hashtag>
	//   26   52:return          
	}

	private List readUnmodifiableStringList(Parcel parcel)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #97  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void ArrayList()>
	//    3    7:astore_2        
		parcel.readStringList(((List) (arraylist)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #102 <Method void Parcel.readStringList(List)>
		if(((List) (arraylist)).size() == 0)
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #108 <Method int List.size()>
	//*   9   19:ifne            24
			return null;
	//   10   22:aconst_null     
	//   11   23:areturn         
		else
			return Collections.unmodifiableList(((List) (arraylist)));
	//   12   24:aload_2         
	//   13   25:invokestatic    #114 <Method List Collections.unmodifiableList(List)>
	//   14   28:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Uri getContentUrl()
	{
		return contentUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Uri contentUrl>
	//    2    4:areturn         
	}

	public String getPageId()
	{
		return pageId;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String pageId>
	//    2    4:areturn         
	}

	public List getPeopleIds()
	{
		return peopleIds;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List peopleIds>
	//    2    4:areturn         
	}

	public String getPlaceId()
	{
		return placeId;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String placeId>
	//    2    4:areturn         
	}

	public String getRef()
	{
		return ref;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String ref>
	//    2    4:areturn         
	}

	public ShareHashtag getShareHashtag()
	{
		return hashtag;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field ShareHashtag hashtag>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelable(((android.os.Parcelable) (contentUrl)), 0);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field Uri contentUrl>
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #134 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeStringList(peopleIds);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #48  <Field List peopleIds>
	//    8   14:invokevirtual   #137 <Method void Parcel.writeStringList(List)>
		parcel.writeString(placeId);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #54  <Field String placeId>
	//   12   22:invokevirtual   #141 <Method void Parcel.writeString(String)>
		parcel.writeString(pageId);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #56  <Field String pageId>
	//   16   30:invokevirtual   #141 <Method void Parcel.writeString(String)>
		parcel.writeString(ref);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #58  <Field String ref>
	//   20   38:invokevirtual   #141 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((android.os.Parcelable) (hashtag)), 0);
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #71  <Field ShareHashtag hashtag>
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #134 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
	//   26   50:return          
	}

	private final Uri contentUrl;
	private final ShareHashtag hashtag;
	private final String pageId;
	private final List peopleIds;
	private final String placeId;
	private final String ref;
}
