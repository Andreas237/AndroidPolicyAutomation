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
		zzair = (Status)zzac.zzb(((Object) (status)), "Status must not be null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #17  <String "Status must not be null">
	//    5    8:invokestatic    #23  <Method Object zzac.zzb(Object, Object)>
	//    6   11:checkcast       #25  <Class Status>
	//    7   14:putfield        #27  <Field Status zzair>
		zzayS = flag;
	//    8   17:aload_0         
	//    9   18:iload_2         
	//   10   19:putfield        #29  <Field boolean zzayS>
	//   11   22:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
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
		return zzair.equals(((Object) (((BooleanResult) (obj)).zzair))) && zzayS == ((BooleanResult) (obj)).zzayS;
	//   13   21:aload_0         
	//   14   22:getfield        #27  <Field Status zzair>
	//   15   25:aload_1         
	//   16   26:getfield        #27  <Field Status zzair>
	//   17   29:invokevirtual   #34  <Method boolean Status.equals(Object)>
	//   18   32:ifeq            48
	//   19   35:aload_0         
	//   20   36:getfield        #29  <Field boolean zzayS>
	//   21   39:aload_1         
	//   22   40:getfield        #29  <Field boolean zzayS>
	//   23   43:icmpne          48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Status zzair>
	//    2    4:areturn         
	}

	public boolean getValue()
	{
		return zzayS;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean zzayS>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		int j = zzair.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Status zzair>
	//    2    4:invokevirtual   #42  <Method int Status.hashCode()>
	//    3    7:istore_2        
		int i;
		if(zzayS)
	//*   4    8:aload_0         
	//*   5    9:getfield        #29  <Field boolean zzayS>
	//*   6   12:ifeq            20
			i = 1;
	//    7   15:iconst_1        
	//    8   16:istore_1        
		else
	//*   9   17:goto            22
			i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_1        
		return (j + 527) * 31 + i;
	//   12   22:iload_2         
	//   13   23:sipush          527
	//   14   26:iadd            
	//   15   27:bipush          31
	//   16   29:imul            
	//   17   30:iload_1         
	//   18   31:iadd            
	//   19   32:ireturn         
	}

	private final Status zzair;
	private final boolean zzayS;
}
