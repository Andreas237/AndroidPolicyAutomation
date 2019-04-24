// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.os.*;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//			Fragment, FragmentHostCallback, FragmentContainer, FragmentManagerImpl, 
//			FragmentManagerNonConfig

final class FragmentState
	implements Parcelable
{

	public FragmentState(Parcel parcel)
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

	public FragmentState(Fragment fragment)
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

	public Fragment instantiate(FragmentHostCallback fragmenthostcallback, FragmentContainer fragmentcontainer, Fragment fragment, FragmentManagerNonConfig fragmentmanagernonconfig)
	{
		if(mInstance == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field Fragment mInstance>
	//*   2    4:ifnonnull       254
		{
			Context context = fragmenthostcallback.getContext();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #106 <Method Context FragmentHostCallback.getContext()>
	//    5   11:astore          5
			if(mArguments != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #70  <Field Bundle mArguments>
	//*   8   17:ifnull          32
				mArguments.setClassLoader(context.getClassLoader());
	//    9   20:aload_0         
	//   10   21:getfield        #70  <Field Bundle mArguments>
	//   11   24:aload           5
	//   12   26:invokevirtual   #112 <Method ClassLoader Context.getClassLoader()>
	//   13   29:invokevirtual   #118 <Method void Bundle.setClassLoader(ClassLoader)>
			if(fragmentcontainer != null)
	//*  14   32:aload_2         
	//*  15   33:ifnull          59
				fragmentcontainer = ((FragmentContainer) (fragmentcontainer.instantiate(context, mClassName, mArguments)));
	//   16   36:aload_2         
	//   17   37:aload           5
	//   18   39:aload_0         
	//   19   40:getfield        #46  <Field String mClassName>
	//   20   43:aload_0         
	//   21   44:getfield        #70  <Field Bundle mArguments>
	//   22   47:invokevirtual   #123 <Method Fragment FragmentContainer.instantiate(Context, String, Bundle)>
	//   23   50:astore_2        
			else
	//*  24   51:aload_0         
	//*  25   52:aload_2         
	//*  26   53:putfield        #100 <Field Fragment mInstance>
	//*  27   56:goto            76
				fragmentcontainer = ((FragmentContainer) (Fragment.instantiate(context, mClassName, mArguments)));
	//   28   59:aload           5
	//   29   61:aload_0         
	//   30   62:getfield        #46  <Field String mClassName>
	//   31   65:aload_0         
	//   32   66:getfield        #70  <Field Bundle mArguments>
	//   33   69:invokestatic    #124 <Method Fragment Fragment.instantiate(Context, String, Bundle)>
	//   34   72:astore_2        
			mInstance = ((Fragment) (fragmentcontainer));
	//*  35   73:goto            51
			if(mSavedFragmentState != null)
	//*  36   76:aload_0         
	//*  37   77:getfield        #74  <Field Bundle mSavedFragmentState>
	//*  38   80:ifnull          106
			{
				mSavedFragmentState.setClassLoader(context.getClassLoader());
	//   39   83:aload_0         
	//   40   84:getfield        #74  <Field Bundle mSavedFragmentState>
	//   41   87:aload           5
	//   42   89:invokevirtual   #112 <Method ClassLoader Context.getClassLoader()>
	//   43   92:invokevirtual   #118 <Method void Bundle.setClassLoader(ClassLoader)>
				mInstance.mSavedFragmentState = mSavedFragmentState;
	//   44   95:aload_0         
	//   45   96:getfield        #100 <Field Fragment mInstance>
	//   46   99:aload_0         
	//   47  100:getfield        #74  <Field Bundle mSavedFragmentState>
	//   48  103:putfield        #125 <Field Bundle Fragment.mSavedFragmentState>
			}
			mInstance.setIndex(mIndex, fragment);
	//   49  106:aload_0         
	//   50  107:getfield        #100 <Field Fragment mInstance>
	//   51  110:aload_0         
	//   52  111:getfield        #52  <Field int mIndex>
	//   53  114:aload_3         
	//   54  115:invokevirtual   #129 <Method void Fragment.setIndex(int, Fragment)>
			mInstance.mFromLayout = mFromLayout;
	//   55  118:aload_0         
	//   56  119:getfield        #100 <Field Fragment mInstance>
	//   57  122:aload_0         
	//   58  123:getfield        #54  <Field boolean mFromLayout>
	//   59  126:putfield        #88  <Field boolean Fragment.mFromLayout>
			mInstance.mRestored = true;
	//   60  129:aload_0         
	//   61  130:getfield        #100 <Field Fragment mInstance>
	//   62  133:iconst_1        
	//   63  134:putfield        #132 <Field boolean Fragment.mRestored>
			mInstance.mFragmentId = mFragmentId;
	//   64  137:aload_0         
	//   65  138:getfield        #100 <Field Fragment mInstance>
	//   66  141:aload_0         
	//   67  142:getfield        #56  <Field int mFragmentId>
	//   68  145:putfield        #89  <Field int Fragment.mFragmentId>
			mInstance.mContainerId = mContainerId;
	//   69  148:aload_0         
	//   70  149:getfield        #100 <Field Fragment mInstance>
	//   71  152:aload_0         
	//   72  153:getfield        #58  <Field int mContainerId>
	//   73  156:putfield        #90  <Field int Fragment.mContainerId>
			mInstance.mTag = mTag;
	//   74  159:aload_0         
	//   75  160:getfield        #100 <Field Fragment mInstance>
	//   76  163:aload_0         
	//   77  164:getfield        #60  <Field String mTag>
	//   78  167:putfield        #91  <Field String Fragment.mTag>
			mInstance.mRetainInstance = mRetainInstance;
	//   79  170:aload_0         
	//   80  171:getfield        #100 <Field Fragment mInstance>
	//   81  174:aload_0         
	//   82  175:getfield        #62  <Field boolean mRetainInstance>
	//   83  178:putfield        #92  <Field boolean Fragment.mRetainInstance>
			mInstance.mDetached = mDetached;
	//   84  181:aload_0         
	//   85  182:getfield        #100 <Field Fragment mInstance>
	//   86  185:aload_0         
	//   87  186:getfield        #64  <Field boolean mDetached>
	//   88  189:putfield        #93  <Field boolean Fragment.mDetached>
			mInstance.mHidden = mHidden;
	//   89  192:aload_0         
	//   90  193:getfield        #100 <Field Fragment mInstance>
	//   91  196:aload_0         
	//   92  197:getfield        #72  <Field boolean mHidden>
	//   93  200:putfield        #95  <Field boolean Fragment.mHidden>
			mInstance.mFragmentManager = fragmenthostcallback.mFragmentManager;
	//   94  203:aload_0         
	//   95  204:getfield        #100 <Field Fragment mInstance>
	//   96  207:aload_1         
	//   97  208:getfield        #136 <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   98  211:putfield        #137 <Field FragmentManagerImpl Fragment.mFragmentManager>
			if(FragmentManagerImpl.DEBUG)
	//*  99  214:getstatic       #142 <Field boolean FragmentManagerImpl.DEBUG>
	//* 100  217:ifeq            254
			{
				fragmenthostcallback = ((FragmentHostCallback) (new StringBuilder()));
	//  101  220:new             #144 <Class StringBuilder>
	//  102  223:dup             
	//  103  224:invokespecial   #145 <Method void StringBuilder()>
	//  104  227:astore_1        
				((StringBuilder) (fragmenthostcallback)).append("Instantiated fragment ");
	//  105  228:aload_1         
	//  106  229:ldc1            #147 <String "Instantiated fragment ">
	//  107  231:invokevirtual   #151 <Method StringBuilder StringBuilder.append(String)>
	//  108  234:pop             
				((StringBuilder) (fragmenthostcallback)).append(((Object) (mInstance)));
	//  109  235:aload_1         
	//  110  236:aload_0         
	//  111  237:getfield        #100 <Field Fragment mInstance>
	//  112  240:invokevirtual   #154 <Method StringBuilder StringBuilder.append(Object)>
	//  113  243:pop             
				Log.v("FragmentManager", ((StringBuilder) (fragmenthostcallback)).toString());
	//  114  244:ldc1            #156 <String "FragmentManager">
	//  115  246:aload_1         
	//  116  247:invokevirtual   #159 <Method String StringBuilder.toString()>
	//  117  250:invokestatic    #165 <Method int Log.v(String, String)>
	//  118  253:pop             
			}
		}
		mInstance.mChildNonConfig = fragmentmanagernonconfig;
	//  119  254:aload_0         
	//  120  255:getfield        #100 <Field Fragment mInstance>
	//  121  258:aload           4
	//  122  260:putfield        #169 <Field FragmentManagerNonConfig Fragment.mChildNonConfig>
		return mInstance;
	//  123  263:aload_0         
	//  124  264:getfield        #100 <Field Fragment mInstance>
	//  125  267:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #173 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #175 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #180 <Method void Runtime(String)>
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
