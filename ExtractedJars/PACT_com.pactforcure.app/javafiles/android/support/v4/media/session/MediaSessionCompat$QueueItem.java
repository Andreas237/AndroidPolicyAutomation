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
		if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
	//*   2    4:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          14
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		else
			return new MediaSessionCompat$QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(Item.getDescription(obj)), Item.getQueueId(obj));
	//    7   14:new             #2   <Class MediaSessionCompat$QueueItem>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:invokestatic    #82  <Method Object MediaSessionCompatApi21$QueueItem.getDescription(Object)>
	//   12   23:invokestatic    #86  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
	//   13   26:aload_0         
	//   14   27:invokestatic    #90  <Method long MediaSessionCompatApi21$QueueItem.getQueueId(Object)>
	//   15   30:invokespecial   #56  <Method void MediaSessionCompat$QueueItem(Object, MediaDescriptionCompat, long)>
	//   16   33:areturn         
	}

	public static List fromQueueItemList(List list)
	{
		if(list != null && android.os.Build.VERSION.SDK_INT >= 21) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          12
	//    2    4:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
	//    3    7:bipush          21
	//    4    9:icmpge          16
_L1:
		list = null;
	//    5   12:aconst_null     
	//    6   13:astore_0        
_L4:
		return list;
	//    7   14:aload_0         
	//    8   15:areturn         
_L2:
		ArrayList arraylist = new ArrayList();
	//    9   16:new             #94  <Class ArrayList>
	//   10   19:dup             
	//   11   20:invokespecial   #95  <Method void ArrayList()>
	//   12   23:astore_1        
		Iterator iterator = list.iterator();
	//   13   24:aload_0         
	//   14   25:invokeinterface #101 <Method Iterator List.iterator()>
	//   15   30:astore_2        
		do
		{
			list = ((List) (arraylist));
	//   16   31:aload_1         
	//   17   32:astore_0        
			if(!iterator.hasNext())
				continue;
	//   18   33:aload_2         
	//   19   34:invokeinterface #107 <Method boolean Iterator.hasNext()>
	//   20   39:ifeq            14
			((List) (arraylist)).add(((Object) (fromQueueItem(iterator.next()))));
	//   21   42:aload_1         
	//   22   43:aload_2         
	//   23   44:invokeinterface #111 <Method Object Iterator.next()>
	//   24   49:invokestatic    #113 <Method MediaSessionCompat$QueueItem fromQueueItem(Object)>
	//   25   52:invokeinterface #117 <Method boolean List.add(Object)>
	//   26   57:pop             
		} while(true);
	//   27   58:goto            31
		if(true) goto _L4; else goto _L3
_L3:
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
		if(mItem != null || android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field Object mItem>
	//*   2    4:ifnonnull       15
	//*   3    7:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          20
		{
			return mItem;
	//    6   15:aload_0         
	//    7   16:getfield        #69  <Field Object mItem>
	//    8   19:areturn         
		} else
		{
			mItem = Item.createItem(mDescription.getMediaDescription(), mId);
	//    9   20:aload_0         
	//   10   21:aload_0         
	//   11   22:getfield        #44  <Field MediaDescriptionCompat mDescription>
	//   12   25:invokevirtual   #126 <Method Object MediaDescriptionCompat.getMediaDescription()>
	//   13   28:aload_0         
	//   14   29:getfield        #52  <Field long mId>
	//   15   32:invokestatic    #130 <Method Object MediaSessionCompatApi21$QueueItem.createItem(Object, long)>
	//   16   35:putfield        #69  <Field Object mItem>
			return mItem;
	//   17   38:aload_0         
	//   18   39:getfield        #69  <Field Object mItem>
	//   19   42:areturn         
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append("MediaSession.QueueItem {Description=").append(((Object) (mDescription))).append(", Id=").append(mId).append(" }").toString();
	//    0    0:new             #134 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #135 <Method void StringBuilder()>
	//    3    7:ldc1            #137 <String "MediaSession.QueueItem {Description=">
	//    4    9:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #44  <Field MediaDescriptionCompat mDescription>
	//    7   16:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #146 <String ", Id=">
	//    9   21:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #52  <Field long mId>
	//   12   28:invokevirtual   #149 <Method StringBuilder StringBuilder.append(long)>
	//   13   31:ldc1            #151 <String " }">
	//   14   33:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #153 <Method String StringBuilder.toString()>
	//   16   39:areturn         
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
