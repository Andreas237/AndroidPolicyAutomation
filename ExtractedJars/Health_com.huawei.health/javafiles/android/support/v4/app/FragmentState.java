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
		boolean flag;
		if(parcel.readInt() != 0)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  12   24:ifeq            32
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_2        
		else
	//*  15   29:goto            34
			flag = false;
	//   16   32:iconst_0        
	//   17   33:istore_2        
		mFromLayout = flag;
	//   18   34:aload_0         
	//   19   35:iload_2         
	//   20   36:putfield        #54  <Field boolean mFromLayout>
		mFragmentId = parcel.readInt();
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #50  <Method int Parcel.readInt()>
	//   24   44:putfield        #56  <Field int mFragmentId>
		mContainerId = parcel.readInt();
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #50  <Method int Parcel.readInt()>
	//   28   52:putfield        #58  <Field int mContainerId>
		mTag = parcel.readString();
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #44  <Method String Parcel.readString()>
	//   32   60:putfield        #60  <Field String mTag>
		if(parcel.readInt() != 0)
	//*  33   63:aload_1         
	//*  34   64:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  35   67:ifeq            75
			flag = true;
	//   36   70:iconst_1        
	//   37   71:istore_2        
		else
	//*  38   72:goto            77
			flag = false;
	//   39   75:iconst_0        
	//   40   76:istore_2        
		mRetainInstance = flag;
	//   41   77:aload_0         
	//   42   78:iload_2         
	//   43   79:putfield        #62  <Field boolean mRetainInstance>
		if(parcel.readInt() != 0)
	//*  44   82:aload_1         
	//*  45   83:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  46   86:ifeq            94
			flag = true;
	//   47   89:iconst_1        
	//   48   90:istore_2        
		else
	//*  49   91:goto            96
			flag = false;
	//   50   94:iconst_0        
	//   51   95:istore_2        
		mDetached = flag;
	//   52   96:aload_0         
	//   53   97:iload_2         
	//   54   98:putfield        #64  <Field boolean mDetached>
		mArguments = parcel.readBundle();
	//   55  101:aload_0         
	//   56  102:aload_1         
	//   57  103:invokevirtual   #68  <Method Bundle Parcel.readBundle()>
	//   58  106:putfield        #70  <Field Bundle mArguments>
		if(parcel.readInt() != 0)
	//*  59  109:aload_1         
	//*  60  110:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  61  113:ifeq            121
			flag = true;
	//   62  116:iconst_1        
	//   63  117:istore_2        
		else
	//*  64  118:goto            123
			flag = false;
	//   65  121:iconst_0        
	//   66  122:istore_2        
		mHidden = flag;
	//   67  123:aload_0         
	//   68  124:iload_2         
	//   69  125:putfield        #72  <Field boolean mHidden>
		mSavedFragmentState = parcel.readBundle();
	//   70  128:aload_0         
	//   71  129:aload_1         
	//   72  130:invokevirtual   #68  <Method Bundle Parcel.readBundle()>
	//   73  133:putfield        #74  <Field Bundle mSavedFragmentState>
	//   74  136:return          
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
	//*   2    4:ifnonnull       246
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
	//*  15   33:ifnull          57
				mInstance = fragmentcontainer.instantiate(context, mClassName, mArguments);
	//   16   36:aload_0         
	//   17   37:aload_2         
	//   18   38:aload           5
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
	//   27   58:aload           5
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
	//   39   85:aload           5
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
	//*  98  215:ifeq            246
				Log.v("FragmentManager", (new StringBuilder()).append("Instantiated fragment ").append(((Object) (mInstance))).toString());
	//   99  218:ldc1            #144 <String "FragmentManager">
	//  100  220:new             #146 <Class StringBuilder>
	//  101  223:dup             
	//  102  224:invokespecial   #147 <Method void StringBuilder()>
	//  103  227:ldc1            #149 <String "Instantiated fragment ">
	//  104  229:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//  105  232:aload_0         
	//  106  233:getfield        #100 <Field Fragment mInstance>
	//  107  236:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//  108  239:invokevirtual   #159 <Method String StringBuilder.toString()>
	//  109  242:invokestatic    #165 <Method int Log.v(String, String)>
	//  110  245:pop             
		}
		mInstance.mChildNonConfig = fragmentmanagernonconfig;
	//  111  246:aload_0         
	//  112  247:getfield        #100 <Field Fragment mInstance>
	//  113  250:aload           4
	//  114  252:putfield        #169 <Field FragmentManagerNonConfig Fragment.mChildNonConfig>
		return mInstance;
	//  115  255:aload_0         
	//  116  256:getfield        #100 <Field Fragment mInstance>
	//  117  259:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(mClassName);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field String mClassName>
	//    3    5:invokevirtual   #175 <Method void Parcel.writeString(String)>
		parcel.writeInt(mIndex);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field int mIndex>
	//    7   13:invokevirtual   #179 <Method void Parcel.writeInt(int)>
		if(mFromLayout)
	//*   8   16:aload_0         
	//*   9   17:getfield        #54  <Field boolean mFromLayout>
	//*  10   20:ifeq            28
			i = 1;
	//   11   23:iconst_1        
	//   12   24:istore_2        
		else
	//*  13   25:goto            30
			i = 0;
	//   14   28:iconst_0        
	//   15   29:istore_2        
		parcel.writeInt(i);
	//   16   30:aload_1         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #179 <Method void Parcel.writeInt(int)>
		parcel.writeInt(mFragmentId);
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #56  <Field int mFragmentId>
	//   22   40:invokevirtual   #179 <Method void Parcel.writeInt(int)>
		parcel.writeInt(mContainerId);
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #58  <Field int mContainerId>
	//   26   48:invokevirtual   #179 <Method void Parcel.writeInt(int)>
		parcel.writeString(mTag);
	//   27   51:aload_1         
	//   28   52:aload_0         
	//   29   53:getfield        #60  <Field String mTag>
	//   30   56:invokevirtual   #175 <Method void Parcel.writeString(String)>
		if(mRetainInstance)
	//*  31   59:aload_0         
	//*  32   60:getfield        #62  <Field boolean mRetainInstance>
	//*  33   63:ifeq            71
			i = 1;
	//   34   66:iconst_1        
	//   35   67:istore_2        
		else
	//*  36   68:goto            73
			i = 0;
	//   37   71:iconst_0        
	//   38   72:istore_2        
		parcel.writeInt(i);
	//   39   73:aload_1         
	//   40   74:iload_2         
	//   41   75:invokevirtual   #179 <Method void Parcel.writeInt(int)>
		if(mDetached)
	//*  42   78:aload_0         
	//*  43   79:getfield        #64  <Field boolean mDetached>
	//*  44   82:ifeq            90
			i = 1;
	//   45   85:iconst_1        
	//   46   86:istore_2        
		else
	//*  47   87:goto            92
			i = 0;
	//   48   90:iconst_0        
	//   49   91:istore_2        
		parcel.writeInt(i);
	//   50   92:aload_1         
	//   51   93:iload_2         
	//   52   94:invokevirtual   #179 <Method void Parcel.writeInt(int)>
		parcel.writeBundle(mArguments);
	//   53   97:aload_1         
	//   54   98:aload_0         
	//   55   99:getfield        #70  <Field Bundle mArguments>
	//   56  102:invokevirtual   #183 <Method void Parcel.writeBundle(Bundle)>
		if(mHidden)
	//*  57  105:aload_0         
	//*  58  106:getfield        #72  <Field boolean mHidden>
	//*  59  109:ifeq            117
			i = 1;
	//   60  112:iconst_1        
	//   61  113:istore_2        
		else
	//*  62  114:goto            119
			i = 0;
	//   63  117:iconst_0        
	//   64  118:istore_2        
		parcel.writeInt(i);
	//   65  119:aload_1         
	//   66  120:iload_2         
	//   67  121:invokevirtual   #179 <Method void Parcel.writeInt(int)>
		parcel.writeBundle(mSavedFragmentState);
	//   68  124:aload_1         
	//   69  125:aload_0         
	//   70  126:getfield        #74  <Field Bundle mSavedFragmentState>
	//   71  129:invokevirtual   #183 <Method void Parcel.writeBundle(Bundle)>
	//   72  132:return          
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
