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
			break MISSING_BLOCK_LABEL_57;
	//    7   14:aload_1         
	//    8   15:ifnull          57
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mediadescriptioncompat.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(41, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #19  <Field IBinder mRemote>
	//   18   33:bipush          41
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   43:pop             
		parcel1.readException();
	//   24   44:aload_3         
	//   25   45:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   30   56:return          
		parcel.writeInt(0);
	//   31   57:aload_2         
	//   32   58:iconst_0        
	//   33   59:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   62:goto            29
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
			break MISSING_BLOCK_LABEL_66;
	//    7   15:aload_1         
	//    8   16:ifnull          66
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mediadescriptioncompat.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
_L1:
		parcel.writeInt(i);
	//   16   30:aload_3         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(42, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IBinder mRemote>
	//   21   39:bipush          42
	//   22   41:aload_3         
	//   23   42:aload           4
	//   24   44:iconst_0        
	//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   50:pop             
		parcel1.readException();
	//   27   51:aload           4
	//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   33   65:return          
		parcel.writeInt(0);
	//   34   66:aload_3         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   71:goto            30
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
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   17   33:aload_3         
	//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//   19   37:ifeq            63
_L1:
		Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #81  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #77  <Class Bundle>
	//   24   52:astore_1        
_L4:
		parcel1.recycle();
	//   25   53:aload_3         
	//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   27   57:aload_2         
	//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
		return bundle;
	//   29   61:aload_1         
	//   30   62:areturn         
_L2:
		bundle = null;
	//   31   63:aconst_null     
	//   32   64:astore_1        
		if(true) goto _L4; else goto _L3
	//   33   65:goto            53
_L3:
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
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   17   33:aload_3         
	//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//   19   37:ifeq            63
_L1:
		PendingIntent pendingintent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #99  <Field android.os.Parcelable$Creator PendingIntent.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #98  <Class PendingIntent>
	//   24   52:astore_1        
_L4:
		parcel1.recycle();
	//   25   53:aload_3         
	//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   27   57:aload_2         
	//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
		return pendingintent;
	//   29   61:aload_1         
	//   30   62:areturn         
_L2:
		pendingintent = null;
	//   31   63:aconst_null     
	//   32   64:astore_1        
		if(true) goto _L4; else goto _L3
	//   33   65:goto            53
_L3:
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
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   17   33:aload_3         
	//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//   19   37:ifeq            63
_L1:
		MediaMetadataCompat mediametadatacompat = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #104 <Field android.os.Parcelable$Creator MediaMetadataCompat.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #103 <Class MediaMetadataCompat>
	//   24   52:astore_1        
_L4:
		parcel1.recycle();
	//   25   53:aload_3         
	//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   27   57:aload_2         
	//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
		return mediametadatacompat;
	//   29   61:aload_1         
	//   30   62:areturn         
_L2:
		mediametadatacompat = null;
	//   31   63:aconst_null     
	//   32   64:astore_1        
		if(true) goto _L4; else goto _L3
	//   33   65:goto            53
_L3:
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
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   17   33:aload_3         
	//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//   19   37:ifeq            63
_L1:
		PlaybackStateCompat playbackstatecompat = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #113 <Field android.os.Parcelable$Creator PlaybackStateCompat.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #112 <Class PlaybackStateCompat>
	//   24   52:astore_1        
_L4:
		parcel1.recycle();
	//   25   53:aload_3         
	//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   27   57:aload_2         
	//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
		return playbackstatecompat;
	//   29   61:aload_1         
	//   30   62:areturn         
_L2:
		playbackstatecompat = null;
	//   31   63:aconst_null     
	//   32   64:astore_1        
		if(true) goto _L4; else goto _L3
	//   33   65:goto            53
_L3:
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
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   17   33:aload_3         
	//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//   19   37:ifeq            63
_L1:
		CharSequence charsequence = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #131 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #133 <Class CharSequence>
	//   24   52:astore_1        
_L4:
		parcel1.recycle();
	//   25   53:aload_3         
	//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   27   57:aload_2         
	//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
		return charsequence;
	//   29   61:aload_1         
	//   30   62:areturn         
_L2:
		charsequence = null;
	//   31   63:aconst_null     
	//   32   64:astore_1        
		if(true) goto _L4; else goto _L3
	//   33   65:goto            53
_L3:
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
		if(parcel1.readInt() == 0) goto _L2; else goto _L1
	//   17   33:aload_3         
	//   18   34:invokevirtual   #75  <Method int Parcel.readInt()>
	//   19   37:ifeq            63
_L1:
		ParcelableVolumeInfo parcelablevolumeinfo = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel1);
	//   20   40:getstatic       #142 <Field android.os.Parcelable$Creator ParcelableVolumeInfo.CREATOR>
	//   21   43:aload_3         
	//   22   44:invokeinterface #87  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   49:checkcast       #141 <Class ParcelableVolumeInfo>
	//   24   52:astore_1        
_L4:
		parcel1.recycle();
	//   25   53:aload_3         
	//   26   54:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   27   57:aload_2         
	//   28   58:invokevirtual   #58  <Method void Parcel.recycle()>
		return parcelablevolumeinfo;
	//   29   61:aload_1         
	//   30   62:areturn         
_L2:
		parcelablevolumeinfo = null;
	//   31   63:aconst_null     
	//   32   64:astore_1        
		if(true) goto _L4; else goto _L3
	//   33   65:goto            53
_L3:
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
		boolean flag;
		Parcel parcel;
		Parcel parcel1;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    5:astore_3        
		parcel1 = Parcel.obtain();
	//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    5    9:astore          4
		int i;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    6   11:aload_3         
	//    7   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(45, parcel, parcel1, 0);
	//    9   17:aload_0         
	//   10   18:getfield        #19  <Field IBinder mRemote>
	//   11   21:bipush          45
	//   12   23:aload_3         
	//   13   24:aload           4
	//   14   26:iconst_0        
	//   15   27:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   16   32:pop             
		parcel1.readException();
	//   17   33:aload           4
	//   18   35:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   19   38:aload           4
	//   20   40:invokevirtual   #75  <Method int Parcel.readInt()>
	//   21   43:istore_1        
		if(i != 0)
	//*  22   44:iload_1         
	//*  23   45:ifeq            50
			flag = true;
	//   24   48:iconst_1        
	//   25   49:istore_2        
		parcel1.recycle();
	//   26   50:aload           4
	//   27   52:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   55:aload_3         
	//   29   56:invokevirtual   #58  <Method void Parcel.recycle()>
		return flag;
	//   30   59:iload_2         
	//   31   60:ireturn         
		Exception exception;
		exception;
	//   32   61:astore          5
		parcel1.recycle();
	//   33   63:aload           4
	//   34   65:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   68:aload_3         
	//   36   69:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   37   72:aload           5
	//   38   74:athrow          
	}

	public boolean isShuffleModeEnabledDeprecated()
		throws RemoteException
	{
		boolean flag;
		Parcel parcel;
		Parcel parcel1;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    5:astore_3        
		parcel1 = Parcel.obtain();
	//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    5    9:astore          4
		int i;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    6   11:aload_3         
	//    7   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(38, parcel, parcel1, 0);
	//    9   17:aload_0         
	//   10   18:getfield        #19  <Field IBinder mRemote>
	//   11   21:bipush          38
	//   12   23:aload_3         
	//   13   24:aload           4
	//   14   26:iconst_0        
	//   15   27:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   16   32:pop             
		parcel1.readException();
	//   17   33:aload           4
	//   18   35:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   19   38:aload           4
	//   20   40:invokevirtual   #75  <Method int Parcel.readInt()>
	//   21   43:istore_1        
		if(i != 0)
	//*  22   44:iload_1         
	//*  23   45:ifeq            50
			flag = true;
	//   24   48:iconst_1        
	//   25   49:istore_2        
		parcel1.recycle();
	//   26   50:aload           4
	//   27   52:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   55:aload_3         
	//   29   56:invokevirtual   #58  <Method void Parcel.recycle()>
		return flag;
	//   30   59:iload_2         
	//   31   60:ireturn         
		Exception exception;
		exception;
	//   32   61:astore          5
		parcel1.recycle();
	//   33   63:aload           4
	//   34   65:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   68:aload_3         
	//   36   69:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   37   72:aload           5
	//   38   74:athrow          
	}

	public boolean isTransportControlEnabled()
		throws RemoteException
	{
		boolean flag;
		Parcel parcel;
		Parcel parcel1;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    5:astore_3        
		parcel1 = Parcel.obtain();
	//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    5    9:astore          4
		int i;
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    6   11:aload_3         
	//    7   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(5, parcel, parcel1, 0);
	//    9   17:aload_0         
	//   10   18:getfield        #19  <Field IBinder mRemote>
	//   11   21:iconst_5        
	//   12   22:aload_3         
	//   13   23:aload           4
	//   14   25:iconst_0        
	//   15   26:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   16   31:pop             
		parcel1.readException();
	//   17   32:aload           4
	//   18   34:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   19   37:aload           4
	//   20   39:invokevirtual   #75  <Method int Parcel.readInt()>
	//   21   42:istore_1        
		if(i != 0)
	//*  22   43:iload_1         
	//*  23   44:ifeq            49
			flag = true;
	//   24   47:iconst_1        
	//   25   48:istore_2        
		parcel1.recycle();
	//   26   49:aload           4
	//   27   51:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   54:aload_3         
	//   29   55:invokevirtual   #58  <Method void Parcel.recycle()>
		return flag;
	//   30   58:iload_2         
	//   31   59:ireturn         
		Exception exception;
		exception;
	//   32   60:astore          5
		parcel1.recycle();
	//   33   62:aload           4
	//   34   64:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   35   67:aload_3         
	//   36   68:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   37   71:aload           5
	//   38   73:athrow          
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
			break MISSING_BLOCK_LABEL_66;
	//   10   20:aload_2         
	//   11   21:ifnull          66
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(14, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IBinder mRemote>
	//   21   39:bipush          14
	//   22   41:aload_3         
	//   23   42:aload           4
	//   24   44:iconst_0        
	//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   50:pop             
		parcel1.readException();
	//   27   51:aload           4
	//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   33   65:return          
		parcel.writeInt(0);
	//   34   66:aload_3         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   71:goto            35
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
			break MISSING_BLOCK_LABEL_66;
	//   10   20:aload_2         
	//   11   21:ifnull          66
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(15, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IBinder mRemote>
	//   21   39:bipush          15
	//   22   41:aload_3         
	//   23   42:aload           4
	//   24   44:iconst_0        
	//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   50:pop             
		parcel1.readException();
	//   27   51:aload           4
	//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   33   65:return          
		parcel.writeInt(0);
	//   34   66:aload_3         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   71:goto            35
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
		if(uri == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          76
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		uri.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #158 <Method void Uri.writeToParcel(Parcel, int)>
_L3:
		if(bundle == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   30:aload_2         
	//   17   31:ifnull          96
		parcel.writeInt(1);
	//   18   34:aload_3         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L4:
		mRemote.transact(16, parcel, parcel1, 0);
	//   25   45:aload_0         
	//   26   46:getfield        #19  <Field IBinder mRemote>
	//   27   49:bipush          16
	//   28   51:aload_3         
	//   29   52:aload           4
	//   30   54:iconst_0        
	//   31   55:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   60:pop             
		parcel1.readException();
	//   33   61:aload           4
	//   34   63:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   35   66:aload           4
	//   36   68:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   71:aload_3         
	//   38   72:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   39   75:return          
_L2:
		parcel.writeInt(0);
	//   40   76:aload_3         
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  43   81:goto            30
		uri;
	//   44   84:astore_1        
		parcel1.recycle();
	//   45   85:aload           4
	//   46   87:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   90:aload_3         
	//   48   91:invokevirtual   #58  <Method void Parcel.recycle()>
		throw uri;
	//   49   94:aload_1         
	//   50   95:athrow          
		parcel.writeInt(0);
	//   51   96:aload_3         
	//   52   97:iconst_0        
	//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  54  101:goto            45
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
			break MISSING_BLOCK_LABEL_66;
	//   10   20:aload_2         
	//   11   21:ifnull          66
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(34, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IBinder mRemote>
	//   21   39:bipush          34
	//   22   41:aload_3         
	//   23   42:aload           4
	//   24   44:iconst_0        
	//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   50:pop             
		parcel1.readException();
	//   27   51:aload           4
	//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   33   65:return          
		parcel.writeInt(0);
	//   34   66:aload_3         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   71:goto            35
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
			break MISSING_BLOCK_LABEL_66;
	//   10   20:aload_2         
	//   11   21:ifnull          66
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(35, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IBinder mRemote>
	//   21   39:bipush          35
	//   22   41:aload_3         
	//   23   42:aload           4
	//   24   44:iconst_0        
	//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   50:pop             
		parcel1.readException();
	//   27   51:aload           4
	//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   33   65:return          
		parcel.writeInt(0);
	//   34   66:aload_3         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   71:goto            35
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
		if(uri == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          76
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		uri.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #158 <Method void Uri.writeToParcel(Parcel, int)>
_L3:
		if(bundle == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   30:aload_2         
	//   17   31:ifnull          96
		parcel.writeInt(1);
	//   18   34:aload_3         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L4:
		mRemote.transact(36, parcel, parcel1, 0);
	//   25   45:aload_0         
	//   26   46:getfield        #19  <Field IBinder mRemote>
	//   27   49:bipush          36
	//   28   51:aload_3         
	//   29   52:aload           4
	//   30   54:iconst_0        
	//   31   55:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   60:pop             
		parcel1.readException();
	//   33   61:aload           4
	//   34   63:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   35   66:aload           4
	//   36   68:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   71:aload_3         
	//   38   72:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   39   75:return          
_L2:
		parcel.writeInt(0);
	//   40   76:aload_3         
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  43   81:goto            30
		uri;
	//   44   84:astore_1        
		parcel1.recycle();
	//   45   85:aload           4
	//   46   87:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   90:aload_3         
	//   48   91:invokevirtual   #58  <Method void Parcel.recycle()>
		throw uri;
	//   49   94:aload_1         
	//   50   95:athrow          
		parcel.writeInt(0);
	//   51   96:aload_3         
	//   52   97:iconst_0        
	//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  54  101:goto            45
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
			break MISSING_BLOCK_LABEL_57;
	//    7   14:aload_1         
	//    8   15:ifnull          57
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		ratingcompat.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #168 <Method void RatingCompat.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(25, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #19  <Field IBinder mRemote>
	//   18   33:bipush          25
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   43:pop             
		parcel1.readException();
	//   24   44:aload_3         
	//   25   45:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   30   56:return          
		parcel.writeInt(0);
	//   31   57:aload_2         
	//   32   58:iconst_0        
	//   33   59:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   62:goto            29
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
		if(ratingcompat == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          76
_L1:
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		ratingcompat.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #168 <Method void RatingCompat.writeToParcel(Parcel, int)>
_L3:
		if(bundle == null)
			break MISSING_BLOCK_LABEL_96;
	//   16   30:aload_2         
	//   17   31:ifnull          96
		parcel.writeInt(1);
	//   18   34:aload_3         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L4:
		mRemote.transact(51, parcel, parcel1, 0);
	//   25   45:aload_0         
	//   26   46:getfield        #19  <Field IBinder mRemote>
	//   27   49:bipush          51
	//   28   51:aload_3         
	//   29   52:aload           4
	//   30   54:iconst_0        
	//   31   55:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   32   60:pop             
		parcel1.readException();
	//   33   61:aload           4
	//   34   63:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   35   66:aload           4
	//   36   68:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   37   71:aload_3         
	//   38   72:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   39   75:return          
_L2:
		parcel.writeInt(0);
	//   40   76:aload_3         
	//   41   77:iconst_0        
	//   42   78:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  43   81:goto            30
		ratingcompat;
	//   44   84:astore_1        
		parcel1.recycle();
	//   45   85:aload           4
	//   46   87:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   90:aload_3         
	//   48   91:invokevirtual   #58  <Method void Parcel.recycle()>
		throw ratingcompat;
	//   49   94:aload_1         
	//   50   95:athrow          
		parcel.writeInt(0);
	//   51   96:aload_3         
	//   52   97:iconst_0        
	//   53   98:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  54  101:goto            45
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
		if(imediacontrollercallback == null)
			break MISSING_BLOCK_LABEL_57;
	//    7   14:aload_1         
	//    8   15:ifnull          57
		imediacontrollercallback = ((IMediaControllerCallback) (imediacontrollercallback.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #176 <Method IBinder IMediaControllerCallback.asBinder()>
	//   11   24:astore_1        
_L1:
		parcel.writeStrongBinder(((IBinder) (imediacontrollercallback)));
	//   12   25:aload_2         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #179 <Method void Parcel.writeStrongBinder(IBinder)>
		mRemote.transact(3, parcel, parcel1, 0);
	//   15   30:aload_0         
	//   16   31:getfield        #19  <Field IBinder mRemote>
	//   17   34:iconst_3        
	//   18   35:aload_2         
	//   19   36:aload_3         
	//   20   37:iconst_0        
	//   21   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   22   43:pop             
		parcel1.readException();
	//   23   44:aload_3         
	//   24   45:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   25   48:aload_3         
	//   26   49:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   27   52:aload_2         
	//   28   53:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   29   56:return          
		imediacontrollercallback = null;
	//   30   57:aconst_null     
	//   31   58:astore_1        
		  goto _L1
	//*  32   59:goto            25
		imediacontrollercallback;
	//   33   62:astore_1        
		parcel1.recycle();
	//   34   63:aload_3         
	//   35   64:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   67:aload_2         
	//   37   68:invokevirtual   #58  <Method void Parcel.recycle()>
		throw imediacontrollercallback;
	//   38   71:aload_1         
	//   39   72:athrow          
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
			break MISSING_BLOCK_LABEL_57;
	//    7   14:aload_1         
	//    8   15:ifnull          57
		parcel.writeInt(1);
	//    9   18:aload_2         
	//   10   19:iconst_1        
	//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mediadescriptioncompat.writeToParcel(parcel, 0);
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #46  <Method void MediaDescriptionCompat.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(43, parcel, parcel1, 0);
	//   16   29:aload_0         
	//   17   30:getfield        #19  <Field IBinder mRemote>
	//   18   33:bipush          43
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   43:pop             
		parcel1.readException();
	//   24   44:aload_3         
	//   25   45:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   52:aload_2         
	//   29   53:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   30   56:return          
		parcel.writeInt(0);
	//   31   57:aload_2         
	//   32   58:iconst_0        
	//   33   59:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  34   62:goto            29
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
		if(bundle == null) goto _L2; else goto _L1
	//   10   23:aload_2         
	//   11   24:ifnull          89
_L1:
		parcel.writeInt(1);
	//   12   27:aload           4
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   33:aload_2         
	//   16   34:aload           4
	//   17   36:iconst_0        
	//   18   37:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L3:
		if(receiverwrapper == null)
			break MISSING_BLOCK_LABEL_111;
	//   19   40:aload_3         
	//   20   41:ifnull          111
		parcel.writeInt(1);
	//   21   44:aload           4
	//   22   46:iconst_1        
	//   23   47:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		receiverwrapper.writeToParcel(parcel, 0);
	//   24   50:aload_3         
	//   25   51:aload           4
	//   26   53:iconst_0        
	//   27   54:invokevirtual   #192 <Method void MediaSessionCompat$ResultReceiverWrapper.writeToParcel(Parcel, int)>
_L4:
		mRemote.transact(1, parcel, parcel1, 0);
	//   28   57:aload_0         
	//   29   58:getfield        #19  <Field IBinder mRemote>
	//   30   61:iconst_1        
	//   31   62:aload           4
	//   32   64:aload           5
	//   33   66:iconst_0        
	//   34   67:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   35   72:pop             
		parcel1.readException();
	//   36   73:aload           5
	//   37   75:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   38   78:aload           5
	//   39   80:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   40   83:aload           4
	//   41   85:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   42   88:return          
_L2:
		parcel.writeInt(0);
	//   43   89:aload           4
	//   44   91:iconst_0        
	//   45   92:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L3
	//*  46   95:goto            40
		s;
	//   47   98:astore_1        
		parcel1.recycle();
	//   48   99:aload           5
	//   49  101:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   50  104:aload           4
	//   51  106:invokevirtual   #58  <Method void Parcel.recycle()>
		throw s;
	//   52  109:aload_1         
	//   53  110:athrow          
		parcel.writeInt(0);
	//   54  111:aload           4
	//   55  113:iconst_0        
	//   56  114:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L4
	//*  57  117:goto            57
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
			break MISSING_BLOCK_LABEL_66;
	//   10   20:aload_2         
	//   11   21:ifnull          66
		parcel.writeInt(1);
	//   12   24:aload_3         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #152 <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(26, parcel, parcel1, 0);
	//   19   35:aload_0         
	//   20   36:getfield        #19  <Field IBinder mRemote>
	//   21   39:bipush          26
	//   22   41:aload_3         
	//   23   42:aload           4
	//   24   44:iconst_0        
	//   25   45:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   26   50:pop             
		parcel1.readException();
	//   27   51:aload           4
	//   28   53:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   29   56:aload           4
	//   30   58:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   31   61:aload_3         
	//   32   62:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   33   65:return          
		parcel.writeInt(0);
	//   34   66:aload_3         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  37   71:goto            35
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
		boolean flag;
		Parcel parcel;
		Parcel parcel1;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    5:astore          4
		parcel1 = Parcel.obtain();
	//    4    7:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    5   10:astore          5
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    6   12:aload           4
	//    7   14:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    8   16:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(keyevent == null)
			break MISSING_BLOCK_LABEL_79;
	//    9   19:aload_1         
	//   10   20:ifnull          79
		parcel.writeInt(1);
	//   11   23:aload           4
	//   12   25:iconst_1        
	//   13   26:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		keyevent.writeToParcel(parcel, 0);
	//   14   29:aload_1         
	//   15   30:aload           4
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #198 <Method void KeyEvent.writeToParcel(Parcel, int)>
_L1:
		int i;
		mRemote.transact(2, parcel, parcel1, 0);
	//   18   36:aload_0         
	//   19   37:getfield        #19  <Field IBinder mRemote>
	//   20   40:iconst_2        
	//   21   41:aload           4
	//   22   43:aload           5
	//   23   45:iconst_0        
	//   24   46:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   25   51:pop             
		parcel1.readException();
	//   26   52:aload           5
	//   27   54:invokevirtual   #55  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   28   57:aload           5
	//   29   59:invokevirtual   #75  <Method int Parcel.readInt()>
	//   30   62:istore_2        
		if(i == 0)
	//*  31   63:iload_2         
	//*  32   64:ifeq            101
	//*  33   67:aload           5
	//*  34   69:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  35   72:aload           4
	//*  36   74:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  37   77:iload_3         
	//*  38   78:ireturn         
	//*  39   79:aload           4
	//*  40   81:iconst_0        
	//*  41   82:invokevirtual   #40  <Method void Parcel.writeInt(int)>
	//*  42   85:goto            36
	//*  43   88:astore_1        
	//*  44   89:aload           5
	//*  45   91:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  46   94:aload           4
	//*  47   96:invokevirtual   #58  <Method void Parcel.recycle()>
	//*  48   99:aload_1         
	//*  49  100:athrow          
			flag = false;
	//   50  101:iconst_0        
	//   51  102:istore_3        
		parcel1.recycle();
		parcel.recycle();
		return flag;
		parcel.writeInt(0);
		  goto _L1
		keyevent;
		parcel1.recycle();
		parcel.recycle();
		throw keyevent;
	//*  52  103:goto            67
	}

	public void setCaptioningEnabled(boolean flag)
		throws RemoteException
	{
		int i;
		Parcel parcel;
		Parcel parcel1;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    5:astore_3        
		parcel1 = Parcel.obtain();
	//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    5    9:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    6   11:aload_3         
	//    7   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(flag)
	//*   9   17:iload_1         
	//*  10   18:ifeq            23
			i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		parcel.writeInt(i);
	//   13   23:aload_3         
	//   14   24:iload_2         
	//   15   25:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(46, parcel, parcel1, 0);
	//   16   28:aload_0         
	//   17   29:getfield        #19  <Field IBinder mRemote>
	//   18   32:bipush          46
	//   19   34:aload_3         
	//   20   35:aload           4
	//   21   37:iconst_0        
	//   22   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   43:pop             
		parcel1.readException();
	//   24   44:aload           4
	//   25   46:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   49:aload           4
	//   27   51:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   54:aload_3         
	//   29   55:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   30   58:return          
		Exception exception;
		exception;
	//   31   59:astore          5
		parcel1.recycle();
	//   32   61:aload           4
	//   33   63:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   66:aload_3         
	//   35   67:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   36   70:aload           5
	//   37   72:athrow          
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

	public void setShuffleModeEnabledDeprecated(boolean flag)
		throws RemoteException
	{
		int i;
		Parcel parcel;
		Parcel parcel1;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    3    5:astore_3        
		parcel1 = Parcel.obtain();
	//    4    6:invokestatic    #30  <Method Parcel Parcel.obtain()>
	//    5    9:astore          4
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
	//    6   11:aload_3         
	//    7   12:ldc1            #32  <String "android.support.v4.media.session.IMediaSession">
	//    8   14:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
		if(flag)
	//*   9   17:iload_1         
	//*  10   18:ifeq            23
			i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		parcel.writeInt(i);
	//   13   23:aload_3         
	//   14   24:iload_2         
	//   15   25:invokevirtual   #40  <Method void Parcel.writeInt(int)>
		mRemote.transact(40, parcel, parcel1, 0);
	//   16   28:aload_0         
	//   17   29:getfield        #19  <Field IBinder mRemote>
	//   18   32:bipush          40
	//   19   34:aload_3         
	//   20   35:aload           4
	//   21   37:iconst_0        
	//   22   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   23   43:pop             
		parcel1.readException();
	//   24   44:aload           4
	//   25   46:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   26   49:aload           4
	//   27   51:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   28   54:aload_3         
	//   29   55:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   30   58:return          
		Exception exception;
		exception;
	//   31   59:astore          5
		parcel1.recycle();
	//   32   61:aload           4
	//   33   63:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   34   66:aload_3         
	//   35   67:invokevirtual   #58  <Method void Parcel.recycle()>
		throw exception;
	//   36   70:aload           5
	//   37   72:athrow          
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
		if(imediacontrollercallback == null)
			break MISSING_BLOCK_LABEL_57;
	//    7   14:aload_1         
	//    8   15:ifnull          57
		imediacontrollercallback = ((IMediaControllerCallback) (imediacontrollercallback.asBinder()));
	//    9   18:aload_1         
	//   10   19:invokeinterface #176 <Method IBinder IMediaControllerCallback.asBinder()>
	//   11   24:astore_1        
_L1:
		parcel.writeStrongBinder(((IBinder) (imediacontrollercallback)));
	//   12   25:aload_2         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #179 <Method void Parcel.writeStrongBinder(IBinder)>
		mRemote.transact(4, parcel, parcel1, 0);
	//   15   30:aload_0         
	//   16   31:getfield        #19  <Field IBinder mRemote>
	//   17   34:iconst_4        
	//   18   35:aload_2         
	//   19   36:aload_3         
	//   20   37:iconst_0        
	//   21   38:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   22   43:pop             
		parcel1.readException();
	//   23   44:aload_3         
	//   24   45:invokevirtual   #55  <Method void Parcel.readException()>
		parcel1.recycle();
	//   25   48:aload_3         
	//   26   49:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   27   52:aload_2         
	//   28   53:invokevirtual   #58  <Method void Parcel.recycle()>
		return;
	//   29   56:return          
		imediacontrollercallback = null;
	//   30   57:aconst_null     
	//   31   58:astore_1        
		  goto _L1
	//*  32   59:goto            25
		imediacontrollercallback;
	//   33   62:astore_1        
		parcel1.recycle();
	//   34   63:aload_3         
	//   35   64:invokevirtual   #58  <Method void Parcel.recycle()>
		parcel.recycle();
	//   36   67:aload_2         
	//   37   68:invokevirtual   #58  <Method void Parcel.recycle()>
		throw imediacontrollercallback;
	//   38   71:aload_1         
	//   39   72:athrow          
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
