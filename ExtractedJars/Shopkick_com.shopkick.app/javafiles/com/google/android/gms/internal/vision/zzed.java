// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzhg, zzec, zzhf

public abstract class zzed
	implements zzhg
{

	public zzed()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzcg()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method zzed zzcg()>
	//    2    4:areturn         
	}

	protected abstract zzed zza(zzec zzec1);

	public final zzhg zza(zzhf zzhf)
	{
		if(((Object) (zzfb())).getClass().isInstance(((Object) (zzhf))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method zzhf zzfb()>
	//*   2    4:invokevirtual   #32  <Method Class Object.getClass()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #38  <Method boolean Class.isInstance(Object)>
	//*   5   11:ifeq            23
			return ((zzhg) (zza((zzec)zzhf)));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:checkcast       #40  <Class zzec>
	//    9   19:invokevirtual   #42  <Method zzed zza(zzec)>
	//   10   22:areturn         
		else
			throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
	//   11   23:new             #44  <Class IllegalArgumentException>
	//   12   26:dup             
	//   13   27:ldc1            #46  <String "mergeFrom(MessageLite) can only merge messages of the same type.">
	//   14   29:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//   15   32:athrow          
	}

	public abstract zzed zzcg();
}
