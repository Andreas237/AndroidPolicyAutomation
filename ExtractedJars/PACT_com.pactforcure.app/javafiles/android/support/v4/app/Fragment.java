// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
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
	implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
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
	//    1    1:invokespecial   #114 <Method void Object()>
		mState = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #119 <Field int mState>
		mIndex = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #121 <Field int mIndex>
		mTargetIndex = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #123 <Field int mTargetIndex>
		mMenuVisible = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #125 <Field boolean mMenuVisible>
		mUserVisibleHint = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #127 <Field boolean mUserVisibleHint>
	//   17   29:return          
	}

	private void callStartTransitionListener()
	{
		OnStartEnterTransitionListener onstartentertransitionlistener;
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       20
		{
			onstartentertransitionlistener = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		} else
	//*   5    9:aload_1         
	//*   6   10:ifnull          19
	//*   7   13:aload_1         
	//*   8   14:invokeinterface #137 <Method void Fragment$OnStartEnterTransitionListener.onStartEnterTransition()>
	//*   9   19:return          
		{
			mAnimationInfo.mEnterTransitionPostponed = false;
	//   10   20:aload_0         
	//   11   21:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   12   24:iconst_0        
	//   13   25:putfield        #140 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
			onstartentertransitionlistener = mAnimationInfo.mStartEnterTransitionListener;
	//   14   28:aload_0         
	//   15   29:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   16   32:getfield        #144 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//   17   35:astore_1        
			mAnimationInfo.mStartEnterTransitionListener = null;
	//   18   36:aload_0         
	//   19   37:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   20   40:aconst_null     
	//   21   41:putfield        #144 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
		}
		if(onstartentertransitionlistener != null)
			onstartentertransitionlistener.onStartEnterTransition();
	//*  22   44:goto            9
	}

	private AnimationInfo ensureAnimationInfo()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       18
			mAnimationInfo = new AnimationInfo();
	//    3    7:aload_0         
	//    4    8:new             #14  <Class Fragment$AnimationInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #147 <Method void Fragment$AnimationInfo()>
	//    7   15:putfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
		return mAnimationInfo;
	//    8   18:aload_0         
	//    9   19:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   10   22:areturn         
	}

	public static Fragment instantiate(Context context, String s)
	{
		return instantiate(context, s, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #152 <Method Fragment instantiate(Context, String, Bundle)>
	//    4    6:areturn         
	}

	public static Fragment instantiate(Context context, String s, Bundle bundle)
	{
		Class class1;
		Class class2;
		try
		{
			class2 = (Class)sClassMap.get(((Object) (s)));
	//    0    0:getstatic       #113 <Field SimpleArrayMap sClassMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #167 <Method Object SimpleArrayMap.get(Object)>
	//    3    7:checkcast       #169 <Class Class>
	//    4   10:astore          4
		}
	//*   5   12:aload           4
	//*   6   14:astore_3        
	//*   7   15:aload           4
	//*   8   17:ifnonnull       38
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #175 <Method ClassLoader Context.getClassLoader()>
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #181 <Method Class ClassLoader.loadClass(String)>
	//*  13   28:astore_3        
	//*  14   29:getstatic       #113 <Field SimpleArrayMap sClassMap>
	//*  15   32:aload_1         
	//*  16   33:aload_3         
	//*  17   34:invokevirtual   #185 <Method Object SimpleArrayMap.put(Object, Object)>
	//*  18   37:pop             
	//*  19   38:aload_3         
	//*  20   39:iconst_0        
	//*  21   40:anewarray       Class[]
	//*  22   43:invokevirtual   #189 <Method Constructor Class.getConstructor(Class[])>
	//*  23   46:iconst_0        
	//*  24   47:anewarray       Object[]
	//*  25   50:invokevirtual   #195 <Method Object Constructor.newInstance(Object[])>
	//*  26   53:checkcast       #2   <Class Fragment>
	//*  27   56:astore_0        
	//*  28   57:aload_2         
	//*  29   58:ifnull          77
	//*  30   61:aload_2         
	//*  31   62:aload_0         
	//*  32   63:invokevirtual   #199 <Method Class Object.getClass()>
	//*  33   66:invokevirtual   #200 <Method ClassLoader Class.getClassLoader()>
	//*  34   69:invokevirtual   #206 <Method void Bundle.setClassLoader(ClassLoader)>
	//*  35   72:aload_0         
	//*  36   73:aload_2         
	//*  37   74:invokevirtual   #210 <Method void setArguments(Bundle)>
	//*  38   77:aload_0         
	//*  39   78:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  40   79:astore_0        
		{
			throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), ((Exception) (context)));
	//   41   80:new             #17  <Class Fragment$InstantiationException>
	//   42   83:dup             
	//   43   84:new             #212 <Class StringBuilder>
	//   44   87:dup             
	//   45   88:invokespecial   #213 <Method void StringBuilder()>
	//   46   91:ldc1            #215 <String "Unable to instantiate fragment ">
	//   47   93:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   48   96:aload_1         
	//   49   97:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   50  100:ldc1            #221 <String ": make sure class name exists, is public, and has an">
	//   51  102:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   52  105:ldc1            #223 <String " empty constructor that is public">
	//   53  107:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   54  110:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   55  113:aload_0         
	//   56  114:invokespecial   #230 <Method void Fragment$InstantiationException(String, Exception)>
	//   57  117:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  58  118:astore_0        
		{
			throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), ((Exception) (context)));
	//   59  119:new             #17  <Class Fragment$InstantiationException>
	//   60  122:dup             
	//   61  123:new             #212 <Class StringBuilder>
	//   62  126:dup             
	//   63  127:invokespecial   #213 <Method void StringBuilder()>
	//   64  130:ldc1            #215 <String "Unable to instantiate fragment ">
	//   65  132:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   66  135:aload_1         
	//   67  136:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   68  139:ldc1            #221 <String ": make sure class name exists, is public, and has an">
	//   69  141:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   70  144:ldc1            #223 <String " empty constructor that is public">
	//   71  146:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   72  149:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   73  152:aload_0         
	//   74  153:invokespecial   #230 <Method void Fragment$InstantiationException(String, Exception)>
	//   75  156:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  76  157:astore_0        
		{
			throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), ((Exception) (context)));
	//   77  158:new             #17  <Class Fragment$InstantiationException>
	//   78  161:dup             
	//   79  162:new             #212 <Class StringBuilder>
	//   80  165:dup             
	//   81  166:invokespecial   #213 <Method void StringBuilder()>
	//   82  169:ldc1            #215 <String "Unable to instantiate fragment ">
	//   83  171:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   84  174:aload_1         
	//   85  175:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   86  178:ldc1            #221 <String ": make sure class name exists, is public, and has an">
	//   87  180:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   88  183:ldc1            #223 <String " empty constructor that is public">
	//   89  185:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   90  188:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   91  191:aload_0         
	//   92  192:invokespecial   #230 <Method void Fragment$InstantiationException(String, Exception)>
	//   93  195:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  94  196:astore_0        
		{
			throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": could not find Fragment constructor").toString(), ((Exception) (context)));
	//   95  197:new             #17  <Class Fragment$InstantiationException>
	//   96  200:dup             
	//   97  201:new             #212 <Class StringBuilder>
	//   98  204:dup             
	//   99  205:invokespecial   #213 <Method void StringBuilder()>
	//  100  208:ldc1            #215 <String "Unable to instantiate fragment ">
	//  101  210:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  102  213:aload_1         
	//  103  214:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  104  217:ldc1            #232 <String ": could not find Fragment constructor">
	//  105  219:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  106  222:invokevirtual   #227 <Method String StringBuilder.toString()>
	//  107  225:aload_0         
	//  108  226:invokespecial   #230 <Method void Fragment$InstantiationException(String, Exception)>
	//  109  229:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 110  230:astore_0        
		{
			throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": calling Fragment constructor caused an exception").toString(), ((Exception) (context)));
	//  111  231:new             #17  <Class Fragment$InstantiationException>
	//  112  234:dup             
	//  113  235:new             #212 <Class StringBuilder>
	//  114  238:dup             
	//  115  239:invokespecial   #213 <Method void StringBuilder()>
	//  116  242:ldc1            #215 <String "Unable to instantiate fragment ">
	//  117  244:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  118  247:aload_1         
	//  119  248:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  120  251:ldc1            #234 <String ": calling Fragment constructor caused an exception">
	//  121  253:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  122  256:invokevirtual   #227 <Method String StringBuilder.toString()>
	//  123  259:aload_0         
	//  124  260:invokespecial   #230 <Method void Fragment$InstantiationException(String, Exception)>
	//  125  263:athrow          
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
	//    0    0:getstatic       #113 <Field SimpleArrayMap sClassMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #167 <Method Object SimpleArrayMap.get(Object)>
	//    3    7:checkcast       #169 <Class Class>
	//    4   10:astore          4
		}
	//*   5   12:aload           4
	//*   6   14:astore_3        
	//*   7   15:aload           4
	//*   8   17:ifnonnull       38
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #175 <Method ClassLoader Context.getClassLoader()>
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #181 <Method Class ClassLoader.loadClass(String)>
	//*  13   28:astore_3        
	//*  14   29:getstatic       #113 <Field SimpleArrayMap sClassMap>
	//*  15   32:aload_1         
	//*  16   33:aload_3         
	//*  17   34:invokevirtual   #185 <Method Object SimpleArrayMap.put(Object, Object)>
	//*  18   37:pop             
	//*  19   38:ldc1            #2   <Class Fragment>
	//*  20   40:aload_3         
	//*  21   41:invokevirtual   #241 <Method boolean Class.isAssignableFrom(Class)>
	//*  22   44:istore_2        
	//*  23   45:iload_2         
	//*  24   46:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  25   47:astore_0        
		{
			return false;
	//   26   48:iconst_0        
	//   27   49:ireturn         
		}
		class1 = class2;
		if(class2 != null)
			break MISSING_BLOCK_LABEL_38;
		class1 = context.getClassLoader().loadClass(s);
		sClassMap.put(((Object) (s)), ((Object) (class1)));
		flag = ((Class) (android/support/v4/app/Fragment)).isAssignableFrom(class1);
		return flag;
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.print(s);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print("mFragmentId=#");
	//    3    5:aload_3         
	//    4    6:ldc1            #251 <String "mFragmentId=#">
	//    5    8:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(mFragmentId));
	//    6   11:aload_3         
	//    7   12:aload_0         
	//    8   13:getfield        #253 <Field int mFragmentId>
	//    9   16:invokestatic    #259 <Method String Integer.toHexString(int)>
	//   10   19:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(" mContainerId=#");
	//   11   22:aload_3         
	//   12   23:ldc2            #261 <String " mContainerId=#">
	//   13   26:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(mContainerId));
	//   14   29:aload_3         
	//   15   30:aload_0         
	//   16   31:getfield        #263 <Field int mContainerId>
	//   17   34:invokestatic    #259 <Method String Integer.toHexString(int)>
	//   18   37:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(" mTag=");
	//   19   40:aload_3         
	//   20   41:ldc2            #265 <String " mTag=">
	//   21   44:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.println(mTag);
	//   22   47:aload_3         
	//   23   48:aload_0         
	//   24   49:getfield        #267 <Field String mTag>
	//   25   52:invokevirtual   #270 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   26   55:aload_3         
	//   27   56:aload_1         
	//   28   57:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print("mState=");
	//   29   60:aload_3         
	//   30   61:ldc2            #272 <String "mState=">
	//   31   64:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mState);
	//   32   67:aload_3         
	//   33   68:aload_0         
	//   34   69:getfield        #119 <Field int mState>
	//   35   72:invokevirtual   #275 <Method void PrintWriter.print(int)>
		printwriter.print(" mIndex=");
	//   36   75:aload_3         
	//   37   76:ldc2            #277 <String " mIndex=">
	//   38   79:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mIndex);
	//   39   82:aload_3         
	//   40   83:aload_0         
	//   41   84:getfield        #121 <Field int mIndex>
	//   42   87:invokevirtual   #275 <Method void PrintWriter.print(int)>
		printwriter.print(" mWho=");
	//   43   90:aload_3         
	//   44   91:ldc2            #279 <String " mWho=">
	//   45   94:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mWho);
	//   46   97:aload_3         
	//   47   98:aload_0         
	//   48   99:getfield        #281 <Field String mWho>
	//   49  102:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(" mBackStackNesting=");
	//   50  105:aload_3         
	//   51  106:ldc2            #283 <String " mBackStackNesting=">
	//   52  109:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.println(mBackStackNesting);
	//   53  112:aload_3         
	//   54  113:aload_0         
	//   55  114:getfield        #285 <Field int mBackStackNesting>
	//   56  117:invokevirtual   #287 <Method void PrintWriter.println(int)>
		printwriter.print(s);
	//   57  120:aload_3         
	//   58  121:aload_1         
	//   59  122:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print("mAdded=");
	//   60  125:aload_3         
	//   61  126:ldc2            #289 <String "mAdded=">
	//   62  129:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mAdded);
	//   63  132:aload_3         
	//   64  133:aload_0         
	//   65  134:getfield        #291 <Field boolean mAdded>
	//   66  137:invokevirtual   #294 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRemoving=");
	//   67  140:aload_3         
	//   68  141:ldc2            #296 <String " mRemoving=">
	//   69  144:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mRemoving);
	//   70  147:aload_3         
	//   71  148:aload_0         
	//   72  149:getfield        #298 <Field boolean mRemoving>
	//   73  152:invokevirtual   #294 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mFromLayout=");
	//   74  155:aload_3         
	//   75  156:ldc2            #300 <String " mFromLayout=">
	//   76  159:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mFromLayout);
	//   77  162:aload_3         
	//   78  163:aload_0         
	//   79  164:getfield        #302 <Field boolean mFromLayout>
	//   80  167:invokevirtual   #294 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mInLayout=");
	//   81  170:aload_3         
	//   82  171:ldc2            #304 <String " mInLayout=">
	//   83  174:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.println(mInLayout);
	//   84  177:aload_3         
	//   85  178:aload_0         
	//   86  179:getfield        #306 <Field boolean mInLayout>
	//   87  182:invokevirtual   #308 <Method void PrintWriter.println(boolean)>
		printwriter.print(s);
	//   88  185:aload_3         
	//   89  186:aload_1         
	//   90  187:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print("mHidden=");
	//   91  190:aload_3         
	//   92  191:ldc2            #310 <String "mHidden=">
	//   93  194:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mHidden);
	//   94  197:aload_3         
	//   95  198:aload_0         
	//   96  199:getfield        #312 <Field boolean mHidden>
	//   97  202:invokevirtual   #294 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDetached=");
	//   98  205:aload_3         
	//   99  206:ldc2            #314 <String " mDetached=">
	//  100  209:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mDetached);
	//  101  212:aload_3         
	//  102  213:aload_0         
	//  103  214:getfield        #316 <Field boolean mDetached>
	//  104  217:invokevirtual   #294 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mMenuVisible=");
	//  105  220:aload_3         
	//  106  221:ldc2            #318 <String " mMenuVisible=">
	//  107  224:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mMenuVisible);
	//  108  227:aload_3         
	//  109  228:aload_0         
	//  110  229:getfield        #125 <Field boolean mMenuVisible>
	//  111  232:invokevirtual   #294 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mHasMenu=");
	//  112  235:aload_3         
	//  113  236:ldc2            #320 <String " mHasMenu=">
	//  114  239:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.println(mHasMenu);
	//  115  242:aload_3         
	//  116  243:aload_0         
	//  117  244:getfield        #322 <Field boolean mHasMenu>
	//  118  247:invokevirtual   #308 <Method void PrintWriter.println(boolean)>
		printwriter.print(s);
	//  119  250:aload_3         
	//  120  251:aload_1         
	//  121  252:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print("mRetainInstance=");
	//  122  255:aload_3         
	//  123  256:ldc2            #324 <String "mRetainInstance=">
	//  124  259:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mRetainInstance);
	//  125  262:aload_3         
	//  126  263:aload_0         
	//  127  264:getfield        #326 <Field boolean mRetainInstance>
	//  128  267:invokevirtual   #294 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRetaining=");
	//  129  270:aload_3         
	//  130  271:ldc2            #328 <String " mRetaining=">
	//  131  274:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.print(mRetaining);
	//  132  277:aload_3         
	//  133  278:aload_0         
	//  134  279:getfield        #330 <Field boolean mRetaining>
	//  135  282:invokevirtual   #294 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mUserVisibleHint=");
	//  136  285:aload_3         
	//  137  286:ldc2            #332 <String " mUserVisibleHint=">
	//  138  289:invokevirtual   #249 <Method void PrintWriter.print(String)>
		printwriter.println(mUserVisibleHint);
	//  139  292:aload_3         
	//  140  293:aload_0         
	//  141  294:getfield        #127 <Field boolean mUserVisibleHint>
	//  142  297:invokevirtual   #308 <Method void PrintWriter.println(boolean)>
		if(mFragmentManager != null)
	//* 143  300:aload_0         
	//* 144  301:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//* 145  304:ifnull          327
		{
			printwriter.print(s);
	//  146  307:aload_3         
	//  147  308:aload_1         
	//  148  309:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mFragmentManager=");
	//  149  312:aload_3         
	//  150  313:ldc2            #336 <String "mFragmentManager=">
	//  151  316:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mFragmentManager)));
	//  152  319:aload_3         
	//  153  320:aload_0         
	//  154  321:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//  155  324:invokevirtual   #339 <Method void PrintWriter.println(Object)>
		}
		if(mHost != null)
	//* 156  327:aload_0         
	//* 157  328:getfield        #341 <Field FragmentHostCallback mHost>
	//* 158  331:ifnull          354
		{
			printwriter.print(s);
	//  159  334:aload_3         
	//  160  335:aload_1         
	//  161  336:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mHost=");
	//  162  339:aload_3         
	//  163  340:ldc2            #343 <String "mHost=">
	//  164  343:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mHost)));
	//  165  346:aload_3         
	//  166  347:aload_0         
	//  167  348:getfield        #341 <Field FragmentHostCallback mHost>
	//  168  351:invokevirtual   #339 <Method void PrintWriter.println(Object)>
		}
		if(mParentFragment != null)
	//* 169  354:aload_0         
	//* 170  355:getfield        #345 <Field Fragment mParentFragment>
	//* 171  358:ifnull          381
		{
			printwriter.print(s);
	//  172  361:aload_3         
	//  173  362:aload_1         
	//  174  363:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mParentFragment=");
	//  175  366:aload_3         
	//  176  367:ldc2            #347 <String "mParentFragment=">
	//  177  370:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParentFragment)));
	//  178  373:aload_3         
	//  179  374:aload_0         
	//  180  375:getfield        #345 <Field Fragment mParentFragment>
	//  181  378:invokevirtual   #339 <Method void PrintWriter.println(Object)>
		}
		if(mArguments != null)
	//* 182  381:aload_0         
	//* 183  382:getfield        #349 <Field Bundle mArguments>
	//* 184  385:ifnull          408
		{
			printwriter.print(s);
	//  185  388:aload_3         
	//  186  389:aload_1         
	//  187  390:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mArguments=");
	//  188  393:aload_3         
	//  189  394:ldc2            #351 <String "mArguments=">
	//  190  397:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mArguments)));
	//  191  400:aload_3         
	//  192  401:aload_0         
	//  193  402:getfield        #349 <Field Bundle mArguments>
	//  194  405:invokevirtual   #339 <Method void PrintWriter.println(Object)>
		}
		if(mSavedFragmentState != null)
	//* 195  408:aload_0         
	//* 196  409:getfield        #353 <Field Bundle mSavedFragmentState>
	//* 197  412:ifnull          435
		{
			printwriter.print(s);
	//  198  415:aload_3         
	//  199  416:aload_1         
	//  200  417:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mSavedFragmentState=");
	//  201  420:aload_3         
	//  202  421:ldc2            #355 <String "mSavedFragmentState=">
	//  203  424:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mSavedFragmentState)));
	//  204  427:aload_3         
	//  205  428:aload_0         
	//  206  429:getfield        #353 <Field Bundle mSavedFragmentState>
	//  207  432:invokevirtual   #339 <Method void PrintWriter.println(Object)>
		}
		if(mSavedViewState != null)
	//* 208  435:aload_0         
	//* 209  436:getfield        #357 <Field SparseArray mSavedViewState>
	//* 210  439:ifnull          462
		{
			printwriter.print(s);
	//  211  442:aload_3         
	//  212  443:aload_1         
	//  213  444:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mSavedViewState=");
	//  214  447:aload_3         
	//  215  448:ldc2            #359 <String "mSavedViewState=">
	//  216  451:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mSavedViewState)));
	//  217  454:aload_3         
	//  218  455:aload_0         
	//  219  456:getfield        #357 <Field SparseArray mSavedViewState>
	//  220  459:invokevirtual   #339 <Method void PrintWriter.println(Object)>
		}
		if(mTarget != null)
	//* 221  462:aload_0         
	//* 222  463:getfield        #361 <Field Fragment mTarget>
	//* 223  466:ifnull          504
		{
			printwriter.print(s);
	//  224  469:aload_3         
	//  225  470:aload_1         
	//  226  471:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mTarget=");
	//  227  474:aload_3         
	//  228  475:ldc2            #363 <String "mTarget=">
	//  229  478:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print(((Object) (mTarget)));
	//  230  481:aload_3         
	//  231  482:aload_0         
	//  232  483:getfield        #361 <Field Fragment mTarget>
	//  233  486:invokevirtual   #365 <Method void PrintWriter.print(Object)>
			printwriter.print(" mTargetRequestCode=");
	//  234  489:aload_3         
	//  235  490:ldc2            #367 <String " mTargetRequestCode=">
	//  236  493:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(mTargetRequestCode);
	//  237  496:aload_3         
	//  238  497:aload_0         
	//  239  498:getfield        #369 <Field int mTargetRequestCode>
	//  240  501:invokevirtual   #287 <Method void PrintWriter.println(int)>
		}
		if(getNextAnim() != 0)
	//* 241  504:aload_0         
	//* 242  505:invokevirtual   #373 <Method int getNextAnim()>
	//* 243  508:ifeq            531
		{
			printwriter.print(s);
	//  244  511:aload_3         
	//  245  512:aload_1         
	//  246  513:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mNextAnim=");
	//  247  516:aload_3         
	//  248  517:ldc2            #375 <String "mNextAnim=">
	//  249  520:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(getNextAnim());
	//  250  523:aload_3         
	//  251  524:aload_0         
	//  252  525:invokevirtual   #373 <Method int getNextAnim()>
	//  253  528:invokevirtual   #287 <Method void PrintWriter.println(int)>
		}
		if(mContainer != null)
	//* 254  531:aload_0         
	//* 255  532:getfield        #377 <Field ViewGroup mContainer>
	//* 256  535:ifnull          558
		{
			printwriter.print(s);
	//  257  538:aload_3         
	//  258  539:aload_1         
	//  259  540:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mContainer=");
	//  260  543:aload_3         
	//  261  544:ldc2            #379 <String "mContainer=">
	//  262  547:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mContainer)));
	//  263  550:aload_3         
	//  264  551:aload_0         
	//  265  552:getfield        #377 <Field ViewGroup mContainer>
	//  266  555:invokevirtual   #339 <Method void PrintWriter.println(Object)>
		}
		if(mView != null)
	//* 267  558:aload_0         
	//* 268  559:getfield        #381 <Field View mView>
	//* 269  562:ifnull          585
		{
			printwriter.print(s);
	//  270  565:aload_3         
	//  271  566:aload_1         
	//  272  567:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mView=");
	//  273  570:aload_3         
	//  274  571:ldc2            #383 <String "mView=">
	//  275  574:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mView)));
	//  276  577:aload_3         
	//  277  578:aload_0         
	//  278  579:getfield        #381 <Field View mView>
	//  279  582:invokevirtual   #339 <Method void PrintWriter.println(Object)>
		}
		if(mInnerView != null)
	//* 280  585:aload_0         
	//* 281  586:getfield        #385 <Field View mInnerView>
	//* 282  589:ifnull          612
		{
			printwriter.print(s);
	//  283  592:aload_3         
	//  284  593:aload_1         
	//  285  594:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mInnerView=");
	//  286  597:aload_3         
	//  287  598:ldc2            #387 <String "mInnerView=">
	//  288  601:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mView)));
	//  289  604:aload_3         
	//  290  605:aload_0         
	//  291  606:getfield        #381 <Field View mView>
	//  292  609:invokevirtual   #339 <Method void PrintWriter.println(Object)>
		}
		if(getAnimatingAway() != null)
	//* 293  612:aload_0         
	//* 294  613:invokevirtual   #391 <Method View getAnimatingAway()>
	//* 295  616:ifnull          659
		{
			printwriter.print(s);
	//  296  619:aload_3         
	//  297  620:aload_1         
	//  298  621:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mAnimatingAway=");
	//  299  624:aload_3         
	//  300  625:ldc2            #393 <String "mAnimatingAway=">
	//  301  628:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (getAnimatingAway())));
	//  302  631:aload_3         
	//  303  632:aload_0         
	//  304  633:invokevirtual   #391 <Method View getAnimatingAway()>
	//  305  636:invokevirtual   #339 <Method void PrintWriter.println(Object)>
			printwriter.print(s);
	//  306  639:aload_3         
	//  307  640:aload_1         
	//  308  641:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.print("mStateAfterAnimating=");
	//  309  644:aload_3         
	//  310  645:ldc2            #395 <String "mStateAfterAnimating=">
	//  311  648:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println(getStateAfterAnimating());
	//  312  651:aload_3         
	//  313  652:aload_0         
	//  314  653:invokevirtual   #398 <Method int getStateAfterAnimating()>
	//  315  656:invokevirtual   #287 <Method void PrintWriter.println(int)>
		}
		if(mLoaderManager != null)
	//* 316  659:aload_0         
	//* 317  660:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//* 318  663:ifnull          709
		{
			printwriter.print(s);
	//  319  666:aload_3         
	//  320  667:aload_1         
	//  321  668:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println("Loader Manager:");
	//  322  671:aload_3         
	//  323  672:ldc2            #402 <String "Loader Manager:">
	//  324  675:invokevirtual   #270 <Method void PrintWriter.println(String)>
			mLoaderManager.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
	//  325  678:aload_0         
	//  326  679:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//  327  682:new             #212 <Class StringBuilder>
	//  328  685:dup             
	//  329  686:invokespecial   #213 <Method void StringBuilder()>
	//  330  689:aload_1         
	//  331  690:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  332  693:ldc2            #404 <String "  ">
	//  333  696:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  334  699:invokevirtual   #227 <Method String StringBuilder.toString()>
	//  335  702:aload_2         
	//  336  703:aload_3         
	//  337  704:aload           4
	//  338  706:invokevirtual   #408 <Method void LoaderManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
		}
		if(mChildFragmentManager != null)
	//* 339  709:aload_0         
	//* 340  710:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//* 341  713:ifnull          785
		{
			printwriter.print(s);
	//  342  716:aload_3         
	//  343  717:aload_1         
	//  344  718:invokevirtual   #249 <Method void PrintWriter.print(String)>
			printwriter.println((new StringBuilder()).append("Child ").append(((Object) (mChildFragmentManager))).append(":").toString());
	//  345  721:aload_3         
	//  346  722:new             #212 <Class StringBuilder>
	//  347  725:dup             
	//  348  726:invokespecial   #213 <Method void StringBuilder()>
	//  349  729:ldc2            #412 <String "Child ">
	//  350  732:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  351  735:aload_0         
	//  352  736:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//  353  739:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//  354  742:ldc2            #417 <String ":">
	//  355  745:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  356  748:invokevirtual   #227 <Method String StringBuilder.toString()>
	//  357  751:invokevirtual   #270 <Method void PrintWriter.println(String)>
			mChildFragmentManager.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
	//  358  754:aload_0         
	//  359  755:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//  360  758:new             #212 <Class StringBuilder>
	//  361  761:dup             
	//  362  762:invokespecial   #213 <Method void StringBuilder()>
	//  363  765:aload_1         
	//  364  766:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  365  769:ldc2            #404 <String "  ">
	//  366  772:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//  367  775:invokevirtual   #227 <Method String StringBuilder.toString()>
	//  368  778:aload_2         
	//  369  779:aload_3         
	//  370  780:aload           4
	//  371  782:invokevirtual   #420 <Method void FragmentManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
		}
	//  372  785:return          
	}

	public final boolean equals(Object obj)
	{
		return super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #424 <Method boolean Object.equals(Object)>
	//    3    5:ireturn         
	}

	Fragment findFragmentByWho(String s)
	{
		if(s.equals(((Object) (mWho))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #281 <Field String mWho>
	//*   3    5:invokevirtual   #429 <Method boolean String.equals(Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		if(mChildFragmentManager != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   9   17:ifnull          29
			return mChildFragmentManager.findFragmentByWho(s);
	//   10   20:aload_0         
	//   11   21:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #431 <Method Fragment FragmentManagerImpl.findFragmentByWho(String)>
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
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (FragmentActivity)mHost.getActivity();
	//    5    9:aload_0         
	//    6   10:getfield        #341 <Field FragmentHostCallback mHost>
	//    7   13:invokevirtual   #438 <Method Activity FragmentHostCallback.getActivity()>
	//    8   16:checkcast       #440 <Class FragmentActivity>
	//    9   19:areturn         
	}

	public boolean getAllowEnterTransitionOverlap()
	{
		if(mAnimationInfo == null || mAnimationInfo.mAllowEnterTransitionOverlap == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   5   11:invokestatic    #446 <Method Boolean Fragment$AnimationInfo.access$600(Fragment$AnimationInfo)>
	//*   6   14:ifnonnull       19
			return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
		else
			return mAnimationInfo.mAllowEnterTransitionOverlap.booleanValue();
	//    9   19:aload_0         
	//   10   20:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   11   23:invokestatic    #446 <Method Boolean Fragment$AnimationInfo.access$600(Fragment$AnimationInfo)>
	//   12   26:invokevirtual   #451 <Method boolean Boolean.booleanValue()>
	//   13   29:ireturn         
	}

	public boolean getAllowReturnTransitionOverlap()
	{
		if(mAnimationInfo == null || mAnimationInfo.mAllowReturnTransitionOverlap == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   5   11:invokestatic    #455 <Method Boolean Fragment$AnimationInfo.access$700(Fragment$AnimationInfo)>
	//*   6   14:ifnonnull       19
			return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
		else
			return mAnimationInfo.mAllowReturnTransitionOverlap.booleanValue();
	//    9   19:aload_0         
	//   10   20:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   11   23:invokestatic    #455 <Method Boolean Fragment$AnimationInfo.access$700(Fragment$AnimationInfo)>
	//   12   26:invokevirtual   #451 <Method boolean Boolean.booleanValue()>
	//   13   29:ireturn         
	}

	View getAnimatingAway()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mAnimatingAway;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #458 <Field View Fragment$AnimationInfo.mAnimatingAway>
	//    8   16:areturn         
	}

	Animator getAnimator()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mAnimator;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #464 <Field Animator Fragment$AnimationInfo.mAnimator>
	//    8   16:areturn         
	}

	public final Bundle getArguments()
	{
		return mArguments;
	//    0    0:aload_0         
	//    1    1:getfield        #349 <Field Bundle mArguments>
	//    2    4:areturn         
	}

	public final FragmentManager getChildFragmentManager()
	{
		if(mChildFragmentManager != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:ifnonnull       26
_L1:
		instantiateChildFragmentManager();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #471 <Method void instantiateChildFragmentManager()>
		if(mState < 5) goto _L4; else goto _L3
	//    5   11:aload_0         
	//    6   12:getfield        #119 <Field int mState>
	//    7   15:iconst_5        
	//    8   16:icmplt          31
_L3:
		mChildFragmentManager.dispatchResume();
	//    9   19:aload_0         
	//   10   20:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   11   23:invokevirtual   #474 <Method void FragmentManagerImpl.dispatchResume()>
_L2:
		return ((FragmentManager) (mChildFragmentManager));
	//   12   26:aload_0         
	//   13   27:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   14   30:areturn         
_L4:
		if(mState >= 4)
	//*  15   31:aload_0         
	//*  16   32:getfield        #119 <Field int mState>
	//*  17   35:iconst_4        
	//*  18   36:icmplt          49
			mChildFragmentManager.dispatchStart();
	//   19   39:aload_0         
	//   20   40:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   21   43:invokevirtual   #477 <Method void FragmentManagerImpl.dispatchStart()>
		else
	//*  22   46:goto            26
		if(mState >= 2)
	//*  23   49:aload_0         
	//*  24   50:getfield        #119 <Field int mState>
	//*  25   53:iconst_2        
	//*  26   54:icmplt          67
			mChildFragmentManager.dispatchActivityCreated();
	//   27   57:aload_0         
	//   28   58:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   29   61:invokevirtual   #480 <Method void FragmentManagerImpl.dispatchActivityCreated()>
		else
	//*  30   64:goto            26
		if(mState >= 1)
	//*  31   67:aload_0         
	//*  32   68:getfield        #119 <Field int mState>
	//*  33   71:iconst_1        
	//*  34   72:icmplt          26
			mChildFragmentManager.dispatchCreate();
	//   35   75:aload_0         
	//   36   76:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   37   79:invokevirtual   #483 <Method void FragmentManagerImpl.dispatchCreate()>
		if(true) goto _L2; else goto _L5
	//   38   82:goto            26
_L5:
	}

	public Context getContext()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mHost.getContext();
	//    5    9:aload_0         
	//    6   10:getfield        #341 <Field FragmentHostCallback mHost>
	//    7   13:invokevirtual   #487 <Method Context FragmentHostCallback.getContext()>
	//    8   16:areturn         
	}

	public Object getEnterTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mEnterTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:invokestatic    #493 <Method Object Fragment$AnimationInfo.access$000(Fragment$AnimationInfo)>
	//    8   16:areturn         
	}

	SharedElementCallback getEnterTransitionCallback()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mEnterTransitionCallback;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #499 <Field SharedElementCallback Fragment$AnimationInfo.mEnterTransitionCallback>
	//    8   16:areturn         
	}

	public Object getExitTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mExitTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:invokestatic    #503 <Method Object Fragment$AnimationInfo.access$200(Fragment$AnimationInfo)>
	//    8   16:areturn         
	}

	SharedElementCallback getExitTransitionCallback()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mExitTransitionCallback;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #507 <Field SharedElementCallback Fragment$AnimationInfo.mExitTransitionCallback>
	//    8   16:areturn         
	}

	public final FragmentManager getFragmentManager()
	{
		return ((FragmentManager) (mFragmentManager));
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//    2    4:areturn         
	}

	public final Object getHost()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mHost.onGetHost();
	//    5    9:aload_0         
	//    6   10:getfield        #341 <Field FragmentHostCallback mHost>
	//    7   13:invokevirtual   #512 <Method Object FragmentHostCallback.onGetHost()>
	//    8   16:areturn         
	}

	public final int getId()
	{
		return mFragmentId;
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field int mFragmentId>
	//    2    4:ireturn         
	}

	public final LayoutInflater getLayoutInflater()
	{
		if(mLayoutInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #517 <Field LayoutInflater mLayoutInflater>
	//*   2    4:ifnonnull       13
			return performGetLayoutInflater(((Bundle) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #521 <Method LayoutInflater performGetLayoutInflater(Bundle)>
	//    6   12:areturn         
		else
			return mLayoutInflater;
	//    7   13:aload_0         
	//    8   14:getfield        #517 <Field LayoutInflater mLayoutInflater>
	//    9   17:areturn         
	}

	public LayoutInflater getLayoutInflater(Bundle bundle)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       18
		{
			throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
	//    3    7:new             #528 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #530 <String "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.">
	//    6   14:invokespecial   #532 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			bundle = ((Bundle) (mHost.onGetLayoutInflater()));
	//    8   18:aload_0         
	//    9   19:getfield        #341 <Field FragmentHostCallback mHost>
	//   10   22:invokevirtual   #535 <Method LayoutInflater FragmentHostCallback.onGetLayoutInflater()>
	//   11   25:astore_1        
			getChildFragmentManager();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #537 <Method FragmentManager getChildFragmentManager()>
	//   14   30:pop             
			LayoutInflaterCompat.setFactory2(((LayoutInflater) (bundle)), mChildFragmentManager.getLayoutInflaterFactory());
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   18   36:invokevirtual   #541 <Method android.view.LayoutInflater$Factory2 FragmentManagerImpl.getLayoutInflaterFactory()>
	//   19   39:invokestatic    #547 <Method void LayoutInflaterCompat.setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return ((LayoutInflater) (bundle));
	//   20   42:aload_1         
	//   21   43:areturn         
		}
	}

	public LoaderManager getLoaderManager()
	{
		if(mLoaderManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//*   2    4:ifnull          12
			return ((LoaderManager) (mLoaderManager));
	//    3    7:aload_0         
	//    4    8:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//    5   11:areturn         
		if(mHost == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #341 <Field FragmentHostCallback mHost>
	//*   8   16:ifnonnull       53
		{
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    9   19:new             #528 <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:new             #212 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #213 <Method void StringBuilder()>
	//   14   30:ldc2            #553 <String "Fragment ">
	//   15   33:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:aload_0         
	//   17   37:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   18   40:ldc2            #555 <String " not attached to Activity">
	//   19   43:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   20   46:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   21   49:invokespecial   #532 <Method void IllegalStateException(String)>
	//   22   52:athrow          
		} else
		{
			mCheckedForLoaderManager = true;
	//   23   53:aload_0         
	//   24   54:iconst_1        
	//   25   55:putfield        #557 <Field boolean mCheckedForLoaderManager>
			mLoaderManager = mHost.getLoaderManager(mWho, mLoadersStarted, true);
	//   26   58:aload_0         
	//   27   59:aload_0         
	//   28   60:getfield        #341 <Field FragmentHostCallback mHost>
	//   29   63:aload_0         
	//   30   64:getfield        #281 <Field String mWho>
	//   31   67:aload_0         
	//   32   68:getfield        #559 <Field boolean mLoadersStarted>
	//   33   71:iconst_1        
	//   34   72:invokevirtual   #562 <Method LoaderManagerImpl FragmentHostCallback.getLoaderManager(String, boolean, boolean)>
	//   35   75:putfield        #400 <Field LoaderManagerImpl mLoaderManager>
			return ((LoaderManager) (mLoaderManager));
	//   36   78:aload_0         
	//   37   79:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//   38   82:areturn         
		}
	}

	int getNextAnim()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mNextAnim;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #565 <Field int Fragment$AnimationInfo.mNextAnim>
	//    8   16:ireturn         
	}

	int getNextTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mNextTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #569 <Field int Fragment$AnimationInfo.mNextTransition>
	//    8   16:ireturn         
	}

	int getNextTransitionStyle()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mNextTransitionStyle;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #573 <Field int Fragment$AnimationInfo.mNextTransitionStyle>
	//    8   16:ireturn         
	}

	public final Fragment getParentFragment()
	{
		return mParentFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #345 <Field Fragment mParentFragment>
	//    2    4:areturn         
	}

	public Object getReenterTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mAnimationInfo.mReenterTransition == USE_DEFAULT_TRANSITION)
	//*   5    9:aload_0         
	//*   6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   7   13:invokestatic    #579 <Method Object Fragment$AnimationInfo.access$300(Fragment$AnimationInfo)>
	//*   8   16:getstatic       #116 <Field Object USE_DEFAULT_TRANSITION>
	//*   9   19:if_acmpne       27
			return getExitTransition();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #581 <Method Object getExitTransition()>
	//   12   26:areturn         
		else
			return mAnimationInfo.mReenterTransition;
	//   13   27:aload_0         
	//   14   28:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   15   31:invokestatic    #579 <Method Object Fragment$AnimationInfo.access$300(Fragment$AnimationInfo)>
	//   16   34:areturn         
	}

	public final Resources getResources()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       41
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    3    7:new             #528 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #212 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #213 <Method void StringBuilder()>
	//    8   18:ldc2            #553 <String "Fragment ">
	//    9   21:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #555 <String " not attached to Activity">
	//   13   31:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #532 <Method void IllegalStateException(String)>
	//   16   40:athrow          
		else
			return mHost.getContext().getResources();
	//   17   41:aload_0         
	//   18   42:getfield        #341 <Field FragmentHostCallback mHost>
	//   19   45:invokevirtual   #487 <Method Context FragmentHostCallback.getContext()>
	//   20   48:invokevirtual   #585 <Method Resources Context.getResources()>
	//   21   51:areturn         
	}

	public final boolean getRetainInstance()
	{
		return mRetainInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field boolean mRetainInstance>
	//    2    4:ireturn         
	}

	public Object getReturnTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mAnimationInfo.mReturnTransition == USE_DEFAULT_TRANSITION)
	//*   5    9:aload_0         
	//*   6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   7   13:invokestatic    #590 <Method Object Fragment$AnimationInfo.access$100(Fragment$AnimationInfo)>
	//*   8   16:getstatic       #116 <Field Object USE_DEFAULT_TRANSITION>
	//*   9   19:if_acmpne       27
			return getEnterTransition();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #592 <Method Object getEnterTransition()>
	//   12   26:areturn         
		else
			return mAnimationInfo.mReturnTransition;
	//   13   27:aload_0         
	//   14   28:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   15   31:invokestatic    #590 <Method Object Fragment$AnimationInfo.access$100(Fragment$AnimationInfo)>
	//   16   34:areturn         
	}

	public Object getSharedElementEnterTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mSharedElementEnterTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:invokestatic    #596 <Method Object Fragment$AnimationInfo.access$400(Fragment$AnimationInfo)>
	//    8   16:areturn         
	}

	public Object getSharedElementReturnTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mAnimationInfo.mSharedElementReturnTransition == USE_DEFAULT_TRANSITION)
	//*   5    9:aload_0         
	//*   6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   7   13:invokestatic    #600 <Method Object Fragment$AnimationInfo.access$500(Fragment$AnimationInfo)>
	//*   8   16:getstatic       #116 <Field Object USE_DEFAULT_TRANSITION>
	//*   9   19:if_acmpne       27
			return getSharedElementEnterTransition();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #602 <Method Object getSharedElementEnterTransition()>
	//   12   26:areturn         
		else
			return mAnimationInfo.mSharedElementReturnTransition;
	//   13   27:aload_0         
	//   14   28:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   15   31:invokestatic    #600 <Method Object Fragment$AnimationInfo.access$500(Fragment$AnimationInfo)>
	//   16   34:areturn         
	}

	int getStateAfterAnimating()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mStateAfterAnimating;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #605 <Field int Fragment$AnimationInfo.mStateAfterAnimating>
	//    8   16:ireturn         
	}

	public final String getString(int i)
	{
		return getResources().getString(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #608 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #612 <Method String Resources.getString(int)>
	//    4    8:areturn         
	}

	public final transient String getString(int i, Object aobj[])
	{
		return getResources().getString(i, aobj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #608 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #615 <Method String Resources.getString(int, Object[])>
	//    5    9:areturn         
	}

	public final String getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field String mTag>
	//    2    4:areturn         
	}

	public final Fragment getTargetFragment()
	{
		return mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field Fragment mTarget>
	//    2    4:areturn         
	}

	public final int getTargetRequestCode()
	{
		return mTargetRequestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #369 <Field int mTargetRequestCode>
	//    2    4:ireturn         
	}

	public final CharSequence getText(int i)
	{
		return getResources().getText(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #608 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #622 <Method CharSequence Resources.getText(int)>
	//    4    8:areturn         
	}

	public boolean getUserVisibleHint()
	{
		return mUserVisibleHint;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field boolean mUserVisibleHint>
	//    2    4:ireturn         
	}

	public View getView()
	{
		return mView;
	//    0    0:aload_0         
	//    1    1:getfield        #381 <Field View mView>
	//    2    4:areturn         
	}

	public final boolean hasOptionsMenu()
	{
		return mHasMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field boolean mHasMenu>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #628 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	void initState()
	{
		mIndex = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #121 <Field int mIndex>
		mWho = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #281 <Field String mWho>
		mAdded = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #291 <Field boolean mAdded>
		mRemoving = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #298 <Field boolean mRemoving>
		mFromLayout = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #302 <Field boolean mFromLayout>
		mInLayout = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #306 <Field boolean mInLayout>
		mRestored = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #631 <Field boolean mRestored>
		mBackStackNesting = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #285 <Field int mBackStackNesting>
		mFragmentManager = null;
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:putfield        #334 <Field FragmentManagerImpl mFragmentManager>
		mChildFragmentManager = null;
	//   27   45:aload_0         
	//   28   46:aconst_null     
	//   29   47:putfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
		mHost = null;
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:putfield        #341 <Field FragmentHostCallback mHost>
		mFragmentId = 0;
	//   33   55:aload_0         
	//   34   56:iconst_0        
	//   35   57:putfield        #253 <Field int mFragmentId>
		mContainerId = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #263 <Field int mContainerId>
		mTag = null;
	//   39   65:aload_0         
	//   40   66:aconst_null     
	//   41   67:putfield        #267 <Field String mTag>
		mHidden = false;
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:putfield        #312 <Field boolean mHidden>
		mDetached = false;
	//   45   75:aload_0         
	//   46   76:iconst_0        
	//   47   77:putfield        #316 <Field boolean mDetached>
		mRetaining = false;
	//   48   80:aload_0         
	//   49   81:iconst_0        
	//   50   82:putfield        #330 <Field boolean mRetaining>
		mLoaderManager = null;
	//   51   85:aload_0         
	//   52   86:aconst_null     
	//   53   87:putfield        #400 <Field LoaderManagerImpl mLoaderManager>
		mLoadersStarted = false;
	//   54   90:aload_0         
	//   55   91:iconst_0        
	//   56   92:putfield        #559 <Field boolean mLoadersStarted>
		mCheckedForLoaderManager = false;
	//   57   95:aload_0         
	//   58   96:iconst_0        
	//   59   97:putfield        #557 <Field boolean mCheckedForLoaderManager>
	//   60  100:return          
	}

	void instantiateChildFragmentManager()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       18
		{
			throw new IllegalStateException("Fragment has not been attached yet.");
	//    3    7:new             #528 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #633 <String "Fragment has not been attached yet.">
	//    6   14:invokespecial   #532 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mChildFragmentManager = new FragmentManagerImpl();
	//    8   18:aload_0         
	//    9   19:new             #419 <Class FragmentManagerImpl>
	//   10   22:dup             
	//   11   23:invokespecial   #634 <Method void FragmentManagerImpl()>
	//   12   26:putfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
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
	//   14   30:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   15   33:aload_0         
	//   16   34:getfield        #341 <Field FragmentHostCallback mHost>
	//   17   37:new             #12  <Class Fragment$2>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:invokespecial   #636 <Method void Fragment$2(Fragment)>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #640 <Method void FragmentManagerImpl.attachController(FragmentHostCallback, FragmentContainer, Fragment)>
			return;
	//   23   49:return          
		}
	}

	public final boolean isAdded()
	{
		return mHost != null && mAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #291 <Field boolean mAdded>
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
	//    1    1:getfield        #316 <Field boolean mDetached>
	//    2    4:ireturn         
	}

	public final boolean isHidden()
	{
		return mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field boolean mHidden>
	//    2    4:ireturn         
	}

	boolean isHideReplaced()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mIsHideReplaced;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #647 <Field boolean Fragment$AnimationInfo.mIsHideReplaced>
	//    8   16:ireturn         
	}

	final boolean isInBackStack()
	{
		return mBackStackNesting > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field int mBackStackNesting>
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
	//    1    1:getfield        #306 <Field boolean mInLayout>
	//    2    4:ireturn         
	}

	public final boolean isMenuVisible()
	{
		return mMenuVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean mMenuVisible>
	//    2    4:ireturn         
	}

	boolean isPostponed()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mEnterTransitionPostponed;
	//    5    9:aload_0         
	//    6   10:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #140 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//    8   16:ireturn         
	}

	public final boolean isRemoving()
	{
		return mRemoving;
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field boolean mRemoving>
	//    2    4:ireturn         
	}

	public final boolean isResumed()
	{
		return mState >= 5;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int mState>
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
	//*   1    1:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mFragmentManager.isStateSaved();
	//    5    9:aload_0         
	//    6   10:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//    7   13:invokevirtual   #656 <Method boolean FragmentManagerImpl.isStateSaved()>
	//    8   16:ireturn         
	}

	public final boolean isVisible()
	{
		return isAdded() && !isHidden() && mView != null && mView.getWindowToken() != null && mView.getVisibility() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #659 <Method boolean isAdded()>
	//    2    4:ifeq            43
	//    3    7:aload_0         
	//    4    8:invokevirtual   #661 <Method boolean isHidden()>
	//    5   11:ifne            43
	//    6   14:aload_0         
	//    7   15:getfield        #381 <Field View mView>
	//    8   18:ifnull          43
	//    9   21:aload_0         
	//   10   22:getfield        #381 <Field View mView>
	//   11   25:invokevirtual   #667 <Method android.os.IBinder View.getWindowToken()>
	//   12   28:ifnull          43
	//   13   31:aload_0         
	//   14   32:getfield        #381 <Field View mView>
	//   15   35:invokevirtual   #670 <Method int View.getVisibility()>
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
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #673 <Method void FragmentManagerImpl.noteStateNotSaved()>
	//    6   14:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #677 <Field boolean mCalled>
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
	//    2    2:putfield        #677 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onAttach(Context context)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #677 <Field boolean mCalled>
		if(mHost == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #341 <Field FragmentHostCallback mHost>
	//*   5    9:ifnonnull       29
			context = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		else
	//*   8   14:aload_1         
	//*   9   15:ifnull          28
	//*  10   18:aload_0         
	//*  11   19:iconst_0        
	//*  12   20:putfield        #677 <Field boolean mCalled>
	//*  13   23:aload_0         
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #684 <Method void onAttach(Activity)>
	//*  16   28:return          
			context = ((Context) (mHost.getActivity()));
	//   17   29:aload_0         
	//   18   30:getfield        #341 <Field FragmentHostCallback mHost>
	//   19   33:invokevirtual   #438 <Method Activity FragmentHostCallback.getActivity()>
	//   20   36:astore_1        
		if(context != null)
		{
			mCalled = false;
			onAttach(((Activity) (context)));
		}
	//*  21   37:goto            14
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
	//    2    2:putfield        #677 <Field boolean mCalled>
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
	//    2    2:putfield        #677 <Field boolean mCalled>
		restoreChildFragmentState(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #693 <Method void restoreChildFragmentState(Bundle)>
		if(mChildFragmentManager != null && !mChildFragmentManager.isStateAtLeast(1))
	//*   6   10:aload_0         
	//*   7   11:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   8   14:ifnull          35
	//*   9   17:aload_0         
	//*  10   18:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*  11   21:iconst_1        
	//*  12   22:invokevirtual   #697 <Method boolean FragmentManagerImpl.isStateAtLeast(int)>
	//*  13   25:ifne            35
			mChildFragmentManager.dispatchCreate();
	//   14   28:aload_0         
	//   15   29:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   16   32:invokevirtual   #483 <Method void FragmentManagerImpl.dispatchCreate()>
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
	//    1    1:invokevirtual   #705 <Method FragmentActivity getActivity()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #707 <Method void FragmentActivity.onCreateContextMenu(ContextMenu, View, android.view.ContextMenu$ContextMenuInfo)>
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
	//    2    2:putfield        #677 <Field boolean mCalled>
		if(!mCheckedForLoaderManager)
	//*   3    5:aload_0         
	//*   4    6:getfield        #557 <Field boolean mCheckedForLoaderManager>
	//*   5    9:ifne            37
		{
			mCheckedForLoaderManager = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #557 <Field boolean mCheckedForLoaderManager>
			mLoaderManager = mHost.getLoaderManager(mWho, mLoadersStarted, false);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #341 <Field FragmentHostCallback mHost>
	//   12   22:aload_0         
	//   13   23:getfield        #281 <Field String mWho>
	//   14   26:aload_0         
	//   15   27:getfield        #559 <Field boolean mLoadersStarted>
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #562 <Method LoaderManagerImpl FragmentHostCallback.getLoaderManager(String, boolean, boolean)>
	//   18   34:putfield        #400 <Field LoaderManagerImpl mLoaderManager>
		}
		if(mLoaderManager != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//*  21   41:ifnull          51
			mLoaderManager.doDestroy();
	//   22   44:aload_0         
	//   23   45:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//   24   48:invokevirtual   #715 <Method void LoaderManagerImpl.doDestroy()>
	//   25   51:return          
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
	//    2    2:putfield        #677 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onDetach()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #677 <Field boolean mCalled>
	//    3    5:return          
	}

	public LayoutInflater onGetLayoutInflater(Bundle bundle)
	{
		return getLayoutInflater(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #720 <Method LayoutInflater getLayoutInflater(Bundle)>
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
	//    2    2:putfield        #677 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onInflate(Context context, AttributeSet attributeset, Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #677 <Field boolean mCalled>
		if(mHost == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #341 <Field FragmentHostCallback mHost>
	//*   5    9:ifnonnull       31
			context = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		else
	//*   8   14:aload_1         
	//*   9   15:ifnull          30
	//*  10   18:aload_0         
	//*  11   19:iconst_0        
	//*  12   20:putfield        #677 <Field boolean mCalled>
	//*  13   23:aload_0         
	//*  14   24:aload_1         
	//*  15   25:aload_2         
	//*  16   26:aload_3         
	//*  17   27:invokevirtual   #726 <Method void onInflate(Activity, AttributeSet, Bundle)>
	//*  18   30:return          
			context = ((Context) (mHost.getActivity()));
	//   19   31:aload_0         
	//   20   32:getfield        #341 <Field FragmentHostCallback mHost>
	//   21   35:invokevirtual   #438 <Method Activity FragmentHostCallback.getActivity()>
	//   22   38:astore_1        
		if(context != null)
		{
			mCalled = false;
			onInflate(((Activity) (context)), attributeset, bundle);
		}
	//*  23   39:goto            14
	}

	public void onLowMemory()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #677 <Field boolean mCalled>
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
	//    2    2:putfield        #677 <Field boolean mCalled>
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
	//    2    2:putfield        #677 <Field boolean mCalled>
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
	//    2    2:putfield        #677 <Field boolean mCalled>
		if(!mLoadersStarted)
	//*   3    5:aload_0         
	//*   4    6:getfield        #559 <Field boolean mLoadersStarted>
	//*   5    9:ifne            49
		{
			mLoadersStarted = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #559 <Field boolean mLoadersStarted>
			if(!mCheckedForLoaderManager)
	//*   9   17:aload_0         
	//*  10   18:getfield        #557 <Field boolean mCheckedForLoaderManager>
	//*  11   21:ifne            50
			{
				mCheckedForLoaderManager = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #557 <Field boolean mCheckedForLoaderManager>
				mLoaderManager = mHost.getLoaderManager(mWho, mLoadersStarted, false);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #341 <Field FragmentHostCallback mHost>
	//   18   34:aload_0         
	//   19   35:getfield        #281 <Field String mWho>
	//   20   38:aload_0         
	//   21   39:getfield        #559 <Field boolean mLoadersStarted>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #562 <Method LoaderManagerImpl FragmentHostCallback.getLoaderManager(String, boolean, boolean)>
	//   24   46:putfield        #400 <Field LoaderManagerImpl mLoaderManager>
			} else
	//*  25   49:return          
			if(mLoaderManager != null)
	//*  26   50:aload_0         
	//*  27   51:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//*  28   54:ifnull          49
			{
				mLoaderManager.doStart();
	//   29   57:aload_0         
	//   30   58:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//   31   61:invokevirtual   #743 <Method void LoaderManagerImpl.doStart()>
				return;
	//   32   64:return          
			}
		}
	}

	public void onStop()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #677 <Field boolean mCalled>
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
	//    2    2:putfield        #677 <Field boolean mCalled>
	//    3    5:return          
	}

	FragmentManager peekChildFragmentManager()
	{
		return ((FragmentManager) (mChildFragmentManager));
	//    0    0:aload_0         
	//    1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:areturn         
	}

	void performActivityCreated(Bundle bundle)
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #673 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mState = 2;
	//    6   14:aload_0         
	//    7   15:iconst_2        
	//    8   16:putfield        #119 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #677 <Field boolean mCalled>
		onActivityCreated(bundle);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #751 <Method void onActivityCreated(Bundle)>
		if(!mCalled)
	//*  15   29:aload_0         
	//*  16   30:getfield        #677 <Field boolean mCalled>
	//*  17   33:ifne            70
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onActivityCreated()").toString());
	//   18   36:new             #753 <Class SuperNotCalledException>
	//   19   39:dup             
	//   20   40:new             #212 <Class StringBuilder>
	//   21   43:dup             
	//   22   44:invokespecial   #213 <Method void StringBuilder()>
	//   23   47:ldc2            #553 <String "Fragment ">
	//   24   50:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:aload_0         
	//   26   54:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   27   57:ldc2            #755 <String " did not call through to super.onActivityCreated()">
	//   28   60:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   30   66:invokespecial   #756 <Method void SuperNotCalledException(String)>
	//   31   69:athrow          
		if(mChildFragmentManager != null)
	//*  32   70:aload_0         
	//*  33   71:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*  34   74:ifnull          84
			mChildFragmentManager.dispatchActivityCreated();
	//   35   77:aload_0         
	//   36   78:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   37   81:invokevirtual   #480 <Method void FragmentManagerImpl.dispatchActivityCreated()>
	//   38   84:return          
	}

	void performConfigurationChanged(Configuration configuration)
	{
		onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #759 <Method void onConfigurationChanged(Configuration)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          20
			mChildFragmentManager.dispatchConfigurationChanged(configuration);
	//    6   12:aload_0         
	//    7   13:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #762 <Method void FragmentManagerImpl.dispatchConfigurationChanged(Configuration)>
	//   10   20:return          
	}

	boolean performContextItemSelected(MenuItem menuitem)
	{
		while(!mHidden && (onContextItemSelected(menuitem) || mChildFragmentManager != null && mChildFragmentManager.dispatchContextItemSelected(menuitem))) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #312 <Field boolean mHidden>
	//*   2    4:ifne            35
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #765 <Method boolean onContextItemSelected(MenuItem)>
	//*   6   12:ifeq            17
			return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:aload_0         
	//   10   18:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   11   21:ifnull          35
	//   12   24:aload_0         
	//   13   25:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #768 <Method boolean FragmentManagerImpl.dispatchContextItemSelected(MenuItem)>
	//   16   32:ifne            15
		return false;
	//   17   35:iconst_0        
	//   18   36:ireturn         
	}

	void performCreate(Bundle bundle)
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #673 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mState = 1;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #119 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #677 <Field boolean mCalled>
		onCreate(bundle);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #771 <Method void onCreate(Bundle)>
		mIsCreated = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #773 <Field boolean mIsCreated>
		if(!mCalled)
	//*  18   34:aload_0         
	//*  19   35:getfield        #677 <Field boolean mCalled>
	//*  20   38:ifne            75
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onCreate()").toString());
	//   21   41:new             #753 <Class SuperNotCalledException>
	//   22   44:dup             
	//   23   45:new             #212 <Class StringBuilder>
	//   24   48:dup             
	//   25   49:invokespecial   #213 <Method void StringBuilder()>
	//   26   52:ldc2            #553 <String "Fragment ">
	//   27   55:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:aload_0         
	//   29   59:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   30   62:ldc2            #775 <String " did not call through to super.onCreate()">
	//   31   65:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   32   68:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   33   71:invokespecial   #756 <Method void SuperNotCalledException(String)>
	//   34   74:athrow          
		else
			return;
	//   35   75:return          
	}

	boolean performCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          5
		if(!mHidden)
	//*   4    6:aload_0         
	//*   5    7:getfield        #312 <Field boolean mHidden>
	//*   6   10:ifne            64
		{
			boolean flag = flag2;
	//    7   13:iload           5
	//    8   15:istore_3        
			if(mHasMenu)
	//*   9   16:aload_0         
	//*  10   17:getfield        #322 <Field boolean mHasMenu>
	//*  11   20:ifeq            41
			{
				flag = flag2;
	//   12   23:iload           5
	//   13   25:istore_3        
				if(mMenuVisible)
	//*  14   26:aload_0         
	//*  15   27:getfield        #125 <Field boolean mMenuVisible>
	//*  16   30:ifeq            41
				{
					flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_3        
					onCreateOptionsMenu(menu, menuinflater);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #779 <Method void onCreateOptionsMenu(Menu, MenuInflater)>
				}
			}
			flag1 = flag;
	//   23   41:iload_3         
	//   24   42:istore          4
			if(mChildFragmentManager != null)
	//*  25   44:aload_0         
	//*  26   45:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*  27   48:ifnull          64
				flag1 = flag | mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuinflater);
	//   28   51:iload_3         
	//   29   52:aload_0         
	//   30   53:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   31   56:aload_1         
	//   32   57:aload_2         
	//   33   58:invokevirtual   #782 <Method boolean FragmentManagerImpl.dispatchCreateOptionsMenu(Menu, MenuInflater)>
	//   34   61:ior             
	//   35   62:istore          4
		}
		return flag1;
	//   36   64:iload           4
	//   37   66:ireturn         
	}

	View performCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #673 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mPerformedCreateView = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #785 <Field boolean mPerformedCreateView>
		return onCreateView(layoutinflater, viewgroup, bundle);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #787 <Method View onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//   14   26:areturn         
	}

	void performDestroy()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchDestroy();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #791 <Method void FragmentManagerImpl.dispatchDestroy()>
		mState = 0;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #119 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #677 <Field boolean mCalled>
		mIsCreated = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #773 <Field boolean mIsCreated>
		onDestroy();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #793 <Method void onDestroy()>
		if(!mCalled)
	//*  17   33:aload_0         
	//*  18   34:getfield        #677 <Field boolean mCalled>
	//*  19   37:ifne            74
		{
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onDestroy()").toString());
	//   20   40:new             #753 <Class SuperNotCalledException>
	//   21   43:dup             
	//   22   44:new             #212 <Class StringBuilder>
	//   23   47:dup             
	//   24   48:invokespecial   #213 <Method void StringBuilder()>
	//   25   51:ldc2            #553 <String "Fragment ">
	//   26   54:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:aload_0         
	//   28   58:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   29   61:ldc2            #795 <String " did not call through to super.onDestroy()">
	//   30   64:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   31   67:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   32   70:invokespecial   #756 <Method void SuperNotCalledException(String)>
	//   33   73:athrow          
		} else
		{
			mChildFragmentManager = null;
	//   34   74:aload_0         
	//   35   75:aconst_null     
	//   36   76:putfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
			return;
	//   37   79:return          
		}
	}

	void performDestroyView()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchDestroyView();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #799 <Method void FragmentManagerImpl.dispatchDestroyView()>
		mState = 1;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #119 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #677 <Field boolean mCalled>
		onDestroyView();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #801 <Method void onDestroyView()>
		if(!mCalled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #677 <Field boolean mCalled>
	//*  16   32:ifne            69
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onDestroyView()").toString());
	//   17   35:new             #753 <Class SuperNotCalledException>
	//   18   38:dup             
	//   19   39:new             #212 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #213 <Method void StringBuilder()>
	//   22   46:ldc2            #553 <String "Fragment ">
	//   23   49:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_0         
	//   25   53:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:ldc2            #803 <String " did not call through to super.onDestroyView()">
	//   27   59:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   29   65:invokespecial   #756 <Method void SuperNotCalledException(String)>
	//   30   68:athrow          
		if(mLoaderManager != null)
	//*  31   69:aload_0         
	//*  32   70:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//*  33   73:ifnull          83
			mLoaderManager.doReportNextStart();
	//   34   76:aload_0         
	//   35   77:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//   36   80:invokevirtual   #806 <Method void LoaderManagerImpl.doReportNextStart()>
		mPerformedCreateView = false;
	//   37   83:aload_0         
	//   38   84:iconst_0        
	//   39   85:putfield        #785 <Field boolean mPerformedCreateView>
	//   40   88:return          
	}

	void performDetach()
	{
		mCalled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #677 <Field boolean mCalled>
		onDetach();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #809 <Method void onDetach()>
		mLayoutInflater = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #517 <Field LayoutInflater mLayoutInflater>
		if(!mCalled)
	//*   8   14:aload_0         
	//*   9   15:getfield        #677 <Field boolean mCalled>
	//*  10   18:ifne            55
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onDetach()").toString());
	//   11   21:new             #753 <Class SuperNotCalledException>
	//   12   24:dup             
	//   13   25:new             #212 <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #213 <Method void StringBuilder()>
	//   16   32:ldc2            #553 <String "Fragment ">
	//   17   35:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   18   38:aload_0         
	//   19   39:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   20   42:ldc2            #811 <String " did not call through to super.onDetach()">
	//   21   45:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   23   51:invokespecial   #756 <Method void SuperNotCalledException(String)>
	//   24   54:athrow          
		if(mChildFragmentManager != null)
	//*  25   55:aload_0         
	//*  26   56:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*  27   59:ifnull          121
		{
			if(!mRetaining)
	//*  28   62:aload_0         
	//*  29   63:getfield        #330 <Field boolean mRetaining>
	//*  30   66:ifne            109
				throw new IllegalStateException((new StringBuilder()).append("Child FragmentManager of ").append(((Object) (this))).append(" was not ").append(" destroyed and this fragment is not retaining instance").toString());
	//   31   69:new             #528 <Class IllegalStateException>
	//   32   72:dup             
	//   33   73:new             #212 <Class StringBuilder>
	//   34   76:dup             
	//   35   77:invokespecial   #213 <Method void StringBuilder()>
	//   36   80:ldc2            #813 <String "Child FragmentManager of ">
	//   37   83:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   38   86:aload_0         
	//   39   87:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   40   90:ldc2            #815 <String " was not ">
	//   41   93:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   42   96:ldc2            #817 <String " destroyed and this fragment is not retaining instance">
	//   43   99:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   44  102:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   45  105:invokespecial   #532 <Method void IllegalStateException(String)>
	//   46  108:athrow          
			mChildFragmentManager.dispatchDestroy();
	//   47  109:aload_0         
	//   48  110:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   49  113:invokevirtual   #791 <Method void FragmentManagerImpl.dispatchDestroy()>
			mChildFragmentManager = null;
	//   50  116:aload_0         
	//   51  117:aconst_null     
	//   52  118:putfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
		}
	//   53  121:return          
	}

	LayoutInflater performGetLayoutInflater(Bundle bundle)
	{
		mLayoutInflater = onGetLayoutInflater(bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #819 <Method LayoutInflater onGetLayoutInflater(Bundle)>
	//    4    6:putfield        #517 <Field LayoutInflater mLayoutInflater>
		return mLayoutInflater;
	//    5    9:aload_0         
	//    6   10:getfield        #517 <Field LayoutInflater mLayoutInflater>
	//    7   13:areturn         
	}

	void performLowMemory()
	{
		onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #822 <Method void onLowMemory()>
		if(mChildFragmentManager != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   4    8:ifnull          18
			mChildFragmentManager.dispatchLowMemory();
	//    5   11:aload_0         
	//    6   12:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    7   15:invokevirtual   #825 <Method void FragmentManagerImpl.dispatchLowMemory()>
	//    8   18:return          
	}

	void performMultiWindowModeChanged(boolean flag)
	{
		onMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #828 <Method void onMultiWindowModeChanged(boolean)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          20
			mChildFragmentManager.dispatchMultiWindowModeChanged(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #831 <Method void FragmentManagerImpl.dispatchMultiWindowModeChanged(boolean)>
	//   10   20:return          
	}

	boolean performOptionsItemSelected(MenuItem menuitem)
	{
		while(!mHidden && (mHasMenu && mMenuVisible && onOptionsItemSelected(menuitem) || mChildFragmentManager != null && mChildFragmentManager.dispatchOptionsItemSelected(menuitem))) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #312 <Field boolean mHidden>
	//*   2    4:ifne            49
	//*   3    7:aload_0         
	//*   4    8:getfield        #322 <Field boolean mHasMenu>
	//*   5   11:ifeq            31
	//*   6   14:aload_0         
	//*   7   15:getfield        #125 <Field boolean mMenuVisible>
	//*   8   18:ifeq            31
	//*   9   21:aload_0         
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #834 <Method boolean onOptionsItemSelected(MenuItem)>
	//*  12   26:ifeq            31
			return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
	//   15   31:aload_0         
	//   16   32:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   17   35:ifnull          49
	//   18   38:aload_0         
	//   19   39:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #837 <Method boolean FragmentManagerImpl.dispatchOptionsItemSelected(MenuItem)>
	//   22   46:ifne            29
		return false;
	//   23   49:iconst_0        
	//   24   50:ireturn         
	}

	void performOptionsMenuClosed(Menu menu)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #312 <Field boolean mHidden>
	//*   2    4:ifne            41
		{
			if(mHasMenu && mMenuVisible)
	//*   3    7:aload_0         
	//*   4    8:getfield        #322 <Field boolean mHasMenu>
	//*   5   11:ifeq            26
	//*   6   14:aload_0         
	//*   7   15:getfield        #125 <Field boolean mMenuVisible>
	//*   8   18:ifeq            26
				onOptionsMenuClosed(menu);
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokevirtual   #840 <Method void onOptionsMenuClosed(Menu)>
			if(mChildFragmentManager != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*  14   30:ifnull          41
				mChildFragmentManager.dispatchOptionsMenuClosed(menu);
	//   15   33:aload_0         
	//   16   34:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #843 <Method void FragmentManagerImpl.dispatchOptionsMenuClosed(Menu)>
		}
	//   19   41:return          
	}

	void performPause()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchPause();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #847 <Method void FragmentManagerImpl.dispatchPause()>
		mState = 4;
	//    6   14:aload_0         
	//    7   15:iconst_4        
	//    8   16:putfield        #119 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #677 <Field boolean mCalled>
		onPause();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #849 <Method void onPause()>
		if(!mCalled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #677 <Field boolean mCalled>
	//*  16   32:ifne            69
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onPause()").toString());
	//   17   35:new             #753 <Class SuperNotCalledException>
	//   18   38:dup             
	//   19   39:new             #212 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #213 <Method void StringBuilder()>
	//   22   46:ldc2            #553 <String "Fragment ">
	//   23   49:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_0         
	//   25   53:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:ldc2            #851 <String " did not call through to super.onPause()">
	//   27   59:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   29   65:invokespecial   #756 <Method void SuperNotCalledException(String)>
	//   30   68:athrow          
		else
			return;
	//   31   69:return          
	}

	void performPictureInPictureModeChanged(boolean flag)
	{
		onPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #854 <Method void onPictureInPictureModeChanged(boolean)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          20
			mChildFragmentManager.dispatchPictureInPictureModeChanged(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #857 <Method void FragmentManagerImpl.dispatchPictureInPictureModeChanged(boolean)>
	//   10   20:return          
	}

	boolean performPrepareOptionsMenu(Menu menu)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag2 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		if(!mHidden)
	//*   4    5:aload_0         
	//*   5    6:getfield        #312 <Field boolean mHidden>
	//*   6    9:ifne            59
		{
			boolean flag = flag2;
	//    7   12:iload           4
	//    8   14:istore_2        
			if(mHasMenu)
	//*   9   15:aload_0         
	//*  10   16:getfield        #322 <Field boolean mHasMenu>
	//*  11   19:ifeq            39
			{
				flag = flag2;
	//   12   22:iload           4
	//   13   24:istore_2        
				if(mMenuVisible)
	//*  14   25:aload_0         
	//*  15   26:getfield        #125 <Field boolean mMenuVisible>
	//*  16   29:ifeq            39
				{
					flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_2        
					onPrepareOptionsMenu(menu);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:invokevirtual   #861 <Method void onPrepareOptionsMenu(Menu)>
				}
			}
			flag1 = flag;
	//   22   39:iload_2         
	//   23   40:istore_3        
			if(mChildFragmentManager != null)
	//*  24   41:aload_0         
	//*  25   42:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*  26   45:ifnull          59
				flag1 = flag | mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
	//   27   48:iload_2         
	//   28   49:aload_0         
	//   29   50:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   30   53:aload_1         
	//   31   54:invokevirtual   #864 <Method boolean FragmentManagerImpl.dispatchPrepareOptionsMenu(Menu)>
	//   32   57:ior             
	//   33   58:istore_3        
		}
		return flag1;
	//   34   59:iload_3         
	//   35   60:ireturn         
	}

	void performReallyStop()
	{
label0:
		{
			if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
				mChildFragmentManager.dispatchReallyStop();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #868 <Method void FragmentManagerImpl.dispatchReallyStop()>
			mState = 2;
	//    6   14:aload_0         
	//    7   15:iconst_2        
	//    8   16:putfield        #119 <Field int mState>
			if(mLoadersStarted)
	//*   9   19:aload_0         
	//*  10   20:getfield        #559 <Field boolean mLoadersStarted>
	//*  11   23:ifeq            87
			{
				mLoadersStarted = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #559 <Field boolean mLoadersStarted>
				if(!mCheckedForLoaderManager)
	//*  15   31:aload_0         
	//*  16   32:getfield        #557 <Field boolean mCheckedForLoaderManager>
	//*  17   35:ifne            63
				{
					mCheckedForLoaderManager = true;
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:putfield        #557 <Field boolean mCheckedForLoaderManager>
					mLoaderManager = mHost.getLoaderManager(mWho, mLoadersStarted, false);
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #341 <Field FragmentHostCallback mHost>
	//   24   48:aload_0         
	//   25   49:getfield        #281 <Field String mWho>
	//   26   52:aload_0         
	//   27   53:getfield        #559 <Field boolean mLoadersStarted>
	//   28   56:iconst_0        
	//   29   57:invokevirtual   #562 <Method LoaderManagerImpl FragmentHostCallback.getLoaderManager(String, boolean, boolean)>
	//   30   60:putfield        #400 <Field LoaderManagerImpl mLoaderManager>
				}
				if(mLoaderManager != null)
	//*  31   63:aload_0         
	//*  32   64:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//*  33   67:ifnull          87
				{
					if(!mHost.getRetainLoaders())
						break label0;
	//   34   70:aload_0         
	//   35   71:getfield        #341 <Field FragmentHostCallback mHost>
	//   36   74:invokevirtual   #871 <Method boolean FragmentHostCallback.getRetainLoaders()>
	//   37   77:ifeq            88
					mLoaderManager.doRetain();
	//   38   80:aload_0         
	//   39   81:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//   40   84:invokevirtual   #874 <Method void LoaderManagerImpl.doRetain()>
				}
			}
			return;
	//   41   87:return          
		}
		mLoaderManager.doStop();
	//   42   88:aload_0         
	//   43   89:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//   44   92:invokevirtual   #877 <Method void LoaderManagerImpl.doStop()>
	//   45   95:return          
	}

	void performResume()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          22
		{
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #673 <Method void FragmentManagerImpl.noteStateNotSaved()>
			mChildFragmentManager.execPendingActions();
	//    6   14:aload_0         
	//    7   15:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   18:invokevirtual   #881 <Method boolean FragmentManagerImpl.execPendingActions()>
	//    9   21:pop             
		}
		mState = 5;
	//   10   22:aload_0         
	//   11   23:iconst_5        
	//   12   24:putfield        #119 <Field int mState>
		mCalled = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #677 <Field boolean mCalled>
		onResume();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #883 <Method void onResume()>
		if(!mCalled)
	//*  18   36:aload_0         
	//*  19   37:getfield        #677 <Field boolean mCalled>
	//*  20   40:ifne            77
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onResume()").toString());
	//   21   43:new             #753 <Class SuperNotCalledException>
	//   22   46:dup             
	//   23   47:new             #212 <Class StringBuilder>
	//   24   50:dup             
	//   25   51:invokespecial   #213 <Method void StringBuilder()>
	//   26   54:ldc2            #553 <String "Fragment ">
	//   27   57:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:aload_0         
	//   29   61:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   30   64:ldc2            #885 <String " did not call through to super.onResume()">
	//   31   67:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   33   73:invokespecial   #756 <Method void SuperNotCalledException(String)>
	//   34   76:athrow          
		if(mChildFragmentManager != null)
	//*  35   77:aload_0         
	//*  36   78:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*  37   81:ifnull          99
		{
			mChildFragmentManager.dispatchResume();
	//   38   84:aload_0         
	//   39   85:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   40   88:invokevirtual   #474 <Method void FragmentManagerImpl.dispatchResume()>
			mChildFragmentManager.execPendingActions();
	//   41   91:aload_0         
	//   42   92:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   43   95:invokevirtual   #881 <Method boolean FragmentManagerImpl.execPendingActions()>
	//   44   98:pop             
		}
	//   45   99:return          
	}

	void performSaveInstanceState(Bundle bundle)
	{
		onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #888 <Method void onSaveInstanceState(Bundle)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          32
		{
			Parcelable parcelable = mChildFragmentManager.saveAllState();
	//    6   12:aload_0         
	//    7   13:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:invokevirtual   #892 <Method Parcelable FragmentManagerImpl.saveAllState()>
	//    9   19:astore_2        
			if(parcelable != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          32
				bundle.putParcelable("android:support:fragments", parcelable);
	//   12   24:aload_1         
	//   13   25:ldc2            #894 <String "android:support:fragments">
	//   14   28:aload_2         
	//   15   29:invokevirtual   #898 <Method void Bundle.putParcelable(String, Parcelable)>
		}
	//   16   32:return          
	}

	void performStart()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          22
		{
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #673 <Method void FragmentManagerImpl.noteStateNotSaved()>
			mChildFragmentManager.execPendingActions();
	//    6   14:aload_0         
	//    7   15:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   18:invokevirtual   #881 <Method boolean FragmentManagerImpl.execPendingActions()>
	//    9   21:pop             
		}
		mState = 4;
	//   10   22:aload_0         
	//   11   23:iconst_4        
	//   12   24:putfield        #119 <Field int mState>
		mCalled = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #677 <Field boolean mCalled>
		onStart();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #901 <Method void onStart()>
		if(!mCalled)
	//*  18   36:aload_0         
	//*  19   37:getfield        #677 <Field boolean mCalled>
	//*  20   40:ifne            77
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onStart()").toString());
	//   21   43:new             #753 <Class SuperNotCalledException>
	//   22   46:dup             
	//   23   47:new             #212 <Class StringBuilder>
	//   24   50:dup             
	//   25   51:invokespecial   #213 <Method void StringBuilder()>
	//   26   54:ldc2            #553 <String "Fragment ">
	//   27   57:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:aload_0         
	//   29   61:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   30   64:ldc2            #903 <String " did not call through to super.onStart()">
	//   31   67:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   33   73:invokespecial   #756 <Method void SuperNotCalledException(String)>
	//   34   76:athrow          
		if(mChildFragmentManager != null)
	//*  35   77:aload_0         
	//*  36   78:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*  37   81:ifnull          91
			mChildFragmentManager.dispatchStart();
	//   38   84:aload_0         
	//   39   85:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   40   88:invokevirtual   #477 <Method void FragmentManagerImpl.dispatchStart()>
		if(mLoaderManager != null)
	//*  41   91:aload_0         
	//*  42   92:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//*  43   95:ifnull          105
			mLoaderManager.doReportStart();
	//   44   98:aload_0         
	//   45   99:getfield        #400 <Field LoaderManagerImpl mLoaderManager>
	//   46  102:invokevirtual   #906 <Method void LoaderManagerImpl.doReportStart()>
	//   47  105:return          
	}

	void performStop()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchStop();
	//    3    7:aload_0         
	//    4    8:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #910 <Method void FragmentManagerImpl.dispatchStop()>
		mState = 3;
	//    6   14:aload_0         
	//    7   15:iconst_3        
	//    8   16:putfield        #119 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #677 <Field boolean mCalled>
		onStop();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #912 <Method void onStop()>
		if(!mCalled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #677 <Field boolean mCalled>
	//*  16   32:ifne            69
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onStop()").toString());
	//   17   35:new             #753 <Class SuperNotCalledException>
	//   18   38:dup             
	//   19   39:new             #212 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #213 <Method void StringBuilder()>
	//   22   46:ldc2            #553 <String "Fragment ">
	//   23   49:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_0         
	//   25   53:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:ldc2            #914 <String " did not call through to super.onStop()">
	//   27   59:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   29   65:invokespecial   #756 <Method void SuperNotCalledException(String)>
	//   30   68:athrow          
		else
			return;
	//   31   69:return          
	}

	public void postponeEnterTransition()
	{
		ensureAnimationInfo().mEnterTransitionPostponed = true;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iconst_1        
	//    3    5:putfield        #140 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//    4    8:return          
	}

	public void registerForContextMenu(View view)
	{
		view.setOnCreateContextMenuListener(((android.view.View.OnCreateContextMenuListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #923 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
	//    3    5:return          
	}

	public final void requestPermissions(String as[], int i)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       41
		{
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    3    7:new             #528 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #212 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #213 <Method void StringBuilder()>
	//    8   18:ldc2            #553 <String "Fragment ">
	//    9   21:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #555 <String " not attached to Activity">
	//   13   31:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #532 <Method void IllegalStateException(String)>
	//   16   40:athrow          
		} else
		{
			mHost.onRequestPermissionsFromFragment(this, as, i);
	//   17   41:aload_0         
	//   18   42:getfield        #341 <Field FragmentHostCallback mHost>
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:iload_2         
	//   22   48:invokevirtual   #929 <Method void FragmentHostCallback.onRequestPermissionsFromFragment(Fragment, String[], int)>
			return;
	//   23   51:return          
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
	//    3    5:ldc2            #894 <String "android:support:fragments">
	//    4    8:invokevirtual   #933 <Method Parcelable Bundle.getParcelable(String)>
	//    5   11:astore_1        
			if(bundle != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          51
			{
				if(mChildFragmentManager == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//*  10   20:ifnonnull       27
					instantiateChildFragmentManager();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #471 <Method void instantiateChildFragmentManager()>
				mChildFragmentManager.restoreAllState(((Parcelable) (bundle)), mChildNonConfig);
	//   13   27:aload_0         
	//   14   28:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #935 <Field FragmentManagerNonConfig mChildNonConfig>
	//   18   36:invokevirtual   #939 <Method void FragmentManagerImpl.restoreAllState(Parcelable, FragmentManagerNonConfig)>
				mChildNonConfig = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #935 <Field FragmentManagerNonConfig mChildNonConfig>
				mChildFragmentManager.dispatchCreate();
	//   22   44:aload_0         
	//   23   45:getfield        #410 <Field FragmentManagerImpl mChildFragmentManager>
	//   24   48:invokevirtual   #483 <Method void FragmentManagerImpl.dispatchCreate()>
			}
		}
	//   25   51:return          
	}

	final void restoreViewState(Bundle bundle)
	{
		if(mSavedViewState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #357 <Field SparseArray mSavedViewState>
	//*   2    4:ifnull          23
		{
			mInnerView.restoreHierarchyState(mSavedViewState);
	//    3    7:aload_0         
	//    4    8:getfield        #385 <Field View mInnerView>
	//    5   11:aload_0         
	//    6   12:getfield        #357 <Field SparseArray mSavedViewState>
	//    7   15:invokevirtual   #944 <Method void View.restoreHierarchyState(SparseArray)>
			mSavedViewState = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #357 <Field SparseArray mSavedViewState>
		}
		mCalled = false;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #677 <Field boolean mCalled>
		onViewStateRestored(bundle);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #946 <Method void onViewStateRestored(Bundle)>
		if(!mCalled)
	//*  17   33:aload_0         
	//*  18   34:getfield        #677 <Field boolean mCalled>
	//*  19   37:ifne            74
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onViewStateRestored()").toString());
	//   20   40:new             #753 <Class SuperNotCalledException>
	//   21   43:dup             
	//   22   44:new             #212 <Class StringBuilder>
	//   23   47:dup             
	//   24   48:invokespecial   #213 <Method void StringBuilder()>
	//   25   51:ldc2            #553 <String "Fragment ">
	//   26   54:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:aload_0         
	//   28   58:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   29   61:ldc2            #948 <String " did not call through to super.onViewStateRestored()">
	//   30   64:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   31   67:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   32   70:invokespecial   #756 <Method void SuperNotCalledException(String)>
	//   33   73:athrow          
		else
			return;
	//   34   74:return          
	}

	public void setAllowEnterTransitionOverlap(boolean flag)
	{
		ensureAnimationInfo().mAllowEnterTransitionOverlap = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #953 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #957 <Method Boolean Fragment$AnimationInfo.access$602(Fragment$AnimationInfo, Boolean)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void setAllowReturnTransitionOverlap(boolean flag)
	{
		ensureAnimationInfo().mAllowReturnTransitionOverlap = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #953 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #961 <Method Boolean Fragment$AnimationInfo.access$702(Fragment$AnimationInfo, Boolean)>
	//    5   11:pop             
	//    6   12:return          
	}

	void setAnimatingAway(View view)
	{
		ensureAnimationInfo().mAnimatingAway = view;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #458 <Field View Fragment$AnimationInfo.mAnimatingAway>
	//    4    8:return          
	}

	void setAnimator(Animator animator)
	{
		ensureAnimationInfo().mAnimator = animator;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #464 <Field Animator Fragment$AnimationInfo.mAnimator>
	//    4    8:return          
	}

	public void setArguments(Bundle bundle)
	{
		if(mIndex >= 0 && isStateSaved())
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field int mIndex>
	//*   2    4:iflt            25
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #965 <Method boolean isStateSaved()>
	//*   5   11:ifeq            25
		{
			throw new IllegalStateException("Fragment already active and state has been saved");
	//    6   14:new             #528 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #967 <String "Fragment already active and state has been saved">
	//    9   21:invokespecial   #532 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			mArguments = bundle;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #349 <Field Bundle mArguments>
			return;
	//   14   30:return          
		}
	}

	public void setEnterSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ensureAnimationInfo().mEnterTransitionCallback = sharedelementcallback;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #499 <Field SharedElementCallback Fragment$AnimationInfo.mEnterTransitionCallback>
	//    4    8:return          
	}

	public void setEnterTransition(Object obj)
	{
		ensureAnimationInfo().mEnterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #974 <Method Object Fragment$AnimationInfo.access$002(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setExitSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ensureAnimationInfo().mExitTransitionCallback = sharedelementcallback;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #507 <Field SharedElementCallback Fragment$AnimationInfo.mExitTransitionCallback>
	//    4    8:return          
	}

	public void setExitTransition(Object obj)
	{
		ensureAnimationInfo().mExitTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #979 <Method Object Fragment$AnimationInfo.access$202(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setHasOptionsMenu(boolean flag)
	{
		if(mHasMenu != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field boolean mHasMenu>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          34
		{
			mHasMenu = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #322 <Field boolean mHasMenu>
			if(isAdded() && !isHidden())
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #659 <Method boolean isAdded()>
	//*   9   17:ifeq            34
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #661 <Method boolean isHidden()>
	//*  12   24:ifne            34
				mHost.onSupportInvalidateOptionsMenu();
	//   13   27:aload_0         
	//   14   28:getfield        #341 <Field FragmentHostCallback mHost>
	//   15   31:invokevirtual   #983 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
		}
	//   16   34:return          
	}

	void setHideReplaced(boolean flag)
	{
		ensureAnimationInfo().mIsHideReplaced = flag;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:putfield        #647 <Field boolean Fragment$AnimationInfo.mIsHideReplaced>
	//    4    8:return          
	}

	final void setIndex(int i, Fragment fragment)
	{
		mIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #121 <Field int mIndex>
		if(fragment != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          44
		{
			mWho = (new StringBuilder()).append(fragment.mWho).append(":").append(mIndex).toString();
	//    5    9:aload_0         
	//    6   10:new             #212 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #213 <Method void StringBuilder()>
	//    9   17:aload_2         
	//   10   18:getfield        #281 <Field String mWho>
	//   11   21:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:ldc2            #417 <String ":">
	//   13   27:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:aload_0         
	//   15   31:getfield        #121 <Field int mIndex>
	//   16   34:invokevirtual   #989 <Method StringBuilder StringBuilder.append(int)>
	//   17   37:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   18   40:putfield        #281 <Field String mWho>
			return;
	//   19   43:return          
		} else
		{
			mWho = (new StringBuilder()).append("android:fragment:").append(mIndex).toString();
	//   20   44:aload_0         
	//   21   45:new             #212 <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #213 <Method void StringBuilder()>
	//   24   52:ldc2            #991 <String "android:fragment:">
	//   25   55:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   26   58:aload_0         
	//   27   59:getfield        #121 <Field int mIndex>
	//   28   62:invokevirtual   #989 <Method StringBuilder StringBuilder.append(int)>
	//   29   65:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   30   68:putfield        #281 <Field String mWho>
			return;
	//   31   71:return          
		}
	}

	public void setInitialSavedState(SavedState savedstate)
	{
		if(mIndex >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field int mIndex>
	//*   2    4:iflt            18
			throw new IllegalStateException("Fragment already active");
	//    3    7:new             #528 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #995 <String "Fragment already active">
	//    6   14:invokespecial   #532 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(savedstate != null && savedstate.mState != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          40
	//*  10   22:aload_1         
	//*  11   23:getfield        #997 <Field Bundle Fragment$SavedState.mState>
	//*  12   26:ifnull          40
			savedstate = ((SavedState) (savedstate.mState));
	//   13   29:aload_1         
	//   14   30:getfield        #997 <Field Bundle Fragment$SavedState.mState>
	//   15   33:astore_1        
		else
	//*  16   34:aload_0         
	//*  17   35:aload_1         
	//*  18   36:putfield        #353 <Field Bundle mSavedFragmentState>
	//*  19   39:return          
			savedstate = null;
	//   20   40:aconst_null     
	//   21   41:astore_1        
		mSavedFragmentState = ((Bundle) (savedstate));
	//*  22   42:goto            34
	}

	public void setMenuVisibility(boolean flag)
	{
		if(mMenuVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean mMenuVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          41
		{
			mMenuVisible = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #125 <Field boolean mMenuVisible>
			if(mHasMenu && isAdded() && !isHidden())
	//*   7   13:aload_0         
	//*   8   14:getfield        #322 <Field boolean mHasMenu>
	//*   9   17:ifeq            41
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #659 <Method boolean isAdded()>
	//*  12   24:ifeq            41
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #661 <Method boolean isHidden()>
	//*  15   31:ifne            41
				mHost.onSupportInvalidateOptionsMenu();
	//   16   34:aload_0         
	//   17   35:getfield        #341 <Field FragmentHostCallback mHost>
	//   18   38:invokevirtual   #983 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
		}
	//   19   41:return          
	}

	void setNextAnim(int i)
	{
		if(mAnimationInfo == null && i == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
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
	//    7   13:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    8   16:iload_1         
	//    9   17:putfield        #565 <Field int Fragment$AnimationInfo.mNextAnim>
			return;
	//   10   20:return          
		}
	}

	void setNextTransition(int i, int j)
	{
		if(mAnimationInfo == null && i == 0 && j == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
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
	//    9   17:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//   10   20:pop             
			mAnimationInfo.mNextTransition = i;
	//   11   21:aload_0         
	//   12   22:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   13   25:iload_1         
	//   14   26:putfield        #569 <Field int Fragment$AnimationInfo.mNextTransition>
			mAnimationInfo.mNextTransitionStyle = j;
	//   15   29:aload_0         
	//   16   30:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   17   33:iload_2         
	//   18   34:putfield        #573 <Field int Fragment$AnimationInfo.mNextTransitionStyle>
			return;
	//   19   37:return          
		}
	}

	void setOnStartEnterTransitionListener(OnStartEnterTransitionListener onstartentertransitionlistener)
	{
		ensureAnimationInfo();
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:pop             
		if(onstartentertransitionlistener != mAnimationInfo.mStartEnterTransitionListener)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   6   10:getfield        #144 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//*   7   13:if_acmpne       17
	//*   8   16:return          
		{
			if(onstartentertransitionlistener != null && mAnimationInfo.mStartEnterTransitionListener != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          59
	//*  11   21:aload_0         
	//*  12   22:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*  13   25:getfield        #144 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//*  14   28:ifnull          59
				throw new IllegalStateException((new StringBuilder()).append("Trying to set a replacement startPostponedEnterTransition on ").append(((Object) (this))).toString());
	//   15   31:new             #528 <Class IllegalStateException>
	//   16   34:dup             
	//   17   35:new             #212 <Class StringBuilder>
	//   18   38:dup             
	//   19   39:invokespecial   #213 <Method void StringBuilder()>
	//   20   42:ldc2            #1005 <String "Trying to set a replacement startPostponedEnterTransition on ">
	//   21   45:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:aload_0         
	//   23   49:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   24   52:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   25   55:invokespecial   #532 <Method void IllegalStateException(String)>
	//   26   58:athrow          
			if(mAnimationInfo.mEnterTransitionPostponed)
	//*  27   59:aload_0         
	//*  28   60:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//*  29   63:getfield        #140 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//*  30   66:ifeq            77
				mAnimationInfo.mStartEnterTransitionListener = onstartentertransitionlistener;
	//   31   69:aload_0         
	//   32   70:getfield        #134 <Field Fragment$AnimationInfo mAnimationInfo>
	//   33   73:aload_1         
	//   34   74:putfield        #144 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
			if(onstartentertransitionlistener != null)
	//*  35   77:aload_1         
	//*  36   78:ifnull          16
			{
				onstartentertransitionlistener.startListening();
	//   37   81:aload_1         
	//   38   82:invokeinterface #1008 <Method void Fragment$OnStartEnterTransitionListener.startListening()>
				return;
	//   39   87:return          
			}
		}
	}

	public void setReenterTransition(Object obj)
	{
		ensureAnimationInfo().mReenterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1012 <Method Object Fragment$AnimationInfo.access$302(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setRetainInstance(boolean flag)
	{
		mRetainInstance = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #326 <Field boolean mRetainInstance>
	//    3    5:return          
	}

	public void setReturnTransition(Object obj)
	{
		ensureAnimationInfo().mReturnTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1017 <Method Object Fragment$AnimationInfo.access$102(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setSharedElementEnterTransition(Object obj)
	{
		ensureAnimationInfo().mSharedElementEnterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1021 <Method Object Fragment$AnimationInfo.access$402(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setSharedElementReturnTransition(Object obj)
	{
		ensureAnimationInfo().mSharedElementReturnTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #1025 <Method Object Fragment$AnimationInfo.access$502(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void setStateAfterAnimating(int i)
	{
		ensureAnimationInfo().mStateAfterAnimating = i;
	//    0    0:aload_0         
	//    1    1:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:putfield        #605 <Field int Fragment$AnimationInfo.mStateAfterAnimating>
	//    4    8:return          
	}

	public void setTargetFragment(Fragment fragment, int i)
	{
		FragmentManager fragmentmanager1 = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1030 <Method FragmentManager getFragmentManager()>
	//    2    4:astore          4
		FragmentManager fragmentmanager;
		if(fragment != null)
	//*   3    6:aload_1         
	//*   4    7:ifnull          64
			fragmentmanager = fragment.getFragmentManager();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #1030 <Method FragmentManager getFragmentManager()>
	//    7   14:astore_3        
		else
	//*   8   15:aload           4
	//*   9   17:ifnull          69
	//*  10   20:aload_3         
	//*  11   21:ifnull          69
	//*  12   24:aload           4
	//*  13   26:aload_3         
	//*  14   27:if_acmpeq       69
	//*  15   30:new             #1032 <Class IllegalArgumentException>
	//*  16   33:dup             
	//*  17   34:new             #212 <Class StringBuilder>
	//*  18   37:dup             
	//*  19   38:invokespecial   #213 <Method void StringBuilder()>
	//*  20   41:ldc2            #553 <String "Fragment ">
	//*  21   44:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//*  22   47:aload_1         
	//*  23   48:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//*  24   51:ldc2            #1034 <String " must share the same FragmentManager to be set as a target fragment">
	//*  25   54:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//*  26   57:invokevirtual   #227 <Method String StringBuilder.toString()>
	//*  27   60:invokespecial   #1035 <Method void IllegalArgumentException(String)>
	//*  28   63:athrow          
			fragmentmanager = null;
	//   29   64:aconst_null     
	//   30   65:astore_3        
		if(fragmentmanager1 != null && fragmentmanager != null && fragmentmanager1 != fragmentmanager)
			throw new IllegalArgumentException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" must share the same FragmentManager to be set as a target fragment").toString());
	//*  31   66:goto            15
		for(Fragment fragment1 = fragment; fragment1 != null; fragment1 = fragment1.getTargetFragment())
	//*  32   69:aload_1         
	//*  33   70:astore_3        
	//*  34   71:aload_3         
	//*  35   72:ifnull          132
			if(fragment1 == this)
	//*  36   75:aload_3         
	//*  37   76:aload_0         
	//*  38   77:if_acmpne       124
				throw new IllegalArgumentException((new StringBuilder()).append("Setting ").append(((Object) (fragment))).append(" as the target of ").append(((Object) (this))).append(" would create a target cycle").toString());
	//   39   80:new             #1032 <Class IllegalArgumentException>
	//   40   83:dup             
	//   41   84:new             #212 <Class StringBuilder>
	//   42   87:dup             
	//   43   88:invokespecial   #213 <Method void StringBuilder()>
	//   44   91:ldc2            #1037 <String "Setting ">
	//   45   94:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   46   97:aload_1         
	//   47   98:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   48  101:ldc2            #1039 <String " as the target of ">
	//   49  104:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   50  107:aload_0         
	//   51  108:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   52  111:ldc2            #1041 <String " would create a target cycle">
	//   53  114:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   54  117:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   55  120:invokespecial   #1035 <Method void IllegalArgumentException(String)>
	//   56  123:athrow          

	//   57  124:aload_3         
	//   58  125:invokevirtual   #1043 <Method Fragment getTargetFragment()>
	//   59  128:astore_3        
	//*  60  129:goto            71
		mTarget = fragment;
	//   61  132:aload_0         
	//   62  133:aload_1         
	//   63  134:putfield        #361 <Field Fragment mTarget>
		mTargetRequestCode = i;
	//   64  137:aload_0         
	//   65  138:iload_2         
	//   66  139:putfield        #369 <Field int mTargetRequestCode>
	//   67  142:return          
	}

	public void setUserVisibleHint(boolean flag)
	{
		if(!mUserVisibleHint && flag && mState < 4 && mFragmentManager != null && isAdded())
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field boolean mUserVisibleHint>
	//*   2    4:ifne            41
	//*   3    7:iload_1         
	//*   4    8:ifeq            41
	//*   5   11:aload_0         
	//*   6   12:getfield        #119 <Field int mState>
	//*   7   15:iconst_4        
	//*   8   16:icmpge          41
	//*   9   19:aload_0         
	//*  10   20:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//*  11   23:ifnull          41
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #659 <Method boolean isAdded()>
	//*  14   30:ifeq            41
			mFragmentManager.performPendingDeferredStart(this);
	//   15   33:aload_0         
	//   16   34:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #1047 <Method void FragmentManagerImpl.performPendingDeferredStart(Fragment)>
		mUserVisibleHint = flag;
	//   19   41:aload_0         
	//   20   42:iload_1         
	//   21   43:putfield        #127 <Field boolean mUserVisibleHint>
		if(mState < 4 && !flag)
	//*  22   46:aload_0         
	//*  23   47:getfield        #119 <Field int mState>
	//*  24   50:iconst_4        
	//*  25   51:icmpge          66
	//*  26   54:iload_1         
	//*  27   55:ifne            66
			flag = true;
	//   28   58:iconst_1        
	//   29   59:istore_1        
		else
	//*  30   60:aload_0         
	//*  31   61:iload_1         
	//*  32   62:putfield        #1049 <Field boolean mDeferStart>
	//*  33   65:return          
			flag = false;
	//   34   66:iconst_0        
	//   35   67:istore_1        
		mDeferStart = flag;
	//*  36   68:goto            60
	}

	public boolean shouldShowRequestPermissionRationale(String s)
	{
		if(mHost != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnull          16
			return mHost.onShouldShowRequestPermissionRationale(s);
	//    3    7:aload_0         
	//    4    8:getfield        #341 <Field FragmentHostCallback mHost>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #1054 <Method boolean FragmentHostCallback.onShouldShowRequestPermissionRationale(String)>
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
	//    3    3:invokevirtual   #1059 <Method void startActivity(Intent, Bundle)>
	//    4    6:return          
	}

	public void startActivity(Intent intent, Bundle bundle)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       41
		{
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    3    7:new             #528 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #212 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #213 <Method void StringBuilder()>
	//    8   18:ldc2            #553 <String "Fragment ">
	//    9   21:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #555 <String " not attached to Activity">
	//   13   31:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #532 <Method void IllegalStateException(String)>
	//   16   40:athrow          
		} else
		{
			mHost.onStartActivityFromFragment(this, intent, -1, bundle);
	//   17   41:aload_0         
	//   18   42:getfield        #341 <Field FragmentHostCallback mHost>
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:iconst_m1       
	//   22   48:aload_2         
	//   23   49:invokevirtual   #1063 <Method void FragmentHostCallback.onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
			return;
	//   24   52:return          
		}
	}

	public void startActivityForResult(Intent intent, int i)
	{
		startActivityForResult(intent, i, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #1068 <Method void startActivityForResult(Intent, int, Bundle)>
	//    5    7:return          
	}

	public void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       41
		{
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    3    7:new             #528 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #212 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #213 <Method void StringBuilder()>
	//    8   18:ldc2            #553 <String "Fragment ">
	//    9   21:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #555 <String " not attached to Activity">
	//   13   31:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #532 <Method void IllegalStateException(String)>
	//   16   40:athrow          
		} else
		{
			mHost.onStartActivityFromFragment(this, intent, i, bundle);
	//   17   41:aload_0         
	//   18   42:getfield        #341 <Field FragmentHostCallback mHost>
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:iload_2         
	//   22   48:aload_3         
	//   23   49:invokevirtual   #1063 <Method void FragmentHostCallback.onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
			return;
	//   24   52:return          
		}
	}

	public void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #341 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       41
		{
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    3    7:new             #528 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #212 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #213 <Method void StringBuilder()>
	//    8   18:ldc2            #553 <String "Fragment ">
	//    9   21:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #415 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #555 <String " not attached to Activity">
	//   13   31:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #532 <Method void IllegalStateException(String)>
	//   16   40:athrow          
		} else
		{
			mHost.onStartIntentSenderFromFragment(this, intentsender, i, intent, j, k, l, bundle);
	//   17   41:aload_0         
	//   18   42:getfield        #341 <Field FragmentHostCallback mHost>
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:iload_2         
	//   22   48:aload_3         
	//   23   49:iload           4
	//   24   51:iload           5
	//   25   53:iload           6
	//   26   55:aload           7
	//   27   57:invokevirtual   #1076 <Method void FragmentHostCallback.onStartIntentSenderFromFragment(Fragment, IntentSender, int, Intent, int, int, int, Bundle)>
			return;
	//   28   60:return          
		}
	}

	public void startPostponedEnterTransition()
	{
		if(mFragmentManager == null || mFragmentManager.mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//*   5   11:getfield        #1079 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//*   6   14:ifnonnull       26
		{
			ensureAnimationInfo().mEnterTransitionPostponed = false;
	//    7   17:aload_0         
	//    8   18:invokespecial   #917 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    9   21:iconst_0        
	//   10   22:putfield        #140 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
			return;
	//   11   25:return          
		}
		if(Looper.myLooper() != mFragmentManager.mHost.getHandler().getLooper())
	//*  12   26:invokestatic    #1085 <Method Looper Looper.myLooper()>
	//*  13   29:aload_0         
	//*  14   30:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//*  15   33:getfield        #1079 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//*  16   36:invokevirtual   #1089 <Method Handler FragmentHostCallback.getHandler()>
	//*  17   39:invokevirtual   #1094 <Method Looper Handler.getLooper()>
	//*  18   42:if_acmpeq       68
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
	//   19   45:aload_0         
	//   20   46:getfield        #334 <Field FragmentManagerImpl mFragmentManager>
	//   21   49:getfield        #1079 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//   22   52:invokevirtual   #1089 <Method Handler FragmentHostCallback.getHandler()>
	//   23   55:new             #10  <Class Fragment$1>
	//   24   58:dup             
	//   25   59:aload_0         
	//   26   60:invokespecial   #1095 <Method void Fragment$1(Fragment)>
	//   27   63:invokevirtual   #1099 <Method boolean Handler.postAtFrontOfQueue(Runnable)>
	//   28   66:pop             
			return;
	//   29   67:return          
		} else
		{
			callStartTransitionListener();
	//   30   68:aload_0         
	//   31   69:invokespecial   #132 <Method void callStartTransitionListener()>
			return;
	//   32   72:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #212 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #1101 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		DebugUtils.buildShortClassTag(((Object) (this)), stringbuilder);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #1107 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		if(mIndex >= 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #121 <Field int mIndex>
	//*  10   20:iflt            40
		{
			stringbuilder.append(" #");
	//   11   23:aload_1         
	//   12   24:ldc2            #1109 <String " #">
	//   13   27:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append(mIndex);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #121 <Field int mIndex>
	//   18   36:invokevirtual   #989 <Method StringBuilder StringBuilder.append(int)>
	//   19   39:pop             
		}
		if(mFragmentId != 0)
	//*  20   40:aload_0         
	//*  21   41:getfield        #253 <Field int mFragmentId>
	//*  22   44:ifeq            67
		{
			stringbuilder.append(" id=0x");
	//   23   47:aload_1         
	//   24   48:ldc2            #1111 <String " id=0x">
	//   25   51:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			stringbuilder.append(Integer.toHexString(mFragmentId));
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #253 <Field int mFragmentId>
	//   30   60:invokestatic    #259 <Method String Integer.toHexString(int)>
	//   31   63:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
		}
		if(mTag != null)
	//*  33   67:aload_0         
	//*  34   68:getfield        #267 <Field String mTag>
	//*  35   71:ifnull          91
		{
			stringbuilder.append(" ");
	//   36   74:aload_1         
	//   37   75:ldc2            #1113 <String " ">
	//   38   78:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			stringbuilder.append(mTag);
	//   40   82:aload_1         
	//   41   83:aload_0         
	//   42   84:getfield        #267 <Field String mTag>
	//   43   87:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
		}
		stringbuilder.append('}');
	//   45   91:aload_1         
	//   46   92:bipush          125
	//   47   94:invokevirtual   #1116 <Method StringBuilder StringBuilder.append(char)>
	//   48   97:pop             
		return stringbuilder.toString();
	//   49   98:aload_1         
	//   50   99:invokevirtual   #227 <Method String StringBuilder.toString()>
	//   51  102:areturn         
	}

	public void unregisterForContextMenu(View view)
	{
		view.setOnCreateContextMenuListener(((android.view.View.OnCreateContextMenuListener) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #923 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
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
	boolean mCheckedForLoaderManager;
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
	LoaderManagerImpl mLoaderManager;
	boolean mLoadersStarted;
	boolean mMenuVisible;
	Fragment mParentFragment;
	boolean mPerformedCreateView;
	float mPostponedAlpha;
	boolean mRemoving;
	boolean mRestored;
	boolean mRetainInstance;
	boolean mRetaining;
	Bundle mSavedFragmentState;
	SparseArray mSavedViewState;
	int mState;
	String mTag;
	Fragment mTarget;
	int mTargetIndex;
	int mTargetRequestCode;
	boolean mUserVisibleHint;
	View mView;
	String mWho;

	static 
	{
	//    0    0:new             #108 <Class SimpleArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #111 <Method void SimpleArrayMap()>
	//    3    7:putstatic       #113 <Field SimpleArrayMap sClassMap>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #114 <Method void Object()>
	//    7   17:putstatic       #116 <Field Object USE_DEFAULT_TRANSITION>
	//*   8   20:return          
	}


/*
	static void access$800(Fragment fragment)
	{
		fragment.callStartTransitionListener();
	//    0    0:aload_0         
	//    1    1:invokespecial   #132 <Method void callStartTransitionListener()>
		return;
	//    2    4:return          
	}

*/
}
