// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.cast:
//			Cast, CastDevice

public static final class Cast$CastOptions$Builder
{

	static int zza(Cast$CastOptions$Builder cast$castoptions$builder)
	{
		return cast$castoptions$builder.zzak;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int zzak>
	//    2    4:ireturn         
	}

	static Bundle zzb(Cast$CastOptions$Builder cast$castoptions$builder)
	{
		return cast$castoptions$builder.extras;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Bundle extras>
	//    2    4:areturn         
	}

	public final Cast.CastOptions build()
	{
		return new Cast.CastOptions(this, ((zze) (null)));
	//    0    0:new             #6   <Class Cast$CastOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #51  <Method void Cast$CastOptions(Cast$CastOptions$Builder, zze)>
	//    5    9:areturn         
	}

	public final Cast$CastOptions$Builder setVerboseLoggingEnabled(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            18
			i = zzak | 1;
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field int zzak>
	//    4    8:iconst_1        
	//    5    9:ior             
	//    6   10:istore_2        
		else
	//*   7   11:aload_0         
	//*   8   12:iload_2         
	//*   9   13:putfield        #39  <Field int zzak>
	//*  10   16:aload_0         
	//*  11   17:areturn         
			i = zzak & -2;
	//   12   18:aload_0         
	//   13   19:getfield        #39  <Field int zzak>
	//   14   22:bipush          -2
	//   15   24:iand            
	//   16   25:istore_2        
		zzak = i;
		return this;
	//*  17   26:goto            11
	}

	public final Cast$CastOptions$Builder zza(Bundle bundle)
	{
		extras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field Bundle extras>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private Bundle extras;
	CastDevice zzai;
	Cast.Listener zzaj;
	private int zzak;

	public Cast$CastOptions$Builder(CastDevice castdevice, Cast.Listener listener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		Preconditions.checkNotNull(((Object) (castdevice)), "CastDevice parameter cannot be null");
	//    2    4:aload_1         
	//    3    5:ldc1            #25  <String "CastDevice parameter cannot be null">
	//    4    7:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:pop             
		Preconditions.checkNotNull(((Object) (listener)), "CastListener parameter cannot be null");
	//    6   11:aload_2         
	//    7   12:ldc1            #33  <String "CastListener parameter cannot be null">
	//    8   14:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    9   17:pop             
		zzai = castdevice;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #35  <Field CastDevice zzai>
		zzaj = listener;
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #37  <Field Cast$Listener zzaj>
		zzak = 0;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #39  <Field int zzak>
	//   19   33:return          
	}
}
