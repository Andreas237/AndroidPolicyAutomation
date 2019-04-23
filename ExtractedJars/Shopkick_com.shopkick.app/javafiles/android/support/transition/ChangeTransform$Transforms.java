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
		boolean flag = obj instanceof ChangeTransform$Transforms;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class ChangeTransform$Transforms>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((Object) ((ChangeTransform$Transforms)obj));
	//    9   13:aload_1         
	//   10   14:checkcast       #2   <Class ChangeTransform$Transforms>
	//   11   17:astore_1        
		flag = flag1;
	//   12   18:iload_3         
	//   13   19:istore_2        
		if(((ChangeTransform$Transforms) (obj)).mTranslationX == mTranslationX)
	//*  14   20:aload_1         
	//*  15   21:getfield        #29  <Field float mTranslationX>
	//*  16   24:aload_0         
	//*  17   25:getfield        #29  <Field float mTranslationX>
	//*  18   28:fcmpl           
	//*  19   29:ifne            132
		{
			flag = flag1;
	//   20   32:iload_3         
	//   21   33:istore_2        
			if(((ChangeTransform$Transforms) (obj)).mTranslationY == mTranslationY)
	//*  22   34:aload_1         
	//*  23   35:getfield        #34  <Field float mTranslationY>
	//*  24   38:aload_0         
	//*  25   39:getfield        #34  <Field float mTranslationY>
	//*  26   42:fcmpl           
	//*  27   43:ifne            132
			{
				flag = flag1;
	//   28   46:iload_3         
	//   29   47:istore_2        
				if(((ChangeTransform$Transforms) (obj)).mTranslationZ == mTranslationZ)
	//*  30   48:aload_1         
	//*  31   49:getfield        #42  <Field float mTranslationZ>
	//*  32   52:aload_0         
	//*  33   53:getfield        #42  <Field float mTranslationZ>
	//*  34   56:fcmpl           
	//*  35   57:ifne            132
				{
					flag = flag1;
	//   36   60:iload_3         
	//   37   61:istore_2        
					if(((ChangeTransform$Transforms) (obj)).mScaleX == mScaleX)
	//*  38   62:aload_1         
	//*  39   63:getfield        #47  <Field float mScaleX>
	//*  40   66:aload_0         
	//*  41   67:getfield        #47  <Field float mScaleX>
	//*  42   70:fcmpl           
	//*  43   71:ifne            132
					{
						flag = flag1;
	//   44   74:iload_3         
	//   45   75:istore_2        
						if(((ChangeTransform$Transforms) (obj)).mScaleY == mScaleY)
	//*  46   76:aload_1         
	//*  47   77:getfield        #52  <Field float mScaleY>
	//*  48   80:aload_0         
	//*  49   81:getfield        #52  <Field float mScaleY>
	//*  50   84:fcmpl           
	//*  51   85:ifne            132
						{
							flag = flag1;
	//   52   88:iload_3         
	//   53   89:istore_2        
							if(((ChangeTransform$Transforms) (obj)).mRotationX == mRotationX)
	//*  54   90:aload_1         
	//*  55   91:getfield        #57  <Field float mRotationX>
	//*  56   94:aload_0         
	//*  57   95:getfield        #57  <Field float mRotationX>
	//*  58   98:fcmpl           
	//*  59   99:ifne            132
							{
								flag = flag1;
	//   60  102:iload_3         
	//   61  103:istore_2        
								if(((ChangeTransform$Transforms) (obj)).mRotationY == mRotationY)
	//*  62  104:aload_1         
	//*  63  105:getfield        #62  <Field float mRotationY>
	//*  64  108:aload_0         
	//*  65  109:getfield        #62  <Field float mRotationY>
	//*  66  112:fcmpl           
	//*  67  113:ifne            132
								{
									flag = flag1;
	//   68  116:iload_3         
	//   69  117:istore_2        
									if(((ChangeTransform$Transforms) (obj)).mRotationZ == mRotationZ)
	//*  70  118:aload_1         
	//*  71  119:getfield        #67  <Field float mRotationZ>
	//*  72  122:aload_0         
	//*  73  123:getfield        #67  <Field float mRotationZ>
	//*  74  126:fcmpl           
	//*  75  127:ifne            132
										flag = true;
	//   76  130:iconst_1        
	//   77  131:istore_2        
								}
							}
						}
					}
				}
			}
		}
		return flag;
	//   78  132:iload_2         
	//   79  133:ireturn         
	}

	public int hashCode()
	{
		float f = mTranslationX;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field float mTranslationX>
	//    2    4:fstore_1        
		int l1 = 0;
	//    3    5:iconst_0        
	//    4    6:istore          9
		int i;
		if(f != 0.0F)
	//*   5    8:fload_1         
	//*   6    9:fconst_0        
	//*   7   10:fcmpl           
	//*   8   11:ifeq            22
			i = Float.floatToIntBits(f);
	//    9   14:fload_1         
	//   10   15:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   11   18:istore_2        
		else
	//*  12   19:goto            24
			i = 0;
	//   13   22:iconst_0        
	//   14   23:istore_2        
		f = mTranslationY;
	//   15   24:aload_0         
	//   16   25:getfield        #34  <Field float mTranslationY>
	//   17   28:fstore_1        
		int j;
		if(f != 0.0F)
	//*  18   29:fload_1         
	//*  19   30:fconst_0        
	//*  20   31:fcmpl           
	//*  21   32:ifeq            43
			j = Float.floatToIntBits(f);
	//   22   35:fload_1         
	//   23   36:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   24   39:istore_3        
		else
	//*  25   40:goto            45
			j = 0;
	//   26   43:iconst_0        
	//   27   44:istore_3        
		f = mTranslationZ;
	//   28   45:aload_0         
	//   29   46:getfield        #42  <Field float mTranslationZ>
	//   30   49:fstore_1        
		int k;
		if(f != 0.0F)
	//*  31   50:fload_1         
	//*  32   51:fconst_0        
	//*  33   52:fcmpl           
	//*  34   53:ifeq            65
			k = Float.floatToIntBits(f);
	//   35   56:fload_1         
	//   36   57:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   37   60:istore          4
		else
	//*  38   62:goto            68
			k = 0;
	//   39   65:iconst_0        
	//   40   66:istore          4
		f = mScaleX;
	//   41   68:aload_0         
	//   42   69:getfield        #47  <Field float mScaleX>
	//   43   72:fstore_1        
		int l;
		if(f != 0.0F)
	//*  44   73:fload_1         
	//*  45   74:fconst_0        
	//*  46   75:fcmpl           
	//*  47   76:ifeq            88
			l = Float.floatToIntBits(f);
	//   48   79:fload_1         
	//   49   80:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   50   83:istore          5
		else
	//*  51   85:goto            91
			l = 0;
	//   52   88:iconst_0        
	//   53   89:istore          5
		f = mScaleY;
	//   54   91:aload_0         
	//   55   92:getfield        #52  <Field float mScaleY>
	//   56   95:fstore_1        
		int i1;
		if(f != 0.0F)
	//*  57   96:fload_1         
	//*  58   97:fconst_0        
	//*  59   98:fcmpl           
	//*  60   99:ifeq            111
			i1 = Float.floatToIntBits(f);
	//   61  102:fload_1         
	//   62  103:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   63  106:istore          6
		else
	//*  64  108:goto            114
			i1 = 0;
	//   65  111:iconst_0        
	//   66  112:istore          6
		f = mRotationX;
	//   67  114:aload_0         
	//   68  115:getfield        #57  <Field float mRotationX>
	//   69  118:fstore_1        
		int j1;
		if(f != 0.0F)
	//*  70  119:fload_1         
	//*  71  120:fconst_0        
	//*  72  121:fcmpl           
	//*  73  122:ifeq            134
			j1 = Float.floatToIntBits(f);
	//   74  125:fload_1         
	//   75  126:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   76  129:istore          7
		else
	//*  77  131:goto            137
			j1 = 0;
	//   78  134:iconst_0        
	//   79  135:istore          7
		f = mRotationY;
	//   80  137:aload_0         
	//   81  138:getfield        #62  <Field float mRotationY>
	//   82  141:fstore_1        
		int k1;
		if(f != 0.0F)
	//*  83  142:fload_1         
	//*  84  143:fconst_0        
	//*  85  144:fcmpl           
	//*  86  145:ifeq            157
			k1 = Float.floatToIntBits(f);
	//   87  148:fload_1         
	//   88  149:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   89  152:istore          8
		else
	//*  90  154:goto            160
			k1 = 0;
	//   91  157:iconst_0        
	//   92  158:istore          8
		f = mRotationZ;
	//   93  160:aload_0         
	//   94  161:getfield        #67  <Field float mRotationZ>
	//   95  164:fstore_1        
		if(f != 0.0F)
	//*  96  165:fload_1         
	//*  97  166:fconst_0        
	//*  98  167:fcmpl           
	//*  99  168:ifeq            177
			l1 = Float.floatToIntBits(f);
	//  100  171:fload_1         
	//  101  172:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//  102  175:istore          9
		return ((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1;
	//  103  177:iload_2         
	//  104  178:bipush          31
	//  105  180:imul            
	//  106  181:iload_3         
	//  107  182:iadd            
	//  108  183:bipush          31
	//  109  185:imul            
	//  110  186:iload           4
	//  111  188:iadd            
	//  112  189:bipush          31
	//  113  191:imul            
	//  114  192:iload           5
	//  115  194:iadd            
	//  116  195:bipush          31
	//  117  197:imul            
	//  118  198:iload           6
	//  119  200:iadd            
	//  120  201:bipush          31
	//  121  203:imul            
	//  122  204:iload           7
	//  123  206:iadd            
	//  124  207:bipush          31
	//  125  209:imul            
	//  126  210:iload           8
	//  127  212:iadd            
	//  128  213:bipush          31
	//  129  215:imul            
	//  130  216:iload           9
	//  131  218:iadd            
	//  132  219:ireturn         
	}

	public void restore(View view)
	{
		ChangeTransform.setTransforms(view, mTranslationX, mTranslationY, mTranslationZ, mScaleX, mScaleY, mRotationX, mRotationY, mRotationZ);
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
	//   17   33:invokestatic    #83  <Method void ChangeTransform.setTransforms(View, float, float, float, float, float, float, float, float)>
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
