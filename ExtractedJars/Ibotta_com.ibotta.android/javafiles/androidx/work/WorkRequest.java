// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import androidx.work.impl.model.WorkSpec;
import java.util.*;

// Referenced classes of package androidx.work:
//			Constraints

public abstract class WorkRequest
{
	public static abstract class Builder
	{

		public final Builder addTag(String s)
		{
			mTags.add(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Set mTags>
		//    2    4:aload_1         
		//    3    5:invokeinterface #68  <Method boolean Set.add(Object)>
		//    4   10:pop             
			return getThis();
		//    5   11:aload_0         
		//    6   12:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    7   15:areturn         
		}

		public final WorkRequest build()
		{
			WorkRequest workrequest = buildInternal();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #79  <Method WorkRequest buildInternal()>
		//    2    4:astore_1        
			mId = UUID.randomUUID();
		//    3    5:aload_0         
		//    4    6:invokestatic    #36  <Method UUID UUID.randomUUID()>
		//    5    9:putfield        #38  <Field UUID mId>
			mWorkSpec = new WorkSpec(mWorkSpec);
		//    6   12:aload_0         
		//    7   13:new             #40  <Class WorkSpec>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #54  <Field WorkSpec mWorkSpec>
		//   11   21:invokespecial   #82  <Method void WorkSpec(WorkSpec)>
		//   12   24:putfield        #54  <Field WorkSpec mWorkSpec>
			mWorkSpec.id = mId.toString();
		//   13   27:aload_0         
		//   14   28:getfield        #54  <Field WorkSpec mWorkSpec>
		//   15   31:aload_0         
		//   16   32:getfield        #38  <Field UUID mId>
		//   17   35:invokevirtual   #44  <Method String UUID.toString()>
		//   18   38:putfield        #86  <Field String WorkSpec.id>
			return workrequest;
		//   19   41:aload_1         
		//   20   42:areturn         
		}

		abstract WorkRequest buildInternal();

		abstract Builder getThis();

		public final Builder setConstraints(Constraints constraints)
		{
			mWorkSpec.constraints = constraints;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field WorkSpec mWorkSpec>
		//    2    4:aload_1         
		//    3    5:putfield        #93  <Field Constraints WorkSpec.constraints>
			return getThis();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #72  <Method WorkRequest$Builder getThis()>
		//    6   12:areturn         
		}

		boolean mBackoffCriteriaSet;
		UUID mId;
		Set mTags;
		WorkSpec mWorkSpec;

		Builder(Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			mBackoffCriteriaSet = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #25  <Field boolean mBackoffCriteriaSet>
			mTags = ((Set) (new HashSet()));
		//    5    9:aload_0         
		//    6   10:new             #27  <Class HashSet>
		//    7   13:dup             
		//    8   14:invokespecial   #28  <Method void HashSet()>
		//    9   17:putfield        #30  <Field Set mTags>
			mId = UUID.randomUUID();
		//   10   20:aload_0         
		//   11   21:invokestatic    #36  <Method UUID UUID.randomUUID()>
		//   12   24:putfield        #38  <Field UUID mId>
			mWorkSpec = new WorkSpec(mId.toString(), class1.getName());
		//   13   27:aload_0         
		//   14   28:new             #40  <Class WorkSpec>
		//   15   31:dup             
		//   16   32:aload_0         
		//   17   33:getfield        #38  <Field UUID mId>
		//   18   36:invokevirtual   #44  <Method String UUID.toString()>
		//   19   39:aload_1         
		//   20   40:invokevirtual   #49  <Method String Class.getName()>
		//   21   43:invokespecial   #52  <Method void WorkSpec(String, String)>
		//   22   46:putfield        #54  <Field WorkSpec mWorkSpec>
			addTag(class1.getName());
		//   23   49:aload_0         
		//   24   50:aload_1         
		//   25   51:invokevirtual   #49  <Method String Class.getName()>
		//   26   54:invokevirtual   #58  <Method WorkRequest$Builder addTag(String)>
		//   27   57:pop             
		//   28   58:return          
		}
	}


	protected WorkRequest(UUID uuid, WorkSpec workspec, Set set)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mId = uuid;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field UUID mId>
		mWorkSpec = workspec;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field WorkSpec mWorkSpec>
		mTags = set;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field Set mTags>
	//   11   19:return          
	}

	public String getStringId()
	{
		return mId.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field UUID mId>
	//    2    4:invokevirtual   #42  <Method String UUID.toString()>
	//    3    7:areturn         
	}

	public Set getTags()
	{
		return mTags;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Set mTags>
	//    2    4:areturn         
	}

	public WorkSpec getWorkSpec()
	{
		return mWorkSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field WorkSpec mWorkSpec>
	//    2    4:areturn         
	}

	private UUID mId;
	private Set mTags;
	private WorkSpec mWorkSpec;
}
