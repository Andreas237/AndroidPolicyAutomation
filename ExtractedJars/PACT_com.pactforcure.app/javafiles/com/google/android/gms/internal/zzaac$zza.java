// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.zzb;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaac, zzaal

private class zzaac$zza
	implements OnFailureListener, OnSuccessListener
{

	private ConnectionResult zzvs()
	{
		int i;
		ConnectionResult connectionresult;
		Iterator iterator;
		connectionresult = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_1        
		iterator = com.google.android.gms.internal.zzaac.zzg(zzazB).keySet().iterator();
	//    4    5:aload_0         
	//    5    6:getfield        #18  <Field zzaac zzazB>
	//    6    9:invokestatic    #32  <Method Map com.google.android.gms.internal.zzaac.zzg(zzaac)>
	//    7   12:invokeinterface #38  <Method Set Map.keySet()>
	//    8   17:invokeinterface #44  <Method Iterator Set.iterator()>
	//    9   22:astore          7
_L3:
		if(!iterator.hasNext()) goto _L2; else goto _L1
	//   10   24:aload           7
	//   11   26:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   12   31:ifeq            191
_L1:
		Object obj = ((Object) ((Api)iterator.next()));
	//   13   34:aload           7
	//   14   36:invokeinterface #54  <Method Object Iterator.next()>
	//   15   41:checkcast       #56  <Class Api>
	//   16   44:astore          5
		ConnectionResult connectionresult1 = (ConnectionResult)com.google.android.gms.internal.zzaac.zzc(zzazB).get(((Object) (((zzc)com.google.android.gms.internal.zzaac.zzb(zzazB).get(((Object) (((Api) (obj)).zzuH())))).getApiKey())));
	//   17   46:aload_0         
	//   18   47:getfield        #18  <Field zzaac zzazB>
	//   19   50:invokestatic    #59  <Method Map com.google.android.gms.internal.zzaac.zzc(zzaac)>
	//   20   53:aload_0         
	//   21   54:getfield        #18  <Field zzaac zzazB>
	//   22   57:invokestatic    #62  <Method Map com.google.android.gms.internal.zzaac.zzb(zzaac)>
	//   23   60:aload           5
	//   24   62:invokevirtual   #66  <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//   25   65:invokeinterface #70  <Method Object Map.get(Object)>
	//   26   70:checkcast       #72  <Class zzc>
	//   27   73:invokevirtual   #76  <Method zzzs zzc.getApiKey()>
	//   28   76:invokeinterface #70  <Method Object Map.get(Object)>
	//   29   81:checkcast       #78  <Class ConnectionResult>
	//   30   84:astore          6
		if(!connectionresult1.isSuccess())
	//*  31   86:aload           6
	//*  32   88:invokevirtual   #81  <Method boolean ConnectionResult.isSuccess()>
	//*  33   91:ifne            24
		{
			int j = ((Integer)com.google.android.gms.internal.zzaac.zzg(zzazB).get(obj)).intValue();
	//   34   94:aload_0         
	//   35   95:getfield        #18  <Field zzaac zzazB>
	//   36   98:invokestatic    #32  <Method Map com.google.android.gms.internal.zzaac.zzg(zzaac)>
	//   37  101:aload           5
	//   38  103:invokeinterface #70  <Method Object Map.get(Object)>
	//   39  108:checkcast       #83  <Class Integer>
	//   40  111:invokevirtual   #87  <Method int Integer.intValue()>
	//   41  114:istore_2        
			if(j != 2 && (j != 1 || connectionresult1.hasResolution() || zzaac.zzh(zzazB).isUserResolvableError(connectionresult1.getErrorCode())))
	//*  42  115:iload_2         
	//*  43  116:iconst_2        
	//*  44  117:icmpeq          24
	//*  45  120:iload_2         
	//*  46  121:iconst_1        
	//*  47  122:icmpne          151
	//*  48  125:aload           6
	//*  49  127:invokevirtual   #90  <Method boolean ConnectionResult.hasResolution()>
	//*  50  130:ifne            151
	//*  51  133:aload_0         
	//*  52  134:getfield        #18  <Field zzaac zzazB>
	//*  53  137:invokestatic    #94  <Method com.google.android.gms.common.zzc zzaac.zzh(zzaac)>
	//*  54  140:aload           6
	//*  55  142:invokevirtual   #97  <Method int ConnectionResult.getErrorCode()>
	//*  56  145:invokevirtual   #103 <Method boolean com.google.android.gms.common.zzc.isUserResolvableError(int)>
	//*  57  148:ifeq            24
			{
				int l = ((Api) (obj)).zzuF().getPriority();
	//   58  151:aload           5
	//   59  153:invokevirtual   #107 <Method com.google.android.gms.common.api.Api$zzd Api.zzuF()>
	//   60  156:invokevirtual   #112 <Method int com.google.android.gms.common.api.Api$zzd.getPriority()>
	//   61  159:istore_3        
				int k = l;
	//   62  160:iload_3         
	//   63  161:istore_2        
				obj = ((Object) (connectionresult1));
	//   64  162:aload           6
	//   65  164:astore          5
				if(connectionresult != null)
	//*  66  166:aload           4
	//*  67  168:ifnull          182
					if(i > l)
	//*  68  171:iload_1         
	//*  69  172:iload_3         
	//*  70  173:icmple          194
					{
						obj = ((Object) (connectionresult1));
	//   71  176:aload           6
	//   72  178:astore          5
						k = l;
	//   73  180:iload_3         
	//   74  181:istore_2        
					} else
	//*  75  182:iload_2         
	//*  76  183:istore_1        
	//*  77  184:aload           5
	//*  78  186:astore          4
	//*  79  188:goto            24
	//*  80  191:aload           4
	//*  81  193:areturn         
					{
						k = i;
	//   82  194:iload_1         
	//   83  195:istore_2        
						obj = ((Object) (connectionresult));
	//   84  196:aload           4
	//   85  198:astore          5
					}
				i = k;
				connectionresult = ((ConnectionResult) (obj));
			}
		}
		if(true) goto _L3; else goto _L2
	//   86  200:goto            182
_L2:
		return connectionresult;
	}

	private void zzvt()
	{
		if(zzaac.zzi(zzazB) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field zzaac zzazB>
	//*   2    4:invokestatic    #118 <Method zzg zzaac.zzi(zzaac)>
	//*   3    7:ifnonnull       24
		{
			zzaac.zzd(zzazB).zzaAs = Collections.emptySet();
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field zzaac zzazB>
	//    6   14:invokestatic    #122 <Method zzaal zzaac.zzd(zzaac)>
	//    7   17:invokestatic    #127 <Method Set Collections.emptySet()>
	//    8   20:putfield        #133 <Field Set zzaal.zzaAs>
			return;
	//    9   23:return          
		}
		HashSet hashset = new HashSet(((java.util.Collection) (zzaac.zzi(zzazB).zzxe())));
	//   10   24:new             #135 <Class HashSet>
	//   11   27:dup             
	//   12   28:aload_0         
	//   13   29:getfield        #18  <Field zzaac zzazB>
	//   14   32:invokestatic    #118 <Method zzg zzaac.zzi(zzaac)>
	//   15   35:invokevirtual   #140 <Method Set zzg.zzxe()>
	//   16   38:invokespecial   #143 <Method void HashSet(java.util.Collection)>
	//   17   41:astore_1        
		Map map = zzaac.zzi(zzazB).zzxg();
	//   18   42:aload_0         
	//   19   43:getfield        #18  <Field zzaac zzazB>
	//   20   46:invokestatic    #118 <Method zzg zzaac.zzi(zzaac)>
	//   21   49:invokevirtual   #147 <Method Map zzg.zzxg()>
	//   22   52:astore_2        
		Iterator iterator = map.keySet().iterator();
	//   23   53:aload_2         
	//   24   54:invokeinterface #38  <Method Set Map.keySet()>
	//   25   59:invokeinterface #44  <Method Iterator Set.iterator()>
	//   26   64:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   27   65:aload_3         
	//   28   66:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//   29   71:ifeq            162
			Api api = (Api)iterator.next();
	//   30   74:aload_3         
	//   31   75:invokeinterface #54  <Method Object Iterator.next()>
	//   32   80:checkcast       #56  <Class Api>
	//   33   83:astore          4
			ConnectionResult connectionresult = (ConnectionResult)com.google.android.gms.internal.zzaac.zzc(zzazB).get(((Object) (((zzc)com.google.android.gms.internal.zzaac.zzb(zzazB).get(((Object) (api.zzuH())))).getApiKey())));
	//   34   85:aload_0         
	//   35   86:getfield        #18  <Field zzaac zzazB>
	//   36   89:invokestatic    #59  <Method Map com.google.android.gms.internal.zzaac.zzc(zzaac)>
	//   37   92:aload_0         
	//   38   93:getfield        #18  <Field zzaac zzazB>
	//   39   96:invokestatic    #62  <Method Map com.google.android.gms.internal.zzaac.zzb(zzaac)>
	//   40   99:aload           4
	//   41  101:invokevirtual   #66  <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//   42  104:invokeinterface #70  <Method Object Map.get(Object)>
	//   43  109:checkcast       #72  <Class zzc>
	//   44  112:invokevirtual   #76  <Method zzzs zzc.getApiKey()>
	//   45  115:invokeinterface #70  <Method Object Map.get(Object)>
	//   46  120:checkcast       #78  <Class ConnectionResult>
	//   47  123:astore          5
			if(connectionresult != null && connectionresult.isSuccess())
	//*  48  125:aload           5
	//*  49  127:ifnull          65
	//*  50  130:aload           5
	//*  51  132:invokevirtual   #81  <Method boolean ConnectionResult.isSuccess()>
	//*  52  135:ifeq            65
				((Set) (hashset)).addAll(((java.util.Collection) (((com.google.android.gms.common.internal.zzg.zza)map.get(((Object) (api)))).zzajm)));
	//   53  138:aload_1         
	//   54  139:aload_2         
	//   55  140:aload           4
	//   56  142:invokeinterface #70  <Method Object Map.get(Object)>
	//   57  147:checkcast       #149 <Class com.google.android.gms.common.internal.zzg$zza>
	//   58  150:getfield        #152 <Field Set com.google.android.gms.common.internal.zzg$zza.zzajm>
	//   59  153:invokeinterface #156 <Method boolean Set.addAll(java.util.Collection)>
	//   60  158:pop             
		} while(true);
	//   61  159:goto            65
		zzaac.zzd(zzazB).zzaAs = ((Set) (hashset));
	//   62  162:aload_0         
	//   63  163:getfield        #18  <Field zzaac zzazB>
	//   64  166:invokestatic    #122 <Method zzaal zzaac.zzd(zzaac)>
	//   65  169:aload_1         
	//   66  170:putfield        #133 <Field Set zzaal.zzaAs>
	//   67  173:return          
	}

	public void onFailure(Exception exception)
	{
		exception = ((Exception) ((zzb)exception));
	//    0    0:aload_1         
	//    1    1:checkcast       #161 <Class zzb>
	//    2    4:astore_1        
		zzaac.zza(zzazB).lock();
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field zzaac zzazB>
	//    5    9:invokestatic    #164 <Method Lock zzaac.zza(zzaac)>
	//    6   12:invokeinterface #169 <Method void Lock.lock()>
		zzaac.zza(zzazB, ((Map) (((zzb) (exception)).zzuK())));
	//    7   17:aload_0         
	//    8   18:getfield        #18  <Field zzaac zzazB>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #173 <Method ArrayMap zzb.zzuK()>
	//   11   25:invokestatic    #176 <Method Map zzaac.zza(zzaac, Map)>
	//   12   28:pop             
		zzaac.zza(zzazB, zzvs());
	//   13   29:aload_0         
	//   14   30:getfield        #18  <Field zzaac zzazB>
	//   15   33:aload_0         
	//   16   34:invokespecial   #178 <Method ConnectionResult zzvs()>
	//   17   37:invokestatic    #181 <Method ConnectionResult zzaac.zza(zzaac, ConnectionResult)>
	//   18   40:pop             
		if(zzaac.zzf(zzazB) != null)
			break MISSING_BLOCK_LABEL_91;
	//   19   41:aload_0         
	//   20   42:getfield        #18  <Field zzaac zzazB>
	//   21   45:invokestatic    #185 <Method ConnectionResult zzaac.zzf(zzaac)>
	//   22   48:ifnonnull       91
		zzvt();
	//   23   51:aload_0         
	//   24   52:invokespecial   #187 <Method void zzvt()>
		zzaac.zzd(zzazB).zzo(((android.os.Bundle) (null)));
	//   25   55:aload_0         
	//   26   56:getfield        #18  <Field zzaac zzazB>
	//   27   59:invokestatic    #122 <Method zzaal zzaac.zzd(zzaac)>
	//   28   62:aconst_null     
	//   29   63:invokevirtual   #191 <Method void zzaal.zzo(android.os.Bundle)>
_L1:
		zzaac.zze(zzazB).signalAll();
	//   30   66:aload_0         
	//   31   67:getfield        #18  <Field zzaac zzazB>
	//   32   70:invokestatic    #195 <Method Condition zzaac.zze(zzaac)>
	//   33   73:invokeinterface #200 <Method void Condition.signalAll()>
		zzaac.zza(zzazB).unlock();
	//   34   78:aload_0         
	//   35   79:getfield        #18  <Field zzaac zzazB>
	//   36   82:invokestatic    #164 <Method Lock zzaac.zza(zzaac)>
	//   37   85:invokeinterface #203 <Method void Lock.unlock()>
		return;
	//   38   90:return          
		zzaac.zza(zzazB, false);
	//   39   91:aload_0         
	//   40   92:getfield        #18  <Field zzaac zzazB>
	//   41   95:iconst_0        
	//   42   96:invokestatic    #206 <Method boolean zzaac.zza(zzaac, boolean)>
	//   43   99:pop             
		zzaac.zzd(zzazB).zzc(zzaac.zzf(zzazB));
	//   44  100:aload_0         
	//   45  101:getfield        #18  <Field zzaac zzazB>
	//   46  104:invokestatic    #122 <Method zzaal zzaac.zzd(zzaac)>
	//   47  107:aload_0         
	//   48  108:getfield        #18  <Field zzaac zzazB>
	//   49  111:invokestatic    #185 <Method ConnectionResult zzaac.zzf(zzaac)>
	//   50  114:invokevirtual   #209 <Method void com.google.android.gms.internal.zzaal.zzc(ConnectionResult)>
		  goto _L1
	//*  51  117:goto            66
		exception;
	//   52  120:astore_1        
		zzaac.zza(zzazB).unlock();
	//   53  121:aload_0         
	//   54  122:getfield        #18  <Field zzaac zzazB>
	//   55  125:invokestatic    #164 <Method Lock zzaac.zza(zzaac)>
	//   56  128:invokeinterface #203 <Method void Lock.unlock()>
		throw exception;
	//   57  133:aload_1         
	//   58  134:athrow          
	}

	public void onSuccess(Object obj)
	{
		zza((Void)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #214 <Class Void>
	//    3    5:invokevirtual   #217 <Method void zza(Void)>
	//    4    8:return          
	}

	public void zza(Void void1)
	{
		zzaac.zza(zzazB).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzaac zzazB>
	//    2    4:invokestatic    #164 <Method Lock zzaac.zza(zzaac)>
	//    3    7:invokeinterface #169 <Method void Lock.lock()>
		zzaac.zza(zzazB, ((Map) (new ArrayMap(com.google.android.gms.internal.zzaac.zzb(zzazB).size()))));
	//    4   12:aload_0         
	//    5   13:getfield        #18  <Field zzaac zzazB>
	//    6   16:new             #219 <Class ArrayMap>
	//    7   19:dup             
	//    8   20:aload_0         
	//    9   21:getfield        #18  <Field zzaac zzazB>
	//   10   24:invokestatic    #62  <Method Map com.google.android.gms.internal.zzaac.zzb(zzaac)>
	//   11   27:invokeinterface #222 <Method int Map.size()>
	//   12   32:invokespecial   #225 <Method void ArrayMap(int)>
	//   13   35:invokestatic    #176 <Method Map zzaac.zza(zzaac, Map)>
	//   14   38:pop             
		com.google.android.gms.common.api.Api.zzc zzc1;
		for(void1 = ((Void) (com.google.android.gms.internal.zzaac.zzb(zzazB).keySet().iterator())); ((Iterator) (void1)).hasNext(); com.google.android.gms.internal.zzaac.zzc(zzazB).put(((Object) (((zzc)com.google.android.gms.internal.zzaac.zzb(zzazB).get(((Object) (zzc1)))).getApiKey())), ((Object) (ConnectionResult.zzawX))))
	//*  15   39:aload_0         
	//*  16   40:getfield        #18  <Field zzaac zzazB>
	//*  17   43:invokestatic    #62  <Method Map com.google.android.gms.internal.zzaac.zzb(zzaac)>
	//*  18   46:invokeinterface #38  <Method Set Map.keySet()>
	//*  19   51:invokeinterface #44  <Method Iterator Set.iterator()>
	//*  20   56:astore_1        
	//*  21   57:aload_1         
	//*  22   58:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*  23   63:ifeq            129
			zzc1 = (com.google.android.gms.common.api.Api.zzc)((Iterator) (void1)).next();
	//   24   66:aload_1         
	//   25   67:invokeinterface #54  <Method Object Iterator.next()>
	//   26   72:checkcast       #227 <Class com.google.android.gms.common.api.Api$zzc>
	//   27   75:astore_2        

	//   28   76:aload_0         
	//   29   77:getfield        #18  <Field zzaac zzazB>
	//   30   80:invokestatic    #59  <Method Map com.google.android.gms.internal.zzaac.zzc(zzaac)>
	//   31   83:aload_0         
	//   32   84:getfield        #18  <Field zzaac zzazB>
	//   33   87:invokestatic    #62  <Method Map com.google.android.gms.internal.zzaac.zzb(zzaac)>
	//   34   90:aload_2         
	//   35   91:invokeinterface #70  <Method Object Map.get(Object)>
	//   36   96:checkcast       #72  <Class zzc>
	//   37   99:invokevirtual   #76  <Method zzzs zzc.getApiKey()>
	//   38  102:getstatic       #231 <Field ConnectionResult ConnectionResult.zzawX>
	//   39  105:invokeinterface #235 <Method Object Map.put(Object, Object)>
	//   40  110:pop             
		break MISSING_BLOCK_LABEL_129;
	//   41  111:goto            57
		void1;
	//   42  114:astore_1        
		zzaac.zza(zzazB).unlock();
	//   43  115:aload_0         
	//   44  116:getfield        #18  <Field zzaac zzazB>
	//   45  119:invokestatic    #164 <Method Lock zzaac.zza(zzaac)>
	//   46  122:invokeinterface #203 <Method void Lock.unlock()>
		throw void1;
	//   47  127:aload_1         
	//   48  128:athrow          
		zzvt();
	//   49  129:aload_0         
	//   50  130:invokespecial   #187 <Method void zzvt()>
		zzaac.zzd(zzazB).zzo(((android.os.Bundle) (null)));
	//   51  133:aload_0         
	//   52  134:getfield        #18  <Field zzaac zzazB>
	//   53  137:invokestatic    #122 <Method zzaal zzaac.zzd(zzaac)>
	//   54  140:aconst_null     
	//   55  141:invokevirtual   #191 <Method void zzaal.zzo(android.os.Bundle)>
		zzaac.zze(zzazB).signalAll();
	//   56  144:aload_0         
	//   57  145:getfield        #18  <Field zzaac zzazB>
	//   58  148:invokestatic    #195 <Method Condition zzaac.zze(zzaac)>
	//   59  151:invokeinterface #200 <Method void Condition.signalAll()>
		zzaac.zza(zzazB).unlock();
	//   60  156:aload_0         
	//   61  157:getfield        #18  <Field zzaac zzazB>
	//   62  160:invokestatic    #164 <Method Lock zzaac.zza(zzaac)>
	//   63  163:invokeinterface #203 <Method void Lock.unlock()>
		return;
	//   64  168:return          
	}

	final zzaac zzazB;

	private zzaac$zza(zzaac zzaac1)
	{
		zzazB = zzaac1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzaac zzazB>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}

	zzaac$zza(zzaac zzaac1, zzaac._cls1 _pcls1)
	{
		this(zzaac1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void zzaac$zza(zzaac)>
	//    3    5:return          
	}
}
