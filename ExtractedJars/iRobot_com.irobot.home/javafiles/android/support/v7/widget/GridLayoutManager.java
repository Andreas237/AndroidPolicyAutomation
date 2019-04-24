// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.a.b;
import android.util.*;
import android.view.View;
import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutManager, ah, RecyclerView

public class GridLayoutManager extends LinearLayoutManager
{
	public static class LayoutParams extends RecyclerView.LayoutParams
	{

		public int a()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field int a>
		//    2    4:ireturn         
		}

		public int b()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field int b>
		//    2    4:ireturn         
		}

		int a;
		int b;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #14  <Method void RecyclerView$LayoutParams(int, int)>
			a = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #16  <Field int a>
			b = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #18  <Field int b>
		//   10   16:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #22  <Method void RecyclerView$LayoutParams(Context, AttributeSet)>
			a = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #16  <Field int a>
			b = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #18  <Field int b>
		//   10   16:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$LayoutParams)>
			a = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #16  <Field int a>
			b = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #18  <Field int b>
		//    9   15:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #28  <Method void RecyclerView$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			a = -1;
		//    3    5:aload_0         
		//    4    6:iconst_m1       
		//    5    7:putfield        #16  <Field int a>
			b = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #18  <Field int b>
		//    9   15:return          
		}
	}

	public static final class a extends b
	{

		public int a(int i)
		{
			return 1;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public int a(int i, int j)
		{
			return i % j;
		//    0    0:iload_1         
		//    1    1:iload_2         
		//    2    2:irem            
		//    3    3:ireturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void GridLayoutManager$b()>
		//    2    4:return          
		}
	}

	public static abstract class b
	{

		public abstract int a(int i);

		public int a(int i, int j)
		{
			int i2;
			i2 = a(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method int a(int)>
		//    3    5:istore          8
			if(i2 == j)
		//*   4    7:iload           8
		//*   5    9:iload_2         
		//*   6   10:icmpne          15
				return 0;
		//    7   13:iconst_0        
		//    8   14:ireturn         
			if(!b || a.size() <= 0) goto _L2; else goto _L1
		//    9   15:aload_0         
		//   10   16:getfield        #21  <Field boolean b>
		//   11   19:ifeq            64
		//   12   22:aload_0         
		//   13   23:getfield        #19  <Field SparseIntArray a>
		//   14   26:invokevirtual   #30  <Method int SparseIntArray.size()>
		//   15   29:ifle            64
_L1:
			int j1 = b(i);
		//   16   32:aload_0         
		//   17   33:iload_1         
		//   18   34:invokevirtual   #32  <Method int b(int)>
		//   19   37:istore          5
			if(j1 < 0) goto _L2; else goto _L3
		//   20   39:iload           5
		//   21   41:iflt            64
_L3:
			int k = a.get(j1) + a(j1);
		//   22   44:aload_0         
		//   23   45:getfield        #19  <Field SparseIntArray a>
		//   24   48:iload           5
		//   25   50:invokevirtual   #35  <Method int SparseIntArray.get(int)>
		//   26   53:aload_0         
		//   27   54:iload           5
		//   28   56:invokevirtual   #26  <Method int a(int)>
		//   29   59:iadd            
		//   30   60:istore_3        
			  goto _L4
		//*  31   61:goto            124
_L2:
			int i1;
			i1 = 0;
		//   32   64:iconst_0        
		//   33   65:istore          4
			k = 0;
		//   34   67:iconst_0        
		//   35   68:istore_3        
_L6:
			if(i1 >= i)
				break; /* Loop/switch isn't completed */
		//   36   69:iload           4
		//   37   71:iload_1         
		//   38   72:icmpge          133
			int k1 = a(i1);
		//   39   75:aload_0         
		//   40   76:iload           4
		//   41   78:invokevirtual   #26  <Method int a(int)>
		//   42   81:istore          6
			int l1 = k + k1;
		//   43   83:iload_3         
		//   44   84:iload           6
		//   45   86:iadd            
		//   46   87:istore          7
			if(l1 == j)
		//*  47   89:iload           7
		//*  48   91:iload_2         
		//*  49   92:icmpne          104
			{
				k = 0;
		//   50   95:iconst_0        
		//   51   96:istore_3        
				j1 = i1;
		//   52   97:iload           4
		//   53   99:istore          5
			} else
		//*  54  101:goto            124
			{
				j1 = i1;
		//   55  104:iload           4
		//   56  106:istore          5
				k = l1;
		//   57  108:iload           7
		//   58  110:istore_3        
				if(l1 > j)
		//*  59  111:iload           7
		//*  60  113:iload_2         
		//*  61  114:icmple          124
				{
					k = k1;
		//   62  117:iload           6
		//   63  119:istore_3        
					j1 = i1;
		//   64  120:iload           4
		//   65  122:istore          5
				}
			}
_L4:
			i1 = j1 + 1;
		//   66  124:iload           5
		//   67  126:iconst_1        
		//   68  127:iadd            
		//   69  128:istore          4
			if(true) goto _L6; else goto _L5
		//   70  130:goto            69
_L5:
			if(i2 + k <= j)
		//*  71  133:iload           8
		//*  72  135:iload_3         
		//*  73  136:iadd            
		//*  74  137:iload_2         
		//*  75  138:icmpgt          143
				return k;
		//   76  141:iload_3         
		//   77  142:ireturn         
			else
				return 0;
		//   78  143:iconst_0        
		//   79  144:ireturn         
		}

		public void a()
		{
			a.clear();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field SparseIntArray a>
		//    2    4:invokevirtual   #38  <Method void SparseIntArray.clear()>
		//    3    7:return          
		}

		int b(int i)
		{
			int k = a.size() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field SparseIntArray a>
		//    2    4:invokevirtual   #30  <Method int SparseIntArray.size()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_3        
			int j;
			for(j = 0; j <= k;)
		//*   6   10:iconst_0        
		//*   7   11:istore_2        
		//*   8   12:iload_2         
		//*   9   13:iload_3         
		//*  10   14:icmpgt          53
			{
				int i1 = j + k >>> 1;
		//   11   17:iload_2         
		//   12   18:iload_3         
		//   13   19:iadd            
		//   14   20:iconst_1        
		//   15   21:iushr           
		//   16   22:istore          4
				if(a.keyAt(i1) < i)
		//*  17   24:aload_0         
		//*  18   25:getfield        #19  <Field SparseIntArray a>
		//*  19   28:iload           4
		//*  20   30:invokevirtual   #41  <Method int SparseIntArray.keyAt(int)>
		//*  21   33:iload_1         
		//*  22   34:icmpge          45
					j = i1 + 1;
		//   23   37:iload           4
		//   24   39:iconst_1        
		//   25   40:iadd            
		//   26   41:istore_2        
				else
		//*  27   42:goto            12
					k = i1 - 1;
		//   28   45:iload           4
		//   29   47:iconst_1        
		//   30   48:isub            
		//   31   49:istore_3        
			}

		//*  32   50:goto            12
			i = j - 1;
		//   33   53:iload_2         
		//   34   54:iconst_1        
		//   35   55:isub            
		//   36   56:istore_1        
			if(i >= 0 && i < a.size())
		//*  37   57:iload_1         
		//*  38   58:iflt            81
		//*  39   61:iload_1         
		//*  40   62:aload_0         
		//*  41   63:getfield        #19  <Field SparseIntArray a>
		//*  42   66:invokevirtual   #30  <Method int SparseIntArray.size()>
		//*  43   69:icmpge          81
				return a.keyAt(i);
		//   44   72:aload_0         
		//   45   73:getfield        #19  <Field SparseIntArray a>
		//   46   76:iload_1         
		//   47   77:invokevirtual   #41  <Method int SparseIntArray.keyAt(int)>
		//   48   80:ireturn         
			else
				return -1;
		//   49   81:iconst_m1       
		//   50   82:ireturn         
		}

		int b(int i, int j)
		{
			if(!b)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field boolean b>
		//*   2    4:ifne            14
				return a(i, j);
		//    3    7:aload_0         
		//    4    8:iload_1         
		//    5    9:iload_2         
		//    6   10:invokevirtual   #43  <Method int a(int, int)>
		//    7   13:ireturn         
			int k = a.get(i, -1);
		//    8   14:aload_0         
		//    9   15:getfield        #19  <Field SparseIntArray a>
		//   10   18:iload_1         
		//   11   19:iconst_m1       
		//   12   20:invokevirtual   #45  <Method int SparseIntArray.get(int, int)>
		//   13   23:istore_3        
			if(k != -1)
		//*  14   24:iload_3         
		//*  15   25:iconst_m1       
		//*  16   26:icmpeq          31
			{
				return k;
		//   17   29:iload_3         
		//   18   30:ireturn         
			} else
			{
				j = a(i, j);
		//   19   31:aload_0         
		//   20   32:iload_1         
		//   21   33:iload_2         
		//   22   34:invokevirtual   #43  <Method int a(int, int)>
		//   23   37:istore_2        
				a.put(i, j);
		//   24   38:aload_0         
		//   25   39:getfield        #19  <Field SparseIntArray a>
		//   26   42:iload_1         
		//   27   43:iload_2         
		//   28   44:invokevirtual   #49  <Method void SparseIntArray.put(int, int)>
				return j;
		//   29   47:iload_2         
		//   30   48:ireturn         
			}
		}

		public int c(int i, int j)
		{
			int j2 = a(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method int a(int)>
		//    3    5:istore          9
			int k1 = 0;
		//    4    7:iconst_0        
		//    5    8:istore          6
			int k = 0;
		//    6   10:iconst_0        
		//    7   11:istore_3        
			int i1;
			int j1;
			for(i1 = 0; k1 < i; i1 = j1)
		//*   8   12:iconst_0        
		//*   9   13:istore          4
		//*  10   15:iload           6
		//*  11   17:iload_1         
		//*  12   18:icmpge          87
			{
				int l1 = a(k1);
		//   13   21:aload_0         
		//   14   22:iload           6
		//   15   24:invokevirtual   #26  <Method int a(int)>
		//   16   27:istore          7
				int i2 = k + l1;
		//   17   29:iload_3         
		//   18   30:iload           7
		//   19   32:iadd            
		//   20   33:istore          8
				if(i2 == j)
		//*  21   35:iload           8
		//*  22   37:iload_2         
		//*  23   38:icmpne          52
				{
					j1 = i1 + 1;
		//   24   41:iload           4
		//   25   43:iconst_1        
		//   26   44:iadd            
		//   27   45:istore          5
					k = 0;
		//   28   47:iconst_0        
		//   29   48:istore_3        
				} else
		//*  30   49:goto            74
				{
					k = i2;
		//   31   52:iload           8
		//   32   54:istore_3        
					j1 = i1;
		//   33   55:iload           4
		//   34   57:istore          5
					if(i2 > j)
		//*  35   59:iload           8
		//*  36   61:iload_2         
		//*  37   62:icmple          74
					{
						j1 = i1 + 1;
		//   38   65:iload           4
		//   39   67:iconst_1        
		//   40   68:iadd            
		//   41   69:istore          5
						k = l1;
		//   42   71:iload           7
		//   43   73:istore_3        
					}
				}
				k1++;
		//   44   74:iload           6
		//   45   76:iconst_1        
		//   46   77:iadd            
		//   47   78:istore          6
			}

		//   48   80:iload           5
		//   49   82:istore          4
		//*  50   84:goto            15
			i = i1;
		//   51   87:iload           4
		//   52   89:istore_1        
			if(k + j2 > j)
		//*  53   90:iload_3         
		//*  54   91:iload           9
		//*  55   93:iadd            
		//*  56   94:iload_2         
		//*  57   95:icmple          103
				i = i1 + 1;
		//   58   98:iload           4
		//   59  100:iconst_1        
		//   60  101:iadd            
		//   61  102:istore_1        
			return i;
		//   62  103:iload_1         
		//   63  104:ireturn         
		}

		final SparseIntArray a = new SparseIntArray();
		private boolean b;

		public b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #16  <Class SparseIntArray>
		//    4    8:dup             
		//    5    9:invokespecial   #17  <Method void SparseIntArray()>
		//    6   12:putfield        #19  <Field SparseIntArray a>
			b = false;
		//    7   15:aload_0         
		//    8   16:iconst_0        
		//    9   17:putfield        #21  <Field boolean b>
		//   10   20:return          
		}
	}


	public GridLayoutManager(Context context, int i)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void LinearLayoutManager(Context)>
		a = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #33  <Field boolean a>
		b = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #35  <Field int b>
		e = new SparseIntArray();
	//    9   15:aload_0         
	//   10   16:new             #37  <Class SparseIntArray>
	//   11   19:dup             
	//   12   20:invokespecial   #40  <Method void SparseIntArray()>
	//   13   23:putfield        #42  <Field SparseIntArray e>
		f = new SparseIntArray();
	//   14   26:aload_0         
	//   15   27:new             #37  <Class SparseIntArray>
	//   16   30:dup             
	//   17   31:invokespecial   #40  <Method void SparseIntArray()>
	//   18   34:putfield        #44  <Field SparseIntArray f>
		g = ((b) (new a()));
	//   19   37:aload_0         
	//   20   38:new             #9   <Class GridLayoutManager$a>
	//   21   41:dup             
	//   22   42:invokespecial   #45  <Method void GridLayoutManager$a()>
	//   23   45:putfield        #47  <Field GridLayoutManager$b g>
		h = new Rect();
	//   24   48:aload_0         
	//   25   49:new             #49  <Class Rect>
	//   26   52:dup             
	//   27   53:invokespecial   #50  <Method void Rect()>
	//   28   56:putfield        #52  <Field Rect h>
		a(i);
	//   29   59:aload_0         
	//   30   60:iload_2         
	//   31   61:invokevirtual   #55  <Method void a(int)>
	//   32   64:return          
	}

	public GridLayoutManager(Context context, int i, int j, boolean flag)
	{
		super(context, j, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokespecial   #60  <Method void LinearLayoutManager(Context, int, boolean)>
		a = false;
	//    5    8:aload_0         
	//    6    9:iconst_0        
	//    7   10:putfield        #33  <Field boolean a>
		b = -1;
	//    8   13:aload_0         
	//    9   14:iconst_m1       
	//   10   15:putfield        #35  <Field int b>
		e = new SparseIntArray();
	//   11   18:aload_0         
	//   12   19:new             #37  <Class SparseIntArray>
	//   13   22:dup             
	//   14   23:invokespecial   #40  <Method void SparseIntArray()>
	//   15   26:putfield        #42  <Field SparseIntArray e>
		f = new SparseIntArray();
	//   16   29:aload_0         
	//   17   30:new             #37  <Class SparseIntArray>
	//   18   33:dup             
	//   19   34:invokespecial   #40  <Method void SparseIntArray()>
	//   20   37:putfield        #44  <Field SparseIntArray f>
		g = ((b) (new a()));
	//   21   40:aload_0         
	//   22   41:new             #9   <Class GridLayoutManager$a>
	//   23   44:dup             
	//   24   45:invokespecial   #45  <Method void GridLayoutManager$a()>
	//   25   48:putfield        #47  <Field GridLayoutManager$b g>
		h = new Rect();
	//   26   51:aload_0         
	//   27   52:new             #49  <Class Rect>
	//   28   55:dup             
	//   29   56:invokespecial   #50  <Method void Rect()>
	//   30   59:putfield        #52  <Field Rect h>
		a(i);
	//   31   62:aload_0         
	//   32   63:iload_2         
	//   33   64:invokevirtual   #55  <Method void a(int)>
	//   34   67:return          
	}

	public GridLayoutManager(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #63  <Method void LinearLayoutManager(Context, AttributeSet, int, int)>
		a = false;
	//    6    9:aload_0         
	//    7   10:iconst_0        
	//    8   11:putfield        #33  <Field boolean a>
		b = -1;
	//    9   14:aload_0         
	//   10   15:iconst_m1       
	//   11   16:putfield        #35  <Field int b>
		e = new SparseIntArray();
	//   12   19:aload_0         
	//   13   20:new             #37  <Class SparseIntArray>
	//   14   23:dup             
	//   15   24:invokespecial   #40  <Method void SparseIntArray()>
	//   16   27:putfield        #42  <Field SparseIntArray e>
		f = new SparseIntArray();
	//   17   30:aload_0         
	//   18   31:new             #37  <Class SparseIntArray>
	//   19   34:dup             
	//   20   35:invokespecial   #40  <Method void SparseIntArray()>
	//   21   38:putfield        #44  <Field SparseIntArray f>
		g = ((b) (new a()));
	//   22   41:aload_0         
	//   23   42:new             #9   <Class GridLayoutManager$a>
	//   24   45:dup             
	//   25   46:invokespecial   #45  <Method void GridLayoutManager$a()>
	//   26   49:putfield        #47  <Field GridLayoutManager$b g>
		h = new Rect();
	//   27   52:aload_0         
	//   28   53:new             #49  <Class Rect>
	//   29   56:dup             
	//   30   57:invokespecial   #50  <Method void Rect()>
	//   31   60:putfield        #52  <Field Rect h>
		a(a(context, attributeset, i, j).b);
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:aload_2         
	//   35   66:iload_3         
	//   36   67:iload           4
	//   37   69:invokestatic    #66  <Method RecyclerView$h$b a(Context, AttributeSet, int, int)>
	//   38   72:getfield        #69  <Field int android.support.v7.widget.RecyclerView$h$b.b>
	//   39   75:invokevirtual   #55  <Method void a(int)>
	//   40   78:return          
	}

	private void J()
	{
		e.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SparseIntArray e>
	//    2    4:invokevirtual   #73  <Method void SparseIntArray.clear()>
		f.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field SparseIntArray f>
	//    5   11:invokevirtual   #73  <Method void SparseIntArray.clear()>
	//    6   14:return          
	}

	private void K()
	{
		int j = u();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method int u()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          64
		{
			LayoutParams layoutparams = (LayoutParams)h(i).getLayoutParams();
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #81  <Method View h(int)>
	//   11   17:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   20:checkcast       #6   <Class GridLayoutManager$LayoutParams>
	//   13   23:astore          4
			int k = layoutparams.f();
	//   14   25:aload           4
	//   15   27:invokevirtual   #89  <Method int GridLayoutManager$LayoutParams.f()>
	//   16   30:istore_3        
			e.put(k, layoutparams.b());
	//   17   31:aload_0         
	//   18   32:getfield        #42  <Field SparseIntArray e>
	//   19   35:iload_3         
	//   20   36:aload           4
	//   21   38:invokevirtual   #91  <Method int android.support.v7.widget.GridLayoutManager$LayoutParams.b()>
	//   22   41:invokevirtual   #95  <Method void SparseIntArray.put(int, int)>
			f.put(k, layoutparams.a());
	//   23   44:aload_0         
	//   24   45:getfield        #44  <Field SparseIntArray f>
	//   25   48:iload_3         
	//   26   49:aload           4
	//   27   51:invokevirtual   #97  <Method int GridLayoutManager$LayoutParams.a()>
	//   28   54:invokevirtual   #95  <Method void SparseIntArray.put(int, int)>
		}

	//   29   57:iload_1         
	//   30   58:iconst_1        
	//   31   59:iadd            
	//   32   60:istore_1        
	//*  33   61:goto            7
	//   34   64:return          
	}

	private void L()
	{
		int i;
		int j;
		if(f() == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #99  <Method int f()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          26
		{
			i = x() - B();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #102 <Method int x()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #105 <Method int B()>
	//    8   16:isub            
	//    9   17:istore_1        
			j = z();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #108 <Method int z()>
	//   12   22:istore_2        
		} else
	//*  13   23:goto            44
		{
			i = y() - C();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #111 <Method int y()>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #114 <Method int C()>
	//   18   34:isub            
	//   19   35:istore_1        
			j = A();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #117 <Method int A()>
	//   22   40:istore_2        
		}
	//*  23   41:goto            23
		l(i - j);
	//   24   44:aload_0         
	//   25   45:iload_1         
	//   26   46:iload_2         
	//   27   47:isub            
	//   28   48:invokespecial   #120 <Method void l(int)>
	//   29   51:return          
	}

	private void M()
	{
		if(d == null || d.length != b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field View[] d>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #123 <Field View[] d>
	//*   5   11:arraylength     
	//*   6   12:aload_0         
	//*   7   13:getfield        #35  <Field int b>
	//*   8   16:icmpeq          30
			d = new View[b];
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #35  <Field int b>
	//   12   24:anewarray       View[]
	//   13   27:putfield        #123 <Field View[] d>
	//   14   30:return          
	}

	private int a(RecyclerView.n n, RecyclerView.r r, int i)
	{
		if(!r.a())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #129 <Method boolean RecyclerView$r.a()>
	//*   2    4:ifne            20
			return g.c(i, b);
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field GridLayoutManager$b g>
	//    5   11:iload_3         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field int b>
	//    8   16:invokevirtual   #132 <Method int GridLayoutManager$b.c(int, int)>
	//    9   19:ireturn         
		int j = n.b(i);
	//   10   20:aload_1         
	//   11   21:iload_3         
	//   12   22:invokevirtual   #137 <Method int android.support.v7.widget.RecyclerView$n.b(int)>
	//   13   25:istore          4
		if(j == -1)
	//*  14   27:iload           4
	//*  15   29:iconst_m1       
	//*  16   30:icmpne          66
		{
			n = ((RecyclerView.n) (new StringBuilder()));
	//   17   33:new             #139 <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #140 <Method void StringBuilder()>
	//   20   40:astore_1        
			((StringBuilder) (n)).append("Cannot find span size for pre layout position. ");
	//   21   41:aload_1         
	//   22   42:ldc1            #142 <String "Cannot find span size for pre layout position. ">
	//   23   44:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			((StringBuilder) (n)).append(i);
	//   25   48:aload_1         
	//   26   49:iload_3         
	//   27   50:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//   28   53:pop             
			Log.w("GridLayoutManager", ((StringBuilder) (n)).toString());
	//   29   54:ldc1            #151 <String "GridLayoutManager">
	//   30   56:aload_1         
	//   31   57:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   32   60:invokestatic    #161 <Method int Log.w(String, String)>
	//   33   63:pop             
			return 0;
	//   34   64:iconst_0        
	//   35   65:ireturn         
		} else
		{
			return g.c(j, b);
	//   36   66:aload_0         
	//   37   67:getfield        #47  <Field GridLayoutManager$b g>
	//   38   70:iload           4
	//   39   72:aload_0         
	//   40   73:getfield        #35  <Field int b>
	//   41   76:invokevirtual   #132 <Method int GridLayoutManager$b.c(int, int)>
	//   42   79:ireturn         
		}
	}

	private void a(float f1, int i)
	{
		l(Math.max(Math.round(f1 * (float)b), i));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #35  <Field int b>
	//    4    6:i2f             
	//    5    7:fmul            
	//    6    8:invokestatic    #168 <Method int Math.round(float)>
	//    7   11:iload_2         
	//    8   12:invokestatic    #171 <Method int Math.max(int, int)>
	//    9   15:invokespecial   #120 <Method void l(int)>
	//   10   18:return          
	}

	private void a(RecyclerView.n n, RecyclerView.r r, int i, int j, boolean flag)
	{
		j = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          4
		int k = 0;
	//    2    3:iconst_0        
	//    3    4:istore          7
		byte byte0;
		if(flag)
	//*   4    6:iload           5
	//*   5    8:ifeq            22
		{
			j = i;
	//    6   11:iload_3         
	//    7   12:istore          4
			i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_3        
			byte0 = 1;
	//   10   16:iconst_1        
	//   11   17:istore          6
		} else
	//*  12   19:goto            29
		{
			i--;
	//   13   22:iload_3         
	//   14   23:iconst_1        
	//   15   24:isub            
	//   16   25:istore_3        
			byte0 = -1;
	//   17   26:iconst_m1       
	//   18   27:istore          6
		}
		for(; i != j; i += ((int) (byte0)))
	//*  19   29:iload_3         
	//*  20   30:iload           4
	//*  21   32:icmpeq          95
		{
			View view = d[i];
	//   22   35:aload_0         
	//   23   36:getfield        #123 <Field View[] d>
	//   24   39:iload_3         
	//   25   40:aaload          
	//   26   41:astore          8
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   27   43:aload           8
	//   28   45:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   48:checkcast       #6   <Class GridLayoutManager$LayoutParams>
	//   30   51:astore          9
			layoutparams.b = c(n, r, d(view));
	//   31   53:aload           9
	//   32   55:aload_0         
	//   33   56:aload_1         
	//   34   57:aload_2         
	//   35   58:aload_0         
	//   36   59:aload           8
	//   37   61:invokevirtual   #175 <Method int d(View)>
	//   38   64:invokespecial   #177 <Method int c(RecyclerView$n, RecyclerView$r, int)>
	//   39   67:putfield        #178 <Field int android.support.v7.widget.GridLayoutManager$LayoutParams.b>
			layoutparams.a = k;
	//   40   70:aload           9
	//   41   72:iload           7
	//   42   74:putfield        #180 <Field int GridLayoutManager$LayoutParams.a>
			k += layoutparams.b;
	//   43   77:iload           7
	//   44   79:aload           9
	//   45   81:getfield        #178 <Field int android.support.v7.widget.GridLayoutManager$LayoutParams.b>
	//   46   84:iadd            
	//   47   85:istore          7
		}

	//   48   87:iload_3         
	//   49   88:iload           6
	//   50   90:iadd            
	//   51   91:istore_3        
	//*  52   92:goto            29
	//   53   95:return          
	}

	private void a(View view, int i, int j, boolean flag)
	{
		RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #183 <Class RecyclerView$LayoutParams>
	//    3    7:astore          5
		if(flag)
	//*   4    9:iload           4
	//*   5   11:ifeq            28
			flag = a(view, i, j, layoutparams);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:iload_2         
	//    9   17:iload_3         
	//   10   18:aload           5
	//   11   20:invokevirtual   #186 <Method boolean a(View, int, int, RecyclerView$LayoutParams)>
	//   12   23:istore          4
		else
	//*  13   25:goto            39
			flag = b(view, i, j, layoutparams);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:aload           5
	//   19   34:invokevirtual   #188 <Method boolean b(View, int, int, RecyclerView$LayoutParams)>
	//   20   37:istore          4
		if(flag)
	//*  21   39:iload           4
	//*  22   41:ifeq            50
			view.measure(i, j);
	//   23   44:aload_1         
	//   24   45:iload_2         
	//   25   46:iload_3         
	//   26   47:invokevirtual   #191 <Method void View.measure(int, int)>
	//   27   50:return          
	}

	private void a(View view, int i, boolean flag)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #6   <Class GridLayoutManager$LayoutParams>
	//    3    7:astore          7
		Rect rect = layoutparams.d;
	//    4    9:aload           7
	//    5   11:getfield        #194 <Field Rect GridLayoutManager$LayoutParams.d>
	//    6   14:astore          8
		int k = rect.top + rect.bottom + layoutparams.topMargin + layoutparams.bottomMargin;
	//    7   16:aload           8
	//    8   18:getfield        #197 <Field int Rect.top>
	//    9   21:aload           8
	//   10   23:getfield        #200 <Field int Rect.bottom>
	//   11   26:iadd            
	//   12   27:aload           7
	//   13   29:getfield        #203 <Field int GridLayoutManager$LayoutParams.topMargin>
	//   14   32:iadd            
	//   15   33:aload           7
	//   16   35:getfield        #206 <Field int GridLayoutManager$LayoutParams.bottomMargin>
	//   17   38:iadd            
	//   18   39:istore          5
		int j = rect.left + rect.right + layoutparams.leftMargin + layoutparams.rightMargin;
	//   19   41:aload           8
	//   20   43:getfield        #209 <Field int Rect.left>
	//   21   46:aload           8
	//   22   48:getfield        #212 <Field int Rect.right>
	//   23   51:iadd            
	//   24   52:aload           7
	//   25   54:getfield        #215 <Field int GridLayoutManager$LayoutParams.leftMargin>
	//   26   57:iadd            
	//   27   58:aload           7
	//   28   60:getfield        #218 <Field int GridLayoutManager$LayoutParams.rightMargin>
	//   29   63:iadd            
	//   30   64:istore          4
		int i1 = a(layoutparams.a, layoutparams.b);
	//   31   66:aload_0         
	//   32   67:aload           7
	//   33   69:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//   34   72:aload           7
	//   35   74:getfield        #178 <Field int android.support.v7.widget.GridLayoutManager$LayoutParams.b>
	//   36   77:invokevirtual   #220 <Method int a(int, int)>
	//   37   80:istore          6
		if(this.i == 1)
	//*  38   82:aload_0         
	//*  39   83:getfield        #223 <Field int i>
	//*  40   86:iconst_1        
	//*  41   87:icmpne          132
		{
			j = a(i1, i, j, layoutparams.width, false);
	//   42   90:iload           6
	//   43   92:iload_2         
	//   44   93:iload           4
	//   45   95:aload           7
	//   46   97:getfield        #226 <Field int GridLayoutManager$LayoutParams.width>
	//   47  100:iconst_0        
	//   48  101:invokestatic    #229 <Method int a(int, int, int, int, boolean)>
	//   49  104:istore          4
			i = a(this.j.f(), w(), k, layoutparams.height, true);
	//   50  106:aload_0         
	//   51  107:getfield        #233 <Field ah j>
	//   52  110:invokevirtual   #236 <Method int ah.f()>
	//   53  113:aload_0         
	//   54  114:invokevirtual   #238 <Method int w()>
	//   55  117:iload           5
	//   56  119:aload           7
	//   57  121:getfield        #241 <Field int GridLayoutManager$LayoutParams.height>
	//   58  124:iconst_1        
	//   59  125:invokestatic    #229 <Method int a(int, int, int, int, boolean)>
	//   60  128:istore_2        
		} else
	//*  61  129:goto            171
		{
			i = a(i1, i, k, layoutparams.height, false);
	//   62  132:iload           6
	//   63  134:iload_2         
	//   64  135:iload           5
	//   65  137:aload           7
	//   66  139:getfield        #241 <Field int GridLayoutManager$LayoutParams.height>
	//   67  142:iconst_0        
	//   68  143:invokestatic    #229 <Method int a(int, int, int, int, boolean)>
	//   69  146:istore_2        
			j = a(this.j.f(), v(), j, layoutparams.width, true);
	//   70  147:aload_0         
	//   71  148:getfield        #233 <Field ah j>
	//   72  151:invokevirtual   #236 <Method int ah.f()>
	//   73  154:aload_0         
	//   74  155:invokevirtual   #244 <Method int v()>
	//   75  158:iload           4
	//   76  160:aload           7
	//   77  162:getfield        #226 <Field int GridLayoutManager$LayoutParams.width>
	//   78  165:iconst_1        
	//   79  166:invokestatic    #229 <Method int a(int, int, int, int, boolean)>
	//   80  169:istore          4
		}
		a(view, j, i, flag);
	//   81  171:aload_0         
	//   82  172:aload_1         
	//   83  173:iload           4
	//   84  175:iload_2         
	//   85  176:iload_3         
	//   86  177:invokespecial   #246 <Method void a(View, int, int, boolean)>
	//   87  180:return          
	}

	static int[] a(int ai[], int i, int j)
	{
		int i1;
		int ai1[];
label0:
		{
			i1 = 1;
	//    0    0:iconst_1        
	//    1    1:istore          4
			if(ai != null && ai.length == i + 1)
	//*   2    3:aload_0         
	//*   3    4:ifnull          28
	//*   4    7:aload_0         
	//*   5    8:arraylength     
	//*   6    9:iload_1         
	//*   7   10:iconst_1        
	//*   8   11:iadd            
	//*   9   12:icmpne          28
			{
				ai1 = ai;
	//   10   15:aload_0         
	//   11   16:astore          8
				if(ai[ai.length - 1] == j)
					break label0;
	//   12   18:aload_0         
	//   13   19:aload_0         
	//   14   20:arraylength     
	//   15   21:iconst_1        
	//   16   22:isub            
	//   17   23:iaload          
	//   18   24:iload_2         
	//   19   25:icmpeq          35
			}
			ai1 = new int[i + 1];
	//   20   28:iload_1         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:newarray        int[]
	//   24   33:astore          8
		}
		boolean flag = false;
	//   25   35:iconst_0        
	//   26   36:istore          5
		ai1[0] = 0;
	//   27   38:aload           8
	//   28   40:iconst_0        
	//   29   41:iconst_0        
	//   30   42:iastore         
		int k1 = j / i;
	//   31   43:iload_2         
	//   32   44:iload_1         
	//   33   45:idiv            
	//   34   46:istore          6
		int l1 = j % i;
	//   35   48:iload_2         
	//   36   49:iload_1         
	//   37   50:irem            
	//   38   51:istore          7
		int k = 0;
	//   39   53:iconst_0        
	//   40   54:istore_3        
		j = ((int) (flag));
	//   41   55:iload           5
	//   42   57:istore_2        
		for(; i1 <= i; i1++)
	//*  43   58:iload           4
	//*  44   60:iload_1         
	//*  45   61:icmpgt          118
		{
			j += l1;
	//   46   64:iload_2         
	//   47   65:iload           7
	//   48   67:iadd            
	//   49   68:istore_2        
			int j1;
			if(j > 0 && i - j < l1)
	//*  50   69:iload_2         
	//*  51   70:ifle            94
	//*  52   73:iload_1         
	//*  53   74:iload_2         
	//*  54   75:isub            
	//*  55   76:iload           7
	//*  56   78:icmpge          94
			{
				j1 = k1 + 1;
	//   57   81:iload           6
	//   58   83:iconst_1        
	//   59   84:iadd            
	//   60   85:istore          5
				j -= i;
	//   61   87:iload_2         
	//   62   88:iload_1         
	//   63   89:isub            
	//   64   90:istore_2        
			} else
	//*  65   91:goto            98
			{
				j1 = k1;
	//   66   94:iload           6
	//   67   96:istore          5
			}
			k += j1;
	//   68   98:iload_3         
	//   69   99:iload           5
	//   70  101:iadd            
	//   71  102:istore_3        
			ai1[i1] = k;
	//   72  103:aload           8
	//   73  105:iload           4
	//   74  107:iload_3         
	//   75  108:iastore         
		}

	//   76  109:iload           4
	//   77  111:iconst_1        
	//   78  112:iadd            
	//   79  113:istore          4
	//*  80  115:goto            58
		return ai1;
	//   81  118:aload           8
	//   82  120:areturn         
	}

	private int b(RecyclerView.n n, RecyclerView.r r, int i)
	{
		if(!r.a())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #129 <Method boolean RecyclerView$r.a()>
	//*   2    4:ifne            20
			return g.b(i, b);
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field GridLayoutManager$b g>
	//    5   11:iload_3         
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field int b>
	//    8   16:invokevirtual   #249 <Method int android.support.v7.widget.GridLayoutManager$b.b(int, int)>
	//    9   19:ireturn         
		int j = f.get(i, -1);
	//   10   20:aload_0         
	//   11   21:getfield        #44  <Field SparseIntArray f>
	//   12   24:iload_3         
	//   13   25:iconst_m1       
	//   14   26:invokevirtual   #252 <Method int SparseIntArray.get(int, int)>
	//   15   29:istore          4
		if(j != -1)
	//*  16   31:iload           4
	//*  17   33:iconst_m1       
	//*  18   34:icmpeq          40
			return j;
	//   19   37:iload           4
	//   20   39:ireturn         
		j = n.b(i);
	//   21   40:aload_1         
	//   22   41:iload_3         
	//   23   42:invokevirtual   #137 <Method int android.support.v7.widget.RecyclerView$n.b(int)>
	//   24   45:istore          4
		if(j == -1)
	//*  25   47:iload           4
	//*  26   49:iconst_m1       
	//*  27   50:icmpne          86
		{
			n = ((RecyclerView.n) (new StringBuilder()));
	//   28   53:new             #139 <Class StringBuilder>
	//   29   56:dup             
	//   30   57:invokespecial   #140 <Method void StringBuilder()>
	//   31   60:astore_1        
			((StringBuilder) (n)).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
	//   32   61:aload_1         
	//   33   62:ldc1            #254 <String "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:">
	//   34   64:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
			((StringBuilder) (n)).append(i);
	//   36   68:aload_1         
	//   37   69:iload_3         
	//   38   70:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//   39   73:pop             
			Log.w("GridLayoutManager", ((StringBuilder) (n)).toString());
	//   40   74:ldc1            #151 <String "GridLayoutManager">
	//   41   76:aload_1         
	//   42   77:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   43   80:invokestatic    #161 <Method int Log.w(String, String)>
	//   44   83:pop             
			return 0;
	//   45   84:iconst_0        
	//   46   85:ireturn         
		} else
		{
			return g.b(j, b);
	//   47   86:aload_0         
	//   48   87:getfield        #47  <Field GridLayoutManager$b g>
	//   49   90:iload           4
	//   50   92:aload_0         
	//   51   93:getfield        #35  <Field int b>
	//   52   96:invokevirtual   #249 <Method int android.support.v7.widget.GridLayoutManager$b.b(int, int)>
	//   53   99:ireturn         
		}
	}

	private void b(RecyclerView.n n, RecyclerView.r r, LinearLayoutManager.a a1, int i)
	{
		if(i == 1)
	//*   0    0:iload           4
	//*   1    2:iconst_1        
	//*   2    3:icmpne          12
			i = 1;
	//    3    6:iconst_1        
	//    4    7:istore          4
		else
	//*   5    9:goto            15
			i = 0;
	//    6   12:iconst_0        
	//    7   13:istore          4
		int j = b(n, r, a1.a);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:getfield        #258 <Field int LinearLayoutManager$a.a>
	//   13   22:invokespecial   #260 <Method int b(RecyclerView$n, RecyclerView$r, int)>
	//   14   25:istore          5
		if(i != 0)
	//*  15   27:iload           4
	//*  16   29:ifeq            69
		{
			for(; j > 0 && a1.a > 0; j = b(n, r, a1.a))
	//*  17   32:iload           5
	//*  18   34:ifle            130
	//*  19   37:aload_3         
	//*  20   38:getfield        #258 <Field int LinearLayoutManager$a.a>
	//*  21   41:ifle            130
				a1.a = a1.a - 1;
	//   22   44:aload_3         
	//   23   45:aload_3         
	//   24   46:getfield        #258 <Field int LinearLayoutManager$a.a>
	//   25   49:iconst_1        
	//   26   50:isub            
	//   27   51:putfield        #258 <Field int LinearLayoutManager$a.a>

	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:aload_2         
	//   31   57:aload_3         
	//   32   58:getfield        #258 <Field int LinearLayoutManager$a.a>
	//   33   61:invokespecial   #260 <Method int b(RecyclerView$n, RecyclerView$r, int)>
	//   34   64:istore          5
		} else
	//*  35   66:goto            32
		{
			int j1 = r.e();
	//   36   69:aload_2         
	//   37   70:invokevirtual   #262 <Method int RecyclerView$r.e()>
	//   38   73:istore          8
			i = a1.a;
	//   39   75:aload_3         
	//   40   76:getfield        #258 <Field int LinearLayoutManager$a.a>
	//   41   79:istore          4
			do
			{
				if(i >= j1 - 1)
					break;
	//   42   81:iload           4
	//   43   83:iload           8
	//   44   85:iconst_1        
	//   45   86:isub            
	//   46   87:icmpge          124
				int i1 = i + 1;
	//   47   90:iload           4
	//   48   92:iconst_1        
	//   49   93:iadd            
	//   50   94:istore          7
				int k = b(n, r, i1);
	//   51   96:aload_0         
	//   52   97:aload_1         
	//   53   98:aload_2         
	//   54   99:iload           7
	//   55  101:invokespecial   #260 <Method int b(RecyclerView$n, RecyclerView$r, int)>
	//   56  104:istore          6
				if(k <= j)
					break;
	//   57  106:iload           6
	//   58  108:iload           5
	//   59  110:icmple          124
				i = i1;
	//   60  113:iload           7
	//   61  115:istore          4
				j = k;
	//   62  117:iload           6
	//   63  119:istore          5
			} while(true);
	//   64  121:goto            81
			a1.a = i;
	//   65  124:aload_3         
	//   66  125:iload           4
	//   67  127:putfield        #258 <Field int LinearLayoutManager$a.a>
		}
	//   68  130:return          
	}

	private int c(RecyclerView.n n, RecyclerView.r r, int i)
	{
		if(!r.a())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #129 <Method boolean RecyclerView$r.a()>
	//*   2    4:ifne            16
			return g.a(i);
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field GridLayoutManager$b g>
	//    5   11:iload_3         
	//    6   12:invokevirtual   #264 <Method int GridLayoutManager$b.a(int)>
	//    7   15:ireturn         
		int j = e.get(i, -1);
	//    8   16:aload_0         
	//    9   17:getfield        #42  <Field SparseIntArray e>
	//   10   20:iload_3         
	//   11   21:iconst_m1       
	//   12   22:invokevirtual   #252 <Method int SparseIntArray.get(int, int)>
	//   13   25:istore          4
		if(j != -1)
	//*  14   27:iload           4
	//*  15   29:iconst_m1       
	//*  16   30:icmpeq          36
			return j;
	//   17   33:iload           4
	//   18   35:ireturn         
		j = n.b(i);
	//   19   36:aload_1         
	//   20   37:iload_3         
	//   21   38:invokevirtual   #137 <Method int android.support.v7.widget.RecyclerView$n.b(int)>
	//   22   41:istore          4
		if(j == -1)
	//*  23   43:iload           4
	//*  24   45:iconst_m1       
	//*  25   46:icmpne          82
		{
			n = ((RecyclerView.n) (new StringBuilder()));
	//   26   49:new             #139 <Class StringBuilder>
	//   27   52:dup             
	//   28   53:invokespecial   #140 <Method void StringBuilder()>
	//   29   56:astore_1        
			((StringBuilder) (n)).append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
	//   30   57:aload_1         
	//   31   58:ldc1            #254 <String "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:">
	//   32   60:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			((StringBuilder) (n)).append(i);
	//   34   64:aload_1         
	//   35   65:iload_3         
	//   36   66:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//   37   69:pop             
			Log.w("GridLayoutManager", ((StringBuilder) (n)).toString());
	//   38   70:ldc1            #151 <String "GridLayoutManager">
	//   39   72:aload_1         
	//   40   73:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   41   76:invokestatic    #161 <Method int Log.w(String, String)>
	//   42   79:pop             
			return 1;
	//   43   80:iconst_1        
	//   44   81:ireturn         
		} else
		{
			return g.a(j);
	//   45   82:aload_0         
	//   46   83:getfield        #47  <Field GridLayoutManager$b g>
	//   47   86:iload           4
	//   48   88:invokevirtual   #264 <Method int GridLayoutManager$b.a(int)>
	//   49   91:ireturn         
		}
	}

	private void l(int i)
	{
		c = a(c, b, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #266 <Field int[] c>
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field int b>
	//    5    9:iload_1         
	//    6   10:invokestatic    #268 <Method int[] a(int[], int, int)>
	//    7   13:putfield        #266 <Field int[] c>
	//    8   16:return          
	}

	int a(int i, int j)
	{
		if(this.i == 1 && g())
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field int i>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          41
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #270 <Method boolean g()>
	//*   6   12:ifeq            41
			return c[b - i] - c[b - i - j];
	//    7   15:aload_0         
	//    8   16:getfield        #266 <Field int[] c>
	//    9   19:aload_0         
	//   10   20:getfield        #35  <Field int b>
	//   11   23:iload_1         
	//   12   24:isub            
	//   13   25:iaload          
	//   14   26:aload_0         
	//   15   27:getfield        #266 <Field int[] c>
	//   16   30:aload_0         
	//   17   31:getfield        #35  <Field int b>
	//   18   34:iload_1         
	//   19   35:isub            
	//   20   36:iload_2         
	//   21   37:isub            
	//   22   38:iaload          
	//   23   39:isub            
	//   24   40:ireturn         
		else
			return c[j + i] - c[i];
	//   25   41:aload_0         
	//   26   42:getfield        #266 <Field int[] c>
	//   27   45:iload_2         
	//   28   46:iload_1         
	//   29   47:iadd            
	//   30   48:iaload          
	//   31   49:aload_0         
	//   32   50:getfield        #266 <Field int[] c>
	//   33   53:iload_1         
	//   34   54:iaload          
	//   35   55:isub            
	//   36   56:ireturn         
	}

	public int a(int i, RecyclerView.n n, RecyclerView.r r)
	{
		L();
	//    0    0:aload_0         
	//    1    1:invokespecial   #273 <Method void L()>
		M();
	//    2    4:aload_0         
	//    3    5:invokespecial   #275 <Method void M()>
		return super.a(i, n, r);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #277 <Method int LinearLayoutManager.a(int, RecyclerView$n, RecyclerView$r)>
	//    9   15:ireturn         
	}

	public int a(RecyclerView.n n, RecyclerView.r r)
	{
		if(i == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field int i>
	//*   2    4:ifne            12
			return b;
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field int b>
	//    5   11:ireturn         
		if(r.e() < 1)
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #262 <Method int RecyclerView$r.e()>
	//*   8   16:iconst_1        
	//*   9   17:icmpge          22
			return 0;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		else
			return a(n, r, r.e() - 1) + 1;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_2         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #262 <Method int RecyclerView$r.e()>
	//   17   29:iconst_1        
	//   18   30:isub            
	//   19   31:invokespecial   #280 <Method int a(RecyclerView$n, RecyclerView$r, int)>
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:ireturn         
	}

	public RecyclerView.LayoutParams a()
	{
		if(i == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field int i>
	//*   2    4:ifne            18
			return ((RecyclerView.LayoutParams) (new LayoutParams(-2, -1)));
	//    3    7:new             #6   <Class GridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:bipush          -2
	//    6   13:iconst_m1       
	//    7   14:invokespecial   #283 <Method void GridLayoutManager$LayoutParams(int, int)>
	//    8   17:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(-1, -2)));
	//    9   18:new             #6   <Class GridLayoutManager$LayoutParams>
	//   10   21:dup             
	//   11   22:iconst_m1       
	//   12   23:bipush          -2
	//   13   25:invokespecial   #283 <Method void GridLayoutManager$LayoutParams(int, int)>
	//   14   28:areturn         
	}

	public RecyclerView.LayoutParams a(Context context, AttributeSet attributeset)
	{
		return ((RecyclerView.LayoutParams) (new LayoutParams(context, attributeset)));
	//    0    0:new             #6   <Class GridLayoutManager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #287 <Method void GridLayoutManager$LayoutParams(Context, AttributeSet)>
	//    5    9:areturn         
	}

	public RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #290 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((RecyclerView.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #6   <Class GridLayoutManager$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #290 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #293 <Method void GridLayoutManager$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((RecyclerView.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #6   <Class GridLayoutManager$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #296 <Method void GridLayoutManager$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	View a(RecyclerView.n n, RecyclerView.r r, int i, int j, int k)
	{
		h();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #299 <Method void h()>
		int i1 = this.j.c();
	//    2    4:aload_0         
	//    3    5:getfield        #233 <Field ah j>
	//    4    8:invokevirtual   #301 <Method int ah.c()>
	//    5   11:istore          7
		int j1 = this.j.d();
	//    6   13:aload_0         
	//    7   14:getfield        #233 <Field ah j>
	//    8   17:invokevirtual   #303 <Method int ah.d()>
	//    9   20:istore          8
		byte byte0;
		if(j > i)
	//*  10   22:iload           4
	//*  11   24:iload_3         
	//*  12   25:icmple          34
			byte0 = 1;
	//   13   28:iconst_1        
	//   14   29:istore          6
		else
	//*  15   31:goto            37
			byte0 = -1;
	//   16   34:iconst_m1       
	//   17   35:istore          6
		View view1 = null;
	//   18   37:aconst_null     
	//   19   38:astore          11
		View view;
		View view3;
		for(view = null; i != j; view = view3)
	//*  20   40:aconst_null     
	//*  21   41:astore          10
	//*  22   43:iload_3         
	//*  23   44:iload           4
	//*  24   46:icmpeq          223
		{
			View view4 = h(i);
	//   25   49:aload_0         
	//   26   50:iload_3         
	//   27   51:invokevirtual   #81  <Method View h(int)>
	//   28   54:astore          14
			int k1 = d(view4);
	//   29   56:aload_0         
	//   30   57:aload           14
	//   31   59:invokevirtual   #175 <Method int d(View)>
	//   32   62:istore          9
			View view2 = view1;
	//   33   64:aload           11
	//   34   66:astore          12
			view3 = view;
	//   35   68:aload           10
	//   36   70:astore          13
			if(k1 >= 0)
	//*  37   72:iload           9
	//*  38   74:iflt            207
			{
				view2 = view1;
	//   39   77:aload           11
	//   40   79:astore          12
				view3 = view;
	//   41   81:aload           10
	//   42   83:astore          13
				if(k1 < k)
	//*  43   85:iload           9
	//*  44   87:iload           5
	//*  45   89:icmpge          207
					if(b(n, r, k1) != 0)
	//*  46   92:aload_0         
	//*  47   93:aload_1         
	//*  48   94:aload_2         
	//*  49   95:iload           9
	//*  50   97:invokespecial   #260 <Method int b(RecyclerView$n, RecyclerView$r, int)>
	//*  51  100:ifeq            114
					{
						view2 = view1;
	//   52  103:aload           11
	//   53  105:astore          12
						view3 = view;
	//   54  107:aload           10
	//   55  109:astore          13
					} else
	//*  56  111:goto            207
					if(((RecyclerView.LayoutParams)view4.getLayoutParams()).d())
	//*  57  114:aload           14
	//*  58  116:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  59  119:checkcast       #183 <Class RecyclerView$LayoutParams>
	//*  60  122:invokevirtual   #305 <Method boolean RecyclerView$LayoutParams.d()>
	//*  61  125:ifeq            152
					{
						view2 = view1;
	//   62  128:aload           11
	//   63  130:astore          12
						view3 = view;
	//   64  132:aload           10
	//   65  134:astore          13
						if(view == null)
	//*  66  136:aload           10
	//*  67  138:ifnonnull       207
						{
							view3 = view4;
	//   68  141:aload           14
	//   69  143:astore          13
							view2 = view1;
	//   70  145:aload           11
	//   71  147:astore          12
						}
					} else
	//*  72  149:goto            207
					{
						if(this.j.a(view4) < j1 && this.j.b(view4) >= i1)
	//*  73  152:aload_0         
	//*  74  153:getfield        #233 <Field ah j>
	//*  75  156:aload           14
	//*  76  158:invokevirtual   #307 <Method int ah.a(View)>
	//*  77  161:iload           8
	//*  78  163:icmpge          186
	//*  79  166:aload_0         
	//*  80  167:getfield        #233 <Field ah j>
	//*  81  170:aload           14
	//*  82  172:invokevirtual   #309 <Method int android.support.v7.widget.ah.b(View)>
	//*  83  175:iload           7
	//*  84  177:icmpge          183
	//*  85  180:goto            186
							return view4;
	//   86  183:aload           14
	//   87  185:areturn         
						view2 = view1;
	//   88  186:aload           11
	//   89  188:astore          12
						view3 = view;
	//   90  190:aload           10
	//   91  192:astore          13
						if(view1 == null)
	//*  92  194:aload           11
	//*  93  196:ifnonnull       207
						{
							view2 = view4;
	//   94  199:aload           14
	//   95  201:astore          12
							view3 = view;
	//   96  203:aload           10
	//   97  205:astore          13
						}
					}
			}
			i += ((int) (byte0));
	//   98  207:iload_3         
	//   99  208:iload           6
	//  100  210:iadd            
	//  101  211:istore_3        
			view1 = view2;
	//  102  212:aload           12
	//  103  214:astore          11
		}

	//  104  216:aload           13
	//  105  218:astore          10
	//* 106  220:goto            43
		if(view1 != null)
	//* 107  223:aload           11
	//* 108  225:ifnull          231
			return view1;
	//  109  228:aload           11
	//  110  230:areturn         
		else
			return view;
	//  111  231:aload           10
	//  112  233:areturn         
	}

	public View a(View view, int i, RecyclerView.n n, RecyclerView.r r)
	{
		int j;
		int k;
		int i1;
		byte byte0;
		int j1;
		int k1;
		int l1;
		int i3;
		int j3;
		int k3;
		View view1;
		View view2;
		view2 = e(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #313 <Method View e(View)>
	//    3    5:astore          22
		view1 = null;
	//    4    7:aconst_null     
	//    5    8:astore          21
		if(view2 == null)
	//*   6   10:aload           22
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		LayoutParams layoutparams = (LayoutParams)view2.getLayoutParams();
	//   10   17:aload           22
	//   11   19:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   22:checkcast       #6   <Class GridLayoutManager$LayoutParams>
	//   13   25:astore          23
		i3 = layoutparams.a;
	//   14   27:aload           23
	//   15   29:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//   16   32:istore          14
		j3 = layoutparams.a + layoutparams.b;
	//   17   34:aload           23
	//   18   36:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//   19   39:aload           23
	//   20   41:getfield        #178 <Field int android.support.v7.widget.GridLayoutManager$LayoutParams.b>
	//   21   44:iadd            
	//   22   45:istore          15
		if(super.a(view, i, n, r) == null)
	//*  23   47:aload_0         
	//*  24   48:aload_1         
	//*  25   49:iload_2         
	//*  26   50:aload_3         
	//*  27   51:aload           4
	//*  28   53:invokespecial   #315 <Method View LinearLayoutManager.a(View, int, RecyclerView$n, RecyclerView$r)>
	//*  29   56:ifnonnull       61
			return null;
	//   30   59:aconst_null     
	//   31   60:areturn         
		boolean flag;
		if(e(i) == 1)
	//*  32   61:aload_0         
	//*  33   62:iload_2         
	//*  34   63:invokevirtual   #317 <Method int e(int)>
	//*  35   66:iconst_1        
	//*  36   67:icmpne          76
			flag = true;
	//   37   70:iconst_1        
	//   38   71:istore          20
		else
	//*  39   73:goto            79
			flag = false;
	//   40   76:iconst_0        
	//   41   77:istore          20
		if(flag != this.k)
	//*  42   79:iload           20
	//*  43   81:aload_0         
	//*  44   82:getfield        #320 <Field boolean k>
	//*  45   85:icmpeq          93
			i = 1;
	//   46   88:iconst_1        
	//   47   89:istore_2        
		else
	//*  48   90:goto            95
			i = 0;
	//   49   93:iconst_0        
	//   50   94:istore_2        
		if(i != 0)
	//*  51   95:iload_2         
	//*  52   96:ifeq            116
		{
			i1 = u() - 1;
	//   53   99:aload_0         
	//   54  100:invokevirtual   #78  <Method int u()>
	//   55  103:iconst_1        
	//   56  104:isub            
	//   57  105:istore          7
			j = -1;
	//   58  107:iconst_m1       
	//   59  108:istore          5
			byte0 = -1;
	//   60  110:iconst_m1       
	//   61  111:istore          8
		} else
	//*  62  113:goto            128
		{
			j = u();
	//   63  116:aload_0         
	//   64  117:invokevirtual   #78  <Method int u()>
	//   65  120:istore          5
			i1 = 0;
	//   66  122:iconst_0        
	//   67  123:istore          7
			byte0 = 1;
	//   68  125:iconst_1        
	//   69  126:istore          8
		}
		if(this.i == 1 && g())
	//*  70  128:aload_0         
	//*  71  129:getfield        #223 <Field int i>
	//*  72  132:iconst_1        
	//*  73  133:icmpne          149
	//*  74  136:aload_0         
	//*  75  137:invokevirtual   #270 <Method boolean g()>
	//*  76  140:ifeq            149
			j1 = 1;
	//   77  143:iconst_1        
	//   78  144:istore          9
		else
	//*  79  146:goto            152
			j1 = 0;
	//   80  149:iconst_0        
	//   81  150:istore          9
		k3 = a(n, r, i1);
	//   82  152:aload_0         
	//   83  153:aload_3         
	//   84  154:aload           4
	//   85  156:iload           7
	//   86  158:invokespecial   #280 <Method int a(RecyclerView$n, RecyclerView$r, int)>
	//   87  161:istore          16
		view = null;
	//   88  163:aconst_null     
	//   89  164:astore_1        
		byte byte1 = -1;
	//   90  165:iconst_m1       
	//   91  166:istore          12
		l1 = 0;
	//   92  168:iconst_0        
	//   93  169:istore          11
		i = 0;
	//   94  171:iconst_0        
	//   95  172:istore_2        
		k = -1;
	//   96  173:iconst_m1       
	//   97  174:istore          6
		k1 = j;
	//   98  176:iload           5
	//   99  178:istore          10
		j = ((int) (byte1));
	//  100  180:iload           12
	//  101  182:istore          5
_L9:
		if(i1 == k1) goto _L2; else goto _L1
	//  102  184:iload           7
	//  103  186:iload           10
	//  104  188:icmpeq          555
_L1:
		int l3;
		int i4;
		View view3;
		LayoutParams layoutparams1;
		int i2 = a(n, r, i1);
	//  105  191:aload_0         
	//  106  192:aload_3         
	//  107  193:aload           4
	//  108  195:iload           7
	//  109  197:invokespecial   #280 <Method int a(RecyclerView$n, RecyclerView$r, int)>
	//  110  200:istore          12
		view3 = h(i1);
	//  111  202:aload_0         
	//  112  203:iload           7
	//  113  205:invokevirtual   #81  <Method View h(int)>
	//  114  208:astore          23
		if(view3 == view2)
	//* 115  210:aload           23
	//* 116  212:aload           22
	//* 117  214:if_acmpne       220
			break; /* Loop/switch isn't completed */
	//  118  217:goto            555
		if(view3.hasFocusable() && i2 != k3)
	//* 119  220:aload           23
	//* 120  222:invokevirtual   #323 <Method boolean View.hasFocusable()>
	//* 121  225:ifeq            246
	//* 122  228:iload           12
	//* 123  230:iload           16
	//* 124  232:icmpeq          246
		{
			if(view1 != null)
	//* 125  235:aload           21
	//* 126  237:ifnull          243
				break; /* Loop/switch isn't completed */
	//  127  240:goto            555
			continue; /* Loop/switch isn't completed */
	//  128  243:goto            545
		}
		layoutparams1 = (LayoutParams)view3.getLayoutParams();
	//  129  246:aload           23
	//  130  248:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  131  251:checkcast       #6   <Class GridLayoutManager$LayoutParams>
	//  132  254:astore          24
		l3 = layoutparams1.a;
	//  133  256:aload           24
	//  134  258:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//  135  261:istore          17
		i4 = layoutparams1.a + layoutparams1.b;
	//  136  263:aload           24
	//  137  265:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//  138  268:aload           24
	//  139  270:getfield        #178 <Field int android.support.v7.widget.GridLayoutManager$LayoutParams.b>
	//  140  273:iadd            
	//  141  274:istore          18
		if(view3.hasFocusable() && l3 == i3 && i4 == j3)
	//* 142  276:aload           23
	//* 143  278:invokevirtual   #323 <Method boolean View.hasFocusable()>
	//* 144  281:ifeq            301
	//* 145  284:iload           17
	//* 146  286:iload           14
	//* 147  288:icmpne          301
	//* 148  291:iload           18
	//* 149  293:iload           15
	//* 150  295:icmpne          301
			return view3;
	//  151  298:aload           23
	//  152  300:areturn         
		if((!view3.hasFocusable() || view1 != null) && (view3.hasFocusable() || view != null)) goto _L4; else goto _L3
	//  153  301:aload           23
	//  154  303:invokevirtual   #323 <Method boolean View.hasFocusable()>
	//  155  306:ifeq            314
	//  156  309:aload           21
	//  157  311:ifnull          326
	//  158  314:aload           23
	//  159  316:invokevirtual   #323 <Method boolean View.hasFocusable()>
	//  160  319:ifne            332
	//  161  322:aload_1         
	//  162  323:ifnonnull       332
_L3:
		int j2;
		j2 = 1;
	//  163  326:iconst_1        
	//  164  327:istore          12
		break MISSING_BLOCK_LABEL_466;
	//  165  329:goto            466
_L4:
		int j4;
		j2 = Math.max(l3, i3);
	//  166  332:iload           17
	//  167  334:iload           14
	//  168  336:invokestatic    #171 <Method int Math.max(int, int)>
	//  169  339:istore          12
		j4 = Math.min(i4, j3) - j2;
	//  170  341:iload           18
	//  171  343:iload           15
	//  172  345:invokestatic    #326 <Method int Math.min(int, int)>
	//  173  348:iload           12
	//  174  350:isub            
	//  175  351:istore          19
		if(!view3.hasFocusable())
			break MISSING_BLOCK_LABEL_404;
	//  176  353:aload           23
	//  177  355:invokevirtual   #323 <Method boolean View.hasFocusable()>
	//  178  358:ifeq            404
		if(j4 <= l1) goto _L5; else goto _L3
	//  179  361:iload           19
	//  180  363:iload           11
	//  181  365:icmple          371
	//* 182  368:goto            326
_L5:
		if(j4 != l1)
			break; /* Loop/switch isn't completed */
	//  183  371:iload           19
	//  184  373:iload           11
	//  185  375:icmpne          463
		if(l3 > j)
	//* 186  378:iload           17
	//* 187  380:iload           5
	//* 188  382:icmple          391
			j2 = 1;
	//  189  385:iconst_1        
	//  190  386:istore          12
		else
	//* 191  388:goto            394
			j2 = 0;
	//  192  391:iconst_0        
	//  193  392:istore          12
		if(j1 != j2) goto _L6; else goto _L3
	//  194  394:iload           9
	//  195  396:iload           12
	//  196  398:icmpne          463
_L6:
		break; /* Loop/switch isn't completed */
	//  197  401:goto            326
		int l2;
		if(view1 != null)
			break; /* Loop/switch isn't completed */
	//  198  404:aload           21
	//  199  406:ifnonnull       463
		j2 = 0;
	//  200  409:iconst_0        
	//  201  410:istore          12
		if(!a(view3, false, true))
			break; /* Loop/switch isn't completed */
	//  202  412:aload_0         
	//  203  413:aload           23
	//  204  415:iconst_0        
	//  205  416:iconst_1        
	//  206  417:invokevirtual   #329 <Method boolean a(View, boolean, boolean)>
	//  207  420:ifeq            463
		l2 = i;
	//  208  423:iload_2         
	//  209  424:istore          13
		if(j4 <= l2) goto _L7; else goto _L3
	//  210  426:iload           19
	//  211  428:iload           13
	//  212  430:icmple          436
	//* 213  433:goto            326
_L7:
		if(j4 != l2)
			break; /* Loop/switch isn't completed */
	//  214  436:iload           19
	//  215  438:iload           13
	//  216  440:icmpne          463
		if(l3 > k)
	//* 217  443:iload           17
	//* 218  445:iload           6
	//* 219  447:icmple          453
			j2 = 1;
	//  220  450:iconst_1        
	//  221  451:istore          12
		if(j1 != j2) goto _L8; else goto _L3
	//  222  453:iload           9
	//  223  455:iload           12
	//  224  457:icmpne          463
	//* 225  460:goto            326
_L8:
		j2 = 0;
	//  226  463:iconst_0        
	//  227  464:istore          12
		if(j2 == 0)
			continue; /* Loop/switch isn't completed */
	//  228  466:iload           12
	//  229  468:ifeq            545
		if(view3.hasFocusable())
	//* 230  471:aload           23
	//* 231  473:invokevirtual   #323 <Method boolean View.hasFocusable()>
	//* 232  476:ifeq            510
		{
			j = layoutparams1.a;
	//  233  479:aload           24
	//  234  481:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//  235  484:istore          5
			l1 = Math.min(i4, j3) - Math.max(l3, i3);
	//  236  486:iload           18
	//  237  488:iload           15
	//  238  490:invokestatic    #326 <Method int Math.min(int, int)>
	//  239  493:iload           17
	//  240  495:iload           14
	//  241  497:invokestatic    #171 <Method int Math.max(int, int)>
	//  242  500:isub            
	//  243  501:istore          11
			view1 = view3;
	//  244  503:aload           23
	//  245  505:astore          21
		} else
	//* 246  507:goto            545
		{
			k = layoutparams1.a;
	//  247  510:aload           24
	//  248  512:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//  249  515:istore          6
			i = Math.min(i4, j3);
	//  250  517:iload           18
	//  251  519:iload           15
	//  252  521:invokestatic    #326 <Method int Math.min(int, int)>
	//  253  524:istore_2        
			int k2 = Math.max(l3, i3);
	//  254  525:iload           17
	//  255  527:iload           14
	//  256  529:invokestatic    #171 <Method int Math.max(int, int)>
	//  257  532:istore          12
			view = view3;
	//  258  534:aload           23
	//  259  536:astore_1        
			i -= k2;
	//  260  537:iload_2         
	//  261  538:iload           12
	//  262  540:isub            
	//  263  541:istore_2        
		}
	//* 264  542:goto            545
		i1 += ((int) (byte0));
	//  265  545:iload           7
	//  266  547:iload           8
	//  267  549:iadd            
	//  268  550:istore          7
		  goto _L9
	//* 269  552:goto            184
_L2:
		if(view1 != null)
	//* 270  555:aload           21
	//* 271  557:ifnull          563
			view = view1;
	//  272  560:aload           21
	//  273  562:astore_1        
		return view;
	//  274  563:aload_1         
	//  275  564:areturn         
	}

	public void a(int i)
	{
		if(i == b)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #35  <Field int b>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		a = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #33  <Field boolean a>
		if(i < 1)
	//*   8   14:iload_1         
	//*   9   15:iconst_1        
	//*  10   16:icmpge          53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #139 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #140 <Method void StringBuilder()>
	//   14   26:astore_2        
			stringbuilder.append("Span count should be at least 1. Provided ");
	//   15   27:aload_2         
	//   16   28:ldc2            #331 <String "Span count should be at least 1. Provided ">
	//   17   31:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append(i);
	//   19   35:aload_2         
	//   20   36:iload_1         
	//   21   37:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//   22   40:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   23   41:new             #333 <Class IllegalArgumentException>
	//   24   44:dup             
	//   25   45:aload_2         
	//   26   46:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #336 <Method void IllegalArgumentException(String)>
	//   28   52:athrow          
		} else
		{
			b = i;
	//   29   53:aload_0         
	//   30   54:iload_1         
	//   31   55:putfield        #35  <Field int b>
			g.a();
	//   32   58:aload_0         
	//   33   59:getfield        #47  <Field GridLayoutManager$b g>
	//   34   62:invokevirtual   #338 <Method void GridLayoutManager$b.a()>
			n();
	//   35   65:aload_0         
	//   36   66:invokevirtual   #341 <Method void n()>
			return;
	//   37   69:return          
		}
	}

	public void a(Rect rect, int i, int j)
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #266 <Field int[] c>
	//*   2    4:ifnonnull       14
			super.a(rect, i, j);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #344 <Method void LinearLayoutManager.a(Rect, int, int)>
		int k = z() + B();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #108 <Method int z()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #105 <Method int B()>
	//   12   22:iadd            
	//   13   23:istore          4
		int i1 = A() + C();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #117 <Method int A()>
	//   16   29:aload_0         
	//   17   30:invokevirtual   #114 <Method int C()>
	//   18   33:iadd            
	//   19   34:istore          5
		if(this.i == 1)
	//*  20   36:aload_0         
	//*  21   37:getfield        #223 <Field int i>
	//*  22   40:iconst_1        
	//*  23   41:icmpne          93
		{
			j = a(j, rect.height() + i1, F());
	//   24   44:iload_3         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #346 <Method int Rect.height()>
	//   27   49:iload           5
	//   28   51:iadd            
	//   29   52:aload_0         
	//   30   53:invokevirtual   #349 <Method int F()>
	//   31   56:invokestatic    #352 <Method int a(int, int, int)>
	//   32   59:istore_3        
			k = a(i, c[c.length - 1] + k, E());
	//   33   60:iload_2         
	//   34   61:aload_0         
	//   35   62:getfield        #266 <Field int[] c>
	//   36   65:aload_0         
	//   37   66:getfield        #266 <Field int[] c>
	//   38   69:arraylength     
	//   39   70:iconst_1        
	//   40   71:isub            
	//   41   72:iaload          
	//   42   73:iload           4
	//   43   75:iadd            
	//   44   76:aload_0         
	//   45   77:invokevirtual   #355 <Method int E()>
	//   46   80:invokestatic    #352 <Method int a(int, int, int)>
	//   47   83:istore          4
			i = j;
	//   48   85:iload_3         
	//   49   86:istore_2        
			j = k;
	//   50   87:iload           4
	//   51   89:istore_3        
		} else
	//*  52   90:goto            139
		{
			i = a(i, rect.width() + k, E());
	//   53   93:iload_2         
	//   54   94:aload_1         
	//   55   95:invokevirtual   #357 <Method int Rect.width()>
	//   56   98:iload           4
	//   57  100:iadd            
	//   58  101:aload_0         
	//   59  102:invokevirtual   #355 <Method int E()>
	//   60  105:invokestatic    #352 <Method int a(int, int, int)>
	//   61  108:istore_2        
			k = a(j, c[c.length - 1] + i1, F());
	//   62  109:iload_3         
	//   63  110:aload_0         
	//   64  111:getfield        #266 <Field int[] c>
	//   65  114:aload_0         
	//   66  115:getfield        #266 <Field int[] c>
	//   67  118:arraylength     
	//   68  119:iconst_1        
	//   69  120:isub            
	//   70  121:iaload          
	//   71  122:iload           5
	//   72  124:iadd            
	//   73  125:aload_0         
	//   74  126:invokevirtual   #349 <Method int F()>
	//   75  129:invokestatic    #352 <Method int a(int, int, int)>
	//   76  132:istore          4
			j = i;
	//   77  134:iload_2         
	//   78  135:istore_3        
			i = k;
	//   79  136:iload           4
	//   80  138:istore_2        
		}
		g(j, i);
	//   81  139:aload_0         
	//   82  140:iload_3         
	//   83  141:iload_2         
	//   84  142:invokevirtual   #359 <Method void g(int, int)>
	//   85  145:return          
	}

	void a(RecyclerView.n n, RecyclerView.r r, LinearLayoutManager.a a1, int i)
	{
		super.a(n, r, a1, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #361 <Method void LinearLayoutManager.a(RecyclerView$n, RecyclerView$r, LinearLayoutManager$a, int)>
		L();
	//    6    9:aload_0         
	//    7   10:invokespecial   #273 <Method void L()>
		if(r.e() > 0 && !r.a())
	//*   8   13:aload_2         
	//*   9   14:invokevirtual   #262 <Method int RecyclerView$r.e()>
	//*  10   17:ifle            36
	//*  11   20:aload_2         
	//*  12   21:invokevirtual   #129 <Method boolean RecyclerView$r.a()>
	//*  13   24:ifne            36
			b(n, r, a1, i);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:aload_3         
	//   18   31:iload           4
	//   19   33:invokespecial   #363 <Method void b(RecyclerView$n, RecyclerView$r, LinearLayoutManager$a, int)>
		M();
	//   20   36:aload_0         
	//   21   37:invokespecial   #275 <Method void M()>
	//   22   40:return          
	}

	void a(RecyclerView.n n, RecyclerView.r r, LinearLayoutManager.c c1, LinearLayoutManager.b b1)
	{
		int k4 = this.j.i();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field ah j>
	//    2    4:invokevirtual   #366 <Method int ah.i()>
	//    3    7:istore          15
		boolean flag;
		if(k4 != 0x40000000)
	//*   4    9:iload           15
	//*   5   11:ldc2            #367 <Int 0x40000000>
	//*   6   14:icmpeq          23
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore          10
		else
	//*   9   20:goto            26
			flag = false;
	//   10   23:iconst_0        
	//   11   24:istore          10
		int l1;
		if(u() > 0)
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #78  <Method int u()>
	//*  14   30:ifle            47
			l1 = c[b];
	//   15   33:aload_0         
	//   16   34:getfield        #266 <Field int[] c>
	//   17   37:aload_0         
	//   18   38:getfield        #35  <Field int b>
	//   19   41:iaload          
	//   20   42:istore          11
		else
	//*  21   44:goto            50
			l1 = 0;
	//   22   47:iconst_0        
	//   23   48:istore          11
		if(flag)
	//*  24   50:iload           10
	//*  25   52:ifeq            59
			L();
	//   26   55:aload_0         
	//   27   56:invokespecial   #273 <Method void L()>
		boolean flag2;
		if(c1.e == 1)
	//*  28   59:aload_3         
	//*  29   60:getfield        #371 <Field int LinearLayoutManager$c.e>
	//*  30   63:iconst_1        
	//*  31   64:icmpne          73
			flag2 = true;
	//   32   67:iconst_1        
	//   33   68:istore          16
		else
	//*  34   70:goto            76
			flag2 = false;
	//   35   73:iconst_0        
	//   36   74:istore          16
		int i = b;
	//   37   76:aload_0         
	//   38   77:getfield        #35  <Field int b>
	//   39   80:istore          8
		if(!flag2)
	//*  40   82:iload           16
	//*  41   84:ifne            110
			i = b(n, r, c1.d) + c(n, r, c1.d);
	//   42   87:aload_0         
	//   43   88:aload_1         
	//   44   89:aload_2         
	//   45   90:aload_3         
	//   46   91:getfield        #373 <Field int LinearLayoutManager$c.d>
	//   47   94:invokespecial   #260 <Method int b(RecyclerView$n, RecyclerView$r, int)>
	//   48   97:aload_0         
	//   49   98:aload_1         
	//   50   99:aload_2         
	//   51  100:aload_3         
	//   52  101:getfield        #373 <Field int LinearLayoutManager$c.d>
	//   53  104:invokespecial   #177 <Method int c(RecyclerView$n, RecyclerView$r, int)>
	//   54  107:iadd            
	//   55  108:istore          8
		int j = 0;
	//   56  110:iconst_0        
	//   57  111:istore          9
		int i2 = 0;
	//   58  113:iconst_0        
	//   59  114:istore          12
		do
		{
			if(i2 >= b || !c1.a(r) || i <= 0)
				break;
	//   60  116:iload           12
	//   61  118:aload_0         
	//   62  119:getfield        #35  <Field int b>
	//   63  122:icmpge          293
	//   64  125:aload_3         
	//   65  126:aload_2         
	//   66  127:invokevirtual   #376 <Method boolean LinearLayoutManager$c.a(RecyclerView$r)>
	//   67  130:ifeq            293
	//   68  133:iload           8
	//   69  135:ifle            293
			int j3 = c1.d;
	//   70  138:aload_3         
	//   71  139:getfield        #373 <Field int LinearLayoutManager$c.d>
	//   72  142:istore          14
			int j2 = c(n, r, j3);
	//   73  144:aload_0         
	//   74  145:aload_1         
	//   75  146:aload_2         
	//   76  147:iload           14
	//   77  149:invokespecial   #177 <Method int c(RecyclerView$n, RecyclerView$r, int)>
	//   78  152:istore          13
			if(j2 > b)
	//*  79  154:iload           13
	//*  80  156:aload_0         
	//*  81  157:getfield        #35  <Field int b>
	//*  82  160:icmple          238
			{
				n = ((RecyclerView.n) (new StringBuilder()));
	//   83  163:new             #139 <Class StringBuilder>
	//   84  166:dup             
	//   85  167:invokespecial   #140 <Method void StringBuilder()>
	//   86  170:astore_1        
				((StringBuilder) (n)).append("Item at position ");
	//   87  171:aload_1         
	//   88  172:ldc2            #378 <String "Item at position ">
	//   89  175:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   90  178:pop             
				((StringBuilder) (n)).append(j3);
	//   91  179:aload_1         
	//   92  180:iload           14
	//   93  182:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//   94  185:pop             
				((StringBuilder) (n)).append(" requires ");
	//   95  186:aload_1         
	//   96  187:ldc2            #380 <String " requires ">
	//   97  190:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   98  193:pop             
				((StringBuilder) (n)).append(j2);
	//   99  194:aload_1         
	//  100  195:iload           13
	//  101  197:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//  102  200:pop             
				((StringBuilder) (n)).append(" spans but GridLayoutManager has only ");
	//  103  201:aload_1         
	//  104  202:ldc2            #382 <String " spans but GridLayoutManager has only ">
	//  105  205:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//  106  208:pop             
				((StringBuilder) (n)).append(b);
	//  107  209:aload_1         
	//  108  210:aload_0         
	//  109  211:getfield        #35  <Field int b>
	//  110  214:invokevirtual   #149 <Method StringBuilder StringBuilder.append(int)>
	//  111  217:pop             
				((StringBuilder) (n)).append(" spans.");
	//  112  218:aload_1         
	//  113  219:ldc2            #384 <String " spans.">
	//  114  222:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//  115  225:pop             
				throw new IllegalArgumentException(((StringBuilder) (n)).toString());
	//  116  226:new             #333 <Class IllegalArgumentException>
	//  117  229:dup             
	//  118  230:aload_1         
	//  119  231:invokevirtual   #155 <Method String StringBuilder.toString()>
	//  120  234:invokespecial   #336 <Method void IllegalArgumentException(String)>
	//  121  237:athrow          
			}
			i -= j2;
	//  122  238:iload           8
	//  123  240:iload           13
	//  124  242:isub            
	//  125  243:istore          8
			if(i < 0)
	//* 126  245:iload           8
	//* 127  247:ifge            253
				break;
	//  128  250:goto            293
			View view = c1.a(n);
	//  129  253:aload_3         
	//  130  254:aload_1         
	//  131  255:invokevirtual   #387 <Method View LinearLayoutManager$c.a(RecyclerView$n)>
	//  132  258:astore          17
			if(view == null)
	//* 133  260:aload           17
	//* 134  262:ifnonnull       268
				break;
	//  135  265:goto            293
			j += j2;
	//  136  268:iload           9
	//  137  270:iload           13
	//  138  272:iadd            
	//  139  273:istore          9
			d[i2] = view;
	//  140  275:aload_0         
	//  141  276:getfield        #123 <Field View[] d>
	//  142  279:iload           12
	//  143  281:aload           17
	//  144  283:aastore         
			i2++;
	//  145  284:iload           12
	//  146  286:iconst_1        
	//  147  287:iadd            
	//  148  288:istore          12
		} while(true);
	//  149  290:goto            116
		if(i2 == 0)
	//* 150  293:iload           12
	//* 151  295:ifne            305
		{
			b1.b = true;
	//  152  298:aload           4
	//  153  300:iconst_1        
	//  154  301:putfield        #391 <Field boolean android.support.v7.widget.LinearLayoutManager$b.b>
			return;
	//  155  304:return          
		}
		float f1 = 0.0F;
	//  156  305:fconst_0        
	//  157  306:fstore          5
		a(n, r, i2, j, flag2);
	//  158  308:aload_0         
	//  159  309:aload_1         
	//  160  310:aload_2         
	//  161  311:iload           12
	//  162  313:iload           9
	//  163  315:iload           16
	//  164  317:invokespecial   #393 <Method void a(RecyclerView$n, RecyclerView$r, int, int, boolean)>
		j = 0;
	//  165  320:iconst_0        
	//  166  321:istore          9
		i = 0;
	//  167  323:iconst_0        
	//  168  324:istore          8
		while(j < i2) 
	//* 169  326:iload           9
	//* 170  328:iload           12
	//* 171  330:icmpge          491
		{
			n = ((RecyclerView.n) (d[j]));
	//  172  333:aload_0         
	//  173  334:getfield        #123 <Field View[] d>
	//  174  337:iload           9
	//  175  339:aaload          
	//  176  340:astore_1        
			if(c1.k == null)
	//* 177  341:aload_3         
	//* 178  342:getfield        #396 <Field java.util.List LinearLayoutManager$c.k>
	//* 179  345:ifnonnull       370
			{
				if(flag2)
	//* 180  348:iload           16
	//* 181  350:ifeq            361
					b(((View) (n)));
	//  182  353:aload_0         
	//  183  354:aload_1         
	//  184  355:invokevirtual   #399 <Method void b(View)>
				else
	//* 185  358:goto            389
					b(((View) (n)), 0);
	//  186  361:aload_0         
	//  187  362:aload_1         
	//  188  363:iconst_0        
	//  189  364:invokevirtual   #402 <Method void b(View, int)>
			} else
	//* 190  367:goto            389
			if(flag2)
	//* 191  370:iload           16
	//* 192  372:ifeq            383
				a(((View) (n)));
	//  193  375:aload_0         
	//  194  376:aload_1         
	//  195  377:invokevirtual   #404 <Method void a(View)>
			else
	//* 196  380:goto            389
				a(((View) (n)), 0);
	//  197  383:aload_0         
	//  198  384:aload_1         
	//  199  385:iconst_0        
	//  200  386:invokevirtual   #406 <Method void a(View, int)>
			b(((View) (n)), h);
	//  201  389:aload_0         
	//  202  390:aload_1         
	//  203  391:aload_0         
	//  204  392:getfield        #52  <Field Rect h>
	//  205  395:invokevirtual   #409 <Method void b(View, Rect)>
			a(((View) (n)), k4, false);
	//  206  398:aload_0         
	//  207  399:aload_1         
	//  208  400:iload           15
	//  209  402:iconst_0        
	//  210  403:invokespecial   #411 <Method void a(View, int, boolean)>
			int k3 = this.j.e(((View) (n)));
	//  211  406:aload_0         
	//  212  407:getfield        #233 <Field ah j>
	//  213  410:aload_1         
	//  214  411:invokevirtual   #413 <Method int ah.e(View)>
	//  215  414:istore          14
			int k2 = i;
	//  216  416:iload           8
	//  217  418:istore          13
			if(k3 > i)
	//* 218  420:iload           14
	//* 219  422:iload           8
	//* 220  424:icmple          431
				k2 = k3;
	//  221  427:iload           14
	//  222  429:istore          13
			r = ((RecyclerView.r) ((LayoutParams)((View) (n)).getLayoutParams()));
	//  223  431:aload_1         
	//  224  432:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  225  435:checkcast       #6   <Class GridLayoutManager$LayoutParams>
	//  226  438:astore_2        
			float f3 = ((float)this.j.f(((View) (n))) * 1.0F) / (float)((LayoutParams) (r)).b;
	//  227  439:aload_0         
	//  228  440:getfield        #233 <Field ah j>
	//  229  443:aload_1         
	//  230  444:invokevirtual   #415 <Method int ah.f(View)>
	//  231  447:i2f             
	//  232  448:fconst_1        
	//  233  449:fmul            
	//  234  450:aload_2         
	//  235  451:getfield        #178 <Field int android.support.v7.widget.GridLayoutManager$LayoutParams.b>
	//  236  454:i2f             
	//  237  455:fdiv            
	//  238  456:fstore          7
			float f2 = f1;
	//  239  458:fload           5
	//  240  460:fstore          6
			if(f3 > f1)
	//* 241  462:fload           7
	//* 242  464:fload           5
	//* 243  466:fcmpl           
	//* 244  467:ifle            474
				f2 = f3;
	//  245  470:fload           7
	//  246  472:fstore          6
			j++;
	//  247  474:iload           9
	//  248  476:iconst_1        
	//  249  477:iadd            
	//  250  478:istore          9
			i = k2;
	//  251  480:iload           13
	//  252  482:istore          8
			f1 = f2;
	//  253  484:fload           6
	//  254  486:fstore          5
		}
	//* 255  488:goto            326
		j = i;
	//  256  491:iload           8
	//  257  493:istore          9
		if(flag)
	//* 258  495:iload           10
	//* 259  497:ifeq            580
		{
			a(f1, l1);
	//  260  500:aload_0         
	//  261  501:fload           5
	//  262  503:iload           11
	//  263  505:invokespecial   #417 <Method void a(float, int)>
			int k = 0;
	//  264  508:iconst_0        
	//  265  509:istore          10
			i = 0;
	//  266  511:iconst_0        
	//  267  512:istore          8
			do
			{
				j = i;
	//  268  514:iload           8
	//  269  516:istore          9
				if(k >= i2)
					break;
	//  270  518:iload           10
	//  271  520:iload           12
	//  272  522:icmpge          580
				n = ((RecyclerView.n) (d[k]));
	//  273  525:aload_0         
	//  274  526:getfield        #123 <Field View[] d>
	//  275  529:iload           10
	//  276  531:aaload          
	//  277  532:astore_1        
				a(((View) (n)), 0x40000000, true);
	//  278  533:aload_0         
	//  279  534:aload_1         
	//  280  535:ldc2            #367 <Int 0x40000000>
	//  281  538:iconst_1        
	//  282  539:invokespecial   #411 <Method void a(View, int, boolean)>
				l1 = this.j.e(((View) (n)));
	//  283  542:aload_0         
	//  284  543:getfield        #233 <Field ah j>
	//  285  546:aload_1         
	//  286  547:invokevirtual   #413 <Method int ah.e(View)>
	//  287  550:istore          11
				j = i;
	//  288  552:iload           8
	//  289  554:istore          9
				if(l1 > i)
	//* 290  556:iload           11
	//* 291  558:iload           8
	//* 292  560:icmple          567
					j = l1;
	//  293  563:iload           11
	//  294  565:istore          9
				k++;
	//  295  567:iload           10
	//  296  569:iconst_1        
	//  297  570:iadd            
	//  298  571:istore          10
				i = j;
	//  299  573:iload           9
	//  300  575:istore          8
			} while(true);
	//  301  577:goto            514
		}
		for(i = 0; i < i2; i++)
	//* 302  580:iconst_0        
	//* 303  581:istore          8
	//* 304  583:iload           8
	//* 305  585:iload           12
	//* 306  587:icmpge          778
		{
			n = ((RecyclerView.n) (d[i]));
	//  307  590:aload_0         
	//  308  591:getfield        #123 <Field View[] d>
	//  309  594:iload           8
	//  310  596:aaload          
	//  311  597:astore_1        
			if(this.j.e(((View) (n))) == j)
				continue;
	//  312  598:aload_0         
	//  313  599:getfield        #233 <Field ah j>
	//  314  602:aload_1         
	//  315  603:invokevirtual   #413 <Method int ah.e(View)>
	//  316  606:iload           9
	//  317  608:icmpeq          769
			r = ((RecyclerView.r) ((LayoutParams)((View) (n)).getLayoutParams()));
	//  318  611:aload_1         
	//  319  612:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  320  615:checkcast       #6   <Class GridLayoutManager$LayoutParams>
	//  321  618:astore_2        
			Rect rect = ((LayoutParams) (r)).d;
	//  322  619:aload_2         
	//  323  620:getfield        #194 <Field Rect GridLayoutManager$LayoutParams.d>
	//  324  623:astore          17
			l1 = rect.top + rect.bottom + ((LayoutParams) (r)).topMargin + ((LayoutParams) (r)).bottomMargin;
	//  325  625:aload           17
	//  326  627:getfield        #197 <Field int Rect.top>
	//  327  630:aload           17
	//  328  632:getfield        #200 <Field int Rect.bottom>
	//  329  635:iadd            
	//  330  636:aload_2         
	//  331  637:getfield        #203 <Field int GridLayoutManager$LayoutParams.topMargin>
	//  332  640:iadd            
	//  333  641:aload_2         
	//  334  642:getfield        #206 <Field int GridLayoutManager$LayoutParams.bottomMargin>
	//  335  645:iadd            
	//  336  646:istore          11
			int i1 = rect.left + rect.right + ((LayoutParams) (r)).leftMargin + ((LayoutParams) (r)).rightMargin;
	//  337  648:aload           17
	//  338  650:getfield        #209 <Field int Rect.left>
	//  339  653:aload           17
	//  340  655:getfield        #212 <Field int Rect.right>
	//  341  658:iadd            
	//  342  659:aload_2         
	//  343  660:getfield        #215 <Field int GridLayoutManager$LayoutParams.leftMargin>
	//  344  663:iadd            
	//  345  664:aload_2         
	//  346  665:getfield        #218 <Field int GridLayoutManager$LayoutParams.rightMargin>
	//  347  668:iadd            
	//  348  669:istore          10
			int l2 = a(((LayoutParams) (r)).a, ((LayoutParams) (r)).b);
	//  349  671:aload_0         
	//  350  672:aload_2         
	//  351  673:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//  352  676:aload_2         
	//  353  677:getfield        #178 <Field int android.support.v7.widget.GridLayoutManager$LayoutParams.b>
	//  354  680:invokevirtual   #220 <Method int a(int, int)>
	//  355  683:istore          13
			if(this.i == 1)
	//* 356  685:aload_0         
	//* 357  686:getfield        #223 <Field int i>
	//* 358  689:iconst_1        
	//* 359  690:icmpne          726
			{
				i1 = a(l2, 0x40000000, i1, ((LayoutParams) (r)).width, false);
	//  360  693:iload           13
	//  361  695:ldc2            #367 <Int 0x40000000>
	//  362  698:iload           10
	//  363  700:aload_2         
	//  364  701:getfield        #226 <Field int GridLayoutManager$LayoutParams.width>
	//  365  704:iconst_0        
	//  366  705:invokestatic    #229 <Method int a(int, int, int, int, boolean)>
	//  367  708:istore          10
				l1 = android.view.View.MeasureSpec.makeMeasureSpec(j - l1, 0x40000000);
	//  368  710:iload           9
	//  369  712:iload           11
	//  370  714:isub            
	//  371  715:ldc2            #367 <Int 0x40000000>
	//  372  718:invokestatic    #422 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  373  721:istore          11
			} else
	//* 374  723:goto            756
			{
				i1 = android.view.View.MeasureSpec.makeMeasureSpec(j - i1, 0x40000000);
	//  375  726:iload           9
	//  376  728:iload           10
	//  377  730:isub            
	//  378  731:ldc2            #367 <Int 0x40000000>
	//  379  734:invokestatic    #422 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  380  737:istore          10
				l1 = a(l2, 0x40000000, l1, ((LayoutParams) (r)).height, false);
	//  381  739:iload           13
	//  382  741:ldc2            #367 <Int 0x40000000>
	//  383  744:iload           11
	//  384  746:aload_2         
	//  385  747:getfield        #241 <Field int GridLayoutManager$LayoutParams.height>
	//  386  750:iconst_0        
	//  387  751:invokestatic    #229 <Method int a(int, int, int, int, boolean)>
	//  388  754:istore          11
			}
			a(((View) (n)), i1, l1, true);
	//  389  756:aload_0         
	//  390  757:aload_1         
	//  391  758:iload           10
	//  392  760:iload           11
	//  393  762:iconst_1        
	//  394  763:invokespecial   #246 <Method void a(View, int, int, boolean)>
		}

	//  395  766:goto            769
	//  396  769:iload           8
	//  397  771:iconst_1        
	//  398  772:iadd            
	//  399  773:istore          8
	//* 400  775:goto            583
		int i3 = 0;
	//  401  778:iconst_0        
	//  402  779:istore          13
		b1.a = j;
	//  403  781:aload           4
	//  404  783:iload           9
	//  405  785:putfield        #423 <Field int LinearLayoutManager$b.a>
		int k1;
		if(this.i == 1)
	//* 406  788:aload_0         
	//* 407  789:getfield        #223 <Field int i>
	//* 408  792:iconst_1        
	//* 409  793:icmpne          858
		{
			if(c1.f == -1)
	//* 410  796:aload_3         
	//* 411  797:getfield        #425 <Field int LinearLayoutManager$c.f>
	//* 412  800:iconst_m1       
	//* 413  801:icmpne          838
			{
				int j1 = c1.b;
	//  414  804:aload_3         
	//  415  805:getfield        #426 <Field int android.support.v7.widget.LinearLayoutManager$c.b>
	//  416  808:istore          10
				i = j1;
	//  417  810:iload           10
	//  418  812:istore          8
				j1 -= j;
	//  419  814:iload           10
	//  420  816:iload           9
	//  421  818:isub            
	//  422  819:istore          10
				j = i;
	//  423  821:iload           8
	//  424  823:istore          9
				i = j1;
	//  425  825:iload           10
	//  426  827:istore          8
			} else
	//* 427  829:iconst_0        
	//* 428  830:istore          10
	//* 429  832:iconst_0        
	//* 430  833:istore          11
	//* 431  835:goto            915
			{
				k1 = c1.b;
	//  432  838:aload_3         
	//  433  839:getfield        #426 <Field int android.support.v7.widget.LinearLayoutManager$c.b>
	//  434  842:istore          10
				i = k1;
	//  435  844:iload           10
	//  436  846:istore          8
				j += k1;
	//  437  848:iload           9
	//  438  850:iload           10
	//  439  852:iadd            
	//  440  853:istore          9
			}
			k1 = 0;
			l1 = 0;
		} else
	//* 441  855:goto            829
		if(c1.f == -1)
	//* 442  858:aload_3         
	//* 443  859:getfield        #425 <Field int LinearLayoutManager$c.f>
	//* 444  862:iconst_m1       
	//* 445  863:icmpne          896
		{
			k1 = c1.b;
	//  446  866:aload_3         
	//  447  867:getfield        #426 <Field int android.support.v7.widget.LinearLayoutManager$c.b>
	//  448  870:istore          10
			i = 0;
	//  449  872:iconst_0        
	//  450  873:istore          8
			boolean flag1 = false;
	//  451  875:iconst_0        
	//  452  876:istore          14
			l1 = k1;
	//  453  878:iload           10
	//  454  880:istore          11
			k1 -= j;
	//  455  882:iload           10
	//  456  884:iload           9
	//  457  886:isub            
	//  458  887:istore          10
			j = ((int) (flag1));
	//  459  889:iload           14
	//  460  891:istore          9
		} else
	//* 461  893:goto            915
		{
			k1 = c1.b;
	//  462  896:aload_3         
	//  463  897:getfield        #426 <Field int android.support.v7.widget.LinearLayoutManager$c.b>
	//  464  900:istore          10
			l1 = j + k1;
	//  465  902:iload           9
	//  466  904:iload           10
	//  467  906:iadd            
	//  468  907:istore          11
			i = 0;
	//  469  909:iconst_0        
	//  470  910:istore          8
			j = 0;
	//  471  912:iconst_0        
	//  472  913:istore          9
		}
		int j4;
		for(; i3 < i2; i3 = j4)
	//* 473  915:iload           13
	//* 474  917:iload           12
	//* 475  919:icmpge          1144
		{
label0:
			{
				n = ((RecyclerView.n) (d[i3]));
	//  476  922:aload_0         
	//  477  923:getfield        #123 <Field View[] d>
	//  478  926:iload           13
	//  479  928:aaload          
	//  480  929:astore_1        
				r = ((RecyclerView.r) ((LayoutParams)((View) (n)).getLayoutParams()));
	//  481  930:aload_1         
	//  482  931:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  483  934:checkcast       #6   <Class GridLayoutManager$LayoutParams>
	//  484  937:astore_2        
				if(this.i == 1)
	//* 485  938:aload_0         
	//* 486  939:getfield        #223 <Field int i>
	//* 487  942:iconst_1        
	//* 488  943:icmpne          1030
				{
					if(g())
	//* 489  946:aload_0         
	//* 490  947:invokevirtual   #270 <Method boolean g()>
	//* 491  950:ifeq            998
					{
						l1 = z() + c[b - ((LayoutParams) (r)).a];
	//  492  953:aload_0         
	//  493  954:invokevirtual   #108 <Method int z()>
	//  494  957:aload_0         
	//  495  958:getfield        #266 <Field int[] c>
	//  496  961:aload_0         
	//  497  962:getfield        #35  <Field int b>
	//  498  965:aload_2         
	//  499  966:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//  500  969:isub            
	//  501  970:iaload          
	//  502  971:iadd            
	//  503  972:istore          11
						int l3 = this.j.f(((View) (n)));
	//  504  974:aload_0         
	//  505  975:getfield        #233 <Field ah j>
	//  506  978:aload_1         
	//  507  979:invokevirtual   #415 <Method int ah.f(View)>
	//  508  982:istore          14
						k1 = l1;
	//  509  984:iload           11
	//  510  986:istore          10
						l1 -= l3;
	//  511  988:iload           11
	//  512  990:iload           14
	//  513  992:isub            
	//  514  993:istore          11
						break label0;
	//  515  995:goto            1071
					}
					k1 = z() + c[((LayoutParams) (r)).a];
	//  516  998:aload_0         
	//  517  999:invokevirtual   #108 <Method int z()>
	//  518 1002:aload_0         
	//  519 1003:getfield        #266 <Field int[] c>
	//  520 1006:aload_2         
	//  521 1007:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//  522 1010:iaload          
	//  523 1011:iadd            
	//  524 1012:istore          10
					l1 = this.j.f(((View) (n))) + k1;
	//  525 1014:aload_0         
	//  526 1015:getfield        #233 <Field ah j>
	//  527 1018:aload_1         
	//  528 1019:invokevirtual   #415 <Method int ah.f(View)>
	//  529 1022:iload           10
	//  530 1024:iadd            
	//  531 1025:istore          11
				} else
	//* 532 1027:goto            1059
				{
					i = A() + c[((LayoutParams) (r)).a];
	//  533 1030:aload_0         
	//  534 1031:invokevirtual   #117 <Method int A()>
	//  535 1034:aload_0         
	//  536 1035:getfield        #266 <Field int[] c>
	//  537 1038:aload_2         
	//  538 1039:getfield        #180 <Field int GridLayoutManager$LayoutParams.a>
	//  539 1042:iaload          
	//  540 1043:iadd            
	//  541 1044:istore          8
					j = this.j.f(((View) (n))) + i;
	//  542 1046:aload_0         
	//  543 1047:getfield        #233 <Field ah j>
	//  544 1050:aload_1         
	//  545 1051:invokevirtual   #415 <Method int ah.f(View)>
	//  546 1054:iload           8
	//  547 1056:iadd            
	//  548 1057:istore          9
				}
				int i4 = k1;
	//  549 1059:iload           10
	//  550 1061:istore          14
				k1 = l1;
	//  551 1063:iload           11
	//  552 1065:istore          10
				l1 = i4;
	//  553 1067:iload           14
	//  554 1069:istore          11
			}
			a(((View) (n)), l1, i, k1, j);
	//  555 1071:aload_0         
	//  556 1072:aload_1         
	//  557 1073:iload           11
	//  558 1075:iload           8
	//  559 1077:iload           10
	//  560 1079:iload           9
	//  561 1081:invokevirtual   #429 <Method void a(View, int, int, int, int)>
			if(((LayoutParams) (r)).d() || ((LayoutParams) (r)).e())
	//* 562 1084:aload_2         
	//* 563 1085:invokevirtual   #430 <Method boolean GridLayoutManager$LayoutParams.d()>
	//* 564 1088:ifne            1098
	//* 565 1091:aload_2         
	//* 566 1092:invokevirtual   #432 <Method boolean GridLayoutManager$LayoutParams.e()>
	//* 567 1095:ifeq            1104
				b1.c = true;
	//  568 1098:aload           4
	//  569 1100:iconst_1        
	//  570 1101:putfield        #434 <Field boolean LinearLayoutManager$b.c>
			b1.d = b1.d | ((View) (n)).hasFocusable();
	//  571 1104:aload           4
	//  572 1106:aload           4
	//  573 1108:getfield        #436 <Field boolean LinearLayoutManager$b.d>
	//  574 1111:aload_1         
	//  575 1112:invokevirtual   #323 <Method boolean View.hasFocusable()>
	//  576 1115:ior             
	//  577 1116:putfield        #436 <Field boolean LinearLayoutManager$b.d>
			j4 = i3 + 1;
	//  578 1119:iload           13
	//  579 1121:iconst_1        
	//  580 1122:iadd            
	//  581 1123:istore          14
			i3 = k1;
	//  582 1125:iload           10
	//  583 1127:istore          13
			k1 = l1;
	//  584 1129:iload           11
	//  585 1131:istore          10
			l1 = i3;
	//  586 1133:iload           13
	//  587 1135:istore          11
		}

	//  588 1137:iload           14
	//  589 1139:istore          13
	//* 590 1141:goto            915
		Arrays.fill(((Object []) (d)), ((Object) (null)));
	//  591 1144:aload_0         
	//  592 1145:getfield        #123 <Field View[] d>
	//  593 1148:aconst_null     
	//  594 1149:invokestatic    #442 <Method void Arrays.fill(Object[], Object)>
	//  595 1152:return          
	}

	public void a(RecyclerView.n n, RecyclerView.r r, View view, android.support.v4.view.a.b b1)
	{
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #87  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore          11
		if(!(layoutparams instanceof LayoutParams))
	//*   3    6:aload           11
	//*   4    8:instanceof      #6   <Class GridLayoutManager$LayoutParams>
	//*   5   11:ifne            22
		{
			super.a(view, b1);
	//    6   14:aload_0         
	//    7   15:aload_3         
	//    8   16:aload           4
	//    9   18:invokespecial   #446 <Method void LinearLayoutManager.a(View, b)>
			return;
	//   10   21:return          
		}
		view = ((View) ((LayoutParams)layoutparams));
	//   11   22:aload           11
	//   12   24:checkcast       #6   <Class GridLayoutManager$LayoutParams>
	//   13   27:astore_3        
		int i = a(n, r, ((LayoutParams) (view)).f());
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #89  <Method int GridLayoutManager$LayoutParams.f()>
	//   19   35:invokespecial   #280 <Method int a(RecyclerView$n, RecyclerView$r, int)>
	//   20   38:istore          5
		int j;
		int k;
		int i1;
		boolean flag1;
		if(this.i == 0)
	//*  21   40:aload_0         
	//*  22   41:getfield        #223 <Field int i>
	//*  23   44:ifne            118
		{
			j = ((LayoutParams) (view)).a();
	//   24   47:aload_3         
	//   25   48:invokevirtual   #97  <Method int GridLayoutManager$LayoutParams.a()>
	//   26   51:istore          6
			int j1 = ((LayoutParams) (view)).b();
	//   27   53:aload_3         
	//   28   54:invokevirtual   #91  <Method int android.support.v7.widget.GridLayoutManager$LayoutParams.b()>
	//   29   57:istore          9
			i1 = 1;
	//   30   59:iconst_1        
	//   31   60:istore          8
			if(b > 1 && ((LayoutParams) (view)).b() == b)
	//*  32   62:aload_0         
	//*  33   63:getfield        #35  <Field int b>
	//*  34   66:iconst_1        
	//*  35   67:icmple          87
	//*  36   70:aload_3         
	//*  37   71:invokevirtual   #91  <Method int android.support.v7.widget.GridLayoutManager$LayoutParams.b()>
	//*  38   74:aload_0         
	//*  39   75:getfield        #35  <Field int b>
	//*  40   78:icmpne          87
				flag1 = true;
	//   41   81:iconst_1        
	//   42   82:istore          10
			else
	//*  43   84:goto            90
				flag1 = false;
	//   44   87:iconst_0        
	//   45   88:istore          10
			k = i;
	//   46   90:iload           5
	//   47   92:istore          7
			i = j1;
	//   48   94:iload           9
	//   49   96:istore          5
		} else
	//*  50   98:aload           4
	//*  51  100:iload           6
	//*  52  102:iload           5
	//*  53  104:iload           7
	//*  54  106:iload           8
	//*  55  108:iload           10
	//*  56  110:iconst_0        
	//*  57  111:invokestatic    #451 <Method android.support.v4.view.a.b$l android.support.v4.view.a.b$l.a(int, int, int, int, boolean, boolean)>
	//*  58  114:invokevirtual   #456 <Method void b.b(Object)>
	//*  59  117:return          
		{
			boolean flag = true;
	//   60  118:iconst_1        
	//   61  119:istore          9
			k = ((LayoutParams) (view)).a();
	//   62  121:aload_3         
	//   63  122:invokevirtual   #97  <Method int GridLayoutManager$LayoutParams.a()>
	//   64  125:istore          7
			i1 = ((LayoutParams) (view)).b();
	//   65  127:aload_3         
	//   66  128:invokevirtual   #91  <Method int android.support.v7.widget.GridLayoutManager$LayoutParams.b()>
	//   67  131:istore          8
			if(b > 1 && ((LayoutParams) (view)).b() == b)
	//*  68  133:aload_0         
	//*  69  134:getfield        #35  <Field int b>
	//*  70  137:iconst_1        
	//*  71  138:icmple          158
	//*  72  141:aload_3         
	//*  73  142:invokevirtual   #91  <Method int android.support.v7.widget.GridLayoutManager$LayoutParams.b()>
	//*  74  145:aload_0         
	//*  75  146:getfield        #35  <Field int b>
	//*  76  149:icmpne          158
				flag1 = true;
	//   77  152:iconst_1        
	//   78  153:istore          10
			else
	//*  79  155:goto            161
				flag1 = false;
	//   80  158:iconst_0        
	//   81  159:istore          10
			j = i;
	//   82  161:iload           5
	//   83  163:istore          6
			i = ((int) (flag));
	//   84  165:iload           9
	//   85  167:istore          5
		}
		b1.b(((Object) (android.support.v4.view.a.b.l.a(j, i, k, i1, flag1, false))));
	//*  86  169:goto            98
	}

	public void a(RecyclerView.r r)
	{
		super.a(r);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #459 <Method void LinearLayoutManager.a(RecyclerView$r)>
		a = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #33  <Field boolean a>
	//    6   10:return          
	}

	void a(RecyclerView.r r, LinearLayoutManager.c c1, RecyclerView.h.a a1)
	{
		int j = b;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int b>
	//    2    4:istore          5
		for(int i = 0; i < b && c1.a(r) && j > 0; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore          4
	//*   5    9:iload           4
	//*   6   11:aload_0         
	//*   7   12:getfield        #35  <Field int b>
	//*   8   15:icmpge          89
	//*   9   18:aload_2         
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #376 <Method boolean LinearLayoutManager$c.a(RecyclerView$r)>
	//*  12   23:ifeq            89
	//*  13   26:iload           5
	//*  14   28:ifle            89
		{
			int k = c1.d;
	//   15   31:aload_2         
	//   16   32:getfield        #373 <Field int LinearLayoutManager$c.d>
	//   17   35:istore          6
			a1.b(k, Math.max(0, c1.g));
	//   18   37:aload_3         
	//   19   38:iload           6
	//   20   40:iconst_0        
	//   21   41:aload_2         
	//   22   42:getfield        #462 <Field int LinearLayoutManager$c.g>
	//   23   45:invokestatic    #171 <Method int Math.max(int, int)>
	//   24   48:invokeinterface #466 <Method void android.support.v7.widget.RecyclerView$h$a.b(int, int)>
			j -= g.a(k);
	//   25   53:iload           5
	//   26   55:aload_0         
	//   27   56:getfield        #47  <Field GridLayoutManager$b g>
	//   28   59:iload           6
	//   29   61:invokevirtual   #264 <Method int GridLayoutManager$b.a(int)>
	//   30   64:isub            
	//   31   65:istore          5
			c1.d = c1.d + c1.e;
	//   32   67:aload_2         
	//   33   68:aload_2         
	//   34   69:getfield        #373 <Field int LinearLayoutManager$c.d>
	//   35   72:aload_2         
	//   36   73:getfield        #371 <Field int LinearLayoutManager$c.e>
	//   37   76:iadd            
	//   38   77:putfield        #373 <Field int LinearLayoutManager$c.d>
		}

	//   39   80:iload           4
	//   40   82:iconst_1        
	//   41   83:iadd            
	//   42   84:istore          4
	//*  43   86:goto            9
	//   44   89:return          
	}

	public void a(RecyclerView recyclerview)
	{
		g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GridLayoutManager$b g>
	//    2    4:invokevirtual   #338 <Method void GridLayoutManager$b.a()>
	//    3    7:return          
	}

	public void a(RecyclerView recyclerview, int i, int j)
	{
		g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GridLayoutManager$b g>
	//    2    4:invokevirtual   #338 <Method void GridLayoutManager$b.a()>
	//    3    7:return          
	}

	public void a(RecyclerView recyclerview, int i, int j, int k)
	{
		g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GridLayoutManager$b g>
	//    2    4:invokevirtual   #338 <Method void GridLayoutManager$b.a()>
	//    3    7:return          
	}

	public void a(RecyclerView recyclerview, int i, int j, Object obj)
	{
		g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GridLayoutManager$b g>
	//    2    4:invokevirtual   #338 <Method void GridLayoutManager$b.a()>
	//    3    7:return          
	}

	public void a(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
		{
			throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
	//    2    4:new             #473 <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:ldc2            #475 <String "GridLayoutManager does not support stack from end. Consider using reverse layout">
	//    5   11:invokespecial   #476 <Method void UnsupportedOperationException(String)>
	//    6   14:athrow          
		} else
		{
			super.a(false);
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:invokespecial   #478 <Method void LinearLayoutManager.a(boolean)>
			return;
	//   10   20:return          
		}
	}

	public boolean a(RecyclerView.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #6   <Class GridLayoutManager$LayoutParams>
	//    2    4:ireturn         
	}

	public int b(int i, RecyclerView.n n, RecyclerView.r r)
	{
		L();
	//    0    0:aload_0         
	//    1    1:invokespecial   #273 <Method void L()>
		M();
	//    2    4:aload_0         
	//    3    5:invokespecial   #275 <Method void M()>
		return super.b(i, n, r);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #481 <Method int android.support.v7.widget.LinearLayoutManager.b(int, RecyclerView$n, RecyclerView$r)>
	//    9   15:ireturn         
	}

	public int b(RecyclerView.n n, RecyclerView.r r)
	{
		if(i == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field int i>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return b;
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field int b>
	//    6   12:ireturn         
		if(r.e() < 1)
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #262 <Method int RecyclerView$r.e()>
	//*   9   17:iconst_1        
	//*  10   18:icmpge          23
			return 0;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		else
			return a(n, r, r.e() - 1) + 1;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:aload_2         
	//   17   27:invokevirtual   #262 <Method int RecyclerView$r.e()>
	//   18   30:iconst_1        
	//   19   31:isub            
	//   20   32:invokespecial   #280 <Method int a(RecyclerView$n, RecyclerView$r, int)>
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:ireturn         
	}

	public void b(RecyclerView recyclerview, int i, int j)
	{
		g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field GridLayoutManager$b g>
	//    2    4:invokevirtual   #338 <Method void GridLayoutManager$b.a()>
	//    3    7:return          
	}

	public boolean b()
	{
		return n == null && !a;
	//    0    0:aload_0         
	//    1    1:getfield        #484 <Field LinearLayoutManager$SavedState n>
	//    2    4:ifnonnull       16
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field boolean a>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void c(RecyclerView.n n, RecyclerView.r r)
	{
		if(r.a())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #129 <Method boolean RecyclerView$r.a()>
	//*   2    4:ifeq            11
			K();
	//    3    7:aload_0         
	//    4    8:invokespecial   #487 <Method void K()>
		super.c(n, r);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #489 <Method void LinearLayoutManager.c(RecyclerView$n, RecyclerView$r)>
		J();
	//    9   17:aload_0         
	//   10   18:invokespecial   #491 <Method void J()>
	//   11   21:return          
	}

	boolean a;
	int b;
	int c[];
	View d[];
	final SparseIntArray e;
	final SparseIntArray f;
	b g;
	final Rect h;
}
