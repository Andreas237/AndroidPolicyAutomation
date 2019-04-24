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
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		super();
	//    2    2:aload_0         
	//    3    3:invokespecial   #38  <Method void Object()>
		mClassName = parcel.readString();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #44  <Method String Parcel.readString()>
	//    7   11:putfield        #46  <Field String mClassName>
		mIndex = parcel.readInt();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #50  <Method int Parcel.readInt()>
	//   11   19:putfield        #52  <Field int mIndex>
		boolean flag;
		if(parcel.readInt() != 0)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  14   26:ifeq            119
			flag = true;
	//   15   29:iconst_1        
	//   16   30:istore_2        
		else
	//*  17   31:aload_0         
	//*  18   32:iload_2         
	//*  19   33:putfield        #54  <Field boolean mFromLayout>
	//*  20   36:aload_0         
	//*  21   37:aload_1         
	//*  22   38:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  23   41:putfield        #56  <Field int mFragmentId>
	//*  24   44:aload_0         
	//*  25   45:aload_1         
	//*  26   46:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  27   49:putfield        #58  <Field int mContainerId>
	//*  28   52:aload_0         
	//*  29   53:aload_1         
	//*  30   54:invokevirtual   #44  <Method String Parcel.readString()>
	//*  31   57:putfield        #60  <Field String mTag>
	//*  32   60:aload_1         
	//*  33   61:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  34   64:ifeq            124
	//*  35   67:iconst_1        
	//*  36   68:istore_2        
	//*  37   69:aload_0         
	//*  38   70:iload_2         
	//*  39   71:putfield        #62  <Field boolean mRetainInstance>
	//*  40   74:aload_1         
	//*  41   75:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  42   78:ifeq            129
	//*  43   81:iconst_1        
	//*  44   82:istore_2        
	//*  45   83:aload_0         
	//*  46   84:iload_2         
	//*  47   85:putfield        #64  <Field boolean mDetached>
	//*  48   88:aload_0         
	//*  49   89:aload_1         
	//*  50   90:invokevirtual   #68  <Method Bundle Parcel.readBundle()>
	//*  51   93:putfield        #70  <Field Bundle mArguments>
	//*  52   96:aload_1         
	//*  53   97:invokevirtual   #50  <Method int Parcel.readInt()>
	//*  54  100:ifeq            134
	//*  55  103:iload_3         
	//*  56  104:istore_2        
	//*  57  105:aload_0         
	//*  58  106:iload_2         
	//*  59  107:putfield        #72  <Field boolean mHidden>
	//*  60  110:aload_0         
	//*  61  111:aload_1         
	//*  62  112:invokevirtual   #68  <Method Bundle Parcel.readBundle()>
	//*  63  115:putfield        #74  <Field Bundle mSavedFragmentState>
	//*  64  118:return          
			flag = false;
	//   65  119:iconst_0        
	//   66  120:istore_2        
		mFromLayout = flag;
		mFragmentId = parcel.readInt();
		mContainerId = parcel.readInt();
		mTag = parcel.readString();
		if(parcel.readInt() != 0)
			flag = true;
		else
	//*  67  121:goto            31
			flag = false;
	//   68  124:iconst_0        
	//   69  125:istore_2        
		mRetainInstance = flag;
		if(parcel.readInt() != 0)
			flag = true;
		else
	//*  70  126:goto            69
			flag = false;
	//   71  129:iconst_0        
	//   72  130:istore_2        
		mDetached = flag;
		mArguments = parcel.readBundle();
		if(parcel.readInt() != 0)
			flag = flag1;
		else
	//*  73  131:goto            83
			flag = false;
	//   74  134:iconst_0        
	//   75  135:istore_2        
		mHidden = flag;
		mSavedFragmentState = parcel.readBundle();
	//*  76  136:goto            105
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
	//*   2    4:ifnonnull       226
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
	//*  15   33:ifnull          240
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
	//*  25   54:aload_0         
	//*  26   55:getfield        #74  <Field Bundle mSavedFragmentState>
	//*  27   58:ifnull          84
	//*  28   61:aload_0         
	//*  29   62:getfield        #74  <Field Bundle mSavedFragmentState>
	//*  30   65:aload           5
	//*  31   67:invokevirtual   #112 <Method ClassLoader Context.getClassLoader()>
	//*  32   70:invokevirtual   #118 <Method void Bundle.setClassLoader(ClassLoader)>
	//*  33   73:aload_0         
	//*  34   74:getfield        #100 <Field Fragment mInstance>
	//*  35   77:aload_0         
	//*  36   78:getfield        #74  <Field Bundle mSavedFragmentState>
	//*  37   81:putfield        #124 <Field Bundle Fragment.mSavedFragmentState>
	//*  38   84:aload_0         
	//*  39   85:getfield        #100 <Field Fragment mInstance>
	//*  40   88:aload_0         
	//*  41   89:getfield        #52  <Field int mIndex>
	//*  42   92:aload_3         
	//*  43   93:invokevirtual   #128 <Method void Fragment.setIndex(int, Fragment)>
	//*  44   96:aload_0         
	//*  45   97:getfield        #100 <Field Fragment mInstance>
	//*  46  100:aload_0         
	//*  47  101:getfield        #54  <Field boolean mFromLayout>
	//*  48  104:putfield        #88  <Field boolean Fragment.mFromLayout>
	//*  49  107:aload_0         
	//*  50  108:getfield        #100 <Field Fragment mInstance>
	//*  51  111:iconst_1        
	//*  52  112:putfield        #131 <Field boolean Fragment.mRestored>
	//*  53  115:aload_0         
	//*  54  116:getfield        #100 <Field Fragment mInstance>
	//*  55  119:aload_0         
	//*  56  120:getfield        #56  <Field int mFragmentId>
	//*  57  123:putfield        #89  <Field int Fragment.mFragmentId>
	//*  58  126:aload_0         
	//*  59  127:getfield        #100 <Field Fragment mInstance>
	//*  60  130:aload_0         
	//*  61  131:getfield        #58  <Field int mContainerId>
	//*  62  134:putfield        #90  <Field int Fragment.mContainerId>
	//*  63  137:aload_0         
	//*  64  138:getfield        #100 <Field Fragment mInstance>
	//*  65  141:aload_0         
	//*  66  142:getfield        #60  <Field String mTag>
	//*  67  145:putfield        #91  <Field String Fragment.mTag>
	//*  68  148:aload_0         
	//*  69  149:getfield        #100 <Field Fragment mInstance>
	//*  70  152:aload_0         
	//*  71  153:getfield        #62  <Field boolean mRetainInstance>
	//*  72  156:putfield        #92  <Field boolean Fragment.mRetainInstance>
	//*  73  159:aload_0         
	//*  74  160:getfield        #100 <Field Fragment mInstance>
	//*  75  163:aload_0         
	//*  76  164:getfield        #64  <Field boolean mDetached>
	//*  77  167:putfield        #93  <Field boolean Fragment.mDetached>
	//*  78  170:aload_0         
	//*  79  171:getfield        #100 <Field Fragment mInstance>
	//*  80  174:aload_0         
	//*  81  175:getfield        #72  <Field boolean mHidden>
	//*  82  178:putfield        #95  <Field boolean Fragment.mHidden>
	//*  83  181:aload_0         
	//*  84  182:getfield        #100 <Field Fragment mInstance>
	//*  85  185:aload_1         
	//*  86  186:getfield        #135 <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//*  87  189:putfield        #136 <Field FragmentManagerImpl Fragment.mFragmentManager>
	//*  88  192:getstatic       #141 <Field boolean FragmentManagerImpl.DEBUG>
	//*  89  195:ifeq            226
	//*  90  198:ldc1            #143 <String "FragmentManager">
	//*  91  200:new             #145 <Class StringBuilder>
	//*  92  203:dup             
	//*  93  204:invokespecial   #146 <Method void StringBuilder()>
	//*  94  207:ldc1            #148 <String "Instantiated fragment ">
	//*  95  209:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//*  96  212:aload_0         
	//*  97  213:getfield        #100 <Field Fragment mInstance>
	//*  98  216:invokevirtual   #155 <Method StringBuilder StringBuilder.append(Object)>
	//*  99  219:invokevirtual   #158 <Method String StringBuilder.toString()>
	//* 100  222:invokestatic    #164 <Method int Log.v(String, String)>
	//* 101  225:pop             
	//* 102  226:aload_0         
	//* 103  227:getfield        #100 <Field Fragment mInstance>
	//* 104  230:aload           4
	//* 105  232:putfield        #168 <Field FragmentManagerNonConfig Fragment.mChildNonConfig>
	//* 106  235:aload_0         
	//* 107  236:getfield        #100 <Field Fragment mInstance>
	//* 108  239:areturn         
				mInstance = Fragment.instantiate(context, mClassName, mArguments);
	//  109  240:aload_0         
	//  110  241:aload           5
	//  111  243:aload_0         
	//  112  244:getfield        #46  <Field String mClassName>
	//  113  247:aload_0         
	//  114  248:getfield        #70  <Field Bundle mArguments>
	//  115  251:invokestatic    #169 <Method Fragment Fragment.instantiate(Context, String, Bundle)>
	//  116  254:putfield        #100 <Field Fragment mInstance>
			if(mSavedFragmentState != null)
			{
				mSavedFragmentState.setClassLoader(context.getClassLoader());
				mInstance.mSavedFragmentState = mSavedFragmentState;
			}
			mInstance.setIndex(mIndex, fragment);
			mInstance.mFromLayout = mFromLayout;
			mInstance.mRestored = true;
			mInstance.mFragmentId = mFragmentId;
			mInstance.mContainerId = mContainerId;
			mInstance.mTag = mTag;
			mInstance.mRetainInstance = mRetainInstance;
			mInstance.mDetached = mDetached;
			mInstance.mHidden = mHidden;
			mInstance.mFragmentManager = fragmenthostcallback.mFragmentManager;
			if(FragmentManagerImpl.DEBUG)
				Log.v("FragmentManager", (new StringBuilder()).append("Instantiated fragment ").append(((Object) (mInstance))).toString());
		}
		mInstance.mChildNonConfig = fragmentmanagernonconfig;
		return mInstance;
	//* 117  257:goto            54
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		parcel.writeString(mClassName);
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:getfield        #46  <Field String mClassName>
	//    5    7:invokevirtual   #175 <Method void Parcel.writeString(String)>
		parcel.writeInt(mIndex);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #52  <Field int mIndex>
	//    9   15:invokevirtual   #179 <Method void Parcel.writeInt(int)>
		if(mFromLayout)
	//*  10   18:aload_0         
	//*  11   19:getfield        #54  <Field boolean mFromLayout>
	//*  12   22:ifeq            115
			i = 1;
	//   13   25:iconst_1        
	//   14   26:istore_2        
		else
	//*  15   27:aload_1         
	//*  16   28:iload_2         
	//*  17   29:invokevirtual   #179 <Method void Parcel.writeInt(int)>
	//*  18   32:aload_1         
	//*  19   33:aload_0         
	//*  20   34:getfield        #56  <Field int mFragmentId>
	//*  21   37:invokevirtual   #179 <Method void Parcel.writeInt(int)>
	//*  22   40:aload_1         
	//*  23   41:aload_0         
	//*  24   42:getfield        #58  <Field int mContainerId>
	//*  25   45:invokevirtual   #179 <Method void Parcel.writeInt(int)>
	//*  26   48:aload_1         
	//*  27   49:aload_0         
	//*  28   50:getfield        #60  <Field String mTag>
	//*  29   53:invokevirtual   #175 <Method void Parcel.writeString(String)>
	//*  30   56:aload_0         
	//*  31   57:getfield        #62  <Field boolean mRetainInstance>
	//*  32   60:ifeq            120
	//*  33   63:iconst_1        
	//*  34   64:istore_2        
	//*  35   65:aload_1         
	//*  36   66:iload_2         
	//*  37   67:invokevirtual   #179 <Method void Parcel.writeInt(int)>
	//*  38   70:aload_0         
	//*  39   71:getfield        #64  <Field boolean mDetached>
	//*  40   74:ifeq            125
	//*  41   77:iconst_1        
	//*  42   78:istore_2        
	//*  43   79:aload_1         
	//*  44   80:iload_2         
	//*  45   81:invokevirtual   #179 <Method void Parcel.writeInt(int)>
	//*  46   84:aload_1         
	//*  47   85:aload_0         
	//*  48   86:getfield        #70  <Field Bundle mArguments>
	//*  49   89:invokevirtual   #183 <Method void Parcel.writeBundle(Bundle)>
	//*  50   92:aload_0         
	//*  51   93:getfield        #72  <Field boolean mHidden>
	//*  52   96:ifeq            130
	//*  53   99:iload_3         
	//*  54  100:istore_2        
	//*  55  101:aload_1         
	//*  56  102:iload_2         
	//*  57  103:invokevirtual   #179 <Method void Parcel.writeInt(int)>
	//*  58  106:aload_1         
	//*  59  107:aload_0         
	//*  60  108:getfield        #74  <Field Bundle mSavedFragmentState>
	//*  61  111:invokevirtual   #183 <Method void Parcel.writeBundle(Bundle)>
	//*  62  114:return          
			i = 0;
	//   63  115:iconst_0        
	//   64  116:istore_2        
		parcel.writeInt(i);
		parcel.writeInt(mFragmentId);
		parcel.writeInt(mContainerId);
		parcel.writeString(mTag);
		if(mRetainInstance)
			i = 1;
		else
	//*  65  117:goto            27
			i = 0;
	//   66  120:iconst_0        
	//   67  121:istore_2        
		parcel.writeInt(i);
		if(mDetached)
			i = 1;
		else
	//*  68  122:goto            65
			i = 0;
	//   69  125:iconst_0        
	//   70  126:istore_2        
		parcel.writeInt(i);
		parcel.writeBundle(mArguments);
		if(mHidden)
			i = ((int) (flag));
		else
	//*  71  127:goto            79
			i = 0;
	//   72  130:iconst_0        
	//   73  131:istore_2        
		parcel.writeInt(i);
		parcel.writeBundle(mSavedFragmentState);
	//*  74  132:goto            101
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
