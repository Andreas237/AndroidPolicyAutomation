// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import java.util.List;

public class JobTrigger
{
	public static final class ContentUriTrigger extends JobTrigger
	{

		public List getUris()
		{
			return uris;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field List uris>
		//    2    4:areturn         
		}

		private final List uris;

		ContentUriTrigger(List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void JobTrigger()>
			uris = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #15  <Field List uris>
		//    5    9:return          
		}
	}

	public static final class ExecutionWindowTrigger extends JobTrigger
	{

		public int getWindowEnd()
		{
			return windowEnd;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int windowEnd>
		//    2    4:ireturn         
		}

		public int getWindowStart()
		{
			return windowStart;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field int windowStart>
		//    2    4:ireturn         
		}

		private final int windowEnd;
		private final int windowStart;

		ExecutionWindowTrigger(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void JobTrigger()>
			windowStart = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #15  <Field int windowStart>
			windowEnd = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #17  <Field int windowEnd>
		//    8   14:return          
		}
	}

	public static final class ImmediateTrigger extends JobTrigger
	{

		ImmediateTrigger()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void JobTrigger()>
		//    2    4:return          
		}
	}


	public JobTrigger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
