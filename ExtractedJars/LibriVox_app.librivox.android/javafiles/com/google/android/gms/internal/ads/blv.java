// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzfs, blu

final class blv
	implements Comparator
{

	private blv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	blv(blu blu)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void blv()>
	//    2    4:return          
	}

	public final int compare(Object obj, Object obj1)
	{
		obj = ((Object) ((zzfs)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class zzfs>
	//    2    4:astore_1        
		return ((zzfs)obj1).b - ((zzfs) (obj)).b;
	//    3    5:aload_2         
	//    4    6:checkcast       #17  <Class zzfs>
	//    5    9:getfield        #21  <Field int zzfs.b>
	//    6   12:aload_1         
	//    7   13:getfield        #21  <Field int zzfs.b>
	//    8   16:isub            
	//    9   17:ireturn         
	}
}
