// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import java.util.*;

// Referenced classes of package com.facebook.share.model:
//			ShareMedia, ShareModelBuilder, ShareModel

public final class SharePhoto extends ShareMedia
{
	public static final class Builder extends ShareMedia.Builder
	{

		public static List readListFrom(Parcel parcel)
		{
			ArrayList arraylist = new ArrayList();
		//    0    0:new             #41  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #42  <Method void ArrayList()>
		//    3    7:astore_1        
			parcel.readTypedList(((List) (arraylist)), SharePhoto.CREATOR);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getstatic       #46  <Field android.os.Parcelable$Creator SharePhoto.CREATOR>
		//    7   13:invokevirtual   #52  <Method void Parcel.readTypedList(List, android.os.Parcelable$Creator)>
			return ((List) (arraylist));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public static void writeListTo(Parcel parcel, List list)
		{
			ArrayList arraylist = new ArrayList();
		//    0    0:new             #41  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #42  <Method void ArrayList()>
		//    3    7:astore_2        
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) ((SharePhoto)((Iterator) (list)).next()))));
		//    4    8:aload_1         
		//    5    9:invokeinterface #62  <Method Iterator List.iterator()>
		//    6   14:astore_1        
		//    7   15:aload_1         
		//    8   16:invokeinterface #68  <Method boolean Iterator.hasNext()>
		//    9   21:ifeq            43
		//   10   24:aload_2         
		//   11   25:aload_1         
		//   12   26:invokeinterface #72  <Method Object Iterator.next()>
		//   13   31:checkcast       #7   <Class SharePhoto>
		//   14   34:invokeinterface #76  <Method boolean List.add(Object)>
		//   15   39:pop             
		//*  16   40:goto            15
			parcel.writeTypedList(((List) (arraylist)));
		//   17   43:aload_0         
		//   18   44:aload_2         
		//   19   45:invokevirtual   #80  <Method void Parcel.writeTypedList(List)>
		//   20   48:return          
		}

		public SharePhoto build()
		{
			return new SharePhoto(this);
		//    0    0:new             #7   <Class SharePhoto>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #86  <Method void SharePhoto(SharePhoto$Builder, SharePhoto$1)>
		//    5    9:areturn         
		}

		public volatile Object build()
		{
			return ((Object) (build()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #88  <Method SharePhoto build()>
		//    2    4:areturn         
		}

		Bitmap getBitmap()
		{
			return bitmap;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bitmap bitmap>
		//    2    4:areturn         
		}

		Uri getImageUrl()
		{
			return imageUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Uri imageUrl>
		//    2    4:areturn         
		}

		public volatile ShareMedia.Builder readFrom(ShareMedia sharemedia)
		{
			return ((ShareMedia.Builder) (readFrom((SharePhoto)sharemedia)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class SharePhoto>
		//    3    5:invokevirtual   #97  <Method SharePhoto$Builder readFrom(SharePhoto)>
		//    4    8:areturn         
		}

		public volatile ShareModelBuilder readFrom(Parcel parcel)
		{
			return ((ShareModelBuilder) (readFrom(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #101 <Method SharePhoto$Builder readFrom(Parcel)>
		//    3    5:areturn         
		}

		public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
		{
			return ((ShareModelBuilder) (readFrom((SharePhoto)sharemodel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class SharePhoto>
		//    3    5:invokevirtual   #97  <Method SharePhoto$Builder readFrom(SharePhoto)>
		//    4    8:areturn         
		}

		public Builder readFrom(Parcel parcel)
		{
			return readFrom((SharePhoto)parcel.readParcelable(((Class) (com/facebook/share/model/SharePhoto)).getClassLoader()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #7   <Class SharePhoto>
		//    3    4:invokevirtual   #108 <Method ClassLoader Class.getClassLoader()>
		//    4    7:invokevirtual   #112 <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
		//    5   10:checkcast       #7   <Class SharePhoto>
		//    6   13:invokevirtual   #97  <Method SharePhoto$Builder readFrom(SharePhoto)>
		//    7   16:areturn         
		}

		public Builder readFrom(SharePhoto sharephoto)
		{
			if(sharephoto == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return this;
		//    2    4:aload_0         
		//    3    5:areturn         
			else
				return ((Builder)super.readFrom(((ShareMedia) (sharephoto)))).setBitmap(sharephoto.getBitmap()).setImageUrl(sharephoto.getImageUrl()).setUserGenerated(sharephoto.getUserGenerated()).setCaption(sharephoto.getCaption());
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokespecial   #114 <Method ShareMedia$Builder ShareMedia$Builder.readFrom(ShareMedia)>
		//    7   11:checkcast       #2   <Class SharePhoto$Builder>
		//    8   14:aload_1         
		//    9   15:invokevirtual   #116 <Method Bitmap SharePhoto.getBitmap()>
		//   10   18:invokevirtual   #120 <Method SharePhoto$Builder setBitmap(Bitmap)>
		//   11   21:aload_1         
		//   12   22:invokevirtual   #122 <Method Uri SharePhoto.getImageUrl()>
		//   13   25:invokevirtual   #126 <Method SharePhoto$Builder setImageUrl(Uri)>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #129 <Method boolean SharePhoto.getUserGenerated()>
		//   16   32:invokevirtual   #133 <Method SharePhoto$Builder setUserGenerated(boolean)>
		//   17   35:aload_1         
		//   18   36:invokevirtual   #137 <Method String SharePhoto.getCaption()>
		//   19   39:invokevirtual   #141 <Method SharePhoto$Builder setCaption(String)>
		//   20   42:areturn         
		}

		public Builder setBitmap(Bitmap bitmap1)
		{
			bitmap = bitmap1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field Bitmap bitmap>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setCaption(String s)
		{
			caption = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field String caption>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setImageUrl(Uri uri)
		{
			imageUrl = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field Uri imageUrl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setUserGenerated(boolean flag)
		{
			userGenerated = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #33  <Field boolean userGenerated>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private Bitmap bitmap;
		private String caption;
		private Uri imageUrl;
		private boolean userGenerated;


/*
		static Bitmap access$000(Builder builder)
		{
			return builder.bitmap;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Bitmap bitmap>
		//    2    4:areturn         
		}

*/


/*
		static Uri access$100(Builder builder)
		{
			return builder.imageUrl;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Uri imageUrl>
		//    2    4:areturn         
		}

*/


/*
		static boolean access$200(Builder builder)
		{
			return builder.userGenerated;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field boolean userGenerated>
		//    2    4:ireturn         
		}

*/


/*
		static String access$300(Builder builder)
		{
			return builder.caption;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field String caption>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void ShareMedia$Builder()>
		//    2    4:return          
		}
	}


	SharePhoto(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void ShareMedia(Parcel)>
		bitmap = (Bitmap)parcel.readParcelable(((Class) (android/graphics/Bitmap)).getClassLoader());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #33  <Class Bitmap>
	//    6    9:invokevirtual   #39  <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #45  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    8   15:checkcast       #33  <Class Bitmap>
	//    9   18:putfield        #47  <Field Bitmap bitmap>
		imageUrl = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:ldc1            #49  <Class Uri>
	//   13   25:invokevirtual   #39  <Method ClassLoader Class.getClassLoader()>
	//   14   28:invokevirtual   #45  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   15   31:checkcast       #49  <Class Uri>
	//   16   34:putfield        #51  <Field Uri imageUrl>
		boolean flag;
		if(parcel.readByte() != 0)
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #55  <Method byte Parcel.readByte()>
	//*  19   41:ifeq            49
			flag = true;
	//   20   44:iconst_1        
	//   21   45:istore_2        
		else
	//*  22   46:goto            51
			flag = false;
	//   23   49:iconst_0        
	//   24   50:istore_2        
		userGenerated = flag;
	//   25   51:aload_0         
	//   26   52:iload_2         
	//   27   53:putfield        #57  <Field boolean userGenerated>
		caption = parcel.readString();
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #61  <Method String Parcel.readString()>
	//   31   61:putfield        #63  <Field String caption>
	//   32   64:return          
	}

	private SharePhoto(Builder builder)
	{
		super(((ShareMedia.Builder) (builder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void ShareMedia(ShareMedia$Builder)>
		bitmap = builder.bitmap;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #71  <Method Bitmap SharePhoto$Builder.access$000(SharePhoto$Builder)>
	//    6   10:putfield        #47  <Field Bitmap bitmap>
		imageUrl = builder.imageUrl;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #75  <Method Uri SharePhoto$Builder.access$100(SharePhoto$Builder)>
	//   10   18:putfield        #51  <Field Uri imageUrl>
		userGenerated = builder.userGenerated;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #79  <Method boolean SharePhoto$Builder.access$200(SharePhoto$Builder)>
	//   14   26:putfield        #57  <Field boolean userGenerated>
		caption = builder.caption;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokestatic    #83  <Method String SharePhoto$Builder.access$300(SharePhoto$Builder)>
	//   18   34:putfield        #63  <Field String caption>
	//   19   37:return          
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Bitmap getBitmap()
	{
		return bitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Bitmap bitmap>
	//    2    4:areturn         
	}

	public String getCaption()
	{
		return caption;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String caption>
	//    2    4:areturn         
	}

	public Uri getImageUrl()
	{
		return imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Uri imageUrl>
	//    2    4:areturn         
	}

	public boolean getUserGenerated()
	{
		return userGenerated;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean userGenerated>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #101 <Method void ShareMedia.writeToParcel(Parcel, int)>
		parcel.writeParcelable(((android.os.Parcelable) (bitmap)), 0);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field Bitmap bitmap>
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #105 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeParcelable(((android.os.Parcelable) (imageUrl)), 0);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #51  <Field Uri imageUrl>
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #105 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>
		parcel.writeByte((byte)userGenerated);
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #57  <Field boolean userGenerated>
	//   17   29:int2byte        
	//   18   30:invokevirtual   #109 <Method void Parcel.writeByte(byte)>
		parcel.writeString(caption);
	//   19   33:aload_1         
	//   20   34:aload_0         
	//   21   35:getfield        #63  <Field String caption>
	//   22   38:invokevirtual   #113 <Method void Parcel.writeString(String)>
	//   23   41:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public SharePhoto createFromParcel(Parcel parcel)
		{
			return new SharePhoto(parcel);
		//    0    0:new             #9   <Class SharePhoto>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void SharePhoto(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method SharePhoto createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public SharePhoto[] newArray(int i)
		{
			return new SharePhoto[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SharePhoto[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method SharePhoto[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final Bitmap bitmap;
	private final String caption;
	private final Uri imageUrl;
	private final boolean userGenerated;

	static 
	{
	//    0    0:new             #6   <Class SharePhoto$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void SharePhoto$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
