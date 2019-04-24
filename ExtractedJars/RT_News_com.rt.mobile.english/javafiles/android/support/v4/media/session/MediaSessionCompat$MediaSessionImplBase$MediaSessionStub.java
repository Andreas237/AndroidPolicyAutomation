// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.*;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat, ParcelableVolumeInfo, IMediaControllerCallback, PlaybackStateCompat

class MediaSessionCompat$MediaSessionImplBase$MediaSessionStub extends IMediaSession.Stub
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
		postToHandler(1, ((Object) (new MediaSessionCompat.MediaSessionImplBase.Command(s, bundle, MediaSessionCompat.ResultReceiverWrapper.access$400(resultreceiverwrapper)))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//    2    4:iconst_1        
	//    3    5:new             #226 <Class MediaSessionCompat$MediaSessionImplBase$Command>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #232 <Method android.os.ResultReceiver MediaSessionCompat$ResultReceiverWrapper.access$400(MediaSessionCompat$ResultReceiverWrapper)>
	//    9   15:invokespecial   #235 <Method void MediaSessionCompat$MediaSessionImplBase$Command(String, Bundle, android.os.ResultReceiver)>
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

	MediaSessionCompat$MediaSessionImplBase$MediaSessionStub()
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
