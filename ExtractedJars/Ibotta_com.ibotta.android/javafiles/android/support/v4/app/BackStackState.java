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
		if(backstackrecord.mAddToBackStack)
	//*  12   24:aload_1         
	//*  13   25:getfield        #108 <Field boolean BackStackRecord.mAddToBackStack>
	//*  14   28:ifeq            287
		{
			int i = 0;
	//   15   31:iconst_0        
	//   16   32:istore_2        
			for(int j = 0; i < k; j++)
	//*  17   33:iconst_0        
	//*  18   34:istore_3        
	//*  19   35:iload_2         
	//*  20   36:iload           4
	//*  21   38:icmpge          198
			{
				BackStackRecord.Op op = (BackStackRecord.Op)backstackrecord.mOps.get(i);
	//   22   41:aload_1         
	//   23   42:getfield        #100 <Field ArrayList BackStackRecord.mOps>
	//   24   45:iload_2         
	//   25   46:invokevirtual   #112 <Method Object ArrayList.get(int)>
	//   26   49:checkcast       #114 <Class BackStackRecord$Op>
	//   27   52:astore          7
				int ai[] = mOps;
	//   28   54:aload_0         
	//   29   55:getfield        #48  <Field int[] mOps>
	//   30   58:astore          8
				int l = j + 1;
	//   31   60:iload_3         
	//   32   61:iconst_1        
	//   33   62:iadd            
	//   34   63:istore          5
				ai[j] = op.cmd;
	//   35   65:aload           8
	//   36   67:iload_3         
	//   37   68:aload           7
	//   38   70:getfield        #117 <Field int BackStackRecord$Op.cmd>
	//   39   73:iastore         
				ai = mOps;
	//   40   74:aload_0         
	//   41   75:getfield        #48  <Field int[] mOps>
	//   42   78:astore          8
				int i1 = l + 1;
	//   43   80:iload           5
	//   44   82:iconst_1        
	//   45   83:iadd            
	//   46   84:istore          6
				if(op.fragment != null)
	//*  47   86:aload           7
	//*  48   88:getfield        #121 <Field Fragment BackStackRecord$Op.fragment>
	//*  49   91:ifnull          106
					j = op.fragment.mIndex;
	//   50   94:aload           7
	//   51   96:getfield        #121 <Field Fragment BackStackRecord$Op.fragment>
	//   52   99:getfield        #124 <Field int Fragment.mIndex>
	//   53  102:istore_3        
				else
	//*  54  103:goto            108
					j = -1;
	//   55  106:iconst_m1       
	//   56  107:istore_3        
				ai[l] = j;
	//   57  108:aload           8
	//   58  110:iload           5
	//   59  112:iload_3         
	//   60  113:iastore         
				ai = mOps;
	//   61  114:aload_0         
	//   62  115:getfield        #48  <Field int[] mOps>
	//   63  118:astore          8
				j = i1 + 1;
	//   64  120:iload           6
	//   65  122:iconst_1        
	//   66  123:iadd            
	//   67  124:istore_3        
				ai[i1] = op.enterAnim;
	//   68  125:aload           8
	//   69  127:iload           6
	//   70  129:aload           7
	//   71  131:getfield        #127 <Field int BackStackRecord$Op.enterAnim>
	//   72  134:iastore         
				ai = mOps;
	//   73  135:aload_0         
	//   74  136:getfield        #48  <Field int[] mOps>
	//   75  139:astore          8
				l = j + 1;
	//   76  141:iload_3         
	//   77  142:iconst_1        
	//   78  143:iadd            
	//   79  144:istore          5
				ai[j] = op.exitAnim;
	//   80  146:aload           8
	//   81  148:iload_3         
	//   82  149:aload           7
	//   83  151:getfield        #130 <Field int BackStackRecord$Op.exitAnim>
	//   84  154:iastore         
				ai = mOps;
	//   85  155:aload_0         
	//   86  156:getfield        #48  <Field int[] mOps>
	//   87  159:astore          8
				j = l + 1;
	//   88  161:iload           5
	//   89  163:iconst_1        
	//   90  164:iadd            
	//   91  165:istore_3        
				ai[l] = op.popEnterAnim;
	//   92  166:aload           8
	//   93  168:iload           5
	//   94  170:aload           7
	//   95  172:getfield        #133 <Field int BackStackRecord$Op.popEnterAnim>
	//   96  175:iastore         
				mOps[j] = op.popExitAnim;
	//   97  176:aload_0         
	//   98  177:getfield        #48  <Field int[] mOps>
	//   99  180:iload_3         
	//  100  181:aload           7
	//  101  183:getfield        #136 <Field int BackStackRecord$Op.popExitAnim>
	//  102  186:iastore         
				i++;
	//  103  187:iload_2         
	//  104  188:iconst_1        
	//  105  189:iadd            
	//  106  190:istore_2        
			}

	//  107  191:iload_3         
	//  108  192:iconst_1        
	//  109  193:iadd            
	//  110  194:istore_3        
	//* 111  195:goto            35
			mTransition = backstackrecord.mTransition;
	//  112  198:aload_0         
	//  113  199:aload_1         
	//  114  200:getfield        #137 <Field int BackStackRecord.mTransition>
	//  115  203:putfield        #54  <Field int mTransition>
			mTransitionStyle = backstackrecord.mTransitionStyle;
	//  116  206:aload_0         
	//  117  207:aload_1         
	//  118  208:getfield        #138 <Field int BackStackRecord.mTransitionStyle>
	//  119  211:putfield        #56  <Field int mTransitionStyle>
			mName = backstackrecord.mName;
	//  120  214:aload_0         
	//  121  215:aload_1         
	//  122  216:getfield        #139 <Field String BackStackRecord.mName>
	//  123  219:putfield        #62  <Field String mName>
			mIndex = backstackrecord.mIndex;
	//  124  222:aload_0         
	//  125  223:aload_1         
	//  126  224:getfield        #140 <Field int BackStackRecord.mIndex>
	//  127  227:putfield        #64  <Field int mIndex>
			mBreadCrumbTitleRes = backstackrecord.mBreadCrumbTitleRes;
	//  128  230:aload_0         
	//  129  231:aload_1         
	//  130  232:getfield        #141 <Field int BackStackRecord.mBreadCrumbTitleRes>
	//  131  235:putfield        #66  <Field int mBreadCrumbTitleRes>
			mBreadCrumbTitleText = backstackrecord.mBreadCrumbTitleText;
	//  132  238:aload_0         
	//  133  239:aload_1         
	//  134  240:getfield        #142 <Field CharSequence BackStackRecord.mBreadCrumbTitleText>
	//  135  243:putfield        #81  <Field CharSequence mBreadCrumbTitleText>
			mBreadCrumbShortTitleRes = backstackrecord.mBreadCrumbShortTitleRes;
	//  136  246:aload_0         
	//  137  247:aload_1         
	//  138  248:getfield        #143 <Field int BackStackRecord.mBreadCrumbShortTitleRes>
	//  139  251:putfield        #83  <Field int mBreadCrumbShortTitleRes>
			mBreadCrumbShortTitleText = backstackrecord.mBreadCrumbShortTitleText;
	//  140  254:aload_0         
	//  141  255:aload_1         
	//  142  256:getfield        #144 <Field CharSequence BackStackRecord.mBreadCrumbShortTitleText>
	//  143  259:putfield        #85  <Field CharSequence mBreadCrumbShortTitleText>
			mSharedElementSourceNames = backstackrecord.mSharedElementSourceNames;
	//  144  262:aload_0         
	//  145  263:aload_1         
	//  146  264:getfield        #145 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
	//  147  267:putfield        #91  <Field ArrayList mSharedElementSourceNames>
			mSharedElementTargetNames = backstackrecord.mSharedElementTargetNames;
	//  148  270:aload_0         
	//  149  271:aload_1         
	//  150  272:getfield        #146 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
	//  151  275:putfield        #93  <Field ArrayList mSharedElementTargetNames>
			mReorderingAllowed = backstackrecord.mReorderingAllowed;
	//  152  278:aload_0         
	//  153  279:aload_1         
	//  154  280:getfield        #147 <Field boolean BackStackRecord.mReorderingAllowed>
	//  155  283:putfield        #95  <Field boolean mReorderingAllowed>
			return;
	//  156  286:return          
		} else
		{
			throw new IllegalStateException("Not on back stack");
	//  157  287:new             #149 <Class IllegalStateException>
	//  158  290:dup             
	//  159  291:ldc1            #151 <String "Not on back stack">
	//  160  293:invokespecial   #154 <Method void IllegalStateException(String)>
	//  161  296:athrow          
		}
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
	//*  13   20:icmpge          297
		{
			BackStackRecord.Op op = new BackStackRecord.Op();
	//   14   23:new             #114 <Class BackStackRecord$Op>
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
	//   29   49:putfield        #117 <Field int BackStackRecord$Op.cmd>
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
	//   86  164:checkcast       #123 <Class Fragment>
	//   87  167:putfield        #121 <Field Fragment BackStackRecord$Op.fragment>
			else
	//*  88  170:goto            179
				op.fragment = null;
	//   89  173:aload           6
	//   90  175:aconst_null     
	//   91  176:putfield        #121 <Field Fragment BackStackRecord$Op.fragment>
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
	//  103  196:putfield        #127 <Field int BackStackRecord$Op.enterAnim>
			j = k + 1;
	//  104  199:iload           4
	//  105  201:iconst_1        
	//  106  202:iadd            
	//  107  203:istore_3        
			op.exitAnim = stringbuilder[k];
	//  108  204:aload           6
	//  109  206:aload           7
	//  110  208:iload           4
	//  111  210:iaload          
	//  112  211:putfield        #130 <Field int BackStackRecord$Op.exitAnim>
			k = j + 1;
	//  113  214:iload_3         
	//  114  215:iconst_1        
	//  115  216:iadd            
	//  116  217:istore          4
			op.popEnterAnim = stringbuilder[j];
	//  117  219:aload           6
	//  118  221:aload           7
	//  119  223:iload_3         
	//  120  224:iaload          
	//  121  225:putfield        #133 <Field int BackStackRecord$Op.popEnterAnim>
			op.popExitAnim = stringbuilder[k];
	//  122  228:aload           6
	//  123  230:aload           7
	//  124  232:iload           4
	//  125  234:iaload          
	//  126  235:putfield        #136 <Field int BackStackRecord$Op.popExitAnim>
			backstackrecord.mEnterAnim = op.enterAnim;
	//  127  238:aload           5
	//  128  240:aload           6
	//  129  242:getfield        #127 <Field int BackStackRecord$Op.enterAnim>
	//  130  245:putfield        #206 <Field int BackStackRecord.mEnterAnim>
			backstackrecord.mExitAnim = op.exitAnim;
	//  131  248:aload           5
	//  132  250:aload           6
	//  133  252:getfield        #130 <Field int BackStackRecord$Op.exitAnim>
	//  134  255:putfield        #209 <Field int BackStackRecord.mExitAnim>
			backstackrecord.mPopEnterAnim = op.popEnterAnim;
	//  135  258:aload           5
	//  136  260:aload           6
	//  137  262:getfield        #133 <Field int BackStackRecord$Op.popEnterAnim>
	//  138  265:putfield        #212 <Field int BackStackRecord.mPopEnterAnim>
			backstackrecord.mPopExitAnim = op.popExitAnim;
	//  139  268:aload           5
	//  140  270:aload           6
	//  141  272:getfield        #136 <Field int BackStackRecord$Op.popExitAnim>
	//  142  275:putfield        #215 <Field int BackStackRecord.mPopExitAnim>
			backstackrecord.addOp(op);
	//  143  278:aload           5
	//  144  280:aload           6
	//  145  282:invokevirtual   #219 <Method void BackStackRecord.addOp(BackStackRecord$Op)>
			i++;
	//  146  285:iload_2         
	//  147  286:iconst_1        
	//  148  287:iadd            
	//  149  288:istore_2        
		}

	//  150  289:iload           4
	//  151  291:iconst_1        
	//  152  292:iadd            
	//  153  293:istore_3        
	//* 154  294:goto            14
		backstackrecord.mTransition = mTransition;
	//  155  297:aload           5
	//  156  299:aload_0         
	//  157  300:getfield        #54  <Field int mTransition>
	//  158  303:putfield        #137 <Field int BackStackRecord.mTransition>
		backstackrecord.mTransitionStyle = mTransitionStyle;
	//  159  306:aload           5
	//  160  308:aload_0         
	//  161  309:getfield        #56  <Field int mTransitionStyle>
	//  162  312:putfield        #138 <Field int BackStackRecord.mTransitionStyle>
		backstackrecord.mName = mName;
	//  163  315:aload           5
	//  164  317:aload_0         
	//  165  318:getfield        #62  <Field String mName>
	//  166  321:putfield        #139 <Field String BackStackRecord.mName>
		backstackrecord.mIndex = mIndex;
	//  167  324:aload           5
	//  168  326:aload_0         
	//  169  327:getfield        #64  <Field int mIndex>
	//  170  330:putfield        #140 <Field int BackStackRecord.mIndex>
		backstackrecord.mAddToBackStack = true;
	//  171  333:aload           5
	//  172  335:iconst_1        
	//  173  336:putfield        #108 <Field boolean BackStackRecord.mAddToBackStack>
		backstackrecord.mBreadCrumbTitleRes = mBreadCrumbTitleRes;
	//  174  339:aload           5
	//  175  341:aload_0         
	//  176  342:getfield        #66  <Field int mBreadCrumbTitleRes>
	//  177  345:putfield        #141 <Field int BackStackRecord.mBreadCrumbTitleRes>
		backstackrecord.mBreadCrumbTitleText = mBreadCrumbTitleText;
	//  178  348:aload           5
	//  179  350:aload_0         
	//  180  351:getfield        #81  <Field CharSequence mBreadCrumbTitleText>
	//  181  354:putfield        #142 <Field CharSequence BackStackRecord.mBreadCrumbTitleText>
		backstackrecord.mBreadCrumbShortTitleRes = mBreadCrumbShortTitleRes;
	//  182  357:aload           5
	//  183  359:aload_0         
	//  184  360:getfield        #83  <Field int mBreadCrumbShortTitleRes>
	//  185  363:putfield        #143 <Field int BackStackRecord.mBreadCrumbShortTitleRes>
		backstackrecord.mBreadCrumbShortTitleText = mBreadCrumbShortTitleText;
	//  186  366:aload           5
	//  187  368:aload_0         
	//  188  369:getfield        #85  <Field CharSequence mBreadCrumbShortTitleText>
	//  189  372:putfield        #144 <Field CharSequence BackStackRecord.mBreadCrumbShortTitleText>
		backstackrecord.mSharedElementSourceNames = mSharedElementSourceNames;
	//  190  375:aload           5
	//  191  377:aload_0         
	//  192  378:getfield        #91  <Field ArrayList mSharedElementSourceNames>
	//  193  381:putfield        #145 <Field ArrayList BackStackRecord.mSharedElementSourceNames>
		backstackrecord.mSharedElementTargetNames = mSharedElementTargetNames;
	//  194  384:aload           5
	//  195  386:aload_0         
	//  196  387:getfield        #93  <Field ArrayList mSharedElementTargetNames>
	//  197  390:putfield        #146 <Field ArrayList BackStackRecord.mSharedElementTargetNames>
		backstackrecord.mReorderingAllowed = mReorderingAllowed;
	//  198  393:aload           5
	//  199  395:aload_0         
	//  200  396:getfield        #95  <Field boolean mReorderingAllowed>
	//  201  399:putfield        #147 <Field boolean BackStackRecord.mReorderingAllowed>
		backstackrecord.bumpBackStackNesting(1);
	//  202  402:aload           5
	//  203  404:iconst_1        
	//  204  405:invokevirtual   #223 <Method void BackStackRecord.bumpBackStackNesting(int)>
		return backstackrecord;
	//  205  408:aload           5
	//  206  410:areturn         
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
