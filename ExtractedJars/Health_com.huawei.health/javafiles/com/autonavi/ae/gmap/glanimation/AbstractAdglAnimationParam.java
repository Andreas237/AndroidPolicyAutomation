// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.glanimation;


public abstract class AbstractAdglAnimationParam
{

	public AbstractAdglAnimationParam()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		hasCheckedParam = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field boolean hasCheckedParam>
		needToCaculate = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field boolean needToCaculate>
		interpolationType = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #25  <Field int interpolationType>
		factor = 1.0F;
	//   11   19:aload_0         
	//   12   20:fconst_1        
	//   13   21:putfield        #27  <Field float factor>
		hasCheckedParam = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #21  <Field boolean hasCheckedParam>
		needToCaculate = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #23  <Field boolean needToCaculate>
		hasFromValue = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #29  <Field boolean hasFromValue>
		hasToValue = false;
	//   23   39:aload_0         
	//   24   40:iconst_0        
	//   25   41:putfield        #31  <Field boolean hasToValue>
	//   26   44:return          
	}

	static float bounce(float f)
	{
		return f * f * 8F;
	//    0    0:fload_0         
	//    1    1:fload_0         
	//    2    2:fmul            
	//    3    3:ldc1            #35  <Float 8F>
	//    4    5:fmul            
	//    5    6:freturn         
	}

	public abstract void checkParam();

	public float getCurMult()
	{
		return mult;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float mult>
	//    2    4:freturn         
	}

	public int getInterpolatorType()
	{
		return interpolationType;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int interpolationType>
	//    2    4:ireturn         
	}

	public boolean needToCaculate()
	{
		if(!hasCheckedParam)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean hasCheckedParam>
	//*   2    4:ifne            11
			checkParam();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #45  <Method void checkParam()>
		return hasCheckedParam && needToCaculate;
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field boolean hasCheckedParam>
	//    7   15:ifeq            27
	//    8   18:aload_0         
	//    9   19:getfield        #23  <Field boolean needToCaculate>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public void reset()
	{
		hasCheckedParam = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #21  <Field boolean hasCheckedParam>
		needToCaculate = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #23  <Field boolean needToCaculate>
		interpolationType = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #25  <Field int interpolationType>
		factor = 1.0F;
	//    9   15:aload_0         
	//   10   16:fconst_1        
	//   11   17:putfield        #27  <Field float factor>
		hasCheckedParam = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #21  <Field boolean hasCheckedParam>
		needToCaculate = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #23  <Field boolean needToCaculate>
		hasFromValue = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #29  <Field boolean hasFromValue>
		hasToValue = false;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #31  <Field boolean hasToValue>
	//   24   40:return          
	}

	public void setInterpolatorType(int i, float f)
	{
		interpolationType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int interpolationType>
		factor = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #27  <Field float factor>
	//    6   10:return          
	}

	public void setNormalizedTime(float f)
	{
		normalizedTime = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #52  <Field float normalizedTime>
		float f1 = 0.0F;
	//    3    5:fconst_0        
	//    4    6:fstore_2        
		switch(interpolationType)
	//*   5    7:aload_0         
	//*   6    8:getfield        #25  <Field int interpolationType>
		{
	//*   7   11:tableswitch     0 6: default 52
	//	               0 139
	//	               1 142
	//	               2 159
	//	               3 202
	//	               4 226
	//	               5 302
	//	               6 57
		default:
			f = f1;
	//    8   52:fload_2         
	//    9   53:fstore_1        
			break;
	//   10   54:goto            319

		case 0: // '\0'
			break;

		case 6: // '\006'
			if(f < 0.0F)
	//*  11   57:fload_1         
	//*  12   58:fconst_0        
	//*  13   59:fcmpg           
	//*  14   60:ifge            68
			{
				f = 0.0F;
	//   15   63:fconst_0        
	//   16   64:fstore_1        
				break;
	//   17   65:goto            319
			}
			if(f < 0.25F)
	//*  18   68:fload_1         
	//*  19   69:ldc1            #53  <Float 0.25F>
	//*  20   71:fcmpg           
	//*  21   72:ifge            83
			{
				f *= 4F;
	//   22   75:fload_1         
	//   23   76:ldc1            #54  <Float 4F>
	//   24   78:fmul            
	//   25   79:fstore_1        
				break;
	//   26   80:goto            319
			}
			if(f < 0.5F)
	//*  27   83:fload_1         
	//*  28   84:ldc1            #55  <Float 0.5F>
	//*  29   86:fcmpg           
	//*  30   87:ifge            100
			{
				f = 2.0F - 4F * f;
	//   31   90:fconst_2        
	//   32   91:ldc1            #54  <Float 4F>
	//   33   93:fload_1         
	//   34   94:fmul            
	//   35   95:fsub            
	//   36   96:fstore_1        
				break;
	//   37   97:goto            319
			}
			if(f < 0.75F)
	//*  38  100:fload_1         
	//*  39  101:ldc1            #56  <Float 0.75F>
	//*  40  103:fcmpg           
	//*  41  104:ifge            117
			{
				f = 4F * f - 2.0F;
	//   42  107:ldc1            #54  <Float 4F>
	//   43  109:fload_1         
	//   44  110:fmul            
	//   45  111:fconst_2        
	//   46  112:fsub            
	//   47  113:fstore_1        
				break;
	//   48  114:goto            319
			}
			if(f <= 1.0F)
	//*  49  117:fload_1         
	//*  50  118:fconst_1        
	//*  51  119:fcmpg           
	//*  52  120:ifgt            134
				f = 4F - 4F * f;
	//   53  123:ldc1            #54  <Float 4F>
	//   54  125:ldc1            #54  <Float 4F>
	//   55  127:fload_1         
	//   56  128:fmul            
	//   57  129:fsub            
	//   58  130:fstore_1        
			else
	//*  59  131:goto            319
				f = 0.0F;
	//   60  134:fconst_0        
	//   61  135:fstore_1        
			break;
	//   62  136:goto            319

	//*  63  139:goto            319
		case 1: // '\001'
			f = (float)Math.pow(f, factor * 2.0F);
	//   64  142:fload_1         
	//   65  143:f2d             
	//   66  144:aload_0         
	//   67  145:getfield        #27  <Field float factor>
	//   68  148:fconst_2        
	//   69  149:fmul            
	//   70  150:f2d             
	//   71  151:invokestatic    #62  <Method double Math.pow(double, double)>
	//   72  154:d2f             
	//   73  155:fstore_1        
			break;
	//   74  156:goto            319

		case 2: // '\002'
			if(factor == 1.0F)
	//*  75  159:aload_0         
	//*  76  160:getfield        #27  <Field float factor>
	//*  77  163:fconst_1        
	//*  78  164:fcmpl           
	//*  79  165:ifne            181
				f = 1.0F - (1.0F - f) * (1.0F - f);
	//   80  168:fconst_1        
	//   81  169:fconst_1        
	//   82  170:fload_1         
	//   83  171:fsub            
	//   84  172:fconst_1        
	//   85  173:fload_1         
	//   86  174:fsub            
	//   87  175:fmul            
	//   88  176:fsub            
	//   89  177:fstore_1        
			else
	//*  90  178:goto            319
				f = (float)(1.0D - Math.pow(1.0F - f, factor * 2.0F));
	//   91  181:dconst_1        
	//   92  182:fconst_1        
	//   93  183:fload_1         
	//   94  184:fsub            
	//   95  185:f2d             
	//   96  186:aload_0         
	//   97  187:getfield        #27  <Field float factor>
	//   98  190:fconst_2        
	//   99  191:fmul            
	//  100  192:f2d             
	//  101  193:invokestatic    #62  <Method double Math.pow(double, double)>
	//  102  196:dsub            
	//  103  197:d2f             
	//  104  198:fstore_1        
			break;
	//  105  199:goto            319

		case 3: // '\003'
			f = (float)(Math.cos((double)(1.0F + f) * 3.1415926535897931D) / 2D + 0.5D);
	//  106  202:fconst_1        
	//  107  203:fload_1         
	//  108  204:fadd            
	//  109  205:f2d             
	//  110  206:ldc2w           #63  <Double 3.1415926535897931D>
	//  111  209:dmul            
	//  112  210:invokestatic    #68  <Method double Math.cos(double)>
	//  113  213:ldc2w           #69  <Double 2D>
	//  114  216:ddiv            
	//  115  217:ldc2w           #71  <Double 0.5D>
	//  116  220:dadd            
	//  117  221:d2f             
	//  118  222:fstore_1        
			break;
	//  119  223:goto            319

		case 4: // '\004'
			f *= 1.1226F;
	//  120  226:fload_1         
	//  121  227:ldc1            #73  <Float 1.1226F>
	//  122  229:fmul            
	//  123  230:fstore_1        
			if(f < 0.3535F)
	//* 124  231:fload_1         
	//* 125  232:ldc1            #74  <Float 0.3535F>
	//* 126  234:fcmpg           
	//* 127  235:ifge            246
			{
				f = bounce(f);
	//  128  238:fload_1         
	//  129  239:invokestatic    #76  <Method float bounce(float)>
	//  130  242:fstore_1        
				break;
	//  131  243:goto            319
			}
			if(f < 0.7408F)
	//* 132  246:fload_1         
	//* 133  247:ldc1            #77  <Float 0.7408F>
	//* 134  249:fcmpg           
	//* 135  250:ifge            267
			{
				f = bounce(f - 0.54719F) + 0.7F;
	//  136  253:fload_1         
	//  137  254:ldc1            #78  <Float 0.54719F>
	//  138  256:fsub            
	//  139  257:invokestatic    #76  <Method float bounce(float)>
	//  140  260:ldc1            #79  <Float 0.7F>
	//  141  262:fadd            
	//  142  263:fstore_1        
				break;
	//  143  264:goto            319
			}
			if(f < 0.9644F)
	//* 144  267:fload_1         
	//* 145  268:ldc1            #80  <Float 0.9644F>
	//* 146  270:fcmpg           
	//* 147  271:ifge            288
				f = bounce(f - 0.8526F) + 0.9F;
	//  148  274:fload_1         
	//  149  275:ldc1            #81  <Float 0.8526F>
	//  150  277:fsub            
	//  151  278:invokestatic    #76  <Method float bounce(float)>
	//  152  281:ldc1            #82  <Float 0.9F>
	//  153  283:fadd            
	//  154  284:fstore_1        
			else
	//* 155  285:goto            319
				f = bounce(f - 1.0435F) + 0.95F;
	//  156  288:fload_1         
	//  157  289:ldc1            #83  <Float 1.0435F>
	//  158  291:fsub            
	//  159  292:invokestatic    #76  <Method float bounce(float)>
	//  160  295:ldc1            #84  <Float 0.95F>
	//  161  297:fadd            
	//  162  298:fstore_1        
			break;

	//* 163  299:goto            319
		case 5: // '\005'
			f--;
	//  164  302:fload_1         
	//  165  303:fconst_1        
	//  166  304:fsub            
	//  167  305:fstore_1        
			f = f * f * (3F * f + 2.0F) + 1.0F;
	//  168  306:fload_1         
	//  169  307:fload_1         
	//  170  308:fmul            
	//  171  309:ldc1            #85  <Float 3F>
	//  172  311:fload_1         
	//  173  312:fmul            
	//  174  313:fconst_2        
	//  175  314:fadd            
	//  176  315:fmul            
	//  177  316:fconst_1        
	//  178  317:fadd            
	//  179  318:fstore_1        
			break;
		}
		mult = f;
	//  180  319:aload_0         
	//  181  320:fload_1         
	//  182  321:putfield        #40  <Field float mult>
	//  183  324:return          
	}

	protected float factor;
	protected boolean hasCheckedParam;
	protected boolean hasFromValue;
	protected boolean hasToValue;
	protected int interpolationType;
	protected float mult;
	protected boolean needToCaculate;
	protected float normalizedTime;
}
