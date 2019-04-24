// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import com.github.mikephil.charting.data.Entry;
import java.util.*;

// Referenced classes of package o:
//			mq, mh, mn, mz, 
//			nv, nw, lt

public class mi
	implements mq
{

	public mi(mn mn1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		d = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void ArrayList()>
	//    6   12:putfield        #23  <Field List d>
		c = mn1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #25  <Field mn c>
	//   10   20:return          
	}

	protected float a(List list, float f, lp.b b1)
	{
		float f1 = 3.402823E+38F;
	//    0    0:ldc1            #31  <Float 3.402823E+38F>
	//    1    2:fstore          4
		for(int i = 0; i < list.size();)
	//*   2    4:iconst_0        
	//*   3    5:istore          7
	//*   4    7:iload           7
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #37  <Method int List.size()>
	//*   7   15:icmpge          86
		{
			mh mh1 = (mh)list.get(i);
	//    8   18:aload_1         
	//    9   19:iload           7
	//   10   21:invokeinterface #41  <Method Object List.get(int)>
	//   11   26:checkcast       #43  <Class mh>
	//   12   29:astore          8
			float f2 = f1;
	//   13   31:fload           4
	//   14   33:fstore          5
			if(mh1.k() == b1)
	//*  15   35:aload           8
	//*  16   37:invokevirtual   #47  <Method lp$b mh.k()>
	//*  17   40:aload_3         
	//*  18   41:if_acmpne       73
			{
				float f3 = Math.abs(b(mh1) - f);
	//   19   44:aload_0         
	//   20   45:aload           8
	//   21   47:invokevirtual   #51  <Method float b(mh)>
	//   22   50:fload_2         
	//   23   51:fsub            
	//   24   52:invokestatic    #57  <Method float Math.abs(float)>
	//   25   55:fstore          6
				f2 = f1;
	//   26   57:fload           4
	//   27   59:fstore          5
				if(f3 < f1)
	//*  28   61:fload           6
	//*  29   63:fload           4
	//*  30   65:fcmpg           
	//*  31   66:ifge            73
					f2 = f3;
	//   32   69:fload           6
	//   33   71:fstore          5
			}
			i++;
	//   34   73:iload           7
	//   35   75:iconst_1        
	//   36   76:iadd            
	//   37   77:istore          7
			f1 = f2;
	//   38   79:fload           5
	//   39   81:fstore          4
		}

	//*  40   83:goto            7
		return f1;
	//   41   86:fload           4
	//   42   88:freturn         
	}

	protected mh a(float f, float f1, float f2)
	{
		List list = c(f, f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:invokevirtual   #62  <Method List c(float, float, float)>
	//    5    7:astore          5
		if(list.isEmpty())
	//*   6    9:aload           5
	//*   7   11:invokeinterface #66  <Method boolean List.isEmpty()>
	//*   8   16:ifeq            21
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		lp.b b1;
		if(a(list, f2, lp.b.b) < a(list, f2, lp.b.e))
	//*  11   21:aload_0         
	//*  12   22:aload           5
	//*  13   24:fload_3         
	//*  14   25:getstatic       #71  <Field lp$b lp$b.b>
	//*  15   28:invokevirtual   #73  <Method float a(List, float, lp$b)>
	//*  16   31:aload_0         
	//*  17   32:aload           5
	//*  18   34:fload_3         
	//*  19   35:getstatic       #76  <Field lp$b lp$b.e>
	//*  20   38:invokevirtual   #73  <Method float a(List, float, lp$b)>
	//*  21   41:fcmpg           
	//*  22   42:ifge            53
			b1 = lp.b.b;
	//   23   45:getstatic       #71  <Field lp$b lp$b.b>
	//   24   48:astore          4
		else
	//*  25   50:goto            58
			b1 = lp.b.e;
	//   26   53:getstatic       #76  <Field lp$b lp$b.e>
	//   27   56:astore          4
		return e(list, f1, f2, b1, c.getMaxHighlightDistance());
	//   28   58:aload_0         
	//   29   59:aload           5
	//   30   61:fload_2         
	//   31   62:fload_3         
	//   32   63:aload           4
	//   33   65:aload_0         
	//   34   66:getfield        #25  <Field mn c>
	//   35   69:invokeinterface #82  <Method float mn.getMaxHighlightDistance()>
	//   36   74:invokevirtual   #85  <Method mh e(List, float, float, lp$b, float)>
	//   37   77:areturn         
	}

	protected float b(mh mh1)
	{
		return mh1.e();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #87  <Method float mh.e()>
	//    2    4:freturn         
	}

	protected List b(mz mz1, int i, float f, mb.b b1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #20  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ArrayList()>
	//    3    7:astore          7
		List list = mz1.e(f);
	//    4    9:aload_1         
	//    5   10:fload_3         
	//    6   11:invokeinterface #93  <Method List mz.e(float)>
	//    7   16:astore          6
		Object obj = ((Object) (list));
	//    8   18:aload           6
	//    9   20:astore          5
		if(list.size() == 0)
	//*  10   22:aload           6
	//*  11   24:invokeinterface #37  <Method int List.size()>
	//*  12   29:ifne            67
		{
			b1 = ((mb.b) (mz1.c(f, (0.0F / 0.0F), b1)));
	//   13   32:aload_1         
	//   14   33:fload_3         
	//   15   34:ldc1            #94  <Float (0.0F / 0.0F)>
	//   16   36:aload           4
	//   17   38:invokeinterface #97  <Method Entry mz.c(float, float, mb$b)>
	//   18   43:astore          4
			obj = ((Object) (list));
	//   19   45:aload           6
	//   20   47:astore          5
			if(b1 != null)
	//*  21   49:aload           4
	//*  22   51:ifnull          67
				obj = ((Object) (mz1.e(((Entry) (b1)).getX())));
	//   23   54:aload_1         
	//   24   55:aload           4
	//   25   57:invokevirtual   #102 <Method float Entry.getX()>
	//   26   60:invokeinterface #93  <Method List mz.e(float)>
	//   27   65:astore          5
		}
		if(((List) (obj)).size() == 0)
	//*  28   67:aload           5
	//*  29   69:invokeinterface #37  <Method int List.size()>
	//*  30   74:ifne            80
			return ((List) (arraylist));
	//   31   77:aload           7
	//   32   79:areturn         
		nw nw1;
		for(b1 = ((mb.b) (((List) (obj)).iterator())); ((Iterator) (b1)).hasNext(); arraylist.add(((Object) (new mh(((Entry) (obj)).getX(), ((Entry) (obj)).getY(), (float)nw1.b, (float)nw1.c, i, mz1.D())))))
	//*  33   80:aload           5
	//*  34   82:invokeinterface #106 <Method Iterator List.iterator()>
	//*  35   87:astore          4
	//*  36   89:aload           4
	//*  37   91:invokeinterface #111 <Method boolean Iterator.hasNext()>
	//*  38   96:ifeq            186
		{
			obj = ((Object) ((Entry)((Iterator) (b1)).next()));
	//   39   99:aload           4
	//   40  101:invokeinterface #115 <Method Object Iterator.next()>
	//   41  106:checkcast       #99  <Class Entry>
	//   42  109:astore          5
			nw1 = c.b(mz1.D()).d(((Entry) (obj)).getX(), ((Entry) (obj)).getY());
	//   43  111:aload_0         
	//   44  112:getfield        #25  <Field mn c>
	//   45  115:aload_1         
	//   46  116:invokeinterface #118 <Method lp$b mz.D()>
	//   47  121:invokeinterface #121 <Method nv mn.b(lp$b)>
	//   48  126:aload           5
	//   49  128:invokevirtual   #102 <Method float Entry.getX()>
	//   50  131:aload           5
	//   51  133:invokevirtual   #124 <Method float Entry.getY()>
	//   52  136:invokevirtual   #129 <Method nw nv.d(float, float)>
	//   53  139:astore          6
		}

	//   54  141:aload           7
	//   55  143:new             #43  <Class mh>
	//   56  146:dup             
	//   57  147:aload           5
	//   58  149:invokevirtual   #102 <Method float Entry.getX()>
	//   59  152:aload           5
	//   60  154:invokevirtual   #124 <Method float Entry.getY()>
	//   61  157:aload           6
	//   62  159:getfield        #133 <Field double nw.b>
	//   63  162:d2f             
	//   64  163:aload           6
	//   65  165:getfield        #135 <Field double nw.c>
	//   66  168:d2f             
	//   67  169:iload_2         
	//   68  170:aload_1         
	//   69  171:invokeinterface #118 <Method lp$b mz.D()>
	//   70  176:invokespecial   #138 <Method void mh(float, float, float, float, int, lp$b)>
	//   71  179:invokevirtual   #142 <Method boolean ArrayList.add(Object)>
	//   72  182:pop             
	//*  73  183:goto            89
		return ((List) (arraylist));
	//   74  186:aload           7
	//   75  188:areturn         
	}

	protected nw b(float f, float f1)
	{
		return c.b(lp.b.b).b(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field mn c>
	//    2    4:getstatic       #71  <Field lp$b lp$b.b>
	//    3    7:invokeinterface #121 <Method nv mn.b(lp$b)>
	//    4   12:fload_1         
	//    5   13:fload_2         
	//    6   14:invokevirtual   #145 <Method nw nv.b(float, float)>
	//    7   17:areturn         
	}

	protected float c(float f, float f1, float f2, float f3)
	{
		return (float)Math.hypot(f - f2, f1 - f3);
	//    0    0:fload_1         
	//    1    1:fload_3         
	//    2    2:fsub            
	//    3    3:f2d             
	//    4    4:fload_2         
	//    5    5:fload           4
	//    6    7:fsub            
	//    7    8:f2d             
	//    8    9:invokestatic    #150 <Method double Math.hypot(double, double)>
	//    9   12:d2f             
	//   10   13:freturn         
	}

	protected List c(float f, float f1, float f2)
	{
		d.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List d>
	//    2    4:invokeinterface #153 <Method void List.clear()>
		lt lt1 = c();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #156 <Method lt c()>
	//    5   13:astore          6
		if(lt1 == null)
	//*   6   15:aload           6
	//*   7   17:ifnonnull       25
			return d;
	//    8   20:aload_0         
	//    9   21:getfield        #23  <Field List d>
	//   10   24:areturn         
		int i = 0;
	//   11   25:iconst_0        
	//   12   26:istore          4
		for(int j = lt1.e(); i < j; i++)
	//*  13   28:aload           6
	//*  14   30:invokevirtual   #160 <Method int lt.e()>
	//*  15   33:istore          5
	//*  16   35:iload           4
	//*  17   37:iload           5
	//*  18   39:icmpge          95
		{
			mz mz1 = lt1.a(i);
	//   19   42:aload           6
	//   20   44:iload           4
	//   21   46:invokevirtual   #163 <Method mz lt.a(int)>
	//   22   49:astore          7
			if(mz1.n())
	//*  23   51:aload           7
	//*  24   53:invokeinterface #166 <Method boolean mz.n()>
	//*  25   58:ifne            64
	//*  26   61:goto            86
				d.addAll(((java.util.Collection) (b(mz1, i, f, mb.b.d))));
	//   27   64:aload_0         
	//   28   65:getfield        #23  <Field List d>
	//   29   68:aload_0         
	//   30   69:aload           7
	//   31   71:iload           4
	//   32   73:fload_1         
	//   33   74:getstatic       #171 <Field mb$b mb$b.d>
	//   34   77:invokevirtual   #173 <Method List b(mz, int, float, mb$b)>
	//   35   80:invokeinterface #177 <Method boolean List.addAll(java.util.Collection)>
	//   36   85:pop             
		}

	//   37   86:iload           4
	//   38   88:iconst_1        
	//   39   89:iadd            
	//   40   90:istore          4
	//*  41   92:goto            35
		return d;
	//   42   95:aload_0         
	//   43   96:getfield        #23  <Field List d>
	//   44   99:areturn         
	}

	protected lt c()
	{
		return c.getData();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field mn c>
	//    2    4:invokeinterface #181 <Method lt mn.getData()>
	//    3    9:areturn         
	}

	public mh c(float f, float f1)
	{
		nw nw1 = b(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #183 <Method nw b(float, float)>
	//    4    6:astore          4
		float f2 = (float)nw1.b;
	//    5    8:aload           4
	//    6   10:getfield        #133 <Field double nw.b>
	//    7   13:d2f             
	//    8   14:fstore_3        
		nw.e(nw1);
	//    9   15:aload           4
	//   10   17:invokestatic    #186 <Method void nw.e(nw)>
		return a(f2, f, f1);
	//   11   20:aload_0         
	//   12   21:fload_3         
	//   13   22:fload_1         
	//   14   23:fload_2         
	//   15   24:invokevirtual   #188 <Method mh a(float, float, float)>
	//   16   27:areturn         
	}

	public mh e(List list, float f, float f1, lp.b b1, float f2)
	{
		mh mh1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          9
		for(int i = 0; i < list.size();)
	//*   2    3:iconst_0        
	//*   3    4:istore          8
	//*   4    6:iload           8
	//*   5    8:aload_1         
	//*   6    9:invokeinterface #37  <Method int List.size()>
	//*   7   14:icmpge          112
		{
			float f3;
			mh mh2;
label0:
			{
				mh mh3 = (mh)list.get(i);
	//    8   17:aload_1         
	//    9   18:iload           8
	//   10   20:invokeinterface #41  <Method Object List.get(int)>
	//   11   25:checkcast       #43  <Class mh>
	//   12   28:astore          11
				if(b1 != null)
	//*  13   30:aload           4
	//*  14   32:ifnull          53
				{
					mh2 = mh1;
	//   15   35:aload           9
	//   16   37:astore          10
					f3 = f2;
	//   17   39:fload           5
	//   18   41:fstore          6
					if(mh3.k() != b1)
						break label0;
	//   19   43:aload           11
	//   20   45:invokevirtual   #47  <Method lp$b mh.k()>
	//   21   48:aload           4
	//   22   50:if_acmpne       95
				}
				float f4 = c(f, f1, mh3.c(), mh3.e());
	//   23   53:aload_0         
	//   24   54:fload_2         
	//   25   55:fload_3         
	//   26   56:aload           11
	//   27   58:invokevirtual   #190 <Method float mh.c()>
	//   28   61:aload           11
	//   29   63:invokevirtual   #87  <Method float mh.e()>
	//   30   66:invokevirtual   #192 <Method float c(float, float, float, float)>
	//   31   69:fstore          7
				mh2 = mh1;
	//   32   71:aload           9
	//   33   73:astore          10
				f3 = f2;
	//   34   75:fload           5
	//   35   77:fstore          6
				if(f4 < f2)
	//*  36   79:fload           7
	//*  37   81:fload           5
	//*  38   83:fcmpg           
	//*  39   84:ifge            95
				{
					mh2 = mh3;
	//   40   87:aload           11
	//   41   89:astore          10
					f3 = f4;
	//   42   91:fload           7
	//   43   93:fstore          6
				}
			}
			i++;
	//   44   95:iload           8
	//   45   97:iconst_1        
	//   46   98:iadd            
	//   47   99:istore          8
			mh1 = mh2;
	//   48  101:aload           10
	//   49  103:astore          9
			f2 = f3;
	//   50  105:fload           6
	//   51  107:fstore          5
		}

	//*  52  109:goto            6
		return mh1;
	//   53  112:aload           9
	//   54  114:areturn         
	}

	protected mn c;
	protected List d;
}
