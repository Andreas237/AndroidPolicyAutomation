// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbcv, zzazy, zzbcu

public abstract class zzazz
	implements zzbcv
{

	public zzazz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (zzaax()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method zzazz zzaax()>
	//    2    4:areturn         
	}

	protected abstract zzazz zza(zzazy zzazy1);

	public abstract zzazz zzaax();

	public final zzbcv zzd(zzbcu zzbcu)
	{
		if(!((Object) (zzadg())).getClass().isInstance(((Object) (zzbcu))))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #29  <Method zzbcu zzadg()>
	//*   2    4:invokevirtual   #33  <Method Class Object.getClass()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #39  <Method boolean Class.isInstance(Object)>
	//*   5   11:ifne            24
			throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
	//    6   14:new             #41  <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:ldc1            #43  <String "mergeFrom(MessageLite) can only merge messages of the same type.">
	//    9   20:invokespecial   #46  <Method void IllegalArgumentException(String)>
	//   10   23:athrow          
		else
			return ((zzbcv) (zza((zzazy)zzbcu)));
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:checkcast       #48  <Class zzazy>
	//   14   29:invokevirtual   #50  <Method zzazz zza(zzazy)>
	//   15   32:areturn         
	}
}
