// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.common.api:
//			Result, Status

public class BooleanResult
	implements Result
{

	public BooleanResult(Status status, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzahq = (Status)zzac.zzb(((Object) (status)), "Status must not be null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #17  <String "Status must not be null">
	//    5    8:invokestatic    #23  <Method Object zzac.zzb(Object, Object)>
	//    6   11:checkcast       #25  <Class Status>
	//    7   14:putfield        #27  <Field Status zzahq>
		zzaxF = flag;
	//    8   17:aload_0         
	//    9   18:iload_2         
	//   10   19:putfield        #29  <Field boolean zzaxF>
	//   11   22:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof BooleanResult))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class BooleanResult>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((BooleanResult)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class BooleanResult>
	//   12   20:astore_1        
			if(!zzahq.equals(((Object) (((BooleanResult) (obj)).zzahq))) || zzaxF != ((BooleanResult) (obj)).zzaxF)
	//*  13   21:aload_0         
	//*  14   22:getfield        #27  <Field Status zzahq>
	//*  15   25:aload_1         
	//*  16   26:getfield        #27  <Field Status zzahq>
	//*  17   29:invokevirtual   #34  <Method boolean Status.equals(Object)>
	//*  18   32:ifeq            46
	//*  19   35:aload_0         
	//*  20   36:getfield        #29  <Field boolean zzaxF>
	//*  21   39:aload_1         
	//*  22   40:getfield        #29  <Field boolean zzaxF>
	//*  23   43:icmpeq          5
				return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
		}
		return true;
	}

	public Status getStatus()
	{
		return zzahq;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Status zzahq>
	//    2    4:areturn         
	}

	public boolean getValue()
	{
		return zzaxF;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean zzaxF>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		int j = zzahq.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Status zzahq>
	//    2    4:invokevirtual   #42  <Method int Status.hashCode()>
	//    3    7:istore_2        
		int i;
		if(zzaxF)
	//*   4    8:aload_0         
	//*   5    9:getfield        #29  <Field boolean zzaxF>
	//*   6   12:ifeq            28
			i = 1;
	//    7   15:iconst_1        
	//    8   16:istore_1        
		else
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:sipush          527
	//*  12   22:iadd            
	//*  13   23:bipush          31
	//*  14   25:imul            
	//*  15   26:iadd            
	//*  16   27:ireturn         
			i = 0;
	//   17   28:iconst_0        
	//   18   29:istore_1        
		return i + (j + 527) * 31;
	//*  19   30:goto            17
	}

	private final Status zzahq;
	private final boolean zzaxF;
}
