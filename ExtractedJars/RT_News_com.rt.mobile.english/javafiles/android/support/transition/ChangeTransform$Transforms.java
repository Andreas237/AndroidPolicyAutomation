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
	//*   8   11:ifeq            25
			i = Float.floatToIntBits(mTranslationX);
	//    9   14:aload_0         
	//   10   15:getfield        #29  <Field float mTranslationX>
	//   11   18:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   12   21:istore_2        
		else
	//*  13   22:goto            27
			i = 0;
	//   14   25:iconst_0        
	//   15   26:istore_2        
		int j;
		if(mTranslationY != 0.0F)
	//*  16   27:aload_0         
	//*  17   28:getfield        #34  <Field float mTranslationY>
	//*  18   31:fconst_0        
	//*  19   32:fcmpl           
	//*  20   33:ifeq            47
			j = Float.floatToIntBits(mTranslationY);
	//   21   36:aload_0         
	//   22   37:getfield        #34  <Field float mTranslationY>
	//   23   40:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   24   43:istore_3        
		else
	//*  25   44:goto            49
			j = 0;
	//   26   47:iconst_0        
	//   27   48:istore_3        
		int k;
		if(mTranslationZ != 0.0F)
	//*  28   49:aload_0         
	//*  29   50:getfield        #42  <Field float mTranslationZ>
	//*  30   53:fconst_0        
	//*  31   54:fcmpl           
	//*  32   55:ifeq            70
			k = Float.floatToIntBits(mTranslationZ);
	//   33   58:aload_0         
	//   34   59:getfield        #42  <Field float mTranslationZ>
	//   35   62:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   36   65:istore          4
		else
	//*  37   67:goto            73
			k = 0;
	//   38   70:iconst_0        
	//   39   71:istore          4
		int l;
		if(mScaleX != 0.0F)
	//*  40   73:aload_0         
	//*  41   74:getfield        #47  <Field float mScaleX>
	//*  42   77:fconst_0        
	//*  43   78:fcmpl           
	//*  44   79:ifeq            94
			l = Float.floatToIntBits(mScaleX);
	//   45   82:aload_0         
	//   46   83:getfield        #47  <Field float mScaleX>
	//   47   86:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   48   89:istore          5
		else
	//*  49   91:goto            97
			l = 0;
	//   50   94:iconst_0        
	//   51   95:istore          5
		int i1;
		if(mScaleY != 0.0F)
	//*  52   97:aload_0         
	//*  53   98:getfield        #52  <Field float mScaleY>
	//*  54  101:fconst_0        
	//*  55  102:fcmpl           
	//*  56  103:ifeq            118
			i1 = Float.floatToIntBits(mScaleY);
	//   57  106:aload_0         
	//   58  107:getfield        #52  <Field float mScaleY>
	//   59  110:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   60  113:istore          6
		else
	//*  61  115:goto            121
			i1 = 0;
	//   62  118:iconst_0        
	//   63  119:istore          6
		int j1;
		if(mRotationX != 0.0F)
	//*  64  121:aload_0         
	//*  65  122:getfield        #57  <Field float mRotationX>
	//*  66  125:fconst_0        
	//*  67  126:fcmpl           
	//*  68  127:ifeq            142
			j1 = Float.floatToIntBits(mRotationX);
	//   69  130:aload_0         
	//   70  131:getfield        #57  <Field float mRotationX>
	//   71  134:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   72  137:istore          7
		else
	//*  73  139:goto            145
			j1 = 0;
	//   74  142:iconst_0        
	//   75  143:istore          7
		int k1;
		if(mRotationY != 0.0F)
	//*  76  145:aload_0         
	//*  77  146:getfield        #62  <Field float mRotationY>
	//*  78  149:fconst_0        
	//*  79  150:fcmpl           
	//*  80  151:ifeq            166
			k1 = Float.floatToIntBits(mRotationY);
	//   81  154:aload_0         
	//   82  155:getfield        #62  <Field float mRotationY>
	//   83  158:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   84  161:istore          8
		else
	//*  85  163:goto            169
			k1 = 0;
	//   86  166:iconst_0        
	//   87  167:istore          8
		if(mRotationZ != 0.0F)
	//*  88  169:aload_0         
	//*  89  170:getfield        #67  <Field float mRotationZ>
	//*  90  173:fconst_0        
	//*  91  174:fcmpl           
	//*  92  175:ifeq            187
			l1 = Float.floatToIntBits(mRotationZ);
	//   93  178:aload_0         
	//   94  179:getfield        #67  <Field float mRotationZ>
	//   95  182:invokestatic    #78  <Method int Float.floatToIntBits(float)>
	//   96  185:istore          9
		return 31 * ((((((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) + l1;
	//   97  187:bipush          31
	//   98  189:iload_2         
	//   99  190:bipush          31
	//  100  192:imul            
	//  101  193:iload_3         
	//  102  194:iadd            
	//  103  195:bipush          31
	//  104  197:imul            
	//  105  198:iload           4
	//  106  200:iadd            
	//  107  201:bipush          31
	//  108  203:imul            
	//  109  204:iload           5
	//  110  206:iadd            
	//  111  207:bipush          31
	//  112  209:imul            
	//  113  210:iload           6
	//  114  212:iadd            
	//  115  213:bipush          31
	//  116  215:imul            
	//  117  216:iload           7
	//  118  218:iadd            
	//  119  219:bipush          31
	//  120  221:imul            
	//  121  222:iload           8
	//  122  224:iadd            
	//  123  225:imul            
	//  124  226:iload           9
	//  125  228:iadd            
	//  126  229:ireturn         
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
