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

public static abstract class IMediaControllerCallback$Stub extends Binder
	implements IMediaControllerCallback
{
	private static class Proxy
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

		Proxy(IBinder ibinder)
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


	public static IMediaControllerCallback asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    6    9:invokeinterface #56  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof IMediaControllerCallback))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class IMediaControllerCallback>
	//*  12   23:ifeq            31
			return (IMediaControllerCallback)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class IMediaControllerCallback>
	//   15   30:areturn         
		else
			return ((IMediaControllerCallback) (new Proxy(ibinder)));
	//   16   31:new             #9   <Class IMediaControllerCallback$Stub$Proxy>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #59  <Method void IMediaControllerCallback$Stub$Proxy(IBinder)>
	//   20   39:areturn         
	}

	public IBinder asBinder()
	{
		return ((IBinder) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		String s = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		Object obj1 = null;
	//    4    6:aconst_null     
	//    5    7:astore          8
		Object obj2 = null;
	//    6    9:aconst_null     
	//    7   10:astore          9
		Object obj3 = null;
	//    8   12:aconst_null     
	//    9   13:astore          10
		Object obj4 = null;
	//   10   15:aconst_null     
	//   11   16:astore          11
		Object obj = null;
	//   12   18:aconst_null     
	//   13   19:astore          6
		switch(i)
	//*  14   21:iload_1         
		{
	//*  15   22:lookupswitch    13: default 136
	//	               1: 154
	//	               2: 198
	//	               3: 210
	//	               4: 246
	//	               5: 282
	//	               6: 301
	//	               7: 337
	//	               8: 373
	//	               9: 409
	//	               10: 425
	//	               11: 455
	//	               12: 479
	//	               1598968902: 146
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//   16  136:aload_0         
	//   17  137:iload_1         
	//   18  138:aload_2         
	//   19  139:aload_3         
	//   20  140:iload           4
	//   21  142:invokespecial   #67  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   22  145:ireturn         

		case 1598968902: 
			parcel1.writeString("android.support.v4.media.session.IMediaControllerCallback");
	//   23  146:aload_3         
	//   24  147:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   25  149:invokevirtual   #73  <Method void Parcel.writeString(String)>
			return true;
	//   26  152:iconst_1        
	//   27  153:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   28  154:aload_2         
	//   29  155:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   30  157:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			s = parcel.readString();
	//   31  160:aload_2         
	//   32  161:invokevirtual   #80  <Method String Parcel.readString()>
	//   33  164:astore          7
			parcel1 = ((Parcel) (obj));
	//   34  166:aload           6
	//   35  168:astore_3        
			if(parcel.readInt() != 0)
	//*  36  169:aload_2         
	//*  37  170:invokevirtual   #84  <Method int Parcel.readInt()>
	//*  38  173:ifeq            189
				parcel1 = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   39  176:getstatic       #90  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   40  179:aload_2         
	//   41  180:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   42  185:checkcast       #86  <Class Bundle>
	//   43  188:astore_3        
			onEvent(s, ((Bundle) (parcel1)));
	//   44  189:aload_0         
	//   45  190:aload           7
	//   46  192:aload_3         
	//   47  193:invokevirtual   #100 <Method void onEvent(String, Bundle)>
			return true;
	//   48  196:iconst_1        
	//   49  197:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   50  198:aload_2         
	//   51  199:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   52  201:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			onSessionDestroyed();
	//   53  204:aload_0         
	//   54  205:invokevirtual   #103 <Method void onSessionDestroyed()>
			return true;
	//   55  208:iconst_1        
	//   56  209:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   57  210:aload_2         
	//   58  211:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   59  213:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			parcel1 = ((Parcel) (s));
	//   60  216:aload           7
	//   61  218:astore_3        
			if(parcel.readInt() != 0)
	//*  62  219:aload_2         
	//*  63  220:invokevirtual   #84  <Method int Parcel.readInt()>
	//*  64  223:ifeq            239
				parcel1 = ((Parcel) ((PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel)));
	//   65  226:getstatic       #106 <Field android.os.Parcelable$Creator PlaybackStateCompat.CREATOR>
	//   66  229:aload_2         
	//   67  230:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   68  235:checkcast       #105 <Class PlaybackStateCompat>
	//   69  238:astore_3        
			onPlaybackStateChanged(((PlaybackStateCompat) (parcel1)));
	//   70  239:aload_0         
	//   71  240:aload_3         
	//   72  241:invokevirtual   #110 <Method void onPlaybackStateChanged(PlaybackStateCompat)>
			return true;
	//   73  244:iconst_1        
	//   74  245:ireturn         

		case 4: // '\004'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   75  246:aload_2         
	//   76  247:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   77  249:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			parcel1 = ((Parcel) (obj1));
	//   78  252:aload           8
	//   79  254:astore_3        
			if(parcel.readInt() != 0)
	//*  80  255:aload_2         
	//*  81  256:invokevirtual   #84  <Method int Parcel.readInt()>
	//*  82  259:ifeq            275
				parcel1 = ((Parcel) ((MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel)));
	//   83  262:getstatic       #113 <Field android.os.Parcelable$Creator MediaMetadataCompat.CREATOR>
	//   84  265:aload_2         
	//   85  266:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   86  271:checkcast       #112 <Class MediaMetadataCompat>
	//   87  274:astore_3        
			onMetadataChanged(((MediaMetadataCompat) (parcel1)));
	//   88  275:aload_0         
	//   89  276:aload_3         
	//   90  277:invokevirtual   #117 <Method void onMetadataChanged(MediaMetadataCompat)>
			return true;
	//   91  280:iconst_1        
	//   92  281:ireturn         

		case 5: // '\005'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   93  282:aload_2         
	//   94  283:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   95  285:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			onQueueChanged(((List) (parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR))));
	//   96  288:aload_0         
	//   97  289:aload_2         
	//   98  290:getstatic       #120 <Field android.os.Parcelable$Creator MediaSessionCompat$QueueItem.CREATOR>
	//   99  293:invokevirtual   #124 <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//  100  296:invokevirtual   #128 <Method void onQueueChanged(List)>
			return true;
	//  101  299:iconst_1        
	//  102  300:ireturn         

		case 6: // '\006'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  103  301:aload_2         
	//  104  302:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  105  304:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			parcel1 = ((Parcel) (obj2));
	//  106  307:aload           9
	//  107  309:astore_3        
			if(parcel.readInt() != 0)
	//* 108  310:aload_2         
	//* 109  311:invokevirtual   #84  <Method int Parcel.readInt()>
	//* 110  314:ifeq            330
				parcel1 = ((Parcel) ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel)));
	//  111  317:getstatic       #133 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//  112  320:aload_2         
	//  113  321:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  114  326:checkcast       #135 <Class CharSequence>
	//  115  329:astore_3        
			onQueueTitleChanged(((CharSequence) (parcel1)));
	//  116  330:aload_0         
	//  117  331:aload_3         
	//  118  332:invokevirtual   #139 <Method void onQueueTitleChanged(CharSequence)>
			return true;
	//  119  335:iconst_1        
	//  120  336:ireturn         

		case 7: // '\007'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  121  337:aload_2         
	//  122  338:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  123  340:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			parcel1 = ((Parcel) (obj3));
	//  124  343:aload           10
	//  125  345:astore_3        
			if(parcel.readInt() != 0)
	//* 126  346:aload_2         
	//* 127  347:invokevirtual   #84  <Method int Parcel.readInt()>
	//* 128  350:ifeq            366
				parcel1 = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//  129  353:getstatic       #90  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  130  356:aload_2         
	//  131  357:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  132  362:checkcast       #86  <Class Bundle>
	//  133  365:astore_3        
			onExtrasChanged(((Bundle) (parcel1)));
	//  134  366:aload_0         
	//  135  367:aload_3         
	//  136  368:invokevirtual   #143 <Method void onExtrasChanged(Bundle)>
			return true;
	//  137  371:iconst_1        
	//  138  372:ireturn         

		case 8: // '\b'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  139  373:aload_2         
	//  140  374:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  141  376:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			parcel1 = ((Parcel) (obj4));
	//  142  379:aload           11
	//  143  381:astore_3        
			if(parcel.readInt() != 0)
	//* 144  382:aload_2         
	//* 145  383:invokevirtual   #84  <Method int Parcel.readInt()>
	//* 146  386:ifeq            402
				parcel1 = ((Parcel) ((ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel)));
	//  147  389:getstatic       #146 <Field android.os.Parcelable$Creator ParcelableVolumeInfo.CREATOR>
	//  148  392:aload_2         
	//  149  393:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  150  398:checkcast       #145 <Class ParcelableVolumeInfo>
	//  151  401:astore_3        
			onVolumeInfoChanged(((ParcelableVolumeInfo) (parcel1)));
	//  152  402:aload_0         
	//  153  403:aload_3         
	//  154  404:invokevirtual   #150 <Method void onVolumeInfoChanged(ParcelableVolumeInfo)>
			return true;
	//  155  407:iconst_1        
	//  156  408:ireturn         

		case 9: // '\t'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  157  409:aload_2         
	//  158  410:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  159  412:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			onRepeatModeChanged(parcel.readInt());
	//  160  415:aload_0         
	//  161  416:aload_2         
	//  162  417:invokevirtual   #84  <Method int Parcel.readInt()>
	//  163  420:invokevirtual   #154 <Method void onRepeatModeChanged(int)>
			return true;
	//  164  423:iconst_1        
	//  165  424:ireturn         

		case 10: // '\n'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  166  425:aload_2         
	//  167  426:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  168  428:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 169  431:aload_2         
	//* 170  432:invokevirtual   #84  <Method int Parcel.readInt()>
	//* 171  435:ifeq            449
				flag = true;
	//  172  438:iconst_1        
	//  173  439:istore          5
			else
	//* 174  441:aload_0         
	//* 175  442:iload           5
	//* 176  444:invokevirtual   #158 <Method void onShuffleModeChangedDeprecated(boolean)>
	//* 177  447:iconst_1        
	//* 178  448:ireturn         
				flag = false;
	//  179  449:iconst_0        
	//  180  450:istore          5
			onShuffleModeChangedDeprecated(flag);
			return true;

	//* 181  452:goto            441
		case 11: // '\013'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  182  455:aload_2         
	//  183  456:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  184  458:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 185  461:aload_2         
	//* 186  462:invokevirtual   #84  <Method int Parcel.readInt()>
	//* 187  465:ifeq            471
				flag = true;
	//  188  468:iconst_1        
	//  189  469:istore          5
			onCaptioningEnabledChanged(flag);
	//  190  471:aload_0         
	//  191  472:iload           5
	//  192  474:invokevirtual   #161 <Method void onCaptioningEnabledChanged(boolean)>
			return true;
	//  193  477:iconst_1        
	//  194  478:ireturn         

		case 12: // '\f'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  195  479:aload_2         
	//  196  480:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  197  482:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			onShuffleModeChanged(parcel.readInt());
	//  198  485:aload_0         
	//  199  486:aload_2         
	//  200  487:invokevirtual   #84  <Method int Parcel.readInt()>
	//  201  490:invokevirtual   #164 <Method void onShuffleModeChanged(int)>
			return true;
	//  202  493:iconst_1        
	//  203  494:ireturn         
		}
	}

	private static final String DESCRIPTOR = "android.support.v4.media.session.IMediaControllerCallback";
	static final int TRANSACTION_onCaptioningEnabledChanged = 11;
	static final int TRANSACTION_onEvent = 1;
	static final int TRANSACTION_onExtrasChanged = 7;
	static final int TRANSACTION_onMetadataChanged = 4;
	static final int TRANSACTION_onPlaybackStateChanged = 3;
	static final int TRANSACTION_onQueueChanged = 5;
	static final int TRANSACTION_onQueueTitleChanged = 6;
	static final int TRANSACTION_onRepeatModeChanged = 9;
	static final int TRANSACTION_onSessionDestroyed = 2;
	static final int TRANSACTION_onShuffleModeChanged = 12;
	static final int TRANSACTION_onShuffleModeChangedDeprecated = 10;
	static final int TRANSACTION_onVolumeInfoChanged = 8;

	public IMediaControllerCallback$Stub()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "android.support.v4.media.session.IMediaControllerCallback");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//    5    8:invokevirtual   #47  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
