// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			nk, la, mn, mv

protected class nk$d
{

	public void b(mn mn1, mv mv1)
	{
		float f = Math.max(0.0F, Math.min(1.0F, b.i.b()));
	//    0    0:fconst_0        
	//    1    1:fconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field nk b>
	//    4    6:getfield        #25  <Field la nk.i>
	//    5    9:invokevirtual   #30  <Method float la.b()>
	//    6   12:invokestatic    #36  <Method float Math.min(float, float)>
	//    7   15:invokestatic    #39  <Method float Math.max(float, float)>
	//    8   18:fstore_3        
		float f1 = mn1.getLowestVisibleX();
	//    9   19:aload_1         
	//   10   20:invokeinterface #44  <Method float mn.getLowestVisibleX()>
	//   11   25:fstore          4
		float f2 = mn1.getHighestVisibleX();
	//   12   27:aload_1         
	//   13   28:invokeinterface #47  <Method float mn.getHighestVisibleX()>
	//   14   33:fstore          5
		mn1 = ((mn) (mv1.c(f1, (0.0F / 0.0F), mb$b.b)));
	//   15   35:aload_2         
	//   16   36:fload           4
	//   17   38:ldc1            #48  <Float (0.0F / 0.0F)>
	//   18   40:getstatic       #53  <Field mb$b mb$b.b>
	//   19   43:invokeinterface #58  <Method com.github.mikephil.charting.data.Entry mv.c(float, float, mb$b)>
	//   20   48:astore_1        
		com.github.mikephil.charting.data.Entry entry = mv1.c(f2, (0.0F / 0.0F), mb$b.c);
	//   21   49:aload_2         
	//   22   50:fload           5
	//   23   52:ldc1            #48  <Float (0.0F / 0.0F)>
	//   24   54:getstatic       #60  <Field mb$b mb$b.c>
	//   25   57:invokeinterface #58  <Method com.github.mikephil.charting.data.Entry mv.c(float, float, mb$b)>
	//   26   62:astore          7
		int i;
		if(mn1 == null)
	//*  27   64:aload_1         
	//*  28   65:ifnonnull       74
			i = 0;
	//   29   68:iconst_0        
	//   30   69:istore          6
		else
	//*  31   71:goto            83
			i = mv1.b(((com.github.mikephil.charting.data.Entry) (mn1)));
	//   32   74:aload_2         
	//   33   75:aload_1         
	//   34   76:invokeinterface #63  <Method int mv.b(com.github.mikephil.charting.data.Entry)>
	//   35   81:istore          6
		c = i;
	//   36   83:aload_0         
	//   37   84:iload           6
	//   38   86:putfield        #65  <Field int c>
		if(entry == null)
	//*  39   89:aload           7
	//*  40   91:ifnonnull       100
			i = 0;
	//   41   94:iconst_0        
	//   42   95:istore          6
		else
	//*  43   97:goto            110
			i = mv1.b(entry);
	//   44  100:aload_2         
	//   45  101:aload           7
	//   46  103:invokeinterface #63  <Method int mv.b(com.github.mikephil.charting.data.Entry)>
	//   47  108:istore          6
		d = i;
	//   48  110:aload_0         
	//   49  111:iload           6
	//   50  113:putfield        #67  <Field int d>
		a = (int)((float)(d - c) * f);
	//   51  116:aload_0         
	//   52  117:aload_0         
	//   53  118:getfield        #67  <Field int d>
	//   54  121:aload_0         
	//   55  122:getfield        #65  <Field int c>
	//   56  125:isub            
	//   57  126:i2f             
	//   58  127:fload_3         
	//   59  128:fmul            
	//   60  129:f2i             
	//   61  130:putfield        #69  <Field int a>
	//   62  133:return          
	}

	public int a;
	final nk b;
	public int c;
	public int d;

	protected nk$d(nk nk1)
	{
		b = nk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field nk b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
