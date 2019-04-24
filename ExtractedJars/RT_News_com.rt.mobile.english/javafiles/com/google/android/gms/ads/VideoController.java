// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.*;

public final class VideoController
{
	public static class VideoLifecycleCallbacks
	{

		public void onVideoEnd()
		{
		//    0    0:return          
		}

		public void onVideoMute(boolean flag)
		{
		//    0    0:return          
		}

		public void onVideoPause()
		{
		//    0    0:return          
		}

		public void onVideoPlay()
		{
		//    0    0:return          
		}

		public void onVideoStart()
		{
		//    0    0:return          
		}

		public VideoLifecycleCallbacks()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public VideoController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Object()>
	//    6   12:putfield        #35  <Field Object mLock>
	//    7   15:return          
	}

	public final float getAspectRatio()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzux != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field zzlo zzux>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return 0.0F;
	//   10   16:fconst_0        
	//   11   17:freturn         
		}
		float f = zzux.getAspectRatio();
	//   12   18:aload_0         
	//   13   19:getfield        #42  <Field zzlo zzux>
	//   14   22:invokeinterface #46  <Method float zzlo.getAspectRatio()>
	//   15   27:fstore_1        
		obj;
	//   16   28:aload_2         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return f;
	//   18   30:fload_1         
	//   19   31:freturn         
		RemoteException remoteexception;
		remoteexception;
	//   20   32:astore_3        
		zzane.zzb("Unable to call getAspectRatio on video controller.", ((Throwable) (remoteexception)));
	//   21   33:ldc1            #48  <String "Unable to call getAspectRatio on video controller.">
	//   22   35:aload_3         
	//   23   36:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		obj;
	//   24   39:aload_2         
		JVM INSTR monitorexit ;
	//   25   40:monitorexit     
		return 0.0F;
	//   26   41:fconst_0        
	//   27   42:freturn         
		exception;
	//   28   43:astore_3        
		obj;
	//   29   44:aload_2         
		JVM INSTR monitorexit ;
	//   30   45:monitorexit     
		throw exception;
	//   31   46:aload_3         
	//   32   47:athrow          
	}

	public final int getPlaybackState()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzux != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field zzlo zzux>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return 0;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		int i = zzux.getPlaybackState();
	//   12   18:aload_0         
	//   13   19:getfield        #42  <Field zzlo zzux>
	//   14   22:invokeinterface #58  <Method int zzlo.getPlaybackState()>
	//   15   27:istore_1        
		obj;
	//   16   28:aload_2         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return i;
	//   18   30:iload_1         
	//   19   31:ireturn         
		RemoteException remoteexception;
		remoteexception;
	//   20   32:astore_3        
		zzane.zzb("Unable to call getPlaybackState on video controller.", ((Throwable) (remoteexception)));
	//   21   33:ldc1            #60  <String "Unable to call getPlaybackState on video controller.">
	//   22   35:aload_3         
	//   23   36:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		obj;
	//   24   39:aload_2         
		JVM INSTR monitorexit ;
	//   25   40:monitorexit     
		return 0;
	//   26   41:iconst_0        
	//   27   42:ireturn         
		exception;
	//   28   43:astore_3        
		obj;
	//   29   44:aload_2         
		JVM INSTR monitorexit ;
	//   30   45:monitorexit     
		throw exception;
	//   31   46:aload_3         
	//   32   47:athrow          
	}

	public final VideoLifecycleCallbacks getVideoLifecycleCallbacks()
	{
		VideoLifecycleCallbacks videolifecyclecallbacks;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			videolifecyclecallbacks = zzuy;
	//    5    7:aload_0         
	//    6    8:getfield        #65  <Field VideoController$VideoLifecycleCallbacks zzuy>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return videolifecyclecallbacks;
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

	public final boolean hasVideoContent()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzux != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #42  <Field zzlo zzux>
	//*   7   11:ifnull          28
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:aload_2         
	//*  12   20:monitorexit     
	//*  13   21:iload_1         
	//*  14   22:ireturn         
	//*  15   23:astore_3        
	//*  16   24:aload_2         
	//*  17   25:monitorexit     
	//*  18   26:aload_3         
	//*  19   27:athrow          
			flag = false;
	//   20   28:iconst_0        
	//   21   29:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  22   30:goto            19
	}

	public final boolean isClickToExpandEnabled()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzux != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field zzlo zzux>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		boolean flag = zzux.isClickToExpandEnabled();
	//   12   18:aload_0         
	//   13   19:getfield        #42  <Field zzlo zzux>
	//   14   22:invokeinterface #70  <Method boolean zzlo.isClickToExpandEnabled()>
	//   15   27:istore_1        
		obj;
	//   16   28:aload_2         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return flag;
	//   18   30:iload_1         
	//   19   31:ireturn         
		RemoteException remoteexception;
		remoteexception;
	//   20   32:astore_3        
		zzane.zzb("Unable to call isClickToExpandEnabled.", ((Throwable) (remoteexception)));
	//   21   33:ldc1            #72  <String "Unable to call isClickToExpandEnabled.">
	//   22   35:aload_3         
	//   23   36:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		obj;
	//   24   39:aload_2         
		JVM INSTR monitorexit ;
	//   25   40:monitorexit     
		return false;
	//   26   41:iconst_0        
	//   27   42:ireturn         
		exception;
	//   28   43:astore_3        
		obj;
	//   29   44:aload_2         
		JVM INSTR monitorexit ;
	//   30   45:monitorexit     
		throw exception;
	//   31   46:aload_3         
	//   32   47:athrow          
	}

	public final boolean isCustomControlsEnabled()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzux != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field zzlo zzux>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		boolean flag = zzux.isCustomControlsEnabled();
	//   12   18:aload_0         
	//   13   19:getfield        #42  <Field zzlo zzux>
	//   14   22:invokeinterface #75  <Method boolean zzlo.isCustomControlsEnabled()>
	//   15   27:istore_1        
		obj;
	//   16   28:aload_2         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return flag;
	//   18   30:iload_1         
	//   19   31:ireturn         
		RemoteException remoteexception;
		remoteexception;
	//   20   32:astore_3        
		zzane.zzb("Unable to call isUsingCustomPlayerControls.", ((Throwable) (remoteexception)));
	//   21   33:ldc1            #77  <String "Unable to call isUsingCustomPlayerControls.">
	//   22   35:aload_3         
	//   23   36:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		obj;
	//   24   39:aload_2         
		JVM INSTR monitorexit ;
	//   25   40:monitorexit     
		return false;
	//   26   41:iconst_0        
	//   27   42:ireturn         
		exception;
	//   28   43:astore_3        
		obj;
	//   29   44:aload_2         
		JVM INSTR monitorexit ;
	//   30   45:monitorexit     
		throw exception;
	//   31   46:aload_3         
	//   32   47:athrow          
	}

	public final boolean isMuted()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzux != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field zzlo zzux>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return true;
	//   10   16:iconst_1        
	//   11   17:ireturn         
		}
		boolean flag = zzux.isMuted();
	//   12   18:aload_0         
	//   13   19:getfield        #42  <Field zzlo zzux>
	//   14   22:invokeinterface #80  <Method boolean zzlo.isMuted()>
	//   15   27:istore_1        
		obj;
	//   16   28:aload_2         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return flag;
	//   18   30:iload_1         
	//   19   31:ireturn         
		RemoteException remoteexception;
		remoteexception;
	//   20   32:astore_3        
		zzane.zzb("Unable to call isMuted on video controller.", ((Throwable) (remoteexception)));
	//   21   33:ldc1            #82  <String "Unable to call isMuted on video controller.">
	//   22   35:aload_3         
	//   23   36:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		obj;
	//   24   39:aload_2         
		JVM INSTR monitorexit ;
	//   25   40:monitorexit     
		return true;
	//   26   41:iconst_1        
	//   27   42:ireturn         
		exception;
	//   28   43:astore_3        
		obj;
	//   29   44:aload_2         
		JVM INSTR monitorexit ;
	//   30   45:monitorexit     
		throw exception;
	//   31   46:aload_3         
	//   32   47:athrow          
	}

	public final void mute(boolean flag)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzux != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field zzlo zzux>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		zzux.mute(flag);
	//   11   17:aload_0         
	//   12   18:getfield        #42  <Field zzlo zzux>
	//   13   21:iload_1         
	//   14   22:invokeinterface #86  <Method void zzlo.mute(boolean)>
		break MISSING_BLOCK_LABEL_37;
	//   15   27:goto            37
		RemoteException remoteexception;
		remoteexception;
	//   16   30:astore_3        
		zzane.zzb("Unable to call mute on video controller.", ((Throwable) (remoteexception)));
	//   17   31:ldc1            #88  <String "Unable to call mute on video controller.">
	//   18   33:aload_3         
	//   19   34:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		obj;
	//   20   37:aload_2         
		JVM INSTR monitorexit ;
	//   21   38:monitorexit     
		return;
	//   22   39:return          
		exception;
	//   23   40:astore_3        
		obj;
	//   24   41:aload_2         
		JVM INSTR monitorexit ;
	//   25   42:monitorexit     
		throw exception;
	//   26   43:aload_3         
	//   27   44:athrow          
	}

	public final void pause()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzux != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field zzlo zzux>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		zzux.pause();
	//   11   17:aload_0         
	//   12   18:getfield        #42  <Field zzlo zzux>
	//   13   21:invokeinterface #91  <Method void zzlo.pause()>
		break MISSING_BLOCK_LABEL_36;
	//   14   26:goto            36
		RemoteException remoteexception;
		remoteexception;
	//   15   29:astore_2        
		zzane.zzb("Unable to call pause on video controller.", ((Throwable) (remoteexception)));
	//   16   30:ldc1            #93  <String "Unable to call pause on video controller.">
	//   17   32:aload_2         
	//   18   33:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		obj;
	//   19   36:aload_1         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		return;
	//   21   38:return          
		exception;
	//   22   39:astore_2        
		obj;
	//   23   40:aload_1         
		JVM INSTR monitorexit ;
	//   24   41:monitorexit     
		throw exception;
	//   25   42:aload_2         
	//   26   43:athrow          
	}

	public final void play()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzux != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field zzlo zzux>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		zzux.play();
	//   11   17:aload_0         
	//   12   18:getfield        #42  <Field zzlo zzux>
	//   13   21:invokeinterface #96  <Method void zzlo.play()>
		break MISSING_BLOCK_LABEL_36;
	//   14   26:goto            36
		RemoteException remoteexception;
		remoteexception;
	//   15   29:astore_2        
		zzane.zzb("Unable to call play on video controller.", ((Throwable) (remoteexception)));
	//   16   30:ldc1            #98  <String "Unable to call play on video controller.">
	//   17   32:aload_2         
	//   18   33:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		obj;
	//   19   36:aload_1         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		return;
	//   21   38:return          
		exception;
	//   22   39:astore_2        
		obj;
	//   23   40:aload_1         
		JVM INSTR monitorexit ;
	//   24   41:monitorexit     
		throw exception;
	//   25   42:aload_2         
	//   26   43:athrow          
	}

	public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videolifecyclecallbacks)
	{
label0:
		{
			Preconditions.checkNotNull(((Object) (videolifecyclecallbacks)), "VideoLifecycleCallbacks may not be null.");
	//    0    0:aload_1         
	//    1    1:ldc1            #102 <String "VideoLifecycleCallbacks may not be null.">
	//    2    3:invokestatic    #108 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
			synchronized(mLock)
	//*   4    7:aload_0         
	//*   5    8:getfield        #35  <Field Object mLock>
	//*   6   11:astore_2        
	//*   7   12:aload_2         
	//*   8   13:monitorenter    
			{
				zzuy = videolifecyclecallbacks;
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:putfield        #65  <Field VideoController$VideoLifecycleCallbacks zzuy>
				if(zzux != null)
					break label0;
	//   12   19:aload_0         
	//   13   20:getfield        #42  <Field zzlo zzux>
	//   14   23:ifnonnull       29
			}
	//   15   26:aload_2         
	//   16   27:monitorexit     
			return;
	//   17   28:return          
		}
		try
		{
			zzux.zza(((com.google.android.gms.internal.ads.zzlr) (new zzmt(videolifecyclecallbacks))));
	//   18   29:aload_0         
	//   19   30:getfield        #42  <Field zzlo zzux>
	//   20   33:new             #110 <Class zzmt>
	//   21   36:dup             
	//   22   37:aload_1         
	//   23   38:invokespecial   #112 <Method void zzmt(VideoController$VideoLifecycleCallbacks)>
	//   24   41:invokeinterface #116 <Method void zzlo.zza(com.google.android.gms.internal.ads.zzlr)>
			break MISSING_BLOCK_LABEL_56;
	//   25   46:goto            56
		}
		// Misplaced declaration of an exception variable
		catch(VideoLifecycleCallbacks videolifecyclecallbacks) { }
	//   26   49:astore_1        
		zzane.zzb("Unable to call setVideoLifecycleCallbacks on video controller.", ((Throwable) (videolifecyclecallbacks)));
	//   27   50:ldc1            #118 <String "Unable to call setVideoLifecycleCallbacks on video controller.">
	//   28   52:aload_1         
	//   29   53:invokestatic    #54  <Method void zzane.zzb(String, Throwable)>
		obj;
	//   30   56:aload_2         
		JVM INSTR monitorexit ;
	//   31   57:monitorexit     
		return;
	//   32   58:return          
		videolifecyclecallbacks;
	//   33   59:astore_1        
		obj;
	//   34   60:aload_2         
		JVM INSTR monitorexit ;
	//   35   61:monitorexit     
		throw videolifecyclecallbacks;
	//   36   62:aload_1         
	//   37   63:athrow          
	}

	public final void zza(zzlo zzlo1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzux = zzlo1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #42  <Field zzlo zzux>
			if(zzuy != null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #65  <Field VideoController$VideoLifecycleCallbacks zzuy>
	//*  10   16:ifnull          27
				setVideoLifecycleCallbacks(zzuy);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #65  <Field VideoController$VideoLifecycleCallbacks zzuy>
	//   14   24:invokevirtual   #121 <Method void setVideoLifecycleCallbacks(VideoController$VideoLifecycleCallbacks)>
		}
	//   15   27:aload_2         
	//   16   28:monitorexit     
		return;
	//   17   29:return          
		zzlo1;
	//   18   30:astore_1        
		obj;
	//   19   31:aload_2         
		JVM INSTR monitorexit ;
	//   20   32:monitorexit     
		throw zzlo1;
	//   21   33:aload_1         
	//   22   34:athrow          
	}

	public final zzlo zzbc()
	{
		zzlo zzlo1;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzlo1 = zzux;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field zzlo zzux>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return zzlo1;
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

	public static final int PLAYBACK_STATE_ENDED = 3;
	public static final int PLAYBACK_STATE_PAUSED = 2;
	public static final int PLAYBACK_STATE_PLAYING = 1;
	public static final int PLAYBACK_STATE_READY = 5;
	public static final int PLAYBACK_STATE_UNKNOWN = 0;
	private final Object mLock = new Object();
	private zzlo zzux;
	private VideoLifecycleCallbacks zzuy;
}
