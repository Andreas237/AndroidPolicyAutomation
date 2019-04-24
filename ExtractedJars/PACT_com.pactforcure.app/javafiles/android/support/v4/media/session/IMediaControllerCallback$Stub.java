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
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          5
		switch(i)
	//*   4    6:iload_1         
		{
	//*   5    7:lookupswitch    13: default 120
	//	               1: 138
	//	               2: 182
	//	               3: 194
	//	               4: 232
	//	               5: 270
	//	               6: 289
	//	               7: 327
	//	               8: 365
	//	               9: 403
	//	               10: 419
	//	               11: 443
	//	               12: 471
	//	               1598968902: 130
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    6  120:aload_0         
	//    7  121:iload_1         
	//    8  122:aload_2         
	//    9  123:aload_3         
	//   10  124:iload           4
	//   11  126:invokespecial   #67  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   12  129:ireturn         

		case 1598968902: 
			parcel1.writeString("android.support.v4.media.session.IMediaControllerCallback");
	//   13  130:aload_3         
	//   14  131:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   15  133:invokevirtual   #73  <Method void Parcel.writeString(String)>
			return true;
	//   16  136:iconst_1        
	//   17  137:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   18  138:aload_2         
	//   19  139:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   20  141:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			parcel1 = ((Parcel) (parcel.readString()));
	//   21  144:aload_2         
	//   22  145:invokevirtual   #80  <Method String Parcel.readString()>
	//   23  148:astore_3        
			if(parcel.readInt() != 0)
	//*  24  149:aload_2         
	//*  25  150:invokevirtual   #84  <Method int Parcel.readInt()>
	//*  26  153:ifeq            177
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//   27  156:getstatic       #90  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   28  159:aload_2         
	//   29  160:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   30  165:checkcast       #86  <Class Bundle>
	//   31  168:astore_2        
			else
	//*  32  169:aload_0         
	//*  33  170:aload_3         
	//*  34  171:aload_2         
	//*  35  172:invokevirtual   #100 <Method void onEvent(String, Bundle)>
	//*  36  175:iconst_1        
	//*  37  176:ireturn         
				parcel = null;
	//   38  177:aconst_null     
	//   39  178:astore_2        
			onEvent(((String) (parcel1)), ((Bundle) (parcel)));
			return true;

	//*  40  179:goto            169
		case 2: // '\002'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   41  182:aload_2         
	//   42  183:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   43  185:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			onSessionDestroyed();
	//   44  188:aload_0         
	//   45  189:invokevirtual   #103 <Method void onSessionDestroyed()>
			return true;
	//   46  192:iconst_1        
	//   47  193:ireturn         

		case 3: // '\003'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   48  194:aload_2         
	//   49  195:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   50  197:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  51  200:aload_2         
	//*  52  201:invokevirtual   #84  <Method int Parcel.readInt()>
	//*  53  204:ifeq            227
				parcel = ((Parcel) ((PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(parcel)));
	//   54  207:getstatic       #106 <Field android.os.Parcelable$Creator PlaybackStateCompat.CREATOR>
	//   55  210:aload_2         
	//   56  211:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   57  216:checkcast       #105 <Class PlaybackStateCompat>
	//   58  219:astore_2        
			else
	//*  59  220:aload_0         
	//*  60  221:aload_2         
	//*  61  222:invokevirtual   #110 <Method void onPlaybackStateChanged(PlaybackStateCompat)>
	//*  62  225:iconst_1        
	//*  63  226:ireturn         
				parcel = null;
	//   64  227:aconst_null     
	//   65  228:astore_2        
			onPlaybackStateChanged(((PlaybackStateCompat) (parcel)));
			return true;

	//*  66  229:goto            220
		case 4: // '\004'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   67  232:aload_2         
	//   68  233:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   69  235:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  70  238:aload_2         
	//*  71  239:invokevirtual   #84  <Method int Parcel.readInt()>
	//*  72  242:ifeq            265
				parcel = ((Parcel) ((MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(parcel)));
	//   73  245:getstatic       #113 <Field android.os.Parcelable$Creator MediaMetadataCompat.CREATOR>
	//   74  248:aload_2         
	//   75  249:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   76  254:checkcast       #112 <Class MediaMetadataCompat>
	//   77  257:astore_2        
			else
	//*  78  258:aload_0         
	//*  79  259:aload_2         
	//*  80  260:invokevirtual   #117 <Method void onMetadataChanged(MediaMetadataCompat)>
	//*  81  263:iconst_1        
	//*  82  264:ireturn         
				parcel = null;
	//   83  265:aconst_null     
	//   84  266:astore_2        
			onMetadataChanged(((MediaMetadataCompat) (parcel)));
			return true;

	//*  85  267:goto            258
		case 5: // '\005'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   86  270:aload_2         
	//   87  271:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   88  273:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			onQueueChanged(((List) (parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR))));
	//   89  276:aload_0         
	//   90  277:aload_2         
	//   91  278:getstatic       #120 <Field android.os.Parcelable$Creator MediaSessionCompat$QueueItem.CREATOR>
	//   92  281:invokevirtual   #124 <Method java.util.ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   93  284:invokevirtual   #128 <Method void onQueueChanged(List)>
			return true;
	//   94  287:iconst_1        
	//   95  288:ireturn         

		case 6: // '\006'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//   96  289:aload_2         
	//   97  290:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//   98  292:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//*  99  295:aload_2         
	//* 100  296:invokevirtual   #84  <Method int Parcel.readInt()>
	//* 101  299:ifeq            322
				parcel = ((Parcel) ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel)));
	//  102  302:getstatic       #133 <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//  103  305:aload_2         
	//  104  306:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  105  311:checkcast       #135 <Class CharSequence>
	//  106  314:astore_2        
			else
	//* 107  315:aload_0         
	//* 108  316:aload_2         
	//* 109  317:invokevirtual   #139 <Method void onQueueTitleChanged(CharSequence)>
	//* 110  320:iconst_1        
	//* 111  321:ireturn         
				parcel = null;
	//  112  322:aconst_null     
	//  113  323:astore_2        
			onQueueTitleChanged(((CharSequence) (parcel)));
			return true;

	//* 114  324:goto            315
		case 7: // '\007'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  115  327:aload_2         
	//  116  328:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  117  330:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 118  333:aload_2         
	//* 119  334:invokevirtual   #84  <Method int Parcel.readInt()>
	//* 120  337:ifeq            360
				parcel = ((Parcel) ((Bundle)Bundle.CREATOR.createFromParcel(parcel)));
	//  121  340:getstatic       #90  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  122  343:aload_2         
	//  123  344:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  124  349:checkcast       #86  <Class Bundle>
	//  125  352:astore_2        
			else
	//* 126  353:aload_0         
	//* 127  354:aload_2         
	//* 128  355:invokevirtual   #143 <Method void onExtrasChanged(Bundle)>
	//* 129  358:iconst_1        
	//* 130  359:ireturn         
				parcel = null;
	//  131  360:aconst_null     
	//  132  361:astore_2        
			onExtrasChanged(((Bundle) (parcel)));
			return true;

	//* 133  362:goto            353
		case 8: // '\b'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  134  365:aload_2         
	//  135  366:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  136  368:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 137  371:aload_2         
	//* 138  372:invokevirtual   #84  <Method int Parcel.readInt()>
	//* 139  375:ifeq            398
				parcel = ((Parcel) ((ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(parcel)));
	//  140  378:getstatic       #146 <Field android.os.Parcelable$Creator ParcelableVolumeInfo.CREATOR>
	//  141  381:aload_2         
	//  142  382:invokeinterface #96  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//  143  387:checkcast       #145 <Class ParcelableVolumeInfo>
	//  144  390:astore_2        
			else
	//* 145  391:aload_0         
	//* 146  392:aload_2         
	//* 147  393:invokevirtual   #150 <Method void onVolumeInfoChanged(ParcelableVolumeInfo)>
	//* 148  396:iconst_1        
	//* 149  397:ireturn         
				parcel = null;
	//  150  398:aconst_null     
	//  151  399:astore_2        
			onVolumeInfoChanged(((ParcelableVolumeInfo) (parcel)));
			return true;

	//* 152  400:goto            391
		case 9: // '\t'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  153  403:aload_2         
	//  154  404:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  155  406:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			onRepeatModeChanged(parcel.readInt());
	//  156  409:aload_0         
	//  157  410:aload_2         
	//  158  411:invokevirtual   #84  <Method int Parcel.readInt()>
	//  159  414:invokevirtual   #154 <Method void onRepeatModeChanged(int)>
			return true;
	//  160  417:iconst_1        
	//  161  418:ireturn         

		case 10: // '\n'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  162  419:aload_2         
	//  163  420:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  164  422:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			if(parcel.readInt() != 0)
	//* 165  425:aload_2         
	//* 166  426:invokevirtual   #84  <Method int Parcel.readInt()>
	//* 167  429:ifeq            435
				flag = true;
	//  168  432:iconst_1        
	//  169  433:istore          5
			onShuffleModeChangedDeprecated(flag);
	//  170  435:aload_0         
	//  171  436:iload           5
	//  172  438:invokevirtual   #158 <Method void onShuffleModeChangedDeprecated(boolean)>
			return true;
	//  173  441:iconst_1        
	//  174  442:ireturn         

		case 11: // '\013'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  175  443:aload_2         
	//  176  444:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  177  446:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			boolean flag1 = flag2;
	//  178  449:iload           6
	//  179  451:istore          5
			if(parcel.readInt() != 0)
	//* 180  453:aload_2         
	//* 181  454:invokevirtual   #84  <Method int Parcel.readInt()>
	//* 182  457:ifeq            463
				flag1 = true;
	//  183  460:iconst_1        
	//  184  461:istore          5
			onCaptioningEnabledChanged(flag1);
	//  185  463:aload_0         
	//  186  464:iload           5
	//  187  466:invokevirtual   #161 <Method void onCaptioningEnabledChanged(boolean)>
			return true;
	//  188  469:iconst_1        
	//  189  470:ireturn         

		case 12: // '\f'
			parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
	//  190  471:aload_2         
	//  191  472:ldc1            #14  <String "android.support.v4.media.session.IMediaControllerCallback">
	//  192  474:invokevirtual   #76  <Method void Parcel.enforceInterface(String)>
			onShuffleModeChanged(parcel.readInt());
	//  193  477:aload_0         
	//  194  478:aload_2         
	//  195  479:invokevirtual   #84  <Method int Parcel.readInt()>
	//  196  482:invokevirtual   #164 <Method void onShuffleModeChanged(int)>
			return true;
	//  197  485:iconst_1        
	//  198  486:ireturn         
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
