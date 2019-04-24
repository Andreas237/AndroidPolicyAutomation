// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.*;

// Referenced classes of package android.support.v4.app:
//			JobIntentService

static abstract class JobIntentService$WorkEnqueuer
{

	abstract void enqueueWork(Intent intent);

	void ensureJobId(int i)
	{
		if(!mHasJobId)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean mHasJobId>
	//*   2    4:ifne            18
		{
			mHasJobId = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #27  <Field boolean mHasJobId>
			mJobId = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #29  <Field int mJobId>
		} else
	//*   9   17:return          
		if(mJobId != i)
	//*  10   18:aload_0         
	//*  11   19:getfield        #29  <Field int mJobId>
	//*  12   22:iload_1         
	//*  13   23:icmpeq          17
			throw new IllegalArgumentException((new StringBuilder()).append("Given job ID ").append(i).append(" is different than previous ").append(mJobId).toString());
	//   14   26:new             #31  <Class IllegalArgumentException>
	//   15   29:dup             
	//   16   30:new             #33  <Class StringBuilder>
	//   17   33:dup             
	//   18   34:invokespecial   #34  <Method void StringBuilder()>
	//   19   37:ldc1            #36  <String "Given job ID ">
	//   20   39:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:iload_1         
	//   22   43:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   23   46:ldc1            #45  <String " is different than previous ">
	//   24   48:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:aload_0         
	//   26   52:getfield        #29  <Field int mJobId>
	//   27   55:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   28   58:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   29   61:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   30   64:athrow          
	}

	public void serviceProcessingFinished()
	{
	//    0    0:return          
	}

	public void serviceProcessingStarted()
	{
	//    0    0:return          
	}

	public void serviceStartReceived()
	{
	//    0    0:return          
	}

	final ComponentName mComponentName;
	boolean mHasJobId;
	int mJobId;

	JobIntentService$WorkEnqueuer(Context context, ComponentName componentname)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mComponentName = componentname;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #20  <Field ComponentName mComponentName>
	//    5    9:return          
	}
}
