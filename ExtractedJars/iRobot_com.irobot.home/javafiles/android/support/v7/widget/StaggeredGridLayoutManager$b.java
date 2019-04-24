// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager, ah

class StaggeredGridLayoutManager$b
{

	int a(int l)
	{
		if(b != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field int b>
	//*   2    4:ldc1            #29  <Int 0x80000000>
	//*   3    6:icmpeq          14
			return b;
	//    4    9:aload_0         
	//    5   10:getfield        #31  <Field int b>
	//    6   13:ireturn         
		if(a.size() == 0)
	//*   7   14:aload_0         
	//*   8   15:getfield        #28  <Field ArrayList a>
	//*   9   18:invokevirtual   #43  <Method int ArrayList.size()>
	//*  10   21:ifne            26
		{
			return l;
	//   11   24:iload_1         
	//   12   25:ireturn         
		} else
		{
			a();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #45  <Method void a()>
			return b;
	//   15   30:aload_0         
	//   16   31:getfield        #31  <Field int b>
	//   17   34:ireturn         
		}
	}

	int a(int l, int i1, boolean flag)
	{
		return a(l, i1, false, false, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:iload_3         
	//    6    6:invokevirtual   #49  <Method int a(int, int, boolean, boolean, boolean)>
	//    7    9:ireturn         
	}

	int a(int l, int i1, boolean flag, boolean flag1, boolean flag2)
	{
		int j1 = f.b.c();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field StaggeredGridLayoutManager f>
	//    2    4:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//    3    7:invokevirtual   #56  <Method int ah.c()>
	//    4   10:istore          9
		int k1 = f.b.d();
	//    5   12:aload_0         
	//    6   13:getfield        #20  <Field StaggeredGridLayoutManager f>
	//    7   16:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//    8   19:invokevirtual   #58  <Method int ah.d()>
	//    9   22:istore          10
		byte byte0;
		if(i1 > l)
	//*  10   24:iload_2         
	//*  11   25:iload_1         
	//*  12   26:icmple          35
			byte0 = 1;
	//   13   29:iconst_1        
	//   14   30:istore          6
		else
	//*  15   32:goto            38
			byte0 = -1;
	//   16   35:iconst_m1       
	//   17   36:istore          6
		for(; l != i1; l += ((int) (byte0)))
	//*  18   38:iload_1         
	//*  19   39:iload_2         
	//*  20   40:icmpeq          225
		{
			View view = (View)a.get(l);
	//   21   43:aload_0         
	//   22   44:getfield        #28  <Field ArrayList a>
	//   23   47:iload_1         
	//   24   48:invokevirtual   #62  <Method Object ArrayList.get(int)>
	//   25   51:checkcast       #64  <Class View>
	//   26   54:astore          13
			int l1 = f.b.a(view);
	//   27   56:aload_0         
	//   28   57:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   29   60:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//   30   63:aload           13
	//   31   65:invokevirtual   #67  <Method int ah.a(View)>
	//   32   68:istore          11
			int i2 = f.b.b(view);
	//   33   70:aload_0         
	//   34   71:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   35   74:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//   36   77:aload           13
	//   37   79:invokevirtual   #69  <Method int ah.b(View)>
	//   38   82:istore          12
			boolean flag4 = false;
	//   39   84:iconst_0        
	//   40   85:istore          8
			boolean flag3;
			if(flag2 ? l1 <= k1 : l1 < k1)
	//*  41   87:iload           5
	//*  42   89:ifeq            111
	//*  43   92:iload           11
	//*  44   94:iload           10
	//*  45   96:icmpgt          105
				flag3 = true;
	//   46   99:iconst_1        
	//   47  100:istore          7
			else
	//*  48  102:goto            121
				flag3 = false;
	//   49  105:iconst_0        
	//   50  106:istore          7
	//   51  108:goto            121
	//   52  111:iload           11
	//   53  113:iload           10
	//   54  115:icmpge          105
	//*  55  118:goto            99
			if(flag2 ? i2 >= j1 : i2 > j1)
	//*  56  121:iload           5
	//*  57  123:ifeq            139
	//*  58  126:iload           12
	//*  59  128:iload           9
	//*  60  130:icmplt          149
				flag4 = true;
	//   61  133:iconst_1        
	//   62  134:istore          8
	//   63  136:goto            149
	//   64  139:iload           12
	//   65  141:iload           9
	//   66  143:icmple          149
	//*  67  146:goto            133
			if(flag3 && flag4 && (!flag || !flag1 ? flag1 || l1 < j1 || i2 > k1 : l1 >= j1 && i2 <= k1))
	//*  68  149:iload           7
	//*  69  151:ifeq            217
	//*  70  154:iload           8
	//*  71  156:ifeq            217
	//*  72  159:iload_3         
	//*  73  160:ifeq            192
	//*  74  163:iload           4
	//*  75  165:ifeq            192
	//*  76  168:iload           11
	//*  77  170:iload           9
	//*  78  172:icmplt          217
	//*  79  175:iload           12
	//*  80  177:iload           10
	//*  81  179:icmpgt          217
				return f.d(view);
	//   82  182:aload_0         
	//   83  183:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   84  186:aload           13
	//   85  188:invokevirtual   #71  <Method int StaggeredGridLayoutManager.d(View)>
	//   86  191:ireturn         
	//   87  192:iload           4
	//   88  194:ifeq            200
	//   89  197:goto            182
	//   90  200:iload           11
	//   91  202:iload           9
	//   92  204:icmplt          182
	//   93  207:iload           12
	//   94  209:iload           10
	//   95  211:icmple          217
		}

	//   96  214:goto            182
	//   97  217:iload_1         
	//   98  218:iload           6
	//   99  220:iadd            
	//  100  221:istore_1        
	//* 101  222:goto            38
		return -1;
	//  102  225:iconst_m1       
	//  103  226:ireturn         
	}

	public View a(int l, int i1)
	{
		View view2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		View view = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		if(i1 == -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpne          119
		{
			int j1 = a.size();
	//    7   11:aload_0         
	//    8   12:getfield        #28  <Field ArrayList a>
	//    9   15:invokevirtual   #43  <Method int ArrayList.size()>
	//   10   18:istore_3        
			i1 = 0;
	//   11   19:iconst_0        
	//   12   20:istore_2        
			do
			{
				view2 = view;
	//   13   21:aload           4
	//   14   23:astore          5
				if(i1 >= j1)
					break;
	//   15   25:iload_2         
	//   16   26:iload_3         
	//   17   27:icmpge          230
				View view3 = (View)a.get(i1);
	//   18   30:aload_0         
	//   19   31:getfield        #28  <Field ArrayList a>
	//   20   34:iload_2         
	//   21   35:invokevirtual   #62  <Method Object ArrayList.get(int)>
	//   22   38:checkcast       #64  <Class View>
	//   23   41:astore          6
				if(f.d)
	//*  24   43:aload_0         
	//*  25   44:getfield        #20  <Field StaggeredGridLayoutManager f>
	//*  26   47:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
	//*  27   50:ifeq            70
				{
					view2 = view;
	//   28   53:aload           4
	//   29   55:astore          5
					if(f.d(view3) <= l)
						break;
	//   30   57:aload_0         
	//   31   58:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   32   61:aload           6
	//   33   63:invokevirtual   #71  <Method int StaggeredGridLayoutManager.d(View)>
	//   34   66:iload_1         
	//   35   67:icmple          230
				}
				if(!f.d && f.d(view3) >= l)
	//*  36   70:aload_0         
	//*  37   71:getfield        #20  <Field StaggeredGridLayoutManager f>
	//*  38   74:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
	//*  39   77:ifne            96
	//*  40   80:aload_0         
	//*  41   81:getfield        #20  <Field StaggeredGridLayoutManager f>
	//*  42   84:aload           6
	//*  43   86:invokevirtual   #71  <Method int StaggeredGridLayoutManager.d(View)>
	//*  44   89:iload_1         
	//*  45   90:icmplt          96
					return view;
	//   46   93:aload           4
	//   47   95:areturn         
				view2 = view;
	//   48   96:aload           4
	//   49   98:astore          5
				if(!view3.hasFocusable())
					break;
	//   50  100:aload           6
	//   51  102:invokevirtual   #79  <Method boolean View.hasFocusable()>
	//   52  105:ifeq            230
				i1++;
	//   53  108:iload_2         
	//   54  109:iconst_1        
	//   55  110:iadd            
	//   56  111:istore_2        
				view = view3;
	//   57  112:aload           6
	//   58  114:astore          4
			} while(true);
	//   59  116:goto            21
		} else
		{
			i1 = a.size() - 1;
	//   60  119:aload_0         
	//   61  120:getfield        #28  <Field ArrayList a>
	//   62  123:invokevirtual   #43  <Method int ArrayList.size()>
	//   63  126:iconst_1        
	//   64  127:isub            
	//   65  128:istore_2        
			View view1 = view2;
	//   66  129:aload           5
	//   67  131:astore          4
			do
			{
				view2 = view1;
	//   68  133:aload           4
	//   69  135:astore          5
				if(i1 < 0)
					break;
	//   70  137:iload_2         
	//   71  138:iflt            230
				View view4 = (View)a.get(i1);
	//   72  141:aload_0         
	//   73  142:getfield        #28  <Field ArrayList a>
	//   74  145:iload_2         
	//   75  146:invokevirtual   #62  <Method Object ArrayList.get(int)>
	//   76  149:checkcast       #64  <Class View>
	//   77  152:astore          6
				if(f.d)
	//*  78  154:aload_0         
	//*  79  155:getfield        #20  <Field StaggeredGridLayoutManager f>
	//*  80  158:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
	//*  81  161:ifeq            181
				{
					view2 = view1;
	//   82  164:aload           4
	//   83  166:astore          5
					if(f.d(view4) >= l)
						break;
	//   84  168:aload_0         
	//   85  169:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   86  172:aload           6
	//   87  174:invokevirtual   #71  <Method int StaggeredGridLayoutManager.d(View)>
	//   88  177:iload_1         
	//   89  178:icmpge          230
				}
				if(!f.d && f.d(view4) <= l)
	//*  90  181:aload_0         
	//*  91  182:getfield        #20  <Field StaggeredGridLayoutManager f>
	//*  92  185:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
	//*  93  188:ifne            207
	//*  94  191:aload_0         
	//*  95  192:getfield        #20  <Field StaggeredGridLayoutManager f>
	//*  96  195:aload           6
	//*  97  197:invokevirtual   #71  <Method int StaggeredGridLayoutManager.d(View)>
	//*  98  200:iload_1         
	//*  99  201:icmpgt          207
					return view1;
	//  100  204:aload           4
	//  101  206:areturn         
				view2 = view1;
	//  102  207:aload           4
	//  103  209:astore          5
				if(!view4.hasFocusable())
					break;
	//  104  211:aload           6
	//  105  213:invokevirtual   #79  <Method boolean View.hasFocusable()>
	//  106  216:ifeq            230
				i1--;
	//  107  219:iload_2         
	//  108  220:iconst_1        
	//  109  221:isub            
	//  110  222:istore_2        
				view1 = view4;
	//  111  223:aload           6
	//  112  225:astore          4
			} while(true);
	//  113  227:goto            133
		}
		return view2;
	//  114  230:aload           5
	//  115  232:areturn         
	}

	void a()
	{
		View view = (View)a.get(0);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList a>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #62  <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #64  <Class View>
	//    5   11:astore_1        
		youtParams youtparams = c(view);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
	//    9   17:astore_2        
		b = f.b.a(view);
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   13   23:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #67  <Method int ah.a(View)>
	//   16   30:putfield        #31  <Field int b>
		if(youtparams.b)
	//*  17   33:aload_2         
	//*  18   34:getfield        #86  <Field boolean StaggeredGridLayoutManager$LayoutParams.b>
	//*  19   37:ifeq            84
		{
			zySpanLookup.FullSpanItem fullspanitem = f.h.f(youtparams.f());
	//   20   40:aload_0         
	//   21   41:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   22   44:getfield        #90  <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.h>
	//   23   47:aload_2         
	//   24   48:invokevirtual   #92  <Method int StaggeredGridLayoutManager$LayoutParams.f()>
	//   25   51:invokevirtual   #97  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.f(int)>
	//   26   54:astore_1        
			if(fullspanitem != null && fullspanitem.b == -1)
	//*  27   55:aload_1         
	//*  28   56:ifnull          84
	//*  29   59:aload_1         
	//*  30   60:getfield        #100 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b>
	//*  31   63:iconst_m1       
	//*  32   64:icmpne          84
				b = b - fullspanitem.a(e);
	//   33   67:aload_0         
	//   34   68:aload_0         
	//   35   69:getfield        #31  <Field int b>
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #37  <Field int e>
	//   39   77:invokevirtual   #102 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a(int)>
	//   40   80:isub            
	//   41   81:putfield        #31  <Field int b>
		}
	//   42   84:return          
	}

	void a(View view)
	{
		youtParams youtparams = c(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
	//    3    5:astore_2        
		youtparams.a = this;
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:putfield        #106 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
		a.add(0, ((Object) (view)));
	//    7   11:aload_0         
	//    8   12:getfield        #28  <Field ArrayList a>
	//    9   15:iconst_0        
	//   10   16:aload_1         
	//   11   17:invokevirtual   #110 <Method void ArrayList.add(int, Object)>
		b = 0x80000000;
	//   12   20:aload_0         
	//   13   21:ldc1            #29  <Int 0x80000000>
	//   14   23:putfield        #31  <Field int b>
		if(a.size() == 1)
	//*  15   26:aload_0         
	//*  16   27:getfield        #28  <Field ArrayList a>
	//*  17   30:invokevirtual   #43  <Method int ArrayList.size()>
	//*  18   33:iconst_1        
	//*  19   34:icmpne          43
			c = 0x80000000;
	//   20   37:aload_0         
	//   21   38:ldc1            #29  <Int 0x80000000>
	//   22   40:putfield        #33  <Field int c>
		if(youtparams.d() || youtparams.e())
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #112 <Method boolean StaggeredGridLayoutManager$LayoutParams.d()>
	//*  25   47:ifne            57
	//*  26   50:aload_2         
	//*  27   51:invokevirtual   #114 <Method boolean StaggeredGridLayoutManager$LayoutParams.e()>
	//*  28   54:ifeq            77
			d = d + f.b.e(view);
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #35  <Field int d>
	//   32   62:aload_0         
	//   33   63:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   34   66:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #116 <Method int ah.e(View)>
	//   37   73:iadd            
	//   38   74:putfield        #35  <Field int d>
	//   39   77:return          
	}

	void a(boolean flag, int l)
	{
		int i1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            14
			i1 = b(0x80000000);
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <Int 0x80000000>
	//    4    7:invokevirtual   #119 <Method int b(int)>
	//    5   10:istore_3        
		else
	//*   6   11:goto            21
			i1 = a(0x80000000);
	//    7   14:aload_0         
	//    8   15:ldc1            #29  <Int 0x80000000>
	//    9   17:invokevirtual   #120 <Method int a(int)>
	//   10   20:istore_3        
		e();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #122 <Method void e()>
		if(i1 == 0x80000000)
	//*  13   25:iload_3         
	//*  14   26:ldc1            #29  <Int 0x80000000>
	//*  15   28:icmpne          32
			return;
	//   16   31:return          
		if(flag && i1 < f.b.d() || !flag && i1 > f.b.c())
	//*  17   32:iload_1         
	//*  18   33:ifeq            50
	//*  19   36:iload_3         
	//*  20   37:aload_0         
	//*  21   38:getfield        #20  <Field StaggeredGridLayoutManager f>
	//*  22   41:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//*  23   44:invokevirtual   #58  <Method int ah.d()>
	//*  24   47:icmplt          68
	//*  25   50:iload_1         
	//*  26   51:ifne            69
	//*  27   54:iload_3         
	//*  28   55:aload_0         
	//*  29   56:getfield        #20  <Field StaggeredGridLayoutManager f>
	//*  30   59:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//*  31   62:invokevirtual   #56  <Method int ah.c()>
	//*  32   65:icmple          69
			return;
	//   33   68:return          
		int j1 = i1;
	//   34   69:iload_3         
	//   35   70:istore          4
		if(l != 0x80000000)
	//*  36   72:iload_2         
	//*  37   73:ldc1            #29  <Int 0x80000000>
	//*  38   75:icmpeq          83
			j1 = i1 + l;
	//   39   78:iload_3         
	//   40   79:iload_2         
	//   41   80:iadd            
	//   42   81:istore          4
		c = j1;
	//   43   83:aload_0         
	//   44   84:iload           4
	//   45   86:putfield        #33  <Field int c>
		b = j1;
	//   46   89:aload_0         
	//   47   90:iload           4
	//   48   92:putfield        #31  <Field int b>
	//   49   95:return          
	}

	int b()
	{
		if(b != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field int b>
	//*   2    4:ldc1            #29  <Int 0x80000000>
	//*   3    6:icmpeq          14
		{
			return b;
	//    4    9:aload_0         
	//    5   10:getfield        #31  <Field int b>
	//    6   13:ireturn         
		} else
		{
			a();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #45  <Method void a()>
			return b;
	//    9   18:aload_0         
	//   10   19:getfield        #31  <Field int b>
	//   11   22:ireturn         
		}
	}

	int b(int l)
	{
		if(c != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int c>
	//*   2    4:ldc1            #29  <Int 0x80000000>
	//*   3    6:icmpeq          14
			return c;
	//    4    9:aload_0         
	//    5   10:getfield        #33  <Field int c>
	//    6   13:ireturn         
		if(a.size() == 0)
	//*   7   14:aload_0         
	//*   8   15:getfield        #28  <Field ArrayList a>
	//*   9   18:invokevirtual   #43  <Method int ArrayList.size()>
	//*  10   21:ifne            26
		{
			return l;
	//   11   24:iload_1         
	//   12   25:ireturn         
		} else
		{
			c();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #124 <Method void c()>
			return c;
	//   15   30:aload_0         
	//   16   31:getfield        #33  <Field int c>
	//   17   34:ireturn         
		}
	}

	void b(View view)
	{
		youtParams youtparams = c(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
	//    3    5:astore_2        
		youtparams.a = this;
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:putfield        #106 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
		a.add(((Object) (view)));
	//    7   11:aload_0         
	//    8   12:getfield        #28  <Field ArrayList a>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #127 <Method boolean ArrayList.add(Object)>
	//   11   19:pop             
		c = 0x80000000;
	//   12   20:aload_0         
	//   13   21:ldc1            #29  <Int 0x80000000>
	//   14   23:putfield        #33  <Field int c>
		if(a.size() == 1)
	//*  15   26:aload_0         
	//*  16   27:getfield        #28  <Field ArrayList a>
	//*  17   30:invokevirtual   #43  <Method int ArrayList.size()>
	//*  18   33:iconst_1        
	//*  19   34:icmpne          43
			b = 0x80000000;
	//   20   37:aload_0         
	//   21   38:ldc1            #29  <Int 0x80000000>
	//   22   40:putfield        #31  <Field int b>
		if(youtparams.d() || youtparams.e())
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #112 <Method boolean StaggeredGridLayoutManager$LayoutParams.d()>
	//*  25   47:ifne            57
	//*  26   50:aload_2         
	//*  27   51:invokevirtual   #114 <Method boolean StaggeredGridLayoutManager$LayoutParams.e()>
	//*  28   54:ifeq            77
			d = d + f.b.e(view);
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:getfield        #35  <Field int d>
	//   32   62:aload_0         
	//   33   63:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   34   66:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #116 <Method int ah.e(View)>
	//   37   73:iadd            
	//   38   74:putfield        #35  <Field int d>
	//   39   77:return          
	}

	youtParams c(View view)
	{
		return (youtParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #131 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #84  <Class StaggeredGridLayoutManager$LayoutParams>
	//    3    7:areturn         
	}

	void c()
	{
		View view = (View)a.get(a.size() - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList a>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field ArrayList a>
	//    4    8:invokevirtual   #43  <Method int ArrayList.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:invokevirtual   #62  <Method Object ArrayList.get(int)>
	//    8   16:checkcast       #64  <Class View>
	//    9   19:astore_1        
		youtParams youtparams = c(view);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
	//   13   25:astore_2        
		c = f.b.b(view);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   17   31:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #69  <Method int ah.b(View)>
	//   20   38:putfield        #33  <Field int c>
		if(youtparams.b)
	//*  21   41:aload_2         
	//*  22   42:getfield        #86  <Field boolean StaggeredGridLayoutManager$LayoutParams.b>
	//*  23   45:ifeq            92
		{
			zySpanLookup.FullSpanItem fullspanitem = f.h.f(youtparams.f());
	//   24   48:aload_0         
	//   25   49:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   26   52:getfield        #90  <Field StaggeredGridLayoutManager$LazySpanLookup StaggeredGridLayoutManager.h>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #92  <Method int StaggeredGridLayoutManager$LayoutParams.f()>
	//   29   59:invokevirtual   #97  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem StaggeredGridLayoutManager$LazySpanLookup.f(int)>
	//   30   62:astore_1        
			if(fullspanitem != null && fullspanitem.b == 1)
	//*  31   63:aload_1         
	//*  32   64:ifnull          92
	//*  33   67:aload_1         
	//*  34   68:getfield        #100 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b>
	//*  35   71:iconst_1        
	//*  36   72:icmpne          92
				c = c + fullspanitem.a(e);
	//   37   75:aload_0         
	//   38   76:aload_0         
	//   39   77:getfield        #33  <Field int c>
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #37  <Field int e>
	//   43   85:invokevirtual   #102 <Method int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a(int)>
	//   44   88:iadd            
	//   45   89:putfield        #33  <Field int c>
		}
	//   46   92:return          
	}

	void c(int l)
	{
		b = l;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field int b>
		c = l;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #33  <Field int c>
	//    6   10:return          
	}

	int d()
	{
		if(c != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int c>
	//*   2    4:ldc1            #29  <Int 0x80000000>
	//*   3    6:icmpeq          14
		{
			return c;
	//    4    9:aload_0         
	//    5   10:getfield        #33  <Field int c>
	//    6   13:ireturn         
		} else
		{
			c();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #124 <Method void c()>
			return c;
	//    9   18:aload_0         
	//   10   19:getfield        #33  <Field int c>
	//   11   22:ireturn         
		}
	}

	void d(int l)
	{
		if(b != 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field int b>
	//*   2    4:ldc1            #29  <Int 0x80000000>
	//*   3    6:icmpeq          19
			b = b + l;
	//    4    9:aload_0         
	//    5   10:aload_0         
	//    6   11:getfield        #31  <Field int b>
	//    7   14:iload_1         
	//    8   15:iadd            
	//    9   16:putfield        #31  <Field int b>
		if(c != 0x80000000)
	//*  10   19:aload_0         
	//*  11   20:getfield        #33  <Field int c>
	//*  12   23:ldc1            #29  <Int 0x80000000>
	//*  13   25:icmpeq          38
			c = c + l;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #33  <Field int c>
	//   17   33:iload_1         
	//   18   34:iadd            
	//   19   35:putfield        #33  <Field int c>
	//   20   38:return          
	}

	void e()
	{
		a.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList a>
	//    2    4:invokevirtual   #135 <Method void ArrayList.clear()>
		f();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #137 <Method void f()>
		d = 0;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #35  <Field int d>
	//    8   16:return          
	}

	void f()
	{
		b = 0x80000000;
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <Int 0x80000000>
	//    2    3:putfield        #31  <Field int b>
		c = 0x80000000;
	//    3    6:aload_0         
	//    4    7:ldc1            #29  <Int 0x80000000>
	//    5    9:putfield        #33  <Field int c>
	//    6   12:return          
	}

	void g()
	{
		int l = a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList a>
	//    2    4:invokevirtual   #43  <Method int ArrayList.size()>
	//    3    7:istore_1        
		View view = (View)a.remove(l - 1);
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field ArrayList a>
	//    6   12:iload_1         
	//    7   13:iconst_1        
	//    8   14:isub            
	//    9   15:invokevirtual   #141 <Method Object ArrayList.remove(int)>
	//   10   18:checkcast       #64  <Class View>
	//   11   21:astore_2        
		youtParams youtparams = c(view);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
	//   15   27:astore_3        
		youtparams.a = null;
	//   16   28:aload_3         
	//   17   29:aconst_null     
	//   18   30:putfield        #106 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
		if(youtparams.d() || youtparams.e())
	//*  19   33:aload_3         
	//*  20   34:invokevirtual   #112 <Method boolean StaggeredGridLayoutManager$LayoutParams.d()>
	//*  21   37:ifne            47
	//*  22   40:aload_3         
	//*  23   41:invokevirtual   #114 <Method boolean StaggeredGridLayoutManager$LayoutParams.e()>
	//*  24   44:ifeq            67
			d = d - f.b.e(view);
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #35  <Field int d>
	//   28   52:aload_0         
	//   29   53:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   30   56:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//   31   59:aload_2         
	//   32   60:invokevirtual   #116 <Method int ah.e(View)>
	//   33   63:isub            
	//   34   64:putfield        #35  <Field int d>
		if(l == 1)
	//*  35   67:iload_1         
	//*  36   68:iconst_1        
	//*  37   69:icmpne          78
			b = 0x80000000;
	//   38   72:aload_0         
	//   39   73:ldc1            #29  <Int 0x80000000>
	//   40   75:putfield        #31  <Field int b>
		c = 0x80000000;
	//   41   78:aload_0         
	//   42   79:ldc1            #29  <Int 0x80000000>
	//   43   81:putfield        #33  <Field int c>
	//   44   84:return          
	}

	void h()
	{
		View view = (View)a.remove(0);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList a>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #141 <Method Object ArrayList.remove(int)>
	//    4    8:checkcast       #64  <Class View>
	//    5   11:astore_1        
		youtParams youtparams = c(view);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #82  <Method StaggeredGridLayoutManager$LayoutParams c(View)>
	//    9   17:astore_2        
		youtparams.a = null;
	//   10   18:aload_2         
	//   11   19:aconst_null     
	//   12   20:putfield        #106 <Field StaggeredGridLayoutManager$b StaggeredGridLayoutManager$LayoutParams.a>
		if(a.size() == 0)
	//*  13   23:aload_0         
	//*  14   24:getfield        #28  <Field ArrayList a>
	//*  15   27:invokevirtual   #43  <Method int ArrayList.size()>
	//*  16   30:ifne            39
			c = 0x80000000;
	//   17   33:aload_0         
	//   18   34:ldc1            #29  <Int 0x80000000>
	//   19   36:putfield        #33  <Field int c>
		if(youtparams.d() || youtparams.e())
	//*  20   39:aload_2         
	//*  21   40:invokevirtual   #112 <Method boolean StaggeredGridLayoutManager$LayoutParams.d()>
	//*  22   43:ifne            53
	//*  23   46:aload_2         
	//*  24   47:invokevirtual   #114 <Method boolean StaggeredGridLayoutManager$LayoutParams.e()>
	//*  25   50:ifeq            73
			d = d - f.b.e(view);
	//   26   53:aload_0         
	//   27   54:aload_0         
	//   28   55:getfield        #35  <Field int d>
	//   29   58:aload_0         
	//   30   59:getfield        #20  <Field StaggeredGridLayoutManager f>
	//   31   62:getfield        #52  <Field ah StaggeredGridLayoutManager.b>
	//   32   65:aload_1         
	//   33   66:invokevirtual   #116 <Method int ah.e(View)>
	//   34   69:isub            
	//   35   70:putfield        #35  <Field int d>
		b = 0x80000000;
	//   36   73:aload_0         
	//   37   74:ldc1            #29  <Int 0x80000000>
	//   38   76:putfield        #31  <Field int b>
	//   39   79:return          
	}

	public int i()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int d>
	//    2    4:ireturn         
	}

	public int j()
	{
		int l;
		int i1;
		if(f.d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field StaggeredGridLayoutManager f>
	//*   2    4:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
	//*   3    7:ifeq            30
		{
			l = a.size() - 1;
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field ArrayList a>
	//    6   14:invokevirtual   #43  <Method int ArrayList.size()>
	//    7   17:iconst_1        
	//    8   18:isub            
	//    9   19:istore_1        
			i1 = -1;
	//   10   20:iconst_m1       
	//   11   21:istore_2        
		} else
	//*  12   22:aload_0         
	//*  13   23:iload_1         
	//*  14   24:iload_2         
	//*  15   25:iconst_1        
	//*  16   26:invokevirtual   #145 <Method int a(int, int, boolean)>
	//*  17   29:ireturn         
		{
			l = 0;
	//   18   30:iconst_0        
	//   19   31:istore_1        
			i1 = a.size();
	//   20   32:aload_0         
	//   21   33:getfield        #28  <Field ArrayList a>
	//   22   36:invokevirtual   #43  <Method int ArrayList.size()>
	//   23   39:istore_2        
		}
		return a(l, i1, true);
	//*  24   40:goto            22
	}

	public int k()
	{
		int l;
		int i1;
		if(f.d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field StaggeredGridLayoutManager f>
	//*   2    4:getfield        #75  <Field boolean StaggeredGridLayoutManager.d>
	//*   3    7:ifeq            28
		{
			l = 0;
	//    4   10:iconst_0        
	//    5   11:istore_1        
			i1 = a.size();
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field ArrayList a>
	//    8   16:invokevirtual   #43  <Method int ArrayList.size()>
	//    9   19:istore_2        
		} else
	//*  10   20:aload_0         
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:iconst_1        
	//*  14   24:invokevirtual   #145 <Method int a(int, int, boolean)>
	//*  15   27:ireturn         
		{
			l = a.size() - 1;
	//   16   28:aload_0         
	//   17   29:getfield        #28  <Field ArrayList a>
	//   18   32:invokevirtual   #43  <Method int ArrayList.size()>
	//   19   35:iconst_1        
	//   20   36:isub            
	//   21   37:istore_1        
			i1 = -1;
	//   22   38:iconst_m1       
	//   23   39:istore_2        
		}
		return a(l, i1, true);
	//*  24   40:goto            20
	}

	ArrayList a;
	int b;
	int c;
	int d;
	final int e;
	final StaggeredGridLayoutManager f;

	StaggeredGridLayoutManager$b(StaggeredGridLayoutManager staggeredgridlayoutmanager, int l)
	{
		f = staggeredgridlayoutmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field StaggeredGridLayoutManager f>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		a = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #25  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #26  <Method void ArrayList()>
	//    9   17:putfield        #28  <Field ArrayList a>
		b = 0x80000000;
	//   10   20:aload_0         
	//   11   21:ldc1            #29  <Int 0x80000000>
	//   12   23:putfield        #31  <Field int b>
		c = 0x80000000;
	//   13   26:aload_0         
	//   14   27:ldc1            #29  <Int 0x80000000>
	//   15   29:putfield        #33  <Field int c>
		d = 0;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #35  <Field int d>
		e = l;
	//   19   37:aload_0         
	//   20   38:iload_2         
	//   21   39:putfield        #37  <Field int e>
	//   22   42:return          
	}
}
