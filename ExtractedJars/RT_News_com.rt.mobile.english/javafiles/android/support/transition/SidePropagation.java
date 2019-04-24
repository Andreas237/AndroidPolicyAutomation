// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			VisibilityPropagation, Transition, TransitionValues

public class SidePropagation extends VisibilityPropagation
{

	public SidePropagation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void VisibilityPropagation()>
		mPropagationSpeed = 3F;
	//    2    4:aload_0         
	//    3    5:ldc1            #13  <Float 3F>
	//    4    7:putfield        #15  <Field float mPropagationSpeed>
		mSide = 80;
	//    5   10:aload_0         
	//    6   11:bipush          80
	//    7   13:putfield        #17  <Field int mSide>
	//    8   16:return          
	}

	private int distance(View view, int i, int j, int k, int l, int i1, int j1, 
			int k1, int l1)
	{
		int i2;
		boolean flag;
		int j2;
		j2 = mSide;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int mSide>
	//    2    4:istore          12
		flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          11
		i2 = 1;
	//    5    9:iconst_1        
	//    6   10:istore          10
		if(j2 != 0x800003) goto _L2; else goto _L1
	//    7   12:iload           12
	//    8   14:ldc1            #21  <Int 0x800003>
	//    9   16:icmpne          50
_L1:
		if(ViewCompat.getLayoutDirection(view) != 1)
	//*  10   19:aload_1         
	//*  11   20:invokestatic    #27  <Method int ViewCompat.getLayoutDirection(View)>
	//*  12   23:iconst_1        
	//*  13   24:icmpne          30
	//*  14   27:goto            33
			i2 = 0;
	//   15   30:iconst_0        
	//   16   31:istore          10
		if(!i2) goto _L4; else goto _L3
	//   17   33:iload           10
	//   18   35:ifeq            44
_L3:
		i2 = 5;
	//   19   38:iconst_5        
	//   20   39:istore          10
		break MISSING_BLOCK_LABEL_91;
	//   21   41:goto            91
_L4:
		i2 = 3;
	//   22   44:iconst_3        
	//   23   45:istore          10
		break MISSING_BLOCK_LABEL_91;
	//   24   47:goto            91
_L2:
		if(mSide != 0x800005) goto _L6; else goto _L5
	//   25   50:aload_0         
	//   26   51:getfield        #17  <Field int mSide>
	//   27   54:ldc1            #28  <Int 0x800005>
	//   28   56:icmpne          85
_L5:
		if(ViewCompat.getLayoutDirection(view) == 1)
	//*  29   59:aload_1         
	//*  30   60:invokestatic    #27  <Method int ViewCompat.getLayoutDirection(View)>
	//*  31   63:iconst_1        
	//*  32   64:icmpne          74
			i2 = ((int) (flag));
	//   33   67:iload           11
	//   34   69:istore          10
		else
	//*  35   71:goto            77
			i2 = 0;
	//   36   74:iconst_0        
	//   37   75:istore          10
		if(i2 == 0) goto _L3; else goto _L4
	//   38   77:iload           10
	//   39   79:ifeq            38
	//*  40   82:goto            44
_L6:
		i2 = mSide;
	//   41   85:aload_0         
	//   42   86:getfield        #17  <Field int mSide>
	//   43   89:istore          10
		if(i2 != 3)
	//*  44   91:iload           10
	//*  45   93:iconst_3        
	//*  46   94:icmpeq          158
		{
			if(i2 != 5)
	//*  47   97:iload           10
	//*  48   99:iconst_5        
	//*  49  100:icmpeq          145
			{
				if(i2 != 48)
	//*  50  103:iload           10
	//*  51  105:bipush          48
	//*  52  107:icmpeq          132
				{
					if(i2 != 80)
	//*  53  110:iload           10
	//*  54  112:bipush          80
	//*  55  114:icmpeq          119
						return 0;
	//   56  117:iconst_0        
	//   57  118:ireturn         
					else
						return (j - j1) + Math.abs(k - i);
	//   58  119:iload_3         
	//   59  120:iload           7
	//   60  122:isub            
	//   61  123:iload           4
	//   62  125:iload_2         
	//   63  126:isub            
	//   64  127:invokestatic    #34  <Method int Math.abs(int)>
	//   65  130:iadd            
	//   66  131:ireturn         
				} else
				{
					return (l1 - j) + Math.abs(k - i);
	//   67  132:iload           9
	//   68  134:iload_3         
	//   69  135:isub            
	//   70  136:iload           4
	//   71  138:iload_2         
	//   72  139:isub            
	//   73  140:invokestatic    #34  <Method int Math.abs(int)>
	//   74  143:iadd            
	//   75  144:ireturn         
				}
			} else
			{
				return (i - i1) + Math.abs(l - j);
	//   76  145:iload_2         
	//   77  146:iload           6
	//   78  148:isub            
	//   79  149:iload           5
	//   80  151:iload_3         
	//   81  152:isub            
	//   82  153:invokestatic    #34  <Method int Math.abs(int)>
	//   83  156:iadd            
	//   84  157:ireturn         
			}
		} else
		{
			return (k1 - i) + Math.abs(l - j);
	//   85  158:iload           8
	//   86  160:iload_2         
	//   87  161:isub            
	//   88  162:iload           5
	//   89  164:iload_3         
	//   90  165:isub            
	//   91  166:invokestatic    #34  <Method int Math.abs(int)>
	//   92  169:iadd            
	//   93  170:ireturn         
		}
	}

	private int getMaxDistance(ViewGroup viewgroup)
	{
		int i = mSide;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int mSide>
	//    2    4:istore_2        
		if(i != 3 && i != 5 && i != 0x800003 && i != 0x800005)
	//*   3    5:iload_2         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          32
	//*   6   10:iload_2         
	//*   7   11:iconst_5        
	//*   8   12:icmpeq          32
	//*   9   15:iload_2         
	//*  10   16:ldc1            #21  <Int 0x800003>
	//*  11   18:icmpeq          32
	//*  12   21:iload_2         
	//*  13   22:ldc1            #28  <Int 0x800005>
	//*  14   24:icmpeq          32
			return viewgroup.getHeight();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #42  <Method int ViewGroup.getHeight()>
	//   17   31:ireturn         
		else
			return viewgroup.getWidth();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #45  <Method int ViewGroup.getWidth()>
	//   20   36:ireturn         
	}

	public long getStartDelay(ViewGroup viewgroup, Transition transition, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues == null && transitionvalues1 == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       11
	//*   2    4:aload           4
	//*   3    6:ifnonnull       11
			return 0L;
	//    4    9:lconst_0        
	//    5   10:lreturn         
		Rect rect = transition.getEpicenter();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #53  <Method Rect Transition.getEpicenter()>
	//    8   15:astore          19
		int i;
		if(transitionvalues1 != null && getViewVisibility(transitionvalues) != 0)
	//*   9   17:aload           4
	//*  10   19:ifnull          42
	//*  11   22:aload_0         
	//*  12   23:aload_3         
	//*  13   24:invokevirtual   #57  <Method int getViewVisibility(TransitionValues)>
	//*  14   27:ifne            33
	//*  15   30:goto            42
		{
			i = 1;
	//   16   33:iconst_1        
	//   17   34:istore          6
			transitionvalues = transitionvalues1;
	//   18   36:aload           4
	//   19   38:astore_3        
		} else
	//*  20   39:goto            45
		{
			i = -1;
	//   21   42:iconst_m1       
	//   22   43:istore          6
		}
		int l = getViewX(transitionvalues);
	//   23   45:aload_0         
	//   24   46:aload_3         
	//   25   47:invokevirtual   #60  <Method int getViewX(TransitionValues)>
	//   26   50:istore          9
		int i1 = getViewY(transitionvalues);
	//   27   52:aload_0         
	//   28   53:aload_3         
	//   29   54:invokevirtual   #63  <Method int getViewY(TransitionValues)>
	//   30   57:istore          10
		transitionvalues = ((TransitionValues) (new int[2]));
	//   31   59:iconst_2        
	//   32   60:newarray        int[]
	//   33   62:astore_3        
		viewgroup.getLocationOnScreen(((int []) (transitionvalues)));
	//   34   63:aload_1         
	//   35   64:aload_3         
	//   36   65:invokevirtual   #67  <Method void ViewGroup.getLocationOnScreen(int[])>
		int j1 = transitionvalues[0] + Math.round(viewgroup.getTranslationX());
	//   37   68:aload_3         
	//   38   69:iconst_0        
	//   39   70:iaload          
	//   40   71:aload_1         
	//   41   72:invokevirtual   #71  <Method float ViewGroup.getTranslationX()>
	//   42   75:invokestatic    #75  <Method int Math.round(float)>
	//   43   78:iadd            
	//   44   79:istore          11
		int k1 = transitionvalues[1] + Math.round(viewgroup.getTranslationY());
	//   45   81:aload_3         
	//   46   82:iconst_1        
	//   47   83:iaload          
	//   48   84:aload_1         
	//   49   85:invokevirtual   #78  <Method float ViewGroup.getTranslationY()>
	//   50   88:invokestatic    #75  <Method int Math.round(float)>
	//   51   91:iadd            
	//   52   92:istore          12
		int l1 = j1 + viewgroup.getWidth();
	//   53   94:iload           11
	//   54   96:aload_1         
	//   55   97:invokevirtual   #45  <Method int ViewGroup.getWidth()>
	//   56  100:iadd            
	//   57  101:istore          13
		int i2 = k1 + viewgroup.getHeight();
	//   58  103:iload           12
	//   59  105:aload_1         
	//   60  106:invokevirtual   #42  <Method int ViewGroup.getHeight()>
	//   61  109:iadd            
	//   62  110:istore          14
		int j;
		int k;
		if(rect != null)
	//*  63  112:aload           19
	//*  64  114:ifnull          134
		{
			j = rect.centerX();
	//   65  117:aload           19
	//   66  119:invokevirtual   #83  <Method int Rect.centerX()>
	//   67  122:istore          7
			k = rect.centerY();
	//   68  124:aload           19
	//   69  126:invokevirtual   #86  <Method int Rect.centerY()>
	//   70  129:istore          8
		} else
	//*  71  131:goto            152
		{
			j = (j1 + l1) / 2;
	//   72  134:iload           11
	//   73  136:iload           13
	//   74  138:iadd            
	//   75  139:iconst_2        
	//   76  140:idiv            
	//   77  141:istore          7
			k = (k1 + i2) / 2;
	//   78  143:iload           12
	//   79  145:iload           14
	//   80  147:iadd            
	//   81  148:iconst_2        
	//   82  149:idiv            
	//   83  150:istore          8
		}
		float f = (float)distance(((View) (viewgroup)), l, i1, j, k, j1, k1, l1, i2) / (float)getMaxDistance(viewgroup);
	//   84  152:aload_0         
	//   85  153:aload_1         
	//   86  154:iload           9
	//   87  156:iload           10
	//   88  158:iload           7
	//   89  160:iload           8
	//   90  162:iload           11
	//   91  164:iload           12
	//   92  166:iload           13
	//   93  168:iload           14
	//   94  170:invokespecial   #88  <Method int distance(View, int, int, int, int, int, int, int, int)>
	//   95  173:i2f             
	//   96  174:aload_0         
	//   97  175:aload_1         
	//   98  176:invokespecial   #90  <Method int getMaxDistance(ViewGroup)>
	//   99  179:i2f             
	//  100  180:fdiv            
	//  101  181:fstore          5
		long l3 = transition.getDuration();
	//  102  183:aload_2         
	//  103  184:invokevirtual   #94  <Method long Transition.getDuration()>
	//  104  187:lstore          17
		long l2 = l3;
	//  105  189:lload           17
	//  106  191:lstore          15
		if(l3 < 0L)
	//* 107  193:lload           17
	//* 108  195:lconst_0        
	//* 109  196:lcmp            
	//* 110  197:ifge            205
			l2 = 300L;
	//  111  200:ldc2w           #95  <Long 300L>
	//  112  203:lstore          15
		return (long)Math.round(((float)(l2 * (long)i) / mPropagationSpeed) * f);
	//  113  205:lload           15
	//  114  207:iload           6
	//  115  209:i2l             
	//  116  210:lmul            
	//  117  211:l2f             
	//  118  212:aload_0         
	//  119  213:getfield        #15  <Field float mPropagationSpeed>
	//  120  216:fdiv            
	//  121  217:fload           5
	//  122  219:fmul            
	//  123  220:invokestatic    #75  <Method int Math.round(float)>
	//  124  223:i2l             
	//  125  224:lreturn         
	}

	public void setPropagationSpeed(float f)
	{
		if(f == 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifne            16
		{
			throw new IllegalArgumentException("propagationSpeed may not be 0");
	//    4    6:new             #100 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #102 <String "propagationSpeed may not be 0">
	//    7   12:invokespecial   #105 <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
		} else
		{
			mPropagationSpeed = f;
	//    9   16:aload_0         
	//   10   17:fload_1         
	//   11   18:putfield        #15  <Field float mPropagationSpeed>
			return;
	//   12   21:return          
		}
	}

	public void setSide(int i)
	{
		mSide = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int mSide>
	//    3    5:return          
	}

	private float mPropagationSpeed;
	private int mSide;
}
