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
//			LoaderManager, FragmentManagerImpl, FragmentHostCallback, FragmentActivity, 
//			SuperNotCalledException, FragmentManagerNonConfig, FragmentManager, SharedElementCallback, 
//			FragmentContainer

public class Fragment
	implements LifecycleOwner, ViewModelStoreOwner, ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{
	static class AnimationInfo
	{

		Boolean mAllowEnterTransitionOverlap;
		Boolean mAllowReturnTransitionOverlap;
		View mAnimatingAway;
		Animator mAnimator;
		Object mEnterTransition;
		SharedElementCallback mEnterTransitionCallback;
		boolean mEnterTransitionPostponed;
		Object mExitTransition;
		SharedElementCallback mExitTransitionCallback;
		boolean mIsHideReplaced;
		int mNextAnim;
		int mNextTransition;
		int mNextTransitionStyle;
		Object mReenterTransition;
		Object mReturnTransition;
		Object mSharedElementEnterTransition;
		Object mSharedElementReturnTransition;
		OnStartEnterTransitionListener mStartEnterTransitionListener;
		int mStateAfterAnimating;

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
		//    2    2:getfield        #34  <Field Bundle mState>
		//    3    5:invokevirtual   #48  <Method void Parcel.writeBundle(Bundle)>
		//    4    8:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

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

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class Fragment$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void Fragment$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method Fragment$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method Fragment$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
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
			//    2    2:invokevirtual   #34  <Method Fragment$SavedState[] newArray(int)>
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

		SavedState(Parcel parcel, ClassLoader classloader)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mState = parcel.readBundle();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #32  <Method Bundle Parcel.readBundle()>
		//    5    9:putfield        #34  <Field Bundle mState>
			if(classloader != null)
		//*   6   12:aload_2         
		//*   7   13:ifnull          30
			{
				parcel = ((Parcel) (mState));
		//    8   16:aload_0         
		//    9   17:getfield        #34  <Field Bundle mState>
		//   10   20:astore_1        
				if(parcel != null)
		//*  11   21:aload_1         
		//*  12   22:ifnull          30
					((Bundle) (parcel)).setClassLoader(classloader);
		//   13   25:aload_1         
		//   14   26:aload_2         
		//   15   27:invokevirtual   #40  <Method void Bundle.setClassLoader(ClassLoader)>
			}
		//   16   30:return          
		}
	}


	public Fragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void Object()>
		mState = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #132 <Field int mState>
		mIndex = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #134 <Field int mIndex>
		mTargetIndex = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #136 <Field int mTargetIndex>
		mMenuVisible = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #138 <Field boolean mMenuVisible>
		mUserVisibleHint = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #140 <Field boolean mUserVisibleHint>
		mLifecycleRegistry = new LifecycleRegistry(((LifecycleOwner) (this)));
	//   17   29:aload_0         
	//   18   30:new             #142 <Class LifecycleRegistry>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:invokespecial   #145 <Method void LifecycleRegistry(LifecycleOwner)>
	//   22   38:putfield        #147 <Field LifecycleRegistry mLifecycleRegistry>
		mViewLifecycleOwnerLiveData = new MutableLiveData();
	//   23   41:aload_0         
	//   24   42:new             #149 <Class MutableLiveData>
	//   25   45:dup             
	//   26   46:invokespecial   #150 <Method void MutableLiveData()>
	//   27   49:putfield        #152 <Field MutableLiveData mViewLifecycleOwnerLiveData>
	//   28   52:return          
	}

	private AnimationInfo ensureAnimationInfo()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   2    4:ifnonnull       18
			mAnimationInfo = new AnimationInfo();
	//    3    7:aload_0         
	//    4    8:new             #20  <Class Fragment$AnimationInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #157 <Method void Fragment$AnimationInfo()>
	//    7   15:putfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
		return mAnimationInfo;
	//    8   18:aload_0         
	//    9   19:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//   10   22:areturn         
	}

	public static Fragment instantiate(Context context, String s)
	{
		return instantiate(context, s, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #162 <Method Fragment instantiate(Context, String, Bundle)>
	//    4    6:areturn         
	}

	public static Fragment instantiate(Context context, String s, Bundle bundle)
	{
		Class class1;
		Class class2;
		try
		{
			class2 = (Class)sClassMap.get(((Object) (s)));
	//    0    0:getstatic       #126 <Field SimpleArrayMap sClassMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #176 <Method Object SimpleArrayMap.get(Object)>
	//    3    7:checkcast       #178 <Class Class>
	//    4   10:astore          4
		}
	//*   5   12:aload           4
	//*   6   14:astore_3        
	//*   7   15:aload           4
	//*   8   17:ifnonnull       38
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #184 <Method ClassLoader Context.getClassLoader()>
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #190 <Method Class ClassLoader.loadClass(String)>
	//*  13   28:astore_3        
	//*  14   29:getstatic       #126 <Field SimpleArrayMap sClassMap>
	//*  15   32:aload_1         
	//*  16   33:aload_3         
	//*  17   34:invokevirtual   #194 <Method Object SimpleArrayMap.put(Object, Object)>
	//*  18   37:pop             
	//*  19   38:aload_3         
	//*  20   39:iconst_0        
	//*  21   40:anewarray       Class[]
	//*  22   43:invokevirtual   #198 <Method Constructor Class.getConstructor(Class[])>
	//*  23   46:iconst_0        
	//*  24   47:anewarray       Object[]
	//*  25   50:invokevirtual   #204 <Method Object Constructor.newInstance(Object[])>
	//*  26   53:checkcast       #2   <Class Fragment>
	//*  27   56:astore_0        
	//*  28   57:aload_2         
	//*  29   58:ifnull          77
	//*  30   61:aload_2         
	//*  31   62:aload_0         
	//*  32   63:invokevirtual   #208 <Method Class Object.getClass()>
	//*  33   66:invokevirtual   #209 <Method ClassLoader Class.getClassLoader()>
	//*  34   69:invokevirtual   #215 <Method void Bundle.setClassLoader(ClassLoader)>
	//*  35   72:aload_0         
	//*  36   73:aload_2         
	//*  37   74:invokevirtual   #219 <Method void setArguments(Bundle)>
	//*  38   77:aload_0         
	//*  39   78:areturn         
	//*  40   79:astore_0        
	//*  41   80:new             #221 <Class StringBuilder>
	//*  42   83:dup             
	//*  43   84:invokespecial   #222 <Method void StringBuilder()>
	//*  44   87:astore_2        
	//*  45   88:aload_2         
	//*  46   89:ldc1            #224 <String "Unable to instantiate fragment ">
	//*  47   91:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//*  48   94:pop             
	//*  49   95:aload_2         
	//*  50   96:aload_1         
	//*  51   97:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//*  52  100:pop             
	//*  53  101:aload_2         
	//*  54  102:ldc1            #230 <String ": calling Fragment constructor caused an exception">
	//*  55  104:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//*  56  107:pop             
	//*  57  108:new             #23  <Class Fragment$InstantiationException>
	//*  58  111:dup             
	//*  59  112:aload_2         
	//*  60  113:invokevirtual   #234 <Method String StringBuilder.toString()>
	//*  61  116:aload_0         
	//*  62  117:invokespecial   #237 <Method void Fragment$InstantiationException(String, Exception)>
	//*  63  120:athrow          
	//*  64  121:astore_0        
	//*  65  122:new             #221 <Class StringBuilder>
	//*  66  125:dup             
	//*  67  126:invokespecial   #222 <Method void StringBuilder()>
	//*  68  129:astore_2        
	//*  69  130:aload_2         
	//*  70  131:ldc1            #224 <String "Unable to instantiate fragment ">
	//*  71  133:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//*  72  136:pop             
	//*  73  137:aload_2         
	//*  74  138:aload_1         
	//*  75  139:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//*  76  142:pop             
	//*  77  143:aload_2         
	//*  78  144:ldc1            #239 <String ": could not find Fragment constructor">
	//*  79  146:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//*  80  149:pop             
	//*  81  150:new             #23  <Class Fragment$InstantiationException>
	//*  82  153:dup             
	//*  83  154:aload_2         
	//*  84  155:invokevirtual   #234 <Method String StringBuilder.toString()>
	//*  85  158:aload_0         
	//*  86  159:invokespecial   #237 <Method void Fragment$InstantiationException(String, Exception)>
	//*  87  162:athrow          
	//*  88  163:astore_0        
	//*  89  164:new             #221 <Class StringBuilder>
	//*  90  167:dup             
	//*  91  168:invokespecial   #222 <Method void StringBuilder()>
	//*  92  171:astore_2        
	//*  93  172:aload_2         
	//*  94  173:ldc1            #224 <String "Unable to instantiate fragment ">
	//*  95  175:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//*  96  178:pop             
	//*  97  179:aload_2         
	//*  98  180:aload_1         
	//*  99  181:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//* 100  184:pop             
	//* 101  185:aload_2         
	//* 102  186:ldc1            #241 <String ": make sure class name exists, is public, and has an">
	//* 103  188:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//* 104  191:pop             
	//* 105  192:aload_2         
	//* 106  193:ldc1            #243 <String " empty constructor that is public">
	//* 107  195:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//* 108  198:pop             
	//* 109  199:new             #23  <Class Fragment$InstantiationException>
	//* 110  202:dup             
	//* 111  203:aload_2         
	//* 112  204:invokevirtual   #234 <Method String StringBuilder.toString()>
	//* 113  207:aload_0         
	//* 114  208:invokespecial   #237 <Method void Fragment$InstantiationException(String, Exception)>
	//* 115  211:athrow          
	//* 116  212:astore_0        
	//* 117  213:new             #221 <Class StringBuilder>
	//* 118  216:dup             
	//* 119  217:invokespecial   #222 <Method void StringBuilder()>
	//* 120  220:astore_2        
	//* 121  221:aload_2         
	//* 122  222:ldc1            #224 <String "Unable to instantiate fragment ">
	//* 123  224:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//* 124  227:pop             
	//* 125  228:aload_2         
	//* 126  229:aload_1         
	//* 127  230:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//* 128  233:pop             
	//* 129  234:aload_2         
	//* 130  235:ldc1            #241 <String ": make sure class name exists, is public, and has an">
	//* 131  237:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//* 132  240:pop             
	//* 133  241:aload_2         
	//* 134  242:ldc1            #243 <String " empty constructor that is public">
	//* 135  244:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//* 136  247:pop             
	//* 137  248:new             #23  <Class Fragment$InstantiationException>
	//* 138  251:dup             
	//* 139  252:aload_2         
	//* 140  253:invokevirtual   #234 <Method String StringBuilder.toString()>
	//* 141  256:aload_0         
	//* 142  257:invokespecial   #237 <Method void Fragment$InstantiationException(String, Exception)>
	//* 143  260:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 144  261:astore_0        
		{
			bundle = ((Bundle) (new StringBuilder()));
	//  145  262:new             #221 <Class StringBuilder>
	//  146  265:dup             
	//  147  266:invokespecial   #222 <Method void StringBuilder()>
	//  148  269:astore_2        
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
	//  149  270:aload_2         
	//  150  271:ldc1            #224 <String "Unable to instantiate fragment ">
	//  151  273:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  152  276:pop             
			((StringBuilder) (bundle)).append(s);
	//  153  277:aload_2         
	//  154  278:aload_1         
	//  155  279:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  156  282:pop             
			((StringBuilder) (bundle)).append(": make sure class name exists, is public, and has an");
	//  157  283:aload_2         
	//  158  284:ldc1            #241 <String ": make sure class name exists, is public, and has an">
	//  159  286:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  160  289:pop             
			((StringBuilder) (bundle)).append(" empty constructor that is public");
	//  161  290:aload_2         
	//  162  291:ldc1            #243 <String " empty constructor that is public">
	//  163  293:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  164  296:pop             
			throw new InstantiationException(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
	//  165  297:new             #23  <Class Fragment$InstantiationException>
	//  166  300:dup             
	//  167  301:aload_2         
	//  168  302:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  169  305:aload_0         
	//  170  306:invokespecial   #237 <Method void Fragment$InstantiationException(String, Exception)>
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
	//    0    0:getstatic       #126 <Field SimpleArrayMap sClassMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #176 <Method Object SimpleArrayMap.get(Object)>
	//    3    7:checkcast       #178 <Class Class>
	//    4   10:astore          4
		}
	//*   5   12:aload           4
	//*   6   14:astore_3        
	//*   7   15:aload           4
	//*   8   17:ifnonnull       38
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #184 <Method ClassLoader Context.getClassLoader()>
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #190 <Method Class ClassLoader.loadClass(String)>
	//*  13   28:astore_3        
	//*  14   29:getstatic       #126 <Field SimpleArrayMap sClassMap>
	//*  15   32:aload_1         
	//*  16   33:aload_3         
	//*  17   34:invokevirtual   #194 <Method Object SimpleArrayMap.put(Object, Object)>
	//*  18   37:pop             
	//*  19   38:ldc1            #2   <Class Fragment>
	//*  20   40:aload_3         
	//*  21   41:invokevirtual   #250 <Method boolean Class.isAssignableFrom(Class)>
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

	void callStartTransitionListener()
	{
		Object obj = ((Object) (mAnimationInfo));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
		{
			obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		} else
	//*   7   11:goto            32
		{
			obj.mEnterTransitionPostponed = false;
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:putfield        #254 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
			obj = ((Object) (((AnimationInfo) (obj)).mStartEnterTransitionListener));
	//   11   19:aload_1         
	//   12   20:getfield        #258 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//   13   23:astore_1        
			mAnimationInfo.mStartEnterTransitionListener = null;
	//   14   24:aload_0         
	//   15   25:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//   16   28:aconst_null     
	//   17   29:putfield        #258 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
		}
		if(obj != null)
	//*  18   32:aload_1         
	//*  19   33:ifnull          42
			((OnStartEnterTransitionListener) (obj)).onStartEnterTransition();
	//   20   36:aload_1         
	//   21   37:invokeinterface #261 <Method void Fragment$OnStartEnterTransitionListener.onStartEnterTransition()>
	//   22   42:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.print(s);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print("mFragmentId=#");
	//    3    5:aload_3         
	//    4    6:ldc2            #271 <String "mFragmentId=#">
	//    5    9:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(mFragmentId));
	//    6   12:aload_3         
	//    7   13:aload_0         
	//    8   14:getfield        #273 <Field int mFragmentId>
	//    9   17:invokestatic    #279 <Method String Integer.toHexString(int)>
	//   10   20:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(" mContainerId=#");
	//   11   23:aload_3         
	//   12   24:ldc2            #281 <String " mContainerId=#">
	//   13   27:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(mContainerId));
	//   14   30:aload_3         
	//   15   31:aload_0         
	//   16   32:getfield        #283 <Field int mContainerId>
	//   17   35:invokestatic    #279 <Method String Integer.toHexString(int)>
	//   18   38:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(" mTag=");
	//   19   41:aload_3         
	//   20   42:ldc2            #285 <String " mTag=">
	//   21   45:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.println(mTag);
	//   22   48:aload_3         
	//   23   49:aload_0         
	//   24   50:getfield        #287 <Field String mTag>
	//   25   53:invokevirtual   #290 <Method void PrintWriter.println(String)>
		printwriter.print(s);
	//   26   56:aload_3         
	//   27   57:aload_1         
	//   28   58:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print("mState=");
	//   29   61:aload_3         
	//   30   62:ldc2            #292 <String "mState=">
	//   31   65:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mState);
	//   32   68:aload_3         
	//   33   69:aload_0         
	//   34   70:getfield        #132 <Field int mState>
	//   35   73:invokevirtual   #295 <Method void PrintWriter.print(int)>
		printwriter.print(" mIndex=");
	//   36   76:aload_3         
	//   37   77:ldc2            #297 <String " mIndex=">
	//   38   80:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mIndex);
	//   39   83:aload_3         
	//   40   84:aload_0         
	//   41   85:getfield        #134 <Field int mIndex>
	//   42   88:invokevirtual   #295 <Method void PrintWriter.print(int)>
		printwriter.print(" mWho=");
	//   43   91:aload_3         
	//   44   92:ldc2            #299 <String " mWho=">
	//   45   95:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mWho);
	//   46   98:aload_3         
	//   47   99:aload_0         
	//   48  100:getfield        #301 <Field String mWho>
	//   49  103:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(" mBackStackNesting=");
	//   50  106:aload_3         
	//   51  107:ldc2            #303 <String " mBackStackNesting=">
	//   52  110:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.println(mBackStackNesting);
	//   53  113:aload_3         
	//   54  114:aload_0         
	//   55  115:getfield        #305 <Field int mBackStackNesting>
	//   56  118:invokevirtual   #307 <Method void PrintWriter.println(int)>
		printwriter.print(s);
	//   57  121:aload_3         
	//   58  122:aload_1         
	//   59  123:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print("mAdded=");
	//   60  126:aload_3         
	//   61  127:ldc2            #309 <String "mAdded=">
	//   62  130:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mAdded);
	//   63  133:aload_3         
	//   64  134:aload_0         
	//   65  135:getfield        #311 <Field boolean mAdded>
	//   66  138:invokevirtual   #314 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRemoving=");
	//   67  141:aload_3         
	//   68  142:ldc2            #316 <String " mRemoving=">
	//   69  145:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mRemoving);
	//   70  148:aload_3         
	//   71  149:aload_0         
	//   72  150:getfield        #318 <Field boolean mRemoving>
	//   73  153:invokevirtual   #314 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mFromLayout=");
	//   74  156:aload_3         
	//   75  157:ldc2            #320 <String " mFromLayout=">
	//   76  160:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mFromLayout);
	//   77  163:aload_3         
	//   78  164:aload_0         
	//   79  165:getfield        #322 <Field boolean mFromLayout>
	//   80  168:invokevirtual   #314 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mInLayout=");
	//   81  171:aload_3         
	//   82  172:ldc2            #324 <String " mInLayout=">
	//   83  175:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.println(mInLayout);
	//   84  178:aload_3         
	//   85  179:aload_0         
	//   86  180:getfield        #326 <Field boolean mInLayout>
	//   87  183:invokevirtual   #328 <Method void PrintWriter.println(boolean)>
		printwriter.print(s);
	//   88  186:aload_3         
	//   89  187:aload_1         
	//   90  188:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print("mHidden=");
	//   91  191:aload_3         
	//   92  192:ldc2            #330 <String "mHidden=">
	//   93  195:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mHidden);
	//   94  198:aload_3         
	//   95  199:aload_0         
	//   96  200:getfield        #332 <Field boolean mHidden>
	//   97  203:invokevirtual   #314 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDetached=");
	//   98  206:aload_3         
	//   99  207:ldc2            #334 <String " mDetached=">
	//  100  210:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mDetached);
	//  101  213:aload_3         
	//  102  214:aload_0         
	//  103  215:getfield        #336 <Field boolean mDetached>
	//  104  218:invokevirtual   #314 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mMenuVisible=");
	//  105  221:aload_3         
	//  106  222:ldc2            #338 <String " mMenuVisible=">
	//  107  225:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mMenuVisible);
	//  108  228:aload_3         
	//  109  229:aload_0         
	//  110  230:getfield        #138 <Field boolean mMenuVisible>
	//  111  233:invokevirtual   #314 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mHasMenu=");
	//  112  236:aload_3         
	//  113  237:ldc2            #340 <String " mHasMenu=">
	//  114  240:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.println(mHasMenu);
	//  115  243:aload_3         
	//  116  244:aload_0         
	//  117  245:getfield        #342 <Field boolean mHasMenu>
	//  118  248:invokevirtual   #328 <Method void PrintWriter.println(boolean)>
		printwriter.print(s);
	//  119  251:aload_3         
	//  120  252:aload_1         
	//  121  253:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print("mRetainInstance=");
	//  122  256:aload_3         
	//  123  257:ldc2            #344 <String "mRetainInstance=">
	//  124  260:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mRetainInstance);
	//  125  263:aload_3         
	//  126  264:aload_0         
	//  127  265:getfield        #346 <Field boolean mRetainInstance>
	//  128  268:invokevirtual   #314 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRetaining=");
	//  129  271:aload_3         
	//  130  272:ldc2            #348 <String " mRetaining=">
	//  131  275:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.print(mRetaining);
	//  132  278:aload_3         
	//  133  279:aload_0         
	//  134  280:getfield        #350 <Field boolean mRetaining>
	//  135  283:invokevirtual   #314 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mUserVisibleHint=");
	//  136  286:aload_3         
	//  137  287:ldc2            #352 <String " mUserVisibleHint=">
	//  138  290:invokevirtual   #269 <Method void PrintWriter.print(String)>
		printwriter.println(mUserVisibleHint);
	//  139  293:aload_3         
	//  140  294:aload_0         
	//  141  295:getfield        #140 <Field boolean mUserVisibleHint>
	//  142  298:invokevirtual   #328 <Method void PrintWriter.println(boolean)>
		if(mFragmentManager != null)
	//* 143  301:aload_0         
	//* 144  302:getfield        #354 <Field FragmentManagerImpl mFragmentManager>
	//* 145  305:ifnull          328
		{
			printwriter.print(s);
	//  146  308:aload_3         
	//  147  309:aload_1         
	//  148  310:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mFragmentManager=");
	//  149  313:aload_3         
	//  150  314:ldc2            #356 <String "mFragmentManager=">
	//  151  317:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mFragmentManager)));
	//  152  320:aload_3         
	//  153  321:aload_0         
	//  154  322:getfield        #354 <Field FragmentManagerImpl mFragmentManager>
	//  155  325:invokevirtual   #359 <Method void PrintWriter.println(Object)>
		}
		if(mHost != null)
	//* 156  328:aload_0         
	//* 157  329:getfield        #361 <Field FragmentHostCallback mHost>
	//* 158  332:ifnull          355
		{
			printwriter.print(s);
	//  159  335:aload_3         
	//  160  336:aload_1         
	//  161  337:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mHost=");
	//  162  340:aload_3         
	//  163  341:ldc2            #363 <String "mHost=">
	//  164  344:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mHost)));
	//  165  347:aload_3         
	//  166  348:aload_0         
	//  167  349:getfield        #361 <Field FragmentHostCallback mHost>
	//  168  352:invokevirtual   #359 <Method void PrintWriter.println(Object)>
		}
		if(mParentFragment != null)
	//* 169  355:aload_0         
	//* 170  356:getfield        #365 <Field Fragment mParentFragment>
	//* 171  359:ifnull          382
		{
			printwriter.print(s);
	//  172  362:aload_3         
	//  173  363:aload_1         
	//  174  364:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mParentFragment=");
	//  175  367:aload_3         
	//  176  368:ldc2            #367 <String "mParentFragment=">
	//  177  371:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParentFragment)));
	//  178  374:aload_3         
	//  179  375:aload_0         
	//  180  376:getfield        #365 <Field Fragment mParentFragment>
	//  181  379:invokevirtual   #359 <Method void PrintWriter.println(Object)>
		}
		if(mArguments != null)
	//* 182  382:aload_0         
	//* 183  383:getfield        #369 <Field Bundle mArguments>
	//* 184  386:ifnull          409
		{
			printwriter.print(s);
	//  185  389:aload_3         
	//  186  390:aload_1         
	//  187  391:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mArguments=");
	//  188  394:aload_3         
	//  189  395:ldc2            #371 <String "mArguments=">
	//  190  398:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mArguments)));
	//  191  401:aload_3         
	//  192  402:aload_0         
	//  193  403:getfield        #369 <Field Bundle mArguments>
	//  194  406:invokevirtual   #359 <Method void PrintWriter.println(Object)>
		}
		if(mSavedFragmentState != null)
	//* 195  409:aload_0         
	//* 196  410:getfield        #373 <Field Bundle mSavedFragmentState>
	//* 197  413:ifnull          436
		{
			printwriter.print(s);
	//  198  416:aload_3         
	//  199  417:aload_1         
	//  200  418:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mSavedFragmentState=");
	//  201  421:aload_3         
	//  202  422:ldc2            #375 <String "mSavedFragmentState=">
	//  203  425:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mSavedFragmentState)));
	//  204  428:aload_3         
	//  205  429:aload_0         
	//  206  430:getfield        #373 <Field Bundle mSavedFragmentState>
	//  207  433:invokevirtual   #359 <Method void PrintWriter.println(Object)>
		}
		if(mSavedViewState != null)
	//* 208  436:aload_0         
	//* 209  437:getfield        #377 <Field SparseArray mSavedViewState>
	//* 210  440:ifnull          463
		{
			printwriter.print(s);
	//  211  443:aload_3         
	//  212  444:aload_1         
	//  213  445:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mSavedViewState=");
	//  214  448:aload_3         
	//  215  449:ldc2            #379 <String "mSavedViewState=">
	//  216  452:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mSavedViewState)));
	//  217  455:aload_3         
	//  218  456:aload_0         
	//  219  457:getfield        #377 <Field SparseArray mSavedViewState>
	//  220  460:invokevirtual   #359 <Method void PrintWriter.println(Object)>
		}
		if(mTarget != null)
	//* 221  463:aload_0         
	//* 222  464:getfield        #381 <Field Fragment mTarget>
	//* 223  467:ifnull          505
		{
			printwriter.print(s);
	//  224  470:aload_3         
	//  225  471:aload_1         
	//  226  472:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mTarget=");
	//  227  475:aload_3         
	//  228  476:ldc2            #383 <String "mTarget=">
	//  229  479:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print(((Object) (mTarget)));
	//  230  482:aload_3         
	//  231  483:aload_0         
	//  232  484:getfield        #381 <Field Fragment mTarget>
	//  233  487:invokevirtual   #385 <Method void PrintWriter.print(Object)>
			printwriter.print(" mTargetRequestCode=");
	//  234  490:aload_3         
	//  235  491:ldc2            #387 <String " mTargetRequestCode=">
	//  236  494:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(mTargetRequestCode);
	//  237  497:aload_3         
	//  238  498:aload_0         
	//  239  499:getfield        #389 <Field int mTargetRequestCode>
	//  240  502:invokevirtual   #307 <Method void PrintWriter.println(int)>
		}
		if(getNextAnim() != 0)
	//* 241  505:aload_0         
	//* 242  506:invokevirtual   #393 <Method int getNextAnim()>
	//* 243  509:ifeq            532
		{
			printwriter.print(s);
	//  244  512:aload_3         
	//  245  513:aload_1         
	//  246  514:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mNextAnim=");
	//  247  517:aload_3         
	//  248  518:ldc2            #395 <String "mNextAnim=">
	//  249  521:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(getNextAnim());
	//  250  524:aload_3         
	//  251  525:aload_0         
	//  252  526:invokevirtual   #393 <Method int getNextAnim()>
	//  253  529:invokevirtual   #307 <Method void PrintWriter.println(int)>
		}
		if(mContainer != null)
	//* 254  532:aload_0         
	//* 255  533:getfield        #397 <Field ViewGroup mContainer>
	//* 256  536:ifnull          559
		{
			printwriter.print(s);
	//  257  539:aload_3         
	//  258  540:aload_1         
	//  259  541:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mContainer=");
	//  260  544:aload_3         
	//  261  545:ldc2            #399 <String "mContainer=">
	//  262  548:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mContainer)));
	//  263  551:aload_3         
	//  264  552:aload_0         
	//  265  553:getfield        #397 <Field ViewGroup mContainer>
	//  266  556:invokevirtual   #359 <Method void PrintWriter.println(Object)>
		}
		if(mView != null)
	//* 267  559:aload_0         
	//* 268  560:getfield        #401 <Field View mView>
	//* 269  563:ifnull          586
		{
			printwriter.print(s);
	//  270  566:aload_3         
	//  271  567:aload_1         
	//  272  568:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mView=");
	//  273  571:aload_3         
	//  274  572:ldc2            #403 <String "mView=">
	//  275  575:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mView)));
	//  276  578:aload_3         
	//  277  579:aload_0         
	//  278  580:getfield        #401 <Field View mView>
	//  279  583:invokevirtual   #359 <Method void PrintWriter.println(Object)>
		}
		if(mInnerView != null)
	//* 280  586:aload_0         
	//* 281  587:getfield        #405 <Field View mInnerView>
	//* 282  590:ifnull          613
		{
			printwriter.print(s);
	//  283  593:aload_3         
	//  284  594:aload_1         
	//  285  595:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mInnerView=");
	//  286  598:aload_3         
	//  287  599:ldc2            #407 <String "mInnerView=">
	//  288  602:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mView)));
	//  289  605:aload_3         
	//  290  606:aload_0         
	//  291  607:getfield        #401 <Field View mView>
	//  292  610:invokevirtual   #359 <Method void PrintWriter.println(Object)>
		}
		if(getAnimatingAway() != null)
	//* 293  613:aload_0         
	//* 294  614:invokevirtual   #411 <Method View getAnimatingAway()>
	//* 295  617:ifnull          660
		{
			printwriter.print(s);
	//  296  620:aload_3         
	//  297  621:aload_1         
	//  298  622:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mAnimatingAway=");
	//  299  625:aload_3         
	//  300  626:ldc2            #413 <String "mAnimatingAway=">
	//  301  629:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (getAnimatingAway())));
	//  302  632:aload_3         
	//  303  633:aload_0         
	//  304  634:invokevirtual   #411 <Method View getAnimatingAway()>
	//  305  637:invokevirtual   #359 <Method void PrintWriter.println(Object)>
			printwriter.print(s);
	//  306  640:aload_3         
	//  307  641:aload_1         
	//  308  642:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.print("mStateAfterAnimating=");
	//  309  645:aload_3         
	//  310  646:ldc2            #415 <String "mStateAfterAnimating=">
	//  311  649:invokevirtual   #269 <Method void PrintWriter.print(String)>
			printwriter.println(getStateAfterAnimating());
	//  312  652:aload_3         
	//  313  653:aload_0         
	//  314  654:invokevirtual   #418 <Method int getStateAfterAnimating()>
	//  315  657:invokevirtual   #307 <Method void PrintWriter.println(int)>
		}
		if(getContext() != null)
	//* 316  660:aload_0         
	//* 317  661:invokevirtual   #422 <Method Context getContext()>
	//* 318  664:ifnull          679
			LoaderManager.getInstance(((LifecycleOwner) (this))).dump(s, filedescriptor, printwriter, as);
	//  319  667:aload_0         
	//  320  668:invokestatic    #428 <Method LoaderManager LoaderManager.getInstance(LifecycleOwner)>
	//  321  671:aload_1         
	//  322  672:aload_2         
	//  323  673:aload_3         
	//  324  674:aload           4
	//  325  676:invokevirtual   #430 <Method void LoaderManager.dump(String, FileDescriptor, PrintWriter, String[])>
		if(mChildFragmentManager != null)
	//* 326  679:aload_0         
	//* 327  680:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//* 328  683:ifnull          782
		{
			printwriter.print(s);
	//  329  686:aload_3         
	//  330  687:aload_1         
	//  331  688:invokevirtual   #269 <Method void PrintWriter.print(String)>
			Object obj = ((Object) (new StringBuilder()));
	//  332  691:new             #221 <Class StringBuilder>
	//  333  694:dup             
	//  334  695:invokespecial   #222 <Method void StringBuilder()>
	//  335  698:astore          5
			((StringBuilder) (obj)).append("Child ");
	//  336  700:aload           5
	//  337  702:ldc2            #434 <String "Child ">
	//  338  705:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  339  708:pop             
			((StringBuilder) (obj)).append(((Object) (mChildFragmentManager)));
	//  340  709:aload           5
	//  341  711:aload_0         
	//  342  712:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//  343  715:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//  344  718:pop             
			((StringBuilder) (obj)).append(":");
	//  345  719:aload           5
	//  346  721:ldc2            #439 <String ":">
	//  347  724:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  348  727:pop             
			printwriter.println(((StringBuilder) (obj)).toString());
	//  349  728:aload_3         
	//  350  729:aload           5
	//  351  731:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  352  734:invokevirtual   #290 <Method void PrintWriter.println(String)>
			obj = ((Object) (mChildFragmentManager));
	//  353  737:aload_0         
	//  354  738:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//  355  741:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//  356  743:new             #221 <Class StringBuilder>
	//  357  746:dup             
	//  358  747:invokespecial   #222 <Method void StringBuilder()>
	//  359  750:astore          6
			stringbuilder.append(s);
	//  360  752:aload           6
	//  361  754:aload_1         
	//  362  755:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  363  758:pop             
			stringbuilder.append("  ");
	//  364  759:aload           6
	//  365  761:ldc2            #441 <String "  ">
	//  366  764:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//  367  767:pop             
			((FragmentManagerImpl) (obj)).dump(stringbuilder.toString(), filedescriptor, printwriter, as);
	//  368  768:aload           5
	//  369  770:aload           6
	//  370  772:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  371  775:aload_2         
	//  372  776:aload_3         
	//  373  777:aload           4
	//  374  779:invokevirtual   #444 <Method void FragmentManagerImpl.dump(String, FileDescriptor, PrintWriter, String[])>
		}
	//  375  782:return          
	}

	public final boolean equals(Object obj)
	{
		return super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #448 <Method boolean Object.equals(Object)>
	//    3    5:ireturn         
	}

	Fragment findFragmentByWho(String s)
	{
		if(s.equals(((Object) (mWho))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #301 <Field String mWho>
	//*   3    5:invokevirtual   #453 <Method boolean String.equals(Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    7   13:aload_0         
	//    8   14:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    9   17:astore_2        
		if(fragmentmanagerimpl != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          28
			return fragmentmanagerimpl.findFragmentByWho(s);
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #455 <Method Fragment FragmentManagerImpl.findFragmentByWho(String)>
	//   15   27:areturn         
		else
			return null;
	//   16   28:aconst_null     
	//   17   29:areturn         
	}

	public final FragmentActivity getActivity()
	{
		FragmentHostCallback fragmenthostcallback = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//    2    4:astore_1        
		if(fragmenthostcallback == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (FragmentActivity)fragmenthostcallback.getActivity();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #462 <Method Activity FragmentHostCallback.getActivity()>
	//    9   15:checkcast       #464 <Class FragmentActivity>
	//   10   18:areturn         
	}

	public boolean getAllowEnterTransitionOverlap()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo != null && animationinfo.mAllowEnterTransitionOverlap != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
	//*   5    9:aload_1         
	//*   6   10:getfield        #470 <Field Boolean Fragment$AnimationInfo.mAllowEnterTransitionOverlap>
	//*   7   13:ifnonnull       19
	//*   8   16:goto            30
			return mAnimationInfo.mAllowEnterTransitionOverlap.booleanValue();
	//    9   19:aload_0         
	//   10   20:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//   11   23:getfield        #470 <Field Boolean Fragment$AnimationInfo.mAllowEnterTransitionOverlap>
	//   12   26:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//   13   29:ireturn         
		else
			return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
	}

	public boolean getAllowReturnTransitionOverlap()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo != null && animationinfo.mAllowReturnTransitionOverlap != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
	//*   5    9:aload_1         
	//*   6   10:getfield        #479 <Field Boolean Fragment$AnimationInfo.mAllowReturnTransitionOverlap>
	//*   7   13:ifnonnull       19
	//*   8   16:goto            30
			return mAnimationInfo.mAllowReturnTransitionOverlap.booleanValue();
	//    9   19:aload_0         
	//   10   20:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//   11   23:getfield        #479 <Field Boolean Fragment$AnimationInfo.mAllowReturnTransitionOverlap>
	//   12   26:invokevirtual   #475 <Method boolean Boolean.booleanValue()>
	//   13   29:ireturn         
		else
			return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
	}

	View getAnimatingAway()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return animationinfo.mAnimatingAway;
	//    7   11:aload_1         
	//    8   12:getfield        #482 <Field View Fragment$AnimationInfo.mAnimatingAway>
	//    9   15:areturn         
	}

	Animator getAnimator()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return animationinfo.mAnimator;
	//    7   11:aload_1         
	//    8   12:getfield        #488 <Field Animator Fragment$AnimationInfo.mAnimator>
	//    9   15:areturn         
	}

	public final Bundle getArguments()
	{
		return mArguments;
	//    0    0:aload_0         
	//    1    1:getfield        #369 <Field Bundle mArguments>
	//    2    4:areturn         
	}

	public final FragmentManager getChildFragmentManager()
	{
		if(mChildFragmentManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//*   2    4:ifnonnull       73
		{
			instantiateChildFragmentManager();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #496 <Method void instantiateChildFragmentManager()>
			int i = mState;
	//    5   11:aload_0         
	//    6   12:getfield        #132 <Field int mState>
	//    7   15:istore_1        
			if(i >= 4)
	//*   8   16:iload_1         
	//*   9   17:iconst_4        
	//*  10   18:icmplt          31
				mChildFragmentManager.dispatchResume();
	//   11   21:aload_0         
	//   12   22:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   13   25:invokevirtual   #499 <Method void FragmentManagerImpl.dispatchResume()>
			else
	//*  14   28:goto            73
			if(i >= 3)
	//*  15   31:iload_1         
	//*  16   32:iconst_3        
	//*  17   33:icmplt          46
				mChildFragmentManager.dispatchStart();
	//   18   36:aload_0         
	//   19   37:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   20   40:invokevirtual   #502 <Method void FragmentManagerImpl.dispatchStart()>
			else
	//*  21   43:goto            73
			if(i >= 2)
	//*  22   46:iload_1         
	//*  23   47:iconst_2        
	//*  24   48:icmplt          61
				mChildFragmentManager.dispatchActivityCreated();
	//   25   51:aload_0         
	//   26   52:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   27   55:invokevirtual   #505 <Method void FragmentManagerImpl.dispatchActivityCreated()>
			else
	//*  28   58:goto            73
			if(i >= 1)
	//*  29   61:iload_1         
	//*  30   62:iconst_1        
	//*  31   63:icmplt          73
				mChildFragmentManager.dispatchCreate();
	//   32   66:aload_0         
	//   33   67:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   34   70:invokevirtual   #508 <Method void FragmentManagerImpl.dispatchCreate()>
		}
		return ((FragmentManager) (mChildFragmentManager));
	//   35   73:aload_0         
	//   36   74:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   37   77:areturn         
	}

	public Context getContext()
	{
		FragmentHostCallback fragmenthostcallback = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//    2    4:astore_1        
		if(fragmenthostcallback == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return fragmenthostcallback.getContext();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #509 <Method Context FragmentHostCallback.getContext()>
	//    9   15:areturn         
	}

	public Object getEnterTransition()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return animationinfo.mEnterTransition;
	//    7   11:aload_1         
	//    8   12:getfield        #514 <Field Object Fragment$AnimationInfo.mEnterTransition>
	//    9   15:areturn         
	}

	SharedElementCallback getEnterTransitionCallback()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return animationinfo.mEnterTransitionCallback;
	//    7   11:aload_1         
	//    8   12:getfield        #520 <Field SharedElementCallback Fragment$AnimationInfo.mEnterTransitionCallback>
	//    9   15:areturn         
	}

	public Object getExitTransition()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return animationinfo.mExitTransition;
	//    7   11:aload_1         
	//    8   12:getfield        #524 <Field Object Fragment$AnimationInfo.mExitTransition>
	//    9   15:areturn         
	}

	SharedElementCallback getExitTransitionCallback()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return animationinfo.mExitTransitionCallback;
	//    7   11:aload_1         
	//    8   12:getfield        #528 <Field SharedElementCallback Fragment$AnimationInfo.mExitTransitionCallback>
	//    9   15:areturn         
	}

	public final FragmentManager getFragmentManager()
	{
		return ((FragmentManager) (mFragmentManager));
	//    0    0:aload_0         
	//    1    1:getfield        #354 <Field FragmentManagerImpl mFragmentManager>
	//    2    4:areturn         
	}

	public final Object getHost()
	{
		FragmentHostCallback fragmenthostcallback = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//    2    4:astore_1        
		if(fragmenthostcallback == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return fragmenthostcallback.onGetHost();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #533 <Method Object FragmentHostCallback.onGetHost()>
	//    9   15:areturn         
	}

	public final int getId()
	{
		return mFragmentId;
	//    0    0:aload_0         
	//    1    1:getfield        #273 <Field int mFragmentId>
	//    2    4:ireturn         
	}

	public final LayoutInflater getLayoutInflater()
	{
		LayoutInflater layoutinflater = mLayoutInflater;
	//    0    0:aload_0         
	//    1    1:getfield        #538 <Field LayoutInflater mLayoutInflater>
	//    2    4:astore_1        
		if(layoutinflater == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       15
			return performGetLayoutInflater(((Bundle) (null)));
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #542 <Method LayoutInflater performGetLayoutInflater(Bundle)>
	//    8   14:areturn         
		else
			return layoutinflater;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public LayoutInflater getLayoutInflater(Bundle bundle)
	{
		bundle = ((Bundle) (mHost));
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          32
		{
			bundle = ((Bundle) (((FragmentHostCallback) (bundle)).onGetLayoutInflater()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #550 <Method LayoutInflater FragmentHostCallback.onGetLayoutInflater()>
	//    7   13:astore_1        
			getChildFragmentManager();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #552 <Method FragmentManager getChildFragmentManager()>
	//   10   18:pop             
			LayoutInflaterCompat.setFactory2(((LayoutInflater) (bundle)), mChildFragmentManager.getLayoutInflaterFactory());
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   14   24:invokevirtual   #556 <Method android.view.LayoutInflater$Factory2 FragmentManagerImpl.getLayoutInflaterFactory()>
	//   15   27:invokestatic    #562 <Method void LayoutInflaterCompat.setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return ((LayoutInflater) (bundle));
	//   16   30:aload_1         
	//   17   31:areturn         
		} else
		{
			throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
	//   18   32:new             #564 <Class IllegalStateException>
	//   19   35:dup             
	//   20   36:ldc2            #566 <String "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.">
	//   21   39:invokespecial   #568 <Method void IllegalStateException(String)>
	//   22   42:athrow          
		}
	}

	public Lifecycle getLifecycle()
	{
		return ((Lifecycle) (mLifecycleRegistry));
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field LifecycleRegistry mLifecycleRegistry>
	//    2    4:areturn         
	}

	public LoaderManager getLoaderManager()
	{
		return LoaderManager.getInstance(((LifecycleOwner) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #428 <Method LoaderManager LoaderManager.getInstance(LifecycleOwner)>
	//    2    4:areturn         
	}

	int getNextAnim()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return animationinfo.mNextAnim;
	//    7   11:aload_1         
	//    8   12:getfield        #576 <Field int Fragment$AnimationInfo.mNextAnim>
	//    9   15:ireturn         
	}

	int getNextTransition()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return animationinfo.mNextTransition;
	//    7   11:aload_1         
	//    8   12:getfield        #580 <Field int Fragment$AnimationInfo.mNextTransition>
	//    9   15:ireturn         
	}

	int getNextTransitionStyle()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return animationinfo.mNextTransitionStyle;
	//    7   11:aload_1         
	//    8   12:getfield        #584 <Field int Fragment$AnimationInfo.mNextTransitionStyle>
	//    9   15:ireturn         
	}

	public final Fragment getParentFragment()
	{
		return mParentFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #365 <Field Fragment mParentFragment>
	//    2    4:areturn         
	}

	public Object getReenterTransition()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(animationinfo.mReenterTransition == USE_DEFAULT_TRANSITION)
	//*   7   11:aload_1         
	//*   8   12:getfield        #590 <Field Object Fragment$AnimationInfo.mReenterTransition>
	//*   9   15:getstatic       #129 <Field Object USE_DEFAULT_TRANSITION>
	//*  10   18:if_acmpne       26
			return getExitTransition();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #592 <Method Object getExitTransition()>
	//   13   25:areturn         
		else
			return mAnimationInfo.mReenterTransition;
	//   14   26:aload_0         
	//   15   27:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//   16   30:getfield        #590 <Field Object Fragment$AnimationInfo.mReenterTransition>
	//   17   33:areturn         
	}

	public final Resources getResources()
	{
		return requireContext().getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #597 <Method Context requireContext()>
	//    2    4:invokevirtual   #599 <Method Resources Context.getResources()>
	//    3    7:areturn         
	}

	public final boolean getRetainInstance()
	{
		return mRetainInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #346 <Field boolean mRetainInstance>
	//    2    4:ireturn         
	}

	public Object getReturnTransition()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(animationinfo.mReturnTransition == USE_DEFAULT_TRANSITION)
	//*   7   11:aload_1         
	//*   8   12:getfield        #604 <Field Object Fragment$AnimationInfo.mReturnTransition>
	//*   9   15:getstatic       #129 <Field Object USE_DEFAULT_TRANSITION>
	//*  10   18:if_acmpne       26
			return getEnterTransition();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #606 <Method Object getEnterTransition()>
	//   13   25:areturn         
		else
			return mAnimationInfo.mReturnTransition;
	//   14   26:aload_0         
	//   15   27:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//   16   30:getfield        #604 <Field Object Fragment$AnimationInfo.mReturnTransition>
	//   17   33:areturn         
	}

	public Object getSharedElementEnterTransition()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return animationinfo.mSharedElementEnterTransition;
	//    7   11:aload_1         
	//    8   12:getfield        #610 <Field Object Fragment$AnimationInfo.mSharedElementEnterTransition>
	//    9   15:areturn         
	}

	public Object getSharedElementReturnTransition()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(animationinfo.mSharedElementReturnTransition == USE_DEFAULT_TRANSITION)
	//*   7   11:aload_1         
	//*   8   12:getfield        #614 <Field Object Fragment$AnimationInfo.mSharedElementReturnTransition>
	//*   9   15:getstatic       #129 <Field Object USE_DEFAULT_TRANSITION>
	//*  10   18:if_acmpne       26
			return getSharedElementEnterTransition();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #616 <Method Object getSharedElementEnterTransition()>
	//   13   25:areturn         
		else
			return mAnimationInfo.mSharedElementReturnTransition;
	//   14   26:aload_0         
	//   15   27:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//   16   30:getfield        #614 <Field Object Fragment$AnimationInfo.mSharedElementReturnTransition>
	//   17   33:areturn         
	}

	int getStateAfterAnimating()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return animationinfo.mStateAfterAnimating;
	//    7   11:aload_1         
	//    8   12:getfield        #619 <Field int Fragment$AnimationInfo.mStateAfterAnimating>
	//    9   15:ireturn         
	}

	public final String getString(int i)
	{
		return getResources().getString(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #622 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #626 <Method String Resources.getString(int)>
	//    4    8:areturn         
	}

	public final transient String getString(int i, Object aobj[])
	{
		return getResources().getString(i, aobj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #622 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #629 <Method String Resources.getString(int, Object[])>
	//    5    9:areturn         
	}

	public final String getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field String mTag>
	//    2    4:areturn         
	}

	public final Fragment getTargetFragment()
	{
		return mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #381 <Field Fragment mTarget>
	//    2    4:areturn         
	}

	public final int getTargetRequestCode()
	{
		return mTargetRequestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #389 <Field int mTargetRequestCode>
	//    2    4:ireturn         
	}

	public final CharSequence getText(int i)
	{
		return getResources().getText(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #622 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #636 <Method CharSequence Resources.getText(int)>
	//    4    8:areturn         
	}

	public boolean getUserVisibleHint()
	{
		return mUserVisibleHint;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field boolean mUserVisibleHint>
	//    2    4:ireturn         
	}

	public View getView()
	{
		return mView;
	//    0    0:aload_0         
	//    1    1:getfield        #401 <Field View mView>
	//    2    4:areturn         
	}

	public LifecycleOwner getViewLifecycleOwner()
	{
		LifecycleOwner lifecycleowner = mViewLifecycleOwner;
	//    0    0:aload_0         
	//    1    1:getfield        #643 <Field LifecycleOwner mViewLifecycleOwner>
	//    2    4:astore_1        
		if(lifecycleowner != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return lifecycleowner;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
	//    7   11:new             #564 <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:ldc2            #645 <String "Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()">
	//   10   18:invokespecial   #568 <Method void IllegalStateException(String)>
	//   11   21:athrow          
	}

	public LiveData getViewLifecycleOwnerLiveData()
	{
		return ((LiveData) (mViewLifecycleOwnerLiveData));
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field MutableLiveData mViewLifecycleOwnerLiveData>
	//    2    4:areturn         
	}

	public ViewModelStore getViewModelStore()
	{
		if(getContext() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #422 <Method Context getContext()>
	//*   2    4:ifnull          30
		{
			if(mViewModelStore == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #653 <Field ViewModelStore mViewModelStore>
	//*   5   11:ifnonnull       25
				mViewModelStore = new ViewModelStore();
	//    6   14:aload_0         
	//    7   15:new             #655 <Class ViewModelStore>
	//    8   18:dup             
	//    9   19:invokespecial   #656 <Method void ViewModelStore()>
	//   10   22:putfield        #653 <Field ViewModelStore mViewModelStore>
			return mViewModelStore;
	//   11   25:aload_0         
	//   12   26:getfield        #653 <Field ViewModelStore mViewModelStore>
	//   13   29:areturn         
		} else
		{
			throw new IllegalStateException("Can't access ViewModels from detached fragment");
	//   14   30:new             #564 <Class IllegalStateException>
	//   15   33:dup             
	//   16   34:ldc2            #658 <String "Can't access ViewModels from detached fragment">
	//   17   37:invokespecial   #568 <Method void IllegalStateException(String)>
	//   18   40:athrow          
		}
	}

	public final boolean hasOptionsMenu()
	{
		return mHasMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field boolean mHasMenu>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #662 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	void initState()
	{
		mIndex = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #134 <Field int mIndex>
		mWho = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #301 <Field String mWho>
		mAdded = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #311 <Field boolean mAdded>
		mRemoving = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #318 <Field boolean mRemoving>
		mFromLayout = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #322 <Field boolean mFromLayout>
		mInLayout = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #326 <Field boolean mInLayout>
		mRestored = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #665 <Field boolean mRestored>
		mBackStackNesting = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #305 <Field int mBackStackNesting>
		mFragmentManager = null;
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:putfield        #354 <Field FragmentManagerImpl mFragmentManager>
		mChildFragmentManager = null;
	//   27   45:aload_0         
	//   28   46:aconst_null     
	//   29   47:putfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
		mHost = null;
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:putfield        #361 <Field FragmentHostCallback mHost>
		mFragmentId = 0;
	//   33   55:aload_0         
	//   34   56:iconst_0        
	//   35   57:putfield        #273 <Field int mFragmentId>
		mContainerId = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #283 <Field int mContainerId>
		mTag = null;
	//   39   65:aload_0         
	//   40   66:aconst_null     
	//   41   67:putfield        #287 <Field String mTag>
		mHidden = false;
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:putfield        #332 <Field boolean mHidden>
		mDetached = false;
	//   45   75:aload_0         
	//   46   76:iconst_0        
	//   47   77:putfield        #336 <Field boolean mDetached>
		mRetaining = false;
	//   48   80:aload_0         
	//   49   81:iconst_0        
	//   50   82:putfield        #350 <Field boolean mRetaining>
	//   51   85:return          
	}

	void instantiateChildFragmentManager()
	{
		if(mHost != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//*   2    4:ifnull          39
		{
			mChildFragmentManager = new FragmentManagerImpl();
	//    3    7:aload_0         
	//    4    8:new             #443 <Class FragmentManagerImpl>
	//    5   11:dup             
	//    6   12:invokespecial   #666 <Method void FragmentManagerImpl()>
	//    7   15:putfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
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
					if(mView != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #15  <Field Fragment this$0>
				//*   2    4:getfield        #35  <Field View Fragment.mView>
				//*   3    7:ifnull          22
						return mView.findViewById(i);
				//    4   10:aload_0         
				//    5   11:getfield        #15  <Field Fragment this$0>
				//    6   14:getfield        #35  <Field View Fragment.mView>
				//    7   17:iload_1         
				//    8   18:invokevirtual   #40  <Method View View.findViewById(int)>
				//    9   21:areturn         
					else
						throw new IllegalStateException("Fragment does not have a view");
				//   10   22:new             #42  <Class IllegalStateException>
				//   11   25:dup             
				//   12   26:ldc1            #44  <String "Fragment does not have a view">
				//   13   28:invokespecial   #47  <Method void IllegalStateException(String)>
				//   14   31:athrow          
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
	//    8   18:aload_0         
	//    9   19:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   10   22:aload_0         
	//   11   23:getfield        #361 <Field FragmentHostCallback mHost>
	//   12   26:new             #16  <Class Fragment$2>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokespecial   #669 <Method void Fragment$2(Fragment)>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #673 <Method void FragmentManagerImpl.attachController(FragmentHostCallback, FragmentContainer, Fragment)>
			return;
	//   18   38:return          
		} else
		{
			throw new IllegalStateException("Fragment has not been attached yet.");
	//   19   39:new             #564 <Class IllegalStateException>
	//   20   42:dup             
	//   21   43:ldc2            #675 <String "Fragment has not been attached yet.">
	//   22   46:invokespecial   #568 <Method void IllegalStateException(String)>
	//   23   49:athrow          
		}
	}

	public final boolean isAdded()
	{
		return mHost != null && mAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #311 <Field boolean mAdded>
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
	//    1    1:getfield        #336 <Field boolean mDetached>
	//    2    4:ireturn         
	}

	public final boolean isHidden()
	{
		return mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field boolean mHidden>
	//    2    4:ireturn         
	}

	boolean isHideReplaced()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return animationinfo.mIsHideReplaced;
	//    7   11:aload_1         
	//    8   12:getfield        #682 <Field boolean Fragment$AnimationInfo.mIsHideReplaced>
	//    9   15:ireturn         
	}

	final boolean isInBackStack()
	{
		return mBackStackNesting > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #305 <Field int mBackStackNesting>
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
	//    1    1:getfield        #326 <Field boolean mInLayout>
	//    2    4:ireturn         
	}

	public final boolean isMenuVisible()
	{
		return mMenuVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field boolean mMenuVisible>
	//    2    4:ireturn         
	}

	boolean isPostponed()
	{
		AnimationInfo animationinfo = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//    2    4:astore_1        
		if(animationinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return animationinfo.mEnterTransitionPostponed;
	//    7   11:aload_1         
	//    8   12:getfield        #254 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//    9   15:ireturn         
	}

	public final boolean isRemoving()
	{
		return mRemoving;
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field boolean mRemoving>
	//    2    4:ireturn         
	}

	public final boolean isResumed()
	{
		return mState >= 4;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int mState>
	//    2    4:iconst_4        
	//    3    5:icmplt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean isStateSaved()
	{
		FragmentManagerImpl fragmentmanagerimpl = mFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #354 <Field FragmentManagerImpl mFragmentManager>
	//    2    4:astore_1        
		if(fragmentmanagerimpl == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return fragmentmanagerimpl.isStateSaved();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #691 <Method boolean FragmentManagerImpl.isStateSaved()>
	//    9   15:ireturn         
	}

	public final boolean isVisible()
	{
		if(isAdded() && !isHidden())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #694 <Method boolean isAdded()>
	//*   2    4:ifeq            42
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #696 <Method boolean isHidden()>
	//*   5   11:ifne            42
		{
			View view = mView;
	//    6   14:aload_0         
	//    7   15:getfield        #401 <Field View mView>
	//    8   18:astore_1        
			if(view != null && view.getWindowToken() != null && mView.getVisibility() == 0)
	//*   9   19:aload_1         
	//*  10   20:ifnull          42
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #702 <Method android.os.IBinder View.getWindowToken()>
	//*  13   27:ifnull          42
	//*  14   30:aload_0         
	//*  15   31:getfield        #401 <Field View mView>
	//*  16   34:invokevirtual   #705 <Method int View.getVisibility()>
	//*  17   37:ifne            42
				return true;
	//   18   40:iconst_1        
	//   19   41:ireturn         
		}
		return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
	}

	void noteStateNotSaved()
	{
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:astore_1        
		if(fragmentmanagerimpl != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			fragmentmanagerimpl.noteStateNotSaved();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #708 <Method void FragmentManagerImpl.noteStateNotSaved()>
	//    7   13:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #712 <Field boolean mCalled>
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
	//    2    2:putfield        #712 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onAttach(Context context)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #712 <Field boolean mCalled>
		context = ((Context) (mHost));
	//    3    5:aload_0         
	//    4    6:getfield        #361 <Field FragmentHostCallback mHost>
	//    5    9:astore_1        
		if(context == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       19
			context = null;
	//    8   14:aconst_null     
	//    9   15:astore_1        
		else
	//*  10   16:goto            24
			context = ((Context) (((FragmentHostCallback) (context)).getActivity()));
	//   11   19:aload_1         
	//   12   20:invokevirtual   #462 <Method Activity FragmentHostCallback.getActivity()>
	//   13   23:astore_1        
		if(context != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          38
		{
			mCalled = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #712 <Field boolean mCalled>
			onAttach(((Activity) (context)));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #719 <Method void onAttach(Activity)>
		}
	//   22   38:return          
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
	//    2    2:putfield        #712 <Field boolean mCalled>
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
	//    2    2:putfield        #712 <Field boolean mCalled>
		restoreChildFragmentState(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #728 <Method void restoreChildFragmentState(Bundle)>
		bundle = ((Bundle) (mChildFragmentManager));
	//    6   10:aload_0         
	//    7   11:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    8   14:astore_1        
		if(bundle != null && !((FragmentManagerImpl) (bundle)).isStateAtLeast(1))
	//*   9   15:aload_1         
	//*  10   16:ifnull          34
	//*  11   19:aload_1         
	//*  12   20:iconst_1        
	//*  13   21:invokevirtual   #732 <Method boolean FragmentManagerImpl.isStateAtLeast(int)>
	//*  14   24:ifne            34
			mChildFragmentManager.dispatchCreate();
	//   15   27:aload_0         
	//   16   28:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   17   31:invokevirtual   #508 <Method void FragmentManagerImpl.dispatchCreate()>
	//   18   34:return          
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
	//    1    1:invokevirtual   #740 <Method FragmentActivity getActivity()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #742 <Method void FragmentActivity.onCreateContextMenu(ContextMenu, View, android.view.ContextMenu$ContextMenuInfo)>
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
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		mCalled = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #712 <Field boolean mCalled>
		Object obj = ((Object) (getActivity()));
	//    5    7:aload_0         
	//    6    8:invokevirtual   #740 <Method FragmentActivity getActivity()>
	//    7   11:astore_2        
		if(obj == null || !((FragmentActivity) (obj)).isChangingConfigurations())
	//*   8   12:aload_2         
	//*   9   13:ifnull          26
	//*  10   16:aload_2         
	//*  11   17:invokevirtual   #750 <Method boolean FragmentActivity.isChangingConfigurations()>
	//*  12   20:ifeq            26
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_1        
		obj = ((Object) (mViewModelStore));
	//   16   28:aload_0         
	//   17   29:getfield        #653 <Field ViewModelStore mViewModelStore>
	//   18   32:astore_2        
		if(obj != null && !flag)
	//*  19   33:aload_2         
	//*  20   34:ifnull          45
	//*  21   37:iload_1         
	//*  22   38:ifne            45
			((ViewModelStore) (obj)).clear();
	//   23   41:aload_2         
	//   24   42:invokevirtual   #753 <Method void ViewModelStore.clear()>
	//   25   45:return          
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
	//    2    2:putfield        #712 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onDetach()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #712 <Field boolean mCalled>
	//    3    5:return          
	}

	public LayoutInflater onGetLayoutInflater(Bundle bundle)
	{
		return getLayoutInflater(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #758 <Method LayoutInflater getLayoutInflater(Bundle)>
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
	//    2    2:putfield        #712 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onInflate(Context context, AttributeSet attributeset, Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #712 <Field boolean mCalled>
		context = ((Context) (mHost));
	//    3    5:aload_0         
	//    4    6:getfield        #361 <Field FragmentHostCallback mHost>
	//    5    9:astore_1        
		if(context == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       19
			context = null;
	//    8   14:aconst_null     
	//    9   15:astore_1        
		else
	//*  10   16:goto            24
			context = ((Context) (((FragmentHostCallback) (context)).getActivity()));
	//   11   19:aload_1         
	//   12   20:invokevirtual   #462 <Method Activity FragmentHostCallback.getActivity()>
	//   13   23:astore_1        
		if(context != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          40
		{
			mCalled = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #712 <Field boolean mCalled>
			onInflate(((Activity) (context)), attributeset, bundle);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:aload_2         
	//   22   36:aload_3         
	//   23   37:invokevirtual   #764 <Method void onInflate(Activity, AttributeSet, Bundle)>
		}
	//   24   40:return          
	}

	public void onLowMemory()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #712 <Field boolean mCalled>
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
	//    2    2:putfield        #712 <Field boolean mCalled>
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
	//    2    2:putfield        #712 <Field boolean mCalled>
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
	//    2    2:putfield        #712 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onStop()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #712 <Field boolean mCalled>
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
	//    2    2:putfield        #712 <Field boolean mCalled>
	//    3    5:return          
	}

	FragmentManager peekChildFragmentManager()
	{
		return ((FragmentManager) (mChildFragmentManager));
	//    0    0:aload_0         
	//    1    1:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:areturn         
	}

	void performActivityCreated(Bundle bundle)
	{
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:astore_2        
		if(fragmentmanagerimpl != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			fragmentmanagerimpl.noteStateNotSaved();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #708 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mState = 2;
	//    7   13:aload_0         
	//    8   14:iconst_2        
	//    9   15:putfield        #132 <Field int mState>
		mCalled = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #712 <Field boolean mCalled>
		onActivityCreated(bundle);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #785 <Method void onActivityCreated(Bundle)>
		if(mCalled)
	//*  16   28:aload_0         
	//*  17   29:getfield        #712 <Field boolean mCalled>
	//*  18   32:ifeq            49
		{
			bundle = ((Bundle) (mChildFragmentManager));
	//   19   35:aload_0         
	//   20   36:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   21   39:astore_1        
			if(bundle != null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          48
				((FragmentManagerImpl) (bundle)).dispatchActivityCreated();
	//   24   44:aload_1         
	//   25   45:invokevirtual   #505 <Method void FragmentManagerImpl.dispatchActivityCreated()>
			return;
	//   26   48:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   27   49:new             #221 <Class StringBuilder>
	//   28   52:dup             
	//   29   53:invokespecial   #222 <Method void StringBuilder()>
	//   30   56:astore_1        
			((StringBuilder) (bundle)).append("Fragment ");
	//   31   57:aload_1         
	//   32   58:ldc2            #787 <String "Fragment ">
	//   33   61:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   34   64:pop             
			((StringBuilder) (bundle)).append(((Object) (this)));
	//   35   65:aload_1         
	//   36   66:aload_0         
	//   37   67:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   38   70:pop             
			((StringBuilder) (bundle)).append(" did not call through to super.onActivityCreated()");
	//   39   71:aload_1         
	//   40   72:ldc2            #789 <String " did not call through to super.onActivityCreated()">
	//   41   75:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
			throw new SuperNotCalledException(((StringBuilder) (bundle)).toString());
	//   43   79:new             #791 <Class SuperNotCalledException>
	//   44   82:dup             
	//   45   83:aload_1         
	//   46   84:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   47   87:invokespecial   #792 <Method void SuperNotCalledException(String)>
	//   48   90:athrow          
		}
	}

	void performConfigurationChanged(Configuration configuration)
	{
		onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #795 <Method void onConfigurationChanged(Configuration)>
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    3    5:aload_0         
	//    4    6:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    5    9:astore_2        
		if(fragmentmanagerimpl != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			fragmentmanagerimpl.dispatchConfigurationChanged(configuration);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #798 <Method void FragmentManagerImpl.dispatchConfigurationChanged(Configuration)>
	//   11   19:return          
	}

	boolean performContextItemSelected(MenuItem menuitem)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean mHidden>
	//*   2    4:ifne            36
		{
			if(onContextItemSelected(menuitem))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #801 <Method boolean onContextItemSelected(MenuItem)>
	//*   6   12:ifeq            17
				return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
			FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    9   17:aload_0         
	//   10   18:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   11   21:astore_2        
			if(fragmentmanagerimpl != null && fragmentmanagerimpl.dispatchContextItemSelected(menuitem))
	//*  12   22:aload_2         
	//*  13   23:ifnull          36
	//*  14   26:aload_2         
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #804 <Method boolean FragmentManagerImpl.dispatchContextItemSelected(MenuItem)>
	//*  17   31:ifeq            36
				return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
		}
		return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
	}

	void performCreate(Bundle bundle)
	{
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:astore_2        
		if(fragmentmanagerimpl != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			fragmentmanagerimpl.noteStateNotSaved();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #708 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mState = 1;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #132 <Field int mState>
		mCalled = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #712 <Field boolean mCalled>
		onCreate(bundle);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #807 <Method void onCreate(Bundle)>
		mIsCreated = true;
	//   16   28:aload_0         
	//   17   29:iconst_1        
	//   18   30:putfield        #809 <Field boolean mIsCreated>
		if(mCalled)
	//*  19   33:aload_0         
	//*  20   34:getfield        #712 <Field boolean mCalled>
	//*  21   37:ifeq            51
		{
			mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_CREATE);
	//   22   40:aload_0         
	//   23   41:getfield        #147 <Field LifecycleRegistry mLifecycleRegistry>
	//   24   44:getstatic       #815 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_CREATE>
	//   25   47:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
			return;
	//   26   50:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   27   51:new             #221 <Class StringBuilder>
	//   28   54:dup             
	//   29   55:invokespecial   #222 <Method void StringBuilder()>
	//   30   58:astore_1        
			((StringBuilder) (bundle)).append("Fragment ");
	//   31   59:aload_1         
	//   32   60:ldc2            #787 <String "Fragment ">
	//   33   63:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
			((StringBuilder) (bundle)).append(((Object) (this)));
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   38   72:pop             
			((StringBuilder) (bundle)).append(" did not call through to super.onCreate()");
	//   39   73:aload_1         
	//   40   74:ldc2            #821 <String " did not call through to super.onCreate()">
	//   41   77:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   42   80:pop             
			throw new SuperNotCalledException(((StringBuilder) (bundle)).toString());
	//   43   81:new             #791 <Class SuperNotCalledException>
	//   44   84:dup             
	//   45   85:aload_1         
	//   46   86:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   47   89:invokespecial   #792 <Method void SuperNotCalledException(String)>
	//   48   92:athrow          
		}
	}

	boolean performCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
		boolean flag1 = mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field boolean mHidden>
	//    2    4:istore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag3 = false;
	//    5    8:iconst_0        
	//    6    9:istore          5
		if(!flag1)
	//*   7   11:iload           4
	//*   8   13:ifne            72
		{
			boolean flag2 = flag3;
	//    9   16:iload           5
	//   10   18:istore          4
			if(mHasMenu)
	//*  11   20:aload_0         
	//*  12   21:getfield        #342 <Field boolean mHasMenu>
	//*  13   24:ifeq            47
			{
				flag2 = flag3;
	//   14   27:iload           5
	//   15   29:istore          4
				if(mMenuVisible)
	//*  16   31:aload_0         
	//*  17   32:getfield        #138 <Field boolean mMenuVisible>
	//*  18   35:ifeq            47
				{
					onCreateOptionsMenu(menu, menuinflater);
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:aload_2         
	//   22   41:invokevirtual   #825 <Method void onCreateOptionsMenu(Menu, MenuInflater)>
					flag2 = true;
	//   23   44:iconst_1        
	//   24   45:istore          4
				}
			}
			FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//   25   47:aload_0         
	//   26   48:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   27   51:astore          6
			flag = flag2;
	//   28   53:iload           4
	//   29   55:istore_3        
			if(fragmentmanagerimpl != null)
	//*  30   56:aload           6
	//*  31   58:ifnull          72
				flag = flag2 | fragmentmanagerimpl.dispatchCreateOptionsMenu(menu, menuinflater);
	//   32   61:iload           4
	//   33   63:aload           6
	//   34   65:aload_1         
	//   35   66:aload_2         
	//   36   67:invokevirtual   #828 <Method boolean FragmentManagerImpl.dispatchCreateOptionsMenu(Menu, MenuInflater)>
	//   37   70:ior             
	//   38   71:istore_3        
		}
		return flag;
	//   39   72:iload_3         
	//   40   73:ireturn         
	}

	void performCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:astore          4
		if(fragmentmanagerimpl != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          16
			fragmentmanagerimpl.noteStateNotSaved();
	//    5   11:aload           4
	//    6   13:invokevirtual   #708 <Method void FragmentManagerImpl.noteStateNotSaved()>
		mPerformedCreateView = true;
	//    7   16:aload_0         
	//    8   17:iconst_1        
	//    9   18:putfield        #832 <Field boolean mPerformedCreateView>
		mViewLifecycleOwner = new LifecycleOwner() {

			public Lifecycle getLifecycle()
			{
				if(mViewLifecycleRegistry == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field Fragment this$0>
			//*   2    4:getfield        #27  <Field LifecycleRegistry Fragment.mViewLifecycleRegistry>
			//*   3    7:ifnonnull       30
				{
					Fragment fragment = Fragment.this;
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field Fragment this$0>
			//    6   14:astore_1        
					fragment.mViewLifecycleRegistry = new LifecycleRegistry(fragment.mViewLifecycleOwner);
			//    7   15:aload_1         
			//    8   16:new             #29  <Class LifecycleRegistry>
			//    9   19:dup             
			//   10   20:aload_1         
			//   11   21:getfield        #33  <Field LifecycleOwner Fragment.mViewLifecycleOwner>
			//   12   24:invokespecial   #36  <Method void LifecycleRegistry(LifecycleOwner)>
			//   13   27:putfield        #27  <Field LifecycleRegistry Fragment.mViewLifecycleRegistry>
				}
				return ((Lifecycle) (mViewLifecycleRegistry));
			//   14   30:aload_0         
			//   15   31:getfield        #17  <Field Fragment this$0>
			//   16   34:getfield        #27  <Field LifecycleRegistry Fragment.mViewLifecycleRegistry>
			//   17   37:areturn         
			}

			final Fragment this$0;

			
			{
				this$0 = Fragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Fragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   10   21:aload_0         
	//   11   22:new             #18  <Class Fragment$3>
	//   12   25:dup             
	//   13   26:aload_0         
	//   14   27:invokespecial   #833 <Method void Fragment$3(Fragment)>
	//   15   30:putfield        #643 <Field LifecycleOwner mViewLifecycleOwner>
		mViewLifecycleRegistry = null;
	//   16   33:aload_0         
	//   17   34:aconst_null     
	//   18   35:putfield        #835 <Field LifecycleRegistry mViewLifecycleRegistry>
		mView = onCreateView(layoutinflater, viewgroup, bundle);
	//   19   38:aload_0         
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:aload_3         
	//   24   43:invokevirtual   #837 <Method View onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//   25   46:putfield        #401 <Field View mView>
		if(mView != null)
	//*  26   49:aload_0         
	//*  27   50:getfield        #401 <Field View mView>
	//*  28   53:ifnull          78
		{
			mViewLifecycleOwner.getLifecycle();
	//   29   56:aload_0         
	//   30   57:getfield        #643 <Field LifecycleOwner mViewLifecycleOwner>
	//   31   60:invokeinterface #839 <Method Lifecycle LifecycleOwner.getLifecycle()>
	//   32   65:pop             
			mViewLifecycleOwnerLiveData.setValue(((Object) (mViewLifecycleOwner)));
	//   33   66:aload_0         
	//   34   67:getfield        #152 <Field MutableLiveData mViewLifecycleOwnerLiveData>
	//   35   70:aload_0         
	//   36   71:getfield        #643 <Field LifecycleOwner mViewLifecycleOwner>
	//   37   74:invokevirtual   #842 <Method void MutableLiveData.setValue(Object)>
			return;
	//   38   77:return          
		}
		if(mViewLifecycleRegistry == null)
	//*  39   78:aload_0         
	//*  40   79:getfield        #835 <Field LifecycleRegistry mViewLifecycleRegistry>
	//*  41   82:ifnonnull       91
		{
			mViewLifecycleOwner = null;
	//   42   85:aload_0         
	//   43   86:aconst_null     
	//   44   87:putfield        #643 <Field LifecycleOwner mViewLifecycleOwner>
			return;
	//   45   90:return          
		} else
		{
			throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
	//   46   91:new             #564 <Class IllegalStateException>
	//   47   94:dup             
	//   48   95:ldc2            #844 <String "Called getViewLifecycleOwner() but onCreateView() returned null">
	//   49   98:invokespecial   #568 <Method void IllegalStateException(String)>
	//   50  101:athrow          
		}
	}

	void performDestroy()
	{
		mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_DESTROY);
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field LifecycleRegistry mLifecycleRegistry>
	//    2    4:getstatic       #848 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_DESTROY>
	//    3    7:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    4   10:aload_0         
	//    5   11:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    6   14:astore_1        
		if(fragmentmanagerimpl != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          23
			fragmentmanagerimpl.dispatchDestroy();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #851 <Method void FragmentManagerImpl.dispatchDestroy()>
		mState = 0;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #132 <Field int mState>
		mCalled = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #712 <Field boolean mCalled>
		mIsCreated = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #809 <Field boolean mIsCreated>
		onDestroy();
	//   20   38:aload_0         
	//   21   39:invokevirtual   #853 <Method void onDestroy()>
		if(mCalled)
	//*  22   42:aload_0         
	//*  23   43:getfield        #712 <Field boolean mCalled>
	//*  24   46:ifeq            55
		{
			mChildFragmentManager = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
			return;
	//   28   54:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   29   55:new             #221 <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #222 <Method void StringBuilder()>
	//   32   62:astore_1        
			stringbuilder.append("Fragment ");
	//   33   63:aload_1         
	//   34   64:ldc2            #787 <String "Fragment ">
	//   35   67:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
			stringbuilder.append(((Object) (this)));
	//   37   71:aload_1         
	//   38   72:aload_0         
	//   39   73:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   40   76:pop             
			stringbuilder.append(" did not call through to super.onDestroy()");
	//   41   77:aload_1         
	//   42   78:ldc2            #855 <String " did not call through to super.onDestroy()">
	//   43   81:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   45   85:new             #791 <Class SuperNotCalledException>
	//   46   88:dup             
	//   47   89:aload_1         
	//   48   90:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   49   93:invokespecial   #792 <Method void SuperNotCalledException(String)>
	//   50   96:athrow          
		}
	}

	void performDestroyView()
	{
		if(mView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #401 <Field View mView>
	//*   2    4:ifnull          17
			mViewLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_DESTROY);
	//    3    7:aload_0         
	//    4    8:getfield        #835 <Field LifecycleRegistry mViewLifecycleRegistry>
	//    5   11:getstatic       #848 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_DESTROY>
	//    6   14:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    7   17:aload_0         
	//    8   18:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    9   21:astore_1        
		if(fragmentmanagerimpl != null)
	//*  10   22:aload_1         
	//*  11   23:ifnull          30
			fragmentmanagerimpl.dispatchDestroyView();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #859 <Method void FragmentManagerImpl.dispatchDestroyView()>
		mState = 1;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #132 <Field int mState>
		mCalled = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #712 <Field boolean mCalled>
		onDestroyView();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #861 <Method void onDestroyView()>
		if(mCalled)
	//*  22   44:aload_0         
	//*  23   45:getfield        #712 <Field boolean mCalled>
	//*  24   48:ifeq            64
		{
			LoaderManager.getInstance(((LifecycleOwner) (this))).markForRedelivery();
	//   25   51:aload_0         
	//   26   52:invokestatic    #428 <Method LoaderManager LoaderManager.getInstance(LifecycleOwner)>
	//   27   55:invokevirtual   #864 <Method void LoaderManager.markForRedelivery()>
			mPerformedCreateView = false;
	//   28   58:aload_0         
	//   29   59:iconst_0        
	//   30   60:putfield        #832 <Field boolean mPerformedCreateView>
			return;
	//   31   63:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   32   64:new             #221 <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #222 <Method void StringBuilder()>
	//   35   71:astore_1        
			stringbuilder.append("Fragment ");
	//   36   72:aload_1         
	//   37   73:ldc2            #787 <String "Fragment ">
	//   38   76:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
			stringbuilder.append(((Object) (this)));
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   43   85:pop             
			stringbuilder.append(" did not call through to super.onDestroyView()");
	//   44   86:aload_1         
	//   45   87:ldc2            #866 <String " did not call through to super.onDestroyView()">
	//   46   90:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   48   94:new             #791 <Class SuperNotCalledException>
	//   49   97:dup             
	//   50   98:aload_1         
	//   51   99:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   52  102:invokespecial   #792 <Method void SuperNotCalledException(String)>
	//   53  105:athrow          
		}
	}

	void performDetach()
	{
		mCalled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #712 <Field boolean mCalled>
		onDetach();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #869 <Method void onDetach()>
		mLayoutInflater = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #538 <Field LayoutInflater mLayoutInflater>
		if(mCalled)
	//*   8   14:aload_0         
	//*   9   15:getfield        #712 <Field boolean mCalled>
	//*  10   18:ifeq            98
		{
			FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//   11   21:aload_0         
	//   12   22:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   13   25:astore_1        
			if(fragmentmanagerimpl != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          97
			{
				if(mRetaining)
	//*  16   30:aload_0         
	//*  17   31:getfield        #350 <Field boolean mRetaining>
	//*  18   34:ifeq            47
				{
					fragmentmanagerimpl.dispatchDestroy();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #851 <Method void FragmentManagerImpl.dispatchDestroy()>
					mChildFragmentManager = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
					return;
	//   24   46:return          
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   25   47:new             #221 <Class StringBuilder>
	//   26   50:dup             
	//   27   51:invokespecial   #222 <Method void StringBuilder()>
	//   28   54:astore_1        
					stringbuilder.append("Child FragmentManager of ");
	//   29   55:aload_1         
	//   30   56:ldc2            #871 <String "Child FragmentManager of ">
	//   31   59:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
					stringbuilder.append(((Object) (this)));
	//   33   63:aload_1         
	//   34   64:aload_0         
	//   35   65:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   36   68:pop             
					stringbuilder.append(" was not ");
	//   37   69:aload_1         
	//   38   70:ldc2            #873 <String " was not ">
	//   39   73:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   40   76:pop             
					stringbuilder.append(" destroyed and this fragment is not retaining instance");
	//   41   77:aload_1         
	//   42   78:ldc2            #875 <String " destroyed and this fragment is not retaining instance">
	//   43   81:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
					throw new IllegalStateException(stringbuilder.toString());
	//   45   85:new             #564 <Class IllegalStateException>
	//   46   88:dup             
	//   47   89:aload_1         
	//   48   90:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   49   93:invokespecial   #568 <Method void IllegalStateException(String)>
	//   50   96:athrow          
				}
			} else
			{
				return;
	//   51   97:return          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   52   98:new             #221 <Class StringBuilder>
	//   53  101:dup             
	//   54  102:invokespecial   #222 <Method void StringBuilder()>
	//   55  105:astore_1        
			stringbuilder1.append("Fragment ");
	//   56  106:aload_1         
	//   57  107:ldc2            #787 <String "Fragment ">
	//   58  110:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   59  113:pop             
			stringbuilder1.append(((Object) (this)));
	//   60  114:aload_1         
	//   61  115:aload_0         
	//   62  116:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   63  119:pop             
			stringbuilder1.append(" did not call through to super.onDetach()");
	//   64  120:aload_1         
	//   65  121:ldc2            #877 <String " did not call through to super.onDetach()">
	//   66  124:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   67  127:pop             
			throw new SuperNotCalledException(stringbuilder1.toString());
	//   68  128:new             #791 <Class SuperNotCalledException>
	//   69  131:dup             
	//   70  132:aload_1         
	//   71  133:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   72  136:invokespecial   #792 <Method void SuperNotCalledException(String)>
	//   73  139:athrow          
		}
	}

	LayoutInflater performGetLayoutInflater(Bundle bundle)
	{
		mLayoutInflater = onGetLayoutInflater(bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #879 <Method LayoutInflater onGetLayoutInflater(Bundle)>
	//    4    6:putfield        #538 <Field LayoutInflater mLayoutInflater>
		return mLayoutInflater;
	//    5    9:aload_0         
	//    6   10:getfield        #538 <Field LayoutInflater mLayoutInflater>
	//    7   13:areturn         
	}

	void performLowMemory()
	{
		onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #882 <Method void onLowMemory()>
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    2    4:aload_0         
	//    3    5:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    4    8:astore_1        
		if(fragmentmanagerimpl != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			fragmentmanagerimpl.dispatchLowMemory();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #885 <Method void FragmentManagerImpl.dispatchLowMemory()>
	//    9   17:return          
	}

	void performMultiWindowModeChanged(boolean flag)
	{
		onMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #888 <Method void onMultiWindowModeChanged(boolean)>
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    3    5:aload_0         
	//    4    6:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    5    9:astore_2        
		if(fragmentmanagerimpl != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			fragmentmanagerimpl.dispatchMultiWindowModeChanged(flag);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #891 <Method void FragmentManagerImpl.dispatchMultiWindowModeChanged(boolean)>
	//   11   19:return          
	}

	boolean performOptionsItemSelected(MenuItem menuitem)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean mHidden>
	//*   2    4:ifne            50
		{
			if(mHasMenu && mMenuVisible && onOptionsItemSelected(menuitem))
	//*   3    7:aload_0         
	//*   4    8:getfield        #342 <Field boolean mHasMenu>
	//*   5   11:ifeq            31
	//*   6   14:aload_0         
	//*   7   15:getfield        #138 <Field boolean mMenuVisible>
	//*   8   18:ifeq            31
	//*   9   21:aload_0         
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #894 <Method boolean onOptionsItemSelected(MenuItem)>
	//*  12   26:ifeq            31
				return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
			FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//   15   31:aload_0         
	//   16   32:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   17   35:astore_2        
			if(fragmentmanagerimpl != null && fragmentmanagerimpl.dispatchOptionsItemSelected(menuitem))
	//*  18   36:aload_2         
	//*  19   37:ifnull          50
	//*  20   40:aload_2         
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #897 <Method boolean FragmentManagerImpl.dispatchOptionsItemSelected(MenuItem)>
	//*  23   45:ifeq            50
				return true;
	//   24   48:iconst_1        
	//   25   49:ireturn         
		}
		return false;
	//   26   50:iconst_0        
	//   27   51:ireturn         
	}

	void performOptionsMenuClosed(Menu menu)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field boolean mHidden>
	//*   2    4:ifne            40
		{
			if(mHasMenu && mMenuVisible)
	//*   3    7:aload_0         
	//*   4    8:getfield        #342 <Field boolean mHasMenu>
	//*   5   11:ifeq            26
	//*   6   14:aload_0         
	//*   7   15:getfield        #138 <Field boolean mMenuVisible>
	//*   8   18:ifeq            26
				onOptionsMenuClosed(menu);
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokevirtual   #900 <Method void onOptionsMenuClosed(Menu)>
			FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//   12   26:aload_0         
	//   13   27:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   14   30:astore_2        
			if(fragmentmanagerimpl != null)
	//*  15   31:aload_2         
	//*  16   32:ifnull          40
				fragmentmanagerimpl.dispatchOptionsMenuClosed(menu);
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #903 <Method void FragmentManagerImpl.dispatchOptionsMenuClosed(Menu)>
		}
	//   20   40:return          
	}

	void performPause()
	{
		if(mView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #401 <Field View mView>
	//*   2    4:ifnull          17
			mViewLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_PAUSE);
	//    3    7:aload_0         
	//    4    8:getfield        #835 <Field LifecycleRegistry mViewLifecycleRegistry>
	//    5   11:getstatic       #907 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_PAUSE>
	//    6   14:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
		mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_PAUSE);
	//    7   17:aload_0         
	//    8   18:getfield        #147 <Field LifecycleRegistry mLifecycleRegistry>
	//    9   21:getstatic       #907 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_PAUSE>
	//   10   24:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//   11   27:aload_0         
	//   12   28:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   13   31:astore_1        
		if(fragmentmanagerimpl != null)
	//*  14   32:aload_1         
	//*  15   33:ifnull          40
			fragmentmanagerimpl.dispatchPause();
	//   16   36:aload_1         
	//   17   37:invokevirtual   #910 <Method void FragmentManagerImpl.dispatchPause()>
		mState = 3;
	//   18   40:aload_0         
	//   19   41:iconst_3        
	//   20   42:putfield        #132 <Field int mState>
		mCalled = false;
	//   21   45:aload_0         
	//   22   46:iconst_0        
	//   23   47:putfield        #712 <Field boolean mCalled>
		onPause();
	//   24   50:aload_0         
	//   25   51:invokevirtual   #912 <Method void onPause()>
		if(mCalled)
	//*  26   54:aload_0         
	//*  27   55:getfield        #712 <Field boolean mCalled>
	//*  28   58:ifeq            62
		{
			return;
	//   29   61:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   62:new             #221 <Class StringBuilder>
	//   31   65:dup             
	//   32   66:invokespecial   #222 <Method void StringBuilder()>
	//   33   69:astore_1        
			stringbuilder.append("Fragment ");
	//   34   70:aload_1         
	//   35   71:ldc2            #787 <String "Fragment ">
	//   36   74:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			stringbuilder.append(((Object) (this)));
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   41   83:pop             
			stringbuilder.append(" did not call through to super.onPause()");
	//   42   84:aload_1         
	//   43   85:ldc2            #914 <String " did not call through to super.onPause()">
	//   44   88:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   45   91:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   46   92:new             #791 <Class SuperNotCalledException>
	//   47   95:dup             
	//   48   96:aload_1         
	//   49   97:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   50  100:invokespecial   #792 <Method void SuperNotCalledException(String)>
	//   51  103:athrow          
		}
	}

	void performPictureInPictureModeChanged(boolean flag)
	{
		onPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #917 <Method void onPictureInPictureModeChanged(boolean)>
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    3    5:aload_0         
	//    4    6:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    5    9:astore_2        
		if(fragmentmanagerimpl != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			fragmentmanagerimpl.dispatchPictureInPictureModeChanged(flag);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #920 <Method void FragmentManagerImpl.dispatchPictureInPictureModeChanged(boolean)>
	//   11   19:return          
	}

	boolean performPrepareOptionsMenu(Menu menu)
	{
		boolean flag1 = mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field boolean mHidden>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag3 = false;
	//    5    7:iconst_0        
	//    6    8:istore          4
		if(!flag1)
	//*   7   10:iload_3         
	//*   8   11:ifne            63
		{
			boolean flag2 = flag3;
	//    9   14:iload           4
	//   10   16:istore_3        
			if(mHasMenu)
	//*  11   17:aload_0         
	//*  12   18:getfield        #342 <Field boolean mHasMenu>
	//*  13   21:ifeq            41
			{
				flag2 = flag3;
	//   14   24:iload           4
	//   15   26:istore_3        
				if(mMenuVisible)
	//*  16   27:aload_0         
	//*  17   28:getfield        #138 <Field boolean mMenuVisible>
	//*  18   31:ifeq            41
				{
					onPrepareOptionsMenu(menu);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:invokevirtual   #924 <Method void onPrepareOptionsMenu(Menu)>
					flag2 = true;
	//   22   39:iconst_1        
	//   23   40:istore_3        
				}
			}
			FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//   24   41:aload_0         
	//   25   42:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   26   45:astore          5
			flag = flag2;
	//   27   47:iload_3         
	//   28   48:istore_2        
			if(fragmentmanagerimpl != null)
	//*  29   49:aload           5
	//*  30   51:ifnull          63
				flag = flag2 | fragmentmanagerimpl.dispatchPrepareOptionsMenu(menu);
	//   31   54:iload_3         
	//   32   55:aload           5
	//   33   57:aload_1         
	//   34   58:invokevirtual   #927 <Method boolean FragmentManagerImpl.dispatchPrepareOptionsMenu(Menu)>
	//   35   61:ior             
	//   36   62:istore_2        
		}
		return flag;
	//   37   63:iload_2         
	//   38   64:ireturn         
	}

	void performResume()
	{
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:astore_1        
		if(fragmentmanagerimpl != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
		{
			fragmentmanagerimpl.noteStateNotSaved();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #708 <Method void FragmentManagerImpl.noteStateNotSaved()>
			mChildFragmentManager.execPendingActions();
	//    7   13:aload_0         
	//    8   14:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    9   17:invokevirtual   #931 <Method boolean FragmentManagerImpl.execPendingActions()>
	//   10   20:pop             
		}
		mState = 4;
	//   11   21:aload_0         
	//   12   22:iconst_4        
	//   13   23:putfield        #132 <Field int mState>
		mCalled = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #712 <Field boolean mCalled>
		onResume();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #933 <Method void onResume()>
		if(mCalled)
	//*  19   35:aload_0         
	//*  20   36:getfield        #712 <Field boolean mCalled>
	//*  21   39:ifeq            91
		{
			FragmentManagerImpl fragmentmanagerimpl1 = mChildFragmentManager;
	//   22   42:aload_0         
	//   23   43:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   24   46:astore_1        
			if(fragmentmanagerimpl1 != null)
	//*  25   47:aload_1         
	//*  26   48:ifnull          63
			{
				fragmentmanagerimpl1.dispatchResume();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #499 <Method void FragmentManagerImpl.dispatchResume()>
				mChildFragmentManager.execPendingActions();
	//   29   55:aload_0         
	//   30   56:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   31   59:invokevirtual   #931 <Method boolean FragmentManagerImpl.execPendingActions()>
	//   32   62:pop             
			}
			mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_RESUME);
	//   33   63:aload_0         
	//   34   64:getfield        #147 <Field LifecycleRegistry mLifecycleRegistry>
	//   35   67:getstatic       #936 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_RESUME>
	//   36   70:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
			if(mView != null)
	//*  37   73:aload_0         
	//*  38   74:getfield        #401 <Field View mView>
	//*  39   77:ifnull          90
				mViewLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_RESUME);
	//   40   80:aload_0         
	//   41   81:getfield        #835 <Field LifecycleRegistry mViewLifecycleRegistry>
	//   42   84:getstatic       #936 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_RESUME>
	//   43   87:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
			return;
	//   44   90:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   45   91:new             #221 <Class StringBuilder>
	//   46   94:dup             
	//   47   95:invokespecial   #222 <Method void StringBuilder()>
	//   48   98:astore_1        
			stringbuilder.append("Fragment ");
	//   49   99:aload_1         
	//   50  100:ldc2            #787 <String "Fragment ">
	//   51  103:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
			stringbuilder.append(((Object) (this)));
	//   53  107:aload_1         
	//   54  108:aload_0         
	//   55  109:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   56  112:pop             
			stringbuilder.append(" did not call through to super.onResume()");
	//   57  113:aload_1         
	//   58  114:ldc2            #938 <String " did not call through to super.onResume()">
	//   59  117:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   60  120:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   61  121:new             #791 <Class SuperNotCalledException>
	//   62  124:dup             
	//   63  125:aload_1         
	//   64  126:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   65  129:invokespecial   #792 <Method void SuperNotCalledException(String)>
	//   66  132:athrow          
		}
	}

	void performSaveInstanceState(Bundle bundle)
	{
		onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #941 <Method void onSaveInstanceState(Bundle)>
		Object obj = ((Object) (mChildFragmentManager));
	//    3    5:aload_0         
	//    4    6:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    5    9:astore_2        
		if(obj != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          31
		{
			obj = ((Object) (((FragmentManagerImpl) (obj)).saveAllState()));
	//    8   14:aload_2         
	//    9   15:invokevirtual   #945 <Method Parcelable FragmentManagerImpl.saveAllState()>
	//   10   18:astore_2        
			if(obj != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          31
				bundle.putParcelable("android:support:fragments", ((Parcelable) (obj)));
	//   13   23:aload_1         
	//   14   24:ldc2            #947 <String "android:support:fragments">
	//   15   27:aload_2         
	//   16   28:invokevirtual   #951 <Method void Bundle.putParcelable(String, Parcelable)>
		}
	//   17   31:return          
	}

	void performStart()
	{
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    2    4:astore_1        
		if(fragmentmanagerimpl != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
		{
			fragmentmanagerimpl.noteStateNotSaved();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #708 <Method void FragmentManagerImpl.noteStateNotSaved()>
			mChildFragmentManager.execPendingActions();
	//    7   13:aload_0         
	//    8   14:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//    9   17:invokevirtual   #931 <Method boolean FragmentManagerImpl.execPendingActions()>
	//   10   20:pop             
		}
		mState = 3;
	//   11   21:aload_0         
	//   12   22:iconst_3        
	//   13   23:putfield        #132 <Field int mState>
		mCalled = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #712 <Field boolean mCalled>
		onStart();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #954 <Method void onStart()>
		if(mCalled)
	//*  19   35:aload_0         
	//*  20   36:getfield        #712 <Field boolean mCalled>
	//*  21   39:ifeq            83
		{
			FragmentManagerImpl fragmentmanagerimpl1 = mChildFragmentManager;
	//   22   42:aload_0         
	//   23   43:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   24   46:astore_1        
			if(fragmentmanagerimpl1 != null)
	//*  25   47:aload_1         
	//*  26   48:ifnull          55
				fragmentmanagerimpl1.dispatchStart();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #502 <Method void FragmentManagerImpl.dispatchStart()>
			mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_START);
	//   29   55:aload_0         
	//   30   56:getfield        #147 <Field LifecycleRegistry mLifecycleRegistry>
	//   31   59:getstatic       #957 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_START>
	//   32   62:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
			if(mView != null)
	//*  33   65:aload_0         
	//*  34   66:getfield        #401 <Field View mView>
	//*  35   69:ifnull          82
				mViewLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_START);
	//   36   72:aload_0         
	//   37   73:getfield        #835 <Field LifecycleRegistry mViewLifecycleRegistry>
	//   38   76:getstatic       #957 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_START>
	//   39   79:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
			return;
	//   40   82:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   41   83:new             #221 <Class StringBuilder>
	//   42   86:dup             
	//   43   87:invokespecial   #222 <Method void StringBuilder()>
	//   44   90:astore_1        
			stringbuilder.append("Fragment ");
	//   45   91:aload_1         
	//   46   92:ldc2            #787 <String "Fragment ">
	//   47   95:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   48   98:pop             
			stringbuilder.append(((Object) (this)));
	//   49   99:aload_1         
	//   50  100:aload_0         
	//   51  101:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   52  104:pop             
			stringbuilder.append(" did not call through to super.onStart()");
	//   53  105:aload_1         
	//   54  106:ldc2            #959 <String " did not call through to super.onStart()">
	//   55  109:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   56  112:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   57  113:new             #791 <Class SuperNotCalledException>
	//   58  116:dup             
	//   59  117:aload_1         
	//   60  118:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   61  121:invokespecial   #792 <Method void SuperNotCalledException(String)>
	//   62  124:athrow          
		}
	}

	void performStop()
	{
		if(mView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #401 <Field View mView>
	//*   2    4:ifnull          17
			mViewLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_STOP);
	//    3    7:aload_0         
	//    4    8:getfield        #835 <Field LifecycleRegistry mViewLifecycleRegistry>
	//    5   11:getstatic       #963 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_STOP>
	//    6   14:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
		mLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_STOP);
	//    7   17:aload_0         
	//    8   18:getfield        #147 <Field LifecycleRegistry mLifecycleRegistry>
	//    9   21:getstatic       #963 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_STOP>
	//   10   24:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
		FragmentManagerImpl fragmentmanagerimpl = mChildFragmentManager;
	//   11   27:aload_0         
	//   12   28:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   13   31:astore_1        
		if(fragmentmanagerimpl != null)
	//*  14   32:aload_1         
	//*  15   33:ifnull          40
			fragmentmanagerimpl.dispatchStop();
	//   16   36:aload_1         
	//   17   37:invokevirtual   #966 <Method void FragmentManagerImpl.dispatchStop()>
		mState = 2;
	//   18   40:aload_0         
	//   19   41:iconst_2        
	//   20   42:putfield        #132 <Field int mState>
		mCalled = false;
	//   21   45:aload_0         
	//   22   46:iconst_0        
	//   23   47:putfield        #712 <Field boolean mCalled>
		onStop();
	//   24   50:aload_0         
	//   25   51:invokevirtual   #968 <Method void onStop()>
		if(mCalled)
	//*  26   54:aload_0         
	//*  27   55:getfield        #712 <Field boolean mCalled>
	//*  28   58:ifeq            62
		{
			return;
	//   29   61:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   62:new             #221 <Class StringBuilder>
	//   31   65:dup             
	//   32   66:invokespecial   #222 <Method void StringBuilder()>
	//   33   69:astore_1        
			stringbuilder.append("Fragment ");
	//   34   70:aload_1         
	//   35   71:ldc2            #787 <String "Fragment ">
	//   36   74:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			stringbuilder.append(((Object) (this)));
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   41   83:pop             
			stringbuilder.append(" did not call through to super.onStop()");
	//   42   84:aload_1         
	//   43   85:ldc2            #970 <String " did not call through to super.onStop()">
	//   44   88:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   45   91:pop             
			throw new SuperNotCalledException(stringbuilder.toString());
	//   46   92:new             #791 <Class SuperNotCalledException>
	//   47   95:dup             
	//   48   96:aload_1         
	//   49   97:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   50  100:invokespecial   #792 <Method void SuperNotCalledException(String)>
	//   51  103:athrow          
		}
	}

	public void postponeEnterTransition()
	{
		ensureAnimationInfo().mEnterTransitionPostponed = true;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iconst_1        
	//    3    5:putfield        #254 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//    4    8:return          
	}

	public void registerForContextMenu(View view)
	{
		view.setOnCreateContextMenuListener(((android.view.View.OnCreateContextMenuListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #979 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
	//    3    5:return          
	}

	public final void requestPermissions(String as[], int i)
	{
		FragmentHostCallback fragmenthostcallback = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//    2    4:astore_3        
		if(fragmenthostcallback != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
		{
			fragmenthostcallback.onRequestPermissionsFromFragment(this, as, i);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #985 <Method void FragmentHostCallback.onRequestPermissionsFromFragment(Fragment, String[], int)>
			return;
	//   10   16:return          
		} else
		{
			as = ((String []) (new StringBuilder()));
	//   11   17:new             #221 <Class StringBuilder>
	//   12   20:dup             
	//   13   21:invokespecial   #222 <Method void StringBuilder()>
	//   14   24:astore_1        
			((StringBuilder) (as)).append("Fragment ");
	//   15   25:aload_1         
	//   16   26:ldc2            #787 <String "Fragment ">
	//   17   29:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			((StringBuilder) (as)).append(((Object) (this)));
	//   19   33:aload_1         
	//   20   34:aload_0         
	//   21   35:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   22   38:pop             
			((StringBuilder) (as)).append(" not attached to Activity");
	//   23   39:aload_1         
	//   24   40:ldc2            #987 <String " not attached to Activity">
	//   25   43:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
			throw new IllegalStateException(((StringBuilder) (as)).toString());
	//   27   47:new             #564 <Class IllegalStateException>
	//   28   50:dup             
	//   29   51:aload_1         
	//   30   52:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   31   55:invokespecial   #568 <Method void IllegalStateException(String)>
	//   32   58:athrow          
		}
	}

	public final FragmentActivity requireActivity()
	{
		FragmentActivity fragmentactivity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #740 <Method FragmentActivity getActivity()>
	//    2    4:astore_1        
		if(fragmentactivity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return fragmentactivity;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #221 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #222 <Method void StringBuilder()>
	//   10   18:astore_1        
			stringbuilder.append("Fragment ");
	//   11   19:aload_1         
	//   12   20:ldc2            #787 <String "Fragment ">
	//   13   23:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			stringbuilder.append(((Object) (this)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   18   32:pop             
			stringbuilder.append(" not attached to an activity.");
	//   19   33:aload_1         
	//   20   34:ldc2            #990 <String " not attached to an activity.">
	//   21   37:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   23   41:new             #564 <Class IllegalStateException>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #568 <Method void IllegalStateException(String)>
	//   28   52:athrow          
		}
	}

	public final Context requireContext()
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #422 <Method Context getContext()>
	//    2    4:astore_1        
		if(context != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return context;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #221 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #222 <Method void StringBuilder()>
	//   10   18:astore_1        
			stringbuilder.append("Fragment ");
	//   11   19:aload_1         
	//   12   20:ldc2            #787 <String "Fragment ">
	//   13   23:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			stringbuilder.append(((Object) (this)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   18   32:pop             
			stringbuilder.append(" not attached to a context.");
	//   19   33:aload_1         
	//   20   34:ldc2            #992 <String " not attached to a context.">
	//   21   37:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   23   41:new             #564 <Class IllegalStateException>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #568 <Method void IllegalStateException(String)>
	//   28   52:athrow          
		}
	}

	public final FragmentManager requireFragmentManager()
	{
		FragmentManager fragmentmanager = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #995 <Method FragmentManager getFragmentManager()>
	//    2    4:astore_1        
		if(fragmentmanager != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return fragmentmanager;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #221 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #222 <Method void StringBuilder()>
	//   10   18:astore_1        
			stringbuilder.append("Fragment ");
	//   11   19:aload_1         
	//   12   20:ldc2            #787 <String "Fragment ">
	//   13   23:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			stringbuilder.append(((Object) (this)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   18   32:pop             
			stringbuilder.append(" not associated with a fragment manager.");
	//   19   33:aload_1         
	//   20   34:ldc2            #997 <String " not associated with a fragment manager.">
	//   21   37:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   23   41:new             #564 <Class IllegalStateException>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #568 <Method void IllegalStateException(String)>
	//   28   52:athrow          
		}
	}

	public final Object requireHost()
	{
		Object obj = getHost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1000 <Method Object getHost()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return obj;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #221 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #222 <Method void StringBuilder()>
	//   10   18:astore_1        
			stringbuilder.append("Fragment ");
	//   11   19:aload_1         
	//   12   20:ldc2            #787 <String "Fragment ">
	//   13   23:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			stringbuilder.append(((Object) (this)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   18   32:pop             
			stringbuilder.append(" not attached to a host.");
	//   19   33:aload_1         
	//   20   34:ldc2            #1002 <String " not attached to a host.">
	//   21   37:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   23   41:new             #564 <Class IllegalStateException>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #568 <Method void IllegalStateException(String)>
	//   28   52:athrow          
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
	//    3    5:ldc2            #947 <String "android:support:fragments">
	//    4    8:invokevirtual   #1006 <Method Parcelable Bundle.getParcelable(String)>
	//    5   11:astore_1        
			if(bundle != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          51
			{
				if(mChildFragmentManager == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//*  10   20:ifnonnull       27
					instantiateChildFragmentManager();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #496 <Method void instantiateChildFragmentManager()>
				mChildFragmentManager.restoreAllState(((Parcelable) (bundle)), mChildNonConfig);
	//   13   27:aload_0         
	//   14   28:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #1008 <Field FragmentManagerNonConfig mChildNonConfig>
	//   18   36:invokevirtual   #1012 <Method void FragmentManagerImpl.restoreAllState(Parcelable, FragmentManagerNonConfig)>
				mChildNonConfig = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #1008 <Field FragmentManagerNonConfig mChildNonConfig>
				mChildFragmentManager.dispatchCreate();
	//   22   44:aload_0         
	//   23   45:getfield        #432 <Field FragmentManagerImpl mChildFragmentManager>
	//   24   48:invokevirtual   #508 <Method void FragmentManagerImpl.dispatchCreate()>
			}
		}
	//   25   51:return          
	}

	final void restoreViewState(Bundle bundle)
	{
		SparseArray sparsearray = mSavedViewState;
	//    0    0:aload_0         
	//    1    1:getfield        #377 <Field SparseArray mSavedViewState>
	//    2    4:astore_2        
		if(sparsearray != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
		{
			mInnerView.restoreHierarchyState(sparsearray);
	//    5    9:aload_0         
	//    6   10:getfield        #405 <Field View mInnerView>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #1017 <Method void View.restoreHierarchyState(SparseArray)>
			mSavedViewState = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #377 <Field SparseArray mSavedViewState>
		}
		mCalled = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #712 <Field boolean mCalled>
		onViewStateRestored(bundle);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #1019 <Method void onViewStateRestored(Bundle)>
		if(mCalled)
	//*  18   32:aload_0         
	//*  19   33:getfield        #712 <Field boolean mCalled>
	//*  20   36:ifeq            57
		{
			if(mView != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #401 <Field View mView>
	//*  23   43:ifnull          56
				mViewLifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle.Event.ON_CREATE);
	//   24   46:aload_0         
	//   25   47:getfield        #835 <Field LifecycleRegistry mViewLifecycleRegistry>
	//   26   50:getstatic       #815 <Field android.arch.lifecycle.Lifecycle$Event android.arch.lifecycle.Lifecycle$Event.ON_CREATE>
	//   27   53:invokevirtual   #819 <Method void LifecycleRegistry.handleLifecycleEvent(android.arch.lifecycle.Lifecycle$Event)>
			return;
	//   28   56:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   29   57:new             #221 <Class StringBuilder>
	//   30   60:dup             
	//   31   61:invokespecial   #222 <Method void StringBuilder()>
	//   32   64:astore_1        
			((StringBuilder) (bundle)).append("Fragment ");
	//   33   65:aload_1         
	//   34   66:ldc2            #787 <String "Fragment ">
	//   35   69:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
			((StringBuilder) (bundle)).append(((Object) (this)));
	//   37   73:aload_1         
	//   38   74:aload_0         
	//   39   75:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   40   78:pop             
			((StringBuilder) (bundle)).append(" did not call through to super.onViewStateRestored()");
	//   41   79:aload_1         
	//   42   80:ldc2            #1021 <String " did not call through to super.onViewStateRestored()">
	//   43   83:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
			throw new SuperNotCalledException(((StringBuilder) (bundle)).toString());
	//   45   87:new             #791 <Class SuperNotCalledException>
	//   46   90:dup             
	//   47   91:aload_1         
	//   48   92:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   49   95:invokespecial   #792 <Method void SuperNotCalledException(String)>
	//   50   98:athrow          
		}
	}

	public void setAllowEnterTransitionOverlap(boolean flag)
	{
		ensureAnimationInfo().mAllowEnterTransitionOverlap = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #1026 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:putfield        #470 <Field Boolean Fragment$AnimationInfo.mAllowEnterTransitionOverlap>
	//    5   11:return          
	}

	public void setAllowReturnTransitionOverlap(boolean flag)
	{
		ensureAnimationInfo().mAllowReturnTransitionOverlap = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #1026 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:putfield        #479 <Field Boolean Fragment$AnimationInfo.mAllowReturnTransitionOverlap>
	//    5   11:return          
	}

	void setAnimatingAway(View view)
	{
		ensureAnimationInfo().mAnimatingAway = view;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #482 <Field View Fragment$AnimationInfo.mAnimatingAway>
	//    4    8:return          
	}

	void setAnimator(Animator animator)
	{
		ensureAnimationInfo().mAnimator = animator;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #488 <Field Animator Fragment$AnimationInfo.mAnimator>
	//    4    8:return          
	}

	public void setArguments(Bundle bundle)
	{
		if(mIndex >= 0 && isStateSaved())
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field int mIndex>
	//*   2    4:iflt            28
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #1031 <Method boolean isStateSaved()>
	//*   5   11:ifne            17
	//*   6   14:goto            28
		{
			throw new IllegalStateException("Fragment already active and state has been saved");
	//    7   17:new             #564 <Class IllegalStateException>
	//    8   20:dup             
	//    9   21:ldc2            #1033 <String "Fragment already active and state has been saved">
	//   10   24:invokespecial   #568 <Method void IllegalStateException(String)>
	//   11   27:athrow          
		} else
		{
			mArguments = bundle;
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:putfield        #369 <Field Bundle mArguments>
			return;
	//   15   33:return          
		}
	}

	public void setEnterSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ensureAnimationInfo().mEnterTransitionCallback = sharedelementcallback;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #520 <Field SharedElementCallback Fragment$AnimationInfo.mEnterTransitionCallback>
	//    4    8:return          
	}

	public void setEnterTransition(Object obj)
	{
		ensureAnimationInfo().mEnterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #514 <Field Object Fragment$AnimationInfo.mEnterTransition>
	//    4    8:return          
	}

	public void setExitSharedElementCallback(SharedElementCallback sharedelementcallback)
	{
		ensureAnimationInfo().mExitTransitionCallback = sharedelementcallback;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #528 <Field SharedElementCallback Fragment$AnimationInfo.mExitTransitionCallback>
	//    4    8:return          
	}

	public void setExitTransition(Object obj)
	{
		ensureAnimationInfo().mExitTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #524 <Field Object Fragment$AnimationInfo.mExitTransition>
	//    4    8:return          
	}

	public void setHasOptionsMenu(boolean flag)
	{
		if(mHasMenu != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #342 <Field boolean mHasMenu>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          34
		{
			mHasMenu = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #342 <Field boolean mHasMenu>
			if(isAdded() && !isHidden())
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #694 <Method boolean isAdded()>
	//*   9   17:ifeq            34
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #696 <Method boolean isHidden()>
	//*  12   24:ifne            34
				mHost.onSupportInvalidateOptionsMenu();
	//   13   27:aload_0         
	//   14   28:getfield        #361 <Field FragmentHostCallback mHost>
	//   15   31:invokevirtual   #1042 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
		}
	//   16   34:return          
	}

	void setHideReplaced(boolean flag)
	{
		ensureAnimationInfo().mIsHideReplaced = flag;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:putfield        #682 <Field boolean Fragment$AnimationInfo.mIsHideReplaced>
	//    4    8:return          
	}

	final void setIndex(int i, Fragment fragment)
	{
		mIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #134 <Field int mIndex>
		if(fragment != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          52
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #221 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #222 <Method void StringBuilder()>
	//    8   16:astore_3        
			stringbuilder.append(fragment.mWho);
	//    9   17:aload_3         
	//   10   18:aload_2         
	//   11   19:getfield        #301 <Field String mWho>
	//   12   22:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			stringbuilder.append(":");
	//   14   26:aload_3         
	//   15   27:ldc2            #439 <String ":">
	//   16   30:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(mIndex);
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #134 <Field int mIndex>
	//   21   39:invokevirtual   #1048 <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
			mWho = stringbuilder.toString();
	//   23   43:aload_0         
	//   24   44:aload_3         
	//   25   45:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   26   48:putfield        #301 <Field String mWho>
			return;
	//   27   51:return          
		} else
		{
			fragment = ((Fragment) (new StringBuilder()));
	//   28   52:new             #221 <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #222 <Method void StringBuilder()>
	//   31   59:astore_2        
			((StringBuilder) (fragment)).append("android:fragment:");
	//   32   60:aload_2         
	//   33   61:ldc2            #1050 <String "android:fragment:">
	//   34   64:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
			((StringBuilder) (fragment)).append(mIndex);
	//   36   68:aload_2         
	//   37   69:aload_0         
	//   38   70:getfield        #134 <Field int mIndex>
	//   39   73:invokevirtual   #1048 <Method StringBuilder StringBuilder.append(int)>
	//   40   76:pop             
			mWho = ((StringBuilder) (fragment)).toString();
	//   41   77:aload_0         
	//   42   78:aload_2         
	//   43   79:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   44   82:putfield        #301 <Field String mWho>
			return;
	//   45   85:return          
		}
	}

	public void setInitialSavedState(SavedState savedstate)
	{
		if(mIndex < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field int mIndex>
	//*   2    4:ifge            34
		{
			if(savedstate != null && savedstate.mState != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          26
	//*   5   11:aload_1         
	//*   6   12:getfield        #1054 <Field Bundle Fragment$SavedState.mState>
	//*   7   15:ifnull          26
				savedstate = ((SavedState) (savedstate.mState));
	//    8   18:aload_1         
	//    9   19:getfield        #1054 <Field Bundle Fragment$SavedState.mState>
	//   10   22:astore_1        
			else
	//*  11   23:goto            28
				savedstate = null;
	//   12   26:aconst_null     
	//   13   27:astore_1        
			mSavedFragmentState = ((Bundle) (savedstate));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #373 <Field Bundle mSavedFragmentState>
			return;
	//   17   33:return          
		} else
		{
			throw new IllegalStateException("Fragment already active");
	//   18   34:new             #564 <Class IllegalStateException>
	//   19   37:dup             
	//   20   38:ldc2            #1056 <String "Fragment already active">
	//   21   41:invokespecial   #568 <Method void IllegalStateException(String)>
	//   22   44:athrow          
		}
	}

	public void setMenuVisibility(boolean flag)
	{
		if(mMenuVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field boolean mMenuVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          41
		{
			mMenuVisible = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #138 <Field boolean mMenuVisible>
			if(mHasMenu && isAdded() && !isHidden())
	//*   7   13:aload_0         
	//*   8   14:getfield        #342 <Field boolean mHasMenu>
	//*   9   17:ifeq            41
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #694 <Method boolean isAdded()>
	//*  12   24:ifeq            41
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #696 <Method boolean isHidden()>
	//*  15   31:ifne            41
				mHost.onSupportInvalidateOptionsMenu();
	//   16   34:aload_0         
	//   17   35:getfield        #361 <Field FragmentHostCallback mHost>
	//   18   38:invokevirtual   #1042 <Method void FragmentHostCallback.onSupportInvalidateOptionsMenu()>
		}
	//   19   41:return          
	}

	void setNextAnim(int i)
	{
		if(mAnimationInfo == null && i == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
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
	//    7   13:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    8   16:iload_1         
	//    9   17:putfield        #576 <Field int Fragment$AnimationInfo.mNextAnim>
			return;
	//   10   20:return          
		}
	}

	void setNextTransition(int i, int j)
	{
		if(mAnimationInfo == null && i == 0 && j == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
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
	//    9   17:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//   10   20:pop             
			AnimationInfo animationinfo = mAnimationInfo;
	//   11   21:aload_0         
	//   12   22:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//   13   25:astore_3        
			animationinfo.mNextTransition = i;
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:putfield        #580 <Field int Fragment$AnimationInfo.mNextTransition>
			animationinfo.mNextTransitionStyle = j;
	//   17   31:aload_3         
	//   18   32:iload_2         
	//   19   33:putfield        #584 <Field int Fragment$AnimationInfo.mNextTransitionStyle>
			return;
	//   20   36:return          
		}
	}

	void setOnStartEnterTransitionListener(OnStartEnterTransitionListener onstartentertransitionlistener)
	{
		ensureAnimationInfo();
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:pop             
		if(onstartentertransitionlistener == mAnimationInfo.mStartEnterTransitionListener)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//*   6   10:getfield        #258 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//*   7   13:if_acmpne       17
			return;
	//    8   16:return          
		if(onstartentertransitionlistener != null && mAnimationInfo.mStartEnterTransitionListener != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          68
	//*  11   21:aload_0         
	//*  12   22:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//*  13   25:getfield        #258 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
	//*  14   28:ifnonnull       34
	//*  15   31:goto            68
		{
			onstartentertransitionlistener = ((OnStartEnterTransitionListener) (new StringBuilder()));
	//   16   34:new             #221 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #222 <Method void StringBuilder()>
	//   19   41:astore_1        
			((StringBuilder) (onstartentertransitionlistener)).append("Trying to set a replacement startPostponedEnterTransition on ");
	//   20   42:aload_1         
	//   21   43:ldc2            #1064 <String "Trying to set a replacement startPostponedEnterTransition on ">
	//   22   46:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			((StringBuilder) (onstartentertransitionlistener)).append(((Object) (this)));
	//   24   50:aload_1         
	//   25   51:aload_0         
	//   26   52:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   27   55:pop             
			throw new IllegalStateException(((StringBuilder) (onstartentertransitionlistener)).toString());
	//   28   56:new             #564 <Class IllegalStateException>
	//   29   59:dup             
	//   30   60:aload_1         
	//   31   61:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   32   64:invokespecial   #568 <Method void IllegalStateException(String)>
	//   33   67:athrow          
		}
		if(mAnimationInfo.mEnterTransitionPostponed)
	//*  34   68:aload_0         
	//*  35   69:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//*  36   72:getfield        #254 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
	//*  37   75:ifeq            86
			mAnimationInfo.mStartEnterTransitionListener = onstartentertransitionlistener;
	//   38   78:aload_0         
	//   39   79:getfield        #156 <Field Fragment$AnimationInfo mAnimationInfo>
	//   40   82:aload_1         
	//   41   83:putfield        #258 <Field Fragment$OnStartEnterTransitionListener Fragment$AnimationInfo.mStartEnterTransitionListener>
		if(onstartentertransitionlistener != null)
	//*  42   86:aload_1         
	//*  43   87:ifnull          96
			onstartentertransitionlistener.startListening();
	//   44   90:aload_1         
	//   45   91:invokeinterface #1067 <Method void Fragment$OnStartEnterTransitionListener.startListening()>
	//   46   96:return          
	}

	public void setReenterTransition(Object obj)
	{
		ensureAnimationInfo().mReenterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #590 <Field Object Fragment$AnimationInfo.mReenterTransition>
	//    4    8:return          
	}

	public void setRetainInstance(boolean flag)
	{
		mRetainInstance = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #346 <Field boolean mRetainInstance>
	//    3    5:return          
	}

	public void setReturnTransition(Object obj)
	{
		ensureAnimationInfo().mReturnTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #604 <Field Object Fragment$AnimationInfo.mReturnTransition>
	//    4    8:return          
	}

	public void setSharedElementEnterTransition(Object obj)
	{
		ensureAnimationInfo().mSharedElementEnterTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #610 <Field Object Fragment$AnimationInfo.mSharedElementEnterTransition>
	//    4    8:return          
	}

	public void setSharedElementReturnTransition(Object obj)
	{
		ensureAnimationInfo().mSharedElementReturnTransition = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #614 <Field Object Fragment$AnimationInfo.mSharedElementReturnTransition>
	//    4    8:return          
	}

	void setStateAfterAnimating(int i)
	{
		ensureAnimationInfo().mStateAfterAnimating = i;
	//    0    0:aload_0         
	//    1    1:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:putfield        #619 <Field int Fragment$AnimationInfo.mStateAfterAnimating>
	//    4    8:return          
	}

	public void setTargetFragment(Fragment fragment, int i)
	{
		FragmentManager fragmentmanager1 = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #995 <Method FragmentManager getFragmentManager()>
	//    2    4:astore          4
		FragmentManager fragmentmanager;
		if(fragment != null)
	//*   3    6:aload_1         
	//*   4    7:ifnull          18
			fragmentmanager = fragment.getFragmentManager();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #995 <Method FragmentManager getFragmentManager()>
	//    7   14:astore_3        
		else
	//*   8   15:goto            20
			fragmentmanager = null;
	//    9   18:aconst_null     
	//   10   19:astore_3        
		if(fragmentmanager1 != null && fragmentmanager != null && fragmentmanager1 != fragmentmanager)
	//*  11   20:aload           4
	//*  12   22:ifnull          80
	//*  13   25:aload_3         
	//*  14   26:ifnull          80
	//*  15   29:aload           4
	//*  16   31:aload_3         
	//*  17   32:if_acmpne       38
	//*  18   35:goto            80
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   19   38:new             #221 <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #222 <Method void StringBuilder()>
	//   22   45:astore_3        
			stringbuilder.append("Fragment ");
	//   23   46:aload_3         
	//   24   47:ldc2            #787 <String "Fragment ">
	//   25   50:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			stringbuilder.append(((Object) (fragment)));
	//   27   54:aload_3         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   30   59:pop             
			stringbuilder.append(" must share the same FragmentManager to be set as a target fragment");
	//   31   60:aload_3         
	//   32   61:ldc2            #1077 <String " must share the same FragmentManager to be set as a target fragment">
	//   33   64:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   35   68:new             #1079 <Class IllegalArgumentException>
	//   36   71:dup             
	//   37   72:aload_3         
	//   38   73:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   39   76:invokespecial   #1080 <Method void IllegalArgumentException(String)>
	//   40   79:athrow          
		}
		for(Fragment fragment1 = fragment; fragment1 != null;)
	//*  41   80:aload_1         
	//*  42   81:astore_3        
	//*  43   82:aload_3         
	//*  44   83:ifnull          155
			if(fragment1 != this)
	//*  45   86:aload_3         
	//*  46   87:aload_0         
	//*  47   88:if_acmpeq       99
			{
				fragment1 = fragment1.getTargetFragment();
	//   48   91:aload_3         
	//   49   92:invokevirtual   #1082 <Method Fragment getTargetFragment()>
	//   50   95:astore_3        
			} else
	//*  51   96:goto            82
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   52   99:new             #221 <Class StringBuilder>
	//   53  102:dup             
	//   54  103:invokespecial   #222 <Method void StringBuilder()>
	//   55  106:astore_3        
				stringbuilder1.append("Setting ");
	//   56  107:aload_3         
	//   57  108:ldc2            #1084 <String "Setting ">
	//   58  111:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   59  114:pop             
				stringbuilder1.append(((Object) (fragment)));
	//   60  115:aload_3         
	//   61  116:aload_1         
	//   62  117:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   63  120:pop             
				stringbuilder1.append(" as the target of ");
	//   64  121:aload_3         
	//   65  122:ldc2            #1086 <String " as the target of ">
	//   66  125:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   67  128:pop             
				stringbuilder1.append(((Object) (this)));
	//   68  129:aload_3         
	//   69  130:aload_0         
	//   70  131:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   71  134:pop             
				stringbuilder1.append(" would create a target cycle");
	//   72  135:aload_3         
	//   73  136:ldc2            #1088 <String " would create a target cycle">
	//   74  139:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   75  142:pop             
				throw new IllegalArgumentException(stringbuilder1.toString());
	//   76  143:new             #1079 <Class IllegalArgumentException>
	//   77  146:dup             
	//   78  147:aload_3         
	//   79  148:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   80  151:invokespecial   #1080 <Method void IllegalArgumentException(String)>
	//   81  154:athrow          
			}

		mTarget = fragment;
	//   82  155:aload_0         
	//   83  156:aload_1         
	//   84  157:putfield        #381 <Field Fragment mTarget>
		mTargetRequestCode = i;
	//   85  160:aload_0         
	//   86  161:iload_2         
	//   87  162:putfield        #389 <Field int mTargetRequestCode>
	//   88  165:return          
	}

	public void setUserVisibleHint(boolean flag)
	{
		if(!mUserVisibleHint && flag && mState < 3 && mFragmentManager != null && isAdded() && mIsCreated)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field boolean mUserVisibleHint>
	//*   2    4:ifne            48
	//*   3    7:iload_1         
	//*   4    8:ifeq            48
	//*   5   11:aload_0         
	//*   6   12:getfield        #132 <Field int mState>
	//*   7   15:iconst_3        
	//*   8   16:icmpge          48
	//*   9   19:aload_0         
	//*  10   20:getfield        #354 <Field FragmentManagerImpl mFragmentManager>
	//*  11   23:ifnull          48
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #694 <Method boolean isAdded()>
	//*  14   30:ifeq            48
	//*  15   33:aload_0         
	//*  16   34:getfield        #809 <Field boolean mIsCreated>
	//*  17   37:ifeq            48
			mFragmentManager.performPendingDeferredStart(this);
	//   18   40:aload_0         
	//   19   41:getfield        #354 <Field FragmentManagerImpl mFragmentManager>
	//   20   44:aload_0         
	//   21   45:invokevirtual   #1092 <Method void FragmentManagerImpl.performPendingDeferredStart(Fragment)>
		mUserVisibleHint = flag;
	//   22   48:aload_0         
	//   23   49:iload_1         
	//   24   50:putfield        #140 <Field boolean mUserVisibleHint>
		boolean flag1;
		if(mState < 3 && !flag)
	//*  25   53:aload_0         
	//*  26   54:getfield        #132 <Field int mState>
	//*  27   57:iconst_3        
	//*  28   58:icmpge          70
	//*  29   61:iload_1         
	//*  30   62:ifne            70
			flag1 = true;
	//   31   65:iconst_1        
	//   32   66:istore_2        
		else
	//*  33   67:goto            72
			flag1 = false;
	//   34   70:iconst_0        
	//   35   71:istore_2        
		mDeferStart = flag1;
	//   36   72:aload_0         
	//   37   73:iload_2         
	//   38   74:putfield        #1094 <Field boolean mDeferStart>
		if(mSavedFragmentState != null)
	//*  39   77:aload_0         
	//*  40   78:getfield        #373 <Field Bundle mSavedFragmentState>
	//*  41   81:ifnull          92
			mSavedUserVisibleHint = Boolean.valueOf(flag);
	//   42   84:aload_0         
	//   43   85:iload_1         
	//   44   86:invokestatic    #1026 <Method Boolean Boolean.valueOf(boolean)>
	//   45   89:putfield        #1096 <Field Boolean mSavedUserVisibleHint>
	//   46   92:return          
	}

	public boolean shouldShowRequestPermissionRationale(String s)
	{
		FragmentHostCallback fragmenthostcallback = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//    2    4:astore_2        
		if(fragmenthostcallback != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return fragmenthostcallback.onShouldShowRequestPermissionRationale(s);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1101 <Method boolean FragmentHostCallback.onShouldShowRequestPermissionRationale(String)>
	//    8   14:ireturn         
		else
			return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	public void startActivity(Intent intent)
	{
		startActivity(intent, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #1106 <Method void startActivity(Intent, Bundle)>
	//    4    6:return          
	}

	public void startActivity(Intent intent, Bundle bundle)
	{
		FragmentHostCallback fragmenthostcallback = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//    2    4:astore_3        
		if(fragmenthostcallback != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          18
		{
			fragmenthostcallback.onStartActivityFromFragment(this, intent, -1, bundle);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_m1       
	//    9   13:aload_2         
	//   10   14:invokevirtual   #1110 <Method void FragmentHostCallback.onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
			return;
	//   11   17:return          
		} else
		{
			intent = ((Intent) (new StringBuilder()));
	//   12   18:new             #221 <Class StringBuilder>
	//   13   21:dup             
	//   14   22:invokespecial   #222 <Method void StringBuilder()>
	//   15   25:astore_1        
			((StringBuilder) (intent)).append("Fragment ");
	//   16   26:aload_1         
	//   17   27:ldc2            #787 <String "Fragment ">
	//   18   30:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			((StringBuilder) (intent)).append(((Object) (this)));
	//   20   34:aload_1         
	//   21   35:aload_0         
	//   22   36:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   23   39:pop             
			((StringBuilder) (intent)).append(" not attached to Activity");
	//   24   40:aload_1         
	//   25   41:ldc2            #987 <String " not attached to Activity">
	//   26   44:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   27   47:pop             
			throw new IllegalStateException(((StringBuilder) (intent)).toString());
	//   28   48:new             #564 <Class IllegalStateException>
	//   29   51:dup             
	//   30   52:aload_1         
	//   31   53:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   32   56:invokespecial   #568 <Method void IllegalStateException(String)>
	//   33   59:athrow          
		}
	}

	public void startActivityForResult(Intent intent, int i)
	{
		startActivityForResult(intent, i, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #1115 <Method void startActivityForResult(Intent, int, Bundle)>
	//    5    7:return          
	}

	public void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		FragmentHostCallback fragmenthostcallback = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//    2    4:astore          4
		if(fragmenthostcallback != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
		{
			fragmenthostcallback.onStartActivityFromFragment(this, intent, i, bundle);
	//    5   11:aload           4
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:iload_2         
	//    9   16:aload_3         
	//   10   17:invokevirtual   #1110 <Method void FragmentHostCallback.onStartActivityFromFragment(Fragment, Intent, int, Bundle)>
			return;
	//   11   20:return          
		} else
		{
			intent = ((Intent) (new StringBuilder()));
	//   12   21:new             #221 <Class StringBuilder>
	//   13   24:dup             
	//   14   25:invokespecial   #222 <Method void StringBuilder()>
	//   15   28:astore_1        
			((StringBuilder) (intent)).append("Fragment ");
	//   16   29:aload_1         
	//   17   30:ldc2            #787 <String "Fragment ">
	//   18   33:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			((StringBuilder) (intent)).append(((Object) (this)));
	//   20   37:aload_1         
	//   21   38:aload_0         
	//   22   39:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   23   42:pop             
			((StringBuilder) (intent)).append(" not attached to Activity");
	//   24   43:aload_1         
	//   25   44:ldc2            #987 <String " not attached to Activity">
	//   26   47:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			throw new IllegalStateException(((StringBuilder) (intent)).toString());
	//   28   51:new             #564 <Class IllegalStateException>
	//   29   54:dup             
	//   30   55:aload_1         
	//   31   56:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   32   59:invokespecial   #568 <Method void IllegalStateException(String)>
	//   33   62:athrow          
		}
	}

	public void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int j, int k, int l, Bundle bundle)
		throws android.content.IntentSender.SendIntentException
	{
		FragmentHostCallback fragmenthostcallback = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field FragmentHostCallback mHost>
	//    2    4:astore          8
		if(fragmenthostcallback != null)
	//*   3    6:aload           8
	//*   4    8:ifnull          29
		{
			fragmenthostcallback.onStartIntentSenderFromFragment(this, intentsender, i, intent, j, k, l, bundle);
	//    5   11:aload           8
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:iload_2         
	//    9   16:aload_3         
	//   10   17:iload           4
	//   11   19:iload           5
	//   12   21:iload           6
	//   13   23:aload           7
	//   14   25:invokevirtual   #1123 <Method void FragmentHostCallback.onStartIntentSenderFromFragment(Fragment, IntentSender, int, Intent, int, int, int, Bundle)>
			return;
	//   15   28:return          
		} else
		{
			intentsender = ((IntentSender) (new StringBuilder()));
	//   16   29:new             #221 <Class StringBuilder>
	//   17   32:dup             
	//   18   33:invokespecial   #222 <Method void StringBuilder()>
	//   19   36:astore_1        
			((StringBuilder) (intentsender)).append("Fragment ");
	//   20   37:aload_1         
	//   21   38:ldc2            #787 <String "Fragment ">
	//   22   41:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			((StringBuilder) (intentsender)).append(((Object) (this)));
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:invokevirtual   #437 <Method StringBuilder StringBuilder.append(Object)>
	//   27   50:pop             
			((StringBuilder) (intentsender)).append(" not attached to Activity");
	//   28   51:aload_1         
	//   29   52:ldc2            #987 <String " not attached to Activity">
	//   30   55:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
			throw new IllegalStateException(((StringBuilder) (intentsender)).toString());
	//   32   59:new             #564 <Class IllegalStateException>
	//   33   62:dup             
	//   34   63:aload_1         
	//   35   64:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   36   67:invokespecial   #568 <Method void IllegalStateException(String)>
	//   37   70:athrow          
		}
	}

	public void startPostponedEnterTransition()
	{
		FragmentManagerImpl fragmentmanagerimpl = mFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #354 <Field FragmentManagerImpl mFragmentManager>
	//    2    4:astore_1        
		if(fragmentmanagerimpl != null && fragmentmanagerimpl.mHost != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          66
	//*   5    9:aload_1         
	//*   6   10:getfield        #1126 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//*   7   13:ifnonnull       19
	//*   8   16:goto            66
		{
			if(Looper.myLooper() != mFragmentManager.mHost.getHandler().getLooper())
	//*   9   19:invokestatic    #1132 <Method Looper Looper.myLooper()>
	//*  10   22:aload_0         
	//*  11   23:getfield        #354 <Field FragmentManagerImpl mFragmentManager>
	//*  12   26:getfield        #1126 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//*  13   29:invokevirtual   #1136 <Method Handler FragmentHostCallback.getHandler()>
	//*  14   32:invokevirtual   #1141 <Method Looper Handler.getLooper()>
	//*  15   35:if_acmpeq       61
			{
				mFragmentManager.mHost.getHandler().postAtFrontOfQueue(new Runnable() {

					public void run()
					{
						callStartTransitionListener();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field Fragment this$0>
					//    2    4:invokevirtual   #24  <Method void Fragment.callStartTransitionListener()>
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
	//   16   38:aload_0         
	//   17   39:getfield        #354 <Field FragmentManagerImpl mFragmentManager>
	//   18   42:getfield        #1126 <Field FragmentHostCallback FragmentManagerImpl.mHost>
	//   19   45:invokevirtual   #1136 <Method Handler FragmentHostCallback.getHandler()>
	//   20   48:new             #14  <Class Fragment$1>
	//   21   51:dup             
	//   22   52:aload_0         
	//   23   53:invokespecial   #1142 <Method void Fragment$1(Fragment)>
	//   24   56:invokevirtual   #1146 <Method boolean Handler.postAtFrontOfQueue(Runnable)>
	//   25   59:pop             
				return;
	//   26   60:return          
			} else
			{
				callStartTransitionListener();
	//   27   61:aload_0         
	//   28   62:invokevirtual   #1148 <Method void callStartTransitionListener()>
				return;
	//   29   65:return          
			}
		} else
		{
			ensureAnimationInfo().mEnterTransitionPostponed = false;
	//   30   66:aload_0         
	//   31   67:invokespecial   #973 <Method Fragment$AnimationInfo ensureAnimationInfo()>
	//   32   70:iconst_0        
	//   33   71:putfield        #254 <Field boolean Fragment$AnimationInfo.mEnterTransitionPostponed>
			return;
	//   34   74:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #221 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #1150 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		DebugUtils.buildShortClassTag(((Object) (this)), stringbuilder);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #1156 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		if(mIndex >= 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #134 <Field int mIndex>
	//*  10   20:iflt            40
		{
			stringbuilder.append(" #");
	//   11   23:aload_1         
	//   12   24:ldc2            #1158 <String " #">
	//   13   27:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append(mIndex);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #134 <Field int mIndex>
	//   18   36:invokevirtual   #1048 <Method StringBuilder StringBuilder.append(int)>
	//   19   39:pop             
		}
		if(mFragmentId != 0)
	//*  20   40:aload_0         
	//*  21   41:getfield        #273 <Field int mFragmentId>
	//*  22   44:ifeq            67
		{
			stringbuilder.append(" id=0x");
	//   23   47:aload_1         
	//   24   48:ldc2            #1160 <String " id=0x">
	//   25   51:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			stringbuilder.append(Integer.toHexString(mFragmentId));
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #273 <Field int mFragmentId>
	//   30   60:invokestatic    #279 <Method String Integer.toHexString(int)>
	//   31   63:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
		}
		if(mTag != null)
	//*  33   67:aload_0         
	//*  34   68:getfield        #287 <Field String mTag>
	//*  35   71:ifnull          91
		{
			stringbuilder.append(" ");
	//   36   74:aload_1         
	//   37   75:ldc2            #1162 <String " ">
	//   38   78:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			stringbuilder.append(mTag);
	//   40   82:aload_1         
	//   41   83:aload_0         
	//   42   84:getfield        #287 <Field String mTag>
	//   43   87:invokevirtual   #228 <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
		}
		stringbuilder.append('}');
	//   45   91:aload_1         
	//   46   92:bipush          125
	//   47   94:invokevirtual   #1165 <Method StringBuilder StringBuilder.append(char)>
	//   48   97:pop             
		return stringbuilder.toString();
	//   49   98:aload_1         
	//   50   99:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   51  102:areturn         
	}

	public void unregisterForContextMenu(View view)
	{
		view.setOnCreateContextMenuListener(((android.view.View.OnCreateContextMenuListener) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #979 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
	//    3    5:return          
	}

	static final int ACTIVITY_CREATED = 2;
	static final int CREATED = 1;
	static final int INITIALIZING = 0;
	static final int RESUMED = 4;
	static final int STARTED = 3;
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
	LifecycleOwner mViewLifecycleOwner;
	MutableLiveData mViewLifecycleOwnerLiveData;
	LifecycleRegistry mViewLifecycleRegistry;
	ViewModelStore mViewModelStore;
	String mWho;

	static 
	{
	//    0    0:new             #121 <Class SimpleArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void SimpleArrayMap()>
	//    3    7:putstatic       #126 <Field SimpleArrayMap sClassMap>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #127 <Method void Object()>
	//    7   17:putstatic       #129 <Field Object USE_DEFAULT_TRANSITION>
	//*   8   20:return          
	}
}
