// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import androidx.work.impl.model.WorkSpec;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package androidx.work:
//			WorkRequest, OverwritingInputMerger, Constraints

public final class OneTimeWorkRequest extends WorkRequest
{
	public static final class Builder extends WorkRequest.Builder
	{

		OneTimeWorkRequest buildInternal()
		{
			if(mBackoffCriteriaSet && android.os.Build.VERSION.SDK_INT >= 23 && mWorkSpec.constraints.requiresDeviceIdle())
		//*   0    0:aload_0         
		//*   1    1:getfield        #41  <Field boolean mBackoffCriteriaSet>
		//*   2    4:ifeq            41
		//*   3    7:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
		//*   4   10:bipush          23
		//*   5   12:icmplt          41
		//*   6   15:aload_0         
		//*   7   16:getfield        #17  <Field WorkSpec mWorkSpec>
		//*   8   19:getfield        #51  <Field Constraints WorkSpec.constraints>
		//*   9   22:invokevirtual   #57  <Method boolean Constraints.requiresDeviceIdle()>
		//*  10   25:ifne            31
		//*  11   28:goto            41
				throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
		//   12   31:new             #59  <Class IllegalArgumentException>
		//   13   34:dup             
		//   14   35:ldc1            #61  <String "Cannot set backoff criteria on an idle mode job">
		//   15   37:invokespecial   #64  <Method void IllegalArgumentException(String)>
		//   16   40:athrow          
			else
				return new OneTimeWorkRequest(this);
		//   17   41:new             #7   <Class OneTimeWorkRequest>
		//   18   44:dup             
		//   19   45:aload_0         
		//   20   46:invokespecial   #67  <Method void OneTimeWorkRequest(OneTimeWorkRequest$Builder)>
		//   21   49:areturn         
		}

		volatile WorkRequest buildInternal()
		{
			return ((WorkRequest) (buildInternal()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #71  <Method OneTimeWorkRequest buildInternal()>
		//    2    4:areturn         
		}

		Builder getThis()
		{
			return this;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		volatile WorkRequest.Builder getThis()
		{
			return ((WorkRequest.Builder) (getThis()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #76  <Method OneTimeWorkRequest$Builder getThis()>
		//    2    4:areturn         
		}

		public Builder setInitialDelay(long l, TimeUnit timeunit)
		{
			mWorkSpec.initialDelay = timeunit.toMillis(l);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field WorkSpec mWorkSpec>
		//    2    4:aload_3         
		//    3    5:lload_1         
		//    4    6:invokevirtual   #84  <Method long TimeUnit.toMillis(long)>
		//    5    9:putfield        #88  <Field long WorkSpec.initialDelay>
			return this;
		//    6   12:aload_0         
		//    7   13:areturn         
		}

		public Builder(Class class1)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #13  <Method void WorkRequest$Builder(Class)>
			mWorkSpec.inputMergerClassName = ((Class) (androidx/work/OverwritingInputMerger)).getName();
		//    3    5:aload_0         
		//    4    6:getfield        #17  <Field WorkSpec mWorkSpec>
		//    5    9:ldc1            #19  <Class OverwritingInputMerger>
		//    6   11:invokevirtual   #25  <Method String Class.getName()>
		//    7   14:putfield        #31  <Field String WorkSpec.inputMergerClassName>
		//    8   17:return          
		}
	}


	OneTimeWorkRequest(Builder builder)
	{
		super(builder.mId, builder.mWorkSpec, builder.mTags);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #13  <Field java.util.UUID OneTimeWorkRequest$Builder.mId>
	//    3    5:aload_1         
	//    4    6:getfield        #17  <Field WorkSpec OneTimeWorkRequest$Builder.mWorkSpec>
	//    5    9:aload_1         
	//    6   10:getfield        #21  <Field java.util.Set OneTimeWorkRequest$Builder.mTags>
	//    7   13:invokespecial   #24  <Method void WorkRequest(java.util.UUID, WorkSpec, java.util.Set)>
	//    8   16:return          
	}

	public static List from(List list)
	{
		ArrayList arraylist = new ArrayList(list.size());
	//    0    0:new             #30  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #36  <Method int List.size()>
	//    4   10:invokespecial   #39  <Method void ArrayList(int)>
	//    5   13:astore_1        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((List) (arraylist)).add(((Object) ((new Builder((Class)((Iterator) (list)).next())).build()))));
	//    6   14:aload_0         
	//    7   15:invokeinterface #43  <Method Iterator List.iterator()>
	//    8   20:astore_0        
	//    9   21:aload_0         
	//   10   22:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            59
	//   12   30:aload_1         
	//   13   31:new             #6   <Class OneTimeWorkRequest$Builder>
	//   14   34:dup             
	//   15   35:aload_0         
	//   16   36:invokeinterface #53  <Method Object Iterator.next()>
	//   17   41:checkcast       #55  <Class Class>
	//   18   44:invokespecial   #58  <Method void OneTimeWorkRequest$Builder(Class)>
	//   19   47:invokevirtual   #62  <Method WorkRequest OneTimeWorkRequest$Builder.build()>
	//   20   50:invokeinterface #66  <Method boolean List.add(Object)>
	//   21   55:pop             
	//*  22   56:goto            21
		return ((List) (arraylist));
	//   23   59:aload_1         
	//   24   60:areturn         
	}

	public static transient List from(Class aclass[])
	{
		return from(Arrays.asList(((Object []) (aclass))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #78  <Method List Arrays.asList(Object[])>
	//    2    4:invokestatic    #80  <Method List from(List)>
	//    3    7:areturn         
	}
}
