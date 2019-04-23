// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.location:
//			ActivityTransition, DetectedActivity

public static class ActivityTransition$Builder
{

	public ActivityTransition build()
	{
		int i = zzi;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int zzi>
	//    2    4:istore_1        
		boolean flag1 = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		boolean flag;
		if(i != -1)
	//*   5    7:iload_1         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          17
			flag = true;
	//    8   12:iconst_1        
	//    9   13:istore_2        
		else
	//*  10   14:goto            19
			flag = false;
	//   11   17:iconst_0        
	//   12   18:istore_2        
		Preconditions.checkState(flag, "Activity type not set.");
	//   13   19:iload_2         
	//   14   20:ldc1            #23  <String "Activity type not set.">
	//   15   22:invokestatic    #29  <Method void Preconditions.checkState(boolean, Object)>
		if(zzj != -1)
	//*  16   25:aload_0         
	//*  17   26:getfield        #18  <Field int zzj>
	//*  18   29:iconst_m1       
	//*  19   30:icmpeq          38
			flag = flag1;
	//   20   33:iload_3         
	//   21   34:istore_2        
		else
	//*  22   35:goto            40
			flag = false;
	//   23   38:iconst_0        
	//   24   39:istore_2        
		Preconditions.checkState(flag, "Activity transition type not set.");
	//   25   40:iload_2         
	//   26   41:ldc1            #31  <String "Activity transition type not set.">
	//   27   43:invokestatic    #29  <Method void Preconditions.checkState(boolean, Object)>
		return new ActivityTransition(zzi, zzj);
	//   28   46:new             #6   <Class ActivityTransition>
	//   29   49:dup             
	//   30   50:aload_0         
	//   31   51:getfield        #16  <Field int zzi>
	//   32   54:aload_0         
	//   33   55:getfield        #18  <Field int zzj>
	//   34   58:invokespecial   #34  <Method void ActivityTransition(int, int)>
	//   35   61:areturn         
	}

	public ActivityTransition$Builder setActivityTransition(int i)
	{
		ActivityTransition.zza(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #40  <Method void ActivityTransition.zza(int)>
		zzj = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int zzj>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ActivityTransition$Builder setActivityType(int i)
	{
		DetectedActivity.zzb(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #46  <Method void DetectedActivity.zzb(int)>
		zzi = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int zzi>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	private int zzi;
	private int zzj;

	public ActivityTransition$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzi = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #16  <Field int zzi>
		zzj = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #18  <Field int zzj>
	//    8   14:return          
	}
}
