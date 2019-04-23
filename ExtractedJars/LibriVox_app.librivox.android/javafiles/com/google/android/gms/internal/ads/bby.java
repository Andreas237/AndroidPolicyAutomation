// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, bat, akh, bav

public final class bby extends bcg
{

	public bby(bav bav, String s, String s1, akh akh1, int i, int j, StackTraceElement astacktraceelement[])
	{
		super(bav, s, s1, akh1, i, 45);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          45
	//    7   10:invokespecial   #11  <Method void bcg(bav, String, String, akh, int, int)>
		d = astacktraceelement;
	//    8   13:aload_0         
	//    9   14:aload           7
	//   10   16:putfield        #13  <Field StackTraceElement[] d>
	//   11   19:return          
	}

	protected final void a()
	{
		int i;
		bat bat1;
		if(d == null)
			break MISSING_BLOCK_LABEL_118;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field StackTraceElement[] d>
	//    2    4:ifnull          118
		Method method = c;
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field Method c>
	//    5   11:astore_2        
		i = 1;
	//    6   12:iconst_1        
	//    7   13:istore_1        
		bat1 = new bat((String)method.invoke(((Object) (null)), new Object[] {
			d
		}));
	//    8   14:new             #22  <Class bat>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:aconst_null     
	//   12   20:iconst_1        
	//   13   21:anewarray       Object[]
	//   14   24:dup             
	//   15   25:iconst_0        
	//   16   26:aload_0         
	//   17   27:getfield        #13  <Field StackTraceElement[] d>
	//   18   30:aastore         
	//   19   31:invokevirtual   #30  <Method Object Method.invoke(Object, Object[])>
	//   20   34:checkcast       #32  <Class String>
	//   21   37:invokespecial   #35  <Method void bat(String)>
	//   22   40:astore_3        
		akh akh1 = b;
	//   23   41:aload_0         
	//   24   42:getfield        #39  <Field akh b>
	//   25   45:astore_2        
		akh1;
	//   26   46:aload_2         
		JVM INSTR monitorenter ;
	//   27   47:monitorenter    
		akh akh2;
		b.B = bat1.a;
	//   28   48:aload_0         
	//   29   49:getfield        #39  <Field akh b>
	//   30   52:aload_3         
	//   31   53:getfield        #42  <Field Long bat.a>
	//   32   56:putfield        #47  <Field Long akh.B>
		if(!bat1.b.booleanValue())
			break MISSING_BLOCK_LABEL_99;
	//   33   59:aload_3         
	//   34   60:getfield        #50  <Field Boolean bat.b>
	//   35   63:invokevirtual   #56  <Method boolean Boolean.booleanValue()>
	//   36   66:ifeq            99
		akh2 = b;
	//   37   69:aload_0         
	//   38   70:getfield        #39  <Field akh b>
	//   39   73:astore          4
		if(bat1.c.booleanValue())
	//*  40   75:aload_3         
	//*  41   76:getfield        #58  <Field Boolean bat.c>
	//*  42   79:invokevirtual   #56  <Method boolean Boolean.booleanValue()>
	//*  43   82:ifeq            87
			i = 0;
	//   44   85:iconst_0        
	//   45   86:istore_1        
		akh2.J = Integer.valueOf(i);
	//   46   87:aload           4
	//   47   89:iload_1         
	//   48   90:invokestatic    #64  <Method Integer Integer.valueOf(int)>
	//   49   93:putfield        #68  <Field Integer akh.J>
		break MISSING_BLOCK_LABEL_110;
	//   50   96:goto            110
		b.J = Integer.valueOf(2);
	//   51   99:aload_0         
	//   52  100:getfield        #39  <Field akh b>
	//   53  103:iconst_2        
	//   54  104:invokestatic    #64  <Method Integer Integer.valueOf(int)>
	//   55  107:putfield        #68  <Field Integer akh.J>
		akh1;
	//   56  110:aload_2         
		JVM INSTR monitorexit ;
	//   57  111:monitorexit     
		return;
	//   58  112:return          
		Exception exception;
		exception;
	//   59  113:astore_3        
		akh1;
	//   60  114:aload_2         
		JVM INSTR monitorexit ;
	//   61  115:monitorexit     
		throw exception;
	//   62  116:aload_3         
	//   63  117:athrow          
	//   64  118:return          
	}

	private final StackTraceElement d[];
}
