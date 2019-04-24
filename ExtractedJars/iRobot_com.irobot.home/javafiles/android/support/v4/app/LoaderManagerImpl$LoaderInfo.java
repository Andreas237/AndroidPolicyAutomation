// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.b;
import android.support.v4.f.d;
import android.support.v4.f.n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//			LoaderManagerImpl, FragmentHostCallback, FragmentManagerImpl

final class LoaderManagerImpl$LoaderInfo
	implements android.support.v4.content.b.a, android.support.v4.content.b.b
{

	void callOnLoadFinished(b b1, Object obj)
	{
		String s;
		if(mCallbacks == null)
			break MISSING_BLOCK_LABEL_176;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//    2    4:ifnull          176
		s = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
		if(mHost != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #41  <Field LoaderManagerImpl this$0>
	//*   7   13:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*   8   16:ifnull          48
		{
			s = mHost.mFragmentManager.mNoTransactionsBecause;
	//    9   19:aload_0         
	//   10   20:getfield        #41  <Field LoaderManagerImpl this$0>
	//   11   23:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   12   26:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   13   29:getfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
	//   14   32:astore_3        
			mHost.mFragmentManager.mNoTransactionsBecause = "onLoadFinished";
	//   15   33:aload_0         
	//   16   34:getfield        #41  <Field LoaderManagerImpl this$0>
	//   17   37:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   18   40:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   19   43:ldc1            #73  <String "onLoadFinished">
	//   20   45:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
		}
		if(LoaderManagerImpl.DEBUG)
	//*  21   48:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  22   51:ifeq            108
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   54:new             #78  <Class StringBuilder>
	//   24   57:dup             
	//   25   58:invokespecial   #79  <Method void StringBuilder()>
	//   26   61:astore          4
			stringbuilder.append("  onLoadFinished in ");
	//   27   63:aload           4
	//   28   65:ldc1            #81  <String "  onLoadFinished in ">
	//   29   67:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   30   70:pop             
			stringbuilder.append(((Object) (b1)));
	//   31   71:aload           4
	//   32   73:aload_1         
	//   33   74:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   34   77:pop             
			stringbuilder.append(": ");
	//   35   78:aload           4
	//   36   80:ldc1            #90  <String ": ">
	//   37   82:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   38   85:pop             
			stringbuilder.append(b1.a(obj));
	//   39   86:aload           4
	//   40   88:aload_1         
	//   41   89:aload_2         
	//   42   90:invokevirtual   #96  <Method String b.a(Object)>
	//   43   93:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   44   96:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   45   97:ldc1            #98  <String "LoaderManager">
	//   46   99:aload           4
	//   47  101:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   48  104:invokestatic    #108 <Method int Log.v(String, String)>
	//   49  107:pop             
		}
		mCallbacks.onLoadFinished(b1, obj);
	//   50  108:aload_0         
	//   51  109:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   52  112:aload_1         
	//   53  113:aload_2         
	//   54  114:invokeinterface #112 <Method void LoaderManager$LoaderCallbacks.onLoadFinished(b, Object)>
		if(mHost != null)
	//*  55  119:aload_0         
	//*  56  120:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  57  123:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  58  126:ifnull          143
			mHost.mFragmentManager.mNoTransactionsBecause = s;
	//   59  129:aload_0         
	//   60  130:getfield        #41  <Field LoaderManagerImpl this$0>
	//   61  133:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   62  136:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   63  139:aload_3         
	//   64  140:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
		mDeliveredData = true;
	//   65  143:aload_0         
	//   66  144:iconst_1        
	//   67  145:putfield        #114 <Field boolean mDeliveredData>
		return;
	//   68  148:return          
		b1;
	//   69  149:astore_1        
		if(mHost != null)
	//*  70  150:aload_0         
	//*  71  151:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  72  154:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  73  157:ifnull          174
			mHost.mFragmentManager.mNoTransactionsBecause = s;
	//   74  160:aload_0         
	//   75  161:getfield        #41  <Field LoaderManagerImpl this$0>
	//   76  164:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   77  167:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   78  170:aload_3         
	//   79  171:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
		throw b1;
	//   80  174:aload_1         
	//   81  175:athrow          
	//   82  176:return          
	}

	boolean cancel()
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            37
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #78  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #79  <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("  Canceling: ");
	//    6   14:aload_2         
	//    7   15:ldc1            #119 <String "  Canceling: ">
	//    8   17:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (this)));
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   27:ldc1            #98  <String "LoaderManager">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #108 <Method int Log.v(String, String)>
	//   18   36:pop             
		}
		if(mStarted && mLoader != null && mListenerRegistered)
	//*  19   37:aload_0         
	//*  20   38:getfield        #121 <Field boolean mStarted>
	//*  21   41:ifeq            80
	//*  22   44:aload_0         
	//*  23   45:getfield        #123 <Field b mLoader>
	//*  24   48:ifnull          80
	//*  25   51:aload_0         
	//*  26   52:getfield        #125 <Field boolean mListenerRegistered>
	//*  27   55:ifeq            80
		{
			boolean flag = mLoader.c();
	//   28   58:aload_0         
	//   29   59:getfield        #123 <Field b mLoader>
	//   30   62:invokevirtual   #128 <Method boolean b.c()>
	//   31   65:istore_1        
			if(!flag)
	//*  32   66:iload_1         
	//*  33   67:ifne            78
				onLoadCanceled(mLoader);
	//   34   70:aload_0         
	//   35   71:aload_0         
	//   36   72:getfield        #123 <Field b mLoader>
	//   37   75:invokevirtual   #132 <Method void onLoadCanceled(b)>
			return flag;
	//   38   78:iload_1         
	//   39   79:ireturn         
		} else
		{
			return false;
	//   40   80:iconst_0        
	//   41   81:ireturn         
		}
	}

	void destroy()
	{
		String s;
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            37
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #78  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #79  <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("  Destroying: ");
	//    6   14:aload_2         
	//    7   15:ldc1            #135 <String "  Destroying: ">
	//    8   17:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (this)));
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   27:ldc1            #98  <String "LoaderManager">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #108 <Method int Log.v(String, String)>
	//   18   36:pop             
		}
		mDestroyed = true;
	//   19   37:aload_0         
	//   20   38:iconst_1        
	//   21   39:putfield        #137 <Field boolean mDestroyed>
		boolean flag = mDeliveredData;
	//   22   42:aload_0         
	//   23   43:getfield        #114 <Field boolean mDeliveredData>
	//   24   46:istore_1        
		mDeliveredData = false;
	//   25   47:aload_0         
	//   26   48:iconst_0        
	//   27   49:putfield        #114 <Field boolean mDeliveredData>
		if(mCallbacks == null || mLoader == null || !mHaveData || !flag)
			break MISSING_BLOCK_LABEL_225;
	//   28   52:aload_0         
	//   29   53:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   30   56:ifnull          225
	//   31   59:aload_0         
	//   32   60:getfield        #123 <Field b mLoader>
	//   33   63:ifnull          225
	//   34   66:aload_0         
	//   35   67:getfield        #139 <Field boolean mHaveData>
	//   36   70:ifeq            225
	//   37   73:iload_1         
	//   38   74:ifeq            225
		if(LoaderManagerImpl.DEBUG)
	//*  39   77:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  40   80:ifeq            114
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   41   83:new             #78  <Class StringBuilder>
	//   42   86:dup             
	//   43   87:invokespecial   #79  <Method void StringBuilder()>
	//   44   90:astore_2        
			stringbuilder1.append("  Resetting: ");
	//   45   91:aload_2         
	//   46   92:ldc1            #141 <String "  Resetting: ">
	//   47   94:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   48   97:pop             
			stringbuilder1.append(((Object) (this)));
	//   49   98:aload_2         
	//   50   99:aload_0         
	//   51  100:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   52  103:pop             
			Log.v("LoaderManager", stringbuilder1.toString());
	//   53  104:ldc1            #98  <String "LoaderManager">
	//   54  106:aload_2         
	//   55  107:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   56  110:invokestatic    #108 <Method int Log.v(String, String)>
	//   57  113:pop             
		}
		if(mHost != null)
	//*  58  114:aload_0         
	//*  59  115:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  60  118:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  61  121:ifnull          156
		{
			s = mHost.mFragmentManager.mNoTransactionsBecause;
	//   62  124:aload_0         
	//   63  125:getfield        #41  <Field LoaderManagerImpl this$0>
	//   64  128:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   65  131:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   66  134:getfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
	//   67  137:astore_2        
			mHost.mFragmentManager.mNoTransactionsBecause = "onLoaderReset";
	//   68  138:aload_0         
	//   69  139:getfield        #41  <Field LoaderManagerImpl this$0>
	//   70  142:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   71  145:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   72  148:ldc1            #143 <String "onLoaderReset">
	//   73  150:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
		} else
	//*  74  153:goto            158
		{
			s = null;
	//   75  156:aconst_null     
	//   76  157:astore_2        
		}
		mCallbacks.onLoaderReset(mLoader);
	//   77  158:aload_0         
	//   78  159:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   79  162:aload_0         
	//   80  163:getfield        #123 <Field b mLoader>
	//   81  166:invokeinterface #145 <Method void LoaderManager$LoaderCallbacks.onLoaderReset(b)>
		if(mHost != null)
	//*  82  171:aload_0         
	//*  83  172:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  84  175:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  85  178:ifnull          225
			mHost.mFragmentManager.mNoTransactionsBecause = s;
	//   86  181:aload_0         
	//   87  182:getfield        #41  <Field LoaderManagerImpl this$0>
	//   88  185:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   89  188:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   90  191:aload_2         
	//   91  192:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
		break MISSING_BLOCK_LABEL_225;
	//   92  195:goto            225
		Exception exception;
		exception;
	//   93  198:astore_3        
		if(mHost != null)
	//*  94  199:aload_0         
	//*  95  200:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  96  203:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  97  206:ifnull          223
			mHost.mFragmentManager.mNoTransactionsBecause = s;
	//   98  209:aload_0         
	//   99  210:getfield        #41  <Field LoaderManagerImpl this$0>
	//  100  213:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//  101  216:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//  102  219:aload_2         
	//  103  220:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
		throw exception;
	//  104  223:aload_3         
	//  105  224:athrow          
		mCallbacks = null;
	//  106  225:aload_0         
	//  107  226:aconst_null     
	//  108  227:putfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
		mData = null;
	//  109  230:aload_0         
	//  110  231:aconst_null     
	//  111  232:putfield        #147 <Field Object mData>
		mHaveData = false;
	//  112  235:aload_0         
	//  113  236:iconst_0        
	//  114  237:putfield        #139 <Field boolean mHaveData>
		if(mLoader != null)
	//* 115  240:aload_0         
	//* 116  241:getfield        #123 <Field b mLoader>
	//* 117  244:ifnull          282
		{
			if(mListenerRegistered)
	//* 118  247:aload_0         
	//* 119  248:getfield        #125 <Field boolean mListenerRegistered>
	//* 120  251:ifeq            275
			{
				mListenerRegistered = false;
	//  121  254:aload_0         
	//  122  255:iconst_0        
	//  123  256:putfield        #125 <Field boolean mListenerRegistered>
				mLoader.a(((android.support.v4.content.b.b) (this)));
	//  124  259:aload_0         
	//  125  260:getfield        #123 <Field b mLoader>
	//  126  263:aload_0         
	//  127  264:invokevirtual   #150 <Method void b.a(android.support.v4.content.b$b)>
				mLoader.b(((android.support.v4.content.b.a) (this)));
	//  128  267:aload_0         
	//  129  268:getfield        #123 <Field b mLoader>
	//  130  271:aload_0         
	//  131  272:invokevirtual   #154 <Method void b.b(android.support.v4.content.b$a)>
			}
			mLoader.i();
	//  132  275:aload_0         
	//  133  276:getfield        #123 <Field b mLoader>
	//  134  279:invokevirtual   #157 <Method void b.i()>
		}
		if(mPendingLoader != null)
	//* 135  282:aload_0         
	//* 136  283:getfield        #159 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//* 137  286:ifnull          296
			mPendingLoader.destroy();
	//  138  289:aload_0         
	//  139  290:getfield        #159 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//  140  293:invokevirtual   #161 <Method void destroy()>
		return;
	//  141  296:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.print(s);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.print("mId=");
	//    3    5:aload_3         
	//    4    6:ldc1            #171 <String "mId=">
	//    5    8:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.print(mId);
	//    6   11:aload_3         
	//    7   12:aload_0         
	//    8   13:getfield        #46  <Field int mId>
	//    9   16:invokevirtual   #174 <Method void PrintWriter.print(int)>
		printwriter.print(" mArgs=");
	//   10   19:aload_3         
	//   11   20:ldc1            #176 <String " mArgs=">
	//   12   22:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mArgs)));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:getfield        #48  <Field Bundle mArgs>
	//   16   30:invokevirtual   #180 <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.print("mCallbacks=");
	//   20   38:aload_3         
	//   21   39:ldc1            #182 <String "mCallbacks=">
	//   22   41:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mCallbacks)));
	//   23   44:aload_3         
	//   24   45:aload_0         
	//   25   46:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   26   49:invokevirtual   #180 <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//   27   52:aload_3         
	//   28   53:aload_1         
	//   29   54:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.print("mLoader=");
	//   30   57:aload_3         
	//   31   58:ldc1            #184 <String "mLoader=">
	//   32   60:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mLoader)));
	//   33   63:aload_3         
	//   34   64:aload_0         
	//   35   65:getfield        #123 <Field b mLoader>
	//   36   68:invokevirtual   #180 <Method void PrintWriter.println(Object)>
		if(mLoader != null)
	//*  37   71:aload_0         
	//*  38   72:getfield        #123 <Field b mLoader>
	//*  39   75:ifnull          122
		{
			b b1 = mLoader;
	//   40   78:aload_0         
	//   41   79:getfield        #123 <Field b mLoader>
	//   42   82:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   43   84:new             #78  <Class StringBuilder>
	//   44   87:dup             
	//   45   88:invokespecial   #79  <Method void StringBuilder()>
	//   46   91:astore          6
			stringbuilder.append(s);
	//   47   93:aload           6
	//   48   95:aload_1         
	//   49   96:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   50   99:pop             
			stringbuilder.append("  ");
	//   51  100:aload           6
	//   52  102:ldc1            #186 <String "  ">
	//   53  104:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   54  107:pop             
			b1.a(stringbuilder.toString(), filedescriptor, printwriter, as);
	//   55  108:aload           5
	//   56  110:aload           6
	//   57  112:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   58  115:aload_2         
	//   59  116:aload_3         
	//   60  117:aload           4
	//   61  119:invokevirtual   #188 <Method void b.a(String, FileDescriptor, PrintWriter, String[])>
		}
		if(mHaveData || mDeliveredData)
	//*  62  122:aload_0         
	//*  63  123:getfield        #139 <Field boolean mHaveData>
	//*  64  126:ifne            136
	//*  65  129:aload_0         
	//*  66  130:getfield        #114 <Field boolean mDeliveredData>
	//*  67  133:ifeq            188
		{
			printwriter.print(s);
	//   68  136:aload_3         
	//   69  137:aload_1         
	//   70  138:invokevirtual   #169 <Method void PrintWriter.print(String)>
			printwriter.print("mHaveData=");
	//   71  141:aload_3         
	//   72  142:ldc1            #190 <String "mHaveData=">
	//   73  144:invokevirtual   #169 <Method void PrintWriter.print(String)>
			printwriter.print(mHaveData);
	//   74  147:aload_3         
	//   75  148:aload_0         
	//   76  149:getfield        #139 <Field boolean mHaveData>
	//   77  152:invokevirtual   #193 <Method void PrintWriter.print(boolean)>
			printwriter.print("  mDeliveredData=");
	//   78  155:aload_3         
	//   79  156:ldc1            #195 <String "  mDeliveredData=">
	//   80  158:invokevirtual   #169 <Method void PrintWriter.print(String)>
			printwriter.println(mDeliveredData);
	//   81  161:aload_3         
	//   82  162:aload_0         
	//   83  163:getfield        #114 <Field boolean mDeliveredData>
	//   84  166:invokevirtual   #197 <Method void PrintWriter.println(boolean)>
			printwriter.print(s);
	//   85  169:aload_3         
	//   86  170:aload_1         
	//   87  171:invokevirtual   #169 <Method void PrintWriter.print(String)>
			printwriter.print("mData=");
	//   88  174:aload_3         
	//   89  175:ldc1            #199 <String "mData=">
	//   90  177:invokevirtual   #169 <Method void PrintWriter.print(String)>
			printwriter.println(mData);
	//   91  180:aload_3         
	//   92  181:aload_0         
	//   93  182:getfield        #147 <Field Object mData>
	//   94  185:invokevirtual   #180 <Method void PrintWriter.println(Object)>
		}
		printwriter.print(s);
	//   95  188:aload_3         
	//   96  189:aload_1         
	//   97  190:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.print("mStarted=");
	//   98  193:aload_3         
	//   99  194:ldc1            #201 <String "mStarted=">
	//  100  196:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.print(mStarted);
	//  101  199:aload_3         
	//  102  200:aload_0         
	//  103  201:getfield        #121 <Field boolean mStarted>
	//  104  204:invokevirtual   #193 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mReportNextStart=");
	//  105  207:aload_3         
	//  106  208:ldc1            #203 <String " mReportNextStart=">
	//  107  210:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.print(mReportNextStart);
	//  108  213:aload_3         
	//  109  214:aload_0         
	//  110  215:getfield        #205 <Field boolean mReportNextStart>
	//  111  218:invokevirtual   #193 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDestroyed=");
	//  112  221:aload_3         
	//  113  222:ldc1            #207 <String " mDestroyed=">
	//  114  224:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.println(mDestroyed);
	//  115  227:aload_3         
	//  116  228:aload_0         
	//  117  229:getfield        #137 <Field boolean mDestroyed>
	//  118  232:invokevirtual   #197 <Method void PrintWriter.println(boolean)>
		printwriter.print(s);
	//  119  235:aload_3         
	//  120  236:aload_1         
	//  121  237:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.print("mRetaining=");
	//  122  240:aload_3         
	//  123  241:ldc1            #209 <String "mRetaining=">
	//  124  243:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.print(mRetaining);
	//  125  246:aload_3         
	//  126  247:aload_0         
	//  127  248:getfield        #211 <Field boolean mRetaining>
	//  128  251:invokevirtual   #193 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRetainingStarted=");
	//  129  254:aload_3         
	//  130  255:ldc1            #213 <String " mRetainingStarted=">
	//  131  257:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.print(mRetainingStarted);
	//  132  260:aload_3         
	//  133  261:aload_0         
	//  134  262:getfield        #215 <Field boolean mRetainingStarted>
	//  135  265:invokevirtual   #193 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mListenerRegistered=");
	//  136  268:aload_3         
	//  137  269:ldc1            #217 <String " mListenerRegistered=">
	//  138  271:invokevirtual   #169 <Method void PrintWriter.print(String)>
		printwriter.println(mListenerRegistered);
	//  139  274:aload_3         
	//  140  275:aload_0         
	//  141  276:getfield        #125 <Field boolean mListenerRegistered>
	//  142  279:invokevirtual   #197 <Method void PrintWriter.println(boolean)>
		if(mPendingLoader != null)
	//* 143  282:aload_0         
	//* 144  283:getfield        #159 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//* 145  286:ifnull          358
		{
			printwriter.print(s);
	//  146  289:aload_3         
	//  147  290:aload_1         
	//  148  291:invokevirtual   #169 <Method void PrintWriter.print(String)>
			printwriter.println("Pending Loader ");
	//  149  294:aload_3         
	//  150  295:ldc1            #219 <String "Pending Loader ">
	//  151  297:invokevirtual   #221 <Method void PrintWriter.println(String)>
			printwriter.print(((Object) (mPendingLoader)));
	//  152  300:aload_3         
	//  153  301:aload_0         
	//  154  302:getfield        #159 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//  155  305:invokevirtual   #223 <Method void PrintWriter.print(Object)>
			printwriter.println(":");
	//  156  308:aload_3         
	//  157  309:ldc1            #225 <String ":">
	//  158  311:invokevirtual   #221 <Method void PrintWriter.println(String)>
			LoaderManagerImpl$LoaderInfo loadermanagerimpl$loaderinfo = mPendingLoader;
	//  159  314:aload_0         
	//  160  315:getfield        #159 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//  161  318:astore          5
			StringBuilder stringbuilder1 = new StringBuilder();
	//  162  320:new             #78  <Class StringBuilder>
	//  163  323:dup             
	//  164  324:invokespecial   #79  <Method void StringBuilder()>
	//  165  327:astore          6
			stringbuilder1.append(s);
	//  166  329:aload           6
	//  167  331:aload_1         
	//  168  332:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  169  335:pop             
			stringbuilder1.append("  ");
	//  170  336:aload           6
	//  171  338:ldc1            #186 <String "  ">
	//  172  340:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//  173  343:pop             
			loadermanagerimpl$loaderinfo.dump(stringbuilder1.toString(), filedescriptor, printwriter, as);
	//  174  344:aload           5
	//  175  346:aload           6
	//  176  348:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  177  351:aload_2         
	//  178  352:aload_3         
	//  179  353:aload           4
	//  180  355:invokevirtual   #227 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
		}
	//  181  358:return          
	}

	void finishRetain()
	{
		if(mRetaining)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field boolean mRetaining>
	//*   2    4:ifeq            71
		{
			if(LoaderManagerImpl.DEBUG)
	//*   3    7:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   4   10:ifeq            44
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    5   13:new             #78  <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #79  <Method void StringBuilder()>
	//    8   20:astore_1        
				stringbuilder.append("  Finished Retaining: ");
	//    9   21:aload_1         
	//   10   22:ldc1            #230 <String "  Finished Retaining: ">
	//   11   24:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
				stringbuilder.append(((Object) (this)));
	//   13   28:aload_1         
	//   14   29:aload_0         
	//   15   30:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   16   33:pop             
				Log.v("LoaderManager", stringbuilder.toString());
	//   17   34:ldc1            #98  <String "LoaderManager">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   20   40:invokestatic    #108 <Method int Log.v(String, String)>
	//   21   43:pop             
			}
			mRetaining = false;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #211 <Field boolean mRetaining>
			if(mStarted != mRetainingStarted && !mStarted)
	//*  25   49:aload_0         
	//*  26   50:getfield        #121 <Field boolean mStarted>
	//*  27   53:aload_0         
	//*  28   54:getfield        #215 <Field boolean mRetainingStarted>
	//*  29   57:icmpeq          71
	//*  30   60:aload_0         
	//*  31   61:getfield        #121 <Field boolean mStarted>
	//*  32   64:ifne            71
				stop();
	//   33   67:aload_0         
	//   34   68:invokevirtual   #233 <Method void stop()>
		}
		if(mStarted && mHaveData && !mReportNextStart)
	//*  35   71:aload_0         
	//*  36   72:getfield        #121 <Field boolean mStarted>
	//*  37   75:ifeq            104
	//*  38   78:aload_0         
	//*  39   79:getfield        #139 <Field boolean mHaveData>
	//*  40   82:ifeq            104
	//*  41   85:aload_0         
	//*  42   86:getfield        #205 <Field boolean mReportNextStart>
	//*  43   89:ifne            104
			callOnLoadFinished(mLoader, mData);
	//   44   92:aload_0         
	//   45   93:aload_0         
	//   46   94:getfield        #123 <Field b mLoader>
	//   47   97:aload_0         
	//   48   98:getfield        #147 <Field Object mData>
	//   49  101:invokevirtual   #235 <Method void callOnLoadFinished(b, Object)>
	//   50  104:return          
	}

	public void onLoadCanceled(b b1)
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            37
		{
			b1 = ((b) (new StringBuilder()));
	//    2    6:new             #78  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #79  <Method void StringBuilder()>
	//    5   13:astore_1        
			((StringBuilder) (b1)).append("onLoadCanceled: ");
	//    6   14:aload_1         
	//    7   15:ldc1            #237 <String "onLoadCanceled: ">
	//    8   17:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			((StringBuilder) (b1)).append(((Object) (this)));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.v("LoaderManager", ((StringBuilder) (b1)).toString());
	//   14   27:ldc1            #98  <String "LoaderManager">
	//   15   29:aload_1         
	//   16   30:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #108 <Method int Log.v(String, String)>
	//   18   36:pop             
		}
		if(mDestroyed)
	//*  19   37:aload_0         
	//*  20   38:getfield        #137 <Field boolean mDestroyed>
	//*  21   41:ifeq            59
		{
			if(LoaderManagerImpl.DEBUG)
	//*  22   44:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  23   47:ifeq            58
				Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
	//   24   50:ldc1            #98  <String "LoaderManager">
	//   25   52:ldc1            #239 <String "  Ignoring load canceled -- destroyed">
	//   26   54:invokestatic    #108 <Method int Log.v(String, String)>
	//   27   57:pop             
			return;
	//   28   58:return          
		}
		if(mLoaders.a(mId) != this)
	//*  29   59:aload_0         
	//*  30   60:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  31   63:getfield        #243 <Field n LoaderManagerImpl.mLoaders>
	//*  32   66:aload_0         
	//*  33   67:getfield        #46  <Field int mId>
	//*  34   70:invokevirtual   #248 <Method Object n.a(int)>
	//*  35   73:aload_0         
	//*  36   74:if_acmpeq       92
		{
			if(LoaderManagerImpl.DEBUG)
	//*  37   77:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  38   80:ifeq            91
				Log.v("LoaderManager", "  Ignoring load canceled -- not active");
	//   39   83:ldc1            #98  <String "LoaderManager">
	//   40   85:ldc1            #250 <String "  Ignoring load canceled -- not active">
	//   41   87:invokestatic    #108 <Method int Log.v(String, String)>
	//   42   90:pop             
			return;
	//   43   91:return          
		}
		b1 = ((b) (mPendingLoader));
	//   44   92:aload_0         
	//   45   93:getfield        #159 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//   46   96:astore_1        
		if(b1 != null)
	//*  47   97:aload_1         
	//*  48   98:ifnull          170
		{
			if(LoaderManagerImpl.DEBUG)
	//*  49  101:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  50  104:ifeq            138
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   51  107:new             #78  <Class StringBuilder>
	//   52  110:dup             
	//   53  111:invokespecial   #79  <Method void StringBuilder()>
	//   54  114:astore_2        
				stringbuilder.append("  Switching to pending loader: ");
	//   55  115:aload_2         
	//   56  116:ldc1            #252 <String "  Switching to pending loader: ">
	//   57  118:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   58  121:pop             
				stringbuilder.append(((Object) (b1)));
	//   59  122:aload_2         
	//   60  123:aload_1         
	//   61  124:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   62  127:pop             
				Log.v("LoaderManager", stringbuilder.toString());
	//   63  128:ldc1            #98  <String "LoaderManager">
	//   64  130:aload_2         
	//   65  131:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   66  134:invokestatic    #108 <Method int Log.v(String, String)>
	//   67  137:pop             
			}
			mPendingLoader = null;
	//   68  138:aload_0         
	//   69  139:aconst_null     
	//   70  140:putfield        #159 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
			mLoaders.b(mId, ((Object) (null)));
	//   71  143:aload_0         
	//   72  144:getfield        #41  <Field LoaderManagerImpl this$0>
	//   73  147:getfield        #243 <Field n LoaderManagerImpl.mLoaders>
	//   74  150:aload_0         
	//   75  151:getfield        #46  <Field int mId>
	//   76  154:aconst_null     
	//   77  155:invokevirtual   #255 <Method void n.b(int, Object)>
			destroy();
	//   78  158:aload_0         
	//   79  159:invokevirtual   #161 <Method void destroy()>
			installLoader(((LoaderManagerImpl$LoaderInfo) (b1)));
	//   80  162:aload_0         
	//   81  163:getfield        #41  <Field LoaderManagerImpl this$0>
	//   82  166:aload_1         
	//   83  167:invokevirtual   #259 <Method void LoaderManagerImpl.installLoader(LoaderManagerImpl$LoaderInfo)>
		}
	//   84  170:return          
	}

	public void onLoadComplete(b b1, Object obj)
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #78  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #79  <Method void StringBuilder()>
	//    5   13:astore_3        
			stringbuilder.append("onLoadComplete: ");
	//    6   14:aload_3         
	//    7   15:ldc2            #263 <String "onLoadComplete: ">
	//    8   18:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (this)));
	//   10   22:aload_3         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   28:ldc1            #98  <String "LoaderManager">
	//   15   30:aload_3         
	//   16   31:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #108 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		if(mDestroyed)
	//*  19   38:aload_0         
	//*  20   39:getfield        #137 <Field boolean mDestroyed>
	//*  21   42:ifeq            61
		{
			if(LoaderManagerImpl.DEBUG)
	//*  22   45:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  23   48:ifeq            60
				Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
	//   24   51:ldc1            #98  <String "LoaderManager">
	//   25   53:ldc2            #265 <String "  Ignoring load complete -- destroyed">
	//   26   56:invokestatic    #108 <Method int Log.v(String, String)>
	//   27   59:pop             
			return;
	//   28   60:return          
		}
		if(mLoaders.a(mId) != this)
	//*  29   61:aload_0         
	//*  30   62:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  31   65:getfield        #243 <Field n LoaderManagerImpl.mLoaders>
	//*  32   68:aload_0         
	//*  33   69:getfield        #46  <Field int mId>
	//*  34   72:invokevirtual   #248 <Method Object n.a(int)>
	//*  35   75:aload_0         
	//*  36   76:if_acmpeq       95
		{
			if(LoaderManagerImpl.DEBUG)
	//*  37   79:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  38   82:ifeq            94
				Log.v("LoaderManager", "  Ignoring load complete -- not active");
	//   39   85:ldc1            #98  <String "LoaderManager">
	//   40   87:ldc2            #267 <String "  Ignoring load complete -- not active">
	//   41   90:invokestatic    #108 <Method int Log.v(String, String)>
	//   42   93:pop             
			return;
	//   43   94:return          
		}
		LoaderManagerImpl$LoaderInfo loadermanagerimpl$loaderinfo = mPendingLoader;
	//   44   95:aload_0         
	//   45   96:getfield        #159 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//   46   99:astore_3        
		if(loadermanagerimpl$loaderinfo != null)
	//*  47  100:aload_3         
	//*  48  101:ifnull          174
		{
			if(LoaderManagerImpl.DEBUG)
	//*  49  104:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  50  107:ifeq            141
			{
				b1 = ((b) (new StringBuilder()));
	//   51  110:new             #78  <Class StringBuilder>
	//   52  113:dup             
	//   53  114:invokespecial   #79  <Method void StringBuilder()>
	//   54  117:astore_1        
				((StringBuilder) (b1)).append("  Switching to pending loader: ");
	//   55  118:aload_1         
	//   56  119:ldc1            #252 <String "  Switching to pending loader: ">
	//   57  121:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   58  124:pop             
				((StringBuilder) (b1)).append(((Object) (loadermanagerimpl$loaderinfo)));
	//   59  125:aload_1         
	//   60  126:aload_3         
	//   61  127:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   62  130:pop             
				Log.v("LoaderManager", ((StringBuilder) (b1)).toString());
	//   63  131:ldc1            #98  <String "LoaderManager">
	//   64  133:aload_1         
	//   65  134:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   66  137:invokestatic    #108 <Method int Log.v(String, String)>
	//   67  140:pop             
			}
			mPendingLoader = null;
	//   68  141:aload_0         
	//   69  142:aconst_null     
	//   70  143:putfield        #159 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
			mLoaders.b(mId, ((Object) (null)));
	//   71  146:aload_0         
	//   72  147:getfield        #41  <Field LoaderManagerImpl this$0>
	//   73  150:getfield        #243 <Field n LoaderManagerImpl.mLoaders>
	//   74  153:aload_0         
	//   75  154:getfield        #46  <Field int mId>
	//   76  157:aconst_null     
	//   77  158:invokevirtual   #255 <Method void n.b(int, Object)>
			destroy();
	//   78  161:aload_0         
	//   79  162:invokevirtual   #161 <Method void destroy()>
			installLoader(loadermanagerimpl$loaderinfo);
	//   80  165:aload_0         
	//   81  166:getfield        #41  <Field LoaderManagerImpl this$0>
	//   82  169:aload_3         
	//   83  170:invokevirtual   #259 <Method void LoaderManagerImpl.installLoader(LoaderManagerImpl$LoaderInfo)>
			return;
	//   84  173:return          
		}
		if(mData != obj || !mHaveData)
	//*  85  174:aload_0         
	//*  86  175:getfield        #147 <Field Object mData>
	//*  87  178:aload_2         
	//*  88  179:if_acmpne       189
	//*  89  182:aload_0         
	//*  90  183:getfield        #139 <Field boolean mHaveData>
	//*  91  186:ifne            212
		{
			mData = obj;
	//   92  189:aload_0         
	//   93  190:aload_2         
	//   94  191:putfield        #147 <Field Object mData>
			mHaveData = true;
	//   95  194:aload_0         
	//   96  195:iconst_1        
	//   97  196:putfield        #139 <Field boolean mHaveData>
			if(mStarted)
	//*  98  199:aload_0         
	//*  99  200:getfield        #121 <Field boolean mStarted>
	//* 100  203:ifeq            212
				callOnLoadFinished(b1, obj);
	//  101  206:aload_0         
	//  102  207:aload_1         
	//  103  208:aload_2         
	//  104  209:invokevirtual   #235 <Method void callOnLoadFinished(b, Object)>
		}
		b1 = ((b) ((LoaderManagerImpl$LoaderInfo)mInactiveLoaders.a(mId)));
	//  105  212:aload_0         
	//  106  213:getfield        #41  <Field LoaderManagerImpl this$0>
	//  107  216:getfield        #270 <Field n LoaderManagerImpl.mInactiveLoaders>
	//  108  219:aload_0         
	//  109  220:getfield        #46  <Field int mId>
	//  110  223:invokevirtual   #248 <Method Object n.a(int)>
	//  111  226:checkcast       #2   <Class LoaderManagerImpl$LoaderInfo>
	//  112  229:astore_1        
		if(b1 != null && b1 != this)
	//* 113  230:aload_1         
	//* 114  231:ifnull          262
	//* 115  234:aload_1         
	//* 116  235:aload_0         
	//* 117  236:if_acmpeq       262
		{
			b1.mDeliveredData = false;
	//  118  239:aload_1         
	//  119  240:iconst_0        
	//  120  241:putfield        #114 <Field boolean mDeliveredData>
			((LoaderManagerImpl$LoaderInfo) (b1)).destroy();
	//  121  244:aload_1         
	//  122  245:invokevirtual   #161 <Method void destroy()>
			mInactiveLoaders.c(mId);
	//  123  248:aload_0         
	//  124  249:getfield        #41  <Field LoaderManagerImpl this$0>
	//  125  252:getfield        #270 <Field n LoaderManagerImpl.mInactiveLoaders>
	//  126  255:aload_0         
	//  127  256:getfield        #46  <Field int mId>
	//  128  259:invokevirtual   #272 <Method void n.c(int)>
		}
		if(mHost != null && !hasRunningLoaders())
	//* 129  262:aload_0         
	//* 130  263:getfield        #41  <Field LoaderManagerImpl this$0>
	//* 131  266:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//* 132  269:ifnull          295
	//* 133  272:aload_0         
	//* 134  273:getfield        #41  <Field LoaderManagerImpl this$0>
	//* 135  276:invokevirtual   #275 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
	//* 136  279:ifne            295
			mHost.mFragmentManager.startPendingDeferredFragments();
	//  137  282:aload_0         
	//  138  283:getfield        #41  <Field LoaderManagerImpl this$0>
	//  139  286:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//  140  289:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//  141  292:invokevirtual   #278 <Method void FragmentManagerImpl.startPendingDeferredFragments()>
	//  142  295:return          
	}

	void reportStart()
	{
		if(mStarted && mReportNextStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field boolean mStarted>
	//*   2    4:ifeq            45
	//*   3    7:aload_0         
	//*   4    8:getfield        #205 <Field boolean mReportNextStart>
	//*   5   11:ifeq            45
		{
			mReportNextStart = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #205 <Field boolean mReportNextStart>
			if(mHaveData && !mRetaining)
	//*   9   19:aload_0         
	//*  10   20:getfield        #139 <Field boolean mHaveData>
	//*  11   23:ifeq            45
	//*  12   26:aload_0         
	//*  13   27:getfield        #211 <Field boolean mRetaining>
	//*  14   30:ifne            45
				callOnLoadFinished(mLoader, mData);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #123 <Field b mLoader>
	//   18   38:aload_0         
	//   19   39:getfield        #147 <Field Object mData>
	//   20   42:invokevirtual   #235 <Method void callOnLoadFinished(b, Object)>
		}
	//   21   45:return          
	}

	void retain()
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #78  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #79  <Method void StringBuilder()>
	//    5   13:astore_1        
			stringbuilder.append("  Retaining: ");
	//    6   14:aload_1         
	//    7   15:ldc2            #282 <String "  Retaining: ">
	//    8   18:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (this)));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   28:ldc1            #98  <String "LoaderManager">
	//   15   30:aload_1         
	//   16   31:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #108 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		mRetaining = true;
	//   19   38:aload_0         
	//   20   39:iconst_1        
	//   21   40:putfield        #211 <Field boolean mRetaining>
		mRetainingStarted = mStarted;
	//   22   43:aload_0         
	//   23   44:aload_0         
	//   24   45:getfield        #121 <Field boolean mStarted>
	//   25   48:putfield        #215 <Field boolean mRetainingStarted>
		mStarted = false;
	//   26   51:aload_0         
	//   27   52:iconst_0        
	//   28   53:putfield        #121 <Field boolean mStarted>
		mCallbacks = null;
	//   29   56:aload_0         
	//   30   57:aconst_null     
	//   31   58:putfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   32   61:return          
	}

	void start()
	{
		if(mRetaining && mRetainingStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field boolean mRetaining>
	//*   2    4:ifeq            20
	//*   3    7:aload_0         
	//*   4    8:getfield        #215 <Field boolean mRetainingStarted>
	//*   5   11:ifeq            20
		{
			mStarted = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #121 <Field boolean mStarted>
			return;
	//    9   19:return          
		}
		if(mStarted)
	//*  10   20:aload_0         
	//*  11   21:getfield        #121 <Field boolean mStarted>
	//*  12   24:ifeq            28
			return;
	//   13   27:return          
		mStarted = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #121 <Field boolean mStarted>
		if(LoaderManagerImpl.DEBUG)
	//*  17   33:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  18   36:ifeq            71
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   19   39:new             #78  <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #79  <Method void StringBuilder()>
	//   22   46:astore_1        
			stringbuilder.append("  Starting: ");
	//   23   47:aload_1         
	//   24   48:ldc2            #285 <String "  Starting: ">
	//   25   51:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			stringbuilder.append(((Object) (this)));
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   30   60:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   31   61:ldc1            #98  <String "LoaderManager">
	//   32   63:aload_1         
	//   33   64:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   34   67:invokestatic    #108 <Method int Log.v(String, String)>
	//   35   70:pop             
		}
		if(mLoader == null && mCallbacks != null)
	//*  36   71:aload_0         
	//*  37   72:getfield        #123 <Field b mLoader>
	//*  38   75:ifnonnull       106
	//*  39   78:aload_0         
	//*  40   79:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//*  41   82:ifnull          106
			mLoader = mCallbacks.onCreateLoader(mId, mArgs);
	//   42   85:aload_0         
	//   43   86:aload_0         
	//   44   87:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   45   90:aload_0         
	//   46   91:getfield        #46  <Field int mId>
	//   47   94:aload_0         
	//   48   95:getfield        #48  <Field Bundle mArgs>
	//   49   98:invokeinterface #289 <Method b LoaderManager$LoaderCallbacks.onCreateLoader(int, Bundle)>
	//   50  103:putfield        #123 <Field b mLoader>
		if(mLoader != null)
	//*  51  106:aload_0         
	//*  52  107:getfield        #123 <Field b mLoader>
	//*  53  110:ifnull          218
		{
			if(((Object) (mLoader)).getClass().isMemberClass() && !Modifier.isStatic(((Object) (mLoader)).getClass().getModifiers()))
	//*  54  113:aload_0         
	//*  55  114:getfield        #123 <Field b mLoader>
	//*  56  117:invokevirtual   #293 <Method Class Object.getClass()>
	//*  57  120:invokevirtual   #298 <Method boolean Class.isMemberClass()>
	//*  58  123:ifeq            179
	//*  59  126:aload_0         
	//*  60  127:getfield        #123 <Field b mLoader>
	//*  61  130:invokevirtual   #293 <Method Class Object.getClass()>
	//*  62  133:invokevirtual   #302 <Method int Class.getModifiers()>
	//*  63  136:invokestatic    #308 <Method boolean Modifier.isStatic(int)>
	//*  64  139:ifne            179
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   65  142:new             #78  <Class StringBuilder>
	//   66  145:dup             
	//   67  146:invokespecial   #79  <Method void StringBuilder()>
	//   68  149:astore_1        
				stringbuilder1.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
	//   69  150:aload_1         
	//   70  151:ldc2            #310 <String "Object returned from onCreateLoader must not be a non-static inner member class: ">
	//   71  154:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   72  157:pop             
				stringbuilder1.append(((Object) (mLoader)));
	//   73  158:aload_1         
	//   74  159:aload_0         
	//   75  160:getfield        #123 <Field b mLoader>
	//   76  163:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   77  166:pop             
				throw new IllegalArgumentException(stringbuilder1.toString());
	//   78  167:new             #312 <Class IllegalArgumentException>
	//   79  170:dup             
	//   80  171:aload_1         
	//   81  172:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   82  175:invokespecial   #314 <Method void IllegalArgumentException(String)>
	//   83  178:athrow          
			}
			if(!mListenerRegistered)
	//*  84  179:aload_0         
	//*  85  180:getfield        #125 <Field boolean mListenerRegistered>
	//*  86  183:ifne            211
			{
				mLoader.a(mId, ((android.support.v4.content.b.b) (this)));
	//   87  186:aload_0         
	//   88  187:getfield        #123 <Field b mLoader>
	//   89  190:aload_0         
	//   90  191:getfield        #46  <Field int mId>
	//   91  194:aload_0         
	//   92  195:invokevirtual   #317 <Method void b.a(int, android.support.v4.content.b$b)>
				mLoader.a(((android.support.v4.content.b.a) (this)));
	//   93  198:aload_0         
	//   94  199:getfield        #123 <Field b mLoader>
	//   95  202:aload_0         
	//   96  203:invokevirtual   #319 <Method void b.a(android.support.v4.content.b$a)>
				mListenerRegistered = true;
	//   97  206:aload_0         
	//   98  207:iconst_1        
	//   99  208:putfield        #125 <Field boolean mListenerRegistered>
			}
			mLoader.a();
	//  100  211:aload_0         
	//  101  212:getfield        #123 <Field b mLoader>
	//  102  215:invokevirtual   #321 <Method void b.a()>
		}
	//  103  218:return          
	}

	void stop()
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            38
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #78  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #79  <Method void StringBuilder()>
	//    5   13:astore_1        
			stringbuilder.append("  Stopping: ");
	//    6   14:aload_1         
	//    7   15:ldc2            #323 <String "  Stopping: ">
	//    8   18:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:pop             
			stringbuilder.append(((Object) (this)));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   28:ldc1            #98  <String "LoaderManager">
	//   15   30:aload_1         
	//   16   31:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #108 <Method int Log.v(String, String)>
	//   18   37:pop             
		}
		mStarted = false;
	//   19   38:aload_0         
	//   20   39:iconst_0        
	//   21   40:putfield        #121 <Field boolean mStarted>
		if(!mRetaining && mLoader != null && mListenerRegistered)
	//*  22   43:aload_0         
	//*  23   44:getfield        #211 <Field boolean mRetaining>
	//*  24   47:ifne            92
	//*  25   50:aload_0         
	//*  26   51:getfield        #123 <Field b mLoader>
	//*  27   54:ifnull          92
	//*  28   57:aload_0         
	//*  29   58:getfield        #125 <Field boolean mListenerRegistered>
	//*  30   61:ifeq            92
		{
			mListenerRegistered = false;
	//   31   64:aload_0         
	//   32   65:iconst_0        
	//   33   66:putfield        #125 <Field boolean mListenerRegistered>
			mLoader.a(((android.support.v4.content.b.b) (this)));
	//   34   69:aload_0         
	//   35   70:getfield        #123 <Field b mLoader>
	//   36   73:aload_0         
	//   37   74:invokevirtual   #150 <Method void b.a(android.support.v4.content.b$b)>
			mLoader.b(((android.support.v4.content.b.a) (this)));
	//   38   77:aload_0         
	//   39   78:getfield        #123 <Field b mLoader>
	//   40   81:aload_0         
	//   41   82:invokevirtual   #154 <Method void b.b(android.support.v4.content.b$a)>
			mLoader.e();
	//   42   85:aload_0         
	//   43   86:getfield        #123 <Field b mLoader>
	//   44   89:invokevirtual   #326 <Method void b.e()>
		}
	//   45   92:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #78  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #328 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("LoaderInfo{");
	//    5   10:aload_1         
	//    6   11:ldc2            #330 <String "LoaderInfo{">
	//    7   14:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokestatic    #336 <Method int System.identityHashCode(Object)>
	//   12   23:invokestatic    #342 <Method String Integer.toHexString(int)>
	//   13   26:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(" #");
	//   15   30:aload_1         
	//   16   31:ldc2            #344 <String " #">
	//   17   34:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		stringbuilder.append(mId);
	//   19   38:aload_1         
	//   20   39:aload_0         
	//   21   40:getfield        #46  <Field int mId>
	//   22   43:invokevirtual   #347 <Method StringBuilder StringBuilder.append(int)>
	//   23   46:pop             
		stringbuilder.append(" : ");
	//   24   47:aload_1         
	//   25   48:ldc2            #349 <String " : ">
	//   26   51:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		d.a(((Object) (mLoader)), stringbuilder);
	//   28   55:aload_0         
	//   29   56:getfield        #123 <Field b mLoader>
	//   30   59:aload_1         
	//   31   60:invokestatic    #354 <Method void d.a(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   32   63:aload_1         
	//   33   64:ldc2            #356 <String "}}">
	//   34   67:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
		return stringbuilder.toString();
	//   36   71:aload_1         
	//   37   72:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   38   75:areturn         
	}

	final Bundle mArgs;
	 mCallbacks;
	Object mData;
	boolean mDeliveredData;
	boolean mDestroyed;
	boolean mHaveData;
	final int mId;
	boolean mListenerRegistered;
	b mLoader;
	LoaderManagerImpl$LoaderInfo mPendingLoader;
	boolean mReportNextStart;
	boolean mRetaining;
	boolean mRetainingStarted;
	boolean mStarted;
	final LoaderManagerImpl this$0;

	public LoaderManagerImpl$LoaderInfo(int i, Bundle bundle,  )
	{
		this$0 = LoaderManagerImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field LoaderManagerImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #44  <Method void Object()>
		mId = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #46  <Field int mId>
		mArgs = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #48  <Field Bundle mArgs>
		mCallbacks = ;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   14   25:return          
	}
}
