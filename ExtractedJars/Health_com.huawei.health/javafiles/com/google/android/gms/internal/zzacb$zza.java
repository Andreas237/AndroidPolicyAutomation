// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//			zzacb

static final class zzacb$zza extends Drawable
{
	static final class zza extends android.graphics.drawable.Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (zzacb.zza.zzxt()));
		//    0    0:invokestatic    #24  <Method zzacb$zza zzacb$zza.zzxt()>
		//    1    3:areturn         
		}

		private zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void android.graphics.drawable.Drawable$ConstantState()>
		//    2    4:return          
		}

		zza(zzacb._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void zzacb$zza$zza()>
		//    2    4:return          
		}
	}


	static zzacb$zza zzxt()
	{
		return zzaEQ;
	//    0    0:getstatic       #20  <Field zzacb$zza zzaEQ>
	//    1    3:areturn         
	}

	public void draw(Canvas canvas)
	{
	//    0    0:return          
	}

	public android.graphics.drawable.onstantState getConstantState()
	{
		return ((android.graphics.drawable.onstantState) (zzaER));
	//    0    0:getstatic       #25  <Field zzacb$zza$zza zzaER>
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

	private static final zzacb$zza zzaEQ = new zzacb$zza();
	private static final zza zzaER = new zza(((zzacb._cls1) (null)));

	static 
	{
	//    0    0:new             #2   <Class zzacb$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzacb$zza()>
	//    3    7:putstatic       #20  <Field zzacb$zza zzaEQ>
	//    4   10:new             #9   <Class zzacb$zza$zza>
	//    5   13:dup             
	//    6   14:aconst_null     
	//    7   15:invokespecial   #23  <Method void zzacb$zza$zza(zzacb$1)>
	//    8   18:putstatic       #25  <Field zzacb$zza$zza zzaER>
	//*   9   21:return          
	}

	private zzacb$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Drawable()>
	//    2    4:return          
	}
}
