// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahj, zzahk, zzjm, zzagz, 
//			zzane, zzlw

public final class zzahm
	implements RewardedVideoAd
{

	public zzahm(Context context, zzagz zzagz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void Object()>
	//    6   12:putfield        #24  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #26  <Class zzahj>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #29  <Method void zzahj(RewardedVideoAdListener)>
	//   12   24:putfield        #31  <Field zzahj zzclk>
		zzclj = zzagz1;
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:putfield        #33  <Field zzagz zzclj>
		mContext = context;
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:putfield        #35  <Field Context mContext>
	//   19   37:return          
	}

	private final void zza(String s, zzlw zzlw)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
			{
				if(zzclj != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field zzagz zzclj>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_3         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		try
		{
			zzclj.zza(new zzahk(zzjm.zza(mContext, zzlw), s));
	//   11   17:aload_0         
	//   12   18:getfield        #33  <Field zzagz zzclj>
	//   13   21:new             #42  <Class zzahk>
	//   14   24:dup             
	//   15   25:aload_0         
	//   16   26:getfield        #35  <Field Context mContext>
	//   17   29:aload_2         
	//   18   30:invokestatic    #47  <Method zzjj zzjm.zza(Context, zzlw)>
	//   19   33:aload_1         
	//   20   34:invokespecial   #50  <Method void zzahk(zzjj, String)>
	//   21   37:invokeinterface #55  <Method void zzagz.zza(zzahk)>
			break MISSING_BLOCK_LABEL_52;
	//   22   42:goto            52
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   23   45:astore_1        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (s)));
	//   24   46:ldc1            #57  <String "#007 Could not call remote method.">
	//   25   48:aload_1         
	//   26   49:invokestatic    #63  <Method void zzane.zzd(String, Throwable)>
		obj;
	//   27   52:aload_3         
		JVM INSTR monitorexit ;
	//   28   53:monitorexit     
		return;
	//   29   54:return          
		s;
	//   30   55:astore_1        
		obj;
	//   31   56:aload_3         
		JVM INSTR monitorexit ;
	//   32   57:monitorexit     
		throw s;
	//   33   58:aload_1         
	//   34   59:athrow          
	}

	public final void destroy()
	{
		destroy(((Context) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #67  <Method void destroy(Context)>
	//    3    5:return          
	}

	public final void destroy(Context context)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				zzclk.setRewardedVideoAdListener(((RewardedVideoAdListener) (null)));
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field zzahj zzclk>
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #70  <Method void zzahj.setRewardedVideoAdListener(RewardedVideoAdListener)>
				if(zzclj != null)
					break label0;
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field zzagz zzclj>
	//   11   19:ifnonnull       25
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return;
	//   14   24:return          
		}
		try
		{
			zzclj.zzf(ObjectWrapper.wrap(((Object) (context))));
	//   15   25:aload_0         
	//   16   26:getfield        #33  <Field zzagz zzclj>
	//   17   29:aload_1         
	//   18   30:invokestatic    #76  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   19   33:invokeinterface #80  <Method void zzagz.zzf(com.google.android.gms.dynamic.IObjectWrapper)>
			break MISSING_BLOCK_LABEL_48;
	//   20   38:goto            48
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   21   41:astore_1        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (context)));
	//   22   42:ldc1            #57  <String "#007 Could not call remote method.">
	//   23   44:aload_1         
	//   24   45:invokestatic    #63  <Method void zzane.zzd(String, Throwable)>
		obj;
	//   25   48:aload_2         
		JVM INSTR monitorexit ;
	//   26   49:monitorexit     
		return;
	//   27   50:return          
		context;
	//   28   51:astore_1        
		obj;
	//   29   52:aload_2         
		JVM INSTR monitorexit ;
	//   30   53:monitorexit     
		throw context;
	//   31   54:aload_1         
	//   32   55:athrow          
	}

	public final String getMediationAdapterClassName()
	{
		String s;
		if(zzclj == null)
			break MISSING_BLOCK_LABEL_26;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field zzagz zzclj>
	//    2    4:ifnull          26
		s = zzclj.getMediationAdapterClassName();
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field zzagz zzclj>
	//    5   11:invokeinterface #84  <Method String zzagz.getMediationAdapterClassName()>
	//    6   16:astore_1        
		return s;
	//    7   17:aload_1         
	//    8   18:areturn         
		RemoteException remoteexception;
		remoteexception;
	//    9   19:astore_1        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   10   20:ldc1            #57  <String "#007 Could not call remote method.">
	//   11   22:aload_1         
	//   12   23:invokestatic    #63  <Method void zzane.zzd(String, Throwable)>
		return null;
	//   13   26:aconst_null     
	//   14   27:areturn         
	}

	public final RewardedVideoAdListener getRewardedVideoAdListener()
	{
		RewardedVideoAdListener rewardedvideoadlistener;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			rewardedvideoadlistener = zzclk.getRewardedVideoAdListener();
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field zzahj zzclk>
	//    7   11:invokevirtual   #88  <Method RewardedVideoAdListener zzahj.getRewardedVideoAdListener()>
	//    8   14:astore_2        
		}
	//    9   15:aload_1         
	//   10   16:monitorexit     
		return rewardedvideoadlistener;
	//   11   17:aload_2         
	//   12   18:areturn         
		exception;
	//   13   19:astore_2        
		obj;
	//   14   20:aload_1         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw exception;
	//   16   22:aload_2         
	//   17   23:athrow          
	}

	public final String getUserId()
	{
		String s;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			s = zzadr;
	//    5    7:aload_0         
	//    6    8:getfield        #91  <Field String zzadr>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return s;
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

	public final boolean isLoaded()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzclj != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field zzagz zzclj>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		boolean flag = zzclj.isLoaded();
	//   12   18:aload_0         
	//   13   19:getfield        #33  <Field zzagz zzclj>
	//   14   22:invokeinterface #95  <Method boolean zzagz.isLoaded()>
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
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   21   33:ldc1            #57  <String "#007 Could not call remote method.">
	//   22   35:aload_3         
	//   23   36:invokestatic    #63  <Method void zzane.zzd(String, Throwable)>
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

	public final void loadAd(String s, AdRequest adrequest)
	{
		zza(s, adrequest.zzay());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #103 <Method zzlw AdRequest.zzay()>
	//    4    6:invokespecial   #105 <Method void zza(String, zzlw)>
	//    5    9:return          
	}

	public final void loadAd(String s, PublisherAdRequest publisheradrequest)
	{
		zza(s, publisheradrequest.zzay());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #109 <Method zzlw PublisherAdRequest.zzay()>
	//    4    6:invokespecial   #105 <Method void zza(String, zzlw)>
	//    5    9:return          
	}

	public final void pause()
	{
		pause(((Context) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #112 <Method void pause(Context)>
	//    3    5:return          
	}

	public final void pause(Context context)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzclj != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field zzagz zzclj>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		try
		{
			zzclj.zzd(ObjectWrapper.wrap(((Object) (context))));
	//   11   17:aload_0         
	//   12   18:getfield        #33  <Field zzagz zzclj>
	//   13   21:aload_1         
	//   14   22:invokestatic    #76  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   15   25:invokeinterface #114 <Method void zzagz.zzd(com.google.android.gms.dynamic.IObjectWrapper)>
			break MISSING_BLOCK_LABEL_40;
	//   16   30:goto            40
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   17   33:astore_1        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (context)));
	//   18   34:ldc1            #57  <String "#007 Could not call remote method.">
	//   19   36:aload_1         
	//   20   37:invokestatic    #63  <Method void zzane.zzd(String, Throwable)>
		obj;
	//   21   40:aload_2         
		JVM INSTR monitorexit ;
	//   22   41:monitorexit     
		return;
	//   23   42:return          
		context;
	//   24   43:astore_1        
		obj;
	//   25   44:aload_2         
		JVM INSTR monitorexit ;
	//   26   45:monitorexit     
		throw context;
	//   27   46:aload_1         
	//   28   47:athrow          
	}

	public final void resume()
	{
		resume(((Context) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #117 <Method void resume(Context)>
	//    3    5:return          
	}

	public final void resume(Context context)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzclj != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field zzagz zzclj>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		try
		{
			zzclj.zze(ObjectWrapper.wrap(((Object) (context))));
	//   11   17:aload_0         
	//   12   18:getfield        #33  <Field zzagz zzclj>
	//   13   21:aload_1         
	//   14   22:invokestatic    #76  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   15   25:invokeinterface #120 <Method void zzagz.zze(com.google.android.gms.dynamic.IObjectWrapper)>
			break MISSING_BLOCK_LABEL_40;
	//   16   30:goto            40
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   17   33:astore_1        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (context)));
	//   18   34:ldc1            #57  <String "#007 Could not call remote method.">
	//   19   36:aload_1         
	//   20   37:invokestatic    #63  <Method void zzane.zzd(String, Throwable)>
		obj;
	//   21   40:aload_2         
		JVM INSTR monitorexit ;
	//   22   41:monitorexit     
		return;
	//   23   42:return          
		context;
	//   24   43:astore_1        
		obj;
	//   25   44:aload_2         
		JVM INSTR monitorexit ;
	//   26   45:monitorexit     
		throw context;
	//   27   46:aload_1         
	//   28   47:athrow          
	}

	public final void setImmersiveMode(boolean flag)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzagz zzagz1 = zzclj;
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field zzagz zzclj>
	//    7   11:astore_3        
		if(zzagz1 == null)
			break MISSING_BLOCK_LABEL_36;
	//    8   12:aload_3         
	//    9   13:ifnull          36
		zzclj.setImmersiveMode(flag);
	//   10   16:aload_0         
	//   11   17:getfield        #33  <Field zzagz zzclj>
	//   12   20:iload_1         
	//   13   21:invokeinterface #124 <Method void zzagz.setImmersiveMode(boolean)>
		break MISSING_BLOCK_LABEL_36;
	//   14   26:goto            36
		Object obj1;
		obj1;
	//   15   29:astore_3        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (obj1)));
	//   16   30:ldc1            #57  <String "#007 Could not call remote method.">
	//   17   32:aload_3         
	//   18   33:invokestatic    #63  <Method void zzane.zzd(String, Throwable)>
		obj;
	//   19   36:aload_2         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		return;
	//   21   38:return          
		obj1;
	//   22   39:astore_3        
		obj;
	//   23   40:aload_2         
		JVM INSTR monitorexit ;
	//   24   41:monitorexit     
		throw obj1;
	//   25   42:aload_3         
	//   26   43:athrow          
	}

	public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedvideoadlistener)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzclk.setRewardedVideoAdListener(rewardedvideoadlistener);
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field zzahj zzclk>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #70  <Method void zzahj.setRewardedVideoAdListener(RewardedVideoAdListener)>
		rewardedvideoadlistener = ((RewardedVideoAdListener) (zzclj));
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field zzagz zzclj>
	//   11   19:astore_1        
		if(rewardedvideoadlistener == null)
			break MISSING_BLOCK_LABEL_47;
	//   12   20:aload_1         
	//   13   21:ifnull          47
		try
		{
			zzclj.zza(((zzahe) (zzclk)));
	//   14   24:aload_0         
	//   15   25:getfield        #33  <Field zzagz zzclj>
	//   16   28:aload_0         
	//   17   29:getfield        #31  <Field zzahj zzclk>
	//   18   32:invokeinterface #127 <Method void zzagz.zza(zzahe)>
			break MISSING_BLOCK_LABEL_47;
	//   19   37:goto            47
		}
		// Misplaced declaration of an exception variable
		catch(RewardedVideoAdListener rewardedvideoadlistener) { }
	//   20   40:astore_1        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (rewardedvideoadlistener)));
	//   21   41:ldc1            #57  <String "#007 Could not call remote method.">
	//   22   43:aload_1         
	//   23   44:invokestatic    #63  <Method void zzane.zzd(String, Throwable)>
		obj;
	//   24   47:aload_2         
		JVM INSTR monitorexit ;
	//   25   48:monitorexit     
		return;
	//   26   49:return          
		rewardedvideoadlistener;
	//   27   50:astore_1        
		obj;
	//   28   51:aload_2         
		JVM INSTR monitorexit ;
	//   29   52:monitorexit     
		throw rewardedvideoadlistener;
	//   30   53:aload_1         
	//   31   54:athrow          
	}

	public final void setUserId(String s)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzagz zzagz1;
		zzadr = s;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #91  <Field String zzadr>
		zzagz1 = zzclj;
	//    8   12:aload_0         
	//    9   13:getfield        #33  <Field zzagz zzclj>
	//   10   16:astore_3        
		if(zzagz1 == null)
			break MISSING_BLOCK_LABEL_41;
	//   11   17:aload_3         
	//   12   18:ifnull          41
		try
		{
			zzclj.setUserId(s);
	//   13   21:aload_0         
	//   14   22:getfield        #33  <Field zzagz zzclj>
	//   15   25:aload_1         
	//   16   26:invokeinterface #131 <Method void zzagz.setUserId(String)>
			break MISSING_BLOCK_LABEL_41;
	//   17   31:goto            41
		}
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   18   34:astore_1        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (s)));
	//   19   35:ldc1            #57  <String "#007 Could not call remote method.">
	//   20   37:aload_1         
	//   21   38:invokestatic    #63  <Method void zzane.zzd(String, Throwable)>
		obj;
	//   22   41:aload_2         
		JVM INSTR monitorexit ;
	//   23   42:monitorexit     
		return;
	//   24   43:return          
		s;
	//   25   44:astore_1        
		obj;
	//   26   45:aload_2         
		JVM INSTR monitorexit ;
	//   27   46:monitorexit     
		throw s;
	//   28   47:aload_1         
	//   29   48:athrow          
	}

	public final void show()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzclj != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field zzagz zzclj>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		zzclj.show();
	//   11   17:aload_0         
	//   12   18:getfield        #33  <Field zzagz zzclj>
	//   13   21:invokeinterface #134 <Method void zzagz.show()>
		break MISSING_BLOCK_LABEL_36;
	//   14   26:goto            36
		RemoteException remoteexception;
		remoteexception;
	//   15   29:astore_2        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//   16   30:ldc1            #57  <String "#007 Could not call remote method.">
	//   17   32:aload_2         
	//   18   33:invokestatic    #63  <Method void zzane.zzd(String, Throwable)>
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

	private final Context mContext;
	private final Object mLock = new Object();
	private String zzadr;
	private final zzagz zzclj;
	private final zzahj zzclk = new zzahj(((RewardedVideoAdListener) (null)));
}
