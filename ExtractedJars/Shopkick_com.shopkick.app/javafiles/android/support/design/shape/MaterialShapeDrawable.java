// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.shape;

import android.content.res.ColorStateList;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.TintAwareDrawable;

// Referenced classes of package android.support.design.shape:
//			ShapePath, EdgeTreatment, ShapePathModel, CornerTreatment

public class MaterialShapeDrawable extends Drawable
	implements TintAwareDrawable
{

	public MaterialShapeDrawable()
	{
		this(((ShapePathModel) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #58  <Method void MaterialShapeDrawable(ShapePathModel)>
	//    3    5:return          
	}

	public MaterialShapeDrawable(ShapePathModel shapepathmodel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Drawable()>
		paint = new Paint();
	//    2    4:aload_0         
	//    3    5:new             #63  <Class Paint>
	//    4    8:dup             
	//    5    9:invokespecial   #64  <Method void Paint()>
	//    6   12:putfield        #66  <Field Paint paint>
		cornerTransforms = new Matrix[4];
	//    7   15:aload_0         
	//    8   16:iconst_4        
	//    9   17:anewarray       Matrix[]
	//   10   20:putfield        #70  <Field Matrix[] cornerTransforms>
		edgeTransforms = new Matrix[4];
	//   11   23:aload_0         
	//   12   24:iconst_4        
	//   13   25:anewarray       Matrix[]
	//   14   28:putfield        #72  <Field Matrix[] edgeTransforms>
		cornerPaths = new ShapePath[4];
	//   15   31:aload_0         
	//   16   32:iconst_4        
	//   17   33:anewarray       ShapePath[]
	//   18   36:putfield        #76  <Field ShapePath[] cornerPaths>
		matrix = new Matrix();
	//   19   39:aload_0         
	//   20   40:new             #68  <Class Matrix>
	//   21   43:dup             
	//   22   44:invokespecial   #77  <Method void Matrix()>
	//   23   47:putfield        #79  <Field Matrix matrix>
		path = new Path();
	//   24   50:aload_0         
	//   25   51:new             #81  <Class Path>
	//   26   54:dup             
	//   27   55:invokespecial   #82  <Method void Path()>
	//   28   58:putfield        #84  <Field Path path>
		pointF = new PointF();
	//   29   61:aload_0         
	//   30   62:new             #86  <Class PointF>
	//   31   65:dup             
	//   32   66:invokespecial   #87  <Method void PointF()>
	//   33   69:putfield        #89  <Field PointF pointF>
		shapePath = new ShapePath();
	//   34   72:aload_0         
	//   35   73:new             #74  <Class ShapePath>
	//   36   76:dup             
	//   37   77:invokespecial   #90  <Method void ShapePath()>
	//   38   80:putfield        #92  <Field ShapePath shapePath>
		transparentRegion = new Region();
	//   39   83:aload_0         
	//   40   84:new             #94  <Class Region>
	//   41   87:dup             
	//   42   88:invokespecial   #95  <Method void Region()>
	//   43   91:putfield        #97  <Field Region transparentRegion>
		scratchRegion = new Region();
	//   44   94:aload_0         
	//   45   95:new             #94  <Class Region>
	//   46   98:dup             
	//   47   99:invokespecial   #95  <Method void Region()>
	//   48  102:putfield        #99  <Field Region scratchRegion>
		scratch = new float[2];
	//   49  105:aload_0         
	//   50  106:iconst_2        
	//   51  107:newarray        float[]
	//   52  109:putfield        #101 <Field float[] scratch>
		scratch2 = new float[2];
	//   53  112:aload_0         
	//   54  113:iconst_2        
	//   55  114:newarray        float[]
	//   56  116:putfield        #103 <Field float[] scratch2>
		shapedViewModel = null;
	//   57  119:aload_0         
	//   58  120:aconst_null     
	//   59  121:putfield        #105 <Field ShapePathModel shapedViewModel>
		int i = 0;
	//   60  124:iconst_0        
	//   61  125:istore_2        
		shadowEnabled = false;
	//   62  126:aload_0         
	//   63  127:iconst_0        
	//   64  128:putfield        #107 <Field boolean shadowEnabled>
		useTintColorForShadow = false;
	//   65  131:aload_0         
	//   66  132:iconst_0        
	//   67  133:putfield        #109 <Field boolean useTintColorForShadow>
		interpolation = 1.0F;
	//   68  136:aload_0         
	//   69  137:fconst_1        
	//   70  138:putfield        #111 <Field float interpolation>
		shadowColor = 0xff000000;
	//   71  141:aload_0         
	//   72  142:ldc1            #112 <Int 0xff000000>
	//   73  144:putfield        #114 <Field int shadowColor>
		shadowElevation = 5;
	//   74  147:aload_0         
	//   75  148:iconst_5        
	//   76  149:putfield        #116 <Field int shadowElevation>
		shadowRadius = 10;
	//   77  152:aload_0         
	//   78  153:bipush          10
	//   79  155:putfield        #118 <Field int shadowRadius>
		alpha = 255;
	//   80  158:aload_0         
	//   81  159:sipush          255
	//   82  162:putfield        #120 <Field int alpha>
		scale = 1.0F;
	//   83  165:aload_0         
	//   84  166:fconst_1        
	//   85  167:putfield        #122 <Field float scale>
		strokeWidth = 0.0F;
	//   86  170:aload_0         
	//   87  171:fconst_0        
	//   88  172:putfield        #124 <Field float strokeWidth>
		paintStyle = android.graphics.Paint.Style.FILL_AND_STROKE;
	//   89  175:aload_0         
	//   90  176:getstatic       #129 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL_AND_STROKE>
	//   91  179:putfield        #131 <Field android.graphics.Paint$Style paintStyle>
		tintMode = android.graphics.PorterDuff.Mode.SRC_IN;
	//   92  182:aload_0         
	//   93  183:getstatic       #136 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   94  186:putfield        #138 <Field android.graphics.PorterDuff$Mode tintMode>
		tintList = null;
	//   95  189:aload_0         
	//   96  190:aconst_null     
	//   97  191:putfield        #140 <Field ColorStateList tintList>
		shapedViewModel = shapepathmodel;
	//   98  194:aload_0         
	//   99  195:aload_1         
	//  100  196:putfield        #105 <Field ShapePathModel shapedViewModel>
		for(; i < 4; i++)
	//* 101  199:iload_2         
	//* 102  200:iconst_4        
	//* 103  201:icmpge          250
		{
			cornerTransforms[i] = new Matrix();
	//  104  204:aload_0         
	//  105  205:getfield        #70  <Field Matrix[] cornerTransforms>
	//  106  208:iload_2         
	//  107  209:new             #68  <Class Matrix>
	//  108  212:dup             
	//  109  213:invokespecial   #77  <Method void Matrix()>
	//  110  216:aastore         
			edgeTransforms[i] = new Matrix();
	//  111  217:aload_0         
	//  112  218:getfield        #72  <Field Matrix[] edgeTransforms>
	//  113  221:iload_2         
	//  114  222:new             #68  <Class Matrix>
	//  115  225:dup             
	//  116  226:invokespecial   #77  <Method void Matrix()>
	//  117  229:aastore         
			cornerPaths[i] = new ShapePath();
	//  118  230:aload_0         
	//  119  231:getfield        #76  <Field ShapePath[] cornerPaths>
	//  120  234:iload_2         
	//  121  235:new             #74  <Class ShapePath>
	//  122  238:dup             
	//  123  239:invokespecial   #90  <Method void ShapePath()>
	//  124  242:aastore         
		}

	//  125  243:iload_2         
	//  126  244:iconst_1        
	//  127  245:iadd            
	//  128  246:istore_2        
	//* 129  247:goto            199
	//  130  250:return          
	}

	private float angleOfCorner(int i, int j, int k)
	{
		getCoordinatesOfCorner(((i - 1) + 4) % 4, j, k, pointF);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:isub            
	//    4    4:iconst_4        
	//    5    5:iadd            
	//    6    6:iconst_4        
	//    7    7:irem            
	//    8    8:iload_2         
	//    9    9:iload_3         
	//   10   10:aload_0         
	//   11   11:getfield        #89  <Field PointF pointF>
	//   12   14:invokespecial   #147 <Method void getCoordinatesOfCorner(int, int, int, PointF)>
		float f = pointF.x;
	//   13   17:aload_0         
	//   14   18:getfield        #89  <Field PointF pointF>
	//   15   21:getfield        #150 <Field float PointF.x>
	//   16   24:fstore          4
		float f1 = pointF.y;
	//   17   26:aload_0         
	//   18   27:getfield        #89  <Field PointF pointF>
	//   19   30:getfield        #153 <Field float PointF.y>
	//   20   33:fstore          5
		getCoordinatesOfCorner((i + 1) % 4, j, k, pointF);
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:iconst_4        
	//   26   40:irem            
	//   27   41:iload_2         
	//   28   42:iload_3         
	//   29   43:aload_0         
	//   30   44:getfield        #89  <Field PointF pointF>
	//   31   47:invokespecial   #147 <Method void getCoordinatesOfCorner(int, int, int, PointF)>
		float f2 = pointF.x;
	//   32   50:aload_0         
	//   33   51:getfield        #89  <Field PointF pointF>
	//   34   54:getfield        #150 <Field float PointF.x>
	//   35   57:fstore          6
		float f3 = pointF.y;
	//   36   59:aload_0         
	//   37   60:getfield        #89  <Field PointF pointF>
	//   38   63:getfield        #153 <Field float PointF.y>
	//   39   66:fstore          7
		getCoordinatesOfCorner(i, j, k, pointF);
	//   40   68:aload_0         
	//   41   69:iload_1         
	//   42   70:iload_2         
	//   43   71:iload_3         
	//   44   72:aload_0         
	//   45   73:getfield        #89  <Field PointF pointF>
	//   46   76:invokespecial   #147 <Method void getCoordinatesOfCorner(int, int, int, PointF)>
		float f4 = pointF.x;
	//   47   79:aload_0         
	//   48   80:getfield        #89  <Field PointF pointF>
	//   49   83:getfield        #150 <Field float PointF.x>
	//   50   86:fstore          8
		float f5 = pointF.y;
	//   51   88:aload_0         
	//   52   89:getfield        #89  <Field PointF pointF>
	//   53   92:getfield        #153 <Field float PointF.y>
	//   54   95:fstore          9
		f1 = (float)Math.atan2(f1 - f5, f - f4) - (float)Math.atan2(f3 - f5, f2 - f4);
	//   55   97:fload           5
	//   56   99:fload           9
	//   57  101:fsub            
	//   58  102:f2d             
	//   59  103:fload           4
	//   60  105:fload           8
	//   61  107:fsub            
	//   62  108:f2d             
	//   63  109:invokestatic    #159 <Method double Math.atan2(double, double)>
	//   64  112:d2f             
	//   65  113:fload           7
	//   66  115:fload           9
	//   67  117:fsub            
	//   68  118:f2d             
	//   69  119:fload           6
	//   70  121:fload           8
	//   71  123:fsub            
	//   72  124:f2d             
	//   73  125:invokestatic    #159 <Method double Math.atan2(double, double)>
	//   74  128:d2f             
	//   75  129:fsub            
	//   76  130:fstore          5
		f = f1;
	//   77  132:fload           5
	//   78  134:fstore          4
		if(f1 < 0.0F)
	//*  79  136:fload           5
	//*  80  138:fconst_0        
	//*  81  139:fcmpg           
	//*  82  140:ifge            153
			f = (float)((double)f1 + 6.2831853071795862D);
	//   83  143:fload           5
	//   84  145:f2d             
	//   85  146:ldc2w           #160 <Double 6.2831853071795862D>
	//   86  149:dadd            
	//   87  150:d2f             
	//   88  151:fstore          4
		return f;
	//   89  153:fload           4
	//   90  155:freturn         
	}

	private float angleOfEdge(int i, int j, int k)
	{
		getCoordinatesOfCorner(i, j, k, pointF);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload_0         
	//    5    5:getfield        #89  <Field PointF pointF>
	//    6    8:invokespecial   #147 <Method void getCoordinatesOfCorner(int, int, int, PointF)>
		float f = pointF.x;
	//    7   11:aload_0         
	//    8   12:getfield        #89  <Field PointF pointF>
	//    9   15:getfield        #150 <Field float PointF.x>
	//   10   18:fstore          4
		float f1 = pointF.y;
	//   11   20:aload_0         
	//   12   21:getfield        #89  <Field PointF pointF>
	//   13   24:getfield        #153 <Field float PointF.y>
	//   14   27:fstore          5
		getCoordinatesOfCorner((i + 1) % 4, j, k, pointF);
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:iconst_4        
	//   20   34:irem            
	//   21   35:iload_2         
	//   22   36:iload_3         
	//   23   37:aload_0         
	//   24   38:getfield        #89  <Field PointF pointF>
	//   25   41:invokespecial   #147 <Method void getCoordinatesOfCorner(int, int, int, PointF)>
		float f2 = pointF.x;
	//   26   44:aload_0         
	//   27   45:getfield        #89  <Field PointF pointF>
	//   28   48:getfield        #150 <Field float PointF.x>
	//   29   51:fstore          6
		return (float)Math.atan2(pointF.y - f1, f2 - f);
	//   30   53:aload_0         
	//   31   54:getfield        #89  <Field PointF pointF>
	//   32   57:getfield        #153 <Field float PointF.y>
	//   33   60:fload           5
	//   34   62:fsub            
	//   35   63:f2d             
	//   36   64:fload           6
	//   37   66:fload           4
	//   38   68:fsub            
	//   39   69:f2d             
	//   40   70:invokestatic    #159 <Method double Math.atan2(double, double)>
	//   41   73:d2f             
	//   42   74:freturn         
	}

	private void appendCornerPath(int i, Path path1)
	{
		scratch[0] = cornerPaths[i].startX;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field float[] scratch>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #76  <Field ShapePath[] cornerPaths>
	//    5    9:iload_1         
	//    6   10:aaload          
	//    7   11:getfield        #167 <Field float ShapePath.startX>
	//    8   14:fastore         
		scratch[1] = cornerPaths[i].startY;
	//    9   15:aload_0         
	//   10   16:getfield        #101 <Field float[] scratch>
	//   11   19:iconst_1        
	//   12   20:aload_0         
	//   13   21:getfield        #76  <Field ShapePath[] cornerPaths>
	//   14   24:iload_1         
	//   15   25:aaload          
	//   16   26:getfield        #170 <Field float ShapePath.startY>
	//   17   29:fastore         
		cornerTransforms[i].mapPoints(scratch);
	//   18   30:aload_0         
	//   19   31:getfield        #70  <Field Matrix[] cornerTransforms>
	//   20   34:iload_1         
	//   21   35:aaload          
	//   22   36:aload_0         
	//   23   37:getfield        #101 <Field float[] scratch>
	//   24   40:invokevirtual   #174 <Method void Matrix.mapPoints(float[])>
		if(i == 0)
	//*  25   43:iload_1         
	//*  26   44:ifne            65
		{
			float af[] = scratch;
	//   27   47:aload_0         
	//   28   48:getfield        #101 <Field float[] scratch>
	//   29   51:astore_3        
			path1.moveTo(af[0], af[1]);
	//   30   52:aload_2         
	//   31   53:aload_3         
	//   32   54:iconst_0        
	//   33   55:faload          
	//   34   56:aload_3         
	//   35   57:iconst_1        
	//   36   58:faload          
	//   37   59:invokevirtual   #178 <Method void Path.moveTo(float, float)>
		} else
	//*  38   62:goto            80
		{
			float af1[] = scratch;
	//   39   65:aload_0         
	//   40   66:getfield        #101 <Field float[] scratch>
	//   41   69:astore_3        
			path1.lineTo(af1[0], af1[1]);
	//   42   70:aload_2         
	//   43   71:aload_3         
	//   44   72:iconst_0        
	//   45   73:faload          
	//   46   74:aload_3         
	//   47   75:iconst_1        
	//   48   76:faload          
	//   49   77:invokevirtual   #181 <Method void Path.lineTo(float, float)>
		}
		cornerPaths[i].applyToPath(cornerTransforms[i], path1);
	//   50   80:aload_0         
	//   51   81:getfield        #76  <Field ShapePath[] cornerPaths>
	//   52   84:iload_1         
	//   53   85:aaload          
	//   54   86:aload_0         
	//   55   87:getfield        #70  <Field Matrix[] cornerTransforms>
	//   56   90:iload_1         
	//   57   91:aaload          
	//   58   92:aload_2         
	//   59   93:invokevirtual   #185 <Method void ShapePath.applyToPath(Matrix, Path)>
	//   60   96:return          
	}

	private void appendEdgePath(int i, Path path1)
	{
		int j = (i + 1) % 4;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:iconst_4        
	//    4    4:irem            
	//    5    5:istore          4
		scratch[0] = cornerPaths[i].endX;
	//    6    7:aload_0         
	//    7    8:getfield        #101 <Field float[] scratch>
	//    8   11:iconst_0        
	//    9   12:aload_0         
	//   10   13:getfield        #76  <Field ShapePath[] cornerPaths>
	//   11   16:iload_1         
	//   12   17:aaload          
	//   13   18:getfield        #189 <Field float ShapePath.endX>
	//   14   21:fastore         
		scratch[1] = cornerPaths[i].endY;
	//   15   22:aload_0         
	//   16   23:getfield        #101 <Field float[] scratch>
	//   17   26:iconst_1        
	//   18   27:aload_0         
	//   19   28:getfield        #76  <Field ShapePath[] cornerPaths>
	//   20   31:iload_1         
	//   21   32:aaload          
	//   22   33:getfield        #192 <Field float ShapePath.endY>
	//   23   36:fastore         
		cornerTransforms[i].mapPoints(scratch);
	//   24   37:aload_0         
	//   25   38:getfield        #70  <Field Matrix[] cornerTransforms>
	//   26   41:iload_1         
	//   27   42:aaload          
	//   28   43:aload_0         
	//   29   44:getfield        #101 <Field float[] scratch>
	//   30   47:invokevirtual   #174 <Method void Matrix.mapPoints(float[])>
		scratch2[0] = cornerPaths[j].startX;
	//   31   50:aload_0         
	//   32   51:getfield        #103 <Field float[] scratch2>
	//   33   54:iconst_0        
	//   34   55:aload_0         
	//   35   56:getfield        #76  <Field ShapePath[] cornerPaths>
	//   36   59:iload           4
	//   37   61:aaload          
	//   38   62:getfield        #167 <Field float ShapePath.startX>
	//   39   65:fastore         
		scratch2[1] = cornerPaths[j].startY;
	//   40   66:aload_0         
	//   41   67:getfield        #103 <Field float[] scratch2>
	//   42   70:iconst_1        
	//   43   71:aload_0         
	//   44   72:getfield        #76  <Field ShapePath[] cornerPaths>
	//   45   75:iload           4
	//   46   77:aaload          
	//   47   78:getfield        #170 <Field float ShapePath.startY>
	//   48   81:fastore         
		cornerTransforms[j].mapPoints(scratch2);
	//   49   82:aload_0         
	//   50   83:getfield        #70  <Field Matrix[] cornerTransforms>
	//   51   86:iload           4
	//   52   88:aaload          
	//   53   89:aload_0         
	//   54   90:getfield        #103 <Field float[] scratch2>
	//   55   93:invokevirtual   #174 <Method void Matrix.mapPoints(float[])>
		float af[] = scratch;
	//   56   96:aload_0         
	//   57   97:getfield        #101 <Field float[] scratch>
	//   58  100:astore          5
		float f = af[0];
	//   59  102:aload           5
	//   60  104:iconst_0        
	//   61  105:faload          
	//   62  106:fstore_3        
		float af1[] = scratch2;
	//   63  107:aload_0         
	//   64  108:getfield        #103 <Field float[] scratch2>
	//   65  111:astore          6
		f = (float)Math.hypot(f - af1[0], af[1] - af1[1]);
	//   66  113:fload_3         
	//   67  114:aload           6
	//   68  116:iconst_0        
	//   69  117:faload          
	//   70  118:fsub            
	//   71  119:f2d             
	//   72  120:aload           5
	//   73  122:iconst_1        
	//   74  123:faload          
	//   75  124:aload           6
	//   76  126:iconst_1        
	//   77  127:faload          
	//   78  128:fsub            
	//   79  129:f2d             
	//   80  130:invokestatic    #195 <Method double Math.hypot(double, double)>
	//   81  133:d2f             
	//   82  134:fstore_3        
		shapePath.reset(0.0F, 0.0F);
	//   83  135:aload_0         
	//   84  136:getfield        #92  <Field ShapePath shapePath>
	//   85  139:fconst_0        
	//   86  140:fconst_0        
	//   87  141:invokevirtual   #198 <Method void ShapePath.reset(float, float)>
		getEdgeTreatmentForIndex(i).getEdgePath(f, interpolation, shapePath);
	//   88  144:aload_0         
	//   89  145:iload_1         
	//   90  146:invokespecial   #202 <Method EdgeTreatment getEdgeTreatmentForIndex(int)>
	//   91  149:fload_3         
	//   92  150:aload_0         
	//   93  151:getfield        #111 <Field float interpolation>
	//   94  154:aload_0         
	//   95  155:getfield        #92  <Field ShapePath shapePath>
	//   96  158:invokevirtual   #208 <Method void EdgeTreatment.getEdgePath(float, float, ShapePath)>
		shapePath.applyToPath(edgeTransforms[i], path1);
	//   97  161:aload_0         
	//   98  162:getfield        #92  <Field ShapePath shapePath>
	//   99  165:aload_0         
	//  100  166:getfield        #72  <Field Matrix[] edgeTransforms>
	//  101  169:iload_1         
	//  102  170:aaload          
	//  103  171:aload_2         
	//  104  172:invokevirtual   #185 <Method void ShapePath.applyToPath(Matrix, Path)>
	//  105  175:return          
	}

	private void getCoordinatesOfCorner(int i, int j, int k, PointF pointf)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 55
	//	               2 45
	//	               3 36
		default:
			pointf.set(0.0F, 0.0F);
	//    2   28:aload           4
	//    3   30:fconst_0        
	//    4   31:fconst_0        
	//    5   32:invokevirtual   #211 <Method void PointF.set(float, float)>
			return;
	//    6   35:return          

		case 3: // '\003'
			pointf.set(0.0F, k);
	//    7   36:aload           4
	//    8   38:fconst_0        
	//    9   39:iload_3         
	//   10   40:i2f             
	//   11   41:invokevirtual   #211 <Method void PointF.set(float, float)>
			return;
	//   12   44:return          

		case 2: // '\002'
			pointf.set(j, k);
	//   13   45:aload           4
	//   14   47:iload_2         
	//   15   48:i2f             
	//   16   49:iload_3         
	//   17   50:i2f             
	//   18   51:invokevirtual   #211 <Method void PointF.set(float, float)>
			return;
	//   19   54:return          

		case 1: // '\001'
			pointf.set(j, 0.0F);
	//   20   55:aload           4
	//   21   57:iload_2         
	//   22   58:i2f             
	//   23   59:fconst_0        
	//   24   60:invokevirtual   #211 <Method void PointF.set(float, float)>
			return;
	//   25   63:return          
		}
	}

	private CornerTreatment getCornerTreatmentForIndex(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 52
	//	               2 44
	//	               3 36
		default:
			return shapedViewModel.getTopLeftCorner();
	//    2   28:aload_0         
	//    3   29:getfield        #105 <Field ShapePathModel shapedViewModel>
	//    4   32:invokevirtual   #219 <Method CornerTreatment ShapePathModel.getTopLeftCorner()>
	//    5   35:areturn         

		case 3: // '\003'
			return shapedViewModel.getBottomLeftCorner();
	//    6   36:aload_0         
	//    7   37:getfield        #105 <Field ShapePathModel shapedViewModel>
	//    8   40:invokevirtual   #222 <Method CornerTreatment ShapePathModel.getBottomLeftCorner()>
	//    9   43:areturn         

		case 2: // '\002'
			return shapedViewModel.getBottomRightCorner();
	//   10   44:aload_0         
	//   11   45:getfield        #105 <Field ShapePathModel shapedViewModel>
	//   12   48:invokevirtual   #225 <Method CornerTreatment ShapePathModel.getBottomRightCorner()>
	//   13   51:areturn         

		case 1: // '\001'
			return shapedViewModel.getTopRightCorner();
	//   14   52:aload_0         
	//   15   53:getfield        #105 <Field ShapePathModel shapedViewModel>
	//   16   56:invokevirtual   #228 <Method CornerTreatment ShapePathModel.getTopRightCorner()>
	//   17   59:areturn         
		}
	}

	private EdgeTreatment getEdgeTreatmentForIndex(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 52
	//	               2 44
	//	               3 36
		default:
			return shapedViewModel.getTopEdge();
	//    2   28:aload_0         
	//    3   29:getfield        #105 <Field ShapePathModel shapedViewModel>
	//    4   32:invokevirtual   #232 <Method EdgeTreatment ShapePathModel.getTopEdge()>
	//    5   35:areturn         

		case 3: // '\003'
			return shapedViewModel.getLeftEdge();
	//    6   36:aload_0         
	//    7   37:getfield        #105 <Field ShapePathModel shapedViewModel>
	//    8   40:invokevirtual   #235 <Method EdgeTreatment ShapePathModel.getLeftEdge()>
	//    9   43:areturn         

		case 2: // '\002'
			return shapedViewModel.getBottomEdge();
	//   10   44:aload_0         
	//   11   45:getfield        #105 <Field ShapePathModel shapedViewModel>
	//   12   48:invokevirtual   #238 <Method EdgeTreatment ShapePathModel.getBottomEdge()>
	//   13   51:areturn         

		case 1: // '\001'
			return shapedViewModel.getRightEdge();
	//   14   52:aload_0         
	//   15   53:getfield        #105 <Field ShapePathModel shapedViewModel>
	//   16   56:invokevirtual   #241 <Method EdgeTreatment ShapePathModel.getRightEdge()>
	//   17   59:areturn         
		}
	}

	private void getPath(int i, int j, Path path1)
	{
		getPathForSize(i, j, path1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #246 <Method void getPathForSize(int, int, Path)>
		if(scale == 1.0F)
	//*   5    7:aload_0         
	//*   6    8:getfield        #122 <Field float scale>
	//*   7   11:fconst_1        
	//*   8   12:fcmpl           
	//*   9   13:ifne            17
		{
			return;
	//   10   16:return          
		} else
		{
			matrix.reset();
	//   11   17:aload_0         
	//   12   18:getfield        #79  <Field Matrix matrix>
	//   13   21:invokevirtual   #248 <Method void Matrix.reset()>
			Matrix matrix1 = matrix;
	//   14   24:aload_0         
	//   15   25:getfield        #79  <Field Matrix matrix>
	//   16   28:astore          5
			float f = scale;
	//   17   30:aload_0         
	//   18   31:getfield        #122 <Field float scale>
	//   19   34:fstore          4
			matrix1.setScale(f, f, i / 2, j / 2);
	//   20   36:aload           5
	//   21   38:fload           4
	//   22   40:fload           4
	//   23   42:iload_1         
	//   24   43:iconst_2        
	//   25   44:idiv            
	//   26   45:i2f             
	//   27   46:iload_2         
	//   28   47:iconst_2        
	//   29   48:idiv            
	//   30   49:i2f             
	//   31   50:invokevirtual   #252 <Method void Matrix.setScale(float, float, float, float)>
			path1.transform(matrix);
	//   32   53:aload_3         
	//   33   54:aload_0         
	//   34   55:getfield        #79  <Field Matrix matrix>
	//   35   58:invokevirtual   #256 <Method void Path.transform(Matrix)>
			return;
	//   36   61:return          
		}
	}

	private static int modulateAlpha(int i, int j)
	{
		return i * (j + (j >>> 7)) >>> 8;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_1         
	//    3    3:bipush          7
	//    4    5:iushr           
	//    5    6:iadd            
	//    6    7:imul            
	//    7    8:bipush          8
	//    8   10:iushr           
	//    9   11:ireturn         
	}

	private void setCornerPathAndTransform(int i, int j, int k)
	{
		getCoordinatesOfCorner(i, j, k, pointF);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload_0         
	//    5    5:getfield        #89  <Field PointF pointF>
	//    6    8:invokespecial   #147 <Method void getCoordinatesOfCorner(int, int, int, PointF)>
		float f = angleOfCorner(i, j, k);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:iload_2         
	//   10   14:iload_3         
	//   11   15:invokespecial   #262 <Method float angleOfCorner(int, int, int)>
	//   12   18:fstore          4
		getCornerTreatmentForIndex(i).getCornerPath(f, interpolation, cornerPaths[i]);
	//   13   20:aload_0         
	//   14   21:iload_1         
	//   15   22:invokespecial   #264 <Method CornerTreatment getCornerTreatmentForIndex(int)>
	//   16   25:fload           4
	//   17   27:aload_0         
	//   18   28:getfield        #111 <Field float interpolation>
	//   19   31:aload_0         
	//   20   32:getfield        #76  <Field ShapePath[] cornerPaths>
	//   21   35:iload_1         
	//   22   36:aaload          
	//   23   37:invokevirtual   #269 <Method void CornerTreatment.getCornerPath(float, float, ShapePath)>
		f = angleOfEdge(((i - 1) + 4) % 4, j, k);
	//   24   40:aload_0         
	//   25   41:iload_1         
	//   26   42:iconst_1        
	//   27   43:isub            
	//   28   44:iconst_4        
	//   29   45:iadd            
	//   30   46:iconst_4        
	//   31   47:irem            
	//   32   48:iload_2         
	//   33   49:iload_3         
	//   34   50:invokespecial   #271 <Method float angleOfEdge(int, int, int)>
	//   35   53:fstore          4
		cornerTransforms[i].reset();
	//   36   55:aload_0         
	//   37   56:getfield        #70  <Field Matrix[] cornerTransforms>
	//   38   59:iload_1         
	//   39   60:aaload          
	//   40   61:invokevirtual   #248 <Method void Matrix.reset()>
		cornerTransforms[i].setTranslate(pointF.x, pointF.y);
	//   41   64:aload_0         
	//   42   65:getfield        #70  <Field Matrix[] cornerTransforms>
	//   43   68:iload_1         
	//   44   69:aaload          
	//   45   70:aload_0         
	//   46   71:getfield        #89  <Field PointF pointF>
	//   47   74:getfield        #150 <Field float PointF.x>
	//   48   77:aload_0         
	//   49   78:getfield        #89  <Field PointF pointF>
	//   50   81:getfield        #153 <Field float PointF.y>
	//   51   84:invokevirtual   #274 <Method void Matrix.setTranslate(float, float)>
		cornerTransforms[i].preRotate((float)Math.toDegrees(f + 1.570796F));
	//   52   87:aload_0         
	//   53   88:getfield        #70  <Field Matrix[] cornerTransforms>
	//   54   91:iload_1         
	//   55   92:aaload          
	//   56   93:fload           4
	//   57   95:ldc2            #275 <Float 1.570796F>
	//   58   98:fadd            
	//   59   99:f2d             
	//   60  100:invokestatic    #279 <Method double Math.toDegrees(double)>
	//   61  103:d2f             
	//   62  104:invokevirtual   #283 <Method boolean Matrix.preRotate(float)>
	//   63  107:pop             
	//   64  108:return          
	}

	private void setEdgeTransform(int i, int j, int k)
	{
		scratch[0] = cornerPaths[i].endX;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field float[] scratch>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #76  <Field ShapePath[] cornerPaths>
	//    5    9:iload_1         
	//    6   10:aaload          
	//    7   11:getfield        #189 <Field float ShapePath.endX>
	//    8   14:fastore         
		scratch[1] = cornerPaths[i].endY;
	//    9   15:aload_0         
	//   10   16:getfield        #101 <Field float[] scratch>
	//   11   19:iconst_1        
	//   12   20:aload_0         
	//   13   21:getfield        #76  <Field ShapePath[] cornerPaths>
	//   14   24:iload_1         
	//   15   25:aaload          
	//   16   26:getfield        #192 <Field float ShapePath.endY>
	//   17   29:fastore         
		cornerTransforms[i].mapPoints(scratch);
	//   18   30:aload_0         
	//   19   31:getfield        #70  <Field Matrix[] cornerTransforms>
	//   20   34:iload_1         
	//   21   35:aaload          
	//   22   36:aload_0         
	//   23   37:getfield        #101 <Field float[] scratch>
	//   24   40:invokevirtual   #174 <Method void Matrix.mapPoints(float[])>
		float f = angleOfEdge(i, j, k);
	//   25   43:aload_0         
	//   26   44:iload_1         
	//   27   45:iload_2         
	//   28   46:iload_3         
	//   29   47:invokespecial   #271 <Method float angleOfEdge(int, int, int)>
	//   30   50:fstore          4
		edgeTransforms[i].reset();
	//   31   52:aload_0         
	//   32   53:getfield        #72  <Field Matrix[] edgeTransforms>
	//   33   56:iload_1         
	//   34   57:aaload          
	//   35   58:invokevirtual   #248 <Method void Matrix.reset()>
		Matrix matrix1 = edgeTransforms[i];
	//   36   61:aload_0         
	//   37   62:getfield        #72  <Field Matrix[] edgeTransforms>
	//   38   65:iload_1         
	//   39   66:aaload          
	//   40   67:astore          5
		float af[] = scratch;
	//   41   69:aload_0         
	//   42   70:getfield        #101 <Field float[] scratch>
	//   43   73:astore          6
		matrix1.setTranslate(af[0], af[1]);
	//   44   75:aload           5
	//   45   77:aload           6
	//   46   79:iconst_0        
	//   47   80:faload          
	//   48   81:aload           6
	//   49   83:iconst_1        
	//   50   84:faload          
	//   51   85:invokevirtual   #274 <Method void Matrix.setTranslate(float, float)>
		edgeTransforms[i].preRotate((float)Math.toDegrees(f));
	//   52   88:aload_0         
	//   53   89:getfield        #72  <Field Matrix[] edgeTransforms>
	//   54   92:iload_1         
	//   55   93:aaload          
	//   56   94:fload           4
	//   57   96:f2d             
	//   58   97:invokestatic    #279 <Method double Math.toDegrees(double)>
	//   59  100:d2f             
	//   60  101:invokevirtual   #283 <Method boolean Matrix.preRotate(float)>
	//   61  104:pop             
	//   62  105:return          
	}

	private void updateTintFilter()
	{
		ColorStateList colorstatelist = tintList;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ColorStateList tintList>
	//    2    4:astore_2        
		if(colorstatelist != null && tintMode != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          58
	//*   5    9:aload_0         
	//*   6   10:getfield        #138 <Field android.graphics.PorterDuff$Mode tintMode>
	//*   7   13:ifnonnull       19
	//*   8   16:goto            58
		{
			int i = colorstatelist.getColorForState(getState(), 0);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #289 <Method int[] getState()>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #295 <Method int ColorStateList.getColorForState(int[], int)>
	//   14   28:istore_1        
			tintFilter = new PorterDuffColorFilter(i, tintMode);
	//   15   29:aload_0         
	//   16   30:new             #297 <Class PorterDuffColorFilter>
	//   17   33:dup             
	//   18   34:iload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #138 <Field android.graphics.PorterDuff$Mode tintMode>
	//   21   39:invokespecial   #300 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   22   42:putfield        #302 <Field PorterDuffColorFilter tintFilter>
			if(useTintColorForShadow)
	//*  23   45:aload_0         
	//*  24   46:getfield        #109 <Field boolean useTintColorForShadow>
	//*  25   49:ifeq            57
				shadowColor = i;
	//   26   52:aload_0         
	//   27   53:iload_1         
	//   28   54:putfield        #114 <Field int shadowColor>
			return;
	//   29   57:return          
		} else
		{
			tintFilter = null;
	//   30   58:aload_0         
	//   31   59:aconst_null     
	//   32   60:putfield        #302 <Field PorterDuffColorFilter tintFilter>
			return;
	//   33   63:return          
		}
	}

	public void draw(Canvas canvas)
	{
		paint.setColorFilter(((ColorFilter) (tintFilter)));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Paint paint>
	//    2    4:aload_0         
	//    3    5:getfield        #302 <Field PorterDuffColorFilter tintFilter>
	//    4    8:invokevirtual   #308 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    5   11:pop             
		int i = paint.getAlpha();
	//    6   12:aload_0         
	//    7   13:getfield        #66  <Field Paint paint>
	//    8   16:invokevirtual   #312 <Method int Paint.getAlpha()>
	//    9   19:istore_2        
		paint.setAlpha(modulateAlpha(i, alpha));
	//   10   20:aload_0         
	//   11   21:getfield        #66  <Field Paint paint>
	//   12   24:iload_2         
	//   13   25:aload_0         
	//   14   26:getfield        #120 <Field int alpha>
	//   15   29:invokestatic    #314 <Method int modulateAlpha(int, int)>
	//   16   32:invokevirtual   #318 <Method void Paint.setAlpha(int)>
		paint.setStrokeWidth(strokeWidth);
	//   17   35:aload_0         
	//   18   36:getfield        #66  <Field Paint paint>
	//   19   39:aload_0         
	//   20   40:getfield        #124 <Field float strokeWidth>
	//   21   43:invokevirtual   #322 <Method void Paint.setStrokeWidth(float)>
		paint.setStyle(paintStyle);
	//   22   46:aload_0         
	//   23   47:getfield        #66  <Field Paint paint>
	//   24   50:aload_0         
	//   25   51:getfield        #131 <Field android.graphics.Paint$Style paintStyle>
	//   26   54:invokevirtual   #326 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		int j = shadowElevation;
	//   27   57:aload_0         
	//   28   58:getfield        #116 <Field int shadowElevation>
	//   29   61:istore_3        
		if(j > 0 && shadowEnabled)
	//*  30   62:iload_3         
	//*  31   63:ifle            92
	//*  32   66:aload_0         
	//*  33   67:getfield        #107 <Field boolean shadowEnabled>
	//*  34   70:ifeq            92
			paint.setShadowLayer(shadowRadius, 0.0F, j, shadowColor);
	//   35   73:aload_0         
	//   36   74:getfield        #66  <Field Paint paint>
	//   37   77:aload_0         
	//   38   78:getfield        #118 <Field int shadowRadius>
	//   39   81:i2f             
	//   40   82:fconst_0        
	//   41   83:iload_3         
	//   42   84:i2f             
	//   43   85:aload_0         
	//   44   86:getfield        #114 <Field int shadowColor>
	//   45   89:invokevirtual   #330 <Method void Paint.setShadowLayer(float, float, float, int)>
		if(shapedViewModel != null)
	//*  46   92:aload_0         
	//*  47   93:getfield        #105 <Field ShapePathModel shapedViewModel>
	//*  48   96:ifnull          130
		{
			getPath(canvas.getWidth(), canvas.getHeight(), path);
	//   49   99:aload_0         
	//   50  100:aload_1         
	//   51  101:invokevirtual   #335 <Method int Canvas.getWidth()>
	//   52  104:aload_1         
	//   53  105:invokevirtual   #338 <Method int Canvas.getHeight()>
	//   54  108:aload_0         
	//   55  109:getfield        #84  <Field Path path>
	//   56  112:invokespecial   #340 <Method void getPath(int, int, Path)>
			canvas.drawPath(path, paint);
	//   57  115:aload_1         
	//   58  116:aload_0         
	//   59  117:getfield        #84  <Field Path path>
	//   60  120:aload_0         
	//   61  121:getfield        #66  <Field Paint paint>
	//   62  124:invokevirtual   #344 <Method void Canvas.drawPath(Path, Paint)>
		} else
	//*  63  127:goto            150
		{
			canvas.drawRect(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight(), paint);
	//   64  130:aload_1         
	//   65  131:fconst_0        
	//   66  132:fconst_0        
	//   67  133:aload_1         
	//   68  134:invokevirtual   #335 <Method int Canvas.getWidth()>
	//   69  137:i2f             
	//   70  138:aload_1         
	//   71  139:invokevirtual   #338 <Method int Canvas.getHeight()>
	//   72  142:i2f             
	//   73  143:aload_0         
	//   74  144:getfield        #66  <Field Paint paint>
	//   75  147:invokevirtual   #348 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		paint.setAlpha(i);
	//   76  150:aload_0         
	//   77  151:getfield        #66  <Field Paint paint>
	//   78  154:iload_2         
	//   79  155:invokevirtual   #318 <Method void Paint.setAlpha(int)>
	//   80  158:return          
	}

	public float getInterpolation()
	{
		return interpolation;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field float interpolation>
	//    2    4:freturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public android.graphics.Paint.Style getPaintStyle()
	{
		return paintStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field android.graphics.Paint$Style paintStyle>
	//    2    4:areturn         
	}

	public void getPathForSize(int i, int j, Path path1)
	{
		path1.rewind();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #356 <Method void Path.rewind()>
		if(shapedViewModel == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #105 <Field ShapePathModel shapedViewModel>
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore          6
		int k = 0;
	//    8   15:iconst_0        
	//    9   16:istore          4
		int l;
		do
		{
			l = ((int) (flag));
	//   10   18:iload           6
	//   11   20:istore          5
			if(k >= 4)
				break;
	//   12   22:iload           4
	//   13   24:iconst_4        
	//   14   25:icmpge          53
			setCornerPathAndTransform(k, i, j);
	//   15   28:aload_0         
	//   16   29:iload           4
	//   17   31:iload_1         
	//   18   32:iload_2         
	//   19   33:invokespecial   #358 <Method void setCornerPathAndTransform(int, int, int)>
			setEdgeTransform(k, i, j);
	//   20   36:aload_0         
	//   21   37:iload           4
	//   22   39:iload_1         
	//   23   40:iload_2         
	//   24   41:invokespecial   #360 <Method void setEdgeTransform(int, int, int)>
			k++;
	//   25   44:iload           4
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore          4
		} while(true);
	//   29   50:goto            18
		for(; l < 4; l++)
	//*  30   53:iload           5
	//*  31   55:iconst_4        
	//*  32   56:icmpge          82
		{
			appendCornerPath(l, path1);
	//   33   59:aload_0         
	//   34   60:iload           5
	//   35   62:aload_3         
	//   36   63:invokespecial   #362 <Method void appendCornerPath(int, Path)>
			appendEdgePath(l, path1);
	//   37   66:aload_0         
	//   38   67:iload           5
	//   39   69:aload_3         
	//   40   70:invokespecial   #364 <Method void appendEdgePath(int, Path)>
		}

	//   41   73:iload           5
	//   42   75:iconst_1        
	//   43   76:iadd            
	//   44   77:istore          5
	//*  45   79:goto            53
		path1.close();
	//   46   82:aload_3         
	//   47   83:invokevirtual   #367 <Method void Path.close()>
	//   48   86:return          
	}

	public float getScale()
	{
		return scale;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field float scale>
	//    2    4:freturn         
	}

	public int getShadowElevation()
	{
		return shadowElevation;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int shadowElevation>
	//    2    4:ireturn         
	}

	public int getShadowRadius()
	{
		return shadowRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int shadowRadius>
	//    2    4:ireturn         
	}

	public ShapePathModel getShapedViewModel()
	{
		return shapedViewModel;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ShapePathModel shapedViewModel>
	//    2    4:areturn         
	}

	public float getStrokeWidth()
	{
		return strokeWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field float strokeWidth>
	//    2    4:freturn         
	}

	public ColorStateList getTintList()
	{
		return tintList;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ColorStateList tintList>
	//    2    4:areturn         
	}

	public Region getTransparentRegion()
	{
		Rect rect = getBounds();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #382 <Method Rect getBounds()>
	//    2    4:astore_1        
		transparentRegion.set(rect);
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field Region transparentRegion>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #385 <Method boolean Region.set(Rect)>
	//    7   13:pop             
		getPath(rect.width(), rect.height(), path);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #390 <Method int Rect.width()>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #393 <Method int Rect.height()>
	//   13   23:aload_0         
	//   14   24:getfield        #84  <Field Path path>
	//   15   27:invokespecial   #340 <Method void getPath(int, int, Path)>
		scratchRegion.setPath(path, transparentRegion);
	//   16   30:aload_0         
	//   17   31:getfield        #99  <Field Region scratchRegion>
	//   18   34:aload_0         
	//   19   35:getfield        #84  <Field Path path>
	//   20   38:aload_0         
	//   21   39:getfield        #97  <Field Region transparentRegion>
	//   22   42:invokevirtual   #397 <Method boolean Region.setPath(Path, Region)>
	//   23   45:pop             
		transparentRegion.op(scratchRegion, android.graphics.Region.Op.DIFFERENCE);
	//   24   46:aload_0         
	//   25   47:getfield        #97  <Field Region transparentRegion>
	//   26   50:aload_0         
	//   27   51:getfield        #99  <Field Region scratchRegion>
	//   28   54:getstatic       #403 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//   29   57:invokevirtual   #407 <Method boolean Region.op(Region, android.graphics.Region$Op)>
	//   30   60:pop             
		return transparentRegion;
	//   31   61:aload_0         
	//   32   62:getfield        #97  <Field Region transparentRegion>
	//   33   65:areturn         
	}

	public boolean isPointInTransparentRegion(int i, int j)
	{
		return getTransparentRegion().contains(i, j);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #411 <Method Region getTransparentRegion()>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #414 <Method boolean Region.contains(int, int)>
	//    5    9:ireturn         
	}

	public boolean isShadowEnabled()
	{
		return shadowEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean shadowEnabled>
	//    2    4:ireturn         
	}

	public void setAlpha(int i)
	{
		alpha = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #120 <Field int alpha>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #426 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		paint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Paint paint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #308 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #426 <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setInterpolation(float f)
	{
		interpolation = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #111 <Field float interpolation>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #426 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setPaintStyle(android.graphics.Paint.Style style)
	{
		paintStyle = style;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field android.graphics.Paint$Style paintStyle>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #426 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setScale(float f)
	{
		scale = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #122 <Field float scale>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #426 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setShadowColor(int i)
	{
		shadowColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #114 <Field int shadowColor>
		useTintColorForShadow = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #109 <Field boolean useTintColorForShadow>
		invalidateSelf();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #426 <Method void invalidateSelf()>
	//    8   14:return          
	}

	public void setShadowElevation(int i)
	{
		shadowElevation = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #116 <Field int shadowElevation>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #426 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setShadowEnabled(boolean flag)
	{
		shadowEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #107 <Field boolean shadowEnabled>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #426 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setShadowRadius(int i)
	{
		shadowRadius = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #118 <Field int shadowRadius>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #426 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setShapedViewModel(ShapePathModel shapepathmodel)
	{
		shapedViewModel = shapepathmodel;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field ShapePathModel shapedViewModel>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #426 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setStrokeWidth(float f)
	{
		strokeWidth = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #124 <Field float strokeWidth>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #426 <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setTint(int i)
	{
		setTintList(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #441 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #445 <Method void setTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		tintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #140 <Field ColorStateList tintList>
		updateTintFilter();
	//    3    5:aload_0         
	//    4    6:invokespecial   #447 <Method void updateTintFilter()>
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #426 <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		tintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #138 <Field android.graphics.PorterDuff$Mode tintMode>
		updateTintFilter();
	//    3    5:aload_0         
	//    4    6:invokespecial   #447 <Method void updateTintFilter()>
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #426 <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setUseTintColorForShadow(boolean flag)
	{
		useTintColorForShadow = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #109 <Field boolean useTintColorForShadow>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #426 <Method void invalidateSelf()>
	//    5    9:return          
	}

	private int alpha;
	private final ShapePath cornerPaths[];
	private final Matrix cornerTransforms[];
	private final Matrix edgeTransforms[];
	private float interpolation;
	private final Matrix matrix;
	private final Paint paint;
	private android.graphics.Paint.Style paintStyle;
	private final Path path;
	private final PointF pointF;
	private float scale;
	private final float scratch[];
	private final float scratch2[];
	private final Region scratchRegion;
	private int shadowColor;
	private int shadowElevation;
	private boolean shadowEnabled;
	private int shadowRadius;
	private final ShapePath shapePath;
	private ShapePathModel shapedViewModel;
	private float strokeWidth;
	private PorterDuffColorFilter tintFilter;
	private ColorStateList tintList;
	private android.graphics.PorterDuff.Mode tintMode;
	private final Region transparentRegion;
	private boolean useTintColorForShadow;
}
