// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package afu.org.checkerframework.checker.nullness;


public final class NullnessUtils
{

	private NullnessUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		throw new AssertionError("shouldn't be instantiated");
	//    2    4:new             #15  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #17  <String "shouldn't be instantiated">
	//    5   10:invokespecial   #20  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static Object castNonNull(Object obj)
	{
		return obj;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private static Object[] castNonNullArray(Object aobj[])
	{
		for(int i = 0; i < aobj.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:arraylength     
	//*   5    5:icmpge          21
			checkIfArray(aobj[i]);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aaload          
	//    9   11:invokestatic    #33  <Method void checkIfArray(Object)>

	//   10   14:iload_1         
	//   11   15:iconst_1        
	//   12   16:iadd            
	//   13   17:istore_1        
	//*  14   18:goto            2
		return (Object[])aobj;
	//   15   21:aload_0         
	//   16   22:checkcast       #35  <Class Object[]>
	//   17   25:areturn         
	}

	public static Object[] castNonNullDeep(Object aobj[])
	{
		return (Object[])castNonNullArray(aobj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method Object[] castNonNullArray(Object[])>
	//    2    4:checkcast       #35  <Class Object[]>
	//    3    7:areturn         
	}

	public static Object[][] castNonNullDeep(Object aobj[][])
	{
		return (Object[][])castNonNullArray(((Object []) (aobj)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method Object[] castNonNullArray(Object[])>
	//    2    4:checkcast       #42  <Class Object[][]>
	//    3    7:areturn         
	}

	public static Object[][][] castNonNullDeep(Object aobj[][][])
	{
		return (Object[][][])castNonNullArray(((Object []) (aobj)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method Object[] castNonNullArray(Object[])>
	//    2    4:checkcast       #46  <Class Object[][][]>
	//    3    7:areturn         
	}

	public static Object[][][][] castNonNullDeep(Object aobj[][][][])
	{
		return (Object[][][][])castNonNullArray(((Object []) (aobj)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method Object[] castNonNullArray(Object[])>
	//    2    4:checkcast       #50  <Class Object[][][][]>
	//    3    7:areturn         
	}

	public static Object[][][][][] castNonNullDeep(Object aobj[][][][][])
	{
		return (Object[][][][][])castNonNullArray(((Object []) (aobj)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #39  <Method Object[] castNonNullArray(Object[])>
	//    2    4:checkcast       #54  <Class Object[][][][][]>
	//    3    7:areturn         
	}

	private static void checkIfArray(Object obj)
	{
		Class class1 = obj.getClass().getComponentType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #64  <Method Class Class.getComponentType()>
	//    3    7:astore_1        
		if(class1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          28
		{
			if(class1.isPrimitive())
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #68  <Method boolean Class.isPrimitive()>
	//*   8   16:ifeq            20
				return;
	//    9   19:return          
			castNonNullArray((Object[])obj);
	//   10   20:aload_0         
	//   11   21:checkcast       #35  <Class Object[]>
	//   12   24:invokestatic    #39  <Method Object[] castNonNullArray(Object[])>
	//   13   27:pop             
		}
	//   14   28:return          
	}

	static final boolean $assertionsDisabled = false;

	static 
	{
	//    0    0:return          
	}
}
