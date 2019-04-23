// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			BasePendingResult, zacq, zacr, zacs

public final class zacp
{

	public zacp(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #40  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #41  <Method void WeakHashMap()>
	//    6   12:invokestatic    #47  <Method Set Collections.newSetFromMap(Map)>
	//    7   15:invokestatic    #51  <Method Set Collections.synchronizedSet(Set)>
	//    8   18:putfield        #53  <Field Set zaky>
	//    9   21:aload_0         
	//   10   22:new             #55  <Class zacq>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokespecial   #58  <Method void zacq(zacp)>
	//   14   30:putfield        #60  <Field zacs zakz>
		zagy = map;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #62  <Field Map zagy>
	//   18   38:return          
	}

	public final void release()
	{
		RemoteException remoteexception;
		BasePendingResult abasependingresult[] = (BasePendingResult[])zaky.toArray(((Object []) (zakx)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Set zaky>
	//    2    4:getstatic       #34  <Field BasePendingResult[] zakx>
	//    3    7:invokeinterface #73  <Method Object[] Set.toArray(Object[])>
	//    4   12:checkcast       #74  <Class BasePendingResult[]>
	//    5   15:astore          4
		int j = abasependingresult.length;
	//    6   17:aload           4
	//    7   19:arraylength     
	//    8   20:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   21:iconst_0        
	//*  10   22:istore_1        
	//*  11   23:iload_1         
	//*  12   24:iload_2         
	//*  13   25:icmpge          234
		{
			BasePendingResult basependingresult = abasependingresult[i];
	//   14   28:aload           4
	//   15   30:iload_1         
	//   16   31:aaload          
	//   17   32:astore_3        
			basependingresult.zaa(((zacs) (null)));
	//   18   33:aload_3         
	//   19   34:aconst_null     
	//   20   35:invokevirtual   #78  <Method void BasePendingResult.zaa(zacs)>
			if(((PendingResult) (basependingresult)).zam() == null)
	//*  21   38:aload_3         
	//*  22   39:invokevirtual   #84  <Method Integer PendingResult.zam()>
	//*  23   42:ifnonnull       66
			{
				if(basependingresult.zat())
	//*  24   45:aload_3         
	//*  25   46:invokevirtual   #88  <Method boolean BasePendingResult.zat()>
	//*  26   49:ifeq            227
					zaky.remove(((Object) (basependingresult)));
	//   27   52:aload_0         
	//   28   53:getfield        #53  <Field Set zaky>
	//   29   56:aload_3         
	//   30   57:invokeinterface #92  <Method boolean Set.remove(Object)>
	//   31   62:pop             
				continue;
	//   32   63:goto            227
			}
			((PendingResult) (basependingresult)).setResultCallback(((com.google.android.gms.common.api.ResultCallback) (null)));
	//   33   66:aload_3         
	//   34   67:aconst_null     
	//   35   68:invokevirtual   #96  <Method void PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback)>
			IBinder ibinder = ((com.google.android.gms.common.api.Api.Client)zagy.get(((Object) (((BaseImplementation.ApiMethodImpl)basependingresult).getClientKey())))).getServiceBrokerBinder();
	//   36   71:aload_0         
	//   37   72:getfield        #62  <Field Map zagy>
	//   38   75:aload_3         
	//   39   76:checkcast       #98  <Class BaseImplementation$ApiMethodImpl>
	//   40   79:invokevirtual   #102 <Method com.google.android.gms.common.api.Api$AnyClientKey BaseImplementation$ApiMethodImpl.getClientKey()>
	//   41   82:invokeinterface #108 <Method Object Map.get(Object)>
	//   42   87:checkcast       #110 <Class com.google.android.gms.common.api.Api$Client>
	//   43   90:invokeinterface #114 <Method IBinder com.google.android.gms.common.api.Api$Client.getServiceBrokerBinder()>
	//   44   95:astore          6
			if(basependingresult.isReady())
	//*  45   97:aload_3         
	//*  46   98:invokevirtual   #117 <Method boolean BasePendingResult.isReady()>
	//*  47  101:ifeq            123
				basependingresult.zaa(((zacs) (new zacr(basependingresult, ((com.google.android.gms.common.api.zac) (null)), ibinder, ((zacq) (null))))));
	//   48  104:aload_3         
	//   49  105:new             #119 <Class zacr>
	//   50  108:dup             
	//   51  109:aload_3         
	//   52  110:aconst_null     
	//   53  111:aload           6
	//   54  113:aconst_null     
	//   55  114:invokespecial   #122 <Method void zacr(BasePendingResult, com.google.android.gms.common.api.zac, IBinder, zacq)>
	//   56  117:invokevirtual   #78  <Method void BasePendingResult.zaa(zacs)>
			else
	//*  57  120:goto            216
			if(ibinder != null && ibinder.isBinderAlive())
	//*  58  123:aload           6
	//*  59  125:ifnull          191
	//*  60  128:aload           6
	//*  61  130:invokeinterface #127 <Method boolean IBinder.isBinderAlive()>
	//*  62  135:ifeq            191
			{
				zacr zacr1 = new zacr(basependingresult, ((com.google.android.gms.common.api.zac) (null)), ibinder, ((zacq) (null)));
	//   63  138:new             #119 <Class zacr>
	//   64  141:dup             
	//   65  142:aload_3         
	//   66  143:aconst_null     
	//   67  144:aload           6
	//   68  146:aconst_null     
	//   69  147:invokespecial   #122 <Method void zacr(BasePendingResult, com.google.android.gms.common.api.zac, IBinder, zacq)>
	//   70  150:astore          5
				basependingresult.zaa(((zacs) (zacr1)));
	//   71  152:aload_3         
	//   72  153:aload           5
	//   73  155:invokevirtual   #78  <Method void BasePendingResult.zaa(zacs)>
				try
				{
					ibinder.linkToDeath(((android.os.IBinder.DeathRecipient) (zacr1)), 0);
	//   74  158:aload           6
	//   75  160:aload           5
	//   76  162:iconst_0        
	//   77  163:invokeinterface #131 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
				}
	//*  78  168:goto            216
	//*  79  171:aload_3         
	//*  80  172:invokevirtual   #134 <Method void PendingResult.cancel()>
	//*  81  175:aload_3         
	//*  82  176:invokevirtual   #84  <Method Integer PendingResult.zam()>
	//*  83  179:invokevirtual   #140 <Method int Integer.intValue()>
	//*  84  182:pop             
	//*  85  183:new             #142 <Class NullPointerException>
	//*  86  186:dup             
	//*  87  187:invokespecial   #143 <Method void NullPointerException()>
	//*  88  190:athrow          
	//*  89  191:aload_3         
	//*  90  192:aconst_null     
	//*  91  193:invokevirtual   #78  <Method void BasePendingResult.zaa(zacs)>
	//*  92  196:aload_3         
	//*  93  197:invokevirtual   #134 <Method void PendingResult.cancel()>
	//*  94  200:aload_3         
	//*  95  201:invokevirtual   #84  <Method Integer PendingResult.zam()>
	//*  96  204:invokevirtual   #140 <Method int Integer.intValue()>
	//*  97  207:pop             
	//*  98  208:new             #142 <Class NullPointerException>
	//*  99  211:dup             
	//* 100  212:invokespecial   #143 <Method void NullPointerException()>
	//* 101  215:athrow          
	//* 102  216:aload_0         
	//* 103  217:getfield        #53  <Field Set zaky>
	//* 104  220:aload_3         
	//* 105  221:invokeinterface #92  <Method boolean Set.remove(Object)>
	//* 106  226:pop             
	//* 107  227:iload_1         
	//* 108  228:iconst_1        
	//* 109  229:iadd            
	//* 110  230:istore_1        
	//* 111  231:goto            23
	//* 112  234:return          
				// Misplaced declaration of an exception variable
				catch(RemoteException remoteexception)
				{
					((PendingResult) (basependingresult)).cancel();
					((PendingResult) (basependingresult)).zam().intValue();
					throw new NullPointerException();
				}
			} else
			{
				basependingresult.zaa(((zacs) (null)));
				((PendingResult) (basependingresult)).cancel();
				((PendingResult) (basependingresult)).zam().intValue();
				throw new NullPointerException();
			}
			zaky.remove(((Object) (basependingresult)));
		}

	//* 113  235:astore          4
	//* 114  237:goto            171
	}

	final void zab(BasePendingResult basependingresult)
	{
		zaky.add(((Object) (basependingresult)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Set zaky>
	//    2    4:aload_1         
	//    3    5:invokeinterface #148 <Method boolean Set.add(Object)>
	//    4   10:pop             
		basependingresult.zaa(zakz);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #60  <Field zacs zakz>
	//    8   16:invokevirtual   #78  <Method void BasePendingResult.zaa(zacs)>
	//    9   19:return          
	}

	public final void zabx()
	{
		BasePendingResult abasependingresult[] = (BasePendingResult[])zaky.toArray(((Object []) (zakx)));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Set zaky>
	//    2    4:getstatic       #34  <Field BasePendingResult[] zakx>
	//    3    7:invokeinterface #73  <Method Object[] Set.toArray(Object[])>
	//    4   12:checkcast       #74  <Class BasePendingResult[]>
	//    5   15:astore_3        
		int j = abasependingresult.length;
	//    6   16:aload_3         
	//    7   17:arraylength     
	//    8   18:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:icmpge          42
			abasependingresult[i].zab(zakw);
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:aaload          
	//   17   29:getstatic       #30  <Field Status zakw>
	//   18   32:invokevirtual   #153 <Method void BasePendingResult.zab(Status)>

	//   19   35:iload_1         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_1        
	//*  23   39:goto            21
	//   24   42:return          
	}

	public static final Status zakw = new Status(8, "The connection to Google Play services was lost");
	private static final BasePendingResult zakx[] = new BasePendingResult[0];
	private final Map zagy;
	final Set zaky = Collections.synchronizedSet(Collections.newSetFromMap(((Map) (new WeakHashMap()))));
	private final zacs zakz = new zacq(this);

	static 
	{
	//    0    0:new             #22  <Class Status>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:ldc1            #24  <String "The connection to Google Play services was lost">
	//    4    8:invokespecial   #28  <Method void Status(int, String)>
	//    5   11:putstatic       #30  <Field Status zakw>
	//    6   14:iconst_0        
	//    7   15:anewarray       BasePendingResult[]
	//    8   18:putstatic       #34  <Field BasePendingResult[] zakx>
	//*   9   21:return          
	}
}
