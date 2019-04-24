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
		int i;
		Parcel parcel;
		i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    3    5:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    4    6:aload_3         
	//    5    7:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    6    9:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(!flag)
	//*   7   12:iload_1         
	//*   8   13:ifeq            41
	//*   9   16:aload_3         
	//*  10   17:iload_2         
	//*  11   18:invokevirtual   #44  <Method void Parcel.writeInt(int)>
	//*  12   21:aload_0         
	//*  13   22:getfield        #19  <Field IBinder mRemote>
	//*  14   25:bipush          11
	//*  15   27:aload_3         
	//*  16   28:aconst_null     
	//*  17   29:iconst_1        
	//*  18   30:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  19   35:pop             
	//*  20   36:aload_3         
	//*  21   37:invokevirtual   #53  <Method void Parcel.recycle()>
	//*  22   40:return          
			i = 0;
	//   23   41:iconst_0        
	//   24   42:istore_2        
		parcel.writeInt(i);
		mRemote.transact(11, parcel, ((Parcel) (null)), 1);
		parcel.recycle();
		return;
	//*  25   43:goto            16
		Exception exception;
		exception;
	//   26   46:astore          4
		parcel.recycle();
	//   27   48:aload_3         
	//   28   49:invokevirtual   #53  <Method void Parcel.recycle()>
		throw exception;
	//   29   52:aload           4
	//   30   54:athrow          
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
			break MISSING_BLOCK_LABEL_49;
	//    8   15:aload_2         
	//    9   16:ifnull          49
		parcel.writeInt(1);
	//   10   19:aload_3         
	//   11   20:iconst_1        
	//   12   21:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:iconst_0        
	//   16   27:invokevirtual   #65  <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(1, parcel, ((Parcel) (null)), 1);
	//   17   30:aload_0         
	//   18   31:getfield        #19  <Field IBinder mRemote>
	//   19   34:iconst_1        
	//   20   35:aload_3         
	//   21   36:aconst_null     
	//   22   37:iconst_1        
	//   23   38:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   24   43:pop             
		parcel.recycle();
	//   25   44:aload_3         
	//   26   45:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   27   48:return          
		parcel.writeInt(0);
	//   28   49:aload_3         
	//   29   50:iconst_0        
	//   30   51:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  31   54:goto            30
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
			break MISSING_BLOCK_LABEL_45;
	//    5   10:aload_1         
	//    6   11:ifnull          45
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #65  <Method void Bundle.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(7, parcel, ((Parcel) (null)), 1);
	//   14   25:aload_0         
	//   15   26:getfield        #19  <Field IBinder mRemote>
	//   16   29:bipush          7
	//   17   31:aload_2         
	//   18   32:aconst_null     
	//   19   33:iconst_1        
	//   20   34:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   21   39:pop             
		parcel.recycle();
	//   22   40:aload_2         
	//   23   41:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   24   44:return          
		parcel.writeInt(0);
	//   25   45:aload_2         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  28   50:goto            25
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
			break MISSING_BLOCK_LABEL_44;
	//    5   10:aload_1         
	//    6   11:ifnull          44
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		mediametadatacompat.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #72  <Method void MediaMetadataCompat.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(4, parcel, ((Parcel) (null)), 1);
	//   14   25:aload_0         
	//   15   26:getfield        #19  <Field IBinder mRemote>
	//   16   29:iconst_4        
	//   17   30:aload_2         
	//   18   31:aconst_null     
	//   19   32:iconst_1        
	//   20   33:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   21   38:pop             
		parcel.recycle();
	//   22   39:aload_2         
	//   23   40:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   24   43:return          
		parcel.writeInt(0);
	//   25   44:aload_2         
	//   26   45:iconst_0        
	//   27   46:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  28   49:goto            25
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
			break MISSING_BLOCK_LABEL_44;
	//    5   10:aload_1         
	//    6   11:ifnull          44
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		playbackstatecompat.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #77  <Method void PlaybackStateCompat.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(3, parcel, ((Parcel) (null)), 1);
	//   14   25:aload_0         
	//   15   26:getfield        #19  <Field IBinder mRemote>
	//   16   29:iconst_3        
	//   17   30:aload_2         
	//   18   31:aconst_null     
	//   19   32:iconst_1        
	//   20   33:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   21   38:pop             
		parcel.recycle();
	//   22   39:aload_2         
	//   23   40:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   24   43:return          
		parcel.writeInt(0);
	//   25   44:aload_2         
	//   26   45:iconst_0        
	//   27   46:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  28   49:goto            25
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
			break MISSING_BLOCK_LABEL_45;
	//    5   10:aload_1         
	//    6   11:ifnull          45
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		TextUtils.writeToParcel(charsequence, parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokestatic    #91  <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
_L1:
		mRemote.transact(6, parcel, ((Parcel) (null)), 1);
	//   14   25:aload_0         
	//   15   26:getfield        #19  <Field IBinder mRemote>
	//   16   29:bipush          6
	//   17   31:aload_2         
	//   18   32:aconst_null     
	//   19   33:iconst_1        
	//   20   34:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   21   39:pop             
		parcel.recycle();
	//   22   40:aload_2         
	//   23   41:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   24   44:return          
		parcel.writeInt(0);
	//   25   45:aload_2         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  28   50:goto            25
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

	public void onShuffleModeChangedDeprecated(boolean flag)
		throws RemoteException
	{
		int i;
		Parcel parcel;
		i = 1;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		parcel = Parcel.obtain();
	//    2    2:invokestatic    #36  <Method Parcel Parcel.obtain()>
	//    3    5:astore_3        
		parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
	//    4    6:aload_3         
	//    5    7:ldc1            #26  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    6    9:invokevirtual   #40  <Method void Parcel.writeInterfaceToken(String)>
		if(!flag)
	//*   7   12:iload_1         
	//*   8   13:ifeq            41
	//*   9   16:aload_3         
	//*  10   17:iload_2         
	//*  11   18:invokevirtual   #44  <Method void Parcel.writeInt(int)>
	//*  12   21:aload_0         
	//*  13   22:getfield        #19  <Field IBinder mRemote>
	//*  14   25:bipush          10
	//*  15   27:aload_3         
	//*  16   28:aconst_null     
	//*  17   29:iconst_1        
	//*  18   30:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//*  19   35:pop             
	//*  20   36:aload_3         
	//*  21   37:invokevirtual   #53  <Method void Parcel.recycle()>
	//*  22   40:return          
			i = 0;
	//   23   41:iconst_0        
	//   24   42:istore_2        
		parcel.writeInt(i);
		mRemote.transact(10, parcel, ((Parcel) (null)), 1);
		parcel.recycle();
		return;
	//*  25   43:goto            16
		Exception exception;
		exception;
	//   26   46:astore          4
		parcel.recycle();
	//   27   48:aload_3         
	//   28   49:invokevirtual   #53  <Method void Parcel.recycle()>
		throw exception;
	//   29   52:aload           4
	//   30   54:athrow          
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
			break MISSING_BLOCK_LABEL_45;
	//    5   10:aload_1         
	//    6   11:ifnull          45
		parcel.writeInt(1);
	//    7   14:aload_2         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		parcelablevolumeinfo.writeToParcel(parcel, 0);
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:iconst_0        
	//   13   22:invokevirtual   #100 <Method void ParcelableVolumeInfo.writeToParcel(Parcel, int)>
_L1:
		mRemote.transact(8, parcel, ((Parcel) (null)), 1);
	//   14   25:aload_0         
	//   15   26:getfield        #19  <Field IBinder mRemote>
	//   16   29:bipush          8
	//   17   31:aload_2         
	//   18   32:aconst_null     
	//   19   33:iconst_1        
	//   20   34:invokeinterface #50  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   21   39:pop             
		parcel.recycle();
	//   22   40:aload_2         
	//   23   41:invokevirtual   #53  <Method void Parcel.recycle()>
		return;
	//   24   44:return          
		parcel.writeInt(0);
	//   25   45:aload_2         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		  goto _L1
	//*  28   50:goto            25
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
