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
	//*   2    4:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            35
			return new MediaSessionCompat$QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(Item.getDescription(obj)), Item.getQueueId(obj));
	//    6   15:new             #2   <Class MediaSessionCompat$QueueItem>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:invokestatic    #77  <Method Object MediaSessionCompatApi21$QueueItem.getDescription(Object)>
	//   11   24:invokestatic    #81  <Method MediaDescriptionCompat MediaDescriptionCompat.fromMediaDescription(Object)>
	//   12   27:aload_0         
	//   13   28:invokestatic    #85  <Method long MediaSessionCompatApi21$QueueItem.getQueueId(Object)>
	//   14   31:invokespecial   #87  <Method void MediaSessionCompat$QueueItem(Object, MediaDescriptionCompat, long)>
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
	//*   2    4:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmpge          15
	//*   5   12:goto            60
		{
			ArrayList arraylist = new ArrayList();
	//    6   15:new             #91  <Class ArrayList>
	//    7   18:dup             
	//    8   19:invokespecial   #92  <Method void ArrayList()>
	//    9   22:astore_1        
			for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (fromQueueItem(((Iterator) (list)).next())))));
	//   10   23:aload_0         
	//   11   24:invokeinterface #98  <Method Iterator List.iterator()>
	//   12   29:astore_0        
	//   13   30:aload_0         
	//   14   31:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   15   36:ifeq            58
	//   16   39:aload_1         
	//   17   40:aload_0         
	//   18   41:invokeinterface #108 <Method Object Iterator.next()>
	//   19   46:invokestatic    #110 <Method MediaSessionCompat$QueueItem fromQueueItem(Object)>
	//   20   49:invokeinterface #114 <Method boolean List.add(Object)>
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

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #122 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("MediaSession.QueueItem {Description=");
	//    4    8:aload_1         
	//    5    9:ldc1            #125 <String "MediaSession.QueueItem {Description=">
	//    6   11:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (mDescription)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #41  <Field MediaDescriptionCompat mDescription>
	//   11   20:invokevirtual   #132 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", Id=");
	//   13   24:aload_1         
	//   14   25:ldc1            #134 <String ", Id=">
	//   15   27:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(mId);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #49  <Field long mId>
	//   20   36:invokevirtual   #137 <Method StringBuilder StringBuilder.append(long)>
	//   21   39:pop             
		stringbuilder.append(" }");
	//   22   40:aload_1         
	//   23   41:ldc1            #139 <String " }">
	//   24   43:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		mDescription.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field MediaDescriptionCompat mDescription>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #145 <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
		parcel.writeLong(mId);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #49  <Field long mId>
	//    8   14:invokevirtual   #149 <Method void Parcel.writeLong(long)>
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
	private final MediaDescriptionCompat mDescription;
	private final long mId;
	private Object mItem;

	static 
	{
	//    0    0:new             #11  <Class MediaSessionCompat$QueueItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void MediaSessionCompat$QueueItem$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	MediaSessionCompat$QueueItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		mDescription = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
	//    2    4:aload_0         
	//    3    5:getstatic       #33  <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
	//    4    8:aload_1         
	//    5    9:invokeinterface #39  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    6   14:checkcast       #32  <Class MediaDescriptionCompat>
	//    7   17:putfield        #41  <Field MediaDescriptionCompat mDescription>
		mId = parcel.readLong();
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokevirtual   #47  <Method long Parcel.readLong()>
	//   11   25:putfield        #49  <Field long mId>
	//   12   28:return          
	}

	private MediaSessionCompat$QueueItem(Object obj, MediaDescriptionCompat mediadescriptioncompat, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		if(mediadescriptioncompat != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          42
		{
			if(l != -1L)
	//*   4    8:lload_3         
	//*   5    9:ldc2w           #51  <Long -1L>
	//*   6   12:lcmp            
	//*   7   13:ifeq            32
			{
				mDescription = mediadescriptioncompat;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #41  <Field MediaDescriptionCompat mDescription>
				mId = l;
	//   11   21:aload_0         
	//   12   22:lload_3         
	//   13   23:putfield        #49  <Field long mId>
				mItem = obj;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #54  <Field Object mItem>
				return;
	//   17   31:return          
			} else
			{
				throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
	//   18   32:new             #56  <Class IllegalArgumentException>
	//   19   35:dup             
	//   20   36:ldc1            #58  <String "Id cannot be QueueItem.UNKNOWN_ID">
	//   21   38:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   22   41:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Description cannot be null.");
	//   23   42:new             #56  <Class IllegalArgumentException>
	//   24   45:dup             
	//   25   46:ldc1            #63  <String "Description cannot be null.">
	//   26   48:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   27   51:athrow          
		}
	}
}
