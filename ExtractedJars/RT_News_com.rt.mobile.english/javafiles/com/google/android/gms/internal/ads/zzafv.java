// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaft, zzaoj, zzafz, zzakb, 
//			zzajw

final class zzafv
	implements zzv
{

	zzafv(zzaft zzaft1)
	{
		zzchv = zzaft1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzaft zzchv>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final void zza(Object obj, Map map)
	{
label0:
		{
			synchronized(zzaft.zza(zzchv))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field zzaft zzchv>
	//*   2    4:invokestatic    #24  <Method Object zzaft.zza(zzaft)>
	//*   3    7:astore_3        
	//*   4    8:aload_3         
	//*   5    9:monitorenter    
			{
				if(!zzaft.zzb(zzchv).isDone())
					break label0;
	//    6   10:aload_0         
	//    7   11:getfield        #13  <Field zzaft zzchv>
	//    8   14:invokestatic    #28  <Method zzaoj zzaft.zzb(zzaft)>
	//    9   17:invokevirtual   #34  <Method boolean zzaoj.isDone()>
	//   10   20:ifeq            26
			}
	//   11   23:aload_3         
	//   12   24:monitorexit     
			return;
	//   13   25:return          
		}
		zzafz zzafz1;
		zzafz1 = new zzafz(-2, map);
	//   14   26:new             #36  <Class zzafz>
	//   15   29:dup             
	//   16   30:bipush          -2
	//   17   32:aload_2         
	//   18   33:invokespecial   #39  <Method void zzafz(int, Map)>
	//   19   36:astore          4
		if(zzaft.zzc(zzchv).equals(((Object) (zzafz1.zzol()))))
			break MISSING_BLOCK_LABEL_59;
	//   20   38:aload_0         
	//   21   39:getfield        #13  <Field zzaft zzchv>
	//   22   42:invokestatic    #43  <Method String zzaft.zzc(zzaft)>
	//   23   45:aload           4
	//   24   47:invokevirtual   #47  <Method String zzafz.zzol()>
	//   25   50:invokevirtual   #53  <Method boolean String.equals(Object)>
	//   26   53:ifne            59
		obj1;
	//   27   56:aload_3         
		JVM INSTR monitorexit ;
	//   28   57:monitorexit     
		return;
	//   29   58:return          
		obj = ((Object) (zzafz1.getUrl()));
	//   30   59:aload           4
	//   31   61:invokevirtual   #56  <Method String zzafz.getUrl()>
	//   32   64:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_77;
	//   33   65:aload_1         
	//   34   66:ifnonnull       77
		zzakb.zzdk("URL missing in loadAdUrl GMSG.");
	//   35   69:ldc1            #58  <String "URL missing in loadAdUrl GMSG.">
	//   36   71:invokestatic    #64  <Method void zzakb.zzdk(String)>
		obj1;
	//   37   74:aload_3         
		JVM INSTR monitorexit ;
	//   38   75:monitorexit     
		return;
	//   39   76:return          
		if(!((String) (obj)).contains("%40mediation_adapters%40"))
			break MISSING_BLOCK_LABEL_163;
	//   40   77:aload_1         
	//   41   78:ldc1            #66  <String "%40mediation_adapters%40">
	//   42   80:invokevirtual   #70  <Method boolean String.contains(CharSequence)>
	//   43   83:ifeq            163
		obj = ((Object) (((String) (obj)).replaceAll("%40mediation_adapters%40", zzajw.zzc(zzaft.zzd(zzchv), (String)map.get("check_adapters"), zzaft.zze(zzchv)))));
	//   44   86:aload_1         
	//   45   87:ldc1            #66  <String "%40mediation_adapters%40">
	//   46   89:aload_0         
	//   47   90:getfield        #13  <Field zzaft zzchv>
	//   48   93:invokestatic    #74  <Method android.content.Context zzaft.zzd(zzaft)>
	//   49   96:aload_2         
	//   50   97:ldc1            #76  <String "check_adapters">
	//   51   99:invokeinterface #82  <Method Object Map.get(Object)>
	//   52  104:checkcast       #49  <Class String>
	//   53  107:aload_0         
	//   54  108:getfield        #13  <Field zzaft zzchv>
	//   55  111:invokestatic    #85  <Method String zzaft.zze(zzaft)>
	//   56  114:invokestatic    #90  <Method String zzajw.zzc(android.content.Context, String, String)>
	//   57  117:invokevirtual   #94  <Method String String.replaceAll(String, String)>
	//   58  120:astore_1        
		zzafz1.setUrl(((String) (obj)));
	//   59  121:aload           4
	//   60  123:aload_1         
	//   61  124:invokevirtual   #97  <Method void zzafz.setUrl(String)>
		obj = ((Object) (String.valueOf(obj)));
	//   62  127:aload_1         
	//   63  128:invokestatic    #101 <Method String String.valueOf(Object)>
	//   64  131:astore_1        
		if(((String) (obj)).length() != 0)
	//*  65  132:aload_1         
	//*  66  133:invokevirtual   #105 <Method int String.length()>
	//*  67  136:ifeq            149
		{
			obj = ((Object) ("Ad request URL modified to ".concat(((String) (obj)))));
	//   68  139:ldc1            #107 <String "Ad request URL modified to ">
	//   69  141:aload_1         
	//   70  142:invokevirtual   #111 <Method String String.concat(String)>
	//   71  145:astore_1        
			break MISSING_BLOCK_LABEL_159;
	//   72  146:goto            159
		}
		obj = ((Object) (new String("Ad request URL modified to ")));
	//   73  149:new             #49  <Class String>
	//   74  152:dup             
	//   75  153:ldc1            #107 <String "Ad request URL modified to ">
	//   76  155:invokespecial   #113 <Method void String(String)>
	//   77  158:astore_1        
		zzakb.v(((String) (obj)));
	//   78  159:aload_1         
	//   79  160:invokestatic    #116 <Method void zzakb.v(String)>
		zzaft.zzb(zzchv).set(((Object) (zzafz1)));
	//   80  163:aload_0         
	//   81  164:getfield        #13  <Field zzaft zzchv>
	//   82  167:invokestatic    #28  <Method zzaoj zzaft.zzb(zzaft)>
	//   83  170:aload           4
	//   84  172:invokevirtual   #120 <Method void zzaoj.set(Object)>
		obj1;
	//   85  175:aload_3         
		JVM INSTR monitorexit ;
	//   86  176:monitorexit     
		return;
	//   87  177:return          
		obj;
	//   88  178:astore_1        
		obj1;
	//   89  179:aload_3         
		JVM INSTR monitorexit ;
	//   90  180:monitorexit     
		throw obj;
	//   91  181:aload_1         
	//   92  182:athrow          
	}

	private final zzaft zzchv;
}
