// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//			ShareContent, ShareMedia

public final class ShareMediaContent extends ShareContent
{

	ShareMediaContent(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void ShareContent(Parcel)>
		media = Arrays.asList(((Object []) ((ShareMedia[])parcel.readParcelableArray(((Class) (com/facebook/share/model/ShareMedia)).getClassLoader()))));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #26  <Class ShareMedia>
	//    6    9:invokevirtual   #32  <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #38  <Method android.os.Parcelable[] Parcel.readParcelableArray(ClassLoader)>
	//    8   15:checkcast       #40  <Class ShareMedia[]>
	//    9   18:invokestatic    #46  <Method List Arrays.asList(Object[])>
	//   10   21:putfield        #48  <Field List media>
	//   11   24:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public List getMedia()
	{
		return media;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field List media>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #60  <Method void ShareContent.writeToParcel(Parcel, int)>
		parcel.writeParcelableArray(((android.os.Parcelable []) ((ShareMedia[])media.toArray())), i);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #48  <Field List media>
	//    7   11:invokeinterface #66  <Method Object[] List.toArray()>
	//    8   16:checkcast       #40  <Class ShareMedia[]>
	//    9   19:iload_2         
	//   10   20:invokevirtual   #70  <Method void Parcel.writeParcelableArray(android.os.Parcelable[], int)>
	//   11   23:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ShareMediaContent createFromParcel(Parcel parcel)
		{
			return new ShareMediaContent(parcel);
		//    0    0:new             #9   <Class ShareMediaContent>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ShareMediaContent(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ShareMediaContent createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ShareMediaContent[] newArray(int i)
		{
			return new ShareMediaContent[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ShareMediaContent[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ShareMediaContent[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final List media;

	static 
	{
	//    0    0:new             #7   <Class ShareMediaContent$1>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ShareMediaContent$1()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
