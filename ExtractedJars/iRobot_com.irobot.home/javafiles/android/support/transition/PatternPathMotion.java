// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.support.v4.a.b;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.transition:
//			PathMotion, ac

public class PatternPathMotion extends PathMotion
{

	public PatternPathMotion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void PathMotion()>
		b = new Path();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Path()>
	//    6   12:putfield        #18  <Field Path b>
		c = new Matrix();
	//    7   15:aload_0         
	//    8   16:new             #20  <Class Matrix>
	//    9   19:dup             
	//   10   20:invokespecial   #21  <Method void Matrix()>
	//   11   23:putfield        #23  <Field Matrix c>
		b.lineTo(1.0F, 0.0F);
	//   12   26:aload_0         
	//   13   27:getfield        #18  <Field Path b>
	//   14   30:fconst_1        
	//   15   31:fconst_0        
	//   16   32:invokevirtual   #27  <Method void Path.lineTo(float, float)>
		a = b;
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #18  <Field Path b>
	//   20   40:putfield        #29  <Field Path a>
	//   21   43:return          
	}

	public PatternPathMotion(Context context, AttributeSet attributeset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void PathMotion()>
		b = new Path();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Path()>
	//    6   12:putfield        #18  <Field Path b>
		c = new Matrix();
	//    7   15:aload_0         
	//    8   16:new             #20  <Class Matrix>
	//    9   19:dup             
	//   10   20:invokespecial   #21  <Method void Matrix()>
	//   11   23:putfield        #23  <Field Matrix c>
		context = ((Context) (context.obtainStyledAttributes(attributeset, ac.k)));
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:getstatic       #37  <Field int[] ac.k>
	//   15   31:invokevirtual   #43  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   16   34:astore_1        
		attributeset = ((AttributeSet) (android.support.v4.content.a.c.a(((TypedArray) (context)), (XmlPullParser)attributeset, "patternPathData", 0)));
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:checkcast       #45  <Class XmlPullParser>
	//   20   40:ldc1            #47  <String "patternPathData">
	//   21   42:iconst_0        
	//   22   43:invokestatic    #52  <Method String c.a(TypedArray, XmlPullParser, String, int)>
	//   23   46:astore_2        
		if(attributeset != null)
			break MISSING_BLOCK_LABEL_61;
	//   24   47:aload_2         
	//   25   48:ifnonnull       61
		throw new RuntimeException("pathData must be supplied for patternPathMotion");
	//   26   51:new             #54  <Class RuntimeException>
	//   27   54:dup             
	//   28   55:ldc1            #56  <String "pathData must be supplied for patternPathMotion">
	//   29   57:invokespecial   #59  <Method void RuntimeException(String)>
	//   30   60:athrow          
		a(android.support.v4.a.b.a(((String) (attributeset))));
	//   31   61:aload_0         
	//   32   62:aload_2         
	//   33   63:invokestatic    #64  <Method Path b.a(String)>
	//   34   66:invokevirtual   #67  <Method void a(Path)>
		((TypedArray) (context)).recycle();
	//   35   69:aload_1         
	//   36   70:invokevirtual   #72  <Method void TypedArray.recycle()>
		return;
	//   37   73:return          
		attributeset;
	//   38   74:astore_2        
		((TypedArray) (context)).recycle();
	//   39   75:aload_1         
	//   40   76:invokevirtual   #72  <Method void TypedArray.recycle()>
		throw attributeset;
	//   41   79:aload_2         
	//   42   80:athrow          
	}

	private static float a(float f, float f1)
	{
		return (float)Math.sqrt(f * f + f1 * f1);
	//    0    0:fload_0         
	//    1    1:fload_0         
	//    2    2:fmul            
	//    3    3:fload_1         
	//    4    4:fload_1         
	//    5    5:fmul            
	//    6    6:fadd            
	//    7    7:f2d             
	//    8    8:invokestatic    #79  <Method double Math.sqrt(double)>
	//    9   11:d2f             
	//   10   12:freturn         
	}

	public Path a(float f, float f1, float f2, float f3)
	{
		f2 -= f;
	//    0    0:fload_3         
	//    1    1:fload_1         
	//    2    2:fsub            
	//    3    3:fstore_3        
		f3 -= f1;
	//    4    4:fload           4
	//    5    6:fload_2         
	//    6    7:fsub            
	//    7    8:fstore          4
		float f4 = a(f2, f3);
	//    8   10:fload_3         
	//    9   11:fload           4
	//   10   13:invokestatic    #82  <Method float a(float, float)>
	//   11   16:fstore          7
		double d = Math.atan2(f3, f2);
	//   12   18:fload           4
	//   13   20:f2d             
	//   14   21:fload_3         
	//   15   22:f2d             
	//   16   23:invokestatic    #86  <Method double Math.atan2(double, double)>
	//   17   26:dstore          5
		c.setScale(f4, f4);
	//   18   28:aload_0         
	//   19   29:getfield        #23  <Field Matrix c>
	//   20   32:fload           7
	//   21   34:fload           7
	//   22   36:invokevirtual   #89  <Method void Matrix.setScale(float, float)>
		c.postRotate((float)Math.toDegrees(d));
	//   23   39:aload_0         
	//   24   40:getfield        #23  <Field Matrix c>
	//   25   43:dload           5
	//   26   45:invokestatic    #92  <Method double Math.toDegrees(double)>
	//   27   48:d2f             
	//   28   49:invokevirtual   #96  <Method boolean Matrix.postRotate(float)>
	//   29   52:pop             
		c.postTranslate(f, f1);
	//   30   53:aload_0         
	//   31   54:getfield        #23  <Field Matrix c>
	//   32   57:fload_1         
	//   33   58:fload_2         
	//   34   59:invokevirtual   #100 <Method boolean Matrix.postTranslate(float, float)>
	//   35   62:pop             
		Path path = new Path();
	//   36   63:new             #15  <Class Path>
	//   37   66:dup             
	//   38   67:invokespecial   #16  <Method void Path()>
	//   39   70:astore          8
		b.transform(c, path);
	//   40   72:aload_0         
	//   41   73:getfield        #18  <Field Path b>
	//   42   76:aload_0         
	//   43   77:getfield        #23  <Field Matrix c>
	//   44   80:aload           8
	//   45   82:invokevirtual   #104 <Method void Path.transform(Matrix, Path)>
		return path;
	//   46   85:aload           8
	//   47   87:areturn         
	}

	public void a(Path path)
	{
		PathMeasure pathmeasure = new PathMeasure(path, false);
	//    0    0:new             #106 <Class PathMeasure>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #109 <Method void PathMeasure(Path, boolean)>
	//    5    9:astore          8
		float f = pathmeasure.getLength();
	//    6   11:aload           8
	//    7   13:invokevirtual   #113 <Method float PathMeasure.getLength()>
	//    8   16:fstore          4
		float af[] = new float[2];
	//    9   18:iconst_2        
	//   10   19:newarray        float[]
	//   11   21:astore          9
		pathmeasure.getPosTan(f, af, ((float []) (null)));
	//   12   23:aload           8
	//   13   25:fload           4
	//   14   27:aload           9
	//   15   29:aconst_null     
	//   16   30:invokevirtual   #117 <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   17   33:pop             
		float f2 = af[0];
	//   18   34:aload           9
	//   19   36:iconst_0        
	//   20   37:faload          
	//   21   38:fstore          6
		f = af[1];
	//   22   40:aload           9
	//   23   42:iconst_1        
	//   24   43:faload          
	//   25   44:fstore          4
		pathmeasure.getPosTan(0.0F, af, ((float []) (null)));
	//   26   46:aload           8
	//   27   48:fconst_0        
	//   28   49:aload           9
	//   29   51:aconst_null     
	//   30   52:invokevirtual   #117 <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   31   55:pop             
		float f3 = af[0];
	//   32   56:aload           9
	//   33   58:iconst_0        
	//   34   59:faload          
	//   35   60:fstore          7
		float f1 = af[1];
	//   36   62:aload           9
	//   37   64:iconst_1        
	//   38   65:faload          
	//   39   66:fstore          5
		if(f3 == f2 && f1 == f)
	//*  40   68:fload           7
	//*  41   70:fload           6
	//*  42   72:fcmpl           
	//*  43   73:ifne            94
	//*  44   76:fload           5
	//*  45   78:fload           4
	//*  46   80:fcmpl           
	//*  47   81:ifne            94
		{
			throw new IllegalArgumentException("pattern must not end at the starting point");
	//   48   84:new             #119 <Class IllegalArgumentException>
	//   49   87:dup             
	//   50   88:ldc1            #121 <String "pattern must not end at the starting point">
	//   51   90:invokespecial   #122 <Method void IllegalArgumentException(String)>
	//   52   93:athrow          
		} else
		{
			c.setTranslate(-f3, -f1);
	//   53   94:aload_0         
	//   54   95:getfield        #23  <Field Matrix c>
	//   55   98:fload           7
	//   56  100:fneg            
	//   57  101:fload           5
	//   58  103:fneg            
	//   59  104:invokevirtual   #125 <Method void Matrix.setTranslate(float, float)>
			f2 -= f3;
	//   60  107:fload           6
	//   61  109:fload           7
	//   62  111:fsub            
	//   63  112:fstore          6
			f -= f1;
	//   64  114:fload           4
	//   65  116:fload           5
	//   66  118:fsub            
	//   67  119:fstore          4
			f1 = 1.0F / a(f2, f);
	//   68  121:fconst_1        
	//   69  122:fload           6
	//   70  124:fload           4
	//   71  126:invokestatic    #82  <Method float a(float, float)>
	//   72  129:fdiv            
	//   73  130:fstore          5
			c.postScale(f1, f1);
	//   74  132:aload_0         
	//   75  133:getfield        #23  <Field Matrix c>
	//   76  136:fload           5
	//   77  138:fload           5
	//   78  140:invokevirtual   #128 <Method boolean Matrix.postScale(float, float)>
	//   79  143:pop             
			double d = Math.atan2(f, f2);
	//   80  144:fload           4
	//   81  146:f2d             
	//   82  147:fload           6
	//   83  149:f2d             
	//   84  150:invokestatic    #86  <Method double Math.atan2(double, double)>
	//   85  153:dstore_2        
			c.postRotate((float)Math.toDegrees(-d));
	//   86  154:aload_0         
	//   87  155:getfield        #23  <Field Matrix c>
	//   88  158:dload_2         
	//   89  159:dneg            
	//   90  160:invokestatic    #92  <Method double Math.toDegrees(double)>
	//   91  163:d2f             
	//   92  164:invokevirtual   #96  <Method boolean Matrix.postRotate(float)>
	//   93  167:pop             
			path.transform(c, b);
	//   94  168:aload_1         
	//   95  169:aload_0         
	//   96  170:getfield        #23  <Field Matrix c>
	//   97  173:aload_0         
	//   98  174:getfield        #18  <Field Path b>
	//   99  177:invokevirtual   #104 <Method void Path.transform(Matrix, Path)>
			a = path;
	//  100  180:aload_0         
	//  101  181:aload_1         
	//  102  182:putfield        #29  <Field Path a>
			return;
	//  103  185:return          
		}
	}

	private Path a;
	private final Path b;
	private final Matrix c;
}
