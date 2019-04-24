// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.*;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzabc, zzaav, zzaag, zzaat, 
//			zzabq

final class zzaai
	implements zzabc
{
	class zza
		implements zzabc.zza
	{

		public void zzc(int i, boolean flag)
		{
			zzaai.zza(zzaAI).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzaai zzaAI>
		//    2    4:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
		//    3    7:invokeinterface #32  <Method void Lock.lock()>
			if(!zzaai.zzc(zzaAI) && zzaai.zzd(zzaAI) != null && zzaai.zzd(zzaAI).isSuccess())
				break MISSING_BLOCK_LABEL_76;
		//    4   12:aload_0         
		//    5   13:getfield        #15  <Field zzaai zzaAI>
		//    6   16:invokestatic    #35  <Method boolean zzaai.zzc(zzaai)>
		//    7   19:ifne            45
		//    8   22:aload_0         
		//    9   23:getfield        #15  <Field zzaai zzaAI>
		//   10   26:invokestatic    #39  <Method ConnectionResult zzaai.zzd(zzaai)>
		//   11   29:ifnull          45
		//   12   32:aload_0         
		//   13   33:getfield        #15  <Field zzaai zzaAI>
		//   14   36:invokestatic    #39  <Method ConnectionResult zzaai.zzd(zzaai)>
		//   15   39:invokevirtual   #45  <Method boolean ConnectionResult.isSuccess()>
		//   16   42:ifne            76
			zzaai.zza(zzaAI, false);
		//   17   45:aload_0         
		//   18   46:getfield        #15  <Field zzaai zzaAI>
		//   19   49:iconst_0        
		//   20   50:invokestatic    #48  <Method boolean zzaai.zza(zzaai, boolean)>
		//   21   53:pop             
			zzaai.zza(zzaAI, i, flag);
		//   22   54:aload_0         
		//   23   55:getfield        #15  <Field zzaai zzaAI>
		//   24   58:iload_1         
		//   25   59:iload_2         
		//   26   60:invokestatic    #51  <Method void zzaai.zza(zzaai, int, boolean)>
			zzaai.zza(zzaAI).unlock();
		//   27   63:aload_0         
		//   28   64:getfield        #15  <Field zzaai zzaAI>
		//   29   67:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
		//   30   70:invokeinterface #54  <Method void Lock.unlock()>
			return;
		//   31   75:return          
			zzaai.zza(zzaAI, true);
		//   32   76:aload_0         
		//   33   77:getfield        #15  <Field zzaai zzaAI>
		//   34   80:iconst_1        
		//   35   81:invokestatic    #48  <Method boolean zzaai.zza(zzaai, boolean)>
		//   36   84:pop             
			com.google.android.gms.internal.zzaai.zze(zzaAI).onConnectionSuspended(i);
		//   37   85:aload_0         
		//   38   86:getfield        #15  <Field zzaai zzaAI>
		//   39   89:invokestatic    #58  <Method zzaav com.google.android.gms.internal.zzaai.zze(zzaai)>
		//   40   92:iload_1         
		//   41   93:invokevirtual   #64  <Method void zzaav.onConnectionSuspended(int)>
			zzaai.zza(zzaAI).unlock();
		//   42   96:aload_0         
		//   43   97:getfield        #15  <Field zzaai zzaAI>
		//   44  100:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
		//   45  103:invokeinterface #54  <Method void Lock.unlock()>
			return;
		//   46  108:return          
			Exception exception;
			exception;
		//   47  109:astore_3        
			zzaai.zza(zzaAI).unlock();
		//   48  110:aload_0         
		//   49  111:getfield        #15  <Field zzaai zzaAI>
		//   50  114:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
		//   51  117:invokeinterface #54  <Method void Lock.unlock()>
			throw exception;
		//   52  122:aload_3         
		//   53  123:athrow          
		}

		public void zzc(ConnectionResult connectionresult)
		{
			zzaai.zza(zzaAI).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzaai zzaAI>
		//    2    4:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
		//    3    7:invokeinterface #32  <Method void Lock.lock()>
			zzaai.zza(zzaAI, connectionresult);
		//    4   12:aload_0         
		//    5   13:getfield        #15  <Field zzaai zzaAI>
		//    6   16:aload_1         
		//    7   17:invokestatic    #69  <Method ConnectionResult zzaai.zza(zzaai, ConnectionResult)>
		//    8   20:pop             
			zzaai.zzb(zzaAI);
		//    9   21:aload_0         
		//   10   22:getfield        #15  <Field zzaai zzaAI>
		//   11   25:invokestatic    #72  <Method void zzaai.zzb(zzaai)>
			zzaai.zza(zzaAI).unlock();
		//   12   28:aload_0         
		//   13   29:getfield        #15  <Field zzaai zzaAI>
		//   14   32:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
		//   15   35:invokeinterface #54  <Method void Lock.unlock()>
			return;
		//   16   40:return          
			connectionresult;
		//   17   41:astore_1        
			zzaai.zza(zzaAI).unlock();
		//   18   42:aload_0         
		//   19   43:getfield        #15  <Field zzaai zzaAI>
		//   20   46:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
		//   21   49:invokeinterface #54  <Method void Lock.unlock()>
			throw connectionresult;
		//   22   54:aload_1         
		//   23   55:athrow          
		}

		public void zzo(Bundle bundle)
		{
			zzaai.zza(zzaAI).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzaai zzaAI>
		//    2    4:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
		//    3    7:invokeinterface #32  <Method void Lock.lock()>
			zzaai.zza(zzaAI, bundle);
		//    4   12:aload_0         
		//    5   13:getfield        #15  <Field zzaai zzaAI>
		//    6   16:aload_1         
		//    7   17:invokestatic    #79  <Method void zzaai.zza(zzaai, Bundle)>
			zzaai.zza(zzaAI, ConnectionResult.zzayj);
		//    8   20:aload_0         
		//    9   21:getfield        #15  <Field zzaai zzaAI>
		//   10   24:getstatic       #83  <Field ConnectionResult ConnectionResult.zzayj>
		//   11   27:invokestatic    #69  <Method ConnectionResult zzaai.zza(zzaai, ConnectionResult)>
		//   12   30:pop             
			zzaai.zzb(zzaAI);
		//   13   31:aload_0         
		//   14   32:getfield        #15  <Field zzaai zzaAI>
		//   15   35:invokestatic    #72  <Method void zzaai.zzb(zzaai)>
			zzaai.zza(zzaAI).unlock();
		//   16   38:aload_0         
		//   17   39:getfield        #15  <Field zzaai zzaAI>
		//   18   42:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
		//   19   45:invokeinterface #54  <Method void Lock.unlock()>
			return;
		//   20   50:return          
			bundle;
		//   21   51:astore_1        
			zzaai.zza(zzaAI).unlock();
		//   22   52:aload_0         
		//   23   53:getfield        #15  <Field zzaai zzaAI>
		//   24   56:invokestatic    #27  <Method Lock zzaai.zza(zzaai)>
		//   25   59:invokeinterface #54  <Method void Lock.unlock()>
			throw bundle;
		//   26   64:aload_1         
		//   27   65:athrow          
		}

		final zzaai zzaAI;

		private zza()
		{
			zzaAI = zzaai.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field zzaai zzaAI>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	class zzb
		implements zzabc.zza
	{

		public void zzc(int i, boolean flag)
		{
			zzaai.zza(zzaAI).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzaai zzaAI>
		//    2    4:invokestatic    #28  <Method Lock zzaai.zza(zzaai)>
		//    3    7:invokeinterface #33  <Method void Lock.lock()>
			if(!zzaai.zzc(zzaAI))
				break MISSING_BLOCK_LABEL_53;
		//    4   12:aload_0         
		//    5   13:getfield        #15  <Field zzaai zzaAI>
		//    6   16:invokestatic    #36  <Method boolean zzaai.zzc(zzaai)>
		//    7   19:ifeq            53
			zzaai.zza(zzaAI, false);
		//    8   22:aload_0         
		//    9   23:getfield        #15  <Field zzaai zzaAI>
		//   10   26:iconst_0        
		//   11   27:invokestatic    #39  <Method boolean zzaai.zza(zzaai, boolean)>
		//   12   30:pop             
			zzaai.zza(zzaAI, i, flag);
		//   13   31:aload_0         
		//   14   32:getfield        #15  <Field zzaai zzaAI>
		//   15   35:iload_1         
		//   16   36:iload_2         
		//   17   37:invokestatic    #42  <Method void zzaai.zza(zzaai, int, boolean)>
			zzaai.zza(zzaAI).unlock();
		//   18   40:aload_0         
		//   19   41:getfield        #15  <Field zzaai zzaAI>
		//   20   44:invokestatic    #28  <Method Lock zzaai.zza(zzaai)>
		//   21   47:invokeinterface #45  <Method void Lock.unlock()>
			return;
		//   22   52:return          
			zzaai.zza(zzaAI, true);
		//   23   53:aload_0         
		//   24   54:getfield        #15  <Field zzaai zzaAI>
		//   25   57:iconst_1        
		//   26   58:invokestatic    #39  <Method boolean zzaai.zza(zzaai, boolean)>
		//   27   61:pop             
			zzaai.zzf(zzaAI).onConnectionSuspended(i);
		//   28   62:aload_0         
		//   29   63:getfield        #15  <Field zzaai zzaAI>
		//   30   66:invokestatic    #49  <Method zzaav zzaai.zzf(zzaai)>
		//   31   69:iload_1         
		//   32   70:invokevirtual   #55  <Method void zzaav.onConnectionSuspended(int)>
			zzaai.zza(zzaAI).unlock();
		//   33   73:aload_0         
		//   34   74:getfield        #15  <Field zzaai zzaAI>
		//   35   77:invokestatic    #28  <Method Lock zzaai.zza(zzaai)>
		//   36   80:invokeinterface #45  <Method void Lock.unlock()>
			return;
		//   37   85:return          
			Exception exception;
			exception;
		//   38   86:astore_3        
			zzaai.zza(zzaAI).unlock();
		//   39   87:aload_0         
		//   40   88:getfield        #15  <Field zzaai zzaAI>
		//   41   91:invokestatic    #28  <Method Lock zzaai.zza(zzaai)>
		//   42   94:invokeinterface #45  <Method void Lock.unlock()>
			throw exception;
		//   43   99:aload_3         
		//   44  100:athrow          
		}

		public void zzc(ConnectionResult connectionresult)
		{
			zzaai.zza(zzaAI).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzaai zzaAI>
		//    2    4:invokestatic    #28  <Method Lock zzaai.zza(zzaai)>
		//    3    7:invokeinterface #33  <Method void Lock.lock()>
			zzaai.zzb(zzaAI, connectionresult);
		//    4   12:aload_0         
		//    5   13:getfield        #15  <Field zzaai zzaAI>
		//    6   16:aload_1         
		//    7   17:invokestatic    #60  <Method ConnectionResult zzaai.zzb(zzaai, ConnectionResult)>
		//    8   20:pop             
			zzaai.zzb(zzaAI);
		//    9   21:aload_0         
		//   10   22:getfield        #15  <Field zzaai zzaAI>
		//   11   25:invokestatic    #62  <Method void zzaai.zzb(zzaai)>
			zzaai.zza(zzaAI).unlock();
		//   12   28:aload_0         
		//   13   29:getfield        #15  <Field zzaai zzaAI>
		//   14   32:invokestatic    #28  <Method Lock zzaai.zza(zzaai)>
		//   15   35:invokeinterface #45  <Method void Lock.unlock()>
			return;
		//   16   40:return          
			connectionresult;
		//   17   41:astore_1        
			zzaai.zza(zzaAI).unlock();
		//   18   42:aload_0         
		//   19   43:getfield        #15  <Field zzaai zzaAI>
		//   20   46:invokestatic    #28  <Method Lock zzaai.zza(zzaai)>
		//   21   49:invokeinterface #45  <Method void Lock.unlock()>
			throw connectionresult;
		//   22   54:aload_1         
		//   23   55:athrow          
		}

		public void zzo(Bundle bundle)
		{
			zzaai.zza(zzaAI).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field zzaai zzaAI>
		//    2    4:invokestatic    #28  <Method Lock zzaai.zza(zzaai)>
		//    3    7:invokeinterface #33  <Method void Lock.lock()>
			zzaai.zzb(zzaAI, ConnectionResult.zzayj);
		//    4   12:aload_0         
		//    5   13:getfield        #15  <Field zzaai zzaAI>
		//    6   16:getstatic       #72  <Field ConnectionResult ConnectionResult.zzayj>
		//    7   19:invokestatic    #60  <Method ConnectionResult zzaai.zzb(zzaai, ConnectionResult)>
		//    8   22:pop             
			zzaai.zzb(zzaAI);
		//    9   23:aload_0         
		//   10   24:getfield        #15  <Field zzaai zzaAI>
		//   11   27:invokestatic    #62  <Method void zzaai.zzb(zzaai)>
			zzaai.zza(zzaAI).unlock();
		//   12   30:aload_0         
		//   13   31:getfield        #15  <Field zzaai zzaAI>
		//   14   34:invokestatic    #28  <Method Lock zzaai.zza(zzaai)>
		//   15   37:invokeinterface #45  <Method void Lock.unlock()>
			return;
		//   16   42:return          
			bundle;
		//   17   43:astore_1        
			zzaai.zza(zzaAI).unlock();
		//   18   44:aload_0         
		//   19   45:getfield        #15  <Field zzaai zzaAI>
		//   20   48:invokestatic    #28  <Method Lock zzaai.zza(zzaai)>
		//   21   51:invokeinterface #45  <Method void Lock.unlock()>
			throw bundle;
		//   22   56:aload_1         
		//   23   57:athrow          
		}

		final zzaai zzaAI;

		private zzb()
		{
			zzaAI = zzaai.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field zzaai zzaAI>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}


	private zzaai(Context context, zzaat zzaat1, Lock lock, Looper looper, zze zze1, Map map, Map map1, 
			zzg zzg, com.google.android.gms.common.api.Api.zza zza1, com.google.android.gms.common.api.Api.zze zze2, ArrayList arraylist, ArrayList arraylist1, Map map2, Map map3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #49  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #50  <Method void WeakHashMap()>
	//    6   12:invokestatic    #56  <Method Set Collections.newSetFromMap(Map)>
	//    7   15:putfield        #58  <Field Set zzaAA>
		zzaAD = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #60  <Field ConnectionResult zzaAD>
		zzaAE = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #62  <Field ConnectionResult zzaAE>
		zzaAF = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #64  <Field boolean zzaAF>
		zzaAH = 0;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #66  <Field int zzaAH>
		mContext = context;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:putfield        #68  <Field Context mContext>
		zzaAw = zzaat1;
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:putfield        #70  <Field zzaat zzaAw>
		zzaAG = lock;
	//   26   48:aload_0         
	//   27   49:aload_3         
	//   28   50:putfield        #72  <Field Lock zzaAG>
		zzrs = looper;
	//   29   53:aload_0         
	//   30   54:aload           4
	//   31   56:putfield        #74  <Field Looper zzrs>
		zzaAB = zze2;
	//   32   59:aload_0         
	//   33   60:aload           10
	//   34   62:putfield        #76  <Field com.google.android.gms.common.api.Api$zze zzaAB>
		zzaAx = new zzaav(context, zzaAw, lock, looper, zze1, map1, ((zzg) (null)), map3, ((com.google.android.gms.common.api.Api.zza) (null)), arraylist1, ((zzabc.zza) (new zza())));
	//   35   65:aload_0         
	//   36   66:new             #78  <Class zzaav>
	//   37   69:dup             
	//   38   70:aload_1         
	//   39   71:aload_0         
	//   40   72:getfield        #70  <Field zzaat zzaAw>
	//   41   75:aload_3         
	//   42   76:aload           4
	//   43   78:aload           5
	//   44   80:aload           7
	//   45   82:aconst_null     
	//   46   83:aload           14
	//   47   85:aconst_null     
	//   48   86:aload           12
	//   49   88:new             #10  <Class zzaai$zza>
	//   50   91:dup             
	//   51   92:aload_0         
	//   52   93:aconst_null     
	//   53   94:invokespecial   #81  <Method void zzaai$zza(zzaai, zzaai$1)>
	//   54   97:invokespecial   #84  <Method void zzaav(Context, zzaat, Lock, Looper, zze, Map, zzg, Map, com.google.android.gms.common.api.Api$zza, ArrayList, zzabc$zza)>
	//   55  100:putfield        #86  <Field zzaav zzaAx>
		zzaAy = new zzaav(context, zzaAw, lock, looper, zze1, map, zzg, map2, zza1, arraylist, ((zzabc.zza) (new zzb())));
	//   56  103:aload_0         
	//   57  104:new             #78  <Class zzaav>
	//   58  107:dup             
	//   59  108:aload_1         
	//   60  109:aload_0         
	//   61  110:getfield        #70  <Field zzaat zzaAw>
	//   62  113:aload_3         
	//   63  114:aload           4
	//   64  116:aload           5
	//   65  118:aload           6
	//   66  120:aload           8
	//   67  122:aload           13
	//   68  124:aload           9
	//   69  126:aload           11
	//   70  128:new             #13  <Class zzaai$zzb>
	//   71  131:dup             
	//   72  132:aload_0         
	//   73  133:aconst_null     
	//   74  134:invokespecial   #87  <Method void zzaai$zzb(zzaai, zzaai$1)>
	//   75  137:invokespecial   #84  <Method void zzaav(Context, zzaat, Lock, Looper, zze, Map, zzg, Map, com.google.android.gms.common.api.Api$zza, ArrayList, zzabc$zza)>
	//   76  140:putfield        #89  <Field zzaav zzaAy>
		context = ((Context) (new ArrayMap()));
	//   77  143:new             #91  <Class ArrayMap>
	//   78  146:dup             
	//   79  147:invokespecial   #92  <Method void ArrayMap()>
	//   80  150:astore_1        
		for(zzaat1 = ((zzaat) (map1.keySet().iterator())); ((Iterator) (zzaat1)).hasNext(); ((ArrayMap) (context)).put(((Object) ((com.google.android.gms.common.api.Api.zzc)((Iterator) (zzaat1)).next())), ((Object) (zzaAx))));
	//   81  151:aload           7
	//   82  153:invokeinterface #98  <Method Set Map.keySet()>
	//   83  158:invokeinterface #104 <Method Iterator Set.iterator()>
	//   84  163:astore_2        
	//   85  164:aload_2         
	//   86  165:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//   87  170:ifeq            194
	//   88  173:aload_1         
	//   89  174:aload_2         
	//   90  175:invokeinterface #114 <Method Object Iterator.next()>
	//   91  180:checkcast       #116 <Class com.google.android.gms.common.api.Api$zzc>
	//   92  183:aload_0         
	//   93  184:getfield        #86  <Field zzaav zzaAx>
	//   94  187:invokevirtual   #120 <Method Object ArrayMap.put(Object, Object)>
	//   95  190:pop             
	//*  96  191:goto            164
		for(zzaat1 = ((zzaat) (map.keySet().iterator())); ((Iterator) (zzaat1)).hasNext(); ((ArrayMap) (context)).put(((Object) ((com.google.android.gms.common.api.Api.zzc)((Iterator) (zzaat1)).next())), ((Object) (zzaAy))));
	//   97  194:aload           6
	//   98  196:invokeinterface #98  <Method Set Map.keySet()>
	//   99  201:invokeinterface #104 <Method Iterator Set.iterator()>
	//  100  206:astore_2        
	//  101  207:aload_2         
	//  102  208:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//  103  213:ifeq            237
	//  104  216:aload_1         
	//  105  217:aload_2         
	//  106  218:invokeinterface #114 <Method Object Iterator.next()>
	//  107  223:checkcast       #116 <Class com.google.android.gms.common.api.Api$zzc>
	//  108  226:aload_0         
	//  109  227:getfield        #89  <Field zzaav zzaAy>
	//  110  230:invokevirtual   #120 <Method Object ArrayMap.put(Object, Object)>
	//  111  233:pop             
	//* 112  234:goto            207
		zzaAz = Collections.unmodifiableMap(((Map) (context)));
	//  113  237:aload_0         
	//  114  238:aload_1         
	//  115  239:invokestatic    #124 <Method Map Collections.unmodifiableMap(Map)>
	//  116  242:putfield        #126 <Field Map zzaAz>
	//  117  245:return          
	}

	static ConnectionResult zza(zzaai zzaai1, ConnectionResult connectionresult)
	{
		zzaai1.zzaAD = connectionresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #60  <Field ConnectionResult zzaAD>
		return connectionresult;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public static zzaai zza(Context context, zzaat zzaat1, Lock lock, Looper looper, zze zze1, Map map, zzg zzg, Map map1, 
			com.google.android.gms.common.api.Api.zza zza1, ArrayList arraylist)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          11
		ArrayMap arraymap = new ArrayMap();
	//    2    3:new             #91  <Class ArrayMap>
	//    3    6:dup             
	//    4    7:invokespecial   #92  <Method void ArrayMap()>
	//    5   10:astore          12
		ArrayMap arraymap1 = new ArrayMap();
	//    6   12:new             #91  <Class ArrayMap>
	//    7   15:dup             
	//    8   16:invokespecial   #92  <Method void ArrayMap()>
	//    9   19:astore          13
		Object obj1 = ((Object) (map.entrySet().iterator()));
	//   10   21:aload           5
	//   11   23:invokeinterface #134 <Method Set Map.entrySet()>
	//   12   28:invokeinterface #104 <Method Iterator Set.iterator()>
	//   13   33:astore          14
		map = ((Map) (obj));
	//   14   35:aload           11
	//   15   37:astore          5
		while(((Iterator) (obj1)).hasNext()) 
	//*  16   39:aload           14
	//*  17   41:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  18   46:ifeq            143
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
	//   19   49:aload           14
	//   20   51:invokeinterface #114 <Method Object Iterator.next()>
	//   21   56:checkcast       #136 <Class java.util.Map$Entry>
	//   22   59:astore          15
			obj = ((Object) ((com.google.android.gms.common.api.Api.zze)entry.getValue()));
	//   23   61:aload           15
	//   24   63:invokeinterface #139 <Method Object java.util.Map$Entry.getValue()>
	//   25   68:checkcast       #141 <Class com.google.android.gms.common.api.Api$zze>
	//   26   71:astore          11
			if(((com.google.android.gms.common.api.Api.zze) (obj)).zzrr())
	//*  27   73:aload           11
	//*  28   75:invokeinterface #144 <Method boolean com.google.android.gms.common.api.Api$zze.zzrr()>
	//*  29   80:ifeq            87
				map = ((Map) (obj));
	//   30   83:aload           11
	//   31   85:astore          5
			if(((com.google.android.gms.common.api.Api.zze) (obj)).zzrd())
	//*  32   87:aload           11
	//*  33   89:invokeinterface #147 <Method boolean com.google.android.gms.common.api.Api$zze.zzrd()>
	//*  34   94:ifeq            120
				((Map) (arraymap)).put(((Object) ((com.google.android.gms.common.api.Api.zzc)entry.getKey())), obj);
	//   35   97:aload           12
	//   36   99:aload           15
	//   37  101:invokeinterface #150 <Method Object java.util.Map$Entry.getKey()>
	//   38  106:checkcast       #116 <Class com.google.android.gms.common.api.Api$zzc>
	//   39  109:aload           11
	//   40  111:invokeinterface #151 <Method Object Map.put(Object, Object)>
	//   41  116:pop             
			else
	//*  42  117:goto            140
				((Map) (arraymap1)).put(((Object) ((com.google.android.gms.common.api.Api.zzc)entry.getKey())), obj);
	//   43  120:aload           13
	//   44  122:aload           15
	//   45  124:invokeinterface #150 <Method Object java.util.Map$Entry.getKey()>
	//   46  129:checkcast       #116 <Class com.google.android.gms.common.api.Api$zzc>
	//   47  132:aload           11
	//   48  134:invokeinterface #151 <Method Object Map.put(Object, Object)>
	//   49  139:pop             
		}
	//*  50  140:goto            39
		boolean flag;
		if(!((Map) (arraymap)).isEmpty())
	//*  51  143:aload           12
	//*  52  145:invokeinterface #154 <Method boolean Map.isEmpty()>
	//*  53  150:ifne            159
			flag = true;
	//   54  153:iconst_1        
	//   55  154:istore          10
		else
	//*  56  156:goto            162
			flag = false;
	//   57  159:iconst_0        
	//   58  160:istore          10
		zzac.zza(flag, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
	//   59  162:iload           10
	//   60  164:ldc1            #156 <String "CompositeGoogleApiClient should not be used without any APIs that require sign-in.">
	//   61  166:invokestatic    #161 <Method void zzac.zza(boolean, Object)>
		obj = ((Object) (new ArrayMap()));
	//   62  169:new             #91  <Class ArrayMap>
	//   63  172:dup             
	//   64  173:invokespecial   #92  <Method void ArrayMap()>
	//   65  176:astore          11
		obj1 = ((Object) (new ArrayMap()));
	//   66  178:new             #91  <Class ArrayMap>
	//   67  181:dup             
	//   68  182:invokespecial   #92  <Method void ArrayMap()>
	//   69  185:astore          14
		for(Iterator iterator = map1.keySet().iterator(); iterator.hasNext();)
	//*  70  187:aload           7
	//*  71  189:invokeinterface #98  <Method Set Map.keySet()>
	//*  72  194:invokeinterface #104 <Method Iterator Set.iterator()>
	//*  73  199:astore          15
	//*  74  201:aload           15
	//*  75  203:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  76  208:ifeq            317
		{
			Api api = (Api)iterator.next();
	//   77  211:aload           15
	//   78  213:invokeinterface #114 <Method Object Iterator.next()>
	//   79  218:checkcast       #163 <Class Api>
	//   80  221:astore          16
			com.google.android.gms.common.api.Api.zzc zzc1 = api.zzvg();
	//   81  223:aload           16
	//   82  225:invokevirtual   #167 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//   83  228:astore          17
			if(((Map) (arraymap)).containsKey(((Object) (zzc1))))
	//*  84  230:aload           12
	//*  85  232:aload           17
	//*  86  234:invokeinterface #171 <Method boolean Map.containsKey(Object)>
	//*  87  239:ifeq            267
				((Map) (obj)).put(((Object) (api)), ((Object) ((Boolean)map1.get(((Object) (api))))));
	//   88  242:aload           11
	//   89  244:aload           16
	//   90  246:aload           7
	//   91  248:aload           16
	//   92  250:invokeinterface #175 <Method Object Map.get(Object)>
	//   93  255:checkcast       #177 <Class Boolean>
	//   94  258:invokeinterface #151 <Method Object Map.put(Object, Object)>
	//   95  263:pop             
			else
	//*  96  264:goto            314
			if(((Map) (arraymap1)).containsKey(((Object) (zzc1))))
	//*  97  267:aload           13
	//*  98  269:aload           17
	//*  99  271:invokeinterface #171 <Method boolean Map.containsKey(Object)>
	//* 100  276:ifeq            304
				((Map) (obj1)).put(((Object) (api)), ((Object) ((Boolean)map1.get(((Object) (api))))));
	//  101  279:aload           14
	//  102  281:aload           16
	//  103  283:aload           7
	//  104  285:aload           16
	//  105  287:invokeinterface #175 <Method Object Map.get(Object)>
	//  106  292:checkcast       #177 <Class Boolean>
	//  107  295:invokeinterface #151 <Method Object Map.put(Object, Object)>
	//  108  300:pop             
			else
	//* 109  301:goto            314
				throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
	//  110  304:new             #179 <Class IllegalStateException>
	//  111  307:dup             
	//  112  308:ldc1            #181 <String "Each API in the isOptionalMap must have a corresponding client in the clients map.">
	//  113  310:invokespecial   #184 <Method void IllegalStateException(String)>
	//  114  313:athrow          
		}

	//* 115  314:goto            201
		map1 = ((Map) (new ArrayList()));
	//  116  317:new             #186 <Class ArrayList>
	//  117  320:dup             
	//  118  321:invokespecial   #187 <Method void ArrayList()>
	//  119  324:astore          7
		ArrayList arraylist1 = new ArrayList();
	//  120  326:new             #186 <Class ArrayList>
	//  121  329:dup             
	//  122  330:invokespecial   #187 <Method void ArrayList()>
	//  123  333:astore          15
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext();)
	//* 124  335:aload           9
	//* 125  337:invokevirtual   #188 <Method Iterator ArrayList.iterator()>
	//* 126  340:astore          9
	//* 127  342:aload           9
	//* 128  344:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//* 129  349:ifeq            429
		{
			zzaag zzaag1 = (zzaag)((Iterator) (arraylist)).next();
	//  130  352:aload           9
	//  131  354:invokeinterface #114 <Method Object Iterator.next()>
	//  132  359:checkcast       #190 <Class zzaag>
	//  133  362:astore          16
			if(((Map) (obj)).containsKey(((Object) (zzaag1.zzaxf))))
	//* 134  364:aload           11
	//* 135  366:aload           16
	//* 136  368:getfield        #194 <Field Api zzaag.zzaxf>
	//* 137  371:invokeinterface #171 <Method boolean Map.containsKey(Object)>
	//* 138  376:ifeq            390
				((ArrayList) (map1)).add(((Object) (zzaag1)));
	//  139  379:aload           7
	//  140  381:aload           16
	//  141  383:invokevirtual   #197 <Method boolean ArrayList.add(Object)>
	//  142  386:pop             
			else
	//* 143  387:goto            426
			if(((Map) (obj1)).containsKey(((Object) (zzaag1.zzaxf))))
	//* 144  390:aload           14
	//* 145  392:aload           16
	//* 146  394:getfield        #194 <Field Api zzaag.zzaxf>
	//* 147  397:invokeinterface #171 <Method boolean Map.containsKey(Object)>
	//* 148  402:ifeq            416
				arraylist1.add(((Object) (zzaag1)));
	//  149  405:aload           15
	//  150  407:aload           16
	//  151  409:invokevirtual   #197 <Method boolean ArrayList.add(Object)>
	//  152  412:pop             
			else
	//* 153  413:goto            426
				throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
	//  154  416:new             #179 <Class IllegalStateException>
	//  155  419:dup             
	//  156  420:ldc1            #199 <String "Each ClientCallbacks must have a corresponding API in the isOptionalMap">
	//  157  422:invokespecial   #184 <Method void IllegalStateException(String)>
	//  158  425:athrow          
		}

	//* 159  426:goto            342
		return new zzaai(context, zzaat1, lock, looper, zze1, ((Map) (arraymap)), ((Map) (arraymap1)), zzg, zza1, ((com.google.android.gms.common.api.Api.zze) (map)), ((ArrayList) (map1)), arraylist1, ((Map) (obj)), ((Map) (obj1)));
	//  160  429:new             #2   <Class zzaai>
	//  161  432:dup             
	//  162  433:aload_0         
	//  163  434:aload_1         
	//  164  435:aload_2         
	//  165  436:aload_3         
	//  166  437:aload           4
	//  167  439:aload           12
	//  168  441:aload           13
	//  169  443:aload           6
	//  170  445:aload           8
	//  171  447:aload           5
	//  172  449:aload           7
	//  173  451:aload           15
	//  174  453:aload           11
	//  175  455:aload           14
	//  176  457:invokespecial   #201 <Method void zzaai(Context, zzaat, Lock, Looper, zze, Map, Map, zzg, com.google.android.gms.common.api.Api$zza, com.google.android.gms.common.api.Api$zze, ArrayList, ArrayList, Map, Map)>
	//  177  460:areturn         
	}

	static Lock zza(zzaai zzaai1)
	{
		return zzaai1.zzaAG;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Lock zzaAG>
	//    2    4:areturn         
	}

	private void zza(ConnectionResult connectionresult)
	{
		switch(zzaAH)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field int zzaAH>
		{
	//*   2    4:lookupswitch    2: default 32
	//	               1: 43
	//	               2: 35
	//*   3   32:goto            50
		case 2: // '\002'
			zzaAw.zzc(connectionresult);
	//    4   35:aload_0         
	//    5   36:getfield        #70  <Field zzaat zzaAw>
	//    6   39:aload_1         
	//    7   40:invokevirtual   #209 <Method void zzaat.zzc(ConnectionResult)>
			// fall through

		case 1: // '\001'
			zzvR();
	//    8   43:aload_0         
	//    9   44:invokespecial   #212 <Method void zzvR()>
			break;

	//*  10   47:goto            65
		default:
			Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", ((Throwable) (new Exception())));
	//   11   50:ldc1            #214 <String "CompositeGAC">
	//   12   52:ldc1            #216 <String "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor">
	//   13   54:new             #218 <Class Exception>
	//   14   57:dup             
	//   15   58:invokespecial   #219 <Method void Exception()>
	//   16   61:invokestatic    #225 <Method int Log.wtf(String, String, Throwable)>
	//   17   64:pop             
			break;
		}
		zzaAH = 0;
	//   18   65:aload_0         
	//   19   66:iconst_0        
	//   20   67:putfield        #66  <Field int zzaAH>
	//   21   70:return          
	}

	static void zza(zzaai zzaai1, int i, boolean flag)
	{
		zzaai1.zzb(i, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #229 <Method void zzb(int, boolean)>
	//    4    6:return          
	}

	static void zza(zzaai zzaai1, Bundle bundle)
	{
		zzaai1.zzn(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #234 <Method void zzn(Bundle)>
	//    3    5:return          
	}

	static boolean zza(zzaai zzaai1, boolean flag)
	{
		zzaai1.zzaAF = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field boolean zzaAF>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static ConnectionResult zzb(zzaai zzaai1, ConnectionResult connectionresult)
	{
		zzaai1.zzaAE = connectionresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field ConnectionResult zzaAE>
		return connectionresult;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void zzb(int i, boolean flag)
	{
		zzaAw.zzc(i, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field zzaat zzaAw>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #237 <Method void zzaat.zzc(int, boolean)>
		zzaAE = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #62  <Field ConnectionResult zzaAE>
		zzaAD = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #60  <Field ConnectionResult zzaAD>
	//   11   19:return          
	}

	static void zzb(zzaai zzaai1)
	{
		zzaai1.zzvP();
	//    0    0:aload_0         
	//    1    1:invokespecial   #241 <Method void zzvP()>
	//    2    4:return          
	}

	private static boolean zzb(ConnectionResult connectionresult)
	{
		return connectionresult != null && connectionresult.isSuccess();
	//    0    0:aload_0         
	//    1    1:ifnull          13
	//    2    4:aload_0         
	//    3    5:invokevirtual   #247 <Method boolean ConnectionResult.isSuccess()>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private boolean zzc(zzaad.zza zza1)
	{
		zza1 = ((zzaad.zza) (zza1.zzvg()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #251 <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//    2    4:astore_1        
		zzac.zzb(zzaAz.containsKey(((Object) (zza1))), "GoogleApiClient is not configured to use the API required for this call.");
	//    3    5:aload_0         
	//    4    6:getfield        #126 <Field Map zzaAz>
	//    5    9:aload_1         
	//    6   10:invokeinterface #171 <Method boolean Map.containsKey(Object)>
	//    7   15:ldc1            #253 <String "GoogleApiClient is not configured to use the API required for this call.">
	//    8   17:invokestatic    #255 <Method void zzac.zzb(boolean, Object)>
		return ((Object) ((zzaav)zzaAz.get(((Object) (zza1))))).equals(((Object) (zzaAy)));
	//    9   20:aload_0         
	//   10   21:getfield        #126 <Field Map zzaAz>
	//   11   24:aload_1         
	//   12   25:invokeinterface #175 <Method Object Map.get(Object)>
	//   13   30:checkcast       #78  <Class zzaav>
	//   14   33:aload_0         
	//   15   34:getfield        #89  <Field zzaav zzaAy>
	//   16   37:invokevirtual   #258 <Method boolean Object.equals(Object)>
	//   17   40:ireturn         
	}

	static boolean zzc(zzaai zzaai1)
	{
		return zzaai1.zzaAF;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean zzaAF>
	//    2    4:ireturn         
	}

	static ConnectionResult zzd(zzaai zzaai1)
	{
		return zzaai1.zzaAE;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ConnectionResult zzaAE>
	//    2    4:areturn         
	}

	static zzaav zze(zzaai zzaai1)
	{
		return zzaai1.zzaAy;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field zzaav zzaAy>
	//    2    4:areturn         
	}

	static zzaav zzf(zzaai zzaai1)
	{
		return zzaai1.zzaAx;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field zzaav zzaAx>
	//    2    4:areturn         
	}

	private void zzn(Bundle bundle)
	{
		if(zzaAC == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #267 <Field Bundle zzaAC>
	//*   2    4:ifnonnull       13
		{
			zzaAC = bundle;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #267 <Field Bundle zzaAC>
			return;
	//    6   12:return          
		}
		if(bundle != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          25
			zzaAC.putAll(bundle);
	//    9   17:aload_0         
	//   10   18:getfield        #267 <Field Bundle zzaAC>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #272 <Method void Bundle.putAll(Bundle)>
	//   13   25:return          
	}

	private void zzvO()
	{
		zzaAE = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #62  <Field ConnectionResult zzaAE>
		zzaAD = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #60  <Field ConnectionResult zzaAD>
		zzaAx.connect();
	//    6   10:aload_0         
	//    7   11:getfield        #86  <Field zzaav zzaAx>
	//    8   14:invokevirtual   #276 <Method void zzaav.connect()>
		zzaAy.connect();
	//    9   17:aload_0         
	//   10   18:getfield        #89  <Field zzaav zzaAy>
	//   11   21:invokevirtual   #276 <Method void zzaav.connect()>
	//   12   24:return          
	}

	private void zzvP()
	{
		if(zzb(zzaAD))
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field ConnectionResult zzaAD>
	//*   2    4:invokestatic    #278 <Method boolean zzb(ConnectionResult)>
	//*   3    7:ifeq            68
		{
			if(zzb(zzaAE) || zzvS())
	//*   4   10:aload_0         
	//*   5   11:getfield        #62  <Field ConnectionResult zzaAE>
	//*   6   14:invokestatic    #278 <Method boolean zzb(ConnectionResult)>
	//*   7   17:ifne            27
	//*   8   20:aload_0         
	//*   9   21:invokespecial   #281 <Method boolean zzvS()>
	//*  10   24:ifeq            32
			{
				zzvQ();
	//   11   27:aload_0         
	//   12   28:invokespecial   #284 <Method void zzvQ()>
				return;
	//   13   31:return          
			}
			if(zzaAE != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #62  <Field ConnectionResult zzaAE>
	//*  16   36:ifnull          147
				if(zzaAH == 1)
	//*  17   39:aload_0         
	//*  18   40:getfield        #66  <Field int zzaAH>
	//*  19   43:iconst_1        
	//*  20   44:icmpne          52
				{
					zzvR();
	//   21   47:aload_0         
	//   22   48:invokespecial   #212 <Method void zzvR()>
					return;
	//   23   51:return          
				} else
				{
					zza(zzaAE);
	//   24   52:aload_0         
	//   25   53:aload_0         
	//   26   54:getfield        #62  <Field ConnectionResult zzaAE>
	//   27   57:invokespecial   #286 <Method void zza(ConnectionResult)>
					zzaAx.disconnect();
	//   28   60:aload_0         
	//   29   61:getfield        #86  <Field zzaav zzaAx>
	//   30   64:invokevirtual   #289 <Method void zzaav.disconnect()>
					return;
	//   31   67:return          
				}
		} else
		{
			if(zzaAD != null && zzb(zzaAE))
	//*  32   68:aload_0         
	//*  33   69:getfield        #60  <Field ConnectionResult zzaAD>
	//*  34   72:ifnull          101
	//*  35   75:aload_0         
	//*  36   76:getfield        #62  <Field ConnectionResult zzaAE>
	//*  37   79:invokestatic    #278 <Method boolean zzb(ConnectionResult)>
	//*  38   82:ifeq            101
			{
				zzaAy.disconnect();
	//   39   85:aload_0         
	//   40   86:getfield        #89  <Field zzaav zzaAy>
	//   41   89:invokevirtual   #289 <Method void zzaav.disconnect()>
				zza(zzaAD);
	//   42   92:aload_0         
	//   43   93:aload_0         
	//   44   94:getfield        #60  <Field ConnectionResult zzaAD>
	//   45   97:invokespecial   #286 <Method void zza(ConnectionResult)>
				return;
	//   46  100:return          
			}
			if(zzaAD != null && zzaAE != null)
	//*  47  101:aload_0         
	//*  48  102:getfield        #60  <Field ConnectionResult zzaAD>
	//*  49  105:ifnull          147
	//*  50  108:aload_0         
	//*  51  109:getfield        #62  <Field ConnectionResult zzaAE>
	//*  52  112:ifnull          147
			{
				ConnectionResult connectionresult = zzaAD;
	//   53  115:aload_0         
	//   54  116:getfield        #60  <Field ConnectionResult zzaAD>
	//   55  119:astore_1        
				if(zzaAy.zzaCi < zzaAx.zzaCi)
	//*  56  120:aload_0         
	//*  57  121:getfield        #89  <Field zzaav zzaAy>
	//*  58  124:getfield        #292 <Field int zzaav.zzaCi>
	//*  59  127:aload_0         
	//*  60  128:getfield        #86  <Field zzaav zzaAx>
	//*  61  131:getfield        #292 <Field int zzaav.zzaCi>
	//*  62  134:icmpge          142
					connectionresult = zzaAE;
	//   63  137:aload_0         
	//   64  138:getfield        #62  <Field ConnectionResult zzaAE>
	//   65  141:astore_1        
				zza(connectionresult);
	//   66  142:aload_0         
	//   67  143:aload_1         
	//   68  144:invokespecial   #286 <Method void zza(ConnectionResult)>
			}
		}
	//   69  147:return          
	}

	private void zzvQ()
	{
		switch(zzaAH)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field int zzaAH>
		{
	//*   2    4:lookupswitch    2: default 32
	//	               1: 46
	//	               2: 35
	//*   3   32:goto            53
		case 2: // '\002'
			zzaAw.zzo(zzaAC);
	//    4   35:aload_0         
	//    5   36:getfield        #70  <Field zzaat zzaAw>
	//    6   39:aload_0         
	//    7   40:getfield        #267 <Field Bundle zzaAC>
	//    8   43:invokevirtual   #295 <Method void zzaat.zzo(Bundle)>
			// fall through

		case 1: // '\001'
			zzvR();
	//    9   46:aload_0         
	//   10   47:invokespecial   #212 <Method void zzvR()>
			break;

	//*  11   50:goto            69
		default:
			Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", ((Throwable) (new AssertionError())));
	//   12   53:ldc1            #214 <String "CompositeGAC">
	//   13   55:ldc2            #297 <String "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor">
	//   14   58:new             #299 <Class AssertionError>
	//   15   61:dup             
	//   16   62:invokespecial   #300 <Method void AssertionError()>
	//   17   65:invokestatic    #225 <Method int Log.wtf(String, String, Throwable)>
	//   18   68:pop             
			break;
		}
		zzaAH = 0;
	//   19   69:aload_0         
	//   20   70:iconst_0        
	//   21   71:putfield        #66  <Field int zzaAH>
	//   22   74:return          
	}

	private void zzvR()
	{
		for(Iterator iterator = zzaAA.iterator(); iterator.hasNext(); ((zzabq)iterator.next()).zzrq());
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Set zzaAA>
	//    2    4:invokeinterface #104 <Method Iterator Set.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #114 <Method Object Iterator.next()>
	//    9   25:checkcast       #302 <Class zzabq>
	//   10   28:invokeinterface #305 <Method void zzabq.zzrq()>
	//*  11   33:goto            10
		zzaAA.clear();
	//   12   36:aload_0         
	//   13   37:getfield        #58  <Field Set zzaAA>
	//   14   40:invokeinterface #308 <Method void Set.clear()>
	//   15   45:return          
	}

	private boolean zzvS()
	{
		return zzaAE != null && zzaAE.getErrorCode() == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ConnectionResult zzaAE>
	//    2    4:ifnull          20
	//    3    7:aload_0         
	//    4    8:getfield        #62  <Field ConnectionResult zzaAE>
	//    5   11:invokevirtual   #312 <Method int ConnectionResult.getErrorCode()>
	//    6   14:iconst_4        
	//    7   15:icmpne          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private PendingIntent zzvT()
	{
		if(zzaAB == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field com.google.android.gms.common.api.Api$zze zzaAB>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return PendingIntent.getActivity(mContext, zzaAw.getSessionId(), zzaAB.zzrs(), 0x8000000);
	//    5    9:aload_0         
	//    6   10:getfield        #68  <Field Context mContext>
	//    7   13:aload_0         
	//    8   14:getfield        #70  <Field zzaat zzaAw>
	//    9   17:invokevirtual   #318 <Method int zzaat.getSessionId()>
	//   10   20:aload_0         
	//   11   21:getfield        #76  <Field com.google.android.gms.common.api.Api$zze zzaAB>
	//   12   24:invokeinterface #321 <Method android.content.Intent com.google.android.gms.common.api.Api$zze.zzrs()>
	//   13   29:ldc2            #322 <Int 0x8000000>
	//   14   32:invokestatic    #328 <Method PendingIntent PendingIntent.getActivity(Context, int, android.content.Intent, int)>
	//   15   35:areturn         
	}

	public ConnectionResult blockingConnect()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #333 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #334 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #333 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #334 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void connect()
	{
		zzaAH = 2;
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:putfield        #66  <Field int zzaAH>
		zzaAF = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #64  <Field boolean zzaAF>
		zzvO();
	//    6   10:aload_0         
	//    7   11:invokespecial   #339 <Method void zzvO()>
	//    8   14:return          
	}

	public void disconnect()
	{
		zzaAE = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #62  <Field ConnectionResult zzaAE>
		zzaAD = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #60  <Field ConnectionResult zzaAD>
		zzaAH = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #66  <Field int zzaAH>
		zzaAx.disconnect();
	//    9   15:aload_0         
	//   10   16:getfield        #86  <Field zzaav zzaAx>
	//   11   19:invokevirtual   #289 <Method void zzaav.disconnect()>
		zzaAy.disconnect();
	//   12   22:aload_0         
	//   13   23:getfield        #89  <Field zzaav zzaAy>
	//   14   26:invokevirtual   #289 <Method void zzaav.disconnect()>
		zzvR();
	//   15   29:aload_0         
	//   16   30:invokespecial   #212 <Method void zzvR()>
	//   17   33:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.append(((CharSequence) (s))).append("authClient").println(":");
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #347 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    3    5:ldc2            #349 <String "authClient">
	//    4    8:invokevirtual   #347 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    5   11:ldc2            #351 <String ":">
	//    6   14:invokevirtual   #354 <Method void PrintWriter.println(String)>
		zzaAy.dump(String.valueOf(((Object) (s))).concat("  "), filedescriptor, printwriter, as);
	//    7   17:aload_0         
	//    8   18:getfield        #89  <Field zzaav zzaAy>
	//    9   21:aload_1         
	//   10   22:invokestatic    #360 <Method String String.valueOf(Object)>
	//   11   25:ldc2            #362 <String "  ">
	//   12   28:invokevirtual   #366 <Method String String.concat(String)>
	//   13   31:aload_2         
	//   14   32:aload_3         
	//   15   33:aload           4
	//   16   35:invokevirtual   #368 <Method void zzaav.dump(String, FileDescriptor, PrintWriter, String[])>
		printwriter.append(((CharSequence) (s))).append("anonClient").println(":");
	//   17   38:aload_3         
	//   18   39:aload_1         
	//   19   40:invokevirtual   #347 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   20   43:ldc2            #370 <String "anonClient">
	//   21   46:invokevirtual   #347 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   22   49:ldc2            #351 <String ":">
	//   23   52:invokevirtual   #354 <Method void PrintWriter.println(String)>
		zzaAx.dump(String.valueOf(((Object) (s))).concat("  "), filedescriptor, printwriter, as);
	//   24   55:aload_0         
	//   25   56:getfield        #86  <Field zzaav zzaAx>
	//   26   59:aload_1         
	//   27   60:invokestatic    #360 <Method String String.valueOf(Object)>
	//   28   63:ldc2            #362 <String "  ">
	//   29   66:invokevirtual   #366 <Method String String.concat(String)>
	//   30   69:aload_2         
	//   31   70:aload_3         
	//   32   71:aload           4
	//   33   73:invokevirtual   #368 <Method void zzaav.dump(String, FileDescriptor, PrintWriter, String[])>
	//   34   76:return          
	}

	public ConnectionResult getConnectionResult(Api api)
	{
		if(((Object) ((zzaav)zzaAz.get(((Object) (api.zzvg()))))).equals(((Object) (zzaAy))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field Map zzaAz>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #167 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//*   4    8:invokeinterface #175 <Method Object Map.get(Object)>
	//*   5   13:checkcast       #78  <Class zzaav>
	//*   6   16:aload_0         
	//*   7   17:getfield        #89  <Field zzaav zzaAy>
	//*   8   20:invokevirtual   #258 <Method boolean Object.equals(Object)>
	//*   9   23:ifeq            55
		{
			if(zzvS())
	//*  10   26:aload_0         
	//*  11   27:invokespecial   #281 <Method boolean zzvS()>
	//*  12   30:ifeq            46
				return new ConnectionResult(4, zzvT());
	//   13   33:new             #244 <Class ConnectionResult>
	//   14   36:dup             
	//   15   37:iconst_4        
	//   16   38:aload_0         
	//   17   39:invokespecial   #374 <Method PendingIntent zzvT()>
	//   18   42:invokespecial   #377 <Method void ConnectionResult(int, PendingIntent)>
	//   19   45:areturn         
			else
				return zzaAy.getConnectionResult(api);
	//   20   46:aload_0         
	//   21   47:getfield        #89  <Field zzaav zzaAy>
	//   22   50:aload_1         
	//   23   51:invokevirtual   #379 <Method ConnectionResult zzaav.getConnectionResult(Api)>
	//   24   54:areturn         
		} else
		{
			return zzaAx.getConnectionResult(api);
	//   25   55:aload_0         
	//   26   56:getfield        #86  <Field zzaav zzaAx>
	//   27   59:aload_1         
	//   28   60:invokevirtual   #379 <Method ConnectionResult zzaav.getConnectionResult(Api)>
	//   29   63:areturn         
		}
	}

	public boolean isConnected()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Lock zzaAG>
	//    2    4:invokeinterface #386 <Method void Lock.lock()>
		int i;
		if(!zzaAx.isConnected())
			break MISSING_BLOCK_LABEL_48;
	//    3    9:aload_0         
	//    4   10:getfield        #86  <Field zzaav zzaAx>
	//    5   13:invokevirtual   #388 <Method boolean zzaav.isConnected()>
	//    6   16:ifeq            48
		if(zzvN() || zzvS())
			break MISSING_BLOCK_LABEL_43;
	//    7   19:aload_0         
	//    8   20:invokevirtual   #391 <Method boolean zzvN()>
	//    9   23:ifne            43
	//   10   26:aload_0         
	//   11   27:invokespecial   #281 <Method boolean zzvS()>
	//   12   30:ifne            43
		i = zzaAH;
	//   13   33:aload_0         
	//   14   34:getfield        #66  <Field int zzaAH>
	//   15   37:istore_1        
		if(i != 1)
			break MISSING_BLOCK_LABEL_48;
	//   16   38:iload_1         
	//   17   39:iconst_1        
	//   18   40:icmpne          48
		boolean flag;
		flag = true;
	//   19   43:iconst_1        
	//   20   44:istore_2        
		break MISSING_BLOCK_LABEL_50;
	//   21   45:goto            50
		flag = false;
	//   22   48:iconst_0        
	//   23   49:istore_2        
		zzaAG.unlock();
	//   24   50:aload_0         
	//   25   51:getfield        #72  <Field Lock zzaAG>
	//   26   54:invokeinterface #394 <Method void Lock.unlock()>
		return flag;
	//   27   59:iload_2         
	//   28   60:ireturn         
		Exception exception;
		exception;
	//   29   61:astore_3        
		zzaAG.unlock();
	//   30   62:aload_0         
	//   31   63:getfield        #72  <Field Lock zzaAG>
	//   32   66:invokeinterface #394 <Method void Lock.unlock()>
		throw exception;
	//   33   71:aload_3         
	//   34   72:athrow          
	}

	public boolean isConnecting()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Lock zzaAG>
	//    2    4:invokeinterface #386 <Method void Lock.lock()>
		int i = zzaAH;
	//    3    9:aload_0         
	//    4   10:getfield        #66  <Field int zzaAH>
	//    5   13:istore_1        
		boolean flag;
		if(i == 2)
	//*   6   14:iload_1         
	//*   7   15:iconst_2        
	//*   8   16:icmpne          24
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_2        
		else
	//*  11   21:goto            26
			flag = false;
	//   12   24:iconst_0        
	//   13   25:istore_2        
		zzaAG.unlock();
	//   14   26:aload_0         
	//   15   27:getfield        #72  <Field Lock zzaAG>
	//   16   30:invokeinterface #394 <Method void Lock.unlock()>
		return flag;
	//   17   35:iload_2         
	//   18   36:ireturn         
		Exception exception;
		exception;
	//   19   37:astore_3        
		zzaAG.unlock();
	//   20   38:aload_0         
	//   21   39:getfield        #72  <Field Lock zzaAG>
	//   22   42:invokeinterface #394 <Method void Lock.unlock()>
		throw exception;
	//   23   47:aload_3         
	//   24   48:athrow          
	}

	public zzaad.zza zza(zzaad.zza zza1)
	{
		if(zzc(zza1))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #398 <Method boolean zzc(zzaad$zza)>
	//*   3    5:ifeq            43
		{
			if(zzvS())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #281 <Method boolean zzvS()>
	//*   6   12:ifeq            34
			{
				zza1.zzB(new Status(4, ((String) (null)), zzvT()));
	//    7   15:aload_1         
	//    8   16:new             #400 <Class Status>
	//    9   19:dup             
	//   10   20:iconst_4        
	//   11   21:aconst_null     
	//   12   22:aload_0         
	//   13   23:invokespecial   #374 <Method PendingIntent zzvT()>
	//   14   26:invokespecial   #403 <Method void Status(int, String, PendingIntent)>
	//   15   29:invokevirtual   #407 <Method void zzaad$zza.zzB(Status)>
				return zza1;
	//   16   32:aload_1         
	//   17   33:areturn         
			} else
			{
				return zzaAy.zza(zza1);
	//   18   34:aload_0         
	//   19   35:getfield        #89  <Field zzaav zzaAy>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #409 <Method zzaad$zza zzaav.zza(zzaad$zza)>
	//   22   42:areturn         
			}
		} else
		{
			return zzaAx.zza(zza1);
	//   23   43:aload_0         
	//   24   44:getfield        #86  <Field zzaav zzaAx>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #409 <Method zzaad$zza zzaav.zza(zzaad$zza)>
	//   27   51:areturn         
		}
	}

	public boolean zza(zzabq zzabq1)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Lock zzaAG>
	//    2    4:invokeinterface #386 <Method void Lock.lock()>
		if(!isConnecting() && !isConnected() || zzvN())
			break MISSING_BLOCK_LABEL_76;
	//    3    9:aload_0         
	//    4   10:invokevirtual   #413 <Method boolean isConnecting()>
	//    5   13:ifne            23
	//    6   16:aload_0         
	//    7   17:invokevirtual   #414 <Method boolean isConnected()>
	//    8   20:ifeq            76
	//    9   23:aload_0         
	//   10   24:invokevirtual   #391 <Method boolean zzvN()>
	//   11   27:ifne            76
		zzaAA.add(((Object) (zzabq1)));
	//   12   30:aload_0         
	//   13   31:getfield        #58  <Field Set zzaAA>
	//   14   34:aload_1         
	//   15   35:invokeinterface #415 <Method boolean Set.add(Object)>
	//   16   40:pop             
		if(zzaAH == 0)
	//*  17   41:aload_0         
	//*  18   42:getfield        #66  <Field int zzaAH>
	//*  19   45:ifne            53
			zzaAH = 1;
	//   20   48:aload_0         
	//   21   49:iconst_1        
	//   22   50:putfield        #66  <Field int zzaAH>
		zzaAE = null;
	//   23   53:aload_0         
	//   24   54:aconst_null     
	//   25   55:putfield        #62  <Field ConnectionResult zzaAE>
		zzaAy.connect();
	//   26   58:aload_0         
	//   27   59:getfield        #89  <Field zzaav zzaAy>
	//   28   62:invokevirtual   #276 <Method void zzaav.connect()>
		zzaAG.unlock();
	//   29   65:aload_0         
	//   30   66:getfield        #72  <Field Lock zzaAG>
	//   31   69:invokeinterface #394 <Method void Lock.unlock()>
		return true;
	//   32   74:iconst_1        
	//   33   75:ireturn         
		zzaAG.unlock();
	//   34   76:aload_0         
	//   35   77:getfield        #72  <Field Lock zzaAG>
	//   36   80:invokeinterface #394 <Method void Lock.unlock()>
		break MISSING_BLOCK_LABEL_100;
	//   37   85:goto            100
		zzabq1;
	//   38   88:astore_1        
		zzaAG.unlock();
	//   39   89:aload_0         
	//   40   90:getfield        #72  <Field Lock zzaAG>
	//   41   93:invokeinterface #394 <Method void Lock.unlock()>
		throw zzabq1;
	//   42   98:aload_1         
	//   43   99:athrow          
		return false;
	//   44  100:iconst_0        
	//   45  101:ireturn         
	}

	public zzaad.zza zzb(zzaad.zza zza1)
	{
		if(zzc(zza1))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #398 <Method boolean zzc(zzaad$zza)>
	//*   3    5:ifeq            43
		{
			if(zzvS())
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #281 <Method boolean zzvS()>
	//*   6   12:ifeq            34
			{
				zza1.zzB(new Status(4, ((String) (null)), zzvT()));
	//    7   15:aload_1         
	//    8   16:new             #400 <Class Status>
	//    9   19:dup             
	//   10   20:iconst_4        
	//   11   21:aconst_null     
	//   12   22:aload_0         
	//   13   23:invokespecial   #374 <Method PendingIntent zzvT()>
	//   14   26:invokespecial   #403 <Method void Status(int, String, PendingIntent)>
	//   15   29:invokevirtual   #407 <Method void zzaad$zza.zzB(Status)>
				return zza1;
	//   16   32:aload_1         
	//   17   33:areturn         
			} else
			{
				return zzaAy.zzb(zza1);
	//   18   34:aload_0         
	//   19   35:getfield        #89  <Field zzaav zzaAy>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #417 <Method zzaad$zza zzaav.zzb(zzaad$zza)>
	//   22   42:areturn         
			}
		} else
		{
			return zzaAx.zzb(zza1);
	//   23   43:aload_0         
	//   24   44:getfield        #86  <Field zzaav zzaAx>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #417 <Method zzaad$zza zzaav.zzb(zzaad$zza)>
	//   27   51:areturn         
		}
	}

	public void zzvM()
	{
		zzaAx.zzvM();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field zzaav zzaAx>
	//    2    4:invokevirtual   #421 <Method void zzaav.zzvM()>
		zzaAy.zzvM();
	//    3    7:aload_0         
	//    4    8:getfield        #89  <Field zzaav zzaAy>
	//    5   11:invokevirtual   #421 <Method void zzaav.zzvM()>
	//    6   14:return          
	}

	public boolean zzvN()
	{
		return zzaAy.isConnected();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field zzaav zzaAy>
	//    2    4:invokevirtual   #388 <Method boolean zzaav.isConnected()>
	//    3    7:ireturn         
	}

	public void zzvn()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Lock zzaAG>
	//    2    4:invokeinterface #386 <Method void Lock.lock()>
		boolean flag;
		flag = isConnecting();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #413 <Method boolean isConnecting()>
	//    5   13:istore_1        
		zzaAy.disconnect();
	//    6   14:aload_0         
	//    7   15:getfield        #89  <Field zzaav zzaAy>
	//    8   18:invokevirtual   #289 <Method void zzaav.disconnect()>
		zzaAE = new ConnectionResult(4);
	//    9   21:aload_0         
	//   10   22:new             #244 <Class ConnectionResult>
	//   11   25:dup             
	//   12   26:iconst_4        
	//   13   27:invokespecial   #425 <Method void ConnectionResult(int)>
	//   14   30:putfield        #62  <Field ConnectionResult zzaAE>
		if(!flag)
			break MISSING_BLOCK_LABEL_63;
	//   15   33:iload_1         
	//   16   34:ifeq            63
		(new Handler(zzrs)).post(new Runnable() {

			public void run()
			{
				zzaai.zza(zzaAI).lock();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field zzaai zzaAI>
			//    2    4:invokestatic    #25  <Method Lock zzaai.zza(zzaai)>
			//    3    7:invokeinterface #30  <Method void Lock.lock()>
				zzaai.zzb(zzaAI);
			//    4   12:aload_0         
			//    5   13:getfield        #17  <Field zzaai zzaAI>
			//    6   16:invokestatic    #33  <Method void zzaai.zzb(zzaai)>
				zzaai.zza(zzaAI).unlock();
			//    7   19:aload_0         
			//    8   20:getfield        #17  <Field zzaai zzaAI>
			//    9   23:invokestatic    #25  <Method Lock zzaai.zza(zzaai)>
			//   10   26:invokeinterface #36  <Method void Lock.unlock()>
				return;
			//   11   31:return          
				Exception exception1;
				exception1;
			//   12   32:astore_1        
				zzaai.zza(zzaAI).unlock();
			//   13   33:aload_0         
			//   14   34:getfield        #17  <Field zzaai zzaAI>
			//   15   37:invokestatic    #25  <Method Lock zzaai.zza(zzaai)>
			//   16   40:invokeinterface #36  <Method void Lock.unlock()>
				throw exception1;
			//   17   45:aload_1         
			//   18   46:athrow          
			}

			final zzaai zzaAI;

			
			{
				zzaAI = zzaai.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field zzaai zzaAI>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   17   37:new             #427 <Class Handler>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:getfield        #74  <Field Looper zzrs>
	//   21   45:invokespecial   #430 <Method void Handler(Looper)>
	//   22   48:new             #8   <Class zzaai$1>
	//   23   51:dup             
	//   24   52:aload_0         
	//   25   53:invokespecial   #432 <Method void zzaai$1(zzaai)>
	//   26   56:invokevirtual   #436 <Method boolean Handler.post(Runnable)>
	//   27   59:pop             
		break MISSING_BLOCK_LABEL_67;
	//   28   60:goto            67
		zzvR();
	//   29   63:aload_0         
	//   30   64:invokespecial   #212 <Method void zzvR()>
		zzaAG.unlock();
	//   31   67:aload_0         
	//   32   68:getfield        #72  <Field Lock zzaAG>
	//   33   71:invokeinterface #394 <Method void Lock.unlock()>
		return;
	//   34   76:return          
		Exception exception;
		exception;
	//   35   77:astore_2        
		zzaAG.unlock();
	//   36   78:aload_0         
	//   37   79:getfield        #72  <Field Lock zzaAG>
	//   38   82:invokeinterface #394 <Method void Lock.unlock()>
		throw exception;
	//   39   87:aload_2         
	//   40   88:athrow          
	}

	private final Context mContext;
	private final Set zzaAA = Collections.newSetFromMap(((Map) (new WeakHashMap())));
	private final com.google.android.gms.common.api.Api.zze zzaAB;
	private Bundle zzaAC;
	private ConnectionResult zzaAD;
	private ConnectionResult zzaAE;
	private boolean zzaAF;
	private final Lock zzaAG;
	private int zzaAH;
	private final zzaat zzaAw;
	private final zzaav zzaAx;
	private final zzaav zzaAy;
	private final Map zzaAz;
	private final Looper zzrs;
}
