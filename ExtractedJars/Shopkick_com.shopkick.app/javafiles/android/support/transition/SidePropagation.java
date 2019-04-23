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
		int j2 = mSide;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int mSide>
	//    2    4:istore          11
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          12
		boolean flag = true;
	//    5    9:iconst_1        
	//    6   10:istore          10
		int i2;
		if(j2 == 0x800003)
	//*   7   12:iload           11
	//*   8   14:ldc1            #21  <Int 0x800003>
	//*   9   16:icmpne          50
		{
			if(ViewCompat.getLayoutDirection(view) != 1)
	//*  10   19:aload_1         
	//*  11   20:invokestatic    #27  <Method int ViewCompat.getLayoutDirection(View)>
	//*  12   23:iconst_1        
	//*  13   24:icmpne          30
	//*  14   27:goto            33
				flag = false;
	//   15   30:iconst_0        
	//   16   31:istore          10
			if(flag)
	//*  17   33:iload           10
	//*  18   35:ifeq            44
				i2 = 5;
	//   19   38:iconst_5        
	//   20   39:istore          10
			else
	//*  21   41:goto            93
				i2 = 3;
	//   22   44:iconst_3        
	//   23   45:istore          10
		} else
	//*  24   47:goto            93
		{
			i2 = j2;
	//   25   50:iload           11
	//   26   52:istore          10
			if(j2 == 0x800005)
	//*  27   54:iload           11
	//*  28   56:ldc1            #28  <Int 0x800005>
	//*  29   58:icmpne          93
			{
				if(ViewCompat.getLayoutDirection(view) == 1)
	//*  30   61:aload_1         
	//*  31   62:invokestatic    #27  <Method int ViewCompat.getLayoutDirection(View)>
	//*  32   65:iconst_1        
	//*  33   66:icmpne          76
					i2 = ((int) (flag1));
	//   34   69:iload           12
	//   35   71:istore          10
				else
	//*  36   73:goto            79
					i2 = 0;
	//   37   76:iconst_0        
	//   38   77:istore          10
				if(i2 != 0)
	//*  39   79:iload           10
	//*  40   81:ifeq            90
					i2 = 3;
	//   41   84:iconst_3        
	//   42   85:istore          10
				else
	//*  43   87:goto            93
					i2 = 5;
	//   44   90:iconst_5        
	//   45   91:istore          10
			}
		}
		if(i2 != 3)
	//*  46   93:iload           10
	//*  47   95:iconst_3        
	//*  48   96:icmpeq          160
		{
			if(i2 != 5)
	//*  49   99:iload           10
	//*  50  101:iconst_5        
	//*  51  102:icmpeq          147
			{
				if(i2 != 48)
	//*  52  105:iload           10
	//*  53  107:bipush          48
	//*  54  109:icmpeq          134
				{
					if(i2 != 80)
	//*  55  112:iload           10
	//*  56  114:bipush          80
	//*  57  116:icmpeq          121
						return 0;
	//   58  119:iconst_0        
	//   59  120:ireturn         
					else
						return (j - j1) + Math.abs(k - i);
	//   60  121:iload_3         
	//   61  122:iload           7
	//   62  124:isub            
	//   63  125:iload           4
	//   64  127:iload_2         
	//   65  128:isub            
	//   66  129:invokestatic    #34  <Method int Math.abs(int)>
	//   67  132:iadd            
	//   68  133:ireturn         
				} else
				{
					return (l1 - j) + Math.abs(k - i);
	//   69  134:iload           9
	//   70  136:iload_3         
	//   71  137:isub            
	//   72  138:iload           4
	//   73  140:iload_2         
	//   74  141:isub            
	//   75  142:invokestatic    #34  <Method int Math.abs(int)>
	//   76  145:iadd            
	//   77  146:ireturn         
				}
			} else
			{
				return (i - i1) + Math.abs(l - j);
	//   78  147:iload_2         
	//   79  148:iload           6
	//   80  150:isub            
	//   81  151:iload           5
	//   82  153:iload_3         
	//   83  154:isub            
	//   84  155:invokestatic    #34  <Method int Math.abs(int)>
	//   85  158:iadd            
	//   86  159:ireturn         
			}
		} else
		{
			return (k1 - i) + Math.abs(l - j);
	//   87  160:iload           8
	//   88  162:iload_2         
	//   89  163:isub            
	//   90  164:iload           5
	//   91  166:iload_3         
	//   92  167:isub            
	//   93  168:invokestatic    #34  <Method int Math.abs(int)>
	//   94  171:iadd            
	//   95  172:ireturn         
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
		if(f != 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifeq            12
		{
			mPropagationSpeed = f;
	//    4    6:aload_0         
	//    5    7:fload_1         
	//    6    8:putfield        #15  <Field float mPropagationSpeed>
			return;
	//    7   11:return          
		} else
		{
			throw new IllegalArgumentException("propagationSpeed may not be 0");
	//    8   12:new             #100 <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:ldc1            #102 <String "propagationSpeed may not be 0">
	//   11   18:invokespecial   #105 <Method void IllegalArgumentException(String)>
	//   12   21:athrow          
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
