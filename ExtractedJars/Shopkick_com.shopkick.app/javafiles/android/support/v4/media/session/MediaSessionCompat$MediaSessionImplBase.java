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
		//    1    1:bipush          25
		//    2    3:aload_1         
		//    3    4:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    4    7:return          
		}

		public void addQueueItemAt(MediaDescriptionCompat mediadescriptioncompat, int i)
		{
			postToHandler(26, ((Object) (mediadescriptioncompat)), i);
		//    0    0:aload_0         
		//    1    1:bipush          26
		//    2    3:aload_1         
		//    3    4:iload_2         
		//    4    5:invokevirtual   #31  <Method void postToHandler(int, Object, int)>
		//    5    8:return          
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
		//    1    1:bipush          16
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
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
			return MediaSessionCompat.getStateWithUpdatedPosition(playbackstatecompat, mediametadatacompat);
		//   16   28:aload_2         
		//   17   29:aload_3         
		//   18   30:invokestatic    #87  <Method PlaybackStateCompat MediaSessionCompat.getStateWithUpdatedPosition(PlaybackStateCompat, MediaMetadataCompat)>
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
			if(l != 2)
				break MISSING_BLOCK_LABEL_66;
		//   18   39:iload           4
		//   19   41:iconst_2        
		//   20   42:icmpne          66
			int i;
			int j;
			int k;
			j = volumeprovidercompat.getVolumeControl();
		//   21   45:aload           7
		//   22   47:invokevirtual   #135 <Method int VolumeProviderCompat.getVolumeControl()>
		//   23   50:istore_2        
			i = volumeprovidercompat.getMaxVolume();
		//   24   51:aload           7
		//   25   53:invokevirtual   #138 <Method int VolumeProviderCompat.getMaxVolume()>
		//   26   56:istore_1        
			k = volumeprovidercompat.getCurrentVolume();
		//   27   57:aload           7
		//   28   59:invokevirtual   #141 <Method int VolumeProviderCompat.getCurrentVolume()>
		//   29   62:istore_3        
			break MISSING_BLOCK_LABEL_94;
		//   30   63:goto            94
			i = mAudioManager.getStreamMaxVolume(i1);
		//   31   66:aload_0         
		//   32   67:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   33   70:getfield        #145 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   34   73:iload           5
		//   35   75:invokevirtual   #151 <Method int AudioManager.getStreamMaxVolume(int)>
		//   36   78:istore_1        
			k = mAudioManager.getStreamVolume(i1);
		//   37   79:aload_0         
		//   38   80:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   39   83:getfield        #145 <Field AudioManager MediaSessionCompat$MediaSessionImplBase.mAudioManager>
		//   40   86:iload           5
		//   41   88:invokevirtual   #154 <Method int AudioManager.getStreamVolume(int)>
		//   42   91:istore_3        
			j = 2;
		//   43   92:iconst_2        
		//   44   93:istore_2        
			obj;
		//   45   94:aload           6
			JVM INSTR monitorexit ;
		//   46   96:monitorexit     
			return new ParcelableVolumeInfo(l, i1, j, i, k);
		//   47   97:new             #156 <Class ParcelableVolumeInfo>
		//   48  100:dup             
		//   49  101:iload           4
		//   50  103:iload           5
		//   51  105:iload_2         
		//   52  106:iload_1         
		//   53  107:iload_3         
		//   54  108:invokespecial   #159 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
		//   55  111:areturn         
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
		//    1    1:bipush          14
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void pause()
			throws RemoteException
		{
			postToHandler(12);
		//    0    0:aload_0         
		//    1    1:bipush          12
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void play()
			throws RemoteException
		{
			postToHandler(7);
		//    0    0:aload_0         
		//    1    1:bipush          7
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void playFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(8, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          8
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		public void playFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(9, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          9
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		public void playFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			postToHandler(10, ((Object) (uri)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          10
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		void postToHandler(int i)
		{
			MediaSessionCompat.MediaSessionImplBase.this.postToHandler(i, 0, 0, ((Object) (null)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iconst_0        
		//    4    6:iconst_0        
		//    5    7:aconst_null     
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #181 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int, int, Object, Bundle)>
		//    8   12:return          
		}

		void postToHandler(int i, int j)
		{
			MediaSessionCompat.MediaSessionImplBase.this.postToHandler(i, j, 0, ((Object) (null)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:iconst_0        
		//    5    7:aconst_null     
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #181 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int, int, Object, Bundle)>
		//    8   12:return          
		}

		void postToHandler(int i, Object obj)
		{
			MediaSessionCompat.MediaSessionImplBase.this.postToHandler(i, 0, 0, obj, ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iconst_0        
		//    4    6:iconst_0        
		//    5    7:aload_2         
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #181 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int, int, Object, Bundle)>
		//    8   12:return          
		}

		void postToHandler(int i, Object obj, int j)
		{
			MediaSessionCompat.MediaSessionImplBase.this.postToHandler(i, j, 0, obj, ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iload_3         
		//    4    6:iconst_0        
		//    5    7:aload_2         
		//    6    8:aconst_null     
		//    7    9:invokevirtual   #181 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int, int, Object, Bundle)>
		//    8   12:return          
		}

		void postToHandler(int i, Object obj, Bundle bundle)
		{
			MediaSessionCompat.MediaSessionImplBase.this.postToHandler(i, 0, 0, obj, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:iload_1         
		//    3    5:iconst_0        
		//    4    6:iconst_0        
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #181 <Method void MediaSessionCompat$MediaSessionImplBase.postToHandler(int, int, int, Object, Bundle)>
		//    8   12:return          
		}

		public void prepare()
			throws RemoteException
		{
			postToHandler(3);
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    5:return          
		}

		public void prepareFromMediaId(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(4, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:aload_1         
		//    3    3:aload_2         
		//    4    4:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    7:return          
		}

		public void prepareFromSearch(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(5, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:iconst_5        
		//    2    2:aload_1         
		//    3    3:aload_2         
		//    4    4:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    7:return          
		}

		public void prepareFromUri(Uri uri, Bundle bundle)
			throws RemoteException
		{
			postToHandler(6, ((Object) (uri)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          6
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
		}

		public void previous()
			throws RemoteException
		{
			postToHandler(15);
		//    0    0:aload_0         
		//    1    1:bipush          15
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void rate(RatingCompat ratingcompat)
			throws RemoteException
		{
			postToHandler(19, ((Object) (ratingcompat)));
		//    0    0:aload_0         
		//    1    1:bipush          19
		//    2    3:aload_1         
		//    3    4:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    4    7:return          
		}

		public void rateWithExtras(RatingCompat ratingcompat, Bundle bundle)
			throws RemoteException
		{
			postToHandler(31, ((Object) (ratingcompat)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          31
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
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
		//*   7   17:new             #204 <Class android.support.v4.media.MediaSessionManager$RemoteUserInfo>
		//*   8   20:dup             
		//*   9   21:ldc1            #206 <String "android.media.session.MediaController">
		//*  10   23:invokestatic    #209 <Method int getCallingPid()>
		//*  11   26:invokestatic    #212 <Method int getCallingUid()>
		//*  12   29:invokespecial   #215 <Method void android.support.v4.media.MediaSessionManager$RemoteUserInfo(String, int, int)>
		//*  13   32:astore_2        
		//*  14   33:aload_0         
		//*  15   34:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//*  16   37:getfield        #219 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//*  17   40:aload_1         
		//*  18   41:aload_2         
		//*  19   42:invokevirtual   #225 <Method boolean RemoteCallbackList.register(android.os.IInterface, Object)>
		//*  20   45:pop             
		//*  21   46:return          
				// Misplaced declaration of an exception variable
				catch(IMediaControllerCallback imediacontrollercallback)
		//*  22   47:astore_1        
				{
					return;
		//   23   48:return          
				}
			} else
			{
				android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo = new android.support.v4.media.MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", getCallingPid(), getCallingUid());
				mControllerCallbacks.register(((android.os.IInterface) (imediacontrollercallback)), ((Object) (remoteuserinfo)));
				return;
			}
		}

		public void removeQueueItem(MediaDescriptionCompat mediadescriptioncompat)
		{
			postToHandler(27, ((Object) (mediadescriptioncompat)));
		//    0    0:aload_0         
		//    1    1:bipush          27
		//    2    3:aload_1         
		//    3    4:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    4    7:return          
		}

		public void removeQueueItemAt(int i)
		{
			postToHandler(28, i);
		//    0    0:aload_0         
		//    1    1:bipush          28
		//    2    3:iload_1         
		//    3    4:invokevirtual   #229 <Method void postToHandler(int, int)>
		//    4    7:return          
		}

		public void rewind()
			throws RemoteException
		{
			postToHandler(17);
		//    0    0:aload_0         
		//    1    1:bipush          17
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void seekTo(long l)
			throws RemoteException
		{
			postToHandler(18, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:bipush          18
		//    2    3:lload_1         
		//    3    4:invokestatic    #238 <Method Long Long.valueOf(long)>
		//    4    7:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    5   10:return          
		}

		public void sendCommand(String s, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultreceiverwrapper)
		{
			postToHandler(1, ((Object) (new Command(s, bundle, resultreceiverwrapper.mResultReceiver))));
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:new             #242 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//    3    5:dup             
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:getfield        #248 <Field ResultReceiver MediaSessionCompat$ResultReceiverWrapper.mResultReceiver>
		//    8   12:invokespecial   #251 <Method void MediaSessionCompat$MediaSessionImplBase$Command(String, Bundle, ResultReceiver)>
		//    9   15:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//   10   18:return          
		}

		public void sendCustomAction(String s, Bundle bundle)
			throws RemoteException
		{
			postToHandler(20, ((Object) (s)), bundle);
		//    0    0:aload_0         
		//    1    1:bipush          20
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #175 <Method void postToHandler(int, Object, Bundle)>
		//    5    8:return          
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
		//*  14   22:ifeq            32
				postToHandler(21, ((Object) (keyevent)));
		//   15   25:aload_0         
		//   16   26:bipush          21
		//   17   28:aload_1         
		//   18   29:invokevirtual   #26  <Method void postToHandler(int, Object)>
			return flag;
		//   19   32:iload_3         
		//   20   33:ireturn         
		}

		public void setCaptioningEnabled(boolean flag)
			throws RemoteException
		{
			postToHandler(29, ((Object) (Boolean.valueOf(flag))));
		//    0    0:aload_0         
		//    1    1:bipush          29
		//    2    3:iload_1         
		//    3    4:invokestatic    #261 <Method Boolean Boolean.valueOf(boolean)>
		//    4    7:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    5   10:return          
		}

		public void setRepeatMode(int i)
			throws RemoteException
		{
			postToHandler(23, i);
		//    0    0:aload_0         
		//    1    1:bipush          23
		//    2    3:iload_1         
		//    3    4:invokevirtual   #229 <Method void postToHandler(int, int)>
		//    4    7:return          
		}

		public void setShuffleMode(int i)
			throws RemoteException
		{
			postToHandler(30, i);
		//    0    0:aload_0         
		//    1    1:bipush          30
		//    2    3:iload_1         
		//    3    4:invokevirtual   #229 <Method void postToHandler(int, int)>
		//    4    7:return          
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
		//    4    6:invokevirtual   #267 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
		//    5    9:return          
		}

		public void skipToQueueItem(long l)
		{
			postToHandler(11, ((Object) (Long.valueOf(l))));
		//    0    0:aload_0         
		//    1    1:bipush          11
		//    2    3:lload_1         
		//    3    4:invokestatic    #238 <Method Long Long.valueOf(long)>
		//    4    7:invokevirtual   #26  <Method void postToHandler(int, Object)>
		//    5   10:return          
		}

		public void stop()
			throws RemoteException
		{
			postToHandler(13);
		//    0    0:aload_0         
		//    1    1:bipush          13
		//    2    3:invokevirtual   #42  <Method void postToHandler(int)>
		//    3    6:return          
		}

		public void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback)
		{
			mControllerCallbacks.unregister(((android.os.IInterface) (imediacontrollercallback)));
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #219 <Field RemoteCallbackList MediaSessionCompat$MediaSessionImplBase.mControllerCallbacks>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #274 <Method boolean RemoteCallbackList.unregister(android.os.IInterface)>
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
			MediaSessionCompat.Callback callback;
			Object obj;
			callback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//    2    4:getfield        #158 <Field MediaSessionCompat$Callback MediaSessionCompat$MediaSessionImplBase.mCallback>
		//    3    7:astore_2        
			if(callback == null)
		//*   4    8:aload_2         
		//*   5    9:ifnonnull       13
				return;
		//    6   12:return          
			obj = ((Object) (message.getData()));
		//    7   13:aload_1         
		//    8   14:invokevirtual   #164 <Method Bundle Message.getData()>
		//    9   17:astore_3        
			MediaSessionCompat.ensureClassLoader(((Bundle) (obj)));
		//   10   18:aload_3         
		//   11   19:invokestatic    #168 <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			setCurrentControllerInfo(new android.support.v4.media.MediaSessionManager.RemoteUserInfo(((Bundle) (obj)).getString("data_calling_pkg"), ((Bundle) (obj)).getInt("data_calling_pid"), ((Bundle) (obj)).getInt("data_calling_uid")));
		//   12   22:aload_0         
		//   13   23:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   14   26:new             #170 <Class android.support.v4.media.MediaSessionManager$RemoteUserInfo>
		//   15   29:dup             
		//   16   30:aload_3         
		//   17   31:ldc1            #172 <String "data_calling_pkg">
		//   18   33:invokevirtual   #178 <Method String Bundle.getString(String)>
		//   19   36:aload_3         
		//   20   37:ldc1            #180 <String "data_calling_pid">
		//   21   39:invokevirtual   #184 <Method int Bundle.getInt(String)>
		//   22   42:aload_3         
		//   23   43:ldc1            #186 <String "data_calling_uid">
		//   24   45:invokevirtual   #184 <Method int Bundle.getInt(String)>
		//   25   48:invokespecial   #189 <Method void android.support.v4.media.MediaSessionManager$RemoteUserInfo(String, int, int)>
		//   26   51:invokevirtual   #193 <Method void MediaSessionCompat$MediaSessionImplBase.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
			obj = ((Object) (((Bundle) (obj)).getBundle("data_extras")));
		//   27   54:aload_3         
		//   28   55:ldc1            #195 <String "data_extras">
		//   29   57:invokevirtual   #199 <Method Bundle Bundle.getBundle(String)>
		//   30   60:astore_3        
			MediaSessionCompat.ensureClassLoader(((Bundle) (obj)));
		//   31   61:aload_3         
		//   32   62:invokestatic    #168 <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
			message.what;
		//   33   65:aload_1         
		//   34   66:getfield        #202 <Field int Message.what>
			JVM INSTR tableswitch 1 31: default 710
		//		               1 666
		//		               2 651
		//		               3 644
		//		               4 629
		//		               5 614
		//		               6 599
		//		               7 592
		//		               8 577
		//		               9 562
		//		               10 547
		//		               11 530
		//		               12 523
		//		               13 516
		//		               14 509
		//		               15 502
		//		               16 495
		//		               17 488
		//		               18 471
		//		               19 457
		//		               20 442
		//		               21 397
		//		               22 382
		//		               23 371
		//		               24 710
		//		               25 357
		//		               26 339
		//		               27 325
		//		               28 251
		//		               29 234
		//		               30 223
		//		               31 208;
		//   35   69:tableswitch     1 31: default 710
		//		               1 666
		//		               2 651
		//		               3 644
		//		               4 629
		//		               5 614
		//		               6 599
		//		               7 592
		//		               8 577
		//		               9 562
		//		               10 547
		//		               11 530
		//		               12 523
		//		               13 516
		//		               14 509
		//		               15 502
		//		               16 495
		//		               17 488
		//		               18 471
		//		               19 457
		//		               20 442
		//		               21 397
		//		               22 382
		//		               23 371
		//		               24 710
		//		               25 357
		//		               26 339
		//		               27 325
		//		               28 251
		//		               29 234
		//		               30 223
		//		               31 208
			   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L1 _L25 _L26 _L27 _L28 _L29 _L30 _L31
_L1:
			break; /* Loop/switch isn't completed */
_L31:
			callback.onSetRating((RatingCompat)message.obj, ((Bundle) (obj)));
		//   36  208:aload_2         
		//   37  209:aload_1         
		//   38  210:getfield        #206 <Field Object Message.obj>
		//   39  213:checkcast       #208 <Class RatingCompat>
		//   40  216:aload_3         
		//   41  217:invokevirtual   #212 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat, Bundle)>
			break; /* Loop/switch isn't completed */
		//   42  220:goto            690
_L30:
			callback.onSetShuffleMode(message.arg1);
		//   43  223:aload_2         
		//   44  224:aload_1         
		//   45  225:getfield        #215 <Field int Message.arg1>
		//   46  228:invokevirtual   #219 <Method void MediaSessionCompat$Callback.onSetShuffleMode(int)>
			break; /* Loop/switch isn't completed */
		//   47  231:goto            690
_L29:
			callback.onSetCaptioningEnabled(((Boolean)message.obj).booleanValue());
		//   48  234:aload_2         
		//   49  235:aload_1         
		//   50  236:getfield        #206 <Field Object Message.obj>
		//   51  239:checkcast       #221 <Class Boolean>
		//   52  242:invokevirtual   #225 <Method boolean Boolean.booleanValue()>
		//   53  245:invokevirtual   #229 <Method void MediaSessionCompat$Callback.onSetCaptioningEnabled(boolean)>
			break; /* Loop/switch isn't completed */
		//   54  248:goto            690
_L28:
			if(mQueue == null)
				break; /* Loop/switch isn't completed */
		//   55  251:aload_0         
		//   56  252:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   57  255:getfield        #233 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//   58  258:ifnull          690
			if(message.arg1 < 0 || message.arg1 >= mQueue.size()) goto _L33; else goto _L32
		//   59  261:aload_1         
		//   60  262:getfield        #215 <Field int Message.arg1>
		//   61  265:iflt            713
		//   62  268:aload_1         
		//   63  269:getfield        #215 <Field int Message.arg1>
		//   64  272:aload_0         
		//   65  273:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   66  276:getfield        #233 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//   67  279:invokeinterface #238 <Method int List.size()>
		//   68  284:icmpge          713
_L32:
			message = ((Message) ((MediaSessionCompat.QueueItem)mQueue.get(message.arg1)));
		//   69  287:aload_0         
		//   70  288:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//   71  291:getfield        #233 <Field List MediaSessionCompat$MediaSessionImplBase.mQueue>
		//   72  294:aload_1         
		//   73  295:getfield        #215 <Field int Message.arg1>
		//   74  298:invokeinterface #242 <Method Object List.get(int)>
		//   75  303:checkcast       #244 <Class MediaSessionCompat$QueueItem>
		//   76  306:astore_1        
		//*  77  307:goto            310
_L35:
			if(message == null)
				break; /* Loop/switch isn't completed */
		//   78  310:aload_1         
		//   79  311:ifnull          690
			callback.onRemoveQueueItem(((MediaSessionCompat.QueueItem) (message)).getDescription());
		//   80  314:aload_2         
		//   81  315:aload_1         
		//   82  316:invokevirtual   #248 <Method MediaDescriptionCompat MediaSessionCompat$QueueItem.getDescription()>
		//   83  319:invokevirtual   #252 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
			break; /* Loop/switch isn't completed */
		//   84  322:goto            690
_L27:
			callback.onRemoveQueueItem((MediaDescriptionCompat)message.obj);
		//   85  325:aload_2         
		//   86  326:aload_1         
		//   87  327:getfield        #206 <Field Object Message.obj>
		//   88  330:checkcast       #254 <Class MediaDescriptionCompat>
		//   89  333:invokevirtual   #252 <Method void MediaSessionCompat$Callback.onRemoveQueueItem(MediaDescriptionCompat)>
			break; /* Loop/switch isn't completed */
		//   90  336:goto            690
_L26:
			callback.onAddQueueItem((MediaDescriptionCompat)message.obj, message.arg1);
		//   91  339:aload_2         
		//   92  340:aload_1         
		//   93  341:getfield        #206 <Field Object Message.obj>
		//   94  344:checkcast       #254 <Class MediaDescriptionCompat>
		//   95  347:aload_1         
		//   96  348:getfield        #215 <Field int Message.arg1>
		//   97  351:invokevirtual   #258 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat, int)>
			break; /* Loop/switch isn't completed */
		//   98  354:goto            690
_L25:
			callback.onAddQueueItem((MediaDescriptionCompat)message.obj);
		//   99  357:aload_2         
		//  100  358:aload_1         
		//  101  359:getfield        #206 <Field Object Message.obj>
		//  102  362:checkcast       #254 <Class MediaDescriptionCompat>
		//  103  365:invokevirtual   #260 <Method void MediaSessionCompat$Callback.onAddQueueItem(MediaDescriptionCompat)>
			break; /* Loop/switch isn't completed */
		//  104  368:goto            690
_L24:
			callback.onSetRepeatMode(message.arg1);
		//  105  371:aload_2         
		//  106  372:aload_1         
		//  107  373:getfield        #215 <Field int Message.arg1>
		//  108  376:invokevirtual   #263 <Method void MediaSessionCompat$Callback.onSetRepeatMode(int)>
			break; /* Loop/switch isn't completed */
		//  109  379:goto            690
_L23:
			setVolumeTo(message.arg1, 0);
		//  110  382:aload_0         
		//  111  383:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  112  386:aload_1         
		//  113  387:getfield        #215 <Field int Message.arg1>
		//  114  390:iconst_0        
		//  115  391:invokevirtual   #267 <Method void MediaSessionCompat$MediaSessionImplBase.setVolumeTo(int, int)>
			break; /* Loop/switch isn't completed */
		//  116  394:goto            690
_L22:
			message = ((Message) ((KeyEvent)message.obj));
		//  117  397:aload_1         
		//  118  398:getfield        #206 <Field Object Message.obj>
		//  119  401:checkcast       #89  <Class KeyEvent>
		//  120  404:astore_1        
			obj = ((Object) (new Intent("android.intent.action.MEDIA_BUTTON")));
		//  121  405:new             #269 <Class Intent>
		//  122  408:dup             
		//  123  409:ldc2            #271 <String "android.intent.action.MEDIA_BUTTON">
		//  124  412:invokespecial   #274 <Method void Intent(String)>
		//  125  415:astore_3        
			((Intent) (obj)).putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (message)));
		//  126  416:aload_3         
		//  127  417:ldc2            #276 <String "android.intent.extra.KEY_EVENT">
		//  128  420:aload_1         
		//  129  421:invokevirtual   #280 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
		//  130  424:pop             
			if(!callback.onMediaButtonEvent(((Intent) (obj))))
		//* 131  425:aload_2         
		//* 132  426:aload_3         
		//* 133  427:invokevirtual   #283 <Method boolean MediaSessionCompat$Callback.onMediaButtonEvent(Intent)>
		//* 134  430:ifne            690
				onMediaButtonEvent(((KeyEvent) (message)), callback);
		//  135  433:aload_0         
		//  136  434:aload_1         
		//  137  435:aload_2         
		//  138  436:invokespecial   #285 <Method void onMediaButtonEvent(KeyEvent, MediaSessionCompat$Callback)>
			break; /* Loop/switch isn't completed */
		//  139  439:goto            690
_L21:
			callback.onCustomAction((String)message.obj, ((Bundle) (obj)));
		//  140  442:aload_2         
		//  141  443:aload_1         
		//  142  444:getfield        #206 <Field Object Message.obj>
		//  143  447:checkcast       #287 <Class String>
		//  144  450:aload_3         
		//  145  451:invokevirtual   #291 <Method void MediaSessionCompat$Callback.onCustomAction(String, Bundle)>
			break; /* Loop/switch isn't completed */
		//  146  454:goto            690
_L20:
			callback.onSetRating((RatingCompat)message.obj);
		//  147  457:aload_2         
		//  148  458:aload_1         
		//  149  459:getfield        #206 <Field Object Message.obj>
		//  150  462:checkcast       #208 <Class RatingCompat>
		//  151  465:invokevirtual   #294 <Method void MediaSessionCompat$Callback.onSetRating(RatingCompat)>
			break; /* Loop/switch isn't completed */
		//  152  468:goto            690
_L19:
			callback.onSeekTo(((Long)message.obj).longValue());
		//  153  471:aload_2         
		//  154  472:aload_1         
		//  155  473:getfield        #206 <Field Object Message.obj>
		//  156  476:checkcast       #296 <Class Long>
		//  157  479:invokevirtual   #299 <Method long Long.longValue()>
		//  158  482:invokevirtual   #303 <Method void MediaSessionCompat$Callback.onSeekTo(long)>
			break; /* Loop/switch isn't completed */
		//  159  485:goto            690
_L18:
			callback.onRewind();
		//  160  488:aload_2         
		//  161  489:invokevirtual   #129 <Method void MediaSessionCompat$Callback.onRewind()>
			break; /* Loop/switch isn't completed */
		//  162  492:goto            690
_L17:
			callback.onFastForward();
		//  163  495:aload_2         
		//  164  496:invokevirtual   #124 <Method void MediaSessionCompat$Callback.onFastForward()>
			break; /* Loop/switch isn't completed */
		//  165  499:goto            690
_L16:
			callback.onSkipToPrevious();
		//  166  502:aload_2         
		//  167  503:invokevirtual   #134 <Method void MediaSessionCompat$Callback.onSkipToPrevious()>
			break; /* Loop/switch isn't completed */
		//  168  506:goto            690
_L15:
			callback.onSkipToNext();
		//  169  509:aload_2         
		//  170  510:invokevirtual   #139 <Method void MediaSessionCompat$Callback.onSkipToNext()>
			break; /* Loop/switch isn't completed */
		//  171  513:goto            690
_L14:
			callback.onStop();
		//  172  516:aload_2         
		//  173  517:invokevirtual   #142 <Method void MediaSessionCompat$Callback.onStop()>
			break; /* Loop/switch isn't completed */
		//  174  520:goto            690
_L13:
			callback.onPause();
		//  175  523:aload_2         
		//  176  524:invokevirtual   #114 <Method void MediaSessionCompat$Callback.onPause()>
			break; /* Loop/switch isn't completed */
		//  177  527:goto            690
_L12:
			callback.onSkipToQueueItem(((Long)message.obj).longValue());
		//  178  530:aload_2         
		//  179  531:aload_1         
		//  180  532:getfield        #206 <Field Object Message.obj>
		//  181  535:checkcast       #296 <Class Long>
		//  182  538:invokevirtual   #299 <Method long Long.longValue()>
		//  183  541:invokevirtual   #306 <Method void MediaSessionCompat$Callback.onSkipToQueueItem(long)>
			break; /* Loop/switch isn't completed */
		//  184  544:goto            690
_L11:
			callback.onPlayFromUri((Uri)message.obj, ((Bundle) (obj)));
		//  185  547:aload_2         
		//  186  548:aload_1         
		//  187  549:getfield        #206 <Field Object Message.obj>
		//  188  552:checkcast       #308 <Class Uri>
		//  189  555:aload_3         
		//  190  556:invokevirtual   #312 <Method void MediaSessionCompat$Callback.onPlayFromUri(Uri, Bundle)>
			break; /* Loop/switch isn't completed */
		//  191  559:goto            690
_L10:
			callback.onPlayFromSearch((String)message.obj, ((Bundle) (obj)));
		//  192  562:aload_2         
		//  193  563:aload_1         
		//  194  564:getfield        #206 <Field Object Message.obj>
		//  195  567:checkcast       #287 <Class String>
		//  196  570:aload_3         
		//  197  571:invokevirtual   #315 <Method void MediaSessionCompat$Callback.onPlayFromSearch(String, Bundle)>
			break; /* Loop/switch isn't completed */
		//  198  574:goto            690
_L9:
			callback.onPlayFromMediaId((String)message.obj, ((Bundle) (obj)));
		//  199  577:aload_2         
		//  200  578:aload_1         
		//  201  579:getfield        #206 <Field Object Message.obj>
		//  202  582:checkcast       #287 <Class String>
		//  203  585:aload_3         
		//  204  586:invokevirtual   #318 <Method void MediaSessionCompat$Callback.onPlayFromMediaId(String, Bundle)>
			break; /* Loop/switch isn't completed */
		//  205  589:goto            690
_L8:
			callback.onPlay();
		//  206  592:aload_2         
		//  207  593:invokevirtual   #119 <Method void MediaSessionCompat$Callback.onPlay()>
			break; /* Loop/switch isn't completed */
		//  208  596:goto            690
_L7:
			callback.onPrepareFromUri((Uri)message.obj, ((Bundle) (obj)));
		//  209  599:aload_2         
		//  210  600:aload_1         
		//  211  601:getfield        #206 <Field Object Message.obj>
		//  212  604:checkcast       #308 <Class Uri>
		//  213  607:aload_3         
		//  214  608:invokevirtual   #321 <Method void MediaSessionCompat$Callback.onPrepareFromUri(Uri, Bundle)>
			break; /* Loop/switch isn't completed */
		//  215  611:goto            690
_L6:
			callback.onPrepareFromSearch((String)message.obj, ((Bundle) (obj)));
		//  216  614:aload_2         
		//  217  615:aload_1         
		//  218  616:getfield        #206 <Field Object Message.obj>
		//  219  619:checkcast       #287 <Class String>
		//  220  622:aload_3         
		//  221  623:invokevirtual   #324 <Method void MediaSessionCompat$Callback.onPrepareFromSearch(String, Bundle)>
			break; /* Loop/switch isn't completed */
		//  222  626:goto            690
_L5:
			callback.onPrepareFromMediaId((String)message.obj, ((Bundle) (obj)));
		//  223  629:aload_2         
		//  224  630:aload_1         
		//  225  631:getfield        #206 <Field Object Message.obj>
		//  226  634:checkcast       #287 <Class String>
		//  227  637:aload_3         
		//  228  638:invokevirtual   #327 <Method void MediaSessionCompat$Callback.onPrepareFromMediaId(String, Bundle)>
			break; /* Loop/switch isn't completed */
		//  229  641:goto            690
_L4:
			callback.onPrepare();
		//  230  644:aload_2         
		//  231  645:invokevirtual   #330 <Method void MediaSessionCompat$Callback.onPrepare()>
			break; /* Loop/switch isn't completed */
		//  232  648:goto            690
_L3:
			adjustVolume(message.arg1, 0);
		//  233  651:aload_0         
		//  234  652:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  235  655:aload_1         
		//  236  656:getfield        #215 <Field int Message.arg1>
		//  237  659:iconst_0        
		//  238  660:invokevirtual   #333 <Method void MediaSessionCompat$MediaSessionImplBase.adjustVolume(int, int)>
			break; /* Loop/switch isn't completed */
		//  239  663:goto            690
_L2:
			message = ((Message) ((Command)message.obj));
		//  240  666:aload_1         
		//  241  667:getfield        #206 <Field Object Message.obj>
		//  242  670:checkcast       #335 <Class MediaSessionCompat$MediaSessionImplBase$Command>
		//  243  673:astore_1        
			callback.onCommand(((Command) (message)).command, ((Command) (message)).extras, ((Command) (message)).stub);
		//  244  674:aload_2         
		//  245  675:aload_1         
		//  246  676:getfield        #339 <Field String MediaSessionCompat$MediaSessionImplBase$Command.command>
		//  247  679:aload_1         
		//  248  680:getfield        #343 <Field Bundle MediaSessionCompat$MediaSessionImplBase$Command.extras>
		//  249  683:aload_1         
		//  250  684:getfield        #347 <Field ResultReceiver MediaSessionCompat$MediaSessionImplBase$Command.stub>
		//  251  687:invokevirtual   #351 <Method void MediaSessionCompat$Callback.onCommand(String, Bundle, ResultReceiver)>
			setCurrentControllerInfo(((android.support.v4.media.MediaSessionManager.RemoteUserInfo) (null)));
		//  252  690:aload_0         
		//  253  691:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  254  694:aconst_null     
		//  255  695:invokevirtual   #193 <Method void MediaSessionCompat$MediaSessionImplBase.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
			return;
		//  256  698:return          
			message;
		//  257  699:astore_1        
			setCurrentControllerInfo(((android.support.v4.media.MediaSessionManager.RemoteUserInfo) (null)));
		//  258  700:aload_0         
		//  259  701:getfield        #81  <Field MediaSessionCompat$MediaSessionImplBase this$0>
		//  260  704:aconst_null     
		//  261  705:invokevirtual   #193 <Method void MediaSessionCompat$MediaSessionImplBase.setCurrentControllerInfo(android.support.v4.media.MediaSessionManager$RemoteUserInfo)>
			throw message;
		//  262  708:aload_1         
		//  263  709:athrow          
		//* 264  710:goto            690
_L33:
			message = null;
		//  265  713:aconst_null     
		//  266  714:astore_1        
			if(true) goto _L35; else goto _L34
		//  267  715:goto            310
_L34:
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
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onCaptioningEnabledChanged(flag);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #178 <Method void IMediaControllerCallback.onCaptioningEnabledChanged(boolean)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_3        
		while(i >= 0) 
	//*   6   10:iload_3         
	//*   7   11:iflt            43
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore          4
			try
			{
				imediacontrollercallback.onEvent(s, bundle);
	//   14   27:aload           4
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokeinterface #186 <Method void IMediaControllerCallback.onEvent(String, Bundle)>
			}
	//*  18   36:iload_3         
	//*  19   37:iconst_1        
	//*  20   38:isub            
	//*  21   39:istore_3        
	//*  22   40:goto            10
	//*  23   43:aload_0         
	//*  24   44:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  25   47:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onExtrasChanged(bundle);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #191 <Method void IMediaControllerCallback.onExtrasChanged(Bundle)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onMetadataChanged(mediametadatacompat);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #196 <Method void IMediaControllerCallback.onMetadataChanged(MediaMetadataCompat)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onQueueChanged(list);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #201 <Method void IMediaControllerCallback.onQueueChanged(List)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onQueueTitleChanged(charsequence);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #208 <Method void IMediaControllerCallback.onQueueTitleChanged(CharSequence)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(j >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onRepeatModeChanged(i);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #213 <Method void IMediaControllerCallback.onRepeatModeChanged(int)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_1        
		while(i >= 0) 
	//*   6   10:iload_1         
	//*   7   11:iflt            39
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore_2        
			try
			{
				imediacontrollercallback.onSessionDestroyed();
	//   14   26:aload_2         
	//   15   27:invokeinterface #217 <Method void IMediaControllerCallback.onSessionDestroyed()>
			}
	//*  16   32:iload_1         
	//*  17   33:iconst_1        
	//*  18   34:isub            
	//*  19   35:istore_1        
	//*  20   36:goto            10
	//*  21   39:aload_0         
	//*  22   40:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  23   43:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
	//*  24   46:aload_0         
	//*  25   47:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  26   50:invokevirtual   #220 <Method void RemoteCallbackList.kill()>
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
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(j >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(j);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onShuffleModeChanged(i);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokeinterface #224 <Method void IMediaControllerCallback.onShuffleModeChanged(int)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
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
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onPlaybackStateChanged(playbackstatecompat);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #229 <Method void IMediaControllerCallback.onPlaybackStateChanged(PlaybackStateCompat)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
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
	//*   1    1:getfield        #144 <Field int mVolumeType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          23
		{
			VolumeProviderCompat volumeprovidercompat = mVolumeProvider;
	//    4    8:aload_0         
	//    5    9:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
	//    6   12:astore_3        
			if(volumeprovidercompat != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          36
			{
				volumeprovidercompat.onAdjustVolume(i);
	//    9   17:aload_3         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #238 <Method void VolumeProviderCompat.onAdjustVolume(int)>
				return;
	//   12   22:return          
			}
		} else
		{
			mAudioManager.adjustStreamVolume(mLocalStream, i, j);
	//   13   23:aload_0         
	//   14   24:getfield        #124 <Field AudioManager mAudioManager>
	//   15   27:aload_0         
	//   16   28:getfield        #146 <Field int mLocalStream>
	//   17   31:iload_1         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #242 <Method void AudioManager.adjustStreamVolume(int, int, int)>
		}
	//   20   36:return          
	}

	android.media.RemoteControlClient.MetadataEditor buildRccMetadata(Bundle bundle)
	{
		android.media.RemoteControlClient.MetadataEditor metadataeditor = mRcc.editMetadata(true);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field RemoteControlClient mRcc>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #248 <Method android.media.RemoteControlClient$MetadataEditor RemoteControlClient.editMetadata(boolean)>
	//    4    8:astore          4
		if(bundle == null)
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       17
			return metadataeditor;
	//    7   14:aload           4
	//    8   16:areturn         
		if(bundle.containsKey("android.media.metadata.ART"))
	//*   9   17:aload_1         
	//*  10   18:ldc1            #250 <String "android.media.metadata.ART">
	//*  11   20:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//*  12   23:ifeq            64
		{
			Bitmap bitmap2 = (Bitmap)bundle.getParcelable("android.media.metadata.ART");
	//   13   26:aload_1         
	//   14   27:ldc1            #250 <String "android.media.metadata.ART">
	//   15   29:invokevirtual   #260 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   16   32:checkcast       #262 <Class Bitmap>
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
	//   24   44:invokevirtual   #266 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   25   47:iconst_0        
	//   26   48:invokevirtual   #270 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
	//   27   51:astore_2        
			metadataeditor.putBitmap(100, bitmap);
	//   28   52:aload           4
	//   29   54:bipush          100
	//   30   56:aload_2         
	//   31   57:invokevirtual   #276 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
	//   32   60:pop             
		} else
	//*  33   61:goto            110
		if(bundle.containsKey("android.media.metadata.ALBUM_ART"))
	//*  34   64:aload_1         
	//*  35   65:ldc2            #278 <String "android.media.metadata.ALBUM_ART">
	//*  36   68:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//*  37   71:ifeq            110
		{
			Bitmap bitmap3 = (Bitmap)bundle.getParcelable("android.media.metadata.ALBUM_ART");
	//   38   74:aload_1         
	//   39   75:ldc2            #278 <String "android.media.metadata.ALBUM_ART">
	//   40   78:invokevirtual   #260 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   41   81:checkcast       #262 <Class Bitmap>
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
	//   49   93:invokevirtual   #266 <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//   50   96:iconst_0        
	//   51   97:invokevirtual   #270 <Method Bitmap Bitmap.copy(android.graphics.Bitmap$Config, boolean)>
	//   52  100:astore_2        
			metadataeditor.putBitmap(100, bitmap1);
	//   53  101:aload           4
	//   54  103:bipush          100
	//   55  105:aload_2         
	//   56  106:invokevirtual   #276 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putBitmap(int, Bitmap)>
	//   57  109:pop             
		}
		if(bundle.containsKey("android.media.metadata.ALBUM"))
	//*  58  110:aload_1         
	//*  59  111:ldc2            #280 <String "android.media.metadata.ALBUM">
	//*  60  114:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//*  61  117:ifeq            134
			metadataeditor.putString(1, bundle.getString("android.media.metadata.ALBUM"));
	//   62  120:aload           4
	//   63  122:iconst_1        
	//   64  123:aload_1         
	//   65  124:ldc2            #280 <String "android.media.metadata.ALBUM">
	//   66  127:invokevirtual   #284 <Method String Bundle.getString(String)>
	//   67  130:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   68  133:pop             
		if(bundle.containsKey("android.media.metadata.ALBUM_ARTIST"))
	//*  69  134:aload_1         
	//*  70  135:ldc2            #290 <String "android.media.metadata.ALBUM_ARTIST">
	//*  71  138:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//*  72  141:ifeq            159
			metadataeditor.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
	//   73  144:aload           4
	//   74  146:bipush          13
	//   75  148:aload_1         
	//   76  149:ldc2            #290 <String "android.media.metadata.ALBUM_ARTIST">
	//   77  152:invokevirtual   #284 <Method String Bundle.getString(String)>
	//   78  155:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   79  158:pop             
		if(bundle.containsKey("android.media.metadata.ARTIST"))
	//*  80  159:aload_1         
	//*  81  160:ldc2            #292 <String "android.media.metadata.ARTIST">
	//*  82  163:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//*  83  166:ifeq            183
			metadataeditor.putString(2, bundle.getString("android.media.metadata.ARTIST"));
	//   84  169:aload           4
	//   85  171:iconst_2        
	//   86  172:aload_1         
	//   87  173:ldc2            #292 <String "android.media.metadata.ARTIST">
	//   88  176:invokevirtual   #284 <Method String Bundle.getString(String)>
	//   89  179:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//   90  182:pop             
		if(bundle.containsKey("android.media.metadata.AUTHOR"))
	//*  91  183:aload_1         
	//*  92  184:ldc2            #294 <String "android.media.metadata.AUTHOR">
	//*  93  187:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//*  94  190:ifeq            207
			metadataeditor.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
	//   95  193:aload           4
	//   96  195:iconst_3        
	//   97  196:aload_1         
	//   98  197:ldc2            #294 <String "android.media.metadata.AUTHOR">
	//   99  200:invokevirtual   #284 <Method String Bundle.getString(String)>
	//  100  203:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  101  206:pop             
		if(bundle.containsKey("android.media.metadata.COMPILATION"))
	//* 102  207:aload_1         
	//* 103  208:ldc2            #296 <String "android.media.metadata.COMPILATION">
	//* 104  211:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//* 105  214:ifeq            232
			metadataeditor.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
	//  106  217:aload           4
	//  107  219:bipush          15
	//  108  221:aload_1         
	//  109  222:ldc2            #296 <String "android.media.metadata.COMPILATION">
	//  110  225:invokevirtual   #284 <Method String Bundle.getString(String)>
	//  111  228:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  112  231:pop             
		if(bundle.containsKey("android.media.metadata.COMPOSER"))
	//* 113  232:aload_1         
	//* 114  233:ldc2            #298 <String "android.media.metadata.COMPOSER">
	//* 115  236:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//* 116  239:ifeq            256
			metadataeditor.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
	//  117  242:aload           4
	//  118  244:iconst_4        
	//  119  245:aload_1         
	//  120  246:ldc2            #298 <String "android.media.metadata.COMPOSER">
	//  121  249:invokevirtual   #284 <Method String Bundle.getString(String)>
	//  122  252:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  123  255:pop             
		if(bundle.containsKey("android.media.metadata.DATE"))
	//* 124  256:aload_1         
	//* 125  257:ldc2            #300 <String "android.media.metadata.DATE">
	//* 126  260:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//* 127  263:ifeq            280
			metadataeditor.putString(5, bundle.getString("android.media.metadata.DATE"));
	//  128  266:aload           4
	//  129  268:iconst_5        
	//  130  269:aload_1         
	//  131  270:ldc2            #300 <String "android.media.metadata.DATE">
	//  132  273:invokevirtual   #284 <Method String Bundle.getString(String)>
	//  133  276:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  134  279:pop             
		if(bundle.containsKey("android.media.metadata.DISC_NUMBER"))
	//* 135  280:aload_1         
	//* 136  281:ldc2            #302 <String "android.media.metadata.DISC_NUMBER">
	//* 137  284:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//* 138  287:ifeq            305
			metadataeditor.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
	//  139  290:aload           4
	//  140  292:bipush          14
	//  141  294:aload_1         
	//  142  295:ldc2            #302 <String "android.media.metadata.DISC_NUMBER">
	//  143  298:invokevirtual   #306 <Method long Bundle.getLong(String)>
	//  144  301:invokevirtual   #310 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//  145  304:pop             
		if(bundle.containsKey("android.media.metadata.DURATION"))
	//* 146  305:aload_1         
	//* 147  306:ldc2            #312 <String "android.media.metadata.DURATION">
	//* 148  309:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//* 149  312:ifeq            330
			metadataeditor.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
	//  150  315:aload           4
	//  151  317:bipush          9
	//  152  319:aload_1         
	//  153  320:ldc2            #312 <String "android.media.metadata.DURATION">
	//  154  323:invokevirtual   #306 <Method long Bundle.getLong(String)>
	//  155  326:invokevirtual   #310 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//  156  329:pop             
		if(bundle.containsKey("android.media.metadata.GENRE"))
	//* 157  330:aload_1         
	//* 158  331:ldc2            #314 <String "android.media.metadata.GENRE">
	//* 159  334:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//* 160  337:ifeq            355
			metadataeditor.putString(6, bundle.getString("android.media.metadata.GENRE"));
	//  161  340:aload           4
	//  162  342:bipush          6
	//  163  344:aload_1         
	//  164  345:ldc2            #314 <String "android.media.metadata.GENRE">
	//  165  348:invokevirtual   #284 <Method String Bundle.getString(String)>
	//  166  351:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  167  354:pop             
		if(bundle.containsKey("android.media.metadata.TITLE"))
	//* 168  355:aload_1         
	//* 169  356:ldc2            #316 <String "android.media.metadata.TITLE">
	//* 170  359:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//* 171  362:ifeq            380
			metadataeditor.putString(7, bundle.getString("android.media.metadata.TITLE"));
	//  172  365:aload           4
	//  173  367:bipush          7
	//  174  369:aload_1         
	//  175  370:ldc2            #316 <String "android.media.metadata.TITLE">
	//  176  373:invokevirtual   #284 <Method String Bundle.getString(String)>
	//  177  376:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
	//  178  379:pop             
		if(bundle.containsKey("android.media.metadata.TRACK_NUMBER"))
	//* 179  380:aload_1         
	//* 180  381:ldc2            #318 <String "android.media.metadata.TRACK_NUMBER">
	//* 181  384:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//* 182  387:ifeq            404
			metadataeditor.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
	//  183  390:aload           4
	//  184  392:iconst_0        
	//  185  393:aload_1         
	//  186  394:ldc2            #318 <String "android.media.metadata.TRACK_NUMBER">
	//  187  397:invokevirtual   #306 <Method long Bundle.getLong(String)>
	//  188  400:invokevirtual   #310 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putLong(int, long)>
	//  189  403:pop             
		if(bundle.containsKey("android.media.metadata.WRITER"))
	//* 190  404:aload_1         
	//* 191  405:ldc2            #320 <String "android.media.metadata.WRITER">
	//* 192  408:invokevirtual   #256 <Method boolean Bundle.containsKey(String)>
	//* 193  411:ifeq            429
			metadataeditor.putString(11, bundle.getString("android.media.metadata.WRITER"));
	//  194  414:aload           4
	//  195  416:bipush          11
	//  196  418:aload_1         
	//  197  419:ldc2            #320 <String "android.media.metadata.WRITER">
	//  198  422:invokevirtual   #284 <Method String Bundle.getString(String)>
	//  199  425:invokevirtual   #288 <Method android.media.RemoteControlClient$MetadataEditor android.media.RemoteControlClient$MetadataEditor.putString(int, String)>
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

	public android.support.v4.media.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo()
	{
		android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			remoteuserinfo = mRemoteUserInfo;
	//    5    7:aload_0         
	//    6    8:getfield        #325 <Field android.support.v4.media.MediaSessionManager$RemoteUserInfo mRemoteUserInfo>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return remoteuserinfo;
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
	//*   1    1:getfield        #86  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			playbackstatecompat = mState;
	//    5    7:aload_0         
	//    6    8:getfield        #331 <Field PlaybackStateCompat mState>
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
		if((1L & l) != 0L)
	//*   0    0:lconst_1        
	//*   1    1:lload_1         
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
		if((2L & l) != 0L)
	//*  13   21:ldc2w           #336 <Long 2L>
	//*  14   24:lload_1         
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
		if((4L & l) != 0L)
	//*  25   40:ldc2w           #338 <Long 4L>
	//*  26   43:lload_1         
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
		if((8L & l) != 0L)
	//*  37   58:ldc2w           #340 <Long 8L>
	//*  38   61:lload_1         
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
		if((16L & l) != 0L)
	//*  49   76:ldc2w           #342 <Long 16L>
	//*  50   79:lload_1         
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
		if((32L & l) != 0L)
	//*  61   94:ldc2w           #344 <Long 32L>
	//*  62   97:lload_1         
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
		if((64L & l) != 0L)
	//*  73  114:ldc2w           #346 <Long 64L>
	//*  74  117:lload_1         
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
	//*  86  134:ldc2w           #348 <Long 512L>
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
	//    1    1:getfield        #140 <Field MediaSessionCompat$Token mToken>
	//    2    4:areturn         
	}

	public boolean isActive()
	{
		return mIsActive;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field boolean mIsActive>
	//    2    4:ireturn         
	}

	void postToHandler(int i, int j, int k, Object obj, Bundle bundle)
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field Object mLock>
	//    2    4:astore          6
		obj1;
	//    3    6:aload           6
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Bundle bundle1;
		if(mHandler == null)
			break MISSING_BLOCK_LABEL_99;
	//    5    9:aload_0         
	//    6   10:getfield        #358 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//    7   13:ifnull          99
		obj = ((Object) (mHandler.obtainMessage(i, j, k, obj)));
	//    8   16:aload_0         
	//    9   17:getfield        #358 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//   10   20:iload_1         
	//   11   21:iload_2         
	//   12   22:iload_3         
	//   13   23:aload           4
	//   14   25:invokevirtual   #362 <Method Message MediaSessionCompat$MediaSessionImplBase$MessageHandler.obtainMessage(int, int, int, Object)>
	//   15   28:astore          4
		bundle1 = new Bundle();
	//   16   30:new             #252 <Class Bundle>
	//   17   33:dup             
	//   18   34:invokespecial   #363 <Method void Bundle()>
	//   19   37:astore          7
		bundle1.putString("data_calling_pkg", "android.media.session.MediaController");
	//   20   39:aload           7
	//   21   41:ldc2            #365 <String "data_calling_pkg">
	//   22   44:ldc2            #367 <String "android.media.session.MediaController">
	//   23   47:invokevirtual   #370 <Method void Bundle.putString(String, String)>
		bundle1.putInt("data_calling_pid", Binder.getCallingPid());
	//   24   50:aload           7
	//   25   52:ldc2            #372 <String "data_calling_pid">
	//   26   55:invokestatic    #377 <Method int Binder.getCallingPid()>
	//   27   58:invokevirtual   #381 <Method void Bundle.putInt(String, int)>
		bundle1.putInt("data_calling_uid", Binder.getCallingUid());
	//   28   61:aload           7
	//   29   63:ldc2            #383 <String "data_calling_uid">
	//   30   66:invokestatic    #386 <Method int Binder.getCallingUid()>
	//   31   69:invokevirtual   #381 <Method void Bundle.putInt(String, int)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_87;
	//   32   72:aload           5
	//   33   74:ifnull          87
		bundle1.putBundle("data_extras", bundle);
	//   34   77:aload           7
	//   35   79:ldc2            #388 <String "data_extras">
	//   36   82:aload           5
	//   37   84:invokevirtual   #391 <Method void Bundle.putBundle(String, Bundle)>
		((Message) (obj)).setData(bundle1);
	//   38   87:aload           4
	//   39   89:aload           7
	//   40   91:invokevirtual   #396 <Method void Message.setData(Bundle)>
		((Message) (obj)).sendToTarget();
	//   41   94:aload           4
	//   42   96:invokevirtual   #399 <Method void Message.sendToTarget()>
		obj1;
	//   43   99:aload           6
		JVM INSTR monitorexit ;
	//   44  101:monitorexit     
		return;
	//   45  102:return          
		obj;
	//   46  103:astore          4
		obj1;
	//   47  105:aload           6
		JVM INSTR monitorexit ;
	//   48  107:monitorexit     
		throw obj;
	//   49  108:aload           4
	//   50  110:athrow          
	}

	void registerMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
	{
		mAudioManager.registerMediaButtonEventReceiver(componentname);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field AudioManager mAudioManager>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #404 <Method void AudioManager.registerMediaButtonEventReceiver(ComponentName)>
	//    4    8:return          
	}

	public void release()
	{
		mIsActive = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #95  <Field boolean mIsActive>
		mDestroyed = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #93  <Field boolean mDestroyed>
		update();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #408 <Method boolean update()>
	//    8   14:pop             
		sendSessionDestroyed();
	//    9   15:aload_0         
	//   10   16:invokespecial   #410 <Method void sendSessionDestroyed()>
	//   11   19:return          
	}

	public void sendSessionEvent(String s, Bundle bundle)
	{
		sendEvent(s, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #413 <Method void sendEvent(String, Bundle)>
	//    4    6:return          
	}

	void sendVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
	{
		int i = mControllerCallbacks.beginBroadcast() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//    2    4:invokevirtual   #169 <Method int RemoteCallbackList.beginBroadcast()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		while(i >= 0) 
	//*   6   10:iload_2         
	//*   7   11:iflt            40
		{
			IMediaControllerCallback imediacontrollercallback = (IMediaControllerCallback)mControllerCallbacks.getBroadcastItem(i);
	//    8   14:aload_0         
	//    9   15:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #173 <Method android.os.IInterface RemoteCallbackList.getBroadcastItem(int)>
	//   12   22:checkcast       #175 <Class IMediaControllerCallback>
	//   13   25:astore_3        
			try
			{
				imediacontrollercallback.onVolumeInfoChanged(parcelablevolumeinfo);
	//   14   26:aload_3         
	//   15   27:aload_1         
	//   16   28:invokeinterface #418 <Method void IMediaControllerCallback.onVolumeInfoChanged(ParcelableVolumeInfo)>
			}
	//*  17   33:iload_2         
	//*  18   34:iconst_1        
	//*  19   35:isub            
	//*  20   36:istore_2        
	//*  21   37:goto            10
	//*  22   40:aload_0         
	//*  23   41:getfield        #91  <Field RemoteCallbackList mControllerCallbacks>
	//*  24   44:invokevirtual   #181 <Method void RemoteCallbackList.finishBroadcast()>
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
	//*   2    2:getfield        #95  <Field boolean mIsActive>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mIsActive = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #95  <Field boolean mIsActive>
		if(update())
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #408 <Method boolean update()>
	//*  10   18:ifeq            37
		{
			setMetadata(mMetadata);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #421 <Field MediaMetadataCompat mMetadata>
	//   14   26:invokevirtual   #424 <Method void setMetadata(MediaMetadataCompat)>
			setPlaybackState(mState);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #331 <Field PlaybackStateCompat mState>
	//   18   34:invokevirtual   #427 <Method void setPlaybackState(PlaybackStateCompat)>
		}
	//   19   37:return          
	}

	public void setCallback(MediaSessionCompat.Callback callback, Handler handler)
	{
		mCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #431 <Field MediaSessionCompat$Callback mCallback>
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
	//    9   15:new             #433 <Class Handler>
	//   10   18:dup             
	//   11   19:invokespecial   #434 <Method void Handler()>
	//   12   22:astore_1        
			synchronized(mLock)
	//*  13   23:aload_0         
	//*  14   24:getfield        #86  <Field Object mLock>
	//*  15   27:astore_2        
	//*  16   28:aload_2         
	//*  17   29:monitorenter    
			{
				if(mHandler != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #358 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//*  20   34:ifnull          45
					mHandler.removeCallbacksAndMessages(((Object) (null)));
	//   21   37:aload_0         
	//   22   38:getfield        #358 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
	//   23   41:aconst_null     
	//   24   42:invokevirtual   #437 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler.removeCallbacksAndMessages(Object)>
				mHandler = new MessageHandler(((Handler) (callback)).getLooper());
	//   25   45:aload_0         
	//   26   46:new             #19  <Class MediaSessionCompat$MediaSessionImplBase$MessageHandler>
	//   27   49:dup             
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #441 <Method Looper Handler.getLooper()>
	//   31   55:invokespecial   #444 <Method void MediaSessionCompat$MediaSessionImplBase$MessageHandler(MediaSessionCompat$MediaSessionImplBase, Looper)>
	//   32   58:putfield        #358 <Field MediaSessionCompat$MediaSessionImplBase$MessageHandler mHandler>
				mCallback.setSessionImpl(((MediaSessionCompat.MediaSessionImpl) (this)), ((Handler) (callback)));
	//   33   61:aload_0         
	//   34   62:getfield        #431 <Field MediaSessionCompat$Callback mCallback>
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:invokevirtual   #450 <Method void MediaSessionCompat$Callback.setSessionImpl(MediaSessionCompat$MediaSessionImpl, Handler)>
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
	//*   1    1:getfield        #453 <Field boolean mCaptioningEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mCaptioningEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #453 <Field boolean mCaptioningEnabled>
			sendCaptioningEnabled(flag);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #455 <Method void sendCaptioningEnabled(boolean)>
		}
	//   10   18:return          
	}

	public void setCurrentControllerInfo(android.support.v4.media.MediaSessionManager.RemoteUserInfo remoteuserinfo)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mRemoteUserInfo = remoteuserinfo;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #325 <Field android.support.v4.media.MediaSessionManager$RemoteUserInfo mRemoteUserInfo>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		remoteuserinfo;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw remoteuserinfo;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public void setExtras(Bundle bundle)
	{
		mExtras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #460 <Field Bundle mExtras>
		sendExtras(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #462 <Method void sendExtras(Bundle)>
	//    6   10:return          
	}

	public void setFlags(int i)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mFlags = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #465 <Field int mFlags>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		update();
	//   10   14:aload_0         
	//   11   15:invokevirtual   #408 <Method boolean update()>
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
	//    4    6:new             #468 <Class android.support.v4.media.MediaMetadataCompat$Builder>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:getstatic       #471 <Field int MediaSessionCompat.sMaxBitmapSize>
	//    8   14:invokespecial   #474 <Method void android.support.v4.media.MediaMetadataCompat$Builder(MediaMetadataCompat, int)>
	//    9   17:invokevirtual   #478 <Method MediaMetadataCompat android.support.v4.media.MediaMetadataCompat$Builder.build()>
	//   10   20:astore_2        
		synchronized(mLock)
	//*  11   21:aload_0         
	//*  12   22:getfield        #86  <Field Object mLock>
	//*  13   25:astore_1        
	//*  14   26:aload_1         
	//*  15   27:monitorenter    
		{
			mMetadata = mediametadatacompat1;
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:putfield        #421 <Field MediaMetadataCompat mMetadata>
		}
	//   19   33:aload_1         
	//   20   34:monitorexit     
		sendMetadata(mediametadatacompat1);
	//   21   35:aload_0         
	//   22   36:aload_2         
	//   23   37:invokespecial   #480 <Method void sendMetadata(MediaMetadataCompat)>
		if(!mIsActive)
	//*  24   40:aload_0         
	//*  25   41:getfield        #95  <Field boolean mIsActive>
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
	//   34   58:invokevirtual   #486 <Method Bundle MediaMetadataCompat.getBundle()>
	//   35   61:astore_1        
		buildRccMetadata(((Bundle) (mediametadatacompat))).apply();
	//   36   62:aload_0         
	//   37   63:aload_1         
	//   38   64:invokevirtual   #488 <Method android.media.RemoteControlClient$MetadataEditor buildRccMetadata(Bundle)>
	//   39   67:invokevirtual   #491 <Method void android.media.RemoteControlClient$MetadataEditor.apply()>
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
	//*   1    1:getfield        #86  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mState = playbackstatecompat;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #331 <Field PlaybackStateCompat mState>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		sendState(playbackstatecompat);
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokespecial   #493 <Method void sendState(PlaybackStateCompat)>
		if(!mIsActive)
	//*  13   19:aload_0         
	//*  14   20:getfield        #95  <Field boolean mIsActive>
	//*  15   23:ifne            27
			return;
	//   16   26:return          
		if(playbackstatecompat == null)
	//*  17   27:aload_1         
	//*  18   28:ifnonnull       48
		{
			mRcc.setPlaybackState(0);
	//   19   31:aload_0         
	//   20   32:getfield        #153 <Field RemoteControlClient mRcc>
	//   21   35:iconst_0        
	//   22   36:invokevirtual   #495 <Method void RemoteControlClient.setPlaybackState(int)>
			mRcc.setTransportControlFlags(0);
	//   23   39:aload_0         
	//   24   40:getfield        #153 <Field RemoteControlClient mRcc>
	//   25   43:iconst_0        
	//   26   44:invokevirtual   #498 <Method void RemoteControlClient.setTransportControlFlags(int)>
			return;
	//   27   47:return          
		} else
		{
			setRccState(playbackstatecompat);
	//   28   48:aload_0         
	//   29   49:aload_1         
	//   30   50:invokevirtual   #501 <Method void setRccState(PlaybackStateCompat)>
			mRcc.setTransportControlFlags(getRccTransportControlFlagsFromActions(playbackstatecompat.getActions()));
	//   31   53:aload_0         
	//   32   54:getfield        #153 <Field RemoteControlClient mRcc>
	//   33   57:aload_0         
	//   34   58:aload_1         
	//   35   59:invokevirtual   #507 <Method long PlaybackStateCompat.getActions()>
	//   36   62:invokevirtual   #509 <Method int getRccTransportControlFlagsFromActions(long)>
	//   37   65:invokevirtual   #498 <Method void RemoteControlClient.setTransportControlFlags(int)>
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
		VolumeProviderCompat volumeprovidercompat = mVolumeProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
	//    2    4:astore_3        
		if(volumeprovidercompat != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          14
			volumeprovidercompat.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
	//    5    9:aload_3         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #513 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
		mLocalStream = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #146 <Field int mLocalStream>
		mVolumeType = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #144 <Field int mVolumeType>
		i = mVolumeType;
	//   14   24:aload_0         
	//   15   25:getfield        #144 <Field int mVolumeType>
	//   16   28:istore_1        
		int j = mLocalStream;
	//   17   29:aload_0         
	//   18   30:getfield        #146 <Field int mLocalStream>
	//   19   33:istore_2        
		sendVolumeInfoChanged(new ParcelableVolumeInfo(i, j, 2, mAudioManager.getStreamMaxVolume(j), mAudioManager.getStreamVolume(mLocalStream)));
	//   20   34:aload_0         
	//   21   35:new             #515 <Class ParcelableVolumeInfo>
	//   22   38:dup             
	//   23   39:iload_1         
	//   24   40:iload_2         
	//   25   41:iconst_2        
	//   26   42:aload_0         
	//   27   43:getfield        #124 <Field AudioManager mAudioManager>
	//   28   46:iload_2         
	//   29   47:invokevirtual   #518 <Method int AudioManager.getStreamMaxVolume(int)>
	//   30   50:aload_0         
	//   31   51:getfield        #124 <Field AudioManager mAudioManager>
	//   32   54:aload_0         
	//   33   55:getfield        #146 <Field int mLocalStream>
	//   34   58:invokevirtual   #521 <Method int AudioManager.getStreamVolume(int)>
	//   35   61:invokespecial   #524 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
	//   36   64:invokevirtual   #526 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
	//   37   67:return          
	}

	public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
	{
		if(volumeprovidercompat != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          77
		{
			VolumeProviderCompat volumeprovidercompat1 = mVolumeProvider;
	//    2    4:aload_0         
	//    3    5:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
	//    4    8:astore_2        
			if(volumeprovidercompat1 != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          18
				volumeprovidercompat1.setCallback(((android.support.v4.media.VolumeProviderCompat.Callback) (null)));
	//    7   13:aload_2         
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #513 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
			mVolumeType = 2;
	//   10   18:aload_0         
	//   11   19:iconst_2        
	//   12   20:putfield        #144 <Field int mVolumeType>
			mVolumeProvider = volumeprovidercompat;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:putfield        #233 <Field VolumeProviderCompat mVolumeProvider>
			sendVolumeInfoChanged(new ParcelableVolumeInfo(mVolumeType, mLocalStream, mVolumeProvider.getVolumeControl(), mVolumeProvider.getMaxVolume(), mVolumeProvider.getCurrentVolume()));
	//   16   28:aload_0         
	//   17   29:new             #515 <Class ParcelableVolumeInfo>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:getfield        #144 <Field int mVolumeType>
	//   21   37:aload_0         
	//   22   38:getfield        #146 <Field int mLocalStream>
	//   23   41:aload_0         
	//   24   42:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
	//   25   45:invokevirtual   #531 <Method int VolumeProviderCompat.getVolumeControl()>
	//   26   48:aload_0         
	//   27   49:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
	//   28   52:invokevirtual   #534 <Method int VolumeProviderCompat.getMaxVolume()>
	//   29   55:aload_0         
	//   30   56:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
	//   31   59:invokevirtual   #537 <Method int VolumeProviderCompat.getCurrentVolume()>
	//   32   62:invokespecial   #524 <Method void ParcelableVolumeInfo(int, int, int, int, int)>
	//   33   65:invokevirtual   #526 <Method void sendVolumeInfoChanged(ParcelableVolumeInfo)>
			volumeprovidercompat.setCallback(mVolumeCallback);
	//   34   68:aload_1         
	//   35   69:aload_0         
	//   36   70:getfield        #104 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
	//   37   73:invokevirtual   #513 <Method void VolumeProviderCompat.setCallback(android.support.v4.media.VolumeProviderCompat$Callback)>
			return;
	//   38   76:return          
		} else
		{
			throw new IllegalArgumentException("volumeProvider may not be null");
	//   39   77:new             #155 <Class IllegalArgumentException>
	//   40   80:dup             
	//   41   81:ldc2            #539 <String "volumeProvider may not be null">
	//   42   84:invokespecial   #160 <Method void IllegalArgumentException(String)>
	//   43   87:athrow          
		}
	}

	public void setQueue(List list)
	{
		mQueue = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #542 <Field List mQueue>
		sendQueue(list);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #544 <Method void sendQueue(List)>
	//    6   10:return          
	}

	public void setQueueTitle(CharSequence charsequence)
	{
		mQueueTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #547 <Field CharSequence mQueueTitle>
		sendQueueTitle(charsequence);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #549 <Method void sendQueueTitle(CharSequence)>
	//    6   10:return          
	}

	public void setRatingType(int i)
	{
		mRatingType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #142 <Field int mRatingType>
	//    3    5:return          
	}

	void setRccState(PlaybackStateCompat playbackstatecompat)
	{
		mRcc.setPlaybackState(getRccStateFromState(playbackstatecompat.getState()));
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field RemoteControlClient mRcc>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #553 <Method int PlaybackStateCompat.getState()>
	//    5    9:invokevirtual   #555 <Method int getRccStateFromState(int)>
	//    6   12:invokevirtual   #495 <Method void RemoteControlClient.setPlaybackState(int)>
	//    7   15:return          
	}

	public void setRepeatMode(int i)
	{
		if(mRepeatMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #558 <Field int mRepeatMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mRepeatMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #558 <Field int mRepeatMode>
			sendRepeatMode(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #560 <Method void sendRepeatMode(int)>
		}
	//   10   18:return          
	}

	public void setSessionActivity(PendingIntent pendingintent)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mSessionActivity = pendingintent;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #563 <Field PendingIntent mSessionActivity>
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
	//*   1    1:getfield        #566 <Field int mShuffleMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          18
		{
			mShuffleMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #566 <Field int mShuffleMode>
			sendShuffleMode(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #568 <Method void sendShuffleMode(int)>
		}
	//   10   18:return          
	}

	void setVolumeTo(int i, int j)
	{
		if(mVolumeType == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field int mVolumeType>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          23
		{
			VolumeProviderCompat volumeprovidercompat = mVolumeProvider;
	//    4    8:aload_0         
	//    5    9:getfield        #233 <Field VolumeProviderCompat mVolumeProvider>
	//    6   12:astore_3        
			if(volumeprovidercompat != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          36
			{
				volumeprovidercompat.onSetVolumeTo(i);
	//    9   17:aload_3         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #572 <Method void VolumeProviderCompat.onSetVolumeTo(int)>
				return;
	//   12   22:return          
			}
		} else
		{
			mAudioManager.setStreamVolume(mLocalStream, i, j);
	//   13   23:aload_0         
	//   14   24:getfield        #124 <Field AudioManager mAudioManager>
	//   15   27:aload_0         
	//   16   28:getfield        #146 <Field int mLocalStream>
	//   17   31:iload_1         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #575 <Method void AudioManager.setStreamVolume(int, int, int)>
		}
	//   20   36:return          
	}

	void unregisterMediaButtonEventReceiver(PendingIntent pendingintent, ComponentName componentname)
	{
		mAudioManager.unregisterMediaButtonEventReceiver(componentname);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field AudioManager mAudioManager>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #578 <Method void AudioManager.unregisterMediaButtonEventReceiver(ComponentName)>
	//    4    8:return          
	}

	boolean update()
	{
		if(mIsActive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field boolean mIsActive>
	//*   2    4:ifeq            153
		{
			if(!mIsMbrRegistered && (mFlags & 1) != 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #97  <Field boolean mIsMbrRegistered>
	//*   5   11:ifne            43
	//*   6   14:aload_0         
	//*   7   15:getfield        #465 <Field int mFlags>
	//*   8   18:iconst_1        
	//*   9   19:iand            
	//*  10   20:ifeq            43
			{
				registerMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #130 <Field PendingIntent mMediaButtonReceiverIntent>
	//   14   28:aload_0         
	//   15   29:getfield        #128 <Field ComponentName mMediaButtonReceiverComponentName>
	//   16   32:invokevirtual   #580 <Method void registerMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = true;
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:putfield        #97  <Field boolean mIsMbrRegistered>
			} else
	//*  20   40:goto            76
			if(mIsMbrRegistered && (mFlags & 1) == 0)
	//*  21   43:aload_0         
	//*  22   44:getfield        #97  <Field boolean mIsMbrRegistered>
	//*  23   47:ifeq            76
	//*  24   50:aload_0         
	//*  25   51:getfield        #465 <Field int mFlags>
	//*  26   54:iconst_1        
	//*  27   55:iand            
	//*  28   56:ifne            76
			{
				unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #130 <Field PendingIntent mMediaButtonReceiverIntent>
	//   32   64:aload_0         
	//   33   65:getfield        #128 <Field ComponentName mMediaButtonReceiverComponentName>
	//   34   68:invokevirtual   #582 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = false;
	//   35   71:aload_0         
	//   36   72:iconst_0        
	//   37   73:putfield        #97  <Field boolean mIsMbrRegistered>
			}
			if(!mIsRccRegistered && (mFlags & 2) != 0)
	//*  38   76:aload_0         
	//*  39   77:getfield        #99  <Field boolean mIsRccRegistered>
	//*  40   80:ifne            110
	//*  41   83:aload_0         
	//*  42   84:getfield        #465 <Field int mFlags>
	//*  43   87:iconst_2        
	//*  44   88:iand            
	//*  45   89:ifeq            110
			{
				mAudioManager.registerRemoteControlClient(mRcc);
	//   46   92:aload_0         
	//   47   93:getfield        #124 <Field AudioManager mAudioManager>
	//   48   96:aload_0         
	//   49   97:getfield        #153 <Field RemoteControlClient mRcc>
	//   50  100:invokevirtual   #586 <Method void AudioManager.registerRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = true;
	//   51  103:aload_0         
	//   52  104:iconst_1        
	//   53  105:putfield        #99  <Field boolean mIsRccRegistered>
				return true;
	//   54  108:iconst_1        
	//   55  109:ireturn         
			}
			if(mIsRccRegistered && (mFlags & 2) == 0)
	//*  56  110:aload_0         
	//*  57  111:getfield        #99  <Field boolean mIsRccRegistered>
	//*  58  114:ifeq            208
	//*  59  117:aload_0         
	//*  60  118:getfield        #465 <Field int mFlags>
	//*  61  121:iconst_2        
	//*  62  122:iand            
	//*  63  123:ifne            208
			{
				mRcc.setPlaybackState(0);
	//   64  126:aload_0         
	//   65  127:getfield        #153 <Field RemoteControlClient mRcc>
	//   66  130:iconst_0        
	//   67  131:invokevirtual   #495 <Method void RemoteControlClient.setPlaybackState(int)>
				mAudioManager.unregisterRemoteControlClient(mRcc);
	//   68  134:aload_0         
	//   69  135:getfield        #124 <Field AudioManager mAudioManager>
	//   70  138:aload_0         
	//   71  139:getfield        #153 <Field RemoteControlClient mRcc>
	//   72  142:invokevirtual   #589 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = false;
	//   73  145:aload_0         
	//   74  146:iconst_0        
	//   75  147:putfield        #99  <Field boolean mIsRccRegistered>
			}
		} else
	//*  76  150:goto            208
		{
			if(mIsMbrRegistered)
	//*  77  153:aload_0         
	//*  78  154:getfield        #97  <Field boolean mIsMbrRegistered>
	//*  79  157:ifeq            177
			{
				unregisterMediaButtonEventReceiver(mMediaButtonReceiverIntent, mMediaButtonReceiverComponentName);
	//   80  160:aload_0         
	//   81  161:aload_0         
	//   82  162:getfield        #130 <Field PendingIntent mMediaButtonReceiverIntent>
	//   83  165:aload_0         
	//   84  166:getfield        #128 <Field ComponentName mMediaButtonReceiverComponentName>
	//   85  169:invokevirtual   #582 <Method void unregisterMediaButtonEventReceiver(PendingIntent, ComponentName)>
				mIsMbrRegistered = false;
	//   86  172:aload_0         
	//   87  173:iconst_0        
	//   88  174:putfield        #97  <Field boolean mIsMbrRegistered>
			}
			if(mIsRccRegistered)
	//*  89  177:aload_0         
	//*  90  178:getfield        #99  <Field boolean mIsRccRegistered>
	//*  91  181:ifeq            208
			{
				mRcc.setPlaybackState(0);
	//   92  184:aload_0         
	//   93  185:getfield        #153 <Field RemoteControlClient mRcc>
	//   94  188:iconst_0        
	//   95  189:invokevirtual   #495 <Method void RemoteControlClient.setPlaybackState(int)>
				mAudioManager.unregisterRemoteControlClient(mRcc);
	//   96  192:aload_0         
	//   97  193:getfield        #124 <Field AudioManager mAudioManager>
	//   98  196:aload_0         
	//   99  197:getfield        #153 <Field RemoteControlClient mRcc>
	//  100  200:invokevirtual   #589 <Method void AudioManager.unregisterRemoteControlClient(RemoteControlClient)>
				mIsRccRegistered = false;
	//  101  203:aload_0         
	//  102  204:iconst_0        
	//  103  205:putfield        #99  <Field boolean mIsRccRegistered>
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
	private android.support.v4.media.MediaSessionManager.RemoteUserInfo mRemoteUserInfo;
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
	//    1    1:invokespecial   #84  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #84  <Method void Object()>
	//    6   12:putfield        #86  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #88  <Class RemoteCallbackList>
	//    9   19:dup             
	//   10   20:invokespecial   #89  <Method void RemoteCallbackList()>
	//   11   23:putfield        #91  <Field RemoteCallbackList mControllerCallbacks>
		mDestroyed = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #93  <Field boolean mDestroyed>
		mIsActive = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #95  <Field boolean mIsActive>
		mIsMbrRegistered = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #97  <Field boolean mIsMbrRegistered>
		mIsRccRegistered = false;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #99  <Field boolean mIsRccRegistered>
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
	//   28   52:invokespecial   #102 <Method void MediaSessionCompat$MediaSessionImplBase$1(MediaSessionCompat$MediaSessionImplBase)>
	//   29   55:putfield        #104 <Field android.support.v4.media.VolumeProviderCompat$Callback mVolumeCallback>
		if(componentname != null)
	//*  30   58:aload_3         
	//*  31   59:ifnull          160
		{
			mContext = context;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:putfield        #106 <Field Context mContext>
			mPackageName = context.getPackageName();
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:invokevirtual   #112 <Method String Context.getPackageName()>
	//   38   72:putfield        #114 <Field String mPackageName>
			mAudioManager = (AudioManager)context.getSystemService("audio");
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:ldc1            #116 <String "audio">
	//   42   79:invokevirtual   #120 <Method Object Context.getSystemService(String)>
	//   43   82:checkcast       #122 <Class AudioManager>
	//   44   85:putfield        #124 <Field AudioManager mAudioManager>
			mTag = s;
	//   45   88:aload_0         
	//   46   89:aload_2         
	//   47   90:putfield        #126 <Field String mTag>
			mMediaButtonReceiverComponentName = componentname;
	//   48   93:aload_0         
	//   49   94:aload_3         
	//   50   95:putfield        #128 <Field ComponentName mMediaButtonReceiverComponentName>
			mMediaButtonReceiverIntent = pendingintent;
	//   51   98:aload_0         
	//   52   99:aload           4
	//   53  101:putfield        #130 <Field PendingIntent mMediaButtonReceiverIntent>
			mStub = new MediaSessionStub();
	//   54  104:aload_0         
	//   55  105:new             #16  <Class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub>
	//   56  108:dup             
	//   57  109:aload_0         
	//   58  110:invokespecial   #131 <Method void MediaSessionCompat$MediaSessionImplBase$MediaSessionStub(MediaSessionCompat$MediaSessionImplBase)>
	//   59  113:putfield        #133 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
			mToken = new MediaSessionCompat.Token(((Object) (mStub)));
	//   60  116:aload_0         
	//   61  117:new             #135 <Class MediaSessionCompat$Token>
	//   62  120:dup             
	//   63  121:aload_0         
	//   64  122:getfield        #133 <Field MediaSessionCompat$MediaSessionImplBase$MediaSessionStub mStub>
	//   65  125:invokespecial   #138 <Method void MediaSessionCompat$Token(Object)>
	//   66  128:putfield        #140 <Field MediaSessionCompat$Token mToken>
			mRatingType = 0;
	//   67  131:aload_0         
	//   68  132:iconst_0        
	//   69  133:putfield        #142 <Field int mRatingType>
			mVolumeType = 1;
	//   70  136:aload_0         
	//   71  137:iconst_1        
	//   72  138:putfield        #144 <Field int mVolumeType>
			mLocalStream = 3;
	//   73  141:aload_0         
	//   74  142:iconst_3        
	//   75  143:putfield        #146 <Field int mLocalStream>
			mRcc = new RemoteControlClient(pendingintent);
	//   76  146:aload_0         
	//   77  147:new             #148 <Class RemoteControlClient>
	//   78  150:dup             
	//   79  151:aload           4
	//   80  153:invokespecial   #151 <Method void RemoteControlClient(PendingIntent)>
	//   81  156:putfield        #153 <Field RemoteControlClient mRcc>
			return;
	//   82  159:return          
		} else
		{
			throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
	//   83  160:new             #155 <Class IllegalArgumentException>
	//   84  163:dup             
	//   85  164:ldc1            #157 <String "MediaButtonReceiver component may not be null.">
	//   86  166:invokespecial   #160 <Method void IllegalArgumentException(String)>
	//   87  169:athrow          
		}
	}
}
