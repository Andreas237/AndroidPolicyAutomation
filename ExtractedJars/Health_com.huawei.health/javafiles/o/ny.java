// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public class ny
{
	public static abstract class b
	{

		protected abstract b a();

		public static int f = -1;
		int g;

		static 
		{
		//    0    0:iconst_m1       
		//    1    1:putstatic       #14  <Field int f>
		//*   2    4:return          
		}

		public b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			g = f;
		//    2    4:aload_0         
		//    3    5:getstatic       #14  <Field int f>
		//    4    8:putfield        #20  <Field int g>
		//    5   11:return          
		}
	}


	private ny(int j, b b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		if(j <= 0)
	//*   2    4:iload_1         
	//*   3    5:ifgt            18
		{
			throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
	//    4    8:new             #30  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #32  <String "Object Pool must be instantiated with a capacity greater than 0!">
	//    7   14:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		} else
		{
			d = j;
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:putfield        #37  <Field int d>
			b = new Object[d];
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:getfield        #37  <Field int d>
	//   15   28:anewarray       Object[]
	//   16   31:putfield        #39  <Field Object[] b>
			a = 0;
	//   17   34:aload_0         
	//   18   35:iconst_0        
	//   19   36:putfield        #41  <Field int a>
			f = b1;
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:putfield        #43  <Field ny$b f>
			i = 1.0F;
	//   23   44:aload_0         
	//   24   45:fconst_1        
	//   25   46:putfield        #45  <Field float i>
			e();
	//   26   49:aload_0         
	//   27   50:invokespecial   #47  <Method void e()>
			return;
	//   28   53:return          
		}
	}

	public static ny b(int j, b b1)
	{
		o/ny;
	//    0    0:ldc1            #2   <Class ny>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		b1 = ((b) (new ny(j, b1)));
	//    2    3:new             #2   <Class ny>
	//    3    6:dup             
	//    4    7:iload_0         
	//    5    8:aload_1         
	//    6    9:invokespecial   #52  <Method void ny(int, ny$b)>
	//    7   12:astore_1        
		b1.c = e;
	//    8   13:aload_1         
	//    9   14:getstatic       #23  <Field int e>
	//   10   17:putfield        #54  <Field int c>
		e++;
	//   11   20:getstatic       #23  <Field int e>
	//   12   23:iconst_1        
	//   13   24:iadd            
	//   14   25:putstatic       #23  <Field int e>
		o/ny;
	//   15   28:ldc1            #2   <Class ny>
		JVM INSTR monitorexit ;
	//   16   30:monitorexit     
		return ((ny) (b1));
	//   17   31:aload_1         
	//   18   32:areturn         
		b1;
	//   19   33:astore_1        
	//*  20   34:ldc1            #2   <Class ny>
		throw b1;
	//   21   36:monitorexit     
	//   22   37:aload_1         
	//   23   38:athrow          
	}

	private void d()
	{
		int k = d;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int d>
	//    2    4:istore_2        
		d = d * 2;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #37  <Field int d>
	//    6   10:iconst_2        
	//    7   11:imul            
	//    8   12:putfield        #37  <Field int d>
		Object aobj[] = new Object[d];
	//    9   15:aload_0         
	//   10   16:getfield        #37  <Field int d>
	//   11   19:anewarray       Object[]
	//   12   22:astore_3        
		for(int j = 0; j < k; j++)
	//*  13   23:iconst_0        
	//*  14   24:istore_1        
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:icmpge          46
			aobj[j] = b[j];
	//   18   30:aload_3         
	//   19   31:iload_1         
	//   20   32:aload_0         
	//   21   33:getfield        #39  <Field Object[] b>
	//   22   36:iload_1         
	//   23   37:aaload          
	//   24   38:aastore         

	//   25   39:iload_1         
	//   26   40:iconst_1        
	//   27   41:iadd            
	//   28   42:istore_1        
	//*  29   43:goto            25
		b = aobj;
	//   30   46:aload_0         
	//   31   47:aload_3         
	//   32   48:putfield        #39  <Field Object[] b>
	//   33   51:return          
	}

	private void e()
	{
		e(i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field float i>
	//    3    5:invokespecial   #57  <Method void e(float)>
	//    4    8:return          
	}

	private void e(float f1)
	{
		int k = (int)((float)d * f1);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int d>
	//    2    4:i2f             
	//    3    5:fload_1         
	//    4    6:fmul            
	//    5    7:f2i             
	//    6    8:istore_3        
		int j;
		if(k < 1)
	//*   7    9:iload_3         
	//*   8   10:iconst_1        
	//*   9   11:icmpge          19
		{
			j = 1;
	//   10   14:iconst_1        
	//   11   15:istore_2        
		} else
	//*  12   16:goto            34
		{
			j = k;
	//   13   19:iload_3         
	//   14   20:istore_2        
			if(k > d)
	//*  15   21:iload_3         
	//*  16   22:aload_0         
	//*  17   23:getfield        #37  <Field int d>
	//*  18   26:icmple          34
				j = d;
	//   19   29:aload_0         
	//   20   30:getfield        #37  <Field int d>
	//   21   33:istore_2        
		}
		for(int l = 0; l < j; l++)
	//*  22   34:iconst_0        
	//*  23   35:istore_3        
	//*  24   36:iload_3         
	//*  25   37:iload_2         
	//*  26   38:icmpge          61
			b[l] = ((Object) (f.a()));
	//   27   41:aload_0         
	//   28   42:getfield        #39  <Field Object[] b>
	//   29   45:iload_3         
	//   30   46:aload_0         
	//   31   47:getfield        #43  <Field ny$b f>
	//   32   50:invokevirtual   #60  <Method ny$b ny$b.a()>
	//   33   53:aastore         

	//   34   54:iload_3         
	//   35   55:iconst_1        
	//   36   56:iadd            
	//   37   57:istore_3        
	//*  38   58:goto            36
		a = j - 1;
	//   39   61:aload_0         
	//   40   62:iload_2         
	//   41   63:iconst_1        
	//   42   64:isub            
	//   43   65:putfield        #41  <Field int a>
	//   44   68:return          
	}

	public b b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		b b1;
		if(a == -1 && i > 0.0F)
	//*   2    2:aload_0         
	//*   3    3:getfield        #41  <Field int a>
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          23
	//*   6   10:aload_0         
	//*   7   11:getfield        #45  <Field float i>
	//*   8   14:fconst_0        
	//*   9   15:fcmpl           
	//*  10   16:ifle            23
			e();
	//   11   19:aload_0         
	//   12   20:invokespecial   #47  <Method void e()>
		b1 = (b)b[a];
	//   13   23:aload_0         
	//   14   24:getfield        #39  <Field Object[] b>
	//   15   27:aload_0         
	//   16   28:getfield        #41  <Field int a>
	//   17   31:aaload          
	//   18   32:checkcast       #7   <Class ny$b>
	//   19   35:astore_1        
		b1.g = b.f;
	//   20   36:aload_1         
	//   21   37:getstatic       #62  <Field int ny$b.f>
	//   22   40:putfield        #65  <Field int ny$b.g>
		a = a - 1;
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #41  <Field int a>
	//   26   48:iconst_1        
	//   27   49:isub            
	//   28   50:putfield        #41  <Field int a>
		this;
	//   29   53:aload_0         
		JVM INSTR monitorexit ;
	//   30   54:monitorexit     
		return b1;
	//   31   55:aload_1         
	//   32   56:areturn         
		Exception exception;
		exception;
	//   33   57:astore_1        
	//*  34   58:aload_0         
		throw exception;
	//   35   59:monitorexit     
	//   36   60:aload_1         
	//   37   61:athrow          
	}

	public void c(float f1)
	{
		float f2 = f1;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f2 > 1.0F)
	//*   2    2:fload_2         
	//*   3    3:fconst_1        
	//*   4    4:fcmpl           
	//*   5    5:ifle            13
		{
			f1 = 1.0F;
	//    6    8:fconst_1        
	//    7    9:fstore_1        
		} else
	//*   8   10:goto            23
		{
			f1 = f2;
	//    9   13:fload_2         
	//   10   14:fstore_1        
			if(f2 < 0.0F)
	//*  11   15:fload_2         
	//*  12   16:fconst_0        
	//*  13   17:fcmpg           
	//*  14   18:ifge            23
				f1 = 0.0F;
	//   15   21:fconst_0        
	//   16   22:fstore_1        
		}
		i = f1;
	//   17   23:aload_0         
	//   18   24:fload_1         
	//   19   25:putfield        #45  <Field float i>
	//   20   28:return          
	}

	public void c(b b1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(b1.g != b.f)
	//*   2    2:aload_1         
	//*   3    3:getfield        #65  <Field int ny$b.g>
	//*   4    6:getstatic       #62  <Field int ny$b.f>
	//*   5    9:icmpeq          68
			if(b1.g == c)
	//*   6   12:aload_1         
	//*   7   13:getfield        #65  <Field int ny$b.g>
	//*   8   16:aload_0         
	//*   9   17:getfield        #54  <Field int c>
	//*  10   20:icmpne          33
				throw new IllegalArgumentException("The object passed is already stored in this pool!");
	//   11   23:new             #30  <Class IllegalArgumentException>
	//   12   26:dup             
	//   13   27:ldc1            #69  <String "The object passed is already stored in this pool!">
	//   14   29:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//   15   32:athrow          
			else
				throw new IllegalArgumentException((new StringBuilder()).append("The object to recycle already belongs to poolId ").append(b1.g).append(".  Object cannot belong to two different pool instances simultaneously!").toString());
	//   16   33:new             #30  <Class IllegalArgumentException>
	//   17   36:dup             
	//   18   37:new             #71  <Class StringBuilder>
	//   19   40:dup             
	//   20   41:invokespecial   #72  <Method void StringBuilder()>
	//   21   44:ldc1            #74  <String "The object to recycle already belongs to poolId ">
	//   22   46:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:aload_1         
	//   24   50:getfield        #65  <Field int ny$b.g>
	//   25   53:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   26   56:ldc1            #83  <String ".  Object cannot belong to two different pool instances simultaneously!">
	//   27   58:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   28   61:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   29   64:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//   30   67:athrow          
		a = a + 1;
	//   31   68:aload_0         
	//   32   69:aload_0         
	//   33   70:getfield        #41  <Field int a>
	//   34   73:iconst_1        
	//   35   74:iadd            
	//   36   75:putfield        #41  <Field int a>
		if(a >= b.length)
	//*  37   78:aload_0         
	//*  38   79:getfield        #41  <Field int a>
	//*  39   82:aload_0         
	//*  40   83:getfield        #39  <Field Object[] b>
	//*  41   86:arraylength     
	//*  42   87:icmplt          94
			d();
	//   43   90:aload_0         
	//   44   91:invokespecial   #89  <Method void d()>
		b1.g = c;
	//   45   94:aload_1         
	//   46   95:aload_0         
	//   47   96:getfield        #54  <Field int c>
	//   48   99:putfield        #65  <Field int ny$b.g>
		b[a] = ((Object) (b1));
	//   49  102:aload_0         
	//   50  103:getfield        #39  <Field Object[] b>
	//   51  106:aload_0         
	//   52  107:getfield        #41  <Field int a>
	//   53  110:aload_1         
	//   54  111:aastore         
		this;
	//   55  112:aload_0         
		JVM INSTR monitorexit ;
	//   56  113:monitorexit     
		return;
	//   57  114:return          
		b1;
	//   58  115:astore_1        
	//*  59  116:aload_0         
		throw b1;
	//   60  117:monitorexit     
	//   61  118:aload_1         
	//   62  119:athrow          
	}

	private static int e = 0;
	private int a;
	private Object b[];
	private int c;
	private int d;
	private b f;
	private float i;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:putstatic       #23  <Field int e>
	//*   2    4:return          
	}
}
