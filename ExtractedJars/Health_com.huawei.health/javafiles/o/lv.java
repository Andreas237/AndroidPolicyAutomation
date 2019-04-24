// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.Color;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import java.util.List;

// Referenced classes of package o:
//			lw, mt

public class lv extends lw
	implements mt
{

	public lv(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void lw(List, String)>
		t = 1;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #23  <Field int t>
		u = Color.rgb(215, 215, 215);
	//    7   11:aload_0         
	//    8   12:sipush          215
	//    9   15:sipush          215
	//   10   18:sipush          215
	//   11   21:invokestatic    #29  <Method int Color.rgb(int, int, int)>
	//   12   24:putfield        #31  <Field int u>
		q = 0.0F;
	//   13   27:aload_0         
	//   14   28:fconst_0        
	//   15   29:putfield        #33  <Field float q>
		w = 0xff000000;
	//   16   32:aload_0         
	//   17   33:ldc1            #34  <Int 0xff000000>
	//   18   35:putfield        #36  <Field int w>
		x = 120;
	//   19   38:aload_0         
	//   20   39:bipush          120
	//   21   41:putfield        #38  <Field int x>
		v = 0;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #40  <Field int v>
	//   25   49:aload_0         
	//   26   50:iconst_1        
	//   27   51:anewarray       String[]
	//   28   54:dup             
	//   29   55:iconst_0        
	//   30   56:ldc1            #44  <String "Stack">
	//   31   58:aastore         
	//   32   59:putfield        #46  <Field String[] y>
		e = Color.rgb(0, 0, 0);
	//   33   62:aload_0         
	//   34   63:iconst_0        
	//   35   64:iconst_0        
	//   36   65:iconst_0        
	//   37   66:invokestatic    #29  <Method int Color.rgb(int, int, int)>
	//   38   69:putfield        #49  <Field int e>
		c(list);
	//   39   72:aload_0         
	//   40   73:aload_1         
	//   41   74:invokespecial   #53  <Method void c(List)>
		e(list);
	//   42   77:aload_0         
	//   43   78:aload_1         
	//   44   79:invokespecial   #55  <Method void e(List)>
	//   45   82:return          
	}

	private void c(List list)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #64  <Method int List.size()>
	//*   5    9:icmpge          52
		{
			float af[] = ((BarEntry)list.get(i)).getYVals();
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokeinterface #68  <Method Object List.get(int)>
	//    9   19:checkcast       #70  <Class BarEntry>
	//   10   22:invokevirtual   #74  <Method float[] BarEntry.getYVals()>
	//   11   25:astore_3        
			if(af != null && af.length > t)
	//*  12   26:aload_3         
	//*  13   27:ifnull          45
	//*  14   30:aload_3         
	//*  15   31:arraylength     
	//*  16   32:aload_0         
	//*  17   33:getfield        #23  <Field int t>
	//*  18   36:icmple          45
				t = af.length;
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:arraylength     
	//   22   42:putfield        #23  <Field int t>
		}

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_2        
	//*  27   49:goto            2
	//   28   52:return          
	}

	private void e(List list)
	{
		v = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #40  <Field int v>
		for(int i = 0; i < list.size(); i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_1         
	//*   7    9:invokeinterface #64  <Method int List.size()>
	//*   8   14:icmpge          66
		{
			float af[] = ((BarEntry)list.get(i)).getYVals();
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokeinterface #68  <Method Object List.get(int)>
	//   12   24:checkcast       #70  <Class BarEntry>
	//   13   27:invokevirtual   #74  <Method float[] BarEntry.getYVals()>
	//   14   30:astore_3        
			if(af == null)
	//*  15   31:aload_3         
	//*  16   32:ifnonnull       48
				v = v + 1;
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #40  <Field int v>
	//   20   40:iconst_1        
	//   21   41:iadd            
	//   22   42:putfield        #40  <Field int v>
			else
	//*  23   45:goto            59
				v = v + af.length;
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getfield        #40  <Field int v>
	//   27   53:aload_3         
	//   28   54:arraylength     
	//   29   55:iadd            
	//   30   56:putfield        #40  <Field int v>
		}

	//   31   59:iload_2         
	//   32   60:iconst_1        
	//   33   61:iadd            
	//   34   62:istore_2        
	//*  35   63:goto            7
	//   36   66:return          
	}

	protected void a(BarEntry barentry)
	{
		if(barentry != null && !Float.isNaN(barentry.getY()))
	//*   0    0:aload_1         
	//*   1    1:ifnull          111
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #81  <Method float BarEntry.getY()>
	//*   4    8:invokestatic    #87  <Method boolean Float.isNaN(float)>
	//*   5   11:ifne            111
		{
			if(barentry.getYVals() == null)
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #74  <Method float[] BarEntry.getYVals()>
	//*   8   18:ifnonnull       64
			{
				if(barentry.getY() < m)
	//*   9   21:aload_1         
	//*  10   22:invokevirtual   #81  <Method float BarEntry.getY()>
	//*  11   25:aload_0         
	//*  12   26:getfield        #90  <Field float m>
	//*  13   29:fcmpg           
	//*  14   30:ifge            41
					m = barentry.getY();
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokevirtual   #81  <Method float BarEntry.getY()>
	//   18   38:putfield        #90  <Field float m>
				if(barentry.getY() > p)
	//*  19   41:aload_1         
	//*  20   42:invokevirtual   #81  <Method float BarEntry.getY()>
	//*  21   45:aload_0         
	//*  22   46:getfield        #93  <Field float p>
	//*  23   49:fcmpl           
	//*  24   50:ifle            106
					p = barentry.getY();
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokevirtual   #81  <Method float BarEntry.getY()>
	//   28   58:putfield        #93  <Field float p>
			} else
	//*  29   61:goto            106
			{
				if(-barentry.getNegativeSum() < m)
	//*  30   64:aload_1         
	//*  31   65:invokevirtual   #96  <Method float BarEntry.getNegativeSum()>
	//*  32   68:fneg            
	//*  33   69:aload_0         
	//*  34   70:getfield        #90  <Field float m>
	//*  35   73:fcmpg           
	//*  36   74:ifge            86
					m = -barentry.getNegativeSum();
	//   37   77:aload_0         
	//   38   78:aload_1         
	//   39   79:invokevirtual   #96  <Method float BarEntry.getNegativeSum()>
	//   40   82:fneg            
	//   41   83:putfield        #90  <Field float m>
				if(barentry.getPositiveSum() > p)
	//*  42   86:aload_1         
	//*  43   87:invokevirtual   #99  <Method float BarEntry.getPositiveSum()>
	//*  44   90:aload_0         
	//*  45   91:getfield        #93  <Field float p>
	//*  46   94:fcmpl           
	//*  47   95:ifle            106
					p = barentry.getPositiveSum();
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:invokevirtual   #99  <Method float BarEntry.getPositiveSum()>
	//   51  103:putfield        #93  <Field float p>
			}
			d(((Entry) (barentry)));
	//   52  106:aload_0         
	//   53  107:aload_1         
	//   54  108:invokevirtual   #103 <Method void d(Entry)>
		}
	//   55  111:return          
	}

	public boolean a()
	{
		return t > 1;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int t>
	//    2    4:iconst_1        
	//    3    5:icmple          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public int b()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int u>
	//    2    4:ireturn         
	}

	public float c()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float q>
	//    2    4:freturn         
	}

	public void c(float f)
	{
		q = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #33  <Field float q>
	//    3    5:return          
	}

	public int d()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int t>
	//    2    4:ireturn         
	}

	public int e()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int w>
	//    2    4:ireturn         
	}

	protected void e(Entry entry)
	{
		a((BarEntry)entry);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #70  <Class BarEntry>
	//    3    5:invokevirtual   #108 <Method void a(BarEntry)>
	//    4    8:return          
	}

	public String[] g()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String[] y>
	//    2    4:areturn         
	}

	public int h()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int x>
	//    2    4:ireturn         
	}

	private float q;
	private int t;
	private int u;
	private int v;
	private int w;
	private int x;
	private String y[] = {
		"Stack"
	};
}
