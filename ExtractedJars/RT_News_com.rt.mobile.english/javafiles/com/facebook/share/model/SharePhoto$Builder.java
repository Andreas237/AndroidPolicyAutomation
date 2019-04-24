// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import java.util.*;

// Referenced classes of package com.facebook.share.model:
//			SharePhoto, ShareMedia, ShareModelBuilder, ShareModel

public static final class SharePhoto$Builder extends ShareMedia$Builder
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
		return new SharePhoto(this, ((SharePhoto._cls1) (null)));
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

	public volatile ShareMedia$Builder readFrom(ShareMedia sharemedia)
	{
		return ((ShareMedia$Builder) (readFrom((SharePhoto)sharemedia)));
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

	public SharePhoto$Builder readFrom(Parcel parcel)
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

	public SharePhoto$Builder readFrom(SharePhoto sharephoto)
	{
		if(sharephoto == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return this;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return ((SharePhoto$Builder)super.readFrom(((ShareMedia) (sharephoto)))).setBitmap(sharephoto.getBitmap()).setImageUrl(sharephoto.getImageUrl()).setUserGenerated(sharephoto.getUserGenerated()).setCaption(sharephoto.getCaption());
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

	public SharePhoto$Builder setBitmap(Bitmap bitmap1)
	{
		bitmap = bitmap1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Bitmap bitmap>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SharePhoto$Builder setCaption(String s)
	{
		caption = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String caption>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SharePhoto$Builder setImageUrl(Uri uri)
	{
		imageUrl = uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field Uri imageUrl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SharePhoto$Builder setUserGenerated(boolean flag)
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
	static Bitmap access$000(SharePhoto$Builder sharephoto$builder)
	{
		return sharephoto$builder.bitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Bitmap bitmap>
	//    2    4:areturn         
	}

*/


/*
	static Uri access$100(SharePhoto$Builder sharephoto$builder)
	{
		return sharephoto$builder.imageUrl;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Uri imageUrl>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200(SharePhoto$Builder sharephoto$builder)
	{
		return sharephoto$builder.userGenerated;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean userGenerated>
	//    2    4:ireturn         
	}

*/


/*
	static String access$300(SharePhoto$Builder sharephoto$builder)
	{
		return sharephoto$builder.caption;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String caption>
	//    2    4:areturn         
	}

*/

	public SharePhoto$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void ShareMedia$Builder()>
	//    2    4:return          
	}
}
