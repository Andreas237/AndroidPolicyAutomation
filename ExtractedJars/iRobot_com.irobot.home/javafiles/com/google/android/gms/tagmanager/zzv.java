// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.os.Looper;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.tagmanager:
//			ContainerHolder, TagManager, Container, zzx, 
//			zzdi, zzw

final class zzv
	implements ContainerHolder
{

	public zzv(Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		zzbab = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Status zzbab>
		zzazy = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #31  <Field Looper zzazy>
	//    8   14:return          
	}

	public zzv(TagManager tagmanager, Looper looper, Container container, zzw zzw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		zzbaf = tagmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field TagManager zzbaf>
		if(looper == null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          16
	//*   7   13:goto            20
			looper = Looper.getMainLooper();
	//    8   16:invokestatic    #41  <Method Looper Looper.getMainLooper()>
	//    9   19:astore_2        
		zzazy = looper;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #31  <Field Looper zzazy>
		zzazz = container;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #43  <Field Container zzazz>
		zzbad = zzw1;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #45  <Field zzw zzbad>
		zzbab = Status.RESULT_SUCCESS;
	//   19   36:aload_0         
	//   20   37:getstatic       #50  <Field Status Status.RESULT_SUCCESS>
	//   21   40:putfield        #29  <Field Status zzbab>
		tagmanager.zza(this);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:invokevirtual   #56  <Method int TagManager.zza(zzv)>
	//   25   48:pop             
	//   26   49:return          
	}

	private final void zznr()
	{
		if(zzbac != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field zzx zzbac>
	//*   2    4:ifnull          29
		{
			zzx zzx1 = zzbac;
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field zzx zzbac>
	//    5   11:astore_1        
			zzx1.sendMessage(zzx1.obtainMessage(1, ((Object) (zzbaa.zzno()))));
	//    6   12:aload_1         
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:aload_0         
	//   10   16:getfield        #61  <Field Container zzbaa>
	//   11   19:invokevirtual   #67  <Method String Container.zzno()>
	//   12   22:invokevirtual   #73  <Method android.os.Message zzx.obtainMessage(int, Object)>
	//   13   25:invokevirtual   #77  <Method boolean zzx.sendMessage(android.os.Message)>
	//   14   28:pop             
		}
	//   15   29:return          
	}

	public final Container getContainer()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzbae)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:getfield        #81  <Field boolean zzbae>
	//    4    6:ifeq            18
		zzdi.e("ContainerHolder is released.");
	//    5    9:ldc1            #83  <String "ContainerHolder is released.">
	//    6   11:invokestatic    #89  <Method void zzdi.e(String)>
		this;
	//    7   14:aload_0         
		JVM INSTR monitorexit ;
	//    8   15:monitorexit     
		return null;
	//    9   16:aconst_null     
	//   10   17:areturn         
		Container container;
		if(zzbaa != null)
	//*  11   18:aload_0         
	//*  12   19:getfield        #61  <Field Container zzbaa>
	//*  13   22:ifnull          38
		{
			zzazz = zzbaa;
	//   14   25:aload_0         
	//   15   26:aload_0         
	//   16   27:getfield        #61  <Field Container zzbaa>
	//   17   30:putfield        #43  <Field Container zzazz>
			zzbaa = null;
	//   18   33:aload_0         
	//   19   34:aconst_null     
	//   20   35:putfield        #61  <Field Container zzbaa>
		}
		container = zzazz;
	//   21   38:aload_0         
	//   22   39:getfield        #43  <Field Container zzazz>
	//   23   42:astore_1        
		this;
	//   24   43:aload_0         
		JVM INSTR monitorexit ;
	//   25   44:monitorexit     
		return container;
	//   26   45:aload_1         
	//   27   46:areturn         
		Exception exception;
		exception;
	//   28   47:astore_1        
	//*  29   48:aload_0         
		throw exception;
	//   30   49:monitorexit     
	//   31   50:aload_1         
	//   32   51:athrow          
	}

	final String getContainerId()
	{
		if(zzbae)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field boolean zzbae>
	//*   2    4:ifeq            15
		{
			zzdi.e("getContainerId called on a released ContainerHolder.");
	//    3    7:ldc1            #92  <String "getContainerId called on a released ContainerHolder.">
	//    4    9:invokestatic    #89  <Method void zzdi.e(String)>
			return "";
	//    5   12:ldc1            #94  <String "">
	//    6   14:areturn         
		} else
		{
			return zzazz.getContainerId();
	//    7   15:aload_0         
	//    8   16:getfield        #43  <Field Container zzazz>
	//    9   19:invokevirtual   #96  <Method String Container.getContainerId()>
	//   10   22:areturn         
		}
	}

	public final Status getStatus()
	{
		return zzbab;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Status zzbab>
	//    2    4:areturn         
	}

	public final void refresh()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzbae)
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_0         
	//    3    3:getfield        #81  <Field boolean zzbae>
	//    4    6:ifeq            17
		zzdi.e("Refreshing a released ContainerHolder.");
	//    5    9:ldc1            #101 <String "Refreshing a released ContainerHolder.">
	//    6   11:invokestatic    #89  <Method void zzdi.e(String)>
		this;
	//    7   14:aload_0         
		JVM INSTR monitorexit ;
	//    8   15:monitorexit     
		return;
	//    9   16:return          
		zzbad.zzns();
	//   10   17:aload_0         
	//   11   18:getfield        #45  <Field zzw zzbad>
	//   12   21:invokeinterface #106 <Method void zzw.zzns()>
		this;
	//   13   26:aload_0         
		JVM INSTR monitorexit ;
	//   14   27:monitorexit     
		return;
	//   15   28:return          
		Exception exception;
		exception;
	//   16   29:astore_1        
	//*  17   30:aload_0         
		throw exception;
	//   18   31:monitorexit     
	//   19   32:aload_1         
	//   20   33:athrow          
	}

	public final void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzbae)
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_0         
	//    3    3:getfield        #81  <Field boolean zzbae>
	//    4    6:ifeq            17
		zzdi.e("Releasing a released ContainerHolder.");
	//    5    9:ldc1            #109 <String "Releasing a released ContainerHolder.">
	//    6   11:invokestatic    #89  <Method void zzdi.e(String)>
		this;
	//    7   14:aload_0         
		JVM INSTR monitorexit ;
	//    8   15:monitorexit     
		return;
	//    9   16:return          
		zzbae = true;
	//   10   17:aload_0         
	//   11   18:iconst_1        
	//   12   19:putfield        #81  <Field boolean zzbae>
		zzbaf.zzb(this);
	//   13   22:aload_0         
	//   14   23:getfield        #35  <Field TagManager zzbaf>
	//   15   26:aload_0         
	//   16   27:invokevirtual   #113 <Method boolean TagManager.zzb(zzv)>
	//   17   30:pop             
		zzazz.release();
	//   18   31:aload_0         
	//   19   32:getfield        #43  <Field Container zzazz>
	//   20   35:invokevirtual   #115 <Method void Container.release()>
		zzazz = null;
	//   21   38:aload_0         
	//   22   39:aconst_null     
	//   23   40:putfield        #43  <Field Container zzazz>
		zzbaa = null;
	//   24   43:aload_0         
	//   25   44:aconst_null     
	//   26   45:putfield        #61  <Field Container zzbaa>
		zzbad = null;
	//   27   48:aload_0         
	//   28   49:aconst_null     
	//   29   50:putfield        #45  <Field zzw zzbad>
		zzbac = null;
	//   30   53:aload_0         
	//   31   54:aconst_null     
	//   32   55:putfield        #59  <Field zzx zzbac>
		this;
	//   33   58:aload_0         
		JVM INSTR monitorexit ;
	//   34   59:monitorexit     
		return;
	//   35   60:return          
		Exception exception;
		exception;
	//   36   61:astore_1        
	//*  37   62:aload_0         
		throw exception;
	//   38   63:monitorexit     
	//   39   64:aload_1         
	//   40   65:athrow          
	}

	public final void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener containeravailablelistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzbae)
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_0         
	//    3    3:getfield        #81  <Field boolean zzbae>
	//    4    6:ifeq            17
		zzdi.e("ContainerHolder is released.");
	//    5    9:ldc1            #83  <String "ContainerHolder is released.">
	//    6   11:invokestatic    #89  <Method void zzdi.e(String)>
		this;
	//    7   14:aload_0         
		JVM INSTR monitorexit ;
	//    8   15:monitorexit     
		return;
	//    9   16:return          
		if(containeravailablelistener != null)
			break MISSING_BLOCK_LABEL_29;
	//   10   17:aload_1         
	//   11   18:ifnonnull       29
		zzbac = null;
	//   12   21:aload_0         
	//   13   22:aconst_null     
	//   14   23:putfield        #59  <Field zzx zzbac>
		this;
	//   15   26:aload_0         
		JVM INSTR monitorexit ;
	//   16   27:monitorexit     
		return;
	//   17   28:return          
		zzbac = new zzx(this, containeravailablelistener, zzazy);
	//   18   29:aload_0         
	//   19   30:new             #69  <Class zzx>
	//   20   33:dup             
	//   21   34:aload_0         
	//   22   35:aload_1         
	//   23   36:aload_0         
	//   24   37:getfield        #31  <Field Looper zzazy>
	//   25   40:invokespecial   #120 <Method void zzx(zzv, ContainerHolder$ContainerAvailableListener, Looper)>
	//   26   43:putfield        #59  <Field zzx zzbac>
		if(zzbaa != null)
	//*  27   46:aload_0         
	//*  28   47:getfield        #61  <Field Container zzbaa>
	//*  29   50:ifnull          57
			zznr();
	//   30   53:aload_0         
	//   31   54:invokespecial   #122 <Method void zznr()>
		this;
	//   32   57:aload_0         
		JVM INSTR monitorexit ;
	//   33   58:monitorexit     
		return;
	//   34   59:return          
		containeravailablelistener;
	//   35   60:astore_1        
	//*  36   61:aload_0         
		throw containeravailablelistener;
	//   37   62:monitorexit     
	//   38   63:aload_1         
	//   39   64:athrow          
	}

	public final void zza(Container container)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzbae;
	//    2    2:aload_0         
	//    3    3:getfield        #81  <Field boolean zzbae>
	//    4    6:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_2         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		zzbaa = container;
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:putfield        #61  <Field Container zzbaa>
		zznr();
	//   13   19:aload_0         
	//   14   20:invokespecial   #122 <Method void zznr()>
		this;
	//   15   23:aload_0         
		JVM INSTR monitorexit ;
	//   16   24:monitorexit     
		return;
	//   17   25:return          
		container;
	//   18   26:astore_1        
	//*  19   27:aload_0         
		throw container;
	//   20   28:monitorexit     
	//   21   29:aload_1         
	//   22   30:athrow          
	}

	public final void zzde(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzbae;
	//    2    2:aload_0         
	//    3    3:getfield        #81  <Field boolean zzbae>
	//    4    6:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:iload_2         
	//    6    8:ifeq            14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		zzazz.zzde(s);
	//   10   14:aload_0         
	//   11   15:getfield        #43  <Field Container zzazz>
	//   12   18:aload_1         
	//   13   19:invokevirtual   #126 <Method void Container.zzde(String)>
		this;
	//   14   22:aload_0         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		return;
	//   16   24:return          
		s;
	//   17   25:astore_1        
	//*  18   26:aload_0         
		throw s;
	//   19   27:monitorexit     
	//   20   28:aload_1         
	//   21   29:athrow          
	}

	final void zzdf(String s)
	{
		if(zzbae)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field boolean zzbae>
	//*   2    4:ifeq            13
		{
			zzdi.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
	//    3    7:ldc1            #129 <String "setCtfeUrlPathAndQuery called on a released ContainerHolder.">
	//    4    9:invokestatic    #89  <Method void zzdi.e(String)>
			return;
	//    5   12:return          
		} else
		{
			zzbad.zzdf(s);
	//    6   13:aload_0         
	//    7   14:getfield        #45  <Field zzw zzbad>
	//    8   17:aload_1         
	//    9   18:invokeinterface #131 <Method void zzw.zzdf(String)>
			return;
	//   10   23:return          
		}
	}

	final String zznq()
	{
		if(zzbae)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field boolean zzbae>
	//*   2    4:ifeq            15
		{
			zzdi.e("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
	//    3    7:ldc1            #129 <String "setCtfeUrlPathAndQuery called on a released ContainerHolder.">
	//    4    9:invokestatic    #89  <Method void zzdi.e(String)>
			return "";
	//    5   12:ldc1            #94  <String "">
	//    6   14:areturn         
		} else
		{
			return zzbad.zznq();
	//    7   15:aload_0         
	//    8   16:getfield        #45  <Field zzw zzbad>
	//    9   19:invokeinterface #134 <Method String zzw.zznq()>
	//   10   24:areturn         
		}
	}

	private final Looper zzazy;
	private Container zzazz;
	private Container zzbaa;
	private Status zzbab;
	private zzx zzbac;
	private zzw zzbad;
	private boolean zzbae;
	private TagManager zzbaf;
}
