// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.am;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aco, add, ab, v, 
//			afn, adc

public final class acu
{

	private acu(Context context, ViewGroup viewgroup, add add1, aco aco1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		aco1 = ((aco) (context));
	//    2    4:aload_1         
	//    3    5:astore          4
		if(context.getApplicationContext() != null)
	//*   4    7:aload_1         
	//*   5    8:invokevirtual   #24  <Method Context Context.getApplicationContext()>
	//*   6   11:ifnull          20
			aco1 = ((aco) (context.getApplicationContext()));
	//    7   14:aload_1         
	//    8   15:invokevirtual   #24  <Method Context Context.getApplicationContext()>
	//    9   18:astore          4
		a = ((Context) (aco1));
	//   10   20:aload_0         
	//   11   21:aload           4
	//   12   23:putfield        #26  <Field Context a>
		c = viewgroup;
	//   13   26:aload_0         
	//   14   27:aload_2         
	//   15   28:putfield        #28  <Field ViewGroup c>
		b = add1;
	//   16   31:aload_0         
	//   17   32:aload_3         
	//   18   33:putfield        #30  <Field add b>
		d = null;
	//   19   36:aload_0         
	//   20   37:aconst_null     
	//   21   38:putfield        #32  <Field aco d>
	//   22   41:return          
	}

	public acu(Context context, ViewGroup viewgroup, afn afn)
	{
		this(context, viewgroup, ((add) (afn)), ((aco) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #36  <Method void acu(Context, ViewGroup, add, aco)>
	//    6    8:return          
	}

	public final aco a()
	{
		am.b("getAdVideoUnderlay must be called from the UI thread.");
	//    0    0:ldc1            #39  <String "getAdVideoUnderlay must be called from the UI thread.">
	//    1    2:invokestatic    #44  <Method void am.b(String)>
		return d;
	//    2    5:aload_0         
	//    3    6:getfield        #32  <Field aco d>
	//    4    9:areturn         
	}

	public final void a(int i, int j, int k, int l)
	{
		am.b("The underlay may only be modified from the UI thread.");
	//    0    0:ldc1            #47  <String "The underlay may only be modified from the UI thread.">
	//    1    2:invokestatic    #44  <Method void am.b(String)>
		aco aco1 = d;
	//    2    5:aload_0         
	//    3    6:getfield        #32  <Field aco d>
	//    4    9:astore          5
		if(aco1 != null)
	//*   5   11:aload           5
	//*   6   13:ifnull          26
			aco1.a(i, j, k, l);
	//    7   16:aload           5
	//    8   18:iload_1         
	//    9   19:iload_2         
	//   10   20:iload_3         
	//   11   21:iload           4
	//   12   23:invokevirtual   #51  <Method void aco.a(int, int, int, int)>
	//   13   26:return          
	}

	public final void a(int i, int j, int k, int l, int i1, boolean flag, adc adc)
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field aco d>
	//*   2    4:ifnull          8
		{
			return;
	//    3    7:return          
		} else
		{
			v.a(b.j().a(), b.c(), new String[] {
				"vpr2"
			});
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field add b>
	//    6   12:invokeinterface #58  <Method ab add.j()>
	//    7   17:invokevirtual   #63  <Method ad ab.a()>
	//    8   20:aload_0         
	//    9   21:getfield        #30  <Field add b>
	//   10   24:invokeinterface #66  <Method aa add.c()>
	//   11   29:iconst_1        
	//   12   30:anewarray       String[]
	//   13   33:dup             
	//   14   34:iconst_0        
	//   15   35:ldc1            #70  <String "vpr2">
	//   16   37:aastore         
	//   17   38:invokestatic    #75  <Method boolean v.a(ad, aa, String[])>
	//   18   41:pop             
			Context context = a;
	//   19   42:aload_0         
	//   20   43:getfield        #26  <Field Context a>
	//   21   46:astore          8
			add add1 = b;
	//   22   48:aload_0         
	//   23   49:getfield        #30  <Field add b>
	//   24   52:astore          9
			d = new aco(context, add1, i1, flag, add1.j().a(), adc);
	//   25   54:aload_0         
	//   26   55:new             #49  <Class aco>
	//   27   58:dup             
	//   28   59:aload           8
	//   29   61:aload           9
	//   30   63:iload           5
	//   31   65:iload           6
	//   32   67:aload           9
	//   33   69:invokeinterface #58  <Method ab add.j()>
	//   34   74:invokevirtual   #63  <Method ad ab.a()>
	//   35   77:aload           7
	//   36   79:invokespecial   #78  <Method void aco(Context, add, int, boolean, ad, adc)>
	//   37   82:putfield        #32  <Field aco d>
			c.addView(((android.view.View) (d)), 0, new android.view.ViewGroup.LayoutParams(-1, -1));
	//   38   85:aload_0         
	//   39   86:getfield        #28  <Field ViewGroup c>
	//   40   89:aload_0         
	//   41   90:getfield        #32  <Field aco d>
	//   42   93:iconst_0        
	//   43   94:new             #80  <Class android.view.ViewGroup$LayoutParams>
	//   44   97:dup             
	//   45   98:iconst_m1       
	//   46   99:iconst_m1       
	//   47  100:invokespecial   #83  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   48  103:invokevirtual   #89  <Method void ViewGroup.addView(android.view.View, int, android.view.ViewGroup$LayoutParams)>
			d.a(i, j, k, l);
	//   49  106:aload_0         
	//   50  107:getfield        #32  <Field aco d>
	//   51  110:iload_1         
	//   52  111:iload_2         
	//   53  112:iload_3         
	//   54  113:iload           4
	//   55  115:invokevirtual   #51  <Method void aco.a(int, int, int, int)>
			b.a(false);
	//   56  118:aload_0         
	//   57  119:getfield        #30  <Field add b>
	//   58  122:iconst_0        
	//   59  123:invokeinterface #92  <Method void add.a(boolean)>
			return;
	//   60  128:return          
		}
	}

	public final void b()
	{
		am.b("onPause must be called from the UI thread.");
	//    0    0:ldc1            #94  <String "onPause must be called from the UI thread.">
	//    1    2:invokestatic    #44  <Method void am.b(String)>
		aco aco1 = d;
	//    2    5:aload_0         
	//    3    6:getfield        #32  <Field aco d>
	//    4    9:astore_1        
		if(aco1 != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          18
			aco1.i();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #97  <Method void aco.i()>
	//    9   18:return          
	}

	public final void c()
	{
		am.b("onDestroy must be called from the UI thread.");
	//    0    0:ldc1            #99  <String "onDestroy must be called from the UI thread.">
	//    1    2:invokestatic    #44  <Method void am.b(String)>
		aco aco1 = d;
	//    2    5:aload_0         
	//    3    6:getfield        #32  <Field aco d>
	//    4    9:astore_1        
		if(aco1 != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          34
		{
			aco1.n();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #102 <Method void aco.n()>
			c.removeView(((android.view.View) (d)));
	//    9   18:aload_0         
	//   10   19:getfield        #28  <Field ViewGroup c>
	//   11   22:aload_0         
	//   12   23:getfield        #32  <Field aco d>
	//   13   26:invokevirtual   #106 <Method void ViewGroup.removeView(android.view.View)>
			d = null;
	//   14   29:aload_0         
	//   15   30:aconst_null     
	//   16   31:putfield        #32  <Field aco d>
		}
	//   17   34:return          
	}

	private final Context a;
	private final add b;
	private final ViewGroup c;
	private aco d;
}
