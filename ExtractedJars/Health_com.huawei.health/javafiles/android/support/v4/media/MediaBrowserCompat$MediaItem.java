// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat, MediaDescriptionCompat

public static class MediaBrowserCompat$MediaItem
	implements Parcelable
{
	public static interface Flags
		extends Annotation
	{
	}


	public static MediaBrowserCompat$MediaItem fromMediaItem(Object obj)
	{
		if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
	//*   2    4:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          14
		{
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		} else
		{
			int i = Item.getFlags(obj);
	//    7   14:aload_0         
	//    8   15:invokestatic    #89  <Method int MediaBrowserCompatApi21$MediaItem.getFlags(Object)>
	//    9   18:istore_1        
			return new MediaBrowserCompat$MediaItem(MediaDescriptionCompat.fromMediaDescription(Item.getDescription(obj)), i);
	//   10   19:new             #2   <Class MediaBrowserCompat$MediaItem>
	//   11   22:dup             
	//   12   23:aload_0         
	//   13   24:invokestatic    #93  <Method Object MediaBrowserCompatApi21$MediaItem.getDescription(Object)>
	//   14   27:invokestatic    #97  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
	//   15   30:iload_1         
	//   16   31:invokespecial   #99  <Method void MediaBrowserCompat$MediaItem(MediaDescriptionCompat, int)>
	//   17   34:areturn         
		}
	}

	public static List fromMediaItemList(List list)
	{
		if(list == null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
	//*   2    4:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          14
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		ArrayList arraylist = new ArrayList(list.size());
	//    7   14:new             #103 <Class ArrayList>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokeinterface #108 <Method int List.size()>
	//   11   24:invokespecial   #111 <Method void ArrayList(int)>
	//   12   27:astore_1        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (fromMediaItem(((Iterator) (list)).next())))));
	//   13   28:aload_0         
	//   14   29:invokeinterface #115 <Method Iterator List.iterator()>
	//   15   34:astore_0        
	//   16   35:aload_0         
	//   17   36:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//   18   41:ifeq            63
	//   19   44:aload_1         
	//   20   45:aload_0         
	//   21   46:invokeinterface #125 <Method Object Iterator.next()>
	//   22   51:invokestatic    #127 <Method MediaBrowserCompat$MediaItem fromMediaItem(Object)>
	//   23   54:invokeinterface #131 <Method boolean List.add(Object)>
	//   24   59:pop             
	//*  25   60:goto            35
		return ((List) (arraylist));
	//   26   63:aload_1         
	//   27   64:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public MediaDescriptionCompat getDescription()
	{
		return mDescription;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field MediaDescriptionCompat mDescription>
	//    2    4:areturn         
	}

	public int getFlags()
	{
		return mFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mFlags>
	//    2    4:ireturn         
	}

	public String getMediaId()
	{
		return mDescription.getMediaId();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field MediaDescriptionCompat mDescription>
	//    2    4:invokevirtual   #67  <Method String MediaDescriptionCompat.getMediaId()>
	//    3    7:areturn         
	}

	public boolean isBrowsable()
	{
		return (mFlags & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mFlags>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isPlayable()
	{
		return (mFlags & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mFlags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("MediaItem{");
	//    0    0:new             #142 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #144 <String "MediaItem{">
	//    3    6:invokespecial   #145 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append("mFlags=").append(mFlags);
	//    5   10:aload_1         
	//    6   11:ldc1            #147 <String "mFlags=">
	//    7   13:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field int mFlags>
	//   10   20:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		stringbuilder.append(", mDescription=").append(((Object) (mDescription)));
	//   12   24:aload_1         
	//   13   25:ldc1            #156 <String ", mDescription=">
	//   14   27:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:aload_0         
	//   16   31:getfield        #54  <Field MediaDescriptionCompat mDescription>
	//   17   34:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//   18   37:pop             
		stringbuilder.append('}');
	//   19   38:aload_1         
	//   20   39:bipush          125
	//   21   41:invokevirtual   #162 <Method StringBuilder StringBuilder.append(char)>
	//   22   44:pop             
		return stringbuilder.toString();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   25   49:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mFlags);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field int mFlags>
	//    3    5:invokevirtual   #169 <Method void Parcel.writeInt(int)>
		mDescription.writeToParcel(parcel, i);
	//    4    8:aload_0         
	//    5    9:getfield        #54  <Field MediaDescriptionCompat mDescription>
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokevirtual   #171 <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
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
	public static final int FLAG_BROWSABLE = 1;
	public static final int FLAG_PLAYABLE = 2;
	private final MediaDescriptionCompat mDescription;
	private final int mFlags;

	static 
	{
	//    0    0:new             #11  <Class MediaBrowserCompat$MediaItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void MediaBrowserCompat$MediaItem$1()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaBrowserCompat$MediaItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		mFlags = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #41  <Method int Parcel.readInt()>
	//    5    9:putfield        #43  <Field int mFlags>
		mDescription = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #46  <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #52  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #45  <Class MediaDescriptionCompat>
	//   11   25:putfield        #54  <Field MediaDescriptionCompat mDescription>
	//   12   28:return          
	}

	public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediadescriptioncompat, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		if(mediadescriptioncompat == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("description cannot be null");
	//    4    8:new             #58  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #60  <String "description cannot be null">
	//    7   14:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(TextUtils.isEmpty(((CharSequence) (mediadescriptioncompat.getMediaId()))))
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #67  <Method String MediaDescriptionCompat.getMediaId()>
	//*  11   22:invokestatic    #73  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   25:ifeq            38
		{
			throw new IllegalArgumentException("description must have a non-empty media id");
	//   13   28:new             #58  <Class IllegalArgumentException>
	//   14   31:dup             
	//   15   32:ldc1            #75  <String "description must have a non-empty media id">
	//   16   34:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//   17   37:athrow          
		} else
		{
			mFlags = i;
	//   18   38:aload_0         
	//   19   39:iload_2         
	//   20   40:putfield        #43  <Field int mFlags>
			mDescription = mediadescriptioncompat;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:putfield        #54  <Field MediaDescriptionCompat mDescription>
			return;
	//   24   48:return          
		}
	}
}
