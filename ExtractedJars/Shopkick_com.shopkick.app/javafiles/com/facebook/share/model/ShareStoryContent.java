// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.*;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareMedia, SharePhoto, ShareModel, 
//			ShareModelBuilder

public final class ShareStoryContent extends ShareContent
{
	public static final class Builder extends ShareContent.Builder
	{

		public ShareStoryContent build()
		{
			return new ShareStoryContent(this);
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

		public Builder readFrom(ShareStoryContent sharestorycontent)
		{
			if(sharestorycontent == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return ((Builder)super.readFrom(((ShareContent) (sharestorycontent)))).setBackgroundAsset(sharestorycontent.getBackgroundAsset()).setStickerAsset(sharestorycontent.getStickerAsset()).setBackgroundColorList(sharestorycontent.getBackgroundColorList()).setAttributionLink(sharestorycontent.getAttributionLink());
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

		public Builder setAttributionLink(String s)
		{
			mAttributionLink = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #42  <Field String mAttributionLink>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setBackgroundAsset(ShareMedia sharemedia)
		{
			mBackgroundAsset = sharemedia;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field ShareMedia mBackgroundAsset>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setBackgroundColorList(List list)
		{
			mBackgroundColorList = list;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field List mBackgroundColorList>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setStickerAsset(SharePhoto sharephoto)
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
		static ShareMedia access$000(Builder builder)
		{
			return builder.mBackgroundAsset;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field ShareMedia mBackgroundAsset>
		//    2    4:areturn         
		}

*/


/*
		static SharePhoto access$100(Builder builder)
		{
			return builder.mStickerAsset;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field SharePhoto mStickerAsset>
		//    2    4:areturn         
		}

*/


/*
		static List access$200(Builder builder)
		{
			return builder.mBackgroundColorList;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field List mBackgroundColorList>
		//    2    4:areturn         
		}

*/


/*
		static String access$300(Builder builder)
		{
			return builder.mAttributionLink;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field String mAttributionLink>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void ShareContent$Builder()>
		//    2    4:return          
		}
	}


	ShareStoryContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void ShareContent(Parcel)>
		mBackgroundAsset = (ShareMedia)parcel.readParcelable(((Class) (com/facebook/share/model/ShareMedia)).getClassLoader());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #36  <Class ShareMedia>
	//    6    9:invokevirtual   #42  <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #48  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    8   15:checkcast       #36  <Class ShareMedia>
	//    9   18:putfield        #50  <Field ShareMedia mBackgroundAsset>
		mStickerAsset = (SharePhoto)parcel.readParcelable(((Class) (com/facebook/share/model/SharePhoto)).getClassLoader());
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #52  <Class SharePhoto>
	//   13   25:invokevirtual   #42  <Method ClassLoader Class.getClassLoader()>
	//   14   28:invokevirtual   #48  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   15   31:checkcast       #52  <Class SharePhoto>
	//   16   34:putfield        #54  <Field SharePhoto mStickerAsset>
		mBackgroundColorList = readUnmodifiableStringList(parcel);
	//   17   37:aload_0         
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #58  <Method List readUnmodifiableStringList(Parcel)>
	//   21   43:putfield        #60  <Field List mBackgroundColorList>
		mAttributionLink = parcel.readString();
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:invokevirtual   #64  <Method String Parcel.readString()>
	//   25   51:putfield        #66  <Field String mAttributionLink>
	//   26   54:return          
	}

	private ShareStoryContent(Builder builder)
	{
		super(((ShareContent.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void ShareContent(ShareContent$Builder)>
		mBackgroundAsset = builder.mBackgroundAsset;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #74  <Method ShareMedia ShareStoryContent$Builder.access$000(ShareStoryContent$Builder)>
	//    6   10:putfield        #50  <Field ShareMedia mBackgroundAsset>
		mStickerAsset = builder.mStickerAsset;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #78  <Method SharePhoto ShareStoryContent$Builder.access$100(ShareStoryContent$Builder)>
	//   10   18:putfield        #54  <Field SharePhoto mStickerAsset>
		mBackgroundColorList = builder.mBackgroundColorList;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #82  <Method List ShareStoryContent$Builder.access$200(ShareStoryContent$Builder)>
	//   14   26:putfield        #60  <Field List mBackgroundColorList>
		mAttributionLink = builder.mAttributionLink;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokestatic    #86  <Method String ShareStoryContent$Builder.access$300(ShareStoryContent$Builder)>
	//   18   34:putfield        #66  <Field String mAttributionLink>
	//   19   37:return          
	}


	private List readUnmodifiableStringList(Parcel parcel)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #91  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void ArrayList()>
	//    3    7:astore_2        
		parcel.readStringList(((List) (arraylist)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #96  <Method void Parcel.readStringList(List)>
		if(((List) (arraylist)).isEmpty())
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #102 <Method boolean List.isEmpty()>
	//*   9   19:ifeq            24
			return null;
	//   10   22:aconst_null     
	//   11   23:areturn         
		else
			return Collections.unmodifiableList(((List) (arraylist)));
	//   12   24:aload_2         
	//   13   25:invokestatic    #108 <Method List Collections.unmodifiableList(List)>
	//   14   28:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getAttributionLink()
	{
		return mAttributionLink;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String mAttributionLink>
	//    2    4:areturn         
	}

	public ShareMedia getBackgroundAsset()
	{
		return mBackgroundAsset;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ShareMedia mBackgroundAsset>
	//    2    4:areturn         
	}

	public List getBackgroundColorList()
	{
		List list = mBackgroundColorList;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field List mBackgroundColorList>
	//    2    4:astore_1        
		if(list == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return Collections.unmodifiableList(list);
	//    7   11:aload_1         
	//    8   12:invokestatic    #108 <Method List Collections.unmodifiableList(List)>
	//    9   15:areturn         
	}

	public SharePhoto getStickerAsset()
	{
		return mStickerAsset;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field SharePhoto mStickerAsset>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #125 <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeParcelable(((android.os.Parcelable) (mBackgroundAsset)), 0);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #50  <Field ShareMedia mBackgroundAsset>
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #129 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (mStickerAsset)), 0);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #54  <Field SharePhoto mStickerAsset>
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #129 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeStringList(mBackgroundColorList);
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #60  <Field List mBackgroundColorList>
	//   17   29:invokevirtual   #132 <Method void Parcel.writeStringList(List)>
		parcel.writeString(mAttributionLink);
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #66  <Field String mAttributionLink>
	//   21   37:invokevirtual   #136 <Method void Parcel.writeString(String)>
	//   22   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareStoryContent createFromParcel(Parcel parcel)
		{
			return new ShareStoryContent(parcel);
		//    0    0:new             #9   <Class ShareStoryContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareStoryContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareStoryContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareStoryContent[] newArray(int i)
		{
			return new ShareStoryContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareStoryContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareStoryContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String mAttributionLink;
	private final ShareMedia mBackgroundAsset;
	private final List mBackgroundColorList;
	private final SharePhoto mStickerAsset;

	static 
	{
	//    0    0:new             #7   <Class ShareStoryContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void ShareStoryContent$1()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
