// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			GoogleApiManager, zai, zabi

private static final class GoogleApiManager$zab
{

	static zai zac(GoogleApiManager$zab googleapimanager$zab)
	{
		return googleapimanager$zab.zaja;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zai zaja>
	//    2    4:areturn         
	}

	static Feature zad(GoogleApiManager$zab googleapimanager$zab)
	{
		return googleapimanager$zab.zajb;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Feature zajb>
	//    2    4:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj != null && (obj instanceof GoogleApiManager$zab))
	//*   0    0:aload_1         
	//*   1    1:ifnull          46
	//*   2    4:aload_1         
	//*   3    5:instanceof      #2   <Class GoogleApiManager$zab>
	//*   4    8:ifeq            46
		{
			obj = ((Object) ((GoogleApiManager$zab)obj));
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class GoogleApiManager$zab>
	//    7   15:astore_1        
			if(Objects.equal(((Object) (zaja)), ((Object) (((GoogleApiManager$zab) (obj)).zaja))) && Objects.equal(((Object) (zajb)), ((Object) (((GoogleApiManager$zab) (obj)).zajb))))
	//*   8   16:aload_0         
	//*   9   17:getfield        #19  <Field zai zaja>
	//*  10   20:aload_1         
	//*  11   21:getfield        #19  <Field zai zaja>
	//*  12   24:invokestatic    #39  <Method boolean Objects.equal(Object, Object)>
	//*  13   27:ifeq            46
	//*  14   30:aload_0         
	//*  15   31:getfield        #21  <Field Feature zajb>
	//*  16   34:aload_1         
	//*  17   35:getfield        #21  <Field Feature zajb>
	//*  18   38:invokestatic    #39  <Method boolean Objects.equal(Object, Object)>
	//*  19   41:ifeq            46
				return true;
	//   20   44:iconst_1        
	//   21   45:ireturn         
		}
		return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zaja, zajb
		});
	//    0    0:iconst_2        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field zai zaja>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #21  <Field Feature zajb>
	//   11   17:aastore         
	//   12   18:invokestatic    #44  <Method int Objects.hashCode(Object[])>
	//   13   21:ireturn         
	}

	public final String toString()
	{
		return Objects.toStringHelper(((Object) (this))).add("key", ((Object) (zaja))).add("feature", ((Object) (zajb))).toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc1            #52  <String "key">
	//    3    6:aload_0         
	//    4    7:getfield        #19  <Field zai zaja>
	//    5   10:invokevirtual   #58  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    6   13:ldc1            #60  <String "feature">
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field Feature zajb>
	//    9   19:invokevirtual   #58  <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   10   22:invokevirtual   #62  <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   11   25:areturn         
	}

	private final zai zaja;
	private final Feature zajb;

	private GoogleApiManager$zab(zai zai, Feature feature)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zaja = zai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zai zaja>
		zajb = feature;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Feature zajb>
	//    8   14:return          
	}

	GoogleApiManager$zab(zai zai, Feature feature, zabi zabi)
	{
		this(zai, feature);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void GoogleApiManager$zab(zai, Feature)>
	//    4    6:return          
	}
}
