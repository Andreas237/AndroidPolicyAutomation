// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

public static final class MediaSessionCompat$QueueItem
	implements Parcelable
{

	public static MediaSessionCompat$QueueItem fromQueueItem(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          35
	//*   2    4:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            35
			return new MediaSessionCompat$QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(Item.getDescription(obj)), Item.getQueueId(obj));
	//    6   15:new             #2   <Class MediaSessionCompat$QueueItem>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:invokestatic    #82  <Method Object MediaSessionCompatApi21$QueueItem.getDescription(Object)>
	//   11   24:invokestatic    #86  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
	//   12   27:aload_0         
	//   13   28:invokestatic    #90  <Method long MediaSessionCompatApi21$QueueItem.getQueueId(Object)>
	//   14   31:invokespecial   #56  <Method void MediaSessionCompat$QueueItem(Object, MediaDescriptionCompat, long)>
	//   15   34:areturn         
		else
			return null;
	//   16   35:aconst_null     
	//   17   36:areturn         
	}

	public static List fromQueueItemList(List list)
	{
		if(list != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          60
	//*   2    4:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            60
		{
			ArrayList arraylist = new ArrayList();
	//    6   15:new             #94  <Class ArrayList>
	//    7   18:dup             
	//    8   19:invokespecial   #95  <Method void ArrayList()>
	//    9   22:astore_1        
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (fromQueueItem(((Iterator) (list)).next())))));
	//   10   23:aload_0         
	//   11   24:invokeinterface #101 <Method Iterator List.iterator()>
	//   12   29:astore_0        
	//   13   30:aload_0         
	//   14   31:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   15   36:ifeq            58
	//   16   39:aload_1         
	//   17   40:aload_0         
	//   18   41:invokeinterface #111 <Method Object Iterator.next()>
	//   19   46:invokestatic    #113 <Method MediaSessionCompat$QueueItem fromQueueItem(Object)>
	//   20   49:invokeinterface #117 <Method boolean List.add(Object)>
	//   21   54:pop             
	//*  22   55:goto            30
			return ((List) (arraylist));
	//   23   58:aload_1         
	//   24   59:areturn         
		} else
		{
			return null;
	//   25   60:aconst_null     
	//   26   61:areturn         
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
	//    1    1:getfield        #44  <Field MediaDescriptionCompat mDescription>
	//    2    4:areturn         
	}

	public long getQueueId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long mId>
	//    2    4:lreturn         
	}

	public Object getQueueItem()
	{
		if(mItem == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field Object mItem>
	//*   2    4:ifnonnull       41
	//*   3    7:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          18
	//*   6   15:goto            41
		{
			mItem = Item.createItem(mDescription.getMediaDescription(), mId);
	//    7   18:aload_0         
	//    8   19:aload_0         
	//    9   20:getfield        #44  <Field MediaDescriptionCompat mDescription>
	//   10   23:invokevirtual   #126 <Method Object MediaDescriptionCompat.getMediaDescription()>
	//   11   26:aload_0         
	//   12   27:getfield        #52  <Field long mId>
	//   13   30:invokestatic    #130 <Method Object MediaSessionCompatApi21$QueueItem.createItem(Object, long)>
	//   14   33:putfield        #69  <Field Object mItem>
			return mItem;
	//   15   36:aload_0         
	//   16   37:getfield        #69  <Field Object mItem>
	//   17   40:areturn         
		} else
		{
			return mItem;
	//   18   41:aload_0         
	//   19   42:getfield        #69  <Field Object mItem>
	//   20   45:areturn         
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #134 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #135 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaSession.QueueItem {Description=");
	//    4    8:aload_1         
	//    5    9:ldc1            #137 <String "MediaSession.QueueItem {Description=">
	//    6   11:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (mDescription)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #44  <Field MediaDescriptionCompat mDescription>
	//   11   20:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", Id=");
	//   13   24:aload_1         
	//   14   25:ldc1            #146 <String ", Id=">
	//   15   27:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mId);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #52  <Field long mId>
	//   20   36:invokevirtual   #149 <Method StringBuilder StringBuilder.append(long)>
	//   21   39:pop             
		stringbuilder.append(" }");
	//   22   40:aload_1         
	//   23   41:ldc1            #151 <String " }">
	//   24   43:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		mDescription.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field MediaDescriptionCompat mDescription>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #157 <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
		parcel.writeLong(mId);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #52  <Field long mId>
	//    8   14:invokevirtual   #161 <Method void Parcel.writeLong(long)>
	//    9   17:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaSessionCompat.QueueItem createFromParcel(Parcel parcel)
		{
			return new MediaSessionCompat.QueueItem(parcel);
		//    0    0:new             #9   <Class MediaSessionCompat$QueueItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void MediaSessionCompat$QueueItem(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method MediaSessionCompat$QueueItem createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public MediaSessionCompat.QueueItem[] newArray(int i)
		{
			return new MediaSessionCompat.QueueItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaSessionCompat.QueueItem[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method MediaSessionCompat$QueueItem[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final int UNKNOWN_ID = -1;
	private final MediaDescriptionCompat mDescription;
	private final long mId;
	private Object mItem;

	static 
	{
	//    0    0:new             #11  <Class MediaSessionCompat$QueueItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void MediaSessionCompat$QueueItem$1()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaSessionCompat$QueueItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mDescription = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
	//    2    4:aload_0         
	//    3    5:getstatic       #36  <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
	//    4    8:aload_1         
	//    5    9:invokeinterface #42  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    6   14:checkcast       #35  <Class MediaDescriptionCompat>
	//    7   17:putfield        #44  <Field MediaDescriptionCompat mDescription>
		mId = parcel.readLong();
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokevirtual   #50  <Method long Parcel.readLong()>
	//   11   25:putfield        #52  <Field long mId>
	//   12   28:return          
	}

	public MediaSessionCompat$QueueItem(MediaDescriptionCompat mediadescriptioncompat, long l)
	{
		this(((Object) (null)), mediadescriptioncompat, l);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:lload_2         
	//    4    4:invokespecial   #56  <Method void MediaSessionCompat$QueueItem(Object, MediaDescriptionCompat, long)>
	//    5    7:return          
	}

	private MediaSessionCompat$QueueItem(Object obj, MediaDescriptionCompat mediadescriptioncompat, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		if(mediadescriptioncompat == null)
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("Description cannot be null.");
	//    4    8:new             #58  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #60  <String "Description cannot be null.">
	//    7   14:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(l == -1L)
	//*   9   18:lload_3         
	//*  10   19:ldc2w           #64  <Long -1L>
	//*  11   22:lcmp            
	//*  12   23:ifne            36
		{
			throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
	//   13   26:new             #58  <Class IllegalArgumentException>
	//   14   29:dup             
	//   15   30:ldc1            #67  <String "Id cannot be QueueItem.UNKNOWN_ID">
	//   16   32:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//   17   35:athrow          
		} else
		{
			mDescription = mediadescriptioncompat;
	//   18   36:aload_0         
	//   19   37:aload_2         
	//   20   38:putfield        #44  <Field MediaDescriptionCompat mDescription>
			mId = l;
	//   21   41:aload_0         
	//   22   42:lload_3         
	//   23   43:putfield        #52  <Field long mId>
			mItem = obj;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:putfield        #69  <Field Object mItem>
			return;
	//   27   51:return          
		}
	}
}
