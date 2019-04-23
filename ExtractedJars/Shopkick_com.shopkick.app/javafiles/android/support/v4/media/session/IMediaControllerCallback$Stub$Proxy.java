// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			IMediaControllerCallback, PlaybackStateCompat, ParcelableVolumeInfo

private static class IMediaControllerCallback$Stub$Proxy
	implements IMediaControllerCallback
{

	public IBinder asBinder()
	{
		return mRemote;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder mRemote>
	//    2    4:areturn         
	}

	public String getInterfaceDescriptor()
	{
		return "android.support.v4.media.session.IMediaControllerCallback";
	//    0    0:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    1    2:areturn         
	}

	public void onCaptioningEnabledChanged(boolean flag)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_3         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   5   10:iload_1         
	//*   6   11:ifeq            53
			i = 1;
	//    7   14:iconst_1        
	//    8   15:istore_2        
		else
	//*   9   16:goto            19
	//*  10   19:aload_3         
	//*  11   20:iload_2         
	//*  12   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
	//*  13   24:aload_0         
	//*  14   25:getfield        #19  <Field IBinder mRemote>
	//*  15   28:bipush          11
	//*  16   30:aload_3         
	//*  17   31:aconst_null     
	//*  18   32:iconst_1        
	//*  19   33:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  20   38:pop             
	//*  21   39:aload_3         
	//*  22   40:invokevirtual   #53  <Method void Parcel.recycle()>
	//*  23   43:return          
	//*  24   44:astore          4
	//*  25   46:aload_3         
	//*  26   47:invokevirtual   #53  <Method void Parcel.recycle()>
	//*  27   50:aload           4
	//*  28   52:athrow          
			i = 0;
	//   29   53:iconst_0        
	//   30   54:istore_2        
		parcel.writeInt(i);
		mRemote.transact(11, parcel, ((Parcel) (null)), 1);
		parcel.recycle();
		return;
		exception;
		parcel.recycle();
		throw exception;
	//*  31   55:goto            19
	}

	public void onEvent(String s, Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_3         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeString(s);
	//    5   10:aload_3         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #59  <Method void Parcel.writeString(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_33;
	//    8   15:aload_2         
	//    9   16:ifnull          33
		parcel.writeInt(1);
	//   10   19:aload_3         
	//   11   20:iconst_1        
	//   12   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokevirtual   #65  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   17   30:goto            38
		parcel.writeInt(0);
	//   18   33:aload_3         
	//   19   34:iconst_0        
	//   20   35:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(1, parcel, ((Parcel) (null)), 1);
	//   21   38:aload_0         
	//   22   39:getfield        #19  <Field IBinder mRemote>
	//   23   42:iconst_1        
	//   24   43:aload_3         
	//   25   44:aconst_null     
	//   26   45:iconst_1        
	//   27   46:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   28   51:pop             
		parcel.recycle();
	//   29   52:aload_3         
	//   30   53:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   31   56:return          
		s;
	//   32   57:astore_1        
		parcel.recycle();
	//   33   58:aload_3         
	//   34   59:invokevirtual   #53  <Method void Parcel.recycle()>
		throw s;
	//   35   62:aload_1         
	//   36   63:athrow          
	}

	public void onExtrasChanged(Bundle bundle)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_2         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_28;
	//    5   10:aload_1         
	//    6   11:ifnull          28
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #65  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_33;
	//   14   25:goto            33
		parcel.writeInt(0);
	//   15   28:aload_2         
	//   16   29:iconst_0        
	//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(7, parcel, ((Parcel) (null)), 1);
	//   18   33:aload_0         
	//   19   34:getfield        #19  <Field IBinder mRemote>
	//   20   37:bipush          7
	//   21   39:aload_2         
	//   22   40:aconst_null     
	//   23   41:iconst_1        
	//   24   42:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   25   47:pop             
		parcel.recycle();
	//   26   48:aload_2         
	//   27   49:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   28   52:return          
		bundle;
	//   29   53:astore_1        
		parcel.recycle();
	//   30   54:aload_2         
	//   31   55:invokevirtual   #53  <Method void Parcel.recycle()>
		throw bundle;
	//   32   58:aload_1         
	//   33   59:athrow          
	}

	public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_2         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(mediametadatacompat == null)
			break MISSING_BLOCK_LABEL_28;
	//    5   10:aload_1         
	//    6   11:ifnull          28
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mediametadatacompat.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #72  <Method void MediaMetadataCompat.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_33;
	//   14   25:goto            33
		parcel.writeInt(0);
	//   15   28:aload_2         
	//   16   29:iconst_0        
	//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(4, parcel, ((Parcel) (null)), 1);
	//   18   33:aload_0         
	//   19   34:getfield        #19  <Field IBinder mRemote>
	//   20   37:iconst_4        
	//   21   38:aload_2         
	//   22   39:aconst_null     
	//   23   40:iconst_1        
	//   24   41:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   25   46:pop             
		parcel.recycle();
	//   26   47:aload_2         
	//   27   48:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   28   51:return          
		mediametadatacompat;
	//   29   52:astore_1        
		parcel.recycle();
	//   30   53:aload_2         
	//   31   54:invokevirtual   #53  <Method void Parcel.recycle()>
		throw mediametadatacompat;
	//   32   57:aload_1         
	//   33   58:athrow          
	}

	public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_2         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(playbackstatecompat == null)
			break MISSING_BLOCK_LABEL_28;
	//    5   10:aload_1         
	//    6   11:ifnull          28
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		playbackstatecompat.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #77  <Method void PlaybackStateCompat.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_33;
	//   14   25:goto            33
		parcel.writeInt(0);
	//   15   28:aload_2         
	//   16   29:iconst_0        
	//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(3, parcel, ((Parcel) (null)), 1);
	//   18   33:aload_0         
	//   19   34:getfield        #19  <Field IBinder mRemote>
	//   20   37:iconst_3        
	//   21   38:aload_2         
	//   22   39:aconst_null     
	//   23   40:iconst_1        
	//   24   41:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   25   46:pop             
		parcel.recycle();
	//   26   47:aload_2         
	//   27   48:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   28   51:return          
		playbackstatecompat;
	//   29   52:astore_1        
		parcel.recycle();
	//   30   53:aload_2         
	//   31   54:invokevirtual   #53  <Method void Parcel.recycle()>
		throw playbackstatecompat;
	//   32   57:aload_1         
	//   33   58:athrow          
	}

	public void onQueueChanged(List list)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_2         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeTypedList(list);
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #82  <Method void Parcel.writeTypedList(List)>
		mRemote.transact(5, parcel, ((Parcel) (null)), 1);
	//    8   15:aload_0         
	//    9   16:getfield        #19  <Field IBinder mRemote>
	//   10   19:iconst_5        
	//   11   20:aload_2         
	//   12   21:aconst_null     
	//   13   22:iconst_1        
	//   14   23:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   15   28:pop             
		parcel.recycle();
	//   16   29:aload_2         
	//   17   30:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   18   33:return          
		list;
	//   19   34:astore_1        
		parcel.recycle();
	//   20   35:aload_2         
	//   21   36:invokevirtual   #53  <Method void Parcel.recycle()>
		throw list;
	//   22   39:aload_1         
	//   23   40:athrow          
	}

	public void onQueueTitleChanged(CharSequence charsequence)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_2         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(charsequence == null)
			break MISSING_BLOCK_LABEL_28;
	//    5   10:aload_1         
	//    6   11:ifnull          28
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		TextUtils.writeToParcel(charsequence, parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokestatic    #91  <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		break MISSING_BLOCK_LABEL_33;
	//   14   25:goto            33
		parcel.writeInt(0);
	//   15   28:aload_2         
	//   16   29:iconst_0        
	//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(6, parcel, ((Parcel) (null)), 1);
	//   18   33:aload_0         
	//   19   34:getfield        #19  <Field IBinder mRemote>
	//   20   37:bipush          6
	//   21   39:aload_2         
	//   22   40:aconst_null     
	//   23   41:iconst_1        
	//   24   42:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   25   47:pop             
		parcel.recycle();
	//   26   48:aload_2         
	//   27   49:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   28   52:return          
		charsequence;
	//   29   53:astore_1        
		parcel.recycle();
	//   30   54:aload_2         
	//   31   55:invokevirtual   #53  <Method void Parcel.recycle()>
		throw charsequence;
	//   32   58:aload_1         
	//   33   59:athrow          
	}

	public void onRepeatModeChanged(int i)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_2         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    5   10:aload_2         
	//    6   11:iload_1         
	//    7   12:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(9, parcel, ((Parcel) (null)), 1);
	//    8   15:aload_0         
	//    9   16:getfield        #19  <Field IBinder mRemote>
	//   10   19:bipush          9
	//   11   21:aload_2         
	//   12   22:aconst_null     
	//   13   23:iconst_1        
	//   14   24:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   15   29:pop             
		parcel.recycle();
	//   16   30:aload_2         
	//   17   31:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   18   34:return          
		Exception exception;
		exception;
	//   19   35:astore_3        
		parcel.recycle();
	//   20   36:aload_2         
	//   21   37:invokevirtual   #53  <Method void Parcel.recycle()>
		throw exception;
	//   22   40:aload_3         
	//   23   41:athrow          
	}

	public void onSessionDestroyed()
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_1         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(2, parcel, ((Parcel) (null)), 1);
	//    5   10:aload_0         
	//    6   11:getfield        #19  <Field IBinder mRemote>
	//    7   14:iconst_2        
	//    8   15:aload_1         
	//    9   16:aconst_null     
	//   10   17:iconst_1        
	//   11   18:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   12   23:pop             
		parcel.recycle();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   15   28:return          
		Exception exception;
		exception;
	//   16   29:astore_2        
		parcel.recycle();
	//   17   30:aload_1         
	//   18   31:invokevirtual   #53  <Method void Parcel.recycle()>
		throw exception;
	//   19   34:aload_2         
	//   20   35:athrow          
	}

	public void onSessionReady()
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_1         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		mRemote.transact(13, parcel, ((Parcel) (null)), 1);
	//    5   10:aload_0         
	//    6   11:getfield        #19  <Field IBinder mRemote>
	//    7   14:bipush          13
	//    8   16:aload_1         
	//    9   17:aconst_null     
	//   10   18:iconst_1        
	//   11   19:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   12   24:pop             
		parcel.recycle();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   15   29:return          
		Exception exception;
		exception;
	//   16   30:astore_2        
		parcel.recycle();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #53  <Method void Parcel.recycle()>
		throw exception;
	//   19   35:aload_2         
	//   20   36:athrow          
	}

	public void onShuffleModeChanged(int i)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_2         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		parcel.writeInt(i);
	//    5   10:aload_2         
	//    6   11:iload_1         
	//    7   12:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(12, parcel, ((Parcel) (null)), 1);
	//    8   15:aload_0         
	//    9   16:getfield        #19  <Field IBinder mRemote>
	//   10   19:bipush          12
	//   11   21:aload_2         
	//   12   22:aconst_null     
	//   13   23:iconst_1        
	//   14   24:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   15   29:pop             
		parcel.recycle();
	//   16   30:aload_2         
	//   17   31:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   18   34:return          
		Exception exception;
		exception;
	//   19   35:astore_3        
		parcel.recycle();
	//   20   36:aload_2         
	//   21   37:invokevirtual   #53  <Method void Parcel.recycle()>
		throw exception;
	//   22   40:aload_3         
	//   23   41:athrow          
	}

	public void onShuffleModeChangedRemoved(boolean flag)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_3         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		int i;
		Exception exception;
		if(flag)
	//*   5   10:iload_1         
	//*   6   11:ifeq            53
			i = 1;
	//    7   14:iconst_1        
	//    8   15:istore_2        
		else
	//*   9   16:goto            19
	//*  10   19:aload_3         
	//*  11   20:iload_2         
	//*  12   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
	//*  13   24:aload_0         
	//*  14   25:getfield        #19  <Field IBinder mRemote>
	//*  15   28:bipush          10
	//*  16   30:aload_3         
	//*  17   31:aconst_null     
	//*  18   32:iconst_1        
	//*  19   33:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  20   38:pop             
	//*  21   39:aload_3         
	//*  22   40:invokevirtual   #53  <Method void Parcel.recycle()>
	//*  23   43:return          
	//*  24   44:astore          4
	//*  25   46:aload_3         
	//*  26   47:invokevirtual   #53  <Method void Parcel.recycle()>
	//*  27   50:aload           4
	//*  28   52:athrow          
			i = 0;
	//   29   53:iconst_0        
	//   30   54:istore_2        
		parcel.writeInt(i);
		mRemote.transact(10, parcel, ((Parcel) (null)), 1);
		parcel.recycle();
		return;
		exception;
		parcel.recycle();
		throw exception;
	//*  31   55:goto            19
	}

	public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
		throws RemoteException
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    1    3:astore_2        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_2         
	//    3    5:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    4    7:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(parcelablevolumeinfo == null)
			break MISSING_BLOCK_LABEL_28;
	//    5   10:aload_1         
	//    6   11:ifnull          28
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		parcelablevolumeinfo.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #101 <Method void ParcelableVolumeInfo.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_33;
	//   14   25:goto            33
		parcel.writeInt(0);
	//   15   28:aload_2         
	//   16   29:iconst_0        
	//   17   30:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mRemote.transact(8, parcel, ((Parcel) (null)), 1);
	//   18   33:aload_0         
	//   19   34:getfield        #19  <Field IBinder mRemote>
	//   20   37:bipush          8
	//   21   39:aload_2         
	//   22   40:aconst_null     
	//   23   41:iconst_1        
	//   24   42:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   25   47:pop             
		parcel.recycle();
	//   26   48:aload_2         
	//   27   49:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   28   52:return          
		parcelablevolumeinfo;
	//   29   53:astore_1        
		parcel.recycle();
	//   30   54:aload_2         
	//   31   55:invokevirtual   #53  <Method void Parcel.recycle()>
		throw parcelablevolumeinfo;
	//   32   58:aload_1         
	//   33   59:athrow          
	}

	private IBinder mRemote;

	IMediaControllerCallback$Stub$Proxy(IBinder ibinder)
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
