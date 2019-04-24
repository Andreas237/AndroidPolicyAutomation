// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.*;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.*;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, IMediaControllerCallback, PlaybackStateCompat, ParcelableVolumeInfo

static class MediaSessionCompat$MediaSessionImplBase
	implements MediaSessionCompat.MediaSessionImpl
{
	static final class Command
	{

		public final String command;
		public final Bundle extras;
		public final ResultReceiver stub;

		public Command(String s, Bundle bundle, ResultReceiver resultreceiver)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			command = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field String command>
			extras = bundle;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field Bundle extras>
			stub = resultreceiver;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #27  <Field ResultReceiver stub>
		//   11   19:return          
		}
	}

	class MediaSessionStub extends IMediaSession.Stub
	{

		public void addQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			postToHandler(25, ((Object) (mediadescriptioncompat)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          25
		//    3    6:aload_1         
		//    4    7:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    5   10:return          
		}

		public void addQueueItemAt(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			postToHandler(26, ((Object) (mediadescriptioncompat)), i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          26
		//    3    6:aload_1         
		//    4    7:iload_2         
		//    5    8:invokevirtual   #31  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, int)>
		//    6   11:return          
		}

		public void adjustVolume(int i, int j, String s)
		{
			MediaSessionCompat.MediaSessionImplBase.this.adjustVolume(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #36  <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
		//    5    9:return          
		}

		public void fastForward()
			throws RemoteException
		{
			postToHandler(16);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          16
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public Bundle getExtras()
		{
			Object obj = mLock;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//    3    7:astore_1        
			obj;
		//    4    8:aload_1         
			JVM INSTR monitorenter ;
		//    5    9:monitorenter    
			Bundle bundle = mExtras;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #53  <Field Bundle MediaSessionCompat$MediaSessionImplBase.mExtras>
		//    9   17:astore_2        
			obj;
		//   10   18:aload_1         
			JVM INSTR monitorexit ;
		//   11   19:monitorexit     
			return bundle;
		//   12   20:aload_2         
		//   13   21:areturn         
			Exception exception;
			exception;
		//   14   22:astore_2        
		//*  15   23:aload_1         
			throw exception;
		//   16   24:monitorexit     
		//   17   25:aload_2         
		//   18   26:athrow          
		}

		public long getFlags()
		{
			Object obj = mLock;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//    3    7:astore          4
			obj;
		//    4    9:aload           4
			JVM INSTR monitorenter ;
		//    5   11:monitorenter    
			int i = mFlags;
		//    6   12:aload_0         
		//    7   13:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   16:getfield        #59  <Field int MediaSessionCompat$MediaSessionImplBase.mFlags>
		//    9   19:istore_1        
			long l = i;
		//   10   20:iload_1         
		//   11   21:i2l             
		//   12   22:lstore_2        
			obj;
		//   13   23:aload           4
			JVM INSTR monitorexit ;
		//   14   25:monitorexit     
			return l;
		//   15   26:lload_2         
		//   16   27:lreturn         
			Exception exception;
			exception;
		//   17   28:astore          5
		//*  18   30:aload           4
			throw exception;
		//   19   32:monitorexit     
		//   20   33:aload           5
		//   21   35:athrow          
		}

		public PendingIntent getLaunchPendingIntent()
		{
			Object obj = mLock;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//    3    7:astore_1        
			obj;
		//    4    8:aload_1         
			JVM INSTR monitorenter ;
		//    5    9:monitorenter    
			PendingIntent pendingintent = mSessionActivity;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #65  <Field PendingIntent MediaSessionCompat$MediaSessionImplBase.mSessionActivity>
		//    9   17:astore_2        
			obj;
		//   10   18:aload_1         
			JVM INSTR monitorexit ;
		//   11   19:monitorexit     
			return pendingintent;
		//   12   20:aload_2         
		//   13   21:areturn         
			Exception exception;
			exception;
		//   14   22:astore_2        
		//*  15   23:aload_1         
			throw exception;
		//   16   24:monitorexit     
		//   17   25:aload_2         
		//   18   26:athrow          
		}

		public MediaMetadataCompat getMetadata()
		{
			return mMetadata;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #71  <Field MediaMetadataCompat MediaSessionCompat$MediaSessionImplBase.mMetadata>
		//    3    7:areturn         
		}

		public String getPackageName()
		{
			return mPackageName;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #77  <Field String MediaSessionCompat$MediaSessionImplBase.mPackageName>
		//    3    7:areturn         
		}

		public PlaybackStateCompat getPlaybackState()
		{
			return getStateWithUpdatedPosition();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:invokevirtual   #82  <Method PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.getStateWithUpdatedPosition()>
		//    3    7:areturn         
		}

		public List getQueue()
		{
			Object obj = mLock;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//    3    7:astore_1        
			obj;
		//    4    8:aload_1         
			JVM INSTR monitorenter ;
		//    5    9:monitorenter    
			List list = mQueue;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #88  <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//    9   17:astore_2        
			obj;
		//   10   18:aload_1         
			JVM INSTR monitorexit ;
		//   11   19:monitorexit     
			return list;
		//   12   20:aload_2         
		//   13   21:areturn         
			Exception exception;
			exception;
		//   14   22:astore_2        
		//*  15   23:aload_1         
			throw exception;
		//   16   24:monitorexit     
		//   17   25:aload_2         
		//   18   26:athrow          
		}

		public CharSequence getQueueTitle()
		{
			return mQueueTitle;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #96  <Field CharSequence MediaSessionCompat$MediaSessionImplBase.mQueueTitle>
		//    3    7:areturn         
		}

		public int getRatingType()
		{
			return mRatingType;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #101 <Field int MediaSessionCompat$MediaSessionImplBase.mRatingType>
		//    3    7:ireturn         
		}

		public int getRepeatMode()
		{
			return mRepeatMode;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #105 <Field int MediaSessionCompat$MediaSessionImplBase.mRepeatMode>
		//    3    7:ireturn         
		}

		public String getTag()
		{
			return mTag;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #109 <Field String MediaSessionCompat$MediaSessionImplBase.mTag>
		//    3    7:areturn         
		}

		public ParcelableVolumeInfo getVolumeAttributes()
		{
			Object obj = mLock;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//    3    7:astore          6
			obj;
		//    4    9:aload           6
			JVM INSTR monitorenter ;
		//    5   11:monitorenter    
			int l;
			int i1;
			VolumeProviderCompat volumeprovidercompat;
			l = mVolumeType;
		//    6   12:aload_0         
		//    7   13:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   16:getfield        #114 <Field int MediaSessionCompat$MediaSessionImplBase.mVolumeType>
		//    9   19:istore          4
			i1 = mLocalStream;
		//   10   21:aload_0         
		//   11   22:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   12   25:getfield        #117 <Field int MediaSessionCompat$MediaSessionImplBase.mLocalStream>
		//   13   28:istore          5
			volumeprovidercompat = mVolumeProvider;
		//   14   30:aload_0         
		//   15   31:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   16   34:getfield        #121 <Field VolumeProviderCompat MediaSessionCompat$MediaSessionImplBase.mVolumeProvider>
		//   17   37:astore          7
			if(l != 2)
				break MISSING_BLOCK_LABEL_66;
		//   18   39:iload           4
		//   19   41:iconst_2        
		//   20   42:icmpne          66
			int i;
			int j;
			int k;
			i = volumeprovidercompat.getVolumeControl();
		//   21   45:aload           7
		//   22   47:invokevirtual   #126 <Method int VolumeProviderCompat.getVolumeControl()>
		//   23   50:istore_1        
			j = volumeprovidercompat.getMaxVolume();
		//   24   51:aload           7
		//   25   53:invokevirtual   #129 <Method int VolumeProviderCompat.getMaxVolume()>
		//   26   56:istore_2        
			k = volumeprovidercompat.getCurrentVolume();
		//   27   57:aload           7
		//   28   59:invokevirtual   #132 <Method int VolumeProviderCompat.getCurrentVolume()>
		//   29   62:istore_3        
			break MISSING_BLOCK_LABEL_94;
		//   30   63:goto            94
			i = 2;
		//   31   66:iconst_2        
		//   32   67:istore_1        
			j = mAudioManager.getStreamMaxVolume(i1);
		//   33   68:aload_0         
		//   34   69:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   35   72:getfield        #136 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   36   75:iload           5
		//   37   77:invokevirtual   #142 <Method int AudioManager.getStreamMaxVolume(int)>
		//   38   80:istore_2        
			k = mAudioManager.getStreamVolume(i1);
		//   39   81:aload_0         
		//   40   82:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   41   85:getfield        #136 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   42   88:iload           5
		//   43   90:invokevirtual   #145 <Method int AudioManager.getStreamVolume(int)>
		//   44   93:istore_3        
			obj;
		//   45   94:aload           6
			JVM INSTR monitorexit ;
		//   46   96:monitorexit     
			  goto _L1
		//*  47   97:goto            108
			Exception exception;
			exception;
		//   48  100:astore          7
		//*  49  102:aload           6
			throw exception;
		//   50  104:monitorexit     
		//   51  105:aload           7
		//   52  107:athrow          
_L1:
			return new ParcelableVolumeInfo(l, i1, i, j, k);
		//   53  108:new             #147 <Class ParcelableVolumeInfo>
		//   54  111:dup             
		//   55  112:iload           4
		//   56  114:iload           5
		//   57  116:iload_1         
		//   58  117:iload_2         
		//   59  118:iload_3         
		//   60  119:invokespecial   #150 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   61  122:areturn         
		}

		public boolean isShuffleModeEnabled()
		{
			return mShuffleModeEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #156 <Field boolean MediaSessionCompat$MediaSessionImplBase.mShuffleModeEnabled>
		//    3    7:ireturn         
		}

		public boolean isTransportControlEnabled()
		{
			return (mFlags & 2) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #59  <Field int MediaSessionCompat$MediaSessionImplBase.mFlags>
		//    3    7:iconst_2        
		//    4    8:iand            
		//    5    9:ifeq            14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public void next()
			throws RemoteException
		{
			postToHandler(14);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          14
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void pause()
			throws RemoteException
		{
			postToHandler(12);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          12
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void play()
			throws RemoteException
		{
			postToHandler(7);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          7
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void playFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(8, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          8
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #165 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void playFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(9, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          9
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #165 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void playFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			postToHandler(10, ((Object) (uri)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          10
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #165 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void prepare()
			throws RemoteException
		{
			postToHandler(3);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_3        
		//    3    5:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    8:return          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(4, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_4        
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #165 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   10:return          
		}

		public void prepareFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(5, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_5        
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #165 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   10:return          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			postToHandler(6, ((Object) (uri)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          6
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #165 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void previous()
			throws RemoteException
		{
			postToHandler(15);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          15
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void rate(RatingCompat ratingcompat)
			throws RemoteException
		{
			postToHandler(19, ((Object) (ratingcompat)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          19
		//    3    6:aload_1         
		//    4    7:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    5   10:return          
		}

		public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			if(mDestroyed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #182 <Field boolean MediaSessionCompat$MediaSessionImplBase.mDestroyed>
		//*   3    7:ifeq            19
			{
				try
				{
					imediacontrollercallback.onSessionDestroyed();
		//    4   10:aload_1         
		//    5   11:invokeinterface #187 <Method void IMediaControllerCallback.onSessionDestroyed()>
					return;
		//    6   16:return          
				}
				// Misplaced declaration of an exception variable
				catch(IMediaControllerCallback imediacontrollercallback)
		//*   7   17:astore_1        
				{
					return;
		//    8   18:return          
				}
			} else
			{
				mControllerCallbacks.register(((android.os.IInterface) (imediacontrollercallback)));
		//    9   19:aload_0         
		//   10   20:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   11   23:getfield        #191 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//   12   26:aload_1         
		//   13   27:invokevirtual   #197 <Method boolean RemoteCallbackList.register(android.os.IInterface)>
		//   14   30:pop             
				return;
		//   15   31:return          
			}
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			postToHandler(27, ((Object) (mediadescriptioncompat)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          27
		//    3    6:aload_1         
		//    4    7:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    5   10:return          
		}

		public void removeQueueItemAt(int i)
		{
			postToHandler(28, i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          28
		//    3    6:iload_1         
		//    4    7:invokevirtual   #201 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
		//    5   10:return          
		}

		public void rewind()
			throws RemoteException
		{
			postToHandler(17);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          17
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void seekTo(long l)
			throws RemoteException
		{
			postToHandler(18, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          18
		//    3    6:lload_1         
		//    4    7:invokestatic    #210 <Method Long Long.valueOf(long)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void sendCommand(String s, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultreceiverwrapper)
		{
			postToHandler(1, ((Object) (new Command(s, bundle, MediaSessionCompat.ResultReceiverWrapper.access$100(resultreceiverwrapper)))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_1        
		//    3    5:new             #214 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokestatic    #220 <Method ResultReceiver MediaSessionCompat$ResultReceiverWrapper.access$100(MediaSessionCompat$ResultReceiverWrapper)>
		//    9   15:invokespecial   #223 <Method void MediaSessionCompat$MediaSessionImplBase$Command(String, Bundle, ResultReceiver)>
		//   10   18:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//   11   21:return          
		}

		public void sendCustomAction(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(20, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          20
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #165 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public boolean sendMediaButton(KeyEvent keyevent)
		{
			boolean flag;
			if((mFlags & 1) != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #59  <Field int MediaSessionCompat$MediaSessionImplBase.mFlags>
		//*   3    7:iconst_1        
		//*   4    8:iand            
		//*   5    9:ifeq            17
				flag = true;
		//    6   12:iconst_1        
		//    7   13:istore_2        
			else
		//*   8   14:goto            19
				flag = false;
		//    9   17:iconst_0        
		//   10   18:istore_2        
			if(flag)
		//*  11   19:iload_2         
		//*  12   20:ifeq            33
				postToHandler(21, ((Object) (keyevent)));
		//   13   23:aload_0         
		//   14   24:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   15   27:bipush          21
		//   16   29:aload_1         
		//   17   30:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
			return flag;
		//   18   33:iload_2         
		//   19   34:ireturn         
		}

		public void setRepeatMode(int i)
			throws RemoteException
		{
			postToHandler(23, i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          23
		//    3    6:iload_1         
		//    4    7:invokevirtual   #201 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
		//    5   10:return          
		}

		public void setShuffleModeEnabled(boolean flag)
			throws RemoteException
		{
			postToHandler(24, ((Object) (Boolean.valueOf(flag))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          24
		//    3    6:iload_1         
		//    4    7:invokestatic    #234 <Method Boolean Boolean.valueOf(boolean)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void setVolumeTo(int i, int j, String s)
		{
			MediaSessionCompat.MediaSessionImplBase.this.setVolumeTo(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #237 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
		//    5    9:return          
		}

		public void skipToQueueItem(long l)
		{
			postToHandler(11, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          11
		//    3    6:lload_1         
		//    4    7:invokestatic    #210 <Method Long Long.valueOf(long)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void stop()
			throws RemoteException
		{
			postToHandler(13);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          13
		//    3    6:invokevirtual   #42  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int)>
		//    4    9:return          
		}

		public void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			mControllerCallbacks.unregister(((android.os.IInterface) (imediacontrollercallback)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #191 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #243 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
		//    5   11:pop             
		//    6   12:return          
		}

		final MediaSessionCompat.MediaSessionImplBase this$0;

		MediaSessionStub()
		{
			this$0 = MediaSessionCompat.MediaSessionImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void IMediaSession$Stub()>
		//    5    9:return          
		}
	}

	class MessageHandler extends Handler
	{

		private void onMediaButtonEvent(KeyEvent keyevent, MediaSessionCompat.Callback callback)
		{
			if(keyevent == null || keyevent.getAction() != 0)
		//*   0    0:aload_1         
		//*   1    1:ifnull          11
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #89  <Method int KeyEvent.getAction()>
		//*   4    8:ifeq            12
				return;
		//    5   11:return          
			long l;
			if(mState == null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   8   16:getfield        #93  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//*   9   19:ifnonnull       28
				l = 0L;
		//   10   22:lconst_0        
		//   11   23:lstore          6
			else
		//*  12   25:goto            40
				l = mState.getActions();
		//   13   28:aload_0         
		//   14   29:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   15   32:getfield        #93  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//   16   35:invokevirtual   #99  <Method long PlaybackStateCompat.getActions()>
		//   17   38:lstore          6
			switch(keyevent.getKeyCode())
		//*  18   40:aload_1         
		//*  19   41:invokevirtual   #102 <Method int KeyEvent.getKeyCode()>
			{
		//*  20   44:lookupswitch    9: default 128
		//		               79: 239
		//		               85: 239
		//		               86: 193
		//		               87: 161
		//		               88: 177
		//		               89: 223
		//		               90: 207
		//		               126: 129
		//		               127: 145
			default:
				return;
		//   21  128:return          

			case 126: // '~'
				if((4L & l) != 0L)
		//*  22  129:ldc2w           #103 <Long 4L>
		//*  23  132:lload           6
		//*  24  134:land            
		//*  25  135:lconst_0        
		//*  26  136:lcmp            
		//*  27  137:ifeq            337
				{
					callback.onPlay();
		//   28  140:aload_2         
		//   29  141:invokevirtual   #110 <Method void MediaSessionCompat$Callback.onPlay()>
					return;
		//   30  144:return          
				}
				break;

			case 127: // '\177'
				if((2L & l) != 0L)
		//*  31  145:ldc2w           #111 <Long 2L>
		//*  32  148:lload           6
		//*  33  150:land            
		//*  34  151:lconst_0        
		//*  35  152:lcmp            
		//*  36  153:ifeq            337
				{
					callback.onPause();
		//   37  156:aload_2         
		//   38  157:invokevirtual   #115 <Method void MediaSessionCompat$Callback.onPause()>
					return;
		//   39  160:return          
				}
				break;

			case 87: // 'W'
				if((32L & l) != 0L)
		//*  40  161:ldc2w           #116 <Long 32L>
		//*  41  164:lload           6
		//*  42  166:land            
		//*  43  167:lconst_0        
		//*  44  168:lcmp            
		//*  45  169:ifeq            337
				{
					callback.onSkipToNext();
		//   46  172:aload_2         
		//   47  173:invokevirtual   #120 <Method void MediaSessionCompat$Callback.onSkipToNext()>
					return;
		//   48  176:return          
				}
				break;

			case 88: // 'X'
				if((16L & l) != 0L)
		//*  49  177:ldc2w           #121 <Long 16L>
		//*  50  180:lload           6
		//*  51  182:land            
		//*  52  183:lconst_0        
		//*  53  184:lcmp            
		//*  54  185:ifeq            337
				{
					callback.onSkipToPrevious();
		//   55  188:aload_2         
		//   56  189:invokevirtual   #125 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
					return;
		//   57  192:return          
				}
				break;

			case 86: // 'V'
				if((1L & l) != 0L)
		//*  58  193:lconst_1        
		//*  59  194:lload           6
		//*  60  196:land            
		//*  61  197:lconst_0        
		//*  62  198:lcmp            
		//*  63  199:ifeq            337
				{
					callback.onStop();
		//   64  202:aload_2         
		//   65  203:invokevirtual   #128 <Method void MediaSessionCompat$Callback.onStop()>
					return;
		//   66  206:return          
				}
				break;

			case 90: // 'Z'
				if((64L & l) != 0L)
		//*  67  207:ldc2w           #129 <Long 64L>
		//*  68  210:lload           6
		//*  69  212:land            
		//*  70  213:lconst_0        
		//*  71  214:lcmp            
		//*  72  215:ifeq            337
				{
					callback.onFastForward();
		//   73  218:aload_2         
		//   74  219:invokevirtual   #133 <Method void MediaSessionCompat$Callback.onFastForward()>
					return;
		//   75  222:return          
				}
				break;

			case 89: // 'Y'
				if((8L & l) != 0L)
		//*  76  223:ldc2w           #134 <Long 8L>
		//*  77  226:lload           6
		//*  78  228:land            
		//*  79  229:lconst_0        
		//*  80  230:lcmp            
		//*  81  231:ifeq            337
				{
					callback.onRewind();
		//   82  234:aload_2         
		//   83  235:invokevirtual   #138 <Method void MediaSessionCompat$Callback.onRewind()>
					return;
		//   84  238:return          
				}
				break;

			case 79: // 'O'
			case 85: // 'U'
				boolean flag;
				if(mState != null && mState.getState() == 3)
		//*  85  239:aload_0         
		//*  86  240:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*  87  243:getfield        #93  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//*  88  246:ifnull          268
		//*  89  249:aload_0         
		//*  90  250:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*  91  253:getfield        #93  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//*  92  256:invokevirtual   #141 <Method int PlaybackStateCompat.getState()>
		//*  93  259:iconst_3        
		//*  94  260:icmpne          268
					flag = true;
		//   95  263:iconst_1        
		//   96  264:istore_3        
				else
		//*  97  265:goto            270
					flag = false;
		//   98  268:iconst_0        
		//   99  269:istore_3        
				boolean flag1;
				if((516L & l) != 0L)
		//* 100  270:ldc2w           #142 <Long 516L>
		//* 101  273:lload           6
		//* 102  275:land            
		//* 103  276:lconst_0        
		//* 104  277:lcmp            
		//* 105  278:ifeq            287
					flag1 = true;
		//  106  281:iconst_1        
		//  107  282:istore          4
				else
		//* 108  284:goto            290
					flag1 = false;
		//  109  287:iconst_0        
		//  110  288:istore          4
				boolean flag2;
				if((514L & l) != 0L)
		//* 111  290:ldc2w           #144 <Long 514L>
		//* 112  293:lload           6
		//* 113  295:land            
		//* 114  296:lconst_0        
		//* 115  297:lcmp            
		//* 116  298:ifeq            307
					flag2 = true;
		//  117  301:iconst_1        
		//  118  302:istore          5
				else
		//* 119  304:goto            310
					flag2 = false;
		//  120  307:iconst_0        
		//  121  308:istore          5
				if(flag && flag2)
		//* 122  310:iload_3         
		//* 123  311:ifeq            324
		//* 124  314:iload           5
		//* 125  316:ifeq            324
				{
					callback.onPause();
		//  126  319:aload_2         
		//  127  320:invokevirtual   #115 <Method void MediaSessionCompat$Callback.onPause()>
					return;
		//  128  323:return          
				}
				if(!flag && flag1)
		//* 129  324:iload_3         
		//* 130  325:ifne            337
		//* 131  328:iload           4
		//* 132  330:ifeq            337
					callback.onPlay();
		//  133  333:aload_2         
		//  134  334:invokevirtual   #110 <Method void MediaSessionCompat$Callback.onPlay()>
				break;
			}
		//  135  337:return          
		}

		public void handleMessage(Message message)
		{
			MediaSessionCompat.Callback callback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #151 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
		//    3    7:astore_2        
			if(callback == null)
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       13
				return;
		//    6   12:return          
			switch(message.what)
		//*   7   13:aload_1         
		//*   8   14:getfield        #156 <Field int Message.what>
			{
		//*   9   17:tableswitch     1 28: default 144
		//		               1 145
		//		               2 454
		//		               3 211
		//		               4 216
		//		               5 232
		//		               6 248
		//		               7 264
		//		               8 269
		//		               9 285
		//		               10 301
		//		               11 317
		//		               12 332
		//		               13 337
		//		               14 342
		//		               15 347
		//		               16 352
		//		               17 357
		//		               18 362
		//		               19 377
		//		               20 389
		//		               21 170
		//		               22 467
		//		               23 480
		//		               24 489
		//		               25 405
		//		               26 417
		//		               27 433
		//		               28 445
			default:
				return;
		//   10  144:return          

			case 1: // '\001'
				message = ((Message) ((Command)message.obj));
		//   11  145:aload_1         
		//   12  146:getfield        #160 <Field Object Message.obj>
		//   13  149:checkcast       #162 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//   14  152:astore_1        
				callback.onCommand(((Command) (message)).command, ((Command) (message)).extras, ((Command) (message)).stub);
		//   15  153:aload_2         
		//   16  154:aload_1         
		//   17  155:getfield        #166 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
		//   18  158:aload_1         
		//   19  159:getfield        #170 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
		//   20  162:aload_1         
		//   21  163:getfield        #174 <Field ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
		//   22  166:invokevirtual   #178 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
				return;
		//   23  169:return          

			case 21: // '\025'
				message = ((Message) ((KeyEvent)message.obj));
		//   24  170:aload_1         
		//   25  171:getfield        #160 <Field Object Message.obj>
		//   26  174:checkcast       #85  <Class KeyEvent>
		//   27  177:astore_1        
				Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
		//   28  178:new             #180 <Class Intent>
		//   29  181:dup             
		//   30  182:ldc1            #182 <String "android.intent.action.MEDIA_BUTTON">
		//   31  184:invokespecial   #185 <Method void Intent(String)>
		//   32  187:astore_3        
				intent.putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (message)));
		//   33  188:aload_3         
		//   34  189:ldc1            #187 <String "android.intent.extra.KEY_EVENT">
		//   35  191:aload_1         
		//   36  192:invokevirtual   #191 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//   37  195:pop             
				if(!callback.onMediaButtonEvent(intent))
		//*  38  196:aload_2         
		//*  39  197:aload_3         
		//*  40  198:invokevirtual   #194 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//*  41  201:ifne            503
				{
					onMediaButtonEvent(((KeyEvent) (message)), callback);
		//   42  204:aload_0         
		//   43  205:aload_1         
		//   44  206:aload_2         
		//   45  207:invokespecial   #196 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
					return;
		//   46  210:return          
				}
				break;

			case 3: // '\003'
				callback.onPrepare();
		//   47  211:aload_2         
		//   48  212:invokevirtual   #199 <Method void MediaSessionCompat$Callback.onPrepare()>
				return;
		//   49  215:return          

			case 4: // '\004'
				callback.onPrepareFromMediaId((String)message.obj, message.getData());
		//   50  216:aload_2         
		//   51  217:aload_1         
		//   52  218:getfield        #160 <Field Object Message.obj>
		//   53  221:checkcast       #201 <Class String>
		//   54  224:aload_1         
		//   55  225:invokevirtual   #205 <Method Bundle Message.getData()>
		//   56  228:invokevirtual   #209 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
				return;
		//   57  231:return          

			case 5: // '\005'
				callback.onPrepareFromSearch((String)message.obj, message.getData());
		//   58  232:aload_2         
		//   59  233:aload_1         
		//   60  234:getfield        #160 <Field Object Message.obj>
		//   61  237:checkcast       #201 <Class String>
		//   62  240:aload_1         
		//   63  241:invokevirtual   #205 <Method Bundle Message.getData()>
		//   64  244:invokevirtual   #212 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
				return;
		//   65  247:return          

			case 6: // '\006'
				callback.onPrepareFromUri((Uri)message.obj, message.getData());
		//   66  248:aload_2         
		//   67  249:aload_1         
		//   68  250:getfield        #160 <Field Object Message.obj>
		//   69  253:checkcast       #214 <Class Uri>
		//   70  256:aload_1         
		//   71  257:invokevirtual   #205 <Method Bundle Message.getData()>
		//   72  260:invokevirtual   #218 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
				return;
		//   73  263:return          

			case 7: // '\007'
				callback.onPlay();
		//   74  264:aload_2         
		//   75  265:invokevirtual   #110 <Method void MediaSessionCompat$Callback.onPlay()>
				return;
		//   76  268:return          

			case 8: // '\b'
				callback.onPlayFromMediaId((String)message.obj, message.getData());
		//   77  269:aload_2         
		//   78  270:aload_1         
		//   79  271:getfield        #160 <Field Object Message.obj>
		//   80  274:checkcast       #201 <Class String>
		//   81  277:aload_1         
		//   82  278:invokevirtual   #205 <Method Bundle Message.getData()>
		//   83  281:invokevirtual   #221 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
				return;
		//   84  284:return          

			case 9: // '\t'
				callback.onPlayFromSearch((String)message.obj, message.getData());
		//   85  285:aload_2         
		//   86  286:aload_1         
		//   87  287:getfield        #160 <Field Object Message.obj>
		//   88  290:checkcast       #201 <Class String>
		//   89  293:aload_1         
		//   90  294:invokevirtual   #205 <Method Bundle Message.getData()>
		//   91  297:invokevirtual   #224 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
				return;
		//   92  300:return          

			case 10: // '\n'
				callback.onPlayFromUri((Uri)message.obj, message.getData());
		//   93  301:aload_2         
		//   94  302:aload_1         
		//   95  303:getfield        #160 <Field Object Message.obj>
		//   96  306:checkcast       #214 <Class Uri>
		//   97  309:aload_1         
		//   98  310:invokevirtual   #205 <Method Bundle Message.getData()>
		//   99  313:invokevirtual   #227 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
				return;
		//  100  316:return          

			case 11: // '\013'
				callback.onSkipToQueueItem(((Long)message.obj).longValue());
		//  101  317:aload_2         
		//  102  318:aload_1         
		//  103  319:getfield        #160 <Field Object Message.obj>
		//  104  322:checkcast       #229 <Class Long>
		//  105  325:invokevirtual   #232 <Method long Long.longValue()>
		//  106  328:invokevirtual   #236 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
				return;
		//  107  331:return          

			case 12: // '\f'
				callback.onPause();
		//  108  332:aload_2         
		//  109  333:invokevirtual   #115 <Method void MediaSessionCompat$Callback.onPause()>
				return;
		//  110  336:return          

			case 13: // '\r'
				callback.onStop();
		//  111  337:aload_2         
		//  112  338:invokevirtual   #128 <Method void MediaSessionCompat$Callback.onStop()>
				return;
		//  113  341:return          

			case 14: // '\016'
				callback.onSkipToNext();
		//  114  342:aload_2         
		//  115  343:invokevirtual   #120 <Method void MediaSessionCompat$Callback.onSkipToNext()>
				return;
		//  116  346:return          

			case 15: // '\017'
				callback.onSkipToPrevious();
		//  117  347:aload_2         
		//  118  348:invokevirtual   #125 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
				return;
		//  119  351:return          

			case 16: // '\020'
				callback.onFastForward();
		//  120  352:aload_2         
		//  121  353:invokevirtual   #133 <Method void MediaSessionCompat$Callback.onFastForward()>
				return;
		//  122  356:return          

			case 17: // '\021'
				callback.onRewind();
		//  123  357:aload_2         
		//  124  358:invokevirtual   #138 <Method void MediaSessionCompat$Callback.onRewind()>
				return;
		//  125  361:return          

			case 18: // '\022'
				callback.onSeekTo(((Long)message.obj).longValue());
		//  126  362:aload_2         
		//  127  363:aload_1         
		//  128  364:getfield        #160 <Field Object Message.obj>
		//  129  367:checkcast       #229 <Class Long>
		//  130  370:invokevirtual   #232 <Method long Long.longValue()>
		//  131  373:invokevirtual   #239 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
				return;
		//  132  376:return          

			case 19: // '\023'
				callback.onSetRating((RatingCompat)message.obj);
		//  133  377:aload_2         
		//  134  378:aload_1         
		//  135  379:getfield        #160 <Field Object Message.obj>
		//  136  382:checkcast       #241 <Class RatingCompat>
		//  137  385:invokevirtual   #245 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
				return;
		//  138  388:return          

			case 20: // '\024'
				callback.onCustomAction((String)message.obj, message.getData());
		//  139  389:aload_2         
		//  140  390:aload_1         
		//  141  391:getfield        #160 <Field Object Message.obj>
		//  142  394:checkcast       #201 <Class String>
		//  143  397:aload_1         
		//  144  398:invokevirtual   #205 <Method Bundle Message.getData()>
		//  145  401:invokevirtual   #248 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
				return;
		//  146  404:return          

			case 25: // '\031'
				callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
		//  147  405:aload_2         
		//  148  406:aload_1         
		//  149  407:getfield        #160 <Field Object Message.obj>
		//  150  410:checkcast       #250 <Class MediaDescriptionCompat>
		//  151  413:invokevirtual   #254 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
				return;
		//  152  416:return          

			case 26: // '\032'
				callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
		//  153  417:aload_2         
		//  154  418:aload_1         
		//  155  419:getfield        #160 <Field Object Message.obj>
		//  156  422:checkcast       #250 <Class MediaDescriptionCompat>
		//  157  425:aload_1         
		//  158  426:getfield        #257 <Field int Message.arg1>
		//  159  429:invokevirtual   #260 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
				return;
		//  160  432:return          

			case 27: // '\033'
				callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
		//  161  433:aload_2         
		//  162  434:aload_1         
		//  163  435:getfield        #160 <Field Object Message.obj>
		//  164  438:checkcast       #250 <Class MediaDescriptionCompat>
		//  165  441:invokevirtual   #263 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
				return;
		//  166  444:return          

			case 28: // '\034'
				callback.onRemoveQueueItemAt(message.arg1);
		//  167  445:aload_2         
		//  168  446:aload_1         
		//  169  447:getfield        #257 <Field int Message.arg1>
		//  170  450:invokevirtual   #267 <Method void MediaSessionCompat$Callback.onRemoveQueueItemAt(int)>
				return;
		//  171  453:return          

			case 2: // '\002'
				adjustVolume(message.arg1, 0);
		//  172  454:aload_0         
		//  173  455:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  174  458:aload_1         
		//  175  459:getfield        #257 <Field int Message.arg1>
		//  176  462:iconst_0        
		//  177  463:invokevirtual   #271 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
				return;
		//  178  466:return          

			case 22: // '\026'
				setVolumeTo(message.arg1, 0);
		//  179  467:aload_0         
		//  180  468:getfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  181  471:aload_1         
		//  182  472:getfield        #257 <Field int Message.arg1>
		//  183  475:iconst_0        
		//  184  476:invokevirtual   #274 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
				return;
		//  185  479:return          

			case 23: // '\027'
				callback.onSetRepeatMode(message.arg1);
		//  186  480:aload_2         
		//  187  481:aload_1         
		//  188  482:getfield        #257 <Field int Message.arg1>
		//  189  485:invokevirtual   #277 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
				return;
		//  190  488:return          

			case 24: // '\030'
				callback.onSetShuffleModeEnabled(((Boolean)message.obj).booleanValue());
		//  191  489:aload_2         
		//  192  490:aload_1         
		//  193  491:getfield        #160 <Field Object Message.obj>
		//  194  494:checkcast       #279 <Class Boolean>
		//  195  497:invokevirtual   #283 <Method boolean Boolean.booleanValue()>
		//  196  500:invokevirtual   #287 <Method void MediaSessionCompat$Callback.onSetShuffleModeEnabled(boolean)>
				break;
			}
		//  197  503:return          
		}

		public void post(int i)
		{
			post(i, ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aconst_null     
		//    3    3:invokevirtual   #291 <Method void post(int, Object)>
		//    4    6:return          
		}

		public void post(int i, Object obj)
		{
			obtainMessage(i, obj).sendToTarget();
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #295 <Method Message obtainMessage(int, Object)>
		//    4    6:invokevirtual   #298 <Method void Message.sendToTarget()>
		//    5    9:return          
		}

		public void post(int i, Object obj, int j)
		{
			obtainMessage(i, j, 0, obj).sendToTarget();
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_3         
		//    3    3:iconst_0        
		//    4    4:aload_2         
		//    5    5:invokevirtual   #302 <Method Message obtainMessage(int, int, int, Object)>
		//    6    8:invokevirtual   #298 <Method void Message.sendToTarget()>
		//    7   11:return          
		}

		public void post(int i, Object obj, Bundle bundle)
		{
			obj = ((Object) (obtainMessage(i, obj)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #295 <Method Message obtainMessage(int, Object)>
		//    4    6:astore_2        
			((Message) (obj)).setData(bundle);
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #307 <Method void Message.setData(Bundle)>
			((Message) (obj)).sendToTarget();
		//    8   12:aload_2         
		//    9   13:invokevirtual   #298 <Method void Message.sendToTarget()>
		//   10   16:return          
		}

		private static final int KEYCODE_MEDIA_PAUSE = 127;
		private static final int KEYCODE_MEDIA_PLAY = 126;
		private static final int MSG_ADD_QUEUE_ITEM = 25;
		private static final int MSG_ADD_QUEUE_ITEM_AT = 26;
		private static final int MSG_ADJUST_VOLUME = 2;
		private static final int MSG_COMMAND = 1;
		private static final int MSG_CUSTOM_ACTION = 20;
		private static final int MSG_FAST_FORWARD = 16;
		private static final int MSG_MEDIA_BUTTON = 21;
		private static final int MSG_NEXT = 14;
		private static final int MSG_PAUSE = 12;
		private static final int MSG_PLAY = 7;
		private static final int MSG_PLAY_MEDIA_ID = 8;
		private static final int MSG_PLAY_SEARCH = 9;
		private static final int MSG_PLAY_URI = 10;
		private static final int MSG_PREPARE = 3;
		private static final int MSG_PREPARE_MEDIA_ID = 4;
		private static final int MSG_PREPARE_SEARCH = 5;
		private static final int MSG_PREPARE_URI = 6;
		private static final int MSG_PREVIOUS = 15;
		private static final int MSG_RATE = 19;
		private static final int MSG_REMOVE_QUEUE_ITEM = 27;
		private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
		private static final int MSG_REWIND = 17;
		private static final int MSG_SEEK_TO = 18;
		private static final int MSG_SET_REPEAT_MODE = 23;
		private static final int MSG_SET_SHUFFLE_MODE_ENABLED = 24;
		private static final int MSG_SET_VOLUME = 22;
		private static final int MSG_SKIP_TO_ITEM = 11;
		private static final int MSG_STOP = 13;
		final MediaSessionCompat.MediaSessionImplBase this$0;

		public MessageHandler(Looper looper)
		{
			this$0 = MediaSessionCompat.MediaSessionImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #77  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #80  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}


	private void sendEvent(String s, Bundle bundle)
	{
		for(int i = mControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//*   2    4:invokevirtual   #166 <Method int RemoteCallbackList.beginBroadcast()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            48
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #170 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #172 <Class IMediaControllerCallback>
	//   13   25:astore          4
			try
			{
				imediacontrollercallback.onEvent(s, bundle);
	//   14   27:aload           4
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokeinterface #175 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
			}
	//*  18   36:goto            41
			catch(RemoteException remoteexception) { }
	//   19   39:astore          4
		}

	//   20   41:iload_3         
	//   21   42:iconst_1        
	//   22   43:isub            
	//   23   44:istore_3        
	//*  24   45:goto            10
		mControllerCallbacks.finishBroadcast();
	//   25   48:aload_0         
	//   26   49:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   27   52:invokevirtual   #178 <Method void RemoteCallbackList.finishBroadcast()>
	//   28   55:return          
	}

	private void sendExtras(Bundle bundle)
	{
		for(int i = mControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//*   2    4:invokevirtual   #166 <Method int RemoteCallbackList.beginBroadcast()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            44
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #170 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #172 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onExtrasChanged(bundle);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #183 <Method void IMediaControllerCallback.onExtrasChanged(Bundle)>
			}
	//*  17   33:goto            37
			catch(RemoteException remoteexception) { }
	//   18   36:astore_3        
		}

	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:istore_2        
	//*  23   41:goto            10
		mControllerCallbacks.finishBroadcast();
	//   24   44:aload_0         
	//   25   45:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   26   48:invokevirtual   #178 <Method void RemoteCallbackList.finishBroadcast()>
	//   27   51:return          
	}

	private void sendMetadata(MediaMetadataCompat mediametadatacompat)
	{
		for(int i = mControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//*   2    4:invokevirtual   #166 <Method int RemoteCallbackList.beginBroadcast()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            44
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #170 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #172 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onMetadataChanged(mediametadatacompat);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #188 <Method void IMediaControllerCallback.onMetadataChanged(MediaMetadataCompat)>
			}
	//*  17   33:goto            37
			catch(RemoteException remoteexception) { }
	//   18   36:astore_3        
		}

	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:istore_2        
	//*  23   41:goto            10
		mControllerCallbacks.finishBroadcast();
	//   24   44:aload_0         
	//   25   45:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   26   48:invokevirtual   #178 <Method void RemoteCallbackList.finishBroadcast()>
	//   27   51:return          
	}

	private void sendQueue(List list)
	{
		for(int i = mControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//*   2    4:invokevirtual   #166 <Method int RemoteCallbackList.beginBroadcast()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            44
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #170 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #172 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onQueueChanged(list);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #193 <Method void IMediaControllerCallback.onQueueChanged(List)>
			}
	//*  17   33:goto            37
			catch(RemoteException remoteexception) { }
	//   18   36:astore_3        
		}

	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:istore_2        
	//*  23   41:goto            10
		mControllerCallbacks.finishBroadcast();
	//   24   44:aload_0         
	//   25   45:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   26   48:invokevirtual   #178 <Method void RemoteCallbackList.finishBroadcast()>
	//   27   51:return          
	}

	private void sendQueueTitle(CharSequence charsequence)
	{
		for(int i = mControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//*   2    4:invokevirtual   #166 <Method int RemoteCallbackList.beginBroadcast()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            44
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #170 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #172 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onQueueTitleChanged(charsequence);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #200 <Method void IMediaControllerCallback.onQueueTitleChanged(CharSequence)>
			}
	//*  17   33:goto            37
			catch(RemoteException remoteexception) { }
	//   18   36:astore_3        
		}

	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:istore_2        
	//*  23   41:goto            10
		mControllerCallbacks.finishBroadcast();
	//   24   44:aload_0         
	//   25   45:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   26   48:invokevirtual   #178 <Method void RemoteCallbackList.finishBroadcast()>
	//   27   51:return          
	}

	private void sendRepeatMode(int i)
	{
		for(int j = mControllerCallbacks.beginBroadcast() - 1; j >= 0; j--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//*   2    4:invokevirtual   #166 <Method int RemoteCallbackList.beginBroadcast()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            44
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
	//    8   14:aload_0         
	//    9   15:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #170 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #172 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onRepeatModeChanged(i);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #205 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
			}
	//*  17   33:goto            37
			catch(RemoteException remoteexception) { }
	//   18   36:astore_3        
		}

	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:istore_2        
	//*  23   41:goto            10
		mControllerCallbacks.finishBroadcast();
	//   24   44:aload_0         
	//   25   45:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   26   48:invokevirtual   #178 <Method void RemoteCallbackList.finishBroadcast()>
	//   27   51:return          
	}

	private void sendSessionDestroyed()
	{
		for(int i = mControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//*   2    4:invokevirtual   #166 <Method int RemoteCallbackList.beginBroadcast()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            43
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #170 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #172 <Class IMediaControllerCallback>
	//   13   25:astore_2        
			try
			{
				imediacontrollercallback.onSessionDestroyed();
	//   14   26:aload_2         
	//   15   27:invokeinterface #209 <Method void IMediaControllerCallback.onSessionDestroyed()>
			}
	//*  16   32:goto            36
			catch(RemoteException remoteexception) { }
	//   17   35:astore_2        
		}

	//   18   36:iload_1         
	//   19   37:iconst_1        
	//   20   38:isub            
	//   21   39:istore_1        
	//*  22   40:goto            10
		mControllerCallbacks.finishBroadcast();
	//   23   43:aload_0         
	//   24   44:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   25   47:invokevirtual   #178 <Method void RemoteCallbackList.finishBroadcast()>
		mControllerCallbacks.kill();
	//   26   50:aload_0         
	//   27   51:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   28   54:invokevirtual   #212 <Method void RemoteCallbackList.kill()>
	//   29   57:return          
	}

	private void sendShuffleModeEnabled(boolean flag)
	{
		for(int i = mControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//*   2    4:invokevirtual   #166 <Method int RemoteCallbackList.beginBroadcast()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            44
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #170 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #172 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onShuffleModeChanged(flag);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #217 <Method void IMediaControllerCallback.onShuffleModeChanged(boolean)>
			}
	//*  17   33:goto            37
			catch(RemoteException remoteexception) { }
	//   18   36:astore_3        
		}

	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:istore_2        
	//*  23   41:goto            10
		mControllerCallbacks.finishBroadcast();
	//   24   44:aload_0         
	//   25   45:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   26   48:invokevirtual   #178 <Method void RemoteCallbackList.finishBroadcast()>
	//   27   51:return          
	}

	private void sendState(PlaybackStateCompat playbackstatecompat)
	{
		for(int i = mControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//*   2    4:invokevirtual   #166 <Method int RemoteCallbackList.beginBroadcast()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            44
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #170 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #172 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onPlaybackStateChanged(playbackstatecompat);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #222 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
			}
	//*  17   33:goto            37
			catch(RemoteException remoteexception) { }
	//   18   36:astore_3        
		}

	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:istore_2        
	//*  23   41:goto            10
		mControllerCallbacks.finishBroadcast();
	//   24   44:aload_0         
	//   25   45:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   26   48:invokevirtual   #178 <Method void RemoteCallbackList.finishBroadcast()>
	//   27   51:return          
	}

	void adjustVolume(int i, int j)
	{
		if(mVolumeType == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field int mVolumeType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          24
		{
			if(mVolumeProvider != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//*   6   12:ifnull          37
			{
				mVolumeProvider.onAdjustVolume(i);
	//    7   15:aload_0         
	//    8   16:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #231 <Method void VolumeProviderCompat.onAdjustVolume(int)>
				return;
	//   11   23:return          
			}
		} else
		{
			mAudioManager.adjustStreamVolume(mLocalStream, i, j);
	//   12   24:aload_0         
	//   13   25:getfield        #128 <Field AudioManager mAudioManager>
	//   14   28:aload_0         
	//   15   29:getfield        #150 <Field int mLocalStream>
	//   16   32:iload_1         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #235 <Method void AudioManager.adjustStreamVolume(int, int, int)>
		}
	//   19   37:return          
	}

	android.media.RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle)
	{
		android.media.RemoteControlClient.MetadataEditor metadataeditor = mRcc.editMetadata(true);
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field RemoteControlClient mRcc>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #241 <Method android.media.RemoteControlClient$MetadataEditor RemoteControlClient.editMetadata(boolean)>
	//    4    8:astore_2        
		if(bundle == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       15
			return metadataeditor;
	//    7   13:aload_2         
	//    8   14:areturn         
		if(bundle.containsKey("android.media.metadata.ART"))
	//*   9   15:aload_1         
	//*  10   16:ldc1            #243 <String "android.media.metadata.ART">
	//*  11   18:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//*  12   21:ifeq            43
			metadataeditor.putBitmap(100, (Bitmap)bundle.getParcelable("android.media.metadata.ART"));
	//   13   24:aload_2         
	//   14   25:bipush          100
	//   15   27:aload_1         
	//   16   28:ldc1            #243 <String "android.media.metadata.ART">
	//   17   30:invokevirtual   #253 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   18   33:checkcast       #255 <Class Bitmap>
	//   19   36:invokevirtual   #261 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
	//   20   39:pop             
		else
	//*  21   40:goto            70
		if(bundle.containsKey("android.media.metadata.ALBUM_ART"))
	//*  22   43:aload_1         
	//*  23   44:ldc2            #263 <String "android.media.metadata.ALBUM_ART">
	//*  24   47:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//*  25   50:ifeq            70
			metadataeditor.putBitmap(100, (Bitmap)bundle.getParcelable("android.media.metadata.ALBUM_ART"));
	//   26   53:aload_2         
	//   27   54:bipush          100
	//   28   56:aload_1         
	//   29   57:ldc2            #263 <String "android.media.metadata.ALBUM_ART">
	//   30   60:invokevirtual   #253 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   31   63:checkcast       #255 <Class Bitmap>
	//   32   66:invokevirtual   #261 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
	//   33   69:pop             
		if(bundle.containsKey("android.media.metadata.ALBUM"))
	//*  34   70:aload_1         
	//*  35   71:ldc2            #265 <String "android.media.metadata.ALBUM">
	//*  36   74:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//*  37   77:ifeq            93
			metadataeditor.putString(1, bundle.getString("android.media.metadata.ALBUM"));
	//   38   80:aload_2         
	//   39   81:iconst_1        
	//   40   82:aload_1         
	//   41   83:ldc2            #265 <String "android.media.metadata.ALBUM">
	//   42   86:invokevirtual   #269 <Method String Bundle.getString(String)>
	//   43   89:invokevirtual   #273 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   44   92:pop             
		if(bundle.containsKey("android.media.metadata.ALBUM_ARTIST"))
	//*  45   93:aload_1         
	//*  46   94:ldc2            #275 <String "android.media.metadata.ALBUM_ARTIST">
	//*  47   97:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//*  48  100:ifeq            117
			metadataeditor.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
	//   49  103:aload_2         
	//   50  104:bipush          13
	//   51  106:aload_1         
	//   52  107:ldc2            #275 <String "android.media.metadata.ALBUM_ARTIST">
	//   53  110:invokevirtual   #269 <Method String Bundle.getString(String)>
	//   54  113:invokevirtual   #273 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   55  116:pop             
		if(bundle.containsKey("android.media.metadata.ARTIST"))
	//*  56  117:aload_1         
	//*  57  118:ldc2            #277 <String "android.media.metadata.ARTIST">
	//*  58  121:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//*  59  124:ifeq            140
			metadataeditor.putString(2, bundle.getString("android.media.metadata.ARTIST"));
	//   60  127:aload_2         
	//   61  128:iconst_2        
	//   62  129:aload_1         
	//   63  130:ldc2            #277 <String "android.media.metadata.ARTIST">
	//   64  133:invokevirtual   #269 <Method String Bundle.getString(String)>
	//   65  136:invokevirtual   #273 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   66  139:pop             
		if(bundle.containsKey("android.media.metadata.AUTHOR"))
	//*  67  140:aload_1         
	//*  68  141:ldc2            #279 <String "android.media.metadata.AUTHOR">
	//*  69  144:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//*  70  147:ifeq            163
			metadataeditor.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
	//   71  150:aload_2         
	//   72  151:iconst_3        
	//   73  152:aload_1         
	//   74  153:ldc2            #279 <String "android.media.metadata.AUTHOR">
	//   75  156:invokevirtual   #269 <Method String Bundle.getString(String)>
	//   76  159:invokevirtual   #273 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   77  162:pop             
		if(bundle.containsKey("android.media.metadata.COMPILATION"))
	//*  78  163:aload_1         
	//*  79  164:ldc2            #281 <String "android.media.metadata.COMPILATION">
	//*  80  167:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//*  81  170:ifeq            187
			metadataeditor.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
	//   82  173:aload_2         
	//   83  174:bipush          15
	//   84  176:aload_1         
	//   85  177:ldc2            #281 <String "android.media.metadata.COMPILATION">
	//   86  180:invokevirtual   #269 <Method String Bundle.getString(String)>
	//   87  183:invokevirtual   #273 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   88  186:pop             
		if(bundle.containsKey("android.media.metadata.COMPOSER"))
	//*  89  187:aload_1         
	//*  90  188:ldc2            #283 <String "android.media.metadata.COMPOSER">
	//*  91  191:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//*  92  194:ifeq            210
			metadataeditor.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
	//   93  197:aload_2         
	//   94  198:iconst_4        
	//   95  199:aload_1         
	//   96  200:ldc2            #283 <String "android.media.metadata.COMPOSER">
	//   97  203:invokevirtual   #269 <Method String Bundle.getString(String)>
	//   98  206:invokevirtual   #273 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   99  209:pop             
		if(bundle.containsKey("android.media.metadata.DATE"))
	//* 100  210:aload_1         
	//* 101  211:ldc2            #285 <String "android.media.metadata.DATE">
	//* 102  214:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//* 103  217:ifeq            233
			metadataeditor.putString(5, bundle.getString("android.media.metadata.DATE"));
	//  104  220:aload_2         
	//  105  221:iconst_5        
	//  106  222:aload_1         
	//  107  223:ldc2            #285 <String "android.media.metadata.DATE">
	//  108  226:invokevirtual   #269 <Method String Bundle.getString(String)>
	//  109  229:invokevirtual   #273 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  110  232:pop             
		if(bundle.containsKey("android.media.metadata.DISC_NUMBER"))
	//* 111  233:aload_1         
	//* 112  234:ldc2            #287 <String "android.media.metadata.DISC_NUMBER">
	//* 113  237:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//* 114  240:ifeq            257
			metadataeditor.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
	//  115  243:aload_2         
	//  116  244:bipush          14
	//  117  246:aload_1         
	//  118  247:ldc2            #287 <String "android.media.metadata.DISC_NUMBER">
	//  119  250:invokevirtual   #291 <Method long Bundle.getLong(String)>
	//  120  253:invokevirtual   #295 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//  121  256:pop             
		if(bundle.containsKey("android.media.metadata.DURATION"))
	//* 122  257:aload_1         
	//* 123  258:ldc2            #297 <String "android.media.metadata.DURATION">
	//* 124  261:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//* 125  264:ifeq            281
			metadataeditor.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
	//  126  267:aload_2         
	//  127  268:bipush          9
	//  128  270:aload_1         
	//  129  271:ldc2            #297 <String "android.media.metadata.DURATION">
	//  130  274:invokevirtual   #291 <Method long Bundle.getLong(String)>
	//  131  277:invokevirtual   #295 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//  132  280:pop             
		if(bundle.containsKey("android.media.metadata.GENRE"))
	//* 133  281:aload_1         
	//* 134  282:ldc2            #299 <String "android.media.metadata.GENRE">
	//* 135  285:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//* 136  288:ifeq            305
			metadataeditor.putString(6, bundle.getString("android.media.metadata.GENRE"));
	//  137  291:aload_2         
	//  138  292:bipush          6
	//  139  294:aload_1         
	//  140  295:ldc2            #299 <String "android.media.metadata.GENRE">
	//  141  298:invokevirtual   #269 <Method String Bundle.getString(String)>
	//  142  301:invokevirtual   #273 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  143  304:pop             
		if(bundle.containsKey("android.media.metadata.TITLE"))
	//* 144  305:aload_1         
	//* 145  306:ldc2            #301 <String "android.media.metadata.TITLE">
	//* 146  309:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//* 147  312:ifeq            329
			metadataeditor.putString(7, bundle.getString("android.media.metadata.TITLE"));
	//  148  315:aload_2         
	//  149  316:bipush          7
	//  150  318:aload_1         
	//  151  319:ldc2            #301 <String "android.media.metadata.TITLE">
	//  152  322:invokevirtual   #269 <Method String Bundle.getString(String)>
	//  153  325:invokevirtual   #273 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  154  328:pop             
		if(bundle.containsKey("android.media.metadata.TRACK_NUMBER"))
	//* 155  329:aload_1         
	//* 156  330:ldc2            #303 <String "android.media.metadata.TRACK_NUMBER">
	//* 157  333:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//* 158  336:ifeq            352
			metadataeditor.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
	//  159  339:aload_2         
	//  160  340:iconst_0        
	//  161  341:aload_1         
	//  162  342:ldc2            #303 <String "android.media.metadata.TRACK_NUMBER">
	//  163  345:invokevirtual   #291 <Method long Bundle.getLong(String)>
	//  164  348:invokevirtual   #295 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//  165  351:pop             
		if(bundle.containsKey("android.media.metadata.WRITER"))
	//* 166  352:aload_1         
	//* 167  353:ldc2            #305 <String "android.media.metadata.WRITER">
	//* 168  356:invokevirtual   #249 <Method boolean Bundle.containsKey(String)>
	//* 169  359:ifeq            376
			metadataeditor.putString(11, bundle.getString("android.media.metadata.WRITER"));
	//  170  362:aload_2         
	//  171  363:bipush          11
	//  172  365:aload_1         
	//  173  366:ldc2            #305 <String "android.media.metadata.WRITER">
	//  174  369:invokevirtual   #269 <Method String Bundle.getString(String)>
	//  175  372:invokevirtual   #273 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  176  375:pop             
		return metadataeditor;
	//  177  376:aload_2         
	//  178  377:areturn         
	}

	public String getCallingPackage()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getMediaSession()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	int getRccStateFromState(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 11: default 64
	//	               0 75
	//	               1 89
	//	               2 77
	//	               3 79
	//	               4 73
	//	               5 81
	//	               6 67
	//	               7 70
	//	               8 67
	//	               9 83
	//	               10 86
	//	               11 86
	//*   2   64:goto            91
		case 6: // '\006'
		case 8: // '\b'
			return 8;
	//    3   67:bipush          8
	//    4   69:ireturn         

		case 7: // '\007'
			return 9;
	//    5   70:bipush          9
	//    6   72:ireturn         

		case 4: // '\004'
			return 4;
	//    7   73:iconst_4        
	//    8   74:ireturn         

		case 0: // '\0'
			return 0;
	//    9   75:iconst_0        
	//   10   76:ireturn         

		case 2: // '\002'
			return 2;
	//   11   77:iconst_2        
	//   12   78:ireturn         

		case 3: // '\003'
			return 3;
	//   13   79:iconst_3        
	//   14   80:ireturn         

		case 5: // '\005'
			return 5;
	//   15   81:iconst_5        
	//   16   82:ireturn         

		case 9: // '\t'
			return 7;
	//   17   83:bipush          7
	//   18   85:ireturn         

		case 10: // '\n'
		case 11: // '\013'
			return 6;
	//   19   86:bipush          6
	//   20   88:ireturn         

		case 1: // '\001'
			return 1;
	//   21   89:iconst_1        
	//   22   90:ireturn         
		}
		return -1;
	//   23   91:iconst_m1       
	//   24   92:ireturn         
	}

	int getRccTransportControlFlagsFromActions(long l)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if((1L & l) != 0L)
	//*   2    3:lconst_1        
	//*   3    4:lload_1         
	//*   4    5:land            
	//*   5    6:lconst_0        
	//*   6    7:lcmp            
	//*   7    8:ifeq            15
			j = 32;
	//    8   11:bipush          32
	//    9   13:istore          4
		int i = j;
	//   10   15:iload           4
	//   11   17:istore_3        
		if((2L & l) != 0L)
	//*  12   18:ldc2w           #313 <Long 2L>
	//*  13   21:lload_1         
	//*  14   22:land            
	//*  15   23:lconst_0        
	//*  16   24:lcmp            
	//*  17   25:ifeq            34
			i = j | 0x10;
	//   18   28:iload           4
	//   19   30:bipush          16
	//   20   32:ior             
	//   21   33:istore_3        
		j = i;
	//   22   34:iload_3         
	//   23   35:istore          4
		if((4L & l) != 0L)
	//*  24   37:ldc2w           #315 <Long 4L>
	//*  25   40:lload_1         
	//*  26   41:land            
	//*  27   42:lconst_0        
	//*  28   43:lcmp            
	//*  29   44:ifeq            52
			j = i | 4;
	//   30   47:iload_3         
	//   31   48:iconst_4        
	//   32   49:ior             
	//   33   50:istore          4
		i = j;
	//   34   52:iload           4
	//   35   54:istore_3        
		if((8L & l) != 0L)
	//*  36   55:ldc2w           #317 <Long 8L>
	//*  37   58:lload_1         
	//*  38   59:land            
	//*  39   60:lconst_0        
	//*  40   61:lcmp            
	//*  41   62:ifeq            70
			i = j | 2;
	//   42   65:iload           4
	//   43   67:iconst_2        
	//   44   68:ior             
	//   45   69:istore_3        
		j = i;
	//   46   70:iload_3         
	//   47   71:istore          4
		if((16L & l) != 0L)
	//*  48   73:ldc2w           #319 <Long 16L>
	//*  49   76:lload_1         
	//*  50   77:land            
	//*  51   78:lconst_0        
	//*  52   79:lcmp            
	//*  53   80:ifeq            88
			j = i | 1;
	//   54   83:iload_3         
	//   55   84:iconst_1        
	//   56   85:ior             
	//   57   86:istore          4
		i = j;
	//   58   88:iload           4
	//   59   90:istore_3        
		if((32L & l) != 0L)
	//*  60   91:ldc2w           #321 <Long 32L>
	//*  61   94:lload_1         
	//*  62   95:land            
	//*  63   96:lconst_0        
	//*  64   97:lcmp            
	//*  65   98:ifeq            108
			i = j | 0x80;
	//   66  101:iload           4
	//   67  103:sipush          128
	//   68  106:ior             
	//   69  107:istore_3        
		j = i;
	//   70  108:iload_3         
	//   71  109:istore          4
		if((64L & l) != 0L)
	//*  72  111:ldc2w           #323 <Long 64L>
	//*  73  114:lload_1         
	//*  74  115:land            
	//*  75  116:lconst_0        
	//*  76  117:lcmp            
	//*  77  118:ifeq            127
			j = i | 0x40;
	//   78  121:iload_3         
	//   79  122:bipush          64
	//   80  124:ior             
	//   81  125:istore          4
		i = j;
	//   82  127:iload           4
	//   83  129:istore_3        
		if((512L & l) != 0L)
	//*  84  130:ldc2w           #325 <Long 512L>
	//*  85  133:lload_1         
	//*  86  134:land            
	//*  87  135:lconst_0        
	//*  88  136:lcmp            
	//*  89  137:ifeq            146
			i = j | 8;
	//   90  140:iload           4
	//   91  142:bipush          8
	//   92  144:ior             
	//   93  145:istore_3        
		return i;
	//   94  146:iload_3         
	//   95  147:ireturn         
	}

	public Object getRemoteControlClient()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public MediaSessionCompat.Token getSessionToken()
	{
		return mToken;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field MediaSessionCompat$Token mToken>
	//    2    4:areturn         
	}

	PlaybackStateCompat getStateWithUpdatedPosition()
	{
		long l1 = -1L;
	//    0    0:ldc2w           #332 <Long -1L>
	//    1    3:lstore_3        
		Object obj = mLock;
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field Object mLock>
	//    4    8:astore          7
		obj;
	//    5   10:aload           7
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		PlaybackStateCompat playbackstatecompat = mState;
	//    7   13:aload_0         
	//    8   14:getfield        #335 <Field PlaybackStateCompat mState>
	//    9   17:astore          9
		long l = l1;
	//   10   19:lload_3         
	//   11   20:lstore_1        
		if(mMetadata == null)
			break MISSING_BLOCK_LABEL_54;
	//   12   21:aload_0         
	//   13   22:getfield        #337 <Field MediaMetadataCompat mMetadata>
	//   14   25:ifnull          54
		l = l1;
	//   15   28:lload_3         
	//   16   29:lstore_1        
		if(mMetadata.containsKey("android.media.metadata.DURATION"))
	//*  17   30:aload_0         
	//*  18   31:getfield        #337 <Field MediaMetadataCompat mMetadata>
	//*  19   34:ldc2            #297 <String "android.media.metadata.DURATION">
	//*  20   37:invokevirtual   #340 <Method boolean MediaMetadataCompat.containsKey(String)>
	//*  21   40:ifeq            54
			l = mMetadata.getLong("android.media.metadata.DURATION");
	//   22   43:aload_0         
	//   23   44:getfield        #337 <Field MediaMetadataCompat mMetadata>
	//   24   47:ldc2            #297 <String "android.media.metadata.DURATION">
	//   25   50:invokevirtual   #341 <Method long MediaMetadataCompat.getLong(String)>
	//   26   53:lstore_1        
		obj;
	//   27   54:aload           7
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		  goto _L1
	//*  29   57:goto            68
		Exception exception;
		exception;
	//   30   60:astore          8
	//*  31   62:aload           7
		throw exception;
	//   32   64:monitorexit     
	//   33   65:aload           8
	//   34   67:athrow          
_L1:
		Object obj1;
label0:
		{
			Object obj2 = null;
	//   35   68:aconst_null     
	//   36   69:astore          8
			obj1 = ((Object) (obj2));
	//   37   71:aload           8
	//   38   73:astore          7
			if(playbackstatecompat == null)
				break label0;
	//   39   75:aload           9
	//   40   77:ifnull          213
			if(playbackstatecompat.getState() != 3 && playbackstatecompat.getState() != 4)
	//*  41   80:aload           9
	//*  42   82:invokevirtual   #346 <Method int PlaybackStateCompat.getState()>
	//*  43   85:iconst_3        
	//*  44   86:icmpeq          111
	//*  45   89:aload           9
	//*  46   91:invokevirtual   #346 <Method int PlaybackStateCompat.getState()>
	//*  47   94:iconst_4        
	//*  48   95:icmpeq          111
			{
				obj1 = ((Object) (obj2));
	//   49   98:aload           8
	//   50  100:astore          7
				if(playbackstatecompat.getState() != 5)
					break label0;
	//   51  102:aload           9
	//   52  104:invokevirtual   #346 <Method int PlaybackStateCompat.getState()>
	//   53  107:iconst_5        
	//   54  108:icmpne          213
			}
			long l2 = playbackstatecompat.getLastPositionUpdateTime();
	//   55  111:aload           9
	//   56  113:invokevirtual   #350 <Method long PlaybackStateCompat.getLastPositionUpdateTime()>
	//   57  116:lstore_3        
			long l3 = SystemClock.elapsedRealtime();
	//   58  117:invokestatic    #355 <Method long SystemClock.elapsedRealtime()>
	//   59  120:lstore          5
			obj1 = ((Object) (obj2));
	//   60  122:aload           8
	//   61  124:astore          7
			if(l2 > 0L)
	//*  62  126:lload_3         
	//*  63  127:lconst_0        
	//*  64  128:lcmp            
	//*  65  129:ifle            213
			{
				l2 = (long)(playbackstatecompat.getPlaybackSpeed() * (float)(l3 - l2)) + playbackstatecompat.getPosition();
	//   66  132:aload           9
	//   67  134:invokevirtual   #359 <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//   68  137:lload           5
	//   69  139:lload_3         
	//   70  140:lsub            
	//   71  141:l2f             
	//   72  142:fmul            
	//   73  143:f2l             
	//   74  144:aload           9
	//   75  146:invokevirtual   #362 <Method long PlaybackStateCompat.getPosition()>
	//   76  149:ladd            
	//   77  150:lstore_3        
				if(l < 0L || l2 <= l)
	//*  78  151:lload_1         
	//*  79  152:lconst_0        
	//*  80  153:lcmp            
	//*  81  154:iflt            166
	//*  82  157:lload_3         
	//*  83  158:lload_1         
	//*  84  159:lcmp            
	//*  85  160:ifle            166
	//*  86  163:goto            176
				{
					l = l2;
	//   87  166:lload_3         
	//   88  167:lstore_1        
					if(l2 < 0L)
	//*  89  168:lload_3         
	//*  90  169:lconst_0        
	//*  91  170:lcmp            
	//*  92  171:ifge            176
						l = 0L;
	//   93  174:lconst_0        
	//   94  175:lstore_1        
				}
				obj1 = ((Object) (new PlaybackStateCompat.Builder(playbackstatecompat)));
	//   95  176:new             #364 <Class PlaybackStateCompat$Builder>
	//   96  179:dup             
	//   97  180:aload           9
	//   98  182:invokespecial   #366 <Method void PlaybackStateCompat$Builder(PlaybackStateCompat)>
	//   99  185:astore          7
				((PlaybackStateCompat.Builder) (obj1)).setState(playbackstatecompat.getState(), l, playbackstatecompat.getPlaybackSpeed(), l3);
	//  100  187:aload           7
	//  101  189:aload           9
	//  102  191:invokevirtual   #346 <Method int PlaybackStateCompat.getState()>
	//  103  194:lload_1         
	//  104  195:aload           9
	//  105  197:invokevirtual   #359 <Method float PlaybackStateCompat.getPlaybackSpeed()>
	//  106  200:lload           5
	//  107  202:invokevirtual   #370 <Method PlaybackStateCompat$Builder PlaybackStateCompat$Builder.setState(int, long, float, long)>
	//  108  205:pop             
				obj1 = ((Object) (((PlaybackStateCompat.Builder) (obj1)).build()));
	//  109  206:aload           7
	//  110  208:invokevirtual   #373 <Method PlaybackStateCompat PlaybackStateCompat$Builder.build()>
	//  111  211:astore          7
			}
		}
		if(obj1 == null)
	//* 112  213:aload           7
	//* 113  215:ifnonnull       221
			return playbackstatecompat;
	//  114  218:aload           9
	//  115  220:areturn         
		else
			return ((PlaybackStateCompat) (obj1));
	//  116  221:aload           7
	//  117  223:areturn         
	}

	public boolean isActive()
	{
		return mIsActive;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field boolean mIsActive>
	//    2    4:ireturn         
	}

	void postToHandler(int i)
	{
		postToHandler(i, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #379 <Method void postToHandler(int, Object)>
	//    4    6:return          
	}

	void postToHandler(int i, int j)
	{
		postToHandler(i, ((Object) (null)), j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:invokevirtual   #382 <Method void postToHandler(int, Object, int)>
	//    5    7:return          
	}

	void postToHandler(int i, Object obj)
	{
		postToHandler(i, obj, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #385 <Method void postToHandler(int, Object, Bundle)>
	//    5    7:return          
	}

	void postToHandler(int i, Object obj, int j)
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Object mLock>
	//    2    4:astore          4
		obj1;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(mHandler != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #387 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//*   7   13:ifnull          26
			mHandler.post(i, obj, j);
	//    8   16:aload_0         
	//    9   17:getfield        #387 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:iload_3         
	//   13   23:invokevirtual   #390 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.post(int, Object, int)>
		obj1;
	//   14   26:aload           4
		JVM INSTR monitorexit ;
	//   15   28:monitorexit     
		return;
	//   16   29:return          
		obj;
	//   17   30:astore_2        
	//*  18   31:aload           4
		throw obj;
	//   19   33:monitorexit     
	//   20   34:aload_2         
	//   21   35:athrow          
	}

	void postToHandler(int i, Object obj, Bundle bundle)
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Object mLock>
	//    2    4:astore          4
		obj1;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(mHandler != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #387 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//*   7   13:ifnull          26
			mHandler.post(i, obj, bundle);
	//    8   16:aload_0         
	//    9   17:getfield        #387 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #392 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.post(int, Object, Bundle)>
		obj1;
	//   14   26:aload           4
		JVM INSTR monitorexit ;
	//   15   28:monitorexit     
		return;
	//   16   29:return          
		obj;
	//   17   30:astore_2        
	//*  18   31:aload           4
		throw obj;
	//   19   33:monitorexit     
	//   20   34:aload_2         
	//   21   35:athrow          
	}

	void registerMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
	{
		mAudioManager.registerMediaButtonEventReceiver(componentname);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioManager mAudioManager>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #397 <Method void AudioManager.registerMediaButtonEventReceiver(ComponentName)>
	//    4    8:return          
	}

	public void release()
	{
		mIsActive = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #92  <Field boolean mIsActive>
		mDestroyed = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #90  <Field boolean mDestroyed>
		update();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #401 <Method boolean update()>
	//    8   14:pop             
		sendSessionDestroyed();
	//    9   15:aload_0         
	//   10   16:invokespecial   #403 <Method void sendSessionDestroyed()>
	//   11   19:return          
	}

	public void sendSessionEvent(String s, Bundle bundle)
	{
		sendEvent(s, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #406 <Method void sendEvent(String, Bundle)>
	//    4    6:return          
	}

	void sendVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
	{
		for(int i = mControllerCallbacks.beginBroadcast() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//*   2    4:invokevirtual   #166 <Method int RemoteCallbackList.beginBroadcast()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            44
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #170 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #172 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onVolumeInfoChanged(parcelablevolumeinfo);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #411 <Method void IMediaControllerCallback.onVolumeInfoChanged(ParcelableVolumeInfo)>
			}
	//*  17   33:goto            37
			catch(RemoteException remoteexception) { }
	//   18   36:astore_3        
		}

	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:isub            
	//   22   40:istore_2        
	//*  23   41:goto            10
		mControllerCallbacks.finishBroadcast();
	//   24   44:aload_0         
	//   25   45:getfield        #88  <Field RemoteCallbackList mControllerCallbacks>
	//   26   48:invokevirtual   #178 <Method void RemoteCallbackList.finishBroadcast()>
	//   27   51:return          
	}

	public void setActive(boolean flag)
	{
		if(flag == mIsActive)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #92  <Field boolean mIsActive>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mIsActive = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #92  <Field boolean mIsActive>
		if(update())
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #401 <Method boolean update()>
	//*  10   18:ifeq            37
		{
			setMetadata(mMetadata);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #337 <Field MediaMetadataCompat mMetadata>
	//   14   26:invokevirtual   #415 <Method void setMetadata(MediaMetadataCompat)>
			setPlaybackState(mState);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #335 <Field PlaybackStateCompat mState>
	//   18   34:invokevirtual   #418 <Method void setPlaybackState(PlaybackStateCompat)>
		}
	//   19   37:return          
	}

	public void setCallback(MediaSessionCompat.Callback callback, Handler handler)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #422 <Field MediaSessionCompat$Callback mCallback>
		if(callback == null)
			break MISSING_BLOCK_LABEL_54;
	//    3    5:aload_1         
	//    4    6:ifnull          54
		callback = ((MediaSessionCompat.Callback) (handler));
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(handler == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       23
			callback = ((MediaSessionCompat.Callback) (new Handler()));
	//    9   15:new             #424 <Class Handler>
	//   10   18:dup             
	//   11   19:invokespecial   #425 <Method void Handler()>
	//   12   22:astore_1        
		handler = ((Handler) (mLock));
	//   13   23:aload_0         
	//   14   24:getfield        #83  <Field Object mLock>
	//   15   27:astore_2        
		handler;
	//   16   28:aload_2         
		JVM INSTR monitorenter ;
	//   17   29:monitorenter    
		mHandler = new MessageHandler(((Handler) (callback)).getLooper());
	//   18   30:aload_0         
	//   19   31:new             #19  <Class MediaSessionCompat$MediaSessionImplBase$MessageHandler>
	//   20   34:dup             
	//   21   35:aload_0         
	//   22   36:aload_1         
	//   23   37:invokevirtual   #429 <Method Looper Handler.getLooper()>
	//   24   40:invokespecial   #432 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler(MediaSessionCompat$MediaSessionImplBase, Looper)>
	//   25   43:putfield        #387 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
		handler;
	//   26   46:aload_2         
		JVM INSTR monitorexit ;
	//   27   47:monitorexit     
		return;
	//   28   48:return          
		callback;
	//   29   49:astore_1        
	//*  30   50:aload_2         
		throw callback;
	//   31   51:monitorexit     
	//   32   52:aload_1         
	//   33   53:athrow          
	//   34   54:return          
	}

	public void setExtras(Bundle bundle)
	{
		mExtras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #435 <Field Bundle mExtras>
		sendExtras(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #437 <Method void sendExtras(Bundle)>
	//    6   10:return          
	}

	public void setFlags(int i)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mFlags = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #440 <Field int mFlags>
		obj;
	//    8   12:aload_2         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		  goto _L1
	//*  10   14:goto            22
		Exception exception;
		exception;
	//   11   17:astore_3        
	//*  12   18:aload_2         
		throw exception;
	//   13   19:monitorexit     
	//   14   20:aload_3         
	//   15   21:athrow          
_L1:
		update();
	//   16   22:aload_0         
	//   17   23:invokevirtual   #401 <Method boolean update()>
	//   18   26:pop             
		return;
	//   19   27:return          
	}

	public void setMediaButtonReceiver(PendingIntent pendingintent)
	{
	//    0    0:return          
	}

	public void setMetadata(MediaMetadataCompat mediametadatacompat)
	{
		Object obj;
		obj = ((Object) (mediametadatacompat));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(mediametadatacompat != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          21
			obj = ((Object) ((new android.support.v4.media.MediaMetadataCompat.Builder(mediametadatacompat, MediaSessionCompat.sMaxBitmapSize)).build()));
	//    4    6:new             #443 <Class android.support.v4.media.MediaMetadataCompat$Builder>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:getstatic       #446 <Field int MediaSessionCompat.sMaxBitmapSize>
	//    8   14:invokespecial   #449 <Method void android.support.v4.media.MediaMetadataCompat$Builder(MediaMetadataCompat, int)>
	//    9   17:invokevirtual   #452 <Method MediaMetadataCompat android.support.v4.media.MediaMetadataCompat$Builder.build()>
	//   10   20:astore_2        
		mediametadatacompat = ((MediaMetadataCompat) (mLock));
	//   11   21:aload_0         
	//   12   22:getfield        #83  <Field Object mLock>
	//   13   25:astore_1        
		mediametadatacompat;
	//   14   26:aload_1         
		JVM INSTR monitorenter ;
	//   15   27:monitorenter    
		mMetadata = ((MediaMetadataCompat) (obj));
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:putfield        #337 <Field MediaMetadataCompat mMetadata>
		mediametadatacompat;
	//   19   33:aload_1         
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		  goto _L1
	//*  21   35:goto            43
		obj;
	//   22   38:astore_2        
	//*  23   39:aload_1         
		throw obj;
	//   24   40:monitorexit     
	//   25   41:aload_2         
	//   26   42:athrow          
_L1:
		sendMetadata(((MediaMetadataCompat) (obj)));
	//   27   43:aload_0         
	//   28   44:aload_2         
	//   29   45:invokespecial   #454 <Method void sendMetadata(MediaMetadataCompat)>
		if(!mIsActive)
	//*  30   48:aload_0         
	//*  31   49:getfield        #92  <Field boolean mIsActive>
	//*  32   52:ifne            56
			return;
	//   33   55:return          
		if(obj == null)
	//*  34   56:aload_2         
	//*  35   57:ifnonnull       65
			mediametadatacompat = null;
	//   36   60:aconst_null     
	//   37   61:astore_1        
		else
	//*  38   62:goto            70
			mediametadatacompat = ((MediaMetadataCompat) (((MediaMetadataCompat) (obj)).getBundle()));
	//   39   65:aload_2         
	//   40   66:invokevirtual   #458 <Method Bundle MediaMetadataCompat.getBundle()>
	//   41   69:astore_1        
		buildRccMetadata(((Bundle) (mediametadatacompat))).apply();
	//   42   70:aload_0         
	//   43   71:aload_1         
	//   44   72:invokevirtual   #460 <Method android.media.RemoteControlClient$MetadataEditor buildRccMetadata(Bundle)>
	//   45   75:invokevirtual   #463 <Method void android.media.RemoteControlClient$MetadataEditor.apply()>
		return;
	//   46   78:return          
	}

	public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mState = playbackstatecompat;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #335 <Field PlaybackStateCompat mState>
		obj;
	//    8   12:aload_2         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		  goto _L1
	//*  10   14:goto            22
		playbackstatecompat;
	//   11   17:astore_1        
	//*  12   18:aload_2         
		throw playbackstatecompat;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
_L1:
		sendState(playbackstatecompat);
	//   16   22:aload_0         
	//   17   23:aload_1         
	//   18   24:invokespecial   #465 <Method void sendState(PlaybackStateCompat)>
		if(!mIsActive)
	//*  19   27:aload_0         
	//*  20   28:getfield        #92  <Field boolean mIsActive>
	//*  21   31:ifne            35
			return;
	//   22   34:return          
		if(playbackstatecompat == null)
	//*  23   35:aload_1         
	//*  24   36:ifnonnull       56
		{
			mRcc.setPlaybackState(0);
	//   25   39:aload_0         
	//   26   40:getfield        #157 <Field RemoteControlClient mRcc>
	//   27   43:iconst_0        
	//   28   44:invokevirtual   #467 <Method void RemoteControlClient.setPlaybackState(int)>
			mRcc.setTransportControlFlags(0);
	//   29   47:aload_0         
	//   30   48:getfield        #157 <Field RemoteControlClient mRcc>
	//   31   51:iconst_0        
	//   32   52:invokevirtual   #470 <Method void RemoteControlClient.setTransportControlFlags(int)>
			return;
	//   33   55:return          
		} else
		{
			setRccState(playbackstatecompat);
	//   34   56:aload_0         
	//   35   57:aload_1         
	//   36   58:invokevirtual   #473 <Method void setRccState(PlaybackStateCompat)>
			mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackstatecompat.getActions()));
	//   37   61:aload_0         
	//   38   62:getfield        #157 <Field RemoteControlClient mRcc>
	//   39   65:aload_0         
	//   40   66:aload_1         
	//   41   67:invokevirtual   #476 <Method long PlaybackStateCompat.getActions()>
	//   42   70:invokevirtual   #478 <Method int getRccTransportControlFlagsFromActions(long)>
	//   43   73:invokevirtual   #470 <Method void RemoteControlClient.setTransportControlFlags(int)>
			return;
	//   44   76:return          
		}
	}

	public void setPlaybackToLocal(int i)
	{
		if(mVolumeProvider != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//*   2    4:ifnull          15
			mVolumeProvider.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #482 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
		mVolumeType = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #148 <Field int mVolumeType>
		sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, 2, mAudioManager.getStreamMaxVolume(mLocalStream), mAudioManager.getStreamVolume(mLocalStream)));
	//   10   20:aload_0         
	//   11   21:new             #484 <Class ParcelableVolumeInfo>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #148 <Field int mVolumeType>
	//   15   29:aload_0         
	//   16   30:getfield        #150 <Field int mLocalStream>
	//   17   33:iconst_2        
	//   18   34:aload_0         
	//   19   35:getfield        #128 <Field AudioManager mAudioManager>
	//   20   38:aload_0         
	//   21   39:getfield        #150 <Field int mLocalStream>
	//   22   42:invokevirtual   #487 <Method int AudioManager.getStreamMaxVolume(int)>
	//   23   45:aload_0         
	//   24   46:getfield        #128 <Field AudioManager mAudioManager>
	//   25   49:aload_0         
	//   26   50:getfield        #150 <Field int mLocalStream>
	//   27   53:invokevirtual   #490 <Method int AudioManager.getStreamVolume(int)>
	//   28   56:invokespecial   #493 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
	//   29   59:invokevirtual   #495 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
	//   30   62:return          
	}

	public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
	{
		if(volumeprovidercompat == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("volumeProvider may not be null");
	//    2    4:new             #103 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #499 <String "volumeProvider may not be null">
	//    5   11:invokespecial   #108 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(mVolumeProvider != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//*   9   19:ifnull          30
			mVolumeProvider.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #482 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
		mVolumeType = 2;
	//   14   30:aload_0         
	//   15   31:iconst_2        
	//   16   32:putfield        #148 <Field int mVolumeType>
		mVolumeProvider = volumeprovidercompat;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #226 <Field VolumeProviderCompat mVolumeProvider>
		sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, mVolumeProvider.getVolumeControl(), mVolumeProvider.getMaxVolume(), mVolumeProvider.getCurrentVolume()));
	//   20   40:aload_0         
	//   21   41:new             #484 <Class ParcelableVolumeInfo>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #148 <Field int mVolumeType>
	//   25   49:aload_0         
	//   26   50:getfield        #150 <Field int mLocalStream>
	//   27   53:aload_0         
	//   28   54:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//   29   57:invokevirtual   #502 <Method int VolumeProviderCompat.getVolumeControl()>
	//   30   60:aload_0         
	//   31   61:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//   32   64:invokevirtual   #505 <Method int VolumeProviderCompat.getMaxVolume()>
	//   33   67:aload_0         
	//   34   68:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//   35   71:invokevirtual   #508 <Method int VolumeProviderCompat.getCurrentVolume()>
	//   36   74:invokespecial   #493 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
	//   37   77:invokevirtual   #495 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
		volumeprovidercompat.setCallback(mVolumeCallback);
	//   38   80:aload_1         
	//   39   81:aload_0         
	//   40   82:getfield        #101 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
	//   41   85:invokevirtual   #482 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
	//   42   88:return          
	}

	public void setQueue(List list)
	{
		mQueue = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #511 <Field List mQueue>
		sendQueue(list);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #513 <Method void sendQueue(List)>
	//    6   10:return          
	}

	public void setQueueTitle(CharSequence charsequence)
	{
		mQueueTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #516 <Field CharSequence mQueueTitle>
		sendQueueTitle(charsequence);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #518 <Method void sendQueueTitle(CharSequence)>
	//    6   10:return          
	}

	public void setRatingType(int i)
	{
		mRatingType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #146 <Field int mRatingType>
	//    3    5:return          
	}

	void setRccState(PlaybackStateCompat playbackstatecompat)
	{
		mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field RemoteControlClient mRcc>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #346 <Method int PlaybackStateCompat.getState()>
	//    5    9:invokevirtual   #521 <Method int getRccStateFromState(int)>
	//    6   12:invokevirtual   #467 <Method void RemoteControlClient.setPlaybackState(int)>
	//    7   15:return          
	}

	public void setRepeatMode(int i)
	{
		if(mRepeatMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #524 <Field int mRepeatMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mRepeatMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #524 <Field int mRepeatMode>
			sendRepeatMode(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #526 <Method void sendRepeatMode(int)>
		}
	//   10   18:return          
	}

	public void setSessionActivity(PendingIntent pendingintent)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mSessionActivity = pendingintent;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #529 <Field PendingIntent mSessionActivity>
		obj;
	//    8   12:aload_2         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		pendingintent;
	//   11   15:astore_1        
	//*  12   16:aload_2         
		throw pendingintent;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public void setShuffleModeEnabled(boolean flag)
	{
		if(mShuffleModeEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #532 <Field boolean mShuffleModeEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mShuffleModeEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #532 <Field boolean mShuffleModeEnabled>
			sendShuffleModeEnabled(flag);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #534 <Method void sendShuffleModeEnabled(boolean)>
		}
	//   10   18:return          
	}

	void setVolumeTo(int i, int j)
	{
		if(mVolumeType == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field int mVolumeType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          24
		{
			if(mVolumeProvider != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//*   6   12:ifnull          37
			{
				mVolumeProvider.onSetVolumeTo(i);
	//    7   15:aload_0         
	//    8   16:getfield        #226 <Field VolumeProviderCompat mVolumeProvider>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #538 <Method void VolumeProviderCompat.onSetVolumeTo(int)>
				return;
	//   11   23:return          
			}
		} else
		{
			mAudioManager.setStreamVolume(mLocalStream, i, j);
	//   12   24:aload_0         
	//   13   25:getfield        #128 <Field AudioManager mAudioManager>
	//   14   28:aload_0         
	//   15   29:getfield        #150 <Field int mLocalStream>
	//   16   32:iload_1         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #541 <Method void AudioManager.setStreamVolume(int, int, int)>
		}
	//   19   37:return          
	}

	void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
	{
		mAudioManager.unregisterMediaButtonEventReceiver(componentname);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field AudioManager mAudioManager>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #544 <Method void AudioManager.unregisterMediaButtonEventReceiver(ComponentName)>
	//    4    8:return          
	}

	boolean update()
	{
		if(mIsActive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field boolean mIsActive>
	//*   2    4:ifeq            152
		{
			if(!mIsMbrRegistered && (mFlags & 1) != 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #94  <Field boolean mIsMbrRegistered>
	//*   5   11:ifne            43
	//*   6   14:aload_0         
	//*   7   15:getfield        #440 <Field int mFlags>
	//*   8   18:iconst_1        
	//*   9   19:iand            
	//*  10   20:ifeq            43
			{
				registerMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #134 <Field PendingIntent mMediaButtonReceiverIntent>
	//   14   28:aload_0         
	//   15   29:getfield        #132 <Field ComponentName mMediaButtonReceiverComponentName>
	//   16   32:invokevirtual   #546 <Method void registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = true;
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:putfield        #94  <Field boolean mIsMbrRegistered>
			} else
	//*  20   40:goto            76
			if(mIsMbrRegistered && (mFlags & 1) == 0)
	//*  21   43:aload_0         
	//*  22   44:getfield        #94  <Field boolean mIsMbrRegistered>
	//*  23   47:ifeq            76
	//*  24   50:aload_0         
	//*  25   51:getfield        #440 <Field int mFlags>
	//*  26   54:iconst_1        
	//*  27   55:iand            
	//*  28   56:ifne            76
			{
				unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #134 <Field PendingIntent mMediaButtonReceiverIntent>
	//   32   64:aload_0         
	//   33   65:getfield        #132 <Field ComponentName mMediaButtonReceiverComponentName>
	//   34   68:invokevirtual   #548 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = false;
	//   35   71:aload_0         
	//   36   72:iconst_0        
	//   37   73:putfield        #94  <Field boolean mIsMbrRegistered>
			}
			if(!mIsRccRegistered && (mFlags & 2) != 0)
	//*  38   76:aload_0         
	//*  39   77:getfield        #96  <Field boolean mIsRccRegistered>
	//*  40   80:ifne            110
	//*  41   83:aload_0         
	//*  42   84:getfield        #440 <Field int mFlags>
	//*  43   87:iconst_2        
	//*  44   88:iand            
	//*  45   89:ifeq            110
			{
				mAudioManager.registerRemoteControlClient(mRcc);
	//   46   92:aload_0         
	//   47   93:getfield        #128 <Field AudioManager mAudioManager>
	//   48   96:aload_0         
	//   49   97:getfield        #157 <Field RemoteControlClient mRcc>
	//   50  100:invokevirtual   #552 <Method void AudioManager.registerRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = true;
	//   51  103:aload_0         
	//   52  104:iconst_1        
	//   53  105:putfield        #96  <Field boolean mIsRccRegistered>
				return true;
	//   54  108:iconst_1        
	//   55  109:ireturn         
			}
			if(mIsRccRegistered && (mFlags & 2) == 0)
	//*  56  110:aload_0         
	//*  57  111:getfield        #96  <Field boolean mIsRccRegistered>
	//*  58  114:ifeq            207
	//*  59  117:aload_0         
	//*  60  118:getfield        #440 <Field int mFlags>
	//*  61  121:iconst_2        
	//*  62  122:iand            
	//*  63  123:ifne            207
			{
				mRcc.setPlaybackState(0);
	//   64  126:aload_0         
	//   65  127:getfield        #157 <Field RemoteControlClient mRcc>
	//   66  130:iconst_0        
	//   67  131:invokevirtual   #467 <Method void RemoteControlClient.setPlaybackState(int)>
				mAudioManager.unregisterRemoteControlClient(mRcc);
	//   68  134:aload_0         
	//   69  135:getfield        #128 <Field AudioManager mAudioManager>
	//   70  138:aload_0         
	//   71  139:getfield        #157 <Field RemoteControlClient mRcc>
	//   72  142:invokevirtual   #555 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = false;
	//   73  145:aload_0         
	//   74  146:iconst_0        
	//   75  147:putfield        #96  <Field boolean mIsRccRegistered>
				return false;
	//   76  150:iconst_0        
	//   77  151:ireturn         
			}
		} else
		{
			if(mIsMbrRegistered)
	//*  78  152:aload_0         
	//*  79  153:getfield        #94  <Field boolean mIsMbrRegistered>
	//*  80  156:ifeq            176
			{
				unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   81  159:aload_0         
	//   82  160:aload_0         
	//   83  161:getfield        #134 <Field PendingIntent mMediaButtonReceiverIntent>
	//   84  164:aload_0         
	//   85  165:getfield        #132 <Field ComponentName mMediaButtonReceiverComponentName>
	//   86  168:invokevirtual   #548 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = false;
	//   87  171:aload_0         
	//   88  172:iconst_0        
	//   89  173:putfield        #94  <Field boolean mIsMbrRegistered>
			}
			if(mIsRccRegistered)
	//*  90  176:aload_0         
	//*  91  177:getfield        #96  <Field boolean mIsRccRegistered>
	//*  92  180:ifeq            207
			{
				mRcc.setPlaybackState(0);
	//   93  183:aload_0         
	//   94  184:getfield        #157 <Field RemoteControlClient mRcc>
	//   95  187:iconst_0        
	//   96  188:invokevirtual   #467 <Method void RemoteControlClient.setPlaybackState(int)>
				mAudioManager.unregisterRemoteControlClient(mRcc);
	//   97  191:aload_0         
	//   98  192:getfield        #128 <Field AudioManager mAudioManager>
	//   99  195:aload_0         
	//  100  196:getfield        #157 <Field RemoteControlClient mRcc>
	//  101  199:invokevirtual   #555 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = false;
	//  102  202:aload_0         
	//  103  203:iconst_0        
	//  104  204:putfield        #96  <Field boolean mIsRccRegistered>
			}
		}
		return false;
	//  105  207:iconst_0        
	//  106  208:ireturn         
	}

	static final int RCC_PLAYSTATE_NONE = 0;
	final AudioManager mAudioManager;
	volatile MediaSessionCompat.Callback mCallback;
	private final Context mContext;
	final RemoteCallbackList mControllerCallbacks = new RemoteCallbackList();
	boolean mDestroyed;
	Bundle mExtras;
	int mFlags;
	private MessageHandler mHandler;
	boolean mIsActive;
	private boolean mIsMbrRegistered;
	private boolean mIsRccRegistered;
	int mLocalStream;
	final Object mLock = new Object();
	private final ComponentName mMediaButtonReceiverComponentName;
	private final PendingIntent mMediaButtonReceiverIntent;
	MediaMetadataCompat mMetadata;
	final String mPackageName;
	List mQueue;
	CharSequence mQueueTitle;
	int mRatingType;
	final RemoteControlClient mRcc;
	int mRepeatMode;
	PendingIntent mSessionActivity;
	boolean mShuffleModeEnabled;
	PlaybackStateCompat mState;
	private final MediaSessionStub mStub;
	final String mTag;
	private final MediaSessionCompat.Token mToken;
	private android.support.v4.media.VolumeProviderCompat.Callback mVolumeCallback;
	VolumeProviderCompat mVolumeProvider;
	int mVolumeType;

	public MediaSessionCompat$MediaSessionImplBase(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #81  <Method void Object()>
	//    6   12:putfield        #83  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #85  <Class RemoteCallbackList>
	//    9   19:dup             
	//   10   20:invokespecial   #86  <Method void RemoteCallbackList()>
	//   11   23:putfield        #88  <Field RemoteCallbackList mControllerCallbacks>
		mDestroyed = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #90  <Field boolean mDestroyed>
		mIsActive = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #92  <Field boolean mIsActive>
		mIsMbrRegistered = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #94  <Field boolean mIsMbrRegistered>
		mIsRccRegistered = false;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #96  <Field boolean mIsRccRegistered>
		mVolumeCallback = ((android.support.v4.media.VolumeProviderCompat.Callback) (new android.support.v4.media.VolumeProviderCompat.Callback() {

			public void onVolumeChanged(VolumeProviderCompat volumeprovidercompat)
			{
				if(mVolumeProvider != volumeprovidercompat)
			//*   0    0:aload_0         
			//*   1    1:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			//*   2    4:getfield        #25  <Field VolumeProviderCompat MediaSessionCompat$MediaSessionImplBase.mVolumeProvider>
			//*   3    7:aload_1         
			//*   4    8:if_acmpeq       12
				{
					return;
			//    5   11:return          
				} else
				{
					volumeprovidercompat = ((VolumeProviderCompat) (new ParcelableVolumeInfo(mVolumeType, mLocalStream, volumeprovidercompat.getVolumeControl(), volumeprovidercompat.getMaxVolume(), volumeprovidercompat.getCurrentVolume())));
			//    6   12:new             #27  <Class ParcelableVolumeInfo>
			//    7   15:dup             
			//    8   16:aload_0         
			//    9   17:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			//   10   20:getfield        #31  <Field int MediaSessionCompat$MediaSessionImplBase.mVolumeType>
			//   11   23:aload_0         
			//   12   24:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			//   13   27:getfield        #34  <Field int MediaSessionCompat$MediaSessionImplBase.mLocalStream>
			//   14   30:aload_1         
			//   15   31:invokevirtual   #40  <Method int VolumeProviderCompat.getVolumeControl()>
			//   16   34:aload_1         
			//   17   35:invokevirtual   #43  <Method int VolumeProviderCompat.getMaxVolume()>
			//   18   38:aload_1         
			//   19   39:invokevirtual   #46  <Method int VolumeProviderCompat.getCurrentVolume()>
			//   20   42:invokespecial   #49  <Method void ParcelableVolumeInfo(int, int, int, int, int)>
			//   21   45:astore_1        
					sendVolumeInfoChanged(((ParcelableVolumeInfo) (volumeprovidercompat)));
			//   22   46:aload_0         
			//   23   47:getfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			//   24   50:aload_1         
			//   25   51:invokevirtual   #53  <Method void MediaSessionCompat$MediaSessionImplBase.sendVolumeInfoChanged(ParcelableVolumeInfo)>
					return;
			//   26   54:return          
				}
			}

			final MediaSessionCompat.MediaSessionImplBase this$0;

			
			{
				this$0 = MediaSessionCompat.MediaSessionImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field MediaSessionCompat$MediaSessionImplBase this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void android.support.v4.media.VolumeProviderCompat$Callback()>
			//    5    9:return          
			}
		}
));
	//   24   46:aload_0         
	//   25   47:new             #11  <Class MediaSessionCompat$MediaSessionImplBase$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #99  <Method void MediaSessionCompat$MediaSessionImplBase$1(MediaSessionCompat$MediaSessionImplBase)>
	//   29   55:putfield        #101 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
		if(componentname == null)
	//*  30   58:aload_3         
	//*  31   59:ifnonnull       72
		{
			throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
	//   32   62:new             #103 <Class IllegalArgumentException>
	//   33   65:dup             
	//   34   66:ldc1            #105 <String "MediaButtonReceiver component may not be null.">
	//   35   68:invokespecial   #108 <Method void IllegalArgumentException(String)>
	//   36   71:athrow          
		} else
		{
			mContext = context;
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:putfield        #110 <Field Context mContext>
			mPackageName = context.getPackageName();
	//   40   77:aload_0         
	//   41   78:aload_1         
	//   42   79:invokevirtual   #116 <Method String Context.getPackageName()>
	//   43   82:putfield        #118 <Field String mPackageName>
			mAudioManager = (AudioManager)context.getSystemService("audio");
	//   44   85:aload_0         
	//   45   86:aload_1         
	//   46   87:ldc1            #120 <String "audio">
	//   47   89:invokevirtual   #124 <Method Object Context.getSystemService(String)>
	//   48   92:checkcast       #126 <Class AudioManager>
	//   49   95:putfield        #128 <Field AudioManager mAudioManager>
			mTag = s;
	//   50   98:aload_0         
	//   51   99:aload_2         
	//   52  100:putfield        #130 <Field String mTag>
			mMediaButtonReceiverComponentName = componentname;
	//   53  103:aload_0         
	//   54  104:aload_3         
	//   55  105:putfield        #132 <Field ComponentName mMediaButtonReceiverComponentName>
			mMediaButtonReceiverIntent = pendingintent;
	//   56  108:aload_0         
	//   57  109:aload           4
	//   58  111:putfield        #134 <Field PendingIntent mMediaButtonReceiverIntent>
			mStub = new MediaSessionStub();
	//   59  114:aload_0         
	//   60  115:new             #16  <Class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub>
	//   61  118:dup             
	//   62  119:aload_0         
	//   63  120:invokespecial   #135 <Method void MediaSessionCompat$MediaSessionImplBase$MediaSessionStub(MediaSessionCompat$MediaSessionImplBase)>
	//   64  123:putfield        #137 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
			mToken = new MediaSessionCompat.Token(((Object) (mStub)));
	//   65  126:aload_0         
	//   66  127:new             #139 <Class MediaSessionCompat$Token>
	//   67  130:dup             
	//   68  131:aload_0         
	//   69  132:getfield        #137 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
	//   70  135:invokespecial   #142 <Method void MediaSessionCompat$Token(Object)>
	//   71  138:putfield        #144 <Field MediaSessionCompat$Token mToken>
			mRatingType = 0;
	//   72  141:aload_0         
	//   73  142:iconst_0        
	//   74  143:putfield        #146 <Field int mRatingType>
			mVolumeType = 1;
	//   75  146:aload_0         
	//   76  147:iconst_1        
	//   77  148:putfield        #148 <Field int mVolumeType>
			mLocalStream = 3;
	//   78  151:aload_0         
	//   79  152:iconst_3        
	//   80  153:putfield        #150 <Field int mLocalStream>
			mRcc = new RemoteControlClient(pendingintent);
	//   81  156:aload_0         
	//   82  157:new             #152 <Class RemoteControlClient>
	//   83  160:dup             
	//   84  161:aload           4
	//   85  163:invokespecial   #155 <Method void RemoteControlClient(PendingIntent)>
	//   86  166:putfield        #157 <Field RemoteControlClient mRcc>
			return;
	//   87  169:return          
		}
	}
}
