// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.Method;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcg, p, bwk, m, 
//			akh, bav

public final class bbi extends bcg
{

	public bbi(bav bav, String s, String s1, akh akh1, int i, int j, View view, 
			Activity activity)
	{
		super(bav, s, s1, akh1, i, 62);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:bipush          62
	//    7   10:invokespecial   #13  <Method void bcg(bav, String, String, akh, int, int)>
		e = view;
	//    8   13:aload_0         
	//    9   14:aload           7
	//   10   16:putfield        #15  <Field View e>
		d = activity;
	//   11   19:aload_0         
	//   12   20:aload           8
	//   13   22:putfield        #17  <Field Activity d>
	//   14   25:return          
	}

	protected final void a()
	{
		boolean flag;
		Object aobj[];
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field View e>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		e e1 = p.bg;
	//    4    8:getstatic       #26  <Field e p.bg>
	//    5   11:astore_2        
		flag = ((Boolean)bwk.e().a(e1)).booleanValue();
	//    6   12:invokestatic    #31  <Method m bwk.e()>
	//    7   15:aload_2         
	//    8   16:invokevirtual   #36  <Method Object m.a(e)>
	//    9   19:checkcast       #38  <Class Boolean>
	//   10   22:invokevirtual   #42  <Method boolean Boolean.booleanValue()>
	//   11   25:istore_1        
		aobj = (Object[])c.invoke(((Object) (null)), new Object[] {
			e, d, Boolean.valueOf(flag)
		});
	//   12   26:aload_0         
	//   13   27:getfield        #46  <Field Method c>
	//   14   30:aconst_null     
	//   15   31:iconst_3        
	//   16   32:anewarray       Object[]
	//   17   35:dup             
	//   18   36:iconst_0        
	//   19   37:aload_0         
	//   20   38:getfield        #15  <Field View e>
	//   21   41:aastore         
	//   22   42:dup             
	//   23   43:iconst_1        
	//   24   44:aload_0         
	//   25   45:getfield        #17  <Field Activity d>
	//   26   48:aastore         
	//   27   49:dup             
	//   28   50:iconst_2        
	//   29   51:iload_1         
	//   30   52:invokestatic    #52  <Method Boolean Boolean.valueOf(boolean)>
	//   31   55:aastore         
	//   32   56:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
	//   33   59:checkcast       #60  <Class Object[]>
	//   34   62:astore_3        
		akh akh1 = b;
	//   35   63:aload_0         
	//   36   64:getfield        #64  <Field akh b>
	//   37   67:astore_2        
		akh1;
	//   38   68:aload_2         
		JVM INSTR monitorenter ;
	//   39   69:monitorenter    
		b.Q = Long.valueOf(((Long)aobj[0]).longValue());
	//   40   70:aload_0         
	//   41   71:getfield        #64  <Field akh b>
	//   42   74:aload_3         
	//   43   75:iconst_0        
	//   44   76:aaload          
	//   45   77:checkcast       #66  <Class Long>
	//   46   80:invokevirtual   #70  <Method long Long.longValue()>
	//   47   83:invokestatic    #73  <Method Long Long.valueOf(long)>
	//   48   86:putfield        #79  <Field Long akh.Q>
		b.R = Long.valueOf(((Long)aobj[1]).longValue());
	//   49   89:aload_0         
	//   50   90:getfield        #64  <Field akh b>
	//   51   93:aload_3         
	//   52   94:iconst_1        
	//   53   95:aaload          
	//   54   96:checkcast       #66  <Class Long>
	//   55   99:invokevirtual   #70  <Method long Long.longValue()>
	//   56  102:invokestatic    #73  <Method Long Long.valueOf(long)>
	//   57  105:putfield        #82  <Field Long akh.R>
		if(!flag)
			break MISSING_BLOCK_LABEL_125;
	//   58  108:iload_1         
	//   59  109:ifeq            125
		b.S = (String)aobj[2];
	//   60  112:aload_0         
	//   61  113:getfield        #64  <Field akh b>
	//   62  116:aload_3         
	//   63  117:iconst_2        
	//   64  118:aaload          
	//   65  119:checkcast       #84  <Class String>
	//   66  122:putfield        #88  <Field String akh.S>
		akh1;
	//   67  125:aload_2         
		JVM INSTR monitorexit ;
	//   68  126:monitorexit     
		return;
	//   69  127:return          
		Exception exception;
		exception;
	//   70  128:astore_3        
		akh1;
	//   71  129:aload_2         
		JVM INSTR monitorexit ;
	//   72  130:monitorexit     
		throw exception;
	//   73  131:aload_3         
	//   74  132:athrow          
	}

	private final Activity d;
	private final View e;
}
