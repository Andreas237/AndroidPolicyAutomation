// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, bch, akh, avl, 
//			bav

public final class bbk extends bcg
{

	public bbk(bav bav, String s, String s1, akh akh1, int i, int j, Context context)
	{
		super(bav, s, s1, akh1, i, 29);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          29
	//    7   10:invokespecial   #22  <Method void bcg(bav, String, String, akh, int, int)>
		e = context;
	//    8   13:aload_0         
	//    9   14:aload           7
	//   10   16:putfield        #24  <Field Context e>
	//   11   19:return          
	}

	protected final void a()
	{
		AtomicReference atomicreference;
		b.o = "E";
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field akh b>
	//    2    4:ldc1            #31  <String "E">
	//    3    6:putfield        #37  <Field String akh.o>
		atomicreference = d.a(e.getPackageName());
	//    4    9:getstatic       #17  <Field bch d>
	//    5   12:aload_0         
	//    6   13:getfield        #24  <Field Context e>
	//    7   16:invokevirtual   #43  <Method String Context.getPackageName()>
	//    8   19:invokevirtual   #46  <Method AtomicReference bch.a(String)>
	//    9   22:astore_1        
		if(atomicreference.get() != null)
			break MISSING_BLOCK_LABEL_75;
	//   10   23:aload_1         
	//   11   24:invokevirtual   #52  <Method Object AtomicReference.get()>
	//   12   27:ifnonnull       75
		atomicreference;
	//   13   30:aload_1         
		JVM INSTR monitorenter ;
	//   14   31:monitorenter    
		if(atomicreference.get() == null)
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #52  <Method Object AtomicReference.get()>
	//*  17   36:ifnonnull       65
			atomicreference.set(((Object) ((String)c.invoke(((Object) (null)), new Object[] {
				e
			}))));
	//   18   39:aload_1         
	//   19   40:aload_0         
	//   20   41:getfield        #56  <Field Method c>
	//   21   44:aconst_null     
	//   22   45:iconst_1        
	//   23   46:anewarray       Object[]
	//   24   49:dup             
	//   25   50:iconst_0        
	//   26   51:aload_0         
	//   27   52:getfield        #24  <Field Context e>
	//   28   55:aastore         
	//   29   56:invokevirtual   #64  <Method Object Method.invoke(Object, Object[])>
	//   30   59:checkcast       #66  <Class String>
	//   31   62:invokevirtual   #70  <Method void AtomicReference.set(Object)>
		atomicreference;
	//   32   65:aload_1         
		JVM INSTR monitorexit ;
	//   33   66:monitorexit     
		break MISSING_BLOCK_LABEL_75;
	//   34   67:goto            75
		Exception exception;
		exception;
	//   35   70:astore_2        
		atomicreference;
	//   36   71:aload_1         
		JVM INSTR monitorexit ;
	//   37   72:monitorexit     
		throw exception;
	//   38   73:aload_2         
	//   39   74:athrow          
		String s = (String)atomicreference.get();
	//   40   75:aload_1         
	//   41   76:invokevirtual   #52  <Method Object AtomicReference.get()>
	//   42   79:checkcast       #66  <Class String>
	//   43   82:astore_2        
		synchronized(b)
	//*  44   83:aload_0         
	//*  45   84:getfield        #29  <Field akh b>
	//*  46   87:astore_1        
	//*  47   88:aload_1         
	//*  48   89:monitorenter    
		{
			b.o = avl.a(s.getBytes(), true);
	//   49   90:aload_0         
	//   50   91:getfield        #29  <Field akh b>
	//   51   94:aload_2         
	//   52   95:invokevirtual   #74  <Method byte[] String.getBytes()>
	//   53   98:iconst_1        
	//   54   99:invokestatic    #79  <Method String avl.a(byte[], boolean)>
	//   55  102:putfield        #37  <Field String akh.o>
		}
	//   56  105:aload_1         
	//   57  106:monitorexit     
		return;
	//   58  107:return          
		exception1;
	//   59  108:astore_2        
		akh1;
	//   60  109:aload_1         
		JVM INSTR monitorexit ;
	//   61  110:monitorexit     
		throw exception1;
	//   62  111:aload_2         
	//   63  112:athrow          
	}

	private static bch d = new bch();
	private final Context e;

	static 
	{
	//    0    0:new             #12  <Class bch>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void bch()>
	//    3    7:putstatic       #17  <Field bch d>
	//*   4   10:return          
	}
}
