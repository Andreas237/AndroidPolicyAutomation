// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			fo

class fo$1
	implements Runnable
{

	public void run()
	{
		int i = a.getScrollY();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field fo a>
	//    2    4:invokevirtual   #29  <Method int fo.getScrollY()>
	//    3    7:istore_1        
		if(fo.a(a) - i == 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #20  <Field fo a>
	//*   6   12:invokestatic    #32  <Method int fo.a(fo)>
	//*   7   15:iload_1         
	//*   8   16:isub            
	//*   9   17:ifne            146
		{
			if(fo.b(a) == 0)
	//*  10   20:aload_0         
	//*  11   21:getfield        #20  <Field fo a>
	//*  12   24:invokestatic    #35  <Method int fo.b(fo)>
	//*  13   27:ifne            31
				return;
	//   14   30:return          
			int j = fo.a(a) % fo.b(a);
	//   15   31:aload_0         
	//   16   32:getfield        #20  <Field fo a>
	//   17   35:invokestatic    #32  <Method int fo.a(fo)>
	//   18   38:aload_0         
	//   19   39:getfield        #20  <Field fo a>
	//   20   42:invokestatic    #35  <Method int fo.b(fo)>
	//   21   45:irem            
	//   22   46:istore_1        
			int k = fo.a(a) / fo.b(a);
	//   23   47:aload_0         
	//   24   48:getfield        #20  <Field fo a>
	//   25   51:invokestatic    #32  <Method int fo.a(fo)>
	//   26   54:aload_0         
	//   27   55:getfield        #20  <Field fo a>
	//   28   58:invokestatic    #35  <Method int fo.b(fo)>
	//   29   61:idiv            
	//   30   62:istore_2        
			if(j == 0)
	//*  31   63:iload_1         
	//*  32   64:ifne            93
			{
				a.b = fo.c(a) + k;
	//   33   67:aload_0         
	//   34   68:getfield        #20  <Field fo a>
	//   35   71:aload_0         
	//   36   72:getfield        #20  <Field fo a>
	//   37   75:invokestatic    #38  <Method int fo.c(fo)>
	//   38   78:iload_2         
	//   39   79:iadd            
	//   40   80:putfield        #41  <Field int fo.b>
				fo.d(a);
	//   41   83:aload_0         
	//   42   84:getfield        #20  <Field fo a>
	//   43   87:invokestatic    #44  <Method void fo.d(fo)>
			} else
	//*  44   90:goto            145
			if(j > fo.b(a) / 2)
	//*  45   93:iload_1         
	//*  46   94:aload_0         
	//*  47   95:getfield        #20  <Field fo a>
	//*  48   98:invokestatic    #35  <Method int fo.b(fo)>
	//*  49  101:iconst_2        
	//*  50  102:idiv            
	//*  51  103:icmple          127
				a.post(new Runnable(j, k) {

					public void run()
					{
						c.a.smoothScrollTo(0, (fo.a(c.a) - a) + fo.b(c.a));
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field fo$1 c>
					//    2    4:getfield        #30  <Field fo fo$1.a>
					//    3    7:iconst_0        
					//    4    8:aload_0         
					//    5    9:getfield        #20  <Field fo$1 c>
					//    6   12:getfield        #30  <Field fo fo$1.a>
					//    7   15:invokestatic    #35  <Method int fo.a(fo)>
					//    8   18:aload_0         
					//    9   19:getfield        #22  <Field int a>
					//   10   22:isub            
					//   11   23:aload_0         
					//   12   24:getfield        #20  <Field fo$1 c>
					//   13   27:getfield        #30  <Field fo fo$1.a>
					//   14   30:invokestatic    #37  <Method int fo.b(fo)>
					//   15   33:iadd            
					//   16   34:invokevirtual   #41  <Method void fo.smoothScrollTo(int, int)>
						c.a.b = b + fo.c(c.a) + 1;
					//   17   37:aload_0         
					//   18   38:getfield        #20  <Field fo$1 c>
					//   19   41:getfield        #30  <Field fo fo$1.a>
					//   20   44:aload_0         
					//   21   45:getfield        #24  <Field int b>
					//   22   48:aload_0         
					//   23   49:getfield        #20  <Field fo$1 c>
					//   24   52:getfield        #30  <Field fo fo$1.a>
					//   25   55:invokestatic    #43  <Method int fo.c(fo)>
					//   26   58:iadd            
					//   27   59:iconst_1        
					//   28   60:iadd            
					//   29   61:putfield        #44  <Field int fo.b>
						fo.d(c.a);
					//   30   64:aload_0         
					//   31   65:getfield        #20  <Field fo$1 c>
					//   32   68:getfield        #30  <Field fo fo$1.a>
					//   33   71:invokestatic    #48  <Method void fo.d(fo)>
					//   34   74:return          
					}

					final int a;
					final int b;
					final fo._cls1 c;

			
			{
				c = fo._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field fo$1 c>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int a>
				b = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   52  106:aload_0         
	//   53  107:getfield        #20  <Field fo a>
	//   54  110:new             #13  <Class fo$1$1>
	//   55  113:dup             
	//   56  114:aload_0         
	//   57  115:iload_1         
	//   58  116:iload_2         
	//   59  117:invokespecial   #47  <Method void fo$1$1(fo$1, int, int)>
	//   60  120:invokevirtual   #51  <Method boolean fo.post(Runnable)>
	//   61  123:pop             
			else
	//*  62  124:goto            145
				a.post(new Runnable(j, k) {

					public void run()
					{
						c.a.smoothScrollTo(0, fo.a(c.a) - a);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field fo$1 c>
					//    2    4:getfield        #30  <Field fo fo$1.a>
					//    3    7:iconst_0        
					//    4    8:aload_0         
					//    5    9:getfield        #20  <Field fo$1 c>
					//    6   12:getfield        #30  <Field fo fo$1.a>
					//    7   15:invokestatic    #35  <Method int fo.a(fo)>
					//    8   18:aload_0         
					//    9   19:getfield        #22  <Field int a>
					//   10   22:isub            
					//   11   23:invokevirtual   #39  <Method void fo.smoothScrollTo(int, int)>
						c.a.b = b + fo.c(c.a);
					//   12   26:aload_0         
					//   13   27:getfield        #20  <Field fo$1 c>
					//   14   30:getfield        #30  <Field fo fo$1.a>
					//   15   33:aload_0         
					//   16   34:getfield        #24  <Field int b>
					//   17   37:aload_0         
					//   18   38:getfield        #20  <Field fo$1 c>
					//   19   41:getfield        #30  <Field fo fo$1.a>
					//   20   44:invokestatic    #41  <Method int fo.c(fo)>
					//   21   47:iadd            
					//   22   48:putfield        #42  <Field int fo.b>
						fo.d(c.a);
					//   23   51:aload_0         
					//   24   52:getfield        #20  <Field fo$1 c>
					//   25   55:getfield        #30  <Field fo fo$1.a>
					//   26   58:invokestatic    #46  <Method void fo.d(fo)>
					//   27   61:return          
					}

					final int a;
					final int b;
					final fo._cls1 c;

			
			{
				c = fo._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field fo$1 c>
				a = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int a>
				b = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #24  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void Object()>
			//   11   19:return          
			}
				}
);
	//   63  127:aload_0         
	//   64  128:getfield        #20  <Field fo a>
	//   65  131:new             #15  <Class fo$1$2>
	//   66  134:dup             
	//   67  135:aload_0         
	//   68  136:iload_1         
	//   69  137:iload_2         
	//   70  138:invokespecial   #52  <Method void fo$1$2(fo$1, int, int)>
	//   71  141:invokevirtual   #51  <Method boolean fo.post(Runnable)>
	//   72  144:pop             
			return;
	//   73  145:return          
		} else
		{
			fo.a(a, a.getScrollY());
	//   74  146:aload_0         
	//   75  147:getfield        #20  <Field fo a>
	//   76  150:aload_0         
	//   77  151:getfield        #20  <Field fo a>
	//   78  154:invokevirtual   #29  <Method int fo.getScrollY()>
	//   79  157:invokestatic    #55  <Method int fo.a(fo, int)>
	//   80  160:pop             
			a.postDelayed(fo.e(a), fo.f(a));
	//   81  161:aload_0         
	//   82  162:getfield        #20  <Field fo a>
	//   83  165:aload_0         
	//   84  166:getfield        #20  <Field fo a>
	//   85  169:invokestatic    #59  <Method Runnable fo.e(fo)>
	//   86  172:aload_0         
	//   87  173:getfield        #20  <Field fo a>
	//   88  176:invokestatic    #62  <Method int fo.f(fo)>
	//   89  179:i2l             
	//   90  180:invokevirtual   #66  <Method boolean fo.postDelayed(Runnable, long)>
	//   91  183:pop             
			return;
	//   92  184:return          
		}
	}

	final fo a;

	fo$1(fo fo1)
	{
		a = fo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field fo a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:return          
	}
}
