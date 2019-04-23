// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.aa;
import android.content.Context;
import android.os.*;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//			ba, Fragment, ad, ab, 
//			ah, ay

final class FragmentState
	implements Parcelable
{

	FragmentState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #43  <Method String Parcel.readString()>
	//    5    9:putfield        #45  <Field String a>
		b = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #49  <Method int Parcel.readInt()>
	//    9   17:putfield        #51  <Field int b>
		int i1 = parcel.readInt();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #49  <Method int Parcel.readInt()>
	//   12   24:istore_2        
		boolean flag1 = true;
	//   13   25:iconst_1        
	//   14   26:istore          4
		boolean flag;
		if(i1 != 0)
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
		c = flag;
	//   22   39:aload_0         
	//   23   40:iload_3         
	//   24   41:putfield        #53  <Field boolean c>
		d = parcel.readInt();
	//   25   44:aload_0         
	//   26   45:aload_1         
	//   27   46:invokevirtual   #49  <Method int Parcel.readInt()>
	//   28   49:putfield        #55  <Field int d>
		e = parcel.readInt();
	//   29   52:aload_0         
	//   30   53:aload_1         
	//   31   54:invokevirtual   #49  <Method int Parcel.readInt()>
	//   32   57:putfield        #57  <Field int e>
		f = parcel.readString();
	//   33   60:aload_0         
	//   34   61:aload_1         
	//   35   62:invokevirtual   #43  <Method String Parcel.readString()>
	//   36   65:putfield        #59  <Field String f>
		if(parcel.readInt() != 0)
	//*  37   68:aload_1         
	//*  38   69:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  39   72:ifeq            80
			flag = true;
	//   40   75:iconst_1        
	//   41   76:istore_3        
		else
	//*  42   77:goto            82
			flag = false;
	//   43   80:iconst_0        
	//   44   81:istore_3        
		g = flag;
	//   45   82:aload_0         
	//   46   83:iload_3         
	//   47   84:putfield        #61  <Field boolean g>
		if(parcel.readInt() != 0)
	//*  48   87:aload_1         
	//*  49   88:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  50   91:ifeq            99
			flag = true;
	//   51   94:iconst_1        
	//   52   95:istore_3        
		else
	//*  53   96:goto            101
			flag = false;
	//   54   99:iconst_0        
	//   55  100:istore_3        
		h = flag;
	//   56  101:aload_0         
	//   57  102:iload_3         
	//   58  103:putfield        #63  <Field boolean h>
		i = parcel.readBundle();
	//   59  106:aload_0         
	//   60  107:aload_1         
	//   61  108:invokevirtual   #67  <Method Bundle Parcel.readBundle()>
	//   62  111:putfield        #69  <Field Bundle i>
		if(parcel.readInt() != 0)
	//*  63  114:aload_1         
	//*  64  115:invokevirtual   #49  <Method int Parcel.readInt()>
	//*  65  118:ifeq            127
			flag = flag1;
	//   66  121:iload           4
	//   67  123:istore_3        
		else
	//*  68  124:goto            129
			flag = false;
	//   69  127:iconst_0        
	//   70  128:istore_3        
		j = flag;
	//   71  129:aload_0         
	//   72  130:iload_3         
	//   73  131:putfield        #71  <Field boolean j>
		k = parcel.readBundle();
	//   74  134:aload_0         
	//   75  135:aload_1         
	//   76  136:invokevirtual   #67  <Method Bundle Parcel.readBundle()>
	//   77  139:putfield        #73  <Field Bundle k>
	//   78  142:return          
	}

	FragmentState(Fragment fragment)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		a = ((Object) (fragment)).getClass().getName();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #78  <Method Class Object.getClass()>
	//    5    9:invokevirtual   #83  <Method String Class.getName()>
	//    6   12:putfield        #45  <Field String a>
		b = fragment.mIndex;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getfield        #88  <Field int Fragment.mIndex>
	//   10   20:putfield        #51  <Field int b>
		c = fragment.mFromLayout;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:getfield        #91  <Field boolean Fragment.mFromLayout>
	//   14   28:putfield        #53  <Field boolean c>
		d = fragment.mFragmentId;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getfield        #94  <Field int Fragment.mFragmentId>
	//   18   36:putfield        #55  <Field int d>
		e = fragment.mContainerId;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getfield        #97  <Field int Fragment.mContainerId>
	//   22   44:putfield        #57  <Field int e>
		f = fragment.mTag;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:getfield        #100 <Field String Fragment.mTag>
	//   26   52:putfield        #59  <Field String f>
		g = fragment.mRetainInstance;
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:getfield        #103 <Field boolean Fragment.mRetainInstance>
	//   30   60:putfield        #61  <Field boolean g>
		h = fragment.mDetached;
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getfield        #106 <Field boolean Fragment.mDetached>
	//   34   68:putfield        #63  <Field boolean h>
		i = fragment.mArguments;
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:getfield        #109 <Field Bundle Fragment.mArguments>
	//   38   76:putfield        #69  <Field Bundle i>
		j = fragment.mHidden;
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:getfield        #112 <Field boolean Fragment.mHidden>
	//   42   84:putfield        #71  <Field boolean j>
	//   43   87:return          
	}

	public Fragment a(ad ad1, ab ab1, Fragment fragment, ay ay, aa aa)
	{
		if(l == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field Fragment l>
	//*   2    4:ifnonnull       231
		{
			Context context = ad1.i();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #120 <Method Context ad.i()>
	//    5   11:astore          6
			Bundle bundle = i;
	//    6   13:aload_0         
	//    7   14:getfield        #69  <Field Bundle i>
	//    8   17:astore          7
			if(bundle != null)
	//*   9   19:aload           7
	//*  10   21:ifnull          34
				bundle.setClassLoader(context.getClassLoader());
	//   11   24:aload           7
	//   12   26:aload           6
	//   13   28:invokevirtual   #126 <Method ClassLoader Context.getClassLoader()>
	//   14   31:invokevirtual   #132 <Method void Bundle.setClassLoader(ClassLoader)>
			if(ab1 != null)
	//*  15   34:aload_2         
	//*  16   35:ifnull          59
				l = ab1.a(context, a, i);
	//   17   38:aload_0         
	//   18   39:aload_2         
	//   19   40:aload           6
	//   20   42:aload_0         
	//   21   43:getfield        #45  <Field String a>
	//   22   46:aload_0         
	//   23   47:getfield        #69  <Field Bundle i>
	//   24   50:invokevirtual   #137 <Method Fragment ab.a(Context, String, Bundle)>
	//   25   53:putfield        #115 <Field Fragment l>
			else
	//*  26   56:goto            76
				l = Fragment.instantiate(context, a, i);
	//   27   59:aload_0         
	//   28   60:aload           6
	//   29   62:aload_0         
	//   30   63:getfield        #45  <Field String a>
	//   31   66:aload_0         
	//   32   67:getfield        #69  <Field Bundle i>
	//   33   70:invokestatic    #140 <Method Fragment Fragment.instantiate(Context, String, Bundle)>
	//   34   73:putfield        #115 <Field Fragment l>
			ab1 = ((ab) (k));
	//   35   76:aload_0         
	//   36   77:getfield        #73  <Field Bundle k>
	//   37   80:astore_2        
			if(ab1 != null)
	//*  38   81:aload_2         
	//*  39   82:ifnull          105
			{
				((Bundle) (ab1)).setClassLoader(context.getClassLoader());
	//   40   85:aload_2         
	//   41   86:aload           6
	//   42   88:invokevirtual   #126 <Method ClassLoader Context.getClassLoader()>
	//   43   91:invokevirtual   #132 <Method void Bundle.setClassLoader(ClassLoader)>
				l.mSavedFragmentState = k;
	//   44   94:aload_0         
	//   45   95:getfield        #115 <Field Fragment l>
	//   46   98:aload_0         
	//   47   99:getfield        #73  <Field Bundle k>
	//   48  102:putfield        #143 <Field Bundle Fragment.mSavedFragmentState>
			}
			l.setIndex(b, fragment);
	//   49  105:aload_0         
	//   50  106:getfield        #115 <Field Fragment l>
	//   51  109:aload_0         
	//   52  110:getfield        #51  <Field int b>
	//   53  113:aload_3         
	//   54  114:invokevirtual   #147 <Method void Fragment.setIndex(int, Fragment)>
			ab1 = ((ab) (l));
	//   55  117:aload_0         
	//   56  118:getfield        #115 <Field Fragment l>
	//   57  121:astore_2        
			ab1.mFromLayout = c;
	//   58  122:aload_2         
	//   59  123:aload_0         
	//   60  124:getfield        #53  <Field boolean c>
	//   61  127:putfield        #91  <Field boolean Fragment.mFromLayout>
			ab1.mRestored = true;
	//   62  130:aload_2         
	//   63  131:iconst_1        
	//   64  132:putfield        #150 <Field boolean Fragment.mRestored>
			ab1.mFragmentId = d;
	//   65  135:aload_2         
	//   66  136:aload_0         
	//   67  137:getfield        #55  <Field int d>
	//   68  140:putfield        #94  <Field int Fragment.mFragmentId>
			ab1.mContainerId = e;
	//   69  143:aload_2         
	//   70  144:aload_0         
	//   71  145:getfield        #57  <Field int e>
	//   72  148:putfield        #97  <Field int Fragment.mContainerId>
			ab1.mTag = f;
	//   73  151:aload_2         
	//   74  152:aload_0         
	//   75  153:getfield        #59  <Field String f>
	//   76  156:putfield        #100 <Field String Fragment.mTag>
			ab1.mRetainInstance = g;
	//   77  159:aload_2         
	//   78  160:aload_0         
	//   79  161:getfield        #61  <Field boolean g>
	//   80  164:putfield        #103 <Field boolean Fragment.mRetainInstance>
			ab1.mDetached = h;
	//   81  167:aload_2         
	//   82  168:aload_0         
	//   83  169:getfield        #63  <Field boolean h>
	//   84  172:putfield        #106 <Field boolean Fragment.mDetached>
			ab1.mHidden = j;
	//   85  175:aload_2         
	//   86  176:aload_0         
	//   87  177:getfield        #71  <Field boolean j>
	//   88  180:putfield        #112 <Field boolean Fragment.mHidden>
			ab1.mFragmentManager = ad1.b;
	//   89  183:aload_2         
	//   90  184:aload_1         
	//   91  185:getfield        #153 <Field ah ad.b>
	//   92  188:putfield        #156 <Field ah Fragment.mFragmentManager>
			if(ah.a)
	//*  93  191:getstatic       #160 <Field boolean ah.a>
	//*  94  194:ifeq            231
			{
				ad1 = ((ad) (new StringBuilder()));
	//   95  197:new             #162 <Class StringBuilder>
	//   96  200:dup             
	//   97  201:invokespecial   #163 <Method void StringBuilder()>
	//   98  204:astore_1        
				((StringBuilder) (ad1)).append("Instantiated fragment ");
	//   99  205:aload_1         
	//  100  206:ldc1            #165 <String "Instantiated fragment ">
	//  101  208:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//  102  211:pop             
				((StringBuilder) (ad1)).append(((Object) (l)));
	//  103  212:aload_1         
	//  104  213:aload_0         
	//  105  214:getfield        #115 <Field Fragment l>
	//  106  217:invokevirtual   #172 <Method StringBuilder StringBuilder.append(Object)>
	//  107  220:pop             
				Log.v("FragmentManager", ((StringBuilder) (ad1)).toString());
	//  108  221:ldc1            #174 <String "FragmentManager">
	//  109  223:aload_1         
	//  110  224:invokevirtual   #177 <Method String StringBuilder.toString()>
	//  111  227:invokestatic    #183 <Method int Log.v(String, String)>
	//  112  230:pop             
			}
		}
		ad1 = ((ad) (l));
	//  113  231:aload_0         
	//  114  232:getfield        #115 <Field Fragment l>
	//  115  235:astore_1        
		ad1.mChildNonConfig = ay;
	//  116  236:aload_1         
	//  117  237:aload           4
	//  118  239:putfield        #187 <Field ay Fragment.mChildNonConfig>
		ad1.mViewModelStore = aa;
	//  119  242:aload_1         
	//  120  243:aload           5
	//  121  245:putfield        #191 <Field aa Fragment.mViewModelStore>
		return ((Fragment) (ad1));
	//  122  248:aload_1         
	//  123  249:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #196 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #198 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #203 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ba();
	final String a;
	final int b;
	final boolean c;
	final int d;
	final int e;
	final String f;
	final boolean g;
	final boolean h;
	final Bundle i;
	final boolean j;
	Bundle k;
	Fragment l;

	static 
	{
	//    0    0:new             #29  <Class ba>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void ba()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
