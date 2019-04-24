// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.util.ArrayMap;
import android.util.AttributeSet;
import java.util.ArrayList;
import o.ae;
import o.ag;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat

static class VectorDrawableCompat$d
{

	static Matrix b(VectorDrawableCompat$d vectordrawablecompat$d)
	{
		return vectordrawablecompat$d.m;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Matrix m>
	//    2    4:areturn         
	}

	static Matrix c(VectorDrawableCompat$d vectordrawablecompat$d)
	{
		return vectordrawablecompat$d.d;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Matrix d>
	//    2    4:areturn         
	}

	private void c()
	{
		m.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Matrix m>
	//    2    4:invokevirtual   #115 <Method void Matrix.reset()>
		m.postTranslate(-e, -f);
	//    3    7:aload_0         
	//    4    8:getfield        #56  <Field Matrix m>
	//    5   11:aload_0         
	//    6   12:getfield        #44  <Field float e>
	//    7   15:fneg            
	//    8   16:aload_0         
	//    9   17:getfield        #46  <Field float f>
	//   10   20:fneg            
	//   11   21:invokevirtual   #119 <Method boolean Matrix.postTranslate(float, float)>
	//   12   24:pop             
		m.postScale(g, i);
	//   13   25:aload_0         
	//   14   26:getfield        #56  <Field Matrix m>
	//   15   29:aload_0         
	//   16   30:getfield        #48  <Field float g>
	//   17   33:aload_0         
	//   18   34:getfield        #50  <Field float i>
	//   19   37:invokevirtual   #122 <Method boolean Matrix.postScale(float, float)>
	//   20   40:pop             
		m.postRotate(c, 0.0F, 0.0F);
	//   21   41:aload_0         
	//   22   42:getfield        #56  <Field Matrix m>
	//   23   45:aload_0         
	//   24   46:getfield        #42  <Field float c>
	//   25   49:fconst_0        
	//   26   50:fconst_0        
	//   27   51:invokevirtual   #126 <Method boolean Matrix.postRotate(float, float, float)>
	//   28   54:pop             
		m.postTranslate(h + e, k + f);
	//   29   55:aload_0         
	//   30   56:getfield        #56  <Field Matrix m>
	//   31   59:aload_0         
	//   32   60:getfield        #52  <Field float h>
	//   33   63:aload_0         
	//   34   64:getfield        #44  <Field float e>
	//   35   67:fadd            
	//   36   68:aload_0         
	//   37   69:getfield        #54  <Field float k>
	//   38   72:aload_0         
	//   39   73:getfield        #46  <Field float f>
	//   40   76:fadd            
	//   41   77:invokevirtual   #119 <Method boolean Matrix.postTranslate(float, float)>
	//   42   80:pop             
	//   43   81:return          
	}

	private void c(TypedArray typedarray, XmlPullParser xmlpullparser)
	{
		p = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #62  <Field int[] p>
		c = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "rotation", 5, c);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:ldc1            #129 <String "rotation">
	//    7   10:iconst_5        
	//    8   11:aload_0         
	//    9   12:getfield        #42  <Field float c>
	//   10   15:invokestatic    #135 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   11   18:putfield        #42  <Field float c>
		e = typedarray.getFloat(1, e);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:iconst_1        
	//   15   24:aload_0         
	//   16   25:getfield        #44  <Field float e>
	//   17   28:invokevirtual   #141 <Method float TypedArray.getFloat(int, float)>
	//   18   31:putfield        #44  <Field float e>
		f = typedarray.getFloat(2, f);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:iconst_2        
	//   22   37:aload_0         
	//   23   38:getfield        #46  <Field float f>
	//   24   41:invokevirtual   #141 <Method float TypedArray.getFloat(int, float)>
	//   25   44:putfield        #46  <Field float f>
		g = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleX", 3, g);
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:aload_2         
	//   29   50:ldc1            #143 <String "scaleX">
	//   30   52:iconst_3        
	//   31   53:aload_0         
	//   32   54:getfield        #48  <Field float g>
	//   33   57:invokestatic    #135 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   34   60:putfield        #48  <Field float g>
		i = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleY", 4, i);
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:aload_2         
	//   38   66:ldc1            #145 <String "scaleY">
	//   39   68:iconst_4        
	//   40   69:aload_0         
	//   41   70:getfield        #50  <Field float i>
	//   42   73:invokestatic    #135 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   43   76:putfield        #50  <Field float i>
		h = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateX", 6, h);
	//   44   79:aload_0         
	//   45   80:aload_1         
	//   46   81:aload_2         
	//   47   82:ldc1            #147 <String "translateX">
	//   48   84:bipush          6
	//   49   86:aload_0         
	//   50   87:getfield        #52  <Field float h>
	//   51   90:invokestatic    #135 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   52   93:putfield        #52  <Field float h>
		k = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateY", 7, k);
	//   53   96:aload_0         
	//   54   97:aload_1         
	//   55   98:aload_2         
	//   56   99:ldc1            #149 <String "translateY">
	//   57  101:bipush          7
	//   58  103:aload_0         
	//   59  104:getfield        #54  <Field float k>
	//   60  107:invokestatic    #135 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   61  110:putfield        #54  <Field float k>
		typedarray = ((TypedArray) (typedarray.getString(0)));
	//   62  113:aload_1         
	//   63  114:iconst_0        
	//   64  115:invokevirtual   #153 <Method String TypedArray.getString(int)>
	//   65  118:astore_1        
		if(typedarray != null)
	//*  66  119:aload_1         
	//*  67  120:ifnull          128
			n = ((String) (typedarray));
	//   68  123:aload_0         
	//   69  124:aload_1         
	//   70  125:putfield        #58  <Field String n>
		c();
	//   71  128:aload_0         
	//   72  129:invokespecial   #155 <Method void c()>
	//   73  132:return          
	}

	public void e(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
	{
		resources = ((Resources) (ag.obtainAttributes(resources, theme, attributeset, ae.d)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:aload_2         
	//    3    3:getstatic       #160 <Field int[] ae.d>
	//    4    6:invokestatic    #166 <Method TypedArray ag.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_1        
		c(((TypedArray) (resources)), xmlpullparser);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload           4
	//    9   14:invokespecial   #168 <Method void c(TypedArray, XmlPullParser)>
		((TypedArray) (resources)).recycle();
	//   10   17:aload_1         
	//   11   18:invokevirtual   #171 <Method void TypedArray.recycle()>
	//   12   21:return          
	}

	public String getGroupName()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String n>
	//    2    4:areturn         
	}

	public Matrix getLocalMatrix()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Matrix m>
	//    2    4:areturn         
	}

	public float getPivotX()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field float e>
	//    2    4:freturn         
	}

	public float getPivotY()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field float f>
	//    2    4:freturn         
	}

	public float getRotation()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float c>
	//    2    4:freturn         
	}

	public float getScaleX()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field float g>
	//    2    4:freturn         
	}

	public float getScaleY()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field float i>
	//    2    4:freturn         
	}

	public float getTranslateX()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field float h>
	//    2    4:freturn         
	}

	public float getTranslateY()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float k>
	//    2    4:freturn         
	}

	public void setPivotX(float f1)
	{
		if(f1 != e)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #44  <Field float e>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			e = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #44  <Field float e>
			c();
	//    8   14:aload_0         
	//    9   15:invokespecial   #155 <Method void c()>
		}
	//   10   18:return          
	}

	public void setPivotY(float f1)
	{
		if(f1 != f)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #46  <Field float f>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			f = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #46  <Field float f>
			c();
	//    8   14:aload_0         
	//    9   15:invokespecial   #155 <Method void c()>
		}
	//   10   18:return          
	}

	public void setRotation(float f1)
	{
		if(f1 != c)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #42  <Field float c>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			c = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #42  <Field float c>
			c();
	//    8   14:aload_0         
	//    9   15:invokespecial   #155 <Method void c()>
		}
	//   10   18:return          
	}

	public void setScaleX(float f1)
	{
		if(f1 != g)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #48  <Field float g>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			g = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #48  <Field float g>
			c();
	//    8   14:aload_0         
	//    9   15:invokespecial   #155 <Method void c()>
		}
	//   10   18:return          
	}

	public void setScaleY(float f1)
	{
		if(f1 != i)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #50  <Field float i>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			i = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #50  <Field float i>
			c();
	//    8   14:aload_0         
	//    9   15:invokespecial   #155 <Method void c()>
		}
	//   10   18:return          
	}

	public void setTranslateX(float f1)
	{
		if(f1 != h)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #52  <Field float h>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			h = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #52  <Field float h>
			c();
	//    8   14:aload_0         
	//    9   15:invokespecial   #155 <Method void c()>
		}
	//   10   18:return          
	}

	public void setTranslateY(float f1)
	{
		if(f1 != k)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #54  <Field float k>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			k = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #54  <Field float k>
			c();
	//    8   14:aload_0         
	//    9   15:invokespecial   #155 <Method void c()>
		}
	//   10   18:return          
	}

	final ArrayList a;
	int b;
	float c;
	private final Matrix d;
	private float e;
	private float f;
	private float g;
	private float h;
	private float i;
	private float k;
	private final Matrix m;
	private String n;
	private int p[];

	public VectorDrawableCompat$d()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		d = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #32  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Matrix()>
	//    6   12:putfield        #35  <Field Matrix d>
		a = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #37  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #38  <Method void ArrayList()>
	//   11   23:putfield        #40  <Field ArrayList a>
		c = 0.0F;
	//   12   26:aload_0         
	//   13   27:fconst_0        
	//   14   28:putfield        #42  <Field float c>
		e = 0.0F;
	//   15   31:aload_0         
	//   16   32:fconst_0        
	//   17   33:putfield        #44  <Field float e>
		f = 0.0F;
	//   18   36:aload_0         
	//   19   37:fconst_0        
	//   20   38:putfield        #46  <Field float f>
		g = 1.0F;
	//   21   41:aload_0         
	//   22   42:fconst_1        
	//   23   43:putfield        #48  <Field float g>
		i = 1.0F;
	//   24   46:aload_0         
	//   25   47:fconst_1        
	//   26   48:putfield        #50  <Field float i>
		h = 0.0F;
	//   27   51:aload_0         
	//   28   52:fconst_0        
	//   29   53:putfield        #52  <Field float h>
		k = 0.0F;
	//   30   56:aload_0         
	//   31   57:fconst_0        
	//   32   58:putfield        #54  <Field float k>
		m = new Matrix();
	//   33   61:aload_0         
	//   34   62:new             #32  <Class Matrix>
	//   35   65:dup             
	//   36   66:invokespecial   #33  <Method void Matrix()>
	//   37   69:putfield        #56  <Field Matrix m>
		n = null;
	//   38   72:aload_0         
	//   39   73:aconst_null     
	//   40   74:putfield        #58  <Field String n>
	//   41   77:return          
	}

	public VectorDrawableCompat$d(VectorDrawableCompat$d vectordrawablecompat$d, ArrayMap arraymap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		d = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #32  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Matrix()>
	//    6   12:putfield        #35  <Field Matrix d>
		a = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #37  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #38  <Method void ArrayList()>
	//   11   23:putfield        #40  <Field ArrayList a>
		c = 0.0F;
	//   12   26:aload_0         
	//   13   27:fconst_0        
	//   14   28:putfield        #42  <Field float c>
		e = 0.0F;
	//   15   31:aload_0         
	//   16   32:fconst_0        
	//   17   33:putfield        #44  <Field float e>
		f = 0.0F;
	//   18   36:aload_0         
	//   19   37:fconst_0        
	//   20   38:putfield        #46  <Field float f>
		g = 1.0F;
	//   21   41:aload_0         
	//   22   42:fconst_1        
	//   23   43:putfield        #48  <Field float g>
		i = 1.0F;
	//   24   46:aload_0         
	//   25   47:fconst_1        
	//   26   48:putfield        #50  <Field float i>
		h = 0.0F;
	//   27   51:aload_0         
	//   28   52:fconst_0        
	//   29   53:putfield        #52  <Field float h>
		k = 0.0F;
	//   30   56:aload_0         
	//   31   57:fconst_0        
	//   32   58:putfield        #54  <Field float k>
		m = new Matrix();
	//   33   61:aload_0         
	//   34   62:new             #32  <Class Matrix>
	//   35   65:dup             
	//   36   66:invokespecial   #33  <Method void Matrix()>
	//   37   69:putfield        #56  <Field Matrix m>
		n = null;
	//   38   72:aload_0         
	//   39   73:aconst_null     
	//   40   74:putfield        #58  <Field String n>
		c = vectordrawablecompat$d.c;
	//   41   77:aload_0         
	//   42   78:aload_1         
	//   43   79:getfield        #42  <Field float c>
	//   44   82:putfield        #42  <Field float c>
		e = vectordrawablecompat$d.e;
	//   45   85:aload_0         
	//   46   86:aload_1         
	//   47   87:getfield        #44  <Field float e>
	//   48   90:putfield        #44  <Field float e>
		f = vectordrawablecompat$d.f;
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:getfield        #46  <Field float f>
	//   52   98:putfield        #46  <Field float f>
		g = vectordrawablecompat$d.g;
	//   53  101:aload_0         
	//   54  102:aload_1         
	//   55  103:getfield        #48  <Field float g>
	//   56  106:putfield        #48  <Field float g>
		i = vectordrawablecompat$d.i;
	//   57  109:aload_0         
	//   58  110:aload_1         
	//   59  111:getfield        #50  <Field float i>
	//   60  114:putfield        #50  <Field float i>
		h = vectordrawablecompat$d.h;
	//   61  117:aload_0         
	//   62  118:aload_1         
	//   63  119:getfield        #52  <Field float h>
	//   64  122:putfield        #52  <Field float h>
		k = vectordrawablecompat$d.k;
	//   65  125:aload_0         
	//   66  126:aload_1         
	//   67  127:getfield        #54  <Field float k>
	//   68  130:putfield        #54  <Field float k>
		p = vectordrawablecompat$d.p;
	//   69  133:aload_0         
	//   70  134:aload_1         
	//   71  135:getfield        #62  <Field int[] p>
	//   72  138:putfield        #62  <Field int[] p>
		n = vectordrawablecompat$d.n;
	//   73  141:aload_0         
	//   74  142:aload_1         
	//   75  143:getfield        #58  <Field String n>
	//   76  146:putfield        #58  <Field String n>
		b = vectordrawablecompat$d.b;
	//   77  149:aload_0         
	//   78  150:aload_1         
	//   79  151:getfield        #64  <Field int b>
	//   80  154:putfield        #64  <Field int b>
		if(n != null)
	//*  81  157:aload_0         
	//*  82  158:getfield        #58  <Field String n>
	//*  83  161:ifnull          174
			arraymap.put(((Object) (n)), ((Object) (this)));
	//   84  164:aload_2         
	//   85  165:aload_0         
	//   86  166:getfield        #58  <Field String n>
	//   87  169:aload_0         
	//   88  170:invokevirtual   #70  <Method Object ArrayMap.put(Object, Object)>
	//   89  173:pop             
		m.set(vectordrawablecompat$d.m);
	//   90  174:aload_0         
	//   91  175:getfield        #56  <Field Matrix m>
	//   92  178:aload_1         
	//   93  179:getfield        #56  <Field Matrix m>
	//   94  182:invokevirtual   #74  <Method void Matrix.set(Matrix)>
		ArrayList arraylist = vectordrawablecompat$d.a;
	//   95  185:aload_1         
	//   96  186:getfield        #40  <Field ArrayList a>
	//   97  189:astore          4
		for(int j = 0; j < arraylist.size(); j++)
	//*  98  191:iconst_0        
	//*  99  192:istore_3        
	//* 100  193:iload_3         
	//* 101  194:aload           4
	//* 102  196:invokevirtual   #78  <Method int ArrayList.size()>
	//* 103  199:icmpge          328
		{
			vectordrawablecompat$d = ((VectorDrawableCompat$d) (arraylist.get(j)));
	//  104  202:aload           4
	//  105  204:iload_3         
	//  106  205:invokevirtual   #82  <Method Object ArrayList.get(int)>
	//  107  208:astore_1        
			if(vectordrawablecompat$d instanceof VectorDrawableCompat$d)
	//* 108  209:aload_1         
	//* 109  210:instanceof      #2   <Class VectorDrawableCompat$d>
	//* 110  213:ifeq            241
			{
				vectordrawablecompat$d = (VectorDrawableCompat$d)vectordrawablecompat$d;
	//  111  216:aload_1         
	//  112  217:checkcast       #2   <Class VectorDrawableCompat$d>
	//  113  220:astore_1        
				a.add(((Object) (new VectorDrawableCompat$d(vectordrawablecompat$d, arraymap))));
	//  114  221:aload_0         
	//  115  222:getfield        #40  <Field ArrayList a>
	//  116  225:new             #2   <Class VectorDrawableCompat$d>
	//  117  228:dup             
	//  118  229:aload_1         
	//  119  230:aload_2         
	//  120  231:invokespecial   #84  <Method void VectorDrawableCompat$d(VectorDrawableCompat$d, ArrayMap)>
	//  121  234:invokevirtual   #88  <Method boolean ArrayList.add(Object)>
	//  122  237:pop             
				continue;
	//  123  238:goto            321
			}
			if(vectordrawablecompat$d instanceof VectorDrawableCompat$c)
	//* 124  241:aload_1         
	//* 125  242:instanceof      #90  <Class VectorDrawableCompat$c>
	//* 126  245:ifeq            263
				vectordrawablecompat$d = ((VectorDrawableCompat$d) (new VectorDrawableCompat$c((VectorDrawableCompat$c)vectordrawablecompat$d)));
	//  127  248:new             #90  <Class VectorDrawableCompat$c>
	//  128  251:dup             
	//  129  252:aload_1         
	//  130  253:checkcast       #90  <Class VectorDrawableCompat$c>
	//  131  256:invokespecial   #93  <Method void VectorDrawableCompat$c(VectorDrawableCompat$c)>
	//  132  259:astore_1        
			else
	//* 133  260:goto            295
			if(vectordrawablecompat$d instanceof VectorDrawableCompat$a)
	//* 134  263:aload_1         
	//* 135  264:instanceof      #95  <Class VectorDrawableCompat$a>
	//* 136  267:ifeq            285
				vectordrawablecompat$d = ((VectorDrawableCompat$d) (new VectorDrawableCompat$a((VectorDrawableCompat$a)vectordrawablecompat$d)));
	//  137  270:new             #95  <Class VectorDrawableCompat$a>
	//  138  273:dup             
	//  139  274:aload_1         
	//  140  275:checkcast       #95  <Class VectorDrawableCompat$a>
	//  141  278:invokespecial   #98  <Method void VectorDrawableCompat$a(VectorDrawableCompat$a)>
	//  142  281:astore_1        
			else
	//* 143  282:goto            295
				throw new IllegalStateException("Unknown object in the tree!");
	//  144  285:new             #100 <Class IllegalStateException>
	//  145  288:dup             
	//  146  289:ldc1            #102 <String "Unknown object in the tree!">
	//  147  291:invokespecial   #105 <Method void IllegalStateException(String)>
	//  148  294:athrow          
			a.add(((Object) (vectordrawablecompat$d)));
	//  149  295:aload_0         
	//  150  296:getfield        #40  <Field ArrayList a>
	//  151  299:aload_1         
	//  152  300:invokevirtual   #88  <Method boolean ArrayList.add(Object)>
	//  153  303:pop             
			if(((VectorDrawableCompat$e) (vectordrawablecompat$d)).p != null)
	//* 154  304:aload_1         
	//* 155  305:getfield        #109 <Field String VectorDrawableCompat$e.p>
	//* 156  308:ifnull          321
				arraymap.put(((Object) (((VectorDrawableCompat$e) (vectordrawablecompat$d)).p)), ((Object) (vectordrawablecompat$d)));
	//  157  311:aload_2         
	//  158  312:aload_1         
	//  159  313:getfield        #109 <Field String VectorDrawableCompat$e.p>
	//  160  316:aload_1         
	//  161  317:invokevirtual   #70  <Method Object ArrayMap.put(Object, Object)>
	//  162  320:pop             
		}

	//  163  321:iload_3         
	//  164  322:iconst_1        
	//  165  323:iadd            
	//  166  324:istore_3        
	//* 167  325:goto            193
	//  168  328:return          
	}
}
