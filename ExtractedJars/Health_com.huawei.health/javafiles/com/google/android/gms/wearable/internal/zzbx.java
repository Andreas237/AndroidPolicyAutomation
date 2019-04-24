// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcy, zzcx, zzbw, zzck, 
//			zzc

final class zzbx
{
	static class zza extends zzcw.zzb
	{

		public void zza(Status status)
		{
			Map map;
			Object obj;
			map = (Map)zzbUE.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference zzbUE>
		//    2    4:invokevirtual   #35  <Method Object WeakReference.get()>
		//    3    7:checkcast       #37  <Class Map>
		//    4   10:astore_2        
			obj = zzbUF.get();
		//    5   11:aload_0         
		//    6   12:getfield        #27  <Field WeakReference zzbUF>
		//    7   15:invokevirtual   #35  <Method Object WeakReference.get()>
		//    8   18:astore_3        
			if(status.getStatus().isSuccess() || map == null || obj == null)
				break MISSING_BLOCK_LABEL_68;
		//    9   19:aload_1         
		//   10   20:invokevirtual   #43  <Method Status Status.getStatus()>
		//   11   23:invokevirtual   #47  <Method boolean Status.isSuccess()>
		//   12   26:ifne            68
		//   13   29:aload_2         
		//   14   30:ifnull          68
		//   15   33:aload_3         
		//   16   34:ifnull          68
			map;
		//   17   37:aload_2         
			JVM INSTR monitorenter ;
		//   18   38:monitorenter    
			obj = ((Object) ((zzcy)map.remove(obj)));
		//   19   39:aload_2         
		//   20   40:aload_3         
		//   21   41:invokeinterface #51  <Method Object Map.remove(Object)>
		//   22   46:checkcast       #53  <Class zzcy>
		//   23   49:astore_3        
			if(obj == null)
				break MISSING_BLOCK_LABEL_58;
		//   24   50:aload_3         
		//   25   51:ifnull          58
			((zzcy) (obj)).clear();
		//   26   54:aload_3         
		//   27   55:invokevirtual   #57  <Method void zzcy.clear()>
			map;
		//   28   58:aload_2         
			JVM INSTR monitorexit ;
		//   29   59:monitorexit     
			break MISSING_BLOCK_LABEL_68;
		//   30   60:goto            68
			status;
		//   31   63:astore_1        
		//*  32   64:aload_2         
			throw status;
		//   33   65:monitorexit     
		//   34   66:aload_1         
		//   35   67:athrow          
			zzaa(((Object) (status)));
		//   36   68:aload_0         
		//   37   69:aload_1         
		//   38   70:invokevirtual   #60  <Method void zzaa(Object)>
			return;
		//   39   73:return          
		}

		private WeakReference zzbUE;
		private WeakReference zzbUF;

		zza(Map map, Object obj, com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:invokespecial   #18  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
			zzbUE = new WeakReference(((Object) (map)));
		//    3    5:aload_0         
		//    4    6:new             #20  <Class WeakReference>
		//    5    9:dup             
		//    6   10:aload_1         
		//    7   11:invokespecial   #23  <Method void WeakReference(Object)>
		//    8   14:putfield        #25  <Field WeakReference zzbUE>
			zzbUF = new WeakReference(obj);
		//    9   17:aload_0         
		//   10   18:new             #20  <Class WeakReference>
		//   11   21:dup             
		//   12   22:aload_2         
		//   13   23:invokespecial   #23  <Method void WeakReference(Object)>
		//   14   26:putfield        #27  <Field WeakReference zzbUF>
		//   15   29:return          
		}
	}

	static class zzb extends zzcw.zzb
	{

		public void zza(Status status)
		{
			Map map;
			Object obj;
			map = (Map)zzbUE.get();
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field WeakReference zzbUE>
		//    2    4:invokevirtual   #36  <Method Object WeakReference.get()>
		//    3    7:checkcast       #38  <Class Map>
		//    4   10:astore_2        
			obj = zzbUF.get();
		//    5   11:aload_0         
		//    6   12:getfield        #27  <Field WeakReference zzbUF>
		//    7   15:invokevirtual   #36  <Method Object WeakReference.get()>
		//    8   18:astore_3        
			if(status.getStatus().getStatusCode() != 4002 || map == null || obj == null)
				break MISSING_BLOCK_LABEL_71;
		//    9   19:aload_1         
		//   10   20:invokevirtual   #44  <Method Status Status.getStatus()>
		//   11   23:invokevirtual   #48  <Method int Status.getStatusCode()>
		//   12   26:sipush          4002
		//   13   29:icmpne          71
		//   14   32:aload_2         
		//   15   33:ifnull          71
		//   16   36:aload_3         
		//   17   37:ifnull          71
			map;
		//   18   40:aload_2         
			JVM INSTR monitorenter ;
		//   19   41:monitorenter    
			obj = ((Object) ((zzcy)map.remove(obj)));
		//   20   42:aload_2         
		//   21   43:aload_3         
		//   22   44:invokeinterface #52  <Method Object Map.remove(Object)>
		//   23   49:checkcast       #54  <Class zzcy>
		//   24   52:astore_3        
			if(obj == null)
				break MISSING_BLOCK_LABEL_61;
		//   25   53:aload_3         
		//   26   54:ifnull          61
			((zzcy) (obj)).clear();
		//   27   57:aload_3         
		//   28   58:invokevirtual   #58  <Method void zzcy.clear()>
			map;
		//   29   61:aload_2         
			JVM INSTR monitorexit ;
		//   30   62:monitorexit     
			break MISSING_BLOCK_LABEL_71;
		//   31   63:goto            71
			status;
		//   32   66:astore_1        
		//*  33   67:aload_2         
			throw status;
		//   34   68:monitorexit     
		//   35   69:aload_1         
		//   36   70:athrow          
			zzaa(((Object) (status)));
		//   37   71:aload_0         
		//   38   72:aload_1         
		//   39   73:invokevirtual   #61  <Method void zzaa(Object)>
			return;
		//   40   76:return          
		}

		private WeakReference zzbUE;
		private WeakReference zzbUF;

		zzb(Map map, Object obj, com.google.android.gms.internal.zzaad.zzb zzb1)
		{
			super(zzb1);
		//    0    0:aload_0         
		//    1    1:aload_3         
		//    2    2:invokespecial   #18  <Method void zzcw$zzb(com.google.android.gms.internal.zzaad$zzb)>
			zzbUE = new WeakReference(((Object) (map)));
		//    3    5:aload_0         
		//    4    6:new             #20  <Class WeakReference>
		//    5    9:dup             
		//    6   10:aload_1         
		//    7   11:invokespecial   #23  <Method void WeakReference(Object)>
		//    8   14:putfield        #25  <Field WeakReference zzbUE>
			zzbUF = new WeakReference(obj);
		//    9   17:aload_0         
		//   10   18:new             #20  <Class WeakReference>
		//   11   21:dup             
		//   12   22:aload_2         
		//   13   23:invokespecial   #23  <Method void WeakReference(Object)>
		//   14   26:putfield        #27  <Field WeakReference zzbUF>
		//   15   29:return          
		}
	}


	zzbx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void HashMap()>
	//    6   12:putfield        #23  <Field Map zzaWg>
	//    7   15:return          
	}

	public void zza(zzcx zzcx1, com.google.android.gms.internal.zzaad.zzb zzb1, Object obj)
		throws RemoteException
	{
		Map map = zzaWg;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Map zzaWg>
	//    2    4:astore          4
		map;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		zzcy zzcy1 = (zzcy)zzaWg.remove(obj);
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field Map zzaWg>
	//    7   13:aload_3         
	//    8   14:invokeinterface #33  <Method Object Map.remove(Object)>
	//    9   19:checkcast       #35  <Class zzcy>
	//   10   22:astore          5
		if(zzcy1 != null)
			break MISSING_BLOCK_LABEL_49;
	//   11   24:aload           5
	//   12   26:ifnonnull       49
		zzb1.setResult(((Object) (new Status(4002))));
	//   13   29:aload_2         
	//   14   30:new             #37  <Class Status>
	//   15   33:dup             
	//   16   34:sipush          4002
	//   17   37:invokespecial   #40  <Method void Status(int)>
	//   18   40:invokeinterface #46  <Method void com.google.android.gms.internal.zzaad$zzb.setResult(Object)>
		map;
	//   19   45:aload           4
		JVM INSTR monitorexit ;
	//   20   47:monitorexit     
		return;
	//   21   48:return          
		zzcy1.clear();
	//   22   49:aload           5
	//   23   51:invokevirtual   #49  <Method void zzcy.clear()>
		((zzbw)zzcx1.zzxD()).zza(((zzbu) (new zzb(zzaWg, obj, zzb1))), new zzck(((zzbv) (zzcy1))));
	//   24   54:aload_1         
	//   25   55:invokevirtual   #55  <Method android.os.IInterface zzcx.zzxD()>
	//   26   58:checkcast       #57  <Class zzbw>
	//   27   61:new             #10  <Class zzbx$zzb>
	//   28   64:dup             
	//   29   65:aload_0         
	//   30   66:getfield        #23  <Field Map zzaWg>
	//   31   69:aload_3         
	//   32   70:aload_2         
	//   33   71:invokespecial   #60  <Method void zzbx$zzb(Map, Object, com.google.android.gms.internal.zzaad$zzb)>
	//   34   74:new             #62  <Class zzck>
	//   35   77:dup             
	//   36   78:aload           5
	//   37   80:invokespecial   #65  <Method void zzck(zzbv)>
	//   38   83:invokeinterface #68  <Method void zzbw.zza(zzbu, zzck)>
		map;
	//   39   88:aload           4
		JVM INSTR monitorexit ;
	//   40   90:monitorexit     
		return;
	//   41   91:return          
		zzcx1;
	//   42   92:astore_1        
	//*  43   93:aload           4
		throw zzcx1;
	//   44   95:monitorexit     
	//   45   96:aload_1         
	//   46   97:athrow          
	}

	public void zza(zzcx zzcx1, com.google.android.gms.internal.zzaad.zzb zzb1, Object obj, zzcy zzcy1)
		throws RemoteException
	{
		Map map = zzaWg;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Map zzaWg>
	//    2    4:astore          5
		map;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(zzaWg.get(obj) == null)
			break MISSING_BLOCK_LABEL_42;
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field Map zzaWg>
	//    7   13:aload_3         
	//    8   14:invokeinterface #75  <Method Object Map.get(Object)>
	//    9   19:ifnull          42
		zzb1.setResult(((Object) (new Status(4001))));
	//   10   22:aload_2         
	//   11   23:new             #37  <Class Status>
	//   12   26:dup             
	//   13   27:sipush          4001
	//   14   30:invokespecial   #40  <Method void Status(int)>
	//   15   33:invokeinterface #46  <Method void com.google.android.gms.internal.zzaad$zzb.setResult(Object)>
		map;
	//   16   38:aload           5
		JVM INSTR monitorexit ;
	//   17   40:monitorexit     
		return;
	//   18   41:return          
		zzaWg.put(obj, ((Object) (zzcy1)));
	//   19   42:aload_0         
	//   20   43:getfield        #23  <Field Map zzaWg>
	//   21   46:aload_3         
	//   22   47:aload           4
	//   23   49:invokeinterface #79  <Method Object Map.put(Object, Object)>
	//   24   54:pop             
		try
		{
			((zzbw)zzcx1.zzxD()).zza(((zzbu) (new zza(zzaWg, obj, zzb1))), new zzc(zzcy1));
	//   25   55:aload_1         
	//   26   56:invokevirtual   #55  <Method android.os.IInterface zzcx.zzxD()>
	//   27   59:checkcast       #57  <Class zzbw>
	//   28   62:new             #7   <Class zzbx$zza>
	//   29   65:dup             
	//   30   66:aload_0         
	//   31   67:getfield        #23  <Field Map zzaWg>
	//   32   70:aload_3         
	//   33   71:aload_2         
	//   34   72:invokespecial   #80  <Method void zzbx$zza(Map, Object, com.google.android.gms.internal.zzaad$zzb)>
	//   35   75:new             #82  <Class zzc>
	//   36   78:dup             
	//   37   79:aload           4
	//   38   81:invokespecial   #85  <Method void zzc(zzcy)>
	//   39   84:invokeinterface #88  <Method void zzbw.zza(zzbu, zzc)>
			break MISSING_BLOCK_LABEL_106;
	//   40   89:goto            106
		}
		// Misplaced declaration of an exception variable
		catch(zzcx zzcx1) { }
	//   41   92:astore_1        
		zzaWg.remove(obj);
	//   42   93:aload_0         
	//   43   94:getfield        #23  <Field Map zzaWg>
	//   44   97:aload_3         
	//   45   98:invokeinterface #33  <Method Object Map.remove(Object)>
	//   46  103:pop             
		throw zzcx1;
	//   47  104:aload_1         
	//   48  105:athrow          
		map;
	//   49  106:aload           5
		JVM INSTR monitorexit ;
	//   50  108:monitorexit     
		return;
	//   51  109:return          
		zzcx1;
	//   52  110:astore_1        
	//*  53  111:aload           5
		throw zzcx1;
	//   54  113:monitorexit     
	//   55  114:aload_1         
	//   56  115:athrow          
	}

	public void zzfE(IBinder ibinder)
	{
		Map map = zzaWg;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Map zzaWg>
	//    2    4:astore_3        
		map;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		zzcw.zzo zzo;
		Iterator iterator;
		ibinder = ((IBinder) (zzbw.zza.zzfD(ibinder)));
	//    5    7:aload_1         
	//    6    8:invokestatic    #97  <Method zzbw zzbw$zza.zzfD(IBinder)>
	//    7   11:astore_1        
		zzo = new zzcw.zzo();
	//    8   12:new             #99  <Class zzcw$zzo>
	//    9   15:dup             
	//   10   16:invokespecial   #100 <Method void zzcw$zzo()>
	//   11   19:astore          4
		iterator = zzaWg.entrySet().iterator();
	//   12   21:aload_0         
	//   13   22:getfield        #23  <Field Map zzaWg>
	//   14   25:invokeinterface #104 <Method Set Map.entrySet()>
	//   15   30:invokeinterface #110 <Method Iterator Set.iterator()>
	//   16   35:astore          5
_L3:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//   17   37:aload           5
	//   18   39:invokeinterface #116 <Method boolean Iterator.hasNext()>
	//   19   44:ifeq            257
_L1:
		Object obj;
		Object obj1;
		obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   20   47:aload           5
	//   21   49:invokeinterface #120 <Method Object Iterator.next()>
	//   22   54:checkcast       #122 <Class java.util.Map$Entry>
	//   23   57:astore          7
		obj = ((Object) ((zzcy)((java.util.Map.Entry) (obj1)).getValue()));
	//   24   59:aload           7
	//   25   61:invokeinterface #125 <Method Object java.util.Map$Entry.getValue()>
	//   26   66:checkcast       #35  <Class zzcy>
	//   27   69:astore          6
		((zzbw) (ibinder)).zza(((zzbu) (zzo)), new zzc(((zzcy) (obj))));
	//   28   71:aload_1         
	//   29   72:aload           4
	//   30   74:new             #82  <Class zzc>
	//   31   77:dup             
	//   32   78:aload           6
	//   33   80:invokespecial   #85  <Method void zzc(zzcy)>
	//   34   83:invokeinterface #88  <Method void zzbw.zza(zzbu, zzc)>
		if(Log.isLoggable("WearableClient", 2))
	//*  35   88:ldc1            #127 <String "WearableClient">
	//*  36   90:iconst_2        
	//*  37   91:invokestatic    #133 <Method boolean Log.isLoggable(String, int)>
	//*  38   94:ifeq            174
		{
			String s = String.valueOf(((java.util.Map.Entry) (obj1)).getKey());
	//   39   97:aload           7
	//   40   99:invokeinterface #136 <Method Object java.util.Map$Entry.getKey()>
	//   41  104:invokestatic    #142 <Method String String.valueOf(Object)>
	//   42  107:astore          8
			String s1 = String.valueOf(obj);
	//   43  109:aload           6
	//   44  111:invokestatic    #142 <Method String String.valueOf(Object)>
	//   45  114:astore          9
			int i = String.valueOf(((Object) (s))).length();
	//   46  116:aload           8
	//   47  118:invokestatic    #142 <Method String String.valueOf(Object)>
	//   48  121:invokevirtual   #146 <Method int String.length()>
	//   49  124:istore_2        
			Log.d("WearableClient", (new StringBuilder(String.valueOf(((Object) (s1))).length() + (i + 27))).append("onPostInitHandler: added: ").append(s).append("/").append(s1).toString());
	//   50  125:ldc1            #127 <String "WearableClient">
	//   51  127:new             #148 <Class StringBuilder>
	//   52  130:dup             
	//   53  131:aload           9
	//   54  133:invokestatic    #142 <Method String String.valueOf(Object)>
	//   55  136:invokevirtual   #146 <Method int String.length()>
	//   56  139:iload_2         
	//   57  140:bipush          27
	//   58  142:iadd            
	//   59  143:iadd            
	//   60  144:invokespecial   #149 <Method void StringBuilder(int)>
	//   61  147:ldc1            #151 <String "onPostInitHandler: added: ">
	//   62  149:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   63  152:aload           8
	//   64  154:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   65  157:ldc1            #157 <String "/">
	//   66  159:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   67  162:aload           9
	//   68  164:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   69  167:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   70  170:invokestatic    #165 <Method int Log.d(String, String)>
	//   71  173:pop             
		}
		  goto _L3
	//*  72  174:goto            254
_L4:
		obj1 = ((Object) (String.valueOf(((java.util.Map.Entry) (obj1)).getKey())));
	//   73  177:aload           7
	//   74  179:invokeinterface #136 <Method Object java.util.Map$Entry.getKey()>
	//   75  184:invokestatic    #142 <Method String String.valueOf(Object)>
	//   76  187:astore          7
		obj = ((Object) (String.valueOf(obj)));
	//   77  189:aload           6
	//   78  191:invokestatic    #142 <Method String String.valueOf(Object)>
	//   79  194:astore          6
		int j = String.valueOf(obj1).length();
	//   80  196:aload           7
	//   81  198:invokestatic    #142 <Method String String.valueOf(Object)>
	//   82  201:invokevirtual   #146 <Method int String.length()>
	//   83  204:istore_2        
		Log.d("WearableClient", (new StringBuilder(String.valueOf(obj).length() + (j + 32))).append("onPostInitHandler: Didn't add: ").append(((String) (obj1))).append("/").append(((String) (obj))).toString());
	//   84  205:ldc1            #127 <String "WearableClient">
	//   85  207:new             #148 <Class StringBuilder>
	//   86  210:dup             
	//   87  211:aload           6
	//   88  213:invokestatic    #142 <Method String String.valueOf(Object)>
	//   89  216:invokevirtual   #146 <Method int String.length()>
	//   90  219:iload_2         
	//   91  220:bipush          32
	//   92  222:iadd            
	//   93  223:iadd            
	//   94  224:invokespecial   #149 <Method void StringBuilder(int)>
	//   95  227:ldc1            #167 <String "onPostInitHandler: Didn't add: ">
	//   96  229:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   97  232:aload           7
	//   98  234:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//   99  237:ldc1            #157 <String "/">
	//  100  239:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//  101  242:aload           6
	//  102  244:invokevirtual   #155 <Method StringBuilder StringBuilder.append(String)>
	//  103  247:invokevirtual   #161 <Method String StringBuilder.toString()>
	//  104  250:invokestatic    #165 <Method int Log.d(String, String)>
	//  105  253:pop             
		  goto _L3
	//* 106  254:goto            37
_L2:
		map;
	//  107  257:aload_3         
		JVM INSTR monitorexit ;
	//  108  258:monitorexit     
		return;
	//  109  259:return          
		ibinder;
	//  110  260:astore_1        
	//* 111  261:aload_3         
		throw ibinder;
	//  112  262:monitorexit     
	//  113  263:aload_1         
	//  114  264:athrow          
		RemoteException remoteexception;
		remoteexception;
	//  115  265:astore          8
		  goto _L4
	//* 116  267:goto            177
	}

	private final Map zzaWg = new HashMap();
}
