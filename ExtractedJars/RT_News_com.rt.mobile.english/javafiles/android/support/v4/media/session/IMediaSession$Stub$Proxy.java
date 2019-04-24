// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.*;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			IMediaSession, PlaybackStateCompat, ParcelableVolumeInfo, IMediaControllerCallback

private static class IMediaSession$Stub$Proxy
	implements IMediaSession
{

	public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(mediadescriptioncompat == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mediadescriptioncompat.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(41, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #19  <Field IBinder mRemote>
	//   22   41:bipush          41
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   56:aload_3         
	//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   34   64:return          
		mediadescriptioncompat;
	//   35   65:astore_1        
		parcel1.recycle();
	//   36   66:aload_3         
	//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   70:aload_2         
	//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
		throw mediadescriptioncompat;
	//   40   74:aload_1         
	//   41   75:athrow          
	}

	public void addQueueItemAt(MediaDescriptionCompat mediadescriptioncompat, int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(mediadescriptioncompat == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mediadescriptioncompat.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		parcel.writeInt(i);
	//   20   38:aload_3         
	//   21   39:iload_2         
	//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(42, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #19  <Field IBinder mRemote>
	//   25   47:bipush          42
	//   26   49:aload_3         
	//   27   50:aload           4
	//   28   52:iconst_0        
	//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   58:pop             
		parcel1.readException();
	//   31   59:aload           4
	//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   64:aload           4
	//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   37   73:return          
		mediadescriptioncompat;
	//   38   74:astore_1        
		parcel1.recycle();
	//   39   75:aload           4
	//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   80:aload_3         
	//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
		throw mediadescriptioncompat;
	//   43   84:aload_1         
	//   44   85:athrow          
	}

	public void adjustVolume(int i, int j, String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           4
	//    8   19:iload_1         
	//    9   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   10   23:aload           4
	//   11   25:iload_2         
	//   12   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   13   29:aload           4
	//   14   31:aload_3         
	//   15   32:invokevirtual   #66  <Method void Parcel.writeString(String)>
		mRemote.transact(11, parcel, parcel1, 0);
	//   16   35:aload_0         
	//   17   36:getfield        #19  <Field IBinder mRemote>
	//   18   39:bipush          11
	//   19   41:aload           4
	//   20   43:aload           5
	//   21   45:iconst_0        
	//   22   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   51:pop             
		parcel1.readException();
	//   24   52:aload           5
	//   25   54:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   57:aload           5
	//   27   59:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   62:aload           4
	//   29   64:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   30   67:return          
		s;
	//   31   68:astore_3        
		parcel1.recycle();
	//   32   69:aload           5
	//   33   71:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   74:aload           4
	//   35   76:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   36   79:aload_3         
	//   37   80:athrow          
	}

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public void fastForward()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(22, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          22
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public Bundle getExtras()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		Bundle bundle;
label0:
		{
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(31, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          31
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
			parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   33:aload_3         
	//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//*  19   37:ifeq            56
			{
				bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #81  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #77  <Class Bundle>
	//   24   52:astore_1        
				break label0;
	//   25   53:goto            58
			}
			bundle = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
		}
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
		return bundle;
	//   32   66:aload_1         
	//   33   67:areturn         
		Exception exception;
		exception;
	//   34   68:astore_1        
		parcel1.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   73:aload_2         
	//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   39   77:aload_1         
	//   40   78:athrow          
	}

	public long getFlags()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		long l;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(9, parcel, parcel1, 0);
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:bipush          9
	//   10   21:aload_3         
	//   11   22:aload           4
	//   12   24:iconst_0        
	//   13   25:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   30:pop             
		parcel1.readException();
	//   15   31:aload           4
	//   16   33:invokevirtual   #55  <Method void Parcel.readException()>
		l = parcel1.readLong();
	//   17   36:aload           4
	//   18   38:invokevirtual   #92  <Method long Parcel.readLong()>
	//   19   41:lstore_1        
		parcel1.recycle();
	//   20   42:aload           4
	//   21   44:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   47:aload_3         
	//   23   48:invokevirtual   #58  <Method void Parcel.recycle()>
		return l;
	//   24   51:lload_1         
	//   25   52:lreturn         
		Exception exception;
		exception;
	//   26   53:astore          5
		parcel1.recycle();
	//   27   55:aload           4
	//   28   57:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   60:aload_3         
	//   30   61:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   31   64:aload           5
	//   32   66:athrow          
	}

	public String getInterfaceDescriptor()
	{
		return "android.support.v4.media.session.IMediaSession";
	//    0    0:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    1    2:areturn         
	}

	public PendingIntent getLaunchPendingIntent()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		PendingIntent pendingintent;
label0:
		{
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(8, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          8
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
			parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   33:aload_3         
	//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//*  19   37:ifeq            56
			{
				pendingintent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #99  <Field android.os.Parcelable$Creator PendingIntent.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #98  <Class PendingIntent>
	//   24   52:astore_1        
				break label0;
	//   25   53:goto            58
			}
			pendingintent = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
		}
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
		return pendingintent;
	//   32   66:aload_1         
	//   33   67:areturn         
		Exception exception;
		exception;
	//   34   68:astore_1        
		parcel1.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   73:aload_2         
	//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   39   77:aload_1         
	//   40   78:athrow          
	}

	public MediaMetadataCompat getMetadata()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		MediaMetadataCompat mediametadatacompat;
label0:
		{
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(27, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          27
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
			parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   33:aload_3         
	//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//*  19   37:ifeq            56
			{
				mediametadatacompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #104 <Field android.os.Parcelable$Creator MediaMetadataCompat.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #103 <Class MediaMetadataCompat>
	//   24   52:astore_1        
				break label0;
	//   25   53:goto            58
			}
			mediametadatacompat = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
		}
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
		return mediametadatacompat;
	//   32   66:aload_1         
	//   33   67:areturn         
		Exception exception;
		exception;
	//   34   68:astore_1        
		parcel1.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   73:aload_2         
	//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   39   77:aload_1         
	//   40   78:athrow          
	}

	public String getPackageName()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		String s;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(6, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          6
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		s = parcel1.readString();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #108 <Method String Parcel.readString()>
	//   19   37:astore_3        
		parcel1.recycle();
	//   20   38:aload_2         
	//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
		return s;
	//   24   46:aload_3         
	//   25   47:areturn         
		Exception exception;
		exception;
	//   26   48:astore_3        
		parcel1.recycle();
	//   27   49:aload_2         
	//   28   50:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   53:aload_1         
	//   30   54:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   31   57:aload_3         
	//   32   58:athrow          
	}

	public PlaybackStateCompat getPlaybackState()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		PlaybackStateCompat playbackstatecompat;
label0:
		{
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(28, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          28
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
			parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   33:aload_3         
	//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//*  19   37:ifeq            56
			{
				playbackstatecompat = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #113 <Field android.os.Parcelable$Creator PlaybackStateCompat.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #112 <Class PlaybackStateCompat>
	//   24   52:astore_1        
				break label0;
	//   25   53:goto            58
			}
			playbackstatecompat = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
		}
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
		return playbackstatecompat;
	//   32   66:aload_1         
	//   33   67:areturn         
		Exception exception;
		exception;
	//   34   68:astore_1        
		parcel1.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   73:aload_2         
	//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   39   77:aload_1         
	//   40   78:athrow          
	}

	public List getQueue()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		java.util.ArrayList arraylist;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(29, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          29
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		arraylist = parcel1.createTypedArrayList(tem.CREATOR);
	//   17   33:aload_2         
	//   18   34:getstatic       #118 <Field android.os.Parcelable$Creator MediaSessionCompat$QueueItem.CREATOR>
	//   19   37:invokevirtual   #122 <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   20   40:astore_3        
		parcel1.recycle();
	//   21   41:aload_2         
	//   22   42:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   23   45:aload_1         
	//   24   46:invokevirtual   #58  <Method void Parcel.recycle()>
		return ((List) (arraylist));
	//   25   49:aload_3         
	//   26   50:areturn         
		Exception exception;
		exception;
	//   27   51:astore_3        
		parcel1.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   56:aload_1         
	//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   32   60:aload_3         
	//   33   61:athrow          
	}

	public CharSequence getQueueTitle()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		CharSequence charsequence;
label0:
		{
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(30, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          30
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
			parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   33:aload_3         
	//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//*  19   37:ifeq            56
			{
				charsequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #131 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #133 <Class CharSequence>
	//   24   52:astore_1        
				break label0;
	//   25   53:goto            58
			}
			charsequence = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
		}
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
		return charsequence;
	//   32   66:aload_1         
	//   33   67:areturn         
		Exception exception;
		exception;
	//   34   68:astore_1        
		parcel1.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   73:aload_2         
	//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   39   77:aload_1         
	//   40   78:athrow          
	}

	public int getRatingType()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(32, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          32
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public int getRepeatMode()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(37, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          37
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public int getShuffleMode()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		int i;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(47, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          47
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//   19   37:istore_1        
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
		return i;
	//   24   46:iload_1         
	//   25   47:ireturn         
		Exception exception;
		exception;
	//   26   48:astore          4
		parcel1.recycle();
	//   27   50:aload_3         
	//   28   51:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   54:aload_2         
	//   30   55:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   31   58:aload           4
	//   32   60:athrow          
	}

	public String getTag()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		String s;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(7, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          7
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		s = parcel1.readString();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #108 <Method String Parcel.readString()>
	//   19   37:astore_3        
		parcel1.recycle();
	//   20   38:aload_2         
	//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_1         
	//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
		return s;
	//   24   46:aload_3         
	//   25   47:areturn         
		Exception exception;
		exception;
	//   26   48:astore_3        
		parcel1.recycle();
	//   27   49:aload_2         
	//   28   50:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   29   53:aload_1         
	//   30   54:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   31   57:aload_3         
	//   32   58:athrow          
	}

	public ParcelableVolumeInfo getVolumeAttributes()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		ParcelableVolumeInfo parcelablevolumeinfo;
label0:
		{
			parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			mRemote.transact(10, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          10
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
			parcel1.readException();
	//   15   29:aload_3         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
			if(parcel1.readInt() != 0)
	//*  17   33:aload_3         
	//*  18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//*  19   37:ifeq            56
			{
				parcelablevolumeinfo = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #142 <Field android.os.Parcelable$Creator ParcelableVolumeInfo.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #141 <Class ParcelableVolumeInfo>
	//   24   52:astore_1        
				break label0;
	//   25   53:goto            58
			}
			parcelablevolumeinfo = null;
	//   26   56:aconst_null     
	//   27   57:astore_1        
		}
		parcel1.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   62:aload_2         
	//   31   63:invokevirtual   #58  <Method void Parcel.recycle()>
		return parcelablevolumeinfo;
	//   32   66:aload_1         
	//   33   67:areturn         
		Exception exception;
		exception;
	//   34   68:astore_1        
		parcel1.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   73:aload_2         
	//   38   74:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   39   77:aload_1         
	//   40   78:athrow          
	}

	public boolean isCaptioningEnabled()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		IBinder ibinder;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		ibinder = mRemote;
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:astore          5
		boolean flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_2        
		int i;
		ibinder.transact(45, parcel, parcel1, 0);
	//   12   23:aload           5
	//   13   25:bipush          45
	//   14   27:aload_3         
	//   15   28:aload           4
	//   16   30:iconst_0        
	//   17   31:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   18   36:pop             
		parcel1.readException();
	//   19   37:aload           4
	//   20   39:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   21   42:aload           4
	//   22   44:invokevirtual   #75  <Method int Parcel.readInt()>
	//   23   47:istore_1        
		if(i != 0)
	//*  24   48:iload_1         
	//*  25   49:ifeq            54
			flag = true;
	//   26   52:iconst_1        
	//   27   53:istore_2        
		parcel1.recycle();
	//   28   54:aload           4
	//   29   56:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   59:aload_3         
	//   31   60:invokevirtual   #58  <Method void Parcel.recycle()>
		return flag;
	//   32   63:iload_2         
	//   33   64:ireturn         
		Exception exception;
		exception;
	//   34   65:astore          5
		parcel1.recycle();
	//   35   67:aload           4
	//   36   69:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   72:aload_3         
	//   38   73:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   39   76:aload           5
	//   40   78:athrow          
	}

	public boolean isShuffleModeEnabledRemoved()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		IBinder ibinder;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		ibinder = mRemote;
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:astore          5
		boolean flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_2        
		int i;
		ibinder.transact(38, parcel, parcel1, 0);
	//   12   23:aload           5
	//   13   25:bipush          38
	//   14   27:aload_3         
	//   15   28:aload           4
	//   16   30:iconst_0        
	//   17   31:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   18   36:pop             
		parcel1.readException();
	//   19   37:aload           4
	//   20   39:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   21   42:aload           4
	//   22   44:invokevirtual   #75  <Method int Parcel.readInt()>
	//   23   47:istore_1        
		if(i != 0)
	//*  24   48:iload_1         
	//*  25   49:ifeq            54
			flag = true;
	//   26   52:iconst_1        
	//   27   53:istore_2        
		parcel1.recycle();
	//   28   54:aload           4
	//   29   56:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   59:aload_3         
	//   31   60:invokevirtual   #58  <Method void Parcel.recycle()>
		return flag;
	//   32   63:iload_2         
	//   33   64:ireturn         
		Exception exception;
		exception;
	//   34   65:astore          5
		parcel1.recycle();
	//   35   67:aload           4
	//   36   69:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   72:aload_3         
	//   38   73:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   39   76:aload           5
	//   40   78:athrow          
	}

	public boolean isTransportControlEnabled()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		IBinder ibinder;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		ibinder = mRemote;
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field IBinder mRemote>
	//    9   19:astore          5
		boolean flag = false;
	//   10   21:iconst_0        
	//   11   22:istore_2        
		int i;
		ibinder.transact(5, parcel, parcel1, 0);
	//   12   23:aload           5
	//   13   25:iconst_5        
	//   14   26:aload_3         
	//   15   27:aload           4
	//   16   29:iconst_0        
	//   17   30:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   18   35:pop             
		parcel1.readException();
	//   19   36:aload           4
	//   20   38:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   21   41:aload           4
	//   22   43:invokevirtual   #75  <Method int Parcel.readInt()>
	//   23   46:istore_1        
		if(i != 0)
	//*  24   47:iload_1         
	//*  25   48:ifeq            53
			flag = true;
	//   26   51:iconst_1        
	//   27   52:istore_2        
		parcel1.recycle();
	//   28   53:aload           4
	//   29   55:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   30   58:aload_3         
	//   31   59:invokevirtual   #58  <Method void Parcel.recycle()>
		return flag;
	//   32   62:iload_2         
	//   33   63:ireturn         
		Exception exception;
		exception;
	//   34   64:astore          5
		parcel1.recycle();
	//   35   66:aload           4
	//   36   68:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   71:aload_3         
	//   38   72:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   39   75:aload           5
	//   40   77:athrow          
	}

	public void next()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(20, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          20
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public void pause()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(18, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          18
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public void play()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(13, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          13
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public void playFromMediaId(String s, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #66  <Method void Parcel.writeString(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_38;
	//   10   20:aload_2         
	//   11   21:ifnull          38
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   19   35:goto            43
		parcel.writeInt(0);
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(14, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #19  <Field IBinder mRemote>
	//   25   47:bipush          14
	//   26   49:aload_3         
	//   27   50:aload           4
	//   28   52:iconst_0        
	//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   58:pop             
		parcel1.readException();
	//   31   59:aload           4
	//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   64:aload           4
	//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   37   73:return          
		s;
	//   38   74:astore_1        
		parcel1.recycle();
	//   39   75:aload           4
	//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   80:aload_3         
	//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   43   84:aload_1         
	//   44   85:athrow          
	}

	public void playFromSearch(String s, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #66  <Method void Parcel.writeString(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_38;
	//   10   20:aload_2         
	//   11   21:ifnull          38
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   19   35:goto            43
		parcel.writeInt(0);
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(15, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #19  <Field IBinder mRemote>
	//   25   47:bipush          15
	//   26   49:aload_3         
	//   27   50:aload           4
	//   28   52:iconst_0        
	//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   58:pop             
		parcel1.readException();
	//   31   59:aload           4
	//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   64:aload           4
	//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   37   73:return          
		s;
	//   38   74:astore_1        
		parcel1.recycle();
	//   39   75:aload           4
	//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   80:aload_3         
	//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   43   84:aload_1         
	//   44   85:athrow          
	}

	public void playFromUri(Uri uri, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(uri == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		uri.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #158 <Method void Uri.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_56;
	//   20   38:aload_2         
	//   21   39:ifnull          56
		parcel.writeInt(1);
	//   22   42:aload_3         
	//   23   43:iconst_1        
	//   24   44:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:iconst_0        
	//   28   50:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_61;
	//   29   53:goto            61
		parcel.writeInt(0);
	//   30   56:aload_3         
	//   31   57:iconst_0        
	//   32   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(16, parcel, parcel1, 0);
	//   33   61:aload_0         
	//   34   62:getfield        #19  <Field IBinder mRemote>
	//   35   65:bipush          16
	//   36   67:aload_3         
	//   37   68:aload           4
	//   38   70:iconst_0        
	//   39   71:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   40   76:pop             
		parcel1.readException();
	//   41   77:aload           4
	//   42   79:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   43   82:aload           4
	//   44   84:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   87:aload_3         
	//   46   88:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   47   91:return          
		uri;
	//   48   92:astore_1        
		parcel1.recycle();
	//   49   93:aload           4
	//   50   95:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   51   98:aload_3         
	//   52   99:invokevirtual   #58  <Method void Parcel.recycle()>
		throw uri;
	//   53  102:aload_1         
	//   54  103:athrow          
	}

	public void prepare()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(33, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          33
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public void prepareFromMediaId(String s, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #66  <Method void Parcel.writeString(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_38;
	//   10   20:aload_2         
	//   11   21:ifnull          38
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   19   35:goto            43
		parcel.writeInt(0);
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(34, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #19  <Field IBinder mRemote>
	//   25   47:bipush          34
	//   26   49:aload_3         
	//   27   50:aload           4
	//   28   52:iconst_0        
	//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   58:pop             
		parcel1.readException();
	//   31   59:aload           4
	//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   64:aload           4
	//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   37   73:return          
		s;
	//   38   74:astore_1        
		parcel1.recycle();
	//   39   75:aload           4
	//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   80:aload_3         
	//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   43   84:aload_1         
	//   44   85:athrow          
	}

	public void prepareFromSearch(String s, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #66  <Method void Parcel.writeString(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_38;
	//   10   20:aload_2         
	//   11   21:ifnull          38
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   19   35:goto            43
		parcel.writeInt(0);
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(35, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #19  <Field IBinder mRemote>
	//   25   47:bipush          35
	//   26   49:aload_3         
	//   27   50:aload           4
	//   28   52:iconst_0        
	//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   58:pop             
		parcel1.readException();
	//   31   59:aload           4
	//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   64:aload           4
	//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   37   73:return          
		s;
	//   38   74:astore_1        
		parcel1.recycle();
	//   39   75:aload           4
	//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   80:aload_3         
	//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   43   84:aload_1         
	//   44   85:athrow          
	}

	public void prepareFromUri(Uri uri, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(uri == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		uri.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #158 <Method void Uri.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_56;
	//   20   38:aload_2         
	//   21   39:ifnull          56
		parcel.writeInt(1);
	//   22   42:aload_3         
	//   23   43:iconst_1        
	//   24   44:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:iconst_0        
	//   28   50:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_61;
	//   29   53:goto            61
		parcel.writeInt(0);
	//   30   56:aload_3         
	//   31   57:iconst_0        
	//   32   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(36, parcel, parcel1, 0);
	//   33   61:aload_0         
	//   34   62:getfield        #19  <Field IBinder mRemote>
	//   35   65:bipush          36
	//   36   67:aload_3         
	//   37   68:aload           4
	//   38   70:iconst_0        
	//   39   71:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   40   76:pop             
		parcel1.readException();
	//   41   77:aload           4
	//   42   79:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   43   82:aload           4
	//   44   84:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   87:aload_3         
	//   46   88:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   47   91:return          
		uri;
	//   48   92:astore_1        
		parcel1.recycle();
	//   49   93:aload           4
	//   50   95:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   51   98:aload_3         
	//   52   99:invokevirtual   #58  <Method void Parcel.recycle()>
		throw uri;
	//   53  102:aload_1         
	//   54  103:athrow          
	}

	public void previous()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(21, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          21
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public void rate(RatingCompat ratingcompat)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(ratingcompat == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		ratingcompat.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #168 <Method void RatingCompat.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(25, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #19  <Field IBinder mRemote>
	//   22   41:bipush          25
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   56:aload_3         
	//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   34   64:return          
		ratingcompat;
	//   35   65:astore_1        
		parcel1.recycle();
	//   36   66:aload_3         
	//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   70:aload_2         
	//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
		throw ratingcompat;
	//   40   74:aload_1         
	//   41   75:athrow          
	}

	public void rateWithExtras(RatingCompat ratingcompat, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(ratingcompat == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		ratingcompat.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #168 <Method void RatingCompat.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_56;
	//   20   38:aload_2         
	//   21   39:ifnull          56
		parcel.writeInt(1);
	//   22   42:aload_3         
	//   23   43:iconst_1        
	//   24   44:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   25   47:aload_2         
	//   26   48:aload_3         
	//   27   49:iconst_0        
	//   28   50:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_61;
	//   29   53:goto            61
		parcel.writeInt(0);
	//   30   56:aload_3         
	//   31   57:iconst_0        
	//   32   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(51, parcel, parcel1, 0);
	//   33   61:aload_0         
	//   34   62:getfield        #19  <Field IBinder mRemote>
	//   35   65:bipush          51
	//   36   67:aload_3         
	//   37   68:aload           4
	//   38   70:iconst_0        
	//   39   71:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   40   76:pop             
		parcel1.readException();
	//   41   77:aload           4
	//   42   79:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   43   82:aload           4
	//   44   84:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   45   87:aload_3         
	//   46   88:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   47   91:return          
		ratingcompat;
	//   48   92:astore_1        
		parcel1.recycle();
	//   49   93:aload           4
	//   50   95:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   51   98:aload_3         
	//   52   99:invokevirtual   #58  <Method void Parcel.recycle()>
		throw ratingcompat;
	//   53  102:aload_1         
	//   54  103:athrow          
	}

	public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(imediacontrollercallback == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          71
_L1:
		imediacontrollercallback = ((IMediaControllerCallback) (imediacontrollercallback.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #176 <Method IBinder IMediaControllerCallback.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (imediacontrollercallback)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #179 <Method void Parcel.writeStrongBinder(IBinder)>
		mRemote.transact(3, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #19  <Field IBinder mRemote>
	//   18   37:iconst_3        
	//   19   38:aload_2         
	//   20   39:aload_3         
	//   21   40:iconst_0        
	//   22   41:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   46:pop             
		parcel1.readException();
	//   24   47:aload_3         
	//   25   48:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   55:aload_2         
	//   29   56:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   30   59:return          
		imediacontrollercallback;
	//   31   60:astore_1        
		parcel1.recycle();
	//   32   61:aload_3         
	//   33   62:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   65:aload_2         
	//   35   66:invokevirtual   #58  <Method void Parcel.recycle()>
		throw imediacontrollercallback;
	//   36   69:aload_1         
	//   37   70:athrow          
_L2:
		imediacontrollercallback = null;
	//   38   71:aconst_null     
	//   39   72:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   73:goto            28
_L3:
	}

	public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(mediadescriptioncompat == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   14:aload_1         
	//    8   15:ifnull          32
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mediadescriptioncompat.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_37;
	//   16   29:goto            37
		parcel.writeInt(0);
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(43, parcel, parcel1, 0);
	//   20   37:aload_0         
	//   21   38:getfield        #19  <Field IBinder mRemote>
	//   22   41:bipush          43
	//   23   43:aload_2         
	//   24   44:aload_3         
	//   25   45:iconst_0        
	//   26   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   51:pop             
		parcel1.readException();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   30   56:aload_3         
	//   31   57:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   32   60:aload_2         
	//   33   61:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   34   64:return          
		mediadescriptioncompat;
	//   35   65:astore_1        
		parcel1.recycle();
	//   36   66:aload_3         
	//   37   67:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   38   70:aload_2         
	//   39   71:invokevirtual   #58  <Method void Parcel.recycle()>
		throw mediadescriptioncompat;
	//   40   74:aload_1         
	//   41   75:athrow          
	}

	public void removeQueueItemAt(int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   14:aload_2         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(44, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:bipush          44
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public void rewind()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(23, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          23
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public void seekTo(long l)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeLong(l);
	//    7   15:aload_3         
	//    8   16:lload_1         
	//    9   17:invokevirtual   #187 <Method void Parcel.writeLong(long)>
		mRemote.transact(24, parcel, parcel1, 0);
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field IBinder mRemote>
	//   12   24:bipush          24
	//   13   26:aload_3         
	//   14   27:aload           4
	//   15   29:iconst_0        
	//   16   30:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   35:pop             
		parcel1.readException();
	//   18   36:aload           4
	//   19   38:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   41:aload           4
	//   21   43:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   46:aload_3         
	//   23   47:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   24   50:return          
		Exception exception;
		exception;
	//   25   51:astore          5
		parcel1.recycle();
	//   26   53:aload           4
	//   27   55:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   30   62:aload           5
	//   31   64:athrow          
	}

	public void sendCommand(String s, Bundle bundle, ReceiverWrapper receiverwrapper)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   17:aload           4
	//    8   19:aload_1         
	//    9   20:invokevirtual   #66  <Method void Parcel.writeString(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_43;
	//   10   23:aload_2         
	//   11   24:ifnull          43
		parcel.writeInt(1);
	//   12   27:aload           4
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   33:aload_2         
	//   16   34:aload           4
	//   17   36:iconst_0        
	//   18   37:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_49;
	//   19   40:goto            49
		parcel.writeInt(0);
	//   20   43:aload           4
	//   21   45:iconst_0        
	//   22   46:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		if(receiverwrapper == null)
			break MISSING_BLOCK_LABEL_69;
	//   23   49:aload_3         
	//   24   50:ifnull          69
		parcel.writeInt(1);
	//   25   53:aload           4
	//   26   55:iconst_1        
	//   27   56:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		receiverwrapper.writeToParcel(parcel, 0);
	//   28   59:aload_3         
	//   29   60:aload           4
	//   30   62:iconst_0        
	//   31   63:invokevirtual   #192 <Method void MediaSessionCompat$ResultReceiverWrapper.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_75;
	//   32   66:goto            75
		parcel.writeInt(0);
	//   33   69:aload           4
	//   34   71:iconst_0        
	//   35   72:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(1, parcel, parcel1, 0);
	//   36   75:aload_0         
	//   37   76:getfield        #19  <Field IBinder mRemote>
	//   38   79:iconst_1        
	//   39   80:aload           4
	//   40   82:aload           5
	//   41   84:iconst_0        
	//   42   85:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   43   90:pop             
		parcel1.readException();
	//   44   91:aload           5
	//   45   93:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   46   96:aload           5
	//   47   98:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   48  101:aload           4
	//   49  103:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   50  106:return          
		s;
	//   51  107:astore_1        
		parcel1.recycle();
	//   52  108:aload           5
	//   53  110:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   54  113:aload           4
	//   55  115:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   56  118:aload_1         
	//   57  119:athrow          
	}

	public void sendCustomAction(String s, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    7   15:aload_3         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #66  <Method void Parcel.writeString(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_38;
	//   10   20:aload_2         
	//   11   21:ifnull          38
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_43;
	//   19   35:goto            43
		parcel.writeInt(0);
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(26, parcel, parcel1, 0);
	//   23   43:aload_0         
	//   24   44:getfield        #19  <Field IBinder mRemote>
	//   25   47:bipush          26
	//   26   49:aload_3         
	//   27   50:aload           4
	//   28   52:iconst_0        
	//   29   53:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   30   58:pop             
		parcel1.readException();
	//   31   59:aload           4
	//   32   61:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   33   64:aload           4
	//   34   66:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   69:aload_3         
	//   36   70:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   37   73:return          
		s;
	//   38   74:astore_1        
		parcel1.recycle();
	//   39   75:aload           4
	//   40   77:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   80:aload_3         
	//   42   81:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   43   84:aload_1         
	//   44   85:athrow          
	}

	public boolean sendMediaButton(KeyEvent keyevent)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		boolean flag;
		flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_3        
		if(keyevent == null)
			break MISSING_BLOCK_LABEL_39;
	//    9   19:aload_1         
	//   10   20:ifnull          39
		parcel.writeInt(1);
	//   11   23:aload           4
	//   12   25:iconst_1        
	//   13   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		keyevent.writeToParcel(parcel, 0);
	//   14   29:aload_1         
	//   15   30:aload           4
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #198 <Method void KeyEvent.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_45;
	//   18   36:goto            45
		parcel.writeInt(0);
	//   19   39:aload           4
	//   20   41:iconst_0        
	//   21   42:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		int i;
		mRemote.transact(2, parcel, parcel1, 0);
	//   22   45:aload_0         
	//   23   46:getfield        #19  <Field IBinder mRemote>
	//   24   49:iconst_2        
	//   25   50:aload           4
	//   26   52:aload           5
	//   27   54:iconst_0        
	//   28   55:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   29   60:pop             
		parcel1.readException();
	//   30   61:aload           5
	//   31   63:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   32   66:aload           5
	//   33   68:invokevirtual   #75  <Method int Parcel.readInt()>
	//   34   71:istore_2        
		if(i == 0)
	//*  35   72:iload_2         
	//*  36   73:ifeq            79
	//*  37   76:goto            81
			flag = false;
	//   38   79:iconst_0        
	//   39   80:istore_3        
		parcel1.recycle();
	//   40   81:aload           5
	//   41   83:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   42   86:aload           4
	//   43   88:invokevirtual   #58  <Method void Parcel.recycle()>
		return flag;
	//   44   91:iload_3         
	//   45   92:ireturn         
		keyevent;
	//   46   93:astore_1        
		parcel1.recycle();
	//   47   94:aload           5
	//   48   96:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   49   99:aload           4
	//   50  101:invokevirtual   #58  <Method void Parcel.recycle()>
		throw keyevent;
	//   51  104:aload_1         
	//   52  105:athrow          
	}

	public void setCaptioningEnabled(boolean flag)
		throws RemoteException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #202 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #204 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #208 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void setRepeatMode(int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   14:aload_2         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(39, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:bipush          39
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public void setShuffleMode(int i)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   14:aload_2         
	//    8   15:iload_1         
	//    9   16:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(48, parcel, parcel1, 0);
	//   10   19:aload_0         
	//   11   20:getfield        #19  <Field IBinder mRemote>
	//   12   23:bipush          48
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:iconst_0        
	//   16   28:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   33:pop             
		parcel1.readException();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   38:aload_3         
	//   21   39:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   42:aload_2         
	//   23   43:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   24   46:return          
		Exception exception;
		exception;
	//   25   47:astore          4
		parcel1.recycle();
	//   26   49:aload_3         
	//   27   50:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   30   57:aload           4
	//   31   59:athrow          
	}

	public void setShuffleModeEnabledRemoved(boolean flag)
		throws RemoteException
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #202 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #204 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #208 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void setVolumeTo(int i, int j, String s)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore          4
		parcel1 = Parcel.obtain();
	//    2    5:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    8:astore          5
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4   10:aload           4
	//    5   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    7   17:aload           4
	//    8   19:iload_1         
	//    9   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//   10   23:aload           4
	//   11   25:iload_2         
	//   12   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		parcel.writeString(s);
	//   13   29:aload           4
	//   14   31:aload_3         
	//   15   32:invokevirtual   #66  <Method void Parcel.writeString(String)>
		mRemote.transact(12, parcel, parcel1, 0);
	//   16   35:aload_0         
	//   17   36:getfield        #19  <Field IBinder mRemote>
	//   18   39:bipush          12
	//   19   41:aload           4
	//   20   43:aload           5
	//   21   45:iconst_0        
	//   22   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   51:pop             
		parcel1.readException();
	//   24   52:aload           5
	//   25   54:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   57:aload           5
	//   27   59:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   62:aload           4
	//   29   64:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   30   67:return          
		s;
	//   31   68:astore_3        
		parcel1.recycle();
	//   32   69:aload           5
	//   33   71:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   74:aload           4
	//   35   76:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   36   79:aload_3         
	//   37   80:athrow          
	}

	public void skipToQueueItem(long l)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    9:aload_3         
	//    5   10:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   12:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeLong(l);
	//    7   15:aload_3         
	//    8   16:lload_1         
	//    9   17:invokevirtual   #187 <Method void Parcel.writeLong(long)>
		mRemote.transact(17, parcel, parcel1, 0);
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field IBinder mRemote>
	//   12   24:bipush          17
	//   13   26:aload_3         
	//   14   27:aload           4
	//   15   29:iconst_0        
	//   16   30:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   17   35:pop             
		parcel1.readException();
	//   18   36:aload           4
	//   19   38:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   20   41:aload           4
	//   21   43:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   22   46:aload_3         
	//   23   47:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   24   50:return          
		Exception exception;
		exception;
	//   25   51:astore          5
		parcel1.recycle();
	//   26   53:aload           4
	//   27   55:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   58:aload_3         
	//   29   59:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   30   62:aload           5
	//   31   64:athrow          
	}

	public void stop()
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_1         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(19, parcel, parcel1, 0);
	//    7   14:aload_0         
	//    8   15:getfield        #19  <Field IBinder mRemote>
	//    9   18:bipush          19
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:iconst_0        
	//   13   23:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   14   28:pop             
		parcel1.readException();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   21   41:return          
		Exception exception;
		exception;
	//   22   42:astore_3        
		parcel1.recycle();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   25   47:aload_1         
	//   26   48:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   27   51:aload_3         
	//   28   52:athrow          
	}

	public void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    7:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    4    8:aload_2         
	//    5    9:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(imediacontrollercallback == null) goto _L2; else goto _L1
	//    7   14:aload_1         
	//    8   15:ifnull          71
_L1:
		imediacontrollercallback = ((IMediaControllerCallback) (imediacontrollercallback.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #176 <Method IBinder IMediaControllerCallback.asBinder()>
	//   11   24:astore_1        
	//*  12   25:goto            28
_L4:
		parcel.writeStrongBinder(((IBinder) (imediacontrollercallback)));
	//   13   28:aload_2         
	//   14   29:aload_1         
	//   15   30:invokevirtual   #179 <Method void Parcel.writeStrongBinder(IBinder)>
		mRemote.transact(4, parcel, parcel1, 0);
	//   16   33:aload_0         
	//   17   34:getfield        #19  <Field IBinder mRemote>
	//   18   37:iconst_4        
	//   19   38:aload_2         
	//   20   39:aload_3         
	//   21   40:iconst_0        
	//   22   41:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   46:pop             
		parcel1.readException();
	//   24   47:aload_3         
	//   25   48:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   55:aload_2         
	//   29   56:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   30   59:return          
		imediacontrollercallback;
	//   31   60:astore_1        
		parcel1.recycle();
	//   32   61:aload_3         
	//   33   62:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   65:aload_2         
	//   35   66:invokevirtual   #58  <Method void Parcel.recycle()>
		throw imediacontrollercallback;
	//   36   69:aload_1         
	//   37   70:athrow          
_L2:
		imediacontrollercallback = null;
	//   38   71:aconst_null     
	//   39   72:astore_1        
		if(true) goto _L4; else goto _L3
	//   40   73:goto            28
_L3:
	}

	private IBinder mRemote;

	IMediaSession$Stub$Proxy(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mRemote = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field IBinder mRemote>
	//    5    9:return          
	}
}
