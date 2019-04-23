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
			return;
	//    9   17:return          
		}
		if(mJobId == i)
	//*  10   18:aload_0         
	//*  11   19:getfield        #29  <Field int mJobId>
	//*  12   22:iload_1         
	//*  13   23:icmpne          27
		{
			return;
	//   14   26:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   27:new             #31  <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #32  <Method void StringBuilder()>
	//   18   34:astore_2        
			stringbuilder.append("Given job ID ");
	//   19   35:aload_2         
	//   20   36:ldc1            #34  <String "Given job ID ">
	//   21   38:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
			stringbuilder.append(i);
	//   23   42:aload_2         
	//   24   43:iload_1         
	//   25   44:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   26   47:pop             
			stringbuilder.append(" is different than previous ");
	//   27   48:aload_2         
	//   28   49:ldc1            #43  <String " is different than previous ">
	//   29   51:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
			stringbuilder.append(mJobId);
	//   31   55:aload_2         
	//   32   56:aload_0         
	//   33   57:getfield        #29  <Field int mJobId>
	//   34   60:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   35   63:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   36   64:new             #45  <Class IllegalArgumentException>
	//   37   67:dup             
	//   38   68:aload_2         
	//   39   69:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   40   72:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   41   75:athrow          
		}
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
