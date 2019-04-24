// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Function;
import kotlin.jvm.functions.*;

public abstract class FunctionImpl
	implements Function, Serializable, Function0, Function1, Function2, Function3, Function4, Function5, Function6, Function7, Function8, Function9, Function10, Function11, Function12, Function13, Function14, Function15, Function16, Function17, Function18, Function19, Function20, Function21, Function22
{

	public FunctionImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
	//    2    4:return          
	}

	private void checkArity(int i)
	{
		if(getArity() != i)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #72  <Method int getArity()>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			throwWrongArity(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #75  <Method void throwWrongArity(int)>
	//    7   13:return          
	}

	private void throwWrongArity(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Wrong function arity, expected: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #80  <String "Wrong function arity, expected: ">
	//    6   11:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		stringbuilder.append(", actual: ");
	//   12   21:aload_2         
	//   13   22:ldc1            #89  <String ", actual: ">
	//   14   24:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(getArity());
	//   16   28:aload_2         
	//   17   29:aload_0         
	//   18   30:invokevirtual   #72  <Method int getArity()>
	//   19   33:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   20   36:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   21   37:new             #91  <Class IllegalStateException>
	//   22   40:dup             
	//   23   41:aload_2         
	//   24   42:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   25   45:invokespecial   #98  <Method void IllegalStateException(String)>
	//   26   48:athrow          
	}

	public abstract int getArity();

	public Object invoke()
	{
		checkArity(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[0]);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:anewarray       Object[]
	//    6   10:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//    7   13:areturn         
	}

	public Object invoke(Object obj)
	{
		checkArity(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj
		});
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:anewarray       Object[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:aastore         
	//   10   14:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   11   17:areturn         
	}

	public Object invoke(Object obj, Object obj1)
	{
		checkArity(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1
		});
	//    3    5:aload_0         
	//    4    6:iconst_2        
	//    5    7:anewarray       Object[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_1        
	//   12   16:aload_2         
	//   13   17:aastore         
	//   14   18:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   15   21:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2)
	{
		checkArity(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2
		});
	//    3    5:aload_0         
	//    4    6:iconst_3        
	//    5    7:anewarray       Object[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_1        
	//   12   16:aload_2         
	//   13   17:aastore         
	//   14   18:dup             
	//   15   19:iconst_2        
	//   16   20:aload_3         
	//   17   21:aastore         
	//   18   22:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   19   25:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3)
	{
		checkArity(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3
		});
	//    3    5:aload_0         
	//    4    6:iconst_4        
	//    5    7:anewarray       Object[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_1        
	//   12   16:aload_2         
	//   13   17:aastore         
	//   14   18:dup             
	//   15   19:iconst_2        
	//   16   20:aload_3         
	//   17   21:aastore         
	//   18   22:dup             
	//   19   23:iconst_3        
	//   20   24:aload           4
	//   21   26:aastore         
	//   22   27:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   23   30:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
	{
		checkArity(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4
		});
	//    3    5:aload_0         
	//    4    6:iconst_5        
	//    5    7:anewarray       Object[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_1        
	//   12   16:aload_2         
	//   13   17:aastore         
	//   14   18:dup             
	//   15   19:iconst_2        
	//   16   20:aload_3         
	//   17   21:aastore         
	//   18   22:dup             
	//   19   23:iconst_3        
	//   20   24:aload           4
	//   21   26:aastore         
	//   22   27:dup             
	//   23   28:iconst_4        
	//   24   29:aload           5
	//   25   31:aastore         
	//   26   32:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   27   35:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		checkArity(6);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5
		});
	//    3    6:aload_0         
	//    4    7:bipush          6
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   31   42:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
	{
		checkArity(7);
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6
		});
	//    3    6:aload_0         
	//    4    7:bipush          7
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   35   48:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7)
	{
		checkArity(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7
		});
	//    3    6:aload_0         
	//    4    7:bipush          8
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   39   54:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8)
	{
		checkArity(9);
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8
		});
	//    3    6:aload_0         
	//    4    7:bipush          9
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   43   60:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9)
	{
		checkArity(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9
		});
	//    3    6:aload_0         
	//    4    7:bipush          10
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   47   66:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10)
	{
		checkArity(11);
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10
		});
	//    3    6:aload_0         
	//    4    7:bipush          11
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   51   72:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11)
	{
		checkArity(12);
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11
		});
	//    3    6:aload_0         
	//    4    7:bipush          12
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   55   78:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12)
	{
		checkArity(13);
	//    0    0:aload_0         
	//    1    1:bipush          13
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12
		});
	//    3    6:aload_0         
	//    4    7:bipush          13
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:dup             
	//   55   76:bipush          12
	//   56   78:aload           13
	//   57   80:aastore         
	//   58   81:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   59   84:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13)
	{
		checkArity(14);
	//    0    0:aload_0         
	//    1    1:bipush          14
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12, obj13
		});
	//    3    6:aload_0         
	//    4    7:bipush          14
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:dup             
	//   55   76:bipush          12
	//   56   78:aload           13
	//   57   80:aastore         
	//   58   81:dup             
	//   59   82:bipush          13
	//   60   84:aload           14
	//   61   86:aastore         
	//   62   87:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   63   90:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, 
			Object obj14)
	{
		checkArity(15);
	//    0    0:aload_0         
	//    1    1:bipush          15
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12, obj13, obj14
		});
	//    3    6:aload_0         
	//    4    7:bipush          15
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:dup             
	//   55   76:bipush          12
	//   56   78:aload           13
	//   57   80:aastore         
	//   58   81:dup             
	//   59   82:bipush          13
	//   60   84:aload           14
	//   61   86:aastore         
	//   62   87:dup             
	//   63   88:bipush          14
	//   64   90:aload           15
	//   65   92:aastore         
	//   66   93:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   67   96:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, 
			Object obj14, Object obj15)
	{
		checkArity(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12, obj13, obj14, obj15
		});
	//    3    6:aload_0         
	//    4    7:bipush          16
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:dup             
	//   55   76:bipush          12
	//   56   78:aload           13
	//   57   80:aastore         
	//   58   81:dup             
	//   59   82:bipush          13
	//   60   84:aload           14
	//   61   86:aastore         
	//   62   87:dup             
	//   63   88:bipush          14
	//   64   90:aload           15
	//   65   92:aastore         
	//   66   93:dup             
	//   67   94:bipush          15
	//   68   96:aload           16
	//   69   98:aastore         
	//   70   99:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   71  102:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, 
			Object obj14, Object obj15, Object obj16)
	{
		checkArity(17);
	//    0    0:aload_0         
	//    1    1:bipush          17
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12, obj13, obj14, obj15, obj16
		});
	//    3    6:aload_0         
	//    4    7:bipush          17
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:dup             
	//   55   76:bipush          12
	//   56   78:aload           13
	//   57   80:aastore         
	//   58   81:dup             
	//   59   82:bipush          13
	//   60   84:aload           14
	//   61   86:aastore         
	//   62   87:dup             
	//   63   88:bipush          14
	//   64   90:aload           15
	//   65   92:aastore         
	//   66   93:dup             
	//   67   94:bipush          15
	//   68   96:aload           16
	//   69   98:aastore         
	//   70   99:dup             
	//   71  100:bipush          16
	//   72  102:aload           17
	//   73  104:aastore         
	//   74  105:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   75  108:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, 
			Object obj14, Object obj15, Object obj16, Object obj17)
	{
		checkArity(18);
	//    0    0:aload_0         
	//    1    1:bipush          18
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17
		});
	//    3    6:aload_0         
	//    4    7:bipush          18
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:dup             
	//   55   76:bipush          12
	//   56   78:aload           13
	//   57   80:aastore         
	//   58   81:dup             
	//   59   82:bipush          13
	//   60   84:aload           14
	//   61   86:aastore         
	//   62   87:dup             
	//   63   88:bipush          14
	//   64   90:aload           15
	//   65   92:aastore         
	//   66   93:dup             
	//   67   94:bipush          15
	//   68   96:aload           16
	//   69   98:aastore         
	//   70   99:dup             
	//   71  100:bipush          16
	//   72  102:aload           17
	//   73  104:aastore         
	//   74  105:dup             
	//   75  106:bipush          17
	//   76  108:aload           18
	//   77  110:aastore         
	//   78  111:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   79  114:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, 
			Object obj14, Object obj15, Object obj16, Object obj17, Object obj18)
	{
		checkArity(19);
	//    0    0:aload_0         
	//    1    1:bipush          19
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18
		});
	//    3    6:aload_0         
	//    4    7:bipush          19
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:dup             
	//   55   76:bipush          12
	//   56   78:aload           13
	//   57   80:aastore         
	//   58   81:dup             
	//   59   82:bipush          13
	//   60   84:aload           14
	//   61   86:aastore         
	//   62   87:dup             
	//   63   88:bipush          14
	//   64   90:aload           15
	//   65   92:aastore         
	//   66   93:dup             
	//   67   94:bipush          15
	//   68   96:aload           16
	//   69   98:aastore         
	//   70   99:dup             
	//   71  100:bipush          16
	//   72  102:aload           17
	//   73  104:aastore         
	//   74  105:dup             
	//   75  106:bipush          17
	//   76  108:aload           18
	//   77  110:aastore         
	//   78  111:dup             
	//   79  112:bipush          18
	//   80  114:aload           19
	//   81  116:aastore         
	//   82  117:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   83  120:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, 
			Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19)
	{
		checkArity(20);
	//    0    0:aload_0         
	//    1    1:bipush          20
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19
		});
	//    3    6:aload_0         
	//    4    7:bipush          20
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:dup             
	//   55   76:bipush          12
	//   56   78:aload           13
	//   57   80:aastore         
	//   58   81:dup             
	//   59   82:bipush          13
	//   60   84:aload           14
	//   61   86:aastore         
	//   62   87:dup             
	//   63   88:bipush          14
	//   64   90:aload           15
	//   65   92:aastore         
	//   66   93:dup             
	//   67   94:bipush          15
	//   68   96:aload           16
	//   69   98:aastore         
	//   70   99:dup             
	//   71  100:bipush          16
	//   72  102:aload           17
	//   73  104:aastore         
	//   74  105:dup             
	//   75  106:bipush          17
	//   76  108:aload           18
	//   77  110:aastore         
	//   78  111:dup             
	//   79  112:bipush          18
	//   80  114:aload           19
	//   81  116:aastore         
	//   82  117:dup             
	//   83  118:bipush          19
	//   84  120:aload           20
	//   85  122:aastore         
	//   86  123:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   87  126:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, 
			Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20)
	{
		checkArity(21);
	//    0    0:aload_0         
	//    1    1:bipush          21
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, 
			obj20
		});
	//    3    6:aload_0         
	//    4    7:bipush          21
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:dup             
	//   55   76:bipush          12
	//   56   78:aload           13
	//   57   80:aastore         
	//   58   81:dup             
	//   59   82:bipush          13
	//   60   84:aload           14
	//   61   86:aastore         
	//   62   87:dup             
	//   63   88:bipush          14
	//   64   90:aload           15
	//   65   92:aastore         
	//   66   93:dup             
	//   67   94:bipush          15
	//   68   96:aload           16
	//   69   98:aastore         
	//   70   99:dup             
	//   71  100:bipush          16
	//   72  102:aload           17
	//   73  104:aastore         
	//   74  105:dup             
	//   75  106:bipush          17
	//   76  108:aload           18
	//   77  110:aastore         
	//   78  111:dup             
	//   79  112:bipush          18
	//   80  114:aload           19
	//   81  116:aastore         
	//   82  117:dup             
	//   83  118:bipush          19
	//   84  120:aload           20
	//   85  122:aastore         
	//   86  123:dup             
	//   87  124:bipush          20
	//   88  126:aload           21
	//   89  128:aastore         
	//   90  129:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   91  132:areturn         
	}

	public Object invoke(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
			Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, 
			Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, 
			Object obj21)
	{
		checkArity(22);
	//    0    0:aload_0         
	//    1    1:bipush          22
	//    2    3:invokespecial   #102 <Method void checkArity(int)>
		return invokeVararg(new Object[] {
			obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
			obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, 
			obj20, obj21
		});
	//    3    6:aload_0         
	//    4    7:bipush          22
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_3        
	//   20   26:aload           4
	//   21   28:aastore         
	//   22   29:dup             
	//   23   30:iconst_4        
	//   24   31:aload           5
	//   25   33:aastore         
	//   26   34:dup             
	//   27   35:iconst_5        
	//   28   36:aload           6
	//   29   38:aastore         
	//   30   39:dup             
	//   31   40:bipush          6
	//   32   42:aload           7
	//   33   44:aastore         
	//   34   45:dup             
	//   35   46:bipush          7
	//   36   48:aload           8
	//   37   50:aastore         
	//   38   51:dup             
	//   39   52:bipush          8
	//   40   54:aload           9
	//   41   56:aastore         
	//   42   57:dup             
	//   43   58:bipush          9
	//   44   60:aload           10
	//   45   62:aastore         
	//   46   63:dup             
	//   47   64:bipush          10
	//   48   66:aload           11
	//   49   68:aastore         
	//   50   69:dup             
	//   51   70:bipush          11
	//   52   72:aload           12
	//   53   74:aastore         
	//   54   75:dup             
	//   55   76:bipush          12
	//   56   78:aload           13
	//   57   80:aastore         
	//   58   81:dup             
	//   59   82:bipush          13
	//   60   84:aload           14
	//   61   86:aastore         
	//   62   87:dup             
	//   63   88:bipush          14
	//   64   90:aload           15
	//   65   92:aastore         
	//   66   93:dup             
	//   67   94:bipush          15
	//   68   96:aload           16
	//   69   98:aastore         
	//   70   99:dup             
	//   71  100:bipush          16
	//   72  102:aload           17
	//   73  104:aastore         
	//   74  105:dup             
	//   75  106:bipush          17
	//   76  108:aload           18
	//   77  110:aastore         
	//   78  111:dup             
	//   79  112:bipush          18
	//   80  114:aload           19
	//   81  116:aastore         
	//   82  117:dup             
	//   83  118:bipush          19
	//   84  120:aload           20
	//   85  122:aastore         
	//   86  123:dup             
	//   87  124:bipush          20
	//   88  126:aload           21
	//   89  128:aastore         
	//   90  129:dup             
	//   91  130:bipush          21
	//   92  132:aload           22
	//   93  134:aastore         
	//   94  135:invokevirtual   #106 <Method Object invokeVararg(Object[])>
	//   95  138:areturn         
	}

	public transient Object invokeVararg(Object aobj[])
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #130 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #131 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}
}
