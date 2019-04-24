// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//			zzacb

static final class zzacb$zzb extends android.graphics.drawable.onstantState
{

	public int getChangingConfigurations()
	{
		return mChangingConfigurations;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int mChangingConfigurations>
	//    2    4:ireturn         
	}

	public Drawable newDrawable()
	{
		return ((Drawable) (new zzacb(this)));
	//    0    0:new             #6   <Class zzacb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #26  <Method void zzacb(zzacb$zzb)>
	//    4    8:areturn         
	}

	int mChangingConfigurations;
	int zzaES;

	zzacb$zzb(zzacb$zzb zzacb$zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void android.graphics.drawable.Drawable$ConstantState()>
		if(zzacb$zzb1 != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          24
		{
			mChangingConfigurations = zzacb$zzb1.mChangingConfigurations;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #17  <Field int mChangingConfigurations>
	//    7   13:putfield        #17  <Field int mChangingConfigurations>
			zzaES = zzacb$zzb1.zzaES;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #19  <Field int zzaES>
	//   11   21:putfield        #19  <Field int zzaES>
		}
	//   12   24:return          
	}
}
