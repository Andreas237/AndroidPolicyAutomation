// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

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
		//    1    1:getfield        #38  <Field Object mEnterTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$002(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mEnterTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field Object mEnterTransition>
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
		//    1    1:getfield        #43  <Field Object mReturnTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$102(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mReturnTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field Object mReturnTransition>
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
		//    1    1:getfield        #45  <Field Object mExitTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$202(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mExitTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field Object mExitTransition>
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
		//    1    1:getfield        #47  <Field Object mReenterTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$302(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mReenterTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #47  <Field Object mReenterTransition>
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
		//    1    1:getfield        #49  <Field Object mSharedElementEnterTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$402(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mSharedElementEnterTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #49  <Field Object mSharedElementEnterTransition>
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
		//    1    1:getfield        #51  <Field Object mSharedElementReturnTransition>
		//    2    4:areturn         
		}

*/


/*
		static Object access$502(AnimationInfo animationinfo, Object obj)
		{
			animationinfo.mSharedElementReturnTransition = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #51  <Field Object mSharedElementReturnTransition>
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
		//    1    1:getfield        #74  <Field Boolean mAllowEnterTransitionOverlap>
		//    2    4:areturn         
		}

*/


/*
		static Boolean access$602(AnimationInfo animationinfo, Boolean boolean1)
		{
			animationinfo.mAllowEnterTransitionOverlap = boolean1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #74  <Field Boolean mAllowEnterTransitionOverlap>
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
		//    1    1:getfield        #79  <Field Boolean mAllowReturnTransitionOverlap>
		//    2    4:areturn         
		}

*/


/*
		static Boolean access$702(AnimationInfo animationinfo, Boolean boolean1)
		{
			animationinfo.mAllowReturnTransitionOverlap = boolean1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #79  <Field Boolean mAllowReturnTransitionOverlap>
			return boolean1;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		AnimationInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void Object()>
			mEnterTransition = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #38  <Field Object mEnterTransition>
			mReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
		//    5    9:aload_0         
		//    6   10:getstatic       #41  <Field Object Fragment.USE_DEFAULT_TRANSITION>
		//    7   13:putfield        #43  <Field Object mReturnTransition>
			mExitTransition = null;
		//    8   16:aload_0         
		//    9   17:aconst_null     
		//   10   18:putfield        #45  <Field Object mExitTransition>
			mReenterTransition = Fragment.USE_DEFAULT_TRANSITION;
		//   11   21:aload_0         
		//   12   22:getstatic       #41  <Field Object Fragment.USE_DEFAULT_TRANSITION>
		//   13   25:putfield        #47  <Field Object mReenterTransition>
			mSharedElementEnterTransition = null;
		//   14   28:aload_0         
		//   15   29:aconst_null     
		//   16   30:putfield        #49  <Field Object mSharedElementEnterTransition>
			mSharedElementReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
		//   17   33:aload_0         
		//   18   34:getstatic       #41  <Field Object Fragment.USE_DEFAULT_TRANSITION>
		//   19   37:putfield        #51  <Field Object mSharedElementReturnTransition>
			mEnterTransitionCallback = null;
		//   20   40:aload_0         
		//   21   41:aconst_null     
		//   22   42:putfield        #53  <Field SharedElementCallback mEnterTransitionCallback>
			mExitTransitionCallback = null;
		//   23   45:aload_0         
		//   24   46:aconst_null     
		//   25   47:putfield        #55  <Field SharedElementCallback mExitTransitionCallback>
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
	//    1    1:invokespecial   #111 <Method void Object()>
		mState = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #116 <Field int mState>
		mIndex = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #118 <Field int mIndex>
		mTargetIndex = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #120 <Field int mTargetIndex>
		mMenuVisible = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #122 <Field boolean mMenuVisible>
		mUserVisibleHint = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #124 <Field boolean mUserVisibleHint>
	//   17   29:return          
	}

	private void callStartTransitionListener()
	{
		OnStartEnterTransitionListener onstartentertransitionlistener;
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
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
	//    7   13:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    8   16:iconst_0        
	//    9   17:putfield        #134 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
			onstartentertransitionlistener = mAnimationInfo.mStartEnterTransitionListener;
	//   10   20:aload_0         
	//   11   21:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   12   24:getfield        #138 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//   13   27:astore_1        
			mAnimationInfo.mStartEnterTransitionListener = null;
	//   14   28:aload_0         
	//   15   29:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   16   32:aconst_null     
	//   17   33:putfield        #138 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
		}
		if(onstartentertransitionlistener != null)
	//*  18   36:aload_1         
	//*  19   37:ifnull          46
			onstartentertransitionlistener.onStartEnterTransition();
	//   20   40:aload_1         
	//   21   41:invokeinterface #141 <Method void Fragment$OnStartEnterTransitionListener.onStartEnterTransition()>
	//   22   46:return          
	}

	private AnimationInfo ensureAnimationInfo()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       18
			mAnimationInfo = new AnimationInfo();
	//    3    7:aload_0         
	//    4    8:new             #14  <Class Fragment$AnimationInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #144 <Method void Fragment$AnimationInfo()>
	//    7   15:putfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
		return mAnimationInfo;
	//    8   18:aload_0         
	//    9   19:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   10   22:areturn         
	}

	public static Fragment instantiate(Context context, String s)
	{
		return instantiate(context, s, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #149 <Method Fragment instantiate(Context, String, Bundle)>
	//    4    6:areturn         
	}

	public static Fragment instantiate(Context context, String s, Bundle bundle)
	{
		Class class1;
		Class class2;
		try
		{
			class2 = (Class)sClassMap.get(((Object) (s)));
	//    0    0:getstatic       #110 <Field SimpleArrayMap sClassMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #160 <Method Object SimpleArrayMap.get(Object)>
	//    3    7:checkcast       #162 <Class Class>
	//    4   10:astore          4
		}
	//*   5   12:aload           4
	//*   6   14:astore_3        
	//*   7   15:aload           4
	//*   8   17:ifnonnull       38
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #168 <Method ClassLoader Context.getClassLoader()>
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #174 <Method Class ClassLoader.loadClass(String)>
	//*  13   28:astore_3        
	//*  14   29:getstatic       #110 <Field SimpleArrayMap sClassMap>
	//*  15   32:aload_1         
	//*  16   33:aload_3         
	//*  17   34:invokevirtual   #178 <Method Object SimpleArrayMap.put(Object, Object)>
	//*  18   37:pop             
	//*  19   38:aload_3         
	//*  20   39:invokevirtual   #182 <Method Object Class.newInstance()>
	//*  21   42:checkcast       #2   <Class Fragment>
	//*  22   45:astore_0        
	//*  23   46:aload_2         
	//*  24   47:ifnull          66
	//*  25   50:aload_2         
	//*  26   51:aload_0         
	//*  27   52:invokevirtual   #186 <Method Class Object.getClass()>
	//*  28   55:invokevirtual   #187 <Method ClassLoader Class.getClassLoader()>
	//*  29   58:invokevirtual   #193 <Method void Bundle.setClassLoader(ClassLoader)>
	//*  30   61:aload_0         
	//*  31   62:aload_2         
	//*  32   63:invokevirtual   #197 <Method void setArguments(Bundle)>
	//*  33   66:aload_0         
	//*  34   67:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  35   68:astore_0        
		{
			throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), ((Exception) (context)));
	//   36   69:new             #17  <Class Fragment$InstantiationException>
	//   37   72:dup             
	//   38   73:new             #199 <Class StringBuilder>
	//   39   76:dup             
	//   40   77:invokespecial   #200 <Method void StringBuilder()>
	//   41   80:ldc1            #202 <String "Unable to instantiate fragment ">
	//   42   82:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   43   85:aload_1         
	//   44   86:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   45   89:ldc1            #208 <String ": make sure class name exists, is public, and has an">
	//   46   91:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   47   94:ldc1            #210 <String " empty constructor that is public">
	//   48   96:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   49   99:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   50  102:aload_0         
	//   51  103:invokespecial   #217 <Method void Fragment$InstantiationException(String, Exception)>
	//   52  106:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  53  107:astore_0        
		{
			throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), ((Exception) (context)));
	//   54  108:new             #17  <Class Fragment$InstantiationException>
	//   55  111:dup             
	//   56  112:new             #199 <Class StringBuilder>
	//   57  115:dup             
	//   58  116:invokespecial   #200 <Method void StringBuilder()>
	//   59  119:ldc1            #202 <String "Unable to instantiate fragment ">
	//   60  121:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   61  124:aload_1         
	//   62  125:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   63  128:ldc1            #208 <String ": make sure class name exists, is public, and has an">
	//   64  130:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   65  133:ldc1            #210 <String " empty constructor that is public">
	//   66  135:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   67  138:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   68  141:aload_0         
	//   69  142:invokespecial   #217 <Method void Fragment$InstantiationException(String, Exception)>
	//   70  145:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  71  146:astore_0        
		{
			throw new InstantiationException((new StringBuilder()).append("Unable to instantiate fragment ").append(s).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), ((Exception) (context)));
	//   72  147:new             #17  <Class Fragment$InstantiationException>
	//   73  150:dup             
	//   74  151:new             #199 <Class StringBuilder>
	//   75  154:dup             
	//   76  155:invokespecial   #200 <Method void StringBuilder()>
	//   77  158:ldc1            #202 <String "Unable to instantiate fragment ">
	//   78  160:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   79  163:aload_1         
	//   80  164:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   81  167:ldc1            #208 <String ": make sure class name exists, is public, and has an">
	//   82  169:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   83  172:ldc1            #210 <String " empty constructor that is public">
	//   84  174:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   85  177:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   86  180:aload_0         
	//   87  181:invokespecial   #217 <Method void Fragment$InstantiationException(String, Exception)>
	//   88  184:athrow          
		}
		class1 = class2;
		if(class2 != null)
			break MISSING_BLOCK_LABEL_38;
		class1 = context.getClassLoader().loadClass(s);
		sClassMap.put(((Object) (s)), ((Object) (class1)));
		context = ((Context) ((Fragment)class1.newInstance()));
		if(bundle == null)
			break MISSING_BLOCK_LABEL_66;
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
	//    0    0:getstatic       #110 <Field SimpleArrayMap sClassMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #160 <Method Object SimpleArrayMap.get(Object)>
	//    3    7:checkcast       #162 <Class Class>
	//    4   10:astore          4
		}
	//*   5   12:aload           4
	//*   6   14:astore_3        
	//*   7   15:aload           4
	//*   8   17:ifnonnull       38
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #168 <Method ClassLoader Context.getClassLoader()>
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #174 <Method Class ClassLoader.loadClass(String)>
	//*  13   28:astore_3        
	//*  14   29:getstatic       #110 <Field SimpleArrayMap sClassMap>
	//*  15   32:aload_1         
	//*  16   33:aload_3         
	//*  17   34:invokevirtual   #178 <Method Object SimpleArrayMap.put(Object, Object)>
	//*  18   37:pop             
	//*  19   38:ldc1            #2   <Class Fragment>
	//*  20   40:aload_3         
	//*  21   41:invokevirtual   #224 <Method boolean Class.isAssignableFrom(Class)>
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
	//    2    2:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print("mFragmentId=#");
	//    3    5:aload_3         
	//    4    6:ldc1            #234 <String "mFragmentId=#">
	//    5    8:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(mFragmentId));
	//    6   11:aload_3         
	//    7   12:aload_0         
	//    8   13:getfield        #236 <Field int mFragmentId>
	//    9   16:invokestatic    #242 <Method String Integer.toHexString(int)>
	//   10   19:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(" mContainerId=#");
	//   11   22:aload_3         
	//   12   23:ldc1            #244 <String " mContainerId=#">
	//   13   25:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(mContainerId));
	//   14   28:aload_3         
	//   15   29:aload_0         
	//   16   30:getfield        #246 <Field int mContainerId>
	//   17   33:invokestatic    #242 <Method String Integer.toHexString(int)>
	//   18   36:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(" mTag=");
	//   19   39:aload_3         
	//   20   40:ldc1            #248 <String " mTag=">
	//   21   42:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.println(mTag);
	//   22   45:aload_3         
	//   23   46:aload_0         
	//   24   47:getfield        #250 <Field String mTag>
	//   25   50:invokevirtual   #253 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   26   53:aload_3         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print("mState=");
	//   29   58:aload_3         
	//   30   59:ldc1            #255 <String "mState=">
	//   31   61:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mState);
	//   32   64:aload_3         
	//   33   65:aload_0         
	//   34   66:getfield        #116 <Field int mState>
	//   35   69:invokevirtual   #258 <Method void PrintWriter.print(int)>
		printwriter.print(" mIndex=");
	//   36   72:aload_3         
	//   37   73:ldc2            #260 <String " mIndex=">
	//   38   76:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mIndex);
	//   39   79:aload_3         
	//   40   80:aload_0         
	//   41   81:getfield        #118 <Field int mIndex>
	//   42   84:invokevirtual   #258 <Method void PrintWriter.print(int)>
		printwriter.print(" mWho=");
	//   43   87:aload_3         
	//   44   88:ldc2            #262 <String " mWho=">
	//   45   91:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mWho);
	//   46   94:aload_3         
	//   47   95:aload_0         
	//   48   96:getfield        #264 <Field String mWho>
	//   49   99:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(" mBackStackNesting=");
	//   50  102:aload_3         
	//   51  103:ldc2            #266 <String " mBackStackNesting=">
	//   52  106:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.println(mBackStackNesting);
	//   53  109:aload_3         
	//   54  110:aload_0         
	//   55  111:getfield        #268 <Field int mBackStackNesting>
	//   56  114:invokevirtual   #270 <Method void PrintWriter.println(int)>
		printwriter.print(s);
	//   57  117:aload_3         
	//   58  118:aload_1         
	//   59  119:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print("mAdded=");
	//   60  122:aload_3         
	//   61  123:ldc2            #272 <String "mAdded=">
	//   62  126:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mAdded);
	//   63  129:aload_3         
	//   64  130:aload_0         
	//   65  131:getfield        #274 <Field boolean mAdded>
	//   66  134:invokevirtual   #277 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRemoving=");
	//   67  137:aload_3         
	//   68  138:ldc2            #279 <String " mRemoving=">
	//   69  141:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mRemoving);
	//   70  144:aload_3         
	//   71  145:aload_0         
	//   72  146:getfield        #281 <Field boolean mRemoving>
	//   73  149:invokevirtual   #277 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mFromLayout=");
	//   74  152:aload_3         
	//   75  153:ldc2            #283 <String " mFromLayout=">
	//   76  156:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mFromLayout);
	//   77  159:aload_3         
	//   78  160:aload_0         
	//   79  161:getfield        #285 <Field boolean mFromLayout>
	//   80  164:invokevirtual   #277 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mInLayout=");
	//   81  167:aload_3         
	//   82  168:ldc2            #287 <String " mInLayout=">
	//   83  171:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.println(mInLayout);
	//   84  174:aload_3         
	//   85  175:aload_0         
	//   86  176:getfield        #289 <Field boolean mInLayout>
	//   87  179:invokevirtual   #291 <Method void PrintWriter.println(boolean)>
		printwriter.print(s);
	//   88  182:aload_3         
	//   89  183:aload_1         
	//   90  184:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print("mHidden=");
	//   91  187:aload_3         
	//   92  188:ldc2            #293 <String "mHidden=">
	//   93  191:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mHidden);
	//   94  194:aload_3         
	//   95  195:aload_0         
	//   96  196:getfield        #295 <Field boolean mHidden>
	//   97  199:invokevirtual   #277 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDetached=");
	//   98  202:aload_3         
	//   99  203:ldc2            #297 <String " mDetached=">
	//  100  206:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mDetached);
	//  101  209:aload_3         
	//  102  210:aload_0         
	//  103  211:getfield        #299 <Field boolean mDetached>
	//  104  214:invokevirtual   #277 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mMenuVisible=");
	//  105  217:aload_3         
	//  106  218:ldc2            #301 <String " mMenuVisible=">
	//  107  221:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mMenuVisible);
	//  108  224:aload_3         
	//  109  225:aload_0         
	//  110  226:getfield        #122 <Field boolean mMenuVisible>
	//  111  229:invokevirtual   #277 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mHasMenu=");
	//  112  232:aload_3         
	//  113  233:ldc2            #303 <String " mHasMenu=">
	//  114  236:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.println(mHasMenu);
	//  115  239:aload_3         
	//  116  240:aload_0         
	//  117  241:getfield        #305 <Field boolean mHasMenu>
	//  118  244:invokevirtual   #291 <Method void PrintWriter.println(boolean)>
		printwriter.print(s);
	//  119  247:aload_3         
	//  120  248:aload_1         
	//  121  249:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print("mRetainInstance=");
	//  122  252:aload_3         
	//  123  253:ldc2            #307 <String "mRetainInstance=">
	//  124  256:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mRetainInstance);
	//  125  259:aload_3         
	//  126  260:aload_0         
	//  127  261:getfield        #309 <Field boolean mRetainInstance>
	//  128  264:invokevirtual   #277 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRetaining=");
	//  129  267:aload_3         
	//  130  268:ldc2            #311 <String " mRetaining=">
	//  131  271:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.print(mRetaining);
	//  132  274:aload_3         
	//  133  275:aload_0         
	//  134  276:getfield        #313 <Field boolean mRetaining>
	//  135  279:invokevirtual   #277 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mUserVisibleHint=");
	//  136  282:aload_3         
	//  137  283:ldc2            #315 <String " mUserVisibleHint=">
	//  138  286:invokevirtual   #232 <Method void PrintWriter.print(String)>
		printwriter.println(mUserVisibleHint);
	//  139  289:aload_3         
	//  140  290:aload_0         
	//  141  291:getfield        #124 <Field boolean mUserVisibleHint>
	//  142  294:invokevirtual   #291 <Method void PrintWriter.println(boolean)>
		if(mFragmentManager != null)
	//* 143  297:aload_0         
	//* 144  298:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//* 145  301:ifnull          324
		{
			printwriter.print(s);
	//  146  304:aload_3         
	//  147  305:aload_1         
	//  148  306:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mFragmentManager=");
	//  149  309:aload_3         
	//  150  310:ldc2            #319 <String "mFragmentManager=">
	//  151  313:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mFragmentManager)));
	//  152  316:aload_3         
	//  153  317:aload_0         
	//  154  318:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//  155  321:invokevirtual   #322 <Method void PrintWriter.println(Object)>
		}
		if(mHost != null)
	//* 156  324:aload_0         
	//* 157  325:getfield        #324 <Field FragmentHostCallback mHost>
	//* 158  328:ifnull          351
		{
			printwriter.print(s);
	//  159  331:aload_3         
	//  160  332:aload_1         
	//  161  333:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mHost=");
	//  162  336:aload_3         
	//  163  337:ldc2            #326 <String "mHost=">
	//  164  340:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mHost)));
	//  165  343:aload_3         
	//  166  344:aload_0         
	//  167  345:getfield        #324 <Field FragmentHostCallback mHost>
	//  168  348:invokevirtual   #322 <Method void PrintWriter.println(Object)>
		}
		if(mParentFragment != null)
	//* 169  351:aload_0         
	//* 170  352:getfield        #328 <Field Fragment mParentFragment>
	//* 171  355:ifnull          378
		{
			printwriter.print(s);
	//  172  358:aload_3         
	//  173  359:aload_1         
	//  174  360:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mParentFragment=");
	//  175  363:aload_3         
	//  176  364:ldc2            #330 <String "mParentFragment=">
	//  177  367:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParentFragment)));
	//  178  370:aload_3         
	//  179  371:aload_0         
	//  180  372:getfield        #328 <Field Fragment mParentFragment>
	//  181  375:invokevirtual   #322 <Method void PrintWriter.println(Object)>
		}
		if(mArguments != null)
	//* 182  378:aload_0         
	//* 183  379:getfield        #332 <Field Bundle mArguments>
	//* 184  382:ifnull          405
		{
			printwriter.print(s);
	//  185  385:aload_3         
	//  186  386:aload_1         
	//  187  387:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mArguments=");
	//  188  390:aload_3         
	//  189  391:ldc2            #334 <String "mArguments=">
	//  190  394:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mArguments)));
	//  191  397:aload_3         
	//  192  398:aload_0         
	//  193  399:getfield        #332 <Field Bundle mArguments>
	//  194  402:invokevirtual   #322 <Method void PrintWriter.println(Object)>
		}
		if(mSavedFragmentState != null)
	//* 195  405:aload_0         
	//* 196  406:getfield        #336 <Field Bundle mSavedFragmentState>
	//* 197  409:ifnull          432
		{
			printwriter.print(s);
	//  198  412:aload_3         
	//  199  413:aload_1         
	//  200  414:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mSavedFragmentState=");
	//  201  417:aload_3         
	//  202  418:ldc2            #338 <String "mSavedFragmentState=">
	//  203  421:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mSavedFragmentState)));
	//  204  424:aload_3         
	//  205  425:aload_0         
	//  206  426:getfield        #336 <Field Bundle mSavedFragmentState>
	//  207  429:invokevirtual   #322 <Method void PrintWriter.println(Object)>
		}
		if(mSavedViewState != null)
	//* 208  432:aload_0         
	//* 209  433:getfield        #340 <Field SparseArray mSavedViewState>
	//* 210  436:ifnull          459
		{
			printwriter.print(s);
	//  211  439:aload_3         
	//  212  440:aload_1         
	//  213  441:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mSavedViewState=");
	//  214  444:aload_3         
	//  215  445:ldc2            #342 <String "mSavedViewState=">
	//  216  448:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mSavedViewState)));
	//  217  451:aload_3         
	//  218  452:aload_0         
	//  219  453:getfield        #340 <Field SparseArray mSavedViewState>
	//  220  456:invokevirtual   #322 <Method void PrintWriter.println(Object)>
		}
		if(mTarget != null)
	//* 221  459:aload_0         
	//* 222  460:getfield        #344 <Field Fragment mTarget>
	//* 223  463:ifnull          501
		{
			printwriter.print(s);
	//  224  466:aload_3         
	//  225  467:aload_1         
	//  226  468:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mTarget=");
	//  227  471:aload_3         
	//  228  472:ldc2            #346 <String "mTarget=">
	//  229  475:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print(((Object) (mTarget)));
	//  230  478:aload_3         
	//  231  479:aload_0         
	//  232  480:getfield        #344 <Field Fragment mTarget>
	//  233  483:invokevirtual   #348 <Method void PrintWriter.print(Object)>
			printwriter.print(" mTargetRequestCode=");
	//  234  486:aload_3         
	//  235  487:ldc2            #350 <String " mTargetRequestCode=">
	//  236  490:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(mTargetRequestCode);
	//  237  493:aload_3         
	//  238  494:aload_0         
	//  239  495:getfield        #352 <Field int mTargetRequestCode>
	//  240  498:invokevirtual   #270 <Method void PrintWriter.println(int)>
		}
		if(getNextAnim() != 0)
	//* 241  501:aload_0         
	//* 242  502:invokevirtual   #356 <Method int getNextAnim()>
	//* 243  505:ifeq            528
		{
			printwriter.print(s);
	//  244  508:aload_3         
	//  245  509:aload_1         
	//  246  510:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mNextAnim=");
	//  247  513:aload_3         
	//  248  514:ldc2            #358 <String "mNextAnim=">
	//  249  517:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(getNextAnim());
	//  250  520:aload_3         
	//  251  521:aload_0         
	//  252  522:invokevirtual   #356 <Method int getNextAnim()>
	//  253  525:invokevirtual   #270 <Method void PrintWriter.println(int)>
		}
		if(mContainer != null)
	//* 254  528:aload_0         
	//* 255  529:getfield        #360 <Field ViewGroup mContainer>
	//* 256  532:ifnull          555
		{
			printwriter.print(s);
	//  257  535:aload_3         
	//  258  536:aload_1         
	//  259  537:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mContainer=");
	//  260  540:aload_3         
	//  261  541:ldc2            #362 <String "mContainer=">
	//  262  544:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mContainer)));
	//  263  547:aload_3         
	//  264  548:aload_0         
	//  265  549:getfield        #360 <Field ViewGroup mContainer>
	//  266  552:invokevirtual   #322 <Method void PrintWriter.println(Object)>
		}
		if(mView != null)
	//* 267  555:aload_0         
	//* 268  556:getfield        #364 <Field View mView>
	//* 269  559:ifnull          582
		{
			printwriter.print(s);
	//  270  562:aload_3         
	//  271  563:aload_1         
	//  272  564:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mView=");
	//  273  567:aload_3         
	//  274  568:ldc2            #366 <String "mView=">
	//  275  571:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mView)));
	//  276  574:aload_3         
	//  277  575:aload_0         
	//  278  576:getfield        #364 <Field View mView>
	//  279  579:invokevirtual   #322 <Method void PrintWriter.println(Object)>
		}
		if(mInnerView != null)
	//* 280  582:aload_0         
	//* 281  583:getfield        #368 <Field View mInnerView>
	//* 282  586:ifnull          609
		{
			printwriter.print(s);
	//  283  589:aload_3         
	//  284  590:aload_1         
	//  285  591:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mInnerView=");
	//  286  594:aload_3         
	//  287  595:ldc2            #370 <String "mInnerView=">
	//  288  598:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mView)));
	//  289  601:aload_3         
	//  290  602:aload_0         
	//  291  603:getfield        #364 <Field View mView>
	//  292  606:invokevirtual   #322 <Method void PrintWriter.println(Object)>
		}
		if(getAnimatingAway() != null)
	//* 293  609:aload_0         
	//* 294  610:invokevirtual   #374 <Method View getAnimatingAway()>
	//* 295  613:ifnull          656
		{
			printwriter.print(s);
	//  296  616:aload_3         
	//  297  617:aload_1         
	//  298  618:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mAnimatingAway=");
	//  299  621:aload_3         
	//  300  622:ldc2            #376 <String "mAnimatingAway=">
	//  301  625:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (getAnimatingAway())));
	//  302  628:aload_3         
	//  303  629:aload_0         
	//  304  630:invokevirtual   #374 <Method View getAnimatingAway()>
	//  305  633:invokevirtual   #322 <Method void PrintWriter.println(Object)>
			printwriter.print(s);
	//  306  636:aload_3         
	//  307  637:aload_1         
	//  308  638:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.print("mStateAfterAnimating=");
	//  309  641:aload_3         
	//  310  642:ldc2            #378 <String "mStateAfterAnimating=">
	//  311  645:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println(getStateAfterAnimating());
	//  312  648:aload_3         
	//  313  649:aload_0         
	//  314  650:invokevirtual   #381 <Method int getStateAfterAnimating()>
	//  315  653:invokevirtual   #270 <Method void PrintWriter.println(int)>
		}
		if(mLoaderManager != null)
	//* 316  656:aload_0         
	//* 317  657:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//* 318  660:ifnull          706
		{
			printwriter.print(s);
	//  319  663:aload_3         
	//  320  664:aload_1         
	//  321  665:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println("Loader Manager:");
	//  322  668:aload_3         
	//  323  669:ldc2            #385 <String "Loader Manager:">
	//  324  672:invokevirtual   #253 <Method void PrintWriter.println(String)>
			mLoaderManager.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
	//  325  675:aload_0         
	//  326  676:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//  327  679:new             #199 <Class StringBuilder>
	//  328  682:dup             
	//  329  683:invokespecial   #200 <Method void StringBuilder()>
	//  330  686:aload_1         
	//  331  687:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  332  690:ldc2            #387 <String "  ">
	//  333  693:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  334  696:invokevirtual   #214 <Method String StringBuilder.toString()>
	//  335  699:aload_2         
	//  336  700:aload_3         
	//  337  701:aload           4
	//  338  703:invokevirtual   #391 <Method void LoaderManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
		}
		if(mChildFragmentManager != null)
	//* 339  706:aload_0         
	//* 340  707:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//* 341  710:ifnull          782
		{
			printwriter.print(s);
	//  342  713:aload_3         
	//  343  714:aload_1         
	//  344  715:invokevirtual   #232 <Method void PrintWriter.print(String)>
			printwriter.println((new StringBuilder()).append("Child ").append(((Object) (mChildFragmentManager))).append(":").toString());
	//  345  718:aload_3         
	//  346  719:new             #199 <Class StringBuilder>
	//  347  722:dup             
	//  348  723:invokespecial   #200 <Method void StringBuilder()>
	//  349  726:ldc2            #395 <String "Child ">
	//  350  729:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  351  732:aload_0         
	//  352  733:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//  353  736:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//  354  739:ldc2            #400 <String ":">
	//  355  742:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  356  745:invokevirtual   #214 <Method String StringBuilder.toString()>
	//  357  748:invokevirtual   #253 <Method void PrintWriter.println(String)>
			mChildFragmentManager.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
	//  358  751:aload_0         
	//  359  752:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//  360  755:new             #199 <Class StringBuilder>
	//  361  758:dup             
	//  362  759:invokespecial   #200 <Method void StringBuilder()>
	//  363  762:aload_1         
	//  364  763:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  365  766:ldc2            #387 <String "  ">
	//  366  769:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  367  772:invokevirtual   #214 <Method String StringBuilder.toString()>
	//  368  775:aload_2         
	//  369  776:aload_3         
	//  370  777:aload           4
	//  371  779:invokevirtual   #403 <Method void FragmentManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
		}
	//  372  782:return          
	}

	public final boolean equals(Object obj)
	{
		return super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #407 <Method boolean Object.equals(Object)>
	//    3    5:ireturn         
	}

	Fragment findFragmentByWho(String s)
	{
		if(s.equals(((Object) (mWho))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #264 <Field String mWho>
	//*   3    5:invokevirtual   #412 <Method boolean String.equals(Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		if(mChildFragmentManager != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   9   17:ifnull          29
			return mChildFragmentManager.findFragmentByWho(s);
	//   10   20:aload_0         
	//   11   21:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #414 <Method Fragment FragmentManagerImpl.findFragmentByWho(String)>
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
	//*   1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (FragmentActivity)mHost.getActivity();
	//    5    9:aload_0         
	//    6   10:getfield        #324 <Field FragmentHostCallback mHost>
	//    7   13:invokevirtual   #421 <Method Activity FragmentHostCallback.getActivity()>
	//    8   16:checkcast       #423 <Class FragmentActivity>
	//    9   19:areturn         
	}

	public boolean getAllowEnterTransitionOverlap()
	{
		if(mAnimationInfo == null || mAnimationInfo.mAllowEnterTransitionOverlap == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   5   11:invokestatic    #429 <Method Boolean Fragment$AnimationInfo.access$600(Fragment$AnimationInfo)>
	//*   6   14:ifnonnull       19
			return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
		else
			return mAnimationInfo.mAllowEnterTransitionOverlap.booleanValue();
	//    9   19:aload_0         
	//   10   20:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   11   23:invokestatic    #429 <Method Boolean Fragment$AnimationInfo.access$600(Fragment$AnimationInfo)>
	//   12   26:invokevirtual   #434 <Method boolean Boolean.booleanValue()>
	//   13   29:ireturn         
	}

	public boolean getAllowReturnTransitionOverlap()
	{
		if(mAnimationInfo == null || mAnimationInfo.mAllowReturnTransitionOverlap == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   5   11:invokestatic    #438 <Method Boolean Fragment$AnimationInfo.access$700(Fragment$AnimationInfo)>
	//*   6   14:ifnonnull       19
			return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
		else
			return mAnimationInfo.mAllowReturnTransitionOverlap.booleanValue();
	//    9   19:aload_0         
	//   10   20:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   11   23:invokestatic    #438 <Method Boolean Fragment$AnimationInfo.access$700(Fragment$AnimationInfo)>
	//   12   26:invokevirtual   #434 <Method boolean Boolean.booleanValue()>
	//   13   29:ireturn         
	}

	View getAnimatingAway()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mAnimatingAway;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #441 <Field View Fragment$AnimationInfo.mAnimatingAway>
	//    8   16:areturn         
	}

	public final Bundle getArguments()
	{
		return mArguments;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field Bundle mArguments>
	//    2    4:areturn         
	}

	public final FragmentManager getChildFragmentManager()
	{
		if(mChildFragmentManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnonnull       80
		{
			instantiateChildFragmentManager();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #448 <Method void instantiateChildFragmentManager()>
			if(mState >= 5)
	//*   5   11:aload_0         
	//*   6   12:getfield        #116 <Field int mState>
	//*   7   15:iconst_5        
	//*   8   16:icmplt          29
				mChildFragmentManager.dispatchResume();
	//    9   19:aload_0         
	//   10   20:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   11   23:invokevirtual   #451 <Method void FragmentManagerImpl.dispatchResume()>
			else
	//*  12   26:goto            80
			if(mState >= 4)
	//*  13   29:aload_0         
	//*  14   30:getfield        #116 <Field int mState>
	//*  15   33:iconst_4        
	//*  16   34:icmplt          47
				mChildFragmentManager.dispatchStart();
	//   17   37:aload_0         
	//   18   38:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   19   41:invokevirtual   #454 <Method void FragmentManagerImpl.dispatchStart()>
			else
	//*  20   44:goto            80
			if(mState >= 2)
	//*  21   47:aload_0         
	//*  22   48:getfield        #116 <Field int mState>
	//*  23   51:iconst_2        
	//*  24   52:icmplt          65
				mChildFragmentManager.dispatchActivityCreated();
	//   25   55:aload_0         
	//   26   56:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   27   59:invokevirtual   #457 <Method void FragmentManagerImpl.dispatchActivityCreated()>
			else
	//*  28   62:goto            80
			if(mState >= 1)
	//*  29   65:aload_0         
	//*  30   66:getfield        #116 <Field int mState>
	//*  31   69:iconst_1        
	//*  32   70:icmplt          80
				mChildFragmentManager.dispatchCreate();
	//   33   73:aload_0         
	//   34   74:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   35   77:invokevirtual   #460 <Method void FragmentManagerImpl.dispatchCreate()>
		}
		return ((FragmentManager) (mChildFragmentManager));
	//   36   80:aload_0         
	//   37   81:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   38   84:areturn         
	}

	public Context getContext()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mHost.getContext();
	//    5    9:aload_0         
	//    6   10:getfield        #324 <Field FragmentHostCallback mHost>
	//    7   13:invokevirtual   #464 <Method Context FragmentHostCallback.getContext()>
	//    8   16:areturn         
	}

	public Object getEnterTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mEnterTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:invokestatic    #469 <Method Object Fragment$AnimationInfo.access$000(Fragment$AnimationInfo)>
	//    8   16:areturn         
	}

	SharedElementCallback getEnterTransitionCallback()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mEnterTransitionCallback;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #475 <Field SharedElementCallback Fragment$AnimationInfo.mEnterTransitionCallback>
	//    8   16:areturn         
	}

	public Object getExitTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mExitTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:invokestatic    #479 <Method Object Fragment$AnimationInfo.access$200(Fragment$AnimationInfo)>
	//    8   16:areturn         
	}

	SharedElementCallback getExitTransitionCallback()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mExitTransitionCallback;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #483 <Field SharedElementCallback Fragment$AnimationInfo.mExitTransitionCallback>
	//    8   16:areturn         
	}

	public final FragmentManager getFragmentManager()
	{
		return ((FragmentManager) (mFragmentManager));
	//    0    0:aload_0         
	//    1    1:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//    2    4:areturn         
	}

	public final Object getHost()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mHost.onGetHost();
	//    5    9:aload_0         
	//    6   10:getfield        #324 <Field FragmentHostCallback mHost>
	//    7   13:invokevirtual   #488 <Method Object FragmentHostCallback.onGetHost()>
	//    8   16:areturn         
	}

	public final int getId()
	{
		return mFragmentId;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field int mFragmentId>
	//    2    4:ireturn         
	}

	public LayoutInflater getLayoutInflater(Bundle bundle)
	{
		bundle = ((Bundle) (mHost.onGetLayoutInflater()));
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//    2    4:invokevirtual   #499 <Method LayoutInflater FragmentHostCallback.onGetLayoutInflater()>
	//    3    7:astore_1        
		getChildFragmentManager();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #501 <Method FragmentManager getChildFragmentManager()>
	//    6   12:pop             
		LayoutInflaterCompat.setFactory2(((LayoutInflater) (bundle)), mChildFragmentManager.getLayoutInflaterFactory());
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   10   18:invokevirtual   #505 <Method android.view.LayoutInflater$Factory2 FragmentManagerImpl.getLayoutInflaterFactory()>
	//   11   21:invokestatic    #511 <Method void LayoutInflaterCompat.setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
		return ((LayoutInflater) (bundle));
	//   12   24:aload_1         
	//   13   25:areturn         
	}

	public LoaderManager getLoaderManager()
	{
		if(mLoaderManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//*   2    4:ifnull          12
			return ((LoaderManager) (mLoaderManager));
	//    3    7:aload_0         
	//    4    8:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//    5   11:areturn         
		if(mHost == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #324 <Field FragmentHostCallback mHost>
	//*   8   16:ifnonnull       53
		{
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    9   19:new             #516 <Class IllegalStateException>
	//   10   22:dup             
	//   11   23:new             #199 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #200 <Method void StringBuilder()>
	//   14   30:ldc2            #518 <String "Fragment ">
	//   15   33:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:aload_0         
	//   17   37:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   18   40:ldc2            #520 <String " not attached to Activity">
	//   19   43:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   20   46:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   21   49:invokespecial   #522 <Method void IllegalStateException(String)>
	//   22   52:athrow          
		} else
		{
			mCheckedForLoaderManager = true;
	//   23   53:aload_0         
	//   24   54:iconst_1        
	//   25   55:putfield        #524 <Field boolean mCheckedForLoaderManager>
			mLoaderManager = mHost.getLoaderManager(mWho, mLoadersStarted, true);
	//   26   58:aload_0         
	//   27   59:aload_0         
	//   28   60:getfield        #324 <Field FragmentHostCallback mHost>
	//   29   63:aload_0         
	//   30   64:getfield        #264 <Field String mWho>
	//   31   67:aload_0         
	//   32   68:getfield        #526 <Field boolean mLoadersStarted>
	//   33   71:iconst_1        
	//   34   72:invokevirtual   #529 <Method LoaderManagerImpl FragmentHostCallback.getLoaderManager(String, boolean, boolean)>
	//   35   75:putfield        #383 <Field LoaderManagerImpl mLoaderManager>
			return ((LoaderManager) (mLoaderManager));
	//   36   78:aload_0         
	//   37   79:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//   38   82:areturn         
		}
	}

	int getNextAnim()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mNextAnim;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #532 <Field int Fragment$AnimationInfo.mNextAnim>
	//    8   16:ireturn         
	}

	int getNextTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mNextTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #536 <Field int Fragment$AnimationInfo.mNextTransition>
	//    8   16:ireturn         
	}

	int getNextTransitionStyle()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mNextTransitionStyle;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #540 <Field int Fragment$AnimationInfo.mNextTransitionStyle>
	//    8   16:ireturn         
	}

	public final Fragment getParentFragment()
	{
		return mParentFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #328 <Field Fragment mParentFragment>
	//    2    4:areturn         
	}

	public Object getReenterTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mAnimationInfo.mReenterTransition == USE_DEFAULT_TRANSITION)
	//*   5    9:aload_0         
	//*   6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   7   13:invokestatic    #546 <Method Object Fragment$AnimationInfo.access$300(Fragment$AnimationInfo)>
	//*   8   16:getstatic       #113 <Field Object USE_DEFAULT_TRANSITION>
	//*   9   19:if_acmpne       27
			return getExitTransition();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #548 <Method Object getExitTransition()>
	//   12   26:areturn         
		else
			return mAnimationInfo.mReenterTransition;
	//   13   27:aload_0         
	//   14   28:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   15   31:invokestatic    #546 <Method Object Fragment$AnimationInfo.access$300(Fragment$AnimationInfo)>
	//   16   34:areturn         
	}

	public final Resources getResources()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       41
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    3    7:new             #516 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #199 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #200 <Method void StringBuilder()>
	//    8   18:ldc2            #518 <String "Fragment ">
	//    9   21:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #520 <String " not attached to Activity">
	//   13   31:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #522 <Method void IllegalStateException(String)>
	//   16   40:athrow          
		else
			return mHost.getContext().getResources();
	//   17   41:aload_0         
	//   18   42:getfield        #324 <Field FragmentHostCallback mHost>
	//   19   45:invokevirtual   #464 <Method Context FragmentHostCallback.getContext()>
	//   20   48:invokevirtual   #552 <Method Resources Context.getResources()>
	//   21   51:areturn         
	}

	public final boolean getRetainInstance()
	{
		return mRetainInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #309 <Field boolean mRetainInstance>
	//    2    4:ireturn         
	}

	public Object getReturnTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mAnimationInfo.mReturnTransition == USE_DEFAULT_TRANSITION)
	//*   5    9:aload_0         
	//*   6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   7   13:invokestatic    #557 <Method Object Fragment$AnimationInfo.access$100(Fragment$AnimationInfo)>
	//*   8   16:getstatic       #113 <Field Object USE_DEFAULT_TRANSITION>
	//*   9   19:if_acmpne       27
			return getEnterTransition();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #559 <Method Object getEnterTransition()>
	//   12   26:areturn         
		else
			return mAnimationInfo.mReturnTransition;
	//   13   27:aload_0         
	//   14   28:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   15   31:invokestatic    #557 <Method Object Fragment$AnimationInfo.access$100(Fragment$AnimationInfo)>
	//   16   34:areturn         
	}

	public Object getSharedElementEnterTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return mAnimationInfo.mSharedElementEnterTransition;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:invokestatic    #563 <Method Object Fragment$AnimationInfo.access$400(Fragment$AnimationInfo)>
	//    8   16:areturn         
	}

	public Object getSharedElementReturnTransition()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mAnimationInfo.mSharedElementReturnTransition == USE_DEFAULT_TRANSITION)
	//*   5    9:aload_0         
	//*   6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   7   13:invokestatic    #567 <Method Object Fragment$AnimationInfo.access$500(Fragment$AnimationInfo)>
	//*   8   16:getstatic       #113 <Field Object USE_DEFAULT_TRANSITION>
	//*   9   19:if_acmpne       27
			return getSharedElementEnterTransition();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #569 <Method Object getSharedElementEnterTransition()>
	//   12   26:areturn         
		else
			return mAnimationInfo.mSharedElementReturnTransition;
	//   13   27:aload_0         
	//   14   28:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   15   31:invokestatic    #567 <Method Object Fragment$AnimationInfo.access$500(Fragment$AnimationInfo)>
	//   16   34:areturn         
	}

	int getStateAfterAnimating()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mStateAfterAnimating;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #572 <Field int Fragment$AnimationInfo.mStateAfterAnimating>
	//    8   16:ireturn         
	}

	public final String getString(int i)
	{
		return getResources().getString(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #575 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #579 <Method String Resources.getString(int)>
	//    4    8:areturn         
	}

	public final transient String getString(int i, Object aobj[])
	{
		return getResources().getString(i, aobj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #575 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #582 <Method String Resources.getString(int, Object[])>
	//    5    9:areturn         
	}

	public final String getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field String mTag>
	//    2    4:areturn         
	}

	public final Fragment getTargetFragment()
	{
		return mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #344 <Field Fragment mTarget>
	//    2    4:areturn         
	}

	public final int getTargetRequestCode()
	{
		return mTargetRequestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #352 <Field int mTargetRequestCode>
	//    2    4:ireturn         
	}

	public final CharSequence getText(int i)
	{
		return getResources().getText(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #575 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #589 <Method CharSequence Resources.getText(int)>
	//    4    8:areturn         
	}

	public boolean getUserVisibleHint()
	{
		return mUserVisibleHint;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field boolean mUserVisibleHint>
	//    2    4:ireturn         
	}

	public View getView()
	{
		return mView;
	//    0    0:aload_0         
	//    1    1:getfield        #364 <Field View mView>
	//    2    4:areturn         
	}

	public final boolean hasOptionsMenu()
	{
		return mHasMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #305 <Field boolean mHasMenu>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #595 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	void initState()
	{
		mIndex = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #118 <Field int mIndex>
		mWho = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #264 <Field String mWho>
		mAdded = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #274 <Field boolean mAdded>
		mRemoving = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #281 <Field boolean mRemoving>
		mFromLayout = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #285 <Field boolean mFromLayout>
		mInLayout = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #289 <Field boolean mInLayout>
		mRestored = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #598 <Field boolean mRestored>
		mBackStackNesting = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #268 <Field int mBackStackNesting>
		mFragmentManager = null;
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:putfield        #317 <Field FragmentManagerImpl mFragmentManager>
		mChildFragmentManager = null;
	//   27   45:aload_0         
	//   28   46:aconst_null     
	//   29   47:putfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
		mHost = null;
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:putfield        #324 <Field FragmentHostCallback mHost>
		mFragmentId = 0;
	//   33   55:aload_0         
	//   34   56:iconst_0        
	//   35   57:putfield        #236 <Field int mFragmentId>
		mContainerId = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #246 <Field int mContainerId>
		mTag = null;
	//   39   65:aload_0         
	//   40   66:aconst_null     
	//   41   67:putfield        #250 <Field String mTag>
		mHidden = false;
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:putfield        #295 <Field boolean mHidden>
		mDetached = false;
	//   45   75:aload_0         
	//   46   76:iconst_0        
	//   47   77:putfield        #299 <Field boolean mDetached>
		mRetaining = false;
	//   48   80:aload_0         
	//   49   81:iconst_0        
	//   50   82:putfield        #313 <Field boolean mRetaining>
		mLoaderManager = null;
	//   51   85:aload_0         
	//   52   86:aconst_null     
	//   53   87:putfield        #383 <Field LoaderManagerImpl mLoaderManager>
		mLoadersStarted = false;
	//   54   90:aload_0         
	//   55   91:iconst_0        
	//   56   92:putfield        #526 <Field boolean mLoadersStarted>
		mCheckedForLoaderManager = false;
	//   57   95:aload_0         
	//   58   96:iconst_0        
	//   59   97:putfield        #524 <Field boolean mCheckedForLoaderManager>
	//   60  100:return          
	}

	void instantiateChildFragmentManager()
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       18
		{
			throw new IllegalStateException("Fragment has not been attached yet.");
	//    3    7:new             #516 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #600 <String "Fragment has not been attached yet.">
	//    6   14:invokespecial   #522 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mChildFragmentManager = new FragmentManagerImpl();
	//    8   18:aload_0         
	//    9   19:new             #402 <Class FragmentManagerImpl>
	//   10   22:dup             
	//   11   23:invokespecial   #601 <Method void FragmentManagerImpl()>
	//   12   26:putfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
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
	//   14   30:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   15   33:aload_0         
	//   16   34:getfield        #324 <Field FragmentHostCallback mHost>
	//   17   37:new             #12  <Class Fragment$2>
	//   18   40:dup             
	//   19   41:aload_0         
	//   20   42:invokespecial   #603 <Method void Fragment$2(Fragment)>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #607 <Method void FragmentManagerImpl.attachController(FragmentHostCallback, FragmentContainer, Fragment)>
			return;
	//   23   49:return          
		}
	}

	public final boolean isAdded()
	{
		return mHost != null && mAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #274 <Field boolean mAdded>
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
	//    1    1:getfield        #299 <Field boolean mDetached>
	//    2    4:ireturn         
	}

	public final boolean isHidden()
	{
		return mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field boolean mHidden>
	//    2    4:ireturn         
	}

	boolean isHideReplaced()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mIsHideReplaced;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #614 <Field boolean Fragment$AnimationInfo.mIsHideReplaced>
	//    8   16:ireturn         
	}

	final boolean isInBackStack()
	{
		return mBackStackNesting > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field int mBackStackNesting>
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
	//    1    1:getfield        #289 <Field boolean mInLayout>
	//    2    4:ireturn         
	}

	public final boolean isMenuVisible()
	{
		return mMenuVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field boolean mMenuVisible>
	//    2    4:ireturn         
	}

	boolean isPostponed()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mAnimationInfo.mEnterTransitionPostponed;
	//    5    9:aload_0         
	//    6   10:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//    7   13:getfield        #134 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//    8   16:ireturn         
	}

	public final boolean isRemoving()
	{
		return mRemoving;
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field boolean mRemoving>
	//    2    4:ireturn         
	}

	public final boolean isResumed()
	{
		return mState >= 5;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int mState>
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
	//*   1    1:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mFragmentManager.isStateSaved();
	//    5    9:aload_0         
	//    6   10:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//    7   13:invokevirtual   #623 <Method boolean FragmentManagerImpl.isStateSaved()>
	//    8   16:ireturn         
	}

	public final boolean isVisible()
	{
		return isAdded() && !isHidden() && mView != null && mView.getWindowToken() != null && mView.getVisibility() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #626 <Method boolean isAdded()>
	//    2    4:ifeq            43
	//    3    7:aload_0         
	//    4    8:invokevirtual   #628 <Method boolean isHidden()>
	//    5   11:ifne            43
	//    6   14:aload_0         
	//    7   15:getfield        #364 <Field View mView>
	//    8   18:ifnull          43
	//    9   21:aload_0         
	//   10   22:getfield        #364 <Field View mView>
	//   11   25:invokevirtual   #634 <Method android.os.IBinder View.getWindowToken()>
	//   12   28:ifnull          43
	//   13   31:aload_0         
	//   14   32:getfield        #364 <Field View mView>
	//   15   35:invokevirtual   #637 <Method int View.getVisibility()>
	//   16   38:ifne            43
	//   17   41:iconst_1        
	//   18   42:ireturn         
	//   19   43:iconst_0        
	//   20   44:ireturn         
	}

	public void onActivityCreated(Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #641 <Field boolean mCalled>
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
	//    2    2:putfield        #641 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onAttach(Context context)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #641 <Field boolean mCalled>
		if(mHost == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #324 <Field FragmentHostCallback mHost>
	//*   5    9:ifnonnull       17
			context = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		else
	//*   8   14:goto            25
			context = ((Context) (mHost.getActivity()));
	//    9   17:aload_0         
	//   10   18:getfield        #324 <Field FragmentHostCallback mHost>
	//   11   21:invokevirtual   #421 <Method Activity FragmentHostCallback.getActivity()>
	//   12   24:astore_1        
		if(context != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          39
		{
			mCalled = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #641 <Field boolean mCalled>
			onAttach(((Activity) (context)));
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #650 <Method void onAttach(Activity)>
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
	//    2    2:putfield        #641 <Field boolean mCalled>
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
	//    2    2:putfield        #641 <Field boolean mCalled>
		restoreChildFragmentState(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #659 <Method void restoreChildFragmentState(Bundle)>
		if(mChildFragmentManager != null && !mChildFragmentManager.isStateAtLeast(1))
	//*   6   10:aload_0         
	//*   7   11:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   8   14:ifnull          35
	//*   9   17:aload_0         
	//*  10   18:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  11   21:iconst_1        
	//*  12   22:invokevirtual   #663 <Method boolean FragmentManagerImpl.isStateAtLeast(int)>
	//*  13   25:ifne            35
			mChildFragmentManager.dispatchCreate();
	//   14   28:aload_0         
	//   15   29:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   16   32:invokevirtual   #460 <Method void FragmentManagerImpl.dispatchCreate()>
	//   17   35:return          
	}

	public Animation onCreateAnimation(int i, boolean flag, int j)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
	{
		getActivity().onCreateContextMenu(contextmenu, view, contextmenuinfo);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #669 <Method FragmentActivity getActivity()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #671 <Method void FragmentActivity.onCreateContextMenu(ContextMenu, View, android.view.ContextMenu$ContextMenuInfo)>
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
	//    2    2:putfield        #641 <Field boolean mCalled>
		if(!mCheckedForLoaderManager)
	//*   3    5:aload_0         
	//*   4    6:getfield        #524 <Field boolean mCheckedForLoaderManager>
	//*   5    9:ifne            37
		{
			mCheckedForLoaderManager = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #524 <Field boolean mCheckedForLoaderManager>
			mLoaderManager = mHost.getLoaderManager(mWho, mLoadersStarted, false);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #324 <Field FragmentHostCallback mHost>
	//   12   22:aload_0         
	//   13   23:getfield        #264 <Field String mWho>
	//   14   26:aload_0         
	//   15   27:getfield        #526 <Field boolean mLoadersStarted>
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #529 <Method LoaderManagerImpl FragmentHostCallback.getLoaderManager(String, boolean, boolean)>
	//   18   34:putfield        #383 <Field LoaderManagerImpl mLoaderManager>
		}
		if(mLoaderManager != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//*  21   41:ifnull          51
			mLoaderManager.doDestroy();
	//   22   44:aload_0         
	//   23   45:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//   24   48:invokevirtual   #679 <Method void LoaderManagerImpl.doDestroy()>
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
	//    2    2:putfield        #641 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onDetach()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #641 <Field boolean mCalled>
	//    3    5:return          
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
	//    2    2:putfield        #641 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onInflate(Context context, AttributeSet attributeset, Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #641 <Field boolean mCalled>
		if(mHost == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #324 <Field FragmentHostCallback mHost>
	//*   5    9:ifnonnull       17
			context = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		else
	//*   8   14:goto            25
			context = ((Context) (mHost.getActivity()));
	//    9   17:aload_0         
	//   10   18:getfield        #324 <Field FragmentHostCallback mHost>
	//   11   21:invokevirtual   #421 <Method Activity FragmentHostCallback.getActivity()>
	//   12   24:astore_1        
		if(context != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          41
		{
			mCalled = false;
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:putfield        #641 <Field boolean mCalled>
			onInflate(((Activity) (context)), attributeset, bundle);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:aload_2         
	//   21   37:aload_3         
	//   22   38:invokevirtual   #688 <Method void onInflate(Activity, AttributeSet, Bundle)>
		}
	//   23   41:return          
	}

	public void onLowMemory()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #641 <Field boolean mCalled>
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
	//    2    2:putfield        #641 <Field boolean mCalled>
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
	//    2    2:putfield        #641 <Field boolean mCalled>
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
	//    2    2:putfield        #641 <Field boolean mCalled>
		if(!mLoadersStarted)
	//*   3    5:aload_0         
	//*   4    6:getfield        #526 <Field boolean mLoadersStarted>
	//*   5    9:ifne            63
		{
			mLoadersStarted = true;
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:putfield        #526 <Field boolean mLoadersStarted>
			if(!mCheckedForLoaderManager)
	//*   9   17:aload_0         
	//*  10   18:getfield        #524 <Field boolean mCheckedForLoaderManager>
	//*  11   21:ifne            49
			{
				mCheckedForLoaderManager = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #524 <Field boolean mCheckedForLoaderManager>
				mLoaderManager = mHost.getLoaderManager(mWho, mLoadersStarted, false);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #324 <Field FragmentHostCallback mHost>
	//   18   34:aload_0         
	//   19   35:getfield        #264 <Field String mWho>
	//   20   38:aload_0         
	//   21   39:getfield        #526 <Field boolean mLoadersStarted>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #529 <Method LoaderManagerImpl FragmentHostCallback.getLoaderManager(String, boolean, boolean)>
	//   24   46:putfield        #383 <Field LoaderManagerImpl mLoaderManager>
			}
			if(mLoaderManager != null)
	//*  25   49:aload_0         
	//*  26   50:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//*  27   53:ifnull          63
				mLoaderManager.doStart();
	//   28   56:aload_0         
	//   29   57:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//   30   60:invokevirtual   #705 <Method void LoaderManagerImpl.doStart()>
		}
	//   31   63:return          
	}

	public void onStop()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #641 <Field boolean mCalled>
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
	//    2    2:putfield        #641 <Field boolean mCalled>
	//    3    5:return          
	}

	FragmentManager peekChildFragmentManager()
	{
		return ((FragmentManager) (mChildFragmentManager));
	//    0    0:aload_0         
	//    1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:areturn         
	}

	void performActivityCreated(Bundle bundle)
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #714 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mState = 2;
	//    6   14:aload_0         
	//    7   15:iconst_2        
	//    8   16:putfield        #116 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #641 <Field boolean mCalled>
		onActivityCreated(bundle);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #716 <Method void onActivityCreated(Bundle)>
		if(!mCalled)
	//*  15   29:aload_0         
	//*  16   30:getfield        #641 <Field boolean mCalled>
	//*  17   33:ifne            70
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onActivityCreated()").toString());
	//   18   36:new             #718 <Class SuperNotCalledException>
	//   19   39:dup             
	//   20   40:new             #199 <Class StringBuilder>
	//   21   43:dup             
	//   22   44:invokespecial   #200 <Method void StringBuilder()>
	//   23   47:ldc2            #518 <String "Fragment ">
	//   24   50:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:aload_0         
	//   26   54:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   27   57:ldc2            #720 <String " did not call through to super.onActivityCreated()">
	//   28   60:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   30   66:invokespecial   #721 <Method void SuperNotCalledException(String)>
	//   31   69:athrow          
		if(mChildFragmentManager != null)
	//*  32   70:aload_0         
	//*  33   71:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  34   74:ifnull          84
			mChildFragmentManager.dispatchActivityCreated();
	//   35   77:aload_0         
	//   36   78:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   37   81:invokevirtual   #457 <Method void FragmentManagerImpl.dispatchActivityCreated()>
	//   38   84:return          
	}

	void performConfigurationChanged(Configuration configuration)
	{
		onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #724 <Method void onConfigurationChanged(Configuration)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          20
			mChildFragmentManager.dispatchConfigurationChanged(configuration);
	//    6   12:aload_0         
	//    7   13:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #727 <Method void FragmentManagerImpl.dispatchConfigurationChanged(Configuration)>
	//   10   20:return          
	}

	boolean performContextItemSelected(MenuItem menuitem)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #295 <Field boolean mHidden>
	//*   2    4:ifne            37
		{
			if(onContextItemSelected(menuitem))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #730 <Method boolean onContextItemSelected(MenuItem)>
	//*   6   12:ifeq            17
				return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
			if(mChildFragmentManager != null && mChildFragmentManager.dispatchContextItemSelected(menuitem))
	//*   9   17:aload_0         
	//*  10   18:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  11   21:ifnull          37
	//*  12   24:aload_0         
	//*  13   25:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #733 <Method boolean FragmentManagerImpl.dispatchContextItemSelected(MenuItem)>
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
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #714 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mState = 1;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #116 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #641 <Field boolean mCalled>
		onCreate(bundle);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #736 <Method void onCreate(Bundle)>
		if(!mCalled)
	//*  15   29:aload_0         
	//*  16   30:getfield        #641 <Field boolean mCalled>
	//*  17   33:ifne            70
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onCreate()").toString());
	//   18   36:new             #718 <Class SuperNotCalledException>
	//   19   39:dup             
	//   20   40:new             #199 <Class StringBuilder>
	//   21   43:dup             
	//   22   44:invokespecial   #200 <Method void StringBuilder()>
	//   23   47:ldc2            #518 <String "Fragment ">
	//   24   50:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   25   53:aload_0         
	//   26   54:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   27   57:ldc2            #738 <String " did not call through to super.onCreate()">
	//   28   60:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   30   66:invokespecial   #721 <Method void SuperNotCalledException(String)>
	//   31   69:athrow          
		else
			return;
	//   32   70:return          
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
	//*   5    7:getfield        #295 <Field boolean mHidden>
	//*   6   10:ifne            64
		{
			boolean flag = flag2;
	//    7   13:iload           5
	//    8   15:istore_3        
			if(mHasMenu)
	//*   9   16:aload_0         
	//*  10   17:getfield        #305 <Field boolean mHasMenu>
	//*  11   20:ifeq            41
			{
				flag = flag2;
	//   12   23:iload           5
	//   13   25:istore_3        
				if(mMenuVisible)
	//*  14   26:aload_0         
	//*  15   27:getfield        #122 <Field boolean mMenuVisible>
	//*  16   30:ifeq            41
				{
					flag = true;
	//   17   33:iconst_1        
	//   18   34:istore_3        
					onCreateOptionsMenu(menu, menuinflater);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #742 <Method void onCreateOptionsMenu(Menu, MenuInflater)>
				}
			}
			flag1 = flag;
	//   23   41:iload_3         
	//   24   42:istore          4
			if(mChildFragmentManager != null)
	//*  25   44:aload_0         
	//*  26   45:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  27   48:ifnull          64
				flag1 = flag | mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuinflater);
	//   28   51:iload_3         
	//   29   52:aload_0         
	//   30   53:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   31   56:aload_1         
	//   32   57:aload_2         
	//   33   58:invokevirtual   #745 <Method boolean FragmentManagerImpl.dispatchCreateOptionsMenu(Menu, MenuInflater)>
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
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #714 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mPerformedCreateView = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #748 <Field boolean mPerformedCreateView>
		return onCreateView(layoutinflater, viewgroup, bundle);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #750 <Method View onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//   14   26:areturn         
	}

	void performDestroy()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchDestroy();
	//    3    7:aload_0         
	//    4    8:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #754 <Method void FragmentManagerImpl.dispatchDestroy()>
		mState = 0;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #116 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #641 <Field boolean mCalled>
		onDestroy();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #756 <Method void onDestroy()>
		if(!mCalled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #641 <Field boolean mCalled>
	//*  16   32:ifne            69
		{
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onDestroy()").toString());
	//   17   35:new             #718 <Class SuperNotCalledException>
	//   18   38:dup             
	//   19   39:new             #199 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #200 <Method void StringBuilder()>
	//   22   46:ldc2            #518 <String "Fragment ">
	//   23   49:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_0         
	//   25   53:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:ldc2            #758 <String " did not call through to super.onDestroy()">
	//   27   59:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   29   65:invokespecial   #721 <Method void SuperNotCalledException(String)>
	//   30   68:athrow          
		} else
		{
			mChildFragmentManager = null;
	//   31   69:aload_0         
	//   32   70:aconst_null     
	//   33   71:putfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
			return;
	//   34   74:return          
		}
	}

	void performDestroyView()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchDestroyView();
	//    3    7:aload_0         
	//    4    8:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #762 <Method void FragmentManagerImpl.dispatchDestroyView()>
		mState = 1;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #116 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #641 <Field boolean mCalled>
		onDestroyView();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #764 <Method void onDestroyView()>
		if(!mCalled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #641 <Field boolean mCalled>
	//*  16   32:ifne            69
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onDestroyView()").toString());
	//   17   35:new             #718 <Class SuperNotCalledException>
	//   18   38:dup             
	//   19   39:new             #199 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #200 <Method void StringBuilder()>
	//   22   46:ldc2            #518 <String "Fragment ">
	//   23   49:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_0         
	//   25   53:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:ldc2            #766 <String " did not call through to super.onDestroyView()">
	//   27   59:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   29   65:invokespecial   #721 <Method void SuperNotCalledException(String)>
	//   30   68:athrow          
		if(mLoaderManager != null)
	//*  31   69:aload_0         
	//*  32   70:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//*  33   73:ifnull          83
			mLoaderManager.doReportNextStart();
	//   34   76:aload_0         
	//   35   77:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//   36   80:invokevirtual   #769 <Method void LoaderManagerImpl.doReportNextStart()>
		mPerformedCreateView = false;
	//   37   83:aload_0         
	//   38   84:iconst_0        
	//   39   85:putfield        #748 <Field boolean mPerformedCreateView>
	//   40   88:return          
	}

	void performDetach()
	{
		mCalled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #641 <Field boolean mCalled>
		onDetach();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #772 <Method void onDetach()>
		if(!mCalled)
	//*   5    9:aload_0         
	//*   6   10:getfield        #641 <Field boolean mCalled>
	//*   7   13:ifne            50
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onDetach()").toString());
	//    8   16:new             #718 <Class SuperNotCalledException>
	//    9   19:dup             
	//   10   20:new             #199 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #200 <Method void StringBuilder()>
	//   13   27:ldc2            #518 <String "Fragment ">
	//   14   30:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_0         
	//   16   34:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   17   37:ldc2            #774 <String " did not call through to super.onDetach()">
	//   18   40:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   19   43:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   20   46:invokespecial   #721 <Method void SuperNotCalledException(String)>
	//   21   49:athrow          
		if(mChildFragmentManager != null)
	//*  22   50:aload_0         
	//*  23   51:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  24   54:ifnull          116
		{
			if(!mRetaining)
	//*  25   57:aload_0         
	//*  26   58:getfield        #313 <Field boolean mRetaining>
	//*  27   61:ifne            104
				throw new IllegalStateException((new StringBuilder()).append("Child FragmentManager of ").append(((Object) (this))).append(" was not ").append(" destroyed and this fragment is not retaining instance").toString());
	//   28   64:new             #516 <Class IllegalStateException>
	//   29   67:dup             
	//   30   68:new             #199 <Class StringBuilder>
	//   31   71:dup             
	//   32   72:invokespecial   #200 <Method void StringBuilder()>
	//   33   75:ldc2            #776 <String "Child FragmentManager of ">
	//   34   78:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   35   81:aload_0         
	//   36   82:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   37   85:ldc2            #778 <String " was not ">
	//   38   88:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   39   91:ldc2            #780 <String " destroyed and this fragment is not retaining instance">
	//   40   94:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   41   97:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   42  100:invokespecial   #522 <Method void IllegalStateException(String)>
	//   43  103:athrow          
			mChildFragmentManager.dispatchDestroy();
	//   44  104:aload_0         
	//   45  105:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   46  108:invokevirtual   #754 <Method void FragmentManagerImpl.dispatchDestroy()>
			mChildFragmentManager = null;
	//   47  111:aload_0         
	//   48  112:aconst_null     
	//   49  113:putfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
		}
	//   50  116:return          
	}

	void performLowMemory()
	{
		onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #783 <Method void onLowMemory()>
		if(mChildFragmentManager != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   4    8:ifnull          18
			mChildFragmentManager.dispatchLowMemory();
	//    5   11:aload_0         
	//    6   12:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    7   15:invokevirtual   #786 <Method void FragmentManagerImpl.dispatchLowMemory()>
	//    8   18:return          
	}

	void performMultiWindowModeChanged(boolean flag)
	{
		onMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #789 <Method void onMultiWindowModeChanged(boolean)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          20
			mChildFragmentManager.dispatchMultiWindowModeChanged(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #792 <Method void FragmentManagerImpl.dispatchMultiWindowModeChanged(boolean)>
	//   10   20:return          
	}

	boolean performOptionsItemSelected(MenuItem menuitem)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #295 <Field boolean mHidden>
	//*   2    4:ifne            51
		{
			if(mHasMenu && mMenuVisible && onOptionsItemSelected(menuitem))
	//*   3    7:aload_0         
	//*   4    8:getfield        #305 <Field boolean mHasMenu>
	//*   5   11:ifeq            31
	//*   6   14:aload_0         
	//*   7   15:getfield        #122 <Field boolean mMenuVisible>
	//*   8   18:ifeq            31
	//*   9   21:aload_0         
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #795 <Method boolean onOptionsItemSelected(MenuItem)>
	//*  12   26:ifeq            31
				return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
			if(mChildFragmentManager != null && mChildFragmentManager.dispatchOptionsItemSelected(menuitem))
	//*  15   31:aload_0         
	//*  16   32:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  17   35:ifnull          51
	//*  18   38:aload_0         
	//*  19   39:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  20   42:aload_1         
	//*  21   43:invokevirtual   #798 <Method boolean FragmentManagerImpl.dispatchOptionsItemSelected(MenuItem)>
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
	//*   1    1:getfield        #295 <Field boolean mHidden>
	//*   2    4:ifne            41
		{
			if(mHasMenu && mMenuVisible)
	//*   3    7:aload_0         
	//*   4    8:getfield        #305 <Field boolean mHasMenu>
	//*   5   11:ifeq            26
	//*   6   14:aload_0         
	//*   7   15:getfield        #122 <Field boolean mMenuVisible>
	//*   8   18:ifeq            26
				onOptionsMenuClosed(menu);
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokevirtual   #801 <Method void onOptionsMenuClosed(Menu)>
			if(mChildFragmentManager != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  14   30:ifnull          41
				mChildFragmentManager.dispatchOptionsMenuClosed(menu);
	//   15   33:aload_0         
	//   16   34:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #804 <Method void FragmentManagerImpl.dispatchOptionsMenuClosed(Menu)>
		}
	//   19   41:return          
	}

	void performPause()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchPause();
	//    3    7:aload_0         
	//    4    8:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #808 <Method void FragmentManagerImpl.dispatchPause()>
		mState = 4;
	//    6   14:aload_0         
	//    7   15:iconst_4        
	//    8   16:putfield        #116 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #641 <Field boolean mCalled>
		onPause();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #810 <Method void onPause()>
		if(!mCalled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #641 <Field boolean mCalled>
	//*  16   32:ifne            69
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onPause()").toString());
	//   17   35:new             #718 <Class SuperNotCalledException>
	//   18   38:dup             
	//   19   39:new             #199 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #200 <Method void StringBuilder()>
	//   22   46:ldc2            #518 <String "Fragment ">
	//   23   49:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_0         
	//   25   53:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:ldc2            #812 <String " did not call through to super.onPause()">
	//   27   59:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   29   65:invokespecial   #721 <Method void SuperNotCalledException(String)>
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
	//    2    2:invokevirtual   #815 <Method void onPictureInPictureModeChanged(boolean)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          20
			mChildFragmentManager.dispatchPictureInPictureModeChanged(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #818 <Method void FragmentManagerImpl.dispatchPictureInPictureModeChanged(boolean)>
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
	//*   5    6:getfield        #295 <Field boolean mHidden>
	//*   6    9:ifne            59
		{
			boolean flag = flag2;
	//    7   12:iload           4
	//    8   14:istore_2        
			if(mHasMenu)
	//*   9   15:aload_0         
	//*  10   16:getfield        #305 <Field boolean mHasMenu>
	//*  11   19:ifeq            39
			{
				flag = flag2;
	//   12   22:iload           4
	//   13   24:istore_2        
				if(mMenuVisible)
	//*  14   25:aload_0         
	//*  15   26:getfield        #122 <Field boolean mMenuVisible>
	//*  16   29:ifeq            39
				{
					flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_2        
					onPrepareOptionsMenu(menu);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:invokevirtual   #822 <Method void onPrepareOptionsMenu(Menu)>
				}
			}
			flag1 = flag;
	//   22   39:iload_2         
	//   23   40:istore_3        
			if(mChildFragmentManager != null)
	//*  24   41:aload_0         
	//*  25   42:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  26   45:ifnull          59
				flag1 = flag | mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
	//   27   48:iload_2         
	//   28   49:aload_0         
	//   29   50:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   30   53:aload_1         
	//   31   54:invokevirtual   #825 <Method boolean FragmentManagerImpl.dispatchPrepareOptionsMenu(Menu)>
	//   32   57:ior             
	//   33   58:istore_3        
		}
		return flag1;
	//   34   59:iload_3         
	//   35   60:ireturn         
	}

	void performReallyStop()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchReallyStop();
	//    3    7:aload_0         
	//    4    8:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #829 <Method void FragmentManagerImpl.dispatchReallyStop()>
		mState = 2;
	//    6   14:aload_0         
	//    7   15:iconst_2        
	//    8   16:putfield        #116 <Field int mState>
		if(mLoadersStarted)
	//*   9   19:aload_0         
	//*  10   20:getfield        #526 <Field boolean mLoadersStarted>
	//*  11   23:ifeq            95
		{
			mLoadersStarted = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #526 <Field boolean mLoadersStarted>
			if(!mCheckedForLoaderManager)
	//*  15   31:aload_0         
	//*  16   32:getfield        #524 <Field boolean mCheckedForLoaderManager>
	//*  17   35:ifne            63
			{
				mCheckedForLoaderManager = true;
	//   18   38:aload_0         
	//   19   39:iconst_1        
	//   20   40:putfield        #524 <Field boolean mCheckedForLoaderManager>
				mLoaderManager = mHost.getLoaderManager(mWho, mLoadersStarted, false);
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #324 <Field FragmentHostCallback mHost>
	//   24   48:aload_0         
	//   25   49:getfield        #264 <Field String mWho>
	//   26   52:aload_0         
	//   27   53:getfield        #526 <Field boolean mLoadersStarted>
	//   28   56:iconst_0        
	//   29   57:invokevirtual   #529 <Method LoaderManagerImpl FragmentHostCallback.getLoaderManager(String, boolean, boolean)>
	//   30   60:putfield        #383 <Field LoaderManagerImpl mLoaderManager>
			}
			if(mLoaderManager != null)
	//*  31   63:aload_0         
	//*  32   64:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//*  33   67:ifnull          95
			{
				if(mHost.getRetainLoaders())
	//*  34   70:aload_0         
	//*  35   71:getfield        #324 <Field FragmentHostCallback mHost>
	//*  36   74:invokevirtual   #832 <Method boolean FragmentHostCallback.getRetainLoaders()>
	//*  37   77:ifeq            88
				{
					mLoaderManager.doRetain();
	//   38   80:aload_0         
	//   39   81:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//   40   84:invokevirtual   #835 <Method void LoaderManagerImpl.doRetain()>
					return;
	//   41   87:return          
				}
				mLoaderManager.doStop();
	//   42   88:aload_0         
	//   43   89:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//   44   92:invokevirtual   #838 <Method void LoaderManagerImpl.doStop()>
			}
		}
	//   45   95:return          
	}

	void performResume()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          22
		{
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #714 <Method void FragmentManagerImpl.noteStateNotSaved()>
			mChildFragmentManager.execPendingActions();
	//    6   14:aload_0         
	//    7   15:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   18:invokevirtual   #842 <Method boolean FragmentManagerImpl.execPendingActions()>
	//    9   21:pop             
		}
		mState = 5;
	//   10   22:aload_0         
	//   11   23:iconst_5        
	//   12   24:putfield        #116 <Field int mState>
		mCalled = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #641 <Field boolean mCalled>
		onResume();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #844 <Method void onResume()>
		if(!mCalled)
	//*  18   36:aload_0         
	//*  19   37:getfield        #641 <Field boolean mCalled>
	//*  20   40:ifne            77
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onResume()").toString());
	//   21   43:new             #718 <Class SuperNotCalledException>
	//   22   46:dup             
	//   23   47:new             #199 <Class StringBuilder>
	//   24   50:dup             
	//   25   51:invokespecial   #200 <Method void StringBuilder()>
	//   26   54:ldc2            #518 <String "Fragment ">
	//   27   57:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:aload_0         
	//   29   61:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   30   64:ldc2            #846 <String " did not call through to super.onResume()">
	//   31   67:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   33   73:invokespecial   #721 <Method void SuperNotCalledException(String)>
	//   34   76:athrow          
		if(mChildFragmentManager != null)
	//*  35   77:aload_0         
	//*  36   78:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  37   81:ifnull          99
		{
			mChildFragmentManager.dispatchResume();
	//   38   84:aload_0         
	//   39   85:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   40   88:invokevirtual   #451 <Method void FragmentManagerImpl.dispatchResume()>
			mChildFragmentManager.execPendingActions();
	//   41   91:aload_0         
	//   42   92:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   43   95:invokevirtual   #842 <Method boolean FragmentManagerImpl.execPendingActions()>
	//   44   98:pop             
		}
	//   45   99:return          
	}

	void performSaveInstanceState(Bundle bundle)
	{
		onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #849 <Method void onSaveInstanceState(Bundle)>
		if(mChildFragmentManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   5    9:ifnull          32
		{
			Parcelable parcelable = mChildFragmentManager.saveAllState();
	//    6   12:aload_0         
	//    7   13:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   16:invokevirtual   #853 <Method Parcelable FragmentManagerImpl.saveAllState()>
	//    9   19:astore_2        
			if(parcelable != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          32
				bundle.putParcelable("android:support:fragments", parcelable);
	//   12   24:aload_1         
	//   13   25:ldc2            #855 <String "android:support:fragments">
	//   14   28:aload_2         
	//   15   29:invokevirtual   #859 <Method void Bundle.putParcelable(String, Parcelable)>
		}
	//   16   32:return          
	}

	void performStart()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          22
		{
			mChildFragmentManager.noteStateNotSaved();
	//    3    7:aload_0         
	//    4    8:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #714 <Method void FragmentManagerImpl.noteStateNotSaved()>
			mChildFragmentManager.execPendingActions();
	//    6   14:aload_0         
	//    7   15:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   18:invokevirtual   #842 <Method boolean FragmentManagerImpl.execPendingActions()>
	//    9   21:pop             
		}
		mState = 4;
	//   10   22:aload_0         
	//   11   23:iconst_4        
	//   12   24:putfield        #116 <Field int mState>
		mCalled = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #641 <Field boolean mCalled>
		onStart();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #862 <Method void onStart()>
		if(!mCalled)
	//*  18   36:aload_0         
	//*  19   37:getfield        #641 <Field boolean mCalled>
	//*  20   40:ifne            77
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onStart()").toString());
	//   21   43:new             #718 <Class SuperNotCalledException>
	//   22   46:dup             
	//   23   47:new             #199 <Class StringBuilder>
	//   24   50:dup             
	//   25   51:invokespecial   #200 <Method void StringBuilder()>
	//   26   54:ldc2            #518 <String "Fragment ">
	//   27   57:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:aload_0         
	//   29   61:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   30   64:ldc2            #864 <String " did not call through to super.onStart()">
	//   31   67:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   33   73:invokespecial   #721 <Method void SuperNotCalledException(String)>
	//   34   76:athrow          
		if(mChildFragmentManager != null)
	//*  35   77:aload_0         
	//*  36   78:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  37   81:ifnull          91
			mChildFragmentManager.dispatchStart();
	//   38   84:aload_0         
	//   39   85:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   40   88:invokevirtual   #454 <Method void FragmentManagerImpl.dispatchStart()>
		if(mLoaderManager != null)
	//*  41   91:aload_0         
	//*  42   92:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//*  43   95:ifnull          105
			mLoaderManager.doReportStart();
	//   44   98:aload_0         
	//   45   99:getfield        #383 <Field LoaderManagerImpl mLoaderManager>
	//   46  102:invokevirtual   #867 <Method void LoaderManagerImpl.doReportStart()>
	//   47  105:return          
	}

	void performStop()
	{
		if(mChildFragmentManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnull          14
			mChildFragmentManager.dispatchStop();
	//    3    7:aload_0         
	//    4    8:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//    5   11:invokevirtual   #871 <Method void FragmentManagerImpl.dispatchStop()>
		mState = 3;
	//    6   14:aload_0         
	//    7   15:iconst_3        
	//    8   16:putfield        #116 <Field int mState>
		mCalled = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #641 <Field boolean mCalled>
		onStop();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #873 <Method void onStop()>
		if(!mCalled)
	//*  14   28:aload_0         
	//*  15   29:getfield        #641 <Field boolean mCalled>
	//*  16   32:ifne            69
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onStop()").toString());
	//   17   35:new             #718 <Class SuperNotCalledException>
	//   18   38:dup             
	//   19   39:new             #199 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #200 <Method void StringBuilder()>
	//   22   46:ldc2            #518 <String "Fragment ">
	//   23   49:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:aload_0         
	//   25   53:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:ldc2            #875 <String " did not call through to super.onStop()">
	//   27   59:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   29   65:invokespecial   #721 <Method void SuperNotCalledException(String)>
	//   30   68:athrow          
		else
			return;
	//   31   69:return          
	}

	public void postponeEnterTransition()
	{
		ensureAnimationInfo().mEnterTransitionPostponed = true;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iconst_1        
	//    3    5:putfield        #134 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//    4    8:return          
	}

	public void registerForContextMenu(View view)
	{
		view.setOnCreateContextMenuListener(((android.view.View.OnCreateContextMenuListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #884 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
	//    3    5:return          
	}

	public final void requestPermissions(String as[], int i)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       41
		{
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    3    7:new             #516 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #199 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #200 <Method void StringBuilder()>
	//    8   18:ldc2            #518 <String "Fragment ">
	//    9   21:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #520 <String " not attached to Activity">
	//   13   31:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #522 <Method void IllegalStateException(String)>
	//   16   40:athrow          
		} else
		{
			mHost.onRequestPermissionsFromFragment(this, as, i);
	//   17   41:aload_0         
	//   18   42:getfield        #324 <Field FragmentHostCallback mHost>
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:iload_2         
	//   22   48:invokevirtual   #890 <Method void FragmentHostCallback.onRequestPermissionsFromFragment(Fragment, String[], int)>
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
	//    3    5:ldc2            #855 <String "android:support:fragments">
	//    4    8:invokevirtual   #894 <Method Parcelable Bundle.getParcelable(String)>
	//    5   11:astore_1        
			if(bundle != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          51
			{
				if(mChildFragmentManager == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//*  10   20:ifnonnull       27
					instantiateChildFragmentManager();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #448 <Method void instantiateChildFragmentManager()>
				mChildFragmentManager.restoreAllState(((Parcelable) (bundle)), mChildNonConfig);
	//   13   27:aload_0         
	//   14   28:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #896 <Field FragmentManagerNonConfig mChildNonConfig>
	//   18   36:invokevirtual   #900 <Method void FragmentManagerImpl.restoreAllState(Parcelable, FragmentManagerNonConfig)>
				mChildNonConfig = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #896 <Field FragmentManagerNonConfig mChildNonConfig>
				mChildFragmentManager.dispatchCreate();
	//   22   44:aload_0         
	//   23   45:getfield        #393 <Field FragmentManagerImpl mChildFragmentManager>
	//   24   48:invokevirtual   #460 <Method void FragmentManagerImpl.dispatchCreate()>
			}
		}
	//   25   51:return          
	}

	final void restoreViewState(Bundle bundle)
	{
		if(mSavedViewState != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #340 <Field SparseArray mSavedViewState>
	//*   2    4:ifnull          23
		{
			mInnerView.restoreHierarchyState(mSavedViewState);
	//    3    7:aload_0         
	//    4    8:getfield        #368 <Field View mInnerView>
	//    5   11:aload_0         
	//    6   12:getfield        #340 <Field SparseArray mSavedViewState>
	//    7   15:invokevirtual   #905 <Method void View.restoreHierarchyState(SparseArray)>
			mSavedViewState = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #340 <Field SparseArray mSavedViewState>
		}
		mCalled = false;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #641 <Field boolean mCalled>
		onViewStateRestored(bundle);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #907 <Method void onViewStateRestored(Bundle)>
		if(!mCalled)
	//*  17   33:aload_0         
	//*  18   34:getfield        #641 <Field boolean mCalled>
	//*  19   37:ifne            74
			throw new SuperNotCalledException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" did not call through to super.onViewStateRestored()").toString());
	//   20   40:new             #718 <Class SuperNotCalledException>
	//   21   43:dup             
	//   22   44:new             #199 <Class StringBuilder>
	//   23   47:dup             
	//   24   48:invokespecial   #200 <Method void StringBuilder()>
	//   25   51:ldc2            #518 <String "Fragment ">
	//   26   54:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:aload_0         
	//   28   58:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   29   61:ldc2            #909 <String " did not call through to super.onViewStateRestored()">
	//   30   64:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   31   67:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   32   70:invokespecial   #721 <Method void SuperNotCalledException(String)>
	//   33   73:athrow          
		else
			return;
	//   34   74:return          
	}

	public void setAllowEnterTransitionOverlap(boolean flag)
	{
		ensureAnimationInfo().mAllowEnterTransitionOverlap = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #914 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #918 <Method Boolean Fragment$AnimationInfo.access$602(Fragment$AnimationInfo, Boolean)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void setAllowReturnTransitionOverlap(boolean flag)
	{
		ensureAnimationInfo().mAllowReturnTransitionOverlap = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #914 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:invokestatic    #922 <Method Boolean Fragment$AnimationInfo.access$702(Fragment$AnimationInfo, Boolean)>
	//    5   11:pop             
	//    6   12:return          
	}

	void setAnimatingAway(View view)
	{
		ensureAnimationInfo().mAnimatingAway = view;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #441 <Field View Fragment$AnimationInfo.mAnimatingAway>
	//    4    8:return          
	}

	public void setArguments(Bundle bundle)
	{
		if(mIndex >= 0 && isStateSaved())
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field int mIndex>
	//*   2    4:iflt            25
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #924 <Method boolean isStateSaved()>
	//*   5   11:ifeq            25
		{
			throw new IllegalStateException("Fragment already active and state has been saved");
	//    6   14:new             #516 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #926 <String "Fragment already active and state has been saved">
	//    9   21:invokespecial   #522 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			mArguments = bundle;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #332 <Field Bundle mArguments>
			return;
	//   14   30:return          
		}
	}

	public void setEnterSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ensureAnimationInfo().mEnterTransitionCallback = sharedelementcallback;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #475 <Field SharedElementCallback Fragment$AnimationInfo.mEnterTransitionCallback>
	//    4    8:return          
	}

	public void setEnterTransition(Object obj)
	{
		ensureAnimationInfo().mEnterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #933 <Method Object Fragment$AnimationInfo.access$002(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setExitSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ensureAnimationInfo().mExitTransitionCallback = sharedelementcallback;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #483 <Field SharedElementCallback Fragment$AnimationInfo.mExitTransitionCallback>
	//    4    8:return          
	}

	public void setExitTransition(Object obj)
	{
		ensureAnimationInfo().mExitTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #938 <Method Object Fragment$AnimationInfo.access$202(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setHasOptionsMenu(boolean flag)
	{
		if(mHasMenu != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #305 <Field boolean mHasMenu>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          34
		{
			mHasMenu = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #305 <Field boolean mHasMenu>
			if(isAdded() && !isHidden())
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #626 <Method boolean isAdded()>
	//*   9   17:ifeq            34
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #628 <Method boolean isHidden()>
	//*  12   24:ifne            34
				mHost.onSupportInvalidateOptionsMenu();
	//   13   27:aload_0         
	//   14   28:getfield        #324 <Field FragmentHostCallback mHost>
	//   15   31:invokevirtual   #942 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
		}
	//   16   34:return          
	}

	void setHideReplaced(boolean flag)
	{
		ensureAnimationInfo().mIsHideReplaced = flag;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:putfield        #614 <Field boolean Fragment$AnimationInfo.mIsHideReplaced>
	//    4    8:return          
	}

	final void setIndex(int i, Fragment fragment)
	{
		mIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #118 <Field int mIndex>
		if(fragment != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          44
		{
			mWho = (new StringBuilder()).append(fragment.mWho).append(":").append(mIndex).toString();
	//    5    9:aload_0         
	//    6   10:new             #199 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #200 <Method void StringBuilder()>
	//    9   17:aload_2         
	//   10   18:getfield        #264 <Field String mWho>
	//   11   21:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:ldc2            #400 <String ":">
	//   13   27:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:aload_0         
	//   15   31:getfield        #118 <Field int mIndex>
	//   16   34:invokevirtual   #948 <Method StringBuilder StringBuilder.append(int)>
	//   17   37:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   18   40:putfield        #264 <Field String mWho>
			return;
	//   19   43:return          
		} else
		{
			mWho = (new StringBuilder()).append("android:fragment:").append(mIndex).toString();
	//   20   44:aload_0         
	//   21   45:new             #199 <Class StringBuilder>
	//   22   48:dup             
	//   23   49:invokespecial   #200 <Method void StringBuilder()>
	//   24   52:ldc2            #950 <String "android:fragment:">
	//   25   55:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   26   58:aload_0         
	//   27   59:getfield        #118 <Field int mIndex>
	//   28   62:invokevirtual   #948 <Method StringBuilder StringBuilder.append(int)>
	//   29   65:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   30   68:putfield        #264 <Field String mWho>
			return;
	//   31   71:return          
		}
	}

	public void setInitialSavedState(SavedState savedstate)
	{
		if(mIndex >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field int mIndex>
	//*   2    4:iflt            18
			throw new IllegalStateException("Fragment already active");
	//    3    7:new             #516 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #954 <String "Fragment already active">
	//    6   14:invokespecial   #522 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(savedstate != null && savedstate.mState != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          37
	//*  10   22:aload_1         
	//*  11   23:getfield        #956 <Field Bundle Fragment$SavedState.mState>
	//*  12   26:ifnull          37
			savedstate = ((SavedState) (savedstate.mState));
	//   13   29:aload_1         
	//   14   30:getfield        #956 <Field Bundle Fragment$SavedState.mState>
	//   15   33:astore_1        
		else
	//*  16   34:goto            39
			savedstate = null;
	//   17   37:aconst_null     
	//   18   38:astore_1        
		mSavedFragmentState = ((Bundle) (savedstate));
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #336 <Field Bundle mSavedFragmentState>
	//   22   44:return          
	}

	public void setMenuVisibility(boolean flag)
	{
		if(mMenuVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #122 <Field boolean mMenuVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          41
		{
			mMenuVisible = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #122 <Field boolean mMenuVisible>
			if(mHasMenu && isAdded() && !isHidden())
	//*   7   13:aload_0         
	//*   8   14:getfield        #305 <Field boolean mHasMenu>
	//*   9   17:ifeq            41
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #626 <Method boolean isAdded()>
	//*  12   24:ifeq            41
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #628 <Method boolean isHidden()>
	//*  15   31:ifne            41
				mHost.onSupportInvalidateOptionsMenu();
	//   16   34:aload_0         
	//   17   35:getfield        #324 <Field FragmentHostCallback mHost>
	//   18   38:invokevirtual   #942 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
		}
	//   19   41:return          
	}

	void setNextAnim(int i)
	{
		if(mAnimationInfo == null && i == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
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
	//    7   13:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    8   16:iload_1         
	//    9   17:putfield        #532 <Field int Fragment$AnimationInfo.mNextAnim>
			return;
	//   10   20:return          
		}
	}

	void setNextTransition(int i, int j)
	{
		if(mAnimationInfo == null && i == 0 && j == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
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
	//    9   17:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//   10   20:pop             
			mAnimationInfo.mNextTransition = i;
	//   11   21:aload_0         
	//   12   22:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   13   25:iload_1         
	//   14   26:putfield        #536 <Field int Fragment$AnimationInfo.mNextTransition>
			mAnimationInfo.mNextTransitionStyle = j;
	//   15   29:aload_0         
	//   16   30:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   17   33:iload_2         
	//   18   34:putfield        #540 <Field int Fragment$AnimationInfo.mNextTransitionStyle>
			return;
	//   19   37:return          
		}
	}

	void setOnStartEnterTransitionListener(OnStartEnterTransitionListener onstartentertransitionlistener)
	{
		ensureAnimationInfo();
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:pop             
		if(onstartentertransitionlistener == mAnimationInfo.mStartEnterTransitionListener)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   6   10:getfield        #138 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//*   7   13:if_acmpne       17
			return;
	//    8   16:return          
		if(onstartentertransitionlistener != null && mAnimationInfo.mStartEnterTransitionListener != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          59
	//*  11   21:aload_0         
	//*  12   22:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*  13   25:getfield        #138 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//*  14   28:ifnull          59
			throw new IllegalStateException((new StringBuilder()).append("Trying to set a replacement startPostponedEnterTransition on ").append(((Object) (this))).toString());
	//   15   31:new             #516 <Class IllegalStateException>
	//   16   34:dup             
	//   17   35:new             #199 <Class StringBuilder>
	//   18   38:dup             
	//   19   39:invokespecial   #200 <Method void StringBuilder()>
	//   20   42:ldc2            #964 <String "Trying to set a replacement startPostponedEnterTransition on ">
	//   21   45:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:aload_0         
	//   23   49:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   24   52:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   25   55:invokespecial   #522 <Method void IllegalStateException(String)>
	//   26   58:athrow          
		if(mAnimationInfo.mEnterTransitionPostponed)
	//*  27   59:aload_0         
	//*  28   60:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//*  29   63:getfield        #134 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//*  30   66:ifeq            77
			mAnimationInfo.mStartEnterTransitionListener = onstartentertransitionlistener;
	//   31   69:aload_0         
	//   32   70:getfield        #131 <Field Fragment$AnimationInfo mAnimationInfo>
	//   33   73:aload_1         
	//   34   74:putfield        #138 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
		if(onstartentertransitionlistener != null)
	//*  35   77:aload_1         
	//*  36   78:ifnull          87
			onstartentertransitionlistener.startListening();
	//   37   81:aload_1         
	//   38   82:invokeinterface #967 <Method void Fragment$OnStartEnterTransitionListener.startListening()>
	//   39   87:return          
	}

	public void setReenterTransition(Object obj)
	{
		ensureAnimationInfo().mReenterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #971 <Method Object Fragment$AnimationInfo.access$302(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setRetainInstance(boolean flag)
	{
		mRetainInstance = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #309 <Field boolean mRetainInstance>
	//    3    5:return          
	}

	public void setReturnTransition(Object obj)
	{
		ensureAnimationInfo().mReturnTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #976 <Method Object Fragment$AnimationInfo.access$102(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setSharedElementEnterTransition(Object obj)
	{
		ensureAnimationInfo().mSharedElementEnterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #980 <Method Object Fragment$AnimationInfo.access$402(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setSharedElementReturnTransition(Object obj)
	{
		ensureAnimationInfo().mSharedElementReturnTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #984 <Method Object Fragment$AnimationInfo.access$502(Fragment$AnimationInfo, Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void setStateAfterAnimating(int i)
	{
		ensureAnimationInfo().mStateAfterAnimating = i;
	//    0    0:aload_0         
	//    1    1:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:putfield        #572 <Field int Fragment$AnimationInfo.mStateAfterAnimating>
	//    4    8:return          
	}

	public void setTargetFragment(Fragment fragment, int i)
	{
		FragmentManager fragmentmanager1 = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #989 <Method FragmentManager getFragmentManager()>
	//    2    4:astore          4
		FragmentManager fragmentmanager;
		if(fragment != null)
	//*   3    6:aload_1         
	//*   4    7:ifnull          18
			fragmentmanager = fragment.getFragmentManager();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #989 <Method FragmentManager getFragmentManager()>
	//    7   14:astore_3        
		else
	//*   8   15:goto            20
			fragmentmanager = null;
	//    9   18:aconst_null     
	//   10   19:astore_3        
		if(fragmentmanager1 != null && fragmentmanager != null && fragmentmanager1 != fragmentmanager)
	//*  11   20:aload           4
	//*  12   22:ifnull          69
	//*  13   25:aload_3         
	//*  14   26:ifnull          69
	//*  15   29:aload           4
	//*  16   31:aload_3         
	//*  17   32:if_acmpeq       69
			throw new IllegalArgumentException((new StringBuilder()).append("Fragment ").append(((Object) (fragment))).append(" must share the same FragmentManager to be set as a target fragment").toString());
	//   18   35:new             #991 <Class IllegalArgumentException>
	//   19   38:dup             
	//   20   39:new             #199 <Class StringBuilder>
	//   21   42:dup             
	//   22   43:invokespecial   #200 <Method void StringBuilder()>
	//   23   46:ldc2            #518 <String "Fragment ">
	//   24   49:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   25   52:aload_1         
	//   26   53:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   27   56:ldc2            #993 <String " must share the same FragmentManager to be set as a target fragment">
	//   28   59:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   30   65:invokespecial   #994 <Method void IllegalArgumentException(String)>
	//   31   68:athrow          
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
	//   39   80:new             #991 <Class IllegalArgumentException>
	//   40   83:dup             
	//   41   84:new             #199 <Class StringBuilder>
	//   42   87:dup             
	//   43   88:invokespecial   #200 <Method void StringBuilder()>
	//   44   91:ldc2            #996 <String "Setting ">
	//   45   94:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   46   97:aload_1         
	//   47   98:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   48  101:ldc2            #998 <String " as the target of ">
	//   49  104:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   50  107:aload_0         
	//   51  108:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   52  111:ldc2            #1000 <String " would create a target cycle">
	//   53  114:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   54  117:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   55  120:invokespecial   #994 <Method void IllegalArgumentException(String)>
	//   56  123:athrow          

	//   57  124:aload_3         
	//   58  125:invokevirtual   #1002 <Method Fragment getTargetFragment()>
	//   59  128:astore_3        
	//*  60  129:goto            71
		mTarget = fragment;
	//   61  132:aload_0         
	//   62  133:aload_1         
	//   63  134:putfield        #344 <Field Fragment mTarget>
		mTargetRequestCode = i;
	//   64  137:aload_0         
	//   65  138:iload_2         
	//   66  139:putfield        #352 <Field int mTargetRequestCode>
	//   67  142:return          
	}

	public void setUserVisibleHint(boolean flag)
	{
		if(!mUserVisibleHint && flag && mState < 4 && mFragmentManager != null && isAdded())
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field boolean mUserVisibleHint>
	//*   2    4:ifne            41
	//*   3    7:iload_1         
	//*   4    8:ifeq            41
	//*   5   11:aload_0         
	//*   6   12:getfield        #116 <Field int mState>
	//*   7   15:iconst_4        
	//*   8   16:icmpge          41
	//*   9   19:aload_0         
	//*  10   20:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//*  11   23:ifnull          41
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #626 <Method boolean isAdded()>
	//*  14   30:ifeq            41
			mFragmentManager.performPendingDeferredStart(this);
	//   15   33:aload_0         
	//   16   34:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #1006 <Method void FragmentManagerImpl.performPendingDeferredStart(Fragment)>
		mUserVisibleHint = flag;
	//   19   41:aload_0         
	//   20   42:iload_1         
	//   21   43:putfield        #124 <Field boolean mUserVisibleHint>
		if(mState < 4 && !flag)
	//*  22   46:aload_0         
	//*  23   47:getfield        #116 <Field int mState>
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
	//   35   67:putfield        #1008 <Field boolean mDeferStart>
	//   36   70:return          
	}

	public boolean shouldShowRequestPermissionRationale(String s)
	{
		if(mHost != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//*   2    4:ifnull          16
			return mHost.onShouldShowRequestPermissionRationale(s);
	//    3    7:aload_0         
	//    4    8:getfield        #324 <Field FragmentHostCallback mHost>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #1013 <Method boolean FragmentHostCallback.onShouldShowRequestPermissionRationale(String)>
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
	//    3    3:invokevirtual   #1018 <Method void startActivity(Intent, Bundle)>
	//    4    6:return          
	}

	public void startActivity(Intent intent, Bundle bundle)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       41
		{
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    3    7:new             #516 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #199 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #200 <Method void StringBuilder()>
	//    8   18:ldc2            #518 <String "Fragment ">
	//    9   21:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #520 <String " not attached to Activity">
	//   13   31:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #522 <Method void IllegalStateException(String)>
	//   16   40:athrow          
		} else
		{
			mHost.onStartActivityFromFragment(this, intent, -1, bundle);
	//   17   41:aload_0         
	//   18   42:getfield        #324 <Field FragmentHostCallback mHost>
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:iconst_m1       
	//   22   48:aload_2         
	//   23   49:invokevirtual   #1022 <Method void FragmentHostCallback.onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
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
	//    4    4:invokevirtual   #1027 <Method void startActivityForResult(Intent, int, Bundle)>
	//    5    7:return          
	}

	public void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       41
		{
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    3    7:new             #516 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #199 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #200 <Method void StringBuilder()>
	//    8   18:ldc2            #518 <String "Fragment ">
	//    9   21:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #520 <String " not attached to Activity">
	//   13   31:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #522 <Method void IllegalStateException(String)>
	//   16   40:athrow          
		} else
		{
			mHost.onStartActivityFromFragment(this, intent, i, bundle);
	//   17   41:aload_0         
	//   18   42:getfield        #324 <Field FragmentHostCallback mHost>
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:iload_2         
	//   22   48:aload_3         
	//   23   49:invokevirtual   #1022 <Method void FragmentHostCallback.onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
			return;
	//   24   52:return          
		}
	}

	public void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		if(mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field FragmentHostCallback mHost>
	//*   2    4:ifnonnull       41
		{
			throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(((Object) (this))).append(" not attached to Activity").toString());
	//    3    7:new             #516 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #199 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #200 <Method void StringBuilder()>
	//    8   18:ldc2            #518 <String "Fragment ">
	//    9   21:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #520 <String " not attached to Activity">
	//   13   31:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #522 <Method void IllegalStateException(String)>
	//   16   40:athrow          
		} else
		{
			mHost.onStartIntentSenderFromFragment(this, intentsender, i, intent, j, k, l, bundle);
	//   17   41:aload_0         
	//   18   42:getfield        #324 <Field FragmentHostCallback mHost>
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:iload_2         
	//   22   48:aload_3         
	//   23   49:iload           4
	//   24   51:iload           5
	//   25   53:iload           6
	//   26   55:aload           7
	//   27   57:invokevirtual   #1035 <Method void FragmentHostCallback.onStartIntentSenderFromFragment(Fragment, IntentSender, int, Intent, int, int, int, Bundle)>
			return;
	//   28   60:return          
		}
	}

	public void startPostponedEnterTransition()
	{
		if(mFragmentManager == null || mFragmentManager.mHost == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//*   5   11:getfield        #1038 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//*   6   14:ifnonnull       26
		{
			ensureAnimationInfo().mEnterTransitionPostponed = false;
	//    7   17:aload_0         
	//    8   18:invokespecial   #878 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    9   21:iconst_0        
	//   10   22:putfield        #134 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
			return;
	//   11   25:return          
		}
		if(Looper.myLooper() != mFragmentManager.mHost.getHandler().getLooper())
	//*  12   26:invokestatic    #1044 <Method Looper Looper.myLooper()>
	//*  13   29:aload_0         
	//*  14   30:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//*  15   33:getfield        #1038 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//*  16   36:invokevirtual   #1048 <Method Handler FragmentHostCallback.getHandler()>
	//*  17   39:invokevirtual   #1053 <Method Looper Handler.getLooper()>
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
	//   20   46:getfield        #317 <Field FragmentManagerImpl mFragmentManager>
	//   21   49:getfield        #1038 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//   22   52:invokevirtual   #1048 <Method Handler FragmentHostCallback.getHandler()>
	//   23   55:new             #10  <Class Fragment$1>
	//   24   58:dup             
	//   25   59:aload_0         
	//   26   60:invokespecial   #1054 <Method void Fragment$1(Fragment)>
	//   27   63:invokevirtual   #1058 <Method boolean Handler.postAtFrontOfQueue(Runnable)>
	//   28   66:pop             
			return;
	//   29   67:return          
		} else
		{
			callStartTransitionListener();
	//   30   68:aload_0         
	//   31   69:invokespecial   #129 <Method void callStartTransitionListener()>
			return;
	//   32   72:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #199 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #1060 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		DebugUtils.buildShortClassTag(((Object) (this)), stringbuilder);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #1066 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		if(mIndex >= 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #118 <Field int mIndex>
	//*  10   20:iflt            40
		{
			stringbuilder.append(" #");
	//   11   23:aload_1         
	//   12   24:ldc2            #1068 <String " #">
	//   13   27:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append(mIndex);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #118 <Field int mIndex>
	//   18   36:invokevirtual   #948 <Method StringBuilder StringBuilder.append(int)>
	//   19   39:pop             
		}
		if(mFragmentId != 0)
	//*  20   40:aload_0         
	//*  21   41:getfield        #236 <Field int mFragmentId>
	//*  22   44:ifeq            67
		{
			stringbuilder.append(" id=0x");
	//   23   47:aload_1         
	//   24   48:ldc2            #1070 <String " id=0x">
	//   25   51:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			stringbuilder.append(Integer.toHexString(mFragmentId));
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #236 <Field int mFragmentId>
	//   30   60:invokestatic    #242 <Method String Integer.toHexString(int)>
	//   31   63:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
		}
		if(mTag != null)
	//*  33   67:aload_0         
	//*  34   68:getfield        #250 <Field String mTag>
	//*  35   71:ifnull          91
		{
			stringbuilder.append(" ");
	//   36   74:aload_1         
	//   37   75:ldc2            #1072 <String " ">
	//   38   78:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			stringbuilder.append(mTag);
	//   40   82:aload_1         
	//   41   83:aload_0         
	//   42   84:getfield        #250 <Field String mTag>
	//   43   87:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
		}
		stringbuilder.append('}');
	//   45   91:aload_1         
	//   46   92:bipush          125
	//   47   94:invokevirtual   #1075 <Method StringBuilder StringBuilder.append(char)>
	//   48   97:pop             
		return stringbuilder.toString();
	//   49   98:aload_1         
	//   50   99:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   51  102:areturn         
	}

	public void unregisterForContextMenu(View view)
	{
		view.setOnCreateContextMenuListener(((android.view.View.OnCreateContextMenuListener) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #884 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
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
	boolean mIsNewlyAdded;
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
	//    0    0:new             #105 <Class SimpleArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void SimpleArrayMap()>
	//    3    7:putstatic       #110 <Field SimpleArrayMap sClassMap>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #111 <Method void Object()>
	//    7   17:putstatic       #113 <Field Object USE_DEFAULT_TRANSITION>
	//*   8   20:return          
	}


/*
	static void access$800(Fragment fragment)
	{
		fragment.callStartTransitionListener();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void callStartTransitionListener()>
		return;
	//    2    4:return          
	}

*/
}
