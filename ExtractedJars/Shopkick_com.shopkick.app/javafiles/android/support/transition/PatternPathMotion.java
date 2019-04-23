// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.PathParser;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.transition:
//			PathMotion, Styleable

public class PatternPathMotion extends PathMotion
{

	public PatternPathMotion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void PathMotion()>
		mPatternPath = new Path();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Path()>
	//    6   12:putfield        #18  <Field Path mPatternPath>
		mTempMatrix = new Matrix();
	//    7   15:aload_0         
	//    8   16:new             #20  <Class Matrix>
	//    9   19:dup             
	//   10   20:invokespecial   #21  <Method void Matrix()>
	//   11   23:putfield        #23  <Field Matrix mTempMatrix>
		mPatternPath.lineTo(1.0F, 0.0F);
	//   12   26:aload_0         
	//   13   27:getfield        #18  <Field Path mPatternPath>
	//   14   30:fconst_1        
	//   15   31:fconst_0        
	//   16   32:invokevirtual   #27  <Method void Path.lineTo(float, float)>
		mOriginalPatternPath = mPatternPath;
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #18  <Field Path mPatternPath>
	//   20   40:putfield        #29  <Field Path mOriginalPatternPath>
	//   21   43:return          
	}

	public PatternPathMotion(Context context, AttributeSet attributeset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void PathMotion()>
		mPatternPath = new Path();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Path()>
	//    6   12:putfield        #18  <Field Path mPatternPath>
		mTempMatrix = new Matrix();
	//    7   15:aload_0         
	//    8   16:new             #20  <Class Matrix>
	//    9   19:dup             
	//   10   20:invokespecial   #21  <Method void Matrix()>
	//   11   23:putfield        #23  <Field Matrix mTempMatrix>
		context = ((Context) (context.obtainStyledAttributes(attributeset, Styleable.PATTERN_PATH_MOTION)));
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:getstatic       #37  <Field int[] Styleable.PATTERN_PATH_MOTION>
	//   15   31:invokevirtual   #43  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   16   34:astore_1        
		attributeset = ((AttributeSet) (TypedArrayUtils.getNamedString(((TypedArray) (context)), (XmlPullParser)attributeset, "patternPathData", 0)));
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:checkcast       #45  <Class XmlPullParser>
	//   20   40:ldc1            #47  <String "patternPathData">
	//   21   42:iconst_0        
	//   22   43:invokestatic    #53  <Method String TypedArrayUtils.getNamedString(TypedArray, XmlPullParser, String, int)>
	//   23   46:astore_2        
		if(attributeset == null)
			break MISSING_BLOCK_LABEL_64;
	//   24   47:aload_2         
	//   25   48:ifnull          64
		setPatternPath(PathParser.createPathFromPathData(((String) (attributeset))));
	//   26   51:aload_0         
	//   27   52:aload_2         
	//   28   53:invokestatic    #59  <Method Path PathParser.createPathFromPathData(String)>
	//   29   56:invokevirtual   #63  <Method void setPatternPath(Path)>
		((TypedArray) (context)).recycle();
	//   30   59:aload_1         
	//   31   60:invokevirtual   #68  <Method void TypedArray.recycle()>
		return;
	//   32   63:return          
		throw new RuntimeException("pathData must be supplied for patternPathMotion");
	//   33   64:new             #70  <Class RuntimeException>
	//   34   67:dup             
	//   35   68:ldc1            #72  <String "pathData must be supplied for patternPathMotion">
	//   36   70:invokespecial   #75  <Method void RuntimeException(String)>
	//   37   73:athrow          
		attributeset;
	//   38   74:astore_2        
		((TypedArray) (context)).recycle();
	//   39   75:aload_1         
	//   40   76:invokevirtual   #68  <Method void TypedArray.recycle()>
		throw attributeset;
	//   41   79:aload_2         
	//   42   80:athrow          
	}

	public PatternPathMotion(Path path)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void PathMotion()>
		mPatternPath = new Path();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Path()>
	//    6   12:putfield        #18  <Field Path mPatternPath>
		mTempMatrix = new Matrix();
	//    7   15:aload_0         
	//    8   16:new             #20  <Class Matrix>
	//    9   19:dup             
	//   10   20:invokespecial   #21  <Method void Matrix()>
	//   11   23:putfield        #23  <Field Matrix mTempMatrix>
		setPatternPath(path);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #63  <Method void setPatternPath(Path)>
	//   15   31:return          
	}

	private static float distance(float f, float f1)
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
	//    8    8:invokestatic    #83  <Method double Math.sqrt(double)>
	//    9   11:d2f             
	//   10   12:freturn         
	}

	public Path getPath(float f, float f1, float f2, float f3)
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
		float f4 = distance(f2, f3);
	//    8   10:fload_3         
	//    9   11:fload           4
	//   10   13:invokestatic    #87  <Method float distance(float, float)>
	//   11   16:fstore          7
		double d = Math.atan2(f3, f2);
	//   12   18:fload           4
	//   13   20:f2d             
	//   14   21:fload_3         
	//   15   22:f2d             
	//   16   23:invokestatic    #91  <Method double Math.atan2(double, double)>
	//   17   26:dstore          5
		mTempMatrix.setScale(f4, f4);
	//   18   28:aload_0         
	//   19   29:getfield        #23  <Field Matrix mTempMatrix>
	//   20   32:fload           7
	//   21   34:fload           7
	//   22   36:invokevirtual   #94  <Method void Matrix.setScale(float, float)>
		mTempMatrix.postRotate((float)Math.toDegrees(d));
	//   23   39:aload_0         
	//   24   40:getfield        #23  <Field Matrix mTempMatrix>
	//   25   43:dload           5
	//   26   45:invokestatic    #97  <Method double Math.toDegrees(double)>
	//   27   48:d2f             
	//   28   49:invokevirtual   #101 <Method boolean Matrix.postRotate(float)>
	//   29   52:pop             
		mTempMatrix.postTranslate(f, f1);
	//   30   53:aload_0         
	//   31   54:getfield        #23  <Field Matrix mTempMatrix>
	//   32   57:fload_1         
	//   33   58:fload_2         
	//   34   59:invokevirtual   #105 <Method boolean Matrix.postTranslate(float, float)>
	//   35   62:pop             
		Path path = new Path();
	//   36   63:new             #15  <Class Path>
	//   37   66:dup             
	//   38   67:invokespecial   #16  <Method void Path()>
	//   39   70:astore          8
		mPatternPath.transform(mTempMatrix, path);
	//   40   72:aload_0         
	//   41   73:getfield        #18  <Field Path mPatternPath>
	//   42   76:aload_0         
	//   43   77:getfield        #23  <Field Matrix mTempMatrix>
	//   44   80:aload           8
	//   45   82:invokevirtual   #109 <Method void Path.transform(Matrix, Path)>
		return path;
	//   46   85:aload           8
	//   47   87:areturn         
	}

	public Path getPatternPath()
	{
		return mOriginalPatternPath;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Path mOriginalPatternPath>
	//    2    4:areturn         
	}

	public void setPatternPath(Path path)
	{
		PathMeasure pathmeasure = new PathMeasure(path, false);
	//    0    0:new             #113 <Class PathMeasure>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #116 <Method void PathMeasure(Path, boolean)>
	//    5    9:astore          8
		float f = pathmeasure.getLength();
	//    6   11:aload           8
	//    7   13:invokevirtual   #120 <Method float PathMeasure.getLength()>
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
	//   16   30:invokevirtual   #124 <Method boolean PathMeasure.getPosTan(float, float[], float[])>
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
	//   30   52:invokevirtual   #124 <Method boolean PathMeasure.getPosTan(float, float[], float[])>
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
	//*  43   73:ifne            97
	//*  44   76:fload           5
	//*  45   78:fload           4
	//*  46   80:fcmpl           
	//*  47   81:ifeq            87
	//*  48   84:goto            97
		{
			throw new IllegalArgumentException("pattern must not end at the starting point");
	//   49   87:new             #126 <Class IllegalArgumentException>
	//   50   90:dup             
	//   51   91:ldc1            #128 <String "pattern must not end at the starting point">
	//   52   93:invokespecial   #129 <Method void IllegalArgumentException(String)>
	//   53   96:athrow          
		} else
		{
			mTempMatrix.setTranslate(-f3, -f1);
	//   54   97:aload_0         
	//   55   98:getfield        #23  <Field Matrix mTempMatrix>
	//   56  101:fload           7
	//   57  103:fneg            
	//   58  104:fload           5
	//   59  106:fneg            
	//   60  107:invokevirtual   #132 <Method void Matrix.setTranslate(float, float)>
			f2 -= f3;
	//   61  110:fload           6
	//   62  112:fload           7
	//   63  114:fsub            
	//   64  115:fstore          6
			f -= f1;
	//   65  117:fload           4
	//   66  119:fload           5
	//   67  121:fsub            
	//   68  122:fstore          4
			f1 = 1.0F / distance(f2, f);
	//   69  124:fconst_1        
	//   70  125:fload           6
	//   71  127:fload           4
	//   72  129:invokestatic    #87  <Method float distance(float, float)>
	//   73  132:fdiv            
	//   74  133:fstore          5
			mTempMatrix.postScale(f1, f1);
	//   75  135:aload_0         
	//   76  136:getfield        #23  <Field Matrix mTempMatrix>
	//   77  139:fload           5
	//   78  141:fload           5
	//   79  143:invokevirtual   #135 <Method boolean Matrix.postScale(float, float)>
	//   80  146:pop             
			double d = Math.atan2(f, f2);
	//   81  147:fload           4
	//   82  149:f2d             
	//   83  150:fload           6
	//   84  152:f2d             
	//   85  153:invokestatic    #91  <Method double Math.atan2(double, double)>
	//   86  156:dstore_2        
			mTempMatrix.postRotate((float)Math.toDegrees(-d));
	//   87  157:aload_0         
	//   88  158:getfield        #23  <Field Matrix mTempMatrix>
	//   89  161:dload_2         
	//   90  162:dneg            
	//   91  163:invokestatic    #97  <Method double Math.toDegrees(double)>
	//   92  166:d2f             
	//   93  167:invokevirtual   #101 <Method boolean Matrix.postRotate(float)>
	//   94  170:pop             
			path.transform(mTempMatrix, mPatternPath);
	//   95  171:aload_1         
	//   96  172:aload_0         
	//   97  173:getfield        #23  <Field Matrix mTempMatrix>
	//   98  176:aload_0         
	//   99  177:getfield        #18  <Field Path mPatternPath>
	//  100  180:invokevirtual   #109 <Method void Path.transform(Matrix, Path)>
			mOriginalPatternPath = path;
	//  101  183:aload_0         
	//  102  184:aload_1         
	//  103  185:putfield        #29  <Field Path mOriginalPatternPath>
			return;
	//  104  188:return          
		}
	}

	private Path mOriginalPatternPath;
	private final Path mPatternPath;
	private final Matrix mTempMatrix;
}
