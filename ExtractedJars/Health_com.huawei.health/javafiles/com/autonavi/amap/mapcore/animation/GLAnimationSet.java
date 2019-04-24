// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.animation;

import com.amap.api.maps.model.animation.Animation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.autonavi.amap.mapcore.animation:
//			GLAnimation, GLTransformation

public class GLAnimationSet extends GLAnimation
{

	public GLAnimationSet(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void GLAnimation()>
		mFlags = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #39  <Field int mFlags>
		mAnimations = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #41  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #42  <Method void ArrayList()>
	//    9   17:putfield        #44  <Field ArrayList mAnimations>
		mTempTransformation = new GLTransformation();
	//   10   20:aload_0         
	//   11   21:new             #46  <Class GLTransformation>
	//   12   24:dup             
	//   13   25:invokespecial   #47  <Method void GLTransformation()>
	//   14   28:putfield        #49  <Field GLTransformation mTempTransformation>
		setFlag(16, flag);
	//   15   31:aload_0         
	//   16   32:bipush          16
	//   17   34:iload_1         
	//   18   35:invokespecial   #53  <Method void setFlag(int, boolean)>
		init();
	//   19   38:aload_0         
	//   20   39:invokespecial   #56  <Method void init()>
	//   21   42:return          
	}

	private void init()
	{
		mStartTime = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #60  <Field long mStartTime>
	//    3    5:return          
	}

	private void setFlag(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            15
		{
			mFlags = mFlags | i;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field int mFlags>
	//    5    9:iload_1         
	//    6   10:ior             
	//    7   11:putfield        #39  <Field int mFlags>
			return;
	//    8   14:return          
		} else
		{
			mFlags = mFlags & ~i;
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #39  <Field int mFlags>
	//   12   20:iload_1         
	//   13   21:iconst_m1       
	//   14   22:ixor            
	//   15   23:iand            
	//   16   24:putfield        #39  <Field int mFlags>
			return;
	//   17   27:return          
		}
	}

	public void addAnimation(Animation animation)
	{
		mAnimations.add(((Object) (animation.glAnimation)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ArrayList mAnimations>
	//    2    4:aload_1         
	//    3    5:getfield        #68  <Field GLAnimation Animation.glAnimation>
	//    4    8:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
		boolean flag;
		if((mFlags & 0x40) == 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #39  <Field int mFlags>
	//*   8   16:bipush          64
	//*   9   18:iand            
	//*  10   19:ifne            27
			flag = true;
	//   11   22:iconst_1        
	//   12   23:istore_2        
		else
	//*  13   24:goto            29
			flag = false;
	//   14   27:iconst_0        
	//   15   28:istore_2        
		if(flag && animation.glAnimation.willChangeTransformationMatrix())
	//*  16   29:iload_2         
	//*  17   30:ifeq            54
	//*  18   33:aload_1         
	//*  19   34:getfield        #68  <Field GLAnimation Animation.glAnimation>
	//*  20   37:invokevirtual   #76  <Method boolean GLAnimation.willChangeTransformationMatrix()>
	//*  21   40:ifeq            54
			mFlags = mFlags | 0x40;
	//   22   43:aload_0         
	//   23   44:aload_0         
	//   24   45:getfield        #39  <Field int mFlags>
	//   25   48:bipush          64
	//   26   50:ior             
	//   27   51:putfield        #39  <Field int mFlags>
		if((mFlags & 0x80) == 0)
	//*  28   54:aload_0         
	//*  29   55:getfield        #39  <Field int mFlags>
	//*  30   58:sipush          128
	//*  31   61:iand            
	//*  32   62:ifne            70
			flag = true;
	//   33   65:iconst_1        
	//   34   66:istore_2        
		else
	//*  35   67:goto            72
			flag = false;
	//   36   70:iconst_0        
	//   37   71:istore_2        
		if(flag && animation.glAnimation.willChangeBounds())
	//*  38   72:iload_2         
	//*  39   73:ifeq            98
	//*  40   76:aload_1         
	//*  41   77:getfield        #68  <Field GLAnimation Animation.glAnimation>
	//*  42   80:invokevirtual   #79  <Method boolean GLAnimation.willChangeBounds()>
	//*  43   83:ifeq            98
			mFlags = mFlags | 0x80;
	//   44   86:aload_0         
	//   45   87:aload_0         
	//   46   88:getfield        #39  <Field int mFlags>
	//   47   91:sipush          128
	//   48   94:ior             
	//   49   95:putfield        #39  <Field int mFlags>
		if((mFlags & 0x20) == 32)
	//*  50   98:aload_0         
	//*  51   99:getfield        #39  <Field int mFlags>
	//*  52  102:bipush          32
	//*  53  104:iand            
	//*  54  105:bipush          32
	//*  55  107:icmpne          126
			mLastEnd = mStartOffset + mDuration;
	//   56  110:aload_0         
	//   57  111:aload_0         
	//   58  112:getfield        #82  <Field long mStartOffset>
	//   59  115:aload_0         
	//   60  116:getfield        #85  <Field long mDuration>
	//   61  119:ladd            
	//   62  120:putfield        #87  <Field long mLastEnd>
		else
	//*  63  123:goto            211
		if(mAnimations.size() == 1)
	//*  64  126:aload_0         
	//*  65  127:getfield        #44  <Field ArrayList mAnimations>
	//*  66  130:invokevirtual   #91  <Method int ArrayList.size()>
	//*  67  133:iconst_1        
	//*  68  134:icmpne          172
		{
			mDuration = animation.glAnimation.getStartOffset() + animation.glAnimation.getDuration();
	//   69  137:aload_0         
	//   70  138:aload_1         
	//   71  139:getfield        #68  <Field GLAnimation Animation.glAnimation>
	//   72  142:invokevirtual   #95  <Method long GLAnimation.getStartOffset()>
	//   73  145:aload_1         
	//   74  146:getfield        #68  <Field GLAnimation Animation.glAnimation>
	//   75  149:invokevirtual   #98  <Method long GLAnimation.getDuration()>
	//   76  152:ladd            
	//   77  153:putfield        #85  <Field long mDuration>
			mLastEnd = mStartOffset + mDuration;
	//   78  156:aload_0         
	//   79  157:aload_0         
	//   80  158:getfield        #82  <Field long mStartOffset>
	//   81  161:aload_0         
	//   82  162:getfield        #85  <Field long mDuration>
	//   83  165:ladd            
	//   84  166:putfield        #87  <Field long mLastEnd>
		} else
	//*  85  169:goto            211
		{
			mLastEnd = Math.max(mLastEnd, animation.glAnimation.getStartOffset() + animation.glAnimation.getDuration());
	//   86  172:aload_0         
	//   87  173:aload_0         
	//   88  174:getfield        #87  <Field long mLastEnd>
	//   89  177:aload_1         
	//   90  178:getfield        #68  <Field GLAnimation Animation.glAnimation>
	//   91  181:invokevirtual   #95  <Method long GLAnimation.getStartOffset()>
	//   92  184:aload_1         
	//   93  185:getfield        #68  <Field GLAnimation Animation.glAnimation>
	//   94  188:invokevirtual   #98  <Method long GLAnimation.getDuration()>
	//   95  191:ladd            
	//   96  192:invokestatic    #104 <Method long Math.max(long, long)>
	//   97  195:putfield        #87  <Field long mLastEnd>
			mDuration = mLastEnd - mStartOffset;
	//   98  198:aload_0         
	//   99  199:aload_0         
	//  100  200:getfield        #87  <Field long mLastEnd>
	//  101  203:aload_0         
	//  102  204:getfield        #82  <Field long mStartOffset>
	//  103  207:lsub            
	//  104  208:putfield        #85  <Field long mDuration>
		}
		mDirty = true;
	//  105  211:aload_0         
	//  106  212:iconst_1        
	//  107  213:putfield        #106 <Field boolean mDirty>
	//  108  216:return          
	}

	public void cleanAnimation()
	{
		mAnimations.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ArrayList mAnimations>
	//    2    4:invokevirtual   #110 <Method void ArrayList.clear()>
	//    3    7:return          
	}

	public volatile GLAnimation clone()
		throws CloneNotSupportedException
	{
		return ((GLAnimation) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method GLAnimationSet clone()>
	//    2    4:areturn         
	}

	public GLAnimationSet clone()
		throws CloneNotSupportedException
	{
		GLAnimationSet glanimationset = (GLAnimationSet)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #120 <Method GLAnimation GLAnimation.clone()>
	//    2    4:checkcast       #2   <Class GLAnimationSet>
	//    3    7:astore_3        
		glanimationset.mTempTransformation = new GLTransformation();
	//    4    8:aload_3         
	//    5    9:new             #46  <Class GLTransformation>
	//    6   12:dup             
	//    7   13:invokespecial   #47  <Method void GLTransformation()>
	//    8   16:putfield        #49  <Field GLTransformation mTempTransformation>
		glanimationset.mAnimations = new ArrayList();
	//    9   19:aload_3         
	//   10   20:new             #41  <Class ArrayList>
	//   11   23:dup             
	//   12   24:invokespecial   #42  <Method void ArrayList()>
	//   13   27:putfield        #44  <Field ArrayList mAnimations>
		int j = mAnimations.size();
	//   14   30:aload_0         
	//   15   31:getfield        #44  <Field ArrayList mAnimations>
	//   16   34:invokevirtual   #91  <Method int ArrayList.size()>
	//   17   37:istore_2        
		ArrayList arraylist = mAnimations;
	//   18   38:aload_0         
	//   19   39:getfield        #44  <Field ArrayList mAnimations>
	//   20   42:astore          4
		for(int i = 0; i < j; i++)
	//*  21   44:iconst_0        
	//*  22   45:istore_1        
	//*  23   46:iload_1         
	//*  24   47:iload_2         
	//*  25   48:icmpge          78
			glanimationset.mAnimations.add(((Object) (((GLAnimation)arraylist.get(i)).clone())));
	//   26   51:aload_3         
	//   27   52:getfield        #44  <Field ArrayList mAnimations>
	//   28   55:aload           4
	//   29   57:iload_1         
	//   30   58:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   31   61:checkcast       #4   <Class GLAnimation>
	//   32   64:invokevirtual   #120 <Method GLAnimation GLAnimation.clone()>
	//   33   67:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//   34   70:pop             

	//   35   71:iload_1         
	//   36   72:iconst_1        
	//   37   73:iadd            
	//   38   74:istore_1        
	//*  39   75:goto            46
		return glanimationset;
	//   40   78:aload_3         
	//   41   79:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method GLAnimationSet clone()>
	//    2    4:areturn         
	}

	public long computeDurationHint()
	{
		long l = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_2        
		int i = mAnimations.size();
	//    2    2:aload_0         
	//    3    3:getfield        #44  <Field ArrayList mAnimations>
	//    4    6:invokevirtual   #91  <Method int ArrayList.size()>
	//    5    9:istore_1        
		ArrayList arraylist = mAnimations;
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field ArrayList mAnimations>
	//    8   14:astore          8
		for(i--; i >= 0;)
	//*   9   16:iload_1         
	//*  10   17:iconst_1        
	//*  11   18:isub            
	//*  12   19:istore_1        
	//*  13   20:iload_1         
	//*  14   21:iflt            62
		{
			long l2 = ((GLAnimation)arraylist.get(i)).computeDurationHint();
	//   15   24:aload           8
	//   16   26:iload_1         
	//   17   27:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   18   30:checkcast       #4   <Class GLAnimation>
	//   19   33:invokevirtual   #128 <Method long GLAnimation.computeDurationHint()>
	//   20   36:lstore          6
			long l1 = l;
	//   21   38:lload_2         
	//   22   39:lstore          4
			if(l2 > l)
	//*  23   41:lload           6
	//*  24   43:lload_2         
	//*  25   44:lcmp            
	//*  26   45:ifle            52
				l1 = l2;
	//   27   48:lload           6
	//   28   50:lstore          4
			i--;
	//   29   52:iload_1         
	//   30   53:iconst_1        
	//   31   54:isub            
	//   32   55:istore_1        
			l = l1;
	//   33   56:lload           4
	//   34   58:lstore_2        
		}

	//*  35   59:goto            20
		return l;
	//   36   62:lload_2         
	//   37   63:lreturn         
	}

	public List getAnimations()
	{
		return ((List) (mAnimations));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ArrayList mAnimations>
	//    2    4:areturn         
	}

	public long getDuration()
	{
		ArrayList arraylist = mAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ArrayList mAnimations>
	//    2    4:astore          5
		int j = arraylist.size();
	//    3    6:aload           5
	//    4    8:invokevirtual   #91  <Method int ArrayList.size()>
	//    5   11:istore_2        
		long l = 0L;
	//    6   12:lconst_0        
	//    7   13:lstore_3        
		boolean flag;
		if((mFlags & 0x20) == 32)
	//*   8   14:aload_0         
	//*   9   15:getfield        #39  <Field int mFlags>
	//*  10   18:bipush          32
	//*  11   20:iand            
	//*  12   21:bipush          32
	//*  13   23:icmpne          31
			flag = true;
	//   14   26:iconst_1        
	//   15   27:istore_1        
		else
	//*  16   28:goto            33
			flag = false;
	//   17   31:iconst_0        
	//   18   32:istore_1        
		if(flag)
	//*  19   33:iload_1         
	//*  20   34:ifeq            42
			return mDuration;
	//   21   37:aload_0         
	//   22   38:getfield        #85  <Field long mDuration>
	//   23   41:lreturn         
		for(int i = 0; i < j; i++)
	//*  24   42:iconst_0        
	//*  25   43:istore_1        
	//*  26   44:iload_1         
	//*  27   45:iload_2         
	//*  28   46:icmpge          73
			l = Math.max(l, ((GLAnimation)arraylist.get(i)).getDuration());
	//   29   49:lload_3         
	//   30   50:aload           5
	//   31   52:iload_1         
	//   32   53:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   33   56:checkcast       #4   <Class GLAnimation>
	//   34   59:invokevirtual   #98  <Method long GLAnimation.getDuration()>
	//   35   62:invokestatic    #104 <Method long Math.max(long, long)>
	//   36   65:lstore_3        

	//   37   66:iload_1         
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore_1        
	//*  41   70:goto            44
		return l;
	//   42   73:lload_3         
	//   43   74:lreturn         
	}

	public long getStartTime()
	{
		long l = 0xffffffffL;
	//    0    0:ldc2w           #134 <Long 0xffffffffL>
	//    1    3:lstore_3        
		int j = mAnimations.size();
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field ArrayList mAnimations>
	//    4    8:invokevirtual   #91  <Method int ArrayList.size()>
	//    5   11:istore_2        
		ArrayList arraylist = mAnimations;
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field ArrayList mAnimations>
	//    8   16:astore          5
		for(int i = 0; i < j; i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_1        
	//*  11   20:iload_1         
	//*  12   21:iload_2         
	//*  13   22:icmpge          49
			l = Math.min(l, ((GLAnimation)arraylist.get(i)).getStartTime());
	//   14   25:lload_3         
	//   15   26:aload           5
	//   16   28:iload_1         
	//   17   29:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #4   <Class GLAnimation>
	//   19   35:invokevirtual   #137 <Method long GLAnimation.getStartTime()>
	//   20   38:invokestatic    #140 <Method long Math.min(long, long)>
	//   21   41:lstore_3        

	//   22   42:iload_1         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_1        
	//*  26   46:goto            20
		return l;
	//   27   49:lload_3         
	//   28   50:lreturn         
	}

	public boolean getTransformation(long l, GLTransformation gltransformation)
	{
		boolean flag1;
		boolean flag2;
		int i = mAnimations.size();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ArrayList mAnimations>
	//    2    4:invokevirtual   #91  <Method int ArrayList.size()>
	//    3    7:istore          5
		ArrayList arraylist = mAnimations;
	//    4    9:aload_0         
	//    5   10:getfield        #44  <Field ArrayList mAnimations>
	//    6   13:astore          8
		GLTransformation gltransformation1 = mTempTransformation;
	//    7   15:aload_0         
	//    8   16:getfield        #49  <Field GLTransformation mTempTransformation>
	//    9   19:astore          9
		flag1 = false;
	//   10   21:iconst_0        
	//   11   22:istore          6
		boolean flag = false;
	//   12   24:iconst_0        
	//   13   25:istore          4
		flag2 = true;
	//   14   27:iconst_1        
	//   15   28:istore          7
		gltransformation.clear();
	//   16   30:aload_3         
	//   17   31:invokevirtual   #145 <Method void GLTransformation.clear()>
		for(i--; i >= 0; i--)
	//*  18   34:iload           5
	//*  19   36:iconst_1        
	//*  20   37:isub            
	//*  21   38:istore          5
	//*  22   40:iload           5
	//*  23   42:iflt            143
		{
			GLAnimation glanimation = (GLAnimation)arraylist.get(i);
	//   24   45:aload           8
	//   25   47:iload           5
	//   26   49:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   27   52:checkcast       #4   <Class GLAnimation>
	//   28   55:astore          10
			gltransformation1.clear();
	//   29   57:aload           9
	//   30   59:invokevirtual   #145 <Method void GLTransformation.clear()>
			if(glanimation.getTransformation(l, gltransformation, getScaleFactor()) || flag1)
	//*  31   62:aload           10
	//*  32   64:lload_1         
	//*  33   65:aload_3         
	//*  34   66:aload_0         
	//*  35   67:invokevirtual   #149 <Method float getScaleFactor()>
	//*  36   70:invokevirtual   #152 <Method boolean GLAnimation.getTransformation(long, GLTransformation, float)>
	//*  37   73:ifne            81
	//*  38   76:iload           6
	//*  39   78:ifeq            87
				flag1 = true;
	//   40   81:iconst_1        
	//   41   82:istore          6
			else
	//*  42   84:goto            90
				flag1 = false;
	//   43   87:iconst_0        
	//   44   88:istore          6
			if(flag || glanimation.hasStarted())
	//*  45   90:iload           4
	//*  46   92:ifne            103
	//*  47   95:aload           10
	//*  48   97:invokevirtual   #155 <Method boolean GLAnimation.hasStarted()>
	//*  49  100:ifeq            109
				flag = true;
	//   50  103:iconst_1        
	//   51  104:istore          4
			else
	//*  52  106:goto            112
				flag = false;
	//   53  109:iconst_0        
	//   54  110:istore          4
			if(glanimation.hasEnded() && flag2)
	//*  55  112:aload           10
	//*  56  114:invokevirtual   #158 <Method boolean GLAnimation.hasEnded()>
	//*  57  117:ifeq            131
	//*  58  120:iload           7
	//*  59  122:ifeq            131
				flag2 = true;
	//   60  125:iconst_1        
	//   61  126:istore          7
			else
	//*  62  128:goto            134
				flag2 = false;
	//   63  131:iconst_0        
	//   64  132:istore          7
		}

	//   65  134:iload           5
	//   66  136:iconst_1        
	//   67  137:isub            
	//   68  138:istore          5
	//*  69  140:goto            40
		if(!flag)
			break MISSING_BLOCK_LABEL_176;
	//   70  143:iload           4
	//   71  145:ifeq            176
		if(!mStarted)
	//*  72  148:aload_0         
	//*  73  149:getfield        #161 <Field boolean mStarted>
	//*  74  152:ifne            176
		{
			if(mListener != null)
	//*  75  155:aload_0         
	//*  76  156:getfield        #165 <Field com.amap.api.maps.model.animation.Animation$AnimationListener mListener>
	//*  77  159:ifnull          171
				mListener.onAnimationStart();
	//   78  162:aload_0         
	//   79  163:getfield        #165 <Field com.amap.api.maps.model.animation.Animation$AnimationListener mListener>
	//   80  166:invokeinterface #170 <Method void com.amap.api.maps.model.animation.Animation$AnimationListener.onAnimationStart()>
			mStarted = true;
	//   81  171:aload_0         
	//   82  172:iconst_1        
	//   83  173:putfield        #161 <Field boolean mStarted>
		}
		if(flag2 != mEnded)
	//*  84  176:iload           7
	//*  85  178:aload_0         
	//*  86  179:getfield        #173 <Field boolean mEnded>
	//*  87  182:icmpeq          207
		{
			if(mListener != null)
	//*  88  185:aload_0         
	//*  89  186:getfield        #165 <Field com.amap.api.maps.model.animation.Animation$AnimationListener mListener>
	//*  90  189:ifnull          201
				mListener.onAnimationEnd();
	//   91  192:aload_0         
	//   92  193:getfield        #165 <Field com.amap.api.maps.model.animation.Animation$AnimationListener mListener>
	//   93  196:invokeinterface #176 <Method void com.amap.api.maps.model.animation.Animation$AnimationListener.onAnimationEnd()>
			mEnded = flag2;
	//   94  201:aload_0         
	//   95  202:iload           7
	//   96  204:putfield        #173 <Field boolean mEnded>
		}
		return flag1;
	//   97  207:iload           6
	//   98  209:ireturn         
		gltransformation;
	//   99  210:astore_3        
		((Throwable) (gltransformation)).printStackTrace();
	//  100  211:aload_3         
	//  101  212:invokevirtual   #179 <Method void Throwable.printStackTrace()>
		return flag1;
	//  102  215:iload           6
	//  103  217:ireturn         
	}

	public boolean hasAlpha()
	{
		if(mDirty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field boolean mDirty>
	//*   2    4:ifeq            66
		{
			mHasAlpha = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #182 <Field boolean mHasAlpha>
			mDirty = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #106 <Field boolean mDirty>
			int j = mAnimations.size();
	//    9   17:aload_0         
	//   10   18:getfield        #44  <Field ArrayList mAnimations>
	//   11   21:invokevirtual   #91  <Method int ArrayList.size()>
	//   12   24:istore_2        
			ArrayList arraylist = mAnimations;
	//   13   25:aload_0         
	//   14   26:getfield        #44  <Field ArrayList mAnimations>
	//   15   29:astore_3        
			int i = 0;
	//   16   30:iconst_0        
	//   17   31:istore_1        
			do
			{
				if(i >= j)
					break;
	//   18   32:iload_1         
	//   19   33:iload_2         
	//   20   34:icmpge          66
				if(((GLAnimation)arraylist.get(i)).hasAlpha())
	//*  21   37:aload_3         
	//*  22   38:iload_1         
	//*  23   39:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//*  24   42:checkcast       #4   <Class GLAnimation>
	//*  25   45:invokevirtual   #184 <Method boolean GLAnimation.hasAlpha()>
	//*  26   48:ifeq            59
				{
					mHasAlpha = true;
	//   27   51:aload_0         
	//   28   52:iconst_1        
	//   29   53:putfield        #182 <Field boolean mHasAlpha>
					break;
	//   30   56:goto            66
				}
				i++;
	//   31   59:iload_1         
	//   32   60:iconst_1        
	//   33   61:iadd            
	//   34   62:istore_1        
			} while(true);
	//   35   63:goto            32
		}
		return mHasAlpha;
	//   36   66:aload_0         
	//   37   67:getfield        #182 <Field boolean mHasAlpha>
	//   38   70:ireturn         
	}

	public void reset()
	{
		super.reset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method void GLAnimation.reset()>
	//    2    4:return          
	}

	public void restrictDuration(long l)
	{
		super.restrictDuration(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #191 <Method void GLAnimation.restrictDuration(long)>
		ArrayList arraylist = mAnimations;
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field ArrayList mAnimations>
	//    5    9:astore          5
		int j = arraylist.size();
	//    6   11:aload           5
	//    7   13:invokevirtual   #91  <Method int ArrayList.size()>
	//    8   16:istore          4
		for(int i = 0; i < j; i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_3        
	//*  11   20:iload_3         
	//*  12   21:iload           4
	//*  13   23:icmpge          46
			((GLAnimation)arraylist.get(i)).restrictDuration(l);
	//   14   26:aload           5
	//   15   28:iload_3         
	//   16   29:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   17   32:checkcast       #4   <Class GLAnimation>
	//   18   35:lload_1         
	//   19   36:invokevirtual   #191 <Method void GLAnimation.restrictDuration(long)>

	//   20   39:iload_3         
	//   21   40:iconst_1        
	//   22   41:iadd            
	//   23   42:istore_3        
	//*  24   43:goto            20
	//   25   46:return          
	}

	public void scaleCurrentDuration(float f)
	{
		ArrayList arraylist = mAnimations;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ArrayList mAnimations>
	//    2    4:astore          4
		int j = arraylist.size();
	//    3    6:aload           4
	//    4    8:invokevirtual   #91  <Method int ArrayList.size()>
	//    5   11:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iload_3         
	//*  10   16:icmpge          39
			((GLAnimation)arraylist.get(i)).scaleCurrentDuration(f);
	//   11   19:aload           4
	//   12   21:iload_2         
	//   13   22:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   14   25:checkcast       #4   <Class GLAnimation>
	//   15   28:fload_1         
	//   16   29:invokevirtual   #195 <Method void GLAnimation.scaleCurrentDuration(float)>

	//   17   32:iload_2         
	//   18   33:iconst_1        
	//   19   34:iadd            
	//   20   35:istore_2        
	//*  21   36:goto            14
	//   22   39:return          
	}

	public void setDuration(long l)
	{
		mFlags = mFlags | 0x20;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int mFlags>
	//    3    5:bipush          32
	//    4    7:ior             
	//    5    8:putfield        #39  <Field int mFlags>
		super.setDuration(l);
	//    6   11:aload_0         
	//    7   12:lload_1         
	//    8   13:invokespecial   #198 <Method void GLAnimation.setDuration(long)>
		mLastEnd = mStartOffset + mDuration;
	//    9   16:aload_0         
	//   10   17:aload_0         
	//   11   18:getfield        #82  <Field long mStartOffset>
	//   12   21:aload_0         
	//   13   22:getfield        #85  <Field long mDuration>
	//   14   25:ladd            
	//   15   26:putfield        #87  <Field long mLastEnd>
	//   16   29:return          
	}

	public void setFillAfter(boolean flag)
	{
		mFlags = mFlags | 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int mFlags>
	//    3    5:iconst_1        
	//    4    6:ior             
	//    5    7:putfield        #39  <Field int mFlags>
		super.setFillAfter(flag);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokespecial   #201 <Method void GLAnimation.setFillAfter(boolean)>
	//    9   15:return          
	}

	public void setFillBefore(boolean flag)
	{
		mFlags = mFlags | 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int mFlags>
	//    3    5:iconst_2        
	//    4    6:ior             
	//    5    7:putfield        #39  <Field int mFlags>
		super.setFillBefore(flag);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokespecial   #204 <Method void GLAnimation.setFillBefore(boolean)>
	//    9   15:return          
	}

	public void setRepeatMode(int i)
	{
		mFlags = mFlags | 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int mFlags>
	//    3    5:iconst_4        
	//    4    6:ior             
	//    5    7:putfield        #39  <Field int mFlags>
		super.setRepeatMode(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokespecial   #208 <Method void GLAnimation.setRepeatMode(int)>
	//    9   15:return          
	}

	public void setStartOffset(long l)
	{
		mFlags = mFlags | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int mFlags>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #39  <Field int mFlags>
		super.setStartOffset(l);
	//    6   11:aload_0         
	//    7   12:lload_1         
	//    8   13:invokespecial   #211 <Method void GLAnimation.setStartOffset(long)>
	//    9   16:return          
	}

	public void setStartTime(long l)
	{
		super.setStartTime(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #214 <Method void GLAnimation.setStartTime(long)>
		int j = mAnimations.size();
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field ArrayList mAnimations>
	//    5    9:invokevirtual   #91  <Method int ArrayList.size()>
	//    6   12:istore          4
		ArrayList arraylist = mAnimations;
	//    7   14:aload_0         
	//    8   15:getfield        #44  <Field ArrayList mAnimations>
	//    9   18:astore          5
		for(int i = 0; i < j; i++)
	//*  10   20:iconst_0        
	//*  11   21:istore_3        
	//*  12   22:iload_3         
	//*  13   23:iload           4
	//*  14   25:icmpge          48
			((GLAnimation)arraylist.get(i)).setStartTime(l);
	//   15   28:aload           5
	//   16   30:iload_3         
	//   17   31:invokevirtual   #124 <Method Object ArrayList.get(int)>
	//   18   34:checkcast       #4   <Class GLAnimation>
	//   19   37:lload_1         
	//   20   38:invokevirtual   #214 <Method void GLAnimation.setStartTime(long)>

	//   21   41:iload_3         
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore_3        
	//*  25   45:goto            22
	//   26   48:return          
	}

	public boolean willChangeBounds()
	{
		return (mFlags & 0x80) == 128;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int mFlags>
	//    2    4:sipush          128
	//    3    7:iand            
	//    4    8:sipush          128
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean willChangeTransformationMatrix()
	{
		return (mFlags & 0x40) == 64;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int mFlags>
	//    2    4:bipush          64
	//    3    6:iand            
	//    4    7:bipush          64
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private static final int PROPERTY_CHANGE_BOUNDS_MASK = 128;
	private static final int PROPERTY_DURATION_MASK = 32;
	private static final int PROPERTY_FILL_AFTER_MASK = 1;
	private static final int PROPERTY_FILL_BEFORE_MASK = 2;
	private static final int PROPERTY_MORPH_MATRIX_MASK = 64;
	private static final int PROPERTY_REPEAT_MODE_MASK = 4;
	private static final int PROPERTY_SHARE_INTERPOLATOR_MASK = 16;
	private static final int PROPERTY_START_OFFSET_MASK = 8;
	private ArrayList mAnimations;
	private boolean mDirty;
	private int mFlags;
	private boolean mHasAlpha;
	private long mLastEnd;
	private GLTransformation mTempTransformation;
}
