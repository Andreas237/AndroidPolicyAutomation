// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.*;

public final class ScopeUtil
{

	private ScopeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Set fromScopeString(Collection collection)
	{
		Preconditions.checkNotNull(((Object) (collection)), "scopeStrings can't be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "scopeStrings can't be null.">
	//    2    3:invokestatic    #19  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		return fromScopeString((String[])collection.toArray(((Object []) (new String[collection.size()]))));
	//    4    7:aload_0         
	//    5    8:aload_0         
	//    6    9:invokeinterface #25  <Method int Collection.size()>
	//    7   14:anewarray       String[]
	//    8   17:invokeinterface #31  <Method Object[] Collection.toArray(Object[])>
	//    9   22:checkcast       #33  <Class String[]>
	//   10   25:invokestatic    #36  <Method Set fromScopeString(String[])>
	//   11   28:areturn         
	}

	public static transient Set fromScopeString(String as[])
	{
		Preconditions.checkNotNull(((Object) (as)), "scopeStrings can't be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "scopeStrings can't be null.">
	//    2    3:invokestatic    #19  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_1        
		HashSet hashset = new HashSet(as.length);
	//    6    9:new             #40  <Class HashSet>
	//    7   12:dup             
	//    8   13:aload_0         
	//    9   14:arraylength     
	//   10   15:invokespecial   #43  <Method void HashSet(int)>
	//   11   18:astore_3        
		for(int j = as.length; i < j; i++)
	//*  12   19:aload_0         
	//*  13   20:arraylength     
	//*  14   21:istore_2        
	//*  15   22:iload_1         
	//*  16   23:iload_2         
	//*  17   24:icmpge          63
		{
			String s = as[i];
	//   18   27:aload_0         
	//   19   28:iload_1         
	//   20   29:aaload          
	//   21   30:astore          4
			if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  22   32:aload           4
	//*  23   34:invokestatic    #49  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  24   37:ifne            56
				((Set) (hashset)).add(((Object) (new Scope(s))));
	//   25   40:aload_3         
	//   26   41:new             #51  <Class Scope>
	//   27   44:dup             
	//   28   45:aload           4
	//   29   47:invokespecial   #54  <Method void Scope(String)>
	//   30   50:invokeinterface #60  <Method boolean Set.add(Object)>
	//   31   55:pop             
		}

	//   32   56:iload_1         
	//   33   57:iconst_1        
	//   34   58:iadd            
	//   35   59:istore_1        
	//*  36   60:goto            22
		return ((Set) (hashset));
	//   37   63:aload_3         
	//   38   64:areturn         
	}

	public static String[] toScopeString(Set set)
	{
		Preconditions.checkNotNull(((Object) (set)), "scopes can't be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "scopes can't be null.">
	//    2    3:invokestatic    #19  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		return toScopeString((Scope[])set.toArray(((Object []) (new Scope[set.size()]))));
	//    4    7:aload_0         
	//    5    8:aload_0         
	//    6    9:invokeinterface #66  <Method int Set.size()>
	//    7   14:anewarray       Scope[]
	//    8   17:invokeinterface #67  <Method Object[] Set.toArray(Object[])>
	//    9   22:checkcast       #69  <Class Scope[]>
	//   10   25:invokestatic    #72  <Method String[] toScopeString(Scope[])>
	//   11   28:areturn         
	}

	public static String[] toScopeString(Scope ascope[])
	{
		Preconditions.checkNotNull(((Object) (ascope)), "scopes can't be null.");
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "scopes can't be null.">
	//    2    3:invokestatic    #19  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_1        
		String as[] = new String[ascope.length];
	//    6    9:aload_0         
	//    7   10:arraylength     
	//    8   11:anewarray       String[]
	//    9   14:astore_2        
		for(; i < ascope.length; i++)
	//*  10   15:iload_1         
	//*  11   16:aload_0         
	//*  12   17:arraylength     
	//*  13   18:icmpge          37
			as[i] = ascope[i].getScopeUri();
	//   14   21:aload_2         
	//   15   22:iload_1         
	//   16   23:aload_0         
	//   17   24:iload_1         
	//   18   25:aaload          
	//   19   26:invokevirtual   #77  <Method String Scope.getScopeUri()>
	//   20   29:aastore         

	//   21   30:iload_1         
	//   22   31:iconst_1        
	//   23   32:iadd            
	//   24   33:istore_1        
	//*  25   34:goto            15
		return as;
	//   26   37:aload_2         
	//   27   38:areturn         
	}
}
