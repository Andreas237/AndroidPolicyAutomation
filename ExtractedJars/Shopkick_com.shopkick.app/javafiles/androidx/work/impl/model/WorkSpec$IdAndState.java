// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;


// Referenced classes of package androidx.work.impl.model:
//			WorkSpec

public static class WorkSpec$IdAndState
{

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          54
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #24  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #24  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((WorkSpec$IdAndState)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class WorkSpec$IdAndState>
	//   16   28:astore_1        
			if(state != ((WorkSpec$IdAndState) (obj)).state)
	//*  17   29:aload_0         
	//*  18   30:getfield        #26  <Field androidx.work.WorkInfo$State state>
	//*  19   33:aload_1         
	//*  20   34:getfield        #26  <Field androidx.work.WorkInfo$State state>
	//*  21   37:if_acmpeq       42
				return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
			else
				return id.equals(((Object) (((WorkSpec$IdAndState) (obj)).id)));
	//   24   42:aload_0         
	//   25   43:getfield        #28  <Field String id>
	//   26   46:aload_1         
	//   27   47:getfield        #28  <Field String id>
	//   28   50:invokevirtual   #32  <Method boolean String.equals(Object)>
	//   29   53:ireturn         
		} else
		{
			return false;
	//   30   54:iconst_0        
	//   31   55:ireturn         
		}
	}

	public int hashCode()
	{
		return id.hashCode() * 31 + state.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String id>
	//    2    4:invokevirtual   #36  <Method int String.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #26  <Field androidx.work.WorkInfo$State state>
	//    7   14:invokevirtual   #39  <Method int androidx.work.WorkInfo$State.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	public String id;
	public androidx.work.WorkInfo.State state;

	public WorkSpec$IdAndState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
