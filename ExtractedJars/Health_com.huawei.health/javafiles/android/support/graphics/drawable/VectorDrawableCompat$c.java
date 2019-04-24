// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;
import o.ae;
import o.ag;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat, PathParser

static class VectorDrawableCompat$c extends VectorDrawableCompat$e
{

	private android.graphics.Paint.Cap a(int j, android.graphics.Paint.Cap cap)
	{
		switch(j)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 30
	//	               1 34
	//	               2 38
		default:
			return cap;
	//    2   28:aload_2         
	//    3   29:areturn         

		case 0: // '\0'
			return android.graphics.Paint.Cap.BUTT;
	//    4   30:getstatic       #49  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//    5   33:areturn         

		case 1: // '\001'
			return android.graphics.Paint.Cap.ROUND;
	//    6   34:getstatic       #74  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.ROUND>
	//    7   37:areturn         

		case 2: // '\002'
			return android.graphics.Paint.Cap.SQUARE;
	//    8   38:getstatic       #77  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.SQUARE>
	//    9   41:areturn         
		}
	}

	private void a(TypedArray typedarray, XmlPullParser xmlpullparser)
	{
		t = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #68  <Field int[] t>
		if(!TypedArrayUtils.hasAttribute(xmlpullparser, "pathData"))
	//*   3    5:aload_2         
	//*   4    6:ldc1            #80  <String "pathData">
	//*   5    8:invokestatic    #86  <Method boolean TypedArrayUtils.hasAttribute(XmlPullParser, String)>
	//*   6   11:ifne            15
			return;
	//    7   14:return          
		String s = typedarray.getString(0);
	//    8   15:aload_1         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #92  <Method String TypedArray.getString(int)>
	//   11   20:astore_3        
		if(s != null)
	//*  12   21:aload_3         
	//*  13   22:ifnull          30
			p = s;
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:putfield        #96  <Field String p>
		s = typedarray.getString(2);
	//   17   30:aload_1         
	//   18   31:iconst_2        
	//   19   32:invokevirtual   #92  <Method String TypedArray.getString(int)>
	//   20   35:astore_3        
		if(s != null)
	//*  21   36:aload_3         
	//*  22   37:ifnull          48
			l = PathParser.c(s);
	//   23   40:aload_0         
	//   24   41:aload_3         
	//   25   42:invokestatic    #101 <Method PathParser$PathDataNode[] PathParser.c(String)>
	//   26   45:putfield        #105 <Field PathParser$PathDataNode[] l>
		a = TypedArrayUtils.getNamedColor(typedarray, xmlpullparser, "fillColor", 1, a);
	//   27   48:aload_0         
	//   28   49:aload_1         
	//   29   50:aload_2         
	//   30   51:ldc1            #107 <String "fillColor">
	//   31   53:iconst_1        
	//   32   54:aload_0         
	//   33   55:getfield        #34  <Field int a>
	//   34   58:invokestatic    #111 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
	//   35   61:putfield        #34  <Field int a>
		i = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "fillAlpha", 12, i);
	//   36   64:aload_0         
	//   37   65:aload_1         
	//   38   66:aload_2         
	//   39   67:ldc1            #113 <String "fillAlpha">
	//   40   69:bipush          12
	//   41   71:aload_0         
	//   42   72:getfield        #38  <Field float i>
	//   43   75:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   44   78:putfield        #38  <Field float i>
		k = a(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "strokeLineCap", 8, -1), k);
	//   45   81:aload_0         
	//   46   82:aload_0         
	//   47   83:aload_1         
	//   48   84:aload_2         
	//   49   85:ldc1            #119 <String "strokeLineCap">
	//   50   87:bipush          8
	//   51   89:iconst_m1       
	//   52   90:invokestatic    #122 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   53   93:aload_0         
	//   54   94:getfield        #51  <Field android.graphics.Paint$Cap k>
	//   55   97:invokespecial   #124 <Method android.graphics.Paint$Cap a(int, android.graphics.Paint$Cap)>
	//   56  100:putfield        #51  <Field android.graphics.Paint$Cap k>
		n = c(TypedArrayUtils.getNamedInt(typedarray, xmlpullparser, "strokeLineJoin", 9, -1), n);
	//   57  103:aload_0         
	//   58  104:aload_0         
	//   59  105:aload_1         
	//   60  106:aload_2         
	//   61  107:ldc1            #126 <String "strokeLineJoin">
	//   62  109:bipush          9
	//   63  111:iconst_m1       
	//   64  112:invokestatic    #122 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   65  115:aload_0         
	//   66  116:getfield        #58  <Field android.graphics.Paint$Join n>
	//   67  119:invokespecial   #129 <Method android.graphics.Paint$Join c(int, android.graphics.Paint$Join)>
	//   68  122:putfield        #58  <Field android.graphics.Paint$Join n>
		o = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeMiterLimit", 10, o);
	//   69  125:aload_0         
	//   70  126:aload_1         
	//   71  127:aload_2         
	//   72  128:ldc1            #131 <String "strokeMiterLimit">
	//   73  130:bipush          10
	//   74  132:aload_0         
	//   75  133:getfield        #61  <Field float o>
	//   76  136:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   77  139:putfield        #61  <Field float o>
		e = TypedArrayUtils.getNamedColor(typedarray, xmlpullparser, "strokeColor", 3, e);
	//   78  142:aload_0         
	//   79  143:aload_1         
	//   80  144:aload_2         
	//   81  145:ldc1            #133 <String "strokeColor">
	//   82  147:iconst_3        
	//   83  148:aload_0         
	//   84  149:getfield        #30  <Field int e>
	//   85  152:invokestatic    #111 <Method int TypedArrayUtils.getNamedColor(TypedArray, XmlPullParser, String, int, int)>
	//   86  155:putfield        #30  <Field int e>
		b = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeAlpha", 11, b);
	//   87  158:aload_0         
	//   88  159:aload_1         
	//   89  160:aload_2         
	//   90  161:ldc1            #135 <String "strokeAlpha">
	//   91  163:bipush          11
	//   92  165:aload_0         
	//   93  166:getfield        #36  <Field float b>
	//   94  169:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   95  172:putfield        #36  <Field float b>
		d = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "strokeWidth", 4, d);
	//   96  175:aload_0         
	//   97  176:aload_1         
	//   98  177:aload_2         
	//   99  178:ldc1            #137 <String "strokeWidth">
	//  100  180:iconst_4        
	//  101  181:aload_0         
	//  102  182:getfield        #32  <Field float d>
	//  103  185:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  104  188:putfield        #32  <Field float d>
		h = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathEnd", 6, h);
	//  105  191:aload_0         
	//  106  192:aload_1         
	//  107  193:aload_2         
	//  108  194:ldc1            #139 <String "trimPathEnd">
	//  109  196:bipush          6
	//  110  198:aload_0         
	//  111  199:getfield        #42  <Field float h>
	//  112  202:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  113  205:putfield        #42  <Field float h>
		f = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathOffset", 7, f);
	//  114  208:aload_0         
	//  115  209:aload_1         
	//  116  210:aload_2         
	//  117  211:ldc1            #141 <String "trimPathOffset">
	//  118  213:bipush          7
	//  119  215:aload_0         
	//  120  216:getfield        #44  <Field float f>
	//  121  219:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  122  222:putfield        #44  <Field float f>
		g = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "trimPathStart", 5, g);
	//  123  225:aload_0         
	//  124  226:aload_1         
	//  125  227:aload_2         
	//  126  228:ldc1            #143 <String "trimPathStart">
	//  127  230:iconst_5        
	//  128  231:aload_0         
	//  129  232:getfield        #40  <Field float g>
	//  130  235:invokestatic    #117 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//  131  238:putfield        #40  <Field float g>
	//  132  241:return          
	}

	private android.graphics.Paint.Join c(int j, android.graphics.Paint.Join join)
	{
		switch(j)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 30
	//	               1 34
	//	               2 38
		default:
			return join;
	//    2   28:aload_2         
	//    3   29:areturn         

		case 0: // '\0'
			return android.graphics.Paint.Join.MITER;
	//    4   30:getstatic       #56  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//    5   33:areturn         

		case 1: // '\001'
			return android.graphics.Paint.Join.ROUND;
	//    6   34:getstatic       #145 <Field android.graphics.Paint$Join android.graphics.Paint$Join.ROUND>
	//    7   37:areturn         

		case 2: // '\002'
			return android.graphics.Paint.Join.BEVEL;
	//    8   38:getstatic       #148 <Field android.graphics.Paint$Join android.graphics.Paint$Join.BEVEL>
	//    9   41:areturn         
		}
	}

	public void a(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
	{
		resources = ((Resources) (ag.obtainAttributes(resources, theme, attributeset, ae.b)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:aload_2         
	//    3    3:getstatic       #153 <Field int[] ae.b>
	//    4    6:invokestatic    #159 <Method TypedArray ag.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_1        
		a(((TypedArray) (resources)), xmlpullparser);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload           4
	//    9   14:invokespecial   #161 <Method void a(TypedArray, XmlPullParser)>
		((TypedArray) (resources)).recycle();
	//   10   17:aload_1         
	//   11   18:invokevirtual   #164 <Method void TypedArray.recycle()>
	//   12   21:return          
	}

	float getFillAlpha()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field float i>
	//    2    4:freturn         
	}

	int getFillColor()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int a>
	//    2    4:ireturn         
	}

	float getStrokeAlpha()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field float b>
	//    2    4:freturn         
	}

	int getStrokeColor()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int e>
	//    2    4:ireturn         
	}

	float getStrokeWidth()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float d>
	//    2    4:freturn         
	}

	float getTrimPathEnd()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float h>
	//    2    4:freturn         
	}

	float getTrimPathOffset()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field float f>
	//    2    4:freturn         
	}

	float getTrimPathStart()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float g>
	//    2    4:freturn         
	}

	void setFillAlpha(float f1)
	{
		i = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #38  <Field float i>
	//    3    5:return          
	}

	void setFillColor(int j)
	{
		a = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int a>
	//    3    5:return          
	}

	void setStrokeAlpha(float f1)
	{
		b = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #36  <Field float b>
	//    3    5:return          
	}

	void setStrokeColor(int j)
	{
		e = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int e>
	//    3    5:return          
	}

	void setStrokeWidth(float f1)
	{
		d = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #32  <Field float d>
	//    3    5:return          
	}

	void setTrimPathEnd(float f1)
	{
		h = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #42  <Field float h>
	//    3    5:return          
	}

	void setTrimPathOffset(float f1)
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #44  <Field float f>
	//    3    5:return          
	}

	void setTrimPathStart(float f1)
	{
		g = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #40  <Field float g>
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
	android.graphics.Paint.Cap k;
	android.graphics.Paint.Join n;
	float o;
	private int t[];

	public VectorDrawableCompat$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void VectorDrawableCompat$e()>
		e = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field int e>
		d = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #32  <Field float d>
		a = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #34  <Field int a>
		b = 1.0F;
	//   11   19:aload_0         
	//   12   20:fconst_1        
	//   13   21:putfield        #36  <Field float b>
		i = 1.0F;
	//   14   24:aload_0         
	//   15   25:fconst_1        
	//   16   26:putfield        #38  <Field float i>
		g = 0.0F;
	//   17   29:aload_0         
	//   18   30:fconst_0        
	//   19   31:putfield        #40  <Field float g>
		h = 1.0F;
	//   20   34:aload_0         
	//   21   35:fconst_1        
	//   22   36:putfield        #42  <Field float h>
		f = 0.0F;
	//   23   39:aload_0         
	//   24   40:fconst_0        
	//   25   41:putfield        #44  <Field float f>
		k = android.graphics.Paint.Cap.BUTT;
	//   26   44:aload_0         
	//   27   45:getstatic       #49  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   28   48:putfield        #51  <Field android.graphics.Paint$Cap k>
		n = android.graphics.Paint.Join.MITER;
	//   29   51:aload_0         
	//   30   52:getstatic       #56  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   31   55:putfield        #58  <Field android.graphics.Paint$Join n>
		o = 4F;
	//   32   58:aload_0         
	//   33   59:ldc1            #59  <Float 4F>
	//   34   61:putfield        #61  <Field float o>
	//   35   64:return          
	}

	public VectorDrawableCompat$c(VectorDrawableCompat$c vectordrawablecompat$c)
	{
		super(((VectorDrawableCompat$e) (vectordrawablecompat$c)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void VectorDrawableCompat$e(VectorDrawableCompat$e)>
		e = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #30  <Field int e>
		d = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #32  <Field float d>
		a = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #34  <Field int a>
		b = 1.0F;
	//   12   20:aload_0         
	//   13   21:fconst_1        
	//   14   22:putfield        #36  <Field float b>
		i = 1.0F;
	//   15   25:aload_0         
	//   16   26:fconst_1        
	//   17   27:putfield        #38  <Field float i>
		g = 0.0F;
	//   18   30:aload_0         
	//   19   31:fconst_0        
	//   20   32:putfield        #40  <Field float g>
		h = 1.0F;
	//   21   35:aload_0         
	//   22   36:fconst_1        
	//   23   37:putfield        #42  <Field float h>
		f = 0.0F;
	//   24   40:aload_0         
	//   25   41:fconst_0        
	//   26   42:putfield        #44  <Field float f>
		k = android.graphics.Paint.Cap.BUTT;
	//   27   45:aload_0         
	//   28   46:getstatic       #49  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
	//   29   49:putfield        #51  <Field android.graphics.Paint$Cap k>
		n = android.graphics.Paint.Join.MITER;
	//   30   52:aload_0         
	//   31   53:getstatic       #56  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
	//   32   56:putfield        #58  <Field android.graphics.Paint$Join n>
		o = 4F;
	//   33   59:aload_0         
	//   34   60:ldc1            #59  <Float 4F>
	//   35   62:putfield        #61  <Field float o>
		t = vectordrawablecompat$c.t;
	//   36   65:aload_0         
	//   37   66:aload_1         
	//   38   67:getfield        #68  <Field int[] t>
	//   39   70:putfield        #68  <Field int[] t>
		e = vectordrawablecompat$c.e;
	//   40   73:aload_0         
	//   41   74:aload_1         
	//   42   75:getfield        #30  <Field int e>
	//   43   78:putfield        #30  <Field int e>
		d = vectordrawablecompat$c.d;
	//   44   81:aload_0         
	//   45   82:aload_1         
	//   46   83:getfield        #32  <Field float d>
	//   47   86:putfield        #32  <Field float d>
		b = vectordrawablecompat$c.b;
	//   48   89:aload_0         
	//   49   90:aload_1         
	//   50   91:getfield        #36  <Field float b>
	//   51   94:putfield        #36  <Field float b>
		a = vectordrawablecompat$c.a;
	//   52   97:aload_0         
	//   53   98:aload_1         
	//   54   99:getfield        #34  <Field int a>
	//   55  102:putfield        #34  <Field int a>
		c = vectordrawablecompat$c.c;
	//   56  105:aload_0         
	//   57  106:aload_1         
	//   58  107:getfield        #70  <Field int c>
	//   59  110:putfield        #70  <Field int c>
		i = vectordrawablecompat$c.i;
	//   60  113:aload_0         
	//   61  114:aload_1         
	//   62  115:getfield        #38  <Field float i>
	//   63  118:putfield        #38  <Field float i>
		g = vectordrawablecompat$c.g;
	//   64  121:aload_0         
	//   65  122:aload_1         
	//   66  123:getfield        #40  <Field float g>
	//   67  126:putfield        #40  <Field float g>
		h = vectordrawablecompat$c.h;
	//   68  129:aload_0         
	//   69  130:aload_1         
	//   70  131:getfield        #42  <Field float h>
	//   71  134:putfield        #42  <Field float h>
		f = vectordrawablecompat$c.f;
	//   72  137:aload_0         
	//   73  138:aload_1         
	//   74  139:getfield        #44  <Field float f>
	//   75  142:putfield        #44  <Field float f>
		k = vectordrawablecompat$c.k;
	//   76  145:aload_0         
	//   77  146:aload_1         
	//   78  147:getfield        #51  <Field android.graphics.Paint$Cap k>
	//   79  150:putfield        #51  <Field android.graphics.Paint$Cap k>
		n = vectordrawablecompat$c.n;
	//   80  153:aload_0         
	//   81  154:aload_1         
	//   82  155:getfield        #58  <Field android.graphics.Paint$Join n>
	//   83  158:putfield        #58  <Field android.graphics.Paint$Join n>
		o = vectordrawablecompat$c.o;
	//   84  161:aload_0         
	//   85  162:aload_1         
	//   86  163:getfield        #61  <Field float o>
	//   87  166:putfield        #61  <Field float o>
	//   88  169:return          
	}
}
