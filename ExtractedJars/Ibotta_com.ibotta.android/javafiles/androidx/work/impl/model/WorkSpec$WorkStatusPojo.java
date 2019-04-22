// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;

import androidx.work.*;
import java.util.List;
import java.util.UUID;

// Referenced classes of package androidx.work.impl.model:
//			WorkSpec

public static class WorkSpec$WorkStatusPojo
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
	//*   6    8:ifnull          135
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #37  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #37  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((WorkSpec$WorkStatusPojo)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class WorkSpec$WorkStatusPojo>
	//   16   28:astore_1        
			Object obj1 = ((Object) (id));
	//   17   29:aload_0         
	//   18   30:getfield        #39  <Field String id>
	//   19   33:astore_2        
			if(obj1 != null)
	//*  20   34:aload_2         
	//*  21   35:ifnull          51
			{
				if(!((String) (obj1)).equals(((Object) (((WorkSpec$WorkStatusPojo) (obj)).id))))
	//*  22   38:aload_2         
	//*  23   39:aload_1         
	//*  24   40:getfield        #39  <Field String id>
	//*  25   43:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  26   46:ifne            60
					return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
			} else
			if(((WorkSpec$WorkStatusPojo) (obj)).id != null)
	//*  29   51:aload_1         
	//*  30   52:getfield        #39  <Field String id>
	//*  31   55:ifnull          60
				return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
			if(state != ((WorkSpec$WorkStatusPojo) (obj)).state)
	//*  34   60:aload_0         
	//*  35   61:getfield        #45  <Field State state>
	//*  36   64:aload_1         
	//*  37   65:getfield        #45  <Field State state>
	//*  38   68:if_acmpeq       73
				return false;
	//   39   71:iconst_0        
	//   40   72:ireturn         
			obj1 = ((Object) (output));
	//   41   73:aload_0         
	//   42   74:getfield        #47  <Field Data output>
	//   43   77:astore_2        
			if(obj1 != null)
	//*  44   78:aload_2         
	//*  45   79:ifnull          95
			{
				if(!((Data) (obj1)).equals(((Object) (((WorkSpec$WorkStatusPojo) (obj)).output))))
	//*  46   82:aload_2         
	//*  47   83:aload_1         
	//*  48   84:getfield        #47  <Field Data output>
	//*  49   87:invokevirtual   #50  <Method boolean Data.equals(Object)>
	//*  50   90:ifne            104
					return false;
	//   51   93:iconst_0        
	//   52   94:ireturn         
			} else
			if(((WorkSpec$WorkStatusPojo) (obj)).output != null)
	//*  53   95:aload_1         
	//*  54   96:getfield        #47  <Field Data output>
	//*  55   99:ifnull          104
				return false;
	//   56  102:iconst_0        
	//   57  103:ireturn         
			obj1 = ((Object) (tags));
	//   58  104:aload_0         
	//   59  105:getfield        #52  <Field List tags>
	//   60  108:astore_2        
			if(obj1 != null)
	//*  61  109:aload_2         
	//*  62  110:ifnull          124
				return ((List) (obj1)).equals(((Object) (((WorkSpec$WorkStatusPojo) (obj)).tags)));
	//   63  113:aload_2         
	//   64  114:aload_1         
	//   65  115:getfield        #52  <Field List tags>
	//   66  118:invokeinterface #55  <Method boolean List.equals(Object)>
	//   67  123:ireturn         
			return ((WorkSpec$WorkStatusPojo) (obj)).tags == null;
	//   68  124:aload_1         
	//   69  125:getfield        #52  <Field List tags>
	//   70  128:ifnonnull       133
	//   71  131:iconst_1        
	//   72  132:ireturn         
	//   73  133:iconst_0        
	//   74  134:ireturn         
		} else
		{
			return false;
	//   75  135:iconst_0        
	//   76  136:ireturn         
		}
	}

	public int hashCode()
	{
		Object obj = ((Object) (id));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String id>
	//    2    4:astore          5
		int l = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		int i;
		if(obj != null)
	//*   5    9:aload           5
	//*   6   11:ifnull          23
			i = ((String) (obj)).hashCode();
	//    7   14:aload           5
	//    8   16:invokevirtual   #59  <Method int String.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		obj = ((Object) (state));
	//   13   25:aload_0         
	//   14   26:getfield        #45  <Field State state>
	//   15   29:astore          5
		int j;
		if(obj != null)
	//*  16   31:aload           5
	//*  17   33:ifnull          45
			j = ((State) (obj)).hashCode();
	//   18   36:aload           5
	//   19   38:invokevirtual   #62  <Method int State.hashCode()>
	//   20   41:istore_2        
		else
	//*  21   42:goto            47
			j = 0;
	//   22   45:iconst_0        
	//   23   46:istore_2        
		obj = ((Object) (output));
	//   24   47:aload_0         
	//   25   48:getfield        #47  <Field Data output>
	//   26   51:astore          5
		int k;
		if(obj != null)
	//*  27   53:aload           5
	//*  28   55:ifnull          67
			k = ((Data) (obj)).hashCode();
	//   29   58:aload           5
	//   30   60:invokevirtual   #63  <Method int Data.hashCode()>
	//   31   63:istore_3        
		else
	//*  32   64:goto            69
			k = 0;
	//   33   67:iconst_0        
	//   34   68:istore_3        
		obj = ((Object) (tags));
	//   35   69:aload_0         
	//   36   70:getfield        #52  <Field List tags>
	//   37   73:astore          5
		if(obj != null)
	//*  38   75:aload           5
	//*  39   77:ifnull          89
			l = ((List) (obj)).hashCode();
	//   40   80:aload           5
	//   41   82:invokeinterface #64  <Method int List.hashCode()>
	//   42   87:istore          4
		return ((i * 31 + j) * 31 + k) * 31 + l;
	//   43   89:iload_1         
	//   44   90:bipush          31
	//   45   92:imul            
	//   46   93:iload_2         
	//   47   94:iadd            
	//   48   95:bipush          31
	//   49   97:imul            
	//   50   98:iload_3         
	//   51   99:iadd            
	//   52  100:bipush          31
	//   53  102:imul            
	//   54  103:iload           4
	//   55  105:iadd            
	//   56  106:ireturn         
	}

	public WorkStatus toWorkStatus()
	{
		return new WorkStatus(UUID.fromString(id), state, output, tags);
	//    0    0:new             #68  <Class WorkStatus>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field String id>
	//    4    8:invokestatic    #74  <Method UUID UUID.fromString(String)>
	//    5   11:aload_0         
	//    6   12:getfield        #45  <Field State state>
	//    7   15:aload_0         
	//    8   16:getfield        #47  <Field Data output>
	//    9   19:aload_0         
	//   10   20:getfield        #52  <Field List tags>
	//   11   23:invokespecial   #77  <Method void WorkStatus(UUID, State, Data, List)>
	//   12   26:areturn         
	}

	public String id;
	public Data output;
	public State state;
	public List tags;

	public WorkSpec$WorkStatusPojo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}
}
