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
		postToHandler(1, ((Object) (new MediaSessionCompat.MediaSessionImplBase.Command(s, bundle, MediaSessionCompat.ResultReceiverWrapper.access$100(resultreceiverwrapper)))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaSessionCompat$MediaSessionImplBase this$0>
	//    2    4:iconst_1        
	//    3    5:new             #214 <Class MediaSessionCompat$MediaSessionImplBase$Command>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokestatic    #220 <Method android.os.ResultReceiver MediaSessionCompat$ResultReceiverWrapper.access$100(MediaSessionCompat$ResultReceiverWrapper)>
	//    9   15:invokespecial   #223 <Method void MediaSessionCompat$MediaSessionImplBase$Command(String, Bundle, android.os.ResultReceiver)>
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
