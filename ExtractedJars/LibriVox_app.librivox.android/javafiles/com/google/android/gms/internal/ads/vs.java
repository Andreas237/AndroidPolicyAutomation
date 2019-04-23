// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bpy, bpx, vt

public final class vs
	implements bpy
{

	public vs(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		Context context1 = context;
	//    2    4:aload_1         
	//    3    5:astore_3        
		if(context.getApplicationContext() != null)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #26  <Method Context Context.getApplicationContext()>
	//*   6   10:ifnull          18
			context1 = context.getApplicationContext();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #26  <Method Context Context.getApplicationContext()>
	//    9   17:astore_3        
		a = context1;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #28  <Field Context a>
		c = s;
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #30  <Field String c>
		d = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #32  <Field boolean d>
	//   19   33:aload_0         
	//   20   34:new             #4   <Class Object>
	//   21   37:dup             
	//   22   38:invokespecial   #20  <Method void Object()>
	//   23   41:putfield        #34  <Field Object b>
	//   24   44:return          
	}

	public final void a(bpx bpx1)
	{
		a(bpx1.a);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #40  <Field boolean bpx.a>
	//    3    5:invokevirtual   #43  <Method void a(boolean)>
	//    4    8:return          
	}

	public final void a(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String c>
	//    3    5:return          
	}

	public final void a(boolean flag)
	{
label0:
		{
			if(!aw.E().a(a))
	//*   0    0:invokestatic    #50  <Method vt aw.E()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #28  <Field Context a>
	//*   3    7:invokevirtual   #55  <Method boolean vt.a(Context)>
	//*   4   10:ifne            14
				return;
	//    5   13:return          
			synchronized(b)
	//*   6   14:aload_0         
	//*   7   15:getfield        #34  <Field Object b>
	//*   8   18:astore_2        
	//*   9   19:aload_2         
	//*  10   20:monitorenter    
			{
				if(d != flag)
					break label0;
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field boolean d>
	//   13   25:iload_1         
	//   14   26:icmpne          32
			}
	//   15   29:aload_2         
	//   16   30:monitorexit     
			return;
	//   17   31:return          
		}
		d = flag;
	//   18   32:aload_0         
	//   19   33:iload_1         
	//   20   34:putfield        #32  <Field boolean d>
		if(!TextUtils.isEmpty(((CharSequence) (c))))
			break MISSING_BLOCK_LABEL_50;
	//   21   37:aload_0         
	//   22   38:getfield        #30  <Field String c>
	//   23   41:invokestatic    #61  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   24   44:ifeq            50
		obj;
	//   25   47:aload_2         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		return;
	//   27   49:return          
		if(d)
	//*  28   50:aload_0         
	//*  29   51:getfield        #32  <Field boolean d>
	//*  30   54:ifeq            74
		{
			aw.E().a(a, c);
	//   31   57:invokestatic    #50  <Method vt aw.E()>
	//   32   60:aload_0         
	//   33   61:getfield        #28  <Field Context a>
	//   34   64:aload_0         
	//   35   65:getfield        #30  <Field String c>
	//   36   68:invokevirtual   #63  <Method void vt.a(Context, String)>
			break MISSING_BLOCK_LABEL_88;
	//   37   71:goto            88
		}
		aw.E().b(a, c);
	//   38   74:invokestatic    #50  <Method vt aw.E()>
	//   39   77:aload_0         
	//   40   78:getfield        #28  <Field Context a>
	//   41   81:aload_0         
	//   42   82:getfield        #30  <Field String c>
	//   43   85:invokevirtual   #65  <Method void vt.b(Context, String)>
		obj;
	//   44   88:aload_2         
		JVM INSTR monitorexit ;
	//   45   89:monitorexit     
		return;
	//   46   90:return          
		exception;
	//   47   91:astore_3        
		obj;
	//   48   92:aload_2         
		JVM INSTR monitorexit ;
	//   49   93:monitorexit     
		throw exception;
	//   50   94:aload_3         
	//   51   95:athrow          
	}

	private final Context a;
	private final Object b = new Object();
	private String c;
	private boolean d;
}
