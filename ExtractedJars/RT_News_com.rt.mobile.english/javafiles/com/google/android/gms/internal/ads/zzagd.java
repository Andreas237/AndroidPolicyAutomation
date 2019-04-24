// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzagc, zzage, zznk, zzkb, 
//			zzni, zzagb

final class zzagd
	implements Callable
{

	zzagd(zzagc zzagc1, Context context)
	{
		zzckk = zzagc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzagc zzckk>
		val$context = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field Context val$context>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final Object call()
		throws Exception
	{
		Object obj;
label0:
		{
			obj = ((Object) ((zzage)zzagc.zza(zzckk).get(((Object) (val$context)))));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzagc zzckk>
	//    2    4:invokestatic    #31  <Method WeakHashMap zzagc.zza(zzagc)>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field Context val$context>
	//    5   11:invokevirtual   #37  <Method Object WeakHashMap.get(Object)>
	//    6   14:checkcast       #39  <Class zzage>
	//    7   17:astore          4
			if(obj != null)
	//*   8   19:aload           4
	//*   9   21:ifnull          120
			{
				long l = ((zzage) (obj)).zzckl;
	//   10   24:aload           4
	//   11   26:getfield        #43  <Field long zzage.zzckl>
	//   12   29:lstore_2        
				zzna zzna = zznk.zzazw;
	//   13   30:getstatic       #49  <Field zzna zznk.zzazw>
	//   14   33:astore          5
				boolean flag;
				if(l + ((Long)zzkb.zzik().zzd(zzna)).longValue() < zzbv.zzer().currentTimeMillis())
	//*  15   35:lload_2         
	//*  16   36:invokestatic    #55  <Method zzni zzkb.zzik()>
	//*  17   39:aload           5
	//*  18   41:invokevirtual   #61  <Method Object zzni.zzd(zzna)>
	//*  19   44:checkcast       #63  <Class Long>
	//*  20   47:invokevirtual   #67  <Method long Long.longValue()>
	//*  21   50:ladd            
	//*  22   51:invokestatic    #73  <Method Clock zzbv.zzer()>
	//*  23   54:invokeinterface #78  <Method long Clock.currentTimeMillis()>
	//*  24   59:lcmp            
	//*  25   60:ifge            68
					flag = true;
	//   26   63:iconst_1        
	//   27   64:istore_1        
				else
	//*  28   65:goto            70
					flag = false;
	//   29   68:iconst_0        
	//   30   69:istore_1        
				if(!flag)
	//*  31   70:iload_1         
	//*  32   71:ifne            120
				{
					zzna zzna1 = zznk.zzazv;
	//   33   74:getstatic       #81  <Field zzna zznk.zzazv>
	//   34   77:astore          5
					if(((Boolean)zzkb.zzik().zzd(zzna1)).booleanValue())
	//*  35   79:invokestatic    #55  <Method zzni zzkb.zzik()>
	//*  36   82:aload           5
	//*  37   84:invokevirtual   #61  <Method Object zzni.zzd(zzna)>
	//*  38   87:checkcast       #83  <Class Boolean>
	//*  39   90:invokevirtual   #87  <Method boolean Boolean.booleanValue()>
	//*  40   93:ifeq            120
					{
						obj = ((Object) ((new zzagb(val$context, ((zzage) (obj)).zzckm)).zzoo()));
	//   41   96:new             #89  <Class zzagb>
	//   42   99:dup             
	//   43  100:aload_0         
	//   44  101:getfield        #17  <Field Context val$context>
	//   45  104:aload           4
	//   46  106:getfield        #93  <Field zzaga zzage.zzckm>
	//   47  109:invokespecial   #96  <Method void zzagb(Context, zzaga)>
	//   48  112:invokevirtual   #100 <Method zzaga zzagb.zzoo()>
	//   49  115:astore          4
						break label0;
	//   50  117:goto            136
					}
				}
			}
			obj = ((Object) ((new zzagb(val$context)).zzoo()));
	//   51  120:new             #89  <Class zzagb>
	//   52  123:dup             
	//   53  124:aload_0         
	//   54  125:getfield        #17  <Field Context val$context>
	//   55  128:invokespecial   #103 <Method void zzagb(Context)>
	//   56  131:invokevirtual   #100 <Method zzaga zzagb.zzoo()>
	//   57  134:astore          4
		}
		zzagc.zza(zzckk).put(((Object) (val$context)), ((Object) (new zzage(zzckk, ((zzaga) (obj))))));
	//   58  136:aload_0         
	//   59  137:getfield        #15  <Field zzagc zzckk>
	//   60  140:invokestatic    #31  <Method WeakHashMap zzagc.zza(zzagc)>
	//   61  143:aload_0         
	//   62  144:getfield        #17  <Field Context val$context>
	//   63  147:new             #39  <Class zzage>
	//   64  150:dup             
	//   65  151:aload_0         
	//   66  152:getfield        #15  <Field zzagc zzckk>
	//   67  155:aload           4
	//   68  157:invokespecial   #106 <Method void zzage(zzagc, zzaga)>
	//   69  160:invokevirtual   #110 <Method Object WeakHashMap.put(Object, Object)>
	//   70  163:pop             
		return obj;
	//   71  164:aload           4
	//   72  166:areturn         
	}

	private final Context val$context;
	private final zzagc zzckk;
}
