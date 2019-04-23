// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.a.g;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import biz.bookdesign.librivox.a.h;
import biz.bookdesign.librivox.a.i;
import java.util.List;

// Referenced classes of package biz.bookdesign.librivox:
//			be, BookActivity, el, dx, 
//			x, dq, y, ab

public class BookFragment extends Fragment
{

	public BookFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Fragment()>
		k = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #32  <Field boolean k>
	//    5    9:return          
	}

	static int a(BookFragment bookfragment, int i1)
	{
		return bookfragment.b(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #37  <Method int b(int)>
	//    3    5:ireturn         
	}

	static y a(BookFragment bookfragment)
	{
		return bookfragment.b;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field y b>
	//    2    4:areturn         
	}

	private void a()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #42  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #44  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #49  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private boolean a(int i1)
	{
		return j.contains(((Object) (Integer.valueOf(i1))));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field List j>
	//    2    4:iload_1         
	//    3    5:invokestatic    #58  <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #64  <Method boolean List.contains(Object)>
	//    5   13:ireturn         
	}

	static boolean a(BookFragment bookfragment, boolean flag)
	{
		bookfragment.k = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field boolean k>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private int b()
	{
		int i1 = d.a();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field be d>
	//    2    4:invokevirtual   #72  <Method int be.a()>
	//    3    7:istore_1        
		if(k)
	//*   4    8:aload_0         
	//*   5    9:getfield        #32  <Field boolean k>
	//*   6   12:ifeq            17
			return i1;
	//    7   15:iload_1         
	//    8   16:ireturn         
		else
			return Math.min(3, i1);
	//    9   17:iconst_3        
	//   10   18:iload_1         
	//   11   19:invokestatic    #78  <Method int Math.min(int, int)>
	//   12   22:ireturn         
	}

	private int b(int i1)
	{
		int k1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int j1 = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		int l1;
		do
		{
			l1 = j1;
	//    4    4:iload_2         
	//    5    5:istore          4
			if(k1 >= i1)
				break;
	//    6    7:iload_3         
	//    7    8:iload_1         
	//    8    9:icmpge          71
			l1 = j1;
	//    9   12:iload_2         
	//   10   13:istore          4
			if(((Integer)j.get(j1)).intValue() == k1)
	//*  11   15:aload_0         
	//*  12   16:getfield        #52  <Field List j>
	//*  13   19:iload_2         
	//*  14   20:invokeinterface #82  <Method Object List.get(int)>
	//*  15   25:checkcast       #54  <Class Integer>
	//*  16   28:invokevirtual   #85  <Method int Integer.intValue()>
	//*  17   31:iload_3         
	//*  18   32:icmpne          61
			{
				j1++;
	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
				l1 = j1;
	//   23   39:iload_2         
	//   24   40:istore          4
				if(j1 == j.size())
	//*  25   42:iload_2         
	//*  26   43:aload_0         
	//*  27   44:getfield        #52  <Field List j>
	//*  28   47:invokeinterface #88  <Method int List.size()>
	//*  29   52:icmpne          61
				{
					l1 = j1;
	//   30   55:iload_2         
	//   31   56:istore          4
					break;
	//   32   58:goto            71
				}
			}
			k1++;
	//   33   61:iload_3         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_3        
			j1 = l1;
	//   37   65:iload           4
	//   38   67:istore_2        
		} while(true);
	//   39   68:goto            4
		return i1 - l1;
	//   40   71:iload_1         
	//   41   72:iload           4
	//   42   74:isub            
	//   43   75:ireturn         
	}

	static int b(BookFragment bookfragment, int i1)
	{
		return bookfragment.c(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #90  <Method int c(int)>
	//    3    5:ireturn         
	}

	static List b(BookFragment bookfragment)
	{
		return bookfragment.j;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field List j>
	//    2    4:areturn         
	}

	private int c()
	{
		return d.a() <= 3 ? 0 : 1;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field be d>
	//    2    4:invokevirtual   #72  <Method int be.a()>
	//    3    7:iconst_3        
	//    4    8:icmple          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private int c(int i1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #42  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #44  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #49  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	static int c(BookFragment bookfragment, int i1)
	{
		return bookfragment.d(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #93  <Method int d(int)>
	//    3    5:ireturn         
	}

	static el c(BookFragment bookfragment)
	{
		return bookfragment.c;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field el c>
	//    2    4:areturn         
	}

	private int d()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #102 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return a.getWindow().getStatusBarColor();
	//    3    8:aload_0         
	//    4    9:getfield        #104 <Field BookActivity a>
	//    5   12:invokevirtual   #110 <Method Window BookActivity.getWindow()>
	//    6   15:invokevirtual   #115 <Method int Window.getStatusBarColor()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	private int d(int i1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #42  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #44  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #49  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	static int d(BookFragment bookfragment)
	{
		return bookfragment.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #118 <Method int b()>
	//    2    4:ireturn         
	}

	static boolean d(BookFragment bookfragment, int i1)
	{
		return bookfragment.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #121 <Method boolean a(int)>
	//    3    5:ireturn         
	}

	static int e(BookFragment bookfragment)
	{
		return bookfragment.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method int c()>
	//    2    4:ireturn         
	}

	static dx f(BookFragment bookfragment)
	{
		return bookfragment.e;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field dx e>
	//    2    4:areturn         
	}

	static be g(BookFragment bookfragment)
	{
		return bookfragment.d;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field be d>
	//    2    4:areturn         
	}

	static void h(BookFragment bookfragment)
	{
		bookfragment.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void a()>
	//    2    4:return          
	}

	static BookActivity i(BookFragment bookfragment)
	{
		return bookfragment.a;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field BookActivity a>
	//    2    4:areturn         
	}

	static boolean j(BookFragment bookfragment)
	{
		return bookfragment.k;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field boolean k>
	//    2    4:ireturn         
	}

	static int k(BookFragment bookfragment)
	{
		return bookfragment.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method int d()>
	//    2    4:ireturn         
	}

	static dq l(BookFragment bookfragment)
	{
		return bookfragment.h;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field dq h>
	//    2    4:areturn         
	}

	public void onActivityCreated(Bundle bundle)
	{
		a = (BookActivity)super.getActivity();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #144 <Method android.support.v4.app.x Fragment.getActivity()>
	//    3    5:checkcast       #106 <Class BookActivity>
	//    4    8:putfield        #104 <Field BookActivity a>
		Object obj = ((Object) (a));
	//    5   11:aload_0         
	//    6   12:getfield        #104 <Field BookActivity a>
	//    7   15:astore_2        
		if(obj != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          185
		{
			c = (new el(((android.content.Context) (obj)), ((BookActivity) (obj)).b)).a(3);
	//   10   20:aload_0         
	//   11   21:new             #146 <Class el>
	//   12   24:dup             
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:getfield        #149 <Field biz.bookdesign.librivox.b.a BookActivity.b>
	//   16   30:invokespecial   #152 <Method void el(android.content.Context, biz.bookdesign.librivox.b.a)>
	//   17   33:iconst_3        
	//   18   34:invokevirtual   #155 <Method el el.a(int)>
	//   19   37:putfield        #96  <Field el c>
			d = new be(a);
	//   20   40:aload_0         
	//   21   41:new             #70  <Class be>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #104 <Field BookActivity a>
	//   25   49:invokespecial   #158 <Method void be(BookActivity)>
	//   26   52:putfield        #68  <Field be d>
			obj = ((Object) (a));
	//   27   55:aload_0         
	//   28   56:getfield        #104 <Field BookActivity a>
	//   29   59:astore_2        
			e = new dx(((android.support.v4.app.x) (obj)), ((BookActivity) (obj)).b, ((Runnable) (new x(this))));
	//   30   60:aload_0         
	//   31   61:new             #160 <Class dx>
	//   32   64:dup             
	//   33   65:aload_2         
	//   34   66:aload_2         
	//   35   67:getfield        #149 <Field biz.bookdesign.librivox.b.a BookActivity.b>
	//   36   70:new             #162 <Class x>
	//   37   73:dup             
	//   38   74:aload_0         
	//   39   75:invokespecial   #164 <Method void x(BookFragment)>
	//   40   78:invokespecial   #167 <Method void dx(android.support.v4.app.x, biz.bookdesign.librivox.b.a, Runnable)>
	//   41   81:putfield        #126 <Field dx e>
			a();
	//   42   84:aload_0         
	//   43   85:invokespecial   #130 <Method void a()>
			obj = ((Object) ((FloatingActionButton)i.findViewById(h.play_button)));
	//   44   88:aload_0         
	//   45   89:getfield        #169 <Field ViewGroup i>
	//   46   92:getstatic       #174 <Field int h.play_button>
	//   47   95:invokevirtual   #180 <Method View ViewGroup.findViewById(int)>
	//   48   98:checkcast       #182 <Class FloatingActionButton>
	//   49  101:astore_2        
			BookActivity bookactivity = a;
	//   50  102:aload_0         
	//   51  103:getfield        #104 <Field BookActivity a>
	//   52  106:astore_3        
			h = new dq(((bi) (bookactivity)), ((android.widget.ImageButton) (obj)), bookactivity.b);
	//   53  107:aload_0         
	//   54  108:new             #184 <Class dq>
	//   55  111:dup             
	//   56  112:aload_3         
	//   57  113:aload_2         
	//   58  114:aload_3         
	//   59  115:getfield        #149 <Field biz.bookdesign.librivox.b.a BookActivity.b>
	//   60  118:invokespecial   #187 <Method void dq(bi, android.widget.ImageButton, biz.bookdesign.librivox.b.a)>
	//   61  121:putfield        #138 <Field dq h>
			obj = ((Object) ((RecyclerView)i.findViewById(h.list)));
	//   62  124:aload_0         
	//   63  125:getfield        #169 <Field ViewGroup i>
	//   64  128:getstatic       #190 <Field int h.list>
	//   65  131:invokevirtual   #180 <Method View ViewGroup.findViewById(int)>
	//   66  134:checkcast       #192 <Class RecyclerView>
	//   67  137:astore_2        
			((RecyclerView) (obj)).setHasFixedSize(true);
	//   68  138:aload_2         
	//   69  139:iconst_1        
	//   70  140:invokevirtual   #196 <Method void RecyclerView.setHasFixedSize(boolean)>
			((RecyclerView) (obj)).setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (new LinearLayoutManager(((android.content.Context) (a))))));
	//   71  143:aload_2         
	//   72  144:new             #198 <Class LinearLayoutManager>
	//   73  147:dup             
	//   74  148:aload_0         
	//   75  149:getfield        #104 <Field BookActivity a>
	//   76  152:invokespecial   #201 <Method void LinearLayoutManager(android.content.Context)>
	//   77  155:invokevirtual   #205 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
			b = new y(this, ((x) (null)));
	//   78  158:aload_0         
	//   79  159:new             #207 <Class y>
	//   80  162:dup             
	//   81  163:aload_0         
	//   82  164:aconst_null     
	//   83  165:invokespecial   #210 <Method void y(BookFragment, x)>
	//   84  168:putfield        #40  <Field y b>
			((RecyclerView) (obj)).setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (b)));
	//   85  171:aload_2         
	//   86  172:aload_0         
	//   87  173:getfield        #40  <Field y b>
	//   88  176:invokevirtual   #214 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
			super.onActivityCreated(bundle);
	//   89  179:aload_0         
	//   90  180:aload_1         
	//   91  181:invokespecial   #216 <Method void Fragment.onActivityCreated(Bundle)>
			return;
	//   92  184:return          
		} else
		{
			throw new IllegalStateException("Null activity in onActivityCreated");
	//   93  185:new             #218 <Class IllegalStateException>
	//   94  188:dup             
	//   95  189:ldc1            #220 <String "Null activity in onActivityCreated">
	//   96  191:invokespecial   #221 <Method void IllegalStateException(String)>
	//   97  194:athrow          
		}
	}

	public void onActivityResult(int i1, int j1, Intent intent)
	{
		b.a();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field y b>
	//    2    4:invokevirtual   #224 <Method void y.a()>
		super.onActivityResult(i1, j1, intent);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #226 <Method void Fragment.onActivityResult(int, int, Intent)>
	//    8   14:return          
	}

	public boolean onContextItemSelected(MenuItem menuitem)
	{
		if(menuitem.getGroupId() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #233 <Method int MenuItem.getGroupId()>
	//*   2    6:ifne            18
			return d.a(menuitem);
	//    3    9:aload_0         
	//    4   10:getfield        #68  <Field be d>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #235 <Method boolean be.a(MenuItem)>
	//    7   17:ireturn         
		else
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		f = new ab(this, ((x) (null)));
	//    0    0:aload_0         
	//    1    1:new             #239 <Class ab>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #240 <Method void ab(BookFragment, x)>
	//    6   10:putfield        #242 <Field ab f>
		g = android.support.v4.a.g.a(((android.content.Context) (a)));
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #104 <Field BookActivity a>
	//   10   18:invokestatic    #247 <Method g g.a(android.content.Context)>
	//   11   21:putfield        #249 <Field g g>
		i = (ViewGroup)layoutinflater.inflate(i.book_contents, viewgroup, false);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:getstatic       #254 <Field int i.book_contents>
	//   15   29:aload_2         
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #260 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   18   34:checkcast       #176 <Class ViewGroup>
	//   19   37:putfield        #169 <Field ViewGroup i>
		return ((View) (i));
	//   20   40:aload_0         
	//   21   41:getfield        #169 <Field ViewGroup i>
	//   22   44:areturn         
	}

	public void onPause()
	{
		g.a(((android.content.BroadcastReceiver) (f)));
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field g g>
	//    2    4:aload_0         
	//    3    5:getfield        #242 <Field ab f>
	//    4    8:invokevirtual   #264 <Method void g.a(android.content.BroadcastReceiver)>
		super.onPause();
	//    5   11:aload_0         
	//    6   12:invokespecial   #266 <Method void Fragment.onPause()>
	//    7   15:return          
	}

	public void onResume()
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #269 <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #270 <Method void IntentFilter()>
	//    3    7:astore_1        
		intentfilter.addAction("biz.bookdesign.librivox.dl.DOWNLOAD_NOTIFICATION");
	//    4    8:aload_1         
	//    5    9:ldc2            #272 <String "biz.bookdesign.librivox.dl.DOWNLOAD_NOTIFICATION">
	//    6   12:invokevirtual   #275 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.CHAPTER_NOTIFICATION");
	//    7   15:aload_1         
	//    8   16:ldc2            #277 <String "biz.bookdesign.librivox.CHAPTER_NOTIFICATION">
	//    9   19:invokevirtual   #275 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.PAUSE_NOTIFICATION");
	//   10   22:aload_1         
	//   11   23:ldc2            #279 <String "biz.bookdesign.librivox.PAUSE_NOTIFICATION">
	//   12   26:invokevirtual   #275 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.BUFFERING_START");
	//   13   29:aload_1         
	//   14   30:ldc2            #281 <String "biz.bookdesign.librivox.BUFFERING_START">
	//   15   33:invokevirtual   #275 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.BUFFERING_STOP");
	//   16   36:aload_1         
	//   17   37:ldc2            #283 <String "biz.bookdesign.librivox.BUFFERING_STOP">
	//   18   40:invokevirtual   #275 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("biz.bookdesign.librivox.SERVICE_CONNECTED_NOTIFICATION");
	//   19   43:aload_1         
	//   20   44:ldc2            #285 <String "biz.bookdesign.librivox.SERVICE_CONNECTED_NOTIFICATION">
	//   21   47:invokevirtual   #275 <Method void IntentFilter.addAction(String)>
		g.a(((android.content.BroadcastReceiver) (f)), intentfilter);
	//   22   50:aload_0         
	//   23   51:getfield        #249 <Field g g>
	//   24   54:aload_0         
	//   25   55:getfield        #242 <Field ab f>
	//   26   58:aload_1         
	//   27   59:invokevirtual   #288 <Method void g.a(android.content.BroadcastReceiver, IntentFilter)>
		super.onResume();
	//   28   62:aload_0         
	//   29   63:invokespecial   #290 <Method void Fragment.onResume()>
	//   30   66:return          
	}

	private BookActivity a;
	private y b;
	private el c;
	private be d;
	private dx e;
	private ab f;
	private g g;
	private dq h;
	private ViewGroup i;
	private List j;
	private boolean k;
}
