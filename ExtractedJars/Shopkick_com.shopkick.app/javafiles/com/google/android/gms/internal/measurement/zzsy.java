// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzvw, zzsx, zzvv

public abstract class zzsy
	implements zzvw
{

	public zzsy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzty()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method zzsy zzty()>
	//    2    4:areturn         
	}

	protected abstract zzsy zza(zzsx zzsx1);

	public final zzvw zza(zzvv zzvv)
	{
		if(((Object) (zzwj())).getClass().isInstance(((Object) (zzvv))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method zzvv zzwj()>
	//*   2    4:invokevirtual   #32  <Method Class Object.getClass()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #38  <Method boolean Class.isInstance(Object)>
	//*   5   11:ifeq            23
			return ((zzvw) (zza((zzsx)zzvv)));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:checkcast       #40  <Class zzsx>
	//    9   19:invokevirtual   #42  <Method zzsy zza(zzsx)>
	//   10   22:areturn         
		else
			throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
	//   11   23:new             #44  <Class IllegalArgumentException>
	//   12   26:dup             
	//   13   27:ldc1            #46  <String "mergeFrom(MessageLite) can only merge messages of the same type.">
	//   14   29:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//   15   32:athrow          
	}

	public abstract zzsy zzty();
}
