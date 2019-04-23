// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import java.util.List;

public final class Trigger
{

	public Trigger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static JobTrigger.ContentUriTrigger contentUriTrigger(List list)
	{
		if(list != null && !list.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:ifnull          22
	//*   2    4:aload_0         
	//*   3    5:invokeinterface #26  <Method boolean List.isEmpty()>
	//*   4   10:ifne            22
			return new JobTrigger.ContentUriTrigger(list);
	//    5   13:new             #28  <Class JobTrigger$ContentUriTrigger>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:invokespecial   #31  <Method void JobTrigger$ContentUriTrigger(List)>
	//    9   21:areturn         
		else
			throw new IllegalArgumentException("Uris must not be null or empty.");
	//   10   22:new             #33  <Class IllegalArgumentException>
	//   11   25:dup             
	//   12   26:ldc1            #35  <String "Uris must not be null or empty.">
	//   13   28:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   14   31:athrow          
	}

	public static JobTrigger.ExecutionWindowTrigger executionWindow(int i, int j)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            29
		{
			if(j >= i)
	//*   2    4:iload_1         
	//*   3    5:iload_0         
	//*   4    6:icmplt          19
				return new JobTrigger.ExecutionWindowTrigger(i, j);
	//    5    9:new             #45  <Class JobTrigger$ExecutionWindowTrigger>
	//    6   12:dup             
	//    7   13:iload_0         
	//    8   14:iload_1         
	//    9   15:invokespecial   #48  <Method void JobTrigger$ExecutionWindowTrigger(int, int)>
	//   10   18:areturn         
			else
				throw new IllegalArgumentException("Window end can't be less than window start");
	//   11   19:new             #33  <Class IllegalArgumentException>
	//   12   22:dup             
	//   13   23:ldc1            #50  <String "Window end can't be less than window start">
	//   14   25:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   15   28:athrow          
		} else
		{
			throw new IllegalArgumentException("Window start can't be less than 0");
	//   16   29:new             #33  <Class IllegalArgumentException>
	//   17   32:dup             
	//   18   33:ldc1            #52  <String "Window start can't be less than 0">
	//   19   35:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   20   38:athrow          
		}
	}

	public static final JobTrigger.ImmediateTrigger NOW = new JobTrigger.ImmediateTrigger();

	static 
	{
	//    0    0:new             #10  <Class JobTrigger$ImmediateTrigger>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void JobTrigger$ImmediateTrigger()>
	//    3    7:putstatic       #15  <Field JobTrigger$ImmediateTrigger NOW>
	//*   4   10:return          
	}
}
