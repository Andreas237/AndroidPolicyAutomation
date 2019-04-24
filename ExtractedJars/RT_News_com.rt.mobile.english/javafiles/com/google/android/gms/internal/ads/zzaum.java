// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaud, zzayd, zzauc, zzaun

public final class zzaum
{

	public zzaum()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		zzdhk = ((ConcurrentMap) (new ConcurrentHashMap()));
	//    2    4:aload_0         
	//    3    5:new             #31  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #34  <Field ConcurrentMap zzdhk>
	//    7   15:return          
	}

	protected final zzaun zza(Object obj, zzaxr.zzb zzb)
		throws GeneralSecurityException
	{
		zzaud.zzdhh[zzb.zzzs().ordinal()];
	//    0    0:getstatic       #44  <Field int[] zzaud.zzdhh>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #50  <Method zzayd zzaxr$zzb.zzzs()>
	//    3    7:invokevirtual   #56  <Method int zzayd.ordinal()>
	//    4   10:iaload          
		JVM INSTR tableswitch 1 4: default 40
	//	               1 69
	//	               2 69
	//	               3 58
	//	               4 50;
	//    5   11:tableswitch     1 4: default 40
	//	               1 69
	//	               2 69
	//	               3 58
	//	               4 50
		   goto _L1 _L2 _L2 _L3 _L4
_L1:
		throw new GeneralSecurityException("unknown output prefix type");
	//    6   40:new             #38  <Class GeneralSecurityException>
	//    7   43:dup             
	//    8   44:ldc1            #58  <String "unknown output prefix type">
	//    9   46:invokespecial   #61  <Method void GeneralSecurityException(String)>
	//   10   49:athrow          
_L4:
		byte abyte0[] = zzauc.zzdhg;
	//   11   50:getstatic       #67  <Field byte[] zzauc.zzdhg>
	//   12   53:astore          4
		  goto _L5
	//*  13   55:goto            95
_L3:
		byte byte0;
		abyte0 = ((byte []) (ByteBuffer.allocate(5)));
	//   14   58:iconst_5        
	//   15   59:invokestatic    #73  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   16   62:astore          4
		byte0 = 1;
	//   17   64:iconst_1        
	//   18   65:istore_3        
		  goto _L6
	//*  19   66:goto            77
_L2:
		abyte0 = ((byte []) (ByteBuffer.allocate(5)));
	//   20   69:iconst_5        
	//   21   70:invokestatic    #73  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   22   73:astore          4
		byte0 = 0;
	//   23   75:iconst_0        
	//   24   76:istore_3        
_L6:
		abyte0 = ((ByteBuffer) (abyte0)).put(byte0).putInt(zzb.zzzr()).array();
	//   25   77:aload           4
	//   26   79:iload_3         
	//   27   80:invokevirtual   #77  <Method ByteBuffer ByteBuffer.put(byte)>
	//   28   83:aload_2         
	//   29   84:invokevirtual   #80  <Method int zzaxr$zzb.zzzr()>
	//   30   87:invokevirtual   #83  <Method ByteBuffer ByteBuffer.putInt(int)>
	//   31   90:invokevirtual   #87  <Method byte[] ByteBuffer.array()>
	//   32   93:astore          4
_L5:
		obj = ((Object) (new zzaun(obj, abyte0, zzb.zzzq(), zzb.zzzs())));
	//   33   95:new             #89  <Class zzaun>
	//   34   98:dup             
	//   35   99:aload_1         
	//   36  100:aload           4
	//   37  102:aload_2         
	//   38  103:invokevirtual   #93  <Method zzaxl zzaxr$zzb.zzzq()>
	//   39  106:aload_2         
	//   40  107:invokevirtual   #50  <Method zzayd zzaxr$zzb.zzzs()>
	//   41  110:invokespecial   #96  <Method void zzaun(Object, byte[], zzaxl, zzayd)>
	//   42  113:astore_1        
		Object obj1 = ((Object) (new ArrayList()));
	//   43  114:new             #98  <Class ArrayList>
	//   44  117:dup             
	//   45  118:invokespecial   #99  <Method void ArrayList()>
	//   46  121:astore          4
		((List) (obj1)).add(obj);
	//   47  123:aload           4
	//   48  125:aload_1         
	//   49  126:invokeinterface #105 <Method boolean List.add(Object)>
	//   50  131:pop             
		zzb = ((zzaxr.zzb) (new String(((zzaun) (obj)).zzwj(), UTF_8)));
	//   51  132:new             #107 <Class String>
	//   52  135:dup             
	//   53  136:aload_1         
	//   54  137:invokevirtual   #110 <Method byte[] zzaun.zzwj()>
	//   55  140:getstatic       #25  <Field Charset UTF_8>
	//   56  143:invokespecial   #113 <Method void String(byte[], Charset)>
	//   57  146:astore_2        
		obj1 = ((Object) ((List)zzdhk.put(((Object) (zzb)), ((Object) (Collections.unmodifiableList(((List) (obj1))))))));
	//   58  147:aload_0         
	//   59  148:getfield        #34  <Field ConcurrentMap zzdhk>
	//   60  151:aload_2         
	//   61  152:aload           4
	//   62  154:invokestatic    #119 <Method List Collections.unmodifiableList(List)>
	//   63  157:invokeinterface #124 <Method Object ConcurrentMap.put(Object, Object)>
	//   64  162:checkcast       #101 <Class List>
	//   65  165:astore          4
		if(obj1 != null)
	//*  66  167:aload           4
	//*  67  169:ifnull          216
		{
			ArrayList arraylist = new ArrayList();
	//   68  172:new             #98  <Class ArrayList>
	//   69  175:dup             
	//   70  176:invokespecial   #99  <Method void ArrayList()>
	//   71  179:astore          5
			((List) (arraylist)).addAll(((java.util.Collection) (obj1)));
	//   72  181:aload           5
	//   73  183:aload           4
	//   74  185:invokeinterface #128 <Method boolean List.addAll(java.util.Collection)>
	//   75  190:pop             
			((List) (arraylist)).add(obj);
	//   76  191:aload           5
	//   77  193:aload_1         
	//   78  194:invokeinterface #105 <Method boolean List.add(Object)>
	//   79  199:pop             
			zzdhk.put(((Object) (zzb)), ((Object) (Collections.unmodifiableList(((List) (arraylist))))));
	//   80  200:aload_0         
	//   81  201:getfield        #34  <Field ConcurrentMap zzdhk>
	//   82  204:aload_2         
	//   83  205:aload           5
	//   84  207:invokestatic    #119 <Method List Collections.unmodifiableList(List)>
	//   85  210:invokeinterface #124 <Method Object ConcurrentMap.put(Object, Object)>
	//   86  215:pop             
		}
		return ((zzaun) (obj));
	//   87  216:aload_1         
	//   88  217:areturn         
	}

	protected final void zza(zzaun zzaun1)
	{
		zzdhl = zzaun1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field zzaun zzdhl>
	//    3    5:return          
	}

	public final zzaun zzwh()
	{
		return zzdhl;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field zzaun zzdhl>
	//    2    4:areturn         
	}

	private static final Charset UTF_8 = Charset.forName("UTF-8");
	private ConcurrentMap zzdhk;
	private zzaun zzdhl;

	static 
	{
	//    0    0:ldc1            #17  <String "UTF-8">
	//    1    2:invokestatic    #23  <Method Charset Charset.forName(String)>
	//    2    5:putstatic       #25  <Field Charset UTF_8>
	//*   3    8:return          
	}
}
