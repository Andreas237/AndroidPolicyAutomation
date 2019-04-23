// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

public final class ScopeUtil
{

	private ScopeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static String[] toScopeString(Set set)
	{
		Preconditions.checkNotNull(((Object) (set)), "scopes can't be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "scopes can't be null.">
	//    2    3:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		set = ((Set) ((Scope[])set.toArray(((Object []) (new Scope[set.size()])))));
	//    4    7:aload_0         
	//    5    8:aload_0         
	//    6    9:invokeinterface #26  <Method int Set.size()>
	//    7   14:anewarray       Scope[]
	//    8   17:invokeinterface #32  <Method Object[] Set.toArray(Object[])>
	//    9   22:checkcast       #34  <Class Scope[]>
	//   10   25:astore_0        
		Preconditions.checkNotNull(((Object) (set)), "scopes can't be null.");
	//   11   26:aload_0         
	//   12   27:ldc1            #14  <String "scopes can't be null.">
	//   13   29:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object, Object)>
	//   14   32:pop             
		String as[] = new String[set.length];
	//   15   33:aload_0         
	//   16   34:arraylength     
	//   17   35:anewarray       String[]
	//   18   38:astore_2        
		for(int i = 0; i < set.length; i++)
	//*  19   39:iconst_0        
	//*  20   40:istore_1        
	//*  21   41:iload_1         
	//*  22   42:aload_0         
	//*  23   43:arraylength     
	//*  24   44:icmpge          63
			as[i] = ((Scope) (set[i])).getScopeUri();
	//   25   47:aload_2         
	//   26   48:iload_1         
	//   27   49:aload_0         
	//   28   50:iload_1         
	//   29   51:aaload          
	//   30   52:invokevirtual   #40  <Method String Scope.getScopeUri()>
	//   31   55:aastore         

	//   32   56:iload_1         
	//   33   57:iconst_1        
	//   34   58:iadd            
	//   35   59:istore_1        
	//*  36   60:goto            41
		return as;
	//   37   63:aload_2         
	//   38   64:areturn         
	}
}
