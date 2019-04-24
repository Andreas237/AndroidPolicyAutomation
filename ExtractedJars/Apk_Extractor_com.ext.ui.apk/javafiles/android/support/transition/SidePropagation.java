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
		byte byte0 = 5;
	//    0    0:iconst_5        
	//    1    1:istore          11
		byte byte1 = 3;
	//    2    3:iconst_3        
	//    3    4:istore          12
		boolean flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          13
		int i2 = 1;
	//    6    9:iconst_1        
	//    7   10:istore          10
		if(mSide == 0x800003)
	//*   8   12:aload_0         
	//*   9   13:getfield        #17  <Field int mSide>
	//*  10   16:ldc1            #21  <Int 0x800003>
	//*  11   18:icmpne          98
		{
			if(ViewCompat.getLayoutDirection(view) != 1)
	//*  12   21:aload_1         
	//*  13   22:invokestatic    #27  <Method int ViewCompat.getLayoutDirection(View)>
	//*  14   25:iconst_1        
	//*  15   26:icmpne          86
	//*  16   29:iload           10
	//*  17   31:ifeq            92
	//*  18   34:iload           11
	//*  19   36:istore          10
	//*  20   38:iload           10
	//*  21   40:lookupswitch    4: default 84
	//	               3: 152
	//	               5: 178
	//	               48: 165
	//	               80: 191
	//*  22   84:iconst_0        
	//*  23   85:ireturn         
				i2 = 0;
	//   24   86:iconst_0        
	//   25   87:istore          10
			if(i2 != 0)
				i2 = ((int) (byte0));
			else
	//*  26   89:goto            29
				i2 = 3;
	//   27   92:iconst_3        
	//   28   93:istore          10
		} else
	//*  29   95:goto            38
		if(mSide == 0x800005)
	//*  30   98:aload_0         
	//*  31   99:getfield        #17  <Field int mSide>
	//*  32  102:ldc1            #28  <Int 0x800005>
	//*  33  104:icmpne          143
		{
			if(ViewCompat.getLayoutDirection(view) == 1)
	//*  34  107:aload_1         
	//*  35  108:invokestatic    #27  <Method int ViewCompat.getLayoutDirection(View)>
	//*  36  111:iconst_1        
	//*  37  112:icmpne          131
				i2 = ((int) (flag));
	//   38  115:iload           13
	//   39  117:istore          10
			else
	//*  40  119:iload           10
	//*  41  121:ifeq            137
	//*  42  124:iload           12
	//*  43  126:istore          10
	//*  44  128:goto            38
				i2 = 0;
	//   45  131:iconst_0        
	//   46  132:istore          10
			if(i2 != 0)
				i2 = ((int) (byte1));
			else
	//*  47  134:goto            119
				i2 = 5;
	//   48  137:iconst_5        
	//   49  138:istore          10
		} else
	//*  50  140:goto            128
		{
			i2 = mSide;
	//   51  143:aload_0         
	//   52  144:getfield        #17  <Field int mSide>
	//   53  147:istore          10
		}
		switch(i2)
		{
		default:
			return 0;

	//*  54  149:goto            38
		case 3: // '\003'
			return (k1 - i) + Math.abs(l - j);
	//   55  152:iload           8
	//   56  154:iload_2         
	//   57  155:isub            
	//   58  156:iload           5
	//   59  158:iload_3         
	//   60  159:isub            
	//   61  160:invokestatic    #34  <Method int Math.abs(int)>
	//   62  163:iadd            
	//   63  164:ireturn         

		case 48: // '0'
			return (l1 - j) + Math.abs(k - i);
	//   64  165:iload           9
	//   65  167:iload_3         
	//   66  168:isub            
	//   67  169:iload           4
	//   68  171:iload_2         
	//   69  172:isub            
	//   70  173:invokestatic    #34  <Method int Math.abs(int)>
	//   71  176:iadd            
	//   72  177:ireturn         

		case 5: // '\005'
			return (i - i1) + Math.abs(l - j);
	//   73  178:iload_2         
	//   74  179:iload           6
	//   75  181:isub            
	//   76  182:iload           5
	//   77  184:iload_3         
	//   78  185:isub            
	//   79  186:invokestatic    #34  <Method int Math.abs(int)>
	//   80  189:iadd            
	//   81  190:ireturn         

		case 80: // 'P'
			return (j - j1) + Math.abs(k - i);
	//   82  191:iload_3         
	//   83  192:iload           7
	//   84  194:isub            
	//   85  195:iload           4
	//   86  197:iload_2         
	//   87  198:isub            
	//   88  199:invokestatic    #34  <Method int Math.abs(int)>
	//   89  202:iadd            
	//   90  203:ireturn         
		}
	}

	private int getMaxDistance(ViewGroup viewgroup)
	{
		switch(mSide)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field int mSide>
		{
	//*   2    4:lookupswitch    4: default 48
	//	               3: 53
	//	               5: 53
	//	               8388611: 53
	//	               8388613: 53
		default:
			return viewgroup.getHeight();
	//    3   48:aload_1         
	//    4   49:invokevirtual   #42  <Method int ViewGroup.getHeight()>
	//    5   52:ireturn         

		case 3: // '\003'
		case 5: // '\005'
		case 8388611: 
		case 8388613: 
			return viewgroup.getWidth();
	//    6   53:aload_1         
	//    7   54:invokevirtual   #45  <Method int ViewGroup.getWidth()>
	//    8   57:ireturn         
		}
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
		float f;
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		long l2;
		long l3;
		if(transitionvalues1 == null || getViewVisibility(transitionvalues) == 0)
	//*   9   17:aload           4
	//*  10   19:ifnull          30
	//*  11   22:aload_0         
	//*  12   23:aload_3         
	//*  13   24:invokevirtual   #57  <Method int getViewVisibility(TransitionValues)>
	//*  14   27:ifne            192
		{
			i = -1;
	//   15   30:iconst_m1       
	//   16   31:istore          6
		} else
	//*  17   33:aload_0         
	//*  18   34:aload_3         
	//*  19   35:invokevirtual   #60  <Method int getViewX(TransitionValues)>
	//*  20   38:istore          9
	//*  21   40:aload_0         
	//*  22   41:aload_3         
	//*  23   42:invokevirtual   #63  <Method int getViewY(TransitionValues)>
	//*  24   45:istore          10
	//*  25   47:iconst_2        
	//*  26   48:newarray        int[]
	//*  27   50:astore_3        
	//*  28   51:aload_1         
	//*  29   52:aload_3         
	//*  30   53:invokevirtual   #67  <Method void ViewGroup.getLocationOnScreen(int[])>
	//*  31   56:aload_3         
	//*  32   57:iconst_0        
	//*  33   58:iaload          
	//*  34   59:aload_1         
	//*  35   60:invokevirtual   #71  <Method float ViewGroup.getTranslationX()>
	//*  36   63:invokestatic    #75  <Method int Math.round(float)>
	//*  37   66:iadd            
	//*  38   67:istore          11
	//*  39   69:aload_3         
	//*  40   70:iconst_1        
	//*  41   71:iaload          
	//*  42   72:aload_1         
	//*  43   73:invokevirtual   #78  <Method float ViewGroup.getTranslationY()>
	//*  44   76:invokestatic    #75  <Method int Math.round(float)>
	//*  45   79:iadd            
	//*  46   80:istore          12
	//*  47   82:iload           11
	//*  48   84:aload_1         
	//*  49   85:invokevirtual   #45  <Method int ViewGroup.getWidth()>
	//*  50   88:iadd            
	//*  51   89:istore          13
	//*  52   91:iload           12
	//*  53   93:aload_1         
	//*  54   94:invokevirtual   #42  <Method int ViewGroup.getHeight()>
	//*  55   97:iadd            
	//*  56   98:istore          14
	//*  57  100:aload           19
	//*  58  102:ifnull          201
	//*  59  105:aload           19
	//*  60  107:invokevirtual   #83  <Method int Rect.centerX()>
	//*  61  110:istore          7
	//*  62  112:aload           19
	//*  63  114:invokevirtual   #86  <Method int Rect.centerY()>
	//*  64  117:istore          8
	//*  65  119:aload_0         
	//*  66  120:aload_1         
	//*  67  121:iload           9
	//*  68  123:iload           10
	//*  69  125:iload           7
	//*  70  127:iload           8
	//*  71  129:iload           11
	//*  72  131:iload           12
	//*  73  133:iload           13
	//*  74  135:iload           14
	//*  75  137:invokespecial   #88  <Method int distance(View, int, int, int, int, int, int, int, int)>
	//*  76  140:i2f             
	//*  77  141:aload_0         
	//*  78  142:aload_1         
	//*  79  143:invokespecial   #90  <Method int getMaxDistance(ViewGroup)>
	//*  80  146:i2f             
	//*  81  147:fdiv            
	//*  82  148:fstore          5
	//*  83  150:aload_2         
	//*  84  151:invokevirtual   #94  <Method long Transition.getDuration()>
	//*  85  154:lstore          17
	//*  86  156:lload           17
	//*  87  158:lstore          15
	//*  88  160:lload           17
	//*  89  162:lconst_0        
	//*  90  163:lcmp            
	//*  91  164:ifge            172
	//*  92  167:ldc2w           #95  <Long 300L>
	//*  93  170:lstore          15
	//*  94  172:lload           15
	//*  95  174:iload           6
	//*  96  176:i2l             
	//*  97  177:lmul            
	//*  98  178:l2f             
	//*  99  179:aload_0         
	//* 100  180:getfield        #15  <Field float mPropagationSpeed>
	//* 101  183:fdiv            
	//* 102  184:fload           5
	//* 103  186:fmul            
	//* 104  187:invokestatic    #75  <Method int Math.round(float)>
	//* 105  190:i2l             
	//* 106  191:lreturn         
		{
			i = 1;
	//  107  192:iconst_1        
	//  108  193:istore          6
			transitionvalues = transitionvalues1;
	//  109  195:aload           4
	//  110  197:astore_3        
		}
		l = getViewX(transitionvalues);
		i1 = getViewY(transitionvalues);
		transitionvalues = ((TransitionValues) (new int[2]));
		viewgroup.getLocationOnScreen(((int []) (transitionvalues)));
		j1 = transitionvalues[0] + Math.round(viewgroup.getTranslationX());
		k1 = transitionvalues[1] + Math.round(viewgroup.getTranslationY());
		l1 = j1 + viewgroup.getWidth();
		i2 = k1 + viewgroup.getHeight();
		if(rect != null)
		{
			j = rect.centerX();
			k = rect.centerY();
		} else
	//* 111  198:goto            33
		{
			j = (j1 + l1) / 2;
	//  112  201:iload           11
	//  113  203:iload           13
	//  114  205:iadd            
	//  115  206:iconst_2        
	//  116  207:idiv            
	//  117  208:istore          7
			k = (k1 + i2) / 2;
	//  118  210:iload           12
	//  119  212:iload           14
	//  120  214:iadd            
	//  121  215:iconst_2        
	//  122  216:idiv            
	//  123  217:istore          8
		}
		f = (float)distance(((View) (viewgroup)), l, i1, j, k, j1, k1, l1, i2) / (float)getMaxDistance(viewgroup);
		l3 = transition.getDuration();
		l2 = l3;
		if(l3 < 0L)
			l2 = 300L;
		return (long)Math.round(((float)(l2 * (long)i) / mPropagationSpeed) * f);
	//* 124  219:goto            119
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
