// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.jobdispatcher;

import android.os.*;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

// Referenced classes of package com.firebase.jobdispatcher:
//			GooglePlayJobCallback

final class GooglePlayCallbackExtractor
{

	GooglePlayCallbackExtractor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	private static void checkCondition(boolean flag)
	{
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            5
			return;
	//    2    4:return          
		else
			throw new IllegalStateException();
	//    3    5:new             #37  <Class IllegalStateException>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void IllegalStateException()>
	//    6   12:athrow          
	}

	private static Pair extractWrappedBinderFromParcel(Bundle bundle)
	{
		Parcel parcel;
		Bundle bundle1;
		bundle1 = new Bundle();
	//    0    0:new             #46  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void Bundle()>
	//    3    7:astore          5
		parcel = toParcel(bundle);
	//    4    9:aload_0         
	//    5   10:invokestatic    #51  <Method Parcel toParcel(Bundle)>
	//    6   13:astore          4
		if(parcel.readInt() > 0)
			break MISSING_BLOCK_LABEL_38;
	//    7   15:aload           4
	//    8   17:invokevirtual   #57  <Method int Parcel.readInt()>
	//    9   20:ifgt            38
		Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
	//   10   23:ldc1            #23  <String "FJD.GooglePlayReceiver">
	//   11   25:ldc1            #17  <String "No callback received, terminating">
	//   12   27:invokestatic    #63  <Method int Log.w(String, String)>
	//   13   30:pop             
		parcel.recycle();
	//   14   31:aload           4
	//   15   33:invokevirtual   #66  <Method void Parcel.recycle()>
		return null;
	//   16   36:aconst_null     
	//   17   37:areturn         
		if(parcel.readInt() == 0x4c444e42)
			break MISSING_BLOCK_LABEL_63;
	//   18   38:aload           4
	//   19   40:invokevirtual   #57  <Method int Parcel.readInt()>
	//   20   43:ldc1            #11  <Int 0x4c444e42>
	//   21   45:icmpeq          63
		Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
	//   22   48:ldc1            #23  <String "FJD.GooglePlayReceiver">
	//   23   50:ldc1            #17  <String "No callback received, terminating">
	//   24   52:invokestatic    #63  <Method int Log.w(String, String)>
	//   25   55:pop             
		parcel.recycle();
	//   26   56:aload           4
	//   27   58:invokevirtual   #66  <Method void Parcel.recycle()>
		return null;
	//   28   61:aconst_null     
	//   29   62:areturn         
		int j = parcel.readInt();
	//   30   63:aload           4
	//   31   65:invokevirtual   #57  <Method int Parcel.readInt()>
	//   32   68:istore_2        
		int i;
		i = 0;
	//   33   69:iconst_0        
	//   34   70:istore_1        
		bundle = null;
	//   35   71:aconst_null     
	//   36   72:astore_0        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_346;
	//   37   73:iload_1         
	//   38   74:iload_2         
	//   39   75:icmpge          346
		String s = readKey(parcel);
	//   40   78:aload           4
	//   41   80:invokestatic    #70  <Method String readKey(Parcel)>
	//   42   83:astore          6
		Object obj;
		if(s == null)
	//*  43   85:aload           6
	//*  44   87:ifnonnull       95
		{
			obj = ((Object) (bundle));
	//   45   90:aload_0         
	//   46   91:astore_3        
			break MISSING_BLOCK_LABEL_387;
	//   47   92:goto            387
		}
		if(bundle != null)
			break MISSING_BLOCK_LABEL_180;
	//   48   95:aload_0         
	//   49   96:ifnonnull       180
		if(!"callback".equals(((Object) (s))))
	//*  50   99:ldc1            #8   <String "callback">
	//*  51  101:aload           6
	//*  52  103:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  53  106:ifne            112
			break MISSING_BLOCK_LABEL_180;
	//   54  109:goto            180
		if(parcel.readInt() == 4)
			break MISSING_BLOCK_LABEL_136;
	//   55  112:aload           4
	//   56  114:invokevirtual   #57  <Method int Parcel.readInt()>
	//   57  117:iconst_4        
	//   58  118:icmpeq          136
		Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
	//   59  121:ldc1            #23  <String "FJD.GooglePlayReceiver">
	//   60  123:ldc1            #14  <String "Bad callback received, terminating">
	//   61  125:invokestatic    #63  <Method int Log.w(String, String)>
	//   62  128:pop             
		parcel.recycle();
	//   63  129:aload           4
	//   64  131:invokevirtual   #66  <Method void Parcel.recycle()>
		return null;
	//   65  134:aconst_null     
	//   66  135:areturn         
		if("com.google.android.gms.gcm.PendingCallback".equals(((Object) (parcel.readString()))))
			break MISSING_BLOCK_LABEL_164;
	//   67  136:ldc1            #20  <String "com.google.android.gms.gcm.PendingCallback">
	//   68  138:aload           4
	//   69  140:invokevirtual   #80  <Method String Parcel.readString()>
	//   70  143:invokevirtual   #76  <Method boolean String.equals(Object)>
	//   71  146:ifne            164
		Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
	//   72  149:ldc1            #23  <String "FJD.GooglePlayReceiver">
	//   73  151:ldc1            #14  <String "Bad callback received, terminating">
	//   74  153:invokestatic    #63  <Method int Log.w(String, String)>
	//   75  156:pop             
		parcel.recycle();
	//   76  157:aload           4
	//   77  159:invokevirtual   #66  <Method void Parcel.recycle()>
		return null;
	//   78  162:aconst_null     
	//   79  163:areturn         
		obj = ((Object) (new GooglePlayJobCallback(parcel.readStrongBinder())));
	//   80  164:new             #82  <Class GooglePlayJobCallback>
	//   81  167:dup             
	//   82  168:aload           4
	//   83  170:invokevirtual   #86  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   84  173:invokespecial   #89  <Method void GooglePlayJobCallback(android.os.IBinder)>
	//   85  176:astore_3        
		break MISSING_BLOCK_LABEL_387;
	//   86  177:goto            387
		Object obj1;
		obj1 = parcel.readValue(((ClassLoader) (null)));
	//   87  180:aload           4
	//   88  182:aconst_null     
	//   89  183:invokevirtual   #93  <Method Object Parcel.readValue(ClassLoader)>
	//   90  186:astore          7
		if(!(obj1 instanceof String))
			break MISSING_BLOCK_LABEL_213;
	//   91  188:aload           7
	//   92  190:instanceof      #72  <Class String>
	//   93  193:ifeq            213
		bundle1.putString(s, (String)obj1);
	//   94  196:aload           5
	//   95  198:aload           6
	//   96  200:aload           7
	//   97  202:checkcast       #72  <Class String>
	//   98  205:invokevirtual   #97  <Method void Bundle.putString(String, String)>
		obj = ((Object) (bundle));
	//   99  208:aload_0         
	//  100  209:astore_3        
		break MISSING_BLOCK_LABEL_387;
	//  101  210:goto            387
		if(!(obj1 instanceof Boolean))
			break MISSING_BLOCK_LABEL_241;
	//  102  213:aload           7
	//  103  215:instanceof      #99  <Class Boolean>
	//  104  218:ifeq            241
		bundle1.putBoolean(s, ((Boolean)obj1).booleanValue());
	//  105  221:aload           5
	//  106  223:aload           6
	//  107  225:aload           7
	//  108  227:checkcast       #99  <Class Boolean>
	//  109  230:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//  110  233:invokevirtual   #107 <Method void Bundle.putBoolean(String, boolean)>
		obj = ((Object) (bundle));
	//  111  236:aload_0         
	//  112  237:astore_3        
		break MISSING_BLOCK_LABEL_387;
	//  113  238:goto            387
		if(!(obj1 instanceof Integer))
			break MISSING_BLOCK_LABEL_269;
	//  114  241:aload           7
	//  115  243:instanceof      #109 <Class Integer>
	//  116  246:ifeq            269
		bundle1.putInt(s, ((Integer)obj1).intValue());
	//  117  249:aload           5
	//  118  251:aload           6
	//  119  253:aload           7
	//  120  255:checkcast       #109 <Class Integer>
	//  121  258:invokevirtual   #112 <Method int Integer.intValue()>
	//  122  261:invokevirtual   #116 <Method void Bundle.putInt(String, int)>
		obj = ((Object) (bundle));
	//  123  264:aload_0         
	//  124  265:astore_3        
		break MISSING_BLOCK_LABEL_387;
	//  125  266:goto            387
		if(!(obj1 instanceof ArrayList))
			break MISSING_BLOCK_LABEL_294;
	//  126  269:aload           7
	//  127  271:instanceof      #118 <Class ArrayList>
	//  128  274:ifeq            294
		bundle1.putParcelableArrayList(s, (ArrayList)obj1);
	//  129  277:aload           5
	//  130  279:aload           6
	//  131  281:aload           7
	//  132  283:checkcast       #118 <Class ArrayList>
	//  133  286:invokevirtual   #122 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		obj = ((Object) (bundle));
	//  134  289:aload_0         
	//  135  290:astore_3        
		break MISSING_BLOCK_LABEL_387;
	//  136  291:goto            387
		if(!(obj1 instanceof Bundle))
			break MISSING_BLOCK_LABEL_319;
	//  137  294:aload           7
	//  138  296:instanceof      #46  <Class Bundle>
	//  139  299:ifeq            319
		bundle1.putBundle(s, (Bundle)obj1);
	//  140  302:aload           5
	//  141  304:aload           6
	//  142  306:aload           7
	//  143  308:checkcast       #46  <Class Bundle>
	//  144  311:invokevirtual   #126 <Method void Bundle.putBundle(String, Bundle)>
		obj = ((Object) (bundle));
	//  145  314:aload_0         
	//  146  315:astore_3        
		break MISSING_BLOCK_LABEL_387;
	//  147  316:goto            387
		obj = ((Object) (bundle));
	//  148  319:aload_0         
	//  149  320:astore_3        
		if(!(obj1 instanceof Parcelable))
			break MISSING_BLOCK_LABEL_387;
	//  150  321:aload           7
	//  151  323:instanceof      #128 <Class Parcelable>
	//  152  326:ifeq            387
		bundle1.putParcelable(s, (Parcelable)obj1);
	//  153  329:aload           5
	//  154  331:aload           6
	//  155  333:aload           7
	//  156  335:checkcast       #128 <Class Parcelable>
	//  157  338:invokevirtual   #132 <Method void Bundle.putParcelable(String, Parcelable)>
		obj = ((Object) (bundle));
	//  158  341:aload_0         
	//  159  342:astore_3        
		break MISSING_BLOCK_LABEL_387;
	//  160  343:goto            387
		if(bundle != null)
			break MISSING_BLOCK_LABEL_365;
	//  161  346:aload_0         
	//  162  347:ifnonnull       365
		Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
	//  163  350:ldc1            #23  <String "FJD.GooglePlayReceiver">
	//  164  352:ldc1            #17  <String "No callback received, terminating">
	//  165  354:invokestatic    #63  <Method int Log.w(String, String)>
	//  166  357:pop             
		parcel.recycle();
	//  167  358:aload           4
	//  168  360:invokevirtual   #66  <Method void Parcel.recycle()>
		return null;
	//  169  363:aconst_null     
	//  170  364:areturn         
		bundle = ((Bundle) (Pair.create(((Object) (bundle)), ((Object) (bundle1)))));
	//  171  365:aload_0         
	//  172  366:aload           5
	//  173  368:invokestatic    #138 <Method Pair Pair.create(Object, Object)>
	//  174  371:astore_0        
		parcel.recycle();
	//  175  372:aload           4
	//  176  374:invokevirtual   #66  <Method void Parcel.recycle()>
		return ((Pair) (bundle));
	//  177  377:aload_0         
	//  178  378:areturn         
		bundle;
	//  179  379:astore_0        
		parcel.recycle();
	//  180  380:aload           4
	//  181  382:invokevirtual   #66  <Method void Parcel.recycle()>
		throw bundle;
	//  182  385:aload_0         
	//  183  386:athrow          
		i++;
	//  184  387:iload_1         
	//  185  388:iconst_1        
	//  186  389:iadd            
	//  187  390:istore_1        
		bundle = ((Bundle) (obj));
	//  188  391:aload_3         
	//  189  392:astore_0        
		if(true) goto _L2; else goto _L1
	//  190  393:goto            73
_L1:
	}

	private static String readKey(Parcel parcel)
	{
		if(shouldReadKeysAsStrings())
	//*   0    0:invokestatic    #144 <Method boolean shouldReadKeysAsStrings()>
	//*   1    3:ifeq            11
			return parcel.readString();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #80  <Method String Parcel.readString()>
	//    4   10:areturn         
		parcel = ((Parcel) (parcel.readValue(((ClassLoader) (null)))));
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #93  <Method Object Parcel.readValue(ClassLoader)>
	//    8   16:astore_0        
		if(!(parcel instanceof String))
	//*   9   17:aload_0         
	//*  10   18:instanceof      #72  <Class String>
	//*  11   21:ifne            34
		{
			Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
	//   12   24:ldc1            #23  <String "FJD.GooglePlayReceiver">
	//   13   26:ldc1            #14  <String "Bad callback received, terminating">
	//   14   28:invokestatic    #63  <Method int Log.w(String, String)>
	//   15   31:pop             
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
		} else
		{
			return (String)parcel;
	//   18   34:aload_0         
	//   19   35:checkcast       #72  <Class String>
	//   20   38:areturn         
		}
	}

	private static boolean shouldReadKeysAsStrings()
	{
		com/firebase/jobdispatcher/GooglePlayCallbackExtractor;
	//    0    0:ldc1            #2   <Class GooglePlayCallbackExtractor>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(shouldReadKeysAsStringsCached != null) goto _L2; else goto _L1
	//    2    3:getstatic       #148 <Field Boolean shouldReadKeysAsStringsCached>
	//    3    6:ifnonnull       127
_L1:
		Object obj;
		obj = ((Object) (new Bundle()));
	//    4    9:new             #46  <Class Bundle>
	//    5   12:dup             
	//    6   13:invokespecial   #47  <Method void Bundle()>
	//    7   16:astore_3        
		((Bundle) (obj)).putString("key", "value");
	//    8   17:aload_3         
	//    9   18:ldc1            #150 <String "key">
	//   10   20:ldc1            #151 <String "value">
	//   11   22:invokevirtual   #97  <Method void Bundle.putString(String, String)>
		obj = ((Object) (toParcel(((Bundle) (obj)))));
	//   12   25:aload_3         
	//   13   26:invokestatic    #51  <Method Parcel toParcel(Bundle)>
	//   14   29:astore_3        
		int i = ((Parcel) (obj)).readInt();
	//   15   30:aload_3         
	//   16   31:invokevirtual   #57  <Method int Parcel.readInt()>
	//   17   34:istore_0        
		boolean flag;
		boolean flag1 = false;
	//   18   35:iconst_0        
	//   19   36:istore_2        
		Exception exception;
		Object obj1;
		if(i > 0)
	//*  20   37:iload_0         
	//*  21   38:ifle            150
			flag = true;
	//   22   41:iconst_1        
	//   23   42:istore_1        
		else
	//*  24   43:goto            46
	//*  25   46:iload_1         
	//*  26   47:invokestatic    #153 <Method void checkCondition(boolean)>
	//*  27   50:aload_3         
	//*  28   51:invokevirtual   #57  <Method int Parcel.readInt()>
	//*  29   54:ldc1            #11  <Int 0x4c444e42>
	//*  30   56:icmpne          155
	//*  31   59:iconst_1        
	//*  32   60:istore_1        
	//*  33   61:goto            64
	//*  34   64:iload_1         
	//*  35   65:invokestatic    #153 <Method void checkCondition(boolean)>
	//*  36   68:iload_2         
	//*  37   69:istore_1        
	//*  38   70:aload_3         
	//*  39   71:invokevirtual   #57  <Method int Parcel.readInt()>
	//*  40   74:iconst_1        
	//*  41   75:icmpne          80
	//*  42   78:iconst_1        
	//*  43   79:istore_1        
	//*  44   80:iload_1         
	//*  45   81:invokestatic    #153 <Method void checkCondition(boolean)>
	//*  46   84:ldc1            #150 <String "key">
	//*  47   86:aload_3         
	//*  48   87:invokevirtual   #80  <Method String Parcel.readString()>
	//*  49   90:invokevirtual   #76  <Method boolean String.equals(Object)>
	//*  50   93:invokestatic    #157 <Method Boolean Boolean.valueOf(boolean)>
	//*  51   96:putstatic       #148 <Field Boolean shouldReadKeysAsStringsCached>
	//*  52   99:aload_3         
	//*  53  100:invokevirtual   #66  <Method void Parcel.recycle()>
	//*  54  103:goto            127
	//*  55  106:astore          4
	//*  56  108:goto            120
	//*  57  111:getstatic       #160 <Field Boolean Boolean.FALSE>
	//*  58  114:putstatic       #148 <Field Boolean shouldReadKeysAsStringsCached>
	//*  59  117:goto            99
	//*  60  120:aload_3         
	//*  61  121:invokevirtual   #66  <Method void Parcel.recycle()>
	//*  62  124:aload           4
	//*  63  126:athrow          
	//*  64  127:getstatic       #148 <Field Boolean shouldReadKeysAsStringsCached>
	//*  65  130:invokevirtual   #103 <Method boolean Boolean.booleanValue()>
	//*  66  133:istore_1        
	//*  67  134:ldc1            #2   <Class GooglePlayCallbackExtractor>
	//*  68  136:monitorexit     
	//*  69  137:iload_1         
	//*  70  138:ireturn         
	//*  71  139:astore_3        
	//*  72  140:ldc1            #2   <Class GooglePlayCallbackExtractor>
	//*  73  142:monitorexit     
	//*  74  143:aload_3         
	//*  75  144:athrow          
	//*  76  145:astore          4
	//*  77  147:goto            111
			flag = false;
	//   78  150:iconst_0        
	//   79  151:istore_1        
		checkCondition(flag);
		if(((Parcel) (obj)).readInt() == 0x4c444e42)
			flag = true;
		else
	//*  80  152:goto            46
			flag = false;
	//   81  155:iconst_0        
	//   82  156:istore_1        
		checkCondition(flag);
		flag = flag1;
		if(((Parcel) (obj)).readInt() == 1)
			flag = true;
		checkCondition(flag);
		shouldReadKeysAsStringsCached = Boolean.valueOf("key".equals(((Object) (((Parcel) (obj)).readString()))));
_L4:
		((Parcel) (obj)).recycle();
		  goto _L2
		obj1;
		  goto _L3
_L5:
		shouldReadKeysAsStringsCached = Boolean.FALSE;
		  goto _L4
_L3:
		((Parcel) (obj)).recycle();
		throw obj1;
_L2:
		flag = shouldReadKeysAsStringsCached.booleanValue();
		com/firebase/jobdispatcher/GooglePlayCallbackExtractor;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		throw exception;
		obj1;
		  goto _L5
	//*  83  157:goto            64
	}

	private static Parcel toParcel(Bundle bundle)
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #164 <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		bundle.writeToParcel(parcel, 0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #168 <Method void Bundle.writeToParcel(Parcel, int)>
		parcel.setDataPosition(0);
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #172 <Method void Parcel.setDataPosition(int)>
		return parcel;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public Pair extractCallback(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			Log.e("FJD.GooglePlayReceiver", "No callback received, terminating");
	//    2    4:ldc1            #23  <String "FJD.GooglePlayReceiver">
	//    3    6:ldc1            #17  <String "No callback received, terminating">
	//    4    8:invokestatic    #176 <Method int Log.e(String, String)>
	//    5   11:pop             
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		} else
		{
			return extractWrappedBinderFromParcel(bundle);
	//    8   14:aload_1         
	//    9   15:invokestatic    #178 <Method Pair extractWrappedBinderFromParcel(Bundle)>
	//   10   18:areturn         
		}
	}

	private static final String BUNDLE_KEY_CALLBACK = "callback";
	private static final int BUNDLE_MAGIC = 0x4c444e42;
	private static final String ERROR_INVALID_CALLBACK = "Bad callback received, terminating";
	private static final String ERROR_NULL_CALLBACK = "No callback received, terminating";
	private static final String PENDING_CALLBACK_CLASS = "com.google.android.gms.gcm.PendingCallback";
	private static final String TAG = "FJD.GooglePlayReceiver";
	private static final int VAL_PARCELABLE = 4;
	private static Boolean shouldReadKeysAsStringsCached;

	static 
	{
	//    0    0:return          
	}
}
