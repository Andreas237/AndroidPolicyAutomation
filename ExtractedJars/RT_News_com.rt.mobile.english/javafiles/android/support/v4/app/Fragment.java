// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.*;
import android.content.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.*;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SimpleArrayMap;
import android.support.v4.view.LayoutInflaterCompat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.*;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package android.support.v4.app:
//			LoaderManagerImpl, FragmentManagerImpl, FragmentHostCallback, FragmentActivity, 
//			SuperNotCalledException, FragmentManagerNonConfig, FragmentManager, SharedElementCallback, 
//			LoaderManager, FragmentContainer

public class Fragment
	implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner
{
	static class AnimationInfo
	{

		private Boolean mAllowEnterTransitionOverlap;
		private Boolean mAllowReturnTransitionOverlap;
		View mAnimatingAway;
		Animator mAnimator;
		private Object mEnterTransition;
		SharedElementCallback mEnterTransitionCallback;
		boolean mEnterTransitionPostponed;
		private Object mExitTransition;
		SharedElementCallback mExitTransitionCallback;
		boolean mIsHideReplaced;
		int mNextAnim;
		int mNextTransition;
		int mNextTransitionStyle;
		private Object mReenterTransition;
		private Object mReturnTransition;
		private Object mSharedElementEnterTransition;
		private Object mSharedElementReturnTransition;
		OnStartEnterTransitionListener mStartEnterTransitionListener;
		int mStateAfterAnimating;


/*
		static Object access$000(AnimationInfo animationinfo)
		{
			return animationinfo.mEnterTransition;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field Object mEnterTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$002(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mEnterTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field Object mEnterTransition>
			return obj;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Object access$100(AnimationInfo animationinfo)
		{
			return animationinfo.mReturnTransition;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Object mReturnTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$102(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mReturnTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field Object mReturnTransition>
			return obj;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Object access$200(AnimationInfo animationinfo)
		{
			return animationinfo.mExitTransition;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field Object mExitTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$202(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mExitTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #47  <Field Object mExitTransition>
			return obj;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Object access$300(AnimationInfo animationinfo)
		{
			return animationinfo.mReenterTransition;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Object mReenterTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$302(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mReenterTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field Object mReenterTransition>
			return obj;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Object access$400(AnimationInfo animationinfo)
		{
			return animationinfo.mSharedElementEnterTransition;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Object mSharedElementEnterTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$402(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mSharedElementEnterTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #51  <Field Object mSharedElementEnterTransition>
			return obj;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Object access$500(AnimationInfo animationinfo)
		{
			return animationinfo.mSharedElementReturnTransition;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field Object mSharedElementReturnTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$502(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mSharedElementReturnTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #53  <Field Object mSharedElementReturnTransition>
			return obj;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Boolean access$600(AnimationInfo animationinfo)
		{
			return animationinfo.mAllowEnterTransitionOverlap;
		//    0    0:aload_0         
		//    1    1:getfield        #76  <Field Boolean mAllowEnterTransitionOverlap>
		//    2    4:areturn         
		}

*/


/*
		static Boolean access$602(AnimationInfo animationinfo, Boolean boolean1)
		{
			animationinfo.mAllowEnterTransitionOverlap = boolean1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #76  <Field Boolean mAllowEnterTransitionOverlap>
			return boolean1;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static Boolean access$700(AnimationInfo animationinfo)
		{
			return animationinfo.mAllowReturnTransitionOverlap;
		//    0    0:aload_0         
		//    1    1:getfield        #81  <Field Boolean mAllowReturnTransitionOverlap>
		//    2    4:areturn         
		}

*/


/*
		static Boolean access$702(AnimationInfo animationinfo, Boolean boolean1)
		{
			animationinfo.mAllowReturnTransitionOverlap = boolean1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #81  <Field Boolean mAllowReturnTransitionOverlap>
			return boolean1;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		AnimationInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void Object()>
			mEnterTransition = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #40  <Field Object mEnterTransition>
			mReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
		//    5    9:aload_0         
		//    6   10:getstatic       #43  <Field Object Fragment.USE_DEFAULT_TRANSITION>
		//    7   13:putfield        #45  <Field Object mReturnTransition>
			mExitTransition = null;
		//    8   16:aload_0         
		//    9   17:aconst_null     
		//   10   18:putfield        #47  <Field Object mExitTransition>
			mReenterTransition = Fragment.USE_DEFAULT_TRANSITION;
		//   11   21:aload_0         
		//   12   22:getstatic       #43  <Field Object Fragment.USE_DEFAULT_TRANSITION>
		//   13   25:putfield        #49  <Field Object mReenterTransition>
			mSharedElementEnterTransition = null;
		//   14   28:aload_0         
		//   15   29:aconst_null     
		//   16   30:putfield        #51  <Field Object mSharedElementEnterTransition>
			mSharedElementReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
		//   17   33:aload_0         
		//   18   34:getstatic       #43  <Field Object Fragment.USE_DEFAULT_TRANSITION>
		//   19   37:putfield        #53  <Field Object mSharedElementReturnTransition>
			mEnterTransitionCallback = null;
		//   20   40:aload_0         
		//   21   41:aconst_null     
		//   22   42:putfield        #55  <Field SharedElementCallback mEnterTransitionCallback>
			mExitTransitionCallback = null;
		//   23   45:aload_0         
		//   24   46:aconst_null     
		//   25   47:putfield        #57  <Field SharedElementCallback mExitTransitionCallback>
		//   26   50:return          
		}
	}

	public static class InstantiationException extends RuntimeException
	{

		public InstantiationException(String s, Exception exception)
		{
			super(s, ((Throwable) (exception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #12  <Method void RuntimeException(String, Throwable)>
		//    4    6:return          
		}
	}

	static interface OnStartEnterTransitionListener
	{

		public abstract void onStartEnterTransition();

		public abstract void startListening();
	}

	public static class SavedState
		implements Parcelable
	{

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeBundle(mState);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #28  <Field Bundle mState>
		//    3    5:invokevirtual   #48  <Method void Parcel.writeBundle(Bundle)>
		//    4    8:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class Fragment$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void Fragment$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method Fragment$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #30  <Method Fragment$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		final Bundle mState;

		static 
		{
		//    0    0:new             #11  <Class Fragment$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void Fragment$SavedState$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mState = bundle;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #28  <Field Bundle mState>
		//    5    9:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mState = parcel.readBundle();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #35  <Method Bundle Parcel.readBundle()>
		//    5    9:putfield        #28  <Field Bundle mState>
			if(classloader != null && mState != null)
		//*   6   12:aload_2         
		//*   7   13:ifnull          31
		//*   8   16:aload_0         
		//*   9   17:getfield        #28  <Field Bundle mState>
		//*  10   20:ifnull          31
				mState.setClassLoader(classloader);
		//   11   23:aload_0         
		//   12   24:getfield        #28  <Field Bundle mState>
		//   13   27:aload_2         
		//   14   28:invokevirtual   #41  <Method void Bundle.setClassLoader(ClassLoader)>
		//   15   31:return          
		}
	}


	public Fragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #123 <Method void Object()>
		mState = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #128 <Field int mState>
		mIndex = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #130 <Field int mIndex>
		mTargetIndex = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #132 <Field int mTargetIndex>
		mMenuVisible = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #134 <Field boolean mMenuVisible>
		mUserVisibleHint = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #136 <Field boolean mUserVisibleHint>
		mLifecycleRegistry = new LifecycleRegistry(((LifecycleOwner) (this)));
	//   17   29:aload_0         
	//   18   30:new             #138 <Class LifecycleRegistry>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:invokespecial   #141 <Method void LifecycleRegistry(LifecycleOwner)>
	//   22   38:putfield        #143 <Field LifecycleRegistry mLifecycleRegistry>
	//   23   41:return          
	}

	private void callStartTransitionListener()
	{
		OnStartEnterTransitionListener onstartentertransitionlistener;
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       12
		{
			onstartentertransitionlistener = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		} else
	//*   5    9:goto            36
		{
			mAnimationInfo.mEnterTransitionPostponed = false;
	//    6   12:aload_0         
	//    7   13:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    8   16:iconst_0        
	//    9   17:putfield        #153 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
			onstartentertransitionlistener = mAnimationInfo.mStartEnterTransitionListener;
	//   10   20:aload_0         
	//   11   21:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   12   24:getfield        #157 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//   13   27:astore_1        
			mAnimationInfo.mStartEnterTransitionListener = null;
	//   14   28:aload_0         
	//   15   29:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   16   32:aconst_null     
	//   17   33:putfield        #157 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
		}
		if(onstartentertransitionlistener != null)
	//*  18   36:aload_1         
	//*  19   37:ifnull          46
			onstartentertransitionlistener.onStartEnterTransition();
	//   20   40:aload_1         
	//   21   41:invokeinterface #160 <Method void Fragment$OnStartEnterTransitionListener.onStartEnterTransition()>
	//   22   46:return          
	}

	private AnimationInfo ensureAnimationInfo()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       18
			mAnimationInfo = new AnimationInfo();
	//    3    7:aload_0         
	//    4    8:new             #18  <Class Fragment$AnimationInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #163 <Method void Fragment$AnimationInfo()>
	//    7   15:putfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
		return mAnimationInfo;
	//    8   18:aload_0         
	//    9   19:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   10   22:areturn         
	}

	public static Fragment instantiate(Context context, String s)
	{
		return instantiate(context, s, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #168 <Method Fragment instantiate(Context, String, Bundle)>
	//    4    6:areturn         
	}

	public static Fragment instantiate(Context context, String s, Bundle bundle)
	{
		Class class1;
		Class class2;
		try
		{
			class2 = (Class)sClassMap.get(((Object) (s)));
	//    0    0:getstatic       #122 <Field SimpleArrayMap sClassMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #182 <Method Object SimpleArrayMap.get(Object)>
	//    3    7:checkcast       #184 <Class Class>
	//    4   10:astore          4
		}
	//*   5   12:aload           4
	//*   6   14:astore_3        
	//*   7   15:aload           4
	//*   8   17:ifnonnull       38
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #190 <Method ClassLoader Context.getClassLoader()>
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #196 <Method Class ClassLoader.loadClass(String)>
	//*  13   28:astore_3        
	//*  14   29:getstatic       #122 <Field SimpleArrayMap sClassMap>
	//*  15   32:aload_1         
	//*  16   33:aload_3         
	//*  17   34:invokevirtual   #200 <Method Object SimpleArrayMap.put(Object, Object)>
	//*  18   37:pop             
	//*  19   38:aload_3         
	//*  20   39:iconst_0        
	//*  21   40:anewarray       Class[]
	//*  22   43:invokevirtual   #204 <Method Constructor Class.getConstructor(Class[])>
	//*  23   46:iconst_0        
	//*  24   47:anewarray       Object[]
	//*  25   50:invokevirtual   #210 <Method Object Constructor.newInstance(Object[])>
	//*  26   53:checkcast       #2   <Class Fragment>
	//*  27   56:astore_0        
	//*  28   57:aload_2         
	//*  29   58:ifnull          77
	//*  30   61:aload_2         
	//*  31   62:aload_0         
	//*  32   63:invokevirtual   #214 <Method Class Object.getClass()>
	//*  33   66:invokevirtual   #215 <Method ClassLoader Class.getClassLoader()>
	//*  34   69:invokevirtual   #221 <Method void Bundle.setClassLoader(ClassLoader)>
	//*  35   72:aload_0         
	//*  36   73:aload_2         
	//*  37   74:invokevirtual   #225 <Method void setArguments(Bundle)>
	//*  38   77:aload_0         
	//*  39   78:areturn         
	//*  40   79:astore_0        
	//*  41   80:new             #227 <Class StringBuilder>
	//*  42   83:dup             
	//*  43   84:invokespecial   #228 <Method void StringBuilder()>
	//*  44   87:astore_2        
	//*  45   88:aload_2         
	//*  46   89:ldc1            #230 <String "Unable to instantiate fragment ">
	//*  47   91:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  48   94:pop             
	//*  49   95:aload_2         
	//*  50   96:aload_1         
	//*  51   97:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  52  100:pop             
	//*  53  101:aload_2         
	//*  54  102:ldc1            #236 <String ": calling Fragment constructor caused an exception">
	//*  55  104:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  56  107:pop             
	//*  57  108:new             #21  <Class Fragment$InstantiationException>
	//*  58  111:dup             
	//*  59  112:aload_2         
	//*  60  113:invokevirtual   #240 <Method String StringBuilder.toString()>
	//*  61  116:aload_0         
	//*  62  117:invokespecial   #243 <Method void Fragment$InstantiationException(String, Exception)>
	//*  63  120:athrow          
	//*  64  121:astore_0        
	//*  65  122:new             #227 <Class StringBuilder>
	//*  66  125:dup             
	//*  67  126:invokespecial   #228 <Method void StringBuilder()>
	//*  68  129:astore_2        
	//*  69  130:aload_2         
	//*  70  131:ldc1            #230 <String "Unable to instantiate fragment ">
	//*  71  133:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  72  136:pop             
	//*  73  137:aload_2         
	//*  74  138:aload_1         
	//*  75  139:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  76  142:pop             
	//*  77  143:aload_2         
	//*  78  144:ldc1            #245 <String ": could not find Fragment constructor">
	//*  79  146:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  80  149:pop             
	//*  81  150:new             #21  <Class Fragment$InstantiationException>
	//*  82  153:dup             
	//*  83  154:aload_2         
	//*  84  155:invokevirtual   #240 <Method String StringBuilder.toString()>
	//*  85  158:aload_0         
	//*  86  159:invokespecial   #243 <Method void Fragment$InstantiationException(String, Exception)>
	//*  87  162:athrow          
	//*  88  163:astore_0        
	//*  89  164:new             #227 <Class StringBuilder>
	//*  90  167:dup             
	//*  91  168:invokespecial   #228 <Method void StringBuilder()>
	//*  92  171:astore_2        
	//*  93  172:aload_2         
	//*  94  173:ldc1            #230 <String "Unable to instantiate fragment ">
	//*  95  175:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//*  96  178:pop             
	//*  97  179:aload_2         
	//*  98  180:aload_1         
	//*  99  181:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 100  184:pop             
	//* 101  185:aload_2         
	//* 102  186:ldc1            #247 <String ": make sure class name exists, is public, and has an">
	//* 103  188:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 104  191:pop             
	//* 105  192:aload_2         
	//* 106  193:ldc1            #249 <String " empty constructor that is public">
	//* 107  195:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 108  198:pop             
	//* 109  199:new             #21  <Class Fragment$InstantiationException>
	//* 110  202:dup             
	//* 111  203:aload_2         
	//* 112  204:invokevirtual   #240 <Method String StringBuilder.toString()>
	//* 113  207:aload_0         
	//* 114  208:invokespecial   #243 <Method void Fragment$InstantiationException(String, Exception)>
	//* 115  211:athrow          
	//* 116  212:astore_0        
	//* 117  213:new             #227 <Class StringBuilder>
	//* 118  216:dup             
	//* 119  217:invokespecial   #228 <Method void StringBuilder()>
	//* 120  220:astore_2        
	//* 121  221:aload_2         
	//* 122  222:ldc1            #230 <String "Unable to instantiate fragment ">
	//* 123  224:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 124  227:pop             
	//* 125  228:aload_2         
	//* 126  229:aload_1         
	//* 127  230:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 128  233:pop             
	//* 129  234:aload_2         
	//* 130  235:ldc1            #247 <String ": make sure class name exists, is public, and has an">
	//* 131  237:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 132  240:pop             
	//* 133  241:aload_2         
	//* 134  242:ldc1            #249 <String " empty constructor that is public">
	//* 135  244:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//* 136  247:pop             
	//* 137  248:new             #21  <Class Fragment$InstantiationException>
	//* 138  251:dup             
	//* 139  252:aload_2         
	//* 140  253:invokevirtual   #240 <Method String StringBuilder.toString()>
	//* 141  256:aload_0         
	//* 142  257:invokespecial   #243 <Method void Fragment$InstantiationException(String, Exception)>
	//* 143  260:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 144  261:astore_0        
		{
			bundle = ((Bundle) (new StringBuilder()));
	//  145  262:new             #227 <Class StringBuilder>
	//  146  265:dup             
	//  147  266:invokespecial   #228 <Method void StringBuilder()>
	//  148  269:astore_2        
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
	//  149  270:aload_2         
	//  150  271:ldc1            #230 <String "Unable to instantiate fragment ">
	//  151  273:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  152  276:pop             
			((StringBuilder) (bundle)).append(s);
	//  153  277:aload_2         
	//  154  278:aload_1         
	//  155  279:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  156  282:pop             
			((StringBuilder) (bundle)).append(": make sure class name exists, is public, and has an");
	//  157  283:aload_2         
	//  158  284:ldc1            #247 <String ": make sure class name exists, is public, and has an">
	//  159  286:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  160  289:pop             
			((StringBuilder) (bundle)).append(" empty constructor that is public");
	//  161  290:aload_2         
	//  162  291:ldc1            #249 <String " empty constructor that is public">
	//  163  293:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  164  296:pop             
			throw new InstantiationException(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
	//  165  297:new             #21  <Class Fragment$InstantiationException>
	//  166  300:dup             
	//  167  301:aload_2         
	//  168  302:invokevirtual   #240 <Method String StringBuilder.toString()>
	//  169  305:aload_0         
	//  170  306:invokespecial   #243 <Method void Fragment$InstantiationException(String, Exception)>
	//  171  309:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			bundle = ((Bundle) (new StringBuilder()));
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
			((StringBuilder) (bundle)).append(s);
			((StringBuilder) (bundle)).append(": make sure class name exists, is public, and has an");
			((StringBuilder) (bundle)).append(" empty constructor that is public");
			throw new InstantiationException(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			bundle = ((Bundle) (new StringBuilder()));
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
			((StringBuilder) (bundle)).append(s);
			((StringBuilder) (bundle)).append(": make sure class name exists, is public, and has an");
			((StringBuilder) (bundle)).append(" empty constructor that is public");
			throw new InstantiationException(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			bundle = ((Bundle) (new StringBuilder()));
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
			((StringBuilder) (bundle)).append(s);
			((StringBuilder) (bundle)).append(": could not find Fragment constructor");
			throw new InstantiationException(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			bundle = ((Bundle) (new StringBuilder()));
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
			((StringBuilder) (bundle)).append(s);
			((StringBuilder) (bundle)).append(": calling Fragment constructor caused an exception");
			throw new InstantiationException(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
		}
		class1 = class2;
		if(class2 != null)
			break MISSING_BLOCK_LABEL_38;
		class1 = context.getClassLoader().loadClass(s);
		sClassMap.put(((Object) (s)), ((Object) (class1)));
		context = ((Context) ((Fragment)class1.getConstructor(new Class[0]).newInstance(new Object[0])));
		if(bundle == null)
			break MISSING_BLOCK_LABEL_77;
		bundle.setClassLoader(((Object) (context)).getClass().getClassLoader());
		((Fragment) (context)).setArguments(bundle);
		return ((Fragment) (context));
	}

	static boolean isSupportFragmentClass(Context context, String s)
	{
		boolean flag;
		Class class1;
		Class class2;
		try
		{
			class2 = (Class)sClassMap.get(((Object) (s)));
	//    0    0:getstatic       #122 <Field SimpleArrayMap sClassMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #182 <Method Object SimpleArrayMap.get(Object)>
	//    3    7:checkcast       #184 <Class Class>
	//    4   10:astore          4
		}
	//*   5   12:aload           4
	//*   6   14:astore_3        
	//*   7   15:aload           4
	//*   8   17:ifnonnull       38
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #190 <Method ClassLoader Context.getClassLoader()>
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #196 <Method Class ClassLoader.loadClass(String)>
	//*  13   28:astore_3        
	//*  14   29:getstatic       #122 <Field SimpleArrayMap sClassMap>
	//*  15   32:aload_1         
	//*  16   33:aload_3         
	//*  17   34:invokevirtual   #200 <Method Object SimpleArrayMap.put(Object, Object)>
	//*  18   37:pop             
	//*  19   38:ldc1            #2   <Class Fragment>
	//*  20   40:aload_3         
	//*  21   41:invokevirtual   #256 <Method boolean Class.isAssignableFrom(Class)>
	//*  22   44:istore_2        
	//*  23   45:iload_2         
	//*  24   46:ireturn         
	//*  25   47:iconst_0        
	//*  26   48:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return false;
		}
		class1 = class2;
		if(class2 != null)
			break MISSING_BLOCK_LABEL_38;
		class1 = context.getClassLoader().loadClass(s);
		sClassMap.put(((Object) (s)), ((Object) (class1)));
		flag = ((Class) (android/support/v4/app/Fragment)).isAssignableFrom(class1);
		return flag;
	//*  27   49:astore_0        
	//*  28   50:goto            47
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.print(s);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print("mFragmentId=#");
	//    3    5:aload_3         
	//    4    6:ldc2            #266 <String "mFragmentId=#">
	//    5    9:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(mFragmentId));
	//    6   12:aload_3         
	//    7   13:aload_0         
	//    8   14:getfield        #268 <Field int mFragmentId>
	//    9   17:invokestatic    #274 <Method String Integer.toHexString(int)>
	//   10   20:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(" mContainerId=#");
	//   11   23:aload_3         
	//   12   24:ldc2            #276 <String " mContainerId=#">
	//   13   27:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(mContainerId));
	//   14   30:aload_3         
	//   15   31:aload_0         
	//   16   32:getfield        #278 <Field int mContainerId>
	//   17   35:invokestatic    #274 <Method String Integer.toHexString(int)>
	//   18   38:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(" mTag=");
	//   19   41:aload_3         
	//   20   42:ldc2            #280 <String " mTag=">
	//   21   45:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.println(mTag);
	//   22   48:aload_3         
	//   23   49:aload_0         
	//   24   50:getfield        #282 <Field String mTag>
	//   25   53:invokevirtual   #285 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   26   56:aload_3         
	//   27   57:aload_1         
	//   28   58:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print("mState=");
	//   29   61:aload_3         
	//   30   62:ldc2            #287 <String "mState=">
	//   31   65:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mState);
	//   32   68:aload_3         
	//   33   69:aload_0         
	//   34   70:getfield        #128 <Field int mState>
	//   35   73:invokevirtual   #290 <Method void PrintWriter.print(int)>
		printwriter.print(" mIndex=");
	//   36   76:aload_3         
	//   37   77:ldc2            #292 <String " mIndex=">
	//   38   80:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mIndex);
	//   39   83:aload_3         
	//   40   84:aload_0         
	//   41   85:getfield        #130 <Field int mIndex>
	//   42   88:invokevirtual   #290 <Method void PrintWriter.print(int)>
		printwriter.print(" mWho=");
	//   43   91:aload_3         
	//   44   92:ldc2            #294 <String " mWho=">
	//   45   95:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mWho);
	//   46   98:aload_3         
	//   47   99:aload_0         
	//   48  100:getfield        #296 <Field String mWho>
	//   49  103:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(" mBackStackNesting=");
	//   50  106:aload_3         
	//   51  107:ldc2            #298 <String " mBackStackNesting=">
	//   52  110:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.println(mBackStackNesting);
	//   53  113:aload_3         
	//   54  114:aload_0         
	//   55  115:getfield        #300 <Field int mBackStackNesting>
	//   56  118:invokevirtual   #302 <Method void PrintWriter.println(int)>
		printwriter.print(s);
	//   57  121:aload_3         
	//   58  122:aload_1         
	//   59  123:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print("mAdded=");
	//   60  126:aload_3         
	//   61  127:ldc2            #304 <String "mAdded=">
	//   62  130:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mAdded);
	//   63  133:aload_3         
	//   64  134:aload_0         
	//   65  135:getfield        #306 <Field boolean mAdded>
	//   66  138:invokevirtual   #309 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRemoving=");
	//   67  141:aload_3         
	//   68  142:ldc2            #311 <String " mRemoving=">
	//   69  145:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mRemoving);
	//   70  148:aload_3         
	//   71  149:aload_0         
	//   72  150:getfield        #313 <Field boolean mRemoving>
	//   73  153:invokevirtual   #309 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mFromLayout=");
	//   74  156:aload_3         
	//   75  157:ldc2            #315 <String " mFromLayout=">
	//   76  160:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mFromLayout);
	//   77  163:aload_3         
	//   78  164:aload_0         
	//   79  165:getfield        #317 <Field boolean mFromLayout>
	//   80  168:invokevirtual   #309 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mInLayout=");
	//   81  171:aload_3         
	//   82  172:ldc2            #319 <String " mInLayout=">
	//   83  175:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.println(mInLayout);
	//   84  178:aload_3         
	//   85  179:aload_0         
	//   86  180:getfield        #321 <Field boolean mInLayout>
	//   87  183:invokevirtual   #323 <Method void PrintWriter.println(boolean)>
		printwriter.print(s);
	//   88  186:aload_3         
	//   89  187:aload_1         
	//   90  188:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print("mHidden=");
	//   91  191:aload_3         
	//   92  192:ldc2            #325 <String "mHidden=">
	//   93  195:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mHidden);
	//   94  198:aload_3         
	//   95  199:aload_0         
	//   96  200:getfield        #327 <Field boolean mHidden>
	//   97  203:invokevirtual   #309 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDetached=");
	//   98  206:aload_3         
	//   99  207:ldc2            #329 <String " mDetached=">
	//  100  210:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mDetached);
	//  101  213:aload_3         
	//  102  214:aload_0         
	//  103  215:getfield        #331 <Field boolean mDetached>
	//  104  218:invokevirtual   #309 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mMenuVisible=");
	//  105  221:aload_3         
	//  106  222:ldc2            #333 <String " mMenuVisible=">
	//  107  225:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mMenuVisible);
	//  108  228:aload_3         
	//  109  229:aload_0         
	//  110  230:getfield        #134 <Field boolean mMenuVisible>
	//  111  233:invokevirtual   #309 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mHasMenu=");
	//  112  236:aload_3         
	//  113  237:ldc2            #335 <String " mHasMenu=">
	//  114  240:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.println(mHasMenu);
	//  115  243:aload_3         
	//  116  244:aload_0         
	//  117  245:getfield        #337 <Field boolean mHasMenu>
	//  118  248:invokevirtual   #323 <Method void PrintWriter.println(boolean)>
		printwriter.print(s);
	//  119  251:aload_3         
	//  120  252:aload_1         
	//  121  253:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print("mRetainInstance=");
	//  122  256:aload_3         
	//  123  257:ldc2            #339 <String "mRetainInstance=">
	//  124  260:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mRetainInstance);
	//  125  263:aload_3         
	//  126  264:aload_0         
	//  127  265:getfield        #341 <Field boolean mRetainInstance>
	//  128  268:invokevirtual   #309 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRetaining=");
	//  129  271:aload_3         
	//  130  272:ldc2            #343 <String " mRetaining=">
	//  131  275:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.print(mRetaining);
	//  132  278:aload_3         
	//  133  279:aload_0         
	//  134  280:getfield        #345 <Field boolean mRetaining>
	//  135  283:invokevirtual   #309 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mUserVisibleHint=");
	//  136  286:aload_3         
	//  137  287:ldc2            #347 <String " mUserVisibleHint=">
	//  138  290:invokevirtual   #264 <Method void PrintWriter.print(String)>
		printwriter.println(mUserVisibleHint);
	//  139  293:aload_3         
	//  140  294:aload_0         
	//  141  295:getfield        #136 <Field boolean mUserVisibleHint>
	//  142  298:invokevirtual   #323 <Method void PrintWriter.println(boolean)>
		if(mFragmentManager != null)
	//* 143  301:aload_0         
	//* 144  302:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//* 145  305:ifnull          328
		{
			printwriter.print(s);
	//  146  308:aload_3         
	//  147  309:aload_1         
	//  148  310:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mFragmentManager=");
	//  149  313:aload_3         
	//  150  314:ldc2            #351 <String "mFragmentManager=">
	//  151  317:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mFragmentManager)));
	//  152  320:aload_3         
	//  153  321:aload_0         
	//  154  322:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//  155  325:invokevirtual   #354 <Method void PrintWriter.println(Object)>
		}
		if(mHost != null)
	//* 156  328:aload_0         
	//* 157  329:getfield        #356 <Field FragmentHostCallback mHost>
	//* 158  332:ifnull          355
		{
			printwriter.print(s);
	//  159  335:aload_3         
	//  160  336:aload_1         
	//  161  337:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mHost=");
	//  162  340:aload_3         
	//  163  341:ldc2            #358 <String "mHost=">
	//  164  344:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mHost)));
	//  165  347:aload_3         
	//  166  348:aload_0         
	//  167  349:getfield        #356 <Field FragmentHostCallback mHost>
	//  168  352:invokevirtual   #354 <Method void PrintWriter.println(Object)>
		}
		if(mParentFragment != null)
	//* 169  355:aload_0         
	//* 170  356:getfield        #360 <Field Fragment mParentFragment>
	//* 171  359:ifnull          382
		{
			printwriter.print(s);
	//  172  362:aload_3         
	//  173  363:aload_1         
	//  174  364:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mParentFragment=");
	//  175  367:aload_3         
	//  176  368:ldc2            #362 <String "mParentFragment=">
	//  177  371:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParentFragment)));
	//  178  374:aload_3         
	//  179  375:aload_0         
	//  180  376:getfield        #360 <Field Fragment mParentFragment>
	//  181  379:invokevirtual   #354 <Method void PrintWriter.println(Object)>
		}
		if(mArguments != null)
	//* 182  382:aload_0         
	//* 183  383:getfield        #364 <Field Bundle mArguments>
	//* 184  386:ifnull          409
		{
			printwriter.print(s);
	//  185  389:aload_3         
	//  186  390:aload_1         
	//  187  391:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mArguments=");
	//  188  394:aload_3         
	//  189  395:ldc2            #366 <String "mArguments=">
	//  190  398:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mArguments)));
	//  191  401:aload_3         
	//  192  402:aload_0         
	//  193  403:getfield        #364 <Field Bundle mArguments>
	//  194  406:invokevirtual   #354 <Method void PrintWriter.println(Object)>
		}
		if(mSavedFragmentState != null)
	//* 195  409:aload_0         
	//* 196  410:getfield        #368 <Field Bundle mSavedFragmentState>
	//* 197  413:ifnull          436
		{
			printwriter.print(s);
	//  198  416:aload_3         
	//  199  417:aload_1         
	//  200  418:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mSavedFragmentState=");
	//  201  421:aload_3         
	//  202  422:ldc2            #370 <String "mSavedFragmentState=">
	//  203  425:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mSavedFragmentState)));
	//  204  428:aload_3         
	//  205  429:aload_0         
	//  206  430:getfield        #368 <Field Bundle mSavedFragmentState>
	//  207  433:invokevirtual   #354 <Method void PrintWriter.println(Object)>
		}
		if(mSavedViewState != null)
	//* 208  436:aload_0         
	//* 209  437:getfield        #372 <Field SparseArray mSavedViewState>
	//* 210  440:ifnull          463
		{
			printwriter.print(s);
	//  211  443:aload_3         
	//  212  444:aload_1         
	//  213  445:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mSavedViewState=");
	//  214  448:aload_3         
	//  215  449:ldc2            #374 <String "mSavedViewState=">
	//  216  452:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mSavedViewState)));
	//  217  455:aload_3         
	//  218  456:aload_0         
	//  219  457:getfield        #372 <Field SparseArray mSavedViewState>
	//  220  460:invokevirtual   #354 <Method void PrintWriter.println(Object)>
		}
		if(mTarget != null)
	//* 221  463:aload_0         
	//* 222  464:getfield        #376 <Field Fragment mTarget>
	//* 223  467:ifnull          505
		{
			printwriter.print(s);
	//  224  470:aload_3         
	//  225  471:aload_1         
	//  226  472:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mTarget=");
	//  227  475:aload_3         
	//  228  476:ldc2            #378 <String "mTarget=">
	//  229  479:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print(((Object) (mTarget)));
	//  230  482:aload_3         
	//  231  483:aload_0         
	//  232  484:getfield        #376 <Field Fragment mTarget>
	//  233  487:invokevirtual   #380 <Method void PrintWriter.print(Object)>
			printwriter.print(" mTargetRequestCode=");
	//  234  490:aload_3         
	//  235  491:ldc2            #382 <String " mTargetRequestCode=">
	//  236  494:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(mTargetRequestCode);
	//  237  497:aload_3         
	//  238  498:aload_0         
	//  239  499:getfield        #384 <Field int mTargetRequestCode>
	//  240  502:invokevirtual   #302 <Method void PrintWriter.println(int)>
		}
		if(getNextAnim() != 0)
	//* 241  505:aload_0         
	//* 242  506:invokevirtual   #388 <Method int getNextAnim()>
	//* 243  509:ifeq            532
		{
			printwriter.print(s);
	//  244  512:aload_3         
	//  245  513:aload_1         
	//  246  514:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mNextAnim=");
	//  247  517:aload_3         
	//  248  518:ldc2            #390 <String "mNextAnim=">
	//  249  521:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(getNextAnim());
	//  250  524:aload_3         
	//  251  525:aload_0         
	//  252  526:invokevirtual   #388 <Method int getNextAnim()>
	//  253  529:invokevirtual   #302 <Method void PrintWriter.println(int)>
		}
		if(mContainer != null)
	//* 254  532:aload_0         
	//* 255  533:getfield        #392 <Field ViewGroup mContainer>
	//* 256  536:ifnull          559
		{
			printwriter.print(s);
	//  257  539:aload_3         
	//  258  540:aload_1         
	//  259  541:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mContainer=");
	//  260  544:aload_3         
	//  261  545:ldc2            #394 <String "mContainer=">
	//  262  548:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mContainer)));
	//  263  551:aload_3         
	//  264  552:aload_0         
	//  265  553:getfield        #392 <Field ViewGroup mContainer>
	//  266  556:invokevirtual   #354 <Method void PrintWriter.println(Object)>
		}
		if(mView != null)
	//* 267  559:aload_0         
	//* 268  560:getfield        #396 <Field View mView>
	//* 269  563:ifnull          586
		{
			printwriter.print(s);
	//  270  566:aload_3         
	//  271  567:aload_1         
	//  272  568:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mView=");
	//  273  571:aload_3         
	//  274  572:ldc2            #398 <String "mView=">
	//  275  575:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mView)));
	//  276  578:aload_3         
	//  277  579:aload_0         
	//  278  580:getfield        #396 <Field View mView>
	//  279  583:invokevirtual   #354 <Method void PrintWriter.println(Object)>
		}
		if(mInnerView != null)
	//* 280  586:aload_0         
	//* 281  587:getfield        #400 <Field View mInnerView>
	//* 282  590:ifnull          613
		{
			printwriter.print(s);
	//  283  593:aload_3         
	//  284  594:aload_1         
	//  285  595:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mInnerView=");
	//  286  598:aload_3         
	//  287  599:ldc2            #402 <String "mInnerView=">
	//  288  602:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mView)));
	//  289  605:aload_3         
	//  290  606:aload_0         
	//  291  607:getfield        #396 <Field View mView>
	//  292  610:invokevirtual   #354 <Method void PrintWriter.println(Object)>
		}
		if(getAnimatingAway() != null)
	//* 293  613:aload_0         
	//* 294  614:invokevirtual   #406 <Method View getAnimatingAway()>
	//* 295  617:ifnull          660
		{
			printwriter.print(s);
	//  296  620:aload_3         
	//  297  621:aload_1         
	//  298  622:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mAnimatingAway=");
	//  299  625:aload_3         
	//  300  626:ldc2            #408 <String "mAnimatingAway=">
	//  301  629:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (getAnimatingAway())));
	//  302  632:aload_3         
	//  303  633:aload_0         
	//  304  634:invokevirtual   #406 <Method View getAnimatingAway()>
	//  305  637:invokevirtual   #354 <Method void PrintWriter.println(Object)>
			printwriter.print(s);
	//  306  640:aload_3         
	//  307  641:aload_1         
	//  308  642:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.print("mStateAfterAnimating=");
	//  309  645:aload_3         
	//  310  646:ldc2            #410 <String "mStateAfterAnimating=">
	//  311  649:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println(getStateAfterAnimating());
	//  312  652:aload_3         
	//  313  653:aload_0         
	//  314  654:invokevirtual   #413 <Method int getStateAfterAnimating()>
	//  315  657:invokevirtual   #302 <Method void PrintWriter.println(int)>
		}
		if(mLoaderManager != null)
	//* 316  660:aload_0         
	//* 317  661:getfield        #415 <Field LoaderManagerImpl mLoaderManager>
	//* 318  664:ifnull          724
		{
			printwriter.print(s);
	//  319  667:aload_3         
	//  320  668:aload_1         
	//  321  669:invokevirtual   #264 <Method void PrintWriter.print(String)>
			printwriter.println("Loader Manager:");
	//  322  672:aload_3         
	//  323  673:ldc2            #417 <String "Loader Manager:">
	//  324  676:invokevirtual   #285 <Method void PrintWriter.println(String)>
			LoaderManagerImpl loadermanagerimpl = mLoaderManager;
	//  325  679:aload_0         
	//  326  680:getfield        #415 <Field LoaderManagerImpl mLoaderManager>
	//  327  683:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//  328  685:new             #227 <Class StringBuilder>
	//  329  688:dup             
	//  330  689:invokespecial   #228 <Method void StringBuilder()>
	//  331  692:astore          6
			stringbuilder.append(s);
	//  332  694:aload           6
	//  333  696:aload_1         
	//  334  697:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  335  700:pop             
			stringbuilder.append("  ");
	//  336  701:aload           6
	//  337  703:ldc2            #419 <String "  ">
	//  338  706:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  339  709:pop             
			loadermanagerimpl.dump(stringbuilder.toString(), filedescriptor, printwriter, as);
	//  340  710:aload           5
	//  341  712:aload           6
	//  342  714:invokevirtual   #240 <Method String StringBuilder.toString()>
	//  343  717:aload_2         
	//  344  718:aload_3         
	//  345  719:aload           4
	//  346  721:invokevirtual   #423 <Method void LoaderManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
		}
		if(mChildFragmentManager != null)
	//* 347  724:aload_0         
	//* 348  725:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//* 349  728:ifnull          827
		{
			printwriter.print(s);
	//  350  731:aload_3         
	//  351  732:aload_1         
	//  352  733:invokevirtual   #264 <Method void PrintWriter.print(String)>
			Object obj = ((Object) (new StringBuilder()));
	//  353  736:new             #227 <Class StringBuilder>
	//  354  739:dup             
	//  355  740:invokespecial   #228 <Method void StringBuilder()>
	//  356  743:astore          5
			((StringBuilder) (obj)).append("Child ");
	//  357  745:aload           5
	//  358  747:ldc2            #427 <String "Child ">
	//  359  750:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  360  753:pop             
			((StringBuilder) (obj)).append(((Object) (mChildFragmentManager)));
	//  361  754:aload           5
	//  362  756:aload_0         
	//  363  757:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//  364  760:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//  365  763:pop             
			((StringBuilder) (obj)).append(":");
	//  366  764:aload           5
	//  367  766:ldc2            #432 <String ":">
	//  368  769:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  369  772:pop             
			printwriter.println(((StringBuilder) (obj)).toString());
	//  370  773:aload_3         
	//  371  774:aload           5
	//  372  776:invokevirtual   #240 <Method String StringBuilder.toString()>
	//  373  779:invokevirtual   #285 <Method void PrintWriter.println(String)>
			obj = ((Object) (mChildFragmentManager));
	//  374  782:aload_0         
	//  375  783:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//  376  786:astore          5
			StringBuilder stringbuilder1 = new StringBuilder();
	//  377  788:new             #227 <Class StringBuilder>
	//  378  791:dup             
	//  379  792:invokespecial   #228 <Method void StringBuilder()>
	//  380  795:astore          6
			stringbuilder1.append(s);
	//  381  797:aload           6
	//  382  799:aload_1         
	//  383  800:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  384  803:pop             
			stringbuilder1.append("  ");
	//  385  804:aload           6
	//  386  806:ldc2            #419 <String "  ">
	//  387  809:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//  388  812:pop             
			((FragmentManagerImpl) (obj)).dump(stringbuilder1.toString(), filedescriptor, printwriter, as);
	//  389  813:aload           5
	//  390  815:aload           6
	//  391  817:invokevirtual   #240 <Method String StringBuilder.toString()>
	//  392  820:aload_2         
	//  393  821:aload_3         
	//  394  822:aload           4
	//  395  824:invokevirtual   #435 <Method void FragmentManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
		}
	//  396  827:return          
	}

	public final boolean equals(Object obj)
	{
		return super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method boolean Object.equals(Object)>
	//    3    5:ireturn         
	}

	Fragment findFragmentByWho(String s)
	{
		if(s.equals(((Object) (mWho))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #296 <Field String mWho>
	//*   3    5:invokevirtual   #444 <Method boolean String.equals(Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		if(mChildFragmentManager != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   9   17:ifnull          29
			return mChildFragmentManager.findFragmentByWho(s);
	//   10   20:aload_0         
	//   11   21:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #446 <Method Fragment FragmentManagerImpl.findFragmentByWho(String)>
	//   14   28:areturn         
		else
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
	}

	public final FragmentActivity getActivity()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (FragmentActivity)mHost.getActivity();
	//    5    9:aload_0         
	//    6   10:getfield        #356 <Field FragmentHostCallback mHost>
	//    7   13:invokevirtual   #453 <Method Activity FragmentHostCallback.getActivity()>
	//    8   16:checkcast       #455 <Class FragmentActivity>
	//    9   19:areturn         
	}

	public boolean getAllowEnterTransitionOverlap()
	{
		if(mAnimationInfo != null && mAnimationInfo.mAllowEnterTransitionOverlap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnull          31
	//*   3    7:aload_0         
	//*   4    8:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   5   11:invokestatic    #462 <Method Boolean Fragment$AnimationInfo.access$600(Fragment$AnimationInfo)>
	//*   6   14:ifnonnull       20
	//*   7   17:goto            31
			return mAnimationInfo.mAllowEnterTransitionOverlap.booleanValue();
	//    8   20:aload_0         
	//    9   21:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   10   24:invokestatic    #462 <Method Boolean Fragment$AnimationInfo.access$600(Fragment$AnimationInfo)>
	//   11   27:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//   12   30:ireturn         
		else
			return true;
	//   13   31:iconst_1        
	//   14   32:ireturn         
	}

	public boolean getAllowReturnTransitionOverlap()
	{
		if(mAnimationInfo != null && mAnimationInfo.mAllowReturnTransitionOverlap != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnull          31
	//*   3    7:aload_0         
	//*   4    8:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   5   11:invokestatic    #471 <Method Boolean Fragment$AnimationInfo.access$700(Fragment$AnimationInfo)>
	//*   6   14:ifnonnull       20
	//*   7   17:goto            31
			return mAnimationInfo.mAllowReturnTransitionOverlap.booleanValue();
	//    8   20:aload_0         
	//    9   21:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   10   24:invokestatic    #471 <Method Boolean Fragment$AnimationInfo.access$700(Fragment$AnimationInfo)>
	//   11   27:invokevirtual   #467 <Method boolean Boolean.booleanValue()>
	//   12   30:ireturn         
		else
			return true;
	//   13   31:iconst_1        
	//   14   32:ireturn         
	}

	View getAnimatingAway()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mAnimatingAway;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #474 <Field View Fragment$AnimationInfo.mAnimatingAway>
	//    8   16:areturn         
	}

	Animator getAnimator()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mAnimator;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #480 <Field Animator Fragment$AnimationInfo.mAnimator>
	//    8   16:areturn         
	}

	public final Bundle getArguments()
	{
		return mArguments;
	//    0    0:aload_0         
	//    1    1:getfield        #364 <Field Bundle mArguments>
	//    2    4:areturn         
	}

	public final FragmentManager getChildFragmentManager()
	{
		if(mChildFragmentManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnonnull       80
		{
			instantiateChildFragmentManager();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #488 <Method void instantiateChildFragmentManager()>
			if(mState >= 5)
	//*   5   11:aload_0         
	//*   6   12:getfield        #128 <Field int mState>
	//*   7   15:iconst_5        
	//*   8   16:icmplt          29
				mChildFragmentManager.dispatchResume();
	//    9   19:aload_0         
	//   10   20:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   11   23:invokevirtual   #491 <Method void FragmentManagerImpl.dispatchResume()>
			else
	//*  12   26:goto            80
			if(mState >= 4)
	//*  13   29:aload_0         
	//*  14   30:getfield        #128 <Field int mState>
	//*  15   33:iconst_4        
	//*  16   34:icmplt          47
				mChildFragmentManager.dispatchStart();
	//   17   37:aload_0         
	//   18   38:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   19   41:invokevirtual   #494 <Method void FragmentManagerImpl.dispatchStart()>
			else
	//*  20   44:goto            80
			if(mState >= 2)
	//*  21   47:aload_0         
	//*  22   48:getfield        #128 <Field int mState>
	//*  23   51:iconst_2        
	//*  24   52:icmplt          65
				mChildFragmentManager.dispatchActivityCreated();
	//   25   55:aload_0         
	//   26   56:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   27   59:invokevirtual   #497 <Method void FragmentManagerImpl.dispatchActivityCreated()>
			else
	//*  28   62:goto            80
			if(mState >= 1)
	//*  29   65:aload_0         
	//*  30   66:getfield        #128 <Field int mState>
	//*  31   69:iconst_1        
	//*  32   70:icmplt          80
				mChildFragmentManager.dispatchCreate();
	//   33   73:aload_0         
	//   34   74:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   35   77:invokevirtual   #500 <Method void FragmentManagerImpl.dispatchCreate()>
		}
		return ((FragmentManager) (mChildFragmentManager));
	//   36   80:aload_0         
	//   37   81:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   38   84:areturn         
	}

	public Context getContext()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mHost.getContext();
	//    5    9:aload_0         
	//    6   10:getfield        #356 <Field FragmentHostCallback mHost>
	//    7   13:invokevirtual   #504 <Method Context FragmentHostCallback.getContext()>
	//    8   16:areturn         
	}

	public Object getEnterTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mEnterTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:invokestatic    #510 <Method Object Fragment$AnimationInfo.access$000(Fragment$AnimationInfo)>
	//    8   16:areturn         
	}

	SharedElementCallback getEnterTransitionCallback()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mEnterTransitionCallback;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #516 <Field SharedElementCallback Fragment$AnimationInfo.mEnterTransitionCallback>
	//    8   16:areturn         
	}

	public Object getExitTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mExitTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:invokestatic    #520 <Method Object Fragment$AnimationInfo.access$200(Fragment$AnimationInfo)>
	//    8   16:areturn         
	}

	SharedElementCallback getExitTransitionCallback()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mExitTransitionCallback;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #524 <Field SharedElementCallback Fragment$AnimationInfo.mExitTransitionCallback>
	//    8   16:areturn         
	}

	public final FragmentManager getFragmentManager()
	{
		return ((FragmentManager) (mFragmentManager));
	//    0    0:aload_0         
	//    1    1:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//    2    4:areturn         
	}

	public final Object getHost()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mHost.onGetHost();
	//    5    9:aload_0         
	//    6   10:getfield        #356 <Field FragmentHostCallback mHost>
	//    7   13:invokevirtual   #529 <Method Object FragmentHostCallback.onGetHost()>
	//    8   16:areturn         
	}

	public final int getId()
	{
		return mFragmentId;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field int mFragmentId>
	//    2    4:ireturn         
	}

	public final LayoutInflater getLayoutInflater()
	{
		if(mLayoutInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #534 <Field LayoutInflater mLayoutInflater>
	//*   2    4:ifnonnull       13
			return performGetLayoutInflater(((Bundle) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #538 <Method LayoutInflater performGetLayoutInflater(Bundle)>
	//    6   12:areturn         
		else
			return mLayoutInflater;
	//    7   13:aload_0         
	//    8   14:getfield        #534 <Field LayoutInflater mLayoutInflater>
	//    9   17:areturn         
	}

	public LayoutInflater getLayoutInflater(Bundle bundle)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       18
		{
			throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
	//    3    7:new             #545 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #547 <String "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.">
	//    6   14:invokespecial   #549 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			bundle = ((Bundle) (mHost.onGetLayoutInflater()));
	//    8   18:aload_0         
	//    9   19:getfield        #356 <Field FragmentHostCallback mHost>
	//   10   22:invokevirtual   #552 <Method LayoutInflater FragmentHostCallback.onGetLayoutInflater()>
	//   11   25:astore_1        
			getChildFragmentManager();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #554 <Method FragmentManager getChildFragmentManager()>
	//   14   30:pop             
			LayoutInflaterCompat.setFactory2(((LayoutInflater) (bundle)), mChildFragmentManager.getLayoutInflaterFactory());
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   18   36:invokevirtual   #558 <Method android.view.LayoutInflater$Factory2 FragmentManagerImpl.getLayoutInflaterFactory()>
	//   19   39:invokestatic    #564 <Method void LayoutInflaterCompat.setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return ((LayoutInflater) (bundle));
	//   20   42:aload_1         
	//   21   43:areturn         
		}
	}

	public Lifecycle getLifecycle()
	{
		return ((Lifecycle) (mLifecycleRegistry));
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field LifecycleRegistry mLifecycleRegistry>
	//    2    4:areturn         
	}

	public LoaderManager getLoaderManager()
	{
		if(mLoaderManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #415 <Field LoaderManagerImpl mLoaderManager>
	//*   2    4:ifnull          12
		{
			return ((LoaderManager) (mLoaderManager));
	//    3    7:aload_0         
	//    4    8:getfield        #415 <Field LoaderManagerImpl mLoaderManager>
	//    5   11:areturn         
		} else
		{
			mLoaderManager = new LoaderManagerImpl(((LifecycleOwner) (this)), getViewModelStore());
	//    6   12:aload_0         
	//    7   13:new             #421 <Class LoaderManagerImpl>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #573 <Method ViewModelStore getViewModelStore()>
	//   12   22:invokespecial   #576 <Method void LoaderManagerImpl(LifecycleOwner, ViewModelStore)>
	//   13   25:putfield        #415 <Field LoaderManagerImpl mLoaderManager>
			return ((LoaderManager) (mLoaderManager));
	//   14   28:aload_0         
	//   15   29:getfield        #415 <Field LoaderManagerImpl mLoaderManager>
	//   16   32:areturn         
		}
	}

	int getNextAnim()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mNextAnim;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #579 <Field int Fragment$AnimationInfo.mNextAnim>
	//    8   16:ireturn         
	}

	int getNextTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mNextTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #583 <Field int Fragment$AnimationInfo.mNextTransition>
	//    8   16:ireturn         
	}

	int getNextTransitionStyle()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mNextTransitionStyle;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #587 <Field int Fragment$AnimationInfo.mNextTransitionStyle>
	//    8   16:ireturn         
	}

	public final Fragment getParentFragment()
	{
		return mParentFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #360 <Field Fragment mParentFragment>
	//    2    4:areturn         
	}

	public Object getReenterTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mAnimationInfo.mReenterTransition == USE_DEFAULT_TRANSITION)
	//*   5    9:aload_0         
	//*   6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   7   13:invokestatic    #593 <Method Object Fragment$AnimationInfo.access$300(Fragment$AnimationInfo)>
	//*   8   16:getstatic       #125 <Field Object USE_DEFAULT_TRANSITION>
	//*   9   19:if_acmpne       27
			return getExitTransition();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #595 <Method Object getExitTransition()>
	//   12   26:areturn         
		else
			return mAnimationInfo.mReenterTransition;
	//   13   27:aload_0         
	//   14   28:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   15   31:invokestatic    #593 <Method Object Fragment$AnimationInfo.access$300(Fragment$AnimationInfo)>
	//   16   34:areturn         
	}

	public final Resources getResources()
	{
		return requireContext().getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #600 <Method Context requireContext()>
	//    2    4:invokevirtual   #602 <Method Resources Context.getResources()>
	//    3    7:areturn         
	}

	public final boolean getRetainInstance()
	{
		return mRetainInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #341 <Field boolean mRetainInstance>
	//    2    4:ireturn         
	}

	public Object getReturnTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mAnimationInfo.mReturnTransition == USE_DEFAULT_TRANSITION)
	//*   5    9:aload_0         
	//*   6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   7   13:invokestatic    #607 <Method Object Fragment$AnimationInfo.access$100(Fragment$AnimationInfo)>
	//*   8   16:getstatic       #125 <Field Object USE_DEFAULT_TRANSITION>
	//*   9   19:if_acmpne       27
			return getEnterTransition();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #609 <Method Object getEnterTransition()>
	//   12   26:areturn         
		else
			return mAnimationInfo.mReturnTransition;
	//   13   27:aload_0         
	//   14   28:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   15   31:invokestatic    #607 <Method Object Fragment$AnimationInfo.access$100(Fragment$AnimationInfo)>
	//   16   34:areturn         
	}

	public Object getSharedElementEnterTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mSharedElementEnterTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:invokestatic    #613 <Method Object Fragment$AnimationInfo.access$400(Fragment$AnimationInfo)>
	//    8   16:areturn         
	}

	public Object getSharedElementReturnTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mAnimationInfo.mSharedElementReturnTransition == USE_DEFAULT_TRANSITION)
	//*   5    9:aload_0         
	//*   6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   7   13:invokestatic    #617 <Method Object Fragment$AnimationInfo.access$500(Fragment$AnimationInfo)>
	//*   8   16:getstatic       #125 <Field Object USE_DEFAULT_TRANSITION>
	//*   9   19:if_acmpne       27
			return getSharedElementEnterTransition();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #619 <Method Object getSharedElementEnterTransition()>
	//   12   26:areturn         
		else
			return mAnimationInfo.mSharedElementReturnTransition;
	//   13   27:aload_0         
	//   14   28:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   15   31:invokestatic    #617 <Method Object Fragment$AnimationInfo.access$500(Fragment$AnimationInfo)>
	//   16   34:areturn         
	}

	int getStateAfterAnimating()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mStateAfterAnimating;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #622 <Field int Fragment$AnimationInfo.mStateAfterAnimating>
	//    8   16:ireturn         
	}

	public final String getString(int i)
	{
		return getResources().getString(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #625 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #629 <Method String Resources.getString(int)>
	//    4    8:areturn         
	}

	public final transient String getString(int i, Object aobj[])
	{
		return getResources().getString(i, aobj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #625 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #632 <Method String Resources.getString(int, Object[])>
	//    5    9:areturn         
	}

	public final String getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field String mTag>
	//    2    4:areturn         
	}

	public final Fragment getTargetFragment()
	{
		return mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #376 <Field Fragment mTarget>
	//    2    4:areturn         
	}

	public final int getTargetRequestCode()
	{
		return mTargetRequestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #384 <Field int mTargetRequestCode>
	//    2    4:ireturn         
	}

	public final CharSequence getText(int i)
	{
		return getResources().getText(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #625 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #639 <Method CharSequence Resources.getText(int)>
	//    4    8:areturn         
	}

	public boolean getUserVisibleHint()
	{
		return mUserVisibleHint;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field boolean mUserVisibleHint>
	//    2    4:ireturn         
	}

	public View getView()
	{
		return mView;
	//    0    0:aload_0         
	//    1    1:getfield        #396 <Field View mView>
	//    2    4:areturn         
	}

	public ViewModelStore getViewModelStore()
	{
		if(getContext() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #642 <Method Context getContext()>
	//*   2    4:ifnonnull       18
			throw new IllegalStateException("Can't access ViewModels from detached fragment");
	//    3    7:new             #545 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #644 <String "Can't access ViewModels from detached fragment">
	//    6   14:invokespecial   #549 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mViewModelStore == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #646 <Field ViewModelStore mViewModelStore>
	//*  10   22:ifnonnull       36
			mViewModelStore = new ViewModelStore();
	//   11   25:aload_0         
	//   12   26:new             #648 <Class ViewModelStore>
	//   13   29:dup             
	//   14   30:invokespecial   #649 <Method void ViewModelStore()>
	//   15   33:putfield        #646 <Field ViewModelStore mViewModelStore>
		return mViewModelStore;
	//   16   36:aload_0         
	//   17   37:getfield        #646 <Field ViewModelStore mViewModelStore>
	//   18   40:areturn         
	}

	public final boolean hasOptionsMenu()
	{
		return mHasMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #337 <Field boolean mHasMenu>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #653 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	void initState()
	{
		mIndex = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #130 <Field int mIndex>
		mWho = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #296 <Field String mWho>
		mAdded = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #306 <Field boolean mAdded>
		mRemoving = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #313 <Field boolean mRemoving>
		mFromLayout = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #317 <Field boolean mFromLayout>
		mInLayout = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #321 <Field boolean mInLayout>
		mRestored = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #656 <Field boolean mRestored>
		mBackStackNesting = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #300 <Field int mBackStackNesting>
		mFragmentManager = null;
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:putfield        #349 <Field FragmentManagerImpl mFragmentManager>
		mChildFragmentManager = null;
	//   27   45:aload_0         
	//   28   46:aconst_null     
	//   29   47:putfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
		mHost = null;
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:putfield        #356 <Field FragmentHostCallback mHost>
		mFragmentId = 0;
	//   33   55:aload_0         
	//   34   56:iconst_0        
	//   35   57:putfield        #268 <Field int mFragmentId>
		mContainerId = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #278 <Field int mContainerId>
		mTag = null;
	//   39   65:aload_0         
	//   40   66:aconst_null     
	//   41   67:putfield        #282 <Field String mTag>
		mHidden = false;
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:putfield        #327 <Field boolean mHidden>
		mDetached = false;
	//   45   75:aload_0         
	//   46   76:iconst_0        
	//   47   77:putfield        #331 <Field boolean mDetached>
		mRetaining = false;
	//   48   80:aload_0         
	//   49   81:iconst_0        
	//   50   82:putfield        #345 <Field boolean mRetaining>
	//   51   85:return          
	}

	void instantiateChildFragmentManager()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       18
		{
			throw new IllegalStateException("Fragment has not been attached yet.");
	//    3    7:new             #545 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #658 <String "Fragment has not been attached yet.">
	//    6   14:invokespecial   #549 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mChildFragmentManager = new FragmentManagerImpl();
	//    8   18:aload_0         
	//    9   19:new             #434 <Class FragmentManagerImpl>
	//   10   22:dup             
	//   11   23:invokespecial   #659 <Method void FragmentManagerImpl()>
	//   12   26:putfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
			mChildFragmentManager.attachController(mHost, ((FragmentContainer) (new FragmentContainer() {

				public Fragment instantiate(Context context, String s, Bundle bundle)
				{
					return mHost.instantiate(context, s, bundle);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field Fragment this$0>
				//    2    4:getfield        #24  <Field FragmentHostCallback Fragment.mHost>
				//    3    7:aload_1         
				//    4    8:aload_2         
				//    5    9:aload_3         
				//    6   10:invokevirtual   #28  <Method Fragment FragmentHostCallback.instantiate(Context, String, Bundle)>
				//    7   13:areturn         
				}

				public View onFindViewById(int i)
				{
					if(mView == null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #15  <Field Fragment this$0>
				//*   2    4:getfield        #35  <Field View Fragment.mView>
				//*   3    7:ifnonnull       20
						throw new IllegalStateException("Fragment does not have a view");
				//    4   10:new             #37  <Class IllegalStateException>
				//    5   13:dup             
				//    6   14:ldc1            #39  <String "Fragment does not have a view">
				//    7   16:invokespecial   #42  <Method void IllegalStateException(String)>
				//    8   19:athrow          
					else
						return mView.findViewById(i);
				//    9   20:aload_0         
				//   10   21:getfield        #15  <Field Fragment this$0>
				//   11   24:getfield        #35  <Field View Fragment.mView>
				//   12   27:iload_1         
				//   13   28:invokevirtual   #47  <Method View View.findViewById(int)>
				//   14   31:areturn         
				}

				public boolean onHasView()
				{
					return mView != null;
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field Fragment this$0>
				//    2    4:getfield        #35  <Field View Fragment.mView>
				//    3    7:ifnull          12
				//    4   10:iconst_1        
				//    5   11:ireturn         
				//    6   12:iconst_0        
				//    7   13:ireturn         
				}

				final Fragment this$0;

			
			{
				this$0 = Fragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field Fragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void FragmentContainer()>
			//    5    9:return          
			}
			}
)), this);
	//   13   29:aload_0         
	//   14   30:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   15   33:aload_0         
	//   16   34:getfield        #356 <Field FragmentHostCallback mHost>
	//   17   37:new             #16  <Class Fragment$2>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:invokespecial   #661 <Method void Fragment$2(Fragment)>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #665 <Method void FragmentManagerImpl.attachController(FragmentHostCallback, FragmentContainer, Fragment)>
			return;
	//   23   49:return          
		}
	}

	public final boolean isAdded()
	{
		return mHost != null && mAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #306 <Field boolean mAdded>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final boolean isDetached()
	{
		return mDetached;
	//    0    0:aload_0         
	//    1    1:getfield        #331 <Field boolean mDetached>
	//    2    4:ireturn         
	}

	public final boolean isHidden()
	{
		return mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field boolean mHidden>
	//    2    4:ireturn         
	}

	boolean isHideReplaced()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mIsHideReplaced;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #672 <Field boolean Fragment$AnimationInfo.mIsHideReplaced>
	//    8   16:ireturn         
	}

	final boolean isInBackStack()
	{
		return mBackStackNesting > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field int mBackStackNesting>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final boolean isInLayout()
	{
		return mInLayout;
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field boolean mInLayout>
	//    2    4:ireturn         
	}

	public final boolean isMenuVisible()
	{
		return mMenuVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field boolean mMenuVisible>
	//    2    4:ireturn         
	}

	boolean isPostponed()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mEnterTransitionPostponed;
	//    5    9:aload_0         
	//    6   10:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #153 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//    8   16:ireturn         
	}

	public final boolean isRemoving()
	{
		return mRemoving;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field boolean mRemoving>
	//    2    4:ireturn         
	}

	public final boolean isResumed()
	{
		return mState >= 5;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int mState>
	//    2    4:iconst_5        
	//    3    5:icmplt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean isStateSaved()
	{
		if(mFragmentManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mFragmentManager.isStateSaved();
	//    5    9:aload_0         
	//    6   10:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//    7   13:invokevirtual   #681 <Method boolean FragmentManagerImpl.isStateSaved()>
	//    8   16:ireturn         
	}

	public final boolean isVisible()
	{
		return isAdded() && !isHidden() && mView != null && mView.getWindowToken() != null && mView.getVisibility() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #684 <Method boolean isAdded()>
	//    2    4:ifeq            43
	//    3    7:aload_0         
	//    4    8:invokevirtual   #686 <Method boolean isHidden()>
	//    5   11:ifne            43
	//    6   14:aload_0         
	//    7   15:getfield        #396 <Field View mView>
	//    8   18:ifnull          43
	//    9   21:aload_0         
	//   10   22:getfield        #396 <Field View mView>
	//   11   25:invokevirtual   #692 <Method android.os.IBinder View.getWindowToken()>
	//   12   28:ifnull          43
	//   13   31:aload_0         
	//   14   32:getfield        #396 <Field View mView>
	//   15   35:invokevirtual   #695 <Method int View.getVisibility()>
	//   16   38:ifne            43
	//   17   41:iconst_1        
	//   18   42:ireturn         
	//   19   43:iconst_0        
	//   20   44:ireturn         
	}

	void noteStateNotSaved()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #698 <Method void FragmentManagerImpl.noteStateNotSaved()>
	//    6   14:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
	//    0    0:return          
	}

	public void onAttach(Activity activity)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onAttach(Context context)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
		if(mHost == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #356 <Field FragmentHostCallback mHost>
	//*   5    9:ifnonnull       17
			context = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		else
	//*   8   14:goto            25
			context = ((Context) (mHost.getActivity()));
	//    9   17:aload_0         
	//   10   18:getfield        #356 <Field FragmentHostCallback mHost>
	//   11   21:invokevirtual   #453 <Method Activity FragmentHostCallback.getActivity()>
	//   12   24:astore_1        
		if(context != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          39
		{
			mCalled = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #702 <Field boolean mCalled>
			onAttach(((Activity) (context)));
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #709 <Method void onAttach(Activity)>
		}
	//   21   39:return          
	}

	public void onAttachFragment(Fragment fragment)
	{
	//    0    0:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public boolean onContextItemSelected(MenuItem menuitem)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onCreate(Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
		restoreChildFragmentState(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #718 <Method void restoreChildFragmentState(Bundle)>
		if(mChildFragmentManager != null && !mChildFragmentManager.isStateAtLeast(1))
	//*   6   10:aload_0         
	//*   7   11:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   8   14:ifnull          35
	//*   9   17:aload_0         
	//*  10   18:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  11   21:iconst_1        
	//*  12   22:invokevirtual   #722 <Method boolean FragmentManagerImpl.isStateAtLeast(int)>
	//*  13   25:ifne            35
			mChildFragmentManager.dispatchCreate();
	//   14   28:aload_0         
	//   15   29:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   16   32:invokevirtual   #500 <Method void FragmentManagerImpl.dispatchCreate()>
	//   17   35:return          
	}

	public Animation onCreateAnimation(int i, boolean flag, int j)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Animator onCreateAnimator(int i, boolean flag, int j)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
	{
		getActivity().onCreateContextMenu(contextmenu, view, contextmenuinfo);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #730 <Method FragmentActivity getActivity()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #732 <Method void FragmentActivity.onCreateContextMenu(ContextMenu, View, android.view.ContextMenu$ContextMenuInfo)>
	//    6   10:return          
	}

	public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
	//    0    0:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onDestroy()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
		if(mViewModelStore != null && !mHost.mFragmentManager.mStateSaved)
	//*   3    5:aload_0         
	//*   4    6:getfield        #646 <Field ViewModelStore mViewModelStore>
	//*   5    9:ifnull          32
	//*   6   12:aload_0         
	//*   7   13:getfield        #356 <Field FragmentHostCallback mHost>
	//*   8   16:getfield        #738 <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//*   9   19:getfield        #741 <Field boolean FragmentManagerImpl.mStateSaved>
	//*  10   22:ifne            32
			mViewModelStore.clear();
	//   11   25:aload_0         
	//   12   26:getfield        #646 <Field ViewModelStore mViewModelStore>
	//   13   29:invokevirtual   #744 <Method void ViewModelStore.clear()>
	//   14   32:return          
	}

	public void onDestroyOptionsMenu()
	{
	//    0    0:return          
	}

	public void onDestroyView()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onDetach()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public LayoutInflater onGetLayoutInflater(Bundle bundle)
	{
		return getLayoutInflater(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #749 <Method LayoutInflater getLayoutInflater(Bundle)>
	//    3    5:areturn         
	}

	public void onHiddenChanged(boolean flag)
	{
	//    0    0:return          
	}

	public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onInflate(Context context, AttributeSet attributeset, Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
		if(mHost == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #356 <Field FragmentHostCallback mHost>
	//*   5    9:ifnonnull       17
			context = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		else
	//*   8   14:goto            25
			context = ((Context) (mHost.getActivity()));
	//    9   17:aload_0         
	//   10   18:getfield        #356 <Field FragmentHostCallback mHost>
	//   11   21:invokevirtual   #453 <Method Activity FragmentHostCallback.getActivity()>
	//   12   24:astore_1        
		if(context != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          41
		{
			mCalled = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #702 <Field boolean mCalled>
			onInflate(((Activity) (context)), attributeset, bundle);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #755 <Method void onInflate(Activity, AttributeSet, Bundle)>
		}
	//   23   41:return          
	}

	public void onLowMemory()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onMultiWindowModeChanged(boolean flag)
	{
	//    0    0:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onOptionsMenuClosed(Menu menu)
	{
	//    0    0:return          
	}

	public void onPause()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onPictureInPictureModeChanged(boolean flag)
	{
	//    0    0:return          
	}

	public void onPrepareOptionsMenu(Menu menu)
	{
	//    0    0:return          
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
	//    0    0:return          
	}

	public void onResume()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
	//    0    0:return          
	}

	public void onStart()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onStop()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onViewStateRestored(Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #702 <Field boolean mCalled>
	//    3    5:return          
	}

	FragmentManager peekChildFragmentManager()
	{
		return ((FragmentManager) (mChildFragmentManager));
	//    0    0:aload_0         
	//    1    1:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:areturn         
	}

	void performActivityCreated(Bundle bundle)
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #698 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mState = 2;
	//    6   14:aload_0         
	//    7   15:iconst_2        
	//    8   16:putfield        #128 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #702 <Field boolean mCalled>
		onActivityCreated(bundle);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #776 <Method void onActivityCreated(Bundle)>
		if(!mCalled)
	//*  15   29:aload_0         
	//*  16   30:getfield        #702 <Field boolean mCalled>
	//*  17   33:ifne            78
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   18   36:new             #227 <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #228 <Method void StringBuilder()>
	//   21   43:astore_1        
			((StringBuilder) (bundle)).append("Fragment ");
	//   22   44:aload_1         
	//   23   45:ldc2            #778 <String "Fragment ">
	//   24   48:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			((StringBuilder) (bundle)).append(((Object) (this)));
	//   26   52:aload_1         
	//   27   53:aload_0         
	//   28   54:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   29   57:pop             
			((StringBuilder) (bundle)).append(" did not call through to super.onActivityCreated()");
	//   30   58:aload_1         
	//   31   59:ldc2            #780 <String " did not call through to super.onActivityCreated()">
	//   32   62:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
			throw new SuperNotCalledException(((StringBuilder) (bundle)).toString());
	//   34   66:new             #782 <Class SuperNotCalledException>
	//   35   69:dup             
	//   36   70:aload_1         
	//   37   71:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   38   74:invokespecial   #783 <Method void SuperNotCalledException(String)>
	//   39   77:athrow          
		}
		if(mChildFragmentManager != null)
	//*  40   78:aload_0         
	//*  41   79:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  42   82:ifnull          92
			mChildFragmentManager.dispatchActivityCreated();
	//   43   85:aload_0         
	//   44   86:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   45   89:invokevirtual   #497 <Method void FragmentManagerImpl.dispatchActivityCreated()>
	//   46   92:return          
	}

	void performConfigurationChanged(Configuration configuration)
	{
		onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #786 <Method void onConfigurationChanged(Configuration)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          20
			mChildFragmentManager.dispatchConfigurationChanged(configuration);
	//    6   12:aload_0         
	//    7   13:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #789 <Method void FragmentManagerImpl.dispatchConfigurationChanged(Configuration)>
	//   10   20:return          
	}

	boolean performContextItemSelected(MenuItem menuitem)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #327 <Field boolean mHidden>
	//*   2    4:ifne            37
		{
			if(onContextItemSelected(menuitem))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #792 <Method boolean onContextItemSelected(MenuItem)>
	//*   6   12:ifeq            17
				return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
			if(mChildFragmentManager != null && mChildFragmentManager.dispatchContextItemSelected(menuitem))
	//*   9   17:aload_0         
	//*  10   18:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  11   21:ifnull          37
	//*  12   24:aload_0         
	//*  13   25:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #795 <Method boolean FragmentManagerImpl.dispatchContextItemSelected(MenuItem)>
	//*  16   32:ifeq            37
				return true;
	//   17   35:iconst_1        
	//   18   36:ireturn         
		}
		return false;
	//   19   37:iconst_0        
	//   20   38:ireturn         
	}

	void performCreate(Bundle bundle)
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #698 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mState = 1;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #128 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #702 <Field boolean mCalled>
		onCreate(bundle);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #798 <Method void onCreate(Bundle)>
		mIsCreated = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #800 <Field boolean mIsCreated>
		if(!mCalled)
	//*  18   34:aload_0         
	//*  19   35:getfield        #702 <Field boolean mCalled>
	//*  20   38:ifne            83
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   21   41:new             #227 <Class StringBuilder>
	//   22   44:dup             
	//   23   45:invokespecial   #228 <Method void StringBuilder()>
	//   24   48:astore_1        
			((StringBuilder) (bundle)).append("Fragment ");
	//   25   49:aload_1         
	//   26   50:ldc2            #778 <String "Fragment ">
	//   27   53:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
			((StringBuilder) (bundle)).append(((Object) (this)));
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   32   62:pop             
			((StringBuilder) (bundle)).append(" did not call through to super.onCreate()");
	//   33   63:aload_1         
	//   34   64:ldc2            #802 <String " did not call through to super.onCreate()">
	//   35   67:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
			throw new SuperNotCalledException(((StringBuilder) (bundle)).toString());
	//   37   71:new             #782 <Class SuperNotCalledException>
	//   38   74:dup             
	//   39   75:aload_1         
	//   40   76:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   41   79:invokespecial   #783 <Method void SuperNotCalledException(String)>
	//   42   82:athrow          
		} else
		{
			mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_CREATE);
	//   43   83:aload_0         
	//   44   84:getfield        #143 <Field LifecycleRegistry mLifecycleRegistry>
	//   45   87:getstatic       #808 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_CREATE>
	//   46   90:invokevirtual   #812 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
			return;
	//   47   93:return          
		}
	}

	boolean performCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
		boolean flag1 = mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field boolean mHidden>
	//    2    4:istore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag3 = false;
	//    5    8:iconst_0        
	//    6    9:istore          5
		if(!flag1)
	//*   7   11:iload           4
	//*   8   13:ifne            70
		{
			boolean flag2 = flag3;
	//    9   16:iload           5
	//   10   18:istore          4
			if(mHasMenu)
	//*  11   20:aload_0         
	//*  12   21:getfield        #337 <Field boolean mHasMenu>
	//*  13   24:ifeq            47
			{
				flag2 = flag3;
	//   14   27:iload           5
	//   15   29:istore          4
				if(mMenuVisible)
	//*  16   31:aload_0         
	//*  17   32:getfield        #134 <Field boolean mMenuVisible>
	//*  18   35:ifeq            47
				{
					flag2 = true;
	//   19   38:iconst_1        
	//   20   39:istore          4
					onCreateOptionsMenu(menu, menuinflater);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:invokevirtual   #816 <Method void onCreateOptionsMenu(Menu, MenuInflater)>
				}
			}
			flag = flag2;
	//   25   47:iload           4
	//   26   49:istore_3        
			if(mChildFragmentManager != null)
	//*  27   50:aload_0         
	//*  28   51:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  29   54:ifnull          70
				flag = flag2 | mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuinflater);
	//   30   57:iload           4
	//   31   59:aload_0         
	//   32   60:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   33   63:aload_1         
	//   34   64:aload_2         
	//   35   65:invokevirtual   #819 <Method boolean FragmentManagerImpl.dispatchCreateOptionsMenu(Menu, MenuInflater)>
	//   36   68:ior             
	//   37   69:istore_3        
		}
		return flag;
	//   38   70:iload_3         
	//   39   71:ireturn         
	}

	View performCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #698 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mPerformedCreateView = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #822 <Field boolean mPerformedCreateView>
		return onCreateView(layoutinflater, viewgroup, bundle);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #824 <Method View onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//   14   26:areturn         
	}

	void performDestroy()
	{
		mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_DESTROY);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field LifecycleRegistry mLifecycleRegistry>
	//    2    4:getstatic       #828 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_DESTROY>
	//    3    7:invokevirtual   #812 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
		if(mChildFragmentManager != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   6   14:ifnull          24
			mChildFragmentManager.dispatchDestroy();
	//    7   17:aload_0         
	//    8   18:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    9   21:invokevirtual   #831 <Method void FragmentManagerImpl.dispatchDestroy()>
		mState = 0;
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:putfield        #128 <Field int mState>
		mCalled = false;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #702 <Field boolean mCalled>
		mIsCreated = false;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #800 <Field boolean mIsCreated>
		onDestroy();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #833 <Method void onDestroy()>
		if(!mCalled)
	//*  21   43:aload_0         
	//*  22   44:getfield        #702 <Field boolean mCalled>
	//*  23   47:ifne            92
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   24   50:new             #227 <Class StringBuilder>
	//   25   53:dup             
	//   26   54:invokespecial   #228 <Method void StringBuilder()>
	//   27   57:astore_1        
			stringbuilder.append("Fragment ");
	//   28   58:aload_1         
	//   29   59:ldc2            #778 <String "Fragment ">
	//   30   62:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   31   65:pop             
			stringbuilder.append(((Object) (this)));
	//   32   66:aload_1         
	//   33   67:aload_0         
	//   34   68:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   35   71:pop             
			stringbuilder.append(" did not call through to super.onDestroy()");
	//   36   72:aload_1         
	//   37   73:ldc2            #835 <String " did not call through to super.onDestroy()">
	//   38   76:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   40   80:new             #782 <Class SuperNotCalledException>
	//   41   83:dup             
	//   42   84:aload_1         
	//   43   85:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   44   88:invokespecial   #783 <Method void SuperNotCalledException(String)>
	//   45   91:athrow          
		} else
		{
			mChildFragmentManager = null;
	//   46   92:aload_0         
	//   47   93:aconst_null     
	//   48   94:putfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
			return;
	//   49   97:return          
		}
	}

	void performDestroyView()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchDestroyView();
	//    3    7:aload_0         
	//    4    8:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #839 <Method void FragmentManagerImpl.dispatchDestroyView()>
		mState = 1;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #128 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #702 <Field boolean mCalled>
		onDestroyView();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #841 <Method void onDestroyView()>
		if(!mCalled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #702 <Field boolean mCalled>
	//*  16   32:ifne            77
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   17   35:new             #227 <Class StringBuilder>
	//   18   38:dup             
	//   19   39:invokespecial   #228 <Method void StringBuilder()>
	//   20   42:astore_1        
			stringbuilder.append("Fragment ");
	//   21   43:aload_1         
	//   22   44:ldc2            #778 <String "Fragment ">
	//   23   47:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			stringbuilder.append(((Object) (this)));
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   28   56:pop             
			stringbuilder.append(" did not call through to super.onDestroyView()");
	//   29   57:aload_1         
	//   30   58:ldc2            #843 <String " did not call through to super.onDestroyView()">
	//   31   61:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   33   65:new             #782 <Class SuperNotCalledException>
	//   34   68:dup             
	//   35   69:aload_1         
	//   36   70:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   37   73:invokespecial   #783 <Method void SuperNotCalledException(String)>
	//   38   76:athrow          
		}
		if(mLoaderManager != null)
	//*  39   77:aload_0         
	//*  40   78:getfield        #415 <Field LoaderManagerImpl mLoaderManager>
	//*  41   81:ifnull          91
			mLoaderManager.markForRedelivery();
	//   42   84:aload_0         
	//   43   85:getfield        #415 <Field LoaderManagerImpl mLoaderManager>
	//   44   88:invokevirtual   #846 <Method void LoaderManagerImpl.markForRedelivery()>
		mPerformedCreateView = false;
	//   45   91:aload_0         
	//   46   92:iconst_0        
	//   47   93:putfield        #822 <Field boolean mPerformedCreateView>
	//   48   96:return          
	}

	void performDetach()
	{
		mCalled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #702 <Field boolean mCalled>
		onDetach();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #849 <Method void onDetach()>
		mLayoutInflater = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #534 <Field LayoutInflater mLayoutInflater>
		if(!mCalled)
	//*   8   14:aload_0         
	//*   9   15:getfield        #702 <Field boolean mCalled>
	//*  10   18:ifne            63
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #227 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #228 <Method void StringBuilder()>
	//   14   28:astore_1        
			stringbuilder.append("Fragment ");
	//   15   29:aload_1         
	//   16   30:ldc2            #778 <String "Fragment ">
	//   17   33:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(((Object) (this)));
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
			stringbuilder.append(" did not call through to super.onDetach()");
	//   23   43:aload_1         
	//   24   44:ldc2            #851 <String " did not call through to super.onDetach()">
	//   25   47:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   27   51:new             #782 <Class SuperNotCalledException>
	//   28   54:dup             
	//   29   55:aload_1         
	//   30   56:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   31   59:invokespecial   #783 <Method void SuperNotCalledException(String)>
	//   32   62:athrow          
		}
		if(mChildFragmentManager != null)
	//*  33   63:aload_0         
	//*  34   64:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  35   67:ifnull          139
		{
			if(!mRetaining)
	//*  36   70:aload_0         
	//*  37   71:getfield        #345 <Field boolean mRetaining>
	//*  38   74:ifne            127
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   39   77:new             #227 <Class StringBuilder>
	//   40   80:dup             
	//   41   81:invokespecial   #228 <Method void StringBuilder()>
	//   42   84:astore_1        
				stringbuilder1.append("Child FragmentManager of ");
	//   43   85:aload_1         
	//   44   86:ldc2            #853 <String "Child FragmentManager of ">
	//   45   89:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   46   92:pop             
				stringbuilder1.append(((Object) (this)));
	//   47   93:aload_1         
	//   48   94:aload_0         
	//   49   95:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   50   98:pop             
				stringbuilder1.append(" was not ");
	//   51   99:aload_1         
	//   52  100:ldc2            #855 <String " was not ">
	//   53  103:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   54  106:pop             
				stringbuilder1.append(" destroyed and this fragment is not retaining instance");
	//   55  107:aload_1         
	//   56  108:ldc2            #857 <String " destroyed and this fragment is not retaining instance">
	//   57  111:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   58  114:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//   59  115:new             #545 <Class IllegalStateException>
	//   60  118:dup             
	//   61  119:aload_1         
	//   62  120:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   63  123:invokespecial   #549 <Method void IllegalStateException(String)>
	//   64  126:athrow          
			}
			mChildFragmentManager.dispatchDestroy();
	//   65  127:aload_0         
	//   66  128:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   67  131:invokevirtual   #831 <Method void FragmentManagerImpl.dispatchDestroy()>
			mChildFragmentManager = null;
	//   68  134:aload_0         
	//   69  135:aconst_null     
	//   70  136:putfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
		}
	//   71  139:return          
	}

	LayoutInflater performGetLayoutInflater(Bundle bundle)
	{
		mLayoutInflater = onGetLayoutInflater(bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #859 <Method LayoutInflater onGetLayoutInflater(Bundle)>
	//    4    6:putfield        #534 <Field LayoutInflater mLayoutInflater>
		return mLayoutInflater;
	//    5    9:aload_0         
	//    6   10:getfield        #534 <Field LayoutInflater mLayoutInflater>
	//    7   13:areturn         
	}

	void performLowMemory()
	{
		onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #862 <Method void onLowMemory()>
		if(mChildFragmentManager != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   4    8:ifnull          18
			mChildFragmentManager.dispatchLowMemory();
	//    5   11:aload_0         
	//    6   12:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    7   15:invokevirtual   #865 <Method void FragmentManagerImpl.dispatchLowMemory()>
	//    8   18:return          
	}

	void performMultiWindowModeChanged(boolean flag)
	{
		onMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #868 <Method void onMultiWindowModeChanged(boolean)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          20
			mChildFragmentManager.dispatchMultiWindowModeChanged(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #871 <Method void FragmentManagerImpl.dispatchMultiWindowModeChanged(boolean)>
	//   10   20:return          
	}

	boolean performOptionsItemSelected(MenuItem menuitem)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #327 <Field boolean mHidden>
	//*   2    4:ifne            51
		{
			if(mHasMenu && mMenuVisible && onOptionsItemSelected(menuitem))
	//*   3    7:aload_0         
	//*   4    8:getfield        #337 <Field boolean mHasMenu>
	//*   5   11:ifeq            31
	//*   6   14:aload_0         
	//*   7   15:getfield        #134 <Field boolean mMenuVisible>
	//*   8   18:ifeq            31
	//*   9   21:aload_0         
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #874 <Method boolean onOptionsItemSelected(MenuItem)>
	//*  12   26:ifeq            31
				return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
			if(mChildFragmentManager != null && mChildFragmentManager.dispatchOptionsItemSelected(menuitem))
	//*  15   31:aload_0         
	//*  16   32:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  17   35:ifnull          51
	//*  18   38:aload_0         
	//*  19   39:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #877 <Method boolean FragmentManagerImpl.dispatchOptionsItemSelected(MenuItem)>
	//*  22   46:ifeq            51
				return true;
	//   23   49:iconst_1        
	//   24   50:ireturn         
		}
		return false;
	//   25   51:iconst_0        
	//   26   52:ireturn         
	}

	void performOptionsMenuClosed(Menu menu)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #327 <Field boolean mHidden>
	//*   2    4:ifne            41
		{
			if(mHasMenu && mMenuVisible)
	//*   3    7:aload_0         
	//*   4    8:getfield        #337 <Field boolean mHasMenu>
	//*   5   11:ifeq            26
	//*   6   14:aload_0         
	//*   7   15:getfield        #134 <Field boolean mMenuVisible>
	//*   8   18:ifeq            26
				onOptionsMenuClosed(menu);
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokevirtual   #880 <Method void onOptionsMenuClosed(Menu)>
			if(mChildFragmentManager != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  14   30:ifnull          41
				mChildFragmentManager.dispatchOptionsMenuClosed(menu);
	//   15   33:aload_0         
	//   16   34:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #883 <Method void FragmentManagerImpl.dispatchOptionsMenuClosed(Menu)>
		}
	//   19   41:return          
	}

	void performPause()
	{
		mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_PAUSE);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field LifecycleRegistry mLifecycleRegistry>
	//    2    4:getstatic       #887 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_PAUSE>
	//    3    7:invokevirtual   #812 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
		if(mChildFragmentManager != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   6   14:ifnull          24
			mChildFragmentManager.dispatchPause();
	//    7   17:aload_0         
	//    8   18:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    9   21:invokevirtual   #890 <Method void FragmentManagerImpl.dispatchPause()>
		mState = 4;
	//   10   24:aload_0         
	//   11   25:iconst_4        
	//   12   26:putfield        #128 <Field int mState>
		mCalled = false;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #702 <Field boolean mCalled>
		onPause();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #892 <Method void onPause()>
		if(!mCalled)
	//*  18   38:aload_0         
	//*  19   39:getfield        #702 <Field boolean mCalled>
	//*  20   42:ifne            87
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   21   45:new             #227 <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #228 <Method void StringBuilder()>
	//   24   52:astore_1        
			stringbuilder.append("Fragment ");
	//   25   53:aload_1         
	//   26   54:ldc2            #778 <String "Fragment ">
	//   27   57:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
			stringbuilder.append(((Object) (this)));
	//   29   61:aload_1         
	//   30   62:aload_0         
	//   31   63:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   32   66:pop             
			stringbuilder.append(" did not call through to super.onPause()");
	//   33   67:aload_1         
	//   34   68:ldc2            #894 <String " did not call through to super.onPause()">
	//   35   71:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   37   75:new             #782 <Class SuperNotCalledException>
	//   38   78:dup             
	//   39   79:aload_1         
	//   40   80:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   41   83:invokespecial   #783 <Method void SuperNotCalledException(String)>
	//   42   86:athrow          
		} else
		{
			return;
	//   43   87:return          
		}
	}

	void performPictureInPictureModeChanged(boolean flag)
	{
		onPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #897 <Method void onPictureInPictureModeChanged(boolean)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          20
			mChildFragmentManager.dispatchPictureInPictureModeChanged(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #900 <Method void FragmentManagerImpl.dispatchPictureInPictureModeChanged(boolean)>
	//   10   20:return          
	}

	boolean performPrepareOptionsMenu(Menu menu)
	{
		boolean flag1 = mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field boolean mHidden>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag3 = false;
	//    5    7:iconst_0        
	//    6    8:istore          4
		if(!flag1)
	//*   7   10:iload_3         
	//*   8   11:ifne            61
		{
			boolean flag2 = flag3;
	//    9   14:iload           4
	//   10   16:istore_3        
			if(mHasMenu)
	//*  11   17:aload_0         
	//*  12   18:getfield        #337 <Field boolean mHasMenu>
	//*  13   21:ifeq            41
			{
				flag2 = flag3;
	//   14   24:iload           4
	//   15   26:istore_3        
				if(mMenuVisible)
	//*  16   27:aload_0         
	//*  17   28:getfield        #134 <Field boolean mMenuVisible>
	//*  18   31:ifeq            41
				{
					flag2 = true;
	//   19   34:iconst_1        
	//   20   35:istore_3        
					onPrepareOptionsMenu(menu);
	//   21   36:aload_0         
	//   22   37:aload_1         
	//   23   38:invokevirtual   #904 <Method void onPrepareOptionsMenu(Menu)>
				}
			}
			flag = flag2;
	//   24   41:iload_3         
	//   25   42:istore_2        
			if(mChildFragmentManager != null)
	//*  26   43:aload_0         
	//*  27   44:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  28   47:ifnull          61
				flag = flag2 | mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
	//   29   50:iload_3         
	//   30   51:aload_0         
	//   31   52:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   32   55:aload_1         
	//   33   56:invokevirtual   #907 <Method boolean FragmentManagerImpl.dispatchPrepareOptionsMenu(Menu)>
	//   34   59:ior             
	//   35   60:istore_2        
		}
		return flag;
	//   36   61:iload_2         
	//   37   62:ireturn         
	}

	void performReallyStop()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchReallyStop();
	//    3    7:aload_0         
	//    4    8:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #911 <Method void FragmentManagerImpl.dispatchReallyStop()>
		mState = 2;
	//    6   14:aload_0         
	//    7   15:iconst_2        
	//    8   16:putfield        #128 <Field int mState>
	//    9   19:return          
	}

	void performResume()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          22
		{
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #698 <Method void FragmentManagerImpl.noteStateNotSaved()>
			mChildFragmentManager.execPendingActions();
	//    6   14:aload_0         
	//    7   15:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   18:invokevirtual   #915 <Method boolean FragmentManagerImpl.execPendingActions()>
	//    9   21:pop             
		}
		mState = 5;
	//   10   22:aload_0         
	//   11   23:iconst_5        
	//   12   24:putfield        #128 <Field int mState>
		mCalled = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #702 <Field boolean mCalled>
		onResume();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #917 <Method void onResume()>
		if(!mCalled)
	//*  18   36:aload_0         
	//*  19   37:getfield        #702 <Field boolean mCalled>
	//*  20   40:ifne            85
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   21   43:new             #227 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #228 <Method void StringBuilder()>
	//   24   50:astore_1        
			stringbuilder.append("Fragment ");
	//   25   51:aload_1         
	//   26   52:ldc2            #778 <String "Fragment ">
	//   27   55:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
			stringbuilder.append(((Object) (this)));
	//   29   59:aload_1         
	//   30   60:aload_0         
	//   31   61:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   32   64:pop             
			stringbuilder.append(" did not call through to super.onResume()");
	//   33   65:aload_1         
	//   34   66:ldc2            #919 <String " did not call through to super.onResume()">
	//   35   69:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   37   73:new             #782 <Class SuperNotCalledException>
	//   38   76:dup             
	//   39   77:aload_1         
	//   40   78:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   41   81:invokespecial   #783 <Method void SuperNotCalledException(String)>
	//   42   84:athrow          
		}
		if(mChildFragmentManager != null)
	//*  43   85:aload_0         
	//*  44   86:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  45   89:ifnull          107
		{
			mChildFragmentManager.dispatchResume();
	//   46   92:aload_0         
	//   47   93:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   48   96:invokevirtual   #491 <Method void FragmentManagerImpl.dispatchResume()>
			mChildFragmentManager.execPendingActions();
	//   49   99:aload_0         
	//   50  100:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   51  103:invokevirtual   #915 <Method boolean FragmentManagerImpl.execPendingActions()>
	//   52  106:pop             
		}
		mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_RESUME);
	//   53  107:aload_0         
	//   54  108:getfield        #143 <Field LifecycleRegistry mLifecycleRegistry>
	//   55  111:getstatic       #922 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_RESUME>
	//   56  114:invokevirtual   #812 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
	//   57  117:return          
	}

	void performSaveInstanceState(Bundle bundle)
	{
		onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #925 <Method void onSaveInstanceState(Bundle)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          32
		{
			Parcelable parcelable = mChildFragmentManager.saveAllState();
	//    6   12:aload_0         
	//    7   13:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:invokevirtual   #929 <Method Parcelable FragmentManagerImpl.saveAllState()>
	//    9   19:astore_2        
			if(parcelable != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          32
				bundle.putParcelable("android:support:fragments", parcelable);
	//   12   24:aload_1         
	//   13   25:ldc2            #931 <String "android:support:fragments">
	//   14   28:aload_2         
	//   15   29:invokevirtual   #935 <Method void Bundle.putParcelable(String, Parcelable)>
		}
	//   16   32:return          
	}

	void performStart()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          22
		{
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #698 <Method void FragmentManagerImpl.noteStateNotSaved()>
			mChildFragmentManager.execPendingActions();
	//    6   14:aload_0         
	//    7   15:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   18:invokevirtual   #915 <Method boolean FragmentManagerImpl.execPendingActions()>
	//    9   21:pop             
		}
		mState = 4;
	//   10   22:aload_0         
	//   11   23:iconst_4        
	//   12   24:putfield        #128 <Field int mState>
		mCalled = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #702 <Field boolean mCalled>
		onStart();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #938 <Method void onStart()>
		if(!mCalled)
	//*  18   36:aload_0         
	//*  19   37:getfield        #702 <Field boolean mCalled>
	//*  20   40:ifne            85
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   21   43:new             #227 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #228 <Method void StringBuilder()>
	//   24   50:astore_1        
			stringbuilder.append("Fragment ");
	//   25   51:aload_1         
	//   26   52:ldc2            #778 <String "Fragment ">
	//   27   55:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
			stringbuilder.append(((Object) (this)));
	//   29   59:aload_1         
	//   30   60:aload_0         
	//   31   61:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   32   64:pop             
			stringbuilder.append(" did not call through to super.onStart()");
	//   33   65:aload_1         
	//   34   66:ldc2            #940 <String " did not call through to super.onStart()">
	//   35   69:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   37   73:new             #782 <Class SuperNotCalledException>
	//   38   76:dup             
	//   39   77:aload_1         
	//   40   78:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   41   81:invokespecial   #783 <Method void SuperNotCalledException(String)>
	//   42   84:athrow          
		}
		if(mChildFragmentManager != null)
	//*  43   85:aload_0         
	//*  44   86:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  45   89:ifnull          99
			mChildFragmentManager.dispatchStart();
	//   46   92:aload_0         
	//   47   93:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   48   96:invokevirtual   #494 <Method void FragmentManagerImpl.dispatchStart()>
		mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_START);
	//   49   99:aload_0         
	//   50  100:getfield        #143 <Field LifecycleRegistry mLifecycleRegistry>
	//   51  103:getstatic       #943 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_START>
	//   52  106:invokevirtual   #812 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
	//   53  109:return          
	}

	void performStop()
	{
		mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_STOP);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field LifecycleRegistry mLifecycleRegistry>
	//    2    4:getstatic       #947 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_STOP>
	//    3    7:invokevirtual   #812 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
		if(mChildFragmentManager != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*   6   14:ifnull          24
			mChildFragmentManager.dispatchStop();
	//    7   17:aload_0         
	//    8   18:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//    9   21:invokevirtual   #950 <Method void FragmentManagerImpl.dispatchStop()>
		mState = 3;
	//   10   24:aload_0         
	//   11   25:iconst_3        
	//   12   26:putfield        #128 <Field int mState>
		mCalled = false;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #702 <Field boolean mCalled>
		onStop();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #952 <Method void onStop()>
		if(!mCalled)
	//*  18   38:aload_0         
	//*  19   39:getfield        #702 <Field boolean mCalled>
	//*  20   42:ifne            87
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   21   45:new             #227 <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #228 <Method void StringBuilder()>
	//   24   52:astore_1        
			stringbuilder.append("Fragment ");
	//   25   53:aload_1         
	//   26   54:ldc2            #778 <String "Fragment ">
	//   27   57:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
			stringbuilder.append(((Object) (this)));
	//   29   61:aload_1         
	//   30   62:aload_0         
	//   31   63:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   32   66:pop             
			stringbuilder.append(" did not call through to super.onStop()");
	//   33   67:aload_1         
	//   34   68:ldc2            #954 <String " did not call through to super.onStop()">
	//   35   71:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   37   75:new             #782 <Class SuperNotCalledException>
	//   38   78:dup             
	//   39   79:aload_1         
	//   40   80:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   41   83:invokespecial   #783 <Method void SuperNotCalledException(String)>
	//   42   86:athrow          
		} else
		{
			return;
	//   43   87:return          
		}
	}

	public void postponeEnterTransition()
	{
		ensureAnimationInfo().mEnterTransitionPostponed = true;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iconst_1        
	//    3    5:putfield        #153 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//    4    8:return          
	}

	public void registerForContextMenu(View view)
	{
		view.setOnCreateContextMenuListener(((android.view.View.OnCreateContextMenuListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #963 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
	//    3    5:return          
	}

	public final void requestPermissions(String as[], int i)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       49
		{
			as = ((String []) (new StringBuilder()));
	//    3    7:new             #227 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #228 <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (as)).append("Fragment ");
	//    7   15:aload_1         
	//    8   16:ldc2            #778 <String "Fragment ">
	//    9   19:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (as)).append(((Object) (this)));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
			((StringBuilder) (as)).append(" not attached to Activity");
	//   15   29:aload_1         
	//   16   30:ldc2            #967 <String " not attached to Activity">
	//   17   33:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			throw new IllegalStateException(((StringBuilder) (as)).toString());
	//   19   37:new             #545 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   23   45:invokespecial   #549 <Method void IllegalStateException(String)>
	//   24   48:athrow          
		} else
		{
			mHost.onRequestPermissionsFromFragment(this, as, i);
	//   25   49:aload_0         
	//   26   50:getfield        #356 <Field FragmentHostCallback mHost>
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:iload_2         
	//   30   56:invokevirtual   #971 <Method void FragmentHostCallback.onRequestPermissionsFromFragment(Fragment, String[], int)>
			return;
	//   31   59:return          
		}
	}

	public final FragmentActivity requireActivity()
	{
		Object obj = ((Object) (getActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #730 <Method FragmentActivity getActivity()>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       51
		{
			obj = ((Object) (new StringBuilder()));
	//    5    9:new             #227 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #228 <Method void StringBuilder()>
	//    8   16:astore_1        
			((StringBuilder) (obj)).append("Fragment ");
	//    9   17:aload_1         
	//   10   18:ldc2            #778 <String "Fragment ">
	//   11   21:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			((StringBuilder) (obj)).append(((Object) (this)));
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
			((StringBuilder) (obj)).append(" not attached to an activity.");
	//   17   31:aload_1         
	//   18   32:ldc2            #974 <String " not attached to an activity.">
	//   19   35:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   21   39:new             #545 <Class IllegalStateException>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   25   47:invokespecial   #549 <Method void IllegalStateException(String)>
	//   26   50:athrow          
		} else
		{
			return ((FragmentActivity) (obj));
	//   27   51:aload_1         
	//   28   52:areturn         
		}
	}

	public final Context requireContext()
	{
		Object obj = ((Object) (getContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #642 <Method Context getContext()>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       51
		{
			obj = ((Object) (new StringBuilder()));
	//    5    9:new             #227 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #228 <Method void StringBuilder()>
	//    8   16:astore_1        
			((StringBuilder) (obj)).append("Fragment ");
	//    9   17:aload_1         
	//   10   18:ldc2            #778 <String "Fragment ">
	//   11   21:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			((StringBuilder) (obj)).append(((Object) (this)));
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
			((StringBuilder) (obj)).append(" not attached to a context.");
	//   17   31:aload_1         
	//   18   32:ldc2            #976 <String " not attached to a context.">
	//   19   35:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   21   39:new             #545 <Class IllegalStateException>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   25   47:invokespecial   #549 <Method void IllegalStateException(String)>
	//   26   50:athrow          
		} else
		{
			return ((Context) (obj));
	//   27   51:aload_1         
	//   28   52:areturn         
		}
	}

	public final FragmentManager requireFragmentManager()
	{
		Object obj = ((Object) (getFragmentManager()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #979 <Method FragmentManager getFragmentManager()>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       51
		{
			obj = ((Object) (new StringBuilder()));
	//    5    9:new             #227 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #228 <Method void StringBuilder()>
	//    8   16:astore_1        
			((StringBuilder) (obj)).append("Fragment ");
	//    9   17:aload_1         
	//   10   18:ldc2            #778 <String "Fragment ">
	//   11   21:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			((StringBuilder) (obj)).append(((Object) (this)));
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
			((StringBuilder) (obj)).append(" not associated with a fragment manager.");
	//   17   31:aload_1         
	//   18   32:ldc2            #981 <String " not associated with a fragment manager.">
	//   19   35:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   21   39:new             #545 <Class IllegalStateException>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   25   47:invokespecial   #549 <Method void IllegalStateException(String)>
	//   26   50:athrow          
		} else
		{
			return ((FragmentManager) (obj));
	//   27   51:aload_1         
	//   28   52:areturn         
		}
	}

	public final Object requireHost()
	{
		Object obj = getHost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #984 <Method Object getHost()>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       51
		{
			obj = ((Object) (new StringBuilder()));
	//    5    9:new             #227 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #228 <Method void StringBuilder()>
	//    8   16:astore_1        
			((StringBuilder) (obj)).append("Fragment ");
	//    9   17:aload_1         
	//   10   18:ldc2            #778 <String "Fragment ">
	//   11   21:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			((StringBuilder) (obj)).append(((Object) (this)));
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
			((StringBuilder) (obj)).append(" not attached to a host.");
	//   17   31:aload_1         
	//   18   32:ldc2            #986 <String " not attached to a host.">
	//   19   35:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   21   39:new             #545 <Class IllegalStateException>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   25   47:invokespecial   #549 <Method void IllegalStateException(String)>
	//   26   50:athrow          
		} else
		{
			return obj;
	//   27   51:aload_1         
	//   28   52:areturn         
		}
	}

	void restoreChildFragmentState(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          51
		{
			bundle = ((Bundle) (bundle.getParcelable("android:support:fragments")));
	//    2    4:aload_1         
	//    3    5:ldc2            #931 <String "android:support:fragments">
	//    4    8:invokevirtual   #990 <Method Parcelable Bundle.getParcelable(String)>
	//    5   11:astore_1        
			if(bundle != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          51
			{
				if(mChildFragmentManager == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//*  10   20:ifnonnull       27
					instantiateChildFragmentManager();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #488 <Method void instantiateChildFragmentManager()>
				mChildFragmentManager.restoreAllState(((Parcelable) (bundle)), mChildNonConfig);
	//   13   27:aload_0         
	//   14   28:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #992 <Field FragmentManagerNonConfig mChildNonConfig>
	//   18   36:invokevirtual   #996 <Method void FragmentManagerImpl.restoreAllState(Parcelable, FragmentManagerNonConfig)>
				mChildNonConfig = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #992 <Field FragmentManagerNonConfig mChildNonConfig>
				mChildFragmentManager.dispatchCreate();
	//   22   44:aload_0         
	//   23   45:getfield        #425 <Field FragmentManagerImpl mChildFragmentManager>
	//   24   48:invokevirtual   #500 <Method void FragmentManagerImpl.dispatchCreate()>
			}
		}
	//   25   51:return          
	}

	final void restoreViewState(Bundle bundle)
	{
		if(mSavedViewState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #372 <Field SparseArray mSavedViewState>
	//*   2    4:ifnull          23
		{
			mInnerView.restoreHierarchyState(mSavedViewState);
	//    3    7:aload_0         
	//    4    8:getfield        #400 <Field View mInnerView>
	//    5   11:aload_0         
	//    6   12:getfield        #372 <Field SparseArray mSavedViewState>
	//    7   15:invokevirtual   #1001 <Method void View.restoreHierarchyState(SparseArray)>
			mSavedViewState = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #372 <Field SparseArray mSavedViewState>
		}
		mCalled = false;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #702 <Field boolean mCalled>
		onViewStateRestored(bundle);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #1003 <Method void onViewStateRestored(Bundle)>
		if(!mCalled)
	//*  17   33:aload_0         
	//*  18   34:getfield        #702 <Field boolean mCalled>
	//*  19   37:ifne            82
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   20   40:new             #227 <Class StringBuilder>
	//   21   43:dup             
	//   22   44:invokespecial   #228 <Method void StringBuilder()>
	//   23   47:astore_1        
			((StringBuilder) (bundle)).append("Fragment ");
	//   24   48:aload_1         
	//   25   49:ldc2            #778 <String "Fragment ">
	//   26   52:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			((StringBuilder) (bundle)).append(((Object) (this)));
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   31   61:pop             
			((StringBuilder) (bundle)).append(" did not call through to super.onViewStateRestored()");
	//   32   62:aload_1         
	//   33   63:ldc2            #1005 <String " did not call through to super.onViewStateRestored()">
	//   34   66:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
			throw new SuperNotCalledException(((StringBuilder) (bundle)).toString());
	//   36   70:new             #782 <Class SuperNotCalledException>
	//   37   73:dup             
	//   38   74:aload_1         
	//   39   75:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   40   78:invokespecial   #783 <Method void SuperNotCalledException(String)>
	//   41   81:athrow          
		} else
		{
			return;
	//   42   82:return          
		}
	}

	public void setAllowEnterTransitionOverlap(boolean flag)
	{
		ensureAnimationInfo().mAllowEnterTransitionOverlap = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #1010 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #1014 <Method Boolean Fragment$AnimationInfo.access$602(Fragment$AnimationInfo, Boolean)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void setAllowReturnTransitionOverlap(boolean flag)
	{
		ensureAnimationInfo().mAllowReturnTransitionOverlap = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #1010 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #1018 <Method Boolean Fragment$AnimationInfo.access$702(Fragment$AnimationInfo, Boolean)>
	//    5   11:pop             
	//    6   12:return          
	}

	void setAnimatingAway(View view)
	{
		ensureAnimationInfo().mAnimatingAway = view;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #474 <Field View Fragment$AnimationInfo.mAnimatingAway>
	//    4    8:return          
	}

	void setAnimator(Animator animator)
	{
		ensureAnimationInfo().mAnimator = animator;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #480 <Field Animator Fragment$AnimationInfo.mAnimator>
	//    4    8:return          
	}

	public void setArguments(Bundle bundle)
	{
		if(mIndex >= 0 && isStateSaved())
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field int mIndex>
	//*   2    4:iflt            25
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #1022 <Method boolean isStateSaved()>
	//*   5   11:ifeq            25
		{
			throw new IllegalStateException("Fragment already active and state has been saved");
	//    6   14:new             #545 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #1024 <String "Fragment already active and state has been saved">
	//    9   21:invokespecial   #549 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			mArguments = bundle;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #364 <Field Bundle mArguments>
			return;
	//   14   30:return          
		}
	}

	public void setEnterSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ensureAnimationInfo().mEnterTransitionCallback = sharedelementcallback;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #516 <Field SharedElementCallback Fragment$AnimationInfo.mEnterTransitionCallback>
	//    4    8:return          
	}

	public void setEnterTransition(Object obj)
	{
		ensureAnimationInfo().mEnterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1031 <Method Object Fragment$AnimationInfo.access$002(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setExitSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ensureAnimationInfo().mExitTransitionCallback = sharedelementcallback;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #524 <Field SharedElementCallback Fragment$AnimationInfo.mExitTransitionCallback>
	//    4    8:return          
	}

	public void setExitTransition(Object obj)
	{
		ensureAnimationInfo().mExitTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1036 <Method Object Fragment$AnimationInfo.access$202(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setHasOptionsMenu(boolean flag)
	{
		if(mHasMenu != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #337 <Field boolean mHasMenu>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          34
		{
			mHasMenu = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #337 <Field boolean mHasMenu>
			if(isAdded() && !isHidden())
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #684 <Method boolean isAdded()>
	//*   9   17:ifeq            34
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #686 <Method boolean isHidden()>
	//*  12   24:ifne            34
				mHost.onSupportInvalidateOptionsMenu();
	//   13   27:aload_0         
	//   14   28:getfield        #356 <Field FragmentHostCallback mHost>
	//   15   31:invokevirtual   #1040 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
		}
	//   16   34:return          
	}

	void setHideReplaced(boolean flag)
	{
		ensureAnimationInfo().mIsHideReplaced = flag;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:putfield        #672 <Field boolean Fragment$AnimationInfo.mIsHideReplaced>
	//    4    8:return          
	}

	final void setIndex(int i, Fragment fragment)
	{
		mIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field int mIndex>
		if(fragment != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          52
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #227 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #228 <Method void StringBuilder()>
	//    8   16:astore_3        
			stringbuilder.append(fragment.mWho);
	//    9   17:aload_3         
	//   10   18:aload_2         
	//   11   19:getfield        #296 <Field String mWho>
	//   12   22:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			stringbuilder.append(":");
	//   14   26:aload_3         
	//   15   27:ldc2            #432 <String ":">
	//   16   30:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(mIndex);
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #130 <Field int mIndex>
	//   21   39:invokevirtual   #1046 <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
			mWho = stringbuilder.toString();
	//   23   43:aload_0         
	//   24   44:aload_3         
	//   25   45:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   26   48:putfield        #296 <Field String mWho>
			return;
	//   27   51:return          
		} else
		{
			fragment = ((Fragment) (new StringBuilder()));
	//   28   52:new             #227 <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #228 <Method void StringBuilder()>
	//   31   59:astore_2        
			((StringBuilder) (fragment)).append("android:fragment:");
	//   32   60:aload_2         
	//   33   61:ldc2            #1048 <String "android:fragment:">
	//   34   64:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
			((StringBuilder) (fragment)).append(mIndex);
	//   36   68:aload_2         
	//   37   69:aload_0         
	//   38   70:getfield        #130 <Field int mIndex>
	//   39   73:invokevirtual   #1046 <Method StringBuilder StringBuilder.append(int)>
	//   40   76:pop             
			mWho = ((StringBuilder) (fragment)).toString();
	//   41   77:aload_0         
	//   42   78:aload_2         
	//   43   79:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   44   82:putfield        #296 <Field String mWho>
			return;
	//   45   85:return          
		}
	}

	public void setInitialSavedState(SavedState savedstate)
	{
		if(mIndex >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #130 <Field int mIndex>
	//*   2    4:iflt            18
			throw new IllegalStateException("Fragment already active");
	//    3    7:new             #545 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #1052 <String "Fragment already active">
	//    6   14:invokespecial   #549 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(savedstate != null && savedstate.mState != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          37
	//*  10   22:aload_1         
	//*  11   23:getfield        #1054 <Field Bundle Fragment$SavedState.mState>
	//*  12   26:ifnull          37
			savedstate = ((SavedState) (savedstate.mState));
	//   13   29:aload_1         
	//   14   30:getfield        #1054 <Field Bundle Fragment$SavedState.mState>
	//   15   33:astore_1        
		else
	//*  16   34:goto            39
			savedstate = null;
	//   17   37:aconst_null     
	//   18   38:astore_1        
		mSavedFragmentState = ((Bundle) (savedstate));
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #368 <Field Bundle mSavedFragmentState>
	//   22   44:return          
	}

	public void setMenuVisibility(boolean flag)
	{
		if(mMenuVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field boolean mMenuVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          41
		{
			mMenuVisible = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #134 <Field boolean mMenuVisible>
			if(mHasMenu && isAdded() && !isHidden())
	//*   7   13:aload_0         
	//*   8   14:getfield        #337 <Field boolean mHasMenu>
	//*   9   17:ifeq            41
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #684 <Method boolean isAdded()>
	//*  12   24:ifeq            41
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #686 <Method boolean isHidden()>
	//*  15   31:ifne            41
				mHost.onSupportInvalidateOptionsMenu();
	//   16   34:aload_0         
	//   17   35:getfield        #356 <Field FragmentHostCallback mHost>
	//   18   38:invokevirtual   #1040 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
		}
	//   19   41:return          
	}

	void setNextAnim(int i)
	{
		if(mAnimationInfo == null && i == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       12
	//*   3    7:iload_1         
	//*   4    8:ifne            12
		{
			return;
	//    5   11:return          
		} else
		{
			ensureAnimationInfo().mNextAnim = i;
	//    6   12:aload_0         
	//    7   13:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    8   16:iload_1         
	//    9   17:putfield        #579 <Field int Fragment$AnimationInfo.mNextAnim>
			return;
	//   10   20:return          
		}
	}

	void setNextTransition(int i, int j)
	{
		if(mAnimationInfo == null && i == 0 && j == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       16
	//*   3    7:iload_1         
	//*   4    8:ifne            16
	//*   5   11:iload_2         
	//*   6   12:ifne            16
		{
			return;
	//    7   15:return          
		} else
		{
			ensureAnimationInfo();
	//    8   16:aload_0         
	//    9   17:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//   10   20:pop             
			mAnimationInfo.mNextTransition = i;
	//   11   21:aload_0         
	//   12   22:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   13   25:iload_1         
	//   14   26:putfield        #583 <Field int Fragment$AnimationInfo.mNextTransition>
			mAnimationInfo.mNextTransitionStyle = j;
	//   15   29:aload_0         
	//   16   30:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   17   33:iload_2         
	//   18   34:putfield        #587 <Field int Fragment$AnimationInfo.mNextTransitionStyle>
			return;
	//   19   37:return          
		}
	}

	void setOnStartEnterTransitionListener(OnStartEnterTransitionListener onstartentertransitionlistener)
	{
		ensureAnimationInfo();
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:pop             
		if(onstartentertransitionlistener == mAnimationInfo.mStartEnterTransitionListener)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   6   10:getfield        #157 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//*   7   13:if_acmpne       17
			return;
	//    8   16:return          
		if(onstartentertransitionlistener != null && mAnimationInfo.mStartEnterTransitionListener != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          65
	//*  11   21:aload_0         
	//*  12   22:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*  13   25:getfield        #157 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//*  14   28:ifnull          65
		{
			onstartentertransitionlistener = ((OnStartEnterTransitionListener) (new StringBuilder()));
	//   15   31:new             #227 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #228 <Method void StringBuilder()>
	//   18   38:astore_1        
			((StringBuilder) (onstartentertransitionlistener)).append("Trying to set a replacement startPostponedEnterTransition on ");
	//   19   39:aload_1         
	//   20   40:ldc2            #1062 <String "Trying to set a replacement startPostponedEnterTransition on ">
	//   21   43:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
			((StringBuilder) (onstartentertransitionlistener)).append(((Object) (this)));
	//   23   47:aload_1         
	//   24   48:aload_0         
	//   25   49:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   26   52:pop             
			throw new IllegalStateException(((StringBuilder) (onstartentertransitionlistener)).toString());
	//   27   53:new             #545 <Class IllegalStateException>
	//   28   56:dup             
	//   29   57:aload_1         
	//   30   58:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   31   61:invokespecial   #549 <Method void IllegalStateException(String)>
	//   32   64:athrow          
		}
		if(mAnimationInfo.mEnterTransitionPostponed)
	//*  33   65:aload_0         
	//*  34   66:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//*  35   69:getfield        #153 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//*  36   72:ifeq            83
			mAnimationInfo.mStartEnterTransitionListener = onstartentertransitionlistener;
	//   37   75:aload_0         
	//   38   76:getfield        #150 <Field Fragment$AnimationInfo mAnimationInfo>
	//   39   79:aload_1         
	//   40   80:putfield        #157 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
		if(onstartentertransitionlistener != null)
	//*  41   83:aload_1         
	//*  42   84:ifnull          93
			onstartentertransitionlistener.startListening();
	//   43   87:aload_1         
	//   44   88:invokeinterface #1065 <Method void Fragment$OnStartEnterTransitionListener.startListening()>
	//   45   93:return          
	}

	public void setReenterTransition(Object obj)
	{
		ensureAnimationInfo().mReenterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1069 <Method Object Fragment$AnimationInfo.access$302(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setRetainInstance(boolean flag)
	{
		mRetainInstance = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #341 <Field boolean mRetainInstance>
	//    3    5:return          
	}

	public void setReturnTransition(Object obj)
	{
		ensureAnimationInfo().mReturnTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1074 <Method Object Fragment$AnimationInfo.access$102(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setSharedElementEnterTransition(Object obj)
	{
		ensureAnimationInfo().mSharedElementEnterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1078 <Method Object Fragment$AnimationInfo.access$402(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setSharedElementReturnTransition(Object obj)
	{
		ensureAnimationInfo().mSharedElementReturnTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1082 <Method Object Fragment$AnimationInfo.access$502(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void setStateAfterAnimating(int i)
	{
		ensureAnimationInfo().mStateAfterAnimating = i;
	//    0    0:aload_0         
	//    1    1:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:putfield        #622 <Field int Fragment$AnimationInfo.mStateAfterAnimating>
	//    4    8:return          
	}

	public void setTargetFragment(Fragment fragment, int i)
	{
		FragmentManager fragmentmanager1 = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #979 <Method FragmentManager getFragmentManager()>
	//    2    4:astore          4
		FragmentManager fragmentmanager;
		if(fragment != null)
	//*   3    6:aload_1         
	//*   4    7:ifnull          18
			fragmentmanager = fragment.getFragmentManager();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #979 <Method FragmentManager getFragmentManager()>
	//    7   14:astore_3        
		else
	//*   8   15:goto            20
			fragmentmanager = null;
	//    9   18:aconst_null     
	//   10   19:astore_3        
		if(fragmentmanager1 != null && fragmentmanager != null && fragmentmanager1 != fragmentmanager)
	//*  11   20:aload           4
	//*  12   22:ifnull          77
	//*  13   25:aload_3         
	//*  14   26:ifnull          77
	//*  15   29:aload           4
	//*  16   31:aload_3         
	//*  17   32:if_acmpeq       77
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   35:new             #227 <Class StringBuilder>
	//   19   38:dup             
	//   20   39:invokespecial   #228 <Method void StringBuilder()>
	//   21   42:astore_3        
			stringbuilder.append("Fragment ");
	//   22   43:aload_3         
	//   23   44:ldc2            #778 <String "Fragment ">
	//   24   47:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			stringbuilder.append(((Object) (fragment)));
	//   26   51:aload_3         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   29   56:pop             
			stringbuilder.append(" must share the same FragmentManager to be set as a target fragment");
	//   30   57:aload_3         
	//   31   58:ldc2            #1087 <String " must share the same FragmentManager to be set as a target fragment">
	//   32   61:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   34   65:new             #1089 <Class IllegalArgumentException>
	//   35   68:dup             
	//   36   69:aload_3         
	//   37   70:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   38   73:invokespecial   #1090 <Method void IllegalArgumentException(String)>
	//   39   76:athrow          
		}
		for(Object obj = ((Object) (fragment)); obj != null; obj = ((Object) (((Fragment) (obj)).getTargetFragment())))
	//*  40   77:aload_1         
	//*  41   78:astore_3        
	//*  42   79:aload_3         
	//*  43   80:ifnull          152
			if(obj == this)
	//*  44   83:aload_3         
	//*  45   84:aload_0         
	//*  46   85:if_acmpne       144
			{
				obj = ((Object) (new StringBuilder()));
	//   47   88:new             #227 <Class StringBuilder>
	//   48   91:dup             
	//   49   92:invokespecial   #228 <Method void StringBuilder()>
	//   50   95:astore_3        
				((StringBuilder) (obj)).append("Setting ");
	//   51   96:aload_3         
	//   52   97:ldc2            #1092 <String "Setting ">
	//   53  100:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   54  103:pop             
				((StringBuilder) (obj)).append(((Object) (fragment)));
	//   55  104:aload_3         
	//   56  105:aload_1         
	//   57  106:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   58  109:pop             
				((StringBuilder) (obj)).append(" as the target of ");
	//   59  110:aload_3         
	//   60  111:ldc2            #1094 <String " as the target of ">
	//   61  114:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   62  117:pop             
				((StringBuilder) (obj)).append(((Object) (this)));
	//   63  118:aload_3         
	//   64  119:aload_0         
	//   65  120:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   66  123:pop             
				((StringBuilder) (obj)).append(" would create a target cycle");
	//   67  124:aload_3         
	//   68  125:ldc2            #1096 <String " would create a target cycle">
	//   69  128:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   70  131:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   71  132:new             #1089 <Class IllegalArgumentException>
	//   72  135:dup             
	//   73  136:aload_3         
	//   74  137:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   75  140:invokespecial   #1090 <Method void IllegalArgumentException(String)>
	//   76  143:athrow          
			}

	//   77  144:aload_3         
	//   78  145:invokevirtual   #1098 <Method Fragment getTargetFragment()>
	//   79  148:astore_3        
	//*  80  149:goto            79
		mTarget = fragment;
	//   81  152:aload_0         
	//   82  153:aload_1         
	//   83  154:putfield        #376 <Field Fragment mTarget>
		mTargetRequestCode = i;
	//   84  157:aload_0         
	//   85  158:iload_2         
	//   86  159:putfield        #384 <Field int mTargetRequestCode>
	//   87  162:return          
	}

	public void setUserVisibleHint(boolean flag)
	{
		if(!mUserVisibleHint && flag && mState < 4 && mFragmentManager != null && isAdded())
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field boolean mUserVisibleHint>
	//*   2    4:ifne            41
	//*   3    7:iload_1         
	//*   4    8:ifeq            41
	//*   5   11:aload_0         
	//*   6   12:getfield        #128 <Field int mState>
	//*   7   15:iconst_4        
	//*   8   16:icmpge          41
	//*   9   19:aload_0         
	//*  10   20:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//*  11   23:ifnull          41
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #684 <Method boolean isAdded()>
	//*  14   30:ifeq            41
			mFragmentManager.performPendingDeferredStart(this);
	//   15   33:aload_0         
	//   16   34:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #1102 <Method void FragmentManagerImpl.performPendingDeferredStart(Fragment)>
		mUserVisibleHint = flag;
	//   19   41:aload_0         
	//   20   42:iload_1         
	//   21   43:putfield        #136 <Field boolean mUserVisibleHint>
		if(mState < 4 && !flag)
	//*  22   46:aload_0         
	//*  23   47:getfield        #128 <Field int mState>
	//*  24   50:iconst_4        
	//*  25   51:icmpge          63
	//*  26   54:iload_1         
	//*  27   55:ifne            63
			flag = true;
	//   28   58:iconst_1        
	//   29   59:istore_1        
		else
	//*  30   60:goto            65
			flag = false;
	//   31   63:iconst_0        
	//   32   64:istore_1        
		mDeferStart = flag;
	//   33   65:aload_0         
	//   34   66:iload_1         
	//   35   67:putfield        #1104 <Field boolean mDeferStart>
		if(mSavedFragmentState != null)
	//*  36   70:aload_0         
	//*  37   71:getfield        #368 <Field Bundle mSavedFragmentState>
	//*  38   74:ifnull          88
			mSavedUserVisibleHint = Boolean.valueOf(mUserVisibleHint);
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #136 <Field boolean mUserVisibleHint>
	//   42   82:invokestatic    #1010 <Method Boolean Boolean.valueOf(boolean)>
	//   43   85:putfield        #1106 <Field Boolean mSavedUserVisibleHint>
	//   44   88:return          
	}

	public boolean shouldShowRequestPermissionRationale(String s)
	{
		if(mHost != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//*   2    4:ifnull          16
			return mHost.onShouldShowRequestPermissionRationale(s);
	//    3    7:aload_0         
	//    4    8:getfield        #356 <Field FragmentHostCallback mHost>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #1111 <Method boolean FragmentHostCallback.onShouldShowRequestPermissionRationale(String)>
	//    7   15:ireturn         
		else
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void startActivity(Intent intent)
	{
		startActivity(intent, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #1116 <Method void startActivity(Intent, Bundle)>
	//    4    6:return          
	}

	public void startActivity(Intent intent, Bundle bundle)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       49
		{
			intent = ((Intent) (new StringBuilder()));
	//    3    7:new             #227 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #228 <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (intent)).append("Fragment ");
	//    7   15:aload_1         
	//    8   16:ldc2            #778 <String "Fragment ">
	//    9   19:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (intent)).append(((Object) (this)));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
			((StringBuilder) (intent)).append(" not attached to Activity");
	//   15   29:aload_1         
	//   16   30:ldc2            #967 <String " not attached to Activity">
	//   17   33:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			throw new IllegalStateException(((StringBuilder) (intent)).toString());
	//   19   37:new             #545 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   23   45:invokespecial   #549 <Method void IllegalStateException(String)>
	//   24   48:athrow          
		} else
		{
			mHost.onStartActivityFromFragment(this, intent, -1, bundle);
	//   25   49:aload_0         
	//   26   50:getfield        #356 <Field FragmentHostCallback mHost>
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:iconst_m1       
	//   30   56:aload_2         
	//   31   57:invokevirtual   #1120 <Method void FragmentHostCallback.onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
			return;
	//   32   60:return          
		}
	}

	public void startActivityForResult(Intent intent, int i)
	{
		startActivityForResult(intent, i, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #1125 <Method void startActivityForResult(Intent, int, Bundle)>
	//    5    7:return          
	}

	public void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       49
		{
			intent = ((Intent) (new StringBuilder()));
	//    3    7:new             #227 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #228 <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (intent)).append("Fragment ");
	//    7   15:aload_1         
	//    8   16:ldc2            #778 <String "Fragment ">
	//    9   19:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (intent)).append(((Object) (this)));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
			((StringBuilder) (intent)).append(" not attached to Activity");
	//   15   29:aload_1         
	//   16   30:ldc2            #967 <String " not attached to Activity">
	//   17   33:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			throw new IllegalStateException(((StringBuilder) (intent)).toString());
	//   19   37:new             #545 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   23   45:invokespecial   #549 <Method void IllegalStateException(String)>
	//   24   48:athrow          
		} else
		{
			mHost.onStartActivityFromFragment(this, intent, i, bundle);
	//   25   49:aload_0         
	//   26   50:getfield        #356 <Field FragmentHostCallback mHost>
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:iload_2         
	//   30   56:aload_3         
	//   31   57:invokevirtual   #1120 <Method void FragmentHostCallback.onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
			return;
	//   32   60:return          
		}
	}

	public void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #356 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       49
		{
			intentsender = ((IntentSender) (new StringBuilder()));
	//    3    7:new             #227 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #228 <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (intentsender)).append("Fragment ");
	//    7   15:aload_1         
	//    8   16:ldc2            #778 <String "Fragment ">
	//    9   19:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (intentsender)).append(((Object) (this)));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #430 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
			((StringBuilder) (intentsender)).append(" not attached to Activity");
	//   15   29:aload_1         
	//   16   30:ldc2            #967 <String " not attached to Activity">
	//   17   33:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			throw new IllegalStateException(((StringBuilder) (intentsender)).toString());
	//   19   37:new             #545 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:aload_1         
	//   22   42:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   23   45:invokespecial   #549 <Method void IllegalStateException(String)>
	//   24   48:athrow          
		} else
		{
			mHost.onStartIntentSenderFromFragment(this, intentsender, i, intent, j, k, l, bundle);
	//   25   49:aload_0         
	//   26   50:getfield        #356 <Field FragmentHostCallback mHost>
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:iload_2         
	//   30   56:aload_3         
	//   31   57:iload           4
	//   32   59:iload           5
	//   33   61:iload           6
	//   34   63:aload           7
	//   35   65:invokevirtual   #1133 <Method void FragmentHostCallback.onStartIntentSenderFromFragment(Fragment, IntentSender, int, Intent, int, int, int, Bundle)>
			return;
	//   36   68:return          
		}
	}

	public void startPostponedEnterTransition()
	{
		if(mFragmentManager != null && mFragmentManager.mHost != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//*   2    4:ifnull          67
	//*   3    7:aload_0         
	//*   4    8:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//*   5   11:getfield        #1136 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//*   6   14:ifnonnull       20
	//*   7   17:goto            67
		{
			if(Looper.myLooper() != mFragmentManager.mHost.getHandler().getLooper())
	//*   8   20:invokestatic    #1142 <Method Looper Looper.myLooper()>
	//*   9   23:aload_0         
	//*  10   24:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//*  11   27:getfield        #1136 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//*  12   30:invokevirtual   #1146 <Method Handler FragmentHostCallback.getHandler()>
	//*  13   33:invokevirtual   #1151 <Method Looper Handler.getLooper()>
	//*  14   36:if_acmpeq       62
			{
				mFragmentManager.mHost.getHandler().postAtFrontOfQueue(new Runnable() {

					public void run()
					{
						callStartTransitionListener();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field Fragment this$0>
					//    2    4:invokestatic    #24  <Method void Fragment.access$800(Fragment)>
					//    3    7:return          
					}

					final Fragment this$0;

			
			{
				this$0 = Fragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Fragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   15   39:aload_0         
	//   16   40:getfield        #349 <Field FragmentManagerImpl mFragmentManager>
	//   17   43:getfield        #1136 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//   18   46:invokevirtual   #1146 <Method Handler FragmentHostCallback.getHandler()>
	//   19   49:new             #14  <Class Fragment$1>
	//   20   52:dup             
	//   21   53:aload_0         
	//   22   54:invokespecial   #1152 <Method void Fragment$1(Fragment)>
	//   23   57:invokevirtual   #1156 <Method boolean Handler.postAtFrontOfQueue(Runnable)>
	//   24   60:pop             
				return;
	//   25   61:return          
			} else
			{
				callStartTransitionListener();
	//   26   62:aload_0         
	//   27   63:invokespecial   #148 <Method void callStartTransitionListener()>
				return;
	//   28   66:return          
			}
		} else
		{
			ensureAnimationInfo().mEnterTransitionPostponed = false;
	//   29   67:aload_0         
	//   30   68:invokespecial   #957 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//   31   71:iconst_0        
	//   32   72:putfield        #153 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
			return;
	//   33   75:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #227 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #1158 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		DebugUtils.buildShortClassTag(((Object) (this)), stringbuilder);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #1164 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		if(mIndex >= 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #130 <Field int mIndex>
	//*  10   20:iflt            40
		{
			stringbuilder.append(" #");
	//   11   23:aload_1         
	//   12   24:ldc2            #1166 <String " #">
	//   13   27:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append(mIndex);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #130 <Field int mIndex>
	//   18   36:invokevirtual   #1046 <Method StringBuilder StringBuilder.append(int)>
	//   19   39:pop             
		}
		if(mFragmentId != 0)
	//*  20   40:aload_0         
	//*  21   41:getfield        #268 <Field int mFragmentId>
	//*  22   44:ifeq            67
		{
			stringbuilder.append(" id=0x");
	//   23   47:aload_1         
	//   24   48:ldc2            #1168 <String " id=0x">
	//   25   51:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			stringbuilder.append(Integer.toHexString(mFragmentId));
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #268 <Field int mFragmentId>
	//   30   60:invokestatic    #274 <Method String Integer.toHexString(int)>
	//   31   63:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
		}
		if(mTag != null)
	//*  33   67:aload_0         
	//*  34   68:getfield        #282 <Field String mTag>
	//*  35   71:ifnull          91
		{
			stringbuilder.append(" ");
	//   36   74:aload_1         
	//   37   75:ldc2            #1170 <String " ">
	//   38   78:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			stringbuilder.append(mTag);
	//   40   82:aload_1         
	//   41   83:aload_0         
	//   42   84:getfield        #282 <Field String mTag>
	//   43   87:invokevirtual   #234 <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
		}
		stringbuilder.append('}');
	//   45   91:aload_1         
	//   46   92:bipush          125
	//   47   94:invokevirtual   #1173 <Method StringBuilder StringBuilder.append(char)>
	//   48   97:pop             
		return stringbuilder.toString();
	//   49   98:aload_1         
	//   50   99:invokevirtual   #240 <Method String StringBuilder.toString()>
	//   51  102:areturn         
	}

	public void unregisterForContextMenu(View view)
	{
		view.setOnCreateContextMenuListener(((android.view.View.OnCreateContextMenuListener) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #963 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
	//    3    5:return          
	}

	static final int ACTIVITY_CREATED = 2;
	static final int CREATED = 1;
	static final int INITIALIZING = 0;
	static final int RESUMED = 5;
	static final int STARTED = 4;
	static final int STOPPED = 3;
	static final Object USE_DEFAULT_TRANSITION = new Object();
	private static final SimpleArrayMap sClassMap = new SimpleArrayMap();
	boolean mAdded;
	AnimationInfo mAnimationInfo;
	Bundle mArguments;
	int mBackStackNesting;
	boolean mCalled;
	FragmentManagerImpl mChildFragmentManager;
	FragmentManagerNonConfig mChildNonConfig;
	ViewGroup mContainer;
	int mContainerId;
	boolean mDeferStart;
	boolean mDetached;
	int mFragmentId;
	FragmentManagerImpl mFragmentManager;
	boolean mFromLayout;
	boolean mHasMenu;
	boolean mHidden;
	boolean mHiddenChanged;
	FragmentHostCallback mHost;
	boolean mInLayout;
	int mIndex;
	View mInnerView;
	boolean mIsCreated;
	boolean mIsNewlyAdded;
	LayoutInflater mLayoutInflater;
	LifecycleRegistry mLifecycleRegistry;
	LoaderManagerImpl mLoaderManager;
	boolean mMenuVisible;
	Fragment mParentFragment;
	boolean mPerformedCreateView;
	float mPostponedAlpha;
	boolean mRemoving;
	boolean mRestored;
	boolean mRetainInstance;
	boolean mRetaining;
	Bundle mSavedFragmentState;
	Boolean mSavedUserVisibleHint;
	SparseArray mSavedViewState;
	int mState;
	String mTag;
	Fragment mTarget;
	int mTargetIndex;
	int mTargetRequestCode;
	boolean mUserVisibleHint;
	View mView;
	ViewModelStore mViewModelStore;
	String mWho;

	static 
	{
	//    0    0:new             #117 <Class SimpleArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #120 <Method void SimpleArrayMap()>
	//    3    7:putstatic       #122 <Field SimpleArrayMap sClassMap>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #123 <Method void Object()>
	//    7   17:putstatic       #125 <Field Object USE_DEFAULT_TRANSITION>
	//*   8   20:return          
	}


/*
	static void access$800(Fragment fragment)
	{
		fragment.callStartTransitionListener();
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method void callStartTransitionListener()>
		return;
	//    2    4:return          
	}

*/
}
