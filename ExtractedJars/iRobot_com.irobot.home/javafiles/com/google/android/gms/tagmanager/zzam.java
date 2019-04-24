// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzbq, zzgj, zzdi, zzan

final class zzam extends zzbq
{

	public zzam(zzan zzan1)
	{
		super(ID, new String[] {
			zzbaz
		});
	//    0    0:aload_0         
	//    1    1:getstatic       #25  <Field String ID>
	//    2    4:iconst_1        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #34  <Field String zzbaz>
	//    7   13:aastore         
	//    8   14:invokespecial   #47  <Method void zzbq(String, String[])>
		zzbba = zzan1;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #49  <Field zzan zzbba>
	//   12   22:return          
	}

	public final zzp zzc(Map map)
	{
		String s;
		HashMap hashmap;
		s = zzgj.zzc((zzp)map.get(((Object) (zzbaz))));
	//    0    0:aload_1         
	//    1    1:getstatic       #34  <Field String zzbaz>
	//    2    4:invokeinterface #59  <Method Object Map.get(Object)>
	//    3    9:checkcast       #61  <Class zzp>
	//    4   12:invokestatic    #66  <Method String zzgj.zzc(zzp)>
	//    5   15:astore_2        
		hashmap = new HashMap();
	//    6   16:new             #68  <Class HashMap>
	//    7   19:dup             
	//    8   20:invokespecial   #70  <Method void HashMap()>
	//    9   23:astore_3        
		map = ((Map) ((zzp)map.get(((Object) (zzazk)))));
	//   10   24:aload_1         
	//   11   25:getstatic       #39  <Field String zzazk>
	//   12   28:invokeinterface #59  <Method Object Map.get(Object)>
	//   13   33:checkcast       #61  <Class zzp>
	//   14   36:astore_1        
		if(map == null) goto _L2; else goto _L1
	//   15   37:aload_1         
	//   16   38:ifnull          126
_L1:
		map = ((Map) (zzgj.zzh(((zzp) (map)))));
	//   17   41:aload_1         
	//   18   42:invokestatic    #74  <Method Object zzgj.zzh(zzp)>
	//   19   45:astore_1        
		if(map instanceof Map) goto _L4; else goto _L3
	//   20   46:aload_1         
	//   21   47:instanceof      #55  <Class Map>
	//   22   50:ifne            64
_L3:
		map = "FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.";
	//   23   53:ldc1            #76  <String "FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.">
	//   24   55:astore_1        
_L6:
		zzdi.zzab(((String) (map)));
	//   25   56:aload_1         
	//   26   57:invokestatic    #82  <Method void zzdi.zzab(String)>
		return zzgj.zzqq();
	//   27   60:invokestatic    #86  <Method zzp zzgj.zzqq()>
	//   28   63:areturn         
_L4:
		java.util.Map.Entry entry;
		for(map = ((Map) (((Map)map).entrySet().iterator())); ((Iterator) (map)).hasNext(); ((Map) (hashmap)).put(((Object) (entry.getKey().toString())), entry.getValue()))
	//*  29   64:aload_1         
	//*  30   65:checkcast       #55  <Class Map>
	//*  31   68:invokeinterface #90  <Method Set Map.entrySet()>
	//*  32   73:invokeinterface #96  <Method Iterator Set.iterator()>
	//*  33   78:astore_1        
	//*  34   79:aload_1         
	//*  35   80:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//*  36   85:ifeq            126
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   37   88:aload_1         
	//   38   89:invokeinterface #106 <Method Object Iterator.next()>
	//   39   94:checkcast       #108 <Class java.util.Map$Entry>
	//   40   97:astore          4

	//   41   99:aload_3         
	//   42  100:aload           4
	//   43  102:invokeinterface #111 <Method Object java.util.Map$Entry.getKey()>
	//   44  107:invokevirtual   #114 <Method String Object.toString()>
	//   45  110:aload           4
	//   46  112:invokeinterface #117 <Method Object java.util.Map$Entry.getValue()>
	//   47  117:invokeinterface #121 <Method Object Map.put(Object, Object)>
	//   48  122:pop             
	//*  49  123:goto            79
_L2:
		map = ((Map) (zzgj.zzj(zzbba.zza(s, ((Map) (hashmap))))));
	//   50  126:aload_0         
	//   51  127:getfield        #49  <Field zzan zzbba>
	//   52  130:aload_2         
	//   53  131:aload_3         
	//   54  132:invokeinterface #127 <Method Object com.google.android.gms.tagmanager.zzan.zza(String, Map)>
	//   55  137:invokestatic    #131 <Method zzp zzgj.zzj(Object)>
	//   56  140:astore_1        
		return ((zzp) (map));
	//   57  141:aload_1         
	//   58  142:areturn         
		map;
	//   59  143:astore_1        
		map = ((Map) (((Exception) (map)).getMessage()));
	//   60  144:aload_1         
	//   61  145:invokevirtual   #134 <Method String Exception.getMessage()>
	//   62  148:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34 + String.valueOf(((Object) (map))).length());
	//   63  149:new             #136 <Class StringBuilder>
	//   64  152:dup             
	//   65  153:aload_2         
	//   66  154:invokestatic    #140 <Method String String.valueOf(Object)>
	//   67  157:invokevirtual   #144 <Method int String.length()>
	//   68  160:bipush          34
	//   69  162:iadd            
	//   70  163:aload_1         
	//   71  164:invokestatic    #140 <Method String String.valueOf(Object)>
	//   72  167:invokevirtual   #144 <Method int String.length()>
	//   73  170:iadd            
	//   74  171:invokespecial   #147 <Method void StringBuilder(int)>
	//   75  174:astore_3        
		stringbuilder.append("Custom macro/tag ");
	//   76  175:aload_3         
	//   77  176:ldc1            #149 <String "Custom macro/tag ">
	//   78  178:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   79  181:pop             
		stringbuilder.append(s);
	//   80  182:aload_3         
	//   81  183:aload_2         
	//   82  184:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   83  187:pop             
		stringbuilder.append(" threw exception ");
	//   84  188:aload_3         
	//   85  189:ldc1            #155 <String " threw exception ">
	//   86  191:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   87  194:pop             
		stringbuilder.append(((String) (map)));
	//   88  195:aload_3         
	//   89  196:aload_1         
	//   90  197:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   91  200:pop             
		map = ((Map) (stringbuilder.toString()));
	//   92  201:aload_3         
	//   93  202:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   94  205:astore_1        
		if(true) goto _L6; else goto _L5
	//   95  206:goto            56
_L5:
	}

	public final boolean zznk()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final String ID;
	private static final String zzazk;
	private static final String zzbaz;
	private final zzan zzbba;

	static 
	{
		ID = zza.zzs.toString();
	//    0    0:getstatic       #19  <Field zza zza.zzs>
	//    1    3:invokevirtual   #23  <Method String zza.toString()>
	//    2    6:putstatic       #25  <Field String ID>
		zzbaz = zzb.zzia.toString();
	//    3    9:getstatic       #31  <Field zzb zzb.zzia>
	//    4   12:invokevirtual   #32  <Method String zzb.toString()>
	//    5   15:putstatic       #34  <Field String zzbaz>
		zzazk = zzb.zzds.toString();
	//    6   18:getstatic       #37  <Field zzb zzb.zzds>
	//    7   21:invokevirtual   #32  <Method String zzb.toString()>
	//    8   24:putstatic       #39  <Field String zzazk>
	//*   9   27:return          
	}
}
