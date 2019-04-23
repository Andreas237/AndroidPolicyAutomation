// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			rd, bwk, zv, p, 
//			m, zzbbi, xg, qz

final class ra
	implements rd
{

	ra(Context context)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Context a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final boolean a(zzbbi zzbbi1)
	{
		bwk.a();
	//    0    0:invokestatic    #22  <Method zv bwk.a()>
	//    1    3:pop             
		boolean flag1 = zv.c(a, 0xbdfcb8);
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field Context a>
	//    4    8:ldc1            #23  <Int 0xbdfcb8>
	//    5   10:invokestatic    #29  <Method boolean zv.c(Context, int)>
	//    6   13:istore_3        
		e e = p.cw;
	//    7   14:getstatic       #35  <Field e p.cw>
	//    8   17:astore          5
		boolean flag;
		if(((Boolean)bwk.e().a(e)).booleanValue() && zzbbi1.d)
	//*   9   19:invokestatic    #39  <Method m bwk.e()>
	//*  10   22:aload           5
	//*  11   24:invokevirtual   #44  <Method Object m.a(e)>
	//*  12   27:checkcast       #46  <Class Boolean>
	//*  13   30:invokevirtual   #50  <Method boolean Boolean.booleanValue()>
	//*  14   33:ifeq            48
	//*  15   36:aload_1         
	//*  16   37:getfield        #56  <Field boolean zzbbi.d>
	//*  17   40:ifeq            48
			flag = true;
	//   18   43:iconst_1        
	//   19   44:istore_2        
		else
	//*  20   45:goto            50
			flag = false;
	//   21   48:iconst_0        
	//   22   49:istore_2        
		aw.e();
	//   23   50:invokestatic    #61  <Method xg aw.e()>
	//   24   53:pop             
		boolean flag2 = xg.f(a.getPackageName());
	//   25   54:aload_0         
	//   26   55:getfield        #12  <Field Context a>
	//   27   58:invokevirtual   #67  <Method String Context.getPackageName()>
	//   28   61:invokestatic    #73  <Method boolean xg.f(String)>
	//   29   64:istore          4
		if(qz.a(a, zzbbi1.d) && flag1 && !flag)
	//*  30   66:aload_0         
	//*  31   67:getfield        #12  <Field Context a>
	//*  32   70:aload_1         
	//*  33   71:getfield        #56  <Field boolean zzbbi.d>
	//*  34   74:invokestatic    #78  <Method boolean qz.a(Context, boolean)>
	//*  35   77:ifeq            97
	//*  36   80:iload_3         
	//*  37   81:ifeq            97
	//*  38   84:iload_2         
	//*  39   85:ifne            97
			return flag2;
	//   40   88:iload           4
	//   41   90:ifeq            95
	//   42   93:iconst_1        
	//   43   94:ireturn         
	//   44   95:iconst_0        
	//   45   96:ireturn         
		else
			return true;
	//   46   97:iconst_1        
	//   47   98:ireturn         
	}

	private final Context a;
}
