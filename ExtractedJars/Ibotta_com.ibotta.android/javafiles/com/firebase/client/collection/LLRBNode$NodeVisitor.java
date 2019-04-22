// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;


// Referenced classes of package com.firebase.client.collection:
//			LLRBNode

public static abstract class LLRBNode$NodeVisitor
	implements ingNodeVisitor
{

	public boolean shouldContinue(Object obj, Object obj1)
	{
		visitEntry(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #21  <Method void visitEntry(Object, Object)>
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public abstract void visitEntry(Object obj, Object obj1);

	public LLRBNode$NodeVisitor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
