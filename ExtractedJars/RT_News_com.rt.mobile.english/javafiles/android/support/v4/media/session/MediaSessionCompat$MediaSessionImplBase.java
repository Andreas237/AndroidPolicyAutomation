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
			int i;
			i = 2;
		//   18   39:iconst_2        
		//   19   40:istore_1        
			if(l != 2)
				break MISSING_BLOCK_LABEL_68;
		//   20   41:iload           4
		//   21   43:iconst_2        
		//   22   44:icmpne          68
			int j;
			int k;
			i = volumeprovidercompat.getVolumeControl();
		//   23   47:aload           7
		//   24   49:invokevirtual   #135 <Method int VolumeProviderCompat.getVolumeControl()>
		//   25   52:istore_1        
			j = volumeprovidercompat.getMaxVolume();
		//   26   53:aload           7
		//   27   55:invokevirtual   #138 <Method int VolumeProviderCompat.getMaxVolume()>
		//   28   58:istore_2        
			k = volumeprovidercompat.getCurrentVolume();
		//   29   59:aload           7
		//   30   61:invokevirtual   #141 <Method int VolumeProviderCompat.getCurrentVolume()>
		//   31   64:istore_3        
			break MISSING_BLOCK_LABEL_97;
		//   32   65:goto            123
			j = mAudioManager.getStreamMaxVolume(i1);
		//   33   68:aload_0         
		//   34   69:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   35   72:getfield        #145 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   36   75:iload           5
		//   37   77:invokevirtual   #151 <Method int AudioManager.getStreamMaxVolume(int)>
		//   38   80:istore_2        
			k = mAudioManager.getStreamVolume(i1);
		//   39   81:aload_0         
		//   40   82:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   41   85:getfield        #145 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   42   88:iload           5
		//   43   90:invokevirtual   #154 <Method int AudioManager.getStreamVolume(int)>
		//   44   93:istore_3        
		//*  45   94:goto            123
			obj;
		//   46   97:aload           6
			JVM INSTR monitorexit ;
		//   47   99:monitorexit     
			return new ParcelableVolumeInfo(l, i1, i, j, k);
		//   48  100:new             #156 <Class ParcelableVolumeInfo>
		//   49  103:dup             
		//   50  104:iload           4
		//   51  106:iload           5
		//   52  108:iload_1         
		//   53  109:iload_2         
		//   54  110:iload_3         
		//   55  111:invokespecial   #159 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   56  114:areturn         
			Exception exception;
			exception;
		//   57  115:astore          7
			obj;
		//   58  117:aload           6
			JVM INSTR monitorexit ;
		//   59  119:monitorexit     
			throw exception;
		//   60  120:aload           7
		//   61  122:athrow          
		//*  62  123:goto            97
		}

		public boolean isCaptioningEnabled()
		{
			return mCaptioningEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #165 <Field boolean MediaSessionCompat$MediaSessionImplBase.mCaptioningEnabled>
		//    3    7:ireturn         
		}

		public boolean isShuffleModeEnabledRemoved()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    7:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    7:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			if(mDestroyed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   2    4:getfield        #194 <Field boolean MediaSessionCompat$MediaSessionImplBase.mDestroyed>
		//*   3    7:ifeq            17
			{
				try
				{
					imediacontrollercallback.onSessionDestroyed();
		//    4   10:aload_1         
		//    5   11:invokeinterface #199 <Method void IMediaControllerCallback.onSessionDestroyed()>
					return;
		//    6   16:return          
				}
		//*   7   17:aload_0         
		//*   8   18:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   9   21:getfield        #203 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//*  10   24:aload_1         
		//*  11   25:invokevirtual   #209 <Method boolean RemoteCallbackList.register(android.os.IInterface)>
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
		//    4    7:invokevirtual   #213 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
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
		//    4    7:invokestatic    #222 <Method Long Long.valueOf(long)>
		//    5   10:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
		//    6   13:return          
		}

		public void sendCommand(String s, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultreceiverwrapper)
		{
			postToHandler(1, ((Object) (new Command(s, bundle, MediaSessionCompat.ResultReceiverWrapper.access$400(resultreceiverwrapper)))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iconst_1        
		//    3    5:new             #226 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokestatic    #232 <Method ResultReceiver MediaSessionCompat$ResultReceiverWrapper.access$400(MediaSessionCompat$ResultReceiverWrapper)>
		//    9   15:invokespecial   #235 <Method void MediaSessionCompat$MediaSessionImplBase$Command(String, Bundle, ResultReceiver)>
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
		//    5    8:invokevirtual   #175 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object, Bundle)>
		//    6   11:return          
		}

		public boolean sendMediaButton(KeyEvent keyevent)
		{
			int i = mFlags;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #59  <Field int MediaSessionCompat$MediaSessionImplBase.mFlags>
		//    3    7:istore_2        
			boolean flag = true;
		//    4    8:iconst_1        
		//    5    9:istore_3        
			if((i & 1) == 0)
		//*   6   10:iload_2         
		//*   7   11:iconst_1        
		//*   8   12:iand            
		//*   9   13:ifeq            19
		//*  10   16:goto            21
				flag = false;
		//   11   19:iconst_0        
		//   12   20:istore_3        
			if(flag)
		//*  13   21:iload_3         
		//*  14   22:ifeq            35
				postToHandler(21, ((Object) (keyevent)));
		//   15   25:aload_0         
		//   16   26:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   17   29:bipush          21
		//   18   31:aload_1         
		//   19   32:invokevirtual   #26  <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, Object)>
			return flag;
		//   20   35:iload_3         
		//   21   36:ireturn         
		}

		public void setCaptioningEnabled(boolean flag)
			throws RemoteException
		{
			postToHandler(29, ((Object) (Boolean.valueOf(flag))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          29
		//    3    6:iload_1         
		//    4    7:invokestatic    #245 <Method Boolean Boolean.valueOf(boolean)>
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
		//    4    7:invokevirtual   #213 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
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
		//    4    7:invokevirtual   #213 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int)>
		//    5   10:return          
		}

		public void setShuffleModeEnabledRemoved(boolean flag)
			throws RemoteException
		{
		//    0    0:return          
		}

		public void setVolumeTo(int i, int j, String s)
		{
			MediaSessionCompat.MediaSessionImplBase.this.setVolumeTo(i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:invokevirtual   #251 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
		//    5    9:return          
		}

		public void skipToQueueItem(long l)
		{
			postToHandler(11, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:bipush          11
		//    3    6:lload_1         
		//    4    7:invokestatic    #222 <Method Long Long.valueOf(long)>
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
		//    2    4:getfield        #203 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #257 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
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
			int i;
			long l;
			if(keyevent == null)
				break MISSING_BLOCK_LABEL_236;
		//    0    0:aload_1         
		//    1    1:ifnull          236
			if(keyevent.getAction() != 0)
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #93  <Method int KeyEvent.getAction()>
		//*   4    8:ifeq            12
				return;
		//    5   11:return          
			if(mState == null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*   8   16:getfield        #97  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//*   9   19:ifnonnull       28
				l = 0L;
		//   10   22:lconst_0        
		//   11   23:lstore          4
			else
		//*  12   25:goto            40
				l = mState.getActions();
		//   13   28:aload_0         
		//   14   29:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   15   32:getfield        #97  <Field PlaybackStateCompat MediaSessionCompat$MediaSessionImplBase.mState>
		//   16   35:invokevirtual   #103 <Method long PlaybackStateCompat.getActions()>
		//   17   38:lstore          4
			i = keyevent.getKeyCode();
		//   18   40:aload_1         
		//   19   41:invokevirtual   #106 <Method int KeyEvent.getKeyCode()>
		//   20   44:istore_3        
			if(i == 79) goto _L2; else goto _L1
		//   21   45:iload_3         
		//   22   46:bipush          79
		//   23   48:icmpeq          227
_L1:
			i;
		//   24   51:iload_3         
			JVM INSTR tableswitch 85 90: default 92
		//		               85 227
		//		               86 213
		//		               87 197
		//		               88 181
		//		               89 165
		//		               90 149;
		//   25   52:tableswitch     85 90: default 92
		//		               85 227
		//		               86 213
		//		               87 197
		//		               88 181
		//		               89 165
		//		               90 149
			   goto _L3 _L2 _L4 _L5 _L6 _L7 _L8
_L3:
			switch(i)
		//*  26   92:iload_3         
			{
		//*  27   93:tableswitch     126 127: default 116
		//		               126 133
		//		               127 117
			default:
				return;
		//   28  116:return          

			case 127: // '\177'
				if((l & 2L) != 0L)
		//*  29  117:lload           4
		//*  30  119:ldc2w           #107 <Long 2L>
		//*  31  122:land            
		//*  32  123:lconst_0        
		//*  33  124:lcmp            
		//*  34  125:ifeq            235
				{
					callback.onPause();
		//   35  128:aload_2         
		//   36  129:invokevirtual   #114 <Method void MediaSessionCompat$Callback.onPause()>
					return;
		//   37  132:return          
				}
				break;

			case 126: // '~'
				if((l & 4L) != 0L)
		//*  38  133:lload           4
		//*  39  135:ldc2w           #115 <Long 4L>
		//*  40  138:land            
		//*  41  139:lconst_0        
		//*  42  140:lcmp            
		//*  43  141:ifeq            235
				{
					callback.onPlay();
		//   44  144:aload_2         
		//   45  145:invokevirtual   #119 <Method void MediaSessionCompat$Callback.onPlay()>
					return;
		//   46  148:return          
				}
				break;
			}
			break; /* Loop/switch isn't completed */
_L8:
			if((l & 64L) != 0L)
		//*  47  149:lload           4
		//*  48  151:ldc2w           #120 <Long 64L>
		//*  49  154:land            
		//*  50  155:lconst_0        
		//*  51  156:lcmp            
		//*  52  157:ifeq            235
			{
				callback.onFastForward();
		//   53  160:aload_2         
		//   54  161:invokevirtual   #124 <Method void MediaSessionCompat$Callback.onFastForward()>
				return;
		//   55  164:return          
			}
			break; /* Loop/switch isn't completed */
_L7:
			if((l & 8L) != 0L)
		//*  56  165:lload           4
		//*  57  167:ldc2w           #125 <Long 8L>
		//*  58  170:land            
		//*  59  171:lconst_0        
		//*  60  172:lcmp            
		//*  61  173:ifeq            235
			{
				callback.onRewind();
		//   62  176:aload_2         
		//   63  177:invokevirtual   #129 <Method void MediaSessionCompat$Callback.onRewind()>
				return;
		//   64  180:return          
			}
			break; /* Loop/switch isn't completed */
_L6:
			if((l & 16L) != 0L)
		//*  65  181:lload           4
		//*  66  183:ldc2w           #130 <Long 16L>
		//*  67  186:land            
		//*  68  187:lconst_0        
		//*  69  188:lcmp            
		//*  70  189:ifeq            235
			{
				callback.onSkipToPrevious();
		//   71  192:aload_2         
		//   72  193:invokevirtual   #134 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
				return;
		//   73  196:return          
			}
			break; /* Loop/switch isn't completed */
_L5:
			if((l & 32L) != 0L)
		//*  74  197:lload           4
		//*  75  199:ldc2w           #135 <Long 32L>
		//*  76  202:land            
		//*  77  203:lconst_0        
		//*  78  204:lcmp            
		//*  79  205:ifeq            235
			{
				callback.onSkipToNext();
		//   80  208:aload_2         
		//   81  209:invokevirtual   #139 <Method void MediaSessionCompat$Callback.onSkipToNext()>
				return;
		//   82  212:return          
			}
			break; /* Loop/switch isn't completed */
_L4:
			if((l & 1L) != 0L)
		//*  83  213:lload           4
		//*  84  215:lconst_1        
		//*  85  216:land            
		//*  86  217:lconst_0        
		//*  87  218:lcmp            
		//*  88  219:ifeq            235
			{
				callback.onStop();
		//   89  222:aload_2         
		//   90  223:invokevirtual   #142 <Method void MediaSessionCompat$Callback.onStop()>
				return;
		//   91  226:return          
			}
			break; /* Loop/switch isn't completed */
_L2:
			Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
		//   92  227:ldc1            #144 <String "MediaSessionCompat">
		//   93  229:ldc1            #146 <String "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already">
		//   94  231:invokestatic    #152 <Method int Log.w(String, String)>
		//   95  234:pop             
			return;
		//   96  235:return          
		//   97  236:return          
		}

		public void handleMessage(Message message)
		{
			MediaSessionCompat.Callback callback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #158 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
		//    3    7:astore_2        
			if(callback == null)
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       13
				return;
		//    6   12:return          
			switch(message.what)
		//*   7   13:aload_1         
		//*   8   14:getfield        #163 <Field int Message.what>
			{
		//*   9   17:tableswitch     1 31: default 156
		//		               1 581
		//		               2 568
		//		               3 563
		//		               4 547
		//		               5 531
		//		               6 515
		//		               7 510
		//		               8 494
		//		               9 478
		//		               10 462
		//		               11 447
		//		               12 442
		//		               13 437
		//		               14 432
		//		               15 427
		//		               16 422
		//		               17 417
		//		               18 402
		//		               19 390
		//		               20 374
		//		               21 333
		//		               22 320
		//		               23 311
		//		               24 156
		//		               25 299
		//		               26 283
		//		               27 271
		//		               28 197
		//		               29 182
		//		               30 173
		//		               31 157
			case 24: // '\030'
			default:
				return;
		//   10  156:return          

			case 31: // '\037'
				callback.onSetRating((RatingCompat)message.obj, message.getData());
		//   11  157:aload_2         
		//   12  158:aload_1         
		//   13  159:getfield        #167 <Field Object Message.obj>
		//   14  162:checkcast       #169 <Class RatingCompat>
		//   15  165:aload_1         
		//   16  166:invokevirtual   #173 <Method Bundle Message.getData()>
		//   17  169:invokevirtual   #177 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
				return;
		//   18  172:return          

			case 30: // '\036'
				callback.onSetShuffleMode(message.arg1);
		//   19  173:aload_2         
		//   20  174:aload_1         
		//   21  175:getfield        #180 <Field int Message.arg1>
		//   22  178:invokevirtual   #184 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
				return;
		//   23  181:return          

			case 29: // '\035'
				callback.onSetCaptioningEnabled(((Boolean)message.obj).booleanValue());
		//   24  182:aload_2         
		//   25  183:aload_1         
		//   26  184:getfield        #167 <Field Object Message.obj>
		//   27  187:checkcast       #186 <Class Boolean>
		//   28  190:invokevirtual   #190 <Method boolean Boolean.booleanValue()>
		//   29  193:invokevirtual   #194 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
				return;
		//   30  196:return          

			case 28: // '\034'
				if(mQueue != null)
		//*  31  197:aload_0         
		//*  32  198:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*  33  201:getfield        #198 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//*  34  204:ifnull          605
				{
					if(message.arg1 >= 0 && message.arg1 < mQueue.size())
		//*  35  207:aload_1         
		//*  36  208:getfield        #180 <Field int Message.arg1>
		//*  37  211:iflt            256
		//*  38  214:aload_1         
		//*  39  215:getfield        #180 <Field int Message.arg1>
		//*  40  218:aload_0         
		//*  41  219:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*  42  222:getfield        #198 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//*  43  225:invokeinterface #203 <Method int List.size()>
		//*  44  230:icmpge          256
						message = ((Message) ((MediaSessionCompat.QueueItem)mQueue.get(message.arg1)));
		//   45  233:aload_0         
		//   46  234:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   47  237:getfield        #198 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//   48  240:aload_1         
		//   49  241:getfield        #180 <Field int Message.arg1>
		//   50  244:invokeinterface #207 <Method Object List.get(int)>
		//   51  249:checkcast       #209 <Class MediaSessionCompat$QueueItem>
		//   52  252:astore_1        
					else
		//*  53  253:goto            258
						message = null;
		//   54  256:aconst_null     
		//   55  257:astore_1        
					if(message != null)
		//*  56  258:aload_1         
		//*  57  259:ifnull          605
					{
						callback.onRemoveQueueItem(((MediaSessionCompat.QueueItem) (message)).getDescription());
		//   58  262:aload_2         
		//   59  263:aload_1         
		//   60  264:invokevirtual   #213 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
		//   61  267:invokevirtual   #217 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
						return;
		//   62  270:return          
					}
				}
				break;

			case 27: // '\033'
				callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
		//   63  271:aload_2         
		//   64  272:aload_1         
		//   65  273:getfield        #167 <Field Object Message.obj>
		//   66  276:checkcast       #219 <Class MediaDescriptionCompat>
		//   67  279:invokevirtual   #217 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
				return;
		//   68  282:return          

			case 26: // '\032'
				callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
		//   69  283:aload_2         
		//   70  284:aload_1         
		//   71  285:getfield        #167 <Field Object Message.obj>
		//   72  288:checkcast       #219 <Class MediaDescriptionCompat>
		//   73  291:aload_1         
		//   74  292:getfield        #180 <Field int Message.arg1>
		//   75  295:invokevirtual   #223 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
				return;
		//   76  298:return          

			case 25: // '\031'
				callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
		//   77  299:aload_2         
		//   78  300:aload_1         
		//   79  301:getfield        #167 <Field Object Message.obj>
		//   80  304:checkcast       #219 <Class MediaDescriptionCompat>
		//   81  307:invokevirtual   #225 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
				return;
		//   82  310:return          

			case 23: // '\027'
				callback.onSetRepeatMode(message.arg1);
		//   83  311:aload_2         
		//   84  312:aload_1         
		//   85  313:getfield        #180 <Field int Message.arg1>
		//   86  316:invokevirtual   #228 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
				return;
		//   87  319:return          

			case 22: // '\026'
				setVolumeTo(message.arg1, 0);
		//   88  320:aload_0         
		//   89  321:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   90  324:aload_1         
		//   91  325:getfield        #180 <Field int Message.arg1>
		//   92  328:iconst_0        
		//   93  329:invokevirtual   #232 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
				return;
		//   94  332:return          

			case 21: // '\025'
				message = ((Message) ((KeyEvent)message.obj));
		//   95  333:aload_1         
		//   96  334:getfield        #167 <Field Object Message.obj>
		//   97  337:checkcast       #89  <Class KeyEvent>
		//   98  340:astore_1        
				Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
		//   99  341:new             #234 <Class Intent>
		//  100  344:dup             
		//  101  345:ldc1            #236 <String "android.intent.action.MEDIA_BUTTON">
		//  102  347:invokespecial   #239 <Method void Intent(String)>
		//  103  350:astore_3        
				intent.putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (message)));
		//  104  351:aload_3         
		//  105  352:ldc1            #241 <String "android.intent.extra.KEY_EVENT">
		//  106  354:aload_1         
		//  107  355:invokevirtual   #245 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//  108  358:pop             
				if(!callback.onMediaButtonEvent(intent))
		//* 109  359:aload_2         
		//* 110  360:aload_3         
		//* 111  361:invokevirtual   #248 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//* 112  364:ifne            605
				{
					onMediaButtonEvent(((KeyEvent) (message)), callback);
		//  113  367:aload_0         
		//  114  368:aload_1         
		//  115  369:aload_2         
		//  116  370:invokespecial   #250 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
					return;
		//  117  373:return          
				}
				break;

			case 20: // '\024'
				callback.onCustomAction((String)message.obj, message.getData());
		//  118  374:aload_2         
		//  119  375:aload_1         
		//  120  376:getfield        #167 <Field Object Message.obj>
		//  121  379:checkcast       #252 <Class String>
		//  122  382:aload_1         
		//  123  383:invokevirtual   #173 <Method Bundle Message.getData()>
		//  124  386:invokevirtual   #256 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
				return;
		//  125  389:return          

			case 19: // '\023'
				callback.onSetRating((RatingCompat)message.obj);
		//  126  390:aload_2         
		//  127  391:aload_1         
		//  128  392:getfield        #167 <Field Object Message.obj>
		//  129  395:checkcast       #169 <Class RatingCompat>
		//  130  398:invokevirtual   #259 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
				return;
		//  131  401:return          

			case 18: // '\022'
				callback.onSeekTo(((Long)message.obj).longValue());
		//  132  402:aload_2         
		//  133  403:aload_1         
		//  134  404:getfield        #167 <Field Object Message.obj>
		//  135  407:checkcast       #261 <Class Long>
		//  136  410:invokevirtual   #264 <Method long Long.longValue()>
		//  137  413:invokevirtual   #268 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
				return;
		//  138  416:return          

			case 17: // '\021'
				callback.onRewind();
		//  139  417:aload_2         
		//  140  418:invokevirtual   #129 <Method void MediaSessionCompat$Callback.onRewind()>
				return;
		//  141  421:return          

			case 16: // '\020'
				callback.onFastForward();
		//  142  422:aload_2         
		//  143  423:invokevirtual   #124 <Method void MediaSessionCompat$Callback.onFastForward()>
				return;
		//  144  426:return          

			case 15: // '\017'
				callback.onSkipToPrevious();
		//  145  427:aload_2         
		//  146  428:invokevirtual   #134 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
				return;
		//  147  431:return          

			case 14: // '\016'
				callback.onSkipToNext();
		//  148  432:aload_2         
		//  149  433:invokevirtual   #139 <Method void MediaSessionCompat$Callback.onSkipToNext()>
				return;
		//  150  436:return          

			case 13: // '\r'
				callback.onStop();
		//  151  437:aload_2         
		//  152  438:invokevirtual   #142 <Method void MediaSessionCompat$Callback.onStop()>
				return;
		//  153  441:return          

			case 12: // '\f'
				callback.onPause();
		//  154  442:aload_2         
		//  155  443:invokevirtual   #114 <Method void MediaSessionCompat$Callback.onPause()>
				return;
		//  156  446:return          

			case 11: // '\013'
				callback.onSkipToQueueItem(((Long)message.obj).longValue());
		//  157  447:aload_2         
		//  158  448:aload_1         
		//  159  449:getfield        #167 <Field Object Message.obj>
		//  160  452:checkcast       #261 <Class Long>
		//  161  455:invokevirtual   #264 <Method long Long.longValue()>
		//  162  458:invokevirtual   #271 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
				return;
		//  163  461:return          

			case 10: // '\n'
				callback.onPlayFromUri((Uri)message.obj, message.getData());
		//  164  462:aload_2         
		//  165  463:aload_1         
		//  166  464:getfield        #167 <Field Object Message.obj>
		//  167  467:checkcast       #273 <Class Uri>
		//  168  470:aload_1         
		//  169  471:invokevirtual   #173 <Method Bundle Message.getData()>
		//  170  474:invokevirtual   #277 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
				return;
		//  171  477:return          

			case 9: // '\t'
				callback.onPlayFromSearch((String)message.obj, message.getData());
		//  172  478:aload_2         
		//  173  479:aload_1         
		//  174  480:getfield        #167 <Field Object Message.obj>
		//  175  483:checkcast       #252 <Class String>
		//  176  486:aload_1         
		//  177  487:invokevirtual   #173 <Method Bundle Message.getData()>
		//  178  490:invokevirtual   #280 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
				return;
		//  179  493:return          

			case 8: // '\b'
				callback.onPlayFromMediaId((String)message.obj, message.getData());
		//  180  494:aload_2         
		//  181  495:aload_1         
		//  182  496:getfield        #167 <Field Object Message.obj>
		//  183  499:checkcast       #252 <Class String>
		//  184  502:aload_1         
		//  185  503:invokevirtual   #173 <Method Bundle Message.getData()>
		//  186  506:invokevirtual   #283 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
				return;
		//  187  509:return          

			case 7: // '\007'
				callback.onPlay();
		//  188  510:aload_2         
		//  189  511:invokevirtual   #119 <Method void MediaSessionCompat$Callback.onPlay()>
				return;
		//  190  514:return          

			case 6: // '\006'
				callback.onPrepareFromUri((Uri)message.obj, message.getData());
		//  191  515:aload_2         
		//  192  516:aload_1         
		//  193  517:getfield        #167 <Field Object Message.obj>
		//  194  520:checkcast       #273 <Class Uri>
		//  195  523:aload_1         
		//  196  524:invokevirtual   #173 <Method Bundle Message.getData()>
		//  197  527:invokevirtual   #286 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
				return;
		//  198  530:return          

			case 5: // '\005'
				callback.onPrepareFromSearch((String)message.obj, message.getData());
		//  199  531:aload_2         
		//  200  532:aload_1         
		//  201  533:getfield        #167 <Field Object Message.obj>
		//  202  536:checkcast       #252 <Class String>
		//  203  539:aload_1         
		//  204  540:invokevirtual   #173 <Method Bundle Message.getData()>
		//  205  543:invokevirtual   #289 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
				return;
		//  206  546:return          

			case 4: // '\004'
				callback.onPrepareFromMediaId((String)message.obj, message.getData());
		//  207  547:aload_2         
		//  208  548:aload_1         
		//  209  549:getfield        #167 <Field Object Message.obj>
		//  210  552:checkcast       #252 <Class String>
		//  211  555:aload_1         
		//  212  556:invokevirtual   #173 <Method Bundle Message.getData()>
		//  213  559:invokevirtual   #292 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
				return;
		//  214  562:return          

			case 3: // '\003'
				callback.onPrepare();
		//  215  563:aload_2         
		//  216  564:invokevirtual   #295 <Method void MediaSessionCompat$Callback.onPrepare()>
				return;
		//  217  567:return          

			case 2: // '\002'
				adjustVolume(message.arg1, 0);
		//  218  568:aload_0         
		//  219  569:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  220  572:aload_1         
		//  221  573:getfield        #180 <Field int Message.arg1>
		//  222  576:iconst_0        
		//  223  577:invokevirtual   #298 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
				return;
		//  224  580:return          

			case 1: // '\001'
				message = ((Message) ((Command)message.obj));
		//  225  581:aload_1         
		//  226  582:getfield        #167 <Field Object Message.obj>
		//  227  585:checkcast       #300 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//  228  588:astore_1        
				callback.onCommand(((Command) (message)).command, ((Command) (message)).extras, ((Command) (message)).stub);
		//  229  589:aload_2         
		//  230  590:aload_1         
		//  231  591:getfield        #304 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
		//  232  594:aload_1         
		//  233  595:getfield        #308 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
		//  234  598:aload_1         
		//  235  599:getfield        #312 <Field ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
		//  236  602:invokevirtual   #316 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
				break;
			}
		//  237  605:return          
		}

		public void post(int i)
		{
			post(i, ((Object) (null)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aconst_null     
		//    3    3:invokevirtual   #320 <Method void post(int, Object)>
		//    4    6:return          
		}

		public void post(int i, Object obj)
		{
			obtainMessage(i, obj).sendToTarget();
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #324 <Method Message obtainMessage(int, Object)>
		//    4    6:invokevirtual   #327 <Method void Message.sendToTarget()>
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
		//    5    5:invokevirtual   #331 <Method Message obtainMessage(int, int, int, Object)>
		//    6    8:invokevirtual   #327 <Method void Message.sendToTarget()>
		//    7   11:return          
		}

		public void post(int i, Object obj, Bundle bundle)
		{
			obj = ((Object) (obtainMessage(i, obj)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #324 <Method Message obtainMessage(int, Object)>
		//    4    6:astore_2        
			((Message) (obj)).setData(bundle);
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #336 <Method void Message.setData(Bundle)>
			((Message) (obj)).sendToTarget();
		//    8   12:aload_2         
		//    9   13:invokevirtual   #327 <Method void Message.sendToTarget()>
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
		private static final int MSG_SET_VOLUME = 22;
		private static final int MSG_SKIP_TO_ITEM = 11;
		private static final int MSG_STOP = 13;
		final MediaSessionCompat.MediaSessionImplBase this$0;

		public MessageHandler(Looper looper)
		{
			this$0 = MediaSessionCompat.MediaSessionImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #84  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}


	private void sendCaptioningEnabled(boolean flag)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onCaptioningEnabledChanged(flag);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #176 <Method void IMediaControllerCallback.onCaptioningEnabledChanged(boolean)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_3        
		while(i >= 0) 
	//*   6   10:iload_3         
	//*   7   11:iflt            43
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore          4
			try
			{
				imediacontrollercallback.onEvent(s, bundle);
	//   14   27:aload           4
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokeinterface #184 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
			}
	//*  18   36:iload_3         
	//*  19   37:iconst_1        
	//*  20   38:isub            
	//*  21   39:istore_3        
	//*  22   40:goto            10
	//*  23   43:aload_0         
	//*  24   44:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  25   47:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onExtrasChanged(bundle);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #189 <Method void IMediaControllerCallback.onExtrasChanged(Bundle)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onMetadataChanged(mediametadatacompat);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #194 <Method void IMediaControllerCallback.onMetadataChanged(MediaMetadataCompat)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onQueueChanged(list);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #199 <Method void IMediaControllerCallback.onQueueChanged(List)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onQueueTitleChanged(charsequence);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #206 <Method void IMediaControllerCallback.onQueueTitleChanged(CharSequence)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(j >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onRepeatModeChanged(i);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #211 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_1        
		while(i >= 0) 
	//*   6   10:iload_1         
	//*   7   11:iflt            39
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore_2        
			try
			{
				imediacontrollercallback.onSessionDestroyed();
	//   14   26:aload_2         
	//   15   27:invokeinterface #215 <Method void IMediaControllerCallback.onSessionDestroyed()>
			}
	//*  16   32:iload_1         
	//*  17   33:iconst_1        
	//*  18   34:isub            
	//*  19   35:istore_1        
	//*  20   36:goto            10
	//*  21   39:aload_0         
	//*  22   40:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  23   43:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
	//*  24   46:aload_0         
	//*  25   47:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  26   50:invokevirtual   #218 <Method void RemoteCallbackList.kill()>
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
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(j >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onShuffleModeChanged(i);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #222 <Method void IMediaControllerCallback.onShuffleModeChanged(int)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
	//*  25   47:return          
			catch(RemoteException remoteexception) { }
	//   26   48:astore_3        
			j--;
		}
		mControllerCallbacks.finishBroadcast();
	//*  27   49:goto            33
	}

	private void sendState(PlaybackStateCompat playbackstatecompat)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onPlaybackStateChanged(playbackstatecompat);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #227 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
	//*   1    1:getfield        #149 <Field int mVolumeType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          24
		{
			if(mVolumeProvider != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//*   6   12:ifnull          37
			{
				mVolumeProvider.onAdjustVolume(i);
	//    7   15:aload_0         
	//    8   16:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #236 <Method void VolumeProviderCompat.onAdjustVolume(int)>
				return;
	//   11   23:return          
			}
		} else
		{
			mAudioManager.adjustStreamVolume(mLocalStream, i, j);
	//   12   24:aload_0         
	//   13   25:getfield        #129 <Field AudioManager mAudioManager>
	//   14   28:aload_0         
	//   15   29:getfield        #151 <Field int mLocalStream>
	//   16   32:iload_1         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #240 <Method void AudioManager.adjustStreamVolume(int, int, int)>
		}
	//   19   37:return          
	}

	android.media.RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle)
	{
		android.media.RemoteControlClient.MetadataEditor metadataeditor = mRcc.editMetadata(true);
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field RemoteControlClient mRcc>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #246 <Method android.media.RemoteControlClient$MetadataEditor RemoteControlClient.editMetadata(boolean)>
	//    4    8:astore          4
		if(bundle == null)
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       17
			return metadataeditor;
	//    7   14:aload           4
	//    8   16:areturn         
		if(bundle.containsKey("android.media.metadata.ART"))
	//*   9   17:aload_1         
	//*  10   18:ldc1            #248 <String "android.media.metadata.ART">
	//*  11   20:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//*  12   23:ifeq            64
		{
			Bitmap bitmap2 = (Bitmap)bundle.getParcelable("android.media.metadata.ART");
	//   13   26:aload_1         
	//   14   27:ldc1            #248 <String "android.media.metadata.ART">
	//   15   29:invokevirtual   #258 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   16   32:checkcast       #260 <Class Bitmap>
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
	//   24   44:invokevirtual   #264 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   25   47:iconst_0        
	//   26   48:invokevirtual   #268 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
	//   27   51:astore_2        
			metadataeditor.putBitmap(100, bitmap);
	//   28   52:aload           4
	//   29   54:bipush          100
	//   30   56:aload_2         
	//   31   57:invokevirtual   #274 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
	//   32   60:pop             
		} else
	//*  33   61:goto            110
		if(bundle.containsKey("android.media.metadata.ALBUM_ART"))
	//*  34   64:aload_1         
	//*  35   65:ldc2            #276 <String "android.media.metadata.ALBUM_ART">
	//*  36   68:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//*  37   71:ifeq            110
		{
			Bitmap bitmap3 = (Bitmap)bundle.getParcelable("android.media.metadata.ALBUM_ART");
	//   38   74:aload_1         
	//   39   75:ldc2            #276 <String "android.media.metadata.ALBUM_ART">
	//   40   78:invokevirtual   #258 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   41   81:checkcast       #260 <Class Bitmap>
	//   42   84:astore_3        
			Bitmap bitmap1 = bitmap3;
	//   43   85:aload_3         
	//   44   86:astore_2        
			if(bitmap3 != null)
	//*  45   87:aload_3         
	//*  46   88:ifnull          101
				bitmap1 = bitmap3.copy(bitmap3.getConfig(), false);
	//   47   91:aload_3         
	//   48   92:aload_3         
	//   49   93:invokevirtual   #264 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   50   96:iconst_0        
	//   51   97:invokevirtual   #268 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
	//   52  100:astore_2        
			metadataeditor.putBitmap(100, bitmap1);
	//   53  101:aload           4
	//   54  103:bipush          100
	//   55  105:aload_2         
	//   56  106:invokevirtual   #274 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
	//   57  109:pop             
		}
		if(bundle.containsKey("android.media.metadata.ALBUM"))
	//*  58  110:aload_1         
	//*  59  111:ldc2            #278 <String "android.media.metadata.ALBUM">
	//*  60  114:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//*  61  117:ifeq            134
			metadataeditor.putString(1, bundle.getString("android.media.metadata.ALBUM"));
	//   62  120:aload           4
	//   63  122:iconst_1        
	//   64  123:aload_1         
	//   65  124:ldc2            #278 <String "android.media.metadata.ALBUM">
	//   66  127:invokevirtual   #282 <Method String Bundle.getString(String)>
	//   67  130:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   68  133:pop             
		if(bundle.containsKey("android.media.metadata.ALBUM_ARTIST"))
	//*  69  134:aload_1         
	//*  70  135:ldc2            #288 <String "android.media.metadata.ALBUM_ARTIST">
	//*  71  138:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//*  72  141:ifeq            159
			metadataeditor.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
	//   73  144:aload           4
	//   74  146:bipush          13
	//   75  148:aload_1         
	//   76  149:ldc2            #288 <String "android.media.metadata.ALBUM_ARTIST">
	//   77  152:invokevirtual   #282 <Method String Bundle.getString(String)>
	//   78  155:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   79  158:pop             
		if(bundle.containsKey("android.media.metadata.ARTIST"))
	//*  80  159:aload_1         
	//*  81  160:ldc2            #290 <String "android.media.metadata.ARTIST">
	//*  82  163:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//*  83  166:ifeq            183
			metadataeditor.putString(2, bundle.getString("android.media.metadata.ARTIST"));
	//   84  169:aload           4
	//   85  171:iconst_2        
	//   86  172:aload_1         
	//   87  173:ldc2            #290 <String "android.media.metadata.ARTIST">
	//   88  176:invokevirtual   #282 <Method String Bundle.getString(String)>
	//   89  179:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   90  182:pop             
		if(bundle.containsKey("android.media.metadata.AUTHOR"))
	//*  91  183:aload_1         
	//*  92  184:ldc2            #292 <String "android.media.metadata.AUTHOR">
	//*  93  187:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//*  94  190:ifeq            207
			metadataeditor.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
	//   95  193:aload           4
	//   96  195:iconst_3        
	//   97  196:aload_1         
	//   98  197:ldc2            #292 <String "android.media.metadata.AUTHOR">
	//   99  200:invokevirtual   #282 <Method String Bundle.getString(String)>
	//  100  203:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  101  206:pop             
		if(bundle.containsKey("android.media.metadata.COMPILATION"))
	//* 102  207:aload_1         
	//* 103  208:ldc2            #294 <String "android.media.metadata.COMPILATION">
	//* 104  211:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//* 105  214:ifeq            232
			metadataeditor.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
	//  106  217:aload           4
	//  107  219:bipush          15
	//  108  221:aload_1         
	//  109  222:ldc2            #294 <String "android.media.metadata.COMPILATION">
	//  110  225:invokevirtual   #282 <Method String Bundle.getString(String)>
	//  111  228:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  112  231:pop             
		if(bundle.containsKey("android.media.metadata.COMPOSER"))
	//* 113  232:aload_1         
	//* 114  233:ldc2            #296 <String "android.media.metadata.COMPOSER">
	//* 115  236:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//* 116  239:ifeq            256
			metadataeditor.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
	//  117  242:aload           4
	//  118  244:iconst_4        
	//  119  245:aload_1         
	//  120  246:ldc2            #296 <String "android.media.metadata.COMPOSER">
	//  121  249:invokevirtual   #282 <Method String Bundle.getString(String)>
	//  122  252:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  123  255:pop             
		if(bundle.containsKey("android.media.metadata.DATE"))
	//* 124  256:aload_1         
	//* 125  257:ldc2            #298 <String "android.media.metadata.DATE">
	//* 126  260:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//* 127  263:ifeq            280
			metadataeditor.putString(5, bundle.getString("android.media.metadata.DATE"));
	//  128  266:aload           4
	//  129  268:iconst_5        
	//  130  269:aload_1         
	//  131  270:ldc2            #298 <String "android.media.metadata.DATE">
	//  132  273:invokevirtual   #282 <Method String Bundle.getString(String)>
	//  133  276:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  134  279:pop             
		if(bundle.containsKey("android.media.metadata.DISC_NUMBER"))
	//* 135  280:aload_1         
	//* 136  281:ldc2            #300 <String "android.media.metadata.DISC_NUMBER">
	//* 137  284:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//* 138  287:ifeq            305
			metadataeditor.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
	//  139  290:aload           4
	//  140  292:bipush          14
	//  141  294:aload_1         
	//  142  295:ldc2            #300 <String "android.media.metadata.DISC_NUMBER">
	//  143  298:invokevirtual   #304 <Method long Bundle.getLong(String)>
	//  144  301:invokevirtual   #308 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//  145  304:pop             
		if(bundle.containsKey("android.media.metadata.DURATION"))
	//* 146  305:aload_1         
	//* 147  306:ldc2            #310 <String "android.media.metadata.DURATION">
	//* 148  309:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//* 149  312:ifeq            330
			metadataeditor.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
	//  150  315:aload           4
	//  151  317:bipush          9
	//  152  319:aload_1         
	//  153  320:ldc2            #310 <String "android.media.metadata.DURATION">
	//  154  323:invokevirtual   #304 <Method long Bundle.getLong(String)>
	//  155  326:invokevirtual   #308 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//  156  329:pop             
		if(bundle.containsKey("android.media.metadata.GENRE"))
	//* 157  330:aload_1         
	//* 158  331:ldc2            #312 <String "android.media.metadata.GENRE">
	//* 159  334:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//* 160  337:ifeq            355
			metadataeditor.putString(6, bundle.getString("android.media.metadata.GENRE"));
	//  161  340:aload           4
	//  162  342:bipush          6
	//  163  344:aload_1         
	//  164  345:ldc2            #312 <String "android.media.metadata.GENRE">
	//  165  348:invokevirtual   #282 <Method String Bundle.getString(String)>
	//  166  351:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  167  354:pop             
		if(bundle.containsKey("android.media.metadata.TITLE"))
	//* 168  355:aload_1         
	//* 169  356:ldc2            #314 <String "android.media.metadata.TITLE">
	//* 170  359:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//* 171  362:ifeq            380
			metadataeditor.putString(7, bundle.getString("android.media.metadata.TITLE"));
	//  172  365:aload           4
	//  173  367:bipush          7
	//  174  369:aload_1         
	//  175  370:ldc2            #314 <String "android.media.metadata.TITLE">
	//  176  373:invokevirtual   #282 <Method String Bundle.getString(String)>
	//  177  376:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  178  379:pop             
		if(bundle.containsKey("android.media.metadata.TRACK_NUMBER"))
	//* 179  380:aload_1         
	//* 180  381:ldc2            #316 <String "android.media.metadata.TRACK_NUMBER">
	//* 181  384:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//* 182  387:ifeq            404
			metadataeditor.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
	//  183  390:aload           4
	//  184  392:iconst_0        
	//  185  393:aload_1         
	//  186  394:ldc2            #316 <String "android.media.metadata.TRACK_NUMBER">
	//  187  397:invokevirtual   #304 <Method long Bundle.getLong(String)>
	//  188  400:invokevirtual   #308 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//  189  403:pop             
		if(bundle.containsKey("android.media.metadata.WRITER"))
	//* 190  404:aload_1         
	//* 191  405:ldc2            #318 <String "android.media.metadata.WRITER">
	//* 192  408:invokevirtual   #254 <Method boolean Bundle.containsKey(String)>
	//* 193  411:ifeq            429
			metadataeditor.putString(11, bundle.getString("android.media.metadata.WRITER"));
	//  194  414:aload           4
	//  195  416:bipush          11
	//  196  418:aload_1         
	//  197  419:ldc2            #318 <String "android.media.metadata.WRITER">
	//  198  422:invokevirtual   #282 <Method String Bundle.getString(String)>
	//  199  425:invokevirtual   #286 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  200  428:pop             
		return metadataeditor;
	//  201  429:aload           4
	//  202  431:areturn         
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
	//*   1    1:getfield        #84  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			playbackstatecompat = mState;
	//    5    7:aload_0         
	//    6    8:getfield        #325 <Field PlaybackStateCompat mState>
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
	//	               0 88
	//	               1 86
	//	               2 84
	//	               3 82
	//	               4 80
	//	               5 78
	//	               6 75
	//	               7 72
	//	               8 75
	//	               9 69
	//	               10 66
	//	               11 66
		default:
			return -1;
	//    2   64:iconst_m1       
	//    3   65:ireturn         

		case 10: // '\n'
		case 11: // '\013'
			return 6;
	//    4   66:bipush          6
	//    5   68:ireturn         

		case 9: // '\t'
			return 7;
	//    6   69:bipush          7
	//    7   71:ireturn         

		case 7: // '\007'
			return 9;
	//    8   72:bipush          9
	//    9   74:ireturn         

		case 6: // '\006'
		case 8: // '\b'
			return 8;
	//   10   75:bipush          8
	//   11   77:ireturn         

		case 5: // '\005'
			return 5;
	//   12   78:iconst_5        
	//   13   79:ireturn         

		case 4: // '\004'
			return 4;
	//   14   80:iconst_4        
	//   15   81:ireturn         

		case 3: // '\003'
			return 3;
	//   16   82:iconst_3        
	//   17   83:ireturn         

		case 2: // '\002'
			return 2;
	//   18   84:iconst_2        
	//   19   85:ireturn         

		case 1: // '\001'
			return 1;
	//   20   86:iconst_1        
	//   21   87:ireturn         

		case 0: // '\0'
			return 0;
	//   22   88:iconst_0        
	//   23   89:ireturn         
		}
	}

	int getRccTransportControlFlagsFromActions(long l)
	{
		int j;
		if((l & 1L) != 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_1        
	//*   2    2:land            
	//*   3    3:lconst_0        
	//*   4    4:lcmp            
	//*   5    5:ifeq            15
			j = 32;
	//    6    8:bipush          32
	//    7   10:istore          4
		else
	//*   8   12:goto            18
			j = 0;
	//    9   15:iconst_0        
	//   10   16:istore          4
		int i = j;
	//   11   18:iload           4
	//   12   20:istore_3        
		if((l & 2L) != 0L)
	//*  13   21:lload_1         
	//*  14   22:ldc2w           #330 <Long 2L>
	//*  15   25:land            
	//*  16   26:lconst_0        
	//*  17   27:lcmp            
	//*  18   28:ifeq            37
			i = j | 0x10;
	//   19   31:iload           4
	//   20   33:bipush          16
	//   21   35:ior             
	//   22   36:istore_3        
		j = i;
	//   23   37:iload_3         
	//   24   38:istore          4
		if((l & 4L) != 0L)
	//*  25   40:lload_1         
	//*  26   41:ldc2w           #332 <Long 4L>
	//*  27   44:land            
	//*  28   45:lconst_0        
	//*  29   46:lcmp            
	//*  30   47:ifeq            55
			j = i | 4;
	//   31   50:iload_3         
	//   32   51:iconst_4        
	//   33   52:ior             
	//   34   53:istore          4
		i = j;
	//   35   55:iload           4
	//   36   57:istore_3        
		if((l & 8L) != 0L)
	//*  37   58:lload_1         
	//*  38   59:ldc2w           #334 <Long 8L>
	//*  39   62:land            
	//*  40   63:lconst_0        
	//*  41   64:lcmp            
	//*  42   65:ifeq            73
			i = j | 2;
	//   43   68:iload           4
	//   44   70:iconst_2        
	//   45   71:ior             
	//   46   72:istore_3        
		j = i;
	//   47   73:iload_3         
	//   48   74:istore          4
		if((l & 16L) != 0L)
	//*  49   76:lload_1         
	//*  50   77:ldc2w           #336 <Long 16L>
	//*  51   80:land            
	//*  52   81:lconst_0        
	//*  53   82:lcmp            
	//*  54   83:ifeq            91
			j = i | 1;
	//   55   86:iload_3         
	//   56   87:iconst_1        
	//   57   88:ior             
	//   58   89:istore          4
		i = j;
	//   59   91:iload           4
	//   60   93:istore_3        
		if((l & 32L) != 0L)
	//*  61   94:lload_1         
	//*  62   95:ldc2w           #338 <Long 32L>
	//*  63   98:land            
	//*  64   99:lconst_0        
	//*  65  100:lcmp            
	//*  66  101:ifeq            111
			i = j | 0x80;
	//   67  104:iload           4
	//   68  106:sipush          128
	//   69  109:ior             
	//   70  110:istore_3        
		j = i;
	//   71  111:iload_3         
	//   72  112:istore          4
		if((l & 64L) != 0L)
	//*  73  114:lload_1         
	//*  74  115:ldc2w           #340 <Long 64L>
	//*  75  118:land            
	//*  76  119:lconst_0        
	//*  77  120:lcmp            
	//*  78  121:ifeq            130
			j = i | 0x40;
	//   79  124:iload_3         
	//   80  125:bipush          64
	//   81  127:ior             
	//   82  128:istore          4
		i = j;
	//   83  130:iload           4
	//   84  132:istore_3        
		if((l & 512L) != 0L)
	//*  85  133:lload_1         
	//*  86  134:ldc2w           #342 <Long 512L>
	//*  87  137:land            
	//*  88  138:lconst_0        
	//*  89  139:lcmp            
	//*  90  140:ifeq            149
			i = j | 8;
	//   91  143:iload           4
	//   92  145:bipush          8
	//   93  147:ior             
	//   94  148:istore_3        
		return i;
	//   95  149:iload_3         
	//   96  150:ireturn         
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
	//    1    1:getfield        #145 <Field MediaSessionCompat$Token mToken>
	//    2    4:areturn         
	}

	public boolean isActive()
	{
		return mIsActive;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field boolean mIsActive>
	//    2    4:ireturn         
	}

	void postToHandler(int i)
	{
		postToHandler(i, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #352 <Method void postToHandler(int, Object)>
	//    4    6:return          
	}

	void postToHandler(int i, int j)
	{
		postToHandler(i, ((Object) (null)), j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:invokevirtual   #355 <Method void postToHandler(int, Object, int)>
	//    5    7:return          
	}

	void postToHandler(int i, Object obj)
	{
		postToHandler(i, obj, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #358 <Method void postToHandler(int, Object, Bundle)>
	//    5    7:return          
	}

	void postToHandler(int i, Object obj, int j)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Object mLock>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			if(mHandler != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//*   7   13:ifnull          26
				mHandler.post(i, obj, j);
	//    8   16:aload_0         
	//    9   17:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:iload_3         
	//   13   23:invokevirtual   #363 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.post(int, Object, int)>
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
	//*   1    1:getfield        #84  <Field Object mLock>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			if(mHandler != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//*   7   13:ifnull          26
				mHandler.post(i, obj, bundle);
	//    8   16:aload_0         
	//    9   17:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//   10   20:iload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #365 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.post(int, Object, Bundle)>
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
	//    1    1:getfield        #129 <Field AudioManager mAudioManager>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #370 <Method void AudioManager.registerMediaButtonEventReceiver(ComponentName)>
	//    4    8:return          
	}

	public void release()
	{
		mIsActive = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #93  <Field boolean mIsActive>
		mDestroyed = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #91  <Field boolean mDestroyed>
		update();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #374 <Method boolean update()>
	//    8   14:pop             
		sendSessionDestroyed();
	//    9   15:aload_0         
	//   10   16:invokespecial   #376 <Method void sendSessionDestroyed()>
	//   11   19:return          
	}

	public void sendSessionEvent(String s, Bundle bundle)
	{
		sendEvent(s, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #379 <Method void sendEvent(String, Bundle)>
	//    4    6:return          
	}

	void sendVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #167 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #171 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #173 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onVolumeInfoChanged(parcelablevolumeinfo);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #384 <Method void IMediaControllerCallback.onVolumeInfoChanged(ParcelableVolumeInfo)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #89  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #179 <Method void RemoteCallbackList.finishBroadcast()>
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
		if(flag == mIsActive)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #93  <Field boolean mIsActive>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mIsActive = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #93  <Field boolean mIsActive>
		if(update())
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #374 <Method boolean update()>
	//*  10   18:ifeq            37
		{
			setMetadata(mMetadata);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #387 <Field MediaMetadataCompat mMetadata>
	//   14   26:invokevirtual   #390 <Method void setMetadata(MediaMetadataCompat)>
			setPlaybackState(mState);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #325 <Field PlaybackStateCompat mState>
	//   18   34:invokevirtual   #393 <Method void setPlaybackState(PlaybackStateCompat)>
		}
	//   19   37:return          
	}

	public void setCallback(MediaSessionCompat.Callback callback, Handler handler)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #397 <Field MediaSessionCompat$Callback mCallback>
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
	//    9   15:new             #399 <Class Handler>
	//   10   18:dup             
	//   11   19:invokespecial   #400 <Method void Handler()>
	//   12   22:astore_1        
			synchronized(mLock)
	//*  13   23:aload_0         
	//*  14   24:getfield        #84  <Field Object mLock>
	//*  15   27:astore_2        
	//*  16   28:aload_2         
	//*  17   29:monitorenter    
			{
				if(mHandler != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//*  20   34:ifnull          45
					mHandler.removeCallbacksAndMessages(((Object) (null)));
	//   21   37:aload_0         
	//   22   38:getfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//   23   41:aconst_null     
	//   24   42:invokevirtual   #403 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.removeCallbacksAndMessages(Object)>
				mHandler = new MessageHandler(((Handler) (callback)).getLooper());
	//   25   45:aload_0         
	//   26   46:new             #19  <Class MediaSessionCompat$MediaSessionImplBase$MessageHandler>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #407 <Method Looper Handler.getLooper()>
	//   31   55:invokespecial   #410 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler(MediaSessionCompat$MediaSessionImplBase, Looper)>
	//   32   58:putfield        #360 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
				MediaSessionCompat.Callback.access$300(mCallback, ((MediaSessionCompat.MediaSessionImpl) (this)), ((Handler) (callback)));
	//   33   61:aload_0         
	//   34   62:getfield        #397 <Field MediaSessionCompat$Callback mCallback>
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:invokestatic    #416 <Method void MediaSessionCompat$Callback.access$300(MediaSessionCompat$Callback, MediaSessionCompat$MediaSessionImpl, Handler)>
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
	//*   1    1:getfield        #419 <Field boolean mCaptioningEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mCaptioningEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #419 <Field boolean mCaptioningEnabled>
			sendCaptioningEnabled(flag);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #421 <Method void sendCaptioningEnabled(boolean)>
		}
	//   10   18:return          
	}

	public void setExtras(Bundle bundle)
	{
		mExtras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #424 <Field Bundle mExtras>
		sendExtras(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #426 <Method void sendExtras(Bundle)>
	//    6   10:return          
	}

	public void setFlags(int i)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mFlags = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #429 <Field int mFlags>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		update();
	//   10   14:aload_0         
	//   11   15:invokevirtual   #374 <Method boolean update()>
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
		MediaMetadataCompat mediametadatacompat1 = mediametadatacompat;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(mediametadatacompat != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          21
			mediametadatacompat1 = (new android.support.v4.media.MediaMetadataCompat.Builder(mediametadatacompat, MediaSessionCompat.sMaxBitmapSize)).build();
	//    4    6:new             #432 <Class android.support.v4.media.MediaMetadataCompat$Builder>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:getstatic       #435 <Field int MediaSessionCompat.sMaxBitmapSize>
	//    8   14:invokespecial   #438 <Method void android.support.v4.media.MediaMetadataCompat$Builder(MediaMetadataCompat, int)>
	//    9   17:invokevirtual   #442 <Method MediaMetadataCompat android.support.v4.media.MediaMetadataCompat$Builder.build()>
	//   10   20:astore_2        
		synchronized(mLock)
	//*  11   21:aload_0         
	//*  12   22:getfield        #84  <Field Object mLock>
	//*  13   25:astore_1        
	//*  14   26:aload_1         
	//*  15   27:monitorenter    
		{
			mMetadata = mediametadatacompat1;
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:putfield        #387 <Field MediaMetadataCompat mMetadata>
		}
	//   19   33:aload_1         
	//   20   34:monitorexit     
		sendMetadata(mediametadatacompat1);
	//   21   35:aload_0         
	//   22   36:aload_2         
	//   23   37:invokespecial   #444 <Method void sendMetadata(MediaMetadataCompat)>
		if(!mIsActive)
	//*  24   40:aload_0         
	//*  25   41:getfield        #93  <Field boolean mIsActive>
	//*  26   44:ifne            48
			return;
	//   27   47:return          
		if(mediametadatacompat1 == null)
	//*  28   48:aload_2         
	//*  29   49:ifnonnull       57
			mediametadatacompat = null;
	//   30   52:aconst_null     
	//   31   53:astore_1        
		else
	//*  32   54:goto            62
			mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat1.getBundle()));
	//   33   57:aload_2         
	//   34   58:invokevirtual   #450 <Method Bundle MediaMetadataCompat.getBundle()>
	//   35   61:astore_1        
		buildRccMetadata(((Bundle) (mediametadatacompat))).apply();
	//   36   62:aload_0         
	//   37   63:aload_1         
	//   38   64:invokevirtual   #452 <Method android.media.RemoteControlClient$MetadataEditor buildRccMetadata(Bundle)>
	//   39   67:invokevirtual   #455 <Method void android.media.RemoteControlClient$MetadataEditor.apply()>
		return;
	//   40   70:return          
		exception;
	//   41   71:astore_2        
		mediametadatacompat;
	//   42   72:aload_1         
		JVM INSTR monitorexit ;
	//   43   73:monitorexit     
		throw exception;
	//   44   74:aload_2         
	//   45   75:athrow          
	}

	public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mState = playbackstatecompat;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #325 <Field PlaybackStateCompat mState>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		sendState(playbackstatecompat);
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokespecial   #457 <Method void sendState(PlaybackStateCompat)>
		if(!mIsActive)
	//*  13   19:aload_0         
	//*  14   20:getfield        #93  <Field boolean mIsActive>
	//*  15   23:ifne            27
			return;
	//   16   26:return          
		if(playbackstatecompat == null)
	//*  17   27:aload_1         
	//*  18   28:ifnonnull       48
		{
			mRcc.setPlaybackState(0);
	//   19   31:aload_0         
	//   20   32:getfield        #158 <Field RemoteControlClient mRcc>
	//   21   35:iconst_0        
	//   22   36:invokevirtual   #459 <Method void RemoteControlClient.setPlaybackState(int)>
			mRcc.setTransportControlFlags(0);
	//   23   39:aload_0         
	//   24   40:getfield        #158 <Field RemoteControlClient mRcc>
	//   25   43:iconst_0        
	//   26   44:invokevirtual   #462 <Method void RemoteControlClient.setTransportControlFlags(int)>
			return;
	//   27   47:return          
		} else
		{
			setRccState(playbackstatecompat);
	//   28   48:aload_0         
	//   29   49:aload_1         
	//   30   50:invokevirtual   #465 <Method void setRccState(PlaybackStateCompat)>
			mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackstatecompat.getActions()));
	//   31   53:aload_0         
	//   32   54:getfield        #158 <Field RemoteControlClient mRcc>
	//   33   57:aload_0         
	//   34   58:aload_1         
	//   35   59:invokevirtual   #471 <Method long PlaybackStateCompat.getActions()>
	//   36   62:invokevirtual   #473 <Method int getRccTransportControlFlagsFromActions(long)>
	//   37   65:invokevirtual   #462 <Method void RemoteControlClient.setTransportControlFlags(int)>
			return;
	//   38   68:return          
		}
		playbackstatecompat;
	//   39   69:astore_1        
		obj;
	//   40   70:aload_2         
		JVM INSTR monitorexit ;
	//   41   71:monitorexit     
		throw playbackstatecompat;
	//   42   72:aload_1         
	//   43   73:athrow          
	}

	public void setPlaybackToLocal(int i)
	{
		if(mVolumeProvider != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//*   2    4:ifnull          15
			mVolumeProvider.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #477 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
		mVolumeType = 1;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #149 <Field int mVolumeType>
		sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, 2, mAudioManager.getStreamMaxVolume(mLocalStream), mAudioManager.getStreamVolume(mLocalStream)));
	//   10   20:aload_0         
	//   11   21:new             #479 <Class ParcelableVolumeInfo>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #149 <Field int mVolumeType>
	//   15   29:aload_0         
	//   16   30:getfield        #151 <Field int mLocalStream>
	//   17   33:iconst_2        
	//   18   34:aload_0         
	//   19   35:getfield        #129 <Field AudioManager mAudioManager>
	//   20   38:aload_0         
	//   21   39:getfield        #151 <Field int mLocalStream>
	//   22   42:invokevirtual   #482 <Method int AudioManager.getStreamMaxVolume(int)>
	//   23   45:aload_0         
	//   24   46:getfield        #129 <Field AudioManager mAudioManager>
	//   25   49:aload_0         
	//   26   50:getfield        #151 <Field int mLocalStream>
	//   27   53:invokevirtual   #485 <Method int AudioManager.getStreamVolume(int)>
	//   28   56:invokespecial   #488 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
	//   29   59:invokevirtual   #490 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
	//   30   62:return          
	}

	public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
	{
		if(volumeprovidercompat == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("volumeProvider may not be null");
	//    2    4:new             #104 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #494 <String "volumeProvider may not be null">
	//    5   11:invokespecial   #109 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(mVolumeProvider != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//*   9   19:ifnull          30
			mVolumeProvider.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//   12   26:aconst_null     
	//   13   27:invokevirtual   #477 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
		mVolumeType = 2;
	//   14   30:aload_0         
	//   15   31:iconst_2        
	//   16   32:putfield        #149 <Field int mVolumeType>
		mVolumeProvider = volumeprovidercompat;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #231 <Field VolumeProviderCompat mVolumeProvider>
		sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, mVolumeProvider.getVolumeControl(), mVolumeProvider.getMaxVolume(), mVolumeProvider.getCurrentVolume()));
	//   20   40:aload_0         
	//   21   41:new             #479 <Class ParcelableVolumeInfo>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #149 <Field int mVolumeType>
	//   25   49:aload_0         
	//   26   50:getfield        #151 <Field int mLocalStream>
	//   27   53:aload_0         
	//   28   54:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//   29   57:invokevirtual   #497 <Method int VolumeProviderCompat.getVolumeControl()>
	//   30   60:aload_0         
	//   31   61:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//   32   64:invokevirtual   #500 <Method int VolumeProviderCompat.getMaxVolume()>
	//   33   67:aload_0         
	//   34   68:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//   35   71:invokevirtual   #503 <Method int VolumeProviderCompat.getCurrentVolume()>
	//   36   74:invokespecial   #488 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
	//   37   77:invokevirtual   #490 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
		volumeprovidercompat.setCallback(mVolumeCallback);
	//   38   80:aload_1         
	//   39   81:aload_0         
	//   40   82:getfield        #102 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
	//   41   85:invokevirtual   #477 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
	//   42   88:return          
	}

	public void setQueue(List list)
	{
		mQueue = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #506 <Field List mQueue>
		sendQueue(list);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #508 <Method void sendQueue(List)>
	//    6   10:return          
	}

	public void setQueueTitle(CharSequence charsequence)
	{
		mQueueTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #511 <Field CharSequence mQueueTitle>
		sendQueueTitle(charsequence);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #513 <Method void sendQueueTitle(CharSequence)>
	//    6   10:return          
	}

	public void setRatingType(int i)
	{
		mRatingType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #147 <Field int mRatingType>
	//    3    5:return          
	}

	void setRccState(PlaybackStateCompat playbackstatecompat)
	{
		mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()));
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field RemoteControlClient mRcc>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #517 <Method int PlaybackStateCompat.getState()>
	//    5    9:invokevirtual   #519 <Method int getRccStateFromState(int)>
	//    6   12:invokevirtual   #459 <Method void RemoteControlClient.setPlaybackState(int)>
	//    7   15:return          
	}

	public void setRepeatMode(int i)
	{
		if(mRepeatMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #522 <Field int mRepeatMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mRepeatMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #522 <Field int mRepeatMode>
			sendRepeatMode(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #524 <Method void sendRepeatMode(int)>
		}
	//   10   18:return          
	}

	public void setSessionActivity(PendingIntent pendingintent)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mSessionActivity = pendingintent;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #527 <Field PendingIntent mSessionActivity>
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
	//*   1    1:getfield        #530 <Field int mShuffleMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mShuffleMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #530 <Field int mShuffleMode>
			sendShuffleMode(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #532 <Method void sendShuffleMode(int)>
		}
	//   10   18:return          
	}

	void setVolumeTo(int i, int j)
	{
		if(mVolumeType == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field int mVolumeType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          24
		{
			if(mVolumeProvider != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//*   6   12:ifnull          37
			{
				mVolumeProvider.onSetVolumeTo(i);
	//    7   15:aload_0         
	//    8   16:getfield        #231 <Field VolumeProviderCompat mVolumeProvider>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #536 <Method void VolumeProviderCompat.onSetVolumeTo(int)>
				return;
	//   11   23:return          
			}
		} else
		{
			mAudioManager.setStreamVolume(mLocalStream, i, j);
	//   12   24:aload_0         
	//   13   25:getfield        #129 <Field AudioManager mAudioManager>
	//   14   28:aload_0         
	//   15   29:getfield        #151 <Field int mLocalStream>
	//   16   32:iload_1         
	//   17   33:iload_2         
	//   18   34:invokevirtual   #539 <Method void AudioManager.setStreamVolume(int, int, int)>
		}
	//   19   37:return          
	}

	void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
	{
		mAudioManager.unregisterMediaButtonEventReceiver(componentname);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field AudioManager mAudioManager>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #542 <Method void AudioManager.unregisterMediaButtonEventReceiver(ComponentName)>
	//    4    8:return          
	}

	boolean update()
	{
		if(mIsActive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field boolean mIsActive>
	//*   2    4:ifeq            153
		{
			if(!mIsMbrRegistered && (mFlags & 1) != 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field boolean mIsMbrRegistered>
	//*   5   11:ifne            43
	//*   6   14:aload_0         
	//*   7   15:getfield        #429 <Field int mFlags>
	//*   8   18:iconst_1        
	//*   9   19:iand            
	//*  10   20:ifeq            43
			{
				registerMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #135 <Field PendingIntent mMediaButtonReceiverIntent>
	//   14   28:aload_0         
	//   15   29:getfield        #133 <Field ComponentName mMediaButtonReceiverComponentName>
	//   16   32:invokevirtual   #544 <Method void registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = true;
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:putfield        #95  <Field boolean mIsMbrRegistered>
			} else
	//*  20   40:goto            76
			if(mIsMbrRegistered && (mFlags & 1) == 0)
	//*  21   43:aload_0         
	//*  22   44:getfield        #95  <Field boolean mIsMbrRegistered>
	//*  23   47:ifeq            76
	//*  24   50:aload_0         
	//*  25   51:getfield        #429 <Field int mFlags>
	//*  26   54:iconst_1        
	//*  27   55:iand            
	//*  28   56:ifne            76
			{
				unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #135 <Field PendingIntent mMediaButtonReceiverIntent>
	//   32   64:aload_0         
	//   33   65:getfield        #133 <Field ComponentName mMediaButtonReceiverComponentName>
	//   34   68:invokevirtual   #546 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = false;
	//   35   71:aload_0         
	//   36   72:iconst_0        
	//   37   73:putfield        #95  <Field boolean mIsMbrRegistered>
			}
			if(!mIsRccRegistered && (mFlags & 2) != 0)
	//*  38   76:aload_0         
	//*  39   77:getfield        #97  <Field boolean mIsRccRegistered>
	//*  40   80:ifne            110
	//*  41   83:aload_0         
	//*  42   84:getfield        #429 <Field int mFlags>
	//*  43   87:iconst_2        
	//*  44   88:iand            
	//*  45   89:ifeq            110
			{
				mAudioManager.registerRemoteControlClient(mRcc);
	//   46   92:aload_0         
	//   47   93:getfield        #129 <Field AudioManager mAudioManager>
	//   48   96:aload_0         
	//   49   97:getfield        #158 <Field RemoteControlClient mRcc>
	//   50  100:invokevirtual   #550 <Method void AudioManager.registerRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = true;
	//   51  103:aload_0         
	//   52  104:iconst_1        
	//   53  105:putfield        #97  <Field boolean mIsRccRegistered>
				return true;
	//   54  108:iconst_1        
	//   55  109:ireturn         
			}
			if(mIsRccRegistered && (mFlags & 2) == 0)
	//*  56  110:aload_0         
	//*  57  111:getfield        #97  <Field boolean mIsRccRegistered>
	//*  58  114:ifeq            208
	//*  59  117:aload_0         
	//*  60  118:getfield        #429 <Field int mFlags>
	//*  61  121:iconst_2        
	//*  62  122:iand            
	//*  63  123:ifne            208
			{
				mRcc.setPlaybackState(0);
	//   64  126:aload_0         
	//   65  127:getfield        #158 <Field RemoteControlClient mRcc>
	//   66  130:iconst_0        
	//   67  131:invokevirtual   #459 <Method void RemoteControlClient.setPlaybackState(int)>
				mAudioManager.unregisterRemoteControlClient(mRcc);
	//   68  134:aload_0         
	//   69  135:getfield        #129 <Field AudioManager mAudioManager>
	//   70  138:aload_0         
	//   71  139:getfield        #158 <Field RemoteControlClient mRcc>
	//   72  142:invokevirtual   #553 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = false;
	//   73  145:aload_0         
	//   74  146:iconst_0        
	//   75  147:putfield        #97  <Field boolean mIsRccRegistered>
			}
		} else
	//*  76  150:goto            208
		{
			if(mIsMbrRegistered)
	//*  77  153:aload_0         
	//*  78  154:getfield        #95  <Field boolean mIsMbrRegistered>
	//*  79  157:ifeq            177
			{
				unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   80  160:aload_0         
	//   81  161:aload_0         
	//   82  162:getfield        #135 <Field PendingIntent mMediaButtonReceiverIntent>
	//   83  165:aload_0         
	//   84  166:getfield        #133 <Field ComponentName mMediaButtonReceiverComponentName>
	//   85  169:invokevirtual   #546 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = false;
	//   86  172:aload_0         
	//   87  173:iconst_0        
	//   88  174:putfield        #95  <Field boolean mIsMbrRegistered>
			}
			if(mIsRccRegistered)
	//*  89  177:aload_0         
	//*  90  178:getfield        #97  <Field boolean mIsRccRegistered>
	//*  91  181:ifeq            208
			{
				mRcc.setPlaybackState(0);
	//   92  184:aload_0         
	//   93  185:getfield        #158 <Field RemoteControlClient mRcc>
	//   94  188:iconst_0        
	//   95  189:invokevirtual   #459 <Method void RemoteControlClient.setPlaybackState(int)>
				mAudioManager.unregisterRemoteControlClient(mRcc);
	//   96  192:aload_0         
	//   97  193:getfield        #129 <Field AudioManager mAudioManager>
	//   98  196:aload_0         
	//   99  197:getfield        #158 <Field RemoteControlClient mRcc>
	//  100  200:invokevirtual   #553 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = false;
	//  101  203:aload_0         
	//  102  204:iconst_0        
	//  103  205:putfield        #97  <Field boolean mIsRccRegistered>
			}
		}
		return false;
	//  104  208:iconst_0        
	//  105  209:ireturn         
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
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #82  <Method void Object()>
	//    6   12:putfield        #84  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #86  <Class RemoteCallbackList>
	//    9   19:dup             
	//   10   20:invokespecial   #87  <Method void RemoteCallbackList()>
	//   11   23:putfield        #89  <Field RemoteCallbackList mControllerCallbacks>
		mDestroyed = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #91  <Field boolean mDestroyed>
		mIsActive = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #93  <Field boolean mIsActive>
		mIsMbrRegistered = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #95  <Field boolean mIsMbrRegistered>
		mIsRccRegistered = false;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #97  <Field boolean mIsRccRegistered>
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
	//   28   52:invokespecial   #100 <Method void MediaSessionCompat$MediaSessionImplBase$1(MediaSessionCompat$MediaSessionImplBase)>
	//   29   55:putfield        #102 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
		if(componentname == null)
	//*  30   58:aload_3         
	//*  31   59:ifnonnull       72
		{
			throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
	//   32   62:new             #104 <Class IllegalArgumentException>
	//   33   65:dup             
	//   34   66:ldc1            #106 <String "MediaButtonReceiver component may not be null.">
	//   35   68:invokespecial   #109 <Method void IllegalArgumentException(String)>
	//   36   71:athrow          
		} else
		{
			mContext = context;
	//   37   72:aload_0         
	//   38   73:aload_1         
	//   39   74:putfield        #111 <Field Context mContext>
			mPackageName = context.getPackageName();
	//   40   77:aload_0         
	//   41   78:aload_1         
	//   42   79:invokevirtual   #117 <Method String Context.getPackageName()>
	//   43   82:putfield        #119 <Field String mPackageName>
			mAudioManager = (AudioManager)context.getSystemService("audio");
	//   44   85:aload_0         
	//   45   86:aload_1         
	//   46   87:ldc1            #121 <String "audio">
	//   47   89:invokevirtual   #125 <Method Object Context.getSystemService(String)>
	//   48   92:checkcast       #127 <Class AudioManager>
	//   49   95:putfield        #129 <Field AudioManager mAudioManager>
			mTag = s;
	//   50   98:aload_0         
	//   51   99:aload_2         
	//   52  100:putfield        #131 <Field String mTag>
			mMediaButtonReceiverComponentName = componentname;
	//   53  103:aload_0         
	//   54  104:aload_3         
	//   55  105:putfield        #133 <Field ComponentName mMediaButtonReceiverComponentName>
			mMediaButtonReceiverIntent = pendingintent;
	//   56  108:aload_0         
	//   57  109:aload           4
	//   58  111:putfield        #135 <Field PendingIntent mMediaButtonReceiverIntent>
			mStub = new MediaSessionStub();
	//   59  114:aload_0         
	//   60  115:new             #16  <Class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub>
	//   61  118:dup             
	//   62  119:aload_0         
	//   63  120:invokespecial   #136 <Method void MediaSessionCompat$MediaSessionImplBase$MediaSessionStub(MediaSessionCompat$MediaSessionImplBase)>
	//   64  123:putfield        #138 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
			mToken = new MediaSessionCompat.Token(((Object) (mStub)));
	//   65  126:aload_0         
	//   66  127:new             #140 <Class MediaSessionCompat$Token>
	//   67  130:dup             
	//   68  131:aload_0         
	//   69  132:getfield        #138 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
	//   70  135:invokespecial   #143 <Method void MediaSessionCompat$Token(Object)>
	//   71  138:putfield        #145 <Field MediaSessionCompat$Token mToken>
			mRatingType = 0;
	//   72  141:aload_0         
	//   73  142:iconst_0        
	//   74  143:putfield        #147 <Field int mRatingType>
			mVolumeType = 1;
	//   75  146:aload_0         
	//   76  147:iconst_1        
	//   77  148:putfield        #149 <Field int mVolumeType>
			mLocalStream = 3;
	//   78  151:aload_0         
	//   79  152:iconst_3        
	//   80  153:putfield        #151 <Field int mLocalStream>
			mRcc = new RemoteControlClient(pendingintent);
	//   81  156:aload_0         
	//   82  157:new             #153 <Class RemoteControlClient>
	//   83  160:dup             
	//   84  161:aload           4
	//   85  163:invokespecial   #156 <Method void RemoteControlClient(PendingIntent)>
	//   86  166:putfield        #158 <Field RemoteControlClient mRcc>
			return;
	//   87  169:return          
		}
	}
}
