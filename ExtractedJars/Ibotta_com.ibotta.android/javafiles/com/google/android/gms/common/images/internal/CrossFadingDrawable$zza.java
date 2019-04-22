// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.common.images.internal:
//			CrossFadingDrawable, zzb

private static final class CrossFadingDrawable$zza extends Drawable
{

	static CrossFadingDrawable$zza zzcp()
	{
		return zzqj;
	//    0    0:getstatic       #18  <Field CrossFadingDrawable$zza zzqj>
	//    1    3:areturn         
	}

	public final void draw(Canvas canvas)
	{
	//    0    0:return          
	}

	public final android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		return ((android.graphics.drawable.Drawable.ConstantState) (zzqk));
	//    0    0:getstatic       #25  <Field zzb zzqk>
	//    1    3:areturn         
	}

	public final int getOpacity()
	{
		return -2;
	//    0    0:bipush          -2
	//    1    2:ireturn         
	}

	public final void setAlpha(int i)
	{
	//    0    0:return          
	}

	public final void setColorFilter(ColorFilter colorfilter)
	{
	//    0    0:return          
	}

	private static final CrossFadingDrawable$zza zzqj = new CrossFadingDrawable$zza();
	private static final zzb zzqk = new zzb(((zza) (null)));

	static 
	{
	//    0    0:new             #2   <Class CrossFadingDrawable$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void CrossFadingDrawable$zza()>
	//    3    7:putstatic       #18  <Field CrossFadingDrawable$zza zzqj>
	//    4   10:new             #20  <Class zzb>
	//    5   13:dup             
	//    6   14:aconst_null     
	//    7   15:invokespecial   #23  <Method void zzb(zza)>
	//    8   18:putstatic       #25  <Field zzb zzqk>
	//*   9   21:return          
	}

	private CrossFadingDrawable$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Drawable()>
	//    2    4:return          
	}
}
