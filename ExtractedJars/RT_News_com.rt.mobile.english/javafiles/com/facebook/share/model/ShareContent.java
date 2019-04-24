// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import java.util.*;

// Referenced classes of package com.facebook.share.model:
//			ShareModel, ShareModelBuilder

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
				return setContentUrl(sharecontent.getContentUrl()).setPeopleIds(sharecontent.getPeopleIds()).setPlaceId(sharecontent.getPlaceId()).setRef(sharecontent.getRef());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #44  <Method Uri ShareContent.getContentUrl()>
		//    7   11:invokevirtual   #48  <Method ShareContent$Builder setContentUrl(Uri)>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #52  <Method List ShareContent.getPeopleIds()>
		//   10   18:invokevirtual   #56  <Method ShareContent$Builder setPeopleIds(List)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #60  <Method String ShareContent.getPlaceId()>
		//   13   25:invokevirtual   #64  <Method ShareContent$Builder setPlaceId(String)>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #67  <Method String ShareContent.getRef()>
		//   16   32:invokevirtual   #70  <Method ShareContent$Builder setRef(String)>
		//   17   35:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class ShareContent>
		//    3    5:invokevirtual   #75  <Method ShareContent$Builder readFrom(ShareContent)>
		//    4    8:areturn         
		}

		public Builder setContentUrl(Uri uri)
		{
			contentUrl = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field Uri contentUrl>
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
		//    6   10:invokestatic    #84  <Method List Collections.unmodifiableList(List)>
		//    7   13:astore_1        
			peopleIds = list;
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:putfield        #31  <Field List peopleIds>
			return this;
		//   11   19:aload_0         
		//   12   20:areturn         
		}

		public Builder setPlaceId(String s)
		{
			placeId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field String placeId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setRef(String s)
		{
			ref = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field String ref>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private Uri contentUrl;
		private List peopleIds;
		private String placeId;
		private String ref;


/*
		static Uri access$000(Builder builder)
		{
			return builder.contentUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Uri contentUrl>
		//    2    4:areturn         
		}

*/


/*
		static List access$100(Builder builder)
		{
			return builder.peopleIds;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field List peopleIds>
		//    2    4:areturn         
		}

*/


/*
		static String access$200(Builder builder)
		{
			return builder.placeId;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field String placeId>
		//    2    4:areturn         
		}

*/


/*
		static String access$300(Builder builder)
		{
			return builder.ref;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field String ref>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
		//    2    4:return          
		}
	}


	protected ShareContent(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		contentUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #25  <Class Uri>
	//    5    8:invokevirtual   #31  <Method ClassLoader Class.getClassLoader()>
	//    6   11:invokevirtual   #37  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    7   14:checkcast       #25  <Class Uri>
	//    8   17:putfield        #39  <Field Uri contentUrl>
		peopleIds = readUnmodifiableStringList(parcel);
	//    9   20:aload_0         
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokespecial   #43  <Method List readUnmodifiableStringList(Parcel)>
	//   13   26:putfield        #45  <Field List peopleIds>
		placeId = parcel.readString();
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #49  <Method String Parcel.readString()>
	//   17   34:putfield        #51  <Field String placeId>
		ref = parcel.readString();
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:invokevirtual   #49  <Method String Parcel.readString()>
	//   21   42:putfield        #53  <Field String ref>
	//   22   45:return          
	}

	protected ShareContent(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		contentUrl = builder.contentUrl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #59  <Method Uri ShareContent$Builder.access$000(ShareContent$Builder)>
	//    5    9:putfield        #39  <Field Uri contentUrl>
		peopleIds = builder.peopleIds;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #63  <Method List ShareContent$Builder.access$100(ShareContent$Builder)>
	//    9   17:putfield        #45  <Field List peopleIds>
		placeId = builder.placeId;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #67  <Method String ShareContent$Builder.access$200(ShareContent$Builder)>
	//   13   25:putfield        #51  <Field String placeId>
		ref = builder.ref;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokestatic    #70  <Method String ShareContent$Builder.access$300(ShareContent$Builder)>
	//   17   33:putfield        #53  <Field String ref>
	//   18   36:return          
	}

	private List readUnmodifiableStringList(Parcel parcel)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #72  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void ArrayList()>
	//    3    7:astore_2        
		parcel.readStringList(((List) (arraylist)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #77  <Method void Parcel.readStringList(List)>
		if(((List) (arraylist)).size() == 0)
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #83  <Method int List.size()>
	//*   9   19:ifne            24
			return null;
	//   10   22:aconst_null     
	//   11   23:areturn         
		else
			return Collections.unmodifiableList(((List) (arraylist)));
	//   12   24:aload_2         
	//   13   25:invokestatic    #89  <Method List Collections.unmodifiableList(List)>
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
	//    1    1:getfield        #39  <Field Uri contentUrl>
	//    2    4:areturn         
	}

	public List getPeopleIds()
	{
		return peopleIds;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List peopleIds>
	//    2    4:areturn         
	}

	public String getPlaceId()
	{
		return placeId;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String placeId>
	//    2    4:areturn         
	}

	public String getRef()
	{
		return ref;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String ref>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelable(((android.os.Parcelable) (contentUrl)), 0);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field Uri contentUrl>
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #107 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeStringList(peopleIds);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #45  <Field List peopleIds>
	//    8   14:invokevirtual   #110 <Method void Parcel.writeStringList(List)>
		parcel.writeString(placeId);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field String placeId>
	//   12   22:invokevirtual   #114 <Method void Parcel.writeString(String)>
		parcel.writeString(ref);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #53  <Field String ref>
	//   16   30:invokevirtual   #114 <Method void Parcel.writeString(String)>
	//   17   33:return          
	}

	private final Uri contentUrl;
	private final List peopleIds;
	private final String placeId;
	private final String ref;
}
