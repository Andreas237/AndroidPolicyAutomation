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
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          36
	//*   2    4:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            36
		{
			int i = Item.getFlags(obj);
	//    6   15:aload_0         
	//    7   16:invokestatic    #89  <Method int MediaBrowserCompatApi21$MediaItem.getFlags(Object)>
	//    8   19:istore_1        
			return new MediaBrowserCompat$MediaItem(MediaDescriptionCompat.fromMediaDescription(Item.getDescription(obj)), i);
	//    9   20:new             #2   <Class MediaBrowserCompat$MediaItem>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:invokestatic    #93  <Method Object MediaBrowserCompatApi21$MediaItem.getDescription(Object)>
	//   13   28:invokestatic    #97  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
	//   14   31:iload_1         
	//   15   32:invokespecial   #99  <Method void MediaBrowserCompat$MediaItem(MediaDescriptionCompat, int)>
	//   16   35:areturn         
		} else
		{
			return null;
	//   17   36:aconst_null     
	//   18   37:areturn         
		}
	}

	public static List fromMediaItemList(List list)
	{
		if(list != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          66
	//*   2    4:getstatic       #83  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            66
		{
			ArrayList arraylist = new ArrayList(list.size());
	//    6   15:new             #103 <Class ArrayList>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:invokeinterface #108 <Method int List.size()>
	//   10   25:invokespecial   #111 <Method void ArrayList(int)>
	//   11   28:astore_1        
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (fromMediaItem(((Iterator) (list)).next())))));
	//   12   29:aload_0         
	//   13   30:invokeinterface #115 <Method Iterator List.iterator()>
	//   14   35:astore_0        
	//   15   36:aload_0         
	//   16   37:invokeinterface #121 <Method boolean Iterator.hasNext()>
	//   17   42:ifeq            64
	//   18   45:aload_1         
	//   19   46:aload_0         
	//   20   47:invokeinterface #125 <Method Object Iterator.next()>
	//   21   52:invokestatic    #127 <Method MediaBrowserCompat$MediaItem fromMediaItem(Object)>
	//   22   55:invokeinterface #131 <Method boolean List.add(Object)>
	//   23   60:pop             
	//*  24   61:goto            36
			return ((List) (arraylist));
	//   25   64:aload_1         
	//   26   65:areturn         
		} else
		{
			return null;
	//   27   66:aconst_null     
	//   28   67:areturn         
		}
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
	//    2    4:invokevirtual   #60  <Method String MediaDescriptionCompat.getMediaId()>
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
		stringbuilder.append("mFlags=");
	//    5   10:aload_1         
	//    6   11:ldc1            #147 <String "mFlags=">
	//    7   13:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(mFlags);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #43  <Field int mFlags>
	//   12   22:invokevirtual   #154 <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
		stringbuilder.append(", mDescription=");
	//   14   26:aload_1         
	//   15   27:ldc1            #156 <String ", mDescription=">
	//   16   29:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(((Object) (mDescription)));
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #54  <Field MediaDescriptionCompat mDescription>
	//   21   38:invokevirtual   #159 <Method StringBuilder StringBuilder.append(Object)>
	//   22   41:pop             
		stringbuilder.append('}');
	//   23   42:aload_1         
	//   24   43:bipush          125
	//   25   45:invokevirtual   #162 <Method StringBuilder StringBuilder.append(char)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   29   53:areturn         
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
		if(mediadescriptioncompat != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          39
		{
			if(!TextUtils.isEmpty(((CharSequence) (mediadescriptioncompat.getMediaId()))))
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #60  <Method String MediaDescriptionCompat.getMediaId()>
	//*   6   12:invokestatic    #66  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   15:ifne            29
			{
				mFlags = i;
	//    8   18:aload_0         
	//    9   19:iload_2         
	//   10   20:putfield        #43  <Field int mFlags>
				mDescription = mediadescriptioncompat;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #54  <Field MediaDescriptionCompat mDescription>
				return;
	//   14   28:return          
			} else
			{
				throw new IllegalArgumentException("description must have a non-empty media id");
	//   15   29:new             #68  <Class IllegalArgumentException>
	//   16   32:dup             
	//   17   33:ldc1            #70  <String "description must have a non-empty media id">
	//   18   35:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   19   38:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("description cannot be null");
	//   20   39:new             #68  <Class IllegalArgumentException>
	//   21   42:dup             
	//   22   43:ldc1            #75  <String "description cannot be null">
	//   23   45:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   24   48:athrow          
		}
	}
}
