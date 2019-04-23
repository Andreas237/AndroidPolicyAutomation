// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Parcel;
import com.facebook.share.model.*;

public class ShareFeedContent extends ShareContent
{
	public static final class Builder extends com.facebook.share.model.ShareContent.Builder
	{

		public ShareFeedContent build()
		{
			return new ShareFeedContent(this);
		//    0    0:new             #7   <Class ShareFeedContent>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #48  <Method void ShareFeedContent(ShareFeedContent$Builder, ShareFeedContent$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #51  <Method ShareFeedContent build()>
		//    2    4:areturn         
		}

		public Builder readFrom(ShareFeedContent sharefeedcontent)
		{
			if(sharefeedcontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return ((Builder)super.readFrom(((ShareContent) (sharefeedcontent)))).setToId(sharefeedcontent.getToId()).setLink(sharefeedcontent.getLink()).setLinkName(sharefeedcontent.getLinkName()).setLinkCaption(sharefeedcontent.getLinkCaption()).setLinkDescription(sharefeedcontent.getLinkDescription()).setPicture(sharefeedcontent.getPicture()).setMediaSource(sharefeedcontent.getMediaSource());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #56  <Method com.facebook.share.model.ShareContent$Builder com.facebook.share.model.ShareContent$Builder.readFrom(ShareContent)>
		//    7   11:checkcast       #2   <Class ShareFeedContent$Builder>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #60  <Method String ShareFeedContent.getToId()>
		//   10   18:invokevirtual   #64  <Method ShareFeedContent$Builder setToId(String)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #67  <Method String ShareFeedContent.getLink()>
		//   13   25:invokevirtual   #70  <Method ShareFeedContent$Builder setLink(String)>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #73  <Method String ShareFeedContent.getLinkName()>
		//   16   32:invokevirtual   #76  <Method ShareFeedContent$Builder setLinkName(String)>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #79  <Method String ShareFeedContent.getLinkCaption()>
		//   19   39:invokevirtual   #82  <Method ShareFeedContent$Builder setLinkCaption(String)>
		//   20   42:aload_1         
		//   21   43:invokevirtual   #85  <Method String ShareFeedContent.getLinkDescription()>
		//   22   46:invokevirtual   #88  <Method ShareFeedContent$Builder setLinkDescription(String)>
		//   23   49:aload_1         
		//   24   50:invokevirtual   #91  <Method String ShareFeedContent.getPicture()>
		//   25   53:invokevirtual   #94  <Method ShareFeedContent$Builder setPicture(String)>
		//   26   56:aload_1         
		//   27   57:invokevirtual   #97  <Method String ShareFeedContent.getMediaSource()>
		//   28   60:invokevirtual   #100 <Method ShareFeedContent$Builder setMediaSource(String)>
		//   29   63:areturn         
		}

		public volatile com.facebook.share.model.ShareContent.Builder readFrom(ShareContent sharecontent)
		{
			return ((com.facebook.share.model.ShareContent.Builder) (readFrom((ShareFeedContent)sharecontent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareFeedContent>
		//    3    5:invokevirtual   #102 <Method ShareFeedContent$Builder readFrom(ShareFeedContent)>
		//    4    8:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((ShareFeedContent)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class ShareFeedContent>
		//    3    5:invokevirtual   #102 <Method ShareFeedContent$Builder readFrom(ShareFeedContent)>
		//    4    8:areturn         
		}

		public Builder setLink(String s)
		{
			link = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field String link>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLinkCaption(String s)
		{
			linkCaption = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #34  <Field String linkCaption>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLinkDescription(String s)
		{
			linkDescription = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field String linkDescription>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLinkName(String s)
		{
			linkName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field String linkName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setMediaSource(String s)
		{
			mediaSource = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field String mediaSource>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPicture(String s)
		{
			picture = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field String picture>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setToId(String s)
		{
			toId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field String toId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String link;
		private String linkCaption;
		private String linkDescription;
		private String linkName;
		private String mediaSource;
		private String picture;
		private String toId;


/*
		static String access$000(Builder builder)
		{
			return builder.toId;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field String toId>
		//    2    4:areturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.link;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field String link>
		//    2    4:areturn         
		}

*/


/*
		static String access$200(Builder builder)
		{
			return builder.linkName;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field String linkName>
		//    2    4:areturn         
		}

*/


/*
		static String access$300(Builder builder)
		{
			return builder.linkCaption;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field String linkCaption>
		//    2    4:areturn         
		}

*/


/*
		static String access$400(Builder builder)
		{
			return builder.linkDescription;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field String linkDescription>
		//    2    4:areturn         
		}

*/


/*
		static String access$500(Builder builder)
		{
			return builder.picture;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field String picture>
		//    2    4:areturn         
		}

*/


/*
		static String access$600(Builder builder)
		{
			return builder.mediaSource;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field String mediaSource>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void com.facebook.share.model.ShareContent$Builder()>
		//    2    4:return          
		}
	}


	ShareFeedContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #32  <Method void ShareContent(Parcel)>
		toId = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #38  <Method String Parcel.readString()>
	//    6   10:putfield        #40  <Field String toId>
		link = parcel.readString();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #38  <Method String Parcel.readString()>
	//   10   18:putfield        #42  <Field String link>
		linkName = parcel.readString();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #38  <Method String Parcel.readString()>
	//   14   26:putfield        #44  <Field String linkName>
		linkCaption = parcel.readString();
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #38  <Method String Parcel.readString()>
	//   18   34:putfield        #46  <Field String linkCaption>
		linkDescription = parcel.readString();
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #38  <Method String Parcel.readString()>
	//   22   42:putfield        #48  <Field String linkDescription>
		picture = parcel.readString();
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokevirtual   #38  <Method String Parcel.readString()>
	//   26   50:putfield        #50  <Field String picture>
		mediaSource = parcel.readString();
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #38  <Method String Parcel.readString()>
	//   30   58:putfield        #52  <Field String mediaSource>
	//   31   61:return          
	}

	private ShareFeedContent(Builder builder)
	{
		super(((com.facebook.share.model.ShareContent.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void ShareContent(com.facebook.share.model.ShareContent$Builder)>
		toId = builder.toId;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #60  <Method String ShareFeedContent$Builder.access$000(ShareFeedContent$Builder)>
	//    6   10:putfield        #40  <Field String toId>
		link = builder.link;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #63  <Method String ShareFeedContent$Builder.access$100(ShareFeedContent$Builder)>
	//   10   18:putfield        #42  <Field String link>
		linkName = builder.linkName;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #66  <Method String ShareFeedContent$Builder.access$200(ShareFeedContent$Builder)>
	//   14   26:putfield        #44  <Field String linkName>
		linkCaption = builder.linkCaption;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokestatic    #69  <Method String ShareFeedContent$Builder.access$300(ShareFeedContent$Builder)>
	//   18   34:putfield        #46  <Field String linkCaption>
		linkDescription = builder.linkDescription;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokestatic    #72  <Method String ShareFeedContent$Builder.access$400(ShareFeedContent$Builder)>
	//   22   42:putfield        #48  <Field String linkDescription>
		picture = builder.picture;
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:invokestatic    #75  <Method String ShareFeedContent$Builder.access$500(ShareFeedContent$Builder)>
	//   26   50:putfield        #50  <Field String picture>
		mediaSource = builder.mediaSource;
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokestatic    #78  <Method String ShareFeedContent$Builder.access$600(ShareFeedContent$Builder)>
	//   30   58:putfield        #52  <Field String mediaSource>
	//   31   61:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getLink()
	{
		return link;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String link>
	//    2    4:areturn         
	}

	public String getLinkCaption()
	{
		return linkCaption;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String linkCaption>
	//    2    4:areturn         
	}

	public String getLinkDescription()
	{
		return linkDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String linkDescription>
	//    2    4:areturn         
	}

	public String getLinkName()
	{
		return linkName;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String linkName>
	//    2    4:areturn         
	}

	public String getMediaSource()
	{
		return mediaSource;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String mediaSource>
	//    2    4:areturn         
	}

	public String getPicture()
	{
		return picture;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String picture>
	//    2    4:areturn         
	}

	public String getToId()
	{
		return toId;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String toId>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #94  <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeString(toId);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field String toId>
	//    7   11:invokevirtual   #98  <Method void Parcel.writeString(String)>
		parcel.writeString(link);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #42  <Field String link>
	//   11   19:invokevirtual   #98  <Method void Parcel.writeString(String)>
		parcel.writeString(linkName);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #44  <Field String linkName>
	//   15   27:invokevirtual   #98  <Method void Parcel.writeString(String)>
		parcel.writeString(linkCaption);
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #46  <Field String linkCaption>
	//   19   35:invokevirtual   #98  <Method void Parcel.writeString(String)>
		parcel.writeString(linkDescription);
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #48  <Field String linkDescription>
	//   23   43:invokevirtual   #98  <Method void Parcel.writeString(String)>
		parcel.writeString(picture);
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #50  <Field String picture>
	//   27   51:invokevirtual   #98  <Method void Parcel.writeString(String)>
		parcel.writeString(mediaSource);
	//   28   54:aload_1         
	//   29   55:aload_0         
	//   30   56:getfield        #52  <Field String mediaSource>
	//   31   59:invokevirtual   #98  <Method void Parcel.writeString(String)>
	//   32   62:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareFeedContent createFromParcel(Parcel parcel)
		{
			return new ShareFeedContent(parcel);
		//    0    0:new             #9   <Class ShareFeedContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareFeedContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareFeedContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareFeedContent[] newArray(int i)
		{
			return new ShareFeedContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareFeedContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareFeedContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String link;
	private final String linkCaption;
	private final String linkDescription;
	private final String linkName;
	private final String mediaSource;
	private final String picture;
	private final String toId;

	static 
	{
	//    0    0:new             #7   <Class ShareFeedContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ShareFeedContent$1()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
