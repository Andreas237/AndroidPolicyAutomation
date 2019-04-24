// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;


// Referenced classes of package com.google.android.gms.common.api.internal:
//			ListenerHolder

public static final class ListenerHolder$ListenerKey
{

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof ListenerHolder$ListenerKey))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ListenerHolder$ListenerKey>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ListenerHolder$ListenerKey)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ListenerHolder$ListenerKey>
	//   12   20:astore_1        
		return zzli == ((ListenerHolder$ListenerKey) (obj)).zzli && zzll.equals(((Object) (((ListenerHolder$ListenerKey) (obj)).zzll)));
	//   13   21:aload_0         
	//   14   22:getfield        #21  <Field Object zzli>
	//   15   25:aload_1         
	//   16   26:getfield        #21  <Field Object zzli>
	//   17   29:if_acmpne       48
	//   18   32:aload_0         
	//   19   33:getfield        #23  <Field String zzll>
	//   20   36:aload_1         
	//   21   37:getfield        #23  <Field String zzll>
	//   22   40:invokevirtual   #33  <Method boolean String.equals(Object)>
	//   23   43:ifeq            48
	//   24   46:iconst_1        
	//   25   47:ireturn         
	//   26   48:iconst_0        
	//   27   49:ireturn         
	}

	public final int hashCode()
	{
		return System.identityHashCode(zzli) * 31 + zzll.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object zzli>
	//    2    4:invokestatic    #41  <Method int System.identityHashCode(Object)>
	//    3    7:bipush          31
	//    4    9:imul            
	//    5   10:aload_0         
	//    6   11:getfield        #23  <Field String zzll>
	//    7   14:invokevirtual   #43  <Method int String.hashCode()>
	//    8   17:iadd            
	//    9   18:ireturn         
	}

	private final Object zzli;
	private final String zzll;

	ListenerHolder$ListenerKey(Object obj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzli = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Object zzli>
		zzll = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String zzll>
	//    8   14:return          
	}
}
