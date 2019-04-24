// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.view.ViewCompat;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeTransform

private static class ChangeTransform$Transforms
{

	public boolean equals(Object obj)
	{
		if(obj instanceof ChangeTransform$Transforms)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ChangeTransform$Transforms>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_1         
	//*   6   10:checkcast       #2   <Class ChangeTransform$Transforms>
	//*   7   13:astore_1        
			if(((ChangeTransform$Transforms) (obj = ((Object) ((ChangeTransform$Transforms)obj)))).mTranslationX == mTranslationX && ((ChangeTransform$Transforms) (obj)).mTranslationY == mTranslationY && ((ChangeTransform$Transforms) (obj)).mTranslationZ == mTranslationZ && ((ChangeTransform$Transforms) (obj)).mScaleX == mScaleX && ((ChangeTransform$Transforms) (obj)).mScaleY == mScaleY && ((ChangeTransform$Transforms) (obj)).mRotationX == mRotationX && ((ChangeTransform$Transforms) (obj)).mRotationY == mRotationY && ((ChangeTransform$Transforms) (obj)).mRotationZ == mRotationZ)
	//*   8   14:aload_1         
	//*   9   15:getfield        #29  <Field float mTranslationX>
	//*  10   18:aload_0         
	//*  11   19:getfield        #29  <Field float mTranslationX>
	//*  12   22:fcmpl           
	//*  13   23:ifne            7
	//*  14   26:aload_1         
	//*  15   27:getfield        #34  <Field float mTranslationY>
	//*  16   30:aload_0         
	//*  17   31:getfield        #34  <Field float mTranslationY>
	//*  18   34:fcmpl           
	//*  19   35:ifne            7
	//*  20   38:aload_1         
	//*  21   39:getfield        #42  <Field float mTranslationZ>
	//*  22   42:aload_0         
	//*  23   43:getfield        #42  <Field float mTranslationZ>
	//*  24   46:fcmpl           
	//*  25   47:ifne            7
	//*  26   50:aload_1         
	//*  27   51:getfield        #47  <Field float mScaleX>
	//*  28   54:aload_0         
	//*  29   55:getfield        #47  <Field float mScaleX>
	//*  30   58:fcmpl           
	//*  31   59:ifne            7
	//*  32   62:aload_1         
	//*  33   63:getfield        #52  <Field float mScaleY>
	//*  34   66:aload_0         
	//*  35   67:getfield        #52  <Field float mScaleY>
	//*  36   70:fcmpl           
	//*  37   71:ifne            7
	//*  38   74:aload_1         
	//*  39   75:getfield        #57  <Field float mRotationX>
	//*  40   78:aload_0         
	//*  41   79:getfield        #57  <Field float mRotationX>
	//*  42   82:fcmpl           
	//*  43   83:ifne            7
	//*  44   86:aload_1         
	//*  45   87:getfield        #62  <Field float mRotationY>
	//*  46   90:aload_0         
	//*  47   91:getfield        #62  <Field float mRotationY>
	//*  48   94:fcmpl           
	//*  49   95:ifne            7
	//*  50   98:aload_1         
	//*  51   99:getfield        #67  <Field float mRotationZ>
	//*  52  102:aload_0         
	//*  53  103:getfield        #67  <Field float mRotationZ>
	//*  54  106:fcmpl           
	//*  55  107:ifne            7
				return true;
	//   56  110:iconst_1        
	//   57  111:ireturn         
		return false;
	}

	public int hashCode()
	{
		int l1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          8
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		if(mTranslationX != 0.0F)
	//*   2    3:aload_0         
	//*   3    4:getfield        #29  <Field float mTranslationX>
	//*   4    7:fconst_0        
	//*   5    8:fcmpl           
	//*   6    9:ifeq            186
			i = Float.floatToIntBits(mTranslationX);
	//    7   12:aload_0         
	//    8   13:getfield        #29  <Field float mTranslationX>
	//    9   16:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   10   19:istore_1        
		else
	//*  11   20:aload_0         
	//*  12   21:getfield        #34  <Field float mTranslationY>
	//*  13   24:fconst_0        
	//*  14   25:fcmpl           
	//*  15   26:ifeq            191
	//*  16   29:aload_0         
	//*  17   30:getfield        #34  <Field float mTranslationY>
	//*  18   33:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//*  19   36:istore_2        
	//*  20   37:aload_0         
	//*  21   38:getfield        #42  <Field float mTranslationZ>
	//*  22   41:fconst_0        
	//*  23   42:fcmpl           
	//*  24   43:ifeq            196
	//*  25   46:aload_0         
	//*  26   47:getfield        #42  <Field float mTranslationZ>
	//*  27   50:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//*  28   53:istore_3        
	//*  29   54:aload_0         
	//*  30   55:getfield        #47  <Field float mScaleX>
	//*  31   58:fconst_0        
	//*  32   59:fcmpl           
	//*  33   60:ifeq            201
	//*  34   63:aload_0         
	//*  35   64:getfield        #47  <Field float mScaleX>
	//*  36   67:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//*  37   70:istore          4
	//*  38   72:aload_0         
	//*  39   73:getfield        #52  <Field float mScaleY>
	//*  40   76:fconst_0        
	//*  41   77:fcmpl           
	//*  42   78:ifeq            207
	//*  43   81:aload_0         
	//*  44   82:getfield        #52  <Field float mScaleY>
	//*  45   85:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//*  46   88:istore          5
	//*  47   90:aload_0         
	//*  48   91:getfield        #57  <Field float mRotationX>
	//*  49   94:fconst_0        
	//*  50   95:fcmpl           
	//*  51   96:ifeq            213
	//*  52   99:aload_0         
	//*  53  100:getfield        #57  <Field float mRotationX>
	//*  54  103:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//*  55  106:istore          6
	//*  56  108:aload_0         
	//*  57  109:getfield        #62  <Field float mRotationY>
	//*  58  112:fconst_0        
	//*  59  113:fcmpl           
	//*  60  114:ifeq            219
	//*  61  117:aload_0         
	//*  62  118:getfield        #62  <Field float mRotationY>
	//*  63  121:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//*  64  124:istore          7
	//*  65  126:aload_0         
	//*  66  127:getfield        #67  <Field float mRotationZ>
	//*  67  130:fconst_0        
	//*  68  131:fcmpl           
	//*  69  132:ifeq            144
	//*  70  135:aload_0         
	//*  71  136:getfield        #67  <Field float mRotationZ>
	//*  72  139:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//*  73  142:istore          8
	//*  74  144:iload_1         
	//*  75  145:bipush          31
	//*  76  147:imul            
	//*  77  148:iload_2         
	//*  78  149:iadd            
	//*  79  150:bipush          31
	//*  80  152:imul            
	//*  81  153:iload_3         
	//*  82  154:iadd            
	//*  83  155:bipush          31
	//*  84  157:imul            
	//*  85  158:iload           4
	//*  86  160:iadd            
	//*  87  161:bipush          31
	//*  88  163:imul            
	//*  89  164:iload           5
	//*  90  166:iadd            
	//*  91  167:bipush          31
	//*  92  169:imul            
	//*  93  170:iload           6
	//*  94  172:iadd            
	//*  95  173:bipush          31
	//*  96  175:imul            
	//*  97  176:iload           7
	//*  98  178:iadd            
	//*  99  179:bipush          31
	//* 100  181:imul            
	//* 101  182:iload           8
	//* 102  184:iadd            
	//* 103  185:ireturn         
			i = 0;
	//  104  186:iconst_0        
	//  105  187:istore_1        
		if(mTranslationY != 0.0F)
			j = Float.floatToIntBits(mTranslationY);
		else
	//* 106  188:goto            20
			j = 0;
	//  107  191:iconst_0        
	//  108  192:istore_2        
		if(mTranslationZ != 0.0F)
			k = Float.floatToIntBits(mTranslationZ);
		else
	//* 109  193:goto            37
			k = 0;
	//  110  196:iconst_0        
	//  111  197:istore_3        
		if(mScaleX != 0.0F)
			l = Float.floatToIntBits(mScaleX);
		else
	//* 112  198:goto            54
			l = 0;
	//  113  201:iconst_0        
	//  114  202:istore          4
		if(mScaleY != 0.0F)
			i1 = Float.floatToIntBits(mScaleY);
		else
	//* 115  204:goto            72
			i1 = 0;
	//  116  207:iconst_0        
	//  117  208:istore          5
		if(mRotationX != 0.0F)
			j1 = Float.floatToIntBits(mRotationX);
		else
	//* 118  210:goto            90
			j1 = 0;
	//  119  213:iconst_0        
	//  120  214:istore          6
		if(mRotationY != 0.0F)
			k1 = Float.floatToIntBits(mRotationY);
		else
	//* 121  216:goto            108
			k1 = 0;
	//  122  219:iconst_0        
	//  123  220:istore          7
		if(mRotationZ != 0.0F)
			l1 = Float.floatToIntBits(mRotationZ);
		return ((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1;
	//* 124  222:goto            126
	}

	public void restore(View view)
	{
		ChangeTransform.access$200(view, mTranslationX, mTranslationY, mTranslationZ, mScaleX, mScaleY, mRotationX, mRotationY, mRotationZ);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field float mTranslationX>
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field float mTranslationY>
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field float mTranslationZ>
	//    7   13:aload_0         
	//    8   14:getfield        #47  <Field float mScaleX>
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field float mScaleY>
	//   11   21:aload_0         
	//   12   22:getfield        #57  <Field float mRotationX>
	//   13   25:aload_0         
	//   14   26:getfield        #62  <Field float mRotationY>
	//   15   29:aload_0         
	//   16   30:getfield        #67  <Field float mRotationZ>
	//   17   33:invokestatic    #83  <Method void ChangeTransform.access$200(View, float, float, float, float, float, float, float, float)>
	//   18   36:return          
	}

	final float mRotationX;
	final float mRotationY;
	final float mRotationZ;
	final float mScaleX;
	final float mScaleY;
	final float mTranslationX;
	final float mTranslationY;
	final float mTranslationZ;

	ChangeTransform$Transforms(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mTranslationX = view.getTranslationX();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #27  <Method float View.getTranslationX()>
	//    5    9:putfield        #29  <Field float mTranslationX>
		mTranslationY = view.getTranslationY();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #32  <Method float View.getTranslationY()>
	//    9   17:putfield        #34  <Field float mTranslationY>
		mTranslationZ = ViewCompat.getTranslationZ(view);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #40  <Method float ViewCompat.getTranslationZ(View)>
	//   13   25:putfield        #42  <Field float mTranslationZ>
		mScaleX = view.getScaleX();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #45  <Method float View.getScaleX()>
	//   17   33:putfield        #47  <Field float mScaleX>
		mScaleY = view.getScaleY();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #50  <Method float View.getScaleY()>
	//   21   41:putfield        #52  <Field float mScaleY>
		mRotationX = view.getRotationX();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #55  <Method float View.getRotationX()>
	//   25   49:putfield        #57  <Field float mRotationX>
		mRotationY = view.getRotationY();
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokevirtual   #60  <Method float View.getRotationY()>
	//   29   57:putfield        #62  <Field float mRotationY>
		mRotationZ = view.getRotation();
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #65  <Method float View.getRotation()>
	//   33   65:putfield        #67  <Field float mRotationZ>
	//   34   68:return          
	}
}
