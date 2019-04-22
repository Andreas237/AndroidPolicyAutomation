// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.os.*;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaDescriptionCompat

public final class MediaBrowserCompat
{
	public static class ConnectionCallback
	{
	}

	static interface ConnectionCallback.ConnectionCallbackInternal
	{

		public abstract void onConnected();

		public abstract void onConnectionFailed();

		public abstract void onConnectionSuspended();
	}

	public static abstract class CustomActionCallback
	{

		public void onError(String s, Bundle bundle, Bundle bundle1)
		{
		//    0    0:return          
		}

		public void onProgressUpdate(String s, Bundle bundle, Bundle bundle1)
		{
		//    0    0:return          
		}

		public void onResult(String s, Bundle bundle, Bundle bundle1)
		{
		//    0    0:return          
		}
	}

	private static class CustomActionResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			Object obj = ((Object) (mCallback));
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field MediaBrowserCompat$CustomActionCallback mCallback>
		//    2    4:astore_3        
			if(obj == null)
		//*   3    5:aload_3         
		//*   4    6:ifnonnull       10
				return;
		//    5    9:return          
			switch(i)
		//*   6   10:iload_1         
			{
		//*   7   11:tableswitch     -1 1: default 36
		//		               -1 132
		//		               0 118
		//		               1 104
			default:
				obj = ((Object) (new StringBuilder()));
		//    8   36:new             #19  <Class StringBuilder>
		//    9   39:dup             
		//   10   40:invokespecial   #23  <Method void StringBuilder()>
		//   11   43:astore_3        
				((StringBuilder) (obj)).append("Unknown result code: ");
		//   12   44:aload_3         
		//   13   45:ldc1            #25  <String "Unknown result code: ">
		//   14   47:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
		//   15   50:pop             
				((StringBuilder) (obj)).append(i);
		//   16   51:aload_3         
		//   17   52:iload_1         
		//   18   53:invokevirtual   #32  <Method StringBuilder StringBuilder.append(int)>
		//   19   56:pop             
				((StringBuilder) (obj)).append(" (extras=");
		//   20   57:aload_3         
		//   21   58:ldc1            #34  <String " (extras=">
		//   22   60:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
		//   23   63:pop             
				((StringBuilder) (obj)).append(((Object) (mExtras)));
		//   24   64:aload_3         
		//   25   65:aload_0         
		//   26   66:getfield        #36  <Field Bundle mExtras>
		//   27   69:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
		//   28   72:pop             
				((StringBuilder) (obj)).append(", resultData=");
		//   29   73:aload_3         
		//   30   74:ldc1            #41  <String ", resultData=">
		//   31   76:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
		//   32   79:pop             
				((StringBuilder) (obj)).append(((Object) (bundle)));
		//   33   80:aload_3         
		//   34   81:aload_2         
		//   35   82:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
		//   36   85:pop             
				((StringBuilder) (obj)).append(")");
		//   37   86:aload_3         
		//   38   87:ldc1            #43  <String ")">
		//   39   89:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
		//   40   92:pop             
				Log.w("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
		//   41   93:ldc1            #45  <String "MediaBrowserCompat">
		//   42   95:aload_3         
		//   43   96:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   44   99:invokestatic    #55  <Method int Log.w(String, String)>
		//   45  102:pop             
				return;
		//   46  103:return          

			case 1: // '\001'
				((CustomActionCallback) (obj)).onProgressUpdate(mAction, mExtras, bundle);
		//   47  104:aload_3         
		//   48  105:aload_0         
		//   49  106:getfield        #57  <Field String mAction>
		//   50  109:aload_0         
		//   51  110:getfield        #36  <Field Bundle mExtras>
		//   52  113:aload_2         
		//   53  114:invokevirtual   #63  <Method void MediaBrowserCompat$CustomActionCallback.onProgressUpdate(String, Bundle, Bundle)>
				return;
		//   54  117:return          

			case 0: // '\0'
				((CustomActionCallback) (obj)).onResult(mAction, mExtras, bundle);
		//   55  118:aload_3         
		//   56  119:aload_0         
		//   57  120:getfield        #57  <Field String mAction>
		//   58  123:aload_0         
		//   59  124:getfield        #36  <Field Bundle mExtras>
		//   60  127:aload_2         
		//   61  128:invokevirtual   #66  <Method void MediaBrowserCompat$CustomActionCallback.onResult(String, Bundle, Bundle)>
				return;
		//   62  131:return          

			case -1: 
				((CustomActionCallback) (obj)).onError(mAction, mExtras, bundle);
		//   63  132:aload_3         
		//   64  133:aload_0         
		//   65  134:getfield        #57  <Field String mAction>
		//   66  137:aload_0         
		//   67  138:getfield        #36  <Field Bundle mExtras>
		//   68  141:aload_2         
		//   69  142:invokevirtual   #69  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
				return;
		//   70  145:return          
			}
		}

		private final String mAction;
		private final CustomActionCallback mCallback;
		private final Bundle mExtras;
	}

	public static abstract class ItemCallback
	{

		public void onError(String s)
		{
		//    0    0:return          
		}

		public void onItemLoaded(MediaItem mediaitem)
		{
		//    0    0:return          
		}
	}

	private static class ItemReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          13
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
		//    2    4:aload_2         
		//    3    5:ldc1            #6   <Class MediaBrowserCompat>
		//    4    7:invokevirtual   #19  <Method ClassLoader Class.getClassLoader()>
		//    5   10:invokevirtual   #25  <Method void Bundle.setClassLoader(ClassLoader)>
			if(i == 0 && bundle != null && bundle.containsKey("media_item"))
		//*   6   13:iload_1         
		//*   7   14:ifne            78
		//*   8   17:aload_2         
		//*   9   18:ifnull          78
		//*  10   21:aload_2         
		//*  11   22:ldc1            #27  <String "media_item">
		//*  12   24:invokevirtual   #31  <Method boolean Bundle.containsKey(String)>
		//*  13   27:ifne            33
		//*  14   30:goto            78
			{
				bundle = ((Bundle) (bundle.getParcelable("media_item")));
		//   15   33:aload_2         
		//   16   34:ldc1            #27  <String "media_item">
		//   17   36:invokevirtual   #35  <Method Parcelable Bundle.getParcelable(String)>
		//   18   39:astore_2        
				if(bundle != null && !(bundle instanceof MediaItem))
		//*  19   40:aload_2         
		//*  20   41:ifnull          66
		//*  21   44:aload_2         
		//*  22   45:instanceof      #37  <Class MediaBrowserCompat$MediaItem>
		//*  23   48:ifeq            54
		//*  24   51:goto            66
				{
					mCallback.onError(mMediaId);
		//   25   54:aload_0         
		//   26   55:getfield        #39  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   27   58:aload_0         
		//   28   59:getfield        #41  <Field String mMediaId>
		//   29   62:invokevirtual   #47  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
					return;
		//   30   65:return          
				} else
				{
					mCallback.onItemLoaded((MediaItem)bundle);
		//   31   66:aload_0         
		//   32   67:getfield        #39  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   33   70:aload_2         
		//   34   71:checkcast       #37  <Class MediaBrowserCompat$MediaItem>
		//   35   74:invokevirtual   #51  <Method void MediaBrowserCompat$ItemCallback.onItemLoaded(MediaBrowserCompat$MediaItem)>
					return;
		//   36   77:return          
				}
			} else
			{
				mCallback.onError(mMediaId);
		//   37   78:aload_0         
		//   38   79:getfield        #39  <Field MediaBrowserCompat$ItemCallback mCallback>
		//   39   82:aload_0         
		//   40   83:getfield        #41  <Field String mMediaId>
		//   41   86:invokevirtual   #47  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
				return;
		//   42   89:return          
			}
		}

		private final ItemCallback mCallback;
		private final String mMediaId;
	}

	static interface MediaBrowserImpl
	{

		public abstract void connect();

		public abstract void disconnect();

		public abstract Bundle getExtras();

		public abstract void getItem(String s, ItemCallback itemcallback);

		public abstract String getRoot();

		public abstract ComponentName getServiceComponent();

		public abstract android.support.v4.media.session.MediaSessionCompat.Token getSessionToken();

		public abstract boolean isConnected();

		public abstract void search(String s, Bundle bundle, SearchCallback searchcallback);

		public abstract void sendCustomAction(String s, Bundle bundle, CustomActionCallback customactioncallback);

		public abstract void subscribe(String s, Bundle bundle, SubscriptionCallback subscriptioncallback);

		public abstract void unsubscribe(String s, SubscriptionCallback subscriptioncallback);
	}

	static interface MediaBrowserServiceCallbackImpl
	{

		public abstract void onConnectionFailed(Messenger messenger);

		public abstract void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle);

		public abstract void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle);
	}

	public static class MediaItem
		implements Parcelable
	{

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

			public MediaItem createFromParcel(Parcel parcel)
			{
				return new MediaItem(parcel);
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

			public MediaItem[] newArray(int i)
			{
				return new MediaItem[i];
			//    0    0:iload_1         
			//    1    1:anewarray       MediaItem[]
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

		MediaItem(Parcel parcel)
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

	public static interface MediaItem.Flags
		extends Annotation
	{
	}

	public static abstract class SearchCallback
	{

		public void onError(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void onSearchResult(String s, Bundle bundle, List list)
		{
		//    0    0:return          
		}
	}

	private static class SearchResultReceiver extends ResultReceiver
	{

		protected void onReceiveResult(int i, Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          13
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
		//    2    4:aload_2         
		//    3    5:ldc1            #6   <Class MediaBrowserCompat>
		//    4    7:invokevirtual   #21  <Method ClassLoader Class.getClassLoader()>
		//    5   10:invokevirtual   #27  <Method void Bundle.setClassLoader(ClassLoader)>
			if(i == 0 && bundle != null && bundle.containsKey("search_results"))
		//*   6   13:iload_1         
		//*   7   14:ifne            110
		//*   8   17:aload_2         
		//*   9   18:ifnull          110
		//*  10   21:aload_2         
		//*  11   22:ldc1            #29  <String "search_results">
		//*  12   24:invokevirtual   #33  <Method boolean Bundle.containsKey(String)>
		//*  13   27:ifne            33
		//*  14   30:goto            110
			{
				Parcelable aparcelable[] = bundle.getParcelableArray("search_results");
		//   15   33:aload_2         
		//   16   34:ldc1            #29  <String "search_results">
		//   17   36:invokevirtual   #37  <Method Parcelable[] Bundle.getParcelableArray(String)>
		//   18   39:astore          5
				bundle = null;
		//   19   41:aconst_null     
		//   20   42:astore_2        
				if(aparcelable != null)
		//*  21   43:aload           5
		//*  22   45:ifnull          93
				{
					ArrayList arraylist = new ArrayList();
		//   23   48:new             #39  <Class ArrayList>
		//   24   51:dup             
		//   25   52:invokespecial   #43  <Method void ArrayList()>
		//   26   55:astore          4
					int j = aparcelable.length;
		//   27   57:aload           5
		//   28   59:arraylength     
		//   29   60:istore_3        
					i = 0;
		//   30   61:iconst_0        
		//   31   62:istore_1        
					do
					{
						bundle = ((Bundle) (arraylist));
		//   32   63:aload           4
		//   33   65:astore_2        
						if(i >= j)
							break;
		//   34   66:iload_1         
		//   35   67:iload_3         
		//   36   68:icmpge          93
						((List) (arraylist)).add(((Object) ((MediaItem)aparcelable[i])));
		//   37   71:aload           4
		//   38   73:aload           5
		//   39   75:iload_1         
		//   40   76:aaload          
		//   41   77:checkcast       #45  <Class MediaBrowserCompat$MediaItem>
		//   42   80:invokeinterface #51  <Method boolean List.add(Object)>
		//   43   85:pop             
						i++;
		//   44   86:iload_1         
		//   45   87:iconst_1        
		//   46   88:iadd            
		//   47   89:istore_1        
					} while(true);
		//   48   90:goto            63
				}
				mCallback.onSearchResult(mQuery, mExtras, ((List) (bundle)));
		//   49   93:aload_0         
		//   50   94:getfield        #53  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   51   97:aload_0         
		//   52   98:getfield        #55  <Field String mQuery>
		//   53  101:aload_0         
		//   54  102:getfield        #57  <Field Bundle mExtras>
		//   55  105:aload_2         
		//   56  106:invokevirtual   #63  <Method void MediaBrowserCompat$SearchCallback.onSearchResult(String, Bundle, List)>
				return;
		//   57  109:return          
			} else
			{
				mCallback.onError(mQuery, mExtras);
		//   58  110:aload_0         
		//   59  111:getfield        #53  <Field MediaBrowserCompat$SearchCallback mCallback>
		//   60  114:aload_0         
		//   61  115:getfield        #55  <Field String mQuery>
		//   62  118:aload_0         
		//   63  119:getfield        #57  <Field Bundle mExtras>
		//   64  122:invokevirtual   #67  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
				return;
		//   65  125:return          
			}
		}

		private final SearchCallback mCallback;
		private final Bundle mExtras;
		private final String mQuery;
	}

	public static abstract class SubscriptionCallback
	{
	}


	static final boolean DEBUG = Log.isLoggable("MediaBrowserCompat", 3);

	static 
	{
	//    0    0:ldc1            #51  <String "MediaBrowserCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #57  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #59  <Field boolean DEBUG>
	//*   4    9:return          
	}
}
