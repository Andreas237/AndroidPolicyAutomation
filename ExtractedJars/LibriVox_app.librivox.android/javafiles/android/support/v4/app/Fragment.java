// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.aa;
import android.arch.lifecycle.ab;
import android.arch.lifecycle.g;
import android.arch.lifecycle.j;
import android.arch.lifecycle.k;
import android.arch.lifecycle.s;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.g.f;
import android.support.v4.g.w;
import android.support.v4.view.o;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package android.support.v4.app:
//			t, u, v, ca, 
//			ah, ad, x, r, 
//			da, s, q, ay, 
//			ae, cy

public class Fragment
	implements ab, j, ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

	public Fragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void Object()>
		mState = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #108 <Field int mState>
		mIndex = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #110 <Field int mIndex>
		mTargetIndex = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #112 <Field int mTargetIndex>
		mMenuVisible = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #114 <Field boolean mMenuVisible>
		mUserVisibleHint = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #116 <Field boolean mUserVisibleHint>
		mLifecycleRegistry = new k(((j) (this)));
	//   17   29:aload_0         
	//   18   30:new             #118 <Class k>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:invokespecial   #121 <Method void k(j)>
	//   22   38:putfield        #123 <Field k mLifecycleRegistry>
		mViewLifecycleOwnerLiveData = new s();
	//   23   41:aload_0         
	//   24   42:new             #125 <Class s>
	//   25   45:dup             
	//   26   46:invokespecial   #126 <Method void s()>
	//   27   49:putfield        #128 <Field s mViewLifecycleOwnerLiveData>
	//   28   52:return          
	}

	private t ensureAnimationInfo()
	{
		if(mAnimationInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field t mAnimationInfo>
	//*   2    4:ifnonnull       18
			mAnimationInfo = new t();
	//    3    7:aload_0         
	//    4    8:new             #134 <Class t>
	//    5   11:dup             
	//    6   12:invokespecial   #135 <Method void t()>
	//    7   15:putfield        #132 <Field t mAnimationInfo>
		return mAnimationInfo;
	//    8   18:aload_0         
	//    9   19:getfield        #132 <Field t mAnimationInfo>
	//   10   22:areturn         
	}

	public static Fragment instantiate(Context context, String s1)
	{
		return instantiate(context, s1, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #140 <Method Fragment instantiate(Context, String, Bundle)>
	//    4    6:areturn         
	}

	public static Fragment instantiate(Context context, String s1, Bundle bundle)
	{
		Class class1;
		Class class2;
		try
		{
			class2 = (Class)sClassMap.get(((Object) (s1)));
	//    0    0:getstatic       #102 <Field w sClassMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #154 <Method Object w.get(Object)>
	//    3    7:checkcast       #156 <Class Class>
	//    4   10:astore          4
		}
	//*   5   12:aload           4
	//*   6   14:astore_3        
	//*   7   15:aload           4
	//*   8   17:ifnonnull       38
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #162 <Method ClassLoader Context.getClassLoader()>
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #168 <Method Class ClassLoader.loadClass(String)>
	//*  13   28:astore_3        
	//*  14   29:getstatic       #102 <Field w sClassMap>
	//*  15   32:aload_1         
	//*  16   33:aload_3         
	//*  17   34:invokevirtual   #172 <Method Object w.put(Object, Object)>
	//*  18   37:pop             
	//*  19   38:aload_3         
	//*  20   39:iconst_0        
	//*  21   40:anewarray       Class[]
	//*  22   43:invokevirtual   #176 <Method Constructor Class.getConstructor(Class[])>
	//*  23   46:iconst_0        
	//*  24   47:anewarray       Object[]
	//*  25   50:invokevirtual   #182 <Method Object Constructor.newInstance(Object[])>
	//*  26   53:checkcast       #2   <Class Fragment>
	//*  27   56:astore_0        
	//*  28   57:aload_2         
	//*  29   58:ifnull          77
	//*  30   61:aload_2         
	//*  31   62:aload_0         
	//*  32   63:invokevirtual   #186 <Method Class Object.getClass()>
	//*  33   66:invokevirtual   #187 <Method ClassLoader Class.getClassLoader()>
	//*  34   69:invokevirtual   #193 <Method void Bundle.setClassLoader(ClassLoader)>
	//*  35   72:aload_0         
	//*  36   73:aload_2         
	//*  37   74:invokevirtual   #197 <Method void setArguments(Bundle)>
	//*  38   77:aload_0         
	//*  39   78:areturn         
	//*  40   79:astore_0        
	//*  41   80:new             #199 <Class StringBuilder>
	//*  42   83:dup             
	//*  43   84:invokespecial   #200 <Method void StringBuilder()>
	//*  44   87:astore_2        
	//*  45   88:aload_2         
	//*  46   89:ldc1            #202 <String "Unable to instantiate fragment ">
	//*  47   91:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//*  48   94:pop             
	//*  49   95:aload_2         
	//*  50   96:aload_1         
	//*  51   97:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//*  52  100:pop             
	//*  53  101:aload_2         
	//*  54  102:ldc1            #208 <String ": calling Fragment constructor caused an exception">
	//*  55  104:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//*  56  107:pop             
	//*  57  108:new             #210 <Class u>
	//*  58  111:dup             
	//*  59  112:aload_2         
	//*  60  113:invokevirtual   #214 <Method String StringBuilder.toString()>
	//*  61  116:aload_0         
	//*  62  117:invokespecial   #217 <Method void u(String, Exception)>
	//*  63  120:athrow          
	//*  64  121:astore_0        
	//*  65  122:new             #199 <Class StringBuilder>
	//*  66  125:dup             
	//*  67  126:invokespecial   #200 <Method void StringBuilder()>
	//*  68  129:astore_2        
	//*  69  130:aload_2         
	//*  70  131:ldc1            #202 <String "Unable to instantiate fragment ">
	//*  71  133:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//*  72  136:pop             
	//*  73  137:aload_2         
	//*  74  138:aload_1         
	//*  75  139:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//*  76  142:pop             
	//*  77  143:aload_2         
	//*  78  144:ldc1            #219 <String ": could not find Fragment constructor">
	//*  79  146:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//*  80  149:pop             
	//*  81  150:new             #210 <Class u>
	//*  82  153:dup             
	//*  83  154:aload_2         
	//*  84  155:invokevirtual   #214 <Method String StringBuilder.toString()>
	//*  85  158:aload_0         
	//*  86  159:invokespecial   #217 <Method void u(String, Exception)>
	//*  87  162:athrow          
	//*  88  163:astore_0        
	//*  89  164:new             #199 <Class StringBuilder>
	//*  90  167:dup             
	//*  91  168:invokespecial   #200 <Method void StringBuilder()>
	//*  92  171:astore_2        
	//*  93  172:aload_2         
	//*  94  173:ldc1            #202 <String "Unable to instantiate fragment ">
	//*  95  175:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//*  96  178:pop             
	//*  97  179:aload_2         
	//*  98  180:aload_1         
	//*  99  181:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//* 100  184:pop             
	//* 101  185:aload_2         
	//* 102  186:ldc1            #221 <String ": make sure class name exists, is public, and has an">
	//* 103  188:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//* 104  191:pop             
	//* 105  192:aload_2         
	//* 106  193:ldc1            #223 <String " empty constructor that is public">
	//* 107  195:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//* 108  198:pop             
	//* 109  199:new             #210 <Class u>
	//* 110  202:dup             
	//* 111  203:aload_2         
	//* 112  204:invokevirtual   #214 <Method String StringBuilder.toString()>
	//* 113  207:aload_0         
	//* 114  208:invokespecial   #217 <Method void u(String, Exception)>
	//* 115  211:athrow          
	//* 116  212:astore_0        
	//* 117  213:new             #199 <Class StringBuilder>
	//* 118  216:dup             
	//* 119  217:invokespecial   #200 <Method void StringBuilder()>
	//* 120  220:astore_2        
	//* 121  221:aload_2         
	//* 122  222:ldc1            #202 <String "Unable to instantiate fragment ">
	//* 123  224:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//* 124  227:pop             
	//* 125  228:aload_2         
	//* 126  229:aload_1         
	//* 127  230:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//* 128  233:pop             
	//* 129  234:aload_2         
	//* 130  235:ldc1            #221 <String ": make sure class name exists, is public, and has an">
	//* 131  237:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//* 132  240:pop             
	//* 133  241:aload_2         
	//* 134  242:ldc1            #223 <String " empty constructor that is public">
	//* 135  244:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//* 136  247:pop             
	//* 137  248:new             #210 <Class u>
	//* 138  251:dup             
	//* 139  252:aload_2         
	//* 140  253:invokevirtual   #214 <Method String StringBuilder.toString()>
	//* 141  256:aload_0         
	//* 142  257:invokespecial   #217 <Method void u(String, Exception)>
	//* 143  260:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 144  261:astore_0        
		{
			bundle = ((Bundle) (new StringBuilder()));
	//  145  262:new             #199 <Class StringBuilder>
	//  146  265:dup             
	//  147  266:invokespecial   #200 <Method void StringBuilder()>
	//  148  269:astore_2        
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
	//  149  270:aload_2         
	//  150  271:ldc1            #202 <String "Unable to instantiate fragment ">
	//  151  273:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  152  276:pop             
			((StringBuilder) (bundle)).append(s1);
	//  153  277:aload_2         
	//  154  278:aload_1         
	//  155  279:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  156  282:pop             
			((StringBuilder) (bundle)).append(": make sure class name exists, is public, and has an");
	//  157  283:aload_2         
	//  158  284:ldc1            #221 <String ": make sure class name exists, is public, and has an">
	//  159  286:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  160  289:pop             
			((StringBuilder) (bundle)).append(" empty constructor that is public");
	//  161  290:aload_2         
	//  162  291:ldc1            #223 <String " empty constructor that is public">
	//  163  293:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  164  296:pop             
			throw new u(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
	//  165  297:new             #210 <Class u>
	//  166  300:dup             
	//  167  301:aload_2         
	//  168  302:invokevirtual   #214 <Method String StringBuilder.toString()>
	//  169  305:aload_0         
	//  170  306:invokespecial   #217 <Method void u(String, Exception)>
	//  171  309:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			bundle = ((Bundle) (new StringBuilder()));
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
			((StringBuilder) (bundle)).append(s1);
			((StringBuilder) (bundle)).append(": make sure class name exists, is public, and has an");
			((StringBuilder) (bundle)).append(" empty constructor that is public");
			throw new u(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			bundle = ((Bundle) (new StringBuilder()));
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
			((StringBuilder) (bundle)).append(s1);
			((StringBuilder) (bundle)).append(": make sure class name exists, is public, and has an");
			((StringBuilder) (bundle)).append(" empty constructor that is public");
			throw new u(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			bundle = ((Bundle) (new StringBuilder()));
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
			((StringBuilder) (bundle)).append(s1);
			((StringBuilder) (bundle)).append(": could not find Fragment constructor");
			throw new u(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			bundle = ((Bundle) (new StringBuilder()));
			((StringBuilder) (bundle)).append("Unable to instantiate fragment ");
			((StringBuilder) (bundle)).append(s1);
			((StringBuilder) (bundle)).append(": calling Fragment constructor caused an exception");
			throw new u(((StringBuilder) (bundle)).toString(), ((Exception) (context)));
		}
		class1 = class2;
		if(class2 != null)
			break MISSING_BLOCK_LABEL_38;
		class1 = context.getClassLoader().loadClass(s1);
		sClassMap.put(((Object) (s1)), ((Object) (class1)));
		context = ((Context) ((Fragment)class1.getConstructor(new Class[0]).newInstance(new Object[0])));
		if(bundle == null)
			break MISSING_BLOCK_LABEL_77;
		bundle.setClassLoader(((Object) (context)).getClass().getClassLoader());
		((Fragment) (context)).setArguments(bundle);
		return ((Fragment) (context));
	}

	static boolean isSupportFragmentClass(Context context, String s1)
	{
		boolean flag;
		Class class1;
		Class class2;
		try
		{
			class2 = (Class)sClassMap.get(((Object) (s1)));
	//    0    0:getstatic       #102 <Field w sClassMap>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #154 <Method Object w.get(Object)>
	//    3    7:checkcast       #156 <Class Class>
	//    4   10:astore          4
		}
	//*   5   12:aload           4
	//*   6   14:astore_3        
	//*   7   15:aload           4
	//*   8   17:ifnonnull       38
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #162 <Method ClassLoader Context.getClassLoader()>
	//*  11   24:aload_1         
	//*  12   25:invokevirtual   #168 <Method Class ClassLoader.loadClass(String)>
	//*  13   28:astore_3        
	//*  14   29:getstatic       #102 <Field w sClassMap>
	//*  15   32:aload_1         
	//*  16   33:aload_3         
	//*  17   34:invokevirtual   #172 <Method Object w.put(Object, Object)>
	//*  18   37:pop             
	//*  19   38:ldc1            #2   <Class Fragment>
	//*  20   40:aload_3         
	//*  21   41:invokevirtual   #229 <Method boolean Class.isAssignableFrom(Class)>
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
		class1 = context.getClassLoader().loadClass(s1);
		sClassMap.put(((Object) (s1)), ((Object) (class1)));
		flag = ((Class) (android/support/v4/app/Fragment)).isAssignableFrom(class1);
		return flag;
	//*  27   49:astore_0        
	//*  28   50:goto            47
	}

	void callStartTransitionListener()
	{
		Object obj = ((Object) (mAnimationInfo));
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
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
			obj.q = false;
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:putfield        #233 <Field boolean t.q>
			obj = ((Object) (((t) (obj)).r));
	//   11   19:aload_1         
	//   12   20:getfield        #237 <Field v t.r>
	//   13   23:astore_1        
			mAnimationInfo.r = null;
	//   14   24:aload_0         
	//   15   25:getfield        #132 <Field t mAnimationInfo>
	//   16   28:aconst_null     
	//   17   29:putfield        #237 <Field v t.r>
		}
		if(obj != null)
	//*  18   32:aload_1         
	//*  19   33:ifnull          42
			((v) (obj)).a();
	//   20   36:aload_1         
	//   21   37:invokeinterface #242 <Method void v.a()>
	//   22   42:return          
	}

	public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.print(s1);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print("mFragmentId=#");
	//    3    5:aload_3         
	//    4    6:ldc1            #252 <String "mFragmentId=#">
	//    5    8:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(mFragmentId));
	//    6   11:aload_3         
	//    7   12:aload_0         
	//    8   13:getfield        #254 <Field int mFragmentId>
	//    9   16:invokestatic    #260 <Method String Integer.toHexString(int)>
	//   10   19:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(" mContainerId=#");
	//   11   22:aload_3         
	//   12   23:ldc2            #262 <String " mContainerId=#">
	//   13   26:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(Integer.toHexString(mContainerId));
	//   14   29:aload_3         
	//   15   30:aload_0         
	//   16   31:getfield        #264 <Field int mContainerId>
	//   17   34:invokestatic    #260 <Method String Integer.toHexString(int)>
	//   18   37:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(" mTag=");
	//   19   40:aload_3         
	//   20   41:ldc2            #266 <String " mTag=">
	//   21   44:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.println(mTag);
	//   22   47:aload_3         
	//   23   48:aload_0         
	//   24   49:getfield        #268 <Field String mTag>
	//   25   52:invokevirtual   #271 <Method void PrintWriter.println(String)>
		printwriter.print(s1);
	//   26   55:aload_3         
	//   27   56:aload_1         
	//   28   57:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print("mState=");
	//   29   60:aload_3         
	//   30   61:ldc2            #273 <String "mState=">
	//   31   64:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mState);
	//   32   67:aload_3         
	//   33   68:aload_0         
	//   34   69:getfield        #108 <Field int mState>
	//   35   72:invokevirtual   #276 <Method void PrintWriter.print(int)>
		printwriter.print(" mIndex=");
	//   36   75:aload_3         
	//   37   76:ldc2            #278 <String " mIndex=">
	//   38   79:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mIndex);
	//   39   82:aload_3         
	//   40   83:aload_0         
	//   41   84:getfield        #110 <Field int mIndex>
	//   42   87:invokevirtual   #276 <Method void PrintWriter.print(int)>
		printwriter.print(" mWho=");
	//   43   90:aload_3         
	//   44   91:ldc2            #280 <String " mWho=">
	//   45   94:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mWho);
	//   46   97:aload_3         
	//   47   98:aload_0         
	//   48   99:getfield        #282 <Field String mWho>
	//   49  102:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(" mBackStackNesting=");
	//   50  105:aload_3         
	//   51  106:ldc2            #284 <String " mBackStackNesting=">
	//   52  109:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.println(mBackStackNesting);
	//   53  112:aload_3         
	//   54  113:aload_0         
	//   55  114:getfield        #286 <Field int mBackStackNesting>
	//   56  117:invokevirtual   #288 <Method void PrintWriter.println(int)>
		printwriter.print(s1);
	//   57  120:aload_3         
	//   58  121:aload_1         
	//   59  122:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print("mAdded=");
	//   60  125:aload_3         
	//   61  126:ldc2            #290 <String "mAdded=">
	//   62  129:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mAdded);
	//   63  132:aload_3         
	//   64  133:aload_0         
	//   65  134:getfield        #292 <Field boolean mAdded>
	//   66  137:invokevirtual   #295 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRemoving=");
	//   67  140:aload_3         
	//   68  141:ldc2            #297 <String " mRemoving=">
	//   69  144:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mRemoving);
	//   70  147:aload_3         
	//   71  148:aload_0         
	//   72  149:getfield        #299 <Field boolean mRemoving>
	//   73  152:invokevirtual   #295 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mFromLayout=");
	//   74  155:aload_3         
	//   75  156:ldc2            #301 <String " mFromLayout=">
	//   76  159:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mFromLayout);
	//   77  162:aload_3         
	//   78  163:aload_0         
	//   79  164:getfield        #303 <Field boolean mFromLayout>
	//   80  167:invokevirtual   #295 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mInLayout=");
	//   81  170:aload_3         
	//   82  171:ldc2            #305 <String " mInLayout=">
	//   83  174:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.println(mInLayout);
	//   84  177:aload_3         
	//   85  178:aload_0         
	//   86  179:getfield        #307 <Field boolean mInLayout>
	//   87  182:invokevirtual   #309 <Method void PrintWriter.println(boolean)>
		printwriter.print(s1);
	//   88  185:aload_3         
	//   89  186:aload_1         
	//   90  187:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print("mHidden=");
	//   91  190:aload_3         
	//   92  191:ldc2            #311 <String "mHidden=">
	//   93  194:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mHidden);
	//   94  197:aload_3         
	//   95  198:aload_0         
	//   96  199:getfield        #313 <Field boolean mHidden>
	//   97  202:invokevirtual   #295 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDetached=");
	//   98  205:aload_3         
	//   99  206:ldc2            #315 <String " mDetached=">
	//  100  209:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mDetached);
	//  101  212:aload_3         
	//  102  213:aload_0         
	//  103  214:getfield        #317 <Field boolean mDetached>
	//  104  217:invokevirtual   #295 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mMenuVisible=");
	//  105  220:aload_3         
	//  106  221:ldc2            #319 <String " mMenuVisible=">
	//  107  224:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mMenuVisible);
	//  108  227:aload_3         
	//  109  228:aload_0         
	//  110  229:getfield        #114 <Field boolean mMenuVisible>
	//  111  232:invokevirtual   #295 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mHasMenu=");
	//  112  235:aload_3         
	//  113  236:ldc2            #321 <String " mHasMenu=">
	//  114  239:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.println(mHasMenu);
	//  115  242:aload_3         
	//  116  243:aload_0         
	//  117  244:getfield        #323 <Field boolean mHasMenu>
	//  118  247:invokevirtual   #309 <Method void PrintWriter.println(boolean)>
		printwriter.print(s1);
	//  119  250:aload_3         
	//  120  251:aload_1         
	//  121  252:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print("mRetainInstance=");
	//  122  255:aload_3         
	//  123  256:ldc2            #325 <String "mRetainInstance=">
	//  124  259:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mRetainInstance);
	//  125  262:aload_3         
	//  126  263:aload_0         
	//  127  264:getfield        #327 <Field boolean mRetainInstance>
	//  128  267:invokevirtual   #295 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRetaining=");
	//  129  270:aload_3         
	//  130  271:ldc2            #329 <String " mRetaining=">
	//  131  274:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.print(mRetaining);
	//  132  277:aload_3         
	//  133  278:aload_0         
	//  134  279:getfield        #331 <Field boolean mRetaining>
	//  135  282:invokevirtual   #295 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mUserVisibleHint=");
	//  136  285:aload_3         
	//  137  286:ldc2            #333 <String " mUserVisibleHint=">
	//  138  289:invokevirtual   #250 <Method void PrintWriter.print(String)>
		printwriter.println(mUserVisibleHint);
	//  139  292:aload_3         
	//  140  293:aload_0         
	//  141  294:getfield        #116 <Field boolean mUserVisibleHint>
	//  142  297:invokevirtual   #309 <Method void PrintWriter.println(boolean)>
		if(mFragmentManager != null)
	//* 143  300:aload_0         
	//* 144  301:getfield        #335 <Field ah mFragmentManager>
	//* 145  304:ifnull          327
		{
			printwriter.print(s1);
	//  146  307:aload_3         
	//  147  308:aload_1         
	//  148  309:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mFragmentManager=");
	//  149  312:aload_3         
	//  150  313:ldc2            #337 <String "mFragmentManager=">
	//  151  316:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mFragmentManager)));
	//  152  319:aload_3         
	//  153  320:aload_0         
	//  154  321:getfield        #335 <Field ah mFragmentManager>
	//  155  324:invokevirtual   #340 <Method void PrintWriter.println(Object)>
		}
		if(mHost != null)
	//* 156  327:aload_0         
	//* 157  328:getfield        #342 <Field ad mHost>
	//* 158  331:ifnull          354
		{
			printwriter.print(s1);
	//  159  334:aload_3         
	//  160  335:aload_1         
	//  161  336:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mHost=");
	//  162  339:aload_3         
	//  163  340:ldc2            #344 <String "mHost=">
	//  164  343:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mHost)));
	//  165  346:aload_3         
	//  166  347:aload_0         
	//  167  348:getfield        #342 <Field ad mHost>
	//  168  351:invokevirtual   #340 <Method void PrintWriter.println(Object)>
		}
		if(mParentFragment != null)
	//* 169  354:aload_0         
	//* 170  355:getfield        #346 <Field Fragment mParentFragment>
	//* 171  358:ifnull          381
		{
			printwriter.print(s1);
	//  172  361:aload_3         
	//  173  362:aload_1         
	//  174  363:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mParentFragment=");
	//  175  366:aload_3         
	//  176  367:ldc2            #348 <String "mParentFragment=">
	//  177  370:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mParentFragment)));
	//  178  373:aload_3         
	//  179  374:aload_0         
	//  180  375:getfield        #346 <Field Fragment mParentFragment>
	//  181  378:invokevirtual   #340 <Method void PrintWriter.println(Object)>
		}
		if(mArguments != null)
	//* 182  381:aload_0         
	//* 183  382:getfield        #350 <Field Bundle mArguments>
	//* 184  385:ifnull          408
		{
			printwriter.print(s1);
	//  185  388:aload_3         
	//  186  389:aload_1         
	//  187  390:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mArguments=");
	//  188  393:aload_3         
	//  189  394:ldc2            #352 <String "mArguments=">
	//  190  397:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mArguments)));
	//  191  400:aload_3         
	//  192  401:aload_0         
	//  193  402:getfield        #350 <Field Bundle mArguments>
	//  194  405:invokevirtual   #340 <Method void PrintWriter.println(Object)>
		}
		if(mSavedFragmentState != null)
	//* 195  408:aload_0         
	//* 196  409:getfield        #354 <Field Bundle mSavedFragmentState>
	//* 197  412:ifnull          435
		{
			printwriter.print(s1);
	//  198  415:aload_3         
	//  199  416:aload_1         
	//  200  417:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mSavedFragmentState=");
	//  201  420:aload_3         
	//  202  421:ldc2            #356 <String "mSavedFragmentState=">
	//  203  424:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mSavedFragmentState)));
	//  204  427:aload_3         
	//  205  428:aload_0         
	//  206  429:getfield        #354 <Field Bundle mSavedFragmentState>
	//  207  432:invokevirtual   #340 <Method void PrintWriter.println(Object)>
		}
		if(mSavedViewState != null)
	//* 208  435:aload_0         
	//* 209  436:getfield        #358 <Field SparseArray mSavedViewState>
	//* 210  439:ifnull          462
		{
			printwriter.print(s1);
	//  211  442:aload_3         
	//  212  443:aload_1         
	//  213  444:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mSavedViewState=");
	//  214  447:aload_3         
	//  215  448:ldc2            #360 <String "mSavedViewState=">
	//  216  451:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mSavedViewState)));
	//  217  454:aload_3         
	//  218  455:aload_0         
	//  219  456:getfield        #358 <Field SparseArray mSavedViewState>
	//  220  459:invokevirtual   #340 <Method void PrintWriter.println(Object)>
		}
		if(mTarget != null)
	//* 221  462:aload_0         
	//* 222  463:getfield        #362 <Field Fragment mTarget>
	//* 223  466:ifnull          504
		{
			printwriter.print(s1);
	//  224  469:aload_3         
	//  225  470:aload_1         
	//  226  471:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mTarget=");
	//  227  474:aload_3         
	//  228  475:ldc2            #364 <String "mTarget=">
	//  229  478:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print(((Object) (mTarget)));
	//  230  481:aload_3         
	//  231  482:aload_0         
	//  232  483:getfield        #362 <Field Fragment mTarget>
	//  233  486:invokevirtual   #366 <Method void PrintWriter.print(Object)>
			printwriter.print(" mTargetRequestCode=");
	//  234  489:aload_3         
	//  235  490:ldc2            #368 <String " mTargetRequestCode=">
	//  236  493:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(mTargetRequestCode);
	//  237  496:aload_3         
	//  238  497:aload_0         
	//  239  498:getfield        #370 <Field int mTargetRequestCode>
	//  240  501:invokevirtual   #288 <Method void PrintWriter.println(int)>
		}
		if(getNextAnim() != 0)
	//* 241  504:aload_0         
	//* 242  505:invokevirtual   #374 <Method int getNextAnim()>
	//* 243  508:ifeq            531
		{
			printwriter.print(s1);
	//  244  511:aload_3         
	//  245  512:aload_1         
	//  246  513:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mNextAnim=");
	//  247  516:aload_3         
	//  248  517:ldc2            #376 <String "mNextAnim=">
	//  249  520:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(getNextAnim());
	//  250  523:aload_3         
	//  251  524:aload_0         
	//  252  525:invokevirtual   #374 <Method int getNextAnim()>
	//  253  528:invokevirtual   #288 <Method void PrintWriter.println(int)>
		}
		if(mContainer != null)
	//* 254  531:aload_0         
	//* 255  532:getfield        #378 <Field ViewGroup mContainer>
	//* 256  535:ifnull          558
		{
			printwriter.print(s1);
	//  257  538:aload_3         
	//  258  539:aload_1         
	//  259  540:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mContainer=");
	//  260  543:aload_3         
	//  261  544:ldc2            #380 <String "mContainer=">
	//  262  547:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mContainer)));
	//  263  550:aload_3         
	//  264  551:aload_0         
	//  265  552:getfield        #378 <Field ViewGroup mContainer>
	//  266  555:invokevirtual   #340 <Method void PrintWriter.println(Object)>
		}
		if(mView != null)
	//* 267  558:aload_0         
	//* 268  559:getfield        #382 <Field View mView>
	//* 269  562:ifnull          585
		{
			printwriter.print(s1);
	//  270  565:aload_3         
	//  271  566:aload_1         
	//  272  567:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mView=");
	//  273  570:aload_3         
	//  274  571:ldc2            #384 <String "mView=">
	//  275  574:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mView)));
	//  276  577:aload_3         
	//  277  578:aload_0         
	//  278  579:getfield        #382 <Field View mView>
	//  279  582:invokevirtual   #340 <Method void PrintWriter.println(Object)>
		}
		if(mInnerView != null)
	//* 280  585:aload_0         
	//* 281  586:getfield        #386 <Field View mInnerView>
	//* 282  589:ifnull          612
		{
			printwriter.print(s1);
	//  283  592:aload_3         
	//  284  593:aload_1         
	//  285  594:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mInnerView=");
	//  286  597:aload_3         
	//  287  598:ldc2            #388 <String "mInnerView=">
	//  288  601:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mView)));
	//  289  604:aload_3         
	//  290  605:aload_0         
	//  291  606:getfield        #382 <Field View mView>
	//  292  609:invokevirtual   #340 <Method void PrintWriter.println(Object)>
		}
		if(getAnimatingAway() != null)
	//* 293  612:aload_0         
	//* 294  613:invokevirtual   #392 <Method View getAnimatingAway()>
	//* 295  616:ifnull          659
		{
			printwriter.print(s1);
	//  296  619:aload_3         
	//  297  620:aload_1         
	//  298  621:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mAnimatingAway=");
	//  299  624:aload_3         
	//  300  625:ldc2            #394 <String "mAnimatingAway=">
	//  301  628:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (getAnimatingAway())));
	//  302  631:aload_3         
	//  303  632:aload_0         
	//  304  633:invokevirtual   #392 <Method View getAnimatingAway()>
	//  305  636:invokevirtual   #340 <Method void PrintWriter.println(Object)>
			printwriter.print(s1);
	//  306  639:aload_3         
	//  307  640:aload_1         
	//  308  641:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.print("mStateAfterAnimating=");
	//  309  644:aload_3         
	//  310  645:ldc2            #396 <String "mStateAfterAnimating=">
	//  311  648:invokevirtual   #250 <Method void PrintWriter.print(String)>
			printwriter.println(getStateAfterAnimating());
	//  312  651:aload_3         
	//  313  652:aload_0         
	//  314  653:invokevirtual   #399 <Method int getStateAfterAnimating()>
	//  315  656:invokevirtual   #288 <Method void PrintWriter.println(int)>
		}
		if(getContext() != null)
	//* 316  659:aload_0         
	//* 317  660:invokevirtual   #403 <Method Context getContext()>
	//* 318  663:ifnull          678
			ca.a(((j) (this))).a(s1, filedescriptor, printwriter, as);
	//  319  666:aload_0         
	//  320  667:invokestatic    #408 <Method ca ca.a(j)>
	//  321  670:aload_1         
	//  322  671:aload_2         
	//  323  672:aload_3         
	//  324  673:aload           4
	//  325  675:invokevirtual   #410 <Method void ca.a(String, FileDescriptor, PrintWriter, String[])>
		if(mChildFragmentManager != null)
	//* 326  678:aload_0         
	//* 327  679:getfield        #412 <Field ah mChildFragmentManager>
	//* 328  682:ifnull          781
		{
			printwriter.print(s1);
	//  329  685:aload_3         
	//  330  686:aload_1         
	//  331  687:invokevirtual   #250 <Method void PrintWriter.print(String)>
			Object obj = ((Object) (new StringBuilder()));
	//  332  690:new             #199 <Class StringBuilder>
	//  333  693:dup             
	//  334  694:invokespecial   #200 <Method void StringBuilder()>
	//  335  697:astore          5
			((StringBuilder) (obj)).append("Child ");
	//  336  699:aload           5
	//  337  701:ldc2            #414 <String "Child ">
	//  338  704:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  339  707:pop             
			((StringBuilder) (obj)).append(((Object) (mChildFragmentManager)));
	//  340  708:aload           5
	//  341  710:aload_0         
	//  342  711:getfield        #412 <Field ah mChildFragmentManager>
	//  343  714:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//  344  717:pop             
			((StringBuilder) (obj)).append(":");
	//  345  718:aload           5
	//  346  720:ldc2            #419 <String ":">
	//  347  723:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  348  726:pop             
			printwriter.println(((StringBuilder) (obj)).toString());
	//  349  727:aload_3         
	//  350  728:aload           5
	//  351  730:invokevirtual   #214 <Method String StringBuilder.toString()>
	//  352  733:invokevirtual   #271 <Method void PrintWriter.println(String)>
			obj = ((Object) (mChildFragmentManager));
	//  353  736:aload_0         
	//  354  737:getfield        #412 <Field ah mChildFragmentManager>
	//  355  740:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//  356  742:new             #199 <Class StringBuilder>
	//  357  745:dup             
	//  358  746:invokespecial   #200 <Method void StringBuilder()>
	//  359  749:astore          6
			stringbuilder.append(s1);
	//  360  751:aload           6
	//  361  753:aload_1         
	//  362  754:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  363  757:pop             
			stringbuilder.append("  ");
	//  364  758:aload           6
	//  365  760:ldc2            #421 <String "  ">
	//  366  763:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//  367  766:pop             
			((ah) (obj)).a(stringbuilder.toString(), filedescriptor, printwriter, as);
	//  368  767:aload           5
	//  369  769:aload           6
	//  370  771:invokevirtual   #214 <Method String StringBuilder.toString()>
	//  371  774:aload_2         
	//  372  775:aload_3         
	//  373  776:aload           4
	//  374  778:invokevirtual   #424 <Method void ah.a(String, FileDescriptor, PrintWriter, String[])>
		}
	//  375  781:return          
	}

	public final boolean equals(Object obj)
	{
		return super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #428 <Method boolean Object.equals(Object)>
	//    3    5:ireturn         
	}

	Fragment findFragmentByWho(String s1)
	{
		if(s1.equals(((Object) (mWho))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #282 <Field String mWho>
	//*   3    5:invokevirtual   #433 <Method boolean String.equals(Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		ah ah1 = mChildFragmentManager;
	//    7   13:aload_0         
	//    8   14:getfield        #412 <Field ah mChildFragmentManager>
	//    9   17:astore_2        
		if(ah1 != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          28
			return ah1.b(s1);
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #436 <Method Fragment ah.b(String)>
	//   15   27:areturn         
		else
			return null;
	//   16   28:aconst_null     
	//   17   29:areturn         
	}

	public final x getActivity()
	{
		ad ad1 = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field ad mHost>
	//    2    4:astore_1        
		if(ad1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return (x)ad1.h();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #444 <Method Activity ad.h()>
	//    9   15:checkcast       #446 <Class x>
	//   10   18:areturn         
	}

	public boolean getAllowEnterTransitionOverlap()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 != null && t1.n != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
	//*   5    9:aload_1         
	//*   6   10:getfield        #451 <Field Boolean t.n>
	//*   7   13:ifnonnull       19
	//*   8   16:goto            30
			return mAnimationInfo.n.booleanValue();
	//    9   19:aload_0         
	//   10   20:getfield        #132 <Field t mAnimationInfo>
	//   11   23:getfield        #451 <Field Boolean t.n>
	//   12   26:invokevirtual   #456 <Method boolean Boolean.booleanValue()>
	//   13   29:ireturn         
		else
			return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
	}

	public boolean getAllowReturnTransitionOverlap()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 != null && t1.m != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
	//*   5    9:aload_1         
	//*   6   10:getfield        #460 <Field Boolean t.m>
	//*   7   13:ifnonnull       19
	//*   8   16:goto            30
			return mAnimationInfo.m.booleanValue();
	//    9   19:aload_0         
	//   10   20:getfield        #132 <Field t mAnimationInfo>
	//   11   23:getfield        #460 <Field Boolean t.m>
	//   12   26:invokevirtual   #456 <Method boolean Boolean.booleanValue()>
	//   13   29:ireturn         
		else
			return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         
	}

	View getAnimatingAway()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return t1.a;
	//    7   11:aload_1         
	//    8   12:getfield        #462 <Field View t.a>
	//    9   15:areturn         
	}

	Animator getAnimator()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return t1.b;
	//    7   11:aload_1         
	//    8   12:getfield        #467 <Field Animator t.b>
	//    9   15:areturn         
	}

	public final Bundle getArguments()
	{
		return mArguments;
	//    0    0:aload_0         
	//    1    1:getfield        #350 <Field Bundle mArguments>
	//    2    4:areturn         
	}

	public final ae getChildFragmentManager()
	{
		if(mChildFragmentManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #412 <Field ah mChildFragmentManager>
	//*   2    4:ifnonnull       73
		{
			instantiateChildFragmentManager();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #474 <Method void instantiateChildFragmentManager()>
			int i = mState;
	//    5   11:aload_0         
	//    6   12:getfield        #108 <Field int mState>
	//    7   15:istore_1        
			if(i >= 4)
	//*   8   16:iload_1         
	//*   9   17:iconst_4        
	//*  10   18:icmplt          31
				mChildFragmentManager.r();
	//   11   21:aload_0         
	//   12   22:getfield        #412 <Field ah mChildFragmentManager>
	//   13   25:invokevirtual   #476 <Method void ah.r()>
			else
	//*  14   28:goto            73
			if(i >= 3)
	//*  15   31:iload_1         
	//*  16   32:iconst_3        
	//*  17   33:icmplt          46
				mChildFragmentManager.q();
	//   18   36:aload_0         
	//   19   37:getfield        #412 <Field ah mChildFragmentManager>
	//   20   40:invokevirtual   #478 <Method void ah.q()>
			else
	//*  21   43:goto            73
			if(i >= 2)
	//*  22   46:iload_1         
	//*  23   47:iconst_2        
	//*  24   48:icmplt          61
				mChildFragmentManager.p();
	//   25   51:aload_0         
	//   26   52:getfield        #412 <Field ah mChildFragmentManager>
	//   27   55:invokevirtual   #481 <Method void ah.p()>
			else
	//*  28   58:goto            73
			if(i >= 1)
	//*  29   61:iload_1         
	//*  30   62:iconst_1        
	//*  31   63:icmplt          73
				mChildFragmentManager.o();
	//   32   66:aload_0         
	//   33   67:getfield        #412 <Field ah mChildFragmentManager>
	//   34   70:invokevirtual   #484 <Method void android.support.v4.app.ah.o()>
		}
		return ((ae) (mChildFragmentManager));
	//   35   73:aload_0         
	//   36   74:getfield        #412 <Field ah mChildFragmentManager>
	//   37   77:areturn         
	}

	public Context getContext()
	{
		ad ad1 = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field ad mHost>
	//    2    4:astore_1        
		if(ad1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ad1.i();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #487 <Method Context ad.i()>
	//    9   15:areturn         
	}

	public Object getEnterTransition()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return t1.g;
	//    7   11:aload_1         
	//    8   12:getfield        #492 <Field Object android.support.v4.app.t.g>
	//    9   15:areturn         
	}

	cy getEnterTransitionCallback()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return t1.o;
	//    7   11:aload_1         
	//    8   12:getfield        #497 <Field cy android.support.v4.app.t.o>
	//    9   15:areturn         
	}

	public Object getExitTransition()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return t1.i;
	//    7   11:aload_1         
	//    8   12:getfield        #500 <Field Object t.i>
	//    9   15:areturn         
	}

	cy getExitTransitionCallback()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return t1.p;
	//    7   11:aload_1         
	//    8   12:getfield        #503 <Field cy t.p>
	//    9   15:areturn         
	}

	public final ae getFragmentManager()
	{
		return ((ae) (mFragmentManager));
	//    0    0:aload_0         
	//    1    1:getfield        #335 <Field ah mFragmentManager>
	//    2    4:areturn         
	}

	public final Object getHost()
	{
		ad ad1 = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field ad mHost>
	//    2    4:astore_1        
		if(ad1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ad1.g();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #507 <Method Object android.support.v4.app.ad.g()>
	//    9   15:areturn         
	}

	public final int getId()
	{
		return mFragmentId;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field int mFragmentId>
	//    2    4:ireturn         
	}

	public final LayoutInflater getLayoutInflater()
	{
		LayoutInflater layoutinflater = mLayoutInflater;
	//    0    0:aload_0         
	//    1    1:getfield        #512 <Field LayoutInflater mLayoutInflater>
	//    2    4:astore_1        
		if(layoutinflater == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       15
			return performGetLayoutInflater(((Bundle) (null)));
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #516 <Method LayoutInflater performGetLayoutInflater(Bundle)>
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
	//    1    1:getfield        #342 <Field ad mHost>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          32
		{
			bundle = ((Bundle) (((ad) (bundle)).b()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #519 <Method LayoutInflater ad.b()>
	//    7   13:astore_1        
			getChildFragmentManager();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #521 <Method ae getChildFragmentManager()>
	//   10   18:pop             
			o.a(((LayoutInflater) (bundle)), mChildFragmentManager.y());
	//   11   19:aload_1         
	//   12   20:aload_0         
	//   13   21:getfield        #412 <Field ah mChildFragmentManager>
	//   14   24:invokevirtual   #525 <Method android.view.LayoutInflater$Factory2 ah.y()>
	//   15   27:invokestatic    #530 <Method void o.a(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return ((LayoutInflater) (bundle));
	//   16   30:aload_1         
	//   17   31:areturn         
		} else
		{
			throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
	//   18   32:new             #532 <Class IllegalStateException>
	//   19   35:dup             
	//   20   36:ldc2            #534 <String "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.">
	//   21   39:invokespecial   #536 <Method void IllegalStateException(String)>
	//   22   42:athrow          
		}
	}

	public android.arch.lifecycle.f getLifecycle()
	{
		return ((android.arch.lifecycle.f) (mLifecycleRegistry));
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field k mLifecycleRegistry>
	//    2    4:areturn         
	}

	public ca getLoaderManager()
	{
		return ca.a(((j) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #408 <Method ca ca.a(j)>
	//    2    4:areturn         
	}

	int getNextAnim()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return t1.d;
	//    7   11:aload_1         
	//    8   12:getfield        #544 <Field int t.d>
	//    9   15:ireturn         
	}

	int getNextTransition()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return t1.e;
	//    7   11:aload_1         
	//    8   12:getfield        #548 <Field int t.e>
	//    9   15:ireturn         
	}

	int getNextTransitionStyle()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return t1.f;
	//    7   11:aload_1         
	//    8   12:getfield        #552 <Field int android.support.v4.app.t.f>
	//    9   15:ireturn         
	}

	public final Fragment getParentFragment()
	{
		return mParentFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #346 <Field Fragment mParentFragment>
	//    2    4:areturn         
	}

	public Object getReenterTransition()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(t1.j == USE_DEFAULT_TRANSITION)
	//*   7   11:aload_1         
	//*   8   12:getfield        #558 <Field Object android.support.v4.app.t.j>
	//*   9   15:getstatic       #105 <Field Object USE_DEFAULT_TRANSITION>
	//*  10   18:if_acmpne       26
			return getExitTransition();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #560 <Method Object getExitTransition()>
	//   13   25:areturn         
		else
			return mAnimationInfo.j;
	//   14   26:aload_0         
	//   15   27:getfield        #132 <Field t mAnimationInfo>
	//   16   30:getfield        #558 <Field Object android.support.v4.app.t.j>
	//   17   33:areturn         
	}

	public final Resources getResources()
	{
		return requireContext().getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #565 <Method Context requireContext()>
	//    2    4:invokevirtual   #567 <Method Resources Context.getResources()>
	//    3    7:areturn         
	}

	public final boolean getRetainInstance()
	{
		return mRetainInstance;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field boolean mRetainInstance>
	//    2    4:ireturn         
	}

	public Object getReturnTransition()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(t1.h == USE_DEFAULT_TRANSITION)
	//*   7   11:aload_1         
	//*   8   12:getfield        #571 <Field Object t.h>
	//*   9   15:getstatic       #105 <Field Object USE_DEFAULT_TRANSITION>
	//*  10   18:if_acmpne       26
			return getEnterTransition();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #573 <Method Object getEnterTransition()>
	//   13   25:areturn         
		else
			return mAnimationInfo.h;
	//   14   26:aload_0         
	//   15   27:getfield        #132 <Field t mAnimationInfo>
	//   16   30:getfield        #571 <Field Object t.h>
	//   17   33:areturn         
	}

	public Object getSharedElementEnterTransition()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return t1.k;
	//    7   11:aload_1         
	//    8   12:getfield        #577 <Field Object android.support.v4.app.t.k>
	//    9   15:areturn         
	}

	public Object getSharedElementReturnTransition()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		if(t1.l == USE_DEFAULT_TRANSITION)
	//*   7   11:aload_1         
	//*   8   12:getfield        #581 <Field Object t.l>
	//*   9   15:getstatic       #105 <Field Object USE_DEFAULT_TRANSITION>
	//*  10   18:if_acmpne       26
			return getSharedElementEnterTransition();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #583 <Method Object getSharedElementEnterTransition()>
	//   13   25:areturn         
		else
			return mAnimationInfo.l;
	//   14   26:aload_0         
	//   15   27:getfield        #132 <Field t mAnimationInfo>
	//   16   30:getfield        #581 <Field Object t.l>
	//   17   33:areturn         
	}

	int getStateAfterAnimating()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return t1.c;
	//    7   11:aload_1         
	//    8   12:getfield        #586 <Field int t.c>
	//    9   15:ireturn         
	}

	public final String getString(int i)
	{
		return getResources().getString(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #588 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #592 <Method String Resources.getString(int)>
	//    4    8:areturn         
	}

	public final transient String getString(int i, Object aobj[])
	{
		return getResources().getString(i, aobj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #588 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #595 <Method String Resources.getString(int, Object[])>
	//    5    9:areturn         
	}

	public final String getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field String mTag>
	//    2    4:areturn         
	}

	public final Fragment getTargetFragment()
	{
		return mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #362 <Field Fragment mTarget>
	//    2    4:areturn         
	}

	public final int getTargetRequestCode()
	{
		return mTargetRequestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #370 <Field int mTargetRequestCode>
	//    2    4:ireturn         
	}

	public final CharSequence getText(int i)
	{
		return getResources().getText(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #588 <Method Resources getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #602 <Method CharSequence Resources.getText(int)>
	//    4    8:areturn         
	}

	public boolean getUserVisibleHint()
	{
		return mUserVisibleHint;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field boolean mUserVisibleHint>
	//    2    4:ireturn         
	}

	public View getView()
	{
		return mView;
	//    0    0:aload_0         
	//    1    1:getfield        #382 <Field View mView>
	//    2    4:areturn         
	}

	public j getViewLifecycleOwner()
	{
		j j1 = mViewLifecycleOwner;
	//    0    0:aload_0         
	//    1    1:getfield        #608 <Field j mViewLifecycleOwner>
	//    2    4:astore_1        
		if(j1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return j1;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
	//    7   11:new             #532 <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:ldc2            #610 <String "Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()">
	//   10   18:invokespecial   #536 <Method void IllegalStateException(String)>
	//   11   21:athrow          
	}

	public LiveData getViewLifecycleOwnerLiveData()
	{
		return ((LiveData) (mViewLifecycleOwnerLiveData));
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field s mViewLifecycleOwnerLiveData>
	//    2    4:areturn         
	}

	public aa getViewModelStore()
	{
		if(getContext() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #403 <Method Context getContext()>
	//*   2    4:ifnull          30
		{
			if(mViewModelStore == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #616 <Field aa mViewModelStore>
	//*   5   11:ifnonnull       25
				mViewModelStore = new aa();
	//    6   14:aload_0         
	//    7   15:new             #618 <Class aa>
	//    8   18:dup             
	//    9   19:invokespecial   #619 <Method void aa()>
	//   10   22:putfield        #616 <Field aa mViewModelStore>
			return mViewModelStore;
	//   11   25:aload_0         
	//   12   26:getfield        #616 <Field aa mViewModelStore>
	//   13   29:areturn         
		} else
		{
			throw new IllegalStateException("Can't access ViewModels from detached fragment");
	//   14   30:new             #532 <Class IllegalStateException>
	//   15   33:dup             
	//   16   34:ldc2            #621 <String "Can't access ViewModels from detached fragment">
	//   17   37:invokespecial   #536 <Method void IllegalStateException(String)>
	//   18   40:athrow          
		}
	}

	public final boolean hasOptionsMenu()
	{
		return mHasMenu;
	//    0    0:aload_0         
	//    1    1:getfield        #323 <Field boolean mHasMenu>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #625 <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	void initState()
	{
		mIndex = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #110 <Field int mIndex>
		mWho = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #282 <Field String mWho>
		mAdded = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #292 <Field boolean mAdded>
		mRemoving = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #299 <Field boolean mRemoving>
		mFromLayout = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #303 <Field boolean mFromLayout>
		mInLayout = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #307 <Field boolean mInLayout>
		mRestored = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #628 <Field boolean mRestored>
		mBackStackNesting = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #286 <Field int mBackStackNesting>
		mFragmentManager = null;
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:putfield        #335 <Field ah mFragmentManager>
		mChildFragmentManager = null;
	//   27   45:aload_0         
	//   28   46:aconst_null     
	//   29   47:putfield        #412 <Field ah mChildFragmentManager>
		mHost = null;
	//   30   50:aload_0         
	//   31   51:aconst_null     
	//   32   52:putfield        #342 <Field ad mHost>
		mFragmentId = 0;
	//   33   55:aload_0         
	//   34   56:iconst_0        
	//   35   57:putfield        #254 <Field int mFragmentId>
		mContainerId = 0;
	//   36   60:aload_0         
	//   37   61:iconst_0        
	//   38   62:putfield        #264 <Field int mContainerId>
		mTag = null;
	//   39   65:aload_0         
	//   40   66:aconst_null     
	//   41   67:putfield        #268 <Field String mTag>
		mHidden = false;
	//   42   70:aload_0         
	//   43   71:iconst_0        
	//   44   72:putfield        #313 <Field boolean mHidden>
		mDetached = false;
	//   45   75:aload_0         
	//   46   76:iconst_0        
	//   47   77:putfield        #317 <Field boolean mDetached>
		mRetaining = false;
	//   48   80:aload_0         
	//   49   81:iconst_0        
	//   50   82:putfield        #331 <Field boolean mRetaining>
	//   51   85:return          
	}

	void instantiateChildFragmentManager()
	{
		if(mHost != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #342 <Field ad mHost>
	//*   2    4:ifnull          39
		{
			mChildFragmentManager = new ah();
	//    3    7:aload_0         
	//    4    8:new             #423 <Class ah>
	//    5   11:dup             
	//    6   12:invokespecial   #629 <Method void ah()>
	//    7   15:putfield        #412 <Field ah mChildFragmentManager>
			mChildFragmentManager.a(mHost, ((android.support.v4.app.ab) (new r(this))), this);
	//    8   18:aload_0         
	//    9   19:getfield        #412 <Field ah mChildFragmentManager>
	//   10   22:aload_0         
	//   11   23:getfield        #342 <Field ad mHost>
	//   12   26:new             #631 <Class r>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokespecial   #634 <Method void r(Fragment)>
	//   16   34:aload_0         
	//   17   35:invokevirtual   #637 <Method void ah.a(ad, android.support.v4.app.ab, Fragment)>
			return;
	//   18   38:return          
		} else
		{
			throw new IllegalStateException("Fragment has not been attached yet.");
	//   19   39:new             #532 <Class IllegalStateException>
	//   20   42:dup             
	//   21   43:ldc2            #639 <String "Fragment has not been attached yet.">
	//   22   46:invokespecial   #536 <Method void IllegalStateException(String)>
	//   23   49:athrow          
		}
	}

	public final boolean isAdded()
	{
		return mHost != null && mAdded;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field ad mHost>
	//    2    4:ifnull          16
	//    3    7:aload_0         
	//    4    8:getfield        #292 <Field boolean mAdded>
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
	//    1    1:getfield        #317 <Field boolean mDetached>
	//    2    4:ireturn         
	}

	public final boolean isHidden()
	{
		return mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field boolean mHidden>
	//    2    4:ireturn         
	}

	boolean isHideReplaced()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return t1.s;
	//    7   11:aload_1         
	//    8   12:getfield        #646 <Field boolean android.support.v4.app.t.s>
	//    9   15:ireturn         
	}

	final boolean isInBackStack()
	{
		return mBackStackNesting > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #286 <Field int mBackStackNesting>
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
	//    1    1:getfield        #307 <Field boolean mInLayout>
	//    2    4:ireturn         
	}

	public final boolean isMenuVisible()
	{
		return mMenuVisible;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field boolean mMenuVisible>
	//    2    4:ireturn         
	}

	boolean isPostponed()
	{
		t t1 = mAnimationInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field t mAnimationInfo>
	//    2    4:astore_1        
		if(t1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return t1.q;
	//    7   11:aload_1         
	//    8   12:getfield        #233 <Field boolean t.q>
	//    9   15:ireturn         
	}

	public final boolean isRemoving()
	{
		return mRemoving;
	//    0    0:aload_0         
	//    1    1:getfield        #299 <Field boolean mRemoving>
	//    2    4:ireturn         
	}

	public final boolean isResumed()
	{
		return mState >= 4;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field int mState>
	//    2    4:iconst_4        
	//    3    5:icmplt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final boolean isStateSaved()
	{
		ah ah1 = mFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #335 <Field ah mFragmentManager>
	//    2    4:astore_1        
		if(ah1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return ah1.e();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #655 <Method boolean ah.e()>
	//    9   15:ireturn         
	}

	public final boolean isVisible()
	{
		if(isAdded() && !isHidden())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #658 <Method boolean isAdded()>
	//*   2    4:ifeq            42
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #660 <Method boolean isHidden()>
	//*   5   11:ifne            42
		{
			View view = mView;
	//    6   14:aload_0         
	//    7   15:getfield        #382 <Field View mView>
	//    8   18:astore_1        
			if(view != null && view.getWindowToken() != null && mView.getVisibility() == 0)
	//*   9   19:aload_1         
	//*  10   20:ifnull          42
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #666 <Method android.os.IBinder View.getWindowToken()>
	//*  13   27:ifnull          42
	//*  14   30:aload_0         
	//*  15   31:getfield        #382 <Field View mView>
	//*  16   34:invokevirtual   #669 <Method int View.getVisibility()>
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
		ah ah1 = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #412 <Field ah mChildFragmentManager>
	//    2    4:astore_1        
		if(ah1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			ah1.n();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #672 <Method void ah.n()>
	//    7   13:return          
	}

	public void onActivityCreated(Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #675 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onActivityResult(int i, int l, Intent intent)
	{
	//    0    0:return          
	}

	public void onAttach(Activity activity)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #675 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onAttach(Context context)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #675 <Field boolean mCalled>
		context = ((Context) (mHost));
	//    3    5:aload_0         
	//    4    6:getfield        #342 <Field ad mHost>
	//    5    9:astore_1        
		if(context == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       19
			context = null;
	//    8   14:aconst_null     
	//    9   15:astore_1        
		else
	//*  10   16:goto            24
			context = ((Context) (((ad) (context)).h()));
	//   11   19:aload_1         
	//   12   20:invokevirtual   #444 <Method Activity ad.h()>
	//   13   23:astore_1        
		if(context != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          38
		{
			mCalled = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #675 <Field boolean mCalled>
			onAttach(((Activity) (context)));
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #682 <Method void onAttach(Activity)>
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
	//    2    2:putfield        #675 <Field boolean mCalled>
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
	//    2    2:putfield        #675 <Field boolean mCalled>
		restoreChildFragmentState(bundle);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #691 <Method void restoreChildFragmentState(Bundle)>
		bundle = ((Bundle) (mChildFragmentManager));
	//    6   10:aload_0         
	//    7   11:getfield        #412 <Field ah mChildFragmentManager>
	//    8   14:astore_1        
		if(bundle != null && !((ah) (bundle)).a(1))
	//*   9   15:aload_1         
	//*  10   16:ifnull          34
	//*  11   19:aload_1         
	//*  12   20:iconst_1        
	//*  13   21:invokevirtual   #694 <Method boolean ah.a(int)>
	//*  14   24:ifne            34
			mChildFragmentManager.o();
	//   15   27:aload_0         
	//   16   28:getfield        #412 <Field ah mChildFragmentManager>
	//   17   31:invokevirtual   #484 <Method void android.support.v4.app.ah.o()>
	//   18   34:return          
	}

	public Animation onCreateAnimation(int i, boolean flag, int l)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Animator onCreateAnimator(int i, boolean flag, int l)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
	{
		getActivity().onCreateContextMenu(contextmenu, view, contextmenuinfo);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #702 <Method x getActivity()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #704 <Method void x.onCreateContextMenu(ContextMenu, View, android.view.ContextMenu$ContextMenuInfo)>
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
	//    4    4:putfield        #675 <Field boolean mCalled>
		Object obj = ((Object) (getActivity()));
	//    5    7:aload_0         
	//    6    8:invokevirtual   #702 <Method x getActivity()>
	//    7   11:astore_2        
		if(obj == null || !((x) (obj)).isChangingConfigurations())
	//*   8   12:aload_2         
	//*   9   13:ifnull          26
	//*  10   16:aload_2         
	//*  11   17:invokevirtual   #712 <Method boolean x.isChangingConfigurations()>
	//*  12   20:ifeq            26
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_1        
		obj = ((Object) (mViewModelStore));
	//   16   28:aload_0         
	//   17   29:getfield        #616 <Field aa mViewModelStore>
	//   18   32:astore_2        
		if(obj != null && !flag)
	//*  19   33:aload_2         
	//*  20   34:ifnull          45
	//*  21   37:iload_1         
	//*  22   38:ifne            45
			((aa) (obj)).a();
	//   23   41:aload_2         
	//   24   42:invokevirtual   #713 <Method void aa.a()>
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
	//    2    2:putfield        #675 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onDetach()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #675 <Field boolean mCalled>
	//    3    5:return          
	}

	public LayoutInflater onGetLayoutInflater(Bundle bundle)
	{
		return getLayoutInflater(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #719 <Method LayoutInflater getLayoutInflater(Bundle)>
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
	//    2    2:putfield        #675 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onInflate(Context context, AttributeSet attributeset, Bundle bundle)
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #675 <Field boolean mCalled>
		context = ((Context) (mHost));
	//    3    5:aload_0         
	//    4    6:getfield        #342 <Field ad mHost>
	//    5    9:astore_1        
		if(context == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       19
			context = null;
	//    8   14:aconst_null     
	//    9   15:astore_1        
		else
	//*  10   16:goto            24
			context = ((Context) (((ad) (context)).h()));
	//   11   19:aload_1         
	//   12   20:invokevirtual   #444 <Method Activity ad.h()>
	//   13   23:astore_1        
		if(context != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          40
		{
			mCalled = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #675 <Field boolean mCalled>
			onInflate(((Activity) (context)), attributeset, bundle);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:aload_2         
	//   22   36:aload_3         
	//   23   37:invokevirtual   #725 <Method void onInflate(Activity, AttributeSet, Bundle)>
		}
	//   24   40:return          
	}

	public void onLowMemory()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #675 <Field boolean mCalled>
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
	//    2    2:putfield        #675 <Field boolean mCalled>
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
	//    2    2:putfield        #675 <Field boolean mCalled>
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
	//    2    2:putfield        #675 <Field boolean mCalled>
	//    3    5:return          
	}

	public void onStop()
	{
		mCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #675 <Field boolean mCalled>
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
	//    2    2:putfield        #675 <Field boolean mCalled>
	//    3    5:return          
	}

	ae peekChildFragmentManager()
	{
		return ((ae) (mChildFragmentManager));
	//    0    0:aload_0         
	//    1    1:getfield        #412 <Field ah mChildFragmentManager>
	//    2    4:areturn         
	}

	void performActivityCreated(Bundle bundle)
	{
		ah ah1 = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #412 <Field ah mChildFragmentManager>
	//    2    4:astore_2        
		if(ah1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			ah1.n();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #672 <Method void ah.n()>
		mState = 2;
	//    7   13:aload_0         
	//    8   14:iconst_2        
	//    9   15:putfield        #108 <Field int mState>
		mCalled = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #675 <Field boolean mCalled>
		onActivityCreated(bundle);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #746 <Method void onActivityCreated(Bundle)>
		if(mCalled)
	//*  16   28:aload_0         
	//*  17   29:getfield        #675 <Field boolean mCalled>
	//*  18   32:ifeq            49
		{
			bundle = ((Bundle) (mChildFragmentManager));
	//   19   35:aload_0         
	//   20   36:getfield        #412 <Field ah mChildFragmentManager>
	//   21   39:astore_1        
			if(bundle != null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          48
				((ah) (bundle)).p();
	//   24   44:aload_1         
	//   25   45:invokevirtual   #481 <Method void ah.p()>
			return;
	//   26   48:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   27   49:new             #199 <Class StringBuilder>
	//   28   52:dup             
	//   29   53:invokespecial   #200 <Method void StringBuilder()>
	//   30   56:astore_1        
			((StringBuilder) (bundle)).append("Fragment ");
	//   31   57:aload_1         
	//   32   58:ldc2            #748 <String "Fragment ">
	//   33   61:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   34   64:pop             
			((StringBuilder) (bundle)).append(((Object) (this)));
	//   35   65:aload_1         
	//   36   66:aload_0         
	//   37   67:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   38   70:pop             
			((StringBuilder) (bundle)).append(" did not call through to super.onActivityCreated()");
	//   39   71:aload_1         
	//   40   72:ldc2            #750 <String " did not call through to super.onActivityCreated()">
	//   41   75:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
			throw new da(((StringBuilder) (bundle)).toString());
	//   43   79:new             #752 <Class da>
	//   44   82:dup             
	//   45   83:aload_1         
	//   46   84:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   47   87:invokespecial   #753 <Method void da(String)>
	//   48   90:athrow          
		}
	}

	void performConfigurationChanged(Configuration configuration)
	{
		onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #756 <Method void onConfigurationChanged(Configuration)>
		ah ah1 = mChildFragmentManager;
	//    3    5:aload_0         
	//    4    6:getfield        #412 <Field ah mChildFragmentManager>
	//    5    9:astore_2        
		if(ah1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			ah1.a(configuration);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #758 <Method void ah.a(Configuration)>
	//   11   19:return          
	}

	boolean performContextItemSelected(MenuItem menuitem)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean mHidden>
	//*   2    4:ifne            36
		{
			if(onContextItemSelected(menuitem))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #761 <Method boolean onContextItemSelected(MenuItem)>
	//*   6   12:ifeq            17
				return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
			ah ah1 = mChildFragmentManager;
	//    9   17:aload_0         
	//   10   18:getfield        #412 <Field ah mChildFragmentManager>
	//   11   21:astore_2        
			if(ah1 != null && ah1.b(menuitem))
	//*  12   22:aload_2         
	//*  13   23:ifnull          36
	//*  14   26:aload_2         
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #763 <Method boolean ah.b(MenuItem)>
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
		ah ah1 = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #412 <Field ah mChildFragmentManager>
	//    2    4:astore_2        
		if(ah1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			ah1.n();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #672 <Method void ah.n()>
		mState = 1;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #108 <Field int mState>
		mCalled = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #675 <Field boolean mCalled>
		onCreate(bundle);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #766 <Method void onCreate(Bundle)>
		mIsCreated = true;
	//   16   28:aload_0         
	//   17   29:iconst_1        
	//   18   30:putfield        #768 <Field boolean mIsCreated>
		if(mCalled)
	//*  19   33:aload_0         
	//*  20   34:getfield        #675 <Field boolean mCalled>
	//*  21   37:ifeq            51
		{
			mLifecycleRegistry.a(g.ON_CREATE);
	//   22   40:aload_0         
	//   23   41:getfield        #123 <Field k mLifecycleRegistry>
	//   24   44:getstatic       #774 <Field g g.ON_CREATE>
	//   25   47:invokevirtual   #777 <Method void k.a(g)>
			return;
	//   26   50:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   27   51:new             #199 <Class StringBuilder>
	//   28   54:dup             
	//   29   55:invokespecial   #200 <Method void StringBuilder()>
	//   30   58:astore_1        
			((StringBuilder) (bundle)).append("Fragment ");
	//   31   59:aload_1         
	//   32   60:ldc2            #748 <String "Fragment ">
	//   33   63:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
			((StringBuilder) (bundle)).append(((Object) (this)));
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   38   72:pop             
			((StringBuilder) (bundle)).append(" did not call through to super.onCreate()");
	//   39   73:aload_1         
	//   40   74:ldc2            #779 <String " did not call through to super.onCreate()">
	//   41   77:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   42   80:pop             
			throw new da(((StringBuilder) (bundle)).toString());
	//   43   81:new             #752 <Class da>
	//   44   84:dup             
	//   45   85:aload_1         
	//   46   86:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   47   89:invokespecial   #753 <Method void da(String)>
	//   48   92:athrow          
		}
	}

	boolean performCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
		boolean flag1 = mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field boolean mHidden>
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
	//*  12   21:getfield        #323 <Field boolean mHasMenu>
	//*  13   24:ifeq            47
			{
				flag2 = flag3;
	//   14   27:iload           5
	//   15   29:istore          4
				if(mMenuVisible)
	//*  16   31:aload_0         
	//*  17   32:getfield        #114 <Field boolean mMenuVisible>
	//*  18   35:ifeq            47
				{
					onCreateOptionsMenu(menu, menuinflater);
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:aload_2         
	//   22   41:invokevirtual   #783 <Method void onCreateOptionsMenu(Menu, MenuInflater)>
					flag2 = true;
	//   23   44:iconst_1        
	//   24   45:istore          4
				}
			}
			ah ah1 = mChildFragmentManager;
	//   25   47:aload_0         
	//   26   48:getfield        #412 <Field ah mChildFragmentManager>
	//   27   51:astore          6
			flag = flag2;
	//   28   53:iload           4
	//   29   55:istore_3        
			if(ah1 != null)
	//*  30   56:aload           6
	//*  31   58:ifnull          72
				flag = flag2 | ah1.a(menu, menuinflater);
	//   32   61:iload           4
	//   33   63:aload           6
	//   34   65:aload_1         
	//   35   66:aload_2         
	//   36   67:invokevirtual   #785 <Method boolean ah.a(Menu, MenuInflater)>
	//   37   70:ior             
	//   38   71:istore_3        
		}
		return flag;
	//   39   72:iload_3         
	//   40   73:ireturn         
	}

	void performCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		ah ah1 = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #412 <Field ah mChildFragmentManager>
	//    2    4:astore          4
		if(ah1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          16
			ah1.n();
	//    5   11:aload           4
	//    6   13:invokevirtual   #672 <Method void ah.n()>
		mPerformedCreateView = true;
	//    7   16:aload_0         
	//    8   17:iconst_1        
	//    9   18:putfield        #789 <Field boolean mPerformedCreateView>
		mViewLifecycleOwner = ((j) (new android.support.v4.app.s(this)));
	//   10   21:aload_0         
	//   11   22:new             #791 <Class android.support.v4.app.s>
	//   12   25:dup             
	//   13   26:aload_0         
	//   14   27:invokespecial   #792 <Method void android.support.v4.app.s(Fragment)>
	//   15   30:putfield        #608 <Field j mViewLifecycleOwner>
		mViewLifecycleRegistry = null;
	//   16   33:aload_0         
	//   17   34:aconst_null     
	//   18   35:putfield        #794 <Field k mViewLifecycleRegistry>
		mView = onCreateView(layoutinflater, viewgroup, bundle);
	//   19   38:aload_0         
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:aload_3         
	//   24   43:invokevirtual   #796 <Method View onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//   25   46:putfield        #382 <Field View mView>
		if(mView != null)
	//*  26   49:aload_0         
	//*  27   50:getfield        #382 <Field View mView>
	//*  28   53:ifnull          78
		{
			mViewLifecycleOwner.getLifecycle();
	//   29   56:aload_0         
	//   30   57:getfield        #608 <Field j mViewLifecycleOwner>
	//   31   60:invokeinterface #798 <Method android.arch.lifecycle.f j.getLifecycle()>
	//   32   65:pop             
			mViewLifecycleOwnerLiveData.b(((Object) (mViewLifecycleOwner)));
	//   33   66:aload_0         
	//   34   67:getfield        #128 <Field s mViewLifecycleOwnerLiveData>
	//   35   70:aload_0         
	//   36   71:getfield        #608 <Field j mViewLifecycleOwner>
	//   37   74:invokevirtual   #800 <Method void s.b(Object)>
			return;
	//   38   77:return          
		}
		if(mViewLifecycleRegistry == null)
	//*  39   78:aload_0         
	//*  40   79:getfield        #794 <Field k mViewLifecycleRegistry>
	//*  41   82:ifnonnull       91
		{
			mViewLifecycleOwner = null;
	//   42   85:aload_0         
	//   43   86:aconst_null     
	//   44   87:putfield        #608 <Field j mViewLifecycleOwner>
			return;
	//   45   90:return          
		} else
		{
			throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
	//   46   91:new             #532 <Class IllegalStateException>
	//   47   94:dup             
	//   48   95:ldc2            #802 <String "Called getViewLifecycleOwner() but onCreateView() returned null">
	//   49   98:invokespecial   #536 <Method void IllegalStateException(String)>
	//   50  101:athrow          
		}
	}

	void performDestroy()
	{
		mLifecycleRegistry.a(g.ON_DESTROY);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field k mLifecycleRegistry>
	//    2    4:getstatic       #806 <Field g g.ON_DESTROY>
	//    3    7:invokevirtual   #777 <Method void k.a(g)>
		ah ah1 = mChildFragmentManager;
	//    4   10:aload_0         
	//    5   11:getfield        #412 <Field ah mChildFragmentManager>
	//    6   14:astore_1        
		if(ah1 != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          23
			ah1.v();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #809 <Method void ah.v()>
		mState = 0;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #108 <Field int mState>
		mCalled = false;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #675 <Field boolean mCalled>
		mIsCreated = false;
	//   17   33:aload_0         
	//   18   34:iconst_0        
	//   19   35:putfield        #768 <Field boolean mIsCreated>
		onDestroy();
	//   20   38:aload_0         
	//   21   39:invokevirtual   #811 <Method void onDestroy()>
		if(mCalled)
	//*  22   42:aload_0         
	//*  23   43:getfield        #675 <Field boolean mCalled>
	//*  24   46:ifeq            55
		{
			mChildFragmentManager = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #412 <Field ah mChildFragmentManager>
			return;
	//   28   54:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   29   55:new             #199 <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #200 <Method void StringBuilder()>
	//   32   62:astore_1        
			stringbuilder.append("Fragment ");
	//   33   63:aload_1         
	//   34   64:ldc2            #748 <String "Fragment ">
	//   35   67:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
			stringbuilder.append(((Object) (this)));
	//   37   71:aload_1         
	//   38   72:aload_0         
	//   39   73:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   40   76:pop             
			stringbuilder.append(" did not call through to super.onDestroy()");
	//   41   77:aload_1         
	//   42   78:ldc2            #813 <String " did not call through to super.onDestroy()">
	//   43   81:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
			throw new da(stringbuilder.toString());
	//   45   85:new             #752 <Class da>
	//   46   88:dup             
	//   47   89:aload_1         
	//   48   90:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   49   93:invokespecial   #753 <Method void da(String)>
	//   50   96:athrow          
		}
	}

	void performDestroyView()
	{
		if(mView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #382 <Field View mView>
	//*   2    4:ifnull          17
			mViewLifecycleRegistry.a(g.ON_DESTROY);
	//    3    7:aload_0         
	//    4    8:getfield        #794 <Field k mViewLifecycleRegistry>
	//    5   11:getstatic       #806 <Field g g.ON_DESTROY>
	//    6   14:invokevirtual   #777 <Method void k.a(g)>
		ah ah1 = mChildFragmentManager;
	//    7   17:aload_0         
	//    8   18:getfield        #412 <Field ah mChildFragmentManager>
	//    9   21:astore_1        
		if(ah1 != null)
	//*  10   22:aload_1         
	//*  11   23:ifnull          30
			ah1.u();
	//   12   26:aload_1         
	//   13   27:invokevirtual   #817 <Method void ah.u()>
		mState = 1;
	//   14   30:aload_0         
	//   15   31:iconst_1        
	//   16   32:putfield        #108 <Field int mState>
		mCalled = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #675 <Field boolean mCalled>
		onDestroyView();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #819 <Method void onDestroyView()>
		if(mCalled)
	//*  22   44:aload_0         
	//*  23   45:getfield        #675 <Field boolean mCalled>
	//*  24   48:ifeq            64
		{
			ca.a(((j) (this))).a();
	//   25   51:aload_0         
	//   26   52:invokestatic    #408 <Method ca ca.a(j)>
	//   27   55:invokevirtual   #820 <Method void ca.a()>
			mPerformedCreateView = false;
	//   28   58:aload_0         
	//   29   59:iconst_0        
	//   30   60:putfield        #789 <Field boolean mPerformedCreateView>
			return;
	//   31   63:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   32   64:new             #199 <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #200 <Method void StringBuilder()>
	//   35   71:astore_1        
			stringbuilder.append("Fragment ");
	//   36   72:aload_1         
	//   37   73:ldc2            #748 <String "Fragment ">
	//   38   76:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
			stringbuilder.append(((Object) (this)));
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   43   85:pop             
			stringbuilder.append(" did not call through to super.onDestroyView()");
	//   44   86:aload_1         
	//   45   87:ldc2            #822 <String " did not call through to super.onDestroyView()">
	//   46   90:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
			throw new da(stringbuilder.toString());
	//   48   94:new             #752 <Class da>
	//   49   97:dup             
	//   50   98:aload_1         
	//   51   99:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   52  102:invokespecial   #753 <Method void da(String)>
	//   53  105:athrow          
		}
	}

	void performDetach()
	{
		mCalled = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #675 <Field boolean mCalled>
		onDetach();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #825 <Method void onDetach()>
		mLayoutInflater = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #512 <Field LayoutInflater mLayoutInflater>
		if(mCalled)
	//*   8   14:aload_0         
	//*   9   15:getfield        #675 <Field boolean mCalled>
	//*  10   18:ifeq            98
		{
			ah ah1 = mChildFragmentManager;
	//   11   21:aload_0         
	//   12   22:getfield        #412 <Field ah mChildFragmentManager>
	//   13   25:astore_1        
			if(ah1 != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          97
			{
				if(mRetaining)
	//*  16   30:aload_0         
	//*  17   31:getfield        #331 <Field boolean mRetaining>
	//*  18   34:ifeq            47
				{
					ah1.v();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #809 <Method void ah.v()>
					mChildFragmentManager = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #412 <Field ah mChildFragmentManager>
					return;
	//   24   46:return          
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   25   47:new             #199 <Class StringBuilder>
	//   26   50:dup             
	//   27   51:invokespecial   #200 <Method void StringBuilder()>
	//   28   54:astore_1        
					stringbuilder.append("Child FragmentManager of ");
	//   29   55:aload_1         
	//   30   56:ldc2            #827 <String "Child FragmentManager of ">
	//   31   59:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   32   62:pop             
					stringbuilder.append(((Object) (this)));
	//   33   63:aload_1         
	//   34   64:aload_0         
	//   35   65:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   36   68:pop             
					stringbuilder.append(" was not ");
	//   37   69:aload_1         
	//   38   70:ldc2            #829 <String " was not ">
	//   39   73:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   40   76:pop             
					stringbuilder.append(" destroyed and this fragment is not retaining instance");
	//   41   77:aload_1         
	//   42   78:ldc2            #831 <String " destroyed and this fragment is not retaining instance">
	//   43   81:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
					throw new IllegalStateException(stringbuilder.toString());
	//   45   85:new             #532 <Class IllegalStateException>
	//   46   88:dup             
	//   47   89:aload_1         
	//   48   90:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   49   93:invokespecial   #536 <Method void IllegalStateException(String)>
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
	//   52   98:new             #199 <Class StringBuilder>
	//   53  101:dup             
	//   54  102:invokespecial   #200 <Method void StringBuilder()>
	//   55  105:astore_1        
			stringbuilder1.append("Fragment ");
	//   56  106:aload_1         
	//   57  107:ldc2            #748 <String "Fragment ">
	//   58  110:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   59  113:pop             
			stringbuilder1.append(((Object) (this)));
	//   60  114:aload_1         
	//   61  115:aload_0         
	//   62  116:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   63  119:pop             
			stringbuilder1.append(" did not call through to super.onDetach()");
	//   64  120:aload_1         
	//   65  121:ldc2            #833 <String " did not call through to super.onDetach()">
	//   66  124:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   67  127:pop             
			throw new da(stringbuilder1.toString());
	//   68  128:new             #752 <Class da>
	//   69  131:dup             
	//   70  132:aload_1         
	//   71  133:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   72  136:invokespecial   #753 <Method void da(String)>
	//   73  139:athrow          
		}
	}

	LayoutInflater performGetLayoutInflater(Bundle bundle)
	{
		mLayoutInflater = onGetLayoutInflater(bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #835 <Method LayoutInflater onGetLayoutInflater(Bundle)>
	//    4    6:putfield        #512 <Field LayoutInflater mLayoutInflater>
		return mLayoutInflater;
	//    5    9:aload_0         
	//    6   10:getfield        #512 <Field LayoutInflater mLayoutInflater>
	//    7   13:areturn         
	}

	void performLowMemory()
	{
		onLowMemory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #838 <Method void onLowMemory()>
		ah ah1 = mChildFragmentManager;
	//    2    4:aload_0         
	//    3    5:getfield        #412 <Field ah mChildFragmentManager>
	//    4    8:astore_1        
		if(ah1 != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			ah1.w();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #841 <Method void android.support.v4.app.ah.w()>
	//    9   17:return          
	}

	void performMultiWindowModeChanged(boolean flag)
	{
		onMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #844 <Method void onMultiWindowModeChanged(boolean)>
		ah ah1 = mChildFragmentManager;
	//    3    5:aload_0         
	//    4    6:getfield        #412 <Field ah mChildFragmentManager>
	//    5    9:astore_2        
		if(ah1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			ah1.a(flag);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #846 <Method void ah.a(boolean)>
	//   11   19:return          
	}

	boolean performOptionsItemSelected(MenuItem menuitem)
	{
		if(!mHidden)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean mHidden>
	//*   2    4:ifne            50
		{
			if(mHasMenu && mMenuVisible && onOptionsItemSelected(menuitem))
	//*   3    7:aload_0         
	//*   4    8:getfield        #323 <Field boolean mHasMenu>
	//*   5   11:ifeq            31
	//*   6   14:aload_0         
	//*   7   15:getfield        #114 <Field boolean mMenuVisible>
	//*   8   18:ifeq            31
	//*   9   21:aload_0         
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #849 <Method boolean onOptionsItemSelected(MenuItem)>
	//*  12   26:ifeq            31
				return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
			ah ah1 = mChildFragmentManager;
	//   15   31:aload_0         
	//   16   32:getfield        #412 <Field ah mChildFragmentManager>
	//   17   35:astore_2        
			if(ah1 != null && ah1.a(menuitem))
	//*  18   36:aload_2         
	//*  19   37:ifnull          50
	//*  20   40:aload_2         
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #851 <Method boolean ah.a(MenuItem)>
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
	//*   1    1:getfield        #313 <Field boolean mHidden>
	//*   2    4:ifne            40
		{
			if(mHasMenu && mMenuVisible)
	//*   3    7:aload_0         
	//*   4    8:getfield        #323 <Field boolean mHasMenu>
	//*   5   11:ifeq            26
	//*   6   14:aload_0         
	//*   7   15:getfield        #114 <Field boolean mMenuVisible>
	//*   8   18:ifeq            26
				onOptionsMenuClosed(menu);
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:invokevirtual   #854 <Method void onOptionsMenuClosed(Menu)>
			ah ah1 = mChildFragmentManager;
	//   12   26:aload_0         
	//   13   27:getfield        #412 <Field ah mChildFragmentManager>
	//   14   30:astore_2        
			if(ah1 != null)
	//*  15   31:aload_2         
	//*  16   32:ifnull          40
				ah1.b(menu);
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #856 <Method void ah.b(Menu)>
		}
	//   20   40:return          
	}

	void performPause()
	{
		if(mView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #382 <Field View mView>
	//*   2    4:ifnull          17
			mViewLifecycleRegistry.a(g.ON_PAUSE);
	//    3    7:aload_0         
	//    4    8:getfield        #794 <Field k mViewLifecycleRegistry>
	//    5   11:getstatic       #860 <Field g g.ON_PAUSE>
	//    6   14:invokevirtual   #777 <Method void k.a(g)>
		mLifecycleRegistry.a(g.ON_PAUSE);
	//    7   17:aload_0         
	//    8   18:getfield        #123 <Field k mLifecycleRegistry>
	//    9   21:getstatic       #860 <Field g g.ON_PAUSE>
	//   10   24:invokevirtual   #777 <Method void k.a(g)>
		ah ah1 = mChildFragmentManager;
	//   11   27:aload_0         
	//   12   28:getfield        #412 <Field ah mChildFragmentManager>
	//   13   31:astore_1        
		if(ah1 != null)
	//*  14   32:aload_1         
	//*  15   33:ifnull          40
			ah1.s();
	//   16   36:aload_1         
	//   17   37:invokevirtual   #862 <Method void android.support.v4.app.ah.s()>
		mState = 3;
	//   18   40:aload_0         
	//   19   41:iconst_3        
	//   20   42:putfield        #108 <Field int mState>
		mCalled = false;
	//   21   45:aload_0         
	//   22   46:iconst_0        
	//   23   47:putfield        #675 <Field boolean mCalled>
		onPause();
	//   24   50:aload_0         
	//   25   51:invokevirtual   #864 <Method void onPause()>
		if(mCalled)
	//*  26   54:aload_0         
	//*  27   55:getfield        #675 <Field boolean mCalled>
	//*  28   58:ifeq            62
		{
			return;
	//   29   61:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   62:new             #199 <Class StringBuilder>
	//   31   65:dup             
	//   32   66:invokespecial   #200 <Method void StringBuilder()>
	//   33   69:astore_1        
			stringbuilder.append("Fragment ");
	//   34   70:aload_1         
	//   35   71:ldc2            #748 <String "Fragment ">
	//   36   74:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			stringbuilder.append(((Object) (this)));
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   41   83:pop             
			stringbuilder.append(" did not call through to super.onPause()");
	//   42   84:aload_1         
	//   43   85:ldc2            #866 <String " did not call through to super.onPause()">
	//   44   88:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   45   91:pop             
			throw new da(stringbuilder.toString());
	//   46   92:new             #752 <Class da>
	//   47   95:dup             
	//   48   96:aload_1         
	//   49   97:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   50  100:invokespecial   #753 <Method void da(String)>
	//   51  103:athrow          
		}
	}

	void performPictureInPictureModeChanged(boolean flag)
	{
		onPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #869 <Method void onPictureInPictureModeChanged(boolean)>
		ah ah1 = mChildFragmentManager;
	//    3    5:aload_0         
	//    4    6:getfield        #412 <Field ah mChildFragmentManager>
	//    5    9:astore_2        
		if(ah1 != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			ah1.b(flag);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #871 <Method void ah.b(boolean)>
	//   11   19:return          
	}

	boolean performPrepareOptionsMenu(Menu menu)
	{
		boolean flag1 = mHidden;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field boolean mHidden>
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
	//*  12   18:getfield        #323 <Field boolean mHasMenu>
	//*  13   21:ifeq            41
			{
				flag2 = flag3;
	//   14   24:iload           4
	//   15   26:istore_3        
				if(mMenuVisible)
	//*  16   27:aload_0         
	//*  17   28:getfield        #114 <Field boolean mMenuVisible>
	//*  18   31:ifeq            41
				{
					onPrepareOptionsMenu(menu);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:invokevirtual   #875 <Method void onPrepareOptionsMenu(Menu)>
					flag2 = true;
	//   22   39:iconst_1        
	//   23   40:istore_3        
				}
			}
			ah ah1 = mChildFragmentManager;
	//   24   41:aload_0         
	//   25   42:getfield        #412 <Field ah mChildFragmentManager>
	//   26   45:astore          5
			flag = flag2;
	//   27   47:iload_3         
	//   28   48:istore_2        
			if(ah1 != null)
	//*  29   49:aload           5
	//*  30   51:ifnull          63
				flag = flag2 | ah1.a(menu);
	//   31   54:iload_3         
	//   32   55:aload           5
	//   33   57:aload_1         
	//   34   58:invokevirtual   #877 <Method boolean ah.a(Menu)>
	//   35   61:ior             
	//   36   62:istore_2        
		}
		return flag;
	//   37   63:iload_2         
	//   38   64:ireturn         
	}

	void performResume()
	{
		ah ah1 = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #412 <Field ah mChildFragmentManager>
	//    2    4:astore_1        
		if(ah1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
		{
			ah1.n();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #672 <Method void ah.n()>
			mChildFragmentManager.h();
	//    7   13:aload_0         
	//    8   14:getfield        #412 <Field ah mChildFragmentManager>
	//    9   17:invokevirtual   #880 <Method boolean ah.h()>
	//   10   20:pop             
		}
		mState = 4;
	//   11   21:aload_0         
	//   12   22:iconst_4        
	//   13   23:putfield        #108 <Field int mState>
		mCalled = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #675 <Field boolean mCalled>
		onResume();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #882 <Method void onResume()>
		if(mCalled)
	//*  19   35:aload_0         
	//*  20   36:getfield        #675 <Field boolean mCalled>
	//*  21   39:ifeq            91
		{
			ah ah2 = mChildFragmentManager;
	//   22   42:aload_0         
	//   23   43:getfield        #412 <Field ah mChildFragmentManager>
	//   24   46:astore_1        
			if(ah2 != null)
	//*  25   47:aload_1         
	//*  26   48:ifnull          63
			{
				ah2.r();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #476 <Method void ah.r()>
				mChildFragmentManager.h();
	//   29   55:aload_0         
	//   30   56:getfield        #412 <Field ah mChildFragmentManager>
	//   31   59:invokevirtual   #880 <Method boolean ah.h()>
	//   32   62:pop             
			}
			mLifecycleRegistry.a(g.ON_RESUME);
	//   33   63:aload_0         
	//   34   64:getfield        #123 <Field k mLifecycleRegistry>
	//   35   67:getstatic       #885 <Field g g.ON_RESUME>
	//   36   70:invokevirtual   #777 <Method void k.a(g)>
			if(mView != null)
	//*  37   73:aload_0         
	//*  38   74:getfield        #382 <Field View mView>
	//*  39   77:ifnull          90
				mViewLifecycleRegistry.a(g.ON_RESUME);
	//   40   80:aload_0         
	//   41   81:getfield        #794 <Field k mViewLifecycleRegistry>
	//   42   84:getstatic       #885 <Field g g.ON_RESUME>
	//   43   87:invokevirtual   #777 <Method void k.a(g)>
			return;
	//   44   90:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   45   91:new             #199 <Class StringBuilder>
	//   46   94:dup             
	//   47   95:invokespecial   #200 <Method void StringBuilder()>
	//   48   98:astore_1        
			stringbuilder.append("Fragment ");
	//   49   99:aload_1         
	//   50  100:ldc2            #748 <String "Fragment ">
	//   51  103:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   52  106:pop             
			stringbuilder.append(((Object) (this)));
	//   53  107:aload_1         
	//   54  108:aload_0         
	//   55  109:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   56  112:pop             
			stringbuilder.append(" did not call through to super.onResume()");
	//   57  113:aload_1         
	//   58  114:ldc2            #887 <String " did not call through to super.onResume()">
	//   59  117:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   60  120:pop             
			throw new da(stringbuilder.toString());
	//   61  121:new             #752 <Class da>
	//   62  124:dup             
	//   63  125:aload_1         
	//   64  126:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   65  129:invokespecial   #753 <Method void da(String)>
	//   66  132:athrow          
		}
	}

	void performSaveInstanceState(Bundle bundle)
	{
		onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #890 <Method void onSaveInstanceState(Bundle)>
		Object obj = ((Object) (mChildFragmentManager));
	//    3    5:aload_0         
	//    4    6:getfield        #412 <Field ah mChildFragmentManager>
	//    5    9:astore_2        
		if(obj != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          31
		{
			obj = ((Object) (((ah) (obj)).m()));
	//    8   14:aload_2         
	//    9   15:invokevirtual   #893 <Method android.os.Parcelable ah.m()>
	//   10   18:astore_2        
			if(obj != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          31
				bundle.putParcelable("android:support:fragments", ((android.os.Parcelable) (obj)));
	//   13   23:aload_1         
	//   14   24:ldc2            #895 <String "android:support:fragments">
	//   15   27:aload_2         
	//   16   28:invokevirtual   #899 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		}
	//   17   31:return          
	}

	void performStart()
	{
		ah ah1 = mChildFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #412 <Field ah mChildFragmentManager>
	//    2    4:astore_1        
		if(ah1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
		{
			ah1.n();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #672 <Method void ah.n()>
			mChildFragmentManager.h();
	//    7   13:aload_0         
	//    8   14:getfield        #412 <Field ah mChildFragmentManager>
	//    9   17:invokevirtual   #880 <Method boolean ah.h()>
	//   10   20:pop             
		}
		mState = 3;
	//   11   21:aload_0         
	//   12   22:iconst_3        
	//   13   23:putfield        #108 <Field int mState>
		mCalled = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #675 <Field boolean mCalled>
		onStart();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #902 <Method void onStart()>
		if(mCalled)
	//*  19   35:aload_0         
	//*  20   36:getfield        #675 <Field boolean mCalled>
	//*  21   39:ifeq            83
		{
			ah ah2 = mChildFragmentManager;
	//   22   42:aload_0         
	//   23   43:getfield        #412 <Field ah mChildFragmentManager>
	//   24   46:astore_1        
			if(ah2 != null)
	//*  25   47:aload_1         
	//*  26   48:ifnull          55
				ah2.q();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #478 <Method void ah.q()>
			mLifecycleRegistry.a(g.ON_START);
	//   29   55:aload_0         
	//   30   56:getfield        #123 <Field k mLifecycleRegistry>
	//   31   59:getstatic       #905 <Field g g.ON_START>
	//   32   62:invokevirtual   #777 <Method void k.a(g)>
			if(mView != null)
	//*  33   65:aload_0         
	//*  34   66:getfield        #382 <Field View mView>
	//*  35   69:ifnull          82
				mViewLifecycleRegistry.a(g.ON_START);
	//   36   72:aload_0         
	//   37   73:getfield        #794 <Field k mViewLifecycleRegistry>
	//   38   76:getstatic       #905 <Field g g.ON_START>
	//   39   79:invokevirtual   #777 <Method void k.a(g)>
			return;
	//   40   82:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   41   83:new             #199 <Class StringBuilder>
	//   42   86:dup             
	//   43   87:invokespecial   #200 <Method void StringBuilder()>
	//   44   90:astore_1        
			stringbuilder.append("Fragment ");
	//   45   91:aload_1         
	//   46   92:ldc2            #748 <String "Fragment ">
	//   47   95:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   48   98:pop             
			stringbuilder.append(((Object) (this)));
	//   49   99:aload_1         
	//   50  100:aload_0         
	//   51  101:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   52  104:pop             
			stringbuilder.append(" did not call through to super.onStart()");
	//   53  105:aload_1         
	//   54  106:ldc2            #907 <String " did not call through to super.onStart()">
	//   55  109:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   56  112:pop             
			throw new da(stringbuilder.toString());
	//   57  113:new             #752 <Class da>
	//   58  116:dup             
	//   59  117:aload_1         
	//   60  118:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   61  121:invokespecial   #753 <Method void da(String)>
	//   62  124:athrow          
		}
	}

	void performStop()
	{
		if(mView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #382 <Field View mView>
	//*   2    4:ifnull          17
			mViewLifecycleRegistry.a(g.ON_STOP);
	//    3    7:aload_0         
	//    4    8:getfield        #794 <Field k mViewLifecycleRegistry>
	//    5   11:getstatic       #911 <Field g g.ON_STOP>
	//    6   14:invokevirtual   #777 <Method void k.a(g)>
		mLifecycleRegistry.a(g.ON_STOP);
	//    7   17:aload_0         
	//    8   18:getfield        #123 <Field k mLifecycleRegistry>
	//    9   21:getstatic       #911 <Field g g.ON_STOP>
	//   10   24:invokevirtual   #777 <Method void k.a(g)>
		ah ah1 = mChildFragmentManager;
	//   11   27:aload_0         
	//   12   28:getfield        #412 <Field ah mChildFragmentManager>
	//   13   31:astore_1        
		if(ah1 != null)
	//*  14   32:aload_1         
	//*  15   33:ifnull          40
			ah1.t();
	//   16   36:aload_1         
	//   17   37:invokevirtual   #914 <Method void ah.t()>
		mState = 2;
	//   18   40:aload_0         
	//   19   41:iconst_2        
	//   20   42:putfield        #108 <Field int mState>
		mCalled = false;
	//   21   45:aload_0         
	//   22   46:iconst_0        
	//   23   47:putfield        #675 <Field boolean mCalled>
		onStop();
	//   24   50:aload_0         
	//   25   51:invokevirtual   #916 <Method void onStop()>
		if(mCalled)
	//*  26   54:aload_0         
	//*  27   55:getfield        #675 <Field boolean mCalled>
	//*  28   58:ifeq            62
		{
			return;
	//   29   61:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   62:new             #199 <Class StringBuilder>
	//   31   65:dup             
	//   32   66:invokespecial   #200 <Method void StringBuilder()>
	//   33   69:astore_1        
			stringbuilder.append("Fragment ");
	//   34   70:aload_1         
	//   35   71:ldc2            #748 <String "Fragment ">
	//   36   74:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   37   77:pop             
			stringbuilder.append(((Object) (this)));
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   41   83:pop             
			stringbuilder.append(" did not call through to super.onStop()");
	//   42   84:aload_1         
	//   43   85:ldc2            #918 <String " did not call through to super.onStop()">
	//   44   88:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   45   91:pop             
			throw new da(stringbuilder.toString());
	//   46   92:new             #752 <Class da>
	//   47   95:dup             
	//   48   96:aload_1         
	//   49   97:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   50  100:invokespecial   #753 <Method void da(String)>
	//   51  103:athrow          
		}
	}

	public void postponeEnterTransition()
	{
		ensureAnimationInfo().q = true;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:iconst_1        
	//    3    5:putfield        #233 <Field boolean t.q>
	//    4    8:return          
	}

	public void registerForContextMenu(View view)
	{
		view.setOnCreateContextMenuListener(((android.view.View.OnCreateContextMenuListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #927 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
	//    3    5:return          
	}

	public final void requestPermissions(String as[], int i)
	{
		ad ad1 = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field ad mHost>
	//    2    4:astore_3        
		if(ad1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
		{
			ad1.a(this, as, i);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #932 <Method void ad.a(Fragment, String[], int)>
			return;
	//   10   16:return          
		} else
		{
			as = ((String []) (new StringBuilder()));
	//   11   17:new             #199 <Class StringBuilder>
	//   12   20:dup             
	//   13   21:invokespecial   #200 <Method void StringBuilder()>
	//   14   24:astore_1        
			((StringBuilder) (as)).append("Fragment ");
	//   15   25:aload_1         
	//   16   26:ldc2            #748 <String "Fragment ">
	//   17   29:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
			((StringBuilder) (as)).append(((Object) (this)));
	//   19   33:aload_1         
	//   20   34:aload_0         
	//   21   35:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   22   38:pop             
			((StringBuilder) (as)).append(" not attached to Activity");
	//   23   39:aload_1         
	//   24   40:ldc2            #934 <String " not attached to Activity">
	//   25   43:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   26   46:pop             
			throw new IllegalStateException(((StringBuilder) (as)).toString());
	//   27   47:new             #532 <Class IllegalStateException>
	//   28   50:dup             
	//   29   51:aload_1         
	//   30   52:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   31   55:invokespecial   #536 <Method void IllegalStateException(String)>
	//   32   58:athrow          
		}
	}

	public final x requireActivity()
	{
		x x1 = getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #702 <Method x getActivity()>
	//    2    4:astore_1        
		if(x1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return x1;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #199 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #200 <Method void StringBuilder()>
	//   10   18:astore_1        
			stringbuilder.append("Fragment ");
	//   11   19:aload_1         
	//   12   20:ldc2            #748 <String "Fragment ">
	//   13   23:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			stringbuilder.append(((Object) (this)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   18   32:pop             
			stringbuilder.append(" not attached to an activity.");
	//   19   33:aload_1         
	//   20   34:ldc2            #937 <String " not attached to an activity.">
	//   21   37:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   23   41:new             #532 <Class IllegalStateException>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #536 <Method void IllegalStateException(String)>
	//   28   52:athrow          
		}
	}

	public final Context requireContext()
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #403 <Method Context getContext()>
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
	//    7   11:new             #199 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #200 <Method void StringBuilder()>
	//   10   18:astore_1        
			stringbuilder.append("Fragment ");
	//   11   19:aload_1         
	//   12   20:ldc2            #748 <String "Fragment ">
	//   13   23:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			stringbuilder.append(((Object) (this)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   18   32:pop             
			stringbuilder.append(" not attached to a context.");
	//   19   33:aload_1         
	//   20   34:ldc2            #939 <String " not attached to a context.">
	//   21   37:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   23   41:new             #532 <Class IllegalStateException>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #536 <Method void IllegalStateException(String)>
	//   28   52:athrow          
		}
	}

	public final ae requireFragmentManager()
	{
		ae ae = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #942 <Method ae getFragmentManager()>
	//    2    4:astore_1        
		if(ae != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return ae;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #199 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #200 <Method void StringBuilder()>
	//   10   18:astore_1        
			stringbuilder.append("Fragment ");
	//   11   19:aload_1         
	//   12   20:ldc2            #748 <String "Fragment ">
	//   13   23:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			stringbuilder.append(((Object) (this)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   18   32:pop             
			stringbuilder.append(" not associated with a fragment manager.");
	//   19   33:aload_1         
	//   20   34:ldc2            #944 <String " not associated with a fragment manager.">
	//   21   37:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   23   41:new             #532 <Class IllegalStateException>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #536 <Method void IllegalStateException(String)>
	//   28   52:athrow          
		}
	}

	public final Object requireHost()
	{
		Object obj = getHost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #947 <Method Object getHost()>
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
	//    7   11:new             #199 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #200 <Method void StringBuilder()>
	//   10   18:astore_1        
			stringbuilder.append("Fragment ");
	//   11   19:aload_1         
	//   12   20:ldc2            #748 <String "Fragment ">
	//   13   23:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
			stringbuilder.append(((Object) (this)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   18   32:pop             
			stringbuilder.append(" not attached to a host.");
	//   19   33:aload_1         
	//   20   34:ldc2            #949 <String " not attached to a host.">
	//   21   37:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   23   41:new             #532 <Class IllegalStateException>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   27   49:invokespecial   #536 <Method void IllegalStateException(String)>
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
	//    3    5:ldc2            #895 <String "android:support:fragments">
	//    4    8:invokevirtual   #953 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//    5   11:astore_1        
			if(bundle != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          51
			{
				if(mChildFragmentManager == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #412 <Field ah mChildFragmentManager>
	//*  10   20:ifnonnull       27
					instantiateChildFragmentManager();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #474 <Method void instantiateChildFragmentManager()>
				mChildFragmentManager.a(((android.os.Parcelable) (bundle)), mChildNonConfig);
	//   13   27:aload_0         
	//   14   28:getfield        #412 <Field ah mChildFragmentManager>
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #955 <Field ay mChildNonConfig>
	//   18   36:invokevirtual   #958 <Method void ah.a(android.os.Parcelable, ay)>
				mChildNonConfig = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #955 <Field ay mChildNonConfig>
				mChildFragmentManager.o();
	//   22   44:aload_0         
	//   23   45:getfield        #412 <Field ah mChildFragmentManager>
	//   24   48:invokevirtual   #484 <Method void android.support.v4.app.ah.o()>
			}
		}
	//   25   51:return          
	}

	final void restoreViewState(Bundle bundle)
	{
		SparseArray sparsearray = mSavedViewState;
	//    0    0:aload_0         
	//    1    1:getfield        #358 <Field SparseArray mSavedViewState>
	//    2    4:astore_2        
		if(sparsearray != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
		{
			mInnerView.restoreHierarchyState(sparsearray);
	//    5    9:aload_0         
	//    6   10:getfield        #386 <Field View mInnerView>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #963 <Method void View.restoreHierarchyState(SparseArray)>
			mSavedViewState = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #358 <Field SparseArray mSavedViewState>
		}
		mCalled = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #675 <Field boolean mCalled>
		onViewStateRestored(bundle);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #965 <Method void onViewStateRestored(Bundle)>
		if(mCalled)
	//*  18   32:aload_0         
	//*  19   33:getfield        #675 <Field boolean mCalled>
	//*  20   36:ifeq            57
		{
			if(mView != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #382 <Field View mView>
	//*  23   43:ifnull          56
				mViewLifecycleRegistry.a(g.ON_CREATE);
	//   24   46:aload_0         
	//   25   47:getfield        #794 <Field k mViewLifecycleRegistry>
	//   26   50:getstatic       #774 <Field g g.ON_CREATE>
	//   27   53:invokevirtual   #777 <Method void k.a(g)>
			return;
	//   28   56:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   29   57:new             #199 <Class StringBuilder>
	//   30   60:dup             
	//   31   61:invokespecial   #200 <Method void StringBuilder()>
	//   32   64:astore_1        
			((StringBuilder) (bundle)).append("Fragment ");
	//   33   65:aload_1         
	//   34   66:ldc2            #748 <String "Fragment ">
	//   35   69:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   36   72:pop             
			((StringBuilder) (bundle)).append(((Object) (this)));
	//   37   73:aload_1         
	//   38   74:aload_0         
	//   39   75:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   40   78:pop             
			((StringBuilder) (bundle)).append(" did not call through to super.onViewStateRestored()");
	//   41   79:aload_1         
	//   42   80:ldc2            #967 <String " did not call through to super.onViewStateRestored()">
	//   43   83:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   44   86:pop             
			throw new da(((StringBuilder) (bundle)).toString());
	//   45   87:new             #752 <Class da>
	//   46   90:dup             
	//   47   91:aload_1         
	//   48   92:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   49   95:invokespecial   #753 <Method void da(String)>
	//   50   98:athrow          
		}
	}

	public void setAllowEnterTransitionOverlap(boolean flag)
	{
		ensureAnimationInfo().n = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #972 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:putfield        #451 <Field Boolean t.n>
	//    5   11:return          
	}

	public void setAllowReturnTransitionOverlap(boolean flag)
	{
		ensureAnimationInfo().m = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #972 <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:putfield        #460 <Field Boolean t.m>
	//    5   11:return          
	}

	void setAnimatingAway(View view)
	{
		ensureAnimationInfo().a = view;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #462 <Field View t.a>
	//    4    8:return          
	}

	void setAnimator(Animator animator)
	{
		ensureAnimationInfo().b = animator;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #467 <Field Animator t.b>
	//    4    8:return          
	}

	public void setArguments(Bundle bundle)
	{
		if(mIndex >= 0 && isStateSaved())
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field int mIndex>
	//*   2    4:iflt            28
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #978 <Method boolean isStateSaved()>
	//*   5   11:ifne            17
	//*   6   14:goto            28
		{
			throw new IllegalStateException("Fragment already active and state has been saved");
	//    7   17:new             #532 <Class IllegalStateException>
	//    8   20:dup             
	//    9   21:ldc2            #980 <String "Fragment already active and state has been saved">
	//   10   24:invokespecial   #536 <Method void IllegalStateException(String)>
	//   11   27:athrow          
		} else
		{
			mArguments = bundle;
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:putfield        #350 <Field Bundle mArguments>
			return;
	//   15   33:return          
		}
	}

	public void setEnterSharedElementCallback(cy cy)
	{
		ensureAnimationInfo().o = cy;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #497 <Field cy android.support.v4.app.t.o>
	//    4    8:return          
	}

	public void setEnterTransition(Object obj)
	{
		ensureAnimationInfo().g = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #492 <Field Object android.support.v4.app.t.g>
	//    4    8:return          
	}

	public void setExitSharedElementCallback(cy cy)
	{
		ensureAnimationInfo().p = cy;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #503 <Field cy t.p>
	//    4    8:return          
	}

	public void setExitTransition(Object obj)
	{
		ensureAnimationInfo().i = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #500 <Field Object t.i>
	//    4    8:return          
	}

	public void setHasOptionsMenu(boolean flag)
	{
		if(mHasMenu != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #323 <Field boolean mHasMenu>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          34
		{
			mHasMenu = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #323 <Field boolean mHasMenu>
			if(isAdded() && !isHidden())
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #658 <Method boolean isAdded()>
	//*   9   17:ifeq            34
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #660 <Method boolean isHidden()>
	//*  12   24:ifne            34
				mHost.d();
	//   13   27:aload_0         
	//   14   28:getfield        #342 <Field ad mHost>
	//   15   31:invokevirtual   #988 <Method void ad.d()>
		}
	//   16   34:return          
	}

	void setHideReplaced(boolean flag)
	{
		ensureAnimationInfo().s = flag;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:putfield        #646 <Field boolean android.support.v4.app.t.s>
	//    4    8:return          
	}

	final void setIndex(int i, Fragment fragment)
	{
		mIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #110 <Field int mIndex>
		if(fragment != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          52
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #199 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #200 <Method void StringBuilder()>
	//    8   16:astore_3        
			stringbuilder.append(fragment.mWho);
	//    9   17:aload_3         
	//   10   18:aload_2         
	//   11   19:getfield        #282 <Field String mWho>
	//   12   22:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			stringbuilder.append(":");
	//   14   26:aload_3         
	//   15   27:ldc2            #419 <String ":">
	//   16   30:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(mIndex);
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #110 <Field int mIndex>
	//   21   39:invokevirtual   #994 <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
			mWho = stringbuilder.toString();
	//   23   43:aload_0         
	//   24   44:aload_3         
	//   25   45:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   26   48:putfield        #282 <Field String mWho>
			return;
	//   27   51:return          
		} else
		{
			fragment = ((Fragment) (new StringBuilder()));
	//   28   52:new             #199 <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #200 <Method void StringBuilder()>
	//   31   59:astore_2        
			((StringBuilder) (fragment)).append("android:fragment:");
	//   32   60:aload_2         
	//   33   61:ldc2            #996 <String "android:fragment:">
	//   34   64:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
			((StringBuilder) (fragment)).append(mIndex);
	//   36   68:aload_2         
	//   37   69:aload_0         
	//   38   70:getfield        #110 <Field int mIndex>
	//   39   73:invokevirtual   #994 <Method StringBuilder StringBuilder.append(int)>
	//   40   76:pop             
			mWho = ((StringBuilder) (fragment)).toString();
	//   41   77:aload_0         
	//   42   78:aload_2         
	//   43   79:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   44   82:putfield        #282 <Field String mWho>
			return;
	//   45   85:return          
		}
	}

	public void setInitialSavedState(SavedState savedstate)
	{
		if(mIndex < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field int mIndex>
	//*   2    4:ifge            34
		{
			if(savedstate != null && savedstate.a != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          26
	//*   5   11:aload_1         
	//*   6   12:getfield        #1002 <Field Bundle Fragment$SavedState.a>
	//*   7   15:ifnull          26
				savedstate = ((SavedState) (savedstate.a));
	//    8   18:aload_1         
	//    9   19:getfield        #1002 <Field Bundle Fragment$SavedState.a>
	//   10   22:astore_1        
			else
	//*  11   23:goto            28
				savedstate = null;
	//   12   26:aconst_null     
	//   13   27:astore_1        
			mSavedFragmentState = ((Bundle) (savedstate));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:putfield        #354 <Field Bundle mSavedFragmentState>
			return;
	//   17   33:return          
		} else
		{
			throw new IllegalStateException("Fragment already active");
	//   18   34:new             #532 <Class IllegalStateException>
	//   19   37:dup             
	//   20   38:ldc2            #1004 <String "Fragment already active">
	//   21   41:invokespecial   #536 <Method void IllegalStateException(String)>
	//   22   44:athrow          
		}
	}

	public void setMenuVisibility(boolean flag)
	{
		if(mMenuVisible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean mMenuVisible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          41
		{
			mMenuVisible = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #114 <Field boolean mMenuVisible>
			if(mHasMenu && isAdded() && !isHidden())
	//*   7   13:aload_0         
	//*   8   14:getfield        #323 <Field boolean mHasMenu>
	//*   9   17:ifeq            41
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #658 <Method boolean isAdded()>
	//*  12   24:ifeq            41
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #660 <Method boolean isHidden()>
	//*  15   31:ifne            41
				mHost.d();
	//   16   34:aload_0         
	//   17   35:getfield        #342 <Field ad mHost>
	//   18   38:invokevirtual   #988 <Method void ad.d()>
		}
	//   19   41:return          
	}

	void setNextAnim(int i)
	{
		if(mAnimationInfo == null && i == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field t mAnimationInfo>
	//*   2    4:ifnonnull       12
	//*   3    7:iload_1         
	//*   4    8:ifne            12
		{
			return;
	//    5   11:return          
		} else
		{
			ensureAnimationInfo().d = i;
	//    6   12:aload_0         
	//    7   13:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    8   16:iload_1         
	//    9   17:putfield        #544 <Field int t.d>
			return;
	//   10   20:return          
		}
	}

	void setNextTransition(int i, int l)
	{
		if(mAnimationInfo == null && i == 0 && l == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field t mAnimationInfo>
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
	//    9   17:invokespecial   #921 <Method t ensureAnimationInfo()>
	//   10   20:pop             
			t t1 = mAnimationInfo;
	//   11   21:aload_0         
	//   12   22:getfield        #132 <Field t mAnimationInfo>
	//   13   25:astore_3        
			t1.e = i;
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:putfield        #548 <Field int t.e>
			t1.f = l;
	//   17   31:aload_3         
	//   18   32:iload_2         
	//   19   33:putfield        #552 <Field int android.support.v4.app.t.f>
			return;
	//   20   36:return          
		}
	}

	void setOnStartEnterTransitionListener(v v1)
	{
		ensureAnimationInfo();
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:pop             
		if(v1 == mAnimationInfo.r)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #132 <Field t mAnimationInfo>
	//*   6   10:getfield        #237 <Field v t.r>
	//*   7   13:if_acmpne       17
			return;
	//    8   16:return          
		if(v1 != null && mAnimationInfo.r != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          68
	//*  11   21:aload_0         
	//*  12   22:getfield        #132 <Field t mAnimationInfo>
	//*  13   25:getfield        #237 <Field v t.r>
	//*  14   28:ifnonnull       34
	//*  15   31:goto            68
		{
			v1 = ((v) (new StringBuilder()));
	//   16   34:new             #199 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #200 <Method void StringBuilder()>
	//   19   41:astore_1        
			((StringBuilder) (v1)).append("Trying to set a replacement startPostponedEnterTransition on ");
	//   20   42:aload_1         
	//   21   43:ldc2            #1012 <String "Trying to set a replacement startPostponedEnterTransition on ">
	//   22   46:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			((StringBuilder) (v1)).append(((Object) (this)));
	//   24   50:aload_1         
	//   25   51:aload_0         
	//   26   52:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   27   55:pop             
			throw new IllegalStateException(((StringBuilder) (v1)).toString());
	//   28   56:new             #532 <Class IllegalStateException>
	//   29   59:dup             
	//   30   60:aload_1         
	//   31   61:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   32   64:invokespecial   #536 <Method void IllegalStateException(String)>
	//   33   67:athrow          
		}
		if(mAnimationInfo.q)
	//*  34   68:aload_0         
	//*  35   69:getfield        #132 <Field t mAnimationInfo>
	//*  36   72:getfield        #233 <Field boolean t.q>
	//*  37   75:ifeq            86
			mAnimationInfo.r = v1;
	//   38   78:aload_0         
	//   39   79:getfield        #132 <Field t mAnimationInfo>
	//   40   82:aload_1         
	//   41   83:putfield        #237 <Field v t.r>
		if(v1 != null)
	//*  42   86:aload_1         
	//*  43   87:ifnull          96
			v1.b();
	//   44   90:aload_1         
	//   45   91:invokeinterface #1014 <Method void v.b()>
	//   46   96:return          
	}

	public void setReenterTransition(Object obj)
	{
		ensureAnimationInfo().j = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #558 <Field Object android.support.v4.app.t.j>
	//    4    8:return          
	}

	public void setRetainInstance(boolean flag)
	{
		mRetainInstance = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #327 <Field boolean mRetainInstance>
	//    3    5:return          
	}

	public void setReturnTransition(Object obj)
	{
		ensureAnimationInfo().h = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #571 <Field Object t.h>
	//    4    8:return          
	}

	public void setSharedElementEnterTransition(Object obj)
	{
		ensureAnimationInfo().k = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #577 <Field Object android.support.v4.app.t.k>
	//    4    8:return          
	}

	public void setSharedElementReturnTransition(Object obj)
	{
		ensureAnimationInfo().l = obj;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:aload_1         
	//    3    5:putfield        #581 <Field Object t.l>
	//    4    8:return          
	}

	void setStateAfterAnimating(int i)
	{
		ensureAnimationInfo().c = i;
	//    0    0:aload_0         
	//    1    1:invokespecial   #921 <Method t ensureAnimationInfo()>
	//    2    4:iload_1         
	//    3    5:putfield        #586 <Field int t.c>
	//    4    8:return          
	}

	public void setTargetFragment(Fragment fragment, int i)
	{
		ae ae1 = getFragmentManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #942 <Method ae getFragmentManager()>
	//    2    4:astore          4
		ae ae;
		if(fragment != null)
	//*   3    6:aload_1         
	//*   4    7:ifnull          18
			ae = fragment.getFragmentManager();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #942 <Method ae getFragmentManager()>
	//    7   14:astore_3        
		else
	//*   8   15:goto            20
			ae = null;
	//    9   18:aconst_null     
	//   10   19:astore_3        
		if(ae1 != null && ae != null && ae1 != ae)
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
	//   19   38:new             #199 <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #200 <Method void StringBuilder()>
	//   22   45:astore_3        
			stringbuilder.append("Fragment ");
	//   23   46:aload_3         
	//   24   47:ldc2            #748 <String "Fragment ">
	//   25   50:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			stringbuilder.append(((Object) (fragment)));
	//   27   54:aload_3         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   30   59:pop             
			stringbuilder.append(" must share the same FragmentManager to be set as a target fragment");
	//   31   60:aload_3         
	//   32   61:ldc2            #1024 <String " must share the same FragmentManager to be set as a target fragment">
	//   33   64:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   35   68:new             #1026 <Class IllegalArgumentException>
	//   36   71:dup             
	//   37   72:aload_3         
	//   38   73:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   39   76:invokespecial   #1027 <Method void IllegalArgumentException(String)>
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
	//   49   92:invokevirtual   #1029 <Method Fragment getTargetFragment()>
	//   50   95:astore_3        
			} else
	//*  51   96:goto            82
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   52   99:new             #199 <Class StringBuilder>
	//   53  102:dup             
	//   54  103:invokespecial   #200 <Method void StringBuilder()>
	//   55  106:astore_3        
				stringbuilder1.append("Setting ");
	//   56  107:aload_3         
	//   57  108:ldc2            #1031 <String "Setting ">
	//   58  111:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   59  114:pop             
				stringbuilder1.append(((Object) (fragment)));
	//   60  115:aload_3         
	//   61  116:aload_1         
	//   62  117:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   63  120:pop             
				stringbuilder1.append(" as the target of ");
	//   64  121:aload_3         
	//   65  122:ldc2            #1033 <String " as the target of ">
	//   66  125:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   67  128:pop             
				stringbuilder1.append(((Object) (this)));
	//   68  129:aload_3         
	//   69  130:aload_0         
	//   70  131:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   71  134:pop             
				stringbuilder1.append(" would create a target cycle");
	//   72  135:aload_3         
	//   73  136:ldc2            #1035 <String " would create a target cycle">
	//   74  139:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   75  142:pop             
				throw new IllegalArgumentException(stringbuilder1.toString());
	//   76  143:new             #1026 <Class IllegalArgumentException>
	//   77  146:dup             
	//   78  147:aload_3         
	//   79  148:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   80  151:invokespecial   #1027 <Method void IllegalArgumentException(String)>
	//   81  154:athrow          
			}

		mTarget = fragment;
	//   82  155:aload_0         
	//   83  156:aload_1         
	//   84  157:putfield        #362 <Field Fragment mTarget>
		mTargetRequestCode = i;
	//   85  160:aload_0         
	//   86  161:iload_2         
	//   87  162:putfield        #370 <Field int mTargetRequestCode>
	//   88  165:return          
	}

	public void setUserVisibleHint(boolean flag)
	{
		if(!mUserVisibleHint && flag && mState < 3 && mFragmentManager != null && isAdded() && mIsCreated)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field boolean mUserVisibleHint>
	//*   2    4:ifne            48
	//*   3    7:iload_1         
	//*   4    8:ifeq            48
	//*   5   11:aload_0         
	//*   6   12:getfield        #108 <Field int mState>
	//*   7   15:iconst_3        
	//*   8   16:icmpge          48
	//*   9   19:aload_0         
	//*  10   20:getfield        #335 <Field ah mFragmentManager>
	//*  11   23:ifnull          48
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #658 <Method boolean isAdded()>
	//*  14   30:ifeq            48
	//*  15   33:aload_0         
	//*  16   34:getfield        #768 <Field boolean mIsCreated>
	//*  17   37:ifeq            48
			mFragmentManager.a(this);
	//   18   40:aload_0         
	//   19   41:getfield        #335 <Field ah mFragmentManager>
	//   20   44:aload_0         
	//   21   45:invokevirtual   #1038 <Method void ah.a(Fragment)>
		mUserVisibleHint = flag;
	//   22   48:aload_0         
	//   23   49:iload_1         
	//   24   50:putfield        #116 <Field boolean mUserVisibleHint>
		boolean flag1;
		if(mState < 3 && !flag)
	//*  25   53:aload_0         
	//*  26   54:getfield        #108 <Field int mState>
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
	//   38   74:putfield        #1040 <Field boolean mDeferStart>
		if(mSavedFragmentState != null)
	//*  39   77:aload_0         
	//*  40   78:getfield        #354 <Field Bundle mSavedFragmentState>
	//*  41   81:ifnull          92
			mSavedUserVisibleHint = Boolean.valueOf(flag);
	//   42   84:aload_0         
	//   43   85:iload_1         
	//   44   86:invokestatic    #972 <Method Boolean Boolean.valueOf(boolean)>
	//   45   89:putfield        #1042 <Field Boolean mSavedUserVisibleHint>
	//   46   92:return          
	}

	public boolean shouldShowRequestPermissionRationale(String s1)
	{
		ad ad1 = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field ad mHost>
	//    2    4:astore_2        
		if(ad1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return ad1.a(s1);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1046 <Method boolean ad.a(String)>
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
	//    3    3:invokevirtual   #1051 <Method void startActivity(Intent, Bundle)>
	//    4    6:return          
	}

	public void startActivity(Intent intent, Bundle bundle)
	{
		ad ad1 = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field ad mHost>
	//    2    4:astore_3        
		if(ad1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          18
		{
			ad1.a(this, intent, -1, bundle);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_m1       
	//    9   13:aload_2         
	//   10   14:invokevirtual   #1054 <Method void ad.a(Fragment, Intent, int, Bundle)>
			return;
	//   11   17:return          
		} else
		{
			intent = ((Intent) (new StringBuilder()));
	//   12   18:new             #199 <Class StringBuilder>
	//   13   21:dup             
	//   14   22:invokespecial   #200 <Method void StringBuilder()>
	//   15   25:astore_1        
			((StringBuilder) (intent)).append("Fragment ");
	//   16   26:aload_1         
	//   17   27:ldc2            #748 <String "Fragment ">
	//   18   30:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
			((StringBuilder) (intent)).append(((Object) (this)));
	//   20   34:aload_1         
	//   21   35:aload_0         
	//   22   36:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   23   39:pop             
			((StringBuilder) (intent)).append(" not attached to Activity");
	//   24   40:aload_1         
	//   25   41:ldc2            #934 <String " not attached to Activity">
	//   26   44:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   27   47:pop             
			throw new IllegalStateException(((StringBuilder) (intent)).toString());
	//   28   48:new             #532 <Class IllegalStateException>
	//   29   51:dup             
	//   30   52:aload_1         
	//   31   53:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   32   56:invokespecial   #536 <Method void IllegalStateException(String)>
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
	//    4    4:invokevirtual   #1059 <Method void startActivityForResult(Intent, int, Bundle)>
	//    5    7:return          
	}

	public void startActivityForResult(Intent intent, int i, Bundle bundle)
	{
		ad ad1 = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field ad mHost>
	//    2    4:astore          4
		if(ad1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
		{
			ad1.a(this, intent, i, bundle);
	//    5   11:aload           4
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:iload_2         
	//    9   16:aload_3         
	//   10   17:invokevirtual   #1054 <Method void ad.a(Fragment, Intent, int, Bundle)>
			return;
	//   11   20:return          
		} else
		{
			intent = ((Intent) (new StringBuilder()));
	//   12   21:new             #199 <Class StringBuilder>
	//   13   24:dup             
	//   14   25:invokespecial   #200 <Method void StringBuilder()>
	//   15   28:astore_1        
			((StringBuilder) (intent)).append("Fragment ");
	//   16   29:aload_1         
	//   17   30:ldc2            #748 <String "Fragment ">
	//   18   33:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			((StringBuilder) (intent)).append(((Object) (this)));
	//   20   37:aload_1         
	//   21   38:aload_0         
	//   22   39:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   23   42:pop             
			((StringBuilder) (intent)).append(" not attached to Activity");
	//   24   43:aload_1         
	//   25   44:ldc2            #934 <String " not attached to Activity">
	//   26   47:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			throw new IllegalStateException(((StringBuilder) (intent)).toString());
	//   28   51:new             #532 <Class IllegalStateException>
	//   29   54:dup             
	//   30   55:aload_1         
	//   31   56:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   32   59:invokespecial   #536 <Method void IllegalStateException(String)>
	//   33   62:athrow          
		}
	}

	public void startIntentSenderForResult(IntentSender intentsender, int i, Intent intent, int l, int i1, int j1, Bundle bundle)
	{
		ad ad1 = mHost;
	//    0    0:aload_0         
	//    1    1:getfield        #342 <Field ad mHost>
	//    2    4:astore          8
		if(ad1 != null)
	//*   3    6:aload           8
	//*   4    8:ifnull          29
		{
			ad1.a(this, intentsender, i, intent, l, i1, j1, bundle);
	//    5   11:aload           8
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:iload_2         
	//    9   16:aload_3         
	//   10   17:iload           4
	//   11   19:iload           5
	//   12   21:iload           6
	//   13   23:aload           7
	//   14   25:invokevirtual   #1064 <Method void ad.a(Fragment, IntentSender, int, Intent, int, int, int, Bundle)>
			return;
	//   15   28:return          
		} else
		{
			intentsender = ((IntentSender) (new StringBuilder()));
	//   16   29:new             #199 <Class StringBuilder>
	//   17   32:dup             
	//   18   33:invokespecial   #200 <Method void StringBuilder()>
	//   19   36:astore_1        
			((StringBuilder) (intentsender)).append("Fragment ");
	//   20   37:aload_1         
	//   21   38:ldc2            #748 <String "Fragment ">
	//   22   41:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			((StringBuilder) (intentsender)).append(((Object) (this)));
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:invokevirtual   #417 <Method StringBuilder StringBuilder.append(Object)>
	//   27   50:pop             
			((StringBuilder) (intentsender)).append(" not attached to Activity");
	//   28   51:aload_1         
	//   29   52:ldc2            #934 <String " not attached to Activity">
	//   30   55:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
			throw new IllegalStateException(((StringBuilder) (intentsender)).toString());
	//   32   59:new             #532 <Class IllegalStateException>
	//   33   62:dup             
	//   34   63:aload_1         
	//   35   64:invokevirtual   #214 <Method String StringBuilder.toString()>
	//   36   67:invokespecial   #536 <Method void IllegalStateException(String)>
	//   37   70:athrow          
		}
	}

	public void startPostponedEnterTransition()
	{
		ah ah1 = mFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #335 <Field ah mFragmentManager>
	//    2    4:astore_1        
		if(ah1 != null && ah1.m != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          66
	//*   5    9:aload_1         
	//*   6   10:getfield        #1067 <Field ad ah.m>
	//*   7   13:ifnonnull       19
	//*   8   16:goto            66
		{
			if(Looper.myLooper() != mFragmentManager.m.j().getLooper())
	//*   9   19:invokestatic    #1073 <Method Looper Looper.myLooper()>
	//*  10   22:aload_0         
	//*  11   23:getfield        #335 <Field ah mFragmentManager>
	//*  12   26:getfield        #1067 <Field ad ah.m>
	//*  13   29:invokevirtual   #1076 <Method Handler android.support.v4.app.ad.j()>
	//*  14   32:invokevirtual   #1081 <Method Looper Handler.getLooper()>
	//*  15   35:if_acmpeq       61
			{
				mFragmentManager.m.j().postAtFrontOfQueue(((Runnable) (new q(this))));
	//   16   38:aload_0         
	//   17   39:getfield        #335 <Field ah mFragmentManager>
	//   18   42:getfield        #1067 <Field ad ah.m>
	//   19   45:invokevirtual   #1076 <Method Handler android.support.v4.app.ad.j()>
	//   20   48:new             #1083 <Class q>
	//   21   51:dup             
	//   22   52:aload_0         
	//   23   53:invokespecial   #1084 <Method void q(Fragment)>
	//   24   56:invokevirtual   #1088 <Method boolean Handler.postAtFrontOfQueue(Runnable)>
	//   25   59:pop             
				return;
	//   26   60:return          
			} else
			{
				callStartTransitionListener();
	//   27   61:aload_0         
	//   28   62:invokevirtual   #1090 <Method void callStartTransitionListener()>
				return;
	//   29   65:return          
			}
		} else
		{
			ensureAnimationInfo().q = false;
	//   30   66:aload_0         
	//   31   67:invokespecial   #921 <Method t ensureAnimationInfo()>
	//   32   70:iconst_0        
	//   33   71:putfield        #233 <Field boolean t.q>
			return;
	//   34   74:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #199 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #1092 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		f.a(((Object) (this)), stringbuilder);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #1097 <Method void f.a(Object, StringBuilder)>
		if(mIndex >= 0)
	//*   8   16:aload_0         
	//*   9   17:getfield        #110 <Field int mIndex>
	//*  10   20:iflt            40
		{
			stringbuilder.append(" #");
	//   11   23:aload_1         
	//   12   24:ldc2            #1099 <String " #">
	//   13   27:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			stringbuilder.append(mIndex);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #110 <Field int mIndex>
	//   18   36:invokevirtual   #994 <Method StringBuilder StringBuilder.append(int)>
	//   19   39:pop             
		}
		if(mFragmentId != 0)
	//*  20   40:aload_0         
	//*  21   41:getfield        #254 <Field int mFragmentId>
	//*  22   44:ifeq            67
		{
			stringbuilder.append(" id=0x");
	//   23   47:aload_1         
	//   24   48:ldc2            #1101 <String " id=0x">
	//   25   51:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			stringbuilder.append(Integer.toHexString(mFragmentId));
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #254 <Field int mFragmentId>
	//   30   60:invokestatic    #260 <Method String Integer.toHexString(int)>
	//   31   63:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
		}
		if(mTag != null)
	//*  33   67:aload_0         
	//*  34   68:getfield        #268 <Field String mTag>
	//*  35   71:ifnull          91
		{
			stringbuilder.append(" ");
	//   36   74:aload_1         
	//   37   75:ldc2            #1103 <String " ">
	//   38   78:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			stringbuilder.append(mTag);
	//   40   82:aload_1         
	//   41   83:aload_0         
	//   42   84:getfield        #268 <Field String mTag>
	//   43   87:invokevirtual   #206 <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
		}
		stringbuilder.append('}');
	//   45   91:aload_1         
	//   46   92:bipush          125
	//   47   94:invokevirtual   #1106 <Method StringBuilder StringBuilder.append(char)>
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
	//    2    2:invokevirtual   #927 <Method void View.setOnCreateContextMenuListener(android.view.View$OnCreateContextMenuListener)>
	//    3    5:return          
	}

	static final int ACTIVITY_CREATED = 2;
	static final int CREATED = 1;
	static final int INITIALIZING = 0;
	static final int RESUMED = 4;
	static final int STARTED = 3;
	static final Object USE_DEFAULT_TRANSITION = new Object();
	private static final w sClassMap = new w();
	boolean mAdded;
	t mAnimationInfo;
	Bundle mArguments;
	int mBackStackNesting;
	boolean mCalled;
	ah mChildFragmentManager;
	ay mChildNonConfig;
	ViewGroup mContainer;
	int mContainerId;
	boolean mDeferStart;
	boolean mDetached;
	int mFragmentId;
	ah mFragmentManager;
	boolean mFromLayout;
	boolean mHasMenu;
	boolean mHidden;
	boolean mHiddenChanged;
	ad mHost;
	boolean mInLayout;
	int mIndex;
	View mInnerView;
	boolean mIsCreated;
	boolean mIsNewlyAdded;
	LayoutInflater mLayoutInflater;
	k mLifecycleRegistry;
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
	j mViewLifecycleOwner;
	s mViewLifecycleOwnerLiveData;
	k mViewLifecycleRegistry;
	aa mViewModelStore;
	String mWho;

	static 
	{
	//    0    0:new             #97  <Class w>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void w()>
	//    3    7:putstatic       #102 <Field w sClassMap>
	//    4   10:new             #4   <Class Object>
	//    5   13:dup             
	//    6   14:invokespecial   #103 <Method void Object()>
	//    7   17:putstatic       #105 <Field Object USE_DEFAULT_TRANSITION>
	//*   8   20:return          
	}

	private class SavedState
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
			parcel.writeBundle(a);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field Bundle a>
		//    3    5:invokevirtual   #44  <Method void Parcel.writeBundle(Bundle)>
		//    4    8:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.support.v4.app.w();
		final Bundle a;

		static 
		{
		//    0    0:new             #14  <Class android.support.v4.app.w>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void android.support.v4.app.w()>
		//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			a = parcel.readBundle();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #28  <Method Bundle Parcel.readBundle()>
		//    5    9:putfield        #30  <Field Bundle a>
			if(classloader != null)
		//*   6   12:aload_2         
		//*   7   13:ifnull          30
			{
				parcel = ((Parcel) (a));
		//    8   16:aload_0         
		//    9   17:getfield        #30  <Field Bundle a>
		//   10   20:astore_1        
				if(parcel != null)
		//*  11   21:aload_1         
		//*  12   22:ifnull          30
					((Bundle) (parcel)).setClassLoader(classloader);
		//   13   25:aload_1         
		//   14   26:aload_2         
		//   15   27:invokevirtual   #36  <Method void Bundle.setClassLoader(ClassLoader)>
			}
		//   16   30:return          
		}
	}

}
