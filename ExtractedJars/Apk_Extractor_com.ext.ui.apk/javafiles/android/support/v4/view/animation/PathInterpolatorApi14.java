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
		float f1 = 1.0F;
	//    0    0:fconst_1        
	//    1    1:fstore_2        
		if(f <= 0.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_0        
	//*   4    4:fcmpg           
	//*   5    5:ifgt            12
			f1 = 0.0F;
	//    6    8:fconst_0        
	//    7    9:fstore_2        
		else
	//*   8   10:fload_2         
	//*   9   11:freturn         
		if(f < 1.0F)
	//*  10   12:fload_1         
	//*  11   13:fconst_1        
	//*  12   14:fcmpl           
	//*  13   15:ifge            10
		{
			int j = 0;
	//   14   18:iconst_0        
	//   15   19:istore          4
			int i;
			for(i = mX.length - 1; i - j > 1;)
	//*  16   21:aload_0         
	//*  17   22:getfield        #41  <Field float[] mX>
	//*  18   25:arraylength     
	//*  19   26:iconst_1        
	//*  20   27:isub            
	//*  21   28:istore_3        
	//*  22   29:iload_3         
	//*  23   30:iload           4
	//*  24   32:isub            
	//*  25   33:iconst_1        
	//*  26   34:icmple          70
			{
				int k = (j + i) / 2;
	//   27   37:iload           4
	//   28   39:iload_3         
	//   29   40:iadd            
	//   30   41:iconst_2        
	//   31   42:idiv            
	//   32   43:istore          5
				if(f < mX[k])
	//*  33   45:fload_1         
	//*  34   46:aload_0         
	//*  35   47:getfield        #41  <Field float[] mX>
	//*  36   50:iload           5
	//*  37   52:faload          
	//*  38   53:fcmpg           
	//*  39   54:ifge            63
					i = k;
	//   40   57:iload           5
	//   41   59:istore_3        
				else
	//*  42   60:goto            29
					j = k;
	//   43   63:iload           5
	//   44   65:istore          4
			}

	//*  45   67:goto            60
			float f2 = mX[i] - mX[j];
	//   46   70:aload_0         
	//   47   71:getfield        #41  <Field float[] mX>
	//   48   74:iload_3         
	//   49   75:faload          
	//   50   76:aload_0         
	//   51   77:getfield        #41  <Field float[] mX>
	//   52   80:iload           4
	//   53   82:faload          
	//   54   83:fsub            
	//   55   84:fstore_2        
			if(f2 == 0.0F)
	//*  56   85:fload_2         
	//*  57   86:fconst_0        
	//*  58   87:fcmpl           
	//*  59   88:ifne            99
			{
				return mY[j];
	//   60   91:aload_0         
	//   61   92:getfield        #43  <Field float[] mY>
	//   62   95:iload           4
	//   63   97:faload          
	//   64   98:freturn         
			} else
			{
				f = (f - mX[j]) / f2;
	//   65   99:fload_1         
	//   66  100:aload_0         
	//   67  101:getfield        #41  <Field float[] mX>
	//   68  104:iload           4
	//   69  106:faload          
	//   70  107:fsub            
	//   71  108:fload_2         
	//   72  109:fdiv            
	//   73  110:fstore_1        
				f2 = mY[j];
	//   74  111:aload_0         
	//   75  112:getfield        #43  <Field float[] mY>
	//   76  115:iload           4
	//   77  117:faload          
	//   78  118:fstore_2        
				return f * (mY[i] - f2) + f2;
	//   79  119:fload_1         
	//   80  120:aload_0         
	//   81  121:getfield        #43  <Field float[] mY>
	//   82  124:iload_3         
	//   83  125:faload          
	//   84  126:fload_2         
	//   85  127:fsub            
	//   86  128:fmul            
	//   87  129:fload_2         
	//   88  130:fadd            
	//   89  131:freturn         
			}
		}
		return f1;
	}

	private static final float PRECISION = 0.002F;
	private final float mX[];
	private final float mY[];
}
