// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.ViewModelStore;
import android.content.Context;
import android.os.*;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//			Fragment, FragmentHostCallback, FragmentContainer, FragmentManagerImpl, 
//			FragmentManagerNonConfig

final class FragmentState
	implements Parcelable
{

	FragmentState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		mClassName = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method String Parcel.readString()>
	//    5    9:putfield        #46  <Field String mClassName>
		mIndex = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #50  <Method int Parcel.readInt()>
	//    9   17:putfield        #52  <Field int mIndex>
		int i = parcel.readInt();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #50  <Method int Parcel.readInt()>
	//   12   24:istore_2        
		boolean flag1 = false;
	//   13   25:iconst_0        
	//   14   26:istore          4
		boolean flag;
		if(i != 0)
	//*  15   28:iload_2         
	//*  16   29:ifeq            37
			flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_3        
		else
	//*  19   34:goto            39
			flag = false;
	//   20   37:iconst_0        
	//   21   38:istore_3        
		mFromLayout = flag;
	//   22   39:aload_0         
	//   23   40:iload_3         
	//   24   41:putfield        #54  <Field boolean mFromLayout>
		mFragmentId = parcel.readInt();
	//   25   44:aload_0         
	//   26   45:aload_1         
	//   27   46:invokevirtual   #50  <Method int Parcel.readInt()>
	//   28   49:putfield        #56  <Field int mFragmentId>
		mContainerId = parcel.readInt();
	//   29   52:aload_0         
	//   30   53:aload_1         
	//   31   54:invokevirtual   #50  <Method int Parcel.readInt()>
	//   32   57:putfield        #58  <Field int mContainerId>
		mTag = parcel.readString();
	//   33   60:aload_0         
	//   34   61:aload_1         
	//   35   62:invokevirtual   #44  <Method String Parcel.readString()>
	//   36   65:putfield        #60  <Field String mTag>
		if(parcel.readInt() != 0)
	//*  37   68:aload_1         
	//*  38   69:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  39   72:ifeq            80
			flag = true;
	//   40   75:iconst_1        
	//   41   76:istore_3        
		else
	//*  42   77:goto            82
			flag = false;
	//   43   80:iconst_0        
	//   44   81:istore_3        
		mRetainInstance = flag;
	//   45   82:aload_0         
	//   46   83:iload_3         
	//   47   84:putfield        #62  <Field boolean mRetainInstance>
		if(parcel.readInt() != 0)
	//*  48   87:aload_1         
	//*  49   88:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  50   91:ifeq            99
			flag = true;
	//   51   94:iconst_1        
	//   52   95:istore_3        
		else
	//*  53   96:goto            101
			flag = false;
	//   54   99:iconst_0        
	//   55  100:istore_3        
		mDetached = flag;
	//   56  101:aload_0         
	//   57  102:iload_3         
	//   58  103:putfield        #64  <Field boolean mDetached>
		mArguments = parcel.readBundle();
	//   59  106:aload_0         
	//   60  107:aload_1         
	//   61  108:invokevirtual   #68  <Method Bundle Parcel.readBundle()>
	//   62  111:putfield        #70  <Field Bundle mArguments>
		flag = flag1;
	//   63  114:iload           4
	//   64  116:istore_3        
		if(parcel.readInt() != 0)
	//*  65  117:aload_1         
	//*  66  118:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  67  121:ifeq            126
			flag = true;
	//   68  124:iconst_1        
	//   69  125:istore_3        
		mHidden = flag;
	//   70  126:aload_0         
	//   71  127:iload_3         
	//   72  128:putfield        #72  <Field boolean mHidden>
		mSavedFragmentState = parcel.readBundle();
	//   73  131:aload_0         
	//   74  132:aload_1         
	//   75  133:invokevirtual   #68  <Method Bundle Parcel.readBundle()>
	//   76  136:putfield        #74  <Field Bundle mSavedFragmentState>
	//   77  139:return          
	}

	FragmentState(Fragment fragment)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		mClassName = ((Object) (fragment)).getClass().getName();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #79  <Method Class Object.getClass()>
	//    5    9:invokevirtual   #84  <Method String Class.getName()>
	//    6   12:putfield        #46  <Field String mClassName>
		mIndex = fragment.mIndex;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getfield        #87  <Field int Fragment.mIndex>
	//   10   20:putfield        #52  <Field int mIndex>
		mFromLayout = fragment.mFromLayout;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:getfield        #88  <Field boolean Fragment.mFromLayout>
	//   14   28:putfield        #54  <Field boolean mFromLayout>
		mFragmentId = fragment.mFragmentId;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getfield        #89  <Field int Fragment.mFragmentId>
	//   18   36:putfield        #56  <Field int mFragmentId>
		mContainerId = fragment.mContainerId;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getfield        #90  <Field int Fragment.mContainerId>
	//   22   44:putfield        #58  <Field int mContainerId>
		mTag = fragment.mTag;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:getfield        #91  <Field String Fragment.mTag>
	//   26   52:putfield        #60  <Field String mTag>
		mRetainInstance = fragment.mRetainInstance;
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:getfield        #92  <Field boolean Fragment.mRetainInstance>
	//   30   60:putfield        #62  <Field boolean mRetainInstance>
		mDetached = fragment.mDetached;
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getfield        #93  <Field boolean Fragment.mDetached>
	//   34   68:putfield        #64  <Field boolean mDetached>
		mArguments = fragment.mArguments;
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:getfield        #94  <Field Bundle Fragment.mArguments>
	//   38   76:putfield        #70  <Field Bundle mArguments>
		mHidden = fragment.mHidden;
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:getfield        #95  <Field boolean Fragment.mHidden>
	//   42   84:putfield        #72  <Field boolean mHidden>
	//   43   87:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Fragment instantiate(FragmentHostCallback fragmenthostcallback, FragmentContainer fragmentcontainer, Fragment fragment, FragmentManagerNonConfig fragmentmanagernonconfig, ViewModelStore viewmodelstore)
	{
		if(mInstance == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field Fragment mInstance>
	//*   2    4:ifnonnull       252
		{
			Context context = fragmenthostcallback.getContext();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #106 <Method Context FragmentHostCallback.getContext()>
	//    5   11:astore          6
			if(mArguments != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #70  <Field Bundle mArguments>
	//*   8   17:ifnull          32
				mArguments.setClassLoader(context.getClassLoader());
	//    9   20:aload_0         
	//   10   21:getfield        #70  <Field Bundle mArguments>
	//   11   24:aload           6
	//   12   26:invokevirtual   #112 <Method ClassLoader Context.getClassLoader()>
	//   13   29:invokevirtual   #118 <Method void Bundle.setClassLoader(ClassLoader)>
			if(fragmentcontainer != null)
	//*  14   32:aload_2         
	//*  15   33:ifnull          57
				mInstance = fragmentcontainer.instantiate(context, mClassName, mArguments);
	//   16   36:aload_0         
	//   17   37:aload_2         
	//   18   38:aload           6
	//   19   40:aload_0         
	//   20   41:getfield        #46  <Field String mClassName>
	//   21   44:aload_0         
	//   22   45:getfield        #70  <Field Bundle mArguments>
	//   23   48:invokevirtual   #123 <Method Fragment FragmentContainer.instantiate(Context, String, Bundle)>
	//   24   51:putfield        #100 <Field Fragment mInstance>
			else
	//*  25   54:goto            74
				mInstance = Fragment.instantiate(context, mClassName, mArguments);
	//   26   57:aload_0         
	//   27   58:aload           6
	//   28   60:aload_0         
	//   29   61:getfield        #46  <Field String mClassName>
	//   30   64:aload_0         
	//   31   65:getfield        #70  <Field Bundle mArguments>
	//   32   68:invokestatic    #124 <Method Fragment Fragment.instantiate(Context, String, Bundle)>
	//   33   71:putfield        #100 <Field Fragment mInstance>
			if(mSavedFragmentState != null)
	//*  34   74:aload_0         
	//*  35   75:getfield        #74  <Field Bundle mSavedFragmentState>
	//*  36   78:ifnull          104
			{
				mSavedFragmentState.setClassLoader(context.getClassLoader());
	//   37   81:aload_0         
	//   38   82:getfield        #74  <Field Bundle mSavedFragmentState>
	//   39   85:aload           6
	//   40   87:invokevirtual   #112 <Method ClassLoader Context.getClassLoader()>
	//   41   90:invokevirtual   #118 <Method void Bundle.setClassLoader(ClassLoader)>
				mInstance.mSavedFragmentState = mSavedFragmentState;
	//   42   93:aload_0         
	//   43   94:getfield        #100 <Field Fragment mInstance>
	//   44   97:aload_0         
	//   45   98:getfield        #74  <Field Bundle mSavedFragmentState>
	//   46  101:putfield        #125 <Field Bundle Fragment.mSavedFragmentState>
			}
			mInstance.setIndex(mIndex, fragment);
	//   47  104:aload_0         
	//   48  105:getfield        #100 <Field Fragment mInstance>
	//   49  108:aload_0         
	//   50  109:getfield        #52  <Field int mIndex>
	//   51  112:aload_3         
	//   52  113:invokevirtual   #129 <Method void Fragment.setIndex(int, Fragment)>
			mInstance.mFromLayout = mFromLayout;
	//   53  116:aload_0         
	//   54  117:getfield        #100 <Field Fragment mInstance>
	//   55  120:aload_0         
	//   56  121:getfield        #54  <Field boolean mFromLayout>
	//   57  124:putfield        #88  <Field boolean Fragment.mFromLayout>
			mInstance.mRestored = true;
	//   58  127:aload_0         
	//   59  128:getfield        #100 <Field Fragment mInstance>
	//   60  131:iconst_1        
	//   61  132:putfield        #132 <Field boolean Fragment.mRestored>
			mInstance.mFragmentId = mFragmentId;
	//   62  135:aload_0         
	//   63  136:getfield        #100 <Field Fragment mInstance>
	//   64  139:aload_0         
	//   65  140:getfield        #56  <Field int mFragmentId>
	//   66  143:putfield        #89  <Field int Fragment.mFragmentId>
			mInstance.mContainerId = mContainerId;
	//   67  146:aload_0         
	//   68  147:getfield        #100 <Field Fragment mInstance>
	//   69  150:aload_0         
	//   70  151:getfield        #58  <Field int mContainerId>
	//   71  154:putfield        #90  <Field int Fragment.mContainerId>
			mInstance.mTag = mTag;
	//   72  157:aload_0         
	//   73  158:getfield        #100 <Field Fragment mInstance>
	//   74  161:aload_0         
	//   75  162:getfield        #60  <Field String mTag>
	//   76  165:putfield        #91  <Field String Fragment.mTag>
			mInstance.mRetainInstance = mRetainInstance;
	//   77  168:aload_0         
	//   78  169:getfield        #100 <Field Fragment mInstance>
	//   79  172:aload_0         
	//   80  173:getfield        #62  <Field boolean mRetainInstance>
	//   81  176:putfield        #92  <Field boolean Fragment.mRetainInstance>
			mInstance.mDetached = mDetached;
	//   82  179:aload_0         
	//   83  180:getfield        #100 <Field Fragment mInstance>
	//   84  183:aload_0         
	//   85  184:getfield        #64  <Field boolean mDetached>
	//   86  187:putfield        #93  <Field boolean Fragment.mDetached>
			mInstance.mHidden = mHidden;
	//   87  190:aload_0         
	//   88  191:getfield        #100 <Field Fragment mInstance>
	//   89  194:aload_0         
	//   90  195:getfield        #72  <Field boolean mHidden>
	//   91  198:putfield        #95  <Field boolean Fragment.mHidden>
			mInstance.mFragmentManager = fragmenthostcallback.mFragmentManager;
	//   92  201:aload_0         
	//   93  202:getfield        #100 <Field Fragment mInstance>
	//   94  205:aload_1         
	//   95  206:getfield        #136 <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   96  209:putfield        #137 <Field FragmentManagerImpl Fragment.mFragmentManager>
			if(FragmentManagerImpl.DEBUG)
	//*  97  212:getstatic       #142 <Field boolean FragmentManagerImpl.DEBUG>
	//*  98  215:ifeq            252
			{
				fragmenthostcallback = ((FragmentHostCallback) (new StringBuilder()));
	//   99  218:new             #144 <Class StringBuilder>
	//  100  221:dup             
	//  101  222:invokespecial   #145 <Method void StringBuilder()>
	//  102  225:astore_1        
				((StringBuilder) (fragmenthostcallback)).append("Instantiated fragment ");
	//  103  226:aload_1         
	//  104  227:ldc1            #147 <String "Instantiated fragment ">
	//  105  229:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  106  232:pop             
				((StringBuilder) (fragmenthostcallback)).append(((Object) (mInstance)));
	//  107  233:aload_1         
	//  108  234:aload_0         
	//  109  235:getfield        #100 <Field Fragment mInstance>
	//  110  238:invokevirtual   #154 <Method StringBuilder StringBuilder.append(Object)>
	//  111  241:pop             
				Log.v("FragmentManager", ((StringBuilder) (fragmenthostcallback)).toString());
	//  112  242:ldc1            #156 <String "FragmentManager">
	//  113  244:aload_1         
	//  114  245:invokevirtual   #159 <Method String StringBuilder.toString()>
	//  115  248:invokestatic    #165 <Method int Log.v(String, String)>
	//  116  251:pop             
			}
		}
		mInstance.mChildNonConfig = fragmentmanagernonconfig;
	//  117  252:aload_0         
	//  118  253:getfield        #100 <Field Fragment mInstance>
	//  119  256:aload           4
	//  120  258:putfield        #169 <Field FragmentManagerNonConfig Fragment.mChildNonConfig>
		mInstance.mViewModelStore = viewmodelstore;
	//  121  261:aload_0         
	//  122  262:getfield        #100 <Field Fragment mInstance>
	//  123  265:aload           5
	//  124  267:putfield        #173 <Field ViewModelStore Fragment.mViewModelStore>
		return mInstance;
	//  125  270:aload_0         
	//  126  271:getfield        #100 <Field Fragment mInstance>
	//  127  274:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #177 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #179 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #184 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public FragmentState createFromParcel(Parcel parcel)
		{
			return new FragmentState(parcel);
		//    0    0:new             #9   <Class FragmentState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void FragmentState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method FragmentState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public FragmentState[] newArray(int i)
		{
			return new FragmentState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       FragmentState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method FragmentState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	final Bundle mArguments;
	final String mClassName;
	final int mContainerId;
	final boolean mDetached;
	final int mFragmentId;
	final boolean mFromLayout;
	final boolean mHidden;
	final int mIndex;
	Fragment mInstance;
	final boolean mRetainInstance;
	Bundle mSavedFragmentState;
	final String mTag;

	static 
	{
	//    0    0:new             #8   <Class FragmentState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void FragmentState$1()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
