// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.c.a;
import android.support.v4.view.s;
import android.support.v4.widget.p;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//			BottomSheetBehavior

class BottomSheetBehavior$2 extends android.support.v4.widget.p.a
{

	public int a(View view)
	{
		int i;
		if(a.c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field BottomSheetBehavior a>
	//*   2    4:getfield        #21  <Field boolean BottomSheetBehavior.c>
	//*   3    7:ifeq            28
			i = a.f;
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field BottomSheetBehavior a>
	//    6   14:getfield        #25  <Field int BottomSheetBehavior.f>
	//    7   17:istore_2        
		else
	//*   8   18:iload_2         
	//*   9   19:aload_0         
	//*  10   20:getfield        #12  <Field BottomSheetBehavior a>
	//*  11   23:getfield        #27  <Field int android.support.design.widget.BottomSheetBehavior.a>
	//*  12   26:isub            
	//*  13   27:ireturn         
			i = a.b;
	//   14   28:aload_0         
	//   15   29:getfield        #12  <Field BottomSheetBehavior a>
	//   16   32:getfield        #30  <Field int BottomSheetBehavior.b>
	//   17   35:istore_2        
		return i - a.a;
	//*  18   36:goto            18
	}

	public int a(View view, int i, int j)
	{
		int k = a.a;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field BottomSheetBehavior a>
	//    2    4:getfield        #27  <Field int android.support.design.widget.BottomSheetBehavior.a>
	//    3    7:istore          4
		if(a.c)
	//*   4    9:aload_0         
	//*   5   10:getfield        #12  <Field BottomSheetBehavior a>
	//*   6   13:getfield        #21  <Field boolean BottomSheetBehavior.c>
	//*   7   16:ifeq            30
			j = a.f;
	//    8   19:aload_0         
	//    9   20:getfield        #12  <Field BottomSheetBehavior a>
	//   10   23:getfield        #25  <Field int BottomSheetBehavior.f>
	//   11   26:istore_3        
		else
	//*  12   27:goto            38
			j = a.b;
	//   13   30:aload_0         
	//   14   31:getfield        #12  <Field BottomSheetBehavior a>
	//   15   34:getfield        #30  <Field int BottomSheetBehavior.b>
	//   16   37:istore_3        
		return android.support.v4.c.a.a(i, k, j);
	//   17   38:iload_2         
	//   18   39:iload           4
	//   19   41:iload_3         
	//   20   42:invokestatic    #36  <Method int a.a(int, int, int)>
	//   21   45:ireturn         
	}

	public void a(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          13
			a.c(1);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field BottomSheetBehavior a>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #39  <Method void BottomSheetBehavior.c(int)>
	//    7   13:return          
	}

	public void a(View view, float f, float f1)
	{
		byte byte0 = 4;
	//    0    0:iconst_4        
	//    1    1:istore          4
		if(f1 >= 0.0F) goto _L2; else goto _L1
	//    2    3:fload_3         
	//    3    4:fconst_0        
	//    4    5:fcmpg           
	//    5    6:ifge            24
_L1:
		int i;
		i = a.a;
	//    6    9:aload_0         
	//    7   10:getfield        #12  <Field BottomSheetBehavior a>
	//    8   13:getfield        #27  <Field int android.support.design.widget.BottomSheetBehavior.a>
	//    9   16:istore          5
		byte0 = 3;
	//   10   18:iconst_3        
	//   11   19:istore          4
		break MISSING_BLOCK_LABEL_114;
	//   12   21:goto            114
_L2:
		if(a.c && a.a(view, f1))
	//*  13   24:aload_0         
	//*  14   25:getfield        #12  <Field BottomSheetBehavior a>
	//*  15   28:getfield        #21  <Field boolean BottomSheetBehavior.c>
	//*  16   31:ifeq            61
	//*  17   34:aload_0         
	//*  18   35:getfield        #12  <Field BottomSheetBehavior a>
	//*  19   38:aload_1         
	//*  20   39:fload_3         
	//*  21   40:invokevirtual   #43  <Method boolean android.support.design.widget.BottomSheetBehavior.a(View, float)>
	//*  22   43:ifeq            61
		{
			i = a.f;
	//   23   46:aload_0         
	//   24   47:getfield        #12  <Field BottomSheetBehavior a>
	//   25   50:getfield        #25  <Field int BottomSheetBehavior.f>
	//   26   53:istore          5
			byte0 = 5;
	//   27   55:iconst_5        
	//   28   56:istore          4
			break MISSING_BLOCK_LABEL_114;
	//   29   58:goto            114
		}
		if(f1 != 0.0F)
			break; /* Loop/switch isn't completed */
	//   30   61:fload_3         
	//   31   62:fconst_0        
	//   32   63:fcmpl           
	//   33   64:ifne            105
		i = view.getTop();
	//   34   67:aload_1         
	//   35   68:invokevirtual   #49  <Method int View.getTop()>
	//   36   71:istore          5
		if(Math.abs(i - a.a) >= Math.abs(i - a.b)) goto _L3; else goto _L1
	//   37   73:iload           5
	//   38   75:aload_0         
	//   39   76:getfield        #12  <Field BottomSheetBehavior a>
	//   40   79:getfield        #27  <Field int android.support.design.widget.BottomSheetBehavior.a>
	//   41   82:isub            
	//   42   83:invokestatic    #55  <Method int Math.abs(int)>
	//   43   86:iload           5
	//   44   88:aload_0         
	//   45   89:getfield        #12  <Field BottomSheetBehavior a>
	//   46   92:getfield        #30  <Field int BottomSheetBehavior.b>
	//   47   95:isub            
	//   48   96:invokestatic    #55  <Method int Math.abs(int)>
	//   49   99:icmpge          105
	//*  50  102:goto            9
_L3:
		i = a.b;
	//   51  105:aload_0         
	//   52  106:getfield        #12  <Field BottomSheetBehavior a>
	//   53  109:getfield        #30  <Field int BottomSheetBehavior.b>
	//   54  112:istore          5
		if(a.e.a(view.getLeft(), i))
	//*  55  114:aload_0         
	//*  56  115:getfield        #12  <Field BottomSheetBehavior a>
	//*  57  118:getfield        #59  <Field p BottomSheetBehavior.e>
	//*  58  121:aload_1         
	//*  59  122:invokevirtual   #62  <Method int View.getLeft()>
	//*  60  125:iload           5
	//*  61  127:invokevirtual   #67  <Method boolean p.a(int, int)>
	//*  62  130:ifeq            160
		{
			a.c(2);
	//   63  133:aload_0         
	//   64  134:getfield        #12  <Field BottomSheetBehavior a>
	//   65  137:iconst_2        
	//   66  138:invokevirtual   #39  <Method void BottomSheetBehavior.c(int)>
			s.a(view, ((Runnable) (new BottomSheetBehavior$b(a, view, ((int) (byte0))))));
	//   67  141:aload_1         
	//   68  142:new             #69  <Class BottomSheetBehavior$b>
	//   69  145:dup             
	//   70  146:aload_0         
	//   71  147:getfield        #12  <Field BottomSheetBehavior a>
	//   72  150:aload_1         
	//   73  151:iload           4
	//   74  153:invokespecial   #72  <Method void BottomSheetBehavior$b(BottomSheetBehavior, View, int)>
	//   75  156:invokestatic    #77  <Method void s.a(View, Runnable)>
			return;
	//   76  159:return          
		} else
		{
			a.c(((int) (byte0)));
	//   77  160:aload_0         
	//   78  161:getfield        #12  <Field BottomSheetBehavior a>
	//   79  164:iload           4
	//   80  166:invokevirtual   #39  <Method void BottomSheetBehavior.c(int)>
			return;
	//   81  169:return          
		}
	}

	public void a(View view, int i, int j, int k, int l)
	{
		a.d(j);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field BottomSheetBehavior a>
	//    2    4:iload_3         
	//    3    5:invokevirtual   #81  <Method void BottomSheetBehavior.d(int)>
	//    4    8:return          
	}

	public boolean a(View view, int i)
	{
		if(a.d == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field BottomSheetBehavior a>
	//*   2    4:getfield        #84  <Field int BottomSheetBehavior.d>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(a.j)
	//*   7   13:aload_0         
	//*   8   14:getfield        #12  <Field BottomSheetBehavior a>
	//*   9   17:getfield        #87  <Field boolean BottomSheetBehavior.j>
	//*  10   20:ifeq            25
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		if(a.d == 3 && a.i == i)
	//*  13   25:aload_0         
	//*  14   26:getfield        #12  <Field BottomSheetBehavior a>
	//*  15   29:getfield        #84  <Field int BottomSheetBehavior.d>
	//*  16   32:iconst_3        
	//*  17   33:icmpne          75
	//*  18   36:aload_0         
	//*  19   37:getfield        #12  <Field BottomSheetBehavior a>
	//*  20   40:getfield        #90  <Field int BottomSheetBehavior.i>
	//*  21   43:iload_2         
	//*  22   44:icmpne          75
		{
			View view1 = (View)a.h.get();
	//   23   47:aload_0         
	//   24   48:getfield        #12  <Field BottomSheetBehavior a>
	//   25   51:getfield        #94  <Field WeakReference BottomSheetBehavior.h>
	//   26   54:invokevirtual   #100 <Method Object WeakReference.get()>
	//   27   57:checkcast       #45  <Class View>
	//   28   60:astore_3        
			if(view1 != null && view1.canScrollVertically(-1))
	//*  29   61:aload_3         
	//*  30   62:ifnull          75
	//*  31   65:aload_3         
	//*  32   66:iconst_m1       
	//*  33   67:invokevirtual   #104 <Method boolean View.canScrollVertically(int)>
	//*  34   70:ifeq            75
				return false;
	//   35   73:iconst_0        
	//   36   74:ireturn         
		}
		return a.g != null && a.g.get() == view;
	//   37   75:aload_0         
	//   38   76:getfield        #12  <Field BottomSheetBehavior a>
	//   39   79:getfield        #107 <Field WeakReference BottomSheetBehavior.g>
	//   40   82:ifnull          101
	//   41   85:aload_0         
	//   42   86:getfield        #12  <Field BottomSheetBehavior a>
	//   43   89:getfield        #107 <Field WeakReference BottomSheetBehavior.g>
	//   44   92:invokevirtual   #100 <Method Object WeakReference.get()>
	//   45   95:aload_1         
	//   46   96:if_acmpne       101
	//   47   99:iconst_1        
	//   48  100:ireturn         
	//   49  101:iconst_0        
	//   50  102:ireturn         
	}

	public int b(View view, int i, int j)
	{
		return view.getLeft();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #62  <Method int View.getLeft()>
	//    2    4:ireturn         
	}

	final BottomSheetBehavior a;

	BottomSheetBehavior$2(BottomSheetBehavior bottomsheetbehavior)
	{
		a = bottomsheetbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BottomSheetBehavior a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void android.support.v4.widget.p$a()>
	//    5    9:return          
	}
}
