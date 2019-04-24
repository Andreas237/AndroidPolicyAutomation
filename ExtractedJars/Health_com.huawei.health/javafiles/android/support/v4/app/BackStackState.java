// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			BackStackRecord, Fragment, FragmentManagerImpl

final class BackStackState
	implements Parcelable
{

	public BackStackState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		mOps = parcel.createIntArray();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #46  <Method int[] Parcel.createIntArray()>
	//    5    9:putfield        #48  <Field int[] mOps>
		mTransition = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #52  <Method int Parcel.readInt()>
	//    9   17:putfield        #54  <Field int mTransition>
		mTransitionStyle = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #52  <Method int Parcel.readInt()>
	//   13   25:putfield        #56  <Field int mTransitionStyle>
		mName = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #60  <Method String Parcel.readString()>
	//   17   33:putfield        #62  <Field String mName>
		mIndex = parcel.readInt();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #52  <Method int Parcel.readInt()>
	//   21   41:putfield        #64  <Field int mIndex>
		mBreadCrumbTitleRes = parcel.readInt();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #52  <Method int Parcel.readInt()>
	//   25   49:putfield        #66  <Field int mBreadCrumbTitleRes>
		mBreadCrumbTitleText = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   26   52:aload_0         
	//   27   53:getstatic       #71  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   28   56:aload_1         
	//   29   57:invokeinterface #77  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   30   62:checkcast       #79  <Class CharSequence>
	//   31   65:putfield        #81  <Field CharSequence mBreadCrumbTitleText>
		mBreadCrumbShortTitleRes = parcel.readInt();
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:invokevirtual   #52  <Method int Parcel.readInt()>
	//   35   73:putfield        #83  <Field int mBreadCrumbShortTitleRes>
		mBreadCrumbShortTitleText = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   36   76:aload_0         
	//   37   77:getstatic       #71  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   38   80:aload_1         
	//   39   81:invokeinterface #77  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   40   86:checkcast       #79  <Class CharSequence>
	//   41   89:putfield        #85  <Field CharSequence mBreadCrumbShortTitleText>
		mSharedElementSourceNames = parcel.createStringArrayList();
	//   42   92:aload_0         
	//   43   93:aload_1         
	//   44   94:invokevirtual   #89  <Method ArrayList Parcel.createStringArrayList()>
	//   45   97:putfield        #91  <Field ArrayList mSharedElementSourceNames>
		mSharedElementTargetNames = parcel.createStringArrayList();
	//   46  100:aload_0         
	//   47  101:aload_1         
	//   48  102:invokevirtual   #89  <Method ArrayList Parcel.createStringArrayList()>
	//   49  105:putfield        #93  <Field ArrayList mSharedElementTargetNames>
		boolean flag;
		if(parcel.readInt() != 0)
	//*  50  108:aload_1         
	//*  51  109:invokevirtual   #52  <Method int Parcel.readInt()>
	//*  52  112:ifeq            120
			flag = true;
	//   53  115:iconst_1        
	//   54  116:istore_2        
		else
	//*  55  117:goto            122
			flag = false;
	//   56  120:iconst_0        
	//   57  121:istore_2        
		mAllowOptimization = flag;
	//   58  122:aload_0         
	//   59  123:iload_2         
	//   60  124:putfield        #95  <Field boolean mAllowOptimization>
	//   61  127:return          
	}

	public BackStackState(BackStackRecord backstackrecord)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		int k = backstackrecord.mOps.size();
	//    2    4:aload_1         
	//    3    5:getfield        #100 <Field ArrayList BackStackRecord.mOps>
	//    4    8:invokevirtual   #105 <Method int ArrayList.size()>
	//    5   11:istore          4
		mOps = new int[k * 6];
	//    6   13:aload_0         
	//    7   14:iload           4
	//    8   16:bipush          6
	//    9   18:imul            
	//   10   19:newarray        int[]
	//   11   21:putfield        #48  <Field int[] mOps>
		if(!backstackrecord.mAddToBackStack)
	//*  12   24:aload_1         
	//*  13   25:getfield        #108 <Field boolean BackStackRecord.mAddToBackStack>
	//*  14   28:ifne            41
			throw new IllegalStateException("Not on back stack");
	//   15   31:new             #110 <Class IllegalStateException>
	//   16   34:dup             
	//   17   35:ldc1            #112 <String "Not on back stack">
	//   18   37:invokespecial   #115 <Method void IllegalStateException(String)>
	//   19   40:athrow          
		int j = 0;
	//   20   41:iconst_0        
	//   21   42:istore_3        
		for(int i = 0; i < k; i++)
	//*  22   43:iconst_0        
	//*  23   44:istore_2        
	//*  24   45:iload_2         
	//*  25   46:iload           4
	//*  26   48:icmpge          215
		{
			BackStackRecord.Op op = (BackStackRecord.Op)backstackrecord.mOps.get(i);
	//   27   51:aload_1         
	//   28   52:getfield        #100 <Field ArrayList BackStackRecord.mOps>
	//   29   55:iload_2         
	//   30   56:invokevirtual   #119 <Method Object ArrayList.get(int)>
	//   31   59:checkcast       #121 <Class BackStackRecord$Op>
	//   32   62:astore          7
			int ai[] = mOps;
	//   33   64:aload_0         
	//   34   65:getfield        #48  <Field int[] mOps>
	//   35   68:astore          8
			int l = j + 1;
	//   36   70:iload_3         
	//   37   71:iconst_1        
	//   38   72:iadd            
	//   39   73:istore          5
			ai[j] = op.cmd;
	//   40   75:aload           8
	//   41   77:iload_3         
	//   42   78:aload           7
	//   43   80:getfield        #124 <Field int BackStackRecord$Op.cmd>
	//   44   83:iastore         
			ai = mOps;
	//   45   84:aload_0         
	//   46   85:getfield        #48  <Field int[] mOps>
	//   47   88:astore          8
			int i1 = l + 1;
	//   48   90:iload           5
	//   49   92:iconst_1        
	//   50   93:iadd            
	//   51   94:istore          6
			if(op.fragment != null)
	//*  52   96:aload           7
	//*  53   98:getfield        #128 <Field Fragment BackStackRecord$Op.fragment>
	//*  54  101:ifnull          116
				j = op.fragment.mIndex;
	//   55  104:aload           7
	//   56  106:getfield        #128 <Field Fragment BackStackRecord$Op.fragment>
	//   57  109:getfield        #131 <Field int Fragment.mIndex>
	//   58  112:istore_3        
			else
	//*  59  113:goto            118
				j = -1;
	//   60  116:iconst_m1       
	//   61  117:istore_3        
			ai[l] = j;
	//   62  118:aload           8
	//   63  120:iload           5
	//   64  122:iload_3         
	//   65  123:iastore         
			ai = mOps;
	//   66  124:aload_0         
	//   67  125:getfield        #48  <Field int[] mOps>
	//   68  128:astore          8
			j = i1 + 1;
	//   69  130:iload           6
	//   70  132:iconst_1        
	//   71  133:iadd            
	//   72  134:istore_3        
			ai[i1] = op.enterAnim;
	//   73  135:aload           8
	//   74  137:iload           6
	//   75  139:aload           7
	//   76  141:getfield        #134 <Field int BackStackRecord$Op.enterAnim>
	//   77  144:iastore         
			ai = mOps;
	//   78  145:aload_0         
	//   79  146:getfield        #48  <Field int[] mOps>
	//   80  149:astore          8
			l = j + 1;
	//   81  151:iload_3         
	//   82  152:iconst_1        
	//   83  153:iadd            
	//   84  154:istore          5
			ai[j] = op.exitAnim;
	//   85  156:aload           8
	//   86  158:iload_3         
	//   87  159:aload           7
	//   88  161:getfield        #137 <Field int BackStackRecord$Op.exitAnim>
	//   89  164:iastore         
			ai = mOps;
	//   90  165:aload_0         
	//   91  166:getfield        #48  <Field int[] mOps>
	//   92  169:astore          8
			i1 = l + 1;
	//   93  171:iload           5
	//   94  173:iconst_1        
	//   95  174:iadd            
	//   96  175:istore          6
			ai[l] = op.popEnterAnim;
	//   97  177:aload           8
	//   98  179:iload           5
	//   99  181:aload           7
	//  100  183:getfield        #140 <Field int BackStackRecord$Op.popEnterAnim>
	//  101  186:iastore         
			ai = mOps;
	//  102  187:aload_0         
	//  103  188:getfield        #48  <Field int[] mOps>
	//  104  191:astore          8
			j = i1 + 1;
	//  105  193:iload           6
	//  106  195:iconst_1        
	//  107  196:iadd            
	//  108  197:istore_3        
			ai[i1] = op.popExitAnim;
	//  109  198:aload           8
	//  110  200:iload           6
	//  111  202:aload           7
	//  112  204:getfield        #143 <Field int BackStackRecord$Op.popExitAnim>
	//  113  207:iastore         
		}

	//  114  208:iload_2         
	//  115  209:iconst_1        
	//  116  210:iadd            
	//  117  211:istore_2        
	//* 118  212:goto            45
		mTransition = backstackrecord.mTransition;
	//  119  215:aload_0         
	//  120  216:aload_1         
	//  121  217:getfield        #144 <Field int BackStackRecord.mTransition>
	//  122  220:putfield        #54  <Field int mTransition>
		mTransitionStyle = backstackrecord.mTransitionStyle;
	//  123  223:aload_0         
	//  124  224:aload_1         
	//  125  225:getfield        #145 <Field int BackStackRecord.mTransitionStyle>
	//  126  228:putfield        #56  <Field int mTransitionStyle>
		mName = backstackrecord.mName;
	//  127  231:aload_0         
	//  128  232:aload_1         
	//  129  233:getfield        #146 <Field String BackStackRecord.mName>
	//  130  236:putfield        #62  <Field String mName>
		mIndex = backstackrecord.mIndex;
	//  131  239:aload_0         
	//  132  240:aload_1         
	//  133  241:getfield        #147 <Field int BackStackRecord.mIndex>
	//  134  244:putfield        #64  <Field int mIndex>
		mBreadCrumbTitleRes = backstackrecord.mBreadCrumbTitleRes;
	//  135  247:aload_0         
	//  136  248:aload_1         
	//  137  249:getfield        #148 <Field int BackStackRecord.mBreadCrumbTitleRes>
	//  138  252:putfield        #66  <Field int mBreadCrumbTitleRes>
		mBreadCrumbTitleText = backstackrecord.mBreadCrumbTitleText;
	//  139  255:aload_0         
	//  140  256:aload_1         
	//  141  257:getfield        #149 <Field CharSequence BackStackRecord.mBreadCrumbTitleText>
	//  142  260:putfield        #81  <Field CharSequence mBreadCrumbTitleText>
		mBreadCrumbShortTitleRes = backstackrecord.mBreadCrumbShortTitleRes;
	//  143  263:aload_0         
	//  144  264:aload_1         
	//  145  265:getfield        #150 <Field int BackStackRecord.mBreadCrumbShortTitleRes>
	//  146  268:putfield        #83  <Field int mBreadCrumbShortTitleRes>
		mBreadCrumbShortTitleText = backstackrecord.mBreadCrumbShortTitleText;
	//  147  271:aload_0         
	//  148  272:aload_1         
	//  149  273:getfield        #151 <Field CharSequence BackStackRecord.mBreadCrumbShortTitleText>
	//  150  276:putfield        #85  <Field CharSequence mBreadCrumbShortTitleText>
		mSharedElementSourceNames = backstackrecord.mSharedElementSourceNames;
	//  151  279:aload_0         
	//  152  280:aload_1         
	//  153  281:getfield        #152 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//  154  284:putfield        #91  <Field ArrayList mSharedElementSourceNames>
		mSharedElementTargetNames = backstackrecord.mSharedElementTargetNames;
	//  155  287:aload_0         
	//  156  288:aload_1         
	//  157  289:getfield        #153 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//  158  292:putfield        #93  <Field ArrayList mSharedElementTargetNames>
		mAllowOptimization = backstackrecord.mAllowOptimization;
	//  159  295:aload_0         
	//  160  296:aload_1         
	//  161  297:getfield        #154 <Field boolean BackStackRecord.mAllowOptimization>
	//  162  300:putfield        #95  <Field boolean mAllowOptimization>
	//  163  303:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public BackStackRecord instantiate(FragmentManagerImpl fragmentmanagerimpl)
	{
		BackStackRecord backstackrecord = new BackStackRecord(fragmentmanagerimpl);
	//    0    0:new             #98  <Class BackStackRecord>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #160 <Method void BackStackRecord(FragmentManagerImpl)>
	//    4    8:astore          5
		int j = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		for(int i = 0; j < mOps.length; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_2        
	//*   9   14:iload_3         
	//*  10   15:aload_0         
	//*  11   16:getfield        #48  <Field int[] mOps>
	//*  12   19:arraylength     
	//*  13   20:icmpge          293
		{
			BackStackRecord.Op op = new BackStackRecord.Op();
	//   14   23:new             #121 <Class BackStackRecord$Op>
	//   15   26:dup             
	//   16   27:invokespecial   #161 <Method void BackStackRecord$Op()>
	//   17   30:astore          6
			int ai[] = mOps;
	//   18   32:aload_0         
	//   19   33:getfield        #48  <Field int[] mOps>
	//   20   36:astore          7
			int k = j + 1;
	//   21   38:iload_3         
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:istore          4
			op.cmd = ai[j];
	//   25   43:aload           6
	//   26   45:aload           7
	//   27   47:iload_3         
	//   28   48:iaload          
	//   29   49:putfield        #124 <Field int BackStackRecord$Op.cmd>
			if(FragmentManagerImpl.DEBUG)
	//*  30   52:getstatic       #166 <Field boolean FragmentManagerImpl.DEBUG>
	//*  31   55:ifeq            108
				Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(((Object) (backstackrecord))).append(" op #").append(i).append(" base fragment #").append(mOps[k]).toString());
	//   32   58:ldc1            #168 <String "FragmentManager">
	//   33   60:new             #170 <Class StringBuilder>
	//   34   63:dup             
	//   35   64:invokespecial   #171 <Method void StringBuilder()>
	//   36   67:ldc1            #173 <String "Instantiate ">
	//   37   69:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   38   72:aload           5
	//   39   74:invokevirtual   #180 <Method StringBuilder StringBuilder.append(Object)>
	//   40   77:ldc1            #182 <String " op #">
	//   41   79:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   42   82:iload_2         
	//   43   83:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//   44   86:ldc1            #187 <String " base fragment #">
	//   45   88:invokevirtual   #177 <Method StringBuilder StringBuilder.append(String)>
	//   46   91:aload_0         
	//   47   92:getfield        #48  <Field int[] mOps>
	//   48   95:iload           4
	//   49   97:iaload          
	//   50   98:invokevirtual   #185 <Method StringBuilder StringBuilder.append(int)>
	//   51  101:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   52  104:invokestatic    #196 <Method int Log.v(String, String)>
	//   53  107:pop             
			ai = mOps;
	//   54  108:aload_0         
	//   55  109:getfield        #48  <Field int[] mOps>
	//   56  112:astore          7
			j = k + 1;
	//   57  114:iload           4
	//   58  116:iconst_1        
	//   59  117:iadd            
	//   60  118:istore_3        
			k = ai[k];
	//   61  119:aload           7
	//   62  121:iload           4
	//   63  123:iaload          
	//   64  124:istore          4
			if(k >= 0)
	//*  65  126:iload           4
	//*  66  128:iflt            151
				op.fragment = (Fragment)fragmentmanagerimpl.mActive.get(k);
	//   67  131:aload           6
	//   68  133:aload_1         
	//   69  134:getfield        #199 <Field ArrayList FragmentManagerImpl.mActive>
	//   70  137:iload           4
	//   71  139:invokevirtual   #119 <Method Object ArrayList.get(int)>
	//   72  142:checkcast       #130 <Class Fragment>
	//   73  145:putfield        #128 <Field Fragment BackStackRecord$Op.fragment>
			else
	//*  74  148:goto            157
				op.fragment = null;
	//   75  151:aload           6
	//   76  153:aconst_null     
	//   77  154:putfield        #128 <Field Fragment BackStackRecord$Op.fragment>
			ai = mOps;
	//   78  157:aload_0         
	//   79  158:getfield        #48  <Field int[] mOps>
	//   80  161:astore          7
			k = j + 1;
	//   81  163:iload_3         
	//   82  164:iconst_1        
	//   83  165:iadd            
	//   84  166:istore          4
			op.enterAnim = ai[j];
	//   85  168:aload           6
	//   86  170:aload           7
	//   87  172:iload_3         
	//   88  173:iaload          
	//   89  174:putfield        #134 <Field int BackStackRecord$Op.enterAnim>
			ai = mOps;
	//   90  177:aload_0         
	//   91  178:getfield        #48  <Field int[] mOps>
	//   92  181:astore          7
			j = k + 1;
	//   93  183:iload           4
	//   94  185:iconst_1        
	//   95  186:iadd            
	//   96  187:istore_3        
			op.exitAnim = ai[k];
	//   97  188:aload           6
	//   98  190:aload           7
	//   99  192:iload           4
	//  100  194:iaload          
	//  101  195:putfield        #137 <Field int BackStackRecord$Op.exitAnim>
			ai = mOps;
	//  102  198:aload_0         
	//  103  199:getfield        #48  <Field int[] mOps>
	//  104  202:astore          7
			k = j + 1;
	//  105  204:iload_3         
	//  106  205:iconst_1        
	//  107  206:iadd            
	//  108  207:istore          4
			op.popEnterAnim = ai[j];
	//  109  209:aload           6
	//  110  211:aload           7
	//  111  213:iload_3         
	//  112  214:iaload          
	//  113  215:putfield        #140 <Field int BackStackRecord$Op.popEnterAnim>
			ai = mOps;
	//  114  218:aload_0         
	//  115  219:getfield        #48  <Field int[] mOps>
	//  116  222:astore          7
			j = k + 1;
	//  117  224:iload           4
	//  118  226:iconst_1        
	//  119  227:iadd            
	//  120  228:istore_3        
			op.popExitAnim = ai[k];
	//  121  229:aload           6
	//  122  231:aload           7
	//  123  233:iload           4
	//  124  235:iaload          
	//  125  236:putfield        #143 <Field int BackStackRecord$Op.popExitAnim>
			backstackrecord.mEnterAnim = op.enterAnim;
	//  126  239:aload           5
	//  127  241:aload           6
	//  128  243:getfield        #134 <Field int BackStackRecord$Op.enterAnim>
	//  129  246:putfield        #202 <Field int BackStackRecord.mEnterAnim>
			backstackrecord.mExitAnim = op.exitAnim;
	//  130  249:aload           5
	//  131  251:aload           6
	//  132  253:getfield        #137 <Field int BackStackRecord$Op.exitAnim>
	//  133  256:putfield        #205 <Field int BackStackRecord.mExitAnim>
			backstackrecord.mPopEnterAnim = op.popEnterAnim;
	//  134  259:aload           5
	//  135  261:aload           6
	//  136  263:getfield        #140 <Field int BackStackRecord$Op.popEnterAnim>
	//  137  266:putfield        #208 <Field int BackStackRecord.mPopEnterAnim>
			backstackrecord.mPopExitAnim = op.popExitAnim;
	//  138  269:aload           5
	//  139  271:aload           6
	//  140  273:getfield        #143 <Field int BackStackRecord$Op.popExitAnim>
	//  141  276:putfield        #211 <Field int BackStackRecord.mPopExitAnim>
			backstackrecord.addOp(op);
	//  142  279:aload           5
	//  143  281:aload           6
	//  144  283:invokevirtual   #215 <Method void BackStackRecord.addOp(BackStackRecord$Op)>
		}

	//  145  286:iload_2         
	//  146  287:iconst_1        
	//  147  288:iadd            
	//  148  289:istore_2        
	//* 149  290:goto            14
		backstackrecord.mTransition = mTransition;
	//  150  293:aload           5
	//  151  295:aload_0         
	//  152  296:getfield        #54  <Field int mTransition>
	//  153  299:putfield        #144 <Field int BackStackRecord.mTransition>
		backstackrecord.mTransitionStyle = mTransitionStyle;
	//  154  302:aload           5
	//  155  304:aload_0         
	//  156  305:getfield        #56  <Field int mTransitionStyle>
	//  157  308:putfield        #145 <Field int BackStackRecord.mTransitionStyle>
		backstackrecord.mName = mName;
	//  158  311:aload           5
	//  159  313:aload_0         
	//  160  314:getfield        #62  <Field String mName>
	//  161  317:putfield        #146 <Field String BackStackRecord.mName>
		backstackrecord.mIndex = mIndex;
	//  162  320:aload           5
	//  163  322:aload_0         
	//  164  323:getfield        #64  <Field int mIndex>
	//  165  326:putfield        #147 <Field int BackStackRecord.mIndex>
		backstackrecord.mAddToBackStack = true;
	//  166  329:aload           5
	//  167  331:iconst_1        
	//  168  332:putfield        #108 <Field boolean BackStackRecord.mAddToBackStack>
		backstackrecord.mBreadCrumbTitleRes = mBreadCrumbTitleRes;
	//  169  335:aload           5
	//  170  337:aload_0         
	//  171  338:getfield        #66  <Field int mBreadCrumbTitleRes>
	//  172  341:putfield        #148 <Field int BackStackRecord.mBreadCrumbTitleRes>
		backstackrecord.mBreadCrumbTitleText = mBreadCrumbTitleText;
	//  173  344:aload           5
	//  174  346:aload_0         
	//  175  347:getfield        #81  <Field CharSequence mBreadCrumbTitleText>
	//  176  350:putfield        #149 <Field CharSequence BackStackRecord.mBreadCrumbTitleText>
		backstackrecord.mBreadCrumbShortTitleRes = mBreadCrumbShortTitleRes;
	//  177  353:aload           5
	//  178  355:aload_0         
	//  179  356:getfield        #83  <Field int mBreadCrumbShortTitleRes>
	//  180  359:putfield        #150 <Field int BackStackRecord.mBreadCrumbShortTitleRes>
		backstackrecord.mBreadCrumbShortTitleText = mBreadCrumbShortTitleText;
	//  181  362:aload           5
	//  182  364:aload_0         
	//  183  365:getfield        #85  <Field CharSequence mBreadCrumbShortTitleText>
	//  184  368:putfield        #151 <Field CharSequence BackStackRecord.mBreadCrumbShortTitleText>
		backstackrecord.mSharedElementSourceNames = mSharedElementSourceNames;
	//  185  371:aload           5
	//  186  373:aload_0         
	//  187  374:getfield        #91  <Field ArrayList mSharedElementSourceNames>
	//  188  377:putfield        #152 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
		backstackrecord.mSharedElementTargetNames = mSharedElementTargetNames;
	//  189  380:aload           5
	//  190  382:aload_0         
	//  191  383:getfield        #93  <Field ArrayList mSharedElementTargetNames>
	//  192  386:putfield        #153 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
		backstackrecord.mAllowOptimization = mAllowOptimization;
	//  193  389:aload           5
	//  194  391:aload_0         
	//  195  392:getfield        #95  <Field boolean mAllowOptimization>
	//  196  395:putfield        #154 <Field boolean BackStackRecord.mAllowOptimization>
		backstackrecord.bumpBackStackNesting(1);
	//  197  398:aload           5
	//  198  400:iconst_1        
	//  199  401:invokevirtual   #219 <Method void BackStackRecord.bumpBackStackNesting(int)>
		return backstackrecord;
	//  200  404:aload           5
	//  201  406:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeIntArray(mOps);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field int[] mOps>
	//    3    5:invokevirtual   #225 <Method void Parcel.writeIntArray(int[])>
		parcel.writeInt(mTransition);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #54  <Field int mTransition>
	//    7   13:invokevirtual   #228 <Method void Parcel.writeInt(int)>
		parcel.writeInt(mTransitionStyle);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #56  <Field int mTransitionStyle>
	//   11   21:invokevirtual   #228 <Method void Parcel.writeInt(int)>
		parcel.writeString(mName);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #62  <Field String mName>
	//   15   29:invokevirtual   #231 <Method void Parcel.writeString(String)>
		parcel.writeInt(mIndex);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #64  <Field int mIndex>
	//   19   37:invokevirtual   #228 <Method void Parcel.writeInt(int)>
		parcel.writeInt(mBreadCrumbTitleRes);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #66  <Field int mBreadCrumbTitleRes>
	//   23   45:invokevirtual   #228 <Method void Parcel.writeInt(int)>
		TextUtils.writeToParcel(mBreadCrumbTitleText, parcel, 0);
	//   24   48:aload_0         
	//   25   49:getfield        #81  <Field CharSequence mBreadCrumbTitleText>
	//   26   52:aload_1         
	//   27   53:iconst_0        
	//   28   54:invokestatic    #234 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		parcel.writeInt(mBreadCrumbShortTitleRes);
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:getfield        #83  <Field int mBreadCrumbShortTitleRes>
	//   32   62:invokevirtual   #228 <Method void Parcel.writeInt(int)>
		TextUtils.writeToParcel(mBreadCrumbShortTitleText, parcel, 0);
	//   33   65:aload_0         
	//   34   66:getfield        #85  <Field CharSequence mBreadCrumbShortTitleText>
	//   35   69:aload_1         
	//   36   70:iconst_0        
	//   37   71:invokestatic    #234 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
		parcel.writeStringList(((java.util.List) (mSharedElementSourceNames)));
	//   38   74:aload_1         
	//   39   75:aload_0         
	//   40   76:getfield        #91  <Field ArrayList mSharedElementSourceNames>
	//   41   79:invokevirtual   #238 <Method void Parcel.writeStringList(java.util.List)>
		parcel.writeStringList(((java.util.List) (mSharedElementTargetNames)));
	//   42   82:aload_1         
	//   43   83:aload_0         
	//   44   84:getfield        #93  <Field ArrayList mSharedElementTargetNames>
	//   45   87:invokevirtual   #238 <Method void Parcel.writeStringList(java.util.List)>
		if(mAllowOptimization)
	//*  46   90:aload_0         
	//*  47   91:getfield        #95  <Field boolean mAllowOptimization>
	//*  48   94:ifeq            102
			i = 1;
	//   49   97:iconst_1        
	//   50   98:istore_2        
		else
	//*  51   99:goto            104
			i = 0;
	//   52  102:iconst_0        
	//   53  103:istore_2        
		parcel.writeInt(i);
	//   54  104:aload_1         
	//   55  105:iload_2         
	//   56  106:invokevirtual   #228 <Method void Parcel.writeInt(int)>
	//   57  109:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public BackStackState createFromParcel(Parcel parcel)
		{
			return new BackStackState(parcel);
		//    0    0:new             #9   <Class BackStackState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void BackStackState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method BackStackState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public BackStackState[] newArray(int i)
		{
			return new BackStackState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       BackStackState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method BackStackState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	final boolean mAllowOptimization;
	final int mBreadCrumbShortTitleRes;
	final CharSequence mBreadCrumbShortTitleText;
	final int mBreadCrumbTitleRes;
	final CharSequence mBreadCrumbTitleText;
	final int mIndex;
	final String mName;
	final int mOps[];
	final ArrayList mSharedElementSourceNames;
	final ArrayList mSharedElementTargetNames;
	final int mTransition;
	final int mTransitionStyle;

	static 
	{
	//    0    0:new             #8   <Class BackStackState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void BackStackState$1()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
