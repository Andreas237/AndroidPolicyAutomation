// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.view.s;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeTransform

private static class ChangeTransform$c
{

	public void a(View view)
	{
		ChangeTransform.a(view, a, b, c, d, e, f, g, h);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field float a>
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field float b>
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field float c>
	//    7   13:aload_0         
	//    8   14:getfield        #46  <Field float d>
	//    9   17:aload_0         
	//   10   18:getfield        #51  <Field float e>
	//   11   21:aload_0         
	//   12   22:getfield        #56  <Field float f>
	//   13   25:aload_0         
	//   14   26:getfield        #61  <Field float g>
	//   15   29:aload_0         
	//   16   30:getfield        #66  <Field float h>
	//   17   33:invokestatic    #70  <Method void ChangeTransform.a(View, float, float, float, float, float, float, float, float)>
	//   18   36:return          
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof ChangeTransform$c;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ChangeTransform$c>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((ChangeTransform$c)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class ChangeTransform$c>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(((ChangeTransform$c) (obj)).a == a)
	//*  14   20:aload_1         
	//*  15   21:getfield        #28  <Field float a>
	//*  16   24:aload_0         
	//*  17   25:getfield        #28  <Field float a>
	//*  18   28:fcmpl           
	//*  19   29:ifne            132
		{
			flag = flag1;
	//   20   32:iload_3         
	//   21   33:istore_2        
			if(((ChangeTransform$c) (obj)).b == b)
	//*  22   34:aload_1         
	//*  23   35:getfield        #33  <Field float b>
	//*  24   38:aload_0         
	//*  25   39:getfield        #33  <Field float b>
	//*  26   42:fcmpl           
	//*  27   43:ifne            132
			{
				flag = flag1;
	//   28   46:iload_3         
	//   29   47:istore_2        
				if(((ChangeTransform$c) (obj)).c == c)
	//*  30   48:aload_1         
	//*  31   49:getfield        #41  <Field float c>
	//*  32   52:aload_0         
	//*  33   53:getfield        #41  <Field float c>
	//*  34   56:fcmpl           
	//*  35   57:ifne            132
				{
					flag = flag1;
	//   36   60:iload_3         
	//   37   61:istore_2        
					if(((ChangeTransform$c) (obj)).d == d)
	//*  38   62:aload_1         
	//*  39   63:getfield        #46  <Field float d>
	//*  40   66:aload_0         
	//*  41   67:getfield        #46  <Field float d>
	//*  42   70:fcmpl           
	//*  43   71:ifne            132
					{
						flag = flag1;
	//   44   74:iload_3         
	//   45   75:istore_2        
						if(((ChangeTransform$c) (obj)).e == e)
	//*  46   76:aload_1         
	//*  47   77:getfield        #51  <Field float e>
	//*  48   80:aload_0         
	//*  49   81:getfield        #51  <Field float e>
	//*  50   84:fcmpl           
	//*  51   85:ifne            132
						{
							flag = flag1;
	//   52   88:iload_3         
	//   53   89:istore_2        
							if(((ChangeTransform$c) (obj)).f == f)
	//*  54   90:aload_1         
	//*  55   91:getfield        #56  <Field float f>
	//*  56   94:aload_0         
	//*  57   95:getfield        #56  <Field float f>
	//*  58   98:fcmpl           
	//*  59   99:ifne            132
							{
								flag = flag1;
	//   60  102:iload_3         
	//   61  103:istore_2        
								if(((ChangeTransform$c) (obj)).g == g)
	//*  62  104:aload_1         
	//*  63  105:getfield        #61  <Field float g>
	//*  64  108:aload_0         
	//*  65  109:getfield        #61  <Field float g>
	//*  66  112:fcmpl           
	//*  67  113:ifne            132
								{
									flag = flag1;
	//   68  116:iload_3         
	//   69  117:istore_2        
									if(((ChangeTransform$c) (obj)).h == h)
	//*  70  118:aload_1         
	//*  71  119:getfield        #66  <Field float h>
	//*  72  122:aload_0         
	//*  73  123:getfield        #66  <Field float h>
	//*  74  126:fcmpl           
	//*  75  127:ifne            132
										flag = true;
	//   76  130:iconst_1        
	//   77  131:istore_2        
								}
							}
						}
					}
				}
			}
		}
		return flag;
	//   78  132:iload_2         
	//   79  133:ireturn         
	}

	public int hashCode()
	{
		float f1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field float a>
	//    2    4:fstore_1        
		int l1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore          9
		int i;
		if(f1 != 0.0F)
	//*   5    8:fload_1         
	//*   6    9:fconst_0        
	//*   7   10:fcmpl           
	//*   8   11:ifeq            25
			i = Float.floatToIntBits(a);
	//    9   14:aload_0         
	//   10   15:getfield        #28  <Field float a>
	//   11   18:invokestatic    #80  <Method int Float.floatToIntBits(float)>
	//   12   21:istore_2        
		else
	//*  13   22:goto            27
			i = 0;
	//   14   25:iconst_0        
	//   15   26:istore_2        
		int j;
		if(b != 0.0F)
	//*  16   27:aload_0         
	//*  17   28:getfield        #33  <Field float b>
	//*  18   31:fconst_0        
	//*  19   32:fcmpl           
	//*  20   33:ifeq            47
			j = Float.floatToIntBits(b);
	//   21   36:aload_0         
	//   22   37:getfield        #33  <Field float b>
	//   23   40:invokestatic    #80  <Method int Float.floatToIntBits(float)>
	//   24   43:istore_3        
		else
	//*  25   44:goto            49
			j = 0;
	//   26   47:iconst_0        
	//   27   48:istore_3        
		int k;
		if(c != 0.0F)
	//*  28   49:aload_0         
	//*  29   50:getfield        #41  <Field float c>
	//*  30   53:fconst_0        
	//*  31   54:fcmpl           
	//*  32   55:ifeq            70
			k = Float.floatToIntBits(c);
	//   33   58:aload_0         
	//   34   59:getfield        #41  <Field float c>
	//   35   62:invokestatic    #80  <Method int Float.floatToIntBits(float)>
	//   36   65:istore          4
		else
	//*  37   67:goto            73
			k = 0;
	//   38   70:iconst_0        
	//   39   71:istore          4
		int l;
		if(d != 0.0F)
	//*  40   73:aload_0         
	//*  41   74:getfield        #46  <Field float d>
	//*  42   77:fconst_0        
	//*  43   78:fcmpl           
	//*  44   79:ifeq            94
			l = Float.floatToIntBits(d);
	//   45   82:aload_0         
	//   46   83:getfield        #46  <Field float d>
	//   47   86:invokestatic    #80  <Method int Float.floatToIntBits(float)>
	//   48   89:istore          5
		else
	//*  49   91:goto            97
			l = 0;
	//   50   94:iconst_0        
	//   51   95:istore          5
		int i1;
		if(e != 0.0F)
	//*  52   97:aload_0         
	//*  53   98:getfield        #51  <Field float e>
	//*  54  101:fconst_0        
	//*  55  102:fcmpl           
	//*  56  103:ifeq            118
			i1 = Float.floatToIntBits(e);
	//   57  106:aload_0         
	//   58  107:getfield        #51  <Field float e>
	//   59  110:invokestatic    #80  <Method int Float.floatToIntBits(float)>
	//   60  113:istore          6
		else
	//*  61  115:goto            121
			i1 = 0;
	//   62  118:iconst_0        
	//   63  119:istore          6
		int j1;
		if(f != 0.0F)
	//*  64  121:aload_0         
	//*  65  122:getfield        #56  <Field float f>
	//*  66  125:fconst_0        
	//*  67  126:fcmpl           
	//*  68  127:ifeq            142
			j1 = Float.floatToIntBits(f);
	//   69  130:aload_0         
	//   70  131:getfield        #56  <Field float f>
	//   71  134:invokestatic    #80  <Method int Float.floatToIntBits(float)>
	//   72  137:istore          7
		else
	//*  73  139:goto            145
			j1 = 0;
	//   74  142:iconst_0        
	//   75  143:istore          7
		int k1;
		if(g != 0.0F)
	//*  76  145:aload_0         
	//*  77  146:getfield        #61  <Field float g>
	//*  78  149:fconst_0        
	//*  79  150:fcmpl           
	//*  80  151:ifeq            166
			k1 = Float.floatToIntBits(g);
	//   81  154:aload_0         
	//   82  155:getfield        #61  <Field float g>
	//   83  158:invokestatic    #80  <Method int Float.floatToIntBits(float)>
	//   84  161:istore          8
		else
	//*  85  163:goto            169
			k1 = 0;
	//   86  166:iconst_0        
	//   87  167:istore          8
		if(h != 0.0F)
	//*  88  169:aload_0         
	//*  89  170:getfield        #66  <Field float h>
	//*  90  173:fconst_0        
	//*  91  174:fcmpl           
	//*  92  175:ifeq            187
			l1 = Float.floatToIntBits(h);
	//   93  178:aload_0         
	//   94  179:getfield        #66  <Field float h>
	//   95  182:invokestatic    #80  <Method int Float.floatToIntBits(float)>
	//   96  185:istore          9
		return ((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1;
	//   97  187:iload_2         
	//   98  188:bipush          31
	//   99  190:imul            
	//  100  191:iload_3         
	//  101  192:iadd            
	//  102  193:bipush          31
	//  103  195:imul            
	//  104  196:iload           4
	//  105  198:iadd            
	//  106  199:bipush          31
	//  107  201:imul            
	//  108  202:iload           5
	//  109  204:iadd            
	//  110  205:bipush          31
	//  111  207:imul            
	//  112  208:iload           6
	//  113  210:iadd            
	//  114  211:bipush          31
	//  115  213:imul            
	//  116  214:iload           7
	//  117  216:iadd            
	//  118  217:bipush          31
	//  119  219:imul            
	//  120  220:iload           8
	//  121  222:iadd            
	//  122  223:bipush          31
	//  123  225:imul            
	//  124  226:iload           9
	//  125  228:iadd            
	//  126  229:ireturn         
	}

	final float a;
	final float b;
	final float c;
	final float d;
	final float e;
	final float f;
	final float g;
	final float h;

	ChangeTransform$c(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = view.getTranslationX();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #26  <Method float View.getTranslationX()>
	//    5    9:putfield        #28  <Field float a>
		b = view.getTranslationY();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #31  <Method float View.getTranslationY()>
	//    9   17:putfield        #33  <Field float b>
		c = s.m(view);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #39  <Method float s.m(View)>
	//   13   25:putfield        #41  <Field float c>
		d = view.getScaleX();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #44  <Method float View.getScaleX()>
	//   17   33:putfield        #46  <Field float d>
		e = view.getScaleY();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #49  <Method float View.getScaleY()>
	//   21   41:putfield        #51  <Field float e>
		f = view.getRotationX();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #54  <Method float View.getRotationX()>
	//   25   49:putfield        #56  <Field float f>
		g = view.getRotationY();
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #59  <Method float View.getRotationY()>
	//   29   57:putfield        #61  <Field float g>
		h = view.getRotation();
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #64  <Method float View.getRotation()>
	//   33   65:putfield        #66  <Field float h>
	//   34   68:return          
	}
}
