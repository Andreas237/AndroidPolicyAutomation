// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;


public class SystemIdInfo
{

	public SystemIdInfo(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		workSpecId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field String workSpecId>
		systemId = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #38  <Field int systemId>
	//    8   14:return          
	}

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
	//*   8   12:invokevirtual   #46  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #46  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((SystemIdInfo)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class SystemIdInfo>
	//   16   28:astore_1        
			if(systemId != ((SystemIdInfo) (obj)).systemId)
	//*  17   29:aload_0         
	//*  18   30:getfield        #38  <Field int systemId>
	//*  19   33:aload_1         
	//*  20   34:getfield        #38  <Field int systemId>
	//*  21   37:icmpeq          42
				return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
			else
				return workSpecId.equals(((Object) (((SystemIdInfo) (obj)).workSpecId)));
	//   24   42:aload_0         
	//   25   43:getfield        #36  <Field String workSpecId>
	//   26   46:aload_1         
	//   27   47:getfield        #36  <Field String workSpecId>
	//   28   50:invokevirtual   #50  <Method boolean String.equals(Object)>
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
		return workSpecId.hashCode() * 31 + systemId;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String workSpecId>
	//    2    4:invokevirtual   #54  <Method int String.hashCode()>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #38  <Field int systemId>
	//    7   14:iadd            
	//    8   15:ireturn         
	}

	public final int systemId;
	public final String workSpecId;
}
