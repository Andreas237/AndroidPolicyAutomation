// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.*;

// Referenced classes of package android.support.v4.widget:
//			MaterialProgressDrawable

class MaterialProgressDrawable$1 extends Animation
{

	public void applyTransformation(float f, Transformation transformation)
	{
		if(mFinishing)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field MaterialProgressDrawable this$0>
	//*   2    4:getfield        #28  <Field boolean MaterialProgressDrawable.mFinishing>
	//*   3    7:ifeq            23
		{
			applyFinishTranslation(f, val$ring);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field MaterialProgressDrawable this$0>
	//    6   14:fload_1         
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
	//    9   19:invokevirtual   #32  <Method void MaterialProgressDrawable.applyFinishTranslation(float, MaterialProgressDrawable$Ring)>
			return;
	//   10   22:return          
		}
		float f1 = getMinProgressArc(val$ring);
	//   11   23:aload_0         
	//   12   24:getfield        #17  <Field MaterialProgressDrawable this$0>
	//   13   27:aload_0         
	//   14   28:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
	//   15   31:invokevirtual   #36  <Method float MaterialProgressDrawable.getMinProgressArc(MaterialProgressDrawable$Ring)>
	//   16   34:fstore_3        
		float f2 = val$ring.getStartingEndTrim();
	//   17   35:aload_0         
	//   18   36:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
	//   19   39:invokevirtual   #42  <Method float MaterialProgressDrawable$Ring.getStartingEndTrim()>
	//   20   42:fstore          4
		float f4 = val$ring.getStartingStartTrim();
	//   21   44:aload_0         
	//   22   45:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
	//   23   48:invokevirtual   #45  <Method float MaterialProgressDrawable$Ring.getStartingStartTrim()>
	//   24   51:fstore          6
		float f3 = val$ring.getStartingRotation();
	//   25   53:aload_0         
	//   26   54:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
	//   27   57:invokevirtual   #48  <Method float MaterialProgressDrawable$Ring.getStartingRotation()>
	//   28   60:fstore          5
		updateRingColor(f, val$ring);
	//   29   62:aload_0         
	//   30   63:getfield        #17  <Field MaterialProgressDrawable this$0>
	//   31   66:fload_1         
	//   32   67:aload_0         
	//   33   68:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
	//   34   71:invokevirtual   #51  <Method void MaterialProgressDrawable.updateRingColor(float, MaterialProgressDrawable$Ring)>
		if(f <= 0.5F)
	//*  35   74:fload_1         
	//*  36   75:ldc1            #52  <Float 0.5F>
	//*  37   77:fcmpg           
	//*  38   78:ifgt            116
		{
			float f6 = f / 0.5F;
	//   39   81:fload_1         
	//   40   82:ldc1            #52  <Float 0.5F>
	//   41   84:fdiv            
	//   42   85:fstore          7
			f6 = MaterialProgressDrawable.MATERIAL_INTERPOLATOR.getInterpolation(f6);
	//   43   87:getstatic       #56  <Field Interpolator MaterialProgressDrawable.MATERIAL_INTERPOLATOR>
	//   44   90:fload           7
	//   45   92:invokeinterface #62  <Method float Interpolator.getInterpolation(float)>
	//   46   97:fstore          7
			val$ring.setStartTrim(f4 + (0.8F - f1) * f6);
	//   47   99:aload_0         
	//   48  100:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
	//   49  103:fload           6
	//   50  105:ldc1            #63  <Float 0.8F>
	//   51  107:fload_3         
	//   52  108:fsub            
	//   53  109:fload           7
	//   54  111:fmul            
	//   55  112:fadd            
	//   56  113:invokevirtual   #67  <Method void MaterialProgressDrawable$Ring.setStartTrim(float)>
		}
		if(f > 0.5F)
	//*  57  116:fload_1         
	//*  58  117:ldc1            #52  <Float 0.5F>
	//*  59  119:fcmpl           
	//*  60  120:ifle            161
		{
			float f5 = (f - 0.5F) / 0.5F;
	//   61  123:fload_1         
	//   62  124:ldc1            #52  <Float 0.5F>
	//   63  126:fsub            
	//   64  127:ldc1            #52  <Float 0.5F>
	//   65  129:fdiv            
	//   66  130:fstore          6
			f5 = MaterialProgressDrawable.MATERIAL_INTERPOLATOR.getInterpolation(f5);
	//   67  132:getstatic       #56  <Field Interpolator MaterialProgressDrawable.MATERIAL_INTERPOLATOR>
	//   68  135:fload           6
	//   69  137:invokeinterface #62  <Method float Interpolator.getInterpolation(float)>
	//   70  142:fstore          6
			val$ring.setEndTrim(f2 + f5 * (0.8F - f1));
	//   71  144:aload_0         
	//   72  145:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
	//   73  148:fload           4
	//   74  150:fload           6
	//   75  152:ldc1            #63  <Float 0.8F>
	//   76  154:fload_3         
	//   77  155:fsub            
	//   78  156:fmul            
	//   79  157:fadd            
	//   80  158:invokevirtual   #70  <Method void MaterialProgressDrawable$Ring.setEndTrim(float)>
		}
		val$ring.setRotation(f3 + 0.25F * f);
	//   81  161:aload_0         
	//   82  162:getfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
	//   83  165:fload           5
	//   84  167:ldc1            #71  <Float 0.25F>
	//   85  169:fload_1         
	//   86  170:fmul            
	//   87  171:fadd            
	//   88  172:invokevirtual   #74  <Method void MaterialProgressDrawable$Ring.setRotation(float)>
		f1 = mRotationCount / 5F;
	//   89  175:aload_0         
	//   90  176:getfield        #17  <Field MaterialProgressDrawable this$0>
	//   91  179:getfield        #78  <Field float MaterialProgressDrawable.mRotationCount>
	//   92  182:ldc1            #79  <Float 5F>
	//   93  184:fdiv            
	//   94  185:fstore_3        
		setRotation(216F * f + f1 * 1080F);
	//   95  186:aload_0         
	//   96  187:getfield        #17  <Field MaterialProgressDrawable this$0>
	//   97  190:ldc1            #80  <Float 216F>
	//   98  192:fload_1         
	//   99  193:fmul            
	//  100  194:fload_3         
	//  101  195:ldc1            #81  <Float 1080F>
	//  102  197:fmul            
	//  103  198:fadd            
	//  104  199:invokevirtual   #82  <Method void MaterialProgressDrawable.setRotation(float)>
	//  105  202:return          
	}

	final MaterialProgressDrawable this$0;
	final ng val$ring;

	MaterialProgressDrawable$1()
	{
		this$0 = final_materialprogressdrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MaterialProgressDrawable this$0>
		val$ring = ng.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field MaterialProgressDrawable$Ring val$ring>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void Animation()>
	//    8   14:return          
	}
}
