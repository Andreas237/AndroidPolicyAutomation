// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package android.support.v4.media:
//			MediaDescriptionCompat, a, c, b

public final class MediaBrowserCompat
{
	private static class CustomActionResultReceiver extends ResultReceiver
	{

		protected void a(int i1, Bundle bundle)
		{
			if(f == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field MediaBrowserCompat$c f>
		//*   2    4:ifnonnull       8
				return;
		//    3    7:return          
			switch(i1)
		//*   4    8:iload_1         
			{
		//*   5    9:tableswitch     -1 1: default 36
		//		               -1 138
		//		               0 121
		//		               1 104
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//    6   36:new             #19  <Class StringBuilder>
		//    7   39:dup             
		//    8   40:invokespecial   #23  <Method void StringBuilder()>
		//    9   43:astore_3        
				stringbuilder.append("Unknown result code: ");
		//   10   44:aload_3         
		//   11   45:ldc1            #25  <String "Unknown result code: ">
		//   12   47:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
		//   13   50:pop             
				stringbuilder.append(i1);
		//   14   51:aload_3         
		//   15   52:iload_1         
		//   16   53:invokevirtual   #32  <Method StringBuilder StringBuilder.append(int)>
		//   17   56:pop             
				stringbuilder.append(" (extras=");
		//   18   57:aload_3         
		//   19   58:ldc1            #34  <String " (extras=">
		//   20   60:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
		//   21   63:pop             
				stringbuilder.append(((Object) (e)));
		//   22   64:aload_3         
		//   23   65:aload_0         
		//   24   66:getfield        #36  <Field Bundle e>
		//   25   69:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
		//   26   72:pop             
				stringbuilder.append(", resultData=");
		//   27   73:aload_3         
		//   28   74:ldc1            #41  <String ", resultData=">
		//   29   76:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
		//   30   79:pop             
				stringbuilder.append(((Object) (bundle)));
		//   31   80:aload_3         
		//   32   81:aload_2         
		//   33   82:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
		//   34   85:pop             
				stringbuilder.append(")");
		//   35   86:aload_3         
		//   36   87:ldc1            #43  <String ")">
		//   37   89:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
		//   38   92:pop             
				Log.w("MediaBrowserCompat", stringbuilder.toString());
		//   39   93:ldc1            #45  <String "MediaBrowserCompat">
		//   40   95:aload_3         
		//   41   96:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   42   99:invokestatic    #55  <Method int Log.w(String, String)>
		//   43  102:pop             
				return;
		//   44  103:return          

			case 1: // '\001'
				f.a(d, e, bundle);
		//   45  104:aload_0         
		//   46  105:getfield        #17  <Field MediaBrowserCompat$c f>
		//   47  108:aload_0         
		//   48  109:getfield        #57  <Field String d>
		//   49  112:aload_0         
		//   50  113:getfield        #36  <Field Bundle e>
		//   51  116:aload_2         
		//   52  117:invokevirtual   #62  <Method void MediaBrowserCompat$c.a(String, Bundle, Bundle)>
				return;
		//   53  120:return          

			case 0: // '\0'
				f.b(d, e, bundle);
		//   54  121:aload_0         
		//   55  122:getfield        #17  <Field MediaBrowserCompat$c f>
		//   56  125:aload_0         
		//   57  126:getfield        #57  <Field String d>
		//   58  129:aload_0         
		//   59  130:getfield        #36  <Field Bundle e>
		//   60  133:aload_2         
		//   61  134:invokevirtual   #65  <Method void MediaBrowserCompat$c.b(String, Bundle, Bundle)>
				return;
		//   62  137:return          

			case -1: 
				f.c(d, e, bundle);
		//   63  138:aload_0         
		//   64  139:getfield        #17  <Field MediaBrowserCompat$c f>
		//   65  142:aload_0         
		//   66  143:getfield        #57  <Field String d>
		//   67  146:aload_0         
		//   68  147:getfield        #36  <Field Bundle e>
		//   69  150:aload_2         
		//   70  151:invokevirtual   #68  <Method void MediaBrowserCompat$c.c(String, Bundle, Bundle)>
				return;
		//   71  154:return          
			}
		}

		private final String d;
		private final Bundle e;
		private final c f;
	}

	private static class ItemReceiver extends ResultReceiver
	{

		protected void a(int i1, Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          13
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
		//    2    4:aload_2         
		//    3    5:ldc1            #6   <Class MediaBrowserCompat>
		//    4    7:invokevirtual   #19  <Method ClassLoader Class.getClassLoader()>
		//    5   10:invokevirtual   #25  <Method void Bundle.setClassLoader(ClassLoader)>
			if(i1 == 0 && bundle != null && bundle.containsKey("media_item"))
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
					e.a(d);
		//   25   54:aload_0         
		//   26   55:getfield        #39  <Field MediaBrowserCompat$d e>
		//   27   58:aload_0         
		//   28   59:getfield        #41  <Field String d>
		//   29   62:invokevirtual   #46  <Method void MediaBrowserCompat$d.a(String)>
					return;
		//   30   65:return          
				} else
				{
					e.a((MediaItem)bundle);
		//   31   66:aload_0         
		//   32   67:getfield        #39  <Field MediaBrowserCompat$d e>
		//   33   70:aload_2         
		//   34   71:checkcast       #37  <Class MediaBrowserCompat$MediaItem>
		//   35   74:invokevirtual   #49  <Method void MediaBrowserCompat$d.a(MediaBrowserCompat$MediaItem)>
					return;
		//   36   77:return          
				}
			} else
			{
				e.a(d);
		//   37   78:aload_0         
		//   38   79:getfield        #39  <Field MediaBrowserCompat$d e>
		//   39   82:aload_0         
		//   40   83:getfield        #41  <Field String d>
		//   41   86:invokevirtual   #46  <Method void MediaBrowserCompat$d.a(String)>
				return;
		//   42   89:return          
			}
		}

		private final String d;
		private final d e;
	}

	public static class MediaItem
		implements Parcelable
	{

		public static MediaItem a(Object obj)
		{
			if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          36
		//*   2    4:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            36
			{
				int i1 = android.support.v4.media.a.c.a(obj);
		//    6   15:aload_0         
		//    7   16:invokestatic    #77  <Method int a$c.a(Object)>
		//    8   19:istore_1        
				return new MediaItem(MediaDescriptionCompat.a(android.support.v4.media.a.c.b(obj)), i1);
		//    9   20:new             #2   <Class MediaBrowserCompat$MediaItem>
		//   10   23:dup             
		//   11   24:aload_0         
		//   12   25:invokestatic    #80  <Method Object a$c.b(Object)>
		//   13   28:invokestatic    #83  <Method MediaDescriptionCompat MediaDescriptionCompat.a(Object)>
		//   14   31:iload_1         
		//   15   32:invokespecial   #85  <Method void MediaBrowserCompat$MediaItem(MediaDescriptionCompat, int)>
		//   16   35:areturn         
			} else
			{
				return null;
		//   17   36:aconst_null     
		//   18   37:areturn         
			}
		}

		public static List a(List list)
		{
			if(list != null && android.os.Build.VERSION.SDK_INT >= 21)
		//*   0    0:aload_0         
		//*   1    1:ifnull          66
		//*   2    4:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmpge          15
		//*   5   12:goto            66
			{
				ArrayList arraylist = new ArrayList(list.size());
		//    6   15:new             #88  <Class ArrayList>
		//    7   18:dup             
		//    8   19:aload_0         
		//    9   20:invokeinterface #93  <Method int List.size()>
		//   10   25:invokespecial   #96  <Method void ArrayList(int)>
		//   11   28:astore_1        
				for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) (a(((Iterator) (list)).next())))));
		//   12   29:aload_0         
		//   13   30:invokeinterface #100 <Method Iterator List.iterator()>
		//   14   35:astore_0        
		//   15   36:aload_0         
		//   16   37:invokeinterface #106 <Method boolean Iterator.hasNext()>
		//   17   42:ifeq            64
		//   18   45:aload_1         
		//   19   46:aload_0         
		//   20   47:invokeinterface #110 <Method Object Iterator.next()>
		//   21   52:invokestatic    #112 <Method MediaBrowserCompat$MediaItem a(Object)>
		//   22   55:invokeinterface #116 <Method boolean List.add(Object)>
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

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder("MediaItem{");
		//    0    0:new             #122 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:ldc1            #124 <String "MediaItem{">
		//    3    6:invokespecial   #125 <Method void StringBuilder(String)>
		//    4    9:astore_1        
			stringbuilder.append("mFlags=");
		//    5   10:aload_1         
		//    6   11:ldc1            #127 <String "mFlags=">
		//    7   13:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			stringbuilder.append(a);
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:getfield        #36  <Field int a>
		//   12   22:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
		//   13   25:pop             
			stringbuilder.append(", mDescription=");
		//   14   26:aload_1         
		//   15   27:ldc1            #136 <String ", mDescription=">
		//   16   29:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
		//   17   32:pop             
			stringbuilder.append(((Object) (b)));
		//   18   33:aload_1         
		//   19   34:aload_0         
		//   20   35:getfield        #47  <Field MediaDescriptionCompat b>
		//   21   38:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
		//   22   41:pop             
			stringbuilder.append('}');
		//   23   42:aload_1         
		//   24   43:bipush          125
		//   25   45:invokevirtual   #142 <Method StringBuilder StringBuilder.append(char)>
		//   26   48:pop             
			return stringbuilder.toString();
		//   27   49:aload_1         
		//   28   50:invokevirtual   #144 <Method String StringBuilder.toString()>
		//   29   53:areturn         
		}

		public void writeToParcel(Parcel parcel, int i1)
		{
			parcel.writeInt(a);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #36  <Field int a>
		//    3    5:invokevirtual   #149 <Method void Parcel.writeInt(int)>
			b.writeToParcel(parcel, i1);
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field MediaDescriptionCompat b>
		//    6   12:aload_1         
		//    7   13:iload_2         
		//    8   14:invokevirtual   #151 <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
		//    9   17:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public MediaItem a(Parcel parcel)
			{
				return new MediaItem(parcel);
			//    0    0:new             #9   <Class MediaBrowserCompat$MediaItem>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void MediaBrowserCompat$MediaItem(Parcel)>
			//    4    8:areturn         
			}

			public MediaItem[] a(int i1)
			{
				return new MediaItem[i1];
			//    0    0:iload_1         
			//    1    1:anewarray       MediaItem[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method MediaBrowserCompat$MediaItem a(Parcel)>
			//    3    5:areturn         
			}

			public Object[] newArray(int i1)
			{
				return ((Object []) (a(i1)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method MediaBrowserCompat$MediaItem[] a(int)>
			//    3    5:areturn         
			}

		}
;
		private final int a;
		private final MediaDescriptionCompat b;

		static 
		{
		//    0    0:new             #11  <Class MediaBrowserCompat$MediaItem$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void MediaBrowserCompat$MediaItem$1()>
		//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		MediaItem(Parcel parcel)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			a = parcel.readInt();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #34  <Method int Parcel.readInt()>
		//    5    9:putfield        #36  <Field int a>
			b = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
		//    6   12:aload_0         
		//    7   13:getstatic       #39  <Field android.os.Parcelable$Creator MediaDescriptionCompat.CREATOR>
		//    8   16:aload_1         
		//    9   17:invokeinterface #45  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   10   22:checkcast       #38  <Class MediaDescriptionCompat>
		//   11   25:putfield        #47  <Field MediaDescriptionCompat b>
		//   12   28:return          
		}

		public MediaItem(MediaDescriptionCompat mediadescriptioncompat, int i1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			if(mediadescriptioncompat == null)
		//*   2    4:aload_1         
		//*   3    5:ifnonnull       18
				throw new IllegalArgumentException("description cannot be null");
		//    4    8:new             #50  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #52  <String "description cannot be null">
		//    7   14:invokespecial   #55  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			if(TextUtils.isEmpty(((CharSequence) (mediadescriptioncompat.a()))))
		//*   9   18:aload_1         
		//*  10   19:invokevirtual   #58  <Method String MediaDescriptionCompat.a()>
		//*  11   22:invokestatic    #64  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  12   25:ifeq            38
			{
				throw new IllegalArgumentException("description must have a non-empty media id");
		//   13   28:new             #50  <Class IllegalArgumentException>
		//   14   31:dup             
		//   15   32:ldc1            #66  <String "description must have a non-empty media id">
		//   16   34:invokespecial   #55  <Method void IllegalArgumentException(String)>
		//   17   37:athrow          
			} else
			{
				a = i1;
		//   18   38:aload_0         
		//   19   39:iload_2         
		//   20   40:putfield        #36  <Field int a>
				b = mediadescriptioncompat;
		//   21   43:aload_0         
		//   22   44:aload_1         
		//   23   45:putfield        #47  <Field MediaDescriptionCompat b>
				return;
		//   24   48:return          
			}
		}
	}

	private static class SearchResultReceiver extends ResultReceiver
	{

		protected void a(int i1, Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          13
				bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
		//    2    4:aload_2         
		//    3    5:ldc1            #6   <Class MediaBrowserCompat>
		//    4    7:invokevirtual   #21  <Method ClassLoader Class.getClassLoader()>
		//    5   10:invokevirtual   #27  <Method void Bundle.setClassLoader(ClassLoader)>
			if(i1 == 0 && bundle != null && bundle.containsKey("search_results"))
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
					int j1 = aparcelable.length;
		//   27   57:aload           5
		//   28   59:arraylength     
		//   29   60:istore_3        
					i1 = 0;
		//   30   61:iconst_0        
		//   31   62:istore_1        
					do
					{
						bundle = ((Bundle) (arraylist));
		//   32   63:aload           4
		//   33   65:astore_2        
						if(i1 >= j1)
							break;
		//   34   66:iload_1         
		//   35   67:iload_3         
		//   36   68:icmpge          93
						((List) (arraylist)).add(((Object) ((MediaItem)aparcelable[i1])));
		//   37   71:aload           4
		//   38   73:aload           5
		//   39   75:iload_1         
		//   40   76:aaload          
		//   41   77:checkcast       #45  <Class MediaBrowserCompat$MediaItem>
		//   42   80:invokeinterface #51  <Method boolean List.add(Object)>
		//   43   85:pop             
						i1++;
		//   44   86:iload_1         
		//   45   87:iconst_1        
		//   46   88:iadd            
		//   47   89:istore_1        
					} while(true);
		//   48   90:goto            63
				}
				f.a(d, e, ((List) (bundle)));
		//   49   93:aload_0         
		//   50   94:getfield        #53  <Field MediaBrowserCompat$k f>
		//   51   97:aload_0         
		//   52   98:getfield        #55  <Field String d>
		//   53  101:aload_0         
		//   54  102:getfield        #57  <Field Bundle e>
		//   55  105:aload_2         
		//   56  106:invokevirtual   #62  <Method void MediaBrowserCompat$k.a(String, Bundle, List)>
				return;
		//   57  109:return          
			} else
			{
				f.a(d, e);
		//   58  110:aload_0         
		//   59  111:getfield        #53  <Field MediaBrowserCompat$k f>
		//   60  114:aload_0         
		//   61  115:getfield        #55  <Field String d>
		//   62  118:aload_0         
		//   63  119:getfield        #57  <Field Bundle e>
		//   64  122:invokevirtual   #65  <Method void MediaBrowserCompat$k.a(String, Bundle)>
				return;
		//   65  125:return          
			}
		}

		private final String d;
		private final Bundle e;
		private final k f;
	}

	private static class a extends Handler
	{

		void a(Messenger messenger)
		{
			b = new WeakReference(((Object) (messenger)));
		//    0    0:aload_0         
		//    1    1:new             #18  <Class WeakReference>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #21  <Method void WeakReference(Object)>
		//    5    9:putfield        #27  <Field WeakReference b>
		//    6   12:return          
		}

		public void handleMessage(Message message)
		{
			if(b == null || b.get() == null) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference b>
		//    2    4:ifnull          257
		//    3    7:aload_0         
		//    4    8:getfield        #27  <Field WeakReference b>
		//    5   11:invokevirtual   #35  <Method Object WeakReference.get()>
		//    6   14:ifnull          257
_L1:
			j j1;
			Messenger messenger;
			Bundle bundle;
			if(a.get() == null)
		//*   7   17:aload_0         
		//*   8   18:getfield        #23  <Field WeakReference a>
		//*   9   21:invokevirtual   #35  <Method Object WeakReference.get()>
		//*  10   24:ifnonnull       28
				return;
		//   11   27:return          
			bundle = message.getData();
		//   12   28:aload_1         
		//   13   29:invokevirtual   #41  <Method Bundle Message.getData()>
		//   14   32:astore          4
			bundle.setClassLoader(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
		//   15   34:aload           4
		//   16   36:ldc1            #43  <Class MediaSessionCompat>
		//   17   38:invokevirtual   #49  <Method ClassLoader Class.getClassLoader()>
		//   18   41:invokevirtual   #55  <Method void Bundle.setClassLoader(ClassLoader)>
			j1 = (j)a.get();
		//   19   44:aload_0         
		//   20   45:getfield        #23  <Field WeakReference a>
		//   21   48:invokevirtual   #35  <Method Object WeakReference.get()>
		//   22   51:checkcast       #57  <Class MediaBrowserCompat$j>
		//   23   54:astore_2        
			messenger = (Messenger)b.get();
		//   24   55:aload_0         
		//   25   56:getfield        #27  <Field WeakReference b>
		//   26   59:invokevirtual   #35  <Method Object WeakReference.get()>
		//   27   62:checkcast       #59  <Class Messenger>
		//   28   65:astore_3        
			message.what;
		//   29   66:aload_1         
		//   30   67:getfield        #63  <Field int Message.what>
			JVM INSTR tableswitch 1 3: default 263
		//		               1 133
		//		               2 125
		//		               3 96;
		//   31   70:tableswitch     1 3: default 263
		//		               1 133
		//		               2 125
		//		               3 96
			   goto _L3 _L4 _L5 _L6
_L6:
			j1.a(messenger, bundle.getString("data_media_item_id"), ((List) (bundle.getParcelableArrayList("data_media_item_list"))), bundle.getBundle("data_options"));
		//   32   96:aload_2         
		//   33   97:aload_3         
		//   34   98:aload           4
		//   35  100:ldc1            #65  <String "data_media_item_id">
		//   36  102:invokevirtual   #69  <Method String Bundle.getString(String)>
		//   37  105:aload           4
		//   38  107:ldc1            #71  <String "data_media_item_list">
		//   39  109:invokevirtual   #75  <Method ArrayList Bundle.getParcelableArrayList(String)>
		//   40  112:aload           4
		//   41  114:ldc1            #77  <String "data_options">
		//   42  116:invokevirtual   #81  <Method Bundle Bundle.getBundle(String)>
		//   43  119:invokeinterface #84  <Method void MediaBrowserCompat$j.a(Messenger, String, List, Bundle)>
			return;
		//   44  124:return          
		//*  45  125:aload_2         
		//*  46  126:aload_3         
		//*  47  127:invokeinterface #86  <Method void MediaBrowserCompat$j.a(Messenger)>
		//*  48  132:return          
_L4:
			j1.a(messenger, bundle.getString("data_media_item_id"), (android.support.v4.media.session.MediaSessionCompat.Token)bundle.getParcelable("data_media_session_token"), bundle.getBundle("data_root_hints"));
		//   49  133:aload_2         
		//   50  134:aload_3         
		//   51  135:aload           4
		//   52  137:ldc1            #65  <String "data_media_item_id">
		//   53  139:invokevirtual   #69  <Method String Bundle.getString(String)>
		//   54  142:aload           4
		//   55  144:ldc1            #88  <String "data_media_session_token">
		//   56  146:invokevirtual   #92  <Method Parcelable Bundle.getParcelable(String)>
		//   57  149:checkcast       #94  <Class android.support.v4.media.session.MediaSessionCompat$Token>
		//   58  152:aload           4
		//   59  154:ldc1            #96  <String "data_root_hints">
		//   60  156:invokevirtual   #81  <Method Bundle Bundle.getBundle(String)>
		//   61  159:invokeinterface #99  <Method void MediaBrowserCompat$j.a(Messenger, String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
			return;
		//   62  164:return          
_L3:
			StringBuilder stringbuilder = new StringBuilder();
		//   63  165:new             #101 <Class StringBuilder>
		//   64  168:dup             
		//   65  169:invokespecial   #102 <Method void StringBuilder()>
		//   66  172:astore          4
			stringbuilder.append("Unhandled message: ");
		//   67  174:aload           4
		//   68  176:ldc1            #104 <String "Unhandled message: ">
		//   69  178:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   70  181:pop             
			stringbuilder.append(((Object) (message)));
		//   71  182:aload           4
		//   72  184:aload_1         
		//   73  185:invokevirtual   #111 <Method StringBuilder StringBuilder.append(Object)>
		//   74  188:pop             
			stringbuilder.append("\n  Client version: ");
		//   75  189:aload           4
		//   76  191:ldc1            #113 <String "\n  Client version: ">
		//   77  193:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   78  196:pop             
			stringbuilder.append(1);
		//   79  197:aload           4
		//   80  199:iconst_1        
		//   81  200:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
		//   82  203:pop             
			stringbuilder.append("\n  Service version: ");
		//   83  204:aload           4
		//   84  206:ldc1            #118 <String "\n  Service version: ">
		//   85  208:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
		//   86  211:pop             
			stringbuilder.append(message.arg1);
		//   87  212:aload           4
		//   88  214:aload_1         
		//   89  215:getfield        #121 <Field int Message.arg1>
		//   90  218:invokevirtual   #116 <Method StringBuilder StringBuilder.append(int)>
		//   91  221:pop             
			Log.w("MediaBrowserCompat", stringbuilder.toString());
		//   92  222:ldc1            #123 <String "MediaBrowserCompat">
		//   93  224:aload           4
		//   94  226:invokevirtual   #127 <Method String StringBuilder.toString()>
		//   95  229:invokestatic    #133 <Method int Log.w(String, String)>
		//   96  232:pop             
			return;
		//   97  233:return          
_L5:
			try
			{
				j1.a(messenger);
				return;
			}
		//*  98  234:ldc1            #123 <String "MediaBrowserCompat">
		//*  99  236:ldc1            #135 <String "Could not unparcel the data.">
		//* 100  238:invokestatic    #138 <Method int Log.e(String, String)>
		//* 101  241:pop             
		//* 102  242:aload_1         
		//* 103  243:getfield        #63  <Field int Message.what>
		//* 104  246:iconst_1        
		//* 105  247:icmpne          257
		//* 106  250:aload_2         
		//* 107  251:aload_3         
		//* 108  252:invokeinterface #86  <Method void MediaBrowserCompat$j.a(Messenger)>
		//* 109  257:return          
			// Misplaced declaration of an exception variable
			catch(BadParcelableException badparcelableexception)
			{
				Log.e("MediaBrowserCompat", "Could not unparcel the data.");
			}
			if(message.what == 1)
				j1.a(messenger);
_L2:
			BadParcelableException badparcelableexception;
		//* 110  258:astore          4
		//* 111  260:goto            234
		//* 112  263:goto            165
		}

		private final WeakReference a;
		private WeakReference b;

		a(j j1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Handler()>
			a = new WeakReference(((Object) (j1)));
		//    2    4:aload_0         
		//    3    5:new             #18  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #21  <Method void WeakReference(Object)>
		//    7   13:putfield        #23  <Field WeakReference a>
		//    8   16:return          
		}
	}

	public static class b
	{

		public void a()
		{
		//    0    0:return          
		}

		void a(a a1)
		{
			b = a1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field MediaBrowserCompat$b$a b>
		//    3    5:return          
		}

		public void b()
		{
		//    0    0:return          
		}

		public void c()
		{
		//    0    0:return          
		}

		final Object a;
		a b;

		public b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			Object obj;
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   2    4:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          21
		//*   4    9:icmplt          30
				obj = android.support.v4.media.a.a(((a.a) (new b(this))));
		//    5   12:new             #12  <Class MediaBrowserCompat$b$b>
		//    6   15:dup             
		//    7   16:aload_0         
		//    8   17:invokespecial   #27  <Method void MediaBrowserCompat$b$b(MediaBrowserCompat$b)>
		//    9   20:invokestatic    #32  <Method Object a.a(a$a)>
		//   10   23:astore_1        
			else
		//*  11   24:aload_0         
		//*  12   25:aload_1         
		//*  13   26:putfield        #34  <Field Object a>
		//*  14   29:return          
				obj = null;
		//   15   30:aconst_null     
		//   16   31:astore_1        
			a = obj;
		//*  17   32:goto            24
		}
	}

	static interface b.a
	{

		public abstract void a();

		public abstract void b();

		public abstract void c();
	}

	private class b.b
		implements a.a
	{

		public void a()
		{
			if(a.b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field MediaBrowserCompat$b a>
		//*   2    4:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//*   3    7:ifnull          22
				a.b.a();
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field MediaBrowserCompat$b a>
		//    6   14:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//    7   17:invokeinterface #28  <Method void MediaBrowserCompat$b$a.a()>
			a.a();
		//    8   22:aload_0         
		//    9   23:getfield        #17  <Field MediaBrowserCompat$b a>
		//   10   26:invokevirtual   #29  <Method void MediaBrowserCompat$b.a()>
		//   11   29:return          
		}

		public void b()
		{
			if(a.b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field MediaBrowserCompat$b a>
		//*   2    4:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//*   3    7:ifnull          22
				a.b.b();
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field MediaBrowserCompat$b a>
		//    6   14:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//    7   17:invokeinterface #31  <Method void MediaBrowserCompat$b$a.b()>
			a.b();
		//    8   22:aload_0         
		//    9   23:getfield        #17  <Field MediaBrowserCompat$b a>
		//   10   26:invokevirtual   #32  <Method void MediaBrowserCompat$b.b()>
		//   11   29:return          
		}

		public void c()
		{
			if(a.b != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field MediaBrowserCompat$b a>
		//*   2    4:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//*   3    7:ifnull          22
				a.b.c();
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field MediaBrowserCompat$b a>
		//    6   14:getfield        #24  <Field MediaBrowserCompat$b$a MediaBrowserCompat$b.b>
		//    7   17:invokeinterface #35  <Method void MediaBrowserCompat$b$a.c()>
			a.c();
		//    8   22:aload_0         
		//    9   23:getfield        #17  <Field MediaBrowserCompat$b a>
		//   10   26:invokevirtual   #36  <Method void MediaBrowserCompat$b.c()>
		//   11   29:return          
		}

		final b a;

		b.b(b b1)
		{
			a = b1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MediaBrowserCompat$b a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}

	public static abstract class c
	{

		public void a(String s, Bundle bundle, Bundle bundle1)
		{
		//    0    0:return          
		}

		public void b(String s, Bundle bundle, Bundle bundle1)
		{
		//    0    0:return          
		}

		public void c(String s, Bundle bundle, Bundle bundle1)
		{
		//    0    0:return          
		}
	}

	public static abstract class d
	{

		public void a(MediaItem mediaitem)
		{
		//    0    0:return          
		}

		public void a(String s)
		{
		//    0    0:return          
		}
	}

	static interface e
	{

		public abstract void d();

		public abstract void e();

		public abstract android.support.v4.media.session.MediaSessionCompat.Token f();
	}

	static class f
		implements b.a, e, j
	{

		public void a()
		{
			RemoteException remoteexception;
			Object obj = ((Object) (android.support.v4.media.a.c(b)));
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field Object b>
		//    2    4:invokestatic    #82  <Method Bundle a.c(Object)>
		//    3    7:astore_1        
			if(obj == null)
		//*   4    8:aload_1         
		//*   5    9:ifnonnull       13
				return;
		//    6   12:return          
			IBinder ibinder = BundleCompat.getBinder(((Bundle) (obj)), "extra_messenger");
		//    7   13:aload_1         
		//    8   14:ldc1            #84  <String "extra_messenger">
		//    9   16:invokestatic    #90  <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   10   19:astore_2        
			if(ibinder != null)
		//*  11   20:aload_2         
		//*  12   21:ifnull          88
			{
				e = new l(ibinder, c);
		//   13   24:aload_0         
		//   14   25:new             #92  <Class MediaBrowserCompat$l>
		//   15   28:dup             
		//   16   29:aload_2         
		//   17   30:aload_0         
		//   18   31:getfield        #62  <Field Bundle c>
		//   19   34:invokespecial   #95  <Method void MediaBrowserCompat$l(IBinder, Bundle)>
		//   20   37:putfield        #97  <Field MediaBrowserCompat$l e>
				f = new Messenger(((Handler) (d)));
		//   21   40:aload_0         
		//   22   41:new             #99  <Class Messenger>
		//   23   44:dup             
		//   24   45:aload_0         
		//   25   46:getfield        #41  <Field MediaBrowserCompat$a d>
		//   26   49:invokespecial   #102 <Method void Messenger(Handler)>
		//   27   52:putfield        #104 <Field Messenger f>
				d.a(f);
		//   28   55:aload_0         
		//   29   56:getfield        #41  <Field MediaBrowserCompat$a d>
		//   30   59:aload_0         
		//   31   60:getfield        #104 <Field Messenger f>
		//   32   63:invokevirtual   #107 <Method void MediaBrowserCompat$a.a(Messenger)>
				try
				{
					e.b(f);
		//   33   66:aload_0         
		//   34   67:getfield        #97  <Field MediaBrowserCompat$l e>
		//   35   70:aload_0         
		//   36   71:getfield        #104 <Field Messenger f>
		//   37   74:invokevirtual   #109 <Method void MediaBrowserCompat$l.b(Messenger)>
				}
		//*  38   77:goto            88
		//*  39   80:ldc1            #111 <String "MediaBrowserCompat">
		//*  40   82:ldc1            #113 <String "Remote error registering client messenger.">
		//*  41   84:invokestatic    #119 <Method int Log.i(String, String)>
		//*  42   87:pop             
		//*  43   88:aload_1         
		//*  44   89:ldc1            #121 <String "extra_session_binder">
		//*  45   91:invokestatic    #90  <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//*  46   94:invokestatic    #126 <Method android.support.v4.media.session.b android.support.v4.media.session.b$a.a(IBinder)>
		//*  47   97:astore_1        
		//*  48   98:aload_1         
		//*  49   99:ifnull          117
		//*  50  102:aload_0         
		//*  51  103:aload_0         
		//*  52  104:getfield        #76  <Field Object b>
		//*  53  107:invokestatic    #129 <Method Object a.d(Object)>
		//*  54  110:aload_1         
		//*  55  111:invokestatic    #134 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.a(Object, android.support.v4.media.session.b)>
		//*  56  114:putfield        #136 <Field android.support.v4.media.session.MediaSessionCompat$Token h>
		//*  57  117:return          
				// Misplaced declaration of an exception variable
				catch(RemoteException remoteexception)
				{
					Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
				}
			}
			obj = ((Object) (android.support.v4.media.session.b.a.a(BundleCompat.getBinder(((Bundle) (obj)), "extra_session_binder"))));
			if(obj != null)
				h = android.support.v4.media.session.MediaSessionCompat.Token.a(android.support.v4.media.a.d(b), ((android.support.v4.media.session.b) (obj)));
		//*  58  118:astore_2        
		//*  59  119:goto            80
		}

		public void a(Messenger messenger)
		{
		//    0    0:return          
		}

		public void a(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
		{
		//    0    0:return          
		}

		public void a(Messenger messenger, String s, List list, Bundle bundle)
		{
			if(f != messenger)
		//*   0    0:aload_0         
		//*   1    1:getfield        #104 <Field Messenger f>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       9
				return;
		//    4    8:return          
			messenger = ((Messenger) ((m)g.get(((Object) (s)))));
		//    5    9:aload_0         
		//    6   10:getfield        #46  <Field android.support.v4.f.a g>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #141 <Method Object android.support.v4.f.a.get(Object)>
		//    9   17:checkcast       #143 <Class MediaBrowserCompat$m>
		//   10   20:astore_1        
			if(messenger == null)
		//*  11   21:aload_1         
		//*  12   22:ifnonnull       63
			{
				if(MediaBrowserCompat.a)
		//*  13   25:getstatic       #146 <Field boolean MediaBrowserCompat.a>
		//*  14   28:ifeq            62
				{
					messenger = ((Messenger) (new StringBuilder()));
		//   15   31:new             #148 <Class StringBuilder>
		//   16   34:dup             
		//   17   35:invokespecial   #149 <Method void StringBuilder()>
		//   18   38:astore_1        
					((StringBuilder) (messenger)).append("onLoadChildren for id that isn't subscribed id=");
		//   19   39:aload_1         
		//   20   40:ldc1            #151 <String "onLoadChildren for id that isn't subscribed id=">
		//   21   42:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
		//   22   45:pop             
					((StringBuilder) (messenger)).append(s);
		//   23   46:aload_1         
		//   24   47:aload_2         
		//   25   48:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
		//   26   51:pop             
					Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   27   52:ldc1            #111 <String "MediaBrowserCompat">
		//   28   54:aload_1         
		//   29   55:invokevirtual   #159 <Method String StringBuilder.toString()>
		//   30   58:invokestatic    #161 <Method int Log.d(String, String)>
		//   31   61:pop             
				}
				return;
		//   32   62:return          
			}
			messenger = ((Messenger) (((m) (messenger)).a(a, bundle)));
		//   33   63:aload_1         
		//   34   64:aload_0         
		//   35   65:getfield        #48  <Field Context a>
		//   36   68:aload           4
		//   37   70:invokevirtual   #164 <Method MediaBrowserCompat$n MediaBrowserCompat$m.a(Context, Bundle)>
		//   38   73:astore_1        
			if(messenger != null)
		//*  39   74:aload_1         
		//*  40   75:ifnull          120
			{
				if(bundle == null)
		//*  41   78:aload           4
		//*  42   80:ifnonnull       100
					if(list == null)
		//*  43   83:aload_3         
		//*  44   84:ifnonnull       93
					{
						((n) (messenger)).a(s);
		//   45   87:aload_1         
		//   46   88:aload_2         
		//   47   89:invokevirtual   #169 <Method void MediaBrowserCompat$n.a(String)>
						return;
		//   48   92:return          
					} else
					{
						((n) (messenger)).a(s, list);
		//   49   93:aload_1         
		//   50   94:aload_2         
		//   51   95:aload_3         
		//   52   96:invokevirtual   #172 <Method void MediaBrowserCompat$n.a(String, List)>
						return;
		//   53   99:return          
					}
				if(list == null)
		//*  54  100:aload_3         
		//*  55  101:ifnonnull       112
				{
					((n) (messenger)).a(s, bundle);
		//   56  104:aload_1         
		//   57  105:aload_2         
		//   58  106:aload           4
		//   59  108:invokevirtual   #175 <Method void MediaBrowserCompat$n.a(String, Bundle)>
					return;
		//   60  111:return          
				}
				((n) (messenger)).a(s, list, bundle);
		//   61  112:aload_1         
		//   62  113:aload_2         
		//   63  114:aload_3         
		//   64  115:aload           4
		//   65  117:invokevirtual   #178 <Method void MediaBrowserCompat$n.a(String, List, Bundle)>
			}
		//   66  120:return          
		}

		public void b()
		{
			e = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #97  <Field MediaBrowserCompat$l e>
			f = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #104 <Field Messenger f>
			h = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #136 <Field android.support.v4.media.session.MediaSessionCompat$Token h>
			d.a(((Messenger) (null)));
		//    9   15:aload_0         
		//   10   16:getfield        #41  <Field MediaBrowserCompat$a d>
		//   11   19:aconst_null     
		//   12   20:invokevirtual   #107 <Method void MediaBrowserCompat$a.a(Messenger)>
		//   13   23:return          
		}

		public void c()
		{
		//    0    0:return          
		}

		public void d()
		{
			android.support.v4.media.a.a(b);
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field Object b>
		//    2    4:invokestatic    #181 <Method void a.a(Object)>
		//    3    7:return          
		}

		public void e()
		{
			RemoteException remoteexception;
			if(e != null && f != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #97  <Field MediaBrowserCompat$l e>
		//*   2    4:ifnull          36
		//*   3    7:aload_0         
		//*   4    8:getfield        #104 <Field Messenger f>
		//*   5   11:ifnull          36
				try
				{
					e.c(f);
		//    6   14:aload_0         
		//    7   15:getfield        #97  <Field MediaBrowserCompat$l e>
		//    8   18:aload_0         
		//    9   19:getfield        #104 <Field Messenger f>
		//   10   22:invokevirtual   #183 <Method void MediaBrowserCompat$l.c(Messenger)>
				}
		//*  11   25:goto            36
		//*  12   28:ldc1            #111 <String "MediaBrowserCompat">
		//*  13   30:ldc1            #185 <String "Remote error unregistering client messenger.">
		//*  14   32:invokestatic    #119 <Method int Log.i(String, String)>
		//*  15   35:pop             
		//*  16   36:aload_0         
		//*  17   37:getfield        #76  <Field Object b>
		//*  18   40:invokestatic    #187 <Method void a.b(Object)>
		//*  19   43:return          
				// Misplaced declaration of an exception variable
				catch(RemoteException remoteexception)
				{
					Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
				}
			android.support.v4.media.a.b(b);
		//*  20   44:astore_1        
		//*  21   45:goto            28
		}

		public android.support.v4.media.session.MediaSessionCompat.Token f()
		{
			if(h == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #136 <Field android.support.v4.media.session.MediaSessionCompat$Token h>
		//*   2    4:ifnonnull       21
				h = android.support.v4.media.session.MediaSessionCompat.Token.a(android.support.v4.media.a.d(b));
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #76  <Field Object b>
		//    6   12:invokestatic    #129 <Method Object a.d(Object)>
		//    7   15:invokestatic    #191 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.a(Object)>
		//    8   18:putfield        #136 <Field android.support.v4.media.session.MediaSessionCompat$Token h>
			return h;
		//    9   21:aload_0         
		//   10   22:getfield        #136 <Field android.support.v4.media.session.MediaSessionCompat$Token h>
		//   11   25:areturn         
		}

		final Context a;
		protected final Object b;
		protected final Bundle c;
		protected final a d = new a(((j) (this)));
		protected l e;
		protected Messenger f;
		private final android.support.v4.f.a g = new android.support.v4.f.a();
		private android.support.v4.media.session.MediaSessionCompat.Token h;

		public f(Context context, ComponentName componentname, b b1, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #36  <Class MediaBrowserCompat$a>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #39  <Method void MediaBrowserCompat$a(MediaBrowserCompat$j)>
		//    7   13:putfield        #41  <Field MediaBrowserCompat$a d>
		//    8   16:aload_0         
		//    9   17:new             #43  <Class android.support.v4.f.a>
		//   10   20:dup             
		//   11   21:invokespecial   #44  <Method void android.support.v4.f.a()>
		//   12   24:putfield        #46  <Field android.support.v4.f.a g>
			a = context;
		//   13   27:aload_0         
		//   14   28:aload_1         
		//   15   29:putfield        #48  <Field Context a>
			Bundle bundle1 = bundle;
		//   16   32:aload           4
		//   17   34:astore          5
			if(bundle == null)
		//*  18   36:aload           4
		//*  19   38:ifnonnull       50
				bundle1 = new Bundle();
		//   20   41:new             #50  <Class Bundle>
		//   21   44:dup             
		//   22   45:invokespecial   #51  <Method void Bundle()>
		//   23   48:astore          5
			bundle1.putInt("extra_client_version", 1);
		//   24   50:aload           5
		//   25   52:ldc1            #53  <String "extra_client_version">
		//   26   54:iconst_1        
		//   27   55:invokevirtual   #57  <Method void Bundle.putInt(String, int)>
			c = new Bundle(bundle1);
		//   28   58:aload_0         
		//   29   59:new             #50  <Class Bundle>
		//   30   62:dup             
		//   31   63:aload           5
		//   32   65:invokespecial   #60  <Method void Bundle(Bundle)>
		//   33   68:putfield        #62  <Field Bundle c>
			b1.a(((b.a) (this)));
		//   34   71:aload_3         
		//   35   72:aload_0         
		//   36   73:invokevirtual   #67  <Method void MediaBrowserCompat$b.a(MediaBrowserCompat$b$a)>
			b = android.support.v4.media.a.a(context, componentname, b1.a, c);
		//   37   76:aload_0         
		//   38   77:aload_1         
		//   39   78:aload_2         
		//   40   79:aload_3         
		//   41   80:getfield        #69  <Field Object MediaBrowserCompat$b.a>
		//   42   83:aload_0         
		//   43   84:getfield        #62  <Field Bundle c>
		//   44   87:invokestatic    #74  <Method Object a.a(Context, ComponentName, Object, Bundle)>
		//   45   90:putfield        #76  <Field Object b>
		//   46   93:return          
		}
	}

	static class g extends f
	{

		public g(Context context, ComponentName componentname, b b1, Bundle bundle)
		{
			super(context, componentname, b1, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #11  <Method void MediaBrowserCompat$f(Context, ComponentName, MediaBrowserCompat$b, Bundle)>
		//    6    9:return          
		}
	}

	static class h extends g
	{

		public h(Context context, ComponentName componentname, b b1, Bundle bundle)
		{
			super(context, componentname, b1, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #11  <Method void MediaBrowserCompat$g(Context, ComponentName, MediaBrowserCompat$b, Bundle)>
		//    6    9:return          
		}
	}

	static class i
		implements e, j
	{

		private static String a(int i1)
		{
			switch(i1)
		//*   0    0:iload_0         
			{
		//*   1    1:tableswitch     0 4: default 36
		//		               0 74
		//		               1 71
		//		               2 68
		//		               3 65
		//		               4 62
			default:
				StringBuilder stringbuilder = new StringBuilder();
		//    2   36:new             #93  <Class StringBuilder>
		//    3   39:dup             
		//    4   40:invokespecial   #94  <Method void StringBuilder()>
		//    5   43:astore_1        
				stringbuilder.append("UNKNOWN/");
		//    6   44:aload_1         
		//    7   45:ldc1            #96  <String "UNKNOWN/">
		//    8   47:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//    9   50:pop             
				stringbuilder.append(i1);
		//   10   51:aload_1         
		//   11   52:iload_0         
		//   12   53:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
		//   13   56:pop             
				return stringbuilder.toString();
		//   14   57:aload_1         
		//   15   58:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   16   61:areturn         

			case 4: // '\004'
				return "CONNECT_STATE_SUSPENDED";
		//   17   62:ldc1            #109 <String "CONNECT_STATE_SUSPENDED">
		//   18   64:areturn         

			case 3: // '\003'
				return "CONNECT_STATE_CONNECTED";
		//   19   65:ldc1            #111 <String "CONNECT_STATE_CONNECTED">
		//   20   67:areturn         

			case 2: // '\002'
				return "CONNECT_STATE_CONNECTING";
		//   21   68:ldc1            #113 <String "CONNECT_STATE_CONNECTING">
		//   22   70:areturn         

			case 1: // '\001'
				return "CONNECT_STATE_DISCONNECTED";
		//   23   71:ldc1            #115 <String "CONNECT_STATE_DISCONNECTED">
		//   24   73:areturn         

			case 0: // '\0'
				return "CONNECT_STATE_DISCONNECTING";
		//   25   74:ldc1            #117 <String "CONNECT_STATE_DISCONNECTING">
		//   26   76:areturn         
			}
		}

		private boolean a(Messenger messenger, String s)
		{
			if(i == messenger && f != 0 && f != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #120 <Field Messenger i>
		//*   2    4:aload_1         
		//*   3    5:if_acmpne       28
		//*   4    8:aload_0         
		//*   5    9:getfield        #65  <Field int f>
		//*   6   12:ifeq            28
		//*   7   15:aload_0         
		//*   8   16:getfield        #65  <Field int f>
		//*   9   19:iconst_1        
		//*  10   20:icmpne          26
		//*  11   23:goto            28
				return true;
		//   12   26:iconst_1        
		//   13   27:ireturn         
			if(f != 0 && f != 1)
		//*  14   28:aload_0         
		//*  15   29:getfield        #65  <Field int f>
		//*  16   32:ifeq            112
		//*  17   35:aload_0         
		//*  18   36:getfield        #65  <Field int f>
		//*  19   39:iconst_1        
		//*  20   40:icmpeq          112
			{
				messenger = ((Messenger) (new StringBuilder()));
		//   21   43:new             #93  <Class StringBuilder>
		//   22   46:dup             
		//   23   47:invokespecial   #94  <Method void StringBuilder()>
		//   24   50:astore_1        
				((StringBuilder) (messenger)).append(s);
		//   25   51:aload_1         
		//   26   52:aload_2         
		//   27   53:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   28   56:pop             
				((StringBuilder) (messenger)).append(" for ");
		//   29   57:aload_1         
		//   30   58:ldc1            #122 <String " for ">
		//   31   60:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   32   63:pop             
				((StringBuilder) (messenger)).append(((Object) (b)));
		//   33   64:aload_1         
		//   34   65:aload_0         
		//   35   66:getfield        #80  <Field ComponentName b>
		//   36   69:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//   37   72:pop             
				((StringBuilder) (messenger)).append(" with mCallbacksMessenger=");
		//   38   73:aload_1         
		//   39   74:ldc1            #127 <String " with mCallbacksMessenger=">
		//   40   76:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   41   79:pop             
				((StringBuilder) (messenger)).append(((Object) (i)));
		//   42   80:aload_1         
		//   43   81:aload_0         
		//   44   82:getfield        #120 <Field Messenger i>
		//   45   85:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//   46   88:pop             
				((StringBuilder) (messenger)).append(" this=");
		//   47   89:aload_1         
		//   48   90:ldc1            #129 <String " this=">
		//   49   92:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   50   95:pop             
				((StringBuilder) (messenger)).append(((Object) (this)));
		//   51   96:aload_1         
		//   52   97:aload_0         
		//   53   98:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//   54  101:pop             
				Log.i("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   55  102:ldc1            #131 <String "MediaBrowserCompat">
		//   56  104:aload_1         
		//   57  105:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   58  108:invokestatic    #136 <Method int Log.i(String, String)>
		//   59  111:pop             
			}
			return false;
		//   60  112:iconst_0        
		//   61  113:ireturn         
		}

		void a()
		{
			if(g != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #138 <Field MediaBrowserCompat$i$a g>
		//*   2    4:ifnull          18
				a.unbindService(((ServiceConnection) (g)));
		//    3    7:aload_0         
		//    4    8:getfield        #78  <Field Context a>
		//    5   11:aload_0         
		//    6   12:getfield        #138 <Field MediaBrowserCompat$i$a g>
		//    7   15:invokevirtual   #144 <Method void Context.unbindService(ServiceConnection)>
			f = 1;
		//    8   18:aload_0         
		//    9   19:iconst_1        
		//   10   20:putfield        #65  <Field int f>
			g = null;
		//   11   23:aload_0         
		//   12   24:aconst_null     
		//   13   25:putfield        #138 <Field MediaBrowserCompat$i$a g>
			h = null;
		//   14   28:aload_0         
		//   15   29:aconst_null     
		//   16   30:putfield        #146 <Field MediaBrowserCompat$l h>
			i = null;
		//   17   33:aload_0         
		//   18   34:aconst_null     
		//   19   35:putfield        #120 <Field Messenger i>
			e.a(((Messenger) (null)));
		//   20   38:aload_0         
		//   21   39:getfield        #58  <Field MediaBrowserCompat$a e>
		//   22   42:aconst_null     
		//   23   43:invokevirtual   #149 <Method void MediaBrowserCompat$a.a(Messenger)>
			k = null;
		//   24   46:aload_0         
		//   25   47:aconst_null     
		//   26   48:putfield        #151 <Field String k>
			l = null;
		//   27   51:aload_0         
		//   28   52:aconst_null     
		//   29   53:putfield        #153 <Field android.support.v4.media.session.MediaSessionCompat$Token l>
		//   30   56:return          
		}

		public void a(Messenger messenger)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #93  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #94  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("onConnectFailed for ");
		//    4    8:aload_2         
		//    5    9:ldc1            #155 <String "onConnectFailed for ">
		//    6   11:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (b)));
		//    8   15:aload_2         
		//    9   16:aload_0         
		//   10   17:getfield        #80  <Field ComponentName b>
		//   11   20:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			Log.e("MediaBrowserCompat", stringbuilder.toString());
		//   13   24:ldc1            #131 <String "MediaBrowserCompat">
		//   14   26:aload_2         
		//   15   27:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   16   30:invokestatic    #157 <Method int Log.e(String, String)>
		//   17   33:pop             
			if(!a(messenger, "onConnectFailed"))
		//*  18   34:aload_0         
		//*  19   35:aload_1         
		//*  20   36:ldc1            #159 <String "onConnectFailed">
		//*  21   38:invokespecial   #161 <Method boolean a(Messenger, String)>
		//*  22   41:ifne            45
				return;
		//   23   44:return          
			if(f != 2)
		//*  24   45:aload_0         
		//*  25   46:getfield        #65  <Field int f>
		//*  26   49:iconst_2        
		//*  27   50:icmpeq          98
			{
				messenger = ((Messenger) (new StringBuilder()));
		//   28   53:new             #93  <Class StringBuilder>
		//   29   56:dup             
		//   30   57:invokespecial   #94  <Method void StringBuilder()>
		//   31   60:astore_1        
				((StringBuilder) (messenger)).append("onConnect from service while mState=");
		//   32   61:aload_1         
		//   33   62:ldc1            #163 <String "onConnect from service while mState=">
		//   34   64:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   35   67:pop             
				((StringBuilder) (messenger)).append(a(f));
		//   36   68:aload_1         
		//   37   69:aload_0         
		//   38   70:getfield        #65  <Field int f>
		//   39   73:invokestatic    #165 <Method String a(int)>
		//   40   76:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   41   79:pop             
				((StringBuilder) (messenger)).append("... ignoring");
		//   42   80:aload_1         
		//   43   81:ldc1            #167 <String "... ignoring">
		//   44   83:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   45   86:pop             
				Log.w("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   46   87:ldc1            #131 <String "MediaBrowserCompat">
		//   47   89:aload_1         
		//   48   90:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   49   93:invokestatic    #170 <Method int Log.w(String, String)>
		//   50   96:pop             
				return;
		//   51   97:return          
			} else
			{
				a();
		//   52   98:aload_0         
		//   53   99:invokevirtual   #172 <Method void a()>
				c.c();
		//   54  102:aload_0         
		//   55  103:getfield        #82  <Field MediaBrowserCompat$b c>
		//   56  106:invokevirtual   #176 <Method void MediaBrowserCompat$b.c()>
				return;
		//   57  109:return          
			}
		}

		public void a(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
		{
			if(!a(messenger, "onConnect"))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:ldc1            #181 <String "onConnect">
		//*   3    4:invokespecial   #161 <Method boolean a(Messenger, String)>
		//*   4    7:ifne            11
				return;
		//    5   10:return          
			if(f != 2)
		//*   6   11:aload_0         
		//*   7   12:getfield        #65  <Field int f>
		//*   8   15:iconst_2        
		//*   9   16:icmpeq          64
			{
				messenger = ((Messenger) (new StringBuilder()));
		//   10   19:new             #93  <Class StringBuilder>
		//   11   22:dup             
		//   12   23:invokespecial   #94  <Method void StringBuilder()>
		//   13   26:astore_1        
				((StringBuilder) (messenger)).append("onConnect from service while mState=");
		//   14   27:aload_1         
		//   15   28:ldc1            #163 <String "onConnect from service while mState=">
		//   16   30:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
				((StringBuilder) (messenger)).append(a(f));
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #65  <Field int f>
		//   21   39:invokestatic    #165 <Method String a(int)>
		//   22   42:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   23   45:pop             
				((StringBuilder) (messenger)).append("... ignoring");
		//   24   46:aload_1         
		//   25   47:ldc1            #167 <String "... ignoring">
		//   26   49:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   27   52:pop             
				Log.w("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   28   53:ldc1            #131 <String "MediaBrowserCompat">
		//   29   55:aload_1         
		//   30   56:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   31   59:invokestatic    #170 <Method int Log.w(String, String)>
		//   32   62:pop             
				return;
		//   33   63:return          
			}
			k = s;
		//   34   64:aload_0         
		//   35   65:aload_2         
		//   36   66:putfield        #151 <Field String k>
			l = token;
		//   37   69:aload_0         
		//   38   70:aload_3         
		//   39   71:putfield        #153 <Field android.support.v4.media.session.MediaSessionCompat$Token l>
			m = bundle;
		//   40   74:aload_0         
		//   41   75:aload           4
		//   42   77:putfield        #183 <Field Bundle m>
			f = 3;
		//   43   80:aload_0         
		//   44   81:iconst_3        
		//   45   82:putfield        #65  <Field int f>
			if(MediaBrowserCompat.a)
		//*  46   85:getstatic       #186 <Field boolean MediaBrowserCompat.a>
		//*  47   88:ifeq            103
			{
				Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
		//   48   91:ldc1            #131 <String "MediaBrowserCompat">
		//   49   93:ldc1            #188 <String "ServiceCallbacks.onConnect...">
		//   50   95:invokestatic    #190 <Method int Log.d(String, String)>
		//   51   98:pop             
				c();
		//   52   99:aload_0         
		//   53  100:invokevirtual   #191 <Method void c()>
			}
			c.a();
		//   54  103:aload_0         
		//   55  104:getfield        #82  <Field MediaBrowserCompat$b c>
		//   56  107:invokevirtual   #192 <Method void MediaBrowserCompat$b.a()>
			messenger = ((Messenger) (j.entrySet().iterator()));
		//   57  110:aload_0         
		//   58  111:getfield        #63  <Field android.support.v4.f.a j>
		//   59  114:invokevirtual   #196 <Method Set android.support.v4.f.a.entrySet()>
		//   60  117:invokeinterface #202 <Method Iterator Set.iterator()>
		//   61  122:astore_1        
_L4:
			if(!((Iterator) (messenger)).hasNext())
				break; /* Loop/switch isn't completed */
		//   62  123:aload_1         
		//   63  124:invokeinterface #208 <Method boolean Iterator.hasNext()>
		//   64  129:ifeq            245
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) ((java.util.Map.Entry)((Iterator) (messenger)).next()));
		//   65  132:aload_1         
		//   66  133:invokeinterface #212 <Method Object Iterator.next()>
		//   67  138:checkcast       #214 <Class java.util.Map$Entry>
		//   68  141:astore_3        
			s = (String)((java.util.Map.Entry) (token)).getKey();
		//   69  142:aload_3         
		//   70  143:invokeinterface #217 <Method Object java.util.Map$Entry.getKey()>
		//   71  148:checkcast       #219 <Class String>
		//   72  151:astore_2        
			bundle = ((Bundle) ((m)((java.util.Map.Entry) (token)).getValue()));
		//   73  152:aload_3         
		//   74  153:invokeinterface #222 <Method Object java.util.Map$Entry.getValue()>
		//   75  158:checkcast       #224 <Class MediaBrowserCompat$m>
		//   76  161:astore          4
			token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((m) (bundle)).b()));
		//   77  163:aload           4
		//   78  165:invokevirtual   #227 <Method List MediaBrowserCompat$m.b()>
		//   79  168:astore_3        
			bundle = ((Bundle) (((m) (bundle)).a()));
		//   80  169:aload           4
		//   81  171:invokevirtual   #229 <Method List MediaBrowserCompat$m.a()>
		//   82  174:astore          4
			int i1 = 0;
		//   83  176:iconst_0        
		//   84  177:istore          5
_L2:
			if(i1 >= ((List) (token)).size())
				break; /* Loop/switch isn't completed */
		//   85  179:iload           5
		//   86  181:aload_3         
		//   87  182:invokeinterface #235 <Method int List.size()>
		//   88  187:icmpge          123
			h.a(s, n.a((n)((List) (token)).get(i1)), (Bundle)((List) (bundle)).get(i1), i);
		//   89  190:aload_0         
		//   90  191:getfield        #146 <Field MediaBrowserCompat$l h>
		//   91  194:aload_2         
		//   92  195:aload_3         
		//   93  196:iload           5
		//   94  198:invokeinterface #239 <Method Object List.get(int)>
		//   95  203:checkcast       #241 <Class MediaBrowserCompat$n>
		//   96  206:invokestatic    #244 <Method IBinder MediaBrowserCompat$n.a(MediaBrowserCompat$n)>
		//   97  209:aload           4
		//   98  211:iload           5
		//   99  213:invokeinterface #239 <Method Object List.get(int)>
		//  100  218:checkcast       #84  <Class Bundle>
		//  101  221:aload_0         
		//  102  222:getfield        #120 <Field Messenger i>
		//  103  225:invokevirtual   #249 <Method void MediaBrowserCompat$l.a(String, IBinder, Bundle, Messenger)>
			i1++;
		//  104  228:iload           5
		//  105  230:iconst_1        
		//  106  231:iadd            
		//  107  232:istore          5
			if(true) goto _L2; else goto _L1
		//  108  234:goto            179
_L1:
			if(true) goto _L4; else goto _L3
_L6:
			Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
		//  109  237:ldc1            #131 <String "MediaBrowserCompat">
		//  110  239:ldc1            #251 <String "addSubscription failed with RemoteException.">
		//  111  241:invokestatic    #190 <Method int Log.d(String, String)>
		//  112  244:pop             
_L3:
			return;
		//  113  245:return          
			messenger;
		//  114  246:astore_1        
			if(true) goto _L6; else goto _L5
_L5:
		//* 115  247:goto            237
		}

		public void a(Messenger messenger, String s, List list, Bundle bundle)
		{
			if(!a(messenger, "onLoadChildren"))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:ldc1            #254 <String "onLoadChildren">
		//*   3    4:invokespecial   #161 <Method boolean a(Messenger, String)>
		//*   4    7:ifne            11
				return;
		//    5   10:return          
			if(MediaBrowserCompat.a)
		//*   6   11:getstatic       #186 <Field boolean MediaBrowserCompat.a>
		//*   7   14:ifeq            66
			{
				messenger = ((Messenger) (new StringBuilder()));
		//    8   17:new             #93  <Class StringBuilder>
		//    9   20:dup             
		//   10   21:invokespecial   #94  <Method void StringBuilder()>
		//   11   24:astore_1        
				((StringBuilder) (messenger)).append("onLoadChildren for ");
		//   12   25:aload_1         
		//   13   26:ldc2            #256 <String "onLoadChildren for ">
		//   14   29:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   15   32:pop             
				((StringBuilder) (messenger)).append(((Object) (b)));
		//   16   33:aload_1         
		//   17   34:aload_0         
		//   18   35:getfield        #80  <Field ComponentName b>
		//   19   38:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//   20   41:pop             
				((StringBuilder) (messenger)).append(" id=");
		//   21   42:aload_1         
		//   22   43:ldc2            #258 <String " id=">
		//   23   46:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   24   49:pop             
				((StringBuilder) (messenger)).append(s);
		//   25   50:aload_1         
		//   26   51:aload_2         
		//   27   52:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   28   55:pop             
				Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   29   56:ldc1            #131 <String "MediaBrowserCompat">
		//   30   58:aload_1         
		//   31   59:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   32   62:invokestatic    #190 <Method int Log.d(String, String)>
		//   33   65:pop             
			}
			messenger = ((Messenger) ((m)j.get(((Object) (s)))));
		//   34   66:aload_0         
		//   35   67:getfield        #63  <Field android.support.v4.f.a j>
		//   36   70:aload_2         
		//   37   71:invokevirtual   #261 <Method Object android.support.v4.f.a.get(Object)>
		//   38   74:checkcast       #224 <Class MediaBrowserCompat$m>
		//   39   77:astore_1        
			if(messenger == null)
		//*  40   78:aload_1         
		//*  41   79:ifnonnull       121
			{
				if(MediaBrowserCompat.a)
		//*  42   82:getstatic       #186 <Field boolean MediaBrowserCompat.a>
		//*  43   85:ifeq            120
				{
					messenger = ((Messenger) (new StringBuilder()));
		//   44   88:new             #93  <Class StringBuilder>
		//   45   91:dup             
		//   46   92:invokespecial   #94  <Method void StringBuilder()>
		//   47   95:astore_1        
					((StringBuilder) (messenger)).append("onLoadChildren for id that isn't subscribed id=");
		//   48   96:aload_1         
		//   49   97:ldc2            #263 <String "onLoadChildren for id that isn't subscribed id=">
		//   50  100:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   51  103:pop             
					((StringBuilder) (messenger)).append(s);
		//   52  104:aload_1         
		//   53  105:aload_2         
		//   54  106:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   55  109:pop             
					Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
		//   56  110:ldc1            #131 <String "MediaBrowserCompat">
		//   57  112:aload_1         
		//   58  113:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   59  116:invokestatic    #190 <Method int Log.d(String, String)>
		//   60  119:pop             
				}
				return;
		//   61  120:return          
			}
			messenger = ((Messenger) (((m) (messenger)).a(a, bundle)));
		//   62  121:aload_1         
		//   63  122:aload_0         
		//   64  123:getfield        #78  <Field Context a>
		//   65  126:aload           4
		//   66  128:invokevirtual   #266 <Method MediaBrowserCompat$n MediaBrowserCompat$m.a(Context, Bundle)>
		//   67  131:astore_1        
			if(messenger != null)
		//*  68  132:aload_1         
		//*  69  133:ifnull          178
			{
				if(bundle == null)
		//*  70  136:aload           4
		//*  71  138:ifnonnull       158
					if(list == null)
		//*  72  141:aload_3         
		//*  73  142:ifnonnull       151
					{
						((n) (messenger)).a(s);
		//   74  145:aload_1         
		//   75  146:aload_2         
		//   76  147:invokevirtual   #268 <Method void MediaBrowserCompat$n.a(String)>
						return;
		//   77  150:return          
					} else
					{
						((n) (messenger)).a(s, list);
		//   78  151:aload_1         
		//   79  152:aload_2         
		//   80  153:aload_3         
		//   81  154:invokevirtual   #271 <Method void MediaBrowserCompat$n.a(String, List)>
						return;
		//   82  157:return          
					}
				if(list == null)
		//*  83  158:aload_3         
		//*  84  159:ifnonnull       170
				{
					((n) (messenger)).a(s, bundle);
		//   85  162:aload_1         
		//   86  163:aload_2         
		//   87  164:aload           4
		//   88  166:invokevirtual   #274 <Method void MediaBrowserCompat$n.a(String, Bundle)>
					return;
		//   89  169:return          
				}
				((n) (messenger)).a(s, list, bundle);
		//   90  170:aload_1         
		//   91  171:aload_2         
		//   92  172:aload_3         
		//   93  173:aload           4
		//   94  175:invokevirtual   #277 <Method void MediaBrowserCompat$n.a(String, List, Bundle)>
			}
		//   95  178:return          
		}

		public boolean b()
		{
			return f == 3;
		//    0    0:aload_0         
		//    1    1:getfield        #65  <Field int f>
		//    2    4:iconst_3        
		//    3    5:icmpne          10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		void c()
		{
			Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
		//    0    0:ldc1            #131 <String "MediaBrowserCompat">
		//    1    2:ldc2            #279 <String "MediaBrowserCompat...">
		//    2    5:invokestatic    #190 <Method int Log.d(String, String)>
		//    3    8:pop             
			StringBuilder stringbuilder = new StringBuilder();
		//    4    9:new             #93  <Class StringBuilder>
		//    5   12:dup             
		//    6   13:invokespecial   #94  <Method void StringBuilder()>
		//    7   16:astore_1        
			stringbuilder.append("  mServiceComponent=");
		//    8   17:aload_1         
		//    9   18:ldc2            #281 <String "  mServiceComponent=">
		//   10   21:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
			stringbuilder.append(((Object) (b)));
		//   12   25:aload_1         
		//   13   26:aload_0         
		//   14   27:getfield        #80  <Field ComponentName b>
		//   15   30:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//   16   33:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   17   34:ldc1            #131 <String "MediaBrowserCompat">
		//   18   36:aload_1         
		//   19   37:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   20   40:invokestatic    #190 <Method int Log.d(String, String)>
		//   21   43:pop             
			stringbuilder = new StringBuilder();
		//   22   44:new             #93  <Class StringBuilder>
		//   23   47:dup             
		//   24   48:invokespecial   #94  <Method void StringBuilder()>
		//   25   51:astore_1        
			stringbuilder.append("  mCallback=");
		//   26   52:aload_1         
		//   27   53:ldc2            #283 <String "  mCallback=">
		//   28   56:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   29   59:pop             
			stringbuilder.append(((Object) (c)));
		//   30   60:aload_1         
		//   31   61:aload_0         
		//   32   62:getfield        #82  <Field MediaBrowserCompat$b c>
		//   33   65:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//   34   68:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   35   69:ldc1            #131 <String "MediaBrowserCompat">
		//   36   71:aload_1         
		//   37   72:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   38   75:invokestatic    #190 <Method int Log.d(String, String)>
		//   39   78:pop             
			stringbuilder = new StringBuilder();
		//   40   79:new             #93  <Class StringBuilder>
		//   41   82:dup             
		//   42   83:invokespecial   #94  <Method void StringBuilder()>
		//   43   86:astore_1        
			stringbuilder.append("  mRootHints=");
		//   44   87:aload_1         
		//   45   88:ldc2            #285 <String "  mRootHints=">
		//   46   91:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   47   94:pop             
			stringbuilder.append(((Object) (d)));
		//   48   95:aload_1         
		//   49   96:aload_0         
		//   50   97:getfield        #89  <Field Bundle d>
		//   51  100:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//   52  103:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   53  104:ldc1            #131 <String "MediaBrowserCompat">
		//   54  106:aload_1         
		//   55  107:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   56  110:invokestatic    #190 <Method int Log.d(String, String)>
		//   57  113:pop             
			stringbuilder = new StringBuilder();
		//   58  114:new             #93  <Class StringBuilder>
		//   59  117:dup             
		//   60  118:invokespecial   #94  <Method void StringBuilder()>
		//   61  121:astore_1        
			stringbuilder.append("  mState=");
		//   62  122:aload_1         
		//   63  123:ldc2            #287 <String "  mState=">
		//   64  126:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   65  129:pop             
			stringbuilder.append(a(f));
		//   66  130:aload_1         
		//   67  131:aload_0         
		//   68  132:getfield        #65  <Field int f>
		//   69  135:invokestatic    #165 <Method String a(int)>
		//   70  138:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   71  141:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   72  142:ldc1            #131 <String "MediaBrowserCompat">
		//   73  144:aload_1         
		//   74  145:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   75  148:invokestatic    #190 <Method int Log.d(String, String)>
		//   76  151:pop             
			stringbuilder = new StringBuilder();
		//   77  152:new             #93  <Class StringBuilder>
		//   78  155:dup             
		//   79  156:invokespecial   #94  <Method void StringBuilder()>
		//   80  159:astore_1        
			stringbuilder.append("  mServiceConnection=");
		//   81  160:aload_1         
		//   82  161:ldc2            #289 <String "  mServiceConnection=">
		//   83  164:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   84  167:pop             
			stringbuilder.append(((Object) (g)));
		//   85  168:aload_1         
		//   86  169:aload_0         
		//   87  170:getfield        #138 <Field MediaBrowserCompat$i$a g>
		//   88  173:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//   89  176:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//   90  177:ldc1            #131 <String "MediaBrowserCompat">
		//   91  179:aload_1         
		//   92  180:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   93  183:invokestatic    #190 <Method int Log.d(String, String)>
		//   94  186:pop             
			stringbuilder = new StringBuilder();
		//   95  187:new             #93  <Class StringBuilder>
		//   96  190:dup             
		//   97  191:invokespecial   #94  <Method void StringBuilder()>
		//   98  194:astore_1        
			stringbuilder.append("  mServiceBinderWrapper=");
		//   99  195:aload_1         
		//  100  196:ldc2            #291 <String "  mServiceBinderWrapper=">
		//  101  199:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//  102  202:pop             
			stringbuilder.append(((Object) (h)));
		//  103  203:aload_1         
		//  104  204:aload_0         
		//  105  205:getfield        #146 <Field MediaBrowserCompat$l h>
		//  106  208:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//  107  211:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  108  212:ldc1            #131 <String "MediaBrowserCompat">
		//  109  214:aload_1         
		//  110  215:invokevirtual   #107 <Method String StringBuilder.toString()>
		//  111  218:invokestatic    #190 <Method int Log.d(String, String)>
		//  112  221:pop             
			stringbuilder = new StringBuilder();
		//  113  222:new             #93  <Class StringBuilder>
		//  114  225:dup             
		//  115  226:invokespecial   #94  <Method void StringBuilder()>
		//  116  229:astore_1        
			stringbuilder.append("  mCallbacksMessenger=");
		//  117  230:aload_1         
		//  118  231:ldc2            #293 <String "  mCallbacksMessenger=">
		//  119  234:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//  120  237:pop             
			stringbuilder.append(((Object) (i)));
		//  121  238:aload_1         
		//  122  239:aload_0         
		//  123  240:getfield        #120 <Field Messenger i>
		//  124  243:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//  125  246:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  126  247:ldc1            #131 <String "MediaBrowserCompat">
		//  127  249:aload_1         
		//  128  250:invokevirtual   #107 <Method String StringBuilder.toString()>
		//  129  253:invokestatic    #190 <Method int Log.d(String, String)>
		//  130  256:pop             
			stringbuilder = new StringBuilder();
		//  131  257:new             #93  <Class StringBuilder>
		//  132  260:dup             
		//  133  261:invokespecial   #94  <Method void StringBuilder()>
		//  134  264:astore_1        
			stringbuilder.append("  mRootId=");
		//  135  265:aload_1         
		//  136  266:ldc2            #295 <String "  mRootId=">
		//  137  269:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//  138  272:pop             
			stringbuilder.append(k);
		//  139  273:aload_1         
		//  140  274:aload_0         
		//  141  275:getfield        #151 <Field String k>
		//  142  278:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//  143  281:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  144  282:ldc1            #131 <String "MediaBrowserCompat">
		//  145  284:aload_1         
		//  146  285:invokevirtual   #107 <Method String StringBuilder.toString()>
		//  147  288:invokestatic    #190 <Method int Log.d(String, String)>
		//  148  291:pop             
			stringbuilder = new StringBuilder();
		//  149  292:new             #93  <Class StringBuilder>
		//  150  295:dup             
		//  151  296:invokespecial   #94  <Method void StringBuilder()>
		//  152  299:astore_1        
			stringbuilder.append("  mMediaSessionToken=");
		//  153  300:aload_1         
		//  154  301:ldc2            #297 <String "  mMediaSessionToken=">
		//  155  304:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//  156  307:pop             
			stringbuilder.append(((Object) (l)));
		//  157  308:aload_1         
		//  158  309:aload_0         
		//  159  310:getfield        #153 <Field android.support.v4.media.session.MediaSessionCompat$Token l>
		//  160  313:invokevirtual   #125 <Method StringBuilder StringBuilder.append(Object)>
		//  161  316:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
		//  162  317:ldc1            #131 <String "MediaBrowserCompat">
		//  163  319:aload_1         
		//  164  320:invokevirtual   #107 <Method String StringBuilder.toString()>
		//  165  323:invokestatic    #190 <Method int Log.d(String, String)>
		//  166  326:pop             
		//  167  327:return          
		}

		public void d()
		{
			if(f != 0 && f != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #65  <Field int f>
		//*   2    4:ifeq            63
		//*   3    7:aload_0         
		//*   4    8:getfield        #65  <Field int f>
		//*   5   11:iconst_1        
		//*   6   12:icmpeq          63
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    7   15:new             #93  <Class StringBuilder>
		//    8   18:dup             
		//    9   19:invokespecial   #94  <Method void StringBuilder()>
		//   10   22:astore_1        
				stringbuilder.append("connect() called while neigther disconnecting nor disconnected (state=");
		//   11   23:aload_1         
		//   12   24:ldc2            #299 <String "connect() called while neigther disconnecting nor disconnected (state=">
		//   13   27:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   14   30:pop             
				stringbuilder.append(a(f));
		//   15   31:aload_1         
		//   16   32:aload_0         
		//   17   33:getfield        #65  <Field int f>
		//   18   36:invokestatic    #165 <Method String a(int)>
		//   19   39:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   20   42:pop             
				stringbuilder.append(")");
		//   21   43:aload_1         
		//   22   44:ldc2            #301 <String ")">
		//   23   47:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   24   50:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   25   51:new             #303 <Class IllegalStateException>
		//   26   54:dup             
		//   27   55:aload_1         
		//   28   56:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   29   59:invokespecial   #304 <Method void IllegalStateException(String)>
		//   30   62:athrow          
			} else
			{
				f = 2;
		//   31   63:aload_0         
		//   32   64:iconst_2        
		//   33   65:putfield        #65  <Field int f>
				e.post(new Runnable(this) {

					public void run()
					{
						Exception exception;
						if(a.f == 0)
					//*   0    0:aload_0         
					//*   1    1:getfield        #20  <Field MediaBrowserCompat$i a>
					//*   2    4:getfield        #30  <Field int MediaBrowserCompat$i.f>
					//*   3    7:ifne            11
							return;
					//    4   10:return          
						a.f = 2;
					//    5   11:aload_0         
					//    6   12:getfield        #20  <Field MediaBrowserCompat$i a>
					//    7   15:iconst_2        
					//    8   16:putfield        #30  <Field int MediaBrowserCompat$i.f>
						if(MediaBrowserCompat.a && a.g != null)
					//*   9   19:getstatic       #33  <Field boolean MediaBrowserCompat.a>
					//*  10   22:ifeq            74
					//*  11   25:aload_0         
					//*  12   26:getfield        #20  <Field MediaBrowserCompat$i a>
					//*  13   29:getfield        #37  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
					//*  14   32:ifnull          74
						{
							StringBuilder stringbuilder = new StringBuilder();
					//   15   35:new             #39  <Class StringBuilder>
					//   16   38:dup             
					//   17   39:invokespecial   #40  <Method void StringBuilder()>
					//   18   42:astore_2        
							stringbuilder.append("mServiceConnection should be null. Instead it is ");
					//   19   43:aload_2         
					//   20   44:ldc1            #42  <String "mServiceConnection should be null. Instead it is ">
					//   21   46:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
					//   22   49:pop             
							stringbuilder.append(((Object) (a.g)));
					//   23   50:aload_2         
					//   24   51:aload_0         
					//   25   52:getfield        #20  <Field MediaBrowserCompat$i a>
					//   26   55:getfield        #37  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
					//   27   58:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
					//   28   61:pop             
							throw new RuntimeException(stringbuilder.toString());
					//   29   62:new             #51  <Class RuntimeException>
					//   30   65:dup             
					//   31   66:aload_2         
					//   32   67:invokevirtual   #55  <Method String StringBuilder.toString()>
					//   33   70:invokespecial   #58  <Method void RuntimeException(String)>
					//   34   73:athrow          
						}
						if(a.h != null)
					//*  35   74:aload_0         
					//*  36   75:getfield        #20  <Field MediaBrowserCompat$i a>
					//*  37   78:getfield        #62  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
					//*  38   81:ifnull          123
						{
							StringBuilder stringbuilder1 = new StringBuilder();
					//   39   84:new             #39  <Class StringBuilder>
					//   40   87:dup             
					//   41   88:invokespecial   #40  <Method void StringBuilder()>
					//   42   91:astore_2        
							stringbuilder1.append("mServiceBinderWrapper should be null. Instead it is ");
					//   43   92:aload_2         
					//   44   93:ldc1            #64  <String "mServiceBinderWrapper should be null. Instead it is ">
					//   45   95:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
					//   46   98:pop             
							stringbuilder1.append(((Object) (a.h)));
					//   47   99:aload_2         
					//   48  100:aload_0         
					//   49  101:getfield        #20  <Field MediaBrowserCompat$i a>
					//   50  104:getfield        #62  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
					//   51  107:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
					//   52  110:pop             
							throw new RuntimeException(stringbuilder1.toString());
					//   53  111:new             #51  <Class RuntimeException>
					//   54  114:dup             
					//   55  115:aload_2         
					//   56  116:invokevirtual   #55  <Method String StringBuilder.toString()>
					//   57  119:invokespecial   #58  <Method void RuntimeException(String)>
					//   58  122:athrow          
						}
						if(a.i != null)
					//*  59  123:aload_0         
					//*  60  124:getfield        #20  <Field MediaBrowserCompat$i a>
					//*  61  127:getfield        #67  <Field Messenger MediaBrowserCompat$i.i>
					//*  62  130:ifnull          172
						{
							StringBuilder stringbuilder2 = new StringBuilder();
					//   63  133:new             #39  <Class StringBuilder>
					//   64  136:dup             
					//   65  137:invokespecial   #40  <Method void StringBuilder()>
					//   66  140:astore_2        
							stringbuilder2.append("mCallbacksMessenger should be null. Instead it is ");
					//   67  141:aload_2         
					//   68  142:ldc1            #69  <String "mCallbacksMessenger should be null. Instead it is ">
					//   69  144:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
					//   70  147:pop             
							stringbuilder2.append(((Object) (a.i)));
					//   71  148:aload_2         
					//   72  149:aload_0         
					//   73  150:getfield        #20  <Field MediaBrowserCompat$i a>
					//   74  153:getfield        #67  <Field Messenger MediaBrowserCompat$i.i>
					//   75  156:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
					//   76  159:pop             
							throw new RuntimeException(stringbuilder2.toString());
					//   77  160:new             #51  <Class RuntimeException>
					//   78  163:dup             
					//   79  164:aload_2         
					//   80  165:invokevirtual   #55  <Method String StringBuilder.toString()>
					//   81  168:invokespecial   #58  <Method void RuntimeException(String)>
					//   82  171:athrow          
						}
						Object obj = ((Object) (new Intent("android.media.browse.MediaBrowserService")));
					//   83  172:new             #71  <Class Intent>
					//   84  175:dup             
					//   85  176:ldc1            #73  <String "android.media.browse.MediaBrowserService">
					//   86  178:invokespecial   #74  <Method void Intent(String)>
					//   87  181:astore_2        
						((Intent) (obj)).setComponent(a.b);
					//   88  182:aload_2         
					//   89  183:aload_0         
					//   90  184:getfield        #20  <Field MediaBrowserCompat$i a>
					//   91  187:getfield        #78  <Field ComponentName MediaBrowserCompat$i.b>
					//   92  190:invokevirtual   #82  <Method Intent Intent.setComponent(ComponentName)>
					//   93  193:pop             
						a.g = new i.a(a);
					//   94  194:aload_0         
					//   95  195:getfield        #20  <Field MediaBrowserCompat$i a>
					//   96  198:new             #84  <Class MediaBrowserCompat$i$a>
					//   97  201:dup             
					//   98  202:aload_0         
					//   99  203:getfield        #20  <Field MediaBrowserCompat$i a>
					//  100  206:invokespecial   #86  <Method void MediaBrowserCompat$i$a(MediaBrowserCompat$i)>
					//  101  209:putfield        #37  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
						boolean flag;
						try
						{
							flag = a.a.bindService(((Intent) (obj)), ((ServiceConnection) (a.g)), 1);
					//  102  212:aload_0         
					//  103  213:getfield        #20  <Field MediaBrowserCompat$i a>
					//  104  216:getfield        #89  <Field Context MediaBrowserCompat$i.a>
					//  105  219:aload_2         
					//  106  220:aload_0         
					//  107  221:getfield        #20  <Field MediaBrowserCompat$i a>
					//  108  224:getfield        #37  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
					//  109  227:iconst_1        
					//  110  228:invokevirtual   #95  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
					//  111  231:istore_1        
						}
					//* 112  232:goto            274
					//* 113  235:new             #39  <Class StringBuilder>
					//* 114  238:dup             
					//* 115  239:invokespecial   #40  <Method void StringBuilder()>
					//* 116  242:astore_2        
					//* 117  243:aload_2         
					//* 118  244:ldc1            #97  <String "Failed binding to service ">
					//* 119  246:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
					//* 120  249:pop             
					//* 121  250:aload_2         
					//* 122  251:aload_0         
					//* 123  252:getfield        #20  <Field MediaBrowserCompat$i a>
					//* 124  255:getfield        #78  <Field ComponentName MediaBrowserCompat$i.b>
					//* 125  258:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
					//* 126  261:pop             
					//* 127  262:ldc1            #99  <String "MediaBrowserCompat">
					//* 128  264:aload_2         
					//* 129  265:invokevirtual   #55  <Method String StringBuilder.toString()>
					//* 130  268:invokestatic    #105 <Method int Log.e(String, String)>
					//* 131  271:pop             
					//* 132  272:iconst_0        
					//* 133  273:istore_1        
					//* 134  274:iload_1         
					//* 135  275:ifne            295
					//* 136  278:aload_0         
					//* 137  279:getfield        #20  <Field MediaBrowserCompat$i a>
					//* 138  282:invokevirtual   #107 <Method void MediaBrowserCompat$i.a()>
					//* 139  285:aload_0         
					//* 140  286:getfield        #20  <Field MediaBrowserCompat$i a>
					//* 141  289:getfield        #111 <Field MediaBrowserCompat$b MediaBrowserCompat$i.c>
					//* 142  292:invokevirtual   #115 <Method void MediaBrowserCompat$b.c()>
					//* 143  295:getstatic       #33  <Field boolean MediaBrowserCompat.a>
					//* 144  298:ifeq            316
					//* 145  301:ldc1            #99  <String "MediaBrowserCompat">
					//* 146  303:ldc1            #117 <String "connect...">
					//* 147  305:invokestatic    #119 <Method int Log.d(String, String)>
					//* 148  308:pop             
					//* 149  309:aload_0         
					//* 150  310:getfield        #20  <Field MediaBrowserCompat$i a>
					//* 151  313:invokevirtual   #120 <Method void MediaBrowserCompat$i.c()>
					//* 152  316:return          
						// Misplaced declaration of an exception variable
						catch(Exception exception)
						{
							obj = ((Object) (new StringBuilder()));
							((StringBuilder) (obj)).append("Failed binding to service ");
							((StringBuilder) (obj)).append(((Object) (a.b)));
							Log.e("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
							flag = false;
						}
						if(!flag)
						{
							a.a();
							a.c.c();
						}
						if(MediaBrowserCompat.a)
						{
							Log.d("MediaBrowserCompat", "connect...");
							a.c();
						}
					//* 153  317:astore_2        
					//* 154  318:goto            235
					}

					final i a;

			
			{
				a = i1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaBrowserCompat$i a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//   34   68:aload_0         
		//   35   69:getfield        #58  <Field MediaBrowserCompat$a e>
		//   36   72:new             #13  <Class MediaBrowserCompat$i$1>
		//   37   75:dup             
		//   38   76:aload_0         
		//   39   77:invokespecial   #307 <Method void MediaBrowserCompat$i$1(MediaBrowserCompat$i)>
		//   40   80:invokevirtual   #311 <Method boolean MediaBrowserCompat$a.post(Runnable)>
		//   41   83:pop             
				return;
		//   42   84:return          
			}
		}

		public void e()
		{
			f = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #65  <Field int f>
			e.post(new Runnable(this) {

				public void run()
				{
					RemoteException remoteexception;
					StringBuilder stringbuilder;
					if(a.i != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #20  <Field MediaBrowserCompat$i a>
				//*   2    4:getfield        #29  <Field Messenger MediaBrowserCompat$i.i>
				//*   3    7:ifnull          67
						try
						{
							a.h.a(a.i);
				//    4   10:aload_0         
				//    5   11:getfield        #20  <Field MediaBrowserCompat$i a>
				//    6   14:getfield        #33  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field MediaBrowserCompat$i a>
				//    9   21:getfield        #29  <Field Messenger MediaBrowserCompat$i.i>
				//   10   24:invokevirtual   #38  <Method void MediaBrowserCompat$l.a(Messenger)>
						}
				//*  11   27:goto            67
				//*  12   30:new             #40  <Class StringBuilder>
				//*  13   33:dup             
				//*  14   34:invokespecial   #41  <Method void StringBuilder()>
				//*  15   37:astore_2        
				//*  16   38:aload_2         
				//*  17   39:ldc1            #43  <String "RemoteException during connect for ">
				//*  18   41:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//*  19   44:pop             
				//*  20   45:aload_2         
				//*  21   46:aload_0         
				//*  22   47:getfield        #20  <Field MediaBrowserCompat$i a>
				//*  23   50:getfield        #51  <Field ComponentName MediaBrowserCompat$i.b>
				//*  24   53:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
				//*  25   56:pop             
				//*  26   57:ldc1            #56  <String "MediaBrowserCompat">
				//*  27   59:aload_2         
				//*  28   60:invokevirtual   #60  <Method String StringBuilder.toString()>
				//*  29   63:invokestatic    #66  <Method int Log.w(String, String)>
				//*  30   66:pop             
				//*  31   67:aload_0         
				//*  32   68:getfield        #20  <Field MediaBrowserCompat$i a>
				//*  33   71:getfield        #70  <Field int MediaBrowserCompat$i.f>
				//*  34   74:istore_1        
				//*  35   75:aload_0         
				//*  36   76:getfield        #20  <Field MediaBrowserCompat$i a>
				//*  37   79:invokevirtual   #72  <Method void MediaBrowserCompat$i.a()>
				//*  38   82:iload_1         
				//*  39   83:ifeq            94
				//*  40   86:aload_0         
				//*  41   87:getfield        #20  <Field MediaBrowserCompat$i a>
				//*  42   90:iload_1         
				//*  43   91:putfield        #70  <Field int MediaBrowserCompat$i.f>
				//*  44   94:getstatic       #75  <Field boolean MediaBrowserCompat.a>
				//*  45   97:ifeq            115
				//*  46  100:ldc1            #56  <String "MediaBrowserCompat">
				//*  47  102:ldc1            #77  <String "disconnect...">
				//*  48  104:invokestatic    #80  <Method int Log.d(String, String)>
				//*  49  107:pop             
				//*  50  108:aload_0         
				//*  51  109:getfield        #20  <Field MediaBrowserCompat$i a>
				//*  52  112:invokevirtual   #83  <Method void MediaBrowserCompat$i.c()>
				//*  53  115:return          
						// Misplaced declaration of an exception variable
						catch(RemoteException remoteexception)
						{
							stringbuilder = new StringBuilder();
							stringbuilder.append("RemoteException during connect for ");
							stringbuilder.append(((Object) (a.b)));
							Log.w("MediaBrowserCompat", stringbuilder.toString());
						}
					int i1 = a.f;
					a.a();
					if(i1 != 0)
						a.f = i1;
					if(MediaBrowserCompat.a)
					{
						Log.d("MediaBrowserCompat", "disconnect...");
						a.c();
					}
				//*  54  116:astore_2        
				//*  55  117:goto            30
				}

				final i a;

			
			{
				a = i1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaBrowserCompat$i a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    3    5:aload_0         
		//    4    6:getfield        #58  <Field MediaBrowserCompat$a e>
		//    5    9:new             #15  <Class MediaBrowserCompat$i$2>
		//    6   12:dup             
		//    7   13:aload_0         
		//    8   14:invokespecial   #312 <Method void MediaBrowserCompat$i$2(MediaBrowserCompat$i)>
		//    9   17:invokevirtual   #311 <Method boolean MediaBrowserCompat$a.post(Runnable)>
		//   10   20:pop             
		//   11   21:return          
		}

		public android.support.v4.media.session.MediaSessionCompat.Token f()
		{
			if(!b())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #315 <Method boolean b()>
		//*   2    4:ifne            52
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    3    7:new             #93  <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #94  <Method void StringBuilder()>
		//    6   14:astore_1        
				stringbuilder.append("getSessionToken() called while not connected(state=");
		//    7   15:aload_1         
		//    8   16:ldc2            #317 <String "getSessionToken() called while not connected(state=">
		//    9   19:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   10   22:pop             
				stringbuilder.append(f);
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #65  <Field int f>
		//   14   28:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
		//   15   31:pop             
				stringbuilder.append(")");
		//   16   32:aload_1         
		//   17   33:ldc2            #301 <String ")">
		//   18   36:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
		//   19   39:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   20   40:new             #303 <Class IllegalStateException>
		//   21   43:dup             
		//   22   44:aload_1         
		//   23   45:invokevirtual   #107 <Method String StringBuilder.toString()>
		//   24   48:invokespecial   #304 <Method void IllegalStateException(String)>
		//   25   51:athrow          
			} else
			{
				return l;
		//   26   52:aload_0         
		//   27   53:getfield        #153 <Field android.support.v4.media.session.MediaSessionCompat$Token l>
		//   28   56:areturn         
			}
		}

		final Context a;
		final ComponentName b;
		final b c;
		final Bundle d;
		final a e = new a(((j) (this)));
		int f;
		a g;
		l h;
		Messenger i;
		private final android.support.v4.f.a j = new android.support.v4.f.a();
		private String k;
		private android.support.v4.media.session.MediaSessionCompat.Token l;
		private Bundle m;

		public i(Context context, ComponentName componentname, b b1, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #51  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #53  <Class MediaBrowserCompat$a>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #56  <Method void MediaBrowserCompat$a(MediaBrowserCompat$j)>
		//    7   13:putfield        #58  <Field MediaBrowserCompat$a e>
		//    8   16:aload_0         
		//    9   17:new             #60  <Class android.support.v4.f.a>
		//   10   20:dup             
		//   11   21:invokespecial   #61  <Method void android.support.v4.f.a()>
		//   12   24:putfield        #63  <Field android.support.v4.f.a j>
			f = 1;
		//   13   27:aload_0         
		//   14   28:iconst_1        
		//   15   29:putfield        #65  <Field int f>
			if(context == null)
		//*  16   32:aload_1         
		//*  17   33:ifnonnull       46
				throw new IllegalArgumentException("context must not be null");
		//   18   36:new             #67  <Class IllegalArgumentException>
		//   19   39:dup             
		//   20   40:ldc1            #69  <String "context must not be null">
		//   21   42:invokespecial   #72  <Method void IllegalArgumentException(String)>
		//   22   45:athrow          
			if(componentname == null)
		//*  23   46:aload_2         
		//*  24   47:ifnonnull       60
				throw new IllegalArgumentException("service component must not be null");
		//   25   50:new             #67  <Class IllegalArgumentException>
		//   26   53:dup             
		//   27   54:ldc1            #74  <String "service component must not be null">
		//   28   56:invokespecial   #72  <Method void IllegalArgumentException(String)>
		//   29   59:athrow          
			if(b1 == null)
		//*  30   60:aload_3         
		//*  31   61:ifnonnull       74
				throw new IllegalArgumentException("connection callback must not be null");
		//   32   64:new             #67  <Class IllegalArgumentException>
		//   33   67:dup             
		//   34   68:ldc1            #76  <String "connection callback must not be null">
		//   35   70:invokespecial   #72  <Method void IllegalArgumentException(String)>
		//   36   73:athrow          
			a = context;
		//   37   74:aload_0         
		//   38   75:aload_1         
		//   39   76:putfield        #78  <Field Context a>
			b = componentname;
		//   40   79:aload_0         
		//   41   80:aload_2         
		//   42   81:putfield        #80  <Field ComponentName b>
			c = b1;
		//   43   84:aload_0         
		//   44   85:aload_3         
		//   45   86:putfield        #82  <Field MediaBrowserCompat$b c>
			if(bundle == null)
		//*  46   89:aload           4
		//*  47   91:ifnonnull       99
				context = null;
		//   48   94:aconst_null     
		//   49   95:astore_1        
			else
		//*  50   96:goto            109
				context = ((Context) (new Bundle(bundle)));
		//   51   99:new             #84  <Class Bundle>
		//   52  102:dup             
		//   53  103:aload           4
		//   54  105:invokespecial   #87  <Method void Bundle(Bundle)>
		//   55  108:astore_1        
			d = ((Bundle) (context));
		//   56  109:aload_0         
		//   57  110:aload_1         
		//   58  111:putfield        #89  <Field Bundle d>
		//   59  114:return          
		}
	}

	private class i.a
		implements ServiceConnection
	{

		private void a(Runnable runnable)
		{
			if(Thread.currentThread() == a.e.getLooper().getThread())
		//*   0    0:invokestatic    #32  <Method Thread Thread.currentThread()>
		//*   1    3:aload_0         
		//*   2    4:getfield        #21  <Field MediaBrowserCompat$i a>
		//*   3    7:getfield        #36  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
		//*   4   10:invokevirtual   #42  <Method Looper MediaBrowserCompat$a.getLooper()>
		//*   5   13:invokevirtual   #47  <Method Thread Looper.getThread()>
		//*   6   16:if_acmpne       26
			{
				runnable.run();
		//    7   19:aload_1         
		//    8   20:invokeinterface #52  <Method void Runnable.run()>
				return;
		//    9   25:return          
			} else
			{
				a.e.post(runnable);
		//   10   26:aload_0         
		//   11   27:getfield        #21  <Field MediaBrowserCompat$i a>
		//   12   30:getfield        #36  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
		//   13   33:aload_1         
		//   14   34:invokevirtual   #56  <Method boolean MediaBrowserCompat$a.post(Runnable)>
		//   15   37:pop             
				return;
		//   16   38:return          
			}
		}

		boolean a(String s)
		{
			if(a.g == this && a.f != 0 && a.f != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field MediaBrowserCompat$i a>
		//*   2    4:getfield        #61  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
		//*   3    7:aload_0         
		//*   4    8:if_acmpne       37
		//*   5   11:aload_0         
		//*   6   12:getfield        #21  <Field MediaBrowserCompat$i a>
		//*   7   15:getfield        #65  <Field int MediaBrowserCompat$i.f>
		//*   8   18:ifeq            37
		//*   9   21:aload_0         
		//*  10   22:getfield        #21  <Field MediaBrowserCompat$i a>
		//*  11   25:getfield        #65  <Field int MediaBrowserCompat$i.f>
		//*  12   28:iconst_1        
		//*  13   29:icmpne          35
		//*  14   32:goto            37
				return true;
		//   15   35:iconst_1        
		//   16   36:ireturn         
			if(a.f != 0 && a.f != 1)
		//*  17   37:aload_0         
		//*  18   38:getfield        #21  <Field MediaBrowserCompat$i a>
		//*  19   41:getfield        #65  <Field int MediaBrowserCompat$i.f>
		//*  20   44:ifeq            133
		//*  21   47:aload_0         
		//*  22   48:getfield        #21  <Field MediaBrowserCompat$i a>
		//*  23   51:getfield        #65  <Field int MediaBrowserCompat$i.f>
		//*  24   54:iconst_1        
		//*  25   55:icmpeq          133
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   26   58:new             #67  <Class StringBuilder>
		//   27   61:dup             
		//   28   62:invokespecial   #68  <Method void StringBuilder()>
		//   29   65:astore_2        
				stringbuilder.append(s);
		//   30   66:aload_2         
		//   31   67:aload_1         
		//   32   68:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   33   71:pop             
				stringbuilder.append(" for ");
		//   34   72:aload_2         
		//   35   73:ldc1            #74  <String " for ">
		//   36   75:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   37   78:pop             
				stringbuilder.append(((Object) (a.b)));
		//   38   79:aload_2         
		//   39   80:aload_0         
		//   40   81:getfield        #21  <Field MediaBrowserCompat$i a>
		//   41   84:getfield        #78  <Field ComponentName MediaBrowserCompat$i.b>
		//   42   87:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
		//   43   90:pop             
				stringbuilder.append(" with mServiceConnection=");
		//   44   91:aload_2         
		//   45   92:ldc1            #83  <String " with mServiceConnection=">
		//   46   94:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   47   97:pop             
				stringbuilder.append(((Object) (a.g)));
		//   48   98:aload_2         
		//   49   99:aload_0         
		//   50  100:getfield        #21  <Field MediaBrowserCompat$i a>
		//   51  103:getfield        #61  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
		//   52  106:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
		//   53  109:pop             
				stringbuilder.append(" this=");
		//   54  110:aload_2         
		//   55  111:ldc1            #85  <String " this=">
		//   56  113:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   57  116:pop             
				stringbuilder.append(((Object) (this)));
		//   58  117:aload_2         
		//   59  118:aload_0         
		//   60  119:invokevirtual   #81  <Method StringBuilder StringBuilder.append(Object)>
		//   61  122:pop             
				Log.i("MediaBrowserCompat", stringbuilder.toString());
		//   62  123:ldc1            #87  <String "MediaBrowserCompat">
		//   63  125:aload_2         
		//   64  126:invokevirtual   #91  <Method String StringBuilder.toString()>
		//   65  129:invokestatic    #96  <Method int Log.i(String, String)>
		//   66  132:pop             
			}
			return false;
		//   67  133:iconst_0        
		//   68  134:ireturn         
		}

		public void onServiceConnected(ComponentName componentname, IBinder ibinder)
		{
			a(new Runnable(this, componentname, ibinder) {

				public void run()
				{
					RemoteException remoteexception;
					if(MediaBrowserCompat.a)
				//*   0    0:getstatic       #40  <Field boolean MediaBrowserCompat.a>
				//*   1    3:ifeq            66
					{
						StringBuilder stringbuilder = new StringBuilder();
				//    2    6:new             #42  <Class StringBuilder>
				//    3    9:dup             
				//    4   10:invokespecial   #43  <Method void StringBuilder()>
				//    5   13:astore_1        
						stringbuilder.append("MediaServiceConnection.onServiceConnected name=");
				//    6   14:aload_1         
				//    7   15:ldc1            #45  <String "MediaServiceConnection.onServiceConnected name=">
				//    8   17:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
				//    9   20:pop             
						stringbuilder.append(((Object) (a)));
				//   10   21:aload_1         
				//   11   22:aload_0         
				//   12   23:getfield        #28  <Field ComponentName a>
				//   13   26:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
				//   14   29:pop             
						stringbuilder.append(" binder=");
				//   15   30:aload_1         
				//   16   31:ldc1            #54  <String " binder=">
				//   17   33:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
				//   18   36:pop             
						stringbuilder.append(((Object) (b)));
				//   19   37:aload_1         
				//   20   38:aload_0         
				//   21   39:getfield        #30  <Field IBinder b>
				//   22   42:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
				//   23   45:pop             
						Log.d("MediaBrowserCompat", stringbuilder.toString());
				//   24   46:ldc1            #56  <String "MediaBrowserCompat">
				//   25   48:aload_1         
				//   26   49:invokevirtual   #60  <Method String StringBuilder.toString()>
				//   27   52:invokestatic    #66  <Method int Log.d(String, String)>
				//   28   55:pop             
						c.a.c();
				//   29   56:aload_0         
				//   30   57:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   31   60:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   32   63:invokevirtual   #71  <Method void MediaBrowserCompat$i.c()>
					}
					if(!c.a("onServiceConnected"))
				//*  33   66:aload_0         
				//*  34   67:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//*  35   70:ldc1            #72  <String "onServiceConnected">
				//*  36   72:invokevirtual   #75  <Method boolean MediaBrowserCompat$i$a.a(String)>
				//*  37   75:ifne            79
						return;
				//   38   78:return          
					c.a.h = new l(b, c.a.d);
				//   39   79:aload_0         
				//   40   80:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   41   83:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   42   86:new             #77  <Class MediaBrowserCompat$l>
				//   43   89:dup             
				//   44   90:aload_0         
				//   45   91:getfield        #30  <Field IBinder b>
				//   46   94:aload_0         
				//   47   95:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   48   98:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   49  101:getfield        #80  <Field Bundle MediaBrowserCompat$i.d>
				//   50  104:invokespecial   #83  <Method void MediaBrowserCompat$l(IBinder, Bundle)>
				//   51  107:putfield        #87  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
					c.a.i = new Messenger(((Handler) (c.a.e)));
				//   52  110:aload_0         
				//   53  111:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   54  114:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   55  117:new             #89  <Class Messenger>
				//   56  120:dup             
				//   57  121:aload_0         
				//   58  122:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   59  125:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   60  128:getfield        #93  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
				//   61  131:invokespecial   #96  <Method void Messenger(Handler)>
				//   62  134:putfield        #99  <Field Messenger MediaBrowserCompat$i.i>
					c.a.e.a(c.a.i);
				//   63  137:aload_0         
				//   64  138:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   65  141:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   66  144:getfield        #93  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
				//   67  147:aload_0         
				//   68  148:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   69  151:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   70  154:getfield        #99  <Field Messenger MediaBrowserCompat$i.i>
				//   71  157:invokevirtual   #104 <Method void MediaBrowserCompat$a.a(Messenger)>
					c.a.f = 2;
				//   72  160:aload_0         
				//   73  161:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   74  164:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   75  167:iconst_2        
				//   76  168:putfield        #108 <Field int MediaBrowserCompat$i.f>
					StringBuilder stringbuilder1;
					try
					{
						if(MediaBrowserCompat.a)
				//*  77  171:getstatic       #40  <Field boolean MediaBrowserCompat.a>
				//*  78  174:ifeq            195
						{
							Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
				//   79  177:ldc1            #56  <String "MediaBrowserCompat">
				//   80  179:ldc1            #110 <String "ServiceCallbacks.onConnect...">
				//   81  181:invokestatic    #66  <Method int Log.d(String, String)>
				//   82  184:pop             
							c.a.c();
				//   83  185:aload_0         
				//   84  186:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   85  189:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   86  192:invokevirtual   #71  <Method void MediaBrowserCompat$i.c()>
						}
						c.a.h.a(c.a.a, c.a.i);
				//   87  195:aload_0         
				//   88  196:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   89  199:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   90  202:getfield        #87  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
				//   91  205:aload_0         
				//   92  206:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   93  209:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   94  212:getfield        #113 <Field Context MediaBrowserCompat$i.a>
				//   95  215:aload_0         
				//   96  216:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//   97  219:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   98  222:getfield        #99  <Field Messenger MediaBrowserCompat$i.i>
				//   99  225:invokevirtual   #116 <Method void MediaBrowserCompat$l.a(Context, Messenger)>
						return;
				//  100  228:return          
					}
				//* 101  229:new             #42  <Class StringBuilder>
				//* 102  232:dup             
				//* 103  233:invokespecial   #43  <Method void StringBuilder()>
				//* 104  236:astore_1        
				//* 105  237:aload_1         
				//* 106  238:ldc1            #118 <String "RemoteException during connect for ">
				//* 107  240:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
				//* 108  243:pop             
				//* 109  244:aload_1         
				//* 110  245:aload_0         
				//* 111  246:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//* 112  249:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//* 113  252:getfield        #120 <Field ComponentName MediaBrowserCompat$i.b>
				//* 114  255:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
				//* 115  258:pop             
				//* 116  259:ldc1            #56  <String "MediaBrowserCompat">
				//* 117  261:aload_1         
				//* 118  262:invokevirtual   #60  <Method String StringBuilder.toString()>
				//* 119  265:invokestatic    #123 <Method int Log.w(String, String)>
				//* 120  268:pop             
				//* 121  269:getstatic       #40  <Field boolean MediaBrowserCompat.a>
				//* 122  272:ifeq            293
				//* 123  275:ldc1            #56  <String "MediaBrowserCompat">
				//* 124  277:ldc1            #110 <String "ServiceCallbacks.onConnect...">
				//* 125  279:invokestatic    #66  <Method int Log.d(String, String)>
				//* 126  282:pop             
				//* 127  283:aload_0         
				//* 128  284:getfield        #26  <Field MediaBrowserCompat$i$a c>
				//* 129  287:getfield        #69  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//* 130  290:invokevirtual   #71  <Method void MediaBrowserCompat$i.c()>
				//* 131  293:return          
					// Misplaced declaration of an exception variable
					catch(RemoteException remoteexception)
					{
						stringbuilder1 = new StringBuilder();
					}
					stringbuilder1.append("RemoteException during connect for ");
					stringbuilder1.append(((Object) (c.a.b)));
					Log.w("MediaBrowserCompat", stringbuilder1.toString());
					if(MediaBrowserCompat.a)
					{
						Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
						c.a.c();
					}
				//* 132  294:astore_1        
				//* 133  295:goto            229
				}

				final ComponentName a;
				final IBinder b;
				final i.a c;

			
			{
				c = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserCompat$i$a c>
				a = componentname;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field ComponentName a>
				b = ibinder;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field IBinder b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #33  <Method void Object()>
			//   11   19:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:new             #14  <Class MediaBrowserCompat$i$a$1>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokespecial   #101 <Method void MediaBrowserCompat$i$a$1(MediaBrowserCompat$i$a, ComponentName, IBinder)>
		//    7   11:invokespecial   #103 <Method void a(Runnable)>
		//    8   14:return          
		}

		public void onServiceDisconnected(ComponentName componentname)
		{
			a(new Runnable(this, componentname) {

				public void run()
				{
					if(MediaBrowserCompat.a)
				//*   0    0:getstatic       #34  <Field boolean MediaBrowserCompat.a>
				//*   1    3:ifeq            85
					{
						StringBuilder stringbuilder = new StringBuilder();
				//    2    6:new             #36  <Class StringBuilder>
				//    3    9:dup             
				//    4   10:invokespecial   #37  <Method void StringBuilder()>
				//    5   13:astore_1        
						stringbuilder.append("MediaServiceConnection.onServiceDisconnected name=");
				//    6   14:aload_1         
				//    7   15:ldc1            #39  <String "MediaServiceConnection.onServiceDisconnected name=">
				//    8   17:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
				//    9   20:pop             
						stringbuilder.append(((Object) (a)));
				//   10   21:aload_1         
				//   11   22:aload_0         
				//   12   23:getfield        #26  <Field ComponentName a>
				//   13   26:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
				//   14   29:pop             
						stringbuilder.append(" this=");
				//   15   30:aload_1         
				//   16   31:ldc1            #48  <String " this=">
				//   17   33:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
				//   18   36:pop             
						stringbuilder.append(((Object) (this)));
				//   19   37:aload_1         
				//   20   38:aload_0         
				//   21   39:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
				//   22   42:pop             
						stringbuilder.append(" mServiceConnection=");
				//   23   43:aload_1         
				//   24   44:ldc1            #50  <String " mServiceConnection=">
				//   25   46:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
				//   26   49:pop             
						stringbuilder.append(((Object) (b.a.g)));
				//   27   50:aload_1         
				//   28   51:aload_0         
				//   29   52:getfield        #24  <Field MediaBrowserCompat$i$a b>
				//   30   55:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   31   58:getfield        #56  <Field MediaBrowserCompat$i$a MediaBrowserCompat$i.g>
				//   32   61:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
				//   33   64:pop             
						Log.d("MediaBrowserCompat", stringbuilder.toString());
				//   34   65:ldc1            #58  <String "MediaBrowserCompat">
				//   35   67:aload_1         
				//   36   68:invokevirtual   #62  <Method String StringBuilder.toString()>
				//   37   71:invokestatic    #68  <Method int Log.d(String, String)>
				//   38   74:pop             
						b.a.c();
				//   39   75:aload_0         
				//   40   76:getfield        #24  <Field MediaBrowserCompat$i$a b>
				//   41   79:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   42   82:invokevirtual   #71  <Method void MediaBrowserCompat$i.c()>
					}
					if(!b.a("onServiceDisconnected"))
				//*  43   85:aload_0         
				//*  44   86:getfield        #24  <Field MediaBrowserCompat$i$a b>
				//*  45   89:ldc1            #72  <String "onServiceDisconnected">
				//*  46   91:invokevirtual   #75  <Method boolean MediaBrowserCompat$i$a.a(String)>
				//*  47   94:ifne            98
					{
						return;
				//   48   97:return          
					} else
					{
						b.a.h = null;
				//   49   98:aload_0         
				//   50   99:getfield        #24  <Field MediaBrowserCompat$i$a b>
				//   51  102:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   52  105:aconst_null     
				//   53  106:putfield        #79  <Field MediaBrowserCompat$l MediaBrowserCompat$i.h>
						b.a.i = null;
				//   54  109:aload_0         
				//   55  110:getfield        #24  <Field MediaBrowserCompat$i$a b>
				//   56  113:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   57  116:aconst_null     
				//   58  117:putfield        #82  <Field Messenger MediaBrowserCompat$i.i>
						b.a.e.a(((Messenger) (null)));
				//   59  120:aload_0         
				//   60  121:getfield        #24  <Field MediaBrowserCompat$i$a b>
				//   61  124:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   62  127:getfield        #86  <Field MediaBrowserCompat$a MediaBrowserCompat$i.e>
				//   63  130:aconst_null     
				//   64  131:invokevirtual   #91  <Method void MediaBrowserCompat$a.a(Messenger)>
						b.a.f = 4;
				//   65  134:aload_0         
				//   66  135:getfield        #24  <Field MediaBrowserCompat$i$a b>
				//   67  138:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   68  141:iconst_4        
				//   69  142:putfield        #95  <Field int MediaBrowserCompat$i.f>
						b.a.c.b();
				//   70  145:aload_0         
				//   71  146:getfield        #24  <Field MediaBrowserCompat$i$a b>
				//   72  149:getfield        #53  <Field MediaBrowserCompat$i MediaBrowserCompat$i$a.a>
				//   73  152:getfield        #98  <Field MediaBrowserCompat$b MediaBrowserCompat$i.c>
				//   74  155:invokevirtual   #102 <Method void MediaBrowserCompat$b.b()>
						return;
				//   75  158:return          
					}
				}

				final ComponentName a;
				final i.a b;

			
			{
				b = a1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$i$a b>
				a = componentname;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field ComponentName a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #29  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:new             #16  <Class MediaBrowserCompat$i$a$2>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #108 <Method void MediaBrowserCompat$i$a$2(MediaBrowserCompat$i$a, ComponentName)>
		//    6   10:invokespecial   #103 <Method void a(Runnable)>
		//    7   13:return          
		}

		final i a;

		i.a(i i1)
		{
			a = i1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field MediaBrowserCompat$i a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
		//    5    9:return          
		}
	}

	static interface j
	{

		public abstract void a(Messenger messenger);

		public abstract void a(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle);

		public abstract void a(Messenger messenger, String s, List list, Bundle bundle);
	}

	public static abstract class k
	{

		public void a(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void a(String s, Bundle bundle, List list)
		{
		//    0    0:return          
		}
	}

	private static class l
	{

		private void a(int i1, Bundle bundle, Messenger messenger)
		{
			Message message = Message.obtain();
		//    0    0:invokestatic    #33  <Method Message Message.obtain()>
		//    1    3:astore          4
			message.what = i1;
		//    2    5:aload           4
		//    3    7:iload_1         
		//    4    8:putfield        #37  <Field int Message.what>
			message.arg1 = 1;
		//    5   11:aload           4
		//    6   13:iconst_1        
		//    7   14:putfield        #40  <Field int Message.arg1>
			message.setData(bundle);
		//    8   17:aload           4
		//    9   19:aload_2         
		//   10   20:invokevirtual   #44  <Method void Message.setData(Bundle)>
			message.replyTo = messenger;
		//   11   23:aload           4
		//   12   25:aload_3         
		//   13   26:putfield        #47  <Field Messenger Message.replyTo>
			a.send(message);
		//   14   29:aload_0         
		//   15   30:getfield        #23  <Field Messenger a>
		//   16   33:aload           4
		//   17   35:invokevirtual   #51  <Method void Messenger.send(Message)>
		//   18   38:return          
		}

		void a(Context context, Messenger messenger)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #54  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #55  <Method void Bundle()>
		//    3    7:astore_3        
			bundle.putString("data_package_name", context.getPackageName());
		//    4    8:aload_3         
		//    5    9:ldc1            #57  <String "data_package_name">
		//    6   11:aload_1         
		//    7   12:invokevirtual   #63  <Method String Context.getPackageName()>
		//    8   15:invokevirtual   #67  <Method void Bundle.putString(String, String)>
			bundle.putBundle("data_root_hints", b);
		//    9   18:aload_3         
		//   10   19:ldc1            #69  <String "data_root_hints">
		//   11   21:aload_0         
		//   12   22:getfield        #25  <Field Bundle b>
		//   13   25:invokevirtual   #73  <Method void Bundle.putBundle(String, Bundle)>
			a(1, bundle, messenger);
		//   14   28:aload_0         
		//   15   29:iconst_1        
		//   16   30:aload_3         
		//   17   31:aload_2         
		//   18   32:invokespecial   #75  <Method void a(int, Bundle, Messenger)>
		//   19   35:return          
		}

		void a(Messenger messenger)
		{
			a(2, ((Bundle) (null)), messenger);
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aconst_null     
		//    3    3:aload_1         
		//    4    4:invokespecial   #75  <Method void a(int, Bundle, Messenger)>
		//    5    7:return          
		}

		void a(String s, IBinder ibinder, Bundle bundle, Messenger messenger)
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #54  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #55  <Method void Bundle()>
		//    3    7:astore          5
			bundle1.putString("data_media_item_id", s);
		//    4    9:aload           5
		//    5   11:ldc1            #79  <String "data_media_item_id">
		//    6   13:aload_1         
		//    7   14:invokevirtual   #67  <Method void Bundle.putString(String, String)>
			BundleCompat.putBinder(bundle1, "data_callback_token", ibinder);
		//    8   17:aload           5
		//    9   19:ldc1            #81  <String "data_callback_token">
		//   10   21:aload_2         
		//   11   22:invokestatic    #87  <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
			bundle1.putBundle("data_options", bundle);
		//   12   25:aload           5
		//   13   27:ldc1            #89  <String "data_options">
		//   14   29:aload_3         
		//   15   30:invokevirtual   #73  <Method void Bundle.putBundle(String, Bundle)>
			a(3, bundle1, messenger);
		//   16   33:aload_0         
		//   17   34:iconst_3        
		//   18   35:aload           5
		//   19   37:aload           4
		//   20   39:invokespecial   #75  <Method void a(int, Bundle, Messenger)>
		//   21   42:return          
		}

		void b(Messenger messenger)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #54  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #55  <Method void Bundle()>
		//    3    7:astore_2        
			bundle.putBundle("data_root_hints", b);
		//    4    8:aload_2         
		//    5    9:ldc1            #69  <String "data_root_hints">
		//    6   11:aload_0         
		//    7   12:getfield        #25  <Field Bundle b>
		//    8   15:invokevirtual   #73  <Method void Bundle.putBundle(String, Bundle)>
			a(6, bundle, messenger);
		//    9   18:aload_0         
		//   10   19:bipush          6
		//   11   21:aload_2         
		//   12   22:aload_1         
		//   13   23:invokespecial   #75  <Method void a(int, Bundle, Messenger)>
		//   14   26:return          
		}

		void c(Messenger messenger)
		{
			a(7, ((Bundle) (null)), messenger);
		//    0    0:aload_0         
		//    1    1:bipush          7
		//    2    3:aconst_null     
		//    3    4:aload_1         
		//    4    5:invokespecial   #75  <Method void a(int, Bundle, Messenger)>
		//    5    8:return          
		}

		private Messenger a;
		private Bundle b;

		public l(IBinder ibinder, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			a = new Messenger(ibinder);
		//    2    4:aload_0         
		//    3    5:new             #18  <Class Messenger>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #21  <Method void Messenger(IBinder)>
		//    7   13:putfield        #23  <Field Messenger a>
			b = bundle;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #25  <Field Bundle b>
		//   11   21:return          
		}
	}

	private static class m
	{

		public n a(Context context, Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          12
				bundle.setClassLoader(context.getClassLoader());
		//    2    4:aload_2         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #31  <Method ClassLoader Context.getClassLoader()>
		//    5    9:invokevirtual   #37  <Method void Bundle.setClassLoader(ClassLoader)>
			for(int i1 = 0; i1 < b.size(); i1++)
		//*   6   12:iconst_0        
		//*   7   13:istore_3        
		//*   8   14:iload_3         
		//*   9   15:aload_0         
		//*  10   16:getfield        #23  <Field List b>
		//*  11   19:invokeinterface #43  <Method int List.size()>
		//*  12   24:icmpge          68
				if(android.support.v4.media.c.a((Bundle)b.get(i1), bundle))
		//*  13   27:aload_0         
		//*  14   28:getfield        #23  <Field List b>
		//*  15   31:iload_3         
		//*  16   32:invokeinterface #47  <Method Object List.get(int)>
		//*  17   37:checkcast       #33  <Class Bundle>
		//*  18   40:aload_2         
		//*  19   41:invokestatic    #52  <Method boolean c.a(Bundle, Bundle)>
		//*  20   44:ifeq            61
					return (n)a.get(i1);
		//   21   47:aload_0         
		//   22   48:getfield        #21  <Field List a>
		//   23   51:iload_3         
		//   24   52:invokeinterface #47  <Method Object List.get(int)>
		//   25   57:checkcast       #54  <Class MediaBrowserCompat$n>
		//   26   60:areturn         

		//   27   61:iload_3         
		//   28   62:iconst_1        
		//   29   63:iadd            
		//   30   64:istore_3        
		//*  31   65:goto            14
			return null;
		//   32   68:aconst_null     
		//   33   69:areturn         
		}

		public List a()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field List b>
		//    2    4:areturn         
		}

		public List b()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field List a>
		//    2    4:areturn         
		}

		private final List a = new ArrayList();
		private final List b = new ArrayList();

		public m()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #18  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void ArrayList()>
		//    6   12:putfield        #21  <Field List a>
		//    7   15:aload_0         
		//    8   16:new             #18  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #19  <Method void ArrayList()>
		//   11   23:putfield        #23  <Field List b>
		//   12   26:return          
		}
	}

	public static abstract class n
	{

		static IBinder a(n n1)
		{
			return n1.c;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field IBinder c>
		//    2    4:areturn         
		}

		public void a(String s)
		{
		//    0    0:return          
		}

		public void a(String s, Bundle bundle)
		{
		//    0    0:return          
		}

		public void a(String s, List list)
		{
		//    0    0:return          
		}

		public void a(String s, List list, Bundle bundle)
		{
		//    0    0:return          
		}

		WeakReference a;
		private final Object b;
		private final IBinder c;

		public n()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			if(android.os.Build.VERSION.SDK_INT >= 26)
		//*   2    4:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
		//*   3    7:bipush          26
		//*   4    9:icmplt          33
			{
				b = android.support.v4.media.b.a(((b.a) (new b(this))));
		//    5   12:aload_0         
		//    6   13:new             #12  <Class MediaBrowserCompat$n$b>
		//    7   16:dup             
		//    8   17:aload_0         
		//    9   18:invokespecial   #31  <Method void MediaBrowserCompat$n$b(MediaBrowserCompat$n)>
		//   10   21:invokestatic    #36  <Method Object b.a(b$a)>
		//   11   24:putfield        #38  <Field Object b>
				c = null;
		//   12   27:aload_0         
		//   13   28:aconst_null     
		//   14   29:putfield        #40  <Field IBinder c>
				return;
		//   15   32:return          
			}
			Binder binder;
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  16   33:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
		//*  17   36:bipush          21
		//*  18   38:icmplt          70
			{
				b = android.support.v4.media.a.a(((a.d) (new a(this))));
		//   19   41:aload_0         
		//   20   42:new             #9   <Class MediaBrowserCompat$n$a>
		//   21   45:dup             
		//   22   46:aload_0         
		//   23   47:invokespecial   #41  <Method void MediaBrowserCompat$n$a(MediaBrowserCompat$n)>
		//   24   50:invokestatic    #46  <Method Object a.a(a$d)>
		//   25   53:putfield        #38  <Field Object b>
				binder = new Binder();
		//   26   56:new             #48  <Class Binder>
		//   27   59:dup             
		//   28   60:invokespecial   #49  <Method void Binder()>
		//   29   63:astore_1        
			} else
		//*  30   64:aload_0         
		//*  31   65:aload_1         
		//*  32   66:putfield        #40  <Field IBinder c>
		//*  33   69:return          
			{
				b = null;
		//   34   70:aload_0         
		//   35   71:aconst_null     
		//   36   72:putfield        #38  <Field Object b>
				binder = new Binder();
		//   37   75:new             #48  <Class Binder>
		//   38   78:dup             
		//   39   79:invokespecial   #49  <Method void Binder()>
		//   40   82:astore_1        
			}
			c = ((IBinder) (binder));
		//*  41   83:goto            64
		}
	}

	private class n.a
		implements a.d
	{

		List a(List list, Bundle bundle)
		{
			if(list == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			int i1 = bundle.getInt("android.media.browse.extra.PAGE", -1);
		//    4    6:aload_2         
		//    5    7:ldc1            #24  <String "android.media.browse.extra.PAGE">
		//    6    9:iconst_m1       
		//    7   10:invokevirtual   #30  <Method int Bundle.getInt(String, int)>
		//    8   13:istore_3        
			int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
		//    9   14:aload_2         
		//   10   15:ldc1            #32  <String "android.media.browse.extra.PAGE_SIZE">
		//   11   17:iconst_m1       
		//   12   18:invokevirtual   #30  <Method int Bundle.getInt(String, int)>
		//   13   21:istore          6
			if(i1 == -1 && i2 == -1)
		//*  14   23:iload_3         
		//*  15   24:iconst_m1       
		//*  16   25:icmpne          36
		//*  17   28:iload           6
		//*  18   30:iconst_m1       
		//*  19   31:icmpne          36
				return list;
		//   20   34:aload_1         
		//   21   35:areturn         
			int l1 = i2 * i1;
		//   22   36:iload           6
		//   23   38:iload_3         
		//   24   39:imul            
		//   25   40:istore          5
			int k1 = l1 + i2;
		//   26   42:iload           5
		//   27   44:iload           6
		//   28   46:iadd            
		//   29   47:istore          4
			if(i1 >= 0 && i2 >= 1 && l1 < list.size())
		//*  30   49:iload_3         
		//*  31   50:iflt            104
		//*  32   53:iload           6
		//*  33   55:iconst_1        
		//*  34   56:icmplt          104
		//*  35   59:iload           5
		//*  36   61:aload_1         
		//*  37   62:invokeinterface #38  <Method int List.size()>
		//*  38   67:icmplt          73
		//*  39   70:goto            104
			{
				int j1 = k1;
		//   40   73:iload           4
		//   41   75:istore_3        
				if(k1 > list.size())
		//*  42   76:iload           4
		//*  43   78:aload_1         
		//*  44   79:invokeinterface #38  <Method int List.size()>
		//*  45   84:icmple          94
					j1 = list.size();
		//   46   87:aload_1         
		//   47   88:invokeinterface #38  <Method int List.size()>
		//   48   93:istore_3        
				return list.subList(l1, j1);
		//   49   94:aload_1         
		//   50   95:iload           5
		//   51   97:iload_3         
		//   52   98:invokeinterface #42  <Method List List.subList(int, int)>
		//   53  103:areturn         
			} else
			{
				return Collections.EMPTY_LIST;
		//   54  104:getstatic       #48  <Field List Collections.EMPTY_LIST>
		//   55  107:areturn         
			}
		}

		public void a(String s)
		{
			a.a(s);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field MediaBrowserCompat$n a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #53  <Method void MediaBrowserCompat$n.a(String)>
		//    4    8:return          
		}

		public void a(String s, List list)
		{
			Object obj;
			if(a.a == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field MediaBrowserCompat$n a>
		//*   2    4:getfield        #57  <Field WeakReference MediaBrowserCompat$n.a>
		//*   3    7:ifnonnull       16
				obj = null;
		//    4   10:aconst_null     
		//    5   11:astore          4
			else
		//*   6   13:goto            31
				obj = ((Object) ((m)a.a.get()));
		//    7   16:aload_0         
		//    8   17:getfield        #17  <Field MediaBrowserCompat$n a>
		//    9   20:getfield        #57  <Field WeakReference MediaBrowserCompat$n.a>
		//   10   23:invokevirtual   #63  <Method Object WeakReference.get()>
		//   11   26:checkcast       #65  <Class MediaBrowserCompat$m>
		//   12   29:astore          4
			if(obj == null)
		//*  13   31:aload           4
		//*  14   33:ifnonnull       49
			{
				a.a(s, MediaItem.a(list));
		//   15   36:aload_0         
		//   16   37:getfield        #17  <Field MediaBrowserCompat$n a>
		//   17   40:aload_1         
		//   18   41:aload_2         
		//   19   42:invokestatic    #70  <Method List MediaBrowserCompat$MediaItem.a(List)>
		//   20   45:invokevirtual   #72  <Method void MediaBrowserCompat$n.a(String, List)>
				return;
		//   21   48:return          
			}
			list = MediaItem.a(list);
		//   22   49:aload_2         
		//   23   50:invokestatic    #70  <Method List MediaBrowserCompat$MediaItem.a(List)>
		//   24   53:astore_2        
			List list1 = ((m) (obj)).b();
		//   25   54:aload           4
		//   26   56:invokevirtual   #76  <Method List MediaBrowserCompat$m.b()>
		//   27   59:astore          5
			obj = ((Object) (((m) (obj)).a()));
		//   28   61:aload           4
		//   29   63:invokevirtual   #78  <Method List MediaBrowserCompat$m.a()>
		//   30   66:astore          4
			for(int i1 = 0; i1 < list1.size(); i1++)
		//*  31   68:iconst_0        
		//*  32   69:istore_3        
		//*  33   70:iload_3         
		//*  34   71:aload           5
		//*  35   73:invokeinterface #38  <Method int List.size()>
		//*  36   78:icmpge          135
			{
				Bundle bundle = (Bundle)((List) (obj)).get(i1);
		//   37   81:aload           4
		//   38   83:iload_3         
		//   39   84:invokeinterface #81  <Method Object List.get(int)>
		//   40   89:checkcast       #26  <Class Bundle>
		//   41   92:astore          6
				if(bundle == null)
		//*  42   94:aload           6
		//*  43   96:ifnonnull       111
					a.a(s, list);
		//   44   99:aload_0         
		//   45  100:getfield        #17  <Field MediaBrowserCompat$n a>
		//   46  103:aload_1         
		//   47  104:aload_2         
		//   48  105:invokevirtual   #72  <Method void MediaBrowserCompat$n.a(String, List)>
				else
		//*  49  108:goto            128
					a.a(s, a(list, bundle), bundle);
		//   50  111:aload_0         
		//   51  112:getfield        #17  <Field MediaBrowserCompat$n a>
		//   52  115:aload_1         
		//   53  116:aload_0         
		//   54  117:aload_2         
		//   55  118:aload           6
		//   56  120:invokevirtual   #83  <Method List a(List, Bundle)>
		//   57  123:aload           6
		//   58  125:invokevirtual   #86  <Method void MediaBrowserCompat$n.a(String, List, Bundle)>
			}

		//   59  128:iload_3         
		//   60  129:iconst_1        
		//   61  130:iadd            
		//   62  131:istore_3        
		//*  63  132:goto            70
		//   64  135:return          
		}

		final n a;

		n.a(n n1)
		{
			a = n1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MediaBrowserCompat$n a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}

	private class n.b extends n.a
		implements b.a
	{

		public void a(String s, Bundle bundle)
		{
			b.a(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field MediaBrowserCompat$n b>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #24  <Method void MediaBrowserCompat$n.a(String, Bundle)>
		//    5    9:return          
		}

		public void a(String s, List list, Bundle bundle)
		{
			b.a(s, MediaItem.a(list), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field MediaBrowserCompat$n b>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #30  <Method List MediaBrowserCompat$MediaItem.a(List)>
		//    5    9:aload_3         
		//    6   10:invokevirtual   #32  <Method void MediaBrowserCompat$n.a(String, List, Bundle)>
		//    7   13:return          
		}

		final n b;

		n.b(n n1)
		{
			b = n1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MediaBrowserCompat$n b>
			super(n1);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #19  <Method void MediaBrowserCompat$n$a(MediaBrowserCompat$n)>
		//    6   10:return          
		}
	}


	public MediaBrowserCompat(Context context, ComponentName componentname, b b1, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    4:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmplt          31
			context = ((Context) (new h(context, componentname, b1, bundle)));
	//    5   12:new             #45  <Class MediaBrowserCompat$h>
	//    6   15:dup             
	//    7   16:aload_1         
	//    8   17:aload_2         
	//    9   18:aload_3         
	//   10   19:aload           4
	//   11   21:invokespecial   #105 <Method void MediaBrowserCompat$h(Context, ComponentName, MediaBrowserCompat$b, Bundle)>
	//   12   24:astore_1        
		else
	//*  13   25:aload_0         
	//*  14   26:aload_1         
	//*  15   27:putfield        #107 <Field MediaBrowserCompat$e b>
	//*  16   30:return          
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  17   31:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   34:bipush          23
	//*  19   36:icmplt          55
			context = ((Context) (new g(context, componentname, b1, bundle)));
	//   20   39:new             #42  <Class MediaBrowserCompat$g>
	//   21   42:dup             
	//   22   43:aload_1         
	//   23   44:aload_2         
	//   24   45:aload_3         
	//   25   46:aload           4
	//   26   48:invokespecial   #108 <Method void MediaBrowserCompat$g(Context, ComponentName, MediaBrowserCompat$b, Bundle)>
	//   27   51:astore_1        
		else
	//*  28   52:goto            25
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  29   55:getstatic       #103 <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   58:bipush          21
	//*  31   60:icmplt          79
			context = ((Context) (new f(context, componentname, b1, bundle)));
	//   32   63:new             #39  <Class MediaBrowserCompat$f>
	//   33   66:dup             
	//   34   67:aload_1         
	//   35   68:aload_2         
	//   36   69:aload_3         
	//   37   70:aload           4
	//   38   72:invokespecial   #109 <Method void MediaBrowserCompat$f(Context, ComponentName, MediaBrowserCompat$b, Bundle)>
	//   39   75:astore_1        
		else
	//*  40   76:goto            25
			context = ((Context) (new i(context, componentname, b1, bundle)));
	//   41   79:new             #48  <Class MediaBrowserCompat$i>
	//   42   82:dup             
	//   43   83:aload_1         
	//   44   84:aload_2         
	//   45   85:aload_3         
	//   46   86:aload           4
	//   47   88:invokespecial   #110 <Method void MediaBrowserCompat$i(Context, ComponentName, MediaBrowserCompat$b, Bundle)>
	//   48   91:astore_1        
		b = ((e) (context));
	//*  49   92:goto            25
	}

	public void a()
	{
		b.d();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field MediaBrowserCompat$e b>
	//    2    4:invokeinterface #112 <Method void MediaBrowserCompat$e.d()>
	//    3    9:return          
	}

	public void b()
	{
		b.e();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field MediaBrowserCompat$e b>
	//    2    4:invokeinterface #114 <Method void MediaBrowserCompat$e.e()>
	//    3    9:return          
	}

	public android.support.v4.media.session.MediaSessionCompat.Token c()
	{
		return b.f();
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field MediaBrowserCompat$e b>
	//    2    4:invokeinterface #117 <Method android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserCompat$e.f()>
	//    3    9:areturn         
	}

	static final boolean a = Log.isLoggable("MediaBrowserCompat", 3);
	private final e b;

	static 
	{
	//    0    0:ldc1            #84  <String "MediaBrowserCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #90  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #92  <Field boolean a>
	//*   4    9:return          
	}
}
