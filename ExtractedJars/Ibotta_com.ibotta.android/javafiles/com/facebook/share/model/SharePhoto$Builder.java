// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import java.util.*;

// Referenced classes of package com.facebook.share.model:
//			SharePhoto, ShareMedia, ShareModel, ShareModelBuilder

public static final class SharePhoto$Builder extends ShareMedia$Builder
{

	static List readPhotoListFrom(Parcel parcel)
	{
		Object obj = ((Object) (readListFrom(parcel)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #42  <Method List readListFrom(Parcel)>
	//    2    4:astore_1        
		parcel = ((Parcel) (new ArrayList()));
	//    3    5:new             #44  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void ArrayList()>
	//    6   12:astore_0        
		obj = ((Object) (((List) (obj)).iterator()));
	//    7   13:aload_1         
	//    8   14:invokeinterface #51  <Method Iterator List.iterator()>
	//    9   19:astore_1        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   10   20:aload_1         
	//   11   21:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//   12   26:ifeq            60
			ShareMedia sharemedia = (ShareMedia)((Iterator) (obj)).next();
	//   13   29:aload_1         
	//   14   30:invokeinterface #61  <Method Object Iterator.next()>
	//   15   35:checkcast       #63  <Class ShareMedia>
	//   16   38:astore_2        
			if(sharemedia instanceof SharePhoto)
	//*  17   39:aload_2         
	//*  18   40:instanceof      #7   <Class SharePhoto>
	//*  19   43:ifeq            20
				((List) (parcel)).add(((Object) ((SharePhoto)sharemedia)));
	//   20   46:aload_0         
	//   21   47:aload_2         
	//   22   48:checkcast       #7   <Class SharePhoto>
	//   23   51:invokeinterface #67  <Method boolean List.add(Object)>
	//   24   56:pop             
		} while(true);
	//   25   57:goto            20
		return ((List) (parcel));
	//   26   60:aload_0         
	//   27   61:areturn         
	}

	static void writePhotoListTo(Parcel parcel, int i, List list)
	{
		ShareMedia asharemedia[] = new ShareMedia[list.size()];
	//    0    0:aload_2         
	//    1    1:invokeinterface #75  <Method int List.size()>
	//    2    6:anewarray       ShareMedia[]
	//    3    9:astore          4
		for(int j = 0; j < list.size(); j++)
	//*   4   11:iconst_0        
	//*   5   12:istore_3        
	//*   6   13:iload_3         
	//*   7   14:aload_2         
	//*   8   15:invokeinterface #75  <Method int List.size()>
	//*   9   20:icmpge          44
			asharemedia[j] = (ShareMedia)list.get(j);
	//   10   23:aload           4
	//   11   25:iload_3         
	//   12   26:aload_2         
	//   13   27:iload_3         
	//   14   28:invokeinterface #79  <Method Object List.get(int)>
	//   15   33:checkcast       #63  <Class ShareMedia>
	//   16   36:aastore         

	//   17   37:iload_3         
	//   18   38:iconst_1        
	//   19   39:iadd            
	//   20   40:istore_3        
	//*  21   41:goto            13
		parcel.writeParcelableArray(((android.os.Parcelable []) (asharemedia)), i);
	//   22   44:aload_0         
	//   23   45:aload           4
	//   24   47:iload_1         
	//   25   48:invokevirtual   #85  <Method void Parcel.writeParcelableArray(android.os.Parcelable[], int)>
	//   26   51:return          
	}

	public SharePhoto build()
	{
		return new SharePhoto(this, ((SharePhoto._cls1) (null)));
	//    0    0:new             #7   <Class SharePhoto>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #91  <Method void SharePhoto(SharePhoto$Builder, SharePhoto$1)>
	//    5    9:areturn         
	}

	public volatile Object build()
	{
		return ((Object) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method SharePhoto build()>
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
	//    3    5:invokevirtual   #102 <Method SharePhoto$Builder readFrom(SharePhoto)>
	//    4    8:areturn         
	}

	public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
	{
		return ((ShareModelBuilder) (readFrom((SharePhoto)sharemodel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class SharePhoto>
	//    3    5:invokevirtual   #102 <Method SharePhoto$Builder readFrom(SharePhoto)>
	//    4    8:areturn         
	}

	SharePhoto$Builder readFrom(Parcel parcel)
	{
		return readFrom((SharePhoto)parcel.readParcelable(((Class) (com/facebook/share/model/SharePhoto)).getClassLoader()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #7   <Class SharePhoto>
	//    3    4:invokevirtual   #110 <Method ClassLoader Class.getClassLoader()>
	//    4    7:invokevirtual   #114 <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//    5   10:checkcast       #7   <Class SharePhoto>
	//    6   13:invokevirtual   #102 <Method SharePhoto$Builder readFrom(SharePhoto)>
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
	//    6    8:invokespecial   #116 <Method ShareMedia$Builder ShareMedia$Builder.readFrom(ShareMedia)>
	//    7   11:checkcast       #2   <Class SharePhoto$Builder>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #118 <Method Bitmap SharePhoto.getBitmap()>
	//   10   18:invokevirtual   #122 <Method SharePhoto$Builder setBitmap(Bitmap)>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #124 <Method Uri SharePhoto.getImageUrl()>
	//   13   25:invokevirtual   #128 <Method SharePhoto$Builder setImageUrl(Uri)>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #131 <Method boolean SharePhoto.getUserGenerated()>
	//   16   32:invokevirtual   #135 <Method SharePhoto$Builder setUserGenerated(boolean)>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #139 <Method String SharePhoto.getCaption()>
	//   19   39:invokevirtual   #143 <Method SharePhoto$Builder setCaption(String)>
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
