// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbba, zzbbc, zzbcu

public final class zzbbb
{

	zzbbb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		zzdqu = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #34  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void HashMap()>
	//    6   12:putfield        #37  <Field Map zzdqu>
	//    7   15:return          
	}

	private zzbbb(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		zzdqu = Collections.emptyMap();
	//    2    4:aload_0         
	//    3    5:invokestatic    #43  <Method Map Collections.emptyMap()>
	//    4    8:putfield        #37  <Field Map zzdqu>
	//    5   11:return          
	}

	private static Class zzacq()
	{
		ClassNotFoundException classnotfoundexception;
		Class class1;
		try
		{
			class1 = Class.forName("com.google.protobuf.Extension");
	//    0    0:ldc1            #47  <String "com.google.protobuf.Extension">
	//    1    2:invokestatic    #53  <Method Class Class.forName(String)>
	//    2    5:astore_0        
		}
	//*   3    6:aload_0         
	//*   4    7:areturn         
	//*   5    8:aconst_null     
	//*   6    9:areturn         
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			return null;
		}
		return class1;
	//*   7   10:astore_0        
	//*   8   11:goto            8
	}

	public static zzbbb zzacr()
	{
		return zzbba.zzacp();
	//    0    0:invokestatic    #62  <Method zzbbb zzbba.zzacp()>
	//    1    3:areturn         
	}

	public final zzbbo.zzd zza(zzbcu zzbcu, int i)
	{
		return (zzbbo.zzd)zzdqu.get(((Object) (new zzbbc(((Object) (zzbcu)), i))));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Map zzdqu>
	//    2    4:new             #66  <Class zzbbc>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #69  <Method void zzbbc(Object, int)>
	//    7   13:invokeinterface #75  <Method Object Map.get(Object)>
	//    8   18:checkcast       #77  <Class zzbbo$zzd>
	//    9   21:areturn         
	}

	private static volatile boolean zzdqr = false;
	private static final Class zzdqs = zzacq();
	static final zzbbb zzdqt = new zzbbb(true);
	private final Map zzdqu;

	static 
	{
	//    0    0:invokestatic    #21  <Method Class zzacq()>
	//    1    3:putstatic       #23  <Field Class zzdqs>
	//    2    6:new             #2   <Class zzbbb>
	//    3    9:dup             
	//    4   10:iconst_1        
	//    5   11:invokespecial   #27  <Method void zzbbb(boolean)>
	//    6   14:putstatic       #29  <Field zzbbb zzdqt>
	//*   7   17:return          
	}
}
