// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.*;
import android.support.v4.media.*;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package android.support.v4.media.session:
//			PlaybackStateCompat, IMediaSession

public class MediaSessionCompat
{
	public static abstract class Callback
	{
	}

	static interface MediaSessionImpl
	{

		public abstract String getCallingPackage();

		public abstract Object getMediaSession();

		public abstract PlaybackStateCompat getPlaybackState();

		public abstract Object getRemoteControlClient();

		public abstract Token getSessionToken();

		public abstract boolean isActive();

		public abstract void release();

		public abstract void sendSessionEvent(String s, Bundle bundle);

		public abstract void setActive(boolean flag);

		public abstract void setCallback(Callback callback, Handler handler);

		public abstract void setCaptioningEnabled(boolean flag);

		public abstract void setExtras(Bundle bundle);

		public abstract void setFlags(int i);

		public abstract void setMediaButtonReceiver(PendingIntent pendingintent);

		public abstract void setMetadata(MediaMetadataCompat mediametadatacompat);

		public abstract void setPlaybackState(PlaybackStateCompat playbackstatecompat);

		public abstract void setPlaybackToLocal(int i);

		public abstract void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat);

		public abstract void setQueue(List list);

		public abstract void setQueueTitle(CharSequence charsequence);

		public abstract void setRatingType(int i);

		public abstract void setRepeatMode(int i);

		public abstract void setSessionActivity(PendingIntent pendingintent);

		public abstract void setShuffleMode(int i);
	}

	public static interface OnActiveChangeListener
	{

		public abstract void onActiveChanged();
	}

	public static final class QueueItem
		implements Parcelable
	{

		public static QueueItem fromQueueItem(Object obj)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          35
		//*   2    4:getstatic       #71  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            35
				return new QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(MediaSessionCompatApi21.QueueItem.getDescription(obj)), MediaSessionCompatApi21.QueueItem.getQueueId(obj));
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

			public QueueItem createFromParcel(Parcel parcel)
			{
				return new QueueItem(parcel);
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

			public QueueItem[] newArray(int i)
			{
				return new QueueItem[i];
			//    0    0:iload_1         
			//    1    1:anewarray       QueueItem[]
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

		QueueItem(Parcel parcel)
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

		private QueueItem(Object obj, MediaDescriptionCompat mediadescriptioncompat, long l)
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

	static final class ResultReceiverWrapper
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			mResultReceiver.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field ResultReceiver mResultReceiver>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #43  <Method void ResultReceiver.writeToParcel(Parcel, int)>
		//    5    9:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public ResultReceiverWrapper createFromParcel(Parcel parcel)
			{
				return new ResultReceiverWrapper(parcel);
			//    0    0:new             #9   <Class MediaSessionCompat$ResultReceiverWrapper>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void MediaSessionCompat$ResultReceiverWrapper(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method MediaSessionCompat$ResultReceiverWrapper createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public ResultReceiverWrapper[] newArray(int i)
			{
				return new ResultReceiverWrapper[i];
			//    0    0:iload_1         
			//    1    1:anewarray       ResultReceiverWrapper[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method MediaSessionCompat$ResultReceiverWrapper[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		private ResultReceiver mResultReceiver;

		static 
		{
		//    0    0:new             #11  <Class MediaSessionCompat$ResultReceiverWrapper$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void MediaSessionCompat$ResultReceiverWrapper$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		ResultReceiverWrapper(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mResultReceiver = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
		//    2    4:aload_0         
		//    3    5:getstatic       #29  <Field android.os.Parcelable$Creator ResultReceiver.CREATOR>
		//    4    8:aload_1         
		//    5    9:invokeinterface #35  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//    6   14:checkcast       #28  <Class ResultReceiver>
		//    7   17:putfield        #37  <Field ResultReceiver mResultReceiver>
		//    8   20:return          
		}
	}

	public static interface SessionFlags
		extends Annotation
	{
	}

	public static final class Token
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(!(obj instanceof Token))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class MediaSessionCompat$Token>
		//*   7   11:ifne            16
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			Object obj1 = ((Object) ((Token)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class MediaSessionCompat$Token>
		//   12   20:astore_2        
			obj = mInner;
		//   13   21:aload_0         
		//   14   22:getfield        #33  <Field Object mInner>
		//   15   25:astore_1        
			if(obj == null)
		//*  16   26:aload_1         
		//*  17   27:ifnonnull       41
				return ((Token) (obj1)).mInner == null;
		//   18   30:aload_2         
		//   19   31:getfield        #33  <Field Object mInner>
		//   20   34:ifnonnull       39
		//   21   37:iconst_1        
		//   22   38:ireturn         
		//   23   39:iconst_0        
		//   24   40:ireturn         
			obj1 = ((Token) (obj1)).mInner;
		//   25   41:aload_2         
		//   26   42:getfield        #33  <Field Object mInner>
		//   27   45:astore_2        
			if(obj1 == null)
		//*  28   46:aload_2         
		//*  29   47:ifnonnull       52
				return false;
		//   30   50:iconst_0        
		//   31   51:ireturn         
			else
				return obj.equals(obj1);
		//   32   52:aload_1         
		//   33   53:aload_2         
		//   34   54:invokevirtual   #41  <Method boolean Object.equals(Object)>
		//   35   57:ireturn         
		}

		public int hashCode()
		{
			Object obj = mInner;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Object mInner>
		//    2    4:astore_1        
			if(obj == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return 0;
		//    5    9:iconst_0        
		//    6   10:ireturn         
			else
				return obj.hashCode();
		//    7   11:aload_1         
		//    8   12:invokevirtual   #44  <Method int Object.hashCode()>
		//    9   15:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:getstatic       #52  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmplt          21
			{
				parcel.writeParcelable((Parcelable)mInner, i);
		//    3    8:aload_1         
		//    4    9:aload_0         
		//    5   10:getfield        #33  <Field Object mInner>
		//    6   13:checkcast       #6   <Class Parcelable>
		//    7   16:iload_2         
		//    8   17:invokevirtual   #58  <Method void Parcel.writeParcelable(Parcelable, int)>
				return;
		//    9   20:return          
			} else
			{
				parcel.writeStrongBinder((IBinder)mInner);
		//   10   21:aload_1         
		//   11   22:aload_0         
		//   12   23:getfield        #33  <Field Object mInner>
		//   13   26:checkcast       #60  <Class IBinder>
		//   14   29:invokevirtual   #64  <Method void Parcel.writeStrongBinder(IBinder)>
				return;
		//   15   32:return          
			}
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public Token createFromParcel(Parcel parcel)
			{
				if(android.os.Build.VERSION.SDK_INT >= 21)
			//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
			//*   1    3:bipush          21
			//*   2    5:icmplt          17
					parcel = ((Parcel) (parcel.readParcelable(((ClassLoader) (null)))));
			//    3    8:aload_1         
			//    4    9:aconst_null     
			//    5   10:invokevirtual   #31  <Method Parcelable Parcel.readParcelable(ClassLoader)>
			//    6   13:astore_1        
				else
			//*   7   14:goto            22
					parcel = ((Parcel) (parcel.readStrongBinder()));
			//    8   17:aload_1         
			//    9   18:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
			//   10   21:astore_1        
				return new Token(((Object) (parcel)));
			//   11   22:new             #9   <Class MediaSessionCompat$Token>
			//   12   25:dup             
			//   13   26:aload_1         
			//   14   27:invokespecial   #38  <Method void MediaSessionCompat$Token(Object)>
			//   15   30:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #41  <Method MediaSessionCompat$Token createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public Token[] newArray(int i)
			{
				return new Token[i];
			//    0    0:iload_1         
			//    1    1:anewarray       Token[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #46  <Method MediaSessionCompat$Token[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		private final IMediaSession mExtraBinder;
		private final Object mInner;

		static 
		{
		//    0    0:new             #11  <Class MediaSessionCompat$Token$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void MediaSessionCompat$Token$1()>
		//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		Token(Object obj)
		{
			this(obj, ((IMediaSession) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #30  <Method void MediaSessionCompat$Token(Object, IMediaSession)>
		//    4    6:return          
		}

		Token(Object obj, IMediaSession imediasession)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			mInner = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field Object mInner>
			mExtraBinder = imediasession;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #35  <Field IMediaSession mExtraBinder>
		//    8   14:return          
		}
	}

}
