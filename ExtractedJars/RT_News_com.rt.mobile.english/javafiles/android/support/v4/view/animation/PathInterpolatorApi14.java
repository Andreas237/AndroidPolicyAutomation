// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

class PathInterpolatorApi14
	implements Interpolator
{

	PathInterpolatorApi14(float f, float f1)
	{
		this(createQuad(f, f1));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #18  <Method Path createQuad(float, float)>
	//    4    6:invokespecial   #21  <Method void PathInterpolatorApi14(Path)>
	//    5    9:return          
	}

	PathInterpolatorApi14(float f, float f1, float f2, float f3)
	{
		this(createCubic(f, f1, f2, f3));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:fload           4
	//    5    6:invokestatic    #27  <Method Path createCubic(float, float, float, float)>
	//    6    9:invokespecial   #21  <Method void PathInterpolatorApi14(Path)>
	//    7   12:return          
	}

	PathInterpolatorApi14(Path path)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		path = ((Path) (new PathMeasure(path, false)));
	//    2    4:new             #32  <Class PathMeasure>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokespecial   #35  <Method void PathMeasure(Path, boolean)>
	//    7   13:astore_1        
		float f = ((PathMeasure) (path)).getLength();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #39  <Method float PathMeasure.getLength()>
	//   10   18:fstore_2        
		int j = (int)(f / 0.002F) + 1;
	//   11   19:fload_2         
	//   12   20:ldc1            #9   <Float 0.002F>
	//   13   22:fdiv            
	//   14   23:f2i             
	//   15   24:iconst_1        
	//   16   25:iadd            
	//   17   26:istore          4
		mX = new float[j];
	//   18   28:aload_0         
	//   19   29:iload           4
	//   20   31:newarray        float[]
	//   21   33:putfield        #41  <Field float[] mX>
		mY = new float[j];
	//   22   36:aload_0         
	//   23   37:iload           4
	//   24   39:newarray        float[]
	//   25   41:putfield        #43  <Field float[] mY>
		float af[] = new float[2];
	//   26   44:iconst_2        
	//   27   45:newarray        float[]
	//   28   47:astore          5
		for(int i = 0; i < j; i++)
	//*  29   49:iconst_0        
	//*  30   50:istore_3        
	//*  31   51:iload_3         
	//*  32   52:iload           4
	//*  33   54:icmpge          102
		{
			((PathMeasure) (path)).getPosTan(((float)i * f) / (float)(j - 1), af, ((float []) (null)));
	//   34   57:aload_1         
	//   35   58:iload_3         
	//   36   59:i2f             
	//   37   60:fload_2         
	//   38   61:fmul            
	//   39   62:iload           4
	//   40   64:iconst_1        
	//   41   65:isub            
	//   42   66:i2f             
	//   43   67:fdiv            
	//   44   68:aload           5
	//   45   70:aconst_null     
	//   46   71:invokevirtual   #47  <Method boolean PathMeasure.getPosTan(float, float[], float[])>
	//   47   74:pop             
			mX[i] = af[0];
	//   48   75:aload_0         
	//   49   76:getfield        #41  <Field float[] mX>
	//   50   79:iload_3         
	//   51   80:aload           5
	//   52   82:iconst_0        
	//   53   83:faload          
	//   54   84:fastore         
			mY[i] = af[1];
	//   55   85:aload_0         
	//   56   86:getfield        #43  <Field float[] mY>
	//   57   89:iload_3         
	//   58   90:aload           5
	//   59   92:iconst_1        
	//   60   93:faload          
	//   61   94:fastore         
		}

	//   62   95:iload_3         
	//   63   96:iconst_1        
	//   64   97:iadd            
	//   65   98:istore_3        
	//*  66   99:goto            51
	//   67  102:return          
	}

	private static Path createCubic(float f, float f1, float f2, float f3)
	{
		Path path = new Path();
	//    0    0:new             #49  <Class Path>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void Path()>
	//    3    7:astore          4
		path.moveTo(0.0F, 0.0F);
	//    4    9:aload           4
	//    5   11:fconst_0        
	//    6   12:fconst_0        
	//    7   13:invokevirtual   #53  <Method void Path.moveTo(float, float)>
		path.cubicTo(f, f1, f2, f3, 1.0F, 1.0F);
	//    8   16:aload           4
	//    9   18:fload_0         
	//   10   19:fload_1         
	//   11   20:fload_2         
	//   12   21:fload_3         
	//   13   22:fconst_1        
	//   14   23:fconst_1        
	//   15   24:invokevirtual   #57  <Method void Path.cubicTo(float, float, float, float, float, float)>
		return path;
	//   16   27:aload           4
	//   17   29:areturn         
	}

	private static Path createQuad(float f, float f1)
	{
		Path path = new Path();
	//    0    0:new             #49  <Class Path>
	//    1    3:dup             
	//    2    4:invokespecial   #50  <Method void Path()>
	//    3    7:astore_2        
		path.moveTo(0.0F, 0.0F);
	//    4    8:aload_2         
	//    5    9:fconst_0        
	//    6   10:fconst_0        
	//    7   11:invokevirtual   #53  <Method void Path.moveTo(float, float)>
		path.quadTo(f, f1, 1.0F, 1.0F);
	//    8   14:aload_2         
	//    9   15:fload_0         
	//   10   16:fload_1         
	//   11   17:fconst_1        
	//   12   18:fconst_1        
	//   13   19:invokevirtual   #60  <Method void Path.quadTo(float, float, float, float)>
		return path;
	//   14   22:aload_2         
	//   15   23:areturn         
	}

	public float getInterpolation(float f)
	{
		if(f <= 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifgt            8
			return 0.0F;
	//    4    6:fconst_0        
	//    5    7:freturn         
		if(f >= 1.0F)
	//*   6    8:fload_1         
	//*   7    9:fconst_1        
	//*   8   10:fcmpl           
	//*   9   11:iflt            16
			return 1.0F;
	//   10   14:fconst_1        
	//   11   15:freturn         
		int j = 0;
	//   12   16:iconst_0        
	//   13   17:istore          4
		int i;
		for(i = mX.length - 1; i - j > 1;)
	//*  14   19:aload_0         
	//*  15   20:getfield        #41  <Field float[] mX>
	//*  16   23:arraylength     
	//*  17   24:iconst_1        
	//*  18   25:isub            
	//*  19   26:istore_3        
	//*  20   27:iload_3         
	//*  21   28:iload           4
	//*  22   30:isub            
	//*  23   31:iconst_1        
	//*  24   32:icmple          68
		{
			int k = (j + i) / 2;
	//   25   35:iload           4
	//   26   37:iload_3         
	//   27   38:iadd            
	//   28   39:iconst_2        
	//   29   40:idiv            
	//   30   41:istore          5
			if(f < mX[k])
	//*  31   43:fload_1         
	//*  32   44:aload_0         
	//*  33   45:getfield        #41  <Field float[] mX>
	//*  34   48:iload           5
	//*  35   50:faload          
	//*  36   51:fcmpg           
	//*  37   52:ifge            61
				i = k;
	//   38   55:iload           5
	//   39   57:istore_3        
			else
	//*  40   58:goto            27
				j = k;
	//   41   61:iload           5
	//   42   63:istore          4
		}

	//*  43   65:goto            27
		float f1 = mX[i] - mX[j];
	//   44   68:aload_0         
	//   45   69:getfield        #41  <Field float[] mX>
	//   46   72:iload_3         
	//   47   73:faload          
	//   48   74:aload_0         
	//   49   75:getfield        #41  <Field float[] mX>
	//   50   78:iload           4
	//   51   80:faload          
	//   52   81:fsub            
	//   53   82:fstore_2        
		if(f1 == 0.0F)
	//*  54   83:fload_2         
	//*  55   84:fconst_0        
	//*  56   85:fcmpl           
	//*  57   86:ifne            97
		{
			return mY[j];
	//   58   89:aload_0         
	//   59   90:getfield        #43  <Field float[] mY>
	//   60   93:iload           4
	//   61   95:faload          
	//   62   96:freturn         
		} else
		{
			f = (f - mX[j]) / f1;
	//   63   97:fload_1         
	//   64   98:aload_0         
	//   65   99:getfield        #41  <Field float[] mX>
	//   66  102:iload           4
	//   67  104:faload          
	//   68  105:fsub            
	//   69  106:fload_2         
	//   70  107:fdiv            
	//   71  108:fstore_1        
			f1 = mY[j];
	//   72  109:aload_0         
	//   73  110:getfield        #43  <Field float[] mY>
	//   74  113:iload           4
	//   75  115:faload          
	//   76  116:fstore_2        
			return f1 + f * (mY[i] - f1);
	//   77  117:fload_2         
	//   78  118:fload_1         
	//   79  119:aload_0         
	//   80  120:getfield        #43  <Field float[] mY>
	//   81  123:iload_3         
	//   82  124:faload          
	//   83  125:fload_2         
	//   84  126:fsub            
	//   85  127:fmul            
	//   86  128:fadd            
	//   87  129:freturn         
		}
	}

	private static final float PRECISION = 0.002F;
	private final float mX[];
	private final float mY[];
}
