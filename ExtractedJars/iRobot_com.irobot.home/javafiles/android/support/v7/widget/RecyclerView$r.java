// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.util.SparseArray;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$r
{

	static int a(RecyclerView$r recyclerview$r, int i1)
	{
		recyclerview$r.p = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field int p>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	void a(int i1)
	{
		if((c & i1) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field int c>
	//*   2    4:iload_1         
	//*   3    5:iand            
	//*   4    6:ifne            64
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #60  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #61  <Method void StringBuilder()>
	//    8   16:astore_2        
			stringbuilder.append("Layout state should be one of ");
	//    9   17:aload_2         
	//   10   18:ldc1            #63  <String "Layout state should be one of ">
	//   11   20:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			stringbuilder.append(Integer.toBinaryString(i1));
	//   13   24:aload_2         
	//   14   25:iload_1         
	//   15   26:invokestatic    #73  <Method String Integer.toBinaryString(int)>
	//   16   29:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
			stringbuilder.append(" but it is ");
	//   18   33:aload_2         
	//   19   34:ldc1            #75  <String " but it is ">
	//   20   36:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			stringbuilder.append(Integer.toBinaryString(c));
	//   22   40:aload_2         
	//   23   41:aload_0         
	//   24   42:getfield        #41  <Field int c>
	//   25   45:invokestatic    #73  <Method String Integer.toBinaryString(int)>
	//   26   48:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   28   52:new             #77  <Class IllegalStateException>
	//   29   55:dup             
	//   30   56:aload_2         
	//   31   57:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   32   60:invokespecial   #84  <Method void IllegalStateException(String)>
	//   33   63:athrow          
		} else
		{
			return;
	//   34   64:return          
		}
	}

	void a(RecyclerView$a recyclerview$a)
	{
		c = 1;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #41  <Field int c>
		d = recyclerview$a.a();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #90  <Method int RecyclerView$a.a()>
	//    6   10:putfield        #43  <Field int d>
		f = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #47  <Field boolean f>
		g = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #49  <Field boolean g>
		h = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #51  <Field boolean h>
	//   16   28:return          
	}

	public boolean a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean f>
	//    2    4:ireturn         
	}

	public boolean b()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean j>
	//    2    4:ireturn         
	}

	public int c()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int p>
	//    2    4:ireturn         
	}

	public boolean d()
	{
		return p != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int p>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public int e()
	{
		if(f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field boolean f>
	//*   2    4:ifeq            17
			return a - b;
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field int a>
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field int b>
	//    7   15:isub            
	//    8   16:ireturn         
		else
			return d;
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field int d>
	//   11   21:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("State{mTargetPosition=");
	//    4    8:aload_1         
	//    5    9:ldc1            #93  <String "State{mTargetPosition=">
	//    6   11:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(p);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #35  <Field int p>
	//   11   20:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", mData=");
	//   13   24:aload_1         
	//   14   25:ldc1            #98  <String ", mData=">
	//   15   27:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (q)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #100 <Field SparseArray q>
	//   20   36:invokevirtual   #103 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(", mItemCount=");
	//   22   40:aload_1         
	//   23   41:ldc1            #105 <String ", mItemCount=">
	//   24   43:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(d);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #43  <Field int d>
	//   29   52:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(", mPreviousLayoutItemCount=");
	//   31   56:aload_1         
	//   32   57:ldc1            #107 <String ", mPreviousLayoutItemCount=">
	//   33   59:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(a);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #37  <Field int a>
	//   38   68:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
	//   40   72:aload_1         
	//   41   73:ldc1            #109 <String ", mDeletedInvisibleItemCountSincePreviousLayout=">
	//   42   75:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(b);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #39  <Field int b>
	//   47   84:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   48   87:pop             
		stringbuilder.append(", mStructureChanged=");
	//   49   88:aload_1         
	//   50   89:ldc1            #111 <String ", mStructureChanged=">
	//   51   91:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(e);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #45  <Field boolean e>
	//   56  100:invokevirtual   #114 <Method StringBuilder StringBuilder.append(boolean)>
	//   57  103:pop             
		stringbuilder.append(", mInPreLayout=");
	//   58  104:aload_1         
	//   59  105:ldc1            #116 <String ", mInPreLayout=">
	//   60  107:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   61  110:pop             
		stringbuilder.append(f);
	//   62  111:aload_1         
	//   63  112:aload_0         
	//   64  113:getfield        #47  <Field boolean f>
	//   65  116:invokevirtual   #114 <Method StringBuilder StringBuilder.append(boolean)>
	//   66  119:pop             
		stringbuilder.append(", mRunSimpleAnimations=");
	//   67  120:aload_1         
	//   68  121:ldc1            #118 <String ", mRunSimpleAnimations=">
	//   69  123:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   70  126:pop             
		stringbuilder.append(i);
	//   71  127:aload_1         
	//   72  128:aload_0         
	//   73  129:getfield        #53  <Field boolean i>
	//   74  132:invokevirtual   #114 <Method StringBuilder StringBuilder.append(boolean)>
	//   75  135:pop             
		stringbuilder.append(", mRunPredictiveAnimations=");
	//   76  136:aload_1         
	//   77  137:ldc1            #120 <String ", mRunPredictiveAnimations=">
	//   78  139:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   79  142:pop             
		stringbuilder.append(j);
	//   80  143:aload_1         
	//   81  144:aload_0         
	//   82  145:getfield        #55  <Field boolean j>
	//   83  148:invokevirtual   #114 <Method StringBuilder StringBuilder.append(boolean)>
	//   84  151:pop             
		stringbuilder.append('}');
	//   85  152:aload_1         
	//   86  153:bipush          125
	//   87  155:invokevirtual   #123 <Method StringBuilder StringBuilder.append(char)>
	//   88  158:pop             
		return stringbuilder.toString();
	//   89  159:aload_1         
	//   90  160:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   91  163:areturn         
	}

	int a;
	int b;
	int c;
	int d;
	boolean e;
	boolean f;
	boolean g;
	boolean h;
	boolean i;
	boolean j;
	int k;
	long l;
	int m;
	int n;
	int o;
	private int p;
	private SparseArray q;

	public RecyclerView$r()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		p = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #35  <Field int p>
		a = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #37  <Field int a>
		b = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #39  <Field int b>
		c = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #41  <Field int c>
		d = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #43  <Field int d>
		e = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #45  <Field boolean e>
		f = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #47  <Field boolean f>
		g = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #49  <Field boolean g>
		h = false;
	//   26   44:aload_0         
	//   27   45:iconst_0        
	//   28   46:putfield        #51  <Field boolean h>
		i = false;
	//   29   49:aload_0         
	//   30   50:iconst_0        
	//   31   51:putfield        #53  <Field boolean i>
		j = false;
	//   32   54:aload_0         
	//   33   55:iconst_0        
	//   34   56:putfield        #55  <Field boolean j>
	//   35   59:return          
	}
}
