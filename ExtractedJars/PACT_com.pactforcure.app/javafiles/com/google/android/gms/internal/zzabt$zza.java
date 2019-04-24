// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//			zzabt

private static final class zzabt$zza extends Drawable
{
	private static final class zza extends android.graphics.drawable.Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (zzabt.zza.zzwN()));
		//    0    0:invokestatic    #24  <Method zzabt$zza zzabt$zza.zzwN()>
		//    1    3:areturn         
		}

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void android.graphics.drawable.Drawable$ConstantState()>
		//    2    4:return          
		}

		zza(zzabt._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void zzabt$zza$zza()>
		//    2    4:return          
		}
	}


	static zzabt$zza zzwN()
	{
		return zzaDr;
	//    0    0:getstatic       #20  <Field zzabt$zza zzaDr>
	//    1    3:areturn         
	}

	public void draw(Canvas canvas)
	{
	//    0    0:return          
	}

	public android.graphics.drawable.onstantState getConstantState()
	{
		return ((android.graphics.drawable.onstantState) (zzaDs));
	//    0    0:getstatic       #25  <Field zzabt$zza$zza zzaDs>
	//    1    3:areturn         
	}

	public int getOpacity()
	{
		return -2;
	//    0    0:bipush          -2
	//    1    2:ireturn         
	}

	public void setAlpha(int i)
	{
	//    0    0:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
	//    0    0:return          
	}

	private static final zzabt$zza zzaDr = new zzabt$zza();
	private static final zza zzaDs = new zza(((zzabt._cls1) (null)));

	static 
	{
	//    0    0:new             #2   <Class zzabt$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzabt$zza()>
	//    3    7:putstatic       #20  <Field zzabt$zza zzaDr>
	//    4   10:new             #9   <Class zzabt$zza$zza>
	//    5   13:dup             
	//    6   14:aconst_null     
	//    7   15:invokespecial   #23  <Method void zzabt$zza$zza(zzabt$1)>
	//    8   18:putstatic       #25  <Field zzabt$zza$zza zzaDs>
	//*   9   21:return          
	}

	private zzabt$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Drawable()>
	//    2    4:return          
	}
}
