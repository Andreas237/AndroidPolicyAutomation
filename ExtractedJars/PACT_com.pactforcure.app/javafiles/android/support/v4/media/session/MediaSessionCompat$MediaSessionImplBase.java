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
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, IMediaControllerCallback, PlaybackStateCompat, ParcelableVolumeInfo

static class MediaSessionCompat$MediaSessionImplBase
	implements MediaSessionCompat.MediaSessionImpl
{
	private static final class Command
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
			Bundle bundle;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				bundle = mExtras;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #53  <Field Bundle MediaSessionCompat$MediaSessionImplBase.mExtras>
		//    9   17:astore_2        
			}
		//   10   18:aload_1         
		//   11   19:monitorexit     
			return bundle;
		//   12   20:aload_2         
		//   13   21:areturn         
			exception;
		//   14   22:astore_2        
			obj;
		//   15   23:aload_1         
			JVM INSTR monitorexit ;
		//   16   24:monitorexit     
			throw exception;
		//   17   25:aload_2         
		//   18   26:athrow          
		}

		public long getFlags()
		{
			long l;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//*   3    7:astore_3        
		//*   4    8:aload_3         
		//*   5    9:monitorenter    
			{
				l = mFlags;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #59  <Field int MediaSessionCompat$MediaSessionImplBase.mFlags>
		//    9   17:i2l             
		//   10   18:lstore_1        
			}
		//   11   19:aload_3         
		//   12   20:monitorexit     
			return l;
		//   13   21:lload_1         
		//   14   22:lreturn         
			exception;
		//   15   23:astore          4
			obj;
		//   16   25:aload_3         
			JVM INSTR monitorexit ;
		//   17   26:monitorexit     
			throw exception;
		//   18   27:aload           4
		//   19   29:athrow          
		}

		public PendingIntent getLaunchPendingIntent()
		{
			PendingIntent pendingintent;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				pendingintent = mSessionActivity;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #65  <Field PendingIntent MediaSessionCompat$MediaSessionImplBase.mSessionActivity>
		//    9   17:astore_2        
			}
		//   10   18:aload_1         
		//   11   19:monitorexit     
			return pendingintent;
		//   12   20:aload_2         
		//   13   21:areturn         
			exception;
		//   14   22:astore_2        
			obj;
		//   15   23:aload_1         
			JVM INSTR monitorexit ;
		//   16   24:monitorexit     
			throw exception;
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
			PlaybackStateCompat playbackstatecompat;
			MediaMetadataCompat mediametadatacompat;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				playbackstatecompat = mState;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #83  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//    9   17:astore_2        
				mediametadatacompat = mMetadata;
		//   10   18:aload_0         
		//   11   19:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   12   22:getfield        #71  <Field MediaMetadataCompat MediaSessionCompat$MediaSessionImplBase.mMetadata>
		//   13   25:astore_3        
			}
		//   14   26:aload_1         
		//   15   27:monitorexit     
			return MediaSessionCompat.access$500(playbackstatecompat, mediametadatacompat);
		//   16   28:aload_2         
		//   17   29:aload_3         
		//   18   30:invokestatic    #87  <Method PlaybackStateCompat MediaSessionCompat.access$500(PlaybackStateCompat, MediaMetadataCompat)>
		//   19   33:areturn         
			exception;
		//   20   34:astore_2        
			obj;
		//   21   35:aload_1         
			JVM INSTR monitorexit ;
		//   22   36:monitorexit     
			throw exception;
		//   23   37:aload_2         
		//   24   38:athrow          
		}

		public List getQueue()
		{
			List list;
			synchronized(mLock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #49  <Field Object MediaSessionCompat$MediaSessionImplBase.mLock>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				list = mQueue;
		//    6   10:aload_0         
		//    7   11:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    8   14:getfield        #93  <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//    9   17:astore_2        
			}
		//   10   18:aload_1         
		//   11   19:monitorexit     
			return list;
		//   12   20:aload_2         
		//   13   21:areturn         
			exception;
		//   14   22:astore_2        
			obj;
		//   15   23:aload_1         
			JVM INSTR monitorexit ;
		//   16   24:monitorexit     
			throw exception;
		//   17   25:aload_2         
		//   18   26:athrow          
		}

		public CharSequence getQueueTitle()
		{
			return mQueueTitle;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #101 <Field CharSequence MediaSessionCompat$MediaSessionImplBase.mQueueTitle>
		//    3    7:areturn         
		}

		public int getRatingType()
		{
			return mRatingType;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #106 <Field int MediaSessionCompat$MediaSessionImplBase.mRatingType>
		//    3    7:ireturn         
		}

		public int getRepeatMode()
		{
			return mRepeatMode;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #110 <Field int MediaSessionCompat$MediaSessionImplBase.mRepeatMode>
		//    3    7:ireturn         
		}

		public int getShuffleMode()
		{
			return mShuffleMode;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #114 <Field int MediaSessionCompat$MediaSessionImplBase.mShuffleMode>
		//    3    7:ireturn         
		}

		public String getTag()
		{
			return mTag;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #118 <Field String MediaSessionCompat$MediaSessionImplBase.mTag>
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
		//    8   16:getfield        #123 <Field int MediaSessionCompat$MediaSessionImplBase.mVolumeType>
		//    9   19:istore          4
			i1 = mLocalStream;
		//   10   21:aload_0         
		//   11   22:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   12   25:getfield        #126 <Field int MediaSessionCompat$MediaSessionImplBase.mLocalStream>
		//   13   28:istore          5
			volumeprovidercompat = mVolumeProvider;
		//   14   30:aload_0         
		//   15   31:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   16   34:getfield        #130 <Field VolumeProviderCompat MediaSessionCompat$MediaSessionImplBase.mVolumeProvider>
		//   17   37:astore          7
			if(l != 2) goto _L2; else goto _L1
		//   18   39:iload           4
		//   19   41:iconst_2        
		//   20   42:icmpne          81
_L1:
			int i;
			int j;
			int k;
			i = volumeprovidercompat.getVolumeControl();
		//   21   45:aload           7
		//   22   47:invokevirtual   #135 <Method int VolumeProviderCompat.getVolumeControl()>
		//   23   50:istore_1        
			j = volumeprovidercompat.getMaxVolume();
		//   24   51:aload           7
		//   25   53:invokevirtual   #138 <Method int VolumeProviderCompat.getMaxVolume()>
		//   26   56:istore_2        
			k = volumeprovidercompat.getCurrentVolume();
		//   27   57:aload           7
		//   28   59:invokevirtual   #141 <Method int VolumeProviderCompat.getCurrentVolume()>
		//   29   62:istore_3        
_L3:
			obj;
		//   30   63:aload           6
			JVM INSTR monitorexit ;
		//   31   65:monitorexit     
			return new ParcelableVolumeInfo(l, i1, i, j, k);
		//   32   66:new             #143 <Class ParcelableVolumeInfo>
		//   33   69:dup             
		//   34   70:iload           4
		//   35   72:iload           5
		//   36   74:iload_1         
		//   37   75:iload_2         
		//   38   76:iload_3         
		//   39   77:invokespecial   #146 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   40   80:areturn         
_L2:
			i = 2;
		//   41   81:iconst_2        
		//   42   82:istore_1        
			j = mAudioManager.getStreamMaxVolume(i1);
		//   43   83:aload_0         
		//   44   84:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   45   87:getfield        #150 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   46   90:iload           5
		//   47   92:invokevirtual   #156 <Method int AudioManager.getStreamMaxVolume(int)>
		//   48   95:istore_2        
			k = mAudioManager.getStreamVolume(i1);
		//   49   96:aload_0         
		//   50   97:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   51  100:getfield        #150 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   52  103:iload           5
		//   53  105:invokevirtual   #159 <Method int AudioManager.getStreamVolume(int)>
		//   54  108:istore_3        
			  goto _L3
		//*  55  109:goto            63
			Exception exception;
			exception;
		//   56  112:astore          7
			obj;
		//   57  114:aload           6
			JVM INSTR monitorexit ;
		//   58  116:monitorexit     
			throw exception;
		//   59  117:aload           7
		//   60  119:athrow          
		}

		public boolean isCaptioningEnabled()
		{
			return mCaptioningEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #165 <Field boolean MediaSessionCompat$MediaSessionImplBase.mCaptioningEnabled>
		//    3    7:ireturn         
		}

		public boolean isShuffleModeEnabledDeprecated()
		{
			return mShuffleModeEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #169 <Field boolean MediaSessionCompat$MediaSessionImplBase.mShuffleModeEnabled>
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
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    7:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    7:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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

		public void rateWithExtras(RatingCompat ratingcompat, Bundle bundle)
			throws RemoteException
		{
			postToHandler(31, ((Object) (ratingcompat)), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          31
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			if(mDestroyed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #197 <Field boolean MediaSessionCompat$MediaSessionImplBase.mDestroyed>
		//*   3    7:ifeq            17
			{
				try
				{
					imediacontrollercallback.onSessionDestroyed();
		//    4   10:aload_1         
		//    5   11:invokeinterface #202 <Method void IMediaControllerCallback.onSessionDestroyed()>
					return;
		//    6   16:return          
				}
		//*   7   17:aload_0         
		//*   8   18:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   9   21:getfield        #206 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//*  10   24:aload_1         
		//*  11   25:invokevirtual   #212 <Method boolean RemoteCallbackList.register(android.os.IInterface)>
		//*  12   28:pop             
		//*  13   29:return          
				// Misplaced declaration of an exception variable
				catch(IMediaControllerCallback imediacontrollercallback)
		//*  14   30:astore_1        
				{
					return;
		//   15   31:return          
				}
			} else
			{
				mControllerCallbacks.register(((android.os.IInterface) (imediacontrollercallback)));
				return;
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
		//    4    7:invokevirtual   #216 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
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
		//    4    7:invokestatic    #225 <Method Long Long.valueOf(long)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void sendCommand(String s, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultreceiverwrapper)
		{
			postToHandler(1, ((Object) (new Command(s, bundle, MediaSessionCompat.ResultReceiverWrapper.access$400(resultreceiverwrapper)))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_1        
		//    3    5:new             #229 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokestatic    #235 <Method ResultReceiver MediaSessionCompat$ResultReceiverWrapper.access$400(MediaSessionCompat$ResultReceiverWrapper)>
		//    9   15:invokespecial   #238 <Method void MediaSessionCompat$MediaSessionImplBase$Command(String, Bundle, ResultReceiver)>
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
		//    5    8:invokevirtual   #178 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//*   5    9:ifeq            30
				flag = true;
		//    6   12:iconst_1        
		//    7   13:istore_2        
			else
		//*   8   14:iload_2         
		//*   9   15:ifeq            28
		//*  10   18:aload_0         
		//*  11   19:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*  12   22:bipush          21
		//*  13   24:aload_1         
		//*  14   25:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//*  15   28:iload_2         
		//*  16   29:ireturn         
				flag = false;
		//   17   30:iconst_0        
		//   18   31:istore_2        
			if(flag)
				postToHandler(21, ((Object) (keyevent)));
			return flag;
		//*  19   32:goto            14
		}

		public void setCaptioningEnabled(boolean flag)
			throws RemoteException
		{
			postToHandler(29, ((Object) (Boolean.valueOf(flag))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          29
		//    3    6:iload_1         
		//    4    7:invokestatic    #248 <Method Boolean Boolean.valueOf(boolean)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void setRepeatMode(int i)
			throws RemoteException
		{
			postToHandler(23, i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          23
		//    3    6:iload_1         
		//    4    7:invokevirtual   #216 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
		//    5   10:return          
		}

		public void setShuffleMode(int i)
			throws RemoteException
		{
			postToHandler(30, i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          30
		//    3    6:iload_1         
		//    4    7:invokevirtual   #216 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
		//    5   10:return          
		}

		public void setShuffleModeEnabledDeprecated(boolean flag)
			throws RemoteException
		{
			postToHandler(24, ((Object) (Boolean.valueOf(flag))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          24
		//    3    6:iload_1         
		//    4    7:invokestatic    #248 <Method Boolean Boolean.valueOf(boolean)>
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
		//    4    6:invokevirtual   #254 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
		//    5    9:return          
		}

		public void skipToQueueItem(long l)
		{
			postToHandler(11, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          11
		//    3    6:lload_1         
		//    4    7:invokestatic    #225 <Method Long Long.valueOf(long)>
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
		//    2    4:getfield        #206 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #260 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
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
			if(keyevent != null && keyevent.getAction() == 0) goto _L2; else goto _L1
		//    0    0:aload_1         
		//    1    1:ifnull          11
		//    2    4:aload_1         
		//    3    5:invokevirtual   #95  <Method int KeyEvent.getAction()>
		//    4    8:ifeq            12
_L1:
			return;
		//    5   11:return          
_L2:
			long l;
			if(mState == null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   8   16:getfield        #99  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//*   9   19:ifnonnull       122
				l = 0L;
		//   10   22:lconst_0        
		//   11   23:lstore_3        
			else
		//*  12   24:aload_1         
		//*  13   25:invokevirtual   #102 <Method int KeyEvent.getKeyCode()>
		//*  14   28:lookupswitch    9: default 112
		//		               79: 113
		//		               85: 113
		//		               86: 196
		//		               87: 166
		//		               88: 181
		//		               89: 224
		//		               90: 209
		//		               126: 136
		//		               127: 151
		//*  15  112:return          
		//*  16  113:ldc1            #104 <String "MediaSessionCompat">
		//*  17  115:ldc1            #106 <String "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already">
		//*  18  117:invokestatic    #112 <Method int Log.w(String, String)>
		//*  19  120:pop             
		//*  20  121:return          
				l = mState.getActions();
		//   21  122:aload_0         
		//   22  123:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   23  126:getfield        #99  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//   24  129:invokevirtual   #118 <Method long PlaybackStateCompat.getActions()>
		//   25  132:lstore_3        
			keyevent.getKeyCode();
			JVM INSTR lookupswitch 9: default 112
		//		               79: 113
		//		               85: 113
		//		               86: 196
		//		               87: 166
		//		               88: 181
		//		               89: 224
		//		               90: 209
		//		               126: 136
		//		               127: 151;
			   goto _L3 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L8:
			continue; /* Loop/switch isn't completed */
_L3:
			return;
_L4:
			Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
			return;
		//*  26  133:goto            24
_L10:
			if((4L & l) == 0L) goto _L1; else goto _L12
		//   27  136:ldc2w           #119 <Long 4L>
		//   28  139:lload_3         
		//   29  140:land            
		//   30  141:lconst_0        
		//   31  142:lcmp            
		//   32  143:ifeq            11
_L12:
			callback.onPlay();
		//   33  146:aload_2         
		//   34  147:invokevirtual   #126 <Method void MediaSessionCompat$Callback.onPlay()>
			return;
		//   35  150:return          
_L11:
			if((2L & l) == 0L) goto _L1; else goto _L13
		//   36  151:ldc2w           #127 <Long 2L>
		//   37  154:lload_3         
		//   38  155:land            
		//   39  156:lconst_0        
		//   40  157:lcmp            
		//   41  158:ifeq            11
_L13:
			callback.onPause();
		//   42  161:aload_2         
		//   43  162:invokevirtual   #131 <Method void MediaSessionCompat$Callback.onPause()>
			return;
		//   44  165:return          
_L6:
			if((32L & l) == 0L) goto _L1; else goto _L14
		//   45  166:ldc2w           #132 <Long 32L>
		//   46  169:lload_3         
		//   47  170:land            
		//   48  171:lconst_0        
		//   49  172:lcmp            
		//   50  173:ifeq            11
_L14:
			callback.onSkipToNext();
		//   51  176:aload_2         
		//   52  177:invokevirtual   #136 <Method void MediaSessionCompat$Callback.onSkipToNext()>
			return;
		//   53  180:return          
_L7:
			if((16L & l) == 0L) goto _L1; else goto _L15
		//   54  181:ldc2w           #137 <Long 16L>
		//   55  184:lload_3         
		//   56  185:land            
		//   57  186:lconst_0        
		//   58  187:lcmp            
		//   59  188:ifeq            11
_L15:
			callback.onSkipToPrevious();
		//   60  191:aload_2         
		//   61  192:invokevirtual   #141 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
			return;
		//   62  195:return          
_L5:
			if((1L & l) == 0L) goto _L1; else goto _L16
		//   63  196:lconst_1        
		//   64  197:lload_3         
		//   65  198:land            
		//   66  199:lconst_0        
		//   67  200:lcmp            
		//   68  201:ifeq            11
_L16:
			callback.onStop();
		//   69  204:aload_2         
		//   70  205:invokevirtual   #144 <Method void MediaSessionCompat$Callback.onStop()>
			return;
		//   71  208:return          
_L9:
			if((64L & l) == 0L) goto _L1; else goto _L17
		//   72  209:ldc2w           #145 <Long 64L>
		//   73  212:lload_3         
		//   74  213:land            
		//   75  214:lconst_0        
		//   76  215:lcmp            
		//   77  216:ifeq            11
_L17:
			callback.onFastForward();
		//   78  219:aload_2         
		//   79  220:invokevirtual   #149 <Method void MediaSessionCompat$Callback.onFastForward()>
			return;
		//   80  223:return          
			if((8L & l) == 0L) goto _L1; else goto _L18
		//   81  224:ldc2w           #150 <Long 8L>
		//   82  227:lload_3         
		//   83  228:land            
		//   84  229:lconst_0        
		//   85  230:lcmp            
		//   86  231:ifeq            11
_L18:
			callback.onRewind();
		//   87  234:aload_2         
		//   88  235:invokevirtual   #154 <Method void MediaSessionCompat$Callback.onRewind()>
			return;
		//   89  238:return          
		}

		public void handleMessage(Message message)
		{
			MediaSessionCompat.Callback callback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #160 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
		//    3    7:astore_2        
			if(callback != null) goto _L2; else goto _L1
		//    4    8:aload_2         
		//    5    9:ifnonnull       13
_L1:
			return;
		//    6   12:return          
_L2:
			switch(message.what)
		//*   7   13:aload_1         
		//*   8   14:getfield        #165 <Field int Message.what>
			{
		//*   9   17:tableswitch     1 31: default 156
		//		               1 157
		//		               2 547
		//		               3 223
		//		               4 228
		//		               5 244
		//		               6 260
		//		               7 276
		//		               8 281
		//		               9 297
		//		               10 313
		//		               11 329
		//		               12 344
		//		               13 349
		//		               14 354
		//		               15 359
		//		               16 364
		//		               17 369
		//		               18 374
		//		               19 389
		//		               20 417
		//		               21 182
		//		               22 560
		//		               23 588
		//		               24 597
		//		               25 433
		//		               26 445
		//		               27 461
		//		               28 473
		//		               29 573
		//		               30 612
		//		               31 401
			default:
				return;
		//   10  156:return          

			case 2: // '\002'
				break; /* Loop/switch isn't completed */

			case 22: // '\026'
				break MISSING_BLOCK_LABEL_560;

			case 23: // '\027'
				break MISSING_BLOCK_LABEL_588;

			case 24: // '\030'
				break MISSING_BLOCK_LABEL_597;

			case 29: // '\035'
				break MISSING_BLOCK_LABEL_573;

			case 30: // '\036'
				break MISSING_BLOCK_LABEL_612;

			case 1: // '\001'
				message = ((Message) ((Command)message.obj));
		//   11  157:aload_1         
		//   12  158:getfield        #169 <Field Object Message.obj>
		//   13  161:checkcast       #171 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//   14  164:astore_1        
				callback.onCommand(((Command) (message)).command, ((Command) (message)).extras, ((Command) (message)).stub);
		//   15  165:aload_2         
		//   16  166:aload_1         
		//   17  167:getfield        #175 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
		//   18  170:aload_1         
		//   19  171:getfield        #179 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
		//   20  174:aload_1         
		//   21  175:getfield        #183 <Field ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
		//   22  178:invokevirtual   #187 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
				return;
		//   23  181:return          

			case 21: // '\025'
				message = ((Message) ((KeyEvent)message.obj));
		//   24  182:aload_1         
		//   25  183:getfield        #169 <Field Object Message.obj>
		//   26  186:checkcast       #91  <Class KeyEvent>
		//   27  189:astore_1        
				Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
		//   28  190:new             #189 <Class Intent>
		//   29  193:dup             
		//   30  194:ldc1            #191 <String "android.intent.action.MEDIA_BUTTON">
		//   31  196:invokespecial   #194 <Method void Intent(String)>
		//   32  199:astore_3        
				intent.putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (message)));
		//   33  200:aload_3         
		//   34  201:ldc1            #196 <String "android.intent.extra.KEY_EVENT">
		//   35  203:aload_1         
		//   36  204:invokevirtual   #200 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//   37  207:pop             
				if(!callback.onMediaButtonEvent(intent))
		//*  38  208:aload_2         
		//*  39  209:aload_3         
		//*  40  210:invokevirtual   #203 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//*  41  213:ifne            12
				{
					onMediaButtonEvent(((KeyEvent) (message)), callback);
		//   42  216:aload_0         
		//   43  217:aload_1         
		//   44  218:aload_2         
		//   45  219:invokespecial   #205 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
					return;
		//   46  222:return          
				}
				break;

			case 3: // '\003'
				callback.onPrepare();
		//   47  223:aload_2         
		//   48  224:invokevirtual   #208 <Method void MediaSessionCompat$Callback.onPrepare()>
				return;
		//   49  227:return          

			case 4: // '\004'
				callback.onPrepareFromMediaId((String)message.obj, message.getData());
		//   50  228:aload_2         
		//   51  229:aload_1         
		//   52  230:getfield        #169 <Field Object Message.obj>
		//   53  233:checkcast       #210 <Class String>
		//   54  236:aload_1         
		//   55  237:invokevirtual   #214 <Method Bundle Message.getData()>
		//   56  240:invokevirtual   #218 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
				return;
		//   57  243:return          

			case 5: // '\005'
				callback.onPrepareFromSearch((String)message.obj, message.getData());
		//   58  244:aload_2         
		//   59  245:aload_1         
		//   60  246:getfield        #169 <Field Object Message.obj>
		//   61  249:checkcast       #210 <Class String>
		//   62  252:aload_1         
		//   63  253:invokevirtual   #214 <Method Bundle Message.getData()>
		//   64  256:invokevirtual   #221 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
				return;
		//   65  259:return          

			case 6: // '\006'
				callback.onPrepareFromUri((Uri)message.obj, message.getData());
		//   66  260:aload_2         
		//   67  261:aload_1         
		//   68  262:getfield        #169 <Field Object Message.obj>
		//   69  265:checkcast       #223 <Class Uri>
		//   70  268:aload_1         
		//   71  269:invokevirtual   #214 <Method Bundle Message.getData()>
		//   72  272:invokevirtual   #227 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
				return;
		//   73  275:return          

			case 7: // '\007'
				callback.onPlay();
		//   74  276:aload_2         
		//   75  277:invokevirtual   #126 <Method void MediaSessionCompat$Callback.onPlay()>
				return;
		//   76  280:return          

			case 8: // '\b'
				callback.onPlayFromMediaId((String)message.obj, message.getData());
		//   77  281:aload_2         
		//   78  282:aload_1         
		//   79  283:getfield        #169 <Field Object Message.obj>
		//   80  286:checkcast       #210 <Class String>
		//   81  289:aload_1         
		//   82  290:invokevirtual   #214 <Method Bundle Message.getData()>
		//   83  293:invokevirtual   #230 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
				return;
		//   84  296:return          

			case 9: // '\t'
				callback.onPlayFromSearch((String)message.obj, message.getData());
		//   85  297:aload_2         
		//   86  298:aload_1         
		//   87  299:getfield        #169 <Field Object Message.obj>
		//   88  302:checkcast       #210 <Class String>
		//   89  305:aload_1         
		//   90  306:invokevirtual   #214 <Method Bundle Message.getData()>
		//   91  309:invokevirtual   #233 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
				return;
		//   92  312:return          

			case 10: // '\n'
				callback.onPlayFromUri((Uri)message.obj, message.getData());
		//   93  313:aload_2         
		//   94  314:aload_1         
		//   95  315:getfield        #169 <Field Object Message.obj>
		//   96  318:checkcast       #223 <Class Uri>
		//   97  321:aload_1         
		//   98  322:invokevirtual   #214 <Method Bundle Message.getData()>
		//   99  325:invokevirtual   #236 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
				return;
		//  100  328:return          

			case 11: // '\013'
				callback.onSkipToQueueItem(((Long)message.obj).longValue());
		//  101  329:aload_2         
		//  102  330:aload_1         
		//  103  331:getfield        #169 <Field Object Message.obj>
		//  104  334:checkcast       #238 <Class Long>
		//  105  337:invokevirtual   #241 <Method long Long.longValue()>
		//  106  340:invokevirtual   #245 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
				return;
		//  107  343:return          

			case 12: // '\f'
				callback.onPause();
		//  108  344:aload_2         
		//  109  345:invokevirtual   #131 <Method void MediaSessionCompat$Callback.onPause()>
				return;
		//  110  348:return          

			case 13: // '\r'
				callback.onStop();
		//  111  349:aload_2         
		//  112  350:invokevirtual   #144 <Method void MediaSessionCompat$Callback.onStop()>
				return;
		//  113  353:return          

			case 14: // '\016'
				callback.onSkipToNext();
		//  114  354:aload_2         
		//  115  355:invokevirtual   #136 <Method void MediaSessionCompat$Callback.onSkipToNext()>
				return;
		//  116  358:return          

			case 15: // '\017'
				callback.onSkipToPrevious();
		//  117  359:aload_2         
		//  118  360:invokevirtual   #141 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
				return;
		//  119  363:return          

			case 16: // '\020'
				callback.onFastForward();
		//  120  364:aload_2         
		//  121  365:invokevirtual   #149 <Method void MediaSessionCompat$Callback.onFastForward()>
				return;
		//  122  368:return          

			case 17: // '\021'
				callback.onRewind();
		//  123  369:aload_2         
		//  124  370:invokevirtual   #154 <Method void MediaSessionCompat$Callback.onRewind()>
				return;
		//  125  373:return          

			case 18: // '\022'
				callback.onSeekTo(((Long)message.obj).longValue());
		//  126  374:aload_2         
		//  127  375:aload_1         
		//  128  376:getfield        #169 <Field Object Message.obj>
		//  129  379:checkcast       #238 <Class Long>
		//  130  382:invokevirtual   #241 <Method long Long.longValue()>
		//  131  385:invokevirtual   #248 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
				return;
		//  132  388:return          

			case 19: // '\023'
				callback.onSetRating((RatingCompat)message.obj);
		//  133  389:aload_2         
		//  134  390:aload_1         
		//  135  391:getfield        #169 <Field Object Message.obj>
		//  136  394:checkcast       #250 <Class RatingCompat>
		//  137  397:invokevirtual   #254 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
				return;
		//  138  400:return          

			case 31: // '\037'
				callback.onSetRating((RatingCompat)message.obj, message.getData());
		//  139  401:aload_2         
		//  140  402:aload_1         
		//  141  403:getfield        #169 <Field Object Message.obj>
		//  142  406:checkcast       #250 <Class RatingCompat>
		//  143  409:aload_1         
		//  144  410:invokevirtual   #214 <Method Bundle Message.getData()>
		//  145  413:invokevirtual   #257 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
				return;
		//  146  416:return          

			case 20: // '\024'
				callback.onCustomAction((String)message.obj, message.getData());
		//  147  417:aload_2         
		//  148  418:aload_1         
		//  149  419:getfield        #169 <Field Object Message.obj>
		//  150  422:checkcast       #210 <Class String>
		//  151  425:aload_1         
		//  152  426:invokevirtual   #214 <Method Bundle Message.getData()>
		//  153  429:invokevirtual   #260 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
				return;
		//  154  432:return          

			case 25: // '\031'
				callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
		//  155  433:aload_2         
		//  156  434:aload_1         
		//  157  435:getfield        #169 <Field Object Message.obj>
		//  158  438:checkcast       #262 <Class MediaDescriptionCompat>
		//  159  441:invokevirtual   #266 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
				return;
		//  160  444:return          

			case 26: // '\032'
				callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
		//  161  445:aload_2         
		//  162  446:aload_1         
		//  163  447:getfield        #169 <Field Object Message.obj>
		//  164  450:checkcast       #262 <Class MediaDescriptionCompat>
		//  165  453:aload_1         
		//  166  454:getfield        #269 <Field int Message.arg1>
		//  167  457:invokevirtual   #272 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
				return;
		//  168  460:return          

			case 27: // '\033'
				callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
		//  169  461:aload_2         
		//  170  462:aload_1         
		//  171  463:getfield        #169 <Field Object Message.obj>
		//  172  466:checkcast       #262 <Class MediaDescriptionCompat>
		//  173  469:invokevirtual   #275 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
				return;
		//  174  472:return          

			case 28: // '\034'
				if(mQueue != null)
					break MISSING_BLOCK_LABEL_483;
		//  175  473:aload_0         
		//  176  474:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  177  477:getfield        #279 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//  178  480:ifnull          12
				break;
			}
			if(true) goto _L1; else goto _L3
_L3:
			break; /* Loop/switch isn't completed */
			if(message.arg1 >= 0 && message.arg1 < mQueue.size())
		//* 179  483:aload_1         
		//* 180  484:getfield        #269 <Field int Message.arg1>
		//* 181  487:iflt            542
		//* 182  490:aload_1         
		//* 183  491:getfield        #269 <Field int Message.arg1>
		//* 184  494:aload_0         
		//* 185  495:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//* 186  498:getfield        #279 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//* 187  501:invokeinterface #284 <Method int List.size()>
		//* 188  506:icmpge          542
				message = ((Message) ((MediaSessionCompat.QueueItem)mQueue.get(message.arg1)));
		//  189  509:aload_0         
		//  190  510:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  191  513:getfield        #279 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//  192  516:aload_1         
		//  193  517:getfield        #269 <Field int Message.arg1>
		//  194  520:invokeinterface #288 <Method Object List.get(int)>
		//  195  525:checkcast       #290 <Class MediaSessionCompat$QueueItem>
		//  196  528:astore_1        
			else
		//* 197  529:aload_1         
		//* 198  530:ifnull          12
		//* 199  533:aload_2         
		//* 200  534:aload_1         
		//* 201  535:invokevirtual   #294 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
		//* 202  538:invokevirtual   #275 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
		//* 203  541:return          
				message = null;
		//  204  542:aconst_null     
		//  205  543:astore_1        
			if(message != null)
			{
				callback.onRemoveQueueItem(((MediaSessionCompat.QueueItem) (message)).getDescription());
				return;
			}
			if(true) goto _L1; else goto _L4
		//  206  544:goto            529
_L4:
			adjustVolume(message.arg1, 0);
		//  207  547:aload_0         
		//  208  548:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  209  551:aload_1         
		//  210  552:getfield        #269 <Field int Message.arg1>
		//  211  555:iconst_0        
		//  212  556:invokevirtual   #298 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
			return;
		//  213  559:return          
			setVolumeTo(message.arg1, 0);
		//  214  560:aload_0         
		//  215  561:getfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  216  564:aload_1         
		//  217  565:getfield        #269 <Field int Message.arg1>
		//  218  568:iconst_0        
		//  219  569:invokevirtual   #301 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
			return;
		//  220  572:return          
			callback.onSetCaptioningEnabled(((Boolean)message.obj).booleanValue());
		//  221  573:aload_2         
		//  222  574:aload_1         
		//  223  575:getfield        #169 <Field Object Message.obj>
		//  224  578:checkcast       #303 <Class Boolean>
		//  225  581:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
		//  226  584:invokevirtual   #311 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
			return;
		//  227  587:return          
			callback.onSetRepeatMode(message.arg1);
		//  228  588:aload_2         
		//  229  589:aload_1         
		//  230  590:getfield        #269 <Field int Message.arg1>
		//  231  593:invokevirtual   #315 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
			return;
		//  232  596:return          
			callback.onSetShuffleModeEnabled(((Boolean)message.obj).booleanValue());
		//  233  597:aload_2         
		//  234  598:aload_1         
		//  235  599:getfield        #169 <Field Object Message.obj>
		//  236  602:checkcast       #303 <Class Boolean>
		//  237  605:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
		//  238  608:invokevirtual   #318 <Method void MediaSessionCompat$Callback.onSetShuffleModeEnabled(boolean)>
			return;
		//  239  611:return          
			callback.onSetShuffleMode(message.arg1);
		//  240  612:aload_2         
		//  241  613:aload_1         
		//  242  614:getfield        #269 <Field int Message.arg1>
		//  243  617:invokevirtual   #321 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
			return;
		//  244  620:return          
		}

		public void post(int i)
		{
			post(i, ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aconst_null     
		//    3    3:invokevirtual   #325 <Method void post(int, Object)>
		//    4    6:return          
		}

		public void post(int i, Object obj)
		{
			obtainMessage(i, obj).sendToTarget();
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #329 <Method Message obtainMessage(int, Object)>
		//    4    6:invokevirtual   #332 <Method void Message.sendToTarget()>
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
		//    5    5:invokevirtual   #336 <Method Message obtainMessage(int, int, int, Object)>
		//    6    8:invokevirtual   #332 <Method void Message.sendToTarget()>
		//    7   11:return          
		}

		public void post(int i, Object obj, Bundle bundle)
		{
			obj = ((Object) (obtainMessage(i, obj)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #329 <Method Message obtainMessage(int, Object)>
		//    4    6:astore_2        
			((Message) (obj)).setData(bundle);
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #341 <Method void Message.setData(Bundle)>
			((Message) (obj)).sendToTarget();
		//    8   12:aload_2         
		//    9   13:invokevirtual   #332 <Method void Message.sendToTarget()>
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
		private static final int MSG_RATE_EXTRA = 31;
		private static final int MSG_REMOVE_QUEUE_ITEM = 27;
		private static final int MSG_REMOVE_QUEUE_ITEM_AT = 28;
		private static final int MSG_REWIND = 17;
		private static final int MSG_SEEK_TO = 18;
		private static final int MSG_SET_CAPTIONING_ENABLED = 29;
		private static final int MSG_SET_REPEAT_MODE = 23;
		private static final int MSG_SET_SHUFFLE_MODE = 30;
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
		//    2    2:putfield        #83  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #86  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}


	private void sendCaptioningEnabled(boolean flag)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onCaptioningEnabledChanged(flag);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #177 <Method void IMediaControllerCallback.onCaptioningEnabledChanged(boolean)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			i--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	private void sendEvent(String s, Bundle bundle)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_3        
		while(i >= 0) 
	//*   6   10:iload_3         
	//*   7   11:iflt            43
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore          4
			try
			{
				imediacontrollercallback.onEvent(s, bundle);
	//   14   27:aload           4
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokeinterface #185 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
			}
	//*  18   36:iload_3         
	//*  19   37:iconst_1        
	//*  20   38:isub            
	//*  21   39:istore_3        
	//*  22   40:goto            10
	//*  23   43:aload_0         
	//*  24   44:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  25   47:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  26   50:return          
			catch(RemoteException remoteexception) { }
	//   27   51:astore          4
			i--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  28   53:goto            36
	}

	private void sendExtras(Bundle bundle)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onExtrasChanged(bundle);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #190 <Method void IMediaControllerCallback.onExtrasChanged(Bundle)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			i--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	private void sendMetadata(MediaMetadataCompat mediametadatacompat)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onMetadataChanged(mediametadatacompat);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #195 <Method void IMediaControllerCallback.onMetadataChanged(MediaMetadataCompat)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			i--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	private void sendQueue(List list)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onQueueChanged(list);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #200 <Method void IMediaControllerCallback.onQueueChanged(List)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			i--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	private void sendQueueTitle(CharSequence charsequence)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onQueueTitleChanged(charsequence);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #207 <Method void IMediaControllerCallback.onQueueTitleChanged(CharSequence)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			i--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	private void sendRepeatMode(int i)
	{
		int j = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(j >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onRepeatModeChanged(i);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #212 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			j--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	private void sendSessionDestroyed()
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_1        
		while(i >= 0) 
	//*   6   10:iload_1         
	//*   7   11:iflt            39
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_2        
			try
			{
				imediacontrollercallback.onSessionDestroyed();
	//   14   26:aload_2         
	//   15   27:invokeinterface #216 <Method void IMediaControllerCallback.onSessionDestroyed()>
			}
	//*  16   32:iload_1         
	//*  17   33:iconst_1        
	//*  18   34:isub            
	//*  19   35:istore_1        
	//*  20   36:goto            10
	//*  21   39:aload_0         
	//*  22   40:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  23   43:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  24   46:aload_0         
	//*  25   47:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  26   50:invokevirtual   #219 <Method void RemoteCallbackList.kill()>
	//*  27   53:return          
			catch(RemoteException remoteexception) { }
	//   28   54:astore_2        
			i--;
		}
		mControllerCallbacks.finishBroadcast();
		mControllerCallbacks.kill();
	//*  29   55:goto            32
	}

	private void sendShuffleMode(int i)
	{
		int j = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(j >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onShuffleModeChanged(i);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #223 <Method void IMediaControllerCallback.onShuffleModeChanged(int)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			j--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	private void sendShuffleModeEnabled(boolean flag)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onShuffleModeChangedDeprecated(flag);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #227 <Method void IMediaControllerCallback.onShuffleModeChangedDeprecated(boolean)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			i--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	private void sendState(PlaybackStateCompat playbackstatecompat)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onPlaybackStateChanged(playbackstatecompat);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #232 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			i--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	void adjustVolume(int i, int j)
	{
		if(mVolumeType == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field int mVolumeType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          24
		{
			if(mVolumeProvider != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//*   6   12:ifnull          23
				mVolumeProvider.onAdjustVolume(i);
	//    7   15:aload_0         
	//    8   16:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #241 <Method void VolumeProviderCompat.onAdjustVolume(int)>
			return;
	//   11   23:return          
		} else
		{
			mAudioManager.adjustStreamVolume(mLocalStream, i, j);
	//   12   24:aload_0         
	//   13   25:getfield        #130 <Field AudioManager mAudioManager>
	//   14   28:aload_0         
	//   15   29:getfield        #152 <Field int mLocalStream>
	//   16   32:iload_1         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #245 <Method void AudioManager.adjustStreamVolume(int, int, int)>
			return;
	//   19   37:return          
		}
	}

	android.media.RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle)
	{
		android.media.RemoteControlClient.MetadataEditor metadataeditor = mRcc.editMetadata(true);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field RemoteControlClient mRcc>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #251 <Method android.media.RemoteControlClient$MetadataEditor RemoteControlClient.editMetadata(boolean)>
	//    4    8:astore          4
		if(bundle != null)
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       17
	//*   7   14:aload           4
	//*   8   16:areturn         
		{
			if(bundle.containsKey("android.media.metadata.ART"))
	//*   9   17:aload_1         
	//*  10   18:ldc1            #253 <String "android.media.metadata.ART">
	//*  11   20:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//*  12   23:ifeq            383
			{
				Bitmap bitmap2 = (Bitmap)bundle.getParcelable("android.media.metadata.ART");
	//   13   26:aload_1         
	//   14   27:ldc1            #253 <String "android.media.metadata.ART">
	//   15   29:invokevirtual   #263 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   16   32:checkcast       #265 <Class Bitmap>
	//   17   35:astore_3        
				Bitmap bitmap = bitmap2;
	//   18   36:aload_3         
	//   19   37:astore_2        
				if(bitmap2 != null)
	//*  20   38:aload_3         
	//*  21   39:ifnull          52
					bitmap = bitmap2.copy(bitmap2.getConfig(), false);
	//   22   42:aload_3         
	//   23   43:aload_3         
	//   24   44:invokevirtual   #269 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   25   47:iconst_0        
	//   26   48:invokevirtual   #273 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
	//   27   51:astore_2        
				metadataeditor.putBitmap(100, bitmap);
	//   28   52:aload           4
	//   29   54:bipush          100
	//   30   56:aload_2         
	//   31   57:invokevirtual   #279 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
	//   32   60:pop             
			} else
	//*  33   61:aload_1         
	//*  34   62:ldc2            #281 <String "android.media.metadata.ALBUM">
	//*  35   65:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//*  36   68:ifeq            85
	//*  37   71:aload           4
	//*  38   73:iconst_1        
	//*  39   74:aload_1         
	//*  40   75:ldc2            #281 <String "android.media.metadata.ALBUM">
	//*  41   78:invokevirtual   #285 <Method String Bundle.getString(String)>
	//*  42   81:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//*  43   84:pop             
	//*  44   85:aload_1         
	//*  45   86:ldc2            #291 <String "android.media.metadata.ALBUM_ARTIST">
	//*  46   89:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//*  47   92:ifeq            110
	//*  48   95:aload           4
	//*  49   97:bipush          13
	//*  50   99:aload_1         
	//*  51  100:ldc2            #291 <String "android.media.metadata.ALBUM_ARTIST">
	//*  52  103:invokevirtual   #285 <Method String Bundle.getString(String)>
	//*  53  106:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//*  54  109:pop             
	//*  55  110:aload_1         
	//*  56  111:ldc2            #293 <String "android.media.metadata.ARTIST">
	//*  57  114:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//*  58  117:ifeq            134
	//*  59  120:aload           4
	//*  60  122:iconst_2        
	//*  61  123:aload_1         
	//*  62  124:ldc2            #293 <String "android.media.metadata.ARTIST">
	//*  63  127:invokevirtual   #285 <Method String Bundle.getString(String)>
	//*  64  130:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//*  65  133:pop             
	//*  66  134:aload_1         
	//*  67  135:ldc2            #295 <String "android.media.metadata.AUTHOR">
	//*  68  138:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//*  69  141:ifeq            158
	//*  70  144:aload           4
	//*  71  146:iconst_3        
	//*  72  147:aload_1         
	//*  73  148:ldc2            #295 <String "android.media.metadata.AUTHOR">
	//*  74  151:invokevirtual   #285 <Method String Bundle.getString(String)>
	//*  75  154:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//*  76  157:pop             
	//*  77  158:aload_1         
	//*  78  159:ldc2            #297 <String "android.media.metadata.COMPILATION">
	//*  79  162:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//*  80  165:ifeq            183
	//*  81  168:aload           4
	//*  82  170:bipush          15
	//*  83  172:aload_1         
	//*  84  173:ldc2            #297 <String "android.media.metadata.COMPILATION">
	//*  85  176:invokevirtual   #285 <Method String Bundle.getString(String)>
	//*  86  179:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//*  87  182:pop             
	//*  88  183:aload_1         
	//*  89  184:ldc2            #299 <String "android.media.metadata.COMPOSER">
	//*  90  187:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//*  91  190:ifeq            207
	//*  92  193:aload           4
	//*  93  195:iconst_4        
	//*  94  196:aload_1         
	//*  95  197:ldc2            #299 <String "android.media.metadata.COMPOSER">
	//*  96  200:invokevirtual   #285 <Method String Bundle.getString(String)>
	//*  97  203:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//*  98  206:pop             
	//*  99  207:aload_1         
	//* 100  208:ldc2            #301 <String "android.media.metadata.DATE">
	//* 101  211:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//* 102  214:ifeq            231
	//* 103  217:aload           4
	//* 104  219:iconst_5        
	//* 105  220:aload_1         
	//* 106  221:ldc2            #301 <String "android.media.metadata.DATE">
	//* 107  224:invokevirtual   #285 <Method String Bundle.getString(String)>
	//* 108  227:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//* 109  230:pop             
	//* 110  231:aload_1         
	//* 111  232:ldc2            #303 <String "android.media.metadata.DISC_NUMBER">
	//* 112  235:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//* 113  238:ifeq            256
	//* 114  241:aload           4
	//* 115  243:bipush          14
	//* 116  245:aload_1         
	//* 117  246:ldc2            #303 <String "android.media.metadata.DISC_NUMBER">
	//* 118  249:invokevirtual   #307 <Method long Bundle.getLong(String)>
	//* 119  252:invokevirtual   #311 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//* 120  255:pop             
	//* 121  256:aload_1         
	//* 122  257:ldc2            #313 <String "android.media.metadata.DURATION">
	//* 123  260:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//* 124  263:ifeq            281
	//* 125  266:aload           4
	//* 126  268:bipush          9
	//* 127  270:aload_1         
	//* 128  271:ldc2            #313 <String "android.media.metadata.DURATION">
	//* 129  274:invokevirtual   #307 <Method long Bundle.getLong(String)>
	//* 130  277:invokevirtual   #311 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//* 131  280:pop             
	//* 132  281:aload_1         
	//* 133  282:ldc2            #315 <String "android.media.metadata.GENRE">
	//* 134  285:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//* 135  288:ifeq            306
	//* 136  291:aload           4
	//* 137  293:bipush          6
	//* 138  295:aload_1         
	//* 139  296:ldc2            #315 <String "android.media.metadata.GENRE">
	//* 140  299:invokevirtual   #285 <Method String Bundle.getString(String)>
	//* 141  302:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//* 142  305:pop             
	//* 143  306:aload_1         
	//* 144  307:ldc2            #317 <String "android.media.metadata.TITLE">
	//* 145  310:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//* 146  313:ifeq            331
	//* 147  316:aload           4
	//* 148  318:bipush          7
	//* 149  320:aload_1         
	//* 150  321:ldc2            #317 <String "android.media.metadata.TITLE">
	//* 151  324:invokevirtual   #285 <Method String Bundle.getString(String)>
	//* 152  327:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//* 153  330:pop             
	//* 154  331:aload_1         
	//* 155  332:ldc2            #319 <String "android.media.metadata.TRACK_NUMBER">
	//* 156  335:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//* 157  338:ifeq            355
	//* 158  341:aload           4
	//* 159  343:iconst_0        
	//* 160  344:aload_1         
	//* 161  345:ldc2            #319 <String "android.media.metadata.TRACK_NUMBER">
	//* 162  348:invokevirtual   #307 <Method long Bundle.getLong(String)>
	//* 163  351:invokevirtual   #311 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//* 164  354:pop             
	//* 165  355:aload_1         
	//* 166  356:ldc2            #321 <String "android.media.metadata.WRITER">
	//* 167  359:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//* 168  362:ifeq            14
	//* 169  365:aload           4
	//* 170  367:bipush          11
	//* 171  369:aload_1         
	//* 172  370:ldc2            #321 <String "android.media.metadata.WRITER">
	//* 173  373:invokevirtual   #285 <Method String Bundle.getString(String)>
	//* 174  376:invokevirtual   #289 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//* 175  379:pop             
	//* 176  380:aload           4
	//* 177  382:areturn         
			if(bundle.containsKey("android.media.metadata.ALBUM_ART"))
	//* 178  383:aload_1         
	//* 179  384:ldc2            #323 <String "android.media.metadata.ALBUM_ART">
	//* 180  387:invokevirtual   #259 <Method boolean Bundle.containsKey(String)>
	//* 181  390:ifeq            61
			{
				Bitmap bitmap3 = (Bitmap)bundle.getParcelable("android.media.metadata.ALBUM_ART");
	//  182  393:aload_1         
	//  183  394:ldc2            #323 <String "android.media.metadata.ALBUM_ART">
	//  184  397:invokevirtual   #263 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  185  400:checkcast       #265 <Class Bitmap>
	//  186  403:astore_3        
				Bitmap bitmap1 = bitmap3;
	//  187  404:aload_3         
	//  188  405:astore_2        
				if(bitmap3 != null)
	//* 189  406:aload_3         
	//* 190  407:ifnull          420
					bitmap1 = bitmap3.copy(bitmap3.getConfig(), false);
	//  191  410:aload_3         
	//  192  411:aload_3         
	//  193  412:invokevirtual   #269 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//  194  415:iconst_0        
	//  195  416:invokevirtual   #273 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
	//  196  419:astore_2        
				metadataeditor.putBitmap(100, bitmap1);
	//  197  420:aload           4
	//  198  422:bipush          100
	//  199  424:aload_2         
	//  200  425:invokevirtual   #279 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
	//  201  428:pop             
			}
			if(bundle.containsKey("android.media.metadata.ALBUM"))
				metadataeditor.putString(1, bundle.getString("android.media.metadata.ALBUM"));
			if(bundle.containsKey("android.media.metadata.ALBUM_ARTIST"))
				metadataeditor.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
			if(bundle.containsKey("android.media.metadata.ARTIST"))
				metadataeditor.putString(2, bundle.getString("android.media.metadata.ARTIST"));
			if(bundle.containsKey("android.media.metadata.AUTHOR"))
				metadataeditor.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
			if(bundle.containsKey("android.media.metadata.COMPILATION"))
				metadataeditor.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
			if(bundle.containsKey("android.media.metadata.COMPOSER"))
				metadataeditor.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
			if(bundle.containsKey("android.media.metadata.DATE"))
				metadataeditor.putString(5, bundle.getString("android.media.metadata.DATE"));
			if(bundle.containsKey("android.media.metadata.DISC_NUMBER"))
				metadataeditor.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
			if(bundle.containsKey("android.media.metadata.DURATION"))
				metadataeditor.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
			if(bundle.containsKey("android.media.metadata.GENRE"))
				metadataeditor.putString(6, bundle.getString("android.media.metadata.GENRE"));
			if(bundle.containsKey("android.media.metadata.TITLE"))
				metadataeditor.putString(7, bundle.getString("android.media.metadata.TITLE"));
			if(bundle.containsKey("android.media.metadata.TRACK_NUMBER"))
				metadataeditor.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
			if(bundle.containsKey("android.media.metadata.WRITER"))
			{
				metadataeditor.putString(11, bundle.getString("android.media.metadata.WRITER"));
				return metadataeditor;
			}
		}
		return metadataeditor;
	//* 202  429:goto            61
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

	public PlaybackStateCompat getPlaybackState()
	{
		PlaybackStateCompat playbackstatecompat;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			playbackstatecompat = mState;
	//    5    7:aload_0         
	//    6    8:getfield        #330 <Field PlaybackStateCompat mState>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return playbackstatecompat;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	int getRccStateFromState(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 11: default 64
	//	               0 74
	//	               1 88
	//	               2 76
	//	               3 78
	//	               4 72
	//	               5 80
	//	               6 66
	//	               7 69
	//	               8 66
	//	               9 82
	//	               10 85
	//	               11 85
		default:
			return -1;
	//    2   64:iconst_m1       
	//    3   65:ireturn         

		case 6: // '\006'
		case 8: // '\b'
			return 8;
	//    4   66:bipush          8
	//    5   68:ireturn         

		case 7: // '\007'
			return 9;
	//    6   69:bipush          9
	//    7   71:ireturn         

		case 4: // '\004'
			return 4;
	//    8   72:iconst_4        
	//    9   73:ireturn         

		case 0: // '\0'
			return 0;
	//   10   74:iconst_0        
	//   11   75:ireturn         

		case 2: // '\002'
			return 2;
	//   12   76:iconst_2        
	//   13   77:ireturn         

		case 3: // '\003'
			return 3;
	//   14   78:iconst_3        
	//   15   79:ireturn         

		case 5: // '\005'
			return 5;
	//   16   80:iconst_5        
	//   17   81:ireturn         

		case 9: // '\t'
			return 7;
	//   18   82:bipush          7
	//   19   84:ireturn         

		case 10: // '\n'
		case 11: // '\013'
			return 6;
	//   20   85:bipush          6
	//   21   87:ireturn         

		case 1: // '\001'
			return 1;
	//   22   88:iconst_1        
	//   23   89:ireturn         
		}
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
	//*   7    8:ifeq            17
			j = 0 | 0x20;
	//    8   11:iconst_0        
	//    9   12:bipush          32
	//   10   14:ior             
	//   11   15:istore          4
		int i = j;
	//   12   17:iload           4
	//   13   19:istore_3        
		if((2L & l) != 0L)
	//*  14   20:ldc2w           #335 <Long 2L>
	//*  15   23:lload_1         
	//*  16   24:land            
	//*  17   25:lconst_0        
	//*  18   26:lcmp            
	//*  19   27:ifeq            36
			i = j | 0x10;
	//   20   30:iload           4
	//   21   32:bipush          16
	//   22   34:ior             
	//   23   35:istore_3        
		j = i;
	//   24   36:iload_3         
	//   25   37:istore          4
		if((4L & l) != 0L)
	//*  26   39:ldc2w           #337 <Long 4L>
	//*  27   42:lload_1         
	//*  28   43:land            
	//*  29   44:lconst_0        
	//*  30   45:lcmp            
	//*  31   46:ifeq            54
			j = i | 4;
	//   32   49:iload_3         
	//   33   50:iconst_4        
	//   34   51:ior             
	//   35   52:istore          4
		i = j;
	//   36   54:iload           4
	//   37   56:istore_3        
		if((8L & l) != 0L)
	//*  38   57:ldc2w           #339 <Long 8L>
	//*  39   60:lload_1         
	//*  40   61:land            
	//*  41   62:lconst_0        
	//*  42   63:lcmp            
	//*  43   64:ifeq            72
			i = j | 2;
	//   44   67:iload           4
	//   45   69:iconst_2        
	//   46   70:ior             
	//   47   71:istore_3        
		j = i;
	//   48   72:iload_3         
	//   49   73:istore          4
		if((16L & l) != 0L)
	//*  50   75:ldc2w           #341 <Long 16L>
	//*  51   78:lload_1         
	//*  52   79:land            
	//*  53   80:lconst_0        
	//*  54   81:lcmp            
	//*  55   82:ifeq            90
			j = i | 1;
	//   56   85:iload_3         
	//   57   86:iconst_1        
	//   58   87:ior             
	//   59   88:istore          4
		i = j;
	//   60   90:iload           4
	//   61   92:istore_3        
		if((32L & l) != 0L)
	//*  62   93:ldc2w           #343 <Long 32L>
	//*  63   96:lload_1         
	//*  64   97:land            
	//*  65   98:lconst_0        
	//*  66   99:lcmp            
	//*  67  100:ifeq            110
			i = j | 0x80;
	//   68  103:iload           4
	//   69  105:sipush          128
	//   70  108:ior             
	//   71  109:istore_3        
		j = i;
	//   72  110:iload_3         
	//   73  111:istore          4
		if((64L & l) != 0L)
	//*  74  113:ldc2w           #345 <Long 64L>
	//*  75  116:lload_1         
	//*  76  117:land            
	//*  77  118:lconst_0        
	//*  78  119:lcmp            
	//*  79  120:ifeq            129
			j = i | 0x40;
	//   80  123:iload_3         
	//   81  124:bipush          64
	//   82  126:ior             
	//   83  127:istore          4
		i = j;
	//   84  129:iload           4
	//   85  131:istore_3        
		if((512L & l) != 0L)
	//*  86  132:ldc2w           #347 <Long 512L>
	//*  87  135:lload_1         
	//*  88  136:land            
	//*  89  137:lconst_0        
	//*  90  138:lcmp            
	//*  91  139:ifeq            148
			i = j | 8;
	//   92  142:iload           4
	//   93  144:bipush          8
	//   94  146:ior             
	//   95  147:istore_3        
		return i;
	//   96  148:iload_3         
	//   97  149:ireturn         
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
	//    1    1:getfield        #146 <Field MediaSessionCompat$Token mToken>
	//    2    4:areturn         
	}

	public boolean isActive()
	{
		return mIsActive;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field boolean mIsActive>
	//    2    4:ireturn         
	}

	void postToHandler(int i)
	{
		postToHandler(i, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #357 <Method void postToHandler(int, Object)>
	//    4    6:return          
	}

	void postToHandler(int i, int j)
	{
		postToHandler(i, ((Object) (null)), j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:invokevirtual   #360 <Method void postToHandler(int, Object, int)>
	//    5    7:return          
	}

	void postToHandler(int i, Object obj)
	{
		postToHandler(i, obj, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #363 <Method void postToHandler(int, Object, Bundle)>
	//    5    7:return          
	}

	void postToHandler(int i, Object obj, int j)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field Object mLock>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			if(mHandler != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//*   7   13:ifnull          26
				mHandler.post(i, obj, j);
	//    8   16:aload_0         
	//    9   17:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:iload_3         
	//   13   23:invokevirtual   #368 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.post(int, Object, int)>
		}
	//   14   26:aload           4
	//   15   28:monitorexit     
		return;
	//   16   29:return          
		obj;
	//   17   30:astore_2        
		obj1;
	//   18   31:aload           4
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw obj;
	//   20   34:aload_2         
	//   21   35:athrow          
	}

	void postToHandler(int i, Object obj, Bundle bundle)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field Object mLock>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			if(mHandler != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//*   7   13:ifnull          26
				mHandler.post(i, obj, bundle);
	//    8   16:aload_0         
	//    9   17:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #370 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.post(int, Object, Bundle)>
		}
	//   14   26:aload           4
	//   15   28:monitorexit     
		return;
	//   16   29:return          
		obj;
	//   17   30:astore_2        
		obj1;
	//   18   31:aload           4
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw obj;
	//   20   34:aload_2         
	//   21   35:athrow          
	}

	void registerMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
	{
		mAudioManager.registerMediaButtonEventReceiver(componentname);
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field AudioManager mAudioManager>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #375 <Method void AudioManager.registerMediaButtonEventReceiver(ComponentName)>
	//    4    8:return          
	}

	public void release()
	{
		mIsActive = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #94  <Field boolean mIsActive>
		mDestroyed = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #92  <Field boolean mDestroyed>
		update();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #379 <Method boolean update()>
	//    8   14:pop             
		sendSessionDestroyed();
	//    9   15:aload_0         
	//   10   16:invokespecial   #381 <Method void sendSessionDestroyed()>
	//   11   19:return          
	}

	public void sendSessionEvent(String s, Bundle bundle)
	{
		sendEvent(s, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #384 <Method void sendEvent(String, Bundle)>
	//    4    6:return          
	}

	void sendVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #168 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #172 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #174 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onVolumeInfoChanged(parcelablevolumeinfo);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #389 <Method void IMediaControllerCallback.onVolumeInfoChanged(ParcelableVolumeInfo)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #90  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #180 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			i--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	public void setActive(boolean flag)
	{
		if(flag != mIsActive)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #94  <Field boolean mIsActive>
	//*   3    5:icmpne          9
	//*   4    8:return          
		{
			mIsActive = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #94  <Field boolean mIsActive>
			if(update())
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #379 <Method boolean update()>
	//*  10   18:ifeq            8
			{
				setMetadata(mMetadata);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #392 <Field MediaMetadataCompat mMetadata>
	//   14   26:invokevirtual   #395 <Method void setMetadata(MediaMetadataCompat)>
				setPlaybackState(mState);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #330 <Field PlaybackStateCompat mState>
	//   18   34:invokevirtual   #398 <Method void setPlaybackState(PlaybackStateCompat)>
				return;
	//   19   37:return          
			}
		}
	}

	public void setCallback(MediaSessionCompat.Callback callback, Handler handler)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #402 <Field MediaSessionCompat$Callback mCallback>
		if(callback != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          78
		{
			callback = ((MediaSessionCompat.Callback) (handler));
	//    5    9:aload_2         
	//    6   10:astore_1        
			if(handler == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       23
				callback = ((MediaSessionCompat.Callback) (new Handler()));
	//    9   15:new             #404 <Class Handler>
	//   10   18:dup             
	//   11   19:invokespecial   #405 <Method void Handler()>
	//   12   22:astore_1        
			synchronized(mLock)
	//*  13   23:aload_0         
	//*  14   24:getfield        #85  <Field Object mLock>
	//*  15   27:astore_2        
	//*  16   28:aload_2         
	//*  17   29:monitorenter    
			{
				if(mHandler != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//*  20   34:ifnull          45
					mHandler.removeCallbacksAndMessages(((Object) (null)));
	//   21   37:aload_0         
	//   22   38:getfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//   23   41:aconst_null     
	//   24   42:invokevirtual   #408 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.removeCallbacksAndMessages(Object)>
				mHandler = new MessageHandler(((Handler) (callback)).getLooper());
	//   25   45:aload_0         
	//   26   46:new             #19  <Class MediaSessionCompat$MediaSessionImplBase$MessageHandler>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #412 <Method Looper Handler.getLooper()>
	//   31   55:invokespecial   #415 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler(MediaSessionCompat$MediaSessionImplBase, Looper)>
	//   32   58:putfield        #365 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
				MediaSessionCompat.Callback.access$300(mCallback, ((MediaSessionCompat.MediaSessionImpl) (this)), ((Handler) (callback)));
	//   33   61:aload_0         
	//   34   62:getfield        #402 <Field MediaSessionCompat$Callback mCallback>
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:invokestatic    #421 <Method void MediaSessionCompat$Callback.access$300(MediaSessionCompat$Callback, MediaSessionCompat$MediaSessionImpl, Handler)>
			}
	//   38   70:aload_2         
	//   39   71:monitorexit     
			return;
	//   40   72:return          
		} else
	//*  41   73:astore_1        
	//*  42   74:aload_2         
	//*  43   75:monitorexit     
	//*  44   76:aload_1         
	//*  45   77:athrow          
		{
			return;
	//   46   78:return          
		}
		callback;
		handler;
		JVM INSTR monitorexit ;
		throw callback;
	}

	public void setCaptioningEnabled(boolean flag)
	{
		if(mCaptioningEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #424 <Field boolean mCaptioningEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mCaptioningEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #424 <Field boolean mCaptioningEnabled>
			sendCaptioningEnabled(flag);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #426 <Method void sendCaptioningEnabled(boolean)>
		}
	//   10   18:return          
	}

	public void setExtras(Bundle bundle)
	{
		mExtras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #429 <Field Bundle mExtras>
		sendExtras(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #431 <Method void sendExtras(Bundle)>
	//    6   10:return          
	}

	public void setFlags(int i)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mFlags = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #434 <Field int mFlags>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		update();
	//   10   14:aload_0         
	//   11   15:invokevirtual   #379 <Method boolean update()>
	//   12   18:pop             
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_3        
		obj;
	//   15   21:aload_2         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_3         
	//   18   24:athrow          
	}

	public void setMediaButtonReceiver(PendingIntent pendingintent)
	{
	//    0    0:return          
	}

	public void setMetadata(MediaMetadataCompat mediametadatacompat)
	{
		obj = ((Object) (mediametadatacompat));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(mediametadatacompat != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          21
			obj = ((Object) ((new android.support.v4.media.MediaMetadataCompat.Builder(mediametadatacompat, MediaSessionCompat.sMaxBitmapSize)).build()));
	//    4    6:new             #437 <Class android.support.v4.media.MediaMetadataCompat$Builder>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:getstatic       #440 <Field int MediaSessionCompat.sMaxBitmapSize>
	//    8   14:invokespecial   #443 <Method void android.support.v4.media.MediaMetadataCompat$Builder(MediaMetadataCompat, int)>
	//    9   17:invokevirtual   #447 <Method MediaMetadataCompat android.support.v4.media.MediaMetadataCompat$Builder.build()>
	//   10   20:astore_2        
		synchronized(mLock)
	//*  11   21:aload_0         
	//*  12   22:getfield        #85  <Field Object mLock>
	//*  13   25:astore_1        
	//*  14   26:aload_1         
	//*  15   27:monitorenter    
		{
			mMetadata = ((MediaMetadataCompat) (obj));
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:putfield        #392 <Field MediaMetadataCompat mMetadata>
		}
	//   19   33:aload_1         
	//   20   34:monitorexit     
		sendMetadata(((MediaMetadataCompat) (obj)));
	//   21   35:aload_0         
	//   22   36:aload_2         
	//   23   37:invokespecial   #449 <Method void sendMetadata(MediaMetadataCompat)>
		if(!mIsActive)
	//*  24   40:aload_0         
	//*  25   41:getfield        #94  <Field boolean mIsActive>
	//*  26   44:ifne            53
			return;
	//   27   47:return          
		break MISSING_BLOCK_LABEL_53;
		obj;
	//   28   48:astore_2        
		mediametadatacompat;
	//   29   49:aload_1         
		JVM INSTR monitorexit ;
	//   30   50:monitorexit     
		throw obj;
	//   31   51:aload_2         
	//   32   52:athrow          
		if(obj == null)
	//*  33   53:aload_2         
	//*  34   54:ifnonnull       68
			mediametadatacompat = null;
	//   35   57:aconst_null     
	//   36   58:astore_1        
		else
	//*  37   59:aload_0         
	//*  38   60:aload_1         
	//*  39   61:invokevirtual   #451 <Method android.media.RemoteControlClient$MetadataEditor buildRccMetadata(Bundle)>
	//*  40   64:invokevirtual   #454 <Method void android.media.RemoteControlClient$MetadataEditor.apply()>
	//*  41   67:return          
			mediametadatacompat = ((MediaMetadataCompat) (((MediaMetadataCompat) (obj)).getBundle()));
	//   42   68:aload_2         
	//   43   69:invokevirtual   #460 <Method Bundle MediaMetadataCompat.getBundle()>
	//   44   72:astore_1        
		buildRccMetadata(((Bundle) (mediametadatacompat))).apply();
		return;
	//*  45   73:goto            59
	}

	public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mState = playbackstatecompat;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #330 <Field PlaybackStateCompat mState>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		sendState(playbackstatecompat);
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokespecial   #462 <Method void sendState(PlaybackStateCompat)>
		if(!mIsActive)
	//*  13   19:aload_0         
	//*  14   20:getfield        #94  <Field boolean mIsActive>
	//*  15   23:ifne            32
			return;
	//   16   26:return          
		break MISSING_BLOCK_LABEL_32;
		playbackstatecompat;
	//   17   27:astore_1        
		obj;
	//   18   28:aload_2         
		JVM INSTR monitorexit ;
	//   19   29:monitorexit     
		throw playbackstatecompat;
	//   20   30:aload_1         
	//   21   31:athrow          
		if(playbackstatecompat == null)
	//*  22   32:aload_1         
	//*  23   33:ifnonnull       53
		{
			mRcc.setPlaybackState(0);
	//   24   36:aload_0         
	//   25   37:getfield        #159 <Field RemoteControlClient mRcc>
	//   26   40:iconst_0        
	//   27   41:invokevirtual   #464 <Method void RemoteControlClient.setPlaybackState(int)>
			mRcc.setTransportControlFlags(0);
	//   28   44:aload_0         
	//   29   45:getfield        #159 <Field RemoteControlClient mRcc>
	//   30   48:iconst_0        
	//   31   49:invokevirtual   #467 <Method void RemoteControlClient.setTransportControlFlags(int)>
			return;
	//   32   52:return          
		} else
		{
			setRccState(playbackstatecompat);
	//   33   53:aload_0         
	//   34   54:aload_1         
	//   35   55:invokevirtual   #470 <Method void setRccState(PlaybackStateCompat)>
			mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackstatecompat.getActions()));
	//   36   58:aload_0         
	//   37   59:getfield        #159 <Field RemoteControlClient mRcc>
	//   38   62:aload_0         
	//   39   63:aload_1         
	//   40   64:invokevirtual   #476 <Method long PlaybackStateCompat.getActions()>
	//   41   67:invokevirtual   #478 <Method int getRccTransportControlFlagsFromActions(long)>
	//   42   70:invokevirtual   #467 <Method void RemoteControlClient.setTransportControlFlags(int)>
			return;
	//   43   73:return          
		}
	}

	public void setPlaybackToLocal(int i)
	{
		if(mVolumeProvider != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//*   2    4:ifnull          15
			mVolumeProvider.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #482 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
		mVolumeType = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #150 <Field int mVolumeType>
		sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, 2, mAudioManager.getStreamMaxVolume(mLocalStream), mAudioManager.getStreamVolume(mLocalStream)));
	//   10   20:aload_0         
	//   11   21:new             #484 <Class ParcelableVolumeInfo>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #150 <Field int mVolumeType>
	//   15   29:aload_0         
	//   16   30:getfield        #152 <Field int mLocalStream>
	//   17   33:iconst_2        
	//   18   34:aload_0         
	//   19   35:getfield        #130 <Field AudioManager mAudioManager>
	//   20   38:aload_0         
	//   21   39:getfield        #152 <Field int mLocalStream>
	//   22   42:invokevirtual   #487 <Method int AudioManager.getStreamMaxVolume(int)>
	//   23   45:aload_0         
	//   24   46:getfield        #130 <Field AudioManager mAudioManager>
	//   25   49:aload_0         
	//   26   50:getfield        #152 <Field int mLocalStream>
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
	//    2    4:new             #105 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #499 <String "volumeProvider may not be null">
	//    5   11:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(mVolumeProvider != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//*   9   19:ifnull          30
			mVolumeProvider.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #482 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
		mVolumeType = 2;
	//   14   30:aload_0         
	//   15   31:iconst_2        
	//   16   32:putfield        #150 <Field int mVolumeType>
		mVolumeProvider = volumeprovidercompat;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #236 <Field VolumeProviderCompat mVolumeProvider>
		sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, mVolumeProvider.getVolumeControl(), mVolumeProvider.getMaxVolume(), mVolumeProvider.getCurrentVolume()));
	//   20   40:aload_0         
	//   21   41:new             #484 <Class ParcelableVolumeInfo>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #150 <Field int mVolumeType>
	//   25   49:aload_0         
	//   26   50:getfield        #152 <Field int mLocalStream>
	//   27   53:aload_0         
	//   28   54:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//   29   57:invokevirtual   #502 <Method int VolumeProviderCompat.getVolumeControl()>
	//   30   60:aload_0         
	//   31   61:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//   32   64:invokevirtual   #505 <Method int VolumeProviderCompat.getMaxVolume()>
	//   33   67:aload_0         
	//   34   68:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//   35   71:invokevirtual   #508 <Method int VolumeProviderCompat.getCurrentVolume()>
	//   36   74:invokespecial   #493 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
	//   37   77:invokevirtual   #495 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
		volumeprovidercompat.setCallback(mVolumeCallback);
	//   38   80:aload_1         
	//   39   81:aload_0         
	//   40   82:getfield        #103 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
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
	//    2    2:putfield        #148 <Field int mRatingType>
	//    3    5:return          
	}

	void setRccState(PlaybackStateCompat playbackstatecompat)
	{
		mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()));
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field RemoteControlClient mRcc>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #522 <Method int PlaybackStateCompat.getState()>
	//    5    9:invokevirtual   #524 <Method int getRccStateFromState(int)>
	//    6   12:invokevirtual   #464 <Method void RemoteControlClient.setPlaybackState(int)>
	//    7   15:return          
	}

	public void setRepeatMode(int i)
	{
		if(mRepeatMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #527 <Field int mRepeatMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mRepeatMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #527 <Field int mRepeatMode>
			sendRepeatMode(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #529 <Method void sendRepeatMode(int)>
		}
	//   10   18:return          
	}

	public void setSessionActivity(PendingIntent pendingintent)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mSessionActivity = pendingintent;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #532 <Field PendingIntent mSessionActivity>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		pendingintent;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw pendingintent;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public void setShuffleMode(int i)
	{
		if(mShuffleMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #535 <Field int mShuffleMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mShuffleMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #535 <Field int mShuffleMode>
			sendShuffleMode(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #537 <Method void sendShuffleMode(int)>
		}
	//   10   18:return          
	}

	public void setShuffleModeEnabled(boolean flag)
	{
		if(mShuffleModeEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #540 <Field boolean mShuffleModeEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mShuffleModeEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #540 <Field boolean mShuffleModeEnabled>
			sendShuffleModeEnabled(flag);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #542 <Method void sendShuffleModeEnabled(boolean)>
		}
	//   10   18:return          
	}

	void setVolumeTo(int i, int j)
	{
		if(mVolumeType == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field int mVolumeType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          24
		{
			if(mVolumeProvider != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//*   6   12:ifnull          23
				mVolumeProvider.onSetVolumeTo(i);
	//    7   15:aload_0         
	//    8   16:getfield        #236 <Field VolumeProviderCompat mVolumeProvider>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #546 <Method void VolumeProviderCompat.onSetVolumeTo(int)>
			return;
	//   11   23:return          
		} else
		{
			mAudioManager.setStreamVolume(mLocalStream, i, j);
	//   12   24:aload_0         
	//   13   25:getfield        #130 <Field AudioManager mAudioManager>
	//   14   28:aload_0         
	//   15   29:getfield        #152 <Field int mLocalStream>
	//   16   32:iload_1         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #549 <Method void AudioManager.setStreamVolume(int, int, int)>
			return;
	//   19   37:return          
		}
	}

	void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
	{
		mAudioManager.unregisterMediaButtonEventReceiver(componentname);
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field AudioManager mAudioManager>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #552 <Method void AudioManager.unregisterMediaButtonEventReceiver(ComponentName)>
	//    4    8:return          
	}

	boolean update()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(!mIsActive) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #94  <Field boolean mIsActive>
	//    4    6:ifeq            160
_L1:
		if(mIsMbrRegistered || (mFlags & 1) == 0) goto _L4; else goto _L3
	//    5    9:aload_0         
	//    6   10:getfield        #96  <Field boolean mIsMbrRegistered>
	//    7   13:ifne            78
	//    8   16:aload_0         
	//    9   17:getfield        #434 <Field int mFlags>
	//   10   20:iconst_1        
	//   11   21:iand            
	//   12   22:ifeq            78
_L3:
		registerMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #136 <Field PendingIntent mMediaButtonReceiverIntent>
	//   16   30:aload_0         
	//   17   31:getfield        #134 <Field ComponentName mMediaButtonReceiverComponentName>
	//   18   34:invokevirtual   #554 <Method void registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
		mIsMbrRegistered = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #96  <Field boolean mIsMbrRegistered>
_L12:
		if(mIsRccRegistered || (mFlags & 2) == 0) goto _L6; else goto _L5
	//   22   42:aload_0         
	//   23   43:getfield        #98  <Field boolean mIsRccRegistered>
	//   24   46:ifne            114
	//   25   49:aload_0         
	//   26   50:getfield        #434 <Field int mFlags>
	//   27   53:iconst_2        
	//   28   54:iand            
	//   29   55:ifeq            114
_L5:
		boolean flag;
		mAudioManager.registerRemoteControlClient(mRcc);
	//   30   58:aload_0         
	//   31   59:getfield        #130 <Field AudioManager mAudioManager>
	//   32   62:aload_0         
	//   33   63:getfield        #159 <Field RemoteControlClient mRcc>
	//   34   66:invokevirtual   #558 <Method void AudioManager.registerRemoteControlClient(RemoteControlClient)>
		mIsRccRegistered = true;
	//   35   69:aload_0         
	//   36   70:iconst_1        
	//   37   71:putfield        #98  <Field boolean mIsRccRegistered>
		flag = true;
	//   38   74:iconst_1        
	//   39   75:istore_1        
_L8:
		return flag;
	//   40   76:iload_1         
	//   41   77:ireturn         
_L4:
		if(mIsMbrRegistered && (mFlags & 1) == 0)
	//*  42   78:aload_0         
	//*  43   79:getfield        #96  <Field boolean mIsMbrRegistered>
	//*  44   82:ifeq            42
	//*  45   85:aload_0         
	//*  46   86:getfield        #434 <Field int mFlags>
	//*  47   89:iconst_1        
	//*  48   90:iand            
	//*  49   91:ifne            42
		{
			unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   50   94:aload_0         
	//   51   95:aload_0         
	//   52   96:getfield        #136 <Field PendingIntent mMediaButtonReceiverIntent>
	//   53   99:aload_0         
	//   54  100:getfield        #134 <Field ComponentName mMediaButtonReceiverComponentName>
	//   55  103:invokevirtual   #560 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
			mIsMbrRegistered = false;
	//   56  106:aload_0         
	//   57  107:iconst_0        
	//   58  108:putfield        #96  <Field boolean mIsMbrRegistered>
		}
		continue; /* Loop/switch isn't completed */
	//   59  111:goto            42
_L6:
		flag = flag1;
	//   60  114:iload_2         
	//   61  115:istore_1        
		if(!mIsRccRegistered) goto _L8; else goto _L7
	//   62  116:aload_0         
	//   63  117:getfield        #98  <Field boolean mIsRccRegistered>
	//   64  120:ifeq            76
_L7:
		flag = flag1;
	//   65  123:iload_2         
	//   66  124:istore_1        
		if((mFlags & 2) != 0) goto _L8; else goto _L9
	//   67  125:aload_0         
	//   68  126:getfield        #434 <Field int mFlags>
	//   69  129:iconst_2        
	//   70  130:iand            
	//   71  131:ifne            76
_L9:
		mRcc.setPlaybackState(0);
	//   72  134:aload_0         
	//   73  135:getfield        #159 <Field RemoteControlClient mRcc>
	//   74  138:iconst_0        
	//   75  139:invokevirtual   #464 <Method void RemoteControlClient.setPlaybackState(int)>
		mAudioManager.unregisterRemoteControlClient(mRcc);
	//   76  142:aload_0         
	//   77  143:getfield        #130 <Field AudioManager mAudioManager>
	//   78  146:aload_0         
	//   79  147:getfield        #159 <Field RemoteControlClient mRcc>
	//   80  150:invokevirtual   #563 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
		mIsRccRegistered = false;
	//   81  153:aload_0         
	//   82  154:iconst_0        
	//   83  155:putfield        #98  <Field boolean mIsRccRegistered>
		return false;
	//   84  158:iconst_0        
	//   85  159:ireturn         
_L2:
		if(mIsMbrRegistered)
	//*  86  160:aload_0         
	//*  87  161:getfield        #96  <Field boolean mIsMbrRegistered>
	//*  88  164:ifeq            184
		{
			unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   89  167:aload_0         
	//   90  168:aload_0         
	//   91  169:getfield        #136 <Field PendingIntent mMediaButtonReceiverIntent>
	//   92  172:aload_0         
	//   93  173:getfield        #134 <Field ComponentName mMediaButtonReceiverComponentName>
	//   94  176:invokevirtual   #560 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
			mIsMbrRegistered = false;
	//   95  179:aload_0         
	//   96  180:iconst_0        
	//   97  181:putfield        #96  <Field boolean mIsMbrRegistered>
		}
		flag = flag1;
	//   98  184:iload_2         
	//   99  185:istore_1        
		if(!mIsRccRegistered) goto _L8; else goto _L10
	//  100  186:aload_0         
	//  101  187:getfield        #98  <Field boolean mIsRccRegistered>
	//  102  190:ifeq            76
_L10:
		mRcc.setPlaybackState(0);
	//  103  193:aload_0         
	//  104  194:getfield        #159 <Field RemoteControlClient mRcc>
	//  105  197:iconst_0        
	//  106  198:invokevirtual   #464 <Method void RemoteControlClient.setPlaybackState(int)>
		mAudioManager.unregisterRemoteControlClient(mRcc);
	//  107  201:aload_0         
	//  108  202:getfield        #130 <Field AudioManager mAudioManager>
	//  109  205:aload_0         
	//  110  206:getfield        #159 <Field RemoteControlClient mRcc>
	//  111  209:invokevirtual   #563 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
		mIsRccRegistered = false;
	//  112  212:aload_0         
	//  113  213:iconst_0        
	//  114  214:putfield        #98  <Field boolean mIsRccRegistered>
		return false;
	//  115  217:iconst_0        
	//  116  218:ireturn         
		if(true) goto _L12; else goto _L11
_L11:
	}

	static final int RCC_PLAYSTATE_NONE = 0;
	final AudioManager mAudioManager;
	volatile MediaSessionCompat.Callback mCallback;
	boolean mCaptioningEnabled;
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
	int mShuffleMode;
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
	//    1    1:invokespecial   #83  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #83  <Method void Object()>
	//    6   12:putfield        #85  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #87  <Class RemoteCallbackList>
	//    9   19:dup             
	//   10   20:invokespecial   #88  <Method void RemoteCallbackList()>
	//   11   23:putfield        #90  <Field RemoteCallbackList mControllerCallbacks>
		mDestroyed = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #92  <Field boolean mDestroyed>
		mIsActive = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #94  <Field boolean mIsActive>
		mIsMbrRegistered = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #96  <Field boolean mIsMbrRegistered>
		mIsRccRegistered = false;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #98  <Field boolean mIsRccRegistered>
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
	//   28   52:invokespecial   #101 <Method void MediaSessionCompat$MediaSessionImplBase$1(MediaSessionCompat$MediaSessionImplBase)>
	//   29   55:putfield        #103 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
		if(componentname == null)
	//*  30   58:aload_3         
	//*  31   59:ifnonnull       72
		{
			throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
	//   32   62:new             #105 <Class IllegalArgumentException>
	//   33   65:dup             
	//   34   66:ldc1            #107 <String "MediaButtonReceiver component may not be null.">
	//   35   68:invokespecial   #110 <Method void IllegalArgumentException(String)>
	//   36   71:athrow          
		} else
		{
			mContext = context;
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:putfield        #112 <Field Context mContext>
			mPackageName = context.getPackageName();
	//   40   77:aload_0         
	//   41   78:aload_1         
	//   42   79:invokevirtual   #118 <Method String Context.getPackageName()>
	//   43   82:putfield        #120 <Field String mPackageName>
			mAudioManager = (AudioManager)context.getSystemService("audio");
	//   44   85:aload_0         
	//   45   86:aload_1         
	//   46   87:ldc1            #122 <String "audio">
	//   47   89:invokevirtual   #126 <Method Object Context.getSystemService(String)>
	//   48   92:checkcast       #128 <Class AudioManager>
	//   49   95:putfield        #130 <Field AudioManager mAudioManager>
			mTag = s;
	//   50   98:aload_0         
	//   51   99:aload_2         
	//   52  100:putfield        #132 <Field String mTag>
			mMediaButtonReceiverComponentName = componentname;
	//   53  103:aload_0         
	//   54  104:aload_3         
	//   55  105:putfield        #134 <Field ComponentName mMediaButtonReceiverComponentName>
			mMediaButtonReceiverIntent = pendingintent;
	//   56  108:aload_0         
	//   57  109:aload           4
	//   58  111:putfield        #136 <Field PendingIntent mMediaButtonReceiverIntent>
			mStub = new MediaSessionStub();
	//   59  114:aload_0         
	//   60  115:new             #16  <Class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub>
	//   61  118:dup             
	//   62  119:aload_0         
	//   63  120:invokespecial   #137 <Method void MediaSessionCompat$MediaSessionImplBase$MediaSessionStub(MediaSessionCompat$MediaSessionImplBase)>
	//   64  123:putfield        #139 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
			mToken = new MediaSessionCompat.Token(((Object) (mStub)));
	//   65  126:aload_0         
	//   66  127:new             #141 <Class MediaSessionCompat$Token>
	//   67  130:dup             
	//   68  131:aload_0         
	//   69  132:getfield        #139 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
	//   70  135:invokespecial   #144 <Method void MediaSessionCompat$Token(Object)>
	//   71  138:putfield        #146 <Field MediaSessionCompat$Token mToken>
			mRatingType = 0;
	//   72  141:aload_0         
	//   73  142:iconst_0        
	//   74  143:putfield        #148 <Field int mRatingType>
			mVolumeType = 1;
	//   75  146:aload_0         
	//   76  147:iconst_1        
	//   77  148:putfield        #150 <Field int mVolumeType>
			mLocalStream = 3;
	//   78  151:aload_0         
	//   79  152:iconst_3        
	//   80  153:putfield        #152 <Field int mLocalStream>
			mRcc = new RemoteControlClient(pendingintent);
	//   81  156:aload_0         
	//   82  157:new             #154 <Class RemoteControlClient>
	//   83  160:dup             
	//   84  161:aload           4
	//   85  163:invokespecial   #157 <Method void RemoteControlClient(PendingIntent)>
	//   86  166:putfield        #159 <Field RemoteControlClient mRcc>
			return;
	//   87  169:return          
		}
	}
}
