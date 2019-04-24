// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.b.a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.a.b;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.b.a:
//			i, a

private static class i$b extends i$d
{

	private android.graphics.t.Cap a(int i1, android.graphics.t.Cap cap)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 38
	//	               1 34
	//	               2 30
		default:
			return cap;
	//    2   28:aload_2         
	//    3   29:areturn         

		case 2: // '\002'
			return android.graphics.t.Cap.SQUARE;
	//    4   30:getstatic       #74  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.SQUARE>
	//    5   33:areturn         

		case 1: // '\001'
			return android.graphics.t.Cap.ROUND;
	//    6   34:getstatic       #77  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.ROUND>
	//    7   37:areturn         

		case 0: // '\0'
			return android.graphics.t.Cap.BUTT;
	//    8   38:getstatic       #51  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//    9   41:areturn         
		}
	}

	private android.graphics.t.Join a(int i1, android.graphics.t.Join join)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 38
	//	               1 34
	//	               2 30
		default:
			return join;
	//    2   28:aload_2         
	//    3   29:areturn         

		case 2: // '\002'
			return android.graphics.t.Join.BEVEL;
	//    4   30:getstatic       #81  <Field android.graphics.Paint$Join android.graphics.Paint$Join.BEVEL>
	//    5   33:areturn         

		case 1: // '\001'
			return android.graphics.t.Join.ROUND;
	//    6   34:getstatic       #83  <Field android.graphics.Paint$Join android.graphics.Paint$Join.ROUND>
	//    7   37:areturn         

		case 0: // '\0'
			return android.graphics.t.Join.MITER;
	//    8   38:getstatic       #58  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//    9   41:areturn         
		}
	}

	private void a(TypedArray typedarray, XmlPullParser xmlpullparser)
	{
		p = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #70  <Field int[] p>
		if(!android.support.v4.content.a.c.a(xmlpullparser, "pathData"))
	//*   3    5:aload_2         
	//*   4    6:ldc1            #86  <String "pathData">
	//*   5    8:invokestatic    #91  <Method boolean c.a(XmlPullParser, String)>
	//*   6   11:ifne            15
			return;
	//    7   14:return          
		String s = typedarray.getString(0);
	//    8   15:aload_1         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #97  <Method String TypedArray.getString(int)>
	//   11   20:astore_3        
		if(s != null)
	//*  12   21:aload_3         
	//*  13   22:ifnull          30
			n = s;
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:putfield        #101 <Field String n>
		s = typedarray.getString(2);
	//   17   30:aload_1         
	//   18   31:iconst_2        
	//   19   32:invokevirtual   #97  <Method String TypedArray.getString(int)>
	//   20   35:astore_3        
		if(s != null)
	//*  21   36:aload_3         
	//*  22   37:ifnull          48
			m = android.support.v4.a.b.b(s);
	//   23   40:aload_0         
	//   24   41:aload_3         
	//   25   42:invokestatic    #106 <Method android.support.v4.a.b$b[] b.b(String)>
	//   26   45:putfield        #110 <Field android.support.v4.a.b$b[] m>
		c = android.support.v4.content.a.c.b(typedarray, xmlpullparser, "fillColor", 1, c);
	//   27   48:aload_0         
	//   28   49:aload_1         
	//   29   50:aload_2         
	//   30   51:ldc1            #112 <String "fillColor">
	//   31   53:iconst_1        
	//   32   54:aload_0         
	//   33   55:getfield        #34  <Field int c>
	//   34   58:invokestatic    #115 <Method int c.b(TypedArray, XmlPullParser, String, int, int)>
	//   35   61:putfield        #34  <Field int c>
		f = android.support.v4.content.a.c.a(typedarray, xmlpullparser, "fillAlpha", 12, f);
	//   36   64:aload_0         
	//   37   65:aload_1         
	//   38   66:aload_2         
	//   39   67:ldc1            #117 <String "fillAlpha">
	//   40   69:bipush          12
	//   41   71:aload_0         
	//   42   72:getfield        #40  <Field float f>
	//   43   75:invokestatic    #120 <Method float c.a(TypedArray, XmlPullParser, String, int, float)>
	//   44   78:putfield        #40  <Field float f>
		j = a(android.support.v4.content.a.c.a(typedarray, xmlpullparser, "strokeLineCap", 8, -1), j);
	//   45   81:aload_0         
	//   46   82:aload_0         
	//   47   83:aload_1         
	//   48   84:aload_2         
	//   49   85:ldc1            #122 <String "strokeLineCap">
	//   50   87:bipush          8
	//   51   89:iconst_m1       
	//   52   90:invokestatic    #124 <Method int c.a(TypedArray, XmlPullParser, String, int, int)>
	//   53   93:aload_0         
	//   54   94:getfield        #53  <Field android.graphics.Paint$Cap j>
	//   55   97:invokespecial   #126 <Method android.graphics.Paint$Cap a(int, android.graphics.Paint$Cap)>
	//   56  100:putfield        #53  <Field android.graphics.Paint$Cap j>
		k = a(android.support.v4.content.a.c.a(typedarray, xmlpullparser, "strokeLineJoin", 9, -1), k);
	//   57  103:aload_0         
	//   58  104:aload_0         
	//   59  105:aload_1         
	//   60  106:aload_2         
	//   61  107:ldc1            #128 <String "strokeLineJoin">
	//   62  109:bipush          9
	//   63  111:iconst_m1       
	//   64  112:invokestatic    #124 <Method int c.a(TypedArray, XmlPullParser, String, int, int)>
	//   65  115:aload_0         
	//   66  116:getfield        #60  <Field android.graphics.Paint$Join k>
	//   67  119:invokespecial   #130 <Method android.graphics.Paint$Join a(int, android.graphics.Paint$Join)>
	//   68  122:putfield        #60  <Field android.graphics.Paint$Join k>
		l = android.support.v4.content.a.c.a(typedarray, xmlpullparser, "strokeMiterLimit", 10, l);
	//   69  125:aload_0         
	//   70  126:aload_1         
	//   71  127:aload_2         
	//   72  128:ldc1            #132 <String "strokeMiterLimit">
	//   73  130:bipush          10
	//   74  132:aload_0         
	//   75  133:getfield        #63  <Field float l>
	//   76  136:invokestatic    #120 <Method float c.a(TypedArray, XmlPullParser, String, int, float)>
	//   77  139:putfield        #63  <Field float l>
		a = android.support.v4.content.a.c.b(typedarray, xmlpullparser, "strokeColor", 3, a);
	//   78  142:aload_0         
	//   79  143:aload_1         
	//   80  144:aload_2         
	//   81  145:ldc1            #134 <String "strokeColor">
	//   82  147:iconst_3        
	//   83  148:aload_0         
	//   84  149:getfield        #30  <Field int a>
	//   85  152:invokestatic    #115 <Method int c.b(TypedArray, XmlPullParser, String, int, int)>
	//   86  155:putfield        #30  <Field int a>
		d = android.support.v4.content.a.c.a(typedarray, xmlpullparser, "strokeAlpha", 11, d);
	//   87  158:aload_0         
	//   88  159:aload_1         
	//   89  160:aload_2         
	//   90  161:ldc1            #136 <String "strokeAlpha">
	//   91  163:bipush          11
	//   92  165:aload_0         
	//   93  166:getfield        #36  <Field float d>
	//   94  169:invokestatic    #120 <Method float c.a(TypedArray, XmlPullParser, String, int, float)>
	//   95  172:putfield        #36  <Field float d>
		b = android.support.v4.content.a.c.a(typedarray, xmlpullparser, "strokeWidth", 4, b);
	//   96  175:aload_0         
	//   97  176:aload_1         
	//   98  177:aload_2         
	//   99  178:ldc1            #138 <String "strokeWidth">
	//  100  180:iconst_4        
	//  101  181:aload_0         
	//  102  182:getfield        #32  <Field float b>
	//  103  185:invokestatic    #120 <Method float c.a(TypedArray, XmlPullParser, String, int, float)>
	//  104  188:putfield        #32  <Field float b>
		h = android.support.v4.content.a.c.a(typedarray, xmlpullparser, "trimPathEnd", 6, h);
	//  105  191:aload_0         
	//  106  192:aload_1         
	//  107  193:aload_2         
	//  108  194:ldc1            #140 <String "trimPathEnd">
	//  109  196:bipush          6
	//  110  198:aload_0         
	//  111  199:getfield        #44  <Field float h>
	//  112  202:invokestatic    #120 <Method float c.a(TypedArray, XmlPullParser, String, int, float)>
	//  113  205:putfield        #44  <Field float h>
		i = android.support.v4.content.a.c.a(typedarray, xmlpullparser, "trimPathOffset", 7, i);
	//  114  208:aload_0         
	//  115  209:aload_1         
	//  116  210:aload_2         
	//  117  211:ldc1            #142 <String "trimPathOffset">
	//  118  213:bipush          7
	//  119  215:aload_0         
	//  120  216:getfield        #46  <Field float i>
	//  121  219:invokestatic    #120 <Method float c.a(TypedArray, XmlPullParser, String, int, float)>
	//  122  222:putfield        #46  <Field float i>
		g = android.support.v4.content.a.c.a(typedarray, xmlpullparser, "trimPathStart", 5, g);
	//  123  225:aload_0         
	//  124  226:aload_1         
	//  125  227:aload_2         
	//  126  228:ldc1            #144 <String "trimPathStart">
	//  127  230:iconst_5        
	//  128  231:aload_0         
	//  129  232:getfield        #42  <Field float g>
	//  130  235:invokestatic    #120 <Method float c.a(TypedArray, XmlPullParser, String, int, float)>
	//  131  238:putfield        #42  <Field float g>
		e = android.support.v4.content.a.c.a(typedarray, xmlpullparser, "fillType", 13, e);
	//  132  241:aload_0         
	//  133  242:aload_1         
	//  134  243:aload_2         
	//  135  244:ldc1            #146 <String "fillType">
	//  136  246:bipush          13
	//  137  248:aload_0         
	//  138  249:getfield        #38  <Field int e>
	//  139  252:invokestatic    #124 <Method int c.a(TypedArray, XmlPullParser, String, int, int)>
	//  140  255:putfield        #38  <Field int e>
	//  141  258:return          
	}

	public void a(Resources resources, AttributeSet attributeset, android.content.res.urces.Theme theme, XmlPullParser xmlpullparser)
	{
		resources = ((Resources) (android.support.v4.content.a.c.a(resources, theme, attributeset, android.support.b.a.a.c)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:aload_2         
	//    3    3:getstatic       #151 <Field int[] android.support.b.a.a.c>
	//    4    6:invokestatic    #154 <Method TypedArray c.a(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_1        
		a(((TypedArray) (resources)), xmlpullparser);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload           4
	//    9   14:invokespecial   #156 <Method void a(TypedArray, XmlPullParser)>
		((TypedArray) (resources)).recycle();
	//   10   17:aload_1         
	//   11   18:invokevirtual   #159 <Method void TypedArray.recycle()>
	//   12   21:return          
	}

	float getFillAlpha()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float f>
	//    2    4:freturn         
	}

	int getFillColor()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int c>
	//    2    4:ireturn         
	}

	float getStrokeAlpha()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field float d>
	//    2    4:freturn         
	}

	int getStrokeColor()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int a>
	//    2    4:ireturn         
	}

	float getStrokeWidth()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float b>
	//    2    4:freturn         
	}

	float getTrimPathEnd()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field float h>
	//    2    4:freturn         
	}

	float getTrimPathOffset()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field float i>
	//    2    4:freturn         
	}

	float getTrimPathStart()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float g>
	//    2    4:freturn         
	}

	void setFillAlpha(float f1)
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #40  <Field float f>
	//    3    5:return          
	}

	void setFillColor(int i1)
	{
		c = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int c>
	//    3    5:return          
	}

	void setStrokeAlpha(float f1)
	{
		d = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #36  <Field float d>
	//    3    5:return          
	}

	void setStrokeColor(int i1)
	{
		a = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int a>
	//    3    5:return          
	}

	void setStrokeWidth(float f1)
	{
		b = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #32  <Field float b>
	//    3    5:return          
	}

	void setTrimPathEnd(float f1)
	{
		h = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #44  <Field float h>
	//    3    5:return          
	}

	void setTrimPathOffset(float f1)
	{
		i = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #46  <Field float i>
	//    3    5:return          
	}

	void setTrimPathStart(float f1)
	{
		g = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #42  <Field float g>
	//    3    5:return          
	}

	int a;
	float b;
	int c;
	float d;
	int e;
	float f;
	float g;
	float h;
	float i;
	android.graphics.t.Cap j;
	android.graphics.t.Join k;
	float l;
	private int p[];

	public i$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void i$d()>
		a = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field int a>
		b = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #32  <Field float b>
		c = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #34  <Field int c>
		d = 1.0F;
	//   11   19:aload_0         
	//   12   20:fconst_1        
	//   13   21:putfield        #36  <Field float d>
		e = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #38  <Field int e>
		f = 1.0F;
	//   17   29:aload_0         
	//   18   30:fconst_1        
	//   19   31:putfield        #40  <Field float f>
		g = 0.0F;
	//   20   34:aload_0         
	//   21   35:fconst_0        
	//   22   36:putfield        #42  <Field float g>
		h = 1.0F;
	//   23   39:aload_0         
	//   24   40:fconst_1        
	//   25   41:putfield        #44  <Field float h>
		i = 0.0F;
	//   26   44:aload_0         
	//   27   45:fconst_0        
	//   28   46:putfield        #46  <Field float i>
		j = android.graphics.t.Cap.BUTT;
	//   29   49:aload_0         
	//   30   50:getstatic       #51  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   31   53:putfield        #53  <Field android.graphics.Paint$Cap j>
		k = android.graphics.t.Join.MITER;
	//   32   56:aload_0         
	//   33   57:getstatic       #58  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   34   60:putfield        #60  <Field android.graphics.Paint$Join k>
		l = 4F;
	//   35   63:aload_0         
	//   36   64:ldc1            #61  <Float 4F>
	//   37   66:putfield        #63  <Field float l>
	//   38   69:return          
	}

	public i$b(i$b i$b1)
	{
		super(((i$d) (i$b1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #68  <Method void i$d(i$d)>
		a = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #30  <Field int a>
		b = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #32  <Field float b>
		c = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #34  <Field int c>
		d = 1.0F;
	//   12   20:aload_0         
	//   13   21:fconst_1        
	//   14   22:putfield        #36  <Field float d>
		e = 0;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #38  <Field int e>
		f = 1.0F;
	//   18   30:aload_0         
	//   19   31:fconst_1        
	//   20   32:putfield        #40  <Field float f>
		g = 0.0F;
	//   21   35:aload_0         
	//   22   36:fconst_0        
	//   23   37:putfield        #42  <Field float g>
		h = 1.0F;
	//   24   40:aload_0         
	//   25   41:fconst_1        
	//   26   42:putfield        #44  <Field float h>
		i = 0.0F;
	//   27   45:aload_0         
	//   28   46:fconst_0        
	//   29   47:putfield        #46  <Field float i>
		j = android.graphics.t.Cap.BUTT;
	//   30   50:aload_0         
	//   31   51:getstatic       #51  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   32   54:putfield        #53  <Field android.graphics.Paint$Cap j>
		k = android.graphics.t.Join.MITER;
	//   33   57:aload_0         
	//   34   58:getstatic       #58  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   35   61:putfield        #60  <Field android.graphics.Paint$Join k>
		l = 4F;
	//   36   64:aload_0         
	//   37   65:ldc1            #61  <Float 4F>
	//   38   67:putfield        #63  <Field float l>
		p = i$b1.p;
	//   39   70:aload_0         
	//   40   71:aload_1         
	//   41   72:getfield        #70  <Field int[] p>
	//   42   75:putfield        #70  <Field int[] p>
		a = i$b1.a;
	//   43   78:aload_0         
	//   44   79:aload_1         
	//   45   80:getfield        #30  <Field int a>
	//   46   83:putfield        #30  <Field int a>
		b = i$b1.b;
	//   47   86:aload_0         
	//   48   87:aload_1         
	//   49   88:getfield        #32  <Field float b>
	//   50   91:putfield        #32  <Field float b>
		d = i$b1.d;
	//   51   94:aload_0         
	//   52   95:aload_1         
	//   53   96:getfield        #36  <Field float d>
	//   54   99:putfield        #36  <Field float d>
		c = i$b1.c;
	//   55  102:aload_0         
	//   56  103:aload_1         
	//   57  104:getfield        #34  <Field int c>
	//   58  107:putfield        #34  <Field int c>
		e = i$b1.e;
	//   59  110:aload_0         
	//   60  111:aload_1         
	//   61  112:getfield        #38  <Field int e>
	//   62  115:putfield        #38  <Field int e>
		f = i$b1.f;
	//   63  118:aload_0         
	//   64  119:aload_1         
	//   65  120:getfield        #40  <Field float f>
	//   66  123:putfield        #40  <Field float f>
		g = i$b1.g;
	//   67  126:aload_0         
	//   68  127:aload_1         
	//   69  128:getfield        #42  <Field float g>
	//   70  131:putfield        #42  <Field float g>
		h = i$b1.h;
	//   71  134:aload_0         
	//   72  135:aload_1         
	//   73  136:getfield        #44  <Field float h>
	//   74  139:putfield        #44  <Field float h>
		i = i$b1.i;
	//   75  142:aload_0         
	//   76  143:aload_1         
	//   77  144:getfield        #46  <Field float i>
	//   78  147:putfield        #46  <Field float i>
		j = i$b1.j;
	//   79  150:aload_0         
	//   80  151:aload_1         
	//   81  152:getfield        #53  <Field android.graphics.Paint$Cap j>
	//   82  155:putfield        #53  <Field android.graphics.Paint$Cap j>
		k = i$b1.k;
	//   83  158:aload_0         
	//   84  159:aload_1         
	//   85  160:getfield        #60  <Field android.graphics.Paint$Join k>
	//   86  163:putfield        #60  <Field android.graphics.Paint$Join k>
		l = i$b1.l;
	//   87  166:aload_0         
	//   88  167:aload_1         
	//   89  168:getfield        #63  <Field float l>
	//   90  171:putfield        #63  <Field float l>
	//   91  174:return          
	}
}
