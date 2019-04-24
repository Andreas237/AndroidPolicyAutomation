// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Comparator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgy, zzgr

final class zzgs
	implements Comparator
{

	zzgs(zzgr zzgr)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public final int compare(Object obj, Object obj1)
	{
		obj = ((Object) ((zzgy)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class zzgy>
	//    2    4:astore_1        
		obj1 = ((Object) ((zzgy)obj1));
	//    3    5:aload_2         
	//    4    6:checkcast       #17  <Class zzgy>
	//    5    9:astore_2        
		int i = ((zzgy) (obj)).zzajg - ((zzgy) (obj1)).zzajg;
	//    6   10:aload_1         
	//    7   11:getfield        #21  <Field int zzgy.zzajg>
	//    8   14:aload_2         
	//    9   15:getfield        #21  <Field int zzgy.zzajg>
	//   10   18:isub            
	//   11   19:istore_3        
		if(i != 0)
	//*  12   20:iload_3         
	//*  13   21:ifeq            26
			return i;
	//   14   24:iload_3         
	//   15   25:ireturn         
		else
			return (int)(((zzgy) (obj)).value - ((zzgy) (obj1)).value);
	//   16   26:aload_1         
	//   17   27:getfield        #25  <Field long zzgy.value>
	//   18   30:aload_2         
	//   19   31:getfield        #25  <Field long zzgy.value>
	//   20   34:lsub            
	//   21   35:l2i             
	//   22   36:ireturn         
	}
}
