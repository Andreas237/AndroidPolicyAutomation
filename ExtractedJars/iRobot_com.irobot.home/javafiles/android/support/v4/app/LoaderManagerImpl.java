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
//			LoaderManager, FragmentHostCallback, FragmentManagerImpl

class LoaderManagerImpl extends LoaderManager
{
	final class LoaderInfo
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
				LoaderInfo loaderinfo = mPendingLoader;
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
				loaderinfo.dump(stringbuilder1.toString(), filedescriptor, printwriter, as);
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
				installLoader(((LoaderInfo) (b1)));
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
			LoaderInfo loaderinfo = mPendingLoader;
		//   44   95:aload_0         
		//   45   96:getfield        #159 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
		//   46   99:astore_3        
			if(loaderinfo != null)
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
					((StringBuilder) (b1)).append(((Object) (loaderinfo)));
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
				installLoader(loaderinfo);
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
			b1 = ((b) ((LoaderInfo)mInactiveLoaders.a(mId)));
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
				((LoaderInfo) (b1)).destroy();
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
		LoaderManager.LoaderCallbacks mCallbacks;
		Object mData;
		boolean mDeliveredData;
		boolean mDestroyed;
		boolean mHaveData;
		final int mId;
		boolean mListenerRegistered;
		b mLoader;
		LoaderInfo mPendingLoader;
		boolean mReportNextStart;
		boolean mRetaining;
		boolean mRetainingStarted;
		boolean mStarted;
		final LoaderManagerImpl this$0;

		public LoaderInfo(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
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
			mCallbacks = loadercallbacks;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
		//   14   25:return          
		}
	}


	LoaderManagerImpl(String s, FragmentHostCallback fragmenthostcallback, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void LoaderManager()>
	//    2    4:aload_0         
	//    3    5:new             #34  <Class n>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void n()>
	//    6   12:putfield        #37  <Field n mLoaders>
	//    7   15:aload_0         
	//    8   16:new             #34  <Class n>
	//    9   19:dup             
	//   10   20:invokespecial   #35  <Method void n()>
	//   11   23:putfield        #39  <Field n mInactiveLoaders>
		mWho = s;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #41  <Field String mWho>
		mHost = fragmenthostcallback;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #43  <Field FragmentHostCallback mHost>
		mStarted = flag;
	//   18   36:aload_0         
	//   19   37:iload_3         
	//   20   38:putfield        #45  <Field boolean mStarted>
	//   21   41:return          
	}

	private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		mCreatingLoader = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #49  <Field boolean mCreatingLoader>
		bundle = ((Bundle) (createLoader(i, bundle, loadercallbacks)));
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #52  <Method LoaderManagerImpl$LoaderInfo createLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
	//    8   12:astore_2        
		installLoader(((LoaderInfo) (bundle)));
	//    9   13:aload_0         
	//   10   14:aload_2         
	//   11   15:invokevirtual   #56  <Method void installLoader(LoaderManagerImpl$LoaderInfo)>
		mCreatingLoader = false;
	//   12   18:aload_0         
	//   13   19:iconst_0        
	//   14   20:putfield        #49  <Field boolean mCreatingLoader>
		return ((LoaderInfo) (bundle));
	//   15   23:aload_2         
	//   16   24:areturn         
		bundle;
	//   17   25:astore_2        
		mCreatingLoader = false;
	//   18   26:aload_0         
	//   19   27:iconst_0        
	//   20   28:putfield        #49  <Field boolean mCreatingLoader>
		throw bundle;
	//   21   31:aload_2         
	//   22   32:athrow          
	}

	private LoaderInfo createLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		LoaderInfo loaderinfo = new LoaderInfo(i, bundle, loadercallbacks);
	//    0    0:new             #6   <Class LoaderManagerImpl$LoaderInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #61  <Method void LoaderManagerImpl$LoaderInfo(LoaderManagerImpl, int, Bundle, LoaderManager$LoaderCallbacks)>
	//    7   11:astore          4
		loaderinfo.mLoader = loadercallbacks.onCreateLoader(i, bundle);
	//    8   13:aload           4
	//    9   15:aload_3         
	//   10   16:iload_1         
	//   11   17:aload_2         
	//   12   18:invokeinterface #67  <Method b LoaderManager$LoaderCallbacks.onCreateLoader(int, Bundle)>
	//   13   23:putfield        #71  <Field b LoaderManagerImpl$LoaderInfo.mLoader>
		return loaderinfo;
	//   14   26:aload           4
	//   15   28:areturn         
	}

	public void destroyLoader(int i)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #75  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #77  <String "Called while creating a loader">
	//    6   13:invokespecial   #80  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(DEBUG)
	//*   8   17:getstatic       #82  <Field boolean DEBUG>
	//*   9   20:ifeq            67
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   23:new             #84  <Class StringBuilder>
	//   11   26:dup             
	//   12   27:invokespecial   #85  <Method void StringBuilder()>
	//   13   30:astore_3        
			stringbuilder.append("destroyLoader in ");
	//   14   31:aload_3         
	//   15   32:ldc1            #87  <String "destroyLoader in ">
	//   16   34:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			stringbuilder.append(((Object) (this)));
	//   18   38:aload_3         
	//   19   39:aload_0         
	//   20   40:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   21   43:pop             
			stringbuilder.append(" of ");
	//   22   44:aload_3         
	//   23   45:ldc1            #96  <String " of ">
	//   24   47:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
			stringbuilder.append(i);
	//   26   51:aload_3         
	//   27   52:iload_1         
	//   28   53:invokevirtual   #99  <Method StringBuilder StringBuilder.append(int)>
	//   29   56:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   30   57:ldc1            #14  <String "LoaderManager">
	//   31   59:aload_3         
	//   32   60:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   33   63:invokestatic    #109 <Method int Log.v(String, String)>
	//   34   66:pop             
		}
		int j = mLoaders.g(i);
	//   35   67:aload_0         
	//   36   68:getfield        #37  <Field n mLoaders>
	//   37   71:iload_1         
	//   38   72:invokevirtual   #113 <Method int n.g(int)>
	//   39   75:istore_2        
		if(j >= 0)
	//*  40   76:iload_2         
	//*  41   77:iflt            104
		{
			LoaderInfo loaderinfo = (LoaderInfo)mLoaders.f(j);
	//   42   80:aload_0         
	//   43   81:getfield        #37  <Field n mLoaders>
	//   44   84:iload_2         
	//   45   85:invokevirtual   #117 <Method Object n.f(int)>
	//   46   88:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   47   91:astore_3        
			mLoaders.d(j);
	//   48   92:aload_0         
	//   49   93:getfield        #37  <Field n mLoaders>
	//   50   96:iload_2         
	//   51   97:invokevirtual   #120 <Method void n.d(int)>
			loaderinfo.destroy();
	//   52  100:aload_3         
	//   53  101:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
		}
		i = mInactiveLoaders.g(i);
	//   54  104:aload_0         
	//   55  105:getfield        #39  <Field n mInactiveLoaders>
	//   56  108:iload_1         
	//   57  109:invokevirtual   #113 <Method int n.g(int)>
	//   58  112:istore_1        
		if(i >= 0)
	//*  59  113:iload_1         
	//*  60  114:iflt            141
		{
			LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.f(i);
	//   61  117:aload_0         
	//   62  118:getfield        #39  <Field n mInactiveLoaders>
	//   63  121:iload_1         
	//   64  122:invokevirtual   #117 <Method Object n.f(int)>
	//   65  125:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   66  128:astore_3        
			mInactiveLoaders.d(i);
	//   67  129:aload_0         
	//   68  130:getfield        #39  <Field n mInactiveLoaders>
	//   69  133:iload_1         
	//   70  134:invokevirtual   #120 <Method void n.d(int)>
			loaderinfo1.destroy();
	//   71  137:aload_3         
	//   72  138:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
		}
		if(mHost != null && !hasRunningLoaders())
	//*  73  141:aload_0         
	//*  74  142:getfield        #43  <Field FragmentHostCallback mHost>
	//*  75  145:ifnull          165
	//*  76  148:aload_0         
	//*  77  149:invokevirtual   #127 <Method boolean hasRunningLoaders()>
	//*  78  152:ifne            165
			mHost.mFragmentManager.startPendingDeferredFragments();
	//   79  155:aload_0         
	//   80  156:getfield        #43  <Field FragmentHostCallback mHost>
	//   81  159:getfield        #133 <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   82  162:invokevirtual   #138 <Method void FragmentManagerImpl.startPendingDeferredFragments()>
	//   83  165:return          
	}

	void doDestroy()
	{
		if(!mRetaining)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field boolean mRetaining>
	//*   2    4:ifne            86
		{
			if(DEBUG)
	//*   3    7:getstatic       #82  <Field boolean DEBUG>
	//*   4   10:ifeq            44
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    5   13:new             #84  <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #85  <Method void StringBuilder()>
	//    8   20:astore_2        
				stringbuilder.append("Destroying Active in ");
	//    9   21:aload_2         
	//   10   22:ldc1            #143 <String "Destroying Active in ">
	//   11   24:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
				stringbuilder.append(((Object) (this)));
	//   13   28:aload_2         
	//   14   29:aload_0         
	//   15   30:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   16   33:pop             
				Log.v("LoaderManager", stringbuilder.toString());
	//   17   34:ldc1            #14  <String "LoaderManager">
	//   18   36:aload_2         
	//   19   37:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   20   40:invokestatic    #109 <Method int Log.v(String, String)>
	//   21   43:pop             
			}
			for(int i = mLoaders.b() - 1; i >= 0; i--)
	//*  22   44:aload_0         
	//*  23   45:getfield        #37  <Field n mLoaders>
	//*  24   48:invokevirtual   #147 <Method int n.b()>
	//*  25   51:iconst_1        
	//*  26   52:isub            
	//*  27   53:istore_1        
	//*  28   54:iload_1         
	//*  29   55:iflt            79
				((LoaderInfo)mLoaders.f(i)).destroy();
	//   30   58:aload_0         
	//   31   59:getfield        #37  <Field n mLoaders>
	//   32   62:iload_1         
	//   33   63:invokevirtual   #117 <Method Object n.f(int)>
	//   34   66:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   35   69:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>

	//   36   72:iload_1         
	//   37   73:iconst_1        
	//   38   74:isub            
	//   39   75:istore_1        
	//*  40   76:goto            54
			mLoaders.c();
	//   41   79:aload_0         
	//   42   80:getfield        #37  <Field n mLoaders>
	//   43   83:invokevirtual   #150 <Method void n.c()>
		}
		if(DEBUG)
	//*  44   86:getstatic       #82  <Field boolean DEBUG>
	//*  45   89:ifeq            123
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   46   92:new             #84  <Class StringBuilder>
	//   47   95:dup             
	//   48   96:invokespecial   #85  <Method void StringBuilder()>
	//   49   99:astore_2        
			stringbuilder1.append("Destroying Inactive in ");
	//   50  100:aload_2         
	//   51  101:ldc1            #152 <String "Destroying Inactive in ">
	//   52  103:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   53  106:pop             
			stringbuilder1.append(((Object) (this)));
	//   54  107:aload_2         
	//   55  108:aload_0         
	//   56  109:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   57  112:pop             
			Log.v("LoaderManager", stringbuilder1.toString());
	//   58  113:ldc1            #14  <String "LoaderManager">
	//   59  115:aload_2         
	//   60  116:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   61  119:invokestatic    #109 <Method int Log.v(String, String)>
	//   62  122:pop             
		}
		for(int j = mInactiveLoaders.b() - 1; j >= 0; j--)
	//*  63  123:aload_0         
	//*  64  124:getfield        #39  <Field n mInactiveLoaders>
	//*  65  127:invokevirtual   #147 <Method int n.b()>
	//*  66  130:iconst_1        
	//*  67  131:isub            
	//*  68  132:istore_1        
	//*  69  133:iload_1         
	//*  70  134:iflt            158
			((LoaderInfo)mInactiveLoaders.f(j)).destroy();
	//   71  137:aload_0         
	//   72  138:getfield        #39  <Field n mInactiveLoaders>
	//   73  141:iload_1         
	//   74  142:invokevirtual   #117 <Method Object n.f(int)>
	//   75  145:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   76  148:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>

	//   77  151:iload_1         
	//   78  152:iconst_1        
	//   79  153:isub            
	//   80  154:istore_1        
	//*  81  155:goto            133
		mInactiveLoaders.c();
	//   82  158:aload_0         
	//   83  159:getfield        #39  <Field n mInactiveLoaders>
	//   84  162:invokevirtual   #150 <Method void n.c()>
		mHost = null;
	//   85  165:aload_0         
	//   86  166:aconst_null     
	//   87  167:putfield        #43  <Field FragmentHostCallback mHost>
	//   88  170:return          
	}

	void doReportNextStart()
	{
		for(int i = mLoaders.b() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field n mLoaders>
	//*   2    4:invokevirtual   #147 <Method int n.b()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            36
			((LoaderInfo)mLoaders.f(i)).mReportNextStart = true;
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field n mLoaders>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #117 <Method Object n.f(int)>
	//   12   22:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   13   25:iconst_1        
	//   14   26:putfield        #156 <Field boolean LoaderManagerImpl$LoaderInfo.mReportNextStart>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:istore_1        
	//*  19   33:goto            10
	//   20   36:return          
	}

	void doReportStart()
	{
		for(int i = mLoaders.b() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field n mLoaders>
	//*   2    4:invokevirtual   #147 <Method int n.b()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            35
			((LoaderInfo)mLoaders.f(i)).reportStart();
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field n mLoaders>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #117 <Method Object n.f(int)>
	//   12   22:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   13   25:invokevirtual   #160 <Method void LoaderManagerImpl$LoaderInfo.reportStart()>

	//   14   28:iload_1         
	//   15   29:iconst_1        
	//   16   30:isub            
	//   17   31:istore_1        
	//*  18   32:goto            10
	//   19   35:return          
	}

	void doRetain()
	{
		if(DEBUG)
	//*   0    0:getstatic       #82  <Field boolean DEBUG>
	//*   1    3:ifeq            37
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #84  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #85  <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("Retaining in ");
	//    6   14:aload_2         
	//    7   15:ldc1            #163 <String "Retaining in ">
	//    8   17:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (this)));
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   27:ldc1            #14  <String "LoaderManager">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #109 <Method int Log.v(String, String)>
	//   18   36:pop             
		}
		if(!mStarted)
	//*  19   37:aload_0         
	//*  20   38:getfield        #45  <Field boolean mStarted>
	//*  21   41:ifne            92
		{
			RuntimeException runtimeexception = new RuntimeException("here");
	//   22   44:new             #165 <Class RuntimeException>
	//   23   47:dup             
	//   24   48:ldc1            #167 <String "here">
	//   25   50:invokespecial   #168 <Method void RuntimeException(String)>
	//   26   53:astore_2        
			runtimeexception.fillInStackTrace();
	//   27   54:aload_2         
	//   28   55:invokevirtual   #172 <Method Throwable RuntimeException.fillInStackTrace()>
	//   29   58:pop             
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   59:new             #84  <Class StringBuilder>
	//   31   62:dup             
	//   32   63:invokespecial   #85  <Method void StringBuilder()>
	//   33   66:astore_3        
			stringbuilder1.append("Called doRetain when not started: ");
	//   34   67:aload_3         
	//   35   68:ldc1            #174 <String "Called doRetain when not started: ">
	//   36   70:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
			stringbuilder1.append(((Object) (this)));
	//   38   74:aload_3         
	//   39   75:aload_0         
	//   40   76:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   41   79:pop             
			Log.w("LoaderManager", stringbuilder1.toString(), ((Throwable) (runtimeexception)));
	//   42   80:ldc1            #14  <String "LoaderManager">
	//   43   82:aload_3         
	//   44   83:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   45   86:aload_2         
	//   46   87:invokestatic    #178 <Method int Log.w(String, String, Throwable)>
	//   47   90:pop             
			return;
	//   48   91:return          
		}
		mRetaining = true;
	//   49   92:aload_0         
	//   50   93:iconst_1        
	//   51   94:putfield        #141 <Field boolean mRetaining>
		mStarted = false;
	//   52   97:aload_0         
	//   53   98:iconst_0        
	//   54   99:putfield        #45  <Field boolean mStarted>
		for(int i = mLoaders.b() - 1; i >= 0; i--)
	//*  55  102:aload_0         
	//*  56  103:getfield        #37  <Field n mLoaders>
	//*  57  106:invokevirtual   #147 <Method int n.b()>
	//*  58  109:iconst_1        
	//*  59  110:isub            
	//*  60  111:istore_1        
	//*  61  112:iload_1         
	//*  62  113:iflt            137
			((LoaderInfo)mLoaders.f(i)).retain();
	//   63  116:aload_0         
	//   64  117:getfield        #37  <Field n mLoaders>
	//   65  120:iload_1         
	//   66  121:invokevirtual   #117 <Method Object n.f(int)>
	//   67  124:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   68  127:invokevirtual   #181 <Method void LoaderManagerImpl$LoaderInfo.retain()>

	//   69  130:iload_1         
	//   70  131:iconst_1        
	//   71  132:isub            
	//   72  133:istore_1        
	//*  73  134:goto            112
	//   74  137:return          
	}

	void doStart()
	{
		if(DEBUG)
	//*   0    0:getstatic       #82  <Field boolean DEBUG>
	//*   1    3:ifeq            37
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #84  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #85  <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("Starting in ");
	//    6   14:aload_2         
	//    7   15:ldc1            #184 <String "Starting in ">
	//    8   17:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (this)));
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   27:ldc1            #14  <String "LoaderManager">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #109 <Method int Log.v(String, String)>
	//   18   36:pop             
		}
		if(mStarted)
	//*  19   37:aload_0         
	//*  20   38:getfield        #45  <Field boolean mStarted>
	//*  21   41:ifeq            92
		{
			RuntimeException runtimeexception = new RuntimeException("here");
	//   22   44:new             #165 <Class RuntimeException>
	//   23   47:dup             
	//   24   48:ldc1            #167 <String "here">
	//   25   50:invokespecial   #168 <Method void RuntimeException(String)>
	//   26   53:astore_2        
			runtimeexception.fillInStackTrace();
	//   27   54:aload_2         
	//   28   55:invokevirtual   #172 <Method Throwable RuntimeException.fillInStackTrace()>
	//   29   58:pop             
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   59:new             #84  <Class StringBuilder>
	//   31   62:dup             
	//   32   63:invokespecial   #85  <Method void StringBuilder()>
	//   33   66:astore_3        
			stringbuilder1.append("Called doStart when already started: ");
	//   34   67:aload_3         
	//   35   68:ldc1            #186 <String "Called doStart when already started: ">
	//   36   70:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
			stringbuilder1.append(((Object) (this)));
	//   38   74:aload_3         
	//   39   75:aload_0         
	//   40   76:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   41   79:pop             
			Log.w("LoaderManager", stringbuilder1.toString(), ((Throwable) (runtimeexception)));
	//   42   80:ldc1            #14  <String "LoaderManager">
	//   43   82:aload_3         
	//   44   83:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   45   86:aload_2         
	//   46   87:invokestatic    #178 <Method int Log.w(String, String, Throwable)>
	//   47   90:pop             
			return;
	//   48   91:return          
		}
		mStarted = true;
	//   49   92:aload_0         
	//   50   93:iconst_1        
	//   51   94:putfield        #45  <Field boolean mStarted>
		for(int i = mLoaders.b() - 1; i >= 0; i--)
	//*  52   97:aload_0         
	//*  53   98:getfield        #37  <Field n mLoaders>
	//*  54  101:invokevirtual   #147 <Method int n.b()>
	//*  55  104:iconst_1        
	//*  56  105:isub            
	//*  57  106:istore_1        
	//*  58  107:iload_1         
	//*  59  108:iflt            132
			((LoaderInfo)mLoaders.f(i)).start();
	//   60  111:aload_0         
	//   61  112:getfield        #37  <Field n mLoaders>
	//   62  115:iload_1         
	//   63  116:invokevirtual   #117 <Method Object n.f(int)>
	//   64  119:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   65  122:invokevirtual   #189 <Method void LoaderManagerImpl$LoaderInfo.start()>

	//   66  125:iload_1         
	//   67  126:iconst_1        
	//   68  127:isub            
	//   69  128:istore_1        
	//*  70  129:goto            107
	//   71  132:return          
	}

	void doStop()
	{
		if(DEBUG)
	//*   0    0:getstatic       #82  <Field boolean DEBUG>
	//*   1    3:ifeq            37
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #84  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #85  <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("Stopping in ");
	//    6   14:aload_2         
	//    7   15:ldc1            #192 <String "Stopping in ">
	//    8   17:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (this)));
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   14   27:ldc1            #14  <String "LoaderManager">
	//   15   29:aload_2         
	//   16   30:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #109 <Method int Log.v(String, String)>
	//   18   36:pop             
		}
		if(!mStarted)
	//*  19   37:aload_0         
	//*  20   38:getfield        #45  <Field boolean mStarted>
	//*  21   41:ifne            92
		{
			RuntimeException runtimeexception = new RuntimeException("here");
	//   22   44:new             #165 <Class RuntimeException>
	//   23   47:dup             
	//   24   48:ldc1            #167 <String "here">
	//   25   50:invokespecial   #168 <Method void RuntimeException(String)>
	//   26   53:astore_2        
			runtimeexception.fillInStackTrace();
	//   27   54:aload_2         
	//   28   55:invokevirtual   #172 <Method Throwable RuntimeException.fillInStackTrace()>
	//   29   58:pop             
			StringBuilder stringbuilder1 = new StringBuilder();
	//   30   59:new             #84  <Class StringBuilder>
	//   31   62:dup             
	//   32   63:invokespecial   #85  <Method void StringBuilder()>
	//   33   66:astore_3        
			stringbuilder1.append("Called doStop when not started: ");
	//   34   67:aload_3         
	//   35   68:ldc1            #194 <String "Called doStop when not started: ">
	//   36   70:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
			stringbuilder1.append(((Object) (this)));
	//   38   74:aload_3         
	//   39   75:aload_0         
	//   40   76:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   41   79:pop             
			Log.w("LoaderManager", stringbuilder1.toString(), ((Throwable) (runtimeexception)));
	//   42   80:ldc1            #14  <String "LoaderManager">
	//   43   82:aload_3         
	//   44   83:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   45   86:aload_2         
	//   46   87:invokestatic    #178 <Method int Log.w(String, String, Throwable)>
	//   47   90:pop             
			return;
	//   48   91:return          
		}
		for(int i = mLoaders.b() - 1; i >= 0; i--)
	//*  49   92:aload_0         
	//*  50   93:getfield        #37  <Field n mLoaders>
	//*  51   96:invokevirtual   #147 <Method int n.b()>
	//*  52   99:iconst_1        
	//*  53  100:isub            
	//*  54  101:istore_1        
	//*  55  102:iload_1         
	//*  56  103:iflt            127
			((LoaderInfo)mLoaders.f(i)).stop();
	//   57  106:aload_0         
	//   58  107:getfield        #37  <Field n mLoaders>
	//   59  110:iload_1         
	//   60  111:invokevirtual   #117 <Method Object n.f(int)>
	//   61  114:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   62  117:invokevirtual   #197 <Method void LoaderManagerImpl$LoaderInfo.stop()>

	//   63  120:iload_1         
	//   64  121:iconst_1        
	//   65  122:isub            
	//   66  123:istore_1        
	//*  67  124:goto            102
		mStarted = false;
	//   68  127:aload_0         
	//   69  128:iconst_0        
	//   70  129:putfield        #45  <Field boolean mStarted>
	//   71  132:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		int i = mLoaders.b();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field n mLoaders>
	//    2    4:invokevirtual   #147 <Method int n.b()>
	//    3    7:istore          5
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore          6
		if(i > 0)
	//*   6   12:iload           5
	//*   7   14:ifle            147
		{
			printwriter.print(s);
	//    8   17:aload_3         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #204 <Method void PrintWriter.print(String)>
			printwriter.println("Active Loaders:");
	//   11   22:aload_3         
	//   12   23:ldc1            #206 <String "Active Loaders:">
	//   13   25:invokevirtual   #209 <Method void PrintWriter.println(String)>
			Object obj = ((Object) (new StringBuilder()));
	//   14   28:new             #84  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #85  <Method void StringBuilder()>
	//   17   35:astore          7
			((StringBuilder) (obj)).append(s);
	//   18   37:aload           7
	//   19   39:aload_1         
	//   20   40:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			((StringBuilder) (obj)).append("    ");
	//   22   44:aload           7
	//   23   46:ldc1            #211 <String "    ">
	//   24   48:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   26   52:aload           7
	//   27   54:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   28   57:astore          7
			for(int j = 0; j < mLoaders.b(); j++)
	//*  29   59:iconst_0        
	//*  30   60:istore          5
	//*  31   62:iload           5
	//*  32   64:aload_0         
	//*  33   65:getfield        #37  <Field n mLoaders>
	//*  34   68:invokevirtual   #147 <Method int n.b()>
	//*  35   71:icmpge          147
			{
				LoaderInfo loaderinfo = (LoaderInfo)mLoaders.f(j);
	//   36   74:aload_0         
	//   37   75:getfield        #37  <Field n mLoaders>
	//   38   78:iload           5
	//   39   80:invokevirtual   #117 <Method Object n.f(int)>
	//   40   83:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   41   86:astore          8
				printwriter.print(s);
	//   42   88:aload_3         
	//   43   89:aload_1         
	//   44   90:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//   45   93:aload_3         
	//   46   94:ldc1            #213 <String "  #">
	//   47   96:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.print(mLoaders.e(j));
	//   48   99:aload_3         
	//   49  100:aload_0         
	//   50  101:getfield        #37  <Field n mLoaders>
	//   51  104:iload           5
	//   52  106:invokevirtual   #216 <Method int n.e(int)>
	//   53  109:invokevirtual   #218 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//   54  112:aload_3         
	//   55  113:ldc1            #220 <String ": ">
	//   56  115:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.println(loaderinfo.toString());
	//   57  118:aload_3         
	//   58  119:aload           8
	//   59  121:invokevirtual   #221 <Method String LoaderManagerImpl$LoaderInfo.toString()>
	//   60  124:invokevirtual   #209 <Method void PrintWriter.println(String)>
				loaderinfo.dump(((String) (obj)), filedescriptor, printwriter, as);
	//   61  127:aload           8
	//   62  129:aload           7
	//   63  131:aload_2         
	//   64  132:aload_3         
	//   65  133:aload           4
	//   66  135:invokevirtual   #223 <Method void LoaderManagerImpl$LoaderInfo.dump(String, FileDescriptor, PrintWriter, String[])>
			}

	//   67  138:iload           5
	//   68  140:iconst_1        
	//   69  141:iadd            
	//   70  142:istore          5
		}
	//*  71  144:goto            62
		if(mInactiveLoaders.b() > 0)
	//*  72  147:aload_0         
	//*  73  148:getfield        #39  <Field n mInactiveLoaders>
	//*  74  151:invokevirtual   #147 <Method int n.b()>
	//*  75  154:ifle            288
		{
			printwriter.print(s);
	//   76  157:aload_3         
	//   77  158:aload_1         
	//   78  159:invokevirtual   #204 <Method void PrintWriter.print(String)>
			printwriter.println("Inactive Loaders:");
	//   79  162:aload_3         
	//   80  163:ldc1            #225 <String "Inactive Loaders:">
	//   81  165:invokevirtual   #209 <Method void PrintWriter.println(String)>
			Object obj1 = ((Object) (new StringBuilder()));
	//   82  168:new             #84  <Class StringBuilder>
	//   83  171:dup             
	//   84  172:invokespecial   #85  <Method void StringBuilder()>
	//   85  175:astore          7
			((StringBuilder) (obj1)).append(s);
	//   86  177:aload           7
	//   87  179:aload_1         
	//   88  180:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   89  183:pop             
			((StringBuilder) (obj1)).append("    ");
	//   90  184:aload           7
	//   91  186:ldc1            #211 <String "    ">
	//   92  188:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   93  191:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   94  192:aload           7
	//   95  194:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   96  197:astore          7
			for(int k = ((int) (flag)); k < mInactiveLoaders.b(); k++)
	//*  97  199:iload           6
	//*  98  201:istore          5
	//*  99  203:iload           5
	//* 100  205:aload_0         
	//* 101  206:getfield        #39  <Field n mInactiveLoaders>
	//* 102  209:invokevirtual   #147 <Method int n.b()>
	//* 103  212:icmpge          288
			{
				LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.f(k);
	//  104  215:aload_0         
	//  105  216:getfield        #39  <Field n mInactiveLoaders>
	//  106  219:iload           5
	//  107  221:invokevirtual   #117 <Method Object n.f(int)>
	//  108  224:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//  109  227:astore          8
				printwriter.print(s);
	//  110  229:aload_3         
	//  111  230:aload_1         
	//  112  231:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//  113  234:aload_3         
	//  114  235:ldc1            #213 <String "  #">
	//  115  237:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.print(mInactiveLoaders.e(k));
	//  116  240:aload_3         
	//  117  241:aload_0         
	//  118  242:getfield        #39  <Field n mInactiveLoaders>
	//  119  245:iload           5
	//  120  247:invokevirtual   #216 <Method int n.e(int)>
	//  121  250:invokevirtual   #218 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  122  253:aload_3         
	//  123  254:ldc1            #220 <String ": ">
	//  124  256:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.println(loaderinfo1.toString());
	//  125  259:aload_3         
	//  126  260:aload           8
	//  127  262:invokevirtual   #221 <Method String LoaderManagerImpl$LoaderInfo.toString()>
	//  128  265:invokevirtual   #209 <Method void PrintWriter.println(String)>
				loaderinfo1.dump(((String) (obj1)), filedescriptor, printwriter, as);
	//  129  268:aload           8
	//  130  270:aload           7
	//  131  272:aload_2         
	//  132  273:aload_3         
	//  133  274:aload           4
	//  134  276:invokevirtual   #223 <Method void LoaderManagerImpl$LoaderInfo.dump(String, FileDescriptor, PrintWriter, String[])>
			}

	//  135  279:iload           5
	//  136  281:iconst_1        
	//  137  282:iadd            
	//  138  283:istore          5
		}
	//* 139  285:goto            203
	//  140  288:return          
	}

	void finishRetain()
	{
		if(mRetaining)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field boolean mRetaining>
	//*   2    4:ifeq            84
		{
			if(DEBUG)
	//*   3    7:getstatic       #82  <Field boolean DEBUG>
	//*   4   10:ifeq            44
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    5   13:new             #84  <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #85  <Method void StringBuilder()>
	//    8   20:astore_2        
				stringbuilder.append("Finished Retaining in ");
	//    9   21:aload_2         
	//   10   22:ldc1            #228 <String "Finished Retaining in ">
	//   11   24:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
				stringbuilder.append(((Object) (this)));
	//   13   28:aload_2         
	//   14   29:aload_0         
	//   15   30:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   16   33:pop             
				Log.v("LoaderManager", stringbuilder.toString());
	//   17   34:ldc1            #14  <String "LoaderManager">
	//   18   36:aload_2         
	//   19   37:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   20   40:invokestatic    #109 <Method int Log.v(String, String)>
	//   21   43:pop             
			}
			mRetaining = false;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #141 <Field boolean mRetaining>
			for(int i = mLoaders.b() - 1; i >= 0; i--)
	//*  25   49:aload_0         
	//*  26   50:getfield        #37  <Field n mLoaders>
	//*  27   53:invokevirtual   #147 <Method int n.b()>
	//*  28   56:iconst_1        
	//*  29   57:isub            
	//*  30   58:istore_1        
	//*  31   59:iload_1         
	//*  32   60:iflt            84
				((LoaderInfo)mLoaders.f(i)).finishRetain();
	//   33   63:aload_0         
	//   34   64:getfield        #37  <Field n mLoaders>
	//   35   67:iload_1         
	//   36   68:invokevirtual   #117 <Method Object n.f(int)>
	//   37   71:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   38   74:invokevirtual   #230 <Method void LoaderManagerImpl$LoaderInfo.finishRetain()>

	//   39   77:iload_1         
	//   40   78:iconst_1        
	//   41   79:isub            
	//   42   80:istore_1        
		}
	//*  43   81:goto            59
	//   44   84:return          
	}

	public b getLoader(int i)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #75  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #77  <String "Called while creating a loader">
	//    6   13:invokespecial   #80  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		LoaderInfo loaderinfo = (LoaderInfo)mLoaders.a(i);
	//    8   17:aload_0         
	//    9   18:getfield        #37  <Field n mLoaders>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #235 <Method Object n.a(int)>
	//   12   25:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   13   28:astore_2        
		if(loaderinfo != null)
	//*  14   29:aload_2         
	//*  15   30:ifnull          53
		{
			if(loaderinfo.mPendingLoader != null)
	//*  16   33:aload_2         
	//*  17   34:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//*  18   37:ifnull          48
				return loaderinfo.mPendingLoader.mLoader;
	//   19   40:aload_2         
	//   20   41:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//   21   44:getfield        #71  <Field b LoaderManagerImpl$LoaderInfo.mLoader>
	//   22   47:areturn         
			else
				return loaderinfo.mLoader;
	//   23   48:aload_2         
	//   24   49:getfield        #71  <Field b LoaderManagerImpl$LoaderInfo.mLoader>
	//   25   52:areturn         
		} else
		{
			return null;
	//   26   53:aconst_null     
	//   27   54:areturn         
		}
	}

	public boolean hasRunningLoaders()
	{
		int j = mLoaders.b();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field n mLoaders>
	//    2    4:invokevirtual   #147 <Method int n.b()>
	//    3    7:istore_3        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		boolean flag1 = false;
	//    6   10:iconst_0        
	//    7   11:istore          4
		for(; i < j; i++)
	//*   8   13:iload_1         
	//*   9   14:iload_3         
	//*  10   15:icmpge          67
		{
			LoaderInfo loaderinfo = (LoaderInfo)mLoaders.f(i);
	//   11   18:aload_0         
	//   12   19:getfield        #37  <Field n mLoaders>
	//   13   22:iload_1         
	//   14   23:invokevirtual   #117 <Method Object n.f(int)>
	//   15   26:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   16   29:astore          5
			boolean flag;
			if(loaderinfo.mStarted && !loaderinfo.mDeliveredData)
	//*  17   31:aload           5
	//*  18   33:getfield        #241 <Field boolean LoaderManagerImpl$LoaderInfo.mStarted>
	//*  19   36:ifeq            52
	//*  20   39:aload           5
	//*  21   41:getfield        #244 <Field boolean LoaderManagerImpl$LoaderInfo.mDeliveredData>
	//*  22   44:ifne            52
				flag = true;
	//   23   47:iconst_1        
	//   24   48:istore_2        
			else
	//*  25   49:goto            54
				flag = false;
	//   26   52:iconst_0        
	//   27   53:istore_2        
			flag1 |= flag;
	//   28   54:iload           4
	//   29   56:iload_2         
	//   30   57:ior             
	//   31   58:istore          4
		}

	//   32   60:iload_1         
	//   33   61:iconst_1        
	//   34   62:iadd            
	//   35   63:istore_1        
	//*  36   64:goto            13
		return flag1;
	//   37   67:iload           4
	//   38   69:ireturn         
	}

	public b initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #75  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #77  <String "Called while creating a loader">
	//    6   13:invokespecial   #80  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		LoaderInfo loaderinfo = (LoaderInfo)mLoaders.a(i);
	//    8   17:aload_0         
	//    9   18:getfield        #37  <Field n mLoaders>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #235 <Method Object n.a(int)>
	//   12   25:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   13   28:astore          4
		if(DEBUG)
	//*  14   30:getstatic       #82  <Field boolean DEBUG>
	//*  15   33:ifeq            86
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   36:new             #84  <Class StringBuilder>
	//   17   39:dup             
	//   18   40:invokespecial   #85  <Method void StringBuilder()>
	//   19   43:astore          5
			stringbuilder.append("initLoader in ");
	//   20   45:aload           5
	//   21   47:ldc1            #248 <String "initLoader in ">
	//   22   49:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
			stringbuilder.append(((Object) (this)));
	//   24   53:aload           5
	//   25   55:aload_0         
	//   26   56:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   27   59:pop             
			stringbuilder.append(": args=");
	//   28   60:aload           5
	//   29   62:ldc1            #250 <String ": args=">
	//   30   64:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   31   67:pop             
			stringbuilder.append(((Object) (bundle)));
	//   32   68:aload           5
	//   33   70:aload_2         
	//   34   71:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   35   74:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   36   75:ldc1            #14  <String "LoaderManager">
	//   37   77:aload           5
	//   38   79:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   39   82:invokestatic    #109 <Method int Log.v(String, String)>
	//   40   85:pop             
		}
		if(loaderinfo == null)
	//*  41   86:aload           4
	//*  42   88:ifnonnull       143
		{
			loadercallbacks = ((LoaderManager.LoaderCallbacks) (createAndInstallLoader(i, bundle, loadercallbacks)));
	//   43   91:aload_0         
	//   44   92:iload_1         
	//   45   93:aload_2         
	//   46   94:aload_3         
	//   47   95:invokespecial   #252 <Method LoaderManagerImpl$LoaderInfo createAndInstallLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
	//   48   98:astore_3        
			bundle = ((Bundle) (loadercallbacks));
	//   49   99:aload_3         
	//   50  100:astore_2        
			if(DEBUG)
	//*  51  101:getstatic       #82  <Field boolean DEBUG>
	//*  52  104:ifeq            191
			{
				bundle = ((Bundle) (new StringBuilder()));
	//   53  107:new             #84  <Class StringBuilder>
	//   54  110:dup             
	//   55  111:invokespecial   #85  <Method void StringBuilder()>
	//   56  114:astore_2        
				((StringBuilder) (bundle)).append("  Created new loader ");
	//   57  115:aload_2         
	//   58  116:ldc1            #254 <String "  Created new loader ">
	//   59  118:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   60  121:pop             
				((StringBuilder) (bundle)).append(((Object) (loadercallbacks)));
	//   61  122:aload_2         
	//   62  123:aload_3         
	//   63  124:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   64  127:pop             
				Log.v("LoaderManager", ((StringBuilder) (bundle)).toString());
	//   65  128:ldc1            #14  <String "LoaderManager">
	//   66  130:aload_2         
	//   67  131:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   68  134:invokestatic    #109 <Method int Log.v(String, String)>
	//   69  137:pop             
				bundle = ((Bundle) (loadercallbacks));
	//   70  138:aload_3         
	//   71  139:astore_2        
			}
		} else
	//*  72  140:goto            191
		{
			if(DEBUG)
	//*  73  143:getstatic       #82  <Field boolean DEBUG>
	//*  74  146:ifeq            182
			{
				bundle = ((Bundle) (new StringBuilder()));
	//   75  149:new             #84  <Class StringBuilder>
	//   76  152:dup             
	//   77  153:invokespecial   #85  <Method void StringBuilder()>
	//   78  156:astore_2        
				((StringBuilder) (bundle)).append("  Re-using existing loader ");
	//   79  157:aload_2         
	//   80  158:ldc2            #256 <String "  Re-using existing loader ">
	//   81  161:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   82  164:pop             
				((StringBuilder) (bundle)).append(((Object) (loaderinfo)));
	//   83  165:aload_2         
	//   84  166:aload           4
	//   85  168:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   86  171:pop             
				Log.v("LoaderManager", ((StringBuilder) (bundle)).toString());
	//   87  172:ldc1            #14  <String "LoaderManager">
	//   88  174:aload_2         
	//   89  175:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   90  178:invokestatic    #109 <Method int Log.v(String, String)>
	//   91  181:pop             
			}
			loaderinfo.mCallbacks = loadercallbacks;
	//   92  182:aload           4
	//   93  184:aload_3         
	//   94  185:putfield        #260 <Field LoaderManager$LoaderCallbacks LoaderManagerImpl$LoaderInfo.mCallbacks>
			bundle = ((Bundle) (loaderinfo));
	//   95  188:aload           4
	//   96  190:astore_2        
		}
		if(((LoaderInfo) (bundle)).mHaveData && mStarted)
	//*  97  191:aload_2         
	//*  98  192:getfield        #263 <Field boolean LoaderManagerImpl$LoaderInfo.mHaveData>
	//*  99  195:ifeq            217
	//* 100  198:aload_0         
	//* 101  199:getfield        #45  <Field boolean mStarted>
	//* 102  202:ifeq            217
			((LoaderInfo) (bundle)).callOnLoadFinished(((LoaderInfo) (bundle)).mLoader, ((LoaderInfo) (bundle)).mData);
	//  103  205:aload_2         
	//  104  206:aload_2         
	//  105  207:getfield        #71  <Field b LoaderManagerImpl$LoaderInfo.mLoader>
	//  106  210:aload_2         
	//  107  211:getfield        #267 <Field Object LoaderManagerImpl$LoaderInfo.mData>
	//  108  214:invokevirtual   #271 <Method void LoaderManagerImpl$LoaderInfo.callOnLoadFinished(b, Object)>
		return ((LoaderInfo) (bundle)).mLoader;
	//  109  217:aload_2         
	//  110  218:getfield        #71  <Field b LoaderManagerImpl$LoaderInfo.mLoader>
	//  111  221:areturn         
	}

	void installLoader(LoaderInfo loaderinfo)
	{
		mLoaders.b(loaderinfo.mId, ((Object) (loaderinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field n mLoaders>
	//    2    4:aload_1         
	//    3    5:getfield        #276 <Field int LoaderManagerImpl$LoaderInfo.mId>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #279 <Method void n.b(int, Object)>
		if(mStarted)
	//*   6   12:aload_0         
	//*   7   13:getfield        #45  <Field boolean mStarted>
	//*   8   16:ifeq            23
			loaderinfo.start();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #189 <Method void LoaderManagerImpl$LoaderInfo.start()>
	//   11   23:return          
	}

	public b restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		LoaderInfo loaderinfo;
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #75  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #77  <String "Called while creating a loader">
	//    6   13:invokespecial   #80  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		loaderinfo = (LoaderInfo)mLoaders.a(i);
	//    8   17:aload_0         
	//    9   18:getfield        #37  <Field n mLoaders>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #235 <Method Object n.a(int)>
	//   12   25:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   13   28:astore          4
		if(DEBUG)
	//*  14   30:getstatic       #82  <Field boolean DEBUG>
	//*  15   33:ifeq            87
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   36:new             #84  <Class StringBuilder>
	//   17   39:dup             
	//   18   40:invokespecial   #85  <Method void StringBuilder()>
	//   19   43:astore          5
			stringbuilder.append("restartLoader in ");
	//   20   45:aload           5
	//   21   47:ldc2            #282 <String "restartLoader in ">
	//   22   50:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   23   53:pop             
			stringbuilder.append(((Object) (this)));
	//   24   54:aload           5
	//   25   56:aload_0         
	//   26   57:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   27   60:pop             
			stringbuilder.append(": args=");
	//   28   61:aload           5
	//   29   63:ldc1            #250 <String ": args=">
	//   30   65:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   31   68:pop             
			stringbuilder.append(((Object) (bundle)));
	//   32   69:aload           5
	//   33   71:aload_2         
	//   34   72:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   35   75:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   36   76:ldc1            #14  <String "LoaderManager">
	//   37   78:aload           5
	//   38   80:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   39   83:invokestatic    #109 <Method int Log.v(String, String)>
	//   40   86:pop             
		}
		if(loaderinfo == null) goto _L2; else goto _L1
	//   41   87:aload           4
	//   42   89:ifnull          397
_L1:
		LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.a(i);
	//   43   92:aload_0         
	//   44   93:getfield        #39  <Field n mInactiveLoaders>
	//   45   96:iload_1         
	//   46   97:invokevirtual   #235 <Method Object n.a(int)>
	//   47  100:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   48  103:astore          5
		if(loaderinfo1 == null) goto _L4; else goto _L3
	//   49  105:aload           5
	//   50  107:ifnull          336
_L3:
		if(!loaderinfo.mHaveData) goto _L6; else goto _L5
	//   51  110:aload           4
	//   52  112:getfield        #263 <Field boolean LoaderManagerImpl$LoaderInfo.mHaveData>
	//   53  115:ifeq            175
_L5:
		if(DEBUG)
	//*  54  118:getstatic       #82  <Field boolean DEBUG>
	//*  55  121:ifeq            161
		{
			StringBuilder stringbuilder3 = new StringBuilder();
	//   56  124:new             #84  <Class StringBuilder>
	//   57  127:dup             
	//   58  128:invokespecial   #85  <Method void StringBuilder()>
	//   59  131:astore          6
			stringbuilder3.append("  Removing last inactive loader: ");
	//   60  133:aload           6
	//   61  135:ldc2            #284 <String "  Removing last inactive loader: ">
	//   62  138:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   63  141:pop             
			stringbuilder3.append(((Object) (loaderinfo)));
	//   64  142:aload           6
	//   65  144:aload           4
	//   66  146:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   67  149:pop             
			Log.v("LoaderManager", stringbuilder3.toString());
	//   68  150:ldc1            #14  <String "LoaderManager">
	//   69  152:aload           6
	//   70  154:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   71  157:invokestatic    #109 <Method int Log.v(String, String)>
	//   72  160:pop             
		}
		loaderinfo1.mDeliveredData = false;
	//   73  161:aload           5
	//   74  163:iconst_0        
	//   75  164:putfield        #244 <Field boolean LoaderManagerImpl$LoaderInfo.mDeliveredData>
		loaderinfo1.destroy();
	//   76  167:aload           5
	//   77  169:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
		  goto _L7
	//*  78  172:goto            379
_L6:
		if(loaderinfo.cancel()) goto _L9; else goto _L8
	//   79  175:aload           4
	//   80  177:invokevirtual   #287 <Method boolean LoaderManagerImpl$LoaderInfo.cancel()>
	//   81  180:ifne            215
_L8:
		if(DEBUG)
	//*  82  183:getstatic       #82  <Field boolean DEBUG>
	//*  83  186:ifeq            198
			Log.v("LoaderManager", "  Current loader is stopped; replacing");
	//   84  189:ldc1            #14  <String "LoaderManager">
	//   85  191:ldc2            #289 <String "  Current loader is stopped; replacing">
	//   86  194:invokestatic    #109 <Method int Log.v(String, String)>
	//   87  197:pop             
		mLoaders.b(i, ((Object) (null)));
	//   88  198:aload_0         
	//   89  199:getfield        #37  <Field n mLoaders>
	//   90  202:iload_1         
	//   91  203:aconst_null     
	//   92  204:invokevirtual   #279 <Method void n.b(int, Object)>
		loaderinfo.destroy();
	//   93  207:aload           4
	//   94  209:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
		  goto _L2
	//*  95  212:goto            397
_L9:
		if(DEBUG)
	//*  96  215:getstatic       #82  <Field boolean DEBUG>
	//*  97  218:ifeq            230
			Log.v("LoaderManager", "  Current loader is running; configuring pending loader");
	//   98  221:ldc1            #14  <String "LoaderManager">
	//   99  223:ldc2            #291 <String "  Current loader is running; configuring pending loader">
	//  100  226:invokestatic    #109 <Method int Log.v(String, String)>
	//  101  229:pop             
		if(loaderinfo.mPendingLoader != null)
	//* 102  230:aload           4
	//* 103  232:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//* 104  235:ifnull          298
		{
			if(DEBUG)
	//* 105  238:getstatic       #82  <Field boolean DEBUG>
	//* 106  241:ifeq            284
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//  107  244:new             #84  <Class StringBuilder>
	//  108  247:dup             
	//  109  248:invokespecial   #85  <Method void StringBuilder()>
	//  110  251:astore          5
				stringbuilder1.append("  Removing pending loader: ");
	//  111  253:aload           5
	//  112  255:ldc2            #293 <String "  Removing pending loader: ">
	//  113  258:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  114  261:pop             
				stringbuilder1.append(((Object) (loaderinfo.mPendingLoader)));
	//  115  262:aload           5
	//  116  264:aload           4
	//  117  266:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//  118  269:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//  119  272:pop             
				Log.v("LoaderManager", stringbuilder1.toString());
	//  120  273:ldc1            #14  <String "LoaderManager">
	//  121  275:aload           5
	//  122  277:invokevirtual   #103 <Method String StringBuilder.toString()>
	//  123  280:invokestatic    #109 <Method int Log.v(String, String)>
	//  124  283:pop             
			}
			loaderinfo.mPendingLoader.destroy();
	//  125  284:aload           4
	//  126  286:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//  127  289:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
			loaderinfo.mPendingLoader = null;
	//  128  292:aload           4
	//  129  294:aconst_null     
	//  130  295:putfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
		}
		if(DEBUG)
	//* 131  298:getstatic       #82  <Field boolean DEBUG>
	//* 132  301:ifeq            313
			Log.v("LoaderManager", "  Enqueuing as new pending loader");
	//  133  304:ldc1            #14  <String "LoaderManager">
	//  134  306:ldc2            #295 <String "  Enqueuing as new pending loader">
	//  135  309:invokestatic    #109 <Method int Log.v(String, String)>
	//  136  312:pop             
		loaderinfo.mPendingLoader = createLoader(i, bundle, loadercallbacks);
	//  137  313:aload           4
	//  138  315:aload_0         
	//  139  316:iload_1         
	//  140  317:aload_2         
	//  141  318:aload_3         
	//  142  319:invokespecial   #52  <Method LoaderManagerImpl$LoaderInfo createLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
	//  143  322:putfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
		bundle = ((Bundle) (loaderinfo.mPendingLoader));
	//  144  325:aload           4
	//  145  327:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//  146  330:astore_2        
_L11:
		return ((LoaderInfo) (bundle)).mLoader;
	//  147  331:aload_2         
	//  148  332:getfield        #71  <Field b LoaderManagerImpl$LoaderInfo.mLoader>
	//  149  335:areturn         
_L4:
		if(DEBUG)
	//* 150  336:getstatic       #82  <Field boolean DEBUG>
	//* 151  339:ifeq            379
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//  152  342:new             #84  <Class StringBuilder>
	//  153  345:dup             
	//  154  346:invokespecial   #85  <Method void StringBuilder()>
	//  155  349:astore          5
			stringbuilder2.append("  Making last loader inactive: ");
	//  156  351:aload           5
	//  157  353:ldc2            #297 <String "  Making last loader inactive: ">
	//  158  356:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  159  359:pop             
			stringbuilder2.append(((Object) (loaderinfo)));
	//  160  360:aload           5
	//  161  362:aload           4
	//  162  364:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//  163  367:pop             
			Log.v("LoaderManager", stringbuilder2.toString());
	//  164  368:ldc1            #14  <String "LoaderManager">
	//  165  370:aload           5
	//  166  372:invokevirtual   #103 <Method String StringBuilder.toString()>
	//  167  375:invokestatic    #109 <Method int Log.v(String, String)>
	//  168  378:pop             
		}
_L7:
		loaderinfo.mLoader.g();
	//  169  379:aload           4
	//  170  381:getfield        #71  <Field b LoaderManagerImpl$LoaderInfo.mLoader>
	//  171  384:invokevirtual   #301 <Method void b.g()>
		mInactiveLoaders.b(i, ((Object) (loaderinfo)));
	//  172  387:aload_0         
	//  173  388:getfield        #39  <Field n mInactiveLoaders>
	//  174  391:iload_1         
	//  175  392:aload           4
	//  176  394:invokevirtual   #279 <Method void n.b(int, Object)>
_L2:
		bundle = ((Bundle) (createAndInstallLoader(i, bundle, loadercallbacks)));
	//  177  397:aload_0         
	//  178  398:iload_1         
	//  179  399:aload_2         
	//  180  400:aload_3         
	//  181  401:invokespecial   #252 <Method LoaderManagerImpl$LoaderInfo createAndInstallLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
	//  182  404:astore_2        
		if(true) goto _L11; else goto _L10
	//  183  405:goto            331
_L10:
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #84  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #303 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("LoaderManager{");
	//    5   11:aload_1         
	//    6   12:ldc2            #305 <String "LoaderManager{">
	//    7   15:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #311 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #317 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(" in ");
	//   15   31:aload_1         
	//   16   32:ldc2            #319 <String " in ">
	//   17   35:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		d.a(((Object) (mHost)), stringbuilder);
	//   19   39:aload_0         
	//   20   40:getfield        #43  <Field FragmentHostCallback mHost>
	//   21   43:aload_1         
	//   22   44:invokestatic    #324 <Method void d.a(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   23   47:aload_1         
	//   24   48:ldc2            #326 <String "}}">
	//   25   51:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
		return stringbuilder.toString();
	//   27   55:aload_1         
	//   28   56:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   29   59:areturn         
	}

	void updateHostController(FragmentHostCallback fragmenthostcallback)
	{
		mHost = fragmenthostcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field FragmentHostCallback mHost>
	//    3    5:return          
	}

	static boolean DEBUG = false;
	static final String TAG = "LoaderManager";
	boolean mCreatingLoader;
	FragmentHostCallback mHost;
	final n mInactiveLoaders = new n();
	final n mLoaders = new n();
	boolean mRetaining;
	boolean mRetainingStarted;
	boolean mStarted;
	final String mWho;

	static 
	{
	//    0    0:return          
	}
}
