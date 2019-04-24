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
	{
		return ((Object) (zzty()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method zzsy zzty()>
	//    2    4:areturn         
	}

	protected abstract zzsy zza(zzsx zzsx1);

	public final zzvw zza(zzvv zzvv)
	{
		if(!((Object) (zzwj())).getClass().isInstance(((Object) (zzvv))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #25  <Method zzvv zzwj()>
	//*   2    4:invokevirtual   #29  <Method Class Object.getClass()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #35  <Method boolean Class.isInstance(Object)>
	//*   5   11:ifne            24
			throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
	//    6   14:new             #37  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc1            #39  <String "mergeFrom(MessageLite) can only merge messages of the same type.">
	//    9   20:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//   10   23:athrow          
		else
			return ((zzvw) (zza((zzsx)zzvv)));
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:checkcast       #44  <Class zzsx>
	//   14   29:invokevirtual   #46  <Method zzsy zza(zzsx)>
	//   15   32:areturn         
	}

	public abstract zzsy zzty();
}
