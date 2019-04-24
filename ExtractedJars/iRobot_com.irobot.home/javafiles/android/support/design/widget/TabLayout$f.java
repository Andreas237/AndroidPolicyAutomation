// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//			TabLayout

public static class TabLayout$f
	implements android.support.v4.view.ViewPager$e
{

	void a()
	{
		c = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #30  <Field int c>
		b = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #32  <Field int b>
	//    6   10:return          
	}

	public void a(int i)
	{
		b = c;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field int c>
	//    3    5:putfield        #32  <Field int b>
		c = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #30  <Field int c>
	//    7   13:return          
	}

	public void a(int i, float f1, int j)
	{
		TabLayout tablayout = (TabLayout)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference a>
	//    2    4:invokevirtual   #38  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class TabLayout>
	//    4   10:astore          6
		if(tablayout != null)
	//*   5   12:aload           6
	//*   6   14:ifnull          79
		{
			j = c;
	//    7   17:aload_0         
	//    8   18:getfield        #30  <Field int c>
	//    9   21:istore_3        
			boolean flag1 = false;
	//   10   22:iconst_0        
	//   11   23:istore          5
			boolean flag;
			if(j == 2 && b != 1)
	//*  12   25:iload_3         
	//*  13   26:iconst_2        
	//*  14   27:icmpne          47
	//*  15   30:aload_0         
	//*  16   31:getfield        #32  <Field int b>
	//*  17   34:iconst_1        
	//*  18   35:icmpne          41
	//*  19   38:goto            47
				flag = false;
	//   20   41:iconst_0        
	//   21   42:istore          4
			else
	//*  22   44:goto            50
				flag = true;
	//   23   47:iconst_1        
	//   24   48:istore          4
			if(c != 2 || b != 0)
	//*  25   50:aload_0         
	//*  26   51:getfield        #30  <Field int c>
	//*  27   54:iconst_2        
	//*  28   55:icmpne          65
	//*  29   58:aload_0         
	//*  30   59:getfield        #32  <Field int b>
	//*  31   62:ifeq            68
				flag1 = true;
	//   32   65:iconst_1        
	//   33   66:istore          5
			tablayout.a(i, f1, flag, flag1);
	//   34   68:aload           6
	//   35   70:iload_1         
	//   36   71:fload_2         
	//   37   72:iload           4
	//   38   74:iload           5
	//   39   76:invokevirtual   #41  <Method void TabLayout.a(int, float, boolean, boolean)>
		}
	//   40   79:return          
	}

	public void b(int i)
	{
		TabLayout tablayout = (TabLayout)a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field WeakReference a>
	//    2    4:invokevirtual   #38  <Method Object WeakReference.get()>
	//    3    7:checkcast       #8   <Class TabLayout>
	//    4   10:astore_3        
		if(tablayout != null && tablayout.getSelectedTabPosition() != i && i < tablayout.getTabCount())
	//*   5   11:aload_3         
	//*   6   12:ifnull          73
	//*   7   15:aload_3         
	//*   8   16:invokevirtual   #45  <Method int TabLayout.getSelectedTabPosition()>
	//*   9   19:iload_1         
	//*  10   20:icmpeq          73
	//*  11   23:iload_1         
	//*  12   24:aload_3         
	//*  13   25:invokevirtual   #48  <Method int TabLayout.getTabCount()>
	//*  14   28:icmpge          73
		{
			boolean flag;
			if(c != 0 && (c != 2 || b != 0))
	//*  15   31:aload_0         
	//*  16   32:getfield        #30  <Field int c>
	//*  17   35:ifeq            61
	//*  18   38:aload_0         
	//*  19   39:getfield        #30  <Field int c>
	//*  20   42:iconst_2        
	//*  21   43:icmpne          56
	//*  22   46:aload_0         
	//*  23   47:getfield        #32  <Field int b>
	//*  24   50:ifne            56
	//*  25   53:goto            61
				flag = false;
	//   26   56:iconst_0        
	//   27   57:istore_2        
			else
	//*  28   58:goto            63
				flag = true;
	//   29   61:iconst_1        
	//   30   62:istore_2        
			tablayout.b(tablayout.a(i), flag);
	//   31   63:aload_3         
	//   32   64:aload_3         
	//   33   65:iload_1         
	//   34   66:invokevirtual   #51  <Method TabLayout$e TabLayout.a(int)>
	//   35   69:iload_2         
	//   36   70:invokevirtual   #54  <Method void TabLayout.b(TabLayout$e, boolean)>
		}
	//   37   73:return          
	}

	private final WeakReference a;
	private int b;
	private int c;

	public TabLayout$f(TabLayout tablayout)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = new WeakReference(((Object) (tablayout)));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
	//    7   13:putfield        #27  <Field WeakReference a>
	//    8   16:return          
	}
}
