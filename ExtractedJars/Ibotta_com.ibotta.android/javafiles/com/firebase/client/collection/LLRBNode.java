// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.Comparator;

public interface LLRBNode
{
	public static final class Color extends Enum
	{

		public static Color valueOf(String s)
		{
			return (Color)Enum.valueOf(com/firebase/client/collection/LLRBNode$Color, s);
		//    0    0:ldc1            #2   <Class LLRBNode$Color>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LLRBNode$Color>
		//    4    9:areturn         
		}

		public static Color[] values()
		{
			return (Color[])((Color []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field LLRBNode$Color[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.firebase.client.collection.LLRBNode$Color_3B_.clone()>
		//    2    6:checkcast       #38  <Class LLRBNode$Color[]>
		//    3    9:areturn         
		}

		private static final Color $VALUES[];
		public static final Color BLACK;
		public static final Color RED;

		static 
		{
			RED = new Color("RED", 0);
		//    0    0:new             #2   <Class LLRBNode$Color>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "RED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void LLRBNode$Color(String, int)>
		//    5   10:putstatic       #22  <Field LLRBNode$Color RED>
			BLACK = new Color("BLACK", 1);
		//    6   13:new             #2   <Class LLRBNode$Color>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "BLACK">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void LLRBNode$Color(String, int)>
		//   11   23:putstatic       #25  <Field LLRBNode$Color BLACK>
			$VALUES = (new Color[] {
				RED, BLACK
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       Color[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field LLRBNode$Color RED>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field LLRBNode$Color BLACK>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field LLRBNode$Color[] $VALUES>
		//*  23   45:return          
		}

		private Color(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static abstract class NodeVisitor
		implements ShortCircuitingNodeVisitor
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

		public NodeVisitor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface ShortCircuitingNodeVisitor
	{

		public abstract boolean shouldContinue(Object obj, Object obj1);
	}


	public abstract LLRBNode copy(Object obj, Object obj1, Color color, LLRBNode llrbnode, LLRBNode llrbnode1);

	public abstract int count();

	public abstract Object getKey();

	public abstract LLRBNode getLeft();

	public abstract LLRBNode getMax();

	public abstract LLRBNode getMin();

	public abstract LLRBNode getRight();

	public abstract Object getValue();

	public abstract void inOrderTraversal(NodeVisitor nodevisitor);

	public abstract LLRBNode insert(Object obj, Object obj1, Comparator comparator);

	public abstract boolean isEmpty();

	public abstract boolean isRed();

	public abstract LLRBNode remove(Object obj, Comparator comparator);

	public abstract boolean shortCircuitingInOrderTraversal(ShortCircuitingNodeVisitor shortcircuitingnodevisitor);

	public abstract boolean shortCircuitingReverseOrderTraversal(ShortCircuitingNodeVisitor shortcircuitingnodevisitor);
}
