// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutManager, ah

class LinearLayoutManager$a
{

	void a()
	{
		a = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #26  <Field int a>
		b = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #27  <Int 0x80000000>
	//    5    8:putfield        #29  <Field int b>
		c = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #31  <Field boolean c>
		d = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #33  <Field boolean d>
	//   12   21:return          
	}

	public void a(View view)
	{
		int k = e.j.b();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field LinearLayoutManager e>
	//    2    4:getfield        #38  <Field ah LinearLayoutManager.j>
	//    3    7:invokevirtual   #43  <Method int ah.b()>
	//    4   10:istore_3        
		if(k >= 0)
	//*   5   11:iload_3         
	//*   6   12:iflt            21
		{
			b(view);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #45  <Method void b(View)>
			return;
	//   10   20:return          
		}
		a = e.d(view);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #18  <Field LinearLayoutManager e>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #48  <Method int LinearLayoutManager.d(View)>
	//   16   30:putfield        #26  <Field int a>
		if(c)
	//*  17   33:aload_0         
	//*  18   34:getfield        #31  <Field boolean c>
	//*  19   37:ifeq            162
		{
			int i = e.j.d() - k - e.j.b(view);
	//   20   40:aload_0         
	//   21   41:getfield        #18  <Field LinearLayoutManager e>
	//   22   44:getfield        #38  <Field ah LinearLayoutManager.j>
	//   23   47:invokevirtual   #50  <Method int ah.d()>
	//   24   50:iload_3         
	//   25   51:isub            
	//   26   52:aload_0         
	//   27   53:getfield        #18  <Field LinearLayoutManager e>
	//   28   56:getfield        #38  <Field ah LinearLayoutManager.j>
	//   29   59:aload_1         
	//   30   60:invokevirtual   #52  <Method int ah.b(View)>
	//   31   63:isub            
	//   32   64:istore_2        
			b = e.j.d() - i;
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #18  <Field LinearLayoutManager e>
	//   36   70:getfield        #38  <Field ah LinearLayoutManager.j>
	//   37   73:invokevirtual   #50  <Method int ah.d()>
	//   38   76:iload_2         
	//   39   77:isub            
	//   40   78:putfield        #29  <Field int b>
			if(i > 0)
	//*  41   81:iload_2         
	//*  42   82:ifle            285
			{
				k = e.j.e(view);
	//   43   85:aload_0         
	//   44   86:getfield        #18  <Field LinearLayoutManager e>
	//   45   89:getfield        #38  <Field ah LinearLayoutManager.j>
	//   46   92:aload_1         
	//   47   93:invokevirtual   #54  <Method int ah.e(View)>
	//   48   96:istore_3        
				int l = b;
	//   49   97:aload_0         
	//   50   98:getfield        #29  <Field int b>
	//   51  101:istore          4
				int j1 = e.j.c();
	//   52  103:aload_0         
	//   53  104:getfield        #18  <Field LinearLayoutManager e>
	//   54  107:getfield        #38  <Field ah LinearLayoutManager.j>
	//   55  110:invokevirtual   #56  <Method int ah.c()>
	//   56  113:istore          5
				k = l - k - (j1 + Math.min(e.j.a(view) - j1, 0));
	//   57  115:iload           4
	//   58  117:iload_3         
	//   59  118:isub            
	//   60  119:iload           5
	//   61  121:aload_0         
	//   62  122:getfield        #18  <Field LinearLayoutManager e>
	//   63  125:getfield        #38  <Field ah LinearLayoutManager.j>
	//   64  128:aload_1         
	//   65  129:invokevirtual   #58  <Method int ah.a(View)>
	//   66  132:iload           5
	//   67  134:isub            
	//   68  135:iconst_0        
	//   69  136:invokestatic    #64  <Method int Math.min(int, int)>
	//   70  139:iadd            
	//   71  140:isub            
	//   72  141:istore_3        
				if(k < 0)
	//*  73  142:iload_3         
	//*  74  143:ifge            285
				{
					b = b + Math.min(i, -k);
	//   75  146:aload_0         
	//   76  147:aload_0         
	//   77  148:getfield        #29  <Field int b>
	//   78  151:iload_2         
	//   79  152:iload_3         
	//   80  153:ineg            
	//   81  154:invokestatic    #64  <Method int Math.min(int, int)>
	//   82  157:iadd            
	//   83  158:putfield        #29  <Field int b>
					return;
	//   84  161:return          
				}
			}
		} else
		{
			int i1 = e.j.a(view);
	//   85  162:aload_0         
	//   86  163:getfield        #18  <Field LinearLayoutManager e>
	//   87  166:getfield        #38  <Field ah LinearLayoutManager.j>
	//   88  169:aload_1         
	//   89  170:invokevirtual   #58  <Method int ah.a(View)>
	//   90  173:istore          4
			int j = i1 - e.j.c();
	//   91  175:iload           4
	//   92  177:aload_0         
	//   93  178:getfield        #18  <Field LinearLayoutManager e>
	//   94  181:getfield        #38  <Field ah LinearLayoutManager.j>
	//   95  184:invokevirtual   #56  <Method int ah.c()>
	//   96  187:isub            
	//   97  188:istore_2        
			b = i1;
	//   98  189:aload_0         
	//   99  190:iload           4
	//  100  192:putfield        #29  <Field int b>
			if(j > 0)
	//* 101  195:iload_2         
	//* 102  196:ifle            285
			{
				int k1 = e.j.e(view);
	//  103  199:aload_0         
	//  104  200:getfield        #18  <Field LinearLayoutManager e>
	//  105  203:getfield        #38  <Field ah LinearLayoutManager.j>
	//  106  206:aload_1         
	//  107  207:invokevirtual   #54  <Method int ah.e(View)>
	//  108  210:istore          5
				int l1 = e.j.d();
	//  109  212:aload_0         
	//  110  213:getfield        #18  <Field LinearLayoutManager e>
	//  111  216:getfield        #38  <Field ah LinearLayoutManager.j>
	//  112  219:invokevirtual   #50  <Method int ah.d()>
	//  113  222:istore          6
				int i2 = e.j.b(view);
	//  114  224:aload_0         
	//  115  225:getfield        #18  <Field LinearLayoutManager e>
	//  116  228:getfield        #38  <Field ah LinearLayoutManager.j>
	//  117  231:aload_1         
	//  118  232:invokevirtual   #52  <Method int ah.b(View)>
	//  119  235:istore          7
				k = e.j.d() - Math.min(0, l1 - k - i2) - (i1 + k1);
	//  120  237:aload_0         
	//  121  238:getfield        #18  <Field LinearLayoutManager e>
	//  122  241:getfield        #38  <Field ah LinearLayoutManager.j>
	//  123  244:invokevirtual   #50  <Method int ah.d()>
	//  124  247:iconst_0        
	//  125  248:iload           6
	//  126  250:iload_3         
	//  127  251:isub            
	//  128  252:iload           7
	//  129  254:isub            
	//  130  255:invokestatic    #64  <Method int Math.min(int, int)>
	//  131  258:isub            
	//  132  259:iload           4
	//  133  261:iload           5
	//  134  263:iadd            
	//  135  264:isub            
	//  136  265:istore_3        
				if(k < 0)
	//* 137  266:iload_3         
	//* 138  267:ifge            285
					b = b - Math.min(j, -k);
	//  139  270:aload_0         
	//  140  271:aload_0         
	//  141  272:getfield        #29  <Field int b>
	//  142  275:iload_2         
	//  143  276:iload_3         
	//  144  277:ineg            
	//  145  278:invokestatic    #64  <Method int Math.min(int, int)>
	//  146  281:isub            
	//  147  282:putfield        #29  <Field int b>
			}
		}
	//  148  285:return          
	}

	boolean a(View view, RecyclerView.r r)
	{
		view = ((View) ((ams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #71  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #73  <Class RecyclerView$LayoutParams>
	//    3    7:astore_1        
		return !((ams) (view)).d() && ((ams) (view)).f() >= 0 && ((ams) (view)).f() < r.e();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #76  <Method boolean RecyclerView$LayoutParams.d()>
	//    6   12:ifne            35
	//    7   15:aload_1         
	//    8   16:invokevirtual   #79  <Method int RecyclerView$LayoutParams.f()>
	//    9   19:iflt            35
	//   10   22:aload_1         
	//   11   23:invokevirtual   #79  <Method int RecyclerView$LayoutParams.f()>
	//   12   26:aload_2         
	//   13   27:invokevirtual   #83  <Method int RecyclerView$r.e()>
	//   14   30:icmpge          35
	//   15   33:iconst_1        
	//   16   34:ireturn         
	//   17   35:iconst_0        
	//   18   36:ireturn         
	}

	void b()
	{
		int i;
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean c>
	//*   2    4:ifeq            21
			i = e.j.d();
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field LinearLayoutManager e>
	//    5   11:getfield        #38  <Field ah LinearLayoutManager.j>
	//    6   14:invokevirtual   #50  <Method int ah.d()>
	//    7   17:istore_1        
		else
	//*   8   18:goto            32
			i = e.j.c();
	//    9   21:aload_0         
	//   10   22:getfield        #18  <Field LinearLayoutManager e>
	//   11   25:getfield        #38  <Field ah LinearLayoutManager.j>
	//   12   28:invokevirtual   #56  <Method int ah.c()>
	//   13   31:istore_1        
		b = i;
	//   14   32:aload_0         
	//   15   33:iload_1         
	//   16   34:putfield        #29  <Field int b>
	//   17   37:return          
	}

	public void b(View view)
	{
		int i;
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean c>
	//*   2    4:ifeq            38
			i = e.j.b(view) + e.j.b();
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field LinearLayoutManager e>
	//    5   11:getfield        #38  <Field ah LinearLayoutManager.j>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #52  <Method int ah.b(View)>
	//    8   18:aload_0         
	//    9   19:getfield        #18  <Field LinearLayoutManager e>
	//   10   22:getfield        #38  <Field ah LinearLayoutManager.j>
	//   11   25:invokevirtual   #43  <Method int ah.b()>
	//   12   28:iadd            
	//   13   29:istore_2        
		else
	//*  14   30:aload_0         
	//*  15   31:iload_2         
	//*  16   32:putfield        #29  <Field int b>
	//*  17   35:goto            53
			i = e.j.a(view);
	//   18   38:aload_0         
	//   19   39:getfield        #18  <Field LinearLayoutManager e>
	//   20   42:getfield        #38  <Field ah LinearLayoutManager.j>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #58  <Method int ah.a(View)>
	//   23   49:istore_2        
		b = i;
	//*  24   50:goto            30
		a = e.d(view);
	//   25   53:aload_0         
	//   26   54:aload_0         
	//   27   55:getfield        #18  <Field LinearLayoutManager e>
	//   28   58:aload_1         
	//   29   59:invokevirtual   #48  <Method int LinearLayoutManager.d(View)>
	//   30   62:putfield        #26  <Field int a>
	//   31   65:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("AnchorInfo{mPosition=");
	//    4    8:aload_1         
	//    5    9:ldc1            #90  <String "AnchorInfo{mPosition=">
	//    6   11:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(a);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #26  <Field int a>
	//   11   20:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", mCoordinate=");
	//   13   24:aload_1         
	//   14   25:ldc1            #99  <String ", mCoordinate=">
	//   15   27:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(b);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #29  <Field int b>
	//   20   36:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", mLayoutFromEnd=");
	//   22   40:aload_1         
	//   23   41:ldc1            #101 <String ", mLayoutFromEnd=">
	//   24   43:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(c);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #31  <Field boolean c>
	//   29   52:invokevirtual   #104 <Method StringBuilder StringBuilder.append(boolean)>
	//   30   55:pop             
		stringbuilder.append(", mValid=");
	//   31   56:aload_1         
	//   32   57:ldc1            #106 <String ", mValid=">
	//   33   59:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(d);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #33  <Field boolean d>
	//   38   68:invokevirtual   #104 <Method StringBuilder StringBuilder.append(boolean)>
	//   39   71:pop             
		stringbuilder.append('}');
	//   40   72:aload_1         
	//   41   73:bipush          125
	//   42   75:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//   43   78:pop             
		return stringbuilder.toString();
	//   44   79:aload_1         
	//   45   80:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   46   83:areturn         
	}

	int a;
	int b;
	boolean c;
	boolean d;
	final LinearLayoutManager e;

	LinearLayoutManager$a(LinearLayoutManager linearlayoutmanager)
	{
		e = linearlayoutmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field LinearLayoutManager e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		a();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #23  <Method void a()>
	//    7   13:return          
	}
}
