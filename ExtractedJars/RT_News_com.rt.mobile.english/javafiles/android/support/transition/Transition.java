// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;
import android.support.v4.view.ViewCompat;
import android.util.*;
import android.view.*;
import android.view.animation.AnimationUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package android.support.transition:
//			TransitionValuesMaps, Styleable, TransitionValues, TransitionPropagation, 
//			ViewUtils, TransitionSet, AnimatorUtils, PathMotion, 
//			WindowIdImpl

public abstract class Transition
	implements Cloneable
{
	private static class AnimationInfo
	{

		String mName;
		Transition mTransition;
		TransitionValues mValues;
		View mView;
		WindowIdImpl mWindowId;

		AnimationInfo(View view, String s, Transition transition, WindowIdImpl windowidimpl, TransitionValues transitionvalues)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mView = view;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field View mView>
			mName = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field String mName>
			mValues = transitionvalues;
		//    8   14:aload_0         
		//    9   15:aload           5
		//   10   17:putfield        #28  <Field TransitionValues mValues>
			mWindowId = windowidimpl;
		//   11   20:aload_0         
		//   12   21:aload           4
		//   13   23:putfield        #30  <Field WindowIdImpl mWindowId>
			mTransition = transition;
		//   14   26:aload_0         
		//   15   27:aload_3         
		//   16   28:putfield        #32  <Field Transition mTransition>
		//   17   31:return          
		}
	}

	private static class ArrayListManager
	{

		static ArrayList add(ArrayList arraylist, Object obj)
		{
			ArrayList arraylist1 = arraylist;
		//    0    0:aload_0         
		//    1    1:astore_2        
			if(arraylist == null)
		//*   2    2:aload_0         
		//*   3    3:ifnonnull       14
				arraylist1 = new ArrayList();
		//    4    6:new             #16  <Class ArrayList>
		//    5    9:dup             
		//    6   10:invokespecial   #17  <Method void ArrayList()>
		//    7   13:astore_2        
			if(!arraylist1.contains(obj))
		//*   8   14:aload_2         
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #21  <Method boolean ArrayList.contains(Object)>
		//*  11   19:ifne            28
				arraylist1.add(obj);
		//   12   22:aload_2         
		//   13   23:aload_1         
		//   14   24:invokevirtual   #23  <Method boolean ArrayList.add(Object)>
		//   15   27:pop             
			return arraylist1;
		//   16   28:aload_2         
		//   17   29:areturn         
		}

		static ArrayList remove(ArrayList arraylist, Object obj)
		{
			ArrayList arraylist1 = arraylist;
		//    0    0:aload_0         
		//    1    1:astore_2        
			if(arraylist != null)
		//*   2    2:aload_0         
		//*   3    3:ifnull          23
			{
				arraylist.remove(obj);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #28  <Method boolean ArrayList.remove(Object)>
		//    7   11:pop             
				arraylist1 = arraylist;
		//    8   12:aload_0         
		//    9   13:astore_2        
				if(arraylist.isEmpty())
		//*  10   14:aload_0         
		//*  11   15:invokevirtual   #32  <Method boolean ArrayList.isEmpty()>
		//*  12   18:ifeq            23
					arraylist1 = null;
		//   13   21:aconst_null     
		//   14   22:astore_2        
			}
			return arraylist1;
		//   15   23:aload_2         
		//   16   24:areturn         
		}

		private ArrayListManager()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static abstract class EpicenterCallback
	{

		public abstract Rect onGetEpicenter(Transition transition);

		public EpicenterCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface MatchOrder
		extends Annotation
	{
	}

	public static interface TransitionListener
	{

		public abstract void onTransitionCancel(Transition transition);

		public abstract void onTransitionEnd(Transition transition);

		public abstract void onTransitionPause(Transition transition);

		public abstract void onTransitionResume(Transition transition);

		public abstract void onTransitionStart(Transition transition);
	}


	public Transition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void Object()>
		mName = ((Object)this).getClass().getName();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #134 <Method Class Object.getClass()>
	//    5    9:invokevirtual   #140 <Method String Class.getName()>
	//    6   12:putfield        #142 <Field String mName>
		mStartDelay = -1L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #143 <Long -1L>
	//    9   19:putfield        #146 <Field long mStartDelay>
		mDuration = -1L;
	//   10   22:aload_0         
	//   11   23:ldc2w           #143 <Long -1L>
	//   12   26:putfield        #148 <Field long mDuration>
		mInterpolator = null;
	//   13   29:aload_0         
	//   14   30:aconst_null     
	//   15   31:putfield        #150 <Field TimeInterpolator mInterpolator>
		mTargetIds = new ArrayList();
	//   16   34:aload_0         
	//   17   35:new             #152 <Class ArrayList>
	//   18   38:dup             
	//   19   39:invokespecial   #153 <Method void ArrayList()>
	//   20   42:putfield        #155 <Field ArrayList mTargetIds>
		mTargets = new ArrayList();
	//   21   45:aload_0         
	//   22   46:new             #152 <Class ArrayList>
	//   23   49:dup             
	//   24   50:invokespecial   #153 <Method void ArrayList()>
	//   25   53:putfield        #157 <Field ArrayList mTargets>
		mTargetNames = null;
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:putfield        #159 <Field ArrayList mTargetNames>
		mTargetTypes = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #161 <Field ArrayList mTargetTypes>
		mTargetIdExcludes = null;
	//   32   66:aload_0         
	//   33   67:aconst_null     
	//   34   68:putfield        #163 <Field ArrayList mTargetIdExcludes>
		mTargetExcludes = null;
	//   35   71:aload_0         
	//   36   72:aconst_null     
	//   37   73:putfield        #165 <Field ArrayList mTargetExcludes>
		mTargetTypeExcludes = null;
	//   38   76:aload_0         
	//   39   77:aconst_null     
	//   40   78:putfield        #167 <Field ArrayList mTargetTypeExcludes>
		mTargetNameExcludes = null;
	//   41   81:aload_0         
	//   42   82:aconst_null     
	//   43   83:putfield        #169 <Field ArrayList mTargetNameExcludes>
		mTargetIdChildExcludes = null;
	//   44   86:aload_0         
	//   45   87:aconst_null     
	//   46   88:putfield        #171 <Field ArrayList mTargetIdChildExcludes>
		mTargetChildExcludes = null;
	//   47   91:aload_0         
	//   48   92:aconst_null     
	//   49   93:putfield        #173 <Field ArrayList mTargetChildExcludes>
		mTargetTypeChildExcludes = null;
	//   50   96:aload_0         
	//   51   97:aconst_null     
	//   52   98:putfield        #175 <Field ArrayList mTargetTypeChildExcludes>
		mStartValues = new TransitionValuesMaps();
	//   53  101:aload_0         
	//   54  102:new             #177 <Class TransitionValuesMaps>
	//   55  105:dup             
	//   56  106:invokespecial   #178 <Method void TransitionValuesMaps()>
	//   57  109:putfield        #180 <Field TransitionValuesMaps mStartValues>
		mEndValues = new TransitionValuesMaps();
	//   58  112:aload_0         
	//   59  113:new             #177 <Class TransitionValuesMaps>
	//   60  116:dup             
	//   61  117:invokespecial   #178 <Method void TransitionValuesMaps()>
	//   62  120:putfield        #182 <Field TransitionValuesMaps mEndValues>
		mParent = null;
	//   63  123:aload_0         
	//   64  124:aconst_null     
	//   65  125:putfield        #184 <Field TransitionSet mParent>
		mMatchOrder = DEFAULT_MATCH_ORDER;
	//   66  128:aload_0         
	//   67  129:getstatic       #118 <Field int[] DEFAULT_MATCH_ORDER>
	//   68  132:putfield        #186 <Field int[] mMatchOrder>
		mSceneRoot = null;
	//   69  135:aload_0         
	//   70  136:aconst_null     
	//   71  137:putfield        #188 <Field ViewGroup mSceneRoot>
		mCanRemoveViews = false;
	//   72  140:aload_0         
	//   73  141:iconst_0        
	//   74  142:putfield        #190 <Field boolean mCanRemoveViews>
		mCurrentAnimators = new ArrayList();
	//   75  145:aload_0         
	//   76  146:new             #152 <Class ArrayList>
	//   77  149:dup             
	//   78  150:invokespecial   #153 <Method void ArrayList()>
	//   79  153:putfield        #192 <Field ArrayList mCurrentAnimators>
		mNumInstances = 0;
	//   80  156:aload_0         
	//   81  157:iconst_0        
	//   82  158:putfield        #194 <Field int mNumInstances>
		mPaused = false;
	//   83  161:aload_0         
	//   84  162:iconst_0        
	//   85  163:putfield        #196 <Field boolean mPaused>
		mEnded = false;
	//   86  166:aload_0         
	//   87  167:iconst_0        
	//   88  168:putfield        #198 <Field boolean mEnded>
		mListeners = null;
	//   89  171:aload_0         
	//   90  172:aconst_null     
	//   91  173:putfield        #200 <Field ArrayList mListeners>
		mAnimators = new ArrayList();
	//   92  176:aload_0         
	//   93  177:new             #152 <Class ArrayList>
	//   94  180:dup             
	//   95  181:invokespecial   #153 <Method void ArrayList()>
	//   96  184:putfield        #202 <Field ArrayList mAnimators>
		mPathMotion = STRAIGHT_PATH_MOTION;
	//   97  187:aload_0         
	//   98  188:getstatic       #123 <Field PathMotion STRAIGHT_PATH_MOTION>
	//   99  191:putfield        #204 <Field PathMotion mPathMotion>
	//  100  194:return          
	}

	public Transition(Context context, AttributeSet attributeset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void Object()>
		mName = ((Object)this).getClass().getName();
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #134 <Method Class Object.getClass()>
	//    5    9:invokevirtual   #140 <Method String Class.getName()>
	//    6   12:putfield        #142 <Field String mName>
		mStartDelay = -1L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #143 <Long -1L>
	//    9   19:putfield        #146 <Field long mStartDelay>
		mDuration = -1L;
	//   10   22:aload_0         
	//   11   23:ldc2w           #143 <Long -1L>
	//   12   26:putfield        #148 <Field long mDuration>
		mInterpolator = null;
	//   13   29:aload_0         
	//   14   30:aconst_null     
	//   15   31:putfield        #150 <Field TimeInterpolator mInterpolator>
		mTargetIds = new ArrayList();
	//   16   34:aload_0         
	//   17   35:new             #152 <Class ArrayList>
	//   18   38:dup             
	//   19   39:invokespecial   #153 <Method void ArrayList()>
	//   20   42:putfield        #155 <Field ArrayList mTargetIds>
		mTargets = new ArrayList();
	//   21   45:aload_0         
	//   22   46:new             #152 <Class ArrayList>
	//   23   49:dup             
	//   24   50:invokespecial   #153 <Method void ArrayList()>
	//   25   53:putfield        #157 <Field ArrayList mTargets>
		mTargetNames = null;
	//   26   56:aload_0         
	//   27   57:aconst_null     
	//   28   58:putfield        #159 <Field ArrayList mTargetNames>
		mTargetTypes = null;
	//   29   61:aload_0         
	//   30   62:aconst_null     
	//   31   63:putfield        #161 <Field ArrayList mTargetTypes>
		mTargetIdExcludes = null;
	//   32   66:aload_0         
	//   33   67:aconst_null     
	//   34   68:putfield        #163 <Field ArrayList mTargetIdExcludes>
		mTargetExcludes = null;
	//   35   71:aload_0         
	//   36   72:aconst_null     
	//   37   73:putfield        #165 <Field ArrayList mTargetExcludes>
		mTargetTypeExcludes = null;
	//   38   76:aload_0         
	//   39   77:aconst_null     
	//   40   78:putfield        #167 <Field ArrayList mTargetTypeExcludes>
		mTargetNameExcludes = null;
	//   41   81:aload_0         
	//   42   82:aconst_null     
	//   43   83:putfield        #169 <Field ArrayList mTargetNameExcludes>
		mTargetIdChildExcludes = null;
	//   44   86:aload_0         
	//   45   87:aconst_null     
	//   46   88:putfield        #171 <Field ArrayList mTargetIdChildExcludes>
		mTargetChildExcludes = null;
	//   47   91:aload_0         
	//   48   92:aconst_null     
	//   49   93:putfield        #173 <Field ArrayList mTargetChildExcludes>
		mTargetTypeChildExcludes = null;
	//   50   96:aload_0         
	//   51   97:aconst_null     
	//   52   98:putfield        #175 <Field ArrayList mTargetTypeChildExcludes>
		mStartValues = new TransitionValuesMaps();
	//   53  101:aload_0         
	//   54  102:new             #177 <Class TransitionValuesMaps>
	//   55  105:dup             
	//   56  106:invokespecial   #178 <Method void TransitionValuesMaps()>
	//   57  109:putfield        #180 <Field TransitionValuesMaps mStartValues>
		mEndValues = new TransitionValuesMaps();
	//   58  112:aload_0         
	//   59  113:new             #177 <Class TransitionValuesMaps>
	//   60  116:dup             
	//   61  117:invokespecial   #178 <Method void TransitionValuesMaps()>
	//   62  120:putfield        #182 <Field TransitionValuesMaps mEndValues>
		mParent = null;
	//   63  123:aload_0         
	//   64  124:aconst_null     
	//   65  125:putfield        #184 <Field TransitionSet mParent>
		mMatchOrder = DEFAULT_MATCH_ORDER;
	//   66  128:aload_0         
	//   67  129:getstatic       #118 <Field int[] DEFAULT_MATCH_ORDER>
	//   68  132:putfield        #186 <Field int[] mMatchOrder>
		mSceneRoot = null;
	//   69  135:aload_0         
	//   70  136:aconst_null     
	//   71  137:putfield        #188 <Field ViewGroup mSceneRoot>
		mCanRemoveViews = false;
	//   72  140:aload_0         
	//   73  141:iconst_0        
	//   74  142:putfield        #190 <Field boolean mCanRemoveViews>
		mCurrentAnimators = new ArrayList();
	//   75  145:aload_0         
	//   76  146:new             #152 <Class ArrayList>
	//   77  149:dup             
	//   78  150:invokespecial   #153 <Method void ArrayList()>
	//   79  153:putfield        #192 <Field ArrayList mCurrentAnimators>
		mNumInstances = 0;
	//   80  156:aload_0         
	//   81  157:iconst_0        
	//   82  158:putfield        #194 <Field int mNumInstances>
		mPaused = false;
	//   83  161:aload_0         
	//   84  162:iconst_0        
	//   85  163:putfield        #196 <Field boolean mPaused>
		mEnded = false;
	//   86  166:aload_0         
	//   87  167:iconst_0        
	//   88  168:putfield        #198 <Field boolean mEnded>
		mListeners = null;
	//   89  171:aload_0         
	//   90  172:aconst_null     
	//   91  173:putfield        #200 <Field ArrayList mListeners>
		mAnimators = new ArrayList();
	//   92  176:aload_0         
	//   93  177:new             #152 <Class ArrayList>
	//   94  180:dup             
	//   95  181:invokespecial   #153 <Method void ArrayList()>
	//   96  184:putfield        #202 <Field ArrayList mAnimators>
		mPathMotion = STRAIGHT_PATH_MOTION;
	//   97  187:aload_0         
	//   98  188:getstatic       #123 <Field PathMotion STRAIGHT_PATH_MOTION>
	//   99  191:putfield        #204 <Field PathMotion mPathMotion>
		TypedArray typedarray = context.obtainStyledAttributes(attributeset, Styleable.TRANSITION);
	//  100  194:aload_1         
	//  101  195:aload_2         
	//  102  196:getstatic       #210 <Field int[] Styleable.TRANSITION>
	//  103  199:invokevirtual   #216 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//  104  202:astore          6
		attributeset = ((AttributeSet) ((XmlResourceParser)attributeset));
	//  105  204:aload_2         
	//  106  205:checkcast       #218 <Class XmlResourceParser>
	//  107  208:astore_2        
		long l = TypedArrayUtils.getNamedInt(typedarray, ((org.xmlpull.v1.XmlPullParser) (attributeset)), "duration", 1, -1);
	//  108  209:aload           6
	//  109  211:aload_2         
	//  110  212:ldc1            #220 <String "duration">
	//  111  214:iconst_1        
	//  112  215:iconst_m1       
	//  113  216:invokestatic    #226 <Method int TypedArrayUtils.getNamedInt(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//  114  219:i2l             
	//  115  220:lstore          4
		if(l >= 0L)
	//* 116  222:lload           4
	//* 117  224:lconst_0        
	//* 118  225:lcmp            
	//* 119  226:iflt            236
			setDuration(l);
	//  120  229:aload_0         
	//  121  230:lload           4
	//  122  232:invokevirtual   #230 <Method Transition setDuration(long)>
	//  123  235:pop             
		l = TypedArrayUtils.getNamedInt(typedarray, ((org.xmlpull.v1.XmlPullParser) (attributeset)), "startDelay", 2, -1);
	//  124  236:aload           6
	//  125  238:aload_2         
	//  126  239:ldc1            #232 <String "startDelay">
	//  127  241:iconst_2        
	//  128  242:iconst_m1       
	//  129  243:invokestatic    #226 <Method int TypedArrayUtils.getNamedInt(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//  130  246:i2l             
	//  131  247:lstore          4
		if(l > 0L)
	//* 132  249:lload           4
	//* 133  251:lconst_0        
	//* 134  252:lcmp            
	//* 135  253:ifle            263
			setStartDelay(l);
	//  136  256:aload_0         
	//  137  257:lload           4
	//  138  259:invokevirtual   #235 <Method Transition setStartDelay(long)>
	//  139  262:pop             
		int i = TypedArrayUtils.getNamedResourceId(typedarray, ((org.xmlpull.v1.XmlPullParser) (attributeset)), "interpolator", 0, 0);
	//  140  263:aload           6
	//  141  265:aload_2         
	//  142  266:ldc1            #237 <String "interpolator">
	//  143  268:iconst_0        
	//  144  269:iconst_0        
	//  145  270:invokestatic    #240 <Method int TypedArrayUtils.getNamedResourceId(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//  146  273:istore_3        
		if(i > 0)
	//* 147  274:iload_3         
	//* 148  275:ifle            288
			setInterpolator(((TimeInterpolator) (AnimationUtils.loadInterpolator(context, i))));
	//  149  278:aload_0         
	//  150  279:aload_1         
	//  151  280:iload_3         
	//  152  281:invokestatic    #246 <Method android.view.animation.Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//  153  284:invokevirtual   #250 <Method Transition setInterpolator(TimeInterpolator)>
	//  154  287:pop             
		context = ((Context) (TypedArrayUtils.getNamedString(typedarray, ((org.xmlpull.v1.XmlPullParser) (attributeset)), "matchOrder", 3)));
	//  155  288:aload           6
	//  156  290:aload_2         
	//  157  291:ldc1            #252 <String "matchOrder">
	//  158  293:iconst_3        
	//  159  294:invokestatic    #256 <Method String TypedArrayUtils.getNamedString(TypedArray, org.xmlpull.v1.XmlPullParser, String, int)>
	//  160  297:astore_1        
		if(context != null)
	//* 161  298:aload_1         
	//* 162  299:ifnull          310
			setMatchOrder(parseMatchOrder(((String) (context))));
	//  163  302:aload_0         
	//  164  303:aload_1         
	//  165  304:invokestatic    #260 <Method int[] parseMatchOrder(String)>
	//  166  307:invokevirtual   #264 <Method void setMatchOrder(int[])>
		typedarray.recycle();
	//  167  310:aload           6
	//  168  312:invokevirtual   #269 <Method void TypedArray.recycle()>
	//  169  315:return          
	}

	private void addUnmatched(ArrayMap arraymap, ArrayMap arraymap1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		int j;
		do
		{
			j = ((int) (flag));
	//    4    5:iload           5
	//    5    7:istore          4
			if(i >= arraymap.size())
				break;
	//    6    9:iload_3         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #279 <Method int ArrayMap.size()>
	//    9   14:icmpge          65
			TransitionValues transitionvalues = (TransitionValues)arraymap.valueAt(i);
	//   10   17:aload_1         
	//   11   18:iload_3         
	//   12   19:invokevirtual   #283 <Method Object ArrayMap.valueAt(int)>
	//   13   22:checkcast       #285 <Class TransitionValues>
	//   14   25:astore          6
			if(isValidTarget(transitionvalues.view))
	//*  15   27:aload_0         
	//*  16   28:aload           6
	//*  17   30:getfield        #289 <Field View TransitionValues.view>
	//*  18   33:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//*  19   36:ifeq            58
			{
				mStartValuesList.add(((Object) (transitionvalues)));
	//   20   39:aload_0         
	//   21   40:getfield        #295 <Field ArrayList mStartValuesList>
	//   22   43:aload           6
	//   23   45:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   24   48:pop             
				mEndValuesList.add(((Object) (null)));
	//   25   49:aload_0         
	//   26   50:getfield        #301 <Field ArrayList mEndValuesList>
	//   27   53:aconst_null     
	//   28   54:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   29   57:pop             
			}
			i++;
	//   30   58:iload_3         
	//   31   59:iconst_1        
	//   32   60:iadd            
	//   33   61:istore_3        
		} while(true);
	//   34   62:goto            5
		for(; j < arraymap1.size(); j++)
	//*  35   65:iload           4
	//*  36   67:aload_2         
	//*  37   68:invokevirtual   #279 <Method int ArrayMap.size()>
	//*  38   71:icmpge          122
		{
			arraymap = ((ArrayMap) ((TransitionValues)arraymap1.valueAt(j)));
	//   39   74:aload_2         
	//   40   75:iload           4
	//   41   77:invokevirtual   #283 <Method Object ArrayMap.valueAt(int)>
	//   42   80:checkcast       #285 <Class TransitionValues>
	//   43   83:astore_1        
			if(isValidTarget(((TransitionValues) (arraymap)).view))
	//*  44   84:aload_0         
	//*  45   85:aload_1         
	//*  46   86:getfield        #289 <Field View TransitionValues.view>
	//*  47   89:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//*  48   92:ifeq            113
			{
				mEndValuesList.add(((Object) (arraymap)));
	//   49   95:aload_0         
	//   50   96:getfield        #301 <Field ArrayList mEndValuesList>
	//   51   99:aload_1         
	//   52  100:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   53  103:pop             
				mStartValuesList.add(((Object) (null)));
	//   54  104:aload_0         
	//   55  105:getfield        #295 <Field ArrayList mStartValuesList>
	//   56  108:aconst_null     
	//   57  109:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   58  112:pop             
			}
		}

	//   59  113:iload           4
	//   60  115:iconst_1        
	//   61  116:iadd            
	//   62  117:istore          4
	//*  63  119:goto            65
	//   64  122:return          
	}

	private static void addViewValues(TransitionValuesMaps transitionvaluesmaps, View view, TransitionValues transitionvalues)
	{
		transitionvaluesmaps.mViewValues.put(((Object) (view)), ((Object) (transitionvalues)));
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #312 <Method Object ArrayMap.put(Object, Object)>
	//    5    9:pop             
		int i = view.getId();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #317 <Method int View.getId()>
	//    8   14:istore_3        
		if(i >= 0)
	//*   9   15:iload_3         
	//*  10   16:iflt            51
			if(transitionvaluesmaps.mIdValues.indexOfKey(i) >= 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//*  13   23:iload_3         
	//*  14   24:invokevirtual   #327 <Method int SparseArray.indexOfKey(int)>
	//*  15   27:iflt            42
				transitionvaluesmaps.mIdValues.put(i, ((Object) (null)));
	//   16   30:aload_0         
	//   17   31:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//   18   34:iload_3         
	//   19   35:aconst_null     
	//   20   36:invokevirtual   #330 <Method void SparseArray.put(int, Object)>
			else
	//*  21   39:goto            51
				transitionvaluesmaps.mIdValues.put(i, ((Object) (view)));
	//   22   42:aload_0         
	//   23   43:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//   24   46:iload_3         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #330 <Method void SparseArray.put(int, Object)>
		transitionvalues = ((TransitionValues) (ViewCompat.getTransitionName(view)));
	//   27   51:aload_1         
	//   28   52:invokestatic    #336 <Method String ViewCompat.getTransitionName(View)>
	//   29   55:astore_2        
		if(transitionvalues != null)
	//*  30   56:aload_2         
	//*  31   57:ifnull          94
			if(transitionvaluesmaps.mNameValues.containsKey(((Object) (transitionvalues))))
	//*  32   60:aload_0         
	//*  33   61:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//*  34   64:aload_2         
	//*  35   65:invokevirtual   #342 <Method boolean ArrayMap.containsKey(Object)>
	//*  36   68:ifeq            84
				transitionvaluesmaps.mNameValues.put(((Object) (transitionvalues)), ((Object) (null)));
	//   37   71:aload_0         
	//   38   72:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//   39   75:aload_2         
	//   40   76:aconst_null     
	//   41   77:invokevirtual   #312 <Method Object ArrayMap.put(Object, Object)>
	//   42   80:pop             
			else
	//*  43   81:goto            94
				transitionvaluesmaps.mNameValues.put(((Object) (transitionvalues)), ((Object) (view)));
	//   44   84:aload_0         
	//   45   85:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//   46   88:aload_2         
	//   47   89:aload_1         
	//   48   90:invokevirtual   #312 <Method Object ArrayMap.put(Object, Object)>
	//   49   93:pop             
		if(view.getParent() instanceof ListView)
	//*  50   94:aload_1         
	//*  51   95:invokevirtual   #346 <Method android.view.ViewParent View.getParent()>
	//*  52   98:instanceof      #348 <Class ListView>
	//*  53  101:ifeq            195
		{
			transitionvalues = ((TransitionValues) ((ListView)view.getParent()));
	//   54  104:aload_1         
	//   55  105:invokevirtual   #346 <Method android.view.ViewParent View.getParent()>
	//   56  108:checkcast       #348 <Class ListView>
	//   57  111:astore_2        
			if(((ListView) (transitionvalues)).getAdapter().hasStableIds())
	//*  58  112:aload_2         
	//*  59  113:invokevirtual   #352 <Method ListAdapter ListView.getAdapter()>
	//*  60  116:invokeinterface #358 <Method boolean ListAdapter.hasStableIds()>
	//*  61  121:ifeq            195
			{
				long l = ((ListView) (transitionvalues)).getItemIdAtPosition(((ListView) (transitionvalues)).getPositionForView(view));
	//   62  124:aload_2         
	//   63  125:aload_2         
	//   64  126:aload_1         
	//   65  127:invokevirtual   #362 <Method int ListView.getPositionForView(View)>
	//   66  130:invokevirtual   #366 <Method long ListView.getItemIdAtPosition(int)>
	//   67  133:lstore          4
				if(transitionvaluesmaps.mItemIdValues.indexOfKey(l) >= 0)
	//*  68  135:aload_0         
	//*  69  136:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//*  70  139:lload           4
	//*  71  141:invokevirtual   #375 <Method int LongSparseArray.indexOfKey(long)>
	//*  72  144:iflt            180
				{
					view = (View)transitionvaluesmaps.mItemIdValues.get(l);
	//   73  147:aload_0         
	//   74  148:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   75  151:lload           4
	//   76  153:invokevirtual   #379 <Method Object LongSparseArray.get(long)>
	//   77  156:checkcast       #314 <Class View>
	//   78  159:astore_1        
					if(view != null)
	//*  79  160:aload_1         
	//*  80  161:ifnull          195
					{
						ViewCompat.setHasTransientState(view, false);
	//   81  164:aload_1         
	//   82  165:iconst_0        
	//   83  166:invokestatic    #383 <Method void ViewCompat.setHasTransientState(View, boolean)>
						transitionvaluesmaps.mItemIdValues.put(l, ((Object) (null)));
	//   84  169:aload_0         
	//   85  170:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   86  173:lload           4
	//   87  175:aconst_null     
	//   88  176:invokevirtual   #386 <Method void LongSparseArray.put(long, Object)>
						return;
	//   89  179:return          
					}
				} else
				{
					ViewCompat.setHasTransientState(view, true);
	//   90  180:aload_1         
	//   91  181:iconst_1        
	//   92  182:invokestatic    #383 <Method void ViewCompat.setHasTransientState(View, boolean)>
					transitionvaluesmaps.mItemIdValues.put(l, ((Object) (view)));
	//   93  185:aload_0         
	//   94  186:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   95  189:lload           4
	//   96  191:aload_1         
	//   97  192:invokevirtual   #386 <Method void LongSparseArray.put(long, Object)>
				}
			}
		}
	//   98  195:return          
	}

	private static boolean alreadyContains(int ai[], int i)
	{
		int k = ai[i];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iaload          
	//    3    3:istore_3        
		for(int j = 0; j < i; j++)
	//*   4    4:iconst_0        
	//*   5    5:istore_2        
	//*   6    6:iload_2         
	//*   7    7:iload_1         
	//*   8    8:icmpge          27
			if(ai[j] == k)
	//*   9   11:aload_0         
	//*  10   12:iload_2         
	//*  11   13:iaload          
	//*  12   14:iload_3         
	//*  13   15:icmpne          20
				return true;
	//   14   18:iconst_1        
	//   15   19:ireturn         

	//   16   20:iload_2         
	//   17   21:iconst_1        
	//   18   22:iadd            
	//   19   23:istore_2        
	//*  20   24:goto            6
		return false;
	//   21   27:iconst_0        
	//   22   28:ireturn         
	}

	private void captureHierarchy(View view, boolean flag)
	{
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		int l = view.getId();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #317 <Method int View.getId()>
	//    5    9:istore          5
		if(mTargetIdExcludes != null && mTargetIdExcludes.contains(((Object) (Integer.valueOf(l)))))
	//*   6   11:aload_0         
	//*   7   12:getfield        #163 <Field ArrayList mTargetIdExcludes>
	//*   8   15:ifnull          34
	//*   9   18:aload_0         
	//*  10   19:getfield        #163 <Field ArrayList mTargetIdExcludes>
	//*  11   22:iload           5
	//*  12   24:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//*  13   27:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  14   30:ifeq            34
			return;
	//   15   33:return          
		if(mTargetExcludes != null && mTargetExcludes.contains(((Object) (view))))
	//*  16   34:aload_0         
	//*  17   35:getfield        #165 <Field ArrayList mTargetExcludes>
	//*  18   38:ifnull          53
	//*  19   41:aload_0         
	//*  20   42:getfield        #165 <Field ArrayList mTargetExcludes>
	//*  21   45:aload_1         
	//*  22   46:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  23   49:ifeq            53
			return;
	//   24   52:return          
		ArrayList arraylist = mTargetTypeExcludes;
	//   25   53:aload_0         
	//   26   54:getfield        #167 <Field ArrayList mTargetTypeExcludes>
	//   27   57:astore          7
		boolean flag1 = false;
	//   28   59:iconst_0        
	//   29   60:istore          4
		if(arraylist != null)
	//*  30   62:aload           7
	//*  31   64:ifnull          110
		{
			int j1 = mTargetTypeExcludes.size();
	//   32   67:aload_0         
	//   33   68:getfield        #167 <Field ArrayList mTargetTypeExcludes>
	//   34   71:invokevirtual   #399 <Method int ArrayList.size()>
	//   35   74:istore          6
			for(int i = 0; i < j1; i++)
	//*  36   76:iconst_0        
	//*  37   77:istore_3        
	//*  38   78:iload_3         
	//*  39   79:iload           6
	//*  40   81:icmpge          110
				if(((Class)mTargetTypeExcludes.get(i)).isInstance(((Object) (view))))
	//*  41   84:aload_0         
	//*  42   85:getfield        #167 <Field ArrayList mTargetTypeExcludes>
	//*  43   88:iload_3         
	//*  44   89:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//*  45   92:checkcast       #136 <Class Class>
	//*  46   95:aload_1         
	//*  47   96:invokevirtual   #404 <Method boolean Class.isInstance(Object)>
	//*  48   99:ifeq            103
					return;
	//   49  102:return          

	//   50  103:iload_3         
	//   51  104:iconst_1        
	//   52  105:iadd            
	//   53  106:istore_3        
		}
	//*  54  107:goto            78
		if(view.getParent() instanceof ViewGroup)
	//*  55  110:aload_1         
	//*  56  111:invokevirtual   #346 <Method android.view.ViewParent View.getParent()>
	//*  57  114:instanceof      #406 <Class ViewGroup>
	//*  58  117:ifeq            197
		{
			TransitionValues transitionvalues = new TransitionValues();
	//   59  120:new             #285 <Class TransitionValues>
	//   60  123:dup             
	//   61  124:invokespecial   #407 <Method void TransitionValues()>
	//   62  127:astore          7
			transitionvalues.view = view;
	//   63  129:aload           7
	//   64  131:aload_1         
	//   65  132:putfield        #289 <Field View TransitionValues.view>
			if(flag)
	//*  66  135:iload_2         
	//*  67  136:ifeq            148
				captureStartValues(transitionvalues);
	//   68  139:aload_0         
	//   69  140:aload           7
	//   70  142:invokevirtual   #411 <Method void captureStartValues(TransitionValues)>
			else
	//*  71  145:goto            154
				captureEndValues(transitionvalues);
	//   72  148:aload_0         
	//   73  149:aload           7
	//   74  151:invokevirtual   #414 <Method void captureEndValues(TransitionValues)>
			transitionvalues.mTargetedTransitions.add(((Object) (this)));
	//   75  154:aload           7
	//   76  156:getfield        #417 <Field ArrayList TransitionValues.mTargetedTransitions>
	//   77  159:aload_0         
	//   78  160:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   79  163:pop             
			capturePropagationValues(transitionvalues);
	//   80  164:aload_0         
	//   81  165:aload           7
	//   82  167:invokevirtual   #420 <Method void capturePropagationValues(TransitionValues)>
			if(flag)
	//*  83  170:iload_2         
	//*  84  171:ifeq            187
				addViewValues(mStartValues, view, transitionvalues);
	//   85  174:aload_0         
	//   86  175:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//   87  178:aload_1         
	//   88  179:aload           7
	//   89  181:invokestatic    #422 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
			else
	//*  90  184:goto            197
				addViewValues(mEndValues, view, transitionvalues);
	//   91  187:aload_0         
	//   92  188:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//   93  191:aload_1         
	//   94  192:aload           7
	//   95  194:invokestatic    #422 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
		}
		if(view instanceof ViewGroup)
	//*  96  197:aload_1         
	//*  97  198:instanceof      #406 <Class ViewGroup>
	//*  98  201:ifeq            329
		{
			if(mTargetIdChildExcludes != null && mTargetIdChildExcludes.contains(((Object) (Integer.valueOf(l)))))
	//*  99  204:aload_0         
	//* 100  205:getfield        #171 <Field ArrayList mTargetIdChildExcludes>
	//* 101  208:ifnull          227
	//* 102  211:aload_0         
	//* 103  212:getfield        #171 <Field ArrayList mTargetIdChildExcludes>
	//* 104  215:iload           5
	//* 105  217:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//* 106  220:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//* 107  223:ifeq            227
				return;
	//  108  226:return          
			if(mTargetChildExcludes != null && mTargetChildExcludes.contains(((Object) (view))))
	//* 109  227:aload_0         
	//* 110  228:getfield        #173 <Field ArrayList mTargetChildExcludes>
	//* 111  231:ifnull          246
	//* 112  234:aload_0         
	//* 113  235:getfield        #173 <Field ArrayList mTargetChildExcludes>
	//* 114  238:aload_1         
	//* 115  239:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//* 116  242:ifeq            246
				return;
	//  117  245:return          
			if(mTargetTypeChildExcludes != null)
	//* 118  246:aload_0         
	//* 119  247:getfield        #175 <Field ArrayList mTargetTypeChildExcludes>
	//* 120  250:ifnull          296
			{
				int i1 = mTargetTypeChildExcludes.size();
	//  121  253:aload_0         
	//  122  254:getfield        #175 <Field ArrayList mTargetTypeChildExcludes>
	//  123  257:invokevirtual   #399 <Method int ArrayList.size()>
	//  124  260:istore          5
				for(int j = 0; j < i1; j++)
	//* 125  262:iconst_0        
	//* 126  263:istore_3        
	//* 127  264:iload_3         
	//* 128  265:iload           5
	//* 129  267:icmpge          296
					if(((Class)mTargetTypeChildExcludes.get(j)).isInstance(((Object) (view))))
	//* 130  270:aload_0         
	//* 131  271:getfield        #175 <Field ArrayList mTargetTypeChildExcludes>
	//* 132  274:iload_3         
	//* 133  275:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//* 134  278:checkcast       #136 <Class Class>
	//* 135  281:aload_1         
	//* 136  282:invokevirtual   #404 <Method boolean Class.isInstance(Object)>
	//* 137  285:ifeq            289
						return;
	//  138  288:return          

	//  139  289:iload_3         
	//  140  290:iconst_1        
	//  141  291:iadd            
	//  142  292:istore_3        
			}
	//* 143  293:goto            264
			view = ((View) ((ViewGroup)view));
	//  144  296:aload_1         
	//  145  297:checkcast       #406 <Class ViewGroup>
	//  146  300:astore_1        
			for(int k = ((int) (flag1)); k < ((ViewGroup) (view)).getChildCount(); k++)
	//* 147  301:iload           4
	//* 148  303:istore_3        
	//* 149  304:iload_3         
	//* 150  305:aload_1         
	//* 151  306:invokevirtual   #425 <Method int ViewGroup.getChildCount()>
	//* 152  309:icmpge          329
				captureHierarchy(((ViewGroup) (view)).getChildAt(k), flag);
	//  153  312:aload_0         
	//  154  313:aload_1         
	//  155  314:iload_3         
	//  156  315:invokevirtual   #429 <Method View ViewGroup.getChildAt(int)>
	//  157  318:iload_2         
	//  158  319:invokespecial   #431 <Method void captureHierarchy(View, boolean)>

	//  159  322:iload_3         
	//  160  323:iconst_1        
	//  161  324:iadd            
	//  162  325:istore_3        
		}
	//* 163  326:goto            304
	//  164  329:return          
	}

	private ArrayList excludeId(ArrayList arraylist, int i, boolean flag)
	{
		ArrayList arraylist1 = arraylist;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(i > 0)
	//*   2    3:iload_2         
	//*   3    4:ifle            30
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            20
				return ArrayListManager.add(arraylist, ((Object) (Integer.valueOf(i))));
	//    6   11:aload_1         
	//    7   12:iload_2         
	//    8   13:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//    9   16:invokestatic    #436 <Method ArrayList Transition$ArrayListManager.add(ArrayList, Object)>
	//   10   19:areturn         
			arraylist1 = ArrayListManager.remove(arraylist, ((Object) (Integer.valueOf(i))));
	//   11   20:aload_1         
	//   12   21:iload_2         
	//   13   22:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//   14   25:invokestatic    #439 <Method ArrayList Transition$ArrayListManager.remove(ArrayList, Object)>
	//   15   28:astore          4
		}
		return arraylist1;
	//   16   30:aload           4
	//   17   32:areturn         
	}

	private static ArrayList excludeObject(ArrayList arraylist, Object obj, boolean flag)
	{
		ArrayList arraylist1 = arraylist;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(obj != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          22
		{
			if(flag)
	//*   4    6:iload_2         
	//*   5    7:ifeq            16
				return ArrayListManager.add(arraylist, obj);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #436 <Method ArrayList Transition$ArrayListManager.add(ArrayList, Object)>
	//    9   15:areturn         
			arraylist1 = ArrayListManager.remove(arraylist, obj);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokestatic    #439 <Method ArrayList Transition$ArrayListManager.remove(ArrayList, Object)>
	//   13   21:astore_3        
		}
		return arraylist1;
	//   14   22:aload_3         
	//   15   23:areturn         
	}

	private ArrayList excludeType(ArrayList arraylist, Class class1, boolean flag)
	{
		ArrayList arraylist1 = arraylist;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(class1 != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          24
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				return ArrayListManager.add(arraylist, ((Object) (class1)));
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokestatic    #436 <Method ArrayList Transition$ArrayListManager.add(ArrayList, Object)>
	//    9   16:areturn         
			arraylist1 = ArrayListManager.remove(arraylist, ((Object) (class1)));
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:invokestatic    #439 <Method ArrayList Transition$ArrayListManager.remove(ArrayList, Object)>
	//   13   22:astore          4
		}
		return arraylist1;
	//   14   24:aload           4
	//   15   26:areturn         
	}

	private ArrayList excludeView(ArrayList arraylist, View view, boolean flag)
	{
		ArrayList arraylist1 = arraylist;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(view != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          24
		{
			if(flag)
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
				return ArrayListManager.add(arraylist, ((Object) (view)));
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokestatic    #436 <Method ArrayList Transition$ArrayListManager.add(ArrayList, Object)>
	//    9   16:areturn         
			arraylist1 = ArrayListManager.remove(arraylist, ((Object) (view)));
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:invokestatic    #439 <Method ArrayList Transition$ArrayListManager.remove(ArrayList, Object)>
	//   13   22:astore          4
		}
		return arraylist1;
	//   14   24:aload           4
	//   15   26:areturn         
	}

	private static ArrayMap getRunningAnimators()
	{
		ArrayMap arraymap1 = (ArrayMap)sRunningAnimators.get();
	//    0    0:getstatic       #128 <Field ThreadLocal sRunningAnimators>
	//    1    3:invokevirtual   #454 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #275 <Class ArrayMap>
	//    3    9:astore_1        
		ArrayMap arraymap = arraymap1;
	//    4   10:aload_1         
	//    5   11:astore_0        
		if(arraymap1 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       31
		{
			arraymap = new ArrayMap();
	//    8   16:new             #275 <Class ArrayMap>
	//    9   19:dup             
	//   10   20:invokespecial   #455 <Method void ArrayMap()>
	//   11   23:astore_0        
			sRunningAnimators.set(((Object) (arraymap)));
	//   12   24:getstatic       #128 <Field ThreadLocal sRunningAnimators>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #459 <Method void ThreadLocal.set(Object)>
		}
		return arraymap;
	//   15   31:aload_0         
	//   16   32:areturn         
	}

	private static boolean isValidMatch(int i)
	{
		return i >= 1 && i <= 4;
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:icmplt          12
	//    3    5:iload_0         
	//    4    6:iconst_4        
	//    5    7:icmpgt          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	private static boolean isValueChanged(TransitionValues transitionvalues, TransitionValues transitionvalues1, String s)
	{
		transitionvalues = ((TransitionValues) (transitionvalues.values.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #468 <Field Map TransitionValues.values>
	//    2    4:aload_2         
	//    3    5:invokeinterface #473 <Method Object Map.get(Object)>
	//    4   10:astore_0        
		transitionvalues1 = ((TransitionValues) (transitionvalues1.values.get(((Object) (s)))));
	//    5   11:aload_1         
	//    6   12:getfield        #468 <Field Map TransitionValues.values>
	//    7   15:aload_2         
	//    8   16:invokeinterface #473 <Method Object Map.get(Object)>
	//    9   21:astore_1        
		boolean flag = true;
	//   10   22:iconst_1        
	//   11   23:istore_3        
		if(transitionvalues == null && transitionvalues1 == null)
	//*  12   24:aload_0         
	//*  13   25:ifnonnull       34
	//*  14   28:aload_1         
	//*  15   29:ifnonnull       34
			return false;
	//   16   32:iconst_0        
	//   17   33:ireturn         
		if(transitionvalues != null)
	//*  18   34:aload_0         
	//*  19   35:ifnull          52
		{
			if(transitionvalues1 == null)
	//*  20   38:aload_1         
	//*  21   39:ifnonnull       44
				return true;
	//   22   42:iconst_1        
	//   23   43:ireturn         
			flag = true ^ ((Object) (transitionvalues)).equals(((Object) (transitionvalues1)));
	//   24   44:iconst_1        
	//   25   45:aload_0         
	//   26   46:aload_1         
	//   27   47:invokevirtual   #476 <Method boolean Object.equals(Object)>
	//   28   50:ixor            
	//   29   51:istore_3        
		}
		return flag;
	//   30   52:iload_3         
	//   31   53:ireturn         
	}

	private void matchIds(ArrayMap arraymap, ArrayMap arraymap1, SparseArray sparsearray, SparseArray sparsearray1)
	{
		int j = sparsearray.size();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #479 <Method int SparseArray.size()>
	//    2    4:istore          6
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore          5
	//*   5    9:iload           5
	//*   6   11:iload           6
	//*   7   13:icmpge          146
		{
			View view = (View)sparsearray.valueAt(i);
	//    8   16:aload_3         
	//    9   17:iload           5
	//   10   19:invokevirtual   #480 <Method Object SparseArray.valueAt(int)>
	//   11   22:checkcast       #314 <Class View>
	//   12   25:astore          7
			if(view == null || !isValidTarget(view))
				continue;
	//   13   27:aload           7
	//   14   29:ifnull          137
	//   15   32:aload_0         
	//   16   33:aload           7
	//   17   35:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//   18   38:ifeq            137
			View view1 = (View)sparsearray1.get(sparsearray.keyAt(i));
	//   19   41:aload           4
	//   20   43:aload_3         
	//   21   44:iload           5
	//   22   46:invokevirtual   #483 <Method int SparseArray.keyAt(int)>
	//   23   49:invokevirtual   #484 <Method Object SparseArray.get(int)>
	//   24   52:checkcast       #314 <Class View>
	//   25   55:astore          8
			if(view1 == null || !isValidTarget(view1))
				continue;
	//   26   57:aload           8
	//   27   59:ifnull          137
	//   28   62:aload_0         
	//   29   63:aload           8
	//   30   65:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//   31   68:ifeq            137
			TransitionValues transitionvalues = (TransitionValues)arraymap.get(((Object) (view)));
	//   32   71:aload_1         
	//   33   72:aload           7
	//   34   74:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//   35   77:checkcast       #285 <Class TransitionValues>
	//   36   80:astore          9
			TransitionValues transitionvalues1 = (TransitionValues)arraymap1.get(((Object) (view1)));
	//   37   82:aload_2         
	//   38   83:aload           8
	//   39   85:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//   40   88:checkcast       #285 <Class TransitionValues>
	//   41   91:astore          10
			if(transitionvalues != null && transitionvalues1 != null)
	//*  42   93:aload           9
	//*  43   95:ifnull          137
	//*  44   98:aload           10
	//*  45  100:ifnull          137
			{
				mStartValuesList.add(((Object) (transitionvalues)));
	//   46  103:aload_0         
	//   47  104:getfield        #295 <Field ArrayList mStartValuesList>
	//   48  107:aload           9
	//   49  109:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   50  112:pop             
				mEndValuesList.add(((Object) (transitionvalues1)));
	//   51  113:aload_0         
	//   52  114:getfield        #301 <Field ArrayList mEndValuesList>
	//   53  117:aload           10
	//   54  119:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   55  122:pop             
				arraymap.remove(((Object) (view)));
	//   56  123:aload_1         
	//   57  124:aload           7
	//   58  126:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//   59  129:pop             
				arraymap1.remove(((Object) (view1)));
	//   60  130:aload_2         
	//   61  131:aload           8
	//   62  133:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//   63  136:pop             
			}
		}

	//   64  137:iload           5
	//   65  139:iconst_1        
	//   66  140:iadd            
	//   67  141:istore          5
	//*  68  143:goto            9
	//   69  146:return          
	}

	private void matchInstances(ArrayMap arraymap, ArrayMap arraymap1)
	{
		for(int i = arraymap.size() - 1; i >= 0; i--)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #279 <Method int ArrayMap.size()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:iflt            108
		{
			Object obj = ((Object) ((View)arraymap.keyAt(i)));
	//    7   11:aload_1         
	//    8   12:iload_3         
	//    9   13:invokevirtual   #491 <Method Object ArrayMap.keyAt(int)>
	//   10   16:checkcast       #314 <Class View>
	//   11   19:astore          4
			if(obj == null || !isValidTarget(((View) (obj))))
				continue;
	//   12   21:aload           4
	//   13   23:ifnull          101
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//   17   32:ifeq            101
			obj = ((Object) ((TransitionValues)arraymap1.remove(obj)));
	//   18   35:aload_2         
	//   19   36:aload           4
	//   20   38:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//   21   41:checkcast       #285 <Class TransitionValues>
	//   22   44:astore          4
			if(obj != null && ((TransitionValues) (obj)).view != null && isValidTarget(((TransitionValues) (obj)).view))
	//*  23   46:aload           4
	//*  24   48:ifnull          101
	//*  25   51:aload           4
	//*  26   53:getfield        #289 <Field View TransitionValues.view>
	//*  27   56:ifnull          101
	//*  28   59:aload_0         
	//*  29   60:aload           4
	//*  30   62:getfield        #289 <Field View TransitionValues.view>
	//*  31   65:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//*  32   68:ifeq            101
			{
				TransitionValues transitionvalues = (TransitionValues)arraymap.removeAt(i);
	//   33   71:aload_1         
	//   34   72:iload_3         
	//   35   73:invokevirtual   #494 <Method Object ArrayMap.removeAt(int)>
	//   36   76:checkcast       #285 <Class TransitionValues>
	//   37   79:astore          5
				mStartValuesList.add(((Object) (transitionvalues)));
	//   38   81:aload_0         
	//   39   82:getfield        #295 <Field ArrayList mStartValuesList>
	//   40   85:aload           5
	//   41   87:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   42   90:pop             
				mEndValuesList.add(obj);
	//   43   91:aload_0         
	//   44   92:getfield        #301 <Field ArrayList mEndValuesList>
	//   45   95:aload           4
	//   46   97:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   47  100:pop             
			}
		}

	//   48  101:iload_3         
	//   49  102:iconst_1        
	//   50  103:isub            
	//   51  104:istore_3        
	//*  52  105:goto            7
	//   53  108:return          
	}

	private void matchItemIds(ArrayMap arraymap, ArrayMap arraymap1, LongSparseArray longsparsearray, LongSparseArray longsparsearray1)
	{
		int j = longsparsearray.size();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #497 <Method int LongSparseArray.size()>
	//    2    4:istore          6
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore          5
	//*   5    9:iload           5
	//*   6   11:iload           6
	//*   7   13:icmpge          146
		{
			View view = (View)longsparsearray.valueAt(i);
	//    8   16:aload_3         
	//    9   17:iload           5
	//   10   19:invokevirtual   #498 <Method Object LongSparseArray.valueAt(int)>
	//   11   22:checkcast       #314 <Class View>
	//   12   25:astore          7
			if(view == null || !isValidTarget(view))
				continue;
	//   13   27:aload           7
	//   14   29:ifnull          137
	//   15   32:aload_0         
	//   16   33:aload           7
	//   17   35:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//   18   38:ifeq            137
			View view1 = (View)longsparsearray1.get(longsparsearray.keyAt(i));
	//   19   41:aload           4
	//   20   43:aload_3         
	//   21   44:iload           5
	//   22   46:invokevirtual   #500 <Method long LongSparseArray.keyAt(int)>
	//   23   49:invokevirtual   #379 <Method Object LongSparseArray.get(long)>
	//   24   52:checkcast       #314 <Class View>
	//   25   55:astore          8
			if(view1 == null || !isValidTarget(view1))
				continue;
	//   26   57:aload           8
	//   27   59:ifnull          137
	//   28   62:aload_0         
	//   29   63:aload           8
	//   30   65:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//   31   68:ifeq            137
			TransitionValues transitionvalues = (TransitionValues)arraymap.get(((Object) (view)));
	//   32   71:aload_1         
	//   33   72:aload           7
	//   34   74:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//   35   77:checkcast       #285 <Class TransitionValues>
	//   36   80:astore          9
			TransitionValues transitionvalues1 = (TransitionValues)arraymap1.get(((Object) (view1)));
	//   37   82:aload_2         
	//   38   83:aload           8
	//   39   85:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//   40   88:checkcast       #285 <Class TransitionValues>
	//   41   91:astore          10
			if(transitionvalues != null && transitionvalues1 != null)
	//*  42   93:aload           9
	//*  43   95:ifnull          137
	//*  44   98:aload           10
	//*  45  100:ifnull          137
			{
				mStartValuesList.add(((Object) (transitionvalues)));
	//   46  103:aload_0         
	//   47  104:getfield        #295 <Field ArrayList mStartValuesList>
	//   48  107:aload           9
	//   49  109:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   50  112:pop             
				mEndValuesList.add(((Object) (transitionvalues1)));
	//   51  113:aload_0         
	//   52  114:getfield        #301 <Field ArrayList mEndValuesList>
	//   53  117:aload           10
	//   54  119:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   55  122:pop             
				arraymap.remove(((Object) (view)));
	//   56  123:aload_1         
	//   57  124:aload           7
	//   58  126:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//   59  129:pop             
				arraymap1.remove(((Object) (view1)));
	//   60  130:aload_2         
	//   61  131:aload           8
	//   62  133:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//   63  136:pop             
			}
		}

	//   64  137:iload           5
	//   65  139:iconst_1        
	//   66  140:iadd            
	//   67  141:istore          5
	//*  68  143:goto            9
	//   69  146:return          
	}

	private void matchNames(ArrayMap arraymap, ArrayMap arraymap1, ArrayMap arraymap2, ArrayMap arraymap3)
	{
		int j = arraymap2.size();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #279 <Method int ArrayMap.size()>
	//    2    4:istore          6
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore          5
	//*   5    9:iload           5
	//*   6   11:iload           6
	//*   7   13:icmpge          146
		{
			View view = (View)arraymap2.valueAt(i);
	//    8   16:aload_3         
	//    9   17:iload           5
	//   10   19:invokevirtual   #283 <Method Object ArrayMap.valueAt(int)>
	//   11   22:checkcast       #314 <Class View>
	//   12   25:astore          7
			if(view == null || !isValidTarget(view))
				continue;
	//   13   27:aload           7
	//   14   29:ifnull          137
	//   15   32:aload_0         
	//   16   33:aload           7
	//   17   35:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//   18   38:ifeq            137
			View view1 = (View)arraymap3.get(arraymap2.keyAt(i));
	//   19   41:aload           4
	//   20   43:aload_3         
	//   21   44:iload           5
	//   22   46:invokevirtual   #491 <Method Object ArrayMap.keyAt(int)>
	//   23   49:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//   24   52:checkcast       #314 <Class View>
	//   25   55:astore          8
			if(view1 == null || !isValidTarget(view1))
				continue;
	//   26   57:aload           8
	//   27   59:ifnull          137
	//   28   62:aload_0         
	//   29   63:aload           8
	//   30   65:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//   31   68:ifeq            137
			TransitionValues transitionvalues = (TransitionValues)arraymap.get(((Object) (view)));
	//   32   71:aload_1         
	//   33   72:aload           7
	//   34   74:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//   35   77:checkcast       #285 <Class TransitionValues>
	//   36   80:astore          9
			TransitionValues transitionvalues1 = (TransitionValues)arraymap1.get(((Object) (view1)));
	//   37   82:aload_2         
	//   38   83:aload           8
	//   39   85:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//   40   88:checkcast       #285 <Class TransitionValues>
	//   41   91:astore          10
			if(transitionvalues != null && transitionvalues1 != null)
	//*  42   93:aload           9
	//*  43   95:ifnull          137
	//*  44   98:aload           10
	//*  45  100:ifnull          137
			{
				mStartValuesList.add(((Object) (transitionvalues)));
	//   46  103:aload_0         
	//   47  104:getfield        #295 <Field ArrayList mStartValuesList>
	//   48  107:aload           9
	//   49  109:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   50  112:pop             
				mEndValuesList.add(((Object) (transitionvalues1)));
	//   51  113:aload_0         
	//   52  114:getfield        #301 <Field ArrayList mEndValuesList>
	//   53  117:aload           10
	//   54  119:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   55  122:pop             
				arraymap.remove(((Object) (view)));
	//   56  123:aload_1         
	//   57  124:aload           7
	//   58  126:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//   59  129:pop             
				arraymap1.remove(((Object) (view1)));
	//   60  130:aload_2         
	//   61  131:aload           8
	//   62  133:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//   63  136:pop             
			}
		}

	//   64  137:iload           5
	//   65  139:iconst_1        
	//   66  140:iadd            
	//   67  141:istore          5
	//*  68  143:goto            9
	//   69  146:return          
	}

	private void matchStartAndEnd(TransitionValuesMaps transitionvaluesmaps, TransitionValuesMaps transitionvaluesmaps1)
	{
		ArrayMap arraymap = new ArrayMap(((android.support.v4.util.SimpleArrayMap) (transitionvaluesmaps.mViewValues)));
	//    0    0:new             #275 <Class ArrayMap>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//    4    8:invokespecial   #509 <Method void ArrayMap(android.support.v4.util.SimpleArrayMap)>
	//    5   11:astore          4
		ArrayMap arraymap1 = new ArrayMap(((android.support.v4.util.SimpleArrayMap) (transitionvaluesmaps1.mViewValues)));
	//    6   13:new             #275 <Class ArrayMap>
	//    7   16:dup             
	//    8   17:aload_2         
	//    9   18:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//   10   21:invokespecial   #509 <Method void ArrayMap(android.support.v4.util.SimpleArrayMap)>
	//   11   24:astore          5
		for(int i = 0; i < mMatchOrder.length; i++)
	//*  12   26:iconst_0        
	//*  13   27:istore_3        
	//*  14   28:iload_3         
	//*  15   29:aload_0         
	//*  16   30:getfield        #186 <Field int[] mMatchOrder>
	//*  17   33:arraylength     
	//*  18   34:icmpge          147
			switch(mMatchOrder[i])
	//*  19   37:aload_0         
	//*  20   38:getfield        #186 <Field int[] mMatchOrder>
	//*  21   41:iload_3         
	//*  22   42:iaload          
			{
	//*  23   43:tableswitch     1 4: default 72
	//	               1 132
	//	               2 113
	//	               3 94
	//	               4 75
	//*  24   72:goto            140
			case 4: // '\004'
				matchItemIds(arraymap, arraymap1, transitionvaluesmaps.mItemIdValues, transitionvaluesmaps1.mItemIdValues);
	//   25   75:aload_0         
	//   26   76:aload           4
	//   27   78:aload           5
	//   28   80:aload_1         
	//   29   81:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   30   84:aload_2         
	//   31   85:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   32   88:invokespecial   #511 <Method void matchItemIds(ArrayMap, ArrayMap, LongSparseArray, LongSparseArray)>
				break;

	//*  33   91:goto            140
			case 3: // '\003'
				matchIds(arraymap, arraymap1, transitionvaluesmaps.mIdValues, transitionvaluesmaps1.mIdValues);
	//   34   94:aload_0         
	//   35   95:aload           4
	//   36   97:aload           5
	//   37   99:aload_1         
	//   38  100:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//   39  103:aload_2         
	//   40  104:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//   41  107:invokespecial   #513 <Method void matchIds(ArrayMap, ArrayMap, SparseArray, SparseArray)>
				break;

	//*  42  110:goto            140
			case 2: // '\002'
				matchNames(arraymap, arraymap1, transitionvaluesmaps.mNameValues, transitionvaluesmaps1.mNameValues);
	//   43  113:aload_0         
	//   44  114:aload           4
	//   45  116:aload           5
	//   46  118:aload_1         
	//   47  119:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//   48  122:aload_2         
	//   49  123:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//   50  126:invokespecial   #515 <Method void matchNames(ArrayMap, ArrayMap, ArrayMap, ArrayMap)>
				break;

	//*  51  129:goto            140
			case 1: // '\001'
				matchInstances(arraymap, arraymap1);
	//   52  132:aload_0         
	//   53  133:aload           4
	//   54  135:aload           5
	//   55  137:invokespecial   #517 <Method void matchInstances(ArrayMap, ArrayMap)>
				break;
			}

	//   56  140:iload_3         
	//   57  141:iconst_1        
	//   58  142:iadd            
	//   59  143:istore_3        
	//*  60  144:goto            28
		addUnmatched(arraymap, arraymap1);
	//   61  147:aload_0         
	//   62  148:aload           4
	//   63  150:aload           5
	//   64  152:invokespecial   #519 <Method void addUnmatched(ArrayMap, ArrayMap)>
	//   65  155:return          
	}

	private static int[] parseMatchOrder(String s)
	{
label0:
		{
			StringTokenizer stringtokenizer = new StringTokenizer(s, ",");
	//    0    0:new             #521 <Class StringTokenizer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc2            #523 <String ",">
	//    4    8:invokespecial   #526 <Method void StringTokenizer(String, String)>
	//    5   11:astore_3        
			s = ((String) (new int[stringtokenizer.countTokens()]));
	//    6   12:aload_3         
	//    7   13:invokevirtual   #529 <Method int StringTokenizer.countTokens()>
	//    8   16:newarray        int[]
	//    9   18:astore_0        
			int i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_1        
			Object obj;
			do
			{
				if(!stringtokenizer.hasMoreTokens())
					break label0;
	//   12   21:aload_3         
	//   13   22:invokevirtual   #532 <Method boolean StringTokenizer.hasMoreTokens()>
	//   14   25:ifeq            177
				obj = ((Object) (stringtokenizer.nextToken().trim()));
	//   15   28:aload_3         
	//   16   29:invokevirtual   #535 <Method String StringTokenizer.nextToken()>
	//   17   32:invokevirtual   #540 <Method String String.trim()>
	//   18   35:astore_2        
				if("id".equalsIgnoreCase(((String) (obj))))
	//*  19   36:ldc1            #44  <String "id">
	//*  20   38:aload_2         
	//*  21   39:invokevirtual   #544 <Method boolean String.equalsIgnoreCase(String)>
	//*  22   42:ifeq            52
					s[i] = 3;
	//   23   45:aload_0         
	//   24   46:iload_1         
	//   25   47:iconst_3        
	//   26   48:iastore         
				else
	//*  27   49:goto            128
				if("instance".equalsIgnoreCase(((String) (obj))))
	//*  28   52:ldc1            #48  <String "instance">
	//*  29   54:aload_2         
	//*  30   55:invokevirtual   #544 <Method boolean String.equalsIgnoreCase(String)>
	//*  31   58:ifeq            68
					s[i] = 1;
	//   32   61:aload_0         
	//   33   62:iload_1         
	//   34   63:iconst_1        
	//   35   64:iastore         
				else
	//*  36   65:goto            128
				if("name".equalsIgnoreCase(((String) (obj))))
	//*  37   68:ldc1            #59  <String "name">
	//*  38   70:aload_2         
	//*  39   71:invokevirtual   #544 <Method boolean String.equalsIgnoreCase(String)>
	//*  40   74:ifeq            84
					s[i] = 2;
	//   41   77:aload_0         
	//   42   78:iload_1         
	//   43   79:iconst_2        
	//   44   80:iastore         
				else
	//*  45   81:goto            128
				if("itemId".equalsIgnoreCase(((String) (obj))))
	//*  46   84:ldc1            #53  <String "itemId">
	//*  47   86:aload_2         
	//*  48   87:invokevirtual   #544 <Method boolean String.equalsIgnoreCase(String)>
	//*  49   90:ifeq            100
				{
					s[i] = 4;
	//   50   93:aload_0         
	//   51   94:iload_1         
	//   52   95:iconst_4        
	//   53   96:iastore         
				} else
	//*  54   97:goto            128
				{
					if(!((String) (obj)).isEmpty())
						break;
	//   55  100:aload_2         
	//   56  101:invokevirtual   #547 <Method boolean String.isEmpty()>
	//   57  104:ifeq            135
					obj = ((Object) (new int[s.length - 1]));
	//   58  107:aload_0         
	//   59  108:arraylength     
	//   60  109:iconst_1        
	//   61  110:isub            
	//   62  111:newarray        int[]
	//   63  113:astore_2        
					System.arraycopy(((Object) (s)), 0, obj, 0, i);
	//   64  114:aload_0         
	//   65  115:iconst_0        
	//   66  116:aload_2         
	//   67  117:iconst_0        
	//   68  118:iload_1         
	//   69  119:invokestatic    #553 <Method void System.arraycopy(Object, int, Object, int, int)>
					i--;
	//   70  122:iload_1         
	//   71  123:iconst_1        
	//   72  124:isub            
	//   73  125:istore_1        
					s = ((String) (obj));
	//   74  126:aload_2         
	//   75  127:astore_0        
				}
				i++;
	//   76  128:iload_1         
	//   77  129:iconst_1        
	//   78  130:iadd            
	//   79  131:istore_1        
			} while(true);
	//   80  132:goto            21
			s = ((String) (new StringBuilder()));
	//   81  135:new             #555 <Class StringBuilder>
	//   82  138:dup             
	//   83  139:invokespecial   #556 <Method void StringBuilder()>
	//   84  142:astore_0        
			((StringBuilder) (s)).append("Unknown match type in matchOrder: '");
	//   85  143:aload_0         
	//   86  144:ldc2            #558 <String "Unknown match type in matchOrder: '">
	//   87  147:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   88  150:pop             
			((StringBuilder) (s)).append(((String) (obj)));
	//   89  151:aload_0         
	//   90  152:aload_2         
	//   91  153:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   92  156:pop             
			((StringBuilder) (s)).append("'");
	//   93  157:aload_0         
	//   94  158:ldc2            #564 <String "'">
	//   95  161:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   96  164:pop             
			throw new InflateException(((StringBuilder) (s)).toString());
	//   97  165:new             #566 <Class InflateException>
	//   98  168:dup             
	//   99  169:aload_0         
	//  100  170:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  101  173:invokespecial   #572 <Method void InflateException(String)>
	//  102  176:athrow          
		}
		return ((int []) (s));
	//  103  177:aload_0         
	//  104  178:areturn         
	}

	private void runAnimator(Animator animator, final ArrayMap runningAnimators)
	{
		if(animator != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
		{
			animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator1)
				{
					runningAnimators.remove(((Object) (animator1)));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field ArrayMap val$runningAnimators>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #31  <Method Object ArrayMap.remove(Object)>
				//    4    8:pop             
					mCurrentAnimators.remove(((Object) (animator1)));
				//    5    9:aload_0         
				//    6   10:getfield        #17  <Field Transition this$0>
				//    7   13:invokestatic    #35  <Method ArrayList Transition.access$000(Transition)>
				//    8   16:aload_1         
				//    9   17:invokevirtual   #40  <Method boolean ArrayList.remove(Object)>
				//   10   20:pop             
				//   11   21:return          
				}

				public void onAnimationStart(Animator animator1)
				{
					mCurrentAnimators.add(((Object) (animator1)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Transition this$0>
				//    2    4:invokestatic    #35  <Method ArrayList Transition.access$000(Transition)>
				//    3    7:aload_1         
				//    4    8:invokevirtual   #44  <Method boolean ArrayList.add(Object)>
				//    5   11:pop             
				//    6   12:return          
				}

				final Transition this$0;
				final ArrayMap val$runningAnimators;

			
			{
				this$0 = Transition.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Transition this$0>
				runningAnimators = arraymap;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field ArrayMap val$runningAnimators>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
			}
)));
	//    2    4:aload_1         
	//    3    5:new             #10  <Class Transition$2>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #577 <Method void Transition$2(Transition, ArrayMap)>
	//    8   14:invokevirtual   #583 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			animate(animator);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #587 <Method void animate(Animator)>
		}
	//   12   22:return          
	}

	public Transition addListener(TransitionListener transitionlistener)
	{
		if(mListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field ArrayList mListeners>
	//*   2    4:ifnonnull       18
			mListeners = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #152 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #153 <Method void ArrayList()>
	//    7   15:putfield        #200 <Field ArrayList mListeners>
		mListeners.add(((Object) (transitionlistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #200 <Field ArrayList mListeners>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public Transition addTarget(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			mTargetIds.add(((Object) (Integer.valueOf(i))));
	//    2    4:aload_0         
	//    3    5:getfield        #155 <Field ArrayList mTargetIds>
	//    4    8:iload_1         
	//    5    9:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//    6   12:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//    7   15:pop             
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public Transition addTarget(View view)
	{
		mTargets.add(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field ArrayList mTargets>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Transition addTarget(Class class1)
	{
		if(mTargetTypes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field ArrayList mTargetTypes>
	//*   2    4:ifnonnull       18
			mTargetTypes = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #152 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #153 <Method void ArrayList()>
	//    7   15:putfield        #161 <Field ArrayList mTargetTypes>
		mTargetTypes.add(((Object) (class1)));
	//    8   18:aload_0         
	//    9   19:getfield        #161 <Field ArrayList mTargetTypes>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	public Transition addTarget(String s)
	{
		if(mTargetNames == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field ArrayList mTargetNames>
	//*   2    4:ifnonnull       18
			mTargetNames = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #152 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #153 <Method void ArrayList()>
	//    7   15:putfield        #159 <Field ArrayList mTargetNames>
		mTargetNames.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #159 <Field ArrayList mTargetNames>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   12   26:pop             
		return this;
	//   13   27:aload_0         
	//   14   28:areturn         
	}

	protected void animate(Animator animator)
	{
		if(animator == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			end();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #605 <Method void end()>
			return;
	//    4    8:return          
		}
		if(getDuration() >= 0L)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #609 <Method long getDuration()>
	//*   7   13:lconst_0        
	//*   8   14:lcmp            
	//*   9   15:iflt            27
			animator.setDuration(getDuration());
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #609 <Method long getDuration()>
	//   13   23:invokevirtual   #612 <Method Animator Animator.setDuration(long)>
	//   14   26:pop             
		if(getStartDelay() >= 0L)
	//*  15   27:aload_0         
	//*  16   28:invokevirtual   #615 <Method long getStartDelay()>
	//*  17   31:lconst_0        
	//*  18   32:lcmp            
	//*  19   33:iflt            44
			animator.setStartDelay(getStartDelay());
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #615 <Method long getStartDelay()>
	//   23   41:invokevirtual   #618 <Method void Animator.setStartDelay(long)>
		if(getInterpolator() != null)
	//*  24   44:aload_0         
	//*  25   45:invokevirtual   #622 <Method TimeInterpolator getInterpolator()>
	//*  26   48:ifnull          59
			animator.setInterpolator(getInterpolator());
	//   27   51:aload_1         
	//   28   52:aload_0         
	//   29   53:invokevirtual   #622 <Method TimeInterpolator getInterpolator()>
	//   30   56:invokevirtual   #625 <Method void Animator.setInterpolator(TimeInterpolator)>
		animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator1)
			{
				end();
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field Transition this$0>
			//    2    4:invokevirtual   #23  <Method void Transition.end()>
				animator1.removeListener(((android.animation.Animator.AnimatorListener) (this)));
			//    3    7:aload_1         
			//    4    8:aload_0         
			//    5    9:invokevirtual   #29  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
			//    6   12:return          
			}

			final Transition this$0;

			
			{
				this$0 = Transition.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Transition this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
)));
	//   31   59:aload_1         
	//   32   60:new             #12  <Class Transition$3>
	//   33   63:dup             
	//   34   64:aload_0         
	//   35   65:invokespecial   #628 <Method void Transition$3(Transition)>
	//   36   68:invokevirtual   #583 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
		animator.start();
	//   37   71:aload_1         
	//   38   72:invokevirtual   #631 <Method void Animator.start()>
	//   39   75:return          
	}

	protected void cancel()
	{
		for(int i = mCurrentAnimators.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #192 <Field ArrayList mCurrentAnimators>
	//*   2    4:invokevirtual   #399 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            35
			((Animator)mCurrentAnimators.get(i)).cancel();
	//    8   14:aload_0         
	//    9   15:getfield        #192 <Field ArrayList mCurrentAnimators>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #579 <Class Animator>
	//   13   25:invokevirtual   #634 <Method void Animator.cancel()>

	//   14   28:iload_1         
	//   15   29:iconst_1        
	//   16   30:isub            
	//   17   31:istore_1        
	//*  18   32:goto            10
		if(mListeners != null && mListeners.size() > 0)
	//*  19   35:aload_0         
	//*  20   36:getfield        #200 <Field ArrayList mListeners>
	//*  21   39:ifnull          96
	//*  22   42:aload_0         
	//*  23   43:getfield        #200 <Field ArrayList mListeners>
	//*  24   46:invokevirtual   #399 <Method int ArrayList.size()>
	//*  25   49:ifle            96
		{
			ArrayList arraylist = (ArrayList)mListeners.clone();
	//   26   52:aload_0         
	//   27   53:getfield        #200 <Field ArrayList mListeners>
	//   28   56:invokevirtual   #637 <Method Object ArrayList.clone()>
	//   29   59:checkcast       #152 <Class ArrayList>
	//   30   62:astore_3        
			int k = arraylist.size();
	//   31   63:aload_3         
	//   32   64:invokevirtual   #399 <Method int ArrayList.size()>
	//   33   67:istore_2        
			for(int j = 0; j < k; j++)
	//*  34   68:iconst_0        
	//*  35   69:istore_1        
	//*  36   70:iload_1         
	//*  37   71:iload_2         
	//*  38   72:icmpge          96
				((TransitionListener)arraylist.get(j)).onTransitionCancel(this);
	//   39   75:aload_3         
	//   40   76:iload_1         
	//   41   77:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   42   80:checkcast       #26  <Class Transition$TransitionListener>
	//   43   83:aload_0         
	//   44   84:invokeinterface #640 <Method void Transition$TransitionListener.onTransitionCancel(Transition)>

	//   45   89:iload_1         
	//   46   90:iconst_1        
	//   47   91:iadd            
	//   48   92:istore_1        
		}
	//*  49   93:goto            70
	//   50   96:return          
	}

	public abstract void captureEndValues(TransitionValues transitionvalues);

	void capturePropagationValues(TransitionValues transitionvalues)
	{
label0:
		{
			int i;
label1:
			{
				if(mPropagation == null || transitionvalues.values.isEmpty())
					break label0;
	//    0    0:aload_0         
	//    1    1:getfield        #642 <Field TransitionPropagation mPropagation>
	//    2    4:ifnull          87
	//    3    7:aload_1         
	//    4    8:getfield        #468 <Field Map TransitionValues.values>
	//    5   11:invokeinterface #643 <Method boolean Map.isEmpty()>
	//    6   16:ifne            87
				String as[] = mPropagation.getPropagationProperties();
	//    7   19:aload_0         
	//    8   20:getfield        #642 <Field TransitionPropagation mPropagation>
	//    9   23:invokevirtual   #649 <Method String[] TransitionPropagation.getPropagationProperties()>
	//   10   26:astore          4
				if(as == null)
	//*  11   28:aload           4
	//*  12   30:ifnonnull       34
					return;
	//   13   33:return          
				boolean flag = false;
	//   14   34:iconst_0        
	//   15   35:istore_3        
				i = 0;
	//   16   36:iconst_0        
	//   17   37:istore_2        
				do
				{
					if(i >= as.length)
						break;
	//   18   38:iload_2         
	//   19   39:aload           4
	//   20   41:arraylength     
	//   21   42:icmpge          73
					if(!transitionvalues.values.containsKey(((Object) (as[i]))))
	//*  22   45:aload_1         
	//*  23   46:getfield        #468 <Field Map TransitionValues.values>
	//*  24   49:aload           4
	//*  25   51:iload_2         
	//*  26   52:aaload          
	//*  27   53:invokeinterface #650 <Method boolean Map.containsKey(Object)>
	//*  28   58:ifne            66
					{
						i = ((int) (flag));
	//   29   61:iload_3         
	//   30   62:istore_2        
						break label1;
	//   31   63:goto            75
					}
					i++;
	//   32   66:iload_2         
	//   33   67:iconst_1        
	//   34   68:iadd            
	//   35   69:istore_2        
				} while(true);
	//   36   70:goto            38
				i = 1;
	//   37   73:iconst_1        
	//   38   74:istore_2        
			}
			if(i == 0)
	//*  39   75:iload_2         
	//*  40   76:ifne            87
				mPropagation.captureValues(transitionvalues);
	//   41   79:aload_0         
	//   42   80:getfield        #642 <Field TransitionPropagation mPropagation>
	//   43   83:aload_1         
	//   44   84:invokevirtual   #653 <Method void TransitionPropagation.captureValues(TransitionValues)>
		}
	//   45   87:return          
	}

	public abstract void captureStartValues(TransitionValues transitionvalues);

	void captureValues(ViewGroup viewgroup, boolean flag)
	{
		clearValues(flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #658 <Method void clearValues(boolean)>
		int i = mTargetIds.size();
	//    3    5:aload_0         
	//    4    6:getfield        #155 <Field ArrayList mTargetIds>
	//    5    9:invokevirtual   #399 <Method int ArrayList.size()>
	//    6   12:istore_3        
		boolean flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore          5
		if(i <= 0 && mTargets.size() <= 0 || mTargetNames != null && !mTargetNames.isEmpty() || mTargetTypes != null && !mTargetTypes.isEmpty())
	//*   9   16:iload_3         
	//*  10   17:ifgt            30
	//*  11   20:aload_0         
	//*  12   21:getfield        #157 <Field ArrayList mTargets>
	//*  13   24:invokevirtual   #399 <Method int ArrayList.size()>
	//*  14   27:ifle            67
	//*  15   30:aload_0         
	//*  16   31:getfield        #159 <Field ArrayList mTargetNames>
	//*  17   34:ifnull          47
	//*  18   37:aload_0         
	//*  19   38:getfield        #159 <Field ArrayList mTargetNames>
	//*  20   41:invokevirtual   #659 <Method boolean ArrayList.isEmpty()>
	//*  21   44:ifeq            67
	//*  22   47:aload_0         
	//*  23   48:getfield        #161 <Field ArrayList mTargetTypes>
	//*  24   51:ifnull          76
	//*  25   54:aload_0         
	//*  26   55:getfield        #161 <Field ArrayList mTargetTypes>
	//*  27   58:invokevirtual   #659 <Method boolean ArrayList.isEmpty()>
	//*  28   61:ifeq            67
	//*  29   64:goto            76
		{
			captureHierarchy(((View) (viewgroup)), flag);
	//   30   67:aload_0         
	//   31   68:aload_1         
	//   32   69:iload_2         
	//   33   70:invokespecial   #431 <Method void captureHierarchy(View, boolean)>
		} else
	//*  34   73:goto            310
		{
			for(int j = 0; j < mTargetIds.size(); j++)
	//*  35   76:iconst_0        
	//*  36   77:istore_3        
	//*  37   78:iload_3         
	//*  38   79:aload_0         
	//*  39   80:getfield        #155 <Field ArrayList mTargetIds>
	//*  40   83:invokevirtual   #399 <Method int ArrayList.size()>
	//*  41   86:icmpge          201
			{
				View view = viewgroup.findViewById(((Integer)mTargetIds.get(j)).intValue());
	//   42   89:aload_1         
	//   43   90:aload_0         
	//   44   91:getfield        #155 <Field ArrayList mTargetIds>
	//   45   94:iload_3         
	//   46   95:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   47   98:checkcast       #391 <Class Integer>
	//   48  101:invokevirtual   #662 <Method int Integer.intValue()>
	//   49  104:invokevirtual   #665 <Method View ViewGroup.findViewById(int)>
	//   50  107:astore          7
				if(view == null)
					continue;
	//   51  109:aload           7
	//   52  111:ifnull          194
				TransitionValues transitionvalues1 = new TransitionValues();
	//   53  114:new             #285 <Class TransitionValues>
	//   54  117:dup             
	//   55  118:invokespecial   #407 <Method void TransitionValues()>
	//   56  121:astore          8
				transitionvalues1.view = view;
	//   57  123:aload           8
	//   58  125:aload           7
	//   59  127:putfield        #289 <Field View TransitionValues.view>
				if(flag)
	//*  60  130:iload_2         
	//*  61  131:ifeq            143
					captureStartValues(transitionvalues1);
	//   62  134:aload_0         
	//   63  135:aload           8
	//   64  137:invokevirtual   #411 <Method void captureStartValues(TransitionValues)>
				else
	//*  65  140:goto            149
					captureEndValues(transitionvalues1);
	//   66  143:aload_0         
	//   67  144:aload           8
	//   68  146:invokevirtual   #414 <Method void captureEndValues(TransitionValues)>
				transitionvalues1.mTargetedTransitions.add(((Object) (this)));
	//   69  149:aload           8
	//   70  151:getfield        #417 <Field ArrayList TransitionValues.mTargetedTransitions>
	//   71  154:aload_0         
	//   72  155:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   73  158:pop             
				capturePropagationValues(transitionvalues1);
	//   74  159:aload_0         
	//   75  160:aload           8
	//   76  162:invokevirtual   #420 <Method void capturePropagationValues(TransitionValues)>
				if(flag)
	//*  77  165:iload_2         
	//*  78  166:ifeq            183
					addViewValues(mStartValues, view, transitionvalues1);
	//   79  169:aload_0         
	//   80  170:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//   81  173:aload           7
	//   82  175:aload           8
	//   83  177:invokestatic    #422 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
				else
	//*  84  180:goto            194
					addViewValues(mEndValues, view, transitionvalues1);
	//   85  183:aload_0         
	//   86  184:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//   87  187:aload           7
	//   88  189:aload           8
	//   89  191:invokestatic    #422 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
			}

	//   90  194:iload_3         
	//   91  195:iconst_1        
	//   92  196:iadd            
	//   93  197:istore_3        
	//*  94  198:goto            78
			for(int k = 0; k < mTargets.size(); k++)
	//*  95  201:iconst_0        
	//*  96  202:istore_3        
	//*  97  203:iload_3         
	//*  98  204:aload_0         
	//*  99  205:getfield        #157 <Field ArrayList mTargets>
	//* 100  208:invokevirtual   #399 <Method int ArrayList.size()>
	//* 101  211:icmpge          310
			{
				viewgroup = ((ViewGroup) ((View)mTargets.get(k)));
	//  102  214:aload_0         
	//  103  215:getfield        #157 <Field ArrayList mTargets>
	//  104  218:iload_3         
	//  105  219:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//  106  222:checkcast       #314 <Class View>
	//  107  225:astore_1        
				TransitionValues transitionvalues = new TransitionValues();
	//  108  226:new             #285 <Class TransitionValues>
	//  109  229:dup             
	//  110  230:invokespecial   #407 <Method void TransitionValues()>
	//  111  233:astore          7
				transitionvalues.view = ((View) (viewgroup));
	//  112  235:aload           7
	//  113  237:aload_1         
	//  114  238:putfield        #289 <Field View TransitionValues.view>
				if(flag)
	//* 115  241:iload_2         
	//* 116  242:ifeq            254
					captureStartValues(transitionvalues);
	//  117  245:aload_0         
	//  118  246:aload           7
	//  119  248:invokevirtual   #411 <Method void captureStartValues(TransitionValues)>
				else
	//* 120  251:goto            260
					captureEndValues(transitionvalues);
	//  121  254:aload_0         
	//  122  255:aload           7
	//  123  257:invokevirtual   #414 <Method void captureEndValues(TransitionValues)>
				transitionvalues.mTargetedTransitions.add(((Object) (this)));
	//  124  260:aload           7
	//  125  262:getfield        #417 <Field ArrayList TransitionValues.mTargetedTransitions>
	//  126  265:aload_0         
	//  127  266:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//  128  269:pop             
				capturePropagationValues(transitionvalues);
	//  129  270:aload_0         
	//  130  271:aload           7
	//  131  273:invokevirtual   #420 <Method void capturePropagationValues(TransitionValues)>
				if(flag)
	//* 132  276:iload_2         
	//* 133  277:ifeq            293
					addViewValues(mStartValues, ((View) (viewgroup)), transitionvalues);
	//  134  280:aload_0         
	//  135  281:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//  136  284:aload_1         
	//  137  285:aload           7
	//  138  287:invokestatic    #422 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
				else
	//* 139  290:goto            303
					addViewValues(mEndValues, ((View) (viewgroup)), transitionvalues);
	//  140  293:aload_0         
	//  141  294:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//  142  297:aload_1         
	//  143  298:aload           7
	//  144  300:invokestatic    #422 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
			}

	//  145  303:iload_3         
	//  146  304:iconst_1        
	//  147  305:iadd            
	//  148  306:istore_3        
		}
	//* 149  307:goto            203
		if(!flag && mNameOverrides != null)
	//* 150  310:iload_2         
	//* 151  311:ifne            450
	//* 152  314:aload_0         
	//* 153  315:getfield        #667 <Field ArrayMap mNameOverrides>
	//* 154  318:ifnull          450
		{
			int j1 = mNameOverrides.size();
	//  155  321:aload_0         
	//  156  322:getfield        #667 <Field ArrayMap mNameOverrides>
	//  157  325:invokevirtual   #279 <Method int ArrayMap.size()>
	//  158  328:istore          6
			viewgroup = ((ViewGroup) (new ArrayList(j1)));
	//  159  330:new             #152 <Class ArrayList>
	//  160  333:dup             
	//  161  334:iload           6
	//  162  336:invokespecial   #670 <Method void ArrayList(int)>
	//  163  339:astore_1        
			int l = 0;
	//  164  340:iconst_0        
	//  165  341:istore_3        
			int i1;
			do
			{
				i1 = ((int) (flag1));
	//  166  342:iload           5
	//  167  344:istore          4
				if(l >= j1)
					break;
	//  168  346:iload_3         
	//  169  347:iload           6
	//  170  349:icmpge          389
				String s = (String)mNameOverrides.keyAt(l);
	//  171  352:aload_0         
	//  172  353:getfield        #667 <Field ArrayMap mNameOverrides>
	//  173  356:iload_3         
	//  174  357:invokevirtual   #491 <Method Object ArrayMap.keyAt(int)>
	//  175  360:checkcast       #537 <Class String>
	//  176  363:astore          7
				((ArrayList) (viewgroup)).add(mStartValues.mNameValues.remove(((Object) (s))));
	//  177  365:aload_1         
	//  178  366:aload_0         
	//  179  367:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//  180  370:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//  181  373:aload           7
	//  182  375:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//  183  378:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//  184  381:pop             
				l++;
	//  185  382:iload_3         
	//  186  383:iconst_1        
	//  187  384:iadd            
	//  188  385:istore_3        
			} while(true);
	//  189  386:goto            342
			for(; i1 < j1; i1++)
	//* 190  389:iload           4
	//* 191  391:iload           6
	//* 192  393:icmpge          450
			{
				View view1 = (View)((ArrayList) (viewgroup)).get(i1);
	//  193  396:aload_1         
	//  194  397:iload           4
	//  195  399:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//  196  402:checkcast       #314 <Class View>
	//  197  405:astore          7
				if(view1 != null)
	//* 198  407:aload           7
	//* 199  409:ifnull          441
				{
					String s1 = (String)mNameOverrides.valueAt(i1);
	//  200  412:aload_0         
	//  201  413:getfield        #667 <Field ArrayMap mNameOverrides>
	//  202  416:iload           4
	//  203  418:invokevirtual   #283 <Method Object ArrayMap.valueAt(int)>
	//  204  421:checkcast       #537 <Class String>
	//  205  424:astore          8
					mStartValues.mNameValues.put(((Object) (s1)), ((Object) (view1)));
	//  206  426:aload_0         
	//  207  427:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//  208  430:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//  209  433:aload           8
	//  210  435:aload           7
	//  211  437:invokevirtual   #312 <Method Object ArrayMap.put(Object, Object)>
	//  212  440:pop             
				}
			}

	//  213  441:iload           4
	//  214  443:iconst_1        
	//  215  444:iadd            
	//  216  445:istore          4
		}
	//* 217  447:goto            389
	//  218  450:return          
	}

	void clearValues(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            35
		{
			mStartValues.mViewValues.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//    4    8:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//    5   11:invokevirtual   #673 <Method void ArrayMap.clear()>
			mStartValues.mIdValues.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//    8   18:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//    9   21:invokevirtual   #674 <Method void SparseArray.clear()>
			mStartValues.mItemIdValues.clear();
	//   10   24:aload_0         
	//   11   25:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//   12   28:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   13   31:invokevirtual   #675 <Method void LongSparseArray.clear()>
			return;
	//   14   34:return          
		} else
		{
			mEndValues.mViewValues.clear();
	//   15   35:aload_0         
	//   16   36:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//   17   39:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//   18   42:invokevirtual   #673 <Method void ArrayMap.clear()>
			mEndValues.mIdValues.clear();
	//   19   45:aload_0         
	//   20   46:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//   21   49:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//   22   52:invokevirtual   #674 <Method void SparseArray.clear()>
			mEndValues.mItemIdValues.clear();
	//   23   55:aload_0         
	//   24   56:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//   25   59:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   26   62:invokevirtual   #675 <Method void LongSparseArray.clear()>
			return;
	//   27   65:return          
		}
	}

	public Transition clone()
	{
		Transition transition;
		try
		{
			transition = (Transition)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #679 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class Transition>
	//    3    7:astore_1        
			transition.mAnimators = new ArrayList();
	//    4    8:aload_1         
	//    5    9:new             #152 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #153 <Method void ArrayList()>
	//    8   16:putfield        #202 <Field ArrayList mAnimators>
			transition.mStartValues = new TransitionValuesMaps();
	//    9   19:aload_1         
	//   10   20:new             #177 <Class TransitionValuesMaps>
	//   11   23:dup             
	//   12   24:invokespecial   #178 <Method void TransitionValuesMaps()>
	//   13   27:putfield        #180 <Field TransitionValuesMaps mStartValues>
			transition.mEndValues = new TransitionValuesMaps();
	//   14   30:aload_1         
	//   15   31:new             #177 <Class TransitionValuesMaps>
	//   16   34:dup             
	//   17   35:invokespecial   #178 <Method void TransitionValuesMaps()>
	//   18   38:putfield        #182 <Field TransitionValuesMaps mEndValues>
			transition.mStartValuesList = null;
	//   19   41:aload_1         
	//   20   42:aconst_null     
	//   21   43:putfield        #295 <Field ArrayList mStartValuesList>
			transition.mEndValuesList = null;
	//   22   46:aload_1         
	//   23   47:aconst_null     
	//   24   48:putfield        #301 <Field ArrayList mEndValuesList>
		}
	//*  25   51:aload_1         
	//*  26   52:areturn         
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  27   53:astore_1        
		{
			return null;
	//   28   54:aconst_null     
	//   29   55:areturn         
		}
		return transition;
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #681 <Method Transition clone()>
	//    2    4:areturn         
	}

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected void createAnimators(ViewGroup viewgroup, TransitionValuesMaps transitionvaluesmaps, TransitionValuesMaps transitionvaluesmaps1, ArrayList arraylist, ArrayList arraylist1)
	{
		int i;
		int i1;
		long l1;
		SparseIntArray sparseintarray;
		ArrayMap arraymap;
		arraymap = getRunningAnimators();
	//    0    0:invokestatic    #689 <Method ArrayMap getRunningAnimators()>
	//    1    3:astore          20
		sparseintarray = new SparseIntArray();
	//    2    5:new             #691 <Class SparseIntArray>
	//    3    8:dup             
	//    4    9:invokespecial   #692 <Method void SparseIntArray()>
	//    5   12:astore          19
		i1 = arraylist.size();
	//    6   14:aload           4
	//    7   16:invokevirtual   #399 <Method int ArrayList.size()>
	//    8   19:istore          8
		l1 = 0xffffffffL;
	//    9   21:ldc2w           #693 <Long 0xffffffffL>
	//   10   24:lstore          10
		i = 0;
	//   11   26:iconst_0        
	//   12   27:istore          6
_L7:
		if(i >= i1) goto _L2; else goto _L1
	//   13   29:iload           6
	//   14   31:iload           8
	//   15   33:icmpge          555
_L1:
		TransitionValues transitionvalues1;
		TransitionValuesMaps transitionvaluesmaps2;
		TransitionValues transitionvalues = (TransitionValues)arraylist.get(i);
	//   16   36:aload           4
	//   17   38:iload           6
	//   18   40:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   19   43:checkcast       #285 <Class TransitionValues>
	//   20   46:astore          14
		transitionvaluesmaps = ((TransitionValuesMaps) ((TransitionValues)arraylist1.get(i)));
	//   21   48:aload           5
	//   22   50:iload           6
	//   23   52:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   24   55:checkcast       #285 <Class TransitionValues>
	//   25   58:astore_2        
		transitionvalues1 = transitionvalues;
	//   26   59:aload           14
	//   27   61:astore          15
		if(transitionvalues != null)
	//*  28   63:aload           14
	//*  29   65:ifnull          87
		{
			transitionvalues1 = transitionvalues;
	//   30   68:aload           14
	//   31   70:astore          15
			if(!transitionvalues.mTargetedTransitions.contains(((Object) (this))))
	//*  32   72:aload           14
	//*  33   74:getfield        #417 <Field ArrayList TransitionValues.mTargetedTransitions>
	//*  34   77:aload_0         
	//*  35   78:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  36   81:ifne            87
				transitionvalues1 = null;
	//   37   84:aconst_null     
	//   38   85:astore          15
		}
		transitionvaluesmaps2 = transitionvaluesmaps;
	//   39   87:aload_2         
	//   40   88:astore          16
		if(transitionvaluesmaps != null)
	//*  41   90:aload_2         
	//*  42   91:ifnull          111
		{
			transitionvaluesmaps2 = transitionvaluesmaps;
	//   43   94:aload_2         
	//   44   95:astore          16
			if(!((TransitionValues) (transitionvaluesmaps)).mTargetedTransitions.contains(((Object) (this))))
	//*  45   97:aload_2         
	//*  46   98:getfield        #417 <Field ArrayList TransitionValues.mTargetedTransitions>
	//*  47  101:aload_0         
	//*  48  102:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  49  105:ifne            111
				transitionvaluesmaps2 = null;
	//   50  108:aconst_null     
	//   51  109:astore          16
		}
		if(transitionvalues1 != null || transitionvaluesmaps2 != null) goto _L4; else goto _L3
	//   52  111:aload           15
	//   53  113:ifnonnull       132
	//   54  116:aload           16
	//   55  118:ifnonnull       132
_L3:
		int k;
		long l2;
		l2 = l1;
	//   56  121:lload           10
	//   57  123:lstore          12
		k = i;
	//   58  125:iload           6
	//   59  127:istore          7
		break MISSING_BLOCK_LABEL_542;
	//   60  129:goto            542
_L4:
		if(transitionvalues1 != null && transitionvaluesmaps2 != null && !isTransitionRequired(transitionvalues1, ((TransitionValues) (transitionvaluesmaps2))))
	//*  61  132:aload           15
	//*  62  134:ifnull          162
	//*  63  137:aload           16
	//*  64  139:ifnull          162
	//*  65  142:aload_0         
	//*  66  143:aload           15
	//*  67  145:aload           16
	//*  68  147:invokevirtual   #698 <Method boolean isTransitionRequired(TransitionValues, TransitionValues)>
	//*  69  150:ifeq            156
	//*  70  153:goto            162
			k = 0;
	//   71  156:iconst_0        
	//   72  157:istore          7
		else
	//*  73  159:goto            165
			k = 1;
	//   74  162:iconst_1        
	//   75  163:istore          7
		if(k == 0) goto _L3; else goto _L5
	//   76  165:iload           7
	//   77  167:ifeq            121
_L5:
		transitionvaluesmaps = ((TransitionValuesMaps) (createAnimator(viewgroup, transitionvalues1, ((TransitionValues) (transitionvaluesmaps2)))));
	//   78  170:aload_0         
	//   79  171:aload_1         
	//   80  172:aload           15
	//   81  174:aload           16
	//   82  176:invokevirtual   #700 <Method Animator createAnimator(ViewGroup, TransitionValues, TransitionValues)>
	//   83  179:astore_2        
		if(transitionvaluesmaps == null) goto _L3; else goto _L6
	//   84  180:aload_2         
	//   85  181:ifnull          121
_L6:
		Object obj;
		View view;
		if(transitionvaluesmaps2 != null)
	//*  86  184:aload           16
	//*  87  186:ifnull          430
		{
			view = ((TransitionValues) (transitionvaluesmaps2)).view;
	//   88  189:aload           16
	//   89  191:getfield        #289 <Field View TransitionValues.view>
	//   90  194:astore          17
			String as[] = getTransitionProperties();
	//   91  196:aload_0         
	//   92  197:invokevirtual   #703 <Method String[] getTransitionProperties()>
	//   93  200:astore          21
			if(view != null && as != null && as.length > 0)
	//*  94  202:aload           17
	//*  95  204:ifnull          424
	//*  96  207:aload           21
	//*  97  209:ifnull          424
	//*  98  212:aload           21
	//*  99  214:arraylength     
	//* 100  215:ifle            424
			{
				TransitionValues transitionvalues2 = new TransitionValues();
	//  101  218:new             #285 <Class TransitionValues>
	//  102  221:dup             
	//  103  222:invokespecial   #407 <Method void TransitionValues()>
	//  104  225:astore          18
				transitionvalues2.view = view;
	//  105  227:aload           18
	//  106  229:aload           17
	//  107  231:putfield        #289 <Field View TransitionValues.view>
				obj = ((Object) ((TransitionValues)transitionvaluesmaps1.mViewValues.get(((Object) (view)))));
	//  108  234:aload_3         
	//  109  235:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//  110  238:aload           17
	//  111  240:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//  112  243:checkcast       #285 <Class TransitionValues>
	//  113  246:astore          14
				k = i;
	//  114  248:iload           6
	//  115  250:istore          7
				if(obj != null)
	//* 116  252:aload           14
	//* 117  254:ifnull          312
				{
					int j1 = 0;
	//  118  257:iconst_0        
	//  119  258:istore          9
					do
					{
						k = i;
	//  120  260:iload           6
	//  121  262:istore          7
						if(j1 >= as.length)
							break;
	//  122  264:iload           9
	//  123  266:aload           21
	//  124  268:arraylength     
	//  125  269:icmpge          312
						transitionvalues2.values.put(((Object) (as[j1])), ((TransitionValues) (obj)).values.get(((Object) (as[j1]))));
	//  126  272:aload           18
	//  127  274:getfield        #468 <Field Map TransitionValues.values>
	//  128  277:aload           21
	//  129  279:iload           9
	//  130  281:aaload          
	//  131  282:aload           14
	//  132  284:getfield        #468 <Field Map TransitionValues.values>
	//  133  287:aload           21
	//  134  289:iload           9
	//  135  291:aaload          
	//  136  292:invokeinterface #473 <Method Object Map.get(Object)>
	//  137  297:invokeinterface #704 <Method Object Map.put(Object, Object)>
	//  138  302:pop             
						j1++;
	//  139  303:iload           9
	//  140  305:iconst_1        
	//  141  306:iadd            
	//  142  307:istore          9
					} while(true);
	//  143  309:goto            260
				}
				i = k;
	//  144  312:iload           7
	//  145  314:istore          6
				int k1 = arraymap.size();
	//  146  316:aload           20
	//  147  318:invokevirtual   #279 <Method int ArrayMap.size()>
	//  148  321:istore          9
				k = 0;
	//  149  323:iconst_0        
	//  150  324:istore          7
				do
				{
					if(k >= k1)
						break;
	//  151  326:iload           7
	//  152  328:iload           9
	//  153  330:icmpge          417
					obj = ((Object) ((AnimationInfo)arraymap.get(((Object) ((Animator)arraymap.keyAt(k))))));
	//  154  333:aload           20
	//  155  335:aload           20
	//  156  337:iload           7
	//  157  339:invokevirtual   #491 <Method Object ArrayMap.keyAt(int)>
	//  158  342:checkcast       #579 <Class Animator>
	//  159  345:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//  160  348:checkcast       #14  <Class Transition$AnimationInfo>
	//  161  351:astore          14
					if(((AnimationInfo) (obj)).mValues != null && ((AnimationInfo) (obj)).mView == view && ((AnimationInfo) (obj)).mName.equals(((Object) (getName()))) && ((AnimationInfo) (obj)).mValues.equals(((Object) (transitionvalues2))))
	//* 162  353:aload           14
	//* 163  355:getfield        #708 <Field TransitionValues Transition$AnimationInfo.mValues>
	//* 164  358:ifnull          408
	//* 165  361:aload           14
	//* 166  363:getfield        #711 <Field View Transition$AnimationInfo.mView>
	//* 167  366:aload           17
	//* 168  368:if_acmpne       408
	//* 169  371:aload           14
	//* 170  373:getfield        #712 <Field String Transition$AnimationInfo.mName>
	//* 171  376:aload_0         
	//* 172  377:invokevirtual   #713 <Method String getName()>
	//* 173  380:invokevirtual   #714 <Method boolean String.equals(Object)>
	//* 174  383:ifeq            408
	//* 175  386:aload           14
	//* 176  388:getfield        #708 <Field TransitionValues Transition$AnimationInfo.mValues>
	//* 177  391:aload           18
	//* 178  393:invokevirtual   #715 <Method boolean TransitionValues.equals(Object)>
	//* 179  396:ifeq            408
					{
						transitionvaluesmaps = null;
	//  180  399:aconst_null     
	//  181  400:astore_2        
						obj = ((Object) (transitionvalues2));
	//  182  401:aload           18
	//  183  403:astore          14
						break MISSING_BLOCK_LABEL_440;
	//  184  405:goto            427
					}
					k++;
	//  185  408:iload           7
	//  186  410:iconst_1        
	//  187  411:iadd            
	//  188  412:istore          7
				} while(true);
	//  189  414:goto            326
				obj = ((Object) (transitionvalues2));
	//  190  417:aload           18
	//  191  419:astore          14
			} else
	//* 192  421:goto            427
			{
				obj = null;
	//  193  424:aconst_null     
	//  194  425:astore          14
			}
		} else
	//* 195  427:goto            440
		{
			view = transitionvalues1.view;
	//  196  430:aload           15
	//  197  432:getfield        #289 <Field View TransitionValues.view>
	//  198  435:astore          17
			obj = null;
	//  199  437:aconst_null     
	//  200  438:astore          14
		}
		l2 = l1;
	//  201  440:lload           10
	//  202  442:lstore          12
		k = i;
	//  203  444:iload           6
	//  204  446:istore          7
		if(transitionvaluesmaps != null)
	//* 205  448:aload_2         
	//* 206  449:ifnull          542
		{
			l2 = l1;
	//  207  452:lload           10
	//  208  454:lstore          12
			if(mPropagation != null)
	//* 209  456:aload_0         
	//* 210  457:getfield        #642 <Field TransitionPropagation mPropagation>
	//* 211  460:ifnull          502
			{
				l2 = mPropagation.getStartDelay(viewgroup, this, transitionvalues1, ((TransitionValues) (transitionvaluesmaps2)));
	//  212  463:aload_0         
	//  213  464:getfield        #642 <Field TransitionPropagation mPropagation>
	//  214  467:aload_1         
	//  215  468:aload_0         
	//  216  469:aload           15
	//  217  471:aload           16
	//  218  473:invokevirtual   #718 <Method long TransitionPropagation.getStartDelay(ViewGroup, Transition, TransitionValues, TransitionValues)>
	//  219  476:lstore          12
				sparseintarray.put(mAnimators.size(), (int)l2);
	//  220  478:aload           19
	//  221  480:aload_0         
	//  222  481:getfield        #202 <Field ArrayList mAnimators>
	//  223  484:invokevirtual   #399 <Method int ArrayList.size()>
	//  224  487:lload           12
	//  225  489:l2i             
	//  226  490:invokevirtual   #721 <Method void SparseIntArray.put(int, int)>
				l2 = Math.min(l2, l1);
	//  227  493:lload           12
	//  228  495:lload           10
	//  229  497:invokestatic    #727 <Method long Math.min(long, long)>
	//  230  500:lstore          12
			}
			arraymap.put(((Object) (transitionvaluesmaps)), ((Object) (new AnimationInfo(view, getName(), this, ViewUtils.getWindowId(((View) (viewgroup))), ((TransitionValues) (obj))))));
	//  231  502:aload           20
	//  232  504:aload_2         
	//  233  505:new             #14  <Class Transition$AnimationInfo>
	//  234  508:dup             
	//  235  509:aload           17
	//  236  511:aload_0         
	//  237  512:invokevirtual   #713 <Method String getName()>
	//  238  515:aload_0         
	//  239  516:aload_1         
	//  240  517:invokestatic    #733 <Method WindowIdImpl ViewUtils.getWindowId(View)>
	//  241  520:aload           14
	//  242  522:invokespecial   #736 <Method void Transition$AnimationInfo(View, String, Transition, WindowIdImpl, TransitionValues)>
	//  243  525:invokevirtual   #312 <Method Object ArrayMap.put(Object, Object)>
	//  244  528:pop             
			mAnimators.add(((Object) (transitionvaluesmaps)));
	//  245  529:aload_0         
	//  246  530:getfield        #202 <Field ArrayList mAnimators>
	//  247  533:aload_2         
	//  248  534:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//  249  537:pop             
			k = i;
	//  250  538:iload           6
	//  251  540:istore          7
		}
		i = k + 1;
	//  252  542:iload           7
	//  253  544:iconst_1        
	//  254  545:iadd            
	//  255  546:istore          6
		l1 = l2;
	//  256  548:lload           12
	//  257  550:lstore          10
		  goto _L7
	//* 258  552:goto            29
_L2:
		if(l1 != 0L)
	//* 259  555:lload           10
	//* 260  557:lconst_0        
	//* 261  558:lcmp            
	//* 262  559:ifeq            626
		{
			for(int j = 0; j < sparseintarray.size(); j++)
	//* 263  562:iconst_0        
	//* 264  563:istore          6
	//* 265  565:iload           6
	//* 266  567:aload           19
	//* 267  569:invokevirtual   #737 <Method int SparseIntArray.size()>
	//* 268  572:icmpge          626
			{
				int l = sparseintarray.keyAt(j);
	//  269  575:aload           19
	//  270  577:iload           6
	//  271  579:invokevirtual   #738 <Method int SparseIntArray.keyAt(int)>
	//  272  582:istore          7
				viewgroup = ((ViewGroup) ((Animator)mAnimators.get(l)));
	//  273  584:aload_0         
	//  274  585:getfield        #202 <Field ArrayList mAnimators>
	//  275  588:iload           7
	//  276  590:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//  277  593:checkcast       #579 <Class Animator>
	//  278  596:astore_1        
				((Animator) (viewgroup)).setStartDelay(((long)sparseintarray.valueAt(j) - l1) + ((Animator) (viewgroup)).getStartDelay());
	//  279  597:aload_1         
	//  280  598:aload           19
	//  281  600:iload           6
	//  282  602:invokevirtual   #740 <Method int SparseIntArray.valueAt(int)>
	//  283  605:i2l             
	//  284  606:lload           10
	//  285  608:lsub            
	//  286  609:aload_1         
	//  287  610:invokevirtual   #741 <Method long Animator.getStartDelay()>
	//  288  613:ladd            
	//  289  614:invokevirtual   #618 <Method void Animator.setStartDelay(long)>
			}

	//  290  617:iload           6
	//  291  619:iconst_1        
	//  292  620:iadd            
	//  293  621:istore          6
		}
	//* 294  623:goto            565
		return;
	//  295  626:return          
	}

	protected void end()
	{
		mNumInstances = mNumInstances - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #194 <Field int mNumInstances>
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:putfield        #194 <Field int mNumInstances>
		if(mNumInstances == 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #194 <Field int mNumInstances>
	//*   8   14:ifne            177
		{
			if(mListeners != null && mListeners.size() > 0)
	//*   9   17:aload_0         
	//*  10   18:getfield        #200 <Field ArrayList mListeners>
	//*  11   21:ifnull          78
	//*  12   24:aload_0         
	//*  13   25:getfield        #200 <Field ArrayList mListeners>
	//*  14   28:invokevirtual   #399 <Method int ArrayList.size()>
	//*  15   31:ifle            78
			{
				ArrayList arraylist = (ArrayList)mListeners.clone();
	//   16   34:aload_0         
	//   17   35:getfield        #200 <Field ArrayList mListeners>
	//   18   38:invokevirtual   #637 <Method Object ArrayList.clone()>
	//   19   41:checkcast       #152 <Class ArrayList>
	//   20   44:astore_3        
				int l = arraylist.size();
	//   21   45:aload_3         
	//   22   46:invokevirtual   #399 <Method int ArrayList.size()>
	//   23   49:istore_2        
				for(int i = 0; i < l; i++)
	//*  24   50:iconst_0        
	//*  25   51:istore_1        
	//*  26   52:iload_1         
	//*  27   53:iload_2         
	//*  28   54:icmpge          78
					((TransitionListener)arraylist.get(i)).onTransitionEnd(this);
	//   29   57:aload_3         
	//   30   58:iload_1         
	//   31   59:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   32   62:checkcast       #26  <Class Transition$TransitionListener>
	//   33   65:aload_0         
	//   34   66:invokeinterface #745 <Method void Transition$TransitionListener.onTransitionEnd(Transition)>

	//   35   71:iload_1         
	//   36   72:iconst_1        
	//   37   73:iadd            
	//   38   74:istore_1        
			}
	//*  39   75:goto            52
			for(int j = 0; j < mStartValues.mItemIdValues.size(); j++)
	//*  40   78:iconst_0        
	//*  41   79:istore_1        
	//*  42   80:iload_1         
	//*  43   81:aload_0         
	//*  44   82:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//*  45   85:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//*  46   88:invokevirtual   #497 <Method int LongSparseArray.size()>
	//*  47   91:icmpge          125
			{
				View view = (View)mStartValues.mItemIdValues.valueAt(j);
	//   48   94:aload_0         
	//   49   95:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//   50   98:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   51  101:iload_1         
	//   52  102:invokevirtual   #498 <Method Object LongSparseArray.valueAt(int)>
	//   53  105:checkcast       #314 <Class View>
	//   54  108:astore_3        
				if(view != null)
	//*  55  109:aload_3         
	//*  56  110:ifnull          118
					ViewCompat.setHasTransientState(view, false);
	//   57  113:aload_3         
	//   58  114:iconst_0        
	//   59  115:invokestatic    #383 <Method void ViewCompat.setHasTransientState(View, boolean)>
			}

	//   60  118:iload_1         
	//   61  119:iconst_1        
	//   62  120:iadd            
	//   63  121:istore_1        
	//*  64  122:goto            80
			for(int k = 0; k < mEndValues.mItemIdValues.size(); k++)
	//*  65  125:iconst_0        
	//*  66  126:istore_1        
	//*  67  127:iload_1         
	//*  68  128:aload_0         
	//*  69  129:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//*  70  132:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//*  71  135:invokevirtual   #497 <Method int LongSparseArray.size()>
	//*  72  138:icmpge          172
			{
				View view1 = (View)mEndValues.mItemIdValues.valueAt(k);
	//   73  141:aload_0         
	//   74  142:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//   75  145:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   76  148:iload_1         
	//   77  149:invokevirtual   #498 <Method Object LongSparseArray.valueAt(int)>
	//   78  152:checkcast       #314 <Class View>
	//   79  155:astore_3        
				if(view1 != null)
	//*  80  156:aload_3         
	//*  81  157:ifnull          165
					ViewCompat.setHasTransientState(view1, false);
	//   82  160:aload_3         
	//   83  161:iconst_0        
	//   84  162:invokestatic    #383 <Method void ViewCompat.setHasTransientState(View, boolean)>
			}

	//   85  165:iload_1         
	//   86  166:iconst_1        
	//   87  167:iadd            
	//   88  168:istore_1        
	//*  89  169:goto            127
			mEnded = true;
	//   90  172:aload_0         
	//   91  173:iconst_1        
	//   92  174:putfield        #198 <Field boolean mEnded>
		}
	//   93  177:return          
	}

	public Transition excludeChildren(int i, boolean flag)
	{
		mTargetIdChildExcludes = excludeId(mTargetIdChildExcludes, i, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #171 <Field ArrayList mTargetIdChildExcludes>
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #749 <Method ArrayList excludeId(ArrayList, int, boolean)>
	//    7   11:putfield        #171 <Field ArrayList mTargetIdChildExcludes>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public Transition excludeChildren(View view, boolean flag)
	{
		mTargetChildExcludes = excludeView(mTargetChildExcludes, view, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #173 <Field ArrayList mTargetChildExcludes>
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #752 <Method ArrayList excludeView(ArrayList, View, boolean)>
	//    7   11:putfield        #173 <Field ArrayList mTargetChildExcludes>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public Transition excludeChildren(Class class1, boolean flag)
	{
		mTargetTypeChildExcludes = excludeType(mTargetTypeChildExcludes, class1, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #175 <Field ArrayList mTargetTypeChildExcludes>
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #755 <Method ArrayList excludeType(ArrayList, Class, boolean)>
	//    7   11:putfield        #175 <Field ArrayList mTargetTypeChildExcludes>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public Transition excludeTarget(int i, boolean flag)
	{
		mTargetIdExcludes = excludeId(mTargetIdExcludes, i, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #163 <Field ArrayList mTargetIdExcludes>
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #749 <Method ArrayList excludeId(ArrayList, int, boolean)>
	//    7   11:putfield        #163 <Field ArrayList mTargetIdExcludes>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public Transition excludeTarget(View view, boolean flag)
	{
		mTargetExcludes = excludeView(mTargetExcludes, view, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #165 <Field ArrayList mTargetExcludes>
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #752 <Method ArrayList excludeView(ArrayList, View, boolean)>
	//    7   11:putfield        #165 <Field ArrayList mTargetExcludes>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public Transition excludeTarget(Class class1, boolean flag)
	{
		mTargetTypeExcludes = excludeType(mTargetTypeExcludes, class1, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #167 <Field ArrayList mTargetTypeExcludes>
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #755 <Method ArrayList excludeType(ArrayList, Class, boolean)>
	//    7   11:putfield        #167 <Field ArrayList mTargetTypeExcludes>
		return this;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public Transition excludeTarget(String s, boolean flag)
	{
		mTargetNameExcludes = excludeObject(mTargetNameExcludes, ((Object) (s)), flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #169 <Field ArrayList mTargetNameExcludes>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #759 <Method ArrayList excludeObject(ArrayList, Object, boolean)>
	//    6   10:putfield        #169 <Field ArrayList mTargetNameExcludes>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	void forceToEnd(ViewGroup viewgroup)
	{
		ArrayMap arraymap = getRunningAnimators();
	//    0    0:invokestatic    #689 <Method ArrayMap getRunningAnimators()>
	//    1    3:astore_3        
		int i = arraymap.size();
	//    2    4:aload_3         
	//    3    5:invokevirtual   #279 <Method int ArrayMap.size()>
	//    4    8:istore_2        
		if(viewgroup != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          78
		{
			viewgroup = ((ViewGroup) (ViewUtils.getWindowId(((View) (viewgroup)))));
	//    7   13:aload_1         
	//    8   14:invokestatic    #733 <Method WindowIdImpl ViewUtils.getWindowId(View)>
	//    9   17:astore_1        
			for(i--; i >= 0; i--)
	//*  10   18:iload_2         
	//*  11   19:iconst_1        
	//*  12   20:isub            
	//*  13   21:istore_2        
	//*  14   22:iload_2         
	//*  15   23:iflt            78
			{
				AnimationInfo animationinfo = (AnimationInfo)arraymap.valueAt(i);
	//   16   26:aload_3         
	//   17   27:iload_2         
	//   18   28:invokevirtual   #283 <Method Object ArrayMap.valueAt(int)>
	//   19   31:checkcast       #14  <Class Transition$AnimationInfo>
	//   20   34:astore          4
				if(animationinfo.mView != null && viewgroup != null && ((Object) (viewgroup)).equals(((Object) (animationinfo.mWindowId))))
	//*  21   36:aload           4
	//*  22   38:getfield        #711 <Field View Transition$AnimationInfo.mView>
	//*  23   41:ifnull          71
	//*  24   44:aload_1         
	//*  25   45:ifnull          71
	//*  26   48:aload_1         
	//*  27   49:aload           4
	//*  28   51:getfield        #765 <Field WindowIdImpl Transition$AnimationInfo.mWindowId>
	//*  29   54:invokevirtual   #476 <Method boolean Object.equals(Object)>
	//*  30   57:ifeq            71
					((Animator)arraymap.keyAt(i)).end();
	//   31   60:aload_3         
	//   32   61:iload_2         
	//   33   62:invokevirtual   #491 <Method Object ArrayMap.keyAt(int)>
	//   34   65:checkcast       #579 <Class Animator>
	//   35   68:invokevirtual   #766 <Method void Animator.end()>
			}

	//   36   71:iload_2         
	//   37   72:iconst_1        
	//   38   73:isub            
	//   39   74:istore_2        
		}
	//*  40   75:goto            22
	//   41   78:return          
	}

	public long getDuration()
	{
		return mDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field long mDuration>
	//    2    4:lreturn         
	}

	public Rect getEpicenter()
	{
		if(mEpicenterCallback == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #770 <Field Transition$EpicenterCallback mEpicenterCallback>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mEpicenterCallback.onGetEpicenter(this);
	//    5    9:aload_0         
	//    6   10:getfield        #770 <Field Transition$EpicenterCallback mEpicenterCallback>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #774 <Method Rect Transition$EpicenterCallback.onGetEpicenter(Transition)>
	//    9   17:areturn         
	}

	public EpicenterCallback getEpicenterCallback()
	{
		return mEpicenterCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #770 <Field Transition$EpicenterCallback mEpicenterCallback>
	//    2    4:areturn         
	}

	public TimeInterpolator getInterpolator()
	{
		return mInterpolator;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field TimeInterpolator mInterpolator>
	//    2    4:areturn         
	}

	TransitionValues getMatchedTransitionValues(View view, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field TransitionSet mParent>
	//*   2    4:ifnull          17
			return mParent.getMatchedTransitionValues(view, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #184 <Field TransitionSet mParent>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #782 <Method TransitionValues TransitionSet.getMatchedTransitionValues(View, boolean)>
	//    8   16:areturn         
		ArrayList arraylist;
		if(flag)
	//*   9   17:iload_2         
	//*  10   18:ifeq            30
			arraylist = mStartValuesList;
	//   11   21:aload_0         
	//   12   22:getfield        #295 <Field ArrayList mStartValuesList>
	//   13   25:astore          7
		else
	//*  14   27:goto            36
			arraylist = mEndValuesList;
	//   15   30:aload_0         
	//   16   31:getfield        #301 <Field ArrayList mEndValuesList>
	//   17   34:astore          7
		Object obj = null;
	//   18   36:aconst_null     
	//   19   37:astore          8
		if(arraylist == null)
	//*  20   39:aload           7
	//*  21   41:ifnonnull       46
			return null;
	//   22   44:aconst_null     
	//   23   45:areturn         
		int k = arraylist.size();
	//   24   46:aload           7
	//   25   48:invokevirtual   #399 <Method int ArrayList.size()>
	//   26   51:istore          6
		byte byte0 = -1;
	//   27   53:iconst_m1       
	//   28   54:istore          5
		int i = 0;
	//   29   56:iconst_0        
	//   30   57:istore_3        
		int j;
		do
		{
			j = ((int) (byte0));
	//   31   58:iload           5
	//   32   60:istore          4
			if(i >= k)
				break;
	//   33   62:iload_3         
	//   34   63:iload           6
	//   35   65:icmpge          108
			TransitionValues transitionvalues = (TransitionValues)arraylist.get(i);
	//   36   68:aload           7
	//   37   70:iload_3         
	//   38   71:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   39   74:checkcast       #285 <Class TransitionValues>
	//   40   77:astore          9
			if(transitionvalues == null)
	//*  41   79:aload           9
	//*  42   81:ifnonnull       86
				return null;
	//   43   84:aconst_null     
	//   44   85:areturn         
			if(transitionvalues.view == view)
	//*  45   86:aload           9
	//*  46   88:getfield        #289 <Field View TransitionValues.view>
	//*  47   91:aload_1         
	//*  48   92:if_acmpne       101
			{
				j = i;
	//   49   95:iload_3         
	//   50   96:istore          4
				break;
	//   51   98:goto            108
			}
			i++;
	//   52  101:iload_3         
	//   53  102:iconst_1        
	//   54  103:iadd            
	//   55  104:istore_3        
		} while(true);
	//   56  105:goto            58
		view = ((View) (obj));
	//   57  108:aload           8
	//   58  110:astore_1        
		if(j >= 0)
	//*  59  111:iload           4
	//*  60  113:iflt            143
		{
			if(flag)
	//*  61  116:iload_2         
	//*  62  117:ifeq            128
				view = ((View) (mEndValuesList));
	//   63  120:aload_0         
	//   64  121:getfield        #301 <Field ArrayList mEndValuesList>
	//   65  124:astore_1        
			else
	//*  66  125:goto            133
				view = ((View) (mStartValuesList));
	//   67  128:aload_0         
	//   68  129:getfield        #295 <Field ArrayList mStartValuesList>
	//   69  132:astore_1        
			view = ((View) ((TransitionValues)((ArrayList) (view)).get(j)));
	//   70  133:aload_1         
	//   71  134:iload           4
	//   72  136:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   73  139:checkcast       #285 <Class TransitionValues>
	//   74  142:astore_1        
		}
		return ((TransitionValues) (view));
	//   75  143:aload_1         
	//   76  144:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String mName>
	//    2    4:areturn         
	}

	public PathMotion getPathMotion()
	{
		return mPathMotion;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field PathMotion mPathMotion>
	//    2    4:areturn         
	}

	public TransitionPropagation getPropagation()
	{
		return mPropagation;
	//    0    0:aload_0         
	//    1    1:getfield        #642 <Field TransitionPropagation mPropagation>
	//    2    4:areturn         
	}

	public long getStartDelay()
	{
		return mStartDelay;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field long mStartDelay>
	//    2    4:lreturn         
	}

	public List getTargetIds()
	{
		return ((List) (mTargetIds));
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field ArrayList mTargetIds>
	//    2    4:areturn         
	}

	public List getTargetNames()
	{
		return ((List) (mTargetNames));
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field ArrayList mTargetNames>
	//    2    4:areturn         
	}

	public List getTargetTypes()
	{
		return ((List) (mTargetTypes));
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field ArrayList mTargetTypes>
	//    2    4:areturn         
	}

	public List getTargets()
	{
		return ((List) (mTargets));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field ArrayList mTargets>
	//    2    4:areturn         
	}

	public String[] getTransitionProperties()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public TransitionValues getTransitionValues(View view, boolean flag)
	{
		if(mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field TransitionSet mParent>
	//*   2    4:ifnull          17
			return mParent.getTransitionValues(view, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #184 <Field TransitionSet mParent>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #798 <Method TransitionValues TransitionSet.getTransitionValues(View, boolean)>
	//    8   16:areturn         
		TransitionValuesMaps transitionvaluesmaps;
		if(flag)
	//*   9   17:iload_2         
	//*  10   18:ifeq            29
			transitionvaluesmaps = mStartValues;
	//   11   21:aload_0         
	//   12   22:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//   13   25:astore_3        
		else
	//*  14   26:goto            34
			transitionvaluesmaps = mEndValues;
	//   15   29:aload_0         
	//   16   30:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//   17   33:astore_3        
		return (TransitionValues)transitionvaluesmaps.mViewValues.get(((Object) (view)));
	//   18   34:aload_3         
	//   19   35:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//   20   38:aload_1         
	//   21   39:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//   22   42:checkcast       #285 <Class TransitionValues>
	//   23   45:areturn         
	}

	public boolean isTransitionRequired(TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
			flag = flag1;
	//    2    3:iload           6
	//    3    5:istore          5
			if(transitionvalues == null)
				break label0;
	//    4    7:aload_1         
	//    5    8:ifnull          120
			flag = flag1;
	//    6   11:iload           6
	//    7   13:istore          5
			if(transitionvalues1 == null)
				break label0;
	//    8   15:aload_2         
	//    9   16:ifnull          120
			String as[] = getTransitionProperties();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #703 <Method String[] getTransitionProperties()>
	//   12   23:astore          7
			if(as != null)
	//*  13   25:aload           7
	//*  14   27:ifnull          69
			{
				int j = as.length;
	//   15   30:aload           7
	//   16   32:arraylength     
	//   17   33:istore          4
				int i = 0;
	//   18   35:iconst_0        
	//   19   36:istore_3        
				do
				{
					flag = flag1;
	//   20   37:iload           6
	//   21   39:istore          5
					if(i >= j)
						break label0;
	//   22   41:iload_3         
	//   23   42:iload           4
	//   24   44:icmpge          120
					if(isValueChanged(transitionvalues, transitionvalues1, as[i]))
	//*  25   47:aload_1         
	//*  26   48:aload_2         
	//*  27   49:aload           7
	//*  28   51:iload_3         
	//*  29   52:aaload          
	//*  30   53:invokestatic    #800 <Method boolean isValueChanged(TransitionValues, TransitionValues, String)>
	//*  31   56:ifeq            62
						break;
	//   32   59:goto            117
					i++;
	//   33   62:iload_3         
	//   34   63:iconst_1        
	//   35   64:iadd            
	//   36   65:istore_3        
				} while(true);
	//   37   66:goto            37
			} else
			{
				Iterator iterator = transitionvalues.values.keySet().iterator();
	//   38   69:aload_1         
	//   39   70:getfield        #468 <Field Map TransitionValues.values>
	//   40   73:invokeinterface #804 <Method Set Map.keySet()>
	//   41   78:invokeinterface #810 <Method Iterator Set.iterator()>
	//   42   83:astore          7
				do
				{
					flag = flag1;
	//   43   85:iload           6
	//   44   87:istore          5
					if(!iterator.hasNext())
						break label0;
	//   45   89:aload           7
	//   46   91:invokeinterface #815 <Method boolean Iterator.hasNext()>
	//   47   96:ifeq            120
				} while(!isValueChanged(transitionvalues, transitionvalues1, (String)iterator.next()));
	//   48   99:aload_1         
	//   49  100:aload_2         
	//   50  101:aload           7
	//   51  103:invokeinterface #818 <Method Object Iterator.next()>
	//   52  108:checkcast       #537 <Class String>
	//   53  111:invokestatic    #800 <Method boolean isValueChanged(TransitionValues, TransitionValues, String)>
	//   54  114:ifeq            85
			}
			flag = true;
	//   55  117:iconst_1        
	//   56  118:istore          5
		}
		return flag;
	//   57  120:iload           5
	//   58  122:ireturn         
	}

	boolean isValidTarget(View view)
	{
		int k = view.getId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #317 <Method int View.getId()>
	//    2    4:istore_3        
		if(mTargetIdExcludes != null && mTargetIdExcludes.contains(((Object) (Integer.valueOf(k)))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #163 <Field ArrayList mTargetIdExcludes>
	//*   5    9:ifnull          28
	//*   6   12:aload_0         
	//*   7   13:getfield        #163 <Field ArrayList mTargetIdExcludes>
	//*   8   16:iload_3         
	//*   9   17:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//*  10   20:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  11   23:ifeq            28
			return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
		if(mTargetExcludes != null && mTargetExcludes.contains(((Object) (view))))
	//*  14   28:aload_0         
	//*  15   29:getfield        #165 <Field ArrayList mTargetExcludes>
	//*  16   32:ifnull          48
	//*  17   35:aload_0         
	//*  18   36:getfield        #165 <Field ArrayList mTargetExcludes>
	//*  19   39:aload_1         
	//*  20   40:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  21   43:ifeq            48
			return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
		if(mTargetTypeExcludes != null)
	//*  24   48:aload_0         
	//*  25   49:getfield        #167 <Field ArrayList mTargetTypeExcludes>
	//*  26   52:ifnull          99
		{
			int l = mTargetTypeExcludes.size();
	//   27   55:aload_0         
	//   28   56:getfield        #167 <Field ArrayList mTargetTypeExcludes>
	//   29   59:invokevirtual   #399 <Method int ArrayList.size()>
	//   30   62:istore          4
			for(int i = 0; i < l; i++)
	//*  31   64:iconst_0        
	//*  32   65:istore_2        
	//*  33   66:iload_2         
	//*  34   67:iload           4
	//*  35   69:icmpge          99
				if(((Class)mTargetTypeExcludes.get(i)).isInstance(((Object) (view))))
	//*  36   72:aload_0         
	//*  37   73:getfield        #167 <Field ArrayList mTargetTypeExcludes>
	//*  38   76:iload_2         
	//*  39   77:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//*  40   80:checkcast       #136 <Class Class>
	//*  41   83:aload_1         
	//*  42   84:invokevirtual   #404 <Method boolean Class.isInstance(Object)>
	//*  43   87:ifeq            92
					return false;
	//   44   90:iconst_0        
	//   45   91:ireturn         

	//   46   92:iload_2         
	//   47   93:iconst_1        
	//   48   94:iadd            
	//   49   95:istore_2        
		}
	//*  50   96:goto            66
		if(mTargetNameExcludes != null && ViewCompat.getTransitionName(view) != null && mTargetNameExcludes.contains(((Object) (ViewCompat.getTransitionName(view)))))
	//*  51   99:aload_0         
	//*  52  100:getfield        #169 <Field ArrayList mTargetNameExcludes>
	//*  53  103:ifnull          129
	//*  54  106:aload_1         
	//*  55  107:invokestatic    #336 <Method String ViewCompat.getTransitionName(View)>
	//*  56  110:ifnull          129
	//*  57  113:aload_0         
	//*  58  114:getfield        #169 <Field ArrayList mTargetNameExcludes>
	//*  59  117:aload_1         
	//*  60  118:invokestatic    #336 <Method String ViewCompat.getTransitionName(View)>
	//*  61  121:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  62  124:ifeq            129
			return false;
	//   63  127:iconst_0        
	//   64  128:ireturn         
		if(mTargetIds.size() == 0 && mTargets.size() == 0 && (mTargetTypes == null || mTargetTypes.isEmpty()) && (mTargetNames == null || mTargetNames.isEmpty()))
	//*  65  129:aload_0         
	//*  66  130:getfield        #155 <Field ArrayList mTargetIds>
	//*  67  133:invokevirtual   #399 <Method int ArrayList.size()>
	//*  68  136:ifne            185
	//*  69  139:aload_0         
	//*  70  140:getfield        #157 <Field ArrayList mTargets>
	//*  71  143:invokevirtual   #399 <Method int ArrayList.size()>
	//*  72  146:ifne            185
	//*  73  149:aload_0         
	//*  74  150:getfield        #161 <Field ArrayList mTargetTypes>
	//*  75  153:ifnull          166
	//*  76  156:aload_0         
	//*  77  157:getfield        #161 <Field ArrayList mTargetTypes>
	//*  78  160:invokevirtual   #659 <Method boolean ArrayList.isEmpty()>
	//*  79  163:ifeq            185
	//*  80  166:aload_0         
	//*  81  167:getfield        #159 <Field ArrayList mTargetNames>
	//*  82  170:ifnull          183
	//*  83  173:aload_0         
	//*  84  174:getfield        #159 <Field ArrayList mTargetNames>
	//*  85  177:invokevirtual   #659 <Method boolean ArrayList.isEmpty()>
	//*  86  180:ifeq            185
			return true;
	//   87  183:iconst_1        
	//   88  184:ireturn         
		if(!mTargetIds.contains(((Object) (Integer.valueOf(k)))))
	//*  89  185:aload_0         
	//*  90  186:getfield        #155 <Field ArrayList mTargetIds>
	//*  91  189:iload_3         
	//*  92  190:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//*  93  193:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  94  196:ifne            284
		{
			if(mTargets.contains(((Object) (view))))
	//*  95  199:aload_0         
	//*  96  200:getfield        #157 <Field ArrayList mTargets>
	//*  97  203:aload_1         
	//*  98  204:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  99  207:ifeq            212
				return true;
	//  100  210:iconst_1        
	//  101  211:ireturn         
			if(mTargetNames != null && mTargetNames.contains(((Object) (ViewCompat.getTransitionName(view)))))
	//* 102  212:aload_0         
	//* 103  213:getfield        #159 <Field ArrayList mTargetNames>
	//* 104  216:ifnull          235
	//* 105  219:aload_0         
	//* 106  220:getfield        #159 <Field ArrayList mTargetNames>
	//* 107  223:aload_1         
	//* 108  224:invokestatic    #336 <Method String ViewCompat.getTransitionName(View)>
	//* 109  227:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//* 110  230:ifeq            235
				return true;
	//  111  233:iconst_1        
	//  112  234:ireturn         
			if(mTargetTypes != null)
	//* 113  235:aload_0         
	//* 114  236:getfield        #161 <Field ArrayList mTargetTypes>
	//* 115  239:ifnull          282
			{
				for(int j = 0; j < mTargetTypes.size(); j++)
	//* 116  242:iconst_0        
	//* 117  243:istore_2        
	//* 118  244:iload_2         
	//* 119  245:aload_0         
	//* 120  246:getfield        #161 <Field ArrayList mTargetTypes>
	//* 121  249:invokevirtual   #399 <Method int ArrayList.size()>
	//* 122  252:icmpge          282
					if(((Class)mTargetTypes.get(j)).isInstance(((Object) (view))))
	//* 123  255:aload_0         
	//* 124  256:getfield        #161 <Field ArrayList mTargetTypes>
	//* 125  259:iload_2         
	//* 126  260:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//* 127  263:checkcast       #136 <Class Class>
	//* 128  266:aload_1         
	//* 129  267:invokevirtual   #404 <Method boolean Class.isInstance(Object)>
	//* 130  270:ifeq            275
						return true;
	//  131  273:iconst_1        
	//  132  274:ireturn         

	//  133  275:iload_2         
	//  134  276:iconst_1        
	//  135  277:iadd            
	//  136  278:istore_2        
			}
	//* 137  279:goto            244
			return false;
	//  138  282:iconst_0        
	//  139  283:ireturn         
		} else
		{
			return true;
	//  140  284:iconst_1        
	//  141  285:ireturn         
		}
	}

	public void pause(View view)
	{
		if(!mEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #198 <Field boolean mEnded>
	//*   2    4:ifne            147
		{
			ArrayMap arraymap = getRunningAnimators();
	//    3    7:invokestatic    #689 <Method ArrayMap getRunningAnimators()>
	//    4   10:astore          4
			int i = arraymap.size();
	//    5   12:aload           4
	//    6   14:invokevirtual   #279 <Method int ArrayMap.size()>
	//    7   17:istore_2        
			view = ((View) (ViewUtils.getWindowId(view)));
	//    8   18:aload_1         
	//    9   19:invokestatic    #733 <Method WindowIdImpl ViewUtils.getWindowId(View)>
	//   10   22:astore_1        
			for(i--; i >= 0; i--)
	//*  11   23:iload_2         
	//*  12   24:iconst_1        
	//*  13   25:isub            
	//*  14   26:istore_2        
	//*  15   27:iload_2         
	//*  16   28:iflt            81
			{
				AnimationInfo animationinfo = (AnimationInfo)arraymap.valueAt(i);
	//   17   31:aload           4
	//   18   33:iload_2         
	//   19   34:invokevirtual   #283 <Method Object ArrayMap.valueAt(int)>
	//   20   37:checkcast       #14  <Class Transition$AnimationInfo>
	//   21   40:astore          5
				if(animationinfo.mView != null && ((Object) (view)).equals(((Object) (animationinfo.mWindowId))))
	//*  22   42:aload           5
	//*  23   44:getfield        #711 <Field View Transition$AnimationInfo.mView>
	//*  24   47:ifnull          74
	//*  25   50:aload_1         
	//*  26   51:aload           5
	//*  27   53:getfield        #765 <Field WindowIdImpl Transition$AnimationInfo.mWindowId>
	//*  28   56:invokevirtual   #476 <Method boolean Object.equals(Object)>
	//*  29   59:ifeq            74
					AnimatorUtils.pause((Animator)arraymap.keyAt(i));
	//   30   62:aload           4
	//   31   64:iload_2         
	//   32   65:invokevirtual   #491 <Method Object ArrayMap.keyAt(int)>
	//   33   68:checkcast       #579 <Class Animator>
	//   34   71:invokestatic    #824 <Method void AnimatorUtils.pause(Animator)>
			}

	//   35   74:iload_2         
	//   36   75:iconst_1        
	//   37   76:isub            
	//   38   77:istore_2        
	//*  39   78:goto            27
			if(mListeners != null && mListeners.size() > 0)
	//*  40   81:aload_0         
	//*  41   82:getfield        #200 <Field ArrayList mListeners>
	//*  42   85:ifnull          142
	//*  43   88:aload_0         
	//*  44   89:getfield        #200 <Field ArrayList mListeners>
	//*  45   92:invokevirtual   #399 <Method int ArrayList.size()>
	//*  46   95:ifle            142
			{
				view = ((View) ((ArrayList)mListeners.clone()));
	//   47   98:aload_0         
	//   48   99:getfield        #200 <Field ArrayList mListeners>
	//   49  102:invokevirtual   #637 <Method Object ArrayList.clone()>
	//   50  105:checkcast       #152 <Class ArrayList>
	//   51  108:astore_1        
				int k = ((ArrayList) (view)).size();
	//   52  109:aload_1         
	//   53  110:invokevirtual   #399 <Method int ArrayList.size()>
	//   54  113:istore_3        
				for(int j = 0; j < k; j++)
	//*  55  114:iconst_0        
	//*  56  115:istore_2        
	//*  57  116:iload_2         
	//*  58  117:iload_3         
	//*  59  118:icmpge          142
					((TransitionListener)((ArrayList) (view)).get(j)).onTransitionPause(this);
	//   60  121:aload_1         
	//   61  122:iload_2         
	//   62  123:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   63  126:checkcast       #26  <Class Transition$TransitionListener>
	//   64  129:aload_0         
	//   65  130:invokeinterface #827 <Method void Transition$TransitionListener.onTransitionPause(Transition)>

	//   66  135:iload_2         
	//   67  136:iconst_1        
	//   68  137:iadd            
	//   69  138:istore_2        
			}
	//*  70  139:goto            116
			mPaused = true;
	//   71  142:aload_0         
	//   72  143:iconst_1        
	//   73  144:putfield        #196 <Field boolean mPaused>
		}
	//   74  147:return          
	}

	void playTransition(ViewGroup viewgroup)
	{
		mStartValuesList = new ArrayList();
	//    0    0:aload_0         
	//    1    1:new             #152 <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #153 <Method void ArrayList()>
	//    4    8:putfield        #295 <Field ArrayList mStartValuesList>
		mEndValuesList = new ArrayList();
	//    5   11:aload_0         
	//    6   12:new             #152 <Class ArrayList>
	//    7   15:dup             
	//    8   16:invokespecial   #153 <Method void ArrayList()>
	//    9   19:putfield        #301 <Field ArrayList mEndValuesList>
		matchStartAndEnd(mStartValues, mEndValues);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//   13   27:aload_0         
	//   14   28:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//   15   31:invokespecial   #830 <Method void matchStartAndEnd(TransitionValuesMaps, TransitionValuesMaps)>
		ArrayMap arraymap = getRunningAnimators();
	//   16   34:invokestatic    #689 <Method ArrayMap getRunningAnimators()>
	//   17   37:astore          4
		int i = arraymap.size();
	//   18   39:aload           4
	//   19   41:invokevirtual   #279 <Method int ArrayMap.size()>
	//   20   44:istore_2        
		WindowIdImpl windowidimpl = ViewUtils.getWindowId(((View) (viewgroup)));
	//   21   45:aload_1         
	//   22   46:invokestatic    #733 <Method WindowIdImpl ViewUtils.getWindowId(View)>
	//   23   49:astore          5
		for(i--; i >= 0; i--)
	//*  24   51:iload_2         
	//*  25   52:iconst_1        
	//*  26   53:isub            
	//*  27   54:istore_2        
	//*  28   55:iload_2         
	//*  29   56:iflt            223
		{
			Animator animator = (Animator)arraymap.keyAt(i);
	//   30   59:aload           4
	//   31   61:iload_2         
	//   32   62:invokevirtual   #491 <Method Object ArrayMap.keyAt(int)>
	//   33   65:checkcast       #579 <Class Animator>
	//   34   68:astore          6
			if(animator == null)
				continue;
	//   35   70:aload           6
	//   36   72:ifnull          216
			AnimationInfo animationinfo = (AnimationInfo)arraymap.get(((Object) (animator)));
	//   37   75:aload           4
	//   38   77:aload           6
	//   39   79:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//   40   82:checkcast       #14  <Class Transition$AnimationInfo>
	//   41   85:astore          7
			if(animationinfo == null || animationinfo.mView == null || !((Object) (windowidimpl)).equals(((Object) (animationinfo.mWindowId))))
				continue;
	//   42   87:aload           7
	//   43   89:ifnull          216
	//   44   92:aload           7
	//   45   94:getfield        #711 <Field View Transition$AnimationInfo.mView>
	//   46   97:ifnull          216
	//   47  100:aload           5
	//   48  102:aload           7
	//   49  104:getfield        #765 <Field WindowIdImpl Transition$AnimationInfo.mWindowId>
	//   50  107:invokevirtual   #476 <Method boolean Object.equals(Object)>
	//   51  110:ifeq            216
			TransitionValues transitionvalues = animationinfo.mValues;
	//   52  113:aload           7
	//   53  115:getfield        #708 <Field TransitionValues Transition$AnimationInfo.mValues>
	//   54  118:astore          8
			Object obj = ((Object) (animationinfo.mView));
	//   55  120:aload           7
	//   56  122:getfield        #711 <Field View Transition$AnimationInfo.mView>
	//   57  125:astore          10
			TransitionValues transitionvalues1 = getTransitionValues(((View) (obj)), true);
	//   58  127:aload_0         
	//   59  128:aload           10
	//   60  130:iconst_1        
	//   61  131:invokevirtual   #831 <Method TransitionValues getTransitionValues(View, boolean)>
	//   62  134:astore          9
			obj = ((Object) (getMatchedTransitionValues(((View) (obj)), true)));
	//   63  136:aload_0         
	//   64  137:aload           10
	//   65  139:iconst_1        
	//   66  140:invokevirtual   #832 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//   67  143:astore          10
			boolean flag;
			if((transitionvalues1 != null || obj != null) && animationinfo.mTransition.isTransitionRequired(transitionvalues, ((TransitionValues) (obj))))
	//*  68  145:aload           9
	//*  69  147:ifnonnull       155
	//*  70  150:aload           10
	//*  71  152:ifnull          175
	//*  72  155:aload           7
	//*  73  157:getfield        #836 <Field Transition Transition$AnimationInfo.mTransition>
	//*  74  160:aload           8
	//*  75  162:aload           10
	//*  76  164:invokevirtual   #698 <Method boolean isTransitionRequired(TransitionValues, TransitionValues)>
	//*  77  167:ifeq            175
				flag = true;
	//   78  170:iconst_1        
	//   79  171:istore_3        
			else
	//*  80  172:goto            177
				flag = false;
	//   81  175:iconst_0        
	//   82  176:istore_3        
			if(!flag)
				continue;
	//   83  177:iload_3         
	//   84  178:ifeq            216
			if(!animator.isRunning() && !animator.isStarted())
	//*  85  181:aload           6
	//*  86  183:invokevirtual   #839 <Method boolean Animator.isRunning()>
	//*  87  186:ifne            211
	//*  88  189:aload           6
	//*  89  191:invokevirtual   #842 <Method boolean Animator.isStarted()>
	//*  90  194:ifeq            200
	//*  91  197:goto            211
				arraymap.remove(((Object) (animator)));
	//   92  200:aload           4
	//   93  202:aload           6
	//   94  204:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//   95  207:pop             
			else
	//*  96  208:goto            216
				animator.cancel();
	//   97  211:aload           6
	//   98  213:invokevirtual   #634 <Method void Animator.cancel()>
		}

	//   99  216:iload_2         
	//  100  217:iconst_1        
	//  101  218:isub            
	//  102  219:istore_2        
	//* 103  220:goto            55
		createAnimators(viewgroup, mStartValues, mEndValues, mStartValuesList, mEndValuesList);
	//  104  223:aload_0         
	//  105  224:aload_1         
	//  106  225:aload_0         
	//  107  226:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//  108  229:aload_0         
	//  109  230:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//  110  233:aload_0         
	//  111  234:getfield        #295 <Field ArrayList mStartValuesList>
	//  112  237:aload_0         
	//  113  238:getfield        #301 <Field ArrayList mEndValuesList>
	//  114  241:invokevirtual   #844 <Method void createAnimators(ViewGroup, TransitionValuesMaps, TransitionValuesMaps, ArrayList, ArrayList)>
		runAnimators();
	//  115  244:aload_0         
	//  116  245:invokevirtual   #847 <Method void runAnimators()>
	//  117  248:return          
	}

	public Transition removeListener(TransitionListener transitionlistener)
	{
		if(mListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field ArrayList mListeners>
	//*   2    4:ifnonnull       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		mListeners.remove(((Object) (transitionlistener)));
	//    5    9:aload_0         
	//    6   10:getfield        #200 <Field ArrayList mListeners>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #850 <Method boolean ArrayList.remove(Object)>
	//    9   17:pop             
		if(mListeners.size() == 0)
	//*  10   18:aload_0         
	//*  11   19:getfield        #200 <Field ArrayList mListeners>
	//*  12   22:invokevirtual   #399 <Method int ArrayList.size()>
	//*  13   25:ifne            33
			mListeners = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #200 <Field ArrayList mListeners>
		return this;
	//   17   33:aload_0         
	//   18   34:areturn         
	}

	public Transition removeTarget(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			mTargetIds.remove(((Object) (Integer.valueOf(i))));
	//    2    4:aload_0         
	//    3    5:getfield        #155 <Field ArrayList mTargetIds>
	//    4    8:iload_1         
	//    5    9:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//    6   12:invokevirtual   #850 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public Transition removeTarget(View view)
	{
		mTargets.remove(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field ArrayList mTargets>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #850 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Transition removeTarget(Class class1)
	{
		if(mTargetTypes != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #161 <Field ArrayList mTargetTypes>
	//*   2    4:ifnull          16
			mTargetTypes.remove(((Object) (class1)));
	//    3    7:aload_0         
	//    4    8:getfield        #161 <Field ArrayList mTargetTypes>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #850 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public Transition removeTarget(String s)
	{
		if(mTargetNames != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field ArrayList mTargetNames>
	//*   2    4:ifnull          16
			mTargetNames.remove(((Object) (s)));
	//    3    7:aload_0         
	//    4    8:getfield        #159 <Field ArrayList mTargetNames>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #850 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public void resume(View view)
	{
		if(mPaused)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field boolean mPaused>
	//*   2    4:ifeq            154
		{
			if(!mEnded)
	//*   3    7:aload_0         
	//*   4    8:getfield        #198 <Field boolean mEnded>
	//*   5   11:ifne            149
			{
				ArrayMap arraymap = getRunningAnimators();
	//    6   14:invokestatic    #689 <Method ArrayMap getRunningAnimators()>
	//    7   17:astore          4
				int i = arraymap.size();
	//    8   19:aload           4
	//    9   21:invokevirtual   #279 <Method int ArrayMap.size()>
	//   10   24:istore_2        
				view = ((View) (ViewUtils.getWindowId(view)));
	//   11   25:aload_1         
	//   12   26:invokestatic    #733 <Method WindowIdImpl ViewUtils.getWindowId(View)>
	//   13   29:astore_1        
				for(i--; i >= 0; i--)
	//*  14   30:iload_2         
	//*  15   31:iconst_1        
	//*  16   32:isub            
	//*  17   33:istore_2        
	//*  18   34:iload_2         
	//*  19   35:iflt            88
				{
					AnimationInfo animationinfo = (AnimationInfo)arraymap.valueAt(i);
	//   20   38:aload           4
	//   21   40:iload_2         
	//   22   41:invokevirtual   #283 <Method Object ArrayMap.valueAt(int)>
	//   23   44:checkcast       #14  <Class Transition$AnimationInfo>
	//   24   47:astore          5
					if(animationinfo.mView != null && ((Object) (view)).equals(((Object) (animationinfo.mWindowId))))
	//*  25   49:aload           5
	//*  26   51:getfield        #711 <Field View Transition$AnimationInfo.mView>
	//*  27   54:ifnull          81
	//*  28   57:aload_1         
	//*  29   58:aload           5
	//*  30   60:getfield        #765 <Field WindowIdImpl Transition$AnimationInfo.mWindowId>
	//*  31   63:invokevirtual   #476 <Method boolean Object.equals(Object)>
	//*  32   66:ifeq            81
						AnimatorUtils.resume((Animator)arraymap.keyAt(i));
	//   33   69:aload           4
	//   34   71:iload_2         
	//   35   72:invokevirtual   #491 <Method Object ArrayMap.keyAt(int)>
	//   36   75:checkcast       #579 <Class Animator>
	//   37   78:invokestatic    #854 <Method void AnimatorUtils.resume(Animator)>
				}

	//   38   81:iload_2         
	//   39   82:iconst_1        
	//   40   83:isub            
	//   41   84:istore_2        
	//*  42   85:goto            34
				if(mListeners != null && mListeners.size() > 0)
	//*  43   88:aload_0         
	//*  44   89:getfield        #200 <Field ArrayList mListeners>
	//*  45   92:ifnull          149
	//*  46   95:aload_0         
	//*  47   96:getfield        #200 <Field ArrayList mListeners>
	//*  48   99:invokevirtual   #399 <Method int ArrayList.size()>
	//*  49  102:ifle            149
				{
					view = ((View) ((ArrayList)mListeners.clone()));
	//   50  105:aload_0         
	//   51  106:getfield        #200 <Field ArrayList mListeners>
	//   52  109:invokevirtual   #637 <Method Object ArrayList.clone()>
	//   53  112:checkcast       #152 <Class ArrayList>
	//   54  115:astore_1        
					int k = ((ArrayList) (view)).size();
	//   55  116:aload_1         
	//   56  117:invokevirtual   #399 <Method int ArrayList.size()>
	//   57  120:istore_3        
					for(int j = 0; j < k; j++)
	//*  58  121:iconst_0        
	//*  59  122:istore_2        
	//*  60  123:iload_2         
	//*  61  124:iload_3         
	//*  62  125:icmpge          149
						((TransitionListener)((ArrayList) (view)).get(j)).onTransitionResume(this);
	//   63  128:aload_1         
	//   64  129:iload_2         
	//   65  130:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   66  133:checkcast       #26  <Class Transition$TransitionListener>
	//   67  136:aload_0         
	//   68  137:invokeinterface #857 <Method void Transition$TransitionListener.onTransitionResume(Transition)>

	//   69  142:iload_2         
	//   70  143:iconst_1        
	//   71  144:iadd            
	//   72  145:istore_2        
				}
			}
	//*  73  146:goto            123
			mPaused = false;
	//   74  149:aload_0         
	//   75  150:iconst_0        
	//   76  151:putfield        #196 <Field boolean mPaused>
		}
	//   77  154:return          
	}

	protected void runAnimators()
	{
		start();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #858 <Method void start()>
		ArrayMap arraymap = getRunningAnimators();
	//    2    4:invokestatic    #689 <Method ArrayMap getRunningAnimators()>
	//    3    7:astore_1        
		Iterator iterator = mAnimators.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #202 <Field ArrayList mAnimators>
	//    6   12:invokevirtual   #859 <Method Iterator ArrayList.iterator()>
	//    7   15:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   16:aload_2         
	//    9   17:invokeinterface #815 <Method boolean Iterator.hasNext()>
	//   10   22:ifeq            56
			Animator animator = (Animator)iterator.next();
	//   11   25:aload_2         
	//   12   26:invokeinterface #818 <Method Object Iterator.next()>
	//   13   31:checkcast       #579 <Class Animator>
	//   14   34:astore_3        
			if(arraymap.containsKey(((Object) (animator))))
	//*  15   35:aload_1         
	//*  16   36:aload_3         
	//*  17   37:invokevirtual   #342 <Method boolean ArrayMap.containsKey(Object)>
	//*  18   40:ifeq            16
			{
				start();
	//   19   43:aload_0         
	//   20   44:invokevirtual   #858 <Method void start()>
				runAnimator(animator, arraymap);
	//   21   47:aload_0         
	//   22   48:aload_3         
	//   23   49:aload_1         
	//   24   50:invokespecial   #861 <Method void runAnimator(Animator, ArrayMap)>
			}
		} while(true);
	//   25   53:goto            16
		mAnimators.clear();
	//   26   56:aload_0         
	//   27   57:getfield        #202 <Field ArrayList mAnimators>
	//   28   60:invokevirtual   #862 <Method void ArrayList.clear()>
		end();
	//   29   63:aload_0         
	//   30   64:invokevirtual   #605 <Method void end()>
	//   31   67:return          
	}

	void setCanRemoveViews(boolean flag)
	{
		mCanRemoveViews = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #190 <Field boolean mCanRemoveViews>
	//    3    5:return          
	}

	public Transition setDuration(long l)
	{
		mDuration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #148 <Field long mDuration>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setEpicenterCallback(EpicenterCallback epicentercallback)
	{
		mEpicenterCallback = epicentercallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #770 <Field Transition$EpicenterCallback mEpicenterCallback>
	//    3    5:return          
	}

	public Transition setInterpolator(TimeInterpolator timeinterpolator)
	{
		mInterpolator = timeinterpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #150 <Field TimeInterpolator mInterpolator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient void setMatchOrder(int ai[])
	{
		if(ai != null && ai.length != 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          78
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            12
	//*   5    9:goto            78
		{
			for(int i = 0; i < ai.length; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:aload_1         
	//*  10   16:arraylength     
	//*  11   17:icmpge          66
			{
				if(!isValidMatch(ai[i]))
	//*  12   20:aload_1         
	//*  13   21:iload_2         
	//*  14   22:iaload          
	//*  15   23:invokestatic    #867 <Method boolean isValidMatch(int)>
	//*  16   26:ifne            40
					throw new IllegalArgumentException("matches contains invalid value");
	//   17   29:new             #869 <Class IllegalArgumentException>
	//   18   32:dup             
	//   19   33:ldc2            #871 <String "matches contains invalid value">
	//   20   36:invokespecial   #872 <Method void IllegalArgumentException(String)>
	//   21   39:athrow          
				if(alreadyContains(ai, i))
	//*  22   40:aload_1         
	//*  23   41:iload_2         
	//*  24   42:invokestatic    #874 <Method boolean alreadyContains(int[], int)>
	//*  25   45:ifeq            59
					throw new IllegalArgumentException("matches contains a duplicate value");
	//   26   48:new             #869 <Class IllegalArgumentException>
	//   27   51:dup             
	//   28   52:ldc2            #876 <String "matches contains a duplicate value">
	//   29   55:invokespecial   #872 <Method void IllegalArgumentException(String)>
	//   30   58:athrow          
			}

	//   31   59:iload_2         
	//   32   60:iconst_1        
	//   33   61:iadd            
	//   34   62:istore_2        
	//*  35   63:goto            14
			mMatchOrder = (int[])((int []) (ai)).clone();
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:invokevirtual   #878 <Method Object _5B_I.clone()>
	//   39   71:checkcast       #877 <Class int[]>
	//   40   74:putfield        #186 <Field int[] mMatchOrder>
			return;
	//   41   77:return          
		} else
		{
			mMatchOrder = DEFAULT_MATCH_ORDER;
	//   42   78:aload_0         
	//   43   79:getstatic       #118 <Field int[] DEFAULT_MATCH_ORDER>
	//   44   82:putfield        #186 <Field int[] mMatchOrder>
			return;
	//   45   85:return          
		}
	}

	public void setPathMotion(PathMotion pathmotion)
	{
		if(pathmotion == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			mPathMotion = STRAIGHT_PATH_MOTION;
	//    2    4:aload_0         
	//    3    5:getstatic       #123 <Field PathMotion STRAIGHT_PATH_MOTION>
	//    4    8:putfield        #204 <Field PathMotion mPathMotion>
			return;
	//    5   11:return          
		} else
		{
			mPathMotion = pathmotion;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #204 <Field PathMotion mPathMotion>
			return;
	//    9   17:return          
		}
	}

	public void setPropagation(TransitionPropagation transitionpropagation)
	{
		mPropagation = transitionpropagation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #642 <Field TransitionPropagation mPropagation>
	//    3    5:return          
	}

	Transition setSceneRoot(ViewGroup viewgroup)
	{
		mSceneRoot = viewgroup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #188 <Field ViewGroup mSceneRoot>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Transition setStartDelay(long l)
	{
		mStartDelay = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #146 <Field long mStartDelay>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected void start()
	{
		if(mNumInstances == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field int mNumInstances>
	//*   2    4:ifne            73
		{
			if(mListeners != null && mListeners.size() > 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #200 <Field ArrayList mListeners>
	//*   5   11:ifnull          68
	//*   6   14:aload_0         
	//*   7   15:getfield        #200 <Field ArrayList mListeners>
	//*   8   18:invokevirtual   #399 <Method int ArrayList.size()>
	//*   9   21:ifle            68
			{
				ArrayList arraylist = (ArrayList)mListeners.clone();
	//   10   24:aload_0         
	//   11   25:getfield        #200 <Field ArrayList mListeners>
	//   12   28:invokevirtual   #637 <Method Object ArrayList.clone()>
	//   13   31:checkcast       #152 <Class ArrayList>
	//   14   34:astore_3        
				int j = arraylist.size();
	//   15   35:aload_3         
	//   16   36:invokevirtual   #399 <Method int ArrayList.size()>
	//   17   39:istore_2        
				for(int i = 0; i < j; i++)
	//*  18   40:iconst_0        
	//*  19   41:istore_1        
	//*  20   42:iload_1         
	//*  21   43:iload_2         
	//*  22   44:icmpge          68
					((TransitionListener)arraylist.get(i)).onTransitionStart(this);
	//   23   47:aload_3         
	//   24   48:iload_1         
	//   25   49:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   26   52:checkcast       #26  <Class Transition$TransitionListener>
	//   27   55:aload_0         
	//   28   56:invokeinterface #887 <Method void Transition$TransitionListener.onTransitionStart(Transition)>

	//   29   61:iload_1         
	//   30   62:iconst_1        
	//   31   63:iadd            
	//   32   64:istore_1        
			}
	//*  33   65:goto            42
			mEnded = false;
	//   34   68:aload_0         
	//   35   69:iconst_0        
	//   36   70:putfield        #198 <Field boolean mEnded>
		}
		mNumInstances = mNumInstances + 1;
	//   37   73:aload_0         
	//   38   74:aload_0         
	//   39   75:getfield        #194 <Field int mNumInstances>
	//   40   78:iconst_1        
	//   41   79:iadd            
	//   42   80:putfield        #194 <Field int mNumInstances>
	//   43   83:return          
	}

	public String toString()
	{
		return toString("");
	//    0    0:aload_0         
	//    1    1:ldc2            #889 <String "">
	//    2    4:invokevirtual   #892 <Method String toString(String)>
	//    3    7:areturn         
	}

	String toString(String s)
	{
		Object obj;
label0:
		{
			obj = ((Object) (new StringBuilder()));
	//    0    0:new             #555 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #556 <Method void StringBuilder()>
	//    3    7:astore          4
			((StringBuilder) (obj)).append(s);
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
			((StringBuilder) (obj)).append(((Object)this).getClass().getSimpleName());
	//    8   16:aload           4
	//    9   18:aload_0         
	//   10   19:invokevirtual   #134 <Method Class Object.getClass()>
	//   11   22:invokevirtual   #895 <Method String Class.getSimpleName()>
	//   12   25:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
			((StringBuilder) (obj)).append("@");
	//   14   29:aload           4
	//   15   31:ldc2            #897 <String "@">
	//   16   34:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			((StringBuilder) (obj)).append(Integer.toHexString(((Object)this).hashCode()));
	//   18   38:aload           4
	//   19   40:aload_0         
	//   20   41:invokevirtual   #900 <Method int Object.hashCode()>
	//   21   44:invokestatic    #904 <Method String Integer.toHexString(int)>
	//   22   47:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
			((StringBuilder) (obj)).append(": ");
	//   24   51:aload           4
	//   25   53:ldc2            #906 <String ": ">
	//   26   56:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   28   60:aload           4
	//   29   62:invokevirtual   #569 <Method String StringBuilder.toString()>
	//   30   65:astore          4
			s = ((String) (obj));
	//   31   67:aload           4
	//   32   69:astore_1        
			if(mDuration != -1L)
	//*  33   70:aload_0         
	//*  34   71:getfield        #148 <Field long mDuration>
	//*  35   74:ldc2w           #143 <Long -1L>
	//*  36   77:lcmp            
	//*  37   78:ifeq            126
			{
				s = ((String) (new StringBuilder()));
	//   38   81:new             #555 <Class StringBuilder>
	//   39   84:dup             
	//   40   85:invokespecial   #556 <Method void StringBuilder()>
	//   41   88:astore_1        
				((StringBuilder) (s)).append(((String) (obj)));
	//   42   89:aload_1         
	//   43   90:aload           4
	//   44   92:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   45   95:pop             
				((StringBuilder) (s)).append("dur(");
	//   46   96:aload_1         
	//   47   97:ldc2            #908 <String "dur(">
	//   48  100:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   49  103:pop             
				((StringBuilder) (s)).append(mDuration);
	//   50  104:aload_1         
	//   51  105:aload_0         
	//   52  106:getfield        #148 <Field long mDuration>
	//   53  109:invokevirtual   #911 <Method StringBuilder StringBuilder.append(long)>
	//   54  112:pop             
				((StringBuilder) (s)).append(") ");
	//   55  113:aload_1         
	//   56  114:ldc2            #913 <String ") ">
	//   57  117:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
				s = ((StringBuilder) (s)).toString();
	//   59  121:aload_1         
	//   60  122:invokevirtual   #569 <Method String StringBuilder.toString()>
	//   61  125:astore_1        
			}
			obj = ((Object) (s));
	//   62  126:aload_1         
	//   63  127:astore          4
			if(mStartDelay != -1L)
	//*  64  129:aload_0         
	//*  65  130:getfield        #146 <Field long mStartDelay>
	//*  66  133:ldc2w           #143 <Long -1L>
	//*  67  136:lcmp            
	//*  68  137:ifeq            191
			{
				obj = ((Object) (new StringBuilder()));
	//   69  140:new             #555 <Class StringBuilder>
	//   70  143:dup             
	//   71  144:invokespecial   #556 <Method void StringBuilder()>
	//   72  147:astore          4
				((StringBuilder) (obj)).append(s);
	//   73  149:aload           4
	//   74  151:aload_1         
	//   75  152:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   76  155:pop             
				((StringBuilder) (obj)).append("dly(");
	//   77  156:aload           4
	//   78  158:ldc2            #915 <String "dly(">
	//   79  161:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   80  164:pop             
				((StringBuilder) (obj)).append(mStartDelay);
	//   81  165:aload           4
	//   82  167:aload_0         
	//   83  168:getfield        #146 <Field long mStartDelay>
	//   84  171:invokevirtual   #911 <Method StringBuilder StringBuilder.append(long)>
	//   85  174:pop             
				((StringBuilder) (obj)).append(") ");
	//   86  175:aload           4
	//   87  177:ldc2            #913 <String ") ">
	//   88  180:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//   89  183:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   90  184:aload           4
	//   91  186:invokevirtual   #569 <Method String StringBuilder.toString()>
	//   92  189:astore          4
			}
			s = ((String) (obj));
	//   93  191:aload           4
	//   94  193:astore_1        
			if(mInterpolator != null)
	//*  95  194:aload_0         
	//*  96  195:getfield        #150 <Field TimeInterpolator mInterpolator>
	//*  97  198:ifnull          246
			{
				s = ((String) (new StringBuilder()));
	//   98  201:new             #555 <Class StringBuilder>
	//   99  204:dup             
	//  100  205:invokespecial   #556 <Method void StringBuilder()>
	//  101  208:astore_1        
				((StringBuilder) (s)).append(((String) (obj)));
	//  102  209:aload_1         
	//  103  210:aload           4
	//  104  212:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  105  215:pop             
				((StringBuilder) (s)).append("interp(");
	//  106  216:aload_1         
	//  107  217:ldc2            #917 <String "interp(">
	//  108  220:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  109  223:pop             
				((StringBuilder) (s)).append(((Object) (mInterpolator)));
	//  110  224:aload_1         
	//  111  225:aload_0         
	//  112  226:getfield        #150 <Field TimeInterpolator mInterpolator>
	//  113  229:invokevirtual   #920 <Method StringBuilder StringBuilder.append(Object)>
	//  114  232:pop             
				((StringBuilder) (s)).append(") ");
	//  115  233:aload_1         
	//  116  234:ldc2            #913 <String ") ">
	//  117  237:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  118  240:pop             
				s = ((StringBuilder) (s)).toString();
	//  119  241:aload_1         
	//  120  242:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  121  245:astore_1        
			}
			if(mTargetIds.size() <= 0)
	//* 122  246:aload_0         
	//* 123  247:getfield        #155 <Field ArrayList mTargetIds>
	//* 124  250:invokevirtual   #399 <Method int ArrayList.size()>
	//* 125  253:ifgt            269
			{
				obj = ((Object) (s));
	//  126  256:aload_1         
	//  127  257:astore          4
				if(mTargets.size() <= 0)
					break label0;
	//  128  259:aload_0         
	//  129  260:getfield        #157 <Field ArrayList mTargets>
	//  130  263:invokevirtual   #399 <Method int ArrayList.size()>
	//  131  266:ifle            550
			}
			obj = ((Object) (new StringBuilder()));
	//  132  269:new             #555 <Class StringBuilder>
	//  133  272:dup             
	//  134  273:invokespecial   #556 <Method void StringBuilder()>
	//  135  276:astore          4
			((StringBuilder) (obj)).append(s);
	//  136  278:aload           4
	//  137  280:aload_1         
	//  138  281:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  139  284:pop             
			((StringBuilder) (obj)).append("tgts(");
	//  140  285:aload           4
	//  141  287:ldc2            #922 <String "tgts(">
	//  142  290:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  143  293:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  144  294:aload           4
	//  145  296:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  146  299:astore          4
			int i = mTargetIds.size();
	//  147  301:aload_0         
	//  148  302:getfield        #155 <Field ArrayList mTargetIds>
	//  149  305:invokevirtual   #399 <Method int ArrayList.size()>
	//  150  308:istore_2        
			boolean flag = false;
	//  151  309:iconst_0        
	//  152  310:istore_3        
			s = ((String) (obj));
	//  153  311:aload           4
	//  154  313:astore_1        
			if(i > 0)
	//* 155  314:iload_2         
	//* 156  315:ifle            413
			{
				s = ((String) (obj));
	//  157  318:aload           4
	//  158  320:astore_1        
				for(int j = 0; j < mTargetIds.size(); j++)
	//* 159  321:iconst_0        
	//* 160  322:istore_2        
	//* 161  323:iload_2         
	//* 162  324:aload_0         
	//* 163  325:getfield        #155 <Field ArrayList mTargetIds>
	//* 164  328:invokevirtual   #399 <Method int ArrayList.size()>
	//* 165  331:icmpge          413
				{
					obj = ((Object) (s));
	//  166  334:aload_1         
	//  167  335:astore          4
					if(j > 0)
	//* 168  337:iload_2         
	//* 169  338:ifle            373
					{
						obj = ((Object) (new StringBuilder()));
	//  170  341:new             #555 <Class StringBuilder>
	//  171  344:dup             
	//  172  345:invokespecial   #556 <Method void StringBuilder()>
	//  173  348:astore          4
						((StringBuilder) (obj)).append(s);
	//  174  350:aload           4
	//  175  352:aload_1         
	//  176  353:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  177  356:pop             
						((StringBuilder) (obj)).append(", ");
	//  178  357:aload           4
	//  179  359:ldc2            #924 <String ", ">
	//  180  362:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  181  365:pop             
						obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  182  366:aload           4
	//  183  368:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  184  371:astore          4
					}
					s = ((String) (new StringBuilder()));
	//  185  373:new             #555 <Class StringBuilder>
	//  186  376:dup             
	//  187  377:invokespecial   #556 <Method void StringBuilder()>
	//  188  380:astore_1        
					((StringBuilder) (s)).append(((String) (obj)));
	//  189  381:aload_1         
	//  190  382:aload           4
	//  191  384:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  192  387:pop             
					((StringBuilder) (s)).append(mTargetIds.get(j));
	//  193  388:aload_1         
	//  194  389:aload_0         
	//  195  390:getfield        #155 <Field ArrayList mTargetIds>
	//  196  393:iload_2         
	//  197  394:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//  198  397:invokevirtual   #920 <Method StringBuilder StringBuilder.append(Object)>
	//  199  400:pop             
					s = ((StringBuilder) (s)).toString();
	//  200  401:aload_1         
	//  201  402:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  202  405:astore_1        
				}

	//  203  406:iload_2         
	//  204  407:iconst_1        
	//  205  408:iadd            
	//  206  409:istore_2        
			}
	//* 207  410:goto            323
			obj = ((Object) (s));
	//  208  413:aload_1         
	//  209  414:astore          4
			if(mTargets.size() > 0)
	//* 210  416:aload_0         
	//* 211  417:getfield        #157 <Field ArrayList mTargets>
	//* 212  420:invokevirtual   #399 <Method int ArrayList.size()>
	//* 213  423:ifle            521
			{
				int k = ((int) (flag));
	//  214  426:iload_3         
	//  215  427:istore_2        
				do
				{
					obj = ((Object) (s));
	//  216  428:aload_1         
	//  217  429:astore          4
					if(k >= mTargets.size())
						break;
	//  218  431:iload_2         
	//  219  432:aload_0         
	//  220  433:getfield        #157 <Field ArrayList mTargets>
	//  221  436:invokevirtual   #399 <Method int ArrayList.size()>
	//  222  439:icmpge          521
					obj = ((Object) (s));
	//  223  442:aload_1         
	//  224  443:astore          4
					if(k > 0)
	//* 225  445:iload_2         
	//* 226  446:ifle            481
					{
						obj = ((Object) (new StringBuilder()));
	//  227  449:new             #555 <Class StringBuilder>
	//  228  452:dup             
	//  229  453:invokespecial   #556 <Method void StringBuilder()>
	//  230  456:astore          4
						((StringBuilder) (obj)).append(s);
	//  231  458:aload           4
	//  232  460:aload_1         
	//  233  461:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  234  464:pop             
						((StringBuilder) (obj)).append(", ");
	//  235  465:aload           4
	//  236  467:ldc2            #924 <String ", ">
	//  237  470:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  238  473:pop             
						obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  239  474:aload           4
	//  240  476:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  241  479:astore          4
					}
					s = ((String) (new StringBuilder()));
	//  242  481:new             #555 <Class StringBuilder>
	//  243  484:dup             
	//  244  485:invokespecial   #556 <Method void StringBuilder()>
	//  245  488:astore_1        
					((StringBuilder) (s)).append(((String) (obj)));
	//  246  489:aload_1         
	//  247  490:aload           4
	//  248  492:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  249  495:pop             
					((StringBuilder) (s)).append(mTargets.get(k));
	//  250  496:aload_1         
	//  251  497:aload_0         
	//  252  498:getfield        #157 <Field ArrayList mTargets>
	//  253  501:iload_2         
	//  254  502:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//  255  505:invokevirtual   #920 <Method StringBuilder StringBuilder.append(Object)>
	//  256  508:pop             
					s = ((StringBuilder) (s)).toString();
	//  257  509:aload_1         
	//  258  510:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  259  513:astore_1        
					k++;
	//  260  514:iload_2         
	//  261  515:iconst_1        
	//  262  516:iadd            
	//  263  517:istore_2        
				} while(true);
	//  264  518:goto            428
			}
			s = ((String) (new StringBuilder()));
	//  265  521:new             #555 <Class StringBuilder>
	//  266  524:dup             
	//  267  525:invokespecial   #556 <Method void StringBuilder()>
	//  268  528:astore_1        
			((StringBuilder) (s)).append(((String) (obj)));
	//  269  529:aload_1         
	//  270  530:aload           4
	//  271  532:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  272  535:pop             
			((StringBuilder) (s)).append(")");
	//  273  536:aload_1         
	//  274  537:ldc2            #926 <String ")">
	//  275  540:invokevirtual   #562 <Method StringBuilder StringBuilder.append(String)>
	//  276  543:pop             
			obj = ((Object) (((StringBuilder) (s)).toString()));
	//  277  544:aload_1         
	//  278  545:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  279  548:astore          4
		}
		return ((String) (obj));
	//  280  550:aload           4
	//  281  552:areturn         
	}

	static final boolean DBG = false;
	private static final int DEFAULT_MATCH_ORDER[] = {
		2, 1, 3, 4
	};
	private static final String LOG_TAG = "Transition";
	private static final int MATCH_FIRST = 1;
	public static final int MATCH_ID = 3;
	private static final String MATCH_ID_STR = "id";
	public static final int MATCH_INSTANCE = 1;
	private static final String MATCH_INSTANCE_STR = "instance";
	public static final int MATCH_ITEM_ID = 4;
	private static final String MATCH_ITEM_ID_STR = "itemId";
	private static final int MATCH_LAST = 4;
	public static final int MATCH_NAME = 2;
	private static final String MATCH_NAME_STR = "name";
	private static final PathMotion STRAIGHT_PATH_MOTION = new PathMotion() {

		public Path getPath(float f, float f1, float f2, float f3)
		{
			Path path = new Path();
		//    0    0:new             #15  <Class Path>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void Path()>
		//    3    7:astore          5
			path.moveTo(f, f1);
		//    4    9:aload           5
		//    5   11:fload_1         
		//    6   12:fload_2         
		//    7   13:invokevirtual   #20  <Method void Path.moveTo(float, float)>
			path.lineTo(f2, f3);
		//    8   16:aload           5
		//    9   18:fload_3         
		//   10   19:fload           4
		//   11   21:invokevirtual   #23  <Method void Path.lineTo(float, float)>
			return path;
		//   12   24:aload           5
		//   13   26:areturn         
		}

	}
;
	private static ThreadLocal sRunningAnimators = new ThreadLocal();
	private ArrayList mAnimators;
	boolean mCanRemoveViews;
	private ArrayList mCurrentAnimators;
	long mDuration;
	private TransitionValuesMaps mEndValues;
	private ArrayList mEndValuesList;
	private boolean mEnded;
	private EpicenterCallback mEpicenterCallback;
	private TimeInterpolator mInterpolator;
	private ArrayList mListeners;
	private int mMatchOrder[];
	private String mName;
	private ArrayMap mNameOverrides;
	private int mNumInstances;
	TransitionSet mParent;
	private PathMotion mPathMotion;
	private boolean mPaused;
	TransitionPropagation mPropagation;
	private ViewGroup mSceneRoot;
	private long mStartDelay;
	private TransitionValuesMaps mStartValues;
	private ArrayList mStartValuesList;
	private ArrayList mTargetChildExcludes;
	private ArrayList mTargetExcludes;
	private ArrayList mTargetIdChildExcludes;
	private ArrayList mTargetIdExcludes;
	ArrayList mTargetIds;
	private ArrayList mTargetNameExcludes;
	private ArrayList mTargetNames;
	private ArrayList mTargetTypeChildExcludes;
	private ArrayList mTargetTypeExcludes;
	private ArrayList mTargetTypes;
	ArrayList mTargets;

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_2        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_1        
	//    9   10:iastore         
	//   10   11:dup             
	//   11   12:iconst_2        
	//   12   13:iconst_3        
	//   13   14:iastore         
	//   14   15:dup             
	//   15   16:iconst_3        
	//   16   17:iconst_4        
	//   17   18:iastore         
	//   18   19:putstatic       #118 <Field int[] DEFAULT_MATCH_ORDER>
	//   19   22:new             #8   <Class Transition$1>
	//   20   25:dup             
	//   21   26:invokespecial   #121 <Method void Transition$1()>
	//   22   29:putstatic       #123 <Field PathMotion STRAIGHT_PATH_MOTION>
	//   23   32:new             #125 <Class ThreadLocal>
	//   24   35:dup             
	//   25   36:invokespecial   #126 <Method void ThreadLocal()>
	//   26   39:putstatic       #128 <Field ThreadLocal sRunningAnimators>
	//*  27   42:return          
	}


/*
	static ArrayList access$000(Transition transition)
	{
		return transition.mCurrentAnimators;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field ArrayList mCurrentAnimators>
	//    2    4:areturn         
	}

*/
}
