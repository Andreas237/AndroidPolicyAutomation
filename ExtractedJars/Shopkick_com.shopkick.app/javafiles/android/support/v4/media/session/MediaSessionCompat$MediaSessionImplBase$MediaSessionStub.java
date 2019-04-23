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
		postToHandler(1, ((Object) (new MediaSessionCompat.MediaSessionImplBase.Command(s, bundle, resultreceiverwrapper.mResultReceiver))));
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:new             #242 <Class MediaSessionCompat$MediaSessionImplBase$Command>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:getfield        #248 <Field android.os.ResultReceiver MediaSessionCompat$ResultReceiverWrapper.mResultReceiver>
	//    8   12:invokespecial   #251 <Method void MediaSessionCompat$MediaSessionImplBase$Command(String, Bundle, android.os.ResultReceiver)>
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
