// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzrj, zzp, zzrh

public final class zzri
{

	private zzri(Map map, zzp zzp)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzboz = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Map zzboz>
		zzbfs = zzp;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field zzp zzbfs>
	//    8   14:return          
	}

	zzri(Map map, zzp zzp, zzrh zzrh)
	{
		this(map, zzp);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void zzri(Map, zzp)>
	//    4    6:return          
	}

	public static zzrj zzsz()
	{
		return new zzrj(((zzrh) (null)));
	//    0    0:new             #28  <Class zzrj>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #31  <Method void zzrj(zzrh)>
	//    4    8:areturn         
	}

	public final String toString()
	{
		String s = String.valueOf(((Object) (Collections.unmodifiableMap(zzboz))));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Map zzboz>
	//    2    4:invokestatic    #39  <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:invokestatic    #45  <Method String String.valueOf(Object)>
	//    4   10:astore_1        
		String s1 = String.valueOf(((Object) (zzbfs)));
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field zzp zzbfs>
	//    7   15:invokestatic    #45  <Method String String.valueOf(Object)>
	//    8   18:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 32 + String.valueOf(((Object) (s1))).length());
	//    9   19:new             #47  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokestatic    #45  <Method String String.valueOf(Object)>
	//   13   27:invokevirtual   #51  <Method int String.length()>
	//   14   30:bipush          32
	//   15   32:iadd            
	//   16   33:aload_2         
	//   17   34:invokestatic    #45  <Method String String.valueOf(Object)>
	//   18   37:invokevirtual   #51  <Method int String.length()>
	//   19   40:iadd            
	//   20   41:invokespecial   #54  <Method void StringBuilder(int)>
	//   21   44:astore_3        
		stringbuilder.append("Properties: ");
	//   22   45:aload_3         
	//   23   46:ldc1            #56  <String "Properties: ">
	//   24   48:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		stringbuilder.append(s);
	//   26   52:aload_3         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
		stringbuilder.append(" pushAfterEvaluate: ");
	//   30   58:aload_3         
	//   31   59:ldc1            #62  <String " pushAfterEvaluate: ">
	//   32   61:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		stringbuilder.append(s1);
	//   34   65:aload_3         
	//   35   66:aload_2         
	//   36   67:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   37   70:pop             
		return stringbuilder.toString();
	//   38   71:aload_3         
	//   39   72:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   40   75:areturn         
	}

	public final void zza(String s, zzp zzp)
	{
		zzboz.put(((Object) (s)), ((Object) (zzp)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Map zzboz>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #72  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public final zzp zzpw()
	{
		return zzbfs;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzp zzbfs>
	//    2    4:areturn         
	}

	public final Map zzsi()
	{
		return Collections.unmodifiableMap(zzboz);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Map zzboz>
	//    2    4:invokestatic    #39  <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	private final zzp zzbfs;
	private final Map zzboz;
}
