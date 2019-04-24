// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzbv;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajk, zzajv, zzjj

public final class zzajj
{

	private zzajj(zzajv zzajv1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void Object()>
	//    6   12:putfield        #33  <Field Object mLock>
		zzcow = -1L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #34  <Long -1L>
	//    9   19:putfield        #37  <Field long zzcow>
		zzcox = -1L;
	//   10   22:aload_0         
	//   11   23:ldc2w           #34  <Long -1L>
	//   12   26:putfield        #39  <Field long zzcox>
		zzcif = false;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #41  <Field boolean zzcif>
		zzcoy = -1L;
	//   16   34:aload_0         
	//   17   35:ldc2w           #34  <Long -1L>
	//   18   38:putfield        #43  <Field long zzcoy>
		zzcoz = 0L;
	//   19   41:aload_0         
	//   20   42:lconst_0        
	//   21   43:putfield        #45  <Field long zzcoz>
		zzcpa = -1L;
	//   22   46:aload_0         
	//   23   47:ldc2w           #34  <Long -1L>
	//   24   50:putfield        #47  <Field long zzcpa>
		zzcpb = -1L;
	//   25   53:aload_0         
	//   26   54:ldc2w           #34  <Long -1L>
	//   27   57:putfield        #49  <Field long zzcpb>
		zzacn = zzajv1;
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:putfield        #51  <Field zzajv zzacn>
		zzcou = s;
	//   31   65:aload_0         
	//   32   66:aload_2         
	//   33   67:putfield        #53  <Field String zzcou>
		zzcov = s1;
	//   34   70:aload_0         
	//   35   71:aload_3         
	//   36   72:putfield        #55  <Field String zzcov>
		zzcot = new LinkedList();
	//   37   75:aload_0         
	//   38   76:new             #57  <Class LinkedList>
	//   39   79:dup             
	//   40   80:invokespecial   #58  <Method void LinkedList()>
	//   41   83:putfield        #60  <Field LinkedList zzcot>
	//   42   86:return          
	}

	public zzajj(String s, String s1)
	{
		this(zzbv.zzep(), s, s1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #68  <Method zzajv zzbv.zzep()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #70  <Method void zzajj(zzajv, String, String)>
	//    5    9:return          
	}

	public final Bundle toBundle()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Object mLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Bundle bundle;
		ArrayList arraylist;
		bundle = new Bundle();
	//    5    7:new             #74  <Class Bundle>
	//    6   10:dup             
	//    7   11:invokespecial   #75  <Method void Bundle()>
	//    8   14:astore_2        
		bundle.putString("seq_num", zzcou);
	//    9   15:aload_2         
	//   10   16:ldc1            #77  <String "seq_num">
	//   11   18:aload_0         
	//   12   19:getfield        #53  <Field String zzcou>
	//   13   22:invokevirtual   #80  <Method void Bundle.putString(String, String)>
		bundle.putString("slotid", zzcov);
	//   14   25:aload_2         
	//   15   26:ldc1            #82  <String "slotid">
	//   16   28:aload_0         
	//   17   29:getfield        #55  <Field String zzcov>
	//   18   32:invokevirtual   #80  <Method void Bundle.putString(String, String)>
		bundle.putBoolean("ismediation", zzcif);
	//   19   35:aload_2         
	//   20   36:ldc1            #84  <String "ismediation">
	//   21   38:aload_0         
	//   22   39:getfield        #41  <Field boolean zzcif>
	//   23   42:invokevirtual   #88  <Method void Bundle.putBoolean(String, boolean)>
		bundle.putLong("treq", zzcpa);
	//   24   45:aload_2         
	//   25   46:ldc1            #90  <String "treq">
	//   26   48:aload_0         
	//   27   49:getfield        #47  <Field long zzcpa>
	//   28   52:invokevirtual   #94  <Method void Bundle.putLong(String, long)>
		bundle.putLong("tresponse", zzcpb);
	//   29   55:aload_2         
	//   30   56:ldc1            #96  <String "tresponse">
	//   31   58:aload_0         
	//   32   59:getfield        #49  <Field long zzcpb>
	//   33   62:invokevirtual   #94  <Method void Bundle.putLong(String, long)>
		bundle.putLong("timp", zzcox);
	//   34   65:aload_2         
	//   35   66:ldc1            #98  <String "timp">
	//   36   68:aload_0         
	//   37   69:getfield        #39  <Field long zzcox>
	//   38   72:invokevirtual   #94  <Method void Bundle.putLong(String, long)>
		bundle.putLong("tload", zzcoy);
	//   39   75:aload_2         
	//   40   76:ldc1            #100 <String "tload">
	//   41   78:aload_0         
	//   42   79:getfield        #43  <Field long zzcoy>
	//   43   82:invokevirtual   #94  <Method void Bundle.putLong(String, long)>
		bundle.putLong("pcc", zzcoz);
	//   44   85:aload_2         
	//   45   86:ldc1            #102 <String "pcc">
	//   46   88:aload_0         
	//   47   89:getfield        #45  <Field long zzcoz>
	//   48   92:invokevirtual   #94  <Method void Bundle.putLong(String, long)>
		bundle.putLong("tfetch", zzcow);
	//   49   95:aload_2         
	//   50   96:ldc1            #104 <String "tfetch">
	//   51   98:aload_0         
	//   52   99:getfield        #37  <Field long zzcow>
	//   53  102:invokevirtual   #94  <Method void Bundle.putLong(String, long)>
		arraylist = new ArrayList();
	//   54  105:new             #106 <Class ArrayList>
	//   55  108:dup             
	//   56  109:invokespecial   #107 <Method void ArrayList()>
	//   57  112:astore_3        
		for(Iterator iterator = zzcot.iterator(); iterator.hasNext(); arraylist.add(((Object) (((zzajk)iterator.next()).toBundle()))));
	//   58  113:aload_0         
	//   59  114:getfield        #60  <Field LinkedList zzcot>
	//   60  117:invokevirtual   #111 <Method Iterator LinkedList.iterator()>
	//   61  120:astore          4
	//   62  122:aload           4
	//   63  124:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//   64  129:ifeq            153
	//   65  132:aload_3         
	//   66  133:aload           4
	//   67  135:invokeinterface #121 <Method Object Iterator.next()>
	//   68  140:checkcast       #123 <Class zzajk>
	//   69  143:invokevirtual   #125 <Method Bundle zzajk.toBundle()>
	//   70  146:invokevirtual   #129 <Method boolean ArrayList.add(Object)>
	//   71  149:pop             
	//*  72  150:goto            122
		bundle.putParcelableArrayList("tclick", arraylist);
	//   73  153:aload_2         
	//   74  154:ldc1            #131 <String "tclick">
	//   75  156:aload_3         
	//   76  157:invokevirtual   #135 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		obj;
	//   77  160:aload_1         
		JVM INSTR monitorexit ;
	//   78  161:monitorexit     
		return bundle;
	//   79  162:aload_2         
	//   80  163:areturn         
		Exception exception;
		exception;
	//   81  164:astore_2        
		obj;
	//   82  165:aload_1         
		JVM INSTR monitorexit ;
	//   83  166:monitorexit     
		throw exception;
	//   84  167:aload_2         
	//   85  168:athrow          
	}

	public final void zzh(long l)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			zzcpb = l;
	//    5    7:aload_0         
	//    6    8:lload_1         
	//    7    9:putfield        #49  <Field long zzcpb>
			if(zzcpb != -1L)
	//*   8   12:aload_0         
	//*   9   13:getfield        #49  <Field long zzcpb>
	//*  10   16:ldc2w           #34  <Long -1L>
	//*  11   19:lcmp            
	//*  12   20:ifeq            31
				zzacn.zza(this);
	//   13   23:aload_0         
	//   14   24:getfield        #51  <Field zzajv zzacn>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #143 <Method void zzajv.zza(zzajj)>
		}
	//   17   31:aload_3         
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		exception;
	//   20   34:astore          4
		obj;
	//   21   36:aload_3         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		throw exception;
	//   23   38:aload           4
	//   24   40:athrow          
	}

	public final void zzi(long l)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			if(zzcpb != -1L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #49  <Field long zzcpb>
	//*   7   11:ldc2w           #34  <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifeq            31
			{
				zzcow = l;
	//   10   18:aload_0         
	//   11   19:lload_1         
	//   12   20:putfield        #37  <Field long zzcow>
				zzacn.zza(this);
	//   13   23:aload_0         
	//   14   24:getfield        #51  <Field zzajv zzacn>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #143 <Method void zzajv.zza(zzajj)>
			}
		}
	//   17   31:aload_3         
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		exception;
	//   20   34:astore          4
		obj;
	//   21   36:aload_3         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		throw exception;
	//   23   38:aload           4
	//   24   40:athrow          
	}

	public final void zzn(zzjj zzjj)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzcpa = SystemClock.elapsedRealtime();
	//    5    7:aload_0         
	//    6    8:invokestatic    #152 <Method long SystemClock.elapsedRealtime()>
	//    7   11:putfield        #47  <Field long zzcpa>
			zzacn.zzb(zzjj, zzcpa);
	//    8   14:aload_0         
	//    9   15:getfield        #51  <Field zzajv zzacn>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #47  <Field long zzcpa>
	//   13   23:invokevirtual   #156 <Method void zzajv.zzb(zzjj, long)>
		}
	//   14   26:aload_2         
	//   15   27:monitorexit     
		return;
	//   16   28:return          
		zzjj;
	//   17   29:astore_1        
		obj;
	//   18   30:aload_2         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		throw zzjj;
	//   20   32:aload_1         
	//   21   33:athrow          
	}

	public final void zzpm()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzcpb != -1L && zzcox == -1L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #49  <Field long zzcpb>
	//*   7   11:ldc2w           #34  <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifeq            44
	//*  10   18:aload_0         
	//*  11   19:getfield        #39  <Field long zzcox>
	//*  12   22:ldc2w           #34  <Long -1L>
	//*  13   25:lcmp            
	//*  14   26:ifne            44
			{
				zzcox = SystemClock.elapsedRealtime();
	//   15   29:aload_0         
	//   16   30:invokestatic    #152 <Method long SystemClock.elapsedRealtime()>
	//   17   33:putfield        #39  <Field long zzcox>
				zzacn.zza(this);
	//   18   36:aload_0         
	//   19   37:getfield        #51  <Field zzajv zzacn>
	//   20   40:aload_0         
	//   21   41:invokevirtual   #143 <Method void zzajv.zza(zzajj)>
			}
			zzacn.zzpm();
	//   22   44:aload_0         
	//   23   45:getfield        #51  <Field zzajv zzacn>
	//   24   48:invokevirtual   #159 <Method void zzajv.zzpm()>
		}
	//   25   51:aload_1         
	//   26   52:monitorexit     
		return;
	//   27   53:return          
		exception;
	//   28   54:astore_2        
		obj;
	//   29   55:aload_1         
		JVM INSTR monitorexit ;
	//   30   56:monitorexit     
		throw exception;
	//   31   57:aload_2         
	//   32   58:athrow          
	}

	public final void zzpn()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzcpb != -1L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #49  <Field long zzcpb>
	//*   7   11:ldc2w           #34  <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifeq            64
			{
				zzajk zzajk1 = new zzajk();
	//   10   18:new             #123 <Class zzajk>
	//   11   21:dup             
	//   12   22:invokespecial   #161 <Method void zzajk()>
	//   13   25:astore_2        
				zzajk1.zzpr();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #164 <Method void zzajk.zzpr()>
				zzcot.add(((Object) (zzajk1)));
	//   16   30:aload_0         
	//   17   31:getfield        #60  <Field LinkedList zzcot>
	//   18   34:aload_2         
	//   19   35:invokevirtual   #165 <Method boolean LinkedList.add(Object)>
	//   20   38:pop             
				zzcoz = zzcoz + 1L;
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #45  <Field long zzcoz>
	//   24   44:lconst_1        
	//   25   45:ladd            
	//   26   46:putfield        #45  <Field long zzcoz>
				zzacn.zzpn();
	//   27   49:aload_0         
	//   28   50:getfield        #51  <Field zzajv zzacn>
	//   29   53:invokevirtual   #167 <Method void zzajv.zzpn()>
				zzacn.zza(this);
	//   30   56:aload_0         
	//   31   57:getfield        #51  <Field zzajv zzacn>
	//   32   60:aload_0         
	//   33   61:invokevirtual   #143 <Method void zzajv.zza(zzajj)>
			}
		}
	//   34   64:aload_1         
	//   35   65:monitorexit     
		return;
	//   36   66:return          
		exception;
	//   37   67:astore_2        
		obj;
	//   38   68:aload_1         
		JVM INSTR monitorexit ;
	//   39   69:monitorexit     
		throw exception;
	//   40   70:aload_2         
	//   41   71:athrow          
	}

	public final void zzpo()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(zzcpb != -1L && !zzcot.isEmpty())
	//*   5    7:aload_0         
	//*   6    8:getfield        #49  <Field long zzcpb>
	//*   7   11:ldc2w           #34  <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifeq            62
	//*  10   18:aload_0         
	//*  11   19:getfield        #60  <Field LinkedList zzcot>
	//*  12   22:invokevirtual   #171 <Method boolean LinkedList.isEmpty()>
	//*  13   25:ifne            62
			{
				zzajk zzajk1 = (zzajk)zzcot.getLast();
	//   14   28:aload_0         
	//   15   29:getfield        #60  <Field LinkedList zzcot>
	//   16   32:invokevirtual   #174 <Method Object LinkedList.getLast()>
	//   17   35:checkcast       #123 <Class zzajk>
	//   18   38:astore_2        
				if(zzajk1.zzpp() == -1L)
	//*  19   39:aload_2         
	//*  20   40:invokevirtual   #177 <Method long zzajk.zzpp()>
	//*  21   43:ldc2w           #34  <Long -1L>
	//*  22   46:lcmp            
	//*  23   47:ifne            62
				{
					zzajk1.zzpq();
	//   24   50:aload_2         
	//   25   51:invokevirtual   #180 <Method void zzajk.zzpq()>
					zzacn.zza(this);
	//   26   54:aload_0         
	//   27   55:getfield        #51  <Field zzajv zzacn>
	//   28   58:aload_0         
	//   29   59:invokevirtual   #143 <Method void zzajv.zza(zzajj)>
				}
			}
		}
	//   30   62:aload_1         
	//   31   63:monitorexit     
		return;
	//   32   64:return          
		exception;
	//   33   65:astore_2        
		obj;
	//   34   66:aload_1         
		JVM INSTR monitorexit ;
	//   35   67:monitorexit     
		throw exception;
	//   36   68:aload_2         
	//   37   69:athrow          
	}

	public final void zzy(boolean flag)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzcpb == -1L)
			break MISSING_BLOCK_LABEL_45;
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field long zzcpb>
	//    7   11:ldc2w           #34  <Long -1L>
	//    8   14:lcmp            
	//    9   15:ifeq            45
		zzcoy = SystemClock.elapsedRealtime();
	//   10   18:aload_0         
	//   11   19:invokestatic    #152 <Method long SystemClock.elapsedRealtime()>
	//   12   22:putfield        #43  <Field long zzcoy>
		if(flag)
			break MISSING_BLOCK_LABEL_45;
	//   13   25:iload_1         
	//   14   26:ifne            45
		zzcox = zzcoy;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #43  <Field long zzcoy>
	//   18   34:putfield        #39  <Field long zzcox>
		zzacn.zza(this);
	//   19   37:aload_0         
	//   20   38:getfield        #51  <Field zzajv zzacn>
	//   21   41:aload_0         
	//   22   42:invokevirtual   #143 <Method void zzajv.zza(zzajj)>
		obj;
	//   23   45:aload_2         
		JVM INSTR monitorexit ;
	//   24   46:monitorexit     
		return;
	//   25   47:return          
		Exception exception;
		exception;
	//   26   48:astore_3        
		obj;
	//   27   49:aload_2         
		JVM INSTR monitorexit ;
	//   28   50:monitorexit     
		throw exception;
	//   29   51:aload_3         
	//   30   52:athrow          
	}

	public final void zzz(boolean flag)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(zzcpb != -1L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #49  <Field long zzcpb>
	//*   7   11:ldc2w           #34  <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifeq            31
			{
				zzcif = flag;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #41  <Field boolean zzcif>
				zzacn.zza(this);
	//   13   23:aload_0         
	//   14   24:getfield        #51  <Field zzajv zzacn>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #143 <Method void zzajv.zza(zzajj)>
			}
		}
	//   17   31:aload_2         
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		exception;
	//   20   34:astore_3        
		obj;
	//   21   35:aload_2         
		JVM INSTR monitorexit ;
	//   22   36:monitorexit     
		throw exception;
	//   23   37:aload_3         
	//   24   38:athrow          
	}

	private final Object mLock;
	private final zzajv zzacn;
	private boolean zzcif;
	private final LinkedList zzcot;
	private final String zzcou;
	private final String zzcov;
	private long zzcow;
	private long zzcox;
	private long zzcoy;
	private long zzcoz;
	private long zzcpa;
	private long zzcpb;
}
