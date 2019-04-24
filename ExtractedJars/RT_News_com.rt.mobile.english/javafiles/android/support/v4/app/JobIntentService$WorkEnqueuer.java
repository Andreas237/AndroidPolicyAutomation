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
		if(mJobId != i)
	//*  10   18:aload_0         
	//*  11   19:getfield        #29  <Field int mJobId>
	//*  12   22:iload_1         
	//*  13   23:icmpeq          75
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   26:new             #31  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #32  <Method void StringBuilder()>
	//   17   33:astore_2        
			stringbuilder.append("Given job ID ");
	//   18   34:aload_2         
	//   19   35:ldc1            #34  <String "Given job ID ">
	//   20   37:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			stringbuilder.append(i);
	//   22   41:aload_2         
	//   23   42:iload_1         
	//   24   43:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   25   46:pop             
			stringbuilder.append(" is different than previous ");
	//   26   47:aload_2         
	//   27   48:ldc1            #43  <String " is different than previous ">
	//   28   50:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			stringbuilder.append(mJobId);
	//   30   54:aload_2         
	//   31   55:aload_0         
	//   32   56:getfield        #29  <Field int mJobId>
	//   33   59:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   34   62:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   35   63:new             #45  <Class IllegalArgumentException>
	//   36   66:dup             
	//   37   67:aload_2         
	//   38   68:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   39   71:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   40   74:athrow          
		} else
		{
			return;
	//   41   75:return          
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
