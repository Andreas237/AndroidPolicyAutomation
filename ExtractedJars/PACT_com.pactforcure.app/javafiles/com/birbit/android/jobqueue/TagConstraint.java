// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import java.util.*;

public final class TagConstraint extends Enum
{

	private TagConstraint(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static TagConstraint valueOf(String s)
	{
		return (TagConstraint)Enum.valueOf(com/birbit/android/jobqueue/TagConstraint, s);
	//    0    0:ldc1            #2   <Class TagConstraint>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class TagConstraint>
	//    4    9:areturn         
	}

	public static TagConstraint[] values()
	{
		return (TagConstraint[])((TagConstraint []) ($VALUES)).clone();
	//    0    0:getstatic       #24  <Field TagConstraint[] $VALUES>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.birbit.android.jobqueue.TagConstraint_3B_.clone()>
	//    2    6:checkcast       #35  <Class TagConstraint[]>
	//    3    9:areturn         
	}

	public boolean matches(Collection collection, Set set)
	{
		if(this != ANY) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field TagConstraint ANY>
	//    2    4:if_acmpne       45
_L1:
		collection = ((Collection) (collection.iterator()));
	//    3    7:aload_1         
	//    4    8:invokeinterface #47  <Method Iterator Collection.iterator()>
	//    5   13:astore_1        
_L6:
		if(!((Iterator) (collection)).hasNext()) goto _L4; else goto _L3
	//    6   14:aload_1         
	//    7   15:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            43
_L3:
		if(!set.contains(((Object) ((String)((Iterator) (collection)).next())))) goto _L6; else goto _L5
	//    9   23:aload_2         
	//   10   24:aload_1         
	//   11   25:invokeinterface #56  <Method Object Iterator.next()>
	//   12   30:checkcast       #58  <Class String>
	//   13   33:invokeinterface #64  <Method boolean Set.contains(Object)>
	//   14   38:ifeq            14
_L5:
		return true;
	//   15   41:iconst_1        
	//   16   42:ireturn         
_L4:
		return false;
	//   17   43:iconst_0        
	//   18   44:ireturn         
_L2:
		collection = ((Collection) (collection.iterator()));
	//   19   45:aload_1         
	//   20   46:invokeinterface #47  <Method Iterator Collection.iterator()>
	//   21   51:astore_1        
		while(((Iterator) (collection)).hasNext()) 
	//*  22   52:aload_1         
	//*  23   53:invokeinterface #53  <Method boolean Iterator.hasNext()>
	//*  24   58:ifeq            41
			if(!set.contains(((Object) ((String)((Iterator) (collection)).next()))))
	//*  25   61:aload_2         
	//*  26   62:aload_1         
	//*  27   63:invokeinterface #56  <Method Object Iterator.next()>
	//*  28   68:checkcast       #58  <Class String>
	//*  29   71:invokeinterface #64  <Method boolean Set.contains(Object)>
	//*  30   76:ifne            52
				return false;
	//   31   79:iconst_0        
	//   32   80:ireturn         
		if(true) goto _L5; else goto _L7
_L7:
	}

	public boolean matches(String as[], Set set)
	{
		int i;
		int k;
		if(this != ANY)
			break MISSING_BLOCK_LABEL_42;
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field TagConstraint ANY>
	//    2    4:if_acmpne       42
		k = as.length;
	//    3    7:aload_1         
	//    4    8:arraylength     
	//    5    9:istore          4
		i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
_L5:
		if(i >= k) goto _L2; else goto _L1
	//    8   13:iload_3         
	//    9   14:iload           4
	//   10   16:icmpge          40
_L1:
		if(!set.contains(((Object) (as[i])))) goto _L4; else goto _L3
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:iload_3         
	//   14   22:aaload          
	//   15   23:invokeinterface #64  <Method boolean Set.contains(Object)>
	//   16   28:ifeq            33
_L3:
		return true;
	//   17   31:iconst_1        
	//   18   32:ireturn         
_L4:
		i++;
	//   19   33:iload_3         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_3        
		  goto _L5
	//*  23   37:goto            13
_L2:
		return false;
	//   24   40:iconst_0        
	//   25   41:ireturn         
		int l = as.length;
	//   26   42:aload_1         
	//   27   43:arraylength     
	//   28   44:istore          4
		int j = 0;
	//   29   46:iconst_0        
	//   30   47:istore_3        
		while(j < l) 
	//*  31   48:iload_3         
	//*  32   49:iload           4
	//*  33   51:icmpge          31
		{
			if(!set.contains(((Object) (as[j]))))
	//*  34   54:aload_2         
	//*  35   55:aload_1         
	//*  36   56:iload_3         
	//*  37   57:aaload          
	//*  38   58:invokeinterface #64  <Method boolean Set.contains(Object)>
	//*  39   63:ifne            68
				return false;
	//   40   66:iconst_0        
	//   41   67:ireturn         
			j++;
	//   42   68:iload_3         
	//   43   69:iconst_1        
	//   44   70:iadd            
	//   45   71:istore_3        
		}
		  goto _L3
	//*  46   72:goto            48
	}

	private static final TagConstraint $VALUES[];
	public static final TagConstraint ALL;
	public static final TagConstraint ANY;

	static 
	{
		ALL = new TagConstraint("ALL", 0);
	//    0    0:new             #2   <Class TagConstraint>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "ALL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void TagConstraint(String, int)>
	//    5   10:putstatic       #19  <Field TagConstraint ALL>
		ANY = new TagConstraint("ANY", 1);
	//    6   13:new             #2   <Class TagConstraint>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "ANY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void TagConstraint(String, int)>
	//   11   23:putstatic       #22  <Field TagConstraint ANY>
		$VALUES = (new TagConstraint[] {
			ALL, ANY
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       TagConstraint[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field TagConstraint ALL>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field TagConstraint ANY>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field TagConstraint[] $VALUES>
	//*  23   45:return          
	}
}
