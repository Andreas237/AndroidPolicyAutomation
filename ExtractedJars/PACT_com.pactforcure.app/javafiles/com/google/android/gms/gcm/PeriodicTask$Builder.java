// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.gcm:
//			PeriodicTask, Task

public static class PeriodicTask$Builder extends Task.Builder
{

	static long zza(PeriodicTask$Builder periodictask$builder)
	{
		return periodictask$builder.zzbgk;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field long zzbgk>
	//    2    4:lreturn         
	}

	static long zzb(PeriodicTask$Builder periodictask$builder)
	{
		return periodictask$builder.zzbgl;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long zzbgl>
	//    2    4:lreturn         
	}

	public PeriodicTask build()
	{
		checkConditions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method void checkConditions()>
		return new PeriodicTask(this, ((PeriodicTask._cls1) (null)));
	//    2    4:new             #6   <Class PeriodicTask>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #36  <Method void PeriodicTask(PeriodicTask$Builder, PeriodicTask$1)>
	//    7   13:areturn         
	}

	public volatile Task build()
	{
		return ((Task) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method PeriodicTask build()>
	//    2    4:areturn         
	}

	protected void checkConditions()
	{
		super.checkConditions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Task$Builder.checkConditions()>
		if(zzbgk == -1L)
	//*   2    4:aload_0         
	//*   3    5:getfield        #18  <Field long zzbgk>
	//*   4    8:ldc2w           #15  <Long -1L>
	//*   5   11:lcmp            
	//*   6   12:ifne            25
			throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
	//    7   15:new             #42  <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:ldc1            #44  <String "Must call setPeriod(long) to establish an execution interval for this periodic task.">
	//   10   21:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   11   24:athrow          
		if(zzbgk <= 0L)
	//*  12   25:aload_0         
	//*  13   26:getfield        #18  <Field long zzbgk>
	//*  14   29:lconst_0        
	//*  15   30:lcmp            
	//*  16   31:ifgt            68
		{
			long l = zzbgk;
	//   17   34:aload_0         
	//   18   35:getfield        #18  <Field long zzbgk>
	//   19   38:lstore_1        
			throw new IllegalArgumentException((new StringBuilder(66)).append("Period set cannot be less than or equal to 0: ").append(l).toString());
	//   20   39:new             #42  <Class IllegalArgumentException>
	//   21   42:dup             
	//   22   43:new             #49  <Class StringBuilder>
	//   23   46:dup             
	//   24   47:bipush          66
	//   25   49:invokespecial   #52  <Method void StringBuilder(int)>
	//   26   52:ldc1            #54  <String "Period set cannot be less than or equal to 0: ">
	//   27   54:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   28   57:lload_1         
	//   29   58:invokevirtual   #61  <Method StringBuilder StringBuilder.append(long)>
	//   30   61:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   31   64:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   32   67:athrow          
		}
		if(zzbgl == -1L)
	//*  33   68:aload_0         
	//*  34   69:getfield        #20  <Field long zzbgl>
	//*  35   72:ldc2w           #15  <Long -1L>
	//*  36   75:lcmp            
	//*  37   76:ifne            93
			zzbgl = (long)((float)zzbgk * 0.1F);
	//   38   79:aload_0         
	//   39   80:aload_0         
	//   40   81:getfield        #18  <Field long zzbgk>
	//   41   84:l2f             
	//   42   85:ldc1            #66  <Float 0.1F>
	//   43   87:fmul            
	//   44   88:f2l             
	//   45   89:putfield        #20  <Field long zzbgl>
		else
	//*  46   92:return          
		if(zzbgl > zzbgk)
	//*  47   93:aload_0         
	//*  48   94:getfield        #20  <Field long zzbgl>
	//*  49   97:aload_0         
	//*  50   98:getfield        #18  <Field long zzbgk>
	//*  51  101:lcmp            
	//*  52  102:ifle            92
		{
			zzbgl = zzbgk;
	//   53  105:aload_0         
	//   54  106:aload_0         
	//   55  107:getfield        #18  <Field long zzbgk>
	//   56  110:putfield        #20  <Field long zzbgl>
			return;
	//   57  113:return          
		}
	}

	public PeriodicTask$Builder setExtras(Bundle bundle)
	{
		extras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field Bundle extras>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setExtras(Bundle bundle)
	{
		return ((Task.Builder) (setExtras(bundle)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #75  <Method PeriodicTask$Builder setExtras(Bundle)>
	//    3    5:areturn         
	}

	public PeriodicTask$Builder setFlex(long l)
	{
		zzbgl = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #20  <Field long zzbgl>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PeriodicTask$Builder setPeriod(long l)
	{
		zzbgk = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #18  <Field long zzbgk>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PeriodicTask$Builder setPersisted(boolean flag)
	{
		isPersisted = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean isPersisted>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setPersisted(boolean flag)
	{
		return ((Task.Builder) (setPersisted(flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #83  <Method PeriodicTask$Builder setPersisted(boolean)>
	//    3    5:areturn         
	}

	public PeriodicTask$Builder setRequiredNetwork(int i)
	{
		requiredNetworkState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field int requiredNetworkState>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setRequiredNetwork(int i)
	{
		return ((Task.Builder) (setRequiredNetwork(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #92  <Method PeriodicTask$Builder setRequiredNetwork(int)>
	//    3    5:areturn         
	}

	public PeriodicTask$Builder setRequiresCharging(boolean flag)
	{
		requiresCharging = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #96  <Field boolean requiresCharging>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setRequiresCharging(boolean flag)
	{
		return ((Task.Builder) (setRequiresCharging(flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #98  <Method PeriodicTask$Builder setRequiresCharging(boolean)>
	//    3    5:areturn         
	}

	public PeriodicTask$Builder setService(Class class1)
	{
		gcmTaskService = class1.getName();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method String Class.getName()>
	//    3    5:putfield        #109 <Field String gcmTaskService>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public volatile Task.Builder setService(Class class1)
	{
		return ((Task.Builder) (setService(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #114 <Method PeriodicTask$Builder setService(Class)>
	//    3    5:areturn         
	}

	public PeriodicTask$Builder setTag(String s)
	{
		tag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field String tag>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setTag(String s)
	{
		return ((Task.Builder) (setTag(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #122 <Method PeriodicTask$Builder setTag(String)>
	//    3    5:areturn         
	}

	public PeriodicTask$Builder setUpdateCurrent(boolean flag)
	{
		updateCurrent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #126 <Field boolean updateCurrent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setUpdateCurrent(boolean flag)
	{
		return ((Task.Builder) (setUpdateCurrent(flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #128 <Method PeriodicTask$Builder setUpdateCurrent(boolean)>
	//    3    5:areturn         
	}

	private long zzbgk;
	private long zzbgl;

	public PeriodicTask$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Task$Builder()>
		zzbgk = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #15  <Long -1L>
	//    4    8:putfield        #18  <Field long zzbgk>
		zzbgl = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #15  <Long -1L>
	//    7   15:putfield        #20  <Field long zzbgl>
		isPersisted = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #24  <Field boolean isPersisted>
	//   11   23:return          
	}
}
