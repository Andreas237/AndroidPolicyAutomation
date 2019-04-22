// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaDescriptionCompat

public static class MediaBrowserCompat$MediaItem
	implements Parcelable
{
	public static interface Flags
		extends Annotation
	{
	}


	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("MediaItem{");
	//    0    0:new             #55  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #57  <String "MediaItem{">
	//    3    6:invokespecial   #60  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append("mFlags=");
	//    5   10:aload_1         
	//    6   11:ldc1            #62  <String "mFlags=">
	//    7   13:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(mFlags);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field int mFlags>
	//   12   22:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
		stringbuilder.append(", mDescription=");
	//   14   26:aload_1         
	//   15   27:ldc1            #71  <String ", mDescription=">
	//   16   29:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(((Object) (mDescription)));
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #50  <Field MediaDescriptionCompat mDescription>
	//   21   38:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
	//   22   41:pop             
		stringbuilder.append('}');
	//   23   42:aload_1         
	//   24   43:bipush          125
	//   25   45:invokevirtual   #77  <Method StringBuilder StringBuilder.append(char)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mFlags);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int mFlags>
	//    3    5:invokevirtual   #85  <Method void Parcel.writeInt(int)>
		mDescription.writeToParcel(parcel, i);
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field MediaDescriptionCompat mDescription>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokevirtual   #87  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
	//    9   17:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaBrowserCompat.MediaItem createFromParcel(Parcel parcel)
		{
			return new MediaBrowserCompat.MediaItem(parcel);
		//    0    0:new             #9   <Class MediaBrowserCompat$MediaItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void MediaBrowserCompat$MediaItem(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method MediaBrowserCompat$MediaItem createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public MediaBrowserCompat.MediaItem[] newArray(int i)
		{
			return new MediaBrowserCompat.MediaItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaBrowserCompat.MediaItem[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method MediaBrowserCompat$MediaItem[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final MediaDescriptionCompat mDescription;
	private final int mFlags;

	static 
	{
	//    0    0:new             #11  <Class MediaBrowserCompat$MediaItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void MediaBrowserCompat$MediaItem$1()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaBrowserCompat$MediaItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mFlags = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #37  <Method int Parcel.readInt()>
	//    5    9:putfield        #39  <Field int mFlags>
		mDescription = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #42  <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #48  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #41  <Class MediaDescriptionCompat>
	//   11   25:putfield        #50  <Field MediaDescriptionCompat mDescription>
	//   12   28:return          
	}
}
