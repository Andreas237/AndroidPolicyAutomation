// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.bottomappbar;

import android.support.design.shape.EdgeTreatment;
import android.support.design.shape.ShapePath;

public class BottomAppBarTopEdgeTreatment extends EdgeTreatment
{

	public BottomAppBarTopEdgeTreatment(float f, float f1, float f2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void EdgeTreatment()>
		fabMargin = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #25  <Field float fabMargin>
		roundedCornerRadius = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #27  <Field float roundedCornerRadius>
		cradleVerticalOffset = f2;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #29  <Field float cradleVerticalOffset>
		if(f2 >= 0.0F)
	//*  11   19:fload_3         
	//*  12   20:fconst_0        
	//*  13   21:fcmpg           
	//*  14   22:iflt            31
		{
			horizontalOffset = 0.0F;
	//   15   25:aload_0         
	//   16   26:fconst_0        
	//   17   27:putfield        #31  <Field float horizontalOffset>
			return;
	//   18   30:return          
		} else
		{
			throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
	//   19   31:new             #33  <Class IllegalArgumentException>
	//   20   34:dup             
	//   21   35:ldc1            #35  <String "cradleVerticalOffset must be positive.">
	//   22   37:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   23   40:athrow          
		}
	}

	float getCradleVerticalOffset()
	{
		return cradleVerticalOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float cradleVerticalOffset>
	//    2    4:freturn         
	}

	public void getEdgePath(float f, float f1, ShapePath shapepath)
	{
		float f2 = fabDiameter;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float fabDiameter>
	//    2    4:fstore          4
		if(f2 == 0.0F)
	//*   3    6:fload           4
	//*   4    8:fconst_0        
	//*   5    9:fcmpl           
	//*   6   10:ifne            20
		{
			shapepath.lineTo(f, 0.0F);
	//    7   13:aload_3         
	//    8   14:fload_1         
	//    9   15:fconst_0        
	//   10   16:invokevirtual   #51  <Method void ShapePath.lineTo(float, float)>
			return;
	//   11   19:return          
		}
		f2 = (fabMargin * 2.0F + f2) / 2.0F;
	//   12   20:aload_0         
	//   13   21:getfield        #25  <Field float fabMargin>
	//   14   24:fconst_2        
	//   15   25:fmul            
	//   16   26:fload           4
	//   17   28:fadd            
	//   18   29:fconst_2        
	//   19   30:fdiv            
	//   20   31:fstore          4
		float f3 = f1 * roundedCornerRadius;
	//   21   33:fload_2         
	//   22   34:aload_0         
	//   23   35:getfield        #27  <Field float roundedCornerRadius>
	//   24   38:fmul            
	//   25   39:fstore          5
		float f4 = f / 2.0F + horizontalOffset;
	//   26   41:fload_1         
	//   27   42:fconst_2        
	//   28   43:fdiv            
	//   29   44:aload_0         
	//   30   45:getfield        #31  <Field float horizontalOffset>
	//   31   48:fadd            
	//   32   49:fstore          6
		f1 = cradleVerticalOffset * f1 + (1.0F - f1) * f2;
	//   33   51:aload_0         
	//   34   52:getfield        #29  <Field float cradleVerticalOffset>
	//   35   55:fload_2         
	//   36   56:fmul            
	//   37   57:fconst_1        
	//   38   58:fload_2         
	//   39   59:fsub            
	//   40   60:fload           4
	//   41   62:fmul            
	//   42   63:fadd            
	//   43   64:fstore_2        
		if(f1 / f2 >= 1.0F)
	//*  44   65:fload_2         
	//*  45   66:fload           4
	//*  46   68:fdiv            
	//*  47   69:fconst_1        
	//*  48   70:fcmpl           
	//*  49   71:iflt            81
		{
			shapepath.lineTo(f, 0.0F);
	//   50   74:aload_3         
	//   51   75:fload_1         
	//   52   76:fconst_0        
	//   53   77:invokevirtual   #51  <Method void ShapePath.lineTo(float, float)>
			return;
	//   54   80:return          
		} else
		{
			float f5 = f2 + f3;
	//   55   81:fload           4
	//   56   83:fload           5
	//   57   85:fadd            
	//   58   86:fstore          7
			float f7 = f1 + f3;
	//   59   88:fload_2         
	//   60   89:fload           5
	//   61   91:fadd            
	//   62   92:fstore          9
			float f8 = (float)Math.sqrt(f5 * f5 - f7 * f7);
	//   63   94:fload           7
	//   64   96:fload           7
	//   65   98:fmul            
	//   66   99:fload           9
	//   67  101:fload           9
	//   68  103:fmul            
	//   69  104:fsub            
	//   70  105:f2d             
	//   71  106:invokestatic    #57  <Method double Math.sqrt(double)>
	//   72  109:d2f             
	//   73  110:fstore          10
			f5 = f4 - f8;
	//   74  112:fload           6
	//   75  114:fload           10
	//   76  116:fsub            
	//   77  117:fstore          7
			float f6 = f4 + f8;
	//   78  119:fload           6
	//   79  121:fload           10
	//   80  123:fadd            
	//   81  124:fstore          8
			f7 = (float)Math.toDegrees(Math.atan(f8 / f7));
	//   82  126:fload           10
	//   83  128:fload           9
	//   84  130:fdiv            
	//   85  131:f2d             
	//   86  132:invokestatic    #60  <Method double Math.atan(double)>
	//   87  135:invokestatic    #63  <Method double Math.toDegrees(double)>
	//   88  138:d2f             
	//   89  139:fstore          9
			f8 = 90F - f7;
	//   90  141:ldc1            #64  <Float 90F>
	//   91  143:fload           9
	//   92  145:fsub            
	//   93  146:fstore          10
			float f9 = f5 - f3;
	//   94  148:fload           7
	//   95  150:fload           5
	//   96  152:fsub            
	//   97  153:fstore          11
			shapepath.lineTo(f9, 0.0F);
	//   98  155:aload_3         
	//   99  156:fload           11
	//  100  158:fconst_0        
	//  101  159:invokevirtual   #51  <Method void ShapePath.lineTo(float, float)>
			float f10 = f3 * 2.0F;
	//  102  162:fload           5
	//  103  164:fconst_2        
	//  104  165:fmul            
	//  105  166:fstore          12
			shapepath.addArc(f9, 0.0F, f5 + f3, f10, 270F, f7);
	//  106  168:aload_3         
	//  107  169:fload           11
	//  108  171:fconst_0        
	//  109  172:fload           7
	//  110  174:fload           5
	//  111  176:fadd            
	//  112  177:fload           12
	//  113  179:ldc1            #65  <Float 270F>
	//  114  181:fload           9
	//  115  183:invokevirtual   #69  <Method void ShapePath.addArc(float, float, float, float, float, float)>
			shapepath.addArc(f4 - f2, -f2 - f1, f4 + f2, f2 - f1, 180F - f8, f8 * 2.0F - 180F);
	//  116  186:aload_3         
	//  117  187:fload           6
	//  118  189:fload           4
	//  119  191:fsub            
	//  120  192:fload           4
	//  121  194:fneg            
	//  122  195:fload_2         
	//  123  196:fsub            
	//  124  197:fload           6
	//  125  199:fload           4
	//  126  201:fadd            
	//  127  202:fload           4
	//  128  204:fload_2         
	//  129  205:fsub            
	//  130  206:ldc1            #70  <Float 180F>
	//  131  208:fload           10
	//  132  210:fsub            
	//  133  211:fload           10
	//  134  213:fconst_2        
	//  135  214:fmul            
	//  136  215:ldc1            #70  <Float 180F>
	//  137  217:fsub            
	//  138  218:invokevirtual   #69  <Method void ShapePath.addArc(float, float, float, float, float, float)>
			shapepath.addArc(f6 - f3, 0.0F, f6 + f3, f10, 270F - f7, f7);
	//  139  221:aload_3         
	//  140  222:fload           8
	//  141  224:fload           5
	//  142  226:fsub            
	//  143  227:fconst_0        
	//  144  228:fload           8
	//  145  230:fload           5
	//  146  232:fadd            
	//  147  233:fload           12
	//  148  235:ldc1            #65  <Float 270F>
	//  149  237:fload           9
	//  150  239:fsub            
	//  151  240:fload           9
	//  152  242:invokevirtual   #69  <Method void ShapePath.addArc(float, float, float, float, float, float)>
			shapepath.lineTo(f, 0.0F);
	//  153  245:aload_3         
	//  154  246:fload_1         
	//  155  247:fconst_0        
	//  156  248:invokevirtual   #51  <Method void ShapePath.lineTo(float, float)>
			return;
	//  157  251:return          
		}
	}

	float getFabCradleMargin()
	{
		return fabMargin;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float fabMargin>
	//    2    4:freturn         
	}

	float getFabCradleRoundedCornerRadius()
	{
		return roundedCornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float roundedCornerRadius>
	//    2    4:freturn         
	}

	float getFabDiameter()
	{
		return fabDiameter;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float fabDiameter>
	//    2    4:freturn         
	}

	float getHorizontalOffset()
	{
		return horizontalOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float horizontalOffset>
	//    2    4:freturn         
	}

	void setCradleVerticalOffset(float f)
	{
		cradleVerticalOffset = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #29  <Field float cradleVerticalOffset>
	//    3    5:return          
	}

	void setFabCradleMargin(float f)
	{
		fabMargin = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #25  <Field float fabMargin>
	//    3    5:return          
	}

	void setFabCradleRoundedCornerRadius(float f)
	{
		roundedCornerRadius = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #27  <Field float roundedCornerRadius>
	//    3    5:return          
	}

	void setFabDiameter(float f)
	{
		fabDiameter = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #45  <Field float fabDiameter>
	//    3    5:return          
	}

	void setHorizontalOffset(float f)
	{
		horizontalOffset = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #31  <Field float horizontalOffset>
	//    3    5:return          
	}

	private static final int ANGLE_LEFT = 180;
	private static final int ANGLE_UP = 270;
	private static final int ARC_HALF = 180;
	private static final int ARC_QUARTER = 90;
	private float cradleVerticalOffset;
	private float fabDiameter;
	private float fabMargin;
	private float horizontalOffset;
	private float roundedCornerRadius;
}
