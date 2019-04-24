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
		if(mSide == 0x800003)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field int mSide>
	//*   2    4:ldc1            #21  <Int 0x800003>
	//*   3    6:icmpne          86
		{
			if(ViewCompat.getLayoutDirection(view) == 1)
	//*   4    9:aload_1         
	//*   5   10:invokestatic    #27  <Method int ViewCompat.getLayoutDirection(View)>
	//*   6   13:iconst_1        
	//*   7   14:icmpne          74
				i2 = 1;
	//    8   17:iconst_1        
	//    9   18:istore          10
			else
	//*  10   20:iload           10
	//*  11   22:ifeq            80
	//*  12   25:iconst_5        
	//*  13   26:istore          10
	//*  14   28:iload           10
	//*  15   30:lookupswitch    4: default 72
	//	               3: 138
	//	               5: 164
	//	               48: 151
	//	               80: 177
	//*  16   72:iconst_0        
	//*  17   73:ireturn         
				i2 = 0;
	//   18   74:iconst_0        
	//   19   75:istore          10
			if(i2 != 0)
				i2 = 5;
			else
	//*  20   77:goto            20
				i2 = 3;
	//   21   80:iconst_3        
	//   22   81:istore          10
		} else
	//*  23   83:goto            28
		if(mSide == 0x800005)
	//*  24   86:aload_0         
	//*  25   87:getfield        #17  <Field int mSide>
	//*  26   90:ldc1            #28  <Int 0x800005>
	//*  27   92:icmpne          129
		{
			if(ViewCompat.getLayoutDirection(view) == 1)
	//*  28   95:aload_1         
	//*  29   96:invokestatic    #27  <Method int ViewCompat.getLayoutDirection(View)>
	//*  30   99:iconst_1        
	//*  31  100:icmpne          117
				i2 = 1;
	//   32  103:iconst_1        
	//   33  104:istore          10
			else
	//*  34  106:iload           10
	//*  35  108:ifeq            123
	//*  36  111:iconst_3        
	//*  37  112:istore          10
	//*  38  114:goto            28
				i2 = 0;
	//   39  117:iconst_0        
	//   40  118:istore          10
			if(i2 != 0)
				i2 = 3;
			else
	//*  41  120:goto            106
				i2 = 5;
	//   42  123:iconst_5        
	//   43  124:istore          10
		} else
	//*  44  126:goto            114
		{
			i2 = mSide;
	//   45  129:aload_0         
	//   46  130:getfield        #17  <Field int mSide>
	//   47  133:istore          10
		}
		switch(i2)
		{
		default:
			return 0;

	//*  48  135:goto            28
		case 3: // '\003'
			return (k1 - i) + Math.abs(l - j);
	//   49  138:iload           8
	//   50  140:iload_2         
	//   51  141:isub            
	//   52  142:iload           5
	//   53  144:iload_3         
	//   54  145:isub            
	//   55  146:invokestatic    #34  <Method int Math.abs(int)>
	//   56  149:iadd            
	//   57  150:ireturn         

		case 48: // '0'
			return (l1 - j) + Math.abs(k - i);
	//   58  151:iload           9
	//   59  153:iload_3         
	//   60  154:isub            
	//   61  155:iload           4
	//   62  157:iload_2         
	//   63  158:isub            
	//   64  159:invokestatic    #34  <Method int Math.abs(int)>
	//   65  162:iadd            
	//   66  163:ireturn         

		case 5: // '\005'
			return (i - i1) + Math.abs(l - j);
	//   67  164:iload_2         
	//   68  165:iload           6
	//   69  167:isub            
	//   70  168:iload           5
	//   71  170:iload_3         
	//   72  171:isub            
	//   73  172:invokestatic    #34  <Method int Math.abs(int)>
	//   74  175:iadd            
	//   75  176:ireturn         

		case 80: // 'P'
			return (j - j1) + Math.abs(k - i);
	//   76  177:iload_3         
	//   77  178:iload           7
	//   78  180:isub            
	//   79  181:iload           4
	//   80  183:iload_2         
	//   81  184:isub            
	//   82  185:invokestatic    #34  <Method int Math.abs(int)>
	//   83  188:iadd            
	//   84  189:ireturn         
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
		int i = 1;
	//    6   11:iconst_1        
	//    7   12:istore          6
		Rect rect = transition.getEpicenter();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #53  <Method Rect Transition.getEpicenter()>
	//   10   18:astore          19
		float f;
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
	//*  11   20:aload           4
	//*  12   22:ifnull          33
	//*  13   25:aload_0         
	//*  14   26:aload_3         
	//*  15   27:invokevirtual   #57  <Method int getViewVisibility(TransitionValues)>
	//*  16   30:ifne            195
			i = -1;
	//   17   33:iconst_m1       
	//   18   34:istore          6
		else
	//*  19   36:aload_0         
	//*  20   37:aload_3         
	//*  21   38:invokevirtual   #60  <Method int getViewX(TransitionValues)>
	//*  22   41:istore          9
	//*  23   43:aload_0         
	//*  24   44:aload_3         
	//*  25   45:invokevirtual   #63  <Method int getViewY(TransitionValues)>
	//*  26   48:istore          10
	//*  27   50:iconst_2        
	//*  28   51:newarray        int[]
	//*  29   53:astore_3        
	//*  30   54:aload_1         
	//*  31   55:aload_3         
	//*  32   56:invokevirtual   #67  <Method void ViewGroup.getLocationOnScreen(int[])>
	//*  33   59:aload_3         
	//*  34   60:iconst_0        
	//*  35   61:iaload          
	//*  36   62:aload_1         
	//*  37   63:invokevirtual   #71  <Method float ViewGroup.getTranslationX()>
	//*  38   66:invokestatic    #75  <Method int Math.round(float)>
	//*  39   69:iadd            
	//*  40   70:istore          11
	//*  41   72:aload_3         
	//*  42   73:iconst_1        
	//*  43   74:iaload          
	//*  44   75:aload_1         
	//*  45   76:invokevirtual   #78  <Method float ViewGroup.getTranslationY()>
	//*  46   79:invokestatic    #75  <Method int Math.round(float)>
	//*  47   82:iadd            
	//*  48   83:istore          12
	//*  49   85:iload           11
	//*  50   87:aload_1         
	//*  51   88:invokevirtual   #45  <Method int ViewGroup.getWidth()>
	//*  52   91:iadd            
	//*  53   92:istore          13
	//*  54   94:iload           12
	//*  55   96:aload_1         
	//*  56   97:invokevirtual   #42  <Method int ViewGroup.getHeight()>
	//*  57  100:iadd            
	//*  58  101:istore          14
	//*  59  103:aload           19
	//*  60  105:ifnull          201
	//*  61  108:aload           19
	//*  62  110:invokevirtual   #83  <Method int Rect.centerX()>
	//*  63  113:istore          7
	//*  64  115:aload           19
	//*  65  117:invokevirtual   #86  <Method int Rect.centerY()>
	//*  66  120:istore          8
	//*  67  122:aload_0         
	//*  68  123:aload_1         
	//*  69  124:iload           9
	//*  70  126:iload           10
	//*  71  128:iload           7
	//*  72  130:iload           8
	//*  73  132:iload           11
	//*  74  134:iload           12
	//*  75  136:iload           13
	//*  76  138:iload           14
	//*  77  140:invokespecial   #88  <Method int distance(View, int, int, int, int, int, int, int, int)>
	//*  78  143:i2f             
	//*  79  144:aload_0         
	//*  80  145:aload_1         
	//*  81  146:invokespecial   #90  <Method int getMaxDistance(ViewGroup)>
	//*  82  149:i2f             
	//*  83  150:fdiv            
	//*  84  151:fstore          5
	//*  85  153:aload_2         
	//*  86  154:invokevirtual   #94  <Method long Transition.getDuration()>
	//*  87  157:lstore          17
	//*  88  159:lload           17
	//*  89  161:lstore          15
	//*  90  163:lload           17
	//*  91  165:lconst_0        
	//*  92  166:lcmp            
	//*  93  167:ifge            175
	//*  94  170:ldc2w           #95  <Long 300L>
	//*  95  173:lstore          15
	//*  96  175:iload           6
	//*  97  177:i2l             
	//*  98  178:lload           15
	//*  99  180:lmul            
	//* 100  181:l2f             
	//* 101  182:aload_0         
	//* 102  183:getfield        #15  <Field float mPropagationSpeed>
	//* 103  186:fdiv            
	//* 104  187:fload           5
	//* 105  189:fmul            
	//* 106  190:invokestatic    #75  <Method int Math.round(float)>
	//* 107  193:i2l             
	//* 108  194:lreturn         
			transitionvalues = transitionvalues1;
	//  109  195:aload           4
	//  110  197:astore_3        
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
	//* 111  198:goto            36
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
		return (long)Math.round(((float)((long)i * l2) / mPropagationSpeed) * f);
	//* 124  219:goto            122
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
