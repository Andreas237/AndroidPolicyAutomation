// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.gcm:
//			OneoffTask, Task

public static class OneoffTask$Builder extends Task.Builder
{

	static long zza(OneoffTask$Builder oneofftask$builder)
	{
		return oneofftask$builder.zzbgi;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field long zzbgi>
	//    2    4:lreturn         
	}

	static long zzb(OneoffTask$Builder oneofftask$builder)
	{
		return oneofftask$builder.zzbgj;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long zzbgj>
	//    2    4:lreturn         
	}

	public OneoffTask build()
	{
		checkConditions();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method void checkConditions()>
		return new OneoffTask(this, ((OneoffTask._cls1) (null)));
	//    2    4:new             #6   <Class OneoffTask>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:invokespecial   #36  <Method void OneoffTask(OneoffTask$Builder, OneoffTask$1)>
	//    7   13:areturn         
	}

	public volatile Task build()
	{
		return ((Task) (build()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method OneoffTask build()>
	//    2    4:areturn         
	}

	protected void checkConditions()
	{
		super.checkConditions();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Task$Builder.checkConditions()>
		if(zzbgi == -1L || zzbgj == -1L)
	//*   2    4:aload_0         
	//*   3    5:getfield        #18  <Field long zzbgi>
	//*   4    8:ldc2w           #15  <Long -1L>
	//*   5   11:lcmp            
	//*   6   12:ifeq            26
	//*   7   15:aload_0         
	//*   8   16:getfield        #20  <Field long zzbgj>
	//*   9   19:ldc2w           #15  <Long -1L>
	//*  10   22:lcmp            
	//*  11   23:ifne            36
			throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
	//   12   26:new             #42  <Class IllegalArgumentException>
	//   13   29:dup             
	//   14   30:ldc1            #44  <String "Must specify an execution window using setExecutionWindow.">
	//   15   32:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   16   35:athrow          
		if(zzbgi >= zzbgj)
	//*  17   36:aload_0         
	//*  18   37:getfield        #18  <Field long zzbgi>
	//*  19   40:aload_0         
	//*  20   41:getfield        #20  <Field long zzbgj>
	//*  21   44:lcmp            
	//*  22   45:iflt            58
			throw new IllegalArgumentException("Window start must be shorter than window end.");
	//   23   48:new             #42  <Class IllegalArgumentException>
	//   24   51:dup             
	//   25   52:ldc1            #49  <String "Window start must be shorter than window end.">
	//   26   54:invokespecial   #47  <Method void IllegalArgumentException(String)>
	//   27   57:athrow          
		else
			return;
	//   28   58:return          
	}

	public OneoffTask$Builder setExecutionWindow(long l, long l1)
	{
		zzbgi = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #18  <Field long zzbgi>
		zzbgj = l1;
	//    3    5:aload_0         
	//    4    6:lload_3         
	//    5    7:putfield        #20  <Field long zzbgj>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public OneoffTask$Builder setExtras(Bundle bundle)
	{
		extras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field Bundle extras>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setExtras(Bundle bundle)
	{
		return ((Task.Builder) (setExtras(bundle)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #60  <Method OneoffTask$Builder setExtras(Bundle)>
	//    3    5:areturn         
	}

	public OneoffTask$Builder setPersisted(boolean flag)
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
	//    2    2:invokevirtual   #65  <Method OneoffTask$Builder setPersisted(boolean)>
	//    3    5:areturn         
	}

	public OneoffTask$Builder setRequiredNetwork(int i)
	{
		requiredNetworkState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int requiredNetworkState>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setRequiredNetwork(int i)
	{
		return ((Task.Builder) (setRequiredNetwork(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #74  <Method OneoffTask$Builder setRequiredNetwork(int)>
	//    3    5:areturn         
	}

	public OneoffTask$Builder setRequiresCharging(boolean flag)
	{
		requiresCharging = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean requiresCharging>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setRequiresCharging(boolean flag)
	{
		return ((Task.Builder) (setRequiresCharging(flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #80  <Method OneoffTask$Builder setRequiresCharging(boolean)>
	//    3    5:areturn         
	}

	public OneoffTask$Builder setService(Class class1)
	{
		gcmTaskService = class1.getName();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #88  <Method String Class.getName()>
	//    3    5:putfield        #92  <Field String gcmTaskService>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public volatile Task.Builder setService(Class class1)
	{
		return ((Task.Builder) (setService(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #97  <Method OneoffTask$Builder setService(Class)>
	//    3    5:areturn         
	}

	public OneoffTask$Builder setTag(String s)
	{
		tag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field String tag>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setTag(String s)
	{
		return ((Task.Builder) (setTag(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method OneoffTask$Builder setTag(String)>
	//    3    5:areturn         
	}

	public OneoffTask$Builder setUpdateCurrent(boolean flag)
	{
		updateCurrent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #109 <Field boolean updateCurrent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public volatile Task.Builder setUpdateCurrent(boolean flag)
	{
		return ((Task.Builder) (setUpdateCurrent(flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #111 <Method OneoffTask$Builder setUpdateCurrent(boolean)>
	//    3    5:areturn         
	}

	private long zzbgi;
	private long zzbgj;

	public OneoffTask$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Task$Builder()>
		zzbgi = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #15  <Long -1L>
	//    4    8:putfield        #18  <Field long zzbgi>
		zzbgj = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #15  <Long -1L>
	//    7   15:putfield        #20  <Field long zzbgj>
		isPersisted = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #24  <Field boolean isPersisted>
	//   11   23:return          
	}
}
