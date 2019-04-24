// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout, p

private class SlidingPaneLayout$c extends p.a
{

	public int a(View view, int i, int j)
	{
		return view.getTop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method int View.getTop()>
	//    2    4:ireturn         
	}

	public void a(int i)
	{
		if(a.e.a() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field SlidingPaneLayout a>
	//*   2    4:getfield        #29  <Field p SlidingPaneLayout.e>
	//*   3    7:invokevirtual   #33  <Method int p.a()>
	//*   4   10:ifne            90
		{
			boolean flag;
			SlidingPaneLayout slidingpanelayout;
			if(a.b == 0.0F)
	//*   5   13:aload_0         
	//*   6   14:getfield        #13  <Field SlidingPaneLayout a>
	//*   7   17:getfield        #37  <Field float SlidingPaneLayout.b>
	//*   8   20:fconst_0        
	//*   9   21:fcmpl           
	//*  10   22:ifne            66
			{
				a.d(a.a);
	//   11   25:aload_0         
	//   12   26:getfield        #13  <Field SlidingPaneLayout a>
	//   13   29:aload_0         
	//   14   30:getfield        #13  <Field SlidingPaneLayout a>
	//   15   33:getfield        #40  <Field View SlidingPaneLayout.a>
	//   16   36:invokevirtual   #44  <Method void SlidingPaneLayout.d(View)>
				a.c(a.a);
	//   17   39:aload_0         
	//   18   40:getfield        #13  <Field SlidingPaneLayout a>
	//   19   43:aload_0         
	//   20   44:getfield        #13  <Field SlidingPaneLayout a>
	//   21   47:getfield        #40  <Field View SlidingPaneLayout.a>
	//   22   50:invokevirtual   #46  <Method void SlidingPaneLayout.c(View)>
				slidingpanelayout = a;
	//   23   53:aload_0         
	//   24   54:getfield        #13  <Field SlidingPaneLayout a>
	//   25   57:astore_3        
				flag = false;
	//   26   58:iconst_0        
	//   27   59:istore_2        
			} else
	//*  28   60:aload_3         
	//*  29   61:iload_2         
	//*  30   62:putfield        #50  <Field boolean SlidingPaneLayout.f>
	//*  31   65:return          
			{
				a.b(a.a);
	//   32   66:aload_0         
	//   33   67:getfield        #13  <Field SlidingPaneLayout a>
	//   34   70:aload_0         
	//   35   71:getfield        #13  <Field SlidingPaneLayout a>
	//   36   74:getfield        #40  <Field View SlidingPaneLayout.a>
	//   37   77:invokevirtual   #52  <Method void SlidingPaneLayout.b(View)>
				slidingpanelayout = a;
	//   38   80:aload_0         
	//   39   81:getfield        #13  <Field SlidingPaneLayout a>
	//   40   84:astore_3        
				flag = true;
	//   41   85:iconst_1        
	//   42   86:istore_2        
			}
			slidingpanelayout.f = flag;
			return;
		} else
	//*  43   87:goto            60
		{
			return;
	//   44   90:return          
		}
	}

	public void a(View view, float f, float f1)
	{
		int i;
label0:
		{
			youtParams youtparams;
label1:
			{
label2:
				{
					youtparams = (youtParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #59  <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          7
					if(!a.f())
						break label1;
	//    4    9:aload_0         
	//    5   10:getfield        #13  <Field SlidingPaneLayout a>
	//    6   13:invokevirtual   #62  <Method boolean SlidingPaneLayout.f()>
	//    7   16:ifeq            109
					int j = a.getPaddingRight() + youtparams.rightMargin;
	//    8   19:aload_0         
	//    9   20:getfield        #13  <Field SlidingPaneLayout a>
	//   10   23:invokevirtual   #65  <Method int SlidingPaneLayout.getPaddingRight()>
	//   11   26:aload           7
	//   12   28:getfield        #69  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   13   31:iadd            
	//   14   32:istore          5
					if(f >= 0.0F)
	//*  15   34:fload_2         
	//*  16   35:fconst_0        
	//*  17   36:fcmpg           
	//*  18   37:iflt            67
					{
						i = j;
	//   19   40:iload           5
	//   20   42:istore          4
						if(f != 0.0F)
							break label2;
	//   21   44:fload_2         
	//   22   45:fconst_0        
	//   23   46:fcmpl           
	//   24   47:ifne            79
						i = j;
	//   25   50:iload           5
	//   26   52:istore          4
						if(a.b <= 0.5F)
							break label2;
	//   27   54:aload_0         
	//   28   55:getfield        #13  <Field SlidingPaneLayout a>
	//   29   58:getfield        #37  <Field float SlidingPaneLayout.b>
	//   30   61:ldc1            #70  <Float 0.5F>
	//   31   63:fcmpl           
	//   32   64:ifle            79
					}
					i = j + a.c;
	//   33   67:iload           5
	//   34   69:aload_0         
	//   35   70:getfield        #13  <Field SlidingPaneLayout a>
	//   36   73:getfield        #72  <Field int SlidingPaneLayout.c>
	//   37   76:iadd            
	//   38   77:istore          4
				}
				int k = a.a.getWidth();
	//   39   79:aload_0         
	//   40   80:getfield        #13  <Field SlidingPaneLayout a>
	//   41   83:getfield        #40  <Field View SlidingPaneLayout.a>
	//   42   86:invokevirtual   #75  <Method int View.getWidth()>
	//   43   89:istore          5
				i = a.getWidth() - i - k;
	//   44   91:aload_0         
	//   45   92:getfield        #13  <Field SlidingPaneLayout a>
	//   46   95:invokevirtual   #76  <Method int SlidingPaneLayout.getWidth()>
	//   47   98:iload           4
	//   48  100:isub            
	//   49  101:iload           5
	//   50  103:isub            
	//   51  104:istore          4
				break label0;
	//   52  106:goto            176
			}
			i = a.getPaddingLeft();
	//   53  109:aload_0         
	//   54  110:getfield        #13  <Field SlidingPaneLayout a>
	//   55  113:invokevirtual   #79  <Method int SlidingPaneLayout.getPaddingLeft()>
	//   56  116:istore          4
			int l = youtparams.leftMargin + i;
	//   57  118:aload           7
	//   58  120:getfield        #82  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   59  123:iload           4
	//   60  125:iadd            
	//   61  126:istore          5
			int i1 = f != 0.0F;
	//   62  128:fload_2         
	//   63  129:fconst_0        
	//   64  130:fcmpl           
	//   65  131:istore          6
			if(i1 <= 0)
	//*  66  133:iload           6
	//*  67  135:ifgt            164
			{
				i = l;
	//   68  138:iload           5
	//   69  140:istore          4
				if(i1 != 0)
					break label0;
	//   70  142:iload           6
	//   71  144:ifne            176
				i = l;
	//   72  147:iload           5
	//   73  149:istore          4
				if(a.b <= 0.5F)
					break label0;
	//   74  151:aload_0         
	//   75  152:getfield        #13  <Field SlidingPaneLayout a>
	//   76  155:getfield        #37  <Field float SlidingPaneLayout.b>
	//   77  158:ldc1            #70  <Float 0.5F>
	//   78  160:fcmpl           
	//   79  161:ifle            176
			}
			i = l + a.c;
	//   80  164:iload           5
	//   81  166:aload_0         
	//   82  167:getfield        #13  <Field SlidingPaneLayout a>
	//   83  170:getfield        #72  <Field int SlidingPaneLayout.c>
	//   84  173:iadd            
	//   85  174:istore          4
		}
		a.e.a(i, view.getTop());
	//   86  176:aload_0         
	//   87  177:getfield        #13  <Field SlidingPaneLayout a>
	//   88  180:getfield        #29  <Field p SlidingPaneLayout.e>
	//   89  183:iload           4
	//   90  185:aload_1         
	//   91  186:invokevirtual   #24  <Method int View.getTop()>
	//   92  189:invokevirtual   #85  <Method boolean p.a(int, int)>
	//   93  192:pop             
		a.invalidate();
	//   94  193:aload_0         
	//   95  194:getfield        #13  <Field SlidingPaneLayout a>
	//   96  197:invokevirtual   #88  <Method void SlidingPaneLayout.invalidate()>
	//   97  200:return          
	}

	public void a(View view, int i, int j, int k, int l)
	{
		a.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SlidingPaneLayout a>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #91  <Method void SlidingPaneLayout.a(int)>
		a.invalidate();
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field SlidingPaneLayout a>
	//    6   12:invokevirtual   #88  <Method void SlidingPaneLayout.invalidate()>
	//    7   15:return          
	}

	public boolean a(View view, int i)
	{
		if(a.d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field SlidingPaneLayout a>
	//*   2    4:getfield        #94  <Field boolean SlidingPaneLayout.d>
	//*   3    7:ifeq            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		else
			return ((youtParams)view.getLayoutParams()).b;
	//    6   12:aload_1         
	//    7   13:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    8   16:checkcast       #59  <Class SlidingPaneLayout$LayoutParams>
	//    9   19:getfield        #96  <Field boolean SlidingPaneLayout$LayoutParams.b>
	//   10   22:ireturn         
	}

	public int b(View view)
	{
		return a.c;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SlidingPaneLayout a>
	//    2    4:getfield        #72  <Field int SlidingPaneLayout.c>
	//    3    7:ireturn         
	}

	public int b(View view, int i, int j)
	{
		view = ((View) ((youtParams)a.a.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SlidingPaneLayout a>
	//    2    4:getfield        #40  <Field View SlidingPaneLayout.a>
	//    3    7:invokevirtual   #57  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4   10:checkcast       #59  <Class SlidingPaneLayout$LayoutParams>
	//    5   13:astore_1        
		if(a.f())
	//*   6   14:aload_0         
	//*   7   15:getfield        #13  <Field SlidingPaneLayout a>
	//*   8   18:invokevirtual   #62  <Method boolean SlidingPaneLayout.f()>
	//*   9   21:ifeq            78
		{
			j = a.getWidth() - (a.getPaddingRight() + ((youtParams) (view)).rightMargin + a.a.getWidth());
	//   10   24:aload_0         
	//   11   25:getfield        #13  <Field SlidingPaneLayout a>
	//   12   28:invokevirtual   #76  <Method int SlidingPaneLayout.getWidth()>
	//   13   31:aload_0         
	//   14   32:getfield        #13  <Field SlidingPaneLayout a>
	//   15   35:invokevirtual   #65  <Method int SlidingPaneLayout.getPaddingRight()>
	//   16   38:aload_1         
	//   17   39:getfield        #69  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   18   42:iadd            
	//   19   43:aload_0         
	//   20   44:getfield        #13  <Field SlidingPaneLayout a>
	//   21   47:getfield        #40  <Field View SlidingPaneLayout.a>
	//   22   50:invokevirtual   #75  <Method int View.getWidth()>
	//   23   53:iadd            
	//   24   54:isub            
	//   25   55:istore_3        
			int k = a.c;
	//   26   56:aload_0         
	//   27   57:getfield        #13  <Field SlidingPaneLayout a>
	//   28   60:getfield        #72  <Field int SlidingPaneLayout.c>
	//   29   63:istore          4
			return Math.max(Math.min(i, j), j - k);
	//   30   65:iload_2         
	//   31   66:iload_3         
	//   32   67:invokestatic    #103 <Method int Math.min(int, int)>
	//   33   70:iload_3         
	//   34   71:iload           4
	//   35   73:isub            
	//   36   74:invokestatic    #106 <Method int Math.max(int, int)>
	//   37   77:ireturn         
		} else
		{
			j = a.getPaddingLeft() + ((youtParams) (view)).leftMargin;
	//   38   78:aload_0         
	//   39   79:getfield        #13  <Field SlidingPaneLayout a>
	//   40   82:invokevirtual   #79  <Method int SlidingPaneLayout.getPaddingLeft()>
	//   41   85:aload_1         
	//   42   86:getfield        #82  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   43   89:iadd            
	//   44   90:istore_3        
			int l = a.c;
	//   45   91:aload_0         
	//   46   92:getfield        #13  <Field SlidingPaneLayout a>
	//   47   95:getfield        #72  <Field int SlidingPaneLayout.c>
	//   48   98:istore          4
			return Math.min(Math.max(i, j), l + j);
	//   49  100:iload_2         
	//   50  101:iload_3         
	//   51  102:invokestatic    #106 <Method int Math.max(int, int)>
	//   52  105:iload           4
	//   53  107:iload_3         
	//   54  108:iadd            
	//   55  109:invokestatic    #103 <Method int Math.min(int, int)>
	//   56  112:ireturn         
		}
	}

	public void b(int i, int j)
	{
		a.e.a(a.a, j);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SlidingPaneLayout a>
	//    2    4:getfield        #29  <Field p SlidingPaneLayout.e>
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field SlidingPaneLayout a>
	//    5   11:getfield        #40  <Field View SlidingPaneLayout.a>
	//    6   14:iload_2         
	//    7   15:invokevirtual   #110 <Method void p.a(View, int)>
	//    8   18:return          
	}

	public void b(View view, int i)
	{
		a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field SlidingPaneLayout a>
	//    2    4:invokevirtual   #112 <Method void SlidingPaneLayout.a()>
	//    3    7:return          
	}

	final SlidingPaneLayout a;

	SlidingPaneLayout$c(SlidingPaneLayout slidingpanelayout)
	{
		a = slidingpanelayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field SlidingPaneLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void p$a()>
	//    5    9:return          
	}
}
