// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
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
		mReorderingAllowed = flag;
	//   58  122:aload_0         
	//   59  123:iload_2         
	//   60  124:putfield        #95  <Field boolean mReorderingAllowed>
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
		int i = 0;
	//   20   41:iconst_0        
	//   21   42:istore_2        
		for(int j = 0; i < k; j++)
	//*  22   43:iconst_0        
	//*  23   44:istore_3        
	//*  24   45:iload_2         
	//*  25   46:iload           4
	//*  26   48:icmpge          208
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
			j = l + 1;
	//   93  171:iload           5
	//   94  173:iconst_1        
	//   95  174:iadd            
	//   96  175:istore_3        
			ai[l] = op.popEnterAnim;
	//   97  176:aload           8
	//   98  178:iload           5
	//   99  180:aload           7
	//  100  182:getfield        #140 <Field int BackStackRecord$Op.popEnterAnim>
	//  101  185:iastore         
			mOps[j] = op.popExitAnim;
	//  102  186:aload_0         
	//  103  187:getfield        #48  <Field int[] mOps>
	//  104  190:iload_3         
	//  105  191:aload           7
	//  106  193:getfield        #143 <Field int BackStackRecord$Op.popExitAnim>
	//  107  196:iastore         
			i++;
	//  108  197:iload_2         
	//  109  198:iconst_1        
	//  110  199:iadd            
	//  111  200:istore_2        
		}

	//  112  201:iload_3         
	//  113  202:iconst_1        
	//  114  203:iadd            
	//  115  204:istore_3        
	//* 116  205:goto            45
		mTransition = backstackrecord.mTransition;
	//  117  208:aload_0         
	//  118  209:aload_1         
	//  119  210:getfield        #144 <Field int BackStackRecord.mTransition>
	//  120  213:putfield        #54  <Field int mTransition>
		mTransitionStyle = backstackrecord.mTransitionStyle;
	//  121  216:aload_0         
	//  122  217:aload_1         
	//  123  218:getfield        #145 <Field int BackStackRecord.mTransitionStyle>
	//  124  221:putfield        #56  <Field int mTransitionStyle>
		mName = backstackrecord.mName;
	//  125  224:aload_0         
	//  126  225:aload_1         
	//  127  226:getfield        #146 <Field String BackStackRecord.mName>
	//  128  229:putfield        #62  <Field String mName>
		mIndex = backstackrecord.mIndex;
	//  129  232:aload_0         
	//  130  233:aload_1         
	//  131  234:getfield        #147 <Field int BackStackRecord.mIndex>
	//  132  237:putfield        #64  <Field int mIndex>
		mBreadCrumbTitleRes = backstackrecord.mBreadCrumbTitleRes;
	//  133  240:aload_0         
	//  134  241:aload_1         
	//  135  242:getfield        #148 <Field int BackStackRecord.mBreadCrumbTitleRes>
	//  136  245:putfield        #66  <Field int mBreadCrumbTitleRes>
		mBreadCrumbTitleText = backstackrecord.mBreadCrumbTitleText;
	//  137  248:aload_0         
	//  138  249:aload_1         
	//  139  250:getfield        #149 <Field CharSequence BackStackRecord.mBreadCrumbTitleText>
	//  140  253:putfield        #81  <Field CharSequence mBreadCrumbTitleText>
		mBreadCrumbShortTitleRes = backstackrecord.mBreadCrumbShortTitleRes;
	//  141  256:aload_0         
	//  142  257:aload_1         
	//  143  258:getfield        #150 <Field int BackStackRecord.mBreadCrumbShortTitleRes>
	//  144  261:putfield        #83  <Field int mBreadCrumbShortTitleRes>
		mBreadCrumbShortTitleText = backstackrecord.mBreadCrumbShortTitleText;
	//  145  264:aload_0         
	//  146  265:aload_1         
	//  147  266:getfield        #151 <Field CharSequence BackStackRecord.mBreadCrumbShortTitleText>
	//  148  269:putfield        #85  <Field CharSequence mBreadCrumbShortTitleText>
		mSharedElementSourceNames = backstackrecord.mSharedElementSourceNames;
	//  149  272:aload_0         
	//  150  273:aload_1         
	//  151  274:getfield        #152 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//  152  277:putfield        #91  <Field ArrayList mSharedElementSourceNames>
		mSharedElementTargetNames = backstackrecord.mSharedElementTargetNames;
	//  153  280:aload_0         
	//  154  281:aload_1         
	//  155  282:getfield        #153 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//  156  285:putfield        #93  <Field ArrayList mSharedElementTargetNames>
		mReorderingAllowed = backstackrecord.mReorderingAllowed;
	//  157  288:aload_0         
	//  158  289:aload_1         
	//  159  290:getfield        #154 <Field boolean BackStackRecord.mReorderingAllowed>
	//  160  293:putfield        #95  <Field boolean mReorderingAllowed>
	//  161  296:return          
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
		int i = 0;
	//    7   12:iconst_0        
	//    8   13:istore_2        
		int k;
		for(; j < mOps.length; j = k + 1)
	//*   9   14:iload_3         
	//*  10   15:aload_0         
	//*  11   16:getfield        #48  <Field int[] mOps>
	//*  12   19:arraylength     
	//*  13   20:icmpge          311
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
			k = j + 1;
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
	//*  31   55:ifeq            130
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   32   58:new             #168 <Class StringBuilder>
	//   33   61:dup             
	//   34   62:invokespecial   #169 <Method void StringBuilder()>
	//   35   65:astore          7
				stringbuilder.append("Instantiate ");
	//   36   67:aload           7
	//   37   69:ldc1            #171 <String "Instantiate ">
	//   38   71:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
				stringbuilder.append(((Object) (backstackrecord)));
	//   40   75:aload           7
	//   41   77:aload           5
	//   42   79:invokevirtual   #178 <Method StringBuilder StringBuilder.append(Object)>
	//   43   82:pop             
				stringbuilder.append(" op #");
	//   44   83:aload           7
	//   45   85:ldc1            #180 <String " op #">
	//   46   87:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
				stringbuilder.append(i);
	//   48   91:aload           7
	//   49   93:iload_2         
	//   50   94:invokevirtual   #183 <Method StringBuilder StringBuilder.append(int)>
	//   51   97:pop             
				stringbuilder.append(" base fragment #");
	//   52   98:aload           7
	//   53  100:ldc1            #185 <String " base fragment #">
	//   54  102:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   55  105:pop             
				stringbuilder.append(mOps[k]);
	//   56  106:aload           7
	//   57  108:aload_0         
	//   58  109:getfield        #48  <Field int[] mOps>
	//   59  112:iload           4
	//   60  114:iaload          
	//   61  115:invokevirtual   #183 <Method StringBuilder StringBuilder.append(int)>
	//   62  118:pop             
				Log.v("FragmentManager", stringbuilder.toString());
	//   63  119:ldc1            #187 <String "FragmentManager">
	//   64  121:aload           7
	//   65  123:invokevirtual   #190 <Method String StringBuilder.toString()>
	//   66  126:invokestatic    #196 <Method int Log.v(String, String)>
	//   67  129:pop             
			}
			stringbuilder = ((StringBuilder) (mOps));
	//   68  130:aload_0         
	//   69  131:getfield        #48  <Field int[] mOps>
	//   70  134:astore          7
			j = k + 1;
	//   71  136:iload           4
	//   72  138:iconst_1        
	//   73  139:iadd            
	//   74  140:istore_3        
			k = stringbuilder[k];
	//   75  141:aload           7
	//   76  143:iload           4
	//   77  145:iaload          
	//   78  146:istore          4
			if(k >= 0)
	//*  79  148:iload           4
	//*  80  150:iflt            173
				op.fragment = (Fragment)fragmentmanagerimpl.mActive.get(k);
	//   81  153:aload           6
	//   82  155:aload_1         
	//   83  156:getfield        #200 <Field SparseArray FragmentManagerImpl.mActive>
	//   84  159:iload           4
	//   85  161:invokevirtual   #203 <Method Object SparseArray.get(int)>
	//   86  164:checkcast       #130 <Class Fragment>
	//   87  167:putfield        #128 <Field Fragment BackStackRecord$Op.fragment>
			else
	//*  88  170:goto            179
				op.fragment = null;
	//   89  173:aload           6
	//   90  175:aconst_null     
	//   91  176:putfield        #128 <Field Fragment BackStackRecord$Op.fragment>
			stringbuilder = ((StringBuilder) (mOps));
	//   92  179:aload_0         
	//   93  180:getfield        #48  <Field int[] mOps>
	//   94  183:astore          7
			k = j + 1;
	//   95  185:iload_3         
	//   96  186:iconst_1        
	//   97  187:iadd            
	//   98  188:istore          4
			op.enterAnim = stringbuilder[j];
	//   99  190:aload           6
	//  100  192:aload           7
	//  101  194:iload_3         
	//  102  195:iaload          
	//  103  196:putfield        #134 <Field int BackStackRecord$Op.enterAnim>
			stringbuilder = ((StringBuilder) (mOps));
	//  104  199:aload_0         
	//  105  200:getfield        #48  <Field int[] mOps>
	//  106  203:astore          7
			j = k + 1;
	//  107  205:iload           4
	//  108  207:iconst_1        
	//  109  208:iadd            
	//  110  209:istore_3        
			op.exitAnim = stringbuilder[k];
	//  111  210:aload           6
	//  112  212:aload           7
	//  113  214:iload           4
	//  114  216:iaload          
	//  115  217:putfield        #137 <Field int BackStackRecord$Op.exitAnim>
			stringbuilder = ((StringBuilder) (mOps));
	//  116  220:aload_0         
	//  117  221:getfield        #48  <Field int[] mOps>
	//  118  224:astore          7
			k = j + 1;
	//  119  226:iload_3         
	//  120  227:iconst_1        
	//  121  228:iadd            
	//  122  229:istore          4
			op.popEnterAnim = stringbuilder[j];
	//  123  231:aload           6
	//  124  233:aload           7
	//  125  235:iload_3         
	//  126  236:iaload          
	//  127  237:putfield        #140 <Field int BackStackRecord$Op.popEnterAnim>
			op.popExitAnim = mOps[k];
	//  128  240:aload           6
	//  129  242:aload_0         
	//  130  243:getfield        #48  <Field int[] mOps>
	//  131  246:iload           4
	//  132  248:iaload          
	//  133  249:putfield        #143 <Field int BackStackRecord$Op.popExitAnim>
			backstackrecord.mEnterAnim = op.enterAnim;
	//  134  252:aload           5
	//  135  254:aload           6
	//  136  256:getfield        #134 <Field int BackStackRecord$Op.enterAnim>
	//  137  259:putfield        #206 <Field int BackStackRecord.mEnterAnim>
			backstackrecord.mExitAnim = op.exitAnim;
	//  138  262:aload           5
	//  139  264:aload           6
	//  140  266:getfield        #137 <Field int BackStackRecord$Op.exitAnim>
	//  141  269:putfield        #209 <Field int BackStackRecord.mExitAnim>
			backstackrecord.mPopEnterAnim = op.popEnterAnim;
	//  142  272:aload           5
	//  143  274:aload           6
	//  144  276:getfield        #140 <Field int BackStackRecord$Op.popEnterAnim>
	//  145  279:putfield        #212 <Field int BackStackRecord.mPopEnterAnim>
			backstackrecord.mPopExitAnim = op.popExitAnim;
	//  146  282:aload           5
	//  147  284:aload           6
	//  148  286:getfield        #143 <Field int BackStackRecord$Op.popExitAnim>
	//  149  289:putfield        #215 <Field int BackStackRecord.mPopExitAnim>
			backstackrecord.addOp(op);
	//  150  292:aload           5
	//  151  294:aload           6
	//  152  296:invokevirtual   #219 <Method void BackStackRecord.addOp(BackStackRecord$Op)>
			i++;
	//  153  299:iload_2         
	//  154  300:iconst_1        
	//  155  301:iadd            
	//  156  302:istore_2        
		}

	//  157  303:iload           4
	//  158  305:iconst_1        
	//  159  306:iadd            
	//  160  307:istore_3        
	//* 161  308:goto            14
		backstackrecord.mTransition = mTransition;
	//  162  311:aload           5
	//  163  313:aload_0         
	//  164  314:getfield        #54  <Field int mTransition>
	//  165  317:putfield        #144 <Field int BackStackRecord.mTransition>
		backstackrecord.mTransitionStyle = mTransitionStyle;
	//  166  320:aload           5
	//  167  322:aload_0         
	//  168  323:getfield        #56  <Field int mTransitionStyle>
	//  169  326:putfield        #145 <Field int BackStackRecord.mTransitionStyle>
		backstackrecord.mName = mName;
	//  170  329:aload           5
	//  171  331:aload_0         
	//  172  332:getfield        #62  <Field String mName>
	//  173  335:putfield        #146 <Field String BackStackRecord.mName>
		backstackrecord.mIndex = mIndex;
	//  174  338:aload           5
	//  175  340:aload_0         
	//  176  341:getfield        #64  <Field int mIndex>
	//  177  344:putfield        #147 <Field int BackStackRecord.mIndex>
		backstackrecord.mAddToBackStack = true;
	//  178  347:aload           5
	//  179  349:iconst_1        
	//  180  350:putfield        #108 <Field boolean BackStackRecord.mAddToBackStack>
		backstackrecord.mBreadCrumbTitleRes = mBreadCrumbTitleRes;
	//  181  353:aload           5
	//  182  355:aload_0         
	//  183  356:getfield        #66  <Field int mBreadCrumbTitleRes>
	//  184  359:putfield        #148 <Field int BackStackRecord.mBreadCrumbTitleRes>
		backstackrecord.mBreadCrumbTitleText = mBreadCrumbTitleText;
	//  185  362:aload           5
	//  186  364:aload_0         
	//  187  365:getfield        #81  <Field CharSequence mBreadCrumbTitleText>
	//  188  368:putfield        #149 <Field CharSequence BackStackRecord.mBreadCrumbTitleText>
		backstackrecord.mBreadCrumbShortTitleRes = mBreadCrumbShortTitleRes;
	//  189  371:aload           5
	//  190  373:aload_0         
	//  191  374:getfield        #83  <Field int mBreadCrumbShortTitleRes>
	//  192  377:putfield        #150 <Field int BackStackRecord.mBreadCrumbShortTitleRes>
		backstackrecord.mBreadCrumbShortTitleText = mBreadCrumbShortTitleText;
	//  193  380:aload           5
	//  194  382:aload_0         
	//  195  383:getfield        #85  <Field CharSequence mBreadCrumbShortTitleText>
	//  196  386:putfield        #151 <Field CharSequence BackStackRecord.mBreadCrumbShortTitleText>
		backstackrecord.mSharedElementSourceNames = mSharedElementSourceNames;
	//  197  389:aload           5
	//  198  391:aload_0         
	//  199  392:getfield        #91  <Field ArrayList mSharedElementSourceNames>
	//  200  395:putfield        #152 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
		backstackrecord.mSharedElementTargetNames = mSharedElementTargetNames;
	//  201  398:aload           5
	//  202  400:aload_0         
	//  203  401:getfield        #93  <Field ArrayList mSharedElementTargetNames>
	//  204  404:putfield        #153 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
		backstackrecord.mReorderingAllowed = mReorderingAllowed;
	//  205  407:aload           5
	//  206  409:aload_0         
	//  207  410:getfield        #95  <Field boolean mReorderingAllowed>
	//  208  413:putfield        #154 <Field boolean BackStackRecord.mReorderingAllowed>
		backstackrecord.bumpBackStackNesting(1);
	//  209  416:aload           5
	//  210  418:iconst_1        
	//  211  419:invokevirtual   #223 <Method void BackStackRecord.bumpBackStackNesting(int)>
		return backstackrecord;
	//  212  422:aload           5
	//  213  424:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #227 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #229 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #232 <Method void Runtime(String)>
	//    4    9:athrow          
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
	final int mBreadCrumbShortTitleRes;
	final CharSequence mBreadCrumbShortTitleText;
	final int mBreadCrumbTitleRes;
	final CharSequence mBreadCrumbTitleText;
	final int mIndex;
	final String mName;
	final int mOps[];
	final boolean mReorderingAllowed;
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
