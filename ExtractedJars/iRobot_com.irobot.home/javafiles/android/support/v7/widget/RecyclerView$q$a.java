// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$q$a
{

	private void b()
	{
		if(e != null && c < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Interpolator e>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #24  <Field int c>
	//*   5   11:iconst_1        
	//*   6   12:icmpge          25
			throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
	//    7   15:new             #26  <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc1            #28  <String "If you provide an interpolator, you must set a positive duration">
	//   10   21:invokespecial   #32  <Method void IllegalStateException(String)>
	//   11   24:athrow          
		if(c < 1)
	//*  12   25:aload_0         
	//*  13   26:getfield        #24  <Field int c>
	//*  14   29:iconst_1        
	//*  15   30:icmpge          43
			throw new IllegalStateException("Scroll duration must be a positive number");
	//   16   33:new             #26  <Class IllegalStateException>
	//   17   36:dup             
	//   18   37:ldc1            #34  <String "Scroll duration must be a positive number">
	//   19   39:invokespecial   #32  <Method void IllegalStateException(String)>
	//   20   42:athrow          
		else
			return;
	//   21   43:return          
	}

	void a(RecyclerView recyclerview)
	{
		if(d >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int d>
	//*   2    4:iflt            28
		{
			int i = d;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field int d>
	//    5   11:istore_2        
			d = -1;
	//    6   12:aload_0         
	//    7   13:iconst_m1       
	//    8   14:putfield        #38  <Field int d>
			recyclerview.b(i);
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #41  <Method void RecyclerView.b(int)>
			f = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #43  <Field boolean f>
			return;
	//   15   27:return          
		}
		if(f)
	//*  16   28:aload_0         
	//*  17   29:getfield        #43  <Field boolean f>
	//*  18   32:ifeq            151
		{
			b();
	//   19   35:aload_0         
	//   20   36:invokespecial   #45  <Method void b()>
			if(e == null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #22  <Field Interpolator e>
	//*  23   43:ifnonnull       95
			{
				if(c == 0x80000000)
	//*  24   46:aload_0         
	//*  25   47:getfield        #24  <Field int c>
	//*  26   50:ldc1            #46  <Int 0x80000000>
	//*  27   52:icmpne          73
					recyclerview.y.b(a, b);
	//   28   55:aload_1         
	//   29   56:getfield        #50  <Field RecyclerView$t RecyclerView.y>
	//   30   59:aload_0         
	//   31   60:getfield        #52  <Field int a>
	//   32   63:aload_0         
	//   33   64:getfield        #54  <Field int b>
	//   34   67:invokevirtual   #59  <Method void RecyclerView$t.b(int, int)>
				else
	//*  35   70:goto            118
					recyclerview.y.a(a, b, c);
	//   36   73:aload_1         
	//   37   74:getfield        #50  <Field RecyclerView$t RecyclerView.y>
	//   38   77:aload_0         
	//   39   78:getfield        #52  <Field int a>
	//   40   81:aload_0         
	//   41   82:getfield        #54  <Field int b>
	//   42   85:aload_0         
	//   43   86:getfield        #24  <Field int c>
	//   44   89:invokevirtual   #62  <Method void RecyclerView$t.a(int, int, int)>
			} else
	//*  45   92:goto            118
			{
				recyclerview.y.a(a, b, c, e);
	//   46   95:aload_1         
	//   47   96:getfield        #50  <Field RecyclerView$t RecyclerView.y>
	//   48   99:aload_0         
	//   49  100:getfield        #52  <Field int a>
	//   50  103:aload_0         
	//   51  104:getfield        #54  <Field int b>
	//   52  107:aload_0         
	//   53  108:getfield        #24  <Field int c>
	//   54  111:aload_0         
	//   55  112:getfield        #22  <Field Interpolator e>
	//   56  115:invokevirtual   #65  <Method void RecyclerView$t.a(int, int, int, Interpolator)>
			}
			g = g + 1;
	//   57  118:aload_0         
	//   58  119:aload_0         
	//   59  120:getfield        #67  <Field int g>
	//   60  123:iconst_1        
	//   61  124:iadd            
	//   62  125:putfield        #67  <Field int g>
			if(g > 10)
	//*  63  128:aload_0         
	//*  64  129:getfield        #67  <Field int g>
	//*  65  132:bipush          10
	//*  66  134:icmple          145
				Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
	//   67  137:ldc1            #69  <String "RecyclerView">
	//   68  139:ldc1            #71  <String "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary">
	//   69  141:invokestatic    #76  <Method int Log.e(String, String)>
	//   70  144:pop             
			f = false;
	//   71  145:aload_0         
	//   72  146:iconst_0        
	//   73  147:putfield        #43  <Field boolean f>
			return;
	//   74  150:return          
		} else
		{
			g = 0;
	//   75  151:aload_0         
	//   76  152:iconst_0        
	//   77  153:putfield        #67  <Field int g>
			return;
	//   78  156:return          
		}
	}

	boolean a()
	{
		return d >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int d>
	//    2    4:iflt            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private int a;
	private int b;
	private int c;
	private int d;
	private Interpolator e;
	private boolean f;
	private int g;
}
