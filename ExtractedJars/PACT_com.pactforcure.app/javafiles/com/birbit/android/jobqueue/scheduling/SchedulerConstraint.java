// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.scheduling;


public class SchedulerConstraint
{

	public SchedulerConstraint(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		uuid = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String uuid>
	//    5    9:return          
	}

	public Object getData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object data>
	//    2    4:areturn         
	}

	public long getDelayInMs()
	{
		return delayInMs;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long delayInMs>
	//    2    4:lreturn         
	}

	public int getNetworkStatus()
	{
		return networkStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int networkStatus>
	//    2    4:ireturn         
	}

	public Long getOverrideDeadlineInMs()
	{
		return overrideDeadlineInMs;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Long overrideDeadlineInMs>
	//    2    4:areturn         
	}

	public String getUuid()
	{
		return uuid;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String uuid>
	//    2    4:areturn         
	}

	public void setData(Object obj)
	{
		data = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Object data>
	//    3    5:return          
	}

	public void setDelayInMs(long l)
	{
		delayInMs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #30  <Field long delayInMs>
	//    3    5:return          
	}

	public void setNetworkStatus(int i)
	{
		networkStatus = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int networkStatus>
	//    3    5:return          
	}

	public void setOverrideDeadlineInMs(Long long1)
	{
		overrideDeadlineInMs = long1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field Long overrideDeadlineInMs>
	//    3    5:return          
	}

	public void setUuid(String s)
	{
		uuid = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String uuid>
	//    3    5:return          
	}

	public String toString()
	{
		return (new StringBuilder()).append("SchedulerConstraint{uuid='").append(uuid).append('\'').append(", delayInMs=").append(delayInMs).append(", networkStatus=").append(networkStatus).append(", overrideDeadlineInMs=").append(((Object) (overrideDeadlineInMs))).append(", data=").append(data).append('}').toString();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void StringBuilder()>
	//    3    7:ldc1            #57  <String "SchedulerConstraint{uuid='">
	//    4    9:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field String uuid>
	//    7   16:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:bipush          39
	//    9   21:invokevirtual   #64  <Method StringBuilder StringBuilder.append(char)>
	//   10   24:ldc1            #66  <String ", delayInMs=">
	//   11   26:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_0         
	//   13   30:getfield        #30  <Field long delayInMs>
	//   14   33:invokevirtual   #69  <Method StringBuilder StringBuilder.append(long)>
	//   15   36:ldc1            #71  <String ", networkStatus=">
	//   16   38:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   17   41:aload_0         
	//   18   42:getfield        #34  <Field int networkStatus>
	//   19   45:invokevirtual   #74  <Method StringBuilder StringBuilder.append(int)>
	//   20   48:ldc1            #76  <String ", overrideDeadlineInMs=">
	//   21   50:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   22   53:aload_0         
	//   23   54:getfield        #39  <Field Long overrideDeadlineInMs>
	//   24   57:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
	//   25   60:ldc1            #81  <String ", data=">
	//   26   62:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   27   65:aload_0         
	//   28   66:getfield        #26  <Field Object data>
	//   29   69:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
	//   30   72:bipush          125
	//   31   74:invokevirtual   #64  <Method StringBuilder StringBuilder.append(char)>
	//   32   77:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   33   80:areturn         
	}

	private Object data;
	private long delayInMs;
	private int networkStatus;
	private Long overrideDeadlineInMs;
	private String uuid;
}
