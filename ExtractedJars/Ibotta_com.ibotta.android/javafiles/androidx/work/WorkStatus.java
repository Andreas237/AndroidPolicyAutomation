// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import java.util.*;

// Referenced classes of package androidx.work:
//			Data, State

public final class WorkStatus
{

	public WorkStatus(UUID uuid, State state, Data data, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mId = uuid;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field UUID mId>
		mState = state;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field State mState>
		mOutputData = data;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Data mOutputData>
		mTags = ((Set) (new HashSet(((java.util.Collection) (list)))));
	//   11   19:aload_0         
	//   12   20:new             #27  <Class HashSet>
	//   13   23:dup             
	//   14   24:aload           4
	//   15   26:invokespecial   #30  <Method void HashSet(java.util.Collection)>
	//   16   29:putfield        #32  <Field Set mTags>
	//   17   32:return          
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
	//*   6    8:ifnull          135
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #42  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #42  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((WorkStatus)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class WorkStatus>
	//   16   28:astore_1        
			Object obj1 = ((Object) (mId));
	//   17   29:aload_0         
	//   18   30:getfield        #21  <Field UUID mId>
	//   19   33:astore_2        
			if(obj1 != null)
	//*  20   34:aload_2         
	//*  21   35:ifnull          51
			{
				if(!((UUID) (obj1)).equals(((Object) (((WorkStatus) (obj)).mId))))
	//*  22   38:aload_2         
	//*  23   39:aload_1         
	//*  24   40:getfield        #21  <Field UUID mId>
	//*  25   43:invokevirtual   #46  <Method boolean UUID.equals(Object)>
	//*  26   46:ifne            60
					return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
			} else
			if(((WorkStatus) (obj)).mId != null)
	//*  29   51:aload_1         
	//*  30   52:getfield        #21  <Field UUID mId>
	//*  31   55:ifnull          60
				return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
			if(mState != ((WorkStatus) (obj)).mState)
	//*  34   60:aload_0         
	//*  35   61:getfield        #23  <Field State mState>
	//*  36   64:aload_1         
	//*  37   65:getfield        #23  <Field State mState>
	//*  38   68:if_acmpeq       73
				return false;
	//   39   71:iconst_0        
	//   40   72:ireturn         
			obj1 = ((Object) (mOutputData));
	//   41   73:aload_0         
	//   42   74:getfield        #25  <Field Data mOutputData>
	//   43   77:astore_2        
			if(obj1 != null)
	//*  44   78:aload_2         
	//*  45   79:ifnull          95
			{
				if(!((Data) (obj1)).equals(((Object) (((WorkStatus) (obj)).mOutputData))))
	//*  46   82:aload_2         
	//*  47   83:aload_1         
	//*  48   84:getfield        #25  <Field Data mOutputData>
	//*  49   87:invokevirtual   #49  <Method boolean Data.equals(Object)>
	//*  50   90:ifne            104
					return false;
	//   51   93:iconst_0        
	//   52   94:ireturn         
			} else
			if(((WorkStatus) (obj)).mOutputData != null)
	//*  53   95:aload_1         
	//*  54   96:getfield        #25  <Field Data mOutputData>
	//*  55   99:ifnull          104
				return false;
	//   56  102:iconst_0        
	//   57  103:ireturn         
			obj1 = ((Object) (mTags));
	//   58  104:aload_0         
	//   59  105:getfield        #32  <Field Set mTags>
	//   60  108:astore_2        
			if(obj1 != null)
	//*  61  109:aload_2         
	//*  62  110:ifnull          124
				return ((Set) (obj1)).equals(((Object) (((WorkStatus) (obj)).mTags)));
	//   63  113:aload_2         
	//   64  114:aload_1         
	//   65  115:getfield        #32  <Field Set mTags>
	//   66  118:invokeinterface #52  <Method boolean Set.equals(Object)>
	//   67  123:ireturn         
			return ((WorkStatus) (obj)).mTags == null;
	//   68  124:aload_1         
	//   69  125:getfield        #32  <Field Set mTags>
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
		Object obj = ((Object) (mId));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field UUID mId>
	//    2    4:astore          5
		int l = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		int i;
		if(obj != null)
	//*   5    9:aload           5
	//*   6   11:ifnull          23
			i = ((UUID) (obj)).hashCode();
	//    7   14:aload           5
	//    8   16:invokevirtual   #56  <Method int UUID.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		obj = ((Object) (mState));
	//   13   25:aload_0         
	//   14   26:getfield        #23  <Field State mState>
	//   15   29:astore          5
		int j;
		if(obj != null)
	//*  16   31:aload           5
	//*  17   33:ifnull          45
			j = ((State) (obj)).hashCode();
	//   18   36:aload           5
	//   19   38:invokevirtual   #59  <Method int State.hashCode()>
	//   20   41:istore_2        
		else
	//*  21   42:goto            47
			j = 0;
	//   22   45:iconst_0        
	//   23   46:istore_2        
		obj = ((Object) (mOutputData));
	//   24   47:aload_0         
	//   25   48:getfield        #25  <Field Data mOutputData>
	//   26   51:astore          5
		int k;
		if(obj != null)
	//*  27   53:aload           5
	//*  28   55:ifnull          67
			k = ((Data) (obj)).hashCode();
	//   29   58:aload           5
	//   30   60:invokevirtual   #60  <Method int Data.hashCode()>
	//   31   63:istore_3        
		else
	//*  32   64:goto            69
			k = 0;
	//   33   67:iconst_0        
	//   34   68:istore_3        
		obj = ((Object) (mTags));
	//   35   69:aload_0         
	//   36   70:getfield        #32  <Field Set mTags>
	//   37   73:astore          5
		if(obj != null)
	//*  38   75:aload           5
	//*  39   77:ifnull          89
			l = ((Set) (obj)).hashCode();
	//   40   80:aload           5
	//   41   82:invokeinterface #61  <Method int Set.hashCode()>
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

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #65  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("WorkStatus{mId='");
	//    4    8:aload_1         
	//    5    9:ldc1            #68  <String "WorkStatus{mId='">
	//    6   11:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (mId)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field UUID mId>
	//   11   20:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_1         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #78  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", mState=");
	//   17   31:aload_1         
	//   18   32:ldc1            #80  <String ", mState=">
	//   19   34:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(((Object) (mState)));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #23  <Field State mState>
	//   24   43:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
		stringbuilder.append(", mOutputData=");
	//   26   47:aload_1         
	//   27   48:ldc1            #82  <String ", mOutputData=">
	//   28   50:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(((Object) (mOutputData)));
	//   30   54:aload_1         
	//   31   55:aload_0         
	//   32   56:getfield        #25  <Field Data mOutputData>
	//   33   59:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   34   62:pop             
		stringbuilder.append(", mTags=");
	//   35   63:aload_1         
	//   36   64:ldc1            #84  <String ", mTags=">
	//   37   66:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   38   69:pop             
		stringbuilder.append(((Object) (mTags)));
	//   39   70:aload_1         
	//   40   71:aload_0         
	//   41   72:getfield        #32  <Field Set mTags>
	//   42   75:invokevirtual   #75  <Method StringBuilder StringBuilder.append(Object)>
	//   43   78:pop             
		stringbuilder.append('}');
	//   44   79:aload_1         
	//   45   80:bipush          125
	//   46   82:invokevirtual   #78  <Method StringBuilder StringBuilder.append(char)>
	//   47   85:pop             
		return stringbuilder.toString();
	//   48   86:aload_1         
	//   49   87:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   50   90:areturn         
	}

	private UUID mId;
	private Data mOutputData;
	private State mState;
	private Set mTags;
}
