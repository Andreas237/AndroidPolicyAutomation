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
		for(int i = 0; i < arraymap.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #279 <Method int ArrayMap.size()>
	//*   5    7:icmpge          58
		{
			TransitionValues transitionvalues = (TransitionValues)arraymap.valueAt(i);
	//    6   10:aload_1         
	//    7   11:iload_3         
	//    8   12:invokevirtual   #283 <Method Object ArrayMap.valueAt(int)>
	//    9   15:checkcast       #285 <Class TransitionValues>
	//   10   18:astore          4
			if(isValidTarget(transitionvalues.view))
	//*  11   20:aload_0         
	//*  12   21:aload           4
	//*  13   23:getfield        #289 <Field View TransitionValues.view>
	//*  14   26:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//*  15   29:ifeq            51
			{
				mStartValuesList.add(((Object) (transitionvalues)));
	//   16   32:aload_0         
	//   17   33:getfield        #295 <Field ArrayList mStartValuesList>
	//   18   36:aload           4
	//   19   38:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   20   41:pop             
				mEndValuesList.add(((Object) (null)));
	//   21   42:aload_0         
	//   22   43:getfield        #301 <Field ArrayList mEndValuesList>
	//   23   46:aconst_null     
	//   24   47:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   25   50:pop             
			}
		}

	//   26   51:iload_3         
	//   27   52:iconst_1        
	//   28   53:iadd            
	//   29   54:istore_3        
	//*  30   55:goto            2
		for(int j = 0; j < arraymap1.size(); j++)
	//*  31   58:iconst_0        
	//*  32   59:istore_3        
	//*  33   60:iload_3         
	//*  34   61:aload_2         
	//*  35   62:invokevirtual   #279 <Method int ArrayMap.size()>
	//*  36   65:icmpge          113
		{
			arraymap = ((ArrayMap) ((TransitionValues)arraymap1.valueAt(j)));
	//   37   68:aload_2         
	//   38   69:iload_3         
	//   39   70:invokevirtual   #283 <Method Object ArrayMap.valueAt(int)>
	//   40   73:checkcast       #285 <Class TransitionValues>
	//   41   76:astore_1        
			if(isValidTarget(((TransitionValues) (arraymap)).view))
	//*  42   77:aload_0         
	//*  43   78:aload_1         
	//*  44   79:getfield        #289 <Field View TransitionValues.view>
	//*  45   82:invokevirtual   #293 <Method boolean isValidTarget(View)>
	//*  46   85:ifeq            106
			{
				mEndValuesList.add(((Object) (arraymap)));
	//   47   88:aload_0         
	//   48   89:getfield        #301 <Field ArrayList mEndValuesList>
	//   49   92:aload_1         
	//   50   93:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   51   96:pop             
				mStartValuesList.add(((Object) (null)));
	//   52   97:aload_0         
	//   53   98:getfield        #295 <Field ArrayList mStartValuesList>
	//   54  101:aconst_null     
	//   55  102:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//   56  105:pop             
			}
		}

	//   57  106:iload_3         
	//   58  107:iconst_1        
	//   59  108:iadd            
	//   60  109:istore_3        
	//*  61  110:goto            60
	//   62  113:return          
	}

	private static void addViewValues(TransitionValuesMaps transitionvaluesmaps, View view, TransitionValues transitionvalues)
	{
		long l;
label0:
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
	//*  10   16:iflt            39
				if(transitionvaluesmaps.mIdValues.indexOfKey(i) >= 0)
	//*  11   19:aload_0         
	//*  12   20:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//*  13   23:iload_3         
	//*  14   24:invokevirtual   #327 <Method int SparseArray.indexOfKey(int)>
	//*  15   27:iflt            155
					transitionvaluesmaps.mIdValues.put(i, ((Object) (null)));
	//   16   30:aload_0         
	//   17   31:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//   18   34:iload_3         
	//   19   35:aconst_null     
	//   20   36:invokevirtual   #330 <Method void SparseArray.put(int, Object)>
				else
	//*  21   39:aload_1         
	//*  22   40:invokestatic    #336 <Method String ViewCompat.getTransitionName(View)>
	//*  23   43:astore_2        
	//*  24   44:aload_2         
	//*  25   45:ifnull          69
	//*  26   48:aload_0         
	//*  27   49:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//*  28   52:aload_2         
	//*  29   53:invokevirtual   #342 <Method boolean ArrayMap.containsKey(Object)>
	//*  30   56:ifeq            167
	//*  31   59:aload_0         
	//*  32   60:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//*  33   63:aload_2         
	//*  34   64:aconst_null     
	//*  35   65:invokevirtual   #312 <Method Object ArrayMap.put(Object, Object)>
	//*  36   68:pop             
	//*  37   69:aload_1         
	//*  38   70:invokevirtual   #346 <Method android.view.ViewParent View.getParent()>
	//*  39   73:instanceof      #348 <Class ListView>
	//*  40   76:ifeq            154
	//*  41   79:aload_1         
	//*  42   80:invokevirtual   #346 <Method android.view.ViewParent View.getParent()>
	//*  43   83:checkcast       #348 <Class ListView>
	//*  44   86:astore_2        
	//*  45   87:aload_2         
	//*  46   88:invokevirtual   #352 <Method ListAdapter ListView.getAdapter()>
	//*  47   91:invokeinterface #358 <Method boolean ListAdapter.hasStableIds()>
	//*  48   96:ifeq            154
	//*  49   99:aload_2         
	//*  50  100:aload_2         
	//*  51  101:aload_1         
	//*  52  102:invokevirtual   #362 <Method int ListView.getPositionForView(View)>
	//*  53  105:invokevirtual   #366 <Method long ListView.getItemIdAtPosition(int)>
	//*  54  108:lstore          4
	//*  55  110:aload_0         
	//*  56  111:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//*  57  114:lload           4
	//*  58  116:invokevirtual   #375 <Method int LongSparseArray.indexOfKey(long)>
	//*  59  119:iflt            180
	//*  60  122:aload_0         
	//*  61  123:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//*  62  126:lload           4
	//*  63  128:invokevirtual   #379 <Method Object LongSparseArray.get(long)>
	//*  64  131:checkcast       #314 <Class View>
	//*  65  134:astore_1        
	//*  66  135:aload_1         
	//*  67  136:ifnull          154
	//*  68  139:aload_1         
	//*  69  140:iconst_0        
	//*  70  141:invokestatic    #383 <Method void ViewCompat.setHasTransientState(View, boolean)>
	//*  71  144:aload_0         
	//*  72  145:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//*  73  148:lload           4
	//*  74  150:aconst_null     
	//*  75  151:invokevirtual   #386 <Method void LongSparseArray.put(long, Object)>
	//*  76  154:return          
					transitionvaluesmaps.mIdValues.put(i, ((Object) (view)));
	//   77  155:aload_0         
	//   78  156:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//   79  159:iload_3         
	//   80  160:aload_1         
	//   81  161:invokevirtual   #330 <Method void SparseArray.put(int, Object)>
			transitionvalues = ((TransitionValues) (ViewCompat.getTransitionName(view)));
			if(transitionvalues != null)
				if(transitionvaluesmaps.mNameValues.containsKey(((Object) (transitionvalues))))
					transitionvaluesmaps.mNameValues.put(((Object) (transitionvalues)), ((Object) (null)));
				else
	//*  82  164:goto            39
					transitionvaluesmaps.mNameValues.put(((Object) (transitionvalues)), ((Object) (view)));
	//   83  167:aload_0         
	//   84  168:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//   85  171:aload_2         
	//   86  172:aload_1         
	//   87  173:invokevirtual   #312 <Method Object ArrayMap.put(Object, Object)>
	//   88  176:pop             
			if(view.getParent() instanceof ListView)
			{
				transitionvalues = ((TransitionValues) ((ListView)view.getParent()));
				if(((ListView) (transitionvalues)).getAdapter().hasStableIds())
				{
					l = ((ListView) (transitionvalues)).getItemIdAtPosition(((ListView) (transitionvalues)).getPositionForView(view));
					if(transitionvaluesmaps.mItemIdValues.indexOfKey(l) < 0)
						break label0;
					view = (View)transitionvaluesmaps.mItemIdValues.get(l);
					if(view != null)
					{
						ViewCompat.setHasTransientState(view, false);
						transitionvaluesmaps.mItemIdValues.put(l, ((Object) (null)));
					}
				}
			}
			return;
		}
	//*  89  177:goto            69
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
		if(view != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       5
_L1:
		return;
	//    2    4:return          
_L2:
		int l = view.getId();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #317 <Method int View.getId()>
	//    5    9:istore          4
		if(mTargetIdExcludes != null && mTargetIdExcludes.contains(((Object) (Integer.valueOf(l)))) || mTargetExcludes != null && mTargetExcludes.contains(((Object) (view))))
			continue; /* Loop/switch isn't completed */
	//    6   11:aload_0         
	//    7   12:getfield        #163 <Field ArrayList mTargetIdExcludes>
	//    8   15:ifnull          33
	//    9   18:aload_0         
	//   10   19:getfield        #163 <Field ArrayList mTargetIdExcludes>
	//   11   22:iload           4
	//   12   24:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//   13   27:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//   14   30:ifne            4
	//   15   33:aload_0         
	//   16   34:getfield        #165 <Field ArrayList mTargetExcludes>
	//   17   37:ifnull          51
	//   18   40:aload_0         
	//   19   41:getfield        #165 <Field ArrayList mTargetExcludes>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//   22   48:ifne            4
		if(mTargetTypeExcludes != null)
	//*  23   51:aload_0         
	//*  24   52:getfield        #167 <Field ArrayList mTargetTypeExcludes>
	//*  25   55:ifnull          100
		{
			int i1 = mTargetTypeExcludes.size();
	//   26   58:aload_0         
	//   27   59:getfield        #167 <Field ArrayList mTargetTypeExcludes>
	//   28   62:invokevirtual   #399 <Method int ArrayList.size()>
	//   29   65:istore          5
			for(int i = 0; i < i1; i++)
	//*  30   67:iconst_0        
	//*  31   68:istore_3        
	//*  32   69:iload_3         
	//*  33   70:iload           5
	//*  34   72:icmpge          100
				if(((Class)mTargetTypeExcludes.get(i)).isInstance(((Object) (view))))
					continue; /* Loop/switch isn't completed */
	//   35   75:aload_0         
	//   36   76:getfield        #167 <Field ArrayList mTargetTypeExcludes>
	//   37   79:iload_3         
	//   38   80:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   39   83:checkcast       #136 <Class Class>
	//   40   86:aload_1         
	//   41   87:invokevirtual   #404 <Method boolean Class.isInstance(Object)>
	//   42   90:ifne            4

	//   43   93:iload_3         
	//   44   94:iconst_1        
	//   45   95:iadd            
	//   46   96:istore_3        
		}
	//*  47   97:goto            69
		if(view.getParent() instanceof ViewGroup)
	//*  48  100:aload_1         
	//*  49  101:invokevirtual   #346 <Method android.view.ViewParent View.getParent()>
	//*  50  104:instanceof      #406 <Class ViewGroup>
	//*  51  107:ifeq            165
		{
			TransitionValues transitionvalues = new TransitionValues();
	//   52  110:new             #285 <Class TransitionValues>
	//   53  113:dup             
	//   54  114:invokespecial   #407 <Method void TransitionValues()>
	//   55  117:astore          6
			transitionvalues.view = view;
	//   56  119:aload           6
	//   57  121:aload_1         
	//   58  122:putfield        #289 <Field View TransitionValues.view>
			int j;
			if(flag)
	//*  59  125:iload_2         
	//*  60  126:ifeq            261
				captureStartValues(transitionvalues);
	//   61  129:aload_0         
	//   62  130:aload           6
	//   63  132:invokevirtual   #411 <Method void captureStartValues(TransitionValues)>
			else
	//*  64  135:aload           6
	//*  65  137:getfield        #414 <Field ArrayList TransitionValues.mTargetedTransitions>
	//*  66  140:aload_0         
	//*  67  141:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//*  68  144:pop             
	//*  69  145:aload_0         
	//*  70  146:aload           6
	//*  71  148:invokevirtual   #417 <Method void capturePropagationValues(TransitionValues)>
	//*  72  151:iload_2         
	//*  73  152:ifeq            270
	//*  74  155:aload_0         
	//*  75  156:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//*  76  159:aload_1         
	//*  77  160:aload           6
	//*  78  162:invokestatic    #419 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
	//*  79  165:aload_1         
	//*  80  166:instanceof      #406 <Class ViewGroup>
	//*  81  169:ifeq            4
	//*  82  172:aload_0         
	//*  83  173:getfield        #171 <Field ArrayList mTargetIdChildExcludes>
	//*  84  176:ifnull          194
	//*  85  179:aload_0         
	//*  86  180:getfield        #171 <Field ArrayList mTargetIdChildExcludes>
	//*  87  183:iload           4
	//*  88  185:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//*  89  188:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  90  191:ifne            4
	//*  91  194:aload_0         
	//*  92  195:getfield        #173 <Field ArrayList mTargetChildExcludes>
	//*  93  198:ifnull          212
	//*  94  201:aload_0         
	//*  95  202:getfield        #173 <Field ArrayList mTargetChildExcludes>
	//*  96  205:aload_1         
	//*  97  206:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  98  209:ifne            4
	//*  99  212:aload_0         
	//* 100  213:getfield        #175 <Field ArrayList mTargetTypeChildExcludes>
	//* 101  216:ifnull          283
	//* 102  219:aload_0         
	//* 103  220:getfield        #175 <Field ArrayList mTargetTypeChildExcludes>
	//* 104  223:invokevirtual   #399 <Method int ArrayList.size()>
	//* 105  226:istore          4
	//* 106  228:iconst_0        
	//* 107  229:istore_3        
	//* 108  230:iload_3         
	//* 109  231:iload           4
	//* 110  233:icmpge          283
	//* 111  236:aload_0         
	//* 112  237:getfield        #175 <Field ArrayList mTargetTypeChildExcludes>
	//* 113  240:iload_3         
	//* 114  241:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//* 115  244:checkcast       #136 <Class Class>
	//* 116  247:aload_1         
	//* 117  248:invokevirtual   #404 <Method boolean Class.isInstance(Object)>
	//* 118  251:ifne            4
	//* 119  254:iload_3         
	//* 120  255:iconst_1        
	//* 121  256:iadd            
	//* 122  257:istore_3        
	//* 123  258:goto            230
				captureEndValues(transitionvalues);
	//  124  261:aload_0         
	//  125  262:aload           6
	//  126  264:invokevirtual   #422 <Method void captureEndValues(TransitionValues)>
			transitionvalues.mTargetedTransitions.add(((Object) (this)));
			capturePropagationValues(transitionvalues);
			if(flag)
				addViewValues(mStartValues, view, transitionvalues);
			else
	//* 127  267:goto            135
				addViewValues(mEndValues, view, transitionvalues);
	//  128  270:aload_0         
	//  129  271:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//  130  274:aload_1         
	//  131  275:aload           6
	//  132  277:invokestatic    #419 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
		}
		if(!(view instanceof ViewGroup) || mTargetIdChildExcludes != null && mTargetIdChildExcludes.contains(((Object) (Integer.valueOf(l)))) || mTargetChildExcludes != null && mTargetChildExcludes.contains(((Object) (view))))
			continue; /* Loop/switch isn't completed */
		if(mTargetTypeChildExcludes != null)
		{
			l = mTargetTypeChildExcludes.size();
			for(j = 0; j < l; j++)
				if(((Class)mTargetTypeChildExcludes.get(j)).isInstance(((Object) (view))))
					continue; /* Loop/switch isn't completed */

		}
	//* 133  280:goto            165
		view = ((View) ((ViewGroup)view));
	//  134  283:aload_1         
	//  135  284:checkcast       #406 <Class ViewGroup>
	//  136  287:astore_1        
		int k = 0;
	//  137  288:iconst_0        
	//  138  289:istore_3        
		while(k < ((ViewGroup) (view)).getChildCount()) 
	//* 139  290:iload_3         
	//* 140  291:aload_1         
	//* 141  292:invokevirtual   #425 <Method int ViewGroup.getChildCount()>
	//* 142  295:icmpge          4
		{
			captureHierarchy(((ViewGroup) (view)).getChildAt(k), flag);
	//  143  298:aload_0         
	//  144  299:aload_1         
	//  145  300:iload_3         
	//  146  301:invokevirtual   #429 <Method View ViewGroup.getChildAt(int)>
	//  147  304:iload_2         
	//  148  305:invokespecial   #431 <Method void captureHierarchy(View, boolean)>
			k++;
	//  149  308:iload_3         
	//  150  309:iconst_1        
	//  151  310:iadd            
	//  152  311:istore_3        
		}
		if(true) goto _L1; else goto _L3
	//  153  312:goto            290
_L3:
	}

	private ArrayList excludeId(ArrayList arraylist, int i, boolean flag)
	{
label0:
		{
			ArrayList arraylist1 = arraylist;
	//    0    0:aload_1         
	//    1    1:astore          4
			if(i > 0)
	//*   2    3:iload_2         
	//*   3    4:ifle            21
			{
				if(!flag)
					break label0;
	//    4    7:iload_3         
	//    5    8:ifeq            24
				arraylist1 = ArrayListManager.add(arraylist, ((Object) (Integer.valueOf(i))));
	//    6   11:aload_1         
	//    7   12:iload_2         
	//    8   13:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//    9   16:invokestatic    #436 <Method ArrayList Transition$ArrayListManager.add(ArrayList, Object)>
	//   10   19:astore          4
			}
			return arraylist1;
	//   11   21:aload           4
	//   12   23:areturn         
		}
		return ArrayListManager.remove(arraylist, ((Object) (Integer.valueOf(i))));
	//   13   24:aload_1         
	//   14   25:iload_2         
	//   15   26:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//   16   29:invokestatic    #439 <Method ArrayList Transition$ArrayListManager.remove(ArrayList, Object)>
	//   17   32:areturn         
	}

	private static ArrayList excludeObject(ArrayList arraylist, Object obj, boolean flag)
	{
label0:
		{
			ArrayList arraylist1 = arraylist;
	//    0    0:aload_0         
	//    1    1:astore_3        
			if(obj != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          16
			{
				if(!flag)
					break label0;
	//    4    6:iload_2         
	//    5    7:ifeq            18
				arraylist1 = ArrayListManager.add(arraylist, obj);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #436 <Method ArrayList Transition$ArrayListManager.add(ArrayList, Object)>
	//    9   15:astore_3        
			}
			return arraylist1;
	//   10   16:aload_3         
	//   11   17:areturn         
		}
		return ArrayListManager.remove(arraylist, obj);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokestatic    #439 <Method ArrayList Transition$ArrayListManager.remove(ArrayList, Object)>
	//   15   23:areturn         
	}

	private ArrayList excludeType(ArrayList arraylist, Class class1, boolean flag)
	{
label0:
		{
			ArrayList arraylist1 = arraylist;
	//    0    0:aload_1         
	//    1    1:astore          4
			if(class1 != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          18
			{
				if(!flag)
					break label0;
	//    4    7:iload_3         
	//    5    8:ifeq            21
				arraylist1 = ArrayListManager.add(arraylist, ((Object) (class1)));
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokestatic    #436 <Method ArrayList Transition$ArrayListManager.add(ArrayList, Object)>
	//    9   16:astore          4
			}
			return arraylist1;
	//   10   18:aload           4
	//   11   20:areturn         
		}
		return ArrayListManager.remove(arraylist, ((Object) (class1)));
	//   12   21:aload_1         
	//   13   22:aload_2         
	//   14   23:invokestatic    #439 <Method ArrayList Transition$ArrayListManager.remove(ArrayList, Object)>
	//   15   26:areturn         
	}

	private ArrayList excludeView(ArrayList arraylist, View view, boolean flag)
	{
label0:
		{
			ArrayList arraylist1 = arraylist;
	//    0    0:aload_1         
	//    1    1:astore          4
			if(view != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          18
			{
				if(!flag)
					break label0;
	//    4    7:iload_3         
	//    5    8:ifeq            21
				arraylist1 = ArrayListManager.add(arraylist, ((Object) (view)));
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokestatic    #436 <Method ArrayList Transition$ArrayListManager.add(ArrayList, Object)>
	//    9   16:astore          4
			}
			return arraylist1;
	//   10   18:aload           4
	//   11   20:areturn         
		}
		return ArrayListManager.remove(arraylist, ((Object) (view)));
	//   12   21:aload_1         
	//   13   22:aload_2         
	//   14   23:invokestatic    #439 <Method ArrayList Transition$ArrayListManager.remove(ArrayList, Object)>
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
		if(transitionvalues == null && transitionvalues1 == null)
	//*  10   22:aload_0         
	//*  11   23:ifnonnull       32
	//*  12   26:aload_1         
	//*  13   27:ifnonnull       32
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		if(transitionvalues == null || transitionvalues1 == null)
	//*  16   32:aload_0         
	//*  17   33:ifnull          40
	//*  18   36:aload_1         
	//*  19   37:ifnonnull       42
			return true;
	//   20   40:iconst_1        
	//   21   41:ireturn         
		return !((Object) (transitionvalues)).equals(((Object) (transitionvalues1)));
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #476 <Method boolean Object.equals(Object)>
	//   25   47:ifne            52
	//   26   50:iconst_1        
	//   27   51:ireturn         
	//   28   52:iconst_0        
	//   29   53:ireturn         
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
		int i;
		ArrayMap arraymap;
		ArrayMap arraymap1;
		arraymap = new ArrayMap(((android.support.v4.util.SimpleArrayMap) (transitionvaluesmaps.mViewValues)));
	//    0    0:new             #275 <Class ArrayMap>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//    4    8:invokespecial   #509 <Method void ArrayMap(android.support.v4.util.SimpleArrayMap)>
	//    5   11:astore          4
		arraymap1 = new ArrayMap(((android.support.v4.util.SimpleArrayMap) (transitionvaluesmaps1.mViewValues)));
	//    6   13:new             #275 <Class ArrayMap>
	//    7   16:dup             
	//    8   17:aload_2         
	//    9   18:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//   10   21:invokespecial   #509 <Method void ArrayMap(android.support.v4.util.SimpleArrayMap)>
	//   11   24:astore          5
		i = 0;
	//   12   26:iconst_0        
	//   13   27:istore_3        
_L7:
		if(i >= mMatchOrder.length)
			break MISSING_BLOCK_LABEL_147;
	//   14   28:iload_3         
	//   15   29:aload_0         
	//   16   30:getfield        #186 <Field int[] mMatchOrder>
	//   17   33:arraylength     
	//   18   34:icmpge          147
		mMatchOrder[i];
	//   19   37:aload_0         
	//   20   38:getfield        #186 <Field int[] mMatchOrder>
	//   21   41:iload_3         
	//   22   42:iaload          
		JVM INSTR tableswitch 1 4: default 72
	//	               1 79
	//	               2 90
	//	               3 109
	//	               4 128;
	//   23   43:tableswitch     1 4: default 72
	//	               1 79
	//	               2 90
	//	               3 109
	//	               4 128
		   goto _L1 _L2 _L3 _L4 _L5
_L5:
		break MISSING_BLOCK_LABEL_128;
_L1:
		break; /* Loop/switch isn't completed */
_L2:
		break; /* Loop/switch isn't completed */
_L8:
		i++;
	//   24   72:iload_3         
	//   25   73:iconst_1        
	//   26   74:iadd            
	//   27   75:istore_3        
		if(true) goto _L7; else goto _L6
	//   28   76:goto            28
_L6:
		matchInstances(arraymap, arraymap1);
	//   29   79:aload_0         
	//   30   80:aload           4
	//   31   82:aload           5
	//   32   84:invokespecial   #511 <Method void matchInstances(ArrayMap, ArrayMap)>
		  goto _L8
	//*  33   87:goto            72
_L3:
		matchNames(arraymap, arraymap1, transitionvaluesmaps.mNameValues, transitionvaluesmaps1.mNameValues);
	//   34   90:aload_0         
	//   35   91:aload           4
	//   36   93:aload           5
	//   37   95:aload_1         
	//   38   96:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//   39   99:aload_2         
	//   40  100:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//   41  103:invokespecial   #513 <Method void matchNames(ArrayMap, ArrayMap, ArrayMap, ArrayMap)>
		  goto _L8
	//*  42  106:goto            72
_L4:
		matchIds(arraymap, arraymap1, transitionvaluesmaps.mIdValues, transitionvaluesmaps1.mIdValues);
	//   43  109:aload_0         
	//   44  110:aload           4
	//   45  112:aload           5
	//   46  114:aload_1         
	//   47  115:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//   48  118:aload_2         
	//   49  119:getfield        #321 <Field SparseArray TransitionValuesMaps.mIdValues>
	//   50  122:invokespecial   #515 <Method void matchIds(ArrayMap, ArrayMap, SparseArray, SparseArray)>
		  goto _L8
	//*  51  125:goto            72
		matchItemIds(arraymap, arraymap1, transitionvaluesmaps.mItemIdValues, transitionvaluesmaps1.mItemIdValues);
	//   52  128:aload_0         
	//   53  129:aload           4
	//   54  131:aload           5
	//   55  133:aload_1         
	//   56  134:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   57  137:aload_2         
	//   58  138:getfield        #370 <Field LongSparseArray TransitionValuesMaps.mItemIdValues>
	//   59  141:invokespecial   #517 <Method void matchItemIds(ArrayMap, ArrayMap, LongSparseArray, LongSparseArray)>
		  goto _L8
	//*  60  144:goto            72
		addUnmatched(arraymap, arraymap1);
	//   61  147:aload_0         
	//   62  148:aload           4
	//   63  150:aload           5
	//   64  152:invokespecial   #519 <Method void addUnmatched(ArrayMap, ArrayMap)>
		return;
	//   65  155:return          
	}

	private static int[] parseMatchOrder(String s)
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
		while(stringtokenizer.hasMoreTokens()) 
	//*  12   21:aload_3         
	//*  13   22:invokevirtual   #532 <Method boolean StringTokenizer.hasMoreTokens()>
	//*  14   25:ifeq            169
		{
			Object obj = ((Object) (stringtokenizer.nextToken().trim()));
	//   15   28:aload_3         
	//   16   29:invokevirtual   #535 <Method String StringTokenizer.nextToken()>
	//   17   32:invokevirtual   #540 <Method String String.trim()>
	//   18   35:astore_2        
			if("id".equalsIgnoreCase(((String) (obj))))
	//*  19   36:ldc1            #44  <String "id">
	//*  20   38:aload_2         
	//*  21   39:invokevirtual   #544 <Method boolean String.equalsIgnoreCase(String)>
	//*  22   42:ifeq            56
				s[i] = 3;
	//   23   45:aload_0         
	//   24   46:iload_1         
	//   25   47:iconst_3        
	//   26   48:iastore         
			else
	//*  27   49:iload_1         
	//*  28   50:iconst_1        
	//*  29   51:iadd            
	//*  30   52:istore_1        
	//*  31   53:goto            21
			if("instance".equalsIgnoreCase(((String) (obj))))
	//*  32   56:ldc1            #48  <String "instance">
	//*  33   58:aload_2         
	//*  34   59:invokevirtual   #544 <Method boolean String.equalsIgnoreCase(String)>
	//*  35   62:ifeq            72
				s[i] = 1;
	//   36   65:aload_0         
	//   37   66:iload_1         
	//   38   67:iconst_1        
	//   39   68:iastore         
			else
	//*  40   69:goto            49
			if("name".equalsIgnoreCase(((String) (obj))))
	//*  41   72:ldc1            #59  <String "name">
	//*  42   74:aload_2         
	//*  43   75:invokevirtual   #544 <Method boolean String.equalsIgnoreCase(String)>
	//*  44   78:ifeq            88
				s[i] = 2;
	//   45   81:aload_0         
	//   46   82:iload_1         
	//   47   83:iconst_2        
	//   48   84:iastore         
			else
	//*  49   85:goto            49
			if("itemId".equalsIgnoreCase(((String) (obj))))
	//*  50   88:ldc1            #53  <String "itemId">
	//*  51   90:aload_2         
	//*  52   91:invokevirtual   #544 <Method boolean String.equalsIgnoreCase(String)>
	//*  53   94:ifeq            104
				s[i] = 4;
	//   54   97:aload_0         
	//   55   98:iload_1         
	//   56   99:iconst_4        
	//   57  100:iastore         
			else
	//*  58  101:goto            49
			if(((String) (obj)).isEmpty())
	//*  59  104:aload_2         
	//*  60  105:invokevirtual   #547 <Method boolean String.isEmpty()>
	//*  61  108:ifeq            135
			{
				obj = ((Object) (new int[s.length - 1]));
	//   62  111:aload_0         
	//   63  112:arraylength     
	//   64  113:iconst_1        
	//   65  114:isub            
	//   66  115:newarray        int[]
	//   67  117:astore_2        
				System.arraycopy(((Object) (s)), 0, obj, 0, i);
	//   68  118:aload_0         
	//   69  119:iconst_0        
	//   70  120:aload_2         
	//   71  121:iconst_0        
	//   72  122:iload_1         
	//   73  123:invokestatic    #553 <Method void System.arraycopy(Object, int, Object, int, int)>
				s = ((String) (obj));
	//   74  126:aload_2         
	//   75  127:astore_0        
				i--;
	//   76  128:iload_1         
	//   77  129:iconst_1        
	//   78  130:isub            
	//   79  131:istore_1        
			} else
	//*  80  132:goto            49
			{
				throw new InflateException((new StringBuilder()).append("Unknown match type in matchOrder: '").append(((String) (obj))).append("'").toString());
	//   81  135:new             #555 <Class InflateException>
	//   82  138:dup             
	//   83  139:new             #557 <Class StringBuilder>
	//   84  142:dup             
	//   85  143:invokespecial   #558 <Method void StringBuilder()>
	//   86  146:ldc2            #560 <String "Unknown match type in matchOrder: '">
	//   87  149:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   88  152:aload_2         
	//   89  153:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   90  156:ldc2            #566 <String "'">
	//   91  159:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   92  162:invokevirtual   #569 <Method String StringBuilder.toString()>
	//   93  165:invokespecial   #572 <Method void InflateException(String)>
	//   94  168:athrow          
			}
			i++;
		}
		return ((int []) (s));
	//   95  169:aload_0         
	//   96  170:areturn         
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
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            16
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
		if(mPropagation == null || transitionvalues.values.isEmpty()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #642 <Field TransitionPropagation mPropagation>
	//    2    4:ifnull          33
	//    3    7:aload_1         
	//    4    8:getfield        #468 <Field Map TransitionValues.values>
	//    5   11:invokeinterface #643 <Method boolean Map.isEmpty()>
	//    6   16:ifne            33
_L1:
		String as[] = mPropagation.getPropagationProperties();
	//    7   19:aload_0         
	//    8   20:getfield        #642 <Field TransitionPropagation mPropagation>
	//    9   23:invokevirtual   #649 <Method String[] TransitionPropagation.getPropagationProperties()>
	//   10   26:astore          5
		if(as != null) goto _L3; else goto _L2
	//   11   28:aload           5
	//   12   30:ifnonnull       34
_L2:
		return;
	//   13   33:return          
_L3:
		int i;
		boolean flag1;
		flag1 = true;
	//   14   34:iconst_1        
	//   15   35:istore          4
		i = 0;
	//   16   37:iconst_0        
	//   17   38:istore_2        
_L5:
		boolean flag;
		flag = flag1;
	//   18   39:iload           4
	//   19   41:istore_3        
		if(i >= as.length)
			continue; /* Loop/switch isn't completed */
	//   20   42:iload_2         
	//   21   43:aload           5
	//   22   45:arraylength     
	//   23   46:icmpge          67
		if(transitionvalues.values.containsKey(((Object) (as[i]))))
			break MISSING_BLOCK_LABEL_80;
	//   24   49:aload_1         
	//   25   50:getfield        #468 <Field Map TransitionValues.values>
	//   26   53:aload           5
	//   27   55:iload_2         
	//   28   56:aaload          
	//   29   57:invokeinterface #650 <Method boolean Map.containsKey(Object)>
	//   30   62:ifne            80
		flag = false;
	//   31   65:iconst_0        
	//   32   66:istore_3        
		if(flag) goto _L2; else goto _L4
	//   33   67:iload_3         
	//   34   68:ifne            33
_L4:
		mPropagation.captureValues(transitionvalues);
	//   35   71:aload_0         
	//   36   72:getfield        #642 <Field TransitionPropagation mPropagation>
	//   37   75:aload_1         
	//   38   76:invokevirtual   #653 <Method void TransitionPropagation.captureValues(TransitionValues)>
		return;
	//   39   79:return          
		i++;
	//   40   80:iload_2         
	//   41   81:iconst_1        
	//   42   82:iadd            
	//   43   83:istore_2        
		  goto _L5
	//*  44   84:goto            39
	}

	public abstract void captureStartValues(TransitionValues transitionvalues);

	void captureValues(ViewGroup viewgroup, boolean flag)
	{
		clearValues(flag);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #658 <Method void clearValues(boolean)>
		if((mTargetIds.size() > 0 || mTargets.size() > 0) && (mTargetNames == null || mTargetNames.isEmpty()) && (mTargetTypes == null || mTargetTypes.isEmpty()))
	//*   3    5:aload_0         
	//*   4    6:getfield        #155 <Field ArrayList mTargetIds>
	//*   5    9:invokevirtual   #399 <Method int ArrayList.size()>
	//*   6   12:ifgt            25
	//*   7   15:aload_0         
	//*   8   16:getfield        #157 <Field ArrayList mTargets>
	//*   9   19:invokevirtual   #399 <Method int ArrayList.size()>
	//*  10   22:ifle            293
	//*  11   25:aload_0         
	//*  12   26:getfield        #159 <Field ArrayList mTargetNames>
	//*  13   29:ifnull          42
	//*  14   32:aload_0         
	//*  15   33:getfield        #159 <Field ArrayList mTargetNames>
	//*  16   36:invokevirtual   #659 <Method boolean ArrayList.isEmpty()>
	//*  17   39:ifeq            293
	//*  18   42:aload_0         
	//*  19   43:getfield        #161 <Field ArrayList mTargetTypes>
	//*  20   46:ifnull          59
	//*  21   49:aload_0         
	//*  22   50:getfield        #161 <Field ArrayList mTargetTypes>
	//*  23   53:invokevirtual   #659 <Method boolean ArrayList.isEmpty()>
	//*  24   56:ifeq            293
		{
			int i = 0;
	//   25   59:iconst_0        
	//   26   60:istore_3        
			while(i < mTargetIds.size()) 
	//*  27   61:iload_3         
	//*  28   62:aload_0         
	//*  29   63:getfield        #155 <Field ArrayList mTargetIds>
	//*  30   66:invokevirtual   #399 <Method int ArrayList.size()>
	//*  31   69:icmpge          184
			{
				View view = viewgroup.findViewById(((Integer)mTargetIds.get(i)).intValue());
	//   32   72:aload_1         
	//   33   73:aload_0         
	//   34   74:getfield        #155 <Field ArrayList mTargetIds>
	//   35   77:iload_3         
	//   36   78:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   37   81:checkcast       #391 <Class Integer>
	//   38   84:invokevirtual   #662 <Method int Integer.intValue()>
	//   39   87:invokevirtual   #665 <Method View ViewGroup.findViewById(int)>
	//   40   90:astore          5
				if(view != null)
	//*  41   92:aload           5
	//*  42   94:ifnull          154
				{
					TransitionValues transitionvalues1 = new TransitionValues();
	//   43   97:new             #285 <Class TransitionValues>
	//   44  100:dup             
	//   45  101:invokespecial   #407 <Method void TransitionValues()>
	//   46  104:astore          6
					transitionvalues1.view = view;
	//   47  106:aload           6
	//   48  108:aload           5
	//   49  110:putfield        #289 <Field View TransitionValues.view>
					if(flag)
	//*  50  113:iload_2         
	//*  51  114:ifeq            161
						captureStartValues(transitionvalues1);
	//   52  117:aload_0         
	//   53  118:aload           6
	//   54  120:invokevirtual   #411 <Method void captureStartValues(TransitionValues)>
					else
	//*  55  123:aload           6
	//*  56  125:getfield        #414 <Field ArrayList TransitionValues.mTargetedTransitions>
	//*  57  128:aload_0         
	//*  58  129:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//*  59  132:pop             
	//*  60  133:aload_0         
	//*  61  134:aload           6
	//*  62  136:invokevirtual   #417 <Method void capturePropagationValues(TransitionValues)>
	//*  63  139:iload_2         
	//*  64  140:ifeq            170
	//*  65  143:aload_0         
	//*  66  144:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//*  67  147:aload           5
	//*  68  149:aload           6
	//*  69  151:invokestatic    #419 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
	//*  70  154:iload_3         
	//*  71  155:iconst_1        
	//*  72  156:iadd            
	//*  73  157:istore_3        
	//*  74  158:goto            61
						captureEndValues(transitionvalues1);
	//   75  161:aload_0         
	//   76  162:aload           6
	//   77  164:invokevirtual   #422 <Method void captureEndValues(TransitionValues)>
					transitionvalues1.mTargetedTransitions.add(((Object) (this)));
					capturePropagationValues(transitionvalues1);
					if(flag)
						addViewValues(mStartValues, view, transitionvalues1);
					else
	//*  78  167:goto            123
						addViewValues(mEndValues, view, transitionvalues1);
	//   79  170:aload_0         
	//   80  171:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//   81  174:aload           5
	//   82  176:aload           6
	//   83  178:invokestatic    #419 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
				}
				i++;
			}
	//*  84  181:goto            154
			i = 0;
	//   85  184:iconst_0        
	//   86  185:istore_3        
			while(i < mTargets.size()) 
	//*  87  186:iload_3         
	//*  88  187:aload_0         
	//*  89  188:getfield        #157 <Field ArrayList mTargets>
	//*  90  191:invokevirtual   #399 <Method int ArrayList.size()>
	//*  91  194:icmpge          299
			{
				viewgroup = ((ViewGroup) ((View)mTargets.get(i)));
	//   92  197:aload_0         
	//   93  198:getfield        #157 <Field ArrayList mTargets>
	//   94  201:iload_3         
	//   95  202:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   96  205:checkcast       #314 <Class View>
	//   97  208:astore_1        
				TransitionValues transitionvalues = new TransitionValues();
	//   98  209:new             #285 <Class TransitionValues>
	//   99  212:dup             
	//  100  213:invokespecial   #407 <Method void TransitionValues()>
	//  101  216:astore          5
				transitionvalues.view = ((View) (viewgroup));
	//  102  218:aload           5
	//  103  220:aload_1         
	//  104  221:putfield        #289 <Field View TransitionValues.view>
				if(flag)
	//* 105  224:iload_2         
	//* 106  225:ifeq            271
					captureStartValues(transitionvalues);
	//  107  228:aload_0         
	//  108  229:aload           5
	//  109  231:invokevirtual   #411 <Method void captureStartValues(TransitionValues)>
				else
	//* 110  234:aload           5
	//* 111  236:getfield        #414 <Field ArrayList TransitionValues.mTargetedTransitions>
	//* 112  239:aload_0         
	//* 113  240:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//* 114  243:pop             
	//* 115  244:aload_0         
	//* 116  245:aload           5
	//* 117  247:invokevirtual   #417 <Method void capturePropagationValues(TransitionValues)>
	//* 118  250:iload_2         
	//* 119  251:ifeq            280
	//* 120  254:aload_0         
	//* 121  255:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//* 122  258:aload_1         
	//* 123  259:aload           5
	//* 124  261:invokestatic    #419 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
	//* 125  264:iload_3         
	//* 126  265:iconst_1        
	//* 127  266:iadd            
	//* 128  267:istore_3        
	//* 129  268:goto            186
					captureEndValues(transitionvalues);
	//  130  271:aload_0         
	//  131  272:aload           5
	//  132  274:invokevirtual   #422 <Method void captureEndValues(TransitionValues)>
				transitionvalues.mTargetedTransitions.add(((Object) (this)));
				capturePropagationValues(transitionvalues);
				if(flag)
					addViewValues(mStartValues, ((View) (viewgroup)), transitionvalues);
				else
	//* 133  277:goto            234
					addViewValues(mEndValues, ((View) (viewgroup)), transitionvalues);
	//  134  280:aload_0         
	//  135  281:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//  136  284:aload_1         
	//  137  285:aload           5
	//  138  287:invokestatic    #419 <Method void addViewValues(TransitionValuesMaps, View, TransitionValues)>
				i++;
			}
		} else
	//* 139  290:goto            264
		{
			captureHierarchy(((View) (viewgroup)), flag);
	//  140  293:aload_0         
	//  141  294:aload_1         
	//  142  295:iload_2         
	//  143  296:invokespecial   #431 <Method void captureHierarchy(View, boolean)>
		}
		if(!flag && mNameOverrides != null)
	//* 144  299:iload_2         
	//* 145  300:ifne            432
	//* 146  303:aload_0         
	//* 147  304:getfield        #667 <Field ArrayMap mNameOverrides>
	//* 148  307:ifnull          432
		{
			int l = mNameOverrides.size();
	//  149  310:aload_0         
	//  150  311:getfield        #667 <Field ArrayMap mNameOverrides>
	//  151  314:invokevirtual   #279 <Method int ArrayMap.size()>
	//  152  317:istore          4
			viewgroup = ((ViewGroup) (new ArrayList(l)));
	//  153  319:new             #152 <Class ArrayList>
	//  154  322:dup             
	//  155  323:iload           4
	//  156  325:invokespecial   #670 <Method void ArrayList(int)>
	//  157  328:astore_1        
			for(int j = 0; j < l; j++)
	//* 158  329:iconst_0        
	//* 159  330:istore_3        
	//* 160  331:iload_3         
	//* 161  332:iload           4
	//* 162  334:icmpge          374
			{
				String s = (String)mNameOverrides.keyAt(j);
	//  163  337:aload_0         
	//  164  338:getfield        #667 <Field ArrayMap mNameOverrides>
	//  165  341:iload_3         
	//  166  342:invokevirtual   #491 <Method Object ArrayMap.keyAt(int)>
	//  167  345:checkcast       #537 <Class String>
	//  168  348:astore          5
				((ArrayList) (viewgroup)).add(mStartValues.mNameValues.remove(((Object) (s))));
	//  169  350:aload_1         
	//  170  351:aload_0         
	//  171  352:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//  172  355:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//  173  358:aload           5
	//  174  360:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//  175  363:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//  176  366:pop             
			}

	//  177  367:iload_3         
	//  178  368:iconst_1        
	//  179  369:iadd            
	//  180  370:istore_3        
	//* 181  371:goto            331
			for(int k = 0; k < l; k++)
	//* 182  374:iconst_0        
	//* 183  375:istore_3        
	//* 184  376:iload_3         
	//* 185  377:iload           4
	//* 186  379:icmpge          432
			{
				View view1 = (View)((ArrayList) (viewgroup)).get(k);
	//  187  382:aload_1         
	//  188  383:iload_3         
	//  189  384:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//  190  387:checkcast       #314 <Class View>
	//  191  390:astore          5
				if(view1 != null)
	//* 192  392:aload           5
	//* 193  394:ifnull          425
				{
					String s1 = (String)mNameOverrides.valueAt(k);
	//  194  397:aload_0         
	//  195  398:getfield        #667 <Field ArrayMap mNameOverrides>
	//  196  401:iload_3         
	//  197  402:invokevirtual   #283 <Method Object ArrayMap.valueAt(int)>
	//  198  405:checkcast       #537 <Class String>
	//  199  408:astore          6
					mStartValues.mNameValues.put(((Object) (s1)), ((Object) (view1)));
	//  200  410:aload_0         
	//  201  411:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//  202  414:getfield        #339 <Field ArrayMap TransitionValuesMaps.mNameValues>
	//  203  417:aload           6
	//  204  419:aload           5
	//  205  421:invokevirtual   #312 <Method Object ArrayMap.put(Object, Object)>
	//  206  424:pop             
				}
			}

	//  207  425:iload_3         
	//  208  426:iconst_1        
	//  209  427:iadd            
	//  210  428:istore_3        
		}
	//* 211  429:goto            376
	//  212  432:return          
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
		int j1;
		long l1;
		SparseIntArray sparseintarray;
		ArrayMap arraymap;
		arraymap = getRunningAnimators();
	//    0    0:invokestatic    #689 <Method ArrayMap getRunningAnimators()>
	//    1    3:astore          22
		l1 = 0xffffffffL;
	//    2    5:ldc2w           #690 <Long 0xffffffffL>
	//    3    8:lstore          10
		sparseintarray = new SparseIntArray();
	//    4   10:new             #693 <Class SparseIntArray>
	//    5   13:dup             
	//    6   14:invokespecial   #694 <Method void SparseIntArray()>
	//    7   17:astore          21
		j1 = arraylist.size();
	//    8   19:aload           4
	//    9   21:invokevirtual   #399 <Method int ArrayList.size()>
	//   10   24:istore          8
		i = 0;
	//   11   26:iconst_0        
	//   12   27:istore          6
_L2:
		long l2;
		TransitionValues transitionvalues;
		if(i >= j1)
			break MISSING_BLOCK_LABEL_585;
	//   13   29:iload           6
	//   14   31:iload           8
	//   15   33:icmpge          585
		transitionvalues = (TransitionValues)arraylist.get(i);
	//   16   36:aload           4
	//   17   38:iload           6
	//   18   40:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   19   43:checkcast       #285 <Class TransitionValues>
	//   20   46:astore          14
		TransitionValues transitionvalues1 = (TransitionValues)arraylist1.get(i);
	//   21   48:aload           5
	//   22   50:iload           6
	//   23   52:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   24   55:checkcast       #285 <Class TransitionValues>
	//   25   58:astore          15
		transitionvaluesmaps = ((TransitionValuesMaps) (transitionvalues));
	//   26   60:aload           14
	//   27   62:astore_2        
		if(transitionvalues != null)
	//*  28   63:aload           14
	//*  29   65:ifnull          85
		{
			transitionvaluesmaps = ((TransitionValuesMaps) (transitionvalues));
	//   30   68:aload           14
	//   31   70:astore_2        
			if(!transitionvalues.mTargetedTransitions.contains(((Object) (this))))
	//*  32   71:aload           14
	//*  33   73:getfield        #414 <Field ArrayList TransitionValues.mTargetedTransitions>
	//*  34   76:aload_0         
	//*  35   77:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  36   80:ifne            85
				transitionvaluesmaps = null;
	//   37   83:aconst_null     
	//   38   84:astore_2        
		}
		transitionvalues = transitionvalues1;
	//   39   85:aload           15
	//   40   87:astore          14
		if(transitionvalues1 != null)
	//*  41   89:aload           15
	//*  42   91:ifnull          113
		{
			transitionvalues = transitionvalues1;
	//   43   94:aload           15
	//   44   96:astore          14
			if(!transitionvalues1.mTargetedTransitions.contains(((Object) (this))))
	//*  45   98:aload           15
	//*  46  100:getfield        #414 <Field ArrayList TransitionValues.mTargetedTransitions>
	//*  47  103:aload_0         
	//*  48  104:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  49  107:ifne            113
				transitionvalues = null;
	//   50  110:aconst_null     
	//   51  111:astore          14
		}
		if(transitionvaluesmaps != null || transitionvalues != null)
			break; /* Loop/switch isn't completed */
	//   52  113:aload_2         
	//   53  114:ifnonnull       139
	//   54  117:aload           14
	//   55  119:ifnonnull       139
		l2 = l1;
	//   56  122:lload           10
	//   57  124:lstore          12
_L4:
		i++;
	//   58  126:iload           6
	//   59  128:iconst_1        
	//   60  129:iadd            
	//   61  130:istore          6
		l1 = l2;
	//   62  132:lload           12
	//   63  134:lstore          10
		if(true) goto _L2; else goto _L1
	//   64  136:goto            29
_L1:
		Object obj;
		TransitionValues transitionvalues2;
		Animator animator;
		Animator animator1;
		View view;
		TransitionValues transitionvalues3;
		int k;
		String as[];
		if(transitionvaluesmaps == null || transitionvalues == null || isTransitionRequired(((TransitionValues) (transitionvaluesmaps)), transitionvalues))
	//*  65  139:aload_2         
	//*  66  140:ifnull          158
	//*  67  143:aload           14
	//*  68  145:ifnull          158
	//*  69  148:aload_0         
	//*  70  149:aload_2         
	//*  71  150:aload           14
	//*  72  152:invokevirtual   #698 <Method boolean isTransitionRequired(TransitionValues, TransitionValues)>
	//*  73  155:ifeq            348
			k = 1;
	//   74  158:iconst_1        
	//   75  159:istore          7
		else
	//*  76  161:lload           10
	//*  77  163:lstore          12
	//*  78  165:iload           7
	//*  79  167:ifeq            126
	//*  80  170:aload_0         
	//*  81  171:aload_1         
	//*  82  172:aload_2         
	//*  83  173:aload           14
	//*  84  175:invokevirtual   #700 <Method Animator createAnimator(ViewGroup, TransitionValues, TransitionValues)>
	//*  85  178:astore          18
	//*  86  180:lload           10
	//*  87  182:lstore          12
	//*  88  184:aload           18
	//*  89  186:ifnull          126
	//*  90  189:aconst_null     
	//*  91  190:astore          20
	//*  92  192:aload           14
	//*  93  194:ifnull          568
	//*  94  197:aload           14
	//*  95  199:getfield        #289 <Field View TransitionValues.view>
	//*  96  202:astore          19
	//*  97  204:aload_0         
	//*  98  205:invokevirtual   #703 <Method String[] getTransitionProperties()>
	//*  99  208:astore          23
	//* 100  210:aload           19
	//* 101  212:astore          15
	//* 102  214:aload           20
	//* 103  216:astore          16
	//* 104  218:aload           18
	//* 105  220:astore          17
	//* 106  222:aload           19
	//* 107  224:ifnull          460
	//* 108  227:aload           19
	//* 109  229:astore          15
	//* 110  231:aload           20
	//* 111  233:astore          16
	//* 112  235:aload           18
	//* 113  237:astore          17
	//* 114  239:aload           23
	//* 115  241:ifnull          460
	//* 116  244:aload           19
	//* 117  246:astore          15
	//* 118  248:aload           20
	//* 119  250:astore          16
	//* 120  252:aload           18
	//* 121  254:astore          17
	//* 122  256:aload           23
	//* 123  258:arraylength     
	//* 124  259:ifle            460
	//* 125  262:new             #285 <Class TransitionValues>
	//* 126  265:dup             
	//* 127  266:invokespecial   #407 <Method void TransitionValues()>
	//* 128  269:astore          20
	//* 129  271:aload           20
	//* 130  273:aload           19
	//* 131  275:putfield        #289 <Field View TransitionValues.view>
	//* 132  278:aload_3         
	//* 133  279:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//* 134  282:aload           19
	//* 135  284:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//* 136  287:checkcast       #285 <Class TransitionValues>
	//* 137  290:astore          15
	//* 138  292:aload           15
	//* 139  294:ifnull          354
	//* 140  297:iconst_0        
	//* 141  298:istore          7
	//* 142  300:iload           7
	//* 143  302:aload           23
	//* 144  304:arraylength     
	//* 145  305:icmpge          354
	//* 146  308:aload           20
	//* 147  310:getfield        #468 <Field Map TransitionValues.values>
	//* 148  313:aload           23
	//* 149  315:iload           7
	//* 150  317:aaload          
	//* 151  318:aload           15
	//* 152  320:getfield        #468 <Field Map TransitionValues.values>
	//* 153  323:aload           23
	//* 154  325:iload           7
	//* 155  327:aaload          
	//* 156  328:invokeinterface #473 <Method Object Map.get(Object)>
	//* 157  333:invokeinterface #704 <Method Object Map.put(Object, Object)>
	//* 158  338:pop             
	//* 159  339:iload           7
	//* 160  341:iconst_1        
	//* 161  342:iadd            
	//* 162  343:istore          7
	//* 163  345:goto            300
			k = 0;
	//  164  348:iconst_0        
	//  165  349:istore          7
		l2 = l1;
		if(k == 0) goto _L4; else goto _L3
_L3:
		animator1 = createAnimator(viewgroup, ((TransitionValues) (transitionvaluesmaps)), transitionvalues);
		l2 = l1;
		if(animator1 == null) goto _L4; else goto _L5
_L5:
		transitionvalues3 = null;
		if(transitionvalues == null)
			break MISSING_BLOCK_LABEL_568;
		view = transitionvalues.view;
		as = getTransitionProperties();
		obj = ((Object) (view));
		transitionvalues2 = transitionvalues3;
		animator = animator1;
		if(view == null) goto _L7; else goto _L6
_L6:
		obj = ((Object) (view));
		transitionvalues2 = transitionvalues3;
		animator = animator1;
		if(as == null) goto _L7; else goto _L8
_L8:
		obj = ((Object) (view));
		transitionvalues2 = transitionvalues3;
		animator = animator1;
		if(as.length <= 0) goto _L7; else goto _L9
_L9:
		int l;
		int k1;
		transitionvalues3 = new TransitionValues();
		transitionvalues3.view = view;
		obj = ((Object) ((TransitionValues)transitionvaluesmaps1.mViewValues.get(((Object) (view)))));
		if(obj != null)
			for(k = 0; k < as.length; k++)
				transitionvalues3.values.put(((Object) (as[k])), ((TransitionValues) (obj)).values.get(((Object) (as[k]))));

	//* 166  351:goto            161
		k1 = arraymap.size();
	//  167  354:aload           22
	//  168  356:invokevirtual   #279 <Method int ArrayMap.size()>
	//  169  359:istore          9
		l = 0;
	//  170  361:iconst_0        
	//  171  362:istore          7
_L13:
		obj = ((Object) (view));
	//  172  364:aload           19
	//  173  366:astore          15
		transitionvalues2 = transitionvalues3;
	//  174  368:aload           20
	//  175  370:astore          16
		animator = animator1;
	//  176  372:aload           18
	//  177  374:astore          17
		if(l >= k1) goto _L7; else goto _L10
	//  178  376:iload           7
	//  179  378:iload           9
	//  180  380:icmpge          460
_L10:
		obj = ((Object) ((AnimationInfo)arraymap.get(((Object) ((Animator)arraymap.keyAt(l))))));
	//  181  383:aload           22
	//  182  385:aload           22
	//  183  387:iload           7
	//  184  389:invokevirtual   #491 <Method Object ArrayMap.keyAt(int)>
	//  185  392:checkcast       #579 <Class Animator>
	//  186  395:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//  187  398:checkcast       #14  <Class Transition$AnimationInfo>
	//  188  401:astore          15
		if(((AnimationInfo) (obj)).mValues == null || ((AnimationInfo) (obj)).mView != view || !((AnimationInfo) (obj)).mName.equals(((Object) (getName()))) || !((AnimationInfo) (obj)).mValues.equals(((Object) (transitionvalues3)))) goto _L12; else goto _L11
	//  189  403:aload           15
	//  190  405:getfield        #708 <Field TransitionValues Transition$AnimationInfo.mValues>
	//  191  408:ifnull          559
	//  192  411:aload           15
	//  193  413:getfield        #711 <Field View Transition$AnimationInfo.mView>
	//  194  416:aload           19
	//  195  418:if_acmpne       559
	//  196  421:aload           15
	//  197  423:getfield        #712 <Field String Transition$AnimationInfo.mName>
	//  198  426:aload_0         
	//  199  427:invokevirtual   #713 <Method String getName()>
	//  200  430:invokevirtual   #714 <Method boolean String.equals(Object)>
	//  201  433:ifeq            559
	//  202  436:aload           15
	//  203  438:getfield        #708 <Field TransitionValues Transition$AnimationInfo.mValues>
	//  204  441:aload           20
	//  205  443:invokevirtual   #715 <Method boolean TransitionValues.equals(Object)>
	//  206  446:ifeq            559
_L11:
		animator = null;
	//  207  449:aconst_null     
	//  208  450:astore          17
		transitionvalues2 = transitionvalues3;
	//  209  452:aload           20
	//  210  454:astore          16
		obj = ((Object) (view));
	//  211  456:aload           19
	//  212  458:astore          15
_L7:
		l2 = l1;
	//  213  460:lload           10
	//  214  462:lstore          12
		if(animator != null)
	//* 215  464:aload           17
	//* 216  466:ifnull          126
		{
			l2 = l1;
	//  217  469:lload           10
	//  218  471:lstore          12
			if(mPropagation != null)
	//* 219  473:aload_0         
	//* 220  474:getfield        #642 <Field TransitionPropagation mPropagation>
	//* 221  477:ifnull          518
			{
				l2 = mPropagation.getStartDelay(viewgroup, this, ((TransitionValues) (transitionvaluesmaps)), transitionvalues);
	//  222  480:aload_0         
	//  223  481:getfield        #642 <Field TransitionPropagation mPropagation>
	//  224  484:aload_1         
	//  225  485:aload_0         
	//  226  486:aload_2         
	//  227  487:aload           14
	//  228  489:invokevirtual   #718 <Method long TransitionPropagation.getStartDelay(ViewGroup, Transition, TransitionValues, TransitionValues)>
	//  229  492:lstore          12
				sparseintarray.put(mAnimators.size(), (int)l2);
	//  230  494:aload           21
	//  231  496:aload_0         
	//  232  497:getfield        #202 <Field ArrayList mAnimators>
	//  233  500:invokevirtual   #399 <Method int ArrayList.size()>
	//  234  503:lload           12
	//  235  505:l2i             
	//  236  506:invokevirtual   #721 <Method void SparseIntArray.put(int, int)>
				l2 = Math.min(l2, l1);
	//  237  509:lload           12
	//  238  511:lload           10
	//  239  513:invokestatic    #727 <Method long Math.min(long, long)>
	//  240  516:lstore          12
			}
			arraymap.put(((Object) (animator)), ((Object) (new AnimationInfo(((View) (obj)), getName(), this, ViewUtils.getWindowId(((View) (viewgroup))), transitionvalues2))));
	//  241  518:aload           22
	//  242  520:aload           17
	//  243  522:new             #14  <Class Transition$AnimationInfo>
	//  244  525:dup             
	//  245  526:aload           15
	//  246  528:aload_0         
	//  247  529:invokevirtual   #713 <Method String getName()>
	//  248  532:aload_0         
	//  249  533:aload_1         
	//  250  534:invokestatic    #733 <Method WindowIdImpl ViewUtils.getWindowId(View)>
	//  251  537:aload           16
	//  252  539:invokespecial   #736 <Method void Transition$AnimationInfo(View, String, Transition, WindowIdImpl, TransitionValues)>
	//  253  542:invokevirtual   #312 <Method Object ArrayMap.put(Object, Object)>
	//  254  545:pop             
			mAnimators.add(((Object) (animator)));
	//  255  546:aload_0         
	//  256  547:getfield        #202 <Field ArrayList mAnimators>
	//  257  550:aload           17
	//  258  552:invokevirtual   #299 <Method boolean ArrayList.add(Object)>
	//  259  555:pop             
		}
		  goto _L4
	//* 260  556:goto            126
_L12:
		l++;
	//  261  559:iload           7
	//  262  561:iconst_1        
	//  263  562:iadd            
	//  264  563:istore          7
		  goto _L13
	//* 265  565:goto            364
		obj = ((Object) (((TransitionValues) (transitionvaluesmaps)).view));
	//  266  568:aload_2         
	//  267  569:getfield        #289 <Field View TransitionValues.view>
	//  268  572:astore          15
		transitionvalues2 = transitionvalues3;
	//  269  574:aload           20
	//  270  576:astore          16
		animator = animator1;
	//  271  578:aload           18
	//  272  580:astore          17
		  goto _L7
	//* 273  582:goto            460
		if(l1 != 0L)
	//* 274  585:lload           10
	//* 275  587:lconst_0        
	//* 276  588:lcmp            
	//* 277  589:ifeq            656
		{
			for(int j = 0; j < sparseintarray.size(); j++)
	//* 278  592:iconst_0        
	//* 279  593:istore          6
	//* 280  595:iload           6
	//* 281  597:aload           21
	//* 282  599:invokevirtual   #737 <Method int SparseIntArray.size()>
	//* 283  602:icmpge          656
			{
				int i1 = sparseintarray.keyAt(j);
	//  284  605:aload           21
	//  285  607:iload           6
	//  286  609:invokevirtual   #738 <Method int SparseIntArray.keyAt(int)>
	//  287  612:istore          7
				viewgroup = ((ViewGroup) ((Animator)mAnimators.get(i1)));
	//  288  614:aload_0         
	//  289  615:getfield        #202 <Field ArrayList mAnimators>
	//  290  618:iload           7
	//  291  620:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//  292  623:checkcast       #579 <Class Animator>
	//  293  626:astore_1        
				((Animator) (viewgroup)).setStartDelay(((long)sparseintarray.valueAt(j) - l1) + ((Animator) (viewgroup)).getStartDelay());
	//  294  627:aload_1         
	//  295  628:aload           21
	//  296  630:iload           6
	//  297  632:invokevirtual   #740 <Method int SparseIntArray.valueAt(int)>
	//  298  635:i2l             
	//  299  636:lload           10
	//  300  638:lsub            
	//  301  639:aload_1         
	//  302  640:invokevirtual   #741 <Method long Animator.getStartDelay()>
	//  303  643:ladd            
	//  304  644:invokevirtual   #618 <Method void Animator.setStartDelay(long)>
			}

	//  305  647:iload           6
	//  306  649:iconst_1        
	//  307  650:iadd            
	//  308  651:istore          6
		}
	//* 309  653:goto            595
		return;
	//  310  656:return          
		  goto _L4
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
		if(mParent == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field TransitionSet mParent>
	//    2    4:ifnull          19
_L1:
		view = ((View) (mParent.getMatchedTransitionValues(view, flag)));
	//    3    7:aload_0         
	//    4    8:getfield        #184 <Field TransitionSet mParent>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #782 <Method TransitionValues TransitionSet.getMatchedTransitionValues(View, boolean)>
	//    8   16:astore_1        
_L4:
		return ((TransitionValues) (view));
	//    9   17:aload_1         
	//   10   18:areturn         
_L2:
		int i;
		byte byte0;
		int k;
		ArrayList arraylist;
		if(flag)
	//*  11   19:iload_2         
	//*  12   20:ifeq            36
			arraylist = mStartValuesList;
	//   13   23:aload_0         
	//   14   24:getfield        #295 <Field ArrayList mStartValuesList>
	//   15   27:astore          7
		else
	//*  16   29:aload           7
	//*  17   31:ifnonnull       45
	//*  18   34:aconst_null     
	//*  19   35:areturn         
			arraylist = mEndValuesList;
	//   20   36:aload_0         
	//   21   37:getfield        #301 <Field ArrayList mEndValuesList>
	//   22   40:astore          7
		if(arraylist == null)
			return null;
	//*  23   42:goto            29
		k = arraylist.size();
	//   24   45:aload           7
	//   25   47:invokevirtual   #399 <Method int ArrayList.size()>
	//   26   50:istore          6
		byte0 = -1;
	//   27   52:iconst_m1       
	//   28   53:istore          5
		i = 0;
	//   29   55:iconst_0        
	//   30   56:istore_3        
_L5:
label0:
		{
			int j = ((int) (byte0));
	//   31   57:iload           5
	//   32   59:istore          4
			if(i < k)
	//*  33   61:iload_3         
	//*  34   62:iload           6
	//*  35   64:icmpge          97
			{
				TransitionValues transitionvalues = (TransitionValues)arraylist.get(i);
	//   36   67:aload           7
	//   37   69:iload_3         
	//   38   70:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//   39   73:checkcast       #285 <Class TransitionValues>
	//   40   76:astore          8
				if(transitionvalues == null)
	//*  41   78:aload           8
	//*  42   80:ifnonnull       85
					return null;
	//   43   83:aconst_null     
	//   44   84:areturn         
				if(transitionvalues.view != view)
					break label0;
	//   45   85:aload           8
	//   46   87:getfield        #289 <Field View TransitionValues.view>
	//   47   90:aload_1         
	//   48   91:if_acmpne       123
				j = i;
	//   49   94:iload_3         
	//   50   95:istore          4
			}
			view = null;
	//   51   97:aconst_null     
	//   52   98:astore_1        
			if(j >= 0)
	//*  53   99:iload           4
	//*  54  101:iflt            17
			{
				if(flag)
	//*  55  104:iload_2         
	//*  56  105:ifeq            130
					view = ((View) (mEndValuesList));
	//   57  108:aload_0         
	//   58  109:getfield        #301 <Field ArrayList mEndValuesList>
	//   59  112:astore_1        
				else
	//*  60  113:aload_1         
	//*  61  114:iload           4
	//*  62  116:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//*  63  119:checkcast       #285 <Class TransitionValues>
	//*  64  122:areturn         
	//*  65  123:iload_3         
	//*  66  124:iconst_1        
	//*  67  125:iadd            
	//*  68  126:istore_3        
	//*  69  127:goto            57
					view = ((View) (mStartValuesList));
	//   70  130:aload_0         
	//   71  131:getfield        #295 <Field ArrayList mStartValuesList>
	//   72  134:astore_1        
				return (TransitionValues)((ArrayList) (view)).get(j);
			}
		}
		if(true) goto _L4; else goto _L3
	//   73  135:goto            113
_L3:
		i++;
		  goto _L5
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
	//*  10   18:ifeq            38
			transitionvaluesmaps = mStartValues;
	//   11   21:aload_0         
	//   12   22:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//   13   25:astore_3        
		else
	//*  14   26:aload_3         
	//*  15   27:getfield        #308 <Field ArrayMap TransitionValuesMaps.mViewValues>
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//*  18   34:checkcast       #285 <Class TransitionValues>
	//*  19   37:areturn         
			transitionvaluesmaps = mEndValues;
	//   20   38:aload_0         
	//   21   39:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//   22   42:astore_3        
		return (TransitionValues)transitionvaluesmaps.mViewValues.get(((Object) (view)));
	//*  23   43:goto            26
	}

	public boolean isTransitionRequired(TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		boolean flag;
		boolean flag1;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		flag = flag1;
	//    2    3:iload           6
	//    3    5:istore          5
		if(transitionvalues == null) goto _L2; else goto _L1
	//    4    7:aload_1         
	//    5    8:ifnull          62
_L1:
		flag = flag1;
	//    6   11:iload           6
	//    7   13:istore          5
		if(transitionvalues1 == null) goto _L2; else goto _L3
	//    8   15:aload_2         
	//    9   16:ifnull          62
_L3:
		String as[] = getTransitionProperties();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #703 <Method String[] getTransitionProperties()>
	//   12   23:astore          7
		if(as == null) goto _L5; else goto _L4
	//   13   25:aload           7
	//   14   27:ifnull          72
_L4:
		int i;
		int j;
		j = as.length;
	//   15   30:aload           7
	//   16   32:arraylength     
	//   17   33:istore          4
		i = 0;
	//   18   35:iconst_0        
	//   19   36:istore_3        
_L13:
		flag = flag1;
	//   20   37:iload           6
	//   21   39:istore          5
		if(i >= j) goto _L2; else goto _L6
	//   22   41:iload_3         
	//   23   42:iload           4
	//   24   44:icmpge          62
_L6:
		if(!isValueChanged(transitionvalues, transitionvalues1, as[i])) goto _L8; else goto _L7
	//   25   47:aload_1         
	//   26   48:aload_2         
	//   27   49:aload           7
	//   28   51:iload_3         
	//   29   52:aaload          
	//   30   53:invokestatic    #800 <Method boolean isValueChanged(TransitionValues, TransitionValues, String)>
	//   31   56:ifeq            65
_L7:
		flag = true;
	//   32   59:iconst_1        
	//   33   60:istore          5
_L2:
		return flag;
	//   34   62:iload           5
	//   35   64:ireturn         
_L8:
		i++;
	//   36   65:iload_3         
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:istore_3        
		continue; /* Loop/switch isn't completed */
	//   40   69:goto            37
_L5:
		Iterator iterator = transitionvalues.values.keySet().iterator();
	//   41   72:aload_1         
	//   42   73:getfield        #468 <Field Map TransitionValues.values>
	//   43   76:invokeinterface #804 <Method Set Map.keySet()>
	//   44   81:invokeinterface #810 <Method Iterator Set.iterator()>
	//   45   86:astore          7
_L11:
		flag = flag1;
	//   46   88:iload           6
	//   47   90:istore          5
		if(!iterator.hasNext()) goto _L2; else goto _L9
	//   48   92:aload           7
	//   49   94:invokeinterface #815 <Method boolean Iterator.hasNext()>
	//   50   99:ifeq            62
_L9:
		if(!isValueChanged(transitionvalues, transitionvalues1, (String)iterator.next())) goto _L11; else goto _L10
	//   51  102:aload_1         
	//   52  103:aload_2         
	//   53  104:aload           7
	//   54  106:invokeinterface #818 <Method Object Iterator.next()>
	//   55  111:checkcast       #537 <Class String>
	//   56  114:invokestatic    #800 <Method boolean isValueChanged(TransitionValues, TransitionValues, String)>
	//   57  117:ifeq            88
_L10:
		return true;
	//   58  120:iconst_1        
	//   59  121:ireturn         
		if(true) goto _L13; else goto _L12
_L12:
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
		if(mTargetIds.contains(((Object) (Integer.valueOf(k)))) || mTargets.contains(((Object) (view))))
	//*  89  185:aload_0         
	//*  90  186:getfield        #155 <Field ArrayList mTargetIds>
	//*  91  189:iload_3         
	//*  92  190:invokestatic    #395 <Method Integer Integer.valueOf(int)>
	//*  93  193:invokevirtual   #398 <Method boolean ArrayList.contains(Object)>
	//*  94  196:ifne            210
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
		i--;
	//   24   51:iload_2         
	//   25   52:iconst_1        
	//   26   53:isub            
	//   27   54:istore_2        
		while(i >= 0) 
	//*  28   55:iload_2         
	//*  29   56:iflt            220
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
	//   36   72:ifnull          197
			AnimationInfo animationinfo = (AnimationInfo)arraymap.get(((Object) (animator)));
	//   37   75:aload           4
	//   38   77:aload           6
	//   39   79:invokevirtual   #485 <Method Object ArrayMap.get(Object)>
	//   40   82:checkcast       #14  <Class Transition$AnimationInfo>
	//   41   85:astore          7
			if(animationinfo == null || animationinfo.mView == null || !((Object) (windowidimpl)).equals(((Object) (animationinfo.mWindowId))))
				continue;
	//   42   87:aload           7
	//   43   89:ifnull          197
	//   44   92:aload           7
	//   45   94:getfield        #711 <Field View Transition$AnimationInfo.mView>
	//   46   97:ifnull          197
	//   47  100:aload           5
	//   48  102:aload           7
	//   49  104:getfield        #765 <Field WindowIdImpl Transition$AnimationInfo.mWindowId>
	//   50  107:invokevirtual   #476 <Method boolean Object.equals(Object)>
	//   51  110:ifeq            197
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
	//*  71  152:ifnull          204
	//*  72  155:aload           7
	//*  73  157:getfield        #836 <Field Transition Transition$AnimationInfo.mTransition>
	//*  74  160:aload           8
	//*  75  162:aload           10
	//*  76  164:invokevirtual   #698 <Method boolean isTransitionRequired(TransitionValues, TransitionValues)>
	//*  77  167:ifeq            204
				flag = true;
	//   78  170:iconst_1        
	//   79  171:istore_3        
			else
	//*  80  172:iload_3         
	//*  81  173:ifeq            197
	//*  82  176:aload           6
	//*  83  178:invokevirtual   #839 <Method boolean Animator.isRunning()>
	//*  84  181:ifne            192
	//*  85  184:aload           6
	//*  86  186:invokevirtual   #842 <Method boolean Animator.isStarted()>
	//*  87  189:ifeq            209
	//*  88  192:aload           6
	//*  89  194:invokevirtual   #634 <Method void Animator.cancel()>
	//*  90  197:iload_2         
	//*  91  198:iconst_1        
	//*  92  199:isub            
	//*  93  200:istore_2        
	//*  94  201:goto            55
				flag = false;
	//   95  204:iconst_0        
	//   96  205:istore_3        
			if(flag)
				if(animator.isRunning() || animator.isStarted())
					animator.cancel();
				else
	//*  97  206:goto            172
					arraymap.remove(((Object) (animator)));
	//   98  209:aload           4
	//   99  211:aload           6
	//  100  213:invokevirtual   #487 <Method Object ArrayMap.remove(Object)>
	//  101  216:pop             
			i--;
		}
	//* 102  217:goto            197
		createAnimators(viewgroup, mStartValues, mEndValues, mStartValuesList, mEndValuesList);
	//  103  220:aload_0         
	//  104  221:aload_1         
	//  105  222:aload_0         
	//  106  223:getfield        #180 <Field TransitionValuesMaps mStartValues>
	//  107  226:aload_0         
	//  108  227:getfield        #182 <Field TransitionValuesMaps mEndValues>
	//  109  230:aload_0         
	//  110  231:getfield        #295 <Field ArrayList mStartValuesList>
	//  111  234:aload_0         
	//  112  235:getfield        #301 <Field ArrayList mEndValuesList>
	//  113  238:invokevirtual   #844 <Method void createAnimators(ViewGroup, TransitionValuesMaps, TransitionValuesMaps, ArrayList, ArrayList)>
		runAnimators();
	//  114  241:aload_0         
	//  115  242:invokevirtual   #847 <Method void runAnimators()>
	//  116  245:return          
	}

	public Transition removeListener(TransitionListener transitionlistener)
	{
		if(mListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #200 <Field ArrayList mListeners>
	//*   2    4:ifnonnull       9
	//*   3    7:aload_0         
	//*   4    8:areturn         
		{
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
	//*  13   25:ifne            7
			{
				mListeners = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #200 <Field ArrayList mListeners>
				return this;
	//   17   33:aload_0         
	//   18   34:areturn         
			}
		}
		return this;
	}

	public Transition removeTarget(int i)
	{
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            16
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
		if(ai == null || ai.length == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            17
		{
			mMatchOrder = DEFAULT_MATCH_ORDER;
	//    5    9:aload_0         
	//    6   10:getstatic       #118 <Field int[] DEFAULT_MATCH_ORDER>
	//    7   13:putfield        #186 <Field int[] mMatchOrder>
			return;
	//    8   16:return          
		}
		for(int i = 0; i < ai.length; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:aload_1         
	//*  13   21:arraylength     
	//*  14   22:icmpge          71
		{
			if(!isValidMatch(ai[i]))
	//*  15   25:aload_1         
	//*  16   26:iload_2         
	//*  17   27:iaload          
	//*  18   28:invokestatic    #867 <Method boolean isValidMatch(int)>
	//*  19   31:ifne            45
				throw new IllegalArgumentException("matches contains invalid value");
	//   20   34:new             #869 <Class IllegalArgumentException>
	//   21   37:dup             
	//   22   38:ldc2            #871 <String "matches contains invalid value">
	//   23   41:invokespecial   #872 <Method void IllegalArgumentException(String)>
	//   24   44:athrow          
			if(alreadyContains(ai, i))
	//*  25   45:aload_1         
	//*  26   46:iload_2         
	//*  27   47:invokestatic    #874 <Method boolean alreadyContains(int[], int)>
	//*  28   50:ifeq            64
				throw new IllegalArgumentException("matches contains a duplicate value");
	//   29   53:new             #869 <Class IllegalArgumentException>
	//   30   56:dup             
	//   31   57:ldc2            #876 <String "matches contains a duplicate value">
	//   32   60:invokespecial   #872 <Method void IllegalArgumentException(String)>
	//   33   63:athrow          
		}

	//   34   64:iload_2         
	//   35   65:iconst_1        
	//   36   66:iadd            
	//   37   67:istore_2        
	//*  38   68:goto            19
		mMatchOrder = (int[])((int []) (ai)).clone();
	//   39   71:aload_0         
	//   40   72:aload_1         
	//   41   73:invokevirtual   #878 <Method Object _5B_I.clone()>
	//   42   76:checkcast       #877 <Class int[]>
	//   43   79:putfield        #186 <Field int[] mMatchOrder>
	//   44   82:return          
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
		String s1;
label0:
		{
			s1 = (new StringBuilder()).append(s).append(((Object)this).getClass().getSimpleName()).append("@").append(Integer.toHexString(((Object)this).hashCode())).append(": ").toString();
	//    0    0:new             #557 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #558 <Method void StringBuilder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #134 <Method Class Object.getClass()>
	//    7   15:invokevirtual   #895 <Method String Class.getSimpleName()>
	//    8   18:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:ldc2            #897 <String "@">
	//   10   24:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:invokevirtual   #900 <Method int Object.hashCode()>
	//   13   31:invokestatic    #904 <Method String Integer.toHexString(int)>
	//   14   34:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   15   37:ldc2            #906 <String ": ">
	//   16   40:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   17   43:invokevirtual   #569 <Method String StringBuilder.toString()>
	//   18   46:astore_3        
			s = s1;
	//   19   47:aload_3         
	//   20   48:astore_1        
			if(mDuration != -1L)
	//*  21   49:aload_0         
	//*  22   50:getfield        #148 <Field long mDuration>
	//*  23   53:ldc2w           #143 <Long -1L>
	//*  24   56:lcmp            
	//*  25   57:ifeq            94
				s = (new StringBuilder()).append(s1).append("dur(").append(mDuration).append(") ").toString();
	//   26   60:new             #557 <Class StringBuilder>
	//   27   63:dup             
	//   28   64:invokespecial   #558 <Method void StringBuilder()>
	//   29   67:aload_3         
	//   30   68:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   31   71:ldc2            #908 <String "dur(">
	//   32   74:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   33   77:aload_0         
	//   34   78:getfield        #148 <Field long mDuration>
	//   35   81:invokevirtual   #911 <Method StringBuilder StringBuilder.append(long)>
	//   36   84:ldc2            #913 <String ") ">
	//   37   87:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   38   90:invokevirtual   #569 <Method String StringBuilder.toString()>
	//   39   93:astore_1        
			s1 = s;
	//   40   94:aload_1         
	//   41   95:astore_3        
			if(mStartDelay != -1L)
	//*  42   96:aload_0         
	//*  43   97:getfield        #146 <Field long mStartDelay>
	//*  44  100:ldc2w           #143 <Long -1L>
	//*  45  103:lcmp            
	//*  46  104:ifeq            141
				s1 = (new StringBuilder()).append(s).append("dly(").append(mStartDelay).append(") ").toString();
	//   47  107:new             #557 <Class StringBuilder>
	//   48  110:dup             
	//   49  111:invokespecial   #558 <Method void StringBuilder()>
	//   50  114:aload_1         
	//   51  115:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   52  118:ldc2            #915 <String "dly(">
	//   53  121:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   54  124:aload_0         
	//   55  125:getfield        #146 <Field long mStartDelay>
	//   56  128:invokevirtual   #911 <Method StringBuilder StringBuilder.append(long)>
	//   57  131:ldc2            #913 <String ") ">
	//   58  134:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   59  137:invokevirtual   #569 <Method String StringBuilder.toString()>
	//   60  140:astore_3        
			s = s1;
	//   61  141:aload_3         
	//   62  142:astore_1        
			if(mInterpolator != null)
	//*  63  143:aload_0         
	//*  64  144:getfield        #150 <Field TimeInterpolator mInterpolator>
	//*  65  147:ifnull          184
				s = (new StringBuilder()).append(s1).append("interp(").append(((Object) (mInterpolator))).append(") ").toString();
	//   66  150:new             #557 <Class StringBuilder>
	//   67  153:dup             
	//   68  154:invokespecial   #558 <Method void StringBuilder()>
	//   69  157:aload_3         
	//   70  158:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   71  161:ldc2            #917 <String "interp(">
	//   72  164:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   73  167:aload_0         
	//   74  168:getfield        #150 <Field TimeInterpolator mInterpolator>
	//   75  171:invokevirtual   #920 <Method StringBuilder StringBuilder.append(Object)>
	//   76  174:ldc2            #913 <String ") ">
	//   77  177:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   78  180:invokevirtual   #569 <Method String StringBuilder.toString()>
	//   79  183:astore_1        
			if(mTargetIds.size() <= 0)
	//*  80  184:aload_0         
	//*  81  185:getfield        #155 <Field ArrayList mTargetIds>
	//*  82  188:invokevirtual   #399 <Method int ArrayList.size()>
	//*  83  191:ifgt            206
			{
				s1 = s;
	//   84  194:aload_1         
	//   85  195:astore_3        
				if(mTargets.size() <= 0)
					break label0;
	//   86  196:aload_0         
	//   87  197:getfield        #157 <Field ArrayList mTargets>
	//   88  200:invokevirtual   #399 <Method int ArrayList.size()>
	//   89  203:ifle            422
			}
			s1 = (new StringBuilder()).append(s).append("tgts(").toString();
	//   90  206:new             #557 <Class StringBuilder>
	//   91  209:dup             
	//   92  210:invokespecial   #558 <Method void StringBuilder()>
	//   93  213:aload_1         
	//   94  214:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   95  217:ldc2            #922 <String "tgts(">
	//   96  220:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//   97  223:invokevirtual   #569 <Method String StringBuilder.toString()>
	//   98  226:astore_3        
			s = s1;
	//   99  227:aload_3         
	//  100  228:astore_1        
			if(mTargetIds.size() > 0)
	//* 101  229:aload_0         
	//* 102  230:getfield        #155 <Field ArrayList mTargetIds>
	//* 103  233:invokevirtual   #399 <Method int ArrayList.size()>
	//* 104  236:ifle            314
			{
				int i = 0;
	//  105  239:iconst_0        
	//  106  240:istore_2        
				do
				{
					s = s1;
	//  107  241:aload_3         
	//  108  242:astore_1        
					if(i >= mTargetIds.size())
						break;
	//  109  243:iload_2         
	//  110  244:aload_0         
	//  111  245:getfield        #155 <Field ArrayList mTargetIds>
	//  112  248:invokevirtual   #399 <Method int ArrayList.size()>
	//  113  251:icmpge          314
					s = s1;
	//  114  254:aload_3         
	//  115  255:astore_1        
					if(i > 0)
	//* 116  256:iload_2         
	//* 117  257:ifle            281
						s = (new StringBuilder()).append(s1).append(", ").toString();
	//  118  260:new             #557 <Class StringBuilder>
	//  119  263:dup             
	//  120  264:invokespecial   #558 <Method void StringBuilder()>
	//  121  267:aload_3         
	//  122  268:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//  123  271:ldc2            #924 <String ", ">
	//  124  274:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//  125  277:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  126  280:astore_1        
					s1 = (new StringBuilder()).append(s).append(mTargetIds.get(i)).toString();
	//  127  281:new             #557 <Class StringBuilder>
	//  128  284:dup             
	//  129  285:invokespecial   #558 <Method void StringBuilder()>
	//  130  288:aload_1         
	//  131  289:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//  132  292:aload_0         
	//  133  293:getfield        #155 <Field ArrayList mTargetIds>
	//  134  296:iload_2         
	//  135  297:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//  136  300:invokevirtual   #920 <Method StringBuilder StringBuilder.append(Object)>
	//  137  303:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  138  306:astore_3        
					i++;
	//  139  307:iload_2         
	//  140  308:iconst_1        
	//  141  309:iadd            
	//  142  310:istore_2        
				} while(true);
	//  143  311:goto            241
			}
			s1 = s;
	//  144  314:aload_1         
	//  145  315:astore_3        
			if(mTargets.size() > 0)
	//* 146  316:aload_0         
	//* 147  317:getfield        #157 <Field ArrayList mTargets>
	//* 148  320:invokevirtual   #399 <Method int ArrayList.size()>
	//* 149  323:ifle            401
			{
				int j = 0;
	//  150  326:iconst_0        
	//  151  327:istore_2        
				do
				{
					s1 = s;
	//  152  328:aload_1         
	//  153  329:astore_3        
					if(j >= mTargets.size())
						break;
	//  154  330:iload_2         
	//  155  331:aload_0         
	//  156  332:getfield        #157 <Field ArrayList mTargets>
	//  157  335:invokevirtual   #399 <Method int ArrayList.size()>
	//  158  338:icmpge          401
					s1 = s;
	//  159  341:aload_1         
	//  160  342:astore_3        
					if(j > 0)
	//* 161  343:iload_2         
	//* 162  344:ifle            368
						s1 = (new StringBuilder()).append(s).append(", ").toString();
	//  163  347:new             #557 <Class StringBuilder>
	//  164  350:dup             
	//  165  351:invokespecial   #558 <Method void StringBuilder()>
	//  166  354:aload_1         
	//  167  355:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//  168  358:ldc2            #924 <String ", ">
	//  169  361:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//  170  364:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  171  367:astore_3        
					s = (new StringBuilder()).append(s1).append(mTargets.get(j)).toString();
	//  172  368:new             #557 <Class StringBuilder>
	//  173  371:dup             
	//  174  372:invokespecial   #558 <Method void StringBuilder()>
	//  175  375:aload_3         
	//  176  376:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//  177  379:aload_0         
	//  178  380:getfield        #157 <Field ArrayList mTargets>
	//  179  383:iload_2         
	//  180  384:invokevirtual   #401 <Method Object ArrayList.get(int)>
	//  181  387:invokevirtual   #920 <Method StringBuilder StringBuilder.append(Object)>
	//  182  390:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  183  393:astore_1        
					j++;
	//  184  394:iload_2         
	//  185  395:iconst_1        
	//  186  396:iadd            
	//  187  397:istore_2        
				} while(true);
	//  188  398:goto            328
			}
			s1 = (new StringBuilder()).append(s1).append(")").toString();
	//  189  401:new             #557 <Class StringBuilder>
	//  190  404:dup             
	//  191  405:invokespecial   #558 <Method void StringBuilder()>
	//  192  408:aload_3         
	//  193  409:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//  194  412:ldc2            #926 <String ")">
	//  195  415:invokevirtual   #564 <Method StringBuilder StringBuilder.append(String)>
	//  196  418:invokevirtual   #569 <Method String StringBuilder.toString()>
	//  197  421:astore_3        
		}
		return s1;
	//  198  422:aload_3         
	//  199  423:areturn         
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
